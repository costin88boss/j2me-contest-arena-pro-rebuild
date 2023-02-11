//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package com.elkware.midp.games;

import java.io.*;
import java.util.Enumeration;
import java.util.Hashtable;
import javax.microedition.lcdui.Alert;
import javax.microedition.lcdui.AlertType;
import javax.microedition.lcdui.Canvas;
import javax.microedition.lcdui.Command;
import javax.microedition.lcdui.CommandListener;
import javax.microedition.lcdui.Display;
import javax.microedition.lcdui.Displayable;
import javax.microedition.lcdui.Form;
import javax.microedition.lcdui.Image;
import javax.microedition.lcdui.TextBox;
import javax.microedition.rms.RecordComparator;
import javax.microedition.rms.RecordEnumeration;
import javax.microedition.rms.RecordFilter;
import javax.microedition.rms.RecordStore;
import javax.microedition.rms.RecordStoreException;

public abstract class a extends b implements CommandListener {
    private final String[] a = new String[]{"RSF6", "RSHS7", "RSAD8"};
    public Display b;
    public boolean c = true;
    public boolean d = true;
    public boolean e = true;
    public boolean f = false;
    boolean g = false;
    private String h = "Afgh6Sg";
    public Command i;
    Hashtable j = new Hashtable();
    Alert k;
    public String[] l = new String[0];
    byte[] m;
    byte[] n;
    static Object o;
    static String p;
    static int q;
    static int r;
    static byte[] s;
    static byte[] t;
    static RecordStore u;
    static boolean v;
    public static long w;
    public String x;
    public int y = 5;
    public int z;
    public long A;
    public String[] B;
    public int[] C;
    public int D;
    public int E;
    public boolean F = true;
    public Command G;
    public Command H;
    public Command I;
    private TextBox J;
    private int K;

    public a() {
    }

    public void a(String var1, String var2) throws IOException {
        DataInputStream var3 = new DataInputStream(this.getClass().getResourceAsStream(var1));
        int var4 = var3.readInt();
        int var5 = 0;
        int var7 = 4;

        int var6;
        String var8;
        do {
            var8 = var3.readUTF();
            var6 = var3.readInt();
            var7 += 4 + var8.length() + 2;
            ++var5;
        } while(var5 < var4 && !var2.startsWith(var8));

        var3.skip((long)(var6 - var7));
        int var9 = var3.readInt();
        int var10 = var3.readInt();
        if (var10 > this.l.length - 1) {
            String[] var12 = this.l;
            this.l = new String[var10 + 1];
            System.arraycopy(var12, 0, this.l, 0, var12.length);
        }

        for(var5 = 0; var5 < var9; ++var5) {
            int var11 = var3.readInt();
            this.l[var11] = var3.readUTF();
        }

    }

    void a() {
        String var1;
        if ((var1 = System.getProperty("microedition.locale")) == null) {
            var1 = "";
        }

        try {
            this.a("/sr_" + var1 + ".ini", var1);
        } catch (Exception var7) {
            try {
                this.a("/sr_en.ini", var1);
            } catch (Exception var6) {
                try {
                    this.a("/sr.ini", var1);
                } catch (Exception var5) {
                    System.out.println("ERROR: loadStrings: " + var5);
                }
            }
        }

    }

    public String a(int var1) {
        if (this.l.length == 0) {
            this.a();
        }

        return this.l[var1];
    }

    public void b(int var1) {
        if (this.m == null) {
            this.m = e(var1);
        }

        if (this.m == null) {
            System.out.println("Parameter file " + var1 + " is missing!");
        }

    }

    public int c(int var1) {
        for(int var2 = 0; var2 < this.m.length; var2 += 4) {
            if (var1 == ((this.m[var2] & 255) << 8) + (this.m[var2 + 1] & 255)) {
                return (short)((this.m[var2 + 2] & 255) << 8) + (this.m[var2 + 3] & 255);
            }
        }

        System.out.println("Parameter " + var1 + " not found!");
        return -1;
    }

    public void startApp() {
        this.a();
        if (this.B == null) {
            this.b();
        }

        this.m = f("/_FF.ini");
        if (this.m != null) {
            v = this.c(5050) == 1;
        }

        b(this, "/res.raw");
        this.b(255);
    }

    public void a(String var1, String var2, boolean var3) {
        if (var2 == null) {
            this.j.remove(var1);
        } else {
            this.j.put(var1, var2);
        }

        if (var3) {
            this.e();
        }

    }

    public String a(String var1) {
        return (String)this.j.get(var1);
    }

