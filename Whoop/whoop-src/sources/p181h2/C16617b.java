package p181h2;

import p715kotlin.jvm.internal.AbstractC22674j;

/* JADX INFO: renamed from: h2.b */
/* JADX INFO: loaded from: classes.dex */
public final class C16617b {

    /* JADX INFO: renamed from: a */
    public final long f63937a;

    /* JADX INFO: renamed from: a */
    public static long m47185a(float f13, float f14, long j7, int i13) {
        if ((i13 & 1) != 0) {
            f13 = Float.intBitsToFloat((int) (j7 >> 32));
        }
        if ((i13 & 2) != 0) {
            f14 = Float.intBitsToFloat((int) (j7 & 4294967295L));
        }
        return (((long) Float.floatToRawIntBits(f14)) & 4294967295L) | (Float.floatToRawIntBits(f13) << 32);
    }

    /* JADX INFO: renamed from: b */
    public static final long m47186b(float f13, long j7) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j7 >> 32)) / f13;
        return (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j7 & 4294967295L)) / f13)) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32);
    }

    /* JADX INFO: renamed from: c */
    public static final boolean m47187c(long j7, long j13) {
        return j7 == j13;
    }

    /* JADX INFO: renamed from: d */
    public static final float m47188d(long j7) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j7 >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j7 & 4294967295L));
        return (float) Math.sqrt((fIntBitsToFloat2 * fIntBitsToFloat2) + (fIntBitsToFloat * fIntBitsToFloat));
    }

    /* JADX INFO: renamed from: e */
    public static final float m47189e(long j7) {
        return Float.intBitsToFloat((int) (j7 >> 32));
    }

    /* JADX INFO: renamed from: f */
    public static final float m47190f(long j7) {
        return Float.intBitsToFloat((int) (j7 & 4294967295L));
    }

    /* JADX INFO: renamed from: g */
    public static final long m47191g(long j7, long j13) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j7 >> 32)) - Float.intBitsToFloat((int) (j13 >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (j7 & 4294967295L)) - Float.intBitsToFloat((int) (j13 & 4294967295L));
        return (((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat2)) & 4294967295L);
    }

    /* JADX INFO: renamed from: h */
    public static final long m47192h(long j7, long j13) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j13 >> 32)) + Float.intBitsToFloat((int) (j7 >> 32));
        return (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j13 & 4294967295L)) + Float.intBitsToFloat((int) (j7 & 4294967295L)))) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32);
    }

    /* JADX INFO: renamed from: i */
    public static final long m47193i(float f13, long j7) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j7 >> 32)) * f13;
        return (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j7 & 4294967295L)) * f13)) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32);
    }

    /* JADX INFO: renamed from: j */
    public static String m47194j(long j7) {
        if ((9223372034707292159L & j7) == 9205357640488583168L) {
            return "Offset.Unspecified";
        }
        return "Offset(" + AbstractC22674j.m65711S(Float.intBitsToFloat((int) (j7 >> 32))) + ", " + AbstractC22674j.m65711S(Float.intBitsToFloat((int) (j7 & 4294967295L))) + ')';
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C16617b) {
            return this.f63937a == ((C16617b) obj).f63937a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f63937a);
    }

    public final String toString() {
        return m47194j(this.f63937a);
    }
}
