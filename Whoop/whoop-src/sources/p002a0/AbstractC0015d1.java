package p002a0;

/* JADX INFO: renamed from: a0.d1 */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC0015d1 {

    /* JADX INFO: renamed from: a */
    public static final long[] f36a = {-9187201950435737345L, -1};

    static {
        new C0057v0(0);
    }

    /* JADX INFO: renamed from: a */
    public static final int m16a(int i13) {
        if (i13 == 7) {
            return 6;
        }
        return i13 - (i13 / 8);
    }

    /* JADX INFO: renamed from: b */
    public static final int m17b(int i13) {
        if (i13 == 0) {
            return 6;
        }
        return (i13 * 2) + 1;
    }

    /* JADX INFO: renamed from: c */
    public static final int m18c(int i13) {
        if (i13 > 0) {
            return (-1) >>> Integer.numberOfLeadingZeros(i13);
        }
        return 0;
    }

    /* JADX INFO: renamed from: d */
    public static final int m19d(int i13) {
        if (i13 == 7) {
            return 8;
        }
        return ((i13 - 1) / 7) + i13;
    }
}
