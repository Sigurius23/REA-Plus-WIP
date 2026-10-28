package p023ay;

import c93.InterfaceC4339a;
import com.stripe.android.challenge.confirmation.IntentConfirmationChallengeActivity;
import p012ab.C0680g0;

/* JADX INFO: renamed from: ay.k */
/* JADX INFO: loaded from: classes6.dex */
public final /* synthetic */ class C2137k implements InterfaceC4339a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f8526w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ IntentConfirmationChallengeActivity f8527x;

    public /* synthetic */ C2137k(IntentConfirmationChallengeActivity intentConfirmationChallengeActivity, int i13) {
        this.f8526w = i13;
        this.f8527x = intentConfirmationChallengeActivity;
    }

    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        switch (this.f8526w) {
            case 0:
                return this.f8527x.f22142w;
            default:
                return new C2130d0(new C0680g0(this.f8527x, 2));
        }
    }
}
