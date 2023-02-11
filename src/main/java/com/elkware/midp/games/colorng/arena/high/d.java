package com.elkware.midp.games.colorng.arena.high;

//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

public class d {
    static final int[] df = new int[]{7, 7, 1, 7, 7, 4};
    static com.elkware.midp.games.colorng.d[][] dg;
    static int[] bb;
    int cZ;
    int cX;
    int cW;
    int cO;
    int ca;
    int cr;
    j dh;
    int cC = 0;
    int da;
    int cc;
    int cF;
    com.elkware.midp.games.colorng.d di;
    b dj;

    public d(int var1, int var2, int var3, int var4, int var5, b var6, j var7) {
        this.a(var1, var2, var3, var4, var5, var6, var7);
    }

    public void a(int var1, int var2, int var3, int var4, int var5, b var6, j var7) {
        int var10001;
        if (this.cZ == 0) {
            var10001 = var7.cC;
            var7.getClass();
            this.cZ = var10001 / 15 + 3;
        }

        this.cX = var1;
        this.cW = var2;
        this.cO = var3;
        this.ca = var4;
        this.cr = var5;
        this.dh = var7;
        this.dj = var6;
        if (bb[var1] == 0) {
            this.di = new com.elkware.midp.games.colorng.d(var7.gT[var1]);
        } else {
            this.di = dg[var1][bb[var1] - 1];
            dg[var1][--bb[var1]] = null;
        }

        this.di.setPosition(var2, var3);
        this.di.defineCollisionRectangle(-4, -3, this.di.aw() + 8, this.di.ax() + 6);

        try {
            this.di.setFrame(this.cF = var4 < 0 ? 0 : df[var1] * 2 - 1);
        } catch (Exception var15) {
        }

        var7.gQ[var7.gS++] = this;
        var7.a(var7.fe, this.di);
        this.da = this.di.aw() / 2;
        this.cc = this.di.ax() / 2;
        int var8 = var4 * 100;
        int var9 = var5 * 100;
        var7.getClass();
        int var10 = 15 * var9 / Math.abs(var8);
        int var11 = 0;
        int var17 = var2 + this.da;
        var7.getClass();
        int var12 = var17 / 15;
        var17 = var3 + this.cc;
        var7.getClass();
        int var13 = var17 / 15;

        try {
            while(true) {
                byte var18 = var7.gj[var12 + (var13 + var11 / 10) * var7.cW];
                var7.getClass();
                if (var18 >= 1) {
                    var18 = var7.gj[var12 + (var13 + var11 / 10) * var7.cW];
                    var7.getClass();
                    if (var18 <= 32) {
                        break;
                    }
                }

                if (this.cC > this.cZ) {
                    break;
                }

                var10 += b.bd[var1];
                var11 += Math.min(10, var10);
                ++this.cC;
                var12 += var4 > 0 ? 1 : -1;
            }
        } catch (Exception var16) {
        }

        if (Math.abs(var4) > Math.abs(var5)) {
            var10001 = this.cC;
            var7.getClass();
            this.cC = var10001 * Math.abs(15 / var4);
        } else {
            var10001 = this.cC;
            var7.getClass();
            this.cC = var10001 * Math.abs(15 / var5);
        }

        this.cC = Math.min(this.cC, b.bj[var1]);
    }

    public boolean S() {
        this.cr += b.bd[this.cX];
        this.cW += this.ca;
        this.cO += this.cr;
        if (this.cX == 3) {
            this.cO += b.m(5) - 2;
        }

        this.di.setPosition(this.cW, this.cO);
        this.di.setFrame(this.cF = this.ca > 0 ? (this.cF - 1 <= df[this.cX] ? df[this.cX] * 2 - 1 : this.cF - 1) : (this.cF + 1 >= df[this.cX] ? 0 : this.cF + 1));
        boolean var1 = --this.cC < 1;
        if (var1) {
            dg[this.cX][bb[this.cX]++] = this.di;
        }

        return var1;
    }

    public void a(b var1) {
        if (var1 != this.dj) {
            var1.cb = this.dj.bT;
            var1.bN = this.dj.bT;
            var1.bO = 10;
            var1.a(b.bh[this.cX], this.ca > 0 ? b.bf[this.cX] : -b.bf[this.cX]);
            this.cC = -1;
            if (var1.bI == 0) {
                var1.bI = 5;
            }

            if (this.dh.gY && var1.bU && this.dj == this.dh.gs) {
            }
        }

    }

    static {
        dg = new com.elkware.midp.games.colorng.d[df.length][50];
        bb = new int[df.length];
    }
}
