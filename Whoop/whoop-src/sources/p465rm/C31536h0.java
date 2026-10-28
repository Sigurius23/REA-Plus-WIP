package p465rm;

import p141f9.C14278t;

/* JADX INFO: renamed from: rm.h0 */
/* JADX INFO: loaded from: classes6.dex */
public final class C31536h0 implements InterfaceC31529f {

    /* JADX INFO: renamed from: F */
    public static final C31536h0 f130161F = new C31536h0(-9223372036854775807L, -9223372036854775807L, -9223372036854775807L, -3.4028235E38f, -3.4028235E38f);

    /* JADX INFO: renamed from: E */
    public final float f130162E;

    /* JADX INFO: renamed from: w */
    public final long f130163w;

    /* JADX INFO: renamed from: x */
    public final long f130164x;

    /* JADX INFO: renamed from: y */
    public final long f130165y;

    /* JADX INFO: renamed from: z */
    public final float f130166z;

    public C31536h0(long j7, long j13, long j14, float f13, float f14) {
        this.f130163w = j7;
        this.f130164x = j13;
        this.f130165y = j14;
        this.f130166z = f13;
        this.f130162E = f14;
    }

    /* JADX INFO: renamed from: a */
    public final C14278t m97142a() {
        C14278t c14278t = new C14278t();
        c14278t.f52132a = this.f130163w;
        c14278t.f52133b = this.f130164x;
        c14278t.f52134c = this.f130165y;
        c14278t.f52135d = this.f130166z;
        c14278t.f52136e = this.f130162E;
        return c14278t;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C31536h0)) {
            return false;
        }
        C31536h0 c31536h0 = (C31536h0) obj;
        return this.f130163w == c31536h0.f130163w && this.f130164x == c31536h0.f130164x && this.f130165y == c31536h0.f130165y && this.f130166z == c31536h0.f130166z && this.f130162E == c31536h0.f130162E;
    }

    public final int hashCode() {
        long j7 = this.f130163w;
        long j13 = this.f130164x;
        int i13 = ((((int) (j7 ^ (j7 >>> 32))) * 31) + ((int) (j13 ^ (j13 >>> 32)))) * 31;
        long j14 = this.f130165y;
        int i14 = (i13 + ((int) ((j14 >>> 32) ^ j14))) * 31;
        float f13 = this.f130166z;
        int iFloatToIntBits = (i14 + (f13 != 0.0f ? Float.floatToIntBits(f13) : 0)) * 31;
        float f14 = this.f130162E;
        return iFloatToIntBits + (f14 != 0.0f ? Float.floatToIntBits(f14) : 0);
    }
}
