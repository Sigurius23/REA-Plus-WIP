package mp0;

import androidx.lifecycle.AbstractC1613o1;
import androidx.lifecycle.AbstractC1615p0;
import androidx.lifecycle.AbstractC1640x1;
import androidx.lifecycle.C1621r0;
import androidx.lifecycle.C1630u0;
import androidx.lifecycle.InterfaceC1618q0;
import bc3.AbstractC3006f0;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4351m;
import com.whoop.coaching.sleepcoach.wizard.C6240b;
import com.whoop.data.remote.commons.Resource;
import com.whoop.design.util.TextResource;
import com.whoop.sleep.coach.data.network.model.AlarmScheduleState;
import com.whoop.sleep.coach.data.network.model.HarvardSleepAdviceDto;
import com.whoop.sleep.coach.data.network.model.Vow;
import ec3.AbstractC13091v;
import ec3.C13045h2;
import ec3.C13078q1;
import ec3.C13105z1;
import ec3.InterfaceC13037f2;
import ec3.InterfaceC13058l;
import ec3.InterfaceC13062m;
import ec3.InterfaceC13075p1;
import hj0.AbstractC17356o;
import i92.AbstractC18263h;
import i92.InterfaceC18260e;
import jp0.InterfaceC21847a;
import kp0.AbstractC22748o;
import l83.C23454a0;
import l83.C23465k;
import m83.AbstractC25247g0;
import or2.C28180m;
import p505ts.AbstractC34132o;
import p715kotlin.KotlinNothingValueException;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import p745y81.EnumC39333f;
import q83.C30064k;
import q83.InterfaceC30057d;
import qe2.AbstractC30314g;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import z82.C40191e;

