package mp0;

import androidx.lifecycle.AbstractC1615p0;
import androidx.lifecycle.AbstractC1640x1;
import androidx.lifecycle.C1630u0;
import bc3.AbstractC3006f0;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4351m;
import com.whoop.coaching.sleepcoach.wizard.C6240b;
import com.whoop.data.remote.commons.Resource;
import com.whoop.data.remote.commons.Status;
import com.whoop.data.remote.domain.dto.sleepcoach.SleepCoachOnBoardingRequestDto;
import com.whoop.data.remote.domain.dto.sleepcoach.SleepCoachOnBoardingResponseDto;
import hj0.AbstractC17356o;
import l83.C23454a0;
import l83.C23465k;
import m83.AbstractC25247g0;
import np0.C27014g;
import np0.C27015h;
import np0.EnumC27013f;
import np0.EnumC27018k;
import op0.C28086d;
import or2.C28180m;
import p031b9.AbstractC2875y;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.InterfaceC30057d;
import r83.EnumC31071a;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import z82.C40191e;

/* JADX INFO: renamed from: mp0.f */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u0000 ;2\u00020\u0001:\u0001<B1\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b\f\u0010\rJ\u0017\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J1\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u00122\u0006\u0010\u0015\u001a\u00020\u00122\b\b\u0002\u0010\u0016\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\r\u0010\u001a\u001a\u00020\u0017¢\u0006\u0004\b\u001a\u0010\u001bJ\u0017\u0010\u001e\u001a\u00020\u00172\b\b\u0002\u0010\u001d\u001a\u00020\u001c¢\u0006\u0004\b\u001e\u0010\u001fJ\r\u0010 \u001a\u00020\u0017¢\u0006\u0004\b \u0010\u001bJ\r\u0010!\u001a\u00020\u0017¢\u0006\u0004\b!\u0010\u001bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010#R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u001a\u0010+\u001a\u00020\u00128\u0016X\u0096D¢\u0006\f\n\u0004\b\u0010\u0010(\u001a\u0004\b)\u0010*R\u001d\u00102\u001a\b\u0012\u0004\u0012\u00020-0,8\u0006¢\u0006\f\n\u0004\b.\u0010/\u001a\u0004\b0\u00101R(\u0010:\u001a\u0002038\u0006@\u0006X\u0087\u000e¢\u0006\u0018\n\u0004\b4\u00105\u0012\u0004\b9\u0010\u001b\u001a\u0004\b6\u00107\"\u0004\b&\u00108¨\u0006="}, m65681d2 = {"Lmp0/f;", "Lhj0/o;", "Lop0/d;", "sleepCoachOnBoardingRepository", "Lcom/whoop/coaching/sleepcoach/wizard/b;", "conductorRepository", "Lnp0/h;", "howToTurnOffAlarmViewStateReducer", "Lz82/e;", "eventDispatcher", "Lbc3/c0;", "coroutineScope", "<init>", "(Lop0/d;Lcom/whoop/coaching/sleepcoach/wizard/b;Lnp0/h;Lz82/e;Lbc3/c0;)V", "", "isAlarmEnabled", "I", "(Z)Z", "", "action", "eventName", "label", "source", "Ll83/a0;", "F", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "C", "()V", "Lmp0/j;", "closeAction", "z", "(Lmp0/j;)V", "D", "E", "Lop0/d;", "Lcom/whoop/coaching/sleepcoach/wizard/b;", "G", "Lnp0/h;", "H", "Lz82/e;", "Ljava/lang/String;", "o", "()Ljava/lang/String;", "logTag", "Landroidx/lifecycle/p0;", "Lmp0/k;", "J", "Landroidx/lifecycle/p0;", "B", "()Landroidx/lifecycle/p0;", "howToTurnOffAlarmTutorialLiveData", "Lnp0/g;", "K", "Lnp0/g;", "getSleepCoachOnBoardingState", "()Lnp0/g;", "(Lnp0/g;)V", "getSleepCoachOnBoardingState$annotations", "sleepCoachOnBoardingState", "L", "a", "sleep-coach_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C25826f extends AbstractC17356o {

    /* JADX INFO: renamed from: M */
    public static final int f101637M = 8;

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    private final C28086d sleepCoachOnBoardingRepository;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    private final C6240b conductorRepository;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    private final C27015h howToTurnOffAlarmViewStateReducer;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    private final C40191e eventDispatcher;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    private final String logTag;

    /* JADX INFO: renamed from: J, reason: from kotlin metadata */
    private final AbstractC1615p0 howToTurnOffAlarmTutorialLiveData;

    /* JADX INFO: renamed from: K, reason: from kotlin metadata */
    private C27014g sleepCoachOnBoardingState;

    /* JADX INFO: renamed from: mp0.f$b */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.coaching.sleepcoach.wizard.AlarmTurnOffTutorialViewModel$dismissDialog$1", m100430f = "AlarmTurnOffTutorialViewModel.kt", m100431l = {56}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class b extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f101645w;

        public b(InterfaceC30057d<? super b> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C25826f.this.new b(interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((b) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f101645w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                C28086d c28086d = C25826f.this.sleepCoachOnBoardingRepository;
                SleepCoachOnBoardingRequestDto sleepCoachOnBoardingRequestDto = new SleepCoachOnBoardingRequestDto("TURN_OFF_ALARM", "COMPLETE");
                this.f101645w = 1;
                if (c28086d.m84858j(sleepCoachOnBoardingRequestDto, this) == enumC31071a) {
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

    /* JADX INFO: renamed from: mp0.f$c */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.coaching.sleepcoach.wizard.AlarmTurnOffTutorialViewModel$loadOnBoardingState$1", m100430f = "AlarmTurnOffTutorialViewModel.kt", m100431l = {72}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class c extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: w */
        int f101647w;

        public c(InterfaceC30057d<? super c> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C25826f.this.new c(interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((c) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f101647w;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                C28086d c28086d = C25826f.this.sleepCoachOnBoardingRepository;
                this.f101647w = 1;
                obj = c28086d.m84857h(this);
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
            if (resource.getStatus() == Status.SUCCESS) {
                C25826f c25826f = C25826f.this;
                C27015h c27015h = c25826f.howToTurnOffAlarmViewStateReducer;
                SleepCoachOnBoardingResponseDto sleepCoachOnBoardingResponseDto = (SleepCoachOnBoardingResponseDto) resource.getData();
                c25826f.m76172H(c27015h.m81007a(sleepCoachOnBoardingResponseDto != null ? sleepCoachOnBoardingResponseDto.getAlarmOffOnBoardingState() : null, EnumC27018k.ALARM_OFF_ONBOARDING_STATE));
            }
            return C23454a0.f92919a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C25826f(C28086d sleepCoachOnBoardingRepository, C6240b conductorRepository, C27015h howToTurnOffAlarmViewStateReducer, C40191e eventDispatcher, InterfaceC2994c0 coroutineScope) {
        super(coroutineScope);
        AbstractC22676k.m65750j(sleepCoachOnBoardingRepository, "sleepCoachOnBoardingRepository");
        AbstractC22676k.m65750j(conductorRepository, "conductorRepository");
        AbstractC22676k.m65750j(howToTurnOffAlarmViewStateReducer, "howToTurnOffAlarmViewStateReducer");
        AbstractC22676k.m65750j(eventDispatcher, "eventDispatcher");
        AbstractC22676k.m65750j(coroutineScope, "coroutineScope");
        this.sleepCoachOnBoardingRepository = sleepCoachOnBoardingRepository;
        this.conductorRepository = conductorRepository;
        this.howToTurnOffAlarmViewStateReducer = howToTurnOffAlarmViewStateReducer;
        this.eventDispatcher = eventDispatcher;
        this.logTag = "AlarmTurnOffTutorialViewModel";
        this.howToTurnOffAlarmTutorialLiveData = new C1630u0(EnumC25836k.NONE);
        this.sleepCoachOnBoardingState = new C27014g(EnumC27013f.COMPLETE);
    }

    /* JADX INFO: renamed from: A */
    public static /* synthetic */ void m76162A(C25826f c25826f, EnumC25834j enumC25834j, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            enumC25834j = EnumC25834j.CLOSE;
        }
        c25826f.m76173z(enumC25834j);
    }

    /* JADX INFO: renamed from: F */
    private final void m76163F(String action, String eventName, String label, String source) {
        this.eventDispatcher.m129043l0(action, AbstractC2875y.m8299l(eventName, " Turn Off Alarm"), label, AbstractC25247g0.m73990Y(new C23465k("object", "Turn Off Alarm"), new C23465k("source", source)));
    }

    /* JADX INFO: renamed from: G */
    public static /* synthetic */ void m76164G(C25826f c25826f, String str, String str2, String str3, String str4, int i13, Object obj) {
        if ((i13 & 8) != 0) {
            str4 = "";
        }
        c25826f.m76163F(str, str2, str3, str4);
    }

    /* JADX INFO: renamed from: I */
    private final boolean m76165I(boolean isAlarmEnabled) {
        return isAlarmEnabled && this.sleepCoachOnBoardingState.getSleepCoachOnBoardingState() == EnumC27013f.INCOMPLETE;
    }

    /* JADX INFO: renamed from: B, reason: from getter */
    public final AbstractC1615p0 getHowToTurnOffAlarmTutorialLiveData() {
        return this.howToTurnOffAlarmTutorialLiveData;
    }

    /* JADX INFO: renamed from: C */
    public final void m76169C() {
        if (!m76165I(this.conductorRepository.m18640r().getCurrentSelectedAlarm())) {
            m49138t(this.howToTurnOffAlarmTutorialLiveData, EnumC25836k.DISMISS);
        } else {
            m49138t(this.howToTurnOffAlarmTutorialLiveData, EnumC25836k.SHOW);
            m76164G(this, "View", "Sleep Coach - View", "", null, 8, null);
        }
    }

    /* JADX INFO: renamed from: D */
    public final void m76170D() {
        AbstractC3006f0.m8732z(AbstractC1640x1.m5043b(this), null, null, new c(null), 3);
    }

    /* JADX INFO: renamed from: E */
    public final void m76171E() {
        m49138t(this.howToTurnOffAlarmTutorialLiveData, EnumC25836k.NONE);
    }

    /* JADX INFO: renamed from: H */
    public final void m76172H(C27014g c27014g) {
        AbstractC22676k.m65750j(c27014g, "<set-?>");
        this.sleepCoachOnBoardingState = c27014g;
    }

    @Override // hj0.AbstractC17356o
    /* JADX INFO: renamed from: o, reason: from getter */
    public String getLogTag() {
        return this.logTag;
    }

    /* JADX INFO: renamed from: z */
    public final void m76173z(EnumC25834j closeAction) {
        C25826f c25826f;
        AbstractC22676k.m65750j(closeAction, "closeAction");
        if (closeAction == EnumC25834j.GOT_IT_DISMISS) {
            AbstractC3006f0.m8732z(AbstractC1640x1.m5043b(this), null, null, new b(null), 3);
            c25826f = this;
            m76164G(c25826f, "Press", "Sleep Coach - Press", closeAction.getEventAction(), null, 8, null);
        } else {
            c25826f = this;
            m76163F("Close", "Sleep Coach - Close", "", closeAction.getEventAction());
        }
        m49138t(c25826f.howToTurnOffAlarmTutorialLiveData, EnumC25836k.DISMISS);
    }

    public /* synthetic */ C25826f(C28086d c28086d, C6240b c6240b, C27015h c27015h, C40191e c40191e, InterfaceC2994c0 interfaceC2994c0, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(c28086d, c6240b, c27015h, c40191e, (i13 & 16) != 0 ? new C28180m(null, 1, null) : interfaceC2994c0);
    }
}
