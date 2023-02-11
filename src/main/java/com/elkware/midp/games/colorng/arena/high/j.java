package com.elkware.midp.games.colorng.arena.high;
//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import com.elkware.midp.games.colorng.arena.a;

import javax.microedition.lcdui.Font;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;
import javax.microedition.media.PlayerListener;
import javax.microedition.rms.*;
import java.io.ByteArrayOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.Hashtable;
import java.util.Vector;

public class j extends a implements Runnable, PlayerListener {
    public final int dJ = 15;
    public final int dK = 20;
    public final int dL = 4;
    public final int dM = 4;
    private final boolean dN = true;
    private int bm;
    public com.elkware.midp.games.colorng.arena.high.a dO;
    private final String[] dP = new String[]{"RSPL", "RSTU", "RSOPT", "RSWAR", "RSPHO", "RSSMS", "RSMAX", "RSHI"};
    private static final String[] dQ = new String[]{"bt", "bt", "bt", "kh", "cc", "bt"};
    public static final int[] dR = new int[]{7, 7, 7, 7, 7, 5};
    public static final int[] dS = new int[]{301, 301, 301, 330, 360, 301};
    public static final int[][] dT = new int[][]{{301, 302, 303, 304, 305, 330, 331}, {330, 331, 332, 333, 334, 360, 361}, {360, 361, 362, 363, 364, 301, 302}};
    public int[] dU = new int[9];
    public int[] dV = new int[4];
    public String dW = "Player";
    private int dX = 0;
    private int dY = 0;
    private final int dZ = 5;
    public boolean[] ea = new boolean[5];
    private byte eb = 1;
    private byte cy = 1;
    private byte ec = 0;
    private byte ed = 0;
    public byte ee = 0;
    private Font[] ef = new Font[7];
    public boolean eg = false;
    public boolean aJ = false;
    public boolean eh = false;
    private int ei = 0;
    private String ej;
    private String ek;
    private String el = null;
    public String em = null;
    private String[] en = null;
    private Image eo;
    private int cs = 0;
    private boolean ep = false;
    public Image eq;
    public int br = 0;
    public final int er = 0;
    public final int es = 1;
    public final int et = 2;
    public final int eu = 4;
    public final int ev = 5;
    private int ew = 0;
    public int ex = -1;
    public int ey;
    public boolean ez;
    public boolean eA;
    public boolean eB = true;
    public final long eC = 120000L;
    public long eD = 120000L;
    public long eE;
    public boolean eF = false;
    public boolean eG = false;
    public boolean eH = false;
    private int eI = 0;
    public final int eJ = 4;
    public String[] eK;
    public int[] eL;
    public int eM = 0;
    private Image eN;
    public Image eO;
    public Image eP = null;
    public Image eQ = null;
    private Image eR;
    private Image eS;
    private Image eT;
    private Image eU = null;
    private Image eV;
    private Image eW;
    private int eX = 0;
    private int[] eY;
    private int[] eZ;
    public Image[] fa;
    public Image[] fb;
    public int K;
    public int fc;
    public int fd;
    public int fe;
    public int[] ff;
    private Image fg;
    private Image fh;
    private Image fi;
    private Image fj;
    private int bH;
    private int fk;
    private int fl;
    private Image fm = null;
    private final byte fn = 1;
    private final byte fo = 2;
    private final byte fp = 3;
    private final byte fq = 4;
    private final byte fr = 5;
    private final byte fs = 6;
    private int ft;
    private int aX;
    private int fu;
    private long fv;
    private int[] fw;
    public int fx = -1;
    public int fy = -1;
    public int fz = 0;
    public int fA = 0;
    public int bx = 0;
    private long fB = 0L;
    public int fC = -1;
    public final byte fD = 1;
    public final byte fE = 32;
    public final byte fF = 4;
    public final byte fG = 32;
    public final byte fH = 71;
    public final byte fI = 72;
    public final byte fJ = 57;
    public final byte fK = 60;
    public final byte fL = 61;
    public final byte fM = 64;
    public final byte fN = 53;
    public final byte fO = 65;
    public final byte fP = 79;
    public final byte fQ = 100;
    public final byte fR = 65;
    public final byte fS = 66;
    public final byte fT = 67;
    public final byte fU = 70;
    public final byte fV = 74;
    public final byte fW = 7;
    public final byte fX = 8;
    public final byte fY = -20;
    public final byte fZ = -3;
    public final byte ga = 80;
    public final byte gb = 79;
    public final byte gc = 73;
    public final byte gd = 75;
    public final byte ge = 78;
    private final int gf = 20;
    private final int gg = 17;
    public com.elkware.midp.games.colorng.a gh;
    private com.elkware.midp.games.colorng.a gi;
    public byte[] gj;
    public byte[] gk;
    public int cW;
    public int cE;
    public int cC;
    private int cp;
    public Vector gl;
    public com.elkware.midp.games.colorng.d[] gm;
    public c[] gn;
    public Hashtable go = new Hashtable();
    private final int gp = 18;
    private final int gq = 23;
    public b[] gr;
    public b gs;
    private byte[][] gt;
    public int[] gu;
    public int gv = 0;
    private Image[] gw;
    private boolean gx = false;
    private Image gy;
    public String[] gz;
    public int[] gA;
    public int[] gB;
    public byte[][] gC;
    public byte[][] gD;
    public int[] gE;
    public int[] gF;
    public int[] gG;
    public int gH = 0;
    public boolean[][] gI;
    public com.elkware.midp.games.colorng.d[] gJ;
    private f[] gK;
    private f[] gL;
    private int gM = 0;
    private int gN = 0;
    public int[] gO;
    public int[] gP;
    public d[] gQ;
    public d[] gR;
    public int gS = 0;
    public int bK = 0;
    public com.elkware.midp.games.colorng.d[] gT;
    private int gU = 0;
    private int[] gV;
    private int[] gW;
    private int[] gX;
    public boolean gY = false;
    public boolean cN = false;
    private boolean gZ = false;
    private final int ha = 0;
    private final int hb = 124;
    private final int hc = 55;
    private final int hd = 92;
    private final int he = 8;
    private Image[] hf;
    private int hg;
    private int hh;
    private int hi;
    public boolean cJ = false;
    public boolean hj = false;
    private long[] hk = new long[20];
    private boolean hl;
    private long hm = 0L;
    public byte[] hn = null;
    private String ho;
    private String hp;
    private String hq = null;
    private String hr;
    private String hs = null;
    private boolean ht = false;
    private boolean dG = false;
    private int hu = 0;
    private int hv = 0;
    private int hw = 0;
    private int hx = 0;
    private final Font hy = Font.getFont(64, 0, 0);
    private String hz;
    public boolean hA = false;
    private int y = 0;
    public Thread hB = null;
    public Thread hC = null;
    public Thread hD = null;
    private Thread hE = null;
    long hF = 0L;
    boolean hG = false;
    Object hH = new Integer(0);
    public boolean hI = false;
    private boolean hJ = false;
    public boolean hK = false;
    public boolean hL = false;
    private boolean hM = false;
    private Image hN = null;
    private k hO;
    private boolean hP = false;
    private boolean hQ = false;
    public boolean hR = false;
    private int[] hS;
    private int hT = 0;
    public boolean hU = false;
    private boolean hV = false;
    public boolean hW = false;
    private int cY = 0;
    private int hX = 0;
    private static int hY = 8;
    public boolean hZ = false;
    private long ia = 0L;
    private boolean ib = false;
    private int ic = 0;
    private boolean id = false;
    private boolean ie = false;
    public boolean _if = false;
    public boolean ig = false;
    private boolean ih = false;
    private int ii = 0;
    private int[] ij;
    private int[] ik;
    private String[] il;
    public int im = 0;
    private String in = null;
    private int[] io;
    private int ip;
    public boolean iq = false;
    private int ir = 0;
    private final int is = 18;
    private static int it = 45;
    private long iu = 0L;
    private boolean iv = true;

    public j(com.elkware.midp.games.colorng.j var1) throws IOException {
        super(var1);
        this.dO = (com.elkware.midp.games.colorng.arena.high.a)var1;
        this.K = this.aG();
        b.a(this, this.K);
        this.bm = 20;
        this.setFullScreenMode(true);
    }

    public void T() {
        this.ew = 0;
    }

    public boolean U() {
        return 0 == this.ew;
    }

    public boolean V() {
        return 1 == this.ew;
    }

    public void W() {
        if (this.ez) {
            this.al();
        } else if (this.eA && this.ew == 0) {
            this.C();
        } else if (this.ex == 0) {
            this.ex = b.m(3) + 1;
            this.ey = b.m(dR[this.ex]) + 1;
        }

        this.ih = false;
        this.ew = 1;
        this.h();
    }

    public int getHeight() {
        return super.getHeight() - 20;
    }

    public void A() {
        if (this.en == null) {
            this.en = new String[4];
            System.gc();

            for(int var1 = 0; var1 < 4; ++var1) {
                this.en[var1] = this.dO.a(262 + var1);
            }

            this.eo = this.w(173);
        }

        this.ew = 2;
        this.h();
    }

    private final void X() {
        this.repaint();
        this.serviceRepaints();

        try {
            Thread var10000 = this.hB;
            Thread.sleep(500L);
        } catch (Exception var2) {
        }

        this.w();
    }

    private final void Y() {
        if (this.ez) {
            if ((this.aX == 4 || this.hQ) && this.ep) {
                if (this.hT < 1) {
                    this.hT = 3;
                    this.cs = Math.min(this.cs + 1, this.ij.length - 4);
                    this.ep = false;
                    this.repaint();
                    this.serviceRepaints();
                }

                this.hQ = false;
            } else if ((this.aX == 3 || this.hP) && this.ep) {
                if (this.hT < 1) {
                    this.hT = 3;
                    this.cs = Math.max(this.cs - 1, 0);
                    this.ep = false;
                    this.repaint();
                    this.serviceRepaints();
                }

                this.hP = false;
            }
        } else if (this.eA && this.hl) {
            this.hl = false;
            this.e();
        }

    }

    private final void Z() {
        int var6;
        if (this.ew == 1) {
            if (this.cJ) {
                return;
            }

            this.cJ = true;
            System.gc();
            this.eK[0] = this.dW;
            this.eL = new int[4];
            this.eL[0] = 0;
            if (this.ez) {
                this.am();

                for(var6 = 1; var6 < 4; ++var6) {
                    try {
                        this.eL[var6] = this.io[var6];
                    } catch (Exception var5) {
                    }
                }
            } else {
                boolean[] var1 = new boolean[this.bm + 1];
                var1[0] = true;

                for(int var2 = 1; var2 < 4; ++var2) {
                    boolean var3 = false;

                    int var8;
                    do {
                        var8 = b.m(this.bm) + 1;
                    } while(var1[var8]);

                    var1[var8] = true;
                    this.eL[var2] = var8;
                }
            }

            this.repaint();
            this.serviceRepaints();

            try {
                Thread var10000 = this.hB;
                Thread.sleep(50L);
            } catch (Exception var4) {
            }

            this.p(this.ey);
            this.hj = true;
        } else if (this.ew == 2) {
            if (this.fm == null) {
                this.fm = this.eT;
                this.hp = this.dO.a(221);
                this.ej = this.dO.a(223);
                this.ek = this.dO.a(224);
                this.el = this.dO.a(225);
            }

            if (this.aJ) {
                if (this.aX != 3 && !this.hP) {
                    if (this.aX != 4 && !this.hQ) {
                        if (this.ei < 2) {
                            boolean var7 = false;
                            if (this.ei == 0) {
                                var6 = this.fa.length;
                            } else {
                                var6 = this.fb.length;
                            }

                            if (this.ei == 0) {
                                if (this.ft == 1) {
                                    this.dU[this.ei] = Math.max(0, this.dU[this.ei] - 1);
                                } else if (this.ft == 2) {
                                    this.dU[this.ei] = Math.min(var6 - 1, this.dU[this.ei] + 1);
                                }
                            } else if (this.ft == 1) {
                                this.dU[this.ei] = Math.max(0, this.dU[this.ei] - 1);
                            } else if (this.ft == 2) {
                                this.dU[this.ei] = Math.min(var6 - 1, this.dU[this.ei] + 1);
                            }
                        } else if (this.ft == 1 && (this.eg || this.dU[this.ei] > this.dV[this.ei - 2])) {
                            this.dU[this.ei] = Math.max(0, this.dU[this.ei] - 1);
                        } else if (this.ft == 2 && this.dU[8] > 0) {
                            this.dU[this.ei] = Math.min(20, this.dU[this.ei] + 1);
                        }
                    } else {
                        this.ei = this.ei == 5 ? 0 : this.ei + 1;
                    }
                } else {
                    this.ei = this.ei == 0 ? 5 : this.ei - 1;
                }

                this.s();
            }
        }

    }

