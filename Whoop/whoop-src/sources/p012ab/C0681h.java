package p012ab;

import androidx.media3.common.ParserException;
import com.iterable.iterableapi.C5363q;
import java.math.RoundingMode;
import java.util.concurrent.atomic.AtomicInteger;
import p309lo.C24561s;
import p499t9.AbstractC33618a;
import p499t9.InterfaceC33639k0;
import p499t9.InterfaceC33648q;
import p516u8.AbstractC34587d0;
import p516u8.C34608o;
import p516u8.C34610p;
import p550vd.AbstractC35903f;
import p607x8.AbstractC38065t;
import p607x8.C38059n;
import va3.AbstractC35849g;

/* JADX INFO: renamed from: ab.h */
/* JADX INFO: loaded from: classes5.dex */
public final class C0681h implements InterfaceC0685j {

    /* JADX INFO: renamed from: a */
    public final C38059n f2414a;

    /* JADX INFO: renamed from: c */
    public final String f2416c;

    /* JADX INFO: renamed from: d */
    public final int f2417d;

    /* JADX INFO: renamed from: f */
    public String f2419f;

    /* JADX INFO: renamed from: g */
    public InterfaceC33639k0 f2420g;

    /* JADX INFO: renamed from: i */
    public int f2422i;

    /* JADX INFO: renamed from: j */
    public int f2423j;

    /* JADX INFO: renamed from: k */
    public long f2424k;

    /* JADX INFO: renamed from: l */
    public C34610p f2425l;

    /* JADX INFO: renamed from: m */
    public int f2426m;

    /* JADX INFO: renamed from: n */
    public int f2427n;

    /* JADX INFO: renamed from: h */
    public int f2421h = 0;

    /* JADX INFO: renamed from: q */
    public long f2430q = -9223372036854775807L;

    /* JADX INFO: renamed from: b */
    public final AtomicInteger f2415b = new AtomicInteger();

    /* JADX INFO: renamed from: o */
    public int f2428o = -1;

    /* JADX INFO: renamed from: p */
    public int f2429p = -1;

    /* JADX INFO: renamed from: e */
    public final String f2418e = "video/mp2t";

    public C0681h(String str, int i13, int i14) {
        this.f2414a = new C38059n(new byte[i14]);
        this.f2416c = str;
        this.f2417d = i13;
    }

    @Override // p012ab.InterfaceC0685j
    /* JADX INFO: renamed from: a */
    public final void mo1663a() {
        this.f2421h = 0;
        this.f2422i = 0;
        this.f2423j = 0;
        this.f2430q = -9223372036854775807L;
        this.f2415b.set(0);
    }

    /* JADX INFO: renamed from: b */
    public final boolean m1683b(C38059n c38059n, byte[] bArr, int i13) {
        int iMin = Math.min(c38059n.m121848a(), i13 - this.f2422i);
        c38059n.m121852e(bArr, this.f2422i, iMin);
        int i14 = this.f2422i + iMin;
        this.f2422i = i14;
        return i14 == i13;
    }

