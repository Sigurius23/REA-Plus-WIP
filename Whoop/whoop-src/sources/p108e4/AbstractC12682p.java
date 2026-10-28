package p108e4;

/* JADX INFO: renamed from: e4.p */
/* JADX INFO: loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC12682p {

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ int[] f43366a = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34, 35, 36, 37};

    /* JADX INFO: renamed from: a */
    public static /* synthetic */ Integer m35481a(int i13) {
        if (i13 == 0) {
            return null;
        }
        return Integer.valueOf(i13 - 1);
    }

    /* JADX INFO: renamed from: b */
    public static /* synthetic */ int m35482b(int i13, int i14) {
        if (i13 == 0 || i14 == 0) {
            throw null;
        }
        return i13 - i14;
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ boolean m35483c(int i13, int i14) {
        if (i13 != 0) {
            return i13 == i14;
        }
        throw null;
    }

    /* JADX INFO: renamed from: d */
    public static StringBuilder m35484d(String str, String str2) {
        StringBuilder sb4 = new StringBuilder();
        sb4.append(str);
        sb4.append(str2);
        return sb4;
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ int m35485e(int i13) {
        if (i13 != 0) {
            return i13 - 1;
        }
        throw null;
    }

    /* JADX INFO: renamed from: f */
    public static /* synthetic */ int[] m35486f(int i13) {
        int[] iArr = new int[i13];
        System.arraycopy(f43366a, 0, iArr, 0, i13);
        return iArr;
    }
}
