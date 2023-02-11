package com.elkware.midp.games.colorng.arena.high;
//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import com.elkware.midp.games.colorng.d;

public class b {
    static int[] bb = new int[]{7, 6, 10, 8, 4, 4};
    static int[] bc = new int[]{0, 0, 0, 0, 0, 0};
    static int[] bd = new int[]{0, 1, 0, 0, 0, 0};
    static int[] be = new int[]{-1, 0, 3, 0, 0, -2};
    static int[] bf = new int[]{4, 10, 3, 7, 3, 6};
    static final int[] bg = new int[]{4, 11, 2, 5, 4, 3};
    static final int[] bh = new int[]{5, 30, 10, 20, 20, 15};
    static final int[] bi = new int[]{5000, 5, 25, 10, 7, 15};
    static final int[] bj = new int[]{1000, 1000, 1000, 1000, 7, 20};
    static final int[] bk = new int[]{1, 9, 0, 8, 5, 13, 6, 14, 7, 15};
    static final int[] bl = new int[]{4, 12, 0, 8, 5, 13, 6, 14, 7, 15};
    int bm = 0;
    int bn = 0;
    public static j bo;
    public static int bp;
    static int bq = 0;
    int br;
    int bs;
    int bt;
    int bu;
    int bv;
    int bw = 0;
    int bx;
    int aV;
    boolean by;
    boolean bz;
    int bA = 0;
    boolean aJ;
    boolean aS;
    boolean bB;
    boolean bC;
    boolean v = false;
    boolean bD = false;
    boolean bE = false;
    boolean bF = false;
    boolean bG = false;
    public int bH;
    public int aN;
    public int bI = 0;
    int bJ = 0;
    int bK;
    int bL;
    int bM = 0;
    int bN = -1;
    int bO = 0;
    public boolean g = true;
    int bP;
    int bQ;
    int y;
    int bR;
    int bS;
    public int bT;
    boolean bU = false;
    boolean bV = false;
    boolean bW = false;
    boolean bX = false;
    int aM;
    int bY;
    int bZ = 0;
    int ca = 0;
    int cb = -1;
    int cc = -1;
    int E = 0;
    boolean[] cd;
    int ce = 1;
    d cf;
    d cg;
    int ch = 12;
    int ci = 0;
    int cj = 0;
    int ck = 0;
    public int cl;
    public int cm;
    static int cn = (int)System.currentTimeMillis();
    boolean co = false;
    boolean aG = false;
    int cp = 0;
    static int cq = 4;
    static int cr = 0;
    static int cs = 1;
    static int M = 2;
    static byte ct = 1;
    static byte cu = 2;
    static byte cv = 3;
    static byte cw = 4;
    static byte cx = 5;
    static byte cy = 6;
    int cz;
    int cA;
    int cB;
    int cC;
    int cD;
    int cE;
    int cF;
    int cG;
    int D;
    boolean cH;
    boolean cI;
    boolean cJ;
    boolean cK;
    boolean cL;
    boolean cM;
    boolean cN;
    int cO;
    int cP;
    boolean cQ;
    boolean cR;
    boolean cS;
    private int cT;
    private int cU;
    public int cV;

    public b(d var1, d var2, int var3, int var4, int var5, int var6, int var7, int var8) {
        this.cB = cr;
        this.cE = 0;
        this.cF = 0;
        this.cG = 0;
        this.D = 0;
        this.cH = false;
        this.cI = false;
        this.cL = false;
        this.cM = false;
        this.cN = false;
        this.cO = -1;
        this.cP = 0;
        this.cQ = false;
        this.cR = false;
        this.cS = false;
        this.cT = 0;
        this.cU = 0;
        this.cV = 0;
        this.cf = new d(var1);
        this.cg = new d(var2);
        this.br = var3;
        this.bs = var4;
        this.bP = this.bS = var5;
        this.bQ = var6;
        this.y = var7;
        this.bR = var8;
        this.bM = 0;
        bo.a(bp, this.cf);
        bo.a(bp, this.cg);
        this.cf.defineCollisionRectangle(0, 0, this.cf.aw(), this.cf.ax() + this.cg.ax());
        this.cm = var1.ax() + var2.ax();
        this.cl = var1.aw();
        this.bT = bq++;
        this.cd = new boolean[bo.gr.length];
    }

