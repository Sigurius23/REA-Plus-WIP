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
import oo1.AbstractC28055a;
import oo1.C28056b;
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
import to1.AbstractC34008a;
import to1.C34009b;

/* JADX INFO: renamed from: so1.o */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ'\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u000f*\b\u0012\u0004\u0012\u00020\u00100\u000f2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0015\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u0015\u0010\u0016R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u001a\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\n0\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u001a\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u001d\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00110\u000f8\u0006¢\u0006\f\n\u0004\b \u0010\u001e\u001a\u0004\b!\u0010\"¨\u0006$"}, m65681d2 = {"Lso1/o;", "Landroidx/lifecycle/w1;", "Loo1/b;", "interactor", "Lto1/b;", "reducer", "Lbc3/c0;", "coroutineScope", "<init>", "(Loo1/b;Lto1/b;Lbc3/c0;)V", "Lto1/a;", "viewEvent", "Loo1/a;", "o", "(Lto1/a;)Loo1/a;", "Lec3/l;", "Lcom/whoop/hormonalinsights/menstrualcycleinsights/domain/models/LogCalendarDomainState;", "Lso1/p;", "l", "(Lec3/l;Lto1/b;)Lec3/l;", "Ll83/a0;", "n", "(Lto1/a;)V", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "Lbc3/c0;", "Lec3/o1;", "x", "Lec3/o1;", "eventFlow", "y", "Lec3/l;", "domainState", "z", "getViewState", "()Lec3/l;", "viewState", "hormonal-insights_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C32830o extends AbstractC1637w1 {

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    private final InterfaceC2994c0 coroutineScope;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    private final InterfaceC13072o1 eventFlow;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    private final InterfaceC13058l domainState;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    private final InterfaceC13058l viewState;

    /* JADX INFO: renamed from: so1.o$a */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.hormonalinsights.menstrualcycleinsights.presentation.LogCalendarViewModel$sendViewEvent$1", m100430f = "LogCalendarViewModel.kt", m100431l = {36}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f136776w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ AbstractC34008a f136778y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(AbstractC34008a abstractC34008a, InterfaceC30057d<? super a> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f136778y = abstractC34008a;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C32830o.this.new a(this.f136778y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f136776w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC13072o1 interfaceC13072o1 = C32830o.this.eventFlow;
                AbstractC34008a abstractC34008a = this.f136778y;
                this.f136776w = 1;
                if (interfaceC13072o1.emit(abstractC34008a, this) == enumC31071a) {
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

    /* JADX INFO: renamed from: so1.o$b */
    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f136779w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C32830o f136780x;

        /* JADX INFO: renamed from: so1.o$b$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f136781w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C32830o f136782x;

            /* JADX INFO: renamed from: so1.o$b$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.hormonalinsights.menstrualcycleinsights.presentation.LogCalendarViewModel$special$$inlined$map$1$2", m100430f = "LogCalendarViewModel.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C42338a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f136783E;

                /* JADX INFO: renamed from: F */
                Object f136784F;

                /* JADX INFO: renamed from: G */
                Object f136785G;

                /* JADX INFO: renamed from: H */
                int f136786H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f136787w;

                /* JADX INFO: renamed from: x */
                int f136788x;

                /* JADX INFO: renamed from: y */
                Object f136789y;

                public C42338a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f136787w = obj;
                    this.f136788x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m, C32830o c32830o) {
                this.f136781w = interfaceC13062m;
                this.f136782x = c32830o;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C42338a c42338a;
                if (interfaceC30057d instanceof C42338a) {
                    c42338a = (C42338a) interfaceC30057d;
                    int i13 = c42338a.f136788x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c42338a.f136788x = i13 - Integer.MIN_VALUE;
                    } else {
                        c42338a = new C42338a(interfaceC30057d);
                    }
                } else {
                    c42338a = new C42338a(interfaceC30057d);
                }
                Object obj2 = c42338a.f136787w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c42338a.f136788x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f136781w;
                    AbstractC28055a abstractC28055aM103022o = this.f136782x.m103022o((AbstractC34008a) obj);
                    c42338a.f136789y = null;
                    c42338a.f136783E = null;
                    c42338a.f136784F = null;
                    c42338a.f136785G = null;
                    c42338a.f136786H = 0;
                    c42338a.f136788x = 1;
                    if (interfaceC13062m.emit(abstractC28055aM103022o, c42338a) == enumC31071a) {
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

        public b(InterfaceC13058l interfaceC13058l, C32830o c32830o) {
            this.f136779w = interfaceC13058l;
            this.f136780x = c32830o;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f136779w.collect(new a(interfaceC13062m, this.f136780x), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C32830o(C28056b interactor, C34009b reducer, InterfaceC2994c0 coroutineScope) {
        super(coroutineScope);
        AbstractC22676k.m65750j(interactor, "interactor");
        AbstractC22676k.m65750j(reducer, "reducer");
        AbstractC22676k.m65750j(coroutineScope, "coroutineScope");
        this.coroutineScope = coroutineScope;
        C13096w1 c13096w1M36592b = AbstractC13091v.m36592b(0, 0, null, 7);
        this.eventFlow = c13096w1M36592b;
        C13078q1 c13078q1M36586L = AbstractC13091v.m36586L(AbstractC27845h.m83945a(new b(c13096w1M36592b, this), interactor), coroutineScope, C13105z1.f45288a, 0);
        this.domainState = c13078q1M36586L;
        this.viewState = m103021l(c13078q1M36586L, reducer);
    }

    /* JADX INFO: renamed from: l */
    private final InterfaceC13058l m103021l(InterfaceC13058l interfaceC13058l, C34009b c34009b) {
        return c34009b.m107500b(interfaceC13058l);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o */
    public final AbstractC28055a m103022o(AbstractC34008a viewEvent) {
        if (viewEvent instanceof AbstractC34008a.a) {
            AbstractC34008a.a aVar = (AbstractC34008a.a) viewEvent;
            return new AbstractC28055a.a(aVar.getCom.mapbox.common.HttpHeaders.DATE java.lang.String(), aVar.getSource());
        }
        if (viewEvent instanceof AbstractC34008a.c) {
            AbstractC34008a.c cVar = (AbstractC34008a.c) viewEvent;
            return new AbstractC28055a.c(cVar.getCom.mapbox.common.HttpHeaders.DATE java.lang.String(), cVar.getSelected());
        }
        if (AbstractC22676k.m65745e(viewEvent, AbstractC34008a.b.f142514a)) {
            return AbstractC28055a.b.f113206a;
        }
        throw new NoWhenBranchMatchedException();
    }

    public final InterfaceC13058l getViewState() {
        return this.viewState;
    }

    /* JADX INFO: renamed from: n */
    public final void m103023n(AbstractC34008a viewEvent) {
        AbstractC22676k.m65750j(viewEvent, "viewEvent");
        AbstractC3006f0.m8732z(this.coroutineScope, null, null, new a(viewEvent, null), 3);
    }

    public /* synthetic */ C32830o(C28056b c28056b, C34009b c34009b, InterfaceC2994c0 interfaceC2994c0, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(c28056b, c34009b, (i13 & 4) != 0 ? new C28180m(null, 1, null) : interfaceC2994c0);
    }
}
