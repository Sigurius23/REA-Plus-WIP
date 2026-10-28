package so1;

import androidx.lifecycle.AbstractC1637w1;
import bc3.AbstractC3006f0;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4351m;
import ec3.AbstractC13091v;
import ec3.C13078q1;
import ec3.C13096w1;
import ec3.C13105z1;
import ec3.InterfaceC13058l;
import ec3.InterfaceC13062m;
import ec3.InterfaceC13072o1;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import l83.C23454a0;
import od1.AbstractC27845h;
import oo1.AbstractC28063i;
import oo1.C28065k;
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
import to1.AbstractC34020m;
import to1.C34021n;

/* JADX INFO: renamed from: so1.f0 */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ'\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u000f*\b\u0012\u0004\u0012\u00020\u00100\u000f2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0015\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u001a\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\n0\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u001a\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u001d\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00110\u000f8\u0006¢\u0006\f\n\u0004\b \u0010\u001e\u001a\u0004\b!\u0010\"¨\u0006$"}, m65681d2 = {"Lso1/f0;", "Landroidx/lifecycle/w1;", "Loo1/k;", "interactor", "Lto1/n;", "reducer", "Lbc3/c0;", "coroutineScope", "<init>", "(Loo1/k;Lto1/n;Lbc3/c0;)V", "Lto1/m;", "viewEvent", "Loo1/i;", "o", "(Lto1/m;)Loo1/i;", "Lec3/l;", "Loo1/j;", "Lso1/g0;", "l", "(Lec3/l;Lto1/n;)Lec3/l;", "Ll83/a0;", "n", "(Lto1/m;)V", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "Lbc3/c0;", "Lec3/o1;", "x", "Lec3/o1;", "eventFlow", "y", "Lec3/l;", "domainState", "z", "getViewState", "()Lec3/l;", "viewState", "hormonal-insights_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C32813f0 extends AbstractC1637w1 {

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    private final InterfaceC2994c0 coroutineScope;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    private final InterfaceC13072o1 eventFlow;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    private final InterfaceC13058l domainState;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    private final InterfaceC13058l viewState;

    /* JADX INFO: renamed from: so1.f0$a */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.hormonalinsights.menstrualcycleinsights.presentation.PhaseCoachingViewModel$sendViewEvent$1", m100430f = "PhaseCoachingViewModel.kt", m100431l = {37}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f136692w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ AbstractC34020m f136694y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(AbstractC34020m abstractC34020m, InterfaceC30057d<? super a> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f136694y = abstractC34020m;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C32813f0.this.new a(this.f136694y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f136692w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC13072o1 interfaceC13072o1 = C32813f0.this.eventFlow;
                AbstractC34020m abstractC34020m = this.f136694y;
                this.f136692w = 1;
                if (interfaceC13072o1.emit(abstractC34020m, this) == enumC31071a) {
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

    /* JADX INFO: renamed from: so1.f0$b */
    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f136695w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C32813f0 f136696x;

        /* JADX INFO: renamed from: so1.f0$b$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f136697w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C32813f0 f136698x;

            /* JADX INFO: renamed from: so1.f0$b$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.hormonalinsights.menstrualcycleinsights.presentation.PhaseCoachingViewModel$special$$inlined$map$1$2", m100430f = "PhaseCoachingViewModel.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C42337a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f136699E;

                /* JADX INFO: renamed from: F */
                Object f136700F;

                /* JADX INFO: renamed from: G */
                Object f136701G;

                /* JADX INFO: renamed from: H */
                int f136702H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f136703w;

                /* JADX INFO: renamed from: x */
                int f136704x;

                /* JADX INFO: renamed from: y */
                Object f136705y;

                public C42337a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f136703w = obj;
                    this.f136704x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m, C32813f0 c32813f0) {
                this.f136697w = interfaceC13062m;
                this.f136698x = c32813f0;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C42337a c42337a;
                if (interfaceC30057d instanceof C42337a) {
                    c42337a = (C42337a) interfaceC30057d;
                    int i13 = c42337a.f136704x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c42337a.f136704x = i13 - Integer.MIN_VALUE;
                    } else {
                        c42337a = new C42337a(interfaceC30057d);
                    }
                } else {
                    c42337a = new C42337a(interfaceC30057d);
                }
                Object obj2 = c42337a.f136703w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c42337a.f136704x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f136697w;
                    AbstractC28063i abstractC28063iM102965o = this.f136698x.m102965o((AbstractC34020m) obj);
                    c42337a.f136705y = null;
                    c42337a.f136699E = null;
                    c42337a.f136700F = null;
                    c42337a.f136701G = null;
                    c42337a.f136702H = 0;
                    c42337a.f136704x = 1;
                    if (interfaceC13062m.emit(abstractC28063iM102965o, c42337a) == enumC31071a) {
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

        public b(InterfaceC13058l interfaceC13058l, C32813f0 c32813f0) {
            this.f136695w = interfaceC13058l;
            this.f136696x = c32813f0;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f136695w.collect(new a(interfaceC13062m, this.f136696x), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C32813f0(C28065k interactor, C34021n reducer, InterfaceC2994c0 coroutineScope) {
        super(coroutineScope);
        AbstractC22676k.m65750j(interactor, "interactor");
        AbstractC22676k.m65750j(reducer, "reducer");
        AbstractC22676k.m65750j(coroutineScope, "coroutineScope");
        this.coroutineScope = coroutineScope;
        C13096w1 c13096w1M36592b = AbstractC13091v.m36592b(0, 0, null, 7);
        this.eventFlow = c13096w1M36592b;
        C13078q1 c13078q1M36586L = AbstractC13091v.m36586L(AbstractC27845h.m83945a(new b(c13096w1M36592b, this), interactor), coroutineScope, C13105z1.f45288a, 0);
        this.domainState = c13078q1M36586L;
        this.viewState = m102964l(c13078q1M36586L, reducer);
    }

    /* JADX INFO: renamed from: l */
    private final InterfaceC13058l m102964l(InterfaceC13058l interfaceC13058l, C34021n c34021n) {
        return c34021n.m107593b(interfaceC13058l);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o */
    public final AbstractC28063i m102965o(AbstractC34020m viewEvent) {
        if (viewEvent instanceof AbstractC34020m.a) {
            return new AbstractC28063i.a(((AbstractC34020m.a) viewEvent).getSelectedPhase());
        }
        if (viewEvent instanceof AbstractC34020m.b) {
            return new AbstractC28063i.b(((AbstractC34020m.b) viewEvent).getSelectedPhase());
        }
        throw new NoWhenBranchMatchedException();
    }

    public final InterfaceC13058l getViewState() {
        return this.viewState;
    }

    /* JADX INFO: renamed from: n */
    public final void m102966n(AbstractC34020m viewEvent) {
        AbstractC22676k.m65750j(viewEvent, "viewEvent");
        AbstractC3006f0.m8732z(this.coroutineScope, null, null, new a(viewEvent, null), 3);
    }

    public /* synthetic */ C32813f0(C28065k c28065k, C34021n c34021n, InterfaceC2994c0 interfaceC2994c0, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(c28065k, c34021n, (i13 & 4) != 0 ? new C28180m(null, 1, null) : interfaceC2994c0);
    }
}
