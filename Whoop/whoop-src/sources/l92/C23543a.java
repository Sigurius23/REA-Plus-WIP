package l92;

import bc3.AbstractC3006f0;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4351m;
import com.whoop.domain.model.AuthMaterial;
import dj0.C12066b;
import dj0.InterfaceC12077m;
import io.getstream.chat.android.client.api.interceptor.TokenAuthInterceptor;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import iy1.InterfaceC21030c;
import j92.AbstractC21453u;
import j92.C21433a;
import j92.C21441i;
import j92.C21452t;
import j92.InterfaceC21442j;
import java.io.IOException;
import java.util.Arrays;
import l83.C23454a0;
import l83.InterfaceC23462h;
import mc3.AbstractC25438d;
import mc3.InterfaceC25435a;
import od1.C27847j;
import p000.AbstractC11266d;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.C30064k;
import q83.InterfaceC30057d;
import qr2.AbstractC30556a;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import tr2.InterfaceC34116n;
import ud3.C34802b1;
import ud3.C34830n0;
import ud3.C34832o0;
import ud3.C34850x0;
import ud3.InterfaceC34803c;
import wb3.AbstractC37056f;

/* JADX INFO: renamed from: l92.a */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\u0018\u00002\u00020\u0001BM\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J$\u0010\u0018\u001a\u0004\u0018\u00010\u00172\b\u0010\u0014\u001a\u0004\u0018\u00010\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0082@¢\u0006\u0004\b\u0018\u0010\u0019J\u001b\u0010\u001b\u001a\u00020\u0017*\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u0018\u0010 \u001a\u00020\u001f2\u0006\u0010\u001e\u001a\u00020\u001dH\u0082@¢\u0006\u0004\b \u0010!J#\u0010$\u001a\u0004\u0018\u00010\u00172\b\u0010#\u001a\u0004\u0018\u00010\"2\u0006\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b$\u0010%R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u001a\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101R\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u00102¨\u00063"}, m65681d2 = {"Ll92/a;", "Lud3/c;", "Lod1/j;", "pendingUserSessionRepository", "Ldj0/b;", "cognitoAuthApi", "Ll83/h;", "Liy1/c;", "metricWriter", "Lmc3/a;", "mutex", "Lj92/a;", "accessTokenExtractor", "Lj92/t;", "topPrivateDomainHelper", "Ltr2/n;", "logger", "<init>", "(Lod1/j;Ldj0/b;Ll83/h;Lmc3/a;Lj92/a;Lj92/t;Ltr2/n;)V", "", "refreshToken", "Lud3/x0;", "response", "Lud3/o0;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "(Ljava/lang/String;Lud3/x0;Lq83/d;)Ljava/lang/Object;", "accessToken", "i", "(Lud3/o0;Ljava/lang/String;)Lud3/o0;", "Lj92/j;", "metric", "Ll83/a0;", "j", "(Lj92/j;Lq83/d;)Ljava/lang/Object;", "Lud3/b1;", "route", "a", "(Lud3/b1;Lud3/x0;)Lud3/o0;", "b", "Lod1/j;", "c", "Ldj0/b;", "d", "Ll83/h;", "e", "Lmc3/a;", "f", "Lj92/a;", "g", "Lj92/t;", "Ltr2/n;", "core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C23543a implements InterfaceC34803c {

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final C27847j pendingUserSessionRepository;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final C12066b cognitoAuthApi;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final InterfaceC23462h metricWriter;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final InterfaceC25435a mutex;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final C21433a accessTokenExtractor;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final C21452t topPrivateDomainHelper;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private final InterfaceC34116n logger;

    /* JADX INFO: renamed from: l92.a$a */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.service.network.onboarding.OnboardingAuthTokenRefresher$authenticate$1", m100430f = "OnboardingAuthTokenRefresher.kt", m100431l = {118, 67}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Lud3/o0;", "<anonymous>", "(Lbc3/c0;)Lud3/o0;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: E */
        int f93251E;

        /* JADX INFO: renamed from: F */
        int f93252F;

        /* JADX INFO: renamed from: H */
        final /* synthetic */ C34850x0 f93254H;

        /* JADX INFO: renamed from: w */
        Object f93255w;

        /* JADX INFO: renamed from: x */
        Object f93256x;

        /* JADX INFO: renamed from: y */
        Object f93257y;

        /* JADX INFO: renamed from: z */
        int f93258z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(C34850x0 c34850x0, InterfaceC30057d<? super a> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f93254H = c34850x0;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C23543a.this.new a(this.f93254H, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C34832o0> interfaceC30057d) {
            return ((a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) throws Throwable {
            InterfaceC25435a interfaceC25435a;
            C23543a c23543a;
            C34850x0 c34850x0;
            int i13;
            InterfaceC25435a interfaceC25435a2;
            Throwable th3;
            C34832o0 c34832o0M68157i;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i14 = this.f93252F;
            try {
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj);
                    interfaceC25435a = C23543a.this.mutex;
                    c23543a = C23543a.this;
                    C34850x0 c34850x1 = this.f93254H;
                    this.f93255w = interfaceC25435a;
                    this.f93256x = c23543a;
                    this.f93257y = c34850x1;
                    this.f93258z = 0;
                    this.f93252F = 1;
                    if (interfaceC25435a.mo68211b(this) != enumC31071a) {
                        c34850x0 = c34850x1;
                        i13 = 0;
                    }
                    return enumC31071a;
                }
                if (i14 != 1) {
                    if (i14 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    interfaceC25435a2 = (InterfaceC25435a) this.f93255w;
                    try {
                        AbstractC34132o.m107864I(obj);
                        InterfaceC25435a interfaceC25435a3 = interfaceC25435a2;
                        c34832o0M68157i = (C34832o0) obj;
                        interfaceC25435a = interfaceC25435a3;
                        interfaceC25435a.mo68214i(null);
                        return c34832o0M68157i;
                    } catch (Throwable th4) {
                        th3 = th4;
                        interfaceC25435a2.mo68214i(null);
                        throw th3;
                    }
                }
                i13 = this.f93258z;
                c34850x0 = (C34850x0) this.f93257y;
                c23543a = (C23543a) this.f93256x;
                InterfaceC25435a interfaceC25435a4 = (InterfaceC25435a) this.f93255w;
                AbstractC34132o.m107864I(obj);
                interfaceC25435a = interfaceC25435a4;
                String strM60321b = c23543a.accessTokenExtractor.m60321b(c34850x0.f146789w);
                String accessToken = c23543a.pendingUserSessionRepository.getAccessToken();
                if (accessToken == null || accessToken.equals(strM60321b)) {
                    AuthMaterial pendingAuthMaterial = c23543a.pendingUserSessionRepository.getPendingAuthMaterial();
                    String refreshToken = pendingAuthMaterial != null ? pendingAuthMaterial.getRefreshToken() : null;
                    this.f93255w = interfaceC25435a;
                    this.f93256x = null;
                    this.f93257y = null;
                    this.f93258z = i13;
                    this.f93251E = 0;
                    this.f93252F = 2;
                    Object objM68156h = c23543a.m68156h(refreshToken, c34850x0, this);
                    if (objM68156h != enumC31071a) {
                        interfaceC25435a2 = interfaceC25435a;
                        obj = objM68156h;
                        InterfaceC25435a interfaceC25435a5 = interfaceC25435a2;
                        c34832o0M68157i = (C34832o0) obj;
                        interfaceC25435a = interfaceC25435a5;
                    }
                    return enumC31071a;
                }
                c23543a.logger.mo85228t("Pending token already refreshed by another call; retrying with current token", new AbstractC30556a.a[0]);
                c34832o0M68157i = c23543a.m68157i(c34850x0.f146789w, accessToken);
                interfaceC25435a.mo68214i(null);
                return c34832o0M68157i;
            } catch (Throwable th5) {
                interfaceC25435a2 = interfaceC25435a;
                th3 = th5;
                interfaceC25435a2.mo68214i(null);
                throw th3;
            }
        }
    }

    /* JADX INFO: renamed from: l92.a$b */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.service.network.onboarding.OnboardingAuthTokenRefresher", m100430f = "OnboardingAuthTokenRefresher.kt", m100431l = {76, 93}, m100432m = "refreshAndSign", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b extends AbstractC32269c {

        /* JADX INFO: renamed from: F */
        int f93260F;

        /* JADX INFO: renamed from: w */
        Object f93261w;

        /* JADX INFO: renamed from: x */
        Object f93262x;

        /* JADX INFO: renamed from: y */
        Object f93263y;

        /* JADX INFO: renamed from: z */
        /* synthetic */ Object f93264z;

        public b(InterfaceC30057d<? super b> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f93264z = obj;
            this.f93260F |= Integer.MIN_VALUE;
            return C23543a.this.m68156h(null, null, this);
        }
    }

    public C23543a(C27847j pendingUserSessionRepository, C12066b cognitoAuthApi, InterfaceC23462h metricWriter, InterfaceC25435a mutex, C21433a accessTokenExtractor, C21452t topPrivateDomainHelper, InterfaceC34116n logger) {
        AbstractC22676k.m65750j(pendingUserSessionRepository, "pendingUserSessionRepository");
        AbstractC22676k.m65750j(cognitoAuthApi, "cognitoAuthApi");
        AbstractC22676k.m65750j(metricWriter, "metricWriter");
        AbstractC22676k.m65750j(mutex, "mutex");
        AbstractC22676k.m65750j(accessTokenExtractor, "accessTokenExtractor");
        AbstractC22676k.m65750j(topPrivateDomainHelper, "topPrivateDomainHelper");
        AbstractC22676k.m65750j(logger, "logger");
        this.pendingUserSessionRepository = pendingUserSessionRepository;
        this.cognitoAuthApi = cognitoAuthApi;
        this.metricWriter = metricWriter;
        this.mutex = mutex;
        this.accessTokenExtractor = accessTokenExtractor;
        this.topPrivateDomainHelper = topPrivateDomainHelper;
        this.logger = logger;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: h */
    public final Object m68156h(String str, C34850x0 c34850x0, InterfaceC30057d<? super C34832o0> interfaceC30057d) throws Exception {
        b bVar;
        Exception exception;
        if (interfaceC30057d instanceof b) {
            bVar = (b) interfaceC30057d;
            int i13 = bVar.f93260F;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                bVar.f93260F = i13 - Integer.MIN_VALUE;
            } else {
                bVar = new b(interfaceC30057d);
            }
        } else {
            bVar = new b(interfaceC30057d);
        }
        Object objM33312y = bVar.f93264z;
        Object obj = EnumC31071a.f128113w;
        int i14 = bVar.f93260F;
        try {
            if (i14 == 0) {
                AbstractC34132o.m107864I(objM33312y);
                this.logger.mo85228t("refreshAndSign from " + c34850x0.f146789w.f146712a, new AbstractC30556a.a[0]);
                if (str != null) {
                    C12066b c12066b = this.cognitoAuthApi;
                    bVar.f93261w = null;
                    bVar.f93262x = c34850x0;
                    bVar.f93260F = 1;
                    objM33312y = c12066b.m33312y(str, true, bVar);
                    if (objM33312y == obj) {
                        return obj;
                    }
                }
                return null;
            }
            if (i14 != 1) {
                if (i14 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(objM33312y);
                return null;
            }
            c34850x0 = (C34850x0) bVar.f93262x;
            AbstractC34132o.m107864I(objM33312y);
            InterfaceC12077m interfaceC12077m = (InterfaceC12077m) objM33312y;
            if (interfaceC12077m instanceof InterfaceC12077m.b) {
                AuthMaterial authMaterial = new AuthMaterial(((InterfaceC12077m.b) interfaceC12077m).getMaterial().getAccessToken(), ((InterfaceC12077m.b) interfaceC12077m).getMaterial().getRefreshToken(), ((InterfaceC12077m.b) interfaceC12077m).getMaterial().getExpiresIn(), 0);
                this.pendingUserSessionRepository.m83956e(authMaterial.getAccessToken());
                this.pendingUserSessionRepository.m83957f(authMaterial);
                return m68157i(c34850x0.f146789w, authMaterial.getAccessToken());
            }
            InterfaceC12077m.a.C41475a c41475a = interfaceC12077m instanceof InterfaceC12077m.a.C41475a ? (InterfaceC12077m.a.C41475a) interfaceC12077m : null;
            if (c41475a == null || (exception = c41475a.getException()) == null) {
                throw new IOException("Cognito networking error");
            }
            throw exception;
        } catch (Exception e5) {
            AbstractC3006f0.m8721o(bVar.getContext());
            this.logger.mo85230v("failed to refresh for onboarding call: " + c34850x0.f146789w.f146712a, e5, new AbstractC30556a.a[0]);
            InterfaceC21442j aVar = new InterfaceC21442j.a(Boolean.FALSE, false, AbstractC37056f.m118958J("onboarding"));
            bVar.f93261w = null;
            bVar.f93262x = null;
            bVar.f93263y = null;
            bVar.f93260F = 2;
            if (m68158j(aVar, bVar) != obj) {
                return null;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: i */
    public final C34832o0 m68157i(C34832o0 c34832o0, String str) {
        C34830n0 c34830n0M109907b = c34832o0.m109907b();
        c34830n0M109907b.m109902c(TokenAuthInterceptor.AUTH_HEADER, String.format(C21441i.INSTANCE.m60343c(), "Bearer %s", Arrays.copyOf(new Object[]{str}, 1)));
        return new C34832o0(c34830n0M109907b);
    }

    /* JADX INFO: renamed from: j */
    private final Object m68158j(InterfaceC21442j interfaceC21442j, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        Object objMo58700a = ((InterfaceC21030c) this.metricWriter.getValue()).mo58700a(interfaceC21442j.mo60345b(), interfaceC30057d);
        return objMo58700a == EnumC31071a.f128113w ? objMo58700a : C23454a0.f92919a;
    }

    @Override // ud3.InterfaceC34803c
    /* JADX INFO: renamed from: a */
    public C34832o0 mo31437a(C34802b1 route, C34850x0 response) {
        AbstractC22676k.m65750j(response, "response");
        C21452t c21452t = this.topPrivateDomainHelper;
        C34832o0 c34832o0 = response.f146789w;
        if (!AbstractC21453u.m60389b(c21452t, c34832o0.f146712a)) {
            this.logger.mo85228t(AbstractC11266d.m30461o("Non WHOOP domain, skipping onboarding refresh: ", c34832o0.f146712a.f146565d), new AbstractC30556a.a[0]);
            return null;
        }
        if (this.pendingUserSessionRepository.getPendingAuthMaterial() == null) {
            return null;
        }
        return (C34832o0) AbstractC3006f0.m8699E(C30064k.f122676w, new a(response, null));
    }

    public /* synthetic */ C23543a(C27847j c27847j, C12066b c12066b, InterfaceC23462h interfaceC23462h, InterfaceC25435a interfaceC25435a, C21433a c21433a, C21452t c21452t, InterfaceC34116n interfaceC34116n, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(c27847j, c12066b, interfaceC23462h, (i13 & 8) != 0 ? AbstractC25438d.m74669a() : interfaceC25435a, (i13 & 16) != 0 ? new C21433a() : c21433a, (i13 & 32) != 0 ? new C21452t() : c21452t, (i13 & 64) != 0 ? InterfaceC34116n.INSTANCE.m107848a("OnboardingAuthTokenRefresher") : interfaceC34116n);
    }
}
