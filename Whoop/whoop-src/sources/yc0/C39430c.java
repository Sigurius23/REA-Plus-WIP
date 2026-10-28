package yc0;

import c93.InterfaceC4351m;
import com.whoop.advancedlabs.domain.AdvancedLabsApi;
import com.whoop.advancedlabs.mobilescheduling.domain.models.MobileSchedulingFormResponse;
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

/* JADX INFO: renamed from: yc0.c */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0019\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00030\f2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ#\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u00030\f2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00020\fH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, m65681d2 = {"Lyc0/c;", "Lod1/g;", "Lyc0/a;", "Lyc0/b;", "Lcom/whoop/advancedlabs/domain/AdvancedLabsApi;", "api", "Ltr2/n;", "logger", "<init>", "(Lcom/whoop/advancedlabs/domain/AdvancedLabsApi;Ltr2/n;)V", "", "testType", "Lec3/l;", "f", "(Ljava/lang/String;)Lec3/l;", "upstream", "interact", "(Lec3/l;)Lec3/l;", "a", "Lcom/whoop/advancedlabs/domain/AdvancedLabsApi;", "b", "Ltr2/n;", "advanced-labs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C39430c implements InterfaceC27844g<AbstractC39428a, AbstractC39429b> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final AdvancedLabsApi api;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final InterfaceC34116n logger;

    /* JADX INFO: renamed from: yc0.c$a */
    @InterfaceC32271e(m100429c = "com.whoop.advancedlabs.mobilescheduling.domain.MobileSchedulingFormInteractor$interact$$inlined$flatMapLatest$1", m100430f = "MobileSchedulingFormInteractor.kt", m100431l = {189}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"}, m65681d2 = {"R", "T", "Lec3/m;", "it", "Ll83/a0;", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements Function3 {

        /* JADX INFO: renamed from: w */
        int f169651w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f169652x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f169653y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ C39430c f169654z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(InterfaceC30057d interfaceC30057d, C39430c c39430c) {
            super(3, interfaceC30057d);
            this.f169654z = c39430c;
        }

        public final Object invoke(InterfaceC13062m interfaceC13062m, AbstractC39428a abstractC39428a, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            a aVar = new a(interfaceC30057d, this.f169654z);
            aVar.f169652x = interfaceC13062m;
            aVar.f169653y = abstractC39428a;
            return aVar.invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f169651w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC13062m interfaceC13062m = (InterfaceC13062m) this.f169652x;
                AbstractC39428a abstractC39428a = (AbstractC39428a) this.f169653y;
                if (!(abstractC39428a instanceof AbstractC39428a.a)) {
                    throw new NoWhenBranchMatchedException();
                }
                InterfaceC13058l interfaceC13058lM125941f = this.f169654z.m125941f(((AbstractC39428a.a) abstractC39428a).getTestType());
                this.f169652x = null;
                this.f169653y = null;
                this.f169651w = 1;
                if (AbstractC13091v.m36613w(interfaceC13062m, interfaceC13058lM125941f, this) == enumC31071a) {
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
            return invoke((InterfaceC13062m) obj, (AbstractC39428a) obj2, (InterfaceC30057d<? super C23454a0>) obj3);
        }
    }

    /* JADX INFO: renamed from: yc0.c$b */
    @InterfaceC32271e(m100429c = "com.whoop.advancedlabs.mobilescheduling.domain.MobileSchedulingFormInteractor$loadForm$1", m100430f = "MobileSchedulingFormInteractor.kt", m100431l = {27, 28, 29, 32}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lec3/m;", "Lyc0/b;", "Ll83/a0;", "<anonymous>", "(Lec3/m;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class b extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: E */
        final /* synthetic */ String f169655E;

        /* JADX INFO: renamed from: w */
        Object f169656w;

        /* JADX INFO: renamed from: x */
        int f169657x;

        /* JADX INFO: renamed from: y */
        private /* synthetic */ Object f169658y;

        /* JADX INFO: renamed from: yc0.c$b$a */
        @InterfaceC32271e(m100429c = "com.whoop.advancedlabs.mobilescheduling.domain.MobileSchedulingFormInteractor$loadForm$1$response$1", m100430f = "MobileSchedulingFormInteractor.kt", m100431l = {28}, m100432m = "invokeSuspend", m100433v = 2)
        @Metadata(m65680d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, m65681d2 = {"<anonymous>", "Lcom/whoop/advancedlabs/mobilescheduling/domain/models/MobileSchedulingFormResponse;"}, m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a extends AbstractC32275i implements Function1 {

            /* JADX INFO: renamed from: w */
            int f169660w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C39430c f169661x;

            /* JADX INFO: renamed from: y */
            final /* synthetic */ String f169662y;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(C39430c c39430c, String str, InterfaceC30057d<? super a> interfaceC30057d) {
                super(1, interfaceC30057d);
                this.f169661x = c39430c;
                this.f169662y = str;
            }

            @Override // s83.AbstractC32267a
            public final InterfaceC30057d<C23454a0> create(InterfaceC30057d<?> interfaceC30057d) {
                return new a(this.f169661x, this.f169662y, interfaceC30057d);
            }

            @Override // s83.AbstractC32267a
            public final Object invokeSuspend(Object obj) {
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i13 = this.f169660w;
                if (i13 != 0) {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj);
                    return obj;
                }
                AbstractC34132o.m107864I(obj);
                AdvancedLabsApi advancedLabsApi = this.f169661x.api;
                String str = this.f169662y;
                this.f169660w = 1;
                Object mobileSchedulingForm = advancedLabsApi.getMobileSchedulingForm(str, this);
                return mobileSchedulingForm == enumC31071a ? enumC31071a : mobileSchedulingForm;
            }

            @Override // p715kotlin.jvm.functions.Function1
            public final Object invoke(InterfaceC30057d<? super MobileSchedulingFormResponse> interfaceC30057d) {
                return ((a) create(interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str, InterfaceC30057d<? super b> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f169655E = str;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            b bVar = C39430c.this.new b(this.f169655E, interfaceC30057d);
            bVar.f169658y = obj;
            return bVar;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC13062m interfaceC13062m, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((b) create(interfaceC13062m, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        /* JADX WARN: Code duplicated, block: B:22:0x006b  */
        /* JADX WARN: Code duplicated, block: B:25:0x0085  */
        /* JADX WARN: Code duplicated, block: B:27:0x0089  */
        /* JADX WARN: Code duplicated, block: B:32:0x00af  */
        /* JADX WARN: Code restructure failed: missing block: B:23:0x0082, code lost:
        
            if (r8.emit(r1, r13) == r9) goto L29;
         */
        /* JADX WARN: Code restructure failed: missing block: B:28:0x00a9, code lost:
        
            if (r8.emit(r0, r13) == r9) goto L29;
         */
        @Override // s83.AbstractC32267a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r14) {
            /*
                r13 = this;
                java.lang.Object r0 = r13.f169658y
                r8 = r0
                ec3.m r8 = (ec3.InterfaceC13062m) r8
                r83.a r9 = r83.EnumC31071a.f128113w
                int r0 = r13.f169657x
                r10 = 4
                r11 = 3
                r1 = 2
                r2 = 1
                r12 = 0
                if (r0 == 0) goto L33
                if (r0 == r2) goto L2f
                if (r0 == r1) goto L2a
                if (r0 == r11) goto L21
                if (r0 != r10) goto L19
                goto L21
            L19:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
                r0.<init>(r1)
                throw r0
            L21:
                java.lang.Object r0 = r13.f169656w
                u02.a r0 = (u02.InterfaceC34385a) r0
                p505ts.AbstractC34132o.m107864I(r14)
                goto Lac
            L2a:
                p505ts.AbstractC34132o.m107864I(r14)
                r0 = r14
                goto L65
            L2f:
                p505ts.AbstractC34132o.m107864I(r14)
                goto L43
            L33:
                p505ts.AbstractC34132o.m107864I(r14)
                yc0.b$b r0 = yc0.AbstractC39429b.b.f169647a
                r13.f169658y = r8
                r13.f169657x = r2
                java.lang.Object r0 = r8.emit(r0, r13)
                if (r0 != r9) goto L43
                goto Lab
            L43:
                u02.a$a r0 = u02.InterfaceC34385a.INSTANCE
                yc0.c r2 = yc0.C39430c.this
                tr2.n r2 = yc0.C39430c.m125939d(r2)
                yc0.c$b$a r4 = new yc0.c$b$a
                yc0.c r3 = yc0.C39430c.this
                java.lang.String r6 = r13.f169655E
                r4.<init>(r3, r6, r12)
                r13.f169658y = r8
                r13.f169657x = r1
                r1 = r2
                r2 = 0
                r3 = 0
                r6 = 6
                r7 = 0
                r5 = r13
                java.lang.Object r0 = u02.InterfaceC34385a.Companion.m108729b(r0, r1, r2, r3, r4, r5, r6, r7)
                if (r0 != r9) goto L65
                goto Lab
            L65:
                u02.a r0 = (u02.InterfaceC34385a) r0
                boolean r1 = r0 instanceof u02.InterfaceC34385a.c
                if (r1 == 0) goto L85
                yc0.b$c r1 = new yc0.b$c
                u02.a$c r0 = (u02.InterfaceC34385a.c) r0
                java.lang.Object r0 = r0.m108735a()
                com.whoop.advancedlabs.mobilescheduling.domain.models.MobileSchedulingFormResponse r0 = (com.whoop.advancedlabs.mobilescheduling.domain.models.MobileSchedulingFormResponse) r0
                r1.<init>(r0)
                r13.f169658y = r12
                r13.f169656w = r12
                r13.f169657x = r11
                java.lang.Object r0 = r8.emit(r1, r13)
                if (r0 != r9) goto Lac
                goto Lab
            L85:
                boolean r0 = r0 instanceof u02.InterfaceC34385a.b
                if (r0 == 0) goto Laf
                yc0.c r0 = yc0.C39430c.this
                tr2.n r0 = yc0.C39430c.m125939d(r0)
                java.lang.String r1 = r13.f169655E
                java.lang.String r2 = "Failed to fetch v2 scheduling form for testType="
                java.lang.String r1 = p000.AbstractC11266d.m30461o(r2, r1)
                r2 = 0
                qr2.a$a[] r2 = new qr2.AbstractC30556a.a[r2]
                r0.mo85228t(r1, r2)
                yc0.b$a r0 = yc0.AbstractC39429b.a.f169646a
                r13.f169658y = r12
                r13.f169656w = r12
                r13.f169657x = r10
                java.lang.Object r0 = r8.emit(r0, r13)
                if (r0 != r9) goto Lac
            Lab:
                return r9
            Lac:
                l83.a0 r0 = l83.C23454a0.f92919a
                return r0
            Laf:
                kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
                r0.<init>()
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: yc0.C39430c.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public C39430c(AdvancedLabsApi api, InterfaceC34116n logger) {
        AbstractC22676k.m65750j(api, "api");
        AbstractC22676k.m65750j(logger, "logger");
        this.api = api;
        this.logger = logger;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public final InterfaceC13058l m125941f(String testType) {
        return new C13084s1(new b(testType, null));
    }

    @Override // od1.InterfaceC27844g
    public InterfaceC13058l interact(InterfaceC13058l upstream) {
        AbstractC22676k.m65750j(upstream, "upstream");
        return AbstractC13091v.m36590P(upstream, new a(null, this));
    }

    public /* synthetic */ C39430c(AdvancedLabsApi advancedLabsApi, InterfaceC34116n interfaceC34116n, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(advancedLabsApi, (i13 & 2) != 0 ? InterfaceC34116n.INSTANCE.m107848a("MobileSchedulingFormInteractor") : interfaceC34116n);
    }
}
