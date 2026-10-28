package mp0;

import androidx.core.app.NotificationCompat;
import androidx.lifecycle.AbstractC1615p0;
import androidx.lifecycle.AbstractC1640x1;
import androidx.lifecycle.C1630u0;
import bc3.AbstractC3006f0;
import bc3.AbstractC3034m0;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4351m;
import com.mapbox.common.logger.LogPriority;
import com.whoop.coaching.sleepcoach.wizard.C6240b;
import com.whoop.coaching.sleepcoach.wizard.C6241c;
import com.whoop.coaching.sleepcoach.wizard.ConductorViewState;
import com.whoop.data.local.room.entity.SmartAlarmUserInfo;
import com.whoop.data.remote.domain.dto.SmartAlarmGoalType;
import com.whoop.design.util.TextResource;
import com.whoop.smart.alarm.data.util.SmartAlarmException;
import hj0.AbstractC17356o;
import java.io.IOException;
import java.util.List;
import java.util.Locale;
import kp0.AbstractC22734a;
import kp0.AbstractC22735b;
import kp0.C22736c;
import kp0.C22739f;
import kp0.C22747n;
import l83.C23454a0;
import l83.C23465k;
import live.hms.video.factories.MediaConstraintsFactory;
import m83.AbstractC25247g0;
import np0.AbstractC27010c;
import np0.EnumC27008a;
import or2.C28180m;
import or2.C28205u0;
import or2.InterfaceC28172j0;
import org.joda.time.DateTime;
import org.joda.time.Instant;
import org.joda.time.LocalTime;
import p000.AbstractC11266d;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import q83.InterfaceC30057d;
import qe2.AbstractC30314g;
import qf2.C30327f;
import qr2.AbstractC30556a;
import r80.AbstractC31061c;
import r83.EnumC31071a;
import rr2.InterfaceC31766c;
import s83.AbstractC32269c;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import tf2.AbstractC33767a;
import wb3.AbstractC37056f;
import yb3.AbstractC39415s;
import z82.C40191e;

