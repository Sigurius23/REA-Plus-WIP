package fn2;

import android.app.Activity;
import android.content.Context;
import com.whoop.data.featureFlags.CoreFeatureFlagsKt;
import com.whoop.data.repositories.FeatureFlagChecker;
import java.util.WeakHashMap;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: fn2.a */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\u000b\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000b\u0010\nJ\u0017\u0010\f\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\f\u0010\nJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0012\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\rH\u0016¢\u0006\u0004\b\u0012\u0010\u0011R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0013R \u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00150\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0016¨\u0006\u0018"}, m65681d2 = {"Lfn2/a;", "Lfn2/n;", "Lcom/whoop/data/repositories/FeatureFlagChecker;", "featureFlagChecker", "<init>", "(Lcom/whoop/data/repositories/FeatureFlagChecker;)V", "Landroid/content/Context;", "context", "", "d", "(Landroid/content/Context;)Z", "a", "e", "Landroid/app/Activity;", "activity", "Ll83/a0;", "b", "(Landroid/app/Activity;)V", "c", "Lcom/whoop/data/repositories/FeatureFlagChecker;", "Ljava/util/WeakHashMap;", "", "Ljava/util/WeakHashMap;", "savedOrientations", "core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C14641a implements InterfaceC14654n {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final FeatureFlagChecker featureFlagChecker;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final WeakHashMap<Activity, Integer> savedOrientations;

    public C14641a(FeatureFlagChecker featureFlagChecker) {
        AbstractC22676k.m65750j(featureFlagChecker, "featureFlagChecker");
        this.featureFlagChecker = featureFlagChecker;
        this.savedOrientations = new WeakHashMap<>();
    }

    @Override // fn2.InterfaceC14654n
    /* JADX INFO: renamed from: a */
    public boolean mo41837a(Context context) {
        AbstractC22676k.m65750j(context, "context");
        return !mo41840d(context);
    }

    @Override // fn2.InterfaceC14654n
    /* JADX INFO: renamed from: b */
    public void mo41838b(Activity activity) {
        AbstractC22676k.m65750j(activity, "activity");
        if (mo41837a(activity)) {
            this.savedOrientations.putIfAbsent(activity, Integer.valueOf(activity.getRequestedOrientation()));
            activity.setRequestedOrientation(11);
        }
    }

    @Override // fn2.InterfaceC14654n
    /* JADX INFO: renamed from: c */
    public void mo41839c(Activity activity) {
        AbstractC22676k.m65750j(activity, "activity");
        Integer numRemove = this.savedOrientations.remove(activity);
        if (numRemove != null) {
            activity.setRequestedOrientation(numRemove.intValue());
        }
    }

    @Override // fn2.InterfaceC14654n
    /* JADX INFO: renamed from: d */
    public boolean mo41840d(Context context) {
        AbstractC22676k.m65750j(context, "context");
        return AbstractC14642b.m41842a(context) && this.featureFlagChecker.isFeatureEnabled(CoreFeatureFlagsKt.TILT_LARGE_SCREEN_ORIENTATION_DECOUPLE);
    }

    @Override // fn2.InterfaceC14654n
    /* JADX INFO: renamed from: e */
    public boolean mo41841e(Context context) {
        AbstractC22676k.m65750j(context, "context");
        return mo41840d(context);
    }
}
