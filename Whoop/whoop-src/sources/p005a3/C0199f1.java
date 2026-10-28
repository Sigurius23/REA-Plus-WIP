package p005a3;

import androidx.compose.p018ui.node.NodeCoordinator;
import c93.InterfaceC4339a;
import l83.C23454a0;
import p293l2.C23226c;
import p446r1.C30849c;
import p635y2.AbstractC39101i1;
import p636y3.C39178j;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.AbstractC22680m;

/* JADX INFO: renamed from: a3.f1 */
/* JADX INFO: loaded from: classes.dex */
public final class C0199f1 extends AbstractC22680m implements InterfaceC4339a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f649w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C0203g1 f650x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0199f1(C0203g1 c0203g1, int i13) {
        super(0);
        this.f649w = i13;
        this.f650x = c0203g1;
    }

    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        AbstractC39101i1 placementScope;
        switch (this.f649w) {
            case 0:
                C0203g1 c0203g1 = this.f650x;
                C0246r0 c0246r0 = c0203g1.f653F;
                c0246r0.f847i = 0;
                C30849c c30849cM595M = c0246r0.f839a.m595M();
                Object[] objArr = c30849cM595M.f127227w;
                int i13 = c30849cM595M.f127229y;
                for (int i14 = 0; i14 < i13; i14++) {
                    C0203g1 c0203g1M652z = ((C0230n0) objArr[i14]).m652z();
                    c0203g1M652z.f655H = c0203g1M652z.f656I;
                    c0203g1M652z.f656I = Integer.MAX_VALUE;
                    c0203g1M652z.f668U = false;
                    if (c0203g1M652z.f659L == EnumC0214j0.f714x) {
                        c0203g1M652z.f659L = EnumC0214j0.f715y;
                    }
                }
                C0230n0 c0230n0 = c0246r0.f839a;
                C0230n0 c0230n1 = c0246r0.f839a;
                C30849c c30849cM595M2 = c0230n0.m595M();
                Object[] objArr2 = c30849cM595M2.f127227w;
                int i15 = c30849cM595M2.f127229y;
                for (int i16 = 0; i16 < i15; i16++) {
                    ((C0230n0) objArr2[i16]).m643t().f854p.f672Y.f573d = false;
                }
                c0203g1.mo424J().mo789O0().mo777b();
                C30849c c30849cM595M3 = c0230n1.m595M();
                Object[] objArr3 = c30849cM595M3.f127227w;
                int i17 = c30849cM595M3.f127229y;
                for (int i18 = 0; i18 < i17; i18++) {
                    C0230n0 c0230n2 = (C0230n0) objArr3[i18];
                    if (c0230n2.m652z().f655H != c0230n2.m590H()) {
                        c0230n1.m629l0();
                        c0230n1.m598P();
                        if (c0230n2.m590H() == Integer.MAX_VALUE) {
                            if (c0230n2.m643t().f841c) {
                                C0187c1 c0187c1M650y = c0230n2.m650y();
                                AbstractC22676k.m65747g(c0187c1M650y);
                                c0187c1M650y.m439C0(false);
                            }
                            c0230n2.m652z().m524G0();
                        }
                    }
                }
                C30849c c30849cM595M4 = c0230n1.m595M();
                Object[] objArr4 = c30849cM595M4.f127227w;
                int i19 = c30849cM595M4.f127229y;
                for (int i24 = 0; i24 < i19; i24++) {
                    C0234o0 c0234o0 = ((C0230n0) objArr4[i24]).m643t().f854p.f672Y;
                    c0234o0.f574e = c0234o0.f573d;
                }
                break;
            case 1:
                C0203g1 c0203g2 = this.f650x;
                c0203g2.f653F.m753a().mo448T(c0203g2.f676c0);
                break;
            default:
                C0203g1 c0203g3 = this.f650x;
                C0246r0 c0246r1 = c0203g3.f653F;
                NodeCoordinator nodeCoordinator = c0246r1.m753a().f4860Q;
                if (nodeCoordinator == null || (placementScope = nodeCoordinator.f899L) == null) {
                    placementScope = AbstractC0242q0.m750a(c0246r1.f839a).getPlacementScope();
                }
                Function1 function1 = c0203g3.f681h0;
                C23226c c23226c = c0203g3.f682i0;
                if (c23226c != null) {
                    NodeCoordinator nodeCoordinatorM753a = c0246r1.m753a();
                    long j7 = c0203g3.f683j0;
                    float f13 = c0203g3.f684k0;
                    placementScope.getClass();
                    AbstractC39101i1.m124621a(nodeCoordinatorM753a, placementScope);
                    nodeCoordinatorM753a.mo455p0(C39178j.m124794d(j7, nodeCoordinatorM753a.f168210E), f13, c23226c);
                } else if (function1 == null) {
                    NodeCoordinator nodeCoordinatorM753a2 = c0246r1.m753a();
                    long j13 = c0203g3.f683j0;
                    float f14 = c0203g3.f684k0;
                    placementScope.getClass();
                    AbstractC39101i1.m124621a(nodeCoordinatorM753a2, placementScope);
                    nodeCoordinatorM753a2.mo453o0(C39178j.m124794d(j13, nodeCoordinatorM753a2.f168210E), f14, null);
                } else {
                    NodeCoordinator nodeCoordinatorM753a3 = c0246r1.m753a();
                    long j14 = c0203g3.f683j0;
                    float f15 = c0203g3.f684k0;
                    placementScope.getClass();
                    AbstractC39101i1.m124621a(nodeCoordinatorM753a3, placementScope);
                    nodeCoordinatorM753a3.mo453o0(C39178j.m124794d(j14, nodeCoordinatorM753a3.f168210E), f15, function1);
                }
                break;
        }
        return C23454a0.f92919a;
    }
}
