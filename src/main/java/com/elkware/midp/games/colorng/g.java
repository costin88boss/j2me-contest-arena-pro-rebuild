package com.elkware.midp.games.colorng;
//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import java.io.IOException;
import java.util.Vector;
import javax.microedition.lcdui.Command;
import javax.microedition.lcdui.Displayable;
import javax.microedition.lcdui.Form;
import javax.microedition.lcdui.Image;
import javax.microedition.lcdui.List;

public abstract class g extends i {
    public Command jj;
    public Command jk;
    public Command jl;
    public Command jm;
    public Command jn;
    public Command jo;
    public Command jp;
    public Command jq;
    public Command jr;
    public Command js;
    public Command jt;
    Form ju;
    Form jv;
    Form jw;
    public List jx;
    public List U;
    Image[] jy;
    boolean bF = true;
    boolean jz;
    boolean jA = true;
    Thread jB;
    int da;

    public g(j var1) throws IOException {
        super(var1);
        this.jz = var1.c(5033) == 1;
        int var2 = this.H(5047);
        if (var2 != -1) {
            this.jA = var2 == 1;
        }

        this.v();
        if (this.jz) {
            this.jk = new Command(var1.a(40), 1, 0);
            this.ay();
        }

        this.jy = new Image[7];

        int var3;
        for(var3 = 0; var3 < this.jy.length; ++var3) {
            this.jy[var3] = this.A(6 + var3);
        }

        this.jv = new Form(var1.a(2));
        this.jv.append(var1.a(200));
        this.jv.setCommandListener(this);
        this.jv.addCommand(this.jo);
        this.ju = new Form(var1.a(10));
        this.ju.append(var1.a(42));
        this.ju.setCommandListener(this);
        this.ju.addCommand(this.jo);
        this.jx = new List(var1.a(19), 3);
        if (super.ki != -1) {
            this.jx.append(var1.a(3), (Image)null);
        }

        if (super.bw != -1) {
            this.jx.append(var1.a(4), (Image)null);
        }

        if (super.kj != -1) {
            this.jx.append(var1.a(5), (Image)null);
        }

        if (super.kk != -1) {
            this.jx.append(var1.a(6), (Image)null);
        }

        if (super.kl != null) {
            for(var3 = 0; var3 < super.kl.length; ++var3) {
                this.jx.append(super.kl[var3], (Image)null);
            }
        }

        this.jx.setCommandListener(this);
        if (var1.c(5053) == 1) {
            this.jx.addCommand(this.jo);
        } else {
            this.jx.addCommand(this.jp);
        }

        if (var1.c(5052) == 1) {
            this.jt = new Command(var1.a(44), 4, 0);
        }

    }

    public void ay() {
        this.jw = new Form(super.iH.a(40));
        this.jw.append(super.iH.a(41));
        this.jw.addCommand(this.jo);
        this.jw.addCommand(this.jp);
        this.jw.setCommandListener(this);
    }

    public void v() {
        this.jl = new Command(super.iH.a(0), 1, 0);
        this.jm = new Command(super.iH.a(2), 1, 1);
        this.jq = new Command(super.iH.a(19), 1, 2);
        this.jr = new Command(super.iH.a(1), 1, 5);
        this.jn = new Command(super.iH.a(10), 1, 6);
        this.js = new Command(super.iH.a(9), 6, 7);
        this.jo = new Command(super.iH.a(35), 4, 0);
        this.jp = new Command(super.iH.a(12), 2, 0);
    }

    public void P() {
        boolean var1 = this.jz && this.t();
        this.U = new List(super.iH.a(201), 3);
        this.jj = new Command(super.iH.a(super.jT ? 0 : (var1 ? 13 : 31)), 1, 0);
        this.U.append(this.jj.getLabel(), this.jy[0]);
        if (var1 || super.jT) {
            this.U.append(this.jk.getLabel(), this.jy[0]);
        }

        Vector var2 = this.az();
        if (var2 != null) {
            for(int var3 = 0; var3 < var2.size() / 3; ++var3) {
                int var4 = ((Integer)var2.elementAt(var3 * 3 + 2)).intValue();
                if (!super.jT && (var4 & 1) == 1 || super.jT && (var4 & 2) == 2) {
                    this.U.append((String)var2.elementAt(var3 * 3), (Image)var2.elementAt(var3 * 3 + 1));
                }
            }
        }

        this.U.append(this.jm.getLabel(), this.jy[1]);
        if (super.kh) {
            this.U.append(this.jq.getLabel(), this.jy[2]);
        }

        if (this.jA) {
            this.U.append(this.jr.getLabel(), this.jy[3]);
        }

        if (this.bF) {
            this.U.append(this.jn.getLabel(), this.jy[1]);
        }

        this.U.append(this.js.getLabel(), this.jy[4]);
        this.U.setCommandListener(this);
        if (this.jt != null) {
            this.U.addCommand(this.jt);
        }

    }

    public Vector az() {
        return null;
    }

    Image A(int var1) {
        try {
            return this.w(var1);
        } catch (Exception var3) {
            return null;
        }
    }

    public void B(int var1) {
        super.jP = var1;
        this.au();
    }

    public void y() {
        Form var1 = new Form(super.iH.a(1));
        String var2 = "";

        for(int var3 = 0; var3 < super.iH.z; ++var3) {
            var2 = var2 + (var3 + 1) + ". " + super.iH.B[var3] + " " + super.iH.C[var3] + "\n";
        }

        var1.append(var2);
        var1.addCommand(this.jo);
        var1.setCommandListener(this);
        this.a(var1);
    }

    public void aA() {
        this.a(this.U);
    }

    public void K() {
        this.a(this);
    }

    public void aB() {
        this.a(this.jv);
    }

    public void aC() {
        this.a(this.ju);
    }

    public void aD() {
        this.a(this.jx);
        this.a(super.km);
    }

    public void b(int var1, boolean var2) {
        super.b(var1, var2);
        this.jx.set(var1, this.jx.getString(var1), var2 ? this.jy[6] : this.jy[5]);
    }

    public void n(String var1) {
    }

    public void commandAction(Command var1, Displayable var2) {
        super.commandAction(var1, var2);
        if (var1 != this.js) {
            if (var1 == this.jp) {
                this.C(super.jS);
            } else if (var1 == this.jo) {
                if (var2 == this.jw) {
                    this.u();
                    this.C(2);
                } else {
                    this.C(1);
                }
            }
        }

        if (var2 == this.jx && var1 == List.SELECT_COMMAND) {
            int var4 = this.jx.getSelectedIndex();
            this.b(var4, !this.D(var4));
        } else if (var2 == this.U) {
            String var3 = this.U.getString(this.U.getSelectedIndex());
            if (var3 == this.jj.getLabel()) {
                this.C(2);
            } else if (var3 == this.jk.getLabel()) {
                super.jS = 1;
                this.a(this.jw);
            } else if (var3 == this.jm.getLabel()) {
                this.C(4);
            } else if (var3 == this.jr.getLabel()) {
                this.C(3);
            } else if (var3 == this.jn.getLabel()) {
                this.C(5);
            } else if (var3 == this.jq.getLabel()) {
                this.F(6);
            } else if (var3 == this.js.getLabel()) {
                super.iH.destroyApp(true);
            } else {
                this.n(var3);
            }
        }

    }

    void C(int var1) {
        this.da = var1;
        this.jB = new Thread(this);
        this.jB.start();
    }

    public void run() {
        if (Thread.currentThread() == this.jB) {
            this.F(this.da);
        } else {
            super.run();
        }

    }
}
