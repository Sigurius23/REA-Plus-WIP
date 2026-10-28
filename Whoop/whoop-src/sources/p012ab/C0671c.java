package p012ab;

import cr.C11078p;
import java.util.Objects;
import p309lo.C24561s;
import p499t9.AbstractC33618a;
import p499t9.InterfaceC33639k0;
import p499t9.InterfaceC33648q;
import p516u8.AbstractC34587d0;
import p516u8.C34608o;
import p516u8.C34610p;
import p607x8.C38059n;
import va3.AbstractC35849g;

/* JADX INFO: renamed from: ab.c */
/* JADX INFO: loaded from: classes5.dex */
public final class C0671c implements InterfaceC0685j {

    /* JADX INFO: renamed from: a */
    public final /* synthetic */ int f2332a;

    /* JADX INFO: renamed from: b */
    public final C24561s f2333b;

    /* JADX INFO: renamed from: c */
    public final C38059n f2334c;

    /* JADX INFO: renamed from: d */
    public final String f2335d;

    /* JADX INFO: renamed from: e */
    public final int f2336e;

    /* JADX INFO: renamed from: f */
    public final String f2337f;

    /* JADX INFO: renamed from: g */
    public String f2338g;

    /* JADX INFO: renamed from: h */
    public InterfaceC33639k0 f2339h;

    /* JADX INFO: renamed from: i */
    public int f2340i;

    /* JADX INFO: renamed from: j */
    public int f2341j;

    /* JADX INFO: renamed from: k */
    public boolean f2342k;

    /* JADX INFO: renamed from: l */
    public long f2343l;

    /* JADX INFO: renamed from: m */
    public C34610p f2344m;

    /* JADX INFO: renamed from: n */
    public int f2345n;

    /* JADX INFO: renamed from: o */
    public long f2346o;

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C0671c(String str) {
        this(null, 0, str, 0);
        this.f2332a = 0;
    }

    /* JADX INFO: renamed from: b */
    private final void m1661b(boolean z4) {
    }

    /* JADX INFO: renamed from: f */
    private final void m1662f(boolean z4) {
    }

    @Override // p012ab.InterfaceC0685j
    /* JADX INFO: renamed from: a */
    public final void mo1663a() {
        switch (this.f2332a) {
            case 0:
                this.f2340i = 0;
                this.f2341j = 0;
                this.f2342k = false;
                this.f2346o = -9223372036854775807L;
                break;
            default:
                this.f2340i = 0;
                this.f2341j = 0;
                this.f2342k = false;
                this.f2346o = -9223372036854775807L;
                break;
        }
    }

