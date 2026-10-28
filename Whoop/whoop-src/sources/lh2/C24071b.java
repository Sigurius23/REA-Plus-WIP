package lh2;

import androidx.compose.runtime.Composer;
import c93.InterfaceC4351m;
import com.whoop.stories.OnboardingStoryFragment;

/* JADX INFO: renamed from: lh2.b */
/* JADX INFO: loaded from: classes10.dex */
public final /* synthetic */ class C24071b implements InterfaceC4351m {

    /* JADX INFO: renamed from: w */
    public final /* synthetic */ int f95111w;

    /* JADX INFO: renamed from: x */
    public final /* synthetic */ OnboardingStoryFragment f95112x;

    public /* synthetic */ C24071b(OnboardingStoryFragment onboardingStoryFragment, int i13) {
        this.f95111w = i13;
        this.f95112x = onboardingStoryFragment;
    }

    @Override // c93.InterfaceC4351m
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f95111w) {
            case 0:
                int iIntValue = ((Integer) obj2).intValue();
                return OnboardingStoryFragment.m26164V(this.f95112x, (Composer) obj, iIntValue);
            default:
                return OnboardingStoryFragment.m26172d0(this.f95112x, (String) obj, (String) obj2);
        }
    }
}
