package p151fn;

import cr.C11078p;
import ed3.C13117a;
import p012ab.C0690l0;
import p309lo.AbstractC24543a;
import p309lo.AbstractC24567y;
import p309lo.C24561s;
import p465rm.C31518b0;
import p465rm.C31521c0;
import p588wm.InterfaceC37369k;
import p588wm.InterfaceC37377s;
import tm.AbstractC33922a;

/* JADX INFO: renamed from: fn.b */
/* JADX INFO: loaded from: classes6.dex */
public final class C14614b implements InterfaceC14620h {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f53828a;

    /* JADX INFO: renamed from: b */
    public final C24561s f53829b;

    /* JADX INFO: renamed from: c */
    public final C13117a f53830c;

    /* JADX INFO: renamed from: d */
    public final String f53831d;

    /* JADX INFO: renamed from: e */
    public String f53832e;

    /* JADX INFO: renamed from: f */
    public InterfaceC37377s f53833f;

    /* JADX INFO: renamed from: g */
    public int f53834g;

    /* JADX INFO: renamed from: h */
    public int f53835h;

    /* JADX INFO: renamed from: i */
    public boolean f53836i;

    /* JADX INFO: renamed from: j */
    public long f53837j;

    /* JADX INFO: renamed from: k */
    public C31521c0 f53838k;

    /* JADX INFO: renamed from: l */
    public int f53839l;

    /* JADX INFO: renamed from: m */
    public long f53840m;

    public C14614b(String str, int i13) {
        this.f53828a = i13;
        switch (i13) {
            case 1:
                byte[] bArr = new byte[16];
                this.f53829b = new C24561s(bArr, 16, 0, (byte) 0);
                this.f53830c = new C13117a(bArr, 1, (byte) 0);
                this.f53834g = 0;
                this.f53835h = 0;
                this.f53836i = false;
                this.f53840m = -9223372036854775807L;
                this.f53831d = str;
                break;
            default:
                byte[] bArr2 = new byte[128];
                this.f53829b = new C24561s(bArr2, 128, 0, (byte) 0);
                this.f53830c = new C13117a(bArr2, 1, (byte) 0);
                this.f53834g = 0;
                this.f53840m = -9223372036854775807L;
                this.f53831d = str;
                break;
        }
    }

    /* JADX INFO: renamed from: b */
    private final void m41815b() {
    }

    /* JADX INFO: renamed from: c */
    private final void m41816c() {
    }

    @Override // p151fn.InterfaceC14620h
    /* JADX INFO: renamed from: a */
    public final void mo41817a() {
        switch (this.f53828a) {
            case 0:
                this.f53834g = 0;
                this.f53835h = 0;
                this.f53836i = false;
                this.f53840m = -9223372036854775807L;
                break;
            default:
                this.f53834g = 0;
                this.f53835h = 0;
                this.f53836i = false;
                this.f53840m = -9223372036854775807L;
                break;
        }
    }

    @Override // p151fn.InterfaceC14620h
    /* JADX INFO: renamed from: d */
    public final void mo41818d(int i13, long j7) {
        switch (this.f53828a) {
            case 0:
                if (j7 != -9223372036854775807L) {
                    this.f53840m = j7;
                }
                break;
            default:
                if (j7 != -9223372036854775807L) {
                    this.f53840m = j7;
                }
                break;
        }
    }

