package f70;

import com.whoop.activation.domain.ActivationApi;
import com.whoop.activation.domain.ActivationAuthenticatedApi;
import com.whoop.activation.domain.models.ActivationFlowCountry;
import com.whoop.activation.domain.models.ActivationFlowCreateAccountResponse;
import com.whoop.activation.domain.models.ActivationFlowStepModel;
import com.whoop.activation.iajf.domain.SignUpSource;
import com.whoop.activation.view.navigation.ActivationFlowDestination;
import com.whoop.data.datastore.EmailDataStoreHelper;
import com.whoop.data.repositories.FeatureFlagChecker;
import com.whoop.data.repositories.OnboardingFeatureFlag;
import com.whoop.design.models.DesignSystemModel;
import com.whoop.domain.model.WhoopStrapInfo;
import com.whoop.service.network.model.PasswordRequirement;
import h80.C17003c;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.util.ArrayList;
import java.util.List;
import l83.C23454a0;
import m83.C25271y;
import n70.C26418e;
import od1.C27847j;
import p505ts.AbstractC34132o;
import p70.InterfaceC28954b;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.InterfaceC30057d;
import qr2.AbstractC30556a;
import r83.EnumC31071a;
import s70.AbstractC32238a;
import s83.AbstractC32269c;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import tr2.InterfaceC34116n;
import u02.InterfaceC34385a;
import wn0.AbstractC37410a;
import wn0.C37411b;

