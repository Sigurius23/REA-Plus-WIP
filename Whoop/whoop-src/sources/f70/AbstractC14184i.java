package f70;

import com.whoop.data.repositories.FeatureFlagChecker;
import com.whoop.data.repositories.OnboardingFeatureFlag;
import com.whoop.domain.model.AuthMaterial;
import od1.C27847j;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;

/* JADX INFO: renamed from: f70.i */
/* JADX INFO: loaded from: classes6.dex */
@Metadata(m65680d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u001a#\u0010\u0005\u001a\u00020\u0000*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u0003H\u0000¢\u0006\u0004\b\u0005\u0010\u0006\u001a/\u0010\n\u001a\u0004\u0018\u00010\t*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00012\u0006\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\b\u001a\u00020\u0007H\u0000¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, m65681d2 = {"Lf70/e$b;", "Lod1/j;", "pendingUserSessionRepository", "Lcom/whoop/data/repositories/FeatureFlagChecker;", "featureFlagChecker", "a", "(Lf70/e$b;Lod1/j;Lcom/whoop/data/repositories/FeatureFlagChecker;)Lf70/e$b;", "Lf70/l0;", "legacyResolution", "", "b", "(Lf70/e$b;Lod1/j;Lcom/whoop/data/repositories/FeatureFlagChecker;Lf70/l0;)Ljava/lang/String;", "activation_release"}, m65682k = 2, m65683mv = {2, 3, 0}, m65685xi = 48)
public abstract class AbstractC14184i {
    /* JADX INFO: renamed from: a */
    public static final InterfaceC14176e.b m40485a(InterfaceC14176e.b bVar, C27847j pendingUserSessionRepository, FeatureFlagChecker featureFlagChecker) {
        AbstractC22676k.m65750j(bVar, "<this>");
        AbstractC22676k.m65750j(pendingUserSessionRepository, "pendingUserSessionRepository");
        AbstractC22676k.m65750j(featureFlagChecker, "featureFlagChecker");
        if (!featureFlagChecker.isFeatureEnabled(OnboardingFeatureFlag.APP_DESTINATION_ANDROID)) {
            return bVar;
        }
        AuthMaterial authMaterial = bVar.getAuthMaterial();
        if (authMaterial == null) {
            authMaterial = pendingUserSessionRepository.getPendingAuthMaterial();
        }
        return InterfaceC14176e.b.m40416b(bVar, null, null, null, null, null, false, null, false, authMaterial, false, false, null, null, null, null, null, null, 130815, null);
    }

    /* JADX INFO: renamed from: b */
    public static final String m40486b(InterfaceC14176e.b bVar, C27847j pendingUserSessionRepository, FeatureFlagChecker featureFlagChecker, InterfaceC14191l0 legacyResolution) {
        String accessToken;
        AbstractC22676k.m65750j(bVar, "<this>");
        AbstractC22676k.m65750j(pendingUserSessionRepository, "pendingUserSessionRepository");
        AbstractC22676k.m65750j(featureFlagChecker, "featureFlagChecker");
        AbstractC22676k.m65750j(legacyResolution, "legacyResolution");
        if (featureFlagChecker.isFeatureEnabled(OnboardingFeatureFlag.APP_DESTINATION_ANDROID)) {
            AuthMaterial authMaterial = bVar.getAuthMaterial();
            if (authMaterial != null && (accessToken = authMaterial.getAccessToken()) != null) {
                return accessToken;
            }
            AuthMaterial pendingAuthMaterial = pendingUserSessionRepository.getPendingAuthMaterial();
            return pendingAuthMaterial != null ? pendingAuthMaterial.getAccessToken() : pendingUserSessionRepository.getAccessToken();
        }
        if (legacyResolution.equals(InterfaceC14191l0.a.f51448a)) {
            AuthMaterial authMaterial2 = bVar.getAuthMaterial();
            if (authMaterial2 != null) {
                return authMaterial2.getAccessToken();
            }
            return null;
        }
        if (!legacyResolution.equals(InterfaceC14191l0.b.f51449a)) {
            throw new NoWhenBranchMatchedException();
        }
        String accessToken2 = pendingUserSessionRepository.getAccessToken();
        if (accessToken2 != null) {
            return accessToken2;
        }
        AuthMaterial authMaterial3 = bVar.getAuthMaterial();
        if (authMaterial3 != null) {
            return authMaterial3.getAccessToken();
        }
        return null;
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ String m40487c(InterfaceC14176e.b bVar, C27847j c27847j, FeatureFlagChecker featureFlagChecker, InterfaceC14191l0 interfaceC14191l0, int i13, Object obj) {
        if ((i13 & 4) != 0) {
            interfaceC14191l0 = InterfaceC14191l0.a.f51448a;
        }
        return m40486b(bVar, c27847j, featureFlagChecker, interfaceC14191l0);
    }
}
