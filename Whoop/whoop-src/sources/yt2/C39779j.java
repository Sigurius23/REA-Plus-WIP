package yt2;

import androidx.compose.runtime.Composer;
import c93.InterfaceC4351m;
import com.whoop.weeklyplan.weeklyplan.view.SummaryV2Fragment;
import com.whoop.weeklyplan.weeklyplan.view.WeeklyPlanFragment;
import p390p1.InterfaceC28690z0;

/* JADX INFO: renamed from: yt2.j */
/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class C39779j implements InterfaceC4351m {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f171336w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ Object f171337x;

    public /* synthetic */ C39779j(Object obj, int i13) {
        this.f171336w = i13;
        this.f171337x = obj;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f171336w) {
            case 0:
                return AbstractC39780k.a.m127423h((InterfaceC28690z0) this.f171337x, ((Float) obj).floatValue(), ((Float) obj2).floatValue());
            case 1:
                return SummaryV2Fragment.m27997M((SummaryV2Fragment) this.f171337x, (Composer) obj, ((Integer) obj2).intValue());
            default:
                return WeeklyPlanFragment.m28008D((WeeklyPlanFragment) this.f171337x, (Composer) obj, ((Integer) obj2).intValue());
        }
    }
}
