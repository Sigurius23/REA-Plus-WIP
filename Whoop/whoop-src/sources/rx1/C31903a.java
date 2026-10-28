package rx1;

import androidx.lifecycle.AbstractC1637w1;
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
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import l83.C23454a0;
import od1.AbstractC27845h;
import or2.C28180m;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import px1.InterfaceC29597a;
import q83.InterfaceC30057d;
import qx1.C30759f;
import qx1.InterfaceC30758e;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import tv1.AbstractC34205a;
import tv1.AbstractC34207c;
import tv1.C34206b;

/* JADX INFO: renamed from: rx1.a */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0013\u0010\f\u001a\u00020\u000b*\u00020\nH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\n¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\n0\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u001d\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001c8\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!¨\u0006#"}, m65681d2 = {"Lrx1/a;", "Landroidx/lifecycle/w1;", "Ltv1/b;", "interactor", "Lqx1/f;", "viewStateReducer", "Lbc3/c0;", "scope", "<init>", "(Ltv1/b;Lqx1/f;Lbc3/c0;)V", "Lpx1/a;", "Ltv1/a$a;", "p", "(Lpx1/a;)Ltv1/a$a;", "action", "Ll83/a0;", "o", "(Lpx1/a;)V", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "Ltv1/b;", "x", "Lqx1/f;", "y", "Lbc3/c0;", "Lec3/o1;", "z", "Lec3/o1;", "eventFlow", "Lec3/t1;", "Lqx1/e;", "E", "Lec3/t1;", "n", "()Lec3/t1;", "viewState", "membership_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C31903a extends AbstractC1637w1 {

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    private final InterfaceC13087t1 viewState;

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    private final C34206b interactor;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    private final C30759f viewStateReducer;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    private final InterfaceC2994c0 scope;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    private final InterfaceC13072o1 eventFlow;

    /* JADX INFO: renamed from: rx1.a$a */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.membership.presentation.upcycle.viewmodel.UpcycleLandingViewModel$sendEvent$1", m100430f = "UpcycleLandingViewModel.kt", m100431l = {33}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f132417w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC29597a f132419y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(InterfaceC29597a interfaceC29597a, InterfaceC30057d<? super a> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f132419y = interfaceC29597a;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C31903a.this.new a(this.f132419y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f132417w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC13072o1 interfaceC13072o1 = C31903a.this.eventFlow;
                InterfaceC29597a interfaceC29597a = this.f132419y;
                this.f132417w = 1;
                if (interfaceC13072o1.emit(interfaceC29597a, this) == enumC31071a) {
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

    /* JADX INFO: renamed from: rx1.a$b */
    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f132420w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C31903a f132421x;

        /* JADX INFO: renamed from: rx1.a$b$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f132422w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C31903a f132423x;

            /* JADX INFO: renamed from: rx1.a$b$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.membership.presentation.upcycle.viewmodel.UpcycleLandingViewModel$special$$inlined$map$1$2", m100430f = "UpcycleLandingViewModel.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C42307a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f132424E;

                /* JADX INFO: renamed from: F */
                Object f132425F;

                /* JADX INFO: renamed from: G */
                Object f132426G;

                /* JADX INFO: renamed from: H */
                int f132427H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f132428w;

                /* JADX INFO: renamed from: x */
                int f132429x;

                /* JADX INFO: renamed from: y */
                Object f132430y;

                public C42307a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f132428w = obj;
                    this.f132429x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m, C31903a c31903a) {
                this.f132422w = interfaceC13062m;
                this.f132423x = c31903a;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C42307a c42307a;
                if (interfaceC30057d instanceof C42307a) {
                    c42307a = (C42307a) interfaceC30057d;
                    int i13 = c42307a.f132429x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c42307a.f132429x = i13 - Integer.MIN_VALUE;
                    } else {
                        c42307a = new C42307a(interfaceC30057d);
                    }
                } else {
                    c42307a = new C42307a(interfaceC30057d);
                }
                Object obj2 = c42307a.f132428w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c42307a.f132429x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f132422w;
                    AbstractC34205a.a aVarM99182p = this.f132423x.m99182p((InterfaceC29597a) obj);
                    c42307a.f132430y = null;
                    c42307a.f132424E = null;
                    c42307a.f132425F = null;
                    c42307a.f132426G = null;
                    c42307a.f132427H = 0;
                    c42307a.f132429x = 1;
                    if (interfaceC13062m.emit(aVarM99182p, c42307a) == enumC31071a) {
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

        public b(InterfaceC13058l interfaceC13058l, C31903a c31903a) {
            this.f132420w = interfaceC13058l;
            this.f132421x = c31903a;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f132420w.collect(new a(interfaceC13062m, this.f132421x), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: rx1.a$c */
    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f132432w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C31903a f132433x;

        /* JADX INFO: renamed from: rx1.a$c$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f132434w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C31903a f132435x;

            /* JADX INFO: renamed from: rx1.a$c$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.membership.presentation.upcycle.viewmodel.UpcycleLandingViewModel$special$$inlined$map$2$2", m100430f = "UpcycleLandingViewModel.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C42308a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f132436E;

                /* JADX INFO: renamed from: F */
                Object f132437F;

                /* JADX INFO: renamed from: G */
                Object f132438G;

                /* JADX INFO: renamed from: H */
                int f132439H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f132440w;

                /* JADX INFO: renamed from: x */
                int f132441x;

                /* JADX INFO: renamed from: y */
                Object f132442y;

                public C42308a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f132440w = obj;
                    this.f132441x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m, C31903a c31903a) {
                this.f132434w = interfaceC13062m;
                this.f132435x = c31903a;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C42308a c42308a;
                if (interfaceC30057d instanceof C42308a) {
                    c42308a = (C42308a) interfaceC30057d;
                    int i13 = c42308a.f132441x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c42308a.f132441x = i13 - Integer.MIN_VALUE;
                    } else {
                        c42308a = new C42308a(interfaceC30057d);
                    }
                } else {
                    c42308a = new C42308a(interfaceC30057d);
                }
                Object obj2 = c42308a.f132440w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c42308a.f132441x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f132434w;
                    InterfaceC30758e interfaceC30758eM94497a = this.f132435x.viewStateReducer.m94497a((AbstractC34207c) obj);
                    c42308a.f132442y = null;
                    c42308a.f132436E = null;
                    c42308a.f132437F = null;
                    c42308a.f132438G = null;
                    c42308a.f132439H = 0;
                    c42308a.f132441x = 1;
                    if (interfaceC13062m.emit(interfaceC30758eM94497a, c42308a) == enumC31071a) {
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

        public c(InterfaceC13058l interfaceC13058l, C31903a c31903a) {
            this.f132432w = interfaceC13058l;
            this.f132433x = c31903a;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f132432w.collect(new a(interfaceC13062m, this.f132433x), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C31903a(C34206b interactor, C30759f viewStateReducer, InterfaceC2994c0 scope) {
        super(scope);
        AbstractC22676k.m65750j(interactor, "interactor");
        AbstractC22676k.m65750j(viewStateReducer, "viewStateReducer");
        AbstractC22676k.m65750j(scope, "scope");
        this.interactor = interactor;
        this.viewStateReducer = viewStateReducer;
        this.scope = scope;
        C13096w1 c13096w1M36592b = AbstractC13091v.m36592b(0, 0, null, 7);
        this.eventFlow = c13096w1M36592b;
        this.viewState = AbstractC13091v.m36586L(new c(AbstractC27845h.m83945a(new b(c13096w1M36592b, this), interactor), this), scope, C13105z1.f45288a, 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p */
    public final AbstractC34205a.a m99182p(InterfaceC29597a interfaceC29597a) {
        if (AbstractC22676k.m65745e(interfaceC29597a, InterfaceC29597a.a.f120845a)) {
            return AbstractC34205a.a.f143480a;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: renamed from: n, reason: from getter */
    public final InterfaceC13087t1 getViewState() {
        return this.viewState;
    }

    /* JADX INFO: renamed from: o */
    public final void m99184o(InterfaceC29597a action) {
        AbstractC22676k.m65750j(action, "action");
        AbstractC3006f0.m8732z(this.scope, null, null, new a(action, null), 3);
    }

    public /* synthetic */ C31903a(C34206b c34206b, C30759f c30759f, InterfaceC2994c0 interfaceC2994c0, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(c34206b, c30759f, (i13 & 4) != 0 ? new C28180m(null, 1, null) : interfaceC2994c0);
    }
}
