package p078d1;

import androidx.compose.p018ui.node.NodeCoordinator;
import p005a3.InterfaceC0225m;
import p005a3.InterfaceC0229n;
import p005a3.InterfaceC0249s;
import p026b2.AbstractC2316v;
import p133f1.C13977s1;
import p268k0.AbstractC22086a;
import p390p1.AbstractC28683x;
import p390p1.C28633k1;
import p510u0.C34354s0;

/* JADX INFO: renamed from: d1.k */
/* JADX INFO: loaded from: classes5.dex */
public final class C11458k extends AbstractC2316v implements InterfaceC0225m, InterfaceC0249s, InterfaceC0229n {

    /* JADX INFO: renamed from: O */
    public C11449b f36755O;

    /* JADX INFO: renamed from: P */
    public C34354s0 f36756P;

    /* JADX INFO: renamed from: Q */
    public C13977s1 f36757Q;

    /* JADX INFO: renamed from: R */
    public final C28633k1 f36758R = AbstractC28683x.m87272z(null);

    public C11458k(C11449b c11449b, C34354s0 c34354s0, C13977s1 c13977s1) {
        this.f36755O = c11449b;
        this.f36756P = c34354s0;
        this.f36757Q = c13977s1;
    }

    @Override // p005a3.InterfaceC0249s
    /* JADX INFO: renamed from: I0 */
    public final void mo284I0(NodeCoordinator nodeCoordinator) {
        this.f36758R.setValue(nodeCoordinator);
    }

    @Override // p026b2.AbstractC2316v
    /* JADX INFO: renamed from: P0 */
    public final void mo285P0() {
        C11449b c11449b = this.f36755O;
        if (c11449b.f36726a != null) {
            AbstractC22086a.m63160c("Expected textInputModifierNode to be null");
        }
        c11449b.f36726a = this;
    }

    @Override // p026b2.AbstractC2316v
    /* JADX INFO: renamed from: Q0 */
    public final void mo286Q0() {
        this.f36755O.m30728k(this);
    }
}
