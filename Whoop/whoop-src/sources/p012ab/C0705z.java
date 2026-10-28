package p012ab;

import p309lo.C24561s;
import p499t9.InterfaceC33648q;
import p607x8.AbstractC38046a;
import p607x8.C38059n;
import p607x8.C38064s;
import va3.AbstractC35849g;
import y00.AbstractC38963t7;

/* JADX INFO: renamed from: ab.z */
/* JADX INFO: loaded from: classes5.dex */
public final class C0705z implements InterfaceC0692m0 {

    /* JADX INFO: renamed from: a */
    public final InterfaceC0685j f2668a;

    /* JADX INFO: renamed from: b */
    public final C24561s f2669b = new C24561s(new byte[10], 10, 5, (byte) 0);

    /* JADX INFO: renamed from: c */
    public int f2670c = 0;

    /* JADX INFO: renamed from: d */
    public int f2671d;

    /* JADX INFO: renamed from: e */
    public C38064s f2672e;

    /* JADX INFO: renamed from: f */
    public boolean f2673f;

    /* JADX INFO: renamed from: g */
    public boolean f2674g;

    /* JADX INFO: renamed from: h */
    public boolean f2675h;

    /* JADX INFO: renamed from: i */
    public int f2676i;

    /* JADX INFO: renamed from: j */
    public int f2677j;

    /* JADX INFO: renamed from: k */
    public boolean f2678k;

    /* JADX INFO: renamed from: l */
    public long f2679l;

    public C0705z(InterfaceC0685j interfaceC0685j) {
        this.f2668a = interfaceC0685j;
    }

    @Override // p012ab.InterfaceC0692m0
    /* JADX INFO: renamed from: a */
    public final void mo1669a() {
        this.f2670c = 0;
        this.f2671d = 0;
        this.f2675h = false;
        this.f2668a.mo1663a();
    }

