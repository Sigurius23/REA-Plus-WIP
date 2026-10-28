package p240j2;

import e93.AbstractC12889b;
import p208i2.AbstractC17918w0;

/* JADX INFO: renamed from: j2.l */
/* JADX INFO: loaded from: classes.dex */
public final class C21231l extends AbstractC21222c {

    /* JADX INFO: renamed from: d */
    public static final float[] f81058d;

    /* JADX INFO: renamed from: e */
    public static final float[] f81059e;

    /* JADX INFO: renamed from: f */
    public static final float[] f81060f;

    /* JADX INFO: renamed from: g */
    public static final float[] f81061g;

    static {
        float[] fArrM59559g = AbstractC21229j.m59559g(new float[]{0.818933f, 0.032984544f, 0.0482003f, 0.36186674f, 0.9293119f, 0.26436627f, -0.12885971f, 0.03614564f, 0.6338517f}, AbstractC21229j.m59555c(C21220a.f81009b.f81010a, new float[]{0.964212f, 1.0f, 0.8251883f}, new float[]{0.95042855f, 1.0f, 1.0889004f}));
        f81058d = fArrM59559g;
        float[] fArr = {0.21045426f, 1.9779985f, 0.025904037f, 0.7936178f, -2.4285922f, 0.78277177f, -0.004072047f, 0.4505937f, -0.80867577f};
        f81059e = fArr;
        f81060f = AbstractC21229j.m59558f(fArrM59559g);
        f81061g = AbstractC21229j.m59558f(fArr);
    }

    @Override // p240j2.AbstractC21222c
    /* JADX INFO: renamed from: a */
    public final float mo59542a(int i13) {
        return i13 == 0 ? 1.0f : 0.5f;
    }

    @Override // p240j2.AbstractC21222c
    /* JADX INFO: renamed from: b */
    public final float mo59543b(int i13) {
        return i13 == 0 ? 0.0f : -0.5f;
    }

    @Override // p240j2.AbstractC21222c
    /* JADX INFO: renamed from: d */
    public final long mo59545d(float f13, float f14, float f15) {
        if (f13 < 0.0f) {
            f13 = 0.0f;
        }
        if (f13 > 1.0f) {
            f13 = 1.0f;
        }
        if (f14 < -0.5f) {
            f14 = -0.5f;
        }
        if (f14 > 0.5f) {
            f14 = 0.5f;
        }
        if (f15 < -0.5f) {
            f15 = -0.5f;
        }
        float f16 = f15 <= 0.5f ? f15 : 0.5f;
        float[] fArr = f81061g;
        float f17 = (fArr[6] * f16) + (fArr[3] * f14) + (fArr[0] * f13);
        float f18 = (fArr[7] * f16) + (fArr[4] * f14) + (fArr[1] * f13);
        float f19 = (fArr[8] * f16) + (fArr[5] * f14) + (fArr[2] * f13);
        float f24 = f17 * f17 * f17;
        float f25 = f18 * f18 * f18;
        float f26 = f19 * f19 * f19;
        float[] fArr2 = f81060f;
        return (((long) Float.floatToRawIntBits((fArr2[7] * f26) + (fArr2[4] * f25) + (fArr2[1] * f24))) & 4294967295L) | (((long) Float.floatToRawIntBits((fArr2[6] * f26) + ((fArr2[3] * f25) + (fArr2[0] * f24)))) << 32);
    }

    @Override // p240j2.AbstractC21222c
    /* JADX INFO: renamed from: e */
    public final float mo59546e(float f13, float f14, float f15) {
        if (f13 < 0.0f) {
            f13 = 0.0f;
        }
        if (f13 > 1.0f) {
            f13 = 1.0f;
        }
        if (f14 < -0.5f) {
            f14 = -0.5f;
        }
        if (f14 > 0.5f) {
            f14 = 0.5f;
        }
        if (f15 < -0.5f) {
            f15 = -0.5f;
        }
        float f16 = f15 <= 0.5f ? f15 : 0.5f;
        float[] fArr = f81061g;
        float f17 = (fArr[6] * f16) + (fArr[3] * f14) + (fArr[0] * f13);
        float f18 = (fArr[7] * f16) + (fArr[4] * f14) + (fArr[1] * f13);
        float f19 = (fArr[8] * f16) + (fArr[5] * f14) + (fArr[2] * f13);
        float f24 = f17 * f17 * f17;
        float f25 = f18 * f18 * f18;
        float f26 = f19 * f19 * f19;
        float[] fArr2 = f81060f;
        return (fArr2[8] * f26) + (fArr2[5] * f25) + (fArr2[2] * f24);
    }

    @Override // p240j2.AbstractC21222c
    /* JADX INFO: renamed from: f */
    public final long mo59547f(float f13, float f14, float f15, float f16, AbstractC21222c abstractC21222c) {
        float[] fArr = f81058d;
        float f17 = (fArr[6] * f15) + (fArr[3] * f14) + (fArr[0] * f13);
        float f18 = (fArr[7] * f15) + (fArr[4] * f14) + (fArr[1] * f13);
        float f19 = (fArr[8] * f15) + (fArr[5] * f14) + (fArr[2] * f13);
        float fM36235A = AbstractC12889b.m36235A(f17);
        float fM36235A2 = AbstractC12889b.m36235A(f18);
        float fM36235A3 = AbstractC12889b.m36235A(f19);
        float[] fArr2 = f81059e;
        return AbstractC17918w0.m51514b((fArr2[6] * fM36235A3) + (fArr2[3] * fM36235A2) + (fArr2[0] * fM36235A), (fArr2[7] * fM36235A3) + (fArr2[4] * fM36235A2) + (fArr2[1] * fM36235A), (fArr2[8] * fM36235A3) + (fArr2[5] * fM36235A2) + (fArr2[2] * fM36235A), f16, abstractC21222c);
    }
}
