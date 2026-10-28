package p705ea2;

import c93.InterfaceC4339a;
import com.whoop.settings.OnboardingStatusDebugFragment;

/* JADX INFO: renamed from: ea2.j */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class C12912j implements InterfaceC4339a {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f44430w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ OnboardingStatusDebugFragment f44431x;

    public /* synthetic */ C12912j(OnboardingStatusDebugFragment onboardingStatusDebugFragment, int i13) {
        this.f44430w = i13;
        this.f44431x = onboardingStatusDebugFragment;
    }

    @Override // c93.InterfaceC4339a
    public final Object invoke() {
        switch (this.f44430w) {
            case 0:
                return OnboardingStatusDebugFragment.m25076P(this.f44431x);
            case 1:
                return OnboardingStatusDebugFragment.m25075O(this.f44431x);
            case 2:
                return OnboardingStatusDebugFragment.m25071K(this.f44431x);
            default:
                return OnboardingStatusDebugFragment.m25072L(this.f44431x);
        }
    }
}
