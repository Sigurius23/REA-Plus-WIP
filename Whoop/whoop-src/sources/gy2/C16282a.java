package gy2;

import androidx.lifecycle.AbstractC1637w1;
import bc3.AbstractC3006f0;
import bc3.InterfaceC2994c0;
import bc3.InterfaceC3027k1;
import c93.InterfaceC4351m;
import cy2.AbstractC11187a;
import dy2.AbstractC12451a;
import dy2.C12453c;
import ec3.AbstractC13091v;
import ec3.C13021b2;
import ec3.C13078q1;
import ec3.C13096w1;
import ec3.C13105z1;
import ec3.InterfaceC13037f2;
import ec3.InterfaceC13058l;
import ec3.InterfaceC13062m;
import ec3.InterfaceC13072o1;
import ey2.C13754a;
import fy2.InterfaceC14880b;
import gw1.C16268a;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import l83.C23454a0;
import l83.InterfaceC23462h;
import nz2.AbstractC27308b;
import or2.C28180m;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.AbstractC30060g;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import tr2.InterfaceC34116n;

/* JADX INFO: renamed from: gy2.a */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(m65680d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ'\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u000f*\b\u0012\u0004\u0012\u00020\u00100\u000f2\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J'\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u000f*\b\u0012\u0004\u0012\u00020\u00110\u000f2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0015\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u001b\u0010!\u001a\u00020\u001c8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u001a\u0010%\u001a\b\u0012\u0004\u0012\u00020\n0\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u001a\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00110\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u001d\u0010.\u001a\b\u0012\u0004\u0012\u00020\u00140)8\u0006¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-¨\u0006/"}, m65681d2 = {"Lgy2/a;", "Landroidx/lifecycle/w1;", "Ldy2/c;", "interactor", "Ley2/a;", "viewStateReducer", "Lbc3/c0;", "coroutineScope", "<init>", "(Ldy2/c;Ley2/a;Lbc3/c0;)V", "Lcy2/a;", "viewEvent", "Ldy2/a$a;", "r", "(Lcy2/a;)Ldy2/a$a;", "Lec3/l;", "Ldy2/a;", "Ldy2/b;", "n", "(Lec3/l;Ldy2/c;)Lec3/l;", "Lfy2/b;", "p", "(Lec3/l;Ley2/a;)Lec3/l;", "Lbc3/k1;", "q", "(Lcy2/a;)Lbc3/k1;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "Lbc3/c0;", "Ltr2/n;", "x", "Ll83/h;", "getLog", "()Ltr2/n;", "log", "Lec3/o1;", "y", "Lec3/o1;", "eventFlow", "z", "Lec3/l;", "domainState", "Lec3/f2;", "E", "Lec3/f2;", "getViewState", "()Lec3/f2;", "viewState", "whooplabs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C16282a extends AbstractC1637w1 {

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    private final InterfaceC13037f2 viewState;

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    private final InterfaceC2994c0 coroutineScope;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    private final InterfaceC23462h log;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    private final InterfaceC13072o1 eventFlow;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    private final InterfaceC13058l domainState;

    /* JADX INFO: renamed from: gy2.a$a */
    /* JADX INFO: loaded from: classes11.dex */
    @InterfaceC32271e(m100429c = "com.whoop.whooplabs.feature.campaignschedule.viewmodel.CampaignScheduleViewModel$sendViewEvent$1", m100430f = "CampaignScheduleViewModel.kt", m100431l = {42}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f62440w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ AbstractC11187a f62442y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(AbstractC11187a abstractC11187a, InterfaceC30057d<? super a> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f62442y = abstractC11187a;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C16282a.this.new a(this.f62442y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f62440w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC13072o1 interfaceC13072o1 = C16282a.this.eventFlow;
                AbstractC11187a abstractC11187a = this.f62442y;
                this.f62440w = 1;
                if (interfaceC13072o1.emit(abstractC11187a, this) == enumC31071a) {
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

    /* JADX INFO: renamed from: gy2.a$b */
    /* JADX INFO: loaded from: classes11.dex */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f62443w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C16282a f62444x;

        /* JADX INFO: renamed from: gy2.a$b$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f62445w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C16282a f62446x;

            /* JADX INFO: renamed from: gy2.a$b$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.whooplabs.feature.campaignschedule.viewmodel.CampaignScheduleViewModel$special$$inlined$map$1$2", m100430f = "CampaignScheduleViewModel.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C41678a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f62447E;

                /* JADX INFO: renamed from: F */
                Object f62448F;

                /* JADX INFO: renamed from: G */
                Object f62449G;

                /* JADX INFO: renamed from: H */
                int f62450H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f62451w;

                /* JADX INFO: renamed from: x */
                int f62452x;

                /* JADX INFO: renamed from: y */
                Object f62453y;

                public C41678a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f62451w = obj;
                    this.f62452x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m, C16282a c16282a) {
                this.f62445w = interfaceC13062m;
                this.f62446x = c16282a;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C41678a c41678a;
                if (interfaceC30057d instanceof C41678a) {
                    c41678a = (C41678a) interfaceC30057d;
                    int i13 = c41678a.f62452x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c41678a.f62452x = i13 - Integer.MIN_VALUE;
                    } else {
                        c41678a = new C41678a(interfaceC30057d);
                    }
                } else {
                    c41678a = new C41678a(interfaceC30057d);
                }
                Object obj2 = c41678a.f62451w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c41678a.f62452x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f62445w;
                    AbstractC12451a.a aVarM46107r = this.f62446x.m46107r((AbstractC11187a) obj);
                    c41678a.f62453y = null;
                    c41678a.f62447E = null;
                    c41678a.f62448F = null;
                    c41678a.f62449G = null;
                    c41678a.f62450H = 0;
                    c41678a.f62452x = 1;
                    if (interfaceC13062m.emit(aVarM46107r, c41678a) == enumC31071a) {
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

        public b(InterfaceC13058l interfaceC13058l, C16282a c16282a) {
            this.f62443w = interfaceC13058l;
            this.f62444x = c16282a;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f62443w.collect(new a(interfaceC13062m, this.f62444x), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C16282a(C12453c interactor, C13754a viewStateReducer, InterfaceC2994c0 coroutineScope) {
        super(coroutineScope);
        AbstractC22676k.m65750j(interactor, "interactor");
        AbstractC22676k.m65750j(viewStateReducer, "viewStateReducer");
        AbstractC22676k.m65750j(coroutineScope, "coroutineScope");
        this.coroutineScope = coroutineScope;
        this.log = AbstractC30060g.m92088H(new C16268a(21));
        C13096w1 c13096w1M36592b = AbstractC13091v.m36592b(0, 0, null, 7);
        this.eventFlow = c13096w1M36592b;
        InterfaceC13058l interfaceC13058lM46104n = m46104n(new b(c13096w1M36592b, this), interactor);
        C13021b2 c13021b2 = C13105z1.f45288a;
        C13078q1 c13078q1M36586L = AbstractC13091v.m36586L(interfaceC13058lM46104n, coroutineScope, c13021b2, 1);
        this.domainState = c13078q1M36586L;
        this.viewState = AbstractC13091v.m36587M(m46106p(c13078q1M36586L, viewStateReducer), coroutineScope, c13021b2, InterfaceC14880b.c.f55531a);
    }

    /* JADX INFO: renamed from: n */
    private final InterfaceC13058l m46104n(InterfaceC13058l interfaceC13058l, C12453c c12453c) {
        return c12453c.m35091d(interfaceC13058l);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o */
    public static final InterfaceC34116n m46105o() {
        return AbstractC27308b.m82458a("CampaignScheduleViewModel");
    }

    /* JADX INFO: renamed from: p */
    private final InterfaceC13058l m46106p(InterfaceC13058l interfaceC13058l, C13754a c13754a) {
        return c13754a.m39092a(interfaceC13058l);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r */
    public final AbstractC12451a.a m46107r(AbstractC11187a viewEvent) {
        if (viewEvent instanceof AbstractC11187a.a) {
            return new AbstractC12451a.a(((AbstractC11187a.a) viewEvent).getCampaignId());
        }
        throw new NoWhenBranchMatchedException();
    }

    public final InterfaceC13037f2 getViewState() {
        return this.viewState;
    }

    /* JADX INFO: renamed from: q */
    public final InterfaceC3027k1 m46108q(AbstractC11187a viewEvent) {
        AbstractC22676k.m65750j(viewEvent, "viewEvent");
        return AbstractC3006f0.m8732z(this.coroutineScope, null, null, new a(viewEvent, null), 3);
    }

    public /* synthetic */ C16282a(C12453c c12453c, C13754a c13754a, InterfaceC2994c0 interfaceC2994c0, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(c12453c, c13754a, (i13 & 4) != 0 ? new C28180m(null, 1, null) : interfaceC2994c0);
    }
}
