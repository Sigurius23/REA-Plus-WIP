package vp2;

import androidx.core.app.NotificationCompat;
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
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
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
import sp2.AbstractC32874b;
import sp2.C32875c;
import sp2.C32876d;
import wp2.C37500a;

/* JADX INFO: renamed from: vp2.b */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\n*\b\u0012\u0004\u0012\u00020\u000b0\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0013\u0010\u0010\u001a\u00020\u000b*\u00020\u000fH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u000f¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u001a\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u000f0\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u001d\u0010%\u001a\b\u0012\u0004\u0012\u00020 0\n8\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$¨\u0006&"}, m65681d2 = {"Lvp2/b;", "Landroidx/lifecycle/w1;", "Lsp2/d;", "interactor", "Lwp2/a;", "reducer", "Lbc3/c0;", "coroutineScope", "<init>", "(Lsp2/d;Lwp2/a;Lbc3/c0;)V", "Lec3/l;", "Lsp2/b;", "Lsp2/c;", "interact", "(Lec3/l;)Lec3/l;", "Lvp2/a$l;", "o", "(Lvp2/a$l;)Lsp2/b;", NotificationCompat.CATEGORY_EVENT, "Ll83/a0;", "n", "(Lvp2/a$l;)V", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "Lsp2/d;", "x", "Lwp2/a;", "y", "Lbc3/c0;", "Lec3/o1;", "z", "Lec3/o1;", "eventFlow", "Lvp2/c;", "E", "Lec3/l;", "getViewState", "()Lec3/l;", "viewState", "universal-checkout_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C36275b extends AbstractC1637w1 {

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    private final InterfaceC13058l viewState;

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    private final C32876d interactor;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    private final C37500a reducer;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    private final InterfaceC2994c0 coroutineScope;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    private final InterfaceC13072o1 eventFlow;

    /* JADX INFO: renamed from: vp2.b$a */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.universalcheckout.features.shippingmethod.presentation.ShippingMethodViewModel$sendViewEvent$1", m100430f = "ShippingMethodViewModel.kt", m100431l = {33}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f155454w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC36274a.l f155456y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(InterfaceC36274a.l lVar, InterfaceC30057d<? super a> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f155456y = lVar;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C36275b.this.new a(this.f155456y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f155454w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC13072o1 interfaceC13072o1 = C36275b.this.eventFlow;
                InterfaceC36274a.l lVar = this.f155456y;
                this.f155454w = 1;
                if (interfaceC13072o1.emit(lVar, this) == enumC31071a) {
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

    /* JADX INFO: renamed from: vp2.b$b */
    /* JADX INFO: loaded from: classes10.dex */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f155457w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C36275b f155458x;

        /* JADX INFO: renamed from: vp2.b$b$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f155459w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C36275b f155460x;

            /* JADX INFO: renamed from: vp2.b$b$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.universalcheckout.features.shippingmethod.presentation.ShippingMethodViewModel$special$$inlined$map$1$2", m100430f = "ShippingMethodViewModel.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C42560a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f155461E;

                /* JADX INFO: renamed from: F */
                Object f155462F;

                /* JADX INFO: renamed from: G */
                Object f155463G;

                /* JADX INFO: renamed from: H */
                int f155464H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f155465w;

                /* JADX INFO: renamed from: x */
                int f155466x;

                /* JADX INFO: renamed from: y */
                Object f155467y;

                public C42560a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f155465w = obj;
                    this.f155466x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m, C36275b c36275b) {
                this.f155459w = interfaceC13062m;
                this.f155460x = c36275b;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C42560a c42560a;
                if (interfaceC30057d instanceof C42560a) {
                    c42560a = (C42560a) interfaceC30057d;
                    int i13 = c42560a.f155466x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c42560a.f155466x = i13 - Integer.MIN_VALUE;
                    } else {
                        c42560a = new C42560a(interfaceC30057d);
                    }
                } else {
                    c42560a = new C42560a(interfaceC30057d);
                }
                Object obj2 = c42560a.f155465w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c42560a.f155466x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f155459w;
                    AbstractC32874b abstractC32874bM115948o = this.f155460x.m115948o((InterfaceC36274a.l) obj);
                    c42560a.f155467y = null;
                    c42560a.f155461E = null;
                    c42560a.f155462F = null;
                    c42560a.f155463G = null;
                    c42560a.f155464H = 0;
                    c42560a.f155466x = 1;
                    if (interfaceC13062m.emit(abstractC32874bM115948o, c42560a) == enumC31071a) {
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

        public b(InterfaceC13058l interfaceC13058l, C36275b c36275b) {
            this.f155457w = interfaceC13058l;
            this.f155458x = c36275b;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f155457w.collect(new a(interfaceC13062m, this.f155458x), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: vp2.b$c */
    /* JADX INFO: loaded from: classes10.dex */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f155469w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C36275b f155470x;

        /* JADX INFO: renamed from: vp2.b$c$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f155471w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C36275b f155472x;

            /* JADX INFO: renamed from: vp2.b$c$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.universalcheckout.features.shippingmethod.presentation.ShippingMethodViewModel$special$$inlined$map$2$2", m100430f = "ShippingMethodViewModel.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C42561a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f155473E;

                /* JADX INFO: renamed from: F */
                Object f155474F;

                /* JADX INFO: renamed from: G */
                Object f155475G;

                /* JADX INFO: renamed from: H */
                int f155476H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f155477w;

                /* JADX INFO: renamed from: x */
                int f155478x;

                /* JADX INFO: renamed from: y */
                Object f155479y;

                public C42561a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f155477w = obj;
                    this.f155478x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m, C36275b c36275b) {
                this.f155471w = interfaceC13062m;
                this.f155472x = c36275b;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C42561a c42561a;
                if (interfaceC30057d instanceof C42561a) {
                    c42561a = (C42561a) interfaceC30057d;
                    int i13 = c42561a.f155478x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c42561a.f155478x = i13 - Integer.MIN_VALUE;
                    } else {
                        c42561a = new C42561a(interfaceC30057d);
                    }
                } else {
                    c42561a = new C42561a(interfaceC30057d);
                }
                Object obj2 = c42561a.f155477w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c42561a.f155478x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f155471w;
                    C36276c c36276cM120201a = this.f155472x.reducer.m120201a((C32875c) obj);
                    c42561a.f155479y = null;
                    c42561a.f155473E = null;
                    c42561a.f155474F = null;
                    c42561a.f155475G = null;
                    c42561a.f155476H = 0;
                    c42561a.f155478x = 1;
                    if (interfaceC13062m.emit(c36276cM120201a, c42561a) == enumC31071a) {
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

        public c(InterfaceC13058l interfaceC13058l, C36275b c36275b) {
            this.f155469w = interfaceC13058l;
            this.f155470x = c36275b;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f155469w.collect(new a(interfaceC13062m, this.f155470x), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C36275b(C32876d interactor, C37500a reducer, InterfaceC2994c0 coroutineScope) {
        super(coroutineScope);
        AbstractC22676k.m65750j(interactor, "interactor");
        AbstractC22676k.m65750j(reducer, "reducer");
        AbstractC22676k.m65750j(coroutineScope, "coroutineScope");
        this.interactor = interactor;
        this.reducer = reducer;
        this.coroutineScope = coroutineScope;
        C13096w1 c13096w1M36592b = AbstractC13091v.m36592b(0, 0, null, 7);
        this.eventFlow = c13096w1M36592b;
        this.viewState = AbstractC13091v.m36586L(new c(interact(new b(c13096w1M36592b, this)), this), coroutineScope, C13105z1.f45288a, 1);
    }

    private final InterfaceC13058l interact(InterfaceC13058l interfaceC13058l) {
        return this.interactor.interact(interfaceC13058l);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o */
    public final AbstractC32874b m115948o(InterfaceC36274a.l lVar) {
        if (lVar instanceof InterfaceC36274a.h) {
            InterfaceC36274a.h hVar = (InterfaceC36274a.h) lVar;
            return new AbstractC32874b.a(hVar.getCartId(), hVar.getSource());
        }
        if (lVar instanceof InterfaceC36274a.i) {
            return new AbstractC32874b.b(((InterfaceC36274a.i) lVar).getShippingMethodId());
        }
        if (!(lVar instanceof InterfaceC36274a.k)) {
            throw new NoWhenBranchMatchedException();
        }
        InterfaceC36274a.k kVar = (InterfaceC36274a.k) lVar;
        return new AbstractC32874b.c(kVar.getCartId(), kVar.getShippingMethodId());
    }

    public final InterfaceC13058l getViewState() {
        return this.viewState;
    }

    /* JADX INFO: renamed from: n */
    public final void m115949n(InterfaceC36274a.l event) {
        AbstractC22676k.m65750j(event, "event");
        AbstractC3006f0.m8732z(this.coroutineScope, null, null, new a(event, null), 3);
    }

    public /* synthetic */ C36275b(C32876d c32876d, C37500a c37500a, InterfaceC2994c0 interfaceC2994c0, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(c32876d, c37500a, (i13 & 4) != 0 ? new C28180m(null, 1, null) : interfaceC2994c0);
    }
}
