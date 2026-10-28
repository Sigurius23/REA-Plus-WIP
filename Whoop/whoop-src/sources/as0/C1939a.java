package as0;

import androidx.core.app.NotificationCompat;
import bc3.AbstractC3006f0;
import bc3.InterfaceC2994c0;
import bs0.C3577a;
import c93.InterfaceC4351m;
import ec3.AbstractC13091v;
import ec3.C13096w1;
import ec3.C13105z1;
import ec3.InterfaceC13037f2;
import ec3.InterfaceC13058l;
import ec3.InterfaceC13062m;
import ec3.InterfaceC13072o1;
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
import wr0.AbstractC37516a;
import wr0.AbstractC37518b;
import wr0.C37520c;
import yr0.AbstractC39725a;
import yr0.C39726b;
import yr0.C39727c;

/* JADX INFO: renamed from: as0.a */
/* JADX INFO: loaded from: classes7.dex */
@Metadata(m65680d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0013\u0010\f\u001a\u00020\u000b*\u00020\nH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\nH\u0016¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\n0\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u001a\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR \u0010%\u001a\b\u0012\u0004\u0012\u00020 0\u001f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$¨\u0006&"}, m65681d2 = {"Las0/a;", "Lwr0/b;", "Lyr0/c;", "interactor", "Lbs0/a;", "reducer", "Lor2/m;", "coroutineScope", "<init>", "(Lyr0/c;Lbs0/a;Lor2/m;)V", "Lwr0/a;", "Lyr0/a;", "p", "(Lwr0/a;)Lyr0/a;", NotificationCompat.CATEGORY_EVENT, "Ll83/a0;", "o", "(Lwr0/a;)V", "y", "Lbs0/a;", "z", "Lor2/m;", "Lec3/o1;", "E", "Lec3/o1;", "eventFlow", "Lec3/l;", "Lyr0/b;", "F", "Lec3/l;", "domainState", "Lec3/f2;", "Lwr0/c;", "G", "Lec3/f2;", "getViewState", "()Lec3/f2;", "viewState", "community-moments-container-arch-mini_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C1939a extends AbstractC37518b {

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    private final InterfaceC13072o1 eventFlow;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    private final InterfaceC13058l domainState;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    private final InterfaceC13037f2 viewState;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    private final C3577a reducer;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    private final C28180m coroutineScope;

    /* JADX INFO: renamed from: as0.a$a */
    @InterfaceC32271e(m100429c = "com.whoop.communitymomentscontainer.presentation.CommunityMomentsContainerViewModelImpl$sendViewEvent$1", m100430f = "CommunityMomentsContainerViewModelImpl.kt", m100431l = {38}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f7701w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ AbstractC37516a f7703y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(AbstractC37516a abstractC37516a, InterfaceC30057d<? super a> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f7703y = abstractC37516a;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C1939a.this.new a(this.f7703y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f7701w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC13072o1 interfaceC13072o1 = C1939a.this.eventFlow;
                AbstractC37516a abstractC37516a = this.f7703y;
                this.f7701w = 1;
                if (interfaceC13072o1.emit(abstractC37516a, this) == enumC31071a) {
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

    /* JADX INFO: renamed from: as0.a$b */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f7704w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C1939a f7705x;

        /* JADX INFO: renamed from: as0.a$b$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f7706w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C1939a f7707x;

            /* JADX INFO: renamed from: as0.a$b$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.communitymomentscontainer.presentation.CommunityMomentsContainerViewModelImpl$special$$inlined$map$1$2", m100430f = "CommunityMomentsContainerViewModelImpl.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C41286a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f7708E;

                /* JADX INFO: renamed from: F */
                Object f7709F;

                /* JADX INFO: renamed from: G */
                Object f7710G;

                /* JADX INFO: renamed from: H */
                int f7711H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f7712w;

                /* JADX INFO: renamed from: x */
                int f7713x;

                /* JADX INFO: renamed from: y */
                Object f7714y;

                public C41286a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f7712w = obj;
                    this.f7713x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m, C1939a c1939a) {
                this.f7706w = interfaceC13062m;
                this.f7707x = c1939a;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C41286a c41286a;
                if (interfaceC30057d instanceof C41286a) {
                    c41286a = (C41286a) interfaceC30057d;
                    int i13 = c41286a.f7713x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c41286a.f7713x = i13 - Integer.MIN_VALUE;
                    } else {
                        c41286a = new C41286a(interfaceC30057d);
                    }
                } else {
                    c41286a = new C41286a(interfaceC30057d);
                }
                Object obj2 = c41286a.f7712w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c41286a.f7713x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f7706w;
                    AbstractC39725a abstractC39725aM5944p = this.f7707x.m5944p((AbstractC37516a) obj);
                    c41286a.f7714y = null;
                    c41286a.f7708E = null;
                    c41286a.f7709F = null;
                    c41286a.f7710G = null;
                    c41286a.f7711H = 0;
                    c41286a.f7713x = 1;
                    if (interfaceC13062m.emit(abstractC39725aM5944p, c41286a) == enumC31071a) {
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

        public b(InterfaceC13058l interfaceC13058l, C1939a c1939a) {
            this.f7704w = interfaceC13058l;
            this.f7705x = c1939a;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f7704w.collect(new a(interfaceC13062m, this.f7705x), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: as0.a$c */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f7716w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C1939a f7717x;

        /* JADX INFO: renamed from: as0.a$c$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f7718w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C1939a f7719x;

            /* JADX INFO: renamed from: as0.a$c$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.communitymomentscontainer.presentation.CommunityMomentsContainerViewModelImpl$special$$inlined$map$2$2", m100430f = "CommunityMomentsContainerViewModelImpl.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C41287a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f7720E;

                /* JADX INFO: renamed from: F */
                Object f7721F;

                /* JADX INFO: renamed from: G */
                Object f7722G;

                /* JADX INFO: renamed from: H */
                int f7723H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f7724w;

                /* JADX INFO: renamed from: x */
                int f7725x;

                /* JADX INFO: renamed from: y */
                Object f7726y;

                public C41287a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f7724w = obj;
                    this.f7725x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m, C1939a c1939a) {
                this.f7718w = interfaceC13062m;
                this.f7719x = c1939a;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C41287a c41287a;
                if (interfaceC30057d instanceof C41287a) {
                    c41287a = (C41287a) interfaceC30057d;
                    int i13 = c41287a.f7725x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c41287a.f7725x = i13 - Integer.MIN_VALUE;
                    } else {
                        c41287a = new C41287a(interfaceC30057d);
                    }
                } else {
                    c41287a = new C41287a(interfaceC30057d);
                }
                Object obj2 = c41287a.f7724w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c41287a.f7725x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f7718w;
                    C37520c c37520cM10732c = this.f7719x.reducer.m10732c((C39726b) obj);
                    c41287a.f7726y = null;
                    c41287a.f7720E = null;
                    c41287a.f7721F = null;
                    c41287a.f7722G = null;
                    c41287a.f7723H = 0;
                    c41287a.f7725x = 1;
                    if (interfaceC13062m.emit(c37520cM10732c, c41287a) == enumC31071a) {
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

        public c(InterfaceC13058l interfaceC13058l, C1939a c1939a) {
            this.f7716w = interfaceC13058l;
            this.f7717x = c1939a;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f7716w.collect(new a(interfaceC13062m, this.f7717x), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1939a(C39727c interactor, C3577a reducer, C28180m coroutineScope) {
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
        this.viewState = AbstractC13091v.m36587M(new c(interfaceC13058lInteract, this), coroutineScope, C13105z1.f45288a, new C37520c(true, false, null, null, 14, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p */
    public final AbstractC39725a m5944p(AbstractC37516a abstractC37516a) {
        if (abstractC37516a instanceof AbstractC37516a.b) {
            return new AbstractC39725a.b(((AbstractC37516a.b) abstractC37516a).getPath());
        }
        if (abstractC37516a instanceof AbstractC37516a.a) {
            return new AbstractC39725a.a(((AbstractC37516a.a) abstractC37516a).getFrontIndex());
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // ld1.AbstractC23864c
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public void mo1216g(AbstractC37516a event) {
        AbstractC22676k.m65750j(event, "event");
        AbstractC3006f0.m8732z(this.coroutineScope, null, null, new a(event, null), 3);
    }

    @Override // ld1.AbstractC23864c
    public InterfaceC13037f2 getViewState() {
        return this.viewState;
    }

    public /* synthetic */ C1939a(C39727c c39727c, C3577a c3577a, C28180m c28180m, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(c39727c, c3577a, (i13 & 4) != 0 ? new C28180m(null, 1, null) : c28180m);
    }
}
