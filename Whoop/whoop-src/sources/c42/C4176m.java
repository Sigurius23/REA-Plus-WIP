package c42;

import c93.InterfaceC4339a;
import com.whoop.pregnancy.view.PregnancySettingsFragment;

/* JADX INFO: renamed from: c42.m */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class C4176m implements InterfaceC4339a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f16987w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ PregnancySettingsFragment f16988x;

    public /* synthetic */ C4176m(PregnancySettingsFragment pregnancySettingsFragment, int i13) {
        this.f16987w = i13;
        this.f16988x = pregnancySettingsFragment;
    }

    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        switch (this.f16987w) {
            case 0:
                return PregnancySettingsFragment.m23257F0(this.f16988x);
            case 1:
                return PregnancySettingsFragment.m23291W0(this.f16988x);
            case 2:
                return PregnancySettingsFragment.m23306l0(this.f16988x);
            case 3:
                return PregnancySettingsFragment.m23289V0(this.f16988x);
            case 4:
                return PregnancySettingsFragment.m23312r0(this.f16988x);
            default:
                return PregnancySettingsFragment.m23283S0(this.f16988x);
        }
    }
}
