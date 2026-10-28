package p123en;

import android.util.Log;
import com.google.android.exoplayer2.ParserException;
import ed3.C13117a;
import in.C18715c;
import io.sentry.internal.debugmeta.C20378c;
import java.util.ArrayList;
import java.util.Arrays;
import p012ab.C0684i0;
import p031b9.C2852m1;
import p309lo.AbstractC24543a;
import p309lo.C24561s;
import p465rm.C31518b0;
import p465rm.C31521c0;
import p499t9.C33643m0;
import p499t9.C33645n0;
import p690zr.AbstractC41023g0;
import s40.AbstractC32145e0;

/* JADX INFO: renamed from: en.i */
/* JADX INFO: loaded from: classes6.dex */
public final class C13362i extends AbstractC13361h {

    /* JADX INFO: renamed from: o */
    public C0684i0 f46710o;

    /* JADX INFO: renamed from: p */
    public int f46711p;

    /* JADX INFO: renamed from: q */
    public boolean f46712q;

    /* JADX INFO: renamed from: r */
    public C33645n0 f46713r;

    /* JADX INFO: renamed from: s */
    public C33643m0 f46714s;

    @Override // p123en.AbstractC13361h
    /* JADX INFO: renamed from: a */
    public final void mo37622a(long j7) {
        this.f46699d = j7;
        this.f46712q = j7 != 0;
        C33645n0 c33645n0 = this.f46713r;
        this.f46711p = c33645n0 != null ? c33645n0.f140430e : 0;
    }

    @Override // p123en.AbstractC13361h
    /* JADX INFO: renamed from: b */
    public final long mo37613b(C13117a c13117a) {
        byte b = c13117a.f45381a[0];
        if ((b & 1) == 1) {
            return -1L;
        }
        C0684i0 c0684i0 = this.f46710o;
        AbstractC24543a.m71574j(c0684i0);
        int i13 = c0684i0.f2445x;
        C33645n0 c33645n0 = (C33645n0) c0684i0.f2446y;
        int i14 = !((C2852m1[]) c0684i0.f2443F)[(b >> 1) & (255 >>> (8 - i13))].f11320x ? c33645n0.f140430e : c33645n0.f140431f;
        long j7 = this.f46712q ? (this.f46711p + i14) / 4 : 0;
        byte[] bArr = c13117a.f45381a;
        int length = bArr.length;
        int i15 = c13117a.f45383c + 4;
        if (length < i15) {
            byte[] bArrCopyOf = Arrays.copyOf(bArr, i15);
            c13117a.m36687I(bArrCopyOf.length, bArrCopyOf);
        } else {
            c13117a.m36688J(i15);
        }
        byte[] bArr2 = c13117a.f45381a;
        int i16 = c13117a.f45383c;
        bArr2[i16 - 4] = (byte) (j7 & 255);
        bArr2[i16 - 3] = (byte) ((j7 >>> 8) & 255);
        bArr2[i16 - 2] = (byte) ((j7 >>> 16) & 255);
        bArr2[i16 - 1] = (byte) ((j7 >>> 24) & 255);
        this.f46712q = true;
        this.f46711p = i14;
        return j7;
    }

