package mp0;

import androidx.lifecycle.AbstractC1615p0;
import androidx.lifecycle.AbstractC1637w1;
import androidx.lifecycle.C1630u0;
import bc3.AbstractC3006f0;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4351m;
import ci2.InterfaceC4733b;
import com.whoop.coaching.sleepcoach.wizard.C6239a;
import com.whoop.coaching.sleepcoach.wizard.C6240b;
import com.whoop.coaching.sleepcoach.wizard.C6241c;
import com.whoop.coaching.sleepcoach.wizard.ConductorViewState;
import com.whoop.sleep.coach.data.network.model.HarvardSleepAdviceDto;
import com.whoop.sleep.coach.data.network.model.SleepCoachInteractionModal;
import f93.InterfaceC14292d;
import ih0.AbstractC18489d0;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import j93.InterfaceC21493z;
import jk0.InterfaceC21750d;
import jp0.InterfaceC21847a;
import kp0.C22747n;
import l83.C23454a0;
import l83.C23465k;
import m83.AbstractC25247g0;
import np0.C27009b;
import np0.EnumC27008a;
import or2.C28180m;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22671h0;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.C22684o;
import p715kotlin.jvm.internal.C22686q;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.InterfaceC30057d;
import qf2.C30327f;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import st0.EnumC32978v;
import z82.C40191e;

