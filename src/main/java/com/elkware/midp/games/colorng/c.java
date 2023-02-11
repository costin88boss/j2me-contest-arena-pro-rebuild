package com.elkware.midp.games.colorng;
//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

import com.siemens.mp.game.Light;

import javax.microedition.lcdui.Canvas;
import javax.microedition.lcdui.Graphics;

public abstract class c extends Canvas {
    public j iH;
    public int[] iI;
    public int[] iJ;
    public int iK;
    public int iL;
    public int iM;
    public int iN;
    public boolean iO;
    public boolean iP = true;

    public c(j var1) {
        this.iH = var1;
        this.setFullScreenMode(true);
        this.a(0, 0, this.getWidth(), this.getHeight());
    }

    // Non-existent function
    public void setFullScreenMode(boolean b) {

    }

    public void au() {
        this.repaint();
        this.serviceRepaints();
    }

    public void paint(Graphics var1) {
        try {
            this.l(var1);
        } catch (Exception var3) {
            this.iH.e("paintFrame: " + var3);
        }

    }

    public abstract void l(Graphics var1);

    public void a(int var1, int var2, int var3, int var4) {
        this.iM = var1;
        this.iN = var2;
        if (var3 != this.iK || var4 != this.iL) {
            this.iI = this.iJ = null;
        }

        this.iK = var3;
        this.iL = var4;
    }

    public final void m(Graphics var1) {
        this.a(var1, this.iM, this.iN);
    }

    public void a(Graphics var1, int var2, int var3) {
        if (this.iO) {
            int var4;
            label37: {
                var4 = 0;
                int var5 = this.iK;
                int var6 = this.iL;
                var1.setClip(var2, var3, this.iK, this.iL);
                if (var2 < 0) {
                    if (var2 < -var5) {
                        break label37;
                    }

                    var4 = -var2;
                    var5 += var2;
                    var2 = 0;
                }

                if (var3 < 0) {
                    if (var3 < -var6) {
                        break label37;
                    }

                    var4 += this.iK * -var3;
                    var6 += var3;
                    var3 = 0;
                }

                // Non-existent function
                //var1.drawRGB(this.iI, var4, this.iK, var2, var3, var5, var6, true);
            }

            if (this.iP) {
                for(var4 = 0; var4 < this.iI.length; var4 += this.iK) {
                    System.arraycopy(this.iJ, 0, this.iI, var4, this.iK);
                }
            }
        }

        this.iO = false;
    }

    protected void av() {
        if (this.iI == null) {
            this.iI = new int[this.iK * (this.iL + 1)];
            if (this.iP) {
                this.iJ = new int[this.iK];
            }
        }

    }

    public void a(Graphics var1, byte[] var2, boolean var3, int var4, int var5, int[] var6, int var7, int var8, boolean var9, boolean var10, int var11, int var12, int var13, int var14) {
        int var18 = 0;
        int var19 = 0;
        int var22 = var4;
        int var23 = var5;
        var7 += var1.getTranslateX();
        var8 += var1.getTranslateY();
        var7 -= this.iM;
        var8 -= this.iN;
        var11 -= this.iM;
        var12 -= this.iN;
        var13 -= this.iM;
        var14 -= this.iN;
        if (var11 < 0) {
            var11 = 0;
        }

        if (var13 > this.iK) {
            var13 = this.iK;
        }

        if (var12 < 0) {
            var12 = 0;
        }

        if (var14 > this.iL) {
            var14 = this.iL;
        }

        if (var8 < var12) {
            if ((var5 += var8 - var12) <= 0) {
                return;
            }

            var18 = -(var8 - var12);
            var8 = var12;
        }

        if (var8 + var5 <= var14 || (var5 = var14 - var8) > 0) {
            if (var7 < var11) {
                if ((var4 += var7 - var11) <= 0) {
                    return;
                }

                var19 = -(var7 - var11);
                var7 = var11;
            }

            if (var7 + var4 <= var13 || (var4 = var13 - var7) > 0) {
                int var15 = var8 * this.iK + var7;
                int var16 = this.iK - var4;
                this.av();
                if (var10) {
                    var18 = var23 - 1 - var18;
                }

                if (var9) {
                    var19 = var22 - 1 - var19;
                }

                int var17;
                int var20;
                int var24;
                if (var3) {
                    boolean var25 = (var19 & 1) == 1;
                    boolean var26 = (var19 + var4 & 1) == 1;
                    var22 = var22 + 1 >> 1;
                    if (!var9) {
                        var4 = (var19 & 1) + var4 + 1 >> 1;
                        if (!var10) {
                            var20 = var22 - var4;
                        } else {
                            var20 = -var22 - var4;
                        }
                    } else {
                        var4 = 1 - (var19 & 1) + var4 + 1 >> 1;
                        var20 = var22 + var4;
                        var25 = !var25;
                        var26 = !var26;
                    }

                    var17 = var18 * var22 + (var19 >> 1);
                    if (var25) {
                        --var4;
                    }

                    if (var26) {
                        --var4;
                    }

                    byte var21;
                    int var27;
                    int var28;
                    if (!var9) {
                        for(var27 = var5; var27 > 0; --var27) {
                            if (var25) {
                                var21 = var2[var17++];
                                if ((var24 = var6[var21 & 15]) != 0) {
                                    this.iI[var15] = var24;
                                }

                                ++var15;
                            }

                            for(var28 = var4; var28 > 0; --var28) {
                                var21 = var2[var17++];
                                if ((var24 = var6[var21 & 240]) != 0) {
                                    this.iI[var15] = var24;
                                }

                                ++var15;
                                if ((var24 = var6[var21 & 15]) != 0) {
                                    this.iI[var15] = var24;
                                }

                                ++var15;
                            }

                            if (var26) {
                                var21 = var2[var17++];
                                if ((var24 = var6[var21 & 240]) != 0) {
                                    this.iI[var15] = var24;
                                }

                                ++var15;
                            }

                            var15 += var16;
                            var17 += var20;
                        }
                    } else {
                        for(var27 = var5; var27 > 0; --var27) {
                            if (var25) {
                                var21 = var2[var17--];
                                if ((var24 = var6[var21 & 240]) != 0) {
                                    this.iI[var15] = var24;
                                }

                                ++var15;
                            }

                            for(var28 = var4; var28 > 0; --var28) {
                                var21 = var2[var17--];
                                if ((var24 = var6[var21 & 15]) != 0) {
                                    this.iI[var15] = var24;
                                }

                                ++var15;
                                if ((var24 = var6[var21 & 240]) != 0) {
                                    this.iI[var15] = var24;
                                }

                                ++var15;
                            }

                            if (var26) {
                                var21 = var2[var17--];
                                if ((var24 = var6[var21 & 15]) != 0) {
                                    this.iI[var15] = var24;
                                }

                                ++var15;
                            }

                            var15 += var16;
                            var17 += var20;
                        }
                    }
                } else {
                    if (!var9) {
                        if (!var10) {
                            var20 = var22 - var4;
                        } else {
                            var20 = -var22 - var4;
                        }
                    } else {
                        var20 = var22 + var4;
                    }

                    var17 = var18 * var22 + var19;
                    int var29;
                    int var30;
                    if (!var9) {
                        for(var29 = var5; var29 > 0; --var29) {
                            for(var30 = var4; var30 > 0; --var30) {
                                if ((var24 = var6[var2[var17++]]) != 0) {
                                    this.iI[var15] = var24;
                                }

                                ++var15;
                            }

                            var15 += var16;
                            var17 += var20;
                        }
                    } else {
                        for(var29 = var5; var29 > 0; --var29) {
                            for(var30 = var4; var30 > 0; --var30) {
                                if ((var24 = var6[var2[var17--]]) != 0) {
                                    this.iI[var15] = var24;
                                }

                                ++var15;
                            }

                            var15 += var16;
                            var17 += var20;
                        }
                    }
                }

                this.iO = true;
            }
        }
    }

