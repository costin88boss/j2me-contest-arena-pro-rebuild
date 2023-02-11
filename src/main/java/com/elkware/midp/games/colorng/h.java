package com.elkware.midp.games.colorng;
//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import com.elkware.midp.games.a;

import javax.microedition.lcdui.*;
import java.io.IOException;
import java.util.Vector;

public abstract class h extends c implements Runnable, CommandListener {
    private static final int[] jC = new int[]{1, 2, 4, 8, 16, 32, 64, 128, 256, 512, 1024, 2048, 4096, 8192, 16384, 32768, 65536, 131072, 262144, 524288, 1048576, 2097152, 4194304, 8388608, 16777216};
    public Thread jD;
    private int jE = 0;
    public static boolean jF;
    private boolean jG;
    public byte[] jH;
    private boolean jI = true;
    private boolean jJ = true;
    public boolean jK;
    Thread jL;
    public Image jM = null;
    public Image jN;
    public Image jO;
    public int jP = 0;
    boolean jQ;
    int jR = 7;
    int jS = 7;
    boolean jT;
    boolean jU = true;
    private Display jV;
    public int jW = 16777215;
    public int jX = this.getWidth() / 3;
    public int jY = this.getHeight() - 20;
    public int jZ = this.getWidth() / 3;
    public int ka = 6;
    public int kb = 0;
    int kc = this.getWidth() - 10;
    int bA = this.getHeight() - 7;
    boolean kd;
    private int[] ke = new int[]{48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 42, 35, 0, 0, 0, 0, -3, -4, -1, -2, -5, -5, 42, 48, 35};
    private int[] kf = new int[]{8388608, 327680, 262144, 393216, 65536, 1048576, 131072, 589824, 524288, 655360, 4194304, 16777216};
    Command kg;
    public boolean kh;
    public int ki = -1;
    public int bw = -1;
    public int kj = -1;
    public int kk = -1;
    public int cb;
    String[] kl;
    boolean[] km;
    private Vector kn = new Vector();
    protected long ko;
    protected long kp;
    private boolean kq;

    public h(j var1) throws IOException {
        super(var1);
        int var2;
        if ((var2 = this.H(5036)) != -1) {
            this.jX = var2;
        }

        if ((var2 = this.H(5037)) != -1) {
            this.jY = var2;
        }

        if ((var2 = this.H(5038)) != -1) {
            this.jZ = var2;
        }

        if ((var2 = this.H(5039)) != -1) {
            this.ka = var2;
        }

        int var3 = this.H(5040);
        int var4 = this.H(5041);
        int var5 = this.H(5042);
        if (var3 != -1) {
            this.jW = 0 | var3 << 16 | var4 << 8 | var5;
        }

        var3 = this.H(5043);
        var4 = this.H(5044);
        var5 = this.H(5045);
        if (var3 != -1) {
            this.kb = 0 | var3 << 16 | var4 << 8 | var5;
        }

        if ((var2 = this.H(5046)) != -1) {
            this.jU = var2 == 1;
        }

        this.jV = Display.getDisplay(var1);
        this.jH = com.elkware.midp.games.a.e(5);
        if (this.jH == null) {
            throw new IOException("Sine table (ID 5) is missing!");
        } else {
            this.jG = this.H(5000) != 0;

            int var6;
            int var7;
            for(var7 = 0; var7 < this.kf.length; ++var7) {
                if ((var6 = this.H(5001 + var7)) != -1) {
                    this.kf[var7] = var6 << 16;
                }
            }

            for(var7 = 12; var7 < this.ke.length; ++var7) {
                if ((var6 = this.H(5001 + var7)) != -1) {
                    this.ke[var7] = var6;
                }
            }

            this.ke[14] = this.H(5015);
            this.ke[15] = this.H(5016);
            this.jK = var1.c(5032) == 1;
            if (var1.c(5051) == 1) {
                this.kg = new Command(var1.a(43), 4, 0);
                this.setCommandListener(this);
            }

            this.aE();
        }
    }

    int aE() {
        if ((this.cb = super.iH.c(5030)) == -1) {
            this.cb = 15;
        }

        this.kh = this.cb != 0;
        int var1 = 0;
        if ((this.cb & 1) != 0) {
            this.ki = var1++;
        }

        if (this.jK && (this.cb & 2) != 0) {
            this.bw = var1++;
        }

        if ((this.cb & 4) != 0) {
            this.kj = var1++;
        }

        if ((this.cb & 8) != 0) {
            this.kk = var1++;
        }

        if (this.kl != null) {
            var1 += this.kl.length;
        }

        this.km = new boolean[var1];
        return var1;
    }

    public boolean[] aF() {
        return this.km;
    }

    public void ap() {
        String var1 = super.iH.a("cfg");
        if (var1 == null) {
            var1 = "1111";
        }

        for(int var2 = 0; var2 < Math.min(var1.length(), this.km.length); ++var2) {
            this.km[var2] = var1.charAt(var2) == '1';
        }

        this.a(this.km);
    }

