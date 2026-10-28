package androidx.compose.p018ui.draw;

import p005a3.AbstractC0207h1;
import p026b2.AbstractC2316v;
import p027b3.C2404l2;
import p134f2.C14016e;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, m65681d2 = {"Landroidx/compose/ui/draw/DrawBehindElement;", "La3/h1;", "Lf2/e;", "ui_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
final class DrawBehindElement extends AbstractC0207h1 {

    /* JADX INFO: renamed from: w */
    public final Function1 f4775w;

    public DrawBehindElement(Function1 function1) {
        this.f4775w = function1;
    }

    @Override // p005a3.AbstractC0207h1
    public final AbstractC2316v create() {
        C14016e c14016e = new C14016e();
        c14016e.f50038O = this.f4775w;
        return c14016e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof DrawBehindElement) {
            return this.f4775w == ((DrawBehindElement) obj).f4775w;
        }
        return false;
    }

    public final int hashCode() {
        return this.f4775w.hashCode();
    }

    @Override // p005a3.AbstractC0207h1
    public final void inspectableProperties(C2404l2 c2404l2) {
        c2404l2.m7401c("drawBehind");
        c2404l2.m7400b().m7292c(this.f4775w, "onDraw");
    }

    @Override // p005a3.AbstractC0207h1
    public final void update(AbstractC2316v abstractC2316v) {
        ((C14016e) abstractC2316v).f50038O = this.f4775w;
    }
}
