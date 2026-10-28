package wp1;

import com.whoop.hormonalinsights.api.HormonalInsightsApi;
import com.whoop.hormonalinsights.menstrualcycleinsights.domain.models.SymptomsScreenResponse;
import com.whoop.hormonalinsights.menstrualcycleinsights.domain.models.SymptomsSegmentModel;
import com.whoop.hormonalinsights.pregnancyinsights.domain.models.GenericSymptomsScreenResponse;
import com.whoop.hormonalinsights.pregnancyinsights.domain.models.SegmentControlDisplay;
import ec3.C13060l1;
import ec3.InterfaceC13058l;
import java.util.ArrayList;
import java.util.List;
import l83.C23454a0;
import l83.C23465k;
import m83.AbstractC25247g0;
import m83.AbstractC25265s;
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
import wb3.AbstractC37056f;

/* JADX INFO: renamed from: wp1.c */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0019\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ$\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\fH\u0082@¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0003H\u0082@¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0012\u001a\u00020\u00032\b\u0010\r\u001a\u0004\u0018\u00010\fH\u0082@¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J#\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00030\u00192\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00020\u0019H\u0016¢\u0006\u0004\b\u001b\u0010\u001cR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 ¨\u0006!"}, m65681d2 = {"Lwp1/c;", "Lod1/g;", "Lwp1/a;", "Lwp1/b;", "Lcom/whoop/hormonalinsights/api/HormonalInsightsApi;", "api", "Ltr2/n;", "logger", "<init>", "(Lcom/whoop/hormonalinsights/api/HormonalInsightsApi;Ltr2/n;)V", "", "useMenstrualEndpoint", "", "pregnancyId", "g", "(ZLjava/lang/String;Lq83/d;)Ljava/lang/Object;", "i", "(Lq83/d;)Ljava/lang/Object;", "j", "(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;", "Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/SymptomsScreenResponse;", "response", "Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/GenericSymptomsScreenResponse;", "k", "(Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/SymptomsScreenResponse;)Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/GenericSymptomsScreenResponse;", "Lec3/l;", "upstream", "interact", "(Lec3/l;)Lec3/l;", "a", "Lcom/whoop/hormonalinsights/api/HormonalInsightsApi;", "b", "Ltr2/n;", "hormonal-insights_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C37499c implements InterfaceC27844g<AbstractC37497a, AbstractC37498b> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final HormonalInsightsApi api;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final InterfaceC34116n logger;

    /* JADX INFO: renamed from: wp1.c$a */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.hormonalinsights.symptompatterns.domain.SymptomPatternsInteractor", m100430f = "SymptomPatternsInteractor.kt", m100431l = {39}, m100432m = "fetchMenstrual", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a extends AbstractC32269c {

        /* JADX INFO: renamed from: w */
        /* synthetic */ Object f160390w;

        /* JADX INFO: renamed from: y */
        int f160392y;

        public a(InterfaceC30057d<? super a> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f160390w = obj;
            this.f160392y |= Integer.MIN_VALUE;
            return C37499c.this.m120194i(this);
        }
    }

    /* JADX INFO: renamed from: wp1.c$b */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.hormonalinsights.symptompatterns.domain.SymptomPatternsInteractor$fetchMenstrual$response$1", m100430f = "SymptomPatternsInteractor.kt", m100431l = {40}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, m65681d2 = {"<anonymous>", "Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/SymptomsScreenResponse;"}, m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b extends AbstractC32275i implements Function1 {

        /* JADX INFO: renamed from: w */
        int f160393w;

        public b(InterfaceC30057d<? super b> interfaceC30057d) {
            super(1, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(InterfaceC30057d<?> interfaceC30057d) {
            return C37499c.this.new b(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f160393w;
            if (i13 != 0) {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
                return obj;
            }
            AbstractC34132o.m107864I(obj);
            HormonalInsightsApi hormonalInsightsApi = C37499c.this.api;
            this.f160393w = 1;
            Object symptomsScreen = hormonalInsightsApi.getSymptomsScreen(this);
            return symptomsScreen == enumC31071a ? enumC31071a : symptomsScreen;
        }

        @Override // p715kotlin.jvm.functions.Function1
        public final Object invoke(InterfaceC30057d<? super SymptomsScreenResponse> interfaceC30057d) {
            return ((b) create(interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }
    }

    /* JADX INFO: renamed from: wp1.c$c */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.hormonalinsights.symptompatterns.domain.SymptomPatternsInteractor", m100430f = "SymptomPatternsInteractor.kt", m100431l = {57}, m100432m = "fetchPregnancy", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c extends AbstractC32269c {

        /* JADX INFO: renamed from: w */
        Object f160395w;

        /* JADX INFO: renamed from: x */
        /* synthetic */ Object f160396x;

        /* JADX INFO: renamed from: z */
        int f160398z;

        public c(InterfaceC30057d<? super c> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f160396x = obj;
            this.f160398z |= Integer.MIN_VALUE;
            return C37499c.this.m120195j(null, this);
        }
    }

    /* JADX INFO: renamed from: wp1.c$d */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.hormonalinsights.symptompatterns.domain.SymptomPatternsInteractor$fetchPregnancy$response$1", m100430f = "SymptomPatternsInteractor.kt", m100431l = {58}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, m65681d2 = {"<anonymous>", "Lcom/whoop/hormonalinsights/pregnancyinsights/domain/models/GenericSymptomsScreenResponse;"}, m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class d extends AbstractC32275i implements Function1 {

        /* JADX INFO: renamed from: w */
        int f160399w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ String f160401y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(String str, InterfaceC30057d<? super d> interfaceC30057d) {
            super(1, interfaceC30057d);
            this.f160401y = str;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(InterfaceC30057d<?> interfaceC30057d) {
            return C37499c.this.new d(this.f160401y, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f160399w;
            if (i13 != 0) {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
                return obj;
            }
            AbstractC34132o.m107864I(obj);
            HormonalInsightsApi hormonalInsightsApi = C37499c.this.api;
            String str = this.f160401y;
            this.f160399w = 1;
            Object pregnancySymptoms = hormonalInsightsApi.getPregnancySymptoms(str, this);
            return pregnancySymptoms == enumC31071a ? enumC31071a : pregnancySymptoms;
        }

        @Override // p715kotlin.jvm.functions.Function1
        public final Object invoke(InterfaceC30057d<? super GenericSymptomsScreenResponse> interfaceC30057d) {
            return ((d) create(interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }
    }

    /* JADX INFO: renamed from: wp1.c$e */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.hormonalinsights.symptompatterns.domain.SymptomPatternsInteractor$interact$1", m100430f = "SymptomPatternsInteractor.kt", m100431l = {20, 25}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m65681d2 = {"Lwp1/b;", "acc", "Lwp1/a;", "domainAction", "<anonymous>", "(Lwp1/b;Lwp1/a;)Lwp1/b;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class e extends AbstractC32275i implements Function3 {

        /* JADX INFO: renamed from: w */
        int f160402w;

        /* JADX INFO: renamed from: x */
        /* synthetic */ Object f160403x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f160404y;

        public e(InterfaceC30057d<? super e> interfaceC30057d) {
            super(3, interfaceC30057d);
        }

        @Override // p715kotlin.jvm.functions.Function3
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public final Object invoke(AbstractC37498b abstractC37498b, AbstractC37497a abstractC37497a, InterfaceC30057d<? super AbstractC37498b> interfaceC30057d) {
            e eVar = C37499c.this.new e(interfaceC30057d);
            eVar.f160403x = abstractC37498b;
            eVar.f160404y = abstractC37497a;
            return eVar.invokeSuspend(C23454a0.f92919a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:13:0x0042, code lost:
        
            if (r12 == r2) goto L29;
         */
        /* JADX WARN: Code restructure failed: missing block: B:28:0x0074, code lost:
        
            if (r12 == r2) goto L29;
         */
        @Override // s83.AbstractC32267a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r12) {
            /*
                r11 = this;
                java.lang.Object r0 = r11.f160403x
                wp1.b r0 = (wp1.AbstractC37498b) r0
                java.lang.Object r1 = r11.f160404y
                wp1.a r1 = (wp1.AbstractC37497a) r1
                r83.a r2 = r83.EnumC31071a.f128113w
                int r3 = r11.f160402w
                r4 = 2
                r5 = 1
                if (r3 == 0) goto L24
                if (r3 == r5) goto L20
                if (r3 != r4) goto L18
                p505ts.AbstractC34132o.m107864I(r12)
                goto L77
            L18:
                java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r12.<init>(r0)
                throw r12
            L20:
                p505ts.AbstractC34132o.m107864I(r12)
                goto L45
            L24:
                p505ts.AbstractC34132o.m107864I(r12)
                boolean r12 = r1 instanceof wp1.AbstractC37497a.a
                r3 = 0
                if (r12 == 0) goto L48
                wp1.c r12 = wp1.C37499c.this
                wp1.a$a r1 = (wp1.AbstractC37497a.a) r1
                boolean r0 = r1.getUseMenstrualEndpoint()
                java.lang.String r1 = r1.getPregnancyId()
                r11.f160403x = r3
                r11.f160404y = r3
                r11.f160402w = r5
                java.lang.Object r12 = wp1.C37499c.m120188c(r12, r0, r1, r11)
                if (r12 != r2) goto L45
                goto L76
            L45:
                wp1.b r12 = (wp1.AbstractC37498b) r12
                return r12
            L48:
                boolean r12 = r1 instanceof wp1.AbstractC37497a.b
                if (r12 == 0) goto L7a
                boolean r12 = r0 instanceof wp1.AbstractC37498b.c
                if (r12 == 0) goto L53
                wp1.b$c r0 = (wp1.AbstractC37498b.c) r0
                goto L54
            L53:
                r0 = r3
            L54:
                if (r0 == 0) goto L63
                wp1.a$b r1 = (wp1.AbstractC37497a.b) r1
                java.lang.String r12 = r1.getSegmentId()
                wp1.b$c r12 = wp1.AbstractC37498b.c.m120184b(r0, r3, r12, r5, r3)
                if (r12 == 0) goto L63
                return r12
            L63:
                wp1.c r5 = wp1.C37499c.this
                r11.f160403x = r3
                r11.f160404y = r3
                r11.f160402w = r4
                r6 = 0
                r7 = 0
                r9 = 2
                r10 = 0
                r8 = r11
                java.lang.Object r12 = wp1.C37499c.m120193h(r5, r6, r7, r8, r9, r10)
                if (r12 != r2) goto L77
            L76:
                return r2
            L77:
                wp1.b r12 = (wp1.AbstractC37498b) r12
                return r12
            L7a:
                kotlin.NoWhenBranchMatchedException r12 = new kotlin.NoWhenBranchMatchedException
                r12.<init>()
                throw r12
            */
            throw new UnsupportedOperationException("Method not decompiled: wp1.C37499c.e.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public C37499c(HormonalInsightsApi api, InterfaceC34116n logger) {
        AbstractC22676k.m65750j(api, "api");
        AbstractC22676k.m65750j(logger, "logger");
        this.api = api;
        this.logger = logger;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: g */
    public final Object m120192g(boolean z4, String str, InterfaceC30057d<? super AbstractC37498b> interfaceC30057d) {
        return z4 ? m120194i(interfaceC30057d) : m120195j(str, interfaceC30057d);
    }

    /* JADX INFO: renamed from: h */
    public static /* synthetic */ Object m120193h(C37499c c37499c, boolean z4, String str, InterfaceC30057d interfaceC30057d, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            str = null;
        }
        return c37499c.m120192g(z4, str, interfaceC30057d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX INFO: renamed from: i */
    public final Object m120194i(InterfaceC30057d<? super AbstractC37498b> interfaceC30057d) {
        a aVar;
        String id4;
        if (interfaceC30057d instanceof a) {
            aVar = (a) interfaceC30057d;
            int i13 = aVar.f160392y;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                aVar.f160392y = i13 - Integer.MIN_VALUE;
            } else {
                aVar = new a(interfaceC30057d);
            }
        } else {
            aVar = new a(interfaceC30057d);
        }
        a aVar2 = aVar;
        Object objM108729b = aVar2.f160390w;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = aVar2.f160392y;
        if (i14 == 0) {
            AbstractC34132o.m107864I(objM108729b);
            InterfaceC34385a.Companion companion = InterfaceC34385a.INSTANCE;
            InterfaceC34116n interfaceC34116n = this.logger;
            b bVar = new b(null);
            aVar2.f160392y = 1;
            objM108729b = InterfaceC34385a.Companion.m108729b(companion, interfaceC34116n, null, null, bVar, aVar2, 6, null);
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
                return new AbstractC37498b.a(((InterfaceC34385a.b) interfaceC34385a).getErrorMessage());
            }
            throw new NoWhenBranchMatchedException();
        }
        GenericSymptomsScreenResponse genericSymptomsScreenResponseM120196k = m120196k((SymptomsScreenResponse) ((InterfaceC34385a.c) interfaceC34385a).m108735a());
        SegmentControlDisplay segmentControlDisplay = (SegmentControlDisplay) AbstractC25265s.m74100H0(genericSymptomsScreenResponseM120196k.getSegmentedControlDisplays());
        if (segmentControlDisplay == null || (id4 = segmentControlDisplay.getId()) == null) {
            id4 = (String) AbstractC25265s.m74098G0(genericSymptomsScreenResponseM120196k.getSegments().keySet());
        }
        return new AbstractC37498b.c(genericSymptomsScreenResponseM120196k, id4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX INFO: renamed from: j */
    public final Object m120195j(String str, InterfaceC30057d<? super AbstractC37498b> interfaceC30057d) {
        c cVar;
        String id4;
        if (interfaceC30057d instanceof c) {
            cVar = (c) interfaceC30057d;
            int i13 = cVar.f160398z;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                cVar.f160398z = i13 - Integer.MIN_VALUE;
            } else {
                cVar = new c(interfaceC30057d);
            }
        } else {
            cVar = new c(interfaceC30057d);
        }
        c cVar2 = cVar;
        Object objM108729b = cVar2.f160396x;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = cVar2.f160398z;
        if (i14 == 0) {
            AbstractC34132o.m107864I(objM108729b);
            InterfaceC34385a.Companion companion = InterfaceC34385a.INSTANCE;
            InterfaceC34116n interfaceC34116n = this.logger;
            d dVar = new d(str, null);
            cVar2.f160395w = null;
            cVar2.f160398z = 1;
            objM108729b = InterfaceC34385a.Companion.m108729b(companion, interfaceC34116n, null, null, dVar, cVar2, 6, null);
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
                return new AbstractC37498b.a(((InterfaceC34385a.b) interfaceC34385a).getErrorMessage());
            }
            throw new NoWhenBranchMatchedException();
        }
        InterfaceC34385a.c cVar3 = (InterfaceC34385a.c) interfaceC34385a;
        SegmentControlDisplay segmentControlDisplay = (SegmentControlDisplay) AbstractC25265s.m74100H0(((GenericSymptomsScreenResponse) cVar3.m108735a()).getSegmentedControlDisplays());
        if (segmentControlDisplay == null || (id4 = segmentControlDisplay.getId()) == null) {
            id4 = (String) AbstractC25265s.m74098G0(((GenericSymptomsScreenResponse) cVar3.m108735a()).getSegments().keySet());
        }
        return new AbstractC37498b.c((GenericSymptomsScreenResponse) cVar3.m108735a(), id4);
    }

    /* JADX INFO: renamed from: k */
    private final GenericSymptomsScreenResponse m120196k(SymptomsScreenResponse response) {
        List<SegmentControlDisplay> segmentedControlDisplays = response.getSegmentedControlDisplays();
        List listM118959K = AbstractC37056f.m118959K(response.getCurrentCycleSegment(), response.getLastThreeCyclesSegment());
        ArrayList arrayList = new ArrayList();
        int i13 = 0;
        for (Object obj : segmentedControlDisplays) {
            int i14 = i13 + 1;
            if (i13 < 0) {
                AbstractC37056f.m118977d0();
                throw null;
            }
            SegmentControlDisplay segmentControlDisplay = (SegmentControlDisplay) obj;
            SymptomsSegmentModel symptomsSegmentModel = (SymptomsSegmentModel) AbstractC25265s.m74102I0(i13, listM118959K);
            C23465k c23465k = symptomsSegmentModel != null ? new C23465k(segmentControlDisplay.getId(), symptomsSegmentModel) : null;
            if (c23465k != null) {
                arrayList.add(c23465k);
            }
            i13 = i14;
        }
        return new GenericSymptomsScreenResponse(response.getNavigationTitle(), response.getSegmentedControlDisplays(), AbstractC25247g0.m74000i0(arrayList));
    }

    @Override // od1.InterfaceC27844g
    public InterfaceC13058l interact(InterfaceC13058l upstream) {
        AbstractC22676k.m65750j(upstream, "upstream");
        return new C13060l1(AbstractC37498b.b.f160385a, upstream, new e(null));
    }

    public /* synthetic */ C37499c(HormonalInsightsApi hormonalInsightsApi, InterfaceC34116n interfaceC34116n, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(hormonalInsightsApi, (i13 & 2) != 0 ? InterfaceC34116n.INSTANCE.m107848a("SymptomPatternsInteractor") : interfaceC34116n);
    }
}
