package vh0;

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
import sh0.AbstractC32500b;
import sh0.C32501c;
import sh0.InterfaceC32499a;

/* JADX INFO: renamed from: vh0.b */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000N\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B!\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0015\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\r\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\n0\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u001a\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u001a\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001e0\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u001cR\u001d\u0010%\u001a\b\u0012\u0004\u0012\u00020!0\u00198\u0006¢\u0006\f\n\u0004\b\"\u0010\u001c\u001a\u0004\b#\u0010$¨\u0006&"}, m65681d2 = {"Lvh0/b;", "Landroidx/lifecycle/w1;", "Lbc3/c0;", "coroutineScope", "Lsh0/c;", "interactor", "Lvh0/d;", "reducer", "<init>", "(Lbc3/c0;Lsh0/c;Lvh0/d;)V", "Lvh0/a;", "viewEvent", "Ll83/a0;", "l", "(Lvh0/a;)V", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "Lbc3/c0;", "x", "Lsh0/c;", "y", "Lvh0/d;", "Lec3/o1;", "z", "Lec3/o1;", "eventFlow", "Lec3/l;", "Lsh0/a;", "E", "Lec3/l;", "domainActionFlow", "Lsh0/b;", "F", "domainResultFlow", "Lvh0/c;", "G", "getViewState", "()Lec3/l;", "viewState", "ai-insights_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C36041b extends AbstractC1637w1 {

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    private final InterfaceC13058l domainActionFlow;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    private final InterfaceC13058l domainResultFlow;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    private final InterfaceC13058l viewState;

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    private final InterfaceC2994c0 coroutineScope;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    private final C32501c interactor;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    private final C36043d reducer;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    private final InterfaceC13072o1 eventFlow;

    /* JADX INFO: renamed from: vh0.b$a */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.aiinsights.presentation.AiInsightsViewModel$sendViewEvent$1", m100430f = "AiInsightsViewModel.kt", m100431l = {41}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f153747w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC36040a f153749y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(InterfaceC36040a interfaceC36040a, InterfaceC30057d<? super a> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f153749y = interfaceC36040a;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C36041b.this.new a(this.f153749y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f153747w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC13072o1 interfaceC13072o1 = C36041b.this.eventFlow;
                InterfaceC36040a interfaceC36040a = this.f153749y;
                this.f153747w = 1;
                if (interfaceC13072o1.emit(interfaceC36040a, this) == enumC31071a) {
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

    /* JADX INFO: renamed from: vh0.b$b */
    /* JADX INFO: loaded from: classes7.dex */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f153750w;

        /* JADX INFO: renamed from: vh0.b$b$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f153751w;

            /* JADX INFO: renamed from: vh0.b$b$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.aiinsights.presentation.AiInsightsViewModel$special$$inlined$map$1$2", m100430f = "AiInsightsViewModel.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C42540a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f153752E;

                /* JADX INFO: renamed from: F */
                Object f153753F;

                /* JADX INFO: renamed from: G */
                Object f153754G;

                /* JADX INFO: renamed from: H */
                int f153755H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f153756w;

                /* JADX INFO: renamed from: x */
                int f153757x;

                /* JADX INFO: renamed from: y */
                Object f153758y;

                public C42540a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f153756w = obj;
                    this.f153757x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m) {
                this.f153751w = interfaceC13062m;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C42540a c42540a;
                Object bVar;
                if (interfaceC30057d instanceof C42540a) {
                    c42540a = (C42540a) interfaceC30057d;
                    int i13 = c42540a.f153757x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c42540a.f153757x = i13 - Integer.MIN_VALUE;
                    } else {
                        c42540a = new C42540a(interfaceC30057d);
                    }
                } else {
                    c42540a = new C42540a(interfaceC30057d);
                }
                Object obj2 = c42540a.f153756w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c42540a.f153757x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f153751w;
                    InterfaceC36040a interfaceC36040a = (InterfaceC36040a) obj;
                    if (interfaceC36040a instanceof InterfaceC36040a.b) {
                        InterfaceC36040a.b bVar2 = (InterfaceC36040a.b) interfaceC36040a;
                        bVar = new InterfaceC32499a.b(bVar2.getSourceId(), bVar2.getSourceContextType());
                    } else {
                        if (!(interfaceC36040a instanceof InterfaceC36040a.a)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        bVar = InterfaceC32499a.a.f134551a;
                    }
                    c42540a.f153758y = null;
                    c42540a.f153752E = null;
                    c42540a.f153753F = null;
                    c42540a.f153754G = null;
                    c42540a.f153755H = 0;
                    c42540a.f153757x = 1;
                    if (interfaceC13062m.emit(bVar, c42540a) == enumC31071a) {
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

        public b(InterfaceC13058l interfaceC13058l) {
            this.f153750w = interfaceC13058l;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f153750w.collect(new a(interfaceC13062m), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: vh0.b$c */
    /* JADX INFO: loaded from: classes7.dex */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f153760w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C36041b f153761x;

        /* JADX INFO: renamed from: vh0.b$c$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f153762w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C36041b f153763x;

            /* JADX INFO: renamed from: vh0.b$c$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.aiinsights.presentation.AiInsightsViewModel$special$$inlined$map$2$2", m100430f = "AiInsightsViewModel.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C42541a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f153764E;

                /* JADX INFO: renamed from: F */
                Object f153765F;

                /* JADX INFO: renamed from: G */
                Object f153766G;

                /* JADX INFO: renamed from: H */
                int f153767H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f153768w;

                /* JADX INFO: renamed from: x */
                int f153769x;

                /* JADX INFO: renamed from: y */
                Object f153770y;

                public C42541a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f153768w = obj;
                    this.f153769x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m, C36041b c36041b) {
                this.f153762w = interfaceC13062m;
                this.f153763x = c36041b;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C42541a c42541a;
                if (interfaceC30057d instanceof C42541a) {
                    c42541a = (C42541a) interfaceC30057d;
                    int i13 = c42541a.f153769x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c42541a.f153769x = i13 - Integer.MIN_VALUE;
                    } else {
                        c42541a = new C42541a(interfaceC30057d);
                    }
                } else {
                    c42541a = new C42541a(interfaceC30057d);
                }
                Object obj2 = c42541a.f153768w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c42541a.f153769x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f153762w;
                    AbstractC36042c abstractC36042cM114417a = this.f153763x.reducer.m114417a((AbstractC32500b) obj);
                    c42541a.f153770y = null;
                    c42541a.f153764E = null;
                    c42541a.f153765F = null;
                    c42541a.f153766G = null;
                    c42541a.f153767H = 0;
                    c42541a.f153769x = 1;
                    if (interfaceC13062m.emit(abstractC36042cM114417a, c42541a) == enumC31071a) {
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

        public c(InterfaceC13058l interfaceC13058l, C36041b c36041b) {
            this.f153760w = interfaceC13058l;
            this.f153761x = c36041b;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f153760w.collect(new a(interfaceC13062m, this.f153761x), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C36041b(InterfaceC2994c0 coroutineScope, C32501c interactor, C36043d reducer) {
        super(coroutineScope);
        AbstractC22676k.m65750j(coroutineScope, "coroutineScope");
        AbstractC22676k.m65750j(interactor, "interactor");
        AbstractC22676k.m65750j(reducer, "reducer");
        this.coroutineScope = coroutineScope;
        this.interactor = interactor;
        this.reducer = reducer;
        C13096w1 c13096w1M36592b = AbstractC13091v.m36592b(0, 0, null, 7);
        this.eventFlow = c13096w1M36592b;
        b bVar = new b(c13096w1M36592b);
        this.domainActionFlow = bVar;
        InterfaceC13058l interfaceC13058lInteract = interactor.interact(bVar);
        this.domainResultFlow = interfaceC13058lInteract;
        this.viewState = AbstractC13091v.m36586L(new c(interfaceC13058lInteract, this), coroutineScope, C13105z1.f45288a, 1);
    }

    public final InterfaceC13058l getViewState() {
        return this.viewState;
    }

    /* JADX INFO: renamed from: l */
    public final void m114406l(InterfaceC36040a viewEvent) {
        AbstractC22676k.m65750j(viewEvent, "viewEvent");
        AbstractC3006f0.m8732z(this.coroutineScope, null, null, new a(viewEvent, null), 3);
    }

    public /* synthetic */ C36041b(InterfaceC2994c0 interfaceC2994c0, C32501c c32501c, C36043d c36043d, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? new C28180m(null, 1, null) : interfaceC2994c0, c32501c, c36043d);
    }
}
