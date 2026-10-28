package p571w3;

import p000.AbstractC30802r;

/* JADX INFO: renamed from: w3.p */
/* JADX INFO: loaded from: classes.dex */
public final class C36780p {

    /* JADX INFO: renamed from: c */
    public static final C36780p f157357c = new C36780p(1.0f, 0.0f);

    /* JADX INFO: renamed from: a */
    public final float f157358a;

    /* JADX INFO: renamed from: b */
    public final float f157359b;

    public C36780p(float f13, float f14) {
        this.f157358a = f13;
        this.f157359b = f14;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C36780p)) {
            return false;
        }
        C36780p c36780p = (C36780p) obj;
        return this.f157358a == c36780p.f157358a && this.f157359b == c36780p.f157359b;
    }

    public final int hashCode() {
        return Float.hashCode(this.f157359b) + (Float.hashCode(this.f157358a) * 31);
    }

    public final String toString() {
        StringBuilder sb4 = new StringBuilder("TextGeometricTransform(scaleX=");
        sb4.append(this.f157358a);
        sb4.append(", skewX=");
        return AbstractC30802r.m94763l(sb4, this.f157359b, ')');
    }
}
