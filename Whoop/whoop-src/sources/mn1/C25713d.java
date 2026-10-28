package mn1;

import c93.InterfaceC4339a;
import p390p1.InterfaceC28670t2;
import p711j31.C21280k;

/* JADX INFO: renamed from: mn1.d */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class C25713d implements InterfaceC4339a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f101298w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Object f101299x;

    public /* synthetic */ C25713d(Object obj, int i13) {
        this.f101298w = i13;
        this.f101299x = obj;
    }

    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        switch (this.f101298w) {
            case 0:
                return AbstractC25712c.k.m75755h((C21280k) this.f101299x);
            default:
                return AbstractC25712c.l.m75757h((InterfaceC28670t2) this.f101299x);
        }
    }
}