/* JADX INFO: renamed from: mp0.i0 */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u0000 $2\u00020\u0001:\u0001DB1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J!\u0010\u0018\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u00152\b\b\u0002\u0010\u0017\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001a\u001a\u00020\u00122\b\b\u0002\u0010\u0017\u001a\u00020\u0010¢\u0006\u0004\b\u001a\u0010\u001bJ\r\u0010\u001c\u001a\u00020\u0012¢\u0006\u0004\b\u001c\u0010\u001dJ\u0013\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001f0\u001e¢\u0006\u0004\b \u0010!J\u0017\u0010$\u001a\u00020\u00122\b\u0010#\u001a\u0004\u0018\u00010\"¢\u0006\u0004\b$\u0010%R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010,R\u001a\u00101\u001a\u00020\u00108\u0016X\u0096D¢\u0006\f\n\u0004\b-\u0010.\u001a\u0004\b/\u00100R\u0018\u00104\u001a\u0004\u0018\u00010\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b2\u00103R\u0018\u00106\u001a\u0004\u0018\u00010\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b5\u0010.R\u001d\u0010:\u001a\b\u0012\u0004\u0012\u0002070\u001e8\u0006¢\u0006\f\n\u0004\b\u0018\u00108\u001a\u0004\b9\u0010!R\u001d\u0010;\u001a\b\u0012\u0004\u0012\u00020\u001f0\u001e8\u0006¢\u0006\f\n\u0004\b9\u00108\u001a\u0004\b5\u0010!R\u001a\u0010?\u001a\b\u0012\u0004\u0012\u00020=0<8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010>R\u001d\u0010C\u001a\b\u0012\u0004\u0012\u00020=0@8\u0006¢\u0006\f\n\u0004\b\u001a\u0010A\u001a\u0004\b-\u0010B¨\u0006E"}, m65681d2 = {"Lmp0/i0;", "Lhj0/o;", "Ljp0/a;", "harvardSleepCoachRepository", "Lcom/whoop/coaching/sleepcoach/wizard/b;", "conductorRepository", "Li92/e;", "networkMonitor", "Lz82/e;", "eventDispatcher", "Lbc3/c0;", "coroutineScope", "<init>", "(Ljp0/a;Lcom/whoop/coaching/sleepcoach/wizard/b;Li92/e;Lz82/e;Lbc3/c0;)V", "Lcom/whoop/sleep/coach/data/network/model/AlarmScheduleState;", "alarmScheduleState", "", "chipLabelTextDisplay", "Ll83/a0;", "Q", "(Lcom/whoop/sleep/coach/data/network/model/AlarmScheduleState;Ljava/lang/String;)V", "Lcom/whoop/sleep/coach/data/network/model/HarvardSleepAdviceDto;", "sleepAdviceDto", "format", "L", "(Lcom/whoop/sleep/coach/data/network/model/HarvardSleepAdviceDto;Ljava/lang/String;)V", "O", "(Ljava/lang/String;)V", "N", "()V", "Landroidx/lifecycle/p0;", "", "H", "()Landroidx/lifecycle/p0;", "Lkp0/o;", "sleepGoal", "P", "(Lkp0/o;)V", "E", "Ljp0/a;", "F", "Lcom/whoop/coaching/sleepcoach/wizard/b;", "G", "Li92/e;", "Lz82/e;", "I", "Ljava/lang/String;", "o", "()Ljava/lang/String;", "logTag", "J", "Lcom/whoop/sleep/coach/data/network/model/HarvardSleepAdviceDto;", "sleepAdvice", "K", "currentFormat", "Lmp0/j0;", "Landroidx/lifecycle/p0;", "M", "vowLiveData", "sleepScheduleTagVisibleLiveData", "Lec3/p1;", "Lmp0/q;", "Lec3/p1;", "_sleepScheduleTagLiveData", "Lec3/f2;", "Lec3/f2;", "()Lec3/f2;", "sleepScheduleTagStateFlow", "a", "sleep-coach_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C25833i0 extends AbstractC17356o {

    /* JADX INFO: renamed from: Q */
    public static final int f101731Q = 8;

    /* JADX INFO: renamed from: R */
    private static final C25835j0 f101732R = new C25835j0(new TextResource.C8688b(AbstractC30314g.f124252G1, null, 2, null), false, 2, null);

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    private final InterfaceC21847a harvardSleepCoachRepository;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    private final C6240b conductorRepository;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    private final InterfaceC18260e networkMonitor;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    private final C40191e eventDispatcher;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    private final String logTag;

    /* JADX INFO: renamed from: J, reason: from kotlin metadata */
    private HarvardSleepAdviceDto sleepAdvice;

    /* JADX INFO: renamed from: K, reason: from kotlin metadata */
    private String currentFormat;

    /* JADX INFO: renamed from: L, reason: from kotlin metadata */
    private final AbstractC1615p0 vowLiveData;

    /* JADX INFO: renamed from: M, reason: from kotlin metadata */
    private final AbstractC1615p0 sleepScheduleTagVisibleLiveData;

    /* JADX INFO: renamed from: N, reason: from kotlin metadata */
    private final InterfaceC13075p1 _sleepScheduleTagLiveData;

    /* JADX INFO: renamed from: O, reason: from kotlin metadata */
    private final InterfaceC13037f2 sleepScheduleTagStateFlow;

    /* JADX INFO: renamed from: mp0.i0$b */
    /* JADX INFO: loaded from: classes7.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class b {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f101744a;

        static {
            int[] iArr = new int[AlarmScheduleState.values().length];
            try {
                iArr[AlarmScheduleState.OFF.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AlarmScheduleState.ON.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[AlarmScheduleState.NEW.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f101744a = iArr;
        }
    }

    /* JADX INFO: renamed from: mp0.i0$c */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.coaching.sleepcoach.wizard.SleepCoachVowContainerViewModel$getCollapsedLiveData$1", m100430f = "SleepCoachVowContainerViewModel.kt", m100431l = {120}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, m65681d2 = {"Landroidx/lifecycle/q0;", "", "Ll83/a0;", "<anonymous>", "(Landroidx/lifecycle/q0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class c extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f101745w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f101746x;

        /* JADX INFO: renamed from: mp0.i0$c$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ InterfaceC1618q0 f101748w;

            public a(InterfaceC1618q0 interfaceC1618q0) {
                this.f101748w = interfaceC1618q0;
            }

            @Override // ec3.InterfaceC13062m
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Object emit(C25820c c25820c, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
                InterfaceC1618q0 interfaceC1618q0 = this.f101748w;
                EnumC25817b expendedStateFlow = c25820c.getExpendedStateFlow();
                EnumC25817b enumC25817b = EnumC25817b.COLLAPSED_STATE_FLOW;
                Object objM5031a = ((C1621r0) interfaceC1618q0).m5031a(Boolean.valueOf(expendedStateFlow == enumC25817b || c25820c.getExpendedStateFlow() == enumC25817b), interfaceC30057d);
                return objM5031a == EnumC31071a.f128113w ? objM5031a : C23454a0.f92919a;
            }
        }

        public c(InterfaceC30057d<? super c> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            c cVar = C25833i0.this.new c(interfaceC30057d);
            cVar.f101746x = obj;
            return cVar;
        }

        @Override // c93.InterfaceC4351m
        /* JADX INFO: renamed from: f, reason: merged with bridge method [inline-methods] */
        public final Object invoke(InterfaceC1618q0 interfaceC1618q0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((c) create(interfaceC1618q0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            InterfaceC1618q0 interfaceC1618q0 = (InterfaceC1618q0) this.f101746x;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f101745w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC13058l interfaceC13058lM36610t = AbstractC13091v.m36610t(AbstractC1613o1.m5011a(C25833i0.this.conductorRepository.m18632j()));
                a aVar = new a(interfaceC1618q0);
                this.f101746x = null;
                this.f101745w = 1;
                if (interfaceC13058lM36610t.collect(aVar, this) == enumC31071a) {
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

    /* JADX INFO: renamed from: mp0.i0$d */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.coaching.sleepcoach.wizard.SleepCoachVowContainerViewModel$getVow$1", m100430f = "SleepCoachVowContainerViewModel.kt", m100431l = {103}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class d extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f101749w;

        /* JADX INFO: renamed from: y */
        final /* synthetic */ HarvardSleepAdviceDto f101751y;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ String f101752z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(HarvardSleepAdviceDto harvardSleepAdviceDto, String str, InterfaceC30057d<? super d> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f101751y = harvardSleepAdviceDto;
            this.f101752z = str;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C25833i0.this.new d(this.f101751y, this.f101752z, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((d) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            C25835j0 c25835j0;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f101749w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC21847a interfaceC21847a = C25833i0.this.harvardSleepCoachRepository;
                HarvardSleepAdviceDto harvardSleepAdviceDto = this.f101751y;
                String str = this.f101752z;
                this.f101749w = 1;
                obj = interfaceC21847a.mo61832d(harvardSleepAdviceDto, str, this);
                if (obj == enumC31071a) {
                    return enumC31071a;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
            }
            Resource resource = (Resource) obj;
            if (!resource.getSuccess() || resource.getData() == null) {
                c25835j0 = C25833i0.f101732R;
            } else {
                Object data = resource.getData();
                AbstractC22676k.m65747g(data);
                c25835j0 = new C25835j0(new TextResource.C8691e(((Vow) data).getText()), false, 2, null);
            }
            C25833i0 c25833i0 = C25833i0.this;
            c25833i0.m49140v(c25833i0.getVowLiveData(), c25835j0);
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: mp0.i0$e */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.coaching.sleepcoach.wizard.SleepCoachVowContainerViewModel$observeConnectivity$1", m100430f = "SleepCoachVowContainerViewModel.kt", m100431l = {96}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class e extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f101753w;

        /* JADX INFO: renamed from: mp0.i0$e$a */
        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
        public static final class a<T> implements InterfaceC13062m {

            /* JADX INFO: renamed from: w */
            final /* synthetic */ C25833i0 f101755w;

            public a(C25833i0 c25833i0) {
                this.f101755w = c25833i0;
            }

            @Override // ec3.InterfaceC13062m
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Object emit(AbstractC18263h abstractC18263h, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
                String str = this.f101755w.currentFormat;
                if (str != null) {
                    this.f101755w.m76272O(str);
                }
                return C23454a0.f92919a;
            }
        }

        public e(InterfaceC30057d<? super e> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C25833i0.this.new e(interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((e) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f101753w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                C13078q1 c13078q1M36586L = AbstractC13091v.m36586L(AbstractC13091v.m36610t(C25833i0.this.networkMonitor.getNetworkFlow()), AbstractC1640x1.m5043b(C25833i0.this), C13105z1.m36630a(2, 5000L), 1);
                a aVar = new a(C25833i0.this);
                this.f101753w = 1;
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

    /* JADX INFO: renamed from: mp0.i0$f */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.coaching.sleepcoach.wizard.SleepCoachVowContainerViewModel$onLoad$1", m100430f = "SleepCoachVowContainerViewModel.kt", m100431l = {54}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class f extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f101756w;

        /* JADX INFO: renamed from: x */
        private /* synthetic */ Object f101757x;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ String f101759z;

        /* JADX INFO: renamed from: mp0.i0$f$a */
        @InterfaceC32271e(m100429c = "com.whoop.coaching.sleepcoach.wizard.SleepCoachVowContainerViewModel$onLoad$1$1$1", m100430f = "SleepCoachVowContainerViewModel.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
        @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
        public static final class a extends AbstractC32275i implements InterfaceC4351m {

            /* JADX INFO: renamed from: w */
            int f101760w;

            /* JADX INFO: renamed from: x */
            final /* synthetic */ C25833i0 f101761x;

            /* JADX INFO: renamed from: y */
            final /* synthetic */ HarvardSleepAdviceDto f101762y;

            /* JADX INFO: renamed from: z */
            final /* synthetic */ String f101763z;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(C25833i0 c25833i0, HarvardSleepAdviceDto harvardSleepAdviceDto, String str, InterfaceC30057d<? super a> interfaceC30057d) {
                super(2, interfaceC30057d);
                this.f101761x = c25833i0;
                this.f101762y = harvardSleepAdviceDto;
                this.f101763z = str;
            }

            @Override // s83.AbstractC32267a
            public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
                return new a(this.f101761x, this.f101762y, this.f101763z, interfaceC30057d);
            }

            @Override // c93.InterfaceC4351m
            public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
                return ((a) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
            }

            @Override // s83.AbstractC32267a
            public final Object invokeSuspend(Object obj) {
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                if (this.f101760w != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
                this.f101761x.m76262L(this.f101762y, this.f101763z);
                return C23454a0.f92919a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(String str, InterfaceC30057d<? super f> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f101759z = str;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            f fVar = C25833i0.this.new f(this.f101759z, interfaceC30057d);
            fVar.f101757x = obj;
            return fVar;
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((f) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            InterfaceC2994c0 interfaceC2994c0 = (InterfaceC2994c0) this.f101757x;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f101756w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                C25833i0 c25833i0 = C25833i0.this;
                c25833i0.m49140v(c25833i0.getVowLiveData(), new C25835j0(null, true, 1, null));
                InterfaceC21847a interfaceC21847a = C25833i0.this.harvardSleepCoachRepository;
                this.f101757x = interfaceC2994c0;
                this.f101756w = 1;
                obj = interfaceC21847a.mo61829a(this);
                if (obj == enumC31071a) {
                    return enumC31071a;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
            }
            HarvardSleepAdviceDto harvardSleepAdviceDto = (HarvardSleepAdviceDto) obj;
            if (harvardSleepAdviceDto != null) {
                C25833i0.this.sleepAdvice = harvardSleepAdviceDto;
                C25833i0.this.m76263Q(harvardSleepAdviceDto.getAlarmScheduleState(), harvardSleepAdviceDto.getChipLabelTextDisplay());
            } else {
                C25833i0 c25833i1 = C25833i0.this;
                c25833i1.m49140v(c25833i1.getVowLiveData(), C25833i0.f101732R);
            }
            HarvardSleepAdviceDto harvardSleepAdviceDto2 = C25833i0.this.sleepAdvice;
            if (harvardSleepAdviceDto2 != null) {
                AbstractC3006f0.m8732z(interfaceC2994c0, null, null, new a(C25833i0.this, harvardSleepAdviceDto2, this.f101759z, null), 3);
            }
            return C23454a0.f92919a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C25833i0(InterfaceC21847a harvardSleepCoachRepository, C6240b conductorRepository, InterfaceC18260e networkMonitor, C40191e eventDispatcher, InterfaceC2994c0 coroutineScope) {
        super(coroutineScope);
        AbstractC22676k.m65750j(harvardSleepCoachRepository, "harvardSleepCoachRepository");
        AbstractC22676k.m65750j(conductorRepository, "conductorRepository");
        AbstractC22676k.m65750j(networkMonitor, "networkMonitor");
        AbstractC22676k.m65750j(eventDispatcher, "eventDispatcher");
        AbstractC22676k.m65750j(coroutineScope, "coroutineScope");
        this.harvardSleepCoachRepository = harvardSleepCoachRepository;
        this.conductorRepository = conductorRepository;
        this.networkMonitor = networkMonitor;
        this.eventDispatcher = eventDispatcher;
        this.logTag = "SleepCoachVowContainerViewModel";
        this.currentFormat = "TWELVE_HOUR";
        this.vowLiveData = new C1630u0();
        this.sleepScheduleTagVisibleLiveData = conductorRepository.m18639q();
        C13045h2 c13045h2M36593c = AbstractC13091v.m36593c(new C25848q(null, null, null, 7, null));
        this._sleepScheduleTagLiveData = c13045h2M36593c;
        this.sleepScheduleTagStateFlow = AbstractC13091v.m36598h(c13045h2M36593c);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: L */
    public final void m76262L(HarvardSleepAdviceDto sleepAdviceDto, String format) {
        m49140v(this.vowLiveData, new C25835j0(null, true, 1, null));
        AbstractC3006f0.m8732z(AbstractC1640x1.m5043b(this), null, null, new d(sleepAdviceDto, format, null), 3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: Q */
    public final void m76263Q(AlarmScheduleState alarmScheduleState, String chipLabelTextDisplay) {
        C25848q c25848q;
        InterfaceC13075p1 interfaceC13075p1 = this._sleepScheduleTagLiveData;
        int i13 = b.f101744a[alarmScheduleState.ordinal()];
        if (i13 == 1) {
            c25848q = new C25848q(new TextResource.C8691e(chipLabelTextDisplay), EnumC39333f.WHITE_10, EnumC39333f.WHITE_30);
        } else if (i13 == 2) {
            c25848q = new C25848q(new TextResource.C8691e(chipLabelTextDisplay), EnumC39333f.ACCENT_POSITIVE_TREND_15, EnumC39333f.ACCENT_ACTION);
        } else {
            if (i13 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            c25848q = new C25848q(new TextResource.C8691e(chipLabelTextDisplay), EnumC39333f.ACCENT_ONBOARDING_ACTION, EnumC39333f.BRAND_WHITE);
        }
        C13045h2 c13045h2 = (C13045h2) interfaceC13075p1;
        c13045h2.getClass();
        c13045h2.m36571k(null, c25848q);
    }

    /* JADX INFO: renamed from: H */
    public final AbstractC1615p0 m76267H() {
        return AbstractC1640x1.m5044c(C30064k.f122676w, new c(null));
    }

    /* JADX INFO: renamed from: I, reason: from getter */
    public final InterfaceC13037f2 getSleepScheduleTagStateFlow() {
        return this.sleepScheduleTagStateFlow;
    }

    /* JADX INFO: renamed from: K, reason: from getter */
    public final AbstractC1615p0 getSleepScheduleTagVisibleLiveData() {
        return this.sleepScheduleTagVisibleLiveData;
    }

    /* JADX INFO: renamed from: M, reason: from getter */
    public final AbstractC1615p0 getVowLiveData() {
        return this.vowLiveData;
    }

    /* JADX INFO: renamed from: N */
    public final void m76271N() {
        AbstractC3006f0.m8732z(AbstractC1640x1.m5043b(this), null, null, new e(null), 3);
    }

    /* JADX INFO: renamed from: O */
    public final void m76272O(String format) {
        AbstractC22676k.m65750j(format, "format");
        this.currentFormat = format;
        AbstractC3006f0.m8732z(AbstractC1640x1.m5043b(this), null, null, new f(format, null), 3);
    }

    /* JADX INFO: renamed from: P */
    public final void m76273P(AbstractC22748o sleepGoal) {
        this.eventDispatcher.m129043l0("Press", "Sleep Coach - Press Sleep Goal", "Pill", AbstractC25247g0.m73990Y(new C23465k("currentGoal", sleepGoal), new C23465k("object", "Sleep Goal")));
    }

    @Override // hj0.AbstractC17356o
    /* JADX INFO: renamed from: o, reason: from getter */
    public String getLogTag() {
        return this.logTag;
    }

    public /* synthetic */ C25833i0(InterfaceC21847a interfaceC21847a, C6240b c6240b, InterfaceC18260e interfaceC18260e, C40191e c40191e, InterfaceC2994c0 interfaceC2994c0, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(interfaceC21847a, c6240b, interfaceC18260e, c40191e, (i13 & 16) != 0 ? new C28180m(null, 1, null) : interfaceC2994c0);
    }
}
