package p445r0;

import androidx.compose.p018ui.node.NodeCoordinator;
import bc3.AbstractC3006f0;
import l83.C23454a0;
import p005a3.AbstractC0201g;
import p005a3.C0271z0;
import p005a3.InterfaceC0178a0;
import p026b2.AbstractC2316v;
import p135f3.InterfaceC14037a;
import p180h0.C16470w;
import p181h2.C16618c;
import p292l1.C23186v;
import p329n0.C26057j;
import p530up.AbstractC35148d;
import p635y2.InterfaceC39147y;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32269c;

/* JADX INFO: renamed from: r0.f */
/* JADX INFO: loaded from: classes.dex */
public final class C30838f extends AbstractC2316v implements InterfaceC14037a, InterfaceC0178a0 {

    /* JADX INFO: renamed from: O */
    public C16470w f127145O;

    /* JADX INFO: renamed from: P */
    public boolean f127146P;

    /* JADX INFO: renamed from: X0 */
    public static final C16618c m94840X0(C30838f c30838f, NodeCoordinator nodeCoordinator, C0271z0 c0271z0) {
        C16618c c16618c;
        if (c30838f.f9141N && c30838f.f127146P) {
            NodeCoordinator nodeCoordinatorM515o = AbstractC0201g.m515o(c30838f);
            if (!nodeCoordinator.mo3533g1().f9141N) {
                nodeCoordinator = null;
            }
            if (nodeCoordinator != null && (c16618c = (C16618c) c0271z0.invoke()) != null) {
                return AbstractC35148d.m111180k(nodeCoordinatorM515o, nodeCoordinator, c16618c);
            }
        }
        return null;
    }

    @Override // p026b2.AbstractC2316v
    /* JADX INFO: renamed from: M0 */
    public final boolean mo3462M0() {
        return false;
    }

    @Override // p005a3.InterfaceC0178a0
    /* JADX INFO: renamed from: N */
    public final void mo422N(InterfaceC39147y interfaceC39147y) {
        this.f127146P = true;
    }

    @Override // p135f3.InterfaceC14037a
    /* JADX INFO: renamed from: o0 */
    public final Object mo7407o0(NodeCoordinator nodeCoordinator, C0271z0 c0271z0, AbstractC32269c abstractC32269c) {
        Object objM8719m = AbstractC3006f0.m8719m(new C23186v(this, nodeCoordinator, c0271z0, new C26057j(this, nodeCoordinator, c0271z0, 24), (InterfaceC30057d) null, 1), abstractC32269c);
        return objM8719m == EnumC31071a.f128113w ? objM8719m : C23454a0.f92919a;
    }
}
