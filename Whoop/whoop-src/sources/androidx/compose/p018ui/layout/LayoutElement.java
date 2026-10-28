package androidx.compose.p018ui.layout;

import p005a3.AbstractC0207h1;
import p026b2.AbstractC2316v;
import p027b3.C2404l2;
import p635y2.C39084d0;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function3;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, m65681d2 = {"Landroidx/compose/ui/layout/LayoutElement;", "La3/h1;", "Ly2/d0;", "ui_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
final class LayoutElement extends AbstractC0207h1 {

    /* JADX INFO: renamed from: w */
    public final Function3 f4842w;

    public LayoutElement(Function3 function3) {
        this.f4842w = function3;
    }

    @Override // p005a3.AbstractC0207h1
    public final AbstractC2316v create() {
        C39084d0 c39084d0 = new C39084d0();
        c39084d0.f168142O = this.f4842w;
        return c39084d0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof LayoutElement) {
            return this.f4842w == ((LayoutElement) obj).f4842w;
        }
        return false;
    }

    public final int hashCode() {
        return this.f4842w.hashCode();
    }

    @Override // p005a3.AbstractC0207h1
    public final void inspectableProperties(C2404l2 c2404l2) {
        c2404l2.m7401c("layout");
        c2404l2.m7400b().m7292c(this.f4842w, "measure");
    }

    @Override // p005a3.AbstractC0207h1
    public final void update(AbstractC2316v abstractC2316v) {
        ((C39084d0) abstractC2316v).f168142O = this.f4842w;
    }
}
