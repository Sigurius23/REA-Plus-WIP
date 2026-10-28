package d70;

import com.whoop.data.repositories.FeatureFlagChecker;
import com.whoop.data.repositories.OnboardingFeatureFlag;
import j92.C21450r;
import l92.C23543a;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import ud3.C34802b1;
import ud3.C34832o0;
import ud3.C34850x0;
import ud3.InterfaceC34803c;

/* JADX INFO: renamed from: d70.a */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0001\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ#\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, m65681d2 = {"Ld70/a;", "Lud3/c;", "Lcom/whoop/data/repositories/FeatureFlagChecker;", "featureFlagChecker", "Lj92/r;", "sessionAwareAuthenticator", "Ll92/a;", "onboardingAuthTokenRefresher", "<init>", "(Lcom/whoop/data/repositories/FeatureFlagChecker;Lj92/r;Ll92/a;)V", "Lud3/b1;", "route", "Lud3/x0;", "response", "Lud3/o0;", "a", "(Lud3/b1;Lud3/x0;)Lud3/o0;", "b", "Lcom/whoop/data/repositories/FeatureFlagChecker;", "c", "Lj92/r;", "d", "Ll92/a;", "activation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C11747a implements InterfaceC34803c {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final FeatureFlagChecker featureFlagChecker;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final C21450r sessionAwareAuthenticator;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final C23543a onboardingAuthTokenRefresher;

    public C11747a(FeatureFlagChecker featureFlagChecker, C21450r sessionAwareAuthenticator, C23543a onboardingAuthTokenRefresher) {
        AbstractC22676k.m65750j(featureFlagChecker, "featureFlagChecker");
        AbstractC22676k.m65750j(sessionAwareAuthenticator, "sessionAwareAuthenticator");
        AbstractC22676k.m65750j(onboardingAuthTokenRefresher, "onboardingAuthTokenRefresher");
        this.featureFlagChecker = featureFlagChecker;
        this.sessionAwareAuthenticator = sessionAwareAuthenticator;
        this.onboardingAuthTokenRefresher = onboardingAuthTokenRefresher;
    }

    @Override // ud3.InterfaceC34803c
    /* JADX INFO: renamed from: a */
    public C34832o0 mo31437a(C34802b1 route, C34850x0 response) {
        AbstractC22676k.m65750j(response, "response");
        return this.featureFlagChecker.isFeatureEnabled(OnboardingFeatureFlag.ACCOUNT_TRANSITION_SESSION_AWARE_AUTH) ? this.sessionAwareAuthenticator.mo31437a(route, response) : this.onboardingAuthTokenRefresher.mo31437a(route, response);
    }
}
