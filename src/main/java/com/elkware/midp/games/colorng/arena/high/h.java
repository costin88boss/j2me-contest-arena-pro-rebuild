package com.elkware.midp.games.colorng.arena.high;
//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import java.io.IOException;
import javax.microedition.io.Connector;
import javax.microedition.io.PushRegistry;
import javax.wireless.messaging.BinaryMessage;
import javax.wireless.messaging.Message;
import javax.wireless.messaging.MessageConnection;
import javax.wireless.messaging.TextMessage;

class h extends Thread {
    private String dA;
    private byte[] dB;
    private String dC;
    private MessageConnection dD;
    private a dE;
    private String dF = "0";
    private boolean dG = false;

    public h(a var1, String var2) {
        this.dE = var1;
        this.dF = var2;
    }

    public void n(String var1) {
        String[] var2 = new String[0];
        boolean var3 = false;

        try {
            var2 = PushRegistry.listConnections(true);
            int var4;
            if (var2.length > 0) {
                for(var4 = 0; var4 < var2.length; ++var4) {
                    if (!var2[var4].equals("")) {
                        this.dD = (MessageConnection)Connector.open(var2[var4]);
                        this.G();
                        var3 = true;
                        break;
                    }
                }
            }

            if (!var3) {
                var2 = PushRegistry.listConnections(false);

                for(var4 = 0; var4 < var2.length; ++var4) {
                    if (!var2[var4].equals("")) {
                        this.dD = (MessageConnection)Connector.open(var2[var4]);
                    }
                }
            }
        } catch (Exception var5) {
        }

    }

    public void run() {
        this.n(this.dF);

        while(!this.dG) {
            this.G();

            try {
                Thread.sleep(500L);
            } catch (Exception var2) {
            }
        }

    }

    public void G() {
        Message var1 = null;

        try {
            if (this.dD != null) {
                var1 = this.dD.receive();
                if (var1 != null) {
                    this.dC = var1.getAddress();
                    if (var1 instanceof TextMessage) {
                        this.dA = ((TextMessage)var1).getPayloadText();
                        this.dE.b(this.dA, this.dC);
                    } else {
                        this.dB = ((BinaryMessage)var1).getPayloadData();
                        this.dE.a(this.dB, this.dC);
                    }
                }
            }
        } catch (Exception var3) {
        }

    }

    public void N() {
        this.dG = true;
        if (this.dD != null) {
            try {
                this.dD.close();
                this.dD = null;
            } catch (IOException var2) {
                var2.printStackTrace();
            }
        }

    }
}
