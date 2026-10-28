package f70;

import com.whoop.activation.domain.ActivationAuthenticatedApi;
import com.whoop.activation.domain.interactors.activation.SubscriptionError;
import com.whoop.activation.domain.models.ActivationBody;
import com.whoop.activation.domain.models.PostAccountInfoResponse;
import com.whoop.activation.domain.models.UpsertProfileBody;
import com.whoop.activation.view.navigation.ActivationFlowDestination;
import com.whoop.data.repositories.FeatureFlagChecker;
import com.whoop.data.repositories.OnboardingFeatureFlag;
import com.whoop.domain.model.UnitSystem;
import com.whoop.domain.model.WhoopStrapInfo;
import d70.C11748b;
import h80.C17003c;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.util.Locale;
import l83.C23454a0;
import n70.AbstractC26417d;
import n70.C26418e;
import od1.C27847j;
import or2.AbstractC28184n0;
import org.joda.time.LocalDate;
import p505ts.AbstractC34132o;
import p70.InterfaceC28954b;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import pg3.C29218v0;
import q83.InterfaceC30057d;
import qr2.AbstractC30556a;
import r83.EnumC31071a;
import retrofit2.HttpException;
import s70.AbstractC32238a;
import s83.AbstractC32269c;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import tr2.InterfaceC34116n;
import u02.InterfaceC34385a;
import ud3.AbstractC34799a1;
import zr2.InterfaceC41070a;

