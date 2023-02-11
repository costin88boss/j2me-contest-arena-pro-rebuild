package com.elkware.midp.games.colorng.arena.high;


import javax.microedition.lcdui.CommandListener;
import javax.microedition.lcdui.Form;
import javax.microedition.lcdui.List;

class m extends Thread {
    private CommandListener iF;
    private int cc;
    private final a iG;

    private m(a var1, CommandListener var2, int var3) {
        this.iG = var1;
        this.iF = var2;
        this.cc = var3;
    }

    public void run() {
        switch (this.cc) {
            case 1:
                a.b(this.iG).i();
                a.a(this.iG, a.b(this.iG));
                a.b(this.iG).o(0);
                if (a.e(this.iG)) {
                    a.a(this.iG, a.d(this.iG));
                } else if (a.f(this.iG)) {
                    a.a(this.iG, (List)null);
                    Form var1 = new Form(this.iG.a(401));
                    var1.append(this.iG.a(403));
                    var1.setCommandListener(this.iF);
                    var1.addCommand(a.g(this.iG));
                    a.b(this.iG).o(100);
                    a.a(this.iG, var1);
                } else {
                    this.iG.l(14);
                }

                return;
            case 2:
                try {
                    a.b(this.iG).i();
                    this.iG.aY = true;
                    a.b(this.iG).eh = true;
                    a.b(this.iG).o(0);
                    a.a(this.iG, a.b(this.iG));
                    a.b(this.iG).o(10);
                    a.b(this.iG, a.d(this.iG).getString(a.d(this.iG).getSelectedIndex()));
                    this.iG.aW = 45;
                    a.a(this.iG, a.c(this.iG));
                } catch (Exception var2) {
                }

                a.b(this.iG).o(100);
                this.iG.aY = false;
                a.b(this.iG).hR = true;
                a.b(this.iG).ad();
                return;
            case 3:
                a.a(this.iG, a.b(this.iG));
                a.b(this.iG).o(0);
                a.b(this.iG).c(this.iG.aU);
                this.iG.aU = null;
                System.gc();
                this.iG.aW = 18;
                this.iG.aY = true;
                a.a(this.iG, a.c(this.iG));
                this.iG.aY = false;
                a.b(this.iG).eh = false;
                a.b(this.iG).o(95);
                a.b(this.iG).a(this.iG.aU);
                this.iG.l(25);
                a.b(this.iG).o(100);
                return;
            default:
        }
    }

    m(a var1, CommandListener var2, int var3, i var4) {
        this(var1, var2, var3);
    }
}
