package androidx.compose.p018ui.input.pointer;

import p005a3.AbstractC0207h1;
import p026b2.AbstractC2316v;
import p027b3.C2365d3;
import p027b3.C2404l2;
import p512u2.C34447a;
import p512u2.C34467m;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0081\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, m65681d2 = {"Landroidx/compose/ui/input/pointer/PointerHoverIconModifierElement;", "La3/h1;", "Lu2/m;", "ui_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
public final /* data */ class PointerHoverIconModifierElement extends AbstractC0207h1 {

    /* JADX INFO: renamed from: w */
    public final C34447a f4835w;

    public PointerHoverIconModifierElement(C34447a c34447a) {
        this.f4835w = c34447a;
    }

    @Override // p005a3.AbstractC0207h1
    public final AbstractC2316v create() {
        return new C34467m(this.f4835w, null);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof PointerHoverIconModifierElement) && this.f4835w.equals(((PointerHoverIconModifierElement) obj).f4835w);
    }

    public final int hashCode() {
        return Boolean.hashCode(false) + (this.f4835w.f144742b * 31);
    }

    @Override // p005a3.AbstractC0207h1
    public final void inspectableProperties(C2404l2 c2404l2) {
        c2404l2.f9457a = "pointerHoverIcon";
        C2365d3 c2365d3 = c2404l2.f9459c;
        c2365d3.m7292c(this.f4835w, "icon");
        c2365d3.m7292c(Boolean.FALSE, "overrideDescendants");
    }

    public final String toString() {
        return "PointerHoverIconModifierElement(icon=" + this.f4835w + ", overrideDescendants=false)";
    }

    @Override // p005a3.AbstractC0207h1
    public final void update(AbstractC2316v abstractC2316v) {
        C34467m c34467m = (C34467m) abstractC2316v;
        C34447a c34447a = c34467m.f144758P;
        C34447a c34447a2 = this.f4835w;
        if (AbstractC22676k.m65745e(c34447a, c34447a2)) {
            return;
        }
        c34467m.f144758P = c34447a2;
        if (c34467m.f144759Q) {
            c34467m.m108925Z0();
        }
    }
}
