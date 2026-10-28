package p003a1;

import androidx.compose.p018ui.node.NodeCoordinator;
import p005a3.AbstractC0233o;
import p005a3.InterfaceC0225m;
import p005a3.InterfaceC0249s;
import p390p1.C28633k1;
import p390p1.C28676v0;
import p512u2.AbstractC34452c0;
import p715kotlin.jvm.functions.Function1;
import s83.AbstractC32275i;

/* JADX INFO: renamed from: a1.i */
/* JADX INFO: loaded from: classes5.dex */
public final class C0110i extends AbstractC0233o implements InterfaceC0225m, InterfaceC0249s {

    /* JADX INFO: renamed from: Q */
    public AbstractC32275i f342Q;

    /* JADX INFO: renamed from: R */
    public final C28633k1 f343R = new C28633k1(null, C28676v0.f115976y);

    /* JADX WARN: Multi-variable type inference failed */
    public C0110i(Function1 function1) {
        this.f342Q = (AbstractC32275i) function1;
        m665X0(AbstractC34452c0.m108902a(new C0107f(this, 0)));
    }

    @Override // p005a3.InterfaceC0249s
    /* JADX INFO: renamed from: I0 */
    public final void mo284I0(NodeCoordinator nodeCoordinator) {
        this.f343R.setValue(nodeCoordinator);
    }
}
