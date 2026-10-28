package p012ab;

import androidx.health.platform.client.proto.C1533u;
import androidx.media3.common.ParserException;
import no.nordicsemi.android.dfu.DfuBaseService;
import p309lo.C24561s;
import p499t9.InterfaceC33639k0;
import p499t9.InterfaceC33648q;
import p516u8.AbstractC34587d0;
import p516u8.C34608o;
import p516u8.C34610p;
import p522uf.AbstractC34870c0;
import p607x8.AbstractC38065t;
import p607x8.C38059n;
import p690zr.AbstractC41023g0;
import p690zr.C41060w0;
import va3.AbstractC35849g;

/* JADX INFO: renamed from: ab.w */
/* JADX INFO: loaded from: classes5.dex */
public final class C0702w implements InterfaceC0685j {

    /* JADX INFO: renamed from: e */
    public String f2642e;

    /* JADX INFO: renamed from: f */
    public InterfaceC33639k0 f2643f;

    /* JADX INFO: renamed from: i */
    public boolean f2646i;

    /* JADX INFO: renamed from: k */
    public int f2648k;

    /* JADX INFO: renamed from: l */
    public int f2649l;

    /* JADX INFO: renamed from: n */
    public int f2651n;

    /* JADX INFO: renamed from: o */
    public int f2652o;

    /* JADX INFO: renamed from: s */
    public int f2656s;

    /* JADX INFO: renamed from: u */
    public boolean f2658u;

    /* JADX INFO: renamed from: d */
    public int f2641d = 0;

    /* JADX INFO: renamed from: a */
    public final C38059n f2638a = new C38059n(new byte[15], 2);

    /* JADX INFO: renamed from: b */
    public final C24561s f2639b = new C24561s(5);

    /* JADX INFO: renamed from: c */
    public final C38059n f2640c = new C38059n();

    /* JADX INFO: renamed from: p */
    public final C0703x f2653p = new C0703x();

    /* JADX INFO: renamed from: q */
    public int f2654q = -2147483647;

    /* JADX INFO: renamed from: r */
    public int f2655r = -1;

    /* JADX INFO: renamed from: t */
    public long f2657t = -1;

    /* JADX INFO: renamed from: j */
    public boolean f2647j = true;

    /* JADX INFO: renamed from: m */
    public boolean f2650m = true;

    /* JADX INFO: renamed from: g */
    public double f2644g = -9.223372036854776E18d;

    /* JADX INFO: renamed from: h */
    public double f2645h = -9.223372036854776E18d;

