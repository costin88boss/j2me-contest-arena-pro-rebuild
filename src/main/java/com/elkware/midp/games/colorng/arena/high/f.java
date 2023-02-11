package com.elkware.midp.games.colorng.arena.high;
//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import com.elkware.midp.games.colorng.d;

public class f {
    static int[] ds;
    public static int[] dt;
    static d[][] du;
    static int[] dv;
    int db;
    int bp;
    int cO;
    int ca;
    d dw = null;
    j dx;

    static void a(j var0) {
        try {
            ds = new int[5];

            int var1;
            for(var1 = 0; var1 < 5; ++var1) {
                ds[var1] = var0.dO.c(350 + var1);
            }

            du = new d[ds.length][50];
            dv = new int[5];
            dt = new int[2];

            for(var1 = 0; var1 < 2; ++var1) {
                dt[var1] = var0.dO.c(300 + var1);
            }
        } catch (Exception var2) {
        }

    }

    public f(int var1, int var2, int var3, j var4) {
        this.a(var1, var2, var3, var4);
    }

    public void a(int var1, int var2, int var3, j var4) {
        try {
            this.db = var1;
            this.bp = var2;
            this.cO = var3;
            this.dx = var4;
            this.ca = 0;
            if (dv[var1] == 0) {
                this.dw = new d(var4.gJ[var1]);
            } else {
                this.dw = du[var1][dv[var1] - 1];
                du[var1][--dv[var1]] = null;
            }

            this.dw.setFrame(this.ca);
            this.dw.setPosition(var2, var3);
            var4.a(var4.fd, this.dw);
            this.ca = 0;
        } catch (Exception var6) {
        }

    }

    public boolean S() {
        try {
            this.dw.setFrame(this.ca);
            this.dw.setPosition(this.bp, this.cO);
            boolean var1 = ++this.ca >= ds[this.db];
            if (var1) {
                du[this.db][dv[this.db]++] = this.dw;
            }

            return var1;
        } catch (Exception var2) {
            return true;
        }
    }
}
