package ly2;

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
import hy2.AbstractC17810a;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import iy2.AbstractC21034a;
import iy2.C21036c;
import jy2.C22051a;
import ky2.InterfaceC22898g;
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

/* JADX INFO: renamed from: ly2.a */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(m65680d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ'\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f*\b\u0012\u0004\u0012\u00020\f0\u000f2\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J'\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u000f*\b\u0012\u0004\u0012\u00020\u00100\u000f2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0015\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u001a\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\n0\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u001a\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u001d\u0010'\u001a\b\u0012\u0004\u0012\u00020\u00130\"8\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&¨\u0006("}, m65681d2 = {"Lly2/a;", "Landroidx/lifecycle/w1;", "Liy2/c;", "interactor", "Ljy2/a;", "viewStateReducer", "Lbc3/c0;", "coroutineScope", "<init>", "(Liy2/c;Ljy2/a;Lbc3/c0;)V", "Lhy2/a;", "viewEvent", "Liy2/a;", "p", "(Lhy2/a;)Liy2/a;", "Lec3/l;", "Liy2/b;", "l", "(Lec3/l;Liy2/c;)Lec3/l;", "Lky2/g;", "n", "(Lec3/l;Ljy2/a;)Lec3/l;", "Lbc3/k1;", "o", "(Lhy2/a;)Lbc3/k1;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "Lbc3/c0;", "Lec3/o1;", "x", "Lec3/o1;", "eventFlow", "y", "Lec3/l;", "domainState", "Lec3/f2;", "z", "Lec3/f2;", "getViewState", "()Lec3/f2;", "viewState", "whooplabs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C24803a extends AbstractC1637w1 {

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    private final InterfaceC2994c0 coroutineScope;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    private final InterfaceC13072o1 eventFlow;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    private final InterfaceC13058l domainState;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    private final InterfaceC13037f2 viewState;

    /* JADX INFO: renamed from: ly2.a$a */
    /* JADX INFO: loaded from: classes11.dex */
    @InterfaceC32271e(m100429c = "com.whoop.whooplabs.feature.campaignscreening.viewmodel.CampaignScreeningViewModel$sendViewEvent$1", m100430f = "CampaignScreeningViewModel.kt", m100431l = {39}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f97102w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ AbstractC17810a f97104y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(AbstractC17810a abstractC17810a, InterfaceC30057d<? super a> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f97104y = abstractC17810a;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C24803a.this.new a(this.f97104y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f97102w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC13072o1 interfaceC13072o1 = C24803a.this.eventFlow;
                AbstractC17810a abstractC17810a = this.f97104y;
                this.f97102w = 1;
                if (interfaceC13072o1.emit(abstractC17810a, this) == enumC31071a) {
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

    /* JADX INFO: renamed from: ly2.a$b */
    /* JADX INFO: loaded from: classes11.dex */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f97105w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C24803a f97106x;

        /* JADX INFO: renamed from: ly2.a$b$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f97107w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C24803a f97108x;

            /* JADX INFO: renamed from: ly2.a$b$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.whooplabs.feature.campaignscreening.viewmodel.CampaignScreeningViewModel$special$$inlined$map$1$2", m100430f = "CampaignScreeningViewModel.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C41979a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f97109E;

                /* JADX INFO: renamed from: F */
                Object f97110F;

                /* JADX INFO: renamed from: G */
                Object f97111G;

                /* JADX INFO: renamed from: H */
                int f97112H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f97113w;

                /* JADX INFO: renamed from: x */
                int f97114x;

                /* JADX INFO: renamed from: y */
                Object f97115y;

                public C41979a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f97113w = obj;
                    this.f97114x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m, C24803a c24803a) {
                this.f97107w = interfaceC13062m;
                this.f97108x = c24803a;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C41979a c41979a;
                if (interfaceC30057d instanceof C41979a) {
                    c41979a = (C41979a) interfaceC30057d;
                    int i13 = c41979a.f97114x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c41979a.f97114x = i13 - Integer.MIN_VALUE;
                    } else {
                        c41979a = new C41979a(interfaceC30057d);
                    }
                } else {
                    c41979a = new C41979a(interfaceC30057d);
                }
                Object obj2 = c41979a.f97113w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c41979a.f97114x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f97107w;
                    AbstractC21034a abstractC21034aM72713p = this.f97108x.m72713p((AbstractC17810a) obj);
                    c41979a.f97115y = null;
                    c41979a.f97109E = null;
                    c41979a.f97110F = null;
                    c41979a.f97111G = null;
                    c41979a.f97112H = 0;
                    c41979a.f97114x = 1;
                    if (interfaceC13062m.emit(abstractC21034aM72713p, c41979a) == enumC31071a) {
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

        public b(InterfaceC13058l interfaceC13058l, C24803a c24803a) {
            this.f97105w = interfaceC13058l;
            this.f97106x = c24803a;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f97105w.collect(new a(interfaceC13062m, this.f97106x), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C24803a(C21036c interactor, C22051a viewStateReducer, InterfaceC2994c0 coroutineScope) {
        super(coroutineScope);
        AbstractC22676k.m65750j(interactor, "interactor");
        AbstractC22676k.m65750j(viewStateReducer, "viewStateReducer");
        AbstractC22676k.m65750j(coroutineScope, "coroutineScope");
        this.coroutineScope = coroutineScope;
        C13096w1 c13096w1M36592b = AbstractC13091v.m36592b(0, 0, null, 7);
        this.eventFlow = c13096w1M36592b;
        InterfaceC13058l interfaceC13058lM72711l = m72711l(new b(c13096w1M36592b, this), interactor);
        C13021b2 c13021b2 = C13105z1.f45288a;
        C13078q1 c13078q1M36586L = AbstractC13091v.m36586L(interfaceC13058lM72711l, coroutineScope, c13021b2, 1);
        this.domainState = c13078q1M36586L;
        this.viewState = AbstractC13091v.m36587M(m72712n(c13078q1M36586L, viewStateReducer), coroutineScope, c13021b2, InterfaceC22898g.d.f90429a);
    }

    /* JADX INFO: renamed from: l */
    private final InterfaceC13058l m72711l(InterfaceC13058l interfaceC13058l, C21036c c21036c) {
        return c21036c.m58757n(interfaceC13058l);
    }

    /* JADX INFO: renamed from: n */
    private final InterfaceC13058l m72712n(InterfaceC13058l interfaceC13058l, C22051a c22051a) {
        return c22051a.m63124a(interfaceC13058l);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p */
    public final AbstractC21034a m72713p(AbstractC17810a viewEvent) {
        if (viewEvent instanceof AbstractC17810a.b) {
            AbstractC17810a.b bVar = (AbstractC17810a.b) viewEvent;
            return new AbstractC21034a.a(bVar.getCampaignId(), bVar.getSessionId());
        }
        if (AbstractC22676k.m65745e(viewEvent, AbstractC17810a.c.f69267a)) {
            return AbstractC21034a.b.f79660a;
        }
        if (viewEvent instanceof AbstractC17810a.d) {
            AbstractC17810a.d dVar = (AbstractC17810a.d) viewEvent;
            return new AbstractC21034a.d(dVar.getQuestionId(), dVar.getOptionKey());
        }
        if (viewEvent instanceof AbstractC17810a.a) {
            AbstractC17810a.a aVar = (AbstractC17810a.a) viewEvent;
            return new AbstractC21034a.f(aVar.getQuestionId(), aVar.getOptionKey(), aVar.getIsSelected());
        }
        if (AbstractC22676k.m65745e(viewEvent, AbstractC17810a.e.f69271a)) {
            return AbstractC21034a.c.f79661a;
        }
        if (viewEvent instanceof AbstractC17810a.f) {
            return new AbstractC21034a.e(((AbstractC17810a.f) viewEvent).getScreeningSubmissionResponse());
        }
        throw new NoWhenBranchMatchedException();
    }

    public final InterfaceC13037f2 getViewState() {
        return this.viewState;
    }

    /* JADX INFO: renamed from: o */
    public final InterfaceC3027k1 m72714o(AbstractC17810a viewEvent) {
        AbstractC22676k.m65750j(viewEvent, "viewEvent");
        return AbstractC3006f0.m8732z(this.coroutineScope, null, null, new a(viewEvent, null), 3);
    }

    public /* synthetic */ C24803a(C21036c c21036c, C22051a c22051a, InterfaceC2994c0 interfaceC2994c0, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(c21036c, c22051a, (i13 & 4) != 0 ? new C28180m(null, 1, null) : interfaceC2994c0);
    }
}
