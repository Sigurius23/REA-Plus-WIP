package p077d0;

/* JADX INFO: renamed from: d0.g0 */
/* JADX INFO: loaded from: classes.dex */
public final class C11353g0 implements InterfaceC11341d0 {

    /* JADX INFO: renamed from: a */
    public final float f36401a;

    /* JADX INFO: renamed from: b */
    public final C11358h1 f36402b;

    public C11353g0(float f13, float f14, float f15) {
        this.f36401a = f15;
        C11358h1 c11358h1 = new C11358h1();
        c11358h1.f36408a = 1.0f;
        c11358h1.f36409b = Math.sqrt(50.0d);
        c11358h1.f36410c = 1.0f;
        if (f13 < 0.0f) {
            AbstractC11405u0.m30638a("Damping ratio must be non-negative");
        }
        c11358h1.f36410c = f13;
        double d3 = c11358h1.f36409b;
        if (((float) (d3 * d3)) <= 0.0f) {
            AbstractC11405u0.m30638a("Spring stiffness constant must be positive.");
        }
        c11358h1.f36409b = Math.sqrt(f14);
        this.f36402b = c11358h1;
    }

    @Override // p077d0.InterfaceC11341d0
    /* JADX INFO: renamed from: b */
    public final float mo30535b(float f13, float f14, float f15, long j7) {
        C11358h1 c11358h1 = this.f36402b;
        c11358h1.f36408a = f14;
        return Float.intBitsToFloat((int) (c11358h1.m30598a(f13, j7 / 1000000, f15) & 4294967295L));
    }

    @Override // p077d0.InterfaceC11341d0
    /* JADX INFO: renamed from: c */
    public final float mo30536c(float f13, float f14, float f15) {
        return 0.0f;
    }

