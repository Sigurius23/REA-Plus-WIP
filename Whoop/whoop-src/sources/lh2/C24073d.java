package lh2;

import c93.InterfaceC4339a;
import com.whoop.stories.OnboardingStoryFragment;

/* JADX INFO: renamed from: lh2.d */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class C24073d implements InterfaceC4339a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f95115w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ OnboardingStoryFragment f95116x;

    public /* synthetic */ C24073d(OnboardingStoryFragment onboardingStoryFragment, int i13) {
        this.f95115w = i13;
        this.f95116x = onboardingStoryFragment;
    }

    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        switch (this.f95115w) {
            case 0:
                return OnboardingStoryFragment.m26177i0(this.f95116x);
            case 1:
                return OnboardingStoryFragment.m26166X(this.f95116x);
            case 2:
                return OnboardingStoryFragment.m26167Y(this.f95116x);
            default:
                return OnboardingStoryFragment.m26168Z(this.f95116x);
        }
    }
}
