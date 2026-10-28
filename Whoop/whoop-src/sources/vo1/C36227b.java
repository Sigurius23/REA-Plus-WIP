package vo1;

import c93.InterfaceC4339a;
import com.whoop.hormonalinsights.menstrualcycleinsights.view.LogCalendarFragment;

/* JADX INFO: renamed from: vo1.b */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class C36227b implements InterfaceC4339a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f155131w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ LogCalendarFragment f155132x;

    public /* synthetic */ C36227b(LogCalendarFragment logCalendarFragment, int i13) {
        this.f155131w = i13;
        this.f155132x = logCalendarFragment;
    }

    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        switch (this.f155131w) {
            case 0:
                return LogCalendarFragment.m21985D(this.f155132x);
            case 1:
                return LogCalendarFragment.m21996O(this.f155132x);
            default:
                return LogCalendarFragment.m21995N(this.f155132x);
        }
    }
}