    private final void b(long var1) {
        this.eM = (this.eM + 1) % 100;

        int var3;
        for(var3 = 0; var3 < this.gn.length; ++var3) {
            if (this.gn[var3].aD) {
                this.gn[var3].N();
            }
        }

        for(var3 = 0; var3 < this.gl.size(); ++var3) {
            e var4 = (e)this.gl.elementAt(var3);
            if (var4.S()) {
                this.gl.removeElementAt(var3);
                this.b(this.fc, var4.dp);
            }
        }

        try {
            for(int var15 = 0; var15 < this.gM; ++var15) {
                f var16 = this.gK[var15];
                if (var16.S()) {
                    this.b(this.fd, var16.dw);
                    this.gL[this.gN++] = var16;
                    this.gK[var15] = this.gK[this.gM - 1];
                    this.gK[this.gM - 1] = null;
                    --this.gM;
                }
            }
        } catch (Exception var14) {
        }

        this.gv = this.gv % (this.gr.length - 1) + 1;

        int var5;
        b var17;
        for(var3 = 0; var3 < this.gr.length; ++var3) {
            try {
                var17 = this.gr[var3];
                if (var17.bU) {
                    var17.e();
                } else {
                    if (this.ft == 1) {
                        var17.N();
                    }

                    if (this.ft == 2) {
                        var17.v();
                    }

                    if (this.aX == 3) {
                        var17.O();
                    }

                    var17.bC = this.aX == 4;
                    if (this.fu == 6) {
                        var17.bV = true;
                    } else if (this.fu == 5 && var17.g) {
                        this.gs.A();
                    }
                }

                var17.G();
                this.hk[6 + var3 * 3] = System.currentTimeMillis() - var1;
                if (!(var17.aJ | var17.aS)) {
                    var17.bs = var17.bx;
                }

                if (var17.bu < 0) {
                    if (var17.bu < 0) {
                        this.hh = var17.bs - 1;
                        this.hg = var17.bH / 15 + this.hh / 15 * this.cW;
                        if (this.gj[this.hg] >= 4 && this.gj[this.hg] <= 32 && this.gj[this.hg] != 8 && this.gj[this.hg] != 7) {
                            var17.bu = 0;
                            var17.bs += 15 - var17.bs % 15;
                        }
                    }
                } else {
                    try {
                        this.hh = Math.min(var17.bs + var17.cm + 1, this.cE * 15 - 5);
                        this.hg = var17.bH / 15 + this.hh / 15 * this.cW;
                        var17.by = this.gj[this.hg] >= 1 && this.gj[this.hg] <= 32 && this.gj[this.hg] != 8 && this.gj[this.hg] != 7;
                    } catch (Exception var12) {
                        this.hh -= 15;
                        var17.bs -= 15;
                        this.hg = var17.bH / 15 + this.hh / 15 * this.cW;
                        if (var17.g) {
                            var17.f(200);
                        }
                    }

                    if (var17.by) {
                        var17.bs -= this.hh % 15 - 1;
                        var17.bu = 0;
                    }
                }

                if (var17.bt + var17.bw != 0) {
                    this.hg = (var17.bt + var17.bw < 0 ? var17.br : var17.br + var17.cl) / 15 + (var17.bs + var17.cm - 1) / 15 * this.cW;
                    this.hi = var17.cm / 15 + 1;

                    for(var5 = 0; var5 < this.hi; ++var5) {
                        if (this.gj[this.hg] >= 4 && this.gj[this.hg] <= 32 && this.gj[this.hg] != 8 && this.gj[this.hg] != 7) {
                            var17.br += var17.bt + var17.bw < 0 ? 15 - var17.br % 15 : -(15 - var17.br % 15);
                            var17.bt /= -2;
                            var17.bw /= -2;
                            break;
                        }

                        this.hg -= this.cW;
                    }

                    this.hk[7 + var3 * 3] = System.currentTimeMillis() - var1;
                    this.hg = (var17.bt + var17.bw < 0 ? var17.br : var17.br + var17.cl) / 15 + (var17.bs + var17.cm - 1) / 15 * this.cW;
                    if (this.gj[this.hg] >= 4 && this.gj[this.hg] <= 32 && this.gj[this.hg] != 8 && this.gj[this.hg] != 7) {
                        var17.br = var17.bK;
                    }

                    var17.bK = var17.br;
                    var17.bL = var17.bs;
                }

                this.hg = var17.bA;
                if (this.gj[this.hg] > 0) {
                    if (this.gj[this.hg] == 71) {
                        if (var17.bW) {
                            c var19 = (c)this.go.get(new Integer(this.hg));
                            var19.l(var3);
                            this.gj[this.hg] = 72;
                            this.gh.setCell(this.hg % this.cW, this.hg / this.cW, 72);
                        }
                    } else if (this.gj[this.hg] >= 57 && this.gj[this.hg] <= 64 && !var17.bF) {
                        var17.f(500);
                    } else if (this.gj[this.hg] >= 65 && this.gj[this.hg] <= 79 && this.gj[this.hg] != 72 && this.gj[this.hg] != 71 && (this.gj[this.hg] < 75 || this.gj[this.hg] > 78)) {
                        switch (this.gj[this.hg]) {
                            case 65:
                                var17.bS = Math.min(var17.bS + 40, var17.bP);
                                this.hW = true;
                                break;
                            case 66:
                                var17.P();
                                this.a(3, var17.br - 2, var17.bs + var17.cm - this.gP[3]);
                                break;
                            case 73:
                                var17.f(500);
                                break;
                            case 79:
                                this.fC = var3;
                                this.gj[this.hg] = 0;
                        }

                        if (this.gj[this.hg] >= 67 && this.gj[this.hg] <= 70 || this.gj[this.hg] == 74) {
                            var17.cj = this.gj[this.hg] == 74 ? 5 : this.gj[this.hg] - 67 + 1;
                            var17.ck = b.bi[var17.cj];
                        }

                        this.gV[this.gU] = 100;
                        this.gX[this.gU] = this.hg;
                        this.gW[this.gU++] = this.gj[this.hg];
                        this.gj[this.hg] = 0;
                        this.gh.setCell(this.hg % this.cW, this.hg / this.cW, 0);
                    }
                }

                var17.bJ = this.hg;
                if (var17.g) {
                    try {
                        for(var5 = 0; var5 < this.gl.size(); ++var5) {
                            e var6 = (e)this.gl.elementAt(var5);
                            if (var6.dp.a(var17.cf, true)) {
                                var6.a(var17);
                            }
                        }
                    } catch (Exception var11) {
                    }

                    for(var5 = 0; var5 < this.gS; ++var5) {
                        if (this.gQ[var5].dj != var17 && this.a(this.gQ[var5].di, var17.cf)) {
                            this.gQ[var5].a(var17);
                        }
                    }

                    if (var17.v) {
                        var17.cf.defineCollisionRectangle(0, 2, var17.cl, var17.cm - 10);
                        var17.cf.setPosition(var17.br, var17.bs + 8);
                        var17.cg.setPosition(var17.br, var17.bs + var17.cf.ax());
                    } else {
                        var17.cf.defineCollisionRectangle(0, 0, var17.cl, var17.cm);
                        var17.cf.setPosition(var17.br, var17.bs);
                        var17.cg.setPosition(var17.br, var17.bs + var17.cf.ax());
                    }
                }
            } catch (Exception var13) {
            }
        }

        var5 = 0;
        boolean var20 = false;

        int var7;
        int var8;
        for(var7 = this.gr.length; var7 > 0; --var7) {
            b var18 = this.gr[var5++];
            int var21 = var5;
            if (var18.g) {
                for(var8 = this.gr.length - var5; var8 > 0; --var8) {
                    var17 = this.gr[var21++];
                    if (var17.g && this.a(var18.cf, var17.cf)) {
                        var18.bw = var18.br < var17.br ? -8 : 8;
                        var17.bw = var17.br < var18.br ? -8 : 8;
                        var17.bt = var17.bw / 4;
                        var18.bt = var18.bw / 4;
                        if (var18.bN == -1) {
                            var18.bN = var17.bT;
                            var18.bO = 20;
                        }

                        if (var17.bN == -1) {
                            var17.bN = var18.bT;
                            var17.bO = 20;
                        }

                        if ((!var17.bU || !var18.bU) && this.ea[2]) {
                            this.b(40);
                        }
                    }
                }
            }
        }

        for(var8 = 0; var8 < this.ff.length; ++var8) {
            byte var22 = this.gj[this.ff[var8]];
            if (var22 < 57) {
                var7 = var22 + 1;
                var7 = var22 % 4 + 53;
            } else if (var22 <= 60) {
                var7 = var22 + 1;
                var7 = var22 % 4 + 57;
            } else {
                var7 = var22 + 1;
                var7 = var22 % 4 + 61;
            }

            this.gj[this.ff[var8]] = (byte)var7;
            this.gh.setCell(this.ff[var8] % this.cW, this.ff[var8] / this.cW, var7);
        }

        for(var8 = 0; var8 < this.gU; ++var8) {
            if (this.gV[var8]-- < 1) {
                this.gj[this.gX[var8]] = (byte)this.gW[var8];
                this.gh.setCell(this.gX[var8] % this.cW, this.gX[var8] / this.cW, this.gW[var8]);
                this.gV[var8] = this.gV[this.gU - 1];
                this.gW[var8] = this.gW[this.gU - 1];
                this.gX[var8--] = this.gX[this.gU-- - 1];
            }
        }

        try {
            for(int var9 = 0; var9 < this.gS; ++var9) {
                d var23 = this.gQ[var9];
                if (var23.S()) {
                    this.a(f.dt[(int)(System.currentTimeMillis() % 2L)], var23.cW - 10, var23.cO - 10);
                    this.b(this.fe, var23.di);
                    this.gR[this.bK++] = var23;
                    this.gQ[var9] = this.gQ[this.gS - 1];
                    this.gQ[this.gS - 1] = null;
                    --this.gS;
                }
            }
        } catch (Exception var10) {
        }

    }

    public void a(long var1) {
        long var3 = System.currentTimeMillis();
        if (this.ew == 5) {
            this.X();
        } else if (this.hZ) {
            return;
        }

        if (this._if) {
            this.Y();
        } else if (!this.hj) {
            this.Z();
        } else {
            if (!this.eF) {
                try {
                    this.b(var3);
                } catch (Exception var9) {
                }
            }

            long var5 = System.currentTimeMillis();
            int var8;
            if (!this.eF && !this.hZ && this.ex > 2 && (var5 - 1000L) / 1000L % 5L == 0L && var5 > this.fB + 2000L) {
                if (this.ex == 3) {
                    for(var8 = 0; var8 < this.gr.length; ++var8) {
                        b var7 = this.gr[var8];
                        if (var7.bs + var7.cm <= this.bx + 15 && var7.bs + var7.cm >= this.bx - 45 && var7.br + var7.cl / 2 >= this.fz && var7.br - var7.cl / 2 <= this.fA && var7.g) {
                            ++var7.bM;
                        }
                    }
                } else if (this.fC > -1) {
                    ++this.gr[this.fC].bM;
                }

                this.fB = var5;
            }

            this.hk[17] = System.currentTimeMillis() - var3;
            if (this.eD > -1L) {
                this.eF = var5 - this.eE > this.eD;
                if (!this.eF && !this.gZ && this.gY && var5 - this.eE + 30000L > this.eD) {
                    this.gZ = true;
                }
            } else if (this.fx > -1) {
                for(var8 = 0; var8 < this.gr.length; ++var8) {
                    if (this.gr[var8].bM >= this.fx) {
                        this.eF = true;
                    }
                }
            } else if (this.fy == 0) {
                this.eF = true;
            }

            this.eG = this.eG && !this.eF;
            if (this.eF) {
                ++this.eI;
            }

            this.hk[18] = System.currentTimeMillis() - var3;
            this.x();
        }
    }

    private void aa() {
        if (this.hn != null && this.hn[3] > 0) {
            int var1 = 0;
            this.gz = new String[3];
            this.gA = new int[3];

            for(int var2 = 0; var2 < 3; ++var2) {
                byte var3 = this.hn[3 + var2];
                byte[] var4 = new byte[3];
                System.arraycopy(this.hn, (var2 + 2) * 3, var4, 0, 3);
                this.gA[var2] = this.a(var4, 0);
                String var5 = "";

                for(int var6 = 0; var6 < var3; ++var6) {
                    var5 = var5 + (char)this.hn[15 + var1 + var6];
                }

                var1 += var3;
                this.gz[var2] = var5;
            }
        }

    }

    private final void a(Graphics var1) {
        var1.setClip(0, 0, this.cC, this.cp + 20);
        var1.drawImage(this.eT, 0, 0, 0);
        var1.setFont(this.ef[1]);
        var1.setColor(50, 50, 50);
        var1.drawString(this.a(520), 12, 10, 0);
        var1.setColor(255, 255, 255);
        var1.drawString(this.a(520), 11, 8, 0);
        var1.drawImage(this.eQ, 0, this.cp - this.eQ.getHeight() + 20, 0);
        var1.setColor(0, 0, 0);
        var1.fillRect(11, 24, this.cC - 22, 19);
        var1.setColor(100, 0, 0);
        var1.fillRect(12, 25, this.cC - 24, 17);
        String var2 = "";

        try {
            var2 = this.hn != null ? this.a(32) + " " + this.a(this.hn, 0) : this.a(287);
        } catch (Exception var8) {
            var2 = this.a(287);
        }

        var1.setColor(255, 255, 255);
        var1.setFont(this.ef[0]);
        this.a(var1, var2, 14, 28, this.cC - 28);
        var1.setColor(200, 200, 200);
        var1.fillRect(12, this.cp + 20 - 66, this.cC - 24, 52);
        var1.setColor(0, 0, 80);
        var1.fillRect(13, this.cp + 20 - 65, this.cC - 26, 50);
        var1.setColor(255, 255, 255);
        var1.setFont(this.ef[6]);
        int var3 = this.ef[6].stringWidth("5555");
        int var4 = this.ef[6].stringWidth("2.");
        if (this.gz != null) {
            for(int var5 = 0; var5 < 3; ++var5) {
                int var6 = this.cp + 20 - 63 + var5 * 15;
                var1.setColor(255, 255, 255);
                var1.setFont(this.ef[6]);
                var1.drawString(var5 + 1 + ". ", 17, var6, 0);
                String var7 = Integer.toString(this.gA[var5]);
                var1.setColor(255, 255, 255);
                var1.setFont(this.ef[6]);
                var1.drawString(var7, this.cC - 17 - this.ef[6].stringWidth(var7), var6, 0);
                var1.setColor(255, 255, 255);
                var1.setFont(this.ef[6]);
                this.a(var1, this.gz[var5], 18 + var4, var6, this.cC - 35 - var3 - var4);
            }
        } else {
            var1.setColor(255, 255, 255);
            var1.setFont(this.ef[6]);
            var1.drawString(this.a(29), 14, this.cp + 20 - 63, 0);
        }

    }