    public byte[] b(String var1) {
        try {
            RecordStore var2 = null;
            var2 = RecordStore.openRecordStore(var1, false);
            RecordEnumeration var3 = var2.enumerateRecords((RecordFilter)null, (RecordComparator)null, false);
            if (var3.hasNextElement()) {
                byte[] var4 = var3.nextRecord();
                System.out.println("loadRecordStore " + var1 + ": " + var4.length + " bytes.");
                var2.closeRecordStore();
                this.a(var4);
                return var4;
            }

            var2.closeRecordStore();
        } catch (Exception var5) {
            System.out.println("loadRecordStore: " + var5);
        }

        return null;
    }

    public DataInputStream c(String var1) {
        byte[] var2 = this.b(var1);
        return var2 != null ? new DataInputStream(new ByteArrayInputStream(var2)) : null;
    }

    public void b() {
        this.i();
        this.c();

        try {
            DataInputStream var1 = this.c(this.a(201) + this.a[2]);
            if (var1 != null) {
                int var2 = var1.readInt();

                for(int var3 = 0; var3 < var2; ++var3) {
                    this.j.put(var1.readUTF(), var1.readUTF());
                }
            }
        } catch (Exception var4) {
            System.out.println("Error loading additional data " + var4);
        }

    }

    public void a(String var1, byte[] var2) {
        RecordStore var3 = null;

        try {
            this.a(var2);
            var3 = RecordStore.openRecordStore(var1, true);
            int var4 = -1;
            if (var3.getNumRecords() > 0) {
                RecordEnumeration var5 = var3.enumerateRecords((RecordFilter)null, (RecordComparator)null, false);
                var4 = var5.nextRecordId();
            }

            var3.addRecord(var2, 0, var2.length);
            System.out.println("saveRecordStore " + var1 + ": writing " + var2.length + " bytes.");
            if (var4 != -1) {
                var3.deleteRecord(var4);
                System.out.println("saveRecordStore " + var1 + ": deleted old record " + var4);
            }

            System.out.println("saveRecordStore " + var1 + ": Total size " + var3.getSize() + "/" + var3.getSizeAvailable() + " bytes.");
            var3.closeRecordStore();
            this.g = false;
        } catch (Exception var7) {
            System.out.println("saveRecordStore: " + var7);
            this.g = true;

            try {
                if (var3 != null) {
                    var3.closeRecordStore();
                }
            } catch (RecordStoreException var6) {
            }
        }

    }

    public void c() {
        try {
            DataInputStream var1 = this.c(this.a(201) + this.a[1]);
            if (var1 != null) {
                this.A = (long)(var1.readInt() * 1000);
                this.z = var1.readInt();
                this.E = var1.readInt();
                this.D = var1.readInt();

                for(int var2 = 0; var2 < this.z; ++var2) {
                    this.B[var2] = var1.readUTF();
                    this.C[var2] = var1.readInt();
                }

                this.F = var1.readBoolean();
                this.x = var1.readUTF();
            }
        } catch (Exception var3) {
            System.out.println("Loading highscore failed " + var3);
            this.l();
        }

    }

    public void d() {
        try {
            ByteArrayOutputStream var1 = new ByteArrayOutputStream();
            DataOutputStream var2 = new DataOutputStream(var1);
            var2.writeInt((int)(this.A / 1000L));
            var2.writeInt(this.z);
            var2.writeInt(this.E);
            var2.writeInt(this.D);

            for(int var3 = 0; var3 < this.z; ++var3) {
                var2.writeUTF(this.B[var3]);
                var2.writeInt(this.C[var3]);
            }

            var2.writeBoolean(this.F);
            var2.writeUTF(this.x != null ? this.x : "");
            this.a(this.a(201) + this.a[1], var1.toByteArray());
        } catch (Exception var4) {
            System.out.println("Saving highscore failed " + var4);
        }

    }

    public void e() {
        try {
            ByteArrayOutputStream var1 = new ByteArrayOutputStream();
            DataOutputStream var2 = new DataOutputStream(var1);
            var2.writeInt(this.j.size());
            if (!this.j.isEmpty()) {
                Enumeration var3 = this.j.keys();
                Enumeration var4 = this.j.elements();

                while(var3.hasMoreElements()) {
                    var2.writeUTF((String)var3.nextElement());
                    var2.writeUTF((String)var4.nextElement());
                }
            }

            this.a(this.a(201) + this.a[2], var1.toByteArray());
        } catch (Exception var5) {
            System.out.println("saveFeatureData failed " + var5);
        }

    }

    private final void a(byte[] var1) {
        if (this.h != null) {
            this.n = this.h.getBytes();
            this.h = null;
        }

        for(int var2 = 0; var2 < var1.length; ++var2) {
            var1[var2] = (byte)(var1[var2] ^ this.n[var2 % this.n.length] ^ var2);
        }

    }

    public final void d(String var1) {
        super.N = var1;
    }

