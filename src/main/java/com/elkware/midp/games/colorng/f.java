package com.elkware.midp.games.colorng;
//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;
import javax.microedition.lcdui.game.Sprite;

public class f extends Sprite {
    int iY;
    int ax;
    int[] iZ;
    int[] be;
    int[] ja;
    int bH;
    int cZ;
    Image[] jb;
    public int[] bf;
    public int[] jc;
    public int[][] jd;
    public byte[][] je;
    int jf = 256;
    boolean jg;
    boolean aG;
    boolean bD;
    public boolean jh;
    public boolean[] ji;
    int z;
    int bQ;
    int cn;
    int cO;

    f() {
        super(Image.createImage(1, 1));
    }

    public f(Image var1, int var2, int var3) {
        super(Image.createImage(1, 1));
        this.f(1);
        this.a(0, var1, var2, var1.getWidth() / var2, var3);
    }

    public f(d var1) {
        super(var1.jb[0], var1.iZ[0], var1.be[0]);
        this.jb = var1.jb;
        this.iZ = var1.iZ;
        this.be = var1.be;
        this.ja = var1.ja;
        if (var1.cn != 0 && var1.cO != 0) {
            this.defineCollisionRectangle(var1.z, var1.bQ, var1.cn, var1.cO);
        }

        this.bf = var1.bf;
        this.jc = var1.jc;
        this.jd = var1.jd;
        this.je = var1.je;
        this.jf = var1.jf;
        this.bD = var1.bD;
        this.jh = var1.jh;
        this.ji = var1.ji;
    }

    protected void f(int var1) {
        this.jb = new Image[var1];
        this.iZ = new int[var1];
        this.be = new int[var1];
        this.ja = new int[var1];
    }

    protected void a(int var1, Image var2, int var3, int var4, int var5) {
        super.setImage(var2, var3, var5);
        this.jb[var1] = var2;
        this.iZ[var1] = var3;
        this.be[var1] = var5;
        this.ja[var1] = var4;
    }

    public void setFrame(int var1) {
        this.ax = var1;
        if (!this.bD) {
            super.setFrame(var1);
        }

    }

    public int aw() {
        return this.iZ[this.iY];
    }

    public int ax() {
        return this.be[this.iY];
    }

    public synchronized void a(c var1, Graphics var2, int var3, int var4) {
        if (this.isVisible()) {
            int var5 = var2.getClipX();
            int var6 = var2.getClipY();
            int var7 = var2.getClipWidth();
            int var8 = var2.getClipHeight();
            var3 += this.getX() + this.bH;
            var4 += this.getY() + this.cZ;
            int var9;
            int var10;
            if (this.bD) {
                var9 = this.iZ[this.ax];
                var10 = this.be[this.ax];
                int var11 = var9 * this.jf >> 8;
                int var12 = var10 * this.jf >> 8;
                int var13 = var3;
                int var14 = var4;
                int var15 = var3 + var11;
                int var16 = var4 + var12;
                int var17 = var5 + var7;
                int var18 = var6 + var8;
                if (var3 < var5) {
                    var13 = var5;
                }

                if (var4 < var6) {
                    var14 = var6;
                }

                if (var15 > var17) {
                    var15 = var17;
                }

                if (var16 > var18) {
                    var16 = var18;
                }

                if (var13 >= var15 || var14 >= var16) {
                    return;
                }

                if (this.jf == 256) {
                    var1.a(var2, this.je[this.ax], this.ji[this.jh ? 0 : this.ax], var9, var10, this.jh ? this.bf : this.jd[this.ax], var3, var4, this.jg, this.aG, var13, var14, var15, var16);
                } else {
                    var1.a(var2, this.je[this.ax], this.ji[this.jh ? 0 : this.ax], var9, var10, this.jh ? this.bf : this.jd[this.ax], var3, var4, var11, var12, this.jg, this.aG, var13, var14, var15, var16);
                }
            } else {
                var9 = this.getX();
                var10 = this.getY();
                this.setPosition(var3, var4);
                super.paint(var2);
                this.setPosition(var9, var10);
            }

        }
    }

    void l(int var1) {
        if (!this.bD) {
            super.setImage(this.jb[var1], this.iZ[var1], this.be[var1]);
        }

    }

    void a(int var1, int var2) {
        this.bH = var1;
        this.cZ = var2;
    }

    void a(boolean var1, boolean var2) {
        this.jg = var1;
        this.aG = var2;
        if (!this.bD) {
            int var3 = this.getX();
            int var4 = this.getY();
            if (var1) {
                this.setTransform(2);
            } else if (var2) {
                this.setTransform(1);
            } else {
                this.setTransform(0);
            }

            this.setPosition(var3, var4);
        }

    }

    public void defineCollisionRectangle(int var1, int var2, int var3, int var4) {
        super.defineCollisionRectangle(var1, var2, var3, var4);
        this.z = var1;
        this.bQ = var2;
        this.cn = var3;
        this.cO = var4;
    }

    public boolean a(d var1, boolean var2) {
        int var3;
        int var4;
        int var5;
        int var6;
        if (!this.bD) {
            var3 = this.getX();
            var4 = this.getY();
            var5 = var1.getX();
            var6 = var1.getY();
            this.setPosition(var3 + this.bH, var4 + this.cZ);
            var1.setPosition(var5 + var1.bH, var6 + var1.cZ);
            boolean var7 = super.collidesWith(var1, var2);
            this.setPosition(var3, var4);
            var1.setPosition(var5, var6);
            return var7;
        } else {
            var3 = this.getX() + this.z;
            var4 = this.getY() + this.bQ;
            var5 = var1.getX() + var1.z;
            var6 = var1.getY() + var1.bQ;
            return var5 + var1.cn > var3 && var5 < var3 + this.cn && var6 + var1.cO > var4 && var6 < var4 + this.cO;
        }
    }
}