/* JADX INFO: renamed from: mp0.i */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B9\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0015\u0010\u0015\u001a\u00020\u00102\u0006\u0010\u0014\u001a\u00020\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\u001d\u0010\u0019\u001a\u00020\u00102\u0006\u0010\u0017\u001a\u00020\u00132\u0006\u0010\u0018\u001a\u00020\u0013¢\u0006\u0004\b\u0019\u0010\u001aJ\u0015\u0010\u001d\u001a\u00020\u00102\u0006\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b\u001d\u0010\u001eJ\r\u0010\u001f\u001a\u00020\u0010¢\u0006\u0004\b\u001f\u0010\u0012J\r\u0010 \u001a\u00020\u0010¢\u0006\u0004\b \u0010\u0012J\r\u0010!\u001a\u00020\u0010¢\u0006\u0004\b!\u0010\u0012J\u0015\u0010$\u001a\u00020\u00102\u0006\u0010#\u001a\u00020\"¢\u0006\u0004\b$\u0010%J\u001d\u0010)\u001a\u00020\u00102\u0006\u0010&\u001a\u00020\u00132\u0006\u0010(\u001a\u00020'¢\u0006\u0004\b)\u0010*J\r\u0010+\u001a\u00020\u0010¢\u0006\u0004\b+\u0010\u0012R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010,R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010.R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u00100R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u00103R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00105R(\u0010;\u001a\u0004\u0018\u0001062\b\u00107\u001a\u0004\u0018\u0001068\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u001f\u00108\u001a\u0004\b9\u0010:R(\u0010=\u001a\u0004\u0018\u0001062\b\u00107\u001a\u0004\u0018\u0001068\u0006@BX\u0086\u000e¢\u0006\f\n\u0004\b\u0019\u00108\u001a\u0004\b<\u0010:R\u001d\u0010C\u001a\b\u0012\u0004\u0012\u00020?0>8\u0006¢\u0006\f\n\u0004\b \u0010@\u001a\u0004\bA\u0010BR+\u0010K\u001a\u00020?2\u0006\u0010D\u001a\u00020?8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\bE\u0010F\u001a\u0004\bG\u0010H\"\u0004\bI\u0010JR\u001d\u0010M\u001a\b\u0012\u0004\u0012\u00020\u001b0>8\u0006¢\u0006\f\n\u0004\bL\u0010@\u001a\u0004\b/\u0010BR\u001d\u0010P\u001a\b\u0012\u0004\u0012\u00020N0>8\u0006¢\u0006\f\n\u0004\bI\u0010@\u001a\u0004\bO\u0010BR\u0017\u0010S\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0015\u0010Q\u001a\u0004\b4\u0010RR\u0016\u0010W\u001a\u0004\u0018\u00010T8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bU\u0010VR$\u0010[\u001a\u00020N2\u0006\u00107\u001a\u00020N8B@BX\u0082\u000e¢\u0006\f\u001a\u0004\bX\u0010Y\"\u0004\bL\u0010ZR\u0011\u0010\\\u001a\u00020\u00138F¢\u0006\u0006\u001a\u0004\b1\u0010R¨\u0006]"}, m65681d2 = {"Lmp0/i;", "Landroidx/lifecycle/w1;", "Lcom/whoop/coaching/sleepcoach/wizard/b;", "conductorRepository", "Lci2/b;", "whoopStrapProvider", "Lqf2/f;", "smartAlarmRepository", "Lz82/e;", "eventDispatcher", "Ljp0/a;", "sleepCoachRepository", "Lbc3/c0;", "scope", "<init>", "(Lcom/whoop/coaching/sleepcoach/wizard/b;Lci2/b;Lqf2/f;Lz82/e;Ljp0/a;Lbc3/c0;)V", "Ll83/a0;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "()V", "", "disableSleepSchedule", "M", "(Z)V", "checked", "disableSchedule", "H", "(ZZ)V", "Lcom/whoop/coaching/sleepcoach/wizard/ConductorViewState;", "conductorViewState", "E", "(Lcom/whoop/coaching/sleepcoach/wizard/ConductorViewState;)V", "G", "I", "q", "", "currentAlarmType", "p", "(Ljava/lang/String;)V", "isInToggleMode", "Lmp0/n;", "popUpClickEvent", "t", "(ZLmp0/n;)V", "r", "Lcom/whoop/coaching/sleepcoach/wizard/b;", "x", "Lci2/b;", "y", "Lqf2/f;", "z", "Lz82/e;", "Ljp0/a;", "F", "Lbc3/c0;", "Lcom/whoop/sleep/coach/data/network/model/SleepCoachInteractionModal;", "value", "Lcom/whoop/sleep/coach/data/network/model/SleepCoachInteractionModal;", "A", "()Lcom/whoop/sleep/coach/data/network/model/SleepCoachInteractionModal;", "turnOffAllModal", "B", "turnOffScheduleModal", "Landroidx/lifecycle/p0;", "Lcom/whoop/coaching/sleepcoach/wizard/a;", "Landroidx/lifecycle/p0;", "D", "()Landroidx/lifecycle/p0;", "viewStateLiveData", "<set-?>", "J", "Lf93/d;", "C", "()Lcom/whoop/coaching/sleepcoach/wizard/a;", "L", "(Lcom/whoop/coaching/sleepcoach/wizard/a;)V", "viewState", "K", "parentLiveData", "Lmp0/c;", "u", "alarmOptionDeepLinkLiveData", "Z", "()Z", "isStrapLowBattery", "Ljk0/d;", "N", "Ljk0/d;", "whoopStrap", "v", "()Lmp0/c;", "(Lmp0/c;)V", "alarmOptionFlowState", "sleepScheduleEnabled", "sleep-coach_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C25832i extends AbstractC1637w1 {

    /* JADX INFO: renamed from: O */
    static final /* synthetic */ InterfaceC21493z[] f101710O = {AbstractC22671h0.f89337a.mutableProperty1(new C22686q(C25832i.class, "viewState", "getViewState()Lcom/whoop/coaching/sleepcoach/wizard/CollapsedDataViewState;", 0))};

    /* JADX INFO: renamed from: P */
    public static final int f101711P = 8;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    private final InterfaceC21847a sleepCoachRepository;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    private final InterfaceC2994c0 scope;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    private SleepCoachInteractionModal turnOffAllModal;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    private SleepCoachInteractionModal turnOffScheduleModal;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    private final AbstractC1615p0 viewStateLiveData;

    /* JADX INFO: renamed from: J, reason: from kotlin metadata */
    private final InterfaceC14292d viewState;

    /* JADX INFO: renamed from: K, reason: from kotlin metadata */
    private final AbstractC1615p0 parentLiveData;

    /* JADX INFO: renamed from: L, reason: from kotlin metadata */
    private final AbstractC1615p0 alarmOptionDeepLinkLiveData;

    /* JADX INFO: renamed from: M, reason: from kotlin metadata */
    private final boolean isStrapLowBattery;

    /* JADX INFO: renamed from: N, reason: from kotlin metadata */
    private final InterfaceC21750d whoopStrap;

    /* JADX INFO: renamed from: w, reason: from kotlin metadata */
    private final C6240b conductorRepository;

    /* JADX INFO: renamed from: x, reason: from kotlin metadata */
    private final InterfaceC4733b whoopStrapProvider;

    /* JADX INFO: renamed from: y, reason: from kotlin metadata */
    private final C30327f smartAlarmRepository;

    /* JADX INFO: renamed from: z, reason: from kotlin metadata */
    private final C40191e eventDispatcher;

    /* JADX INFO: renamed from: mp0.i$b */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.coaching.sleepcoach.wizard.CollapsedConductorViewModel$getModalText$1", m100430f = "CollapsedConductorViewModel.kt", m100431l = {81}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class b extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f101726w;

        public b(InterfaceC30057d<? super b> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C25832i.this.new b(interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((b) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f101726w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                InterfaceC21847a interfaceC21847a = C25832i.this.sleepCoachRepository;
                this.f101726w = 1;
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
                C25832i c25832i = C25832i.this;
                c25832i.turnOffAllModal = harvardSleepAdviceDto.getTurnOffAllModal();
                c25832i.turnOffScheduleModal = harvardSleepAdviceDto.getTurnOffScheduleModal();
                C6239a c6239aM76229C = c25832i.m76229C();
                String nextScheduleDayLabel = harvardSleepAdviceDto.getNextScheduleDayLabel();
                if (nextScheduleDayLabel == null) {
                    nextScheduleDayLabel = "";
                }
                c25832i.m76231L(C6239a.m18614b(c6239aM76229C, null, false, false, nextScheduleDayLabel, false, 23, null));
            }
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: mp0.i$c */
    /* JADX INFO: loaded from: classes7.dex */
    @Metadata(m65680d1 = {"\u0000\u001f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007*\u0001\u0000\b\n\u0018\u00002\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0004\u0012\u00028\u00000\u0001J&\u0010\u0006\u001a\u00028\u00002\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0004H\u0096\u0002¢\u0006\u0004\b\u0006\u0010\u0007J.\u0010\n\u001a\u00020\t2\b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u00042\u0006\u0010\b\u001a\u00028\u0000H\u0096\u0002¢\u0006\u0004\b\n\u0010\u000bR\"\u0010\b\u001a\u00028\u00008\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\u0006\u0010\u000e\"\u0004\b\n\u0010\u000f¨\u0006\u0010"}, m65681d2 = {"mp0/i$c", "Lf93/d;", "", "thisRef", "Lj93/z;", "property", "getValue", "(Ljava/lang/Object;Lj93/z;)Ljava/lang/Object;", "value", "Ll83/a0;", "setValue", "(Ljava/lang/Object;Lj93/z;Ljava/lang/Object;)V", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "Ljava/lang/Object;", "()Ljava/lang/Object;", "(Ljava/lang/Object;)V", "feature_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c implements InterfaceC14292d {

        /* JADX INFO: renamed from: w, reason: from kotlin metadata */
        private C6239a value;

        /* JADX INFO: renamed from: x */
        final /* synthetic */ C25832i f101729x;

        /* JADX WARN: Multi-variable type inference failed */
        public c(Object obj, C25832i c25832i) {
            this.f101729x = c25832i;
            this.value = obj;
        }

        @Override // f93.InterfaceC14291c
        public C6239a getValue(Object thisRef, InterfaceC21493z property) {
            AbstractC22676k.m65750j(property, "property");
            return this.value;
        }

        @Override // f93.InterfaceC14292d
        public void setValue(Object thisRef, InterfaceC21493z property, C6239a value) {
            AbstractC22676k.m65750j(property, "property");
            this.value = value;
            AbstractC1615p0 viewStateLiveData = this.f101729x.getViewStateLiveData();
            AbstractC22676k.m65748h(viewStateLiveData, "null cannot be cast to non-null type androidx.lifecycle.MutableLiveData<com.whoop.coaching.sleepcoach.wizard.CollapsedDataViewState>");
            ((C1630u0) viewStateLiveData).postValue(this.f101729x.m76229C());
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C25832i(C6240b conductorRepository, InterfaceC4733b whoopStrapProvider, C30327f smartAlarmRepository, C40191e eventDispatcher, InterfaceC21847a sleepCoachRepository, InterfaceC2994c0 scope) {
        super(scope);
        AbstractC22676k.m65750j(conductorRepository, "conductorRepository");
        AbstractC22676k.m65750j(whoopStrapProvider, "whoopStrapProvider");
        AbstractC22676k.m65750j(smartAlarmRepository, "smartAlarmRepository");
        AbstractC22676k.m65750j(eventDispatcher, "eventDispatcher");
        AbstractC22676k.m65750j(sleepCoachRepository, "sleepCoachRepository");
        AbstractC22676k.m65750j(scope, "scope");
        this.conductorRepository = conductorRepository;
        this.whoopStrapProvider = whoopStrapProvider;
        this.smartAlarmRepository = smartAlarmRepository;
        this.eventDispatcher = eventDispatcher;
        this.sleepCoachRepository = sleepCoachRepository;
        this.scope = scope;
        this.viewStateLiveData = new C1630u0();
        this.viewState = new c(new C6239a(null, false, false, null, false, 31, null), this);
        this.parentLiveData = conductorRepository.m18642t();
        this.alarmOptionDeepLinkLiveData = conductorRepository.m18632j();
        this.isStrapLowBattery = smartAlarmRepository.m92681m().m65138g();
        this.whoopStrap = (InterfaceC21750d) AbstractC18489d0.m53367h(whoopStrapProvider);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: C */
    public final C6239a m76229C() {
        return (C6239a) this.viewState.getValue(this, f101710O[0]);
    }

    /* JADX INFO: renamed from: K */
    private final void m76230K(C25820c c25820c) {
        new C22684o(this.conductorRepository) { // from class: mp0.i.a
            @Override // p715kotlin.jvm.internal.C22684o, j93.InterfaceC21488u
            public Object get() {
                return ((C6240b) this.receiver).m18633k();
            }

            @Override // p715kotlin.jvm.internal.C22684o, j93.InterfaceC21473j
            public void set(Object obj) {
                ((C6240b) this.receiver).m18644v((C25820c) obj);
            }
        }.set(c25820c);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX INFO: renamed from: L */
    public final void m76231L(C6239a c6239a) {
        this.viewState.setValue(this, f101710O[0], c6239a);
    }

    /* JADX INFO: renamed from: v */
    private final C25820c m76237v() {
        return this.conductorRepository.m18633k();
    }

    /* JADX INFO: renamed from: w */
    private final void m76238w() {
        AbstractC3006f0.m8732z(this.scope, null, null, new b(null), 3);
    }

    /* JADX INFO: renamed from: A, reason: from getter */
    public final SleepCoachInteractionModal getTurnOffAllModal() {
        return this.turnOffAllModal;
    }

    /* JADX INFO: renamed from: B, reason: from getter */
    public final SleepCoachInteractionModal getTurnOffScheduleModal() {
        return this.turnOffScheduleModal;
    }

    /* JADX INFO: renamed from: D, reason: from getter */
    public final AbstractC1615p0 getViewStateLiveData() {
        return this.viewStateLiveData;
    }

    /* JADX INFO: renamed from: E */
    public final void m76242E(ConductorViewState conductorViewState) {
        AbstractC22676k.m65750j(conductorViewState, "conductorViewState");
        m76231L(C6239a.m18614b(m76229C(), conductorViewState.getPreviousAlarm(), conductorViewState.isAlarmEnabledPreviously(), this.smartAlarmRepository.m92681m().m65138g(), null, m76254z(), 8, null));
    }

    /* JADX INFO: renamed from: F, reason: from getter */
    public final boolean getIsStrapLowBattery() {
        return this.isStrapLowBattery;
    }

    /* JADX INFO: renamed from: G */
    public final void m76244G() {
        m76238w();
        m76231L(C6239a.m18614b(m76229C(), this.conductorRepository.m18640r().getPreviousAlarm(), this.conductorRepository.m18640r().isAlarmEnabledPreviously(), this.smartAlarmRepository.m92681m().m65138g(), null, false, 24, null));
    }

    /* JADX INFO: renamed from: H */
    public final void m76245H(boolean checked, boolean disableSchedule) {
        ConductorViewState conductorViewStateCopy$default = ConductorViewState.copy$default(this.conductorRepository.m18640r(), null, null, checked, false, 0, false, false, null, null, disableSchedule, false, null, 3579, null);
        if (checked) {
            m76230K(m76237v().m76153a(EnumC25817b.ALARM_SET_TO_FLOW));
        } else {
            m76230K(m76237v().m76153a(EnumC25817b.SAVING_STATE_FLOW));
            conductorViewStateCopy$default = ConductorViewState.copy$default(conductorViewStateCopy$default, C27009b.m80998b(conductorViewStateCopy$default.getCurrentAlarm().m65816c(false), EnumC27008a.EXACT_TIME, null, null, false, 14, null).m81004g(), null, false, false, 0, false, false, null, null, false, false, null, 4094, null);
        }
        this.conductorRepository.m18631B(conductorViewStateCopy$default);
    }

    /* JADX INFO: renamed from: I */
    public final void m76246I() {
        C6240b c6240b = this.conductorRepository;
        c6240b.m18631B(ConductorViewState.copy$default(c6240b.m18640r(), this.conductorRepository.m18640r().getPreviousAlarm(), null, this.conductorRepository.m18640r().isAlarmEnabledPreviously(), false, 0, false, false, null, null, false, false, null, 3578, null));
    }

    /* JADX INFO: renamed from: M */
    public final void m76247M(boolean disableSleepSchedule) {
        m76230K(m76237v().m76153a(EnumC25817b.LATEST_WAKE_TIME_FLOW));
        this.eventDispatcher.m129043l0("Press", "Sleep Coach - Press Edit Wake Time", "", AbstractC25247g0.m73990Y(new C23465k("value", this.conductorRepository.m18640r().getCurrentAlarm().getLatestWakeTime()), new C23465k("source", "Card"), new C23465k("object", "Edit Wake Time")));
        C6240b c6240b = this.conductorRepository;
        c6240b.m18631B(ConductorViewState.copy$default(c6240b.m18640r(), null, null, false, false, 0, false, false, null, null, disableSleepSchedule, false, null, 3583, null));
    }

    /* JADX INFO: renamed from: p */
    public final void m76248p(String currentAlarmType) {
        EnumC32978v enumC32978vMo24752w0;
        AbstractC22676k.m65750j(currentAlarmType, "currentAlarmType");
        C23465k c23465k = new C23465k("object", "Edit Alarm Type");
        if (this.conductorRepository.m18640r().getPreviousAlarm() instanceof C22747n) {
            currentAlarmType = "Sleep Goal";
        }
        C23465k c23465k2 = new C23465k("value", currentAlarmType);
        InterfaceC21750d interfaceC21750d = this.whoopStrap;
        this.eventDispatcher.m129045m0("Sleep Coach", "Press", "Sleep Coach - Press Edit Alarm Type", AbstractC25247g0.m73990Y(c23465k, c23465k2, new C23465k("hardware", (interfaceC21750d == null || (enumC32978vMo24752w0 = interfaceC21750d.mo24752w0()) == null) ? null : EnumC32978v.INSTANCE.m104089b(enumC32978vMo24752w0))));
    }

    /* JADX INFO: renamed from: q */
    public final void m76249q() {
        EnumC32978v enumC32978vMo24752w0;
        C23465k c23465k = new C23465k("object", "Alarm Toggle");
        C23465k c23465k2 = new C23465k("value", this.conductorRepository.m18640r().isAlarmEnabledPreviously() ? "on" : "off");
        InterfaceC21750d interfaceC21750d = this.whoopStrap;
        this.eventDispatcher.m129045m0("Sleep Coach", "Press", "Sleep Coach - Press Alarm Toggle", AbstractC25247g0.m73990Y(c23465k, c23465k2, new C23465k("hardware", (interfaceC21750d == null || (enumC32978vMo24752w0 = interfaceC21750d.mo24752w0()) == null) ? null : EnumC32978v.INSTANCE.m104089b(enumC32978vMo24752w0))));
    }

    /* JADX INFO: renamed from: r */
    public final void m76250r() {
        this.conductorRepository.m18646x(new C6241c(this.smartAlarmRepository.m92681m().m65138g() && this.conductorRepository.m18640r().isAlarmEnabledPreviously(), this.conductorRepository.m18640r().getCurrentAlarm().getLatestWakeTime(), false, null, 12, null));
        m76244G();
    }

    /* JADX INFO: renamed from: t */
    public final void m76251t(boolean isInToggleMode, EnumC25842n popUpClickEvent) {
        AbstractC22676k.m65750j(popUpClickEvent, "popUpClickEvent");
        C6240b c6240b = this.conductorRepository;
        c6240b.m18646x(new C6241c(false, c6240b.m18640r().getCurrentAlarm().getLatestWakeTime(), isInToggleMode, popUpClickEvent));
    }

    /* JADX INFO: renamed from: u, reason: from getter */
    public final AbstractC1615p0 getAlarmOptionDeepLinkLiveData() {
        return this.alarmOptionDeepLinkLiveData;
    }

    /* JADX INFO: renamed from: y, reason: from getter */
    public final AbstractC1615p0 getParentLiveData() {
        return this.parentLiveData;
    }

    /* JADX INFO: renamed from: z */
    public final boolean m76254z() {
        return this.conductorRepository.m18640r().getScheduleEnabled();
    }

    public /* synthetic */ C25832i(C6240b c6240b, InterfaceC4733b interfaceC4733b, C30327f c30327f, C40191e c40191e, InterfaceC21847a interfaceC21847a, InterfaceC2994c0 interfaceC2994c0, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(c6240b, interfaceC4733b, c30327f, c40191e, interfaceC21847a, (i13 & 32) != 0 ? new C28180m(null, 1, null) : interfaceC2994c0);
    }
}