    public static void a(j var0, int var1) {
        bo = var0;
        bp = var1;
    }

    static int m(int var0) {
        cn = (int)((long)cn + System.currentTimeMillis());
        return Math.abs(cn % var0);
    }

    public void G() {
        this.bW = this.v = this.bX = false;
        if (this.bw == 0) {
            this.bI = 0;
        } else if (this.bI != 0) {
            this.bI = Math.max(this.bI - 1, 1);
        }

        this.g = this.bS > 0;
        int var10001;
        int var10002;
        if (this.g && this.bD) {
            this.bE = this.bF = false;
            this.ci = Math.max(0, this.ci - 1);
            if (!this.bG && this.by && !this.bz) {
                this.bt /= 4;
            }

            if (this.bO-- < 1) {
                this.bO = 0;
                this.bN = -1;
            }

            var10001 = this.bs;
            var10002 = this.bu;
            bo.getClass();
            this.bs = var10001 + Math.min(var10002, 15 - 1);
            if (!this.bC) {
                var10001 = this.br;
                var10002 = this.by ? this.bt + this.bw : this.bt / 2 + this.bw;
                bo.getClass();
                this.br = var10001 + Math.min(var10002, 15);
            } else {
                var10001 = this.br;
                var10002 = this.bw / 2;
                bo.getClass();
                this.br = var10001 + Math.min(var10002, 15);
            }

            int var10003;
            boolean var6;
            label198: {
                var10001 = Math.max(7, this.br);
                var10002 = bo.cW;
                bo.getClass();
                this.br = Math.min(var10001, var10002 * 15 - this.cl - 7);
                var10001 = Math.max(0, this.bs);
                var10002 = bo.cE;
                bo.getClass();
                this.bs = Math.min(var10001, var10002 * 15 - this.cm);
                var10002 = this.bH;
                bo.getClass();
                var10002 /= 15;
                var10003 = this.bs + this.cm - 1;
                bo.getClass();
                this.bA = this.bJ = var10002 + var10003 / 15 * bo.cW;
                byte var5 = bo.gj[this.bA];
                bo.getClass();
                if (var5 >= 75) {
                    var5 = bo.gj[this.bA];
                    bo.getClass();
                    if (var5 <= 78) {
                        var6 = true;
                        break label198;
                    }
                }

                var6 = false;
            }

            this.bz = var6;
            int var10000 = bo.gj[this.bJ];
            bo.getClass();
            int var10004;
            if (var10000 == 8) {
                this.by = this.bE = this.bu > -1;
                if (this.by) {
                    var10001 = this.bJ / bo.cW;
                    bo.getClass();
                    var10001 *= 15;
                    var10003 = this.br;
                    var10004 = this.bJ % bo.cW;
                    bo.getClass();
                    this.bs = var10001 + Math.max(-1, var10003 - var10004 * 15) - this.cm;
                }
            } else {
                var10000 = bo.gj[this.bJ];
                bo.getClass();
                if (var10000 == 7) {
                    this.by = this.bE = this.bu > -1;
                    if (this.by) {
                        var10001 = this.bJ / bo.cW + 1;
                        bo.getClass();
                        var10001 *= 15;
                        bo.getClass();
                        var10002 = 15 + 1;
                        var10003 = this.br + this.cl;
                        var10004 = this.bJ % bo.cW;
                        bo.getClass();
                        this.bs = var10001 - Math.min(var10002, var10003 - var10004 * 15) - this.cm;
                    }
                }
            }

            this.by = this.by && this.bu > -1;
            if (!this.bz || bo.eM % 5 == 0) {
                if (this.bw < 0) {
                    ++this.bw;
                } else if (this.bw > 0) {
                    --this.bw;
                }
            }

            this.co = this.co && !this.by;
            if (this.by) {
                this.bu = 0;
                this.bt /= 2;
                if (this.bz && (this.aJ || this.aS)) {
                    var10000 = this.bw;
                    bo.getClass();
                    if (var10000 < 15 / 3) {
                        this.bw += this.aJ ? -1 : 1;
                    }
                }
            } else if (this.bB) {
                this.bu += 2;
            } else {
                this.bu += 3;
            }

            var10001 = this.bu;
            bo.getClass();
            this.bu = Math.min(var10001, 15);
            if (this.aG) {
                this.aG = this.aG && !this.by;
                if (!this.aG) {
                    this.cF = 50;
                    this.cP = 20;
                }
            }

            this.bx = this.bs;
            this.aV = this.br;
            this.bH = this.br + this.cl / 2;
            this.aN = this.bs + this.cm / 2;
            this.bZ = Math.max(this.bZ - 1, 0);
            this.cC = bo.gk[this.bA];
            if (this.bv == 0 && this.bw > 0 || this.bv == 1 && this.bw < 0) {
                this.bn = 8;
            } else if (!this.by && this.bu < 0) {
                this.bn = 4;
            } else if (!this.by && this.bu > -1) {
                this.bn = 6;
            } else if (this.bt != 0 && !this.bC) {
                this.bn = 0;
            } else {
                this.bn = 2;
                this.bm = 0;
            }

            this.bn += this.bv;
            ++this.bm;
            this.bm %= 1 + (bl[this.bn] - bk[this.bn]);
            this.cg.setFrame(bk[this.bn] + this.bm);
            this.cf.setFrame(this.bv);
        } else if (this.ce-- < 1) {
            if (this == bo.gs) {
                bo.hW = bo.eH = true;
            }

            this.bD = this.bF = true;
            this.cL = false;
            boolean var1 = false;
            this.bw = 0;

            try {
                int var4 = m(bo.gu.length);
                this.bS = this.bP;
                this.bt = this.bu = this.cj = this.ce = 0;
                this.bN = -1;
                this.bO = 0;
                this.cc = -1;
                this.aG = this.co = this.cM = false;
                var10002 = bo.gu[var4] % bo.cW;
                bo.getClass();
                this.br = this.aV = var10002 * 15 - this.cl / 2;
                var10002 = bo.gu[var4] / bo.cW;
                bo.getClass();
                this.bs = this.bx = var10002 * 15 - this.cl;
                this.cz = this.br + this.cl / 2;
                this.cA = this.bs + this.cm / 2;
                var10001 = this.bH;
                bo.getClass();
                var10001 /= 15;
                var10002 = this.bs + this.cm - 1;
                bo.getClass();
                this.bA = var10001 + var10002 / 15 * bo.cW;
                this.cD = this.cC = bo.gk[this.bA];
                this.cf.setPosition(this.br, this.bs);
                this.cg.setPosition(this.br, this.bs + this.cf.ax());
                bo.a(2, this.br - 2, this.bs + this.cm - bo.gP[2]);
            } catch (Exception var3) {
            }
        }

        this.v = this.bC;
        this.bW = this.bV;
        this.bX = this.cS;
        this.aJ = this.aS = this.bB = this.bC = this.bV = this.cS = false;
        this.cf.setVisible(this.bS > 0);
        this.cg.setVisible(this.bS > 0);
        this.aN = (this.cf.ax() + this.cg.ax()) / 2;
        this.bG = this.by;
        this.ch = this.bS * 12 / this.bP;
    }

