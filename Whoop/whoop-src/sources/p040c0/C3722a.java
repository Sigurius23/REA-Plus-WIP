package p040c0;

import p000.AbstractC30802r;

/* JADX INFO: renamed from: c0.a */
/* JADX INFO: loaded from: classes5.dex */
public final class C3722a {

    /* JADX INFO: renamed from: a */
    public final float f15201a;

    /* JADX INFO: renamed from: b */
    public final float f15202b;

    public C3722a(float f13, float f14) {
        this.f15201a = f13;
        this.f15202b = f14;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3722a)) {
            return false;
        }
        C3722a c3722a = (C3722a) obj;
        return Float.compare(this.f15201a, c3722a.f15201a) == 0 && Float.compare(this.f15202b, c3722a.f15202b) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f15202b) + (Float.hashCode(this.f15201a) * 31);
    }

    public final String toString() {
        StringBuilder sb4 = new StringBuilder("FlingResult(distanceCoefficient=");
        sb4.append(this.f15201a);
        sb4.append(", velocityCoefficient=");
        return AbstractC30802r.m94763l(sb4, this.f15202b, ')');
    }
}
