package p023ay;

import c93.InterfaceC4339a;
import com.stripe.android.challenge.confirmation.IntentConfirmationChallengeActivity;
import p715kotlin.jvm.internal.AbstractC22680m;

/* JADX INFO: renamed from: ay.o */
/* JADX INFO: loaded from: classes6.dex */
public final class C2141o extends AbstractC22680m implements InterfaceC4339a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f8534w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ IntentConfirmationChallengeActivity f8535x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2141o(IntentConfirmationChallengeActivity intentConfirmationChallengeActivity, int i13) {
        super(0);
        this.f8534w = i13;
        this.f8535x = intentConfirmationChallengeActivity;
    }

    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        switch (this.f8534w) {
            case 0:
                return this.f8535x.getViewModelStore();
            default:
                return this.f8535x.getDefaultViewModelCreationExtras();
        }
    }
}
