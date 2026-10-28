package p261ju;

import com.google.android.material.datepicker.C5020n;
import com.google.zxing.WriterException;

/* JADX INFO: renamed from: ju.b */
/* JADX INFO: loaded from: classes6.dex */
public abstract class AbstractC21958b {

    /* JADX INFO: renamed from: a */
    public static final int[] f84909a = {-1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 36, -1, -1, -1, 37, 38, -1, -1, -1, -1, 39, 40, -1, 41, 42, 43, 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 44, -1, -1, -1, -1, -1, -1, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, -1, -1, -1, -1, -1};

    /* JADX INFO: renamed from: b */
    public static final int[][] f84910b = {new int[]{1, 1, 1, 1, 1, 1, 1}, new int[]{1, 0, 0, 0, 0, 0, 1}, new int[]{1, 0, 1, 1, 1, 0, 1}, new int[]{1, 0, 1, 1, 1, 0, 1}, new int[]{1, 0, 1, 1, 1, 0, 1}, new int[]{1, 0, 0, 0, 0, 0, 1}, new int[]{1, 1, 1, 1, 1, 1, 1}};

    /* JADX INFO: renamed from: c */
    public static final int[][] f84911c = {new int[]{1, 1, 1, 1, 1}, new int[]{1, 0, 0, 0, 1}, new int[]{1, 0, 1, 0, 1}, new int[]{1, 0, 0, 0, 1}, new int[]{1, 1, 1, 1, 1}};

    /* JADX INFO: renamed from: d */
    public static final int[][] f84912d = {new int[]{-1, -1, -1, -1, -1, -1, -1}, new int[]{6, 18, -1, -1, -1, -1, -1}, new int[]{6, 22, -1, -1, -1, -1, -1}, new int[]{6, 26, -1, -1, -1, -1, -1}, new int[]{6, 30, -1, -1, -1, -1, -1}, new int[]{6, 34, -1, -1, -1, -1, -1}, new int[]{6, 22, 38, -1, -1, -1, -1}, new int[]{6, 24, 42, -1, -1, -1, -1}, new int[]{6, 26, 46, -1, -1, -1, -1}, new int[]{6, 28, 50, -1, -1, -1, -1}, new int[]{6, 30, 54, -1, -1, -1, -1}, new int[]{6, 32, 58, -1, -1, -1, -1}, new int[]{6, 34, 62, -1, -1, -1, -1}, new int[]{6, 26, 46, 66, -1, -1, -1}, new int[]{6, 26, 48, 70, -1, -1, -1}, new int[]{6, 26, 50, 74, -1, -1, -1}, new int[]{6, 30, 54, 78, -1, -1, -1}, new int[]{6, 30, 56, 82, -1, -1, -1}, new int[]{6, 30, 58, 86, -1, -1, -1}, new int[]{6, 34, 62, 90, -1, -1, -1}, new int[]{6, 28, 50, 72, 94, -1, -1}, new int[]{6, 26, 50, 74, 98, -1, -1}, new int[]{6, 30, 54, 78, 102, -1, -1}, new int[]{6, 28, 54, 80, 106, -1, -1}, new int[]{6, 32, 58, 84, 110, -1, -1}, new int[]{6, 30, 58, 86, 114, -1, -1}, new int[]{6, 34, 62, 90, 118, -1, -1}, new int[]{6, 26, 50, 74, 98, 122, -1}, new int[]{6, 30, 54, 78, 102, 126, -1}, new int[]{6, 26, 52, 78, 104, 130, -1}, new int[]{6, 30, 56, 82, 108, 134, -1}, new int[]{6, 34, 60, 86, 112, 138, -1}, new int[]{6, 30, 58, 86, 114, 142, -1}, new int[]{6, 34, 62, 90, 118, 146, -1}, new int[]{6, 30, 54, 78, 102, 126, 150}, new int[]{6, 24, 50, 76, 102, 128, 154}, new int[]{6, 28, 54, 80, 106, 132, 158}, new int[]{6, 32, 58, 84, 110, 136, 162}, new int[]{6, 26, 54, 82, 110, 138, 166}, new int[]{6, 30, 58, 86, 114, 142, 170}};