    public void z() {
        String var1 = "";

        for(int var2 = 0; var2 < this.km.length; ++var2) {
            var1 = var1 + (this.km[var2] ? '1' : '0');
        }

        super.iH.a("cfg", var1, true);
    }

    public void a(boolean[] var1) {
        if (this.ki != -1) {
            this.b(this.ki, var1[this.ki]);
        }

        if (this.bw != -1) {
            this.b(this.bw, var1[this.bw]);
        }

        if (this.kj != -1) {
            this.b(this.kj, var1[this.kj]);
        }

        if (this.kk != -1) {
            this.b(this.kk, var1[this.kk]);
        }

    }

    public void b(int var1, boolean var2) {
        this.km[var1] = var2;
        if (var1 == this.ki) {
            super.iH.c = var2;
            if (!this.jK) {
                super.iH.f = var2;
                if (!var2) {
                    this.q(0);
                }
            }

            if (!var2) {
                this.q(1);
            }
        } else if (var1 == this.bw) {
            super.iH.f = var2;
            if (!var2) {
                this.q(0);
            }
        } else if (var1 == this.kj) {
            super.iH.d = var2;
        } else if (var1 == this.kk) {
            super.iH.e = var2;
            this.a(0, var2);
        }

    }

    public boolean D(int var1) {
        return this.km[var1];
    }

    public abstract void q(int var1);

    public Image w(int var1) throws IOException {
        try {
            return Image.createImage("/_" + Integer.toHexString(var1).toUpperCase() + ".png");
        } catch (Exception var4) {
            byte[] var3 = a.e(var1);
            if (var3 != null) {
                return Image.createImage(var3, 0, var3.length);
            } else {
                throw new IOException("Image 0x" + Integer.toHexString(var1) + " not found!");
            }
        }
    }

    public int aG() {
        this.kn.addElement(new Vector());
        return this.kn.size() - 1;
    }

    public void a(int var1, Object var2) {
        ((Vector)this.kn.elementAt(var1)).addElement(var2);
    }

    public void b(int var1, Object var2) {
        ((Vector)this.kn.elementAt(var1)).removeElement(var2);
    }

    public void E(int var1) {
        Vector var2 = (Vector)this.kn.elementAt(var1);

        while(var2.size() > 0) {
            var2.removeElementAt(0);
        }

    }

    public void a(int var1, Graphics var2, int var3, int var4) {
        Vector var5 = (Vector)this.kn.elementAt(var1);

        for(int var7 = var5.size() - 1; var7 >= 0; --var7) {
            Object var6 = var5.elementAt(var7);
            if (var6 instanceof d) {
                ((d)var6).a(var2, var3, var4);
            } else if (var6 instanceof com.elkware.midp.games.colorng.a) {
                ((com.elkware.midp.games.colorng.a)var6).a(var2, var3, var4);
            }
        }

        if (super.iO) {
            this.m(var2);
        }

    }

    public void N() {
        this.F(this.jS);
    }

    public void aH() {
        this.jL = this.jD = null;
    }

    public void run() {
        Thread var1 = Thread.currentThread();
        if (var1 == this.jL) {
            this.aI();

            try {
                this.w();
                this.jQ = true;
                if (this.kg != null) {
                    this.addCommand(this.kg);
                }

                while(this.jL != null) {
                    try {
                        Thread.sleep(250L);
                    } catch (Exception var5) {
                    }

                    this.kd = !this.kd;
                    this.au();
                }
            } catch (Exception var6) {
                super.iH.e("initGame: " + var6);
            }
        } else if (var1 == this.jD) {
            synchronized(this) {
                this.jM = null;
                this.jN = this.jO = null;
                System.gc();
            }

            this.aJ();
        }

    }

    public synchronized void l(Graphics var1) {
        var1.setClip(0, 0, this.getWidth(), this.getHeight());
        if (this.jR == 7) {
            if (this.jM != null) {
                var1.fillRect(0, 0, this.getWidth(), this.getHeight());
                var1.drawImage(this.jM, (this.getWidth() - this.jM.getWidth()) / 2, (this.getHeight() - this.jM.getHeight()) / 2, 20);
            }

            if (this.jQ) {
                if (this.jN != null) {
                    var1.drawImage(this.jN, this.jX, this.jY, 20);
                }

                if (this.kd && this.kg == null) {
                    for(int var2 = 0; var2 < 5; ++var2) {
                        var1.setColor(this.kb);
                        var1.drawLine(this.kc + var2 + 1, this.bA + var2 + 1, this.kc + 9 - var2, this.bA + var2 + 1);
                        var1.setColor(this.jW);
                        var1.drawLine(this.kc + var2, this.bA + var2, this.kc + 8 - var2, this.bA + var2);
                    }
                } else if (this.jO != null) {
                    var1.drawImage(this.jO, this.kc, this.bA, 20);
                }
            } else if (this.jP > 0) {
                var1.setColor(this.jW);
                var1.fillRect(this.jX, this.jY, (this.jP - 1) * this.jZ / 100, this.ka);
                var1.setColor(this.kb);
                var1.drawRect(this.jX, this.jY, this.jZ - 1, this.ka - 1);
            }
        }

    }

