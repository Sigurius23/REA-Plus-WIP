package qu1;

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
import nu1.AbstractC27138b;
import nu1.C27139c;
import nu1.C27140d;
import or2.C28180m;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import ru1.C31819b;
import s83.AbstractC32269c;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;

/* JADX INFO: renamed from: qu1.e */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\n*\b\u0012\u0004\u0012\u00020\u000b0\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0013\u0010\u0010\u001a\u00020\u000b*\u00020\u000fH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0014\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0015\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\u000f¢\u0006\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u001a\u0010#\u001a\b\u0012\u0004\u0012\u00020\u000f0 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u001d\u0010)\u001a\b\u0012\u0004\u0012\u00020$0\n8\u0006¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(¨\u0006*"}, m65681d2 = {"Lqu1/e;", "Landroidx/lifecycle/w1;", "Lnu1/d;", "interactor", "Lru1/b;", "reducer", "Lbc3/c0;", "coroutineScope", "<init>", "(Lnu1/d;Lru1/b;Lbc3/c0;)V", "Lec3/l;", "Lnu1/b;", "Lnu1/c;", "interact", "(Lec3/l;)Lec3/l;", "Lqu1/c$k;", "p", "(Lqu1/c$k;)Lnu1/b;", "Lqu1/c$e;", "detailsGraphingItemClicks", "n", "(Lqu1/c$e;)Lnu1/b;", NotificationCompat.CATEGORY_EVENT, "Ll83/a0;", "o", "(Lqu1/c$k;)V", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "Lnu1/d;", "x", "Lru1/b;", "y", "Lbc3/c0;", "Lec3/o1;", "z", "Lec3/o1;", "eventFlow", "Lqu1/f;", "E", "Lec3/l;", "getViewState", "()Lec3/l;", "viewState", "last-night-sleep_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C30629e extends AbstractC1637w1 {

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    private final InterfaceC13058l viewState;

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    private final C27140d interactor;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    private final C31819b reducer;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    private final InterfaceC2994c0 coroutineScope;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    private final InterfaceC13072o1 eventFlow;

    /* JADX INFO: renamed from: qu1.e$a */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.lastnightsleep.presentation.LastNightSleepViewModel$sendViewEvent$1", m100430f = "LastNightSleepViewModel.kt", m100431l = {33}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f125945w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC30627c.k f125947y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(InterfaceC30627c.k kVar, InterfaceC30057d<? super a> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f125947y = kVar;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C30629e.this.new a(this.f125947y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f125945w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC13072o1 interfaceC13072o1 = C30629e.this.eventFlow;
                InterfaceC30627c.k kVar = this.f125947y;
                this.f125945w = 1;
                if (interfaceC13072o1.emit(kVar, this) == enumC31071a) {
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

    /* JADX INFO: renamed from: qu1.e$b */
    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f125948w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C30629e f125949x;

        /* JADX INFO: renamed from: qu1.e$b$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f125950w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C30629e f125951x;

            /* JADX INFO: renamed from: qu1.e$b$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.lastnightsleep.presentation.LastNightSleepViewModel$special$$inlined$map$1$2", m100430f = "LastNightSleepViewModel.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C42239a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f125952E;

                /* JADX INFO: renamed from: F */
                Object f125953F;

                /* JADX INFO: renamed from: G */
                Object f125954G;

                /* JADX INFO: renamed from: H */
                int f125955H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f125956w;

                /* JADX INFO: renamed from: x */
                int f125957x;

                /* JADX INFO: renamed from: y */
                Object f125958y;

                public C42239a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f125956w = obj;
                    this.f125957x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m, C30629e c30629e) {
                this.f125950w = interfaceC13062m;
                this.f125951x = c30629e;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C42239a c42239a;
                if (interfaceC30057d instanceof C42239a) {
                    c42239a = (C42239a) interfaceC30057d;
                    int i13 = c42239a.f125957x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c42239a.f125957x = i13 - Integer.MIN_VALUE;
                    } else {
                        c42239a = new C42239a(interfaceC30057d);
                    }
                } else {
                    c42239a = new C42239a(interfaceC30057d);
                }
                Object obj2 = c42239a.f125956w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c42239a.f125957x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f125950w;
                    AbstractC27138b abstractC27138bM94046p = this.f125951x.m94046p((InterfaceC30627c.k) obj);
                    c42239a.f125958y = null;
                    c42239a.f125952E = null;
                    c42239a.f125953F = null;
                    c42239a.f125954G = null;
                    c42239a.f125955H = 0;
                    c42239a.f125957x = 1;
                    if (interfaceC13062m.emit(abstractC27138bM94046p, c42239a) == enumC31071a) {
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

        public b(InterfaceC13058l interfaceC13058l, C30629e c30629e) {
            this.f125948w = interfaceC13058l;
            this.f125949x = c30629e;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f125948w.collect(new a(interfaceC13062m, this.f125949x), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: qu1.e$c */
    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f125960w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C30629e f125961x;

        /* JADX INFO: renamed from: qu1.e$c$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f125962w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C30629e f125963x;

            /* JADX INFO: renamed from: qu1.e$c$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.lastnightsleep.presentation.LastNightSleepViewModel$special$$inlined$map$2$2", m100430f = "LastNightSleepViewModel.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C42240a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f125964E;

                /* JADX INFO: renamed from: F */
                Object f125965F;

                /* JADX INFO: renamed from: G */
                Object f125966G;

                /* JADX INFO: renamed from: H */
                int f125967H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f125968w;

                /* JADX INFO: renamed from: x */
                int f125969x;

                /* JADX INFO: renamed from: y */
                Object f125970y;

                public C42240a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f125968w = obj;
                    this.f125969x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m, C30629e c30629e) {
                this.f125962w = interfaceC13062m;
                this.f125963x = c30629e;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C42240a c42240a;
                if (interfaceC30057d instanceof C42240a) {
                    c42240a = (C42240a) interfaceC30057d;
                    int i13 = c42240a.f125969x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c42240a.f125969x = i13 - Integer.MIN_VALUE;
                    } else {
                        c42240a = new C42240a(interfaceC30057d);
                    }
                } else {
                    c42240a = new C42240a(interfaceC30057d);
                }
                Object obj2 = c42240a.f125968w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c42240a.f125969x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f125962w;
                    C30630f c30630fM98886b = this.f125963x.reducer.m98886b((C27139c) obj);
                    c42240a.f125970y = null;
                    c42240a.f125964E = null;
                    c42240a.f125965F = null;
                    c42240a.f125966G = null;
                    c42240a.f125967H = 0;
                    c42240a.f125969x = 1;
                    if (interfaceC13062m.emit(c30630fM98886b, c42240a) == enumC31071a) {
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

        public c(InterfaceC13058l interfaceC13058l, C30629e c30629e) {
            this.f125960w = interfaceC13058l;
            this.f125961x = c30629e;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f125960w.collect(new a(interfaceC13062m, this.f125961x), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30629e(C27140d interactor, C31819b reducer, InterfaceC2994c0 coroutineScope) {
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

    /* JADX INFO: renamed from: n */
    private final AbstractC27138b m94045n(InterfaceC30627c.e detailsGraphingItemClicks) {
        InterfaceC30626b cardEvent = detailsGraphingItemClicks.getCardEvent();
        if (cardEvent instanceof InterfaceC30626b.c) {
            InterfaceC30626b.c cVar = (InterfaceC30626b.c) cardEvent;
            return new AbstractC27138b.c(cVar.getComponentId(), cVar.getHeartZoneType());
        }
        if (!(cardEvent instanceof InterfaceC30626b.b)) {
            return AbstractC27138b.a.f108544a;
        }
        InterfaceC30626b.b bVar = (InterfaceC30626b.b) cardEvent;
        return new AbstractC27138b.b(bVar.getComponentId(), bVar.getValueDisplay(), bVar.getUnitDisplay(), bVar.getTimeDisplay(), bVar.getScrubColor());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p */
    public final AbstractC27138b m94046p(InterfaceC30627c.k kVar) {
        if (kVar instanceof InterfaceC30627c.j) {
            return new AbstractC27138b.d(((InterfaceC30627c.j) kVar).getPath());
        }
        if (kVar instanceof InterfaceC30627c.e) {
            return m94045n((InterfaceC30627c.e) kVar);
        }
        throw new NoWhenBranchMatchedException();
    }

    public final InterfaceC13058l getViewState() {
        return this.viewState;
    }

    /* JADX INFO: renamed from: o */
    public final void m94047o(InterfaceC30627c.k event) {
        AbstractC22676k.m65750j(event, "event");
        AbstractC3006f0.m8732z(this.coroutineScope, null, null, new a(event, null), 3);
    }

    public /* synthetic */ C30629e(C27140d c27140d, C31819b c31819b, InterfaceC2994c0 interfaceC2994c0, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(c27140d, c31819b, (i13 & 4) != 0 ? new C28180m(null, 1, null) : interfaceC2994c0);
    }
}
