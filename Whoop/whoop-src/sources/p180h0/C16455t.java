package p180h0;

/* JADX INFO: renamed from: h0.t */
/* JADX INFO: loaded from: classes5.dex */
public final class C16455t implements InterfaceC16450s {
    @Override // p180h0.InterfaceC16450s
    /* JADX INFO: renamed from: a */
    public final float mo46636a(float f13, float f14, float f15) {
        float fAbs = Math.abs((f14 + f13) - f13);
        float f16 = (0.3f * f15) - (0.0f * fAbs);
        float f17 = f15 - f16;
        if ((fAbs <= f15) && f17 < fAbs) {
            f16 = f15 - fAbs;
        }
        return f13 - f16;
    }
}
