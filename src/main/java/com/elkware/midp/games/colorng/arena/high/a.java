package com.elkware.midp.games.colorng.arena.high;
//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import com.elkware.midp.games.colorng.arena.b;
import com.siemens.mp.io.file.FileConnection;
import com.siemens.mp.resource.Resource;
import com.siemens.mp.wireless.messaging.MessagePart;
import com.siemens.mp.wireless.messaging.MultipartMessage;

import javax.microedition.io.Connector;
import javax.microedition.lcdui.*;
import javax.wireless.messaging.BinaryMessage;
import javax.wireless.messaging.MessageConnection;
import java.io.DataInputStream;
import java.util.Enumeration;

public class a extends b implements CommandListener {
    public static boolean P = true;
    private List Q;
    private List R;
    private List S;
    private List T;
    private List U;
    private List V;
    private Command W;
    private Command X;
    private Command Y;
    private Command Z;
    private Command aa;
    private Command ab;
    private Command ac;
    private Command ad;
    private Command ae;
    private Command af;
    private Command ag;
    private Command ah;
    private Command ai;
    private Command aj;
    private Command ak;
    private Command al;
    private Form am;
    private Form an;
    private Form ao;
    private Form ap = null;
    private List aq;
    private List ar;
    private List as;
    private List at;
    private List au;
    private List av;
    private j aw;
    private int ax;
    private String ay = "033751AD";
    private int az;
    private String aA;
    private TextBox aB;
    private TextBox aC;
    public boolean aD = true;
    public boolean aE = true;
    private boolean aF = false;
    private boolean aG;
    private boolean aH = false;
    private Thread aI = new l(this);
    public boolean aJ = false;
    private h aK = null;
    private boolean aL = false;
    public int aM = -1;
    private int aN = 0;
    private byte[] aO = null;
    private byte[][] aP = (byte[][])null;
    private boolean[] aQ = null;
    private String aR;
    private boolean aS;
    private boolean aT = true;
    public Image aU;
    private int aV = 36;
    public int aW = 18;
    private int aX = 3;
    public boolean aY = false;
    private static int aZ = 6;
    private TextBox ba = null;

    public a() {
        this.d(this.ay);
    }

    private synchronized void a(Displayable var1) {
        this.aD = var1 != this.aw;
        this.aE = var1 == this.aw;

        try {
            Thread.currentThread();
            Thread.sleep(50L);
        } catch (Exception var3) {
        }

        super.b.setCurrent(var1);
    }

