package am2;

import c93.InterfaceC4339a;
import com.whoop.trends.view.TrendsFragment;

/* JADX INFO: renamed from: am2.z */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class C1049z implements InterfaceC4339a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f4080w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ TrendsFragment f4081x;

    public /* synthetic */ C1049z(TrendsFragment trendsFragment, int i13) {
        this.f4080w = i13;
        this.f4081x = trendsFragment;
    }

    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        switch (this.f4080w) {
            case 0:
                return TrendsFragment.m26628f0(this.f4081x);
            case 1:
                return TrendsFragment.m26627e0(this.f4081x);
            case 2:
                return TrendsFragment.m26618V(this.f4081x);
            case 3:
                return TrendsFragment.m26617U(this.f4081x);
            case 4:
                return TrendsFragment.m26632j0(this.f4081x);
            default:
                return TrendsFragment.m26633k0(this.f4081x);
        }
    }
}
