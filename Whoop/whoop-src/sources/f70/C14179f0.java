package f70;

import androidx.core.app.NotificationCompat;
import b80.C2792c;
import b80.EnumC2790a;
import b80.EnumC2791b;
import com.whoop.activation.domain.ActivationApi;
import com.whoop.activation.domain.models.ActivationFlowStepModel;
import com.whoop.activation.domain.models.EmailCheckRequest;
import com.whoop.activation.domain.models.EmailCheckResponse;
import com.whoop.activation.domain.models.EmailDialogInfo;
import com.whoop.activation.domain.models.steps.EnterEmailStepModel;
import com.whoop.activation.iajf.domain.SignUpSource;
import h80.C17003c;
import h80.InterfaceC17002b;
import java.util.ArrayList;
import java.util.List;
import l83.C23454a0;
import m83.AbstractC25265s;
import p505ts.AbstractC34132o;
import p70.InterfaceC28954b;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import tr2.InterfaceC34116n;
import u02.InterfaceC34385a;

/* JADX INFO: renamed from: f70.f0 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\b\u0001\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ/\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J0\u0010\u001b\u001a\u00020\u00162\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u0014H\u0086@¢\u0006\u0004\b\u001b\u0010\u001cJ\u0015\u0010\u001f\u001a\u00020\u001d2\u0006\u0010\u001e\u001a\u00020\u001d¢\u0006\u0004\b\u001f\u0010 J\u0015\u0010\"\u001a\u00020\u00162\u0006\u0010\u001e\u001a\u00020!¢\u0006\u0004\b\"\u0010#R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010&R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010'R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010(R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010)¨\u0006*"}, m65681d2 = {"Lf70/f0;", "", "Lcom/whoop/activation/domain/ActivationApi;", "activationApi", "Lp70/b;", "whoopStrapInfoProvider", "Lh80/c;", "analyticsHelper", "Lb80/c;", "iajfAnalyticsHelper", "Ltr2/n;", "logger", "<init>", "(Lcom/whoop/activation/domain/ActivationApi;Lp70/b;Lh80/c;Lb80/c;Ltr2/n;)V", "Lcom/whoop/activation/domain/models/EmailCheckResponse;", "emailCheckResponse", "Lcom/whoop/activation/domain/models/steps/EnterEmailStepModel;", "currentScreen", "Lf70/q0;", "memberInfo", "Lcom/whoop/activation/iajf/domain/SignUpSource;", "signUpSource", "Lf70/g0;", "d", "(Lcom/whoop/activation/domain/models/EmailCheckResponse;Lcom/whoop/activation/domain/models/steps/EnterEmailStepModel;Lf70/q0;Lcom/whoop/activation/iajf/domain/SignUpSource;)Lf70/g0;", "", NotificationCompat.CATEGORY_EMAIL, "b", "(Ljava/lang/String;Lcom/whoop/activation/domain/models/steps/EnterEmailStepModel;Lf70/q0;Lcom/whoop/activation/iajf/domain/SignUpSource;Lq83/d;)Ljava/lang/Object;", "Lf70/e;", "prevDomainResult", "c", "(Lf70/e;)Lf70/e;", "Lf70/e$b;", "e", "(Lf70/e$b;)Lf70/g0;", "a", "Lcom/whoop/activation/domain/ActivationApi;", "Lp70/b;", "Lh80/c;", "Lb80/c;", "Ltr2/n;", "activation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C14179f0 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final ActivationApi activationApi;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final InterfaceC28954b whoopStrapInfoProvider;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final C17003c analyticsHelper;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final C2792c iajfAnalyticsHelper;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final InterfaceC34116n logger;

    /* JADX INFO: renamed from: f70.f0$a */
    /* JADX INFO: loaded from: classes6.dex */
    @InterfaceC32271e(m100429c = "com.whoop.activation.domain.interactors.activation.IAJFEmailCheckHelper", m100430f = "IAJFEmailCheckHelper.kt", m100431l = {45}, m100432m = "checkEmail", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a extends AbstractC32269c {

        /* JADX INFO: renamed from: E */
        /* synthetic */ Object f51257E;

        /* JADX INFO: renamed from: G */
        int f51259G;

        /* JADX INFO: renamed from: w */
        Object f51260w;

        /* JADX INFO: renamed from: x */
        Object f51261x;

        /* JADX INFO: renamed from: y */
        Object f51262y;

        /* JADX INFO: renamed from: z */
        Object f51263z;

        public a(InterfaceC30057d<? super a> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f51257E = obj;
            this.f51259G |= Integer.MIN_VALUE;
            return C14179f0.this.m40445b(null, null, null, null, this);
        }
    }

    /* JADX INFO: renamed from: f70.f0$b */
    /* JADX INFO: loaded from: classes6.dex */
    @InterfaceC32271e(m100429c = "com.whoop.activation.domain.interactors.activation.IAJFEmailCheckHelper$checkEmail$response$1", m100430f = "IAJFEmailCheckHelper.kt", m100431l = {46}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, m65681d2 = {"<anonymous>", "Lcom/whoop/activation/domain/models/EmailCheckResponse;"}, m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b extends AbstractC32275i implements Function1 {

        /* JADX INFO: renamed from: w */
        int f51264w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ String f51266y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str, InterfaceC30057d<? super b> interfaceC30057d) {
            super(1, interfaceC30057d);
            this.f51266y = str;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(InterfaceC30057d<?> interfaceC30057d) {
            return C14179f0.this.new b(this.f51266y, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f51264w;
            if (i13 != 0) {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
                return obj;
            }
            AbstractC34132o.m107864I(obj);
            ActivationApi activationApi = C14179f0.this.activationApi;
            EmailCheckRequest emailCheckRequest = new EmailCheckRequest(this.f51266y);
            this.f51264w = 1;
            Object objCheckEmail = activationApi.checkEmail(emailCheckRequest, this);
            return objCheckEmail == enumC31071a ? enumC31071a : objCheckEmail;
        }

        @Override // p715kotlin.jvm.functions.Function1
        public final Object invoke(InterfaceC30057d<? super EmailCheckResponse> interfaceC30057d) {
            return ((b) create(interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }
    }

    public C14179f0(ActivationApi activationApi, InterfaceC28954b whoopStrapInfoProvider, C17003c analyticsHelper, C2792c iajfAnalyticsHelper, InterfaceC34116n logger) {
        AbstractC22676k.m65750j(activationApi, "activationApi");
        AbstractC22676k.m65750j(whoopStrapInfoProvider, "whoopStrapInfoProvider");
        AbstractC22676k.m65750j(analyticsHelper, "analyticsHelper");
        AbstractC22676k.m65750j(iajfAnalyticsHelper, "iajfAnalyticsHelper");
        AbstractC22676k.m65750j(logger, "logger");
        this.activationApi = activationApi;
        this.whoopStrapInfoProvider = whoopStrapInfoProvider;
        this.analyticsHelper = analyticsHelper;
        this.iajfAnalyticsHelper = iajfAnalyticsHelper;
        this.logger = logger;
    }

    /* JADX INFO: renamed from: d */
    private final InterfaceC14181g0 m40444d(EmailCheckResponse emailCheckResponse, EnterEmailStepModel currentScreen, C14201q0 memberInfo, SignUpSource signUpSource) {
        if (emailCheckResponse.getDialogInfo() != null) {
            this.iajfAnalyticsHelper.m7941i(memberInfo.getMarketingOptIn(), signUpSource);
            return new InterfaceC14181g0.d(EmailDialogInfo.copy$default(emailCheckResponse.getDialogInfo(), null, null, null, null, null, emailCheckResponse.getValid(), 31, null), memberInfo);
        }
        if (emailCheckResponse.getValid()) {
            this.iajfAnalyticsHelper.m7942j(EnumC2791b.NEW, memberInfo.getAndroidx.core.app.NotificationCompat.CATEGORY_EMAIL java.lang.String().getValue(), memberInfo.getMarketingOptIn(), signUpSource);
            return new InterfaceC14181g0.c(memberInfo);
        }
        this.iajfAnalyticsHelper.m7942j(EnumC2791b.EXISTING, memberInfo.getAndroidx.core.app.NotificationCompat.CATEGORY_EMAIL java.lang.String().getValue(), memberInfo.getMarketingOptIn(), signUpSource);
        return new InterfaceC14181g0.b(memberInfo);
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX INFO: renamed from: b */
    public final Object m40445b(String str, EnterEmailStepModel enterEmailStepModel, C14201q0 c14201q0, SignUpSource signUpSource, InterfaceC30057d<? super InterfaceC14181g0> interfaceC30057d) {
        a aVar;
        if (interfaceC30057d instanceof a) {
            aVar = (a) interfaceC30057d;
            int i13 = aVar.f51259G;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                aVar.f51259G = i13 - Integer.MIN_VALUE;
            } else {
                aVar = new a(interfaceC30057d);
            }
        } else {
            aVar = new a(interfaceC30057d);
        }
        a aVar2 = aVar;
        Object objM108729b = aVar2.f51257E;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = aVar2.f51259G;
        if (i14 == 0) {
            AbstractC34132o.m107864I(objM108729b);
            InterfaceC34385a.Companion companion = InterfaceC34385a.INSTANCE;
            InterfaceC34116n interfaceC34116n = this.logger;
            b bVar = new b(str, null);
            aVar2.f51260w = null;
            aVar2.f51261x = enterEmailStepModel;
            aVar2.f51262y = c14201q0;
            aVar2.f51263z = signUpSource;
            aVar2.f51259G = 1;
            objM108729b = InterfaceC34385a.Companion.m108729b(companion, interfaceC34116n, null, "Failed to check email", bVar, aVar2, 2, null);
            if (objM108729b == enumC31071a) {
                return enumC31071a;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            signUpSource = (SignUpSource) aVar2.f51263z;
            c14201q0 = (C14201q0) aVar2.f51262y;
            enterEmailStepModel = (EnterEmailStepModel) aVar2.f51261x;
            AbstractC34132o.m107864I(objM108729b);
        }
        InterfaceC34385a interfaceC34385a = (InterfaceC34385a) objM108729b;
        if (interfaceC34385a instanceof InterfaceC34385a.c) {
            return m40444d((EmailCheckResponse) ((InterfaceC34385a.c) interfaceC34385a).m108735a(), enterEmailStepModel, c14201q0, signUpSource);
        }
        if (interfaceC34385a instanceof InterfaceC34385a.b) {
            return new InterfaceC14181g0.a(c14201q0);
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: renamed from: c */
    public final InterfaceC14176e m40446c(InterfaceC14176e prevDomainResult) {
        AbstractC22676k.m65750j(prevDomainResult, "prevDomainResult");
        if (!(prevDomainResult instanceof InterfaceC14176e.b)) {
            return prevDomainResult;
        }
        InterfaceC14176e.b bVar = (InterfaceC14176e.b) prevDomainResult;
        List<ActivationFlowStepModel> listM40428m = bVar.m40428m();
        if (listM40428m != null) {
            int currentStepIndex = bVar.getAndroidx.core.app.NotificationCompat.CATEGORY_PROGRESS java.lang.String().getCurrentStepIndex();
            ActivationFlowStepModel activationFlowStepModel = listM40428m.get(currentStepIndex);
            if (activationFlowStepModel instanceof EnterEmailStepModel) {
                EnterEmailStepModel enterEmailStepModel = (EnterEmailStepModel) activationFlowStepModel;
                if (enterEmailStepModel.getDialogInfo() != null) {
                    this.analyticsHelper.m47941p(new InterfaceC17002b.i(enterEmailStepModel.getAnalyticsName(), null, null, "update_email", "authentication", null, 38, null));
                    this.iajfAnalyticsHelper.m7940h(EnumC2790a.UPDATE_EMAIL, bVar.getMemberInfo().getMarketingOptIn(), bVar.getSignUpSource());
                    EnterEmailStepModel enterEmailStepModelCopy$default = EnterEmailStepModel.copy$default(enterEmailStepModel, null, null, null, null, null, null, null, null, null, null, null, 2031, null);
                    ArrayList arrayListM74097F1 = AbstractC25265s.m74097F1(listM40428m);
                    arrayListM74097F1.set(currentStepIndex, enterEmailStepModelCopy$default);
                    return InterfaceC14176e.b.m40416b(bVar, arrayListM74097F1, null, null, null, null, false, null, false, null, false, false, null, null, null, null, null, null, 131070, null);
                }
            }
        }
        return bVar;
    }

    /* JADX INFO: renamed from: e */
    public final InterfaceC14181g0 m40447e(InterfaceC14176e.b prevDomainResult) {
        AbstractC22676k.m65750j(prevDomainResult, "prevDomainResult");
        List<ActivationFlowStepModel> listM40428m = prevDomainResult.m40428m();
        ActivationFlowStepModel activationFlowStepModel = listM40428m != null ? listM40428m.get(prevDomainResult.getAndroidx.core.app.NotificationCompat.CATEGORY_PROGRESS java.lang.String().getCurrentStepIndex()) : null;
        if (!(activationFlowStepModel instanceof EnterEmailStepModel)) {
            return new InterfaceC14181g0.a(prevDomainResult.getMemberInfo());
        }
        EnterEmailStepModel enterEmailStepModel = (EnterEmailStepModel) activationFlowStepModel;
        this.analyticsHelper.m47941p(new InterfaceC17002b.i(enterEmailStepModel.getAnalyticsName(), null, null, "ignore", "authentication", null, 38, null));
        this.iajfAnalyticsHelper.m7940h(EnumC2790a.IGNORE, prevDomainResult.getMemberInfo().getMarketingOptIn(), prevDomainResult.getSignUpSource());
        EmailDialogInfo dialogInfo = enterEmailStepModel.getDialogInfo();
        if (dialogInfo == null) {
            return new InterfaceC14181g0.a(prevDomainResult.getMemberInfo());
        }
        return !dialogInfo.getOriginalValid() ? new InterfaceC14181g0.b(prevDomainResult.getMemberInfo()) : new InterfaceC14181g0.c(prevDomainResult.getMemberInfo());
    }

    public /* synthetic */ C14179f0(ActivationApi activationApi, InterfaceC28954b interfaceC28954b, C17003c c17003c, C2792c c2792c, InterfaceC34116n interfaceC34116n, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(activationApi, interfaceC28954b, c17003c, c2792c, (i13 & 16) != 0 ? InterfaceC34116n.INSTANCE.m107848a("IAJFEmailCheckHelper") : interfaceC34116n);
    }
}
