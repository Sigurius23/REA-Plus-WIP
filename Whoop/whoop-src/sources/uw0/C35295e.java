package uw0;

import c93.InterfaceC4339a;
import p329n0.C26068u;

/* JADX INFO: renamed from: uw0.e */
/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class C35295e implements InterfaceC4339a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f150301w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C26068u f150302x;

    public /* synthetic */ C35295e(C26068u c26068u, int i13) {
        this.f150301w = i13;
        this.f150302x = c26068u;
    }

    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        boolean zM111976A;
        switch (this.f150301w) {
            case 0:
                zM111976A = AbstractC35296f.m111976A(this.f150302x);
                break;
            default:
                zM111976A = AbstractC35302l.m112036u(this.f150302x);
                break;
        }
        return Boolean.valueOf(zM111976A);
    }
}
