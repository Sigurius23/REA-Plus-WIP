package sz;

import c93.InterfaceC4339a;
import com.stripe.android.googlepaylauncher.GooglePayLauncherActivity;
import p715kotlin.jvm.internal.AbstractC22680m;

/* JADX INFO: renamed from: sz.s */
/* JADX INFO: loaded from: classes6.dex */
public final class C33154s extends AbstractC22680m implements InterfaceC4339a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f138258w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ GooglePayLauncherActivity f138259x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C33154s(GooglePayLauncherActivity googlePayLauncherActivity, int i13) {
        super(0);
        this.f138258w = i13;
        this.f138259x = googlePayLauncherActivity;
    }

    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        switch (this.f138258w) {
            case 0:
                return this.f138259x.getViewModelStore();
            default:
                return this.f138259x.getDefaultViewModelCreationExtras();
        }
    }
}
