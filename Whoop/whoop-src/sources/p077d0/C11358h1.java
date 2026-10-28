package p077d0;

/* JADX INFO: renamed from: d0.h1 */
/* JADX INFO: loaded from: classes.dex */
public final class C11358h1 {

    /* JADX INFO: renamed from: a */
    public float f36408a;

    /* JADX INFO: renamed from: b */
    public double f36409b;

    /* JADX INFO: renamed from: c */
    public float f36410c;

    /* JADX INFO: renamed from: a */
    public final long m30598a(float f13, long j7, float f14) {
        double dSin;
        double dCos;
        double dExp;
        double dExp2;
        float f15 = f13 - this.f36408a;
        double d3 = j7 / 1000.0d;
        float f16 = this.f36410c;
        double d14 = ((double) f16) * ((double) f16);
        double d15 = this.f36409b;
        double d16 = ((double) (-f16)) * d15;
        if (f16 <= 1.0f) {
            if (f16 == 1.0f) {
                double d17 = f15;
                double d18 = (d15 * d17) + ((double) f14);
                double d19 = (-d15) * d3;
                double d24 = (d3 * d18) + d17;
                dSin = Math.exp(d19) * d24;
                dExp = Math.exp(d19) * d24 * (-this.f36409b);
                dExp2 = Math.exp(d19) * d18;
            } else {
                double d25 = 1;
                double dSqrt = Math.sqrt(d25 - d14) * d15;
                double d26 = f15;
                double d27 = (((-d16) * d26) + ((double) f14)) * (d25 / dSqrt);
                double d28 = dSqrt * d3;
                double d29 = d3 * d16;
                dSin = ((Math.sin(d28) * d27) + (Math.cos(d28) * d26)) * Math.exp(d29);
                dCos = (((Math.cos(d28) * dSqrt * d27) + (Math.sin(d28) * (-dSqrt) * d26)) * Math.exp(d29)) + (d16 * dSin);
            }
            return (((long) Float.floatToRawIntBits((float) dCos)) & 4294967295L) | (Float.floatToRawIntBits((float) (dSin + ((double) this.f36408a))) << 32);
        }
        double dSqrt2 = Math.sqrt(d14 - ((double) 1)) * d15;
        double d32 = d16 + dSqrt2;
        double d34 = d16 - dSqrt2;
        double d35 = f15;
        double d36 = ((d34 * d35) - ((double) f14)) / (d34 - d32);
        double d37 = d35 - d36;
        double d38 = d34 * d3;
        double d39 = d3 * d32;
        dSin = (Math.exp(d39) * d36) + (Math.exp(d38) * d37);
        dExp = Math.exp(d38) * d37 * d34;
        dExp2 = Math.exp(d39) * d36 * d32;
        dCos = dExp2 + dExp;
        return (((long) Float.floatToRawIntBits((float) dCos)) & 4294967295L) | (Float.floatToRawIntBits((float) (dSin + ((double) this.f36408a))) << 32);
    }
}
