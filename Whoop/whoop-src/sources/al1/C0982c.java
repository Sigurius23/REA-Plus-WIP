package al1;

import androidx.core.app.NotificationCompat;
import androidx.lifecycle.AbstractC1637w1;
import bc3.AbstractC3006f0;
import bc3.InterfaceC2994c0;
import bl1.C3371b;
import bl1.InterfaceC3370a;
import c93.InterfaceC4351m;
import ec3.AbstractC13091v;
import ec3.C13096w1;
import ec3.C13105z1;
import ec3.InterfaceC13058l;
import ec3.InterfaceC13062m;
import ec3.InterfaceC13072o1;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
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
import wk1.AbstractC37337a;
import wk1.C37338b;

/* JADX INFO: renamed from: al1.c */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\t\b\u0001\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\f*\b\u0012\u0004\u0012\u00020\r0\fH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u001f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\f*\b\u0012\u0004\u0012\u00020\u000e0\fH\u0002¢\u0006\u0004\b\u0012\u0010\u0010J\u0013\u0010\u0014\u001a\u00020\r*\u00020\u0013H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0015\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\u0013¢\u0006\u0004\b\u0018\u0010\u0019J\u0015\u0010\u001b\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\u001a¢\u0006\u0004\b\u001b\u0010\u001cR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u001a\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00130%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u001d\u0010-\u001a\b\u0012\u0004\u0012\u00020\u00110\f8\u0006¢\u0006\f\n\u0004\b)\u0010*\u001a\u0004\b+\u0010,¨\u0006."}, m65681d2 = {"Lal1/c;", "Landroidx/lifecycle/w1;", "Lwk1/b;", "interactor", "Lal1/e;", "reducer", "Lbl1/b;", "analyticsHelper", "Lbc3/c0;", "coroutineScope", "<init>", "(Lwk1/b;Lal1/e;Lbl1/b;Lbc3/c0;)V", "Lec3/l;", "Lwk1/a;", "Lwk1/c;", "interact", "(Lec3/l;)Lec3/l;", "Lal1/d;", "o", "Lal1/a;", "r", "(Lal1/a;)Lwk1/a;", NotificationCompat.CATEGORY_EVENT, "Ll83/a0;", "q", "(Lal1/a;)V", "Lbl1/a;", "n", "(Lbl1/a;)V", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "Lwk1/b;", "x", "Lal1/e;", "y", "Lbl1/b;", "z", "Lbc3/c0;", "Lec3/o1;", "E", "Lec3/o1;", "coreEventFlow", "F", "Lec3/l;", "getViewState", "()Lec3/l;", "viewState", "help-center_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C0982c extends AbstractC1637w1 {

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    private final InterfaceC13072o1 coreEventFlow;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    private final InterfaceC13058l viewState;

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    private final C37338b interactor;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    private final C0984e reducer;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    private final C3371b analyticsHelper;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    private final InterfaceC2994c0 coroutineScope;

    /* JADX INFO: renamed from: al1.c$a */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.helpcenter.presentation.HelpCenterViewModel$sendViewEvent$1", m100430f = "HelpCenterViewModel.kt", m100431l = {38}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f3606w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ AbstractC0980a f3608y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(AbstractC0980a abstractC0980a, InterfaceC30057d<? super a> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f3608y = abstractC0980a;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C0982c.this.new a(this.f3608y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f3606w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC13072o1 interfaceC13072o1 = C0982c.this.coreEventFlow;
                AbstractC0980a abstractC0980a = this.f3608y;
                this.f3606w = 1;
                if (interfaceC13072o1.emit(abstractC0980a, this) == enumC31071a) {
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

    /* JADX INFO: renamed from: al1.c$b */
    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f3609w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C0982c f3610x;

        /* JADX INFO: renamed from: al1.c$b$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f3611w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C0982c f3612x;

            /* JADX INFO: renamed from: al1.c$b$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.helpcenter.presentation.HelpCenterViewModel$special$$inlined$map$1$2", m100430f = "HelpCenterViewModel.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C41280a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f3613E;

                /* JADX INFO: renamed from: F */
                Object f3614F;

                /* JADX INFO: renamed from: G */
                Object f3615G;

                /* JADX INFO: renamed from: H */
                int f3616H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f3617w;

                /* JADX INFO: renamed from: x */
                int f3618x;

                /* JADX INFO: renamed from: y */
                Object f3619y;

                public C41280a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f3617w = obj;
                    this.f3618x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m, C0982c c0982c) {
                this.f3611w = interfaceC13062m;
                this.f3612x = c0982c;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C41280a c41280a;
                if (interfaceC30057d instanceof C41280a) {
                    c41280a = (C41280a) interfaceC30057d;
                    int i13 = c41280a.f3618x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c41280a.f3618x = i13 - Integer.MIN_VALUE;
                    } else {
                        c41280a = new C41280a(interfaceC30057d);
                    }
                } else {
                    c41280a = new C41280a(interfaceC30057d);
                }
                Object obj2 = c41280a.f3617w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c41280a.f3618x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f3611w;
                    AbstractC37337a abstractC37337aM2674r = this.f3612x.m2674r((AbstractC0980a) obj);
                    c41280a.f3619y = null;
                    c41280a.f3613E = null;
                    c41280a.f3614F = null;
                    c41280a.f3615G = null;
                    c41280a.f3616H = 0;
                    c41280a.f3618x = 1;
                    if (interfaceC13062m.emit(abstractC37337aM2674r, c41280a) == enumC31071a) {
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

        public b(InterfaceC13058l interfaceC13058l, C0982c c0982c) {
            this.f3609w = interfaceC13058l;
            this.f3610x = c0982c;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f3609w.collect(new a(interfaceC13062m, this.f3610x), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0982c(C37338b interactor, C0984e reducer, C3371b analyticsHelper, InterfaceC2994c0 coroutineScope) {
        super(coroutineScope);
        AbstractC22676k.m65750j(interactor, "interactor");
        AbstractC22676k.m65750j(reducer, "reducer");
        AbstractC22676k.m65750j(analyticsHelper, "analyticsHelper");
        AbstractC22676k.m65750j(coroutineScope, "coroutineScope");
        this.interactor = interactor;
        this.reducer = reducer;
        this.analyticsHelper = analyticsHelper;
        this.coroutineScope = coroutineScope;
        C13096w1 c13096w1M36592b = AbstractC13091v.m36592b(0, 0, null, 7);
        this.coreEventFlow = c13096w1M36592b;
        this.viewState = AbstractC13091v.m36586L(m2672o(interact(new b(c13096w1M36592b, this))), coroutineScope, C13105z1.f45288a, 1);
    }

    private final InterfaceC13058l interact(InterfaceC13058l interfaceC13058l) {
        return this.interactor.m119576e(interfaceC13058l);
    }

    /* JADX INFO: renamed from: o */
    private final InterfaceC13058l m2672o(InterfaceC13058l interfaceC13058l) {
        return this.reducer.m2678a(interfaceC13058l, new C0981b(this, 0));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p */
    public static final C23454a0 m2673p(C0982c c0982c) {
        c0982c.analyticsHelper.m9738a(new InterfaceC3370a.g(null, null, null, null, null, 31, null));
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r */
    public final AbstractC37337a m2674r(AbstractC0980a abstractC0980a) {
        if (AbstractC22676k.m65745e(abstractC0980a, AbstractC0980a.b.f3597a)) {
            return AbstractC37337a.a.f159709a;
        }
        if (abstractC0980a instanceof AbstractC0980a.a) {
            return new AbstractC37337a.b(((AbstractC0980a.a) abstractC0980a).getAction());
        }
        throw new NoWhenBranchMatchedException();
    }

    public final InterfaceC13058l getViewState() {
        return this.viewState;
    }

    /* JADX INFO: renamed from: n */
    public final void m2675n(InterfaceC3370a event) {
        AbstractC22676k.m65750j(event, "event");
        C3371b c3371b = this.analyticsHelper;
        if (event instanceof InterfaceC3370a.h) {
            event = InterfaceC3370a.h.m9736f((InterfaceC3370a.h) event, null, null, "Red Dot Not Visible", null, null, 27, null);
        }
        c3371b.m9738a(event);
    }

    /* JADX INFO: renamed from: q */
    public final void m2676q(AbstractC0980a event) {
        AbstractC22676k.m65750j(event, "event");
        AbstractC3006f0.m8732z(this.coroutineScope, null, null, new a(event, null), 3);
    }

    public /* synthetic */ C0982c(C37338b c37338b, C0984e c0984e, C3371b c3371b, InterfaceC2994c0 interfaceC2994c0, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(c37338b, c0984e, c3371b, (i13 & 8) != 0 ? new C28180m(null, 1, null) : interfaceC2994c0);
    }
}
