package f70;

import androidx.core.app.NotificationCompat;
import b80.C2792c;
import com.mapbox.common.logger.LogPriority;
import com.whoop.activation.domain.ActivationAuthenticatedApi;
import com.whoop.activation.iajf.domain.SignUpSource;
import com.whoop.activation.view.navigation.ActivationFlowDestination;
import com.whoop.data.repositories.FeatureFlagChecker;
import com.whoop.data.repositories.OnboardingFeatureFlag;
import com.whoop.navigation.C9598e;
import d70.C11749c;
import f80.C14245d;
import h80.C17003c;
import h80.InterfaceC17002b;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import l70.C23389a;
import l83.C23454a0;
import l83.C23465k;
import live.hms.video.plugin.video.virtualbackground.HmsVirtualBackgroundInterfaceKt;
import m83.AbstractC25247g0;
import n70.AbstractC26417d;
import n70.C26418e;
import no.nordicsemi.android.dfu.DfuBaseService;
import od1.InterfaceC27837a0;
import p505ts.AbstractC34132o;
import p70.InterfaceC28954b;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s70.AbstractC32238a;
import s82.C32266a;
import s83.AbstractC32269c;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import tr2.InterfaceC34116n;
import u02.InterfaceC34385a;

/* JADX INFO: renamed from: f70.m0 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000\u0088\u0001\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0017\b\u0001\u0018\u00002\u00020\u0001Bi\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u001a\u0010\u001bJ\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u001cH\u0082@¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010 \u001a\u00020\u001fH\u0082@¢\u0006\u0004\b \u0010\u001eJ0\u0010*\u001a\u00020)2\u0006\u0010\"\u001a\u00020!2\u0006\u0010$\u001a\u00020#2\u0006\u0010&\u001a\u00020%2\u0006\u0010(\u001a\u00020'H\u0082@¢\u0006\u0004\b*\u0010+J0\u0010,\u001a\u00020)2\u0006\u0010\"\u001a\u00020!2\u0006\u0010$\u001a\u00020#2\u0006\u0010&\u001a\u00020%2\u0006\u0010(\u001a\u00020'H\u0082@¢\u0006\u0004\b,\u0010+J\u0010\u0010-\u001a\u00020)H\u0082@¢\u0006\u0004\b-\u0010\u001eJ\u001f\u0010.\u001a\u00020)2\u0006\u0010\"\u001a\u00020!2\u0006\u0010$\u001a\u00020#H\u0002¢\u0006\u0004\b.\u0010/J\u0012\u00101\u001a\u0004\u0018\u000100H\u0082@¢\u0006\u0004\b1\u0010\u001eJ\u0018\u00103\u001a\u00020)2\u0006\u00102\u001a\u00020)H\u0080@¢\u0006\u0004\b3\u00104R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b5\u00106R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00108R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010:R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010<R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u0010>R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u0010@R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u0010AR\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010BR\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010CR\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010DR\u0014\u0010\u0017\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010ER\u0014\u0010\u0019\u001a\u00020\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010F¨\u0006G"}, m65681d2 = {"Lf70/m0;", "", "Lod1/a0;", "userSessionManager", "Lp70/b;", "whoopStrapInfoProvider", "Lcom/whoop/data/repositories/FeatureFlagChecker;", "featureFlagChecker", "Lh80/c;", "activationAnalyticsHelper", "Lcom/whoop/activation/domain/ActivationAuthenticatedApi;", "activationAuthenticatedApi", "Lb80/c;", "iajfAnalyticsHelper", "Lf70/t0;", "passwordComplianceCheckHandler", "Ll70/a;", "activationExperimentsHelper", "Ls82/a;", "seonManager", "Lf70/u;", "appDestinationRouter", "Lf80/d;", "passwordManagerAnalyticsTracker", "Ltr2/n;", "logger", "<init>", "(Lod1/a0;Lp70/b;Lcom/whoop/data/repositories/FeatureFlagChecker;Lh80/c;Lcom/whoop/activation/domain/ActivationAuthenticatedApi;Lb80/c;Lf70/t0;Ll70/a;Ls82/a;Lf70/u;Lf80/d;Ltr2/n;)V", "", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "(Lq83/d;)Ljava/lang/Object;", "Ll83/a0;", "n", "Lf70/q0;", "memberInfo", "Ld70/c;", NotificationCompat.CATEGORY_EMAIL, "", "passwordNeedsReset", "Lcom/whoop/activation/iajf/domain/SignUpSource;", "signUpSource", "Lf70/e$b;", "i", "(Lf70/q0;Ld70/c;ZLcom/whoop/activation/iajf/domain/SignUpSource;Lq83/d;)Ljava/lang/Object;", "j", "k", "l", "(Lf70/q0;Ld70/c;)Lf70/e$b;", "Lcom/whoop/navigation/e;", "g", "prevDomainResult", "m", "(Lf70/e$b;Lq83/d;)Ljava/lang/Object;", "a", "Lod1/a0;", "b", "Lp70/b;", "c", "Lcom/whoop/data/repositories/FeatureFlagChecker;", "d", "Lh80/c;", "e", "Lcom/whoop/activation/domain/ActivationAuthenticatedApi;", "f", "Lb80/c;", "Lf70/t0;", "Ll70/a;", "Ls82/a;", "Lf70/u;", "Lf80/d;", "Ltr2/n;", "activation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C14193m0 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final InterfaceC27837a0 userSessionManager;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final InterfaceC28954b whoopStrapInfoProvider;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final FeatureFlagChecker featureFlagChecker;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final C17003c activationAnalyticsHelper;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final ActivationAuthenticatedApi activationAuthenticatedApi;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final C2792c iajfAnalyticsHelper;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final C14207t0 passwordComplianceCheckHandler;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private final C23389a activationExperimentsHelper;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private final C32266a seonManager;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private final C14208u appDestinationRouter;

    /* JADX INFO: renamed from: k, reason: from kotlin metadata */
    private final C14245d passwordManagerAnalyticsTracker;

    /* JADX INFO: renamed from: l, reason: from kotlin metadata */
    private final InterfaceC34116n logger;

    /* JADX INFO: renamed from: f70.m0$a */
    /* JADX INFO: loaded from: classes6.dex */
    @InterfaceC32271e(m100429c = "com.whoop.activation.domain.interactors.activation.LoginClickedHandler", m100430f = "LoginClickedHandler.kt", m100431l = {273}, m100432m = "fetchPostSignInDestination", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a extends AbstractC32269c {

        /* JADX INFO: renamed from: w */
        /* synthetic */ Object f51479w;

        /* JADX INFO: renamed from: y */
        int f51481y;

        public a(InterfaceC30057d<? super a> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f51479w = obj;
            this.f51481y |= Integer.MIN_VALUE;
            return C14193m0.this.m40514g(this);
        }
    }

    /* JADX INFO: renamed from: f70.m0$b */
    /* JADX INFO: loaded from: classes6.dex */
    @InterfaceC32271e(m100429c = "com.whoop.activation.domain.interactors.activation.LoginClickedHandler$fetchPostSignInDestination$response$1", m100430f = "LoginClickedHandler.kt", m100431l = {274}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m65681d2 = {"Lcom/whoop/navigation/e;", "<anonymous>", "()Lcom/whoop/navigation/e;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class b extends AbstractC32275i implements Function1 {

        /* JADX INFO: renamed from: w */
        int f51482w;

        public b(InterfaceC30057d<? super b> interfaceC30057d) {
            super(1, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(InterfaceC30057d<?> interfaceC30057d) {
            return C14193m0.this.new b(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f51482w;
            if (i13 != 0) {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
                return obj;
            }
            AbstractC34132o.m107864I(obj);
            ActivationAuthenticatedApi activationAuthenticatedApi = C14193m0.this.activationAuthenticatedApi;
            this.f51482w = 1;
            Object objM17051a = ActivationAuthenticatedApi.m17051a(activationAuthenticatedApi, null, null, this, 1, null);
            return objM17051a == enumC31071a ? enumC31071a : objM17051a;
        }

        @Override // p715kotlin.jvm.functions.Function1
        public final Object invoke(InterfaceC30057d<? super C9598e> interfaceC30057d) {
            return ((b) create(interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }
    }

    /* JADX INFO: renamed from: f70.m0$c */
    /* JADX INFO: loaded from: classes6.dex */
    @InterfaceC32271e(m100429c = "com.whoop.activation.domain.interactors.activation.LoginClickedHandler", m100430f = "LoginClickedHandler.kt", m100431l = {152, 154}, m100432m = "fetchSeonFingerprint", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c extends AbstractC32269c {

        /* JADX INFO: renamed from: w */
        Object f51484w;

        /* JADX INFO: renamed from: x */
        /* synthetic */ Object f51485x;

        /* JADX INFO: renamed from: z */
        int f51487z;

        public c(InterfaceC30057d<? super c> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f51485x = obj;
            this.f51487z |= Integer.MIN_VALUE;
            return C14193m0.this.m40515h(this);
        }
    }

    /* JADX INFO: renamed from: f70.m0$d */
    /* JADX INFO: loaded from: classes6.dex */
    @InterfaceC32271e(m100429c = "com.whoop.activation.domain.interactors.activation.LoginClickedHandler", m100430f = "LoginClickedHandler.kt", m100431l = {179}, m100432m = "handleExistingUser", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class d extends AbstractC32269c {

        /* JADX INFO: renamed from: E */
        /* synthetic */ Object f51488E;

        /* JADX INFO: renamed from: G */
        int f51490G;

        /* JADX INFO: renamed from: w */
        Object f51491w;

        /* JADX INFO: renamed from: x */
        Object f51492x;

        /* JADX INFO: renamed from: y */
        Object f51493y;

        /* JADX INFO: renamed from: z */
        boolean f51494z;

        public d(InterfaceC30057d<? super d> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f51488E = obj;
            this.f51490G |= Integer.MIN_VALUE;
            return C14193m0.this.m40516i(null, null, false, null, this);
        }
    }

    /* JADX INFO: renamed from: f70.m0$e */
    /* JADX INFO: loaded from: classes6.dex */
    @InterfaceC32271e(m100429c = "com.whoop.activation.domain.interactors.activation.LoginClickedHandler", m100430f = "LoginClickedHandler.kt", m100431l = {218, 233}, m100432m = "handleProvisionalUser", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class e extends AbstractC32269c {

        /* JADX INFO: renamed from: E */
        boolean f51495E;

        /* JADX INFO: renamed from: F */
        int f51496F;

        /* JADX INFO: renamed from: G */
        /* synthetic */ Object f51497G;

        /* JADX INFO: renamed from: I */
        int f51499I;

        /* JADX INFO: renamed from: w */
        Object f51500w;

        /* JADX INFO: renamed from: x */
        Object f51501x;

        /* JADX INFO: renamed from: y */
        Object f51502y;

        /* JADX INFO: renamed from: z */
        Object f51503z;

        public e(InterfaceC30057d<? super e> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f51497G = obj;
            this.f51499I |= Integer.MIN_VALUE;
            return C14193m0.this.m40517j(null, null, false, null, this);
        }
    }

    /* JADX INFO: renamed from: f70.m0$f */
    /* JADX INFO: loaded from: classes6.dex */
    @InterfaceC32271e(m100429c = "com.whoop.activation.domain.interactors.activation.LoginClickedHandler", m100430f = "LoginClickedHandler.kt", m100431l = {240}, m100432m = "legacyProvisionalNoStrapFallback", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class f extends AbstractC32269c {

        /* JADX INFO: renamed from: w */
        /* synthetic */ Object f51504w;

        /* JADX INFO: renamed from: y */
        int f51506y;

        public f(InterfaceC30057d<? super f> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f51504w = obj;
            this.f51506y |= Integer.MIN_VALUE;
            return C14193m0.this.m40518k(this);
        }
    }

    /* JADX INFO: renamed from: f70.m0$g */
    /* JADX INFO: loaded from: classes6.dex */
    @InterfaceC32271e(m100429c = "com.whoop.activation.domain.interactors.activation.LoginClickedHandler", m100430f = "LoginClickedHandler.kt", m100431l = {57, 58, 65, 71, HmsVirtualBackgroundInterfaceKt.DEFAULT_BLUR_PERCENTAGE, 77, 84, 90, LogPriority.NONE, 107, 142}, m100432m = "onLoginClickedEmailFirst$activation_release", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class g extends AbstractC32269c {

        /* JADX INFO: renamed from: E */
        Object f51507E;

        /* JADX INFO: renamed from: F */
        Object f51508F;

        /* JADX INFO: renamed from: G */
        Object f51509G;

        /* JADX INFO: renamed from: H */
        int f51510H;

        /* JADX INFO: renamed from: I */
        /* synthetic */ Object f51511I;

        /* JADX INFO: renamed from: K */
        int f51513K;

        /* JADX INFO: renamed from: w */
        Object f51514w;

        /* JADX INFO: renamed from: x */
        Object f51515x;

        /* JADX INFO: renamed from: y */
        Object f51516y;

        /* JADX INFO: renamed from: z */
        Object f51517z;

        public g(InterfaceC30057d<? super g> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f51511I = obj;
            this.f51513K |= Integer.MIN_VALUE;
            return C14193m0.this.m40521m(null, this);
        }
    }

    public C14193m0(InterfaceC27837a0 userSessionManager, InterfaceC28954b whoopStrapInfoProvider, FeatureFlagChecker featureFlagChecker, C17003c activationAnalyticsHelper, ActivationAuthenticatedApi activationAuthenticatedApi, C2792c iajfAnalyticsHelper, C14207t0 passwordComplianceCheckHandler, C23389a activationExperimentsHelper, C32266a seonManager, C14208u appDestinationRouter, C14245d passwordManagerAnalyticsTracker, InterfaceC34116n logger) {
        AbstractC22676k.m65750j(userSessionManager, "userSessionManager");
        AbstractC22676k.m65750j(whoopStrapInfoProvider, "whoopStrapInfoProvider");
        AbstractC22676k.m65750j(featureFlagChecker, "featureFlagChecker");
        AbstractC22676k.m65750j(activationAnalyticsHelper, "activationAnalyticsHelper");
        AbstractC22676k.m65750j(activationAuthenticatedApi, "activationAuthenticatedApi");
        AbstractC22676k.m65750j(iajfAnalyticsHelper, "iajfAnalyticsHelper");
        AbstractC22676k.m65750j(passwordComplianceCheckHandler, "passwordComplianceCheckHandler");
        AbstractC22676k.m65750j(activationExperimentsHelper, "activationExperimentsHelper");
        AbstractC22676k.m65750j(seonManager, "seonManager");
        AbstractC22676k.m65750j(appDestinationRouter, "appDestinationRouter");
        AbstractC22676k.m65750j(passwordManagerAnalyticsTracker, "passwordManagerAnalyticsTracker");
        AbstractC22676k.m65750j(logger, "logger");
        this.userSessionManager = userSessionManager;
        this.whoopStrapInfoProvider = whoopStrapInfoProvider;
        this.featureFlagChecker = featureFlagChecker;
        this.activationAnalyticsHelper = activationAnalyticsHelper;
        this.activationAuthenticatedApi = activationAuthenticatedApi;
        this.iajfAnalyticsHelper = iajfAnalyticsHelper;
        this.passwordComplianceCheckHandler = passwordComplianceCheckHandler;
        this.activationExperimentsHelper = activationExperimentsHelper;
        this.seonManager = seonManager;
        this.appDestinationRouter = appDestinationRouter;
        this.passwordManagerAnalyticsTracker = passwordManagerAnalyticsTracker;
        this.logger = logger;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX INFO: renamed from: g */
    public final Object m40514g(InterfaceC30057d<? super C9598e> interfaceC30057d) {
        a aVar;
        if (interfaceC30057d instanceof a) {
            aVar = (a) interfaceC30057d;
            int i13 = aVar.f51481y;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                aVar.f51481y = i13 - Integer.MIN_VALUE;
            } else {
                aVar = new a(interfaceC30057d);
            }
        } else {
            aVar = new a(interfaceC30057d);
        }
        a aVar2 = aVar;
        Object objM108729b = aVar2.f51479w;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = aVar2.f51481y;
        if (i14 == 0) {
            AbstractC34132o.m107864I(objM108729b);
            InterfaceC34385a.Companion companion = InterfaceC34385a.INSTANCE;
            InterfaceC34116n interfaceC34116n = this.logger;
            b bVar = new b(null);
            aVar2.f51481y = 1;
            objM108729b = InterfaceC34385a.Companion.m108729b(companion, interfaceC34116n, null, "Failed to fetch post-signin destination", bVar, aVar2, 2, null);
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
            return (C9598e) ((InterfaceC34385a.c) interfaceC34385a).m108735a();
        }
        if (interfaceC34385a instanceof InterfaceC34385a.b) {
            return null;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x006e, code lost:
    
        if (r8 == r1) goto L28;
     */
    /* JADX INFO: renamed from: h */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m40515h(q83.InterfaceC30057d<? super java.lang.String> r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof f70.C14193m0.c
            if (r0 == 0) goto L13
            r0 = r8
            f70.m0$c r0 = (f70.C14193m0.c) r0
            int r1 = r0.f51487z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f51487z = r1
            goto L18
        L13:
            f70.m0$c r0 = new f70.m0$c
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f51485x
            r83.a r1 = r83.EnumC31071a.f128113w
            int r2 = r0.f51487z
            java.lang.String r3 = ""
            r4 = 0
            r5 = 2
            r6 = 1
            if (r2 == 0) goto L3d
            if (r2 == r6) goto L39
            if (r2 != r5) goto L31
            java.lang.Object r0 = r0.f51484w
            java.lang.String r0 = (java.lang.String) r0
            p505ts.AbstractC34132o.m107864I(r8)
            goto L71
        L31:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L39:
            p505ts.AbstractC34132o.m107864I(r8)
            goto L56
        L3d:
            p505ts.AbstractC34132o.m107864I(r8)
            com.whoop.data.repositories.FeatureFlagChecker r8 = r7.featureFlagChecker
            com.whoop.data.repositories.OnboardingFeatureFlag r2 = com.whoop.data.repositories.OnboardingFeatureFlag.ANDROID_SEON_LOGIN
            boolean r8 = r8.isFeatureEnabled(r2)
            if (r8 != 0) goto L4b
            return r4
        L4b:
            s82.a r8 = r7.seonManager
            r0.f51487z = r6
            java.lang.Object r8 = r8.m100426k(r0)
            if (r8 != r1) goto L56
            goto L70
        L56:
            java.lang.String r8 = (java.lang.String) r8
            if (r8 != 0) goto L77
            com.whoop.data.repositories.FeatureFlagChecker r2 = r7.featureFlagChecker
            com.whoop.data.repositories.OnboardingFeatureFlag r6 = com.whoop.data.repositories.OnboardingFeatureFlag.ANDROID_SEON_PW_SCREEN
            boolean r2 = r2.isFeatureEnabled(r6)
            if (r2 == 0) goto L77
            s82.a r8 = r7.seonManager
            r0.f51484w = r4
            r0.f51487z = r5
            java.lang.Object r8 = r8.m100427l(r0)
            if (r8 != r1) goto L71
        L70:
            return r1
        L71:
            java.lang.String r8 = (java.lang.String) r8
            if (r8 != 0) goto L76
            return r3
        L76:
            return r8
        L77:
            if (r8 != 0) goto L7a
            return r3
        L7a:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: f70.C14193m0.m40515h(q83.d):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:8:0x001a  */
    /* JADX INFO: renamed from: i */
    public final Object m40516i(C14201q0 c14201q0, C11749c c11749c, boolean z4, SignUpSource signUpSource, InterfaceC30057d<? super InterfaceC14176e.b> interfaceC30057d) {
        d dVar;
        C14201q0 c14201q1;
        if (interfaceC30057d instanceof d) {
            dVar = (d) interfaceC30057d;
            int i13 = dVar.f51490G;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                dVar.f51490G = i13 - Integer.MIN_VALUE;
            } else {
                dVar = new d(interfaceC30057d);
            }
        } else {
            dVar = new d(interfaceC30057d);
        }
        d dVar2 = dVar;
        Object objM40606e = dVar2.f51488E;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = dVar2.f51490G;
        if (i14 == 0) {
            AbstractC34132o.m107864I(objM40606e);
            this.activationAnalyticsHelper.m47941p(new InterfaceC17002b.d("enter_password", "existing_account"));
            this.iajfAnalyticsHelper.m7944l(signUpSource);
            if (z4) {
                return m40519l(c14201q0, c11749c);
            }
            C14208u c14208u = this.appDestinationRouter;
            EnumC14204s enumC14204s = EnumC14204s.POST_SIGN_IN;
            dVar2.f51491w = c14201q0;
            dVar2.f51492x = null;
            dVar2.f51493y = null;
            dVar2.f51494z = z4;
            dVar2.f51490G = 1;
            objM40606e = C14208u.m40606e(c14208u, enumC14204s, null, dVar2, 2, null);
            if (objM40606e == enumC31071a) {
                return enumC31071a;
            }
            c14201q1 = c14201q0;
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C14201q0 c14201q2 = (C14201q0) dVar2.f51491w;
            AbstractC34132o.m107864I(objM40606e);
            c14201q1 = c14201q2;
        }
        AbstractC14206t abstractC14206t = (AbstractC14206t) objM40606e;
        if (abstractC14206t instanceof AbstractC14206t.b) {
            return new InterfaceC14176e.b(null, new C26418e(0, 0, 0, null, new AbstractC26417d.b(((AbstractC14206t.b) abstractC14206t).getAction()), 15, null), null, c14201q1, null, false, null, false, null, false, false, null, null, null, null, null, null, 131061, null);
        }
        if (abstractC14206t instanceof AbstractC14206t.a) {
            return new InterfaceC14176e.b(null, new C26418e(0, 0, 0, null, AbstractC14210v.m40611b((AbstractC14206t.a) abstractC14206t), 15, null), null, c14201q1, null, false, null, false, null, false, false, null, null, null, null, null, null, 131061, null);
        }
        if (abstractC14206t instanceof AbstractC14206t.c) {
            return new InterfaceC14176e.b(null, new C26418e(0, 0, 0, null, new AbstractC26417d.a(ActivationFlowDestination.HOME, null, 2, null), 15, null), null, c14201q1, null, false, null, false, null, false, false, null, null, null, null, null, null, 131061, null);
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:8:0x001a  */
    /* JADX INFO: renamed from: j */
    public final Object m40517j(C14201q0 c14201q0, C11749c c11749c, boolean z4, SignUpSource signUpSource, InterfaceC30057d<? super InterfaceC14176e.b> interfaceC30057d) {
        e eVar;
        int i13;
        Object objM40606e;
        C14201q0 c14201q1;
        boolean z13 = z4;
        if (interfaceC30057d instanceof e) {
            eVar = (e) interfaceC30057d;
            int i14 = eVar.f51499I;
            if ((i14 & Integer.MIN_VALUE) != 0) {
                eVar.f51499I = i14 - Integer.MIN_VALUE;
            } else {
                eVar = new e(interfaceC30057d);
            }
        } else {
            eVar = new e(interfaceC30057d);
        }
        e eVar2 = eVar;
        Object obj = eVar2.f51497G;
        Object obj2 = EnumC31071a.f128113w;
        int i15 = eVar2.f51499I;
        if (i15 == 0) {
            AbstractC34132o.m107864I(obj);
            this.activationAnalyticsHelper.m47941p(new InterfaceC17002b.d("enter_password", "provisional_account"));
            this.iajfAnalyticsHelper.m7949q(signUpSource);
            if (z13) {
                return m40519l(c14201q0, c11749c);
            }
            i13 = this.whoopStrapInfoProvider.mo87912a() != null ? 1 : 0;
            C14208u c14208u = this.appDestinationRouter;
            EnumC14204s enumC14204s = EnumC14204s.POST_SIGN_IN;
            eVar2.f51500w = c14201q0;
            eVar2.f51501x = null;
            eVar2.f51502y = null;
            eVar2.f51495E = z13;
            eVar2.f51496F = i13;
            eVar2.f51499I = 1;
            objM40606e = C14208u.m40606e(c14208u, enumC14204s, null, eVar2, 2, null);
            if (objM40606e != obj2) {
                c14201q1 = c14201q0;
            }
        }
        if (i15 != 1) {
            if (i15 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            return obj;
        }
        int i16 = eVar2.f51496F;
        boolean z14 = eVar2.f51495E;
        C14201q0 c14201q2 = (C14201q0) eVar2.f51500w;
        AbstractC34132o.m107864I(obj);
        i13 = i16;
        z13 = z14;
        objM40606e = obj;
        c14201q1 = c14201q2;
        AbstractC14206t abstractC14206t = (AbstractC14206t) objM40606e;
        if (abstractC14206t instanceof AbstractC14206t.b) {
            return new InterfaceC14176e.b(null, new C26418e(0, 0, 0, null, new AbstractC26417d.b(((AbstractC14206t.b) abstractC14206t).getAction()), 15, null), null, c14201q1, null, false, null, false, null, false, false, null, null, null, null, null, null, 131061, null);
        }
        if (abstractC14206t instanceof AbstractC14206t.a) {
            return new InterfaceC14176e.b(null, new C26418e(0, 0, 0, null, AbstractC14210v.m40611b((AbstractC14206t.a) abstractC14206t), 15, null), null, c14201q1, null, false, null, false, null, false, false, null, null, null, null, null, null, 131061, null);
        }
        if (!(abstractC14206t instanceof AbstractC14206t.c)) {
            throw new NoWhenBranchMatchedException();
        }
        if (i13 != 0) {
            return AbstractC32238a.m100308c();
        }
        eVar2.f51500w = null;
        eVar2.f51501x = null;
        eVar2.f51502y = null;
        eVar2.f51503z = null;
        eVar2.f51495E = z13;
        eVar2.f51496F = i13;
        eVar2.f51499I = 2;
        Object objM40518k = m40518k(eVar2);
        return objM40518k == obj2 ? obj2 : objM40518k;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX INFO: renamed from: k */
    public final Object m40518k(InterfaceC30057d<? super InterfaceC14176e.b> interfaceC30057d) {
        f fVar;
        if (interfaceC30057d instanceof f) {
            fVar = (f) interfaceC30057d;
            int i13 = fVar.f51506y;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                fVar.f51506y = i13 - Integer.MIN_VALUE;
            } else {
                fVar = new f(interfaceC30057d);
            }
        } else {
            fVar = new f(interfaceC30057d);
        }
        Object objM40514g = fVar.f51504w;
        Object obj = EnumC31071a.f128113w;
        int i14 = fVar.f51506y;
        if (i14 == 0) {
            AbstractC34132o.m107864I(objM40514g);
            if (this.featureFlagChecker.isFeatureEnabled(OnboardingFeatureFlag.DROID_IAJF_LOGIN_NAVIGATION)) {
                fVar.f51506y = 1;
                objM40514g = m40514g(fVar);
                if (objM40514g == obj) {
                    return obj;
                }
            }
            return new InterfaceC14176e.b(null, new C26418e(0, 0, 0, null, new AbstractC26417d.a(ActivationFlowDestination.DEVICE_EDUCATION, null, 2, null), 15, null), null, null, null, false, null, false, null, false, false, null, null, null, null, null, null, 131069, null);
        }
        if (i14 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        AbstractC34132o.m107864I(objM40514g);
        C9598e c9598e = (C9598e) objM40514g;
        if (c9598e != null) {
            return new InterfaceC14176e.b(null, new C26418e(0, 0, 0, null, new AbstractC26417d.b(c9598e), 15, null), null, null, null, false, null, false, null, false, false, null, null, null, null, null, null, 131069, null);
        }
        return new InterfaceC14176e.b(null, new C26418e(0, 0, 0, null, new AbstractC26417d.a(ActivationFlowDestination.DEVICE_EDUCATION, null, 2, null), 15, null), null, null, null, false, null, false, null, false, false, null, null, null, null, null, null, 131069, null);
    }

    /* JADX INFO: renamed from: l */
    private final InterfaceC14176e.b m40519l(C14201q0 memberInfo, C11749c email) {
        return new InterfaceC14176e.b(null, new C26418e(0, 0, 0, null, new AbstractC26417d.a(ActivationFlowDestination.FORGOT_PASSWORD, AbstractC25247g0.m73990Y(new C23465k(NotificationCompat.CATEGORY_EMAIL, email.getValue()), new C23465k("fromPostPairing", Boolean.FALSE))), 15, null), null, memberInfo, null, false, null, false, null, false, false, null, null, null, null, null, null, 131061, null);
    }

    /* JADX INFO: renamed from: n */
    private final Object m40520n(InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        Object objM100428m;
        boolean zIsFeatureEnabled = this.featureFlagChecker.isFeatureEnabled(OnboardingFeatureFlag.ANDROID_SEON_LOGIN_RETRY);
        C23454a0 c23454a0 = C23454a0.f92919a;
        return (zIsFeatureEnabled && (objM100428m = this.seonManager.m100428m(interfaceC30057d)) == EnumC31071a.f128113w) ? objM100428m : c23454a0;
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type inference error: updates count limit reached with updateSeq = 14941. Try increasing type updates limit count.
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:79)
        */
    /* JADX INFO: renamed from: m */
    public final java.lang.Object m40521m(f70.InterfaceC14176e.b r47, q83.InterfaceC30057d<? super f70.InterfaceC14176e.b> r48) {
        /*
            Method dump skipped, instruction units count: 1494
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: f70.C14193m0.m40521m(f70.e$b, q83.d):java.lang.Object");
    }

    public /* synthetic */ C14193m0(InterfaceC27837a0 interfaceC27837a0, InterfaceC28954b interfaceC28954b, FeatureFlagChecker featureFlagChecker, C17003c c17003c, ActivationAuthenticatedApi activationAuthenticatedApi, C2792c c2792c, C14207t0 c14207t0, C23389a c23389a, C32266a c32266a, C14208u c14208u, C14245d c14245d, InterfaceC34116n interfaceC34116n, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(interfaceC27837a0, interfaceC28954b, featureFlagChecker, c17003c, activationAuthenticatedApi, c2792c, c14207t0, c23389a, c32266a, c14208u, c14245d, (i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? InterfaceC34116n.INSTANCE.m107848a("ActivationLoginClickedHelper") : interfaceC34116n);
    }
}
