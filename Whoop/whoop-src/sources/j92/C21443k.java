package j92;

import bc3.AbstractC3006f0;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4351m;
import com.whoop.data.remote.AppConfigurationRepository;
import com.whoop.data.repositories.FeatureFlagChecker;
import com.whoop.data.repositories.FeatureFlagRepositoryKt;
import com.whoop.domain.model.Session;
import io.getstream.chat.android.client.api.interceptor.TokenAuthInterceptor;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.util.Arrays;
import l83.C23454a0;
import l83.InterfaceC23462h;
import od1.C27858u;
import od1.InterfaceC27837a0;
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
import ud3.C34802b1;
import ud3.C34830n0;
import ud3.C34832o0;
import ud3.C34850x0;
import ud3.InterfaceC34803c;
import we1.C37223g;

/* JADX INFO: renamed from: j92.k */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0012\u0018\u00002\u00020\u0001Bq\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u0006\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0006\u0012\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u0006\u0012\f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u0006\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0016J!\u0010\u001c\u001a\u0004\u0018\u00010\u001b2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u0019H\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ#\u0010 \u001a\u0004\u0018\u00010\u001b2\b\u0010\u001f\u001a\u0004\u0018\u00010\u001e2\u0006\u0010\u001a\u001a\u00020\u0019H\u0016¢\u0006\u0004\b \u0010!J\u0017\u0010\"\u001a\u0004\u0018\u00010\u001b2\u0006\u0010\u001a\u001a\u00020\u0019¢\u0006\u0004\b\"\u0010#R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010)R\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010)R\u001a\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010)R\u001a\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010)R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010-R\u0014\u0010\u0014\u001a\u00020\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/¨\u00060"}, m65681d2 = {"Lj92/k;", "Lud3/c;", "Lod1/u;", "userContext", "Ltr2/n;", "logger", "Ll83/h;", "Lod1/a0;", "userSessionManager", "Lwe1/g;", "entitlementsRepository", "Lcom/whoop/data/remote/AppConfigurationRepository;", "appConfigurationRepository", "Lj92/p;", "refreshInterceptorLock", "Lcom/whoop/data/repositories/FeatureFlagChecker;", "featureFlagChecker", "Lbc3/c0;", "appCoroutineScope", "Lj92/t;", "topPrivateDomainHelper", "<init>", "(Lod1/u;Ltr2/n;Ll83/h;Ll83/h;Ll83/h;Ll83/h;Ll83/h;Lbc3/c0;Lj92/t;)V", "Lcom/whoop/domain/model/Session;", "session", "Lud3/x0;", "response", "Lud3/o0;", "i", "(Lcom/whoop/domain/model/Session;Lud3/x0;)Lud3/o0;", "Lud3/b1;", "route", "a", "(Lud3/b1;Lud3/x0;)Lud3/o0;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "(Lud3/x0;)Lud3/o0;", "b", "Lod1/u;", "c", "Ltr2/n;", "d", "Ll83/h;", "e", "f", "g", "Lbc3/c0;", "j", "Lj92/t;", "core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C21443k implements InterfaceC34803c {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final C27858u userContext;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final InterfaceC34116n logger;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final InterfaceC23462h userSessionManager;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final InterfaceC23462h entitlementsRepository;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final InterfaceC23462h appConfigurationRepository;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final InterfaceC23462h refreshInterceptorLock;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private final InterfaceC23462h featureFlagChecker;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private final InterfaceC2994c0 appCoroutineScope;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private final C21452t topPrivateDomainHelper;

    /* JADX INFO: renamed from: j92.k$a */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.service.network.interceptor.OauthTokenRefresher$handleRefresh$1", m100430f = "OauthTokenRefresher.kt", m100431l = {51}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Lud3/o0;", "<anonymous>", "(Lbc3/c0;)Lud3/o0;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f82321w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ C34850x0 f82323y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ Session f82324z;

        /* JADX INFO: renamed from: j92.k$a$a, reason: collision with other inner class name */
        @InterfaceC32271e(m100429c = "com.whoop.service.network.interceptor.OauthTokenRefresher$handleRefresh$1$1", m100430f = "OauthTokenRefresher.kt", m100431l = {65}, m100432m = "invokeSuspend", m100433v = 2)
        @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
        public static final class C41832a extends AbstractC32275i implements InterfaceC4351m {

            /* JADX INFO: renamed from: w */
            int f82325w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C21443k f82326x;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C41832a(C21443k c21443k, InterfaceC30057d<? super C41832a> interfaceC30057d) {
                super(2, interfaceC30057d);
                this.f82326x = c21443k;
            }

            @Override // s83.AbstractC32267a
            public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
                return new C41832a(this.f82326x, interfaceC30057d);
            }

            @Override // c93.InterfaceC4351m
            public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
                return ((C41832a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
            }

            @Override // s83.AbstractC32267a
            public final Object invokeSuspend(Object obj) {
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i13 = this.f82325w;
                if (i13 == 0) {
                    AbstractC34132o.m107864I(obj);
                    C37223g c37223g = (C37223g) this.f82326x.entitlementsRepository.getValue();
                    this.f82325w = 1;
                    if (c37223g.m119307u("token_refresh", this) == enumC31071a) {
                        return enumC31071a;
                    }
                } else {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj);
                }
                return C23454a0.f92919a;
            }
        }

        /* JADX INFO: renamed from: j92.k$a$b */
        @InterfaceC32271e(m100429c = "com.whoop.service.network.interceptor.OauthTokenRefresher$handleRefresh$1$2", m100430f = "OauthTokenRefresher.kt", m100431l = {68}, m100432m = "invokeSuspend", m100433v = 2)
        @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
        public static final class b extends AbstractC32275i implements InterfaceC4351m {

            /* JADX INFO: renamed from: w */
            int f82327w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C21443k f82328x;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(C21443k c21443k, InterfaceC30057d<? super b> interfaceC30057d) {
                super(2, interfaceC30057d);
                this.f82328x = c21443k;
            }

            @Override // s83.AbstractC32267a
            public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
                return new b(this.f82328x, interfaceC30057d);
            }

            @Override // c93.InterfaceC4351m
            public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
                return ((b) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
            }

            @Override // s83.AbstractC32267a
            public final Object invokeSuspend(Object obj) {
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i13 = this.f82327w;
                if (i13 == 0) {
                    AbstractC34132o.m107864I(obj);
                    AppConfigurationRepository appConfigurationRepository = (AppConfigurationRepository) this.f82328x.appConfigurationRepository.getValue();
                    this.f82327w = 1;
                    if (appConfigurationRepository.refresh("token_refresh", this) == enumC31071a) {
                        return enumC31071a;
                    }
                } else {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj);
                }
                return C23454a0.f92919a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(C34850x0 c34850x0, Session session, InterfaceC30057d<? super a> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f82323y = c34850x0;
            this.f82324z = session;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C21443k.this.new a(this.f82323y, this.f82324z, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C34832o0> interfaceC30057d) {
            return ((a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f82321w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                C21443k.this.logger.mo85228t("handleRefresh from " + this.f82323y.f146789w.f146712a, new AbstractC30556a.a[0]);
                C21448p c21448p = (C21448p) C21443k.this.refreshInterceptorLock.getValue();
                Session session = this.f82324z;
                C34850x0 c34850x0 = this.f82323y;
                this.f82321w = 1;
                obj = c21448p.m60375j(session, c34850x0, this);
                if (obj == enumC31071a) {
                    return enumC31071a;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
            }
            C21451s c21451s = (C21451s) obj;
            if (c21451s.getAuthMaterial() == null) {
                if (c21451s.getShouldSignUserOut()) {
                    C21443k.this.logger.mo85222m("Refresh failed, signing user out", new AbstractC30556a.a[0]);
                    ((InterfaceC27837a0) C21443k.this.userSessionManager.getValue()).mo83911a();
                }
                return null;
            }
            C21443k.this.logger.mo85228t("Refresh success", new AbstractC30556a.a[0]);
            if (!c21451s.getDifferentOperationHandlesSuccessfulRefreshCall()) {
                AbstractC3006f0.m8732z(C21443k.this.appCoroutineScope, null, null, new C41832a(C21443k.this, null), 3);
                AbstractC3006f0.m8732z(C21443k.this.appCoroutineScope, null, null, new b(C21443k.this, null), 3);
            }
            C34830n0 c34830n0M109907b = this.f82323y.f146789w.m109907b();
            c34830n0M109907b.m109902c(TokenAuthInterceptor.AUTH_HEADER, String.format(C21441i.INSTANCE.m60343c(), "Bearer %s", Arrays.copyOf(new Object[]{c21451s.getAuthMaterial().getAccessToken()}, 1)));
            return new C34832o0(c34830n0M109907b);
        }
    }

    public C21443k(C27858u userContext, InterfaceC34116n logger, InterfaceC23462h userSessionManager, InterfaceC23462h entitlementsRepository, InterfaceC23462h appConfigurationRepository, InterfaceC23462h refreshInterceptorLock, InterfaceC23462h featureFlagChecker, InterfaceC2994c0 appCoroutineScope, C21452t topPrivateDomainHelper) {
        AbstractC22676k.m65750j(userContext, "userContext");
        AbstractC22676k.m65750j(logger, "logger");
        AbstractC22676k.m65750j(userSessionManager, "userSessionManager");
        AbstractC22676k.m65750j(entitlementsRepository, "entitlementsRepository");
        AbstractC22676k.m65750j(appConfigurationRepository, "appConfigurationRepository");
        AbstractC22676k.m65750j(refreshInterceptorLock, "refreshInterceptorLock");
        AbstractC22676k.m65750j(featureFlagChecker, "featureFlagChecker");
        AbstractC22676k.m65750j(appCoroutineScope, "appCoroutineScope");
        AbstractC22676k.m65750j(topPrivateDomainHelper, "topPrivateDomainHelper");
        this.userContext = userContext;
        this.logger = logger;
        this.userSessionManager = userSessionManager;
        this.entitlementsRepository = entitlementsRepository;
        this.appConfigurationRepository = appConfigurationRepository;
        this.refreshInterceptorLock = refreshInterceptorLock;
        this.featureFlagChecker = featureFlagChecker;
        this.appCoroutineScope = appCoroutineScope;
        this.topPrivateDomainHelper = topPrivateDomainHelper;
    }

    /* JADX INFO: renamed from: i */
    private final C34832o0 m60354i(Session session, C34850x0 response) {
        return (C34832o0) AbstractC3006f0.m8699E(C30064k.f122676w, new a(response, session, null));
    }

    @Override // ud3.InterfaceC34803c
    /* JADX INFO: renamed from: a */
    public C34832o0 mo31437a(C34802b1 route, C34850x0 response) {
        AbstractC22676k.m65750j(response, "response");
        return m60355h(response);
    }

    /* JADX INFO: renamed from: h */
    public final C34832o0 m60355h(C34850x0 response) {
        AbstractC22676k.m65750j(response, "response");
        C34832o0 c34832o0 = response.f146789w;
        if (((FeatureFlagChecker) this.featureFlagChecker.getValue()).isFeatureEnabled(FeatureFlagRepositoryKt.URL_VALIDATION_DEFAULT_OAUTH_TOKEN_REFRESHER) && !AbstractC21453u.m60389b(this.topPrivateDomainHelper, c34832o0.f146712a)) {
            this.logger.mo85226q(AbstractC11266d.m30461o("Non WHOOP domain, Oauth Token Refresh aborted.: ", c34832o0.f146712a.f146565d), new AbstractC30556a.a[0]);
            return null;
        }
        Session sessionM84057h = this.userContext.m84057h();
        if (sessionM84057h == null) {
            return null;
        }
        return m60354i(sessionM84057h, response);
    }

    public /* synthetic */ C21443k(C27858u c27858u, InterfaceC34116n interfaceC34116n, InterfaceC23462h interfaceC23462h, InterfaceC23462h interfaceC23462h2, InterfaceC23462h interfaceC23462h3, InterfaceC23462h interfaceC23462h4, InterfaceC23462h interfaceC23462h5, InterfaceC2994c0 interfaceC2994c0, C21452t c21452t, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(c27858u, (i13 & 2) != 0 ? InterfaceC34116n.INSTANCE.m107848a("OauthTokenRefresher") : interfaceC34116n, interfaceC23462h, interfaceC23462h2, interfaceC23462h3, interfaceC23462h4, interfaceC23462h5, interfaceC2994c0, (i13 & 256) != 0 ? new C21452t() : c21452t);
    }
}