    private final void b(Graphics var1) {
        if (this.hq == null) {
            this.hq = this.dO.a(227);
            this.hr = this.dO.a(228);
        }

        var1.setClip(0, 0, this.cC, this.cp + 20);
        var1.drawImage(this.eT, 0, 0, 0);
        var1.setColor(255, 255, 255);
        var1.fillRect(124, 55, 8, 92);
        var1.setColor(0, 0, 0);
        var1.fillRect(124, 55 + this.cs * 92 / (this.ij.length - 3), 8, 92 / (this.ij.length - 3) + 1);
        var1.setFont(this.ef[5]);
        var1.setColor(50, 50, 50);
        String var2 = this.ij.length > 4 ? this.hq + " " + this.ii : this.hr;
        int var3 = this.ef[5].stringWidth(var2);
        this.a(var1, var2, (this.cC - var3) / 2 + 1, 25, this.cC);
        var1.setColor(250, 250, 250);
        this.a(var1, var2, (this.cC - var3) / 2, 24, this.cC);

        try {
            var1.setColor(200, 200, 200);
            var1.setFont(this.ef[1]);

            for(int var4 = this.cs; var4 < 4 + this.cs; ++var4) {
                var1.setClip(4, 55 + (var4 - this.cs) * 23, 18, 18);

                try {
                    Image var5;
                    if (this.ij[var4] != 0) {
                        var5 = this.fa[this.gt[this.ij[var4] - 1][0] - 1];
                    } else {
                        var5 = this.fa[this.dU[0]];
                    }

                    var1.drawImage(var5, 5, 55 + (var4 - this.cs) * 23, 0);
                } catch (Exception var6) {
                }

                var1.setColor(200, 200, 200);
                this.a(var1, var4 + 1 + ". " + this.il[this.ij[var4]], 22, 58 + (var4 - this.cs) * 23, 87);
                var1.setColor(200, 200, 210);
                this.a(var1, (this.ik[this.ij[var4]] < 10 ? "0" : "") + this.ik[this.ij[var4]], 104, 58 + (var4 - this.cs) * 23, 15);
            }
        } catch (Exception var7) {
        }

    }

    private final void c(Graphics var1) {
        int var2;
        int var3;
        if (this.ij.length > 4) {
            if (this.in == null) {
                this.in = this.dO.a(280);
            }

            System.gc();
            var1.setClip(0, 0, this.cC, this.cp + 20);
            if (this.eq == null) {
                this.eq = this.w(33);
            }

            var1.drawImage(this.eq, 0, 0, 0);
            var1.setFont(this.ef[1]);
            if (this.ij.length > 4) {
                var1.setColor(0, 0, 0);
                var2 = this.ef[1].stringWidth(this.in) / 2;
                var1.drawString(this.in, this.cC / 2 - 3 - var2, this.cp / 2, 20);
                var1.drawString(this.in, this.cC / 2 - 3 - var2, this.cp / 2, 20);
                var1.setColor(255, 0, 0);
                var1.drawString(this.in, this.cC / 2 - var2, this.cp / 2, 20);
            } else {
                var1.setColor(255, 0, 0);
                String var7 = this.ir + ". " + this.a(524);
                var3 = this.ef[1].stringWidth(var7) / 2;
                var1.drawString(var7, this.cC / 2 - 3 - var3, this.cp / 2, 20);
                var1.drawString(var7, this.cC / 2 + 3 - var3, this.cp / 2, 20);
                var1.setColor(255, 255, 255);
                var1.drawString(var7, this.cC / 2 - var3, this.cp / 2, 20);
            }
        } else if (this.eP == null || this.hu < 75) {
            System.gc();
            if (this.eP == null) {
                this.eP = this.w(32);
            }

            var1.setClip(0, 0, this.cC, this.cp + 20);
            var1.drawImage(this.eP, 0, 0, 0);

            int var4;
            try {
                for(var4 = 0; var4 < 3; ++var4) {
                    var2 = this.dO.c(270 + var4 * 2);
                    var3 = this.dO.c(271 + var4 * 2) - 41;
                    var1.setClip(var2, var3, 18, 41);
                    if (this.ij[var4] != 0) {
                        var1.drawImage(this.fa[this.gt[this.ij[var4] - 1][0] - 1], var2, var3, 0);
                        var1.drawImage(this.fb[this.gt[this.ij[var4] - 1][1] - 1], var2, var3 + 18, 0);
                    } else {
                        var1.drawImage(this.fa[this.dU[0]], var2, var3, 0);
                        var1.drawImage(this.fb[this.dU[1]], var2, var3 + 18, 0);
                    }
                }
            } catch (Exception var6) {
            }

            var1.setFont(this.ef[1]);

            for(var2 = 2; var2 >= 0; --var2) {
                try {
                    String var8 = var2 + 1 + ". " + this.il[this.io[this.hS[var2]]];
                    var4 = this.ef[1].stringWidth(var8);
                    var1.setColor(30, 30, 30);
                    this.a(var1, var8, (this.cC - var4) / 2 + 1, 14 + var2 * 15, 100);
                    this.a(var1, var8, (this.cC - var4) / 2 - 1, 16 + var2 * 15, 100);
                    this.a(var1, var8, (this.cC - var4) / 2 + 1, 16 + var2 * 15, 100);
                    this.a(var1, var8, (this.cC - var4) / 2 - 1, 14 + var2 * 15, 100);
                    var1.setColor(255, 0, 0);
                    this.a(var1, var8, (this.cC - var4) / 2, 15 + var2 * 15, 100);
                } catch (Exception var5) {
                }
            }
        }

    }

    private final void d(Graphics var1) {
        var1.setClip(0, 0, this.cC, this.cp + 20);
        var1.drawImage(this.fm, 0, 0, 0);
        var1.setClip(0, 0, 200, 200);
        var1.drawImage(this.eo, 25 - this.eo.getWidth(), 100, 0);
        if (this.eh) {
            if (this.dO.aY) {
                this.ht = false;
                return;
            }

            var1.drawImage(this.eT, 0, 0, 0);
            this.em = this.dO.a(407);
            var1.setFont(this.ef[1]);
            var1.setColor(200, 200, 200);
            var1.drawString(this.em, 12, 14, 20);
            var1.setColor(255, 0, 0);
            var1.fillRect((this.cC - this.dO.aU.getWidth()) / 2, (this.cp - this.dO.aU.getHeight()) / 2, this.dO.aW, this.dO.aW);
            var1.setClip((this.cC - this.dO.aU.getWidth()) / 2, (this.cp - this.dO.aU.getHeight()) / 2, this.dO.aW, 15 + this.dO.aW);
            var1.drawImage(this.dO.aU, (this.cC - this.dO.aU.getWidth()) / 2, (this.cp - this.dO.aU.getHeight()) / 2, 0);
        } else if (this.aJ) {
            var1.setFont(this.ef[2]);
            var1.setColor(220, 220, 220);
            this.a(var1, this.ek + " " + this.dU[6] + "/" + this.dU[7] * 5, 15, 20, this.cC - 30);
            var1.setFont(this.ef[1]);
            this.a(var1, this.el + ": " + this.dU[8], 15, 35, this.cC - 30);

            try {
                var1.setClip(this.cC - 15 - 18, 39, 18, 41);
                var1.drawImage(this.fa[this.dU[0]], this.cC - 15 - 18, 39, 0);
                var1.drawImage(this.fb[this.dU[1]], this.cC - 15 - 18, 57, 0);
            } catch (Exception var3) {
            }

            var1.setFont(this.ef[1]);
            var1.setColor(255, 255, 255);
            var1.setClip(0, 0, this.cC, this.cp + 20);
            if (this.ei < 2) {
                var1.drawString("[", this.cC - 15 - 18 - 7, 40 + this.ei * 20, 20);
                var1.drawString("]", this.cC - 13, 40 + this.ei * 20, 20);
            } else {
                var1.drawString("[", 25, 98 + (this.ei - 2) * 12, 20);
                var1.drawString("]", 123, 98 + (this.ei - 2) * 12, 20);
                var1.setColor(200, 200, 200);
                this.a(var1, this.en[this.ei - 2], 11, 80, this.cC - 17);
            }
        } else {
            var1.setFont(this.ef[1]);
            var1.setColor(0, 0, 0);
            this.a(var1, this.hp, 14, 19, this.cC - 28);
            this.a(var1, this.hp, 16, 21, this.cC - 28);
            var1.setColor(255, 255, 255);
            this.a(var1, this.hp, 15, 17, this.cC - 28);
            var1.setColor(0, 0, 0);
            this.a(var1, this.dW, 14, 38, this.cC - 17 - 14);
            this.a(var1, this.dW, 16, 40, this.cC - 17 - 16);
            var1.setColor(255, 200, 200);
            this.a(var1, this.dW, 15, 39, this.cC - 17 - 15);
            var1.setColor(0, 0, 0);
            this.a(var1, this.ej + " " + this.dU[7], 14, 54, this.cC - 17 - 14);
            this.a(var1, this.ej + " " + this.dU[7], 16, 56, this.cC - 17 - 16);
            var1.setColor(255, 200, 200);
            this.a(var1, this.ej + " " + this.dU[7], 15, 55, this.cC - 17 - 15);
            var1.setClip(this.cC - 17 - 18, 39, 18, 41);
            var1.drawImage(this.fa[this.dU[0]], this.cC - 17 - 18, 39, 0);
            var1.drawImage(this.fb[this.dU[1]], this.cC - 17 - 18, 57, 0);
        }

        if (!this.eh) {
            var1.setClip(0, 0, this.cC, this.cp);

            for(int var2 = 0; var2 < 4; ++var2) {
                var1.setColor(0, 200, 0);
                var1.fillRect(30, 100 + var2 * 12, 110 * this.dU[2 + var2] / 25, 8);
                var1.setColor(0, 50, 0);
                var1.fillRect(30 + 110 * this.dU[2 + var2] / 25, 100 + var2 * 12, 90 - 110 * this.dU[2 + var2] / 25, 8);
            }
        }

    }

    private final synchronized void e(Graphics var1) {
        var1.setClip(0, 0, this.cC, this.cp + 20);
        var1.setFont(this.hy);
        if (this.ic != 0 && this.id) {
            var1.setClip(0, 0, this.getWidth(), this.getHeight());
            var1.setColor(0, 0, 0);
            var1.fillRect(0, 100, this.cC, 20);
            var1.setColor(200, 200, 200);
            String var3 = this.ic + "%";
            var1.drawString(var3, Math.max((this.cC - this.ef[1].stringWidth(var3)) / 2, 0), 102, 0);
            if (this.ic == 100) {
            }
        } else {
            var1.drawImage(this.eN, 0, 0, 0);
            var1.setColor(250, 250, 250);
            int var2 = this.ef[1].stringWidth(this.ho);
            this.a(var1, this.ho, (this.cC - var2) / 2, 70, 80);
            var1.setColor(0, 0, 0);
            this.a(var1, this.ho, (this.cC - var2) / 2 - 1, 69, 80);
            this.id = true;
        }

    }

    private synchronized void f(Graphics var1) {
        int var2 = (this.cC - 10) * this.ic / 100;
        var1.setColor(100, 100, 100);
        var1.fillRect(5, 100, this.cC - 10, 20);
        var1.setColor(0, 250, 0);
        var1.fillRect(5, 100, var2, 20);
        if (!com.elkware.midp.games.colorng.arena.high.a.P) {
            var1.setColor(255, 0, 0);
            var1.drawString(this.ic + "%", this.cC / 2 - 15, 102, 0);
        }

    }

    private final synchronized void g(Graphics var1) {
        var1.setClip(0, 0, this.cC, this.cp + 20);
        var1.setColor(50, 50, 50);
        var1.fillRect(0, 0, this.cC, this.cp + 20);
        int var2;
        if (this.ex > 0 && this.ex <= 4) {
            String var3 = this.a(210 + this.ex - 1);
            var1.setFont(this.ef[0]);
            var1.setColor(150, 0, 0);
            byte var4 = 30;
            var2 = this.ef[0].stringWidth(var3);
            this.a(var1, var3, (this.cC - var2) / 2 - 1, var4 - 1, this.cC);
            this.a(var1, var3, (this.cC - var2) / 2 + 1, var4 + 1, this.cC);
            var1.setColor(200, 200, 200);
            this.a(var1, var3, (this.cC - var2) / 2, var4, this.cC);
        }

        var1.setColor(150, 0, 0);
        if (this.hz == null) {
            this.hz = this.a(250);
        }

        var2 = this.ef[0].stringWidth(this.hz);
        this.a(var1, this.hz, (this.cC - var2) / 2 - 1, 69, this.cC);
        this.a(var1, this.hz, (this.cC - var2) / 2 + 1, 71, this.cC);
        var1.setColor(200, 200, 200);
        this.a(var1, this.hz, (this.cC - var2) / 2, 70, this.cC);
        this.f(var1);
        this.ht = false;
    }

    private final synchronized void h(Graphics var1) {
        var1.setClip(0, 0, this.cC, this.cp + 20);
        if (this.ic == 0 || this.hK) {
            this.hK = false;
            if (this.hs == null) {
                this.hs = this.dO.a(405);
            }

            var1.setColor(50, 50, 50);
            var1.fillRect(0, 0, this.cC, this.cp + 20);
            var1.setFont(this.ef[0]);
            var1.setColor(150, 0, 0);
            int var2 = this.ef[0].stringWidth(this.hs);
            this.a(var1, this.hs, (this.cC - var2) / 2 - 1, 69, this.cC);
            this.a(var1, this.hs, (this.cC - var2) / 2 + 1, 71, this.cC);
            var1.setColor(200, 200, 200);
            this.a(var1, this.hs, (this.cC - var2) / 2, 70, this.cC);
        }

        this.f(var1);
    }

