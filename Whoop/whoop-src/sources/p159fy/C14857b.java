package p159fy;

import c93.InterfaceC4339a;
import com.stripe.android.challenge.passive.warmer.activity.PassiveChallengeWarmerActivity;
import p715kotlin.jvm.internal.AbstractC22680m;

/* JADX INFO: renamed from: fy.b */
/* JADX INFO: loaded from: classes6.dex */
public final class C14857b extends AbstractC22680m implements InterfaceC4339a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f55480w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ PassiveChallengeWarmerActivity f55481x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C14857b(PassiveChallengeWarmerActivity passiveChallengeWarmerActivity, int i13) {
        super(0);
        this.f55480w = i13;
        this.f55481x = passiveChallengeWarmerActivity;
    }

    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        switch (this.f55480w) {
            case 0:
                return this.f55481x.getViewModelStore();
            default:
                return this.f55481x.getDefaultViewModelCreationExtras();
        }
    }
}
