package p005a3;

import androidx.compose.p018ui.node.NodeCoordinator;
import androidx.compose.p018ui.node.Owner;
import c93.InterfaceC4339a;
import l83.C23454a0;
import p635y2.AbstractC39101i1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.AbstractC22680m;

/* JADX INFO: renamed from: a3.b1 */
/* JADX INFO: loaded from: classes5.dex */
public final class C0183b1 extends AbstractC22680m implements InterfaceC4339a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ C0187c1 f583w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Owner f584x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ long f585y;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0183b1(C0187c1 c0187c1, Owner owner, long j7) {
        super(0);
        this.f583w = c0187c1;
        this.f584x = owner;
        this.f585y = j7;
    }

    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        AbstractC0265x0 abstractC0265x0Mo3530e1;
        C0246r0 c0246r0 = this.f583w.f588F;
        AbstractC39101i1 placementScope = null;
        if (AbstractC0201g.m511k(c0246r0.f839a) || c0246r0.f841c) {
            NodeCoordinator nodeCoordinator = c0246r0.m753a().f4860Q;
            if (nodeCoordinator != null) {
                placementScope = nodeCoordinator.f899L;
            }
        } else {
            NodeCoordinator nodeCoordinator2 = c0246r0.m753a().f4860Q;
            if (nodeCoordinator2 != null && (abstractC0265x0Mo3530e1 = nodeCoordinator2.mo3530e1()) != null) {
                placementScope = abstractC0265x0Mo3530e1.f899L;
            }
        }
        if (placementScope == null) {
            placementScope = this.f584x.getPlacementScope();
        }
        AbstractC0265x0 abstractC0265x0Mo3530e2 = c0246r0.m753a().mo3530e1();
        AbstractC22676k.m65747g(abstractC0265x0Mo3530e2);
        AbstractC39101i1.m124623k(placementScope, abstractC0265x0Mo3530e2, this.f585y);
        return C23454a0.f92919a;
    }
}
