package p181h2;

import p715kotlin.jvm.internal.AbstractC22674j;

/* JADX INFO: renamed from: h2.e */
/* JADX INFO: loaded from: classes.dex */
public final class C16620e {

    /* JADX INFO: renamed from: a */
    public final long f63951a;

    public /* synthetic */ C16620e(long j7) {
        this.f63951a = j7;
    }

    /* JADX INFO: renamed from: a */
    public static long m47209a(float f13, float f14, long j7, int i13) {
        if ((i13 & 1) != 0) {
            f13 = Float.intBitsToFloat((int) (j7 >> 32));
        }
        if ((i13 & 2) != 0) {
            f14 = Float.intBitsToFloat((int) (j7 & 4294967295L));
        }
        return (((long) Float.floatToRawIntBits(f14)) & 4294967295L) | (Float.floatToRawIntBits(f13) << 32);
    }

    /* JADX INFO: renamed from: b */
    public static final boolean m47210b(long j7, long j13) {
        return j7 == j13;
    }

    /* JADX INFO: renamed from: c */
    public static final float m47211c(long j7) {
        return Float.intBitsToFloat((int) (j7 & 4294967295L));
    }

    /* JADX INFO: renamed from: d */
    public static final float m47212d(long j7) {
        return Math.min(Float.intBitsToFloat((int) ((j7 >> 32) & 2147483647L)), Float.intBitsToFloat((int) (j7 & 2147483647L)));
    }

    /* JADX INFO: renamed from: e */
    public static final float m47213e(long j7) {
        return Float.intBitsToFloat((int) (j7 >> 32));
    }

    /* JADX INFO: renamed from: f */
    public static final boolean m47214f(long j7) {
        return (j7 == 9205357640488583168L) | (Float.intBitsToFloat((int) (j7 >> 32)) <= 0.0f) | (Float.intBitsToFloat((int) (j7 & 4294967295L)) <= 0.0f);
    }

    /* JADX INFO: renamed from: g */
    public static final long m47215g(float f13, long j7) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j7 >> 32)) * f13;
        return (((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (j7 & 4294967295L)) * f13)) & 4294967295L) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32);
    }

    /* JADX INFO: renamed from: h */
    public static String m47216h(long j7) {
        if (j7 == 9205357640488583168L) {
            return "Size.Unspecified";
        }
        return "Size(" + AbstractC22674j.m65711S(Float.intBitsToFloat((int) (j7 >> 32))) + ", " + AbstractC22674j.m65711S(Float.intBitsToFloat((int) (j7 & 4294967295L))) + ')';
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C16620e) {
            return this.f63951a == ((C16620e) obj).f63951a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f63951a);
    }

    public final String toString() {
        return m47216h(this.f63951a);
    }
}
