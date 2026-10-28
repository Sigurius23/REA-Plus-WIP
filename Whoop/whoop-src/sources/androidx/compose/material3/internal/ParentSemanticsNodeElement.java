package androidx.compose.material3.internal;

import js2.C21930h;
import p005a3.AbstractC0201g;
import p005a3.AbstractC0207h1;
import p026b2.AbstractC2316v;
import p027b3.C2404l2;
import p316m1.C24895c0;
import p715kotlin.Metadata;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, m65681d2 = {"Landroidx/compose/material3/internal/ParentSemanticsNodeElement;", "La3/h1;", "Lm1/c0;", "material3"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
public final class ParentSemanticsNodeElement extends AbstractC0207h1 {

    /* JADX INFO: renamed from: w */
    public final C21930h f4764w;

    public ParentSemanticsNodeElement(C21930h c21930h) {
        this.f4764w = c21930h;
    }

    @Override // p005a3.AbstractC0207h1
    public final AbstractC2316v create() {
        C24895c0 c24895c0 = new C24895c0();
        c24895c0.f97520O = this.f4764w;
        return c24895c0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ParentSemanticsNodeElement) {
            return this.f4764w == ((ParentSemanticsNodeElement) obj).f4764w;
        }
        return false;
    }

    public final int hashCode() {
        return this.f4764w.hashCode();
    }

    @Override // p005a3.AbstractC0207h1
    public final void inspectableProperties(C2404l2 c2404l2) {
        c2404l2.f9457a = "parentSemantics";
        c2404l2.f9459c.m7292c(this.f4764w, "properties");
    }

    @Override // p005a3.AbstractC0207h1
    public final void update(AbstractC2316v abstractC2316v) {
        C24895c0 c24895c0 = (C24895c0) abstractC2316v;
        c24895c0.f97520O = this.f4764w;
        AbstractC0201g.m510j(c24895c0);
    }
}
