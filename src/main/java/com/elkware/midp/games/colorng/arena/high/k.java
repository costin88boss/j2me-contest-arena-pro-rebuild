package com.elkware.midp.games.colorng.arena.high;
//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import com.elkware.midp.games.a;
import com.elkware.midp.games.colorng.j;

import java.io.IOException;
import java.io.InputStream;
import javax.microedition.media.Manager;
import javax.microedition.media.MediaException;
import javax.microedition.media.Player;
import javax.microedition.media.PlayerListener;

public class k extends Thread implements PlayerListener {
    boolean dG = false;
    com.elkware.midp.games.colorng.j iw;
    private int dr = -1;
    private int cY = -1;
    private int cO = 1;
    private boolean ix = false;
    Object iy = new Object();
    Player[] iz;
    short[] iA;
    boolean[] iB;
    short iC;
    Object iD = new Object();

    public k(j var1) throws IOException {
        this.iw = var1;
        int var2 = var1.c(5034);
        if (var2 < 0) {
            throw new IOException("ERROR: You must set parameter 5034 to the number of sound files you use!");
        } else {
            this.iz = new Player[var2];
            this.iA = new short[var2];
            this.iB = new boolean[var2];
        }
    }

    public void run() {
        while(!this.dG) {
            if (this.dr != -1) {
                synchronized(this.iy) {
                    this.b(this.cY, this.dr, this.cO, true);
                    this.cY = -1;
                    this.dr = -1;
                }
            }

            try {
                Thread.sleep(20L);
            } catch (Exception var3) {
            }
        }

    }

    public void a(int var1, int var2, int var3, boolean var4) {
        synchronized(this.iy) {
            this.cY = var1;
            this.dr = var2;
            this.cO = var3;
            this.ix = var4;
        }
    }

    private void b(int var1, int var2, int var3, boolean var4) {
        if ((var1 != 0 || this.iw.f) && (var1 < 1 || this.iw.c)) {
            try {
                int var5 = this.y(var2);
                if (this.S()) {
                    return;
                }

                this.iB[var5] = var4;
                this.iz[var5].setLoopCount(var3);
                this.iz[var5].start();
            } catch (Exception var6) {
            }

        }
    }

    public boolean S() {
        synchronized(this.iD) {
            for(int var2 = 0; var2 < this.iz.length; ++var2) {
                if (this.iz[var2] != null && this.iz[var2].getState() != 300) {
                    return true;
                }
            }

            return false;
        }
    }

    public void playerUpdate(Player var1, String var2, Object var3) {
        if (var2.equals("endOfMedia")) {
            int var4;
            for(var4 = 0; var4 < this.iz.length && this.iz[var4] != var1; ++var4) {
            }

            if (var4 < this.iz.length && this.iB[var4]) {
                this.iB[var4] = false;
                this.z(this.iA[var4]);
            }
        }

    }

    private int x(int var1) {
        int var2;
        for(var2 = 0; var2 < this.iA.length && this.iA[var2] != var1; ++var2) {
        }

        return var2 < this.iA.length ? var2 : -1;
    }

    public int y(int var1) throws IOException, MediaException {
        int var2 = this.x(var1);
        if (var2 == -1) {
            if (this.iC == this.iA.length) {
                throw new IOException("ERROR: not enough slots for sound. Please increase value of parameter 5034!");
            }

            short var10002 = this.iC;
            this.iC = (short)(var10002 + 1);
            var2 = var10002;
            this.iA[var2] = (short)var1;
        } else if (this.iz[var2] != null) {
            this.iz[var2].prefetch();
            return var2;
        }

        InputStream var3 = a.d(var1);
        int var4;
        String[] var5;
        if (var3 != null) {
            var4 = this.iw.g() - 3;
        } else {
            var5 = new String[]{"mid", "wav", "mmf", "spf", "mp3"};

            for(var4 = 0; var4 < var5.length; ++var4) {
                var3 = this.getClass().getResourceAsStream("/_" + Integer.toHexString(var1).toUpperCase() + "." + var5[var4]);
                if (var3 != null) {
                    break;
                }
            }

            if (var3 == null) {
                throw new IOException("sound not found!");
            }
        }

        var5 = new String[]{"audio/midi", "audio/x-wav", "audio/mmf", "audio/x-smaf", "audio/mp3"};
        this.iz[var2] = Manager.createPlayer(var3, var5[var4]);
        this.iz[var2].addPlayerListener(this);
        this.iz[var2].prefetch();
        return var2;
    }

    public void z(int var1) {
        int var2 = this.x(var1);
        if (var2 != -1) {
            try {
                this.iz[var2].stop();
                this.iz[var2].deallocate();
                this.iz[var2].close();
                this.iz[var2] = null;
            } catch (Exception var4) {
                var4.printStackTrace();
            }
        }

    }

    public void l(int var1) {
        try {
            for(int var2 = 0; var2 < this.iz.length; ++var2) {
                if (this.iz[var2] != null) {
                    this.iz[var2].stop();
                }
            }
        } catch (MediaException var3) {
        }

    }

    public void G() {
        this.l(0);
    }
}
