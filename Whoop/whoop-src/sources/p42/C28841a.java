package p42;

import androidx.lifecycle.AbstractC1637w1;
import bc3.AbstractC3006f0;
import bc3.InterfaceC2994c0;
import bc3.InterfaceC3027k1;
import c93.InterfaceC4351m;
import ec3.AbstractC13091v;
import ec3.C13015a0;
import ec3.C13078q1;
import ec3.C13096w1;
import ec3.C13105z1;
import ec3.InterfaceC13058l;
import ec3.InterfaceC13062m;
import ec3.InterfaceC13072o1;
import ec3.InterfaceC13087t1;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import j42.AbstractC21316a;
import k42.AbstractC22195e;
import k42.C22197g;
import l83.C23454a0;
import m42.C25054a;
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

/* JADX INFO: renamed from: p42.a */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ'\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f*\b\u0012\u0004\u0012\u00020\f0\u000f2\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J'\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u000f*\b\u0012\u0004\u0012\u00020\u00100\u000f2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0015\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u001a\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\n0\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u001a\u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00100\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u001d\u0010'\u001a\b\u0012\u0004\u0012\u00020\u00130\u000f8\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&¨\u0006("}, m65681d2 = {"Lp42/a;", "Landroidx/lifecycle/w1;", "Lk42/g;", "interactor", "Lm42/a;", "viewStateReducer", "Lbc3/c0;", "coroutineScope", "<init>", "(Lk42/g;Lm42/a;Lbc3/c0;)V", "Lj42/a;", "viewEvent", "Lk42/e;", "p", "(Lj42/a;)Lk42/e;", "Lec3/l;", "Lk42/f;", "l", "(Lec3/l;Lk42/g;)Lec3/l;", "Ln42/h;", "n", "(Lec3/l;Lm42/a;)Lec3/l;", "Lbc3/k1;", "o", "(Lj42/a;)Lbc3/k1;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "Lbc3/c0;", "Lec3/o1;", "x", "Lec3/o1;", "eventFlow", "Lec3/t1;", "y", "Lec3/t1;", "domainState", "z", "Lec3/l;", "getViewState", "()Lec3/l;", "viewState", "privacy-consent_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C28841a extends AbstractC1637w1 {

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    private final InterfaceC2994c0 coroutineScope;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    private final InterfaceC13072o1 eventFlow;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    private final InterfaceC13087t1 domainState;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    private final InterfaceC13058l viewState;

    /* JADX INFO: renamed from: p42.a$a */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.privacyconsent.viewmodel.PrivacyConsentViewModel$domainState$1", m100430f = "PrivacyConsentViewModel.kt", m100431l = {30}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lec3/m;", "Lj42/a;", "Ll83/a0;", "<anonymous>", "(Lec3/m;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f116742w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f116743x;

        public a(InterfaceC30057d<? super a> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            a aVar = new a(interfaceC30057d);
            aVar.f116743x = obj;
            return aVar;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC13062m interfaceC13062m, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((a) create(interfaceC13062m, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            InterfaceC13062m interfaceC13062m = (InterfaceC13062m) this.f116743x;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f116742w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                AbstractC21316a.b bVar = AbstractC21316a.b.f81510a;
                this.f116743x = null;
                this.f116742w = 1;
                if (interfaceC13062m.emit(bVar, this) == enumC31071a) {
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

    /* JADX INFO: renamed from: p42.a$b */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.privacyconsent.viewmodel.PrivacyConsentViewModel$sendViewEvent$1", m100430f = "PrivacyConsentViewModel.kt", m100431l = {38}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class b extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f116744w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ AbstractC21316a f116746y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(AbstractC21316a abstractC21316a, InterfaceC30057d<? super b> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f116746y = abstractC21316a;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C28841a.this.new b(this.f116746y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((b) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f116744w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC13072o1 interfaceC13072o1 = C28841a.this.eventFlow;
                AbstractC21316a abstractC21316a = this.f116746y;
                this.f116744w = 1;
                if (interfaceC13072o1.emit(abstractC21316a, this) == enumC31071a) {
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

    /* JADX INFO: renamed from: p42.a$c */
    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f116747w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C28841a f116748x;

        /* JADX INFO: renamed from: p42.a$c$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f116749w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C28841a f116750x;

            /* JADX INFO: renamed from: p42.a$c$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.privacyconsent.viewmodel.PrivacyConsentViewModel$special$$inlined$map$1$2", m100430f = "PrivacyConsentViewModel.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C42152a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f116751E;

                /* JADX INFO: renamed from: F */
                Object f116752F;

                /* JADX INFO: renamed from: G */
                Object f116753G;

                /* JADX INFO: renamed from: H */
                int f116754H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f116755w;

                /* JADX INFO: renamed from: x */
                int f116756x;

                /* JADX INFO: renamed from: y */
                Object f116757y;

                public C42152a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f116755w = obj;
                    this.f116756x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m, C28841a c28841a) {
                this.f116749w = interfaceC13062m;
                this.f116750x = c28841a;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C42152a c42152a;
                if (interfaceC30057d instanceof C42152a) {
                    c42152a = (C42152a) interfaceC30057d;
                    int i13 = c42152a.f116756x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c42152a.f116756x = i13 - Integer.MIN_VALUE;
                    } else {
                        c42152a = new C42152a(interfaceC30057d);
                    }
                } else {
                    c42152a = new C42152a(interfaceC30057d);
                }
                Object obj2 = c42152a.f116755w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c42152a.f116756x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f116749w;
                    AbstractC22195e abstractC22195eM87733p = this.f116750x.m87733p((AbstractC21316a) obj);
                    c42152a.f116757y = null;
                    c42152a.f116751E = null;
                    c42152a.f116752F = null;
                    c42152a.f116753G = null;
                    c42152a.f116754H = 0;
                    c42152a.f116756x = 1;
                    if (interfaceC13062m.emit(abstractC22195eM87733p, c42152a) == enumC31071a) {
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

        public c(InterfaceC13058l interfaceC13058l, C28841a c28841a) {
            this.f116747w = interfaceC13058l;
            this.f116748x = c28841a;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f116747w.collect(new a(interfaceC13062m, this.f116748x), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C28841a(C22197g interactor, C25054a viewStateReducer, InterfaceC2994c0 coroutineScope) {
        super(coroutineScope);
        AbstractC22676k.m65750j(interactor, "interactor");
        AbstractC22676k.m65750j(viewStateReducer, "viewStateReducer");
        AbstractC22676k.m65750j(coroutineScope, "coroutineScope");
        this.coroutineScope = coroutineScope;
        C13096w1 c13096w1M36592b = AbstractC13091v.m36592b(0, 0, null, 7);
        this.eventFlow = c13096w1M36592b;
        C13078q1 c13078q1M36586L = AbstractC13091v.m36586L(m87731l(new c(new C13015a0(new a(null), c13096w1M36592b), this), interactor), coroutineScope, C13105z1.f45288a, 1);
        this.domainState = c13078q1M36586L;
        this.viewState = m87732n(c13078q1M36586L, viewStateReducer);
    }

    /* JADX INFO: renamed from: l */
    private final InterfaceC13058l m87731l(InterfaceC13058l interfaceC13058l, C22197g c22197g) {
        return c22197g.interact(interfaceC13058l);
    }

    /* JADX INFO: renamed from: n */
    private final InterfaceC13058l m87732n(InterfaceC13058l interfaceC13058l, C25054a c25054a) {
        return c25054a.m73532h(interfaceC13058l);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p */
    public final AbstractC22195e m87733p(AbstractC21316a viewEvent) {
        if (AbstractC22676k.m65745e(viewEvent, AbstractC21316a.c.f81511a)) {
            return AbstractC22195e.c.f86094a;
        }
        if (AbstractC22676k.m65745e(viewEvent, AbstractC21316a.b.f81510a)) {
            return AbstractC22195e.b.f86093a;
        }
        if (viewEvent instanceof AbstractC21316a.f) {
            AbstractC21316a.f fVar = (AbstractC21316a.f) viewEvent;
            return new AbstractC22195e.f(fVar.getSearchable(), fVar.getMutualCommunitySharing());
        }
        if (viewEvent instanceof AbstractC21316a.a) {
            AbstractC21316a.a aVar = (AbstractC21316a.a) viewEvent;
            return new AbstractC22195e.a(aVar.getSearchable(), aVar.getMutualCommunitySharing());
        }
        if (viewEvent instanceof AbstractC21316a.g) {
            return new AbstractC22195e.g(((AbstractC21316a.g) viewEvent).getIsEnabled());
        }
        if (viewEvent instanceof AbstractC21316a.e) {
            return new AbstractC22195e.e(((AbstractC21316a.e) viewEvent).getAccountName());
        }
        if (viewEvent instanceof AbstractC21316a.d) {
            return new AbstractC22195e.d(((AbstractC21316a.d) viewEvent).getIsEnabled());
        }
        throw new NoWhenBranchMatchedException();
    }

    public final InterfaceC13058l getViewState() {
        return this.viewState;
    }

    /* JADX INFO: renamed from: o */
    public final InterfaceC3027k1 m87734o(AbstractC21316a viewEvent) {
        AbstractC22676k.m65750j(viewEvent, "viewEvent");
        return AbstractC3006f0.m8732z(this.coroutineScope, null, null, new b(viewEvent, null), 3);
    }

    public /* synthetic */ C28841a(C22197g c22197g, C25054a c25054a, InterfaceC2994c0 interfaceC2994c0, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(c22197g, c25054a, (i13 & 4) != 0 ? new C28180m(null, 1, null) : interfaceC2994c0);
    }
}
