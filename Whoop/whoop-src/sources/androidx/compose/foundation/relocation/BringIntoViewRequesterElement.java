package androidx.compose.foundation.relocation;

import p005a3.AbstractC0207h1;
import p026b2.AbstractC2316v;
import p027b3.C2404l2;
import p445r0.C30835c;
import p445r0.C30836d;
import p445r0.InterfaceC30833a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, m65681d2 = {"Landroidx/compose/foundation/relocation/BringIntoViewRequesterElement;", "La3/h1;", "Lr0/d;", "foundation_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
final class BringIntoViewRequesterElement extends AbstractC0207h1 {

    /* JADX INFO: renamed from: w */
    public final InterfaceC30833a f4628w;

    public BringIntoViewRequesterElement(InterfaceC30833a interfaceC30833a) {
        this.f4628w = interfaceC30833a;
    }

    @Override // p005a3.AbstractC0207h1
    public final AbstractC2316v create() {
        C30836d c30836d = new C30836d();
        c30836d.f127141O = this.f4628w;
        return c30836d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof BringIntoViewRequesterElement) {
            return AbstractC22676k.m65745e(this.f4628w, ((BringIntoViewRequesterElement) obj).f4628w);
        }
        return false;
    }

    public final int hashCode() {
        return this.f4628w.hashCode();
    }

    @Override // p005a3.AbstractC0207h1
    public final void inspectableProperties(C2404l2 c2404l2) {
        c2404l2.f9457a = "bringIntoViewRequester";
        c2404l2.f9459c.m7292c(this.f4628w, "bringIntoViewRequester");
    }

    @Override // p005a3.AbstractC0207h1
    public final void update(AbstractC2316v abstractC2316v) {
        C30836d c30836d = (C30836d) abstractC2316v;
        InterfaceC30833a interfaceC30833a = c30836d.f127141O;
        if (interfaceC30833a instanceof C30835c) {
            ((C30835c) interfaceC30833a).f127140a.m94893k(c30836d);
        }
        InterfaceC30833a interfaceC30833a2 = this.f4628w;
        if (interfaceC30833a2 instanceof C30835c) {
            ((C30835c) interfaceC30833a2).f127140a.m94885b(c30836d);
        }
        c30836d.f127141O = interfaceC30833a2;
    }
}
