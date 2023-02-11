package com.elkware.midp.games.colorng;
//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

public class d extends f {
    boolean[] iQ = new boolean[0];
    boolean[][] iR;
    boolean[][] iS;
    byte[][] iT;
    short[][] iU;
    short[][] iV;
    short[][] iW;
    short[][] iX;
    int ft;
    int bN;
    int ca;

    d() {
    }

    public d(Image var1, int var2, int var3) {
        super(var1, var2, var3);
    }

    public d(d var1) {
        super(var1);
        this.iQ = var1.iQ;
        this.iT = var1.iT;
        this.iX = var1.iX;
        this.iV = var1.iV;
        this.iW = var1.iW;
        this.iU = var1.iU;
        this.iR = var1.iR;
        this.iS = var1.iS;
        if (this.iQ.length > 0) {
            this.e(0L);
        }

    }

    public synchronized void e(long var1) {
        if (this.iQ != null) {
            this.ca = (int)((long)this.ca + var1);

            while(this.ca >= this.iU[this.ft][this.bN]) {
                this.ca -= this.iU[this.ft][this.bN];
                if (++this.bN == this.iX[this.ft].length) {
                    if (this.iQ[this.ft]) {
                        this.bN %= this.iX[this.ft].length;
                    } else {
                        --this.bN;
                    }
                }
            }

            this.l(this.iT[this.ft][this.bN] & 255);
            this.setFrame(this.iX[this.ft][this.bN]);
            this.a(this.iV[this.ft][this.bN], this.iW[this.ft][this.bN]);
            this.a(this.iR[this.ft][this.bN], this.iS[this.ft][this.bN]);
        }
    }

    public void a(Graphics var1, int var2, int var3) {
        this.a((c)null, var1, var2, var3);
    }
}
