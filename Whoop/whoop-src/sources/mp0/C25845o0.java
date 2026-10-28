package mp0;

import androidx.lifecycle.AbstractC1615p0;
import androidx.lifecycle.AbstractC1640x1;
import androidx.lifecycle.C1630u0;
import bc3.AbstractC3006f0;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4351m;
import ci2.InterfaceC4733b;
import com.whoop.coaching.sleepcoach.wizard.C6240b;
import ec3.AbstractC13091v;
import ec3.C13052j1;
import ec3.C13078q1;
import ec3.C13105z1;
import ec3.InterfaceC13058l;
import ec3.InterfaceC13062m;
import f93.InterfaceC14292d;
import hj0.AbstractC17356o;
import i92.AbstractC18263h;
import i92.InterfaceC18260e;
import ih0.AbstractC18489d0;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import j93.InterfaceC21493z;
import java.util.LinkedHashMap;
import jk0.InterfaceC21750d;
import l83.C23454a0;
import l83.C23465k;
import m83.AbstractC25247g0;
import or2.C28180m;
import p505ts.AbstractC34132o;
import p715kotlin.KotlinNothingValueException;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22686q;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.InterfaceC30057d;
import qf2.C30327f;
import r80.AbstractC31061c;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import st0.EnumC32978v;
import sx1.C33067c;
import sx1.C33069e;
import sx1.EnumC33066b;
import z82.C40191e;

