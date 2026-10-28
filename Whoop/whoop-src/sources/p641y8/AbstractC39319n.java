package p641y8;

import bs.AbstractC3574c;
import cr.C11078p;
import java.lang.reflect.Array;
import java.math.RoundingMode;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;
import p077d0.C11387o2;
import p309lo.C24561s;
import p408q.C29662f;
import p412q3.C29875i;
import p499t9.C33652u;
import p516u8.AbstractC34587d0;
import p516u8.C34592g;
import p516u8.C34610p;
import p690zr.AbstractC41005a0;
import p690zr.AbstractC41023g0;
import p690zr.AbstractC41047q;
import p690zr.C41014d0;
import p690zr.C41060w0;
import so.C32800q;
import va3.AbstractC35849g;
import y00.AbstractC38963t7;

/* JADX INFO: renamed from: y8.n */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC39319n {

    /* JADX INFO: renamed from: a */
    public static final byte[] f169167a = {0, 0, 0, 1};

    /* JADX INFO: renamed from: b */
    public static final float[] f169168b = {1.0f, 1.0f, 1.0909091f, 0.90909094f, 1.4545455f, 1.2121212f, 2.1818182f, 1.8181819f, 2.909091f, 2.4242425f, 1.6363636f, 1.3636364f, 1.939394f, 1.6161616f, 1.3333334f, 1.5f, 2.0f};

    /* JADX INFO: renamed from: c */
    public static final Object f169169c = new Object();

    /* JADX INFO: renamed from: d */
    public static int[] f169170d = new int[10];

    /* JADX INFO: renamed from: a */
    public static void m125274a(boolean z4) throws C39320o {
        if (z4) {
            throw new C39320o();
        }
    }

    /* JADX INFO: renamed from: b */
    public static void m125275b(boolean[] zArr) {
        zArr[0] = false;
        zArr[1] = false;
        zArr[2] = false;
    }

    /* JADX INFO: renamed from: c */
    public static int m125276c(byte[] bArr, int i13, int i14, boolean[] zArr) {
        int i15 = i14 - i13;
        AbstractC35849g.m113807i(i15 >= 0);
        if (i15 == 0) {
            return i14;
        }
        if (zArr[0]) {
            m125275b(zArr);
            return i13 - 3;
        }
        if (i15 > 1 && zArr[1] && bArr[i13] == 1) {
            m125275b(zArr);
            return i13 - 2;
        }
        if (i15 > 2 && zArr[2] && bArr[i13] == 0 && bArr[i13 + 1] == 1) {
            m125275b(zArr);
            return i13 - 1;
        }
        int i16 = i14 - 1;
        int i17 = i13 + 2;
        while (i17 < i16) {
            byte b = bArr[i17];
            if ((b & 254) == 0) {
                int i18 = i17 - 2;
                if (bArr[i18] == 0 && bArr[i17 - 1] == 0 && b == 1) {
                    m125275b(zArr);
                    return i18;
                }
                i17 -= 2;
            }
            i17 += 3;
        }
        zArr[0] = i15 <= 2 ? !(i15 != 2 ? !(zArr[1] && bArr[i16] == 1) : !(zArr[2] && bArr[i14 + (-2)] == 0 && bArr[i16] == 1)) : bArr[i14 + (-3)] == 0 && bArr[i14 + (-2)] == 0 && bArr[i16] == 1;
        zArr[1] = i15 <= 1 ? zArr[2] && bArr[i16] == 0 : bArr[i14 + (-2)] == 0 && bArr[i16] == 0;
        zArr[2] = bArr[i16] == 0;
        return i14;
    }

    /* JADX INFO: renamed from: d */
    public static boolean m125277d(byte[] bArr, int i13, C34610p c34610p) {
        int i14;
        if (Objects.equals(c34610p.f145783n, "video/avc")) {
            byte b = bArr[4];
            if (((b & 96) >> 5) == 0 && ((i14 = b & 31) == 1 || i14 == 9 || i14 == 14)) {
                return false;
            }
        } else if (Objects.equals(c34610p.f145783n, "video/hevc")) {
            C11078p c11078pM125279f = m125279f(new C24561s(4, i13 + 4, 6, bArr));
            int i15 = c11078pM125279f.f35038a;
            if (i15 == 35) {
                return false;
            }
            if (i15 <= 14 && i15 % 2 == 0 && c11078pM125279f.f35040c == c34610p.f145758C - 1) {
                return false;
            }
        }
        return true;
    }

    /* JADX INFO: renamed from: e */
    public static int m125278e(C34610p c34610p) {
        if (Objects.equals(c34610p.f145783n, "video/avc")) {
            return 1;
        }
        return (Objects.equals(c34610p.f145783n, "video/hevc") || AbstractC34587d0.m109369b(c34610p.f145780k, "video/hevc")) ? 2 : 0;
    }

    /* JADX INFO: renamed from: f */
    public static C11078p m125279f(C24561s c24561s) {
        c24561s.m71642s();
        return new C11078p(c24561s.m71632i(6), c24561s.m71632i(6), c24561s.m71632i(3) - 1);
    }

    /* JADX WARN: Code duplicated, block: B:21:0x005e  */
    /* JADX WARN: Code duplicated, block: B:23:0x0064  */
    /* JADX WARN: Code duplicated, block: B:26:0x006c  */
    /* JADX WARN: Code duplicated, block: B:30:0x0076  */
    /* JADX WARN: Code duplicated, block: B:39:0x006e A[SYNTHETIC] */
    /* JADX INFO: renamed from: g */
    public static C39313h m125280g(C24561s c24561s, boolean z4, int i13, C39313h c39313h) {
        int[] iArr;
        int i14;
        boolean z13;
        int i15;
        int i16;
        boolean zM71631h;
        int iM71632i;
        int i17;
        int i18;
        int[] iArr2 = new int[6];
        if (!z4) {
            if (c39313h != null) {
                int i19 = c39313h.f169121a;
                zM71631h = c39313h.f169122b;
                iM71632i = c39313h.f169123c;
                i17 = c39313h.f169124d;
                iArr2 = c39313h.f169125e;
                i14 = i19;
            } else {
                iArr = iArr2;
                i14 = 0;
                z13 = false;
                i15 = 0;
                i16 = 0;
            }
            int iM71632i2 = c24561s.m71632i(8);
            i18 = 0;
            for (int i24 = 0; i24 < i13; i24++) {
                if (c24561s.m71631h()) {
                    i18 += 88;
                }
                if (c24561s.m71631h()) {
                    i18 += 8;
                }
            }
            c24561s.m71643t(i18);
            if (i13 > 0) {
                c24561s.m71643t((8 - i13) * 2);
            }
            return new C39313h(i14, z13, i15, i16, iArr, iM71632i2);
        }
        int iM71632i3 = c24561s.m71632i(2);
        zM71631h = c24561s.m71631h();
        iM71632i = c24561s.m71632i(5);
        i17 = 0;
        for (int i25 = 0; i25 < 32; i25++) {
            if (c24561s.m71631h()) {
                i17 |= 1 << i25;
            }
        }
        for (int i26 = 0; i26 < 6; i26++) {
            iArr2[i26] = c24561s.m71632i(8);
        }
        i14 = iM71632i3;
        iArr = iArr2;
        z13 = zM71631h;
        i15 = iM71632i;
        i16 = i17;
        int iM71632i4 = c24561s.m71632i(8);
        i18 = 0;
        while (i24 < i13) {
            if (c24561s.m71631h()) {
                i18 += 88;
            }
            if (c24561s.m71631h()) {
                i18 += 8;
            }
        }
        c24561s.m71643t(i18);
        if (i13 > 0) {
            c24561s.m71643t((8 - i13) * 2);
        }
        return new C39313h(i14, z13, i15, i16, iArr, iM71632i4);
    }

    /* JADX INFO: renamed from: h */
    public static C11387o2 m125281h(byte[] bArr, int i13, int i14) {
        byte b;
        int i15 = i13 + 2;
        do {
            i14--;
            b = bArr[i14];
            if (b != 0) {
                break;
            }
        } while (i14 > i15);
        if (b == 0 || i14 <= i15) {
            return null;
        }
        C24561s c24561s = new C24561s(i15, i14 + 1, 6, bArr);
        while (c24561s.m71627d(16)) {
            int iM71632i = c24561s.m71632i(8);
            int i16 = 0;
            while (iM71632i == 255) {
                i16 += 255;
                iM71632i = c24561s.m71632i(8);
            }
            int i17 = i16 + iM71632i;
            int iM71632i2 = c24561s.m71632i(8);
            int i18 = 0;
            while (iM71632i2 == 255) {
                i18 += 255;
                iM71632i2 = c24561s.m71632i(8);
            }
            int i19 = i18 + iM71632i2;
            if (i19 == 0 || !c24561s.m71627d(i19)) {
                return null;
            }
            if (i17 == 176) {
                int iM71636m = c24561s.m71636m();
                boolean zM71631h = c24561s.m71631h();
                int iM71636m2 = zM71631h ? c24561s.m71636m() : 0;
                int iM71636m3 = c24561s.m71636m();
                int iM71636m4 = -1;
                for (int i24 = 0; i24 <= iM71636m3; i24++) {
                    iM71636m4 = c24561s.m71636m();
                    c24561s.m71636m();
                    int iM71632i3 = c24561s.m71632i(6);
                    if (iM71632i3 == 63) {
                        return null;
                    }
                    c24561s.m71632i(iM71632i3 == 0 ? Math.max(0, iM71636m - 30) : Math.max(0, (iM71632i3 + iM71636m) - 31));
                    if (zM71631h) {
                        int iM71632i4 = c24561s.m71632i(6);
                        if (iM71632i4 == 63) {
                            return null;
                        }
                        c24561s.m71632i(iM71632i4 == 0 ? Math.max(0, iM71636m2 - 30) : Math.max(0, (iM71632i4 + iM71636m2) - 31));
                    }
                    if (c24561s.m71631h()) {
                        c24561s.m71643t(10);
                    }
                }
                return new C11387o2(iM71636m4, 11);
            }
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:12:0x004c  */
    /* JADX WARN: Code duplicated, block: B:201:0x0399  */
    /* JADX WARN: Code duplicated, block: B:36:0x00b5  */
    /* JADX INFO: renamed from: i */
    public static C39315j m125282i(byte[] bArr, int i13, int i14, C29662f c29662f) {
        int i15;
        int i16;
        int i17;
        int iM71636m;
        int iM71636m2;
        int iMax;
        int i18;
        int i19;
        int i24;
        int iM109387f;
        int iM109388g;
        int i25;
        C33652u c33652u;
        C32800q c32800q;
        C11078p c11078pM125279f = m125279f(new C24561s(i13, i14, 6, bArr));
        C24561s c24561s = new C24561s(i13 + 2, i14, 6, bArr);
        int i26 = 4;
        c24561s.m71643t(4);
        int iM71632i = c24561s.m71632i(3);
        int i27 = c11078pM125279f.f35039b;
        boolean z4 = i27 != 0 && iM71632i == 7;
        if (c29662f != null) {
            AbstractC41023g0 abstractC41023g0 = (AbstractC41023g0) c29662f.f121230x;
            if (abstractC41023g0.isEmpty()) {
                i15 = 0;
            } else {
                i15 = ((C39312g) abstractC41023g0.get(Math.min(i27, abstractC41023g0.size() - 1))).f169119a;
            }
        } else {
            i15 = 0;
        }
        C39313h c39313hM125280g = null;
        if (!z4) {
            c24561s.m71642s();
            c39313hM125280g = m125280g(c24561s, true, iM71632i, null);
        } else if (c29662f != null) {
            C29875i c29875i = (C29875i) c29662f.f121231y;
            int[] iArr = (int[]) c29875i.f122096x;
            AbstractC41023g0 abstractC41023g1 = (AbstractC41023g0) c29875i.f122095w;
            int i28 = iArr[i15];
            if (abstractC41023g1.size() > i28) {
                c39313hM125280g = (C39313h) abstractC41023g1.get(i28);
            }
        }
        c24561s.m71636m();
        if (z4) {
            int iM71632i2 = c24561s.m71631h() ? c24561s.m71632i(8) : -1;
            if (c29662f == null || (c32800q = (C32800q) c29662f.f121232z) == null) {
                iM71636m = 0;
                iM71636m2 = 0;
                i17 = 0;
                i16 = 0;
            } else {
                AbstractC41023g0 abstractC41023g2 = (AbstractC41023g0) c32800q.f136504w;
                if (iM71632i2 == -1) {
                    iM71632i2 = ((int[]) c32800q.f136505x)[i15];
                }
                if (iM71632i2 == -1 || abstractC41023g2.size() <= iM71632i2) {
                    iM71636m = 0;
                    iM71636m2 = 0;
                    i17 = 0;
                    i16 = 0;
                } else {
                    C39314i c39314i = (C39314i) abstractC41023g2.get(iM71632i2);
                    int i29 = c39314i.f169127a;
                    i17 = c39314i.f169130d;
                    i16 = c39314i.f169131e;
                    iM71636m = c39314i.f169128b;
                    iM71636m2 = c39314i.f169129c;
                }
            }
        } else {
            int iM71636m3 = c24561s.m71636m();
            if (iM71636m3 == 3) {
                c24561s.m71642s();
            }
            int iM71636m4 = c24561s.m71636m();
            int iM71636m5 = c24561s.m71636m();
            if (c24561s.m71631h()) {
                int iM71636m6 = c24561s.m71636m();
                int iM71636m7 = c24561s.m71636m();
                int iM71636m8 = c24561s.m71636m();
                int iM71636m9 = c24561s.m71636m();
                iM71636m4 -= (iM71636m6 + iM71636m7) * ((iM71636m3 == 1 || iM71636m3 == 2) ? 2 : 1);
                iM71636m5 -= (iM71636m8 + iM71636m9) * (iM71636m3 == 1 ? 2 : 1);
            }
            i16 = iM71636m5;
            i17 = iM71636m4;
            iM71636m = c24561s.m71636m();
            iM71636m2 = c24561s.m71636m();
        }
        int iM71636m10 = c24561s.m71636m();
        if (z4) {
            iMax = -1;
        } else {
            iMax = -1;
            for (int i34 = c24561s.m71631h() ? 0 : iM71632i; i34 <= iM71632i; i34++) {
                c24561s.m71636m();
                iMax = Math.max(c24561s.m71636m(), iMax);
                c24561s.m71636m();
            }
        }
        c24561s.m71636m();
        c24561s.m71636m();
        c24561s.m71636m();
        c24561s.m71636m();
        c24561s.m71636m();
        c24561s.m71636m();
        if (c24561s.m71631h()) {
            int i35 = 6;
            if (z4 ? c24561s.m71631h() : false) {
                c24561s.m71643t(6);
            } else if (c24561s.m71631h()) {
                int i36 = 0;
                while (i36 < i26) {
                    int i37 = 0;
                    while (i37 < i35) {
                        if (c24561s.m71631h()) {
                            int iMin = Math.min(64, 1 << ((i36 << 1) + 4));
                            if (i36 > 1) {
                                c24561s.m71637n();
                            }
                            for (int i38 = 0; i38 < iMin; i38++) {
                                c24561s.m71637n();
                            }
                        } else {
                            c24561s.m71636m();
                        }
                        i37 += i36 == 3 ? 3 : 1;
                        i35 = 6;
                    }
                    i36++;
                    i26 = 4;
                    i35 = 6;
                }
            }
        }
        c24561s.m71643t(2);
        if (c24561s.m71631h()) {
            c24561s.m71643t(8);
            c24561s.m71636m();
            c24561s.m71636m();
            c24561s.m71642s();
        }
        int iM71636m11 = c24561s.m71636m();
        int[] iArr2 = new int[0];
        int[] iArrCopyOf = new int[0];
        int i39 = 0;
        int iM71636m12 = -1;
        int i44 = -1;
        while (i39 < iM71636m11) {
            if (i39 == 0 || !c24561s.m71631h()) {
                int iM71636m13 = c24561s.m71636m();
                iM71636m12 = c24561s.m71636m();
                int[] iArr3 = new int[iM71636m13];
                int i45 = 0;
                while (i45 < iM71636m13) {
                    iArr3[i45] = (i45 > 0 ? iArr3[i45 - 1] : 0) - (c24561s.m71636m() + 1);
                    c24561s.m71642s();
                    i45++;
                }
                int[] iArr4 = new int[iM71636m12];
                int i46 = 0;
                while (i46 < iM71636m12) {
                    iArr4[i46] = c24561s.m71636m() + 1 + (i46 > 0 ? iArr4[i46 - 1] : 0);
                    c24561s.m71642s();
                    i46++;
                }
                i44 = iM71636m13;
                iArr2 = iArr3;
                iArrCopyOf = iArr4;
            } else {
                int i47 = i44 + iM71636m12;
                int iM71636m14 = (1 - ((c24561s.m71631h() ? 1 : 0) * 2)) * (c24561s.m71636m() + 1);
                int i48 = i47 + 1;
                boolean[] zArr = new boolean[i48];
                for (int i49 = 0; i49 <= i47; i49++) {
                    if (c24561s.m71631h()) {
                        zArr[i49] = true;
                    } else {
                        zArr[i49] = c24561s.m71631h();
                    }
                }
                int[] iArr5 = new int[i48];
                int[] iArr6 = new int[i48];
                int i54 = 0;
                for (int i55 = iM71636m12 - 1; i55 >= 0; i55--) {
                    int i56 = iArrCopyOf[i55] + iM71636m14;
                    if (i56 < 0 && zArr[i44 + i55]) {
                        iArr5[i54] = i56;
                        i54++;
                    }
                }
                if (iM71636m14 < 0 && zArr[i47]) {
                    iArr5[i54] = iM71636m14;
                    i54++;
                }
                int i57 = i54;
                int[] iArr7 = iArr2;
                for (int i58 = 0; i58 < i44; i58++) {
                    int i59 = iArr7[i58] + iM71636m14;
                    if (i59 < 0 && zArr[i58]) {
                        iArr5[i57] = i59;
                        i57++;
                    }
                }
                int[] iArrCopyOf2 = Arrays.copyOf(iArr5, i57);
                int i64 = 0;
                for (int i65 = i44 - 1; i65 >= 0; i65--) {
                    int i66 = iArr7[i65] + iM71636m14;
                    if (i66 > 0 && zArr[i65]) {
                        iArr6[i64] = i66;
                        i64++;
                    }
                }
                if (iM71636m14 > 0 && zArr[i47]) {
                    iArr6[i64] = iM71636m14;
                    i64++;
                }
                int i67 = i57;
                int i68 = i64;
                for (int i69 = 0; i69 < iM71636m12; i69++) {
                    int i74 = iArrCopyOf[i69] + iM71636m14;
                    if (i74 > 0 && zArr[i44 + i69]) {
                        iArr6[i68] = i74;
                        i68++;
                    }
                }
                iArrCopyOf = Arrays.copyOf(iArr6, i68);
                iM71636m12 = i68;
                i44 = i67;
                iArr2 = iArrCopyOf2;
            }
            i39++;
            iM71636m11 = iM71636m11;
            i15 = i15;
        }
        int i75 = i15;
        if (c24561s.m71631h()) {
            int iM71636m15 = c24561s.m71636m();
            for (int i76 = 0; i76 < iM71636m15; i76++) {
                c24561s.m71643t(iM71636m10 + 5);
            }
        }
        c24561s.m71643t(2);
        float f13 = 1.0f;
        if (c24561s.m71631h()) {
            if (c24561s.m71631h()) {
                int iM71632i3 = c24561s.m71632i(8);
                if (iM71632i3 == 255) {
                    int iM71632i4 = c24561s.m71632i(16);
                    int iM71632i5 = c24561s.m71632i(16);
                    if (iM71632i4 != 0 && iM71632i5 != 0) {
                        f13 = iM71632i4 / iM71632i5;
                    }
                } else if (iM71632i3 < 17) {
                    f13 = f169168b[iM71632i3];
                } else {
                    AbstractC38963t7.m124388r(iM71632i3, "Unexpected aspect_ratio_idc value: ", "NalUnitUtil");
                }
            }
            if (c24561s.m71631h()) {
                c24561s.m71642s();
            }
            if (c24561s.m71631h()) {
                c24561s.m71643t(3);
                i25 = c24561s.m71631h() ? 1 : 2;
                if (c24561s.m71631h()) {
                    int iM71632i6 = c24561s.m71632i(8);
                    int iM71632i7 = c24561s.m71632i(8);
                    c24561s.m71643t(8);
                    iM109387f = C34592g.m109387f(iM71632i6);
                    iM109388g = C34592g.m109388g(iM71632i7);
                } else {
                    iM109387f = -1;
                    iM109388g = -1;
                }
            } else if (c29662f == null || (c33652u = (C33652u) c29662f.f121228E) == null) {
                iM109387f = -1;
                iM109388g = -1;
                i25 = -1;
            } else {
                AbstractC41023g0 abstractC41023g3 = (AbstractC41023g0) c33652u.f140441w;
                int i77 = ((int[]) c33652u.f140442x)[i75];
                if (abstractC41023g3.size() > i77) {
                    C39316k c39316k = (C39316k) abstractC41023g3.get(i77);
                    int i78 = c39316k.f169143a;
                    int i79 = c39316k.f169144b;
                    iM109388g = c39316k.f169145c;
                    iM109387f = i78;
                    i25 = i79;
                } else {
                    iM109387f = -1;
                    iM109388g = -1;
                    i25 = -1;
                }
            }
            if (c24561s.m71631h()) {
                c24561s.m71636m();
                c24561s.m71636m();
            }
            c24561s.m71642s();
            if (c24561s.m71631h()) {
                i16 *= 2;
            }
            i18 = iM109387f;
            i24 = iM109388g;
            i19 = i25;
        } else {
            i18 = -1;
            i19 = -1;
            i24 = -1;
        }
        return new C39315j(iM71632i, c39313hM125280g, iM71636m, iM71636m2, i17, i16, f13, iMax, i18, i19, i24);
    }

    /* JADX WARN: Code duplicated, block: B:484:0x015a A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:60:0x0117  */
    /* JADX WARN: Code duplicated, block: B:62:0x011d  */
    /* JADX WARN: Code duplicated, block: B:64:0x0123  */
    /* JADX WARN: Code duplicated, block: B:65:0x0129  */
    /* JADX WARN: Code duplicated, block: B:67:0x012f  */
    /* JADX WARN: Code duplicated, block: B:69:0x013c  */
    /* JADX WARN: Code duplicated, block: B:72:0x0147  */
    /* JADX WARN: Code duplicated, block: B:74:0x014c  */
    /* JADX WARN: Code duplicated, block: B:76:0x0154  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX INFO: renamed from: j */
    public static C29662f m125283j(byte[] bArr, int i13, int i14) {
        int[] iArr;
        C33652u c33652u;
        int iM71632i;
        int iM71632i2;
        int iM71632i3;
        boolean z4;
        int i15;
        C41060w0 c41060w0;
        boolean[][] zArr;
        int i16;
        boolean[][] zArr2;
        int[] iArr2;
        int[] iArr3;
        boolean z13;
        int i17;
        boolean zM71631h;
        int i18;
        int i19;
        int i24;
        boolean zM71631h2;
        boolean zM71631h3;
        int iM71636m;
        int i25;
        int i26;
        int i27;
        boolean z14;
        boolean z15;
        C24561s c24561s = new C24561s(i13, i14, 6, bArr);
        m125279f(c24561s);
        c24561s.m71643t(4);
        boolean zM71631h4 = c24561s.m71631h();
        boolean zM71631h5 = c24561s.m71631h();
        int iM71632i4 = c24561s.m71632i(6);
        int i28 = iM71632i4 + 1;
        int iM71632i5 = c24561s.m71632i(3);
        c24561s.m71643t(17);
        C39313h c39313hM125280g = m125280g(c24561s, true, iM71632i5, null);
        for (int i29 = c24561s.m71631h() ? 0 : iM71632i5; i29 <= iM71632i5; i29++) {
            c24561s.m71636m();
            c24561s.m71636m();
            c24561s.m71636m();
        }
        int iM71632i6 = c24561s.m71632i(6);
        int iM71636m2 = c24561s.m71636m() + 1;
        int i34 = 6;
        C29875i c29875i = new C29875i(AbstractC41023g0.m133256r(c39313hM125280g), new int[1]);
        boolean z16 = i28 >= 2 && iM71636m2 >= 2;
        boolean z17 = zM71631h4 && zM71631h5;
        int i35 = iM71632i6 + 1;
        boolean z18 = i35 >= i28;
        if (!z16 || !z17 || !z18) {
            return new C29662f((C41060w0) null, c29875i, (C32800q) null, (C33652u) null);
        }
        Class cls = Integer.TYPE;
        int[][] iArr4 = (int[][]) Array.newInstance((Class<?>) cls, iM71636m2, i35);
        int i36 = 1;
        int[] iArr5 = new int[iM71636m2];
        int[] iArr6 = new int[iM71636m2];
        iArr4[0][0] = 0;
        iArr5[0] = 1;
        iArr6[0] = 0;
        for (int i37 = 1; i37 < iM71636m2; i37++) {
            int i38 = 0;
            for (int i39 = 0; i39 <= iM71632i6; i39++) {
                if (c24561s.m71631h()) {
                    iArr4[i37][i38] = i39;
                    iArr6[i37] = i39;
                    i38++;
                }
                iArr5[i37] = i38;
            }
        }
        if (c24561s.m71631h()) {
            c24561s.m71643t(64);
            if (c24561s.m71631h()) {
                c24561s.m71636m();
            }
            int iM71636m3 = c24561s.m71636m();
            int i44 = 0;
            while (i44 < iM71636m3) {
                c24561s.m71636m();
                if (i44 == 0 || c24561s.m71631h()) {
                    boolean zM71631h6 = c24561s.m71631h();
                    boolean zM71631h7 = c24561s.m71631h();
                    z15 = zM71631h6;
                    z14 = zM71631h7;
                    if (zM71631h6 || zM71631h7) {
                        zM71631h = c24561s.m71631h();
                        if (zM71631h) {
                            c24561s.m71643t(19);
                        }
                        c24561s.m71643t(8);
                        if (zM71631h) {
                            c24561s.m71643t(4);
                        }
                        c24561s.m71643t(15);
                        i19 = zM71631h6;
                        i18 = zM71631h7;
                    }
                    i24 = 0;
                    while (i24 <= iM71632i5) {
                        zM71631h2 = c24561s.m71631h();
                        if (!zM71631h2) {
                            zM71631h2 = c24561s.m71631h();
                        }
                        if (zM71631h2) {
                            c24561s.m71636m();
                            zM71631h3 = false;
                        } else {
                            zM71631h3 = c24561s.m71631h();
                        }
                        if (zM71631h3) {
                            iM71636m = 0;
                        } else {
                            iM71636m = c24561s.m71636m();
                        }
                        int[][] iArr7 = iArr4;
                        i25 = i19 + i18;
                        int[] iArr8 = iArr6;
                        i26 = 0;
                        while (i26 < i25) {
                            int i45 = i25;
                            for (i27 = 0; i27 <= iM71636m; i27++) {
                                c24561s.m71636m();
                                c24561s.m71636m();
                                if (zM71631h) {
                                    c24561s.m71636m();
                                    c24561s.m71636m();
                                }
                                c24561s.m71642s();
                            }
                            i26++;
                            i25 = i45;
                        }
                        i24++;
                        i44 = i44;
                        iArr4 = iArr7;
                        iArr6 = iArr8;
                    }
                    i44++;
                } else {
                    z15 = false;
                    z14 = false;
                }
                zM71631h = false;
                i19 = z15;
                i18 = z14;
                i24 = 0;
                while (i24 <= iM71632i5) {
                    zM71631h2 = c24561s.m71631h();
                    if (!zM71631h2) {
                        zM71631h2 = c24561s.m71631h();
                    }
                    if (zM71631h2) {
                        c24561s.m71636m();
                        zM71631h3 = false;
                    } else {
                        zM71631h3 = c24561s.m71631h();
                    }
                    if (zM71631h3) {
                        iM71636m = c24561s.m71636m();
                    } else {
                        iM71636m = 0;
                    }
                    int[][] iArr9 = iArr4;
                    i25 = i19 + i18;
                    int[] iArr10 = iArr6;
                    i26 = 0;
                    while (i26 < i25) {
                        int i46 = i25;
                        while (i27 <= iM71636m) {
                            c24561s.m71636m();
                            c24561s.m71636m();
                            if (zM71631h) {
                                c24561s.m71636m();
                                c24561s.m71636m();
                            }
                            c24561s.m71642s();
                        }
                        i26++;
                        i25 = i46;
                    }
                    i24++;
                    i44 = i44;
                    iArr4 = iArr9;
                    iArr6 = iArr10;
                }
                i44++;
            }
        }
        int[][] iArr11 = iArr4;
        int[] iArr12 = iArr6;
        if (!c24561s.m71631h()) {
            return new C29662f((C41060w0) null, c29875i, (C32800q) null, (C33652u) null);
        }
        int i47 = c24561s.f95861e;
        if (i47 > 0) {
            c24561s.m71643t(8 - i47);
        }
        C39313h c39313hM125280g2 = m125280g(c24561s, false, iM71632i5, c39313hM125280g);
        boolean zM71631h8 = c24561s.m71631h();
        boolean[] zArr3 = new boolean[16];
        int i48 = 0;
        for (int i49 = 0; i49 < 16; i49++) {
            boolean zM71631h9 = c24561s.m71631h();
            zArr3[i49] = zM71631h9;
            if (zM71631h9) {
                i48++;
            }
        }
        if (i48 == 0 || !zArr3[1]) {
            return new C29662f((C41060w0) null, c29875i, (C32800q) null, (C33652u) null);
        }
        int[] iArr13 = new int[i48];
        for (int i54 = 0; i54 < i48 - (zM71631h8 ? 1 : 0); i54++) {
            iArr13[i54] = c24561s.m71632i(3);
        }
        int[] iArr14 = new int[i48 + 1];
        if (zM71631h8) {
            int i55 = 1;
            while (i55 < i48) {
                int[] iArr15 = iArr14;
                for (int i56 = 0; i56 < i55; i56++) {
                    iArr15[i55] = iArr13[i56] + 1 + iArr15[i55];
                }
                i55++;
                iArr14 = iArr15;
            }
            iArr = iArr14;
            iArr[i48] = 6;
        } else {
            iArr = iArr14;
        }
        int[][] iArr16 = (int[][]) Array.newInstance((Class<?>) cls, i28, i48);
        int[] iArr17 = new int[i28];
        iArr17[0] = 0;
        boolean zM71631h10 = c24561s.m71631h();
        int i57 = 1;
        while (i57 < i28) {
            if (zM71631h10) {
                i17 = i57;
                iArr17[i17] = c24561s.m71632i(i34);
            } else {
                i17 = i57;
                iArr17[i17] = i17;
            }
            if (zM71631h8) {
                int i58 = 0;
                while (i58 < i48) {
                    int i59 = i58 + 1;
                    iArr16[i17][i58] = (iArr17[i17] & ((1 << iArr[i59]) - 1)) >> iArr[i58];
                    i58 = i59;
                }
            } else {
                int i64 = 0;
                while (i64 < i48) {
                    int i65 = i64;
                    iArr16[i17][i65] = c24561s.m71632i(iArr13[i64] + 1);
                    i64 = i65 + 1;
                }
            }
            i57 = i17 + 1;
            i34 = 6;
        }
        int[] iArr18 = new int[i35];
        int i66 = 1;
        int i67 = 0;
        while (i67 < i28) {
            iArr18[iArr17[i67]] = -1;
            int[] iArr19 = iArr18;
            int i68 = 0;
            int i69 = 0;
            while (i68 < 16) {
                if (zArr3[i68]) {
                    if (i68 == i36) {
                        iArr19[iArr17[i67]] = iArr16[i67][i69];
                    }
                    i69++;
                }
                i68++;
                i36 = 1;
            }
            if (i67 > 0) {
                int i74 = 0;
                while (true) {
                    if (i74 >= i67) {
                        z13 = true;
                        break;
                    }
                    int i75 = i74;
                    if (iArr19[iArr17[i67]] == iArr19[iArr17[i74]]) {
                        z13 = false;
                        break;
                    }
                    i74 = i75 + 1;
                }
                if (z13) {
                    i66++;
                }
            }
            i67++;
            iArr18 = iArr19;
            i36 = 1;
        }
        int[] iArr20 = iArr18;
        int iM71632i7 = c24561s.m71632i(4);
        if (i66 < 2 || iM71632i7 == 0) {
            return new C29662f((C41060w0) null, c29875i, (C32800q) null, (C33652u) null);
        }
        int[] iArr21 = new int[i66];
        for (int i76 = 0; i76 < i66; i76++) {
            iArr21[i76] = c24561s.m71632i(iM71632i7);
        }
        int[] iArr22 = new int[i35];
        for (int i77 = 0; i77 < i28; i77++) {
            iArr22[Math.min(iArr17[i77], iM71632i6)] = i77;
        }
        C41014d0 c41014d0M133251l = AbstractC41023g0.m133251l();
        int i78 = 0;
        while (i78 <= iM71632i6) {
            int[] iArr23 = iArr22;
            int i79 = i66;
            int iMin = Math.min(iArr20[i78], i79 - 1);
            c41014d0M133251l.m133222a(new C39312g(iArr23[i78], iMin >= 0 ? iArr21[iMin] : -1));
            i78++;
            iArr22 = iArr23;
            iArr17 = iArr17;
            i66 = i79;
        }
        int[] iArr24 = iArr17;
        C41060w0 c41060w0M133239f = c41014d0M133251l.m133239f();
        if (((C39312g) c41060w0M133239f.get(0)).f169120b == -1) {
            return new C29662f((C41060w0) null, c29875i, (C32800q) null, (C33652u) null);
        }
        int i83 = 1;
        while (true) {
            if (i83 > iM71632i6) {
                i83 = -1;
                break;
            }
            if (((C39312g) c41060w0M133239f.get(i83)).f169120b != -1) {
                break;
            }
            i83++;
        }
        if (i83 == -1) {
            return new C29662f((C41060w0) null, c29875i, (C32800q) null, (C33652u) null);
        }
        Class cls2 = Boolean.TYPE;
        boolean[][] zArr4 = (boolean[][]) Array.newInstance((Class<?>) cls2, i28, i28);
        boolean[][] zArr5 = (boolean[][]) Array.newInstance((Class<?>) cls2, i28, i28);
        for (int i84 = 1; i84 < i28; i84++) {
            for (int i85 = 0; i85 < i84; i85++) {
                boolean[] zArr6 = zArr4[i84];
                boolean[] zArr7 = zArr5[i84];
                boolean zM71631h11 = c24561s.m71631h();
                zArr7[i85] = zM71631h11;
                zArr6[i85] = zM71631h11;
            }
        }
        for (int i86 = 1; i86 < i28; i86++) {
            int i87 = 0;
            while (i87 < iM71632i4) {
                boolean[][] zArr8 = zArr4;
                for (int i88 = 0; i88 < i86; i88++) {
                    boolean[] zArr9 = zArr5[i86];
                    if (zArr9[i88] && zArr5[i88][i87]) {
                        zArr9[i87] = true;
                        break;
                    }
                }
                i87++;
                zArr4 = zArr8;
            }
        }
        boolean[][] zArr10 = zArr4;
        int[] iArr25 = new int[i35];
        for (int i89 = 0; i89 < i28; i89++) {
            int i94 = 0;
            for (int i95 = 0; i95 < i89; i95++) {
                i94 += zArr10[i89][i95] ? 1 : 0;
            }
            iArr25[iArr24[i89]] = i94;
        }
        int i96 = 0;
        for (int i97 = 0; i97 < i28; i97++) {
            if (iArr25[iArr24[i97]] == 0) {
                i96++;
            }
        }
        if (i96 > 1) {
            return new C29662f((C41060w0) null, c29875i, (C32800q) null, (C33652u) null);
        }
        int[] iArr26 = new int[i28];
        int[] iArr27 = new int[iM71636m2];
        if (c24561s.m71631h()) {
            int i98 = 0;
            while (i98 < i28) {
                int i99 = i98;
                iArr26[i99] = c24561s.m71632i(3);
                i98 = i99 + 1;
            }
        } else {
            Arrays.fill(iArr26, 0, i28, iM71632i5);
        }
        int i100 = 0;
        while (i100 < iM71636m2) {
            int i101 = i100;
            boolean[][] zArr11 = zArr5;
            int[] iArr28 = iArr26;
            int iMax = 0;
            for (int i102 = 0; i102 < iArr5[i101]; i102++) {
                iMax = Math.max(iMax, iArr28[((C39312g) c41060w0M133239f.get(iArr11[i101][i102])).f169119a]);
            }
            iArr27[i101] = iMax + 1;
            i100 = i101 + 1;
            zArr5 = zArr11;
            iArr26 = iArr28;
        }
        boolean[][] zArr12 = zArr5;
        if (c24561s.m71631h()) {
            int i103 = 0;
            while (i103 < iM71632i4) {
                int i104 = i103 + 1;
                int i105 = i104;
                while (i105 < i28) {
                    if (zArr10[i105][i103]) {
                        c24561s.m71643t(3);
                    }
                    i105++;
                    iM71632i4 = iM71632i4;
                }
                i103 = i104;
            }
        }
        c24561s.m71642s();
        int iM71636m4 = c24561s.m71636m() + 1;
        C41014d0 c41014d0M133251l2 = AbstractC41023g0.m133251l();
        c41014d0M133251l2.m133222a(c39313hM125280g);
        if (iM71636m4 > 1) {
            c41014d0M133251l2.m133222a(c39313hM125280g2);
            for (int i106 = 2; i106 < iM71636m4; i106++) {
                c39313hM125280g2 = m125280g(c24561s, c24561s.m71631h(), iM71632i5, c39313hM125280g2);
                c41014d0M133251l2.m133222a(c39313hM125280g2);
            }
        }
        C41060w0 c41060w0M133239f2 = c41014d0M133251l2.m133239f();
        int iM71636m5 = c24561s.m71636m() + iM71636m2;
        if (iM71636m5 > iM71636m2) {
            return new C29662f((C41060w0) null, c29875i, (C32800q) null, (C33652u) null);
        }
        int iM71632i8 = c24561s.m71632i(2);
        boolean[][] zArr13 = (boolean[][]) Array.newInstance((Class<?>) cls2, iM71636m5, i35);
        int[] iArr29 = new int[iM71636m5];
        int i107 = 0;
        int[] iArr30 = new int[iM71636m5];
        int i108 = 0;
        while (i108 < iM71636m2) {
            iArr29[i108] = i107;
            iArr30[i108] = iArr12[i108];
            if (iM71632i8 == 0) {
                i16 = i108;
                zArr2 = zArr13;
                iArr2 = iArr29;
                iArr3 = iArr27;
                Arrays.fill(zArr13[i16], i107, iArr5[i16], true);
                iArr2[i16] = iArr5[i16];
            } else {
                i16 = i108;
                zArr2 = zArr13;
                iArr2 = iArr29;
                iArr3 = iArr27;
                if (iM71632i8 == 1) {
                    int i109 = iArr12[i16];
                    for (int i110 = 0; i110 < iArr5[i16]; i110++) {
                        zArr2[i16][i110] = iArr11[i16][i110] == i109;
                    }
                    iArr2[i16] = 1;
                } else {
                    i107 = 0;
                    zArr2[0][0] = true;
                    iArr2[0] = 1;
                }
                i108 = i16 + 1;
                zArr13 = zArr2;
                iArr29 = iArr2;
                iArr27 = iArr3;
            }
            i107 = 0;
            i108 = i16 + 1;
            zArr13 = zArr2;
            iArr29 = iArr2;
            iArr27 = iArr3;
        }
        boolean[][] zArr14 = zArr13;
        int[] iArr31 = iArr29;
        int[] iArr32 = iArr27;
        int[] iArr33 = new int[i35];
        int i111 = 2;
        int[] iArr34 = new int[2];
        iArr34[1] = i35;
        iArr34[i107] = iM71636m5;
        boolean[][] zArr15 = (boolean[][]) Array.newInstance((Class<?>) cls2, iArr34);
        int i112 = 1;
        int i113 = 0;
        while (i112 < iM71636m5) {
            if (iM71632i8 == i111) {
                for (int i114 = 0; i114 < iArr5[i112]; i114++) {
                    zArr14[i112][i114] = c24561s.m71631h();
                    int i115 = iArr31[i112];
                    boolean z19 = zArr14[i112][i114];
                    iArr31[i112] = i115 + (z19 ? 1 : 0);
                    if (z19) {
                        iArr30[i112] = iArr11[i112][i114];
                    }
                }
            }
            if (i113 == 0) {
                i15 = 0;
                if (iArr11[i112][0] == 0 && zArr14[i112][0]) {
                    for (int i116 = 1; i116 < iArr5[i112]; i116++) {
                        if (iArr11[i112][i116] == i83 && zArr14[i112][i83]) {
                            i113 = i112;
                        }
                    }
                }
            } else {
                i15 = 0;
            }
            int i117 = i15;
            while (i117 < iArr5[i112]) {
                if (iM71636m4 > 1) {
                    zArr15[i112][i117] = zArr14[i112][i117];
                    c41060w0 = c41060w0M133239f2;
                    zArr = zArr15;
                    RoundingMode roundingMode = RoundingMode.CEILING;
                    int iM10729c = AbstractC3574c.m10729c(iM71636m4);
                    if (!zArr[i112][i117]) {
                        int i118 = ((C39312g) c41060w0M133239f.get(iArr11[i112][i117])).f169119a;
                        int i119 = i15;
                        while (i119 < i117) {
                            int i120 = i119;
                            if (zArr12[i118][((C39312g) c41060w0M133239f.get(iArr11[i112][i120])).f169119a]) {
                                zArr[i112][i117] = true;
                                break;
                            }
                            i119 = i120 + 1;
                        }
                    }
                    if (zArr[i112][i117]) {
                        if (i113 <= 0 || i112 != i113) {
                            c24561s.m71643t(iM10729c);
                        } else {
                            iArr33[i117] = c24561s.m71632i(iM10729c);
                        }
                    }
                } else {
                    c41060w0 = c41060w0M133239f2;
                    zArr = zArr15;
                }
                i117++;
                c41060w0M133239f2 = c41060w0;
                zArr15 = zArr;
            }
            C41060w0 c41060w1 = c41060w0M133239f2;
            boolean[][] zArr16 = zArr15;
            if (iArr31[i112] == 1 && iArr25[iArr30[i112]] > 0) {
                c24561s.m71642s();
            }
            i112++;
            c41060w0M133239f2 = c41060w1;
            zArr15 = zArr16;
            i111 = 2;
        }
        C41060w0 c41060w2 = c41060w0M133239f2;
        boolean[][] zArr17 = zArr15;
        if (i113 == 0) {
            return new C29662f((C41060w0) null, c29875i, (C32800q) null, (C33652u) null);
        }
        int iM71636m6 = c24561s.m71636m();
        int i121 = iM71636m6 + 1;
        AbstractC41047q.m133273c(i121, "expectedSize");
        AbstractC41047q.m133273c(i121, "initialCapacity");
        int[] iArr35 = new int[i28];
        Object[] objArrCopyOf = new Object[i121];
        int i122 = 0;
        int i123 = 0;
        boolean z24 = false;
        while (i122 < i121) {
            int i124 = i122;
            int iM71632i9 = c24561s.m71632i(16);
            int iM71632i10 = c24561s.m71632i(16);
            boolean z25 = z24;
            if (c24561s.m71631h()) {
                iM71632i = c24561s.m71632i(2);
                if (iM71632i == 3) {
                    c24561s.m71642s();
                }
                iM71632i2 = c24561s.m71632i(4);
                iM71632i3 = c24561s.m71632i(4);
            } else {
                iM71632i = 0;
                iM71632i2 = 0;
                iM71632i3 = 0;
            }
            if (c24561s.m71631h()) {
                int iM71636m7 = c24561s.m71636m();
                int iM71636m8 = c24561s.m71636m();
                int iM71636m9 = c24561s.m71636m();
                int iM71636m10 = c24561s.m71636m();
                iM71632i9 -= (iM71636m7 + iM71636m8) * ((iM71632i == 1 || iM71632i == 2) ? 2 : 1);
                iM71632i10 -= (iM71636m9 + iM71636m10) * (iM71632i == 1 ? 2 : 1);
            }
            C39314i c39314i = new C39314i(iM71632i, iM71632i2, iM71632i3, iM71632i9, iM71632i10);
            int iM133221e = AbstractC41005a0.m133221e(objArrCopyOf.length, i123 + 1);
            if (iM133221e > objArrCopyOf.length || z25) {
                objArrCopyOf = Arrays.copyOf(objArrCopyOf, iM133221e);
                z4 = false;
            } else {
                z4 = z25;
            }
            objArrCopyOf[i123] = c39314i;
            i123++;
            i122 = i124 + 1;
            z24 = z4;
        }
        if (i121 <= 1 || !c24561s.m71631h()) {
            for (int i125 = 1; i125 < i28; i125++) {
                iArr35[i125] = Math.min(i125, iM71636m6);
            }
        } else {
            RoundingMode roundingMode2 = RoundingMode.CEILING;
            int iM10729c2 = AbstractC3574c.m10729c(i121);
            for (int i126 = 1; i126 < i28; i126++) {
                iArr35[i126] = c24561s.m71632i(iM10729c2);
            }
        }
        C41060w0 c41060w0M133250j = AbstractC41023g0.m133250j(i123, objArrCopyOf);
        C32800q c32800q = new C32800q();
        c32800q.f136504w = AbstractC41023g0.m133252m(c41060w0M133250j);
        c32800q.f136505x = iArr35;
        c24561s.m71643t(2);
        for (int i127 = 1; i127 < i28; i127++) {
            if (iArr25[iArr24[i127]] == 0) {
                c24561s.m71642s();
            }
        }
        for (int i128 = 1; i128 < iM71636m5; i128++) {
            boolean zM71631h12 = c24561s.m71631h();
            int i129 = 0;
            while (i129 < iArr32[i128]) {
                if ((i129 <= 0 || !zM71631h12) ? i129 == 0 : c24561s.m71631h()) {
                    for (int i130 = 0; i130 < iArr5[i128]; i130++) {
                        if (zArr17[i128][i130]) {
                            c24561s.m71636m();
                        }
                    }
                    c24561s.m71636m();
                    c24561s.m71636m();
                }
                i129++;
            }
        }
        int iM71636m11 = c24561s.m71636m() + 2;
        if (c24561s.m71631h()) {
            c24561s.m71643t(iM71636m11);
        } else {
            for (int i131 = 1; i131 < i28; i131++) {
                for (int i132 = 0; i132 < i131; i132++) {
                    if (zArr10[i131][i132]) {
                        c24561s.m71643t(iM71636m11);
                    }
                }
            }
        }
        int iM71636m12 = c24561s.m71636m();
        for (int i133 = 1; i133 <= iM71636m12; i133++) {
            c24561s.m71643t(8);
        }
        if (c24561s.m71631h()) {
            int i134 = c24561s.f95861e;
            if (i134 > 0) {
                c24561s.m71643t(8 - i134);
            }
            if (!c24561s.m71631h() ? c24561s.m71631h() : true) {
                c24561s.m71642s();
            }
            boolean zM71631h13 = c24561s.m71631h();
            boolean zM71631h14 = c24561s.m71631h();
            if (zM71631h13 || zM71631h14) {
                for (int i135 = 0; i135 < iM71636m2; i135++) {
                    for (int i136 = 0; i136 < iArr32[i135]; i136++) {
                        boolean zM71631h15 = zM71631h13 ? c24561s.m71631h() : false;
                        boolean zM71631h16 = zM71631h14 ? c24561s.m71631h() : false;
                        if (zM71631h15) {
                            c24561s.m71643t(32);
                        }
                        if (zM71631h16) {
                            c24561s.m71643t(18);
                        }
                    }
                }
            }
            boolean zM71631h17 = c24561s.m71631h();
            int iM71632i11 = zM71631h17 ? c24561s.m71632i(4) + 1 : i28;
            AbstractC41047q.m133273c(iM71632i11, "expectedSize");
            AbstractC41047q.m133273c(iM71632i11, "initialCapacity");
            int[] iArr36 = new int[i28];
            Object[] objArrCopyOf2 = new Object[iM71632i11];
            int i137 = 0;
            int i138 = 0;
            boolean z26 = false;
            while (i137 < iM71632i11) {
                c24561s.m71643t(3);
                int i139 = c24561s.m71631h() ? 1 : 2;
                int iM109387f = C34592g.m109387f(c24561s.m71632i(8));
                boolean z27 = zM71631h17;
                int iM109388g = C34592g.m109388g(c24561s.m71632i(8));
                c24561s.m71643t(8);
                C39316k c39316k = new C39316k(iM109387f, i139, iM109388g);
                int iM133221e2 = AbstractC41005a0.m133221e(objArrCopyOf2.length, i138 + 1);
                if (iM133221e2 > objArrCopyOf2.length || z26) {
                    objArrCopyOf2 = Arrays.copyOf(objArrCopyOf2, iM133221e2);
                    z26 = false;
                }
                objArrCopyOf2[i138] = c39316k;
                i137++;
                i138++;
                zM71631h17 = z27;
                z26 = z26;
            }
            if (zM71631h17 && iM71632i11 > 1) {
                for (int i140 = 0; i140 < i28; i140++) {
                    iArr36[i140] = c24561s.m71632i(4);
                }
            }
            C41060w0 c41060w0M133250j2 = AbstractC41023g0.m133250j(i138, objArrCopyOf2);
            c33652u = new C33652u();
            c33652u.f140441w = AbstractC41023g0.m133252m(c41060w0M133250j2);
            c33652u.f140442x = iArr36;
        } else {
            c33652u = null;
        }
        return new C29662f(c41060w0M133239f, new C29875i(c41060w2, iArr33), c32800q, c33652u);
    }

    /* JADX WARN: Code duplicated, block: B:101:0x01af A[PHI: r19
      0x01af: PHI (r19v6 float) = (r19v3 float), (r19v9 float), (r19v3 float), (r19v3 float), (r19v10 float) binds: [B:94:0x0191, B:104:0x01b6, B:98:0x01a7, B:99:0x01a9, B:100:0x01ab] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:102:0x01b2  */
    /* JADX WARN: Code duplicated, block: B:104:0x01b6  */
    /* JADX WARN: Code duplicated, block: B:105:0x01bb  */
    /* JADX WARN: Code duplicated, block: B:108:0x01ca  */
    /* JADX WARN: Code duplicated, block: B:111:0x01d3  */
    /* JADX WARN: Code duplicated, block: B:113:0x01dd  */
    /* JADX WARN: Code duplicated, block: B:114:0x01df  */
    /* JADX WARN: Code duplicated, block: B:117:0x01e7  */
    /* JADX WARN: Code duplicated, block: B:118:0x01fd  */
    /* JADX WARN: Code duplicated, block: B:119:0x0200  */
    /* JADX WARN: Code duplicated, block: B:122:0x0209  */
    /* JADX WARN: Code duplicated, block: B:125:0x0215  */
    /* JADX WARN: Code duplicated, block: B:128:0x0220  */
    /* JADX WARN: Code duplicated, block: B:131:0x0229  */
    /* JADX WARN: Code duplicated, block: B:134:0x0230  */
    /* JADX WARN: Code duplicated, block: B:137:0x023c  */
    /* JADX WARN: Code duplicated, block: B:139:0x0262  */
    /* JADX WARN: Code duplicated, block: B:61:0x011d  */
    /* JADX WARN: Code duplicated, block: B:64:0x012f  */
    /* JADX WARN: Code duplicated, block: B:66:0x0141  */
    /* JADX WARN: Code duplicated, block: B:67:0x0144 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:68:0x0146  */
    /* JADX WARN: Code duplicated, block: B:69:0x0149  */
    /* JADX WARN: Code duplicated, block: B:71:0x014d  */
    /* JADX WARN: Code duplicated, block: B:72:0x0150  */
    /* JADX WARN: Code duplicated, block: B:93:0x018d  */
    /* JADX WARN: Code duplicated, block: B:95:0x0193  */
    /* JADX WARN: Code duplicated, block: B:97:0x019d  */
    /* JADX INFO: renamed from: k */
    public static C39318m m125284k(byte[] bArr, int i13, int i14) {
        int iM71636m;
        int iM71636m2;
        int i15;
        boolean z4;
        int i16;
        int iM71636m3;
        boolean z13;
        boolean zM71631h;
        int i17;
        int i18;
        int i19;
        int iM71636m4;
        int iM109387f;
        float f13;
        int i24;
        int i25;
        int i26;
        float f14;
        int i27;
        int i28;
        int iM109388g;
        boolean zM71631h2;
        boolean zM71631h3;
        int iM71632i;
        int iM71632i2;
        int iM71632i3;
        int i29;
        int i34;
        C24561s c24561s = new C24561s(i13 + 1, i14, 6, bArr);
        int iM71632i4 = c24561s.m71632i(8);
        int iM71632i5 = c24561s.m71632i(8);
        int iM71632i6 = c24561s.m71632i(8);
        int iM71636m5 = c24561s.m71636m();
        if (iM71632i4 == 100 || iM71632i4 == 110 || iM71632i4 == 122 || iM71632i4 == 244 || iM71632i4 == 44 || iM71632i4 == 83 || iM71632i4 == 86 || iM71632i4 == 118 || iM71632i4 == 128 || iM71632i4 == 138) {
            iM71636m = c24561s.m71636m();
            boolean zM71631h4 = iM71636m == 3 ? c24561s.m71631h() : false;
            int iM71636m6 = c24561s.m71636m();
            iM71636m2 = c24561s.m71636m();
            c24561s.m71642s();
            if (c24561s.m71631h()) {
                int i35 = iM71636m != 3 ? 8 : 12;
                i15 = 16;
                int i36 = 0;
                while (i36 < i35) {
                    if (c24561s.m71631h()) {
                        int i37 = i36 < 6 ? 16 : 64;
                        int iM71637n = 8;
                        int i38 = 8;
                        for (int i39 = 0; i39 < i37; i39++) {
                            if (iM71637n != 0) {
                                iM71637n = ((c24561s.m71637n() + i38) + 256) % 256;
                            }
                            if (iM71637n != 0) {
                                i38 = iM71637n;
                            }
                        }
                    }
                    i36++;
                }
            } else {
                i15 = 16;
            }
            z4 = zM71631h4;
            i16 = iM71636m6;
        } else {
            iM71636m = 1;
            i15 = 16;
            i16 = 0;
            z4 = false;
            iM71636m2 = 0;
        }
        int iM71636m7 = c24561s.m71636m() + 4;
        int iM71636m8 = c24561s.m71636m();
        if (iM71636m8 != 0) {
            if (iM71636m8 == 1) {
                boolean zM71631h5 = c24561s.m71631h();
                c24561s.m71637n();
                c24561s.m71637n();
                iM71632i4 = iM71632i4;
                long jM71636m = c24561s.m71636m();
                iM71636m8 = iM71636m8;
                for (int i44 = 0; i44 < jM71636m; i44++) {
                    c24561s.m71636m();
                }
                iM71636m2 = iM71636m2;
                z13 = zM71631h5;
                iM71636m3 = 0;
            } else {
                iM71636m3 = 0;
            }
            c24561s.m71636m();
            c24561s.m71642s();
            int iM71636m9 = c24561s.m71636m() + 1;
            int iM71636m10 = c24561s.m71636m() + 1;
            zM71631h = c24561s.m71631h();
            i17 = 2 - (zM71631h ? 1 : 0);
            int i45 = iM71636m10 * i17;
            if (!zM71631h) {
                c24561s.m71642s();
            }
            c24561s.m71642s();
            i18 = iM71636m9 * 16;
            i19 = i45 * 16;
            if (c24561s.m71631h()) {
                int iM71636m11 = c24561s.m71636m();
                int iM71636m12 = c24561s.m71636m();
                int iM71636m13 = c24561s.m71636m();
                int iM71636m14 = c24561s.m71636m();
                if (iM71636m == 0) {
                    i29 = 1;
                } else {
                    if (iM71636m == 3) {
                        i29 = 1;
                    } else {
                        i29 = 2;
                    }
                    if (iM71636m == 1) {
                        i34 = 2;
                    } else {
                        i34 = 1;
                    }
                    i17 *= i34;
                }
                i18 -= (iM71636m11 + iM71636m12) * i29;
                i19 -= (iM71636m13 + iM71636m14) * i17;
            }
            int i46 = i19;
            int i47 = i18;
            int i48 = iM71632i4;
            iM71636m4 = ((i48 != 44 || i48 == 86 || i48 == 100 || i48 == 110 || i48 == 122 || i48 == 244) && (iM71632i5 & 16) != 0) ? 0 : i15;
            iM109387f = -1;
            f13 = 1.0f;
            if (c24561s.m71631h()) {
                if (!c24561s.m71631h()) {
                    iM71632i = c24561s.m71632i(8);
                    if (iM71632i == 255) {
                        int i49 = i15;
                        iM71632i2 = c24561s.m71632i(i49);
                        iM71632i3 = c24561s.m71632i(i49);
                        if (iM71632i2 != 0 && iM71632i3 != 0) {
                            f13 = iM71632i2 / iM71632i3;
                        }
                    } else if (iM71632i < 17) {
                        f13 = f169168b[iM71632i];
                    } else {
                        AbstractC38963t7.m124388r(iM71632i, "Unexpected aspect_ratio_idc value: ", "NalUnitUtil");
                    }
                }
                if (c24561s.m71631h()) {
                    c24561s.m71642s();
                }
                if (c24561s.m71631h()) {
                    c24561s.m71643t(3);
                    if (c24561s.m71631h()) {
                        i28 = 1;
                    } else {
                        i28 = 2;
                    }
                    if (c24561s.m71631h()) {
                        int iM71632i7 = c24561s.m71632i(8);
                        int iM71632i8 = c24561s.m71632i(8);
                        c24561s.m71643t(8);
                        iM109387f = C34592g.m109387f(iM71632i7);
                        iM109388g = C34592g.m109388g(iM71632i8);
                    } else {
                        iM109388g = -1;
                    }
                } else {
                    i28 = -1;
                    iM109388g = -1;
                }
                if (c24561s.m71631h()) {
                    c24561s.m71636m();
                    c24561s.m71636m();
                }
                if (c24561s.m71631h()) {
                    c24561s.m71643t(65);
                }
                zM71631h2 = c24561s.m71631h();
                if (zM71631h2) {
                    m125285l(c24561s);
                }
                zM71631h3 = c24561s.m71631h();
                if (zM71631h3) {
                    m125285l(c24561s);
                }
                if (zM71631h2 || zM71631h3) {
                    c24561s.m71642s();
                }
                c24561s.m71642s();
                if (c24561s.m71631h()) {
                    c24561s.m71642s();
                    c24561s.m71636m();
                    c24561s.m71636m();
                    c24561s.m71636m();
                    c24561s.m71636m();
                    iM71636m4 = c24561s.m71636m();
                    c24561s.m71636m();
                }
                f14 = f13;
                i27 = iM109387f;
                i25 = i28;
                i26 = iM109388g;
                i24 = iM71636m4;
            } else {
                iM71636m7 = iM71636m7;
                i24 = iM71636m4;
                i25 = -1;
                i26 = -1;
                f14 = 1.0f;
                i27 = -1;
            }
            return new C39318m(i48, iM71632i5, iM71632i6, iM71636m5, i47, i46, f14, i16, iM71636m2, z4, zM71631h, iM71636m7, iM71636m8, iM71636m3, z13, i27, i25, i26, i24);
        }
        iM71636m3 = c24561s.m71636m() + 4;
        z13 = false;
        c24561s.m71636m();
        c24561s.m71642s();
        int iM71636m15 = c24561s.m71636m() + 1;
        int iM71636m16 = c24561s.m71636m() + 1;
        zM71631h = c24561s.m71631h();
        i17 = 2 - (zM71631h ? 1 : 0);
        int i410 = iM71636m16 * i17;
        if (!zM71631h) {
            c24561s.m71642s();
        }
        c24561s.m71642s();
        i18 = iM71636m15 * 16;
        i19 = i410 * 16;
        if (c24561s.m71631h()) {
            int iM71636m17 = c24561s.m71636m();
            int iM71636m18 = c24561s.m71636m();
            int iM71636m19 = c24561s.m71636m();
            int iM71636m110 = c24561s.m71636m();
            if (iM71636m == 0) {
                i29 = 1;
            } else {
                if (iM71636m == 3) {
                    i29 = 1;
                } else {
                    i29 = 2;
                }
                if (iM71636m == 1) {
                    i34 = 2;
                } else {
                    i34 = 1;
                }
                i17 *= i34;
            }
            i18 -= (iM71636m17 + iM71636m18) * i29;
            i19 -= (iM71636m19 + iM71636m110) * i17;
        }
        int i411 = i19;
        int i412 = i18;
        int i413 = iM71632i4;
        if (i413 != 44) {
        }
        iM109387f = -1;
        f13 = 1.0f;
        if (c24561s.m71631h()) {
            if (!c24561s.m71631h()) {
                iM71632i = c24561s.m71632i(8);
                if (iM71632i == 255) {
                    int i414 = i15;
                    iM71632i2 = c24561s.m71632i(i414);
                    iM71632i3 = c24561s.m71632i(i414);
                    if (iM71632i2 != 0) {
                        f13 = iM71632i2 / iM71632i3;
                    }
                } else if (iM71632i < 17) {
                    f13 = f169168b[iM71632i];
                } else {
                    AbstractC38963t7.m124388r(iM71632i, "Unexpected aspect_ratio_idc value: ", "NalUnitUtil");
                }
            }
            if (c24561s.m71631h()) {
                c24561s.m71642s();
            }
            if (c24561s.m71631h()) {
                c24561s.m71643t(3);
                if (c24561s.m71631h()) {
                    i28 = 1;
                } else {
                    i28 = 2;
                }
                if (c24561s.m71631h()) {
                    int iM71632i9 = c24561s.m71632i(8);
                    int iM71632i10 = c24561s.m71632i(8);
                    c24561s.m71643t(8);
                    iM109387f = C34592g.m109387f(iM71632i9);
                    iM109388g = C34592g.m109388g(iM71632i10);
                } else {
                    iM109388g = -1;
                }
            } else {
                i28 = -1;
                iM109388g = -1;
            }
            if (c24561s.m71631h()) {
                c24561s.m71636m();
                c24561s.m71636m();
            }
            if (c24561s.m71631h()) {
                c24561s.m71643t(65);
            }
            zM71631h2 = c24561s.m71631h();
            if (zM71631h2) {
                m125285l(c24561s);
            }
            zM71631h3 = c24561s.m71631h();
            if (zM71631h3) {
                m125285l(c24561s);
            }
            if (zM71631h2) {
                c24561s.m71642s();
            } else {
                c24561s.m71642s();
            }
            c24561s.m71642s();
            if (c24561s.m71631h()) {
                c24561s.m71642s();
                c24561s.m71636m();
                c24561s.m71636m();
                c24561s.m71636m();
                c24561s.m71636m();
                iM71636m4 = c24561s.m71636m();
                c24561s.m71636m();
            }
            f14 = f13;
            i27 = iM109387f;
            i25 = i28;
            i26 = iM109388g;
            i24 = iM71636m4;
        } else {
            iM71636m7 = iM71636m7;
            i24 = iM71636m4;
            i25 = -1;
            i26 = -1;
            f14 = 1.0f;
            i27 = -1;
        }
        return new C39318m(i413, iM71632i5, iM71632i6, iM71636m5, i412, i411, f14, i16, iM71636m2, z4, zM71631h, iM71636m7, iM71636m8, iM71636m3, z13, i27, i25, i26, i24);
    }

    /* JADX INFO: renamed from: l */
    public static void m125285l(C24561s c24561s) {
        int iM71636m = c24561s.m71636m() + 1;
        c24561s.m71643t(8);
        for (int i13 = 0; i13 < iM71636m; i13++) {
            c24561s.m71636m();
            c24561s.m71636m();
            c24561s.m71642s();
        }
        c24561s.m71643t(20);
    }

    /* JADX INFO: renamed from: m */
    public static ArrayList m125286m(ByteBuffer byteBuffer) {
        int iRemaining;
        ByteBuffer byteBufferAsReadOnlyBuffer = byteBuffer.asReadOnlyBuffer();
        ArrayList arrayList = new ArrayList();
        while (byteBufferAsReadOnlyBuffer.hasRemaining()) {
            byte b = byteBufferAsReadOnlyBuffer.get();
            int i13 = (b >> 3) & 15;
            if (((b >> 2) & 1) != 0) {
                byteBufferAsReadOnlyBuffer.get();
            }
            if (((b >> 1) & 1) != 0) {
                iRemaining = 0;
                for (int i14 = 0; i14 < 8; i14++) {
                    byte b6 = byteBufferAsReadOnlyBuffer.get();
                    iRemaining |= (b6 & 127) << (i14 * 7);
                    if ((b6 & 128) == 0) {
                        break;
                    }
                }
            } else {
                iRemaining = byteBufferAsReadOnlyBuffer.remaining();
            }
            ByteBuffer byteBufferDuplicate = byteBufferAsReadOnlyBuffer.duplicate();
            byteBufferDuplicate.limit(byteBufferAsReadOnlyBuffer.position() + iRemaining);
            arrayList.add(new C39321p(i13, byteBufferDuplicate));
            byteBufferAsReadOnlyBuffer.position(byteBufferAsReadOnlyBuffer.position() + iRemaining);
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: n */
    public static int m125287n(int i13, byte[] bArr) {
        int i14;
        synchronized (f169169c) {
            int i15 = 0;
            int i16 = 0;
            while (i15 < i13) {
                while (true) {
                    if (i15 >= i13 - 2) {
                        i15 = i13;
                        break;
                    }
                    try {
                        if (bArr[i15] == 0 && bArr[i15 + 1] == 0 && bArr[i15 + 2] == 3) {
                            break;
                        }
                        i15++;
                    } catch (Throwable th3) {
                        throw th3;
                    }
                }
                if (i15 < i13) {
                    int[] iArr = f169170d;
                    if (iArr.length <= i16) {
                        f169170d = Arrays.copyOf(iArr, iArr.length * 2);
                    }
                    f169170d[i16] = i15;
                    i15 += 3;
                    i16++;
                }
            }
            i14 = i13 - i16;
            int i17 = 0;
            int i18 = 0;
            for (int i19 = 0; i19 < i16; i19++) {
                int i24 = f169170d[i19] - i18;
                System.arraycopy(bArr, i18, bArr, i17, i24);
                int i25 = i17 + i24;
                int i26 = i25 + 1;
                bArr[i25] = 0;
                i17 = i25 + 2;
                bArr[i26] = 0;
                i18 += i24 + 3;
            }
            System.arraycopy(bArr, i18, bArr, i17, i14 - i17);
        }
        return i14;
    }
}
