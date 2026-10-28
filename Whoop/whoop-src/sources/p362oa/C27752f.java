package p362oa;

import androidx.media3.common.ParserException;
import java.util.ArrayList;
import java.util.Arrays;
import p012ab.C0684i0;
import p031b9.C2852m1;
import p123en.AbstractC13361h;
import p309lo.C24561s;
import p499t9.AbstractC33618a;
import p499t9.C33643m0;
import p499t9.C33645n0;
import p516u8.AbstractC34587d0;
import p516u8.C34585c0;
import p516u8.C34608o;
import p516u8.C34610p;
import p607x8.AbstractC38046a;
import p607x8.C38059n;
import p690zr.AbstractC41023g0;
import qg3.C30352d;
import va3.AbstractC35849g;

/* JADX INFO: renamed from: oa.f */
/* JADX INFO: loaded from: classes5.dex */
public final class C27752f extends AbstractC13361h {

    /* JADX INFO: renamed from: o */
    public C0684i0 f111917o;

    /* JADX INFO: renamed from: p */
    public int f111918p;

    /* JADX INFO: renamed from: q */
    public boolean f111919q;

    /* JADX INFO: renamed from: r */
    public C33645n0 f111920r;

    /* JADX INFO: renamed from: s */
    public C33643m0 f111921s;

    @Override // p123en.AbstractC13361h
    /* JADX INFO: renamed from: a */
    public final void mo37622a(long j7) {
        this.f46699d = j7;
        this.f111919q = j7 != 0;
        C33645n0 c33645n0 = this.f111920r;
        this.f111918p = c33645n0 != null ? c33645n0.f140430e : 0;
    }

    @Override // p123en.AbstractC13361h
    /* JADX INFO: renamed from: c */
    public final long mo37623c(C38059n c38059n) {
        byte b = c38059n.f163017a[0];
        if ((b & 1) == 1) {
            return -1L;
        }
        C0684i0 c0684i0 = this.f111917o;
        AbstractC35849g.m113808j(c0684i0);
        int i13 = c0684i0.f2445x;
        C33645n0 c33645n0 = (C33645n0) c0684i0.f2446y;
        int i14 = !((C2852m1[]) c0684i0.f2443F)[(b >> 1) & (255 >>> (8 - i13))].f11320x ? c33645n0.f140430e : c33645n0.f140431f;
        long j7 = this.f111919q ? (this.f111918p + i14) / 4 : 0;
        byte[] bArr = c38059n.f163017a;
        int length = bArr.length;
        int i15 = c38059n.f163019c + 4;
        if (length < i15) {
            byte[] bArrCopyOf = Arrays.copyOf(bArr, i15);
            c38059n.m121844D(bArrCopyOf.length, bArrCopyOf);
        } else {
            c38059n.m121845E(i15);
        }
        byte[] bArr2 = c38059n.f163017a;
        int i16 = c38059n.f163019c;
        bArr2[i16 - 4] = (byte) (j7 & 255);
        bArr2[i16 - 3] = (byte) ((j7 >>> 8) & 255);
        bArr2[i16 - 2] = (byte) ((j7 >>> 16) & 255);
        bArr2[i16 - 1] = (byte) ((j7 >>> 24) & 255);
        this.f111919q = true;
        this.f111918p = i14;
        return j7;
    }