    public void startApp() {
        if (!this.aF) {
            this.aF = true;
            super.startApp();
            this.aw.ac();
            this.Z = new Command(this.a(215), 2, 0);
            if (P) {
                this.aa = new com.siemens.mp.lcdui.Command(this.a(220), 1, 0, Resource.getCenterKeyIcon(1));
                this.ab = new com.siemens.mp.lcdui.Command(this.a(220), 1, 0, Resource.getCenterKeyIcon(1));
                this.ac = new com.siemens.mp.lcdui.Command(this.a(222), 2, 0, Resource.getCenterKeyIcon(1));
            } else {
                this.aa = new Command(this.a(220), 1, 0);
                this.ab = new Command(this.a(220), 1, 0);
                this.ac = new Command(this.a(222), 2, 0);
            }

            this.Y = new Command("", 2, 0);
            this.W = new Command("", 2, 0);
            this.X = new Command("", 2, 0);
            this.ad = new Command(this.a(215), 2, 0);
            this.ae = new Command(this.a(459), 2, 0);
            this.af = new Command(this.a(220), 4, 0);
            this.ag = new Command(this.a(220), 4, 0);
            this.ah = new Command(this.a(400), 1, 0);
            this.ai = new Command(this.a(400), 1, 0);
            this.aj = new Command(this.a(12), 2, 0);
            if (P) {
                this.al = new com.siemens.mp.lcdui.Command(this.a(523), 2, 0, Resource.getCenterKeyIcon(1));
                this.ak = new com.siemens.mp.lcdui.Command(this.a(522), 1, 0, Resource.getCenterKeyIcon(1));
            } else {
                this.al = new Command(this.a(523), 2, 0);
                this.ak = new Command(this.a(522), 1, 0);
            }

            this.ar = new List(this.a(208), 3);

            for(int var1 = 0; var1 < 5; ++var1) {
                this.ar.append(this.a(209 + var1), (Image)null);
            }

            this.ar.addCommand(this.Z);
            this.ar.setCommandListener(this);
            this.aq = new List(this.a(206), 2);
            this.aq.append(this.a(231), (Image)null);
            this.aq.append(this.a(233), (Image)null);
            this.aq.append(this.a(230), (Image)null);
            this.aq.addCommand(this.ac);
            this.aq.setCommandListener(this);
            this.aB = new TextBox(this.a(219), this.aw.dW, 12, 0);
            this.aB.addCommand(this.ab);
            this.aB.addCommand(this.ad);
            this.aB.setCommandListener(this);
            this.aC = new TextBox(this.a(454), "", 30, 3);
            this.aC.addCommand(this.ag);
            this.aC.addCommand(this.ad);
            this.aC.setCommandListener(this);
            this.am = new Form(this.a(217));
            String var4 = this.getAppProperty("MIDlet-Version");
            if (var4 == null) {
                var4 = "";
            }

            this.am.append("(c) 2003/2004\nelkware &\nSiemens mobile\n\ndeveloped by\nelkware GmbH\n\nwww.elkware.com\n\nVersion " + var4 + "\nDate " + "02.06.04");
            this.am.addCommand(this.al);
            this.am.setCommandListener(this);
            this.at = new List(this.a(285), 3, new String[]{this.a(283), this.a(284)}, (Image[])null);
            this.at.setCommandListener(this);
            this.at.addCommand(this.Z);
            this.au = new List(this.a(285), 3, new String[]{this.a(281)}, (Image[])null);
            this.au.setCommandListener(this);
            this.aG = this.c(472) == 1;
            String[] var2;
            if (this.aG) {
                var2 = new String[]{this.a(202), this.a(203), this.a(204), this.a(206), this.a(218), this.a(217), this.a(207)};
            } else {
                var2 = new String[]{this.a(202), this.a(203), this.a(286), this.a(204), this.a(206), this.a(218), this.a(217), this.a(207)};
            }

            this.Q = new List("Contest Arena Pro", 3, var2, (Image[])null);
            this.Q.setCommandListener(this);
            this.Q.addCommand(this.X);
            String[] var3 = new String[]{this.a(520)};
            this.T = new List(this.a(286), 3, var3, (Image[])null);
            this.T.addCommand(this.W);
            this.T.setCommandListener(this);
            this.S = new List(this.a(282), 3, new String[]{this.a(201), this.a(216), this.a(521), this.a(205), this.a(206), this.a(218), this.a(217), this.a(207)}, (Image[])null);
            this.S.addCommand(this.W);
            this.S.setCommandListener(this);
            this.R = new List("", 3, new String[]{this.a(240), this.a(241), this.a(242), this.a(243), this.a(222)}, (Image[])null);
            this.R.addCommand(this.W);
            this.R.setCommandListener(this);
            this.U = new List("", 3, new String[]{this.a(226), this.a(215)}, (Image[])null);
            this.U.addCommand(this.W);
            this.U.setCommandListener(this);
            this.V = new List("", 3, new String[]{this.a(226), this.a(215)}, (Image[])null);
            this.V.addCommand(this.W);
            this.V.setCommandListener(this);
        }
    }

    public void v() {
        this.a((Displayable)this.R);
    }

    public void w() {
        this.a((Displayable)this.U);
    }

    public void x() {
        this.aJ = true;
        this.l(10);
        this.a((Displayable)this.Q);
    }

    public void y() {
        this.aw.ak();
        this.aJ = true;
        this.l(14);
    }

    private void b(boolean var1) {
        if (var1 && this.aG) {
            Image var2 = this.aw.w(230);
            i var3 = new i(this, var2);
            var3.setFullScreenMode(true);
            super.b.setCurrent(var3);
            this.aI.start();
        } else {
            this.destroyApp(true);
        }

    }

    public void z() {
        this.aw.af();
        this.aw.eP = null;
        System.gc();
        if (this.aw.cN) {
            this.aw.a(0, 64, -1, true);
        }

        this.aw.i();
        this.aJ = true;
        this.l(10);
    }

    public void A() {
        this.aw.af();
        this.aw.eA = false;
        this.aw.eQ = null;
        this.aw.T();
        this.aw.i();
        this.aJ = true;
        this.l(10);
    }

    public void B() {
        this.aU = null;
        System.gc();
        this.aw.eh = false;
        this.l(14);
    }