    public void aI() {
        try {
            this.jM = this.w(0);
            this.au();
            Thread.sleep(2000L);
        } catch (Exception var3) {
        }

        try {
            this.jM = this.w(2);
            this.jN = Image.createImage(this.jZ, this.ka);
            this.jN.getGraphics().drawImage(this.jM, (this.getWidth() - this.jM.getWidth()) / 2 - this.jX, (this.getHeight() - this.jM.getHeight()) / 2 - this.jY, 20);
            this.jO = Image.createImage(10, 10);
            this.jO.getGraphics().drawImage(this.jM, (this.getWidth() - this.jM.getWidth()) / 2 - this.kc, (this.getHeight() - this.jM.getHeight()) / 2 - this.bA, 20);
            this.au();
        } catch (Exception var2) {
            System.out.println("ERROR: Title picture not found: " + var2);
        }

    }

    public abstract void w();

    public void aJ() {
        long var1 = System.currentTimeMillis();

        while(Thread.currentThread() == this.jD) {
            long var5 = System.currentTimeMillis();
            long var3 = (long)((int)(var5 - var1));
            var1 = var5;
            if (jF) {
                jF = false;
                this.F(super.iH.i(this.at()));
                this.jS = 1;
            } else {
                try {
                    this.a(var3);
                } catch (Exception var9) {
                    super.iH.e("update: " + var9);
                    return;
                }

                this.kp = 0L;
                this.au();

                try {
                    Thread.sleep(Math.max(5L, (long)this.jE - (System.currentTimeMillis() - var5)));
                } catch (Exception var8) {
                }
            }
        }

    }

    public abstract int at();

    public abstract void P();

    public abstract void y();

    public abstract void aA();

    public abstract void K();

    public abstract void aB();

    public abstract void aC();

    public abstract void aD();

    public void a(Displayable var1) {
        Display var2 = Display.getDisplay(super.iH);
        if (var2 != null) {
            var2.setCurrent(var1);
        }

    }

    public void F(int var1) {
        this.jS = this.jR;
        this.aH();
        this.ko = this.kp = 0L;
        switch (var1) {
            case 1:
            case 8:
                this.jM = null;
                this.P();
                this.aA();
                break;
            case 2:
                if (!this.jT) {
                    if (!this.t()) {
                        this.u();
                    } else {
                        this.D();
                    }
                }

                this.jS = 8;
                this.K();
                this.jD = new Thread(this);
                this.jD.start();
                this.jT = true;
                break;
            case 3:
                this.y();
                break;
            case 4:
                this.aB();
                break;
            case 5:
                this.aC();
                break;
            case 6:
                this.aD();
                break;
            case 7:
                this.a((Displayable)this);
                this.jL = new Thread(this);
                this.jL.start();
        }

        this.jR = var1;
    }

    public abstract void a(long var1);

    public abstract boolean t();

    public abstract void u();

    public void D() {
    }

    public void d(long var1) {
    }

    public void c(long var1) {
        if (this.jR == 7) {
            if (this.jQ) {
                this.F(1);
            }
        } else if (this.jR == 2 && (var1 & 16384L) > 0L && this.jQ) {
            this.F(8);
        }

    }

    int G(int var1) {
        int var2 = 0;

        int var3;
        for(var3 = 0; var3 < this.ke.length; ++var3) {
            if (var1 == this.ke[var3]) {
                var2 |= jC[var3];
            }
        }

        if (this.jG) {
            for(var3 = 0; var3 < this.kf.length; ++var3) {
                if (var1 == this.ke[var3]) {
                    var2 |= this.kf[var3];
                }
            }
        }

        return var2;
    }

    public void keyPressed(int var1) {
        int var2 = this.G(var1);
        this.kp |= (long)var2;
        this.ko |= (long)var2;
        if (var2 != 0) {
            this.d((long)var2);
        }

    }

    public final void keyReleased(int var1) {
        int var2 = this.G(var1);
        this.ko &= (long)(~var2);
        if (var2 != 0) {
            this.c((long)var2);
        }

    }

    public void showNotify() {
        if (this.kq) {
            this.N();
            this.kq = false;
        }

    }

    public void hideNotify() {
        if (this.jR == 2) {
            this.kq = true;
            this.aH();
        }

    }

    public String a(int var1) {
        return super.iH.a(var1);
    }

    public int H(int var1) {
        return super.iH.c(var1);
    }

    public void commandAction(Command var1, Displayable var2) {
        if (var1 == this.kg) {
            this.d(16384L);
        }

    }
}
