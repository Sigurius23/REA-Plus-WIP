package androidx.compose.foundation.layout;

import p005a3.AbstractC0207h1;
import p026b2.AbstractC2316v;
import p027b3.C2404l2;
import p291l0.C23003u1;
import p635y2.AbstractC39071a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, m65681d2 = {"Landroidx/compose/foundation/layout/WithAlignmentLineElement;", "La3/h1;", "Ll0/u1;", "foundation-layout"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
public final class WithAlignmentLineElement extends AbstractC0207h1 {

    /* JADX INFO: renamed from: w */
    public final AbstractC39071a f4577w;

    public WithAlignmentLineElement(AbstractC39071a abstractC39071a) {
        this.f4577w = abstractC39071a;
    }

    @Override // p005a3.AbstractC0207h1
    public final AbstractC2316v create() {
        C23003u1 c23003u1 = new C23003u1();
        c23003u1.f90729O = this.f4577w;
        return c23003u1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        WithAlignmentLineElement withAlignmentLineElement = obj instanceof WithAlignmentLineElement ? (WithAlignmentLineElement) obj : null;
        if (withAlignmentLineElement == null) {
            return false;
        }
        return AbstractC22676k.m65745e(this.f4577w, withAlignmentLineElement.f4577w);
    }

    public final int hashCode() {
        return this.f4577w.hashCode();
    }

    @Override // p005a3.AbstractC0207h1
    public final void inspectableProperties(C2404l2 c2404l2) {
        c2404l2.f9457a = "alignBy";
        c2404l2.f9458b = this.f4577w;
    }

    @Override // p005a3.AbstractC0207h1
    public final void update(AbstractC2316v abstractC2316v) {
        ((C23003u1) abstractC2316v).f90729O = this.f4577w;
    }
}