    @Override // p012ab.InterfaceC0685j
    /* JADX INFO: renamed from: a */
    public final void mo1663a() {
        this.f2641d = 0;
        this.f2649l = 0;
        this.f2638a.m121843C(2);
        this.f2651n = 0;
        this.f2652o = 0;
        this.f2654q = -2147483647;
        this.f2655r = -1;
        this.f2656s = 0;
        this.f2657t = -1L;
        this.f2658u = false;
        this.f2646i = false;
        this.f2650m = true;
        this.f2647j = true;
        this.f2644g = -9.223372036854776E18d;
        this.f2645h = -9.223372036854776E18d;
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:155:0x02c3  */
    /* JADX WARN: Code duplicated, block: B:157:0x02ca  */
    /* JADX WARN: Code duplicated, block: B:159:0x02de  */
    /* JADX WARN: Code duplicated, block: B:162:0x02e8  */
    /* JADX WARN: Code duplicated, block: B:189:0x03be  */
    /* JADX WARN: Instruction removed from duplicated block: B:155:0x02c3, please report this as an issue */
    @Override // p012ab.InterfaceC0685j
    /* JADX INFO: renamed from: c */
    public final void mo1664c(C38059n c38059n) throws ParserException {
        int i13;
        int i14;
        int iM71632i;
        int iM71632i2;
        int i15;
        char c3;
        byte[] bArr;
        long j7;
        long j13;
        C41060w0 c41060w0M133257t;
        int iM71632i3;
        long j14;
        boolean z4;
        int i16;
        AbstractC35849g.m113808j(this.f2643f);
        while (c38059n.m121848a() > 0) {
            int i17 = this.f2641d;
            int i18 = 8;
            int i19 = 3;
            int i24 = 1;
            if (i17 != 0) {
                C38059n c38059n2 = this.f2640c;
                C0703x c0703x = this.f2653p;
                if (i17 == 1) {
                    int iM121848a = c38059n.m121848a();
                    C38059n c38059n3 = this.f2638a;
                    int iMin = Math.min(iM121848a, c38059n3.m121848a());
                    c38059n.m121852e(c38059n3.f163017a, c38059n3.f163018b, iMin);
                    c38059n3.m121847G(iMin);
                    if (c38059n3.m121848a() == 0) {
                        int i25 = c38059n3.f163019c;
                        byte[] bArr2 = c38059n3.f163017a;
                        C24561s c24561s = this.f2639b;
                        c24561s.m71638o(i25, bArr2);
                        c24561s.m71629f();
                        int iM109999h0 = AbstractC34870c0.m109999h0(c24561s, 3, 8, 8);
                        c0703x.f2659a = iM109999h0;
                        if (iM109999h0 != -1) {
                            AbstractC35849g.m113802d(Math.max(Math.max(2, 8), 32) <= 63);
                            AbstractC34870c0.m109971F(AbstractC34870c0.m109971F(3L, 255L), 4294967296L);
                            if (c24561s.m71625b() < 2) {
                                j14 = -1;
                            } else {
                                long jM71634k = c24561s.m71634k(2);
                                if (jM71634k == 3) {
                                    if (c24561s.m71625b() >= 8) {
                                        long jM71634k2 = c24561s.m71634k(8);
                                        jM71634k += jM71634k2;
                                        if (jM71634k2 == 255) {
                                            if (c24561s.m71625b() >= 32) {
                                                jM71634k = c24561s.m71634k(32) + jM71634k;
                                            }
                                        }
                                    }
                                    j14 = -1;
                                }
                                j14 = jM71634k;
                            }
                            c0703x.f2660b = j14;
                            if (j14 == -1) {
                                z4 = false;
                            } else {
                                if (j14 > 16) {
                                    throw ParserException.m5051c("Contains sub-stream with an invalid packet label " + c0703x.f2660b);
                                }
                                if (j14 == 0) {
                                    int i26 = c0703x.f2659a;
                                    if (i26 == 1) {
                                        throw ParserException.m5049a(null, "Mpegh3daConfig packet with invalid packet label 0");
                                    }
                                    if (i26 == 2) {
                                        throw ParserException.m5049a(null, "Mpegh3daFrame packet with invalid packet label 0");
                                    }
                                    if (i26 == 17) {
                                        throw ParserException.m5049a(null, "AudioTruncation packet with invalid packet label 0");
                                    }
                                }
                                int iM109999h1 = AbstractC34870c0.m109999h0(c24561s, 11, 24, 24);
                                c0703x.f2661c = iM109999h1;
                                if (iM109999h1 != -1) {
                                    z4 = true;
                                } else {
                                    z4 = false;
                                }
                            }
                        } else {
                            z4 = false;
                        }
                        if (z4) {
                            i16 = 0;
                            this.f2651n = 0;
                            this.f2652o = c0703x.f2661c + i25 + this.f2652o;
                        } else {
                            i16 = 0;
                        }
                        if (z4) {
                            c38059n3.m121846F(i16);
                            this.f2643f.mo36176d(c38059n3, c38059n3.f163019c, i16);
                            c38059n3.m121843C(2);
                            c38059n2.m121843C(c0703x.f2661c);
                            this.f2650m = true;
                            this.f2641d = 2;
                        } else {
                            int i27 = c38059n3.f163019c;
                            if (i27 < 15) {
                                c38059n3.m121845E(i27 + 1);
                                this.f2650m = false;
                            }
                        }
                    } else {
                        this.f2650m = false;
                    }
                } else {
                    if (i17 != 2) {
                        throw new IllegalStateException();
                    }
                    int i28 = c0703x.f2659a;
                    if (i28 == 1 || i28 == 17) {
                        int i29 = c38059n.f163018b;
                        int iMin2 = Math.min(c38059n.m121848a(), c38059n2.m121848a());
                        c38059n.m121852e(c38059n2.f163017a, c38059n2.f163018b, iMin2);
                        c38059n2.m121847G(iMin2);
                        c38059n.m121846F(i29);
                    }
                    int iMin3 = Math.min(c38059n.m121848a(), c0703x.f2661c - this.f2651n);
                    this.f2643f.mo36176d(c38059n, iMin3, 0);
                    int i34 = this.f2651n + iMin3;
                    this.f2651n = i34;
                    if (i34 != c0703x.f2661c) {
                        continue;
                    } else {
                        int i35 = c0703x.f2659a;
                        if (i35 == 1) {
                            byte[] bArr3 = c38059n2.f163017a;
                            C24561s c24561s2 = new C24561s(bArr3, bArr3.length, 5, (byte) 0);
                            int iM71632i4 = c24561s2.m71632i(8);
                            int iM71632i5 = c24561s2.m71632i(5);
                            if (iM71632i5 != 31) {
                                switch (iM71632i5) {
                                    case 0:
                                        iM71632i2 = 96000;
                                        break;
                                    case 1:
                                        iM71632i2 = 88200;
                                        break;
                                    case 2:
                                        iM71632i2 = 64000;
                                        break;
                                    case 3:
                                        iM71632i2 = 48000;
                                        break;
                                    case 4:
                                        iM71632i2 = 44100;
                                        break;
                                    case 5:
                                        iM71632i2 = 32000;
                                        break;
                                    case 6:
                                        iM71632i2 = 24000;
                                        break;
                                    case 7:
                                        iM71632i2 = 22050;
                                        break;
                                    case 8:
                                        iM71632i2 = 16000;
                                        break;
                                    case 9:
                                        iM71632i2 = 12000;
                                        break;
                                    case 10:
                                        iM71632i2 = 11025;
                                        break;
                                    case 11:
                                        iM71632i2 = 8000;
                                        break;
                                    case 12:
                                        iM71632i2 = 7350;
                                        break;
                                    case 13:
                                    case 14:
                                    default:
                                        throw ParserException.m5051c("Unsupported sampling rate index " + iM71632i5);
                                    case 15:
                                        iM71632i2 = 57600;
                                        break;
                                    case 16:
                                        iM71632i2 = 51200;
                                        break;
                                    case C1533u.MAX_FIELD_NUMBER /* 17 */:
                                        iM71632i2 = 40000;
                                        break;
                                    case C1533u.AVG_FIELD_NUMBER /* 18 */:
                                        iM71632i2 = 38400;
                                        break;
                                    case C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER /* 19 */:
                                        iM71632i2 = 34150;
                                        break;
                                    case 20:
                                        iM71632i2 = 28800;
                                        break;
                                    case 21:
                                        iM71632i2 = 25600;
                                        break;
                                    case C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER /* 22 */:
                                        iM71632i2 = 20000;
                                        break;
                                    case C1533u.RECORDING_METHOD_FIELD_NUMBER /* 23 */:
                                        iM71632i2 = 19200;
                                        break;
                                    case 24:
                                        iM71632i2 = 17075;
                                        break;
                                    case 25:
                                        iM71632i2 = 14400;
                                        break;
                                    case 26:
                                        iM71632i2 = 12800;
                                        break;
                                    case 27:
                                        iM71632i2 = 9600;
                                        break;
                                }
                            } else {
                                iM71632i2 = c24561s2.m71632i(24);
                            }
                            int iM71632i6 = c24561s2.m71632i(3);
                            if (iM71632i6 == 0) {
                                i15 = 768;
                            } else if (iM71632i6 == 1) {
                                i15 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_EXTENDED;
                            } else if (iM71632i6 == 2 || iM71632i6 == 3) {
                                i15 = DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS;
                            } else {
                                if (iM71632i6 != 4) {
                                    throw ParserException.m5051c("Unsupported coreSbrFrameLengthIndex " + iM71632i6);
                                }
                                i15 = 4096;
                            }
                            int i36 = i15;
                            if (iM71632i6 == 0 || iM71632i6 == 1) {
                                c3 = 0;
                            } else if (iM71632i6 == 2) {
                                c3 = 2;
                            } else if (iM71632i6 == 3) {
                                c3 = 3;
                            } else {
                                if (iM71632i6 != 4) {
                                    throw ParserException.m5051c("Unsupported coreSbrFrameLengthIndex " + iM71632i6);
                                }
                                c3 = 1;
                            }
                            c24561s2.m71643t(2);
                            AbstractC34870c0.m110008m0(c24561s2);
                            int iM71632i7 = c24561s2.m71632i(5);
                            int i37 = 0;
                            int iM109999h2 = 0;
                            while (true) {
                                int i38 = i24;
                                int i39 = 16;
                                if (i37 < iM71632i7 + 1) {
                                    int iM71632i8 = c24561s2.m71632i(3);
                                    iM109999h2 = AbstractC34870c0.m109999h0(c24561s2, 5, 8, 16) + 1 + iM109999h2;
                                    if ((iM71632i8 == 0 || iM71632i8 == 2) && c24561s2.m71631h()) {
                                        AbstractC34870c0.m110008m0(c24561s2);
                                    }
                                    i37++;
                                    i24 = i38;
                                } else {
                                    int iM109999h3 = AbstractC34870c0.m109999h0(c24561s2, 4, 8, 16) + 1;
                                    c24561s2.m71642s();
                                    int i44 = 0;
                                    while (true) {
                                        double d3 = 2.0d;
                                        if (i44 < iM109999h3) {
                                            int iM71632i9 = c24561s2.m71632i(2);
                                            if (iM71632i9 == 0) {
                                                c24561s2.m71643t(i19);
                                                if (c24561s2.m71631h()) {
                                                    c24561s2.m71643t(13);
                                                }
                                                if (c3 > 0) {
                                                    AbstractC34870c0.m110006l0(c24561s2);
                                                }
                                            } else if (iM71632i9 == i38) {
                                                c24561s2.m71643t(i19);
                                                boolean zM71631h = c24561s2.m71631h();
                                                if (zM71631h) {
                                                    c24561s2.m71643t(13);
                                                }
                                                if (zM71631h) {
                                                    c24561s2.m71642s();
                                                }
                                                if (c3 > 0) {
                                                    AbstractC34870c0.m110006l0(c24561s2);
                                                    iM71632i3 = c24561s2.m71632i(2);
                                                } else {
                                                    iM71632i3 = 0;
                                                }
                                                if (iM71632i3 > 0) {
                                                    c24561s2.m71643t(6);
                                                    int iM71632i10 = c24561s2.m71632i(2);
                                                    c24561s2.m71643t(4);
                                                    if (c24561s2.m71631h()) {
                                                        c24561s2.m71643t(5);
                                                    }
                                                    if (iM71632i3 == 2 || iM71632i3 == i19) {
                                                        c24561s2.m71643t(6);
                                                    }
                                                    if (iM71632i10 == 2) {
                                                        c24561s2.m71642s();
                                                    }
                                                }
                                                int iFloor = ((int) Math.floor(Math.log(iM109999h2 - 1) / Math.log(2.0d))) + 1;
                                                int iM71632i11 = c24561s2.m71632i(2);
                                                if (iM71632i11 > 0 && c24561s2.m71631h()) {
                                                    c24561s2.m71643t(iFloor);
                                                }
                                                if (c24561s2.m71631h()) {
                                                    c24561s2.m71643t(iFloor);
                                                }
                                                if (c3 == 0 && iM71632i11 == 0) {
                                                    c24561s2.m71642s();
                                                }
                                            } else if (iM71632i9 == i19) {
                                                AbstractC34870c0.m109999h0(c24561s2, 4, i18, i39);
                                                int iM109999h4 = AbstractC34870c0.m109999h0(c24561s2, 4, i18, i39);
                                                if (c24561s2.m71631h()) {
                                                    AbstractC34870c0.m109999h0(c24561s2, i18, i39, 0);
                                                }
                                                c24561s2.m71642s();
                                                if (iM109999h4 > 0) {
                                                    c24561s2.m71643t(iM109999h4 * 8);
                                                }
                                            }
                                            i44++;
                                            i18 = 8;
                                            i19 = 3;
                                            i39 = 16;
                                            i38 = 1;
                                        } else {
                                            if (c24561s2.m71631h()) {
                                                int i45 = 8;
                                                int iM109999h5 = AbstractC34870c0.m109999h0(c24561s2, 2, 4, 8) + 1;
                                                int i46 = 0;
                                                bArr = null;
                                                while (i46 < iM109999h5) {
                                                    int iM109999h6 = AbstractC34870c0.m109999h0(c24561s2, 4, i45, 16);
                                                    int iM109999h7 = AbstractC34870c0.m109999h0(c24561s2, 4, i45, 16);
                                                    if (iM109999h6 == 7) {
                                                        int iM71632i12 = c24561s2.m71632i(4) + 1;
                                                        c24561s2.m71643t(4);
                                                        byte[] bArr4 = new byte[iM71632i12];
                                                        for (int i47 = 0; i47 < iM71632i12; i47++) {
                                                            bArr4[i47] = (byte) c24561s2.m71632i(i45);
                                                        }
                                                        bArr = bArr4;
                                                    } else {
                                                        c24561s2.m71643t(iM109999h7 * i45);
                                                    }
                                                    i46++;
                                                    i45 = 8;
                                                }
                                            } else {
                                                bArr = null;
                                            }
                                            switch (iM71632i2) {
                                                case 14700:
                                                case 16000:
                                                    d3 = 3.0d;
                                                    this.f2654q = (int) (((double) iM71632i2) * d3);
                                                    this.f2655r = (int) (((double) i36) * d3);
                                                    j7 = this.f2657t;
                                                    j13 = c0703x.f2660b;
                                                    if (j7 != j13) {
                                                        this.f2657t = j13;
                                                        String strConcat = iM71632i4 != -1 ? "mhm1".concat(String.format(".%02X", Integer.valueOf(iM71632i4))) : "mhm1";
                                                        if (bArr != null || bArr.length <= 0) {
                                                            c41060w0M133257t = null;
                                                        } else {
                                                            c41060w0M133257t = AbstractC41023g0.m133257t(AbstractC38065t.f163033c, bArr);
                                                        }
                                                        C34608o c34608o = new C34608o();
                                                        c34608o.f145729a = this.f2642e;
                                                        c34608o.f145740l = AbstractC34587d0.m109382o("video/mp2t");
                                                        c34608o.f145741m = AbstractC34587d0.m109382o("audio/mhm1");
                                                        c34608o.f145720D = this.f2654q;
                                                        c34608o.f145738j = strConcat;
                                                        c34608o.f145744p = c41060w0M133257t;
                                                        this.f2643f.mo36173a(new C34610p(c34608o));
                                                    }
                                                    i14 = 1;
                                                    this.f2658u = true;
                                                    break;
                                                case 22050:
                                                case 24000:
                                                    this.f2654q = (int) (((double) iM71632i2) * d3);
                                                    this.f2655r = (int) (((double) i36) * d3);
                                                    j7 = this.f2657t;
                                                    j13 = c0703x.f2660b;
                                                    if (j7 != j13) {
                                                        this.f2657t = j13;
                                                        if (iM71632i4 != -1) {
                                                        }
                                                        if (bArr != null) {
                                                            c41060w0M133257t = null;
                                                        } else {
                                                            c41060w0M133257t = null;
                                                        }
                                                        C34608o c34608o2 = new C34608o();
                                                        c34608o2.f145729a = this.f2642e;
                                                        c34608o2.f145740l = AbstractC34587d0.m109382o("video/mp2t");
                                                        c34608o2.f145741m = AbstractC34587d0.m109382o("audio/mhm1");
                                                        c34608o2.f145720D = this.f2654q;
                                                        c34608o2.f145738j = strConcat;
                                                        c34608o2.f145744p = c41060w0M133257t;
                                                        this.f2643f.mo36173a(new C34610p(c34608o2));
                                                    }
                                                    i14 = 1;
                                                    this.f2658u = true;
                                                    break;
                                                case 29400:
                                                case 32000:
                                                case 58800:
                                                case 64000:
                                                    d3 = 1.5d;
                                                    this.f2654q = (int) (((double) iM71632i2) * d3);
                                                    this.f2655r = (int) (((double) i36) * d3);
                                                    j7 = this.f2657t;
                                                    j13 = c0703x.f2660b;
                                                    if (j7 != j13) {
                                                        this.f2657t = j13;
                                                        if (iM71632i4 != -1) {
                                                        }
                                                        if (bArr != null) {
                                                            c41060w0M133257t = null;
                                                        } else {
                                                            c41060w0M133257t = null;
                                                        }
                                                        C34608o c34608o3 = new C34608o();
                                                        c34608o3.f145729a = this.f2642e;
                                                        c34608o3.f145740l = AbstractC34587d0.m109382o("video/mp2t");
                                                        c34608o3.f145741m = AbstractC34587d0.m109382o("audio/mhm1");
                                                        c34608o3.f145720D = this.f2654q;
                                                        c34608o3.f145738j = strConcat;
                                                        c34608o3.f145744p = c41060w0M133257t;
                                                        this.f2643f.mo36173a(new C34610p(c34608o3));
                                                    }
                                                    i14 = 1;
                                                    this.f2658u = true;
                                                    break;
                                                case 44100:
                                                case 48000:
                                                case 88200:
                                                case 96000:
                                                    d3 = 1.0d;
                                                    this.f2654q = (int) (((double) iM71632i2) * d3);
                                                    this.f2655r = (int) (((double) i36) * d3);
                                                    j7 = this.f2657t;
                                                    j13 = c0703x.f2660b;
                                                    if (j7 != j13) {
                                                        this.f2657t = j13;
                                                        if (iM71632i4 != -1) {
                                                        }
                                                        if (bArr != null) {
                                                            c41060w0M133257t = null;
                                                        } else {
                                                            c41060w0M133257t = null;
                                                        }
                                                        C34608o c34608o4 = new C34608o();
                                                        c34608o4.f145729a = this.f2642e;
                                                        c34608o4.f145740l = AbstractC34587d0.m109382o("video/mp2t");
                                                        c34608o4.f145741m = AbstractC34587d0.m109382o("audio/mhm1");
                                                        c34608o4.f145720D = this.f2654q;
                                                        c34608o4.f145738j = strConcat;
                                                        c34608o4.f145744p = c41060w0M133257t;
                                                        this.f2643f.mo36173a(new C34610p(c34608o4));
                                                    }
                                                    i14 = 1;
                                                    this.f2658u = true;
                                                    break;
                                                default:
                                                    throw ParserException.m5051c("Unsupported sampling rate " + iM71632i2);
                                            }
                                        }
                                    }
                                }
                            }
                        } else {
                            if (i35 == 17) {
                                byte[] bArr5 = c38059n2.f163017a;
                                C24561s c24561s3 = new C24561s(bArr5, bArr5.length, 5, (byte) 0);
                                if (c24561s3.m71631h()) {
                                    c24561s3.m71643t(2);
                                    iM71632i = c24561s3.m71632i(13);
                                } else {
                                    iM71632i = 0;
                                }
                                this.f2656s = iM71632i;
                            } else if (i35 == 2) {
                                if (this.f2658u) {
                                    this.f2647j = false;
                                    i13 = 1;
                                } else {
                                    i13 = 0;
                                }
                                double d14 = (((double) (this.f2655r - this.f2656s)) * 1000000.0d) / ((double) this.f2654q);
                                long jRound = Math.round(this.f2644g);
                                if (this.f2646i) {
                                    this.f2646i = false;
                                    this.f2644g = this.f2645h;
                                } else {
                                    this.f2644g += d14;
                                }
                                this.f2643f.mo36174b(jRound, i13, this.f2652o, 0, null);
                                this.f2658u = false;
                                this.f2656s = 0;
                                this.f2652o = 0;
                            }
                            i14 = 1;
                        }
                        this.f2641d = i14;
                    }
                }
            } else {
                int i48 = this.f2648k;
                if ((i48 & 2) == 0) {
                    c38059n.m121846F(c38059n.f163019c);
                } else {
                    if ((i48 & 4) == 0) {
                        while (true) {
                            if (c38059n.m121848a() > 0) {
                                int i49 = this.f2649l << 8;
                                this.f2649l = i49;
                                int iM121867t = i49 | c38059n.m121867t();
                                this.f2649l = iM121867t;
                                if ((iM121867t & 16777215) == 12583333) {
                                    c38059n.m121846F(c38059n.f163018b - 3);
                                    this.f2649l = 0;
                                }
                            }
                        }
                    }
                    this.f2641d = 1;
                }
            }
        }
    }

    @Override // p012ab.InterfaceC0685j
    /* JADX INFO: renamed from: d */
    public final void mo1665d(int i13, long j7) {
        this.f2648k = i13;
        if (!this.f2647j && (this.f2652o != 0 || !this.f2650m)) {
            this.f2646i = true;
        }
        if (j7 != -9223372036854775807L) {
            if (this.f2646i) {
                this.f2645h = j7;
            } else {
                this.f2644g = j7;
            }
        }
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
        this.f2642e = (String) c0690l0.f2495f;
        c0690l0.m1738h();
        this.f2643f = interfaceC33648q.mo3101o(c0690l0.f2494e, 1);
    }
}
