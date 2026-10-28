package p710im1;

import c93.InterfaceC4339a;
import com.whoop.home.view.HomeFragment;
import p132f0.C13821r1;
import p329n0.C26068u;
import p390p1.InterfaceC28601c1;

/* JADX INFO: renamed from: im1.v0 */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class C18701v0 implements InterfaceC4339a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f73422w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Object f73423x;

    public /* synthetic */ C18701v0(Object obj, int i13) {
        this.f73422w = i13;
        this.f73423x = obj;
    }

    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        switch (this.f73422w) {
            case 0:
                return Boolean.valueOf(AbstractC18703w0.a.m54394h((C26068u) this.f73423x));
            case 1:
                return Boolean.valueOf(AbstractC18661c.m54135h((C13821r1) this.f73423x));
            case 2:
                return Boolean.valueOf(HomeFragment.m21775R0((HomeFragment) this.f73423x));
            case 3:
                return AbstractC18669f0.m54197h((InterfaceC4339a) this.f73423x);
            default:
                return AbstractC18697t0.m54325e1((InterfaceC28601c1) this.f73423x);
        }
    }
}
