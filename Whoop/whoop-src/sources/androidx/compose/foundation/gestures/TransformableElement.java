package androidx.compose.foundation.gestures;

import go1.C16016a;
import p005a3.AbstractC0207h1;
import p026b2.AbstractC2316v;
import p027b3.C2365d3;
import p027b3.C2404l2;
import p031b9.AbstractC2875y;
import p180h0.C16489z3;
import p180h0.InterfaceC16361a4;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes5.dex */
@Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, m65681d2 = {"Landroidx/compose/foundation/gestures/TransformableElement;", "La3/h1;", "Lh0/z3;", "foundation_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
final class TransformableElement extends AbstractC0207h1 {

    /* JADX INFO: renamed from: w */
    public final InterfaceC16361a4 f4534w;

    /* JADX INFO: renamed from: x */
    public final C16016a f4535x;

    public TransformableElement(InterfaceC16361a4 interfaceC16361a4, C16016a c16016a) {
        this.f4534w = interfaceC16361a4;
        this.f4535x = c16016a;
    }

    @Override // p005a3.AbstractC0207h1
    public final AbstractC2316v create() {
        return new C16489z3(this.f4534w, this.f4535x);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || TransformableElement.class != obj.getClass()) {
            return false;
        }
        TransformableElement transformableElement = (TransformableElement) obj;
        return AbstractC22676k.m65745e(this.f4534w, transformableElement.f4534w) && this.f4535x == transformableElement.f4535x;
    }

    public final int hashCode() {
        return Boolean.hashCode(true) + AbstractC2875y.m8289b((this.f4535x.hashCode() + (this.f4534w.hashCode() * 31)) * 31, 31, false);
    }

    @Override // p005a3.AbstractC0207h1
    public final void inspectableProperties(C2404l2 c2404l2) {
        c2404l2.f9457a = "transformable";
        C2365d3 c2365d3 = c2404l2.f9459c;
        c2365d3.m7292c(this.f4534w, "state");
        c2365d3.m7292c(this.f4535x, "canPan");
        c2365d3.m7292c(Boolean.TRUE, "enabled");
        c2365d3.m7292c(Boolean.FALSE, "lockRotationOnZoomPan");
    }

    @Override // p005a3.AbstractC0207h1
    public final void update(AbstractC2316v abstractC2316v) {
        C16489z3 c16489z3 = (C16489z3) abstractC2316v;
        c16489z3.f63374R = this.f4535x;
        InterfaceC16361a4 interfaceC16361a4 = c16489z3.f63373Q;
        InterfaceC16361a4 interfaceC16361a5 = this.f4534w;
        if (AbstractC22676k.m65745e(interfaceC16361a4, interfaceC16361a5) && c16489z3.f63375S) {
            return;
        }
        c16489z3.f63373Q = interfaceC16361a5;
        c16489z3.f63375S = true;
        c16489z3.f63379W.m108936Z0();
    }
}
