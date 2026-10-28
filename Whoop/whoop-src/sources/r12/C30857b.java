package r12;

import c93.InterfaceC4339a;
import com.whoop.onboardingpersonalization.dayzero.DayZeroPersonalizationFragment;

/* JADX INFO: renamed from: r12.b */
/* JADX INFO: loaded from: classes9.dex */
public final /* synthetic */ class C30857b implements InterfaceC4339a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f127252w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ DayZeroPersonalizationFragment f127253x;

    public /* synthetic */ C30857b(DayZeroPersonalizationFragment dayZeroPersonalizationFragment, int i13) {
        this.f127252w = i13;
        this.f127253x = dayZeroPersonalizationFragment;
    }

    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        switch (this.f127252w) {
            case 0:
                return DayZeroPersonalizationFragment.m23162C(this.f127253x);
            case 1:
                return DayZeroPersonalizationFragment.m23166G(this.f127253x);
            default:
                return DayZeroPersonalizationFragment.m23167H(this.f127253x);
        }
    }
}
