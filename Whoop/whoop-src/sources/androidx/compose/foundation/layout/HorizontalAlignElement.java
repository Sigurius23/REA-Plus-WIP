package androidx.compose.foundation.layout;

import p005a3.AbstractC0207h1;
import p026b2.AbstractC2316v;
import p026b2.InterfaceC2300f;
import p027b3.C2404l2;
import p291l0.C23002u0;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, m65681d2 = {"Landroidx/compose/foundation/layout/HorizontalAlignElement;", "La3/h1;", "Ll0/u0;", "foundation-layout"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
public final class HorizontalAlignElement extends AbstractC0207h1 {

    /* JADX INFO: renamed from: w */
    public final InterfaceC2300f f4549w;

    public HorizontalAlignElement(InterfaceC2300f interfaceC2300f) {
        this.f4549w = interfaceC2300f;
    }

    @Override // p005a3.AbstractC0207h1
    public final AbstractC2316v create() {
        C23002u0 c23002u0 = new C23002u0();
        c23002u0.f90728O = this.f4549w;
        return c23002u0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        HorizontalAlignElement horizontalAlignElement = obj instanceof HorizontalAlignElement ? (HorizontalAlignElement) obj : null;
        if (horizontalAlignElement == null) {
            return false;
        }
        return AbstractC22676k.m65745e(this.f4549w, horizontalAlignElement.f4549w);
    }

    public final int hashCode() {
        return this.f4549w.hashCode();
    }

    @Override // p005a3.AbstractC0207h1
    public final void inspectableProperties(C2404l2 c2404l2) {
        c2404l2.m7401c("align");
        c2404l2.m7402d(this.f4549w);
    }

    @Override // p005a3.AbstractC0207h1
    public final void update(AbstractC2316v abstractC2316v) {
        ((C23002u0) abstractC2316v).f90728O = this.f4549w;
    }
}
