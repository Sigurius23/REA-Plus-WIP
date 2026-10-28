package p240j2;

import p208i2.AbstractC17918w0;

/* JADX INFO: renamed from: j2.k */
/* JADX INFO: loaded from: classes.dex */
public final class C21230k extends AbstractC21222c {

    /* JADX INFO: renamed from: d */
    public final /* synthetic */ int f81057d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C21230k(long j7, String str, int i13, int i14) {
        super(i13, str, j7);
        this.f81057d = i14;
    }

    @Override // p240j2.AbstractC21222c
    /* JADX INFO: renamed from: a */
    public final float mo59542a(int i13) {
        switch (this.f81057d) {
            case 0:
                return i13 == 0 ? 100.0f : 128.0f;
            default:
                return 2.0f;
        }
    }

    @Override // p240j2.AbstractC21222c
    /* JADX INFO: renamed from: b */
    public final float mo59543b(int i13) {
        switch (this.f81057d) {
            case 0:
                return i13 == 0 ? 0.0f : -128.0f;
            default:
                return -2.0f;
        }
    }

    @Override // p240j2.AbstractC21222c
    /* JADX INFO: renamed from: d */
    public final long mo59545d(float f13, float f14, float f15) {
        switch (this.f81057d) {
            case 0:
                if (f13 < 0.0f) {
                    f13 = 0.0f;
                }
                if (f13 > 100.0f) {
                    f13 = 100.0f;
                }
                if (f14 < -128.0f) {
                    f14 = -128.0f;
                }
                if (f14 > 128.0f) {
                    f14 = 128.0f;
                }
                float f16 = (f13 + 16.0f) / 116.0f;
                float f17 = (f14 * 0.002f) + f16;
                float f18 = f17 > 0.20689656f ? f17 * f17 * f17 : (f17 - 0.13793103f) * 0.12841855f;
                float f19 = f16 > 0.20689656f ? f16 * f16 * f16 : (f16 - 0.13793103f) * 0.12841855f;
                float[] fArr = AbstractC21229j.f81056e;
                return (((long) Float.floatToRawIntBits(f19 * fArr[1])) & 4294967295L) | (((long) Float.floatToRawIntBits(f18 * fArr[0])) << 32);
            default:
                if (f13 < -2.0f) {
                    f13 = -2.0f;
                }
                if (f13 > 2.0f) {
                    f13 = 2.0f;
                }
                if (f14 < -2.0f) {
                    f14 = -2.0f;
                }
                return (((long) Float.floatToRawIntBits(f13)) << 32) | (((long) Float.floatToRawIntBits(f14 <= 2.0f ? f14 : 2.0f)) & 4294967295L);
        }
    }

    @Override // p240j2.AbstractC21222c
    /* JADX INFO: renamed from: e */
    public final float mo59546e(float f13, float f14, float f15) {
        switch (this.f81057d) {
            case 0:
                if (f13 < 0.0f) {
                    f13 = 0.0f;
                }
                if (f13 > 100.0f) {
                    f13 = 100.0f;
                }
                if (f15 < -128.0f) {
                    f15 = -128.0f;
                }
                if (f15 > 128.0f) {
                    f15 = 128.0f;
                }
                float f16 = ((f13 + 16.0f) / 116.0f) - (f15 * 0.005f);
                return (f16 > 0.20689656f ? f16 * f16 * f16 : 0.12841855f * (f16 - 0.13793103f)) * AbstractC21229j.f81056e[2];
            default:
                if (f15 < -2.0f) {
                    f15 = -2.0f;
                }
                if (f15 > 2.0f) {
                    return 2.0f;
                }
                return f15;
        }
    }

    @Override // p240j2.AbstractC21222c
    /* JADX INFO: renamed from: f */
    public final long mo59547f(float f13, float f14, float f15, float f16, AbstractC21222c abstractC21222c) {
        switch (this.f81057d) {
            case 0:
                float[] fArr = AbstractC21229j.f81056e;
                float f17 = f13 / fArr[0];
                float f18 = f14 / fArr[1];
                float f19 = f15 / fArr[2];
                float fCbrt = f17 > 0.008856452f ? (float) Math.cbrt(f17) : (f17 * 7.787037f) + 0.13793103f;
                float fCbrt2 = f18 > 0.008856452f ? (float) Math.cbrt(f18) : (f18 * 7.787037f) + 0.13793103f;
                float f24 = (116.0f * fCbrt2) - 16.0f;
                float f25 = (fCbrt - fCbrt2) * 500.0f;
                float fCbrt3 = (fCbrt2 - (f19 > 0.008856452f ? (float) Math.cbrt(f19) : (f19 * 7.787037f) + 0.13793103f)) * 200.0f;
                if (f24 < 0.0f) {
                    f24 = 0.0f;
                }
                if (f24 > 100.0f) {
                    f24 = 100.0f;
                }
                if (f25 < -128.0f) {
                    f25 = -128.0f;
                }
                if (f25 > 128.0f) {
                    f25 = 128.0f;
                }
                if (fCbrt3 < -128.0f) {
                    fCbrt3 = -128.0f;
                }
                return AbstractC17918w0.m51514b(f24, f25, fCbrt3 <= 128.0f ? fCbrt3 : 128.0f, f16, abstractC21222c);
            default:
                if (f13 < -2.0f) {
                    f13 = -2.0f;
                }
                if (f13 > 2.0f) {
                    f13 = 2.0f;
                }
                if (f14 < -2.0f) {
                    f14 = -2.0f;
                }
                if (f14 > 2.0f) {
                    f14 = 2.0f;
                }
                if (f15 < -2.0f) {
                    f15 = -2.0f;
                }
                return AbstractC17918w0.m51514b(f13, f14, f15 <= 2.0f ? f15 : 2.0f, f16, abstractC21222c);
        }
    }
}