    public void commandAction(Command var1, Displayable var2) {
        super.commandAction(var1, var2);
        if (var1 == this.X) {
            this.b(false);
        } else if (var1 == this.Y) {
            this.z();
        } else {
            int var5;
            if (var2 == this.Q) {
                var5 = this.Q.getSelectedIndex();
                if (this.aG && var5 > 1) {
                    ++var5;
                }

                switch (var5) {
                    case 0:
                        this.aw.ez = this.aw.eA = false;
                        this.l(11);
                        break;
                    case 1:
                        this.aw.ez = true;
                        this.aw.eA = false;
                        if (this.aw.cN) {
                            this.aw.ae();
                            this.aw.a(0, 67, 1, true);
                        }

                        if (this.aw.ao()) {
                            this.l(22);
                        } else {
                            this.aw.ig = true;
                            this.l(11);
                        }

                        this.aw.ar();
                        break;
                    case 2:
                        this.aw.o(0);
                        this.a((Displayable)this.aw);
                        this.aw.hK = true;
                        this.aw.ad();
                        this.aw.eA = true;
                        this.aw.ez = false;
                        this.aw.eF = true;
                        this.aw.o(10);
                        this.l(29);
                        break;
                    case 3:
                        this.aw.aj();
                        this.l(14);
                        this.aw.ar();
                        break;
                    case 4:
                        this.l(15);
                        break;
                    case 5:
                        this.l(17);
                        break;
                    case 6:
                        this.l(16);
                        break;
                    case 7:
                        this.b(true);
                }

            } else if (var2 == this.R) {
                if (var1.getCommandType() == 2) {
                    this.x();
                } else {
                    var5 = this.R.getSelectedIndex();
                    switch (var5) {
                        case 0:
                            this.aw.eg = true;
                            this.l(18);
                            break;
                        case 1:
                            this.aw.eg = false;
                            this.l(19);
                            break;
                        case 2:
                            Display.getDisplay(this).setCurrent(this.aC);
                            break;
                        case 3:
                            this.l(23);
                            break;
                        case 4:
                            this.a((Displayable)this.aw);
                    }

                }
            } else if (var2 == this.U) {
                if (var1.getCommandType() == 2) {
                    this.y();
                } else {
                    var5 = this.U.getSelectedIndex();
                    switch (var5) {
                        case 0:
                            this.aw.aj();
                            this.aJ = true;
                            this.l(14);
                            break;
                        case 1:
                            this.y();
                    }

                }
            } else if (var2 == this.V) {
                if (var1.getCommandType() == 2) {
                    this.B();
                } else {
                    var5 = this.V.getSelectedIndex();
                    switch (var5) {
                        case 0:
                            (new m(this, this, 3, (i)null)).start();
                            break;
                        case 1:
                            this.B();
                    }

                }
            } else if (var2 == this.S) {
                if (var1.getCommandType() == 2) {
                    this.aw.ai();
                } else {
                    var5 = this.S.getSelectedIndex();
                    switch (var5) {
                        case 0:
                            this.aw.ai();
                            break;
                        case 1:
                            this.aw.hA = false;
                            this.aw.o(0);
                            this.aw.ae();
                            this.aw.af();
                            break;
                        case 2:
                            this.aw.hA = false;
                            this.M();
                            break;
                        case 3:
                            this.aw.hA = true;
                            this.a((Displayable)this.aw);
                            break;
                        case 4:
                            this.aw.hA = false;
                            this.l(15);
                            break;
                        case 5:
                            this.aw.hA = false;
                            this.l(17);
                            break;
                        case 6:
                            this.aw.hA = false;
                            this.l(16);
                            break;
                        case 7:
                            this.b(true);
                    }

                }
            } else if (var2 == this.au) {
                var5 = this.au.getSelectedIndex();
                switch (var5) {
                    case 0:
                        this.au.removeCommand(this.Y);
                        this.aw.cJ = false;
                        this.aw._if = false;
                        if (this.aw.iq) {
                            this.aw.af();
                        } else {
                            if (this.aw.im == 0) {
                                this.aw.ex = com.elkware.midp.games.colorng.arena.high.b.m(4) + 1;
                            }

                            this.aw.ey = com.elkware.midp.games.colorng.arena.high.b.m(j.dR[this.aw.ex]) + 1;
                        }

                        this.aw.B(0);
                        this.a((Displayable)this.aw);
                    default:
                }
            } else if (var2 == this.at) {
                if (var1 == this.Z) {
                    this.aw.af();
                    this.aw.eA = false;
                    this.aw.eQ = null;
                    this.aw.T();
                    this.aw.i();
                    this.aJ = true;
                    this.l(10);
                } else {
                    this.aw.ig = this.at.getSelectedIndex() == 1;
                    if (this.aw.ig) {
                        this.l(11);
                    } else {
                        this.aw.o(0);
                        this.l(13);
                    }

                }
            } else if (var2 == this.T) {
                if (var1.getCommandType() == 2) {
                    this.A();
                } else {
                    var5 = this.T.getSelectedIndex();
                    switch (var5) {
                        case 0:
                            this.aw.ex = 5;
                            this.aw.ey = 1;
                            this.aw._if = this.aw.eF = false;
                            this.a((Displayable)this.aw);
                            return;
                        case 1:
                            this.aw.i();
                            this.aw.hD = new Thread(this.aw);
                            this.aw.hD.start();
                            return;
                        default:
                    }
                }
            } else {
                if (var1.getCommandType() == 2) {
                    switch (this.ax) {
                        case 16:
                            this.aJ = true;
                            this.l(10);
                            return;
                        case 17:
                            this.aJ = true;
                            this.l(10);
                            return;
                        case 25:
                            this.aJ = true;
                            this.l(10);
                            return;
                    }
                }

                if (var1.getCommandType() == 2 && this.ax == 15) {
                    this.aw.ea[0] = this.aq.isSelected(2);
                    this.aw.ea[1] = this.aq.isSelected(0);
                    this.aw.ea[2] = false;
                    this.aw.ea[3] = this.aq.isSelected(1);
                    this.aw.ea[4] = false;
                    this.aw.z();
                    this.aw.ae();
                    if (this.aw.cN) {
                        this.aw.a(0, 64, 10, true);
                    }

                    this.aw.a(this.aw.ea[1]);
                    this.l(10);
                } else {
                    if (var1 == this.ah) {
                        this.ap = new Form(this.a(400));
                        this.ap.append(this.a(406));
                        this.ap.setCommandListener(this);
                        this.l(28);
                    } else if (var1 == this.ai) {
                        this.ap = new Form(this.a(400));
                        this.ap.append(this.a(455));
                        this.ap.setCommandListener(this);
                        this.l(28);
                    } else if (var1 == this.ae) {
                        this.aO = null;
                        this.aJ = true;
                        this.l(10);
                    } else if (var1 == this.af) {
                        this.a((Displayable)this.aw);
                        this.aw.o(0);
                        this.aw.b(this.aw);
                    } else if (var1 != this.Z && var1 != this.ac && var1 != this.al) {
                        if (var1.getCommandType() == 1 && this.ax == 11) {
                            this.aw.ex = this.ar.getSelectedIndex();
                            if (this.aw.ez) {
                                this.aw.o(0);
                                this.a((Displayable)this.aw);
                                this.aw.o(0);
                                this.l(13);
                            } else {
                                this.l(12);
                            }
                        } else if (var1.getCommandType() == 1 && this.ax == 12) {
                            this.aw.ey = this.as.getSelectedIndex() + 1;
                            this.l(13);
                        } else if (var1 == this.ad) {
                            this.aJ = true;
                            this.aw.eg = false;
                            this.aw.aJ = false;
                            this.l(14);
                            this.aw.eg = false;
                            this.aw.aJ = false;
                        } else {
                            String var3;
                            if (var1 == this.ab) {
                                this.aw.b(false);
                                var3 = this.aB.getString().replace('\n', ' ');
                                this.aw.dW = var3.substring(0, Math.min(var3.length(), 10));
                                this.l(19);
                            } else if (var1 == this.aa) {
                                this.aw.aJ = false;
                                this.a((Displayable)this.aw);
                                this.aw.ad();
                            } else if (this.ax == 23) {
                                this.a((Displayable)this.aw);
                                this.l(24);
                            } else if (var1 == this.ag) {
                                this.a((Displayable)this.aw);
                                this.aw.c(this.aw);
                            } else if (var1 == this.ak) {
                                var3 = this.ba.getString();
                                Form var4 = new Form(this.a(19));
                                var4.append(this.a(127));
                                var4.addCommand(this.ac);
                                var4.setCommandListener(this);
                                this.a((Displayable)var4);
                                (new g(this, var3, (i)null)).start();
                            }
                        }
                    } else {
                        this.aw.o(0);
                        if (this.aw.eA) {
                            this.aw.af();
                            this.aw.eA = false;
                            this.aw.eQ = null;
                        }

                        this.aw.o(25);
                        this.aw.o(50);
                        if (this.aw.ez && this.aw.iq) {
                            this.aw._if = false;
                            this.aw.af();
                            this.aw.eP = null;
                            System.gc();
                        }

                        this.aw.o(75);
                        this.aw.o(100);
                        this.aw.T();
                        this.aw.repaint();
                        this.aw.serviceRepaints();
                        this.aJ = true;
                        this.l(10);
                        this.aw.i();
                    }

                }
            }
        }
    }

