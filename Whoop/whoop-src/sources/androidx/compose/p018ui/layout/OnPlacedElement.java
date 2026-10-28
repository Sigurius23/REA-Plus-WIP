package androidx.compose.p018ui.layout;

import p005a3.AbstractC0207h1;
import p026b2.AbstractC2316v;
import p027b3.C2404l2;
import p635y2.C39085d1;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, m65681d2 = {"Landroidx/compose/ui/layout/OnPlacedElement;", "La3/h1;", "Ly2/d1;", "ui_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
final class OnPlacedElement extends AbstractC0207h1 {

    /* JADX INFO: renamed from: w */
    public final Function1 f4845w;

    public OnPlacedElement(Function1 function1) {
        this.f4845w = function1;
    }

    @Override // p005a3.AbstractC0207h1
    public final AbstractC2316v create() {
        C39085d1 c39085d1 = new C39085d1();
        c39085d1.f168143O = this.f4845w;
        return c39085d1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof OnPlacedElement) {
            return this.f4845w == ((OnPlacedElement) obj).f4845w;
        }
        return false;
    }

    public final int hashCode() {
        return this.f4845w.hashCode();
    }

    @Override // p005a3.AbstractC0207h1
    public final void inspectableProperties(C2404l2 c2404l2) {
        c2404l2.f9457a = "onPlaced";
        c2404l2.f9459c.m7292c(this.f4845w, "onPlaced");
    }

    @Override // p005a3.AbstractC0207h1
    public final void update(AbstractC2316v abstractC2316v) {
        ((C39085d1) abstractC2316v).f168143O = this.f4845w;
    }
}
