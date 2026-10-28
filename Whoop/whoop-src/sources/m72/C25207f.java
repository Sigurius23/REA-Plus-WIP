package m72;

import androidx.lifecycle.AbstractC1637w1;
import bc3.AbstractC3006f0;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4351m;
import d61.InterfaceC11732a;
import d72.AbstractC11760a;
import d72.C11762c;
import ec3.AbstractC13091v;
import ec3.C13078q1;
import ec3.C13096w1;
import ec3.C13105z1;
import ec3.InterfaceC13058l;
import ec3.InterfaceC13062m;
import ec3.InterfaceC13072o1;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import l83.C23454a0;
import n72.C26441d;
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

/* JADX INFO: renamed from: m72.f */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ'\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\n*\b\u0012\u0004\u0012\u00020\u000b0\n2\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J'\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\n*\b\u0012\u0004\u0012\u00020\f0\n2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0015\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u001a\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001dR\u001a\u0010!\u001a\b\u0012\u0004\u0012\u00020\f0\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u001d\u0010%\u001a\b\u0012\u0004\u0012\u00020\u00130\n8\u0006¢\u0006\f\n\u0004\b\"\u0010 \u001a\u0004\b#\u0010$¨\u0006&"}, m65681d2 = {"Lm72/f;", "Landroidx/lifecycle/w1;", "Ld72/c;", "interactor", "Ln72/d;", "reducer", "Lbc3/c0;", "coroutineScope", "<init>", "(Ld72/c;Ln72/d;Lbc3/c0;)V", "Lec3/l;", "Ld72/a;", "Ld72/b;", "l", "(Lec3/l;Ld72/c;)Lec3/l;", "Lm72/e;", "viewEvent", "p", "(Lm72/e;)Ld72/a;", "Lm72/g;", "n", "(Lec3/l;Ln72/d;)Lec3/l;", "Ll83/a0;", "o", "(Lm72/e;)V", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "Lbc3/c0;", "Lec3/o1;", "x", "Lec3/o1;", "eventFlow", "y", "Lec3/l;", "domainState", "z", "getViewState", "()Lec3/l;", "viewState", "sage_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C25207f extends AbstractC1637w1 {

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    private final InterfaceC2994c0 coroutineScope;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    private final InterfaceC13072o1 eventFlow;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    private final InterfaceC13058l domainState;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    private final InterfaceC13058l viewState;

    /* JADX INFO: renamed from: m72.f$a */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.sage.presentation.SageViewModel$sendViewEvent$1", m100430f = "SageViewModel.kt", m100431l = {39}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f98988w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ AbstractC25206e f98989x;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ C25207f f98990y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(AbstractC25206e abstractC25206e, C25207f c25207f, InterfaceC30057d<? super a> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f98989x = abstractC25206e;
            this.f98990y = c25207f;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return new a(this.f98989x, this.f98990y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f98988w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                AbstractC25206e abstractC25206e = this.f98989x;
                if (!(abstractC25206e instanceof AbstractC25206e.a) || !(((AbstractC25206e.a) abstractC25206e).getAction() instanceof InterfaceC11732a)) {
                    InterfaceC13072o1 interfaceC13072o1 = this.f98990y.eventFlow;
                    AbstractC25206e abstractC25206e2 = this.f98989x;
                    this.f98988w = 1;
                    if (interfaceC13072o1.emit(abstractC25206e2, this) == enumC31071a) {
                        return enumC31071a;
                    }
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

    /* JADX INFO: renamed from: m72.f$b */
    /* JADX INFO: loaded from: classes10.dex */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f98991w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C25207f f98992x;

        /* JADX INFO: renamed from: m72.f$b$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f98993w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C25207f f98994x;

            /* JADX INFO: renamed from: m72.f$b$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.sage.presentation.SageViewModel$special$$inlined$map$1$2", m100430f = "SageViewModel.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C41986a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f98995E;

                /* JADX INFO: renamed from: F */
                Object f98996F;

                /* JADX INFO: renamed from: G */
                Object f98997G;

                /* JADX INFO: renamed from: H */
                int f98998H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f98999w;

                /* JADX INFO: renamed from: x */
                int f99000x;

                /* JADX INFO: renamed from: y */
                Object f99001y;

                public C41986a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f98999w = obj;
                    this.f99000x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m, C25207f c25207f) {
                this.f98993w = interfaceC13062m;
                this.f98994x = c25207f;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C41986a c41986a;
                if (interfaceC30057d instanceof C41986a) {
                    c41986a = (C41986a) interfaceC30057d;
                    int i13 = c41986a.f99000x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c41986a.f99000x = i13 - Integer.MIN_VALUE;
                    } else {
                        c41986a = new C41986a(interfaceC30057d);
                    }
                } else {
                    c41986a = new C41986a(interfaceC30057d);
                }
                Object obj2 = c41986a.f98999w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c41986a.f99000x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f98993w;
                    AbstractC11760a abstractC11760aM73817p = this.f98994x.m73817p((AbstractC25206e) obj);
                    c41986a.f99001y = null;
                    c41986a.f98995E = null;
                    c41986a.f98996F = null;
                    c41986a.f98997G = null;
                    c41986a.f98998H = 0;
                    c41986a.f99000x = 1;
                    if (interfaceC13062m.emit(abstractC11760aM73817p, c41986a) == enumC31071a) {
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

        public b(InterfaceC13058l interfaceC13058l, C25207f c25207f) {
            this.f98991w = interfaceC13058l;
            this.f98992x = c25207f;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f98991w.collect(new a(interfaceC13062m, this.f98992x), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C25207f(C11762c interactor, C26441d reducer, InterfaceC2994c0 coroutineScope) {
        super(coroutineScope);
        AbstractC22676k.m65750j(interactor, "interactor");
        AbstractC22676k.m65750j(reducer, "reducer");
        AbstractC22676k.m65750j(coroutineScope, "coroutineScope");
        this.coroutineScope = coroutineScope;
        C13096w1 c13096w1M36592b = AbstractC13091v.m36592b(0, 0, null, 7);
        this.eventFlow = c13096w1M36592b;
        C13078q1 c13078q1M36586L = AbstractC13091v.m36586L(m73815l(new b(c13096w1M36592b, this), interactor), coroutineScope, C13105z1.f45288a, 1);
        this.domainState = c13078q1M36586L;
        this.viewState = m73816n(c13078q1M36586L, reducer);
    }

    /* JADX INFO: renamed from: l */
    private final InterfaceC13058l m73815l(InterfaceC13058l interfaceC13058l, C11762c c11762c) {
        return c11762c.interact(interfaceC13058l);
    }

    /* JADX INFO: renamed from: n */
    private final InterfaceC13058l m73816n(InterfaceC13058l interfaceC13058l, C26441d c26441d) {
        return c26441d.m78286f(interfaceC13058l);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p */
    public final AbstractC11760a m73817p(AbstractC25206e viewEvent) {
        if (viewEvent instanceof AbstractC25206e.c) {
            return new AbstractC11760a.c(((AbstractC25206e.c) viewEvent).getCom.mapbox.common.HttpHeaders.DATE java.lang.String());
        }
        if (AbstractC22676k.m65745e(viewEvent, AbstractC25206e.d.f98983a)) {
            return AbstractC11760a.d.f38039a;
        }
        if (viewEvent instanceof AbstractC25206e.a) {
            return new AbstractC11760a.a(((AbstractC25206e.a) viewEvent).getAction());
        }
        if (viewEvent instanceof AbstractC25206e.b) {
            return new AbstractC11760a.b(((AbstractC25206e.b) viewEvent).getId());
        }
        throw new NoWhenBranchMatchedException();
    }

    public final InterfaceC13058l getViewState() {
        return this.viewState;
    }

    /* JADX INFO: renamed from: o */
    public final void m73818o(AbstractC25206e viewEvent) {
        AbstractC22676k.m65750j(viewEvent, "viewEvent");
        AbstractC3006f0.m8732z(this.coroutineScope, null, null, new a(viewEvent, this, null), 3);
    }

    public /* synthetic */ C25207f(C11762c c11762c, C26441d c26441d, InterfaceC2994c0 interfaceC2994c0, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(c11762c, c26441d, (i13 & 4) != 0 ? new C28180m(null, 1, null) : interfaceC2994c0);
    }
}