    public void C() {
        this.aw.o(0);
        boolean var1 = false;
        int var2 = -1;
        String var3 = this.aC.getString();
        String var4 = String.valueOf(this.az);
        String var5 = "sms://" + var3 + ":" + var4;
        MessageConnection var6 = null;

        try {
            byte[] var7 = this.J();
            int var8 = 0;
            this.aw.o(90);
            var6 = (MessageConnection)Connector.open(var5);

            for(var2 = 0; var2 < 3; ++var2) {
                byte[] var9 = new byte[2 + Math.min(125, var7.length - var8)];
                if (var9.length > 2) {
                    var9[0] = (byte)var2;
                    System.arraycopy(var7, var8, var9, 2, var9.length - 2);
                    var8 += var9.length - 2;
                    if (var8 == var7.length) {
                        var9[1] = 1;
                    }

                    BinaryMessage var10 = (BinaryMessage)var6.newMessage("binary");
                    var10.setAddress(var5);
                    var10.setPayloadData(var9);
                    var6.send(var10);
                    this.aw.o(90 + (var2 + 1) * 2);
                }
            }

            var6.close();
            this.aw.o(100);
        } catch (Exception var12) {
            var1 = true;
            if (var6 != null) {
                try {
                    var6.close();
                } catch (Exception var11) {
                }
            }

            this.aw.o(100);
            this.l("sendSMS: " + var12 + ", sms #" + var2);
        }

        if (!var1) {
            this.l(this.a(456));
        }

        this.aJ = true;
        this.l(14);
    }

