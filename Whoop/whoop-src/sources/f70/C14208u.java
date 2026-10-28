package f70;

import com.whoop.activation.domain.ActivationAuthenticatedApi;
import com.whoop.activation.view.navigation.ActivationFlowDestination;
import com.whoop.data.repositories.FeatureFlagChecker;
import com.whoop.navigation.AppScreen;
import com.whoop.navigation.C9598e;
import com.whoop.navigation.NavigationScreenModel;
import e80.InterfaceC12814a;
import io.getstream.chat.android.models.MessageType;
import iy1.InterfaceC21030c;
import java.util.Locale;
import java.util.Map;
import l83.C23454a0;
import l83.C23465k;
import live.hms.video.media.tracks.HMSTrackSource;
import m83.AbstractC25247g0;
import p505ts.AbstractC34132o;
import p70.InterfaceC28954b;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.InterfaceC30057d;
import qr2.AbstractC30556a;
import r80.AbstractC31061c;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import tr2.InterfaceC34116n;

/* JADX INFO: renamed from: f70.u */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\b\u0007\u0018\u0000 .2\u00020\u0001:\u0001&B;\b\u0000\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J'\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0017\u001a\u00020\u00122\u0006\u0010\u0018\u001a\u00020\u00122\u0006\u0010\u0019\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ$\u0010\u001f\u001a\u00020\u00142\u0006\u0010\u0019\u001a\u00020\u001d2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u0012H\u0086@¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010$\u001a\u0004\u0018\u00010#2\u0006\u0010\"\u001a\u00020!¢\u0006\u0004\b$\u0010%R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010(R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010)R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010*R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010-¨\u0006/"}, m65681d2 = {"Lf70/u;", "", "Lcom/whoop/activation/domain/ActivationAuthenticatedApi;", "activationAuthenticatedApi", "Lcom/whoop/data/repositories/FeatureFlagChecker;", "featureFlagChecker", "Lp70/b;", "whoopStrapInfoProvider", "Liy1/c;", "metricWriter", "Lf70/q;", "appDestinationCache", "Ltr2/n;", "logger", "<init>", "(Lcom/whoop/activation/domain/ActivationAuthenticatedApi;Lcom/whoop/data/repositories/FeatureFlagChecker;Lp70/b;Liy1/c;Lf70/q;Ltr2/n;)V", "Lcom/whoop/navigation/e;", "action", "", "contextTag", "Lf70/t;", "f", "(Lcom/whoop/navigation/e;Ljava/lang/String;)Lf70/t;", "result", "destination", "context", "Ll83/a0;", "c", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Lf70/s;", "flow", "d", "(Lf70/s;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;", "Lcom/whoop/navigation/AppScreen;", HMSTrackSource.SCREEN, "Lcom/whoop/activation/view/navigation/ActivationFlowDestination;", "b", "(Lcom/whoop/navigation/AppScreen;)Lcom/whoop/activation/view/navigation/ActivationFlowDestination;", "a", "Lcom/whoop/activation/domain/ActivationAuthenticatedApi;", "Lcom/whoop/data/repositories/FeatureFlagChecker;", "Lp70/b;", "Liy1/c;", "e", "Lf70/q;", "Ltr2/n;", "g", "activation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C14208u {

    /* JADX INFO: renamed from: h */
    public static final int f51678h = 8;

    /* JADX INFO: renamed from: i */
    private static final Map<AppScreen, ActivationFlowDestination> f51679i = AbstractC25247g0.m73990Y(new C23465k(AppScreen.C9287d.f27536w, ActivationFlowDestination.ACCOUNT_ACTIVATION), new C23465k(AppScreen.C9295e.f27561w, ActivationFlowDestination.ACCOUNT_CREATION), new C23465k(AppScreen.C9303f.f27586w, ActivationFlowDestination.ACCOUNT_TRANSITION_LEGACY_AFTER_ACTIVATION), new C23465k(AppScreen.C9311g.f27610w, ActivationFlowDestination.AFTER_ACTIVATION_FINAL_SCREENS), new C23465k(AppScreen.C9319h.f27635w, ActivationFlowDestination.AL_AFTER_ACTIVATION), new C23465k(AppScreen.C9327i.f27659w, ActivationFlowDestination.AL_PERMISSIONS), new C23465k(AppScreen.C9335j.f27684w, ActivationFlowDestination.AL_PROFILE), new C23465k(AppScreen.C9343k.f27708w, ActivationFlowDestination.DEVICE_EDUCATION), new C23465k(AppScreen.C9351l.f27733w, ActivationFlowDestination.ENTER_YOUR_EMAIL), new C23465k(AppScreen.C9359m.f27760w, ActivationFlowDestination.ENTER_YOUR_PASSWORD), new C23465k(AppScreen.C9367n.f27786w, ActivationFlowDestination.HW_ONLY_AFTER_ACTIVATION), new C23465k(AppScreen.C9375o.f27812w, ActivationFlowDestination.HW_ONLY_PERMISSIONS), new C23465k(AppScreen.C9383p.f27837w, ActivationFlowDestination.HW_ONLY_PROFILE), new C23465k(AppScreen.C9391q.f27861w, ActivationFlowDestination.IN_APP_JOIN_FLOW), new C23465k(AppScreen.C9399r.f27881w, ActivationFlowDestination.MEDICARE_AFTER_ACTIVATION), new C23465k(AppScreen.C9407s.f27905w, ActivationFlowDestination.MEDICARE_PERMISSIONS), new C23465k(AppScreen.C9415t.f27929w, ActivationFlowDestination.MEMBERSHIP_SERVICES), new C23465k(AppScreen.C9423u.f27954w, ActivationFlowDestination.MFA_CHALLENGE), new C23465k(AppScreen.C9431v.f27978w, ActivationFlowDestination.PAIRING), new C23465k(AppScreen.C9439w.f28003w, ActivationFlowDestination.POST_PAIRING), new C23465k(AppScreen.C9447x.f28029w, ActivationFlowDestination.START_SCREEN));

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final ActivationAuthenticatedApi activationAuthenticatedApi;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final FeatureFlagChecker featureFlagChecker;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final InterfaceC28954b whoopStrapInfoProvider;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final InterfaceC21030c metricWriter;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final C14200q appDestinationCache;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final InterfaceC34116n logger;

    /* JADX INFO: renamed from: f70.u$b */
    @InterfaceC32271e(m100429c = "com.whoop.activation.domain.interactors.activation.AppDestinationRouter", m100430f = "AppDestinationRouter.kt", m100431l = {66, 74, 82}, m100432m = "resolve", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b extends AbstractC32269c {

        /* JADX INFO: renamed from: E */
        Object f51686E;

        /* JADX INFO: renamed from: F */
        Object f51687F;

        /* JADX INFO: renamed from: G */
        boolean f51688G;

        /* JADX INFO: renamed from: H */
        /* synthetic */ Object f51689H;

        /* JADX INFO: renamed from: J */
        int f51691J;

        /* JADX INFO: renamed from: w */
        Object f51692w;

        /* JADX INFO: renamed from: x */
        Object f51693x;

        /* JADX INFO: renamed from: y */
        Object f51694y;

        /* JADX INFO: renamed from: z */
        Object f51695z;

        public b(InterfaceC30057d<? super b> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f51689H = obj;
            this.f51691J |= Integer.MIN_VALUE;
            return C14208u.this.m40609d(null, null, this);
        }
    }

    /* JADX INFO: renamed from: f70.u$c */
    /* JADX INFO: loaded from: classes6.dex */
    @InterfaceC32271e(m100429c = "com.whoop.activation.domain.interactors.activation.AppDestinationRouter$resolve$response$1", m100430f = "AppDestinationRouter.kt", m100431l = {67}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m65681d2 = {"Lcom/whoop/navigation/e;", "<anonymous>", "()Lcom/whoop/navigation/e;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class c extends AbstractC32275i implements Function1 {

        /* JADX INFO: renamed from: w */
        int f51696w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ String f51698y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ String f51699z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String str, String str2, InterfaceC30057d<? super c> interfaceC30057d) {
            super(1, interfaceC30057d);
            this.f51698y = str;
            this.f51699z = str2;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(InterfaceC30057d<?> interfaceC30057d) {
            return C14208u.this.new c(this.f51698y, this.f51699z, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f51696w;
            if (i13 != 0) {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
                return obj;
            }
            AbstractC34132o.m107864I(obj);
            ActivationAuthenticatedApi activationAuthenticatedApi = C14208u.this.activationAuthenticatedApi;
            String str = this.f51698y;
            String str2 = this.f51699z;
            this.f51696w = 1;
            Object objFetchAppDestination = activationAuthenticatedApi.fetchAppDestination(str, str2, this);
            return objFetchAppDestination == enumC31071a ? enumC31071a : objFetchAppDestination;
        }

        @Override // p715kotlin.jvm.functions.Function1
        public final Object invoke(InterfaceC30057d<? super C9598e> interfaceC30057d) {
            return ((c) create(interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }
    }

    public C14208u(ActivationAuthenticatedApi activationAuthenticatedApi, FeatureFlagChecker featureFlagChecker, InterfaceC28954b whoopStrapInfoProvider, InterfaceC21030c metricWriter, C14200q appDestinationCache, InterfaceC34116n logger) {
        AbstractC22676k.m65750j(activationAuthenticatedApi, "activationAuthenticatedApi");
        AbstractC22676k.m65750j(featureFlagChecker, "featureFlagChecker");
        AbstractC22676k.m65750j(whoopStrapInfoProvider, "whoopStrapInfoProvider");
        AbstractC22676k.m65750j(metricWriter, "metricWriter");
        AbstractC22676k.m65750j(appDestinationCache, "appDestinationCache");
        AbstractC22676k.m65750j(logger, "logger");
        this.activationAuthenticatedApi = activationAuthenticatedApi;
        this.featureFlagChecker = featureFlagChecker;
        this.whoopStrapInfoProvider = whoopStrapInfoProvider;
        this.metricWriter = metricWriter;
        this.appDestinationCache = appDestinationCache;
        this.logger = logger;
    }

    /* JADX INFO: renamed from: c */
    private final void m40605c(String result, String destination, String context) {
        this.metricWriter.mo58701b(new InterfaceC12814a.b(result, destination, context, null, null, null, 56, null).mo35878b());
    }

    /* JADX INFO: renamed from: e */
    public static /* synthetic */ Object m40606e(C14208u c14208u, EnumC14204s enumC14204s, String str, InterfaceC30057d interfaceC30057d, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            str = null;
        }
        return c14208u.m40609d(enumC14204s, str, interfaceC30057d);
    }

    /* JADX INFO: renamed from: f */
    private final AbstractC14206t m40607f(C9598e action, String contextTag) {
        String unrecognizedScreen;
        if (!AbstractC22676k.m65745e(action.getLive.hms.video.media.tracks.HMSTrackSource.SCREEN java.lang.String(), AppScreen.C9318g6.f27632w)) {
            String name = action.getLive.hms.video.media.tracks.HMSTrackSource.SCREEN java.lang.String().getName();
            Locale locale = Locale.US;
            m40605c("success", AbstractC31061c.m95641q(locale, "US", name, locale, "toLowerCase(...)"), contextTag);
            ActivationFlowDestination activationFlowDestination = f51679i.get(action.getLive.hms.video.media.tracks.HMSTrackSource.SCREEN java.lang.String());
            return activationFlowDestination != null ? new AbstractC14206t.a(activationFlowDestination, AbstractC14210v.m40610a(action)) : new AbstractC14206t.b(action);
        }
        NavigationScreenModel parameters = action.getParameters();
        NavigationScreenModel.DeserializationError deserializationError = parameters instanceof NavigationScreenModel.DeserializationError ? (NavigationScreenModel.DeserializationError) parameters : null;
        if (deserializationError == null || (unrecognizedScreen = deserializationError.getUnrecognizedScreen()) == null) {
            unrecognizedScreen = "unknown";
        }
        this.logger.mo85222m(AbstractC31061c.m95640p("[AppDestination] Unrecognized screen '", unrecognizedScreen, "' from backend, context: ", contextTag), new AbstractC30556a.a[0]);
        m40605c("error", MessageType.FAILED, contextTag);
        return AbstractC14206t.c.f51669a;
    }

    /* JADX INFO: renamed from: b */
    public final ActivationFlowDestination m40608b(AppScreen screen) {
        AbstractC22676k.m65750j(screen, "screen");
        return f51679i.get(screen);
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x016d, code lost:
    
        if (r1 == r2) goto L49;
     */
    /* JADX INFO: renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m40609d(f70.EnumC14204s r17, java.lang.String r18, q83.InterfaceC30057d<? super f70.AbstractC14206t> r19) {
        /*
            Method dump skipped, instruction units count: 458
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: f70.C14208u.m40609d(f70.s, java.lang.String, q83.d):java.lang.Object");
    }

    public /* synthetic */ C14208u(ActivationAuthenticatedApi activationAuthenticatedApi, FeatureFlagChecker featureFlagChecker, InterfaceC28954b interfaceC28954b, InterfaceC21030c interfaceC21030c, C14200q c14200q, InterfaceC34116n interfaceC34116n, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(activationAuthenticatedApi, featureFlagChecker, interfaceC28954b, interfaceC21030c, c14200q, (i13 & 32) != 0 ? InterfaceC34116n.INSTANCE.m107848a("AppDestinationRouter") : interfaceC34116n);
    }
}
