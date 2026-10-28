package t30;

import c93.InterfaceC4339a;
import com.stripe.android.stripe3ds2.views.ChallengeActivity;
import p715kotlin.jvm.internal.AbstractC22680m;

/* JADX INFO: renamed from: t30.e */
/* JADX INFO: loaded from: classes6.dex */
public final class C33503e extends AbstractC22680m implements InterfaceC4339a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f139861w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ ChallengeActivity f139862x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C33503e(ChallengeActivity challengeActivity, int i13) {
        super(0);
        this.f139861w = i13;
        this.f139862x = challengeActivity;
    }

    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        switch (this.f139861w) {
            case 0:
                return this.f139862x.getViewModelStore();
            default:
                return this.f139862x.getDefaultViewModelCreationExtras();
        }
    }
}
