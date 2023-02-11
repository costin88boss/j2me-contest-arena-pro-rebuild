package com.elkware.midp.games.colorng.arena.high;

class l extends Thread {
    private final a iE;

    l(a var1) {
        this.iE = var1;
    }

    public void run() {
        long var1 = System.currentTimeMillis();

        while(System.currentTimeMillis() - var1 < 20000L && !a.a(this.iE)) {
            try {
                Thread.currentThread();
                Thread.sleep(100L);
            } catch (Exception var4) {
            }
        }

        this.iE.destroyApp(true);
    }
}
