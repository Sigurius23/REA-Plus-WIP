package androidx.compose.animation;

import c93.InterfaceC4339a;
import p000.AbstractC30802r;
import p005a3.AbstractC0207h1;
import p026b2.AbstractC2316v;
import p027b3.C2404l2;
import p040c0.AbstractC3730c1;
import p040c0.AbstractC3736e1;
import p040c0.C3727b1;
import p040c0.C3774r0;
import p077d0.C11400s1;
import p077d0.C11421z1;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, m65681d2 = {"Landroidx/compose/animation/EnterExitTransitionElement;", "La3/h1;", "Lc0/b1;", "animation"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
final /* data */ class EnterExitTransitionElement extends AbstractC0207h1 {

    /* JADX INFO: renamed from: E */
    public final AbstractC3730c1 f4463E;

    /* JADX INFO: renamed from: F */
    public final AbstractC3736e1 f4464F;

    /* JADX INFO: renamed from: G */
    public final InterfaceC4339a f4465G;

    /* JADX INFO: renamed from: H */
    public final C3774r0 f4466H;

    /* JADX INFO: renamed from: w */
    public final C11421z1 f4467w;

    /* JADX INFO: renamed from: x */
    public final C11400s1 f4468x;

    /* JADX INFO: renamed from: y */
    public final C11400s1 f4469y;

    /* JADX INFO: renamed from: z */
    public final C11400s1 f4470z;

    public EnterExitTransitionElement(C11421z1 c11421z1, C11400s1 c11400s1, C11400s1 c11400s2, C11400s1 c11400s3, AbstractC3730c1 abstractC3730c1, AbstractC3736e1 abstractC3736e1, InterfaceC4339a interfaceC4339a, C3774r0 c3774r0) {
        this.f4467w = c11421z1;
        this.f4468x = c11400s1;
        this.f4469y = c11400s2;
        this.f4470z = c11400s3;
        this.f4463E = abstractC3730c1;
        this.f4464F = abstractC3736e1;
        this.f4465G = interfaceC4339a;
        this.f4466H = c3774r0;
    }

    @Override // p005a3.AbstractC0207h1
    public final AbstractC2316v create() {
        return new C3727b1(this.f4467w, this.f4468x, this.f4469y, this.f4470z, this.f4463E, this.f4464F, this.f4465G, this.f4466H);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof EnterExitTransitionElement)) {
            return false;
        }
        EnterExitTransitionElement enterExitTransitionElement = (EnterExitTransitionElement) obj;
        return AbstractC22676k.m65745e(this.f4467w, enterExitTransitionElement.f4467w) && AbstractC22676k.m65745e(this.f4468x, enterExitTransitionElement.f4468x) && AbstractC22676k.m65745e(this.f4469y, enterExitTransitionElement.f4469y) && AbstractC22676k.m65745e(this.f4470z, enterExitTransitionElement.f4470z) && AbstractC22676k.m65745e(this.f4463E, enterExitTransitionElement.f4463E) && AbstractC22676k.m65745e(this.f4464F, enterExitTransitionElement.f4464F) && AbstractC22676k.m65745e(this.f4465G, enterExitTransitionElement.f4465G) && AbstractC22676k.m65745e(this.f4466H, enterExitTransitionElement.f4466H);
    }

    public final int hashCode() {
        int iHashCode = this.f4467w.hashCode() * 31;
        C11400s1 c11400s1 = this.f4468x;
        int iHashCode2 = (iHashCode + (c11400s1 == null ? 0 : c11400s1.hashCode())) * 31;
        C11400s1 c11400s2 = this.f4469y;
        int iHashCode3 = (iHashCode2 + (c11400s2 == null ? 0 : c11400s2.hashCode())) * 31;
        C11400s1 c11400s3 = this.f4470z;
        return this.f4466H.hashCode() + AbstractC30802r.m94755d((this.f4464F.hashCode() + ((this.f4463E.hashCode() + ((iHashCode3 + (c11400s3 != null ? c11400s3.hashCode() : 0)) * 31)) * 31)) * 31, 31, this.f4465G);
    }

    @Override // p005a3.AbstractC0207h1
    public final void inspectableProperties(C2404l2 c2404l2) {
        c2404l2.m7401c("enterExitTransition");
        c2404l2.m7400b().m7292c(this.f4467w, "transition");
        c2404l2.m7400b().m7292c(this.f4468x, "sizeAnimation");
        c2404l2.m7400b().m7292c(this.f4469y, "offsetAnimation");
        c2404l2.m7400b().m7292c(this.f4470z, "slideAnimation");
        c2404l2.m7400b().m7292c(this.f4463E, "enter");
        c2404l2.m7400b().m7292c(this.f4464F, "exit");
        c2404l2.m7400b().m7292c(this.f4466H, "graphicsLayerBlock");
    }

    public final String toString() {
        return "EnterExitTransitionElement(transition=" + this.f4467w + ", sizeAnimation=" + this.f4468x + ", offsetAnimation=" + this.f4469y + ", slideAnimation=" + this.f4470z + ", enter=" + this.f4463E + ", exit=" + this.f4464F + ", isEnabled=" + this.f4465G + ", graphicsLayerBlock=" + this.f4466H + ')';
    }

    @Override // p005a3.AbstractC0207h1
    public final void update(AbstractC2316v abstractC2316v) {
        C3727b1 c3727b1 = (C3727b1) abstractC2316v;
        c3727b1.f15219P = this.f4467w;
        c3727b1.f15220Q = this.f4468x;
        c3727b1.f15221R = this.f4469y;
        c3727b1.f15222S = this.f4470z;
        c3727b1.f15223T = this.f4463E;
        c3727b1.f15224U = this.f4464F;
        c3727b1.f15225V = this.f4465G;
        c3727b1.f15226W = this.f4466H;
    }
}
