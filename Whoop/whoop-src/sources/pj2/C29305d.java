package pj2;

import c93.InterfaceC4339a;
import com.whoop.stress.view.StressMonitorFragment;

/* JADX INFO: renamed from: pj2.d */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class C29305d implements InterfaceC4339a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f118651w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ StressMonitorFragment f118652x;

    public /* synthetic */ C29305d(StressMonitorFragment stressMonitorFragment, int i13) {
        this.f118651w = i13;
        this.f118652x = stressMonitorFragment;
    }

    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        switch (this.f118651w) {
            case 0:
                return StressMonitorFragment.m26429e0(this.f118652x);
            default:
                return StressMonitorFragment.m26417S(this.f118652x);
        }
    }
}
