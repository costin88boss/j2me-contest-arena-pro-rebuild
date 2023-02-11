package com.elkware.midp.games;
//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import javax.microedition.io.Connector;
import javax.microedition.io.HttpConnection;
import javax.microedition.lcdui.Alert;
import javax.microedition.lcdui.AlertType;
import javax.microedition.lcdui.Command;
import javax.microedition.lcdui.Display;
import javax.microedition.lcdui.Displayable;
import javax.microedition.lcdui.Form;
import javax.microedition.lcdui.Image;
import javax.microedition.midlet.MIDlet;

public abstract class b extends MIDlet {
    private int L = -1577856450;
    private int M = 0;
    public String N = null;
    private String O = null;

    public b() {
    }

    public final boolean n() {
        return true;
    }

    public boolean o() {
        return true;
    }

    public boolean p() {
        return true;
    }

    public byte[] i(String var1) {
        char[] var2 = var1.toCharArray();
        byte[] var3 = new byte[var2.length * 2];

        for(int var4 = 0; var4 < var2.length; ++var4) {
            var3[var4 * 2 + 0] = (byte)(var2[var4] >> 8 & 255);
            var3[var4 * 2 + 1] = (byte)(var2[var4] & 255);
        }

        return var3;
    }

    public String b(byte[] var1) {
        StringBuffer var2 = new StringBuffer();

        for(int var3 = 0; var3 < var1.length; ++var3) {
            var2.append(Integer.toHexString((var1[var3] & 240) >> 4));
            var2.append(Integer.toHexString(var1[var3] & 15));
        }

        return var2.toString();
    }

    private final String j(String var1) throws IOException {
        System.out.println(var1);
        InputStream var2 = null;
        HttpConnection var3 = (HttpConnection)Connector.open(var1);
        var2 = var3.openInputStream();
        String var4 = var3.getType();
        int var6 = (int)var3.getLength();
        String var5;
        int var8;
        if (var6 > 0) {
            byte[] var7 = new byte[var6];
            var8 = var2.read(var7);
            var5 = new String(var7, 0, var8);
        } else {
            ByteArrayOutputStream var9 = new ByteArrayOutputStream();

            while((var8 = var2.read()) != -1) {
                var9.write(var8);
            }

            var5 = new String(var9.toByteArray());
        }

        var2.close();
        var3.close();
        return var5;
    }

    private int a(byte[] var1, int var2) {
        return (var1[var2] & 255) << 24 | (var1[var2 + 1] & 255) << 16 | (var1[var2 + 2] & 255) << 8 | var1[var2 + 3] & 255;
    }

    private String a(byte[] var1, int var2, int var3) {
        String var4 = "";

        for(int var5 = 0; var5 < var3; ++var5) {
            if (var1[var5 * 2 + var2 + 1] != 0) {
                var4 = var4 + (char)(((var1[var5 * 2 + var2] & 255) << 8) + (var1[var5 * 2 + var2 + 1] & 255));
            }
        }

        return var4;
    }

    private byte[] k(String var1) {
        byte[] var2 = var1.getBytes();
        byte[] var3 = new byte[var2.length / 2];

        for(int var7 = 0; var7 < var3.length; ++var7) {
            int var6 = var7 * 2;
            int var4 = var2[var6] - 48;
            if (var4 > 9) {
                var4 = var2[var6] - 55;
            }

            int var5 = var2[var6 + 1] - 48;
            if (var5 > 9) {
                var5 = var2[var6 + 1] - 55;
            }

            var3[var7] = (byte)(var4 << 4 | var5);
        }

        return var3;
    }

    public int i(int var1) {
        this.j(var1);
        return 3;
    }

    public abstract void h(int var1);

    public boolean j(int var1) {
        if (this.g(var1)) {
            this.h(var1);
        }

        if (this.p() && !this.a((Alert)null)) {
            return false;
        } else {
            this.q();
            this.a(var1, this.k());
            boolean var2;
            if (this.o() && this.m() == 1) {
                if (!this.r()) {
                    return false;
                }

                var2 = this.k(var1);
                String var3 = this.q();
                if (var3 == null) {
                    if (var2) {
                        this.a(true);
                        this.s();
                    } else {
                        var3 = this.a(124);
                    }
                }

                if (var3 != null) {
                    this.e(var3);
                }
            } else {
                var2 = true;
            }

            this.d();
            return var2;
        }
    }

