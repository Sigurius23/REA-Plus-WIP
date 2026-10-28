package androidx.compose.p018ui.focus;

import p005a3.AbstractC0207h1;
import p026b2.AbstractC2316v;
import p027b3.C2404l2;
import p164g2.C15234f;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, m65681d2 = {"Landroidx/compose/ui/focus/FocusEventElement;", "La3/h1;", "Lg2/f;", "ui_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
final class FocusEventElement extends AbstractC0207h1 {

    /* JADX INFO: renamed from: w */
    public final Function1 f4792w;

    public FocusEventElement(Function1 function1) {
        this.f4792w = function1;
    }

    @Override // p005a3.AbstractC0207h1
    public final AbstractC2316v create() {
        C15234f c15234f = new C15234f();
        c15234f.f57231O = this.f4792w;
        return c15234f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof FocusEventElement) {
            return this.f4792w == ((FocusEventElement) obj).f4792w;
        }
        return false;
    }

    public final int hashCode() {
        return this.f4792w.hashCode();
    }

    @Override // p005a3.AbstractC0207h1
    public final void inspectableProperties(C2404l2 c2404l2) {
        c2404l2.f9457a = "onFocusEvent";
        c2404l2.f9459c.m7292c(this.f4792w, "onFocusEvent");
    }

    @Override // p005a3.AbstractC0207h1
    public final void update(AbstractC2316v abstractC2316v) {
        ((C15234f) abstractC2316v).f57231O = this.f4792w;
    }
}
