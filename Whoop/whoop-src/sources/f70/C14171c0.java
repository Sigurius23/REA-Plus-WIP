package f70;

import androidx.health.platform.client.proto.C1533u;
import com.whoop.activation.domain.ActivationAuthenticatedApi;
import com.whoop.activation.domain.models.ActivationFlowStepModel;
import com.whoop.activation.domain.models.HwOnlyAfterActivationResponse;
import com.whoop.activation.view.navigation.ActivationFlowDestination;
import com.whoop.design.models.DesignSystemModel;
import com.whoop.domain.model.WhoopStrapInfo;
import h80.C17003c;
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
import q83.InterfaceC30057d;
import qr2.AbstractC30556a;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import tr2.InterfaceC34116n;
import u02.InterfaceC34385a;

/* JADX INFO: renamed from: f70.c0 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0001\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u001c\u0010\u000f\u001a\u00020\u000e2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\fH\u0086@¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0013R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, m65681d2 = {"Lf70/c0;", "", "Lcom/whoop/activation/domain/ActivationAuthenticatedApi;", "activationAuthenticatedApi", "Lp70/b;", "whoopStrapInfoProvider", "Lh80/c;", "analyticsHelper", "Ltr2/n;", "logger", "<init>", "(Lcom/whoop/activation/domain/ActivationAuthenticatedApi;Lp70/b;Lh80/c;Ltr2/n;)V", "Lf70/q0;", "memberInfo", "Lf70/e;", "b", "(Lf70/q0;Lq83/d;)Ljava/lang/Object;", "a", "Lcom/whoop/activation/domain/ActivationAuthenticatedApi;", "Lp70/b;", "c", "Lh80/c;", "d", "Ltr2/n;", "activation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C14171c0 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final ActivationAuthenticatedApi activationAuthenticatedApi;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final InterfaceC28954b whoopStrapInfoProvider;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final C17003c analyticsHelper;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final InterfaceC34116n logger;

    /* JADX INFO: renamed from: f70.c0$a */
    /* JADX INFO: loaded from: classes6.dex */
    @InterfaceC32271e(m100429c = "com.whoop.activation.domain.interactors.activation.HwOnlyActivationHelper", m100430f = "HwOnlyActivationHelper.kt", m100431l = {C1533u.SUB_TYPE_DATA_LISTS_FIELD_NUMBER}, m100432m = "fetchAfterActivationScreens", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a extends AbstractC32269c {

        /* JADX INFO: renamed from: E */
        int f51099E;

        /* JADX INFO: renamed from: w */
        Object f51100w;

        /* JADX INFO: renamed from: x */
        Object f51101x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f51102y;

        public a(InterfaceC30057d<? super a> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f51102y = obj;
            this.f51099E |= Integer.MIN_VALUE;
            return C14171c0.this.m40367b(null, this);
        }
    }

    /* JADX INFO: renamed from: f70.c0$b */
    /* JADX INFO: loaded from: classes6.dex */
    @InterfaceC32271e(m100429c = "com.whoop.activation.domain.interactors.activation.HwOnlyActivationHelper$fetchAfterActivationScreens$response$1", m100430f = "HwOnlyActivationHelper.kt", m100431l = {C1533u.RECORDING_METHOD_FIELD_NUMBER}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, m65681d2 = {"<anonymous>", "Lcom/whoop/activation/domain/models/HwOnlyAfterActivationResponse;"}, m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b extends AbstractC32275i implements Function1 {

        /* JADX INFO: renamed from: w */
        int f51104w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ String f51106y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str, InterfaceC30057d<? super b> interfaceC30057d) {
            super(1, interfaceC30057d);
            this.f51106y = str;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(InterfaceC30057d<?> interfaceC30057d) {
            return C14171c0.this.new b(this.f51106y, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f51104w;
            if (i13 != 0) {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
                return obj;
            }
            AbstractC34132o.m107864I(obj);
            ActivationAuthenticatedApi activationAuthenticatedApi = C14171c0.this.activationAuthenticatedApi;
            String str = this.f51106y;
            this.f51104w = 1;
            Object objFetchHwOnlyAfterActivation = activationAuthenticatedApi.fetchHwOnlyAfterActivation(str, this);
            return objFetchHwOnlyAfterActivation == enumC31071a ? enumC31071a : objFetchHwOnlyAfterActivation;
        }

        @Override // p715kotlin.jvm.functions.Function1
        public final Object invoke(InterfaceC30057d<? super HwOnlyAfterActivationResponse> interfaceC30057d) {
            return ((b) create(interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }
    }

    public C14171c0(ActivationAuthenticatedApi activationAuthenticatedApi, InterfaceC28954b whoopStrapInfoProvider, C17003c analyticsHelper, InterfaceC34116n logger) {
        AbstractC22676k.m65750j(activationAuthenticatedApi, "activationAuthenticatedApi");
        AbstractC22676k.m65750j(whoopStrapInfoProvider, "whoopStrapInfoProvider");
        AbstractC22676k.m65750j(analyticsHelper, "analyticsHelper");
        AbstractC22676k.m65750j(logger, "logger");
        this.activationAuthenticatedApi = activationAuthenticatedApi;
        this.whoopStrapInfoProvider = whoopStrapInfoProvider;
        this.analyticsHelper = analyticsHelper;
        this.logger = logger;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    /* JADX INFO: renamed from: b */
    public final Object m40367b(C14201q0 c14201q0, InterfaceC30057d<? super InterfaceC14176e> interfaceC30057d) {
        a aVar;
        C14201q0 c14201q1;
        Object objM108729b;
        if (interfaceC30057d instanceof a) {
            aVar = (a) interfaceC30057d;
            int i13 = aVar.f51099E;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                aVar.f51099E = i13 - Integer.MIN_VALUE;
            } else {
                aVar = new a(interfaceC30057d);
            }
        } else {
            aVar = new a(interfaceC30057d);
        }
        a aVar2 = aVar;
        Object obj = aVar2.f51102y;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = aVar2.f51099E;
        if (i14 == 0) {
            AbstractC34132o.m107864I(obj);
            WhoopStrapInfo whoopStrapInfoMo87912a = this.whoopStrapInfoProvider.mo87912a();
            String strapSignature = whoopStrapInfoMo87912a != null ? whoopStrapInfoMo87912a.getStrapSignature() : null;
            InterfaceC34385a.Companion companion = InterfaceC34385a.INSTANCE;
            InterfaceC34116n interfaceC34116n = this.logger;
            b bVar = new b(strapSignature, null);
            c14201q1 = c14201q0;
            aVar2.f51100w = c14201q1;
            aVar2.f51101x = null;
            aVar2.f51099E = 1;
            objM108729b = InterfaceC34385a.Companion.m108729b(companion, interfaceC34116n, null, "Failed to fetch after-activation screens", bVar, aVar2, 2, null);
            if (objM108729b == enumC31071a) {
                return enumC31071a;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C14201q0 c14201q2 = (C14201q0) aVar2.f51100w;
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
        InterfaceC34385a.c cVar = (InterfaceC34385a.c) interfaceC34385a;
        List<DesignSystemModel> items = ((HwOnlyAfterActivationResponse) cVar.m108735a()).getItems();
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : items) {
            if (obj2 instanceof ActivationFlowStepModel) {
                arrayList.add(obj2);
            }
        }
        if (arrayList.isEmpty()) {
            this.logger.mo85222m("After-activation BFF returned an empty list of screens", new AbstractC30556a.a[0]);
            return new InterfaceC14176e.b(null, null, null, null, EnumC14168b0.ERROR, false, null, false, null, false, false, null, null, null, null, null, null, 131055, null);
        }
        this.analyticsHelper.m47938F(((HwOnlyAfterActivationResponse) cVar.m108735a()).getEventProperties());
        return new InterfaceC14176e.b(arrayList, new C26418e(0, arrayList.size(), 0, ActivationFlowDestination.HW_ONLY_AFTER_ACTIVATION, null), null, c14201q1 == null ? new C14201q0(null, null, null, null, null, null, null, null, false, false, false, null, null, null, null, null, null, null, null, false, false, false, null, null, null, null, 0, false, false, false, 1073741823, null) : c14201q1, EnumC14168b0.CONTENT, false, null, false, null, false, false, null, null, null, null, null, ((HwOnlyAfterActivationResponse) cVar.m108735a()).getOnComplete(), 65508, null);
    }

    public /* synthetic */ C14171c0(ActivationAuthenticatedApi activationAuthenticatedApi, InterfaceC28954b interfaceC28954b, C17003c c17003c, InterfaceC34116n interfaceC34116n, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(activationAuthenticatedApi, interfaceC28954b, c17003c, (i13 & 8) != 0 ? InterfaceC34116n.INSTANCE.m107848a("HwOnlyActivationHelper") : interfaceC34116n);
    }
}
