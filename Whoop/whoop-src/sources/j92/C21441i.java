package j92;

import ae3.C0801i;
import bc3.AbstractC3006f0;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4351m;
import com.whoop.data.repositories.FeatureFlagChecker;
import com.whoop.data.repositories.FeatureFlagRepositoryKt;
import com.whoop.domain.model.AuthMaterial;
import com.whoop.domain.model.AuthToken;
import com.whoop.domain.model.Session;
import io.getstream.chat.android.client.api.interceptor.TokenAuthInterceptor;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.util.Arrays;
import java.util.Locale;
import l83.C23454a0;
import l83.InterfaceC23462h;
import od1.C27847j;
import od1.C27858u;
import p000.AbstractC11266d;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.C30064k;
import q83.InterfaceC30057d;
import qr2.AbstractC30556a;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import tr2.InterfaceC34116n;
import ud3.C34810e0;
import ud3.C34830n0;
import ud3.C34832o0;
import ud3.C34850x0;
import ud3.InterfaceC34813f0;
import ud3.InterfaceC34816g0;
import y92.C39352a;

/* JADX INFO: renamed from: j92.i */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\u0018\u0000 #2\u00020\u0001:\u0001$B=\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u0006\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u001f\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0016\u0010\u0015J\u0017\u0010\u0017\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u0017\u0010\u0019\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0019\u0010\u0018R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010\u001fR\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"¨\u0006%"}, m65681d2 = {"Lj92/i;", "Lud3/g0;", "Lod1/u;", "userContext", "Lod1/j;", "pendingUserSessionRepository", "Ll83/h;", "Ly92/a;", "authManager", "Lcom/whoop/data/repositories/FeatureFlagChecker;", "featureFlagChecker", "Lj92/t;", "topPrivateDomainHelper", "<init>", "(Lod1/u;Lod1/j;Ll83/h;Ll83/h;Lj92/t;)V", "", "accessToken", "Lud3/f0;", "chain", "Lud3/x0;", "f", "(Ljava/lang/String;Lud3/f0;)Lud3/x0;", "d", "e", "(Lud3/f0;)Lud3/x0;", "intercept", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "Lod1/u;", "x", "Lod1/j;", "y", "Ll83/h;", "z", "E", "Lj92/t;", "F", "a", "core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C21441i implements InterfaceC34816g0 {

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: G */
    private static final InterfaceC34116n f82291G = InterfaceC34116n.INSTANCE.m107848a("OauthInterceptor");

    /* JADX INFO: renamed from: H */
    private static final Locale f82292H;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    private final C21452t topPrivateDomainHelper;

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    private final C27858u userContext;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    private final C27847j pendingUserSessionRepository;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    private final InterfaceC23462h authManager;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    private final InterfaceC23462h featureFlagChecker;

    /* JADX INFO: renamed from: j92.i$a, reason: from kotlin metadata */
    @Metadata(m65680d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J)\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0013\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0018\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u001a\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001c\u001a\u00020\b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001c\u0010\u001bR\u0014\u0010\u001d\u001a\u00020\b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001d\u0010\u001bR\u0014\u0010\u001e\u001a\u00020\b8\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u001e\u0010\u001b¨\u0006\u001f"}, m65681d2 = {"Lj92/i$a;", "", "<init>", "()V", "Lj92/t;", "topPrivateDomainHelper", "Lud3/f0;", "chain", "", "accessToken", "Lud3/o0;", "b", "(Lj92/t;Lud3/f0;Ljava/lang/String;)Lud3/o0;", "Lud3/e0;", "request", "", "d", "(Lj92/t;Lud3/e0;)Z", "Ljava/util/Locale;", "LOCALE_HEADER_FORMAT", "Ljava/util/Locale;", "c", "()Ljava/util/Locale;", "Ltr2/n;", "logger", "Ltr2/n;", "WHOOP_SUB_DOMAIN", "Ljava/lang/String;", "HEADER_AUTH", "AUTH_TOKEN_PREFIX", "AUTH_TOKEN_FORMAT", "core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX INFO: renamed from: b */
        public final C34832o0 m60341b(C21452t topPrivateDomainHelper, InterfaceC34813f0 chain, String accessToken) {
            C0801i c0801i = (C0801i) chain;
            if (m60342d(topPrivateDomainHelper, c0801i.f2955e.f146712a)) {
                C34830n0 c34830n0M109907b = c0801i.f2955e.m109907b();
                c34830n0M109907b.m109900a(TokenAuthInterceptor.AUTH_HEADER, String.format(m60343c(), "Bearer %s", Arrays.copyOf(new Object[]{accessToken}, 1)));
                return new C34832o0(c34830n0M109907b);
            }
            InterfaceC34116n interfaceC34116n = C21441i.f82291G;
            C34832o0 c34832o0 = c0801i.f2955e;
            interfaceC34116n.mo85228t(AbstractC11266d.m30461o("Non WHOOP domain, token will be not be included: ", c34832o0.f146712a.f146565d), new AbstractC30556a.a[0]);
            return c34832o0;
        }

        /* JADX INFO: renamed from: d */
        private final boolean m60342d(C21452t topPrivateDomainHelper, C34810e0 request) {
            return AbstractC21453u.m60389b(topPrivateDomainHelper, request);
        }

        /* JADX INFO: renamed from: c */
        public final Locale m60343c() {
            return C21441i.f82292H;
        }

        private Companion() {
        }
    }

    /* JADX INFO: renamed from: j92.i$b */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.service.network.interceptor.OauthInterceptor$intercept$loggedInUserAccessToken$1", m100430f = "OauthInterceptor.kt", m100431l = {29}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "", "<anonymous>", "(Lbc3/c0;)Ljava/lang/String;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class b extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f82298w;

        public b(InterfaceC30057d<? super b> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C21441i.this.new b(interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super String> interfaceC30057d) {
            return ((b) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f82298w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                C39352a c39352a = (C39352a) C21441i.this.authManager.getValue();
                this.f82298w = 1;
                obj = c39352a.m125478a(this);
                if (obj == enumC31071a) {
                    return enumC31071a;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
            }
            AuthMaterial authMaterial = (AuthMaterial) obj;
            if (authMaterial != null) {
                return authMaterial.getAccessToken();
            }
            return null;
        }
    }

    static {
        Locale US = Locale.US;
        AbstractC22676k.m65749i(US, "US");
        f82292H = US;
    }

    public C21441i(C27858u userContext, C27847j pendingUserSessionRepository, InterfaceC23462h authManager, InterfaceC23462h featureFlagChecker, C21452t topPrivateDomainHelper) {
        AbstractC22676k.m65750j(userContext, "userContext");
        AbstractC22676k.m65750j(pendingUserSessionRepository, "pendingUserSessionRepository");
        AbstractC22676k.m65750j(authManager, "authManager");
        AbstractC22676k.m65750j(featureFlagChecker, "featureFlagChecker");
        AbstractC22676k.m65750j(topPrivateDomainHelper, "topPrivateDomainHelper");
        this.userContext = userContext;
        this.pendingUserSessionRepository = pendingUserSessionRepository;
        this.authManager = authManager;
        this.featureFlagChecker = featureFlagChecker;
        this.topPrivateDomainHelper = topPrivateDomainHelper;
    }

    /* JADX INFO: renamed from: d */
    private final C34850x0 m60337d(String accessToken, InterfaceC34813f0 chain) {
        return ((C0801i) chain).m1939b(INSTANCE.m60341b(this.topPrivateDomainHelper, chain, accessToken));
    }

    /* JADX INFO: renamed from: e */
    private final C34850x0 m60338e(InterfaceC34813f0 chain) {
        return ((C0801i) chain).m1939b(((C0801i) chain).f2955e);
    }

    /* JADX INFO: renamed from: f */
    private final C34850x0 m60339f(String accessToken, InterfaceC34813f0 chain) {
        return ((C0801i) chain).m1939b(INSTANCE.m60341b(this.topPrivateDomainHelper, chain, accessToken));
    }

    @Override // ud3.InterfaceC34816g0
    public C34850x0 intercept(InterfaceC34813f0 chain) {
        AuthToken authToken;
        AbstractC22676k.m65750j(chain, "chain");
        boolean zIsFeatureEnabled = ((FeatureFlagChecker) this.featureFlagChecker.getValue()).isFeatureEnabled(FeatureFlagRepositoryKt.NEW_AUTH_USER_STORAGE);
        Session sessionM84057h = this.userContext.m84057h();
        String accessToken = (sessionM84057h == null || (authToken = sessionM84057h.getAuthToken()) == null) ? null : authToken.getAccessToken();
        if (zIsFeatureEnabled) {
            String str = (String) AbstractC3006f0.m8699E(C30064k.f122676w, new b(null));
            if (str != null) {
                accessToken = str;
            }
        }
        if (accessToken != null) {
            return m60339f(accessToken, chain);
        }
        String accessToken2 = this.pendingUserSessionRepository.getAccessToken();
        return accessToken2 != null ? m60337d(accessToken2, chain) : m60338e(chain);
    }

    public /* synthetic */ C21441i(C27858u c27858u, C27847j c27847j, InterfaceC23462h interfaceC23462h, InterfaceC23462h interfaceC23462h2, C21452t c21452t, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(c27858u, c27847j, interfaceC23462h, interfaceC23462h2, (i13 & 16) != 0 ? new C21452t() : c21452t);
    }
}
