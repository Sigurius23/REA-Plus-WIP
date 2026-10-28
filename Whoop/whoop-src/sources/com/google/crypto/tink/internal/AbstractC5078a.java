package com.google.crypto.tink.internal;

import a33.C0352d;
import at.C1977u;
import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p154fs.C14728f;
import p619xl.C38445a;
import qg3.C30352d;
import ss.C32945a;
import ss.C32946b;
import u00.C34377e;

/* JADX INFO: renamed from: com.google.crypto.tink.internal.a */
/* JADX INFO: loaded from: classes6.dex */
public abstract class AbstractC5078a {

    /* JADX INFO: renamed from: a */
    public static final byte[][] f21381a = {new byte[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new byte[]{1, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new byte[]{-32, -21, 122, 124, 59, 65, -72, -82, 22, 86, -29, -6, -15, -97, -60, 106, -38, 9, -115, -21, -100, 50, -79, -3, -122, 98, 5, 22, 95, 73, -72, 0}, new byte[]{95, -100, -107, -68, -93, 80, -116, 36, -79, -48, -79, 85, -100, -125, -17, 91, 4, 68, 92, -60, 88, 28, -114, -122, -40, 34, 78, -35, -48, -97, 17, 87}, new byte[]{-20, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 127}, new byte[]{-19, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 127}, new byte[]{-18, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 127}};

    /* JADX INFO: renamed from: b */
    public static final C5080b f21382b = new C5080b(new long[]{1, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new long[]{1, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new long[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0});

    /* JADX INFO: renamed from: c */
    public static final C30352d f21383c = new C30352d(7, new C0352d(new long[]{0, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new long[]{1, 0, 0, 0, 0, 0, 0, 0, 0, 0}, new long[]{1, 0, 0, 0, 0, 0, 0, 0, 0, 0}, 9), new long[]{1, 0, 0, 0, 0, 0, 0, 0, 0, 0});

    /* JADX INFO: renamed from: d */
    public static final int[] f21384d = {0, 3, 6, 9, 12, 16, 19, 22, 25, 28};

    /* JADX INFO: renamed from: e */
    public static final int[] f21385e = {0, 2, 3, 5, 6, 0, 1, 3, 4, 6};

    /* JADX INFO: renamed from: f */
    public static final int[] f21386f = {67108863, 33554431};

    /* JADX INFO: renamed from: g */
    public static final int[] f21387g = {26, 25};

    /* JADX INFO: renamed from: h */
    public static final C34377e f21388h = new C34377e(19);

    /* JADX INFO: renamed from: a */
    public static void m15928a(C30352d c30352d, C38445a c38445a, C5080b c5080b) {
        long[] jArr = new long[10];
        C0352d c0352d = (C0352d) c30352d.f124535x;
        long[] jArr2 = (long[]) c0352d.f1237x;
        C0352d c0352d2 = (C0352d) c38445a.f164636x;
        m15947t(jArr2, (long[]) c0352d2.f1238y, (long[]) c0352d2.f1237x);
        m15946s((long[]) c0352d.f1238y, (long[]) c0352d2.f1238y, (long[]) c0352d2.f1237x);
        long[] jArr3 = (long[]) c0352d.f1238y;
        m15938k(jArr3, jArr3, c5080b.f21391b);
        long[] jArr4 = (long[]) c0352d.f1239z;
        long[] jArr5 = (long[]) c0352d.f1237x;
        m15938k(jArr4, jArr5, c5080b.f21390a);
        long[] jArr6 = (long[]) c30352d.f124536y;
        m15938k(jArr6, (long[]) c38445a.f164637y, c5080b.f21392c);
        long[] jArr7 = (long[]) c0352d2.f1239z;
        c5080b.getClass();
        System.arraycopy(jArr7, 0, jArr5, 0, 10);
        m15947t(jArr, jArr5, jArr5);
        m15946s(jArr5, jArr4, jArr3);
        m15947t(jArr3, jArr4, jArr3);
        m15947t(jArr4, jArr, jArr6);
        m15946s(jArr6, jArr, jArr6);
    }

    /* JADX INFO: renamed from: b */
    public static byte[] m15929b(long[] jArr) {
        long j7;
        int[] iArr;
        int i13;
        int[] iArr2;
        long[] jArrCopyOf = Arrays.copyOf(jArr, 10);
        int i14 = 0;
        int i15 = 0;
        while (true) {
            j7 = 19;
            iArr = f21387g;
            if (i15 >= 2) {
                break;
            }
            int i16 = 0;
            while (i16 < 9) {
                long j13 = jArrCopyOf[i16];
                int i17 = iArr[i16 & 1];
                int i18 = -((int) (((j13 >> 31) & j13) >> i17));
                jArrCopyOf[i16] = j13 + ((long) (i18 << i17));
                i16++;
                jArrCopyOf[i16] = jArrCopyOf[i16] - ((long) i18);
            }
            long j14 = jArrCopyOf[9];
            int i19 = -((int) (((j14 >> 31) & j14) >> 25));
            jArrCopyOf[9] = j14 + ((long) (i19 << 25));
            jArrCopyOf[0] = jArrCopyOf[0] - (((long) i19) * 19);
            i15++;
        }
        long j15 = jArrCopyOf[0];
        int i24 = -((int) (((j15 >> 31) & j15) >> 26));
        jArrCopyOf[0] = j15 + ((long) (i24 << 26));
        jArrCopyOf[1] = jArrCopyOf[1] - ((long) i24);
        int i25 = 0;
        while (true) {
            iArr2 = f21386f;
            if (i25 >= 2) {
                break;
            }
            int i26 = i14;
            while (i26 < 9) {
                long j16 = jArrCopyOf[i26];
                int i27 = i26 & 1;
                int i28 = i14;
                int i29 = i25;
                int i34 = (int) (j16 >> iArr[i27]);
                jArrCopyOf[i26] = j16 & ((long) iArr2[i27]);
                i26++;
                jArrCopyOf[i26] = jArrCopyOf[i26] + ((long) i34);
                i14 = i28;
                j7 = j7;
                i25 = i29;
            }
            i25++;
        }
        int i35 = i14;
        long j17 = jArrCopyOf[9];
        jArrCopyOf[9] = j17 & 33554431;
        long j18 = (((long) ((int) (j17 >> 25))) * j7) + jArrCopyOf[i35];
        jArrCopyOf[i35] = j18;
        int i36 = ~((((int) j18) - 67108845) >> 31);
        for (int i37 = 1; i37 < 10; i37++) {
            int i38 = ~(((int) jArrCopyOf[i37]) ^ iArr2[i37 & 1]);
            int i39 = i38 & (i38 << 16);
            int i44 = i39 & (i39 << 8);
            int i45 = i44 & (i44 << 4);
            int i46 = i45 & (i45 << 2);
            i36 &= (i46 & (i46 << 1)) >> 31;
        }
        jArrCopyOf[i35] = jArrCopyOf[i35] - ((long) (67108845 & i36));
        long j19 = 33554431 & i36;
        jArrCopyOf[1] = jArrCopyOf[1] - j19;
        for (i13 = 2; i13 < 10; i13 += 2) {
            jArrCopyOf[i13] = jArrCopyOf[i13] - ((long) (67108863 & i36));
            int i47 = i13 + 1;
            jArrCopyOf[i47] = jArrCopyOf[i47] - j19;
        }
        for (int i48 = i35; i48 < 10; i48++) {
            jArrCopyOf[i48] = jArrCopyOf[i48] << f21385e[i48];
        }
        byte[] bArr = new byte[32];
        for (int i49 = i35; i49 < 10; i49++) {
            int i54 = f21384d[i49];
            long j24 = bArr[i54];
            long j25 = jArrCopyOf[i49];
            bArr[i54] = (byte) (j24 | (j25 & 255));
            int i55 = i54 + 1;
            bArr[i55] = (byte) (((long) bArr[i55]) | ((j25 >> 8) & 255));
            int i56 = i54 + 2;
            bArr[i56] = (byte) (((long) bArr[i56]) | ((j25 >> 16) & 255));
            int i57 = i54 + 3;
            bArr[i57] = (byte) (((long) bArr[i57]) | ((j25 >> 24) & 255));
        }
        return bArr;
    }

    /* JADX INFO: renamed from: c */
    public static void m15930c(long[] jArr, long[] jArr2, int i13) {
        int i14 = -i13;
        for (int i15 = 0; i15 < 10; i15++) {
            long j7 = jArr[i15];
            jArr[i15] = ((int) j7) ^ ((((int) j7) ^ ((int) jArr2[i15])) & i14);
        }
    }

    /* JADX INFO: renamed from: d */
    public static void m15931d(C0352d c0352d, C30352d c30352d) {
        long[] jArr = new long[10];
        C0352d c0352d2 = (C0352d) c30352d.f124535x;
        m15945r((long[]) c0352d2.f1237x, (long[]) c0352d.f1237x);
        long[] jArr2 = (long[]) c0352d2.f1239z;
        long[] jArr3 = (long[]) c0352d.f1238y;
        m15945r(jArr2, jArr3);
        long[] jArr4 = (long[]) c30352d.f124536y;
        m15945r(jArr4, (long[]) c0352d.f1239z);
        m15947t(jArr4, jArr4, jArr4);
        long[] jArr5 = (long[]) c0352d2.f1238y;
        m15947t(jArr5, (long[]) c0352d.f1237x, jArr3);
        m15945r(jArr, jArr5);
        long[] jArr6 = (long[]) c0352d2.f1239z;
        long[] jArr7 = (long[]) c0352d2.f1237x;
        m15947t(jArr5, jArr6, jArr7);
        m15946s(jArr6, jArr6, jArr7);
        m15946s(jArr7, jArr, jArr5);
        m15946s(jArr4, jArr4, jArr6);
    }

    /* JADX INFO: renamed from: e */
    public static int m15932e(int i13, int i14) {
        int i15 = (~(i13 ^ i14)) & 255;
        int i16 = i15 & (i15 << 4);
        int i17 = i16 & (i16 << 2);
        return ((i17 & (i17 << 1)) >> 7) & 1;
    }

    /* JADX INFO: renamed from: f */
    public static long[] m15933f(byte[] bArr) {
        long[] jArr = new long[10];
        for (int i13 = 0; i13 < 10; i13++) {
            int i14 = f21384d[i13];
            jArr[i13] = ((((((long) (bArr[i14] & 255)) | (((long) (bArr[i14 + 1] & 255)) << 8)) | (((long) (bArr[i14 + 2] & 255)) << 16)) | (((long) (bArr[i14 + 3] & 255)) << 24)) >> f21385e[i13]) & ((long) f21386f[i13 & 1]);
        }
        return jArr;
    }

    /* JADX INFO: renamed from: g */
    public static BigInteger m15934g(byte[] bArr) {
        return new BigInteger(1, bArr);
    }

    /* JADX INFO: renamed from: h */
    public static byte[] m15935h(byte[] bArr) {
        MessageDigest messageDigest = (MessageDigest) C1977u.f7822e.f7825a.m6025a("SHA-512");
        messageDigest.update(bArr, 0, 32);
        byte[] bArrDigest = messageDigest.digest();
        bArrDigest[0] = (byte) (bArrDigest[0] & 248);
        byte b = (byte) (bArrDigest[31] & 127);
        bArrDigest[31] = b;
        bArrDigest[31] = (byte) (b | 64);
        return bArrDigest;
    }

    /* JADX INFO: renamed from: i */
    public static void m15936i(C0352d c0352d) {
        C14728f c14728f;
        ArrayList arrayList = new ArrayList();
        C32945a c32945a = C32945a.f137237b;
        Object obj = c0352d.f1239z;
        Iterator it = ((Map) c0352d.f1237x).values().iterator();
        while (it.hasNext()) {
            for (C5097j0 c5097j0 : (List) it.next()) {
                int iOrdinal = c5097j0.f21430b.ordinal();
                if (iOrdinal == 1) {
                    c14728f = C14728f.f54464c;
                } else if (iOrdinal == 2) {
                    c14728f = C14728f.f54465d;
                } else {
                    if (iOrdinal != 3) {
                        throw new IllegalStateException("Unknown key status");
                    }
                    c14728f = C14728f.f54466e;
                }
                int i13 = c5097j0.f21432d;
                String strSubstring = c5097j0.f21433e;
                if (strSubstring.startsWith("type.googleapis.com/google.crypto.")) {
                    strSubstring = strSubstring.substring(34);
                }
                arrayList.add(new C32946b(c14728f, i13, strSubstring, c5097j0.f21431c.name()));
            }
        }
        C5097j0 c5097j1 = (C5097j0) c0352d.f1238y;
        Integer numValueOf = c5097j1 != null ? Integer.valueOf(c5097j1.f21432d) : null;
        if (numValueOf != null) {
            try {
                int iIntValue = numValueOf.intValue();
                Iterator it3 = arrayList.iterator();
                while (it3.hasNext()) {
                    if (((C32946b) it3.next()).f137240b == iIntValue) {
                    }
                }
                throw new GeneralSecurityException("primary key ID is not present in entries");
            } catch (GeneralSecurityException e5) {
                throw new IllegalStateException(e5);
            }
        }
        Collections.unmodifiableList(arrayList);
    }

    /* JADX INFO: renamed from: j */
    public static void m15937j(long[] jArr, long[] jArr2) {
        long[] jArr3 = new long[10];
        long[] jArr4 = new long[10];
        long[] jArr5 = new long[10];
        long[] jArr6 = new long[10];
        long[] jArr7 = new long[10];
        long[] jArr8 = new long[10];
        long[] jArr9 = new long[10];
        long[] jArr10 = new long[10];
        long[] jArr11 = new long[10];
        long[] jArr12 = new long[10];
        m15945r(jArr3, jArr2);
        m15945r(jArr12, jArr3);
        m15945r(jArr11, jArr12);
        m15938k(jArr4, jArr11, jArr2);
        m15938k(jArr5, jArr4, jArr3);
        m15945r(jArr11, jArr5);
        m15938k(jArr6, jArr11, jArr4);
        m15945r(jArr11, jArr6);
        m15945r(jArr12, jArr11);
        m15945r(jArr11, jArr12);
        m15945r(jArr12, jArr11);
        m15945r(jArr11, jArr12);
        m15938k(jArr7, jArr11, jArr6);
        m15945r(jArr11, jArr7);
        m15945r(jArr12, jArr11);
        for (int i13 = 2; i13 < 10; i13 += 2) {
            m15945r(jArr11, jArr12);
            m15945r(jArr12, jArr11);
        }
        m15938k(jArr8, jArr12, jArr7);
        m15945r(jArr11, jArr8);
        m15945r(jArr12, jArr11);
        for (int i14 = 2; i14 < 20; i14 += 2) {
            m15945r(jArr11, jArr12);
            m15945r(jArr12, jArr11);
        }
        m15938k(jArr11, jArr12, jArr8);
        m15945r(jArr12, jArr11);
        m15945r(jArr11, jArr12);
        for (int i15 = 2; i15 < 10; i15 += 2) {
            m15945r(jArr12, jArr11);
            m15945r(jArr11, jArr12);
        }
        m15938k(jArr9, jArr11, jArr7);
        m15945r(jArr11, jArr9);
        m15945r(jArr12, jArr11);
        for (int i16 = 2; i16 < 50; i16 += 2) {
            m15945r(jArr11, jArr12);
            m15945r(jArr12, jArr11);
        }
        m15938k(jArr10, jArr12, jArr9);
        m15945r(jArr12, jArr10);
        m15945r(jArr11, jArr12);
        for (int i17 = 2; i17 < 100; i17 += 2) {
            m15945r(jArr12, jArr11);
            m15945r(jArr11, jArr12);
        }
        m15938k(jArr12, jArr11, jArr10);
        m15945r(jArr11, jArr12);
        m15945r(jArr12, jArr11);
        for (int i18 = 2; i18 < 50; i18 += 2) {
            m15945r(jArr11, jArr12);
            m15945r(jArr12, jArr11);
        }
        m15938k(jArr11, jArr12, jArr9);
        m15945r(jArr12, jArr11);
        m15945r(jArr11, jArr12);
        m15945r(jArr12, jArr11);
        m15945r(jArr11, jArr12);
        m15945r(jArr12, jArr11);
        m15938k(jArr, jArr12, jArr5);
    }

    /* JADX INFO: renamed from: k */
    public static void m15938k(long[] jArr, long[] jArr2, long[] jArr3) {
        long[] jArr4 = new long[19];
        m15939l(jArr4, jArr2, jArr3);
        m15940m(jArr4, jArr);
    }

    /* JADX INFO: renamed from: l */
    public static void m15939l(long[] jArr, long[] jArr2, long[] jArr3) {
        jArr[0] = jArr2[0] * jArr3[0];
        long j7 = jArr2[0];
        long j13 = jArr3[1] * j7;
        long j14 = jArr2[1];
        long j15 = jArr3[0];
        jArr[1] = (j14 * j15) + j13;
        long j16 = jArr2[1];
        long j17 = jArr3[1];
        jArr[2] = (jArr2[2] * j15) + (jArr3[2] * j7) + (j16 * 2 * j17);
        long j18 = jArr3[2];
        long j19 = jArr2[2];
        jArr[3] = (jArr2[3] * j15) + (jArr3[3] * j7) + (j19 * j17) + (j16 * j18);
        long j24 = jArr3[3];
        long j25 = jArr2[3];
        jArr[4] = (jArr2[4] * j15) + (jArr3[4] * j7) + (((j25 * j17) + (j16 * j24)) * 2) + (j19 * j18);
        long j26 = jArr3[4];
        long j27 = (j16 * j26) + (j25 * j18) + (j19 * j24);
        long j28 = jArr2[4];
        jArr[5] = (jArr2[5] * j15) + (jArr3[5] * j7) + (j28 * j17) + j27;
        long j29 = jArr3[5];
        long j34 = jArr2[5];
        jArr[6] = (jArr2[6] * j15) + (jArr3[6] * j7) + (j28 * j18) + (j19 * j26) + (((j34 * j17) + (j16 * j29) + (j25 * j24)) * 2);
        long j35 = (j34 * j18) + (j19 * j29) + (j28 * j24) + (j25 * j26);
        long j36 = jArr3[6];
        long j37 = (j16 * j36) + j35;
        long j38 = jArr2[6];
        jArr[7] = (jArr2[7] * j15) + (jArr3[7] * j7) + (j38 * j17) + j37;
        long j39 = jArr3[7];
        long j44 = (j16 * j39) + (j34 * j24) + (j25 * j29);
        long j45 = jArr2[7];
        long j46 = (((j45 * j17) + j44) * 2) + (j28 * j26);
        jArr[8] = (jArr2[8] * j15) + (jArr3[8] * j7) + (j38 * j18) + (j19 * j36) + j46;
        long j47 = (j45 * j18) + (j19 * j39) + (j38 * j24) + (j25 * j36) + (j34 * j26) + (j28 * j29);
        long j48 = jArr3[8];
        long j49 = (j16 * j48) + j47;
        long j54 = jArr2[8];
        jArr[9] = (jArr2[9] * j15) + (j7 * jArr3[9]) + (j54 * j17) + j49;
        long j55 = (j45 * j24) + (j25 * j39) + (j34 * j29);
        long j56 = jArr3[9];
        long j57 = jArr2[9];
        long j58 = j28 * j36;
        jArr[10] = (j54 * j18) + (j19 * j48) + (j38 * j26) + j58 + (((j17 * j57) + (j16 * j56) + j55) * 2);
        long j59 = j19 * j56;
        long j64 = j18 * j57;
        jArr[11] = j64 + j59 + (j54 * j24) + (j25 * j48) + (j45 * j26) + (j28 * j39) + (j38 * j29) + (j34 * j36);
        long j65 = j25 * j56;
        long j66 = j24 * j57;
        long j67 = j54 * j26;
        jArr[12] = j67 + (j28 * j48) + ((j66 + j65 + (j45 * j29) + (j34 * j39)) * 2) + (j38 * j36);
        long j68 = j28 * j56;
        long j69 = j26 * j57;
        jArr[13] = j69 + j68 + (j54 * j29) + (j34 * j48) + (j45 * j36) + (j38 * j39);
        long j73 = j29 * j57;
        long j74 = j54 * j36;
        jArr[14] = j74 + (j38 * j48) + ((j73 + (j34 * j56) + (j45 * j39)) * 2);
        long j75 = j38 * j56;
        long j76 = j36 * j57;
        jArr[15] = j76 + j75 + (j54 * j39) + (j45 * j48);
        jArr[16] = (((j39 * j57) + (j45 * j56)) * 2) + (j54 * j48);
        jArr[17] = (j48 * j57) + (j54 * j56);
        jArr[18] = j57 * 2 * j56;
    }

    /* JADX INFO: renamed from: m */
    public static void m15940m(long[] jArr, long[] jArr2) {
        if (jArr.length != 19) {
            long[] jArr3 = new long[19];
            System.arraycopy(jArr, 0, jArr3, 0, jArr.length);
            jArr = jArr3;
        }
        m15942o(jArr);
        m15941n(jArr);
        System.arraycopy(jArr, 0, jArr2, 0, 10);
    }

    /* JADX INFO: renamed from: n */
    public static void m15941n(long[] jArr) {
        jArr[10] = 0;
        int i13 = 0;
        while (i13 < 10) {
            long j7 = jArr[i13];
            long j13 = j7 / 67108864;
            jArr[i13] = j7 - (j13 << 26);
            int i14 = i13 + 1;
            long j14 = jArr[i14] + j13;
            jArr[i14] = j14;
            long j15 = j14 / 33554432;
            jArr[i14] = j14 - (j15 << 25);
            i13 += 2;
            jArr[i13] = jArr[i13] + j15;
        }
        long j16 = jArr[0];
        long j17 = jArr[10];
        long j18 = j16 + (j17 << 4);
        jArr[0] = j18;
        long j19 = j18 + (j17 << 1);
        jArr[0] = j19;
        long j24 = j19 + j17;
        jArr[0] = j24;
        jArr[10] = 0;
        long j25 = j24 / 67108864;
        jArr[0] = j24 - (j25 << 26);
        jArr[1] = jArr[1] + j25;
    }

    /* JADX INFO: renamed from: o */
    public static void m15942o(long[] jArr) {
        long j7 = jArr[8];
        long j13 = jArr[18];
        long j14 = j7 + (j13 << 4);
        jArr[8] = j14;
        long j15 = j14 + (j13 << 1);
        jArr[8] = j15;
        jArr[8] = j15 + j13;
        long j16 = jArr[7];
        long j17 = jArr[17];
        long j18 = j16 + (j17 << 4);
        jArr[7] = j18;
        long j19 = j18 + (j17 << 1);
        jArr[7] = j19;
        jArr[7] = j19 + j17;
        long j24 = jArr[6];
        long j25 = jArr[16];
        long j26 = j24 + (j25 << 4);
        jArr[6] = j26;
        long j27 = j26 + (j25 << 1);
        jArr[6] = j27;
        jArr[6] = j27 + j25;
        long j28 = jArr[5];
        long j29 = jArr[15];
        long j34 = j28 + (j29 << 4);
        jArr[5] = j34;
        long j35 = j34 + (j29 << 1);
        jArr[5] = j35;
        jArr[5] = j35 + j29;
        long j36 = jArr[4];
        long j37 = jArr[14];
        long j38 = j36 + (j37 << 4);
        jArr[4] = j38;
        long j39 = j38 + (j37 << 1);
        jArr[4] = j39;
        jArr[4] = j39 + j37;
        long j44 = jArr[3];
        long j45 = jArr[13];
        long j46 = j44 + (j45 << 4);
        jArr[3] = j46;
        long j47 = j46 + (j45 << 1);
        jArr[3] = j47;
        jArr[3] = j47 + j45;
        long j48 = jArr[2];
        long j49 = jArr[12];
        long j54 = j48 + (j49 << 4);
        jArr[2] = j54;
        long j55 = j54 + (j49 << 1);
        jArr[2] = j55;
        jArr[2] = j55 + j49;
        long j56 = jArr[1];
        long j57 = jArr[11];
        long j58 = j56 + (j57 << 4);
        jArr[1] = j58;
        long j59 = j58 + (j57 << 1);
        jArr[1] = j59;
        jArr[1] = j59 + j57;
        long j64 = jArr[0];
        long j65 = jArr[10];
        long j66 = j64 + (j65 << 4);
        jArr[0] = j66;
        long j67 = j66 + (j65 << 1);
        jArr[0] = j67;
        jArr[0] = j67 + j65;
    }

    /* JADX INFO: renamed from: p */
    public static byte[] m15943p(byte[] bArr) {
        int i13;
        byte[] bArr2 = new byte[64];
        int i14 = 0;
        while (true) {
            if (i14 >= 32) {
                break;
            }
            int i15 = i14 * 2;
            bArr2[i15] = (byte) (bArr[i14] & 15);
            bArr2[i15 + 1] = (byte) (((bArr[i14] & 255) >> 4) & 15);
            i14++;
        }
        int i16 = 0;
        int i17 = 0;
        while (i16 < 63) {
            byte b = (byte) (bArr2[i16] + i17);
            bArr2[i16] = b;
            int i18 = (b + 8) >> 4;
            bArr2[i16] = (byte) (b - (i18 << 4));
            i16++;
            i17 = i18;
        }
        bArr2[63] = (byte) (bArr2[63] + i17);
        C30352d c30352d = new C30352d(7, (byte) 0);
        C38445a c38445a = new C38445a(7);
        for (i13 = 1; i13 < 64; i13 += 2) {
            C5080b c5080b = new C5080b();
            m15944q(c5080b, i13 / 2, bArr2[i13]);
            C38445a.m123162q(c38445a, c30352d);
            m15928a(c30352d, c38445a, c5080b);
        }
        C0352d c0352d = new C0352d(9);
        C0352d.m913n(c0352d, c30352d);
        m15931d(c0352d, c30352d);
        C0352d.m913n(c0352d, c30352d);
        m15931d(c0352d, c30352d);
        C0352d.m913n(c0352d, c30352d);
        m15931d(c0352d, c30352d);
        C0352d.m913n(c0352d, c30352d);
        m15931d(c0352d, c30352d);
        for (int i19 = 0; i19 < 64; i19 += 2) {
            C5080b c5080b2 = new C5080b();
            m15944q(c5080b2, i19 / 2, bArr2[i19]);
            C38445a.m123162q(c38445a, c30352d);
            m15928a(c30352d, c38445a, c5080b2);
        }
        C0352d c0352d2 = new C0352d(c30352d);
        long[] jArr = new long[10];
        m15945r(jArr, (long[]) c0352d2.f1237x);
        long[] jArr2 = new long[10];
        m15945r(jArr2, (long[]) c0352d2.f1238y);
        long[] jArr3 = new long[10];
        m15945r(jArr3, (long[]) c0352d2.f1239z);
        long[] jArr4 = new long[10];
        m15945r(jArr4, jArr3);
        long[] jArr5 = new long[10];
        m15946s(jArr5, jArr2, jArr);
        m15938k(jArr5, jArr5, jArr3);
        long[] jArr6 = new long[10];
        m15938k(jArr6, jArr, jArr2);
        m15938k(jArr6, jArr6, AbstractC5082c.f21395a);
        m15947t(jArr6, jArr6, jArr4);
        m15940m(jArr6, jArr6);
        if (!MessageDigest.isEqual(m15929b(jArr5), m15929b(jArr6))) {
            throw new IllegalStateException("arithmetic error in scalar multiplication");
        }
        long[] jArr7 = new long[10];
        long[] jArr8 = new long[10];
        long[] jArr9 = new long[10];
        m15937j(jArr7, (long[]) c0352d2.f1239z);
        m15938k(jArr8, (long[]) c0352d2.f1237x, jArr7);
        m15938k(jArr9, (long[]) c0352d2.f1238y, jArr7);
        byte[] bArrM15929b = m15929b(jArr9);
        bArrM15929b[31] = (byte) (bArrM15929b[31] ^ ((m15929b(jArr8)[0] & 1) << 7));
        return bArrM15929b;
    }

    /* JADX INFO: renamed from: q */
    public static void m15944q(C5080b c5080b, int i13, byte b) {
        int i14 = (b & 255) >> 7;
        int i15 = b - (((-i14) & b) << 1);
        C5080b[][] c5080bArr = AbstractC5082c.f21396b;
        c5080b.m15953a(c5080bArr[i13][0], m15932e(i15, 1));
        c5080b.m15953a(c5080bArr[i13][1], m15932e(i15, 2));
        c5080b.m15953a(c5080bArr[i13][2], m15932e(i15, 3));
        c5080b.m15953a(c5080bArr[i13][3], m15932e(i15, 4));
        c5080b.m15953a(c5080bArr[i13][4], m15932e(i15, 5));
        c5080b.m15953a(c5080bArr[i13][5], m15932e(i15, 6));
        c5080b.m15953a(c5080bArr[i13][6], m15932e(i15, 7));
        c5080b.m15953a(c5080bArr[i13][7], m15932e(i15, 8));
        long[] jArr = c5080b.f21391b;
        long[] jArrCopyOf = Arrays.copyOf(jArr, 10);
        long[] jArr2 = c5080b.f21390a;
        long[] jArrCopyOf2 = Arrays.copyOf(jArr2, 10);
        long[] jArr3 = c5080b.f21392c;
        long[] jArrCopyOf3 = Arrays.copyOf(jArr3, 10);
        for (int i16 = 0; i16 < jArrCopyOf3.length; i16++) {
            jArrCopyOf3[i16] = -jArrCopyOf3[i16];
        }
        m15930c(jArr2, jArrCopyOf, i14);
        m15930c(jArr, jArrCopyOf2, i14);
        m15930c(jArr3, jArrCopyOf3, i14);
    }

    /* JADX INFO: renamed from: r */
    public static void m15945r(long[] jArr, long[] jArr2) {
        long j7 = jArr2[0];
        long j13 = j7 * 2;
        long j14 = jArr2[1];
        long j15 = jArr2[2];
        long j16 = jArr2[3];
        long j17 = jArr2[4];
        long j18 = jArr2[5];
        long j19 = jArr2[6];
        long j24 = jArr2[7];
        long j25 = jArr2[8];
        long j26 = jArr2[9];
        m15940m(new long[]{j7 * j7, j13 * j14, ((j7 * j15) + (j14 * j14)) * 2, ((j7 * j16) + (j14 * j15)) * 2, (j13 * j17) + (j14 * 4 * j16) + (j15 * j15), ((j7 * j18) + (j14 * j17) + (j15 * j16)) * 2, ((j14 * 2 * j18) + (j7 * j19) + (j15 * j17) + (j16 * j16)) * 2, ((j7 * j24) + (j14 * j19) + (j15 * j18) + (j16 * j17)) * 2, (((((j16 * j18) + (j14 * j24)) * 2) + (j7 * j25) + (j15 * j19)) * 2) + (j17 * j17), ((j7 * j26) + (j14 * j25) + (j15 * j24) + (j16 * j19) + (j17 * j18)) * 2, ((((j14 * j26) + (j16 * j24)) * 2) + (j15 * j25) + (j17 * j19) + (j18 * j18)) * 2, ((j15 * j26) + (j16 * j25) + (j17 * j24) + (j18 * j19)) * 2, (((((j16 * j26) + (j18 * j24)) * 2) + (j17 * j25)) * 2) + (j19 * j19), ((j17 * j26) + (j18 * j25) + (j19 * j24)) * 2, ((j18 * 2 * j26) + (j19 * j25) + (j24 * j24)) * 2, ((j19 * j26) + (j24 * j25)) * 2, (j24 * 4 * j26) + (j25 * j25), j25 * 2 * j26, 2 * j26 * j26}, jArr);
    }

    /* JADX INFO: renamed from: s */
    public static void m15946s(long[] jArr, long[] jArr2, long[] jArr3) {
        for (int i13 = 0; i13 < 10; i13++) {
            jArr[i13] = jArr2[i13] - jArr3[i13];
        }
    }

    /* JADX INFO: renamed from: t */
    public static void m15947t(long[] jArr, long[] jArr2, long[] jArr3) {
        for (int i13 = 0; i13 < 10; i13++) {
            jArr[i13] = jArr2[i13] + jArr3[i13];
        }
    }

    /* JADX INFO: renamed from: u */
    public static void m15948u(long[] jArr, long[] jArr2, int i13) {
        int i14 = -i13;
        for (int i15 = 0; i15 < 10; i15++) {
            int i16 = (int) jArr[i15];
            int i17 = (((int) jArr2[i15]) ^ i16) & i14;
            jArr[i15] = i16 ^ i17;
            jArr2[i15] = ((int) jArr2[i15]) ^ i17;
        }
    }

    /* JADX INFO: renamed from: v */
    public static byte[] m15949v(BigInteger bigInteger) {
        if (bigInteger.signum() != -1) {
            return bigInteger.toByteArray();
        }
        throw new IllegalArgumentException("n must not be negative");
    }

    /* JADX INFO: renamed from: w */
    public static byte[] m15950w(int i13, BigInteger bigInteger) {
        if (bigInteger.signum() == -1) {
            throw new IllegalArgumentException("integer must be nonnegative");
        }
        byte[] byteArray = bigInteger.toByteArray();
        if (byteArray.length == i13) {
            return byteArray;
        }
        int i14 = i13 + 1;
        if (byteArray.length > i14) {
            throw new GeneralSecurityException("integer too large");
        }
        if (byteArray.length == i14) {
            if (byteArray[0] == 0) {
                return Arrays.copyOfRange(byteArray, 1, byteArray.length);
            }
            throw new GeneralSecurityException("integer too large");
        }
        byte[] bArr = new byte[i13];
        System.arraycopy(byteArray, 0, bArr, i13 - byteArray.length, byteArray.length);
        return bArr;
    }
}