/* JADX INFO: renamed from: f70.w0 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0016\b\u0001\u0018\u0000 =2\u00020\u0001:\u0001/BY\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\u0006\u0010\u0013\u001a\u00020\u0012\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0014¢\u0006\u0004\b\u0016\u0010\u0017J.\u0010 \u001a\u00020\u001f2\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u00182\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u001dH\u0082@¢\u0006\u0004\b \u0010!J.\u0010$\u001a\u00020\u001f2\u0006\u0010\u001c\u001a\u00020\u001b2\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00190\"2\u0006\u0010\u001e\u001a\u00020\u001dH\u0082@¢\u0006\u0004\b$\u0010%J\u0013\u0010&\u001a\u00020\u001f*\u00020\u001bH\u0002¢\u0006\u0004\b&\u0010'J\u0017\u0010)\u001a\u00020(2\u0006\u0010\u001c\u001a\u00020\u001bH\u0002¢\u0006\u0004\b)\u0010*J \u0010+\u001a\u00020\u001f2\u0006\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u001e\u001a\u00020\u001dH\u0086@¢\u0006\u0004\b+\u0010,J\u0018\u0010-\u001a\u00020\u001f2\u0006\u0010\u001c\u001a\u00020\u001bH\u0086@¢\u0006\u0004\b-\u0010.R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00104R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u00105R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u00106R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u00107R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u00108R\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u00109R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010:R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010<¨\u0006>"}, m65681d2 = {"Lf70/w0;", "", "Lcom/whoop/activation/domain/ActivationAuthenticatedApi;", "activationAuthenticatedApi", "Lp70/b;", "whoopStrapInfoProvider", "Lf70/l;", "activationUserSessionCreator", "Lzr2/a;", "dateAndTimeProvider", "Lf70/s0;", "navigateBackToCreditCardScreen", "Lh80/c;", "analyticsHelper", "Lf70/c1;", "subscriptionErrorParser", "Lcom/whoop/data/repositories/FeatureFlagChecker;", "featureFlagChecker", "Lod1/j;", "pendingUserSessionRepository", "Ltr2/n;", "logger", "<init>", "(Lcom/whoop/activation/domain/ActivationAuthenticatedApi;Lp70/b;Lf70/l;Lzr2/a;Lf70/s0;Lh80/c;Lf70/c1;Lcom/whoop/data/repositories/FeatureFlagChecker;Lod1/j;Ltr2/n;)V", "Lu02/a$b;", "Lcom/whoop/activation/domain/models/PostAccountInfoResponse;", "apiCallResult", "Lf70/e$b;", "prevDomainResult", "", "authenticated", "Lf70/f;", "f", "(Lu02/a$b;Lf70/e$b;ZLq83/d;)Ljava/lang/Object;", "Lu02/a$b$a;", "result", "g", "(Lf70/e$b;Lu02/a$b$a;ZLq83/d;)Ljava/lang/Object;", "e", "(Lf70/e$b;)Lf70/f;", "Lcom/whoop/activation/domain/models/ActivationBody;", "d", "(Lf70/e$b;)Lcom/whoop/activation/domain/models/ActivationBody;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "(Lf70/e$b;ZLq83/d;)Ljava/lang/Object;", "i", "(Lf70/e$b;Lq83/d;)Ljava/lang/Object;", "a", "Lcom/whoop/activation/domain/ActivationAuthenticatedApi;", "b", "Lp70/b;", "c", "Lf70/l;", "Lzr2/a;", "Lf70/s0;", "Lh80/c;", "Lf70/c1;", "Lcom/whoop/data/repositories/FeatureFlagChecker;", "Lod1/j;", "j", "Ltr2/n;", "k", "activation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C14213w0 {

    /* JADX INFO: renamed from: k */
    private static final a f51786k = new a(null);

    /* JADX INFO: renamed from: l */
    public static final int f51787l = 8;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final ActivationAuthenticatedApi activationAuthenticatedApi;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final InterfaceC28954b whoopStrapInfoProvider;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final C14190l activationUserSessionCreator;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final InterfaceC41070a dateAndTimeProvider;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final C14205s0 navigateBackToCreditCardScreen;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final C17003c analyticsHelper;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final C14172c1 subscriptionErrorParser;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private final FeatureFlagChecker featureFlagChecker;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private final C27847j pendingUserSessionRepository;

    /* JADX INFO: renamed from: j, reason: from kotlin metadata */
    private final InterfaceC34116n logger;

    /* JADX INFO: renamed from: f70.w0$a */
    @Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, m65681d2 = {"Lf70/w0$a;", "", "<init>", "()V", "", "STRIPE_ERROR_CODE", "I", "SUBSCRIPTION_ERROR_CODE", "activation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    /* JADX INFO: renamed from: f70.w0$b */
    /* JADX INFO: loaded from: classes6.dex */
    @InterfaceC32271e(m100429c = "com.whoop.activation.domain.interactors.activation.RemoteAccountInfoHelper", m100430f = "RemoteAccountInfoHelper.kt", m100431l = {117, 123}, m100432m = "handlePostAccountInfoError", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b extends AbstractC32269c {

        /* JADX INFO: renamed from: F */
        int f51799F;

        /* JADX INFO: renamed from: w */
        Object f51800w;

        /* JADX INFO: renamed from: x */
        Object f51801x;

        /* JADX INFO: renamed from: y */
        boolean f51802y;

        /* JADX INFO: renamed from: z */
        /* synthetic */ Object f51803z;

        public b(InterfaceC30057d<? super b> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f51803z = obj;
            this.f51799F |= Integer.MIN_VALUE;
            return C14213w0.this.m40633f(null, null, false, this);
        }
    }

    /* JADX INFO: renamed from: f70.w0$c */
    /* JADX INFO: loaded from: classes6.dex */
    @InterfaceC32271e(m100429c = "com.whoop.activation.domain.interactors.activation.RemoteAccountInfoHelper", m100430f = "RemoteAccountInfoHelper.kt", m100431l = {164}, m100432m = "handleSubscriptionErrors", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c extends AbstractC32269c {

        /* JADX INFO: renamed from: E */
        boolean f51804E;

        /* JADX INFO: renamed from: F */
        /* synthetic */ Object f51805F;

        /* JADX INFO: renamed from: H */
        int f51807H;

        /* JADX INFO: renamed from: w */
        Object f51808w;

        /* JADX INFO: renamed from: x */
        Object f51809x;

        /* JADX INFO: renamed from: y */
        Object f51810y;

        /* JADX INFO: renamed from: z */
        Object f51811z;

        public c(InterfaceC30057d<? super c> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f51805F = obj;
            this.f51807H |= Integer.MIN_VALUE;
            return C14213w0.this.m40634g(null, null, false, this);
        }
    }

    /* JADX INFO: renamed from: f70.w0$d */
    /* JADX INFO: loaded from: classes6.dex */
    @InterfaceC32271e(m100429c = "com.whoop.activation.domain.interactors.activation.RemoteAccountInfoHelper", m100430f = "RemoteAccountInfoHelper.kt", m100431l = {55, 71, 95}, m100432m = "postAccountInfo", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class d extends AbstractC32269c {

        /* JADX INFO: renamed from: E */
        Object f51812E;

        /* JADX INFO: renamed from: F */
        Object f51813F;

        /* JADX INFO: renamed from: G */
        boolean f51814G;

        /* JADX INFO: renamed from: H */
        /* synthetic */ Object f51815H;

        /* JADX INFO: renamed from: J */
        int f51817J;

        /* JADX INFO: renamed from: w */
        Object f51818w;

        /* JADX INFO: renamed from: x */
        Object f51819x;

        /* JADX INFO: renamed from: y */
        Object f51820y;

        /* JADX INFO: renamed from: z */
        Object f51821z;

        public d(InterfaceC30057d<? super d> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f51815H = obj;
            this.f51817J |= Integer.MIN_VALUE;
            return C14213w0.this.m40635h(null, false, this);
        }
    }

    /* JADX INFO: renamed from: f70.w0$e */
    /* JADX INFO: loaded from: classes6.dex */
    @InterfaceC32271e(m100429c = "com.whoop.activation.domain.interactors.activation.RemoteAccountInfoHelper$postAccountInfo$result$1", m100430f = "RemoteAccountInfoHelper.kt", m100431l = {56}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, m65681d2 = {"<anonymous>", "Lcom/whoop/activation/domain/models/PostAccountInfoResponse;"}, m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class e extends AbstractC32275i implements Function1 {

        /* JADX INFO: renamed from: w */
        int f51822w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ String f51824y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ ActivationBody f51825z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(String str, ActivationBody activationBody, InterfaceC30057d<? super e> interfaceC30057d) {
            super(1, interfaceC30057d);
            this.f51824y = str;
            this.f51825z = activationBody;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(InterfaceC30057d<?> interfaceC30057d) {
            return C14213w0.this.new e(this.f51824y, this.f51825z, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f51822w;
            if (i13 != 0) {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
                return obj;
            }
            AbstractC34132o.m107864I(obj);
            ActivationAuthenticatedApi activationAuthenticatedApi = C14213w0.this.activationAuthenticatedApi;
            String str = this.f51824y;
            ActivationBody activationBody = this.f51825z;
            this.f51822w = 1;
            Object objPostAccountInfo = activationAuthenticatedApi.postAccountInfo(str, activationBody, this);
            return objPostAccountInfo == enumC31071a ? enumC31071a : objPostAccountInfo;
        }

        @Override // p715kotlin.jvm.functions.Function1
        public final Object invoke(InterfaceC30057d<? super PostAccountInfoResponse> interfaceC30057d) {
            return ((e) create(interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }
    }

    /* JADX INFO: renamed from: f70.w0$f */
    /* JADX INFO: loaded from: classes6.dex */
    @InterfaceC32271e(m100429c = "com.whoop.activation.domain.interactors.activation.RemoteAccountInfoHelper", m100430f = "RemoteAccountInfoHelper.kt", m100431l = {202}, m100432m = "upsertUserProfile", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class f extends AbstractC32269c {

        /* JADX INFO: renamed from: E */
        /* synthetic */ Object f51826E;

        /* JADX INFO: renamed from: G */
        int f51828G;

        /* JADX INFO: renamed from: w */
        Object f51829w;

        /* JADX INFO: renamed from: x */
        Object f51830x;

        /* JADX INFO: renamed from: y */
        Object f51831y;

        /* JADX INFO: renamed from: z */
        Object f51832z;

        public f(InterfaceC30057d<? super f> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f51826E = obj;
            this.f51828G |= Integer.MIN_VALUE;
            return C14213w0.this.m40636i(null, this);
        }
    }

    /* JADX INFO: renamed from: f70.w0$g */
    /* JADX INFO: loaded from: classes6.dex */
    @InterfaceC32271e(m100429c = "com.whoop.activation.domain.interactors.activation.RemoteAccountInfoHelper$upsertUserProfile$result$1", m100430f = "RemoteAccountInfoHelper.kt", m100431l = {203}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lpg3/v0;", "Ll83/a0;", "<anonymous>", "()Lpg3/v0;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class g extends AbstractC32275i implements Function1 {

        /* JADX INFO: renamed from: w */
        int f51833w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ String f51835y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ UpsertProfileBody f51836z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(String str, UpsertProfileBody upsertProfileBody, InterfaceC30057d<? super g> interfaceC30057d) {
            super(1, interfaceC30057d);
            this.f51835y = str;
            this.f51836z = upsertProfileBody;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(InterfaceC30057d<?> interfaceC30057d) {
            return C14213w0.this.new g(this.f51835y, this.f51836z, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f51833w;
            if (i13 != 0) {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
                return obj;
            }
            AbstractC34132o.m107864I(obj);
            ActivationAuthenticatedApi activationAuthenticatedApi = C14213w0.this.activationAuthenticatedApi;
            String str = this.f51835y;
            UpsertProfileBody upsertProfileBody = this.f51836z;
            this.f51833w = 1;
            Object objUpsertUserProfile = activationAuthenticatedApi.upsertUserProfile(str, upsertProfileBody, this);
            return objUpsertUserProfile == enumC31071a ? enumC31071a : objUpsertUserProfile;
        }

        @Override // p715kotlin.jvm.functions.Function1
        public final Object invoke(InterfaceC30057d<? super C29218v0<C23454a0>> interfaceC30057d) {
            return ((g) create(interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }
    }

    public C14213w0(ActivationAuthenticatedApi activationAuthenticatedApi, InterfaceC28954b whoopStrapInfoProvider, C14190l activationUserSessionCreator, InterfaceC41070a dateAndTimeProvider, C14205s0 navigateBackToCreditCardScreen, C17003c analyticsHelper, C14172c1 subscriptionErrorParser, FeatureFlagChecker featureFlagChecker, C27847j pendingUserSessionRepository, InterfaceC34116n logger) {
        AbstractC22676k.m65750j(activationAuthenticatedApi, "activationAuthenticatedApi");
        AbstractC22676k.m65750j(whoopStrapInfoProvider, "whoopStrapInfoProvider");
        AbstractC22676k.m65750j(activationUserSessionCreator, "activationUserSessionCreator");
        AbstractC22676k.m65750j(dateAndTimeProvider, "dateAndTimeProvider");
        AbstractC22676k.m65750j(navigateBackToCreditCardScreen, "navigateBackToCreditCardScreen");
        AbstractC22676k.m65750j(analyticsHelper, "analyticsHelper");
        AbstractC22676k.m65750j(subscriptionErrorParser, "subscriptionErrorParser");
        AbstractC22676k.m65750j(featureFlagChecker, "featureFlagChecker");
        AbstractC22676k.m65750j(pendingUserSessionRepository, "pendingUserSessionRepository");
        AbstractC22676k.m65750j(logger, "logger");
        this.activationAuthenticatedApi = activationAuthenticatedApi;
        this.whoopStrapInfoProvider = whoopStrapInfoProvider;
        this.activationUserSessionCreator = activationUserSessionCreator;
        this.dateAndTimeProvider = dateAndTimeProvider;
        this.navigateBackToCreditCardScreen = navigateBackToCreditCardScreen;
        this.analyticsHelper = analyticsHelper;
        this.subscriptionErrorParser = subscriptionErrorParser;
        this.featureFlagChecker = featureFlagChecker;
        this.pendingUserSessionRepository = pendingUserSessionRepository;
        this.logger = logger;
    }

    /* JADX INFO: renamed from: d */
    private final ActivationBody m40631d(InterfaceC14176e.b prevDomainResult) {
        String stripeToken = prevDomainResult.getMemberInfo().getStripeToken();
        String value = prevDomainResult.getMemberInfo().getCard().getCardZip().getValue();
        if (value.length() == 0) {
            value = null;
        }
        return new ActivationBody(stripeToken, value, prevDomainResult.getMemberInfo().getConsentsAccepted(), prevDomainResult.getMemberInfo().getMarketingOptIn(), prevDomainResult.getMemberInfo().getBillingFrequency(), prevDomainResult.getMemberInfo().getRecommendationOptIn());
    }

    /* JADX INFO: renamed from: e */
    private final C14178f m40632e(InterfaceC14176e.b bVar) {
        return new C14178f(InterfaceC14176e.b.m40416b(bVar, null, null, null, null, null, true, null, false, null, false, false, null, null, null, null, null, null, 131039, null), false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x0096, code lost:
    
        if (r14 == r1) goto L33;
     */
    /* JADX INFO: renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m40633f(u02.InterfaceC34385a.b<com.whoop.activation.domain.models.PostAccountInfoResponse> r11, f70.InterfaceC14176e.b r12, boolean r13, q83.InterfaceC30057d<? super f70.C14178f> r14) {
        /*
            r10 = this;
            boolean r0 = r14 instanceof f70.C14213w0.b
            if (r0 == 0) goto L13
            r0 = r14
            f70.w0$b r0 = (f70.C14213w0.b) r0
            int r1 = r0.f51799F
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f51799F = r1
            goto L18
        L13:
            f70.w0$b r0 = new f70.w0$b
            r0.<init>(r14)
        L18:
            java.lang.Object r14 = r0.f51803z
            r83.a r1 = r83.EnumC31071a.f128113w
            int r2 = r0.f51799F
            r3 = 0
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L47
            if (r2 == r5) goto L3b
            if (r2 != r4) goto L33
            java.lang.Object r11 = r0.f51801x
            f70.e$b r11 = (f70.InterfaceC14176e.b) r11
            java.lang.Object r11 = r0.f51800w
            u02.a$b r11 = (u02.InterfaceC34385a.b) r11
            p505ts.AbstractC34132o.m107864I(r14)
            goto L99
        L33:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r12 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r12)
            throw r11
        L3b:
            java.lang.Object r11 = r0.f51801x
            f70.e$b r11 = (f70.InterfaceC14176e.b) r11
            java.lang.Object r11 = r0.f51800w
            u02.a$b r11 = (u02.InterfaceC34385a.b) r11
            p505ts.AbstractC34132o.m107864I(r14)
            return r14
        L47:
            p505ts.AbstractC34132o.m107864I(r14)
            h80.c r14 = r10.analyticsHelper
            h80.b$a r2 = new h80.b$a
            java.lang.String r6 = "something_went_wrong"
            java.lang.String r7 = "permissions"
            java.lang.String r8 = "permissions_opt_in"
            java.lang.String r9 = "inline_error"
            r2.<init>(r8, r9, r6, r7)
            r14.m47941p(r2)
            boolean r14 = r11 instanceof u02.InterfaceC34385a.b.a
            if (r14 == 0) goto Lab
            u02.a$b$a r11 = (u02.InterfaceC34385a.b.a) r11
            int r14 = r11.getErrorCode()
            r2 = 400(0x190, float:5.6E-43)
            if (r14 == r2) goto La1
            r2 = 402(0x192, float:5.63E-43)
            r6 = 0
            if (r14 == r2) goto L88
            r2 = 450(0x1c2, float:6.3E-43)
            if (r14 == r2) goto L78
            f70.f r11 = r10.m40632e(r12)
            return r11
        L78:
            r0.f51800w = r6
            r0.f51801x = r6
            r0.f51802y = r13
            r0.f51799F = r5
            java.lang.Object r11 = r10.m40634g(r12, r11, r13, r0)
            if (r11 != r1) goto L87
            goto L98
        L87:
            return r11
        L88:
            f70.s0 r11 = r10.navigateBackToCreditCardScreen
            r0.f51800w = r6
            r0.f51801x = r6
            r0.f51802y = r13
            r0.f51799F = r4
            java.lang.Object r14 = r11.m40599b(r12, r13, r0)
            if (r14 != r1) goto L99
        L98:
            return r1
        L99:
            f70.e$b r14 = (f70.InterfaceC14176e.b) r14
            f70.f r11 = new f70.f
            r11.<init>(r14, r3)
            return r11
        La1:
            f70.f r11 = new f70.f
            f70.e$b r12 = s70.AbstractC32238a.m100307b()
            r11.<init>(r12, r3)
            return r11
        Lab:
            f70.f r11 = r10.m40632e(r12)
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: f70.C14213w0.m40633f(u02.a$b, f70.e$b, boolean, q83.d):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX INFO: renamed from: g */
    public final Object m40634g(InterfaceC14176e.b bVar, InterfaceC34385a.b.a<PostAccountInfoResponse> aVar, boolean z4, InterfaceC30057d<? super C14178f> interfaceC30057d) {
        c cVar;
        SubscriptionError subscriptionError;
        C29218v0 c29218v0;
        AbstractC34799a1 abstractC34799a1;
        if (interfaceC30057d instanceof c) {
            cVar = (c) interfaceC30057d;
            int i13 = cVar.f51807H;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                cVar.f51807H = i13 - Integer.MIN_VALUE;
            } else {
                cVar = new c(interfaceC30057d);
            }
        } else {
            cVar = new c(interfaceC30057d);
        }
        Object obj = cVar.f51805F;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = cVar.f51807H;
        if (i14 == 0) {
            AbstractC34132o.m107864I(obj);
            Exception exception = aVar.getException();
            HttpException httpException = exception instanceof HttpException ? (HttpException) exception : null;
            SubscriptionError subscriptionErrorM40368a = this.subscriptionErrorParser.m40368a((httpException == null || (c29218v0 = httpException.f128922y) == null || (abstractC34799a1 = c29218v0.f118271c) == null) ? null : abstractC34799a1.m109860m());
            if (subscriptionErrorM40368a != null) {
                this.analyticsHelper.m47937D(subscriptionErrorM40368a.getAnalyticsName());
            }
            C14205s0 c14205s0 = this.navigateBackToCreditCardScreen;
            cVar.f51808w = null;
            cVar.f51809x = null;
            cVar.f51810y = null;
            cVar.f51811z = subscriptionErrorM40368a;
            cVar.f51804E = z4;
            cVar.f51807H = 1;
            Object objM40599b = c14205s0.m40599b(bVar, z4, cVar);
            if (objM40599b == enumC31071a) {
                return enumC31071a;
            }
            subscriptionError = subscriptionErrorM40368a;
            obj = objM40599b;
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            SubscriptionError subscriptionError2 = (SubscriptionError) cVar.f51811z;
            AbstractC34132o.m107864I(obj);
            subscriptionError = subscriptionError2;
        }
        return new C14178f(InterfaceC14176e.b.m40416b((InterfaceC14176e.b) obj, null, null, null, null, null, false, null, false, null, false, false, subscriptionError, null, null, null, null, null, 129023, null), false);
    }

    /* JADX WARN: Code duplicated, block: B:50:0x0147  */
    /* JADX WARN: Code duplicated, block: B:52:0x0178  */
    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    /* JADX INFO: renamed from: h */
    public final Object m40635h(InterfaceC14176e.b bVar, boolean z4, InterfaceC30057d<? super C14178f> interfaceC30057d) {
        d dVar;
        String strapSignature;
        InterfaceC14176e.b bVar2;
        Object obj;
        boolean z13;
        InterfaceC14176e.b bVar3;
        if (interfaceC30057d instanceof d) {
            dVar = (d) interfaceC30057d;
            int i13 = dVar.f51817J;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                dVar.f51817J = i13 - Integer.MIN_VALUE;
            } else {
                dVar = new d(interfaceC30057d);
            }
        } else {
            dVar = new d(interfaceC30057d);
        }
        d dVar2 = dVar;
        Object obj2 = dVar2.f51815H;
        Object obj3 = EnumC31071a.f128113w;
        int i14 = dVar2.f51817J;
        if (i14 == 0) {
            AbstractC34132o.m107864I(obj2);
            if (AbstractC14184i.m40487c(bVar, this.pendingUserSessionRepository, this.featureFlagChecker, null, 4, null) == null) {
                return m40632e(bVar);
            }
            WhoopStrapInfo whoopStrapInfoMo87912a = this.whoopStrapInfoProvider.mo87912a();
            if (whoopStrapInfoMo87912a == null && !this.featureFlagChecker.isFeatureEnabled(OnboardingFeatureFlag.ACCOUNT_CREATION_SKIP_STRAP_INFO_CHECK)) {
                this.logger.mo85222m("postAccountInfo: no strap info and skip-strap-check flag is off, returning error case", new AbstractC30556a.a[0]);
                return m40632e(bVar);
            }
            if (whoopStrapInfoMo87912a == null || (strapSignature = whoopStrapInfoMo87912a.getStrapSignature()) == null) {
                strapSignature = "";
            }
            ActivationBody activationBodyM40631d = m40631d(bVar);
            InterfaceC34385a.Companion companion = InterfaceC34385a.INSTANCE;
            InterfaceC34116n interfaceC34116n = this.logger;
            e eVar = new e(strapSignature, activationBodyM40631d, null);
            bVar2 = bVar;
            dVar2.f51818w = bVar2;
            dVar2.f51819x = null;
            dVar2.f51820y = null;
            dVar2.f51821z = null;
            dVar2.f51814G = z4;
            dVar2.f51817J = 1;
            Object objM108729b = InterfaceC34385a.Companion.m108729b(companion, interfaceC34116n, null, "Failed to post account info", eVar, dVar2, 2, null);
            if (objM108729b != obj3) {
                obj = objM108729b;
                z13 = z4;
            }
            return obj3;
        }
        if (i14 == 1) {
            z13 = dVar2.f51814G;
            InterfaceC14176e.b bVar4 = (InterfaceC14176e.b) dVar2.f51818w;
            AbstractC34132o.m107864I(obj2);
            obj = obj2;
            bVar2 = bVar4;
        } else {
            if (i14 != 2) {
                if (i14 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj2);
                return obj2;
            }
            InterfaceC14176e.b bVar5 = (InterfaceC14176e.b) dVar2.f51813F;
            AbstractC34132o.m107864I(obj2);
            bVar3 = bVar5;
        }
        return ((AbstractC14188k) obj2) instanceof AbstractC14188k.b ? new C14178f(InterfaceC14176e.b.m40416b(bVar3, null, null, null, null, null, false, null, false, null, false, false, null, null, null, null, null, null, 131039, null), true) : new C14178f(InterfaceC14176e.b.m40416b(bVar3, null, new C26418e(0, 0, 0, null, new AbstractC26417d.a(ActivationFlowDestination.ENTER_YOUR_EMAIL, null, 2, null), 15, null), null, null, null, false, null, false, null, false, false, null, null, null, null, null, null, 131037, null), false);
        InterfaceC34385a interfaceC34385a = (InterfaceC34385a) obj;
        if (interfaceC34385a instanceof InterfaceC34385a.c) {
            if (!((PostAccountInfoResponse) ((InterfaceC34385a.c) interfaceC34385a).m108735a()).getSubscribed()) {
                return m40632e(bVar2);
            }
            InterfaceC14176e.b bVarM40485a = AbstractC14184i.m40485a(bVar2, this.pendingUserSessionRepository, this.featureFlagChecker);
            C14190l c14190l = this.activationUserSessionCreator;
            dVar2.f51818w = null;
            dVar2.f51819x = null;
            dVar2.f51820y = null;
            dVar2.f51821z = null;
            dVar2.f51812E = null;
            dVar2.f51813F = bVarM40485a;
            dVar2.f51814G = z13;
            dVar2.f51817J = 2;
            Object objM40505b = c14190l.m40505b(dVar2);
            if (objM40505b != obj3) {
                bVar3 = bVarM40485a;
                obj2 = objM40505b;
                if (((AbstractC14188k) obj2) instanceof AbstractC14188k.b) {
                }
            }
        } else {
            if (!(interfaceC34385a instanceof InterfaceC34385a.b)) {
                throw new NoWhenBranchMatchedException();
            }
            dVar2.f51818w = null;
            dVar2.f51819x = null;
            dVar2.f51820y = null;
            dVar2.f51821z = null;
            dVar2.f51812E = null;
            dVar2.f51814G = z13;
            dVar2.f51817J = 3;
            Object objM40633f = m40633f((InterfaceC34385a.b) interfaceC34385a, bVar2, z13, dVar2);
            if (objM40633f != obj3) {
                return objM40633f;
            }
        }
        return obj3;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    /* JADX INFO: renamed from: i */
    public final Object m40636i(InterfaceC14176e.b bVar, InterfaceC30057d<? super C14178f> interfaceC30057d) {
        f fVar;
        String strapSignature;
        LocalDate value;
        String string;
        String genderBaseline;
        String strName;
        InterfaceC14176e.b bVar2;
        if (interfaceC30057d instanceof f) {
            fVar = (f) interfaceC30057d;
            int i13 = fVar.f51828G;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                fVar.f51828G = i13 - Integer.MIN_VALUE;
            } else {
                fVar = new f(interfaceC30057d);
            }
        } else {
            fVar = new f(interfaceC30057d);
        }
        f fVar2 = fVar;
        Object objM108729b = fVar2.f51826E;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = fVar2.f51828G;
        if (i14 == 0) {
            AbstractC34132o.m107864I(objM108729b);
            if (AbstractC14184i.m40487c(bVar, this.pendingUserSessionRepository, this.featureFlagChecker, null, 4, null) == null) {
                return m40632e(bVar);
            }
            WhoopStrapInfo whoopStrapInfoMo87912a = this.whoopStrapInfoProvider.mo87912a();
            if (whoopStrapInfoMo87912a == null && !this.featureFlagChecker.isFeatureEnabled(OnboardingFeatureFlag.ACCOUNT_CREATION_SKIP_STRAP_INFO_CHECK)) {
                this.logger.mo85222m("upsertUserProfile: no strap info and skip-strap-check flag is off, returning error case", new AbstractC30556a.a[0]);
                return m40632e(bVar);
            }
            if (whoopStrapInfoMo87912a == null || (strapSignature = whoopStrapInfoMo87912a.getStrapSignature()) == null) {
                strapSignature = "";
            }
            Integer height = bVar.getMemberInfo().getHeight();
            if (height == null) {
                return m40632e(bVar);
            }
            int iIntValue = height.intValue();
            Integer weight = bVar.getMemberInfo().getWeight();
            if (weight == null) {
                return m40632e(bVar);
            }
            int iIntValue2 = weight.intValue();
            C11748b birthday = bVar.getMemberInfo().getBirthday();
            if (birthday == null || (value = birthday.getValue()) == null || (string = value.toString("yyyy-MM-dd")) == null) {
                return m40632e(bVar);
            }
            String gender = bVar.getMemberInfo().getGender();
            if (gender.length() != 0 && (genderBaseline = bVar.getMemberInfo().getGenderBaseline()) != null) {
                UnitSystem unitSystem = bVar.getMemberInfo().getUnitSystem();
                if (unitSystem == null || (strName = unitSystem.name()) == null) {
                    return m40632e(bVar);
                }
                String lowerCase = strName.toLowerCase(Locale.ROOT);
                AbstractC22676k.m65749i(lowerCase, "toLowerCase(...)");
                String strM85305c = AbstractC28184n0.m85305c(this.dateAndTimeProvider.mo133364c());
                AbstractC22676k.m65749i(strM85305c, "dateTimeZoneToUserOffset(...)");
                UpsertProfileBody upsertProfileBody = new UpsertProfileBody(iIntValue, iIntValue2, string, gender, genderBaseline, lowerCase, strM85305c);
                InterfaceC34385a.Companion companion = InterfaceC34385a.INSTANCE;
                InterfaceC34116n interfaceC34116n = this.logger;
                g gVar = new g(strapSignature, upsertProfileBody, null);
                bVar2 = bVar;
                fVar2.f51829w = bVar2;
                fVar2.f51830x = null;
                fVar2.f51831y = null;
                fVar2.f51832z = null;
                fVar2.f51828G = 1;
                objM108729b = InterfaceC34385a.Companion.m108729b(companion, interfaceC34116n, null, "Failed to upsert user profile", gVar, fVar2, 2, null);
                if (objM108729b == enumC31071a) {
                    return enumC31071a;
                }
            }
            return m40632e(bVar);
        }
        if (i14 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        InterfaceC14176e.b bVar3 = (InterfaceC14176e.b) fVar2.f51829w;
        AbstractC34132o.m107864I(objM108729b);
        bVar2 = bVar3;
        InterfaceC34385a interfaceC34385a = (InterfaceC34385a) objM108729b;
        if (interfaceC34385a instanceof InterfaceC34385a.c) {
            return new C14178f(InterfaceC14176e.b.m40416b(AbstractC14184i.m40485a(bVar2, this.pendingUserSessionRepository, this.featureFlagChecker), null, null, null, null, null, false, null, false, null, false, false, null, null, null, null, null, null, 131039, null), true);
        }
        if (interfaceC34385a instanceof InterfaceC34385a.b) {
            return AbstractC32238a.m100306a((InterfaceC34385a.b) interfaceC34385a) ? new C14178f(AbstractC32238a.m100307b(), false) : m40632e(bVar2);
        }
        throw new NoWhenBranchMatchedException();
    }

    public /* synthetic */ C14213w0(ActivationAuthenticatedApi activationAuthenticatedApi, InterfaceC28954b interfaceC28954b, C14190l c14190l, InterfaceC41070a interfaceC41070a, C14205s0 c14205s0, C17003c c17003c, C14172c1 c14172c1, FeatureFlagChecker featureFlagChecker, C27847j c27847j, InterfaceC34116n interfaceC34116n, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(activationAuthenticatedApi, interfaceC28954b, c14190l, interfaceC41070a, c14205s0, c17003c, c14172c1, featureFlagChecker, c27847j, (i13 & 512) != 0 ? InterfaceC34116n.INSTANCE.m107848a("RemoteAccountInfoHelper") : interfaceC34116n);
    }
}
