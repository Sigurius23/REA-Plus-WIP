package c23;

import p031b9.AbstractC2875y;

/* JADX INFO: renamed from: c23.k */
/* JADX INFO: loaded from: classes3.dex */
public final class RunnableC3905k implements Runnable {

    /* JADX INFO: renamed from: E */
    public final long f15954E = System.currentTimeMillis();

    /* JADX INFO: renamed from: F */
    public final /* synthetic */ ViewOnTouchListenerC3909o f15955F;

    /* JADX INFO: renamed from: w */
    public final float f15956w;

    /* JADX INFO: renamed from: x */
    public final float f15957x;

    /* JADX INFO: renamed from: y */
    public final float f15958y;

    /* JADX INFO: renamed from: z */
    public final float f15959z;

    public RunnableC3905k(ViewOnTouchListenerC3909o viewOnTouchListenerC3909o, float f13, float f14, float f15, float f16) {
        this.f15955F = viewOnTouchListenerC3909o;
        this.f15956w = f13;
        this.f15957x = f14;
        this.f15958y = f15;
        this.f15959z = f16;
    }

    @Override // java.lang.Runnable
    public final void run() {
        float fCurrentTimeMillis = (System.currentTimeMillis() - this.f15954E) * 1.0f;
        ViewOnTouchListenerC3909o viewOnTouchListenerC3909o = this.f15955F;
        float interpolation = viewOnTouchListenerC3909o.f15988x.getInterpolation(Math.min(1.0f, fCurrentTimeMillis / viewOnTouchListenerC3909o.f15989y));
        float f13 = this.f15956w;
        viewOnTouchListenerC3909o.f15986X.m97718z(AbstractC2875y.m8288a(this.f15957x, f13, interpolation, f13) / viewOnTouchListenerC3909o.m11893d(), this.f15958y, this.f15959z, 0.0f, 0.0f);
        if (interpolation < 1.0f) {
            viewOnTouchListenerC3909o.f15987w.postDelayed(this, 16L);
        }
    }
}
