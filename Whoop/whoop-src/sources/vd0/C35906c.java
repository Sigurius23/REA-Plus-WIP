package vd0;

import com.whoop.advancedlabs.domain.AdvancedLabsApi;
import com.whoop.advancedlabs.domain.models.SchedulePrimerResponse;
import ec3.InterfaceC13058l;
import ec3.InterfaceC13062m;
import l83.C23454a0;
import od1.InterfaceC27844g;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import tr2.InterfaceC34116n;
import u02.InterfaceC34385a;

/* JADX INFO: renamed from: vd0.c */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0019\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0003H\u0082@¢\u0006\u0004\b\n\u0010\u000bJ#\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00030\f2\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00020\fH\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, m65681d2 = {"Lvd0/c;", "Lod1/g;", "Lvd0/a;", "Lvd0/b;", "Lcom/whoop/advancedlabs/domain/AdvancedLabsApi;", "api", "Ltr2/n;", "logger", "<init>", "(Lcom/whoop/advancedlabs/domain/AdvancedLabsApi;Ltr2/n;)V", "e", "(Lq83/d;)Ljava/lang/Object;", "Lec3/l;", "upstream", "interact", "(Lec3/l;)Lec3/l;", "a", "Lcom/whoop/advancedlabs/domain/AdvancedLabsApi;", "b", "Ltr2/n;", "advanced-labs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C35906c implements InterfaceC27844g<AbstractC35904a, AbstractC35905b> {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final AdvancedLabsApi api;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final InterfaceC34116n logger;

    /* JADX INFO: renamed from: vd0.c$a */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.advancedlabs.scheduleprimer.domain.SchedulePrimerInteractor", m100430f = "SchedulePrimerInteractor.kt", m100431l = {26}, m100432m = "fetchData", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a extends AbstractC32269c {

        /* JADX INFO: renamed from: w */
        /* synthetic */ Object f152843w;

        /* JADX INFO: renamed from: y */
        int f152845y;

        public a(InterfaceC30057d<? super a> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f152843w = obj;
            this.f152845y |= Integer.MIN_VALUE;
            return C35906c.this.m114030e(this);
        }
    }

    /* JADX INFO: renamed from: vd0.c$b */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.advancedlabs.scheduleprimer.domain.SchedulePrimerInteractor$fetchData$response$1", m100430f = "SchedulePrimerInteractor.kt", m100431l = {26}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0006\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u0001H\n"}, m65681d2 = {"<anonymous>", "Lcom/whoop/advancedlabs/domain/models/SchedulePrimerResponse;"}, m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b extends AbstractC32275i implements Function1 {

        /* JADX INFO: renamed from: w */
        int f152846w;

        public b(InterfaceC30057d<? super b> interfaceC30057d) {
            super(1, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(InterfaceC30057d<?> interfaceC30057d) {
            return C35906c.this.new b(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f152846w;
            if (i13 != 0) {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
                return obj;
            }
            AbstractC34132o.m107864I(obj);
            AdvancedLabsApi advancedLabsApi = C35906c.this.api;
            this.f152846w = 1;
            Object schedulePrimer = advancedLabsApi.getSchedulePrimer(this);
            return schedulePrimer == enumC31071a ? enumC31071a : schedulePrimer;
        }

        @Override // p715kotlin.jvm.functions.Function1
        public final Object invoke(InterfaceC30057d<? super SchedulePrimerResponse> interfaceC30057d) {
            return ((b) create(interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }
    }

    /* JADX INFO: renamed from: vd0.c$c */
    /* JADX INFO: loaded from: classes7.dex */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f152848w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C35906c f152849x;

        /* JADX INFO: renamed from: vd0.c$c$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f152850w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C35906c f152851x;

            /* JADX INFO: renamed from: vd0.c$c$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.advancedlabs.scheduleprimer.domain.SchedulePrimerInteractor$interact$$inlined$map$1$2", m100430f = "SchedulePrimerInteractor.kt", m100431l = {53, 50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C42531a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f152852E;

                /* JADX INFO: renamed from: F */
                Object f152853F;

                /* JADX INFO: renamed from: G */
                Object f152854G;

                /* JADX INFO: renamed from: H */
                Object f152855H;

                /* JADX INFO: renamed from: I */
                Object f152856I;

                /* JADX INFO: renamed from: J */
                Object f152857J;

                /* JADX INFO: renamed from: K */
                int f152858K;

                /* JADX INFO: renamed from: L */
                int f152859L;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f152860w;

                /* JADX INFO: renamed from: x */
                int f152861x;

                /* JADX INFO: renamed from: y */
                Object f152862y;

                public C42531a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f152860w = obj;
                    this.f152861x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m, C35906c c35906c) {
                this.f152850w = interfaceC13062m;
                this.f152851x = c35906c;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            /* JADX WARN: Code restructure failed: missing block: B:23:0x0097, code lost:
            
                if (r2.emit(r9, r0) == r1) goto L24;
             */
            @Override // ec3.InterfaceC13062m
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object emit(java.lang.Object r8, q83.InterfaceC30057d r9) {
                /*
                    r7 = this;
                    boolean r0 = r9 instanceof vd0.C35906c.c.a.C42531a
                    if (r0 == 0) goto L13
                    r0 = r9
                    vd0.c$c$a$a r0 = (vd0.C35906c.c.a.C42531a) r0
                    int r1 = r0.f152861x
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f152861x = r1
                    goto L18
                L13:
                    vd0.c$c$a$a r0 = new vd0.c$c$a$a
                    r0.<init>(r9)
                L18:
                    java.lang.Object r9 = r0.f152860w
                    r83.a r1 = r83.EnumC31071a.f128113w
                    int r2 = r0.f152861x
                    r3 = 2
                    r4 = 1
                    r5 = 0
                    if (r2 == 0) goto L55
                    if (r2 == r4) goto L3b
                    if (r2 != r3) goto L33
                    java.lang.Object r8 = r0.f152854G
                    ec3.m r8 = (ec3.InterfaceC13062m) r8
                    java.lang.Object r8 = r0.f152852E
                    vd0.c$c$a$a r8 = (vd0.C35906c.c.a.C42531a) r8
                    p505ts.AbstractC34132o.m107864I(r9)
                    goto L9a
                L33:
                    java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                    java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
                    r8.<init>(r9)
                    throw r8
                L3b:
                    int r8 = r0.f152858K
                    java.lang.Object r2 = r0.f152857J
                    vd0.a r2 = (vd0.AbstractC35904a) r2
                    java.lang.Object r2 = r0.f152856I
                    q83.d r2 = (q83.InterfaceC30057d) r2
                    java.lang.Object r2 = r0.f152855H
                    ec3.m r2 = (ec3.InterfaceC13062m) r2
                    java.lang.Object r4 = r0.f152854G
                    ec3.m r4 = (ec3.InterfaceC13062m) r4
                    java.lang.Object r4 = r0.f152852E
                    vd0.c$c$a$a r4 = (vd0.C35906c.c.a.C42531a) r4
                    p505ts.AbstractC34132o.m107864I(r9)
                    goto L81
                L55:
                    p505ts.AbstractC34132o.m107864I(r9)
                    ec3.m r2 = r7.f152850w
                    vd0.a r8 = (vd0.AbstractC35904a) r8
                    boolean r8 = r8 instanceof vd0.AbstractC35904a.a
                    if (r8 == 0) goto L9d
                    vd0.c r8 = r7.f152851x
                    r0.f152862y = r5
                    r0.f152852E = r5
                    r0.f152853F = r5
                    r0.f152854G = r5
                    r0.f152855H = r2
                    r0.f152856I = r5
                    r0.f152857J = r5
                    r9 = 0
                    r0.f152858K = r9
                    r0.f152859L = r9
                    r0.f152861x = r4
                    java.lang.Object r8 = vd0.C35906c.m114028c(r8, r0)
                    if (r8 != r1) goto L7e
                    goto L99
                L7e:
                    r6 = r9
                    r9 = r8
                    r8 = r6
                L81:
                    r0.f152862y = r5
                    r0.f152852E = r5
                    r0.f152853F = r5
                    r0.f152854G = r5
                    r0.f152855H = r5
                    r0.f152856I = r5
                    r0.f152857J = r5
                    r0.f152858K = r8
                    r0.f152861x = r3
                    java.lang.Object r8 = r2.emit(r9, r0)
                    if (r8 != r1) goto L9a
                L99:
                    return r1
                L9a:
                    l83.a0 r8 = l83.C23454a0.f92919a
                    return r8
                L9d:
                    kotlin.NoWhenBranchMatchedException r8 = new kotlin.NoWhenBranchMatchedException
                    r8.<init>()
                    throw r8
                */
                throw new UnsupportedOperationException("Method not decompiled: vd0.C35906c.c.a.emit(java.lang.Object, q83.d):java.lang.Object");
            }
        }

        public c(InterfaceC13058l interfaceC13058l, C35906c c35906c) {
            this.f152848w = interfaceC13058l;
            this.f152849x = c35906c;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f152848w.collect(new a(interfaceC13062m, this.f152849x), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    public C35906c(AdvancedLabsApi api, InterfaceC34116n logger) {
        AbstractC22676k.m65750j(api, "api");
        AbstractC22676k.m65750j(logger, "logger");
        this.api = api;
        this.logger = logger;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX INFO: renamed from: e */
    public final Object m114030e(InterfaceC30057d<? super AbstractC35905b> interfaceC30057d) {
        a aVar;
        if (interfaceC30057d instanceof a) {
            aVar = (a) interfaceC30057d;
            int i13 = aVar.f152845y;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                aVar.f152845y = i13 - Integer.MIN_VALUE;
            } else {
                aVar = new a(interfaceC30057d);
            }
        } else {
            aVar = new a(interfaceC30057d);
        }
        a aVar2 = aVar;
        Object objM108729b = aVar2.f152843w;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = aVar2.f152845y;
        if (i14 == 0) {
            AbstractC34132o.m107864I(objM108729b);
            InterfaceC34385a.Companion companion = InterfaceC34385a.INSTANCE;
            InterfaceC34116n interfaceC34116n = this.logger;
            b bVar = new b(null);
            aVar2.f152845y = 1;
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
        if (interfaceC34385a instanceof InterfaceC34385a.c) {
            return new AbstractC35905b.b((SchedulePrimerResponse) ((InterfaceC34385a.c) interfaceC34385a).m108735a());
        }
        if (interfaceC34385a instanceof InterfaceC34385a.b) {
            return AbstractC35905b.a.f152839a;
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // od1.InterfaceC27844g
    public InterfaceC13058l interact(InterfaceC13058l upstream) {
        AbstractC22676k.m65750j(upstream, "upstream");
        return new c(upstream, this);
    }

    public /* synthetic */ C35906c(AdvancedLabsApi advancedLabsApi, InterfaceC34116n interfaceC34116n, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(advancedLabsApi, (i13 & 2) != 0 ? InterfaceC34116n.INSTANCE.m107848a("SchedulePrimerInteractor") : interfaceC34116n);
    }
}
