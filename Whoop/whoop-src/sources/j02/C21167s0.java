package j02;

import com.whoop.data.repositories.FeatureFlagChecker;
import com.whoop.data.repositories.OnboardingFeatureFlag;
import com.whoop.navigation.C9598e;
import com.whoop.navigation.json.C9602a;
import kotlinx.serialization.SerializationException;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import qr2.AbstractC30556a;
import tr2.InterfaceC34116n;
import u82.AbstractC34650k;

/* JADX INFO: renamed from: j02.s0 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001f\u0010\r\u001a\u00020\f2\b\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, m65681d2 = {"Lj02/s0;", "", "Lcom/whoop/data/repositories/FeatureFlagChecker;", "featureFlagChecker", "Ltr2/n;", "logger", "<init>", "(Lcom/whoop/data/repositories/FeatureFlagChecker;Ltr2/n;)V", "", "serializedDestination", "Lj02/o0;", "navigator", "Ll83/a0;", "a", "(Ljava/lang/String;Lj02/o0;)V", "Lcom/whoop/data/repositories/FeatureFlagChecker;", "b", "Ltr2/n;", "app_prodStandardRelease"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C21167s0 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final FeatureFlagChecker featureFlagChecker;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final InterfaceC34116n logger;

    public C21167s0(FeatureFlagChecker featureFlagChecker, InterfaceC34116n logger) {
        AbstractC22676k.m65750j(featureFlagChecker, "featureFlagChecker");
        AbstractC22676k.m65750j(logger, "logger");
        this.featureFlagChecker = featureFlagChecker;
        this.logger = logger;
    }

    /* JADX INFO: renamed from: a */
    public final void m59411a(String serializedDestination, InterfaceC21159o0 navigator) {
        AbstractC22676k.m65750j(navigator, "navigator");
        if (serializedDestination == null || serializedDestination.length() == 0 || !this.featureFlagChecker.isFeatureEnabled(OnboardingFeatureFlag.PAIRING_COMPLETION_DESTINATION_NAV)) {
            return;
        }
        try {
            navigator.mo59392a((C9598e) AbstractC34650k.m109496c().m1831b(new C9602a(null, null, 3, null), serializedDestination));
        } catch (SerializationException e5) {
            this.logger.mo85213c("Failed to decode pairing completion destination", e5, new AbstractC30556a.a[0]);
        }
    }

    public /* synthetic */ C21167s0(FeatureFlagChecker featureFlagChecker, InterfaceC34116n interfaceC34116n, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(featureFlagChecker, (i13 & 2) != 0 ? InterfaceC34116n.INSTANCE.m107848a("PairingCompletionNavigator") : interfaceC34116n);
    }
}
