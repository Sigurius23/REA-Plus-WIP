package v10;

import c93.InterfaceC4339a;
import com.stripe.android.payments.StripeBrowserLauncherActivity;
import p715kotlin.jvm.internal.AbstractC22680m;

/* JADX INFO: renamed from: v10.q */
/* JADX INFO: loaded from: classes6.dex */
public final class C35541q extends AbstractC22680m implements InterfaceC4339a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f151201w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ StripeBrowserLauncherActivity f151202x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C35541q(StripeBrowserLauncherActivity stripeBrowserLauncherActivity, int i13) {
        super(0);
        this.f151201w = i13;
        this.f151202x = stripeBrowserLauncherActivity;
    }

    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        switch (this.f151201w) {
            case 0:
                return this.f151202x.getViewModelStore();
            default:
                return this.f151202x.getDefaultViewModelCreationExtras();
        }
    }
}
