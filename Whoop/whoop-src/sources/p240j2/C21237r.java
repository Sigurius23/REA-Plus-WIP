package p240j2;

import hc3.AbstractC17176i;

/* JADX INFO: renamed from: j2.r */
/* JADX INFO: loaded from: classes.dex */
public final class C21237r {

    /* JADX INFO: renamed from: a */
    public final double f81085a;

    /* JADX INFO: renamed from: b */
    public final double f81086b;

    /* JADX INFO: renamed from: c */
    public final double f81087c;

    /* JADX INFO: renamed from: d */
    public final double f81088d;

    /* JADX INFO: renamed from: e */
    public final double f81089e;

    /* JADX INFO: renamed from: f */
    public final double f81090f;

    /* JADX INFO: renamed from: g */
    public final double f81091g;

    public /* synthetic */ C21237r(double d3, double d14, double d15, double d16, double d17) {
        this(d3, d14, d15, d16, d17, 0.0d, 0.0d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C21237r)) {
            return false;
        }
        C21237r c21237r = (C21237r) obj;
        return Double.compare(this.f81085a, c21237r.f81085a) == 0 && Double.compare(this.f81086b, c21237r.f81086b) == 0 && Double.compare(this.f81087c, c21237r.f81087c) == 0 && Double.compare(this.f81088d, c21237r.f81088d) == 0 && Double.compare(this.f81089e, c21237r.f81089e) == 0 && Double.compare(this.f81090f, c21237r.f81090f) == 0 && Double.compare(this.f81091g, c21237r.f81091g) == 0;
    }

    public final int hashCode() {
        return Double.hashCode(this.f81091g) + AbstractC17176i.m48499a(AbstractC17176i.m48499a(AbstractC17176i.m48499a(AbstractC17176i.m48499a(AbstractC17176i.m48499a(Double.hashCode(this.f81085a) * 31, 31, this.f81086b), 31, this.f81087c), 31, this.f81088d), 31, this.f81089e), 31, this.f81090f);
    }

    public final String toString() {
        return "TransferParameters(gamma=" + this.f81085a + ", a=" + this.f81086b + ", b=" + this.f81087c + ", c=" + this.f81088d + ", d=" + this.f81089e + ", e=" + this.f81090f + ", f=" + this.f81091g + ')';
    }

    public C21237r(double d3, double d14, double d15, double d16, double d17, double d18, double d19) {
        this.f81085a = d3;
        this.f81086b = d14;
        this.f81087c = d15;
        this.f81088d = d16;
        this.f81089e = d17;
        this.f81090f = d18;
        this.f81091g = d19;
        if (Double.isNaN(d14) || Double.isNaN(d15) || Double.isNaN(d16) || Double.isNaN(d17) || Double.isNaN(d18) || Double.isNaN(d19) || Double.isNaN(d3)) {
            throw new IllegalArgumentException("Parameters cannot be NaN");
        }
        if (d3 == -2.0d || d3 == -3.0d) {
            return;
        }
        if (d17 < 0.0d || d17 > 1.0d) {
            throw new IllegalArgumentException("Parameter d must be in the range [0..1], was " + d17);
        }
        if (d17 == 0.0d && (d14 == 0.0d || d3 == 0.0d)) {
            throw new IllegalArgumentException("Parameter a or g is zero, the transfer function is constant");
        }
        if (d17 >= 1.0d && d16 == 0.0d) {
            throw new IllegalArgumentException("Parameter c is zero, the transfer function is constant");
        }
        if ((d14 == 0.0d || d3 == 0.0d) && d16 == 0.0d) {
            throw new IllegalArgumentException("Parameter a or g is zero, and c is zero, the transfer function is constant");
        }
        if (d16 < 0.0d) {
            throw new IllegalArgumentException("The transfer function must be increasing");
        }
        if (d14 < 0.0d || d3 < 0.0d) {
            throw new IllegalArgumentException("The transfer function must be positive or increasing");
        }
    }
}
