package androidx.compose.p018ui.focus;

import p005a3.AbstractC0207h1;
import p026b2.AbstractC2316v;
import p027b3.C2404l2;
import p164g2.C15231c;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, m65681d2 = {"Landroidx/compose/ui/focus/FocusChangedElement;", "La3/h1;", "Lg2/c;", "ui_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
final class FocusChangedElement extends AbstractC0207h1 {

    /* JADX INFO: renamed from: w */
    public final Function1 f4791w;

    public FocusChangedElement(Function1 function1) {
        this.f4791w = function1;
    }

    @Override // p005a3.AbstractC0207h1
    public final AbstractC2316v create() {
        C15231c c15231c = new C15231c();
        c15231c.f57228O = this.f4791w;
        return c15231c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof FocusChangedElement) {
            return this.f4791w == ((FocusChangedElement) obj).f4791w;
        }
        return false;
    }

    public final int hashCode() {
        return this.f4791w.hashCode();
    }

    @Override // p005a3.AbstractC0207h1
    public final void inspectableProperties(C2404l2 c2404l2) {
        c2404l2.f9457a = "onFocusChanged";
        c2404l2.f9459c.m7292c(this.f4791w, "onFocusChanged");
    }

    @Override // p005a3.AbstractC0207h1
    public final void update(AbstractC2316v abstractC2316v) {
        ((C15231c) abstractC2316v).f57228O = this.f4791w;
    }
}
