package ir0;

import androidx.core.app.NotificationCompat;
import bc3.AbstractC3006f0;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4351m;
import ec3.AbstractC13091v;
import ec3.C13096w1;
import ec3.C13105z1;
import ec3.InterfaceC13037f2;
import ec3.InterfaceC13058l;
import ec3.InterfaceC13062m;
import ec3.InterfaceC13072o1;
import gr0.AbstractC16086a;
import gr0.C16087b;
import gr0.C16088c;
import jr0.C21891a;
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
import w01.AbstractC36676a;
import w01.AbstractC36677b;
import w01.C36678c;

/* JADX INFO: renamed from: ir0.a */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0013\u0010\f\u001a\u00020\u000b*\u00020\nH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\n0\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u001a\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR \u0010%\u001a\b\u0012\u0004\u0012\u00020 0\u001f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$¨\u0006&"}, m65681d2 = {"Lir0/a;", "Lw01/b;", "Lgr0/c;", "interactor", "Ljr0/a;", "reducer", "Lor2/m;", "coroutineScope", "<init>", "(Lgr0/c;Ljr0/a;Lor2/m;)V", "Lw01/a;", "Lgr0/a;", "p", "(Lw01/a;)Lgr0/a;", NotificationCompat.CATEGORY_EVENT, "Ll83/a0;", "o", "(Lw01/a;)V", "x", "Ljr0/a;", "y", "Lor2/m;", "Lec3/o1;", "z", "Lec3/o1;", "eventFlow", "Lec3/l;", "Lgr0/b;", "E", "Lec3/l;", "domainState", "Lec3/f2;", "Lw01/c;", "F", "Lec3/f2;", "getViewState", "()Lec3/f2;", "viewState", "community-follower-lookup-arch-mini_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C20859a extends AbstractC36677b {

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    private final InterfaceC13058l domainState;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    private final InterfaceC13037f2 viewState;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    private final C21891a reducer;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    private final C28180m coroutineScope;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    private final InterfaceC13072o1 eventFlow;

    /* JADX INFO: renamed from: ir0.a$a */
    @InterfaceC32271e(m100429c = "com.whoop.communityfollowerlookup.presentation.CommunityFollowerLookupViewModelImpl$sendViewEvent$1", m100430f = "CommunityFollowerLookupViewModelImpl.kt", m100431l = {38}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f78469w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ AbstractC36676a f78471y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(AbstractC36676a abstractC36676a, InterfaceC30057d<? super a> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f78471y = abstractC36676a;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C20859a.this.new a(this.f78471y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f78469w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC13072o1 interfaceC13072o1 = C20859a.this.eventFlow;
                AbstractC36676a abstractC36676a = this.f78471y;
                this.f78469w = 1;
                if (interfaceC13072o1.emit(abstractC36676a, this) == enumC31071a) {
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

    /* JADX INFO: renamed from: ir0.a$b */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f78472w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C20859a f78473x;

        /* JADX INFO: renamed from: ir0.a$b$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f78474w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C20859a f78475x;

            /* JADX INFO: renamed from: ir0.a$b$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.communityfollowerlookup.presentation.CommunityFollowerLookupViewModelImpl$special$$inlined$map$1$2", m100430f = "CommunityFollowerLookupViewModelImpl.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C41785a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f78476E;

                /* JADX INFO: renamed from: F */
                Object f78477F;

                /* JADX INFO: renamed from: G */
                Object f78478G;

                /* JADX INFO: renamed from: H */
                int f78479H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f78480w;

                /* JADX INFO: renamed from: x */
                int f78481x;

                /* JADX INFO: renamed from: y */
                Object f78482y;

                public C41785a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f78480w = obj;
                    this.f78481x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m, C20859a c20859a) {
                this.f78474w = interfaceC13062m;
                this.f78475x = c20859a;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C41785a c41785a;
                if (interfaceC30057d instanceof C41785a) {
                    c41785a = (C41785a) interfaceC30057d;
                    int i13 = c41785a.f78481x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c41785a.f78481x = i13 - Integer.MIN_VALUE;
                    } else {
                        c41785a = new C41785a(interfaceC30057d);
                    }
                } else {
                    c41785a = new C41785a(interfaceC30057d);
                }
                Object obj2 = c41785a.f78480w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c41785a.f78481x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f78474w;
                    AbstractC16086a abstractC16086aM57617p = this.f78475x.m57617p((AbstractC36676a) obj);
                    c41785a.f78482y = null;
                    c41785a.f78476E = null;
                    c41785a.f78477F = null;
                    c41785a.f78478G = null;
                    c41785a.f78479H = 0;
                    c41785a.f78481x = 1;
                    if (interfaceC13062m.emit(abstractC16086aM57617p, c41785a) == enumC31071a) {
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

        public b(InterfaceC13058l interfaceC13058l, C20859a c20859a) {
            this.f78472w = interfaceC13058l;
            this.f78473x = c20859a;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f78472w.collect(new a(interfaceC13062m, this.f78473x), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: ir0.a$c */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f78484w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C20859a f78485x;

        /* JADX INFO: renamed from: ir0.a$c$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f78486w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C20859a f78487x;

            /* JADX INFO: renamed from: ir0.a$c$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.communityfollowerlookup.presentation.CommunityFollowerLookupViewModelImpl$special$$inlined$map$2$2", m100430f = "CommunityFollowerLookupViewModelImpl.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C41786a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f78488E;

                /* JADX INFO: renamed from: F */
                Object f78489F;

                /* JADX INFO: renamed from: G */
                Object f78490G;

                /* JADX INFO: renamed from: H */
                int f78491H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f78492w;

                /* JADX INFO: renamed from: x */
                int f78493x;

                /* JADX INFO: renamed from: y */
                Object f78494y;

                public C41786a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f78492w = obj;
                    this.f78493x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m, C20859a c20859a) {
                this.f78486w = interfaceC13062m;
                this.f78487x = c20859a;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C41786a c41786a;
                if (interfaceC30057d instanceof C41786a) {
                    c41786a = (C41786a) interfaceC30057d;
                    int i13 = c41786a.f78493x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c41786a.f78493x = i13 - Integer.MIN_VALUE;
                    } else {
                        c41786a = new C41786a(interfaceC30057d);
                    }
                } else {
                    c41786a = new C41786a(interfaceC30057d);
                }
                Object obj2 = c41786a.f78492w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c41786a.f78493x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f78486w;
                    C36678c c36678cM62151a = this.f78487x.reducer.m62151a((C16087b) obj);
                    c41786a.f78494y = null;
                    c41786a.f78488E = null;
                    c41786a.f78489F = null;
                    c41786a.f78490G = null;
                    c41786a.f78491H = 0;
                    c41786a.f78493x = 1;
                    if (interfaceC13062m.emit(c36678cM62151a, c41786a) == enumC31071a) {
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

        public c(InterfaceC13058l interfaceC13058l, C20859a c20859a) {
            this.f78484w = interfaceC13058l;
            this.f78485x = c20859a;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f78484w.collect(new a(interfaceC13062m, this.f78485x), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20859a(C16088c interactor, C21891a reducer, C28180m coroutineScope) {
        super(coroutineScope);
        AbstractC22676k.m65750j(interactor, "interactor");
        AbstractC22676k.m65750j(reducer, "reducer");
        AbstractC22676k.m65750j(coroutineScope, "coroutineScope");
        this.reducer = reducer;
        this.coroutineScope = coroutineScope;
        C13096w1 c13096w1M36592b = AbstractC13091v.m36592b(0, 0, null, 7);
        this.eventFlow = c13096w1M36592b;
        InterfaceC13058l interfaceC13058lM45484t = interactor.m45484t(new b(c13096w1M36592b, this));
        this.domainState = interfaceC13058lM45484t;
        this.viewState = AbstractC13091v.m36587M(new c(interfaceC13058lM45484t, this), coroutineScope, C13105z1.f45288a, new C36678c(true, false, false, null, null, false, null, null, 0, null, null, null, null, 8190, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p */
    public final AbstractC16086a m57617p(AbstractC36676a abstractC36676a) {
        if (abstractC36676a instanceof AbstractC36676a.d) {
            return new AbstractC16086a.c(((AbstractC36676a.d) abstractC36676a).getPath());
        }
        if (abstractC36676a instanceof AbstractC36676a.e) {
            return new AbstractC16086a.d(((AbstractC36676a.e) abstractC36676a).getAction());
        }
        if (abstractC36676a instanceof AbstractC36676a.c) {
            return new AbstractC16086a.e(((AbstractC36676a.c) abstractC36676a).getAction());
        }
        if (abstractC36676a instanceof AbstractC36676a.b) {
            return AbstractC16086a.b.f60875a;
        }
        if (abstractC36676a instanceof AbstractC36676a.a) {
            return AbstractC16086a.a.f60874a;
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // ld1.AbstractC23864c
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public void mo1216g(AbstractC36676a event) {
        AbstractC22676k.m65750j(event, "event");
        AbstractC3006f0.m8732z(this.coroutineScope, null, null, new a(event, null), 3);
    }

    @Override // ld1.AbstractC23864c
    public InterfaceC13037f2 getViewState() {
        return this.viewState;
    }

    public /* synthetic */ C20859a(C16088c c16088c, C21891a c21891a, C28180m c28180m, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(c16088c, c21891a, (i13 & 4) != 0 ? new C28180m(null, 1, null) : c28180m);
    }
}