    public void N() {
        this.bt = Math.max(this.bt - this.bR, -this.bQ);
        this.aJ = true;
        this.bv = 0;
    }

    public void v() {
        this.bt = Math.min(this.bt + this.bR, this.bQ);
        this.aS = true;
        this.bv = 1;
    }

    public void O() {
        if (this.by || this.bE) {
            this.bu = -this.y;
            this.bB = true;
        }

    }

    public void P() {
        this.bu = bo.ee * -1;
        this.bB = this.aG = true;
        this.ca = this.cz < this.br ? 1 : 2;
    }

    public void C() {
        this.bC = true;
    }

    public void f(int var1) {
        if (this.bS > 0) {
            bo.b(40);
            this.bS -= var1;
            if (this.bS <= 0) {
                this.ce = 20;
                if (!this.bU && bo.ea[2]) {
                    bo.b(100);
                }

                if (bo.gY) {
                }

                bo.a(1, this.br - 2, this.bs - bo.gP[1] + this.cm);
                if (bo.ex < 3) {
                    if (this.bN > -1) {
                        ++bo.gr[this.bN].bM;
                    } else if (!this.bU) {
                        this.bM = Math.max(0, this.bM - 1);
                    }
                } else if (bo.ex == 4) {
                    if (this.bN > -1 && bo.fC == this.bT) {
                        bo.fC = this.bN;
                    } else if (bo.fC == this.bT) {
                        this.bM = Math.max(0, this.bM - 2);
                        int var2 = 1000;
                        int var3 = 1;

                        while(true) {
                            bo.getClass();
                            if (var3 >= 4) {
                                break;
                            }

                            if (var2 > bo.gr[var3].bM) {
                                bo.fC = var3;
                                var2 = bo.gr[var3].bM;
                            }

                            ++var3;
                        }
                    }
                } else if (bo.ex == 5 && this == bo.gs) {
                    --bo.fy;
                } else if (bo.ex == 5 && this.bN == bo.gs.bT) {
                    ++bo.gs.bM;
                }
            }
        }

        if (this == bo.gs) {
            bo.hW = true;
        }

    }

