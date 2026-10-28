package oo1;

import androidx.health.platform.client.proto.C1533u;
import com.whoop.hormonalinsights.api.HormonalInsightsApi;
import com.whoop.hormonalinsights.menstrualcycleinsights.domain.models.PhaseCoachingResponse;
import ec3.C13060l1;
import ec3.InterfaceC13058l;
import l83.C23454a0;
import od1.InterfaceC27844g;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.functions.Function3;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import tr2.InterfaceC34116n;
import u02.InterfaceC34385a;

/* JADX INFO: renamed from: oo1.k */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0019\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001a\u0010\f\u001a\u00020\u00032\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0082@¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0011\u001a\u00020\u00102\b\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J#\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00030\u00132\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00020\u0013H\u0016¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, m65681d2 = {"Loo1/k;", "Lod1/g;", "Loo1/i;", "Loo1/j;", "Lcom/whoop/hormonalinsights/api/HormonalInsightsApi;", "api", "Ltr2/n;", "logger", "<init>", "(Lcom/whoop/hormonalinsights/api/HormonalInsightsApi;Ltr2/n;)V", "", "initialPhase", "f", "(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;", "Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/PhaseCoachingResponse;", "response", "Loo1/j$c;", "e", "(Ljava/lang/String;Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/PhaseCoachingResponse;)Loo1/j$c;", "Lec3/l;", "upstream", "interact", "(Lec3/l;)Lec3/l;", "a", "Lcom/whoop/hormonalinsights/api/HormonalInsightsApi;", "b", "Ltr2/n;", "hormonal-insights_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C28065k implements InterfaceC27844g<AbstractC28063i, AbstractC28064j> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final HormonalInsightsApi api;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final InterfaceC34116n logger;

    /* JADX INFO: renamed from: oo1.k$a */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.hormonalinsights.menstrualcycleinsights.domain.PhaseCoachingInteractor", m100430f = "PhaseCoachingInteractor.kt", m100431l = {30}, m100432m = "fetchData", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a extends AbstractC32269c {

        /* JADX INFO: renamed from: w */
        Object f113550w;

        /* JADX INFO: renamed from: x */
        /* synthetic */ Object f113551x;

        /* JADX INFO: renamed from: z */
        int f113553z;

        public a(InterfaceC30057d<? super a> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f113551x = obj;
            this.f113553z |= Integer.MIN_VALUE;
            return C28065k.this.m84839f(null, this);
        }
    }

    /* JADX INFO: renamed from: oo1.k$b */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.hormonalinsights.menstrualcycleinsights.domain.PhaseCoachingInteractor$fetchData$response$1", m100430f = "PhaseCoachingInteractor.kt", m100431l = {31}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, m65681d2 = {"<anonymous>", "Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/PhaseCoachingResponse;"}, m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b extends AbstractC32275i implements Function1 {

        /* JADX INFO: renamed from: w */
        int f113554w;

        public b(InterfaceC30057d<? super b> interfaceC30057d) {
            super(1, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(InterfaceC30057d<?> interfaceC30057d) {
            return C28065k.this.new b(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f113554w;
            if (i13 != 0) {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
                return obj;
            }
            AbstractC34132o.m107864I(obj);
            HormonalInsightsApi hormonalInsightsApi = C28065k.this.api;
            this.f113554w = 1;
            Object phaseCoaching = hormonalInsightsApi.getPhaseCoaching(this);
            return phaseCoaching == enumC31071a ? enumC31071a : phaseCoaching;
        }

        @Override // p715kotlin.jvm.functions.Function1
        public final Object invoke(InterfaceC30057d<? super PhaseCoachingResponse> interfaceC30057d) {
            return ((b) create(interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }
    }

    /* JADX INFO: renamed from: oo1.k$c */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.hormonalinsights.menstrualcycleinsights.domain.PhaseCoachingInteractor$interact$1", m100430f = "PhaseCoachingInteractor.kt", m100431l = {C1533u.START_ZONE_OFFSET_SECONDS_FIELD_NUMBER, 24}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m65681d2 = {"Loo1/j;", "acc", "Loo1/i;", "domainAction", "<anonymous>", "(Loo1/j;Loo1/i;)Loo1/j;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class c extends AbstractC32275i implements Function3 {

        /* JADX INFO: renamed from: w */
        int f113556w;

        /* JADX INFO: renamed from: x */
        /* synthetic */ Object f113557x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f113558y;

        public c(InterfaceC30057d<? super c> interfaceC30057d) {
            super(3, interfaceC30057d);
        }

        @Override // p715kotlin.jvm.functions.Function3
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public final Object invoke(AbstractC28064j abstractC28064j, AbstractC28063i abstractC28063i, InterfaceC30057d<? super AbstractC28064j> interfaceC30057d) {
            c cVar = C28065k.this.new c(interfaceC30057d);
            cVar.f113557x = abstractC28064j;
            cVar.f113558y = abstractC28063i;
            return cVar.invokeSuspend(C23454a0.f92919a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:13:0x003e, code lost:
        
            if (r7 == r2) goto L29;
         */
        /* JADX WARN: Code restructure failed: missing block: B:28:0x0072, code lost:
        
            if (r7 == r2) goto L29;
         */
        @Override // s83.AbstractC32267a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r7) {
            /*
                r6 = this;
                java.lang.Object r0 = r6.f113557x
                oo1.j r0 = (oo1.AbstractC28064j) r0
                java.lang.Object r1 = r6.f113558y
                oo1.i r1 = (oo1.AbstractC28063i) r1
                r83.a r2 = r83.EnumC31071a.f128113w
                int r3 = r6.f113556w
                r4 = 1
                r5 = 2
                if (r3 == 0) goto L24
                if (r3 == r4) goto L20
                if (r3 != r5) goto L18
                p505ts.AbstractC34132o.m107864I(r7)
                goto L75
            L18:
                java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r7.<init>(r0)
                throw r7
            L20:
                p505ts.AbstractC34132o.m107864I(r7)
                goto L41
            L24:
                p505ts.AbstractC34132o.m107864I(r7)
                boolean r7 = r1 instanceof oo1.AbstractC28063i.a
                r3 = 0
                if (r7 == 0) goto L44
                oo1.k r7 = oo1.C28065k.this
                oo1.i$a r1 = (oo1.AbstractC28063i.a) r1
                java.lang.String r0 = r1.getSelectedPhase()
                r6.f113557x = r3
                r6.f113558y = r3
                r6.f113556w = r4
                java.lang.Object r7 = oo1.C28065k.m84836c(r7, r0, r6)
                if (r7 != r2) goto L41
                goto L74
            L41:
                oo1.j r7 = (oo1.AbstractC28064j) r7
                return r7
            L44:
                boolean r7 = r1 instanceof oo1.AbstractC28063i.b
                if (r7 == 0) goto L78
                boolean r7 = r0 instanceof oo1.AbstractC28064j.c
                if (r7 == 0) goto L4f
                oo1.j$c r0 = (oo1.AbstractC28064j.c) r0
                goto L50
            L4f:
                r0 = r3
            L50:
                if (r0 == 0) goto L60
                r7 = r1
                oo1.i$b r7 = (oo1.AbstractC28063i.b) r7
                java.lang.String r7 = r7.getSelectedPhase()
                oo1.j$c r7 = oo1.AbstractC28064j.c.m84832b(r0, r7, r3, r5, r3)
                if (r7 == 0) goto L60
                return r7
            L60:
                oo1.k r7 = oo1.C28065k.this
                oo1.i$b r1 = (oo1.AbstractC28063i.b) r1
                java.lang.String r0 = r1.getSelectedPhase()
                r6.f113557x = r3
                r6.f113558y = r3
                r6.f113556w = r5
                java.lang.Object r7 = oo1.C28065k.m84836c(r7, r0, r6)
                if (r7 != r2) goto L75
            L74:
                return r2
            L75:
                oo1.j r7 = (oo1.AbstractC28064j) r7
                return r7
            L78:
                kotlin.NoWhenBranchMatchedException r7 = new kotlin.NoWhenBranchMatchedException
                r7.<init>()
                throw r7
            */
            throw new UnsupportedOperationException("Method not decompiled: oo1.C28065k.c.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public C28065k(HormonalInsightsApi api, InterfaceC34116n logger) {
        AbstractC22676k.m65750j(api, "api");
        AbstractC22676k.m65750j(logger, "logger");
        this.api = api;
        this.logger = logger;
    }

    /* JADX INFO: renamed from: e */
    private final AbstractC28064j.c m84838e(String initialPhase, PhaseCoachingResponse response) {
        return new AbstractC28064j.c(initialPhase, response);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX INFO: renamed from: f */
    public final Object m84839f(String str, InterfaceC30057d<? super AbstractC28064j> interfaceC30057d) {
        a aVar;
        if (interfaceC30057d instanceof a) {
            aVar = (a) interfaceC30057d;
            int i13 = aVar.f113553z;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                aVar.f113553z = i13 - Integer.MIN_VALUE;
            } else {
                aVar = new a(interfaceC30057d);
            }
        } else {
            aVar = new a(interfaceC30057d);
        }
        a aVar2 = aVar;
        Object objM108729b = aVar2.f113551x;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = aVar2.f113553z;
        if (i14 == 0) {
            AbstractC34132o.m107864I(objM108729b);
            InterfaceC34385a.Companion companion = InterfaceC34385a.INSTANCE;
            InterfaceC34116n interfaceC34116n = this.logger;
            b bVar = new b(null);
            aVar2.f113550w = str;
            aVar2.f113553z = 1;
            objM108729b = InterfaceC34385a.Companion.m108729b(companion, interfaceC34116n, null, null, bVar, aVar2, 6, null);
            if (objM108729b == enumC31071a) {
                return enumC31071a;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str = (String) aVar2.f113550w;
            AbstractC34132o.m107864I(objM108729b);
        }
        InterfaceC34385a interfaceC34385a = (InterfaceC34385a) objM108729b;
        if (interfaceC34385a instanceof InterfaceC34385a.c) {
            return m84838e(str, (PhaseCoachingResponse) ((InterfaceC34385a.c) interfaceC34385a).m108735a());
        }
        if (interfaceC34385a instanceof InterfaceC34385a.b) {
            return new AbstractC28064j.a(((InterfaceC34385a.b) interfaceC34385a).getErrorMessage());
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // od1.InterfaceC27844g
    public InterfaceC13058l interact(InterfaceC13058l upstream) {
        AbstractC22676k.m65750j(upstream, "upstream");
        return new C13060l1(AbstractC28064j.b.f113545a, upstream, new c(null));
    }

    public /* synthetic */ C28065k(HormonalInsightsApi hormonalInsightsApi, InterfaceC34116n interfaceC34116n, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(hormonalInsightsApi, (i13 & 2) != 0 ? InterfaceC34116n.INSTANCE.m107848a("PhaseCoachingInteractor") : interfaceC34116n);
    }
}
