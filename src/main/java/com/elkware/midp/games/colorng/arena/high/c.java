package com.elkware.midp.games.colorng.arena.high;
//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import com.elkware.midp.games.colorng.a;

public class c {
    int cW;
    int cX;
    int cY;
    int K;
    int cC;
    int cc;
    int cZ;
    boolean aD = false;
    boolean c = false;
    int da = 0;
    int db;
    int cF = 0;
    j dc;
    byte[] dd;
    byte[] de;

    public c(int var1, int var2, int var3, int var4, int var5, int var6, int var7, j var8, int var9) {
        this.cW = var1;
        this.cX = var2;
        this.cY = var3;
        this.K = var4;
        this.cC = var5;
        this.cc = var6;
        this.cZ = var7;
        this.dc = var8;
        this.db = var9;
        this.c = var1 != -1;
        if (this.c) {
            this.dd = new byte[5];
            this.de = new byte[5];
        }

    }

    public void N() {
        if (this.da-- <= 0) {
            if (this.c) {
                int var1 = this.cW;

                label32:
                while(true) {
                    if (var1 > this.cY) {
                        var1 = 0;

                        while(true) {
                            if (var1 >= this.cF) {
                                break label32;
                            }

                            this.dc.gI[this.dd[var1]][this.de[var1]] = false;
                            this.dc.gI[this.de[var1]][this.dd[var1]] = false;
                            ++var1;
                        }
                    }

                    for(int var2 = this.cX; var2 <= this.K; ++var2) {
                        this.dc.gj[var1 + this.dc.cW * var2] = (byte)this.cZ;
                        this.dc.gh.setCell(var1, var2, (byte)this.cZ);
                    }

                    ++var1;
                }
            }

            this.aD = false;
            byte[] var10000 = this.dc.gj;
            int var10001 = this.db;
            this.dc.getClass();
            var10000[var10001] = 71;
            a var3 = this.dc.gh;
            var10001 = this.db % this.dc.cW;
            int var10002 = this.db / this.dc.cW;
            this.dc.getClass();
            var3.setCell(var10001, var10002, 71);
        }

    }

    public void l(int var1) {
        if (!this.aD) {
            if (!this.c) {
                this.dc.gl.addElement(new e(this.cX, this.cY, this.K, this.dc, var1));
            } else {
                int var2 = this.cW;

                while(true) {
                    if (var2 > this.cY) {
                        for(var2 = 0; var2 < this.cF; ++var2) {
                            this.dc.gI[this.dd[var2]][this.de[var2]] = true;
                            this.dc.gI[this.de[var2]][this.dd[var2]] = true;
                        }

                        this.f(var1);
                        break;
                    }

                    for(int var3 = this.cX; var3 <= this.K; ++var3) {
                        this.dc.gj[var2 + this.dc.cW * var3] = (byte)this.cC;
                        this.dc.gh.setCell(var2, var3, (byte)this.cC);
                    }

                    ++var2;
                }
            }

            this.aD = true;
            this.da = this.cc;
        }

    }

    public void a(byte var1, byte var2) {
        this.dd[this.cF] = var1;
        this.de[this.cF++] = var2;
    }

    public void f(int var1) {
        for(int var3 = 0; var3 < this.dc.gr.length; ++var3) {
            if (var3 != var1) {
                b var2 = this.dc.gr[var3];
                int var10000 = var2.br + var2.cl;
                int var10001 = this.cW;
                this.dc.getClass();
                if (var10000 > var10001 * 15) {
                    var10000 = var2.br;
                    var10001 = this.cY;
                    this.dc.getClass();
                    if (var10000 < var10001 * 15) {
                        var10000 = var2.bs + var2.cm;
                        var10001 = this.cX - 1;
                        this.dc.getClass();
                        if (var10000 >= var10001 * 15) {
                            var10000 = var2.bs + var2.cm;
                            var10001 = this.K + 1;
                            this.dc.getClass();
                            if (var10000 <= var10001 * 15) {
                                var2.bN = var1;
                                var2.bO = 20;
                            }
                        }
                    }
                }
            }
        }

    }
}
