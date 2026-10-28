package mr1;

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

/* JADX INFO: renamed from: mr1.k */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\n*\b\u0012\u0004\u0012\u00020\u000b0\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0013\u0010\u0010\u001a\u00020\u000b*\u00020\u000fH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u000f¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u001a\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u000f0\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u001d\u0010%\u001a\b\u0012\u0004\u0012\u00020 0\n8\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$¨\u0006&"}, m65681d2 = {"Lmr1/k;", "Landroidx/lifecycle/w1;", "Lmr1/f;", "interactor", "Lmr1/m;", "reducer", "Lbc3/c0;", "coroutineScope", "<init>", "(Lmr1/f;Lmr1/m;Lbc3/c0;)V", "Lec3/l;", "Lmr1/b;", "Lmr1/c;", "interact", "(Lec3/l;)Lec3/l;", "Lmr1/d$a;", "o", "(Lmr1/d$a;)Lmr1/b;", NotificationCompat.CATEGORY_EVENT, "Ll83/a0;", "n", "(Lmr1/d$a;)V", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "Lmr1/f;", "x", "Lmr1/m;", "y", "Lbc3/c0;", "Lec3/o1;", "z", "Lec3/o1;", "eventFlow", "Lmr1/l;", "E", "Lec3/l;", "getViewState", "()Lec3/l;", "viewState", "internal-tooling_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C25921k extends AbstractC1637w1 {

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    private final InterfaceC13058l viewState;

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    private final C25916f interactor;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    private final C25923m reducer;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    private final InterfaceC2994c0 coroutineScope;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    private final InterfaceC13072o1 eventFlow;

    /* JADX INFO: renamed from: mr1.k$a */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.internal.checkout.UniversalCheckoutDataFetchViewModel$sendViewEvent$1", m100430f = "UniversalCheckoutDataFetchViewModel.kt", m100431l = {32}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f102349w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ AbstractC25914d.a f102351y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(AbstractC25914d.a aVar, InterfaceC30057d<? super a> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f102351y = aVar;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C25921k.this.new a(this.f102351y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f102349w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC13072o1 interfaceC13072o1 = C25921k.this.eventFlow;
                AbstractC25914d.a aVar = this.f102351y;
                this.f102349w = 1;
                if (interfaceC13072o1.emit(aVar, this) == enumC31071a) {
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

    /* JADX INFO: renamed from: mr1.k$b */
    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f102352w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C25921k f102353x;

        /* JADX INFO: renamed from: mr1.k$b$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f102354w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C25921k f102355x;

            /* JADX INFO: renamed from: mr1.k$b$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.internal.checkout.UniversalCheckoutDataFetchViewModel$special$$inlined$map$1$2", m100430f = "UniversalCheckoutDataFetchViewModel.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C42025a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f102356E;

                /* JADX INFO: renamed from: F */
                Object f102357F;

                /* JADX INFO: renamed from: G */
                Object f102358G;

                /* JADX INFO: renamed from: H */
                int f102359H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f102360w;

                /* JADX INFO: renamed from: x */
                int f102361x;

                /* JADX INFO: renamed from: y */
                Object f102362y;

                public C42025a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f102360w = obj;
                    this.f102361x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m, C25921k c25921k) {
                this.f102354w = interfaceC13062m;
                this.f102355x = c25921k;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C42025a c42025a;
                if (interfaceC30057d instanceof C42025a) {
                    c42025a = (C42025a) interfaceC30057d;
                    int i13 = c42025a.f102361x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c42025a.f102361x = i13 - Integer.MIN_VALUE;
                    } else {
                        c42025a = new C42025a(interfaceC30057d);
                    }
                } else {
                    c42025a = new C42025a(interfaceC30057d);
                }
                Object obj2 = c42025a.f102360w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c42025a.f102361x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f102354w;
                    AbstractC25912b abstractC25912bM76673o = this.f102355x.m76673o((AbstractC25914d.a) obj);
                    c42025a.f102362y = null;
                    c42025a.f102356E = null;
                    c42025a.f102357F = null;
                    c42025a.f102358G = null;
                    c42025a.f102359H = 0;
                    c42025a.f102361x = 1;
                    if (interfaceC13062m.emit(abstractC25912bM76673o, c42025a) == enumC31071a) {
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

        public b(InterfaceC13058l interfaceC13058l, C25921k c25921k) {
            this.f102352w = interfaceC13058l;
            this.f102353x = c25921k;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f102352w.collect(new a(interfaceC13062m, this.f102353x), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: mr1.k$c */
    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f102364w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C25921k f102365x;

        /* JADX INFO: renamed from: mr1.k$c$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f102366w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C25921k f102367x;

            /* JADX INFO: renamed from: mr1.k$c$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.internal.checkout.UniversalCheckoutDataFetchViewModel$special$$inlined$map$2$2", m100430f = "UniversalCheckoutDataFetchViewModel.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C42026a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f102368E;

                /* JADX INFO: renamed from: F */
                Object f102369F;

                /* JADX INFO: renamed from: G */
                Object f102370G;

                /* JADX INFO: renamed from: H */
                int f102371H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f102372w;

                /* JADX INFO: renamed from: x */
                int f102373x;

                /* JADX INFO: renamed from: y */
                Object f102374y;

                public C42026a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f102372w = obj;
                    this.f102373x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m, C25921k c25921k) {
                this.f102366w = interfaceC13062m;
                this.f102367x = c25921k;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C42026a c42026a;
                if (interfaceC30057d instanceof C42026a) {
                    c42026a = (C42026a) interfaceC30057d;
                    int i13 = c42026a.f102373x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c42026a.f102373x = i13 - Integer.MIN_VALUE;
                    } else {
                        c42026a = new C42026a(interfaceC30057d);
                    }
                } else {
                    c42026a = new C42026a(interfaceC30057d);
                }
                Object obj2 = c42026a.f102372w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c42026a.f102373x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f102366w;
                    C25922l c25922lM76682c = this.f102367x.reducer.m76682c((C25913c) obj);
                    c42026a.f102374y = null;
                    c42026a.f102368E = null;
                    c42026a.f102369F = null;
                    c42026a.f102370G = null;
                    c42026a.f102371H = 0;
                    c42026a.f102373x = 1;
                    if (interfaceC13062m.emit(c25922lM76682c, c42026a) == enumC31071a) {
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

        public c(InterfaceC13058l interfaceC13058l, C25921k c25921k) {
            this.f102364w = interfaceC13058l;
            this.f102365x = c25921k;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f102364w.collect(new a(interfaceC13062m, this.f102365x), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C25921k(C25916f interactor, C25923m reducer, InterfaceC2994c0 coroutineScope) {
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
    public final AbstractC25912b m76673o(AbstractC25914d.a aVar) {
        if (aVar instanceof AbstractC25914d.a.C42022a) {
            return AbstractC25912b.a.f102290a;
        }
        if (aVar instanceof AbstractC25914d.a.b) {
            return AbstractC25912b.b.f102291a;
        }
        if (aVar instanceof AbstractC25914d.a.c) {
            return AbstractC25912b.c.f102292a;
        }
        throw new NoWhenBranchMatchedException();
    }

    public final InterfaceC13058l getViewState() {
        return this.viewState;
    }

    /* JADX INFO: renamed from: n */
    public final void m76674n(AbstractC25914d.a event) {
        AbstractC22676k.m65750j(event, "event");
        AbstractC3006f0.m8732z(this.coroutineScope, null, null, new a(event, null), 3);
    }

    public /* synthetic */ C25921k(C25916f c25916f, C25923m c25923m, InterfaceC2994c0 interfaceC2994c0, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(c25916f, c25923m, (i13 & 4) != 0 ? new C28180m(null, 1, null) : interfaceC2994c0);
    }
}
