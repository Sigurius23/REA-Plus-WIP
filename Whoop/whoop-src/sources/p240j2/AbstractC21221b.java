package p240j2;

/* JADX INFO: renamed from: j2.b */
/* JADX INFO: loaded from: classes.dex */
public abstract class AbstractC21221b {

    /* JADX INFO: renamed from: a */
    public static final long f81011a;

    /* JADX INFO: renamed from: b */
    public static final long f81012b;

    /* JADX INFO: renamed from: c */
    public static final long f81013c;

    /* JADX INFO: renamed from: d */
    public static final long f81014d;

    /* JADX INFO: renamed from: e */
    public static final /* synthetic */ int f81015e = 0;

    static {
        long j7 = 3;
        long j13 = j7 << 32;
        f81011a = (((long) 0) & 4294967295L) | j13;
        f81012b = (((long) 1) & 4294967295L) | j13;
        f81013c = j13 | (((long) 2) & 4294967295L);
        f81014d = (j7 & 4294967295L) | (((long) 4) << 32);
    }

    /* JADX INFO: renamed from: a */
    public static final boolean m59540a(long j7, long j13) {
        return j7 == j13;
    }

    /* JADX INFO: renamed from: b */
    public static String m59541b(long j7) {
        if (m59540a(j7, f81011a)) {
            return "Rgb";
        }
        if (m59540a(j7, f81012b)) {
            return "Xyz";
        }
        if (m59540a(j7, f81013c)) {
            return "Lab";
        }
        return m59540a(j7, f81014d) ? "Cmyk" : "Unknown";
    }
}