    /* JADX WARN: Code duplicated, block: B:177:0x0310  */
    /* JADX WARN: Code duplicated, block: B:198:0x0350  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // p151fn.InterfaceC14620h
    /* JADX INFO: renamed from: f */
    public final void mo1711f(C13117a c13117a) {
        int i13;
        int i14;
        int i15;
        String str;
        int iM71632i;
        int i16;
        byte b;
        int i17;
        int i18;
        int i19;
        int i24;
        int i25;
        int i26;
        int i27;
        int i28;
        int i29;
        int i34;
        switch (this.f53828a) {
            case 0:
                AbstractC24543a.m71574j(this.f53833f);
                while (c13117a.m36692a() > 0) {
                    int i35 = this.f53834g;
                    C13117a c13117a2 = this.f53830c;
                    if (i35 == 0) {
                        while (c13117a.m36692a() > 0) {
                            if (this.f53836i) {
                                int iM36715y = c13117a.m36715y();
                                if (iM36715y == 119) {
                                    this.f53836i = false;
                                    this.f53834g = 1;
                                    byte[] bArr = c13117a2.f45381a;
                                    bArr[0] = 11;
                                    bArr[1] = 119;
                                    this.f53835h = 2;
                                }
                                this.f53836i = iM36715y == 11;
                            } else {
                                this.f53836i = c13117a.m36715y() == 11;
                            }
                            break;
                        }
                    } else if (i35 == 1) {
                        byte[] bArr2 = c13117a2.f45381a;
                        int iMin = Math.min(c13117a.m36692a(), 128 - this.f53835h);
                        c13117a.m36697g(bArr2, this.f53835h, iMin);
                        int i36 = this.f53835h + iMin;
                        this.f53835h = i36;
                        if (i36 == 128) {
                            C24561s c24561s = this.f53829b;
                            c24561s.m71640q(0);
                            int[] iArr = AbstractC33922a.f142141f;
                            int[] iArr2 = AbstractC33922a.f142139d;
                            int iM71630g = c24561s.m71630g();
                            c24561s.m71643t(40);
                            Object[] objArr = c24561s.m71632i(5) > 10;
                            c24561s.m71640q(iM71630g);
                            if (objArr == true) {
                                c24561s.m71643t(16);
                                int iM71632i2 = c24561s.m71632i(2);
                                if (iM71632i2 == 0) {
                                    b = 0;
                                } else if (iM71632i2 != 1) {
                                    b = iM71632i2 != 2 ? (byte) -1 : (byte) 2;
                                } else {
                                    b = 1;
                                }
                                c24561s.m71643t(3);
                                iM71632i = (c24561s.m71632i(11) + 1) * 2;
                                int iM71632i3 = c24561s.m71632i(2);
                                if (iM71632i3 == 3) {
                                    i16 = AbstractC33922a.f142140e[c24561s.m71632i(2)];
                                    i17 = 3;
                                    i18 = 6;
                                } else {
                                    int iM71632i4 = c24561s.m71632i(2);
                                    int i37 = AbstractC33922a.f142138c[iM71632i4];
                                    i16 = iArr2[iM71632i3];
                                    i17 = iM71632i4;
                                    i18 = i37;
                                }
                                i15 = i18 * 256;
                                int iM71632i5 = c24561s.m71632i(3);
                                boolean zM71631h = c24561s.m71631h();
                                i14 = iArr[iM71632i5] + (zM71631h ? 1 : 0);
                                c24561s.m71643t(10);
                                if (c24561s.m71631h()) {
                                    c24561s.m71643t(8);
                                }
                                if (iM71632i5 == 0) {
                                    c24561s.m71643t(5);
                                    if (c24561s.m71631h()) {
                                        c24561s.m71643t(8);
                                    }
                                }
                                if (b == 1 && c24561s.m71631h()) {
                                    c24561s.m71643t(16);
                                }
                                if (c24561s.m71631h()) {
                                    if (iM71632i5 > 2) {
                                        c24561s.m71643t(2);
                                    }
                                    if ((iM71632i5 & 1) == 0 || iM71632i5 <= 2) {
                                        i26 = 6;
                                    } else {
                                        i26 = 6;
                                        c24561s.m71643t(6);
                                    }
                                    if ((iM71632i5 & 4) != 0) {
                                        c24561s.m71643t(i26);
                                    }
                                    if (zM71631h && c24561s.m71631h()) {
                                        c24561s.m71643t(5);
                                    }
                                    if (b != 0) {
                                        i19 = i17;
                                    } else {
                                        if (c24561s.m71631h()) {
                                            i27 = 6;
                                            c24561s.m71643t(6);
                                        } else {
                                            i27 = 6;
                                        }
                                        if (iM71632i5 == 0 && c24561s.m71631h()) {
                                            c24561s.m71643t(i27);
                                        }
                                        if (c24561s.m71631h()) {
                                            c24561s.m71643t(i27);
                                        }
                                        int iM71632i6 = c24561s.m71632i(2);
                                        if (iM71632i6 == 1) {
                                            c24561s.m71643t(5);
                                            i29 = 2;
                                        } else {
                                            if (iM71632i6 == 2) {
                                                c24561s.m71643t(12);
                                            } else if (iM71632i6 == 3) {
                                                int iM71632i7 = c24561s.m71632i(5);
                                                if (c24561s.m71631h()) {
                                                    c24561s.m71643t(5);
                                                    if (c24561s.m71631h()) {
                                                        i34 = 4;
                                                        c24561s.m71643t(4);
                                                    } else {
                                                        i34 = 4;
                                                    }
                                                    if (c24561s.m71631h()) {
                                                        c24561s.m71643t(i34);
                                                    }
                                                    if (c24561s.m71631h()) {
                                                        c24561s.m71643t(i34);
                                                    }
                                                    if (c24561s.m71631h()) {
                                                        c24561s.m71643t(i34);
                                                    }
                                                    if (c24561s.m71631h()) {
                                                        c24561s.m71643t(i34);
                                                    }
                                                    if (c24561s.m71631h()) {
                                                        c24561s.m71643t(i34);
                                                    }
                                                    if (c24561s.m71631h()) {
                                                        c24561s.m71643t(i34);
                                                    }
                                                    if (c24561s.m71631h()) {
                                                        if (c24561s.m71631h()) {
                                                            c24561s.m71643t(i34);
                                                        }
                                                        if (c24561s.m71631h()) {
                                                            c24561s.m71643t(i34);
                                                        }
                                                    }
                                                }
                                                if (c24561s.m71631h()) {
                                                    c24561s.m71643t(5);
                                                    if (c24561s.m71631h()) {
                                                        c24561s.m71643t(7);
                                                        if (c24561s.m71631h()) {
                                                            i28 = 8;
                                                            c24561s.m71643t(8);
                                                        } else {
                                                            i28 = 8;
                                                        }
                                                    } else {
                                                        i28 = 8;
                                                    }
                                                } else {
                                                    i28 = 8;
                                                }
                                                i29 = 2;
                                                c24561s.m71643t((iM71632i7 + 2) * i28);
                                                c24561s.m71626c();
                                            }
                                            i29 = 2;
                                        }
                                        if (iM71632i5 < i29) {
                                            if (c24561s.m71631h()) {
                                                c24561s.m71643t(14);
                                            }
                                            if (iM71632i5 == 0 && c24561s.m71631h()) {
                                                c24561s.m71643t(14);
                                            }
                                        }
                                        if (c24561s.m71631h()) {
                                            i19 = i17;
                                            if (i19 == 0) {
                                                c24561s.m71643t(5);
                                            } else {
                                                for (int i38 = 0; i38 < i18; i38++) {
                                                    if (c24561s.m71631h()) {
                                                        c24561s.m71643t(5);
                                                    }
                                                }
                                            }
                                        } else {
                                            i19 = i17;
                                        }
                                    }
                                } else {
                                    i19 = i17;
                                }
                                if (c24561s.m71631h()) {
                                    c24561s.m71643t(5);
                                    if (iM71632i5 == 2) {
                                        c24561s.m71643t(4);
                                    }
                                    if (iM71632i5 >= 6) {
                                        c24561s.m71643t(2);
                                    }
                                    if (c24561s.m71631h()) {
                                        c24561s.m71643t(8);
                                    }
                                    if (iM71632i5 == 0 && c24561s.m71631h()) {
                                        c24561s.m71643t(8);
                                    }
                                    i24 = 3;
                                    if (iM71632i3 < 3) {
                                        c24561s.m71642s();
                                    }
                                } else {
                                    i24 = 3;
                                }
                                if (b == 0 && i19 != i24) {
                                    c24561s.m71642s();
                                }
                                if (b == 2 && (i19 == i24 || c24561s.m71631h())) {
                                    i25 = 6;
                                    c24561s.m71643t(6);
                                } else {
                                    i25 = 6;
                                }
                                str = (c24561s.m71631h() && c24561s.m71632i(i25) == 1 && c24561s.m71632i(8) == 1) ? "audio/eac3-joc" : "audio/eac3";
                            } else {
                                c24561s.m71643t(32);
                                int iM71632i8 = c24561s.m71632i(2);
                                String str2 = iM71632i8 == 3 ? null : "audio/ac3";
                                int iM107328b = AbstractC33922a.m107328b(iM71632i8, c24561s.m71632i(6));
                                c24561s.m71643t(8);
                                int iM71632i9 = c24561s.m71632i(3);
                                if ((iM71632i9 & 1) == 0 || iM71632i9 == 1) {
                                    i13 = 2;
                                } else {
                                    i13 = 2;
                                    c24561s.m71643t(2);
                                }
                                if ((iM71632i9 & 4) != 0) {
                                    c24561s.m71643t(i13);
                                }
                                if (iM71632i9 == i13) {
                                    c24561s.m71643t(i13);
                                }
                                int i39 = iM71632i8 < 3 ? iArr2[iM71632i8] : -1;
                                i14 = iArr[iM71632i9] + (c24561s.m71631h() ? 1 : 0);
                                i15 = 1536;
                                str = str2;
                                iM71632i = iM107328b;
                                i16 = i39;
                            }
                            C31521c0 c31521c0 = this.f53838k;
                            if (c31521c0 == null || i14 != c31521c0.f130090Y || i16 != c31521c0.f130091Z || !AbstractC24567y.m71670a(str, c31521c0.f130077L)) {
                                C31518b0 c31518b0 = new C31518b0();
                                c31518b0.f130037a = this.f53832e;
                                c31518b0.f130047k = str;
                                c31518b0.f130060x = i14;
                                c31518b0.f130061y = i16;
                                c31518b0.f130039c = this.f53831d;
                                C31521c0 c31521c1 = new C31521c0(c31518b0);
                                this.f53838k = c31521c1;
                                this.f53833f.mo102730a(c31521c1);
                            }
                            this.f53839l = iM71632i;
                            this.f53837j = (((long) i15) * 1000000) / ((long) this.f53838k.f130091Z);
                            c13117a2.m36689K(0);
                            this.f53833f.mo102732c(128, c13117a2);
                            this.f53834g = 2;
                        }
                    } else if (i35 == 2) {
                        int iMin2 = Math.min(c13117a.m36692a(), this.f53839l - this.f53835h);
                        this.f53833f.mo102732c(iMin2, c13117a);
                        int i44 = this.f53835h + iMin2;
                        this.f53835h = i44;
                        int i45 = this.f53839l;
                        if (i44 == i45) {
                            long j7 = this.f53840m;
                            if (j7 != -9223372036854775807L) {
                                this.f53833f.mo102733d(j7, 1, i45, 0, null);
                                this.f53840m += this.f53837j;
                            }
                            this.f53834g = 0;
                        }
                    }
                }
                break;
            default:
                AbstractC24543a.m71574j(this.f53833f);
                while (c13117a.m36692a() > 0) {
                    int i46 = this.f53834g;
                    C13117a c13117a3 = this.f53830c;
                    if (i46 == 0) {
                        while (c13117a.m36692a() > 0) {
                            if (this.f53836i) {
                                int iM36715y2 = c13117a.m36715y();
                                this.f53836i = iM36715y2 == 172;
                                if (iM36715y2 == 64 || iM36715y2 == 65) {
                                    Object[] objArr2 = iM36715y2 == 65;
                                    this.f53834g = 1;
                                    byte[] bArr3 = c13117a3.f45381a;
                                    bArr3[0] = -84;
                                    bArr3[1] = (byte) (objArr2 == true ? 65 : 64);
                                    this.f53835h = 2;
                                }
                            } else {
                                this.f53836i = c13117a.m36715y() == 172;
                            }
                            break;
                        }
                    } else if (i46 == 1) {
                        byte[] bArr4 = c13117a3.f45381a;
                        int iMin3 = Math.min(c13117a.m36692a(), 16 - this.f53835h);
                        c13117a.m36697g(bArr4, this.f53835h, iMin3);
                        int i47 = this.f53835h + iMin3;
                        this.f53835h = i47;
                        if (i47 == 16) {
                            C24561s c24561s2 = this.f53829b;
                            c24561s2.m71640q(0);
                            C11078p c11078pM107331e = AbstractC33922a.m107331e(c24561s2);
                            int i48 = c11078pM107331e.f35038a;
                            C31521c0 c31521c2 = this.f53838k;
                            if (c31521c2 == null || 2 != c31521c2.f130090Y || i48 != c31521c2.f130091Z || !"audio/ac4".equals(c31521c2.f130077L)) {
                                C31518b0 c31518b1 = new C31518b0();
                                c31518b1.f130037a = this.f53832e;
                                c31518b1.f130047k = "audio/ac4";
                                c31518b1.f130060x = 2;
                                c31518b1.f130061y = i48;
                                c31518b1.f130039c = this.f53831d;
                                C31521c0 c31521c3 = new C31521c0(c31518b1);
                                this.f53838k = c31521c3;
                                this.f53833f.mo102730a(c31521c3);
                            }
                            this.f53839l = c11078pM107331e.f35039b;
                            this.f53837j = (((long) c11078pM107331e.f35040c) * 1000000) / ((long) this.f53838k.f130091Z);
                            c13117a3.m36689K(0);
                            this.f53833f.mo102732c(16, c13117a3);
                            this.f53834g = 2;
                        }
                    } else if (i46 == 2) {
                        int iMin4 = Math.min(c13117a.m36692a(), this.f53839l - this.f53835h);
                        this.f53833f.mo102732c(iMin4, c13117a);
                        int i49 = this.f53835h + iMin4;
                        this.f53835h = i49;
                        int i54 = this.f53839l;
                        if (i49 == i54) {
                            long j13 = this.f53840m;
                            if (j13 != -9223372036854775807L) {
                                this.f53833f.mo102733d(j13, 1, i54, 0, null);
                                this.f53840m += this.f53837j;
                            }
                            this.f53834g = 0;
                        }
                    }
                }
                break;
        }
    }

    @Override // p151fn.InterfaceC14620h
    /* JADX INFO: renamed from: g */
    public final void mo1712g(InterfaceC37369k interfaceC37369k, C0690l0 c0690l0) {
        switch (this.f53828a) {
            case 0:
                c0690l0.m1733c();
                c0690l0.m1738h();
                this.f53832e = (String) c0690l0.f2495f;
                c0690l0.m1738h();
                this.f53833f = interfaceC37369k.mo3102o(c0690l0.f2494e, 1);
                break;
            default:
                c0690l0.m1733c();
                c0690l0.m1738h();
                this.f53832e = (String) c0690l0.f2495f;
                c0690l0.m1738h();
                this.f53833f = interfaceC37369k.mo3102o(c0690l0.f2494e, 1);
                break;
        }
    }

    @Override // p151fn.InterfaceC14620h
    /* JADX INFO: renamed from: h */
    public final void mo1713h() {
        int i13 = this.f53828a;
    }
}
