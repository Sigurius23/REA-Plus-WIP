package f70;

import com.whoop.activation.domain.ActivationAuthenticatedApi;
import com.whoop.activation.domain.interactors.activation.SubscriptionError;
import com.whoop.activation.domain.models.ActivationFlowStepModel;
import com.whoop.activation.domain.models.HwOnlyPermissionsBody;
import com.whoop.activation.domain.models.HwOnlyPermissionsResponse;
import com.whoop.activation.view.navigation.ActivationFlowDestination;
import com.whoop.data.repositories.FeatureFlagChecker;
import com.whoop.data.repositories.OnboardingFeatureFlag;
import com.whoop.design.models.DesignSystemModel;
import com.whoop.domain.model.WhoopStrapInfo;
import h80.C17003c;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import l83.C23454a0;
import n70.C26418e;
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
import s83.AbstractC32269c;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import tr2.InterfaceC34116n;
import u02.InterfaceC34385a;
import ud3.AbstractC34799a1;
import va3.AbstractC35854l;

/* JADX INFO: renamed from: f70.d0 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0001\u0018\u0000 42\u00020\u0001:\u0001)BI\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J,\u0010\u001b\u001a\u00020\u001a2\n\u0010\u0015\u001a\u0006\u0012\u0002\b\u00030\u00142\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u0018H\u0082@¢\u0006\u0004\b\u001b\u0010\u001cJ,\u0010\u001e\u001a\u00020\u001a2\n\u0010\u0015\u001a\u0006\u0012\u0002\b\u00030\u001d2\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u0018H\u0082@¢\u0006\u0004\b\u001e\u0010\u001fJ\u0013\u0010 \u001a\u00020\u001a*\u00020\u0016H\u0002¢\u0006\u0004\b \u0010!J\u001c\u0010%\u001a\u00020$2\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\"H\u0086@¢\u0006\u0004\b%\u0010&J \u0010'\u001a\u00020\u001a2\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u0018H\u0086@¢\u0006\u0004\b'\u0010(R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010/R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u00100R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u00101R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u00102R\u0014\u0010\u0011\u001a\u00020\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u00103¨\u00065"}, m65681d2 = {"Lf70/d0;", "", "Lcom/whoop/activation/domain/ActivationAuthenticatedApi;", "activationAuthenticatedApi", "Lp70/b;", "whoopStrapInfoProvider", "Lh80/c;", "analyticsHelper", "Lf70/c1;", "subscriptionErrorParser", "Lf70/s0;", "navigateBackToCreditCardScreen", "Lf70/l;", "activationUserSessionCreator", "Lcom/whoop/data/repositories/FeatureFlagChecker;", "ffChecker", "Ltr2/n;", "logger", "<init>", "(Lcom/whoop/activation/domain/ActivationAuthenticatedApi;Lp70/b;Lh80/c;Lf70/c1;Lf70/s0;Lf70/l;Lcom/whoop/data/repositories/FeatureFlagChecker;Ltr2/n;)V", "Lu02/a$b;", "result", "Lf70/e$b;", "prevDomainResult", "", "authenticated", "Lf70/f;", "f", "(Lu02/a$b;Lf70/e$b;ZLq83/d;)Ljava/lang/Object;", "Lu02/a$b$a;", "g", "(Lu02/a$b$a;Lf70/e$b;ZLq83/d;)Ljava/lang/Object;", "d", "(Lf70/e$b;)Lf70/f;", "Lf70/q0;", "memberInfo", "Lf70/e;", "e", "(Lf70/q0;Lq83/d;)Ljava/lang/Object;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "(Lf70/e$b;ZLq83/d;)Ljava/lang/Object;", "a", "Lcom/whoop/activation/domain/ActivationAuthenticatedApi;", "b", "Lp70/b;", "c", "Lh80/c;", "Lf70/c1;", "Lf70/s0;", "Lf70/l;", "Lcom/whoop/data/repositories/FeatureFlagChecker;", "Ltr2/n;", "i", "activation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C14174d0 {

    /* JADX INFO: renamed from: i */
    private static final a f51168i = new a(null);

    /* JADX INFO: renamed from: j */
    public static final int f51169j = 8;

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final ActivationAuthenticatedApi activationAuthenticatedApi;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final InterfaceC28954b whoopStrapInfoProvider;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final C17003c analyticsHelper;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final C14172c1 subscriptionErrorParser;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final C14205s0 navigateBackToCreditCardScreen;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final C14190l activationUserSessionCreator;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final FeatureFlagChecker ffChecker;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private final InterfaceC34116n logger;

    /* JADX INFO: renamed from: f70.d0$a */
    @Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, m65681d2 = {"Lf70/d0$a;", "", "<init>", "()V", "", "STRIPE_ERROR_CODE", "I", "SUBSCRIPTION_ERROR_CODE", "activation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private a() {
        }
    }

    /* JADX INFO: renamed from: f70.d0$b */
    /* JADX INFO: loaded from: classes6.dex */
    @InterfaceC32271e(m100429c = "com.whoop.activation.domain.interactors.activation.HwOnlyPermissionsHelper", m100430f = "HwOnlyPermissionsHelper.kt", m100431l = {31}, m100432m = "fetchHwOnlyPermissionsScreens", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b extends AbstractC32269c {

        /* JADX INFO: renamed from: E */
        int f51178E;

        /* JADX INFO: renamed from: w */
        Object f51179w;

        /* JADX INFO: renamed from: x */
        Object f51180x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f51181y;

        public b(InterfaceC30057d<? super b> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f51181y = obj;
            this.f51178E |= Integer.MIN_VALUE;
            return C14174d0.this.m40410e(null, this);
        }
    }

    /* JADX INFO: renamed from: f70.d0$c */
    /* JADX INFO: loaded from: classes6.dex */
    @InterfaceC32271e(m100429c = "com.whoop.activation.domain.interactors.activation.HwOnlyPermissionsHelper$fetchHwOnlyPermissionsScreens$response$1", m100430f = "HwOnlyPermissionsHelper.kt", m100431l = {32}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, m65681d2 = {"<anonymous>", "Lcom/whoop/activation/domain/models/HwOnlyPermissionsResponse;"}, m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c extends AbstractC32275i implements Function1 {

        /* JADX INFO: renamed from: w */
        int f51183w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ String f51185y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String str, InterfaceC30057d<? super c> interfaceC30057d) {
            super(1, interfaceC30057d);
            this.f51185y = str;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(InterfaceC30057d<?> interfaceC30057d) {
            return C14174d0.this.new c(this.f51185y, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f51183w;
            if (i13 != 0) {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
                return obj;
            }
            AbstractC34132o.m107864I(obj);
            ActivationAuthenticatedApi activationAuthenticatedApi = C14174d0.this.activationAuthenticatedApi;
            String str = this.f51185y;
            this.f51183w = 1;
            Object objFetchHwOnlyPermissions = activationAuthenticatedApi.fetchHwOnlyPermissions(str, this);
            return objFetchHwOnlyPermissions == enumC31071a ? enumC31071a : objFetchHwOnlyPermissions;
        }

        @Override // p715kotlin.jvm.functions.Function1
        public final Object invoke(InterfaceC30057d<? super HwOnlyPermissionsResponse> interfaceC30057d) {
            return ((c) create(interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }
    }

    /* JADX INFO: renamed from: f70.d0$d */
    /* JADX INFO: loaded from: classes6.dex */
    @InterfaceC32271e(m100429c = "com.whoop.activation.domain.interactors.activation.HwOnlyPermissionsHelper", m100430f = "HwOnlyPermissionsHelper.kt", m100431l = {114, 116}, m100432m = "handleSubmitHwOnlyPermissionsError", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class d extends AbstractC32269c {

        /* JADX INFO: renamed from: F */
        int f51187F;

        /* JADX INFO: renamed from: w */
        Object f51188w;

        /* JADX INFO: renamed from: x */
        Object f51189x;

        /* JADX INFO: renamed from: y */
        boolean f51190y;

        /* JADX INFO: renamed from: z */
        /* synthetic */ Object f51191z;

        public d(InterfaceC30057d<? super d> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f51191z = obj;
            this.f51187F |= Integer.MIN_VALUE;
            return C14174d0.this.m40408f(null, null, false, this);
        }
    }

    /* JADX INFO: renamed from: f70.d0$e */
    /* JADX INFO: loaded from: classes6.dex */
    @InterfaceC32271e(m100429c = "com.whoop.activation.domain.interactors.activation.HwOnlyPermissionsHelper", m100430f = "HwOnlyPermissionsHelper.kt", m100431l = {137}, m100432m = "handleSubscriptionStyleHwOnlyError", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class e extends AbstractC32269c {

        /* JADX INFO: renamed from: E */
        boolean f51192E;

        /* JADX INFO: renamed from: F */
        /* synthetic */ Object f51193F;

        /* JADX INFO: renamed from: H */
        int f51195H;

        /* JADX INFO: renamed from: w */
        Object f51196w;

        /* JADX INFO: renamed from: x */
        Object f51197x;

        /* JADX INFO: renamed from: y */
        Object f51198y;

        /* JADX INFO: renamed from: z */
        Object f51199z;

        public e(InterfaceC30057d<? super e> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f51193F = obj;
            this.f51195H |= Integer.MIN_VALUE;
            return C14174d0.this.m40409g(null, null, false, this);
        }
    }

    /* JADX INFO: renamed from: f70.d0$f */
    /* JADX INFO: loaded from: classes6.dex */
    @InterfaceC32271e(m100429c = "com.whoop.activation.domain.interactors.activation.HwOnlyPermissionsHelper", m100430f = "HwOnlyPermissionsHelper.kt", m100431l = {79, 85, 95}, m100432m = "submitHwOnlyPermissions", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class f extends AbstractC32269c {

        /* JADX INFO: renamed from: E */
        Object f51200E;

        /* JADX INFO: renamed from: F */
        boolean f51201F;

        /* JADX INFO: renamed from: G */
        /* synthetic */ Object f51202G;

        /* JADX INFO: renamed from: I */
        int f51204I;

        /* JADX INFO: renamed from: w */
        Object f51205w;

        /* JADX INFO: renamed from: x */
        Object f51206x;

        /* JADX INFO: renamed from: y */
        Object f51207y;

        /* JADX INFO: renamed from: z */
        Object f51208z;

        public f(InterfaceC30057d<? super f> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f51202G = obj;
            this.f51204I |= Integer.MIN_VALUE;
            return C14174d0.this.m40411h(null, false, this);
        }
    }

    /* JADX INFO: renamed from: f70.d0$g */
    /* JADX INFO: loaded from: classes6.dex */
    @InterfaceC32271e(m100429c = "com.whoop.activation.domain.interactors.activation.HwOnlyPermissionsHelper$submitHwOnlyPermissions$result$1", m100430f = "HwOnlyPermissionsHelper.kt", m100431l = {80}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m65681d2 = {"Ll83/a0;", "<anonymous>", "()V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class g extends AbstractC32275i implements Function1 {

        /* JADX INFO: renamed from: w */
        int f51209w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ String f51211y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ HwOnlyPermissionsBody f51212z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(String str, HwOnlyPermissionsBody hwOnlyPermissionsBody, InterfaceC30057d<? super g> interfaceC30057d) {
            super(1, interfaceC30057d);
            this.f51211y = str;
            this.f51212z = hwOnlyPermissionsBody;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(InterfaceC30057d<?> interfaceC30057d) {
            return C14174d0.this.new g(this.f51211y, this.f51212z, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f51209w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                ActivationAuthenticatedApi activationAuthenticatedApi = C14174d0.this.activationAuthenticatedApi;
                String str = this.f51211y;
                HwOnlyPermissionsBody hwOnlyPermissionsBody = this.f51212z;
                this.f51209w = 1;
                if (activationAuthenticatedApi.putHwOnlyPermissions(str, hwOnlyPermissionsBody, this) == enumC31071a) {
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

        @Override // p715kotlin.jvm.functions.Function1
        public final Object invoke(InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((g) create(interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }
    }

    public C14174d0(ActivationAuthenticatedApi activationAuthenticatedApi, InterfaceC28954b whoopStrapInfoProvider, C17003c analyticsHelper, C14172c1 subscriptionErrorParser, C14205s0 navigateBackToCreditCardScreen, C14190l activationUserSessionCreator, FeatureFlagChecker ffChecker, InterfaceC34116n logger) {
        AbstractC22676k.m65750j(activationAuthenticatedApi, "activationAuthenticatedApi");
        AbstractC22676k.m65750j(whoopStrapInfoProvider, "whoopStrapInfoProvider");
        AbstractC22676k.m65750j(analyticsHelper, "analyticsHelper");
        AbstractC22676k.m65750j(subscriptionErrorParser, "subscriptionErrorParser");
        AbstractC22676k.m65750j(navigateBackToCreditCardScreen, "navigateBackToCreditCardScreen");
        AbstractC22676k.m65750j(activationUserSessionCreator, "activationUserSessionCreator");
        AbstractC22676k.m65750j(ffChecker, "ffChecker");
        AbstractC22676k.m65750j(logger, "logger");
        this.activationAuthenticatedApi = activationAuthenticatedApi;
        this.whoopStrapInfoProvider = whoopStrapInfoProvider;
        this.analyticsHelper = analyticsHelper;
        this.subscriptionErrorParser = subscriptionErrorParser;
        this.navigateBackToCreditCardScreen = navigateBackToCreditCardScreen;
        this.activationUserSessionCreator = activationUserSessionCreator;
        this.ffChecker = ffChecker;
        this.logger = logger;
    }

    /* JADX INFO: renamed from: d */
    private final C14178f m40407d(InterfaceC14176e.b bVar) {
        return new C14178f(InterfaceC14176e.b.m40416b(bVar, null, null, null, null, null, true, null, false, null, false, false, null, null, null, null, null, null, 128991, null), false);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x0091, code lost:
    
        if (r13 == r1) goto L31;
     */
    /* JADX INFO: renamed from: f */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m40408f(u02.InterfaceC34385a.b<?> r10, f70.InterfaceC14176e.b r11, boolean r12, q83.InterfaceC30057d<? super f70.C14178f> r13) throws java.io.IOException {
        /*
            r9 = this;
            boolean r0 = r13 instanceof f70.C14174d0.d
            if (r0 == 0) goto L13
            r0 = r13
            f70.d0$d r0 = (f70.C14174d0.d) r0
            int r1 = r0.f51187F
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f51187F = r1
            goto L18
        L13:
            f70.d0$d r0 = new f70.d0$d
            r0.<init>(r13)
        L18:
            java.lang.Object r13 = r0.f51191z
            r83.a r1 = r83.EnumC31071a.f128113w
            int r2 = r0.f51187F
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L46
            if (r2 == r4) goto L3a
            if (r2 != r3) goto L32
            java.lang.Object r10 = r0.f51189x
            f70.e$b r10 = (f70.InterfaceC14176e.b) r10
            java.lang.Object r10 = r0.f51188w
            u02.a$b r10 = (u02.InterfaceC34385a.b) r10
            p505ts.AbstractC34132o.m107864I(r13)
            goto L94
        L32:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r11 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r11)
            throw r10
        L3a:
            java.lang.Object r10 = r0.f51189x
            f70.e$b r10 = (f70.InterfaceC14176e.b) r10
            java.lang.Object r10 = r0.f51188w
            u02.a$b r10 = (u02.InterfaceC34385a.b) r10
            p505ts.AbstractC34132o.m107864I(r13)
            return r13
        L46:
            p505ts.AbstractC34132o.m107864I(r13)
            h80.c r13 = r9.analyticsHelper
            h80.b$a r2 = new h80.b$a
            java.lang.String r5 = "something_went_wrong"
            java.lang.String r6 = "permissions"
            java.lang.String r7 = "permissions_opt_in"
            java.lang.String r8 = "inline_error"
            r2.<init>(r7, r8, r5, r6)
            r13.m47941p(r2)
            boolean r13 = r10 instanceof u02.InterfaceC34385a.b.a
            if (r13 == 0) goto L9d
            u02.a$b$a r10 = (u02.InterfaceC34385a.b.a) r10
            int r13 = r10.getErrorCode()
            r2 = 402(0x192, float:5.63E-43)
            r5 = 0
            if (r13 == r2) goto L83
            r2 = 450(0x1c2, float:6.3E-43)
            if (r13 == r2) goto L73
            f70.f r10 = r9.m40407d(r11)
            return r10
        L73:
            r0.f51188w = r5
            r0.f51189x = r5
            r0.f51190y = r12
            r0.f51187F = r4
            java.lang.Object r10 = r9.m40409g(r10, r11, r12, r0)
            if (r10 != r1) goto L82
            goto L93
        L82:
            return r10
        L83:
            f70.s0 r10 = r9.navigateBackToCreditCardScreen
            r0.f51188w = r5
            r0.f51189x = r5
            r0.f51190y = r12
            r0.f51187F = r3
            java.lang.Object r13 = r10.m40599b(r11, r12, r0)
            if (r13 != r1) goto L94
        L93:
            return r1
        L94:
            f70.e$b r13 = (f70.InterfaceC14176e.b) r13
            f70.f r10 = new f70.f
            r11 = 0
            r10.<init>(r13, r11)
            return r10
        L9d:
            f70.f r10 = r9.m40407d(r11)
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: f70.C14174d0.m40408f(u02.a$b, f70.e$b, boolean, q83.d):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX INFO: renamed from: g */
    public final Object m40409g(InterfaceC34385a.b.a<?> aVar, InterfaceC14176e.b bVar, boolean z4, InterfaceC30057d<? super C14178f> interfaceC30057d) throws IOException {
        e eVar;
        String strM109860m;
        SubscriptionError subscriptionError;
        C29218v0 c29218v0;
        AbstractC34799a1 abstractC34799a1;
        if (interfaceC30057d instanceof e) {
            eVar = (e) interfaceC30057d;
            int i13 = eVar.f51195H;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                eVar.f51195H = i13 - Integer.MIN_VALUE;
            } else {
                eVar = new e(interfaceC30057d);
            }
        } else {
            eVar = new e(interfaceC30057d);
        }
        Object obj = eVar.f51193F;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = eVar.f51195H;
        if (i14 == 0) {
            AbstractC34132o.m107864I(obj);
            Exception exception = aVar.getException();
            HttpException httpException = exception instanceof HttpException ? (HttpException) exception : null;
            if (httpException == null || (c29218v0 = httpException.f128922y) == null || (abstractC34799a1 = c29218v0.f118271c) == null) {
                strM109860m = null;
            } else {
                try {
                    strM109860m = abstractC34799a1.m109860m();
                    abstractC34799a1.close();
                } catch (Throwable th3) {
                    try {
                        throw th3;
                    } catch (Throwable th4) {
                        AbstractC35854l.m113829i(abstractC34799a1, th3);
                        throw th4;
                    }
                }
            }
            SubscriptionError subscriptionErrorM40368a = this.subscriptionErrorParser.m40368a(strM109860m);
            if (subscriptionErrorM40368a != null) {
                this.analyticsHelper.m47937D(subscriptionErrorM40368a.getAnalyticsName());
            }
            C14205s0 c14205s0 = this.navigateBackToCreditCardScreen;
            eVar.f51196w = null;
            eVar.f51197x = null;
            eVar.f51198y = null;
            eVar.f51199z = subscriptionErrorM40368a;
            eVar.f51192E = z4;
            eVar.f51195H = 1;
            Object objM40599b = c14205s0.m40599b(bVar, z4, eVar);
            if (objM40599b == enumC31071a) {
                return enumC31071a;
            }
            subscriptionError = subscriptionErrorM40368a;
            obj = objM40599b;
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            SubscriptionError subscriptionError2 = (SubscriptionError) eVar.f51199z;
            AbstractC34132o.m107864I(obj);
            subscriptionError = subscriptionError2;
        }
        return new C14178f(InterfaceC14176e.b.m40416b((InterfaceC14176e.b) obj, null, null, null, null, null, false, null, false, null, false, false, subscriptionError, null, null, null, null, null, 129023, null), false);
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    /* JADX INFO: renamed from: e */
    public final Object m40410e(C14201q0 c14201q0, InterfaceC30057d<? super InterfaceC14176e> interfaceC30057d) {
        b bVar;
        C14201q0 c14201q1;
        Object objM108729b;
        if (interfaceC30057d instanceof b) {
            bVar = (b) interfaceC30057d;
            int i13 = bVar.f51178E;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                bVar.f51178E = i13 - Integer.MIN_VALUE;
            } else {
                bVar = new b(interfaceC30057d);
            }
        } else {
            bVar = new b(interfaceC30057d);
        }
        b bVar2 = bVar;
        Object obj = bVar2.f51181y;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = bVar2.f51178E;
        if (i14 == 0) {
            AbstractC34132o.m107864I(obj);
            WhoopStrapInfo whoopStrapInfoMo87912a = this.whoopStrapInfoProvider.mo87912a();
            String strapSignature = whoopStrapInfoMo87912a != null ? whoopStrapInfoMo87912a.getStrapSignature() : null;
            InterfaceC34385a.Companion companion = InterfaceC34385a.INSTANCE;
            InterfaceC34116n interfaceC34116n = this.logger;
            c cVar = new c(strapSignature, null);
            c14201q1 = c14201q0;
            bVar2.f51179w = c14201q1;
            bVar2.f51180x = null;
            bVar2.f51178E = 1;
            objM108729b = InterfaceC34385a.Companion.m108729b(companion, interfaceC34116n, null, "Failed to fetch hardware only permissions screens", cVar, bVar2, 2, null);
            if (objM108729b == enumC31071a) {
                return enumC31071a;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C14201q0 c14201q2 = (C14201q0) bVar2.f51179w;
            AbstractC34132o.m107864I(obj);
            objM108729b = obj;
            c14201q1 = c14201q2;
        }
        InterfaceC34385a interfaceC34385a = (InterfaceC34385a) objM108729b;
        if (!(interfaceC34385a instanceof InterfaceC34385a.c)) {
            if (interfaceC34385a instanceof InterfaceC34385a.b) {
                return new InterfaceC14176e.b(null, null, null, null, EnumC14168b0.ERROR, false, null, false, null, false, false, null, null, null, null, null, null, 131055, null);
            }
            throw new NoWhenBranchMatchedException();
        }
        InterfaceC34385a.c cVar2 = (InterfaceC34385a.c) interfaceC34385a;
        List<DesignSystemModel> items = ((HwOnlyPermissionsResponse) cVar2.m108735a()).getItems();
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : items) {
            if (obj2 instanceof ActivationFlowStepModel) {
                arrayList.add(obj2);
            }
        }
        if (arrayList.isEmpty()) {
            this.logger.mo85222m("Hardware only permissions BFF returned an empty list of screens", new AbstractC30556a.a[0]);
            return new InterfaceC14176e.b(null, null, null, null, EnumC14168b0.ERROR, false, null, false, null, false, false, null, null, null, null, null, null, 131055, null);
        }
        this.analyticsHelper.m47938F(((HwOnlyPermissionsResponse) cVar2.m108735a()).getEventProperties());
        return new InterfaceC14176e.b(arrayList, new C26418e(0, arrayList.size(), 0, ActivationFlowDestination.HW_ONLY_PERMISSIONS, null), null, c14201q1 == null ? new C14201q0(null, null, null, null, null, null, null, null, false, false, false, null, null, null, null, null, null, null, null, false, false, false, null, null, null, null, 0, false, false, false, 1073741823, null) : c14201q1, EnumC14168b0.CONTENT, false, null, false, null, false, false, null, null, null, null, null, ((HwOnlyPermissionsResponse) cVar2.m108735a()).getOnComplete(), 65508, null);
    }

    /* JADX WARN: Code duplicated, block: B:39:0x0108  */
    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    /* JADX WARN: Instruction removed from duplicated block: B:39:0x0108, please report this as an issue */
    /* JADX INFO: renamed from: h */
    public final Object m40411h(InterfaceC14176e.b bVar, boolean z4, InterfaceC30057d<? super C14178f> interfaceC30057d) throws IOException {
        f fVar;
        InterfaceC14176e.b bVar2;
        boolean z13;
        InterfaceC14176e.b bVar3;
        InterfaceC14176e.b bVar4;
        AbstractC14188k abstractC14188k;
        if (interfaceC30057d instanceof f) {
            fVar = (f) interfaceC30057d;
            int i13 = fVar.f51204I;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                fVar.f51204I = i13 - Integer.MIN_VALUE;
            } else {
                fVar = new f(interfaceC30057d);
            }
        } else {
            fVar = new f(interfaceC30057d);
        }
        f fVar2 = fVar;
        Object objM108729b = fVar2.f51202G;
        Object obj = EnumC31071a.f128113w;
        int i14 = fVar2.f51204I;
        if (i14 == 0) {
            AbstractC34132o.m107864I(objM108729b);
            String stripeToken = bVar.getMemberInfo().getStripeToken();
            WhoopStrapInfo whoopStrapInfoMo87912a = this.whoopStrapInfoProvider.mo87912a();
            String strapSignature = whoopStrapInfoMo87912a != null ? whoopStrapInfoMo87912a.getStrapSignature() : null;
            HwOnlyPermissionsBody hwOnlyPermissionsBody = new HwOnlyPermissionsBody(bVar.getMemberInfo().getConsentsAccepted(), bVar.getMemberInfo().getMarketingOptIn(), stripeToken);
            InterfaceC34385a.Companion companion = InterfaceC34385a.INSTANCE;
            InterfaceC34116n interfaceC34116n = this.logger;
            g gVar = new g(strapSignature, hwOnlyPermissionsBody, null);
            bVar2 = bVar;
            fVar2.f51205w = bVar2;
            fVar2.f51206x = null;
            fVar2.f51207y = null;
            fVar2.f51208z = null;
            fVar2.f51201F = z4;
            fVar2.f51204I = 1;
            objM108729b = InterfaceC34385a.Companion.m108729b(companion, interfaceC34116n, null, "Failed to submit hardware only permissions", gVar, fVar2, 2, null);
            if (objM108729b != obj) {
                z13 = z4;
            }
            return obj;
        }
        if (i14 == 1) {
            z13 = fVar2.f51201F;
            InterfaceC14176e.b bVar5 = (InterfaceC14176e.b) fVar2.f51205w;
            AbstractC34132o.m107864I(objM108729b);
            bVar2 = bVar5;
        } else {
            if (i14 != 2) {
                if (i14 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(objM108729b);
                return objM108729b;
            }
            bVar4 = (InterfaceC14176e.b) fVar2.f51205w;
            AbstractC34132o.m107864I(objM108729b);
        }
        abstractC14188k = (AbstractC14188k) objM108729b;
        if (abstractC14188k instanceof AbstractC14188k.a) {
            this.logger.mo85222m("Failed to bootstrap session after HwOnly checkout: " + ((AbstractC14188k.a) abstractC14188k).getReason(), new AbstractC30556a.a[0]);
        }
        bVar3 = bVar4;
        return new C14178f(InterfaceC14176e.b.m40416b(bVar3, null, null, null, null, null, false, null, false, null, false, false, null, null, null, null, null, null, 128991, null), true);
        InterfaceC34385a interfaceC34385a = (InterfaceC34385a) objM108729b;
        if (interfaceC34385a instanceof InterfaceC34385a.c) {
            if (z13 && this.ffChecker.isFeatureEnabled(OnboardingFeatureFlag.HW_ONLY_BOOTSTRAP_SESSION_ANDROID)) {
                C14190l c14190l = this.activationUserSessionCreator;
                fVar2.f51205w = bVar2;
                fVar2.f51206x = null;
                fVar2.f51207y = null;
                fVar2.f51208z = null;
                fVar2.f51200E = null;
                fVar2.f51201F = z13;
                fVar2.f51204I = 2;
                objM108729b = c14190l.m40505b(fVar2);
                if (objM108729b != obj) {
                    bVar4 = bVar2;
                    abstractC14188k = (AbstractC14188k) objM108729b;
                    if (abstractC14188k instanceof AbstractC14188k.a) {
                        this.logger.mo85222m("Failed to bootstrap session after HwOnly checkout: " + ((AbstractC14188k.a) abstractC14188k).getReason(), new AbstractC30556a.a[0]);
                    }
                    bVar3 = bVar4;
                }
            } else {
                bVar3 = bVar2;
            }
            return new C14178f(InterfaceC14176e.b.m40416b(bVar3, null, null, null, null, null, false, null, false, null, false, false, null, null, null, null, null, null, 128991, null), true);
        }
        if (!(interfaceC34385a instanceof InterfaceC34385a.b)) {
            throw new NoWhenBranchMatchedException();
        }
        fVar2.f51205w = null;
        fVar2.f51206x = null;
        fVar2.f51207y = null;
        fVar2.f51208z = null;
        fVar2.f51200E = null;
        fVar2.f51201F = z13;
        fVar2.f51204I = 3;
        Object objM40408f = m40408f((InterfaceC34385a.b) interfaceC34385a, bVar2, z13, fVar2);
        if (objM40408f != obj) {
            return objM40408f;
        }
        return obj;
    }

    public /* synthetic */ C14174d0(ActivationAuthenticatedApi activationAuthenticatedApi, InterfaceC28954b interfaceC28954b, C17003c c17003c, C14172c1 c14172c1, C14205s0 c14205s0, C14190l c14190l, FeatureFlagChecker featureFlagChecker, InterfaceC34116n interfaceC34116n, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(activationAuthenticatedApi, interfaceC28954b, c17003c, c14172c1, c14205s0, c14190l, featureFlagChecker, (i13 & 128) != 0 ? InterfaceC34116n.INSTANCE.m107848a("HwOnlyPermissionsHelper") : interfaceC34116n);
    }
}
