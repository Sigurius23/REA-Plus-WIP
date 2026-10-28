package io.sentry.util;

import java.util.Arrays;

/* JADX INFO: renamed from: io.sentry.util.n */
/* JADX INFO: loaded from: classes5.dex */
public abstract class AbstractC20592n {

    /* JADX INFO: renamed from: a */
    public static final char[] f77099a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    static {
        long[] jArr = new long[128];
        Arrays.fill(jArr, -1L);
        jArr[48] = 0;
        jArr[49] = 1;
        jArr[50] = 2;
        jArr[51] = 3;
        jArr[52] = 4;
        jArr[53] = 5;
        jArr[54] = 6;
        jArr[55] = 7;
        jArr[56] = 8;
        jArr[57] = 9;
        jArr[97] = 10;
        jArr[98] = 11;
        jArr[99] = 12;
        jArr[100] = 13;
        jArr[101] = 14;
        jArr[102] = 15;
        jArr[65] = 10;
        jArr[66] = 11;
        jArr[67] = 12;
        jArr[68] = 13;
        jArr[69] = 14;
        jArr[70] = 15;
    }

    /* JADX INFO: renamed from: a */
    public static void m56727a(char[] cArr, long j7) {
        char[] cArr2 = f77099a;
        cArr[0] = cArr2[(int) (((-1152921504606846976L) & j7) >>> 60)];
        cArr[1] = cArr2[(int) ((1080863910568919040L & j7) >>> 56)];
        cArr[2] = cArr2[(int) ((67553994410557440L & j7) >>> 52)];
        cArr[3] = cArr2[(int) ((4222124650659840L & j7) >>> 48)];
        cArr[4] = cArr2[(int) ((263882790666240L & j7) >>> 44)];
        cArr[5] = cArr2[(int) ((16492674416640L & j7) >>> 40)];
        cArr[6] = cArr2[(int) ((1030792151040L & j7) >>> 36)];
        cArr[7] = cArr2[(int) ((64424509440L & j7) >>> 32)];
        cArr[8] = cArr2[(int) ((4026531840L & j7) >>> 28)];
        cArr[9] = cArr2[(int) ((251658240 & j7) >>> 24)];
        cArr[10] = cArr2[(int) ((15728640 & j7) >>> 20)];
        cArr[11] = cArr2[(int) ((983040 & j7) >>> 16)];
        cArr[12] = cArr2[(int) ((61440 & j7) >>> 12)];
        cArr[13] = cArr2[(int) ((3840 & j7) >>> 8)];
        cArr[14] = cArr2[(int) ((240 & j7) >>> 4)];
        cArr[15] = cArr2[(int) (j7 & 15)];
    }
}
