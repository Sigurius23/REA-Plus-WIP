package p132f0;

import c93.InterfaceC4339a;
import l83.C23454a0;
import p181h2.C16617b;
import p635y2.InterfaceC39147y;

/* JADX INFO: renamed from: f0.w0 */
/* JADX INFO: loaded from: classes5.dex */
public final /* synthetic */ class C13834w0 implements InterfaceC4339a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f49358w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C13836x0 f49359x;

    public /* synthetic */ C13834w0(C13836x0 c13836x0, int i13) {
        this.f49358w = i13;
        this.f49359x = c13836x0;
    }

    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        switch (this.f49358w) {
            case 0:
                this.f49359x.m39195Z0();
                return C23454a0.f92919a;
            case 1:
                return new C16617b(this.f49359x.f49369W);
            default:
                InterfaceC39147y interfaceC39147y = (InterfaceC39147y) this.f49359x.f49367U.getValue();
                return new C16617b(interfaceC39147y != null ? interfaceC39147y.mo3523Z(0L) : 9205357640488583168L);
        }
    }
}
