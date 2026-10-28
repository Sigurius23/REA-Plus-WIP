package wj2;

import bc3.InterfaceC2994c0;
import c93.InterfaceC4351m;
import com.mapbox.common.HttpHeaders;
import com.whoop.tiltgraph.api.TiltGraphApi;
import com.whoop.tiltgraph.domain.models.TiltGraphResponse;
import ec3.AbstractC13091v;
import ec3.C13084s1;
import ec3.InterfaceC13058l;
import ec3.InterfaceC13062m;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import l83.C23454a0;
import or2.AbstractC28190p0;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.functions.Function3;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import tr2.InterfaceC34116n;
import u02.InterfaceC34385a;
import uj2.AbstractC35038a;
import uj2.C35039b;

/* JADX INFO: renamed from: wj2.c */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u0000 \u001e2\u00020\u0001:\u0001\u0018B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ*\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\r\u001a\u0004\u0018\u00010\f2\u0006\u0010\u000f\u001a\u00020\u000eH\u0082@¢\u0006\u0004\b\u0011\u0010\u0012J!\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00100\u00132\f\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d¨\u0006\u001f"}, m65681d2 = {"Lwj2/c;", "", "Lcom/whoop/tiltgraph/api/TiltGraphApi;", "api", "Ltr2/n;", "logger", "Luj2/b;", "analyticsHelper", "<init>", "(Lcom/whoop/tiltgraph/api/TiltGraphApi;Ltr2/n;Luj2/b;)V", "Ljava/time/LocalDate;", HttpHeaders.DATE, "", "entrySource", "", "shouldLogAnalytics", "Lwj2/b;", "f", "(Ljava/time/LocalDate;Ljava/lang/String;ZLq83/d;)Ljava/lang/Object;", "Lec3/l;", "Lwj2/a;", "upstream", "g", "(Lec3/l;)Lec3/l;", "a", "Lcom/whoop/tiltgraph/api/TiltGraphApi;", "b", "Ltr2/n;", "c", "Luj2/b;", "d", "tilt-graph_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C37322c {

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);

    /* JADX INFO: renamed from: e */
    public static final int f159557e = 8;

    /* JADX INFO: renamed from: f */
    private static final DateTimeFormatter f159558f = DateTimeFormatter.ofPattern("yyyy-MM-dd");

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final TiltGraphApi api;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final InterfaceC34116n logger;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final C35039b analyticsHelper;

    /* JADX INFO: renamed from: wj2.c$a, reason: from kotlin metadata */
    /* JADX INFO: loaded from: classes10.dex */
    @Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001f\u0010\u0006\u001a\n \u0005*\u0004\u0018\u00010\u00040\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0007\u001a\u0004\b\b\u0010\t¨\u0006\n"}, m65681d2 = {"Lwj2/c$a;", "", "<init>", "()V", "Ljava/time/format/DateTimeFormatter;", "kotlin.jvm.PlatformType", "DATE_FORMATTER", "Ljava/time/format/DateTimeFormatter;", "a", "()Ljava/time/format/DateTimeFormatter;", "tilt-graph_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: renamed from: a */
        public final DateTimeFormatter m119567a() {
            return C37322c.f159558f;
        }

        private Companion() {
        }
    }

    /* JADX INFO: renamed from: wj2.c$b */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.tiltgraph.domain.TiltGraphInteractor$fetchData$2", m100430f = "TiltGraphInteractor.kt", m100431l = {38}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Lwj2/b;", "<anonymous>", "(Lbc3/c0;)Lwj2/b;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class b extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: E */
        final /* synthetic */ String f159562E;

        /* JADX INFO: renamed from: w */
        int f159563w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ LocalDate f159565y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ boolean f159566z;

        /* JADX INFO: renamed from: wj2.c$b$a */
        @InterfaceC32271e(m100429c = "com.whoop.tiltgraph.domain.TiltGraphInteractor$fetchData$2$1", m100430f = "TiltGraphInteractor.kt", m100431l = {39}, m100432m = "invokeSuspend", m100433v = 2)
        @Metadata(m65680d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, m65681d2 = {"<anonymous>", "Lcom/whoop/tiltgraph/domain/models/TiltGraphResponse;"}, m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a extends AbstractC32275i implements Function1 {

            /* JADX INFO: renamed from: w */
            int f159567w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C37322c f159568x;

            /* JADX INFO: renamed from: y */
            final /* synthetic */ LocalDate f159569y;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(C37322c c37322c, LocalDate localDate, InterfaceC30057d<? super a> interfaceC30057d) {
                super(1, interfaceC30057d);
                this.f159568x = c37322c;
                this.f159569y = localDate;
            }

            @Override // s83.AbstractC32267a
            public final InterfaceC30057d<C23454a0> create(InterfaceC30057d<?> interfaceC30057d) {
                return new a(this.f159568x, this.f159569y, interfaceC30057d);
            }

            @Override // s83.AbstractC32267a
            public final Object invokeSuspend(Object obj) {
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i13 = this.f159567w;
                if (i13 != 0) {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj);
                    return obj;
                }
                AbstractC34132o.m107864I(obj);
                TiltGraphApi tiltGraphApi = this.f159568x.api;
                String str = C37322c.INSTANCE.m119567a().format(this.f159569y);
                AbstractC22676k.m65749i(str, "format(...)");
                this.f159567w = 1;
                Object tiltGraphData = tiltGraphApi.getTiltGraphData(str, this);
                return tiltGraphData == enumC31071a ? enumC31071a : tiltGraphData;
            }

            @Override // p715kotlin.jvm.functions.Function1
            public final Object invoke(InterfaceC30057d<? super TiltGraphResponse> interfaceC30057d) {
                return ((a) create(interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(LocalDate localDate, boolean z4, String str, InterfaceC30057d<? super b> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f159565y = localDate;
            this.f159566z = z4;
            this.f159562E = str;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C37322c.this.new b(this.f159565y, this.f159566z, this.f159562E, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super AbstractC37321b> interfaceC30057d) {
            return ((b) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            b bVar;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f159563w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC34385a.Companion companion = InterfaceC34385a.INSTANCE;
                InterfaceC34116n interfaceC34116n = C37322c.this.logger;
                a aVar = new a(C37322c.this, this.f159565y, null);
                this.f159563w = 1;
                bVar = this;
                obj = InterfaceC34385a.Companion.m108729b(companion, interfaceC34116n, null, null, aVar, bVar, 6, null);
                if (obj == enumC31071a) {
                    return enumC31071a;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
                bVar = this;
            }
            C37322c c37322c = C37322c.this;
            LocalDate localDate = bVar.f159565y;
            boolean z4 = bVar.f159566z;
            String str = bVar.f159562E;
            InterfaceC34385a interfaceC34385a = (InterfaceC34385a) obj;
            if (interfaceC34385a instanceof InterfaceC34385a.b) {
                c37322c.analyticsHelper.m110763j(AbstractC35038a.f.f148483a);
                return new AbstractC37321b.a(localDate);
            }
            if (!(interfaceC34385a instanceof InterfaceC34385a.c)) {
                throw new NoWhenBranchMatchedException();
            }
            if (z4) {
                InterfaceC34385a.c cVar = (InterfaceC34385a.c) interfaceC34385a;
                c37322c.analyticsHelper.m110763j(new AbstractC35038a.g(str, ((TiltGraphResponse) cVar.m108735a()).getAnalyticsMetadata().getDaysSince(), ((TiltGraphResponse) cVar.m108735a()).getAnalyticsMetadata().getHoursInGraph()));
            }
            return new AbstractC37321b.c((TiltGraphResponse) ((InterfaceC34385a.c) interfaceC34385a).m108735a(), false, 2, null);
        }
    }

    /* JADX INFO: renamed from: wj2.c$c */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.tiltgraph.domain.TiltGraphInteractor$interact$$inlined$flatMapLatest$1", m100430f = "TiltGraphInteractor.kt", m100431l = {189}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"}, m65681d2 = {"R", "T", "Lec3/m;", "it", "Ll83/a0;", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class c extends AbstractC32275i implements Function3 {

        /* JADX INFO: renamed from: w */
        int f159570w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f159571x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f159572y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ C37322c f159573z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(InterfaceC30057d interfaceC30057d, C37322c c37322c) {
            super(3, interfaceC30057d);
            this.f159573z = c37322c;
        }

        public final Object invoke(InterfaceC13062m interfaceC13062m, AbstractC37320a abstractC37320a, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            c cVar = new c(interfaceC30057d, this.f159573z);
            cVar.f159571x = interfaceC13062m;
            cVar.f159572y = abstractC37320a;
            return cVar.invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f159570w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC13062m interfaceC13062m = (InterfaceC13062m) this.f159571x;
                AbstractC37320a abstractC37320a = (AbstractC37320a) this.f159572y;
                if (!(abstractC37320a instanceof AbstractC37320a.a)) {
                    throw new NoWhenBranchMatchedException();
                }
                C13084s1 c13084s1 = new C13084s1(this.f159573z.new d(abstractC37320a, null));
                this.f159571x = null;
                this.f159572y = null;
                this.f159570w = 1;
                if (AbstractC13091v.m36613w(interfaceC13062m, c13084s1, this) == enumC31071a) {
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

        @Override // p715kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return invoke((InterfaceC13062m) obj, (AbstractC37320a) obj2, (InterfaceC30057d<? super C23454a0>) obj3);
        }
    }

    /* JADX INFO: renamed from: wj2.c$d */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.tiltgraph.domain.TiltGraphInteractor$interact$1$1", m100430f = "TiltGraphInteractor.kt", m100431l = {30, 31, 31}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lec3/m;", "Lwj2/b;", "Ll83/a0;", "<anonymous>", "(Lec3/m;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class d extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: E */
        final /* synthetic */ AbstractC37320a f159574E;

        /* JADX INFO: renamed from: w */
        Object f159575w;

        /* JADX INFO: renamed from: x */
        int f159576x;

        /* JADX INFO: renamed from: y */
        private /* synthetic */ Object f159577y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(AbstractC37320a abstractC37320a, InterfaceC30057d<? super d> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f159574E = abstractC37320a;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            d dVar = C37322c.this.new d(this.f159574E, interfaceC30057d);
            dVar.f159577y = obj;
            return dVar;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC13062m interfaceC13062m, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((d) create(interfaceC13062m, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:19:0x006d, code lost:
        
            if (r0.emit(r9, r8) == r1) goto L20;
         */
        @Override // s83.AbstractC32267a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r9) {
            /*
                r8 = this;
                java.lang.Object r0 = r8.f159577y
                ec3.m r0 = (ec3.InterfaceC13062m) r0
                r83.a r1 = r83.EnumC31071a.f128113w
                int r2 = r8.f159576x
                r3 = 3
                r4 = 2
                r5 = 1
                r6 = 0
                if (r2 == 0) goto L2c
                if (r2 == r5) goto L28
                if (r2 == r4) goto L20
                if (r2 != r3) goto L18
                p505ts.AbstractC34132o.m107864I(r9)
                goto L70
            L18:
                java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r9.<init>(r0)
                throw r9
            L20:
                java.lang.Object r0 = r8.f159575w
                ec3.m r0 = (ec3.InterfaceC13062m) r0
                p505ts.AbstractC34132o.m107864I(r9)
                goto L63
            L28:
                p505ts.AbstractC34132o.m107864I(r9)
                goto L3c
            L2c:
                p505ts.AbstractC34132o.m107864I(r9)
                wj2.b$b r9 = wj2.AbstractC37321b.b.f159552a
                r8.f159577y = r0
                r8.f159576x = r5
                java.lang.Object r9 = r0.emit(r9, r8)
                if (r9 != r1) goto L3c
                goto L6f
            L3c:
                wj2.c r9 = wj2.C37322c.this
                wj2.a r2 = r8.f159574E
                wj2.a$a r2 = (wj2.AbstractC37320a.a) r2
                java.time.LocalDate r2 = r2.getCom.mapbox.common.HttpHeaders.DATE java.lang.String()
                wj2.a r5 = r8.f159574E
                wj2.a$a r5 = (wj2.AbstractC37320a.a) r5
                java.lang.String r5 = r5.getSource()
                wj2.a r7 = r8.f159574E
                wj2.a$a r7 = (wj2.AbstractC37320a.a) r7
                boolean r7 = r7.getShouldLogAnalytics()
                r8.f159577y = r6
                r8.f159575w = r0
                r8.f159576x = r4
                java.lang.Object r9 = wj2.C37322c.m119560a(r9, r2, r5, r7, r8)
                if (r9 != r1) goto L63
                goto L6f
            L63:
                r8.f159577y = r6
                r8.f159575w = r6
                r8.f159576x = r3
                java.lang.Object r9 = r0.emit(r9, r8)
                if (r9 != r1) goto L70
            L6f:
                return r1
            L70:
                l83.a0 r9 = l83.C23454a0.f92919a
                return r9
            */
            throw new UnsupportedOperationException("Method not decompiled: wj2.C37322c.d.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public C37322c(TiltGraphApi api, InterfaceC34116n logger, C35039b analyticsHelper) {
        AbstractC22676k.m65750j(api, "api");
        AbstractC22676k.m65750j(logger, "logger");
        AbstractC22676k.m65750j(analyticsHelper, "analyticsHelper");
        this.api = api;
        this.logger = logger;
        this.analyticsHelper = analyticsHelper;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public final Object m119565f(LocalDate localDate, String str, boolean z4, InterfaceC30057d<? super AbstractC37321b> interfaceC30057d) {
        return AbstractC28190p0.m85321a(1000L, new b(localDate, z4, str, null), interfaceC30057d);
    }

    /* JADX INFO: renamed from: g */
    public final InterfaceC13058l m119566g(InterfaceC13058l upstream) {
        AbstractC22676k.m65750j(upstream, "upstream");
        return AbstractC13091v.m36590P(upstream, new c(null, this));
    }

    public /* synthetic */ C37322c(TiltGraphApi tiltGraphApi, InterfaceC34116n interfaceC34116n, C35039b c35039b, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(tiltGraphApi, (i13 & 2) != 0 ? InterfaceC34116n.INSTANCE.m107848a("TiltGraphInteractor") : interfaceC34116n, c35039b);
    }
}