    public final boolean k(int var1) {
        try {
            boolean var2 = true;
            String var3 = System.getProperty("com.siemens.IMEI");
            if (var3 == null) {
                return false;
            } else {
                Form var4 = new Form("Info");
                var4.append(this.a(127));

                do {
                    Display.getDisplay(this).setCurrent(var4);

                    try {
                        Thread.currentThread();
                        Thread.sleep(50L);
                    } catch (Exception var10) {
                    }

                    StringBuffer var5 = new StringBuffer("http://139.23.38.140/hs/");
                    var5.append("user.asp?imei=");
                    var5.append(var3.substring(1));
                    var5.append("&nick=");
                    var5.append(this.b(this.i(this.k())).toUpperCase());
                    var5.append("&appid=");
                    var5.append(this.N);
                    var5.append("&mnc=");
                    var5.append(System.getProperty("com.siemens.MNC"));
                    var5.append("&mcc=");
                    var5.append(System.getProperty("com.siemens.MCC"));
                    String var6 = this.j(var5.toString());
                    if (!var6.startsWith("exists") && !var6.startsWith("registration successful")) {
                        String var12;
                        if (var6.startsWith("alternative nick")) {
                            var12 = var6.substring(17);
                            byte[] var13 = this.k(var12);
                            var12 = this.a(128);
                            this.g(this.a(var13, 0, var13.length / 2));
                        } else {
                            var12 = var6;
                        }

                        var2 = !this.a(new Alert("Nickname", var12, (Image)null, (AlertType)null));
                    } else {
                        var1 ^= this.L;
                        var5 = new StringBuffer("http://139.23.38.140/hs/");
                        var5.append("hs.asp?imei=");
                        var5.append(var3.substring(1));
                        var5.append("&nick=");
                        var5.append(this.b(this.i(this.k())));
                        var5.append("&appid=");
                        var5.append(this.N);
                        var5.append("&hs=");
                        var5.append(this.b(new byte[]{(byte)(var1 >> 24 & 255), (byte)(var1 >> 16 & 255), (byte)(var1 >> 8 & 255), (byte)(var1 & 255)}));
                        var6 = this.j(var5.toString());
                        byte[] var7 = this.k(var6);
                        if (var6.length() <= 0 || var7[0] != 0) {
                            return false;
                        }

                        this.l();
                        this.f(this.a(var7, 1));

                        for(int var8 = 0; var8 < 3; ++var8) {
                            this.a(this.a(var7, 29 + 28 * var8), this.a(var7, 5 + 28 * var8, 12));
                        }

                        var2 = true;
                    }
                } while(!var2);

                return true;
            }
        } catch (Exception var11) {
            var11.printStackTrace();
            Display.getDisplay(this).setCurrent(new Alert("Info", "" + var11, (Image)null, (AlertType)null));

            try {
                Thread.currentThread();
                Thread.sleep(5000L);
            } catch (Exception var9) {
            }

            Display.getDisplay(this).setCurrent((Displayable)null);
            return false;
        }
    }

    public String q() {
        String var1 = this.O;
        this.O = null;
        return var1;
    }

    public void commandAction(Command var1, Displayable var2) {
        if (var1.getCommandType() == 4) {
            this.M = 1;
        } else if (var1.getCommandType() == 2) {
            this.M = 2;
        }

    }

    public boolean r() {
        return true;
    }

    public void s() {
    }

    public abstract String a(int var1);

    public abstract String k();

    public abstract void g(String var1);

    public abstract void f(int var1);

    public abstract void l();

    public abstract boolean a(int var1, String var2);

    public abstract boolean a(Alert var1);

    abstract void e(String var1);

    public abstract boolean g(int var1);

    public abstract void d();

    abstract int m();

    abstract void a(boolean var1);
}
