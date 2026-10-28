package f70;

import androidx.core.app.NotificationCompat;
import com.whoop.activation.domain.ActivationApi;
import com.whoop.activation.domain.models.ActivationFlowCreateAccountResponse;
import com.whoop.activation.domain.models.ActivationFlowStepModel;
import com.whoop.activation.domain.models.InAppJoinFlowCountryResponse;
import com.whoop.activation.domain.models.InAppJoinFlowResponse;
import com.whoop.activation.domain.models.steps.ActivationFlowTextEntry;
import com.whoop.activation.domain.models.steps.EnterEmailStepModel;
import com.whoop.activation.iajf.domain.SignUpSource;
import com.whoop.activation.view.navigation.ActivationFlowDestination;
import com.whoop.data.datastore.EmailDataStoreHelper;
import com.whoop.design.models.DesignSystemModel;
import com.whoop.service.network.model.PasswordRequirement;
import java.util.ArrayList;
import java.util.List;
import l83.C23454a0;
import m83.AbstractC25267u;
import m83.C25271y;
import n70.C26418e;
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
import wn0.AbstractC37410a;
import wn0.C37411b;
import yb3.AbstractC39421y;

/* JADX INFO: renamed from: f70.k0 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\b\u0001\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u001e\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e2\u0006\u0010\r\u001a\u00020\fH\u0082@¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0012H\u0086@¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0012H\u0086@¢\u0006\u0004\b\u0015\u0010\u0014J\u0018\u0010\u0017\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\fH\u0086@¢\u0006\u0004\b\u0017\u0010\u0011R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u001cR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u001d¨\u0006\u001e"}, m65681d2 = {"Lf70/k0;", "", "Lcom/whoop/activation/domain/ActivationApi;", "activationApi", "Lcom/whoop/data/datastore/EmailDataStoreHelper;", "emailDataStoreHelper", "Lwn0/b;", "passwordRequirementsFetcher", "Ltr2/n;", "logger", "<init>", "(Lcom/whoop/activation/domain/ActivationApi;Lcom/whoop/data/datastore/EmailDataStoreHelper;Lwn0/b;Ltr2/n;)V", "", "logPrefix", "", "Lcom/whoop/service/network/model/PasswordRequirement;", "f", "(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;", "Lf70/e;", "e", "(Lq83/d;)Ljava/lang/Object;", "c", NotificationCompat.CATEGORY_EMAIL, "d", "a", "Lcom/whoop/activation/domain/ActivationApi;", "b", "Lcom/whoop/data/datastore/EmailDataStoreHelper;", "Lwn0/b;", "Ltr2/n;", "activation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C14189k0 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final ActivationApi activationApi;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final EmailDataStoreHelper emailDataStoreHelper;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final C37411b passwordRequirementsFetcher;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final InterfaceC34116n logger;

    /* JADX INFO: renamed from: f70.k0$a */
    /* JADX INFO: loaded from: classes6.dex */
    @InterfaceC32271e(m100429c = "com.whoop.activation.domain.interactors.activation.IAJFV2BffFetcher", m100430f = "IAJFV2BffFetcher.kt", m100431l = {82}, m100432m = "fetchCountrySelectionScreens", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a extends AbstractC32269c {

        /* JADX INFO: renamed from: w */
        /* synthetic */ Object f51413w;

        /* JADX INFO: renamed from: y */
        int f51415y;

        public a(InterfaceC30057d<? super a> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f51413w = obj;
            this.f51415y |= Integer.MIN_VALUE;
            return C14189k0.this.m40501c(this);
        }
    }

    /* JADX INFO: renamed from: f70.k0$b */
    /* JADX INFO: loaded from: classes6.dex */
    @InterfaceC32271e(m100429c = "com.whoop.activation.domain.interactors.activation.IAJFV2BffFetcher$fetchCountrySelectionScreens$response$1", m100430f = "IAJFV2BffFetcher.kt", m100431l = {83}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, m65681d2 = {"<anonymous>", "Lcom/whoop/activation/domain/models/InAppJoinFlowCountryResponse;"}, m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b extends AbstractC32275i implements Function1 {

        /* JADX INFO: renamed from: w */
        int f51416w;

        public b(InterfaceC30057d<? super b> interfaceC30057d) {
            super(1, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(InterfaceC30057d<?> interfaceC30057d) {
            return C14189k0.this.new b(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f51416w;
            if (i13 != 0) {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
                return obj;
            }
            AbstractC34132o.m107864I(obj);
            ActivationApi activationApi = C14189k0.this.activationApi;
            this.f51416w = 1;
            Object objFetchInAppJoinFlowCountryV2 = activationApi.fetchInAppJoinFlowCountryV2(this);
            return objFetchInAppJoinFlowCountryV2 == enumC31071a ? enumC31071a : objFetchInAppJoinFlowCountryV2;
        }

        @Override // p715kotlin.jvm.functions.Function1
        public final Object invoke(InterfaceC30057d<? super InAppJoinFlowCountryResponse> interfaceC30057d) {
            return ((b) create(interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }
    }

    /* JADX INFO: renamed from: f70.k0$c */
    /* JADX INFO: loaded from: classes6.dex */
    @InterfaceC32271e(m100429c = "com.whoop.activation.domain.interactors.activation.IAJFV2BffFetcher", m100430f = "IAJFV2BffFetcher.kt", m100431l = {128, 131}, m100432m = "fetchCreateAccountScreens", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c extends AbstractC32269c {

        /* JADX INFO: renamed from: E */
        int f51418E;

        /* JADX INFO: renamed from: w */
        Object f51419w;

        /* JADX INFO: renamed from: x */
        Object f51420x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f51421y;

        public c(InterfaceC30057d<? super c> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f51421y = obj;
            this.f51418E |= Integer.MIN_VALUE;
            return C14189k0.this.m40502d(null, this);
        }
    }

    /* JADX INFO: renamed from: f70.k0$d */
    /* JADX INFO: loaded from: classes6.dex */
    @InterfaceC32271e(m100429c = "com.whoop.activation.domain.interactors.activation.IAJFV2BffFetcher$fetchCreateAccountScreens$response$1", m100430f = "IAJFV2BffFetcher.kt", m100431l = {129}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, m65681d2 = {"<anonymous>", "Lcom/whoop/activation/domain/models/ActivationFlowCreateAccountResponse;"}, m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class d extends AbstractC32275i implements Function1 {

        /* JADX INFO: renamed from: w */
        int f51423w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ String f51425y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(String str, InterfaceC30057d<? super d> interfaceC30057d) {
            super(1, interfaceC30057d);
            this.f51425y = str;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(InterfaceC30057d<?> interfaceC30057d) {
            return C14189k0.this.new d(this.f51425y, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f51423w;
            if (i13 != 0) {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
                return obj;
            }
            AbstractC34132o.m107864I(obj);
            ActivationApi activationApi = C14189k0.this.activationApi;
            String str = this.f51425y;
            this.f51423w = 1;
            Object objFetchInAppJoinFlowCreateAccount = activationApi.fetchInAppJoinFlowCreateAccount(str, this);
            return objFetchInAppJoinFlowCreateAccount == enumC31071a ? enumC31071a : objFetchInAppJoinFlowCreateAccount;
        }

        @Override // p715kotlin.jvm.functions.Function1
        public final Object invoke(InterfaceC30057d<? super ActivationFlowCreateAccountResponse> interfaceC30057d) {
            return ((d) create(interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }
    }

    /* JADX INFO: renamed from: f70.k0$e */
    /* JADX INFO: loaded from: classes6.dex */
    @InterfaceC32271e(m100429c = "com.whoop.activation.domain.interactors.activation.IAJFV2BffFetcher", m100430f = "IAJFV2BffFetcher.kt", m100431l = {25, 39}, m100432m = "fetchEmailScreen", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class e extends AbstractC32269c {

        /* JADX INFO: renamed from: E */
        int f51426E;

        /* JADX INFO: renamed from: w */
        Object f51427w;

        /* JADX INFO: renamed from: x */
        Object f51428x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f51429y;

        public e(InterfaceC30057d<? super e> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f51429y = obj;
            this.f51426E |= Integer.MIN_VALUE;
            return C14189k0.this.m40503e(this);
        }
    }

    /* JADX INFO: renamed from: f70.k0$f */
    /* JADX INFO: loaded from: classes6.dex */
    @InterfaceC32271e(m100429c = "com.whoop.activation.domain.interactors.activation.IAJFV2BffFetcher$fetchEmailScreen$response$1", m100430f = "IAJFV2BffFetcher.kt", m100431l = {26}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, m65681d2 = {"<anonymous>", "Lcom/whoop/activation/domain/models/InAppJoinFlowResponse;"}, m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class f extends AbstractC32275i implements Function1 {

        /* JADX INFO: renamed from: w */
        int f51431w;

        public f(InterfaceC30057d<? super f> interfaceC30057d) {
            super(1, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(InterfaceC30057d<?> interfaceC30057d) {
            return C14189k0.this.new f(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f51431w;
            if (i13 != 0) {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
                return obj;
            }
            AbstractC34132o.m107864I(obj);
            ActivationApi activationApi = C14189k0.this.activationApi;
            this.f51431w = 1;
            Object objFetchInAppJoinFlowV2 = activationApi.fetchInAppJoinFlowV2(this);
            return objFetchInAppJoinFlowV2 == enumC31071a ? enumC31071a : objFetchInAppJoinFlowV2;
        }

        @Override // p715kotlin.jvm.functions.Function1
        public final Object invoke(InterfaceC30057d<? super InAppJoinFlowResponse> interfaceC30057d) {
            return ((f) create(interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }
    }

    /* JADX INFO: renamed from: f70.k0$g */
    /* JADX INFO: loaded from: classes6.dex */
    @InterfaceC32271e(m100429c = "com.whoop.activation.domain.interactors.activation.IAJFV2BffFetcher", m100430f = "IAJFV2BffFetcher.kt", m100431l = {169}, m100432m = "fetchPasswordRequirements", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class g extends AbstractC32269c {

        /* JADX INFO: renamed from: w */
        Object f51433w;

        /* JADX INFO: renamed from: x */
        /* synthetic */ Object f51434x;

        /* JADX INFO: renamed from: z */
        int f51436z;

        public g(InterfaceC30057d<? super g> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f51434x = obj;
            this.f51436z |= Integer.MIN_VALUE;
            return C14189k0.this.m40500f(null, this);
        }
    }

    public C14189k0(ActivationApi activationApi, EmailDataStoreHelper emailDataStoreHelper, C37411b passwordRequirementsFetcher, InterfaceC34116n logger) {
        AbstractC22676k.m65750j(activationApi, "activationApi");
        AbstractC22676k.m65750j(emailDataStoreHelper, "emailDataStoreHelper");
        AbstractC22676k.m65750j(passwordRequirementsFetcher, "passwordRequirementsFetcher");
        AbstractC22676k.m65750j(logger, "logger");
        this.activationApi = activationApi;
        this.emailDataStoreHelper = emailDataStoreHelper;
        this.passwordRequirementsFetcher = passwordRequirementsFetcher;
        this.logger = logger;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: f */
    public final Object m40500f(String str, InterfaceC30057d<? super List<PasswordRequirement>> interfaceC30057d) {
        g gVar;
        if (interfaceC30057d instanceof g) {
            gVar = (g) interfaceC30057d;
            int i13 = gVar.f51436z;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                gVar.f51436z = i13 - Integer.MIN_VALUE;
            } else {
                gVar = new g(interfaceC30057d);
            }
        } else {
            gVar = new g(interfaceC30057d);
        }
        Object objM119771b = gVar.f51434x;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = gVar.f51436z;
        if (i14 == 0) {
            AbstractC34132o.m107864I(objM119771b);
            C37411b c37411b = this.passwordRequirementsFetcher;
            gVar.f51433w = str;
            gVar.f51436z = 1;
            objM119771b = c37411b.m119771b(gVar);
            if (objM119771b == enumC31071a) {
                return enumC31071a;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str = (String) gVar.f51433w;
            AbstractC34132o.m107864I(objM119771b);
        }
        AbstractC37410a abstractC37410a = (AbstractC37410a) objM119771b;
        if (abstractC37410a instanceof AbstractC37410a.b) {
            return ((AbstractC37410a.b) abstractC37410a).m119769a();
        }
        if (!(abstractC37410a instanceof AbstractC37410a.a)) {
            throw new NoWhenBranchMatchedException();
        }
        this.logger.mo85222m(str + ": Failed to fetch password requirements: " + ((AbstractC37410a.a) abstractC37410a).getError(), new AbstractC30556a.a[0]);
        return C25271y.f99162w;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    /* JADX INFO: renamed from: c */
    public final Object m40501c(InterfaceC30057d<? super InterfaceC14176e> interfaceC30057d) {
        a aVar;
        if (interfaceC30057d instanceof a) {
            aVar = (a) interfaceC30057d;
            int i13 = aVar.f51415y;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                aVar.f51415y = i13 - Integer.MIN_VALUE;
            } else {
                aVar = new a(interfaceC30057d);
            }
        } else {
            aVar = new a(interfaceC30057d);
        }
        a aVar2 = aVar;
        Object objM108729b = aVar2.f51413w;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = aVar2.f51415y;
        if (i14 == 0) {
            AbstractC34132o.m107864I(objM108729b);
            InterfaceC34385a.Companion companion = InterfaceC34385a.INSTANCE;
            InterfaceC34116n interfaceC34116n = this.logger;
            b bVar = new b(null);
            aVar2.f51415y = 1;
            objM108729b = InterfaceC34385a.Companion.m108729b(companion, interfaceC34116n, null, "Failed to fetch IAJF V2 country screen", bVar, aVar2, 2, null);
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
        if (!(interfaceC34385a instanceof InterfaceC34385a.c)) {
            if (interfaceC34385a instanceof InterfaceC34385a.b) {
                return new InterfaceC14176e.b(null, null, null, null, EnumC14168b0.ERROR, false, null, false, null, false, false, null, null, SignUpSource.IAJF_V2, null, null, null, 122863, null);
            }
            throw new NoWhenBranchMatchedException();
        }
        InterfaceC34385a.c cVar = (InterfaceC34385a.c) interfaceC34385a;
        List<DesignSystemModel> items = ((InAppJoinFlowCountryResponse) cVar.m108735a()).getItems();
        ArrayList arrayList = new ArrayList();
        for (Object obj : items) {
            if (obj instanceof ActivationFlowStepModel) {
                arrayList.add(obj);
            }
        }
        if (arrayList.isEmpty()) {
            this.logger.mo85222m("IAJF V2 country BFF returned an empty list of screens.", new AbstractC30556a.a[0]);
            return new InterfaceC14176e.b(null, null, null, null, EnumC14168b0.ERROR, false, null, false, null, false, false, null, null, SignUpSource.IAJF_V2, null, null, null, 122863, null);
        }
        return new InterfaceC14176e.b(arrayList, new C26418e(0, arrayList.size(), 0, ActivationFlowDestination.IN_APP_JOIN_FLOW, null), ((InAppJoinFlowCountryResponse) cVar.m108735a()).getCountries(), null, EnumC14168b0.CONTENT, false, null, false, null, false, false, null, null, SignUpSource.IAJF_V2, null, null, null, 122856, null);
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0083  */
    /* JADX WARN: Code duplicated, block: B:29:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:34:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:36:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:38:0x011c  */
    /* JADX WARN: Code duplicated, block: B:40:0x0120  */
    /* JADX WARN: Code duplicated, block: B:42:0x0141  */
    /* JADX WARN: Code duplicated, block: B:45:0x00ac A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:47:0x009e A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    /* JADX INFO: renamed from: d */
    public final Object m40502d(String str, InterfaceC30057d<? super InterfaceC14176e> interfaceC30057d) {
        c cVar;
        InterfaceC34385a interfaceC34385a;
        List list;
        InterfaceC34385a.c cVar2;
        ArrayList arrayList;
        if (interfaceC30057d instanceof c) {
            cVar = (c) interfaceC30057d;
            int i13 = cVar.f51418E;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                cVar.f51418E = i13 - Integer.MIN_VALUE;
            } else {
                cVar = new c(interfaceC30057d);
            }
        } else {
            cVar = new c(interfaceC30057d);
        }
        c cVar3 = cVar;
        Object objM108729b = cVar3.f51421y;
        Object obj = EnumC31071a.f128113w;
        int i14 = cVar3.f51418E;
        if (i14 == 0) {
            AbstractC34132o.m107864I(objM108729b);
            InterfaceC34385a.Companion companion = InterfaceC34385a.INSTANCE;
            InterfaceC34116n interfaceC34116n = this.logger;
            d dVar = new d(str, null);
            cVar3.f51419w = null;
            cVar3.f51418E = 1;
            objM108729b = InterfaceC34385a.Companion.m108729b(companion, interfaceC34116n, null, "Failed to fetch IAJF V2 create-account screens", dVar, cVar3, 2, null);
            if (objM108729b != obj) {
            }
            return obj;
        }
        if (i14 == 1) {
            AbstractC34132o.m107864I(objM108729b);
        } else {
            if (i14 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            interfaceC34385a = (InterfaceC34385a) cVar3.f51420x;
            AbstractC34132o.m107864I(objM108729b);
        }
        list = (List) objM108729b;
        if (interfaceC34385a instanceof InterfaceC34385a.c) {
            if (interfaceC34385a instanceof InterfaceC34385a.b) {
                return new InterfaceC14176e.b(null, null, null, null, EnumC14168b0.ERROR, false, null, false, null, false, false, null, null, SignUpSource.IAJF_V2, null, null, null, 122863, null);
            }
            throw new NoWhenBranchMatchedException();
        }
        cVar2 = (InterfaceC34385a.c) interfaceC34385a;
        List<DesignSystemModel> items = ((ActivationFlowCreateAccountResponse) cVar2.m108735a()).getActivationBff().getItems();
        arrayList = new ArrayList();
        for (Object obj2 : items) {
            if (obj2 instanceof ActivationFlowStepModel) {
                arrayList.add(obj2);
            }
        }
        if (arrayList.isEmpty()) {
            this.logger.mo85222m("IAJF V2 create-account BFF returned an empty list of screens.", new AbstractC30556a.a[0]);
            return new InterfaceC14176e.b(null, null, null, null, EnumC14168b0.ERROR, false, null, false, null, false, false, null, null, SignUpSource.IAJF_V2, null, null, null, 122863, null);
        }
        return new InterfaceC14176e.b(arrayList, new C26418e(0, arrayList.size(), 0, ActivationFlowDestination.IN_APP_JOIN_FLOW, null), ((ActivationFlowCreateAccountResponse) cVar2.m108735a()).getActivationBff().getCountries(), null, EnumC14168b0.CONTENT, false, null, false, null, false, false, null, null, SignUpSource.IAJF_V2, list, null, null, 106472, null);
        InterfaceC34385a interfaceC34385a2 = (InterfaceC34385a) objM108729b;
        cVar3.f51419w = null;
        cVar3.f51420x = interfaceC34385a2;
        cVar3.f51418E = 2;
        Object objM40500f = m40500f("IAJF V2 create-account", cVar3);
        if (objM40500f != obj) {
            interfaceC34385a = interfaceC34385a2;
            objM108729b = objM40500f;
            list = (List) objM108729b;
            if (interfaceC34385a instanceof InterfaceC34385a.c) {
                if (interfaceC34385a instanceof InterfaceC34385a.b) {
                    return new InterfaceC14176e.b(null, null, null, null, EnumC14168b0.ERROR, false, null, false, null, false, false, null, null, SignUpSource.IAJF_V2, null, null, null, 122863, null);
                }
                throw new NoWhenBranchMatchedException();
            }
            cVar2 = (InterfaceC34385a.c) interfaceC34385a;
            List<DesignSystemModel> items2 = ((ActivationFlowCreateAccountResponse) cVar2.m108735a()).getActivationBff().getItems();
            arrayList = new ArrayList();
            while (r1.hasNext()) {
                if (obj2 instanceof ActivationFlowStepModel) {
                    arrayList.add(obj2);
                }
            }
            if (arrayList.isEmpty()) {
                this.logger.mo85222m("IAJF V2 create-account BFF returned an empty list of screens.", new AbstractC30556a.a[0]);
                return new InterfaceC14176e.b(null, null, null, null, EnumC14168b0.ERROR, false, null, false, null, false, false, null, null, SignUpSource.IAJF_V2, null, null, null, 122863, null);
            }
            return new InterfaceC14176e.b(arrayList, new C26418e(0, arrayList.size(), 0, ActivationFlowDestination.IN_APP_JOIN_FLOW, null), ((ActivationFlowCreateAccountResponse) cVar2.m108735a()).getActivationBff().getCountries(), null, EnumC14168b0.CONTENT, false, null, false, null, false, false, null, null, SignUpSource.IAJF_V2, list, null, null, 106472, null);
        }
        return obj;
    }

    /* JADX WARN: Code duplicated, block: B:39:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:41:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:44:0x0114  */
    /* JADX WARN: Code duplicated, block: B:46:0x0126  */
    /* JADX WARN: Code duplicated, block: B:60:0x0153 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:63:0x0131 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    /* JADX INFO: renamed from: e */
    public final Object m40503e(InterfaceC30057d<? super InterfaceC14176e> interfaceC30057d) {
        e eVar;
        List list;
        String str;
        ArrayList arrayList;
        ArrayList arrayList2;
        if (interfaceC30057d instanceof e) {
            eVar = (e) interfaceC30057d;
            int i13 = eVar.f51426E;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                eVar.f51426E = i13 - Integer.MIN_VALUE;
            } else {
                eVar = new e(interfaceC30057d);
            }
        } else {
            eVar = new e(interfaceC30057d);
        }
        e eVar2 = eVar;
        Object objM108729b = eVar2.f51429y;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = eVar2.f51426E;
        if (i14 == 0) {
            AbstractC34132o.m107864I(objM108729b);
            InterfaceC34385a.Companion companion = InterfaceC34385a.INSTANCE;
            InterfaceC34116n interfaceC34116n = this.logger;
            f fVar = new f(null);
            eVar2.f51426E = 1;
            objM108729b = InterfaceC34385a.Companion.m108729b(companion, interfaceC34116n, null, "Failed to fetch IAJF V2 email screen", fVar, eVar2, 2, null);
            if (objM108729b != enumC31071a) {
            }
            return enumC31071a;
        }
        if (i14 == 1) {
            AbstractC34132o.m107864I(objM108729b);
        } else {
            if (i14 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            list = (List) eVar2.f51428x;
            AbstractC34132o.m107864I(objM108729b);
        }
        str = (String) objM108729b;
        List<DesignSystemModel> list2 = list;
        arrayList = new ArrayList(AbstractC25267u.m74163i0(list2, 10));
        for (DesignSystemModel designSystemModelCopy$default : list2) {
            if (designSystemModelCopy$default instanceof EnterEmailStepModel) {
                EnterEmailStepModel enterEmailStepModel = (EnterEmailStepModel) designSystemModelCopy$default;
                List<ActivationFlowTextEntry> textEntries = enterEmailStepModel.getTextEntries();
                arrayList2 = new ArrayList(AbstractC25267u.m74163i0(textEntries, 10));
                for (ActivationFlowTextEntry activationFlowTextEntryCopy$default : textEntries) {
                    if (AbstractC39421y.m125921F(activationFlowTextEntryCopy$default.getFieldType(), "EMAIL", true)) {
                        activationFlowTextEntryCopy$default = ActivationFlowTextEntry.copy$default(activationFlowTextEntryCopy$default, null, null, str, null, false, 27, null);
                    }
                    arrayList2.add(activationFlowTextEntryCopy$default);
                }
                designSystemModelCopy$default = EnterEmailStepModel.copy$default(enterEmailStepModel, null, null, arrayList2, null, null, null, null, null, null, null, null, 2043, null);
            }
            arrayList.add(designSystemModelCopy$default);
        }
        return new InterfaceC14176e.b(arrayList, new C26418e(0, list.size(), 0, ActivationFlowDestination.IN_APP_JOIN_FLOW, null), null, null, EnumC14168b0.CONTENT, false, null, false, null, false, false, null, null, SignUpSource.IAJF_V2, null, null, null, 122860, null);
        InterfaceC34385a interfaceC34385a = (InterfaceC34385a) objM108729b;
        if (!(interfaceC34385a instanceof InterfaceC34385a.c)) {
            if (interfaceC34385a instanceof InterfaceC34385a.b) {
                return new InterfaceC14176e.b(null, null, null, null, EnumC14168b0.ERROR, false, null, false, null, false, false, null, null, SignUpSource.IAJF_V2, null, null, null, 122863, null);
            }
            throw new NoWhenBranchMatchedException();
        }
        List<DesignSystemModel> items = ((InAppJoinFlowResponse) ((InterfaceC34385a.c) interfaceC34385a).m108735a()).getItems();
        ArrayList arrayList3 = new ArrayList();
        for (Object obj : items) {
            if (obj instanceof ActivationFlowStepModel) {
                arrayList3.add(obj);
            }
        }
        if (arrayList3.isEmpty()) {
            this.logger.mo85222m("IAJF V2 BFF returned an empty list of screens.", new AbstractC30556a.a[0]);
            return new InterfaceC14176e.b(null, null, null, null, EnumC14168b0.ERROR, false, null, false, null, false, false, null, null, SignUpSource.IAJF_V2, null, null, null, 122863, null);
        }
        EmailDataStoreHelper emailDataStoreHelper = this.emailDataStoreHelper;
        eVar2.f51427w = null;
        eVar2.f51428x = arrayList3;
        eVar2.f51426E = 2;
        objM108729b = emailDataStoreHelper.getEmail(eVar2);
        if (objM108729b != enumC31071a) {
            list = arrayList3;
            str = (String) objM108729b;
            List<DesignSystemModel> list3 = list;
            arrayList = new ArrayList(AbstractC25267u.m74163i0(list3, 10));
            while (r1.hasNext()) {
                if (designSystemModelCopy$default instanceof EnterEmailStepModel) {
                    EnterEmailStepModel enterEmailStepModel2 = (EnterEmailStepModel) designSystemModelCopy$default;
                    List<ActivationFlowTextEntry> textEntries2 = enterEmailStepModel2.getTextEntries();
                    arrayList2 = new ArrayList(AbstractC25267u.m74163i0(textEntries2, 10));
                    while (r14.hasNext()) {
                        if (AbstractC39421y.m125921F(activationFlowTextEntryCopy$default.getFieldType(), "EMAIL", true)) {
                            activationFlowTextEntryCopy$default = ActivationFlowTextEntry.copy$default(activationFlowTextEntryCopy$default, null, null, str, null, false, 27, null);
                        }
                        arrayList2.add(activationFlowTextEntryCopy$default);
                    }
                    designSystemModelCopy$default = EnterEmailStepModel.copy$default(enterEmailStepModel2, null, null, arrayList2, null, null, null, null, null, null, null, null, 2043, null);
                }
                arrayList.add(designSystemModelCopy$default);
            }
            return new InterfaceC14176e.b(arrayList, new C26418e(0, list.size(), 0, ActivationFlowDestination.IN_APP_JOIN_FLOW, null), null, null, EnumC14168b0.CONTENT, false, null, false, null, false, false, null, null, SignUpSource.IAJF_V2, null, null, null, 122860, null);
        }
        return enumC31071a;
    }

    public /* synthetic */ C14189k0(ActivationApi activationApi, EmailDataStoreHelper emailDataStoreHelper, C37411b c37411b, InterfaceC34116n interfaceC34116n, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(activationApi, emailDataStoreHelper, c37411b, (i13 & 8) != 0 ? InterfaceC34116n.INSTANCE.m107848a("IAJFV2BffFetcher") : interfaceC34116n);
    }
}
