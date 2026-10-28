package by2;

import androidx.lifecycle.AbstractC1637w1;
import ay2.InterfaceC2155a;
import bc3.AbstractC3006f0;
import bc3.InterfaceC2994c0;
import bc3.InterfaceC3027k1;
import bo2.C3509a;
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
import wx2.AbstractC37687a;
import xx2.AbstractC38694a;
import xx2.C38696c;
import yx2.C39846a;

/* JADX INFO: renamed from: by2.a */
/* JADX INFO: loaded from: classes5.dex */
@Metadata(m65680d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ'\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u000f*\b\u0012\u0004\u0012\u00020\u00100\u000f2\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J'\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00140\u000f*\b\u0012\u0004\u0012\u00020\u00110\u000f2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u0015\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u0018\u0010\u0019R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u001b\u0010!\u001a\u00020\u001c8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b\u001d\u0010\u001e\u001a\u0004\b\u001f\u0010 R\u001a\u0010%\u001a\b\u0012\u0004\u0012\u00020\n0\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u001a\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00110\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u001d\u0010.\u001a\b\u0012\u0004\u0012\u00020\u00140)8\u0006¢\u0006\f\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-¨\u0006/"}, m65681d2 = {"Lby2/a;", "Landroidx/lifecycle/w1;", "Lxx2/c;", "interactor", "Lyx2/a;", "viewStateReducer", "Lbc3/c0;", "coroutineScope", "<init>", "(Lxx2/c;Lyx2/a;Lbc3/c0;)V", "Lwx2/a;", "viewEvent", "Lxx2/a$a;", "r", "(Lwx2/a;)Lxx2/a$a;", "Lec3/l;", "Lxx2/a;", "Lxx2/b;", "n", "(Lec3/l;Lxx2/c;)Lec3/l;", "Lay2/a;", "p", "(Lec3/l;Lyx2/a;)Lec3/l;", "Lbc3/k1;", "q", "(Lwx2/a;)Lbc3/k1;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "Lbc3/c0;", "Ltr2/n;", "x", "Ll83/h;", "getLog", "()Ltr2/n;", "log", "Lec3/o1;", "y", "Lec3/o1;", "eventFlow", "z", "Lec3/l;", "domainState", "Lec3/f2;", "E", "Lec3/f2;", "getViewState", "()Lec3/f2;", "viewState", "whooplabs_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C3701a extends AbstractC1637w1 {

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

    /* JADX INFO: renamed from: by2.a$a */
    /* JADX INFO: loaded from: classes11.dex */
    @InterfaceC32271e(m100429c = "com.whoop.whooplabs.feature.campaignlist.viewmodel.CampaignListViewModel$sendViewEvent$1", m100430f = "CampaignListViewModel.kt", m100431l = {44}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f15127w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ AbstractC37687a f15129y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(AbstractC37687a abstractC37687a, InterfaceC30057d<? super a> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f15129y = abstractC37687a;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C3701a.this.new a(this.f15129y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f15127w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC13072o1 interfaceC13072o1 = C3701a.this.eventFlow;
                AbstractC37687a abstractC37687a = this.f15129y;
                this.f15127w = 1;
                if (interfaceC13072o1.emit(abstractC37687a, this) == enumC31071a) {
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

    /* JADX INFO: renamed from: by2.a$b */
    /* JADX INFO: loaded from: classes11.dex */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f15130w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C3701a f15131x;

        /* JADX INFO: renamed from: by2.a$b$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f15132w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C3701a f15133x;

            /* JADX INFO: renamed from: by2.a$b$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.whooplabs.feature.campaignlist.viewmodel.CampaignListViewModel$special$$inlined$map$1$2", m100430f = "CampaignListViewModel.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C41332a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f15134E;

                /* JADX INFO: renamed from: F */
                Object f15135F;

                /* JADX INFO: renamed from: G */
                Object f15136G;

                /* JADX INFO: renamed from: H */
                int f15137H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f15138w;

                /* JADX INFO: renamed from: x */
                int f15139x;

                /* JADX INFO: renamed from: y */
                Object f15140y;

                public C41332a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f15138w = obj;
                    this.f15139x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m, C3701a c3701a) {
                this.f15132w = interfaceC13062m;
                this.f15133x = c3701a;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C41332a c41332a;
                if (interfaceC30057d instanceof C41332a) {
                    c41332a = (C41332a) interfaceC30057d;
                    int i13 = c41332a.f15139x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c41332a.f15139x = i13 - Integer.MIN_VALUE;
                    } else {
                        c41332a = new C41332a(interfaceC30057d);
                    }
                } else {
                    c41332a = new C41332a(interfaceC30057d);
                }
                Object obj2 = c41332a.f15138w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c41332a.f15139x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f15132w;
                    AbstractC38694a.a aVarM11525r = this.f15133x.m11525r((AbstractC37687a) obj);
                    c41332a.f15140y = null;
                    c41332a.f15134E = null;
                    c41332a.f15135F = null;
                    c41332a.f15136G = null;
                    c41332a.f15137H = 0;
                    c41332a.f15139x = 1;
                    if (interfaceC13062m.emit(aVarM11525r, c41332a) == enumC31071a) {
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

        public b(InterfaceC13058l interfaceC13058l, C3701a c3701a) {
            this.f15130w = interfaceC13058l;
            this.f15131x = c3701a;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f15130w.collect(new a(interfaceC13062m, this.f15131x), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3701a(C38696c interactor, C39846a viewStateReducer, InterfaceC2994c0 coroutineScope) {
        super(coroutineScope);
        AbstractC22676k.m65750j(interactor, "interactor");
        AbstractC22676k.m65750j(viewStateReducer, "viewStateReducer");
        AbstractC22676k.m65750j(coroutineScope, "coroutineScope");
        this.coroutineScope = coroutineScope;
        this.log = AbstractC30060g.m92088H(new C3509a(15));
        C13096w1 c13096w1M36592b = AbstractC13091v.m36592b(0, 0, null, 7);
        this.eventFlow = c13096w1M36592b;
        InterfaceC13058l interfaceC13058lM11522n = m11522n(new b(c13096w1M36592b, this), interactor);
        C13021b2 c13021b2 = C13105z1.f45288a;
        C13078q1 c13078q1M36586L = AbstractC13091v.m36586L(interfaceC13058lM11522n, coroutineScope, c13021b2, 1);
        this.domainState = c13078q1M36586L;
        this.viewState = AbstractC13091v.m36587M(m11524p(c13078q1M36586L, viewStateReducer), coroutineScope, c13021b2, InterfaceC2155a.c.f8569a);
    }

    /* JADX INFO: renamed from: n */
    private final InterfaceC13058l m11522n(InterfaceC13058l interfaceC13058l, C38696c c38696c) {
        return c38696c.m124106d(interfaceC13058l);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o */
    public static final InterfaceC34116n m11523o() {
        return AbstractC27308b.m82458a("CampaignListViewModel");
    }

    /* JADX INFO: renamed from: p */
    private final InterfaceC13058l m11524p(InterfaceC13058l interfaceC13058l, C39846a c39846a) {
        return c39846a.m127927c(interfaceC13058l);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r */
    public final AbstractC38694a.a m11525r(AbstractC37687a viewEvent) {
        if (!AbstractC22676k.m65745e(viewEvent, AbstractC37687a.a.f161490a) && !AbstractC22676k.m65745e(viewEvent, AbstractC37687a.b.f161491a)) {
            throw new NoWhenBranchMatchedException();
        }
        return AbstractC38694a.a.f166503a;
    }

    public final InterfaceC13037f2 getViewState() {
        return this.viewState;
    }

    /* JADX INFO: renamed from: q */
    public final InterfaceC3027k1 m11526q(AbstractC37687a viewEvent) {
        AbstractC22676k.m65750j(viewEvent, "viewEvent");
        return AbstractC3006f0.m8732z(this.coroutineScope, null, null, new a(viewEvent, null), 3);
    }

    public /* synthetic */ C3701a(C38696c c38696c, C39846a c39846a, InterfaceC2994c0 interfaceC2994c0, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(c38696c, c39846a, (i13 & 4) != 0 ? new C28180m(null, 1, null) : interfaceC2994c0);
    }
}