    public void a(Graphics var1, byte[] var2, boolean var3, int var4, int var5, int[] var6, int var7, int var8, int var9, int var10, boolean var11, boolean var12, int var13, int var14, int var15, int var16) {
        int var17 = 0;
        int var19 = 0;
        boolean var21 = false;
        if (var9 != 0 && var10 != 0) {
            int var23 = var5 * 65536 / var10;
            int var24 = var4 * 65536 / var9;
            var7 += var1.getTranslateX();
            var8 += var1.getTranslateY();
            var7 -= this.iM;
            var8 -= this.iN;
            var13 -= this.iM;
            var14 -= this.iN;
            var15 -= this.iM;
            var16 -= this.iN;
            if (var13 < 0) {
                var13 = 0;
            }

            if (var15 > this.iK) {
                var15 = this.iK;
            }

            if (var14 < 0) {
                var14 = 0;
            }

            if (var16 > this.iL) {
                var16 = this.iL;
            }

            if (var8 < var14) {
                if ((var10 += var8 - var14) <= 0) {
                    return;
                }

                var17 += (var14 - var8) * var23;
                var8 = var14;
            }

            if (var8 + var10 <= var16 || (var10 = var16 - var8) > 0) {
                if (var7 < var13) {
                    if ((var9 += var7 - var13) <= 0) {
                        return;
                    }

                    var19 += (var13 - var7) * var24;
                    var7 = var13;
                }

                if (var7 + var9 <= var15 || (var9 = var15 - var7) > 0) {
                    int var29 = var8 * this.iK + var7;
                    int var22 = this.iK - var9;
                    if (var11) {
                        var19 = (var4 - 1 << 16) + '\uffff' - var19;
                        var24 = -var24;
                    } else if (var12) {
                        var17 = (var5 - 1 << 16) + '\uffff' - var17;
                        var23 = -var23;
                    }

                    this.av();
                    int var18;
                    int var20;
                    int var25;
                    int var26;
                    int var27;
                    if (var3) {
                        int var28 = var4 + 1 >> 1;

                        for(var26 = var10; var26 > 0; --var26) {
                            var18 = (var17 >> 16) * var28;
                            var20 = var19;

                            for(var25 = var9; var25 > 0; --var25) {
                                if ((var20 & 65536) == 0) {
                                    var27 = var6[var2[var18 + (var20 >> 17)] & 240];
                                } else {
                                    var27 = var6[var2[var18 + (var20 >> 17)] & 15];
                                }

                                if (var27 != 0) {
                                    this.iI[var29] = var27;
                                }

                                ++var29;
                                var20 += var24;
                            }

                            var17 += var23;
                            var29 += var22;
                        }
                    } else {
                        for(var26 = var10; var26 > 0; --var26) {
                            var18 = (var17 >> 16) * var4;
                            var20 = var19;

                            for(var25 = var9; var25 > 0; --var25) {
                                if ((var27 = var6[var2[var18 + (var20 >> 16)]]) != 0) {
                                    this.iI[var29] = var27;
                                }

                                ++var29;
                                var20 += var24;
                            }

                            var17 += var23;
                            var29 += var22;
                        }
                    }

                    this.iO = true;
                }
            }
        }
    }

    public int getHeight() {
        return 176;
    }

    public void e(long var1) {
        // Non-existent function
        //Display.getDisplay(this.iH).vibrate((int)var1);
    }

    public void a(int var1, boolean var2) {
        if (0 == var1) {
            if (var2) {
                Light.setLightOn();
            } else {
                Light.setLightOff();
            }
        }

    }
}