    /* JADX WARN: Code duplicated, block: B:43:0x0100  */
    @Override // p077d0.InterfaceC11341d0
    /* JADX INFO: renamed from: d */
    public final long mo30537d(float f13, float f14, float f15) {
        double dLog;
        long j7;
        C11358h1 c11358h1 = this.f36402b;
        double d3 = c11358h1.f36409b;
        float f16 = (float) (d3 * d3);
        float f17 = c11358h1.f36410c;
        float f18 = this.f36401a;
        float f19 = (f13 - f14) / f18;
        float f24 = f15 / f18;
        if (f17 == 0.0f) {
            j7 = 9223372036854L;
        } else {
            double d14 = f16;
            double d15 = f17;
            double d16 = f24;
            double d17 = f19;
            double d18 = 1.0f;
            double dSqrt = d15 * 2.0d * Math.sqrt(d14);
            double d19 = (dSqrt * dSqrt) - (d14 * 4.0d);
            double dSqrt2 = d19 < 0.0d ? 0.0d : Math.sqrt(d19);
            double d24 = -dSqrt;
            double d25 = (d24 + dSqrt2) * 0.5d;
            double dSqrt3 = (d19 < 0.0d ? Math.sqrt(Math.abs(d19)) : 0.0d) * 0.5d;
            double d26 = (d24 - dSqrt2) * 0.5d;
            if (d17 == 0.0d && d16 == 0.0d) {
                j7 = 0;
            } else {
                if (d17 < 0.0d) {
                    d16 = -d16;
                }
                double dAbs = Math.abs(d17);
                double dAbs2 = Double.MAX_VALUE;
                if (d15 > 1.0d) {
                    double d27 = (d25 * dAbs) - d16;
                    double d28 = d25 - d26;
                    double d29 = d27 / d28;
                    double d32 = dAbs - d29;
                    dLog = Math.log(Math.abs(d18 / d32)) / d25;
                    double dLog2 = Math.log(Math.abs(d18 / d29)) / d26;
                    if ((Double.doubleToRawLongBits(dLog) & Long.MAX_VALUE) >= 9218868437227405312L) {
                        dLog = dLog2;
                    } else if ((Double.doubleToRawLongBits(dLog2) & Long.MAX_VALUE) < 9218868437227405312L) {
                        dLog = Math.max(dLog, dLog2);
                    }
                    double d34 = d32 * d25;
                    double dLog3 = Math.log(d34 / ((-d29) * d26)) / (d26 - d25);
                    if (Double.isNaN(dLog3) || dLog3 <= 0.0d) {
                        d18 = -d18;
                    } else if (dLog3 <= 0.0d) {
                        dLog = Math.log((-((d29 * d26) * d26)) / (d34 * d25)) / d28;
                    } else if ((-((Math.exp(dLog3 * d26) * d29) + (Math.exp(d25 * dLog3) * d32))) < d18) {
                        d18 = -d18;
                        dLog = (d29 <= 0.0d || d32 >= 0.0d) ? dLog : 0.0d;
                    } else {
                        dLog = Math.log((-((d29 * d26) * d26)) / (d34 * d25)) / d28;
                    }
                    double d35 = d29 * d26;
                    if (Math.abs((Math.exp(d26 * dLog) * d35) + (Math.exp(d25 * dLog) * d34)) >= 1.0E-4d) {
                        int i13 = 0;
                        while (dAbs2 > 0.001d && i13 < 100) {
                            i13++;
                            double d36 = d25 * dLog;
                            double d37 = d26 * dLog;
                            double dExp = dLog - ((((Math.exp(d37) * d29) + (Math.exp(d36) * d32)) + d18) / ((Math.exp(d37) * d35) + (Math.exp(d36) * d34)));
                            dAbs2 = Math.abs(dLog - dExp);
                            dLog = dExp;
                        }
                    }
                } else if (d15 < 1.0d) {
                    double d38 = (d16 - (d25 * dAbs)) / dSqrt3;
                    dLog = Math.log(d18 / Math.sqrt((d38 * d38) + (dAbs * dAbs))) / d25;
                } else {
                    double d39 = d25 * dAbs;
                    double d44 = d16 - d39;
                    double dLog4 = Math.log(Math.abs(d18 / dAbs)) / d25;
                    double dLog5 = Math.log(Math.abs(d18 / d44));
                    double dLog6 = dLog5;
                    for (int i14 = 0; i14 < 6; i14++) {
                        dLog6 = dLog5 - Math.log(Math.abs(dLog6 / d25));
                    }
                    double d45 = dLog6 / d25;
                    if ((Double.doubleToRawLongBits(dLog4) & Long.MAX_VALUE) >= 9218868437227405312L) {
                        dLog4 = d45;
                    } else if ((Double.doubleToRawLongBits(d45) & Long.MAX_VALUE) < 9218868437227405312L) {
                        dLog4 = Math.max(dLog4, d45);
                    }
                    double d46 = (-(d39 + d44)) / (d25 * d44);
                    double d47 = d25 * d46;
                    double dExp2 = (Math.exp(d47) * d44 * d46) + (Math.exp(d47) * dAbs);
                    if (Double.isNaN(d46) || d46 <= 0.0d) {
                        d18 = -d18;
                    } else if (d46 <= 0.0d || (-dExp2) >= d18) {
                        dLog4 = (-(2.0d / d25)) - (dAbs / d44);
                    } else {
                        if (d44 < 0.0d && dAbs > 0.0d) {
                            dLog4 = 0.0d;
                        }
                        d18 = -d18;
                    }
                    dLog = dLog4;
                    int i15 = 0;
                    while (dAbs2 > 0.001d && i15 < 100) {
                        i15++;
                        double d48 = d25 * dLog;
                        double dExp3 = dLog - (((Math.exp(d48) * ((d44 * dLog) + dAbs)) + d18) / (Math.exp(d48) * (((((double) 1) + d48) * d44) + d39)));
                        dAbs2 = Math.abs(dLog - dExp3);
                        dLog = dExp3;
                    }
                }
                j7 = (long) (dLog * 1000.0d);
            }
        }
        return j7 * 1000000;
    }

    @Override // p077d0.InterfaceC11341d0
    /* JADX INFO: renamed from: e */
    public final float mo30538e(float f13, float f14, float f15, long j7) {
        C11358h1 c11358h1 = this.f36402b;
        c11358h1.f36408a = f14;
        return Float.intBitsToFloat((int) (c11358h1.m30598a(f13, j7 / 1000000, f15) >> 32));
    }
}