    public void a(int var1, int var2, int var3) {
        this.bU = true;
        this.aM = var1;
        this.cp = var2;
        this.bY = var3;
    }

    public void e() {
        int var2;
        int var21;
        if (this.g && this.bT == bo.gv) {
            boolean var1 = false;
            this.aN = this.bs + this.cm / 2;

            for(var2 = 0; var2 < bo.gr.length; ++var2) {
                if (var2 != this.bT) {
                    this.cd[var2] = Math.abs(bo.gr[var2].br - this.br) < 81 && Math.abs(bo.gr[var2].bs - this.bs) < 31 && bo.gr[var2].g && !this.aG;
                    var1 = var1 || this.cd[var2];
                }
            }

            this.cC = bo.gk[this.bA - bo.cW];
            this.cQ = false;

            for(var2 = 0; var2 < this.cd.length; ++var2) {
                if (var2 != this.bT && this.cd[var2] && Math.min(this.bH, this.cz) < bo.gr[var2].bH && Math.max(this.bH, this.cz) > bo.gr[var2].bH) {
                    if (bo.ex >= 3 && var2 != bo.fC) {
                        if (bo.gr[this.cc].by) {
                            this.O();
                        }
                    } else {
                        this.cc = var2;
                        this.cQ = true;
                    }
                }
            }

            if (this.cc > -1 && !this.cd[this.cc]) {
                this.cB = cr;
            }

            byte var15 = cu;
            int var3 = 0;
            boolean var4 = false;
            int var16 = bo.gE.length > 0 ? 100 - this.bS - this.aM / 3 : 0;
            if (var3 > var16) {
                var15 = ct;
                var3 = var16;
            }

            if (bo.ex == 4 && bo.fC > -1 && !this.cQ) {
                if (bo.fC != this.bT) {
                    var3 = 1000;
                    if (this.bS < this.bP - this.aM / 4 && !this.cM && bo.gE.length > 0) {
                        var15 = ct;
                    } else {
                        var15 = cu;
                        this.cc = bo.fC;
                        this.cD = bo.gr[this.cc].cC;
                        this.cB = this.cd[this.cc] ? cs : cr;
                    }
                } else {
                    this.cc = -1;
                    if (var1 && this.bS > this.bP / 2) {
                        var15 = cu;
                    } else if (this.bS < this.bP / 2 && bo.gE.length > 0) {
                        var15 = ct;
                    } else {
                        var15 = cx;
                    }

                    var3 = 1000;
                }
            }

            int var5;
            int var6;
            try {
                var16 = 50 + this.aM / 3 + (var1 ? 40 : 0) + (this.cQ ? 100 : 0);
                var5 = 2000;

                for(var6 = 0; var6 < bo.gr.length; ++var6) {
                    if (var6 != this.bT) {
                        var5 = Math.min(var5, bo.gr[var6].bS);
                    }
                }

                if (var5 < 50) {
                    var16 += this.aM;
                }

                if (bo.ex == 4 && bo.fC != this.bT) {
                    var16 = 40;
                }

                if (var16 > var3) {
                    var15 = cu;
                    var3 = var16;
                }

                if (bo.hL) {
                    var16 = 30 + this.cp * 30 - this.Q() * 5;
                    if (var16 > 40 && this.a(bo.gn[this.cT])) {
                        var16 += 70;
                    }

                    if (var16 > var3) {
                        var15 = cv;
                        var3 = var16;
                    }

                    byte var10000 = bo.gj[this.bA];
                    bo.getClass();
                    if (var10000 == 71 && this.a((c)bo.go.get(new Integer(this.bA)))) {
                        var16 = 90 + 90 * this.cp;
                        if (var16 > var3) {
                            var15 = cw;
                            var3 = var16;
                        }
                    }
                }

                var16 = 70 - this.cj * 30 + this.cp * 10;
                if (var16 > var3) {
                    var15 = cx;
                    var3 = var16;
                }

                if (bo.ex == 3) {
                    if (!this.cR) {
                        short var20 = 500;
                        if (var20 > var3) {
                            var15 = cy;
                        }
                    } else {
                        this.cB = this.br >= bo.fz && this.br + this.cl <= bo.fA && var1 ? cs : M;
                        boolean var17 = true;
                        var4 = true;
                        if (this.cB == M) {
                            this.cz = (bo.fz + bo.fA) / 2;
                        }
                    }
                }
            } catch (Exception var13) {
            }

            this.cR = false;
            int var7;
            int var8;
            if (var15 == ct && !this.cQ) {
                var5 = 1000;
                boolean var18 = false;
                var7 = 0;

                for(var8 = 0; var8 < bo.gE.length; ++var8) {
                    var6 = bo.gE[var8] % bo.cW + bo.gE[var8] / bo.cW;
                    if (var6 < var5) {
                        var7 = var8;
                        var5 = var6;
                    }
                }

                for(var8 = 0; var8 < bo.gB.length; ++var8) {
                    if (bo.gE[var7] == bo.gB[var8]) {
                        this.cD = var8;
                        break;
                    }
                }

                this.cB = cr;
            } else if (var15 == cx && !this.cQ) {
                this.cD = this.m();
                this.cB = cr;
            } else if (var15 == cw && !this.cQ) {
                this.bV = true;
            } else if (var15 == cy && !this.cQ) {
                boolean var22;
                label598: {
                    byte[] var10001 = bo.gk;
                    int var10002 = (bo.fz + bo.fA) / 2;
                    bo.getClass();
                    var10002 /= 15;
                    int var10003 = bo.bx - 20;
                    bo.getClass();
                    this.cD = var10001[var10002 + var10003 / 15 * bo.cW];
                    this.cB = cr;
                    if (this.bu == 0 && this.bs + this.cm <= bo.bx + 10) {
                        var21 = this.bs + this.cm;
                        var10002 = bo.bx;
                        bo.getClass();
                        if (var21 >= var10002 - 15) {
                            var22 = true;
                            break label598;
                        }
                    }

                    var22 = false;
                }

                this.cR = var22;
            } else if (var15 == cv && !this.cQ) {
                this.cD = this.cT;
                this.cB = cr;
            } else {
                if (this.cc > -1) {
                    this.cB = this.cd[this.cc] ? cs : cr;
                } else if (!bo.eA) {
                    var5 = -1;
                    var6 = 2000;

                    for(var7 = 0; var7 < bo.gr.length; ++var7) {
                        if (var7 != this.bT && bo.gr[var7].bS < var6) {
                            var5 = var7;
                            var6 = bo.gr[var7].bS;
                        }
                    }

                    this.cc = var5;
                } else {
                    this.cc = bo.gs.bT;
                }

                if (this.cc == -1 || !bo.gr[this.cc].g) {
                    if (this.cb > -1 && bo.ex < 3) {
                        this.cc = this.cb;
                        this.cB = cr;
                    } else {
                        this.cB = cr;
                        this.cD = this.cC;
                        this.cc = -1;

                        for(var5 = 0; var5 < bo.gr.length; ++var5) {
                            if (var5 != this.bT && this.cd[var5]) {
                                this.cc = var5;
                                this.cB = cs;
                            }
                        }
                    }
                }

                if (this.cc > -1) {
                    this.cD = bo.gr[this.cc].cC;
                } else {
                    this.cD = this.cC;
                }
            }

            this.cJ = this.br + this.cl / 2 + cq > this.cz && this.br + this.cl / 2 - cq < this.cz;
            this.cK = this.bs + this.cm / 2 + cq > this.cA && this.bs + this.cm / 2 - cq < this.cA;
            this.cH = this.cJ && this.cK && !this.cM || this.cz == 0;
            this.cL = this.br + cq > this.cz && this.br - cq < this.cz || this.cL;

            try {
                if (this.by && bo.gC[this.cO][this.cE] % 2 == 0 && this.bs > this.cA) {
                    this.cF = 1;
                }
            } catch (Exception var11) {
                this.cF = 0;
                this.cO = this.cC;
                this.cE = this.cD;
            }

            this.cH = this.cH || this.cF > 0 || this.cP++ > 10;
            if (this.cP > 10) {
                this.br += this.bv == 0 ? -6 : 6;
            }

            if (this.cB == cr && this.cC > -1 && this.cD != this.cC && this.cH && (this.by || this.bE)) {
                this.cF = this.cP = 0;
                byte[] var19 = new byte[bo.gH];
                var19[this.cD] = 1;
                var6 = -1;
                if (!this.cL) {
                    var6 = this.cC;
                }

                try {
                    if (this.cM) {
                        var6 = this.cC;
                    }

                    var7 = 0;

                    while(var6 < 0) {
                        if (var7++ > var19.length) {
                            var7 = -1;
                            break;
                        }

                        for(var8 = 0; var8 < bo.gH; ++var8) {
                            if (var19[var8] == 1) {
                                byte[] var9 = bo.gD[var8];

                                for(int var10 = 0; var10 < var9.length; ++var10) {
                                    var19[var8] = 2;
                                    if (var9[var10] == this.cC) {
                                        var6 = var8;
                                        var8 = bo.gH;
                                        break;
                                    }

                                    if (var19[var9[var10]] == 0) {
                                        var19[var9[var10]] = 1;
                                    }
                                }
                            }
                        }
                    }

                    this.cI = var7 == -1;
                    if (this.cI) {
                        var6 = this.cC;
                    }
                } catch (Exception var12) {
                }

                this.cO = this.cC;
                this.cD = this.cE = var6;
                this.cN = bo.gI[this.cC][this.cD];
                var7 = this.cD;
                if (var7 > -1 && (this.bA != bo.gk[this.bA] || this.R())) {
                    var21 = bo.gB[var7] % bo.cW;
                    bo.getClass();
                    var21 *= 15;
                    bo.getClass();
                    this.cz = var21 + 15 / 2;
                    var21 = bo.gB[var7] / bo.cW - 1;
                    bo.getClass();
                    var21 *= 15;
                    bo.getClass();
                    this.cA = var21 + 15 / 2;
                }

                if (bo.gC[this.cC][this.cD] % 2 == 0 && this.by) {
                    this.ca = this.cz < this.br ? 1 : 2;
                    this.O();
                    this.co = true;
                } else {
                    this.co = false;
                }

                this.cb = -1;
            }
        }

        if (!this.cN) {
            if (this.cD > -1 && this.cC > -1 && this.cB == cr) {
                if (this.aG && this.cM) {
                    this.cM = false;
                    var21 = bo.gB[this.cG] % bo.cW;
                    bo.getClass();
                    var21 *= 15;
                    bo.getClass();
                    this.cz = var21 + 15 / 2;
                    var21 = bo.gB[this.cG] / bo.cW - 1;
                    bo.getClass();
                    var21 *= 15;
                    bo.getClass();
                    this.cA = var21 + 15 / 2;
                    this.cz += this.br < this.cz ? 7 : -7;
                }

                if (bo.gC[this.cC][this.cD] == 3 && !this.aG && this.bA != bo.gB[this.cC]) {
                    this.cG = this.cD;
                    this.cD = this.cC;
                    var21 = bo.gB[this.cC] % bo.cW;
                    bo.getClass();
                    var21 *= 15;
                    bo.getClass();
                    this.cz = var21 + 15 / 2;
                    var21 = bo.gB[this.cC] / bo.cW - 1;
                    bo.getClass();
                    var21 *= 15;
                    bo.getClass();
                    this.cA = var21 + 15 / 2;
                    this.cM = true;
                }
            }

            if (Math.abs(this.bw) > 1 && this.bI < this.bY && this.cp > 0) {
                if (this.bw < 0) {
                    this.v();
                } else {
                    this.N();
                }
            }

            if (this.cB == cs && this.cc > -1) {
                b var14 = bo.gr[this.cc];
                if (this.cz == this.bH) {
                    this.bv = var14.br < this.br ? 0 : 1;
                }

                var2 = m(100);
                if (this.cp == 2 && var14.bu < 0) {
                    this.E = var2 % 10;
                }

                if ((var14.bX || var14.cS) && var2 % this.bY != 0) {
                    this.A();
                    if (this.bY == 3 && !var14.by) {
                        this.C();
                    } else {
                        this.O();
                    }
                }

                if (this.by && var2 % 8 == 0) {
                    this.E = var2 % 7;
                } else if (var2 % 14 == 0 && bg[this.cj] > 5) {
                    this.O();
                } else if (!var14.by && !var14.bE) {
                    if (var14.by && var14.bs > this.bs) {
                        this.cz = (this.br + var14.br) / 2;
                    } else if (Math.abs(var14.br - this.br) > 31) {
                        this.cz = (this.bH + var14.bH) / 2;
                    }
                } else if (var14.bs < this.bs) {
                    this.O();
                    this.cz = (this.br + var14.br) / 2;
                } else {
                    this.cz = (this.br + var14.br) / 2;
                }

                if (bg[this.cj] > 10 && Math.abs(var14.br - this.br) > 20) {
                    this.cz = this.bH + (var14.bH - this.bH);
                }

                if (bg[this.cj] > 6) {
                    if (this.bs + this.aN + 5 > var14.bs && this.bs + this.aN - 5 < var14.bs + var14.cm) {
                        this.A();
                    }
                } else {
                    this.A();
                }

                this.cz = this.bH;
                this.cA = this.bs + this.cm / 2;
            }

            if (!this.cM && !this.aG) {
                if (!this.by && !this.bE) {
                    if (this.bH - cq > this.cz && this.ca == 1) {
                        this.N();
                    } else if (this.bH + cq < this.cz && this.ca == 2) {
                        this.v();
                    }
                } else if (this.bH - cq > this.cz) {
                    this.N();
                } else if (this.bH + cq < this.cz) {
                    this.v();
                }
            } else if (this.bH > this.cz - cq) {
                this.N();
            } else if (this.bH < this.cz + cq) {
                this.v();
            }

            if (bo.ex == 3 && this.cR && (this.br < bo.fz || this.br + this.cl > bo.fA)) {
                this.cz = (bo.fz + bo.fA) / 2;
            }

            if (this.E > 0) {
                this.C();
                --this.E;
            }

            if (this.co) {
                this.bB = true;
                if (this.ca == 1) {
                    this.N();
                } else if (this.ca == 2) {
                    this.v();
                }
            }

            this.aN = (this.cf.ax() + this.cg.ax()) / 2;
        }
    }

