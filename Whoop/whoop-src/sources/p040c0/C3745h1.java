package p040c0;

import p000.AbstractC11266d;
import p031b9.AbstractC2875y;

/* JADX INFO: renamed from: c0.h1 */
/* JADX INFO: loaded from: classes5.dex */
public final class C3745h1 {

    /* JADX INFO: renamed from: a */
    public final float f15317a;

    /* JADX INFO: renamed from: b */
    public final float f15318b;

    /* JADX INFO: renamed from: c */
    public final long f15319c;

    public C3745h1(float f13, long j7, float f14) {
        this.f15317a = f13;
        this.f15318b = f14;
        this.f15319c = j7;
    }

    /* JADX INFO: renamed from: a */
    public final float m11564a(long j7) {
        long j13 = this.f15319c;
        return Math.signum(this.f15317a) * this.f15318b * AbstractC3725b.m11560b(j13 > 0 ? j7 / j13 : 1.0f).f15201a;
    }

    /* JADX INFO: renamed from: b */
    public final float m11565b(long j7) {
        long j13 = this.f15319c;
        return (((Math.signum(this.f15317a) * AbstractC3725b.m11560b(j13 > 0 ? j7 / j13 : 1.0f).f15202b) * this.f15318b) / j13) * 1000.0f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3745h1)) {
            return false;
        }
        C3745h1 c3745h1 = (C3745h1) obj;
        return Float.compare(this.f15317a, c3745h1.f15317a) == 0 && Float.compare(this.f15318b, c3745h1.f15318b) == 0 && this.f15319c == c3745h1.f15319c;
    }

    public final int hashCode() {
        return Long.hashCode(this.f15319c) + AbstractC11266d.m30447a(this.f15318b, Float.hashCode(this.f15317a) * 31, 31);
    }

    public final String toString() {
        StringBuilder sb4 = new StringBuilder("FlingInfo(initialVelocity=");
        sb4.append(this.f15317a);
        sb4.append(", distance=");
        sb4.append(this.f15318b);
        sb4.append(", duration=");
        return AbstractC2875y.m8302o(sb4, this.f15319c, ')');
    }
}
