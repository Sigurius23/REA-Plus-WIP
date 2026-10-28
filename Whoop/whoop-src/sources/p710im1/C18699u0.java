package p710im1;

import c93.InterfaceC4339a;
import p132f0.C13821r1;

/* JADX INFO: renamed from: im1.u0 */
/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class C18699u0 implements InterfaceC4339a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f73417w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ C13821r1 f73418x;

    public /* synthetic */ C18699u0(C13821r1 c13821r1, int i13) {
        this.f73417w = i13;
        this.f73418x = c13821r1;
    }

    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        switch (this.f73417w) {
            case 0:
                return Integer.valueOf(AbstractC18697t0.e.m54385h(this.f73418x));
            default:
                return Boolean.valueOf(AbstractC18697t0.m54296S0(this.f73418x));
        }
    }
}
