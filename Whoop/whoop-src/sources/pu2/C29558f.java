package pu2;

import androidx.lifecycle.AbstractC1637w1;
import androidx.lifecycle.C1601k1;
import androidx.lifecycle.DefaultLifecycleObserver;
import androidx.lifecycle.InterfaceC1585g0;
import bc3.AbstractC3006f0;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4351m;
import com.whoop.data.repositories.FeatureFlagChecker;
import com.whoop.data.repositories.FeatureFlagRepositoryKt;
import com.whoop.weightlifting.feature.active.activeworkout.domain.ActiveWorkout;
import com.whoop.weightlifting.feature.active.activeworkout.domain.C10769b;
import ec3.AbstractC13091v;
import ec3.C13015a0;
import ec3.C13021b2;
import ec3.C13052j1;
import ec3.C13054k;
import ec3.C13060l1;
import ec3.C13078q1;
import ec3.C13081r1;
import ec3.C13096w1;
import ec3.C13105z1;
import ec3.InterfaceC13037f2;
import ec3.InterfaceC13058l;
import ec3.InterfaceC13062m;
import ec3.InterfaceC13072o1;
import ec3.InterfaceC13087t1;
import eq1.C13562a;
import fu2.InterfaceC14786a;
import hu2.AbstractC17668o;
import hu2.InterfaceC17654a;
import hu2.InterfaceC17666m;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import iu2.C20937a;
import l83.C23454a0;
import m83.C25271y;
import no.nordicsemi.android.dfu.DfuBaseService;
import nu2.C27145b;
import nu2.C27146c;
import nu2.C27148e;
import nu2.C27149f;
import nu2.EnumC27144a;
import or2.AbstractC28157e0;
import or2.C28180m;
import ou2.C28377a;
import p007a6.C0456u;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function3;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import td1.EnumC33707e;
import td1.InterfaceC33704b;
import us0.InterfaceC35211g;

