package androidx.compose.foundation.gestures;

import gm1.C15992b;
import p005a3.AbstractC0207h1;
import p026b2.AbstractC2316v;
import p027b3.C2404l2;
import p031b9.AbstractC2875y;
import p180h0.C16422m1;
import p180h0.EnumC16377d2;
import p180h0.InterfaceC16427n1;
import p238j0.InterfaceC21083i;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function3;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, m65681d2 = {"Landroidx/compose/foundation/gestures/DraggableElement;", "La3/h1;", "Lh0/m1;", "foundation_release"}, m65682k = 1, m65683mv = {2, 0, 0}, m65685xi = 48)
public final class DraggableElement extends AbstractC0207h1 {

    /* JADX INFO: renamed from: I */
    public static final C15992b f4520I = new C15992b(27);

    /* JADX INFO: renamed from: E */
    public final boolean f4521E;

    /* JADX INFO: renamed from: F */
    public final Function3 f4522F;

    /* JADX INFO: renamed from: G */
    public final Function3 f4523G;

    /* JADX INFO: renamed from: H */
    public final boolean f4524H;

    /* JADX INFO: renamed from: w */
    public final InterfaceC16427n1 f4525w;

    /* JADX INFO: renamed from: x */
    public final EnumC16377d2 f4526x;

    /* JADX INFO: renamed from: y */
    public final boolean f4527y;

    /* JADX INFO: renamed from: z */
    public final InterfaceC21083i f4528z;

    public DraggableElement(InterfaceC16427n1 interfaceC16427n1, EnumC16377d2 enumC16377d2, boolean z4, InterfaceC21083i interfaceC21083i, boolean z13, Function3 function3, Function3 function4, boolean z14) {
        this.f4525w = interfaceC16427n1;
        this.f4526x = enumC16377d2;
        this.f4527y = z4;
        this.f4528z = interfaceC21083i;
        this.f4521E = z13;
        this.f4522F = function3;
        this.f4523G = function4;
        this.f4524H = z14;
    }

    @Override // p005a3.AbstractC0207h1
    public final AbstractC2316v create() {
        C15992b c15992b = f4520I;
        boolean z4 = this.f4527y;
        InterfaceC21083i interfaceC21083i = this.f4528z;
        EnumC16377d2 enumC16377d2 = this.f4526x;
        C16422m1 c16422m1 = new C16422m1(c15992b, z4, interfaceC21083i, enumC16377d2);
        c16422m1.f63114Z = this.f4525w;
        c16422m1.f63115a0 = enumC16377d2;
        c16422m1.f63116b0 = this.f4521E;
        c16422m1.f63117c0 = this.f4522F;
        c16422m1.f63118d0 = this.f4523G;
        c16422m1.f63119e0 = this.f4524H;
        return c16422m1;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || DraggableElement.class != obj.getClass()) {
            return false;
        }
        DraggableElement draggableElement = (DraggableElement) obj;
        return AbstractC22676k.m65745e(this.f4525w, draggableElement.f4525w) && this.f4526x == draggableElement.f4526x && this.f4527y == draggableElement.f4527y && AbstractC22676k.m65745e(this.f4528z, draggableElement.f4528z) && this.f4521E == draggableElement.f4521E && AbstractC22676k.m65745e(this.f4522F, draggableElement.f4522F) && AbstractC22676k.m65745e(this.f4523G, draggableElement.f4523G) && this.f4524H == draggableElement.f4524H;
    }

    public final int hashCode() {
        int iM8289b = AbstractC2875y.m8289b((this.f4526x.hashCode() + (this.f4525w.hashCode() * 31)) * 31, 31, this.f4527y);
        InterfaceC21083i interfaceC21083i = this.f4528z;
        return Boolean.hashCode(this.f4524H) + ((this.f4523G.hashCode() + ((this.f4522F.hashCode() + AbstractC2875y.m8289b((iM8289b + (interfaceC21083i != null ? interfaceC21083i.hashCode() : 0)) * 31, 31, this.f4521E)) * 31)) * 31);
    }

    @Override // p005a3.AbstractC0207h1
    public final void inspectableProperties(C2404l2 c2404l2) {
        c2404l2.m7401c("draggable");
        c2404l2.m7400b().m7292c(this.f4526x, "orientation");
        c2404l2.m7400b().m7292c(Boolean.valueOf(this.f4527y), "enabled");
        c2404l2.m7400b().m7292c(Boolean.valueOf(this.f4524H), "reverseDirection");
        c2404l2.m7400b().m7292c(this.f4528z, "interactionSource");
        c2404l2.m7400b().m7292c(Boolean.valueOf(this.f4521E), "startDragImmediately");
        c2404l2.m7400b().m7292c(this.f4522F, "onDragStarted");
        c2404l2.m7400b().m7292c(this.f4523G, "onDragStopped");
        c2404l2.m7400b().m7292c(this.f4525w, "state");
    }

    @Override // p005a3.AbstractC0207h1
    public final void update(AbstractC2316v abstractC2316v) {
        boolean z4;
        boolean z13;
        C16422m1 c16422m1 = (C16422m1) abstractC2316v;
        InterfaceC16427n1 interfaceC16427n1 = c16422m1.f63114Z;
        InterfaceC16427n1 interfaceC16427n2 = this.f4525w;
        if (AbstractC22676k.m65745e(interfaceC16427n1, interfaceC16427n2)) {
            z4 = false;
        } else {
            c16422m1.f63114Z = interfaceC16427n2;
            z4 = true;
        }
        EnumC16377d2 enumC16377d2 = c16422m1.f63115a0;
        EnumC16377d2 enumC16377d3 = this.f4526x;
        if (enumC16377d2 != enumC16377d3) {
            c16422m1.f63115a0 = enumC16377d3;
            z4 = true;
        }
        boolean z14 = c16422m1.f63119e0;
        boolean z15 = this.f4524H;
        if (z14 != z15) {
            c16422m1.f63119e0 = z15;
            z13 = true;
        } else {
            z13 = z4;
        }
        c16422m1.f63117c0 = this.f4522F;
        c16422m1.f63118d0 = this.f4523G;
        c16422m1.f63116b0 = this.f4521E;
        c16422m1.m46585i1(f4520I, this.f4527y, this.f4528z, enumC16377d3, z13);
    }
}
