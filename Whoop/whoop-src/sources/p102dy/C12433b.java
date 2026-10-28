package p102dy;

import c93.InterfaceC4339a;
import com.stripe.android.challenge.passive.PassiveChallengeActivity;
import p715kotlin.jvm.internal.AbstractC22680m;

/* JADX INFO: renamed from: dy.b */
/* JADX INFO: loaded from: classes6.dex */
public final class C12433b extends AbstractC22680m implements InterfaceC4339a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f42363w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ PassiveChallengeActivity f42364x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C12433b(PassiveChallengeActivity passiveChallengeActivity, int i13) {
        super(0);
        this.f42363w = i13;
        this.f42364x = passiveChallengeActivity;
    }

    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        switch (this.f42363w) {
            case 0:
                return this.f42364x.getViewModelStore();
            default:
                return this.f42364x.getDefaultViewModelCreationExtras();
        }
    }
}