    public void l(String var1) {
        try {
            this.e(var1);
            Thread.currentThread();
            Thread.sleep(5000L);
        } catch (Exception var3) {
        }

    }

    public void D() {
        this.a((Displayable)this.V);
    }

    public void E() {
        this.a((Displayable)this.S);
    }

    public void F() {
        this.au.addCommand(this.Y);
        this.a((Displayable)this.au);
    }

    public void G() {
        if (this.aw.hn != null && this.T.size() == 1) {
            this.T.append(this.a(292), (Image)null);
        }

        this.a((Displayable)this.T);
    }

    public void l(int var1) {
        if (var1 != this.ax || this.aJ) {
            this.ax = var1;
            int var4;
            int var6;
            switch (var1) {
                case 10:
                    this.aw.eq = null;
                    this.aw.i();
                    System.gc();
                    if (this.aw.hZ) {
                        this.E();
                    } else {
                        if (this.aS) {
                            this.ao = new Form(this.a(457));
                            this.ao.append(this.a(458) + " " + this.aR);
                            if (this.aL) {
                                this.ao.append("\n" + this.a(460));
                            }

                            this.ao.addCommand(this.af);
                            this.ao.addCommand(this.ae);
                            this.ao.setCommandListener(this);
                            this.a((Displayable)this.ao);
                            this.aS = false;
                            return;
                        }

                        this.a((Displayable)this.Q);
                    }
                    break;
                case 11:
                    this.a((Displayable)this.ar);
                    break;
                case 12:
                    if (this.aw.ex != 0) {
                        this.as = new List(this.a(300), 3);
                        var4 = Math.max(2, this.aw.ex);

                        for(var6 = 0; var6 < j.dR[this.aw.ex]; ++var6) {
                            this.as.append(this.a(j.dS[var4 + var6 / 5 % 5] + var6 % 5), (Image)null);
                        }

                        this.as.addCommand(this.Z);
                        this.as.setCommandListener(this);
                        this.a((Displayable)this.as);
                    } else {
                        this.l(13);
                    }
                    break;
                case 13:
                    this.a((Displayable)this.aw);
                    this.aw.a(this.aw);
                    break;
                case 14:
                    this.aw.aJ = false;
                    if (this.aw.U()) {
                        this.aw.A();
                    }

                    this.a((Displayable)this.aw);
                    this.aw.ad();
                    break;
                case 15:
                    this.aq.setSelectedFlags(new boolean[]{this.aw.ea[1], this.aw.ea[3], this.aw.ea[0]});
                    this.a((Displayable)this.aq);
                    break;
                case 16:
                    this.a((Displayable)this.am);
                    break;
                case 17:
                    if (this.an == null) {
                        this.an = new Form(this.a(218));
                        String var5 = this.a(200);

                        for(boolean var3 = true; (var6 = var5.indexOf("\nn")) != -1; var5 = var5.substring(0, var6) + '\n' + var5.substring(var6 + 2, var5.length() - var6 - 2)) {
                        }

                        this.an.append(var5);
                        this.an.addCommand(this.al);
                        this.an.setCommandListener(this);
                    }

                    this.a((Displayable)this.an);
                    break;
                case 18:
                    this.a((Displayable)this.aB);
                    break;
                case 19:
                    this.aw.eh = false;
                    this.aw.em = null;

                    for(var4 = 0; var4 < 4; ++var4) {
                        this.aw.dV[var4] = this.aw.dU[var4 + 2];
                    }

                    this.aw.aJ = true;
                    this.aw.s();
                    this.a((Displayable)this.aw);
                    this.aw.ad();
                    break;
                case 20:
                    this.a((Displayable)this.aw);
                case 21:
                case 26:
                case 27:
                default:
                    break;
                case 22:
                    this.a((Displayable)this.at);
                    break;
                case 23:
                    (new m(this, this, 1, (i)null)).start();
                    break;
                case 24:
                    (new m(this, this, 2, (i)null)).start();
                    break;
                case 25:
                    Form var2 = new Form(this.a(404));
                    var2.append(this.a(402));
                    var2.setCommandListener(this);
                    var2.addCommand(this.aa);
                    this.a((Displayable)var2);
                    break;
                case 28:
                    this.ap.addCommand(this.aj);
                    this.a((Displayable)this.ap);
                    break;
                case 29:
                    this.a((Displayable)this.aw);
                    this.aw.eA = true;
                    this.l(13);
            }

            this.aJ = false;
        }
    }

