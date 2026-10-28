package sz;

import c93.InterfaceC4339a;
import com.stripe.android.googlepaylauncher.GooglePayPaymentMethodLauncherActivity;
import p715kotlin.jvm.internal.AbstractC22680m;

/* JADX INFO: renamed from: sz.k0 */
/* JADX INFO: loaded from: classes6.dex */
public final class C33140k0 extends AbstractC22680m implements InterfaceC4339a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f138217w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ GooglePayPaymentMethodLauncherActivity f138218x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C33140k0(GooglePayPaymentMethodLauncherActivity googlePayPaymentMethodLauncherActivity, int i13) {
        super(0);
        this.f138217w = i13;
        this.f138218x = googlePayPaymentMethodLauncherActivity;
    }

    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        switch (this.f138217w) {
            case 0:
                return this.f138218x.getViewModelStore();
            default:
                return this.f138218x.getDefaultViewModelCreationExtras();
        }
    }
}
