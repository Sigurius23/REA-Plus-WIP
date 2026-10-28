package androidx.compose.foundation.layout;

import p005a3.AbstractC0207h1;
import p026b2.AbstractC2316v;
import p026b2.C2306l;
import p027b3.C2404l2;
import p291l0.C22936a2;
import p715kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, m65681d2 = {"Landroidx/compose/foundation/layout/VerticalAlignElement;", "La3/h1;", "Ll0/a2;", "foundation-layout"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
public final class VerticalAlignElement extends AbstractC0207h1 {

    /* JADX INFO: renamed from: w */
    public final C2306l f4576w;

    public VerticalAlignElement(C2306l c2306l) {
        this.f4576w = c2306l;
    }

    @Override // p005a3.AbstractC0207h1
    public final AbstractC2316v create() {
        C22936a2 c22936a2 = new C22936a2();
        c22936a2.f90540O = this.f4576w;
        return c22936a2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        VerticalAlignElement verticalAlignElement = obj instanceof VerticalAlignElement ? (VerticalAlignElement) obj : null;
        if (verticalAlignElement == null) {
            return false;
        }
        return this.f4576w.equals(verticalAlignElement.f4576w);
    }

    public final int hashCode() {
        return Float.hashCode(this.f4576w.f9120a);
    }

    @Override // p005a3.AbstractC0207h1
    public final void inspectableProperties(C2404l2 c2404l2) {
        c2404l2.m7401c("align");
        c2404l2.m7402d(this.f4576w);
    }

    @Override // p005a3.AbstractC0207h1
    public final void update(AbstractC2316v abstractC2316v) {
        ((C22936a2) abstractC2316v).f90540O = this.f4576w;
    }
}
