package p636y3;

/* JADX INFO: renamed from: y3.q */
/* JADX INFO: loaded from: classes5.dex */
public final class C39185q {

    /* JADX INFO: renamed from: a */
    public final long f168431a;

    public /* synthetic */ C39185q(long j7) {
        this.f168431a = j7;
    }

    /* JADX INFO: renamed from: a */
    public static final /* synthetic */ C39185q m124810a(long j7) {
        return new C39185q(j7);
    }

    /* JADX INFO: renamed from: b */
    public static long m124811b(float f13, float f14, long j7, int i13) {
        if ((i13 & 1) != 0) {
            f13 = Float.intBitsToFloat((int) (j7 >> 32));
        }
        if ((i13 & 2) != 0) {
            f14 = Float.intBitsToFloat((int) (j7 & 4294967295L));
        }
        return (((long) Float.floatToRawIntBits(f14)) & 4294967295L) | (Float.floatToRawIntBits(f13) << 32);
    }

    /* JADX INFO: renamed from: c */
    public static final boolean m124812c(long j7) {
        return j7 == 0;
    }

    /* JADX INFO: renamed from: d */
    public static final float m124813d(long j7) {
        return Float.intBitsToFloat((int) (j7 >> 32));
    }

    /* JADX INFO: renamed from: e */
    public static final float m124814e(long j7) {
        return Float.intBitsToFloat((int) (j7 & 4294967295L));
    }

    /* JADX INFO: renamed from: f */
    public static final long m124815f(long j7, long j13) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j7 >> 32)) - Float.intBitsToFloat((int) (j13 >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j7 & 4294967295L)) - Float.intBitsToFloat((int) (j13 & 4294967295L));
        return (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) & 4294967295L);
    }

    /* JADX INFO: renamed from: g */
    public static final long m124816g(long j7, long j13) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j13 >> 32)) + Float.intBitsToFloat((int) (j7 >> 32));
        return (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j13 & 4294967295L)) + Float.intBitsToFloat((int) (j7 & 4294967295L)))) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32);
    }

    /* JADX INFO: renamed from: h */
    public static final long m124817h(float f13, long j7) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j7 >> 32)) * f13;
        return (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j7 & 4294967295L)) * f13)) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32);
    }

    /* JADX INFO: renamed from: i */
    public static String m124818i(long j7) {
        return "(" + m124813d(j7) + ", " + m124814e(j7) + ") px/sec";
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C39185q) {
            return this.f168431a == ((C39185q) obj).f168431a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f168431a);
    }

    /* JADX INFO: renamed from: j */
    public final /* synthetic */ long m124819j() {
        return this.f168431a;
    }

    public final String toString() {
        return m124818i(this.f168431a);
    }
}
