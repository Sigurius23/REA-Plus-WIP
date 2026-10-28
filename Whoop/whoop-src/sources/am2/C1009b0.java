package am2;

import androidx.compose.runtime.Composer;
import c93.InterfaceC4351m;
import com.whoop.trends.view.TrendsFragment;
import com.whoop.util.TrendKey;

/* JADX INFO: renamed from: am2.b0 */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class C1009b0 implements InterfaceC4351m {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f3787w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ TrendsFragment f3788x;

    public /* synthetic */ C1009b0(TrendsFragment trendsFragment, int i13) {
        this.f3787w = i13;
        this.f3788x = trendsFragment;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f3787w) {
            case 0:
                return TrendsFragment.m26637o0(this.f3788x, obj, (TrendKey) obj2);
            default:
                int iIntValue = ((Integer) obj2).intValue();
                return TrendsFragment.m26629g0(this.f3788x, (Composer) obj, iIntValue);
        }
    }
}