    /* JADX WARN: Code duplicated, block: B:180:0x033f  */
    /* JADX WARN: Code duplicated, block: B:202:0x0381  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // p012ab.InterfaceC0685j
    /* JADX INFO: renamed from: c */
    public final void mo1664c(C38059n c38059n) {
        int i13;
        int i14;
        int i15;
        int iM71632i;
        int i16;
        int i17;
        String str;
        byte b;
        int i18;
        int i19;
        int i24;
        int i25;
        int i26;
        int i27;
        int i28;
        int i29;
        int i34;
        int i35;
        int i36;
        switch (this.f2332a) {
            case 0:
                AbstractC35849g.m113808j(this.f2339h);
                while (c38059n.m121848a() > 0) {
                    int i37 = this.f2340i;
                    C38059n c38059n2 = this.f2334c;
                    if (i37 == 0) {
                        while (c38059n.m121848a() > 0) {
                            if (this.f2342k) {
                                int iM121867t = c38059n.m121867t();
                                if (iM121867t == 119) {
                                    this.f2342k = false;
                                    this.f2340i = 1;
                                    byte[] bArr = c38059n2.f163017a;
                                    bArr[0] = 11;
                                    bArr[1] = 119;
                                    this.f2341j = 2;
                                }
                                this.f2342k = iM121867t == 11;
                            } else {
                                this.f2342k = c38059n.m121867t() == 11;
                            }
                            break;
                        }
                    } else if (i37 == 1) {
                        byte[] bArr2 = c38059n2.f163017a;
                        int iMin = Math.min(c38059n.m121848a(), 128 - this.f2341j);
                        c38059n.m121852e(bArr2, this.f2341j, iMin);
                        int i38 = this.f2341j + iMin;
                        this.f2341j = i38;
                        if (i38 == 128) {
                            C24561s c24561s = this.f2333b;
                            c24561s.m71640q(0);
                            int[] iArr = AbstractC33618a.f140307f;
                            int[] iArr2 = AbstractC33618a.f140305d;
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
                                    i16 = AbstractC33618a.f140306e[c24561s.m71632i(2)];
                                    i18 = 3;
                                    i19 = 6;
                                } else {
                                    int iM71632i4 = c24561s.m71632i(2);
                                    int i39 = AbstractC33618a.f140304c[iM71632i4];
                                    i16 = iArr2[iM71632i3];
                                    i18 = iM71632i4;
                                    i19 = i39;
                                }
                                i17 = i19 * 256;
                                int i44 = (iM71632i * i16) / (i19 * 32);
                                int iM71632i5 = c24561s.m71632i(3);
                                boolean zM71631h = c24561s.m71631h();
                                i15 = iArr[iM71632i5] + (zM71631h ? 1 : 0);
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
                                        i28 = 6;
                                    } else {
                                        i28 = 6;
                                        c24561s.m71643t(6);
                                    }
                                    if ((iM71632i5 & 4) != 0) {
                                        c24561s.m71643t(i28);
                                    }
                                    if (zM71631h && c24561s.m71631h()) {
                                        c24561s.m71643t(5);
                                    }
                                    if (b != 0) {
                                        i24 = i18;
                                    } else {
                                        if (c24561s.m71631h()) {
                                            i29 = 6;
                                            c24561s.m71643t(6);
                                        } else {
                                            i29 = 6;
                                        }
                                        if (iM71632i5 == 0 && c24561s.m71631h()) {
                                            c24561s.m71643t(i29);
                                        }
                                        if (c24561s.m71631h()) {
                                            c24561s.m71643t(i29);
                                        }
                                        int iM71632i6 = c24561s.m71632i(2);
                                        if (iM71632i6 == 1) {
                                            c24561s.m71643t(5);
                                            i35 = 2;
                                        } else {
                                            if (iM71632i6 == 2) {
                                                c24561s.m71643t(12);
                                            } else if (iM71632i6 == 3) {
                                                int iM71632i7 = c24561s.m71632i(5);
                                                if (c24561s.m71631h()) {
                                                    c24561s.m71643t(5);
                                                    if (c24561s.m71631h()) {
                                                        i36 = 4;
                                                        c24561s.m71643t(4);
                                                    } else {
                                                        i36 = 4;
                                                    }
                                                    if (c24561s.m71631h()) {
                                                        c24561s.m71643t(i36);
                                                    }
                                                    if (c24561s.m71631h()) {
                                                        c24561s.m71643t(i36);
                                                    }
                                                    if (c24561s.m71631h()) {
                                                        c24561s.m71643t(i36);
                                                    }
                                                    if (c24561s.m71631h()) {
                                                        c24561s.m71643t(i36);
                                                    }
                                                    if (c24561s.m71631h()) {
                                                        c24561s.m71643t(i36);
                                                    }
                                                    if (c24561s.m71631h()) {
                                                        c24561s.m71643t(i36);
                                                    }
                                                    if (c24561s.m71631h()) {
                                                        if (c24561s.m71631h()) {
                                                            c24561s.m71643t(i36);
                                                        }
                                                        if (c24561s.m71631h()) {
                                                            c24561s.m71643t(i36);
                                                        }
                                                    }
                                                }
                                                if (c24561s.m71631h()) {
                                                    c24561s.m71643t(5);
                                                    if (c24561s.m71631h()) {
                                                        c24561s.m71643t(7);
                                                        if (c24561s.m71631h()) {
                                                            i34 = 8;
                                                            c24561s.m71643t(8);
                                                        } else {
                                                            i34 = 8;
                                                        }
                                                    } else {
                                                        i34 = 8;
                                                    }
                                                } else {
                                                    i34 = 8;
                                                }
                                                i35 = 2;
                                                c24561s.m71643t((iM71632i7 + 2) * i34);
                                                c24561s.m71626c();
                                            }
                                            i35 = 2;
                                        }
                                        if (iM71632i5 < i35) {
                                            if (c24561s.m71631h()) {
                                                c24561s.m71643t(14);
                                            }
                                            if (iM71632i5 == 0 && c24561s.m71631h()) {
                                                c24561s.m71643t(14);
                                            }
                                        }
                                        if (c24561s.m71631h()) {
                                            i24 = i18;
                                            if (i24 == 0) {
                                                c24561s.m71643t(5);
                                            } else {
                                                for (int i45 = 0; i45 < i19; i45++) {
                                                    if (c24561s.m71631h()) {
                                                        c24561s.m71643t(5);
                                                    }
                                                }
                                            }
                                        } else {
                                            i24 = i18;
                                        }
                                    }
                                } else {
                                    i24 = i18;
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
                                        i27 = 8;
                                        c24561s.m71643t(8);
                                    } else {
                                        i27 = 8;
                                    }
                                    if (iM71632i5 == 0 && c24561s.m71631h()) {
                                        c24561s.m71643t(i27);
                                    }
                                    i25 = 3;
                                    if (iM71632i3 < 3) {
                                        c24561s.m71642s();
                                    }
                                } else {
                                    i25 = 3;
                                }
                                if (b == 0 && i24 != i25) {
                                    c24561s.m71642s();
                                }
                                if (b == 2 && (i24 == i25 || c24561s.m71631h())) {
                                    i26 = 6;
                                    c24561s.m71643t(6);
                                } else {
                                    i26 = 6;
                                }
                                str = (c24561s.m71631h() && c24561s.m71632i(i26) == 1 && c24561s.m71632i(8) == 1) ? "audio/eac3-joc" : "audio/eac3";
                                i13 = i44;
                            } else {
                                c24561s.m71643t(32);
                                int iM71632i8 = c24561s.m71632i(2);
                                String str2 = iM71632i8 == 3 ? null : "audio/ac3";
                                int iM71632i9 = c24561s.m71632i(6);
                                i13 = AbstractC33618a.f140308g[iM71632i9 / 2] * 1000;
                                int iM106214f = AbstractC33618a.m106214f(iM71632i8, iM71632i9);
                                c24561s.m71643t(8);
                                int iM71632i10 = c24561s.m71632i(3);
                                if ((iM71632i10 & 1) == 0 || iM71632i10 == 1) {
                                    i14 = 2;
                                } else {
                                    i14 = 2;
                                    c24561s.m71643t(2);
                                }
                                if ((iM71632i10 & 4) != 0) {
                                    c24561s.m71643t(i14);
                                }
                                if (iM71632i10 == i14) {
                                    c24561s.m71643t(i14);
                                }
                                int i46 = iM71632i8 < 3 ? iArr2[iM71632i8] : -1;
                                i15 = iArr[iM71632i10] + (c24561s.m71631h() ? 1 : 0);
                                iM71632i = iM106214f;
                                i16 = i46;
                                i17 = 1536;
                                str = str2;
                            }
                            C34610p c34610p = this.f2344m;
                            if (c34610p == null || i15 != c34610p.f145759D || i16 != c34610p.f145760E || !Objects.equals(str, c34610p.f145783n)) {
                                C34608o c34608o = new C34608o();
                                c34608o.f145729a = this.f2338g;
                                c34608o.f145740l = AbstractC34587d0.m109382o(this.f2337f);
                                c34608o.f145741m = AbstractC34587d0.m109382o(str);
                                c34608o.f145719C = i15;
                                c34608o.f145720D = i16;
                                c34608o.f145732d = this.f2335d;
                                c34608o.f145734f = this.f2336e;
                                c34608o.f145737i = i13;
                                if ("audio/ac3".equals(str)) {
                                    c34608o.f145736h = i13;
                                }
                                C34610p c34610p2 = new C34610p(c34608o);
                                this.f2344m = c34610p2;
                                this.f2339h.mo36173a(c34610p2);
                            }
                            this.f2345n = iM71632i;
                            this.f2343l = (((long) i17) * 1000000) / ((long) this.f2344m.f145760E);
                            c38059n2.m121846F(0);
                            this.f2339h.mo36176d(c38059n2, 128, 0);
                            this.f2340i = 2;
                        }
                    } else if (i37 == 2) {
                        int iMin2 = Math.min(c38059n.m121848a(), this.f2345n - this.f2341j);
                        this.f2339h.mo36176d(c38059n, iMin2, 0);
                        int i47 = this.f2341j + iMin2;
                        this.f2341j = i47;
                        if (i47 == this.f2345n) {
                            AbstractC35849g.m113807i(this.f2346o != -9223372036854775807L);
                            this.f2339h.mo36174b(this.f2346o, 1, this.f2345n, 0, null);
                            this.f2346o += this.f2343l;
                            this.f2340i = 0;
                        }
                    }
                }
                break;
            default:
                AbstractC35849g.m113808j(this.f2339h);
                while (c38059n.m121848a() > 0) {
                    int i48 = this.f2340i;
                    C38059n c38059n3 = this.f2334c;
                    if (i48 == 0) {
                        while (c38059n.m121848a() > 0) {
                            if (this.f2342k) {
                                int iM121867t2 = c38059n.m121867t();
                                this.f2342k = iM121867t2 == 172;
                                if (iM121867t2 == 64 || iM121867t2 == 65) {
                                    Object[] objArr2 = iM121867t2 == 65;
                                    this.f2340i = 1;
                                    byte[] bArr3 = c38059n3.f163017a;
                                    bArr3[0] = -84;
                                    bArr3[1] = (byte) (objArr2 == true ? 65 : 64);
                                    this.f2341j = 2;
                                }
                            } else {
                                this.f2342k = c38059n.m121867t() == 172;
                            }
                            break;
                        }
                    } else if (i48 == 1) {
                        byte[] bArr4 = c38059n3.f163017a;
                        int iMin3 = Math.min(c38059n.m121848a(), 16 - this.f2341j);
                        c38059n.m121852e(bArr4, this.f2341j, iMin3);
                        int i49 = this.f2341j + iMin3;
                        this.f2341j = i49;
                        if (i49 == 16) {
                            C24561s c24561s2 = this.f2333b;
                            c24561s2.m71640q(0);
                            C11078p c11078pM106220l = AbstractC33618a.m106220l(c24561s2);
                            int i54 = c11078pM106220l.f35038a;
                            C34610p c34610p3 = this.f2344m;
                            if (c34610p3 == null || 2 != c34610p3.f145759D || i54 != c34610p3.f145760E || !"audio/ac4".equals(c34610p3.f145783n)) {
                                C34608o c34608o2 = new C34608o();
                                c34608o2.f145729a = this.f2338g;
                                c34608o2.f145740l = AbstractC34587d0.m109382o(this.f2337f);
                                c34608o2.f145741m = AbstractC34587d0.m109382o("audio/ac4");
                                c34608o2.f145719C = 2;
                                c34608o2.f145720D = i54;
                                c34608o2.f145732d = this.f2335d;
                                c34608o2.f145734f = this.f2336e;
                                C34610p c34610p4 = new C34610p(c34608o2);
                                this.f2344m = c34610p4;
                                this.f2339h.mo36173a(c34610p4);
                            }
                            this.f2345n = c11078pM106220l.f35039b;
                            this.f2343l = (((long) c11078pM106220l.f35040c) * 1000000) / ((long) this.f2344m.f145760E);
                            c38059n3.m121846F(0);
                            this.f2339h.mo36176d(c38059n3, 16, 0);
                            this.f2340i = 2;
                        }
                    } else if (i48 == 2) {
                        int iMin4 = Math.min(c38059n.m121848a(), this.f2345n - this.f2341j);
                        this.f2339h.mo36176d(c38059n, iMin4, 0);
                        int i55 = this.f2341j + iMin4;
                        this.f2341j = i55;
                        if (i55 == this.f2345n) {
                            AbstractC35849g.m113807i(this.f2346o != -9223372036854775807L);
                            this.f2339h.mo36174b(this.f2346o, 1, this.f2345n, 0, null);
                            this.f2346o += this.f2343l;
                            this.f2340i = 0;
                        }
                    }
                }
                break;
        }
    }

    @Override // p012ab.InterfaceC0685j
    /* JADX INFO: renamed from: d */
    public final void mo1665d(int i13, long j7) {
        switch (this.f2332a) {
            case 0:
                this.f2346o = j7;
                break;
            default:
                this.f2346o = j7;
                break;
        }
    }

    @Override // p012ab.InterfaceC0685j
    /* JADX INFO: renamed from: e */
    public final void mo1666e(boolean z4) {
        int i13 = this.f2332a;
    }

    @Override // p012ab.InterfaceC0685j
    /* JADX INFO: renamed from: i */
    public final void mo1667i(InterfaceC33648q interfaceC33648q, C0690l0 c0690l0) {
        switch (this.f2332a) {
            case 0:
                c0690l0.m1733c();
                c0690l0.m1738h();
                this.f2338g = (String) c0690l0.f2495f;
                c0690l0.m1738h();
                this.f2339h = interfaceC33648q.mo3101o(c0690l0.f2494e, 1);
                break;
            default:
                c0690l0.m1733c();
                c0690l0.m1738h();
                this.f2338g = (String) c0690l0.f2495f;
                c0690l0.m1738h();
                this.f2339h = interfaceC33648q.mo3101o(c0690l0.f2494e, 1);
                break;
        }
    }

    public C0671c(String str, int i13, String str2, int i14) {
        this.f2332a = i14;
        switch (i14) {
            case 1:
                C24561s c24561s = new C24561s(new byte[16], 16, 5, (byte) 0);
                this.f2333b = c24561s;
                this.f2334c = new C38059n(c24561s.f95858b);
                this.f2340i = 0;
                this.f2341j = 0;
                this.f2342k = false;
                this.f2346o = -9223372036854775807L;
                this.f2335d = str;
                this.f2336e = i13;
                this.f2337f = str2;
                break;
            default:
                C24561s c24561s2 = new C24561s(new byte[128], 128, 5, (byte) 0);
                this.f2333b = c24561s2;
                this.f2334c = new C38059n(c24561s2.f95858b);
                this.f2340i = 0;
                this.f2346o = -9223372036854775807L;
                this.f2335d = str;
                this.f2336e = i13;
                this.f2337f = str2;
                break;
        }
    }
}
