package od1;

import com.whoop.domain.converters.MfaChallengeException;
import com.whoop.domain.converters.PasswordAttemptsExceededException;
import com.whoop.service.network.AuthServiceApiV2;
import com.whoop.service.network.model.ForgotPasswordRequest;
import com.whoop.whoopaction.domain.models.ActionErrorCode;
import dj0.C12066b;
import dj0.C12071g;
import dj0.C12086v;
import dj0.InterfaceC12070f;
import dj0.InterfaceC12072h;
import fj0.C14527a;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.io.IOException;
import l83.C23454a0;
import p088dc.AbstractC11895b;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import pg3.C29218v0;
import q83.InterfaceC30057d;
import qr2.AbstractC30556a;
import qw2.InterfaceC30696d;
import qw2.InterfaceC30697e;
import r83.EnumC31071a;
import retrofit2.HttpException;
import s83.AbstractC32269c;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import tr2.InterfaceC34116n;
import u02.InterfaceC34385a;
import y92.C39352a;

/* JADX INFO: renamed from: od1.z */
/* JADX INFO: loaded from: classes8.dex */
@Metadata(m65680d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\b\u0007\u0018\u0000 32\u00020\u0001:\u0001+B9\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0018\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0010H\u0082@¢\u0006\u0004\b\u0013\u0010\u0014J#\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0016\u001a\u00020\u00152\n\u0010\u0019\u001a\u00060\u0017j\u0002`\u0018H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010 \u001a\u00020\u001f2\u0006\u0010\u001e\u001a\u00020\u001dH\u0002¢\u0006\u0004\b \u0010!J \u0010$\u001a\u00020\u00122\u0006\u0010\"\u001a\u00020\u00152\u0006\u0010#\u001a\u00020\u0015H\u0096@¢\u0006\u0004\b$\u0010%J\u0018\u0010'\u001a\u00020\u00122\u0006\u0010&\u001a\u00020\u0015H\u0096@¢\u0006\u0004\b'\u0010(J\u0010\u0010\u0019\u001a\u00020\u0012H\u0096@¢\u0006\u0004\b\u0019\u0010)J\u0018\u0010*\u001a\u00020\u00122\u0006\u0010\"\u001a\u00020\u0015H\u0096@¢\u0006\u0004\b*\u0010(J\u0010\u0010+\u001a\u00020\u0012H\u0096@¢\u0006\u0004\b+\u0010)R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010-R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010.R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010/R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u00100R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102¨\u00064"}, m65681d2 = {"Lod1/z;", "Lqw2/d;", "Lod1/a0;", "userSessionManager", "Ldj0/b;", "cognitoAuthApi", "Ldj0/v;", "mfaChallengeRepository", "Ly92/a;", "authManager", "Lcom/whoop/service/network/AuthServiceApiV2;", "authServiceApiV2", "Ltr2/n;", "logger", "<init>", "(Lod1/a0;Ldj0/b;Ldj0/v;Ly92/a;Lcom/whoop/service/network/AuthServiceApiV2;Ltr2/n;)V", "Ldj0/h$b;", "result", "Lqw2/e;", "i", "(Ldj0/h$b;Lq83/d;)Ljava/lang/Object;", "", "operation", "Ljava/lang/Exception;", "Lkotlin/Exception;", "e", "Lqw2/e$a;", "j", "(Ljava/lang/String;Ljava/lang/Exception;)Lqw2/e$a;", "", "statusCode", "Lcom/whoop/whoopaction/domain/models/ActionErrorCode;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "(I)Lcom/whoop/whoopaction/domain/models/ActionErrorCode;", "username", "password", "c", "(Ljava/lang/String;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;", "code", "d", "(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;", "(Lq83/d;)Ljava/lang/Object;", "b", "a", "Lod1/a0;", "Ldj0/b;", "Ldj0/v;", "Ly92/a;", "Lcom/whoop/service/network/AuthServiceApiV2;", "f", "Ltr2/n;", "g", "app_prodStandardRelease"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C27863z implements InterfaceC30696d {

    /* JADX INFO: renamed from: g */
    private static final a f112269g = new a(null);

    /* JADX INFO: renamed from: h */
    public static final int f112270h = 8;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final InterfaceC27837a0 userSessionManager;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final C12066b cognitoAuthApi;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final C12086v mfaChallengeRepository;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final C39352a authManager;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final AuthServiceApiV2 authServiceApiV2;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final InterfaceC34116n logger;

    /* JADX INFO: renamed from: od1.z$a */
    @Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"Lod1/z$a;", "", "<init>", "()V", "", "HTTP_TOO_MANY_REQUESTS", "I", "app_prodStandardRelease"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    /* JADX INFO: renamed from: od1.z$b */
    @InterfaceC32271e(m100429c = "com.whoop.domain.UserSessionAuthActionBridge", m100430f = "UserSessionAuthActionBridge.kt", m100431l = {51, 57}, m100432m = "completeMfa", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b extends AbstractC32269c {

        /* JADX INFO: renamed from: E */
        int f112277E;

        /* JADX INFO: renamed from: w */
        Object f112278w;

        /* JADX INFO: renamed from: x */
        Object f112279x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f112280y;

        public b(InterfaceC30057d<? super b> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f112280y = obj;
            this.f112277E |= Integer.MIN_VALUE;
            return C27863z.this.mo84110d(null, this);
        }
    }

    /* JADX INFO: renamed from: od1.z$c */
    @InterfaceC32271e(m100429c = "com.whoop.domain.UserSessionAuthActionBridge", m100430f = "UserSessionAuthActionBridge.kt", m100431l = {71}, m100432m = "finishMfaSignIn", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c extends AbstractC32269c {

        /* JADX INFO: renamed from: w */
        Object f112282w;

        /* JADX INFO: renamed from: x */
        /* synthetic */ Object f112283x;

        /* JADX INFO: renamed from: z */
        int f112285z;

        public c(InterfaceC30057d<? super c> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f112283x = obj;
            this.f112285z |= Integer.MIN_VALUE;
            return C27863z.this.m84105i(null, this);
        }
    }

    /* JADX INFO: renamed from: od1.z$d */
    @InterfaceC32271e(m100429c = "com.whoop.domain.UserSessionAuthActionBridge", m100430f = "UserSessionAuthActionBridge.kt", m100431l = {95}, m100432m = "forgotPassword", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class d extends AbstractC32269c {

        /* JADX INFO: renamed from: w */
        Object f112286w;

        /* JADX INFO: renamed from: x */
        /* synthetic */ Object f112287x;

        /* JADX INFO: renamed from: z */
        int f112289z;

        public d(InterfaceC30057d<? super d> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f112287x = obj;
            this.f112289z |= Integer.MIN_VALUE;
            return C27863z.this.mo84108b(null, this);
        }
    }

    /* JADX INFO: renamed from: od1.z$e */
    @InterfaceC32271e(m100429c = "com.whoop.domain.UserSessionAuthActionBridge$forgotPassword$result$1", m100430f = "UserSessionAuthActionBridge.kt", m100431l = {96}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lpg3/v0;", "Ll83/a0;", "<anonymous>", "()Lpg3/v0;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class e extends AbstractC32275i implements Function1 {

        /* JADX INFO: renamed from: w */
        int f112290w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ String f112292y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(String str, InterfaceC30057d<? super e> interfaceC30057d) {
            super(1, interfaceC30057d);
            this.f112292y = str;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(InterfaceC30057d<?> interfaceC30057d) {
            return C27863z.this.new e(this.f112292y, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f112290w;
            if (i13 != 0) {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
                return obj;
            }
            AbstractC34132o.m107864I(obj);
            AuthServiceApiV2 authServiceApiV2 = C27863z.this.authServiceApiV2;
            ForgotPasswordRequest forgotPasswordRequest = new ForgotPasswordRequest(this.f112292y);
            this.f112290w = 1;
            Object objForgotPassword = authServiceApiV2.forgotPassword(forgotPasswordRequest, false, this);
            return objForgotPassword == enumC31071a ? enumC31071a : objForgotPassword;
        }

        @Override // p715kotlin.jvm.functions.Function1
        public final Object invoke(InterfaceC30057d<? super C29218v0<C23454a0>> interfaceC30057d) {
            return ((e) create(interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }
    }

    /* JADX INFO: renamed from: od1.z$f */
    @InterfaceC32271e(m100429c = "com.whoop.domain.UserSessionAuthActionBridge", m100430f = "UserSessionAuthActionBridge.kt", m100431l = {84, 85}, m100432m = "resendMfa", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class f extends AbstractC32269c {

        /* JADX INFO: renamed from: w */
        Object f112293w;

        /* JADX INFO: renamed from: x */
        /* synthetic */ Object f112294x;

        /* JADX INFO: renamed from: z */
        int f112296z;

        public f(InterfaceC30057d<? super f> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f112294x = obj;
            this.f112296z |= Integer.MIN_VALUE;
            return C27863z.this.mo84111e(this);
        }
    }

    /* JADX INFO: renamed from: od1.z$g */
    @InterfaceC32271e(m100429c = "com.whoop.domain.UserSessionAuthActionBridge", m100430f = "UserSessionAuthActionBridge.kt", m100431l = {32}, m100432m = "signIn", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class g extends AbstractC32269c {

        /* JADX INFO: renamed from: E */
        int f112297E;

        /* JADX INFO: renamed from: w */
        Object f112298w;

        /* JADX INFO: renamed from: x */
        Object f112299x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f112300y;

        public g(InterfaceC30057d<? super g> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f112300y = obj;
            this.f112297E |= Integer.MIN_VALUE;
            return C27863z.this.mo84109c(null, null, this);
        }
    }

    public C27863z(InterfaceC27837a0 userSessionManager, C12066b cognitoAuthApi, C12086v mfaChallengeRepository, C39352a authManager, AuthServiceApiV2 authServiceApiV2, InterfaceC34116n logger) {
        AbstractC22676k.m65750j(userSessionManager, "userSessionManager");
        AbstractC22676k.m65750j(cognitoAuthApi, "cognitoAuthApi");
        AbstractC22676k.m65750j(mfaChallengeRepository, "mfaChallengeRepository");
        AbstractC22676k.m65750j(authManager, "authManager");
        AbstractC22676k.m65750j(authServiceApiV2, "authServiceApiV2");
        AbstractC22676k.m65750j(logger, "logger");
        this.userSessionManager = userSessionManager;
        this.cognitoAuthApi = cognitoAuthApi;
        this.mfaChallengeRepository = mfaChallengeRepository;
        this.authManager = authManager;
        this.authServiceApiV2 = authServiceApiV2;
        this.logger = logger;
    }

    /* JADX INFO: renamed from: h */
    private final ActionErrorCode m84104h(int statusCode) {
        if (statusCode != 401) {
            return statusCode != 429 ? ActionErrorCode.UNKNOWN : ActionErrorCode.RATE_LIMITED;
        }
        return ActionErrorCode.INVALID_CREDENTIALS;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: i */
    public final Object m84105i(InterfaceC12072h.b bVar, InterfaceC30057d<? super InterfaceC30697e> interfaceC30057d) {
        c cVar;
        if (interfaceC30057d instanceof c) {
            cVar = (c) interfaceC30057d;
            int i13 = cVar.f112285z;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                cVar.f112285z = i13 - Integer.MIN_VALUE;
            } else {
                cVar = new c(interfaceC30057d);
            }
        } else {
            cVar = new c(interfaceC30057d);
        }
        Object obj = cVar.f112283x;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = cVar.f112285z;
        try {
            if (i14 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC27837a0 interfaceC27837a0 = this.userSessionManager;
                C14527a material = bVar.getMaterial();
                cVar.f112282w = null;
                cVar.f112285z = 1;
                if (interfaceC27837a0.mo83916f(material, cVar) == enumC31071a) {
                    return enumC31071a;
                }
            } else {
                if (i14 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
            }
            this.mfaChallengeRepository.m33347b();
            return InterfaceC30697e.b.f126414a;
        } catch (IOException e5) {
            return m84106j("post-MFA login", e5);
        } catch (IllegalStateException e13) {
            return m84106j("post-MFA login", e13);
        } catch (HttpException e14) {
            return m84106j("post-MFA login", e14);
        }
    }

    /* JADX INFO: renamed from: j */
    private final InterfaceC30697e.a m84106j(String operation, Exception e5) {
        this.logger.mo85230v(AbstractC11895b.m31996o("AuthAction ", operation, " failed"), e5, new AbstractC30556a.a[0]);
        if (e5 instanceof HttpException) {
            HttpException httpException = (HttpException) e5;
            return new InterfaceC30697e.a(m84104h(httpException.f128920w), httpException.f128921x);
        }
        if (e5 instanceof IOException) {
            ActionErrorCode actionErrorCode = ActionErrorCode.NETWORK;
            String message = e5.getMessage();
            if (message == null) {
                message = "Network error";
            }
            return new InterfaceC30697e.a(actionErrorCode, message);
        }
        ActionErrorCode actionErrorCode2 = ActionErrorCode.UNKNOWN;
        String message2 = e5.getMessage();
        if (message2 == null) {
            message2 = "Session bootstrap failed";
        }
        return new InterfaceC30697e.a(actionErrorCode2, message2);
    }

    @Override // qw2.InterfaceC30696d
    /* JADX INFO: renamed from: a */
    public Object mo84107a(InterfaceC30057d<? super InterfaceC30697e> interfaceC30057d) {
        this.userSessionManager.mo83911a();
        return InterfaceC30697e.b.f126414a;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    @Override // qw2.InterfaceC30696d
    /* JADX INFO: renamed from: b */
    public Object mo84108b(String str, InterfaceC30057d<? super InterfaceC30697e> interfaceC30057d) {
        d dVar;
        if (interfaceC30057d instanceof d) {
            dVar = (d) interfaceC30057d;
            int i13 = dVar.f112289z;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                dVar.f112289z = i13 - Integer.MIN_VALUE;
            } else {
                dVar = new d(interfaceC30057d);
            }
        } else {
            dVar = new d(interfaceC30057d);
        }
        d dVar2 = dVar;
        Object objM108729b = dVar2.f112287x;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = dVar2.f112289z;
        if (i14 == 0) {
            AbstractC34132o.m107864I(objM108729b);
            InterfaceC34385a.Companion companion = InterfaceC34385a.INSTANCE;
            InterfaceC34116n interfaceC34116n = this.logger;
            e eVar = new e(str, null);
            dVar2.f112286w = null;
            dVar2.f112289z = 1;
            objM108729b = InterfaceC34385a.Companion.m108729b(companion, interfaceC34116n, null, "AuthAction forgot-password: ", eVar, dVar2, 2, null);
            if (objM108729b == enumC31071a) {
                return enumC31071a;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(objM108729b);
        }
        InterfaceC34385a interfaceC34385a = (InterfaceC34385a) objM108729b;
        if (interfaceC34385a instanceof InterfaceC34385a.c) {
            return InterfaceC30697e.b.f126414a;
        }
        if (interfaceC34385a instanceof InterfaceC34385a.b.C42432b) {
            return new InterfaceC30697e.a(ActionErrorCode.NETWORK, ((InterfaceC34385a.b.C42432b) interfaceC34385a).getErrorMessage());
        }
        if (!(interfaceC34385a instanceof InterfaceC34385a.b.a)) {
            throw new NoWhenBranchMatchedException();
        }
        InterfaceC34385a.b.a aVar = (InterfaceC34385a.b.a) interfaceC34385a;
        return new InterfaceC30697e.a(m84104h(aVar.getErrorCode()), aVar.getErrorMessage());
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // qw2.InterfaceC30696d
    /* JADX INFO: renamed from: c */
    public Object mo84109c(String str, String str2, InterfaceC30057d<? super InterfaceC30697e> interfaceC30057d) {
        g gVar;
        if (interfaceC30057d instanceof g) {
            gVar = (g) interfaceC30057d;
            int i13 = gVar.f112297E;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                gVar.f112297E = i13 - Integer.MIN_VALUE;
            } else {
                gVar = new g(interfaceC30057d);
            }
        } else {
            gVar = new g(interfaceC30057d);
        }
        Object obj = gVar.f112300y;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = gVar.f112297E;
        try {
            if (i14 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC27837a0 interfaceC27837a0 = this.userSessionManager;
                gVar.f112298w = null;
                gVar.f112299x = null;
                gVar.f112297E = 1;
                if (interfaceC27837a0.mo83913c(str, str2, null, gVar) == enumC31071a) {
                    return enumC31071a;
                }
            } else {
                if (i14 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
            }
            return InterfaceC30697e.b.f126414a;
        } catch (MfaChallengeException unused) {
            this.logger.mo85228t("AuthAction sign-in requires MFA challenge", new AbstractC30556a.a[0]);
            return new InterfaceC30697e.a(ActionErrorCode.MFA_REQUIRED, "MFA challenge required");
        } catch (PasswordAttemptsExceededException unused2) {
            this.logger.mo85226q("AuthAction sign-in password attempts exceeded", new AbstractC30556a.a[0]);
            return new InterfaceC30697e.a(ActionErrorCode.RATE_LIMITED, "Password attempts exceeded");
        } catch (IOException e5) {
            return m84106j("sign-in", e5);
        } catch (IllegalStateException e13) {
            return m84106j("sign-in", e13);
        } catch (HttpException e14) {
            return m84106j("sign-in", e14);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    @Override // qw2.InterfaceC30696d
    /* JADX INFO: renamed from: d */
    public Object mo84110d(String str, InterfaceC30057d<? super InterfaceC30697e> interfaceC30057d) {
        b bVar;
        if (interfaceC30057d instanceof b) {
            bVar = (b) interfaceC30057d;
            int i13 = bVar.f112277E;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                bVar.f112277E = i13 - Integer.MIN_VALUE;
            } else {
                bVar = new b(interfaceC30057d);
            }
        } else {
            bVar = new b(interfaceC30057d);
        }
        Object objM33309t = bVar.f112280y;
        Object obj = EnumC31071a.f128113w;
        int i14 = bVar.f112277E;
        try {
            if (i14 == 0) {
                AbstractC34132o.m107864I(objM33309t);
                C12066b c12066b = this.cognitoAuthApi;
                bVar.f112278w = null;
                bVar.f112277E = 1;
                objM33309t = c12066b.m33309t(str, bVar);
                if (objM33309t == obj) {
                }
            }
            if (i14 != 1) {
                if (i14 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(objM33309t);
                return objM33309t;
            }
            AbstractC34132o.m107864I(objM33309t);
            InterfaceC12072h interfaceC12072h = (InterfaceC12072h) objM33309t;
            if (interfaceC12072h instanceof InterfaceC12072h.b) {
                bVar.f112278w = null;
                bVar.f112279x = null;
                bVar.f112277E = 2;
                Object objM84105i = m84105i((InterfaceC12072h.b) interfaceC12072h, bVar);
                return objM84105i == obj ? obj : objM84105i;
            }
            if (AbstractC22676k.m65745e(interfaceC12072h, InterfaceC12072h.a.f40183a)) {
                this.mfaChallengeRepository.m33347b();
                return InterfaceC30697e.b.f126414a;
            }
            if (AbstractC22676k.m65745e(interfaceC12072h, C12071g.f40182a)) {
                return new InterfaceC30697e.a(ActionErrorCode.NETWORK, "Network error completing MFA challenge");
            }
            if ((interfaceC12072h instanceof InterfaceC12070f.b) || (interfaceC12072h instanceof InterfaceC12070f.a)) {
                return new InterfaceC30697e.a(ActionErrorCode.INVALID_CREDENTIALS, ((InterfaceC12070f) interfaceC12072h).getMetricValue());
            }
            if (!(interfaceC12072h instanceof InterfaceC12070f.c)) {
                throw new NoWhenBranchMatchedException();
            }
            InterfaceC12070f.c cVar = (InterfaceC12070f.c) interfaceC12072h;
            return new InterfaceC30697e.a(m84104h(cVar.getStatusCode()), cVar.getMetricValue() + " (" + cVar.getStatusCode() + ")");
        } catch (IllegalStateException e5) {
            this.logger.mo85230v("AuthAction complete-MFA failed", e5, new AbstractC30556a.a[0]);
            ActionErrorCode actionErrorCode = ActionErrorCode.UNKNOWN;
            String message = e5.getMessage();
            if (message == null) {
                message = "No MFA challenge pending";
            }
            return new InterfaceC30697e.a(actionErrorCode, message);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x005d, code lost:
    
        if (r6 == r1) goto L25;
     */
    @Override // qw2.InterfaceC30696d
    /* JADX INFO: renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.lang.Object mo84111e(q83.InterfaceC30057d<? super qw2.InterfaceC30697e> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof od1.C27863z.f
            if (r0 == 0) goto L13
            r0 = r6
            od1.z$f r0 = (od1.C27863z.f) r0
            int r1 = r0.f112296z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f112296z = r1
            goto L18
        L13:
            od1.z$f r0 = new od1.z$f
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.f112294x
            r83.a r1 = r83.EnumC31071a.f128113w
            int r2 = r0.f112296z
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3a
            if (r2 == r4) goto L36
            if (r2 != r3) goto L2e
            java.lang.Object r0 = r0.f112293w
            java.lang.String r0 = (java.lang.String) r0
            p505ts.AbstractC34132o.m107864I(r6)
            goto L60
        L2e:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L36:
            p505ts.AbstractC34132o.m107864I(r6)
            goto L48
        L3a:
            p505ts.AbstractC34132o.m107864I(r6)
            y92.a r6 = r5.authManager
            r0.f112296z = r4
            java.lang.Object r6 = r6.m125478a(r0)
            if (r6 != r1) goto L48
            goto L5f
        L48:
            com.whoop.domain.model.AuthMaterial r6 = (com.whoop.domain.model.AuthMaterial) r6
            r2 = 0
            if (r6 == 0) goto L52
            java.lang.String r6 = r6.getAccessToken()
            goto L53
        L52:
            r6 = r2
        L53:
            dj0.b r4 = r5.cognitoAuthApi
            r0.f112293w = r2
            r0.f112296z = r3
            java.lang.Object r6 = r4.m33301F(r6, r0)
            if (r6 != r1) goto L60
        L5f:
            return r1
        L60:
            java.lang.Boolean r6 = (java.lang.Boolean) r6
            boolean r6 = r6.booleanValue()
            if (r6 == 0) goto L6b
            qw2.e$b r6 = qw2.InterfaceC30697e.b.f126414a
            return r6
        L6b:
            tr2.n r6 = r5.logger
            r0 = 0
            qr2.a$a[] r0 = new qr2.AbstractC30556a.a[r0]
            java.lang.String r1 = "AuthAction resend-MFA reported failure"
            r6.mo85226q(r1, r0)
            qw2.e$a r6 = new qw2.e$a
            com.whoop.whoopaction.domain.models.ActionErrorCode r0 = com.whoop.whoopaction.domain.models.ActionErrorCode.UNKNOWN
            java.lang.String r1 = "Failed to resend MFA code"
            r6.<init>(r0, r1)
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: od1.C27863z.mo84111e(q83.d):java.lang.Object");
    }

    public /* synthetic */ C27863z(InterfaceC27837a0 interfaceC27837a0, C12066b c12066b, C12086v c12086v, C39352a c39352a, AuthServiceApiV2 authServiceApiV2, InterfaceC34116n interfaceC34116n, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(interfaceC27837a0, c12066b, c12086v, c39352a, authServiceApiV2, (i13 & 32) != 0 ? InterfaceC34116n.INSTANCE.m107848a("UserSessionAuthActionBridge") : interfaceC34116n);
    }
}
