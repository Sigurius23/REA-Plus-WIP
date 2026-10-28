package fe0;

import androidx.compose.runtime.Composer;
import c93.InterfaceC4351m;
import com.whoop.advancedlabs.schedulingform.view.SchedulingFormFragment;

/* JADX INFO: renamed from: fe0.b */
/* JADX INFO: loaded from: classes7.dex */
public final /* synthetic */ class C14412b implements InterfaceC4351m {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f52569w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ SchedulingFormFragment f52570x;

    public /* synthetic */ C14412b(SchedulingFormFragment schedulingFormFragment, int i13) {
        this.f52569w = i13;
        this.f52570x = schedulingFormFragment;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        int i13 = this.f52569w;
        Composer composer = (Composer) obj;
        int iIntValue = ((Integer) obj2).intValue();
        switch (i13) {
            case 0:
                return SchedulingFormFragment.m17564g0(this.f52570x, composer, iIntValue);
            default:
                return SchedulingFormFragment.m17558a0(this.f52570x, composer, iIntValue);
        }
    }
}