/* JADX INFO: renamed from: mp0.o0 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\b\u0007\u0018\u00002\u00020\u0001BA\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0013\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u001d\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0019\u001a\u00020\u0018¢\u0006\u0004\b\u001b\u0010\u001cJ\r\u0010\u001d\u001a\u00020\u001a¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\u001aH\u0014¢\u0006\u0004\b\u001f\u0010\u001eJ'\u0010$\u001a\u00020\u001a2\u0006\u0010!\u001a\u00020 2\u0006\u0010\"\u001a\u00020 2\b\u0010#\u001a\u0004\u0018\u00010 ¢\u0006\u0004\b$\u0010%R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010(R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010)R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010*R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u001a\u00103\u001a\u00020 8\u0016X\u0096D¢\u0006\f\n\u0004\b/\u00100\u001a\u0004\b1\u00102R\u001d\u00108\u001a\b\u0012\u0004\u0012\u0002040\u00128\u0006¢\u0006\f\n\u0004\b5\u00106\u001a\u0004\b7\u0010\u0015R+\u0010@\u001a\u0002092\u0006\u0010:\u001a\u0002098F@FX\u0086\u008e\u0002¢\u0006\u0012\n\u0004\b;\u0010<\u001a\u0004\b=\u0010>\"\u0004\b+\u0010?R\u001d\u0010E\u001a\b\u0012\u0004\u0012\u0002090A8\u0006¢\u0006\f\n\u0004\bB\u0010C\u001a\u0004\b&\u0010DR\u001d\u0010H\u001a\b\u0012\u0004\u0012\u0002090\u00128\u0006¢\u0006\f\n\u0004\bF\u00106\u001a\u0004\bG\u0010\u0015¨\u0006I"}, m65681d2 = {"Lmp0/o0;", "Lhj0/o;", "Lcom/whoop/coaching/sleepcoach/wizard/b;", "conductorRepository", "Lz82/e;", "eventDispatcher", "Li92/e;", "networkMonitor", "Lqf2/f;", "smartAlarmRepository", "Lci2/b;", "whoopStrapProvider", "Lsx1/c;", "reactivationModalCoordinator", "Lbc3/c0;", "coroutineScope", "<init>", "(Lcom/whoop/coaching/sleepcoach/wizard/b;Lz82/e;Li92/e;Lqf2/f;Lci2/b;Lsx1/c;Lbc3/c0;)V", "Landroidx/lifecycle/p0;", "Lmp0/c;", "B", "()Landroidx/lifecycle/p0;", "Lmp0/b;", "currentFlow", "Lmp0/o;", "previousFlowBeforeLoading", "Ll83/a0;", "F", "(Lmp0/b;Lmp0/o;)V", "G", "()V", "onCleared", "", "trigger", "clickType", "sourcePillar", "H", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "E", "Lcom/whoop/coaching/sleepcoach/wizard/b;", "Lz82/e;", "Li92/e;", "Lqf2/f;", "I", "Lci2/b;", "J", "Lsx1/c;", "K", "Ljava/lang/String;", "o", "()Ljava/lang/String;", "logTag", "Lmp0/p;", "L", "Landroidx/lifecycle/p0;", "D", "onBackPressedHandlerLiveData", "", "<set-?>", "M", "Lf93/d;", "getExpanded", "()Z", "(Z)V", "expanded", "Lec3/l;", "N", "Lec3/l;", "()Lec3/l;", "reactivationModalNavigationFlow", "O", "C", "connectionLiveData", "sleep-coach_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C25845o0 extends AbstractC17356o {

    /* JADX INFO: renamed from: P */
    static final /* synthetic */ InterfaceC21493z[] f101787P = {AbstractC22671h0.f89337a.mutableProperty1(new C22686q(C25845o0.class, "expanded", "getExpanded()Z", 0))};

    /* JADX INFO: renamed from: Q */
    public static final int f101788Q = 8;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    private final C6240b conductorRepository;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    private final C40191e eventDispatcher;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    private final InterfaceC18260e networkMonitor;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    private final C30327f smartAlarmRepository;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    private final InterfaceC4733b whoopStrapProvider;

    /* JADX INFO: renamed from: J, reason: from kotlin metadata */
    private final C33067c reactivationModalCoordinator;

    /* JADX INFO: renamed from: K, reason: from kotlin metadata */
    private final String logTag;

    /* JADX INFO: renamed from: L, reason: from kotlin metadata */
    private final AbstractC1615p0 onBackPressedHandlerLiveData;

    /* JADX INFO: renamed from: M, reason: from kotlin metadata */
    private final InterfaceC14292d expanded;

    /* JADX INFO: renamed from: N, reason: from kotlin metadata */
    private final InterfaceC13058l reactivationModalNavigationFlow;

    /* JADX INFO: renamed from: O, reason: from kotlin metadata */
    private final AbstractC1615p0 connectionLiveData;

    /* JADX INFO: renamed from: mp0.o0$a */
    /* JADX INFO: loaded from: classes7.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f101800a;

        static {
            int[] iArr = new int[EnumC25817b.values().length];
            try {
                iArr[EnumC25817b.ALARM_SET_TO_FLOW.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC25817b.LATEST_WAKE_TIME_FLOW.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC25817b.SLEEP_GOAL_FLOW.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[EnumC25817b.COLLAPSED_STATE_FLOW.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[EnumC25817b.SAVING_STATE_FLOW.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[EnumC25817b.ALARM_SET_REMINDER_FLOW.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[EnumC25817b.EMPTY_STATE.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            f101800a = iArr;
        }
    }

    /* JADX INFO: renamed from: mp0.o0$b */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.coaching.sleepcoach.wizard.SleepCoachWizardConductorViewModel$observeConnectivity$1", m100430f = "SleepCoachWizardConductorViewModel.kt", m100431l = {82}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class b extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f101801w;

        /* JADX INFO: renamed from: mp0.o0$b$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ C25845o0 f101803w;

            public a(C25845o0 c25845o0) {
                this.f101803w = c25845o0;
            }

            @Override // ec3.InterfaceC13062m
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Object emit(AbstractC18263h abstractC18263h, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
                C25845o0 c25845o0 = this.f101803w;
                c25845o0.m49140v(c25845o0.getConnectionLiveData(), Boolean.valueOf(abstractC18263h.m52614a()));
                return C23454a0.f92919a;
            }
        }

        public b(InterfaceC30057d<? super b> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C25845o0.this.new b(interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((b) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f101801w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                C13078q1 c13078q1M36586L = AbstractC13091v.m36586L(AbstractC13091v.m36610t(C25845o0.this.networkMonitor.getNetworkFlow()), AbstractC1640x1.m5043b(C25845o0.this), C13105z1.m36630a(2, 5000L), 1);
                a aVar = new a(C25845o0.this);
                this.f101801w = 1;
                if (c13078q1M36586L.f45191w.collect(aVar, this) == enumC31071a) {
                    return enumC31071a;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
            }
            throw new KotlinNothingValueException();
        }
    }

    /* JADX INFO: renamed from: mp0.o0$c */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.coaching.sleepcoach.wizard.SleepCoachWizardConductorViewModel$reactivationModalNavigationFlow$3", m100430f = "SleepCoachWizardConductorViewModel.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"", "it", "Ll83/a0;", "<anonymous>", "(Z)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class c extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f101804w;

        public c(InterfaceC30057d<? super c> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C25845o0.this.new c(interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
            return invoke(((Boolean) obj).booleanValue(), (InterfaceC30057d<? super C23454a0>) obj2);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.f101804w != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            C25845o0.this.reactivationModalCoordinator.m104725f(EnumC33066b.SLEEP_PLANNER_SCREEN, false);
            return C23454a0.f92919a;
        }

        public final Object invoke(boolean z4, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((c) create(Boolean.valueOf(z4), interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }
    }

    /* JADX INFO: renamed from: mp0.o0$d */
    /* JADX INFO: loaded from: classes7.dex */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class d implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f101806w;

        /* JADX INFO: renamed from: mp0.o0$d$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f101807w;

            /* JADX INFO: renamed from: mp0.o0$d$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.coaching.sleepcoach.wizard.SleepCoachWizardConductorViewModel$special$$inlined$filter$1$2", m100430f = "SleepCoachWizardConductorViewModel.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C42017a extends AbstractC32269c {

                /* JADX INFO: renamed from: F */
                Object f101809F;

                /* JADX INFO: renamed from: G */
                Object f101810G;

                /* JADX INFO: renamed from: H */
                int f101811H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f101812w;

                /* JADX INFO: renamed from: x */
                int f101813x;

                /* JADX INFO: renamed from: y */
                Object f101814y;

                /* JADX INFO: renamed from: z */
                Object f101815z;

                public C42017a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f101812w = obj;
                    this.f101813x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m) {
                this.f101807w = interfaceC13062m;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C42017a c42017a;
                if (interfaceC30057d instanceof C42017a) {
                    c42017a = (C42017a) interfaceC30057d;
                    int i13 = c42017a.f101813x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c42017a.f101813x = i13 - Integer.MIN_VALUE;
                    } else {
                        c42017a = new C42017a(interfaceC30057d);
                    }
                } else {
                    c42017a = new C42017a(interfaceC30057d);
                }
                Object obj2 = c42017a.f101812w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c42017a.f101813x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f101807w;
                    if (((Boolean) obj).booleanValue()) {
                        c42017a.f101814y = null;
                        c42017a.f101815z = null;
                        c42017a.f101809F = null;
                        c42017a.f101810G = null;
                        c42017a.f101811H = 0;
                        c42017a.f101813x = 1;
                        if (interfaceC13062m.emit(obj, c42017a) == enumC31071a) {
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
            this.f101806w = interfaceC13058l;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f101806w.collect(new a(interfaceC13062m), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: mp0.o0$e */
    /* JADX INFO: loaded from: classes7.dex */
    @Metadata(m65680d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001J\u001e\u0010\u0005\u001a\u00020\u00042\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002H\u0096@¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, m65681d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lec3/l;", "Lec3/m;", "collector", "Ll83/a0;", "collect", "(Lec3/m;Lq83/d;)Ljava/lang/Object;", "kotlinx-coroutines-core"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class e implements InterfaceC13058l {

        /* JADX INFO: renamed from: w */
        final /* synthetic */ InterfaceC13058l f101816w;

        /* JADX INFO: renamed from: mp0.o0$e$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC13062m f101817w;

            /* JADX INFO: renamed from: mp0.o0$e$a$a, reason: collision with other inner class name */
            @InterfaceC32271e(m100429c = "com.whoop.coaching.sleepcoach.wizard.SleepCoachWizardConductorViewModel$special$$inlined$map$1$2", m100430f = "SleepCoachWizardConductorViewModel.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
            @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
            public static final class C42018a extends AbstractC32269c {

                /* JADX INFO: renamed from: E */
                Object f101818E;

                /* JADX INFO: renamed from: F */
                Object f101819F;

                /* JADX INFO: renamed from: G */
                Object f101820G;

                /* JADX INFO: renamed from: H */
                int f101821H;

                /* JADX INFO: renamed from: w */
                /* synthetic */ Object f101822w;

                /* JADX INFO: renamed from: x */
                int f101823x;

                /* JADX INFO: renamed from: y */
                Object f101824y;

                public C42018a(InterfaceC30057d interfaceC30057d) {
                    super(interfaceC30057d);
                }

                @Override // s83.AbstractC32267a
                public final Object invokeSuspend(Object obj) {
                    this.f101822w = obj;
                    this.f101823x |= Integer.MIN_VALUE;
                    return a.this.emit(null, this);
                }
            }

            public a(InterfaceC13062m interfaceC13062m) {
                this.f101817w = interfaceC13062m;
            }

            /* JADX WARN: Code duplicated, block: B:7:0x0013  */
            @Override // ec3.InterfaceC13062m
            public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                C42018a c42018a;
                if (interfaceC30057d instanceof C42018a) {
                    c42018a = (C42018a) interfaceC30057d;
                    int i13 = c42018a.f101823x;
                    if ((i13 & Integer.MIN_VALUE) != 0) {
                        c42018a.f101823x = i13 - Integer.MIN_VALUE;
                    } else {
                        c42018a = new C42018a(interfaceC30057d);
                    }
                } else {
                    c42018a = new C42018a(interfaceC30057d);
                }
                Object obj2 = c42018a.f101822w;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                int i14 = c42018a.f101823x;
                if (i14 == 0) {
                    AbstractC34132o.m107864I(obj2);
                    InterfaceC13062m interfaceC13062m = this.f101817w;
                    C33069e c33069e = (C33069e) obj;
                    Boolean boolValueOf = Boolean.valueOf((c33069e.getModel() == null || c33069e.m104731d().contains(EnumC33066b.SLEEP_PLANNER_SCREEN)) ? false : true);
                    c42018a.f101824y = null;
                    c42018a.f101818E = null;
                    c42018a.f101819F = null;
                    c42018a.f101820G = null;
                    c42018a.f101821H = 0;
                    c42018a.f101823x = 1;
                    if (interfaceC13062m.emit(boolValueOf, c42018a) == enumC31071a) {
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
            this.f101816w = interfaceC13058l;
        }

        @Override // ec3.InterfaceC13058l
        public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
            Object objCollect = this.f101816w.collect(new a(interfaceC13062m), interfaceC30057d);
            return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: mp0.o0$f */
    /* JADX INFO: loaded from: classes7.dex */
    @Metadata(m65680d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007*\u0001\u0000\b\n\u0018\u00002\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0004\u0012\u00028\u00000\u0001J&\u0010\u0006\u001a\u00028\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0004H\u0096\u0002¢\u0006\u0004\b\u0006\u0010\u0007J.\u0010\n\u001a\u00020\t2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u00042\u0006\u0010\b\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\n\u0010\u000bR\"\u0010\b\u001a\u00028\u00008\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\u0006\u0010\u000e\"\u0004\b\n\u0010\u000f¨\u0006\u0010"}, m65681d2 = {"mp0/o0$f", "Lf93/d;", "", "thisRef", "Lj93/z;", "property", "getValue", "(Ljava/lang/Object;Lj93/z;)Ljava/lang/Object;", "value", "Ll83/a0;", "setValue", "(Ljava/lang/Object;Lj93/z;Ljava/lang/Object;)V", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "Ljava/lang/Object;", "()Ljava/lang/Object;", "(Ljava/lang/Object;)V", "feature_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class f implements InterfaceC14292d {

        /* JADX INFO: renamed from: w, reason: from kotlin metadata */
        private Boolean value;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C25845o0 f101827x;

        /* JADX WARN: Multi-variable type inference failed */
        public f(Object obj, C25845o0 c25845o0) {
            this.f101827x = c25845o0;
            this.value = obj;
        }

        @Override // f93.InterfaceC14291c
        public Boolean getValue(Object thisRef, InterfaceC21493z property) {
            AbstractC22676k.m65750j(property, "property");
            return this.value;
        }

        @Override // f93.InterfaceC14292d
        public void setValue(Object thisRef, InterfaceC21493z property, Boolean value) {
            AbstractC22676k.m65750j(property, "property");
            this.value = value;
            this.f101827x.conductorRepository.m18645w(value.booleanValue());
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C25845o0(C6240b conductorRepository, C40191e eventDispatcher, InterfaceC18260e networkMonitor, C30327f smartAlarmRepository, InterfaceC4733b whoopStrapProvider, C33067c reactivationModalCoordinator, InterfaceC2994c0 coroutineScope) {
        super(coroutineScope);
        AbstractC22676k.m65750j(conductorRepository, "conductorRepository");
        AbstractC22676k.m65750j(eventDispatcher, "eventDispatcher");
        AbstractC22676k.m65750j(networkMonitor, "networkMonitor");
        AbstractC22676k.m65750j(smartAlarmRepository, "smartAlarmRepository");
        AbstractC22676k.m65750j(whoopStrapProvider, "whoopStrapProvider");
        AbstractC22676k.m65750j(reactivationModalCoordinator, "reactivationModalCoordinator");
        AbstractC22676k.m65750j(coroutineScope, "coroutineScope");
        this.conductorRepository = conductorRepository;
        this.eventDispatcher = eventDispatcher;
        this.networkMonitor = networkMonitor;
        this.smartAlarmRepository = smartAlarmRepository;
        this.whoopStrapProvider = whoopStrapProvider;
        this.reactivationModalCoordinator = reactivationModalCoordinator;
        this.logTag = "SleepCoachWizardConductorViewModel";
        this.onBackPressedHandlerLiveData = conductorRepository.m18636n();
        this.expanded = new f(Boolean.FALSE, this);
        this.reactivationModalNavigationFlow = new C13052j1(new d(new e(reactivationModalCoordinator.getReactivationModalFlow())), new c(null), 0);
        this.connectionLiveData = new C1630u0();
    }

    /* JADX INFO: renamed from: B */
    public final AbstractC1615p0 m76295B() {
        return this.conductorRepository.m18632j();
    }

    /* JADX INFO: renamed from: C, reason: from getter */
    public final AbstractC1615p0 getConnectionLiveData() {
        return this.connectionLiveData;
    }

    /* JADX INFO: renamed from: D, reason: from getter */
    public final AbstractC1615p0 getOnBackPressedHandlerLiveData() {
        return this.onBackPressedHandlerLiveData;
    }

    /* JADX INFO: renamed from: E, reason: from getter */
    public final InterfaceC13058l getReactivationModalNavigationFlow() {
        return this.reactivationModalNavigationFlow;
    }

    /* JADX INFO: renamed from: F */
    public final void m76299F(EnumC25817b currentFlow, EnumC25844o previousFlowBeforeLoading) {
        AbstractC22676k.m65750j(currentFlow, "currentFlow");
        AbstractC22676k.m65750j(previousFlowBeforeLoading, "previousFlowBeforeLoading");
        switch (a.f101800a[currentFlow.ordinal()]) {
            case 1:
            case 2:
            case 3:
                C6240b c6240b = this.conductorRepository;
                c6240b.m18647y(c6240b.m18637o().m76304a(EnumC25844o.ALARM_FLOW_ON_BACK_PRESS));
                return;
            case 4:
                C6240b c6240b2 = this.conductorRepository;
                c6240b2.m18647y(c6240b2.m18637o().m76304a(EnumC25844o.COLLAPSED_FLOW_ON_BACK_PRESS));
                return;
            case 5:
                C6240b c6240b3 = this.conductorRepository;
                c6240b3.m18647y(c6240b3.m18637o().m76304a(EnumC25844o.SAVING_FLOW_ON_BACK_PRESS));
                return;
            case 6:
                C6240b c6240b4 = this.conductorRepository;
                c6240b4.m18647y(c6240b4.m18637o().m76304a(EnumC25844o.ALARM_SET_REMINDER_ON_BACK_PRESS));
                return;
            case 7:
                C6240b c6240b5 = this.conductorRepository;
                c6240b5.m18647y(c6240b5.m18637o().m76304a(previousFlowBeforeLoading));
                return;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    /* JADX INFO: renamed from: G */
    public final void m76300G() {
        AbstractC3006f0.m8732z(AbstractC1640x1.m5043b(this), null, null, new b(null), 3);
    }

    /* JADX INFO: renamed from: H */
    public final void m76301H(String trigger, String clickType, String sourcePillar) {
        String strM104089b;
        EnumC32978v enumC32978vMo24752w0;
        AbstractC22676k.m65750j(trigger, "trigger");
        AbstractC22676k.m65750j(clickType, "clickType");
        String strM95635k = AbstractC31061c.m95635k(this.smartAlarmRepository.m92681m().m65137f(), "%");
        InterfaceC21750d interfaceC21750d = (InterfaceC21750d) AbstractC18489d0.m53367h(this.whoopStrapProvider);
        if (interfaceC21750d == null || (enumC32978vMo24752w0 = interfaceC21750d.mo24752w0()) == null || (strM104089b = EnumC32978v.INSTANCE.m104089b(enumC32978vMo24752w0)) == null) {
            strM104089b = "";
        }
        LinkedHashMap linkedHashMapM73993b0 = AbstractC25247g0.m73993b0(new C23465k("hardware", strM104089b), new C23465k("Battery", strM95635k), new C23465k("value", clickType));
        if (sourcePillar != null) {
            linkedHashMapM73993b0.put("source", sourcePillar);
        }
        this.eventDispatcher.m129047n0(linkedHashMapM73993b0, trigger);
    }

    /* JADX INFO: renamed from: I */
    public final void m76302I(boolean z4) {
        this.expanded.setValue(this, f101787P[0], Boolean.valueOf(z4));
    }

    @Override // hj0.AbstractC17356o
    /* JADX INFO: renamed from: o, reason: from getter */
    public String getLogTag() {
        return this.logTag;
    }

    @Override // hj0.AbstractC17356o, androidx.lifecycle.AbstractC1637w1
    public void onCleared() {
        super.onCleared();
        C6240b c6240b = this.conductorRepository;
        c6240b.m18647y(c6240b.m18637o().m76304a(EnumC25844o.SYSTEM_BACK_PRESS));
    }

    public /* synthetic */ C25845o0(C6240b c6240b, C40191e c40191e, InterfaceC18260e interfaceC18260e, C30327f c30327f, InterfaceC4733b interfaceC4733b, C33067c c33067c, InterfaceC2994c0 interfaceC2994c0, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(c6240b, c40191e, interfaceC18260e, c30327f, interfaceC4733b, c33067c, (i13 & 64) != 0 ? new C28180m(null, 1, null) : interfaceC2994c0);
    }
}