    public Image ab() {
        Image var1 = Image.createImage(this.cC, this.cp + 20);
        this.dG = true;
        this.i(var1.getGraphics());
        this.dG = false;
        return var1;
    }

    private final void i(Graphics var1) {
        if (this.eH) {
            ++this.hm;
            var1.setClip(0, 0, this.cC, this.cp);
            var1.drawImage(this.eO, this.hv / this.fk, this.hw / this.fl, 0);
            var1.setClip(0, 0, this.cC, this.cp);
            this.gh.paint(var1);
            ++this.hx;
            this.hx %= 57;
            boolean var2 = false;
            int var3 = Math.max(2, 6 - 6 * this.gs.bS / this.gs.bP);
            int var15;
            if (this.gs.g) {
                var15 = this.hx % 12 < var3 ? this.hx % (var3 * 2) : Math.max(0, var3 * 2 - this.hx % 12);
            } else {
                var15 = 0;
            }

            var1.setClip(66, this.cp + 6, 57 - this.hx, 10);
            var1.drawImage(this.fh, 66 - this.hx - var15 * 57, this.cp + 6, 0);
            var1.setClip(123 - this.hx, this.cp + 6, this.hx, 10);
            var1.drawImage(this.fh, 123 - this.hx - var15 * 57, this.cp + 6, 0);

            try {
                var1.setClip(0, 0, this.cC, this.cp);
                this.a(this.fe, var1, this.hv, this.hw);
            } catch (Exception var13) {
            }

            this.a(this.fc, var1, this.hv, this.hw);

            b var4;
            int var5;
            int var6;
            int var7;
            for(var7 = 0; var7 < this.gr.length; ++var7) {
                var4 = this.gr[var7];
                if (var4.g && var4.bv == 0) {
                    var5 = var4.br + this.hv - this.eY[var4.cj] / 2 + var4.ci - (var4.by && var4.bw == 0 ? var4.br % 4 : 0);
                    var6 = var4.bs + this.hw + 18 + 5 + (var4.v ? 5 : 0);
                    var1.setClip(var5, var6, this.eY[var4.cj], Math.min(this.eZ[var4.cj], Math.max(0, this.cp - var6)));
                    var1.drawImage(this.gw[var4.cj], var5, var6, 0);
                }
            }

            var1.setClip(0, 0, this.cC, this.cp);
            this.a(this.K, var1, this.hv, this.hw);

            for(var7 = 0; var7 < this.gr.length; ++var7) {
                var4 = this.gr[var7];
                if (var4.g && var4.bv == 1) {
                    var5 = var4.br + this.hv + 18 - this.eY[var4.cj] / 2 + var4.ci - (var4.by && var4.bw == 0 ? var4.br % 4 : 0);
                    var6 = var4.bs + this.hw + 18 + 5 + (var4.v ? 5 : 0);
                    var1.setClip(var5, var6, this.eY[var4.cj], Math.min(this.eZ[var4.cj], Math.max(0, this.cp - var6)));
                    var1.drawImage(this.gw[var4.cj], var5, var6 - this.eZ[var4.cj], 0);
                }
            }

            var1.setClip(0, 0, this.cC, this.cp);
            this.a(this.fd, var1, this.hv, this.hw);
            var1.setClip(0, 0, this.cC, this.cp);

            for(var7 = 0; var7 < this.gr.length; ++var7) {
                if (this.gr[var7].bU && this.gr[var7].g) {
                    var1.setColor(0, 200, 0);
                    var1.fillRect(this.gr[var7].br + this.hv, this.gr[var7].bs - 5 + this.hw, this.gr[var7].ch, 2);
                    var1.setColor(200, 0, 0);
                    var1.fillRect(this.gr[var7].br + this.hv + this.gr[var7].ch, this.gr[var7].bs - 5 + this.hw, 12 - this.gr[var7].ch, 2);
                }
            }

            var1.setColor(0, 0, 0);

            try {
                if (this.gs != null && this.gs.g && !this.eF) {
                    this.dX = Math.min(this.dY++ + this.dX, 0);
                    if (this.dX >= 0) {
                        this.dY = -4;
                    }

                    var1.drawImage(this.gy, this.gs.br + this.hv + this.ec, this.gs.bs - this.ed + this.dX + this.hw, 0);
                }
            } catch (Exception var12) {
            }

            if (this.fC > -1 && this.gr[this.fC].g) {
                var1.drawImage(this.eU, this.gr[this.fC].br + this.hv + 1, this.hw + this.gr[this.fC].cf.getY() - this.eU.getHeight() + 3, 0);
            }

            if (this.dG) {
                this.k(var1);
            } else {
                var1.setFont(this.ef[1]);
                if (this.hA) {
                    try {
                        byte var19 = 40;
                        byte var8 = 18;

                        for(int var17 = 0; var17 < 4; ++var17) {
                            String var10 = this.eK[this.eL[var17]] + "  " + this.gr[var17].bM;
                            int var11 = this.ef[1].stringWidth(var10);
                            var1.setColor(0, 0, 0);
                            this.a(var1, var10, (this.cC - var11) / 2 - 1, var19 + var17 * var8, 90);
                            this.a(var1, var10, (this.cC - var11) / 2 + 1, var19 + 2 + var17 * var8, 90);
                            this.a(var1, var10, (this.cC - var11) / 2 + 1, var19 + var17 * var8, 90);
                            this.a(var1, var10, (this.cC - var11) / 2 - 1, var19 + 2 + var17 * var8, 90);
                            var1.setColor(255, 0, 0);
                            this.a(var1, var10, (this.cC - var11) / 2, var19 + 1 + var17 * var8, 90);
                            if (this.eA) {
                                var17 = 4;
                            }
                        }
                    } catch (Exception var14) {
                    }

                    this.k(var1);
                    this.ht = false;
                } else {
                    if (this.eF) {
                        if (this.eS == null) {
                            this.bH /= 2;
                        } else if (this.bH < this.cC) {
                            this.bH = Math.max(this.bH + 2, this.bH * 2);
                        }

                        if (this.bH < this.cC) {
                            var1.drawImage(this.eV, (this.cC - this.eV.getWidth()) / 2 + this.bH, this.cp / 2 - this.eV.getHeight(), 0);
                            var1.drawImage(this.eW, (this.cC - this.eW.getWidth()) / 2 - this.bH, this.cp / 2, 0);
                        } else if (this.eS != null) {
                            if (this.bH > this.cC) {
                                this.eX = Math.min((this.getHeight() - this.eX) / 2 + this.eX + 1, this.getHeight());
                            }

                            var1.setClip(0, 0, this.cC, this.eX);
                            var1.drawImage(this.eS, 0, this.eX - this.eS.getHeight(), 0);
                        }
                    } else if (this.eD > 0L) {
                        var1.setColor(30, 30, 30);
                        long var16 = this.eD - (System.currentTimeMillis() - this.eE);
                        String var9 = var16 / 60000L + ":" + (var16 % 60000L / 10000L == 0L ? "0" : "") + var16 % 60000L / 1000L;
                        var1.drawString(var9, this.cC - 28, 4, 20);
                        if ((this.ex == 3 || this.ex == 4) && var16 / 1000L % 5L == 0L) {
                            var1.setColor(255, 100, 100);
                        } else {
                            var1.setColor(255, 0, 0);
                        }

                        var1.drawString(var9, this.cC - 29, 3, 20);
                    } else if (this.fy > 0) {
                        String var18 = "" + this.fy;
                        var1.setColor(0, 0, 0);
                        var1.drawString(var18, this.cC - 5 - Font.getDefaultFont().stringWidth(var18), 3, 0);
                        var1.setColor(255, 0, 0);
                        var1.drawString(var18, this.cC - 7 - Font.getDefaultFont().stringWidth(var18), 1, 0);
                    }

                    if (this.hW || this.hV) {
                        this.k(var1);
                    }

                }
            }
        }
    }

    private final void j(Graphics var1) {
        if (this.dO.aE) {
            if (!this.ht || this.eH) {
                synchronized(var1) {
                    try {
                        this.ht = true;
                        if (this.gh != null) {
                            this.hv = this.gh.getX();
                            this.hw = this.gh.getY();
                        }

                        if (this.ie) {
                            this.g(var1);
                        } else if (this.hJ && Thread.currentThread() != this.hE) {
                            this.h(var1);
                        } else if (this._if) {
                            if (this.eA) {
                                this.a(var1);
                            } else if (!this.iq) {
                                this.b(var1);
                            } else {
                                this.c(var1);
                            }
                        } else if (this.ew == 2) {
                            this.d(var1);
                        } else if (!this.hM) {
                            this.e(var1);
                        } else if (this.ew != 0 && this.eE != 0L) {
                            this.i(var1);
                        }
                    } catch (Exception var5) {
                    }
                }

                var1.setColor(255, 255, 255);
                this.ht = false;
            }
        }
    }

    private int n(int var1) {
        if (var1 == 0) {
            return System.getProperty("microedition.locale").startsWith("zh") ? 0 : 8;
        } else if (var1 == 1) {
            return 0;
        } else {
            return var1 == 2 ? 8 : 16;
        }
    }

    public void ac() {
        f.a(this);
        b.h(this.dO);
        this.ef[0] = Font.getFont(32, this.dO.c(401) == 0 ? 0 : 1, this.n(this.dO.c(400)));
        this.ef[1] = Font.getFont(64, this.dO.c(403) == 0 ? 0 : 1, this.n(this.dO.c(402)));
        this.ef[2] = Font.getFont(64, this.dO.c(405) == 0 ? 0 : 1, this.n(this.dO.c(404)));
        this.ef[3] = Font.getFont(64, this.dO.c(407) == 0 ? 0 : 1, this.n(this.dO.c(406)));
        this.ef[4] = Font.getFont(64, (this.dO.c(409) == 0 ? 0 : 1) | 4, this.n(this.dO.c(408)));
        this.ef[5] = Font.getFont(32, this.dO.c(411) == 0 ? 0 : 1, this.n(this.dO.c(410)));
        this.ef[6] = Font.getFont(32, this.dO.c(413) == 0 ? 0 : 1, this.n(this.dO.c(412)));
        System.gc();
        this.eN = this.w(2);
        this.ew = 5;
        this.ho = this.dO.a(250);
        this.cC = this.getWidth();
        this.cp = this.getHeight();
        this.h();
    }

    public boolean a(com.elkware.midp.games.colorng.d var1, com.elkware.midp.games.colorng.d var2) {
        return var1.a(var2, false);
    }

    private void h() {
        if (this.ew != 2) {
            this.fm = null;
            System.gc();
        }

        this.hB = new Thread(this);
        this.hB.start();
    }

    public void b(j var1) {
        synchronized(this.hH) {
            this.y = 2;
            this.hC = new Thread(var1);
            this.hC.start();
        }
    }

    public void c(j var1) {
        synchronized(this.hH) {
            this.y = 1;
            this.hC = new Thread(var1);
            this.hC.start();
        }
    }

    public void a(j var1) {
        synchronized(this.hH) {
            this.y = 3;
            this.hC = new Thread(var1);
            this.hC.start();
        }
    }

    public void run() {
        if (Thread.currentThread() == this.hC) {
            switch (this.y) {
                case 1:
                    this.dO.C();
                    break;
                case 2:
                    this.dO.K();
                    break;
                case 3:
                    this.W();
            }

            this.hC = null;
        } else {
            if (Thread.currentThread() == this.hD) {
                this.dO.b(this.a(this.hn, 0), this.dW);
                this.hD = null;
                this.ar();
            } else if (Thread.currentThread() == this.hE) {
                while(Thread.currentThread() == this.hE) {
                    try {
                        if (!this.hG && System.currentTimeMillis() - this.iu > 4000L) {
                            this.iu = System.currentTimeMillis();
                            this.hG = true;
                            Thread.currentThread();
                            Thread.sleep(100L);
                        }
                    } catch (Exception var7) {
                    }
                }

                this.hE = null;
                return;
            }

            if (this.ew != 2 && this.ew != 4) {
                long var1 = 0L;
                long var3 = 0L;
                if (Thread.currentThread() == this.hB) {
                    if (this.hI) {
                        return;
                    }

                    this.hI = true;

                    while(Thread.currentThread() == this.hB) {
                        Thread var10000;
                        try {
                            var1 = System.currentTimeMillis();
                            this.a(var3);
                            this.repaint();
                            this.serviceRepaints();
                            var3 = System.currentTimeMillis() - var1;
                            if (100L - var3 > 0L) {
                                var10000 = this.hB;
                                Thread.sleep(100L - var3);
                            }
                        } catch (Exception var9) {
                            try {
                                var10000 = this.hB;
                                Thread.sleep(10L);
                            } catch (Exception var8) {
                            }
                        }
                    }

                    this.hI = false;
                }

            } else {
                this.a(0L);
                this.repaint();
                this.serviceRepaints();
            }
        }
    }

    public void ad() {
        try {
            this.a(0L);
            this.repaint();
            this.serviceRepaints();
            Thread.currentThread();
            Thread.sleep(5L);
        } catch (Exception var2) {
        }

    }

    public void o(int var1) {
        this.hJ = true;
        this.ic = var1;
        this.repaint();
        this.serviceRepaints();
        this.hJ = var1 < 100;
        this.hK = false;
    }

