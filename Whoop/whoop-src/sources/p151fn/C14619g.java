package p151fn;

import ed3.C13117a;
import java.util.Arrays;
import p012ab.C0690l0;
import p309lo.AbstractC24543a;
import p309lo.C24561s;
import p465rm.C31518b0;
import p465rm.C31521c0;
import p588wm.InterfaceC37369k;
import p588wm.InterfaceC37377s;
import tm.AbstractC33922a;

/* JADX INFO: renamed from: fn.g */
/* JADX INFO: loaded from: classes6.dex */
public final class C14619g implements InterfaceC14620h {

    /* JADX INFO: renamed from: b */
    public final String f53878b;

    /* JADX INFO: renamed from: c */
    public String f53879c;

    /* JADX INFO: renamed from: d */
    public InterfaceC37377s f53880d;

    /* JADX INFO: renamed from: f */
    public int f53882f;

    /* JADX INFO: renamed from: g */
    public int f53883g;

    /* JADX INFO: renamed from: h */
    public long f53884h;

    /* JADX INFO: renamed from: i */
    public C31521c0 f53885i;

    /* JADX INFO: renamed from: j */
    public int f53886j;

    /* JADX INFO: renamed from: a */
    public final C13117a f53877a = new C13117a(new byte[18], 1, (byte) 0);

    /* JADX INFO: renamed from: e */
    public int f53881e = 0;

    /* JADX INFO: renamed from: k */
    public long f53887k = -9223372036854775807L;

    public C14619g(String str) {
        this.f53878b = str;
    }

    @Override // p151fn.InterfaceC14620h
    /* JADX INFO: renamed from: a */
    public final void mo41817a() {
        this.f53881e = 0;
        this.f53882f = 0;
        this.f53883g = 0;
        this.f53887k = -9223372036854775807L;
    }

    @Override // p151fn.InterfaceC14620h
    /* JADX INFO: renamed from: d */
    public final void mo41818d(int i13, long j7) {
        if (j7 != -9223372036854775807L) {
            this.f53887k = j7;
        }
    }

