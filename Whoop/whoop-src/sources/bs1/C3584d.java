package bs1;

import c93.InterfaceC4339a;

/* JADX INFO: renamed from: bs1.d */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class C3584d implements InterfaceC4339a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f14571w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ InterfaceC4339a f14572x;

    public /* synthetic */ C3584d(InterfaceC4339a interfaceC4339a, int i13) {
        this.f14571w = i13;
        this.f14572x = interfaceC4339a;
    }

    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        switch (this.f14571w) {
            case 0:
                return AbstractC3587f.m10940k(this.f14572x);
            case 1:
                return AbstractC3583c0.m10875p1(this.f14572x);
            default:
                return AbstractC3583c0.m10748E0(this.f14572x);
        }
    }
}