    private void p(int var1) {
        this.i();
        this.eG = false;
        this.ie = true;
        System.gc();
        this.cJ = this.eH = false;
        this.hm = 0L;
        this.dY = -3;
        this.dX = 0;
        if (this.gy == null) {
            this.gy = this.w(209);
        }

        this.gZ = this.gx = false;
        this.u(15);
        this.gl = new Vector();
        this.gQ = new d[50];
        this.gR = new d[50];
        this.gK = new f[50];
        this.gL = new f[50];
        this.gS = this.bK = this.gM = this.gN = 0;
        this.gj = null;
        this.gk = null;
        this.eS = null;
        this.go.clear();
        this.hW = true;
        this.hL = false;
        this.eF = this.hZ = this.ib = false;
        this.eX = 0;
        this.fw = null;
        this.fC = -1;
        this.E(this.K);
        this.E(this.fc);
        this.E(this.fd);
        this.E(this.fe);
        this.gr = null;
        this.bH = this.cC - 1;
        b.bq = 0;
        this.eI = 0;
        this.u(16);
        if (this.eR == null) {
            this.eR = this.w(164);
        }

        System.gc();
        System.gc();
        this.u(20);
        if (this.eO == null) {
            this.eO = this.w(163);
        }

        this.c();
        System.gc();
        this.u(23);
        this.gr = new b[4];

        try {
            DataInputStream var2 = new DataInputStream(this.dO.getClass().getResourceAsStream("/l" + var1 + dQ[this.ex] + ".lvl"));
            this.cW = var2.readByte();
            this.cE = var2.readByte();
            this.gj = new byte[this.cW * this.cE];
            this.gk = new byte[this.cW * this.cE];

            for(int var3 = 0; var3 < this.gk.length; ++var3) {
                this.gk[var3] = -1;
            }

            var2.read(this.gj);
            byte var21 = 0;
            int var4 = 0;
            int var5 = 0;
            int var6 = 0;
            int var7 = 0;
            int var8 = 0;
            int var9 = 0;
            int var10 = 0;

            for(int var11 = 0; var11 < this.gj.length; ++var11) {
                if (this.gj[var11] <= -20) {
                    this.gk[var11] = (byte)((this.gj[var11] - -20) * -1);
                    this.gj[var11] = 0;
                }

                var21 = this.gj[var11];
                if (var21 == -1) {
                    ++var4;
                } else if (var21 >= 53 && var21 <= 64) {
                    ++var5;
                } else if (var21 == 65) {
                    ++var8;
                } else if ((var21 < 67 || var21 > 70) && var21 != 74) {
                    if (var21 == -3) {
                        ++var10;
                    }
                } else {
                    ++var9;
                }

                if (var21 == 53) {
                    ++var6;
                }

                if (var21 >= 65 && var21 <= 79) {
                    ++var7;
                }
            }

            this.u(30);
            this.hL = var4 > 0;
            this.gn = new c[var4];
            this.ff = new int[var5];
            this.gu = new int[var6];
            this.gV = new int[var7];
            this.gW = new int[var7];
            this.gX = new int[var7];
            this.gE = new int[var8];
            this.gF = new int[var4];
            this.gG = new int[var9];
            if (var10 > 0) {
                this.fw = new int[var10];
            }

            var9 = 0;
            var10 = 0;
            var8 = 0;
            var6 = 0;
            var5 = 0;
            var4 = 0;

            int var12;
            for(var12 = 0; var12 < this.gj.length; ++var12) {
                byte var23 = this.gj[var12];
                if (var23 != 0) {
                    if (var23 == -1) {
                        this.gn[var4] = new c(var2.readByte(), var2.readByte(), var2.readByte(), var2.readByte(), var2.readByte(), var2.readByte(), var2.readByte(), this, var12);
                        this.gF[var4] = var12;
                        this.go.put(new Integer(var12), this.gn[var4++]);
                        this.gj[var12] = 71;
                    } else if (var23 == -2) {
                        this.gj[var12] = 0;
                    } else if (var23 >= 53 && var23 <= 64) {
                        this.ff[var5++] = var12;
                    } else if (var23 == 65) {
                        this.gE[var8++] = var12;
                    } else if ((var23 < 67 || var23 > 70) && var21 != 74) {
                        if (var23 == -3) {
                            this.fw[var10++] = var12;
                            this.gj[var12] = 0;
                        }
                    } else {
                        this.gG[var9++] = var12;
                    }

                    if (var23 == 53) {
                        this.gu[var6++] = var12;
                    }
                }
            }

            this.u(40);
            this.gH = var2.readByte();
            this.u(45);
            this.gC = new byte[this.gH][this.gH];
            this.gB = new int[this.gH];

            for(var12 = 0; var12 < this.gH; ++var12) {
                this.gB[var12] = var2.readByte() + var2.readByte() * this.cW;
            }

            byte var24 = var2.readByte();

            int var13;
            for(var13 = 0; var13 < var24; ++var13) {
                this.gC[var2.readByte()][var2.readByte()] = var2.readByte();
            }

            for(var13 = this.cW; var13 < this.gk.length; ++var13) {
                if (this.gj[var13] > 0) {
                    this.gk[var13] = this.gk[var13 - this.cW];
                }
            }

            this.u(50);

            int var14;
            try {
                byte var25 = var2.readByte();
                this.u(55);

                for(var14 = 0; var14 < var25; ++var14) {
                    this.gn[var2.readByte()].a(var2.readByte(), var2.readByte());
                }

                this.u(65);
            } catch (Exception var19) {
            }

            var2.close();
            this.gD = new byte[this.gH][];
            this.gI = new boolean[this.gH][this.gH];

            for(var13 = 0; var13 < this.gH; ++var13) {
                var14 = 0;

                int var16;
                for(var16 = 0; var16 < this.gH; ++var16) {
                    if (this.gC[var16][var13] > 0) {
                        ++var14;
                    }
                }

                byte[] var15 = new byte[var14];
                var14 = 0;

                for(var16 = 0; var16 < this.gH; ++var16) {
                    if (this.gC[var16][var13] > 0) {
                        var15[var14++] = (byte)var16;
                    }
                }

                this.gD[var13] = var15;
            }

            this.u(70);
            this.gh = new com.elkware.midp.games.colorng.a(this.cW, this.cE, this.eR, 15, 15, this.gj);
            this.u(75);
            this.fz = 10000;
            this.fA = 0;
            if (this.fw != null) {
                for(var13 = 0; var13 < this.fw.length; ++var13) {
                    this.fz = Math.min(this.fz, this.fw[var13] % this.cW * 15 + 7);
                    this.fA = Math.max(this.fA, this.fw[var13] % this.cW * 15 + 7);
                    this.bx = this.fw[var13] / this.cW * 15 + 15;
                    this.gh.setCell(this.fw[var13] % this.cW, this.fw[var13] / this.cW + 1, 80);
                }
            }

            this.u(80);
            this.gr[0] = new b(new com.elkware.midp.games.colorng.d(this.fa[this.dU[0]], 18, 18), new com.elkware.midp.games.colorng.d(this.fb[this.dU[1]], 18, 23), 50, 20, this.dU[2] * 5 + 20, (this.dU[3] / 2 + 3) * this.eb / this.cy, (this.dU[4] / 2 + 5) * this.eb / this.cy * 3 / 4, (this.dU[5] / 3 + 1) * this.eb / this.cy);
            this.gs = this.gr[0];
            this.u(83);

            for(var13 = 1; var13 < 4; ++var13) {
                if (this.eL[var13] == 4) {
                    this.eL[var13] = 5;
                }

                if (this.eA && this.gz != null) {
                    try {
                        byte var27 = 4;
                        int var26 = this.gA[var13 - 1] / 10 + 2;
                        this.gr[var13] = new b(new com.elkware.midp.games.colorng.d(this.fa[this.gt[this.eL[var13] - 1][0] - 1], 18, 18), new com.elkware.midp.games.colorng.d(this.fb[this.gt[this.eL[var13] - 1][1] - 1], 18, 23), 10, 10, this.gt[this.eL[var13] - 1][2] > 0 ? this.gt[this.eL[var13] - 1][2] : 256 + this.gt[this.eL[var13] - 1][2], this.gt[this.eL[var13] - 1][3] * this.eb / this.cy * var26 / var27, this.gt[this.eL[var13] - 1][4] * this.eb / this.cy * 3 / 4 * var26 / var27, this.gt[this.eL[var13] - 1][5] * this.eb / this.cy * var26 / var27);
                    } catch (Exception var17) {
                    }

                    this.gr[var13].a(this.gt[this.eL[var13] - 1][6], 2, 3);
                    this.gr[var13].bM = 0;
                } else {
                    try {
                        this.gr[var13] = new b(new com.elkware.midp.games.colorng.d(this.fa[this.gt[this.eL[var13] - 1][0] - 1], 18, 18), new com.elkware.midp.games.colorng.d(this.fb[this.gt[this.eL[var13] - 1][1] - 1], 18, 23), 10, 10, this.gt[this.eL[var13] - 1][2] > 0 ? this.gt[this.eL[var13] - 1][2] : 256 + this.gt[this.eL[var13] - 1][2], this.gt[this.eL[var13] - 1][3] * this.eb / this.cy, this.gt[this.eL[var13] - 1][4] * this.eb / this.cy * 3 / 4, this.gt[this.eL[var13] - 1][5] * this.eb / this.cy);
                    } catch (Exception var18) {
                    }

                    this.gr[var13].a(this.gt[this.eL[var13] - 1][6], this.gt[this.eL[var13] - 1][7], this.gt[this.eL[var13] - 1][8]);
                    this.gr[var13].bM = 0;
                }
            }

            this.fk = this.cW * 15 / (this.eO.getWidth() - this.cC);
            this.fl = this.cE * 15 / (this.eO.getHeight() - this.cp);
        } catch (Exception var20) {
        }

        this.u(90);
        this.fx = this.fy = -1;
        this.eD = -1L;
        boolean var22 = this.ea[3];
        if (this.ex == 1) {
            this.eD = 120000L * (long)(var22 ? 2 : 1);
        } else if (this.ex == 2) {
            this.fx = 4 + (var22 ? 2 : 1) * 4;
        } else if (this.ex == 3) {
            this.eD = (long)(150000 * (var22 ? 2 : 1));
        } else if (this.ex == 4) {
            this.eD = 120000L * (long)(var22 ? 2 : 1);
            System.gc();
            if (this.eU == null) {
                this.eU = this.w(171);
            }
        } else if (this.ex == 5) {
            this.fy = 5;
        }

        this.u(100);
        this.ae();
        this.eG = true;
        this.hm = 0L;
        this.ie = false;
        this.eE = this.fB = System.currentTimeMillis();
        System.gc();
    }

    public void a(int var1, int var2, int var3, boolean var4) {
        if (com.elkware.midp.games.colorng.arena.high.a.P) {
            super.iH.f = true;
            super.iH.c = true;
            this.hO.a(var1, var2, var3, var4);
        }
    }

    public void q(int var1) {
        if (com.elkware.midp.games.colorng.arena.high.a.P) {
            this.hO.l(var1);
        }

    }

    public void ae() {
        if (com.elkware.midp.games.colorng.arena.high.a.P) {
            this.hO.G();
        }

    }

    private void x() {
        int var1 = this.cC / 2 - this.gr[0].br;
        int var2 = Math.max(Math.min(var1, 0), this.cC - this.cW * 15);
        int var3 = Math.max(Math.min(this.cp / 3 - this.gr[0].bs, 0), this.cp - this.cE * 15);
        this.gh.setPosition(var2, var3);
    }

    public void w() {
        if (!this.hM && this.hB == Thread.currentThread()) {
            this.a(true);
            this.aq();
            this.bm = 20;
            this.id = false;
            this.t(0);
            this.ap();
            this.c();

            try {
                this.hO = new k(super.iH);
                this.hO.start();
            } catch (IOException var23) {
            }

            if (com.elkware.midp.games.colorng.arena.high.a.P) {
                for(int var1 = 0; var1 < 8; ++var1) {
                }
            }

            System.gc();
            this.t(10);
            System.gc();
            this.eO = this.w(163);
            this.t(15);
            System.gc();
            this.t(20);
            this.t(30);
            this.ag();
            System.gc();
            this.t(35);
            this.ee = (byte)this.dO.c(417);
            this.ec = (byte)this.dO.c(470);
            this.ed = (byte)this.dO.c(471);
            this.eb = (byte)this.dO.c(418);
            this.cy = (byte)this.dO.c(419);
            this.fc = this.aG();
            this.fd = this.aG();
            this.fe = this.aG();
            this.t(55);
            System.gc();
            this.eV = this.w(166);
            this.eW = this.w(169);
            this.t(60);
            String[] var29 = null;
            int[][] var2 = (int[][])null;
            RecordStore var3 = null;

            int var5;
            int var7;
            int var8;
            int var9;
            try {
                var3 = RecordStore.openRecordStore(this.dP[5], false);
                this.br = 0;
                if (var3 != null) {
                    this.br = var3.getNumRecords();
                    var29 = new String[this.br];
                    var2 = new int[this.br][9];
                    RecordEnumeration var4 = var3.enumerateRecords((RecordFilter)null, (RecordComparator)null, false);

                    for(var5 = 0; var5 < this.br; ++var5) {
                        byte[] var6 = var4.nextRecord();
                        var7 = this.br - var5 - 1;
                        var29[var7] = "";

                        for(var8 = 1; var8 < 1 + var6[0]; ++var8) {
                            var29[var7] = var29[var7] + (char)var6[var8];
                        }

                        var8 = 0;

                        for(var9 = var29[var7].length() + 1; var9 < var6.length; ++var9) {
                            var2[var7][var8++] = var6[var9];
                        }
                    }
                }

                var3 = null;
                System.gc();
            } catch (Exception var27) {
                this.br = 0;
            } finally {
                if (var3 != null) {
                    try {
                        var3.closeRecordStore();
                    } catch (RecordStoreException var22) {
                    }
                }

            }

            byte var32;
            DataInputStream var30;
            try {
                var32 = 0;
                Image[] var33 = null;
                var30 = this.dO.c(this.dP[4]);
                if (var30 != null) {
                    var32 = var30.readByte();
                    var33 = new Image[var32];

                    for(var7 = 0; var7 < var32; ++var7) {
                        var33[var7] = Image.createImage(18, 18);

                        for(var8 = 0; var8 < 18; ++var8) {
                            for(var9 = 0; var9 < 18; ++var9) {
                                int var10 = 255 & var30.readByte() | (255 & var30.readByte()) << 8 | (255 & var30.readByte()) << 16;
                                if (var10 == 7799014) {
                                    var10 &= 16777215;
                                } else {
                                    var10 |= -16777216;
                                }

                                com.siemens.mp.lcdui.Image.setPixelColor(var33[var7], var8, var9, var10);
                            }
                        }
                    }
                }

                if (var30 != null) {
                    var30.close();
                }

                this.fa = new Image[4 + var32];
                System.gc();

                for(var7 = 0; var7 < 4; ++var7) {
                    this.fa[var7] = this.w(177 + var7);
                }

                for(var7 = 0; var7 < var32; ++var7) {
                    this.fa[4 + var7] = this.b(var33[var7]);
                }
            } catch (Exception var26) {
            }

            this.t(70);
            this.fb = new Image[4];
            System.gc();

            for(int var31 = 0; var31 < 4; ++var31) {
                this.fb[var31] = this.w(16 + var31);
            }

            this.t(80);
            var30 = this.dO.c(this.dP[0]);
            if (var30 == null) {
                this.b(true);
            } else {
                try {
                    this.dW = var30.readUTF();

                    for(var5 = 0; var5 < this.dU.length; ++var5) {
                        this.dU[var5] = var30.readInt();
                    }

                    var30.close();
                } catch (Exception var25) {
                }
            }

            this.t(90);
            var32 = 0;

            int var34;
            try {
                var30 = new DataInputStream(this.dO.getClass().getResourceAsStream("/warrior.dat"));
                var32 = var30.readByte();
                this.gt = new byte[var32 + this.br][9];

                for(var34 = 0; var34 < var32; ++var34) {
                    for(var7 = 0; var7 < 9; ++var7) {
                        this.gt[var34][var7] = var30.readByte();
                        if (var7 == 1 && (this.gt[var34][var7] < 1 || this.gt[var34][var7] > 4)) {
                            this.gt[var34][var7] = 1;
                        }
                    }
                }

                var30.close();
            } catch (Exception var24) {
            }

            if (var2 != null) {
                for(var34 = 0; var34 < this.br; ++var34) {
                    for(var7 = 0; var7 < 9; ++var7) {
                        this.gt[var34 + var32][var7] = (byte)var2[var34][var7];
                    }
                }
            }

            this.t(95);
            this.eK = new String[this.bm + 1 + this.br];
            this.eK[0] = this.dW;

            for(var34 = 0; var34 < this.bm; ++var34) {
                this.eK[var34 + 1] = this.dO.a(500 + var34);
            }

            if (var29 != null) {
                for(var34 = 0; var34 < this.br; ++var34) {
                    this.eK[this.bm + var34 + 1] = var29[var34];
                }
            }

            this.bm += this.br;
            this.eT = this.w(168);
            this.t(100);
            this.dO.H();
            this.as();
            this.hM = true;
            this.af();
            this.i();
            System.gc();
            com.elkware.midp.games.a.h();
        }
    }

