package n20;

import androidx.lifecycle.AbstractC1640x1;
import bc3.InterfaceC2994c0;
import e10.C12560n0;
import e10.C12570s0;
import p715kotlin.jvm.internal.AbstractC22676k;
import v03.InterfaceC35517d;
import v03.InterfaceC35521h;

/* JADX INFO: renamed from: n20.s */
/* JADX INFO: loaded from: classes6.dex */
public final class C26184s implements InterfaceC35517d {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f103850w;

    /* JADX INFO: renamed from: x */
    public final C12570s0 f103851x;

    /* JADX INFO: renamed from: y */
    public final InterfaceC35521h f103852y;

    public /* synthetic */ C26184s(C12570s0 c12570s0, InterfaceC35521h interfaceC35521h, int i13) {
        this.f103850w = i13;
        this.f103851x = c12570s0;
        this.f103852y = interfaceC35521h;
    }

    @Override // k83.InterfaceC22297a
    public final Object get() {
        switch (this.f103850w) {
            case 0:
                C12560n0 c12560n0 = (C12560n0) this.f103851x.get();
                C26186u viewModel = (C26186u) this.f103852y.get();
                AbstractC22676k.m65750j(viewModel, "viewModel");
                return c12560n0.m35244a(AbstractC1640x1.m5043b(viewModel));
            default:
                C12560n0 c12560n1 = (C12560n0) this.f103851x.get();
                InterfaceC2994c0 coroutineScope = (InterfaceC2994c0) this.f103852y.get();
                AbstractC22676k.m65750j(coroutineScope, "coroutineScope");
                return c12560n1.m35244a(coroutineScope);
        }
    }
}
