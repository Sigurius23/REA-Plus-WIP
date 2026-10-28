package f70;

import androidx.health.platform.client.proto.C1533u;
import com.whoop.activation.domain.ActivationAuthenticatedApi;
import com.whoop.activation.domain.models.ActivationFlowStepModel;
import com.whoop.activation.domain.models.AlPermissionsBody;
import com.whoop.activation.domain.models.AlPermissionsResponse;
import com.whoop.activation.view.navigation.ActivationFlowDestination;
import com.whoop.design.models.DesignSystemModel;
import h80.C17003c;
import java.util.ArrayList;
import java.util.List;
import l83.C23454a0;
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

/* JADX INFO: renamed from: f70.o */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0001\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u001c\u0010\u000f\u001a\u00020\u000e2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\fH\u0086@¢\u0006\u0004\b\u000f\u0010\u0010J \u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0086@¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u001aR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u001bR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, m65681d2 = {"Lf70/o;", "", "Lcom/whoop/activation/domain/ActivationAuthenticatedApi;", "activationAuthenticatedApi", "Lf70/l;", "activationUserSessionCreator", "Lh80/c;", "analyticsHelper", "Ltr2/n;", "logger", "<init>", "(Lcom/whoop/activation/domain/ActivationAuthenticatedApi;Lf70/l;Lh80/c;Ltr2/n;)V", "Lf70/q0;", "memberInfo", "Lf70/e;", "b", "(Lf70/q0;Lq83/d;)Ljava/lang/Object;", "Lf70/e$b;", "prevDomainResult", "", "authenticated", "Lf70/f;", "c", "(Lf70/e$b;ZLq83/d;)Ljava/lang/Object;", "a", "Lcom/whoop/activation/domain/ActivationAuthenticatedApi;", "Lf70/l;", "Lh80/c;", "d", "Ltr2/n;", "activation_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C14196o {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final ActivationAuthenticatedApi activationAuthenticatedApi;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final C14190l activationUserSessionCreator;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final C17003c analyticsHelper;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final InterfaceC34116n logger;

    /* JADX INFO: renamed from: f70.o$a */
    /* JADX INFO: loaded from: classes6.dex */
    @InterfaceC32271e(m100429c = "com.whoop.activation.domain.interactors.activation.AlPermissionsHelper", m100430f = "AlPermissionsHelper.kt", m100431l = {C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER}, m100432m = "fetchAlPermissionsScreens", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a extends AbstractC32269c {

        /* JADX INFO: renamed from: w */
        Object f51531w;

        /* JADX INFO: renamed from: x */
        /* synthetic */ Object f51532x;

        /* JADX INFO: renamed from: z */
        int f51534z;

        public a(InterfaceC30057d<? super a> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f51532x = obj;
            this.f51534z |= Integer.MIN_VALUE;
            return C14196o.this.m40525b(null, this);
        }
    }

    /* JADX INFO: renamed from: f70.o$b */
    /* JADX INFO: loaded from: classes6.dex */
    @InterfaceC32271e(m100429c = "com.whoop.activation.domain.interactors.activation.AlPermissionsHelper$fetchAlPermissionsScreens$response$1", m100430f = "AlPermissionsHelper.kt", m100431l = {20}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, m65681d2 = {"<anonymous>", "Lcom/whoop/activation/domain/models/AlPermissionsResponse;"}, m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b extends AbstractC32275i implements Function1 {

        /* JADX INFO: renamed from: w */
        int f51535w;

        public b(InterfaceC30057d<? super b> interfaceC30057d) {
            super(1, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(InterfaceC30057d<?> interfaceC30057d) {
            return C14196o.this.new b(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f51535w;
            if (i13 != 0) {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
                return obj;
            }
            AbstractC34132o.m107864I(obj);
            ActivationAuthenticatedApi activationAuthenticatedApi = C14196o.this.activationAuthenticatedApi;
            this.f51535w = 1;
            Object objFetchAlPermissions = activationAuthenticatedApi.fetchAlPermissions(this);
            return objFetchAlPermissions == enumC31071a ? enumC31071a : objFetchAlPermissions;
        }

        @Override // p715kotlin.jvm.functions.Function1
        public final Object invoke(InterfaceC30057d<? super AlPermissionsResponse> interfaceC30057d) {
            return ((b) create(interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }
    }

    /* JADX INFO: renamed from: f70.o$c */
    /* JADX INFO: loaded from: classes6.dex */
    @InterfaceC32271e(m100429c = "com.whoop.activation.domain.interactors.activation.AlPermissionsHelper", m100430f = "AlPermissionsHelper.kt", m100431l = {63, 69}, m100432m = "submitAlPermissions", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c extends AbstractC32269c {

        /* JADX INFO: renamed from: E */
        /* synthetic */ Object f51537E;

        /* JADX INFO: renamed from: G */
        int f51539G;

        /* JADX INFO: renamed from: w */
        Object f51540w;

        /* JADX INFO: renamed from: x */
        Object f51541x;

        /* JADX INFO: renamed from: y */
        Object f51542y;

        /* JADX INFO: renamed from: z */
        boolean f51543z;

        public c(InterfaceC30057d<? super c> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f51537E = obj;
            this.f51539G |= Integer.MIN_VALUE;
            return C14196o.this.m40526c(null, false, this);
        }
    }

    /* JADX INFO: renamed from: f70.o$d */
    /* JADX INFO: loaded from: classes6.dex */
    @InterfaceC32271e(m100429c = "com.whoop.activation.domain.interactors.activation.AlPermissionsHelper$submitAlPermissions$result$1", m100430f = "AlPermissionsHelper.kt", m100431l = {64}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m65681d2 = {"Ll83/a0;", "<anonymous>", "()V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class d extends AbstractC32275i implements Function1 {

        /* JADX INFO: renamed from: w */
        int f51544w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ AlPermissionsBody f51546y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(AlPermissionsBody alPermissionsBody, InterfaceC30057d<? super d> interfaceC30057d) {
            super(1, interfaceC30057d);
            this.f51546y = alPermissionsBody;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(InterfaceC30057d<?> interfaceC30057d) {
            return C14196o.this.new d(this.f51546y, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f51544w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                ActivationAuthenticatedApi activationAuthenticatedApi = C14196o.this.activationAuthenticatedApi;
                AlPermissionsBody alPermissionsBody = this.f51546y;
                this.f51544w = 1;
                if (activationAuthenticatedApi.putAlPermissions(alPermissionsBody, this) == enumC31071a) {
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

    public C14196o(ActivationAuthenticatedApi activationAuthenticatedApi, C14190l activationUserSessionCreator, C17003c analyticsHelper, InterfaceC34116n logger) {
        AbstractC22676k.m65750j(activationAuthenticatedApi, "activationAuthenticatedApi");
        AbstractC22676k.m65750j(activationUserSessionCreator, "activationUserSessionCreator");
        AbstractC22676k.m65750j(analyticsHelper, "analyticsHelper");
        AbstractC22676k.m65750j(logger, "logger");
        this.activationAuthenticatedApi = activationAuthenticatedApi;
        this.activationUserSessionCreator = activationUserSessionCreator;
        this.analyticsHelper = analyticsHelper;
        this.logger = logger;
    }

    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    /* JADX INFO: renamed from: b */
    public final Object m40525b(C14201q0 c14201q0, InterfaceC30057d<? super InterfaceC14176e> interfaceC30057d) {
        a aVar;
        C14201q0 c14201q1;
        if (interfaceC30057d instanceof a) {
            aVar = (a) interfaceC30057d;
            int i13 = aVar.f51534z;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                aVar.f51534z = i13 - Integer.MIN_VALUE;
            } else {
                aVar = new a(interfaceC30057d);
            }
        } else {
            aVar = new a(interfaceC30057d);
        }
        a aVar2 = aVar;
        Object objM108729b = aVar2.f51532x;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = aVar2.f51534z;
        if (i14 == 0) {
            AbstractC34132o.m107864I(objM108729b);
            InterfaceC34385a.Companion companion = InterfaceC34385a.INSTANCE;
            InterfaceC34116n interfaceC34116n = this.logger;
            b bVar = new b(null);
            aVar2.f51531w = c14201q0;
            aVar2.f51534z = 1;
            objM108729b = InterfaceC34385a.Companion.m108729b(companion, interfaceC34116n, null, "Failed to fetch advanced labs permissions screens", bVar, aVar2, 2, null);
            if (objM108729b == enumC31071a) {
                return enumC31071a;
            }
            c14201q1 = c14201q0;
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c14201q1 = (C14201q0) aVar2.f51531w;
            AbstractC34132o.m107864I(objM108729b);
        }
        InterfaceC34385a interfaceC34385a = (InterfaceC34385a) objM108729b;
        if (!(interfaceC34385a instanceof InterfaceC34385a.c)) {
            if (interfaceC34385a instanceof InterfaceC34385a.b) {
                return new InterfaceC14176e.b(null, null, null, null, EnumC14168b0.ERROR, false, null, false, null, false, false, null, null, null, null, null, null, 131055, null);
            }
            throw new NoWhenBranchMatchedException();
        }
        InterfaceC34385a.c cVar = (InterfaceC34385a.c) interfaceC34385a;
        List<DesignSystemModel> items = ((AlPermissionsResponse) cVar.m108735a()).getItems();
        ArrayList arrayList = new ArrayList();
        for (Object obj : items) {
            if (obj instanceof ActivationFlowStepModel) {
                arrayList.add(obj);
            }
        }
        if (arrayList.isEmpty()) {
            this.logger.mo85222m("Advanced labs permissions BFF returned an empty list of screens", new AbstractC30556a.a[0]);
            return new InterfaceC14176e.b(null, null, null, null, EnumC14168b0.ERROR, false, null, false, null, false, false, null, null, null, null, null, null, 131055, null);
        }
        this.analyticsHelper.m47935B(((AlPermissionsResponse) cVar.m108735a()).getEventProperties());
        return new InterfaceC14176e.b(arrayList, new C26418e(0, arrayList.size(), 0, ActivationFlowDestination.AL_PERMISSIONS, null), null, c14201q1 == null ? new C14201q0(null, null, null, null, null, null, null, null, false, false, false, null, null, null, null, null, null, null, null, false, false, false, null, null, null, null, 0, false, false, false, 1073741823, null) : c14201q1, EnumC14168b0.CONTENT, false, null, false, null, false, false, null, null, null, null, null, ((AlPermissionsResponse) cVar.m108735a()).getOnComplete(), 65508, null);
    }

    /* JADX WARN: Code duplicated, block: B:30:0x00af  */
    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    /* JADX WARN: Instruction removed from duplicated block: B:30:0x00af, please report this as an issue */
    /* JADX INFO: renamed from: c */
    public final Object m40526c(InterfaceC14176e.b bVar, boolean z4, InterfaceC30057d<? super C14178f> interfaceC30057d) {
        c cVar;
        InterfaceC14176e.b bVar2;
        boolean z13;
        InterfaceC14176e.b bVar3;
        InterfaceC14176e.b bVar4;
        AbstractC14188k abstractC14188k;
        if (interfaceC30057d instanceof c) {
            cVar = (c) interfaceC30057d;
            int i13 = cVar.f51539G;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                cVar.f51539G = i13 - Integer.MIN_VALUE;
            } else {
                cVar = new c(interfaceC30057d);
            }
        } else {
            cVar = new c(interfaceC30057d);
        }
        c cVar2 = cVar;
        Object objM40505b = cVar2.f51537E;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = cVar2.f51539G;
        if (i14 == 0) {
            AbstractC34132o.m107864I(objM40505b);
            AlPermissionsBody alPermissionsBody = new AlPermissionsBody(bVar.getMemberInfo().m40554g());
            InterfaceC34385a.Companion companion = InterfaceC34385a.INSTANCE;
            InterfaceC34116n interfaceC34116n = this.logger;
            d dVar = new d(alPermissionsBody, null);
            cVar2.f51540w = bVar;
            cVar2.f51541x = null;
            cVar2.f51543z = z4;
            cVar2.f51539G = 1;
            Object objM108729b = InterfaceC34385a.Companion.m108729b(companion, interfaceC34116n, null, "Failed to submit advanced labs permissions", dVar, cVar2, 2, null);
            if (objM108729b != enumC31071a) {
                bVar2 = bVar;
                objM40505b = objM108729b;
                z13 = z4;
            }
            return enumC31071a;
        }
        if (i14 == 1) {
            z13 = cVar2.f51543z;
            InterfaceC14176e.b bVar5 = (InterfaceC14176e.b) cVar2.f51540w;
            AbstractC34132o.m107864I(objM40505b);
            bVar2 = bVar5;
        } else {
            if (i14 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            bVar4 = (InterfaceC14176e.b) cVar2.f51540w;
            AbstractC34132o.m107864I(objM40505b);
        }
        abstractC14188k = (AbstractC14188k) objM40505b;
        if (abstractC14188k instanceof AbstractC14188k.a) {
            this.logger.mo85222m("Failed to bootstrap session after advanced labs permissions submit: " + ((AbstractC14188k.a) abstractC14188k).getReason(), new AbstractC30556a.a[0]);
        }
        bVar3 = bVar4;
        return new C14178f(InterfaceC14176e.b.m40416b(bVar3, null, null, null, null, null, false, null, false, null, false, false, null, null, null, null, null, null, 131039, null), true);
        InterfaceC34385a interfaceC34385a = (InterfaceC34385a) objM40505b;
        if (!(interfaceC34385a instanceof InterfaceC34385a.c)) {
            if (!(interfaceC34385a instanceof InterfaceC34385a.b)) {
                throw new NoWhenBranchMatchedException();
            }
            this.logger.mo85222m("Failed to submit advanced labs permissions: " + interfaceC34385a, new AbstractC30556a.a[0]);
            return new C14178f(InterfaceC14176e.b.m40416b(bVar2, null, null, null, null, null, true, null, false, null, false, false, null, null, null, null, null, null, 131039, null), false);
        }
        if (z13) {
            C14190l c14190l = this.activationUserSessionCreator;
            cVar2.f51540w = bVar2;
            cVar2.f51541x = null;
            cVar2.f51542y = null;
            cVar2.f51543z = z13;
            cVar2.f51539G = 2;
            objM40505b = c14190l.m40505b(cVar2);
            if (objM40505b != enumC31071a) {
                bVar4 = bVar2;
                abstractC14188k = (AbstractC14188k) objM40505b;
                if (abstractC14188k instanceof AbstractC14188k.a) {
                    this.logger.mo85222m("Failed to bootstrap session after advanced labs permissions submit: " + ((AbstractC14188k.a) abstractC14188k).getReason(), new AbstractC30556a.a[0]);
                }
                bVar3 = bVar4;
            }
            return enumC31071a;
        }
        bVar3 = bVar2;
        return new C14178f(InterfaceC14176e.b.m40416b(bVar3, null, null, null, null, null, false, null, false, null, false, false, null, null, null, null, null, null, 131039, null), true);
    }

    public /* synthetic */ C14196o(ActivationAuthenticatedApi activationAuthenticatedApi, C14190l c14190l, C17003c c17003c, InterfaceC34116n interfaceC34116n, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(activationAuthenticatedApi, c14190l, c17003c, (i13 & 8) != 0 ? InterfaceC34116n.INSTANCE.m107848a("AlPermissionsHelper") : interfaceC34116n);
    }
}
