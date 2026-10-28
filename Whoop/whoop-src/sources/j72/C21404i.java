package j72;

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
import g72.AbstractC15547a;
import g72.C15549c;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import k72.C22270a;
import l83.C23454a0;
import od1.AbstractC27845h;
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

/* JADX INFO: renamed from: j72.i */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J'\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u0011*\b\u0012\u0004\u0012\u00020\u00120\u00112\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0015\u0010\u0017\u001a\u00020\u00162\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u0017\u0010\u0018R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u001a\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\f0\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u001a\u0010!\u001a\b\u0012\u0004\u0012\u00020\u00120\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u001d\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00130\u00118\u0006¢\u0006\f\n\u0004\b\"\u0010 \u001a\u0004\b#\u0010$¨\u0006&"}, m65681d2 = {"Lj72/i;", "Landroidx/lifecycle/w1;", "Lg72/c;", "interactor", "Lk72/a;", "reducer", "", "skipToManualEntry", "Lbc3/c0;", "coroutineScope", "<init>", "(Lg72/c;Lk72/a;ZLbc3/c0;)V", "Lj72/h;", "viewEvent", "Lg72/a;", "o", "(Lj72/h;)Lg72/a;", "Lec3/l;", "Lg72/b;", "Lj72/j;", "l", "(Lec3/l;Lk72/a;)Lec3/l;", "Ll83/a0;", "n", "(Lj72/h;)V", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "Lbc3/c0;", "Lec3/o1;", "x", "Lec3/o1;", "eventFlow", "y", "Lec3/l;", "domainState", "z", "getViewState", "()Lec3/l;", "viewState", "sage_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C21404i extends AbstractC1637w1 {

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    private final InterfaceC2994c0 coroutineScope;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    private final InterfaceC13072o1 eventFlow;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    private final InterfaceC13058l domainState;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    private final InterfaceC13058l viewState;

    /* JADX INFO: renamed from: j72.i$a */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.sage.onboarding.presentation.SageOnboardingViewModel$sendViewEvent$1", m100430f = "SageOnboardingViewModel.kt", m100431l = {41}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f82041w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ AbstractC21403h f82043y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(AbstractC21403h abstractC21403h, InterfaceC30057d<? super a> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f82043y = abstractC21403h;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C21404i.this.new a(this.f82043y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f82041w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC13072o1 interfaceC13072o1 = C21404i.this.eventFlow;
                AbstractC21403h abstractC21403h = this.f82043y;
                this.f82041w = 1;
                if (interfaceC13072o1.emit(abstractC21403h, this) == enumC31071a) {
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

    /* JADX INFO: renamed from: j72.i$b */
    /* JADX INFO: loaded from: classes10.dex */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f82044w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C21404i f82045x;

        /* JADX INFO: renamed from: j72.i$b$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f82046w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C21404i f82047x;

            /* JADX INFO: renamed from: j72.i$b$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.sage.onboarding.presentation.SageOnboardingViewModel$special$$inlined$map$1$2", m100430f = "SageOnboardingViewModel.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C41831a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f82048E;

                /* JADX INFO: renamed from: F */
                Object f82049F;

                /* JADX INFO: renamed from: G */
                Object f82050G;

                /* JADX INFO: renamed from: H */
                int f82051H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f82052w;

                /* JADX INFO: renamed from: x */
                int f82053x;

                /* JADX INFO: renamed from: y */
                Object f82054y;

                public C41831a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f82052w = obj;
                    this.f82053x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m, C21404i c21404i) {
                this.f82046w = interfaceC13062m;
                this.f82047x = c21404i;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C41831a c41831a;
                if (interfaceC30057d instanceof C41831a) {
                    c41831a = (C41831a) interfaceC30057d;
                    int i13 = c41831a.f82053x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c41831a.f82053x = i13 - Integer.MIN_VALUE;
                    } else {
                        c41831a = new C41831a(interfaceC30057d);
                    }
                } else {
                    c41831a = new C41831a(interfaceC30057d);
                }
                Object obj2 = c41831a.f82052w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c41831a.f82053x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f82046w;
                    AbstractC15547a abstractC15547aM60144o = this.f82047x.m60144o((AbstractC21403h) obj);
                    c41831a.f82054y = null;
                    c41831a.f82048E = null;
                    c41831a.f82049F = null;
                    c41831a.f82050G = null;
                    c41831a.f82051H = 0;
                    c41831a.f82053x = 1;
                    if (interfaceC13062m.emit(abstractC15547aM60144o, c41831a) == enumC31071a) {
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

        public b(InterfaceC13058l interfaceC13058l, C21404i c21404i) {
            this.f82044w = interfaceC13058l;
            this.f82045x = c21404i;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f82044w.collect(new a(interfaceC13062m, this.f82045x), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C21404i(C15549c interactor, C22270a reducer, boolean z4, InterfaceC2994c0 coroutineScope) {
        super(coroutineScope);
        AbstractC22676k.m65750j(interactor, "interactor");
        AbstractC22676k.m65750j(reducer, "reducer");
        AbstractC22676k.m65750j(coroutineScope, "coroutineScope");
        this.coroutineScope = coroutineScope;
        C13096w1 c13096w1M36592b = AbstractC13091v.m36592b(0, 0, null, 7);
        this.eventFlow = c13096w1M36592b;
        C13078q1 c13078q1M36586L = AbstractC13091v.m36586L(AbstractC27845h.m83945a(new b(c13096w1M36592b, this), interactor), coroutineScope, C13105z1.f45288a, 1);
        this.domainState = c13078q1M36586L;
        this.viewState = m60143l(c13078q1M36586L, reducer);
        m60145n(new AbstractC21403h.c(z4));
    }

    /* JADX INFO: renamed from: l */
    private final InterfaceC13058l m60143l(InterfaceC13058l interfaceC13058l, C22270a c22270a) {
        return c22270a.m63996h(interfaceC13058l);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: o */
    public final AbstractC15547a m60144o(AbstractC21403h viewEvent) {
        if (viewEvent instanceof AbstractC21403h.d) {
            AbstractC21403h.d dVar = (AbstractC21403h.d) viewEvent;
            return new AbstractC15547a.b(dVar.getNextId(), dVar.getData());
        }
        if (viewEvent instanceof AbstractC21403h.c) {
            return new AbstractC15547a.c(((AbstractC21403h.c) viewEvent).getSkipToManualEntry());
        }
        if (AbstractC22676k.m65745e(viewEvent, AbstractC21403h.a.f82031a)) {
            return AbstractC15547a.a.f58310a;
        }
        if (!(viewEvent instanceof AbstractC21403h.b)) {
            throw new NoWhenBranchMatchedException();
        }
        AbstractC21403h.b bVar = (AbstractC21403h.b) viewEvent;
        return new AbstractC15547a.d(bVar.getProgressResult(), bVar.getSaveRequest());
    }

    public final InterfaceC13058l getViewState() {
        return this.viewState;
    }

    /* JADX INFO: renamed from: n */
    public final void m60145n(AbstractC21403h viewEvent) {
        AbstractC22676k.m65750j(viewEvent, "viewEvent");
        AbstractC3006f0.m8732z(this.coroutineScope, null, null, new a(viewEvent, null), 3);
    }

    public /* synthetic */ C21404i(C15549c c15549c, C22270a c22270a, boolean z4, InterfaceC2994c0 interfaceC2994c0, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(c15549c, c22270a, z4, (i13 & 8) != 0 ? new C28180m(null, 1, null) : interfaceC2994c0);
    }
}
