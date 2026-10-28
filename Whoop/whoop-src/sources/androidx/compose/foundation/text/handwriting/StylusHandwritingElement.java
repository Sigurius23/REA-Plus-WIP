package androidx.compose.foundation.text.handwriting;

import c93.InterfaceC4339a;
import p005a3.AbstractC0207h1;
import p026b2.AbstractC2316v;
import p027b3.C2404l2;
import p041c1.C3816a;
import p715kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, m65681d2 = {"Landroidx/compose/foundation/text/handwriting/StylusHandwritingElement;", "La3/h1;", "Lc1/a;", "foundation_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
final class StylusHandwritingElement extends AbstractC0207h1 {

    /* JADX INFO: renamed from: w */
    public final InterfaceC4339a f4666w;

    public StylusHandwritingElement(InterfaceC4339a interfaceC4339a) {
        this.f4666w = interfaceC4339a;
    }

    @Override // p005a3.AbstractC0207h1
    public final AbstractC2316v create() {
        return new C3816a(this.f4666w);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof StylusHandwritingElement) {
            return this.f4666w == ((StylusHandwritingElement) obj).f4666w;
        }
        return false;
    }

    public final int hashCode() {
        return this.f4666w.hashCode();
    }

    @Override // p005a3.AbstractC0207h1
    public final void inspectableProperties(C2404l2 c2404l2) {
        c2404l2.f9457a = "stylusHandwriting";
        c2404l2.f9459c.m7292c(this.f4666w, "onHandwritingSlopExceeded");
    }

    @Override // p005a3.AbstractC0207h1
    public final void update(AbstractC2316v abstractC2316v) {
        ((C3816a) abstractC2316v).f15653Q = this.f4666w;
    }
}
