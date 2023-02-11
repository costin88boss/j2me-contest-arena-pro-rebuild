package com.elkware.midp.games.colorng;
//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import com.elkware.midp.games.a;
import javax.microedition.lcdui.Command;
import javax.microedition.lcdui.CommandListener;
import javax.microedition.lcdui.Display;
import javax.microedition.lcdui.Displayable;
import javax.microedition.lcdui.Image;
import javax.microedition.lcdui.List;

public abstract class j extends a implements CommandListener {
    i ku;
    boolean kv;
    int gf;
    private List kw;
    private boolean kx = true;

    public j() {
    }

    public abstract i L();

    public void startApp() {
        if (this.ku != null) {
            Display.getDisplay(this).setCurrent(this.ku);
            this.ku.showNotify();
        } else {
            super.startApp();
            if ((this.gf = this.c(5030)) == -1) {
                this.gf = 15;
            }

            this.kv = this.c(5035) != 0;

            try {
                this.ku = this.L();
            } catch (Exception var2) {
                this.e("getGameCanvas: " + var2);
                return;
            }

            if (this.a(this.ku)) {
                this.ku.ap();
                if (this.kv) {
                    this.N();
                } else {
                    this.ku.N();
                }

            }
        }
    }

    private void N() {
        if ((this.gf & 3) <= 0 || !super.f && !super.c) {
            this.ku.N();
        } else {
            this.kw = new List(this.a(3) + " " + this.a(4) + "?", 3, new String[]{this.a(7), this.a(8)}, (Image[])null);
            this.kw.setCommandListener(this);
            this.kx = false;
            super.b.setCurrent(this.kw);
        }

    }

    public void commandAction(Command var1, Displayable var2) {
        super.commandAction(var1, var2);
        if (!this.kx) {
            this.kx = true;
            boolean var3 = this.kw.isSelected(0);
            this.kw = null;
            if (!var3) {
                boolean[] var4 = this.ku.aF();
                int var5 = 0;
                if ((this.gf & 1) > 0) {
                    var4[var5++] = false;
                }

                if ((this.gf & 2) > 0) {
                    var4[var5] = false;
                }

                this.ku.a(var4);
            }

            this.ku.N();
        }

    }

    public void pauseApp() {
        if (this.ku != null) {
            this.ku.hideNotify();
        }

        this.notifyPaused();
    }

    public void destroyApp(boolean var1) {
        this.ku.aH();
        this.ku.z();
        this.notifyDestroyed();
    }
}
