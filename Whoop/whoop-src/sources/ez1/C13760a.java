package ez1;

import androidx.core.app.NotificationCompat;
import bc3.AbstractC3006f0;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4351m;
import cz1.AbstractC11261b;
import cz1.C11262c;
import cz1.C11263d;
import ec3.AbstractC13091v;
import ec3.C13096w1;
import ec3.C13105z1;
import ec3.InterfaceC13058l;
import ec3.InterfaceC13062m;
import ec3.InterfaceC13072o1;
import ec3.InterfaceC13087t1;
import fz1.C14891a;
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
import t21.AbstractC33344b;
import t21.AbstractC33345c;
import t21.C33346d;

/* JADX INFO: renamed from: ez1.a */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0013\u0010\f\u001a\u00020\u000b*\u00020\nH\u0002¢\u0006\u0004\b\f\u0010\rJ'\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e*\b\u0012\u0004\u0012\u00020\u000b0\u000e2\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\n0\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u001a\u0010 \u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR \u0010'\u001a\b\u0012\u0004\u0012\u00020\"0!8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&¨\u0006("}, m65681d2 = {"Lez1/a;", "Lt21/c;", "Lcz1/d;", "interactor", "Lfz1/a;", "reducer", "Lor2/m;", "coroutineScope", "<init>", "(Lcz1/d;Lfz1/a;Lor2/m;)V", "Lt21/b;", "Lcz1/b;", "r", "(Lt21/b;)Lcz1/b;", "Lec3/l;", "Lcz1/c;", "p", "(Lec3/l;Lcz1/d;)Lec3/l;", NotificationCompat.CATEGORY_EVENT, "Ll83/a0;", "q", "(Lt21/b;)V", "x", "Lfz1/a;", "y", "Lor2/m;", "Lec3/o1;", "z", "Lec3/o1;", "eventFlow", "E", "Lec3/l;", "domainState", "Lec3/t1;", "Lt21/d;", "F", "Lec3/t1;", "o", "()Lec3/t1;", "viewState", "milestone-pill-arch-mini_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C13760a extends AbstractC33345c {

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    private final InterfaceC13058l domainState;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    private final InterfaceC13087t1 viewState;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    private final C14891a reducer;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    private final C28180m coroutineScope;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    private final InterfaceC13072o1 eventFlow;

    /* JADX INFO: renamed from: ez1.a$a */
    @InterfaceC32271e(m100429c = "com.whoop.milestonepill.presentation.MilestonePillViewModelImpl$sendViewEvent$1", m100430f = "MilestonePillViewModelImpl.kt", m100431l = {37}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f49083w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ AbstractC33344b f49085y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(AbstractC33344b abstractC33344b, InterfaceC30057d<? super a> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f49085y = abstractC33344b;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C13760a.this.new a(this.f49085y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f49083w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC13072o1 interfaceC13072o1 = C13760a.this.eventFlow;
                AbstractC33344b abstractC33344b = this.f49085y;
                this.f49083w = 1;
                if (interfaceC13072o1.emit(abstractC33344b, this) == enumC31071a) {
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

    /* JADX INFO: renamed from: ez1.a$b */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f49086w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C13760a f49087x;

        /* JADX INFO: renamed from: ez1.a$b$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f49088w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C13760a f49089x;

            /* JADX INFO: renamed from: ez1.a$b$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.milestonepill.presentation.MilestonePillViewModelImpl$special$$inlined$map$1$2", m100430f = "MilestonePillViewModelImpl.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C41576a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f49090E;

                /* JADX INFO: renamed from: F */
                Object f49091F;

                /* JADX INFO: renamed from: G */
                Object f49092G;

                /* JADX INFO: renamed from: H */
                int f49093H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f49094w;

                /* JADX INFO: renamed from: x */
                int f49095x;

                /* JADX INFO: renamed from: y */
                Object f49096y;

                public C41576a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f49094w = obj;
                    this.f49095x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m, C13760a c13760a) {
                this.f49088w = interfaceC13062m;
                this.f49089x = c13760a;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C41576a c41576a;
                if (interfaceC30057d instanceof C41576a) {
                    c41576a = (C41576a) interfaceC30057d;
                    int i13 = c41576a.f49095x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c41576a.f49095x = i13 - Integer.MIN_VALUE;
                    } else {
                        c41576a = new C41576a(interfaceC30057d);
                    }
                } else {
                    c41576a = new C41576a(interfaceC30057d);
                }
                Object obj2 = c41576a.f49094w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c41576a.f49095x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f49088w;
                    AbstractC11261b abstractC11261bM39120r = this.f49089x.m39120r((AbstractC33344b) obj);
                    c41576a.f49096y = null;
                    c41576a.f49090E = null;
                    c41576a.f49091F = null;
                    c41576a.f49092G = null;
                    c41576a.f49093H = 0;
                    c41576a.f49095x = 1;
                    if (interfaceC13062m.emit(abstractC11261bM39120r, c41576a) == enumC31071a) {
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

        public b(InterfaceC13058l interfaceC13058l, C13760a c13760a) {
            this.f49086w = interfaceC13058l;
            this.f49087x = c13760a;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f49086w.collect(new a(interfaceC13062m, this.f49087x), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: ez1.a$c */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f49098w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C13760a f49099x;

        /* JADX INFO: renamed from: ez1.a$c$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f49100w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C13760a f49101x;

            /* JADX INFO: renamed from: ez1.a$c$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.milestonepill.presentation.MilestonePillViewModelImpl$special$$inlined$map$2$2", m100430f = "MilestonePillViewModelImpl.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C41577a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f49102E;

                /* JADX INFO: renamed from: F */
                Object f49103F;

                /* JADX INFO: renamed from: G */
                Object f49104G;

                /* JADX INFO: renamed from: H */
                int f49105H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f49106w;

                /* JADX INFO: renamed from: x */
                int f49107x;

                /* JADX INFO: renamed from: y */
                Object f49108y;

                public C41577a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f49106w = obj;
                    this.f49107x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m, C13760a c13760a) {
                this.f49100w = interfaceC13062m;
                this.f49101x = c13760a;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C41577a c41577a;
                if (interfaceC30057d instanceof C41577a) {
                    c41577a = (C41577a) interfaceC30057d;
                    int i13 = c41577a.f49107x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c41577a.f49107x = i13 - Integer.MIN_VALUE;
                    } else {
                        c41577a = new C41577a(interfaceC30057d);
                    }
                } else {
                    c41577a = new C41577a(interfaceC30057d);
                }
                Object obj2 = c41577a.f49106w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c41577a.f49107x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f49100w;
                    C33346d c33346dM42977b = this.f49101x.reducer.m42977b((C11262c) obj);
                    c41577a.f49108y = null;
                    c41577a.f49102E = null;
                    c41577a.f49103F = null;
                    c41577a.f49104G = null;
                    c41577a.f49105H = 0;
                    c41577a.f49107x = 1;
                    if (interfaceC13062m.emit(c33346dM42977b, c41577a) == enumC31071a) {
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

        public c(InterfaceC13058l interfaceC13058l, C13760a c13760a) {
            this.f49098w = interfaceC13058l;
            this.f49099x = c13760a;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f49098w.collect(new a(interfaceC13062m, this.f49099x), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C13760a(C11263d interactor, C14891a reducer, C28180m coroutineScope) {
        super(coroutineScope);
        AbstractC22676k.m65750j(interactor, "interactor");
        AbstractC22676k.m65750j(reducer, "reducer");
        AbstractC22676k.m65750j(coroutineScope, "coroutineScope");
        this.reducer = reducer;
        this.coroutineScope = coroutineScope;
        C13096w1 c13096w1M36592b = AbstractC13091v.m36592b(0, 0, null, 7);
        this.eventFlow = c13096w1M36592b;
        InterfaceC13058l interfaceC13058lM39119p = m39119p(new b(c13096w1M36592b, this), interactor);
        this.domainState = interfaceC13058lM39119p;
        this.viewState = AbstractC13091v.m36586L(new c(interfaceC13058lM39119p, this), coroutineScope, C13105z1.f45288a, 1);
    }

    /* JADX INFO: renamed from: p */
    private final InterfaceC13058l m39119p(InterfaceC13058l interfaceC13058l, C11263d c11263d) {
        return c11263d.m30439f(interfaceC13058l);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r */
    public final AbstractC11261b m39120r(AbstractC33344b abstractC33344b) {
        if (abstractC33344b instanceof AbstractC33344b.b) {
            return new AbstractC11261b.b(((AbstractC33344b.b) abstractC33344b).getPath());
        }
        if (abstractC33344b instanceof AbstractC33344b.a) {
            return AbstractC11261b.a.f36135a;
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // ld1.AbstractC23864c
    /* JADX INFO: renamed from: o, reason: from getter */
    public InterfaceC13087t1 getViewState() {
        return this.viewState;
    }

    @Override // ld1.AbstractC23864c
    /* JADX INFO: renamed from: q, reason: merged with bridge method [inline-methods] */
    public void mo1216g(AbstractC33344b event) {
        AbstractC22676k.m65750j(event, "event");
        AbstractC3006f0.m8732z(this.coroutineScope, null, null, new a(event, null), 3);
    }

    public /* synthetic */ C13760a(C11263d c11263d, C14891a c14891a, C28180m c28180m, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(c11263d, c14891a, (i13 & 4) != 0 ? new C28180m(null, 1, null) : c28180m);
    }
}