    /* JADX WARN: Code duplicated, block: B:169:0x03ae A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:171:0x03b1  */
    @Override // p123en.AbstractC13361h
    /* JADX INFO: renamed from: e */
    public final boolean mo37624e(C38059n c38059n, long j7, C30352d c30352d) throws ParserException {
        C0684i0 c0684i0;
        if (this.f111917o != null) {
            ((C34610p) c30352d.f124535x).getClass();
            return false;
        }
        C33645n0 c33645n0 = this.f111920r;
        int i13 = 4;
        if (c33645n0 != null) {
            C33643m0 c33643m0 = this.f111921s;
            if (c33643m0 == null) {
                this.f111921s = AbstractC33618a.m106229u(c38059n, true, true);
            } else {
                int i14 = c38059n.f163019c;
                byte[] bArr = new byte[i14];
                System.arraycopy(c38059n.f163017a, 0, bArr, 0, i14);
                int i15 = c33645n0.f140426a;
                int i16 = 5;
                AbstractC33618a.m106231w(5, c38059n, false);
                int iM121867t = c38059n.m121867t() + 1;
                C24561s c24561s = new C24561s(c38059n.f163017a, 3);
                int i17 = 8;
                c24561s.m71643t(c38059n.f163018b * 8);
                int i18 = 0;
                while (true) {
                    int i19 = i17;
                    int i24 = 16;
                    if (i18 >= iM121867t) {
                        C33645n0 c33645n1 = c33645n0;
                        int i25 = 6;
                        int iM71632i = c24561s.m71632i(6) + 1;
                        for (int i26 = 0; i26 < iM71632i; i26++) {
                            if (c24561s.m71632i(16) != 0) {
                                throw ParserException.m5049a(null, "placeholder of time domain transforms not zeroed out");
                            }
                        }
                        int i27 = 1;
                        int iM71632i2 = c24561s.m71632i(6) + 1;
                        int i28 = 0;
                        while (true) {
                            int i29 = 3;
                            if (i28 >= iM71632i2) {
                                int iM71632i3 = c24561s.m71632i(i25) + 1;
                                int i34 = 0;
                                while (i34 < iM71632i3) {
                                    if (c24561s.m71632i(16) > 2) {
                                        throw ParserException.m5049a(null, "residueType greater than 2 is not decodable");
                                    }
                                    c24561s.m71643t(24);
                                    c24561s.m71643t(24);
                                    c24561s.m71643t(24);
                                    int iM71632i4 = c24561s.m71632i(i25) + 1;
                                    int i35 = 8;
                                    c24561s.m71643t(8);
                                    int[] iArr = new int[iM71632i4];
                                    for (int i36 = 0; i36 < iM71632i4; i36++) {
                                        iArr[i36] = ((c24561s.m71631h() ? c24561s.m71632i(5) : 0) * 8) + c24561s.m71632i(3);
                                    }
                                    int i37 = 0;
                                    while (i37 < iM71632i4) {
                                        int i38 = 0;
                                        while (i38 < i35) {
                                            if ((iArr[i37] & (1 << i38)) != 0) {
                                                c24561s.m71643t(i35);
                                            }
                                            i38++;
                                            i35 = 8;
                                        }
                                        i37++;
                                        i35 = 8;
                                    }
                                    i34++;
                                    i25 = 6;
                                }
                                int iM71632i5 = c24561s.m71632i(i25) + 1;
                                for (int i39 = 0; i39 < iM71632i5; i39++) {
                                    int iM71632i6 = c24561s.m71632i(16);
                                    if (iM71632i6 != 0) {
                                        AbstractC38046a.m121812g("VorbisUtil", "mapping type other than 0 not supported: " + iM71632i6);
                                    } else {
                                        int iM71632i7 = c24561s.m71631h() ? c24561s.m71632i(4) + 1 : 1;
                                        if (c24561s.m71631h()) {
                                            int iM71632i8 = c24561s.m71632i(8) + 1;
                                            for (int i44 = 0; i44 < iM71632i8; i44++) {
                                                int i45 = i15 - 1;
                                                int i46 = 0;
                                                for (int i47 = i45; i47 > 0; i47 >>>= 1) {
                                                    i46++;
                                                }
                                                c24561s.m71643t(i46);
                                                int i48 = 0;
                                                while (i45 > 0) {
                                                    i48++;
                                                    i45 >>>= 1;
                                                }
                                                c24561s.m71643t(i48);
                                            }
                                        }
                                        if (c24561s.m71632i(2) != 0) {
                                            throw ParserException.m5049a(null, "to reserved bits must be zero after mapping coupling steps");
                                        }
                                        if (iM71632i7 > 1) {
                                            for (int i49 = 0; i49 < i15; i49++) {
                                                c24561s.m71643t(4);
                                            }
                                        }
                                        for (int i54 = 0; i54 < iM71632i7; i54++) {
                                            c24561s.m71643t(8);
                                            c24561s.m71643t(8);
                                            c24561s.m71643t(8);
                                        }
                                    }
                                }
                                int iM71632i9 = c24561s.m71632i(6);
                                int i55 = iM71632i9 + 1;
                                C2852m1[] c2852m1Arr = new C2852m1[i55];
                                for (int i56 = 0; i56 < i55; i56++) {
                                    boolean zM71631h = c24561s.m71631h();
                                    c24561s.m71632i(16);
                                    c24561s.m71632i(16);
                                    c24561s.m71632i(8);
                                    c2852m1Arr[i56] = new C2852m1(zM71631h, 4);
                                }
                                if (!c24561s.m71631h()) {
                                    throw ParserException.m5049a(null, "framing bit after modes not set as expected");
                                }
                                int i57 = 0;
                                while (iM71632i9 > 0) {
                                    i57++;
                                    iM71632i9 >>>= 1;
                                }
                                c0684i0 = new C0684i0(c33645n1, c33643m0, bArr, c2852m1Arr, i57, 6);
                                break;
                            }
                            int iM71632i10 = c24561s.m71632i(i24);
                            if (iM71632i10 == 0) {
                                int i58 = i19;
                                c24561s.m71643t(i58);
                                c24561s.m71643t(16);
                                c24561s.m71643t(16);
                                c24561s.m71643t(6);
                                c24561s.m71643t(i58);
                                int iM71632i11 = c24561s.m71632i(4) + 1;
                                int i59 = 0;
                                while (i59 < iM71632i11) {
                                    c24561s.m71643t(i58);
                                    i59++;
                                    i58 = 8;
                                }
                            } else {
                                if (iM71632i10 != i27) {
                                    throw ParserException.m5049a(null, "floor type greater than 1 not decodable: " + iM71632i10);
                                }
                                int iM71632i12 = c24561s.m71632i(5);
                                int[] iArr2 = new int[iM71632i12];
                                int i64 = -1;
                                for (int i65 = 0; i65 < iM71632i12; i65++) {
                                    int iM71632i13 = c24561s.m71632i(4);
                                    iArr2[i65] = iM71632i13;
                                    if (iM71632i13 > i64) {
                                        i64 = iM71632i13;
                                    }
                                }
                                int i66 = i64 + 1;
                                int[] iArr3 = new int[i66];
                                int i67 = 0;
                                while (i67 < i66) {
                                    iArr3[i67] = c24561s.m71632i(i29) + 1;
                                    int iM71632i14 = c24561s.m71632i(2);
                                    int i68 = i19;
                                    if (iM71632i14 > 0) {
                                        c24561s.m71643t(i68);
                                    }
                                    int i69 = i66;
                                    int i74 = 0;
                                    for (int i75 = 1; i74 < (i75 << iM71632i14); i75 = 1) {
                                        c24561s.m71643t(i68);
                                        i74++;
                                        i68 = 8;
                                    }
                                    i67++;
                                    i66 = i69;
                                    i19 = 8;
                                    i29 = 3;
                                }
                                c24561s.m71643t(2);
                                int iM71632i15 = c24561s.m71632i(4);
                                int i76 = 0;
                                int i77 = 0;
                                for (int i78 = 0; i78 < iM71632i12; i78++) {
                                    i76 += iArr3[iArr2[i78]];
                                    while (i77 < i76) {
                                        c24561s.m71643t(iM71632i15);
                                        i77++;
                                    }
                                }
                            }
                            i28++;
                            i19 = 8;
                            i25 = 6;
                            i24 = 16;
                            i27 = 1;
                        }
                    } else {
                        if (c24561s.m71632i(24) != 5653314) {
                            throw ParserException.m5049a(null, "expected code book to start with [0x56, 0x43, 0x42] at " + ((c24561s.f95860d * 8) + c24561s.f95861e));
                        }
                        int iM71632i16 = c24561s.m71632i(16);
                        int iM71632i17 = c24561s.m71632i(24);
                        if (c24561s.m71631h()) {
                            c24561s.m71643t(i16);
                            int iM71632i18 = 0;
                            while (iM71632i18 < iM71632i17) {
                                int i79 = 0;
                                for (int i83 = iM71632i17 - iM71632i18; i83 > 0; i83 >>>= 1) {
                                    i79++;
                                }
                                iM71632i18 += c24561s.m71632i(i79);
                            }
                        } else {
                            boolean zM71631h2 = c24561s.m71631h();
                            for (int i84 = 0; i84 < iM71632i17; i84++) {
                                if (!zM71631h2) {
                                    c24561s.m71643t(i16);
                                } else if (c24561s.m71631h()) {
                                    c24561s.m71643t(i16);
                                }
                            }
                        }
                        int iM71632i19 = c24561s.m71632i(i13);
                        if (iM71632i19 > 2) {
                            throw ParserException.m5049a(null, "lookup type greater than 2 not decodable: " + iM71632i19);
                        }
                        if (iM71632i19 == 1 || iM71632i19 == 2) {
                            c24561s.m71643t(32);
                            c24561s.m71643t(32);
                            int iM71632i20 = c24561s.m71632i(i13) + 1;
                            c24561s.m71643t(1);
                            c24561s.m71643t((int) ((iM71632i19 == 1 ? iM71632i16 != 0 ? (long) Math.floor(Math.pow(iM71632i17, 1.0d / ((double) iM71632i16))) : 0L : ((long) iM71632i16) * ((long) iM71632i17)) * ((long) iM71632i20)));
                        } else {
                            c33645n0 = c33645n0;
                        }
                        i18++;
                        i17 = i19;
                        c33645n0 = c33645n0;
                        i13 = 4;
                        i16 = 5;
                    }
                }
            }
            this.f111917o = c0684i0;
            if (c0684i0 == null) {
                return true;
            }
            C33645n0 c33645n2 = (C33645n0) c0684i0.f2446y;
            ArrayList arrayList = new ArrayList();
            arrayList.add(c33645n2.f140432g);
            arrayList.add((byte[]) c0684i0.f2442E);
            C34585c0 c34585c0M106225q = AbstractC33618a.m106225q(AbstractC41023g0.m133253n(((C33643m0) c0684i0.f2447z).f140425a));
            C34608o c34608o = new C34608o();
            c34608o.f145740l = AbstractC34587d0.m109382o("audio/ogg");
            c34608o.f145741m = AbstractC34587d0.m109382o("audio/vorbis");
            c34608o.f145736h = c33645n2.f140429d;
            c34608o.f145737i = c33645n2.f140428c;
            c34608o.f145719C = c33645n2.f140426a;
            c34608o.f145720D = c33645n2.f140427b;
            c34608o.f145744p = arrayList;
            c34608o.f145739k = c34585c0M106225q;
            c30352d.f124535x = new C34610p(c34608o);
            return true;
        }
        AbstractC33618a.m106231w(1, c38059n, false);
        c38059n.m121859l();
        int iM121867t2 = c38059n.m121867t();
        int iM121859l = c38059n.m121859l();
        int iM121856i = c38059n.m121856i();
        int i85 = iM121856i <= 0 ? -1 : iM121856i;
        int iM121856i2 = c38059n.m121856i();
        int i86 = iM121856i2 <= 0 ? -1 : iM121856i2;
        c38059n.m121856i();
        int iM121867t3 = c38059n.m121867t();
        int iPow = (int) Math.pow(2.0d, iM121867t3 & 15);
        int iPow2 = (int) Math.pow(2.0d, (iM121867t3 & 240) >> 4);
        c38059n.m121867t();
        this.f111920r = new C33645n0(iM121867t2, iM121859l, i85, i86, iPow, iPow2, Arrays.copyOf(c38059n.f163017a, c38059n.f163019c));
        c0684i0 = null;
        this.f111917o = c0684i0;
        if (c0684i0 == null) {
            return true;
        }
        C33645n0 c33645n3 = (C33645n0) c0684i0.f2446y;
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(c33645n3.f140432g);
        arrayList2.add((byte[]) c0684i0.f2442E);
        C34585c0 c34585c0M106225q2 = AbstractC33618a.m106225q(AbstractC41023g0.m133253n(((C33643m0) c0684i0.f2447z).f140425a));
        C34608o c34608o2 = new C34608o();
        c34608o2.f145740l = AbstractC34587d0.m109382o("audio/ogg");
        c34608o2.f145741m = AbstractC34587d0.m109382o("audio/vorbis");
        c34608o2.f145736h = c33645n3.f140429d;
        c34608o2.f145737i = c33645n3.f140428c;
        c34608o2.f145719C = c33645n3.f140426a;
        c34608o2.f145720D = c33645n3.f140427b;
        c34608o2.f145744p = arrayList2;
        c34608o2.f145739k = c34585c0M106225q2;
        c30352d.f124535x = new C34610p(c34608o2);
        return true;
    }

    @Override // p123en.AbstractC13361h
    /* JADX INFO: renamed from: f */
    public final void mo37615f(boolean z4) {
        super.mo37615f(z4);
        if (z4) {
            this.f111917o = null;
            this.f111920r = null;
            this.f111921s = null;
        }
        this.f111918p = 0;
        this.f111919q = false;
    }
}
