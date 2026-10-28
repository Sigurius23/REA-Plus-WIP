package ng2;

import androidx.core.app.NotificationCompat;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.InterfaceC1585g0;
import bc3.AbstractC3006f0;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4351m;
import c93.InterfaceC4353o;
import ec3.AbstractC13091v;
import ec3.C13015a0;
import ec3.C13021b2;
import ec3.C13078q1;
import ec3.C13096w1;
import ec3.C13105z1;
import ec3.InterfaceC13058l;
import ec3.InterfaceC13062m;
import ec3.InterfaceC13072o1;
import ec3.InterfaceC13087t1;
import gi1.C15892b;
import l83.C23454a0;
import ld1.AbstractC23864c;
import lm0.C24506a;
import lm0.EnumC24508c;
import m83.AbstractC25265s;
import mg2.C25531a;
import od1.AbstractC27845h;
import or2.C28180m;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import pg2.C29168c;
import pg2.C29169d;
import pg2.InterfaceC29167b;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import rg2.C31391c;
import s83.AbstractC32269c;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import w41.C36823w;
import yg2.AbstractC39529d;
import yg2.C39530e;
import yg2.EnumC39526a;

/* JADX INFO: renamed from: ng2.f */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004BA\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u0013\u0010\u0016\u001a\u00020\u0015*\u00020\u0003H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0017\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001d\u001a\u00020\u001a2\u0006\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u001d\u0010\u001cJ\u0017\u0010\u001e\u001a\u00020\u001a2\u0006\u0010\u0019\u001a\u00020\u0018H\u0016¢\u0006\u0004\b\u001e\u0010\u001cJ\u000f\u0010\u001f\u001a\u00020\u001aH\u0014¢\u0006\u0004\b\u001f\u0010 J\u0017\u0010\"\u001a\u00020\u001a2\u0006\u0010!\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\"\u0010#R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0014\u0010\u0012\u001a\u00020\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u001a\u00101\u001a\b\u0012\u0004\u0012\u00020\u00030.8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100R\u001a\u00106\u001a\b\u0012\u0004\u0012\u000203028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00105R\u001c\u00109\u001a\n\u0012\u0006\u0012\u0004\u0018\u000107028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u00105R \u0010?\u001a\b\u0012\u0004\u0012\u00020\u00020:8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b;\u0010<\u001a\u0004\b=\u0010>¨\u0006@"}, m65681d2 = {"Lng2/f;", "Lld1/c;", "Lrg2/c;", "Lng2/e;", "Landroidx/lifecycle/DefaultLifecycleObserver;", "Lpg2/d;", "interactor", "Lmg2/a;", "viewStateReducer", "Lyg2/e;", "liveHrStateCombiner", "Lng2/b;", "userLocationProvider", "Lgi1/b;", "gpsPermissionHelper", "Llm0/a;", "bleStateChangeReceiver", "Lbc3/c0;", "coroutineScope", "<init>", "(Lpg2/d;Lmg2/a;Lyg2/e;Lng2/b;Lgi1/b;Llm0/a;Lbc3/c0;)V", "Lpg2/b;", "p", "(Lng2/e;)Lpg2/b;", "Landroidx/lifecycle/g0;", "owner", "Ll83/a0;", "onStop", "(Landroidx/lifecycle/g0;)V", "onStart", "onResume", "onCleared", "()V", NotificationCompat.CATEGORY_EVENT, "o", "(Lng2/e;)V", "x", "Lmg2/a;", "y", "Lyg2/e;", "z", "Lgi1/b;", "E", "Llm0/a;", "F", "Lbc3/c0;", "Lec3/o1;", "G", "Lec3/o1;", "eventFlow", "Lec3/t1;", "Lpg2/c;", "H", "Lec3/t1;", "domainState", "Lw41/w;", "I", "userLocationState", "Lec3/l;", "J", "Lec3/l;", "getViewState", "()Lec3/l;", "viewState", "start-activity_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C26687f extends AbstractC23864c<C31391c, InterfaceC26686e> implements DefaultLifecycleObserver {

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    private final C24506a bleStateChangeReceiver;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    private final InterfaceC2994c0 coroutineScope;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    private final InterfaceC13072o1 eventFlow;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    private final InterfaceC13087t1 domainState;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    private final InterfaceC13087t1 userLocationState;

    /* JADX INFO: renamed from: J, reason: from kotlin metadata */
    private final InterfaceC13058l viewState;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    private final C25531a viewStateReducer;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    private final C39530e liveHrStateCombiner;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    private final C15892b gpsPermissionHelper;

    /* JADX INFO: renamed from: ng2.f$a */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.startactivity.presession.PreSessionWidgetViewModel$sendViewEvent$1", m100430f = "PreSessionWidgetViewModel.kt", m100431l = {87}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f106109w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC26686e f106111y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(InterfaceC26686e interfaceC26686e, InterfaceC30057d<? super a> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f106111y = interfaceC26686e;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C26687f.this.new a(this.f106111y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f106109w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC13072o1 interfaceC13072o1 = C26687f.this.eventFlow;
                InterfaceC26686e interfaceC26686e = this.f106111y;
                this.f106109w = 1;
                if (interfaceC13072o1.emit(interfaceC26686e, this) == enumC31071a) {
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

    /* JADX INFO: renamed from: ng2.f$b */
    /* JADX INFO: loaded from: classes10.dex */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f106112w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C26687f f106113x;

        /* JADX INFO: renamed from: ng2.f$b$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f106114w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C26687f f106115x;

            /* JADX INFO: renamed from: ng2.f$b$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.startactivity.presession.PreSessionWidgetViewModel$special$$inlined$map$1$2", m100430f = "PreSessionWidgetViewModel.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C42049a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f106116E;

                /* JADX INFO: renamed from: F */
                Object f106117F;

                /* JADX INFO: renamed from: G */
                Object f106118G;

                /* JADX INFO: renamed from: H */
                int f106119H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f106120w;

                /* JADX INFO: renamed from: x */
                int f106121x;

                /* JADX INFO: renamed from: y */
                Object f106122y;

                public C42049a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f106120w = obj;
                    this.f106121x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m, C26687f c26687f) {
                this.f106114w = interfaceC13062m;
                this.f106115x = c26687f;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C42049a c42049a;
                if (interfaceC30057d instanceof C42049a) {
                    c42049a = (C42049a) interfaceC30057d;
                    int i13 = c42049a.f106121x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c42049a.f106121x = i13 - Integer.MIN_VALUE;
                    } else {
                        c42049a = new C42049a(interfaceC30057d);
                    }
                } else {
                    c42049a = new C42049a(interfaceC30057d);
                }
                Object obj2 = c42049a.f106120w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c42049a.f106121x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f106114w;
                    InterfaceC29167b interfaceC29167bM79386p = this.f106115x.m79386p((InterfaceC26686e) obj);
                    c42049a.f106122y = null;
                    c42049a.f106116E = null;
                    c42049a.f106117F = null;
                    c42049a.f106118G = null;
                    c42049a.f106119H = 0;
                    c42049a.f106121x = 1;
                    if (interfaceC13062m.emit(interfaceC29167bM79386p, c42049a) == enumC31071a) {
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

        public b(InterfaceC13058l interfaceC13058l, C26687f c26687f) {
            this.f106112w = interfaceC13058l;
            this.f106113x = c26687f;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f106112w.collect(new a(interfaceC13062m, this.f106113x), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: ng2.f$c */
    /* JADX INFO: loaded from: classes10.dex */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f106124w;

        /* JADX INFO: renamed from: ng2.f$c$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f106125w;

            /* JADX INFO: renamed from: ng2.f$c$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.startactivity.presession.PreSessionWidgetViewModel$special$$inlined$map$2$2", m100430f = "PreSessionWidgetViewModel.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C42050a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f106126E;

                /* JADX INFO: renamed from: F */
                Object f106127F;

                /* JADX INFO: renamed from: G */
                Object f106128G;

                /* JADX INFO: renamed from: H */
                int f106129H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f106130w;

                /* JADX INFO: renamed from: x */
                int f106131x;

                /* JADX INFO: renamed from: y */
                Object f106132y;

                public C42050a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f106130w = obj;
                    this.f106131x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m) {
                this.f106125w = interfaceC13062m;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C42050a c42050a;
                if (interfaceC30057d instanceof C42050a) {
                    c42050a = (C42050a) interfaceC30057d;
                    int i13 = c42050a.f106131x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c42050a.f106131x = i13 - Integer.MIN_VALUE;
                    } else {
                        c42050a = new C42050a(interfaceC30057d);
                    }
                } else {
                    c42050a = new C42050a(interfaceC30057d);
                }
                Object obj2 = c42050a.f106130w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c42050a.f106131x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f106125w;
                    Boolean boolValueOf = Boolean.valueOf(((C29168c) obj).getIsGpsTrackingEnabled());
                    c42050a.f106132y = null;
                    c42050a.f106126E = null;
                    c42050a.f106127F = null;
                    c42050a.f106128G = null;
                    c42050a.f106129H = 0;
                    c42050a.f106131x = 1;
                    if (interfaceC13062m.emit(boolValueOf, c42050a) == enumC31071a) {
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

        public c(InterfaceC13058l interfaceC13058l) {
            this.f106124w = interfaceC13058l;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f106124w.collect(new a(interfaceC13062m), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: ng2.f$d */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.startactivity.presession.PreSessionWidgetViewModel$userLocationState$2", m100430f = "PreSessionWidgetViewModel.kt", m100431l = {66}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lec3/m;", "Lw41/w;", "Ll83/a0;", "<anonymous>", "(Lec3/m;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class d extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f106134w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f106135x;

        public d(InterfaceC30057d<? super d> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            d dVar = new d(interfaceC30057d);
            dVar.f106135x = obj;
            return dVar;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC13062m interfaceC13062m, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((d) create(interfaceC13062m, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            InterfaceC13062m interfaceC13062m = (InterfaceC13062m) this.f106135x;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f106134w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                this.f106135x = null;
                this.f106134w = 1;
                if (interfaceC13062m.emit(null, this) == enumC31071a) {
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

    /* JADX INFO: renamed from: ng2.f$e */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.startactivity.presession.PreSessionWidgetViewModel$viewState$1", m100430f = "PreSessionWidgetViewModel.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\t\u001a\u00020\b2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\n¢\u0006\u0004\b\t\u0010\n"}, m65681d2 = {"Lpg2/c;", "domain", "Lyg2/d;", "liveHrState", "Lw41/w;", "userLocation", "Llm0/c;", "bluetoothState", "Lrg2/c;", "<anonymous>", "(Lpg2/c;Lyg2/d;Lw41/w;Llm0/c;)Lrg2/c;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class e extends AbstractC32275i implements InterfaceC4353o {

        /* JADX INFO: renamed from: E */
        /* synthetic */ Object f106136E;

        /* JADX INFO: renamed from: w */
        int f106138w;

        /* JADX INFO: renamed from: x */
        /* synthetic */ Object f106139x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f106140y;

        /* JADX INFO: renamed from: z */
        /* synthetic */ Object f106141z;

        public e(InterfaceC30057d<? super e> interfaceC30057d) {
            super(5, interfaceC30057d);
        }

        @Override // c93.InterfaceC4353o
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public final Object invoke(C29168c c29168c, AbstractC39529d abstractC39529d, C36823w c36823w, EnumC24508c enumC24508c, InterfaceC30057d<? super C31391c> interfaceC30057d) {
            e eVar = C26687f.this.new e(interfaceC30057d);
            eVar.f106139x = c29168c;
            eVar.f106140y = abstractC39529d;
            eVar.f106141z = c36823w;
            eVar.f106136E = enumC24508c;
            return eVar.invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            C29168c c29168c = (C29168c) this.f106139x;
            AbstractC39529d abstractC39529d = (AbstractC39529d) this.f106140y;
            C36823w c36823w = (C36823w) this.f106141z;
            EnumC24508c enumC24508c = (EnumC24508c) this.f106136E;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f106138w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            return C26687f.this.viewStateReducer.m75113d(c29168c, abstractC39529d, c36823w, enumC24508c == EnumC24508c.OFF);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C26687f(C29169d interactor, C25531a viewStateReducer, C39530e liveHrStateCombiner, C26683b userLocationProvider, C15892b gpsPermissionHelper, C24506a bleStateChangeReceiver, InterfaceC2994c0 coroutineScope) {
        super(coroutineScope);
        AbstractC22676k.m65750j(interactor, "interactor");
        AbstractC22676k.m65750j(viewStateReducer, "viewStateReducer");
        AbstractC22676k.m65750j(liveHrStateCombiner, "liveHrStateCombiner");
        AbstractC22676k.m65750j(userLocationProvider, "userLocationProvider");
        AbstractC22676k.m65750j(gpsPermissionHelper, "gpsPermissionHelper");
        AbstractC22676k.m65750j(bleStateChangeReceiver, "bleStateChangeReceiver");
        AbstractC22676k.m65750j(coroutineScope, "coroutineScope");
        this.viewStateReducer = viewStateReducer;
        this.liveHrStateCombiner = liveHrStateCombiner;
        this.gpsPermissionHelper = gpsPermissionHelper;
        this.bleStateChangeReceiver = bleStateChangeReceiver;
        this.coroutineScope = coroutineScope;
        C13096w1 c13096w1M36592b = AbstractC13091v.m36592b(0, 0, null, 7);
        this.eventFlow = c13096w1M36592b;
        InterfaceC13058l interfaceC13058lM83945a = AbstractC27845h.m83945a(new b(c13096w1M36592b, this), interactor);
        C13021b2 c13021b2 = C13105z1.f45288a;
        C13078q1 c13078q1M36586L = AbstractC13091v.m36586L(interfaceC13058lM83945a, coroutineScope, c13021b2, 1);
        this.domainState = c13078q1M36586L;
        C13078q1 c13078q1M36586L2 = AbstractC13091v.m36586L(new C13015a0(new d(null), userLocationProvider.m79370c(new c(c13078q1M36586L))), coroutineScope, c13021b2, 1);
        this.userLocationState = c13078q1M36586L2;
        this.viewState = AbstractC13091v.m36586L(AbstractC13091v.m36605o(c13078q1M36586L, liveHrStateCombiner.getLiveHrCombinedFlow(), c13078q1M36586L2, bleStateChangeReceiver.getBluetoothStateFlow(), new e(null)), coroutineScope, c13021b2, 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: p */
    public final InterfaceC29167b m79386p(InterfaceC26686e interfaceC26686e) {
        if (interfaceC26686e instanceof InterfaceC26686e.h) {
            return new InterfaceC29167b.h(((InterfaceC26686e.h) interfaceC26686e).getSelectedInternalName());
        }
        if (interfaceC26686e instanceof InterfaceC26686e.f) {
            InterfaceC26686e.f fVar = (InterfaceC26686e.f) interfaceC26686e;
            return new InterfaceC29167b.f(fVar.getIsEnabled(), fVar.getBffSelectedInternalName());
        }
        if (interfaceC26686e instanceof InterfaceC26686e.g) {
            InterfaceC26686e.g gVar = (InterfaceC26686e.g) interfaceC26686e;
            return new InterfaceC29167b.g(gVar.getIsEnabled(), gVar.getShouldShowPermissionRationale(), false, false, 12, null);
        }
        if (interfaceC26686e instanceof InterfaceC26686e.d) {
            return InterfaceC29167b.d.f118032a;
        }
        if (interfaceC26686e instanceof InterfaceC26686e.e) {
            return new InterfaceC29167b.e(((InterfaceC26686e.e) interfaceC26686e).getIsGranted());
        }
        if (interfaceC26686e instanceof InterfaceC26686e.c) {
            return InterfaceC29167b.c.f118031a;
        }
        if (interfaceC26686e instanceof InterfaceC26686e.b) {
            return InterfaceC29167b.b.f118030a;
        }
        if (interfaceC26686e instanceof InterfaceC26686e.a) {
            return InterfaceC29167b.a.f118029a;
        }
        throw new NoWhenBranchMatchedException();
    }

    @Override // ld1.AbstractC23864c
    public InterfaceC13058l getViewState() {
        return this.viewState;
    }

    @Override // ld1.AbstractC23864c
    /* JADX INFO: renamed from: o, reason: merged with bridge method [inline-methods] */
    public void mo1216g(InterfaceC26686e event) {
        AbstractC22676k.m65750j(event, "event");
        if (this.eventFlow.mo36564a(event)) {
            return;
        }
        AbstractC3006f0.m8732z(this.coroutineScope, null, null, new a(event, null), 3);
    }

    @Override // androidx.lifecycle.AbstractC1637w1
    public void onCleared() {
        C39530e.m126276t(this.liveHrStateCombiner, false, null, EnumC39526a.PRE_SESSION_WIDGET, 2, null);
        super.onCleared();
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public /* bridge */ void onCreate(InterfaceC1585g0 interfaceC1585g0) {
        super.onCreate(interfaceC1585g0);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public /* bridge */ void onDestroy(InterfaceC1585g0 interfaceC1585g0) {
        super.onDestroy(interfaceC1585g0);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public /* bridge */ void onPause(InterfaceC1585g0 interfaceC1585g0) {
        super.onPause(interfaceC1585g0);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onResume(InterfaceC1585g0 owner) {
        AbstractC22676k.m65750j(owner, "owner");
        C29168c c29168c = (C29168c) AbstractC25265s.m74100H0(this.domainState.getReplayCache());
        if (c29168c != null && c29168c.getIsGpsTogglePendingPermission()) {
            mo1216g(new InterfaceC26686e.e(this.gpsPermissionHelper.m44826b()));
        }
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onStart(InterfaceC1585g0 owner) {
        AbstractC22676k.m65750j(owner, "owner");
        C39530e.m126276t(this.liveHrStateCombiner, true, null, EnumC39526a.PRE_SESSION_WIDGET, 2, null);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onStop(InterfaceC1585g0 owner) {
        AbstractC22676k.m65750j(owner, "owner");
        C39530e.m126276t(this.liveHrStateCombiner, false, null, EnumC39526a.PRE_SESSION_WIDGET, 2, null);
    }

    public /* synthetic */ C26687f(C29169d c29169d, C25531a c25531a, C39530e c39530e, C26683b c26683b, C15892b c15892b, C24506a c24506a, InterfaceC2994c0 interfaceC2994c0, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(c29169d, c25531a, c39530e, c26683b, c15892b, c24506a, (i13 & 64) != 0 ? new C28180m(null, 1, null) : interfaceC2994c0);
    }
}
