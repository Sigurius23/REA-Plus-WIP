package p636y3;

/* JADX INFO: renamed from: y3.h */
/* JADX INFO: loaded from: classes.dex */
public final class C39176h {

    /* JADX INFO: renamed from: a */
    public final long f168415a;

    /* JADX INFO: renamed from: a */
    public static final boolean m124785a(long j7, long j13) {
        return j7 == j13;
    }

    /* JADX INFO: renamed from: b */
    public static final float m124786b(long j7) {
        return Float.intBitsToFloat((int) (j7 & 4294967295L));
    }

    /* JADX INFO: renamed from: c */
    public static final float m124787c(long j7) {
        return Float.intBitsToFloat((int) (j7 >> 32));
    }

    /* JADX INFO: renamed from: d */
    public static String m124788d(long j7) {
        if (j7 == 9205357640488583168L) {
            return "DpSize.Unspecified";
        }
        return ((Object) C39174f.m124783c(m124787c(j7))) + " x " + ((Object) C39174f.m124783c(m124786b(j7)));
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C39176h) {
            return this.f168415a == ((C39176h) obj).f168415a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f168415a);
    }

    public final String toString() {
        return m124788d(this.f168415a);
    }
}
