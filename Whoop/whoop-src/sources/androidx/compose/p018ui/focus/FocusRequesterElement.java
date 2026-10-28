package androidx.compose.p018ui.focus;

import p005a3.AbstractC0207h1;
import p026b2.AbstractC2316v;
import p027b3.C2404l2;
import p164g2.C15247s;
import p164g2.C15249u;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, m65681d2 = {"Landroidx/compose/ui/focus/FocusRequesterElement;", "La3/h1;", "Lg2/u;", "ui_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
final /* data */ class FocusRequesterElement extends AbstractC0207h1 {

    /* JADX INFO: renamed from: w */
    public final C15247s f4795w;

    public FocusRequesterElement(C15247s c15247s) {
        this.f4795w = c15247s;
    }

    @Override // p005a3.AbstractC0207h1
    public final AbstractC2316v create() {
        C15249u c15249u = new C15249u();
        c15249u.f57269O = this.f4795w;
        return c15249u;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof FocusRequesterElement) && AbstractC22676k.m65745e(this.f4795w, ((FocusRequesterElement) obj).f4795w);
    }

    public final int hashCode() {
        return this.f4795w.hashCode();
    }

    @Override // p005a3.AbstractC0207h1
    public final void inspectableProperties(C2404l2 c2404l2) {
        c2404l2.f9457a = "focusRequester";
        c2404l2.f9459c.m7292c(this.f4795w, "focusRequester");
    }

    public final String toString() {
        return "FocusRequesterElement(focusRequester=" + this.f4795w + ')';
    }

    @Override // p005a3.AbstractC0207h1
    public final void update(AbstractC2316v abstractC2316v) {
        C15249u c15249u = (C15249u) abstractC2316v;
        c15249u.f57269O.f57268a.m94893k(c15249u);
        C15247s c15247s = this.f4795w;
        c15249u.f57269O = c15247s;
        c15247s.f57268a.m94885b(c15249u);
    }
}
