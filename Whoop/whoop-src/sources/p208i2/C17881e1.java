package p208i2;

/* JADX INFO: renamed from: i2.e1 */
/* JADX INFO: loaded from: classes.dex */
public final class C17881e1 {

    /* JADX INFO: renamed from: b */
    public static final long f69566b = AbstractC17918w0.m51524l(0.5f, 0.5f);

    /* JADX INFO: renamed from: c */
    public static final /* synthetic */ int f69567c = 0;

    /* JADX INFO: renamed from: a */
    public final long f69568a;

    /* JADX INFO: renamed from: a */
    public static final boolean m51436a(long j7, long j13) {
        return j7 == j13;
    }

    /* JADX INFO: renamed from: b */
    public static final float m51437b(long j7) {
        return Float.intBitsToFloat((int) (j7 >> 32));
    }

    /* JADX INFO: renamed from: c */
    public static final float m51438c(long j7) {
        return Float.intBitsToFloat((int) (j7 & 4294967295L));
    }

    /* JADX INFO: renamed from: d */
    public static String m51439d(long j7) {
        return "TransformOrigin(packedValue=" + j7 + ')';
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C17881e1) {
            return this.f69568a == ((C17881e1) obj).f69568a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f69568a);
    }

    public final String toString() {
        return m51439d(this.f69568a);
    }
}