    @Override // p012ab.InterfaceC0692m0
    /* JADX INFO: renamed from: b */
    public final void mo1670b(int i13, C38059n c38059n) {
        int i14;
        int i15;
        AbstractC35849g.m113808j(this.f2672e);
        int i16 = i13 & 1;
        int i17 = -1;
        int i18 = 2;
        InterfaceC0685j interfaceC0685j = this.f2668a;
        if (i16 != 0) {
            int i19 = this.f2670c;
            if (i19 != 0 && i19 != 1) {
                if (i19 == 2) {
                    AbstractC38046a.m121826u("PesReader", "Unexpected start indicator reading extended header");
                } else {
                    if (i19 != 3) {
                        throw new IllegalStateException();
                    }
                    if (this.f2677j != -1) {
                        AbstractC38046a.m121826u("PesReader", "Unexpected start indicator: expected " + this.f2677j + " more bytes");
                    }
                    interfaceC0685j.mo1666e(c38059n.f163019c == 0);
                }
            }
            this.f2670c = 1;
            this.f2671d = 0;
        }
        int i24 = i13;
        while (c38059n.m121848a() > 0) {
            int i25 = this.f2670c;
            if (i25 != 0) {
                C24561s c24561s = this.f2669b;
                if (i25 != 1) {
                    if (i25 == i18) {
                        if (m1761c(c38059n, c24561s.f95858b, Math.min(10, this.f2676i)) && m1761c(c38059n, null, this.f2676i)) {
                            c24561s.m71640q(0);
                            this.f2679l = -9223372036854775807L;
                            if (this.f2673f) {
                                c24561s.m71643t(4);
                                long jM71632i = ((long) c24561s.m71632i(3)) << 30;
                                c24561s.m71643t(1);
                                long jM71632i2 = ((long) (c24561s.m71632i(15) << 15)) | jM71632i;
                                c24561s.m71643t(1);
                                long jM71632i3 = jM71632i2 | ((long) c24561s.m71632i(15));
                                c24561s.m71643t(1);
                                if (!this.f2675h && this.f2674g) {
                                    c24561s.m71643t(4);
                                    long jM71632i4 = ((long) c24561s.m71632i(3)) << 30;
                                    c24561s.m71643t(1);
                                    long jM71632i5 = jM71632i4 | ((long) (c24561s.m71632i(15) << 15));
                                    c24561s.m71643t(1);
                                    long jM71632i6 = jM71632i5 | ((long) c24561s.m71632i(15));
                                    c24561s.m71643t(1);
                                    this.f2672e.m121883b(jM71632i6);
                                    this.f2675h = true;
                                }
                                this.f2679l = this.f2672e.m121883b(jM71632i3);
                            }
                            i24 |= this.f2678k ? 4 : 0;
                            interfaceC0685j.mo1665d(i24, this.f2679l);
                            this.f2670c = 3;
                            this.f2671d = 0;
                            i17 = -1;
                            i18 = 2;
                        }
                    } else {
                        if (i25 != 3) {
                            throw new IllegalStateException();
                        }
                        int iM121848a = c38059n.m121848a();
                        int i26 = this.f2677j;
                        int i27 = i26 == i17 ? 0 : iM121848a - i26;
                        if (i27 > 0) {
                            iM121848a -= i27;
                            c38059n.m121845E(c38059n.f163018b + iM121848a);
                        }
                        interfaceC0685j.mo1664c(c38059n);
                        int i28 = this.f2677j;
                        if (i28 != i17) {
                            int i29 = i28 - iM121848a;
                            this.f2677j = i29;
                            if (i29 == 0) {
                                interfaceC0685j.mo1666e(false);
                                this.f2670c = 1;
                                this.f2671d = 0;
                            }
                        }
                    }
                    i14 = i18;
                } else if (m1761c(c38059n, c24561s.f95858b, 9)) {
                    c24561s.m71640q(0);
                    int iM71632i = c24561s.m71632i(24);
                    if (iM71632i != 1) {
                        AbstractC38963t7.m124388r(iM71632i, "Unexpected start code prefix: ", "PesReader");
                        i17 = -1;
                        this.f2677j = -1;
                        i15 = 0;
                        i14 = 2;
                    } else {
                        c24561s.m71643t(8);
                        int iM71632i2 = c24561s.m71632i(16);
                        c24561s.m71643t(5);
                        this.f2678k = c24561s.m71631h();
                        i14 = 2;
                        c24561s.m71643t(2);
                        this.f2673f = c24561s.m71631h();
                        this.f2674g = c24561s.m71631h();
                        c24561s.m71643t(6);
                        int iM71632i3 = c24561s.m71632i(8);
                        this.f2676i = iM71632i3;
                        if (iM71632i2 == 0) {
                            this.f2677j = -1;
                            i17 = -1;
                        } else {
                            int i34 = (iM71632i2 - 3) - iM71632i3;
                            this.f2677j = i34;
                            if (i34 < 0) {
                                AbstractC38046a.m121826u("PesReader", "Found negative packet payload size: " + this.f2677j);
                                i17 = -1;
                                this.f2677j = -1;
                            } else {
                                i17 = -1;
                            }
                        }
                        i15 = 2;
                    }
                    this.f2670c = i15;
                    this.f2671d = 0;
                } else {
                    i17 = -1;
                    i14 = 2;
                }
            } else {
                i14 = i18;
                c38059n.m121847G(c38059n.m121848a());
            }
            i18 = i14;
        }
    }

    /* JADX INFO: renamed from: c */
    public final boolean m1761c(C38059n c38059n, byte[] bArr, int i13) {
        int iMin = Math.min(c38059n.m121848a(), i13 - this.f2671d);
        if (iMin <= 0) {
            return true;
        }
        if (bArr == null) {
            c38059n.m121847G(iMin);
        } else {
            c38059n.m121852e(bArr, this.f2671d, iMin);
        }
        int i14 = this.f2671d + iMin;
        this.f2671d = i14;
        return i14 == i13;
    }

    @Override // p012ab.InterfaceC0692m0
    /* JADX INFO: renamed from: g */
    public final void mo1671g(C38064s c38064s, InterfaceC33648q interfaceC33648q, C0690l0 c0690l0) {
        this.f2672e = c38064s;
        this.f2668a.mo1667i(interfaceC33648q, c0690l0);
    }
}
