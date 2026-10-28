package uy2;

import androidx.lifecycle.AbstractC1637w1;
import bc3.AbstractC3006f0;
import bc3.InterfaceC2994c0;
import bc3.InterfaceC3027k1;
import c93.InterfaceC4351m;
import ec3.AbstractC13091v;
import ec3.C13021b2;
import ec3.C13078q1;
import ec3.C13096w1;
import ec3.C13105z1;
import ec3.InterfaceC13037f2;
import ec3.InterfaceC13058l;
import ec3.InterfaceC13062m;
import ec3.InterfaceC13072o1;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import l83.C23454a0;
import ny2.AbstractC27299a;
import nz2.AbstractC27308b;
import or2.C28180m;
import oy2.AbstractC28475a;
import oy2.C28479e;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.InterfaceC30057d;
import qy2.C30778b;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import tr2.InterfaceC34116n;
import ty2.AbstractC34268a;

/* JADX INFO: renamed from: uy2.a */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(m65680d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011*\b\u0012\u0004\u0012\u00020\u000e0\u0011H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J'\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u0011*\b\u0012\u0004\u0012\u00020\u00120\u00112\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0015\u0010\u0019\u001a\u00020\u00182\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u0019\u0010\u001aR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u001a\u0010$\u001a\b\u0012\u0004\u0012\u00020\f0!8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010#R\u001a\u0010'\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u001d\u0010-\u001a\b\u0012\u0004\u0012\u00020\u00150(8\u0006¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,¨\u0006."}, m65681d2 = {"Luy2/a;", "Landroidx/lifecycle/w1;", "Loy2/e;", "interactor", "Lqy2/b;", "viewStateReducer", "Lbc3/c0;", "coroutineScope", "Ltr2/n;", "log", "<init>", "(Loy2/e;Lqy2/b;Lbc3/c0;Ltr2/n;)V", "Lny2/a;", "viewEvent", "Loy2/a;", "o", "(Lny2/a;)Loy2/a;", "Lec3/l;", "Loy2/b;", "interact", "(Lec3/l;)Lec3/l;", "Lty2/a;", "l", "(Lec3/l;Lqy2/b;)Lec3/l;", "Lbc3/k1;", "n", "(Lny2/a;)Lbc3/k1;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "Loy2/e;", "x", "Lbc3/c0;", "y", "Ltr2/n;", "Lec3/o1;", "z", "Lec3/o1;", "eventFlow", "E", "Lec3/l;", "domainState", "Lec3/f2;", "F", "Lec3/f2;", "getViewState", "()Lec3/f2;", "viewState", "whooplabs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C35386a extends AbstractC1637w1 {

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    private final InterfaceC13058l domainState;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    private final InterfaceC13037f2 viewState;

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    private final C28479e interactor;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    private final InterfaceC2994c0 coroutineScope;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    private final InterfaceC34116n log;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    private final InterfaceC13072o1 eventFlow;

    /* JADX INFO: renamed from: uy2.a$a */
    /* JADX INFO: loaded from: classes11.dex */
    @InterfaceC32271e(m100429c = "com.whoop.whooplabs.feature.campaignsteps.viewmodel.CampaignStepsViewModel$sendViewEvent$1", m100430f = "CampaignStepsViewModel.kt", m100431l = {44}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f150780w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ AbstractC27299a f150782y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(AbstractC27299a abstractC27299a, InterfaceC30057d<? super a> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f150782y = abstractC27299a;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C35386a.this.new a(this.f150782y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f150780w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC13072o1 interfaceC13072o1 = C35386a.this.eventFlow;
                AbstractC27299a abstractC27299a = this.f150782y;
                this.f150780w = 1;
                if (interfaceC13072o1.emit(abstractC27299a, this) == enumC31071a) {
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

    /* JADX INFO: renamed from: uy2.a$b */
    /* JADX INFO: loaded from: classes11.dex */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f150783w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C35386a f150784x;

        /* JADX INFO: renamed from: uy2.a$b$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f150785w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C35386a f150786x;

            /* JADX INFO: renamed from: uy2.a$b$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.whooplabs.feature.campaignsteps.viewmodel.CampaignStepsViewModel$special$$inlined$map$1$2", m100430f = "CampaignStepsViewModel.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C42521a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f150787E;

                /* JADX INFO: renamed from: F */
                Object f150788F;

                /* JADX INFO: renamed from: G */
                Object f150789G;

                /* JADX INFO: renamed from: H */
                int f150790H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f150791w;

                /* JADX INFO: renamed from: x */
                int f150792x;

                /* JADX INFO: renamed from: y */
                Object f150793y;

                public C42521a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f150791w = obj;
                    this.f150792x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m, C35386a c35386a) {
                this.f150785w = interfaceC13062m;
                this.f150786x = c35386a;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C42521a c42521a;
                if (interfaceC30057d instanceof C42521a) {
                    c42521a = (C42521a) interfaceC30057d;
                    int i13 = c42521a.f150792x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c42521a.f150792x = i13 - Integer.MIN_VALUE;
                    } else {
                        c42521a = new C42521a(interfaceC30057d);
                    }
                } else {
                    c42521a = new C42521a(interfaceC30057d);
                }
                Object obj2 = c42521a.f150791w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c42521a.f150792x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f150785w;
                    AbstractC28475a abstractC28475aM112315o = this.f150786x.m112315o((AbstractC27299a) obj);
                    c42521a.f150793y = null;
                    c42521a.f150787E = null;
                    c42521a.f150788F = null;
                    c42521a.f150789G = null;
                    c42521a.f150790H = 0;
                    c42521a.f150792x = 1;
                    if (interfaceC13062m.emit(abstractC28475aM112315o, c42521a) == enumC31071a) {
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

        public b(InterfaceC13058l interfaceC13058l, C35386a c35386a) {
            this.f150783w = interfaceC13058l;
            this.f150784x = c35386a;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f150783w.collect(new a(interfaceC13062m, this.f150784x), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C35386a(C28479e interactor, C30778b viewStateReducer, InterfaceC2994c0 coroutineScope, InterfaceC34116n log) {
        super(coroutineScope);
        AbstractC22676k.m65750j(interactor, "interactor");
        AbstractC22676k.m65750j(viewStateReducer, "viewStateReducer");
        AbstractC22676k.m65750j(coroutineScope, "coroutineScope");
        AbstractC22676k.m65750j(log, "log");
        this.interactor = interactor;
        this.coroutineScope = coroutineScope;
        this.log = log;
        C13096w1 c13096w1M36592b = AbstractC13091v.m36592b(0, 0, null, 7);
        this.eventFlow = c13096w1M36592b;
        InterfaceC13058l interfaceC13058lInteract = interact(new b(c13096w1M36592b, this));
        C13021b2 c13021b2 = C13105z1.f45288a;
        C13078q1 c13078q1M36586L = AbstractC13091v.m36586L(interfaceC13058lInteract, coroutineScope, c13021b2, 1);
        this.domainState = c13078q1M36586L;
        this.viewState = AbstractC13091v.m36587M(m112314l(c13078q1M36586L, viewStateReducer), coroutineScope, c13021b2, AbstractC34268a.g.f143930a);
    }

    private final InterfaceC13058l interact(InterfaceC13058l interfaceC13058l) {
        return this.interactor.m86697s0(interfaceC13058l);
    }

    /* JADX INFO: renamed from: l */
    private final InterfaceC13058l m112314l(InterfaceC13058l interfaceC13058l, C30778b c30778b) {
        return c30778b.m94617c(interfaceC13058l);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o */
    public final AbstractC28475a m112315o(AbstractC27299a viewEvent) {
        if (viewEvent instanceof AbstractC27299a.u) {
            AbstractC27299a.u uVar = (AbstractC27299a.u) viewEvent;
            return new AbstractC28475a.v(uVar.getCampaignId(), uVar.getSessionId());
        }
        if (AbstractC22676k.m65745e(viewEvent, AbstractC27299a.o.f109339a)) {
            return AbstractC28475a.o.f114836a;
        }
        if (viewEvent instanceof AbstractC27299a.b0) {
            return new AbstractC28475a.b0(((AbstractC27299a.b0) viewEvent).getSurveyProvider());
        }
        if (AbstractC22676k.m65745e(viewEvent, AbstractC27299a.v.f109347a)) {
            return AbstractC28475a.w.f114845a;
        }
        if (AbstractC22676k.m65745e(viewEvent, AbstractC27299a.s.f109343a)) {
            return AbstractC28475a.t.f114841a;
        }
        if (AbstractC22676k.m65745e(viewEvent, AbstractC27299a.f.f109324a)) {
            return AbstractC28475a.f.f114820a;
        }
        if (AbstractC22676k.m65745e(viewEvent, AbstractC27299a.a.f109316a)) {
            return AbstractC28475a.a.f114812a;
        }
        if (AbstractC22676k.m65745e(viewEvent, AbstractC27299a.j.f109332a)) {
            return AbstractC28475a.j.f114829a;
        }
        if (viewEvent instanceof AbstractC27299a.b) {
            return new AbstractC28475a.b(((AbstractC27299a.b) viewEvent).getNote());
        }
        if (AbstractC22676k.m65745e(viewEvent, AbstractC27299a.k.f109333a)) {
            return AbstractC28475a.k.f114830a;
        }
        if (AbstractC22676k.m65745e(viewEvent, AbstractC27299a.e.f109323a)) {
            return AbstractC28475a.e.f114819a;
        }
        if (AbstractC22676k.m65745e(viewEvent, AbstractC27299a.i.f109331a)) {
            return AbstractC28475a.i.f114828a;
        }
        if (viewEvent instanceof AbstractC27299a.h) {
            return new AbstractC28475a.h(((AbstractC27299a.h) viewEvent).getReading());
        }
        if (viewEvent instanceof AbstractC27299a.m) {
            return new AbstractC28475a.m(((AbstractC27299a.m) viewEvent).getReading());
        }
        if (viewEvent instanceof AbstractC27299a.x) {
            return new AbstractC28475a.y(((AbstractC27299a.x) viewEvent).getReading());
        }
        if (viewEvent instanceof AbstractC27299a.c) {
            return new AbstractC28475a.c(((AbstractC27299a.c) viewEvent).getAddress());
        }
        if (viewEvent instanceof AbstractC27299a.r) {
            return new AbstractC28475a.s(((AbstractC27299a.r) viewEvent).getAddress());
        }
        if (viewEvent instanceof AbstractC27299a.y) {
            return new AbstractC28475a.q(((AbstractC27299a.y) viewEvent).getKey());
        }
        if (viewEvent instanceof AbstractC27299a.p) {
            return new AbstractC28475a.p(((AbstractC27299a.p) viewEvent).getValue());
        }
        if (viewEvent instanceof AbstractC27299a.z) {
            return new AbstractC28475a.z(((AbstractC27299a.z) viewEvent).getText());
        }
        if (viewEvent instanceof AbstractC27299a.n) {
            return new AbstractC28475a.n(((AbstractC27299a.n) viewEvent).getMessage());
        }
        if (viewEvent instanceof AbstractC27299a.q) {
            return new AbstractC28475a.r(((AbstractC27299a.q) viewEvent).getIsResuming());
        }
        if (viewEvent instanceof AbstractC27299a.a0) {
            AbstractC27299a.a0 a0Var = (AbstractC27299a.a0) viewEvent;
            return new AbstractC28475a.a0(a0Var.getHour(), a0Var.getMinute());
        }
        if (viewEvent instanceof AbstractC27299a.l) {
            AbstractC27299a.l lVar = (AbstractC27299a.l) viewEvent;
            return new AbstractC28475a.l(lVar.getMessage(), lVar.getIsSubmitted(), lVar.getSurveyProvider());
        }
        if (viewEvent instanceof AbstractC27299a.g) {
            AbstractC27299a.g gVar = (AbstractC27299a.g) viewEvent;
            return new AbstractC28475a.g(gVar.getYear(), gVar.getMonth(), gVar.getDay(), gVar.getHour(), gVar.getMinutes(), true);
        }
        if (viewEvent instanceof AbstractC27299a.t) {
            return new AbstractC28475a.u(((AbstractC27299a.t) viewEvent).getAttempt());
        }
        if (viewEvent instanceof AbstractC27299a.w) {
            return new AbstractC28475a.x(((AbstractC27299a.w) viewEvent).getSurveyProvider());
        }
        if (AbstractC22676k.m65745e(viewEvent, AbstractC27299a.d.f109322a)) {
            return AbstractC28475a.d.f114818a;
        }
        throw new NoWhenBranchMatchedException();
    }

    public final InterfaceC13037f2 getViewState() {
        return this.viewState;
    }

    /* JADX INFO: renamed from: n */
    public final InterfaceC3027k1 m112316n(AbstractC27299a viewEvent) {
        AbstractC22676k.m65750j(viewEvent, "viewEvent");
        return AbstractC3006f0.m8732z(this.coroutineScope, null, null, new a(viewEvent, null), 3);
    }

    public /* synthetic */ C35386a(C28479e c28479e, C30778b c30778b, InterfaceC2994c0 interfaceC2994c0, InterfaceC34116n interfaceC34116n, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(c28479e, c30778b, (i13 & 4) != 0 ? new C28180m(null, 1, null) : interfaceC2994c0, (i13 & 8) != 0 ? AbstractC27308b.m82458a("CampaignStepsViewModel") : interfaceC34116n);
    }
}
