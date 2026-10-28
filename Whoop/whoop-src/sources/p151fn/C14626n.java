package p151fn;

import com.google.android.exoplayer2.ParserException;
import com.iterable.iterableapi.C5363q;
import ed3.C13117a;
import java.util.Collections;
import no.nordicsemi.android.dfu.DfuBaseService;
import p012ab.C0690l0;
import p309lo.AbstractC24543a;
import p309lo.C24561s;
import p465rm.C31518b0;
import p465rm.C31521c0;
import p588wm.InterfaceC37369k;
import p588wm.InterfaceC37377s;
import tm.AbstractC33922a;

/* JADX INFO: renamed from: fn.n */
/* JADX INFO: loaded from: classes6.dex */
public final class C14626n implements InterfaceC14620h {

    /* JADX INFO: renamed from: a */
    public final String f53946a;

    /* JADX INFO: renamed from: b */
    public final C13117a f53947b;

    /* JADX INFO: renamed from: c */
    public final C24561s f53948c;

    /* JADX INFO: renamed from: d */
    public InterfaceC37377s f53949d;

    /* JADX INFO: renamed from: e */
    public String f53950e;

    /* JADX INFO: renamed from: f */
    public C31521c0 f53951f;

    /* JADX INFO: renamed from: g */
    public int f53952g;

    /* JADX INFO: renamed from: h */
    public int f53953h;

    /* JADX INFO: renamed from: i */
    public int f53954i;

    /* JADX INFO: renamed from: j */
    public int f53955j;

    /* JADX INFO: renamed from: k */
    public long f53956k;

    /* JADX INFO: renamed from: l */
    public boolean f53957l;

    /* JADX INFO: renamed from: m */
    public int f53958m;

    /* JADX INFO: renamed from: n */
    public int f53959n;

    /* JADX INFO: renamed from: o */
    public int f53960o;

    /* JADX INFO: renamed from: p */
    public boolean f53961p;

    /* JADX INFO: renamed from: q */
    public long f53962q;

    /* JADX INFO: renamed from: r */
    public int f53963r;

    /* JADX INFO: renamed from: s */
    public long f53964s;

    /* JADX INFO: renamed from: t */
    public int f53965t;

    /* JADX INFO: renamed from: u */
    public String f53966u;

    public C14626n(String str) {
        this.f53946a = str;
        C13117a c13117a = new C13117a(DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED);
        this.f53947b = c13117a;
        byte[] bArr = c13117a.f45381a;
        this.f53948c = new C24561s(bArr, bArr.length, 0, (byte) 0);
        this.f53956k = -9223372036854775807L;
    }

    @Override // p151fn.InterfaceC14620h
    /* JADX INFO: renamed from: a */
    public final void mo41817a() {
        this.f53952g = 0;
        this.f53956k = -9223372036854775807L;
        this.f53957l = false;
    }

    @Override // p151fn.InterfaceC14620h
    /* JADX INFO: renamed from: d */
    public final void mo41818d(int i13, long j7) {
        if (j7 != -9223372036854775807L) {
            this.f53956k = j7;
        }
    }

