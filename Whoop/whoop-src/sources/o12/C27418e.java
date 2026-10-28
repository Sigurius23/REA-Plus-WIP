package o12;

import androidx.core.app.NotificationCompat;
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
import ec3.InterfaceC13058l;
import ec3.InterfaceC13062m;
import ec3.InterfaceC13072o1;
import ec3.InterfaceC13087t1;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import l83.C23454a0;
import or2.C28180m;
import p12.C28735y;
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
import z82.InterfaceC40188b;
import zr2.AbstractC41071b;
import zr2.InterfaceC41070a;

/* JADX INFO: renamed from: o12.e */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000x\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ'\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000e*\b\u0012\u0004\u0012\u00020\u000f0\u000e2\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J'\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u000e*\b\u0012\u0004\u0012\u00020\u00100\u000e2\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0018\u001a\u00020\u000f2\u0006\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0015\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ9\u0010#\u001a\u00020\"2\u0006\u0010\u001e\u001a\u00020\u001d2\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u001d2\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u001d2\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u001d¢\u0006\u0004\b#\u0010$J\r\u0010%\u001a\u00020\"¢\u0006\u0004\b%\u0010&J\r\u0010(\u001a\u00020'¢\u0006\u0004\b(\u0010)R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/R\u001a\u00103\u001a\b\u0012\u0004\u0012\u00020\u0016008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102R\u0016\u00106\u001a\u00020'8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b4\u00105R\u001a\u0010:\u001a\b\u0012\u0004\u0012\u00020\u0010078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u00109R\u001d\u0010?\u001a\b\u0012\u0004\u0012\u00020\u00130\u000e8\u0006¢\u0006\f\n\u0004\b;\u0010<\u001a\u0004\b=\u0010>¨\u0006@"}, m65681d2 = {"Lo12/e;", "Landroidx/lifecycle/w1;", "Lo12/c;", "interactor", "Lo12/f;", "viewStateReducer", "Lz82/b;", "analyticsManager", "Lbc3/c0;", "closeableCoroutineScope", "Lzr2/a;", "dateAndTimeProvider", "<init>", "(Lo12/c;Lo12/f;Lz82/b;Lbc3/c0;Lzr2/a;)V", "Lec3/l;", "Lo12/a;", "Lo12/h;", "n", "(Lec3/l;Lo12/c;)Lec3/l;", "Lp12/y;", "o", "(Lec3/l;Lo12/f;)Lec3/l;", "Lo12/d;", "viewEvent", "t", "(Lo12/d;)Lo12/a;", "Lbc3/k1;", "q", "(Lo12/d;)Lbc3/k1;", "", NotificationCompat.CATEGORY_EVENT, "category", "action", "label", "Ll83/a0;", "p", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "r", "()V", "", "l", "()I", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "Lz82/b;", "x", "Lbc3/c0;", "y", "Lzr2/a;", "Lec3/o1;", "z", "Lec3/o1;", "eventFlow", "E", "I", "initialTime", "Lec3/t1;", "F", "Lec3/t1;", "domainState", "G", "Lec3/l;", "getViewState", "()Lec3/l;", "viewState", "onboarding-story_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C27418e extends AbstractC1637w1 {

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    private int initialTime;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    private final InterfaceC13087t1 domainState;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    private final InterfaceC13058l viewState;

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    private final InterfaceC40188b analyticsManager;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    private final InterfaceC2994c0 closeableCoroutineScope;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    private final InterfaceC41070a dateAndTimeProvider;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    private final InterfaceC13072o1 eventFlow;

    /* JADX INFO: renamed from: o12.e$a */
    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f110435w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C27419f f110436x;

        /* JADX INFO: renamed from: o12.e$a$a, reason: collision with other inner class name */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class C42107a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f110437w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C27419f f110438x;

            /* JADX INFO: renamed from: o12.e$a$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.onboarding.story.OnboardingStoryViewModel$reduce$$inlined$map$1$2", m100430f = "OnboardingStoryViewModel.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C42108a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f110439E;

                /* JADX INFO: renamed from: F */
                Object f110440F;

                /* JADX INFO: renamed from: G */
                Object f110441G;

                /* JADX INFO: renamed from: H */
                int f110442H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f110443w;

                /* JADX INFO: renamed from: x */
                int f110444x;

                /* JADX INFO: renamed from: y */
                Object f110445y;

                public C42108a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f110443w = obj;
                    this.f110444x |= Integer.MIN_VALUE;
                    return C42107a.this.emit(null, this);
                }
            }

            public C42107a(InterfaceC13062m interfaceC13062m, C27419f c27419f) {
                this.f110437w = interfaceC13062m;
                this.f110438x = c27419f;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C42108a c42108a;
                if (interfaceC30057d instanceof C42108a) {
                    c42108a = (C42108a) interfaceC30057d;
                    int i13 = c42108a.f110444x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c42108a.f110444x = i13 - Integer.MIN_VALUE;
                    } else {
                        c42108a = new C42108a(interfaceC30057d);
                    }
                } else {
                    c42108a = new C42108a(interfaceC30057d);
                }
                Object obj2 = c42108a.f110443w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c42108a.f110444x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f110437w;
                    C28735y c28735yM82839g = this.f110438x.m82839g((C27421h) obj);
                    c42108a.f110445y = null;
                    c42108a.f110439E = null;
                    c42108a.f110440F = null;
                    c42108a.f110441G = null;
                    c42108a.f110442H = 0;
                    c42108a.f110444x = 1;
                    if (interfaceC13062m.emit(c28735yM82839g, c42108a) == enumC31071a) {
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

        public a(InterfaceC13058l interfaceC13058l, C27419f c27419f) {
            this.f110435w = interfaceC13058l;
            this.f110436x = c27419f;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f110435w.collect(new C42107a(interfaceC13062m, this.f110436x), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: o12.e$b */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.onboarding.story.OnboardingStoryViewModel$sendViewEvent$1", m100430f = "OnboardingStoryViewModel.kt", m100431l = {31}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class b extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f110447w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ AbstractC27417d f110449y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(AbstractC27417d abstractC27417d, InterfaceC30057d<? super b> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f110449y = abstractC27417d;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C27418e.this.new b(this.f110449y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((b) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f110447w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC13072o1 interfaceC13072o1 = C27418e.this.eventFlow;
                AbstractC27417d abstractC27417d = this.f110449y;
                this.f110447w = 1;
                if (interfaceC13072o1.emit(abstractC27417d, this) == enumC31071a) {
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

    /* JADX INFO: renamed from: o12.e$c */
    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f110450w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C27418e f110451x;

        /* JADX INFO: renamed from: o12.e$c$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f110452w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C27418e f110453x;

            /* JADX INFO: renamed from: o12.e$c$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.onboarding.story.OnboardingStoryViewModel$special$$inlined$map$1$2", m100430f = "OnboardingStoryViewModel.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C42109a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f110454E;

                /* JADX INFO: renamed from: F */
                Object f110455F;

                /* JADX INFO: renamed from: G */
                Object f110456G;

                /* JADX INFO: renamed from: H */
                int f110457H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f110458w;

                /* JADX INFO: renamed from: x */
                int f110459x;

                /* JADX INFO: renamed from: y */
                Object f110460y;

                public C42109a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f110458w = obj;
                    this.f110459x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m, C27418e c27418e) {
                this.f110452w = interfaceC13062m;
                this.f110453x = c27418e;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C42109a c42109a;
                if (interfaceC30057d instanceof C42109a) {
                    c42109a = (C42109a) interfaceC30057d;
                    int i13 = c42109a.f110459x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c42109a.f110459x = i13 - Integer.MIN_VALUE;
                    } else {
                        c42109a = new C42109a(interfaceC30057d);
                    }
                } else {
                    c42109a = new C42109a(interfaceC30057d);
                }
                Object obj2 = c42109a.f110458w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c42109a.f110459x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f110452w;
                    AbstractC27414a abstractC27414aM82819t = this.f110453x.m82819t((AbstractC27417d) obj);
                    c42109a.f110460y = null;
                    c42109a.f110454E = null;
                    c42109a.f110455F = null;
                    c42109a.f110456G = null;
                    c42109a.f110457H = 0;
                    c42109a.f110459x = 1;
                    if (interfaceC13062m.emit(abstractC27414aM82819t, c42109a) == enumC31071a) {
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

        public c(InterfaceC13058l interfaceC13058l, C27418e c27418e) {
            this.f110450w = interfaceC13058l;
            this.f110451x = c27418e;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f110450w.collect(new a(interfaceC13062m, this.f110451x), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C27418e(C27416c interactor, C27419f viewStateReducer, InterfaceC40188b analyticsManager, InterfaceC2994c0 closeableCoroutineScope, InterfaceC41070a dateAndTimeProvider) {
        super(closeableCoroutineScope);
        AbstractC22676k.m65750j(interactor, "interactor");
        AbstractC22676k.m65750j(viewStateReducer, "viewStateReducer");
        AbstractC22676k.m65750j(analyticsManager, "analyticsManager");
        AbstractC22676k.m65750j(closeableCoroutineScope, "closeableCoroutineScope");
        AbstractC22676k.m65750j(dateAndTimeProvider, "dateAndTimeProvider");
        this.analyticsManager = analyticsManager;
        this.closeableCoroutineScope = closeableCoroutineScope;
        this.dateAndTimeProvider = dateAndTimeProvider;
        C13096w1 c13096w1M36592b = AbstractC13091v.m36592b(0, 0, null, 7);
        this.eventFlow = c13096w1M36592b;
        InterfaceC13058l interfaceC13058lM82817n = m82817n(new c(c13096w1M36592b, this), interactor);
        C13021b2 c13021b2 = C13105z1.f45288a;
        C13078q1 c13078q1M36586L = AbstractC13091v.m36586L(interfaceC13058lM82817n, closeableCoroutineScope, c13021b2, 1);
        this.domainState = c13078q1M36586L;
        this.viewState = m82818o(AbstractC13091v.m36586L(c13078q1M36586L, closeableCoroutineScope, c13021b2, 1), viewStateReducer);
    }

    /* JADX INFO: renamed from: n */
    private final InterfaceC13058l m82817n(InterfaceC13058l interfaceC13058l, C27416c c27416c) {
        return c27416c.m82808t(interfaceC13058l);
    }

    /* JADX INFO: renamed from: o */
    private final InterfaceC13058l m82818o(InterfaceC13058l interfaceC13058l, C27419f c27419f) {
        return new a(interfaceC13058l, c27419f);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: t */
    public final AbstractC27414a m82819t(AbstractC27417d viewEvent) {
        if (viewEvent instanceof AbstractC27417d.d) {
            return new AbstractC27414a.f(((AbstractC27417d.d) viewEvent).getType());
        }
        if (viewEvent instanceof AbstractC27417d.e) {
            return AbstractC27414a.e.f110389a;
        }
        if (viewEvent instanceof AbstractC27417d.f) {
            return new AbstractC27414a.a(m82820l());
        }
        if (viewEvent instanceof AbstractC27417d.b) {
            return new AbstractC27414a.c(((AbstractC27417d.b) viewEvent).getFeatureEducationId());
        }
        if (viewEvent instanceof AbstractC27417d.c) {
            return new AbstractC27414a.d(((AbstractC27417d.c) viewEvent).getId());
        }
        if (viewEvent instanceof AbstractC27417d.g) {
            return AbstractC27414a.g.f110391a;
        }
        if (viewEvent instanceof AbstractC27417d.a) {
            return new AbstractC27414a.b(((AbstractC27417d.a) viewEvent).getCategoryIndex());
        }
        if (viewEvent instanceof AbstractC27417d.h) {
            return new AbstractC27414a.h(((AbstractC27417d.h) viewEvent).getQuery());
        }
        throw new NoWhenBranchMatchedException();
    }

    public final InterfaceC13058l getViewState() {
        return this.viewState;
    }

    /* JADX INFO: renamed from: l */
    public final int m82820l() {
        return AbstractC41071b.m133368a(this.dateAndTimeProvider) - this.initialTime;
    }

    /* JADX INFO: renamed from: p */
    public final void m82821p(String event, String category, String action, String label) {
        AbstractC22676k.m65750j(event, "event");
        this.analyticsManager.mo41424f(category, action, label, event);
    }

    /* JADX INFO: renamed from: q */
    public final InterfaceC3027k1 m82822q(AbstractC27417d viewEvent) {
        AbstractC22676k.m65750j(viewEvent, "viewEvent");
        return AbstractC3006f0.m8732z(this.closeableCoroutineScope, null, null, new b(viewEvent, null), 3);
    }

    /* JADX INFO: renamed from: r */
    public final void m82823r() {
        this.initialTime = AbstractC41071b.m133368a(this.dateAndTimeProvider);
    }

    public /* synthetic */ C27418e(C27416c c27416c, C27419f c27419f, InterfaceC40188b interfaceC40188b, InterfaceC2994c0 interfaceC2994c0, InterfaceC41070a interfaceC41070a, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(c27416c, c27419f, interfaceC40188b, (i13 & 8) != 0 ? new C28180m(null, 1, null) : interfaceC2994c0, interfaceC41070a);
    }
}