    /* JADX WARN: Code duplicated, block: B:64:0x0238  */
    /* JADX WARN: Code duplicated, block: B:67:0x0240  */
    /* JADX WARN: Code duplicated, block: B:69:0x0243  */
    /* JADX WARN: Code duplicated, block: B:71:0x0247  */
    /* JADX WARN: Code duplicated, block: B:73:0x025d  */
    /* JADX WARN: Code duplicated, block: B:75:0x026e  */
    /* JADX WARN: Code duplicated, block: B:76:0x027a  */
    @Override // p151fn.InterfaceC14620h
    /* JADX INFO: renamed from: f */
    public final void mo1711f(C13117a c13117a) {
        int i13;
        int i14;
        int i15;
        byte b;
        int i16;
        int i17;
        int i18;
        int i19;
        byte b6;
        int i24;
        byte b8;
        C24561s c24561s;
        int i25;
        AbstractC24543a.m71574j(this.f53880d);
        while (c13117a.m36692a() > 0) {
            int i26 = this.f53881e;
            int i27 = 8;
            int i28 = 2;
            C13117a c13117a2 = this.f53877a;
            if (i26 == 0) {
                while (c13117a.m36692a() > 0) {
                    int i29 = this.f53883g << 8;
                    this.f53883g = i29;
                    int iM36715y = i29 | c13117a.m36715y();
                    this.f53883g = iM36715y;
                    if (iM36715y == 2147385345 || iM36715y == -25230976 || iM36715y == 536864768 || iM36715y == -14745368) {
                        byte[] bArr = c13117a2.f45381a;
                        bArr[0] = (byte) ((iM36715y >> 24) & 255);
                        bArr[1] = (byte) ((iM36715y >> 16) & 255);
                        bArr[2] = (byte) ((iM36715y >> 8) & 255);
                        bArr[3] = (byte) (iM36715y & 255);
                        this.f53882f = 4;
                        this.f53883g = 0;
                        this.f53881e = 1;
                        break;
                    }
                }
            } else if (i26 == 1) {
                byte[] bArr2 = c13117a2.f45381a;
                int iMin = Math.min(c13117a.m36692a(), 18 - this.f53882f);
                c13117a.m36697g(bArr2, this.f53882f, iMin);
                int i34 = this.f53882f + iMin;
                this.f53882f = i34;
                if (i34 == 18) {
                    byte[] bArr3 = c13117a2.f45381a;
                    if (this.f53885i == null) {
                        String str = this.f53879c;
                        i14 = 0;
                        if (bArr3[0] == 127) {
                            c24561s = new C24561s(bArr3, bArr3.length, 0, (byte) 0);
                            i13 = 8;
                            i25 = 2;
                        } else {
                            byte[] bArrCopyOf = Arrays.copyOf(bArr3, bArr3.length);
                            byte b14 = bArrCopyOf[0];
                            if (b14 == -2 || b14 == -1) {
                                for (int i35 = 0; i35 < bArrCopyOf.length - 1; i35 += 2) {
                                    byte b15 = bArrCopyOf[i35];
                                    int i36 = i35 + 1;
                                    bArrCopyOf[i35] = bArrCopyOf[i36];
                                    bArrCopyOf[i36] = b15;
                                }
                            }
                            c24561s = new C24561s(bArrCopyOf, bArrCopyOf.length, 0, (byte) 0);
                            if (bArrCopyOf[0] == 31) {
                                C24561s c24561s2 = new C24561s(bArrCopyOf, bArrCopyOf.length, 0, (byte) 0);
                                while (c24561s2.m71625b() >= 16) {
                                    c24561s2.m71643t(i28);
                                    int iM71632i = c24561s2.m71632i(14) & 16383;
                                    int iMin2 = Math.min(8 - c24561s.f95860d, 14);
                                    int i37 = c24561s.f95860d;
                                    int i38 = (8 - i37) - iMin2;
                                    byte[] bArr4 = c24561s.f95858b;
                                    int i39 = i28;
                                    int i44 = c24561s.f95859c;
                                    byte b16 = (byte) (bArr4[i44] & ((65280 >> i37) | ((1 << i38) - 1)));
                                    bArr4[i44] = b16;
                                    int i45 = 14 - iMin2;
                                    bArr4[i44] = (byte) (b16 | ((iM71632i >>> i45) << i38));
                                    int i46 = i44 + 1;
                                    while (i45 > i27) {
                                        c24561s.f95858b[i46] = (byte) (iM71632i >>> (i45 - 8));
                                        i45 -= 8;
                                        i46++;
                                        i27 = i27;
                                    }
                                    int i47 = i27;
                                    int i48 = 8 - i45;
                                    byte[] bArr5 = c24561s.f95858b;
                                    byte b17 = (byte) (bArr5[i46] & ((1 << i48) - 1));
                                    bArr5[i46] = b17;
                                    bArr5[i46] = (byte) (((iM71632i & ((1 << i45) - 1)) << i48) | b17);
                                    c24561s.m71643t(14);
                                    c24561s.m71624a();
                                    i28 = i39;
                                    i27 = i47;
                                }
                            }
                            i13 = i27;
                            i25 = i28;
                            c24561s.m71638o(bArrCopyOf.length, bArrCopyOf);
                        }
                        c24561s.m71643t(60);
                        int i49 = AbstractC33922a.f142145j[c24561s.m71632i(6)];
                        int i54 = AbstractC33922a.f142146k[c24561s.m71632i(4)];
                        int iM71632i2 = c24561s.m71632i(5);
                        int i55 = iM71632i2 >= 29 ? -1 : (AbstractC33922a.f142147l[iM71632i2] * 1000) / 2;
                        c24561s.m71643t(10);
                        int i56 = i49 + (c24561s.m71632i(i25) > 0 ? 1 : 0);
                        C31518b0 c31518b0 = new C31518b0();
                        c31518b0.f130037a = str;
                        c31518b0.f130047k = "audio/vnd.dts";
                        c31518b0.f130042f = i55;
                        c31518b0.f130060x = i56;
                        c31518b0.f130061y = i54;
                        c31518b0.f130050n = null;
                        c31518b0.f130039c = this.f53878b;
                        C31521c0 c31521c0 = new C31521c0(c31518b0);
                        this.f53885i = c31521c0;
                        this.f53880d.mo102730a(c31521c0);
                    } else {
                        i13 = 8;
                        i14 = 0;
                    }
                    byte b18 = bArr3[i14];
                    if (b18 != -2) {
                        if (b18 == -1) {
                            i24 = ((bArr3[7] & 3) << 12) | ((bArr3[6] & 255) << 4);
                            b8 = bArr3[9];
                        } else if (b18 != 31) {
                            i15 = ((bArr3[5] & 3) << 12) | ((bArr3[6] & 255) << 4);
                            b = bArr3[7];
                        } else {
                            i24 = ((bArr3[6] & 3) << 12) | ((bArr3[7] & 255) << 4);
                            b8 = bArr3[i13];
                        }
                        i17 = (i24 | ((b8 & 60) >> 2)) + 1;
                        i16 = 1;
                        if (i16 != 0) {
                            i17 = (i17 * 16) / 14;
                        }
                        this.f53886j = i17;
                        if (b18 != -2) {
                            if (b18 != -1) {
                                i18 = (bArr3[4] & 7) << 4;
                                b6 = bArr3[7];
                            } else if (b18 != 31) {
                                i18 = (bArr3[4] & 1) << 6;
                                i19 = bArr3[5] & 252;
                            } else {
                                i18 = (bArr3[5] & 7) << 4;
                                b6 = bArr3[6];
                            }
                            i19 = b6 & 60;
                        } else {
                            i18 = (bArr3[5] & 1) << 6;
                            i19 = bArr3[4] & 252;
                        }
                        this.f53884h = (int) ((((long) ((((i19 >> 2) | i18) + 1) * 32)) * 1000000) / ((long) this.f53885i.f130091Z));
                        c13117a2.m36689K(i14);
                        this.f53880d.mo102732c(18, c13117a2);
                        this.f53881e = 2;
                    } else {
                        i15 = ((bArr3[4] & 3) << 12) | ((bArr3[7] & 255) << 4);
                        b = bArr3[6];
                    }
                    i17 = (i15 | ((b & 240) >> 4)) + 1;
                    i16 = i14;
                    if (i16 != 0) {
                        i17 = (i17 * 16) / 14;
                    }
                    this.f53886j = i17;
                    if (b18 != -2) {
                        if (b18 != -1) {
                            i18 = (bArr3[4] & 7) << 4;
                            b6 = bArr3[7];
                        } else if (b18 != 31) {
                            i18 = (bArr3[4] & 1) << 6;
                            i19 = bArr3[5] & 252;
                        } else {
                            i18 = (bArr3[5] & 7) << 4;
                            b6 = bArr3[6];
                        }
                        i19 = b6 & 60;
                    } else {
                        i18 = (bArr3[5] & 1) << 6;
                        i19 = bArr3[4] & 252;
                    }
                    this.f53884h = (int) ((((long) ((((i19 >> 2) | i18) + 1) * 32)) * 1000000) / ((long) this.f53885i.f130091Z));
                    c13117a2.m36689K(i14);
                    this.f53880d.mo102732c(18, c13117a2);
                    this.f53881e = 2;
                }
            } else {
                if (i26 != 2) {
                    throw new IllegalStateException();
                }
                int iMin3 = Math.min(c13117a.m36692a(), this.f53886j - this.f53882f);
                this.f53880d.mo102732c(iMin3, c13117a);
                int i57 = this.f53882f + iMin3;
                this.f53882f = i57;
                int i58 = this.f53886j;
                if (i57 == i58) {
                    long j7 = this.f53887k;
                    if (j7 != -9223372036854775807L) {
                        this.f53880d.mo102733d(j7, 1, i58, 0, null);
                        this.f53887k += this.f53884h;
                    }
                    this.f53881e = 0;
                }
            }
        }
    }

    @Override // p151fn.InterfaceC14620h
    /* JADX INFO: renamed from: g */
    public final void mo1712g(InterfaceC37369k interfaceC37369k, C0690l0 c0690l0) {
        c0690l0.m1733c();
        c0690l0.m1738h();
        this.f53879c = (String) c0690l0.f2495f;
        c0690l0.m1738h();
        this.f53880d = interfaceC37369k.mo3102o(c0690l0.f2494e, 1);
    }

    @Override // p151fn.InterfaceC14620h
    /* JADX INFO: renamed from: h */
    public final void mo1713h() {
    }
}
