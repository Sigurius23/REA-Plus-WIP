package com.whoop.achievements.celebration;

import androidx.core.app.NotificationCompat;
import androidx.lifecycle.AbstractC1637w1;
import bc3.AbstractC3006f0;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4351m;
import ec3.AbstractC13091v;
import ec3.C13021b2;
import ec3.C13078q1;
import ec3.C13096w1;
import ec3.C13105z1;
import ec3.InterfaceC13058l;
import ec3.InterfaceC13062m;
import ec3.InterfaceC13072o1;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import l83.C23454a0;
import n60.AbstractC26403a;
import n60.AbstractC26404b;
import n60.C26405c;
import or2.C28180m;
import p505ts.AbstractC34132o;
import p60.C28937a;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;

/* JADX INFO: renamed from: com.whoop.achievements.celebration.c */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u001f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\n*\b\u0012\u0004\u0012\u00020\u000b0\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0013\u0010\u0010\u001a\u00020\u000b*\u00020\u000fH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u000f¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u001a\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u000f0\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u001a\u0010\"\u001a\b\u0012\u0004\u0012\u00020\f0\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u001d\u0010'\u001a\b\u0012\u0004\u0012\u00020#0\n8\u0006¢\u0006\f\n\u0004\b$\u0010!\u001a\u0004\b%\u0010&¨\u0006("}, m65681d2 = {"Lcom/whoop/achievements/celebration/c;", "Landroidx/lifecycle/w1;", "Ln60/c;", "interactor", "Lp60/a;", "reducer", "Lbc3/c0;", "coroutineScope", "<init>", "(Ln60/c;Lp60/a;Lbc3/c0;)V", "Lec3/l;", "Ln60/a;", "Ln60/b;", "interact", "(Lec3/l;)Lec3/l;", "Lcom/whoop/achievements/celebration/b$d;", "o", "(Lcom/whoop/achievements/celebration/b$d;)Ln60/a;", NotificationCompat.CATEGORY_EVENT, "Ll83/a0;", "n", "(Lcom/whoop/achievements/celebration/b$d;)V", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "Ln60/c;", "x", "Lp60/a;", "y", "Lbc3/c0;", "Lec3/o1;", "z", "Lec3/o1;", "eventFlow", "E", "Lec3/l;", "domainState", "Lcom/whoop/achievements/celebration/d;", "F", "getViewState", "()Lec3/l;", "viewState", "achievements_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C5738c extends AbstractC1637w1 {

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    private final InterfaceC13058l domainState;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    private final InterfaceC13058l viewState;

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    private final C26405c interactor;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    private final C28937a reducer;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    private final InterfaceC2994c0 coroutineScope;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    private final InterfaceC13072o1 eventFlow;

    /* JADX INFO: renamed from: com.whoop.achievements.celebration.c$a */
    /* JADX INFO: loaded from: classes6.dex */
    @InterfaceC32271e(m100429c = "com.whoop.achievements.celebration.AchievementCelebrationViewModel$sendViewEvent$1", m100430f = "AchievementCelebrationViewModel.kt", m100431l = {37}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f22702w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC5737b.d f22704y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(InterfaceC5737b.d dVar, InterfaceC30057d<? super a> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f22704y = dVar;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C5738c.this.new a(this.f22704y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f22702w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC13072o1 interfaceC13072o1 = C5738c.this.eventFlow;
                InterfaceC5737b.d dVar = this.f22704y;
                this.f22702w = 1;
                if (interfaceC13072o1.emit(dVar, this) == enumC31071a) {
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

    /* JADX INFO: renamed from: com.whoop.achievements.celebration.c$b */
    /* JADX INFO: loaded from: classes6.dex */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f22705w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C5738c f22706x;

        /* JADX INFO: renamed from: com.whoop.achievements.celebration.c$b$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f22707w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C5738c f22708x;

            /* JADX INFO: renamed from: com.whoop.achievements.celebration.c$b$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.achievements.celebration.AchievementCelebrationViewModel$special$$inlined$map$1$2", m100430f = "AchievementCelebrationViewModel.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C41367a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f22709E;

                /* JADX INFO: renamed from: F */
                Object f22710F;

                /* JADX INFO: renamed from: G */
                Object f22711G;

                /* JADX INFO: renamed from: H */
                int f22712H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f22713w;

                /* JADX INFO: renamed from: x */
                int f22714x;

                /* JADX INFO: renamed from: y */
                Object f22715y;

                public C41367a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f22713w = obj;
                    this.f22714x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m, C5738c c5738c) {
                this.f22707w = interfaceC13062m;
                this.f22708x = c5738c;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C41367a c41367a;
                if (interfaceC30057d instanceof C41367a) {
                    c41367a = (C41367a) interfaceC30057d;
                    int i13 = c41367a.f22714x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c41367a.f22714x = i13 - Integer.MIN_VALUE;
                    } else {
                        c41367a = new C41367a(interfaceC30057d);
                    }
                } else {
                    c41367a = new C41367a(interfaceC30057d);
                }
                Object obj2 = c41367a.f22713w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c41367a.f22714x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f22707w;
                    AbstractC26403a abstractC26403aM17036o = this.f22708x.m17036o((InterfaceC5737b.d) obj);
                    c41367a.f22715y = null;
                    c41367a.f22709E = null;
                    c41367a.f22710F = null;
                    c41367a.f22711G = null;
                    c41367a.f22712H = 0;
                    c41367a.f22714x = 1;
                    if (interfaceC13062m.emit(abstractC26403aM17036o, c41367a) == enumC31071a) {
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

        public b(InterfaceC13058l interfaceC13058l, C5738c c5738c) {
            this.f22705w = interfaceC13058l;
            this.f22706x = c5738c;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f22705w.collect(new a(interfaceC13062m, this.f22706x), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: com.whoop.achievements.celebration.c$c */
    /* JADX INFO: loaded from: classes6.dex */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f22717w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C5738c f22718x;

        /* JADX INFO: renamed from: com.whoop.achievements.celebration.c$c$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f22719w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C5738c f22720x;

            /* JADX INFO: renamed from: com.whoop.achievements.celebration.c$c$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.achievements.celebration.AchievementCelebrationViewModel$special$$inlined$map$2$2", m100430f = "AchievementCelebrationViewModel.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C41368a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f22721E;

                /* JADX INFO: renamed from: F */
                Object f22722F;

                /* JADX INFO: renamed from: G */
                Object f22723G;

                /* JADX INFO: renamed from: H */
                int f22724H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f22725w;

                /* JADX INFO: renamed from: x */
                int f22726x;

                /* JADX INFO: renamed from: y */
                Object f22727y;

                public C41368a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f22725w = obj;
                    this.f22726x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m, C5738c c5738c) {
                this.f22719w = interfaceC13062m;
                this.f22720x = c5738c;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C41368a c41368a;
                if (interfaceC30057d instanceof C41368a) {
                    c41368a = (C41368a) interfaceC30057d;
                    int i13 = c41368a.f22726x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c41368a.f22726x = i13 - Integer.MIN_VALUE;
                    } else {
                        c41368a = new C41368a(interfaceC30057d);
                    }
                } else {
                    c41368a = new C41368a(interfaceC30057d);
                }
                Object obj2 = c41368a.f22725w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c41368a.f22726x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f22719w;
                    AbstractC5739d abstractC5739dM87846a = this.f22720x.reducer.m87846a((AbstractC26404b) obj);
                    c41368a.f22727y = null;
                    c41368a.f22721E = null;
                    c41368a.f22722F = null;
                    c41368a.f22723G = null;
                    c41368a.f22724H = 0;
                    c41368a.f22726x = 1;
                    if (interfaceC13062m.emit(abstractC5739dM87846a, c41368a) == enumC31071a) {
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

        public c(InterfaceC13058l interfaceC13058l, C5738c c5738c) {
            this.f22717w = interfaceC13058l;
            this.f22718x = c5738c;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f22717w.collect(new a(interfaceC13062m, this.f22718x), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C5738c(C26405c interactor, C28937a reducer, InterfaceC2994c0 coroutineScope) {
        super(coroutineScope);
        AbstractC22676k.m65750j(interactor, "interactor");
        AbstractC22676k.m65750j(reducer, "reducer");
        AbstractC22676k.m65750j(coroutineScope, "coroutineScope");
        this.interactor = interactor;
        this.reducer = reducer;
        this.coroutineScope = coroutineScope;
        C13096w1 c13096w1M36592b = AbstractC13091v.m36592b(0, 0, null, 7);
        this.eventFlow = c13096w1M36592b;
        InterfaceC13058l interfaceC13058lInteract = interact(new b(c13096w1M36592b, this));
        C13021b2 c13021b2 = C13105z1.f45288a;
        C13078q1 c13078q1M36586L = AbstractC13091v.m36586L(interfaceC13058lInteract, coroutineScope, c13021b2, 1);
        this.domainState = c13078q1M36586L;
        this.viewState = AbstractC13091v.m36586L(new c(c13078q1M36586L, this), coroutineScope, c13021b2, 1);
    }

    private final InterfaceC13058l interact(InterfaceC13058l interfaceC13058l) {
        return this.interactor.m78117g(interfaceC13058l);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o */
    public final AbstractC26403a m17036o(InterfaceC5737b.d dVar) {
        if (dVar instanceof InterfaceC5737b.d.a) {
            return new AbstractC26403a.a(((InterfaceC5737b.d.a) dVar).getAchievementType());
        }
        if (dVar instanceof InterfaceC5737b.d.b) {
            return new AbstractC26403a.b(((InterfaceC5737b.d.b) dVar).getCelebrationType());
        }
        throw new NoWhenBranchMatchedException();
    }

    public final InterfaceC13058l getViewState() {
        return this.viewState;
    }

    /* JADX INFO: renamed from: n */
    public final void m17037n(InterfaceC5737b.d event) {
        AbstractC22676k.m65750j(event, "event");
        AbstractC3006f0.m8732z(this.coroutineScope, null, null, new a(event, null), 3);
    }

    public /* synthetic */ C5738c(C26405c c26405c, C28937a c28937a, InterfaceC2994c0 interfaceC2994c0, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(c26405c, c28937a, (i13 & 4) != 0 ? new C28180m(null, 1, null) : interfaceC2994c0);
    }
}
