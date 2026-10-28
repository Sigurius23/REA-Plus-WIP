package cu2;

import c93.InterfaceC4339a;
import com.whoop.weightlifting.StrengthTrainerFragment;

/* JADX INFO: renamed from: cu2.j */
/* JADX INFO: loaded from: classes11.dex */
public final /* synthetic */ class C11130j implements InterfaceC4339a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f35530w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ StrengthTrainerFragment f35531x;

    public /* synthetic */ C11130j(StrengthTrainerFragment strengthTrainerFragment, int i13) {
        this.f35530w = i13;
        this.f35531x = strengthTrainerFragment;
    }

    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        switch (this.f35530w) {
            case 0:
                return StrengthTrainerFragment.m28132M(this.f35531x);
            default:
                return StrengthTrainerFragment.m28134O(this.f35531x);
        }
    }
}
