package p636y3;

/* JADX INFO: renamed from: y3.g */
/* JADX INFO: loaded from: classes.dex */
public final class C39175g {

    /* JADX INFO: renamed from: a */
    public final long f168414a;

    /* JADX INFO: renamed from: a */
    public static String m124784a(long j7) {
        if (j7 == 9205357640488583168L) {
            return "DpOffset.Unspecified";
        }
        return "(" + ((Object) C39174f.m124783c(Float.intBitsToFloat((int) (j7 >> 32)))) + ", " + ((Object) C39174f.m124783c(Float.intBitsToFloat((int) (j7 & 4294967295L)))) + ')';
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C39175g) {
            return this.f168414a == ((C39175g) obj).f168414a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f168414a);
    }

    public final String toString() {
        return m124784a(this.f168414a);
    }
}
