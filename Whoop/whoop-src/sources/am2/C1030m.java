package am2;

import c93.InterfaceC4339a;
import p390p1.InterfaceC28670t2;

/* JADX INFO: renamed from: am2.m */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class C1030m implements InterfaceC4339a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f3916w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ InterfaceC28670t2 f3917x;

    public /* synthetic */ C1030m(InterfaceC28670t2 interfaceC28670t2, int i13) {
        this.f3916w = i13;
        this.f3917x = interfaceC28670t2;
    }

    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        boolean zM2802h;
        switch (this.f3916w) {
            case 0:
                zM2802h = AbstractC1026k.k.m2802h(this.f3917x);
                break;
            default:
                zM2802h = AbstractC1046w.a.m3054h(this.f3917x);
                break;
        }
        return Boolean.valueOf(zM2802h);
    }
}
