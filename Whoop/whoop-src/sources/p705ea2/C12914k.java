package p705ea2;

import androidx.compose.runtime.Composer;
import c93.InterfaceC4351m;
import com.whoop.data.onboarding.OnboardingStatus;
import com.whoop.settings.OnboardingStatusDebugFragment;

/* JADX INFO: renamed from: ea2.k */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class C12914k implements InterfaceC4351m {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f44436w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ OnboardingStatusDebugFragment f44437x;

    public /* synthetic */ C12914k(OnboardingStatusDebugFragment onboardingStatusDebugFragment, int i13) {
        this.f44436w = i13;
        this.f44437x = onboardingStatusDebugFragment;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f44436w) {
            case 0:
                int iIntValue = ((Integer) obj2).intValue();
                return OnboardingStatusDebugFragment.m25070J(this.f44437x, (Composer) obj, iIntValue);
            default:
                return OnboardingStatusDebugFragment.m25074N(this.f44437x, (OnboardingStatus) obj, (InterfaceC4351m) obj2);
        }
    }
}
