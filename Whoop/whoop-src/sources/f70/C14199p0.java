package f70;

import com.whoop.activation.domain.ActivationAuthenticatedApi;
import com.whoop.activation.domain.models.ActivationFlowStepModel;
import com.whoop.activation.domain.models.MedicarePermissionsBody;
import com.whoop.activation.domain.models.MedicarePermissionsResponse;
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

/* JADX INFO: renamed from: f70.p0 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0001\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u001c\u0010\u0011\u001a\u00020\u00102\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0086@¢\u0006\u0004\b\u0011\u0010\u0012J \u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015H\u0086@¢\u0006\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u001cR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u001dR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!¨\u0006\""}, m65681d2 = {"Lf70/p0;", "", "Lcom/whoop/activation/domain/ActivationAuthenticatedApi;", "activationAuthenticatedApi", "Lp70/b;", "whoopStrapInfoProvider", "Lf70/l;", "activationUserSessionCreator", "Lh80/c;", "analyticsHelper", "Ltr2/n;", "logger", "<init>", "(Lcom/whoop/activation/domain/ActivationAuthenticatedApi;Lp70/b;Lf70/l;Lh80/c;Ltr2/n;)V", "Lf70/q0;", "memberInfo", "Lf70/e;", "b", "(Lf70/q0;Lq83/d;)Ljava/lang/Object;", "Lf70/e$b;", "prevDomainResult", "", "authenticated", "Lf70/f;", "c", "(Lf70/e$b;ZLq83/d;)Ljava/lang/Object;", "a", "Lcom/whoop/activation/domain/ActivationAuthenticatedApi;", "Lp70/b;", "Lf70/l;", "d", "Lh80/c;", "e", "Ltr2/n;", "activation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C14199p0 {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final ActivationAuthenticatedApi activationAuthenticatedApi;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final InterfaceC28954b whoopStrapInfoProvider;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final C14190l activationUserSessionCreator;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final C17003c analyticsHelper;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final InterfaceC34116n logger;

    /* JADX INFO: renamed from: f70.p0$a */
    /* JADX INFO: loaded from: classes6.dex */
    @InterfaceC32271e(m100429c = "com.whoop.activation.domain.interactors.activation.MedicarePermissionsHelper", m100430f = "MedicarePermissionsHelper.kt", m100431l = {24}, m100432m = "fetchMedicarePermissionsScreens", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a extends AbstractC32269c {

        /* JADX INFO: renamed from: E */
        int f51573E;

        /* JADX INFO: renamed from: w */
        Object f51574w;

        /* JADX INFO: renamed from: x */
        Object f51575x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f51576y;

        public a(InterfaceC30057d<? super a> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f51576y = obj;
            this.f51573E |= Integer.MIN_VALUE;
            return C14199p0.this.m40532b(null, this);
        }
    }

    /* JADX INFO: renamed from: f70.p0$b */
    /* JADX INFO: loaded from: classes6.dex */
    @InterfaceC32271e(m100429c = "com.whoop.activation.domain.interactors.activation.MedicarePermissionsHelper$fetchMedicarePermissionsScreens$response$1", m100430f = "MedicarePermissionsHelper.kt", m100431l = {25}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, m65681d2 = {"<anonymous>", "Lcom/whoop/activation/domain/models/MedicarePermissionsResponse;"}, m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b extends AbstractC32275i implements Function1 {

        /* JADX INFO: renamed from: w */
        int f51578w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ String f51580y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str, InterfaceC30057d<? super b> interfaceC30057d) {
            super(1, interfaceC30057d);
            this.f51580y = str;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(InterfaceC30057d<?> interfaceC30057d) {
            return C14199p0.this.new b(this.f51580y, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f51578w;
            if (i13 != 0) {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
                return obj;
            }
            AbstractC34132o.m107864I(obj);
            ActivationAuthenticatedApi activationAuthenticatedApi = C14199p0.this.activationAuthenticatedApi;
            String str = this.f51580y;
            this.f51578w = 1;
            Object objFetchMedicarePermissions = activationAuthenticatedApi.fetchMedicarePermissions(str, this);
            return objFetchMedicarePermissions == enumC31071a ? enumC31071a : objFetchMedicarePermissions;
        }

        @Override // p715kotlin.jvm.functions.Function1
        public final Object invoke(InterfaceC30057d<? super MedicarePermissionsResponse> interfaceC30057d) {
            return ((b) create(interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }
    }

    /* JADX INFO: renamed from: f70.p0$c */
    /* JADX INFO: loaded from: classes6.dex */
    @InterfaceC32271e(m100429c = "com.whoop.activation.domain.interactors.activation.MedicarePermissionsHelper", m100430f = "MedicarePermissionsHelper.kt", m100431l = {65, 71}, m100432m = "submitMedicarePermissions", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c extends AbstractC32269c {

        /* JADX INFO: renamed from: E */
        boolean f51581E;

        /* JADX INFO: renamed from: F */
        /* synthetic */ Object f51582F;

        /* JADX INFO: renamed from: H */
        int f51584H;

        /* JADX INFO: renamed from: w */
        Object f51585w;

        /* JADX INFO: renamed from: x */
        Object f51586x;

        /* JADX INFO: renamed from: y */
        Object f51587y;

        /* JADX INFO: renamed from: z */
        Object f51588z;

        public c(InterfaceC30057d<? super c> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f51582F = obj;
            this.f51584H |= Integer.MIN_VALUE;
            return C14199p0.this.m40533c(null, false, this);
        }
    }

    /* JADX INFO: renamed from: f70.p0$d */
    /* JADX INFO: loaded from: classes6.dex */
    @InterfaceC32271e(m100429c = "com.whoop.activation.domain.interactors.activation.MedicarePermissionsHelper$submitMedicarePermissions$result$1", m100430f = "MedicarePermissionsHelper.kt", m100431l = {66}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m65681d2 = {"Ll83/a0;", "<anonymous>", "()V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class d extends AbstractC32275i implements Function1 {

        /* JADX INFO: renamed from: w */
        int f51589w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ String f51591y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ MedicarePermissionsBody f51592z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(String str, MedicarePermissionsBody medicarePermissionsBody, InterfaceC30057d<? super d> interfaceC30057d) {
            super(1, interfaceC30057d);
            this.f51591y = str;
            this.f51592z = medicarePermissionsBody;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(InterfaceC30057d<?> interfaceC30057d) {
            return C14199p0.this.new d(this.f51591y, this.f51592z, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f51589w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                ActivationAuthenticatedApi activationAuthenticatedApi = C14199p0.this.activationAuthenticatedApi;
                String str = this.f51591y;
                MedicarePermissionsBody medicarePermissionsBody = this.f51592z;
                this.f51589w = 1;
                if (activationAuthenticatedApi.putMedicarePermissions(str, medicarePermissionsBody, this) == enumC31071a) {
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
            return ((d) create(interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }
    }

    public C14199p0(ActivationAuthenticatedApi activationAuthenticatedApi, InterfaceC28954b whoopStrapInfoProvider, C14190l activationUserSessionCreator, C17003c analyticsHelper, InterfaceC34116n logger) {
        AbstractC22676k.m65750j(activationAuthenticatedApi, "activationAuthenticatedApi");
        AbstractC22676k.m65750j(whoopStrapInfoProvider, "whoopStrapInfoProvider");
        AbstractC22676k.m65750j(activationUserSessionCreator, "activationUserSessionCreator");
        AbstractC22676k.m65750j(analyticsHelper, "analyticsHelper");
        AbstractC22676k.m65750j(logger, "logger");
        this.activationAuthenticatedApi = activationAuthenticatedApi;
        this.whoopStrapInfoProvider = whoopStrapInfoProvider;
        this.activationUserSessionCreator = activationUserSessionCreator;
        this.analyticsHelper = analyticsHelper;
        this.logger = logger;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    /* JADX INFO: renamed from: b */
    public final Object m40532b(C14201q0 c14201q0, InterfaceC30057d<? super InterfaceC14176e> interfaceC30057d) {
        a aVar;
        C14201q0 c14201q1;
        Object objM108729b;
        if (interfaceC30057d instanceof a) {
            aVar = (a) interfaceC30057d;
            int i13 = aVar.f51573E;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                aVar.f51573E = i13 - Integer.MIN_VALUE;
            } else {
                aVar = new a(interfaceC30057d);
            }
        } else {
            aVar = new a(interfaceC30057d);
        }
        a aVar2 = aVar;
        Object obj = aVar2.f51576y;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = aVar2.f51573E;
        if (i14 == 0) {
            AbstractC34132o.m107864I(obj);
            WhoopStrapInfo whoopStrapInfoMo87912a = this.whoopStrapInfoProvider.mo87912a();
            String strapSignature = whoopStrapInfoMo87912a != null ? whoopStrapInfoMo87912a.getStrapSignature() : null;
            InterfaceC34385a.Companion companion = InterfaceC34385a.INSTANCE;
            InterfaceC34116n interfaceC34116n = this.logger;
            b bVar = new b(strapSignature, null);
            c14201q1 = c14201q0;
            aVar2.f51574w = c14201q1;
            aVar2.f51575x = null;
            aVar2.f51573E = 1;
            objM108729b = InterfaceC34385a.Companion.m108729b(companion, interfaceC34116n, null, "Failed to fetch Medicare permissions screens", bVar, aVar2, 2, null);
            if (objM108729b == enumC31071a) {
                return enumC31071a;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C14201q0 c14201q2 = (C14201q0) aVar2.f51574w;
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
        List<DesignSystemModel> items = ((MedicarePermissionsResponse) cVar.m108735a()).getItems();
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : items) {
            if (obj2 instanceof ActivationFlowStepModel) {
                arrayList.add(obj2);
            }
        }
        if (arrayList.isEmpty()) {
            this.logger.mo85222m("Medicare permissions BFF returned an empty list of screens", new AbstractC30556a.a[0]);
            return new InterfaceC14176e.b(null, null, null, null, EnumC14168b0.ERROR, false, null, false, null, false, false, null, null, null, null, null, null, 131055, null);
        }
        this.analyticsHelper.m47939G(((MedicarePermissionsResponse) cVar.m108735a()).getEventProperties());
        return new InterfaceC14176e.b(arrayList, new C26418e(0, arrayList.size(), 0, ActivationFlowDestination.MEDICARE_PERMISSIONS, null), null, c14201q1 == null ? new C14201q0(null, null, null, null, null, null, null, null, false, false, false, null, null, null, null, null, null, null, null, false, false, false, null, null, null, null, 0, false, false, false, 1073741823, null) : c14201q1, EnumC14168b0.CONTENT, false, null, false, null, false, false, null, null, null, null, null, ((MedicarePermissionsResponse) cVar.m108735a()).getOnComplete(), 65508, null);
    }

    /* JADX WARN: Code duplicated, block: B:34:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    /* JADX WARN: Instruction removed from duplicated block: B:34:0x00cb, please report this as an issue */
    /* JADX INFO: renamed from: c */
    public final Object m40533c(InterfaceC14176e.b bVar, boolean z4, InterfaceC30057d<? super C14178f> interfaceC30057d) {
        c cVar;
        InterfaceC14176e.b bVar2;
        boolean z13;
        InterfaceC14176e.b bVar3;
        InterfaceC14176e.b bVar4;
        AbstractC14188k abstractC14188k;
        if (interfaceC30057d instanceof c) {
            cVar = (c) interfaceC30057d;
            int i13 = cVar.f51584H;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                cVar.f51584H = i13 - Integer.MIN_VALUE;
            } else {
                cVar = new c(interfaceC30057d);
            }
        } else {
            cVar = new c(interfaceC30057d);
        }
        c cVar2 = cVar;
        Object objM40505b = cVar2.f51582F;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = cVar2.f51584H;
        if (i14 == 0) {
            AbstractC34132o.m107864I(objM40505b);
            WhoopStrapInfo whoopStrapInfoMo87912a = this.whoopStrapInfoProvider.mo87912a();
            String strapSignature = whoopStrapInfoMo87912a != null ? whoopStrapInfoMo87912a.getStrapSignature() : null;
            MedicarePermissionsBody medicarePermissionsBody = new MedicarePermissionsBody(bVar.getMemberInfo().m40554g());
            InterfaceC34385a.Companion companion = InterfaceC34385a.INSTANCE;
            InterfaceC34116n interfaceC34116n = this.logger;
            d dVar = new d(strapSignature, medicarePermissionsBody, null);
            cVar2.f51585w = bVar;
            cVar2.f51586x = null;
            cVar2.f51587y = null;
            cVar2.f51581E = z4;
            cVar2.f51584H = 1;
            Object objM108729b = InterfaceC34385a.Companion.m108729b(companion, interfaceC34116n, null, "Failed to submit medicare permissions", dVar, cVar2, 2, null);
            if (objM108729b != enumC31071a) {
                bVar2 = bVar;
                objM40505b = objM108729b;
                z13 = z4;
            }
            return enumC31071a;
        }
        if (i14 == 1) {
            z13 = cVar2.f51581E;
            InterfaceC14176e.b bVar5 = (InterfaceC14176e.b) cVar2.f51585w;
            AbstractC34132o.m107864I(objM40505b);
            bVar2 = bVar5;
        } else {
            if (i14 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bVar4 = (InterfaceC14176e.b) cVar2.f51585w;
            AbstractC34132o.m107864I(objM40505b);
        }
        abstractC14188k = (AbstractC14188k) objM40505b;
        if (abstractC14188k instanceof AbstractC14188k.a) {
            this.logger.mo85222m("Failed to bootstrap session after Medicare permissions submit: " + ((AbstractC14188k.a) abstractC14188k).getReason(), new AbstractC30556a.a[0]);
        }
        bVar3 = bVar4;
        return new C14178f(InterfaceC14176e.b.m40416b(bVar3, null, null, null, null, null, false, null, false, null, false, false, null, null, null, null, null, null, 131039, null), true);
        InterfaceC34385a interfaceC34385a = (InterfaceC34385a) objM40505b;
        if (!(interfaceC34385a instanceof InterfaceC34385a.c)) {
            if (!(interfaceC34385a instanceof InterfaceC34385a.b)) {
                throw new NoWhenBranchMatchedException();
            }
            this.logger.mo85222m("Failed to submit medicare permissions: " + interfaceC34385a, new AbstractC30556a.a[0]);
            return new C14178f(InterfaceC14176e.b.m40416b(bVar2, null, null, null, null, null, true, null, false, null, false, false, null, null, null, null, null, null, 131039, null), false);
        }
        if (z13) {
            C14190l c14190l = this.activationUserSessionCreator;
            cVar2.f51585w = bVar2;
            cVar2.f51586x = null;
            cVar2.f51587y = null;
            cVar2.f51588z = null;
            cVar2.f51581E = z13;
            cVar2.f51584H = 2;
            objM40505b = c14190l.m40505b(cVar2);
            if (objM40505b != enumC31071a) {
                bVar4 = bVar2;
                abstractC14188k = (AbstractC14188k) objM40505b;
                if (abstractC14188k instanceof AbstractC14188k.a) {
                    this.logger.mo85222m("Failed to bootstrap session after Medicare permissions submit: " + ((AbstractC14188k.a) abstractC14188k).getReason(), new AbstractC30556a.a[0]);
                }
                bVar3 = bVar4;
            }
            return enumC31071a;
        }
        bVar3 = bVar2;
        return new C14178f(InterfaceC14176e.b.m40416b(bVar3, null, null, null, null, null, false, null, false, null, false, false, null, null, null, null, null, null, 131039, null), true);
    }

    public /* synthetic */ C14199p0(ActivationAuthenticatedApi activationAuthenticatedApi, InterfaceC28954b interfaceC28954b, C14190l c14190l, C17003c c17003c, InterfaceC34116n interfaceC34116n, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(activationAuthenticatedApi, interfaceC28954b, c14190l, c17003c, (i13 & 16) != 0 ? InterfaceC34116n.INSTANCE.m107848a("MedicarePermissionsHelper") : interfaceC34116n);
    }
}
