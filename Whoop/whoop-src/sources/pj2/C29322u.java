package pj2;

import c93.InterfaceC4339a;
import com.whoop.stress.view.StressSessionFragment;

/* JADX INFO: renamed from: pj2.u */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class C29322u implements InterfaceC4339a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f118767w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ StressSessionFragment f118768x;

    public /* synthetic */ C29322u(StressSessionFragment stressSessionFragment, int i13) {
        this.f118767w = i13;
        this.f118768x = stressSessionFragment;
    }

    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        switch (this.f118767w) {
            case 0:
                return StressSessionFragment.m26467i0(this.f118768x);
            case 1:
                return StressSessionFragment.m26454V(this.f118768x);
            default:
                return StressSessionFragment.m26450R(this.f118768x);
        }
    }
}