    public void H() {
        this.az = this.c(5105);
        if (this.aK == null) {
            this.aK = new h(this, String.valueOf(this.az));
            this.aK.start();
        }

    }

    public void b(String var1, String var2) {
    }

    public void a(byte[] var1, String var2) {
        this.c(var1);
    }

    public boolean j() {
        return false;
    }

    public void b(int var1, String var2) {
        this.g(var2);
        boolean var3 = false;

        try {
            var3 = this.j(var1);
        } catch (Exception var7) {
            return;
        }

        boolean var4 = var3 && super.B != null && super.B[0] != null && super.B[1] != null && super.B[2] != null;
        if (var4) {
            this.aw.gz = new String[3];
            this.aw.gA = new int[3];

            for(int var5 = 0; var5 < 3; ++var5) {
                if (super.B[var5] == null) {
                    this.aw.gz[var5] = "- - -";
                } else {
                    this.aw.gz[var5] = super.B[var5];
                }

                this.aw.gA[var5] = super.C[var5];
            }

            try {
                this.aw.a(var1, this.aw.gz, this.aw.gA);
            } catch (Exception var6) {
            }
        } else {
            String var8 = this.q();
            if (var8 != null) {
                this.l(this.a(24) + " " + var8);
            } else {
                this.l(this.a(24));
            }
        }

        if (var4) {
            this.aw.e();
        }

        this.l(29);
        this.aw.hD = null;
    }

    public boolean o() {
        return true;
    }

    public void c(byte[] var1) {
        if (this.aQ == null) {
            this.aQ = new boolean[5];
            this.aP = new byte[5][];
            this.aN = 5;
        }

        this.aQ[var1[0]] = true;
        this.aN = var1[1] == 1 ? var1[0] : this.aN;
        this.aP[var1[0]] = new byte[var1.length - 2];
        System.arraycopy(var1, 2, this.aP[var1[0]], 0, var1.length - 2);
        Object var5 = null;
        System.gc();

        int var2;
        for(var2 = 0; var2 <= this.aN; ++var2) {
            if (!this.aQ[var2]) {
                return;
            }
        }

        var2 = 0;

        int var3;
        for(var3 = 0; var3 <= this.aN; ++var3) {
            var2 += this.aP[var3].length;
        }

        this.aO = new byte[var2];
        var3 = 0;

        int var4;
        for(var4 = 0; var4 <= this.aN; ++var4) {
            System.arraycopy(this.aP[var4], 0, this.aO, var3, this.aP[var4].length);
            var3 += this.aP[var4].length;
        }

        this.aP = (byte[][])null;
        this.aQ = null;
        System.gc();
        this.aM = -1;
        this.aR = "";

        for(var4 = 1; var4 < 1 + this.aO[0]; ++var4) {
            this.aR = this.aR + (char)this.aO[var4];
        }

        this.aL = false;

        for(var4 = 0; var4 < this.aw.br; ++var4) {
            if (this.aR.compareTo(this.aw.eK[this.aw.eK.length - this.aw.br + var4]) == 0) {
                this.aM = var4;
                this.aL = true;
            }
        }

        this.aS = true;
    }

    public void pauseApp() {
        if (this.aw.V() && this.aw.hj) {
            this.aw.ah();
        }

    }