    public void c(long var1) {
        super.c(var1);
        this.fv = (long)(this.aX = this.ft = this.fu = 0);
        this.fv = 0L;
        this.ep = this.hP = this.hQ = false;
    }

    public void af() {
        if (this.cN) {
            this.a(0, 64, 1, true);
        }

        System.gc();
        this.ew = 0;
        this.eI = 0;
        this.eG = false;
        this.eF = true;
        this.dO.aJ = true;
        this.ag();
        this.hZ = false;
        this.hB = null;
        System.gc();
        this._if = false;
        this.iq = false;
        this.hJ = false;
        this.ez = false;
        this.eA = false;
        this.dO.l(10);
    }

    private void ag() {
        this.hj = false;
        this.eE = 0L;
        b.bq = 0;
        System.gc();
        this.bH = this.cC;
        this.eG = false;
    }

    public void keyPressed(int var1) {
        boolean var2 = true;
        boolean var3 = true;
        if (!this.ie && !this.hJ) {
            if (this.ez && this.eF && this.iq) {
                this.af();
                this.dO.x();
            } else {
                if (this.ew == 2) {
                    if (this.eh && !this.dO.aY && this.hR) {
                        if (var1 == -4) {
                            this.hR = false;
                            this.dO.D();
                            return;
                        }

                        if (var1 == -12) {
                            this.hR = false;
                            this.dO.B();
                            return;
                        }

                        return;
                    }

                    if (this.aJ) {
                        switch (var1) {
                            case -12:
                                this.dO.y();
                                return;
                            case -4:
                                this.dO.w();
                                return;
                        }
                    } else {
                        switch (var1) {
                            case -12:
                                this.af();
                                this.dO.x();
                                return;
                            case -4:
                                this.dO.v();
                                return;
                        }
                    }
                } else if (this.ew == 1) {
                    if (this.ez) {
                        if (!this.eG && this.eF && !this._if) {
                            this.r(var1);
                            return;
                        }
                    } else if (this.eA) {
                        if (!this.eG && this.eF && !this._if) {
                            this.r(var1);
                            return;
                        }

                        if (!this.eG && var1 == -4) {
                            this.dO.G();
                            return;
                        }

                        if (!this.eG && var1 == -12) {
                            this.dO.A();
                            return;
                        }
                    } else if (this.eF) {
                        this.r(var1);
                        return;
                    }

                    if (var1 == -4 || var1 == -12) {
                        if (this.ez) {
                            if (!this.eG) {
                                if (this.eF && !this._if) {
                                    return;
                                }

                                if (var1 == -4) {
                                    this.dO.F();
                                } else {
                                    this.dO.z();
                                }

                                return;
                            }

                            if (this.hZ) {
                                this.dO.aJ = true;
                                this.dO.l(10);
                                return;
                            }

                            this.ah();
                            return;
                        }

                        if (!this.eA) {
                            if (!this.hZ) {
                                this.ah();
                                return;
                            }

                            this.dO.aJ = true;
                            this.dO.l(10);
                            return;
                        }

                        if (!this.eG) {
                            this.dO.G();
                            return;
                        }

                        if (this.hA) {
                            this.dO.aJ = true;
                            this.dO.l(10);
                            return;
                        }

                        if (!this.hZ) {
                            this.ah();
                            return;
                        }
                    }
                }

                this.r(var1);
            }
        }
    }

    private void r(int var1) {
        this.hP = var1 == -59;
        this.hQ = var1 == -60;
        if (!this.ep) {
            this.ep = true;
            this.hT = 0;
        } else {
            --this.hT;
        }

        super.keyPressed(var1);
        if (this.hQ && this.aJ) {
            this.ad();
        }

    }

    public void d(long var1) {
        super.d(var1);

        try {
            if (!this.ep) {
                this.ep = true;
                this.hT = 0;
            } else {
                --this.hT;
            }

            this.iv = true;
            if (this.iq && this.hu < -9) {
                this.hu = -9;
            }

            this.fv = var1;
            if ((this.fv & 2L) > 0L) {
                this.aX = 3;
                this.ft = 1;
            }

            if ((this.fv & 32L) > 0L) {
                this.fu = 5;
            }

            if ((this.fv & 8L) > 0L) {
                this.aX = 3;
                this.ft = 2;
            }

            if ((this.fv & 128L) > 0L) {
                this.aX = 4;
                this.ft = 1;
                this.fu = 5;
            }

            if ((this.fv & 512L) > 0L) {
                this.aX = 4;
                this.ft = 2;
                this.fu = 5;
            }

            if ((this.fv & 65536L) > 0L) {
                this.ft = 1;
            }

            if ((this.fv & 1048576L) > 0L) {
                this.fu = 5;
            }

            if ((this.fv & 131072L) > 0L) {
                this.ft = 2;
            }

            if ((this.fv & 262144L) > 0L || this.hP) {
                this.aX = 3;
                this.hP = false;
            }

            if ((this.fv & 524288L) > 0L || this.hQ) {
                this.aX = 4;
                this.hQ = false;
            }

            if ((this.fv & 1L) > 0L) {
                this.fu = 6;
            }
        } catch (Exception var10) {
        }

        if (this.ew == 2 || this.ew == 4) {
            this.ad();
        }

        if (this.eI > 10 && this.eS == null) {
            if ((this.ez || this.eA) && this.ez) {
                this.hU = true;
            }

            this.eI = 0;
            this.hS = new int[this.gr.length];

            int var3;
            for(var3 = 0; var3 < this.hS.length; this.hS[var3] = var3++) {
            }

            int var4;
            int var5;
            for(var3 = 0; var3 < this.hS.length - 1; ++var3) {
                for(var4 = var3 + 1; var4 < this.hS.length; ++var4) {
                    if (this.gr[this.hS[var3]].bM < this.gr[this.hS[var4]].bM) {
                        var5 = this.hS[var4];
                        this.hS[var4] = this.hS[var3];
                        this.hS[var3] = var5;
                    }
                }
            }

            if (!this.ez) {
                for(var3 = 0; var3 < this.hS.length; ++var3) {
                    if (this.gr[this.hS[var3]] == this.gs) {
                        this.s(Math.max(0, 3 - var3 * 2));
                    }
                }
            } else if (this.ez) {
                if (this.ii > 1) {
                    this.s(1);
                }

                if (this.ij.length == 4) {
                    for(var3 = 0; var3 < this.hS.length; ++var3) {
                        if (this.gr[this.hS[var3]] == this.gs) {
                            this.s(Math.max(0, 15 - var3 * 5));
                        }
                    }
                }
            }

            try {
                System.gc();
                this.eS = Image.createImage(this.cC, this.getHeight());
                Graphics var11 = this.eS.getGraphics();
                var11.setClip(0, 0, this.cC, this.cp);
                var11.drawImage(this.eT, 0, 0, 0);
                var11.drawImage(this.hN, (this.cC - this.hN.getWidth()) / 2, 15, 0);
                var11.setFont(this.ef[1]);
                if (this.ex != 5) {
                    for(var4 = 0; var4 < this.hS.length; ++var4) {
                        if (this.eL[this.hS[var4]] == 0) {
                            var11.setColor(255, 50, 50);
                        } else {
                            var11.setColor(230, 230, 230);
                        }

                        var11.setClip(8, 28 + var4 * 20, 18, 18);

                        try {
                            var5 = this.hS[var4];
                            var11.drawImage(var5 != 0 ? this.fa[this.gt[this.eL[var5] - 1][0] - 1] : this.fa[this.dU[0]], 8, 28 + var4 * 20, 0);
                        } catch (Exception var8) {
                        }

                        this.a(var11, var4 + 1 + ". " + this.eK[this.eL[this.hS[var4]]], 25, 31 + var4 * 20, 70);
                        this.a(var11, (this.gr[this.hS[var4]].bM < 10 ? "0" : "") + this.gr[this.hS[var4]].bM, this.cC - 20, 31 + var4 * 20, 15);
                    }
                } else {
                    var4 = this.gs.bM * (this.gA != null ? this.gA[0] / 5 + 5 : 5) / 5;
                    var11.setColor(0, 0, 0);
                    var11.drawString(this.a(295) + " " + var4, 19, 31, 0);
                    var11.setColor(200, 200, 200);
                    var11.drawString(this.a(295) + " " + var4, 20, 32, 0);
                    this.e();
                    if (this.hn != null) {
                        var5 = this.a(this.hn, 0);
                    } else {
                        var5 = 0;
                    }

                    if (var4 > var5) {
                        this.a(var4, this.gz, this.gA);
                    }

                    RecordStore var6 = RecordStore.openRecordStore(this.dP[7], true);
                    RecordEnumeration var7 = var6.enumerateRecords((RecordFilter)null, (RecordComparator)null, false);
                    if (var7.numRecords() > 0) {
                        var11.setColor(0, 0, 0);
                        this.a(var11, this.a(1) + ": " + var5, 19, 49, this.cC - 36);
                        if (var5 >= this.gs.bM) {
                            var11.setColor(250, 150, 150);
                        } else {
                            var11.setColor(150, 250, 150);
                        }

                        this.a(var11, this.a(1) + ": " + var5, 20, 50, this.cC - 36);
                    } else {
                        var11.setColor(0, 0, 0);
                        var11.setFont(this.ef[0]);
                        var11.drawString(super.iH.a(287), 15, 44, 0);
                        var11.setColor(200, 200, 200);
                        var11.drawString(super.iH.a(287), 16, 45, 0);
                    }

                    var6.closeRecordStore();
                }
            } catch (Exception var9) {
            }
        } else if (this.eF && this.eS != null && this.eI > 10) {
            if (this.eA) {
                this.hl = true;
            }

            System.gc();
            if (!this.ez && !this.eA) {
                if (this.ew != 2) {
                    this.af();
                }
            } else {
                this._if = true;
                if (this.ez && this.hU) {
                    this.hU = false;
                    this.a(this.hS);
                }

                this.ag();
            }

            this.eI = 0;
        }

    }

    private final void k(Graphics var1) {
        var1.setClip(0, this.cp, this.cC, 20);
        var1.drawImage(this.fg, 0, this.cp, 0);
        int var2 = this.fi.getWidth() / 3 * this.gs.bS / this.gs.bP;
        int var3 = var2 * 3;
        if (var2 > 0) {
            var1.setClip(hY, this.cp + 3, var3, this.fi.getHeight());
            var1.drawImage(this.fi, hY, this.cp + 3, 0);
        }

        this.hV = var2 != this.cY;
        if (var2 < this.cY) {
            this.hX = (this.cY - var2) * 3;
            var1.setClip(hY + var3, this.cp + 3, this.hX, this.fi.getHeight());
            var1.drawImage(this.fj, hY + var3, this.cp + 3, 0);
            --this.cY;
        } else {
            this.cY = var2;
        }

        this.hW = false;
    }

