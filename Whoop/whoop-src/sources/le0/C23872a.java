package le0;

import c93.InterfaceC4339a;
import com.whoop.advancedlabs.schedulingstep.view.SchedulingStepFragment;

/* JADX INFO: renamed from: le0.a */
/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class C23872a implements InterfaceC4339a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f94392w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ SchedulingStepFragment f94393x;

    public /* synthetic */ C23872a(SchedulingStepFragment schedulingStepFragment, int i13) {
        this.f94392w = i13;
        this.f94393x = schedulingStepFragment;
    }

    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        switch (this.f94392w) {
            case 0:
                return SchedulingStepFragment.m17587Q(this.f94393x);
            case 1:
                return SchedulingStepFragment.m17585O(this.f94393x);
            case 2:
                return SchedulingStepFragment.m17591U(this.f94393x);
            case 3:
                return SchedulingStepFragment.m17592V(this.f94393x);
            default:
                return SchedulingStepFragment.m17586P(this.f94393x);
        }
    }
}