    /* JADX WARN: Code duplicated, block: B:178:0x0480  */
    /* JADX WARN: Code duplicated, block: B:181:0x0488  */
    /* JADX WARN: Code duplicated, block: B:183:0x048b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:184:0x048d  */
    /* JADX WARN: Code duplicated, block: B:187:0x049d  */
    /* JADX WARN: Code duplicated, block: B:189:0x04ad  */
    /* JADX WARN: Code duplicated, block: B:190:0x04ba  */
    @Override // p012ab.InterfaceC0685j
    /* JADX INFO: renamed from: c */
    public final void mo1664c(C38059n c38059n) throws ParserException {
        int i13;
        int i14;
        byte b;
        boolean z4;
        int i15;
        int i16;
        byte b6;
        int i17;
        byte b8;
        int i18;
        byte b14;
        int i19;
        int i24;
        int iM71632i;
        int iM71632i2;
        int iM71632i3;
        int i25;
        long jM121903Q;
        int i26;
        long jM121903Q2;
        int i27;
        int i28;
        int i29;
        int i34;
        AbstractC35849g.m113808j(this.f2420g);
        while (c38059n.m121848a() > 0) {
            int i35 = this.f2421h;
            int i36 = 8;
            C38059n c38059n2 = this.f2414a;
            switch (i35) {
                case 0:
                    while (c38059n.m121848a() > 0) {
                        int i37 = this.f2423j << 8;
                        this.f2423j = i37;
                        int iM121867t = i37 | c38059n.m121867t();
                        this.f2423j = iM121867t;
                        if (iM121867t == 2147385345 || iM121867t == -25230976 || iM121867t == 536864768 || iM121867t == -14745368) {
                            i13 = 1;
                        } else if (iM121867t == 1683496997 || iM121867t == 622876772) {
                            i13 = 2;
                        } else if (iM121867t == 1078008818 || iM121867t == -233094848) {
                            i13 = 3;
                        } else {
                            i13 = (iM121867t == 1908687592 || iM121867t == -398277519) ? 4 : 0;
                        }
                        this.f2427n = i13;
                        if (i13 != 0) {
                            byte[] bArr = c38059n2.f163017a;
                            bArr[0] = (byte) ((iM121867t >> 24) & 255);
                            bArr[1] = (byte) ((iM121867t >> 16) & 255);
                            bArr[2] = (byte) ((iM121867t >> 8) & 255);
                            bArr[3] = (byte) (iM121867t & 255);
                            this.f2422i = 4;
                            this.f2423j = 0;
                            if (i13 != 3 && i13 != 4) {
                                if (i13 == 1) {
                                    this.f2421h = 1;
                                } else {
                                    this.f2421h = 2;
                                }
                            }
                            this.f2421h = 4;
                        }
                        break;
                    }
                    break;
                case 1:
                    if (m1683b(c38059n, c38059n2.f163017a, 18)) {
                        byte[] bArr2 = c38059n2.f163017a;
                        if (this.f2425l == null) {
                            String str = this.f2419f;
                            C24561s c24561sM106217i = AbstractC33618a.m106217i(bArr2);
                            c24561sM106217i.m71643t(60);
                            int i38 = AbstractC33618a.f140311j[c24561sM106217i.m71632i(6)];
                            int i39 = AbstractC33618a.f140312k[c24561sM106217i.m71632i(4)];
                            int iM71632i4 = c24561sM106217i.m71632i(5);
                            int i44 = iM71632i4 >= 29 ? -1 : (AbstractC33618a.f140313l[iM71632i4] * 1000) / 2;
                            c24561sM106217i.m71643t(10);
                            int i45 = i38 + (c24561sM106217i.m71632i(2) > 0 ? 1 : 0);
                            C34608o c34608o = new C34608o();
                            c34608o.f145729a = str;
                            c34608o.f145740l = AbstractC34587d0.m109382o(this.f2418e);
                            c34608o.f145741m = AbstractC34587d0.m109382o("audio/vnd.dts");
                            c34608o.f145736h = i44;
                            c34608o.f145719C = i45;
                            c34608o.f145720D = i39;
                            c34608o.f145745q = null;
                            c34608o.f145732d = this.f2416c;
                            c34608o.f145734f = this.f2417d;
                            C34610p c34610p = new C34610p(c34608o);
                            this.f2425l = c34610p;
                            this.f2420g.mo36173a(c34610p);
                        }
                        byte b15 = bArr2[0];
                        if (b15 != -2) {
                            if (b15 == -1) {
                                i18 = ((bArr2[7] & 3) << 12) | ((bArr2[6] & 255) << 4);
                                b14 = bArr2[9];
                            } else if (b15 != 31) {
                                i14 = ((bArr2[5] & 3) << 12) | ((bArr2[6] & 255) << 4);
                                b = bArr2[7];
                            } else {
                                i18 = ((bArr2[6] & 3) << 12) | ((bArr2[7] & 255) << 4);
                                b14 = bArr2[8];
                            }
                            i15 = (i18 | ((b14 & 60) >> 2)) + 1;
                            z4 = true;
                            if (z4) {
                                i15 = (i15 * 16) / 14;
                            }
                            this.f2426m = i15;
                            if (b15 != -2) {
                                if (b15 != -1) {
                                    i16 = (bArr2[4] & 7) << 4;
                                    b8 = bArr2[7];
                                } else if (b15 != 31) {
                                    i16 = (bArr2[4] & 1) << 6;
                                    b6 = bArr2[5];
                                } else {
                                    i16 = (bArr2[5] & 7) << 4;
                                    b8 = bArr2[6];
                                }
                                i17 = b8 & 60;
                                this.f2424k = AbstractC35903f.m114016k(AbstractC38065t.m121901O(this.f2425l.f145760E, (((i17 >> 2) | i16) + 1) * 32));
                                c38059n2.m121846F(0);
                                this.f2420g.mo36176d(c38059n2, 18, 0);
                                this.f2421h = 6;
                            } else {
                                i16 = (bArr2[5] & 1) << 6;
                                b6 = bArr2[4];
                            }
                            i17 = b6 & 252;
                            this.f2424k = AbstractC35903f.m114016k(AbstractC38065t.m121901O(this.f2425l.f145760E, (((i17 >> 2) | i16) + 1) * 32));
                            c38059n2.m121846F(0);
                            this.f2420g.mo36176d(c38059n2, 18, 0);
                            this.f2421h = 6;
                        } else {
                            i14 = ((bArr2[4] & 3) << 12) | ((bArr2[7] & 255) << 4);
                            b = bArr2[6];
                        }
                        i15 = (i14 | ((b & 240) >> 4)) + 1;
                        z4 = false;
                        if (z4) {
                            i15 = (i15 * 16) / 14;
                        }
                        this.f2426m = i15;
                        if (b15 != -2) {
                            if (b15 != -1) {
                                i16 = (bArr2[4] & 7) << 4;
                                b8 = bArr2[7];
                            } else if (b15 != 31) {
                                i16 = (bArr2[4] & 1) << 6;
                                b6 = bArr2[5];
                            } else {
                                i16 = (bArr2[5] & 7) << 4;
                                b8 = bArr2[6];
                            }
                            i17 = b8 & 60;
                            this.f2424k = AbstractC35903f.m114016k(AbstractC38065t.m121901O(this.f2425l.f145760E, (((i17 >> 2) | i16) + 1) * 32));
                            c38059n2.m121846F(0);
                            this.f2420g.mo36176d(c38059n2, 18, 0);
                            this.f2421h = 6;
                        } else {
                            i16 = (bArr2[5] & 1) << 6;
                            b6 = bArr2[4];
                        }
                        i17 = b6 & 252;
                        this.f2424k = AbstractC35903f.m114016k(AbstractC38065t.m121901O(this.f2425l.f145760E, (((i17 >> 2) | i16) + 1) * 32));
                        c38059n2.m121846F(0);
                        this.f2420g.mo36176d(c38059n2, 18, 0);
                        this.f2421h = 6;
                        break;
                    }
                    break;
                case 2:
                    if (m1683b(c38059n, c38059n2.f163017a, 7)) {
                        C24561s c24561sM106217i2 = AbstractC33618a.m106217i(c38059n2.f163017a);
                        c24561sM106217i2.m71643t(42);
                        this.f2428o = c24561sM106217i2.m71632i(c24561sM106217i2.m71631h() ? 12 : 8) + 1;
                        this.f2421h = 3;
                    }
                    break;
                case 3:
                    if (m1683b(c38059n, c38059n2.f163017a, this.f2428o)) {
                        C24561s c24561sM106217i3 = AbstractC33618a.m106217i(c38059n2.f163017a);
                        c24561sM106217i3.m71643t(40);
                        int iM71632i5 = c24561sM106217i3.m71632i(2);
                        if (c24561sM106217i3.m71631h()) {
                            i19 = 20;
                            i24 = 12;
                        } else {
                            i19 = 16;
                            i24 = 8;
                        }
                        c24561sM106217i3.m71643t(i24);
                        int iM71632i6 = c24561sM106217i3.m71632i(i19) + 1;
                        boolean zM71631h = c24561sM106217i3.m71631h();
                        if (zM71631h) {
                            iM71632i = c24561sM106217i3.m71632i(2);
                            iM71632i2 = (c24561sM106217i3.m71632i(3) + 1) * 512;
                            if (c24561sM106217i3.m71631h()) {
                                c24561sM106217i3.m71643t(36);
                            }
                            int iM71632i7 = c24561sM106217i3.m71632i(3) + 1;
                            int iM71632i8 = c24561sM106217i3.m71632i(3) + 1;
                            if (iM71632i7 != 1 || iM71632i8 != 1) {
                                throw ParserException.m5051c("Multiple audio presentations or assets not supported");
                            }
                            int i46 = iM71632i5 + 1;
                            int iM71632i9 = c24561sM106217i3.m71632i(i46);
                            int i47 = 0;
                            while (i47 < i46) {
                                if (((iM71632i9 >> i47) & 1) == 1) {
                                    c24561sM106217i3.m71643t(i36);
                                }
                                i47++;
                                i36 = 8;
                            }
                            if (c24561sM106217i3.m71631h()) {
                                c24561sM106217i3.m71643t(2);
                                int iM71632i10 = (c24561sM106217i3.m71632i(2) + 1) << 2;
                                int iM71632i11 = c24561sM106217i3.m71632i(2) + 1;
                                for (int i48 = 0; i48 < iM71632i11; i48++) {
                                    c24561sM106217i3.m71643t(iM71632i10);
                                }
                            }
                        } else {
                            iM71632i = -1;
                            iM71632i2 = 0;
                        }
                        c24561sM106217i3.m71643t(i19);
                        c24561sM106217i3.m71643t(12);
                        if (zM71631h) {
                            if (c24561sM106217i3.m71631h()) {
                                c24561sM106217i3.m71643t(4);
                            }
                            if (c24561sM106217i3.m71631h()) {
                                c24561sM106217i3.m71643t(24);
                            }
                            if (c24561sM106217i3.m71631h()) {
                                c24561sM106217i3.m71644u(c24561sM106217i3.m71632i(10) + 1);
                            }
                            c24561sM106217i3.m71643t(5);
                            i25 = AbstractC33618a.f140314m[c24561sM106217i3.m71632i(4)];
                            iM71632i3 = c24561sM106217i3.m71632i(8) + 1;
                        } else {
                            iM71632i3 = -1;
                            i25 = -2147483647;
                        }
                        if (zM71631h) {
                            if (iM71632i == 0) {
                                i26 = 32000;
                            } else if (iM71632i == 1) {
                                i26 = 44100;
                            } else {
                                if (iM71632i != 2) {
                                    throw ParserException.m5049a(null, "Unsupported reference clock code in DTS HD header: " + iM71632i);
                                }
                                i26 = 48000;
                            }
                            int i49 = AbstractC38065t.f163031a;
                            jM121903Q = AbstractC38065t.m121903Q(iM71632i2, 1000000L, i26, RoundingMode.DOWN);
                        } else {
                            jM121903Q = -9223372036854775807L;
                        }
                        m1684f(new C5363q(iM71632i3, i25, iM71632i6, jM121903Q, "audio/vnd.dts.hd;profile=lbr"));
                        this.f2426m = iM71632i6;
                        this.f2424k = jM121903Q == -9223372036854775807L ? 0L : jM121903Q;
                        c38059n2.m121846F(0);
                        this.f2420g.mo36176d(c38059n2, this.f2428o, 0);
                        this.f2421h = 6;
                    } else {
                        continue;
                    }
                    break;
                case 4:
                    if (m1683b(c38059n, c38059n2.f163017a, 6)) {
                        C24561s c24561sM106217i4 = AbstractC33618a.m106217i(c38059n2.f163017a);
                        c24561sM106217i4.m71643t(32);
                        int iM106224p = AbstractC33618a.m106224p(c24561sM106217i4, AbstractC33618a.f140319r) + 1;
                        this.f2429p = iM106224p;
                        int i54 = this.f2422i;
                        if (i54 > iM106224p) {
                            int i55 = i54 - iM106224p;
                            this.f2422i = i54 - i55;
                            c38059n.m121846F(c38059n.f163018b - i55);
                        }
                        this.f2421h = 5;
                    }
                    break;
                case 5:
                    if (m1683b(c38059n, c38059n2.f163017a, this.f2429p)) {
                        byte[] bArr3 = c38059n2.f163017a;
                        C24561s c24561sM106217i5 = AbstractC33618a.m106217i(bArr3);
                        int i56 = c24561sM106217i5.m71632i(32) == 1078008818 ? 1 : 0;
                        int iM106224p2 = AbstractC33618a.m106224p(c24561sM106217i5, AbstractC33618a.f140315n);
                        int i57 = iM106224p2 + 1;
                        if (i56 == 0) {
                            jM121903Q2 = -9223372036854775807L;
                            i27 = -2147483647;
                        } else {
                            if (!c24561sM106217i5.m71631h()) {
                                throw ParserException.m5051c("Only supports full channel mask-based audio presentation");
                            }
                            int i58 = iM106224p2 - 1;
                            int i59 = ((bArr3[i58] << 8) & 65535) | (bArr3[iM106224p2] & 255);
                            int i64 = AbstractC38065t.f163031a;
                            int i65 = 65535;
                            for (int i66 = 0; i66 < i58; i66++) {
                                byte b16 = bArr3[i66];
                                int i67 = (((i65 >> 12) & 255) ^ ((b16 & 255) >> 4)) & 255;
                                int i68 = (i65 << 4) & 65535;
                                int[] iArr = AbstractC38065t.f163042l;
                                int i69 = (iArr[i67] ^ i68) & 65535;
                                i65 = (((i69 << 4) & 65535) ^ iArr[((b16 & 15) ^ ((i69 >> 12) & 255)) & 255]) & 65535;
                            }
                            if (i59 != i65) {
                                throw ParserException.m5049a(null, "CRC check failed");
                            }
                            int iM71632i12 = c24561sM106217i5.m71632i(2);
                            if (iM71632i12 != 0) {
                                if (iM71632i12 == 1) {
                                    i29 = 480;
                                } else {
                                    if (iM71632i12 != 2) {
                                        throw ParserException.m5049a(null, "Unsupported base duration index in DTS UHD header: " + iM71632i12);
                                    }
                                    i29 = 384;
                                }
                                i28 = 3;
                            } else {
                                i28 = 3;
                                i29 = 512;
                            }
                            int iM71632i13 = (c24561sM106217i5.m71632i(i28) + 1) * i29;
                            int iM71632i14 = c24561sM106217i5.m71632i(2);
                            if (iM71632i14 == 0) {
                                i34 = 32000;
                            } else if (iM71632i14 == 1) {
                                i34 = 44100;
                            } else {
                                if (iM71632i14 != 2) {
                                    throw ParserException.m5049a(null, "Unsupported clock rate index in DTS UHD header: " + iM71632i14);
                                }
                                i34 = 48000;
                            }
                            if (c24561sM106217i5.m71631h()) {
                                c24561sM106217i5.m71643t(36);
                            }
                            int iM71632i15 = i34 * (1 << c24561sM106217i5.m71632i(2));
                            jM121903Q2 = AbstractC38065t.m121903Q(iM71632i13, 1000000L, i34, RoundingMode.DOWN);
                            i27 = iM71632i15;
                        }
                        int iM106224p3 = 0;
                        for (int i74 = 0; i74 < i56; i74++) {
                            iM106224p3 += AbstractC33618a.m106224p(c24561sM106217i5, AbstractC33618a.f140316o);
                        }
                        AtomicInteger atomicInteger = this.f2415b;
                        if (i56 != 0) {
                            atomicInteger.set(AbstractC33618a.m106224p(c24561sM106217i5, AbstractC33618a.f140317p));
                        }
                        int iM106224p4 = iM106224p3 + (atomicInteger.get() != 0 ? AbstractC33618a.m106224p(c24561sM106217i5, AbstractC33618a.f140318q) : 0) + i57;
                        long j7 = jM121903Q2;
                        C5363q c5363q = new C5363q(2, i27, iM106224p4, j7, "audio/vnd.dts.uhd;profile=p2");
                        if (this.f2427n == 3) {
                            m1684f(c5363q);
                        }
                        this.f2426m = iM106224p4;
                        this.f2424k = j7 == -9223372036854775807L ? 0L : j7;
                        c38059n2.m121846F(0);
                        this.f2420g.mo36176d(c38059n2, this.f2429p, 0);
                        this.f2421h = 6;
                    } else {
                        continue;
                    }
                    break;
                case 6:
                    int iMin = Math.min(c38059n.m121848a(), this.f2426m - this.f2422i);
                    this.f2420g.mo36176d(c38059n, iMin, 0);
                    int i75 = this.f2422i + iMin;
                    this.f2422i = i75;
                    if (i75 == this.f2426m) {
                        AbstractC35849g.m113807i(this.f2430q != -9223372036854775807L);
                        this.f2420g.mo36174b(this.f2430q, this.f2427n == 4 ? 0 : 1, this.f2426m, 0, null);
                        this.f2430q += this.f2424k;
                        this.f2421h = 0;
                    }
                    break;
                default:
                    throw new IllegalStateException();
            }
        }
    }