    public void ah() {
        if (!this.hZ) {
            this.hZ = true;
            this.dO.l(10);
            this.ia = System.currentTimeMillis();

            try {
                Thread.sleep(10L);
            } catch (Exception var2) {
            }

            this.hB = null;
            this.hm = 0L;
            if (this.cN) {
                this.a(0, 67, 10, true);
            }

        }
    }

    public void showNotify() {
        if (!this.dO.aD) {
            super.showNotify();
        }
    }

    public void hideNotify() {
        if (!this.dO.aD) {
            super.hideNotify();
            if (this.ew == 1 && this.hj && this.hm > 6L && !this.hZ) {
                this.ah();
            }

        }
    }

    public void ai() {
        this.hA = false;
        System.gc();
        this.eE += System.currentTimeMillis() - this.ia;
        this.hZ = false;
        this.dO.aJ = true;
        this.hm = 0L;
        this.hW = this.ih = true;
        this._if = false;
        this.iq = false;
        System.gc();
        this.dO.l(13);
        this.ae();
        if (!this.gY && this.cN) {
        }

    }

    public void a(int var1, int var2, int var3) {
        if (this.gN == 0) {
            this.gK[this.gM] = new f(var1, var2, var3, this);
        } else {
            this.gK[this.gM] = this.gL[--this.gN];
            this.gL[this.gN] = null;
            this.gK[this.gM].a(var1, var2, var3, this);
        }

        ++this.gM;
    }

    public void aj() {
        try {
            this.eK[0] = this.dW;
            ByteArrayOutputStream var1 = new ByteArrayOutputStream();
            DataOutputStream var2 = new DataOutputStream(var1);
            var2.writeUTF(this.dW);

            for(int var3 = 0; var3 < this.dU.length; ++var3) {
                var2.writeInt(this.dU[var3]);
            }

            this.dO.a(this.dP[0], var1.toByteArray());
            var2.close();
            if (this.eg) {
                var1 = new ByteArrayOutputStream();
                DataOutputStream var5 = new DataOutputStream(var1);
                var5.writeByte(0);
                this.dO.a(this.dP[1], var1.toByteArray());
                var5.close();
            }
        } catch (Exception var4) {
        }

    }

    public void b(boolean var1) {
        try {
            this.dW = this.a(525);

            for(int var2 = 0; var2 < this.dU.length; ++var2) {
                this.dU[var2] = 10;
            }

            this.dU[0] = 1;
            this.dU[1] = 1;
            this.dU[6] = 0;
            this.dU[8] = 0;
            this.dU[7] = 1;
            if (var1) {
                ByteArrayOutputStream var6 = new ByteArrayOutputStream();
                DataOutputStream var3 = new DataOutputStream(var6);
                var3.writeUTF(this.dW);

                for(int var4 = 0; var4 < this.dU.length; ++var4) {
                    var3.writeInt(this.dU[var4]);
                }

                this.dO.a(this.dP[0], var6.toByteArray());
                var3.close();
            }
        } catch (Exception var5) {
        }

    }

    public void s() {
        int var1 = 39 + this.dU[7];

        for(int var2 = 0; var2 < 4; ++var2) {
            var1 -= this.dU[2 + var2];
        }

        this.dU[8] = var1;
    }

    public void ak() {
        DataInputStream var1 = this.dO.c(this.dP[0]);
        if (var1 == null) {
            this.b(true);
        } else {
            try {
                this.dW = var1.readUTF();

                for(int var2 = 0; var2 < this.dU.length; ++var2) {
                    this.dU[var2] = var1.readInt();
                }

                var1.close();
            } catch (Exception var3) {
            }
        }

    }

    private void s(int var1) {
        if (!this.ib) {
            int[] var10000 = this.dU;
            var10000[6] += var1;
            if (this.dU[6] >= this.dU[7] * 5) {
                var10000 = this.dU;
                var10000[6] -= this.dU[7] * 5;
                int var10002 = this.dU[7]++;
            }

            this.ib = true;
        }
    }

    private void t(int var1) {
        this.id = true;
        this.ic = var1;
        this.repaint();
        this.serviceRepaints();
    }

    private void u(int var1) {
        this.i();
        this.iv = true;
        this.ic = var1;
        this.repaint();
        this.serviceRepaints();
    }

    private void al() {
        this.hK = true;
        if (this.ih) {
            this.ih = false;
        } else {
            this.o(10);
            this.iq = false;
            if (this.ig) {
                this.o(20);
                this.ii = 1;
                this.im = this.ex;
                this.ij = new int[this.bm + 1];
                this.ik = new int[this.bm + 1];
                this.il = new String[this.eK.length];
                this.o(50);

                for(int var1 = 0; var1 < this.ij.length; ++var1) {
                    this.ij[var1] = var1;
                    this.il[var1] = this.eK[var1];
                }

                this.o(80);
                this.an();
            } else {
                this.o(20);
                this.B();
                this.o(70);
            }

            this.o(100);
            this.ar();
            this._if = true;
        }
    }

    private void C() {
        this.hB = null;
        System.gc();
        this.o(20);
        this.hK = true;
        this.eQ = this.w(210);
        this.o(50);
        if (this.ih) {
            this.ih = false;
        } else {
            this.e();
            this.o(80);
            this.o(100);
            this.ar();
            this._if = true;
        }
    }

    public void e() {
        RecordStore var1 = null;

        try {
            var1 = RecordStore.openRecordStore(this.dP[7], true);
            RecordEnumeration var2 = var1.enumerateRecords((RecordFilter)null, (RecordComparator)null, false);
            this.hn = var2.nextRecord();
            this.aa();
        } catch (Exception var12) {
        } finally {
            if (var1 != null) {
                try {
                    var1.closeRecordStore();
                } catch (Exception var11) {
                }
            }

        }

    }

    public void a(int var1, String[] var2, int[] var3) {
        byte[] var4 = new byte[4];
        if (var2 != null) {
            var4 = new byte[15 + var2[0].length() + var2[1].length() + var2[2].length()];

            int var5;
            for(var5 = 0; var5 < 3; ++var5) {
                var4[3 + var5] = (byte)var2[var5].length();
            }

            for(var5 = 0; var5 < 3; ++var5) {
                System.arraycopy(this.v(var3[var5]), 0, var4, (var5 + 2) * 3, 3);
            }

            var5 = 0;

            for(int var6 = 0; var6 < 3; ++var6) {
                System.arraycopy(var2[var6].getBytes(), 0, var4, 15 + var5, var2[var6].length());
                var5 += var2[var6].length();
            }
        }

        System.arraycopy(this.v(var1), 0, var4, 0, 3);
        RecordStore var19 = null;

        try {
            var19 = RecordStore.openRecordStore(this.dP[7], true);
            RecordEnumeration var18 = var19.enumerateRecords((RecordFilter)null, (RecordComparator)null, false);
            var18.destroy();
            var19.addRecord(var4, 0, var4.length);
        } catch (Exception var16) {
        } finally {
            if (var19 != null) {
                try {
                    var19.closeRecordStore();
                } catch (Exception var15) {
                }
            }

        }

    }

    private final void am() {
        if (!this.gx) {
            if (Thread.currentThread() == this.hB) {
                this.gx = true;
                this.cs = 0;
                this.io = new int[4];
                boolean[] var1 = new boolean[this.ij.length];
                this.io[0] = 0;
                var1[0] = true;
                boolean var2 = false;

                int var3;
                int var11;
                try {
                    for(var3 = 1; var3 < this.io.length; ++var3) {
                        do {
                            var11 = b.m(this.ij.length);
                        } while(var1[var11]);

                        this.io[var3] = var11;
                        var1[var11] = true;
                    }
                } catch (Exception var10) {
                }

                int[] var10000;
                for(var3 = 0; var3 < (this.ij.length - 4) / 4; ++var3) {
                    int[] var4 = new int[4];

                    for(int var5 = 0; var5 < 4; ++var5) {
                        do {
                            var11 = b.m(this.ij.length);
                        } while(var1[var11]);

                        var4[var5] = var11;
                        var1[var11] = true;
                    }

                    int[] var12 = new int[4];

                    int var6;
                    try {
                        for(var6 = 0; var6 < 4; ++var6) {
                            var12[var6] = b.m(15) + this.gt[var4[var6] - 1][2] / 10 + this.gt[var4[var6] - 1][3] + this.gt[var4[var6] - 1][4] + this.gt[var4[var6] - 1][5];
                        }
                    } catch (Exception var9) {
                    }

                    for(var6 = 0; var6 < 3; ++var6) {
                        for(int var7 = var6 + 1; var7 < 4; ++var7) {
                            if (var12[var7] > var12[var6]) {
                                int var8 = var12[var7];
                                var12[var7] = var12[var6];
                                var12[var6] = var8;
                                var8 = var4[var7];
                                var4[var7] = var4[var6];
                                var4[var6] = var8;
                            }
                        }
                    }

                    this.ip = this.ii + 2;

                    for(var6 = 0; var6 < 4; ++var6) {
                        var10000 = this.ik;
                        var10000[var4[var6]] += this.ip - var6;
                    }
                }

                for(var3 = 0; var3 < this.ij.length; ++var3) {
                    if (!var1[var3]) {
                        var10000 = this.ik;
                        var10000[var3] += this.ip / 2;
                    }
                }

            }
        }
    }

    private void a(int[] var1) {
        this.ip = this.ii + 2;
        ++this.ii;

        int var2;
        int var3;
        for(var2 = 0; var2 < var1.length; ++var2) {
            for(var3 = 0; var3 < this.io.length; ++var3) {
                if (var1[var2] == this.gr[var3].bT) {
                    int[] var10000 = this.ik;
                    int var10001 = this.io[var1[var2]];
                    var10000[var10001] += this.ip - var2;
                }
            }
        }

        for(var2 = 0; var2 < this.ij.length - 1; ++var2) {
            for(var3 = var2 + 1; var3 < this.ij.length; ++var3) {
                if (this.ik[this.ij[var2]] < this.ik[this.ij[var3]]) {
                    int var4 = this.ij[var2];
                    this.ij[var2] = this.ij[var3];
                    this.ij[var3] = var4;
                }
            }
        }

        this.G();
        this.repaint();
        this.serviceRepaints();
        this.an();
    }

    private void G() {
        int var1;
        if (this.ii > 2 && this.ij.length > 4) {
            var1 = 2;
            if (this.ij.length > 18) {
                var1 = this.ij.length - 18;
            }

            this.iq = false;

            for(int var2 = 0; var2 < var1; ++var2) {
                this.iq = this.iq || this.ij[this.ij.length - 1 - var2] == 0;
            }

            if (this.iq) {
                return;
            }

            int[] var4 = new int[Math.max(4, this.ij.length - var1)];

            for(int var3 = 0; var3 < var4.length; ++var3) {
                var4[var3] = this.ij[var3];
            }

            this.ij = var4;
            System.gc();
        } else if (this.ij.length == 4) {
            for(var1 = 0; var1 < this.hS.length; ++var1) {
                if (this.hS[var1] == 0) {
                    this.ir = var1 + 1;
                }
            }

            this.iq = true;
            this.hu = -20;
        }

    }

    private void an() {
        try {
            ByteArrayOutputStream var1 = new ByteArrayOutputStream();
            DataOutputStream var2 = new DataOutputStream(var1);
            var2.writeByte(this.iq ? 0 : 1);
            if (!this.iq) {
                var2.writeByte(this.ii);
                var2.writeByte(this.im);
                var2.writeByte(this.ij.length);

                int var3;
                for(var3 = 0; var3 < this.ij.length; ++var3) {
                    var2.writeByte(this.ij[var3]);
                }

                var2.writeByte(this.ik.length);

                for(var3 = 0; var3 < this.ik.length; ++var3) {
                    var2.writeByte(this.ik[var3]);
                }
            }

            this.dO.a(this.dP[1], var1.toByteArray());
            var2.close();
        } catch (Exception var4) {
        }

    }

    private void B() {
        try {
            DataInputStream var1 = this.dO.c(this.dP[1]);
            var1.readByte();
            this.ii = var1.readByte();
            this.im = var1.readByte();
            byte var2 = var1.readByte();
            this.ij = new int[var2];

            for(int var3 = 0; var3 < var2; ++var3) {
                this.ij[var3] = var1.readByte();
            }

            byte var6 = var1.readByte();
            this.ik = new int[var6];

            int var4;
            for(var4 = 0; var4 < var6; ++var4) {
                this.ik[var4] = var1.readByte();
            }

            this.il = new String[var6];
            this.il[0] = this.dW;

            for(var4 = 1; var4 < var6; ++var4) {
                this.il[var4] = this.eK[var4];
            }

            var1.close();
        } catch (Exception var5) {
        }

        this.iq = false;
        this.ex = this.im;
    }

    public boolean ao() {
        boolean var1 = false;

        try {
            DataInputStream var2 = this.dO.c(this.dP[1]);
            var1 = var2 != null && var2.readByte() == 1;
            var2.close();
        } catch (Exception var3) {
        }

        return var1;
    }

    private void H() {
        this.ea = new boolean[5];

        for(int var1 = 0; var1 < 3; ++var1) {
            this.ea[var1] = true;
        }

        this.z();
    }

    public void ap() {
        try {
            String var1 = this.dO.a(this.dP[2]);
            if (var1 == null) {
                this.H();
            } else {
                for(int var2 = 0; var2 < 5; ++var2) {
                    char var3 = var1.charAt(var2);
                    if (var3 != '1' && var3 != '0') {
                        this.H();
                        break;
                    }

                    this.ea[var2] = var3 == '1';
                }
            }
        } catch (Exception var4) {
        }

        this.a(this.ea[1]);
    }

    public void z() {
        try {
            StringBuffer var1 = new StringBuffer();

            for(int var2 = 0; var2 < 5; ++var2) {
                if (this.ea[var2]) {
                    var1.append('1');
                } else {
                    var1.append('0');
                }
            }

            this.dO.a(this.dP[2], var1.toString(), true);
        } catch (Exception var3) {
        }

        this.c();
    }

