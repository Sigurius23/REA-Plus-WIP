package rj2;

import androidx.lifecycle.AbstractC1637w1;
import bc3.AbstractC3006f0;
import bc3.InterfaceC2994c0;
import bc3.InterfaceC3027k1;
import c93.InterfaceC4351m;
import ec3.AbstractC13091v;
import ec3.C13015a0;
import ec3.C13096w1;
import ec3.InterfaceC13058l;
import ec3.InterfaceC13062m;
import ec3.InterfaceC13072o1;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import jj2.AbstractC21742b;
import kj2.AbstractC22529m;
import kj2.C22530n;
import l83.C23454a0;
import mj2.C25620a;
import mj2.C25623d;
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

/* JADX INFO: renamed from: rj2.b */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J'\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011*\b\u0012\u0004\u0012\u00020\u000e0\u00112\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J'\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u0011*\b\u0012\u0004\u0012\u00020\u00120\u00112\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J'\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00150\u0011*\b\u0012\u0004\u0012\u00020\u00150\u00112\u0006\u0010\u0018\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u0015\u0010\u001c\u001a\u00020\u001b2\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u001c\u0010\u001dR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001fR\u001a\u0010#\u001a\b\u0012\u0004\u0012\u00020\f0 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u001d\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00150\u00118\u0006¢\u0006\f\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'¨\u0006)"}, m65681d2 = {"Lrj2/b;", "Landroidx/lifecycle/w1;", "Lkj2/n;", "interactor", "Lmj2/d;", "viewStateReducer", "Lmj2/a;", "accumulatingReducer", "Lbc3/c0;", "coroutineScope", "<init>", "(Lkj2/n;Lmj2/d;Lmj2/a;Lbc3/c0;)V", "Ljj2/b;", "viewEvent", "Lkj2/m;", "q", "(Ljj2/b;)Lkj2/m;", "Lec3/l;", "Lnj2/r;", "n", "(Lec3/l;Lkj2/n;)Lec3/l;", "Lnj2/t;", "o", "(Lec3/l;Lmj2/d;)Lec3/l;", "reducer", "l", "(Lec3/l;Lmj2/a;)Lec3/l;", "Lbc3/k1;", "p", "(Ljj2/b;)Lbc3/k1;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "Lbc3/c0;", "Lec3/o1;", "x", "Lec3/o1;", "eventFlow", "y", "Lec3/l;", "getViewState", "()Lec3/l;", "viewState", "stress_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C31490b extends AbstractC1637w1 {

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    private final InterfaceC2994c0 coroutineScope;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    private final InterfaceC13072o1 eventFlow;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    private final InterfaceC13058l viewState;

    /* JADX INFO: renamed from: rj2.b$a */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.stress.viewmodel.StressSessionViewModel$sendViewEvent$1", m100430f = "StressSessionViewModel.kt", m100431l = {37}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f129850w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ AbstractC21742b f129852y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(AbstractC21742b abstractC21742b, InterfaceC30057d<? super a> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f129852y = abstractC21742b;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C31490b.this.new a(this.f129852y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f129850w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC13072o1 interfaceC13072o1 = C31490b.this.eventFlow;
                AbstractC21742b abstractC21742b = this.f129852y;
                this.f129850w = 1;
                if (interfaceC13072o1.emit(abstractC21742b, this) == enumC31071a) {
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

    /* JADX INFO: renamed from: rj2.b$b */
    /* JADX INFO: loaded from: classes10.dex */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f129853w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C31490b f129854x;

        /* JADX INFO: renamed from: rj2.b$b$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f129855w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C31490b f129856x;

            /* JADX INFO: renamed from: rj2.b$b$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.stress.viewmodel.StressSessionViewModel$special$$inlined$map$1$2", m100430f = "StressSessionViewModel.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C42281a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f129857E;

                /* JADX INFO: renamed from: F */
                Object f129858F;

                /* JADX INFO: renamed from: G */
                Object f129859G;

                /* JADX INFO: renamed from: H */
                int f129860H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f129861w;

                /* JADX INFO: renamed from: x */
                int f129862x;

                /* JADX INFO: renamed from: y */
                Object f129863y;

                public C42281a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f129861w = obj;
                    this.f129862x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m, C31490b c31490b) {
                this.f129855w = interfaceC13062m;
                this.f129856x = c31490b;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C42281a c42281a;
                if (interfaceC30057d instanceof C42281a) {
                    c42281a = (C42281a) interfaceC30057d;
                    int i13 = c42281a.f129862x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c42281a.f129862x = i13 - Integer.MIN_VALUE;
                    } else {
                        c42281a = new C42281a(interfaceC30057d);
                    }
                } else {
                    c42281a = new C42281a(interfaceC30057d);
                }
                Object obj2 = c42281a.f129861w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c42281a.f129862x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f129855w;
                    AbstractC22529m abstractC22529mM97002q = this.f129856x.m97002q((AbstractC21742b) obj);
                    c42281a.f129863y = null;
                    c42281a.f129857E = null;
                    c42281a.f129858F = null;
                    c42281a.f129859G = null;
                    c42281a.f129860H = 0;
                    c42281a.f129862x = 1;
                    if (interfaceC13062m.emit(abstractC22529mM97002q, c42281a) == enumC31071a) {
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

        public b(InterfaceC13058l interfaceC13058l, C31490b c31490b) {
            this.f129853w = interfaceC13058l;
            this.f129854x = c31490b;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f129853w.collect(new a(interfaceC13062m, this.f129854x), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: rj2.b$c */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.stress.viewmodel.StressSessionViewModel$viewState$1", m100430f = "StressSessionViewModel.kt", m100431l = {30}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lec3/m;", "Ljj2/b;", "Ll83/a0;", "<anonymous>", "(Lec3/m;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class c extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f129865w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f129866x;

        public c(InterfaceC30057d<? super c> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            c cVar = new c(interfaceC30057d);
            cVar.f129866x = obj;
            return cVar;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC13062m interfaceC13062m, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((c) create(interfaceC13062m, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            InterfaceC13062m interfaceC13062m = (InterfaceC13062m) this.f129866x;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f129865w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                AbstractC21742b.b bVar = AbstractC21742b.b.f83608a;
                this.f129866x = null;
                this.f129865w = 1;
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C31490b(C22530n interactor, C25623d viewStateReducer, C25620a accumulatingReducer, InterfaceC2994c0 coroutineScope) {
        super(coroutineScope);
        AbstractC22676k.m65750j(interactor, "interactor");
        AbstractC22676k.m65750j(viewStateReducer, "viewStateReducer");
        AbstractC22676k.m65750j(accumulatingReducer, "accumulatingReducer");
        AbstractC22676k.m65750j(coroutineScope, "coroutineScope");
        this.coroutineScope = coroutineScope;
        C13096w1 c13096w1M36592b = AbstractC13091v.m36592b(0, 0, null, 7);
        this.eventFlow = c13096w1M36592b;
        this.viewState = m96999l(m97001o(AbstractC13091v.m36610t(m97000n(new b(new C13015a0(new c(null), c13096w1M36592b), this), interactor)), viewStateReducer), accumulatingReducer);
    }

    /* JADX INFO: renamed from: l */
    private final InterfaceC13058l m96999l(InterfaceC13058l interfaceC13058l, C25620a c25620a) {
        return c25620a.m75352a(interfaceC13058l);
    }

    /* JADX INFO: renamed from: n */
    private final InterfaceC13058l m97000n(InterfaceC13058l interfaceC13058l, C22530n c22530n) {
        return c22530n.m65118l(interfaceC13058l);
    }

    /* JADX INFO: renamed from: o */
    private final InterfaceC13058l m97001o(InterfaceC13058l interfaceC13058l, C25623d c25623d) {
        return c25623d.m75387f(interfaceC13058l);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q */
    public final AbstractC22529m m97002q(AbstractC21742b viewEvent) {
        if (viewEvent instanceof AbstractC21742b.b) {
            return AbstractC22529m.b.f88475a;
        }
        if (viewEvent instanceof AbstractC21742b.d) {
            AbstractC21742b.d dVar = (AbstractC21742b.d) viewEvent;
            return new AbstractC22529m.d(dVar.getSelectedCycle(), dVar.getSelectedSpeed());
        }
        if (viewEvent instanceof AbstractC21742b.a) {
            return new AbstractC22529m.a(((AbstractC21742b.a) viewEvent).m61350a());
        }
        if (AbstractC22676k.m65745e(viewEvent, AbstractC21742b.c.f83609a)) {
            return AbstractC22529m.c.f88476a;
        }
        throw new NoWhenBranchMatchedException();
    }

    public final InterfaceC13058l getViewState() {
        return this.viewState;
    }

    /* JADX INFO: renamed from: p */
    public final InterfaceC3027k1 m97003p(AbstractC21742b viewEvent) {
        AbstractC22676k.m65750j(viewEvent, "viewEvent");
        return AbstractC3006f0.m8732z(this.coroutineScope, null, null, new a(viewEvent, null), 3);
    }

    public /* synthetic */ C31490b(C22530n c22530n, C25623d c25623d, C25620a c25620a, InterfaceC2994c0 interfaceC2994c0, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(c22530n, c25623d, c25620a, (i13 & 8) != 0 ? new C28180m(null, 1, null) : interfaceC2994c0);
    }
}