    private boolean I() {
        this.aT = true;
        this.av = new List(this.a(401), 3);

        try {
            FileConnection var1 = (FileConnection)Connector.open("file:///0:/Pictures", 3);
            this.aw.o(35);
            Enumeration var2 = var1.list("*.jpg", false);
            System.gc();
            this.aw.o(40);

            while(var2.hasMoreElements()) {
                String var3 = (String)var2.nextElement();
                if (!var3.endsWith("/")) {
                    this.av.append(var3, (Image)null);
                }
            }

            if (this.av.size() == 0) {
                return false;
            }

            var1.close();
            this.aw.o(80);
        } catch (Exception var4) {
            this.aT = false;
            this.l(var4.toString());
        }

        this.aw.o(100);
        this.av.addCommand(this.ad);
        this.av.setCommandListener(this);
        return this.av.size() > 0;
    }

    private void a(Image var1, int var2) {
        int[] var3 = new int[3];
        int var4 = var1.getWidth();
        int var5 = var1.getHeight();
        short var6 = 200;

        int var8;
        int var9;
        for(int var7 = 0; var7 < var4; ++var7) {
            for(var8 = 0; var8 < var5; ++var8) {
                var9 = com.siemens.mp.lcdui.Image.getPixelColor(var1, var7, var8);
                var3[0] = var9 & 255;
                var3[1] = var9 >> 8 & 255;
                var3[2] = var9 >> 16 & 255;
                if (var3[0] > var6 && var3[1] > var6 && var3[2] > var6) {
                    com.siemens.mp.lcdui.Image.setPixelColor(var1, var7, var8, var2);
                }
            }
        }

        Graphics var13 = var1.getGraphics();
        // Non-existent function
        //var8 = var13.getDisplayColor(var2) | -16777216;
        var8 = var2;
        var9 = var4 / 2;

        for(int var10 = 0; var10 < var5; ++var10) {
            int var11;
            int var12;
            for(var11 = var9; var11 > 1; --var11) {
                if (com.siemens.mp.lcdui.Image.getPixelColor(var1, var11, var10) == var8 && com.siemens.mp.lcdui.Image.getPixelColor(var1, var11 - 1, var10) == var8 && com.siemens.mp.lcdui.Image.getPixelColor(var1, var11 - 2, var10) == var8) {
                    for(var12 = var11; var12 >= 0; --var12) {
                        com.siemens.mp.lcdui.Image.setPixelColor(var1, var12, var10, var2);
                    }

                    var11 = 0;
                }
            }

            for(var11 = var9; var11 < var4 - 2; ++var11) {
                if (com.siemens.mp.lcdui.Image.getPixelColor(var1, var11, var10) == var8 && com.siemens.mp.lcdui.Image.getPixelColor(var1, var11 + 1, var10) == var8 && com.siemens.mp.lcdui.Image.getPixelColor(var1, var11 + 2, var10) == var8) {
                    for(var12 = var11; var12 < var4; ++var12) {
                        com.siemens.mp.lcdui.Image.setPixelColor(var1, var12, var10, var2);
                    }

                    var11 = var4;
                }
            }
        }

    }

    private boolean m(String var1) {
        try {
            this.aw.o(10);
            this.aU = null;
            this.aw.eO = null;
            System.gc();
            this.aw.o(20);
            if (this.aW == 18) {
                this.aU = com.siemens.mp.lcdui.Image.createImageFromFile("0:/pictures/headTmp.bmp", this.aW, this.aW);
                this.a(this.aU, 7799014);
            } else {
                this.aU = com.siemens.mp.lcdui.Image.createImageFromFile("0:/pictures/" + var1, 64, 48);
                this.aw.o(30);
                Image var2 = Image.createImage(this.aW, this.aW);
                this.aw.o(40);
                var2.getGraphics().drawImage(this.aU, -9, -2, 0);
                this.aw.o(50);
                this.a(var2, -1);
                this.aw.o(60);
                com.siemens.mp.lcdui.Image.writeBmpToFile(var2, "0:/pictures/headTmp.bmp");
                this.aw.o(70);
                this.aU = var2;
                var2 = null;
                this.aw.o(80);
            }

            System.gc();
            this.aw.o(90);
            return true;
        } catch (Exception var3) {
            this.e("computeImage: " + var3);
            return false;
        }
    }

