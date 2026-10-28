package u60;

import androidx.core.app.NotificationCompat;
import androidx.lifecycle.AbstractC1637w1;
import bc3.AbstractC3006f0;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4351m;
import ec3.AbstractC13091v;
import ec3.C13021b2;
import ec3.C13060l1;
import ec3.C13078q1;
import ec3.C13081r1;
import ec3.C13096w1;
import ec3.C13105z1;
import ec3.InterfaceC13058l;
import ec3.InterfaceC13062m;
import ec3.InterfaceC13072o1;
import gv1.C16229c;
import gv1.C16230d;
import gv1.C16231e;
import gv1.C16234h;
import gv1.InterfaceC16239m;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import l83.C23454a0;
import or2.C28180m;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function3;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.InterfaceC30057d;
import r60.AbstractC30974b;
import r60.C30975c;
import r60.C30976d;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import v60.C35734a;

/* JADX INFO: renamed from: u60.b */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000e*\b\u0012\u0004\u0012\u00020\u000f0\u000eH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0013\u0010\u0014\u001a\u00020\u000f*\u00020\u0013H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0015\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\u0013¢\u0006\u0004\b\u0018\u0010\u0019J\u0015\u0010\u001b\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\u001a¢\u0006\u0004\b\u001b\u0010\u001cR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010 R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$R\u001a\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00130%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u001a\u0010+\u001a\b\u0012\u0004\u0012\u00020\u00100\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u001a\u0010.\u001a\b\u0012\u0004\u0012\u00020,0\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010*R\u001d\u00103\u001a\b\u0012\u0004\u0012\u00020/0\u000e8\u0006¢\u0006\f\n\u0004\b0\u0010*\u001a\u0004\b1\u00102R\u001d\u00107\u001a\b\u0012\u0004\u0012\u0002040\u000e8\u0006¢\u0006\f\n\u0004\b5\u0010*\u001a\u0004\b6\u00102¨\u00068"}, m65681d2 = {"Lu60/b;", "Landroidx/lifecycle/w1;", "Lr60/d;", "interactor", "Lv60/a;", "reducer", "Lgv1/c;", "globalLottieTesterState", "Lgv1/d;", "localLottieTesterOverrideController", "Lbc3/c0;", "coroutineScope", "<init>", "(Lr60/d;Lv60/a;Lgv1/c;Lgv1/d;Lbc3/c0;)V", "Lec3/l;", "Lr60/b;", "Lr60/c;", "interact", "(Lec3/l;)Lec3/l;", "Lu60/a$j;", "q", "(Lu60/a$j;)Lr60/b;", NotificationCompat.CATEGORY_EVENT, "Ll83/a0;", "p", "(Lu60/a$j;)V", "Lgv1/m;", "o", "(Lgv1/m;)V", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "Lr60/d;", "x", "Lv60/a;", "y", "Lgv1/d;", "z", "Lbc3/c0;", "Lec3/o1;", "E", "Lec3/o1;", "eventFlow", "F", "Lec3/l;", "domainState", "Lgv1/h;", "G", "lottieTesterConfig", "Lu60/c;", "H", "getViewState", "()Lec3/l;", "viewState", "Lu60/a$g;", "I", "n", "navigationEvents", "achievements_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C34550b extends AbstractC1637w1 {

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    private final InterfaceC13072o1 eventFlow;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    private final InterfaceC13058l domainState;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    private final InterfaceC13058l lottieTesterConfig;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    private final InterfaceC13058l viewState;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    private final InterfaceC13058l navigationEvents;

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    private final C30976d interactor;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    private final C35734a reducer;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    private final C16230d localLottieTesterOverrideController;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    private final InterfaceC2994c0 coroutineScope;

    /* JADX INFO: renamed from: u60.b$a */
    /* JADX INFO: loaded from: classes6.dex */
    @InterfaceC32271e(m100429c = "com.whoop.achievements.presentation.AchievementsViewModel$lottieTesterConfig$1", m100430f = "AchievementsViewModel.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m65681d2 = {"", "isEnabled", "Lgv1/e;", "localLottieState", "Lgv1/h;", "<anonymous>", "(ZLgv1/e;)Lgv1/h;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements Function3 {

        /* JADX INFO: renamed from: w */
        int f145359w;

        /* JADX INFO: renamed from: x */
        /* synthetic */ boolean f145360x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f145361y;

        public a(InterfaceC30057d<? super a> interfaceC30057d) {
            super(3, interfaceC30057d);
        }

        /* JADX INFO: renamed from: f */
        public final Object m109209f(boolean z4, C16231e c16231e, InterfaceC30057d<? super C16234h> interfaceC30057d) {
            a aVar = new a(interfaceC30057d);
            aVar.f145360x = z4;
            aVar.f145361y = c16231e;
            return aVar.invokeSuspend(C23454a0.f92919a);
        }

        @Override // p715kotlin.jvm.functions.Function3
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3) {
            return m109209f(((Boolean) obj).booleanValue(), (C16231e) obj2, (InterfaceC30057d) obj3);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            boolean z4 = this.f145360x;
            C16231e c16231e = (C16231e) this.f145361y;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f145359w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            return new C16234h(z4, c16231e.getLottieSource(), c16231e.getIsSelectLottieSheetVisible());
        }
    }

    /* JADX INFO: renamed from: u60.b$b */
    /* JADX INFO: loaded from: classes6.dex */
    @InterfaceC32271e(m100429c = "com.whoop.achievements.presentation.AchievementsViewModel$sendViewEvent$1", m100430f = "AchievementsViewModel.kt", m100431l = {60}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class b extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f145362w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC34549a.j f145364y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(InterfaceC34549a.j jVar, InterfaceC30057d<? super b> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f145364y = jVar;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C34550b.this.new b(this.f145364y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((b) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f145362w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC13072o1 interfaceC13072o1 = C34550b.this.eventFlow;
                InterfaceC34549a.j jVar = this.f145364y;
                this.f145362w = 1;
                if (interfaceC13072o1.emit(jVar, this) == enumC31071a) {
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

    /* JADX INFO: renamed from: u60.b$c */
    /* JADX INFO: loaded from: classes6.dex */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f145365w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C34550b f145366x;

        /* JADX INFO: renamed from: u60.b$c$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f145367w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C34550b f145368x;

            /* JADX INFO: renamed from: u60.b$c$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.achievements.presentation.AchievementsViewModel$special$$inlined$map$1$2", m100430f = "AchievementsViewModel.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C42449a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f145369E;

                /* JADX INFO: renamed from: F */
                Object f145370F;

                /* JADX INFO: renamed from: G */
                Object f145371G;

                /* JADX INFO: renamed from: H */
                int f145372H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f145373w;

                /* JADX INFO: renamed from: x */
                int f145374x;

                /* JADX INFO: renamed from: y */
                Object f145375y;

                public C42449a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f145373w = obj;
                    this.f145374x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m, C34550b c34550b) {
                this.f145367w = interfaceC13062m;
                this.f145368x = c34550b;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C42449a c42449a;
                if (interfaceC30057d instanceof C42449a) {
                    c42449a = (C42449a) interfaceC30057d;
                    int i13 = c42449a.f145374x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c42449a.f145374x = i13 - Integer.MIN_VALUE;
                    } else {
                        c42449a = new C42449a(interfaceC30057d);
                    }
                } else {
                    c42449a = new C42449a(interfaceC30057d);
                }
                Object obj2 = c42449a.f145373w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c42449a.f145374x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f145367w;
                    AbstractC30974b abstractC30974bM109205q = this.f145368x.m109205q((InterfaceC34549a.j) obj);
                    c42449a.f145375y = null;
                    c42449a.f145369E = null;
                    c42449a.f145370F = null;
                    c42449a.f145371G = null;
                    c42449a.f145372H = 0;
                    c42449a.f145374x = 1;
                    if (interfaceC13062m.emit(abstractC30974bM109205q, c42449a) == enumC31071a) {
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

        public c(InterfaceC13058l interfaceC13058l, C34550b c34550b) {
            this.f145365w = interfaceC13058l;
            this.f145366x = c34550b;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f145365w.collect(new a(interfaceC13062m, this.f145366x), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: u60.b$d */
    /* JADX INFO: loaded from: classes6.dex */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class d implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f145377w;

        /* JADX INFO: renamed from: u60.b$d$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f145378w;

            /* JADX INFO: renamed from: u60.b$d$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.achievements.presentation.AchievementsViewModel$special$$inlined$mapNotNull$1$2", m100430f = "AchievementsViewModel.kt", m100431l = {52}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C42450a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f145379E;

                /* JADX INFO: renamed from: F */
                Object f145380F;

                /* JADX INFO: renamed from: G */
                Object f145381G;

                /* JADX INFO: renamed from: H */
                Object f145382H;

                /* JADX INFO: renamed from: I */
                int f145383I;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f145384w;

                /* JADX INFO: renamed from: x */
                int f145385x;

                /* JADX INFO: renamed from: y */
                Object f145386y;

                public C42450a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f145384w = obj;
                    this.f145385x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m) {
                this.f145378w = interfaceC13062m;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C42450a c42450a;
                if (interfaceC30057d instanceof C42450a) {
                    c42450a = (C42450a) interfaceC30057d;
                    int i13 = c42450a.f145385x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c42450a.f145385x = i13 - Integer.MIN_VALUE;
                    } else {
                        c42450a = new C42450a(interfaceC30057d);
                    }
                } else {
                    c42450a = new C42450a(interfaceC30057d);
                }
                Object obj2 = c42450a.f145384w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c42450a.f145385x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f145378w;
                    InterfaceC34549a interfaceC34549a = ((C30975c) obj).getAndroidx.core.app.NotificationCompat.CATEGORY_EVENT java.lang.String();
                    InterfaceC34549a.g gVar = interfaceC34549a instanceof InterfaceC34549a.g ? (InterfaceC34549a.g) interfaceC34549a : null;
                    if (gVar != null) {
                        c42450a.f145386y = null;
                        c42450a.f145379E = null;
                        c42450a.f145380F = null;
                        c42450a.f145381G = null;
                        c42450a.f145382H = null;
                        c42450a.f145383I = 0;
                        c42450a.f145385x = 1;
                        if (interfaceC13062m.emit(gVar, c42450a) == enumC31071a) {
                            return enumC31071a;
                        }
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

        public d(InterfaceC13058l interfaceC13058l) {
            this.f145377w = interfaceC13058l;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f145377w.collect(new a(interfaceC13062m), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: u60.b$e */
    /* JADX INFO: loaded from: classes6.dex */
    @InterfaceC32271e(m100429c = "com.whoop.achievements.presentation.AchievementsViewModel$viewState$1", m100430f = "AchievementsViewModel.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, m65681d2 = {"Lr60/c;", "domainResult", "Lgv1/h;", "config", "Lu60/c;", "<anonymous>", "(Lr60/c;Lgv1/h;)Lu60/c;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class e extends AbstractC32275i implements Function3 {

        /* JADX INFO: renamed from: w */
        int f145388w;

        /* JADX INFO: renamed from: x */
        /* synthetic */ Object f145389x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f145390y;

        public e(InterfaceC30057d<? super e> interfaceC30057d) {
            super(3, interfaceC30057d);
        }

        @Override // p715kotlin.jvm.functions.Function3
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public final Object invoke(C30975c c30975c, C16234h c16234h, InterfaceC30057d<? super C34551c> interfaceC30057d) {
            e eVar = C34550b.this.new e(interfaceC30057d);
            eVar.f145389x = c30975c;
            eVar.f145390y = c16234h;
            return eVar.invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            C30975c c30975c = (C30975c) this.f145389x;
            C16234h c16234h = (C16234h) this.f145390y;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f145388w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            return C34550b.this.reducer.m113194b(c30975c, c16234h);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C34550b(C30976d interactor, C35734a reducer, C16229c globalLottieTesterState, C16230d localLottieTesterOverrideController, InterfaceC2994c0 coroutineScope) {
        super(coroutineScope);
        AbstractC22676k.m65750j(interactor, "interactor");
        AbstractC22676k.m65750j(reducer, "reducer");
        AbstractC22676k.m65750j(globalLottieTesterState, "globalLottieTesterState");
        AbstractC22676k.m65750j(localLottieTesterOverrideController, "localLottieTesterOverrideController");
        AbstractC22676k.m65750j(coroutineScope, "coroutineScope");
        this.interactor = interactor;
        this.reducer = reducer;
        this.localLottieTesterOverrideController = localLottieTesterOverrideController;
        this.coroutineScope = coroutineScope;
        C13096w1 c13096w1M36592b = AbstractC13091v.m36592b(0, 0, null, 7);
        this.eventFlow = c13096w1M36592b;
        InterfaceC13058l interfaceC13058lInteract = interact(new c(c13096w1M36592b, this));
        C13021b2 c13021b2 = C13105z1.f45288a;
        C13078q1 c13078q1M36586L = AbstractC13091v.m36586L(interfaceC13058lInteract, coroutineScope, c13021b2, 1);
        this.domainState = c13078q1M36586L;
        C13081r1 c13081r1M36587M = AbstractC13091v.m36587M(new C13060l1(globalLottieTesterState.getIsOverrideEnabled(), localLottieTesterOverrideController.getState(), new a(null), 1), coroutineScope, c13021b2, new C16234h(false, null, false, 7, null));
        this.lottieTesterConfig = c13081r1M36587M;
        this.viewState = AbstractC13091v.m36586L(new C13060l1(c13078q1M36586L, c13081r1M36587M, new e(null), 1), coroutineScope, c13021b2, 1);
        this.navigationEvents = AbstractC13091v.m36586L(new d(c13078q1M36586L), coroutineScope, c13021b2, 0);
    }

    private final InterfaceC13058l interact(InterfaceC13058l interfaceC13058l) {
        return this.interactor.interact(interfaceC13058l);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: q */
    public final AbstractC30974b m109205q(InterfaceC34549a.j jVar) {
        if (!(jVar instanceof InterfaceC34549a.i)) {
            throw new NoWhenBranchMatchedException();
        }
        InterfaceC34549a.i iVar = (InterfaceC34549a.i) jVar;
        return new AbstractC30974b.a(iVar.getAchievementType(), iVar.getSource());
    }

    public final InterfaceC13058l getViewState() {
        return this.viewState;
    }

    /* JADX INFO: renamed from: n, reason: from getter */
    public final InterfaceC13058l getNavigationEvents() {
        return this.navigationEvents;
    }

    /* JADX INFO: renamed from: o */
    public final void m109207o(InterfaceC16239m event) {
        AbstractC22676k.m65750j(event, "event");
        this.localLottieTesterOverrideController.m45940b(event);
    }

    /* JADX INFO: renamed from: p */
    public final void m109208p(InterfaceC34549a.j event) {
        AbstractC22676k.m65750j(event, "event");
        AbstractC3006f0.m8732z(this.coroutineScope, null, null, new b(event, null), 3);
    }

    public /* synthetic */ C34550b(C30976d c30976d, C35734a c35734a, C16229c c16229c, C16230d c16230d, InterfaceC2994c0 interfaceC2994c0, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(c30976d, c35734a, c16229c, c16230d, (i13 & 16) != 0 ? new C28180m(null, 1, null) : interfaceC2994c0);
    }
}
