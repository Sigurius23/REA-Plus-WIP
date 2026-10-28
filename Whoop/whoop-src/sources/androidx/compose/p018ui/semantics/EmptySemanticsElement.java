package androidx.compose.p018ui.semantics;

import p005a3.AbstractC0207h1;
import p026b2.AbstractC2316v;
import p027b3.C2404l2;
import p209i3.C18023e;
import p715kotlin.Metadata;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, m65681d2 = {"Landroidx/compose/ui/semantics/EmptySemanticsElement;", "La3/h1;", "Li3/e;", "ui_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
public final class EmptySemanticsElement extends AbstractC0207h1 {

    /* JADX INFO: renamed from: w */
    public final C18023e f4986w;

    public EmptySemanticsElement(C18023e c18023e) {
        this.f4986w = c18023e;
    }

    @Override // p005a3.AbstractC0207h1
    public final AbstractC2316v create() {
        return this.f4986w;
    }

    public final boolean equals(Object obj) {
        return obj == this;
    }

    public final int hashCode() {
        return System.identityHashCode(this);
    }

    @Override // p005a3.AbstractC0207h1
    public final void inspectableProperties(C2404l2 c2404l2) {
    }

    @Override // p005a3.AbstractC0207h1
    public final /* bridge */ /* synthetic */ void update(AbstractC2316v abstractC2316v) {
    }
}
