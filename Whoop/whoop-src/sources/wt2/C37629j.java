package wt2;

import androidx.lifecycle.AbstractC1637w1;
import bc3.AbstractC3006f0;
import bc3.InterfaceC2994c0;
import bc3.InterfaceC3027k1;
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
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import tt2.AbstractC34166d;
import tt2.AbstractC34167e;
import tt2.C34168f;
import xt2.C38647a;

/* JADX INFO: renamed from: wt2.j */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\n0\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u001d\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001b0\u001a8\u0006¢\u0006\f\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f¨\u0006!"}, m65681d2 = {"Lwt2/j;", "Landroidx/lifecycle/w1;", "Ltt2/f;", "interactor", "Lxt2/a;", "reducer", "Lbc3/c0;", "coroutineScope", "<init>", "(Ltt2/f;Lxt2/a;Lbc3/c0;)V", "Lwt2/i;", "viewEvent", "Ltt2/d;", "p", "(Lwt2/i;)Ltt2/d;", "Lbc3/k1;", "o", "(Lwt2/i;)Lbc3/k1;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "Lxt2/a;", "x", "Lbc3/c0;", "Lec3/o1;", "y", "Lec3/o1;", "eventFlow", "Lec3/t1;", "Lwt2/k;", "z", "Lec3/t1;", "n", "()Lec3/t1;", "viewState", "weekly-plan_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C37629j extends AbstractC1637w1 {

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    private final C38647a reducer;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    private final InterfaceC2994c0 coroutineScope;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    private final InterfaceC13072o1 eventFlow;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    private final InterfaceC13087t1 viewState;

    /* JADX INFO: renamed from: wt2.j$a */
    /* JADX INFO: loaded from: classes11.dex */
    @InterfaceC32271e(m100429c = "com.whoop.weeklyplan.weeklyplan.presentation.SummaryV2ViewModel$sendViewEvent$1", m100430f = "SummaryV2ViewModel.kt", m100431l = {30}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f161024w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ AbstractC37628i f161026y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(AbstractC37628i abstractC37628i, InterfaceC30057d<? super a> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f161026y = abstractC37628i;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C37629j.this.new a(this.f161026y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f161024w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC13072o1 interfaceC13072o1 = C37629j.this.eventFlow;
                AbstractC37628i abstractC37628i = this.f161026y;
                this.f161024w = 1;
                if (interfaceC13072o1.emit(abstractC37628i, this) == enumC31071a) {
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

    /* JADX INFO: renamed from: wt2.j$b */
    /* JADX INFO: loaded from: classes11.dex */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f161027w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C37629j f161028x;

        /* JADX INFO: renamed from: wt2.j$b$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f161029w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C37629j f161030x;

            /* JADX INFO: renamed from: wt2.j$b$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.weeklyplan.weeklyplan.presentation.SummaryV2ViewModel$special$$inlined$map$1$2", m100430f = "SummaryV2ViewModel.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C42605a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f161031E;

                /* JADX INFO: renamed from: F */
                Object f161032F;

                /* JADX INFO: renamed from: G */
                Object f161033G;

                /* JADX INFO: renamed from: H */
                int f161034H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f161035w;

                /* JADX INFO: renamed from: x */
                int f161036x;

                /* JADX INFO: renamed from: y */
                Object f161037y;

                public C42605a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f161035w = obj;
                    this.f161036x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m, C37629j c37629j) {
                this.f161029w = interfaceC13062m;
                this.f161030x = c37629j;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C42605a c42605a;
                if (interfaceC30057d instanceof C42605a) {
                    c42605a = (C42605a) interfaceC30057d;
                    int i13 = c42605a.f161036x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c42605a.f161036x = i13 - Integer.MIN_VALUE;
                    } else {
                        c42605a = new C42605a(interfaceC30057d);
                    }
                } else {
                    c42605a = new C42605a(interfaceC30057d);
                }
                Object obj2 = c42605a.f161035w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c42605a.f161036x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f161029w;
                    AbstractC34166d abstractC34166dM120911p = this.f161030x.m120911p((AbstractC37628i) obj);
                    c42605a.f161037y = null;
                    c42605a.f161031E = null;
                    c42605a.f161032F = null;
                    c42605a.f161033G = null;
                    c42605a.f161034H = 0;
                    c42605a.f161036x = 1;
                    if (interfaceC13062m.emit(abstractC34166dM120911p, c42605a) == enumC31071a) {
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

        public b(InterfaceC13058l interfaceC13058l, C37629j c37629j) {
            this.f161027w = interfaceC13058l;
            this.f161028x = c37629j;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f161027w.collect(new a(interfaceC13062m, this.f161028x), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: wt2.j$c */
    /* JADX INFO: loaded from: classes11.dex */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f161039w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C37629j f161040x;

        /* JADX INFO: renamed from: wt2.j$c$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f161041w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C37629j f161042x;

            /* JADX INFO: renamed from: wt2.j$c$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.weeklyplan.weeklyplan.presentation.SummaryV2ViewModel$special$$inlined$map$2$2", m100430f = "SummaryV2ViewModel.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C42606a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f161043E;

                /* JADX INFO: renamed from: F */
                Object f161044F;

                /* JADX INFO: renamed from: G */
                Object f161045G;

                /* JADX INFO: renamed from: H */
                int f161046H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f161047w;

                /* JADX INFO: renamed from: x */
                int f161048x;

                /* JADX INFO: renamed from: y */
                Object f161049y;

                public C42606a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f161047w = obj;
                    this.f161048x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m, C37629j c37629j) {
                this.f161041w = interfaceC13062m;
                this.f161042x = c37629j;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C42606a c42606a;
                if (interfaceC30057d instanceof C42606a) {
                    c42606a = (C42606a) interfaceC30057d;
                    int i13 = c42606a.f161048x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c42606a.f161048x = i13 - Integer.MIN_VALUE;
                    } else {
                        c42606a = new C42606a(interfaceC30057d);
                    }
                } else {
                    c42606a = new C42606a(interfaceC30057d);
                }
                Object obj2 = c42606a.f161047w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c42606a.f161048x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f161041w;
                    AbstractC37630k abstractC37630kM123872a = this.f161042x.reducer.m123872a((AbstractC34167e) obj);
                    c42606a.f161049y = null;
                    c42606a.f161043E = null;
                    c42606a.f161044F = null;
                    c42606a.f161045G = null;
                    c42606a.f161046H = 0;
                    c42606a.f161048x = 1;
                    if (interfaceC13062m.emit(abstractC37630kM123872a, c42606a) == enumC31071a) {
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

        public c(InterfaceC13058l interfaceC13058l, C37629j c37629j) {
            this.f161039w = interfaceC13058l;
            this.f161040x = c37629j;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f161039w.collect(new a(interfaceC13062m, this.f161040x), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C37629j(C34168f interactor, C38647a reducer, InterfaceC2994c0 coroutineScope) {
        super(coroutineScope);
        AbstractC22676k.m65750j(interactor, "interactor");
        AbstractC22676k.m65750j(reducer, "reducer");
        AbstractC22676k.m65750j(coroutineScope, "coroutineScope");
        this.reducer = reducer;
        this.coroutineScope = coroutineScope;
        C13096w1 c13096w1M36592b = AbstractC13091v.m36592b(0, 0, null, 7);
        this.eventFlow = c13096w1M36592b;
        this.viewState = AbstractC13091v.m36586L(new c(AbstractC27845h.m83945a(new b(c13096w1M36592b, this), interactor), this), coroutineScope, C13105z1.f45288a, 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p */
    public final AbstractC34166d m120911p(AbstractC37628i viewEvent) {
        if (viewEvent instanceof AbstractC37628i.b) {
            return new AbstractC34166d.b(((AbstractC37628i.b) viewEvent).getPlanId());
        }
        if (viewEvent instanceof AbstractC37628i.a) {
            return new AbstractC34166d.a(((AbstractC37628i.a) viewEvent).getPlanId());
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: renamed from: n, reason: from getter */
    public final InterfaceC13087t1 getViewState() {
        return this.viewState;
    }

    /* JADX INFO: renamed from: o */
    public final InterfaceC3027k1 m120913o(AbstractC37628i viewEvent) {
        AbstractC22676k.m65750j(viewEvent, "viewEvent");
        return AbstractC3006f0.m8732z(this.coroutineScope, null, null, new a(viewEvent, null), 3);
    }

    public /* synthetic */ C37629j(C34168f c34168f, C38647a c38647a, InterfaceC2994c0 interfaceC2994c0, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(c34168f, c38647a, (i13 & 4) != 0 ? new C28180m(null, 1, null) : interfaceC2994c0);
    }
}