    @Override // p151fn.InterfaceC14620h
    /* JADX INFO: renamed from: f */
    public final void mo1711f(C13117a c13117a) throws ParserException {
        int iM71632i;
        boolean zM71631h;
        AbstractC24543a.m71574j(this.f53949d);
        while (c13117a.m36692a() > 0) {
            int i13 = this.f53952g;
            if (i13 != 0) {
                if (i13 != 1) {
                    C13117a c13117a2 = this.f53947b;
                    C24561s c24561s = this.f53948c;
                    if (i13 == 2) {
                        int iM36715y = ((this.f53955j & (-225)) << 8) | c13117a.m36715y();
                        this.f53954i = iM36715y;
                        if (iM36715y > c13117a2.f45381a.length) {
                            c13117a2.m36686H(iM36715y);
                            byte[] bArr = c13117a2.f45381a;
                            c24561s.m71638o(bArr.length, bArr);
                        }
                        this.f53953h = 0;
                        this.f53952g = 3;
                    } else {
                        if (i13 != 3) {
                            throw new IllegalStateException();
                        }
                        int iMin = Math.min(c13117a.m36692a(), this.f53954i - this.f53953h);
                        c13117a.m36697g(c24561s.f95858b, this.f53953h, iMin);
                        int i14 = this.f53953h + iMin;
                        this.f53953h = i14;
                        if (i14 == this.f53954i) {
                            c24561s.m71640q(0);
                            if (c24561s.m71631h()) {
                                if (this.f53957l) {
                                }
                                this.f53952g = 0;
                            } else {
                                this.f53957l = true;
                                int iM71632i2 = c24561s.m71632i(1);
                                int iM71632i3 = iM71632i2 == 1 ? c24561s.m71632i(1) : 0;
                                this.f53958m = iM71632i3;
                                if (iM71632i3 != 0) {
                                    throw ParserException.m15562a(null, null);
                                }
                                if (iM71632i2 == 1) {
                                    c24561s.m71632i((c24561s.m71632i(2) + 1) * 8);
                                }
                                if (!c24561s.m71631h()) {
                                    throw ParserException.m15562a(null, null);
                                }
                                this.f53959n = c24561s.m71632i(6);
                                int iM71632i4 = c24561s.m71632i(4);
                                int iM71632i5 = c24561s.m71632i(3);
                                if (iM71632i4 != 0 || iM71632i5 != 0) {
                                    throw ParserException.m15562a(null, null);
                                }
                                if (iM71632i2 == 0) {
                                    int iM71630g = c24561s.m71630g();
                                    int iM71625b = c24561s.m71625b();
                                    C5363q c5363qM107332f = AbstractC33922a.m107332f(c24561s, true);
                                    this.f53966u = c5363qM107332f.f21805a;
                                    this.f53963r = c5363qM107332f.f21806b;
                                    this.f53965t = c5363qM107332f.f21807c;
                                    int iM71625b2 = iM71625b - c24561s.m71625b();
                                    c24561s.m71640q(iM71630g);
                                    byte[] bArr2 = new byte[(iM71625b2 + 7) / 8];
                                    c24561s.m71633j(iM71625b2, bArr2);
                                    C31518b0 c31518b0 = new C31518b0();
                                    c31518b0.f130037a = this.f53950e;
                                    c31518b0.f130047k = "audio/mp4a-latm";
                                    c31518b0.f130044h = this.f53966u;
                                    c31518b0.f130060x = this.f53965t;
                                    c31518b0.f130061y = this.f53963r;
                                    c31518b0.f130049m = Collections.singletonList(bArr2);
                                    c31518b0.f130039c = this.f53946a;
                                    C31521c0 c31521c0 = new C31521c0(c31518b0);
                                    if (!c31521c0.equals(this.f53951f)) {
                                        this.f53951f = c31521c0;
                                        this.f53964s = 1024000000 / ((long) c31521c0.f130091Z);
                                        this.f53949d.mo102730a(c31521c0);
                                    }
                                } else {
                                    int iM71632i6 = c24561s.m71632i((c24561s.m71632i(2) + 1) * 8);
                                    int iM71625b3 = c24561s.m71625b();
                                    C5363q c5363qM107332f2 = AbstractC33922a.m107332f(c24561s, true);
                                    this.f53966u = c5363qM107332f2.f21805a;
                                    this.f53963r = c5363qM107332f2.f21806b;
                                    this.f53965t = c5363qM107332f2.f21807c;
                                    c24561s.m71643t(iM71632i6 - (iM71625b3 - c24561s.m71625b()));
                                }
                                int iM71632i7 = c24561s.m71632i(3);
                                this.f53960o = iM71632i7;
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
                                this.f53961p = zM71631h2;
                                this.f53962q = 0L;
                                if (zM71631h2) {
                                    if (iM71632i2 == 1) {
                                        this.f53962q = c24561s.m71632i((c24561s.m71632i(2) + 1) * 8);
                                    } else {
                                        do {
                                            zM71631h = c24561s.m71631h();
                                            this.f53962q = (this.f53962q << 8) + ((long) c24561s.m71632i(8));
                                        } while (zM71631h);
                                    }
                                }
                                if (c24561s.m71631h()) {
                                    c24561s.m71643t(8);
                                }
                            }
                            if (this.f53958m != 0) {
                                throw ParserException.m15562a(null, null);
                            }
                            if (this.f53959n != 0) {
                                throw ParserException.m15562a(null, null);
                            }
                            if (this.f53960o != 0) {
                                throw ParserException.m15562a(null, null);
                            }
                            int i15 = 0;
                            do {
                                iM71632i = c24561s.m71632i(8);
                                i15 += iM71632i;
                            } while (iM71632i == 255);
                            int iM71630g2 = c24561s.m71630g();
                            if ((iM71630g2 & 7) == 0) {
                                c13117a2.m36689K(iM71630g2 >> 3);
                            } else {
                                c24561s.m71633j(i15 * 8, c13117a2.f45381a);
                                c13117a2.m36689K(0);
                            }
                            this.f53949d.mo102732c(i15, c13117a2);
                            long j7 = this.f53956k;
                            if (j7 != -9223372036854775807L) {
                                this.f53949d.mo102733d(j7, 1, i15, 0, null);
                                this.f53956k += this.f53964s;
                            }
                            if (this.f53961p) {
                                c24561s.m71643t((int) this.f53962q);
                            }
                            this.f53952g = 0;
                        } else {
                            continue;
                        }
                    }
                } else {
                    int iM36715y2 = c13117a.m36715y();
                    if ((iM36715y2 & 224) == 224) {
                        this.f53955j = iM36715y2;
                        this.f53952g = 2;
                    } else if (iM36715y2 != 86) {
                        this.f53952g = 0;
                    }
                }
            } else if (c13117a.m36715y() == 86) {
                this.f53952g = 1;
            }
        }
    }

    @Override // p151fn.InterfaceC14620h
    /* JADX INFO: renamed from: g */
    public final void mo1712g(InterfaceC37369k interfaceC37369k, C0690l0 c0690l0) {
        c0690l0.m1733c();
        c0690l0.m1738h();
        this.f53949d = interfaceC37369k.mo3102o(c0690l0.f2494e, 1);
        c0690l0.m1738h();
        this.f53950e = (String) c0690l0.f2495f;
    }

    @Override // p151fn.InterfaceC14620h
    /* JADX INFO: renamed from: h */
    public final void mo1713h() {
    }
}
