package p240j2;

import p000.AbstractC30802r;

/* JADX INFO: renamed from: j2.s */
/* JADX INFO: loaded from: classes.dex */
public final class C21238s {

    /* JADX INFO: renamed from: a */
    public final float f81092a;

    /* JADX INFO: renamed from: b */
    public final float f81093b;

    public C21238s(float f13, float f14) {
        this.f81092a = f13;
        this.f81093b = f14;
    }

    /* JADX INFO: renamed from: a */
    public final float[] m59561a() {
        float f13 = this.f81092a;
        float f14 = this.f81093b;
        return new float[]{f13 / f14, 1.0f, ((1.0f - f13) - f14) / f14};
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C21238s)) {
            return false;
        }
        C21238s c21238s = (C21238s) obj;
        return Float.compare(this.f81092a, c21238s.f81092a) == 0 && Float.compare(this.f81093b, c21238s.f81093b) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.f81093b) + (Float.hashCode(this.f81092a) * 31);
    }

    public final String toString() {
        StringBuilder sb4 = new StringBuilder("WhitePoint(x=");
        sb4.append(this.f81092a);
        sb4.append(", y=");
        return AbstractC30802r.m94763l(sb4, this.f81093b, ')');
    }
}