    public void e(String var1) {
        this.k = new Alert(this.a(25), var1, (Image)null, (AlertType)null);
        this.k.setTimeout(60000);
        Display.getDisplay(this).setCurrent(this.k);
    }

    public boolean f() {
        String var1 = this.a(98);
        if (var1 == null) {
            return true;
        } else {
            int var2;
            try {
                var2 = Integer.parseInt(var1);
            } catch (NumberFormatException var14) {
                return true;
            }

            long var3 = System.currentTimeMillis();
            long var5 = var3;
            long var7 = 0L;
            DataInputStream var9 = this.c(this.a(201) + "TS");

            try {
                if (var9 != null) {
                    var5 = var9.readLong();
                    var7 = var9.readLong();
                }
            } catch (Exception var13) {
                var5 = var3;
            }

            var7 += Math.max(0L, var3 - var5);
            ByteArrayOutputStream var10 = new ByteArrayOutputStream();

            try {
                DataOutputStream var11 = new DataOutputStream(var10);
                var11.writeLong(var3);
                var11.writeLong(var7);
            } catch (Exception var12) {
            }

            this.a(this.a(201) + "TS", var10.toByteArray());
            return var5 > var3 || var7 > 86400000L * (long)var2;
        }
    }

    public boolean a(Canvas var1) {
        this.b = Display.getDisplay(this);
        String var2 = null;
        if (!this.n()) {
            if ((var2 = this.q()) == null) {
                var2 = this.a(16) + " " + this.a(17);
            }
        } else if (this.f()) {
            var2 = this.a(99);
        } else if (this.g) {
            var2 = this.a(26);
        }

        this.i = new Command(this.a(9), 3, 10);
        if (var2 != null) {
            if (!(this.b.getCurrent() instanceof Form)) {
                Form var3 = new Form(this.a(14));
                var3.append(var2);
                var3.setCommandListener(this);
                var3.addCommand(this.i);
                this.b.setCurrent(var3);
            }

            return false;
        } else {
            return true;
        }
    }

    public static byte[] f(String var0) {
        try {
            DataInputStream var1 = new DataInputStream(var0.getClass().getResourceAsStream(var0));
            ByteArrayOutputStream var2 = new ByteArrayOutputStream();

            int var3;
            while((var3 = var1.read()) != -1) {
                var2.write(var3);
            }

            var1.close();
            return var2.toByteArray();
        } catch (Throwable var4) {
            System.out.println("ERROR: Resource " + var0 + " not found!");
            return null;
        }
    }

    public static byte[] a(Object var0, String var1) {
        try {
            DataInputStream var2 = new DataInputStream(var0.getClass().getResourceAsStream(var1));
            int var3 = var2.readInt();
            System.gc();
            byte[] var4 = new byte[var3];
            var2.readFully(var4);
            var2.close();
            return var4;
        } catch (Throwable var5) {
            System.out.println("ERROR: Resource " + var1 + " not found!");
            return null;
        }
    }

    public int g() {
        return r;
    }

    public static void b(Object var0, String var1) {
        h();
        o = var0;
        p = var1;
        if (v) {
            s = a((Object)var1, (String)var1);
            System.out.println("Caching res.raw (" + s.length + " bytes)");
        }

    }

    public static void h() {
        s = null;
        t = null;
        if (u != null) {
            try {
                u.closeRecordStore();
            } catch (Exception var1) {
            }
        }

        System.gc();
    }

    public static InputStream d(int var0) {
        try {
            DataInputStream var1;
            int var2;
            if (s != null) {
                var1 = new DataInputStream(new ByteArrayInputStream(s));
            } else {
                if (u != null) {
                    for(var2 = 0; (t[var2] & 255) != var0 && var2 < t.length; var2 += 3) {
                    }

                    if (var2 >= t.length) {
                        return null;
                    }

                    r = t[var2 + 1] & 255;
                    return new DataInputStream(new ByteArrayInputStream(u.getRecord(t[var2 + 2] & 255)));
                }

                var1 = new DataInputStream(o.getClass().getResourceAsStream(p));
                var1.skip(4L);
            }

            var2 = var1.read() & 255;
            int var7 = 0;

            int var3;
            int var4;
            int var5;
            int var6;
            do {
                var3 = var1.readByte() & 255;
                var6 = var1.readByte() & 255;
                var4 = var1.readInt();
                var5 = var1.readInt();
                ++var7;
            } while(var7 < var2 && var0 != var3);

            if (var0 != var3) {
                return null;
            } else {
                var1.skip((long)((var2 - var7) * 10 + var4));
                q = var5;
                r = var6;
                return var1;
            }
        } catch (Exception var8) {
            System.out.println("ERROR: getPackedResourceStream " + var0 + " : " + var8);
            return null;
        }
    }

