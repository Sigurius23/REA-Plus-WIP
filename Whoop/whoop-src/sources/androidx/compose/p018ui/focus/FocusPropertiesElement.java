package androidx.compose.p018ui.focus;

import p005a3.AbstractC0207h1;
import p026b2.AbstractC2316v;
import p027b3.C2404l2;
import p164g2.C15244p;
import p164g2.C15246r;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, m65681d2 = {"Landroidx/compose/ui/focus/FocusPropertiesElement;", "La3/h1;", "Lg2/r;", "ui_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
final /* data */ class FocusPropertiesElement extends AbstractC0207h1 {

    /* JADX INFO: renamed from: w */
    public final C15244p f4794w;

    public FocusPropertiesElement(C15244p c15244p) {
        this.f4794w = c15244p;
    }

    @Override // p005a3.AbstractC0207h1
    public final AbstractC2316v create() {
        C15246r c15246r = new C15246r();
        c15246r.f57264O = this.f4794w;
        return c15246r;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof FocusPropertiesElement) && AbstractC22676k.m65745e(this.f4794w, ((FocusPropertiesElement) obj).f4794w);
    }

    public final int hashCode() {
        return this.f4794w.hashCode();
    }

    @Override // p005a3.AbstractC0207h1
    public final void inspectableProperties(C2404l2 c2404l2) {
        c2404l2.f9457a = "focusProperties";
        c2404l2.f9459c.m7292c(this.f4794w, "scope");
    }

    public final String toString() {
        return "FocusPropertiesElement(scope=" + this.f4794w + ')';
    }

    @Override // p005a3.AbstractC0207h1
    public final void update(AbstractC2316v abstractC2316v) {
        ((C15246r) abstractC2316v).f57264O = this.f4794w;
    }
}
