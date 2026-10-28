package p077d0;

import e93.AbstractC12889b;
import p000.AbstractC11266d;
import p000.AbstractC30802r;
import p031b9.AbstractC2875y;
import p208i2.AbstractC17918w0;

/* JADX INFO: renamed from: d0.v */
/* JADX INFO: loaded from: classes.dex */
public final class C11407v implements InterfaceC11419z {

    /* JADX INFO: renamed from: E */
    public final float f36571E;

    /* JADX INFO: renamed from: F */
    public final float f36572F;

    /* JADX INFO: renamed from: w */
    public final float f36573w;

    /* JADX INFO: renamed from: x */
    public final float f36574x;

    /* JADX INFO: renamed from: y */
    public final float f36575y;

    /* JADX INFO: renamed from: z */
    public final float f36576z;

    public C11407v(float f13, float f14, float f15, float f16) {
        int iM51512N;
        this.f36573w = f13;
        this.f36574x = f14;
        this.f36575y = f15;
        this.f36576z = f16;
        if (!((Float.isNaN(f13) || Float.isNaN(f14) || Float.isNaN(f15) || Float.isNaN(f16)) ? false : true)) {
            StringBuilder sbM8307t = AbstractC2875y.m8307t("Parameters to CubicBezierEasing cannot be NaN. Actual parameters are: ", f13, ", ", f14, ", ");
            sbM8307t.append(f15);
            sbM8307t.append(", ");
            sbM8307t.append(f16);
            sbM8307t.append('.');
            AbstractC11405u0.m30638a(sbM8307t.toString());
        }
        float[] fArr = new float[5];
        float f17 = (f14 - 0.0f) * 3.0f;
        float f18 = (f16 - f14) * 3.0f;
        float f19 = (1.0f - f16) * 3.0f;
        double d3 = f17;
        double d14 = f18;
        double d15 = f19;
        double d16 = d14 * 2.0d;
        double d17 = (d3 - d16) + d15;
        if (d17 == 0.0d) {
            iM51512N = d14 == d15 ? 0 : AbstractC17918w0.m51512N(fArr, 0, (float) ((d16 - d15) / (d16 - (d15 * 2.0d))));
        } else {
            double d18 = -Math.sqrt((d14 * d14) - (d15 * d3));
            double d19 = (-d3) + d14;
            int iM51512N2 = AbstractC17918w0.m51512N(fArr, 0, (float) ((-(d18 + d19)) / d17));
            int iM51512N3 = AbstractC17918w0.m51512N(fArr, iM51512N2, (float) ((d18 - d19) / d17)) + iM51512N2;
            if (iM51512N3 > 1) {
                float f24 = fArr[0];
                float f25 = fArr[1];
                if (f24 > f25) {
                    fArr[0] = f25;
                    fArr[1] = f24;
                } else if (f24 == f25) {
                    iM51512N = iM51512N3 - 1;
                }
                iM51512N = iM51512N3;
            } else {
                iM51512N = iM51512N3;
            }
        }
        float f26 = (f18 - f17) * 2.0f;
        int iM51512N4 = AbstractC17918w0.m51512N(fArr, iM51512N, (-f26) / (((f19 - f18) * 2.0f) - f26)) + iM51512N;
        float fMin = Math.min(0.0f, 1.0f);
        float fMax = Math.max(0.0f, 1.0f);
        for (int i13 = 0; i13 < iM51512N4; i13++) {
            float f27 = fArr[i13];
            float f28 = (((((((((f14 - f16) * 3.0f) + 1.0f) - 0.0f) * f27) + (((f16 - (f14 * 2.0f)) + 0.0f) * 3.0f)) * f27) + f17) * f27) + 0.0f;
            fMin = Math.min(fMin, f28);
            fMax = Math.max(fMax, f28);
        }
        long jFloatToRawIntBits = (((long) Float.floatToRawIntBits(fMin)) << 32) | (((long) Float.floatToRawIntBits(fMax)) & 4294967295L);
        this.f36571E = Float.intBitsToFloat((int) (jFloatToRawIntBits >> 32));
        this.f36572F = Float.intBitsToFloat((int) (jFloatToRawIntBits & 4294967295L));
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C11407v)) {
            return false;
        }
        C11407v c11407v = (C11407v) obj;
        return this.f36573w == c11407v.f36573w && this.f36574x == c11407v.f36574x && this.f36575y == c11407v.f36575y && this.f36576z == c11407v.f36576z;
    }

    public final int hashCode() {
        return Float.hashCode(this.f36576z) + AbstractC11266d.m30447a(this.f36575y, AbstractC11266d.m30447a(this.f36574x, Float.hashCode(this.f36573w) * 31, 31), 31);
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0092 A[PHI: r3
      0x0092: PHI (r3v28 float) = (r3v5 float), (r3v16 float), (r3v21 float), (r3v32 float), (r3v37 float) binds: [B:128:0x0236, B:117:0x0206, B:92:0x01bb, B:47:0x00e5, B:22:0x008e] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:69:0x0162 A[PHI: r12
      0x0162: PHI (r12v41 float) = (r12v25 float), (r12v36 float) binds: [B:68:0x0160, B:81:0x0191] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // p077d0.InterfaceC11419z
    /* JADX INFO: renamed from: i */
    public final float mo7226i(float f13) {
        float f14;
        if (f13 <= 0.0f || f13 >= 1.0f) {
            return f13;
        }
        float fMax = Math.max(f13, 1.1920929E-7f);
        float f15 = 0.0f - fMax;
        float f16 = this.f36573w;
        float f17 = f16 - fMax;
        float f18 = this.f36575y;
        float f19 = f18 - fMax;
        double d3 = f15;
        float f24 = 0.0f;
        double d14 = ((d3 - (((double) f17) * 2.0d)) + ((double) f19)) * 3.0d;
        double d15 = ((double) (f17 - f15)) * 3.0d;
        double d16 = (((double) (f17 - f19)) * 3.0d) + ((double) (-f15)) + ((double) (1.0f - fMax));
        float f25 = Float.NaN;
        if (Math.abs(d16 - 0.0d) >= 1.0E-7d) {
            double d17 = d14 / d16;
            double d18 = d15 / d16;
            double d19 = d3 / d16;
            double d24 = ((d18 * 3.0d) - (d17 * d17)) / 9.0d;
            double d25 = ((d19 * 27.0d) + ((((2.0d * d17) * d17) * d17) - ((9.0d * d17) * d18))) / 54.0d;
            double d26 = d24 * d24 * d24;
            double d27 = (d25 * d25) + d26;
            double d28 = d17 / 3.0d;
            if (d27 < 0.0d) {
                double dSqrt = Math.sqrt(-d26);
                double d29 = (-d25) / dSqrt;
                if (d29 < -1.0d) {
                    d29 = -1.0d;
                }
                if (d29 > 1.0d) {
                    d29 = 1.0d;
                }
                double dAcos = Math.acos(d29);
                double dM36235A = AbstractC12889b.m36235A((float) dSqrt) * 2.0f;
                float fCos = (float) ((Math.cos(dAcos / 3.0d) * dM36235A) - d28);
                float f26 = fCos < 0.0f ? 0.0f : fCos;
                if (f26 > 1.0f) {
                    f26 = 1.0f;
                }
                if (Math.abs(f26 - fCos) > 1.05E-6f) {
                    f26 = Float.NaN;
                }
                if (Float.isNaN(f26)) {
                    float fCos2 = (float) ((Math.cos((6.283185307179586d + dAcos) / 3.0d) * dM36235A) - d28);
                    f26 = fCos2 < 0.0f ? 0.0f : fCos2;
                    if (f26 > 1.0f) {
                        f26 = 1.0f;
                    }
                    if (Math.abs(f26 - fCos2) > 1.05E-6f) {
                        f26 = Float.NaN;
                    }
                    if (Float.isNaN(f26)) {
                        float fCos3 = (float) ((Math.cos((dAcos + 12.566370614359172d) / 3.0d) * dM36235A) - d28);
                        if (fCos3 >= 0.0f) {
                            f24 = fCos3;
                        }
                        f14 = f24 > 1.0f ? 1.0f : f24;
                        if (Math.abs(f14 - fCos3) <= 1.05E-6f) {
                            f25 = f14;
                        }
                    } else {
                        f25 = f26;
                    }
                } else {
                    f25 = f26;
                }
            } else if (d27 == 0.0d) {
                float f27 = -AbstractC12889b.m36235A((float) d25);
                float f28 = (float) d28;
                float f29 = (f27 * 2.0f) - f28;
                float f34 = f29 < 0.0f ? 0.0f : f29;
                if (f34 > 1.0f) {
                    f34 = 1.0f;
                }
                if (Math.abs(f34 - f29) > 1.05E-6f) {
                    f34 = Float.NaN;
                }
                if (Float.isNaN(f34)) {
                    float f35 = (-f27) - f28;
                    if (f35 >= 0.0f) {
                        f24 = f35;
                    }
                    f14 = f24 > 1.0f ? 1.0f : f24;
                    if (Math.abs(f14 - f35) <= 1.05E-6f) {
                        f25 = f14;
                    }
                } else {
                    f25 = f34;
                }
            } else {
                double dSqrt2 = Math.sqrt(d27);
                float fM36235A = (float) (((double) (AbstractC12889b.m36235A((float) ((-d25) + dSqrt2)) - AbstractC12889b.m36235A((float) (d25 + dSqrt2)))) - d28);
                if (fM36235A >= 0.0f) {
                    f24 = fM36235A;
                }
                f14 = f24 > 1.0f ? 1.0f : f24;
                if (Math.abs(f14 - fM36235A) <= 1.05E-6f) {
                    f25 = f14;
                }
            }
        } else if (Math.abs(d14 - 0.0d) >= 1.0E-7d) {
            double dSqrt3 = Math.sqrt((d15 * d15) - ((4.0d * d14) * d3));
            double d32 = d14 * 2.0d;
            float f36 = (float) ((dSqrt3 - d15) / d32);
            float f37 = f36 < 0.0f ? 0.0f : f36;
            if (f37 > 1.0f) {
                f37 = 1.0f;
            }
            if (Math.abs(f37 - f36) > 1.05E-6f) {
                f37 = Float.NaN;
            }
            if (Float.isNaN(f37)) {
                float f38 = (float) (((-d15) - dSqrt3) / d32);
                if (f38 >= 0.0f) {
                    f24 = f38;
                }
                f14 = f24 > 1.0f ? 1.0f : f24;
                if (Math.abs(f14 - f38) <= 1.05E-6f) {
                    f25 = f14;
                }
            } else {
                f25 = f37;
            }
        } else if (Math.abs(d15 - 0.0d) >= 1.0E-7d) {
            float f39 = (float) ((-d3) / d15);
            if (f39 >= 0.0f) {
                f24 = f39;
            }
            f14 = f24 > 1.0f ? 1.0f : f24;
            if (Math.abs(f14 - f39) <= 1.05E-6f) {
                f25 = f14;
            }
        }
        boolean zIsNaN = Float.isNaN(f25);
        float f43 = this.f36576z;
        float f44 = this.f36574x;
        if (!zIsNaN) {
            float f45 = ((((((f44 - f43) + 0.33333334f) * f25) + (f43 - (2.0f * f44))) * f25) + f44) * 3.0f * f25;
            float f46 = this.f36571E;
            if (f45 < f46) {
                f45 = f46;
            }
            float f47 = this.f36572F;
            return f45 > f47 ? f47 : f45;
        }
        throw new IllegalArgumentException("The cubic curve with parameters (" + f16 + ", " + f44 + ", " + f18 + ", " + f43 + ") has no solution at " + f13);
    }

    public final String toString() {
        StringBuilder sb4 = new StringBuilder("CubicBezierEasing(a=");
        sb4.append(this.f36573w);
        sb4.append(", b=");
        sb4.append(this.f36574x);
        sb4.append(", c=");
        sb4.append(this.f36575y);
        sb4.append(", d=");
        return AbstractC30802r.m94763l(sb4, this.f36576z, ')');
    }
}
