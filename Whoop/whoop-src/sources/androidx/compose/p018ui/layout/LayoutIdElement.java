package androidx.compose.p018ui.layout;

import p005a3.AbstractC0207h1;
import p026b2.AbstractC2316v;
import p027b3.C2404l2;
import p635y2.C39150z;
import p715kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\b\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, m65681d2 = {"Landroidx/compose/ui/layout/LayoutIdElement;", "La3/h1;", "Ly2/z;", "ui_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
final /* data */ class LayoutIdElement extends AbstractC0207h1 {

    /* JADX INFO: renamed from: w */
    public final String f4843w;

    public LayoutIdElement(String str) {
        this.f4843w = str;
    }

    @Override // p005a3.AbstractC0207h1
    public final AbstractC2316v create() {
        C39150z c39150z = new C39150z();
        c39150z.f168304O = this.f4843w;
        return c39150z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof LayoutIdElement) && this.f4843w.equals(((LayoutIdElement) obj).f4843w);
    }

    public final int hashCode() {
        return this.f4843w.hashCode();
    }

    @Override // p005a3.AbstractC0207h1
    public final void inspectableProperties(C2404l2 c2404l2) {
        c2404l2.f9457a = "layoutId";
        c2404l2.f9458b = this.f4843w;
    }

    public final String toString() {
        return "LayoutIdElement(layoutId=" + ((Object) this.f4843w) + ')';
    }

    @Override // p005a3.AbstractC0207h1
    public final void update(AbstractC2316v abstractC2316v) {
        ((C39150z) abstractC2316v).f168304O = this.f4843w;
    }
}
