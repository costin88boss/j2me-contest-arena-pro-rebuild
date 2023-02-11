package com.elkware.midp.games.colorng.arena.high;
//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import com.elkware.midp.games.colorng.d;

public class e {
    public final int dk = 1;
    public final int dl = 2;
    public final int dm = 3;
    public final int dn = 40;
    public final int[] _do = new int[]{50, 120, 70};
    int K;
    int cF;
    int db;
    d dp;
    j dq;
    int cW = 0;
    int bp = 0;
    public boolean v = false;
    int cY = 0;
    int dr;

    public e(int var1, int var2, int var3, j var4, int var5) {
        this.K = var1;
        var4.getClass();
        this.cF = var2 * 15;
        var4.getClass();
        this.db = var3 * 15;
        this.dq = var4;
        this.dr = var5;

        while(true) {
            byte var10000 = var4.gj[var2 + var3 * var4.cW];
            var4.getClass();
            if (var10000 <= 32) {
                var10000 = var4.gj[var2 + var3 * var4.cW];
                var4.getClass();
                if (var10000 >= 1) {
                    int var10001 = this.cW;
                    var4.getClass();
                    this.cW = var10001 * 15;
                    this.bp = 9;
                    this.dp = new d(var4.gm[var1 - 1]);
                    var4.a(var4.fc, this.dp);
                    this.dp.setPosition(var2, var3);
                    return;
                }
            }

            ++this.cW;
            ++var3;
        }
    }

    public boolean S() {
        try {
            this.v = this.cW <= this.bp >> 2;
            if (!this.v) {
                switch (this.K) {
                    case 1:
                        this.bp += Math.min(3, 40 - this.bp);
                        break;
                    case 2:
                        this.bp += Math.min(1, 40 - this.bp);
                        break;
                    case 3:
                        this.bp += Math.min(2, 40 - this.bp);
                }

                this.cW -= this.bp >> 2;
                this.db += this.bp >> 2;
                this.cY = (this.cY + 1) % 4;
                this.dp.setFrame(this.cY);
                this.dp.setPosition(this.cF, this.db);
            }

            return this.v;
        } catch (Exception var2) {
            return true;
        }
    }

    public void a(b var1) {
        var1.bN = this.dr;
        var1.bO = this.dr;
        var1.f(this._do[this.K - 1]);
        this.cW = -1;
        this.dq.a(0, this.cF, this.db);
    }
}
