package am2;

import c93.InterfaceC4339a;
import p390p1.InterfaceC28601c1;

/* JADX INFO: renamed from: am2.e */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class C1014e implements InterfaceC4339a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f3801w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ InterfaceC28601c1 f3802x;

    public /* synthetic */ C1014e(int i13, InterfaceC28601c1 interfaceC28601c1) {
        this.f3801w = i13;
        this.f3802x = interfaceC28601c1;
    }

    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        switch (this.f3801w) {
            case 0:
                return AbstractC1026k.m2744R(this.f3802x);
            case 1:
                return AbstractC1046w.m3009U(this.f3802x);
            case 2:
                return AbstractC1046w.m3012X(this.f3802x);
            default:
                return AbstractC1035o0.m2844R0(this.f3802x);
        }
    }
}
