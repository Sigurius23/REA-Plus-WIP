package re0;

import c93.InterfaceC4351m;
import com.whoop.advancedlabs.domain.AdvancedLabsApi;
import com.whoop.advancedlabs.domain.models.TestResultsResponse;
import ec3.AbstractC13091v;
import ec3.C13084s1;
import ec3.InterfaceC13058l;
import ec3.InterfaceC13062m;
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
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import tr2.InterfaceC34116n;

/* JADX INFO: renamed from: re0.c */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0019\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00030\f2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ#\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00030\f2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00020\fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, m65681d2 = {"Lre0/c;", "Lod1/g;", "Lre0/a;", "Lre0/b;", "Lcom/whoop/advancedlabs/domain/AdvancedLabsApi;", "api", "Ltr2/n;", "logger", "<init>", "(Lcom/whoop/advancedlabs/domain/AdvancedLabsApi;Ltr2/n;)V", "", "id", "Lec3/l;", "f", "(Ljava/lang/String;)Lec3/l;", "upstream", "interact", "(Lec3/l;)Lec3/l;", "a", "Lcom/whoop/advancedlabs/domain/AdvancedLabsApi;", "b", "Ltr2/n;", "advanced-labs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C31313c implements InterfaceC27844g<AbstractC31311a, AbstractC31312b> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final AdvancedLabsApi api;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final InterfaceC34116n logger;

    /* JADX INFO: renamed from: re0.c$a */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.advancedlabs.testresults.domain.TestResultsInteractor$fetchData$1", m100430f = "TestResultsInteractor.kt", m100431l = {27, 28, 30}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lec3/m;", "Lre0/b;", "Ll83/a0;", "<anonymous>", "(Lec3/m;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: E */
        final /* synthetic */ String f128872E;

        /* JADX INFO: renamed from: w */
        Object f128873w;

        /* JADX INFO: renamed from: x */
        int f128874x;

        /* JADX INFO: renamed from: y */
        private /* synthetic */ Object f128875y;

        /* JADX INFO: renamed from: re0.c$a$a, reason: collision with other inner class name */
        @InterfaceC32271e(m100429c = "com.whoop.advancedlabs.testresults.domain.TestResultsInteractor$fetchData$1$response$1", m100430f = "TestResultsInteractor.kt", m100431l = {28}, m100432m = "invokeSuspend", m100433v = 2)
        @Metadata(m65680d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, m65681d2 = {"<anonymous>", "Lcom/whoop/advancedlabs/domain/models/TestResultsResponse;"}, m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class C42257a extends AbstractC32275i implements Function1 {

            /* JADX INFO: renamed from: w */
            int f128877w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C31313c f128878x;

            /* JADX INFO: renamed from: y */
            final /* synthetic */ String f128879y;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C42257a(C31313c c31313c, String str, InterfaceC30057d<? super C42257a> interfaceC30057d) {
                super(1, interfaceC30057d);
                this.f128878x = c31313c;
                this.f128879y = str;
            }

            @Override // s83.AbstractC32267a
            public final InterfaceC30057d<C23454a0> create(InterfaceC30057d<?> interfaceC30057d) {
                return new C42257a(this.f128878x, this.f128879y, interfaceC30057d);
            }

            @Override // s83.AbstractC32267a
            public final Object invokeSuspend(Object obj) {
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i13 = this.f128877w;
                if (i13 != 0) {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj);
                    return obj;
                }
                AbstractC34132o.m107864I(obj);
                AdvancedLabsApi advancedLabsApi = this.f128878x.api;
                String str = this.f128879y;
                this.f128877w = 1;
                Object testResult = advancedLabsApi.getTestResult(str, this);
                return testResult == enumC31071a ? enumC31071a : testResult;
            }

            @Override // p715kotlin.jvm.functions.Function1
            public final Object invoke(InterfaceC30057d<? super TestResultsResponse> interfaceC30057d) {
                return ((C42257a) create(interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, InterfaceC30057d<? super a> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f128872E = str;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            a aVar = C31313c.this.new a(this.f128872E, interfaceC30057d);
            aVar.f128875y = obj;
            return aVar;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC13062m interfaceC13062m, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((a) create(interfaceC13062m, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        /* JADX WARN: Code duplicated, block: B:20:0x0067  */
        /* JADX WARN: Code duplicated, block: B:21:0x0075  */
        /* JADX WARN: Code duplicated, block: B:23:0x0079  */
        /* JADX WARN: Code duplicated, block: B:29:0x008b  */
        /* JADX WARN: Code restructure failed: missing block: B:25:0x0085, code lost:
        
            if (r8.emit(r1, r12) == r9) goto L26;
         */
        @Override // s83.AbstractC32267a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r13) {
            /*
                r12 = this;
                java.lang.Object r0 = r12.f128875y
                r8 = r0
                ec3.m r8 = (ec3.InterfaceC13062m) r8
                r83.a r9 = r83.EnumC31071a.f128113w
                int r0 = r12.f128874x
                r10 = 3
                r1 = 2
                r2 = 1
                r11 = 0
                if (r0 == 0) goto L2f
                if (r0 == r2) goto L2b
                if (r0 == r1) goto L26
                if (r0 != r10) goto L1e
                java.lang.Object r0 = r12.f128873w
                u02.a r0 = (u02.InterfaceC34385a) r0
                p505ts.AbstractC34132o.m107864I(r13)
                goto L88
            L1e:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
                r0.<init>(r1)
                throw r0
            L26:
                p505ts.AbstractC34132o.m107864I(r13)
                r0 = r13
                goto L61
            L2b:
                p505ts.AbstractC34132o.m107864I(r13)
                goto L3f
            L2f:
                p505ts.AbstractC34132o.m107864I(r13)
                re0.b$d r0 = re0.AbstractC31312b.d.f128867a
                r12.f128875y = r8
                r12.f128874x = r2
                java.lang.Object r0 = r8.emit(r0, r12)
                if (r0 != r9) goto L3f
                goto L87
            L3f:
                u02.a$a r0 = u02.InterfaceC34385a.INSTANCE
                re0.c r2 = re0.C31313c.this
                tr2.n r2 = re0.C31313c.m96319e(r2)
                re0.c$a$a r4 = new re0.c$a$a
                re0.c r3 = re0.C31313c.this
                java.lang.String r6 = r12.f128872E
                r4.<init>(r3, r6, r11)
                r12.f128875y = r8
                r12.f128874x = r1
                r1 = r2
                r2 = 0
                r3 = 0
                r6 = 6
                r7 = 0
                r5 = r12
                java.lang.Object r0 = u02.InterfaceC34385a.Companion.m108729b(r0, r1, r2, r3, r4, r5, r6, r7)
                if (r0 != r9) goto L61
                goto L87
            L61:
                u02.a r0 = (u02.InterfaceC34385a) r0
                boolean r1 = r0 instanceof u02.InterfaceC34385a.c
                if (r1 == 0) goto L75
                re0.b$e r1 = new re0.b$e
                u02.a$c r0 = (u02.InterfaceC34385a.c) r0
                java.lang.Object r0 = r0.m108735a()
                com.whoop.advancedlabs.domain.models.TestResultsResponse r0 = (com.whoop.advancedlabs.domain.models.TestResultsResponse) r0
                r1.<init>(r0)
                goto L7b
            L75:
                boolean r0 = r0 instanceof u02.InterfaceC34385a.b
                if (r0 == 0) goto L8b
                re0.b$c r1 = re0.AbstractC31312b.c.f128866a
            L7b:
                r12.f128875y = r11
                r12.f128873w = r11
                r12.f128874x = r10
                java.lang.Object r0 = r8.emit(r1, r12)
                if (r0 != r9) goto L88
            L87:
                return r9
            L88:
                l83.a0 r0 = l83.C23454a0.f92919a
                return r0
            L8b:
                kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
                r0.<init>()
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: re0.C31313c.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: re0.c$b */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.advancedlabs.testresults.domain.TestResultsInteractor$interact$$inlined$flatMapLatest$1", m100430f = "TestResultsInteractor.kt", m100431l = {189}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"}, m65681d2 = {"R", "T", "Lec3/m;", "it", "Ll83/a0;", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class b extends AbstractC32275i implements Function3 {

        /* JADX INFO: renamed from: w */
        int f128880w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f128881x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f128882y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ C31313c f128883z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(InterfaceC30057d interfaceC30057d, C31313c c31313c) {
            super(3, interfaceC30057d);
            this.f128883z = c31313c;
        }

        public final Object invoke(InterfaceC13062m interfaceC13062m, AbstractC31311a abstractC31311a, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            b bVar = new b(interfaceC30057d, this.f128883z);
            bVar.f128881x = interfaceC13062m;
            bVar.f128882y = abstractC31311a;
            return bVar.invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f128880w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC13062m interfaceC13062m = (InterfaceC13062m) this.f128881x;
                AbstractC31311a abstractC31311a = (AbstractC31311a) this.f128882y;
                if (!(abstractC31311a instanceof AbstractC31311a.a)) {
                    throw new NoWhenBranchMatchedException();
                }
                InterfaceC13058l interfaceC13058lM96320f = this.f128883z.m96320f(((AbstractC31311a.a) abstractC31311a).getId());
                this.f128881x = null;
                this.f128882y = null;
                this.f128880w = 1;
                if (AbstractC13091v.m36613w(interfaceC13062m, interfaceC13058lM96320f, this) == enumC31071a) {
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
            return invoke((InterfaceC13062m) obj, (AbstractC31311a) obj2, (InterfaceC30057d<? super C23454a0>) obj3);
        }
    }

    public C31313c(AdvancedLabsApi api, InterfaceC34116n logger) {
        AbstractC22676k.m65750j(api, "api");
        AbstractC22676k.m65750j(logger, "logger");
        this.api = api;
        this.logger = logger;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public final InterfaceC13058l m96320f(String id4) {
        return new C13084s1(new a(id4, null));
    }

    @Override // od1.InterfaceC27844g
    public InterfaceC13058l interact(InterfaceC13058l upstream) {
        AbstractC22676k.m65750j(upstream, "upstream");
        return AbstractC13091v.m36590P(upstream, new b(null, this));
    }

    public /* synthetic */ C31313c(AdvancedLabsApi advancedLabsApi, InterfaceC34116n interfaceC34116n, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(advancedLabsApi, (i13 & 2) != 0 ? InterfaceC34116n.INSTANCE.m107848a("TestResultsInteractor") : interfaceC34116n);
    }
}
