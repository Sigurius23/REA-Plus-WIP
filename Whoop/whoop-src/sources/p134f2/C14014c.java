package p134f2;

import p005a3.AbstractC0201g;
import p005a3.C0226m0;
import p005a3.C0238p0;
import p005a3.InterfaceC0245r;
import p005a3.InterfaceC0263w1;
import p026b2.AbstractC2316v;
import p031b9.AbstractC2875y;
import p636y3.EnumC39181m;
import p636y3.InterfaceC39171c;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import v63.AbstractC35744b;

/* JADX INFO: renamed from: f2.c */
/* JADX INFO: loaded from: classes.dex */
public final class C14014c extends AbstractC2316v implements InterfaceC0263w1, InterfaceC14013b, InterfaceC0245r {

    /* JADX INFO: renamed from: O */
    public final C14015d f50033O;

    /* JADX INFO: renamed from: P */
    public boolean f50034P;

    /* JADX INFO: renamed from: Q */
    public Function1 f50035Q;

    public C14014c(C14015d c14015d, Function1 function1) {
        this.f50033O = c14015d;
        this.f50035Q = function1;
        c14015d.f50036w = this;
    }

    @Override // p005a3.InterfaceC0263w1
    /* JADX INFO: renamed from: C */
    public final void mo796C() {
        m39909X0();
    }

    @Override // p005a3.InterfaceC0245r
    /* JADX INFO: renamed from: O */
    public final void mo459O(C0238p0 c0238p0) {
        boolean z4 = this.f50034P;
        C14015d c14015d = this.f50033O;
        if (!z4) {
            c14015d.f50037x = null;
            AbstractC0201g.m512l(this, new C0226m0(4, this, c14015d));
            if (c14015d.f50037x == null) {
                throw AbstractC2875y.m8310w("DrawResult not defined, did you forget to call onDraw?");
            }
            this.f50034P = true;
        }
        C14018g c14018g = c14015d.f50037x;
        AbstractC22676k.m65747g(c14018g);
        c14018g.f50039a.invoke(c0238p0);
    }

    @Override // p026b2.AbstractC2316v
    /* JADX INFO: renamed from: Q0 */
    public final void mo286Q0() {
    }

    @Override // p026b2.AbstractC2316v
    /* JADX INFO: renamed from: R0 */
    public final void mo7159R0() {
        m39909X0();
    }

    /* JADX INFO: renamed from: X0 */
    public final void m39909X0() {
        this.f50034P = false;
        this.f50033O.f50037x = null;
        AbstractC0201g.m508h(this);
    }

    @Override // p005a3.InterfaceC0229n, p005a3.InterfaceC0200f2
    /* JADX INFO: renamed from: c */
    public final void mo466c() {
        m39909X0();
    }

    @Override // p005a3.InterfaceC0245r
    /* JADX INFO: renamed from: c0 */
    public final void mo467c0() {
        m39909X0();
    }

    @Override // p134f2.InterfaceC14013b
    /* JADX INFO: renamed from: d */
    public final long mo468d() {
        return AbstractC35744b.m113239l(AbstractC0201g.m514n(this, 128).f168213y);
    }

    @Override // p134f2.InterfaceC14013b
    public final InterfaceC39171c getDensity() {
        return AbstractC0201g.m516p(this).f776X;
    }

    @Override // p134f2.InterfaceC14013b
    public final EnumC39181m getLayoutDirection() {
        return AbstractC0201g.m516p(this).f777Y;
    }

    @Override // p005a3.InterfaceC0229n
    /* JADX INFO: renamed from: t */
    public final void mo569t() {
        m39909X0();
    }
}
