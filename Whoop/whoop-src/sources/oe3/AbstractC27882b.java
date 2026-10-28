package oe3;

import live.hms.video.utils.HMSConstantsKt;
import ne3.AbstractC26604b;
import ne3.C26616h;
import ne3.C26621j0;
import ne3.C26624l;
import ne3.C26627m0;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: oe3.b */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC27882b {

    /* JADX INFO: renamed from: a */
    public static final char[] f112427a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    /* JADX INFO: renamed from: b */
    public static final byte[] f112428b = new byte[0];

    /* JADX INFO: renamed from: a */
    public static final int m84151a(char c3) {
        if ('0' <= c3 && c3 < ':') {
            return c3 - '0';
        }
        if ('a' <= c3 && c3 < 'g') {
            return c3 - 'W';
        }
        if ('A' <= c3 && c3 < 'G') {
            return c3 - '7';
        }
        throw new IllegalArgumentException("Unexpected hex digit: " + c3);
    }

    /* JADX INFO: renamed from: b */
    public static final long m84152b(C26621j0 c26621j0, C26624l bytes, int i13, long j7, long j13) {
        long j14;
        C26616h c26616h = c26621j0.f105872x;
        AbstractC22676k.m65750j(bytes, "bytes");
        long j15 = i13;
        AbstractC26604b.m79160e(bytes.mo79253d(), 0, j15);
        if (c26621j0.f105873y) {
            throw new IllegalStateException("closed");
        }
        int i14 = i13;
        long jMax = j7;
        while (true) {
            long jM84147a = AbstractC27881a.m84147a(c26616h, bytes, jMax, j13, i14);
            long j16 = -1;
            if (jM84147a != -1) {
                return jM84147a;
            }
            long j17 = c26616h.f105866x;
            long j18 = (j17 - j15) + 1;
            if (j18 < j13) {
                if (j17 < j13) {
                    j14 = -1;
                } else {
                    int iMax = (int) Math.max(1L, (j17 - j13) + 1);
                    int iMin = ((int) Math.min(j15, (c26616h.f105866x - jMax) + 1)) - 1;
                    if (iMax <= iMin) {
                        while (true) {
                            j14 = j16;
                            if (c26616h.m79195T(iMin, c26616h.f105866x - ((long) iMin), bytes)) {
                                break;
                            }
                            if (iMin == iMax) {
                                return j14;
                            }
                            iMin--;
                            j16 = j14;
                        }
                    }
                }
                if (c26621j0.f105871w.mo9164h1(c26616h, HMSConstantsKt.SPEEDTEST_DOWNLOAD_CHUNK_SIZE) == j14) {
                    return j14;
                }
                jMax = Math.max(jMax, j18);
                i14 = i13;
            }
            return -1L;
        }
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0026 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:12:0x0027  */
    /* JADX INFO: renamed from: c */
    public static final int m84153c(C26627m0 c26627m0, int i13) {
        int i14;
        int[] iArr = c26627m0.f105893G;
        int i15 = i13 + 1;
        int length = c26627m0.f105892F.length;
        AbstractC22676k.m65750j(iArr, "<this>");
        int i16 = length - 1;
        int i17 = 0;
        while (i17 <= i16) {
            i14 = (i17 + i16) >>> 1;
            int i18 = iArr[i14];
            if (i18 < i15) {
                i17 = i14 + 1;
            } else {
                if (i18 <= i15) {
                    if (i14 >= 0) {
                        return i14;
                    }
                    return ~i14;
                }
                i16 = i14 - 1;
            }
        }
        i14 = (-i17) - 1;
        if (i14 >= 0) {
            return i14;
        }
        return ~i14;
    }
}
