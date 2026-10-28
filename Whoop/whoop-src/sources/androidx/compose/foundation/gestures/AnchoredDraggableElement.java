package androidx.compose.foundation.gestures;

import p005a3.AbstractC0207h1;
import p026b2.AbstractC2316v;
import p027b3.C2404l2;
import p031b9.AbstractC2875y;
import p180h0.C16410k;
import p180h0.C16435p;
import p180h0.EnumC16377d2;
import p180h0.InterfaceC16432o1;
import p238j0.InterfaceC21083i;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00030\u0002¨\u0006\u0004"}, m65681d2 = {"Landroidx/compose/foundation/gestures/AnchoredDraggableElement;", "T", "La3/h1;", "Lh0/k;", "foundation_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
final class AnchoredDraggableElement<T> extends AbstractC0207h1 {

    /* JADX INFO: renamed from: w */
    public final C16435p f4516w;

    /* JADX INFO: renamed from: x */
    public final boolean f4517x;

    /* JADX INFO: renamed from: y */
    public final InterfaceC21083i f4518y;

    /* JADX INFO: renamed from: z */
    public final InterfaceC16432o1 f4519z;

    public AnchoredDraggableElement(C16435p c16435p, boolean z4, InterfaceC21083i interfaceC21083i, InterfaceC16432o1 interfaceC16432o1) {
        EnumC16377d2 enumC16377d2 = EnumC16377d2.f62971w;
        this.f4516w = c16435p;
        this.f4517x = z4;
        this.f4518y = interfaceC21083i;
        this.f4519z = interfaceC16432o1;
    }

    @Override // p005a3.AbstractC0207h1
    public final AbstractC2316v create() {
        EnumC16377d2 enumC16377d2 = EnumC16377d2.f62971w;
        return new C16410k(this.f4516w, this.f4517x, this.f4518y, this.f4519z);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AnchoredDraggableElement)) {
            return false;
        }
        AnchoredDraggableElement anchoredDraggableElement = (AnchoredDraggableElement) obj;
        if (!AbstractC22676k.m65745e(this.f4516w, anchoredDraggableElement.f4516w)) {
            return false;
        }
        EnumC16377d2 enumC16377d2 = EnumC16377d2.f62971w;
        return this.f4517x == anchoredDraggableElement.f4517x && AbstractC22676k.m65745e(this.f4518y, anchoredDraggableElement.f4518y) && AbstractC22676k.m65745e(this.f4519z, anchoredDraggableElement.f4519z);
    }

    public final int hashCode() {
        int iM8289b = AbstractC2875y.m8289b((EnumC16377d2.f62971w.hashCode() + (this.f4516w.hashCode() * 31)) * 31, 961, this.f4517x);
        InterfaceC21083i interfaceC21083i = this.f4518y;
        int iHashCode = (iM8289b + (interfaceC21083i != null ? interfaceC21083i.hashCode() : 0)) * 29791;
        InterfaceC16432o1 interfaceC16432o1 = this.f4519z;
        return iHashCode + (interfaceC16432o1 != null ? interfaceC16432o1.hashCode() : 0);
    }

    @Override // p005a3.AbstractC0207h1
    public final void inspectableProperties(C2404l2 c2404l2) {
        c2404l2.m7401c("anchoredDraggable");
        c2404l2.m7400b().m7292c(this.f4516w, "state");
        c2404l2.m7400b().m7292c(EnumC16377d2.f62971w, "orientation");
        c2404l2.m7400b().m7292c(Boolean.valueOf(this.f4517x), "enabled");
        c2404l2.m7400b().m7292c(null, "reverseDirection");
        c2404l2.m7400b().m7292c(this.f4518y, "interactionSource");
        c2404l2.m7400b().m7292c(null, "startDragImmediately");
        c2404l2.m7400b().m7292c(null, "overscrollEffect");
        c2404l2.m7400b().m7292c(this.f4519z, "flingBehavior");
    }

    @Override // p005a3.AbstractC0207h1
    public final void update(AbstractC2316v abstractC2316v) {
        EnumC16377d2 enumC16377d2 = EnumC16377d2.f62971w;
        ((C16410k) abstractC2316v).m46596l1(this.f4516w, this.f4517x, this.f4518y, this.f4519z);
    }
}
