package mz1;

import com.whoop.data.repositories.FeatureFlagChecker;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: mz1.d */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\u001a!\u0010\u0005\u001a\u00020\u00042\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a\u0019\u0010\u0007\u001a\u00020\u00042\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\u0000¢\u0006\u0004\b\u0007\u0010\b\u001a\u0019\u0010\t\u001a\u00020\u00042\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\u0000¢\u0006\u0004\b\t\u0010\b¨\u0006\n"}, m65681d2 = {"", "source", "Lcom/whoop/data/repositories/FeatureFlagChecker;", "featureFlagChecker", "", "c", "(Ljava/lang/String;Lcom/whoop/data/repositories/FeatureFlagChecker;)Z", "a", "(Ljava/lang/String;)Z", "b", "native-store_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC26041d {
    /* JADX INFO: renamed from: a */
    public static final boolean m77463a(String str) {
        return AbstractC22676k.m65745e(str, "extensions-upsell");
    }

    /* JADX INFO: renamed from: b */
    public static final boolean m77464b(String str) {
        return AbstractC22676k.m65745e(str, "reactivations-upsell");
    }

    /* JADX INFO: renamed from: c */
    public static final boolean m77465c(String str, FeatureFlagChecker featureFlagChecker) {
        AbstractC22676k.m65750j(featureFlagChecker, "featureFlagChecker");
        return AbstractC26038a.m77462a(str, featureFlagChecker) || m77463a(str) || m77464b(str);
    }
}
