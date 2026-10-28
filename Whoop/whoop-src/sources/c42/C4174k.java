package c42;

import a42.C0378a;
import c93.InterfaceC4339a;
import com.whoop.pregnancy.view.PregnancySettingsFragment;

/* JADX INFO: renamed from: c42.k */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class C4174k implements InterfaceC4339a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f16982w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ PregnancySettingsFragment f16983x;

    /* JADX INFO: renamed from: y */
    public final /* synthetic */ C0378a f16984y;

    public /* synthetic */ C4174k(C0378a c0378a, PregnancySettingsFragment pregnancySettingsFragment) {
        this.f16982w = 4;
        this.f16984y = c0378a;
        this.f16983x = pregnancySettingsFragment;
    }

    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        switch (this.f16982w) {
            case 0:
                return PregnancySettingsFragment.m23249B0(this.f16983x, this.f16984y);
            case 1:
                return PregnancySettingsFragment.m23267K0(this.f16983x, this.f16984y);
            case 2:
                return PregnancySettingsFragment.m23255E0(this.f16983x, this.f16984y);
            case 3:
                return PregnancySettingsFragment.m23259G0(this.f16983x, this.f16984y);
            default:
                return PregnancySettingsFragment.m23308n0(this.f16984y, this.f16983x);
        }
    }

    public /* synthetic */ C4174k(PregnancySettingsFragment pregnancySettingsFragment, C0378a c0378a, int i13) {
        this.f16982w = i13;
        this.f16983x = pregnancySettingsFragment;
        this.f16984y = c0378a;
    }
}
