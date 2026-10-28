package dr0;

import androidx.core.app.NotificationCompat;
import bc3.AbstractC3006f0;
import bc3.InterfaceC2994c0;
import br0.AbstractC3554a;
import br0.C3555b;
import br0.C3556c;
import c93.InterfaceC4351m;
import ec3.AbstractC13091v;
import ec3.C13096w1;
import ec3.C13105z1;
import ec3.InterfaceC13037f2;
import ec3.InterfaceC13058l;
import ec3.InterfaceC13062m;
import ec3.InterfaceC13072o1;
import er0.C13577a;
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
import v01.AbstractC35503e;
import v01.AbstractC35504f;
import v01.C35505g;

/* JADX INFO: renamed from: dr0.a */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0013\u0010\f\u001a\u00020\u000b*\u00020\nH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\n0\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u001a\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR \u0010%\u001a\b\u0012\u0004\u0012\u00020 0\u001f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$¨\u0006&"}, m65681d2 = {"Ldr0/a;", "Lv01/f;", "Lbr0/c;", "interactor", "Ler0/a;", "reducer", "Lor2/m;", "coroutineScope", "<init>", "(Lbr0/c;Ler0/a;Lor2/m;)V", "Lv01/e;", "Lbr0/a;", "p", "(Lv01/e;)Lbr0/a;", NotificationCompat.CATEGORY_EVENT, "Ll83/a0;", "o", "(Lv01/e;)V", "x", "Ler0/a;", "y", "Lor2/m;", "Lec3/o1;", "z", "Lec3/o1;", "eventFlow", "Lec3/l;", "Lbr0/b;", "E", "Lec3/l;", "domainState", "Lec3/f2;", "Lv01/g;", "F", "Lec3/f2;", "getViewState", "()Lec3/f2;", "viewState", "community-follower-container-arch-mini_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C12294a extends AbstractC35504f {

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    private final InterfaceC13058l domainState;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    private final InterfaceC13037f2 viewState;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    private final C13577a reducer;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    private final C28180m coroutineScope;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    private final InterfaceC13072o1 eventFlow;

    /* JADX INFO: renamed from: dr0.a$a */
    @InterfaceC32271e(m100429c = "com.whoop.communityfollowercontainer.presentation.CommunityFollowerContainerViewModelImpl$sendViewEvent$1", m100430f = "CommunityFollowerContainerViewModelImpl.kt", m100431l = {38}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f41172w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ AbstractC35503e f41174y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(AbstractC35503e abstractC35503e, InterfaceC30057d<? super a> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f41174y = abstractC35503e;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C12294a.this.new a(this.f41174y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f41172w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC13072o1 interfaceC13072o1 = C12294a.this.eventFlow;
                AbstractC35503e abstractC35503e = this.f41174y;
                this.f41172w = 1;
                if (interfaceC13072o1.emit(abstractC35503e, this) == enumC31071a) {
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

    /* JADX INFO: renamed from: dr0.a$b */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f41175w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C12294a f41176x;

        /* JADX INFO: renamed from: dr0.a$b$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f41177w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C12294a f41178x;

            /* JADX INFO: renamed from: dr0.a$b$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.communityfollowercontainer.presentation.CommunityFollowerContainerViewModelImpl$special$$inlined$map$1$2", m100430f = "CommunityFollowerContainerViewModelImpl.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C41479a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f41179E;

                /* JADX INFO: renamed from: F */
                Object f41180F;

                /* JADX INFO: renamed from: G */
                Object f41181G;

                /* JADX INFO: renamed from: H */
                int f41182H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f41183w;

                /* JADX INFO: renamed from: x */
                int f41184x;

                /* JADX INFO: renamed from: y */
                Object f41185y;

                public C41479a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f41183w = obj;
                    this.f41184x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m, C12294a c12294a) {
                this.f41177w = interfaceC13062m;
                this.f41178x = c12294a;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C41479a c41479a;
                if (interfaceC30057d instanceof C41479a) {
                    c41479a = (C41479a) interfaceC30057d;
                    int i13 = c41479a.f41184x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c41479a.f41184x = i13 - Integer.MIN_VALUE;
                    } else {
                        c41479a = new C41479a(interfaceC30057d);
                    }
                } else {
                    c41479a = new C41479a(interfaceC30057d);
                }
                Object obj2 = c41479a.f41183w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c41479a.f41184x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f41177w;
                    AbstractC3554a abstractC3554aM34226p = this.f41178x.m34226p((AbstractC35503e) obj);
                    c41479a.f41185y = null;
                    c41479a.f41179E = null;
                    c41479a.f41180F = null;
                    c41479a.f41181G = null;
                    c41479a.f41182H = 0;
                    c41479a.f41184x = 1;
                    if (interfaceC13062m.emit(abstractC3554aM34226p, c41479a) == enumC31071a) {
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

        public b(InterfaceC13058l interfaceC13058l, C12294a c12294a) {
            this.f41175w = interfaceC13058l;
            this.f41176x = c12294a;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f41175w.collect(new a(interfaceC13062m, this.f41176x), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: dr0.a$c */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f41187w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C12294a f41188x;

        /* JADX INFO: renamed from: dr0.a$c$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f41189w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C12294a f41190x;

            /* JADX INFO: renamed from: dr0.a$c$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.communityfollowercontainer.presentation.CommunityFollowerContainerViewModelImpl$special$$inlined$map$2$2", m100430f = "CommunityFollowerContainerViewModelImpl.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C41480a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f41191E;

                /* JADX INFO: renamed from: F */
                Object f41192F;

                /* JADX INFO: renamed from: G */
                Object f41193G;

                /* JADX INFO: renamed from: H */
                int f41194H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f41195w;

                /* JADX INFO: renamed from: x */
                int f41196x;

                /* JADX INFO: renamed from: y */
                Object f41197y;

                public C41480a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f41195w = obj;
                    this.f41196x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m, C12294a c12294a) {
                this.f41189w = interfaceC13062m;
                this.f41190x = c12294a;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C41480a c41480a;
                if (interfaceC30057d instanceof C41480a) {
                    c41480a = (C41480a) interfaceC30057d;
                    int i13 = c41480a.f41196x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c41480a.f41196x = i13 - Integer.MIN_VALUE;
                    } else {
                        c41480a = new C41480a(interfaceC30057d);
                    }
                } else {
                    c41480a = new C41480a(interfaceC30057d);
                }
                Object obj2 = c41480a.f41195w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c41480a.f41196x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f41189w;
                    C35505g c35505gM38319a = this.f41190x.reducer.m38319a((C3555b) obj);
                    c41480a.f41197y = null;
                    c41480a.f41191E = null;
                    c41480a.f41192F = null;
                    c41480a.f41193G = null;
                    c41480a.f41194H = 0;
                    c41480a.f41196x = 1;
                    if (interfaceC13062m.emit(c35505gM38319a, c41480a) == enumC31071a) {
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

        public c(InterfaceC13058l interfaceC13058l, C12294a c12294a) {
            this.f41187w = interfaceC13058l;
            this.f41188x = c12294a;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f41187w.collect(new a(interfaceC13062m, this.f41188x), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C12294a(C3556c interactor, C13577a reducer, C28180m coroutineScope) {
        super(coroutineScope);
        AbstractC22676k.m65750j(interactor, "interactor");
        AbstractC22676k.m65750j(reducer, "reducer");
        AbstractC22676k.m65750j(coroutineScope, "coroutineScope");
        this.reducer = reducer;
        this.coroutineScope = coroutineScope;
        C13096w1 c13096w1M36592b = AbstractC13091v.m36592b(0, 0, null, 7);
        this.eventFlow = c13096w1M36592b;
        InterfaceC13058l interfaceC13058lM10637t = interactor.m10637t(new b(c13096w1M36592b, this));
        this.domainState = interfaceC13058lM10637t;
        this.viewState = AbstractC13091v.m36587M(new c(interfaceC13058lM10637t, this), coroutineScope, C13105z1.f45288a, new C35505g(true, false, false, null, null, null, null, null, null, false, 1022, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p */
    public final AbstractC3554a m34226p(AbstractC35503e abstractC35503e) {
        if (abstractC35503e instanceof AbstractC35503e.d) {
            return new AbstractC3554a.d(((AbstractC35503e.d) abstractC35503e).getPath());
        }
        if (abstractC35503e instanceof AbstractC35503e.e) {
            return new AbstractC3554a.e(((AbstractC35503e.e) abstractC35503e).getAction());
        }
        if (abstractC35503e instanceof AbstractC35503e.b) {
            return AbstractC3554a.b.f14293a;
        }
        if (abstractC35503e instanceof AbstractC35503e.f) {
            return AbstractC3554a.g.f14298a;
        }
        if (abstractC35503e instanceof AbstractC35503e.c) {
            return AbstractC3554a.c.f14294a;
        }
        if (!(abstractC35503e instanceof AbstractC35503e.a)) {
            throw new NoWhenBranchMatchedException();
        }
        AbstractC35503e.a aVar = (AbstractC35503e.a) abstractC35503e;
        return new AbstractC3554a.a(aVar.getPeriod(), aVar.getSortBy());
    }

    @Override // ld1.AbstractC23864c
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public void mo1216g(AbstractC35503e event) {
        AbstractC22676k.m65750j(event, "event");
        AbstractC3006f0.m8732z(this.coroutineScope, null, null, new a(event, null), 3);
    }

    @Override // ld1.AbstractC23864c
    public InterfaceC13037f2 getViewState() {
        return this.viewState;
    }

    public /* synthetic */ C12294a(C3556c c3556c, C13577a c13577a, C28180m c28180m, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(c3556c, c13577a, (i13 & 4) != 0 ? new C28180m(null, 1, null) : c28180m);
    }
}
