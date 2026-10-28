package nt1;

import androidx.lifecycle.AbstractC1637w1;
import bc3.AbstractC3006f0;
import bc3.InterfaceC2994c0;
import bc3.InterfaceC3027k1;
import c93.InterfaceC4351m;
import ec3.AbstractC13091v;
import ec3.C13078q1;
import ec3.C13096w1;
import ec3.C13105z1;
import ec3.InterfaceC13058l;
import ec3.InterfaceC13062m;
import ec3.InterfaceC13072o1;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import kt1.C22827c;
import kt1.InterfaceC22825a;
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

/* JADX INFO: renamed from: nt1.c */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0001\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ'\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\n*\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\r\u0010\u000eJ'\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\u000f0\n*\b\u0012\u0004\u0012\u00020\f0\n2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0014\u001a\u00020\u000b2\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0015\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u001a\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00120\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u001a\u0010!\u001a\b\u0012\u0004\u0012\u00020\f0\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u001d\u0010%\u001a\b\u0012\u0004\u0012\u00020\u000f0\n8\u0006¢\u0006\f\n\u0004\b\"\u0010 \u001a\u0004\b#\u0010$¨\u0006&"}, m65681d2 = {"Lnt1/c;", "Landroidx/lifecycle/w1;", "Lkt1/c;", "interactor", "Lnt1/e;", "reducer", "Lbc3/c0;", "coroutineScope", "<init>", "(Lkt1/c;Lnt1/e;Lbc3/c0;)V", "Lec3/l;", "Lkt1/a;", "Lkt1/b;", "l", "(Lec3/l;Lkt1/c;)Lec3/l;", "Lnt1/d;", "o", "(Lec3/l;Lnt1/e;)Lec3/l;", "Lnt1/a$f;", "viewEvent", "n", "(Lnt1/a$f;)Lkt1/a;", "Lbc3/k1;", "p", "(Lnt1/a$f;)Lbc3/k1;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "Lbc3/c0;", "Lec3/o1;", "x", "Lec3/o1;", "eventFlow", "y", "Lec3/l;", "domainState", "z", "getViewState", "()Lec3/l;", "viewState", "labrador_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C27124c extends AbstractC1637w1 {

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    private final InterfaceC2994c0 coroutineScope;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    private final InterfaceC13072o1 eventFlow;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    private final InterfaceC13058l domainState;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    private final InterfaceC13058l viewState;

    /* JADX INFO: renamed from: nt1.c$a */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.labrador.feature.eligibility.presentation.LabradorEligibilityViewModel$sendViewEvent$1", m100430f = "LabradorEligibilityViewModel.kt", m100431l = {40}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f108413w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC27122a.f f108415y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(InterfaceC27122a.f fVar, InterfaceC30057d<? super a> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f108415y = fVar;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C27124c.this.new a(this.f108415y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f108413w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC13072o1 interfaceC13072o1 = C27124c.this.eventFlow;
                InterfaceC27122a.f fVar = this.f108415y;
                this.f108413w = 1;
                if (interfaceC13072o1.emit(fVar, this) == enumC31071a) {
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

    /* JADX INFO: renamed from: nt1.c$b */
    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f108416w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C27124c f108417x;

        /* JADX INFO: renamed from: nt1.c$b$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f108418w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C27124c f108419x;

            /* JADX INFO: renamed from: nt1.c$b$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.labrador.feature.eligibility.presentation.LabradorEligibilityViewModel$special$$inlined$map$1$2", m100430f = "LabradorEligibilityViewModel.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C42088a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f108420E;

                /* JADX INFO: renamed from: F */
                Object f108421F;

                /* JADX INFO: renamed from: G */
                Object f108422G;

                /* JADX INFO: renamed from: H */
                int f108423H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f108424w;

                /* JADX INFO: renamed from: x */
                int f108425x;

                /* JADX INFO: renamed from: y */
                Object f108426y;

                public C42088a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f108424w = obj;
                    this.f108425x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m, C27124c c27124c) {
                this.f108418w = interfaceC13062m;
                this.f108419x = c27124c;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C42088a c42088a;
                if (interfaceC30057d instanceof C42088a) {
                    c42088a = (C42088a) interfaceC30057d;
                    int i13 = c42088a.f108425x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c42088a.f108425x = i13 - Integer.MIN_VALUE;
                    } else {
                        c42088a = new C42088a(interfaceC30057d);
                    }
                } else {
                    c42088a = new C42088a(interfaceC30057d);
                }
                Object obj2 = c42088a.f108424w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c42088a.f108425x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f108418w;
                    InterfaceC22825a interfaceC22825aM81521n = this.f108419x.m81521n((InterfaceC27122a.f) obj);
                    c42088a.f108426y = null;
                    c42088a.f108420E = null;
                    c42088a.f108421F = null;
                    c42088a.f108422G = null;
                    c42088a.f108423H = 0;
                    c42088a.f108425x = 1;
                    if (interfaceC13062m.emit(interfaceC22825aM81521n, c42088a) == enumC31071a) {
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

        public b(InterfaceC13058l interfaceC13058l, C27124c c27124c) {
            this.f108416w = interfaceC13058l;
            this.f108417x = c27124c;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f108416w.collect(new a(interfaceC13062m, this.f108417x), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27124c(C22827c interactor, C27126e reducer, InterfaceC2994c0 coroutineScope) {
        super(coroutineScope);
        AbstractC22676k.m65750j(interactor, "interactor");
        AbstractC22676k.m65750j(reducer, "reducer");
        AbstractC22676k.m65750j(coroutineScope, "coroutineScope");
        this.coroutineScope = coroutineScope;
        C13096w1 c13096w1M36592b = AbstractC13091v.m36592b(0, 0, null, 7);
        this.eventFlow = c13096w1M36592b;
        C13078q1 c13078q1M36586L = AbstractC13091v.m36586L(m81520l(new b(c13096w1M36592b, this), interactor), coroutineScope, C13105z1.f45288a, 1);
        this.domainState = c13078q1M36586L;
        this.viewState = m81522o(c13078q1M36586L, reducer);
    }

    /* JADX INFO: renamed from: l */
    private final InterfaceC13058l m81520l(InterfaceC13058l interfaceC13058l, C22827c c22827c) {
        return c22827c.m66199e(interfaceC13058l);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: n */
    public final InterfaceC22825a m81521n(InterfaceC27122a.f viewEvent) {
        if (AbstractC22676k.m65745e(viewEvent, InterfaceC27122a.d.f108402a)) {
            return InterfaceC22825a.a.f89947a;
        }
        if (!(viewEvent instanceof InterfaceC27122a.e)) {
            throw new NoWhenBranchMatchedException();
        }
        InterfaceC27122a.e eVar = (InterfaceC27122a.e) viewEvent;
        return new InterfaceC22825a.b(eVar.getSetupRequirement(), eVar.getSelected());
    }

    /* JADX INFO: renamed from: o */
    private final InterfaceC13058l m81522o(InterfaceC13058l interfaceC13058l, C27126e c27126e) {
        return c27126e.m81547b(interfaceC13058l);
    }

    public final InterfaceC13058l getViewState() {
        return this.viewState;
    }

    /* JADX INFO: renamed from: p */
    public final InterfaceC3027k1 m81523p(InterfaceC27122a.f viewEvent) {
        AbstractC22676k.m65750j(viewEvent, "viewEvent");
        return AbstractC3006f0.m8732z(this.coroutineScope, null, null, new a(viewEvent, null), 3);
    }

    public /* synthetic */ C27124c(C22827c c22827c, C27126e c27126e, InterfaceC2994c0 interfaceC2994c0, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(c22827c, c27126e, (i13 & 4) != 0 ? new C28180m(null, 1, null) : interfaceC2994c0);
    }
}
