package tv1;

import c93.InterfaceC4351m;
import com.whoop.membership.domain.upcycle.UpcycleApi;
import com.whoop.membership.domain.upcycle.models.UpcycleLandingModel;
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

/* JADX INFO: renamed from: tv1.b */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0019\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00030\nH\u0002¢\u0006\u0004\b\u000b\u0010\fJ#\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\n2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00020\nH\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m65681d2 = {"Ltv1/b;", "Lod1/g;", "Ltv1/a;", "Ltv1/c;", "Lcom/whoop/membership/domain/upcycle/UpcycleApi;", "api", "Ltr2/n;", "logger", "<init>", "(Lcom/whoop/membership/domain/upcycle/UpcycleApi;Ltr2/n;)V", "Lec3/l;", "f", "()Lec3/l;", "upstream", "interact", "(Lec3/l;)Lec3/l;", "a", "Lcom/whoop/membership/domain/upcycle/UpcycleApi;", "b", "Ltr2/n;", "membership_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C34206b implements InterfaceC27844g<AbstractC34205a, AbstractC34207c> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final UpcycleApi api;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final InterfaceC34116n logger;

    /* JADX INFO: renamed from: tv1.b$a */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.membership.domain.upcycle.UpcycleLandingInteractor$fetchUpcycleLandingInfo$1", m100430f = "UpcycleLandingInteractor.kt", m100431l = {24, 25, 28}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lec3/m;", "Ltv1/c;", "Ll83/a0;", "<anonymous>", "(Lec3/m;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        Object f143483w;

        /* JADX INFO: renamed from: x */
        int f143484x;

        /* JADX INFO: renamed from: y */
        private /* synthetic */ Object f143485y;

        /* JADX INFO: renamed from: tv1.b$a$a, reason: collision with other inner class name */
        @InterfaceC32271e(m100429c = "com.whoop.membership.domain.upcycle.UpcycleLandingInteractor$fetchUpcycleLandingInfo$1$response$1", m100430f = "UpcycleLandingInteractor.kt", m100431l = {26}, m100432m = "invokeSuspend", m100433v = 2)
        @Metadata(m65680d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, m65681d2 = {"<anonymous>", "Lcom/whoop/membership/domain/upcycle/models/UpcycleLandingModel;"}, m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class C42420a extends AbstractC32275i implements Function1 {

            /* JADX INFO: renamed from: w */
            int f143487w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C34206b f143488x;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C42420a(C34206b c34206b, InterfaceC30057d<? super C42420a> interfaceC30057d) {
                super(1, interfaceC30057d);
                this.f143488x = c34206b;
            }

            @Override // s83.AbstractC32267a
            public final InterfaceC30057d<C23454a0> create(InterfaceC30057d<?> interfaceC30057d) {
                return new C42420a(this.f143488x, interfaceC30057d);
            }

            @Override // s83.AbstractC32267a
            public final Object invokeSuspend(Object obj) {
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i13 = this.f143487w;
                if (i13 != 0) {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj);
                    return obj;
                }
                AbstractC34132o.m107864I(obj);
                UpcycleApi upcycleApi = this.f143488x.api;
                this.f143487w = 1;
                Object upcycleLanding = upcycleApi.getUpcycleLanding(this);
                return upcycleLanding == enumC31071a ? enumC31071a : upcycleLanding;
            }

            @Override // p715kotlin.jvm.functions.Function1
            public final Object invoke(InterfaceC30057d<? super UpcycleLandingModel> interfaceC30057d) {
                return ((C42420a) create(interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
            }
        }

        public a(InterfaceC30057d<? super a> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            a aVar = C34206b.this.new a(interfaceC30057d);
            aVar.f143485y = obj;
            return aVar;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC13062m interfaceC13062m, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((a) create(interfaceC13062m, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        /* JADX WARN: Code duplicated, block: B:20:0x0065  */
        /* JADX WARN: Code duplicated, block: B:21:0x0068  */
        /* JADX WARN: Code duplicated, block: B:23:0x006c  */
        /* JADX WARN: Code duplicated, block: B:29:0x008a  */
        /* JADX WARN: Code restructure failed: missing block: B:25:0x0084, code lost:
        
            if (r8.emit(r0, r12) == r9) goto L26;
         */
        @Override // s83.AbstractC32267a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r13) {
            /*
                r12 = this;
                java.lang.Object r0 = r12.f143485y
                r8 = r0
                ec3.m r8 = (ec3.InterfaceC13062m) r8
                r83.a r9 = r83.EnumC31071a.f128113w
                int r0 = r12.f143484x
                r10 = 3
                r1 = 2
                r2 = 1
                r11 = 0
                if (r0 == 0) goto L2f
                if (r0 == r2) goto L2b
                if (r0 == r1) goto L26
                if (r0 != r10) goto L1e
                java.lang.Object r0 = r12.f143483w
                u02.a r0 = (u02.InterfaceC34385a) r0
                p505ts.AbstractC34132o.m107864I(r13)
                goto L87
            L1e:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
                r0.<init>(r1)
                throw r0
            L26:
                p505ts.AbstractC34132o.m107864I(r13)
                r0 = r13
                goto L5f
            L2b:
                p505ts.AbstractC34132o.m107864I(r13)
                goto L3f
            L2f:
                p505ts.AbstractC34132o.m107864I(r13)
                tv1.c$c r0 = tv1.AbstractC34207c.c.f143495a
                r12.f143485y = r8
                r12.f143484x = r2
                java.lang.Object r0 = r8.emit(r0, r12)
                if (r0 != r9) goto L3f
                goto L86
            L3f:
                u02.a$a r0 = u02.InterfaceC34385a.INSTANCE
                tv1.b r2 = tv1.C34206b.this
                tr2.n r2 = tv1.C34206b.m108121e(r2)
                tv1.b$a$a r4 = new tv1.b$a$a
                tv1.b r3 = tv1.C34206b.this
                r4.<init>(r3, r11)
                r12.f143485y = r8
                r12.f143484x = r1
                r1 = r2
                r2 = 0
                r3 = 0
                r6 = 6
                r7 = 0
                r5 = r12
                java.lang.Object r0 = u02.InterfaceC34385a.Companion.m108729b(r0, r1, r2, r3, r4, r5, r6, r7)
                if (r0 != r9) goto L5f
                goto L86
            L5f:
                u02.a r0 = (u02.InterfaceC34385a) r0
                boolean r1 = r0 instanceof u02.InterfaceC34385a.b
                if (r1 == 0) goto L68
                tv1.c$a r0 = tv1.AbstractC34207c.a.f143493a
                goto L7a
            L68:
                boolean r1 = r0 instanceof u02.InterfaceC34385a.c
                if (r1 == 0) goto L8a
                tv1.c$b r1 = new tv1.c$b
                u02.a$c r0 = (u02.InterfaceC34385a.c) r0
                java.lang.Object r0 = r0.m108735a()
                com.whoop.membership.domain.upcycle.models.UpcycleLandingModel r0 = (com.whoop.membership.domain.upcycle.models.UpcycleLandingModel) r0
                r1.<init>(r0)
                r0 = r1
            L7a:
                r12.f143485y = r11
                r12.f143483w = r11
                r12.f143484x = r10
                java.lang.Object r0 = r8.emit(r0, r12)
                if (r0 != r9) goto L87
            L86:
                return r9
            L87:
                l83.a0 r0 = l83.C23454a0.f92919a
                return r0
            L8a:
                kotlin.NoWhenBranchMatchedException r0 = new kotlin.NoWhenBranchMatchedException
                r0.<init>()
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: tv1.C34206b.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: tv1.b$b */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.membership.domain.upcycle.UpcycleLandingInteractor$interact$$inlined$flatMapLatest$1", m100430f = "UpcycleLandingInteractor.kt", m100431l = {189}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"}, m65681d2 = {"R", "T", "Lec3/m;", "it", "Ll83/a0;", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class b extends AbstractC32275i implements Function3 {

        /* JADX INFO: renamed from: w */
        int f143489w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f143490x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f143491y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ C34206b f143492z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(InterfaceC30057d interfaceC30057d, C34206b c34206b) {
            super(3, interfaceC30057d);
            this.f143492z = c34206b;
        }

        public final Object invoke(InterfaceC13062m interfaceC13062m, AbstractC34205a abstractC34205a, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            b bVar = new b(interfaceC30057d, this.f143492z);
            bVar.f143490x = interfaceC13062m;
            bVar.f143491y = abstractC34205a;
            return bVar.invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f143489w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC13062m interfaceC13062m = (InterfaceC13062m) this.f143490x;
                if (!(((AbstractC34205a) this.f143491y) instanceof AbstractC34205a.a)) {
                    throw new NoWhenBranchMatchedException();
                }
                InterfaceC13058l interfaceC13058lM108122f = this.f143492z.m108122f();
                this.f143490x = null;
                this.f143491y = null;
                this.f143489w = 1;
                if (AbstractC13091v.m36613w(interfaceC13062m, interfaceC13058lM108122f, this) == enumC31071a) {
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
            return invoke((InterfaceC13062m) obj, (AbstractC34205a) obj2, (InterfaceC30057d<? super C23454a0>) obj3);
        }
    }

    public C34206b(UpcycleApi api, InterfaceC34116n logger) {
        AbstractC22676k.m65750j(api, "api");
        AbstractC22676k.m65750j(logger, "logger");
        this.api = api;
        this.logger = logger;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: f */
    public final InterfaceC13058l m108122f() {
        return new C13084s1(new a(null));
    }

    @Override // od1.InterfaceC27844g
    public InterfaceC13058l interact(InterfaceC13058l upstream) {
        AbstractC22676k.m65750j(upstream, "upstream");
        return AbstractC13091v.m36590P(upstream, new b(null, this));
    }

    public /* synthetic */ C34206b(UpcycleApi upcycleApi, InterfaceC34116n interfaceC34116n, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(upcycleApi, (i13 & 2) != 0 ? InterfaceC34116n.INSTANCE.m107848a("UpcycleLandingInteractor") : interfaceC34116n);
    }
}
