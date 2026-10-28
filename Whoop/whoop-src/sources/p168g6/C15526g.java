package p168g6;

import p077d0.C11349f0;

/* JADX INFO: renamed from: g6.g */
/* JADX INFO: loaded from: classes5.dex */
public final class C15526g {

    /* JADX INFO: renamed from: a */
    public double f58220a;

    /* JADX INFO: renamed from: b */
    public double f58221b;

    /* JADX INFO: renamed from: c */
    public boolean f58222c;

    /* JADX INFO: renamed from: d */
    public double f58223d;

    /* JADX INFO: renamed from: e */
    public double f58224e;

    /* JADX INFO: renamed from: f */
    public double f58225f;

    /* JADX INFO: renamed from: g */
    public double f58226g;

    /* JADX INFO: renamed from: h */
    public double f58227h;

    /* JADX INFO: renamed from: i */
    public double f58228i;

    /* JADX INFO: renamed from: j */
    public final C11349f0 f58229j;

    public C15526g() {
        this.f58220a = Math.sqrt(1500.0d);
        this.f58221b = 0.5d;
        this.f58222c = false;
        this.f58228i = Double.MAX_VALUE;
        this.f58229j = new C11349f0();
    }

    /* JADX INFO: renamed from: a */
    public final void m43711a(float f13) {
        if (f13 <= 0.0f) {
            throw new IllegalArgumentException("Spring stiffness constant must be positive.");
        }
        this.f58220a = Math.sqrt(f13);
        this.f58222c = false;
    }

    /* JADX INFO: renamed from: b */
    public final C11349f0 m43712b(double d3, double d14, long j7) {
        double dSin;
        double dCos;
        if (!this.f58222c) {
            if (this.f58228i == Double.MAX_VALUE) {
                throw new IllegalStateException("Error: Final position of the spring must be set before the animation starts");
            }
            double d15 = this.f58221b;
            if (d15 > 1.0d) {
                double d16 = this.f58220a;
                this.f58225f = (Math.sqrt((d15 * d15) - 1.0d) * d16) + ((-d15) * d16);
                double d17 = this.f58221b;
                double d18 = this.f58220a;
                this.f58226g = ((-d17) * d18) - (Math.sqrt((d17 * d17) - 1.0d) * d18);
            } else if (d15 >= 0.0d && d15 < 1.0d) {
                this.f58227h = Math.sqrt(1.0d - (d15 * d15)) * this.f58220a;
            }
            this.f58222c = true;
        }
        double d19 = j7 / 1000.0d;
        double d24 = d3 - this.f58228i;
        double d25 = this.f58221b;
        if (d25 > 1.0d) {
            double d26 = this.f58226g;
            double d27 = ((d26 * d24) - d14) / (d26 - this.f58225f);
            double d28 = d24 - d27;
            dSin = (Math.pow(2.718281828459045d, this.f58225f * d19) * d27) + (Math.pow(2.718281828459045d, d26 * d19) * d28);
            double d29 = this.f58226g;
            double dPow = Math.pow(2.718281828459045d, d29 * d19) * d28 * d29;
            double d32 = this.f58225f;
            dCos = (Math.pow(2.718281828459045d, d32 * d19) * d27 * d32) + dPow;
        } else if (d25 == 1.0d) {
            double d34 = this.f58220a;
            double d35 = (d34 * d24) + d14;
            double d36 = (d35 * d19) + d24;
            double dPow2 = Math.pow(2.718281828459045d, (-d34) * d19) * d36;
            double dPow3 = Math.pow(2.718281828459045d, (-this.f58220a) * d19) * d36;
            double d37 = -this.f58220a;
            dCos = (Math.pow(2.718281828459045d, d37 * d19) * d35) + (dPow3 * d37);
            dSin = dPow2;
        } else {
            double d38 = 1.0d / this.f58227h;
            double d39 = this.f58220a;
            double d44 = ((d25 * d39 * d24) + d14) * d38;
            dSin = ((Math.sin(this.f58227h * d19) * d44) + (Math.cos(this.f58227h * d19) * d24)) * Math.pow(2.718281828459045d, (-d25) * d39 * d19);
            double d45 = this.f58220a;
            double d46 = this.f58221b;
            double d47 = (-d45) * dSin * d46;
            double dPow4 = Math.pow(2.718281828459045d, (-d46) * d45 * d19);
            double d48 = this.f58227h;
            double dSin2 = Math.sin(d48 * d19) * (-d48) * d24;
            double d49 = this.f58227h;
            dCos = (((Math.cos(d49 * d19) * d44 * d49) + dSin2) * dPow4) + d47;
        }
        float f13 = (float) (dSin + this.f58228i);
        C11349f0 c11349f0 = this.f58229j;
        c11349f0.f36376w = f13;
        c11349f0.f36377x = (float) dCos;
        return c11349f0;
    }

    public C15526g(float f13) {
        this.f58220a = Math.sqrt(1500.0d);
        this.f58221b = 0.5d;
        this.f58222c = false;
        this.f58229j = new C11349f0();
        this.f58228i = f13;
    }
}