    /* JADX WARN: Code duplicated, block: B:174:0x03fe A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:176:0x0401  */
    @Override // p123en.AbstractC13361h
    /* JADX INFO: renamed from: d */
    public final boolean mo37614d(C13117a c13117a, long j7, C20378c c20378c) throws ParserException {
        C0684i0 c0684i0;
        int i13;
        int i14;
        if (this.f46710o != null) {
            ((C31521c0) c20378c.f76422x).getClass();
            return false;
        }
        C33645n0 c33645n0 = this.f46713r;
        int i15 = 1;
        if (c33645n0 != null) {
            C33643m0 c33643m0 = this.f46714s;
            if (c33643m0 == null) {
                this.f46714s = AbstractC32145e0.m100101h(c13117a, true, true);
            } else {
                int i16 = c13117a.f45383c;
                byte[] bArr = new byte[i16];
                System.arraycopy(c13117a.f45381a, 0, bArr, 0, i16);
                int i17 = c33645n0.f140426a;
                int i18 = 5;
                AbstractC32145e0.m100104k(5, c13117a, false);
                int iM36715y = c13117a.m36715y() + 1;
                C24561s c24561s = new C24561s(c13117a.f45381a, 4);
                int i19 = 8;
                c24561s.m71643t(c13117a.f45382b * 8);
                int i24 = 0;
                while (true) {
                    int i25 = i19;
                    int i26 = 16;
                    if (i24 < iM36715y) {
                        int i27 = i15;
                        if (c24561s.m71632i(24) != 5653314) {
                            int i28 = (c24561s.f95860d * 8) + c24561s.f95861e;
                            StringBuilder sb4 = new StringBuilder(66);
                            sb4.append("expected code book to start with [0x56, 0x43, 0x42] at ");
                            sb4.append(i28);
                            throw ParserException.m15562a(null, sb4.toString());
                        }
                        int iM71632i = c24561s.m71632i(16);
                        int iM71632i2 = c24561s.m71632i(24);
                        long[] jArr = new long[iM71632i2];
                        long jFloor = 0;
                        if (c24561s.m71631h()) {
                            i13 = iM36715y;
                            int iM71632i3 = c24561s.m71632i(i18) + 1;
                            int i29 = 0;
                            while (i29 < iM71632i2) {
                                int i34 = 0;
                                for (int i35 = iM71632i2 - i29; i35 > 0; i35 >>>= 1) {
                                    i34++;
                                }
                                int iM71632i4 = c24561s.m71632i(i34);
                                int i36 = 0;
                                while (i36 < iM71632i4 && i29 < iM71632i2) {
                                    int i37 = i29;
                                    jArr[i37] = iM71632i3;
                                    i29 = i37 + 1;
                                    i36++;
                                    c33645n0 = c33645n0;
                                }
                                iM71632i3++;
                                i29 = i29;
                                c33645n0 = c33645n0;
                            }
                        } else {
                            boolean zM71631h = c24561s.m71631h();
                            int i38 = 0;
                            while (i38 < iM71632i2) {
                                if (zM71631h) {
                                    if (c24561s.m71631h()) {
                                        jArr[i38] = c24561s.m71632i(i18) + 1;
                                    } else {
                                        jArr[i38] = 0;
                                    }
                                    i14 = 5;
                                } else {
                                    i14 = i18;
                                    iM36715y = iM36715y;
                                    jArr[i38] = c24561s.m71632i(i14) + 1;
                                }
                                i38++;
                                i18 = i14;
                                iM36715y = iM36715y;
                            }
                            i13 = iM36715y;
                        }
                        C33645n0 c33645n1 = c33645n0;
                        int iM71632i5 = c24561s.m71632i(4);
                        if (iM71632i5 > 2) {
                            StringBuilder sb5 = new StringBuilder(53);
                            sb5.append("lookup type greater than 2 not decodable: ");
                            sb5.append(iM71632i5);
                            throw ParserException.m15562a(null, sb5.toString());
                        }
                        if (iM71632i5 == i27 || iM71632i5 == 2) {
                            c24561s.m71643t(32);
                            c24561s.m71643t(32);
                            int iM71632i6 = c24561s.m71632i(4) + i27;
                            c24561s.m71643t(i27);
                            if (iM71632i5 != i27) {
                                jFloor = ((long) iM71632i2) * ((long) iM71632i);
                            } else if (iM71632i != 0) {
                                jFloor = (long) Math.floor(Math.pow(iM71632i2, 1.0d / ((double) iM71632i)));
                            }
                            c24561s.m71643t((int) (((long) iM71632i6) * jFloor));
                        }
                        i24++;
                        i19 = i25;
                        iM36715y = i13;
                        c33645n0 = c33645n1;
                        i15 = 1;
                        i18 = 5;
                    } else {
                        C33645n0 c33645n2 = c33645n0;
                        int i39 = 6;
                        int iM71632i7 = c24561s.m71632i(6) + 1;
                        for (int i44 = 0; i44 < iM71632i7; i44++) {
                            if (c24561s.m71632i(16) != 0) {
                                throw ParserException.m15562a(null, "placeholder of time domain transforms not zeroed out");
                            }
                        }
                        int i45 = 1;
                        int iM71632i8 = c24561s.m71632i(6) + 1;
                        int i46 = 0;
                        while (true) {
                            int i47 = 3;
                            if (i46 >= iM71632i8) {
                                int iM71632i9 = c24561s.m71632i(i39) + 1;
                                int i48 = 0;
                                while (i48 < iM71632i9) {
                                    if (c24561s.m71632i(16) > 2) {
                                        throw ParserException.m15562a(null, "residueType greater than 2 is not decodable");
                                    }
                                    c24561s.m71643t(24);
                                    c24561s.m71643t(24);
                                    c24561s.m71643t(24);
                                    int iM71632i10 = c24561s.m71632i(i39) + 1;
                                    int i49 = 8;
                                    c24561s.m71643t(8);
                                    int[] iArr = new int[iM71632i10];
                                    for (int i54 = 0; i54 < iM71632i10; i54++) {
                                        iArr[i54] = ((c24561s.m71631h() ? c24561s.m71632i(5) : 0) * 8) + c24561s.m71632i(3);
                                    }
                                    int i55 = 0;
                                    while (i55 < iM71632i10) {
                                        int i56 = 0;
                                        while (i56 < i49) {
                                            if ((iArr[i55] & (1 << i56)) != 0) {
                                                c24561s.m71643t(i49);
                                            }
                                            i56++;
                                            i49 = 8;
                                        }
                                        i55++;
                                        i49 = 8;
                                    }
                                    i48++;
                                    i39 = 6;
                                }
                                int iM71632i11 = c24561s.m71632i(i39) + 1;
                                for (int i57 = 0; i57 < iM71632i11; i57++) {
                                    int iM71632i12 = c24561s.m71632i(16);
                                    if (iM71632i12 != 0) {
                                        StringBuilder sb6 = new StringBuilder(52);
                                        sb6.append("mapping type other than 0 not supported: ");
                                        sb6.append(iM71632i12);
                                        Log.e("VorbisUtil", sb6.toString());
                                    } else {
                                        int iM71632i13 = c24561s.m71631h() ? c24561s.m71632i(4) + 1 : 1;
                                        if (c24561s.m71631h()) {
                                            int iM71632i14 = c24561s.m71632i(8) + 1;
                                            for (int i58 = 0; i58 < iM71632i14; i58++) {
                                                int i59 = i17 - 1;
                                                int i64 = 0;
                                                for (int i65 = i59; i65 > 0; i65 >>>= 1) {
                                                    i64++;
                                                }
                                                c24561s.m71643t(i64);
                                                int i66 = 0;
                                                while (i59 > 0) {
                                                    i66++;
                                                    i59 >>>= 1;
                                                }
                                                c24561s.m71643t(i66);
                                            }
                                        }
                                        if (c24561s.m71632i(2) != 0) {
                                            throw ParserException.m15562a(null, "to reserved bits must be zero after mapping coupling steps");
                                        }
                                        if (iM71632i13 > 1) {
                                            for (int i67 = 0; i67 < i17; i67++) {
                                                c24561s.m71643t(4);
                                            }
                                        }
                                        for (int i68 = 0; i68 < iM71632i13; i68++) {
                                            c24561s.m71643t(8);
                                            c24561s.m71643t(8);
                                            c24561s.m71643t(8);
                                        }
                                    }
                                }
                                int iM71632i15 = c24561s.m71632i(6);
                                int i69 = iM71632i15 + 1;
                                C2852m1[] c2852m1Arr = new C2852m1[i69];
                                for (int i74 = 0; i74 < i69; i74++) {
                                    boolean zM71631h2 = c24561s.m71631h();
                                    c24561s.m71632i(16);
                                    c24561s.m71632i(16);
                                    c24561s.m71632i(8);
                                    c2852m1Arr[i74] = new C2852m1(zM71631h2, 6);
                                }
                                if (!c24561s.m71631h()) {
                                    throw ParserException.m15562a(null, "framing bit after modes not set as expected");
                                }
                                int i75 = 0;
                                while (iM71632i15 > 0) {
                                    i75++;
                                    iM71632i15 >>>= 1;
                                }
                                c0684i0 = new C0684i0(c33645n2, c33643m0, bArr, c2852m1Arr, i75, 2);
                                break;
                            }
                            int iM71632i16 = c24561s.m71632i(i26);
                            if (iM71632i16 == 0) {
                                int i76 = i25;
                                c24561s.m71643t(i76);
                                c24561s.m71643t(16);
                                c24561s.m71643t(16);
                                c24561s.m71643t(6);
                                c24561s.m71643t(i76);
                                int iM71632i17 = c24561s.m71632i(4) + 1;
                                int i77 = 0;
                                while (i77 < iM71632i17) {
                                    c24561s.m71643t(i76);
                                    i77++;
                                    i76 = 8;
                                }
                            } else {
                                if (iM71632i16 != i45) {
                                    StringBuilder sb7 = new StringBuilder(52);
                                    sb7.append("floor type greater than 1 not decodable: ");
                                    sb7.append(iM71632i16);
                                    throw ParserException.m15562a(null, sb7.toString());
                                }
                                int iM71632i18 = c24561s.m71632i(5);
                                int[] iArr2 = new int[iM71632i18];
                                int i78 = -1;
                                for (int i79 = 0; i79 < iM71632i18; i79++) {
                                    int iM71632i19 = c24561s.m71632i(4);
                                    iArr2[i79] = iM71632i19;
                                    if (iM71632i19 > i78) {
                                        i78 = iM71632i19;
                                    }
                                }
                                int i83 = i78 + 1;
                                int[] iArr3 = new int[i83];
                                int i84 = 0;
                                while (i84 < i83) {
                                    iArr3[i84] = c24561s.m71632i(i47) + 1;
                                    int iM71632i20 = c24561s.m71632i(2);
                                    int i85 = i25;
                                    if (iM71632i20 > 0) {
                                        c24561s.m71643t(i85);
                                    }
                                    int i86 = 0;
                                    for (int i87 = 1; i86 < (i87 << iM71632i20); i87 = 1) {
                                        c24561s.m71643t(i85);
                                        i86++;
                                        i85 = 8;
                                    }
                                    i84++;
                                    i25 = 8;
                                    i47 = 3;
                                }
                                c24561s.m71643t(2);
                                int iM71632i21 = c24561s.m71632i(4);
                                int i88 = 0;
                                int i89 = 0;
                                for (int i94 = 0; i94 < iM71632i18; i94++) {
                                    i88 += iArr3[iArr2[i94]];
                                    while (i89 < i88) {
                                        c24561s.m71643t(iM71632i21);
                                        i89++;
                                    }
                                }
                            }
                            i46++;
                            i25 = 8;
                            i39 = 6;
                            i26 = 16;
                            i45 = 1;
                        }
                    }
                }
            }
            this.f46710o = c0684i0;
            if (c0684i0 == null) {
                return true;
            }
            C33645n0 c33645n3 = (C33645n0) c0684i0.f2446y;
            ArrayList arrayList = new ArrayList();
            arrayList.add(c33645n3.f140432g);
            arrayList.add((byte[]) c0684i0.f2442E);
            C18715c c18715cM100099f = AbstractC32145e0.m100099f(AbstractC41023g0.m133253n(((C33643m0) c0684i0.f2447z).f140425a));
            C31518b0 c31518b0 = new C31518b0();
            c31518b0.f130047k = "audio/vorbis";
            c31518b0.f130042f = c33645n3.f140429d;
            c31518b0.f130043g = c33645n3.f140428c;
            c31518b0.f130060x = c33645n3.f140426a;
            c31518b0.f130061y = c33645n3.f140427b;
            c31518b0.f130049m = arrayList;
            c31518b0.f130045i = c18715cM100099f;
            c20378c.f76422x = new C31521c0(c31518b0);
            return true;
        }
        AbstractC32145e0.m100104k(1, c13117a, false);
        c13117a.m36704n();
        int iM36715y2 = c13117a.m36715y();
        int iM36704n = c13117a.m36704n();
        int iM36701k = c13117a.m36701k();
        int i95 = iM36701k <= 0 ? -1 : iM36701k;
        int iM36701k2 = c13117a.m36701k();
        int i96 = iM36701k2 <= 0 ? -1 : iM36701k2;
        c13117a.m36701k();
        int iM36715y3 = c13117a.m36715y();
        int iPow = (int) Math.pow(2.0d, iM36715y3 & 15);
        int iPow2 = (int) Math.pow(2.0d, (iM36715y3 & 240) >> 4);
        c13117a.m36715y();
        this.f46713r = new C33645n0(iM36715y2, iM36704n, i95, i96, iPow, iPow2, Arrays.copyOf(c13117a.f45381a, c13117a.f45383c));
        c0684i0 = null;
        this.f46710o = c0684i0;
        if (c0684i0 == null) {
            return true;
        }
        C33645n0 c33645n4 = (C33645n0) c0684i0.f2446y;
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(c33645n4.f140432g);
        arrayList2.add((byte[]) c0684i0.f2442E);
        C18715c c18715cM100099f2 = AbstractC32145e0.m100099f(AbstractC41023g0.m133253n(((C33643m0) c0684i0.f2447z).f140425a));
        C31518b0 c31518b1 = new C31518b0();
        c31518b1.f130047k = "audio/vorbis";
        c31518b1.f130042f = c33645n4.f140429d;
        c31518b1.f130043g = c33645n4.f140428c;
        c31518b1.f130060x = c33645n4.f140426a;
        c31518b1.f130061y = c33645n4.f140427b;
        c31518b1.f130049m = arrayList2;
        c31518b1.f130045i = c18715cM100099f2;
        c20378c.f76422x = new C31521c0(c31518b1);
        return true;
    }

    @Override // p123en.AbstractC13361h
    /* JADX INFO: renamed from: f */
    public final void mo37615f(boolean z4) {
        super.mo37615f(z4);
        if (z4) {
            this.f46710o = null;
            this.f46713r = null;
            this.f46714s = null;
        }
        this.f46711p = 0;
        this.f46712q = false;
    }
}
