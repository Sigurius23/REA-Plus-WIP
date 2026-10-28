package p445r0;

import androidx.compose.p018ui.node.NodeCoordinator;
import c93.InterfaceC4339a;
import p005a3.C0271z0;
import p715kotlin.jvm.internal.AbstractC22674j;
import p715kotlin.jvm.internal.C22672i;

/* JADX INFO: renamed from: r0.e */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class C30837e extends C22672i implements InterfaceC4339a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ C30838f f127142w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ NodeCoordinator f127143x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ C0271z0 f127144y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30837e(C30838f c30838f, NodeCoordinator nodeCoordinator, C0271z0 c0271z0) {
        super(0, AbstractC22674j.class, "localRect", "bringIntoView$localRect(Landroidx/compose/foundation/relocation/BringIntoViewResponderNode;Landroidx/compose/ui/layout/LayoutCoordinates;Lkotlin/jvm/functions/Function0;)Landroidx/compose/ui/geometry/Rect;", 0);
        this.f127142w = c30838f;
        this.f127143x = nodeCoordinator;
        this.f127144y = c0271z0;
    }

    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        return C30838f.m94840X0(this.f127142w, this.f127143x, this.f127144y);
    }
}