/* JADX INFO: renamed from: pu2.f */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000ô\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0081\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0006\u0010\u0014\u001a\u00020\u0013\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\u0006\u0010\u0018\u001a\u00020\u0017\u0012\b\b\u0002\u0010\u001a\u001a\u00020\u0019\u0012\u0006\u0010\u001c\u001a\u00020\u001b\u0012\u0006\u0010\u001e\u001a\u00020\u001d\u0012\u0006\u0010 \u001a\u00020\u001f¢\u0006\u0004\b!\u0010\"J\u0013\u0010%\u001a\u00020$*\u00020#H\u0002¢\u0006\u0004\b%\u0010&J\u0013\u0010(\u001a\u00020$*\u00020'H\u0002¢\u0006\u0004\b(\u0010)J\u0015\u0010,\u001a\u00020+2\u0006\u0010*\u001a\u00020#¢\u0006\u0004\b,\u0010-J\u0017\u00100\u001a\u00020+2\u0006\u0010/\u001a\u00020.H\u0016¢\u0006\u0004\b0\u00101J\u0017\u00102\u001a\u00020+2\u0006\u0010/\u001a\u00020.H\u0016¢\u0006\u0004\b2\u00101R\u0014\u0010\u0016\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u00103R\u0014\u0010\u0018\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00105R\u0014\u0010\u001a\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u00106R\u0014\u0010\u001c\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b7\u00108R\u0014\u0010 \u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u0010:R\u001a\u0010?\u001a\b\u0012\u0004\u0012\u00020<0;8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u0010>R\u001a\u0010B\u001a\b\u0012\u0004\u0012\u00020@0;8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bA\u0010>R\u0014\u0010F\u001a\u00020C8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bD\u0010ER\u001a\u0010J\u001a\b\u0012\u0004\u0012\u00020$0G8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bH\u0010IR\u001a\u0010N\u001a\b\u0012\u0004\u0012\u00020C0K8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bL\u0010MR \u0010R\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020P0O0;8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bQ\u0010>R\u001a\u0010V\u001a\b\u0012\u0004\u0012\u00020#0S8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bT\u0010UR\u001c\u0010Y\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010W0;8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bX\u0010>R\u001c\u0010[\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010<0G8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bZ\u0010IR\u001a\u0010^\u001a\b\u0012\u0004\u0012\u00020\\0G8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b]\u0010IR\u001d\u0010c\u001a\b\u0012\u0004\u0012\u00020_0G8\u0006¢\u0006\f\n\u0004\b`\u0010I\u001a\u0004\ba\u0010bR\u001f\u0010g\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010d0G8\u0006¢\u0006\f\n\u0004\be\u0010I\u001a\u0004\bf\u0010bR\u001a\u0010j\u001a\b\u0012\u0004\u0012\u00020h0G8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bi\u0010I¨\u0006k"}, m65681d2 = {"Lpu2/f;", "Landroidx/lifecycle/w1;", "Landroidx/lifecycle/DefaultLifecycleObserver;", "Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b;", "interactor", "Lpu2/i;", "vsReducer", "Lou2/a;", "navReducer", "Lpu2/d;", "notificationReducer", "Lnu2/b;", "combiner", "Liu2/a;", "strengthTrainerPacketManager", "Ltd1/b;", "whoopStrap", "Lnu2/e;", "strapListener", "Lnu2/f;", "setTimeInteractor", "Lcom/whoop/data/repositories/FeatureFlagChecker;", "featureFlagChecker", "Landroidx/lifecycle/k1;", "savedStateHandle", "Lbc3/c0;", "coroutineScope", "Lpu2/b;", "notification", "Leq1/a;", "hrZonesRepository", "Lus0/g;", "liveHrZeroAnalytics", "<init>", "(Lcom/whoop/weightlifting/feature/active/activeworkout/domain/b;Lpu2/i;Lou2/a;Lpu2/d;Lnu2/b;Liu2/a;Ltd1/b;Lnu2/e;Lnu2/f;Lcom/whoop/data/repositories/FeatureFlagChecker;Landroidx/lifecycle/k1;Lbc3/c0;Lpu2/b;Leq1/a;Lus0/g;)V", "Lhu2/a$c0;", "Lfu2/a;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "(Lhu2/a$c0;)Lfu2/a;", "Lnu2/a;", "y", "(Lnu2/a;)Lfu2/a;", "viewEvent", "Ll83/a0;", "v", "(Lhu2/a$c0;)V", "Landroidx/lifecycle/g0;", "owner", "onCreate", "(Landroidx/lifecycle/g0;)V", "onDestroy", "Lcom/whoop/data/repositories/FeatureFlagChecker;", "x", "Landroidx/lifecycle/k1;", "Lbc3/c0;", "z", "Lpu2/b;", "E", "Lus0/g;", "Lec3/t1;", "", "F", "Lec3/t1;", "heartRateFlow", "Ltd1/e;", "G", "strapStatusFlow", "", "H", "Z", "useStrapActions", "Lec3/l;", "I", "Lec3/l;", "strapActionsFlow", "Lec3/f2;", "J", "Lec3/f2;", "workoutCompletedFlow", "", "Ldq1/a;", "K", "hrZonesFlow", "Lec3/o1;", "L", "Lec3/o1;", "viewEventFlow", "Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;", "M", "activeWorkoutFlow", "N", "currentSetTimeInSecondsFlow", "Lnu2/c;", "O", "domainState", "Lpu2/h;", "P", "getViewState", "()Lec3/l;", "viewState", "Lhu2/a$k;", "Q", "t", "navEvents", "Lpu2/e;", "R", "notificationState", "weightlifting_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C29558f extends AbstractC1637w1 implements DefaultLifecycleObserver {

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    private final InterfaceC35211g liveHrZeroAnalytics;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    private final InterfaceC13087t1 heartRateFlow;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    private final InterfaceC13087t1 strapStatusFlow;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    private final boolean useStrapActions;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    private final InterfaceC13058l strapActionsFlow;

    /* JADX INFO: renamed from: J, reason: from kotlin metadata */
    private final InterfaceC13037f2 workoutCompletedFlow;

    /* JADX INFO: renamed from: K, reason: from kotlin metadata */
    private final InterfaceC13087t1 hrZonesFlow;

    /* JADX INFO: renamed from: L, reason: from kotlin metadata */
    private final InterfaceC13072o1 viewEventFlow;

    /* JADX INFO: renamed from: M, reason: from kotlin metadata */
    private final InterfaceC13087t1 activeWorkoutFlow;

    /* JADX INFO: renamed from: N, reason: from kotlin metadata */
    private final InterfaceC13058l currentSetTimeInSecondsFlow;

    /* JADX INFO: renamed from: O, reason: from kotlin metadata */
    private final InterfaceC13058l domainState;

    /* JADX INFO: renamed from: P, reason: from kotlin metadata */
    private final InterfaceC13058l viewState;

    /* JADX INFO: renamed from: Q, reason: from kotlin metadata */
    private final InterfaceC13058l navEvents;

    /* JADX INFO: renamed from: R, reason: from kotlin metadata */
    private final InterfaceC13058l notificationState;

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    private final FeatureFlagChecker featureFlagChecker;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    private final C1601k1 savedStateHandle;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    private final InterfaceC2994c0 coroutineScope;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    private final C29554b notification;

    /* JADX INFO: renamed from: pu2.f$a */
    /* JADX INFO: loaded from: classes11.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f120385a;

        static {
            int[] iArr = new int[EnumC27144a.values().length];
            try {
                iArr[EnumC27144a.SaveWorkout.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC27144a.UpdateTemplate.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC27144a.SaveWorkoutAndUpdateTemplate.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f120385a = iArr;
        }
    }

    /* JADX INFO: renamed from: pu2.f$b */
    /* JADX INFO: loaded from: classes11.dex */
    @InterfaceC32271e(m100429c = "com.whoop.weightlifting.feature.active.activeworkout.presentation.ActiveWorkoutViewModel$activeWorkoutFlow$2", m100430f = "ActiveWorkoutViewModel.kt", m100431l = {84}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00002\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m65681d2 = {"Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;", "activeWorkout", "Lfu2/a;", "action", "<anonymous>", "(Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;Lfu2/a;)Lcom/whoop/weightlifting/feature/active/activeworkout/domain/ActiveWorkout;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class b extends AbstractC32275i implements Function3 {

        /* JADX INFO: renamed from: E */
        final /* synthetic */ C29558f f120386E;

        /* JADX INFO: renamed from: w */
        int f120387w;

        /* JADX INFO: renamed from: x */
        /* synthetic */ Object f120388x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f120389y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ C10769b f120390z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(C10769b c10769b, C29558f c29558f, InterfaceC30057d<? super b> interfaceC30057d) {
            super(3, interfaceC30057d);
            this.f120390z = c10769b;
            this.f120386E = c29558f;
        }

        @Override // p715kotlin.jvm.functions.Function3
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public final Object invoke(ActiveWorkout activeWorkout, InterfaceC14786a interfaceC14786a, InterfaceC30057d<? super ActiveWorkout> interfaceC30057d) {
            b bVar = new b(this.f120390z, this.f120386E, interfaceC30057d);
            bVar.f120388x = activeWorkout;
            bVar.f120389y = interfaceC14786a;
            return bVar.invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            ActiveWorkout activeWorkout = (ActiveWorkout) this.f120388x;
            InterfaceC14786a interfaceC14786a = (InterfaceC14786a) this.f120389y;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f120387w;
            if (i13 != 0) {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
                return obj;
            }
            AbstractC34132o.m107864I(obj);
            C10769b c10769b = this.f120390z;
            InterfaceC2994c0 interfaceC2994c0 = this.f120386E.coroutineScope;
            C1601k1 c1601k1 = this.f120386E.savedStateHandle;
            this.f120388x = null;
            this.f120389y = null;
            this.f120387w = 1;
            Object objM28346X = c10769b.m28346X(activeWorkout, interfaceC14786a, interfaceC2994c0, c1601k1, this);
            return objM28346X == enumC31071a ? enumC31071a : objM28346X;
        }
    }

    /* JADX INFO: renamed from: pu2.f$c */
    /* JADX INFO: loaded from: classes11.dex */
    @InterfaceC32271e(m100429c = "com.whoop.weightlifting.feature.active.activeworkout.presentation.ActiveWorkoutViewModel$domainState$1", m100430f = "ActiveWorkoutViewModel.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lnu2/c;", "it", "Ll83/a0;", "<anonymous>", "(Lnu2/c;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class c extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f120391w;

        /* JADX INFO: renamed from: x */
        /* synthetic */ Object f120392x;

        public c(InterfaceC30057d<? super c> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            c cVar = C29558f.this.new c(interfaceC30057d);
            cVar.f120392x = obj;
            return cVar;
        }

        @Override // c93.InterfaceC4351m
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public final Object invoke(C27146c c27146c, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((c) create(c27146c, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            C27146c c27146c = (C27146c) this.f120392x;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f120391w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            Integer numM81632a = c27146c.getCurrentHeartRate();
            if (numM81632a != null) {
                C29558f c29558f = C29558f.this;
                c29558f.liveHrZeroAnalytics.mo71194a(numM81632a.intValue(), "weightlifting");
            }
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: pu2.f$d */
    /* JADX INFO: loaded from: classes11.dex */
    @InterfaceC32271e(m100429c = "com.whoop.weightlifting.feature.active.activeworkout.presentation.ActiveWorkoutViewModel$heartRateFlow$1", m100430f = "ActiveWorkoutViewModel.kt", m100431l = {68}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lec3/m;", "", "Ll83/a0;", "<anonymous>", "(Lec3/m;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class d extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f120394w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f120395x;

        public d(InterfaceC30057d<? super d> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            d dVar = new d(interfaceC30057d);
            dVar.f120395x = obj;
            return dVar;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC13062m interfaceC13062m, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((d) create(interfaceC13062m, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            InterfaceC13062m interfaceC13062m = (InterfaceC13062m) this.f120395x;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f120394w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                Integer num = new Integer(-1);
                this.f120395x = null;
                this.f120394w = 1;
                if (interfaceC13062m.emit(num, this) == enumC31071a) {
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

    /* JADX INFO: renamed from: pu2.f$e */
    /* JADX INFO: loaded from: classes11.dex */
    @InterfaceC32271e(m100429c = "com.whoop.weightlifting.feature.active.activeworkout.presentation.ActiveWorkoutViewModel$hrZonesFlow$1", m100430f = "ActiveWorkoutViewModel.kt", m100431l = {76}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\u00020\u0003*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, m65681d2 = {"Lec3/m;", "", "Ldq1/a;", "Ll83/a0;", "<anonymous>", "(Lec3/m;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class e extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f120396w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f120397x;

        public e(InterfaceC30057d<? super e> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            e eVar = new e(interfaceC30057d);
            eVar.f120397x = obj;
            return eVar;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC13062m interfaceC13062m, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((e) create(interfaceC13062m, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            InterfaceC13062m interfaceC13062m = (InterfaceC13062m) this.f120397x;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f120396w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                this.f120397x = null;
                this.f120396w = 1;
                if (interfaceC13062m.emit(C25271y.f99162w, this) == enumC31071a) {
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

    /* JADX INFO: renamed from: pu2.f$f */
    /* JADX INFO: loaded from: classes11.dex */
    @InterfaceC32271e(m100429c = "com.whoop.weightlifting.feature.active.activeworkout.presentation.ActiveWorkoutViewModel$onCreate$1", m100430f = "ActiveWorkoutViewModel.kt", m100431l = {156}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class f extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f120398w;

        /* JADX INFO: renamed from: pu2.f$f$a */
        @InterfaceC32271e(m100429c = "com.whoop.weightlifting.feature.active.activeworkout.presentation.ActiveWorkoutViewModel$onCreate$1$1", m100430f = "ActiveWorkoutViewModel.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
        @Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lpu2/e;", "newState", "Ll83/a0;", "<anonymous>", "(Lpu2/e;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
        public static final class a extends AbstractC32275i implements InterfaceC4351m {

            /* JADX INFO: renamed from: w */
            int f120400w;

            /* JADX INFO: renamed from: x */
            /* synthetic */ Object f120401x;

            /* JADX INFO: renamed from: y */
            final /* synthetic */ C29558f f120402y;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(C29558f c29558f, InterfaceC30057d<? super a> interfaceC30057d) {
                super(2, interfaceC30057d);
                this.f120402y = c29558f;
            }

            /* JADX INFO: Access modifiers changed from: private */
            /* JADX INFO: renamed from: i */
            public static final C23454a0 m90570i(C29558f c29558f, InterfaceC17654a.c0 c0Var) {
                c29558f.m90566v(c0Var);
                return C23454a0.f92919a;
            }

            @Override // s83.AbstractC32267a
            public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
                a aVar = new a(this.f120402y, interfaceC30057d);
                aVar.f120401x = obj;
                return aVar;
            }

            @Override // c93.InterfaceC4351m
            /* JADX INFO: renamed from: h, reason: merged with bridge method [inline-methods] */
            public final Object invoke(InterfaceC29557e interfaceC29557e, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
                return ((a) create(interfaceC29557e, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
            }

            @Override // s83.AbstractC32267a
            public final Object invokeSuspend(Object obj) {
                InterfaceC29557e interfaceC29557e = (InterfaceC29557e) this.f120401x;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                if (this.f120400w != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
                this.f120402y.notification.m90537p(interfaceC29557e, new C29559g(this.f120402y, 0));
                return C23454a0.f92919a;
            }
        }

        public f(InterfaceC30057d<? super f> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C29558f.this.new f(interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((f) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f120398w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC13058l interfaceC13058l = C29558f.this.notificationState;
                a aVar = new a(C29558f.this, null);
                this.f120398w = 1;
                if (AbstractC13091v.m36604n(interfaceC13058l, aVar, this) == enumC31071a) {
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

    /* JADX INFO: renamed from: pu2.f$g */
    /* JADX INFO: loaded from: classes11.dex */
    @InterfaceC32271e(m100429c = "com.whoop.weightlifting.feature.active.activeworkout.presentation.ActiveWorkoutViewModel$sendEvent$1", m100430f = "ActiveWorkoutViewModel.kt", m100431l = {148}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class g extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f120403w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ InterfaceC17654a.c0 f120405y;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(InterfaceC17654a.c0 c0Var, InterfaceC30057d<? super g> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f120405y = c0Var;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C29558f.this.new g(this.f120405y, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((g) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f120403w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC13072o1 interfaceC13072o1 = C29558f.this.viewEventFlow;
                InterfaceC17654a.c0 c0Var = this.f120405y;
                this.f120403w = 1;
                if (interfaceC13072o1.emit(c0Var, this) == enumC31071a) {
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

    /* JADX INFO: renamed from: pu2.f$h */
    /* JADX INFO: loaded from: classes11.dex */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class h implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f120406w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C29558f f120407x;

        /* JADX INFO: renamed from: pu2.f$h$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f120408w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C29558f f120409x;

            /* JADX INFO: renamed from: pu2.f$h$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.weightlifting.feature.active.activeworkout.presentation.ActiveWorkoutViewModel$special$$inlined$map$1$2", m100430f = "ActiveWorkoutViewModel.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C42194a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f120410E;

                /* JADX INFO: renamed from: F */
                Object f120411F;

                /* JADX INFO: renamed from: G */
                Object f120412G;

                /* JADX INFO: renamed from: H */
                int f120413H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f120414w;

                /* JADX INFO: renamed from: x */
                int f120415x;

                /* JADX INFO: renamed from: y */
                Object f120416y;

                public C42194a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f120414w = obj;
                    this.f120415x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m, C29558f c29558f) {
                this.f120408w = interfaceC13062m;
                this.f120409x = c29558f;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C42194a c42194a;
                if (interfaceC30057d instanceof C42194a) {
                    c42194a = (C42194a) interfaceC30057d;
                    int i13 = c42194a.f120415x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c42194a.f120415x = i13 - Integer.MIN_VALUE;
                    } else {
                        c42194a = new C42194a(interfaceC30057d);
                    }
                } else {
                    c42194a = new C42194a(interfaceC30057d);
                }
                Object obj2 = c42194a.f120414w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c42194a.f120415x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f120408w;
                    InterfaceC14786a interfaceC14786aM90563w = this.f120409x.m90563w((InterfaceC17654a.c0) obj);
                    c42194a.f120416y = null;
                    c42194a.f120410E = null;
                    c42194a.f120411F = null;
                    c42194a.f120412G = null;
                    c42194a.f120413H = 0;
                    c42194a.f120415x = 1;
                    if (interfaceC13062m.emit(interfaceC14786aM90563w, c42194a) == enumC31071a) {
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

        public h(InterfaceC13058l interfaceC13058l, C29558f c29558f) {
            this.f120406w = interfaceC13058l;
            this.f120407x = c29558f;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f120406w.collect(new a(interfaceC13062m, this.f120407x), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: pu2.f$i */
    /* JADX INFO: loaded from: classes11.dex */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class i implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f120418w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C29561i f120419x;

        /* JADX INFO: renamed from: pu2.f$i$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f120420w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C29561i f120421x;

            /* JADX INFO: renamed from: pu2.f$i$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.weightlifting.feature.active.activeworkout.presentation.ActiveWorkoutViewModel$special$$inlined$map$2$2", m100430f = "ActiveWorkoutViewModel.kt", m100431l = {51, 50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C42195a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f120422E;

                /* JADX INFO: renamed from: F */
                Object f120423F;

                /* JADX INFO: renamed from: G */
                Object f120424G;

                /* JADX INFO: renamed from: H */
                Object f120425H;

                /* JADX INFO: renamed from: I */
                Object f120426I;

                /* JADX INFO: renamed from: J */
                Object f120427J;

                /* JADX INFO: renamed from: K */
                int f120428K;

                /* JADX INFO: renamed from: L */
                int f120429L;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f120430w;

                /* JADX INFO: renamed from: x */
                int f120431x;

                /* JADX INFO: renamed from: y */
                Object f120432y;

                public C42195a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f120430w = obj;
                    this.f120431x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m, C29561i c29561i) {
                this.f120420w = interfaceC13062m;
                this.f120421x = c29561i;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            /* JADX WARN: Code restructure failed: missing block: B:21:0x0091, code lost:
            
                if (r2.emit(r9, r0) == r1) goto L22;
             */
            @Override // ec3.InterfaceC13062m
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object emit(java.lang.Object r8, q83.InterfaceC30057d r9) {
                /*
                    r7 = this;
                    boolean r0 = r9 instanceof pu2.C29558f.i.a.C42195a
                    if (r0 == 0) goto L13
                    r0 = r9
                    pu2.f$i$a$a r0 = (pu2.C29558f.i.a.C42195a) r0
                    int r1 = r0.f120431x
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f120431x = r1
                    goto L18
                L13:
                    pu2.f$i$a$a r0 = new pu2.f$i$a$a
                    r0.<init>(r9)
                L18:
                    java.lang.Object r9 = r0.f120430w
                    r83.a r1 = r83.EnumC31071a.f128113w
                    int r2 = r0.f120431x
                    r3 = 2
                    r4 = 1
                    r5 = 0
                    if (r2 == 0) goto L55
                    if (r2 == r4) goto L3b
                    if (r2 != r3) goto L33
                    java.lang.Object r8 = r0.f120424G
                    ec3.m r8 = (ec3.InterfaceC13062m) r8
                    java.lang.Object r8 = r0.f120422E
                    pu2.f$i$a$a r8 = (pu2.C29558f.i.a.C42195a) r8
                    p505ts.AbstractC34132o.m107864I(r9)
                    goto L94
                L33:
                    java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                    java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
                    r8.<init>(r9)
                    throw r8
                L3b:
                    int r8 = r0.f120428K
                    java.lang.Object r2 = r0.f120427J
                    nu2.c r2 = (nu2.C27146c) r2
                    java.lang.Object r2 = r0.f120426I
                    q83.d r2 = (q83.InterfaceC30057d) r2
                    java.lang.Object r2 = r0.f120425H
                    ec3.m r2 = (ec3.InterfaceC13062m) r2
                    java.lang.Object r4 = r0.f120424G
                    ec3.m r4 = (ec3.InterfaceC13062m) r4
                    java.lang.Object r4 = r0.f120422E
                    pu2.f$i$a$a r4 = (pu2.C29558f.i.a.C42195a) r4
                    p505ts.AbstractC34132o.m107864I(r9)
                    goto L7b
                L55:
                    p505ts.AbstractC34132o.m107864I(r9)
                    ec3.m r2 = r7.f120420w
                    nu2.c r8 = (nu2.C27146c) r8
                    pu2.i r9 = r7.f120421x
                    r0.f120432y = r5
                    r0.f120422E = r5
                    r0.f120423F = r5
                    r0.f120424G = r5
                    r0.f120425H = r2
                    r0.f120426I = r5
                    r0.f120427J = r5
                    r6 = 0
                    r0.f120428K = r6
                    r0.f120429L = r6
                    r0.f120431x = r4
                    java.lang.Object r9 = r9.m90622n(r8, r0)
                    if (r9 != r1) goto L7a
                    goto L93
                L7a:
                    r8 = r6
                L7b:
                    r0.f120432y = r5
                    r0.f120422E = r5
                    r0.f120423F = r5
                    r0.f120424G = r5
                    r0.f120425H = r5
                    r0.f120426I = r5
                    r0.f120427J = r5
                    r0.f120428K = r8
                    r0.f120431x = r3
                    java.lang.Object r8 = r2.emit(r9, r0)
                    if (r8 != r1) goto L94
                L93:
                    return r1
                L94:
                    l83.a0 r8 = l83.C23454a0.f92919a
                    return r8
                */
                throw new UnsupportedOperationException("Method not decompiled: pu2.C29558f.i.a.emit(java.lang.Object, q83.d):java.lang.Object");
            }
        }

        public i(InterfaceC13058l interfaceC13058l, C29561i c29561i) {
            this.f120418w = interfaceC13058l;
            this.f120419x = c29561i;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f120418w.collect(new a(interfaceC13062m, this.f120419x), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: pu2.f$j */
    /* JADX INFO: loaded from: classes11.dex */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class j implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f120434w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C28377a f120435x;

        /* JADX INFO: renamed from: pu2.f$j$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f120436w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C28377a f120437x;

            /* JADX INFO: renamed from: pu2.f$j$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.weightlifting.feature.active.activeworkout.presentation.ActiveWorkoutViewModel$special$$inlined$map$3$2", m100430f = "ActiveWorkoutViewModel.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C42196a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f120438E;

                /* JADX INFO: renamed from: F */
                Object f120439F;

                /* JADX INFO: renamed from: G */
                Object f120440G;

                /* JADX INFO: renamed from: H */
                int f120441H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f120442w;

                /* JADX INFO: renamed from: x */
                int f120443x;

                /* JADX INFO: renamed from: y */
                Object f120444y;

                public C42196a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f120442w = obj;
                    this.f120443x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m, C28377a c28377a) {
                this.f120436w = interfaceC13062m;
                this.f120437x = c28377a;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C42196a c42196a;
                if (interfaceC30057d instanceof C42196a) {
                    c42196a = (C42196a) interfaceC30057d;
                    int i13 = c42196a.f120443x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c42196a.f120443x = i13 - Integer.MIN_VALUE;
                    } else {
                        c42196a = new C42196a(interfaceC30057d);
                    }
                } else {
                    c42196a = new C42196a(interfaceC30057d);
                }
                Object obj2 = c42196a.f120442w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c42196a.f120443x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f120436w;
                    InterfaceC17654a.k kVarM86072a = this.f120437x.m86072a((C27146c) obj);
                    c42196a.f120444y = null;
                    c42196a.f120438E = null;
                    c42196a.f120439F = null;
                    c42196a.f120440G = null;
                    c42196a.f120441H = 0;
                    c42196a.f120443x = 1;
                    if (interfaceC13062m.emit(kVarM86072a, c42196a) == enumC31071a) {
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

        public j(InterfaceC13058l interfaceC13058l, C28377a c28377a) {
            this.f120434w = interfaceC13058l;
            this.f120435x = c28377a;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f120434w.collect(new a(interfaceC13062m, this.f120435x), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: pu2.f$k */
    /* JADX INFO: loaded from: classes11.dex */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class k implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f120446w;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C29556d f120447x;

        /* JADX INFO: renamed from: pu2.f$k$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f120448w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C29556d f120449x;

            /* JADX INFO: renamed from: pu2.f$k$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.weightlifting.feature.active.activeworkout.presentation.ActiveWorkoutViewModel$special$$inlined$map$4$2", m100430f = "ActiveWorkoutViewModel.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C42197a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f120450E;

                /* JADX INFO: renamed from: F */
                Object f120451F;

                /* JADX INFO: renamed from: G */
                Object f120452G;

                /* JADX INFO: renamed from: H */
                int f120453H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f120454w;

                /* JADX INFO: renamed from: x */
                int f120455x;

                /* JADX INFO: renamed from: y */
                Object f120456y;

                public C42197a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f120454w = obj;
                    this.f120455x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m, C29556d c29556d) {
                this.f120448w = interfaceC13062m;
                this.f120449x = c29556d;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C42197a c42197a;
                if (interfaceC30057d instanceof C42197a) {
                    c42197a = (C42197a) interfaceC30057d;
                    int i13 = c42197a.f120455x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c42197a.f120455x = i13 - Integer.MIN_VALUE;
                    } else {
                        c42197a = new C42197a(interfaceC30057d);
                    }
                } else {
                    c42197a = new C42197a(interfaceC30057d);
                }
                Object obj2 = c42197a.f120454w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c42197a.f120455x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f120448w;
                    InterfaceC29557e interfaceC29557eM90548c = this.f120449x.m90548c((C27146c) obj);
                    c42197a.f120456y = null;
                    c42197a.f120450E = null;
                    c42197a.f120451F = null;
                    c42197a.f120452G = null;
                    c42197a.f120453H = 0;
                    c42197a.f120455x = 1;
                    if (interfaceC13062m.emit(interfaceC29557eM90548c, c42197a) == enumC31071a) {
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

        public k(InterfaceC13058l interfaceC13058l, C29556d c29556d) {
            this.f120446w = interfaceC13058l;
            this.f120447x = c29556d;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f120446w.collect(new a(interfaceC13062m, this.f120447x), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: pu2.f$l */
    /* JADX INFO: loaded from: classes11.dex */
    @InterfaceC32271e(m100429c = "com.whoop.weightlifting.feature.active.activeworkout.presentation.ActiveWorkoutViewModel$strapStatusFlow$1", m100430f = "ActiveWorkoutViewModel.kt", m100431l = {71}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Lec3/m;", "Ltd1/e;", "Ll83/a0;", "<anonymous>", "(Lec3/m;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class l extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f120458w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f120459x;

        public l(InterfaceC30057d<? super l> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            l lVar = new l(interfaceC30057d);
            lVar.f120459x = obj;
            return lVar;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC13062m interfaceC13062m, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((l) create(interfaceC13062m, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            InterfaceC13062m interfaceC13062m = (InterfaceC13062m) this.f120459x;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f120458w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                EnumC33707e enumC33707e = EnumC33707e.NONE;
                this.f120459x = null;
                this.f120458w = 1;
                if (interfaceC13062m.emit(enumC33707e, this) == enumC31071a) {
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
    public C29558f(C10769b interactor, C29561i vsReducer, C28377a navReducer, C29556d notificationReducer, C27145b combiner, C20937a strengthTrainerPacketManager, InterfaceC33704b whoopStrap, C27148e strapListener, C27149f setTimeInteractor, FeatureFlagChecker featureFlagChecker, C1601k1 savedStateHandle, InterfaceC2994c0 coroutineScope, C29554b notification, C13562a hrZonesRepository, InterfaceC35211g liveHrZeroAnalytics) {
        super(coroutineScope);
        AbstractC22676k.m65750j(interactor, "interactor");
        AbstractC22676k.m65750j(vsReducer, "vsReducer");
        AbstractC22676k.m65750j(navReducer, "navReducer");
        AbstractC22676k.m65750j(notificationReducer, "notificationReducer");
        AbstractC22676k.m65750j(combiner, "combiner");
        AbstractC22676k.m65750j(strengthTrainerPacketManager, "strengthTrainerPacketManager");
        AbstractC22676k.m65750j(whoopStrap, "whoopStrap");
        AbstractC22676k.m65750j(strapListener, "strapListener");
        AbstractC22676k.m65750j(setTimeInteractor, "setTimeInteractor");
        AbstractC22676k.m65750j(featureFlagChecker, "featureFlagChecker");
        AbstractC22676k.m65750j(savedStateHandle, "savedStateHandle");
        AbstractC22676k.m65750j(coroutineScope, "coroutineScope");
        AbstractC22676k.m65750j(notification, "notification");
        AbstractC22676k.m65750j(hrZonesRepository, "hrZonesRepository");
        AbstractC22676k.m65750j(liveHrZeroAnalytics, "liveHrZeroAnalytics");
        this.featureFlagChecker = featureFlagChecker;
        this.savedStateHandle = savedStateHandle;
        this.coroutineScope = coroutineScope;
        this.notification = notification;
        this.liveHrZeroAnalytics = liveHrZeroAnalytics;
        C13015a0 c13015a0 = new C13015a0(new d(null), strengthTrainerPacketManager.m58156h());
        C13021b2 c13021b2 = C13105z1.f45288a;
        C13078q1 c13078q1M36586L = AbstractC13091v.m36586L(c13015a0, coroutineScope, c13021b2, 1);
        this.heartRateFlow = c13078q1M36586L;
        C13078q1 c13078q1M36586L2 = AbstractC13091v.m36586L(new C13015a0(new l(null), whoopStrap.mo106503r()), coroutineScope, c13021b2, 1);
        this.strapStatusFlow = c13078q1M36586L2;
        boolean zIsFeatureEnabled = featureFlagChecker.isFeatureEnabled(FeatureFlagRepositoryKt.WEIGHTLIFTING_START_STOP_SETS_VIA_STRAP);
        this.useStrapActions = zIsFeatureEnabled;
        InterfaceC13058l interfaceC13058lM81639a = zIsFeatureEnabled ? strapListener.getStrapActions() : C13054k.f45116w;
        this.strapActionsFlow = interfaceC13058lM81639a;
        C13081r1 c13081r1M5002c = savedStateHandle.m5002c(Boolean.FALSE, "workoutCompleted");
        this.workoutCompletedFlow = c13081r1M5002c;
        C13078q1 c13078q1M36586L3 = AbstractC13091v.m36586L(new C13015a0(new e(null), hrZonesRepository.m38283l()), coroutineScope, c13021b2, 1);
        this.hrZonesFlow = c13078q1M36586L3;
        C13096w1 c13096w1M36592b = AbstractC13091v.m36592b(0, 0, null, 7);
        this.viewEventFlow = c13096w1M36592b;
        C13078q1 c13078q1M36586L4 = AbstractC13091v.m36586L(new C13060l1(null, AbstractC28157e0.m85207a(new h(c13096w1M36592b, this), interfaceC13058lM81639a), new b(interactor, this, null)), coroutineScope, c13021b2, 1);
        this.activeWorkoutFlow = c13078q1M36586L4;
        InterfaceC13058l interfaceC13058lM81641b = setTimeInteractor.m81641b(c13078q1M36586L4);
        this.currentSetTimeInSecondsFlow = interfaceC13058lM81641b;
        C13052j1 c13052j1 = new C13052j1(combiner.m81630a(c13078q1M36586L4, interfaceC13058lM81641b, c13078q1M36586L, c13078q1M36586L2, c13081r1M5002c, c13078q1M36586L3), new c(null), 0);
        this.domainState = c13052j1;
        this.viewState = new i(c13052j1, vsReducer);
        this.navEvents = AbstractC13091v.m36610t(new j(c13052j1, navReducer));
        this.notificationState = featureFlagChecker.isFeatureEnabled(FeatureFlagRepositoryKt.WEIGHTLIFTING_INTERACTIVE_NOTIFICATIONS) ? new k(c13052j1, notificationReducer) : new C0456u(InterfaceC29557e.b.f120366a, 1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: u */
    public static final C23454a0 m90562u(C29558f c29558f, Throwable th3) {
        c29558f.notification.m90536h();
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: w */
    public final InterfaceC14786a m90563w(InterfaceC17654a.c0 c0Var) {
        if (c0Var instanceof InterfaceC17654a.u) {
            InterfaceC17654a.u uVar = (InterfaceC17654a.u) c0Var;
            return new InterfaceC14786a.q(uVar.getStrapLocation(), uVar.getStrapLaterality(), uVar.getIsQuickStart());
        }
        if (c0Var instanceof InterfaceC17654a.p) {
            return InterfaceC14786a.l.f54829a;
        }
        if (c0Var instanceof InterfaceC17654a.o) {
            return InterfaceC14786a.k.f54828a;
        }
        if (c0Var instanceof InterfaceC17654a.t) {
            InterfaceC17654a.t tVar = (InterfaceC17654a.t) c0Var;
            return new InterfaceC14786a.p(tVar.getOnScreen(), tVar.getFromIcon());
        }
        if (c0Var instanceof InterfaceC17654a.f) {
            return new InterfaceC14786a.e(((InterfaceC17654a.f) c0Var).getOnScreen());
        }
        if (c0Var instanceof InterfaceC17654a.b) {
            return InterfaceC14786a.a.f54817a;
        }
        if (c0Var instanceof InterfaceC17654a.z) {
            return new InterfaceC14786a.w(((InterfaceC17654a.z) c0Var).getNextSetPosition());
        }
        if (c0Var instanceof InterfaceC17654a.g) {
            return InterfaceC14786a.f.f54822a;
        }
        if (c0Var instanceof InterfaceC17654a.d) {
            return InterfaceC14786a.c.f54819a;
        }
        if (c0Var instanceof InterfaceC17654a.q) {
            return new InterfaceC14786a.o(EnumC27144a.SaveWorkout);
        }
        if (c0Var instanceof InterfaceC17654a.b0) {
            return new InterfaceC14786a.o(EnumC27144a.UpdateTemplate);
        }
        if (c0Var instanceof InterfaceC17654a.r) {
            return new InterfaceC14786a.o(EnumC27144a.SaveWorkoutAndUpdateTemplate);
        }
        if (c0Var instanceof InterfaceC17654a.v) {
            return InterfaceC14786a.s.f54839a;
        }
        if (c0Var instanceof InterfaceC17654a.s) {
            return m90564y(((InterfaceC17654a.s) c0Var).getAsyncProcess());
        }
        if (c0Var instanceof InterfaceC17654a.l) {
            InterfaceC17654a.l lVar = (InterfaceC17654a.l) c0Var;
            return new InterfaceC14786a.h(lVar.getGroupIndex(), lVar.getExerciseIndex());
        }
        if (c0Var instanceof InterfaceC17654a.m) {
            return InterfaceC14786a.i.f54826a;
        }
        if (c0Var instanceof InterfaceC17654a.c) {
            return InterfaceC14786a.b.f54818a;
        }
        if (c0Var instanceof InterfaceC17654a.y) {
            return InterfaceC14786a.v.f54842a;
        }
        if (c0Var instanceof InterfaceC17654a.h) {
            return InterfaceC14786a.g.f54823a;
        }
        if (c0Var instanceof InterfaceC17666m) {
            return AbstractC17668o.m50410a((InterfaceC17666m) c0Var);
        }
        if (c0Var instanceof InterfaceC17654a.a0) {
            return new InterfaceC14786a.x(((InterfaceC17654a.a0) c0Var).getRpe());
        }
        if (c0Var instanceof InterfaceC17654a.x) {
            return new InterfaceC14786a.u(((InterfaceC17654a.x) c0Var).getUndoSetPosition());
        }
        if (c0Var instanceof InterfaceC17654a.n) {
            return new InterfaceC14786a.j(((InterfaceC17654a.n) c0Var).getUndoSetPosition());
        }
        if (c0Var instanceof InterfaceC17654a.w) {
            return InterfaceC14786a.t.f54840a;
        }
        if (c0Var instanceof InterfaceC17654a.e) {
            return InterfaceC14786a.d.f54820a;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: renamed from: y */
    private final InterfaceC14786a m90564y(EnumC27144a enumC27144a) {
        int i13 = a.f120385a[enumC27144a.ordinal()];
        if (i13 == 1) {
            return InterfaceC14786a.m.f54830a;
        }
        if (i13 == 2) {
            return InterfaceC14786a.y.f54845a;
        }
        if (i13 == 3) {
            return InterfaceC14786a.n.f54831a;
        }
        throw new NoWhenBranchMatchedException();
    }

    public final InterfaceC13058l getViewState() {
        return this.viewState;
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onCreate(InterfaceC1585g0 owner) {
        AbstractC22676k.m65750j(owner, "owner");
        super.onCreate(owner);
        if (this.featureFlagChecker.isFeatureEnabled(FeatureFlagRepositoryKt.WEIGHTLIFTING_INTERACTIVE_NOTIFICATIONS)) {
            AbstractC3006f0.m8732z(this.coroutineScope, null, null, new f(null), 3).invokeOnCompletion(new C29559g(this, 1));
        }
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public void onDestroy(InterfaceC1585g0 owner) {
        AbstractC22676k.m65750j(owner, "owner");
        super.onDestroy(owner);
        this.liveHrZeroAnalytics.mo71195b("weightlifting");
        if (this.featureFlagChecker.isFeatureEnabled(FeatureFlagRepositoryKt.WEIGHTLIFTING_INTERACTIVE_NOTIFICATIONS)) {
            C29554b.m90533q(this.notification, InterfaceC29557e.b.f120366a, null, 2, null);
        }
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
    public /* bridge */ void onStart(InterfaceC1585g0 interfaceC1585g0) {
        super.onStart(interfaceC1585g0);
    }

    @Override // androidx.lifecycle.DefaultLifecycleObserver
    public /* bridge */ void onStop(InterfaceC1585g0 interfaceC1585g0) {
        super.onStop(interfaceC1585g0);
    }

    /* JADX INFO: renamed from: t, reason: from getter */
    public final InterfaceC13058l getNavEvents() {
        return this.navEvents;
    }

    /* JADX INFO: renamed from: v */
    public final void m90566v(InterfaceC17654a.c0 viewEvent) {
        AbstractC22676k.m65750j(viewEvent, "viewEvent");
        AbstractC3006f0.m8732z(this.coroutineScope, null, null, new g(viewEvent, null), 3);
    }

    public /* synthetic */ C29558f(C10769b c10769b, C29561i c29561i, C28377a c28377a, C29556d c29556d, C27145b c27145b, C20937a c20937a, InterfaceC33704b interfaceC33704b, C27148e c27148e, C27149f c27149f, FeatureFlagChecker featureFlagChecker, C1601k1 c1601k1, InterfaceC2994c0 interfaceC2994c0, C29554b c29554b, C13562a c13562a, InterfaceC35211g interfaceC35211g, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(c10769b, c29561i, c28377a, c29556d, c27145b, c20937a, interfaceC33704b, c27148e, c27149f, featureFlagChecker, c1601k1, (i13 & DfuBaseService.ERROR_REMOTE_TYPE_SECURE_BUTTONLESS) != 0 ? new C28180m(null, 1, null) : interfaceC2994c0, c29554b, c13562a, interfaceC35211g);
    }
}
