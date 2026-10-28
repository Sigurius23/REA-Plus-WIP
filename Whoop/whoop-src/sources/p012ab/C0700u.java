package p012ab;

import androidx.media3.common.ParserException;
import com.iterable.iterableapi.C5363q;
import java.util.Collections;
import no.nordicsemi.android.dfu.DfuBaseService;
import p309lo.C24561s;
import p499t9.AbstractC33618a;
import p499t9.InterfaceC33639k0;
import p499t9.InterfaceC33648q;
import p516u8.AbstractC34587d0;
import p516u8.C34608o;
import p516u8.C34610p;
import p607x8.C38059n;
import va3.AbstractC35849g;

/* JADX INFO: renamed from: ab.u */
/* JADX INFO: loaded from: classes5.dex */
public final class C0700u implements InterfaceC0685j {

    /* JADX INFO: renamed from: a */
    public final String f2602a;

    /* JADX INFO: renamed from: b */
    public final int f2603b;

    /* JADX INFO: renamed from: c */
    public final C38059n f2604c;

    /* JADX INFO: renamed from: d */
    public final C24561s f2605d;

    /* JADX INFO: renamed from: e */
    public InterfaceC33639k0 f2606e;

    /* JADX INFO: renamed from: f */
    public String f2607f;

    /* JADX INFO: renamed from: g */
    public C34610p f2608g;

    /* JADX INFO: renamed from: h */
    public int f2609h;

    /* JADX INFO: renamed from: i */
    public int f2610i;

    /* JADX INFO: renamed from: j */
    public int f2611j;

    /* JADX INFO: renamed from: k */
    public int f2612k;

    /* JADX INFO: renamed from: l */
    public long f2613l;

    /* JADX INFO: renamed from: m */
    public boolean f2614m;

    /* JADX INFO: renamed from: n */
    public int f2615n;

    /* JADX INFO: renamed from: o */
    public int f2616o;

    /* JADX INFO: renamed from: p */
    public int f2617p;

    /* JADX INFO: renamed from: q */
    public boolean f2618q;

    /* JADX INFO: renamed from: r */
    public long f2619r;

    /* JADX INFO: renamed from: s */
    public int f2620s;

    /* JADX INFO: renamed from: t */
    public long f2621t;

    /* JADX INFO: renamed from: u */
    public int f2622u;

    /* JADX INFO: renamed from: v */
    public String f2623v;

    public C0700u(String str, int i13) {
        this.f2602a = str;
        this.f2603b = i13;
        C38059n c38059n = new C38059n(DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED);
        this.f2604c = c38059n;
        byte[] bArr = c38059n.f163017a;
        this.f2605d = new C24561s(bArr, bArr.length, 5, (byte) 0);
        this.f2613l = -9223372036854775807L;
    }

    @Override // p012ab.InterfaceC0685j
    /* JADX INFO: renamed from: a */
    public final void mo1663a() {
        this.f2609h = 0;
        this.f2613l = -9223372036854775807L;
        this.f2614m = false;
    }