    public void A() {
        try {
            if (this.bZ == 0) {
                this.ci = 4;
                if (bo.gY && this != bo.gs && this.cc == 0) {
                }

                if (bo.bK == 0) {
                    new com.elkware.midp.games.colorng.arena.high.d(this.cj, this.bv == 0 ? this.br - bo.gT[this.cj].aw() : this.br + this.cl, this.bs + this.cm / 2 + (this.bC ? 7 : 4), this.bv == 0 ? -bb[this.cj] : bb[this.cj], bc[this.cj], this, bo);
                } else {
                    bo.gQ[bo.gS] = bo.gR[--bo.bK];
                    bo.gR[bo.bK] = null;
                    bo.gQ[bo.gS].a(this.cj, this.bv == 0 ? this.br - bo.gT[this.cj].aw() : this.br + this.cl, this.bs + this.cm / 2 + (this.bC ? 7 : 4), this.bv == 0 ? -bb[this.cj] : bb[this.cj], bc[this.cj], this, bo);
                }

                this.bZ = bg[this.cj];
                this.cS = true;
                if (this.ck-- == 0) {
                    this.cj = 0;
                    this.ck = bi[0];
                }
            }
        } catch (Exception var2) {
        }

    }

    public void a(int var1, int var2) {
        this.bw = var2;
        if (!this.bU && bo.ea[2] && this.bS > var1) {
            bo.b(20);
        }

        this.f(var1);
    }

