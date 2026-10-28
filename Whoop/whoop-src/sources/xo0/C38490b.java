package xo0;

import androidx.core.app.NotificationCompat;
import bc3.AbstractC3006f0;
import bc3.AbstractC3050q0;
import bc3.C3004e2;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4351m;
import e93.AbstractC12889b;
import ec3.AbstractC13091v;
import ec3.C13096w1;
import ec3.C13105z1;
import ec3.InterfaceC13058l;
import ec3.InterfaceC13062m;
import ec3.InterfaceC13072o1;
import ec3.InterfaceC13087t1;
import hc3.AbstractC17182o;
import kc3.C22365e;
import l83.C23454a0;
import ld1.AbstractC23864c;
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
import vo0.AbstractC36223a;
import vo0.C36224b;
import vo0.C36225c;
import yo0.C39684f;

/* JADX INFO: renamed from: xo0.b */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B!\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0013\u0010\r\u001a\u00020\f*\u00020\u0003H\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0017\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000f\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u001a\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u00030\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR \u0010\"\u001a\b\u0012\u0004\u0012\u00020\u00020\u001d8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!¨\u0006#"}, m65681d2 = {"Lxo0/b;", "Lld1/c;", "Lyo0/f;", "Lxo0/a;", "Lbc3/c0;", "coroutineScope", "Lvo0/c;", "coachOnboardingInteractor", "Lxo0/c;", "coachOnboardingViewStateReducer", "<init>", "(Lbc3/c0;Lvo0/c;Lxo0/c;)V", "Lvo0/a;", "q", "(Lxo0/a;)Lvo0/a;", NotificationCompat.CATEGORY_EVENT, "Ll83/a0;", "p", "(Lxo0/a;)V", "x", "Lbc3/c0;", "y", "Lvo0/c;", "z", "Lxo0/c;", "Lec3/o1;", "E", "Lec3/o1;", "eventFlow", "Lec3/t1;", "F", "Lec3/t1;", "o", "()Lec3/t1;", "viewState", "coach-everywhere_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C38490b extends AbstractC23864c<C39684f, AbstractC38489a> {

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    private final InterfaceC13072o1 eventFlow;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    private final InterfaceC13087t1 viewState;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    private final InterfaceC2994c0 coroutineScope;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    private final C36225c coachOnboardingInteractor;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    private final C38491c coachOnboardingViewStateReducer;

    /* JADX INFO: renamed from: xo0.b$a */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.coacheverywhere.onboarding.presentation.CoachOnboardingViewModel$sendViewEvent$1", m100430f = "CoachOnboardingViewModel.kt", m100431l = {32}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f164909w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ AbstractC38489a f164911y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(AbstractC38489a abstractC38489a, InterfaceC30057d<? super a> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f164911y = abstractC38489a;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C38490b.this.new a(this.f164911y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f164909w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC13072o1 interfaceC13072o1 = C38490b.this.eventFlow;
                AbstractC38489a abstractC38489a = this.f164911y;
                this.f164909w = 1;
                if (interfaceC13072o1.emit(abstractC38489a, this) == enumC31071a) {
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

    /* JADX INFO: renamed from: xo0.b$b */
    /* JADX INFO: loaded from: classes7.dex */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f164912w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C38490b f164913x;

        /* JADX INFO: renamed from: xo0.b$b$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f164914w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C38490b f164915x;

            /* JADX INFO: renamed from: xo0.b$b$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.coacheverywhere.onboarding.presentation.CoachOnboardingViewModel$special$$inlined$map$1$2", m100430f = "CoachOnboardingViewModel.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C42660a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f164916E;

                /* JADX INFO: renamed from: F */
                Object f164917F;

                /* JADX INFO: renamed from: G */
                Object f164918G;

                /* JADX INFO: renamed from: H */
                int f164919H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f164920w;

                /* JADX INFO: renamed from: x */
                int f164921x;

                /* JADX INFO: renamed from: y */
                Object f164922y;

                public C42660a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f164920w = obj;
                    this.f164921x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m, C38490b c38490b) {
                this.f164914w = interfaceC13062m;
                this.f164915x = c38490b;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C42660a c42660a;
                if (interfaceC30057d instanceof C42660a) {
                    c42660a = (C42660a) interfaceC30057d;
                    int i13 = c42660a.f164921x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c42660a.f164921x = i13 - Integer.MIN_VALUE;
                    } else {
                        c42660a = new C42660a(interfaceC30057d);
                    }
                } else {
                    c42660a = new C42660a(interfaceC30057d);
                }
                Object obj2 = c42660a.f164920w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c42660a.f164921x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f164914w;
                    AbstractC36223a abstractC36223aM123326q = this.f164915x.m123326q((AbstractC38489a) obj);
                    c42660a.f164922y = null;
                    c42660a.f164916E = null;
                    c42660a.f164917F = null;
                    c42660a.f164918G = null;
                    c42660a.f164919H = 0;
                    c42660a.f164921x = 1;
                    if (interfaceC13062m.emit(abstractC36223aM123326q, c42660a) == enumC31071a) {
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

        public b(InterfaceC13058l interfaceC13058l, C38490b c38490b) {
            this.f164912w = interfaceC13058l;
            this.f164913x = c38490b;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f164912w.collect(new a(interfaceC13062m, this.f164913x), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: xo0.b$c */
    /* JADX INFO: loaded from: classes7.dex */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f164924w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C38490b f164925x;

        /* JADX INFO: renamed from: xo0.b$c$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f164926w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C38490b f164927x;

            /* JADX INFO: renamed from: xo0.b$c$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.coacheverywhere.onboarding.presentation.CoachOnboardingViewModel$special$$inlined$map$2$2", m100430f = "CoachOnboardingViewModel.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C42661a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f164928E;

                /* JADX INFO: renamed from: F */
                Object f164929F;

                /* JADX INFO: renamed from: G */
                Object f164930G;

                /* JADX INFO: renamed from: H */
                int f164931H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f164932w;

                /* JADX INFO: renamed from: x */
                int f164933x;

                /* JADX INFO: renamed from: y */
                Object f164934y;

                public C42661a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f164932w = obj;
                    this.f164933x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m, C38490b c38490b) {
                this.f164926w = interfaceC13062m;
                this.f164927x = c38490b;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C42661a c42661a;
                if (interfaceC30057d instanceof C42661a) {
                    c42661a = (C42661a) interfaceC30057d;
                    int i13 = c42661a.f164933x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c42661a.f164933x = i13 - Integer.MIN_VALUE;
                    } else {
                        c42661a = new C42661a(interfaceC30057d);
                    }
                } else {
                    c42661a = new C42661a(interfaceC30057d);
                }
                Object obj2 = c42661a.f164932w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c42661a.f164933x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f164926w;
                    C39684f c39684fM123330a = this.f164927x.coachOnboardingViewStateReducer.m123330a((C36224b) obj);
                    c42661a.f164934y = null;
                    c42661a.f164928E = null;
                    c42661a.f164929F = null;
                    c42661a.f164930G = null;
                    c42661a.f164931H = 0;
                    c42661a.f164933x = 1;
                    if (interfaceC13062m.emit(c39684fM123330a, c42661a) == enumC31071a) {
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

        public c(InterfaceC13058l interfaceC13058l, C38490b c38490b) {
            this.f164924w = interfaceC13058l;
            this.f164925x = c38490b;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f164924w.collect(new a(interfaceC13062m, this.f164925x), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C38490b(InterfaceC2994c0 coroutineScope, C36225c coachOnboardingInteractor, C38491c coachOnboardingViewStateReducer) {
        super(coroutineScope);
        AbstractC22676k.m65750j(coroutineScope, "coroutineScope");
        AbstractC22676k.m65750j(coachOnboardingInteractor, "coachOnboardingInteractor");
        AbstractC22676k.m65750j(coachOnboardingViewStateReducer, "coachOnboardingViewStateReducer");
        this.coroutineScope = coroutineScope;
        this.coachOnboardingInteractor = coachOnboardingInteractor;
        this.coachOnboardingViewStateReducer = coachOnboardingViewStateReducer;
        C13096w1 c13096w1M36592b = AbstractC13091v.m36592b(0, 0, null, 7);
        this.eventFlow = c13096w1M36592b;
        this.viewState = AbstractC13091v.m36586L(new c(coachOnboardingInteractor.m115370m(new b(c13096w1M36592b, this)), this), coroutineScope, C13105z1.f45288a, 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q */
    public final AbstractC36223a m123326q(AbstractC38489a abstractC38489a) {
        if (abstractC38489a instanceof AbstractC38489a.a) {
            AbstractC38489a.a aVar = (AbstractC38489a.a) abstractC38489a;
            return new AbstractC36223a.a(aVar.getCoachOnboardingKey(), aVar.getOnboardingAnalyticSource());
        }
        if (AbstractC22676k.m65745e(abstractC38489a, AbstractC38489a.b.f164903a)) {
            return AbstractC36223a.b.f155067a;
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // ld1.AbstractC23864c
    /* JADX INFO: renamed from: o, reason: from getter */
    public InterfaceC13087t1 getViewState() {
        return this.viewState;
    }

    @Override // ld1.AbstractC23864c
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public void mo1216g(AbstractC38489a event) {
        AbstractC22676k.m65750j(event, "event");
        AbstractC3006f0.m8732z(this.coroutineScope, null, null, new a(event, null), 3);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public C38490b(InterfaceC2994c0 interfaceC2994c0, C36225c c36225c, C38491c c38491c, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        if ((i13 & 1) != 0) {
            C3004e2 c3004e2M8710d = AbstractC3006f0.m8710d();
            C22365e c22365e = AbstractC3050q0.f12077a;
            interfaceC2994c0 = AbstractC3006f0.m8708b(AbstractC12889b.m36254T(c3004e2M8710d, AbstractC17182o.f65999a.mo8825s()));
        }
        this(interfaceC2994c0, c36225c, c38491c);
    }
}
