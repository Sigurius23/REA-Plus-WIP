package c42;

import c93.InterfaceC4339a;
import com.whoop.pregnancy.view.PregnancySettingsFragment;

/* JADX INFO: renamed from: c42.n */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class C4177n implements InterfaceC4339a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f16989w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ PregnancySettingsFragment f16990x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ C4181r f16991y;

    public /* synthetic */ C4177n(PregnancySettingsFragment pregnancySettingsFragment, C4181r c4181r, int i13) {
        this.f16989w = i13;
        this.f16990x = pregnancySettingsFragment;
        this.f16991y = c4181r;
    }

    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        switch (this.f16989w) {
            case 0:
                return PregnancySettingsFragment.m23261H0(this.f16990x, this.f16991y);
            default:
                return PregnancySettingsFragment.m23313s0(this.f16990x, this.f16991y);
        }
    }
}
