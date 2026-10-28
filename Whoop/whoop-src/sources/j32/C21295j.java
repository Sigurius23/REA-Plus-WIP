package j32;

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
import i32.AbstractC18054a;
import i32.C18055b;
import i32.C18056c;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import k32.C22175a;
import l83.C23454a0;
import od1.AbstractC27845h;
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

/* JADX INFO: renamed from: j32.j */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0013\u0010\f\u001a\u00020\u000b*\u00020\nH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000e\u001a\u00020\n¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\n0\u00188\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u001d\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u001d0\u001c8\u0006¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!¨\u0006#"}, m65681d2 = {"Lj32/j;", "Landroidx/lifecycle/w1;", "Li32/c;", "interactor", "Lk32/a;", "viewStateReducer", "Lbc3/c0;", "coroutineScope", "<init>", "(Li32/c;Lk32/a;Lbc3/c0;)V", "Lj32/i;", "Li32/a;", "p", "(Lj32/i;)Li32/a;", "viewEvent", "Ll83/a0;", "o", "(Lj32/i;)V", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "Li32/c;", "x", "Lk32/a;", "y", "Lbc3/c0;", "Lec3/o1;", "z", "Lec3/o1;", "eventFlow", "Lec3/t1;", "Lj32/k;", "E", "Lec3/t1;", "n", "()Lec3/t1;", "viewState", "payments_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C21295j extends AbstractC1637w1 {

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    private final InterfaceC13087t1 viewState;

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    private final C18056c interactor;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    private final C22175a viewStateReducer;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    private final InterfaceC2994c0 coroutineScope;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    private final InterfaceC13072o1 eventFlow;

    /* JADX INFO: renamed from: j32.j$a */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.payments.stripepaymentsheettileminiarch.presentation.MiniArchStripePaymentSheetTileViewModel$sendViewEvent$1", m100430f = "MiniArchStripePaymentSheetTileViewModel.kt", m100431l = {33}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f81344w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC21294i f81346y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(InterfaceC21294i interfaceC21294i, InterfaceC30057d<? super a> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f81346y = interfaceC21294i;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C21295j.this.new a(this.f81346y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f81344w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC13072o1 interfaceC13072o1 = C21295j.this.eventFlow;
                InterfaceC21294i interfaceC21294i = this.f81346y;
                this.f81344w = 1;
                if (interfaceC13072o1.emit(interfaceC21294i, this) == enumC31071a) {
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

    /* JADX INFO: renamed from: j32.j$b */
    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f81347w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C21295j f81348x;

        /* JADX INFO: renamed from: j32.j$b$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f81349w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C21295j f81350x;

            /* JADX INFO: renamed from: j32.j$b$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.payments.stripepaymentsheettileminiarch.presentation.MiniArchStripePaymentSheetTileViewModel$special$$inlined$map$1$2", m100430f = "MiniArchStripePaymentSheetTileViewModel.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C41827a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f81351E;

                /* JADX INFO: renamed from: F */
                Object f81352F;

                /* JADX INFO: renamed from: G */
                Object f81353G;

                /* JADX INFO: renamed from: H */
                int f81354H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f81355w;

                /* JADX INFO: renamed from: x */
                int f81356x;

                /* JADX INFO: renamed from: y */
                Object f81357y;

                public C41827a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f81355w = obj;
                    this.f81356x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m, C21295j c21295j) {
                this.f81349w = interfaceC13062m;
                this.f81350x = c21295j;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C41827a c41827a;
                if (interfaceC30057d instanceof C41827a) {
                    c41827a = (C41827a) interfaceC30057d;
                    int i13 = c41827a.f81356x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c41827a.f81356x = i13 - Integer.MIN_VALUE;
                    } else {
                        c41827a = new C41827a(interfaceC30057d);
                    }
                } else {
                    c41827a = new C41827a(interfaceC30057d);
                }
                Object obj2 = c41827a.f81355w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c41827a.f81356x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f81349w;
                    AbstractC18054a abstractC18054aM59796p = this.f81350x.m59796p((InterfaceC21294i) obj);
                    c41827a.f81357y = null;
                    c41827a.f81351E = null;
                    c41827a.f81352F = null;
                    c41827a.f81353G = null;
                    c41827a.f81354H = 0;
                    c41827a.f81356x = 1;
                    if (interfaceC13062m.emit(abstractC18054aM59796p, c41827a) == enumC31071a) {
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

        public b(InterfaceC13058l interfaceC13058l, C21295j c21295j) {
            this.f81347w = interfaceC13058l;
            this.f81348x = c21295j;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f81347w.collect(new a(interfaceC13062m, this.f81348x), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: j32.j$c */
    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f81359w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C21295j f81360x;

        /* JADX INFO: renamed from: j32.j$c$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f81361w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C21295j f81362x;

            /* JADX INFO: renamed from: j32.j$c$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.payments.stripepaymentsheettileminiarch.presentation.MiniArchStripePaymentSheetTileViewModel$special$$inlined$map$2$2", m100430f = "MiniArchStripePaymentSheetTileViewModel.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C41828a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f81363E;

                /* JADX INFO: renamed from: F */
                Object f81364F;

                /* JADX INFO: renamed from: G */
                Object f81365G;

                /* JADX INFO: renamed from: H */
                int f81366H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f81367w;

                /* JADX INFO: renamed from: x */
                int f81368x;

                /* JADX INFO: renamed from: y */
                Object f81369y;

                public C41828a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f81367w = obj;
                    this.f81368x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m, C21295j c21295j) {
                this.f81361w = interfaceC13062m;
                this.f81362x = c21295j;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C41828a c41828a;
                if (interfaceC30057d instanceof C41828a) {
                    c41828a = (C41828a) interfaceC30057d;
                    int i13 = c41828a.f81368x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c41828a.f81368x = i13 - Integer.MIN_VALUE;
                    } else {
                        c41828a = new C41828a(interfaceC30057d);
                    }
                } else {
                    c41828a = new C41828a(interfaceC30057d);
                }
                Object obj2 = c41828a.f81367w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c41828a.f81368x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f81361w;
                    AbstractC21296k abstractC21296kM63484a = this.f81362x.viewStateReducer.m63484a((C18055b) obj);
                    c41828a.f81369y = null;
                    c41828a.f81363E = null;
                    c41828a.f81364F = null;
                    c41828a.f81365G = null;
                    c41828a.f81366H = 0;
                    c41828a.f81368x = 1;
                    if (interfaceC13062m.emit(abstractC21296kM63484a, c41828a) == enumC31071a) {
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

        public c(InterfaceC13058l interfaceC13058l, C21295j c21295j) {
            this.f81359w = interfaceC13058l;
            this.f81360x = c21295j;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f81359w.collect(new a(interfaceC13062m, this.f81360x), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C21295j(C18056c interactor, C22175a viewStateReducer, InterfaceC2994c0 coroutineScope) {
        super(coroutineScope);
        AbstractC22676k.m65750j(interactor, "interactor");
        AbstractC22676k.m65750j(viewStateReducer, "viewStateReducer");
        AbstractC22676k.m65750j(coroutineScope, "coroutineScope");
        this.interactor = interactor;
        this.viewStateReducer = viewStateReducer;
        this.coroutineScope = coroutineScope;
        C13096w1 c13096w1M36592b = AbstractC13091v.m36592b(0, 0, null, 7);
        this.eventFlow = c13096w1M36592b;
        this.viewState = AbstractC13091v.m36586L(new c(AbstractC27845h.m83945a(new b(c13096w1M36592b, this), interactor), this), coroutineScope, C13105z1.f45288a, 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p */
    public final AbstractC18054a m59796p(InterfaceC21294i interfaceC21294i) {
        if (interfaceC21294i instanceof C21289d) {
            C21289d c21289d = (C21289d) interfaceC21294i;
            return new AbstractC18054a.a(c21289d.getPath(), c21289d.getScreenName());
        }
        if (!(interfaceC21294i instanceof C21292g)) {
            throw new NoWhenBranchMatchedException();
        }
        C21292g c21292g = (C21292g) interfaceC21294i;
        return new AbstractC18054a.b(c21292g.getUpdatePath(), c21292g.getScreenName());
    }

    /* JADX INFO: renamed from: n, reason: from getter */
    public final InterfaceC13087t1 getViewState() {
        return this.viewState;
    }

    /* JADX INFO: renamed from: o */
    public final void m59798o(InterfaceC21294i viewEvent) {
        AbstractC22676k.m65750j(viewEvent, "viewEvent");
        AbstractC3006f0.m8732z(this.coroutineScope, null, null, new a(viewEvent, null), 3);
    }

    public /* synthetic */ C21295j(C18056c c18056c, C22175a c22175a, InterfaceC2994c0 interfaceC2994c0, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(c18056c, c22175a, (i13 & 4) != 0 ? new C28180m(null, 1, null) : interfaceC2994c0);
    }
}
