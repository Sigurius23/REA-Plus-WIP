package androidx.compose.p018ui.draw;

import p005a3.AbstractC0207h1;
import p026b2.AbstractC2316v;
import p027b3.C2404l2;
import p134f2.C14014c;
import p134f2.C14015d;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, m65681d2 = {"Landroidx/compose/ui/draw/DrawWithCacheElement;", "La3/h1;", "Lf2/c;", "ui_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
final class DrawWithCacheElement extends AbstractC0207h1 {

    /* JADX INFO: renamed from: w */
    public final Function1 f4776w;

    public DrawWithCacheElement(Function1 function1) {
        this.f4776w = function1;
    }

    @Override // p005a3.AbstractC0207h1
    public final AbstractC2316v create() {
        return new C14014c(new C14015d(), this.f4776w);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof DrawWithCacheElement) {
            return this.f4776w == ((DrawWithCacheElement) obj).f4776w;
        }
        return false;
    }

    public final int hashCode() {
        return this.f4776w.hashCode();
    }

    @Override // p005a3.AbstractC0207h1
    public final void inspectableProperties(C2404l2 c2404l2) {
        c2404l2.m7401c("drawWithCache");
        c2404l2.m7400b().m7292c(this.f4776w, "onBuildDrawCache");
    }

    @Override // p005a3.AbstractC0207h1
    public final void update(AbstractC2316v abstractC2316v) {
        C14014c c14014c = (C14014c) abstractC2316v;
        c14014c.f50035Q = this.f4776w;
        c14014c.m39909X0();
    }
}
