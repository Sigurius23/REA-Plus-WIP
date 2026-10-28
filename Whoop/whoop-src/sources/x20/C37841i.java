package x20;

import c93.InterfaceC4339a;
import com.stripe.android.paymentsheet.paymentdatacollection.polling.PollingActivity;
import p715kotlin.jvm.internal.AbstractC22680m;

/* JADX INFO: renamed from: x20.i */
/* JADX INFO: loaded from: classes6.dex */
public final class C37841i extends AbstractC22680m implements InterfaceC4339a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f162006w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ PollingActivity f162007x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C37841i(PollingActivity pollingActivity, int i13) {
        super(0);
        this.f162006w = i13;
        this.f162007x = pollingActivity;
    }

    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        switch (this.f162006w) {
            case 0:
                return this.f162007x.getViewModelStore();
            default:
                return this.f162007x.getDefaultViewModelCreationExtras();
        }
    }
}
