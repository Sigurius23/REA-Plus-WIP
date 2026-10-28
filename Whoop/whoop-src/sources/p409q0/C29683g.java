package p409q0;

import e93.AbstractC12889b;
import p180h0.InterfaceC16450s;

/* JADX INFO: renamed from: q0.g */
/* JADX INFO: loaded from: classes5.dex */
public final class C29683g implements InterfaceC16450s {

    /* JADX INFO: renamed from: b */
    public final AbstractC29701y f121314b;

    /* JADX INFO: renamed from: c */
    public final InterfaceC16450s f121315c;

    public C29683g(AbstractC29701y abstractC29701y, InterfaceC16450s interfaceC16450s) {
        this.f121314b = abstractC29701y;
        this.f121315c = interfaceC16450s;
    }

    @Override // p180h0.InterfaceC16450s
    /* JADX INFO: renamed from: a */
    public final float mo46636a(float f13, float f14, float f15) {
        float fMo46636a = this.f121315c.mo46636a(f13, f14, f15);
        boolean z4 = false;
        if (f13 <= 0.0f ? f13 + f14 <= 0.0f : f13 + f14 > f15) {
            z4 = true;
        }
        float fAbs = Math.abs(fMo46636a);
        AbstractC29701y abstractC29701y = this.f121314b;
        if (fAbs == 0.0f || !z4) {
            if (Math.abs(abstractC29701y.f121435f) < 1.0E-6d) {
                return 0.0f;
            }
            float fM91165o = abstractC29701y.f121435f * (-1.0f);
            if (((Boolean) abstractC29701y.f121428H.getValue()).booleanValue()) {
                fM91165o += abstractC29701y.m91165o();
            }
            return AbstractC12889b.m36283m(fM91165o, -f15, f15);
        }
        float fM91165o2 = abstractC29701y.f121435f * (-1);
        while (fMo46636a > 0.0f && fM91165o2 < fMo46636a) {
            fM91165o2 += abstractC29701y.m91165o();
        }
        while (fMo46636a < 0.0f && fM91165o2 > fMo46636a) {
            fM91165o2 -= abstractC29701y.m91165o();
        }
        return fM91165o2;
    }
}
