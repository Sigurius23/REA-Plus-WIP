package p024b0;

import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: b0.a */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC2177a {

    /* JADX INFO: renamed from: a */
    public static final int[] f8657a = new int[0];

    /* JADX INFO: renamed from: b */
    public static final long[] f8658b = new long[0];

    /* JADX INFO: renamed from: c */
    public static final Object[] f8659c = new Object[0];

    /* JADX INFO: renamed from: a */
    public static final int m6853a(int i13, int i14, int[] array) {
        AbstractC22676k.m65750j(array, "array");
        int i15 = i13 - 1;
        int i16 = 0;
        while (i16 <= i15) {
            int i17 = (i16 + i15) >>> 1;
            int i18 = array[i17];
            if (i18 < i14) {
                i16 = i17 + 1;
            } else {
                if (i18 <= i14) {
                    return i17;
                }
                i15 = i17 - 1;
            }
        }
        return ~i16;
    }

    /* JADX INFO: renamed from: b */
    public static final int m6854b(long[] array, int i13, long j7) {
        AbstractC22676k.m65750j(array, "array");
        int i14 = i13 - 1;
        int i15 = 0;
        while (i15 <= i14) {
            int i16 = (i15 + i14) >>> 1;
            long j13 = array[i16];
            if (j13 < j7) {
                i15 = i16 + 1;
            } else {
                if (j13 <= j7) {
                    return i16;
                }
                i14 = i16 - 1;
            }
        }
        return ~i15;
    }
}
