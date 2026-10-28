package v20;

import c93.InterfaceC4339a;
import com.stripe.android.paymentsheet.paymentdatacollection.bacs.BacsMandateConfirmationActivity;
import p715kotlin.jvm.internal.AbstractC22680m;

/* JADX INFO: renamed from: v20.d */
/* JADX INFO: loaded from: classes6.dex */
public final class C35564d extends AbstractC22680m implements InterfaceC4339a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f151293w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ BacsMandateConfirmationActivity f151294x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C35564d(BacsMandateConfirmationActivity bacsMandateConfirmationActivity, int i13) {
        super(0);
        this.f151293w = i13;
        this.f151294x = bacsMandateConfirmationActivity;
    }

    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        switch (this.f151293w) {
            case 0:
                return this.f151294x.getViewModelStore();
            default:
                return this.f151294x.getDefaultViewModelCreationExtras();
        }
    }
}
