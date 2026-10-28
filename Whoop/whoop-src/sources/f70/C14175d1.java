package f70;

import androidx.health.platform.client.proto.C1533u;
import com.whoop.activation.domain.interactors.payments.ActivationMembershipApi;
import com.whoop.activation.domain.models.ActivationFlowStepModel;
import com.whoop.activation.domain.models.steps.FinalizedUpcycleDetails;
import com.whoop.activation.domain.models.steps.PlanOption;
import com.whoop.activation.domain.models.steps.UpcyclePlanPickerModel;
import com.whoop.design.models.DesignSystemModel;
import com.whoop.navigation.C9598e;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import l83.C23454a0;
import m83.AbstractC25267u;
import p505ts.AbstractC34132o;
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

/* JADX INFO: renamed from: f70.d1 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J-\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\t0\b*\b\u0012\u0004\u0012\u00020\t0\b2\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ$\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\r2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0086@¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0016¨\u0006\u0017"}, m65681d2 = {"Lf70/d1;", "", "Lcom/whoop/activation/domain/interactors/payments/ActivationMembershipApi;", "membershipApi", "Ltr2/n;", "logger", "<init>", "(Lcom/whoop/activation/domain/interactors/payments/ActivationMembershipApi;Ltr2/n;)V", "", "Lcom/whoop/activation/domain/models/steps/PlanOption;", "previous", "d", "(Ljava/util/List;Ljava/util/List;)Ljava/util/List;", "Lf70/e$b;", "prevDomainResult", "", "flow", "Lf70/f;", "b", "(Lf70/e$b;Ljava/lang/String;Lq83/d;)Ljava/lang/Object;", "a", "Lcom/whoop/activation/domain/interactors/payments/ActivationMembershipApi;", "Ltr2/n;", "activation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C14175d1 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final ActivationMembershipApi membershipApi;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final InterfaceC34116n logger;

    /* JADX INFO: renamed from: f70.d1$a */
    /* JADX INFO: loaded from: classes6.dex */
    @InterfaceC32271e(m100429c = "com.whoop.activation.domain.interactors.activation.UpcycleUpdateInfoHelper", m100430f = "UpcycleUpdateInfoHelper.kt", m100431l = {C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER}, m100432m = "fetchNewUpcycleInfo", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a extends AbstractC32269c {

        /* JADX INFO: renamed from: E */
        int f51215E;

        /* JADX INFO: renamed from: w */
        Object f51216w;

        /* JADX INFO: renamed from: x */
        Object f51217x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f51218y;

        public a(InterfaceC30057d<? super a> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f51218y = obj;
            this.f51215E |= Integer.MIN_VALUE;
            return C14175d1.this.m40415b(null, null, this);
        }
    }

    /* JADX INFO: renamed from: f70.d1$b */
    /* JADX INFO: loaded from: classes6.dex */
    @InterfaceC32271e(m100429c = "com.whoop.activation.domain.interactors.activation.UpcycleUpdateInfoHelper$fetchNewUpcycleInfo$result$1", m100430f = "UpcycleUpdateInfoHelper.kt", m100431l = {20}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, m65681d2 = {"<anonymous>", "Lcom/whoop/activation/domain/models/steps/FinalizedUpcycleDetails;"}, m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b extends AbstractC32275i implements Function1 {

        /* JADX INFO: renamed from: w */
        int f51220w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ String f51222y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str, InterfaceC30057d<? super b> interfaceC30057d) {
            super(1, interfaceC30057d);
            this.f51222y = str;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(InterfaceC30057d<?> interfaceC30057d) {
            return C14175d1.this.new b(this.f51222y, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f51220w;
            if (i13 != 0) {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
                return obj;
            }
            AbstractC34132o.m107864I(obj);
            ActivationMembershipApi activationMembershipApi = C14175d1.this.membershipApi;
            String str = this.f51222y;
            this.f51220w = 1;
            Object upcycleDetails = activationMembershipApi.getUpcycleDetails(str, this);
            return upcycleDetails == enumC31071a ? enumC31071a : upcycleDetails;
        }

        @Override // p715kotlin.jvm.functions.Function1
        public final Object invoke(InterfaceC30057d<? super FinalizedUpcycleDetails> interfaceC30057d) {
            return ((b) create(interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }
    }

    public C14175d1(ActivationMembershipApi membershipApi, InterfaceC34116n logger) {
        AbstractC22676k.m65750j(membershipApi, "membershipApi");
        AbstractC22676k.m65750j(logger, "logger");
        this.membershipApi = membershipApi;
        this.logger = logger;
    }

    /* JADX INFO: renamed from: c */
    public static /* synthetic */ Object m40413c(C14175d1 c14175d1, InterfaceC14176e.b bVar, String str, InterfaceC30057d interfaceC30057d, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            str = null;
        }
        return c14175d1.m40415b(bVar, str, interfaceC30057d);
    }

    /* JADX INFO: renamed from: d */
    private final List<PlanOption> m40414d(List<PlanOption> list, List<PlanOption> list2) {
        Object next;
        C9598e destination;
        List<PlanOption> list3 = list;
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(list3, 10));
        for (PlanOption planOptionCopy$default : list3) {
            if (planOptionCopy$default.getDestination() == null) {
                Iterator<T> it = list2.iterator();
                do {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                } while (((PlanOption) next).getCommitmentType() != planOptionCopy$default.getCommitmentType());
                PlanOption planOption = (PlanOption) next;
                if (planOption != null && (destination = planOption.getDestination()) != null) {
                    planOptionCopy$default = PlanOption.copy$default(planOptionCopy$default, null, null, null, null, null, false, null, null, null, null, null, destination, 2047, null);
                }
            }
            arrayList.add(planOptionCopy$default);
        }
        return arrayList;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    /* JADX INFO: renamed from: b */
    public final Object m40415b(InterfaceC14176e.b bVar, String str, InterfaceC30057d<? super C14178f> interfaceC30057d) {
        a aVar;
        InterfaceC14176e.b bVar2;
        if (interfaceC30057d instanceof a) {
            aVar = (a) interfaceC30057d;
            int i13 = aVar.f51215E;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                aVar.f51215E = i13 - Integer.MIN_VALUE;
            } else {
                aVar = new a(interfaceC30057d);
            }
        } else {
            aVar = new a(interfaceC30057d);
        }
        a aVar2 = aVar;
        Object obj = aVar2.f51218y;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = aVar2.f51215E;
        ArrayList arrayList = null;
        if (i14 == 0) {
            AbstractC34132o.m107864I(obj);
            InterfaceC34385a.Companion companion = InterfaceC34385a.INSTANCE;
            InterfaceC34116n interfaceC34116n = this.logger;
            b bVar3 = new b(str, null);
            aVar2.f51216w = bVar;
            aVar2.f51217x = null;
            aVar2.f51215E = 1;
            Object objM108729b = InterfaceC34385a.Companion.m108729b(companion, interfaceC34116n, null, "Failed to acquire upcycle updated info", bVar3, aVar2, 2, null);
            if (objM108729b == enumC31071a) {
                return enumC31071a;
            }
            bVar2 = bVar;
            obj = objM108729b;
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            InterfaceC14176e.b bVar4 = (InterfaceC14176e.b) aVar2.f51216w;
            AbstractC34132o.m107864I(obj);
            bVar2 = bVar4;
        }
        InterfaceC34385a interfaceC34385a = (InterfaceC34385a) obj;
        if (!(interfaceC34385a instanceof InterfaceC34385a.c)) {
            if (interfaceC34385a instanceof InterfaceC34385a.b) {
                return new C14178f(InterfaceC14176e.b.m40416b(bVar2, null, null, null, C14201q0.m40542b(bVar2.getMemberInfo(), null, null, null, null, null, null, null, null, false, false, false, null, null, null, null, null, null, null, null, false, false, false, null, null, null, null, 0, false, false, false, 1073479679, null), null, false, null, false, null, false, false, null, null, null, null, null, null, 131063, null), true);
            }
            throw new NoWhenBranchMatchedException();
        }
        FinalizedUpcycleDetails finalizedUpcycleDetails = (FinalizedUpcycleDetails) ((InterfaceC34385a.c) interfaceC34385a).m108735a();
        List<ActivationFlowStepModel> listM40428m = bVar2.m40428m();
        if (listM40428m != null) {
            List<ActivationFlowStepModel> list = listM40428m;
            arrayList = new ArrayList(AbstractC25267u.m74163i0(list, 10));
            for (DesignSystemModel designSystemModelCopy$default : list) {
                if (designSystemModelCopy$default instanceof UpcyclePlanPickerModel) {
                    UpcyclePlanPickerModel upcyclePlanPickerModel = (UpcyclePlanPickerModel) designSystemModelCopy$default;
                    designSystemModelCopy$default = UpcyclePlanPickerModel.copy$default(upcyclePlanPickerModel, null, null, m40414d(finalizedUpcycleDetails.getPlanPickerScreenContent(), upcyclePlanPickerModel.getPlanOptions()), null, null, null, null, null, null, 507, null);
                }
                arrayList.add(designSystemModelCopy$default);
            }
        }
        return new C14178f(InterfaceC14176e.b.m40416b(bVar2, arrayList, null, null, C14201q0.m40542b(bVar2.getMemberInfo(), null, null, null, null, null, null, null, null, false, false, false, null, null, null, null, null, null, null, finalizedUpcycleDetails.getJoinTodayScreenContent(), false, false, false, null, null, null, null, 0, false, false, false, 1073479679, null), null, false, null, false, null, false, false, null, null, null, null, null, null, 131062, null), true);
    }

    public /* synthetic */ C14175d1(ActivationMembershipApi activationMembershipApi, InterfaceC34116n interfaceC34116n, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(activationMembershipApi, (i13 & 2) != 0 ? InterfaceC34116n.INSTANCE.m107848a("UpcycleUpdateInfoHelper") : interfaceC34116n);
    }
}
