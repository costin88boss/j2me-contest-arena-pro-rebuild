package com.elkware.midp.games.colorng;
//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//


import java.io.IOException;
import javax.microedition.media.MediaException;
import javax.microedition.media.Player;
import javax.microedition.media.PlayerListener;

public abstract class i extends h implements PlayerListener {
    Player[] kr;
    short[] ks;
    boolean[] kt;

    public i(j var1) throws IOException {
        super(var1);
        super.iH = var1;
        int var2 = var1.c(5034);
        if (var2 < 0) {
            throw new IOException("ERROR: You must set parameter 5034 to the number of sound files you use!");
        } else {
            this.kr = new Player[var2];
            this.ks = new short[var2];
            this.kt = new boolean[var2];
        }
    }

    public void playerUpdate(Player var1, String var2, Object var3) {
        if (var2.equals("endOfMedia")) {
            int var4;
            for(var4 = 0; var4 < this.kr.length && this.kr[var4] != var1; ++var4) {
            }

            if (var4 < this.kr.length && this.kt[var4]) {
                this.kt[var4] = false;
                this.J(this.ks[var4]);
            }
        }

    }

    private int I(int var1) {
        int var2;
        for(var2 = 0; var2 < this.ks.length && this.ks[var2] != var1; ++var2) {
        }

        return var2 < this.ks.length ? var2 : -1;
    }

    public void J(int var1) {
        int var2 = this.I(var1);
        if (var2 != -1) {
            try {
                this.kr[var2].close();
                this.kr[var2] = null;
            } catch (Exception var4) {
                var4.printStackTrace();
            }
        }

    }

    public void q(int var1) {
        try {
            for(int var2 = 0; var2 < this.kr.length; ++var2) {
                if (this.kr[var2] != null) {
                    this.kr[var2].stop();
                }
            }
        } catch (MediaException var3) {
        }

    }
}
