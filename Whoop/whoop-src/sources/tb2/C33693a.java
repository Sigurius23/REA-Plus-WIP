package tb2;

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
import nb2.AbstractC26539a;
import nb2.C26541c;
import nb2.C26542d;
import od1.AbstractC27845h;
import or2.C28180m;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.InterfaceC30057d;
import qb2.InterfaceC30185d;
import qb2.InterfaceC30186e;
import r83.EnumC31071a;
import rb2.C31192a;
import s83.AbstractC32269c;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;

/* JADX INFO: renamed from: tb2.a */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0013\u0010\f\u001a\u00020\u000b*\u00020\nH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\n¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\n0\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u001d\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001c8\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!¨\u0006#"}, m65681d2 = {"Ltb2/a;", "Landroidx/lifecycle/w1;", "Lnb2/d;", "interactor", "Lrb2/a;", "viewStateReducer", "Lbc3/c0;", "scope", "<init>", "(Lnb2/d;Lrb2/a;Lbc3/c0;)V", "Lqb2/d;", "Lnb2/a$a;", "p", "(Lqb2/d;)Lnb2/a$a;", "action", "Ll83/a0;", "o", "(Lqb2/d;)V", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "Lnb2/d;", "x", "Lrb2/a;", "y", "Lbc3/c0;", "Lec3/o1;", "z", "Lec3/o1;", "eventFlow", "Lec3/t1;", "Lqb2/e;", "E", "Lec3/t1;", "n", "()Lec3/t1;", "viewState", "settings_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C33693a extends AbstractC1637w1 {

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    private final InterfaceC13087t1 viewState;

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    private final C26542d interactor;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    private final C31192a viewStateReducer;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    private final InterfaceC2994c0 scope;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    private final InterfaceC13072o1 eventFlow;

    /* JADX INFO: renamed from: tb2.a$a */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.settings.gifthub.viewmodel.GiftHubViewModel$sendEvent$1", m100430f = "GiftHubViewModel.kt", m100431l = {33}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f140757w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC30185d f140759y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(InterfaceC30185d interfaceC30185d, InterfaceC30057d<? super a> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f140759y = interfaceC30185d;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C33693a.this.new a(this.f140759y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f140757w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC13072o1 interfaceC13072o1 = C33693a.this.eventFlow;
                InterfaceC30185d interfaceC30185d = this.f140759y;
                this.f140757w = 1;
                if (interfaceC13072o1.emit(interfaceC30185d, this) == enumC31071a) {
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

    /* JADX INFO: renamed from: tb2.a$b */
    /* JADX INFO: loaded from: classes10.dex */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f140760w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C33693a f140761x;

        /* JADX INFO: renamed from: tb2.a$b$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f140762w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C33693a f140763x;

            /* JADX INFO: renamed from: tb2.a$b$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.settings.gifthub.viewmodel.GiftHubViewModel$special$$inlined$map$1$2", m100430f = "GiftHubViewModel.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C42366a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f140764E;

                /* JADX INFO: renamed from: F */
                Object f140765F;

                /* JADX INFO: renamed from: G */
                Object f140766G;

                /* JADX INFO: renamed from: H */
                int f140767H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f140768w;

                /* JADX INFO: renamed from: x */
                int f140769x;

                /* JADX INFO: renamed from: y */
                Object f140770y;

                public C42366a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f140768w = obj;
                    this.f140769x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m, C33693a c33693a) {
                this.f140762w = interfaceC13062m;
                this.f140763x = c33693a;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C42366a c42366a;
                if (interfaceC30057d instanceof C42366a) {
                    c42366a = (C42366a) interfaceC30057d;
                    int i13 = c42366a.f140769x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c42366a.f140769x = i13 - Integer.MIN_VALUE;
                    } else {
                        c42366a = new C42366a(interfaceC30057d);
                    }
                } else {
                    c42366a = new C42366a(interfaceC30057d);
                }
                Object obj2 = c42366a.f140768w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c42366a.f140769x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f140762w;
                    AbstractC26539a.a aVarM106448p = this.f140763x.m106448p((InterfaceC30185d) obj);
                    c42366a.f140770y = null;
                    c42366a.f140764E = null;
                    c42366a.f140765F = null;
                    c42366a.f140766G = null;
                    c42366a.f140767H = 0;
                    c42366a.f140769x = 1;
                    if (interfaceC13062m.emit(aVarM106448p, c42366a) == enumC31071a) {
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

        public b(InterfaceC13058l interfaceC13058l, C33693a c33693a) {
            this.f140760w = interfaceC13058l;
            this.f140761x = c33693a;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f140760w.collect(new a(interfaceC13062m, this.f140761x), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: tb2.a$c */
    /* JADX INFO: loaded from: classes10.dex */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f140772w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C33693a f140773x;

        /* JADX INFO: renamed from: tb2.a$c$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f140774w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C33693a f140775x;

            /* JADX INFO: renamed from: tb2.a$c$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.settings.gifthub.viewmodel.GiftHubViewModel$special$$inlined$map$2$2", m100430f = "GiftHubViewModel.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C42367a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f140776E;

                /* JADX INFO: renamed from: F */
                Object f140777F;

                /* JADX INFO: renamed from: G */
                Object f140778G;

                /* JADX INFO: renamed from: H */
                int f140779H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f140780w;

                /* JADX INFO: renamed from: x */
                int f140781x;

                /* JADX INFO: renamed from: y */
                Object f140782y;

                public C42367a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f140780w = obj;
                    this.f140781x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m, C33693a c33693a) {
                this.f140774w = interfaceC13062m;
                this.f140775x = c33693a;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C42367a c42367a;
                if (interfaceC30057d instanceof C42367a) {
                    c42367a = (C42367a) interfaceC30057d;
                    int i13 = c42367a.f140781x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c42367a.f140781x = i13 - Integer.MIN_VALUE;
                    } else {
                        c42367a = new C42367a(interfaceC30057d);
                    }
                } else {
                    c42367a = new C42367a(interfaceC30057d);
                }
                Object obj2 = c42367a.f140780w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c42367a.f140781x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f140774w;
                    InterfaceC30186e interfaceC30186eM96144a = this.f140775x.viewStateReducer.m96144a((C26541c) obj);
                    c42367a.f140782y = null;
                    c42367a.f140776E = null;
                    c42367a.f140777F = null;
                    c42367a.f140778G = null;
                    c42367a.f140779H = 0;
                    c42367a.f140781x = 1;
                    if (interfaceC13062m.emit(interfaceC30186eM96144a, c42367a) == enumC31071a) {
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

        public c(InterfaceC13058l interfaceC13058l, C33693a c33693a) {
            this.f140772w = interfaceC13058l;
            this.f140773x = c33693a;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f140772w.collect(new a(interfaceC13062m, this.f140773x), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C33693a(C26542d interactor, C31192a viewStateReducer, InterfaceC2994c0 scope) {
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
    public final AbstractC26539a.a m106448p(InterfaceC30185d interfaceC30185d) {
        if (interfaceC30185d instanceof InterfaceC30185d.a) {
            return new AbstractC26539a.a(((InterfaceC30185d.a) interfaceC30185d).getSource());
        }
        if (AbstractC22676k.m65745e(interfaceC30185d, InterfaceC30185d.b.f123571a)) {
            return new AbstractC26539a.a(null, 1, null);
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: renamed from: n, reason: from getter */
    public final InterfaceC13087t1 getViewState() {
        return this.viewState;
    }

    /* JADX INFO: renamed from: o */
    public final void m106450o(InterfaceC30185d action) {
        AbstractC22676k.m65750j(action, "action");
        AbstractC3006f0.m8732z(this.scope, null, null, new a(action, null), 3);
    }

    public /* synthetic */ C33693a(C26542d c26542d, C31192a c31192a, InterfaceC2994c0 interfaceC2994c0, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(c26542d, c31192a, (i13 & 4) != 0 ? new C28180m(null, 1, null) : interfaceC2994c0);
    }
}
