package androidx.compose.foundation;

import p005a3.AbstractC0207h1;
import p005a3.InterfaceC0229n;
import p026b2.AbstractC2316v;
import p027b3.C2365d3;
import p027b3.C2404l2;
import p132f0.C13829u0;
import p132f0.InterfaceC13832v0;
import p238j0.InterfaceC21083i;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, m65681d2 = {"Landroidx/compose/foundation/IndicationModifierElement;", "La3/h1;", "Lf0/u0;", "foundation_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
final class IndicationModifierElement extends AbstractC0207h1 {

    /* JADX INFO: renamed from: w */
    public final InterfaceC21083i f4495w;

    /* JADX INFO: renamed from: x */
    public final InterfaceC13832v0 f4496x;

    public IndicationModifierElement(InterfaceC13832v0 interfaceC13832v0, InterfaceC21083i interfaceC21083i) {
        this.f4495w = interfaceC21083i;
        this.f4496x = interfaceC13832v0;
    }

    @Override // p005a3.AbstractC0207h1
    public final AbstractC2316v create() {
        InterfaceC0229n interfaceC0229nMo3461a = this.f4496x.mo3461a(this.f4495w);
        C13829u0 c13829u0 = new C13829u0();
        c13829u0.f49352Q = interfaceC0229nMo3461a;
        c13829u0.m665X0(interfaceC0229nMo3461a);
        return c13829u0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof IndicationModifierElement)) {
            return false;
        }
        IndicationModifierElement indicationModifierElement = (IndicationModifierElement) obj;
        return AbstractC22676k.m65745e(this.f4495w, indicationModifierElement.f4495w) && AbstractC22676k.m65745e(this.f4496x, indicationModifierElement.f4496x);
    }

    public final int hashCode() {
        return this.f4496x.hashCode() + (this.f4495w.hashCode() * 31);
    }

    @Override // p005a3.AbstractC0207h1
    public final void inspectableProperties(C2404l2 c2404l2) {
        c2404l2.f9457a = "indication";
        C2365d3 c2365d3 = c2404l2.f9459c;
        c2365d3.m7292c(this.f4495w, "interactionSource");
        c2365d3.m7292c(this.f4496x, "indication");
    }

    @Override // p005a3.AbstractC0207h1
    public final void update(AbstractC2316v abstractC2316v) {
        C13829u0 c13829u0 = (C13829u0) abstractC2316v;
        InterfaceC0229n interfaceC0229nMo3461a = this.f4496x.mo3461a(this.f4495w);
        c13829u0.m666Y0(c13829u0.f49352Q);
        c13829u0.f49352Q = interfaceC0229nMo3461a;
        c13829u0.m665X0(interfaceC0229nMo3461a);
    }
}
