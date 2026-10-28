package j92;

import com.whoop.domain.model.AuthMaterial;
import com.whoop.domain.model.Session;
import com.whoop.service.network.AuthServiceApiV2;
import dj0.C12066b;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import iy1.InterfaceC21030c;
import jy1.C22047a;
import l83.C23454a0;
import mc3.InterfaceC25435a;
import od1.C27858u;
import or2.AbstractC28153d;
import or2.C28156e;
import p000.AbstractC11266d;
import p031b9.AbstractC2875y;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.InterfaceC30057d;
import qr2.AbstractC30556a;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import tr2.InterfaceC34116n;
import u02.InterfaceC34385a;
import ud3.C34850x0;
import wb3.AbstractC37056f;
import y92.C39352a;

/* JADX INFO: renamed from: j92.p */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001c\u0018\u00002\u00020\u0001BS\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015J \u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u0018H\u0082@¢\u0006\u0004\b\u001b\u0010\u001cJ\u0018\u0010 \u001a\u00020\u001f2\u0006\u0010\u001e\u001a\u00020\u001dH\u0082@¢\u0006\u0004\b \u0010!J\u001f\u0010%\u001a\u00020$2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010#\u001a\u00020\"H\u0002¢\u0006\u0004\b%\u0010&J$\u0010+\u001a\u00020\u001f2\b\u0010(\u001a\u0004\u0018\u00010'2\b\u0010*\u001a\u0004\u0018\u00010)H\u0082@¢\u0006\u0004\b+\u0010,J\"\u0010/\u001a\u00020\u001a2\u0006\u0010-\u001a\u00020\"2\b\u0010.\u001a\u0004\u0018\u00010\"H\u0082@¢\u0006\u0004\b/\u00100J\u0018\u00101\u001a\u00020\u001a2\u0006\u0010-\u001a\u00020\"H\u0082@¢\u0006\u0004\b1\u00102J\u0018\u00103\u001a\u00020\u001a2\u0006\u0010-\u001a\u00020\"H\u0082@¢\u0006\u0004\b3\u00102J\u0019\u00104\u001a\u00020$2\b\u0010#\u001a\u0004\u0018\u00010\"H\u0002¢\u0006\u0004\b4\u00105J \u00106\u001a\u00020\u001a2\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u0018H\u0080@¢\u0006\u0004\b6\u0010\u001cR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00108R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010:R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010<R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u0010>R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u0010@R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u0010AR\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u0010BR\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u0010CR\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010D¨\u0006E"}, m65681d2 = {"Lj92/p;", "", "Lcom/whoop/service/network/AuthServiceApiV2;", "authServiceApiV2", "Ldj0/b;", "cognitoAuthApi", "Ly92/a;", "authManager", "Lj92/a;", "accessTokenExtractor", "Lod1/u;", "userContext", "Liy1/c;", "metricWriter", "Lor2/e;", "authAnalyticHelper", "Lmc3/a;", "mutex", "Ltr2/n;", "logger", "<init>", "(Lcom/whoop/service/network/AuthServiceApiV2;Ldj0/b;Ly92/a;Lj92/a;Lod1/u;Liy1/c;Lor2/e;Lmc3/a;Ltr2/n;)V", "Lcom/whoop/domain/model/Session;", "session", "Lud3/x0;", "response", "Lj92/s;", "i", "(Lcom/whoop/domain/model/Session;Lud3/x0;Lq83/d;)Ljava/lang/Object;", "Lcom/whoop/domain/model/AuthMaterial;", "newAuthMaterial", "Ll83/a0;", "n", "(Lcom/whoop/domain/model/AuthMaterial;Lq83/d;)Ljava/lang/Object;", "", "accessToken", "", "k", "(Lud3/x0;Ljava/lang/String;)Z", "Lj92/j;", "metric", "Lor2/d;", "analyticEvent", "m", "(Lj92/j;Lor2/d;Lq83/d;)Ljava/lang/Object;", "currentRefreshToken", "currentAccessToken", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "(Ljava/lang/String;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;", "f", "(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;", "g", "l", "(Ljava/lang/String;)Z", "j", "a", "Lcom/whoop/service/network/AuthServiceApiV2;", "b", "Ldj0/b;", "c", "Ly92/a;", "d", "Lj92/a;", "e", "Lod1/u;", "Liy1/c;", "Lor2/e;", "Lmc3/a;", "Ltr2/n;", "core_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C21448p {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final AuthServiceApiV2 authServiceApiV2;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final C12066b cognitoAuthApi;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final C39352a authManager;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final C21433a accessTokenExtractor;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final C27858u userContext;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final InterfaceC21030c metricWriter;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final C28156e authAnalyticHelper;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private final InterfaceC25435a mutex;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private final InterfaceC34116n logger;

    /* JADX INFO: renamed from: j92.p$a */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.service.network.interceptor.RefreshInterceptorLock", m100430f = "RefreshInterceptorLock.kt", m100431l = {148, 201}, m100432m = "authServiceRefresh", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a extends AbstractC32269c {

        /* JADX INFO: renamed from: E */
        int f82354E;

        /* JADX INFO: renamed from: F */
        /* synthetic */ Object f82355F;

        /* JADX INFO: renamed from: H */
        int f82357H;

        /* JADX INFO: renamed from: w */
        Object f82358w;

        /* JADX INFO: renamed from: x */
        Object f82359x;

        /* JADX INFO: renamed from: y */
        Object f82360y;

        /* JADX INFO: renamed from: z */
        Object f82361z;

        public a(InterfaceC30057d<? super a> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f82355F = obj;
            this.f82357H |= Integer.MIN_VALUE;
            return C21448p.this.m60367f(null, this);
        }
    }

    /* JADX INFO: renamed from: j92.p$b */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.service.network.interceptor.RefreshInterceptorLock$authServiceRefresh$result$1", m100430f = "RefreshInterceptorLock.kt", m100431l = {149}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, m65681d2 = {"<anonymous>", "Lcom/whoop/domain/model/AuthMaterial;"}, m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b extends AbstractC32275i implements Function1 {

        /* JADX INFO: renamed from: w */
        int f82362w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ String f82364y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str, InterfaceC30057d<? super b> interfaceC30057d) {
            super(1, interfaceC30057d);
            this.f82364y = str;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(InterfaceC30057d<?> interfaceC30057d) {
            return C21448p.this.new b(this.f82364y, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f82362w;
            if (i13 != 0) {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
                return obj;
            }
            AbstractC34132o.m107864I(obj);
            AuthServiceApiV2 authServiceApiV2 = C21448p.this.authServiceApiV2;
            String strM30461o = AbstractC11266d.m30461o("Bearer ", this.f82364y);
            this.f82362w = 1;
            Object objRefreshToken = authServiceApiV2.refreshToken(strM30461o, this);
            return objRefreshToken == enumC31071a ? enumC31071a : objRefreshToken;
        }

        @Override // p715kotlin.jvm.functions.Function1
        public final Object invoke(InterfaceC30057d<? super AuthMaterial> interfaceC30057d) {
            return ((b) create(interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }
    }

    /* JADX INFO: renamed from: j92.p$c */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.service.network.interceptor.RefreshInterceptorLock", m100430f = "RefreshInterceptorLock.kt", m100431l = {208, 216}, m100432m = "cognitoTokenRefresh", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c extends AbstractC32269c {

        /* JADX INFO: renamed from: F */
        int f82366F;

        /* JADX INFO: renamed from: w */
        Object f82367w;

        /* JADX INFO: renamed from: x */
        Object f82368x;

        /* JADX INFO: renamed from: y */
        Object f82369y;

        /* JADX INFO: renamed from: z */
        /* synthetic */ Object f82370z;

        public c(InterfaceC30057d<? super c> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f82370z = obj;
            this.f82366F |= Integer.MIN_VALUE;
            return C21448p.this.m60368g(null, this);
        }
    }

    /* JADX INFO: renamed from: j92.p$d */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.service.network.interceptor.RefreshInterceptorLock", m100430f = "RefreshInterceptorLock.kt", m100431l = {286, 53, 59, 65, 95}, m100432m = "getTokenRefreshResult", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class d extends AbstractC32269c {

        /* JADX INFO: renamed from: E */
        Object f82371E;

        /* JADX INFO: renamed from: F */
        Object f82372F;

        /* JADX INFO: renamed from: G */
        Object f82373G;

        /* JADX INFO: renamed from: H */
        int f82374H;

        /* JADX INFO: renamed from: I */
        int f82375I;

        /* JADX INFO: renamed from: J */
        int f82376J;

        /* JADX INFO: renamed from: K */
        /* synthetic */ Object f82377K;

        /* JADX INFO: renamed from: M */
        int f82379M;

        /* JADX INFO: renamed from: w */
        Object f82380w;

        /* JADX INFO: renamed from: x */
        Object f82381x;

        /* JADX INFO: renamed from: y */
        Object f82382y;

        /* JADX INFO: renamed from: z */
        Object f82383z;

        public d(InterfaceC30057d<? super d> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f82377K = obj;
            this.f82379M |= Integer.MIN_VALUE;
            return C21448p.this.m60370i(null, null, this);
        }
    }

    /* JADX INFO: renamed from: j92.p$e */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.service.network.interceptor.RefreshInterceptorLock", m100430f = "RefreshInterceptorLock.kt", m100431l = {46, 47}, m100432m = "getUpdatedAuthMaterial$core_release", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class e extends AbstractC32269c {

        /* JADX INFO: renamed from: F */
        int f82385F;

        /* JADX INFO: renamed from: w */
        Object f82386w;

        /* JADX INFO: renamed from: x */
        Object f82387x;

        /* JADX INFO: renamed from: y */
        Object f82388y;

        /* JADX INFO: renamed from: z */
        /* synthetic */ Object f82389z;

        public e(InterfaceC30057d<? super e> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f82389z = obj;
            this.f82385F |= Integer.MIN_VALUE;
            return C21448p.this.m60375j(null, null, this);
        }
    }

    /* JADX INFO: renamed from: j92.p$f */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.service.network.interceptor.RefreshInterceptorLock", m100430f = "RefreshInterceptorLock.kt", m100431l = {103, 114}, m100432m = "updateLocalStorageWith", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class f extends AbstractC32269c {

        /* JADX INFO: renamed from: E */
        int f82390E;

        /* JADX INFO: renamed from: w */
        Object f82391w;

        /* JADX INFO: renamed from: x */
        Object f82392x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f82393y;

        public f(InterfaceC30057d<? super f> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f82393y = obj;
            this.f82390E |= Integer.MIN_VALUE;
            return C21448p.this.m60374n(null, this);
        }
    }

    public C21448p(AuthServiceApiV2 authServiceApiV2, C12066b cognitoAuthApi, C39352a authManager, C21433a accessTokenExtractor, C27858u userContext, InterfaceC21030c metricWriter, C28156e authAnalyticHelper, InterfaceC25435a mutex, InterfaceC34116n logger) {
        AbstractC22676k.m65750j(authServiceApiV2, "authServiceApiV2");
        AbstractC22676k.m65750j(cognitoAuthApi, "cognitoAuthApi");
        AbstractC22676k.m65750j(authManager, "authManager");
        AbstractC22676k.m65750j(accessTokenExtractor, "accessTokenExtractor");
        AbstractC22676k.m65750j(userContext, "userContext");
        AbstractC22676k.m65750j(metricWriter, "metricWriter");
        AbstractC22676k.m65750j(authAnalyticHelper, "authAnalyticHelper");
        AbstractC22676k.m65750j(mutex, "mutex");
        AbstractC22676k.m65750j(logger, "logger");
        this.authServiceApiV2 = authServiceApiV2;
        this.cognitoAuthApi = cognitoAuthApi;
        this.authManager = authManager;
        this.accessTokenExtractor = accessTokenExtractor;
        this.userContext = userContext;
        this.metricWriter = metricWriter;
        this.authAnalyticHelper = authAnalyticHelper;
        this.mutex = mutex;
        this.logger = logger;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    /* JADX INFO: renamed from: f */
    public final Object m60367f(String str, InterfaceC30057d<? super C21451s> interfaceC30057d) {
        a aVar;
        if (interfaceC30057d instanceof a) {
            aVar = (a) interfaceC30057d;
            int i13 = aVar.f82357H;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                aVar.f82357H = i13 - Integer.MIN_VALUE;
            } else {
                aVar = new a(interfaceC30057d);
            }
        } else {
            aVar = new a(interfaceC30057d);
        }
        a aVar2 = aVar;
        Object objM108729b = aVar2.f82355F;
        Object obj = EnumC31071a.f128113w;
        int i14 = aVar2.f82357H;
        if (i14 == 0) {
            AbstractC34132o.m107864I(objM108729b);
            InterfaceC34385a.Companion companion = InterfaceC34385a.INSTANCE;
            InterfaceC34116n interfaceC34116n = this.logger;
            b bVar = new b(str, null);
            aVar2.f82358w = null;
            aVar2.f82357H = 1;
            objM108729b = InterfaceC34385a.Companion.m108729b(companion, interfaceC34116n, null, null, bVar, aVar2, 6, null);
            if (objM108729b != obj) {
            }
        }
        if (i14 != 1) {
            if (i14 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C21451s c21451s = (C21451s) aVar2.f82360y;
            AbstractC34132o.m107864I(objM108729b);
            return c21451s;
        }
        AbstractC34132o.m107864I(objM108729b);
        InterfaceC34385a interfaceC34385a = (InterfaceC34385a) objM108729b;
        if (interfaceC34385a instanceof InterfaceC34385a.b.C42432b) {
            return new C21451s(null, true, false, new InterfaceC21442j.a(Boolean.FALSE, false, AbstractC37056f.m118958J("network")), new AbstractC28153d.c(false, "network"));
        }
        if (interfaceC34385a instanceof InterfaceC34385a.b.a) {
            InterfaceC34385a.b.a aVar3 = (InterfaceC34385a.b.a) interfaceC34385a;
            return new C21451s(null, true, true, new InterfaceC21442j.a(Boolean.FALSE, true, AbstractC37056f.m118958J("http:" + aVar3.getErrorCode())), new AbstractC28153d.c(false, AbstractC2875y.m8295h(aVar3.getErrorCode(), "http: ")));
        }
        if (!(interfaceC34385a instanceof InterfaceC34385a.c)) {
            throw new NoWhenBranchMatchedException();
        }
        InterfaceC34385a.c cVar = (InterfaceC34385a.c) interfaceC34385a;
        C21451s c21451s2 = new C21451s((AuthMaterial) cVar.m108735a(), false, false, new InterfaceC21442j.b(Boolean.FALSE), new AbstractC28153d.c(true, "success"));
        AuthMaterial authMaterial = (AuthMaterial) cVar.m108735a();
        aVar2.f82358w = null;
        aVar2.f82359x = null;
        aVar2.f82360y = c21451s2;
        aVar2.f82361z = null;
        aVar2.f82354E = 0;
        aVar2.f82357H = 2;
        return m60374n(authMaterial, aVar2) == obj ? obj : c21451s2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0090, code lost:
    
        if (m60374n(r11, r4) == r0) goto L25;
     */
    /* JADX INFO: renamed from: g */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m60368g(java.lang.String r11, q83.InterfaceC30057d<? super j92.C21451s> r12) {
        /*
            Method dump skipped, instruction units count: 282
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: j92.C21448p.m60368g(java.lang.String, q83.d):java.lang.Object");
    }

    /* JADX INFO: renamed from: h */
    private final Object m60369h(String str, String str2, InterfaceC30057d<? super C21451s> interfaceC30057d) {
        this.logger.mo85216g("fetchAuthMaterial", new AbstractC30556a.a[0]);
        if (m60372l(str2)) {
            return m60368g(str, interfaceC30057d);
        }
        this.logger.mo85216g("refresh token is not a cognito token, using auth v2", new AbstractC30556a.a[0]);
        return m60367f(str, interfaceC30057d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:49:0x011c A[PHI: r0 r4 r8 r12 r13 r14 r15
      0x011c: PHI (r0v20 com.whoop.domain.model.AuthMaterial) = 
      (r0v8 com.whoop.domain.model.AuthMaterial)
      (r0v22 com.whoop.domain.model.AuthMaterial)
      (r0v22 com.whoop.domain.model.AuthMaterial)
     binds: [B:56:0x0150, B:51:0x0126, B:47:0x0119] A[DONT_GENERATE, DONT_INLINE]
      0x011c: PHI (r4v9 int) = (r4v5 int), (r4v10 int), (r4v10 int) binds: [B:56:0x0150, B:51:0x0126, B:47:0x0119] A[DONT_GENERATE, DONT_INLINE]
      0x011c: PHI (r8v9 int) = (r8v4 int), (r8v11 int), (r8v11 int) binds: [B:56:0x0150, B:51:0x0126, B:47:0x0119] A[DONT_GENERATE, DONT_INLINE]
      0x011c: PHI (r12v8 mc3.a) = (r12v4 mc3.a), (r12v10 mc3.a), (r12v10 mc3.a) binds: [B:56:0x0150, B:51:0x0126, B:47:0x0119] A[DONT_GENERATE, DONT_INLINE]
      0x011c: PHI (r13v5 java.lang.String) = (r13v3 java.lang.String), (r13v10 java.lang.String), (r13v12 java.lang.String) binds: [B:56:0x0150, B:51:0x0126, B:47:0x0119] A[DONT_GENERATE, DONT_INLINE]
      0x011c: PHI (r14v6 ud3.x0) = (r14v3 ud3.x0), (r14v7 ud3.x0), (r14v7 ud3.x0) binds: [B:56:0x0150, B:51:0x0126, B:47:0x0119] A[DONT_GENERATE, DONT_INLINE]
      0x011c: PHI (r15v3 com.whoop.domain.model.Session) = (r15v2 com.whoop.domain.model.Session), (r15v4 com.whoop.domain.model.Session), (r15v4 com.whoop.domain.model.Session) binds: [B:56:0x0150, B:51:0x0126, B:47:0x0119] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:50:0x011e A[Catch: all -> 0x00bd, TryCatch #3 {all -> 0x00bd, blocks: (B:72:0x01a6, B:74:0x01ac, B:78:0x01c8, B:81:0x01ea, B:58:0x0157, B:62:0x0161, B:64:0x016b, B:66:0x0175, B:31:0x00b7, B:44:0x0111, B:46:0x0115, B:50:0x011e, B:52:0x0128), top: B:96:0x00b7 }] */
    /* JADX WARN: Code duplicated, block: B:52:0x0128 A[Catch: all -> 0x00bd, TryCatch #3 {all -> 0x00bd, blocks: (B:72:0x01a6, B:74:0x01ac, B:78:0x01c8, B:81:0x01ea, B:58:0x0157, B:62:0x0161, B:64:0x016b, B:66:0x0175, B:31:0x00b7, B:44:0x0111, B:46:0x0115, B:50:0x011e, B:52:0x0128), top: B:96:0x00b7 }] */
    /* JADX WARN: Code duplicated, block: B:54:0x014a  */
    /* JADX WARN: Code duplicated, block: B:55:0x014c  */
    /* JADX WARN: Code duplicated, block: B:58:0x0157 A[Catch: all -> 0x00bd, TryCatch #3 {all -> 0x00bd, blocks: (B:72:0x01a6, B:74:0x01ac, B:78:0x01c8, B:81:0x01ea, B:58:0x0157, B:62:0x0161, B:64:0x016b, B:66:0x0175, B:31:0x00b7, B:44:0x0111, B:46:0x0115, B:50:0x011e, B:52:0x0128), top: B:96:0x00b7 }] */
    /* JADX WARN: Code duplicated, block: B:61:0x015e A[PHI: r0 r4 r5 r7 r8 r12 r14
      0x015e: PHI (r0v11 com.whoop.domain.model.AuthMaterial) = 
      (r0v9 com.whoop.domain.model.AuthMaterial)
      (r0v20 com.whoop.domain.model.AuthMaterial)
      (r0v20 com.whoop.domain.model.AuthMaterial)
      (r0v20 com.whoop.domain.model.AuthMaterial)
     binds: [B:70:0x019f, B:63:0x0169, B:65:0x0173, B:59:0x015b] A[DONT_GENERATE, DONT_INLINE]
      0x015e: PHI (r4v7 int) = (r4v6 int), (r4v9 int), (r4v9 int), (r4v9 int) binds: [B:70:0x019f, B:63:0x0169, B:65:0x0173, B:59:0x015b] A[DONT_GENERATE, DONT_INLINE]
      0x015e: PHI (r5v2 java.lang.String) = (r5v1 java.lang.String), (r5v5 java.lang.String), (r5v5 java.lang.String), (r5v6 java.lang.String) binds: [B:70:0x019f, B:63:0x0169, B:65:0x0173, B:59:0x015b] A[DONT_GENERATE, DONT_INLINE]
      0x015e: PHI (r7v3 java.lang.String) = (r7v2 java.lang.String), (r7v5 java.lang.String), (r7v5 java.lang.String), (r7v5 java.lang.String) binds: [B:70:0x019f, B:63:0x0169, B:65:0x0173, B:59:0x015b] A[DONT_GENERATE, DONT_INLINE]
      0x015e: PHI (r8v7 int) = (r8v6 int), (r8v9 int), (r8v9 int), (r8v9 int) binds: [B:70:0x019f, B:63:0x0169, B:65:0x0173, B:59:0x015b] A[DONT_GENERATE, DONT_INLINE]
      0x015e: PHI (r12v7 mc3.a) = (r12v6 mc3.a), (r12v8 mc3.a), (r12v8 mc3.a), (r12v8 mc3.a) binds: [B:70:0x019f, B:63:0x0169, B:65:0x0173, B:59:0x015b] A[DONT_GENERATE, DONT_INLINE]
      0x015e: PHI (r14v5 ud3.x0) = (r14v4 ud3.x0), (r14v6 ud3.x0), (r14v6 ud3.x0), (r14v6 ud3.x0) binds: [B:70:0x019f, B:63:0x0169, B:65:0x0173, B:59:0x015b] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:62:0x0161 A[Catch: all -> 0x00bd, TryCatch #3 {all -> 0x00bd, blocks: (B:72:0x01a6, B:74:0x01ac, B:78:0x01c8, B:81:0x01ea, B:58:0x0157, B:62:0x0161, B:64:0x016b, B:66:0x0175, B:31:0x00b7, B:44:0x0111, B:46:0x0115, B:50:0x011e, B:52:0x0128), top: B:96:0x00b7 }] */
    /* JADX WARN: Code duplicated, block: B:64:0x016b A[Catch: all -> 0x00bd, TryCatch #3 {all -> 0x00bd, blocks: (B:72:0x01a6, B:74:0x01ac, B:78:0x01c8, B:81:0x01ea, B:58:0x0157, B:62:0x0161, B:64:0x016b, B:66:0x0175, B:31:0x00b7, B:44:0x0111, B:46:0x0115, B:50:0x011e, B:52:0x0128), top: B:96:0x00b7 }] */
    /* JADX WARN: Code duplicated, block: B:72:0x01a6 A[Catch: all -> 0x00bd, TryCatch #3 {all -> 0x00bd, blocks: (B:72:0x01a6, B:74:0x01ac, B:78:0x01c8, B:81:0x01ea, B:58:0x0157, B:62:0x0161, B:64:0x016b, B:66:0x0175, B:31:0x00b7, B:44:0x0111, B:46:0x0115, B:50:0x011e, B:52:0x0128), top: B:96:0x00b7 }] */
    /* JADX WARN: Code duplicated, block: B:78:0x01c8 A[Catch: all -> 0x00bd, TRY_ENTER, TRY_LEAVE, TryCatch #3 {all -> 0x00bd, blocks: (B:72:0x01a6, B:74:0x01ac, B:78:0x01c8, B:81:0x01ea, B:58:0x0157, B:62:0x0161, B:64:0x016b, B:66:0x0175, B:31:0x00b7, B:44:0x0111, B:46:0x0115, B:50:0x011e, B:52:0x0128), top: B:96:0x00b7 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code duplicated, block: B:81:0x01ea A[Catch: all -> 0x00bd, TRY_ENTER, TRY_LEAVE, TryCatch #3 {all -> 0x00bd, blocks: (B:72:0x01a6, B:74:0x01ac, B:78:0x01c8, B:81:0x01ea, B:58:0x0157, B:62:0x0161, B:64:0x016b, B:66:0x0175, B:31:0x00b7, B:44:0x0111, B:46:0x0115, B:50:0x011e, B:52:0x0128), top: B:96:0x00b7 }] */
    /* JADX WARN: Code duplicated, block: B:84:0x020f  */
    /* JADX WARN: Not initialized variable reg: 13, insn: 0x0083: MOVE (r3 I:??[OBJECT, ARRAY]) = (r13 I:??[OBJECT, ARRAY]), block:B:26:0x0083 */
    /* JADX INFO: renamed from: i */
    public final Object m60370i(Session session, C34850x0 c34850x0, InterfaceC30057d<? super C21451s> interfaceC30057d) throws Throwable {
        d dVar;
        C34850x0 c34850x1;
        Session session2;
        InterfaceC25435a interfaceC25435a;
        int i13;
        InterfaceC25435a interfaceC25435a2;
        int i14;
        Session session3;
        C34850x0 c34850x2;
        InterfaceC25435a interfaceC25435a3;
        int i15;
        InterfaceC25435a interfaceC25435a4;
        AuthMaterial authMaterial;
        String str;
        int i16;
        AuthMaterial authMaterial2;
        String refreshToken;
        InterfaceC25435a interfaceC25435a5;
        AuthMaterial authMaterial3;
        String str2;
        String str3;
        int i17;
        String accessToken;
        InterfaceC21030c interfaceC21030c;
        C22047a c22047aMo60345b;
        InterfaceC25435a interfaceC25435a6;
        if (interfaceC30057d instanceof d) {
            dVar = (d) interfaceC30057d;
            int i18 = dVar.f82379M;
            if ((i18 & Integer.MIN_VALUE) != 0) {
                dVar.f82379M = i18 - Integer.MIN_VALUE;
            } else {
                dVar = new d(interfaceC30057d);
            }
        } else {
            dVar = new d(interfaceC30057d);
        }
        Object objM60369h = dVar.f82377K;
        Object obj = EnumC31071a.f128113w;
        int i19 = dVar.f82379M;
        try {
            if (i19 == 0) {
                AbstractC34132o.m107864I(objM60369h);
                InterfaceC25435a interfaceC25435a7 = this.mutex;
                dVar.f82380w = session;
                c34850x1 = c34850x0;
                dVar.f82381x = c34850x1;
                dVar.f82382y = interfaceC25435a7;
                dVar.f82374H = 0;
                dVar.f82379M = 1;
                if (interfaceC25435a7.mo68211b(dVar) != obj) {
                    session2 = session;
                    interfaceC25435a = interfaceC25435a7;
                    i13 = 0;
                }
                return obj;
            }
            if (i19 != 1) {
                if (i19 != 2) {
                    try {
                        if (i19 == 3) {
                            i15 = dVar.f82375I;
                            i16 = dVar.f82374H;
                            str = (String) dVar.f82371E;
                            authMaterial = (AuthMaterial) dVar.f82383z;
                            interfaceC25435a4 = (InterfaceC25435a) dVar.f82382y;
                            c34850x2 = (C34850x0) dVar.f82381x;
                            session3 = (Session) dVar.f82380w;
                            AbstractC34132o.m107864I(objM60369h);
                            authMaterial2 = authMaterial;
                            interfaceC25435a3 = interfaceC25435a4;
                            refreshToken = str;
                            i14 = i16;
                            str3 = refreshToken;
                            if (authMaterial2 != null || (accessToken = authMaterial2.getAccessToken()) == null) {
                                accessToken = session3.getAuthToken().getAccessToken();
                                if (accessToken == null && session3.getAuthToken().getRefreshToken() == null) {
                                    InterfaceC21030c interfaceC21030c2 = this.metricWriter;
                                    C22047a c22047aMo60345b2 = InterfaceC21442j.c.f82308a.mo60345b();
                                    dVar.f82380w = null;
                                    dVar.f82381x = c34850x2;
                                    dVar.f82382y = interfaceC25435a3;
                                    dVar.f82383z = authMaterial2;
                                    dVar.f82371E = accessToken;
                                    dVar.f82372F = null;
                                    dVar.f82373G = str3;
                                    dVar.f82374H = i14;
                                    dVar.f82375I = i15;
                                    dVar.f82376J = 0;
                                    dVar.f82379M = 4;
                                    if (interfaceC21030c2.mo58700a(c22047aMo60345b2, dVar) != obj) {
                                        i17 = i14;
                                        interfaceC25435a5 = interfaceC25435a3;
                                        authMaterial3 = authMaterial2;
                                        str2 = accessToken;
                                        accessToken = str2;
                                        authMaterial2 = authMaterial3;
                                        interfaceC25435a3 = interfaceC25435a5;
                                        i14 = i17;
                                        AuthMaterial authMaterial4 = authMaterial2;
                                        if (accessToken == null) {
                                        }
                                        if (str3 == null) {
                                            this.logger.mo85228t("No currentRefreshToken to refresh with. skipping auth material fetch", new AbstractC30556a.a[0]);
                                            C21451s c21451s = new C21451s(null, true, true, new InterfaceC21442j.a(null, true, AbstractC37056f.m118958J("no_refresh_token")), null);
                                            interfaceC25435a3.mo68214i(null);
                                            return c21451s;
                                        }
                                        this.logger.mo85228t("Have not refreshed yet, refreshing token", new AbstractC30556a.a[0]);
                                        dVar.f82380w = null;
                                        dVar.f82381x = null;
                                        dVar.f82382y = interfaceC25435a3;
                                        dVar.f82383z = null;
                                        dVar.f82371E = null;
                                        dVar.f82372F = null;
                                        dVar.f82373G = null;
                                        dVar.f82374H = i14;
                                        dVar.f82375I = i15;
                                        dVar.f82379M = 5;
                                        objM60369h = m60369h(str3, accessToken, dVar);
                                        if (objM60369h != obj) {
                                            interfaceC25435a2 = interfaceC25435a3;
                                        }
                                    }
                                } else {
                                    AuthMaterial authMaterial5 = authMaterial2;
                                    if (accessToken == null) {
                                    }
                                    if (str3 == null) {
                                        this.logger.mo85228t("No currentRefreshToken to refresh with. skipping auth material fetch", new AbstractC30556a.a[0]);
                                        C21451s c21451s2 = new C21451s(null, true, true, new InterfaceC21442j.a(null, true, AbstractC37056f.m118958J("no_refresh_token")), null);
                                        interfaceC25435a3.mo68214i(null);
                                        return c21451s2;
                                    }
                                    this.logger.mo85228t("Have not refreshed yet, refreshing token", new AbstractC30556a.a[0]);
                                    dVar.f82380w = null;
                                    dVar.f82381x = null;
                                    dVar.f82382y = interfaceC25435a3;
                                    dVar.f82383z = null;
                                    dVar.f82371E = null;
                                    dVar.f82372F = null;
                                    dVar.f82373G = null;
                                    dVar.f82374H = i14;
                                    dVar.f82375I = i15;
                                    dVar.f82379M = 5;
                                    objM60369h = m60369h(str3, accessToken, dVar);
                                    if (objM60369h != obj) {
                                        interfaceC25435a2 = interfaceC25435a3;
                                    }
                                }
                            } else {
                                AuthMaterial authMaterial6 = authMaterial2;
                                if (accessToken == null) {
                                }
                                if (str3 == null) {
                                    this.logger.mo85228t("No currentRefreshToken to refresh with. skipping auth material fetch", new AbstractC30556a.a[0]);
                                    C21451s c21451s3 = new C21451s(null, true, true, new InterfaceC21442j.a(null, true, AbstractC37056f.m118958J("no_refresh_token")), null);
                                    interfaceC25435a3.mo68214i(null);
                                    return c21451s3;
                                }
                                this.logger.mo85228t("Have not refreshed yet, refreshing token", new AbstractC30556a.a[0]);
                                dVar.f82380w = null;
                                dVar.f82381x = null;
                                dVar.f82382y = interfaceC25435a3;
                                dVar.f82383z = null;
                                dVar.f82371E = null;
                                dVar.f82372F = null;
                                dVar.f82373G = null;
                                dVar.f82374H = i14;
                                dVar.f82375I = i15;
                                dVar.f82379M = 5;
                                objM60369h = m60369h(str3, accessToken, dVar);
                                if (objM60369h != obj) {
                                    interfaceC25435a2 = interfaceC25435a3;
                                }
                            }
                            return obj;
                        }
                        if (i19 == 4) {
                            i15 = dVar.f82375I;
                            i17 = dVar.f82374H;
                            str3 = (String) dVar.f82373G;
                            str2 = (String) dVar.f82371E;
                            authMaterial3 = (AuthMaterial) dVar.f82383z;
                            interfaceC25435a5 = (InterfaceC25435a) dVar.f82382y;
                            c34850x2 = (C34850x0) dVar.f82381x;
                            AbstractC34132o.m107864I(objM60369h);
                            accessToken = str2;
                            authMaterial2 = authMaterial3;
                            interfaceC25435a3 = interfaceC25435a5;
                            i14 = i17;
                            AuthMaterial authMaterial7 = authMaterial2;
                            if (accessToken == null && m60371k(c34850x2, accessToken)) {
                                this.logger.mo85228t("Already refreshed, returning existing auth material", new AbstractC30556a.a[0]);
                                C21451s c21451s4 = new C21451s(authMaterial7, true, false, null, null);
                                interfaceC25435a3.mo68214i(null);
                                return c21451s4;
                            }
                            if (str3 == null) {
                                this.logger.mo85228t("No currentRefreshToken to refresh with. skipping auth material fetch", new AbstractC30556a.a[0]);
                                C21451s c21451s5 = new C21451s(null, true, true, new InterfaceC21442j.a(null, true, AbstractC37056f.m118958J("no_refresh_token")), null);
                                interfaceC25435a3.mo68214i(null);
                                return c21451s5;
                            }
                            this.logger.mo85228t("Have not refreshed yet, refreshing token", new AbstractC30556a.a[0]);
                            dVar.f82380w = null;
                            dVar.f82381x = null;
                            dVar.f82382y = interfaceC25435a3;
                            dVar.f82383z = null;
                            dVar.f82371E = null;
                            dVar.f82372F = null;
                            dVar.f82373G = null;
                            dVar.f82374H = i14;
                            dVar.f82375I = i15;
                            dVar.f82379M = 5;
                            objM60369h = m60369h(str3, accessToken, dVar);
                            if (objM60369h != obj) {
                                interfaceC25435a2 = interfaceC25435a3;
                            }
                            return obj;
                        }
                        if (i19 != 5) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        interfaceC25435a2 = (InterfaceC25435a) dVar.f82382y;
                        try {
                            AbstractC34132o.m107864I(objM60369h);
                        } catch (Throwable th3) {
                            th = th3;
                        }
                        interfaceC25435a2.mo68214i(null);
                        return objM60369h;
                    } catch (Throwable th4) {
                        th = th4;
                        interfaceC25435a2 = interfaceC25435a6;
                    }
                } else {
                    i15 = dVar.f82375I;
                    i14 = dVar.f82374H;
                    interfaceC25435a3 = (InterfaceC25435a) dVar.f82382y;
                    C34850x0 c34850x3 = (C34850x0) dVar.f82381x;
                    Session session4 = (Session) dVar.f82380w;
                    try {
                        AbstractC34132o.m107864I(objM60369h);
                        session3 = session4;
                        c34850x2 = c34850x3;
                        authMaterial2 = (AuthMaterial) objM60369h;
                        if (authMaterial2 != null || (refreshToken = authMaterial2.getRefreshToken()) == null) {
                            refreshToken = session3.getAuthToken().getRefreshToken();
                            if (refreshToken != null) {
                                interfaceC21030c = this.metricWriter;
                                c22047aMo60345b = InterfaceC21442j.c.f82308a.mo60345b();
                                dVar.f82380w = session3;
                                dVar.f82381x = c34850x2;
                                dVar.f82382y = interfaceC25435a3;
                                dVar.f82383z = authMaterial2;
                                dVar.f82371E = refreshToken;
                                dVar.f82372F = null;
                                dVar.f82374H = i14;
                                dVar.f82375I = i15;
                                dVar.f82376J = 0;
                                dVar.f82379M = 3;
                                if (interfaceC21030c.mo58700a(c22047aMo60345b, dVar) != obj) {
                                    i16 = i14;
                                    str = refreshToken;
                                    interfaceC25435a4 = interfaceC25435a3;
                                    authMaterial = authMaterial2;
                                    authMaterial2 = authMaterial;
                                    interfaceC25435a3 = interfaceC25435a4;
                                    refreshToken = str;
                                    i14 = i16;
                                    str3 = refreshToken;
                                    if (authMaterial2 != null) {
                                        accessToken = session3.getAuthToken().getAccessToken();
                                        if (accessToken == null) {
                                            AuthMaterial authMaterial8 = authMaterial2;
                                            if (accessToken == null) {
                                            }
                                            if (str3 == null) {
                                                this.logger.mo85228t("No currentRefreshToken to refresh with. skipping auth material fetch", new AbstractC30556a.a[0]);
                                                C21451s c21451s6 = new C21451s(null, true, true, new InterfaceC21442j.a(null, true, AbstractC37056f.m118958J("no_refresh_token")), null);
                                                interfaceC25435a3.mo68214i(null);
                                                return c21451s6;
                                            }
                                            this.logger.mo85228t("Have not refreshed yet, refreshing token", new AbstractC30556a.a[0]);
                                            dVar.f82380w = null;
                                            dVar.f82381x = null;
                                            dVar.f82382y = interfaceC25435a3;
                                            dVar.f82383z = null;
                                            dVar.f82371E = null;
                                            dVar.f82372F = null;
                                            dVar.f82373G = null;
                                            dVar.f82374H = i14;
                                            dVar.f82375I = i15;
                                            dVar.f82379M = 5;
                                            objM60369h = m60369h(str3, accessToken, dVar);
                                            if (objM60369h != obj) {
                                                interfaceC25435a2 = interfaceC25435a3;
                                                interfaceC25435a2.mo68214i(null);
                                                return objM60369h;
                                            }
                                        } else {
                                            AuthMaterial authMaterial9 = authMaterial2;
                                            if (accessToken == null) {
                                            }
                                            if (str3 == null) {
                                                this.logger.mo85228t("No currentRefreshToken to refresh with. skipping auth material fetch", new AbstractC30556a.a[0]);
                                                C21451s c21451s7 = new C21451s(null, true, true, new InterfaceC21442j.a(null, true, AbstractC37056f.m118958J("no_refresh_token")), null);
                                                interfaceC25435a3.mo68214i(null);
                                                return c21451s7;
                                            }
                                            this.logger.mo85228t("Have not refreshed yet, refreshing token", new AbstractC30556a.a[0]);
                                            dVar.f82380w = null;
                                            dVar.f82381x = null;
                                            dVar.f82382y = interfaceC25435a3;
                                            dVar.f82383z = null;
                                            dVar.f82371E = null;
                                            dVar.f82372F = null;
                                            dVar.f82373G = null;
                                            dVar.f82374H = i14;
                                            dVar.f82375I = i15;
                                            dVar.f82379M = 5;
                                            objM60369h = m60369h(str3, accessToken, dVar);
                                            if (objM60369h != obj) {
                                                interfaceC25435a2 = interfaceC25435a3;
                                                interfaceC25435a2.mo68214i(null);
                                                return objM60369h;
                                            }
                                        }
                                    } else {
                                        accessToken = session3.getAuthToken().getAccessToken();
                                        if (accessToken == null) {
                                            AuthMaterial authMaterial10 = authMaterial2;
                                            if (accessToken == null) {
                                            }
                                            if (str3 == null) {
                                                this.logger.mo85228t("No currentRefreshToken to refresh with. skipping auth material fetch", new AbstractC30556a.a[0]);
                                                C21451s c21451s8 = new C21451s(null, true, true, new InterfaceC21442j.a(null, true, AbstractC37056f.m118958J("no_refresh_token")), null);
                                                interfaceC25435a3.mo68214i(null);
                                                return c21451s8;
                                            }
                                            this.logger.mo85228t("Have not refreshed yet, refreshing token", new AbstractC30556a.a[0]);
                                            dVar.f82380w = null;
                                            dVar.f82381x = null;
                                            dVar.f82382y = interfaceC25435a3;
                                            dVar.f82383z = null;
                                            dVar.f82371E = null;
                                            dVar.f82372F = null;
                                            dVar.f82373G = null;
                                            dVar.f82374H = i14;
                                            dVar.f82375I = i15;
                                            dVar.f82379M = 5;
                                            objM60369h = m60369h(str3, accessToken, dVar);
                                            if (objM60369h != obj) {
                                                interfaceC25435a2 = interfaceC25435a3;
                                                interfaceC25435a2.mo68214i(null);
                                                return objM60369h;
                                            }
                                        } else {
                                            AuthMaterial authMaterial11 = authMaterial2;
                                            if (accessToken == null) {
                                            }
                                            if (str3 == null) {
                                                this.logger.mo85228t("No currentRefreshToken to refresh with. skipping auth material fetch", new AbstractC30556a.a[0]);
                                                C21451s c21451s9 = new C21451s(null, true, true, new InterfaceC21442j.a(null, true, AbstractC37056f.m118958J("no_refresh_token")), null);
                                                interfaceC25435a3.mo68214i(null);
                                                return c21451s9;
                                            }
                                            this.logger.mo85228t("Have not refreshed yet, refreshing token", new AbstractC30556a.a[0]);
                                            dVar.f82380w = null;
                                            dVar.f82381x = null;
                                            dVar.f82382y = interfaceC25435a3;
                                            dVar.f82383z = null;
                                            dVar.f82371E = null;
                                            dVar.f82372F = null;
                                            dVar.f82373G = null;
                                            dVar.f82374H = i14;
                                            dVar.f82375I = i15;
                                            dVar.f82379M = 5;
                                            objM60369h = m60369h(str3, accessToken, dVar);
                                            if (objM60369h != obj) {
                                                interfaceC25435a2 = interfaceC25435a3;
                                                interfaceC25435a2.mo68214i(null);
                                                return objM60369h;
                                            }
                                        }
                                    }
                                }
                            } else {
                                str3 = refreshToken;
                                if (authMaterial2 != null) {
                                    accessToken = session3.getAuthToken().getAccessToken();
                                    if (accessToken == null) {
                                        AuthMaterial authMaterial12 = authMaterial2;
                                        if (accessToken == null) {
                                        }
                                        if (str3 == null) {
                                            this.logger.mo85228t("No currentRefreshToken to refresh with. skipping auth material fetch", new AbstractC30556a.a[0]);
                                            C21451s c21451s10 = new C21451s(null, true, true, new InterfaceC21442j.a(null, true, AbstractC37056f.m118958J("no_refresh_token")), null);
                                            interfaceC25435a3.mo68214i(null);
                                            return c21451s10;
                                        }
                                        this.logger.mo85228t("Have not refreshed yet, refreshing token", new AbstractC30556a.a[0]);
                                        dVar.f82380w = null;
                                        dVar.f82381x = null;
                                        dVar.f82382y = interfaceC25435a3;
                                        dVar.f82383z = null;
                                        dVar.f82371E = null;
                                        dVar.f82372F = null;
                                        dVar.f82373G = null;
                                        dVar.f82374H = i14;
                                        dVar.f82375I = i15;
                                        dVar.f82379M = 5;
                                        objM60369h = m60369h(str3, accessToken, dVar);
                                        if (objM60369h != obj) {
                                            interfaceC25435a2 = interfaceC25435a3;
                                            interfaceC25435a2.mo68214i(null);
                                            return objM60369h;
                                        }
                                    } else {
                                        AuthMaterial authMaterial13 = authMaterial2;
                                        if (accessToken == null) {
                                        }
                                        if (str3 == null) {
                                            this.logger.mo85228t("No currentRefreshToken to refresh with. skipping auth material fetch", new AbstractC30556a.a[0]);
                                            C21451s c21451s11 = new C21451s(null, true, true, new InterfaceC21442j.a(null, true, AbstractC37056f.m118958J("no_refresh_token")), null);
                                            interfaceC25435a3.mo68214i(null);
                                            return c21451s11;
                                        }
                                        this.logger.mo85228t("Have not refreshed yet, refreshing token", new AbstractC30556a.a[0]);
                                        dVar.f82380w = null;
                                        dVar.f82381x = null;
                                        dVar.f82382y = interfaceC25435a3;
                                        dVar.f82383z = null;
                                        dVar.f82371E = null;
                                        dVar.f82372F = null;
                                        dVar.f82373G = null;
                                        dVar.f82374H = i14;
                                        dVar.f82375I = i15;
                                        dVar.f82379M = 5;
                                        objM60369h = m60369h(str3, accessToken, dVar);
                                        if (objM60369h != obj) {
                                            interfaceC25435a2 = interfaceC25435a3;
                                            interfaceC25435a2.mo68214i(null);
                                            return objM60369h;
                                        }
                                    }
                                } else {
                                    accessToken = session3.getAuthToken().getAccessToken();
                                    if (accessToken == null) {
                                        AuthMaterial authMaterial14 = authMaterial2;
                                        if (accessToken == null) {
                                        }
                                        if (str3 == null) {
                                            this.logger.mo85228t("No currentRefreshToken to refresh with. skipping auth material fetch", new AbstractC30556a.a[0]);
                                            C21451s c21451s12 = new C21451s(null, true, true, new InterfaceC21442j.a(null, true, AbstractC37056f.m118958J("no_refresh_token")), null);
                                            interfaceC25435a3.mo68214i(null);
                                            return c21451s12;
                                        }
                                        this.logger.mo85228t("Have not refreshed yet, refreshing token", new AbstractC30556a.a[0]);
                                        dVar.f82380w = null;
                                        dVar.f82381x = null;
                                        dVar.f82382y = interfaceC25435a3;
                                        dVar.f82383z = null;
                                        dVar.f82371E = null;
                                        dVar.f82372F = null;
                                        dVar.f82373G = null;
                                        dVar.f82374H = i14;
                                        dVar.f82375I = i15;
                                        dVar.f82379M = 5;
                                        objM60369h = m60369h(str3, accessToken, dVar);
                                        if (objM60369h != obj) {
                                            interfaceC25435a2 = interfaceC25435a3;
                                            interfaceC25435a2.mo68214i(null);
                                            return objM60369h;
                                        }
                                    } else {
                                        AuthMaterial authMaterial15 = authMaterial2;
                                        if (accessToken == null) {
                                        }
                                        if (str3 == null) {
                                            this.logger.mo85228t("No currentRefreshToken to refresh with. skipping auth material fetch", new AbstractC30556a.a[0]);
                                            C21451s c21451s13 = new C21451s(null, true, true, new InterfaceC21442j.a(null, true, AbstractC37056f.m118958J("no_refresh_token")), null);
                                            interfaceC25435a3.mo68214i(null);
                                            return c21451s13;
                                        }
                                        this.logger.mo85228t("Have not refreshed yet, refreshing token", new AbstractC30556a.a[0]);
                                        dVar.f82380w = null;
                                        dVar.f82381x = null;
                                        dVar.f82382y = interfaceC25435a3;
                                        dVar.f82383z = null;
                                        dVar.f82371E = null;
                                        dVar.f82372F = null;
                                        dVar.f82373G = null;
                                        dVar.f82374H = i14;
                                        dVar.f82375I = i15;
                                        dVar.f82379M = 5;
                                        objM60369h = m60369h(str3, accessToken, dVar);
                                        if (objM60369h != obj) {
                                            interfaceC25435a2 = interfaceC25435a3;
                                            interfaceC25435a2.mo68214i(null);
                                            return objM60369h;
                                        }
                                    }
                                }
                            }
                        } else {
                            str3 = refreshToken;
                            if (authMaterial2 != null) {
                                accessToken = session3.getAuthToken().getAccessToken();
                                if (accessToken == null) {
                                    AuthMaterial authMaterial16 = authMaterial2;
                                    if (accessToken == null) {
                                    }
                                    if (str3 == null) {
                                        this.logger.mo85228t("No currentRefreshToken to refresh with. skipping auth material fetch", new AbstractC30556a.a[0]);
                                        C21451s c21451s14 = new C21451s(null, true, true, new InterfaceC21442j.a(null, true, AbstractC37056f.m118958J("no_refresh_token")), null);
                                        interfaceC25435a3.mo68214i(null);
                                        return c21451s14;
                                    }
                                    this.logger.mo85228t("Have not refreshed yet, refreshing token", new AbstractC30556a.a[0]);
                                    dVar.f82380w = null;
                                    dVar.f82381x = null;
                                    dVar.f82382y = interfaceC25435a3;
                                    dVar.f82383z = null;
                                    dVar.f82371E = null;
                                    dVar.f82372F = null;
                                    dVar.f82373G = null;
                                    dVar.f82374H = i14;
                                    dVar.f82375I = i15;
                                    dVar.f82379M = 5;
                                    objM60369h = m60369h(str3, accessToken, dVar);
                                    if (objM60369h != obj) {
                                        interfaceC25435a2 = interfaceC25435a3;
                                        interfaceC25435a2.mo68214i(null);
                                        return objM60369h;
                                    }
                                } else {
                                    AuthMaterial authMaterial17 = authMaterial2;
                                    if (accessToken == null) {
                                    }
                                    if (str3 == null) {
                                        this.logger.mo85228t("No currentRefreshToken to refresh with. skipping auth material fetch", new AbstractC30556a.a[0]);
                                        C21451s c21451s15 = new C21451s(null, true, true, new InterfaceC21442j.a(null, true, AbstractC37056f.m118958J("no_refresh_token")), null);
                                        interfaceC25435a3.mo68214i(null);
                                        return c21451s15;
                                    }
                                    this.logger.mo85228t("Have not refreshed yet, refreshing token", new AbstractC30556a.a[0]);
                                    dVar.f82380w = null;
                                    dVar.f82381x = null;
                                    dVar.f82382y = interfaceC25435a3;
                                    dVar.f82383z = null;
                                    dVar.f82371E = null;
                                    dVar.f82372F = null;
                                    dVar.f82373G = null;
                                    dVar.f82374H = i14;
                                    dVar.f82375I = i15;
                                    dVar.f82379M = 5;
                                    objM60369h = m60369h(str3, accessToken, dVar);
                                    if (objM60369h != obj) {
                                        interfaceC25435a2 = interfaceC25435a3;
                                        interfaceC25435a2.mo68214i(null);
                                        return objM60369h;
                                    }
                                }
                            } else {
                                accessToken = session3.getAuthToken().getAccessToken();
                                if (accessToken == null) {
                                    AuthMaterial authMaterial18 = authMaterial2;
                                    if (accessToken == null) {
                                    }
                                    if (str3 == null) {
                                        this.logger.mo85228t("No currentRefreshToken to refresh with. skipping auth material fetch", new AbstractC30556a.a[0]);
                                        C21451s c21451s16 = new C21451s(null, true, true, new InterfaceC21442j.a(null, true, AbstractC37056f.m118958J("no_refresh_token")), null);
                                        interfaceC25435a3.mo68214i(null);
                                        return c21451s16;
                                    }
                                    this.logger.mo85228t("Have not refreshed yet, refreshing token", new AbstractC30556a.a[0]);
                                    dVar.f82380w = null;
                                    dVar.f82381x = null;
                                    dVar.f82382y = interfaceC25435a3;
                                    dVar.f82383z = null;
                                    dVar.f82371E = null;
                                    dVar.f82372F = null;
                                    dVar.f82373G = null;
                                    dVar.f82374H = i14;
                                    dVar.f82375I = i15;
                                    dVar.f82379M = 5;
                                    objM60369h = m60369h(str3, accessToken, dVar);
                                    if (objM60369h != obj) {
                                        interfaceC25435a2 = interfaceC25435a3;
                                        interfaceC25435a2.mo68214i(null);
                                        return objM60369h;
                                    }
                                } else {
                                    AuthMaterial authMaterial19 = authMaterial2;
                                    if (accessToken == null) {
                                    }
                                    if (str3 == null) {
                                        this.logger.mo85228t("No currentRefreshToken to refresh with. skipping auth material fetch", new AbstractC30556a.a[0]);
                                        C21451s c21451s17 = new C21451s(null, true, true, new InterfaceC21442j.a(null, true, AbstractC37056f.m118958J("no_refresh_token")), null);
                                        interfaceC25435a3.mo68214i(null);
                                        return c21451s17;
                                    }
                                    this.logger.mo85228t("Have not refreshed yet, refreshing token", new AbstractC30556a.a[0]);
                                    dVar.f82380w = null;
                                    dVar.f82381x = null;
                                    dVar.f82382y = interfaceC25435a3;
                                    dVar.f82383z = null;
                                    dVar.f82371E = null;
                                    dVar.f82372F = null;
                                    dVar.f82373G = null;
                                    dVar.f82374H = i14;
                                    dVar.f82375I = i15;
                                    dVar.f82379M = 5;
                                    objM60369h = m60369h(str3, accessToken, dVar);
                                    if (objM60369h != obj) {
                                        interfaceC25435a2 = interfaceC25435a3;
                                        interfaceC25435a2.mo68214i(null);
                                        return objM60369h;
                                    }
                                }
                            }
                        }
                        return obj;
                    } catch (Throwable th5) {
                        th = th5;
                        interfaceC25435a2 = interfaceC25435a3;
                    }
                }
                interfaceC25435a2.mo68214i(null);
                throw th;
            }
            int i24 = dVar.f82374H;
            InterfaceC25435a interfaceC25435a8 = (InterfaceC25435a) dVar.f82382y;
            C34850x0 c34850x4 = (C34850x0) dVar.f82381x;
            session2 = (Session) dVar.f82380w;
            AbstractC34132o.m107864I(objM60369h);
            i13 = i24;
            interfaceC25435a = interfaceC25435a8;
            c34850x1 = c34850x4;
            C39352a c39352a = this.authManager;
            dVar.f82380w = session2;
            dVar.f82381x = c34850x1;
            dVar.f82382y = interfaceC25435a;
            dVar.f82374H = i13;
            dVar.f82375I = 0;
            dVar.f82379M = 2;
            Object objM125478a = c39352a.m125478a(dVar);
            if (objM125478a != obj) {
                i14 = i13;
                objM60369h = objM125478a;
                session3 = session2;
                c34850x2 = c34850x1;
                interfaceC25435a3 = interfaceC25435a;
                i15 = 0;
                authMaterial2 = (AuthMaterial) objM60369h;
                if (authMaterial2 != null) {
                    refreshToken = session3.getAuthToken().getRefreshToken();
                    if (refreshToken != null) {
                        interfaceC21030c = this.metricWriter;
                        c22047aMo60345b = InterfaceC21442j.c.f82308a.mo60345b();
                        dVar.f82380w = session3;
                        dVar.f82381x = c34850x2;
                        dVar.f82382y = interfaceC25435a3;
                        dVar.f82383z = authMaterial2;
                        dVar.f82371E = refreshToken;
                        dVar.f82372F = null;
                        dVar.f82374H = i14;
                        dVar.f82375I = i15;
                        dVar.f82376J = 0;
                        dVar.f82379M = 3;
                        if (interfaceC21030c.mo58700a(c22047aMo60345b, dVar) != obj) {
                            i16 = i14;
                            str = refreshToken;
                            interfaceC25435a4 = interfaceC25435a3;
                            authMaterial = authMaterial2;
                            authMaterial2 = authMaterial;
                            interfaceC25435a3 = interfaceC25435a4;
                            refreshToken = str;
                            i14 = i16;
                            str3 = refreshToken;
                            if (authMaterial2 != null) {
                                accessToken = session3.getAuthToken().getAccessToken();
                                if (accessToken == null) {
                                    AuthMaterial authMaterial110 = authMaterial2;
                                    if (accessToken == null) {
                                    }
                                    if (str3 == null) {
                                        this.logger.mo85228t("No currentRefreshToken to refresh with. skipping auth material fetch", new AbstractC30556a.a[0]);
                                        C21451s c21451s18 = new C21451s(null, true, true, new InterfaceC21442j.a(null, true, AbstractC37056f.m118958J("no_refresh_token")), null);
                                        interfaceC25435a3.mo68214i(null);
                                        return c21451s18;
                                    }
                                    this.logger.mo85228t("Have not refreshed yet, refreshing token", new AbstractC30556a.a[0]);
                                    dVar.f82380w = null;
                                    dVar.f82381x = null;
                                    dVar.f82382y = interfaceC25435a3;
                                    dVar.f82383z = null;
                                    dVar.f82371E = null;
                                    dVar.f82372F = null;
                                    dVar.f82373G = null;
                                    dVar.f82374H = i14;
                                    dVar.f82375I = i15;
                                    dVar.f82379M = 5;
                                    objM60369h = m60369h(str3, accessToken, dVar);
                                    if (objM60369h != obj) {
                                        interfaceC25435a2 = interfaceC25435a3;
                                        interfaceC25435a2.mo68214i(null);
                                        return objM60369h;
                                    }
                                } else {
                                    AuthMaterial authMaterial111 = authMaterial2;
                                    if (accessToken == null) {
                                    }
                                    if (str3 == null) {
                                        this.logger.mo85228t("No currentRefreshToken to refresh with. skipping auth material fetch", new AbstractC30556a.a[0]);
                                        C21451s c21451s19 = new C21451s(null, true, true, new InterfaceC21442j.a(null, true, AbstractC37056f.m118958J("no_refresh_token")), null);
                                        interfaceC25435a3.mo68214i(null);
                                        return c21451s19;
                                    }
                                    this.logger.mo85228t("Have not refreshed yet, refreshing token", new AbstractC30556a.a[0]);
                                    dVar.f82380w = null;
                                    dVar.f82381x = null;
                                    dVar.f82382y = interfaceC25435a3;
                                    dVar.f82383z = null;
                                    dVar.f82371E = null;
                                    dVar.f82372F = null;
                                    dVar.f82373G = null;
                                    dVar.f82374H = i14;
                                    dVar.f82375I = i15;
                                    dVar.f82379M = 5;
                                    objM60369h = m60369h(str3, accessToken, dVar);
                                    if (objM60369h != obj) {
                                        interfaceC25435a2 = interfaceC25435a3;
                                        interfaceC25435a2.mo68214i(null);
                                        return objM60369h;
                                    }
                                }
                            } else {
                                accessToken = session3.getAuthToken().getAccessToken();
                                if (accessToken == null) {
                                    AuthMaterial authMaterial112 = authMaterial2;
                                    if (accessToken == null) {
                                    }
                                    if (str3 == null) {
                                        this.logger.mo85228t("No currentRefreshToken to refresh with. skipping auth material fetch", new AbstractC30556a.a[0]);
                                        C21451s c21451s110 = new C21451s(null, true, true, new InterfaceC21442j.a(null, true, AbstractC37056f.m118958J("no_refresh_token")), null);
                                        interfaceC25435a3.mo68214i(null);
                                        return c21451s110;
                                    }
                                    this.logger.mo85228t("Have not refreshed yet, refreshing token", new AbstractC30556a.a[0]);
                                    dVar.f82380w = null;
                                    dVar.f82381x = null;
                                    dVar.f82382y = interfaceC25435a3;
                                    dVar.f82383z = null;
                                    dVar.f82371E = null;
                                    dVar.f82372F = null;
                                    dVar.f82373G = null;
                                    dVar.f82374H = i14;
                                    dVar.f82375I = i15;
                                    dVar.f82379M = 5;
                                    objM60369h = m60369h(str3, accessToken, dVar);
                                    if (objM60369h != obj) {
                                        interfaceC25435a2 = interfaceC25435a3;
                                        interfaceC25435a2.mo68214i(null);
                                        return objM60369h;
                                    }
                                } else {
                                    AuthMaterial authMaterial113 = authMaterial2;
                                    if (accessToken == null) {
                                    }
                                    if (str3 == null) {
                                        this.logger.mo85228t("No currentRefreshToken to refresh with. skipping auth material fetch", new AbstractC30556a.a[0]);
                                        C21451s c21451s111 = new C21451s(null, true, true, new InterfaceC21442j.a(null, true, AbstractC37056f.m118958J("no_refresh_token")), null);
                                        interfaceC25435a3.mo68214i(null);
                                        return c21451s111;
                                    }
                                    this.logger.mo85228t("Have not refreshed yet, refreshing token", new AbstractC30556a.a[0]);
                                    dVar.f82380w = null;
                                    dVar.f82381x = null;
                                    dVar.f82382y = interfaceC25435a3;
                                    dVar.f82383z = null;
                                    dVar.f82371E = null;
                                    dVar.f82372F = null;
                                    dVar.f82373G = null;
                                    dVar.f82374H = i14;
                                    dVar.f82375I = i15;
                                    dVar.f82379M = 5;
                                    objM60369h = m60369h(str3, accessToken, dVar);
                                    if (objM60369h != obj) {
                                        interfaceC25435a2 = interfaceC25435a3;
                                        interfaceC25435a2.mo68214i(null);
                                        return objM60369h;
                                    }
                                }
                            }
                        }
                    } else {
                        str3 = refreshToken;
                        if (authMaterial2 != null) {
                            accessToken = session3.getAuthToken().getAccessToken();
                            if (accessToken == null) {
                                AuthMaterial authMaterial114 = authMaterial2;
                                if (accessToken == null) {
                                }
                                if (str3 == null) {
                                    this.logger.mo85228t("No currentRefreshToken to refresh with. skipping auth material fetch", new AbstractC30556a.a[0]);
                                    C21451s c21451s112 = new C21451s(null, true, true, new InterfaceC21442j.a(null, true, AbstractC37056f.m118958J("no_refresh_token")), null);
                                    interfaceC25435a3.mo68214i(null);
                                    return c21451s112;
                                }
                                this.logger.mo85228t("Have not refreshed yet, refreshing token", new AbstractC30556a.a[0]);
                                dVar.f82380w = null;
                                dVar.f82381x = null;
                                dVar.f82382y = interfaceC25435a3;
                                dVar.f82383z = null;
                                dVar.f82371E = null;
                                dVar.f82372F = null;
                                dVar.f82373G = null;
                                dVar.f82374H = i14;
                                dVar.f82375I = i15;
                                dVar.f82379M = 5;
                                objM60369h = m60369h(str3, accessToken, dVar);
                                if (objM60369h != obj) {
                                    interfaceC25435a2 = interfaceC25435a3;
                                    interfaceC25435a2.mo68214i(null);
                                    return objM60369h;
                                }
                            } else {
                                AuthMaterial authMaterial115 = authMaterial2;
                                if (accessToken == null) {
                                }
                                if (str3 == null) {
                                    this.logger.mo85228t("No currentRefreshToken to refresh with. skipping auth material fetch", new AbstractC30556a.a[0]);
                                    C21451s c21451s113 = new C21451s(null, true, true, new InterfaceC21442j.a(null, true, AbstractC37056f.m118958J("no_refresh_token")), null);
                                    interfaceC25435a3.mo68214i(null);
                                    return c21451s113;
                                }
                                this.logger.mo85228t("Have not refreshed yet, refreshing token", new AbstractC30556a.a[0]);
                                dVar.f82380w = null;
                                dVar.f82381x = null;
                                dVar.f82382y = interfaceC25435a3;
                                dVar.f82383z = null;
                                dVar.f82371E = null;
                                dVar.f82372F = null;
                                dVar.f82373G = null;
                                dVar.f82374H = i14;
                                dVar.f82375I = i15;
                                dVar.f82379M = 5;
                                objM60369h = m60369h(str3, accessToken, dVar);
                                if (objM60369h != obj) {
                                    interfaceC25435a2 = interfaceC25435a3;
                                    interfaceC25435a2.mo68214i(null);
                                    return objM60369h;
                                }
                            }
                        } else {
                            accessToken = session3.getAuthToken().getAccessToken();
                            if (accessToken == null) {
                                AuthMaterial authMaterial116 = authMaterial2;
                                if (accessToken == null) {
                                }
                                if (str3 == null) {
                                    this.logger.mo85228t("No currentRefreshToken to refresh with. skipping auth material fetch", new AbstractC30556a.a[0]);
                                    C21451s c21451s114 = new C21451s(null, true, true, new InterfaceC21442j.a(null, true, AbstractC37056f.m118958J("no_refresh_token")), null);
                                    interfaceC25435a3.mo68214i(null);
                                    return c21451s114;
                                }
                                this.logger.mo85228t("Have not refreshed yet, refreshing token", new AbstractC30556a.a[0]);
                                dVar.f82380w = null;
                                dVar.f82381x = null;
                                dVar.f82382y = interfaceC25435a3;
                                dVar.f82383z = null;
                                dVar.f82371E = null;
                                dVar.f82372F = null;
                                dVar.f82373G = null;
                                dVar.f82374H = i14;
                                dVar.f82375I = i15;
                                dVar.f82379M = 5;
                                objM60369h = m60369h(str3, accessToken, dVar);
                                if (objM60369h != obj) {
                                    interfaceC25435a2 = interfaceC25435a3;
                                    interfaceC25435a2.mo68214i(null);
                                    return objM60369h;
                                }
                            } else {
                                AuthMaterial authMaterial117 = authMaterial2;
                                if (accessToken == null) {
                                }
                                if (str3 == null) {
                                    this.logger.mo85228t("No currentRefreshToken to refresh with. skipping auth material fetch", new AbstractC30556a.a[0]);
                                    C21451s c21451s115 = new C21451s(null, true, true, new InterfaceC21442j.a(null, true, AbstractC37056f.m118958J("no_refresh_token")), null);
                                    interfaceC25435a3.mo68214i(null);
                                    return c21451s115;
                                }
                                this.logger.mo85228t("Have not refreshed yet, refreshing token", new AbstractC30556a.a[0]);
                                dVar.f82380w = null;
                                dVar.f82381x = null;
                                dVar.f82382y = interfaceC25435a3;
                                dVar.f82383z = null;
                                dVar.f82371E = null;
                                dVar.f82372F = null;
                                dVar.f82373G = null;
                                dVar.f82374H = i14;
                                dVar.f82375I = i15;
                                dVar.f82379M = 5;
                                objM60369h = m60369h(str3, accessToken, dVar);
                                if (objM60369h != obj) {
                                    interfaceC25435a2 = interfaceC25435a3;
                                    interfaceC25435a2.mo68214i(null);
                                    return objM60369h;
                                }
                            }
                        }
                    }
                } else {
                    refreshToken = session3.getAuthToken().getRefreshToken();
                    if (refreshToken != null) {
                        interfaceC21030c = this.metricWriter;
                        c22047aMo60345b = InterfaceC21442j.c.f82308a.mo60345b();
                        dVar.f82380w = session3;
                        dVar.f82381x = c34850x2;
                        dVar.f82382y = interfaceC25435a3;
                        dVar.f82383z = authMaterial2;
                        dVar.f82371E = refreshToken;
                        dVar.f82372F = null;
                        dVar.f82374H = i14;
                        dVar.f82375I = i15;
                        dVar.f82376J = 0;
                        dVar.f82379M = 3;
                        if (interfaceC21030c.mo58700a(c22047aMo60345b, dVar) != obj) {
                            i16 = i14;
                            str = refreshToken;
                            interfaceC25435a4 = interfaceC25435a3;
                            authMaterial = authMaterial2;
                            authMaterial2 = authMaterial;
                            interfaceC25435a3 = interfaceC25435a4;
                            refreshToken = str;
                            i14 = i16;
                            str3 = refreshToken;
                            if (authMaterial2 != null) {
                                accessToken = session3.getAuthToken().getAccessToken();
                                if (accessToken == null) {
                                    AuthMaterial authMaterial118 = authMaterial2;
                                    if (accessToken == null) {
                                    }
                                    if (str3 == null) {
                                        this.logger.mo85228t("No currentRefreshToken to refresh with. skipping auth material fetch", new AbstractC30556a.a[0]);
                                        C21451s c21451s116 = new C21451s(null, true, true, new InterfaceC21442j.a(null, true, AbstractC37056f.m118958J("no_refresh_token")), null);
                                        interfaceC25435a3.mo68214i(null);
                                        return c21451s116;
                                    }
                                    this.logger.mo85228t("Have not refreshed yet, refreshing token", new AbstractC30556a.a[0]);
                                    dVar.f82380w = null;
                                    dVar.f82381x = null;
                                    dVar.f82382y = interfaceC25435a3;
                                    dVar.f82383z = null;
                                    dVar.f82371E = null;
                                    dVar.f82372F = null;
                                    dVar.f82373G = null;
                                    dVar.f82374H = i14;
                                    dVar.f82375I = i15;
                                    dVar.f82379M = 5;
                                    objM60369h = m60369h(str3, accessToken, dVar);
                                    if (objM60369h != obj) {
                                        interfaceC25435a2 = interfaceC25435a3;
                                        interfaceC25435a2.mo68214i(null);
                                        return objM60369h;
                                    }
                                } else {
                                    AuthMaterial authMaterial119 = authMaterial2;
                                    if (accessToken == null) {
                                    }
                                    if (str3 == null) {
                                        this.logger.mo85228t("No currentRefreshToken to refresh with. skipping auth material fetch", new AbstractC30556a.a[0]);
                                        C21451s c21451s117 = new C21451s(null, true, true, new InterfaceC21442j.a(null, true, AbstractC37056f.m118958J("no_refresh_token")), null);
                                        interfaceC25435a3.mo68214i(null);
                                        return c21451s117;
                                    }
                                    this.logger.mo85228t("Have not refreshed yet, refreshing token", new AbstractC30556a.a[0]);
                                    dVar.f82380w = null;
                                    dVar.f82381x = null;
                                    dVar.f82382y = interfaceC25435a3;
                                    dVar.f82383z = null;
                                    dVar.f82371E = null;
                                    dVar.f82372F = null;
                                    dVar.f82373G = null;
                                    dVar.f82374H = i14;
                                    dVar.f82375I = i15;
                                    dVar.f82379M = 5;
                                    objM60369h = m60369h(str3, accessToken, dVar);
                                    if (objM60369h != obj) {
                                        interfaceC25435a2 = interfaceC25435a3;
                                        interfaceC25435a2.mo68214i(null);
                                        return objM60369h;
                                    }
                                }
                            } else {
                                accessToken = session3.getAuthToken().getAccessToken();
                                if (accessToken == null) {
                                    AuthMaterial authMaterial1110 = authMaterial2;
                                    if (accessToken == null) {
                                    }
                                    if (str3 == null) {
                                        this.logger.mo85228t("No currentRefreshToken to refresh with. skipping auth material fetch", new AbstractC30556a.a[0]);
                                        C21451s c21451s118 = new C21451s(null, true, true, new InterfaceC21442j.a(null, true, AbstractC37056f.m118958J("no_refresh_token")), null);
                                        interfaceC25435a3.mo68214i(null);
                                        return c21451s118;
                                    }
                                    this.logger.mo85228t("Have not refreshed yet, refreshing token", new AbstractC30556a.a[0]);
                                    dVar.f82380w = null;
                                    dVar.f82381x = null;
                                    dVar.f82382y = interfaceC25435a3;
                                    dVar.f82383z = null;
                                    dVar.f82371E = null;
                                    dVar.f82372F = null;
                                    dVar.f82373G = null;
                                    dVar.f82374H = i14;
                                    dVar.f82375I = i15;
                                    dVar.f82379M = 5;
                                    objM60369h = m60369h(str3, accessToken, dVar);
                                    if (objM60369h != obj) {
                                        interfaceC25435a2 = interfaceC25435a3;
                                        interfaceC25435a2.mo68214i(null);
                                        return objM60369h;
                                    }
                                } else {
                                    AuthMaterial authMaterial1111 = authMaterial2;
                                    if (accessToken == null) {
                                    }
                                    if (str3 == null) {
                                        this.logger.mo85228t("No currentRefreshToken to refresh with. skipping auth material fetch", new AbstractC30556a.a[0]);
                                        C21451s c21451s119 = new C21451s(null, true, true, new InterfaceC21442j.a(null, true, AbstractC37056f.m118958J("no_refresh_token")), null);
                                        interfaceC25435a3.mo68214i(null);
                                        return c21451s119;
                                    }
                                    this.logger.mo85228t("Have not refreshed yet, refreshing token", new AbstractC30556a.a[0]);
                                    dVar.f82380w = null;
                                    dVar.f82381x = null;
                                    dVar.f82382y = interfaceC25435a3;
                                    dVar.f82383z = null;
                                    dVar.f82371E = null;
                                    dVar.f82372F = null;
                                    dVar.f82373G = null;
                                    dVar.f82374H = i14;
                                    dVar.f82375I = i15;
                                    dVar.f82379M = 5;
                                    objM60369h = m60369h(str3, accessToken, dVar);
                                    if (objM60369h != obj) {
                                        interfaceC25435a2 = interfaceC25435a3;
                                        interfaceC25435a2.mo68214i(null);
                                        return objM60369h;
                                    }
                                }
                            }
                        }
                    } else {
                        str3 = refreshToken;
                        if (authMaterial2 != null) {
                            accessToken = session3.getAuthToken().getAccessToken();
                            if (accessToken == null) {
                                AuthMaterial authMaterial1112 = authMaterial2;
                                if (accessToken == null) {
                                }
                                if (str3 == null) {
                                    this.logger.mo85228t("No currentRefreshToken to refresh with. skipping auth material fetch", new AbstractC30556a.a[0]);
                                    C21451s c21451s1110 = new C21451s(null, true, true, new InterfaceC21442j.a(null, true, AbstractC37056f.m118958J("no_refresh_token")), null);
                                    interfaceC25435a3.mo68214i(null);
                                    return c21451s1110;
                                }
                                this.logger.mo85228t("Have not refreshed yet, refreshing token", new AbstractC30556a.a[0]);
                                dVar.f82380w = null;
                                dVar.f82381x = null;
                                dVar.f82382y = interfaceC25435a3;
                                dVar.f82383z = null;
                                dVar.f82371E = null;
                                dVar.f82372F = null;
                                dVar.f82373G = null;
                                dVar.f82374H = i14;
                                dVar.f82375I = i15;
                                dVar.f82379M = 5;
                                objM60369h = m60369h(str3, accessToken, dVar);
                                if (objM60369h != obj) {
                                    interfaceC25435a2 = interfaceC25435a3;
                                    interfaceC25435a2.mo68214i(null);
                                    return objM60369h;
                                }
                            } else {
                                AuthMaterial authMaterial1113 = authMaterial2;
                                if (accessToken == null) {
                                }
                                if (str3 == null) {
                                    this.logger.mo85228t("No currentRefreshToken to refresh with. skipping auth material fetch", new AbstractC30556a.a[0]);
                                    C21451s c21451s1111 = new C21451s(null, true, true, new InterfaceC21442j.a(null, true, AbstractC37056f.m118958J("no_refresh_token")), null);
                                    interfaceC25435a3.mo68214i(null);
                                    return c21451s1111;
                                }
                                this.logger.mo85228t("Have not refreshed yet, refreshing token", new AbstractC30556a.a[0]);
                                dVar.f82380w = null;
                                dVar.f82381x = null;
                                dVar.f82382y = interfaceC25435a3;
                                dVar.f82383z = null;
                                dVar.f82371E = null;
                                dVar.f82372F = null;
                                dVar.f82373G = null;
                                dVar.f82374H = i14;
                                dVar.f82375I = i15;
                                dVar.f82379M = 5;
                                objM60369h = m60369h(str3, accessToken, dVar);
                                if (objM60369h != obj) {
                                    interfaceC25435a2 = interfaceC25435a3;
                                    interfaceC25435a2.mo68214i(null);
                                    return objM60369h;
                                }
                            }
                        } else {
                            accessToken = session3.getAuthToken().getAccessToken();
                            if (accessToken == null) {
                                AuthMaterial authMaterial1114 = authMaterial2;
                                if (accessToken == null) {
                                }
                                if (str3 == null) {
                                    this.logger.mo85228t("No currentRefreshToken to refresh with. skipping auth material fetch", new AbstractC30556a.a[0]);
                                    C21451s c21451s1112 = new C21451s(null, true, true, new InterfaceC21442j.a(null, true, AbstractC37056f.m118958J("no_refresh_token")), null);
                                    interfaceC25435a3.mo68214i(null);
                                    return c21451s1112;
                                }
                                this.logger.mo85228t("Have not refreshed yet, refreshing token", new AbstractC30556a.a[0]);
                                dVar.f82380w = null;
                                dVar.f82381x = null;
                                dVar.f82382y = interfaceC25435a3;
                                dVar.f82383z = null;
                                dVar.f82371E = null;
                                dVar.f82372F = null;
                                dVar.f82373G = null;
                                dVar.f82374H = i14;
                                dVar.f82375I = i15;
                                dVar.f82379M = 5;
                                objM60369h = m60369h(str3, accessToken, dVar);
                                if (objM60369h != obj) {
                                    interfaceC25435a2 = interfaceC25435a3;
                                    interfaceC25435a2.mo68214i(null);
                                    return objM60369h;
                                }
                            } else {
                                AuthMaterial authMaterial1115 = authMaterial2;
                                if (accessToken == null) {
                                }
                                if (str3 == null) {
                                    this.logger.mo85228t("No currentRefreshToken to refresh with. skipping auth material fetch", new AbstractC30556a.a[0]);
                                    C21451s c21451s1113 = new C21451s(null, true, true, new InterfaceC21442j.a(null, true, AbstractC37056f.m118958J("no_refresh_token")), null);
                                    interfaceC25435a3.mo68214i(null);
                                    return c21451s1113;
                                }
                                this.logger.mo85228t("Have not refreshed yet, refreshing token", new AbstractC30556a.a[0]);
                                dVar.f82380w = null;
                                dVar.f82381x = null;
                                dVar.f82382y = interfaceC25435a3;
                                dVar.f82383z = null;
                                dVar.f82371E = null;
                                dVar.f82372F = null;
                                dVar.f82373G = null;
                                dVar.f82374H = i14;
                                dVar.f82375I = i15;
                                dVar.f82379M = 5;
                                objM60369h = m60369h(str3, accessToken, dVar);
                                if (objM60369h != obj) {
                                    interfaceC25435a2 = interfaceC25435a3;
                                    interfaceC25435a2.mo68214i(null);
                                    return objM60369h;
                                }
                            }
                        }
                    }
                }
            }
            return obj;
        } catch (Throwable th6) {
            th = th6;
            interfaceC25435a2 = interfaceC25435a;
        }
    }

    /* JADX INFO: renamed from: k */
    private final boolean m60371k(C34850x0 response, String accessToken) {
        return !AbstractC22676k.m65745e(this.accessTokenExtractor.m60321b(response.f146789w), accessToken);
    }

    /* JADX INFO: renamed from: l */
    private final boolean m60372l(String accessToken) {
        if (accessToken == null || accessToken.length() == 0) {
            this.logger.mo85222m("Access token is null or empty, cannot determine if it is a Cognito token", new AbstractC30556a.a[0]);
            return false;
        }
        int i13 = 0;
        for (int i14 = 0; i14 < accessToken.length(); i14++) {
            if (accessToken.charAt(i14) == '.') {
                i13++;
            }
        }
        return i13 == 2;
    }

    /* JADX INFO: renamed from: m */
    private final Object m60373m(InterfaceC21442j interfaceC21442j, AbstractC28153d abstractC28153d, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        Object objMo58700a;
        if (abstractC28153d != null) {
            this.authAnalyticHelper.m85206c(abstractC28153d);
        }
        return (interfaceC21442j == null || (objMo58700a = this.metricWriter.mo58700a(interfaceC21442j.mo60345b(), interfaceC30057d)) != EnumC31071a.f128113w) ? C23454a0.f92919a : objMo58700a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x008e, code lost:
    
        if (r8.m125480c(r7, r0) == r1) goto L29;
     */
    /* JADX INFO: renamed from: n */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m60374n(com.whoop.domain.model.AuthMaterial r7, q83.InterfaceC30057d<? super l83.C23454a0> r8) {
        /*
            r6 = this;
            boolean r0 = r8 instanceof j92.C21448p.f
            if (r0 == 0) goto L13
            r0 = r8
            j92.p$f r0 = (j92.C21448p.f) r0
            int r1 = r0.f82390E
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f82390E = r1
            goto L18
        L13:
            j92.p$f r0 = new j92.p$f
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f82393y
            r83.a r1 = r83.EnumC31071a.f128113w
            int r2 = r0.f82390E
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L42
            if (r2 == r4) goto L3a
            if (r2 != r3) goto L32
            java.lang.Object r7 = r0.f82392x
            com.whoop.domain.model.User r7 = (com.whoop.domain.model.User) r7
            java.lang.Object r7 = r0.f82391w
            com.whoop.domain.model.AuthMaterial r7 = (com.whoop.domain.model.AuthMaterial) r7
            p505ts.AbstractC34132o.m107864I(r8)
            goto L91
        L32:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L3a:
            java.lang.Object r7 = r0.f82391w
            com.whoop.domain.model.AuthMaterial r7 = (com.whoop.domain.model.AuthMaterial) r7
            p505ts.AbstractC34132o.m107864I(r8)
            goto L52
        L42:
            p505ts.AbstractC34132o.m107864I(r8)
            y92.a r8 = r6.authManager
            r0.f82391w = r7
            r0.f82390E = r4
            java.lang.Object r8 = r8.m125479b(r0)
            if (r8 != r1) goto L52
            goto L90
        L52:
            com.whoop.domain.model.User r8 = (com.whoop.domain.model.User) r8
            if (r8 == 0) goto L65
            od1.u r2 = r6.userContext
            com.whoop.domain.model.Session r4 = new com.whoop.domain.model.Session
            com.whoop.domain.model.AuthToken r5 = r7.toAuthToken()
            r4.<init>(r5, r8)
            r2.m84064s(r4)
            goto L81
        L65:
            od1.u r8 = r6.userContext
            com.whoop.domain.model.Session r8 = r8.m84057h()
            if (r8 == 0) goto L81
            com.whoop.domain.model.User r8 = r8.getUser()
            if (r8 == 0) goto L81
            od1.u r2 = r6.userContext
            com.whoop.domain.model.Session r4 = new com.whoop.domain.model.Session
            com.whoop.domain.model.AuthToken r5 = r7.toAuthToken()
            r4.<init>(r5, r8)
            r2.m84064s(r4)
        L81:
            y92.a r8 = r6.authManager
            r2 = 0
            r0.f82391w = r2
            r0.f82392x = r2
            r0.f82390E = r3
            java.lang.Object r7 = r8.m125480c(r7, r0)
            if (r7 != r1) goto L91
        L90:
            return r1
        L91:
            l83.a0 r7 = l83.C23454a0.f92919a
            return r7
        */
        throw new UnsupportedOperationException("Method not decompiled: j92.C21448p.m60374n(com.whoop.domain.model.AuthMaterial, q83.d):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: j */
    public final Object m60375j(Session session, C34850x0 c34850x0, InterfaceC30057d<? super C21451s> interfaceC30057d) {
        e eVar;
        if (interfaceC30057d instanceof e) {
            eVar = (e) interfaceC30057d;
            int i13 = eVar.f82385F;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                eVar.f82385F = i13 - Integer.MIN_VALUE;
            } else {
                eVar = new e(interfaceC30057d);
            }
        } else {
            eVar = new e(interfaceC30057d);
        }
        Object objM60370i = eVar.f82389z;
        Object obj = EnumC31071a.f128113w;
        int i14 = eVar.f82385F;
        if (i14 == 0) {
            AbstractC34132o.m107864I(objM60370i);
            eVar.f82386w = null;
            eVar.f82387x = null;
            eVar.f82385F = 1;
            objM60370i = m60370i(session, c34850x0, eVar);
            if (objM60370i != obj) {
            }
        }
        if (i14 != 1) {
            if (i14 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C21451s c21451s = (C21451s) eVar.f82388y;
            AbstractC34132o.m107864I(objM60370i);
            return c21451s;
        }
        AbstractC34132o.m107864I(objM60370i);
        C21451s c21451s2 = (C21451s) objM60370i;
        InterfaceC21442j metric = c21451s2.getMetric();
        AbstractC28153d analyticEvent = c21451s2.getAnalyticEvent();
        eVar.f82386w = null;
        eVar.f82387x = null;
        eVar.f82388y = c21451s2;
        eVar.f82385F = 2;
        return m60373m(metric, analyticEvent, eVar) == obj ? obj : c21451s2;
    }

    public /* synthetic */ C21448p(AuthServiceApiV2 authServiceApiV2, C12066b c12066b, C39352a c39352a, C21433a c21433a, C27858u c27858u, InterfaceC21030c interfaceC21030c, C28156e c28156e, InterfaceC25435a interfaceC25435a, InterfaceC34116n interfaceC34116n, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(authServiceApiV2, c12066b, c39352a, (i13 & 8) != 0 ? new C21433a() : c21433a, c27858u, interfaceC21030c, c28156e, interfaceC25435a, (i13 & 256) != 0 ? InterfaceC34116n.INSTANCE.m107848a("RefreshInterceptorLock") : interfaceC34116n);
    }
}