    /* JADX INFO: renamed from: e */
    public static final int[][] f84913e = {new int[]{8, 0}, new int[]{8, 1}, new int[]{8, 2}, new int[]{8, 3}, new int[]{8, 4}, new int[]{8, 5}, new int[]{8, 7}, new int[]{8, 8}, new int[]{7, 8}, new int[]{5, 8}, new int[]{4, 8}, new int[]{3, 8}, new int[]{2, 8}, new int[]{1, 8}, new int[]{0, 8}};

    /* JADX INFO: renamed from: a */
    public static int m62680a(C5020n c5020n, boolean z4) {
        int i13 = c5020n.f20931x;
        int i14 = c5020n.f20932y;
        int i15 = z4 ? i14 : i13;
        if (!z4) {
            i13 = i14;
        }
        byte[][] bArr = (byte[][]) c5020n.f20933z;
        int i16 = 0;
        for (int i17 = 0; i17 < i15; i17++) {
            byte b = -1;
            int i18 = 0;
            for (int i19 = 0; i19 < i13; i19++) {
                byte b6 = z4 ? bArr[i17][i19] : bArr[i19][i17];
                if (b6 == b) {
                    i18++;
                } else {
                    if (i18 >= 5) {
                        i16 += i18 - 2;
                    }
                    i18 = 1;
                    b = b6;
                }
            }
            if (i18 >= 5) {
                i16 = (i18 - 2) + i16;
            }
        }
        return i16;
    }

    /*  JADX ERROR: Types fix failed
        jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r15v17 ??, new type: boolean
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryPossibleTypes(FixTypesVisitor.java:186)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:245)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
        Caused by: java.lang.NullPointerException
        */
    /* JADX INFO: renamed from: b */
    public static void m62681b(p156fu.C14774a r29, int r30, p230iu.C20934b r31, int r32, com.google.android.material.datepicker.C5020n r33) {
        /*
            Method dump skipped, instruction units count: 720
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: p261ju.AbstractC21958b.m62681b(fu.a, int, iu.b, int, com.google.android.material.datepicker.n):void");
    }

    /* JADX INFO: renamed from: c */
    public static int m62682c(int i13, int i14) {
        if (i14 == 0) {
            throw new IllegalArgumentException("0 polynomial");
        }
        int iNumberOfLeadingZeros = Integer.numberOfLeadingZeros(i14);
        int i15 = 32 - iNumberOfLeadingZeros;
        int iNumberOfLeadingZeros2 = i13 << (31 - iNumberOfLeadingZeros);
        while (32 - Integer.numberOfLeadingZeros(iNumberOfLeadingZeros2) >= i15) {
            iNumberOfLeadingZeros2 ^= i14 << ((32 - Integer.numberOfLeadingZeros(iNumberOfLeadingZeros2)) - i15);
        }
        return iNumberOfLeadingZeros2;
    }

    /* JADX INFO: renamed from: d */
    public static void m62683d(int i13, int i14, C5020n c5020n) throws WriterException {
        for (int i15 = 0; i15 < 8; i15++) {
            int i16 = i13 + i15;
            if (!m62686g(c5020n.m15742j(i16, i14))) {
                throw new WriterException();
            }
            c5020n.m15748v(i16, i14, 0);
        }
    }

    /* JADX INFO: renamed from: e */
    public static void m62684e(int i13, int i14, C5020n c5020n) {
        for (int i15 = 0; i15 < 7; i15++) {
            int[] iArr = f84910b[i15];
            for (int i16 = 0; i16 < 7; i16++) {
                c5020n.m15748v(i13 + i16, i14 + i15, iArr[i16]);
            }
        }
    }

    /* JADX INFO: renamed from: f */
    public static void m62685f(int i13, int i14, C5020n c5020n) throws WriterException {
        for (int i15 = 0; i15 < 7; i15++) {
            int i16 = i14 + i15;
            if (!m62686g(c5020n.m15742j(i13, i16))) {
                throw new WriterException();
            }
            c5020n.m15748v(i13, i16, 0);
        }
    }

    /* JADX INFO: renamed from: g */
    public static boolean m62686g(int i13) {
        return i13 == -1;
    }
}
