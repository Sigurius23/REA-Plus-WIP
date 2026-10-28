package androidx.compose.p018ui.input.key;

import p005a3.AbstractC0207h1;
import p026b2.AbstractC2316v;
import p027b3.C2404l2;
import p477s2.C32075g;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, m65681d2 = {"Landroidx/compose/ui/input/key/KeyInputElement;", "La3/h1;", "Ls2/g;", "ui_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
final class KeyInputElement extends AbstractC0207h1 {

    /* JADX INFO: renamed from: w */
    public final Function1 f4830w;

    /* JADX INFO: renamed from: x */
    public final Function1 f4831x;

    public KeyInputElement(Function1 function1, Function1 function2) {
        this.f4830w = function1;
        this.f4831x = function2;
    }

    @Override // p005a3.AbstractC0207h1
    public final AbstractC2316v create() {
        C32075g c32075g = new C32075g();
        c32075g.f133020O = this.f4830w;
        c32075g.f133021P = this.f4831x;
        return c32075g;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof KeyInputElement)) {
            return false;
        }
        KeyInputElement keyInputElement = (KeyInputElement) obj;
        return this.f4830w == keyInputElement.f4830w && this.f4831x == keyInputElement.f4831x;
    }

    public final int hashCode() {
        Function1 function1 = this.f4830w;
        int iHashCode = (function1 != null ? function1.hashCode() : 0) * 31;
        Function1 function2 = this.f4831x;
        return iHashCode + (function2 != null ? function2.hashCode() : 0);
    }

    @Override // p005a3.AbstractC0207h1
    public final void inspectableProperties(C2404l2 c2404l2) {
        Function1 function1 = this.f4830w;
        if (function1 != null) {
            c2404l2.m7401c("onKeyEvent");
            c2404l2.m7400b().m7292c(function1, "onKeyEvent");
        }
        Function1 function2 = this.f4831x;
        if (function2 != null) {
            c2404l2.m7401c("onPreviewKeyEvent");
            c2404l2.m7400b().m7292c(function2, "onPreviewKeyEvent");
        }
    }

    @Override // p005a3.AbstractC0207h1
    public final void update(AbstractC2316v abstractC2316v) {
        C32075g c32075g = (C32075g) abstractC2316v;
        c32075g.f133020O = this.f4830w;
        c32075g.f133021P = this.f4831x;
    }
}