    @Override // p012ab.InterfaceC0685j
    /* JADX INFO: renamed from: d */
    public final void mo1665d(int i13, long j7) {
        this.f2430q = j7;
    }

    @Override // p012ab.InterfaceC0685j
    /* JADX INFO: renamed from: e */
    public final void mo1666e(boolean z4) {
    }

    /* JADX INFO: renamed from: f */
    public final void m1684f(C5363q c5363q) {
        int i13 = c5363q.f21806b;
        String str = c5363q.f21805a;
        int i14 = c5363q.f21807c;
        if (i13 == -2147483647 || i14 == -1) {
            return;
        }
        C34610p c34610p = this.f2425l;
        if (c34610p != null && i14 == c34610p.f145759D && i13 == c34610p.f145760E && str.equals(c34610p.f145783n)) {
            return;
        }
        C34610p c34610p2 = this.f2425l;
        C34608o c34608o = c34610p2 == null ? new C34608o() : c34610p2.m109410a();
        c34608o.f145729a = this.f2419f;
        c34608o.f145740l = AbstractC34587d0.m109382o(this.f2418e);
        c34608o.f145741m = AbstractC34587d0.m109382o(str);
        c34608o.f145719C = i14;
        c34608o.f145720D = i13;
        c34608o.f145732d = this.f2416c;
        c34608o.f145734f = this.f2417d;
        C34610p c34610p3 = new C34610p(c34608o);
        this.f2425l = c34610p3;
        this.f2420g.mo36173a(c34610p3);
    }

    @Override // p012ab.InterfaceC0685j
    /* JADX INFO: renamed from: i */
    public final void mo1667i(InterfaceC33648q interfaceC33648q, C0690l0 c0690l0) {
        c0690l0.m1733c();
        c0690l0.m1738h();
        this.f2419f = (String) c0690l0.f2495f;
        c0690l0.m1738h();
        this.f2420g = interfaceC33648q.mo3101o(c0690l0.f2494e, 1);
    }
}
