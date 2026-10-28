package androidx.compose.material3.internal;

import kx1.C22881b;
import p005a3.AbstractC0201g;
import p005a3.AbstractC0207h1;
import p026b2.AbstractC2316v;
import p027b3.C2404l2;
import p316m1.C24921s;
import p715kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, m65681d2 = {"Landroidx/compose/material3/internal/ChildSemanticsNodeElement;", "La3/h1;", "Lm1/s;", "material3"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
public final class ChildSemanticsNodeElement extends AbstractC0207h1 {

    /* JADX INFO: renamed from: w */
    public final C22881b f4761w;

    public ChildSemanticsNodeElement(C22881b c22881b) {
        this.f4761w = c22881b;
    }

    @Override // p005a3.AbstractC0207h1
    public final AbstractC2316v create() {
        C24921s c24921s = new C24921s();
        c24921s.f97604O = this.f4761w;
        return c24921s;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ChildSemanticsNodeElement) {
            return this.f4761w == ((ChildSemanticsNodeElement) obj).f4761w;
        }
        return false;
    }

    public final int hashCode() {
        return this.f4761w.hashCode();
    }

    @Override // p005a3.AbstractC0207h1
    public final void inspectableProperties(C2404l2 c2404l2) {
        c2404l2.f9457a = "childSemantics";
        c2404l2.f9459c.m7292c(this.f4761w, "properties");
    }

    @Override // p005a3.AbstractC0207h1
    public final void update(AbstractC2316v abstractC2316v) {
        C24921s c24921s = (C24921s) abstractC2316v;
        c24921s.f97604O = this.f4761w;
        AbstractC0201g.m510j(c24921s);
    }
}
