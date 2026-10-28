package bb0;

import androidx.core.app.NotificationCompat;
import androidx.lifecycle.AbstractC1637w1;
import bc3.AbstractC3006f0;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4351m;
import cb0.C4386a;
import ec3.AbstractC13091v;
import ec3.C13021b2;
import ec3.C13078q1;
import ec3.C13096w1;
import ec3.C13105z1;
import ec3.InterfaceC13058l;
import ec3.InterfaceC13062m;
import ec3.InterfaceC13072o1;
import ec3.InterfaceC13087t1;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import l83.C23454a0;
import or2.C28180m;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.InterfaceC30057d;
import qw2.C30695c;
import qw2.InterfaceC30693a;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import vw2.AbstractC36547b;
import vw2.InterfaceC36546a;
import za0.AbstractC40222b;
import za0.C40224d;

/* JADX INFO: renamed from: bb0.c */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0013\u0010\u000e\u001a\u00020\r*\u00020\fH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u001f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010*\b\u0012\u0004\u0012\u00020\r0\u0010H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J'\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u0010*\b\u0012\u0004\u0012\u00020\u00140\u00102\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0015\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0018\u001a\u00020\f¢\u0006\u0004\b\u001a\u0010\u001bJ\u0015\u0010\u001e\u001a\u00020\u00192\u0006\u0010\u001d\u001a\u00020\u001c¢\u0006\u0004\b\u001e\u0010\u001fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u001a\u0010+\u001a\b\u0012\u0004\u0012\u00020\f0(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u001a\u0010-\u001a\b\u0012\u0004\u0012\u00020\u00140(8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010*R\u001a\u00100\u001a\b\u0012\u0004\u0012\u00020\u00110\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\u001a\u00104\u001a\b\u0012\u0004\u0012\u00020\u0015018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00103R\u001d\u00109\u001a\b\u0012\u0004\u0012\u0002050\u00108\u0006¢\u0006\f\n\u0004\b6\u0010/\u001a\u0004\b7\u00108¨\u0006:"}, m65681d2 = {"Lbb0/c;", "Landroidx/lifecycle/w1;", "Lza0/d;", "interactor", "Lcb0/a;", "reducer", "Lqw2/c;", "actionInteractor", "Lbc3/c0;", "coroutineScope", "<init>", "(Lza0/d;Lcb0/a;Lqw2/c;Lbc3/c0;)V", "Lbb0/b;", "Lza0/b;", "q", "(Lbb0/b;)Lza0/b;", "Lec3/l;", "Lza0/c;", "interact", "(Lec3/l;)Lec3/l;", "Lqw2/a;", "Lqw2/b;", "n", "(Lec3/l;Lqw2/c;)Lec3/l;", NotificationCompat.CATEGORY_EVENT, "Ll83/a0;", "p", "(Lbb0/b;)V", "Lvw2/a;", "actionViewEvent", "o", "(Lvw2/a;)V", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "Lza0/d;", "x", "Lcb0/a;", "y", "Lqw2/c;", "z", "Lbc3/c0;", "Lec3/o1;", "E", "Lec3/o1;", "eventFlow", "F", "actionFlow", "G", "Lec3/l;", "domainState", "Lec3/t1;", "H", "Lec3/t1;", "actionState", "Lbb0/d;", "I", "getViewState", "()Lec3/l;", "viewState", "advanced-labs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C2923c extends AbstractC1637w1 {

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    private final InterfaceC13072o1 eventFlow;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    private final InterfaceC13072o1 actionFlow;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    private final InterfaceC13058l domainState;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    private final InterfaceC13087t1 actionState;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    private final InterfaceC13058l viewState;

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    private final C40224d interactor;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    private final C4386a reducer;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    private final C30695c actionInteractor;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    private final InterfaceC2994c0 coroutineScope;

    /* JADX INFO: renamed from: bb0.c$a */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.advancedlabs.biomarkerdetails.presentation.BiomarkerDetailsViewModel$sendAction$1", m100430f = "BiomarkerDetailsViewModel.kt", m100431l = {51}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: E */
        final /* synthetic */ C2923c f11762E;

        /* JADX INFO: renamed from: w */
        Object f11763w;

        /* JADX INFO: renamed from: x */
        int f11764x;

        /* JADX INFO: renamed from: y */
        int f11765y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ InterfaceC36546a f11766z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(InterfaceC36546a interfaceC36546a, C2923c c2923c, InterfaceC30057d<? super a> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f11766z = interfaceC36546a;
            this.f11762E = c2923c;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new a(this.f11766z, this.f11762E, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f11765y;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC30693a interfaceC30693aM117178a = AbstractC36547b.m117178a(this.f11766z);
                if (interfaceC30693aM117178a != null) {
                    InterfaceC13072o1 interfaceC13072o1 = this.f11762E.actionFlow;
                    this.f11763w = null;
                    this.f11764x = 0;
                    this.f11765y = 1;
                    if (interfaceC13072o1.emit(interfaceC30693aM117178a, this) == enumC31071a) {
                        return enumC31071a;
                    }
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

    /* JADX INFO: renamed from: bb0.c$b */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.advancedlabs.biomarkerdetails.presentation.BiomarkerDetailsViewModel$sendViewEvent$1", m100430f = "BiomarkerDetailsViewModel.kt", m100431l = {45}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class b extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f11767w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ AbstractC2922b f11769y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(AbstractC2922b abstractC2922b, InterfaceC30057d<? super b> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f11769y = abstractC2922b;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C2923c.this.new b(this.f11769y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((b) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f11767w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC13072o1 interfaceC13072o1 = C2923c.this.eventFlow;
                AbstractC2922b abstractC2922b = this.f11769y;
                this.f11767w = 1;
                if (interfaceC13072o1.emit(abstractC2922b, this) == enumC31071a) {
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

    /* JADX INFO: renamed from: bb0.c$c */
    /* JADX INFO: loaded from: classes7.dex */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f11770w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C2923c f11771x;

        /* JADX INFO: renamed from: bb0.c$c$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f11772w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C2923c f11773x;

            /* JADX INFO: renamed from: bb0.c$c$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.advancedlabs.biomarkerdetails.presentation.BiomarkerDetailsViewModel$special$$inlined$map$1$2", m100430f = "BiomarkerDetailsViewModel.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C41302a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f11774E;

                /* JADX INFO: renamed from: F */
                Object f11775F;

                /* JADX INFO: renamed from: G */
                Object f11776G;

                /* JADX INFO: renamed from: H */
                int f11777H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f11778w;

                /* JADX INFO: renamed from: x */
                int f11779x;

                /* JADX INFO: renamed from: y */
                Object f11780y;

                public C41302a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f11778w = obj;
                    this.f11779x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m, C2923c c2923c) {
                this.f11772w = interfaceC13062m;
                this.f11773x = c2923c;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C41302a c41302a;
                if (interfaceC30057d instanceof C41302a) {
                    c41302a = (C41302a) interfaceC30057d;
                    int i13 = c41302a.f11779x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c41302a.f11779x = i13 - Integer.MIN_VALUE;
                    } else {
                        c41302a = new C41302a(interfaceC30057d);
                    }
                } else {
                    c41302a = new C41302a(interfaceC30057d);
                }
                Object obj2 = c41302a.f11778w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c41302a.f11779x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f11772w;
                    AbstractC40222b abstractC40222bM8521q = this.f11773x.m8521q((AbstractC2922b) obj);
                    c41302a.f11780y = null;
                    c41302a.f11774E = null;
                    c41302a.f11775F = null;
                    c41302a.f11776G = null;
                    c41302a.f11777H = 0;
                    c41302a.f11779x = 1;
                    if (interfaceC13062m.emit(abstractC40222bM8521q, c41302a) == enumC31071a) {
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

        public c(InterfaceC13058l interfaceC13058l, C2923c c2923c) {
            this.f11770w = interfaceC13058l;
            this.f11771x = c2923c;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f11770w.collect(new a(interfaceC13062m, this.f11771x), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2923c(C40224d interactor, C4386a reducer, C30695c actionInteractor, InterfaceC2994c0 coroutineScope) {
        super(coroutineScope);
        AbstractC22676k.m65750j(interactor, "interactor");
        AbstractC22676k.m65750j(reducer, "reducer");
        AbstractC22676k.m65750j(actionInteractor, "actionInteractor");
        AbstractC22676k.m65750j(coroutineScope, "coroutineScope");
        this.interactor = interactor;
        this.reducer = reducer;
        this.actionInteractor = actionInteractor;
        this.coroutineScope = coroutineScope;
        C13096w1 c13096w1M36592b = AbstractC13091v.m36592b(0, 0, null, 7);
        this.eventFlow = c13096w1M36592b;
        C13096w1 c13096w1M36592b2 = AbstractC13091v.m36592b(0, 0, null, 7);
        this.actionFlow = c13096w1M36592b2;
        InterfaceC13058l interfaceC13058lInteract = interact(new c(c13096w1M36592b, this));
        C13021b2 c13021b2 = C13105z1.f45288a;
        C13078q1 c13078q1M36586L = AbstractC13091v.m36586L(interfaceC13058lInteract, coroutineScope, c13021b2, 1);
        this.domainState = c13078q1M36586L;
        this.actionState = AbstractC13091v.m36586L(m8520n(c13096w1M36592b2, actionInteractor), coroutineScope, c13021b2, 1);
        this.viewState = reducer.m13773f(c13078q1M36586L);
    }

    private final InterfaceC13058l interact(InterfaceC13058l interfaceC13058l) {
        return this.interactor.interact(interfaceC13058l);
    }

    /* JADX INFO: renamed from: n */
    private final InterfaceC13058l m8520n(InterfaceC13058l interfaceC13058l, C30695c c30695c) {
        return c30695c.interact(interfaceC13058l);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q */
    public final AbstractC40222b m8521q(AbstractC2922b abstractC2922b) {
        if (abstractC2922b instanceof AbstractC2922b.b) {
            AbstractC2922b.b bVar = (AbstractC2922b.b) abstractC2922b;
            return new AbstractC40222b.b(bVar.getId(), bVar.getNextToken());
        }
        if (abstractC2922b instanceof AbstractC2922b.a) {
            return new AbstractC40222b.a(((AbstractC2922b.a) abstractC2922b).getCardId());
        }
        throw new NoWhenBranchMatchedException();
    }

    public final InterfaceC13058l getViewState() {
        return this.viewState;
    }

    /* JADX INFO: renamed from: o */
    public final void m8522o(InterfaceC36546a actionViewEvent) {
        AbstractC22676k.m65750j(actionViewEvent, "actionViewEvent");
        AbstractC3006f0.m8732z(this.coroutineScope, null, null, new a(actionViewEvent, this, null), 3);
    }

    /* JADX INFO: renamed from: p */
    public final void m8523p(AbstractC2922b event) {
        AbstractC22676k.m65750j(event, "event");
        AbstractC3006f0.m8732z(this.coroutineScope, null, null, new b(event, null), 3);
    }

    public /* synthetic */ C2923c(C40224d c40224d, C4386a c4386a, C30695c c30695c, InterfaceC2994c0 interfaceC2994c0, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(c40224d, c4386a, c30695c, (i13 & 8) != 0 ? new C28180m(null, 1, null) : interfaceC2994c0);
    }
}
