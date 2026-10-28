package f60;

import androidx.core.app.NotificationCompat;
import androidx.lifecycle.AbstractC1637w1;
import bc3.AbstractC3006f0;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4351m;
import d60.AbstractC11728b;
import d60.C11729c;
import d60.C11730d;
import ec3.AbstractC13091v;
import ec3.C13021b2;
import ec3.C13078q1;
import ec3.C13096w1;
import ec3.C13105z1;
import ec3.InterfaceC13058l;
import ec3.InterfaceC13062m;
import ec3.InterfaceC13072o1;
import g60.C15527a;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import l83.C23454a0;
import or2.C28180m;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;

/* JADX INFO: renamed from: f60.b */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\n*\b\u0012\u0004\u0012\u00020\u000b0\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0013\u0010\u0010\u001a\u00020\u000b*\u00020\u000fH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u000f¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u001a\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u000f0\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u001a\u0010\"\u001a\b\u0012\u0004\u0012\u00020\f0\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u001d\u0010'\u001a\b\u0012\u0004\u0012\u00020#0\n8\u0006¢\u0006\f\n\u0004\b$\u0010!\u001a\u0004\b%\u0010&¨\u0006("}, m65681d2 = {"Lf60/b;", "Landroidx/lifecycle/w1;", "Ld60/d;", "interactor", "Lg60/a;", "reducer", "Lbc3/c0;", "coroutineScope", "<init>", "(Ld60/d;Lg60/a;Lbc3/c0;)V", "Lec3/l;", "Ld60/b;", "Ld60/c;", "interact", "(Lec3/l;)Lec3/l;", "Lf60/a$k;", "o", "(Lf60/a$k;)Ld60/b;", NotificationCompat.CATEGORY_EVENT, "Ll83/a0;", "n", "(Lf60/a$k;)V", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "Ld60/d;", "x", "Lg60/a;", "y", "Lbc3/c0;", "Lec3/o1;", "z", "Lec3/o1;", "eventFlow", "E", "Lec3/l;", "domainState", "Lf60/c;", "F", "getViewState", "()Lec3/l;", "viewState", "access_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C14137b extends AbstractC1637w1 {

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    private final InterfaceC13058l domainState;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    private final InterfaceC13058l viewState;

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    private final C11730d interactor;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    private final C15527a reducer;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    private final InterfaceC2994c0 coroutineScope;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    private final InterfaceC13072o1 eventFlow;

    /* JADX INFO: renamed from: f60.b$a */
    /* JADX INFO: loaded from: classes6.dex */
    @InterfaceC32271e(m100429c = "com.whoop.access.reconfirmlabs.presentation.ReconfirmLabsViewModel$sendViewEvent$1", m100430f = "ReconfirmLabsViewModel.kt", m100431l = {37}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f50854w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC14136a.k f50856y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(InterfaceC14136a.k kVar, InterfaceC30057d<? super a> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f50856y = kVar;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C14137b.this.new a(this.f50856y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f50854w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC13072o1 interfaceC13072o1 = C14137b.this.eventFlow;
                InterfaceC14136a.k kVar = this.f50856y;
                this.f50854w = 1;
                if (interfaceC13072o1.emit(kVar, this) == enumC31071a) {
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

    /* JADX INFO: renamed from: f60.b$b */
    /* JADX INFO: loaded from: classes6.dex */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f50857w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C14137b f50858x;

        /* JADX INFO: renamed from: f60.b$b$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f50859w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C14137b f50860x;

            /* JADX INFO: renamed from: f60.b$b$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.access.reconfirmlabs.presentation.ReconfirmLabsViewModel$special$$inlined$map$1$2", m100430f = "ReconfirmLabsViewModel.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C41579a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f50861E;

                /* JADX INFO: renamed from: F */
                Object f50862F;

                /* JADX INFO: renamed from: G */
                Object f50863G;

                /* JADX INFO: renamed from: H */
                int f50864H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f50865w;

                /* JADX INFO: renamed from: x */
                int f50866x;

                /* JADX INFO: renamed from: y */
                Object f50867y;

                public C41579a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f50865w = obj;
                    this.f50866x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m, C14137b c14137b) {
                this.f50859w = interfaceC13062m;
                this.f50860x = c14137b;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C41579a c41579a;
                if (interfaceC30057d instanceof C41579a) {
                    c41579a = (C41579a) interfaceC30057d;
                    int i13 = c41579a.f50866x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c41579a.f50866x = i13 - Integer.MIN_VALUE;
                    } else {
                        c41579a = new C41579a(interfaceC30057d);
                    }
                } else {
                    c41579a = new C41579a(interfaceC30057d);
                }
                Object obj2 = c41579a.f50865w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c41579a.f50866x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f50859w;
                    AbstractC11728b abstractC11728bM40242o = this.f50860x.m40242o((InterfaceC14136a.k) obj);
                    c41579a.f50867y = null;
                    c41579a.f50861E = null;
                    c41579a.f50862F = null;
                    c41579a.f50863G = null;
                    c41579a.f50864H = 0;
                    c41579a.f50866x = 1;
                    if (interfaceC13062m.emit(abstractC11728bM40242o, c41579a) == enumC31071a) {
                        return enumC31071a;
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

        public b(InterfaceC13058l interfaceC13058l, C14137b c14137b) {
            this.f50857w = interfaceC13058l;
            this.f50858x = c14137b;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f50857w.collect(new a(interfaceC13062m, this.f50858x), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: f60.b$c */
    /* JADX INFO: loaded from: classes6.dex */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f50869w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C14137b f50870x;

        /* JADX INFO: renamed from: f60.b$c$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f50871w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C14137b f50872x;

            /* JADX INFO: renamed from: f60.b$c$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.access.reconfirmlabs.presentation.ReconfirmLabsViewModel$special$$inlined$map$2$2", m100430f = "ReconfirmLabsViewModel.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C41580a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f50873E;

                /* JADX INFO: renamed from: F */
                Object f50874F;

                /* JADX INFO: renamed from: G */
                Object f50875G;

                /* JADX INFO: renamed from: H */
                int f50876H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f50877w;

                /* JADX INFO: renamed from: x */
                int f50878x;

                /* JADX INFO: renamed from: y */
                Object f50879y;

                public C41580a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f50877w = obj;
                    this.f50878x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m, C14137b c14137b) {
                this.f50871w = interfaceC13062m;
                this.f50872x = c14137b;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C41580a c41580a;
                if (interfaceC30057d instanceof C41580a) {
                    c41580a = (C41580a) interfaceC30057d;
                    int i13 = c41580a.f50878x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c41580a.f50878x = i13 - Integer.MIN_VALUE;
                    } else {
                        c41580a = new C41580a(interfaceC30057d);
                    }
                } else {
                    c41580a = new C41580a(interfaceC30057d);
                }
                Object obj2 = c41580a.f50877w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c41580a.f50878x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f50871w;
                    C14138c c14138cM43717a = this.f50872x.reducer.m43717a((C11729c) obj);
                    c41580a.f50879y = null;
                    c41580a.f50873E = null;
                    c41580a.f50874F = null;
                    c41580a.f50875G = null;
                    c41580a.f50876H = 0;
                    c41580a.f50878x = 1;
                    if (interfaceC13062m.emit(c14138cM43717a, c41580a) == enumC31071a) {
                        return enumC31071a;
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

        public c(InterfaceC13058l interfaceC13058l, C14137b c14137b) {
            this.f50869w = interfaceC13058l;
            this.f50870x = c14137b;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f50869w.collect(new a(interfaceC13062m, this.f50870x), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C14137b(C11730d interactor, C15527a reducer, InterfaceC2994c0 coroutineScope) {
        super(coroutineScope);
        AbstractC22676k.m65750j(interactor, "interactor");
        AbstractC22676k.m65750j(reducer, "reducer");
        AbstractC22676k.m65750j(coroutineScope, "coroutineScope");
        this.interactor = interactor;
        this.reducer = reducer;
        this.coroutineScope = coroutineScope;
        C13096w1 c13096w1M36592b = AbstractC13091v.m36592b(0, 0, null, 7);
        this.eventFlow = c13096w1M36592b;
        InterfaceC13058l interfaceC13058lInteract = interact(new b(c13096w1M36592b, this));
        C13021b2 c13021b2 = C13105z1.f45288a;
        C13078q1 c13078q1M36586L = AbstractC13091v.m36586L(interfaceC13058lInteract, coroutineScope, c13021b2, 1);
        this.domainState = c13078q1M36586L;
        this.viewState = AbstractC13091v.m36586L(new c(c13078q1M36586L, this), coroutineScope, c13021b2, 1);
    }

    private final InterfaceC13058l interact(InterfaceC13058l interfaceC13058l) {
        return this.interactor.interact(interfaceC13058l);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o */
    public final AbstractC11728b m40242o(InterfaceC14136a.k kVar) {
        if (kVar instanceof InterfaceC14136a.g) {
            return new AbstractC11728b.e(((InterfaceC14136a.g) kVar).getNextScreen());
        }
        if (kVar instanceof InterfaceC14136a.b) {
            return new AbstractC11728b.c(((InterfaceC14136a.b) kVar).getResult());
        }
        if (kVar instanceof InterfaceC14136a.d) {
            return new AbstractC11728b.d(((InterfaceC14136a.d) kVar).m40236a());
        }
        if (kVar instanceof InterfaceC14136a.j) {
            return AbstractC11728b.f.f37897a;
        }
        if (kVar instanceof InterfaceC14136a.a) {
            return AbstractC11728b.b.f37893a;
        }
        throw new NoWhenBranchMatchedException();
    }

    public final InterfaceC13058l getViewState() {
        return this.viewState;
    }

    /* JADX INFO: renamed from: n */
    public final void m40243n(InterfaceC14136a.k event) {
        AbstractC22676k.m65750j(event, "event");
        AbstractC3006f0.m8732z(this.coroutineScope, null, null, new a(event, null), 3);
    }

    public /* synthetic */ C14137b(C11730d c11730d, C15527a c15527a, InterfaceC2994c0 interfaceC2994c0, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(c11730d, c15527a, (i13 & 4) != 0 ? new C28180m(null, 1, null) : interfaceC2994c0);
    }
}
