package androidx.compose.p018ui.input.rotary;

import p005a3.AbstractC0207h1;
import p026b2.AbstractC2316v;
import p027b3.C2404l2;
import p027b3.C2431r;
import p570w2.C36706a;
import p715kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, m65681d2 = {"Landroidx/compose/ui/input/rotary/RotaryInputElement;", "La3/h1;", "Lw2/a;", "ui_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
final class RotaryInputElement extends AbstractC0207h1 {
    @Override // p005a3.AbstractC0207h1
    public final AbstractC2316v create() {
        C2431r c2431r = C2431r.f9523y;
        C36706a c36706a = new C36706a();
        c36706a.f157184O = c2431r;
        return c36706a;
    }

    public final boolean equals(Object obj) {
        return this == obj || (obj instanceof RotaryInputElement);
    }

    public final int hashCode() {
        return C2431r.f9523y.hashCode() * 31;
    }

    @Override // p005a3.AbstractC0207h1
    public final void inspectableProperties(C2404l2 c2404l2) {
        C2431r c2431r = C2431r.f9523y;
        c2404l2.m7401c("onRotaryScrollEvent");
        c2404l2.m7400b().m7292c(c2431r, "onRotaryScrollEvent");
    }

    @Override // p005a3.AbstractC0207h1
    public final void update(AbstractC2316v abstractC2316v) {
        ((C36706a) abstractC2316v).f157184O = C2431r.f9523y;
    }
}
