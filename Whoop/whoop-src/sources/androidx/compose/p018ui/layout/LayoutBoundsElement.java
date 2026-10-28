package androidx.compose.p018ui.layout;

import p005a3.AbstractC0207h1;
import p026b2.AbstractC2316v;
import p027b3.C2404l2;
import p635y2.C39141w;
import p635y2.C39144x;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0081\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, m65681d2 = {"Landroidx/compose/ui/layout/LayoutBoundsElement;", "La3/h1;", "Ly2/x;", "ui_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
public final /* data */ class LayoutBoundsElement extends AbstractC0207h1 {

    /* JADX INFO: renamed from: w */
    public final C39141w f4841w;

    public LayoutBoundsElement(C39141w c39141w) {
        this.f4841w = c39141w;
    }

    @Override // p005a3.AbstractC0207h1
    public final AbstractC2316v create() {
        return new C39144x(this.f4841w);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof LayoutBoundsElement) && AbstractC22676k.m65745e(this.f4841w, ((LayoutBoundsElement) obj).f4841w);
    }

    public final int hashCode() {
        return this.f4841w.hashCode();
    }

    @Override // p005a3.AbstractC0207h1
    public final void inspectableProperties(C2404l2 c2404l2) {
        c2404l2.f9457a = "layoutBounds";
        c2404l2.f9459c.m7292c(this.f4841w, "holder");
    }

    public final String toString() {
        return "LayoutBoundsElement(holder=" + this.f4841w + ')';
    }

    @Override // p005a3.AbstractC0207h1
    public final void update(AbstractC2316v abstractC2316v) {
        C39144x c39144x = (C39144x) abstractC2316v;
        C39141w c39141w = this.f4841w;
        c39144x.f168294O = c39141w;
        c39141w.f168289a.setValue(c39144x.f168296Q);
    }
}
