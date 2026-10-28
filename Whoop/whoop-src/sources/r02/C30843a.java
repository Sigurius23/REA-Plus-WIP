package r02;

import androidx.core.app.NotificationCompat;
import bc3.AbstractC3006f0;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4351m;
import ec3.AbstractC13091v;
import ec3.C13052j1;
import ec3.C13096w1;
import ec3.C13105z1;
import ec3.InterfaceC13037f2;
import ec3.InterfaceC13058l;
import ec3.InterfaceC13062m;
import ec3.InterfaceC13072o1;
import hb1.AbstractC17082e;
import hb1.AbstractC17083f;
import hb1.AbstractC17084g;
import l83.C23454a0;
import or2.C28180m;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q02.AbstractC29747a;
import q02.AbstractC29748b;
import q02.C29750d;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s02.C32051a;
import s83.AbstractC32269c;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import t02.C33266a;

/* JADX INFO: renamed from: r02.a */
/* JADX INFO: loaded from: classes9.dex */
@Metadata(m65680d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0013\u0010\u000e\u001a\u00020\r*\u00020\fH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0017\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\f0\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR \u0010$\u001a\b\u0012\u0004\u0012\u00020\u001f0\u001e8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#¨\u0006%"}, m65681d2 = {"Lr02/a;", "Lhb1/f;", "Lq02/d;", "interactor", "Lt02/a;", "reducer", "Ls02/a;", "renderDurationEmitter", "Lor2/m;", "coroutineScope", "<init>", "(Lq02/d;Lt02/a;Ls02/a;Lor2/m;)V", "Lhb1/e;", "Lq02/a;", "q", "(Lhb1/e;)Lq02/a;", NotificationCompat.CATEGORY_EVENT, "Ll83/a0;", "p", "(Lhb1/e;)V", "x", "Lt02/a;", "y", "Ls02/a;", "z", "Lor2/m;", "Lec3/o1;", "E", "Lec3/o1;", "eventFlow", "Lec3/f2;", "Lhb1/g;", "F", "Lec3/f2;", "getViewState", "()Lec3/f2;", "viewState", "nested-bff-arch-mini_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C30843a extends AbstractC17083f {

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    private final InterfaceC13072o1 eventFlow;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    private final InterfaceC13037f2 viewState;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    private final C33266a reducer;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    private final C32051a renderDurationEmitter;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    private final C28180m coroutineScope;

    /* JADX INFO: renamed from: r02.a$a */
    @InterfaceC32271e(m100429c = "com.whoop.nestedbff.presentation.NestedBFFViewModelImpl$sendViewEvent$1", m100430f = "NestedBFFViewModelImpl.kt", m100431l = {42}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f127157w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ AbstractC17082e f127159y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(AbstractC17082e abstractC17082e, InterfaceC30057d<? super a> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f127159y = abstractC17082e;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C30843a.this.new a(this.f127159y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f127157w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC13072o1 interfaceC13072o1 = C30843a.this.eventFlow;
                AbstractC17082e abstractC17082e = this.f127159y;
                this.f127157w = 1;
                if (interfaceC13072o1.emit(abstractC17082e, this) == enumC31071a) {
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

    /* JADX INFO: renamed from: r02.a$b */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f127160w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C30843a f127161x;

        /* JADX INFO: renamed from: r02.a$b$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f127162w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C30843a f127163x;

            /* JADX INFO: renamed from: r02.a$b$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.nestedbff.presentation.NestedBFFViewModelImpl$special$$inlined$map$1$2", m100430f = "NestedBFFViewModelImpl.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C42252a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f127164E;

                /* JADX INFO: renamed from: F */
                Object f127165F;

                /* JADX INFO: renamed from: G */
                Object f127166G;

                /* JADX INFO: renamed from: H */
                int f127167H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f127168w;

                /* JADX INFO: renamed from: x */
                int f127169x;

                /* JADX INFO: renamed from: y */
                Object f127170y;

                public C42252a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f127168w = obj;
                    this.f127169x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m, C30843a c30843a) {
                this.f127162w = interfaceC13062m;
                this.f127163x = c30843a;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C42252a c42252a;
                if (interfaceC30057d instanceof C42252a) {
                    c42252a = (C42252a) interfaceC30057d;
                    int i13 = c42252a.f127169x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c42252a.f127169x = i13 - Integer.MIN_VALUE;
                    } else {
                        c42252a = new C42252a(interfaceC30057d);
                    }
                } else {
                    c42252a = new C42252a(interfaceC30057d);
                }
                Object obj2 = c42252a.f127168w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c42252a.f127169x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f127162w;
                    AbstractC29747a abstractC29747aM94861q = this.f127163x.m94861q((AbstractC17082e) obj);
                    c42252a.f127170y = null;
                    c42252a.f127164E = null;
                    c42252a.f127165F = null;
                    c42252a.f127166G = null;
                    c42252a.f127167H = 0;
                    c42252a.f127169x = 1;
                    if (interfaceC13062m.emit(abstractC29747aM94861q, c42252a) == enumC31071a) {
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

        public b(InterfaceC13058l interfaceC13058l, C30843a c30843a) {
            this.f127160w = interfaceC13058l;
            this.f127161x = c30843a;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f127160w.collect(new a(interfaceC13062m, this.f127161x), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: r02.a$c */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f127172w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C30843a f127173x;

        /* JADX INFO: renamed from: r02.a$c$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f127174w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C30843a f127175x;

            /* JADX INFO: renamed from: r02.a$c$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.nestedbff.presentation.NestedBFFViewModelImpl$special$$inlined$map$2$2", m100430f = "NestedBFFViewModelImpl.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C42253a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f127176E;

                /* JADX INFO: renamed from: F */
                Object f127177F;

                /* JADX INFO: renamed from: G */
                Object f127178G;

                /* JADX INFO: renamed from: H */
                int f127179H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f127180w;

                /* JADX INFO: renamed from: x */
                int f127181x;

                /* JADX INFO: renamed from: y */
                Object f127182y;

                public C42253a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f127180w = obj;
                    this.f127181x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m, C30843a c30843a) {
                this.f127174w = interfaceC13062m;
                this.f127175x = c30843a;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C42253a c42253a;
                if (interfaceC30057d instanceof C42253a) {
                    c42253a = (C42253a) interfaceC30057d;
                    int i13 = c42253a.f127181x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c42253a.f127181x = i13 - Integer.MIN_VALUE;
                    } else {
                        c42253a = new C42253a(interfaceC30057d);
                    }
                } else {
                    c42253a = new C42253a(interfaceC30057d);
                }
                Object obj2 = c42253a.f127180w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c42253a.f127181x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f127174w;
                    AbstractC17084g abstractC17084gM105536a = this.f127175x.reducer.m105536a((AbstractC29748b) obj);
                    c42253a.f127182y = null;
                    c42253a.f127176E = null;
                    c42253a.f127177F = null;
                    c42253a.f127178G = null;
                    c42253a.f127179H = 0;
                    c42253a.f127181x = 1;
                    if (interfaceC13062m.emit(abstractC17084gM105536a, c42253a) == enumC31071a) {
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

        public c(InterfaceC13058l interfaceC13058l, C30843a c30843a) {
            this.f127172w = interfaceC13058l;
            this.f127173x = c30843a;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f127172w.collect(new a(interfaceC13062m, this.f127173x), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: r02.a$d */
    @InterfaceC32271e(m100429c = "com.whoop.nestedbff.presentation.NestedBFFViewModelImpl$viewState$3", m100430f = "NestedBFFViewModelImpl.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lhb1/g;", "it", "Ll83/a0;", "<anonymous>", "(Lhb1/g;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class d extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f127184w;

        /* JADX INFO: renamed from: x */
        /* synthetic */ Object f127185x;

        public d(InterfaceC30057d<? super d> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            d dVar = C30843a.this.new d(interfaceC30057d);
            dVar.f127185x = obj;
            return dVar;
        }

        @Override // c93.InterfaceC4351m
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public final Object invoke(AbstractC17084g abstractC17084g, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((d) create(abstractC17084g, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            AbstractC17084g abstractC17084g = (AbstractC17084g) this.f127185x;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f127184w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            C30843a.this.renderDurationEmitter.m99622b(abstractC17084g);
            return C23454a0.f92919a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30843a(C29750d interactor, C33266a reducer, C32051a renderDurationEmitter, C28180m coroutineScope) {
        super(coroutineScope);
        AbstractC22676k.m65750j(interactor, "interactor");
        AbstractC22676k.m65750j(reducer, "reducer");
        AbstractC22676k.m65750j(renderDurationEmitter, "renderDurationEmitter");
        AbstractC22676k.m65750j(coroutineScope, "coroutineScope");
        this.reducer = reducer;
        this.renderDurationEmitter = renderDurationEmitter;
        this.coroutineScope = coroutineScope;
        C13096w1 c13096w1M36592b = AbstractC13091v.m36592b(0, 0, null, 7);
        this.eventFlow = c13096w1M36592b;
        this.viewState = AbstractC13091v.m36587M(new C13052j1(new c(interactor.interact(new b(c13096w1M36592b, this)), this), new d(null), 0), coroutineScope, C13105z1.f45288a, AbstractC17084g.c.f65647a);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q */
    public final AbstractC29747a m94861q(AbstractC17082e abstractC17082e) {
        if (abstractC17082e instanceof AbstractC17082e.a) {
            AbstractC17082e.a aVar = (AbstractC17082e.a) abstractC17082e;
            return new AbstractC29747a.a(aVar.getItemState().getPath(), aVar.getItemState().getMethod(), aVar.getItemState().m48255b());
        }
        if (!(abstractC17082e instanceof AbstractC17082e.b)) {
            throw new NoWhenBranchMatchedException();
        }
        AbstractC17082e.b bVar = (AbstractC17082e.b) abstractC17082e;
        return new AbstractC29747a.b(bVar.getItemState().getPath(), bVar.getItemState().getMethod(), bVar.getItemState().m48255b());
    }

    @Override // ld1.AbstractC23864c
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public void mo1216g(AbstractC17082e event) {
        AbstractC22676k.m65750j(event, "event");
        if (event instanceof AbstractC17082e.a) {
            this.renderDurationEmitter.m99621a(((AbstractC17082e.a) event).getItemState().getPath());
        }
        AbstractC3006f0.m8732z(this.coroutineScope, null, null, new a(event, null), 3);
    }

    @Override // ld1.AbstractC23864c
    public InterfaceC13037f2 getViewState() {
        return this.viewState;
    }

    public /* synthetic */ C30843a(C29750d c29750d, C33266a c33266a, C32051a c32051a, C28180m c28180m, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(c29750d, c33266a, c32051a, (i13 & 8) != 0 ? new C28180m(null, 1, null) : c28180m);
    }
}
