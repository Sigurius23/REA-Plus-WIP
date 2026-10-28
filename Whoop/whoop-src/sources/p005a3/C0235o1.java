package p005a3;

import androidx.compose.p018ui.node.NodeCoordinator;
import c93.InterfaceC4339a;
import l83.C23454a0;
import p208i2.InterfaceC17915v;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.AbstractC22680m;

/* JADX INFO: renamed from: a3.o1 */
/* JADX INFO: loaded from: classes.dex */
public final class C0235o1 extends AbstractC22680m implements InterfaceC4339a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f805w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ NodeCoordinator f806x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0235o1(NodeCoordinator nodeCoordinator, int i13) {
        super(0);
        this.f805w = i13;
        this.f806x = nodeCoordinator;
    }

    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        switch (this.f805w) {
            case 0:
                NodeCoordinator nodeCoordinator = this.f806x;
                InterfaceC17915v interfaceC17915v = nodeCoordinator.f4874e0;
                AbstractC22676k.m65747g(interfaceC17915v);
                nodeCoordinator.m3525a1(interfaceC17915v, nodeCoordinator.f4873d0);
                break;
            default:
                NodeCoordinator nodeCoordinator2 = this.f806x.f4860Q;
                if (nodeCoordinator2 != null) {
                    nodeCoordinator2.m3542n1();
                }
                break;
        }
        return C23454a0.f92919a;
    }
}
