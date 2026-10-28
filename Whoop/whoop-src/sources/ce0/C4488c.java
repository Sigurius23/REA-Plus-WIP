package ce0;

import ae0.AbstractC0788a;
import ae0.C0790c;
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
import ee0.C13136a;
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

/* JADX INFO: renamed from: ce0.c */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0013\u0010\f\u001a\u00020\u000b*\u00020\nH\u0002¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e*\b\u0012\u0004\u0012\u00020\u000b0\u000eH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\n¢\u0006\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u001a\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\n0\u001c8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u001a\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u000f0\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u001d\u0010'\u001a\b\u0012\u0004\u0012\u00020#0\u000e8\u0006¢\u0006\f\n\u0004\b$\u0010!\u001a\u0004\b%\u0010&¨\u0006("}, m65681d2 = {"Lce0/c;", "Landroidx/lifecycle/w1;", "Lae0/c;", "interactor", "Lee0/a;", "reducer", "Lbc3/c0;", "coroutineScope", "<init>", "(Lae0/c;Lee0/a;Lbc3/c0;)V", "Lce0/b;", "Lae0/a;", "n", "(Lce0/b;)Lae0/a;", "Lec3/l;", "Lae0/b;", "interact", "(Lec3/l;)Lec3/l;", NotificationCompat.CATEGORY_EVENT, "Ll83/a0;", "l", "(Lce0/b;)V", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "Lae0/c;", "x", "Lee0/a;", "y", "Lbc3/c0;", "Lec3/o1;", "z", "Lec3/o1;", "eventFlow", "E", "Lec3/l;", "domainState", "Lce0/d;", "F", "getViewState", "()Lec3/l;", "viewState", "advanced-labs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C4488c extends AbstractC1637w1 {

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    private final InterfaceC13058l domainState;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    private final InterfaceC13058l viewState;

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    private final C0790c interactor;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    private final C13136a reducer;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    private final InterfaceC2994c0 coroutineScope;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    private final InterfaceC13072o1 eventFlow;

    /* JADX INFO: renamed from: ce0.c$a */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.advancedlabs.schedulingform.presentation.SchedulingFormViewModel$sendViewEvent$1", m100430f = "SchedulingFormViewModel.kt", m100431l = {35}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f18053w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ AbstractC4487b f18055y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(AbstractC4487b abstractC4487b, InterfaceC30057d<? super a> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f18055y = abstractC4487b;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C4488c.this.new a(this.f18055y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f18053w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC13072o1 interfaceC13072o1 = C4488c.this.eventFlow;
                AbstractC4487b abstractC4487b = this.f18055y;
                this.f18053w = 1;
                if (interfaceC13072o1.emit(abstractC4487b, this) == enumC31071a) {
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

    /* JADX INFO: renamed from: ce0.c$b */
    /* JADX INFO: loaded from: classes7.dex */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f18056w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C4488c f18057x;

        /* JADX INFO: renamed from: ce0.c$b$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f18058w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C4488c f18059x;

            /* JADX INFO: renamed from: ce0.c$b$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.advancedlabs.schedulingform.presentation.SchedulingFormViewModel$special$$inlined$map$1$2", m100430f = "SchedulingFormViewModel.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C41342a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f18060E;

                /* JADX INFO: renamed from: F */
                Object f18061F;

                /* JADX INFO: renamed from: G */
                Object f18062G;

                /* JADX INFO: renamed from: H */
                int f18063H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f18064w;

                /* JADX INFO: renamed from: x */
                int f18065x;

                /* JADX INFO: renamed from: y */
                Object f18066y;

                public C41342a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f18064w = obj;
                    this.f18065x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m, C4488c c4488c) {
                this.f18058w = interfaceC13062m;
                this.f18059x = c4488c;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C41342a c41342a;
                if (interfaceC30057d instanceof C41342a) {
                    c41342a = (C41342a) interfaceC30057d;
                    int i13 = c41342a.f18065x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c41342a.f18065x = i13 - Integer.MIN_VALUE;
                    } else {
                        c41342a = new C41342a(interfaceC30057d);
                    }
                } else {
                    c41342a = new C41342a(interfaceC30057d);
                }
                Object obj2 = c41342a.f18064w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c41342a.f18065x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f18058w;
                    AbstractC0788a abstractC0788aM14039n = this.f18059x.m14039n((AbstractC4487b) obj);
                    c41342a.f18066y = null;
                    c41342a.f18060E = null;
                    c41342a.f18061F = null;
                    c41342a.f18062G = null;
                    c41342a.f18063H = 0;
                    c41342a.f18065x = 1;
                    if (interfaceC13062m.emit(abstractC0788aM14039n, c41342a) == enumC31071a) {
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

        public b(InterfaceC13058l interfaceC13058l, C4488c c4488c) {
            this.f18056w = interfaceC13058l;
            this.f18057x = c4488c;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f18056w.collect(new a(interfaceC13062m, this.f18057x), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4488c(C0790c interactor, C13136a reducer, InterfaceC2994c0 coroutineScope) {
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
        this.viewState = AbstractC13091v.m36586L(reducer.m36765c(c13078q1M36586L), coroutineScope, c13021b2, 1);
    }

    private final InterfaceC13058l interact(InterfaceC13058l interfaceC13058l) {
        return this.interactor.interact(interfaceC13058l);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n */
    public final AbstractC0788a m14039n(AbstractC4487b abstractC4487b) {
        if (abstractC4487b instanceof AbstractC4487b.d) {
            AbstractC4487b.d dVar = (AbstractC4487b.d) abstractC4487b;
            return new AbstractC0788a.c(dVar.getEpisodeId(), dVar.getBiomarkerTestId(), dVar.getTestType());
        }
        if (abstractC4487b instanceof AbstractC4487b.b) {
            AbstractC4487b.b bVar = (AbstractC4487b.b) abstractC4487b;
            return new AbstractC0788a.f(bVar.getSiteCode(), bVar.getCom.mapbox.common.HttpHeaders.DATE java.lang.String());
        }
        if (abstractC4487b instanceof AbstractC4487b.a) {
            return AbstractC0788a.a.f2832a;
        }
        if (abstractC4487b instanceof AbstractC4487b.f) {
            AbstractC4487b.f fVar = (AbstractC4487b.f) abstractC4487b;
            return new AbstractC0788a.d(fVar.getSiteCode(), fVar.getCom.mapbox.common.HttpHeaders.DATE java.lang.String(), fVar.getEpisodeId(), fVar.getBiomarkerTestId());
        }
        if (abstractC4487b instanceof AbstractC4487b.c) {
            return AbstractC0788a.b.f2833a;
        }
        if (!(abstractC4487b instanceof AbstractC4487b.e)) {
            throw new NoWhenBranchMatchedException();
        }
        AbstractC4487b.e eVar = (AbstractC4487b.e) abstractC4487b;
        return new AbstractC0788a.e(eVar.getLocation(), eVar.getCom.mapbox.common.HttpHeaders.DATE java.lang.String(), eVar.getSkipDebounce());
    }

    public final InterfaceC13058l getViewState() {
        return this.viewState;
    }

    /* JADX INFO: renamed from: l */
    public final void m14040l(AbstractC4487b event) {
        AbstractC22676k.m65750j(event, "event");
        AbstractC3006f0.m8732z(this.coroutineScope, null, null, new a(event, null), 3);
    }

    public /* synthetic */ C4488c(C0790c c0790c, C13136a c13136a, InterfaceC2994c0 interfaceC2994c0, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(c0790c, c13136a, (i13 & 4) != 0 ? new C28180m(null, 1, null) : interfaceC2994c0);
    }
}
