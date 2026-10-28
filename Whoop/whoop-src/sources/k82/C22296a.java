package k82;

import androidx.core.app.NotificationCompat;
import bc3.AbstractC3006f0;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4351m;
import ec3.AbstractC13091v;
import ec3.C13096w1;
import ec3.C13105z1;
import ec3.InterfaceC13058l;
import ec3.InterfaceC13062m;
import ec3.InterfaceC13072o1;
import ec3.InterfaceC13087t1;
import i82.AbstractC18222f;
import i82.C18223g;
import i82.C18224h;
import l82.C23451a;
import l83.C23454a0;
import n31.AbstractC26218c;
import n31.AbstractC26219d;
import n31.C26220e;
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

/* JADX INFO: renamed from: k82.a */
/* JADX INFO: loaded from: classes10.dex */
@Metadata(m65680d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0013\u0010\f\u001a\u00020\u000b*\u00020\nH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\n0\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u001a\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR \u0010%\u001a\b\u0012\u0004\u0012\u00020 0\u001f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$¨\u0006&"}, m65681d2 = {"Lk82/a;", "Ln31/d;", "Li82/h;", "interactor", "Ll82/a;", "reducer", "Lor2/m;", "coroutineScope", "<init>", "(Li82/h;Ll82/a;Lor2/m;)V", "Ln31/c;", "Li82/f;", "q", "(Ln31/c;)Li82/f;", NotificationCompat.CATEGORY_EVENT, "Ll83/a0;", "p", "(Ln31/c;)V", "x", "Ll82/a;", "y", "Lor2/m;", "Lec3/o1;", "z", "Lec3/o1;", "eventFlow", "Lec3/l;", "Li82/g;", "E", "Lec3/l;", "domainState", "Lec3/t1;", "Ln31/e;", "F", "Lec3/t1;", "o", "()Lec3/t1;", "viewState", "search-arch-mini_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C22296a extends AbstractC26219d {

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    private final InterfaceC13058l domainState;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    private final InterfaceC13087t1 viewState;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    private final C23451a reducer;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    private final C28180m coroutineScope;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    private final InterfaceC13072o1 eventFlow;

    /* JADX INFO: renamed from: k82.a$a */
    @InterfaceC32271e(m100429c = "com.whoop.searcharchmini.presentation.SearchArchMiniViewModelImpl$sendViewEvent$1", m100430f = "SearchArchMiniViewModelImpl.kt", m100431l = {38}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f86986w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ AbstractC26218c f86988y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(AbstractC26218c abstractC26218c, InterfaceC30057d<? super a> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f86988y = abstractC26218c;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C22296a.this.new a(this.f86988y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f86986w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC13072o1 interfaceC13072o1 = C22296a.this.eventFlow;
                AbstractC26218c abstractC26218c = this.f86988y;
                this.f86986w = 1;
                if (interfaceC13072o1.emit(abstractC26218c, this) == enumC31071a) {
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

    /* JADX INFO: renamed from: k82.a$b */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f86989w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C22296a f86990x;

        /* JADX INFO: renamed from: k82.a$b$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f86991w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C22296a f86992x;

            /* JADX INFO: renamed from: k82.a$b$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.searcharchmini.presentation.SearchArchMiniViewModelImpl$special$$inlined$map$1$2", m100430f = "SearchArchMiniViewModelImpl.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C41878a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f86993E;

                /* JADX INFO: renamed from: F */
                Object f86994F;

                /* JADX INFO: renamed from: G */
                Object f86995G;

                /* JADX INFO: renamed from: H */
                int f86996H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f86997w;

                /* JADX INFO: renamed from: x */
                int f86998x;

                /* JADX INFO: renamed from: y */
                Object f86999y;

                public C41878a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f86997w = obj;
                    this.f86998x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m, C22296a c22296a) {
                this.f86991w = interfaceC13062m;
                this.f86992x = c22296a;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C41878a c41878a;
                if (interfaceC30057d instanceof C41878a) {
                    c41878a = (C41878a) interfaceC30057d;
                    int i13 = c41878a.f86998x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c41878a.f86998x = i13 - Integer.MIN_VALUE;
                    } else {
                        c41878a = new C41878a(interfaceC30057d);
                    }
                } else {
                    c41878a = new C41878a(interfaceC30057d);
                }
                Object obj2 = c41878a.f86997w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c41878a.f86998x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f86991w;
                    AbstractC18222f abstractC18222fM64071q = this.f86992x.m64071q((AbstractC26218c) obj);
                    c41878a.f86999y = null;
                    c41878a.f86993E = null;
                    c41878a.f86994F = null;
                    c41878a.f86995G = null;
                    c41878a.f86996H = 0;
                    c41878a.f86998x = 1;
                    if (interfaceC13062m.emit(abstractC18222fM64071q, c41878a) == enumC31071a) {
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

        public b(InterfaceC13058l interfaceC13058l, C22296a c22296a) {
            this.f86989w = interfaceC13058l;
            this.f86990x = c22296a;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f86989w.collect(new a(interfaceC13062m, this.f86990x), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: k82.a$c */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f87001w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C22296a f87002x;

        /* JADX INFO: renamed from: k82.a$c$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f87003w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C22296a f87004x;

            /* JADX INFO: renamed from: k82.a$c$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.searcharchmini.presentation.SearchArchMiniViewModelImpl$special$$inlined$map$2$2", m100430f = "SearchArchMiniViewModelImpl.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C41879a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f87005E;

                /* JADX INFO: renamed from: F */
                Object f87006F;

                /* JADX INFO: renamed from: G */
                Object f87007G;

                /* JADX INFO: renamed from: H */
                int f87008H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f87009w;

                /* JADX INFO: renamed from: x */
                int f87010x;

                /* JADX INFO: renamed from: y */
                Object f87011y;

                public C41879a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f87009w = obj;
                    this.f87010x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m, C22296a c22296a) {
                this.f87003w = interfaceC13062m;
                this.f87004x = c22296a;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C41879a c41879a;
                if (interfaceC30057d instanceof C41879a) {
                    c41879a = (C41879a) interfaceC30057d;
                    int i13 = c41879a.f87010x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c41879a.f87010x = i13 - Integer.MIN_VALUE;
                    } else {
                        c41879a = new C41879a(interfaceC30057d);
                    }
                } else {
                    c41879a = new C41879a(interfaceC30057d);
                }
                Object obj2 = c41879a.f87009w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c41879a.f87010x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f87003w;
                    C26220e c26220eM68031b = this.f87004x.reducer.m68031b((C18223g) obj);
                    c41879a.f87011y = null;
                    c41879a.f87005E = null;
                    c41879a.f87006F = null;
                    c41879a.f87007G = null;
                    c41879a.f87008H = 0;
                    c41879a.f87010x = 1;
                    if (interfaceC13062m.emit(c26220eM68031b, c41879a) == enumC31071a) {
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

        public c(InterfaceC13058l interfaceC13058l, C22296a c22296a) {
            this.f87001w = interfaceC13058l;
            this.f87002x = c22296a;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f87001w.collect(new a(interfaceC13062m, this.f87002x), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C22296a(C18224h interactor, C23451a reducer, C28180m coroutineScope) {
        super(coroutineScope);
        AbstractC22676k.m65750j(interactor, "interactor");
        AbstractC22676k.m65750j(reducer, "reducer");
        AbstractC22676k.m65750j(coroutineScope, "coroutineScope");
        this.reducer = reducer;
        this.coroutineScope = coroutineScope;
        C13096w1 c13096w1M36592b = AbstractC13091v.m36592b(0, 0, null, 7);
        this.eventFlow = c13096w1M36592b;
        InterfaceC13058l interfaceC13058lInteract = interactor.interact(new b(c13096w1M36592b, this));
        this.domainState = interfaceC13058lInteract;
        this.viewState = AbstractC13091v.m36586L(new c(interfaceC13058lInteract, this), coroutineScope, C13105z1.f45288a, 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q */
    public final AbstractC18222f m64071q(AbstractC26218c abstractC26218c) {
        if (abstractC26218c instanceof AbstractC26218c.d) {
            return new AbstractC18222f.c(((AbstractC26218c.d) abstractC26218c).getPath());
        }
        if (abstractC26218c instanceof AbstractC26218c.e) {
            return new AbstractC18222f.e(((AbstractC26218c.e) abstractC26218c).getQuery());
        }
        if (abstractC26218c instanceof AbstractC26218c.c) {
            return new AbstractC18222f.d(((AbstractC26218c.c) abstractC26218c).getAction());
        }
        if (abstractC26218c instanceof AbstractC26218c.b) {
            return AbstractC18222f.b.f70819a;
        }
        if (abstractC26218c instanceof AbstractC26218c.a) {
            return AbstractC18222f.a.f70818a;
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // ld1.AbstractC23864c
    /* JADX INFO: renamed from: o, reason: from getter */
    public InterfaceC13087t1 getViewState() {
        return this.viewState;
    }

    @Override // ld1.AbstractC23864c
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public void mo1216g(AbstractC26218c event) {
        AbstractC22676k.m65750j(event, "event");
        AbstractC3006f0.m8732z(this.coroutineScope, null, null, new a(event, null), 3);
    }

    public /* synthetic */ C22296a(C18224h c18224h, C23451a c23451a, C28180m c28180m, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(c18224h, c23451a, (i13 & 4) != 0 ? new C28180m(null, 1, null) : c28180m);
    }
}