/* JADX INFO: renamed from: f70.b */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0012\b\u0001\u0018\u00002\u00020\u0001BU\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\b\b\u0002\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0014\u0010\u0015JC\u0010\u001f\u001a\u00020\u001b2\u000e\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u00162\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u00162\u0006\u0010\u001c\u001a\u00020\u001b2\f\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001d0\u0016H\u0002¢\u0006\u0004\b\u001f\u0010 J\u0018\u0010!\u001a\u00020\u001b2\u0006\u0010\u001c\u001a\u00020\u001bH\u0086@¢\u0006\u0004\b!\u0010\"J\u0012\u0010$\u001a\u0004\u0018\u00010#H\u0087@¢\u0006\u0004\b$\u0010%R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010*R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010+R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010,R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100R\u0016\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102R\u0014\u0010\u0013\u001a\u00020\u00128\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00104¨\u00065"}, m65681d2 = {"Lf70/b;", "", "Lcom/whoop/activation/domain/ActivationApi;", "activationApi", "Lcom/whoop/activation/domain/ActivationAuthenticatedApi;", "activationAuthenticatedApi", "Lod1/j;", "pendingUserSessionRepository", "Lp70/b;", "whoopStrapInfoProvider", "Lcom/whoop/data/datastore/EmailDataStoreHelper;", "emailDataStoreHelper", "Lwn0/b;", "passwordRequirementsFetcher", "Lcom/whoop/data/repositories/FeatureFlagChecker;", "featureFlagChecker", "Lh80/c;", "analyticsHelper", "Ltr2/n;", "logger", "<init>", "(Lcom/whoop/activation/domain/ActivationApi;Lcom/whoop/activation/domain/ActivationAuthenticatedApi;Lod1/j;Lp70/b;Lcom/whoop/data/datastore/EmailDataStoreHelper;Lwn0/b;Lcom/whoop/data/repositories/FeatureFlagChecker;Lh80/c;Ltr2/n;)V", "", "Lcom/whoop/activation/domain/models/ActivationFlowCountry;", "countries", "Lcom/whoop/activation/domain/models/ActivationFlowStepModel;", "items", "Lf70/e;", "prevDomainResult", "Lcom/whoop/service/network/model/PasswordRequirement;", "passwordRequirements", "c", "(Ljava/util/List;Ljava/util/List;Lf70/e;Ljava/util/List;)Lf70/e;", "d", "(Lf70/e;Lq83/d;)Ljava/lang/Object;", "", "e", "(Lq83/d;)Ljava/lang/Object;", "a", "Lcom/whoop/activation/domain/ActivationApi;", "b", "Lcom/whoop/activation/domain/ActivationAuthenticatedApi;", "Lod1/j;", "Lp70/b;", "Lcom/whoop/data/datastore/EmailDataStoreHelper;", "f", "Lwn0/b;", "g", "Lcom/whoop/data/repositories/FeatureFlagChecker;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "Lh80/c;", "i", "Ltr2/n;", "activation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C14167b {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final ActivationApi activationApi;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final ActivationAuthenticatedApi activationAuthenticatedApi;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final C27847j pendingUserSessionRepository;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final InterfaceC28954b whoopStrapInfoProvider;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final EmailDataStoreHelper emailDataStoreHelper;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final C37411b passwordRequirementsFetcher;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final FeatureFlagChecker featureFlagChecker;

    /* JADX INFO: renamed from: h, reason: from kotlin metadata */
    private final C17003c analyticsHelper;

    /* JADX INFO: renamed from: i, reason: from kotlin metadata */
    private final InterfaceC34116n logger;

    /* JADX INFO: renamed from: f70.b$a */
    /* JADX INFO: loaded from: classes6.dex */
    @InterfaceC32271e(m100429c = "com.whoop.activation.domain.interactors.activation.AccountCreationScreensHelper", m100430f = "AccountCreationScreensHelper.kt", m100431l = {53, 60, 68}, m100432m = "fetchAccountCreationScreens", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a extends AbstractC32269c {

        /* JADX INFO: renamed from: E */
        /* synthetic */ Object f51065E;

        /* JADX INFO: renamed from: G */
        int f51067G;

        /* JADX INFO: renamed from: w */
        Object f51068w;

        /* JADX INFO: renamed from: x */
        Object f51069x;

        /* JADX INFO: renamed from: y */
        Object f51070y;

        /* JADX INFO: renamed from: z */
        int f51071z;

        public a(InterfaceC30057d<? super a> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f51065E = obj;
            this.f51067G |= Integer.MIN_VALUE;
            return C14167b.this.m40359d(null, this);
        }
    }

    /* JADX INFO: renamed from: f70.b$b */
    /* JADX INFO: loaded from: classes6.dex */
    @InterfaceC32271e(m100429c = "com.whoop.activation.domain.interactors.activation.AccountCreationScreensHelper$fetchAccountCreationScreens$response$1$1", m100430f = "AccountCreationScreensHelper.kt", m100431l = {54}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, m65681d2 = {"<anonymous>", "Lcom/whoop/activation/domain/models/ActivationFlowCreateAccountResponse;"}, m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b extends AbstractC32275i implements Function1 {

        /* JADX INFO: renamed from: w */
        int f51072w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ WhoopStrapInfo f51074y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(WhoopStrapInfo whoopStrapInfo, InterfaceC30057d<? super b> interfaceC30057d) {
            super(1, interfaceC30057d);
            this.f51074y = whoopStrapInfo;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(InterfaceC30057d<?> interfaceC30057d) {
            return C14167b.this.new b(this.f51074y, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            String strapSignature;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f51072w;
            if (i13 != 0) {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
                return obj;
            }
            AbstractC34132o.m107864I(obj);
            ActivationAuthenticatedApi activationAuthenticatedApi = C14167b.this.activationAuthenticatedApi;
            WhoopStrapInfo whoopStrapInfo = this.f51074y;
            if (whoopStrapInfo == null || (strapSignature = whoopStrapInfo.getStrapSignature()) == null) {
                strapSignature = "";
            }
            this.f51072w = 1;
            Object objStartAccountAuthenticated = activationAuthenticatedApi.startAccountAuthenticated(strapSignature, this);
            return objStartAccountAuthenticated == enumC31071a ? enumC31071a : objStartAccountAuthenticated;
        }

        @Override // p715kotlin.jvm.functions.Function1
        public final Object invoke(InterfaceC30057d<? super ActivationFlowCreateAccountResponse> interfaceC30057d) {
            return ((b) create(interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }
    }

    /* JADX INFO: renamed from: f70.b$c */
    /* JADX INFO: loaded from: classes6.dex */
    @InterfaceC32271e(m100429c = "com.whoop.activation.domain.interactors.activation.AccountCreationScreensHelper$fetchAccountCreationScreens$response$2$1", m100430f = "AccountCreationScreensHelper.kt", m100431l = {62, 61}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, m65681d2 = {"<anonymous>", "Lcom/whoop/activation/domain/models/ActivationFlowCreateAccountResponse;"}, m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c extends AbstractC32275i implements Function1 {

        /* JADX INFO: renamed from: w */
        Object f51075w;

        /* JADX INFO: renamed from: x */
        int f51076x;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ WhoopStrapInfo f51078z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(WhoopStrapInfo whoopStrapInfo, InterfaceC30057d<? super c> interfaceC30057d) {
            super(1, interfaceC30057d);
            this.f51078z = whoopStrapInfo;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(InterfaceC30057d<?> interfaceC30057d) {
            return C14167b.this.new c(this.f51078z, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            ActivationApi activationApi;
            String strapSignature;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f51076x;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                activationApi = C14167b.this.activationApi;
                C14167b c14167b = C14167b.this;
                this.f51075w = activationApi;
                this.f51076x = 1;
                obj = c14167b.m40360e(this);
                if (obj != enumC31071a) {
                }
            }
            if (i13 != 1) {
                if (i13 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
                return obj;
            }
            activationApi = (ActivationApi) this.f51075w;
            AbstractC34132o.m107864I(obj);
            String str = (String) obj;
            WhoopStrapInfo whoopStrapInfo = this.f51078z;
            if (whoopStrapInfo == null || (strapSignature = whoopStrapInfo.getStrapSignature()) == null) {
                strapSignature = "";
            }
            this.f51075w = null;
            this.f51076x = 2;
            Object objStartAccount = activationApi.startAccount(str, strapSignature, this);
            return objStartAccount == enumC31071a ? enumC31071a : objStartAccount;
        }

        @Override // p715kotlin.jvm.functions.Function1
        public final Object invoke(InterfaceC30057d<? super ActivationFlowCreateAccountResponse> interfaceC30057d) {
            return ((c) create(interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }
    }

    public C14167b(ActivationApi activationApi, ActivationAuthenticatedApi activationAuthenticatedApi, C27847j pendingUserSessionRepository, InterfaceC28954b whoopStrapInfoProvider, EmailDataStoreHelper emailDataStoreHelper, C37411b passwordRequirementsFetcher, FeatureFlagChecker featureFlagChecker, C17003c c17003c, InterfaceC34116n logger) {
        AbstractC22676k.m65750j(activationApi, "activationApi");
        AbstractC22676k.m65750j(activationAuthenticatedApi, "activationAuthenticatedApi");
        AbstractC22676k.m65750j(pendingUserSessionRepository, "pendingUserSessionRepository");
        AbstractC22676k.m65750j(whoopStrapInfoProvider, "whoopStrapInfoProvider");
        AbstractC22676k.m65750j(emailDataStoreHelper, "emailDataStoreHelper");
        AbstractC22676k.m65750j(passwordRequirementsFetcher, "passwordRequirementsFetcher");
        AbstractC22676k.m65750j(featureFlagChecker, "featureFlagChecker");
        AbstractC22676k.m65750j(logger, "logger");
        this.activationApi = activationApi;
        this.activationAuthenticatedApi = activationAuthenticatedApi;
        this.pendingUserSessionRepository = pendingUserSessionRepository;
        this.whoopStrapInfoProvider = whoopStrapInfoProvider;
        this.emailDataStoreHelper = emailDataStoreHelper;
        this.passwordRequirementsFetcher = passwordRequirementsFetcher;
        this.featureFlagChecker = featureFlagChecker;
        this.analyticsHelper = c17003c;
        this.logger = logger;
    }

    /* JADX INFO: renamed from: c */
    private final InterfaceC14176e m40358c(List<ActivationFlowCountry> countries, List<? extends ActivationFlowStepModel> items, InterfaceC14176e prevDomainResult, List<PasswordRequirement> passwordRequirements) {
        SignUpSource signUpSource;
        InterfaceC14176e.b bVar = prevDomainResult instanceof InterfaceC14176e.b ? (InterfaceC14176e.b) prevDomainResult : null;
        C26418e c26418e = new C26418e(0, items.size(), 0, ActivationFlowDestination.ACCOUNT_CREATION, null);
        if (bVar == null || (signUpSource = bVar.getSignUpSource()) == null) {
            signUpSource = SignUpSource.ACTIVATION;
        }
        return new InterfaceC14176e.b(items, c26418e, countries, null, null, false, null, false, null, false, false, null, null, signUpSource, passwordRequirements, null, null, 106488, null);
    }

    /* JADX WARN: Code duplicated, block: B:39:0x010f  */
    /* JADX WARN: Code duplicated, block: B:44:0x0123  */
    /* JADX WARN: Code duplicated, block: B:47:0x012b  */
    /* JADX WARN: Code duplicated, block: B:48:0x0132  */
    /* JADX WARN: Code duplicated, block: B:50:0x0136  */
    /* JADX WARN: Code duplicated, block: B:53:0x0157  */
    /* JADX WARN: Code duplicated, block: B:56:0x0178  */
    /* JADX WARN: Code duplicated, block: B:61:0x018a  */
    /* JADX WARN: Code duplicated, block: B:63:0x018e  */
    /* JADX WARN: Code duplicated, block: B:66:0x01be  */
    /* JADX WARN: Code duplicated, block: B:68:0x01c2  */
    /* JADX WARN: Code duplicated, block: B:71:0x01e6  */
    /* JADX WARN: Code duplicated, block: B:73:0x01ea  */
    /* JADX WARN: Code duplicated, block: B:75:0x01ee  */
    /* JADX WARN: Code duplicated, block: B:78:0x01f9  */
    /* JADX WARN: Code duplicated, block: B:80:0x01fe  */
    /* JADX WARN: Code duplicated, block: B:82:0x021f  */
    /* JADX WARN: Code duplicated, block: B:84:0x0225  */
    /* JADX WARN: Code duplicated, block: B:87:0x0180 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:89:0x0172 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    /* JADX WARN: Instruction removed from duplicated block: B:50:0x0136, please report this as an issue */
    /* JADX INFO: renamed from: d */
    public final Object m40359d(InterfaceC14176e interfaceC14176e, InterfaceC30057d<? super InterfaceC14176e> interfaceC30057d) {
        a aVar;
        WhoopStrapInfo whoopStrapInfoMo87912a;
        InterfaceC14176e interfaceC14176e2;
        WhoopStrapInfo whoopStrapInfo;
        InterfaceC14176e interfaceC14176e3;
        InterfaceC34385a interfaceC34385a;
        Object objM119771b;
        InterfaceC34385a interfaceC34385a2;
        AbstractC37410a abstractC37410a;
        List<PasswordRequirement> listM119769a;
        C17003c c17003c;
        InterfaceC34385a.c cVar;
        ArrayList arrayList;
        C17003c c17003c2;
        C17003c c17003c3;
        if (interfaceC30057d instanceof a) {
            aVar = (a) interfaceC30057d;
            int i13 = aVar.f51067G;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                aVar.f51067G = i13 - Integer.MIN_VALUE;
            } else {
                aVar = new a(interfaceC30057d);
            }
        } else {
            aVar = new a(interfaceC30057d);
        }
        a aVar2 = aVar;
        Object objM108729b = aVar2.f51065E;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = aVar2.f51067G;
        if (i14 != 0) {
            if (i14 == 1) {
                whoopStrapInfo = (WhoopStrapInfo) aVar2.f51069x;
                InterfaceC14176e interfaceC14176e4 = (InterfaceC14176e) aVar2.f51068w;
                AbstractC34132o.m107864I(objM108729b);
                interfaceC14176e2 = interfaceC14176e4;
            } else {
                if (i14 == 2) {
                    interfaceC14176e3 = (InterfaceC14176e) aVar2.f51068w;
                    AbstractC34132o.m107864I(objM108729b);
                    interfaceC34385a = (InterfaceC34385a) objM108729b;
                    C37411b c37411b = this.passwordRequirementsFetcher;
                    aVar2.f51068w = interfaceC14176e3;
                    aVar2.f51069x = null;
                    aVar2.f51070y = interfaceC34385a;
                    aVar2.f51067G = 3;
                    objM119771b = c37411b.m119771b(aVar2);
                    if (objM119771b != enumC31071a) {
                        interfaceC34385a2 = interfaceC34385a;
                        objM108729b = objM119771b;
                    }
                    return enumC31071a;
                }
                if (i14 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                interfaceC34385a2 = (InterfaceC34385a) aVar2.f51070y;
                interfaceC14176e3 = (InterfaceC14176e) aVar2.f51068w;
                AbstractC34132o.m107864I(objM108729b);
            }
            abstractC37410a = (AbstractC37410a) objM108729b;
            if (abstractC37410a instanceof AbstractC37410a.b) {
                listM119769a = ((AbstractC37410a.b) abstractC37410a).m119769a();
            } else {
                if (!(abstractC37410a instanceof AbstractC37410a.a)) {
                    throw new NoWhenBranchMatchedException();
                }
                this.logger.mo85222m("Failed to fetch password requirements: " + ((AbstractC37410a.a) abstractC37410a).getError(), new AbstractC30556a.a[0]);
                listM119769a = C25271y.f99162w;
            }
            if (!(interfaceC34385a2 instanceof InterfaceC34385a.c)) {
                if (!(interfaceC34385a2 instanceof InterfaceC34385a.b)) {
                    throw new NoWhenBranchMatchedException();
                }
                c17003c = this.analyticsHelper;
                if (c17003c != null) {
                    c17003c.m47936C(null);
                }
                return AbstractC32238a.m100306a((InterfaceC34385a.b) interfaceC34385a2) ? AbstractC32238a.m100307b() : new InterfaceC14176e.b(null, null, null, null, EnumC14168b0.ERROR, false, null, false, null, false, false, null, null, null, null, null, null, 131055, null);
            }
            cVar = (InterfaceC34385a.c) interfaceC34385a2;
            List<DesignSystemModel> items = ((ActivationFlowCreateAccountResponse) cVar.m108735a()).getActivationBff().getItems();
            arrayList = new ArrayList();
            for (Object obj : items) {
                if (obj instanceof ActivationFlowStepModel) {
                    arrayList.add(obj);
                }
            }
            if (arrayList.isEmpty()) {
                c17003c3 = this.analyticsHelper;
                if (c17003c3 != null) {
                    c17003c3.m47936C(null);
                }
                return new InterfaceC14176e.b(null, null, null, null, EnumC14168b0.ERROR, false, null, false, null, false, false, null, null, null, null, null, null, 131055, null);
            }
            c17003c2 = this.analyticsHelper;
            if (c17003c2 != null) {
                c17003c2.m47936C(((ActivationFlowCreateAccountResponse) cVar.m108735a()).getActivationBff().getEventProperties());
            }
            return m40358c(((ActivationFlowCreateAccountResponse) cVar.m108735a()).getActivationBff().getCountries(), arrayList, interfaceC14176e3, listM119769a);
        }
        AbstractC34132o.m107864I(objM108729b);
        this.logger.mo85216g("fetchAccountCreationScreens called", new AbstractC30556a.a[0]);
        whoopStrapInfoMo87912a = this.whoopStrapInfoProvider.mo87912a();
        if (whoopStrapInfoMo87912a == null && !this.featureFlagChecker.isFeatureEnabled(OnboardingFeatureFlag.ACCOUNT_CREATION_SKIP_STRAP_INFO_CHECK)) {
            this.logger.mo85222m("fetchAccountCreationScreens: no strap info and skip-strap-check flag is off, returning ERROR", new AbstractC30556a.a[0]);
            return new InterfaceC14176e.b(null, null, null, null, EnumC14168b0.ERROR, false, null, false, null, false, false, null, null, null, null, null, null, 131055, null);
        }
        if (this.pendingUserSessionRepository.getAccessToken() != null) {
            InterfaceC34385a.Companion companion = InterfaceC34385a.INSTANCE;
            InterfaceC34116n interfaceC34116n = this.logger;
            b bVar = new b(whoopStrapInfoMo87912a, null);
            interfaceC14176e2 = interfaceC14176e;
            aVar2.f51068w = interfaceC14176e2;
            aVar2.f51069x = whoopStrapInfoMo87912a;
            aVar2.f51070y = null;
            aVar2.f51071z = 0;
            aVar2.f51067G = 1;
            Object objM108729b2 = InterfaceC34385a.Companion.m108729b(companion, interfaceC34116n, null, "Failed to get account creation screens (authed)", bVar, aVar2, 2, null);
            if (objM108729b2 != enumC31071a) {
                whoopStrapInfo = whoopStrapInfoMo87912a;
                objM108729b = objM108729b2;
            }
        } else {
            interfaceC14176e2 = interfaceC14176e;
            InterfaceC34385a.Companion companion2 = InterfaceC34385a.INSTANCE;
            InterfaceC34116n interfaceC34116n2 = this.logger;
            c cVar2 = new c(whoopStrapInfoMo87912a, null);
            aVar2.f51068w = interfaceC14176e2;
            aVar2.f51069x = null;
            aVar2.f51070y = null;
            aVar2.f51071z = 0;
            aVar2.f51067G = 2;
            objM108729b = InterfaceC34385a.Companion.m108729b(companion2, interfaceC34116n2, null, "Failed to get account creation screens (un-authed)", cVar2, aVar2, 2, null);
            if (objM108729b != enumC31071a) {
                interfaceC14176e3 = interfaceC14176e2;
                interfaceC34385a = (InterfaceC34385a) objM108729b;
                C37411b c37411b2 = this.passwordRequirementsFetcher;
                aVar2.f51068w = interfaceC14176e3;
                aVar2.f51069x = null;
                aVar2.f51070y = interfaceC34385a;
                aVar2.f51067G = 3;
                objM119771b = c37411b2.m119771b(aVar2);
                if (objM119771b != enumC31071a) {
                    interfaceC34385a2 = interfaceC34385a;
                    objM108729b = objM119771b;
                    abstractC37410a = (AbstractC37410a) objM108729b;
                    if (abstractC37410a instanceof AbstractC37410a.b) {
                        listM119769a = ((AbstractC37410a.b) abstractC37410a).m119769a();
                    } else {
                        if (!(abstractC37410a instanceof AbstractC37410a.a)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        this.logger.mo85222m("Failed to fetch password requirements: " + ((AbstractC37410a.a) abstractC37410a).getError(), new AbstractC30556a.a[0]);
                        listM119769a = C25271y.f99162w;
                    }
                    if (!(interfaceC34385a2 instanceof InterfaceC34385a.c)) {
                        if (!(interfaceC34385a2 instanceof InterfaceC34385a.b)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        c17003c = this.analyticsHelper;
                        if (c17003c != null) {
                            c17003c.m47936C(null);
                        }
                        if (AbstractC32238a.m100306a((InterfaceC34385a.b) interfaceC34385a2)) {
                        }
                    }
                    cVar = (InterfaceC34385a.c) interfaceC34385a2;
                    List<DesignSystemModel> items2 = ((ActivationFlowCreateAccountResponse) cVar.m108735a()).getActivationBff().getItems();
                    arrayList = new ArrayList();
                    while (r4.hasNext()) {
                        if (obj instanceof ActivationFlowStepModel) {
                            arrayList.add(obj);
                        }
                    }
                    if (arrayList.isEmpty()) {
                        c17003c3 = this.analyticsHelper;
                        if (c17003c3 != null) {
                            c17003c3.m47936C(null);
                        }
                        return new InterfaceC14176e.b(null, null, null, null, EnumC14168b0.ERROR, false, null, false, null, false, false, null, null, null, null, null, null, 131055, null);
                    }
                    c17003c2 = this.analyticsHelper;
                    if (c17003c2 != null) {
                        c17003c2.m47936C(((ActivationFlowCreateAccountResponse) cVar.m108735a()).getActivationBff().getEventProperties());
                    }
                    return m40358c(((ActivationFlowCreateAccountResponse) cVar.m108735a()).getActivationBff().getCountries(), arrayList, interfaceC14176e3, listM119769a);
                }
            }
        }
        return enumC31071a;
        interfaceC34385a = (InterfaceC34385a) objM108729b;
        if (interfaceC34385a == null) {
            whoopStrapInfoMo87912a = whoopStrapInfo;
            InterfaceC34385a.Companion companion3 = InterfaceC34385a.INSTANCE;
            InterfaceC34116n interfaceC34116n3 = this.logger;
            c cVar3 = new c(whoopStrapInfoMo87912a, null);
            aVar2.f51068w = interfaceC14176e2;
            aVar2.f51069x = null;
            aVar2.f51070y = null;
            aVar2.f51071z = 0;
            aVar2.f51067G = 2;
            objM108729b = InterfaceC34385a.Companion.m108729b(companion3, interfaceC34116n3, null, "Failed to get account creation screens (un-authed)", cVar3, aVar2, 2, null);
            if (objM108729b != enumC31071a) {
                interfaceC14176e3 = interfaceC14176e2;
                interfaceC34385a = (InterfaceC34385a) objM108729b;
            }
            return enumC31071a;
        }
        interfaceC14176e3 = interfaceC14176e2;
        C37411b c37411b3 = this.passwordRequirementsFetcher;
        aVar2.f51068w = interfaceC14176e3;
        aVar2.f51069x = null;
        aVar2.f51070y = interfaceC34385a;
        aVar2.f51067G = 3;
        objM119771b = c37411b3.m119771b(aVar2);
        if (objM119771b != enumC31071a) {
            interfaceC34385a2 = interfaceC34385a;
            objM108729b = objM119771b;
            abstractC37410a = (AbstractC37410a) objM108729b;
            if (abstractC37410a instanceof AbstractC37410a.b) {
                listM119769a = ((AbstractC37410a.b) abstractC37410a).m119769a();
            } else {
                if (!(abstractC37410a instanceof AbstractC37410a.a)) {
                    throw new NoWhenBranchMatchedException();
                }
                this.logger.mo85222m("Failed to fetch password requirements: " + ((AbstractC37410a.a) abstractC37410a).getError(), new AbstractC30556a.a[0]);
                listM119769a = C25271y.f99162w;
            }
            if (!(interfaceC34385a2 instanceof InterfaceC34385a.c)) {
                if (!(interfaceC34385a2 instanceof InterfaceC34385a.b)) {
                    throw new NoWhenBranchMatchedException();
                }
                c17003c = this.analyticsHelper;
                if (c17003c != null) {
                    c17003c.m47936C(null);
                }
                if (AbstractC32238a.m100306a((InterfaceC34385a.b) interfaceC34385a2)) {
                }
            }
            cVar = (InterfaceC34385a.c) interfaceC34385a2;
            List<DesignSystemModel> items3 = ((ActivationFlowCreateAccountResponse) cVar.m108735a()).getActivationBff().getItems();
            arrayList = new ArrayList();
            while (r4.hasNext()) {
                if (obj instanceof ActivationFlowStepModel) {
                    arrayList.add(obj);
                }
            }
            if (arrayList.isEmpty()) {
                c17003c3 = this.analyticsHelper;
                if (c17003c3 != null) {
                    c17003c3.m47936C(null);
                }
                return new InterfaceC14176e.b(null, null, null, null, EnumC14168b0.ERROR, false, null, false, null, false, false, null, null, null, null, null, null, 131055, null);
            }
            c17003c2 = this.analyticsHelper;
            if (c17003c2 != null) {
                c17003c2.m47936C(((ActivationFlowCreateAccountResponse) cVar.m108735a()).getActivationBff().getEventProperties());
            }
            return m40358c(((ActivationFlowCreateAccountResponse) cVar.m108735a()).getActivationBff().getCountries(), arrayList, interfaceC14176e3, listM119769a);
        }
        return enumC31071a;
    }

    /* JADX INFO: renamed from: e */
    public final Object m40360e(InterfaceC30057d<? super String> interfaceC30057d) {
        return this.emailDataStoreHelper.getEmail(interfaceC30057d);
    }

    public /* synthetic */ C14167b(ActivationApi activationApi, ActivationAuthenticatedApi activationAuthenticatedApi, C27847j c27847j, InterfaceC28954b interfaceC28954b, EmailDataStoreHelper emailDataStoreHelper, C37411b c37411b, FeatureFlagChecker featureFlagChecker, C17003c c17003c, InterfaceC34116n interfaceC34116n, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(activationApi, activationAuthenticatedApi, c27847j, interfaceC28954b, emailDataStoreHelper, c37411b, featureFlagChecker, (i13 & 128) != 0 ? null : c17003c, (i13 & 256) != 0 ? InterfaceC34116n.INSTANCE.m107848a("AccountCreationScreensHelper") : interfaceC34116n);
    }
}