    private byte[] J() {
        String var1 = this.aw.dW.substring(0, Math.min(50, this.aw.dW.length()));
        byte[] var2 = var1.getBytes();
        byte var3 = (byte)this.aw.dU[0];
        byte[] var4 = new byte[1];
        this.aw.getClass();
        if (var3 >= 4) {
            var4 = new byte[307];
        }

        var4[0] = var3;
        byte[] var5 = new byte[7 + var2.length + var4.length + aZ];
        this.aw.o(20);
        if (var4.length > 1) {
            Image var6 = null;

            try {
                var6 = this.aw.fa[var3];
            } catch (Exception var13) {
            }

            byte[] var7 = new byte[3];
            int var8 = var6.getWidth();
            int[] var9 = new int[var8 * var6.getHeight()];
            // Non-existent function
            //var6.getRGB(var9, 0, var8, 0, 0, var8, var6.getHeight());

            for(int var10 = 0; var10 < 18; ++var10) {
                for(int var11 = 0; var11 < 17; ++var11) {
                    int var12 = var9[var11 + var10 * var8];
                    var7[0] = (byte)((var12 & 255) >> 6);
                    var7[2] = (byte)((var12 >> 16 & 255) >> 5);
                    if (var12 >> 24 != 0) {
                        var7[1] = (byte)((var12 >> 8 & 255) >> 5);
                    } else {
                        var7[0] = 0;
                        var7[2] = 0;
                        var7[1] = 7;
                    }

                    var4[1 + var10 * 17 + var11] = (byte)(var7[2] << 5 | var7[1] << 2 | var7[0]);
                }

                this.aw.o(20 + var10 * 3);
            }
        }

        int var14 = 0;
        var5[var14++] = (byte)var2.length;

        int var15;
        for(var15 = 0; var15 < var2.length; ++var15) {
            var5[var14++] = var2[var15];
        }

        this.aw.o(80);

        for(var15 = 0; var15 < 6; ++var15) {
            var5[var14++] = (byte)this.aw.dU[var15];
        }

        for(var15 = 0; var15 < var4.length; ++var15) {
            var5[var14++] = var4[var15];
        }

        this.aw.o(85);
        return var5;
    }

    public void K() {
        this.aw.o(0);
        this.aw.a(this.aO, this.aR, this.aL);
        this.aO = null;
        this.aJ = true;
        this.aw.o(100);
        this.l(10);
    }

    public com.elkware.midp.games.colorng.i L() {
        try {
            return this.aw = new j(this);
        } catch (Exception var2) {
            return null;
        }
    }

    private boolean a(Image var1, String var2) {
        String var3 = "ContestArenaProShot";
        if (var2.equals("")) {
            return false;
        } else {
            MessagePart var4 = this.a(var1, "Arena.jpg", "Image1");
            if (var4 == null) {
                return false;
            } else {
                try {
                    com.siemens.mp.wireless.messaging.MessageConnection var5 = (com.siemens.mp.wireless.messaging.MessageConnection)Connector.open(var2);
                    MultipartMessage var6 = (MultipartMessage)var5.newMessage("multipart");
                    var6.setSubject(var3);
                    var6.addAddress("to", var2);
                    var6.addMessagePart(var4);
                    var5.send(var6);
                    var5.close();
                    return true;
                } catch (Exception var7) {
                    System.out.println("MMSException: " + var7);
                    return false;
                }
            }
        }
    }

    private MessagePart a(Image var1, String var2, String var3) {
        MessagePart var4 = null;

        try {
            com.siemens.mp.lcdui.Image.writeImageToFile(var1, "0:/Pictures/" + var2, 2);
            FileConnection var5 = (FileConnection)Connector.open("file:///0:/Pictures/" + var2);
            DataInputStream var6 = var5.openDataInputStream();
            var4 = new MessagePart(var6, "image/jpeg", var3, var2, (String)null);
            var5.close();
        } catch (Exception var7) {
            var7.printStackTrace();
        }

        return var4;
    }

    private void M() {
        try {
            this.ba = new TextBox(this.a(526), "mms://", 256, 0);
            this.ba.addCommand(this.ac);
            this.ba.addCommand(this.ak);
            this.ba.setCommandListener(this);
            this.a((Displayable)this.ba);
        } catch (Exception var2) {
        }

    }

    public void destroyApp(boolean var1) {
        if (this.aK != null) {
            this.aK.N();
            this.aK = null;
        }

        this.aw.aH();
        this.notifyDestroyed();
    }

    static boolean a(a var0, boolean var1) {
        return var0.aH = var1;
    }

    static boolean a(a var0) {
        return var0.aH;
    }

    static j b(a var0) {
        return var0.aw;
    }

    static boolean a(a var0, Image var1, String var2) {
        return var0.a(var1, var2);
    }

    static void a(a var0, Displayable var1) {
        var0.a(var1);
    }

    static String c(a var0) {
        return var0.aA;
    }

    static boolean a(a var0, String var1) {
        return var0.m(var1);
    }

    static String b(a var0, String var1) {
        return var0.aA = var1;
    }

    static List d(a var0) {
        return var0.av;
    }

    static boolean e(a var0) {
        return var0.I();
    }

    static boolean f(a var0) {
        return var0.aT;
    }

    static List a(a var0, List var1) {
        return var0.av = var1;
    }

    static Command g(a var0) {
        return var0.ad;
    }
}