/* JADX INFO: renamed from: mp0.s */
/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000²\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001BA\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011J\u0015\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u0012¢\u0006\u0004\b\u0015\u0010\u0016J\r\u0010\u0017\u001a\u00020\u0014¢\u0006\u0004\b\u0017\u0010\u0018J\r\u0010\u0019\u001a\u00020\u0014¢\u0006\u0004\b\u0019\u0010\u0018J\u0015\u0010\u001c\u001a\u00020\u00142\u0006\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u001c\u0010\u001dJ\u0015\u0010 \u001a\u00020\u00142\u0006\u0010\u001f\u001a\u00020\u001e¢\u0006\u0004\b \u0010!J\u0017\u0010\"\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\"\u0010\u0016J8\u0010(\u001a\u00020\u00142\u0006\u0010#\u001a\u00020\u00122\u0006\u0010%\u001a\u00020$2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010&\u001a\u00020\u00122\u0006\u0010'\u001a\u00020\u0012H\u0082@¢\u0006\u0004\b(\u0010)J5\u0010/\u001a\u00020\u00142\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010+\u001a\u00020*2\b\b\u0002\u0010,\u001a\u00020\u00122\n\b\u0002\u0010.\u001a\u0004\u0018\u00010-H\u0002¢\u0006\u0004\b/\u00100J\u0017\u00102\u001a\u00020*2\u0006\u00101\u001a\u00020\u0012H\u0002¢\u0006\u0004\b2\u00103J \u00105\u001a\u00020\u00142\u0006\u00104\u001a\u00020-2\u0006\u00101\u001a\u00020\u0012H\u0082@¢\u0006\u0004\b5\u00106J1\u0010<\u001a\u00020\u00142\u0006\u00107\u001a\u00020*2\u0006\u00108\u001a\u00020*2\u0010\b\u0002\u0010;\u001a\n\u0018\u000109j\u0004\u0018\u0001`:H\u0002¢\u0006\u0004\b<\u0010=J#\u0010>\u001a\u00020\u00142\n\u0010;\u001a\u000609j\u0002`:2\u0006\u0010#\u001a\u00020\u0012H\u0002¢\u0006\u0004\b>\u0010?J \u0010B\u001a\u00020\u00122\u0006\u0010#\u001a\u00020\u00122\u0006\u0010A\u001a\u00020@H\u0082@¢\u0006\u0004\bB\u0010CJ2\u0010E\u001a\u00020\u00122\u0006\u0010#\u001a\u00020\u00122\u0006\u0010D\u001a\u00020$2\b\b\u0002\u0010&\u001a\u00020\u00122\u0006\u0010'\u001a\u00020\u0012H\u0082@¢\u0006\u0004\bE\u0010FJ,\u0010I\u001a\u00020\u00142\u0006\u0010G\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00122\n\b\u0002\u0010H\u001a\u0004\u0018\u00010-H\u0082@¢\u0006\u0004\bI\u0010JJ\u000f\u0010K\u001a\u00020\u0014H\u0002¢\u0006\u0004\bK\u0010\u0018J-\u0010Q\u001a\u00020\u00142\u0006\u0010M\u001a\u00020L2\u0014\u0010P\u001a\u0010\u0012\u0004\u0012\u00020O\u0012\u0004\u0012\u00020O\u0018\u00010NH\u0002¢\u0006\u0004\bQ\u0010RJ+\u0010U\u001a\u000e\u0012\u0004\u0012\u00020O\u0012\u0004\u0012\u00020O0N2\u0006\u0010S\u001a\u00020\u00122\u0006\u0010T\u001a\u00020\u0012H\u0002¢\u0006\u0004\bU\u0010VJ#\u0010Y\u001a\u000e\u0012\u0004\u0012\u00020O\u0012\u0004\u0012\u00020O0N2\u0006\u0010X\u001a\u00020WH\u0002¢\u0006\u0004\bY\u0010ZJ\u0017\u0010\\\u001a\u00020*2\u0006\u0010[\u001a\u00020WH\u0002¢\u0006\u0004\b\\\u0010]R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b^\u0010_R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b`\u0010aR\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bb\u0010cR\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bU\u0010dR\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\be\u0010fR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bg\u0010hR\u001a\u0010m\u001a\u00020*8\u0016X\u0096D¢\u0006\f\n\u0004\bi\u0010j\u001a\u0004\bk\u0010lR\u001d\u0010r\u001a\b\u0012\u0004\u0012\u00020o0n8\u0006¢\u0006\f\n\u0004\bY\u0010p\u001a\u0004\b`\u0010qR\u001d\u0010t\u001a\b\u0012\u0004\u0012\u00020s0n8\u0006¢\u0006\f\n\u0004\b\\\u0010p\u001a\u0004\be\u0010qR\u001d\u0010v\u001a\b\u0012\u0004\u0012\u00020u0n8\u0006¢\u0006\f\n\u0004\bQ\u0010p\u001a\u0004\b^\u0010qR\u001d\u0010w\u001a\b\u0012\u0004\u0012\u00020\u00120n8\u0006¢\u0006\f\n\u0004\bK\u0010p\u001a\u0004\bi\u0010qR\u0018\u0010x\u001a\u00020**\u00020\u00128BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bb\u00103¨\u0006y"}, m65681d2 = {"Lmp0/s;", "Lhj0/o;", "Lcom/whoop/coaching/sleepcoach/wizard/b;", "conductorRepository", "Lqf2/f;", "smartAlarmRepository", "Lrr2/c;", "crashReporter", "Lz82/e;", "eventDispatcher", "Lor2/u0;", "localizedDateTimeFormatter", "Lor2/j0;", "idleIndicator", "Lbc3/c0;", "coroutineScope", "<init>", "(Lcom/whoop/coaching/sleepcoach/wizard/b;Lqf2/f;Lrr2/c;Lz82/e;Lor2/u0;Lor2/j0;Lbc3/c0;)V", "", "fromPush", "Ll83/a0;", "R", "(Z)V", "Z", "()V", "D", "Lmp0/d0;", "viewEvent", "W", "(Lmp0/d0;)V", "Lmp0/c0;", "pressObject", "V", "(Lmp0/c0;)V", "b0", "enabling", "Lorg/joda/time/DateTime;", "alarmTime", "scheduleEnabled", "disableSchedule", "c0", "(ZLorg/joda/time/DateTime;ZZZLq83/d;)Ljava/lang/Object;", "", "error", "lowBattery", "Lcom/whoop/data/local/room/entity/SmartAlarmUserInfo;", "previousAlarmSettingsFromDb", "X", "(ZLjava/lang/String;ZLcom/whoop/data/local/room/entity/SmartAlarmUserInfo;)V", "attemptedToEnable", "C", "(Z)Ljava/lang/String;", "userInfoRecord", "P", "(Lcom/whoop/data/local/room/entity/SmartAlarmUserInfo;ZLq83/d;)Ljava/lang/Object;", "originalAlarmSettingsLogString", "failedAlarmSettingsLogString", "Ljava/lang/Exception;", "Lkotlin/Exception;", "e", "S", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Exception;)V", "Q", "(Ljava/lang/Exception;Z)V", "Lorg/joda/time/Instant;", "alarmInstant", "e0", "(ZLorg/joda/time/Instant;Lq83/d;)Ljava/lang/Object;", "time", "d0", "(ZLorg/joda/time/DateTime;ZZLq83/d;)Ljava/lang/Object;", "serverSuccess", "previousAlarmSettings", "f0", "(ZZLcom/whoop/data/local/room/entity/SmartAlarmUserInfo;Lq83/d;)Ljava/lang/Object;", "O", "Lmp0/m;", "loadingStates", "Ll83/k;", "Lcom/whoop/design/util/TextResource;", "pairOfTitleAndDescription", "N", "(Lmp0/m;Ll83/k;)V", "currentSelectedAlarm", "isSleepGoalShortCutFlow", "H", "(ZZ)Ll83/k;", "Lcom/whoop/coaching/sleepcoach/wizard/ConductorViewState;", "currentViewState", "L", "(Lcom/whoop/coaching/sleepcoach/wizard/ConductorViewState;)Ll83/k;", "viewState", "M", "(Lcom/whoop/coaching/sleepcoach/wizard/ConductorViewState;)Ljava/lang/String;", "E", "Lcom/whoop/coaching/sleepcoach/wizard/b;", "F", "Lqf2/f;", "G", "Lrr2/c;", "Lz82/e;", "I", "Lor2/u0;", "J", "Lor2/j0;", "K", "Ljava/lang/String;", "o", "()Ljava/lang/String;", "logTag", "Landroidx/lifecycle/p0;", "Lmp0/c;", "Landroidx/lifecycle/p0;", "()Landroidx/lifecycle/p0;", "alarmOptionFlowLiveData", "Lmp0/p;", "onBackPressHandlerLiveData", "Lmp0/a;", "alarmLoadingViewStateLiveData", "onSuccessCompleteLiveData", "alarmState", "sleep-coach_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C25852s extends AbstractC17356o {

    /* JADX INFO: renamed from: E, reason: from kotlin metadata */
    private final C6240b conductorRepository;

    /* JADX INFO: renamed from: F, reason: from kotlin metadata */
    private final C30327f smartAlarmRepository;

    /* JADX INFO: renamed from: G, reason: from kotlin metadata */
    private final InterfaceC31766c crashReporter;

    /* JADX INFO: renamed from: H, reason: from kotlin metadata */
    private final C40191e eventDispatcher;

    /* JADX INFO: renamed from: I, reason: from kotlin metadata */
    private final C28205u0 localizedDateTimeFormatter;

    /* JADX INFO: renamed from: J, reason: from kotlin metadata */
    private final InterfaceC28172j0 idleIndicator;

    /* JADX INFO: renamed from: K, reason: from kotlin metadata */
    private final String logTag;

    /* JADX INFO: renamed from: L, reason: from kotlin metadata */
    private final AbstractC1615p0 alarmOptionFlowLiveData;

    /* JADX INFO: renamed from: M, reason: from kotlin metadata */
    private final AbstractC1615p0 onBackPressHandlerLiveData;

    /* JADX INFO: renamed from: N, reason: from kotlin metadata */
    private final AbstractC1615p0 alarmLoadingViewStateLiveData;

    /* JADX INFO: renamed from: O, reason: from kotlin metadata */
    private final AbstractC1615p0 onSuccessCompleteLiveData;

    /* JADX INFO: renamed from: mp0.s$a */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.coaching.sleepcoach.wizard.SleepCoachAlarmLoadingStateViewModel", m100430f = "SleepCoachAlarmLoadingStateViewModel.kt", m100431l = {186}, m100432m = "handleStrapAndServerAlarmMismatchError", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class a extends AbstractC32269c {

        /* JADX INFO: renamed from: E */
        boolean f101863E;

        /* JADX INFO: renamed from: F */
        /* synthetic */ Object f101864F;

        /* JADX INFO: renamed from: H */
        int f101866H;

        /* JADX INFO: renamed from: w */
        Object f101867w;

        /* JADX INFO: renamed from: x */
        Object f101868x;

        /* JADX INFO: renamed from: y */
        Object f101869y;

        /* JADX INFO: renamed from: z */
        boolean f101870z;

        public a(InterfaceC30057d<? super a> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f101864F = obj;
            this.f101866H |= Integer.MIN_VALUE;
            return C25852s.this.m76337P(null, false, this);
        }
    }

    /* JADX INFO: renamed from: mp0.s$b */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.coaching.sleepcoach.wizard.SleepCoachAlarmLoadingStateViewModel$startLoadingSetAlarm$1", m100430f = "SleepCoachAlarmLoadingStateViewModel.kt", m100431l = {78}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class b extends AbstractC32275i implements InterfaceC4351m {

        /* JADX INFO: renamed from: E */
        final /* synthetic */ boolean f101871E;

        /* JADX INFO: renamed from: w */
        Object f101872w;

        /* JADX INFO: renamed from: x */
        int f101873x;

        /* JADX INFO: renamed from: z */
        final /* synthetic */ boolean f101875z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(boolean z4, boolean z13, InterfaceC30057d<? super b> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.f101875z = z4;
            this.f101871E = z13;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return C25852s.this.new b(this.f101875z, this.f101871E, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((b) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.f101873x;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                DateTime dateTimeM106770b = AbstractC33767a.m106770b(C25852s.this.conductorRepository.m18640r().getCurrentAlarm().getLatestWakeTime(), null, 2, null);
                C25852s c25852s = C25852s.this;
                boolean z4 = this.f101875z;
                boolean z13 = this.f101871E;
                boolean scheduleEnabled = c25852s.conductorRepository.m18640r().getScheduleEnabled();
                boolean disableSchedule = C25852s.this.conductorRepository.m18640r().getDisableSchedule();
                this.f101872w = null;
                this.f101873x = 1;
                if (c25852s.m76344c0(z4, dateTimeM106770b, z13, scheduleEnabled, disableSchedule, this) == enumC31071a) {
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

    /* JADX INFO: renamed from: mp0.s$c */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.coaching.sleepcoach.wizard.SleepCoachAlarmLoadingStateViewModel", m100430f = "SleepCoachAlarmLoadingStateViewModel.kt", m100431l = {89, 94, LogPriority.NONE, 105, 108, 111, 117}, m100432m = "submitAlarm", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c extends AbstractC32269c {

        /* JADX INFO: renamed from: E */
        boolean f101876E;

        /* JADX INFO: renamed from: F */
        Object f101877F;

        /* JADX INFO: renamed from: G */
        Object f101878G;

        /* JADX INFO: renamed from: H */
        Object f101879H;

        /* JADX INFO: renamed from: I */
        int f101880I;

        /* JADX INFO: renamed from: J */
        /* synthetic */ Object f101881J;

        /* JADX INFO: renamed from: L */
        int f101883L;

        /* JADX INFO: renamed from: w */
        boolean f101884w;

        /* JADX INFO: renamed from: x */
        boolean f101885x;

        /* JADX INFO: renamed from: y */
        boolean f101886y;

        /* JADX INFO: renamed from: z */
        boolean f101887z;

        public c(InterfaceC30057d<? super c> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f101881J = obj;
            this.f101883L |= Integer.MIN_VALUE;
            return C25852s.this.m76344c0(false, null, false, false, false, this);
        }
    }

    /* JADX INFO: renamed from: mp0.s$d */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.coaching.sleepcoach.wizard.SleepCoachAlarmLoadingStateViewModel", m100430f = "SleepCoachAlarmLoadingStateViewModel.kt", m100431l = {227}, m100432m = "updateAlarmOnServer", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class d extends AbstractC32269c {

        /* JADX INFO: renamed from: E */
        /* synthetic */ Object f101888E;

        /* JADX INFO: renamed from: G */
        int f101890G;

        /* JADX INFO: renamed from: w */
        boolean f101891w;

        /* JADX INFO: renamed from: x */
        boolean f101892x;

        /* JADX INFO: renamed from: y */
        boolean f101893y;

        /* JADX INFO: renamed from: z */
        Object f101894z;

        public d(InterfaceC30057d<? super d> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f101888E = obj;
            this.f101890G |= Integer.MIN_VALUE;
            return C25852s.this.m76345d0(false, null, false, false, this);
        }
    }

    /* JADX INFO: renamed from: mp0.s$e */
    /* JADX INFO: loaded from: classes7.dex */
    @InterfaceC32271e(m100429c = "com.whoop.coaching.sleepcoach.wizard.SleepCoachAlarmLoadingStateViewModel", m100430f = "SleepCoachAlarmLoadingStateViewModel.kt", m100431l = {242}, m100432m = "updateUiAfterAlarmChange", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class e extends AbstractC32269c {

        /* JADX INFO: renamed from: F */
        int f101896F;

        /* JADX INFO: renamed from: w */
        boolean f101897w;

        /* JADX INFO: renamed from: x */
        boolean f101898x;

        /* JADX INFO: renamed from: y */
        Object f101899y;

        /* JADX INFO: renamed from: z */
        /* synthetic */ Object f101900z;

        public e(InterfaceC30057d<? super e> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f101900z = obj;
            this.f101896F |= Integer.MIN_VALUE;
            return C25852s.this.m76347f0(false, false, null, this);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C25852s(C6240b conductorRepository, C30327f smartAlarmRepository, InterfaceC31766c crashReporter, C40191e eventDispatcher, C28205u0 localizedDateTimeFormatter, InterfaceC28172j0 idleIndicator, InterfaceC2994c0 coroutineScope) {
        super(coroutineScope);
        AbstractC22676k.m65750j(conductorRepository, "conductorRepository");
        AbstractC22676k.m65750j(smartAlarmRepository, "smartAlarmRepository");
        AbstractC22676k.m65750j(crashReporter, "crashReporter");
        AbstractC22676k.m65750j(eventDispatcher, "eventDispatcher");
        AbstractC22676k.m65750j(localizedDateTimeFormatter, "localizedDateTimeFormatter");
        AbstractC22676k.m65750j(idleIndicator, "idleIndicator");
        AbstractC22676k.m65750j(coroutineScope, "coroutineScope");
        this.conductorRepository = conductorRepository;
        this.smartAlarmRepository = smartAlarmRepository;
        this.crashReporter = crashReporter;
        this.eventDispatcher = eventDispatcher;
        this.localizedDateTimeFormatter = localizedDateTimeFormatter;
        this.idleIndicator = idleIndicator;
        this.logTag = "SleepCoachAlarmLoadingStateViewModel";
        this.alarmOptionFlowLiveData = conductorRepository.m18632j();
        this.onBackPressHandlerLiveData = conductorRepository.m18636n();
        this.alarmLoadingViewStateLiveData = new C1630u0();
        this.onSuccessCompleteLiveData = new C1630u0(Boolean.FALSE);
    }

    /* JADX INFO: renamed from: C */
    private final String m76330C(boolean attemptedToEnable) {
        return (attemptedToEnable ? "enabled" : "disabled") + " " + this.conductorRepository.m18640r().getCurrentAlarm();
    }

    /* JADX INFO: renamed from: G */
    private final String m76331G(boolean z4) {
        return z4 ? "enabling" : "disabling";
    }

    /* JADX INFO: renamed from: H */
    private final C23465k m76332H(boolean currentSelectedAlarm, boolean isSleepGoalShortCutFlow) {
        if (currentSelectedAlarm) {
            return new C23465k(new TextResource.C8688b(AbstractC30314g.f124335o, null, 2, null), new TextResource.C8688b(AbstractC30314g.f124338p, null, 2, null));
        }
        return !isSleepGoalShortCutFlow ? new C23465k(new TextResource.C8688b(AbstractC30314g.f124326l, null, 2, null), new TextResource.C8688b(AbstractC30314g.f124329m, null, 2, null)) : new C23465k(new TextResource.C8688b(AbstractC30314g.f124335o, null, 2, null), new TextResource.C8688b(AbstractC30314g.f124323k, null, 2, null));
    }

    /* JADX INFO: renamed from: L */
    private final C23465k m76333L(ConductorViewState currentViewState) {
        if (!currentViewState.getCurrentSelectedAlarm()) {
            return !currentViewState.isSkipStrapCheck() ? new C23465k(new TextResource.C8688b(AbstractC30314g.f124247F, null, 2, null), new TextResource.C8691e("")) : new C23465k(new TextResource.C8688b(AbstractC30314g.f124332n, null, 2, null), new TextResource.C8688b(AbstractC30314g.f124322j1, null, 2, null));
        }
        AbstractC22734a currentAlarm = currentViewState.getCurrentAlarm();
        if (currentAlarm instanceof C22736c) {
            return new C23465k(new TextResource.C8688b(AbstractC30314g.f124332n, null, 2, null), new TextResource.C8688b(AbstractC30314g.f124316h1, new TextResource.AbstractC8690d.a(C28205u0.m85379j(this.localizedDateTimeFormatter, ((C22736c) currentViewState.getCurrentAlarm()).getLatestWakeTime(), false, 2, null))));
        }
        if ((currentAlarm instanceof C22739f) || (currentAlarm instanceof C22747n)) {
            return new C23465k(new TextResource.C8688b(AbstractC30314g.f124332n, null, 2, null), new TextResource.C8688b(AbstractC30314g.f124319i1, (List<? extends TextResource.AbstractC8690d>) AbstractC37056f.m118959K(new TextResource.AbstractC8690d.a(m76334M(currentViewState)), new TextResource.AbstractC8690d.a(C28205u0.m85379j(this.localizedDateTimeFormatter, currentViewState.getCurrentAlarm().getLatestWakeTime(), false, 2, null)))));
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: renamed from: M */
    private final String m76334M(ConductorViewState viewState) {
        LocalTime latestWakeTime = viewState.getCurrentAlarm().getLatestWakeTime();
        C28205u0 c28205u0 = this.localizedDateTimeFormatter;
        LocalTime localTimeMinusMinutes = latestWakeTime.minusMinutes(viewState.getWakeWindowMinutes());
        AbstractC22676k.m65749i(localTimeMinusMinutes, "minusMinutes(...)");
        return C28205u0.m85379j(c28205u0, localTimeMinusMinutes, false, 2, null);
    }

    /* JADX INFO: renamed from: N */
    private final void m76335N(EnumC25840m loadingStates, C23465k pairOfTitleAndDescription) {
        m49140v(this.alarmLoadingViewStateLiveData, new C25814a(this.conductorRepository.m18640r().getCurrentSelectedAlarm(), loadingStates, pairOfTitleAndDescription));
    }

    /* JADX INFO: renamed from: O */
    private final void m76336O() {
        if (this.smartAlarmRepository.m92681m().m65138g()) {
            C6240b c6240b = this.conductorRepository;
            c6240b.m18646x(C6241c.m18651b(c6240b.m18635m(), this.conductorRepository.m18640r().getCurrentSelectedAlarm() && !this.conductorRepository.m18640r().isAlarmEnabledPreviously(), this.conductorRepository.m18640r().getCurrentAlarm().getLatestWakeTime(), false, null, 8, null));
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: P */
    public final Object m76337P(SmartAlarmUserInfo smartAlarmUserInfo, boolean z4, InterfaceC30057d<? super C23454a0> interfaceC30057d) throws IOException {
        a aVar;
        DateTime dateTimeM106770b;
        String str;
        boolean z13;
        if (interfaceC30057d instanceof a) {
            aVar = (a) interfaceC30057d;
            int i13 = aVar.f101866H;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                aVar.f101866H = i13 - Integer.MIN_VALUE;
            } else {
                aVar = new a(interfaceC30057d);
            }
        } else {
            aVar = new a(interfaceC30057d);
        }
        Object obj = aVar.f101864F;
        Object obj2 = EnumC31071a.f128113w;
        int i14 = aVar.f101866H;
        if (i14 == 0) {
            AbstractC34132o.m107864I(obj);
            dateTimeM106770b = AbstractC33767a.m106770b(smartAlarmUserInfo.getUpperBoundLocalTime(), null, 2, null);
            boolean smartAlarmEnabled = smartAlarmUserInfo.getSmartAlarmEnabled();
            String goalType = smartAlarmUserInfo.getGoal().getGoalType();
            Instant instant = dateTimeM106770b.toInstant();
            AbstractC22676k.m65749i(instant, "toInstant(...)");
            aVar.f101867w = null;
            aVar.f101868x = dateTimeM106770b;
            aVar.f101869y = goalType;
            aVar.f101870z = z4;
            aVar.f101863E = smartAlarmEnabled;
            aVar.f101866H = 1;
            Object objM76346e0 = m76346e0(smartAlarmEnabled, instant, aVar);
            if (objM76346e0 == obj2) {
                return obj2;
            }
            str = goalType;
            z13 = smartAlarmEnabled;
            obj = objM76346e0;
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            z13 = aVar.f101863E;
            z4 = aVar.f101870z;
            str = (String) aVar.f101869y;
            dateTimeM106770b = (DateTime) aVar.f101868x;
            AbstractC34132o.m107864I(obj);
        }
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        String str2 = (z13 ? "enabled" : "disabled") + " " + str + " with lwt=" + dateTimeM106770b;
        String strM76330C = m76330C(z4);
        if (zBooleanValue) {
            m49136n().mo85228t("After server alarm update failure, reverted strap back to original alarm settings", new AbstractC30556a.a[0]);
            m49136n().mo85228t(AbstractC11266d.m30461o("original alarm settings (and current strap alarm settings): ", str2), new AbstractC30556a.a[0]);
            m49136n().mo85228t(AbstractC11266d.m30461o("failed alarm settings update that was reverted: ", strM76330C), new AbstractC30556a.a[0]);
        } else {
            m76340U(this, str2, strM76330C, null, 4, null);
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: Q */
    private final void m76338Q(Exception e5, boolean enabling) throws IOException {
        m76339S("unknown", m76330C(enabling), e5);
    }

    /* JADX INFO: renamed from: S */
    private final void m76339S(String originalAlarmSettingsLogString, String failedAlarmSettingsLogString, Exception e5) throws IOException {
        String strM125909s = AbstractC39415s.m125909s("\n                            After server alarm update failure, failed to revert alarm settings on strap. User\n                            attempted to update alarm state from (" + originalAlarmSettingsLogString + ") to\n                            (" + failedAlarmSettingsLogString + "). The server and strap now have discordant\n                            alarm settings. This is very bad.\n        ");
        m49136n().mo85222m(strM125909s, new AbstractC30556a.a[0]);
        InterfaceC31766c.m98634e(this.crashReporter, new SmartAlarmException(strM125909s, e5), null, 2, null);
    }

    /* JADX INFO: renamed from: U */
    public static /* synthetic */ void m76340U(C25852s c25852s, String str, String str2, Exception exc, int i13, Object obj) throws IOException {
        if ((i13 & 4) != 0) {
            exc = null;
        }
        c25852s.m76339S(str, str2, exc);
    }

    /* JADX WARN: Code duplicated, block: B:37:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:38:0x00b6  */
    /* JADX INFO: renamed from: X */
    private final void m76341X(boolean fromPush, String error, boolean lowBattery, SmartAlarmUserInfo previousAlarmSettingsFromDb) {
        String str;
        String str2;
        String str3;
        String str4;
        AbstractC22734a previousAlarm = this.conductorRepository.m18640r().getPreviousAlarm();
        boolean zIsAlarmEnabledPreviously = this.conductorRepository.m18640r().isAlarmEnabledPreviously();
        AbstractC22734a currentAlarm = this.conductorRepository.m18640r().getCurrentAlarm();
        boolean currentSelectedAlarm = this.conductorRepository.m18640r().getCurrentSelectedAlarm();
        String strM95641q = "not updated";
        if (currentSelectedAlarm == zIsAlarmEnabledPreviously) {
            str = "not updated";
        } else {
            str = currentSelectedAlarm ? "on" : "off";
        }
        String analyticsValue = (currentSelectedAlarm && AbstractC27010c.m81005a(currentAlarm) != AbstractC27010c.m81005a(previousAlarm)) ? AbstractC27010c.m81005a(currentAlarm).getAnalyticsValue() : "not updated";
        String str5 = MediaConstraintsFactory.kValueFalse;
        if (previousAlarmSettingsFromDb == null ? !AbstractC22676k.m65745e(currentAlarm.getLatestWakeTime(), previousAlarm.getLatestWakeTime()) : !AbstractC22676k.m65745e(previousAlarmSettingsFromDb.getUpperBoundLocalTime(), currentAlarm.getLatestWakeTime())) {
            str5 = MediaConstraintsFactory.kValueTrue;
        }
        if (!AbstractC22676k.m65745e(currentAlarm.m65814a(), previousAlarm.m65814a()) && AbstractC27010c.m81005a(currentAlarm) != EnumC27008a.IN_THE_GREEN) {
            String string = currentAlarm.m65814a().toString();
            Locale locale = Locale.US;
            strM95641q = AbstractC31061c.m95641q(locale, "US", string, locale, "toLowerCase(...)");
        }
        if (!currentSelectedAlarm && !zIsAlarmEnabledPreviously) {
            str2 = error;
            if (AbstractC22676k.m65745e(str2, NotificationCompat.CATEGORY_ALARM)) {
                str3 = "sleep coach";
            }
            if (fromPush) {
                str4 = "push";
            } else {
                str4 = "coaching";
            }
            this.eventDispatcher.m129049o0(AbstractC25247g0.m73990Y(new C23465k("Source", str4), new C23465k("Alarm Set", str), new C23465k("Alarm Type", analyticsValue), new C23465k("LWT Updated", str5), new C23465k("Sleep Goal", strM95641q), new C23465k("Error", str3), new C23465k("Whoop Low Battery", String.valueOf(lowBattery))));
        }
        str2 = error;
        str3 = str2;
        if (fromPush) {
            str4 = "push";
        } else {
            str4 = "coaching";
        }
        this.eventDispatcher.m129049o0(AbstractC25247g0.m73990Y(new C23465k("Source", str4), new C23465k("Alarm Set", str), new C23465k("Alarm Type", analyticsValue), new C23465k("LWT Updated", str5), new C23465k("Sleep Goal", strM95641q), new C23465k("Error", str3), new C23465k("Whoop Low Battery", String.valueOf(lowBattery))));
    }

    /* JADX INFO: renamed from: Y */
    public static /* synthetic */ void m76342Y(C25852s c25852s, boolean z4, String str, boolean z13, SmartAlarmUserInfo smartAlarmUserInfo, int i13, Object obj) {
        if ((i13 & 4) != 0) {
            z13 = false;
        }
        if ((i13 & 8) != 0) {
            smartAlarmUserInfo = null;
        }
        c25852s.m76341X(z4, str, z13, smartAlarmUserInfo);
    }

    /* JADX INFO: renamed from: b0 */
    private final void m76343b0(boolean fromPush) {
        AbstractC3006f0.m8732z(AbstractC1640x1.m5043b(this), null, null, new b(this.conductorRepository.m18640r().getCurrentSelectedAlarm(), fromPush, null), 3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:41:0x011a  */
    /* JADX WARN: Code duplicated, block: B:45:0x015d  */
    /* JADX WARN: Code duplicated, block: B:54:0x01a3  */
    /* JADX WARN: Code duplicated, block: B:57:0x01b1  */
    /* JADX WARN: Code duplicated, block: B:61:0x01d9  */
    /* JADX WARN: Code duplicated, block: B:64:0x01e3 A[Catch: Exception -> 0x0079, TryCatch #3 {Exception -> 0x0079, blocks: (B:19:0x0074, B:62:0x01df, B:64:0x01e3, B:66:0x01ef, B:69:0x020b), top: B:93:0x0074 }] */
    /* JADX WARN: Code duplicated, block: B:69:0x020b A[Catch: Exception -> 0x0079, TRY_LEAVE, TryCatch #3 {Exception -> 0x0079, blocks: (B:19:0x0074, B:62:0x01df, B:64:0x01e3, B:66:0x01ef, B:69:0x020b), top: B:93:0x0074 }] */
    /* JADX WARN: Code duplicated, block: B:77:0x0242 A[PHI: r2 r5 r6 r7 r10 r11 r12
      0x0242: PHI (r2v34 boolean) = (r2v28 boolean), (r2v35 boolean) binds: [B:56:0x01af, B:73:0x0238] A[DONT_GENERATE, DONT_INLINE]
      0x0242: PHI (r5v28 boolean) = (r5v20 boolean), (r5v30 boolean) binds: [B:56:0x01af, B:73:0x0238] A[DONT_GENERATE, DONT_INLINE]
      0x0242: PHI (r6v24 int) = (r6v18 int), (r6v25 int) binds: [B:56:0x01af, B:73:0x0238] A[DONT_GENERATE, DONT_INLINE]
      0x0242: PHI (r7v20 boolean) = (r7v14 boolean), (r7v21 boolean) binds: [B:56:0x01af, B:73:0x0238] A[DONT_GENERATE, DONT_INLINE]
      0x0242: PHI (r10v22 boolean) = (r10v13 boolean), (r10v23 boolean) binds: [B:56:0x01af, B:73:0x0238] A[DONT_GENERATE, DONT_INLINE]
      0x0242: PHI (r11v22 boolean) = (r11v12 boolean), (r11v23 boolean) binds: [B:56:0x01af, B:73:0x0238] A[DONT_GENERATE, DONT_INLINE]
      0x0242: PHI (r12v26 com.whoop.data.local.room.entity.SmartAlarmUserInfo) = 
      (r12v16 com.whoop.data.local.room.entity.SmartAlarmUserInfo)
      (r12v27 com.whoop.data.local.room.entity.SmartAlarmUserInfo)
     binds: [B:56:0x01af, B:73:0x0238] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    /* JADX WARN: Code duplicated, block: B:80:0x025e  */
    /* JADX WARN: Code duplicated, block: B:82:0x028b  */
    /* JADX WARN: Code duplicated, block: B:83:0x0293  */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x0231, code lost:
    
        if (r0.disableAlarmOnStrap(r3) == r4) goto L79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x025b, code lost:
    
        if (m76347f0(r2, r10, r12, r3) == r4) goto L79;
     */
    /* JADX WARN: Instruction removed from duplicated block: B:41:0x011a, please report this as an issue */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v1 */
    /* JADX WARN: Type inference failed for: r12v5 */
    /* JADX WARN: Type inference failed for: r16v0, types: [hj0.o, mp0.s] */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v2, types: [int] */
    /* JADX WARN: Type inference failed for: r7v6 */
    /* JADX INFO: renamed from: c0 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object m76344c0(boolean r17, org.joda.time.DateTime r18, boolean r19, boolean r20, boolean r21, q83.InterfaceC30057d<? super l83.C23454a0> r22) throws java.io.IOException {
        /*
            Method dump skipped, instruction units count: 720
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: mp0.C25852s.m76344c0(boolean, org.joda.time.DateTime, boolean, boolean, boolean, q83.d):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    /* JADX INFO: renamed from: d0 */
    public final Object m76345d0(boolean z4, DateTime dateTime, boolean z13, boolean z14, InterfaceC30057d<? super Boolean> interfaceC30057d) {
        d dVar;
        boolean z15;
        if (interfaceC30057d instanceof d) {
            dVar = (d) interfaceC30057d;
            int i13 = dVar.f101890G;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                dVar.f101890G = i13 - Integer.MIN_VALUE;
            } else {
                dVar = new d(interfaceC30057d);
            }
        } else {
            dVar = new d(interfaceC30057d);
        }
        d dVar2 = dVar;
        Object objM92683q = dVar2.f101888E;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = dVar2.f101890G;
        if (i14 == 0) {
            AbstractC34132o.m107864I(objM92683q);
            C30327f c30327f = this.smartAlarmRepository;
            SmartAlarmGoalType smartAlarmGoalTypeM65817a = AbstractC22735b.m65817a(this.conductorRepository.m18640r().getCurrentAlarm());
            boolean z16 = !z14 && z13;
            dVar2.f101894z = null;
            dVar2.f101891w = z4;
            dVar2.f101892x = z13;
            dVar2.f101893y = z14;
            dVar2.f101890G = 1;
            objM92683q = c30327f.m92683q(smartAlarmGoalTypeM65817a, z4, dateTime, z16, dVar2);
            if (objM92683q == enumC31071a) {
                return enumC31071a;
            }
            z15 = z4;
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            z15 = dVar2.f101891w;
            AbstractC34132o.m107864I(objM92683q);
        }
        boolean zBooleanValue = ((Boolean) objM92683q).booleanValue();
        if (!zBooleanValue) {
            m49136n().mo85222m(AbstractC11266d.m30461o("failed to update alarm on server while ", m76331G(z15)), new AbstractC30556a.a[0]);
        }
        return Boolean.valueOf(zBooleanValue);
    }

    /* JADX INFO: renamed from: e0 */
    private final Object m76346e0(boolean z4, Instant instant, InterfaceC30057d<? super Boolean> interfaceC30057d) {
        return z4 ? this.smartAlarmRepository.m92684r(instant, interfaceC30057d) : this.smartAlarmRepository.disableAlarmOnStrap(interfaceC30057d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: f0 */
    public final Object m76347f0(boolean z4, boolean z13, SmartAlarmUserInfo smartAlarmUserInfo, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        e eVar;
        if (interfaceC30057d instanceof e) {
            eVar = (e) interfaceC30057d;
            int i13 = eVar.f101896F;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                eVar.f101896F = i13 - Integer.MIN_VALUE;
            } else {
                eVar = new e(interfaceC30057d);
            }
        } else {
            eVar = new e(interfaceC30057d);
        }
        Object obj = eVar.f101900z;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = eVar.f101896F;
        if (i14 == 0) {
            AbstractC34132o.m107864I(obj);
            if (z4) {
                m76335N(EnumC25840m.SUCCESS, m76333L(this.conductorRepository.m18640r()));
                eVar.f101899y = smartAlarmUserInfo;
                eVar.f101897w = z4;
                eVar.f101898x = z13;
                eVar.f101896F = 1;
                if (AbstractC3034m0.m8782b(1500L, eVar) == enumC31071a) {
                    return enumC31071a;
                }
            } else {
                m49136n().mo85222m("updating the strap failed with StrapCommunicationError", new AbstractC30556a.a[0]);
                m49136n().mo85228t(AbstractC11266d.m30462p("strap failed due to server update failure - connection status: ", this.smartAlarmRepository.m92682o()), new AbstractC30556a.a[0]);
                m76342Y(this, z13, NotificationCompat.CATEGORY_ALARM, false, smartAlarmUserInfo, 4, null);
                m76335N(EnumC25840m.ERROR, new C23465k(new TextResource.C8688b(AbstractC30314g.f124347s, null, 2, null), new TextResource.C8688b(AbstractC30314g.f124350t, null, 2, null)));
            }
            return C23454a0.f92919a;
        }
        if (i14 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        z13 = eVar.f101898x;
        smartAlarmUserInfo = (SmartAlarmUserInfo) eVar.f101899y;
        AbstractC34132o.m107864I(obj);
        m76341X(z13, "none", this.smartAlarmRepository.m92681m().m65138g(), smartAlarmUserInfo);
        m49138t(this.onSuccessCompleteLiveData, Boolean.TRUE);
        return C23454a0.f92919a;
    }

    /* JADX INFO: renamed from: D */
    public final void m76351D() {
        m76335N(EnumC25840m.IDLE, null);
        m76336O();
        C6240b c6240b = this.conductorRepository;
        c6240b.m18644v(c6240b.m18633k().m76153a(EnumC25817b.COLLAPSED_STATE_FLOW));
        C6240b c6240b2 = this.conductorRepository;
        c6240b2.m18631B(ConductorViewState.copy$default(c6240b2.m18640r(), null, this.conductorRepository.m18640r().getCurrentAlarm(), false, this.conductorRepository.m18640r().getCurrentSelectedAlarm(), 0, false, false, null, null, false, false, null, 3509, null));
    }

    /* JADX INFO: renamed from: E, reason: from getter */
    public final AbstractC1615p0 getAlarmLoadingViewStateLiveData() {
        return this.alarmLoadingViewStateLiveData;
    }

    /* JADX INFO: renamed from: F, reason: from getter */
    public final AbstractC1615p0 getAlarmOptionFlowLiveData() {
        return this.alarmOptionFlowLiveData;
    }

    /* JADX INFO: renamed from: I, reason: from getter */
    public final AbstractC1615p0 getOnBackPressHandlerLiveData() {
        return this.onBackPressHandlerLiveData;
    }

    /* JADX INFO: renamed from: K, reason: from getter */
    public final AbstractC1615p0 getOnSuccessCompleteLiveData() {
        return this.onSuccessCompleteLiveData;
    }

    /* JADX INFO: renamed from: R */
    public final void m76356R(boolean fromPush) {
        m49140v(this.alarmLoadingViewStateLiveData, new C25814a(this.conductorRepository.m18640r().getCurrentSelectedAlarm(), EnumC25840m.LOADING, m76332H(this.conductorRepository.m18640r().getCurrentSelectedAlarm(), this.conductorRepository.m18640r().isSkipStrapCheck())));
        m76343b0(fromPush);
    }

    /* JADX INFO: renamed from: V */
    public final void m76357V(EnumC25821c0 pressObject) {
        AbstractC22676k.m65750j(pressObject, "pressObject");
        this.eventDispatcher.m129043l0("Press", pressObject.getEventName(), "", AbstractC31061c.m95645u("object", pressObject.getObjectName()));
    }

    /* JADX INFO: renamed from: W */
    public final void m76358W(EnumC25823d0 viewEvent) {
        AbstractC22676k.m65750j(viewEvent, "viewEvent");
        this.eventDispatcher.m129043l0("View", viewEvent.getEventName(), "", AbstractC25247g0.m73990Y(new C23465k("object", viewEvent.getObjectName()), new C23465k("previous", this.conductorRepository.m18640r().getPreviousAlarm().m65816c(this.conductorRepository.m18640r().isAlarmEnabledPreviously())), new C23465k("new", this.conductorRepository.m18640r().getCurrentAlarm().m65816c(this.conductorRepository.m18640r().getCurrentSelectedAlarm())), new C23465k("Battery", AbstractC31061c.m95635k(this.smartAlarmRepository.m92681m().m65137f(), "%"))));
    }

    /* JADX INFO: renamed from: Z */
    public final void m76359Z() {
        this.conductorRepository.m18648z(true);
        C6240b c6240b = this.conductorRepository;
        c6240b.m18644v(c6240b.m18633k().m76153a(EnumC25817b.EMPTY_STATE));
    }

    @Override // hj0.AbstractC17356o
    /* JADX INFO: renamed from: o, reason: from getter */
    public String getLogTag() {
        return this.logTag;
    }

    public /* synthetic */ C25852s(C6240b c6240b, C30327f c30327f, InterfaceC31766c interfaceC31766c, C40191e c40191e, C28205u0 c28205u0, InterfaceC28172j0 interfaceC28172j0, InterfaceC2994c0 interfaceC2994c0, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(c6240b, c30327f, interfaceC31766c, c40191e, c28205u0, interfaceC28172j0, (i13 & 64) != 0 ? new C28180m(null, 1, null) : interfaceC2994c0);
    }
}
