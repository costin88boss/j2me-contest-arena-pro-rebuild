package com.elkware.midp.games.colorng.arena.high;

import javax.microedition.lcdui.Canvas;
import javax.microedition.lcdui.Graphics;
import javax.microedition.lcdui.Image;

class i extends Canvas {
    private final Image dH;
    private final a dI;

    i(a var1, Image var2) {
        this.dI = var1;
        this.dH = var2;
    }

    protected void keyPressed(int var1) {
        a.a(this.dI, true);
    }

    protected void paint(Graphics var1) {
        int var2 = this.getWidth();
        short var3 = 176;
        var1.setClip(0, 0, var2, var3);
        var1.setColor(255, 0, 0);
        var1.fillRect(0, 0, var2, var3);
        int var4 = this.dH.getHeight();
        int var5 = this.dH.getWidth();
        var1.drawImage(this.dH, (var2 - var5) / 2, (var3 - var4) / 2, 20);
    }

    // Non-existent function
    public void setFullScreenMode(boolean b) {

    }
}
