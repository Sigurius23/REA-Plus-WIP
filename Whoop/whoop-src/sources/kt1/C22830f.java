package kt1;

import bc3.InterfaceC2994c0;
import c93.InterfaceC4351m;
import com.whoop.labrador.domain.LabradorApi;
import com.whoop.labrador.feature.eligibility.domain.model.LabradorEligibilityRequest;
import ec3.AbstractC13091v;
import ec3.C13084s1;
import ec3.InterfaceC13058l;
import ec3.InterfaceC13062m;
import l83.C23454a0;
import nt1.InterfaceC27127f;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.functions.Function3;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import pg3.C29218v0;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import tr2.InterfaceC34116n;

/* JADX INFO: renamed from: kt1.f */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\b\u0001\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ!\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\r0\n2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, m65681d2 = {"Lkt1/f;", "", "Lcom/whoop/labrador/domain/LabradorApi;", "labradorApi", "Lkt1/d;", "repository", "Ltr2/n;", "logger", "<init>", "(Lcom/whoop/labrador/domain/LabradorApi;Lkt1/d;Ltr2/n;)V", "Lec3/l;", "Lnt1/f;", "upstream", "Lnt1/h;", "d", "(Lec3/l;)Lec3/l;", "a", "Lcom/whoop/labrador/domain/LabradorApi;", "b", "Lkt1/d;", "c", "Ltr2/n;", "labrador_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C22830f {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final LabradorApi labradorApi;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final C22828d repository;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final InterfaceC34116n logger;

    /* JADX INFO: renamed from: kt1.f$a */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.labrador.feature.eligibility.domain.LabradorSubmitEligibilityInteractor$interact$$inlined$flatMapLatest$1", m100430f = "LabradorSubmitEligibilityInteractor.kt", m100431l = {189}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0005\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00000\u00022\u0006\u0010\u0003\u001a\u00028\u0001H\n"}, m65681d2 = {"R", "T", "Lec3/m;", "it", "Ll83/a0;", "<anonymous>"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements Function3 {

        /* JADX INFO: renamed from: w */
        int f89972w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f89973x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f89974y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ C22830f f89975z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(InterfaceC30057d interfaceC30057d, C22830f c22830f) {
            super(3, interfaceC30057d);
            this.f89975z = c22830f;
        }

        public final Object invoke(InterfaceC13062m interfaceC13062m, InterfaceC27127f interfaceC27127f, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            a aVar = new a(interfaceC30057d, this.f89975z);
            aVar.f89973x = interfaceC13062m;
            aVar.f89974y = interfaceC27127f;
            return aVar.invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f89972w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC13062m interfaceC13062m = (InterfaceC13062m) this.f89973x;
                if (!AbstractC22676k.m65745e((InterfaceC27127f) this.f89974y, InterfaceC27127f.a.f108461a)) {
                    throw new NoWhenBranchMatchedException();
                }
                C13084s1 c13084s1 = new C13084s1(this.f89975z.new b(null));
                this.f89973x = null;
                this.f89974y = null;
                this.f89972w = 1;
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
            return invoke((InterfaceC13062m) obj, (InterfaceC27127f) obj2, (InterfaceC30057d<? super C23454a0>) obj3);
        }
    }

    /* JADX INFO: renamed from: kt1.f$b */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.labrador.feature.eligibility.domain.LabradorSubmitEligibilityInteractor$interact$1$1", m100430f = "LabradorSubmitEligibilityInteractor.kt", m100431l = {25, 26}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lec3/m;", "Lnt1/h;", "Ll83/a0;", "<anonymous>", "(Lec3/m;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class b extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f89976w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f89977x;

        /* JADX INFO: renamed from: kt1.f$b$a */
        @InterfaceC32271e(m100429c = "com.whoop.labrador.feature.eligibility.domain.LabradorSubmitEligibilityInteractor$interact$1$1$1", m100430f = "LabradorSubmitEligibilityInteractor.kt", m100431l = {29, 31, 35, 36}, m100432m = "invokeSuspend", m100433v = 2)
        @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
        public static final class a extends AbstractC32275i implements InterfaceC4351m {

            /* JADX INFO: renamed from: E */
            final /* synthetic */ InterfaceC13062m f89979E;

            /* JADX INFO: renamed from: w */
            Object f89980w;

            /* JADX INFO: renamed from: x */
            Object f89981x;

            /* JADX INFO: renamed from: y */
            int f89982y;

            /* JADX INFO: renamed from: z */
            final /* synthetic */ C22830f f89983z;

            /* JADX INFO: renamed from: kt1.f$b$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.labrador.feature.eligibility.domain.LabradorSubmitEligibilityInteractor$interact$1$1$1$result$1", m100430f = "LabradorSubmitEligibilityInteractor.kt", m100431l = {32}, m100432m = "invokeSuspend", m100433v = 2)
            @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lpg3/v0;", "Ll83/a0;", "<anonymous>", "()Lpg3/v0;"}, m65682k = 3, m65683mv = {2, 3, 0})
            public static final class C41923a extends AbstractC32275i implements Function1 {

                /* JADX INFO: renamed from: w */
                int f89984w;

                /* JADX INFO: renamed from: x */
                final /* synthetic */ C22830f f89985x;

                /* JADX INFO: renamed from: y */
                final /* synthetic */ LabradorEligibilityRequest f89986y;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C41923a(C22830f c22830f, LabradorEligibilityRequest labradorEligibilityRequest, InterfaceC30057d<? super C41923a> interfaceC30057d) {
                    super(1, interfaceC30057d);
                    this.f89985x = c22830f;
                    this.f89986y = labradorEligibilityRequest;
                }

                @Override // s83.AbstractC32267a
                public final InterfaceC30057d<C23454a0> create(InterfaceC30057d<?> interfaceC30057d) {
                    return new C41923a(this.f89985x, this.f89986y, interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    EnumC31071a enumC31071a = EnumC31071a.f128113w;
                    int i13 = this.f89984w;
                    if (i13 != 0) {
                        if (i13 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        AbstractC34132o.m107864I(obj);
                        return obj;
                    }
                    AbstractC34132o.m107864I(obj);
                    LabradorApi labradorApi = this.f89985x.labradorApi;
                    LabradorEligibilityRequest labradorEligibilityRequest = this.f89986y;
                    this.f89984w = 1;
                    Object objSaveEligibility = labradorApi.saveEligibility(labradorEligibilityRequest, this);
                    return objSaveEligibility == enumC31071a ? enumC31071a : objSaveEligibility;
                }

                @Override // p715kotlin.jvm.functions.Function1
                public final Object invoke(InterfaceC30057d<? super C29218v0<C23454a0>> interfaceC30057d) {
                    return ((C41923a) create(interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(C22830f c22830f, InterfaceC13062m interfaceC13062m, InterfaceC30057d<? super a> interfaceC30057d) {
                super(2, interfaceC30057d);
                this.f89983z = c22830f;
                this.f89979E = interfaceC13062m;
            }

            @Override // s83.AbstractC32267a
            public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
                return new a(this.f89983z, this.f89979E, interfaceC30057d);
            }

            @Override // c93.InterfaceC4351m
            public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
                return ((a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
            }

            /* JADX WARN: Code duplicated, block: B:25:0x007a  */
            /* JADX WARN: Code duplicated, block: B:28:0x008b  */
            /* JADX WARN: Code restructure failed: missing block: B:26:0x0088, code lost:
            
                if (r14.emit(r1, r13) == r0) goto L30;
             */
            /* JADX WARN: Code restructure failed: missing block: B:29:0x009c, code lost:
            
                if (r14.emit(r1, r13) == r0) goto L30;
             */
            @Override // s83.AbstractC32267a
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r14) throws java.lang.Exception {
                /*
                    r13 = this;
                    r83.a r0 = r83.EnumC31071a.f128113w
                    int r1 = r13.f89982y
                    r2 = 4
                    r3 = 3
                    r4 = 2
                    r5 = 1
                    r6 = 0
                    if (r1 == 0) goto L31
                    if (r1 == r5) goto L20
                    if (r1 == r4) goto L28
                    if (r1 == r3) goto L1c
                    if (r1 != r2) goto L14
                    goto L1c
                L14:
                    java.lang.IllegalStateException r14 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r14.<init>(r0)
                    throw r14
                L1c:
                    java.lang.Object r0 = r13.f89981x
                    u02.a r0 = (u02.InterfaceC34385a) r0
                L20:
                    java.lang.Object r0 = r13.f89980w
                    com.whoop.labrador.feature.eligibility.domain.model.LabradorEligibilityRequest r0 = (com.whoop.labrador.feature.eligibility.domain.model.LabradorEligibilityRequest) r0
                    p505ts.AbstractC34132o.m107864I(r14)
                    goto L54
                L28:
                    java.lang.Object r1 = r13.f89980w
                    com.whoop.labrador.feature.eligibility.domain.model.LabradorEligibilityRequest r1 = (com.whoop.labrador.feature.eligibility.domain.model.LabradorEligibilityRequest) r1
                    p505ts.AbstractC34132o.m107864I(r14)
                    r12 = r13
                    goto L74
                L31:
                    p505ts.AbstractC34132o.m107864I(r14)
                    kt1.f r14 = r13.f89983z
                    kt1.d r14 = kt1.C22830f.m66205c(r14)
                    com.whoop.labrador.feature.eligibility.domain.model.LabradorEligibilityRequest r14 = r14.getRequest()
                    if (r14 != 0) goto L56
                    ec3.m r14 = r13.f89979E
                    nt1.h$a r1 = new nt1.h$a
                    r2 = 0
                    r1.<init>(r2)
                    r13.f89980w = r6
                    r13.f89982y = r5
                    java.lang.Object r14 = r14.emit(r1, r13)
                    if (r14 != r0) goto L54
                    r12 = r13
                    goto L9e
                L54:
                    r12 = r13
                    goto L9f
                L56:
                    u02.a$a r7 = u02.InterfaceC34385a.INSTANCE
                    kt1.f r1 = r13.f89983z
                    tr2.n r8 = kt1.C22830f.m66204b(r1)
                    kt1.f$b$a$a r11 = new kt1.f$b$a$a
                    kt1.f r1 = r13.f89983z
                    r11.<init>(r1, r14, r6)
                    r13.f89980w = r6
                    r13.f89982y = r4
                    r9 = 0
                    java.lang.String r10 = "Failed to submit ECG eligibility"
                    r12 = r13
                    java.lang.Object r14 = r7.m108730a(r8, r9, r10, r11, r12)
                    if (r14 != r0) goto L74
                    goto L9e
                L74:
                    u02.a r14 = (u02.InterfaceC34385a) r14
                    boolean r14 = r14 instanceof u02.InterfaceC34385a.c
                    if (r14 == 0) goto L8b
                    ec3.m r14 = r12.f89979E
                    nt1.h$c r1 = nt1.InterfaceC27129h.c.f108472a
                    r12.f89980w = r6
                    r12.f89981x = r6
                    r12.f89982y = r3
                    java.lang.Object r14 = r14.emit(r1, r13)
                    if (r14 != r0) goto L9f
                    goto L9e
                L8b:
                    ec3.m r14 = r12.f89979E
                    nt1.h$a r1 = new nt1.h$a
                    r1.<init>(r5)
                    r12.f89980w = r6
                    r12.f89981x = r6
                    r12.f89982y = r2
                    java.lang.Object r14 = r14.emit(r1, r13)
                    if (r14 != r0) goto L9f
                L9e:
                    return r0
                L9f:
                    l83.a0 r14 = l83.C23454a0.f92919a
                    return r14
                */
                throw new UnsupportedOperationException("Method not decompiled: kt1.C22830f.b.a.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        public b(InterfaceC30057d<? super b> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            b bVar = C22830f.this.new b(interfaceC30057d);
            bVar.f89977x = obj;
            return bVar;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC13062m interfaceC13062m, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((b) create(interfaceC13062m, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0042, code lost:
        
            if (or2.AbstractC28190p0.m85321a(2000, r6, r5) == r1) goto L15;
         */
        @Override // s83.AbstractC32267a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r6) {
            /*
                r5 = this;
                java.lang.Object r0 = r5.f89977x
                ec3.m r0 = (ec3.InterfaceC13062m) r0
                r83.a r1 = r83.EnumC31071a.f128113w
                int r2 = r5.f89976w
                r3 = 2
                r4 = 1
                if (r2 == 0) goto L20
                if (r2 == r4) goto L1c
                if (r2 != r3) goto L14
                p505ts.AbstractC34132o.m107864I(r6)
                goto L45
            L14:
                java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r6.<init>(r0)
                throw r6
            L1c:
                p505ts.AbstractC34132o.m107864I(r6)
                goto L30
            L20:
                p505ts.AbstractC34132o.m107864I(r6)
                nt1.h$b r6 = nt1.InterfaceC27129h.b.f108471a
                r5.f89977x = r0
                r5.f89976w = r4
                java.lang.Object r6 = r0.emit(r6, r5)
                if (r6 != r1) goto L30
                goto L44
            L30:
                kt1.f$b$a r6 = new kt1.f$b$a
                kt1.f r2 = kt1.C22830f.this
                r4 = 0
                r6.<init>(r2, r0, r4)
                r5.f89977x = r4
                r5.f89976w = r3
                r2 = 2000(0x7d0, double:9.88E-321)
                java.lang.Object r6 = or2.AbstractC28190p0.m85321a(r2, r6, r5)
                if (r6 != r1) goto L45
            L44:
                return r1
            L45:
                l83.a0 r6 = l83.C23454a0.f92919a
                return r6
            */
            throw new UnsupportedOperationException("Method not decompiled: kt1.C22830f.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    public C22830f(LabradorApi labradorApi, C22828d repository, InterfaceC34116n logger) {
        AbstractC22676k.m65750j(labradorApi, "labradorApi");
        AbstractC22676k.m65750j(repository, "repository");
        AbstractC22676k.m65750j(logger, "logger");
        this.labradorApi = labradorApi;
        this.repository = repository;
        this.logger = logger;
    }

    /* JADX INFO: renamed from: d */
    public final InterfaceC13058l m66206d(InterfaceC13058l upstream) {
        AbstractC22676k.m65750j(upstream, "upstream");
        return AbstractC13091v.m36590P(upstream, new a(null, this));
    }

    public /* synthetic */ C22830f(LabradorApi labradorApi, C22828d c22828d, InterfaceC34116n interfaceC34116n, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(labradorApi, c22828d, (i13 & 4) != 0 ? InterfaceC34116n.INSTANCE.m107848a("EcgSubmitEligibilityInteractor") : interfaceC34116n);
    }
}
