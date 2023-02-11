package com.elkware.midp.games.colorng.arena.high;
//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

class g extends Thread {
    private String dy;
    private final a dz;

    private g(a var1, String var2) {
        this.dz = var1;
        this.dy = var2;
    }

    public void run() {
        a.a(this.dz, a.b(this.dz).ab(), this.dy);
        this.dz.aJ = true;
        this.dz.l(10);
    }

    g(a var1, String var2, i var3) {
        this(var1, var2);
    }
}
