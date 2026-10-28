package wx1;

import androidx.health.platform.client.proto.C1533u;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4351m;
import com.whoop.membership.returns.domain.ReturnsApi;
import com.whoop.membership.returns.domain.models.ReturnResponse;
import ec3.AbstractC13091v;
import ec3.C13084s1;
import ec3.InterfaceC13058l;
import ec3.InterfaceC13062m;
import l83.C23454a0;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.functions.Function3;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import tr2.InterfaceC34116n;

/* JADX INFO: renamed from: wx1.c */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0001\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nH\u0082@¢\u0006\u0004\b\u000b\u0010\fJ!\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\n0\r2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0016¨\u0006\u0017"}, m65681d2 = {"Lwx1/c;", "", "Lcom/whoop/membership/returns/domain/ReturnsApi;", "api", "Ltr2/n;", "logger", "Lwx1/d;", "pdfHandler", "<init>", "(Lcom/whoop/membership/returns/domain/ReturnsApi;Ltr2/n;Lwx1/d;)V", "Lwx1/b;", "d", "(Lq83/d;)Ljava/lang/Object;", "Lec3/l;", "Lwx1/a;", "upstream", "c", "(Lec3/l;)Lec3/l;", "a", "Lcom/whoop/membership/returns/domain/ReturnsApi;", "b", "Ltr2/n;", "Lwx1/d;", "membership_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C37685c {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final ReturnsApi api;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final InterfaceC34116n logger;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final C37686d pdfHandler;

    /* JADX INFO: renamed from: wx1.c$a */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.membership.returns.domain.ReturnsInteractor$interact$$inlined$flatMapLatest$1", m100430f = "ReturnsInteractor.kt", m100431l = {189}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"}, m65681d2 = {"R", "T", "Lec3/m;", "it", "Ll83/a0;", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements Function3 {

        /* JADX INFO: renamed from: w */
        int f161453w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f161454x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f161455y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ C37685c f161456z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(InterfaceC30057d interfaceC30057d, C37685c c37685c) {
            super(3, interfaceC30057d);
            this.f161456z = c37685c;
        }

        public final Object invoke(InterfaceC13062m interfaceC13062m, AbstractC37683a abstractC37683a, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            a aVar = new a(interfaceC30057d, this.f161456z);
            aVar.f161454x = interfaceC13062m;
            aVar.f161455y = abstractC37683a;
            return aVar.invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f161453w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC13062m interfaceC13062m = (InterfaceC13062m) this.f161454x;
                C13084s1 c13084s1 = new C13084s1(new b((AbstractC37683a) this.f161455y, this.f161456z, null));
                this.f161454x = null;
                this.f161455y = null;
                this.f161453w = 1;
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
            return invoke((InterfaceC13062m) obj, (AbstractC37683a) obj2, (InterfaceC30057d<? super C23454a0>) obj3);
        }
    }

    /* JADX INFO: renamed from: wx1.c$b */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.membership.returns.domain.ReturnsInteractor$interact$1$1", m100430f = "ReturnsInteractor.kt", m100431l = {C1533u.RECORDING_METHOD_FIELD_NUMBER, 24}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lec3/m;", "Lwx1/b;", "Ll83/a0;", "<anonymous>", "(Lec3/m;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class b extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f161457w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f161458x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ AbstractC37683a f161459y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ C37685c f161460z;

        /* JADX INFO: renamed from: wx1.c$b$a */
        @InterfaceC32271e(m100429c = "com.whoop.membership.returns.domain.ReturnsInteractor$interact$1$1$1", m100430f = "ReturnsInteractor.kt", m100431l = {25, 25}, m100432m = "invokeSuspend", m100433v = 2)
        @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
        public static final class a extends AbstractC32275i implements InterfaceC4351m {

            /* JADX INFO: renamed from: w */
            Object f161461w;

            /* JADX INFO: renamed from: x */
            int f161462x;

            /* JADX INFO: renamed from: y */
            final /* synthetic */ InterfaceC13062m f161463y;

            /* JADX INFO: renamed from: z */
            final /* synthetic */ C37685c f161464z;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(InterfaceC13062m interfaceC13062m, C37685c c37685c, InterfaceC30057d<? super a> interfaceC30057d) {
                super(2, interfaceC30057d);
                this.f161463y = interfaceC13062m;
                this.f161464z = c37685c;
            }

            @Override // s83.AbstractC32267a
            public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
                return new a(this.f161463y, this.f161464z, interfaceC30057d);
            }

            @Override // c93.InterfaceC4351m
            public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
                return ((a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
            }

            /* JADX WARN: Code restructure failed: missing block: B:14:0x003b, code lost:
            
                if (r1.emit(r5, r4) == r0) goto L15;
             */
            @Override // s83.AbstractC32267a
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r5) {
                /*
                    r4 = this;
                    r83.a r0 = r83.EnumC31071a.f128113w
                    int r1 = r4.f161462x
                    r2 = 2
                    r3 = 1
                    if (r1 == 0) goto L20
                    if (r1 == r3) goto L18
                    if (r1 != r2) goto L10
                    p505ts.AbstractC34132o.m107864I(r5)
                    goto L3e
                L10:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r0)
                    throw r5
                L18:
                    java.lang.Object r1 = r4.f161461w
                    ec3.m r1 = (ec3.InterfaceC13062m) r1
                    p505ts.AbstractC34132o.m107864I(r5)
                    goto L32
                L20:
                    p505ts.AbstractC34132o.m107864I(r5)
                    ec3.m r1 = r4.f161463y
                    wx1.c r5 = r4.f161464z
                    r4.f161461w = r1
                    r4.f161462x = r3
                    java.lang.Object r5 = wx1.C37685c.m121104b(r5, r4)
                    if (r5 != r0) goto L32
                    goto L3d
                L32:
                    r3 = 0
                    r4.f161461w = r3
                    r4.f161462x = r2
                    java.lang.Object r5 = r1.emit(r5, r4)
                    if (r5 != r0) goto L3e
                L3d:
                    return r0
                L3e:
                    l83.a0 r5 = l83.C23454a0.f92919a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: wx1.C37685c.b.a.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(AbstractC37683a abstractC37683a, C37685c c37685c, InterfaceC30057d<? super b> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f161459y = abstractC37683a;
            this.f161460z = c37685c;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            b bVar = new b(this.f161459y, this.f161460z, interfaceC30057d);
            bVar.f161458x = obj;
            return bVar;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC13062m interfaceC13062m, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((b) create(interfaceC13062m, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:16:0x0048, code lost:
        
            if (or2.AbstractC28190p0.m85321a(1000, r6, r5) == r1) goto L17;
         */
        @Override // s83.AbstractC32267a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r6) {
            /*
                r5 = this;
                java.lang.Object r0 = r5.f161458x
                ec3.m r0 = (ec3.InterfaceC13062m) r0
                r83.a r1 = r83.EnumC31071a.f128113w
                int r2 = r5.f161457w
                r3 = 2
                r4 = 1
                if (r2 == 0) goto L20
                if (r2 == r4) goto L1c
                if (r2 != r3) goto L14
                p505ts.AbstractC34132o.m107864I(r6)
                goto L4b
            L14:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r0)
                throw r6
            L1c:
                p505ts.AbstractC34132o.m107864I(r6)
                goto L36
            L20:
                p505ts.AbstractC34132o.m107864I(r6)
                wx1.a r6 = r5.f161459y
                boolean r6 = r6 instanceof wx1.AbstractC37683a.a
                if (r6 == 0) goto L4e
                wx1.b$b r6 = wx1.InterfaceC37684b.b.f161448a
                r5.f161458x = r0
                r5.f161457w = r4
                java.lang.Object r6 = r0.emit(r6, r5)
                if (r6 != r1) goto L36
                goto L4a
            L36:
                wx1.c$b$a r6 = new wx1.c$b$a
                wx1.c r2 = r5.f161460z
                r4 = 0
                r6.<init>(r0, r2, r4)
                r5.f161458x = r4
                r5.f161457w = r3
                r2 = 1000(0x3e8, double:4.94E-321)
                java.lang.Object r6 = or2.AbstractC28190p0.m85321a(r2, r6, r5)
                if (r6 != r1) goto L4b
            L4a:
                return r1
            L4b:
                l83.a0 r6 = l83.C23454a0.f92919a
                return r6
            L4e:
                kotlin.NoWhenBranchMatchedException r6 = new kotlin.NoWhenBranchMatchedException
                r6.<init>()
                throw r6
            */
            throw new UnsupportedOperationException("Method not decompiled: wx1.C37685c.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: wx1.c$c */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.membership.returns.domain.ReturnsInteractor", m100430f = "ReturnsInteractor.kt", m100431l = {33, 39}, m100432m = "loadReturnData", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c extends AbstractC32269c {

        /* JADX INFO: renamed from: w */
        Object f161465w;

        /* JADX INFO: renamed from: x */
        /* synthetic */ Object f161466x;

        /* JADX INFO: renamed from: z */
        int f161468z;

        public c(InterfaceC30057d<? super c> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f161466x = obj;
            this.f161468z |= Integer.MIN_VALUE;
            return C37685c.this.m121105d(this);
        }
    }

    /* JADX INFO: renamed from: wx1.c$d */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.membership.returns.domain.ReturnsInteractor$loadReturnData$response$1", m100430f = "ReturnsInteractor.kt", m100431l = {34}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, m65681d2 = {"<anonymous>", "Lcom/whoop/membership/returns/domain/models/ReturnResponse;"}, m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class d extends AbstractC32275i implements Function1 {

        /* JADX INFO: renamed from: w */
        int f161469w;

        public d(InterfaceC30057d<? super d> interfaceC30057d) {
            super(1, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(InterfaceC30057d<?> interfaceC30057d) {
            return C37685c.this.new d(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f161469w;
            if (i13 != 0) {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
                return obj;
            }
            AbstractC34132o.m107864I(obj);
            ReturnsApi returnsApi = C37685c.this.api;
            this.f161469w = 1;
            Object returnDetails = returnsApi.getReturnDetails(this);
            return returnDetails == enumC31071a ? enumC31071a : returnDetails;
        }

        @Override // p715kotlin.jvm.functions.Function1
        public final Object invoke(InterfaceC30057d<? super ReturnResponse> interfaceC30057d) {
            return ((d) create(interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }
    }

    public C37685c(ReturnsApi api, InterfaceC34116n logger, C37686d pdfHandler) {
        AbstractC22676k.m65750j(api, "api");
        AbstractC22676k.m65750j(logger, "logger");
        AbstractC22676k.m65750j(pdfHandler, "pdfHandler");
        this.api = api;
        this.logger = logger;
        this.pdfHandler = pdfHandler;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0070, code lost:
    
        if (r12 == r0) goto L24;
     */
    /* JADX INFO: renamed from: d */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m121105d(q83.InterfaceC30057d<? super wx1.InterfaceC37684b> r12) {
        /*
            r11 = this;
            boolean r0 = r12 instanceof wx1.C37685c.c
            if (r0 == 0) goto L14
            r0 = r12
            wx1.c$c r0 = (wx1.C37685c.c) r0
            int r1 = r0.f161468z
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L14
            int r1 = r1 - r2
            r0.f161468z = r1
        L12:
            r6 = r0
            goto L1a
        L14:
            wx1.c$c r0 = new wx1.c$c
            r0.<init>(r12)
            goto L12
        L1a:
            java.lang.Object r12 = r6.f161466x
            r83.a r0 = r83.EnumC31071a.f128113w
            int r1 = r6.f161468z
            r9 = 0
            r10 = 2
            r2 = 1
            if (r1 == 0) goto L3d
            if (r1 == r2) goto L39
            if (r1 != r10) goto L31
            java.lang.Object r0 = r6.f161465w
            u02.a r0 = (u02.InterfaceC34385a) r0
            p505ts.AbstractC34132o.m107864I(r12)
            goto L73
        L31:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r0)
            throw r12
        L39:
            p505ts.AbstractC34132o.m107864I(r12)
            goto L58
        L3d:
            p505ts.AbstractC34132o.m107864I(r12)
            u02.a$a r1 = u02.InterfaceC34385a.INSTANCE
            r12 = r2
            tr2.n r2 = r11.logger
            wx1.c$d r5 = new wx1.c$d
            r5.<init>(r9)
            r6.f161468z = r12
            r3 = 0
            java.lang.String r4 = "Failed to load return details"
            r7 = 2
            r8 = 0
            java.lang.Object r12 = u02.InterfaceC34385a.Companion.m108729b(r1, r2, r3, r4, r5, r6, r7, r8)
            if (r12 != r0) goto L58
            goto L72
        L58:
            u02.a r12 = (u02.InterfaceC34385a) r12
            boolean r1 = r12 instanceof u02.InterfaceC34385a.c
            if (r1 == 0) goto L7b
            u02.a$c r12 = (u02.InterfaceC34385a.c) r12
            java.lang.Object r12 = r12.m108735a()
            com.whoop.membership.returns.domain.models.ReturnResponse r12 = (com.whoop.membership.returns.domain.models.ReturnResponse) r12
            wx1.d r1 = r11.pdfHandler
            r6.f161465w = r9
            r6.f161468z = r10
            java.lang.Object r12 = com.whoop.membership.returns.domain.models.ReturnDomainMapperKt.toReturnDomainHolder(r12, r1, r6)
            if (r12 != r0) goto L73
        L72:
            return r0
        L73:
            com.whoop.membership.returns.domain.models.ReturnDomainHolder r12 = (com.whoop.membership.returns.domain.models.ReturnDomainHolder) r12
            wx1.b$c r0 = new wx1.b$c
            r0.<init>(r12)
            return r0
        L7b:
            boolean r12 = r12 instanceof u02.InterfaceC34385a.b
            if (r12 == 0) goto L82
            wx1.b$a r12 = wx1.InterfaceC37684b.a.f161447a
            return r12
        L82:
            kotlin.NoWhenBranchMatchedException r12 = new kotlin.NoWhenBranchMatchedException
            r12.<init>()
            throw r12
        */
        throw new UnsupportedOperationException("Method not decompiled: wx1.C37685c.m121105d(q83.d):java.lang.Object");
    }

    /* JADX INFO: renamed from: c */
    public final InterfaceC13058l m121106c(InterfaceC13058l upstream) {
        AbstractC22676k.m65750j(upstream, "upstream");
        return AbstractC13091v.m36590P(upstream, new a(null, this));
    }
}
