package j12;

import androidx.core.app.NotificationCompat;
import bc3.AbstractC3006f0;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4351m;
import ec3.AbstractC13091v;
import ec3.C13096w1;
import ec3.C13105z1;
import ec3.InterfaceC13058l;
import ec3.InterfaceC13062m;
import ec3.InterfaceC13072o1;
import ec3.InterfaceC13087t1;
import k12.AbstractC22125a;
import k12.C22126b;
import l83.C23454a0;
import ld1.AbstractC23864c;
import m12.C24937e;
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

/* JADX INFO: renamed from: j12.c */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000R\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B!\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0013\u0010\r\u001a\u00020\f*\u00020\u0003H\u0002¢\u0006\u0004\b\r\u0010\u000eJ'\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u000f*\b\u0012\u0004\u0012\u00020\f0\u000f2\u0006\u0010\u0010\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0017\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0014\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0016\u0010\u0017R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00030\u001a8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u001cR \u0010#\u001a\b\u0012\u0004\u0012\u00020\u00020\u001e8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b!\u0010\"¨\u0006$"}, m65681d2 = {"Lj12/c;", "Lld1/c;", "Lm12/e;", "Lj12/a;", "Lbc3/c0;", "coroutineScope", "Lj12/b;", "onboardingOverlayInteractor", "Lj12/d;", "onboardingOverlayViewStateReducer", "<init>", "(Lbc3/c0;Lj12/b;Lj12/d;)V", "Lk12/a;", "q", "(Lj12/a;)Lk12/a;", "Lec3/l;", "interactor", "Lk12/b;", "o", "(Lec3/l;Lj12/b;)Lec3/l;", NotificationCompat.CATEGORY_EVENT, "Ll83/a0;", "p", "(Lj12/a;)V", "x", "Lbc3/c0;", "Lec3/o1;", "y", "Lec3/o1;", "eventFlow", "Lec3/t1;", "z", "Lec3/t1;", "n", "()Lec3/t1;", "viewState", "onboarding-story_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C21218c extends AbstractC23864c<C24937e, AbstractC21216a> {

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    private final InterfaceC2994c0 coroutineScope;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    private final InterfaceC13072o1 eventFlow;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    private final InterfaceC13087t1 viewState;

    /* JADX INFO: renamed from: j12.c$a */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.onboarding.overlay.OnboardingOverlayViewModel$sendViewEvent$1", m100430f = "OnboardingOverlayViewModel.kt", m100431l = {31}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f80982w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ AbstractC21216a f80984y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(AbstractC21216a abstractC21216a, InterfaceC30057d<? super a> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f80984y = abstractC21216a;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C21218c.this.new a(this.f80984y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f80982w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC13072o1 interfaceC13072o1 = C21218c.this.eventFlow;
                AbstractC21216a abstractC21216a = this.f80984y;
                this.f80982w = 1;
                if (interfaceC13072o1.emit(abstractC21216a, this) == enumC31071a) {
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

    /* JADX INFO: renamed from: j12.c$b */
    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f80985w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C21218c f80986x;

        /* JADX INFO: renamed from: j12.c$b$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f80987w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C21218c f80988x;

            /* JADX INFO: renamed from: j12.c$b$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.onboarding.overlay.OnboardingOverlayViewModel$special$$inlined$map$1$2", m100430f = "OnboardingOverlayViewModel.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C41819a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f80989E;

                /* JADX INFO: renamed from: F */
                Object f80990F;

                /* JADX INFO: renamed from: G */
                Object f80991G;

                /* JADX INFO: renamed from: H */
                int f80992H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f80993w;

                /* JADX INFO: renamed from: x */
                int f80994x;

                /* JADX INFO: renamed from: y */
                Object f80995y;

                public C41819a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f80993w = obj;
                    this.f80994x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m, C21218c c21218c) {
                this.f80987w = interfaceC13062m;
                this.f80988x = c21218c;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C41819a c41819a;
                if (interfaceC30057d instanceof C41819a) {
                    c41819a = (C41819a) interfaceC30057d;
                    int i13 = c41819a.f80994x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c41819a.f80994x = i13 - Integer.MIN_VALUE;
                    } else {
                        c41819a = new C41819a(interfaceC30057d);
                    }
                } else {
                    c41819a = new C41819a(interfaceC30057d);
                }
                Object obj2 = c41819a.f80993w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c41819a.f80994x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f80987w;
                    AbstractC22125a abstractC22125aM59536q = this.f80988x.m59536q((AbstractC21216a) obj);
                    c41819a.f80995y = null;
                    c41819a.f80989E = null;
                    c41819a.f80990F = null;
                    c41819a.f80991G = null;
                    c41819a.f80992H = 0;
                    c41819a.f80994x = 1;
                    if (interfaceC13062m.emit(abstractC22125aM59536q, c41819a) == enumC31071a) {
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

        public b(InterfaceC13058l interfaceC13058l, C21218c c21218c) {
            this.f80985w = interfaceC13058l;
            this.f80986x = c21218c;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f80985w.collect(new a(interfaceC13062m, this.f80986x), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: j12.c$c */
    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f80997w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C21219d f80998x;

        /* JADX INFO: renamed from: j12.c$c$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f80999w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C21219d f81000x;

            /* JADX INFO: renamed from: j12.c$c$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.onboarding.overlay.OnboardingOverlayViewModel$special$$inlined$map$2$2", m100430f = "OnboardingOverlayViewModel.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C41820a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f81001E;

                /* JADX INFO: renamed from: F */
                Object f81002F;

                /* JADX INFO: renamed from: G */
                Object f81003G;

                /* JADX INFO: renamed from: H */
                int f81004H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f81005w;

                /* JADX INFO: renamed from: x */
                int f81006x;

                /* JADX INFO: renamed from: y */
                Object f81007y;

                public C41820a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f81005w = obj;
                    this.f81006x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m, C21219d c21219d) {
                this.f80999w = interfaceC13062m;
                this.f81000x = c21219d;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C41820a c41820a;
                if (interfaceC30057d instanceof C41820a) {
                    c41820a = (C41820a) interfaceC30057d;
                    int i13 = c41820a.f81006x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c41820a.f81006x = i13 - Integer.MIN_VALUE;
                    } else {
                        c41820a = new C41820a(interfaceC30057d);
                    }
                } else {
                    c41820a = new C41820a(interfaceC30057d);
                }
                Object obj2 = c41820a.f81005w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c41820a.f81006x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f80999w;
                    C24937e c24937eM59539a = this.f81000x.m59539a((C22126b) obj);
                    c41820a.f81007y = null;
                    c41820a.f81001E = null;
                    c41820a.f81002F = null;
                    c41820a.f81003G = null;
                    c41820a.f81004H = 0;
                    c41820a.f81006x = 1;
                    if (interfaceC13062m.emit(c24937eM59539a, c41820a) == enumC31071a) {
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

        public c(InterfaceC13058l interfaceC13058l, C21219d c21219d) {
            this.f80997w = interfaceC13058l;
            this.f80998x = c21219d;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f80997w.collect(new a(interfaceC13062m, this.f80998x), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C21218c(InterfaceC2994c0 coroutineScope, C21217b onboardingOverlayInteractor, C21219d onboardingOverlayViewStateReducer) {
        super(coroutineScope);
        AbstractC22676k.m65750j(coroutineScope, "coroutineScope");
        AbstractC22676k.m65750j(onboardingOverlayInteractor, "onboardingOverlayInteractor");
        AbstractC22676k.m65750j(onboardingOverlayViewStateReducer, "onboardingOverlayViewStateReducer");
        this.coroutineScope = coroutineScope;
        C13096w1 c13096w1M36592b = AbstractC13091v.m36592b(0, 0, null, 7);
        this.eventFlow = c13096w1M36592b;
        this.viewState = AbstractC13091v.m36586L(new c(m59535o(new b(c13096w1M36592b, this), onboardingOverlayInteractor), onboardingOverlayViewStateReducer), coroutineScope, C13105z1.f45288a, 1);
    }

    /* JADX INFO: renamed from: o */
    private final InterfaceC13058l m59535o(InterfaceC13058l interfaceC13058l, C21217b c21217b) {
        return c21217b.m59530j(interfaceC13058l);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q */
    public final AbstractC22125a m59536q(AbstractC21216a abstractC21216a) {
        if (abstractC21216a instanceof AbstractC21216a.a) {
            return new AbstractC22125a.b(((AbstractC21216a.a) abstractC21216a).getEducationKey());
        }
        if (AbstractC22676k.m65745e(abstractC21216a, AbstractC21216a.b.f80915a)) {
            return AbstractC22125a.a.f85842a;
        }
        if (AbstractC22676k.m65745e(abstractC21216a, AbstractC21216a.c.f80916a)) {
            return AbstractC22125a.c.f85844a;
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // ld1.AbstractC23864c
    /* JADX INFO: renamed from: n, reason: from getter */
    public InterfaceC13087t1 getViewState() {
        return this.viewState;
    }

    @Override // ld1.AbstractC23864c
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public void mo1216g(AbstractC21216a event) {
        AbstractC22676k.m65750j(event, "event");
        AbstractC3006f0.m8732z(this.coroutineScope, null, null, new a(event, null), 3);
    }

    public /* synthetic */ C21218c(InterfaceC2994c0 interfaceC2994c0, C21217b c21217b, C21219d c21219d, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this((i13 & 1) != 0 ? new C28180m(null, 1, null) : interfaceC2994c0, c21217b, c21219d);
    }
}
