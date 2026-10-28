package fn2;

import androidx.recyclerview.widget.AbstractC1707m0;
import com.whoop.data.featureFlags.CoreFeatureFlagsKt;
import com.whoop.data.repositories.FeatureFlagChecker;
import i93.C18284j;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: fn2.g */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\b\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tR\u0014\u0010\f\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u000bR\u0014\u0010\u000e\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000b¨\u0006\u000f"}, m65681d2 = {"Lfn2/g;", "", "Lcom/whoop/data/repositories/FeatureFlagChecker;", "featureFlagChecker", "<init>", "(Lcom/whoop/data/repositories/FeatureFlagChecker;)V", "", "orientation", "a", "(I)I", "Li93/j;", "Li93/j;", "rightOrientationRange", "b", "leftOrientationRange", "core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C14647g {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final C18284j rightOrientationRange;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final C18284j leftOrientationRange;

    public C14647g(FeatureFlagChecker featureFlagChecker) {
        AbstractC22676k.m65750j(featureFlagChecker, "featureFlagChecker");
        this.rightOrientationRange = featureFlagChecker.isFeatureEnabled(CoreFeatureFlagsKt.ANDROID_TILT_MODE_ANGLES) ? new C18284j(260, 280, 1) : new C18284j(AbstractC1707m0.DEFAULT_SWIPE_ANIMATION_DURATION, 290, 1);
        this.leftOrientationRange = featureFlagChecker.isFeatureEnabled(CoreFeatureFlagsKt.ANDROID_TILT_MODE_ANGLES) ? new C18284j(80, 100, 1) : new C18284j(70, 110, 1);
    }

    /* JADX INFO: renamed from: a */
    public final int m41851a(int orientation) {
        C18284j c18284j = this.rightOrientationRange;
        int i13 = c18284j.f71133w;
        if (orientation <= c18284j.f71134x && i13 <= orientation) {
            return 0;
        }
        C18284j c18284j2 = this.leftOrientationRange;
        return (orientation > c18284j2.f71134x || c18284j2.f71133w > orientation) ? 1 : 0;
    }
}
