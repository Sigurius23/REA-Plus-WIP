package pm1;

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
import om1.AbstractC28036j;
import om1.C28037k;
import om1.C28038l;
import or2.C28180m;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.InterfaceC30057d;
import qm1.C30480b;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;

/* JADX INFO: renamed from: pm1.c */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\n*\b\u0012\u0004\u0012\u00020\u000b0\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0013\u0010\u0010\u001a\u00020\u000b*\u00020\u000fH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u000f¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u001a\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u000f0\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u001d\u0010%\u001a\b\u0012\u0004\u0012\u00020 0\n8\u0006¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$¨\u0006&"}, m65681d2 = {"Lpm1/c;", "Landroidx/lifecycle/w1;", "Lom1/l;", "interactor", "Lpm1/d;", "reducer", "Lbc3/c0;", "coroutineScope", "<init>", "(Lom1/l;Lpm1/d;Lbc3/c0;)V", "Lec3/l;", "Lom1/j;", "Lom1/k;", "interact", "(Lec3/l;)Lec3/l;", "Lpm1/b;", "o", "(Lpm1/b;)Lom1/j;", NotificationCompat.CATEGORY_EVENT, "Ll83/a0;", "n", "(Lpm1/b;)V", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "Lom1/l;", "x", "Lpm1/d;", "y", "Lbc3/c0;", "Lec3/o1;", "z", "Lec3/o1;", "eventFlow", "Lqm1/b;", "E", "Lec3/l;", "getViewState", "()Lec3/l;", "viewState", "home_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C29358c extends AbstractC1637w1 {

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    private final InterfaceC13058l viewState;

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    private final C28038l interactor;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    private final C29359d reducer;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    private final InterfaceC2994c0 coroutineScope;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    private final InterfaceC13072o1 eventFlow;

    /* JADX INFO: renamed from: pm1.c$a */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.home.view.dayZeroNotificationCards.presentation.DayZeroNotificationCardsViewModel$sendViewEvent$1", m100430f = "DayZeroNotificationCardsViewModel.kt", m100431l = {33}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f119008w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC29357b f119010y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(InterfaceC29357b interfaceC29357b, InterfaceC30057d<? super a> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f119010y = interfaceC29357b;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C29358c.this.new a(this.f119010y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f119008w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC13072o1 interfaceC13072o1 = C29358c.this.eventFlow;
                InterfaceC29357b interfaceC29357b = this.f119010y;
                this.f119008w = 1;
                if (interfaceC13072o1.emit(interfaceC29357b, this) == enumC31071a) {
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

    /* JADX INFO: renamed from: pm1.c$b */
    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f119011w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C29358c f119012x;

        /* JADX INFO: renamed from: pm1.c$b$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f119013w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C29358c f119014x;

            /* JADX INFO: renamed from: pm1.c$b$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.home.view.dayZeroNotificationCards.presentation.DayZeroNotificationCardsViewModel$special$$inlined$map$1$2", m100430f = "DayZeroNotificationCardsViewModel.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C42174a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f119015E;

                /* JADX INFO: renamed from: F */
                Object f119016F;

                /* JADX INFO: renamed from: G */
                Object f119017G;

                /* JADX INFO: renamed from: H */
                int f119018H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f119019w;

                /* JADX INFO: renamed from: x */
                int f119020x;

                /* JADX INFO: renamed from: y */
                Object f119021y;

                public C42174a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f119019w = obj;
                    this.f119020x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m, C29358c c29358c) {
                this.f119013w = interfaceC13062m;
                this.f119014x = c29358c;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C42174a c42174a;
                if (interfaceC30057d instanceof C42174a) {
                    c42174a = (C42174a) interfaceC30057d;
                    int i13 = c42174a.f119020x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c42174a.f119020x = i13 - Integer.MIN_VALUE;
                    } else {
                        c42174a = new C42174a(interfaceC30057d);
                    }
                } else {
                    c42174a = new C42174a(interfaceC30057d);
                }
                Object obj2 = c42174a.f119019w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c42174a.f119020x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f119013w;
                    AbstractC28036j abstractC28036jM89468o = this.f119014x.m89468o((InterfaceC29357b) obj);
                    c42174a.f119021y = null;
                    c42174a.f119015E = null;
                    c42174a.f119016F = null;
                    c42174a.f119017G = null;
                    c42174a.f119018H = 0;
                    c42174a.f119020x = 1;
                    if (interfaceC13062m.emit(abstractC28036jM89468o, c42174a) == enumC31071a) {
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

        public b(InterfaceC13058l interfaceC13058l, C29358c c29358c) {
            this.f119011w = interfaceC13058l;
            this.f119012x = c29358c;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f119011w.collect(new a(interfaceC13062m, this.f119012x), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: pm1.c$c */
    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f119023w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C29358c f119024x;

        /* JADX INFO: renamed from: pm1.c$c$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f119025w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C29358c f119026x;

            /* JADX INFO: renamed from: pm1.c$c$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.home.view.dayZeroNotificationCards.presentation.DayZeroNotificationCardsViewModel$special$$inlined$map$2$2", m100430f = "DayZeroNotificationCardsViewModel.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C42175a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f119027E;

                /* JADX INFO: renamed from: F */
                Object f119028F;

                /* JADX INFO: renamed from: G */
                Object f119029G;

                /* JADX INFO: renamed from: H */
                int f119030H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f119031w;

                /* JADX INFO: renamed from: x */
                int f119032x;

                /* JADX INFO: renamed from: y */
                Object f119033y;

                public C42175a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f119031w = obj;
                    this.f119032x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m, C29358c c29358c) {
                this.f119025w = interfaceC13062m;
                this.f119026x = c29358c;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C42175a c42175a;
                if (interfaceC30057d instanceof C42175a) {
                    c42175a = (C42175a) interfaceC30057d;
                    int i13 = c42175a.f119032x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c42175a.f119032x = i13 - Integer.MIN_VALUE;
                    } else {
                        c42175a = new C42175a(interfaceC30057d);
                    }
                } else {
                    c42175a = new C42175a(interfaceC30057d);
                }
                Object obj2 = c42175a.f119031w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c42175a.f119032x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f119025w;
                    C30480b c30480bM89471a = this.f119026x.reducer.m89471a((C28037k) obj);
                    c42175a.f119033y = null;
                    c42175a.f119027E = null;
                    c42175a.f119028F = null;
                    c42175a.f119029G = null;
                    c42175a.f119030H = 0;
                    c42175a.f119032x = 1;
                    if (interfaceC13062m.emit(c30480bM89471a, c42175a) == enumC31071a) {
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

        public c(InterfaceC13058l interfaceC13058l, C29358c c29358c) {
            this.f119023w = interfaceC13058l;
            this.f119024x = c29358c;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f119023w.collect(new a(interfaceC13062m, this.f119024x), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C29358c(C28038l interactor, C29359d reducer, InterfaceC2994c0 coroutineScope) {
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
    public final AbstractC28036j m89468o(InterfaceC29357b interfaceC29357b) {
        if (!(interfaceC29357b instanceof C29356a)) {
            throw new NoWhenBranchMatchedException();
        }
        C29356a c29356a = (C29356a) interfaceC29357b;
        return new AbstractC28036j.a(c29356a.getViewState(), null, c29356a.getRegisterCompletion(), 2, null);
    }

    public final InterfaceC13058l getViewState() {
        return this.viewState;
    }

    /* JADX INFO: renamed from: n */
    public final void m89469n(InterfaceC29357b event) {
        AbstractC22676k.m65750j(event, "event");
        AbstractC3006f0.m8732z(this.coroutineScope, null, null, new a(event, null), 3);
    }

    public /* synthetic */ C29358c(C28038l c28038l, C29359d c29359d, InterfaceC2994c0 interfaceC2994c0, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(c28038l, c29359d, (i13 & 4) != 0 ? new C28180m(null, 1, null) : interfaceC2994c0);
    }
}
