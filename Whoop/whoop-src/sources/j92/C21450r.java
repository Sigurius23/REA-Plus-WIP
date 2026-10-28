package j92;

import bc3.AbstractC3006f0;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4351m;
import com.whoop.data.repositories.FeatureFlagChecker;
import com.whoop.data.repositories.OnboardingFeatureFlag;
import com.whoop.domain.model.User;
import ec3.AbstractC13091v;
import ec3.InterfaceC13058l;
import l83.C23454a0;
import l83.InterfaceC23462h;
import l92.C23543a;
import od1.C27847j;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.C30064k;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import ud3.C34802b1;
import ud3.C34832o0;
import ud3.C34850x0;
import ud3.InterfaceC34803c;
import z92.InterfaceC40205a;

/* JADX INFO: renamed from: j92.r */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\u0018\u00002\u00020\u0001BA\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u0006\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0006¢\u0006\u0004\b\r\u0010\u000eJ#\u0010\u0014\u001a\u0004\u0018\u00010\u00132\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001bR\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001b¨\u0006\u001e"}, m65681d2 = {"Lj92/r;", "Lud3/c;", "Lz92/a;", "userInfoAccessor", "Lod1/j;", "pendingUserSessionRepository", "Ll83/h;", "Lj92/k;", "oauthTokenRefresher", "Ll92/a;", "onboardingAuthTokenRefresher", "Lcom/whoop/data/repositories/FeatureFlagChecker;", "featureFlagChecker", "<init>", "(Lz92/a;Lod1/j;Ll83/h;Ll83/h;Ll83/h;)V", "Lud3/b1;", "route", "Lud3/x0;", "response", "Lud3/o0;", "a", "(Lud3/b1;Lud3/x0;)Lud3/o0;", "b", "Lz92/a;", "c", "Lod1/j;", "d", "Ll83/h;", "e", "f", "core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C21450r implements InterfaceC34803c {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final InterfaceC40205a userInfoAccessor;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final C27847j pendingUserSessionRepository;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final InterfaceC23462h oauthTokenRefresher;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final InterfaceC23462h onboardingAuthTokenRefresher;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final InterfaceC23462h featureFlagChecker;

    /* JADX INFO: renamed from: j92.r$a */
    @InterfaceC32271e(m100429c = "com.whoop.service.network.interceptor.SessionAwareAuthenticator$authenticate$1", m100430f = "SessionAwareAuthenticator.kt", m100431l = {30}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Lcom/whoop/domain/model/User;", "<anonymous>", "(Lbc3/c0;)Lcom/whoop/domain/model/User;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f82410w;

        public a(InterfaceC30057d<? super a> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C21450r.this.new a(interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super User> interfaceC30057d) {
            return ((a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f82410w;
            if (i13 != 0) {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
                return obj;
            }
            AbstractC34132o.m107864I(obj);
            InterfaceC13058l user = C21450r.this.userInfoAccessor.getUser();
            this.f82410w = 1;
            Object objM36575A = AbstractC13091v.m36575A(user, this);
            return objM36575A == enumC31071a ? enumC31071a : objM36575A;
        }
    }

    public C21450r(InterfaceC40205a userInfoAccessor, C27847j pendingUserSessionRepository, InterfaceC23462h oauthTokenRefresher, InterfaceC23462h onboardingAuthTokenRefresher, InterfaceC23462h featureFlagChecker) {
        AbstractC22676k.m65750j(userInfoAccessor, "userInfoAccessor");
        AbstractC22676k.m65750j(pendingUserSessionRepository, "pendingUserSessionRepository");
        AbstractC22676k.m65750j(oauthTokenRefresher, "oauthTokenRefresher");
        AbstractC22676k.m65750j(onboardingAuthTokenRefresher, "onboardingAuthTokenRefresher");
        AbstractC22676k.m65750j(featureFlagChecker, "featureFlagChecker");
        this.userInfoAccessor = userInfoAccessor;
        this.pendingUserSessionRepository = pendingUserSessionRepository;
        this.oauthTokenRefresher = oauthTokenRefresher;
        this.onboardingAuthTokenRefresher = onboardingAuthTokenRefresher;
        this.featureFlagChecker = featureFlagChecker;
    }

    @Override // ud3.InterfaceC34803c
    /* JADX INFO: renamed from: a */
    public C34832o0 mo31437a(C34802b1 route, C34850x0 response) {
        AbstractC22676k.m65750j(response, "response");
        if (AbstractC3006f0.m8699E(C30064k.f122676w, new a(null)) != null) {
            return ((C21443k) this.oauthTokenRefresher.getValue()).mo31437a(route, response);
        }
        return (this.pendingUserSessionRepository.getPendingAuthMaterial() == null || !((FeatureFlagChecker) this.featureFlagChecker.getValue()).isFeatureEnabled(OnboardingFeatureFlag.ONBOARDING_TOKEN_RECOVERY)) ? ((C21443k) this.oauthTokenRefresher.getValue()).mo31437a(route, response) : ((C23543a) this.onboardingAuthTokenRefresher.getValue()).mo31437a(route, response);
    }
}