    public static synchronized byte[] e(int var0) {
        try {
            int var1;
            if (u != null) {
                for(var1 = 0; (t[var1] & 255) != var0 && var1 < t.length; var1 += 3) {
                }

                if (var1 >= t.length) {
                    return null;
                } else {
                    r = t[var1 + 1] & 255;
                    return u.getRecord(t[var1 + 2] & 255);
                }
            } else if (s == null) {
                DataInputStream var10 = (DataInputStream)d(var0);
                byte[] var11 = new byte[q];
                var10.readFully(var11);
                var10.close();
                return var11;
            } else {
                var1 = s[0] & 255;
                int var6 = 0;
                int var7 = 1;

                int var2;
                int var3;
                int var4;
                int var5;
                do {
                    var2 = s[var7] & 255;
                    var5 = s[var7 + 1] & 255;
                    var3 = (s[var7 + 2] & 255) << 24 | (s[var7 + 3] & 255) << 16 | (s[var7 + 4] & 255) << 8 | s[var7 + 5] & 255;
                    var4 = (s[var7 + 6] & 255) << 24 | (s[var7 + 7] & 255) << 16 | (s[var7 + 8] & 255) << 8 | s[var7 + 9] & 255;
                    ++var6;
                    var7 += 10;
                } while(var6 < var1 && var0 != var2);

                if (var0 != var2) {
                    return null;
                } else {
                    r = var5;
                    byte[] var8 = new byte[var4];
                    var7 += (var1 - var6) * 10 + var3;
                    System.arraycopy(s, var7, var8, 0, var4);
                    return var8;
                }
            }
        } catch (Exception var9) {
            System.out.println("ERROR: loadRAWFromPacked " + var0 + " : " + var9);
            return null;
        }
    }

    public void i() {
        this.x = "";
        this.J = new TextBox(this.a(18), this.x, 12, 0);
        if (this.o()) {
            this.G = new Command(this.a(20), 4, 0);
            this.J.addCommand(this.G);
        }

        if (this.j()) {
            this.H = new Command(this.a(21), 4, 0);
            this.J.addCommand(this.H);
        }

        this.I = new Command(this.a(22), 2, 0);
        this.J.addCommand(this.I);
        this.J.setCommandListener(this);
        this.l();
    }

    public boolean j() {
        return true;
    }

    public String k() {
        return this.x;
    }

    public void g(String var1) {
        this.x = var1;
    }

    public void f(int var1) {
        this.D = var1;
    }

    public void l() {
        this.B = new String[this.y];
        this.C = new int[this.y];
        this.z = 0;
        this.A = System.currentTimeMillis();
    }

    public final boolean g(int var1) {
        return var1 > this.E;
    }

    public void h(int var1) {
        this.E = var1;
        this.F = false;
    }

    public int m() {
        return this.K;
    }

    public void a(boolean var1) {
        this.F = var1;
    }

    public boolean a(Alert var1) {
        this.K = 0;
        this.J.setString(this.x != null ? this.x : "");
        if (var1 != null) {
            this.b.setCurrent(var1, this.J);
        } else {
            this.b.setCurrent(this.J);
        }

        try {
            while(this.K == 0) {
                Thread.sleep(250L);
            }
        } catch (Exception var3) {
            return false;
        }

        return this.K < 3;
    }

    public void commandAction(Command var1, Displayable var2) {
        if (var1 != this.G && var1 != this.H) {
            if (var1 == this.I) {
                this.K = 3;
            } else if (var1 == this.i) {
                try {
                    this.destroyApp(true);
                    this.notifyDestroyed();
                } catch (Exception var4) {
                }
            } else {
                super.commandAction(var1, var2);
            }
        } else {
            this.x = this.h(this.J.getString());
            if (this.x.length() < 3) {
                this.b.setCurrent(new Alert("Info", this.a(23), (Image)null, (AlertType)null));
            } else if (var1 == this.H) {
                this.K = 2;
            } else {
                this.K = 1;
            }
        }

    }

    public String h(String var1) {
        if (var1.length() > 12) {
            var1 = var1.substring(0, 12);
        }

        return var1;
    }

    public boolean a(int var1, String var2) {
        int var3;
        for(var3 = 0; var3 < this.z && var1 <= this.C[var3]; ++var3) {
        }

        if (var3 == this.y) {
            return false;
        } else {
            if (this.z < this.y) {
                ++this.z;
            }

            for(int var4 = this.z - 1; var4 > var3; --var4) {
                this.B[var4] = this.B[var4 - 1];
                this.C[var4] = this.C[var4 - 1];
            }

            this.C[var3] = var1;
            this.B[var3] = var2;
            return true;
        }
    }

    static {
        System.gc();
        w = System.currentTimeMillis();
    }
}
