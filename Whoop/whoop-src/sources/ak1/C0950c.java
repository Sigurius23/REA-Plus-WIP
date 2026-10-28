package ak1;

import androidx.lifecycle.AbstractC1637w1;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.InterfaceC1585g0;
import bc3.AbstractC3006f0;
import bc3.InterfaceC2994c0;
import bk1.C3351a;
import bk1.C3352b;
import c93.InterfaceC4351m;
import ck1.AbstractC4788k;
import ec3.AbstractC13091v;
import ec3.C13015a0;
import ec3.C13021b2;
import ec3.C13078q1;
import ec3.C13096w1;
import ec3.C13105z1;
import ec3.InterfaceC13037f2;
import ec3.InterfaceC13058l;
import ec3.InterfaceC13062m;
import ec3.InterfaceC13072o1;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import l83.C23454a0;
import od1.AbstractC27845h;
import or2.C28180m;
import os0.InterfaceC28306b;
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
import sl1.C32705d;
import xj1.AbstractC38397a;
import xj1.AbstractC38403g;
import xj1.C38399c;
import xj1.C38401e;
import yg2.AbstractC39529d;
import yg2.C39530e;

/* JADX INFO: renamed from: ak1.c */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000\u008c\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B9\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J'\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u0011*\b\u0012\u0004\u0012\u00020\u00120\u00112\u0006\u0010\u0004\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0017\u0010\u0018\u001a\u00020\u00122\u0006\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010\u001f\u001a\u00020\u001c2\u0006\u0010\u001b\u001a\u00020\u001aH\u0016¢\u0006\u0004\b\u001f\u0010\u001eJ\u0015\u0010 \u001a\u00020\u001c2\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b \u0010!J\r\u0010\"\u001a\u00020\u001c¢\u0006\u0004\b\"\u0010#J\r\u0010$\u001a\u00020\u001c¢\u0006\u0004\b$\u0010#R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010&R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010*R\u001a\u0010.\u001a\b\u0012\u0004\u0012\u00020\u00160+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010-R\u001a\u00101\u001a\b\u0012\u0004\u0012\u00020/0+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u0010-R\u001a\u00104\u001a\b\u0012\u0004\u0012\u00020\u00130\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00103R\u001d\u0010;\u001a\b\u0012\u0004\u0012\u000206058\u0006¢\u0006\f\n\u0004\b7\u00108\u001a\u0004\b9\u0010:R\u001a\u0010>\u001a\b\u0012\u0004\u0012\u00020<0\u00118\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u00103R\u001d\u0010C\u001a\b\u0012\u0004\u0012\u00020?0\u00118\u0006¢\u0006\f\n\u0004\b@\u00103\u001a\u0004\bA\u0010BR\u001d\u0010G\u001a\b\u0012\u0004\u0012\u00020D0\u00118\u0006¢\u0006\f\n\u0004\bE\u00103\u001a\u0004\bF\u0010B¨\u0006H"}, m65681d2 = {"Lak1/c;", "Landroidx/lifecycle/w1;", "Landroidx/lifecycle/DefaultLifecycleObserver;", "Lxj1/e;", "interactor", "Lbk1/b;", "reducer", "Lyg2/e;", "liveHrStateCombiner", "Lsl1/d;", "strapDomainInteractor", "Lbk1/a;", "composableHealthMonitorCombiner", "Lbc3/c0;", "coroutineScope", "<init>", "(Lxj1/e;Lbk1/b;Lyg2/e;Lsl1/d;Lbk1/a;Lbc3/c0;)V", "Lec3/l;", "Lxj1/a;", "Lxj1/c;", "p", "(Lec3/l;Lxj1/e;)Lec3/l;", "Lak1/b;", "viewEvent", "r", "(Lak1/b;)Lxj1/a;", "Landroidx/lifecycle/g0;", "owner", "Ll83/a0;", "onStart", "(Landroidx/lifecycle/g0;)V", "onStop", "q", "(Lak1/b;)V", "n", "()V", "l", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "Lyg2/e;", "x", "Lbk1/a;", "y", "Lbc3/c0;", "Lec3/o1;", "z", "Lec3/o1;", "eventFlow", "Los0/b;", "E", "connectivityTileEventFlow", "F", "Lec3/l;", "domainState", "Lec3/f2;", "Lck1/k;", "G", "Lec3/f2;", "o", "()Lec3/f2;", "healthReportViewState", "Lsl1/b;", "H", "connTileDomainResult", "Lyg2/d;", "I", "getLiveHrFlow", "()Lec3/l;", "liveHrFlow", "Lak1/d;", "J", "getViewState", "viewState", "health-monitor_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C0950c extends AbstractC1637w1 implements DefaultLifecycleObserver {

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    private final InterfaceC13072o1 connectivityTileEventFlow;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    private final InterfaceC13058l domainState;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    private final InterfaceC13037f2 healthReportViewState;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    private final InterfaceC13058l connTileDomainResult;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    private final InterfaceC13058l liveHrFlow;

    /* JADX INFO: renamed from: J, reason: from kotlin metadata */
    private final InterfaceC13058l viewState;

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    private final C39530e liveHrStateCombiner;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    private final C3351a composableHealthMonitorCombiner;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    private final InterfaceC2994c0 coroutineScope;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    private final InterfaceC13072o1 eventFlow;

    /* JADX INFO: renamed from: ak1.c$a */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.healthmonitor.presentation.ComposableHealthMonitorViewModel$connTileDomainResult$1", m100430f = "ComposableHealthMonitorViewModel.kt", m100431l = {70}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lec3/m;", "Los0/b;", "Ll83/a0;", "<anonymous>", "(Lec3/m;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class a extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f3468w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f3469x;

        public a(InterfaceC30057d<? super a> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            a aVar = new a(interfaceC30057d);
            aVar.f3469x = obj;
            return aVar;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC13062m interfaceC13062m, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((a) create(interfaceC13062m, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            InterfaceC13062m interfaceC13062m = (InterfaceC13062m) this.f3469x;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f3468w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC28306b.a aVar = InterfaceC28306b.a.f114123a;
                this.f3469x = null;
                this.f3468w = 1;
                if (interfaceC13062m.emit(aVar, this) == enumC31071a) {
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

    /* JADX INFO: renamed from: ak1.c$b */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.healthmonitor.presentation.ComposableHealthMonitorViewModel$liveHrFlow$1", m100430f = "ComposableHealthMonitorViewModel.kt", m100431l = {73}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lec3/m;", "Lyg2/d;", "Ll83/a0;", "<anonymous>", "(Lec3/m;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class b extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f3470w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f3471x;

        public b(InterfaceC30057d<? super b> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            b bVar = new b(interfaceC30057d);
            bVar.f3471x = obj;
            return bVar;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC13062m interfaceC13062m, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((b) create(interfaceC13062m, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            InterfaceC13062m interfaceC13062m = (InterfaceC13062m) this.f3471x;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f3470w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                AbstractC39529d.b bVar = AbstractC39529d.b.f169991b;
                this.f3471x = null;
                this.f3470w = 1;
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

    /* JADX INFO: renamed from: ak1.c$c */
    /* JADX INFO: loaded from: classes9.dex */
    @InterfaceC32271e(m100429c = "com.whoop.healthmonitor.presentation.ComposableHealthMonitorViewModel$sendViewEvent$1", m100430f = "ComposableHealthMonitorViewModel.kt", m100431l = {84}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class c extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f3472w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ AbstractC0949b f3474y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(AbstractC0949b abstractC0949b, InterfaceC30057d<? super c> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f3474y = abstractC0949b;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C0950c.this.new c(this.f3474y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((c) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f3472w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC13072o1 interfaceC13072o1 = C0950c.this.eventFlow;
                AbstractC0949b abstractC0949b = this.f3474y;
                this.f3472w = 1;
                if (interfaceC13072o1.emit(abstractC0949b, this) == enumC31071a) {
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

    /* JADX INFO: renamed from: ak1.c$d */
    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class d implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f3475w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C0950c f3476x;

        /* JADX INFO: renamed from: ak1.c$d$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f3477w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C0950c f3478x;

            /* JADX INFO: renamed from: ak1.c$d$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.healthmonitor.presentation.ComposableHealthMonitorViewModel$special$$inlined$map$1$2", m100430f = "ComposableHealthMonitorViewModel.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C41276a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f3479E;

                /* JADX INFO: renamed from: F */
                Object f3480F;

                /* JADX INFO: renamed from: G */
                Object f3481G;

                /* JADX INFO: renamed from: H */
                int f3482H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f3483w;

                /* JADX INFO: renamed from: x */
                int f3484x;

                /* JADX INFO: renamed from: y */
                Object f3485y;

                public C41276a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f3483w = obj;
                    this.f3484x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m, C0950c c0950c) {
                this.f3477w = interfaceC13062m;
                this.f3478x = c0950c;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C41276a c41276a;
                if (interfaceC30057d instanceof C41276a) {
                    c41276a = (C41276a) interfaceC30057d;
                    int i13 = c41276a.f3484x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c41276a.f3484x = i13 - Integer.MIN_VALUE;
                    } else {
                        c41276a = new C41276a(interfaceC30057d);
                    }
                } else {
                    c41276a = new C41276a(interfaceC30057d);
                }
                Object obj2 = c41276a.f3483w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c41276a.f3484x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f3477w;
                    AbstractC38397a abstractC38397aM2393r = this.f3478x.m2393r((AbstractC0949b) obj);
                    c41276a.f3485y = null;
                    c41276a.f3479E = null;
                    c41276a.f3480F = null;
                    c41276a.f3481G = null;
                    c41276a.f3482H = 0;
                    c41276a.f3484x = 1;
                    if (interfaceC13062m.emit(abstractC38397aM2393r, c41276a) == enumC31071a) {
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

        public d(InterfaceC13058l interfaceC13058l, C0950c c0950c) {
            this.f3475w = interfaceC13058l;
            this.f3476x = c0950c;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f3475w.collect(new a(interfaceC13062m, this.f3476x), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: ak1.c$e */
    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class e implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f3487w;

        /* JADX INFO: renamed from: ak1.c$e$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f3488w;

            /* JADX INFO: renamed from: ak1.c$e$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.healthmonitor.presentation.ComposableHealthMonitorViewModel$special$$inlined$map$2$2", m100430f = "ComposableHealthMonitorViewModel.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C41277a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f3489E;

                /* JADX INFO: renamed from: F */
                Object f3490F;

                /* JADX INFO: renamed from: G */
                Object f3491G;

                /* JADX INFO: renamed from: H */
                int f3492H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f3493w;

                /* JADX INFO: renamed from: x */
                int f3494x;

                /* JADX INFO: renamed from: y */
                Object f3495y;

                public C41277a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f3493w = obj;
                    this.f3494x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m) {
                this.f3488w = interfaceC13062m;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C41277a c41277a;
                if (interfaceC30057d instanceof C41277a) {
                    c41277a = (C41277a) interfaceC30057d;
                    int i13 = c41277a.f3494x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c41277a.f3494x = i13 - Integer.MIN_VALUE;
                    } else {
                        c41277a = new C41277a(interfaceC30057d);
                    }
                } else {
                    c41277a = new C41277a(interfaceC30057d);
                }
                Object obj2 = c41277a.f3493w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c41277a.f3494x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f3488w;
                    AbstractC38403g healthReport = ((C38399c) obj).getHealthReport();
                    c41277a.f3495y = null;
                    c41277a.f3489E = null;
                    c41277a.f3490F = null;
                    c41277a.f3491G = null;
                    c41277a.f3492H = 0;
                    c41277a.f3494x = 1;
                    if (interfaceC13062m.emit(healthReport, c41277a) == enumC31071a) {
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

        public e(InterfaceC13058l interfaceC13058l) {
            this.f3487w = interfaceC13058l;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f3487w.collect(new a(interfaceC13062m), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: ak1.c$f */
    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class f implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f3497w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C3352b f3498x;

        /* JADX INFO: renamed from: ak1.c$f$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f3499w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C3352b f3500x;

            /* JADX INFO: renamed from: ak1.c$f$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.healthmonitor.presentation.ComposableHealthMonitorViewModel$special$$inlined$map$3$2", m100430f = "ComposableHealthMonitorViewModel.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C41278a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f3501E;

                /* JADX INFO: renamed from: F */
                Object f3502F;

                /* JADX INFO: renamed from: G */
                Object f3503G;

                /* JADX INFO: renamed from: H */
                int f3504H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f3505w;

                /* JADX INFO: renamed from: x */
                int f3506x;

                /* JADX INFO: renamed from: y */
                Object f3507y;

                public C41278a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f3505w = obj;
                    this.f3506x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m, C3352b c3352b) {
                this.f3499w = interfaceC13062m;
                this.f3500x = c3352b;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C41278a c41278a;
                if (interfaceC30057d instanceof C41278a) {
                    c41278a = (C41278a) interfaceC30057d;
                    int i13 = c41278a.f3506x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c41278a.f3506x = i13 - Integer.MIN_VALUE;
                    } else {
                        c41278a = new C41278a(interfaceC30057d);
                    }
                } else {
                    c41278a = new C41278a(interfaceC30057d);
                }
                Object obj2 = c41278a.f3505w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c41278a.f3506x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f3499w;
                    AbstractC4788k abstractC4788kM9683f = this.f3500x.m9683f((AbstractC38403g) obj);
                    c41278a.f3507y = null;
                    c41278a.f3501E = null;
                    c41278a.f3502F = null;
                    c41278a.f3503G = null;
                    c41278a.f3504H = 0;
                    c41278a.f3506x = 1;
                    if (interfaceC13062m.emit(abstractC4788kM9683f, c41278a) == enumC31071a) {
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

        public f(InterfaceC13058l interfaceC13058l, C3352b c3352b) {
            this.f3497w = interfaceC13058l;
            this.f3498x = c3352b;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f3497w.collect(new a(interfaceC13062m, this.f3498x), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: ak1.c$g */
    /* JADX INFO: loaded from: classes9.dex */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class g implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f3509w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C3352b f3510x;

        /* JADX INFO: renamed from: ak1.c$g$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f3511w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C3352b f3512x;

            /* JADX INFO: renamed from: ak1.c$g$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.healthmonitor.presentation.ComposableHealthMonitorViewModel$special$$inlined$map$4$2", m100430f = "ComposableHealthMonitorViewModel.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C41279a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f3513E;

                /* JADX INFO: renamed from: F */
                Object f3514F;

                /* JADX INFO: renamed from: G */
                Object f3515G;

                /* JADX INFO: renamed from: H */
                int f3516H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f3517w;

                /* JADX INFO: renamed from: x */
                int f3518x;

                /* JADX INFO: renamed from: y */
                Object f3519y;

                public C41279a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f3517w = obj;
                    this.f3518x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m, C3352b c3352b) {
                this.f3511w = interfaceC13062m;
                this.f3512x = c3352b;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C41279a c41279a;
                if (interfaceC30057d instanceof C41279a) {
                    c41279a = (C41279a) interfaceC30057d;
                    int i13 = c41279a.f3518x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c41279a.f3518x = i13 - Integer.MIN_VALUE;
                    } else {
                        c41279a = new C41279a(interfaceC30057d);
                    }
                } else {
                    c41279a = new C41279a(interfaceC30057d);
                }
                Object obj2 = c41279a.f3517w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c41279a.f3518x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f3511w;
                    C0951d c0951dM9682d = this.f3512x.m9682d((C38399c) obj);
                    c41279a.f3519y = null;
                    c41279a.f3513E = null;
                    c41279a.f3514F = null;
                    c41279a.f3515G = null;
                    c41279a.f3516H = 0;
                    c41279a.f3518x = 1;
                    if (interfaceC13062m.emit(c0951dM9682d, c41279a) == enumC31071a) {
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

        public g(InterfaceC13058l interfaceC13058l, C3352b c3352b) {
            this.f3509w = interfaceC13058l;
            this.f3510x = c3352b;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f3509w.collect(new a(interfaceC13062m, this.f3510x), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0950c(C38401e interactor, C3352b reducer, C39530e liveHrStateCombiner, C32705d strapDomainInteractor, C3351a composableHealthMonitorCombiner, InterfaceC2994c0 coroutineScope) {
        super(coroutineScope);
        AbstractC22676k.m65750j(interactor, "interactor");
        AbstractC22676k.m65750j(reducer, "reducer");
        AbstractC22676k.m65750j(liveHrStateCombiner, "liveHrStateCombiner");
        AbstractC22676k.m65750j(strapDomainInteractor, "strapDomainInteractor");
        AbstractC22676k.m65750j(composableHealthMonitorCombiner, "composableHealthMonitorCombiner");
        AbstractC22676k.m65750j(coroutineScope, "coroutineScope");
        this.liveHrStateCombiner = liveHrStateCombiner;
        this.composableHealthMonitorCombiner = composableHealthMonitorCombiner;
        this.coroutineScope = coroutineScope;
        C13096w1 c13096w1M36592b = AbstractC13091v.m36592b(0, 0, null, 7);
        this.eventFlow = c13096w1M36592b;
        C13096w1 c13096w1M36592b2 = AbstractC13091v.m36592b(0, 0, null, 7);
        this.connectivityTileEventFlow = c13096w1M36592b2;
        InterfaceC13058l interfaceC13058lM2392p = m2392p(new d(c13096w1M36592b, this), interactor);
        C13021b2 c13021b2 = C13105z1.f45288a;
        C13078q1 c13078q1M36586L = AbstractC13091v.m36586L(interfaceC13058lM2392p, coroutineScope, c13021b2, 1);
        this.domainState = c13078q1M36586L;
        this.healthReportViewState = AbstractC13091v.m36587M(new f(AbstractC13091v.m36610t(new e(c13078q1M36586L)), reducer), coroutineScope, c13021b2, AbstractC4788k.b.f19697b);
        InterfaceC13058l interfaceC13058lM83945a = AbstractC27845h.m83945a(new C13015a0(new a(null), c13096w1M36592b2), strapDomainInteractor);
        this.connTileDomainResult = interfaceC13058lM83945a;
        C13015a0 c13015a0 = new C13015a0(new b(null), liveHrStateCombiner.getLiveHrCombinedFlow());
        this.liveHrFlow = c13015a0;
        this.viewState = AbstractC13091v.m36586L(new g(composableHealthMonitorCombiner.m9669a(c13078q1M36586L, c13015a0, interfaceC13058lM83945a), reducer), coroutineScope, c13021b2, 1);
    }

    /* JADX INFO: renamed from: p */
    private final InterfaceC13058l m2392p(InterfaceC13058l interfaceC13058l, C38401e c38401e) {
        return c38401e.m122997m(interfaceC13058l);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: r */
    public final AbstractC38397a m2393r(AbstractC0949b viewEvent) {
        if (viewEvent instanceof AbstractC0949b.f) {
            return AbstractC38397a.f.f164315a;
        }
        if (viewEvent instanceof AbstractC0949b.d) {
            return new AbstractC38397a.d(((AbstractC0949b.d) viewEvent).getInitialHr());
        }
        if (viewEvent instanceof AbstractC0949b.e) {
            return new AbstractC38397a.e(((AbstractC0949b.e) viewEvent).getTileState());
        }
        if (viewEvent instanceof AbstractC0949b.a) {
            return AbstractC38397a.a.f164308a;
        }
        if (viewEvent instanceof AbstractC0949b.c) {
            return AbstractC38397a.c.f164310a;
        }
        if (viewEvent instanceof AbstractC0949b.b) {
            return new AbstractC38397a.b(((AbstractC0949b.b) viewEvent).getFile());
        }
        throw new NoWhenBranchMatchedException();
    }

    public final InterfaceC13058l getViewState() {
        return this.viewState;
    }

    /* JADX INFO: renamed from: l */
    public final void m2394l() {
        AbstractC4788k abstractC4788k = (AbstractC4788k) this.healthReportViewState.getValue();
        if (abstractC4788k instanceof AbstractC4788k.c) {
            m2397q(new AbstractC0949b.b(((AbstractC4788k.c) abstractC4788k).getFile()));
        }
    }

    /* JADX INFO: renamed from: n */
    public final void m2395n() {
        m2397q(AbstractC0949b.c.f3452a);
    }

    /* JADX INFO: renamed from: o, reason: from getter */
    public final InterfaceC13037f2 getHealthReportViewState() {
        return this.healthReportViewState;
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
    public /* bridge */ void onResume(InterfaceC1585g0 interfaceC1585g0) {
        super.onResume(interfaceC1585g0);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onStart(InterfaceC1585g0 owner) {
        AbstractC22676k.m65750j(owner, "owner");
        C39530e.m126276t(this.liveHrStateCombiner, true, "health_monitor", null, 4, null);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onStop(InterfaceC1585g0 owner) {
        AbstractC22676k.m65750j(owner, "owner");
        C39530e.m126276t(this.liveHrStateCombiner, false, null, null, 6, null);
    }

    /* JADX INFO: renamed from: q */
    public final void m2397q(AbstractC0949b viewEvent) {
        AbstractC22676k.m65750j(viewEvent, "viewEvent");
        AbstractC3006f0.m8732z(this.coroutineScope, null, null, new c(viewEvent, null), 3);
    }

    public /* synthetic */ C0950c(C38401e c38401e, C3352b c3352b, C39530e c39530e, C32705d c32705d, C3351a c3351a, InterfaceC2994c0 interfaceC2994c0, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(c38401e, c3352b, c39530e, c32705d, c3351a, (i13 & 32) != 0 ? new C28180m(null, 1, null) : interfaceC2994c0);
    }
}
