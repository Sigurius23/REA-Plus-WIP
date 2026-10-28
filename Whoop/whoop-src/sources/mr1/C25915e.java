package mr1;

import androidx.compose.runtime.Composer;
import c93.InterfaceC4351m;
import com.whoop.internal.checkout.UniversalCheckoutDataFetchFragment;

/* JADX INFO: renamed from: mr1.e */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class C25915e implements InterfaceC4351m {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f102301w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ UniversalCheckoutDataFetchFragment f102302x;

    public /* synthetic */ C25915e(UniversalCheckoutDataFetchFragment universalCheckoutDataFetchFragment, int i13) {
        this.f102301w = i13;
        this.f102302x = universalCheckoutDataFetchFragment;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        int i13 = this.f102301w;
        Composer composer = (Composer) obj;
        int iIntValue = ((Integer) obj2).intValue();
        switch (i13) {
            case 0:
                return UniversalCheckoutDataFetchFragment.m22271A(this.f102302x, composer, iIntValue);
            default:
                return UniversalCheckoutDataFetchFragment.m22272B(this.f102302x, composer, iIntValue);
        }
    }
}