    @Override // p012ab.InterfaceC0685j
    /* JADX INFO: renamed from: c */
    public final void mo1664c(C38059n c38059n) throws ParserException {
        int iM71632i;
        int i13;
        boolean zM71631h;
        AbstractC35849g.m113808j(this.f2606e);
        while (c38059n.m121848a() > 0) {
            int i14 = this.f2609h;
            if (i14 != 0) {
                if (i14 != 1) {
                    C38059n c38059n2 = this.f2604c;
                    C24561s c24561s = this.f2605d;
                    if (i14 == 2) {
                        int iM121867t = ((this.f2612k & (-225)) << 8) | c38059n.m121867t();
                        this.f2611j = iM121867t;
                        if (iM121867t > c38059n2.f163017a.length) {
                            c38059n2.m121843C(iM121867t);
                            byte[] bArr = c38059n2.f163017a;
                            c24561s.getClass();
                            c24561s.m71638o(bArr.length, bArr);
                        }
                        this.f2610i = 0;
                        this.f2609h = 3;
                    } else {
                        if (i14 != 3) {
                            throw new IllegalStateException();
                        }
                        int iMin = Math.min(c38059n.m121848a(), this.f2611j - this.f2610i);
                        c38059n.m121852e(c24561s.f95858b, this.f2610i, iMin);
                        int i15 = this.f2610i + iMin;
                        this.f2610i = i15;
                        if (i15 == this.f2611j) {
                            c24561s.m71640q(0);
                            if (c24561s.m71631h()) {
                                if (this.f2614m) {
                                }
                                this.f2609h = 0;
                            } else {
                                this.f2614m = true;
                                int iM71632i2 = c24561s.m71632i(1);
                                int iM71632i3 = iM71632i2 == 1 ? c24561s.m71632i(1) : 0;
                                this.f2615n = iM71632i3;
                                if (iM71632i3 != 0) {
                                    throw ParserException.m5049a(null, null);
                                }
                                if (iM71632i2 == 1) {
                                    c24561s.m71632i((c24561s.m71632i(2) + 1) * 8);
                                }
                                if (!c24561s.m71631h()) {
                                    throw ParserException.m5049a(null, null);
                                }
                                this.f2616o = c24561s.m71632i(6);
                                int iM71632i4 = c24561s.m71632i(4);
                                int iM71632i5 = c24561s.m71632i(3);
                                if (iM71632i4 != 0 || iM71632i5 != 0) {
                                    throw ParserException.m5049a(null, null);
                                }
                                if (iM71632i2 == 0) {
                                    int iM71630g = c24561s.m71630g();
                                    int iM71625b = c24561s.m71625b();
                                    C5363q c5363qM106221m = AbstractC33618a.m106221m(c24561s, true);
                                    this.f2623v = c5363qM106221m.f21805a;
                                    this.f2620s = c5363qM106221m.f21806b;
                                    this.f2622u = c5363qM106221m.f21807c;
                                    int iM71625b2 = iM71625b - c24561s.m71625b();
                                    c24561s.m71640q(iM71630g);
                                    byte[] bArr2 = new byte[(iM71625b2 + 7) / 8];
                                    c24561s.m71633j(iM71625b2, bArr2);
                                    C34608o c34608o = new C34608o();
                                    c34608o.f145729a = this.f2607f;
                                    c34608o.f145740l = AbstractC34587d0.m109382o("video/mp2t");
                                    c34608o.f145741m = AbstractC34587d0.m109382o("audio/mp4a-latm");
                                    c34608o.f145738j = this.f2623v;
                                    c34608o.f145719C = this.f2622u;
                                    c34608o.f145720D = this.f2620s;
                                    c34608o.f145744p = Collections.singletonList(bArr2);
                                    c34608o.f145732d = this.f2602a;
                                    c34608o.f145734f = this.f2603b;
                                    C34610p c34610p = new C34610p(c34608o);
                                    if (!c34610p.equals(this.f2608g)) {
                                        this.f2608g = c34610p;
                                        this.f2621t = 1024000000 / ((long) c34610p.f145760E);
                                        this.f2606e.mo36173a(c34610p);
                                    }
                                } else {
                                    int iM71632i6 = c24561s.m71632i((c24561s.m71632i(2) + 1) * 8);
                                    int iM71625b3 = c24561s.m71625b();
                                    C5363q c5363qM106221m2 = AbstractC33618a.m106221m(c24561s, true);
                                    this.f2623v = c5363qM106221m2.f21805a;
                                    this.f2620s = c5363qM106221m2.f21806b;
                                    this.f2622u = c5363qM106221m2.f21807c;
                                    c24561s.m71643t(iM71632i6 - (iM71625b3 - c24561s.m71625b()));
                                }
                                int iM71632i7 = c24561s.m71632i(3);
                                this.f2617p = iM71632i7;
                                if (iM71632i7 == 0) {
                                    c24561s.m71643t(8);
                                } else if (iM71632i7 == 1) {
                                    c24561s.m71643t(9);
                                } else if (iM71632i7 == 3 || iM71632i7 == 4 || iM71632i7 == 5) {
                                    c24561s.m71643t(6);
                                } else {
                                    if (iM71632i7 != 6 && iM71632i7 != 7) {
                                        throw new IllegalStateException();
                                    }
                                    c24561s.m71643t(1);
                                }
                                boolean zM71631h2 = c24561s.m71631h();
                                this.f2618q = zM71631h2;
                                this.f2619r = 0L;
                                if (zM71631h2) {
                                    if (iM71632i2 == 1) {
                                        this.f2619r = c24561s.m71632i((c24561s.m71632i(2) + 1) * 8);
                                    } else {
                                        do {
                                            zM71631h = c24561s.m71631h();
                                            this.f2619r = (this.f2619r << 8) + ((long) c24561s.m71632i(8));
                                        } while (zM71631h);
                                    }
                                }
                                if (c24561s.m71631h()) {
                                    c24561s.m71643t(8);
                                }
                            }
                            if (this.f2615n != 0) {
                                throw ParserException.m5049a(null, null);
                            }
                            if (this.f2616o != 0) {
                                throw ParserException.m5049a(null, null);
                            }
                            if (this.f2617p != 0) {
                                throw ParserException.m5049a(null, null);
                            }
                            int i16 = 0;
                            do {
                                iM71632i = c24561s.m71632i(8);
                                i16 += iM71632i;
                            } while (iM71632i == 255);
                            int iM71630g2 = c24561s.m71630g();
                            if ((iM71630g2 & 7) == 0) {
                                c38059n2.m121846F(iM71630g2 >> 3);
                                i13 = 0;
                            } else {
                                c24561s.m71633j(i16 * 8, c38059n2.f163017a);
                                i13 = 0;
                                c38059n2.m121846F(0);
                            }
                            this.f2606e.mo36176d(c38059n2, i16, i13);
                            AbstractC35849g.m113807i(this.f2613l != -9223372036854775807L);
                            this.f2606e.mo36174b(this.f2613l, 1, i16, 0, null);
                            this.f2613l += this.f2621t;
                            if (this.f2618q) {
                                c24561s.m71643t((int) this.f2619r);
                            }
                            this.f2609h = 0;
                        } else {
                            continue;
                        }
                    }
                } else {
                    int iM121867t2 = c38059n.m121867t();
                    if ((iM121867t2 & 224) == 224) {
                        this.f2612k = iM121867t2;
                        this.f2609h = 2;
                    } else if (iM121867t2 != 86) {
                        this.f2609h = 0;
                    }
                }
            } else if (c38059n.m121867t() == 86) {
                this.f2609h = 1;
            }
        }
    }

    @Override // p012ab.InterfaceC0685j
    /* JADX INFO: renamed from: d */
    public final void mo1665d(int i13, long j7) {
        this.f2613l = j7;
    }

    @Override // p012ab.InterfaceC0685j
    /* JADX INFO: renamed from: e */
    public final void mo1666e(boolean z4) {
    }

    @Override // p012ab.InterfaceC0685j
    /* JADX INFO: renamed from: i */
    public final void mo1667i(InterfaceC33648q interfaceC33648q, C0690l0 c0690l0) {
        c0690l0.m1733c();
        c0690l0.m1738h();
        this.f2606e = interfaceC33648q.mo3101o(c0690l0.f2494e, 1);
        c0690l0.m1738h();
        this.f2607f = (String) c0690l0.f2495f;
    }
}
