package f70;

import com.whoop.activation.domain.ActivationAuthenticatedApi;
import com.whoop.activation.domain.models.ActivationFlowActivateResponse;
import com.whoop.activation.domain.models.ActivationFlowStepModel;
import com.whoop.activation.domain.models.steps.UpcycleJoinTodayModel;
import com.whoop.activation.domain.models.steps.UpcyclePlanPickerModel;
import com.whoop.activation.view.navigation.ActivationFlowDestination;
import com.whoop.data.repositories.FeatureFlagChecker;
import com.whoop.data.repositories.OnboardingFeatureFlag;
import com.whoop.design.models.DesignSystemModel;
import com.whoop.domain.model.WhoopStrapInfo;
import com.whoop.service.network.model.PasswordRequirement;
import h80.C17003c;
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

/* JADX INFO: renamed from: f70.a */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0001\u0018\u00002\u00020\u0001BA\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0018\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u0012H\u0086@¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0019R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010\u000f\u001a\u00020\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#¨\u0006$"}, m65681d2 = {"Lf70/a;", "", "Lcom/whoop/activation/domain/ActivationAuthenticatedApi;", "activationAuthenticatedApi", "Lp70/b;", "whoopStrapInfoProvider", "Lod1/j;", "pendingUserSessionRepository", "Lcom/whoop/data/repositories/FeatureFlagChecker;", "ffChecker", "Lwn0/b;", "passwordRequirementsFetcher", "Lh80/c;", "analyticsHelper", "Ltr2/n;", "logger", "<init>", "(Lcom/whoop/activation/domain/ActivationAuthenticatedApi;Lp70/b;Lod1/j;Lcom/whoop/data/repositories/FeatureFlagChecker;Lwn0/b;Lh80/c;Ltr2/n;)V", "Lf70/e$b;", "prevDomainResult", "Lf70/e;", "b", "(Lf70/e$b;Lq83/d;)Ljava/lang/Object;", "a", "Lcom/whoop/activation/domain/ActivationAuthenticatedApi;", "Lp70/b;", "c", "Lod1/j;", "d", "Lcom/whoop/data/repositories/FeatureFlagChecker;", "e", "Lwn0/b;", "f", "Lh80/c;", "g", "Ltr2/n;", "activation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C14164a {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final ActivationAuthenticatedApi activationAuthenticatedApi;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final InterfaceC28954b whoopStrapInfoProvider;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final C27847j pendingUserSessionRepository;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final FeatureFlagChecker ffChecker;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final C37411b passwordRequirementsFetcher;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final C17003c analyticsHelper;

    /* JADX INFO: renamed from: g, reason: from kotlin metadata */
    private final InterfaceC34116n logger;

    /* JADX INFO: renamed from: f70.a$a */
    /* JADX INFO: loaded from: classes6.dex */
    @InterfaceC32271e(m100429c = "com.whoop.activation.domain.interactors.activation.AccountActivationFetcher", m100430f = "AccountActivationFetcher.kt", m100431l = {51, 57}, m100432m = "fetchAccountActivationScreens", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a extends AbstractC32269c {

        /* JADX INFO: renamed from: F */
        int f51036F;

        /* JADX INFO: renamed from: w */
        Object f51037w;

        /* JADX INFO: renamed from: x */
        Object f51038x;

        /* JADX INFO: renamed from: y */
        Object f51039y;

        /* JADX INFO: renamed from: z */
        /* synthetic */ Object f51040z;

        public a(InterfaceC30057d<? super a> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f51040z = obj;
            this.f51036F |= Integer.MIN_VALUE;
            return C14164a.this.m40350b(null, this);
        }
    }

    /* JADX INFO: renamed from: f70.a$b */
    /* JADX INFO: loaded from: classes6.dex */
    @InterfaceC32271e(m100429c = "com.whoop.activation.domain.interactors.activation.AccountActivationFetcher$fetchAccountActivationScreens$response$1", m100430f = "AccountActivationFetcher.kt", m100431l = {52}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, m65681d2 = {"<anonymous>", "Lcom/whoop/activation/domain/models/ActivationFlowActivateResponse;"}, m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b extends AbstractC32275i implements Function1 {

        /* JADX INFO: renamed from: w */
        int f51041w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ WhoopStrapInfo f51043y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(WhoopStrapInfo whoopStrapInfo, InterfaceC30057d<? super b> interfaceC30057d) {
            super(1, interfaceC30057d);
            this.f51043y = whoopStrapInfo;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(InterfaceC30057d<?> interfaceC30057d) {
            return C14164a.this.new b(this.f51043y, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f51041w;
            if (i13 != 0) {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
                return obj;
            }
            AbstractC34132o.m107864I(obj);
            ActivationAuthenticatedApi activationAuthenticatedApi = C14164a.this.activationAuthenticatedApi;
            String strapSignature = this.f51043y.getStrapSignature();
            if (strapSignature == null) {
                strapSignature = "";
            }
            this.f51041w = 1;
            Object objActivateAccount = activationAuthenticatedApi.activateAccount(strapSignature, this);
            return objActivateAccount == enumC31071a ? enumC31071a : objActivateAccount;
        }

        @Override // p715kotlin.jvm.functions.Function1
        public final Object invoke(InterfaceC30057d<? super ActivationFlowActivateResponse> interfaceC30057d) {
            return ((b) create(interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }
    }

    public C14164a(ActivationAuthenticatedApi activationAuthenticatedApi, InterfaceC28954b whoopStrapInfoProvider, C27847j pendingUserSessionRepository, FeatureFlagChecker ffChecker, C37411b passwordRequirementsFetcher, C17003c analyticsHelper, InterfaceC34116n logger) {
        AbstractC22676k.m65750j(activationAuthenticatedApi, "activationAuthenticatedApi");
        AbstractC22676k.m65750j(whoopStrapInfoProvider, "whoopStrapInfoProvider");
        AbstractC22676k.m65750j(pendingUserSessionRepository, "pendingUserSessionRepository");
        AbstractC22676k.m65750j(ffChecker, "ffChecker");
        AbstractC22676k.m65750j(passwordRequirementsFetcher, "passwordRequirementsFetcher");
        AbstractC22676k.m65750j(analyticsHelper, "analyticsHelper");
        AbstractC22676k.m65750j(logger, "logger");
        this.activationAuthenticatedApi = activationAuthenticatedApi;
        this.whoopStrapInfoProvider = whoopStrapInfoProvider;
        this.pendingUserSessionRepository = pendingUserSessionRepository;
        this.ffChecker = ffChecker;
        this.passwordRequirementsFetcher = passwordRequirementsFetcher;
        this.analyticsHelper = analyticsHelper;
        this.logger = logger;
    }

    /* JADX WARN: Code duplicated, block: B:34:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:36:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:38:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:41:0x011b  */
    /* JADX WARN: Code duplicated, block: B:44:0x0147  */
    /* JADX WARN: Code duplicated, block: B:49:0x015d  */
    /* JADX WARN: Code duplicated, block: B:52:0x016c  */
    /* JADX WARN: Code duplicated, block: B:61:0x0187  */
    /* JADX WARN: Code duplicated, block: B:63:0x01a8  */
    /* JADX WARN: Code duplicated, block: B:65:0x01dc  */
    /* JADX WARN: Code duplicated, block: B:67:0x01e0  */
    /* JADX WARN: Code duplicated, block: B:69:0x01e8  */
    /* JADX WARN: Code duplicated, block: B:71:0x01ed  */
    /* JADX WARN: Code duplicated, block: B:73:0x020e  */
    /* JADX WARN: Code duplicated, block: B:75:0x0214  */
    /* JADX WARN: Code duplicated, block: B:78:0x014f A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:80:0x0141 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    /* JADX WARN: Instruction removed from duplicated block: B:38:0x00f8, please report this as an issue */
    /* JADX INFO: renamed from: b */
    public final Object m40350b(InterfaceC14176e.b bVar, InterfaceC30057d<? super InterfaceC14176e> interfaceC30057d) {
        a aVar;
        InterfaceC14176e.b bVar2;
        Object objM108729b;
        InterfaceC34385a interfaceC34385a;
        InterfaceC14176e.b bVar3;
        AbstractC37410a abstractC37410a;
        List<PasswordRequirement> listM119769a;
        List<PasswordRequirement> list;
        InterfaceC34385a.c cVar;
        ArrayList arrayList;
        ActivationFlowStepModel activationFlowStepModel;
        if (interfaceC30057d instanceof a) {
            aVar = (a) interfaceC30057d;
            int i13 = aVar.f51036F;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                aVar.f51036F = i13 - Integer.MIN_VALUE;
            } else {
                aVar = new a(interfaceC30057d);
            }
        } else {
            aVar = new a(interfaceC30057d);
        }
        a aVar2 = aVar;
        Object obj = aVar2.f51040z;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = aVar2.f51036F;
        if (i14 == 0) {
            AbstractC34132o.m107864I(obj);
            WhoopStrapInfo whoopStrapInfoMo87912a = this.whoopStrapInfoProvider.mo87912a();
            if (whoopStrapInfoMo87912a == null) {
                return InterfaceC14176e.b.m40416b(bVar, null, null, null, null, EnumC14168b0.ERROR, false, null, false, null, false, false, null, null, null, null, null, null, 131055, null);
            }
            bVar2 = bVar;
            if (AbstractC14184i.m40486b(bVar2, this.pendingUserSessionRepository, this.ffChecker, InterfaceC14191l0.b.f51449a) == null) {
                return InterfaceC14176e.b.m40416b(bVar2, null, null, null, null, EnumC14168b0.ERROR, false, null, false, null, false, false, null, null, null, null, null, null, 131055, null);
            }
            InterfaceC34385a.Companion companion = InterfaceC34385a.INSTANCE;
            InterfaceC34116n interfaceC34116n = this.logger;
            b bVar4 = new b(whoopStrapInfoMo87912a, null);
            aVar2.f51037w = bVar2;
            aVar2.f51038x = null;
            aVar2.f51036F = 1;
            objM108729b = InterfaceC34385a.Companion.m108729b(companion, interfaceC34116n, null, "Failed to get account activation screens", bVar4, aVar2, 2, null);
            if (objM108729b != enumC31071a) {
            }
            return enumC31071a;
        }
        if (i14 == 1) {
            InterfaceC14176e.b bVar5 = (InterfaceC14176e.b) aVar2.f51037w;
            AbstractC34132o.m107864I(obj);
            objM108729b = obj;
            bVar2 = bVar5;
        } else {
            if (i14 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            interfaceC34385a = (InterfaceC34385a) aVar2.f51039y;
            bVar3 = (InterfaceC14176e.b) aVar2.f51037w;
            AbstractC34132o.m107864I(obj);
        }
        abstractC37410a = (AbstractC37410a) obj;
        if (abstractC37410a instanceof AbstractC37410a.b) {
            listM119769a = ((AbstractC37410a.b) abstractC37410a).m119769a();
        } else {
            if (abstractC37410a instanceof AbstractC37410a.a) {
                throw new NoWhenBranchMatchedException();
            }
            this.logger.mo85222m("Failed to fetch password requirements: " + ((AbstractC37410a.a) abstractC37410a).getError(), new AbstractC30556a.a[0]);
            listM119769a = C25271y.f99162w;
        }
        list = listM119769a;
        if (interfaceC34385a instanceof InterfaceC34385a.c) {
            if (interfaceC34385a instanceof InterfaceC34385a.b) {
                return AbstractC32238a.m100306a((InterfaceC34385a.b) interfaceC34385a) ? AbstractC32238a.m100307b() : InterfaceC14176e.b.m40416b(bVar3, null, null, null, null, EnumC14168b0.ERROR, false, null, false, null, false, false, null, null, null, null, null, null, 131055, null);
            }
            throw new NoWhenBranchMatchedException();
        }
        cVar = (InterfaceC34385a.c) interfaceC34385a;
        this.analyticsHelper.m47936C(((ActivationFlowActivateResponse) cVar.m108735a()).getEventProperties());
        List<DesignSystemModel> items = ((ActivationFlowActivateResponse) cVar.m108735a()).getItems();
        arrayList = new ArrayList();
        for (Object obj2 : items) {
            if (obj2 instanceof ActivationFlowStepModel) {
                arrayList.add(obj2);
            }
        }
        if (!this.ffChecker.isFeatureEnabled(OnboardingFeatureFlag.UPCYCLE_ONBOARDING_ANDROID)) {
            ArrayList arrayList2 = new ArrayList();
            for (Object obj3 : arrayList) {
                activationFlowStepModel = (ActivationFlowStepModel) obj3;
                if ((activationFlowStepModel instanceof UpcyclePlanPickerModel) && !(activationFlowStepModel instanceof UpcycleJoinTodayModel)) {
                    arrayList2.add(obj3);
                }
            }
            arrayList = arrayList2;
        }
        if (arrayList.isEmpty()) {
            return InterfaceC14176e.b.m40416b(bVar3, null, null, null, null, EnumC14168b0.ERROR, false, null, false, null, false, false, null, null, null, null, null, null, 131055, null);
        }
        return InterfaceC14176e.b.m40416b(bVar3, arrayList, new C26418e(0, arrayList.size(), 0, ActivationFlowDestination.ACCOUNT_ACTIVATION, null), null, null, EnumC14168b0.CONTENT, false, null, false, null, false, false, null, ((ActivationFlowActivateResponse) cVar.m108735a()).getExperimentProperties(), null, list, null, null, 110572, null);
        InterfaceC34385a interfaceC34385a2 = (InterfaceC34385a) objM108729b;
        C37411b c37411b = this.passwordRequirementsFetcher;
        aVar2.f51037w = bVar2;
        aVar2.f51038x = null;
        aVar2.f51039y = interfaceC34385a2;
        aVar2.f51036F = 2;
        Object objM119771b = c37411b.m119771b(aVar2);
        if (objM119771b != enumC31071a) {
            interfaceC34385a = interfaceC34385a2;
            bVar3 = bVar2;
            obj = objM119771b;
            abstractC37410a = (AbstractC37410a) obj;
            if (abstractC37410a instanceof AbstractC37410a.b) {
                listM119769a = ((AbstractC37410a.b) abstractC37410a).m119769a();
            } else {
                if (abstractC37410a instanceof AbstractC37410a.a) {
                    throw new NoWhenBranchMatchedException();
                }
                this.logger.mo85222m("Failed to fetch password requirements: " + ((AbstractC37410a.a) abstractC37410a).getError(), new AbstractC30556a.a[0]);
                listM119769a = C25271y.f99162w;
            }
            list = listM119769a;
            if (interfaceC34385a instanceof InterfaceC34385a.c) {
                if (interfaceC34385a instanceof InterfaceC34385a.b) {
                    if (AbstractC32238a.m100306a((InterfaceC34385a.b) interfaceC34385a)) {
                    }
                }
                throw new NoWhenBranchMatchedException();
            }
            cVar = (InterfaceC34385a.c) interfaceC34385a;
            this.analyticsHelper.m47936C(((ActivationFlowActivateResponse) cVar.m108735a()).getEventProperties());
            List<DesignSystemModel> items2 = ((ActivationFlowActivateResponse) cVar.m108735a()).getItems();
            arrayList = new ArrayList();
            while (r1.hasNext()) {
                if (obj2 instanceof ActivationFlowStepModel) {
                    arrayList.add(obj2);
                }
            }
            if (!this.ffChecker.isFeatureEnabled(OnboardingFeatureFlag.UPCYCLE_ONBOARDING_ANDROID)) {
                ArrayList arrayList3 = new ArrayList();
                while (r4.hasNext()) {
                    activationFlowStepModel = (ActivationFlowStepModel) obj3;
                    if (activationFlowStepModel instanceof UpcyclePlanPickerModel) {
                    }
                }
                arrayList = arrayList3;
            }
            if (arrayList.isEmpty()) {
                return InterfaceC14176e.b.m40416b(bVar3, null, null, null, null, EnumC14168b0.ERROR, false, null, false, null, false, false, null, null, null, null, null, null, 131055, null);
            }
            return InterfaceC14176e.b.m40416b(bVar3, arrayList, new C26418e(0, arrayList.size(), 0, ActivationFlowDestination.ACCOUNT_ACTIVATION, null), null, null, EnumC14168b0.CONTENT, false, null, false, null, false, false, null, ((ActivationFlowActivateResponse) cVar.m108735a()).getExperimentProperties(), null, list, null, null, 110572, null);
        }
        return enumC31071a;
    }

    public /* synthetic */ C14164a(ActivationAuthenticatedApi activationAuthenticatedApi, InterfaceC28954b interfaceC28954b, C27847j c27847j, FeatureFlagChecker featureFlagChecker, C37411b c37411b, C17003c c17003c, InterfaceC34116n interfaceC34116n, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(activationAuthenticatedApi, interfaceC28954b, c27847j, featureFlagChecker, c37411b, c17003c, (i13 & 64) != 0 ? InterfaceC34116n.INSTANCE.m107848a("AccountActivationFetcher") : interfaceC34116n);
    }
}
