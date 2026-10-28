package p314m;

/* JADX INFO: renamed from: m.j0 */
/* JADX INFO: loaded from: classes5.dex */
public final class C24847j0 {

    /* JADX INFO: renamed from: d */
    public static C24847j0 f97335d;

    /* JADX INFO: renamed from: a */
    public long f97336a;

    /* JADX INFO: renamed from: b */
    public long f97337b;

    /* JADX INFO: renamed from: c */
    public int f97338c;

    /* JADX INFO: renamed from: a */
    public final void m72854a(double d3, double d14, long j7) {
        float f13 = (j7 - 946728000000L) / 8.64E7f;
        float f14 = (0.01720197f * f13) + 6.24006f;
        double d15 = f14;
        double dSin = (Math.sin(f14 * 3.0f) * 5.236000106378924E-6d) + (Math.sin(2.0f * f14) * 3.4906598739326E-4d) + (Math.sin(d15) * 0.03341960161924362d) + d15 + 1.796593063d + 3.141592653589793d;
        double d16 = (-d14) / 360.0d;
        double dSin2 = (Math.sin(2.0d * dSin) * (-0.0069d)) + (Math.sin(d15) * 0.0053d) + ((double) (Math.round(((double) (f13 - 9.0E-4f)) - d16) + 9.0E-4f)) + d16;
        double dAsin = Math.asin(Math.sin(0.4092797040939331d) * Math.sin(dSin));
        double d17 = 0.01745329238474369d * d3;
        double dSin3 = (Math.sin(-0.10471975803375244d) - (Math.sin(dAsin) * Math.sin(d17))) / (Math.cos(dAsin) * Math.cos(d17));
        if (dSin3 >= 1.0d) {
            this.f97338c = 1;
            this.f97336a = -1L;
            this.f97337b = -1L;
        } else {
            if (dSin3 <= -1.0d) {
                this.f97338c = 0;
                this.f97336a = -1L;
                this.f97337b = -1L;
                return;
            }
            double dAcos = (float) (Math.acos(dSin3) / 6.283185307179586d);
            this.f97336a = Math.round((dSin2 + dAcos) * 8.64E7d) + 946728000000L;
            long jRound = Math.round((dSin2 - dAcos) * 8.64E7d) + 946728000000L;
            this.f97337b = jRound;
            if (jRound >= j7 || this.f97336a <= j7) {
                this.f97338c = 1;
            } else {
                this.f97338c = 0;
            }
        }
    }
}
