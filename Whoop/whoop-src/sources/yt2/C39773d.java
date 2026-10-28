package yt2;

import androidx.fragment.app.AbstractComponentCallbacksC1320m0;
import c93.InterfaceC4339a;
import com.whoop.weeklyplan.weeklyplan.view.SummaryV2Fragment;
import com.whoop.weeklyplan.weeklyplan.view.WeeklyPlanFragment;

/* JADX INFO: renamed from: yt2.d */
/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class C39773d implements InterfaceC4339a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f171324w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ AbstractComponentCallbacksC1320m0 f171325x;

    public /* synthetic */ C39773d(AbstractComponentCallbacksC1320m0 abstractComponentCallbacksC1320m0, int i13) {
        this.f171324w = i13;
        this.f171325x = abstractComponentCallbacksC1320m0;
    }

    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        switch (this.f171324w) {
            case 0:
                return SummaryV2Fragment.m27996L((SummaryV2Fragment) this.f171325x);
            case 1:
                return SummaryV2Fragment.m28001Q((SummaryV2Fragment) this.f171325x);
            case 2:
                return SummaryV2Fragment.m28002R((SummaryV2Fragment) this.f171325x);
            default:
                return WeeklyPlanFragment.m28007C((WeeklyPlanFragment) this.f171325x);
        }
    }
}
