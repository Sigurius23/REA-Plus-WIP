package az1;

import c93.InterfaceC4339a;
import p114eb.C12991u0;
import zk1.AbstractC40837a;

/* JADX INFO: renamed from: az1.m */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class C2172m implements InterfaceC4339a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f8629w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C12991u0 f8630x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ InterfaceC4339a f8631y;

    public /* synthetic */ C2172m(C12991u0 c12991u0, InterfaceC4339a interfaceC4339a, int i13) {
        this.f8629w = i13;
        this.f8630x = c12991u0;
        this.f8631y = interfaceC4339a;
    }

    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        switch (this.f8629w) {
            case 0:
                return AbstractC2173n.m6811Q(this.f8630x, this.f8631y);
            case 1:
                return AbstractC2173n.m6807M(this.f8630x, this.f8631y);
            case 2:
                return AbstractC2173n.m6805K(this.f8630x, this.f8631y);
            case 3:
                return AbstractC2173n.m6809O(this.f8630x, this.f8631y);
            default:
                return AbstractC40837a.m132346r(this.f8630x, this.f8631y);
        }
    }
}