    public int Q() {
        int var1 = 1000;

        for(int var3 = 0; var3 < bo.gF.length; ++var3) {
            int var2 = Math.abs(this.bA % bo.cW - bo.gF[var3] % bo.cW) + Math.abs(this.bA / bo.cW - bo.gF[var3] / bo.cW);
            if (var2 < var1) {
                this.cT = var3;
                var1 = var2;
            }
        }

        return var1;
    }

    public int m() {
        int var1 = 1000;

        for(int var3 = 0; var3 < bo.gG.length; ++var3) {
            int var10000 = Math.abs(this.bA % bo.cW - bo.gG[var3] % bo.cW) + Math.abs(this.bA / bo.cW - bo.gG[var3] / bo.cW);
            byte var10001 = bo.gj[bo.gG[var3]];
            bo.getClass();
            int var2 = var10000 - (var10001 - 67) * 10;
            if (var2 < var1) {
                this.cU = bo.gk[bo.gG[var3]];
                var1 = var2;
            }
        }

        return this.cU;
    }

    public boolean a(c var1) {
        int var2;
        if (var1.c) {
            for(var2 = 0; var2 < bo.gr.length; ++var2) {
                if (var2 != this.bT && bo.gr[var2].bA % bo.cW >= var1.cW - 1 && bo.gr[var2].bA % bo.cW <= var1.cY + 1 && bo.gr[var2].bA / bo.cW >= var1.cX - 2 && bo.gr[var2].bA / bo.cW <= var1.K) {
                    this.cV = 1;
                    return true;
                }
            }
        } else {
            for(var2 = 0; var2 < bo.gr.length; ++var2) {
                if (var2 != this.bT && bo.gr[var2].bA % bo.cW >= var1.cY - 1 && bo.gr[var2].bA % bo.cW <= var1.cY + 1 && bo.gr[var2].bA / bo.cW >= var1.K) {
                    this.cV = 1;
                    return true;
                }
            }
        }

        this.cV = 0;
        return false;
    }

    public boolean R() {
        return Math.abs(this.bA - bo.gB[this.cD]) < 2 || Math.abs(this.bA - bo.cW - bo.gB[this.cD]) < 2;
    }

    public static void h(a var0) {
        bb = new int[6];
        bd = new int[6];
        bc = new int[6];
        be = new int[6];
        bf = new int[6];

        for(int var1 = 0; var1 < bb.length; ++var1) {
            bb[var1] = var0.c(420 + var1 * 5);
            bd[var1] = var0.c(422 + var1 * 5);
            bc[var1] = var0.c(421 + var1 * 5) * -1;
            be[var1] = var0.c(423 + var1 * 5);
            bf[var1] = var0.c(424 + var1 * 5);
        }

    }
}