    private void c() {
        this.gY = !this.ea[4] && this.ea[0];
        this.cN = this.ea[4] || this.ea[0];
    }

    public void a(Image var1) {
        Image[] var2 = new Image[this.fa.length + 1];

        int var3;
        for(var3 = 0; var3 < this.fa.length; ++var3) {
            var2[var3] = this.fa[var3];
        }

        var2[var2.length - 1] = this.b(var1);
        this.fa = var2;
        var3 = var1.getWidth();
        int var4 = var1.getHeight();
        int[] var5 = new int[var3 * var4];
        byte[] var6 = new byte[var5.length * 3];
        // Non-existent function
        //var1.getRGB(var5, 0, var3, 0, 0, var3, var4);

        for(int var7 = 0; var7 < var3; ++var7) {
            for(int var8 = 0; var8 < var4; ++var8) {
                var5[var7 * var3 + var8] = com.siemens.mp.lcdui.Image.getPixelColor(var1, var7, var8);
                if (var5[var7 * var3 + var8] >> 24 == 0) {
                    var5[var7 * var3 + var8] = 7799014;
                }

                var6[(var7 * var3 + var8) * 3] = (byte)(var5[var7 * var3 + var8] & 255);
                var6[(var7 * var3 + var8) * 3 + 1] = (byte)(var5[var7 * var3 + var8] >> 8 & 255);
                var6[(var7 * var3 + var8) * 3 + 2] = (byte)(var5[var7 * var3 + var8] >> 16 & 255);
            }
        }

        DataInputStream var15 = this.dO.c(this.dP[4]);
        boolean var16 = var15 == null;
        byte[] var9 = null;
        byte var10 = 0;

        try {
            if (!var16) {
                var10 = var15.readByte();
                var9 = new byte[var6.length * var10];
                var15.read(var9);
                var15.close();
            }
        } catch (Exception var14) {
        }

        try {
            ByteArrayOutputStream var11 = new ByteArrayOutputStream();
            DataOutputStream var12 = new DataOutputStream(var11);
            if (var16) {
                var12.writeByte(1);
            } else {
                var12.writeByte(var10 + 1);
                var12.write(var9);
            }

            var12.write(var6);
            this.dO.a(this.dP[4], var11.toByteArray());
            var12.close();
        } catch (Exception var13) {
        }

    }

    private Image b(Image var1) {
        Image var2 = Image.createImage(36, 18);

        for(int var3 = 0; var3 < 18; ++var3) {
            for(int var4 = 0; var4 < 18; ++var4) {
                int var5 = com.siemens.mp.lcdui.Image.getPixelColor(var1, var4, var3);
                if (var5 != 0) {
                    var5 |= -16777216;
                }

                com.siemens.mp.lcdui.Image.setPixelColor(var2, 35 - var4, var3, var5);
                com.siemens.mp.lcdui.Image.setPixelColor(var2, var4, var3, var5);
            }
        }

        return var2;
    }

    public void a(byte[] var1, String var2, boolean var3) {
        int var4 = 1 + var2.length();
        byte[] var5 = new byte[6];

        for(int var6 = 0; var6 < 6; ++var6) {
            var5[var6] = var1[var4++];
        }

        byte var15 = var1[var4++];
        byte var7 = var15;
        this.o(15);

        try {
            int var9;
            int var11;
            int var12;
            if (var15 >= 4) {
                this.dO.aW = 18;
                int[] var8 = new int[this.dO.aW * this.dO.aW];
                var9 = 0;

                while(true) {
                    if (var9 >= this.dO.aW) {
                        this.o(25);
                        System.gc();
                        // Non-existent function
                        //Image var17 = Image.createRGBImage(var8, this.dO.aW, this.dO.aW, true);
                        Image var17 = Image.createImage(this.dO.aW, this.dO.aW);
                        this.o(30);
                        this.a(var17);
                        this.o(40);
                        Image var18 = Image.createImage(20, 20);
                        this.o(50);
                        var18.getGraphics().drawImage(var17, 4, 4, 0);
                        this.c(var18);
                        this.o(70);
                        var7 = (byte)this.fa.length;
                        break;
                    }

                    for(int var10 = 0; var10 < this.dO.aW; ++var10) {
                        if (var10 < this.dO.aW - 1) {
                            var11 = var1[var4++];
                            var12 = -16777216;
                            var12 = var12 | (var11 >> 5 & 255) << 5 << 16 | (var11 >> 2 & 255) << 5 << 8 | (var11 & 255) << 5;
                            if ((var12 & '\uff00') == 58112) {
                                var12 &= 16777215;
                            }

                            var8[var10 + var9 * this.dO.aW] = var12;
                        } else {
                            var8[var10 + var9 * this.dO.aW] = 7799014;
                        }
                    }

                    ++var9;
                }
            }

            byte[] var16 = new byte[10 + var2.length()];

            for(var9 = 0; var9 < 7 + var2.length(); ++var9) {
                var16[var9] = var1[var9];
            }

            ++var16[1 + var2.length() + 1];
            this.o(80);
            var16[1 + var2.length()] = var7;
            var16[7 + var2.length()] = (byte)(60 + b.m(80));
            var16[8 + var2.length()] = (byte)b.m(2);
            var16[9 + var2.length()] = (byte)(b.m(2) + 1);
            RecordStore var19 = RecordStore.openRecordStore(this.dP[5], true);
            if (var3) {
                var19.setRecord(this.dO.aM, var16, 0, var16.length);
            } else {
                var19.addRecord(var16, 0, var16.length);
            }

            this.o(85);
            this.br = var19.getNumRecords();
            var19.closeRecordStore();
            this.o(90);
            String[] var20 = new String[this.eK.length + 1];

            for(var11 = 0; var11 < this.eK.length; ++var11) {
                var20[var11] = this.eK[var11];
            }

            var20[this.eK.length] = var2;
            this.eK = var20;
            ++this.bm;
            this.o(95);
            byte[][] var21 = new byte[this.gt.length + 1][9];

            for(var12 = 0; var12 < this.gt.length; ++var12) {
                for(int var13 = 0; var13 < 9; ++var13) {
                    var21[var12][var13] = this.gt[var12][var13];
                }
            }

            for(var12 = 0; var12 < 9; ++var12) {
                var21[this.gt.length][var12] = var16[var2.length() + var12 + 1];
            }

            this.gt = var21;
        } catch (Exception var14) {
        }

    }

    public void c(Image var1) {
        int var2 = var1.getWidth();
        int var3 = var1.getHeight();
        if (this.hf == null) {
            this.hf = new Image[0];
        }

        Image[] var4 = new Image[this.hf.length + 1];
        System.arraycopy(this.hf, 0, var4, 0, this.hf.length);
        var4[this.hf.length] = var1;
        this.hf = var4;
        var4 = null;
        int[] var5 = new int[var2 * var3];
        byte[] var6 = new byte[var2 * var3 * 3];
        int var7 = var2;
        int var8 = var3;

        for(int var9 = 0; var9 < var7; ++var9) {
            for(int var10 = 0; var10 < var8; ++var10) {
                var5[var9 * var7 + var10] = com.siemens.mp.lcdui.Image.getPixelColor(var1, var9, var10);
                if (var5[var9 * var7 + var10] >> 24 == 0) {
                    var5[var9 * var7 + var10] = 7799014;
                }

                var6[(var9 * var7 + var10) * 3] = (byte)(var5[var9 * var7 + var10] & 255);
                var6[(var9 * var7 + var10) * 3 + 1] = (byte)(var5[var9 * var7 + var10] >> 8 & 255);
                var6[(var9 * var7 + var10) * 3 + 2] = (byte)(var5[var9 * var7 + var10] >> 16 & 255);
            }
        }

        try {
            RecordStore var12 = RecordStore.openRecordStore(this.dP[6], true);
            var12.addRecord(var6, 0, var6.length);
            var12.closeRecordStore();
        } catch (Exception var11) {
        }

    }

    private int aq() {
        boolean var1 = false;

        try {
            RecordStore var2 = RecordStore.openRecordStore(this.dP[6], true);
            RecordEnumeration var3 = var2.enumerateRecords((RecordFilter)null, (RecordComparator)null, false);
            var3.reset();
            int var11 = var2.getNumRecords();
            if (var11 <= 0) {
                return 0;
            } else {
                this.hf = new Image[var11];

                for(int var4 = 0; var4 < var11; ++var4) {
                    this.hf[var11 - var4 - 1] = Image.createImage(it, it);
                    byte[] var5 = var3.nextRecord();
                    int var6 = 0;

                    for(int var7 = 0; var7 < it; ++var7) {
                        for(int var8 = 0; var8 < it; ++var8) {
                            int var9 = 255 & var5[var6++] | (255 & var5[var6++]) << 8 | (255 & var5[var6++]) << 16;
                            if (var9 == 7799014) {
                                var9 &= 16777215;
                            } else {
                                var9 |= -16777216;
                            }

                            com.siemens.mp.lcdui.Image.setPixelColor(this.hf[var11 - var4 - 1], var7, var8, var9);
                        }
                    }
                }

                var2.closeRecordStore();
                return var11;
            }
        } catch (Exception var10) {
            return 0;
        }
    }

    public void i() {
        this.hE = null;
    }

    public void ar() {
        if (this.hE == null) {
            this.hE = new Thread(this);
            this.hE.start();
        }

    }

    private final void a(Graphics var1, String var2, int var3, int var4, int var5) {
        int var6 = var1.getClipX();
        int var7 = var1.getClipY();
        int var8 = var1.getClipWidth();
        int var9 = var1.getClipHeight();
        int var10 = var1.getFont().stringWidth(var2);
        if (this.hG) {
            this.hG = false;
            this.iv = !this.iv;
        }

        var1.setClip(var3, var4, var5, 20);
        if (!this.iv && var10 > var5) {
            var1.drawString(var2, var3 + var5, var4, 24);
        } else {
            var1.drawString(var2, var3, var4, 20);
        }

        var1.setClip(var6, var7, var8, var9);
    }

    private final void as() {
        this.o(0);
        if (this.gy == null) {
            this.gy = this.w(209);
        }

        this.o(5);
        if (this.eR == null) {
            this.eR = this.w(164);
        }

        this.o(25);
        this.fh = this.w(205);
        this.fi = this.w(203);
        this.fj = this.w(204);
        this.o(35);
        if (this.gi == null) {
            Image var1 = this.w(211);
            this.o(45);

            try {
                byte[] var2 = new byte[16];

                for(int var3 = 0; var3 < 16; ++var3) {
                    var2[var3] = 1;
                }

                this.gi = new com.elkware.midp.games.colorng.a(4, 4, var1, var1.getWidth(), var1.getHeight(), var2);
                var1 = null;
                System.gc();
            } catch (Exception var6) {
            }
        }

        this.o(50);
        this.gJ = new com.elkware.midp.games.colorng.d[5];
        System.gc();

        int var7;
        for(var7 = 0; var7 < this.gJ.length; ++var7) {
            this.gJ[var7] = new com.elkware.midp.games.colorng.d(this.w(198 + var7), this.dO.c(223 + var7 * 2), this.dO.c(224 + var7 * 2));
        }

        this.gO = new int[5];
        this.gP = new int[5];
        this.gP[0] = this.gP[4] = -this.gJ[0].getHeight() / 2;
        this.gO[0] = this.gO[4] = -this.gJ[0].getWidth() / 2;
        this.gP[2] = this.gP[1] = this.gJ[2].getHeight();
        int[] var10000 = this.gP;
        var10000[2] -= 7;
        this.gO[2] = this.gO[1] = this.gJ[2].getWidth() / 2;
        this.gP[3] = this.gJ[3].getHeight();
        this.gO[3] = this.gJ[3].getWidth() / 2;
        this.o(55);
        this.o(60);
        this.gm = new com.elkware.midp.games.colorng.d[3];
        System.gc();

        for(var7 = 0; var7 < this.gm.length; ++var7) {
            this.gm[var7] = new com.elkware.midp.games.colorng.d(this.w(192 + var7), 17, 17);
        }

        this.o(70);

        try {
            this.gw = new Image[d.df.length];
            this.eY = new int[d.df.length];
            this.eZ = new int[d.df.length];
            System.gc();

            for(var7 = 0; var7 < d.df.length; ++var7) {
                this.gw[var7] = this.w(48 + var7);
                this.eY[var7] = this.gw[var7].getWidth();
                this.eZ[var7] = this.gw[var7].getHeight() / 2;
            }
        } catch (Exception var5) {
        }

        this.o(80);
        this.gT = new com.elkware.midp.games.colorng.d[d.df.length];

        for(var7 = 0; var7 < this.gT.length; ++var7) {
            try {
                System.gc();
                this.gT[var7] = new com.elkware.midp.games.colorng.d(this.w(224 + var7), this.dO.c(250 + var7 * 2), this.dO.c(251 + var7 * 2));
            } catch (Exception var4) {
            }
        }

        this.o(85);
        this.hN = this.w(167);
        this.o(95);
        System.gc();
        if (this.fg == null) {
            this.fg = this.w(165);
        }

        this.o(100);
    }

    private int a(byte[] var1, int var2) {
        return 255 & var1[0 + var2] | (255 & var1[1 + var2]) << 8 | (255 & var1[2 + var2]) << 16;
    }

    private byte[] v(int var1) {
        byte[] var2 = new byte[]{(byte)(var1 & 255), (byte)(var1 >> 8 & 255), (byte)(var1 >> 16 & 255)};
        return var2;
    }

    public void l(Graphics var1) {
        this.j(var1);
    }

    public int at() {
        return 0;
    }

    public void a(boolean var1) {
        this.a(0, var1);
    }

    public Image w(int var1) {
        try {
            Image var2 = super.w(var1);
            return var2;
        } catch (IOException var3) {
            return null;
        }
    }

    public void b(int var1) {
        super.e((long)var1);
    }
}
