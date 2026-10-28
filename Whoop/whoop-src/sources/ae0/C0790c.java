package ae0;

import c93.InterfaceC4351m;
import com.mapbox.common.HttpHeaders;
import com.whoop.advancedlabs.domain.AdvancedLabsApi;
import com.whoop.advancedlabs.domain.models.FormContent;
import com.whoop.advancedlabs.domain.models.SchedulingFormResponse;
import ec3.AbstractC13091v;
import ec3.C13084s1;
import ec3.InterfaceC13058l;
import ec3.InterfaceC13062m;
import l83.C23454a0;
import od1.InterfaceC27844g;
import p007a6.C0456u;
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
import yb3.AbstractC39414r;

/* JADX INFO: renamed from: ae0.c */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0018\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0019\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00030\f2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ3\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00030\f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0011\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u000fH\u0002¢\u0006\u0004\b\u0013\u0010\u0014J'\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00030\f2\u0006\u0010\u0015\u001a\u00020\u000f2\b\u0010\u0016\u001a\u0004\u0018\u00010\u000fH\u0002¢\u0006\u0004\b\u0017\u0010\u0018J%\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00030\f2\u0006\u0010\u0019\u001a\u00020\u000f2\u0006\u0010\u0016\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u001a\u0010\u0018J\u0015\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00030\fH\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ9\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00030\f2\u0006\u0010\u0019\u001a\u00020\u000f2\u0006\u0010\u0016\u001a\u00020\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0011\u001a\u0004\u0018\u00010\u000fH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u0015\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00030\fH\u0002¢\u0006\u0004\b\u001f\u0010\u001cJ#\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00030\f2\f\u0010 \u001a\b\u0012\u0004\u0012\u00020\u00020\fH\u0016¢\u0006\u0004\b!\u0010\"R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&¨\u0006'"}, m65681d2 = {"Lae0/c;", "Lod1/g;", "Lae0/a;", "Lae0/b;", "Lcom/whoop/advancedlabs/domain/AdvancedLabsApi;", "api", "Ltr2/n;", "logger", "<init>", "(Lcom/whoop/advancedlabs/domain/AdvancedLabsApi;Ltr2/n;)V", "Lae0/a$e;", "action", "Lec3/l;", "r", "(Lae0/a$e;)Lec3/l;", "", "episodeId", "biomarkerTestId", "testType", "n", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lec3/l;", "location", HttpHeaders.DATE, "o", "(Ljava/lang/String;Ljava/lang/String;)Lec3/l;", "siteCode", "q", "l", "()Lec3/l;", "p", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lec3/l;", "m", "upstream", "interact", "(Lec3/l;)Lec3/l;", "a", "Lcom/whoop/advancedlabs/domain/AdvancedLabsApi;", "b", "Ltr2/n;", "advanced-labs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C0790c implements InterfaceC27844g<AbstractC0788a, AbstractC0789b> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final AdvancedLabsApi api;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final InterfaceC34116n logger;

    /* JADX INFO: renamed from: ae0.c$a */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.advancedlabs.schedulingform.domain.SchedulingFormInteractor$deselectAppointment$1", m100430f = "SchedulingFormInteractor.kt", m100431l = {95}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lec3/m;", "Lae0/b;", "Ll83/a0;", "<anonymous>", "(Lec3/m;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f2862w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f2863x;

        public a(InterfaceC30057d<? super a> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            a aVar = new a(interfaceC30057d);
            aVar.f2863x = obj;
            return aVar;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC13062m interfaceC13062m, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((a) create(interfaceC13062m, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            InterfaceC13062m interfaceC13062m = (InterfaceC13062m) this.f2863x;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f2862w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                AbstractC0789b.a aVar = AbstractC0789b.a.f2846a;
                this.f2863x = null;
                this.f2862w = 1;
                if (interfaceC13062m.emit(aVar, this) == enumC31071a) {
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
    }

    /* JADX INFO: renamed from: ae0.c$b */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.advancedlabs.schedulingform.domain.SchedulingFormInteractor$dismissModal$1", m100430f = "SchedulingFormInteractor.kt", m100431l = {122}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lec3/m;", "Lae0/b;", "Ll83/a0;", "<anonymous>", "(Lec3/m;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class b extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f2864w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f2865x;

        public b(InterfaceC30057d<? super b> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            b bVar = new b(interfaceC30057d);
            bVar.f2865x = obj;
            return bVar;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC13062m interfaceC13062m, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((b) create(interfaceC13062m, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            InterfaceC13062m interfaceC13062m = (InterfaceC13062m) this.f2865x;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f2864w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                AbstractC0789b.c cVar = AbstractC0789b.c.f2849a;
                this.f2865x = null;
                this.f2864w = 1;
                if (interfaceC13062m.emit(cVar, this) == enumC31071a) {
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
    }

    /* JADX INFO: renamed from: ae0.c$c */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.advancedlabs.schedulingform.domain.SchedulingFormInteractor$fetchData$1", m100430f = "SchedulingFormInteractor.kt", m100431l = {74, 76, 77}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lec3/m;", "Lae0/b;", "Ll83/a0;", "<anonymous>", "(Lec3/m;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class c extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: E */
        final /* synthetic */ String f2866E;

        /* JADX INFO: renamed from: F */
        final /* synthetic */ String f2867F;

        /* JADX INFO: renamed from: G */
        final /* synthetic */ String f2868G;

        /* JADX INFO: renamed from: w */
        Object f2869w;

        /* JADX INFO: renamed from: x */
        int f2870x;

        /* JADX INFO: renamed from: y */
        private /* synthetic */ Object f2871y;

        /* JADX INFO: renamed from: ae0.c$c$a */
        @InterfaceC32271e(m100429c = "com.whoop.advancedlabs.schedulingform.domain.SchedulingFormInteractor$fetchData$1$response$1", m100430f = "SchedulingFormInteractor.kt", m100431l = {74}, m100432m = "invokeSuspend", m100433v = 2)
        @Metadata(m65680d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, m65681d2 = {"<anonymous>", "Lcom/whoop/advancedlabs/domain/models/SchedulingFormResponse;"}, m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a extends AbstractC32275i implements Function1 {

            /* JADX INFO: renamed from: w */
            int f2873w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C0790c f2874x;

            /* JADX INFO: renamed from: y */
            final /* synthetic */ String f2875y;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(C0790c c0790c, String str, InterfaceC30057d<? super a> interfaceC30057d) {
                super(1, interfaceC30057d);
                this.f2874x = c0790c;
                this.f2875y = str;
            }

            @Override // s83.AbstractC32267a
            public final InterfaceC30057d<C23454a0> create(InterfaceC30057d<?> interfaceC30057d) {
                return new a(this.f2874x, this.f2875y, interfaceC30057d);
            }

            @Override // s83.AbstractC32267a
            public final Object invokeSuspend(Object obj) {
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i13 = this.f2873w;
                if (i13 != 0) {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj);
                    return obj;
                }
                AbstractC34132o.m107864I(obj);
                AdvancedLabsApi advancedLabsApi = this.f2874x.api;
                String str = this.f2875y;
                this.f2873w = 1;
                Object schedulingForm = advancedLabsApi.getSchedulingForm(str, this);
                return schedulingForm == enumC31071a ? enumC31071a : schedulingForm;
            }

            @Override // p715kotlin.jvm.functions.Function1
            public final Object invoke(InterfaceC30057d<? super SchedulingFormResponse> interfaceC30057d) {
                return ((a) create(interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String str, String str2, String str3, InterfaceC30057d<? super c> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f2866E = str;
            this.f2867F = str2;
            this.f2868G = str3;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            c cVar = C0790c.this.new c(this.f2866E, this.f2867F, this.f2868G, interfaceC30057d);
            cVar.f2871y = obj;
            return cVar;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC13062m interfaceC13062m, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((c) create(interfaceC13062m, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:18:0x0073, code lost:
        
            if (r8.emit(r1, r13) == r9) goto L24;
         */
        /* JADX WARN: Code restructure failed: missing block: B:23:0x0086, code lost:
        
            if (r8.emit(r0, r13) == r9) goto L24;
         */
        @Override // s83.AbstractC32267a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r14) {
            /*
                r13 = this;
                java.lang.Object r0 = r13.f2871y
                r8 = r0
                ec3.m r8 = (ec3.InterfaceC13062m) r8
                r83.a r9 = r83.EnumC31071a.f128113w
                int r0 = r13.f2870x
                r10 = 3
                r11 = 2
                r1 = 1
                r12 = 0
                if (r0 == 0) goto L2b
                if (r0 == r1) goto L26
                if (r0 == r11) goto L1e
                if (r0 != r10) goto L16
                goto L1e
            L16:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
                r0.<init>(r1)
                throw r0
            L1e:
                java.lang.Object r0 = r13.f2869w
                u02.a r0 = (u02.InterfaceC34385a) r0
                p505ts.AbstractC34132o.m107864I(r14)
                goto L89
            L26:
                p505ts.AbstractC34132o.m107864I(r14)
                r0 = r14
                goto L50
            L2b:
                p505ts.AbstractC34132o.m107864I(r14)
                u02.a$a r0 = u02.InterfaceC34385a.INSTANCE
                ae0.c r2 = ae0.C0790c.this
                tr2.n r2 = ae0.C0790c.m1904g(r2)
                ae0.c$c$a r4 = new ae0.c$c$a
                ae0.c r3 = ae0.C0790c.this
                java.lang.String r6 = r13.f2868G
                r4.<init>(r3, r6, r12)
                r13.f2871y = r8
                r13.f2870x = r1
                r1 = r2
                r2 = 0
                r3 = 0
                r6 = 6
                r7 = 0
                r5 = r13
                java.lang.Object r0 = u02.InterfaceC34385a.Companion.m108729b(r0, r1, r2, r3, r4, r5, r6, r7)
                if (r0 != r9) goto L50
                goto L88
            L50:
                u02.a r0 = (u02.InterfaceC34385a) r0
                boolean r1 = r0 instanceof u02.InterfaceC34385a.c
                if (r1 == 0) goto L76
                ae0.b$j r1 = new ae0.b$j
                u02.a$c r0 = (u02.InterfaceC34385a.c) r0
                java.lang.Object r0 = r0.m108735a()
                com.whoop.advancedlabs.domain.models.SchedulingFormResponse r0 = (com.whoop.advancedlabs.domain.models.SchedulingFormResponse) r0
                java.lang.String r2 = r13.f2866E
                java.lang.String r3 = r13.f2867F
                java.lang.String r4 = r13.f2868G
                r1.<init>(r0, r2, r3, r4)
                r13.f2871y = r12
                r13.f2869w = r12
                r13.f2870x = r11
                java.lang.Object r0 = r8.emit(r1, r13)
                if (r0 != r9) goto L89
                goto L88
            L76:
                boolean r0 = r0 instanceof u02.InterfaceC34385a.b
                if (r0 == 0) goto L8c
                ae0.b$d r0 = ae0.AbstractC0789b.d.f2850a
                r13.f2871y = r12
                r13.f2869w = r12
                r13.f2870x = r10
                java.lang.Object r0 = r8.emit(r0, r13)
                if (r0 != r9) goto L89
            L88:
                return r9
            L89:
                l83.a0 r0 = l83.C23454a0.f92919a
                return r0
            L8c:
                kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
                r0.<init>()
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: ae0.C0790c.c.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: ae0.c$d */
    /* JADX INFO: loaded from: classes7.dex */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class d implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f2876w;

        /* JADX INFO: renamed from: ae0.c$d$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f2877w;

            /* JADX INFO: renamed from: ae0.c$d$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.advancedlabs.schedulingform.domain.SchedulingFormInteractor$interact$$inlined$filter$1$2", m100430f = "SchedulingFormInteractor.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C41268a extends AbstractC32269c {

                /* JADX INFO: renamed from: F */
                Object f2879F;

                /* JADX INFO: renamed from: G */
                Object f2880G;

                /* JADX INFO: renamed from: H */
                int f2881H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f2882w;

                /* JADX INFO: renamed from: x */
                int f2883x;

                /* JADX INFO: renamed from: y */
                Object f2884y;

                /* JADX INFO: renamed from: z */
                Object f2885z;

                public C41268a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f2882w = obj;
                    this.f2883x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m) {
                this.f2877w = interfaceC13062m;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C41268a c41268a;
                if (interfaceC30057d instanceof C41268a) {
                    c41268a = (C41268a) interfaceC30057d;
                    int i13 = c41268a.f2883x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c41268a.f2883x = i13 - Integer.MIN_VALUE;
                    } else {
                        c41268a = new C41268a(interfaceC30057d);
                    }
                } else {
                    c41268a = new C41268a(interfaceC30057d);
                }
                Object obj2 = c41268a.f2882w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c41268a.f2883x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f2877w;
                    AbstractC0788a.e eVar = (AbstractC0788a.e) obj;
                    if (!AbstractC39414r.m125890i0(eVar.getLocation()) && !eVar.getSkipDebounce()) {
                        c41268a.f2884y = null;
                        c41268a.f2885z = null;
                        c41268a.f2879F = null;
                        c41268a.f2880G = null;
                        c41268a.f2881H = 0;
                        c41268a.f2883x = 1;
                        if (interfaceC13062m.emit(obj, c41268a) == enumC31071a) {
                            return enumC31071a;
                        }
                    }
                } else {
                    if (i14 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj2);
                }
                return C23454a0.f92919a;
            }
        }

        public d(InterfaceC13058l interfaceC13058l) {
            this.f2876w = interfaceC13058l;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f2876w.collect(new a(interfaceC13062m), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: ae0.c$e */
    /* JADX INFO: loaded from: classes7.dex */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class e implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f2886w;

        /* JADX INFO: renamed from: ae0.c$e$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f2887w;

            /* JADX INFO: renamed from: ae0.c$e$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.advancedlabs.schedulingform.domain.SchedulingFormInteractor$interact$$inlined$filterIsInstance$1$2", m100430f = "SchedulingFormInteractor.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C41269a extends AbstractC32269c {

                /* JADX INFO: renamed from: F */
                Object f2889F;

                /* JADX INFO: renamed from: G */
                Object f2890G;

                /* JADX INFO: renamed from: H */
                int f2891H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f2892w;

                /* JADX INFO: renamed from: x */
                int f2893x;

                /* JADX INFO: renamed from: y */
                Object f2894y;

                /* JADX INFO: renamed from: z */
                Object f2895z;

                public C41269a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f2892w = obj;
                    this.f2893x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m) {
                this.f2887w = interfaceC13062m;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C41269a c41269a;
                if (interfaceC30057d instanceof C41269a) {
                    c41269a = (C41269a) interfaceC30057d;
                    int i13 = c41269a.f2893x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c41269a.f2893x = i13 - Integer.MIN_VALUE;
                    } else {
                        c41269a = new C41269a(interfaceC30057d);
                    }
                } else {
                    c41269a = new C41269a(interfaceC30057d);
                }
                Object obj2 = c41269a.f2892w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c41269a.f2893x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f2887w;
                    if (obj instanceof AbstractC0788a.e) {
                        c41269a.f2894y = null;
                        c41269a.f2895z = null;
                        c41269a.f2889F = null;
                        c41269a.f2890G = null;
                        c41269a.f2891H = 0;
                        c41269a.f2893x = 1;
                        if (interfaceC13062m.emit(obj, c41269a) == enumC31071a) {
                            return enumC31071a;
                        }
                    }
                } else {
                    if (i14 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj2);
                }
                return C23454a0.f92919a;
            }
        }

        public e(InterfaceC13058l interfaceC13058l) {
            this.f2886w = interfaceC13058l;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f2886w.collect(new a(interfaceC13062m), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: ae0.c$f */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.advancedlabs.schedulingform.domain.SchedulingFormInteractor$interact$$inlined$flatMapLatest$1", m100430f = "SchedulingFormInteractor.kt", m100431l = {189}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"}, m65681d2 = {"R", "T", "Lec3/m;", "it", "Ll83/a0;", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class f extends AbstractC32275i implements Function3 {

        /* JADX INFO: renamed from: w */
        int f2896w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f2897x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f2898y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ C0790c f2899z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(InterfaceC30057d interfaceC30057d, C0790c c0790c) {
            super(3, interfaceC30057d);
            this.f2899z = c0790c;
        }

        public final Object invoke(InterfaceC13062m interfaceC13062m, AbstractC0788a.e eVar, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            f fVar = new f(interfaceC30057d, this.f2899z);
            fVar.f2897x = interfaceC13062m;
            fVar.f2898y = eVar;
            return fVar.invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f2896w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC13062m interfaceC13062m = (InterfaceC13062m) this.f2897x;
                AbstractC0788a.e eVar = (AbstractC0788a.e) this.f2898y;
                InterfaceC13058l interfaceC13058lM1912o = this.f2899z.m1912o(eVar.getLocation(), eVar.getCom.mapbox.common.HttpHeaders.DATE java.lang.String());
                this.f2897x = null;
                this.f2898y = null;
                this.f2896w = 1;
                if (AbstractC13091v.m36613w(interfaceC13062m, interfaceC13058lM1912o, this) == enumC31071a) {
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
            return invoke((InterfaceC13062m) obj, (AbstractC0788a.e) obj2, (InterfaceC30057d<? super C23454a0>) obj3);
        }
    }

    /* JADX INFO: renamed from: ae0.c$g */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.advancedlabs.schedulingform.domain.SchedulingFormInteractor$interact$$inlined$flatMapLatest$2", m100430f = "SchedulingFormInteractor.kt", m100431l = {189}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"}, m65681d2 = {"R", "T", "Lec3/m;", "it", "Ll83/a0;", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class g extends AbstractC32275i implements Function3 {

        /* JADX INFO: renamed from: w */
        int f2900w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f2901x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f2902y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ C0790c f2903z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(InterfaceC30057d interfaceC30057d, C0790c c0790c) {
            super(3, interfaceC30057d);
            this.f2903z = c0790c;
        }

        public final Object invoke(InterfaceC13062m interfaceC13062m, AbstractC0788a abstractC0788a, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            g gVar = new g(interfaceC30057d, this.f2903z);
            gVar.f2901x = interfaceC13062m;
            gVar.f2902y = abstractC0788a;
            return gVar.invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            InterfaceC13058l interfaceC13058lM1915r;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f2900w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC13062m interfaceC13062m = (InterfaceC13062m) this.f2901x;
                AbstractC0788a abstractC0788a = (AbstractC0788a) this.f2902y;
                if (abstractC0788a instanceof AbstractC0788a.c) {
                    AbstractC0788a.c cVar = (AbstractC0788a.c) abstractC0788a;
                    interfaceC13058lM1915r = this.f2903z.m1911n(cVar.getEpisodeId(), cVar.getBiomarkerTestId(), cVar.getTestType());
                } else if (abstractC0788a instanceof AbstractC0788a.f) {
                    AbstractC0788a.f fVar = (AbstractC0788a.f) abstractC0788a;
                    interfaceC13058lM1915r = this.f2903z.m1914q(fVar.getSiteCode(), fVar.getCom.mapbox.common.HttpHeaders.DATE java.lang.String());
                } else if (abstractC0788a instanceof AbstractC0788a.a) {
                    interfaceC13058lM1915r = this.f2903z.m1909l();
                } else if (abstractC0788a instanceof AbstractC0788a.d) {
                    AbstractC0788a.d dVar = (AbstractC0788a.d) abstractC0788a;
                    interfaceC13058lM1915r = this.f2903z.m1913p(dVar.getSiteCode(), dVar.getCom.mapbox.common.HttpHeaders.DATE java.lang.String(), dVar.getEpisodeId(), dVar.getBiomarkerTestId());
                } else if (abstractC0788a instanceof AbstractC0788a.b) {
                    interfaceC13058lM1915r = this.f2903z.m1910m();
                } else {
                    if (!(abstractC0788a instanceof AbstractC0788a.e)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    interfaceC13058lM1915r = this.f2903z.m1915r((AbstractC0788a.e) abstractC0788a);
                }
                this.f2901x = null;
                this.f2902y = null;
                this.f2900w = 1;
                if (AbstractC13091v.m36613w(interfaceC13062m, interfaceC13058lM1915r, this) == enumC31071a) {
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
            return invoke((InterfaceC13062m) obj, (AbstractC0788a) obj2, (InterfaceC30057d<? super C23454a0>) obj3);
        }
    }

    /* JADX INFO: renamed from: ae0.c$h */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.advancedlabs.schedulingform.domain.SchedulingFormInteractor$performSearch$1", m100430f = "SchedulingFormInteractor.kt", m100431l = {83, 85, 86}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lec3/m;", "Lae0/b;", "Ll83/a0;", "<anonymous>", "(Lec3/m;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class h extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: E */
        final /* synthetic */ String f2904E;

        /* JADX INFO: renamed from: F */
        final /* synthetic */ C0790c f2905F;

        /* JADX INFO: renamed from: G */
        final /* synthetic */ String f2906G;

        /* JADX INFO: renamed from: w */
        Object f2907w;

        /* JADX INFO: renamed from: x */
        Object f2908x;

        /* JADX INFO: renamed from: y */
        int f2909y;

        /* JADX INFO: renamed from: z */
        private /* synthetic */ Object f2910z;

        /* JADX INFO: renamed from: ae0.c$h$a */
        @InterfaceC32271e(m100429c = "com.whoop.advancedlabs.schedulingform.domain.SchedulingFormInteractor$performSearch$1$response$1", m100430f = "SchedulingFormInteractor.kt", m100431l = {83}, m100432m = "invokeSuspend", m100433v = 2)
        @Metadata(m65680d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, m65681d2 = {"<anonymous>", "Lcom/whoop/advancedlabs/domain/models/FormContent;"}, m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a extends AbstractC32275i implements Function1 {

            /* JADX INFO: renamed from: w */
            int f2911w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C0790c f2912x;

            /* JADX INFO: renamed from: y */
            final /* synthetic */ String f2913y;

            /* JADX INFO: renamed from: z */
            final /* synthetic */ String f2914z;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(C0790c c0790c, String str, String str2, InterfaceC30057d<? super a> interfaceC30057d) {
                super(1, interfaceC30057d);
                this.f2912x = c0790c;
                this.f2913y = str;
                this.f2914z = str2;
            }

            @Override // s83.AbstractC32267a
            public final InterfaceC30057d<C23454a0> create(InterfaceC30057d<?> interfaceC30057d) {
                return new a(this.f2912x, this.f2913y, this.f2914z, interfaceC30057d);
            }

            @Override // s83.AbstractC32267a
            public final Object invokeSuspend(Object obj) {
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i13 = this.f2911w;
                if (i13 != 0) {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj);
                    return obj;
                }
                AbstractC34132o.m107864I(obj);
                AdvancedLabsApi advancedLabsApi = this.f2912x.api;
                String str = this.f2913y;
                AbstractC22676k.m65747g(str);
                String str2 = this.f2914z;
                this.f2911w = 1;
                Object objSearchSchedulingLocations = advancedLabsApi.searchSchedulingLocations(str, str2, this);
                return objSearchSchedulingLocations == enumC31071a ? enumC31071a : objSearchSchedulingLocations;
            }

            @Override // p715kotlin.jvm.functions.Function1
            public final Object invoke(InterfaceC30057d<? super FormContent> interfaceC30057d) {
                return ((a) create(interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(String str, C0790c c0790c, String str2, InterfaceC30057d<? super h> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f2904E = str;
            this.f2905F = c0790c;
            this.f2906G = str2;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            h hVar = new h(this.f2904E, this.f2905F, this.f2906G, interfaceC30057d);
            hVar.f2910z = obj;
            return hVar;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC13062m interfaceC13062m, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((h) create(interfaceC13062m, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:18:0x0083, code lost:
        
            if (r8.emit(r1, r13) == r9) goto L24;
         */
        /* JADX WARN: Code restructure failed: missing block: B:23:0x0098, code lost:
        
            if (r8.emit(r0, r13) == r9) goto L24;
         */
        @Override // s83.AbstractC32267a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r14) throws java.io.UnsupportedEncodingException {
            /*
                r13 = this;
                java.lang.Object r0 = r13.f2910z
                r8 = r0
                ec3.m r8 = (ec3.InterfaceC13062m) r8
                r83.a r9 = r83.EnumC31071a.f128113w
                int r0 = r13.f2909y
                r10 = 3
                r11 = 2
                r1 = 1
                r12 = 0
                if (r0 == 0) goto L34
                if (r0 == r1) goto L2b
                if (r0 == r11) goto L1e
                if (r0 != r10) goto L16
                goto L1e
            L16:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
                r0.<init>(r1)
                throw r0
            L1e:
                java.lang.Object r0 = r13.f2908x
                u02.a r0 = (u02.InterfaceC34385a) r0
                java.lang.Object r0 = r13.f2907w
                java.lang.String r0 = (java.lang.String) r0
                p505ts.AbstractC34132o.m107864I(r14)
                goto L9b
            L2b:
                java.lang.Object r0 = r13.f2907w
                java.lang.String r0 = (java.lang.String) r0
                p505ts.AbstractC34132o.m107864I(r14)
                r0 = r14
                goto L64
            L34:
                p505ts.AbstractC34132o.m107864I(r14)
                java.lang.String r0 = r13.f2904E
                java.lang.String r2 = "UTF-8"
                java.lang.String r0 = java.net.URLEncoder.encode(r0, r2)
                u02.a$a r2 = u02.InterfaceC34385a.INSTANCE
                ae0.c r3 = r13.f2905F
                tr2.n r3 = ae0.C0790c.m1904g(r3)
                ae0.c$h$a r4 = new ae0.c$h$a
                ae0.c r6 = r13.f2905F
                java.lang.String r7 = r13.f2906G
                r4.<init>(r6, r0, r7, r12)
                r13.f2910z = r8
                r13.f2907w = r12
                r13.f2909y = r1
                r0 = r2
                r2 = 0
                r1 = r3
                r3 = 0
                r6 = 6
                r7 = 0
                r5 = r13
                java.lang.Object r0 = u02.InterfaceC34385a.Companion.m108729b(r0, r1, r2, r3, r4, r5, r6, r7)
                if (r0 != r9) goto L64
                goto L9a
            L64:
                u02.a r0 = (u02.InterfaceC34385a) r0
                boolean r1 = r0 instanceof u02.InterfaceC34385a.c
                if (r1 == 0) goto L86
                ae0.b$h r1 = new ae0.b$h
                u02.a$c r0 = (u02.InterfaceC34385a.c) r0
                java.lang.Object r0 = r0.m108735a()
                com.whoop.advancedlabs.domain.models.FormContent r0 = (com.whoop.advancedlabs.domain.models.FormContent) r0
                r1.<init>(r0)
                r13.f2910z = r12
                r13.f2907w = r12
                r13.f2908x = r12
                r13.f2909y = r11
                java.lang.Object r0 = r8.emit(r1, r13)
                if (r0 != r9) goto L9b
                goto L9a
            L86:
                boolean r0 = r0 instanceof u02.InterfaceC34385a.b
                if (r0 == 0) goto L9e
                ae0.b$g r0 = ae0.AbstractC0789b.g.f2853a
                r13.f2910z = r12
                r13.f2907w = r12
                r13.f2908x = r12
                r13.f2909y = r10
                java.lang.Object r0 = r8.emit(r0, r13)
                if (r0 != r9) goto L9b
            L9a:
                return r9
            L9b:
                l83.a0 r0 = l83.C23454a0.f92919a
                return r0
            L9e:
                kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
                r0.<init>()
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: ae0.C0790c.h.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: ae0.c$i */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.advancedlabs.schedulingform.domain.SchedulingFormInteractor$saveAppointment$1", m100430f = "SchedulingFormInteractor.kt", m100431l = {104, 106, 116, 117}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lec3/m;", "Lae0/b;", "Ll83/a0;", "<anonymous>", "(Lec3/m;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class i extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: E */
        final /* synthetic */ String f2915E;

        /* JADX INFO: renamed from: F */
        final /* synthetic */ String f2916F;

        /* JADX INFO: renamed from: G */
        final /* synthetic */ String f2917G;

        /* JADX INFO: renamed from: H */
        final /* synthetic */ String f2918H;

        /* JADX INFO: renamed from: w */
        Object f2919w;

        /* JADX INFO: renamed from: x */
        int f2920x;

        /* JADX INFO: renamed from: y */
        private /* synthetic */ Object f2921y;

        /* JADX INFO: renamed from: ae0.c$i$a */
        @InterfaceC32271e(m100429c = "com.whoop.advancedlabs.schedulingform.domain.SchedulingFormInteractor$saveAppointment$1$response$1", m100430f = "SchedulingFormInteractor.kt", m100431l = {108}, m100432m = "invokeSuspend", m100433v = 2)
        @Metadata(m65680d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, m65681d2 = {"Ll83/a0;", "<anonymous>", "()V"}, m65682k = 3, m65683mv = {2, 3, 0})
        public static final class a extends AbstractC32275i implements Function1 {

            /* JADX INFO: renamed from: E */
            final /* synthetic */ String f2923E;

            /* JADX INFO: renamed from: F */
            final /* synthetic */ String f2924F;

            /* JADX INFO: renamed from: G */
            final /* synthetic */ String f2925G;

            /* JADX INFO: renamed from: w */
            Object f2926w;

            /* JADX INFO: renamed from: x */
            int f2927x;

            /* JADX INFO: renamed from: y */
            final /* synthetic */ String f2928y;

            /* JADX INFO: renamed from: z */
            final /* synthetic */ C0790c f2929z;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(String str, C0790c c0790c, String str2, String str3, String str4, InterfaceC30057d<? super a> interfaceC30057d) {
                super(1, interfaceC30057d);
                this.f2928y = str;
                this.f2929z = c0790c;
                this.f2923E = str2;
                this.f2924F = str3;
                this.f2925G = str4;
            }

            @Override // s83.AbstractC32267a
            public final InterfaceC30057d<C23454a0> create(InterfaceC30057d<?> interfaceC30057d) {
                return new a(this.f2928y, this.f2929z, this.f2923E, this.f2924F, this.f2925G, interfaceC30057d);
            }

            @Override // s83.AbstractC32267a
            public final Object invokeSuspend(Object obj) {
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i13 = this.f2927x;
                if (i13 == 0) {
                    AbstractC34132o.m107864I(obj);
                    String str = this.f2928y;
                    String str2 = (str == null || AbstractC39414r.m125890i0(str)) ? null : str;
                    AdvancedLabsApi advancedLabsApi = this.f2929z.api;
                    String str3 = this.f2923E;
                    String str4 = this.f2924F;
                    String str5 = str2 == null ? this.f2925G : null;
                    this.f2926w = null;
                    this.f2927x = 1;
                    if (advancedLabsApi.saveAppointment(str3, str4, str2, str5, this) == enumC31071a) {
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
                return ((a) create(interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(String str, String str2, String str3, String str4, InterfaceC30057d<? super i> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f2915E = str;
            this.f2916F = str2;
            this.f2917G = str3;
            this.f2918H = str4;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            i iVar = C0790c.this.new i(this.f2915E, this.f2916F, this.f2917G, this.f2918H, interfaceC30057d);
            iVar.f2921y = obj;
            return iVar;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC13062m interfaceC13062m, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((i) create(interfaceC13062m, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        /* JADX WARN: Code duplicated, block: B:22:0x007c  */
        /* JADX WARN: Code duplicated, block: B:25:0x008e  */
        /* JADX WARN: Code duplicated, block: B:27:0x0092  */
        /* JADX WARN: Code duplicated, block: B:32:0x00a8  */
        /* JADX WARN: Code restructure failed: missing block: B:23:0x008b, code lost:
        
            if (r8.emit(r0, r20) == r9) goto L29;
         */
        /* JADX WARN: Code restructure failed: missing block: B:28:0x00a2, code lost:
        
            if (r8.emit(r0, r20) == r9) goto L29;
         */
        @Override // s83.AbstractC32267a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r21) {
            /*
                r20 = this;
                r5 = r20
                java.lang.Object r0 = r5.f2921y
                r8 = r0
                ec3.m r8 = (ec3.InterfaceC13062m) r8
                r83.a r9 = r83.EnumC31071a.f128113w
                int r0 = r5.f2920x
                r10 = 4
                r11 = 3
                r1 = 2
                r12 = 1
                if (r0 == 0) goto L35
                if (r0 == r12) goto L31
                if (r0 == r1) goto L2b
                if (r0 == r11) goto L22
                if (r0 != r10) goto L1a
                goto L22
            L1a:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
                r0.<init>(r1)
                throw r0
            L22:
                java.lang.Object r0 = r5.f2919w
                u02.a r0 = (u02.InterfaceC34385a) r0
                p505ts.AbstractC34132o.m107864I(r21)
                goto La5
            L2b:
                p505ts.AbstractC34132o.m107864I(r21)
                r0 = r21
                goto L75
            L31:
                p505ts.AbstractC34132o.m107864I(r21)
                goto L45
            L35:
                p505ts.AbstractC34132o.m107864I(r21)
                ae0.b$f r0 = ae0.AbstractC0789b.f.f2852a
                r5.f2921y = r8
                r5.f2920x = r12
                java.lang.Object r0 = r8.emit(r0, r5)
                if (r0 != r9) goto L45
                goto La4
            L45:
                u02.a$a r0 = u02.InterfaceC34385a.INSTANCE
                ae0.c r2 = ae0.C0790c.this
                tr2.n r2 = ae0.C0790c.m1904g(r2)
                ae0.c$i$a r4 = new ae0.c$i$a
                java.lang.String r14 = r5.f2915E
                ae0.c r15 = ae0.C0790c.this
                java.lang.String r3 = r5.f2916F
                java.lang.String r6 = r5.f2917G
                java.lang.String r7 = r5.f2918H
                r19 = 0
                r16 = r3
                r13 = r4
                r17 = r6
                r18 = r7
                r13.<init>(r14, r15, r16, r17, r18, r19)
                r5.f2921y = r8
                r5.f2920x = r1
                r1 = r2
                r2 = 0
                r3 = 0
                r6 = 6
                r7 = 0
                java.lang.Object r0 = u02.InterfaceC34385a.Companion.m108729b(r0, r1, r2, r3, r4, r5, r6, r7)
                if (r0 != r9) goto L75
                goto La4
            L75:
                u02.a r0 = (u02.InterfaceC34385a) r0
                boolean r1 = r0 instanceof u02.InterfaceC34385a.c
                r2 = 0
                if (r1 == 0) goto L8e
                ae0.b$e r0 = new ae0.b$e
                r0.<init>(r12)
                r5.f2921y = r2
                r5.f2919w = r2
                r5.f2920x = r11
                java.lang.Object r0 = r8.emit(r0, r5)
                if (r0 != r9) goto La5
                goto La4
            L8e:
                boolean r0 = r0 instanceof u02.InterfaceC34385a.b
                if (r0 == 0) goto La8
                ae0.b$e r0 = new ae0.b$e
                r1 = 0
                r0.<init>(r1)
                r5.f2921y = r2
                r5.f2919w = r2
                r5.f2920x = r10
                java.lang.Object r0 = r8.emit(r0, r5)
                if (r0 != r9) goto La5
            La4:
                return r9
            La5:
                l83.a0 r0 = l83.C23454a0.f92919a
                return r0
            La8:
                kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
                r0.<init>()
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: ae0.C0790c.i.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: ae0.c$j */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.advancedlabs.schedulingform.domain.SchedulingFormInteractor$selectAppointment$1", m100430f = "SchedulingFormInteractor.kt", m100431l = {91}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lec3/m;", "Lae0/b;", "Ll83/a0;", "<anonymous>", "(Lec3/m;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class j extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f2930w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f2931x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ String f2932y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ String f2933z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(String str, String str2, InterfaceC30057d<? super j> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f2932y = str;
            this.f2933z = str2;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            j jVar = new j(this.f2932y, this.f2933z, interfaceC30057d);
            jVar.f2931x = obj;
            return jVar;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC13062m interfaceC13062m, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((j) create(interfaceC13062m, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            InterfaceC13062m interfaceC13062m = (InterfaceC13062m) this.f2931x;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f2930w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                AbstractC0789b.b bVar = new AbstractC0789b.b(this.f2932y, this.f2933z);
                this.f2931x = null;
                this.f2930w = 1;
                if (interfaceC13062m.emit(bVar, this) == enumC31071a) {
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
    }

    /* JADX INFO: renamed from: ae0.c$k */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.advancedlabs.schedulingform.domain.SchedulingFormInteractor$startSearch$1", m100430f = "SchedulingFormInteractor.kt", m100431l = {64, 66}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lec3/m;", "Lae0/b;", "Ll83/a0;", "<anonymous>", "(Lec3/m;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class k extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f2934w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f2935x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ AbstractC0788a.e f2936y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ C0790c f2937z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(AbstractC0788a.e eVar, C0790c c0790c, InterfaceC30057d<? super k> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f2936y = eVar;
            this.f2937z = c0790c;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            k kVar = new k(this.f2936y, this.f2937z, interfaceC30057d);
            kVar.f2935x = obj;
            return kVar;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC13062m interfaceC13062m, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((k) create(interfaceC13062m, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:16:0x0056, code lost:
        
            if (ec3.AbstractC13091v.m36613w(r0, r6, r5) == r1) goto L17;
         */
        @Override // s83.AbstractC32267a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r6) {
            /*
                r5 = this;
                java.lang.Object r0 = r5.f2935x
                ec3.m r0 = (ec3.InterfaceC13062m) r0
                r83.a r1 = r83.EnumC31071a.f128113w
                int r2 = r5.f2934w
                r3 = 2
                r4 = 1
                if (r2 == 0) goto L20
                if (r2 == r4) goto L1c
                if (r2 != r3) goto L14
                p505ts.AbstractC34132o.m107864I(r6)
                goto L59
            L14:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r0)
                throw r6
            L1c:
                p505ts.AbstractC34132o.m107864I(r6)
                goto L33
            L20:
                p505ts.AbstractC34132o.m107864I(r6)
                ae0.b$i r6 = new ae0.b$i
                r6.<init>(r4)
                r5.f2935x = r0
                r5.f2934w = r4
                java.lang.Object r6 = r0.emit(r6, r5)
                if (r6 != r1) goto L33
                goto L58
            L33:
                ae0.a$e r6 = r5.f2936y
                boolean r6 = r6.getSkipDebounce()
                if (r6 == 0) goto L59
                ae0.c r6 = r5.f2937z
                ae0.a$e r2 = r5.f2936y
                java.lang.String r2 = r2.getLocation()
                ae0.a$e r4 = r5.f2936y
                java.lang.String r4 = r4.getCom.mapbox.common.HttpHeaders.DATE java.lang.String()
                ec3.l r6 = ae0.C0790c.m1905h(r6, r2, r4)
                r2 = 0
                r5.f2935x = r2
                r5.f2934w = r3
                java.lang.Object r6 = ec3.AbstractC13091v.m36613w(r0, r6, r5)
                if (r6 != r1) goto L59
            L58:
                return r1
            L59:
                l83.a0 r6 = l83.C23454a0.f92919a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: ae0.C0790c.k.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public C0790c(AdvancedLabsApi api, InterfaceC34116n logger) {
        AbstractC22676k.m65750j(api, "api");
        AbstractC22676k.m65750j(logger, "logger");
        this.api = api;
        this.logger = logger;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: l */
    public final InterfaceC13058l m1909l() {
        return new C13084s1(new a(null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: m */
    public final InterfaceC13058l m1910m() {
        return new C13084s1(new b(null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n */
    public final InterfaceC13058l m1911n(String episodeId, String biomarkerTestId, String testType) {
        return new C13084s1(new c(episodeId, biomarkerTestId, testType, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o */
    public final InterfaceC13058l m1912o(String location, String date) {
        return new C13084s1(new h(location, this, date, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p */
    public final InterfaceC13058l m1913p(String siteCode, String date, String episodeId, String biomarkerTestId) {
        return new C13084s1(new i(biomarkerTestId, siteCode, date, episodeId, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q */
    public final InterfaceC13058l m1914q(String siteCode, String date) {
        return new C13084s1(new j(siteCode, date, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r */
    public final InterfaceC13058l m1915r(AbstractC0788a.e action) {
        return !AbstractC39414r.m125890i0(action.getLocation()) ? new C13084s1(new k(action, this, null)) : new C0456u(new AbstractC0789b.i(false), 1);
    }

    @Override // od1.InterfaceC27844g
    public InterfaceC13058l interact(InterfaceC13058l upstream) {
        AbstractC22676k.m65750j(upstream, "upstream");
        return AbstractC13091v.m36584J(AbstractC13091v.m36590P(upstream, new g(null, this)), AbstractC13091v.m36590P(AbstractC13091v.m36608r(AbstractC13091v.m36610t(new d(new e(upstream))), 1000L), new f(null, this)));
    }

    public /* synthetic */ C0790c(AdvancedLabsApi advancedLabsApi, InterfaceC34116n interfaceC34116n, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(advancedLabsApi, (i13 & 2) != 0 ? InterfaceC34116n.INSTANCE.m107848a("SchedulingFormInteractor") : interfaceC34116n);
    }
}
