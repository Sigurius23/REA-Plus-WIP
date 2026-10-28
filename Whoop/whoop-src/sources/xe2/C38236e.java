package xe2;

import af2.C0811a;
import af2.C0813c;
import af2.C0814d;
import af2.C0815e;
import af2.C0817g;
import af2.C0818h;
import af2.C0820j;
import af2.C0821k;
import af2.EnumC0812b;
import af2.EnumC0819i;
import af2.InterfaceC0816f;
import com.whoop.data.remote.commons.Resource;
import com.whoop.data.remote.commons.Status;
import com.whoop.sleep.coach.data.network.model.loading.ScheduleSaveDto;
import com.whoop.sleep.coach.data.network.model.loading.ScheduleSavingErrorDto;
import com.whoop.sleep.coach.data.network.model.sleepScheduleComponent.AlarmModeTypeDto;
import com.whoop.sleep.coach.data.network.model.sleepScheduleComponent.AlarmToWakeTimeTemplateDto;
import com.whoop.sleep.coach.data.network.model.sleepScheduleComponent.CreateAlarmScheduleDto;
import com.whoop.sleep.coach.data.network.model.sleepScheduleComponent.DaySelectionStateDTO;
import com.whoop.sleep.coach.data.network.model.sleepScheduleComponent.NextStateDto;
import com.whoop.sleep.coach.data.network.model.sleepScheduleComponent.RepeatDaysDto;
import com.whoop.sleep.coach.data.network.model.sleepScheduleComponent.ScheduleDayDto;
import com.whoop.sleep.coach.data.network.model.sleepScheduleComponent.SleepGoalDto;
import com.whoop.sleep.coach.data.network.model.sleepScheduleComponent.SleepGoalTypeDto;
import com.whoop.sleep.coach.data.network.model.sleepScheduleComponent.SleepGoalValueDto;
import com.whoop.sleep.coach.data.network.model.sleepScheduleComponent.SleepScheduleComponentsDto;
import com.whoop.sleep.coach.data.network.model.sleepScheduleComponent.WakeModeDto;
import com.whoop.sleep.coach.data.network.model.sleepScheduleComponent.WakeTimeDto;
import ef2.C13151a;
import ff2.C14430a;
import io.getstream.chat.android.client.streamcdn.StreamCdnResizeImageQueryParameterKeys;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import l83.C23454a0;
import m83.AbstractC25265s;
import m83.AbstractC25267u;
import or2.AbstractC28184n0;
import or2.C28204u;
import org.joda.time.LocalTime;
import p000.AbstractC11266d;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.internal.AbstractC22676k;
import q83.AbstractC30060g;
import q83.InterfaceC30057d;
import qr2.AbstractC30556a;
import r83.EnumC31071a;
import s83.AbstractC32269c;
import s83.InterfaceC32271e;
import td1.InterfaceC33704b;
import tr2.InterfaceC34116n;
import we2.AbstractC37232a;
import we2.C37233b;
import ye2.C39479a;
import ye2.C39480b;

/* JADX INFO: renamed from: xe2.e */
/* JADX INFO: loaded from: classes4.dex */
@Metadata(m65680d1 = {"\u0000 \u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0007\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0018\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020\u0010H\u0086@¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0017\u001a\u00020\u00122\u0006\u0010\u0016\u001a\u00020\u0015H\u0007¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0012H\u0082@¢\u0006\u0004\b\u0019\u0010\u001aJ\u0018\u0010\u001d\u001a\u00020\u00122\u0006\u0010\u001c\u001a\u00020\u001bH\u0082@¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0012H\u0082@¢\u0006\u0004\b\u001f\u0010\u001aJ&\u0010$\u001a\u00020\u00122\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020!0 2\u0006\u0010#\u001a\u00020\u0015H\u0082@¢\u0006\u0004\b$\u0010%J\u0010\u0010&\u001a\u00020\u0012H\u0082@¢\u0006\u0004\b&\u0010\u001aJ\u0017\u0010(\u001a\u00020\u00122\u0006\u0010\u0011\u001a\u00020'H\u0002¢\u0006\u0004\b(\u0010)J\u001f\u0010-\u001a\u00020+2\u0006\u0010*\u001a\u00020\u001b2\u0006\u0010,\u001a\u00020+H\u0002¢\u0006\u0004\b-\u0010.J\u000f\u0010/\u001a\u00020\u0012H\u0002¢\u0006\u0004\b/\u00100J\u000f\u00101\u001a\u00020\u0012H\u0002¢\u0006\u0004\b1\u00100J\u0017\u00104\u001a\u00020\u00122\u0006\u00103\u001a\u000202H\u0002¢\u0006\u0004\b4\u00105J\u000f\u00106\u001a\u00020\u0012H\u0002¢\u0006\u0004\b6\u00100J\u0017\u00109\u001a\u00020\u00122\u0006\u00108\u001a\u000207H\u0002¢\u0006\u0004\b9\u0010:J\u001f\u0010>\u001a\u00020=2\u0006\u0010<\u001a\u00020;2\u0006\u00108\u001a\u000207H\u0002¢\u0006\u0004\b>\u0010?J\u0017\u0010B\u001a\u00020\u00122\u0006\u0010A\u001a\u00020@H\u0002¢\u0006\u0004\bB\u0010CJ\u0017\u0010F\u001a\u00020D2\u0006\u0010E\u001a\u00020DH\u0002¢\u0006\u0004\bF\u0010GJ\u0013\u0010I\u001a\u00020\u0015*\u00020HH\u0002¢\u0006\u0004\bI\u0010JJ\u0013\u0010L\u001a\u00020=*\u00020KH\u0002¢\u0006\u0004\bL\u0010MJ\u0017\u0010O\u001a\u00020\u00122\u0006\u0010N\u001a\u00020\u0015H\u0002¢\u0006\u0004\bO\u0010\u0018J\u0013\u0010Q\u001a\u00020+*\u00020PH\u0002¢\u0006\u0004\bQ\u0010RJ\u001f\u0010V\u001a\b\u0012\u0004\u0012\u00020U0S*\b\u0012\u0004\u0012\u00020T0SH\u0002¢\u0006\u0004\bV\u0010WJ\u0017\u0010Y\u001a\u00020D2\u0006\u0010E\u001a\u00020XH\u0002¢\u0006\u0004\bY\u0010ZJ\u0013\u0010\\\u001a\u00020;*\u00020[H\u0002¢\u0006\u0004\b\\\u0010]J\u001f\u0010`\u001a\b\u0012\u0004\u0012\u00020_0S*\b\u0012\u0004\u0012\u00020^0SH\u0002¢\u0006\u0004\b`\u0010WJ\u0017\u0010c\u001a\u00020b2\u0006\u0010a\u001a\u00020HH\u0002¢\u0006\u0004\bc\u0010dJ\u000f\u0010e\u001a\u00020\u0012H\u0002¢\u0006\u0004\be\u00100J\u0013\u0010h\u001a\u00020g*\u00020fH\u0002¢\u0006\u0004\bh\u0010iJ\u001f\u0010l\u001a\b\u0012\u0004\u0012\u00020k0S*\b\u0012\u0004\u0012\u00020j0SH\u0002¢\u0006\u0004\bl\u0010WJ\u0013\u0010o\u001a\u00020n*\u00020mH\u0002¢\u0006\u0004\bo\u0010pJ\u0013\u0010s\u001a\u00020r*\u00020qH\u0002¢\u0006\u0004\bs\u0010tJ\u0013\u0010v\u001a\u000202*\u00020uH\u0002¢\u0006\u0004\bv\u0010wJ\u0013\u0010y\u001a\u00020x*\u00020\u0015H\u0002¢\u0006\u0004\by\u0010zR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b{\u0010|R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b}\u0010~R\u0015\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u007f\u0010\u0080\u0001R\u0016\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0081\u0001\u0010\u0082\u0001R\u0016\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0083\u0001\u0010\u0084\u0001R\u0015\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b(\u0010\u0085\u0001¨\u0006\u0086\u0001"}, m65681d2 = {"Lxe2/e;", "", "Lef2/a;", "sleepCoachScheduleRepository", "Lxe2/c;", "scheduleAlarmEditor", "Lff2/a;", "smartAlarmHandler", "Ltr2/n;", "logger", "Lwe2/b;", "sleepScheduleAnalyticHelper", "Ltd1/b;", "whoopStrap", "<init>", "(Lef2/a;Lxe2/c;Lff2/a;Ltr2/n;Lwe2/b;Ltd1/b;)V", "Lxe2/d;", "domainAction", "Lxe2/f;", "q", "(Lxe2/d;Lq83/d;)Ljava/lang/Object;", "Laf2/j;", "topOfStack", "j", "(Laf2/j;)Lxe2/f;", "g", "(Lq83/d;)Ljava/lang/Object;", "", "scheduleId", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_HEIGHT, "(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;", StreamCdnResizeImageQueryParameterKeys.QUERY_PARAMETER_KEY_RESIZED_WIDTH, "Lcom/whoop/data/remote/commons/Resource;", "Ll83/a0;", "result", "domainObject", "p", "(Lcom/whoop/data/remote/commons/Resource;Laf2/j;Lq83/d;)Ljava/lang/Object;", "r", "Lxe2/d$b;", "f", "(Lxe2/d$b;)Lxe2/f;", "dayOfWeek", "Laf2/d;", "repeatDaysDomainObject", "L", "(Ljava/lang/String;Laf2/d;)Laf2/d;", "l", "()Lxe2/f;", "s", "Laf2/i;", "sleepGoalValue", "v", "(Laf2/i;)Lxe2/f;", "x", "Lxe2/a;", "alarmModeState", "o", "(Lxe2/a;)Lxe2/f;", "Laf2/k;", "wakeMode", "Lxe2/b;", "k", "(Laf2/k;Lxe2/a;)Lxe2/b;", "Lorg/joda/time/LocalTime;", "latestWakeTime", "t", "(Lorg/joda/time/LocalTime;)Lxe2/f;", "Laf2/b;", "selectionState", "K", "(Laf2/b;)Laf2/b;", "Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/SleepScheduleComponentsDto;", "I", "(Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/SleepScheduleComponentsDto;)Laf2/j;", "Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/NextStateDto;", "A", "(Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/NextStateDto;)Lxe2/b;", "currentDisplay", "u", "Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/RepeatDaysDto;", "B", "(Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/RepeatDaysDto;)Laf2/d;", "", "Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/ScheduleDayDto;", "Laf2/e;", "C", "(Ljava/util/List;)Ljava/util/List;", "Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/DaySelectionStateDTO;", "m", "(Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/DaySelectionStateDTO;)Laf2/b;", "Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/WakeModeDto;", "J", "(Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/WakeModeDto;)Laf2/k;", "Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/AlarmModeTypeDto;", "Laf2/a;", "y", "sleepScheduleComponentsDto", "Laf2/c;", "n", "(Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/SleepScheduleComponentsDto;)Laf2/c;", "i", "Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/SleepGoalDto;", "Laf2/g;", "F", "(Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/SleepGoalDto;)Laf2/g;", "Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/SleepGoalTypeDto;", "Laf2/h;", "G", "Lcom/whoop/sleep/coach/data/network/model/loading/ScheduleSaveDto;", "Lye2/a;", "D", "(Lcom/whoop/sleep/coach/data/network/model/loading/ScheduleSaveDto;)Lye2/a;", "Lcom/whoop/sleep/coach/data/network/model/loading/ScheduleSavingErrorDto;", "Lye2/b;", "E", "(Lcom/whoop/sleep/coach/data/network/model/loading/ScheduleSavingErrorDto;)Lye2/b;", "Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/SleepGoalValueDto;", "H", "(Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/SleepGoalValueDto;)Laf2/i;", "Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/CreateAlarmScheduleDto;", "z", "(Laf2/j;)Lcom/whoop/sleep/coach/data/network/model/sleepScheduleComponent/CreateAlarmScheduleDto;", "a", "Lef2/a;", "b", "Lxe2/c;", "c", "Lff2/a;", "d", "Ltr2/n;", "e", "Lwe2/b;", "Ltd1/b;", "sleep-coach_release"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class C38236e {

    /* JADX INFO: renamed from: a, reason: from kotlin metadata */
    private final C13151a sleepCoachScheduleRepository;

    /* JADX INFO: renamed from: b, reason: from kotlin metadata */
    private final C38234c scheduleAlarmEditor;

    /* JADX INFO: renamed from: c, reason: from kotlin metadata */
    private final C14430a smartAlarmHandler;

    /* JADX INFO: renamed from: d, reason: from kotlin metadata */
    private final InterfaceC34116n logger;

    /* JADX INFO: renamed from: e, reason: from kotlin metadata */
    private final C37233b sleepScheduleAnalyticHelper;

    /* JADX INFO: renamed from: f, reason: from kotlin metadata */
    private final InterfaceC33704b whoopStrap;

    /* JADX INFO: renamed from: xe2.e$a */
    /* JADX INFO: loaded from: classes10.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class a {

        /* JADX INFO: renamed from: a */
        public static final /* synthetic */ int[] f163902a;

        /* JADX INFO: renamed from: b */
        public static final /* synthetic */ int[] f163903b;

        /* JADX INFO: renamed from: c */
        public static final /* synthetic */ int[] f163904c;

        /* JADX INFO: renamed from: d */
        public static final /* synthetic */ int[] f163905d;

        /* JADX INFO: renamed from: e */
        public static final /* synthetic */ int[] f163906e;

        static {
            int[] iArr = new int[EnumC38233b.values().length];
            try {
                iArr[EnumC38233b.REPEAT_DAYS.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC38233b.WAKE_MODE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[EnumC38233b.WAKE_TIME.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[EnumC38233b.SLEEP_GOAL.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            f163902a = iArr;
            int[] iArr2 = new int[EnumC0812b.values().length];
            try {
                iArr2[EnumC0812b.UNSCHEDULED.ordinal()] = 1;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[EnumC0812b.CURRENT_SCHEDULE.ordinal()] = 2;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[EnumC0812b.OTHER_SCHEDULE.ordinal()] = 3;
            } catch (NoSuchFieldError unused7) {
            }
            f163903b = iArr2;
            int[] iArr3 = new int[NextStateDto.values().length];
            try {
                iArr3[NextStateDto.WAKE_MODE.ordinal()] = 1;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr3[NextStateDto.WAKE_TIME.ordinal()] = 2;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr3[NextStateDto.SLEEP_GOAL.ordinal()] = 3;
            } catch (NoSuchFieldError unused10) {
            }
            f163904c = iArr3;
            int[] iArr4 = new int[DaySelectionStateDTO.values().length];
            try {
                iArr4[DaySelectionStateDTO.UNSCHEDULED.ordinal()] = 1;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr4[DaySelectionStateDTO.CURRENT_SCHEDULE.ordinal()] = 2;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr4[DaySelectionStateDTO.OTHER_SCHEDULE.ordinal()] = 3;
            } catch (NoSuchFieldError unused13) {
            }
            f163905d = iArr4;
            int[] iArr5 = new int[SleepGoalValueDto.values().length];
            try {
                iArr5[SleepGoalValueDto.PEAK.ordinal()] = 1;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr5[SleepGoalValueDto.PERFORM.ordinal()] = 2;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr5[SleepGoalValueDto.GET_BY.ordinal()] = 3;
            } catch (NoSuchFieldError unused16) {
            }
            f163906e = iArr5;
        }
    }

    /* JADX INFO: renamed from: xe2.e$b */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.sleep.coach.data.domain.WakeTimeScheduleDomainInteractor", m100430f = "WakeTimeScheduleDomainInteractor.kt", m100431l = {79}, m100432m = "fetchSleepScheduleComponents", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class b extends AbstractC32269c {

        /* JADX INFO: renamed from: w */
        /* synthetic */ Object f163907w;

        /* JADX INFO: renamed from: y */
        int f163909y;

        public b(InterfaceC30057d<? super b> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f163907w = obj;
            this.f163909y |= Integer.MIN_VALUE;
            return C38236e.this.m122539g(this);
        }
    }

    /* JADX INFO: renamed from: xe2.e$c */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.sleep.coach.data.domain.WakeTimeScheduleDomainInteractor", m100430f = "WakeTimeScheduleDomainInteractor.kt", m100431l = {98}, m100432m = "fetchSleepScheduleComponentsWithId", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class c extends AbstractC32269c {

        /* JADX INFO: renamed from: w */
        Object f163910w;

        /* JADX INFO: renamed from: x */
        /* synthetic */ Object f163911x;

        /* JADX INFO: renamed from: z */
        int f163913z;

        public c(InterfaceC30057d<? super c> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f163911x = obj;
            this.f163913z |= Integer.MIN_VALUE;
            return C38236e.this.m122540h(null, this);
        }
    }

    /* JADX INFO: renamed from: xe2.e$d */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.sleep.coach.data.domain.WakeTimeScheduleDomainInteractor", m100430f = "WakeTimeScheduleDomainInteractor.kt", m100431l = {135}, m100432m = "handleSaveScheduleResult", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class d extends AbstractC32269c {

        /* JADX INFO: renamed from: E */
        int f163914E;

        /* JADX INFO: renamed from: w */
        Object f163915w;

        /* JADX INFO: renamed from: x */
        Object f163916x;

        /* JADX INFO: renamed from: y */
        /* synthetic */ Object f163917y;

        public d(InterfaceC30057d<? super d> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f163917y = obj;
            this.f163914E |= Integer.MIN_VALUE;
            return C38236e.this.m122547p(null, null, this);
        }
    }

    /* JADX INFO: renamed from: xe2.e$e */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.sleep.coach.data.domain.WakeTimeScheduleDomainInteractor", m100430f = "WakeTimeScheduleDomainInteractor.kt", m100431l = {144, 145}, m100432m = "registerCardCompletedAndShowCreateSchedule", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class e extends AbstractC32269c {

        /* JADX INFO: renamed from: w */
        /* synthetic */ Object f163919w;

        /* JADX INFO: renamed from: y */
        int f163921y;

        public e(InterfaceC30057d<? super e> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f163919w = obj;
            this.f163921y |= Integer.MIN_VALUE;
            return C38236e.this.m122548r(this);
        }
    }

    /* JADX INFO: renamed from: xe2.e$f */
    /* JADX INFO: loaded from: classes10.dex */
    @InterfaceC32271e(m100429c = "com.whoop.sleep.coach.data.domain.WakeTimeScheduleDomainInteractor", m100430f = "WakeTimeScheduleDomainInteractor.kt", m100431l = {122, 121, 128, 127}, m100432m = "saveSleepSchedule", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class f extends AbstractC32269c {

        /* JADX INFO: renamed from: F */
        int f163923F;

        /* JADX INFO: renamed from: w */
        Object f163924w;

        /* JADX INFO: renamed from: x */
        Object f163925x;

        /* JADX INFO: renamed from: y */
        Object f163926y;

        /* JADX INFO: renamed from: z */
        /* synthetic */ Object f163927z;

        public f(InterfaceC30057d<? super f> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.f163927z = obj;
            this.f163923F |= Integer.MIN_VALUE;
            return C38236e.this.m122553w(this);
        }
    }

    /* JADX INFO: renamed from: xe2.e$g */
    /* JADX INFO: loaded from: classes10.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class g<T> implements Comparator {
        /* JADX WARN: Multi-variable type inference failed */
        @Override // java.util.Comparator
        public final int compare(T t14, T t15) {
            return AbstractC30060g.m92127q(Integer.valueOf(((C0815e) t14).getDisplayIndex()), Integer.valueOf(((C0815e) t15).getDisplayIndex()));
        }
    }

    public C38236e(C13151a sleepCoachScheduleRepository, C38234c scheduleAlarmEditor, C14430a smartAlarmHandler, InterfaceC34116n logger, C37233b sleepScheduleAnalyticHelper, InterfaceC33704b whoopStrap) {
        AbstractC22676k.m65750j(sleepCoachScheduleRepository, "sleepCoachScheduleRepository");
        AbstractC22676k.m65750j(scheduleAlarmEditor, "scheduleAlarmEditor");
        AbstractC22676k.m65750j(smartAlarmHandler, "smartAlarmHandler");
        AbstractC22676k.m65750j(logger, "logger");
        AbstractC22676k.m65750j(sleepScheduleAnalyticHelper, "sleepScheduleAnalyticHelper");
        AbstractC22676k.m65750j(whoopStrap, "whoopStrap");
        this.sleepCoachScheduleRepository = sleepCoachScheduleRepository;
        this.scheduleAlarmEditor = scheduleAlarmEditor;
        this.smartAlarmHandler = smartAlarmHandler;
        this.logger = logger;
        this.sleepScheduleAnalyticHelper = sleepScheduleAnalyticHelper;
        this.whoopStrap = whoopStrap;
    }

    /* JADX INFO: renamed from: A */
    private final EnumC38233b m122521A(NextStateDto nextStateDto) {
        int i13 = a.f163904c[nextStateDto.ordinal()];
        if (i13 == 1) {
            return EnumC38233b.WAKE_MODE;
        }
        if (i13 == 2) {
            return EnumC38233b.WAKE_TIME;
        }
        if (i13 == 3) {
            return EnumC38233b.SLEEP_GOAL;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: renamed from: B */
    private final C0814d m122522B(RepeatDaysDto repeatDaysDto) {
        return new C0814d(repeatDaysDto.getDaysToScheduleDescriptionText(), repeatDaysDto.getDaysToScheduleTitleDisplay(), repeatDaysDto.getDaysToScheduleButtonLabelDisplay(), m122523C(repeatDaysDto.getScheduleDayList()), repeatDaysDto.getHelpIconLink(), m122521A(repeatDaysDto.getNextState()));
    }

    /* JADX INFO: renamed from: C */
    private final List<C0815e> m122523C(List<ScheduleDayDto> list) {
        List<ScheduleDayDto> list2 = list;
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(list2, 10));
        for (ScheduleDayDto scheduleDayDto : list2) {
            arrayList.add(new C0815e(m122544m(scheduleDayDto.getSelectionState()), scheduleDayDto.getDayLabelDisplay(), scheduleDayDto.getDayOfWeekValue(), scheduleDayDto.getDisplayIndex()));
        }
        return AbstractC25265s.m74152u1(arrayList, new g());
    }

    /* JADX INFO: renamed from: D */
    private final C39479a m122524D(ScheduleSaveDto scheduleSaveDto) {
        return new C39479a(scheduleSaveDto.getModalTitleDisplay(), scheduleSaveDto.getModalSubtextDisplay());
    }

    /* JADX INFO: renamed from: E */
    private final C39480b m122525E(ScheduleSavingErrorDto scheduleSavingErrorDto) {
        return new C39480b(scheduleSavingErrorDto.getButtonActionDisplayText(), scheduleSavingErrorDto.getDismissActionDisplayText(), scheduleSavingErrorDto.getModalTitleDisplay(), scheduleSavingErrorDto.getModalSubtextDisplay());
    }

    /* JADX INFO: renamed from: F */
    private final C0817g m122526F(SleepGoalDto sleepGoalDto) {
        return new C0817g(sleepGoalDto.getSleepGoalTextDisplay(), m122527G(sleepGoalDto.getSleepGoalListDto()), sleepGoalDto.getSleepGoalButtonTextDisplay(), m122521A(sleepGoalDto.getNextState()), null, sleepGoalDto.getHelpIconLink(), 16, null);
    }

    /* JADX INFO: renamed from: G */
    private final List<C0818h> m122527G(List<SleepGoalTypeDto> list) {
        List<SleepGoalTypeDto> list2 = list;
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(list2, 10));
        for (SleepGoalTypeDto sleepGoalTypeDto : list2) {
            arrayList.add(new C0818h(sleepGoalTypeDto.getSleepGoalLabelToggledDisplay(), sleepGoalTypeDto.getSleepGoalLabelNotToggledDisplay(), m122528H(sleepGoalTypeDto.getSleepGoalValue()), sleepGoalTypeDto.getToggleSelected()));
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: H */
    private final EnumC0819i m122528H(SleepGoalValueDto sleepGoalValueDto) {
        int i13 = a.f163906e[sleepGoalValueDto.ordinal()];
        if (i13 == 1) {
            return EnumC0819i.PEAK;
        }
        if (i13 == 2) {
            return EnumC0819i.PERFORM;
        }
        if (i13 == 3) {
            return EnumC0819i.GET_BY;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: renamed from: I */
    private final C0820j m122529I(SleepScheduleComponentsDto sleepScheduleComponentsDto) {
        return new C0820j(m122522B(sleepScheduleComponentsDto.getRepeatDays()), m122530J(sleepScheduleComponentsDto.getWakeMode()), m122545n(sleepScheduleComponentsDto), m122526F(sleepScheduleComponentsDto.getSleepGoal()), m122524D(sleepScheduleComponentsDto.getScheduleSaveSuccessModal()), m122524D(sleepScheduleComponentsDto.getScheduleSavingModal()), m122525E(sleepScheduleComponentsDto.getScheduleSaveErrorModal()), null, null, 384, null);
    }

    /* JADX INFO: renamed from: J */
    private final C0821k m122530J(WakeModeDto wakeModeDto) {
        return new C0821k(wakeModeDto.getAlarmModeLabelDisplay(), m122555y(wakeModeDto.getAlarmModeTypeList()), wakeModeDto.getHelpIconLink(), null, false, 24, null);
    }

    /* JADX INFO: renamed from: K */
    private final EnumC0812b m122531K(EnumC0812b selectionState) {
        int i13 = a.f163903b[selectionState.ordinal()];
        if (i13 == 1) {
            return EnumC0812b.CURRENT_SCHEDULE;
        }
        if (i13 == 2) {
            return EnumC0812b.UNSCHEDULED;
        }
        if (i13 == 3) {
            return EnumC0812b.OTHER_SCHEDULE;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: renamed from: L */
    private final C0814d m122532L(String dayOfWeek, C0814d repeatDaysDomainObject) {
        List<C0815e> listM1988g = repeatDaysDomainObject.m1988g();
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(listM1988g, 10));
        for (C0815e c0815eM1989b : listM1988g) {
            if (AbstractC22676k.m65745e(c0815eM1989b.getDayOfWeekValue(), dayOfWeek)) {
                c0815eM1989b = C0815e.m1989b(c0815eM1989b, m122531K(c0815eM1989b.getSelectionState()), null, null, 0, 14, null);
            }
            arrayList.add(c0815eM1989b);
        }
        return C0814d.m1982b(repeatDaysDomainObject, null, null, null, arrayList, null, null, 55, null);
    }

    /* JADX INFO: renamed from: f */
    private final AbstractC38237f m122538f(AbstractC38235d.b domainAction) {
        if (this.scheduleAlarmEditor.m122512c()) {
            throw new IllegalStateException("Shouldn't be editing repeat days on empty stack");
        }
        C0820j c0820jM122511b = this.scheduleAlarmEditor.m122511b();
        return new AbstractC38237f.e(this.scheduleAlarmEditor.m122515f(C0820j.m2009b(c0820jM122511b, m122532L(domainAction.getDayOfWeek(), c0820jM122511b.getRepeatDays()), null, null, null, null, null, null, null, null, 510, null)).getRepeatDays());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: g */
    public final Object m122539g(InterfaceC30057d<? super AbstractC38237f> interfaceC30057d) {
        b bVar;
        AbstractC38237f abstractC38237fM122551u;
        if (interfaceC30057d instanceof b) {
            bVar = (b) interfaceC30057d;
            int i13 = bVar.f163909y;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                bVar.f163909y = i13 - Integer.MIN_VALUE;
            } else {
                bVar = new b(interfaceC30057d);
            }
        } else {
            bVar = new b(interfaceC30057d);
        }
        Object objM36836h = bVar.f163907w;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = bVar.f163909y;
        if (i14 == 0) {
            AbstractC34132o.m107864I(objM36836h);
            if (!this.whoopStrap.mo106484A().isReady()) {
                return AbstractC38237f.h.f163936a;
            }
            C13151a c13151a = this.sleepCoachScheduleRepository;
            bVar.f163909y = 1;
            objM36836h = c13151a.m36836h(bVar);
            if (objM36836h == enumC31071a) {
                return enumC31071a;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(objM36836h);
        }
        Resource resource = (Resource) objM36836h;
        if (resource.getStatus() != Status.SUCCESS) {
            return AbstractC38237f.b.f163929a;
        }
        SleepScheduleComponentsDto sleepScheduleComponentsDto = (SleepScheduleComponentsDto) resource.getData();
        return (sleepScheduleComponentsDto == null || (abstractC38237fM122551u = m122551u(C0820j.m2009b(m122529I(sleepScheduleComponentsDto), null, null, null, null, null, null, null, EnumC38233b.REPEAT_DAYS, InterfaceC0816f.a.f2993a, 127, null))) == null) ? AbstractC38237f.b.f163929a : abstractC38237fM122551u;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: h */
    public final Object m122540h(String str, InterfaceC30057d<? super AbstractC38237f> interfaceC30057d) {
        c cVar;
        AbstractC38237f abstractC38237fM122551u;
        if (interfaceC30057d instanceof c) {
            cVar = (c) interfaceC30057d;
            int i13 = cVar.f163913z;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                cVar.f163913z = i13 - Integer.MIN_VALUE;
            } else {
                cVar = new c(interfaceC30057d);
            }
        } else {
            cVar = new c(interfaceC30057d);
        }
        Object objM36837i = cVar.f163911x;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = cVar.f163913z;
        if (i14 == 0) {
            AbstractC34132o.m107864I(objM36837i);
            if (!this.whoopStrap.mo106484A().isReady()) {
                return AbstractC38237f.h.f163936a;
            }
            C13151a c13151a = this.sleepCoachScheduleRepository;
            cVar.f163910w = str;
            cVar.f163913z = 1;
            objM36837i = c13151a.m36837i(str, cVar);
            if (objM36837i == enumC31071a) {
                return enumC31071a;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            str = (String) cVar.f163910w;
            AbstractC34132o.m107864I(objM36837i);
        }
        Resource resource = (Resource) objM36837i;
        if (resource.getStatus() != Status.SUCCESS) {
            return AbstractC38237f.b.f163929a;
        }
        SleepScheduleComponentsDto sleepScheduleComponentsDto = (SleepScheduleComponentsDto) resource.getData();
        return (sleepScheduleComponentsDto == null || (abstractC38237fM122551u = m122551u(C0820j.m2009b(m122529I(sleepScheduleComponentsDto), null, null, null, null, null, null, null, EnumC38233b.REPEAT_DAYS, new InterfaceC0816f.b(str), 127, null))) == null) ? AbstractC38237f.b.f163929a : abstractC38237fM122551u;
    }

    /* JADX INFO: renamed from: i */
    private final AbstractC38237f m122541i() {
        return this.scheduleAlarmEditor.m122512c() ? AbstractC38237f.a.f163928a : m122557j(this.scheduleAlarmEditor.m122511b());
    }

    /* JADX INFO: renamed from: k */
    private final EnumC38233b m122542k(C0821k wakeMode, EnumC38232a alarmModeState) {
        for (C0811a c0811a : wakeMode.m2023d()) {
            if (alarmModeState == c0811a.getAlarmModeState()) {
                return c0811a.getNextState();
            }
        }
        throw new NoSuchElementException("Collection contains no element matching the predicate.");
    }

    /* JADX INFO: renamed from: l */
    private final AbstractC38237f m122543l() {
        this.scheduleAlarmEditor.m122513d();
        return this.scheduleAlarmEditor.m122512c() ? AbstractC38237f.a.f163928a : m122557j(this.scheduleAlarmEditor.m122511b());
    }

    /* JADX INFO: renamed from: m */
    private final EnumC0812b m122544m(DaySelectionStateDTO selectionState) {
        int i13 = a.f163905d[selectionState.ordinal()];
        if (i13 == 1) {
            return EnumC0812b.UNSCHEDULED;
        }
        if (i13 == 2) {
            return EnumC0812b.CURRENT_SCHEDULE;
        }
        if (i13 == 3) {
            return EnumC0812b.OTHER_SCHEDULE;
        }
        throw new NoWhenBranchMatchedException();
    }

    /* JADX INFO: renamed from: n */
    private final C0813c m122545n(SleepScheduleComponentsDto sleepScheduleComponentsDto) {
        WakeTimeDto wakeTime = sleepScheduleComponentsDto.getWakeTime();
        String wakeTimeLabelDisplay = wakeTime.getWakeTimeLabelDisplay();
        String wakeTimeSaveButtonLabelDisplay = wakeTime.getWakeTimeSaveButtonLabelDisplay();
        AlarmToWakeTimeTemplateDto sleepGoal = wakeTime.getAlarmToWakeTimeDescriptionMap().getSleepGoal();
        String alarmWakeTimeTemplateDisplay = sleepGoal != null ? sleepGoal.getAlarmWakeTimeTemplateDisplay() : null;
        if (alarmWakeTimeTemplateDisplay == null) {
            alarmWakeTimeTemplateDisplay = "";
        }
        AlarmToWakeTimeTemplateDto inTheGreen = wakeTime.getAlarmToWakeTimeDescriptionMap().getInTheGreen();
        String alarmWakeTimeTemplateDisplay2 = inTheGreen != null ? inTheGreen.getAlarmWakeTimeTemplateDisplay() : null;
        if (alarmWakeTimeTemplateDisplay2 == null) {
            alarmWakeTimeTemplateDisplay2 = "";
        }
        LocalTime localTime = C28204u.INSTANCE.m85368k().parseLocalTime(wakeTime.getLatestWakeTime());
        AbstractC22676k.m65749i(localTime, "parseLocalTime(...)");
        return new C0813c(wakeTimeLabelDisplay, wakeTimeSaveButtonLabelDisplay, alarmWakeTimeTemplateDisplay, alarmWakeTimeTemplateDisplay2, localTime, wakeTime.getHelpIconLink());
    }

    /* JADX INFO: renamed from: o */
    private final AbstractC38237f m122546o(EnumC38232a alarmModeState) {
        Object next;
        if (this.scheduleAlarmEditor.m122512c()) {
            throw new IllegalStateException("Shouldn't be going to next state with empty stack");
        }
        C0820j c0820jM122511b = this.scheduleAlarmEditor.m122511b();
        EnumC0819i sleepGoalValue = null;
        if (alarmModeState == EnumC38232a.SLEEP_GOAL) {
            Iterator<T> it = c0820jM122511b.getSleepGoal().m2001f().iterator();
            do {
                if (!it.hasNext()) {
                    next = null;
                    break;
                }
                next = it.next();
            } while (!((C0818h) next).getToggleSelected());
            C0818h c0818h = (C0818h) next;
            if (c0818h != null) {
                sleepGoalValue = c0818h.getSleepGoalValue();
            }
        }
        C0820j c0820jM2009b = C0820j.m2009b(c0820jM122511b, null, C0821k.m2020b(c0820jM122511b.getWakeMode(), null, null, null, alarmModeState, alarmModeState != EnumC38232a.NO_ALARM, 7, null), null, C0817g.m1996b(c0820jM122511b.getSleepGoal(), null, null, null, null, sleepGoalValue, null, 47, null), null, null, null, null, null, 501, null);
        this.sleepScheduleAnalyticHelper.m119333c(new AbstractC37232a.a(alarmModeState));
        return m122551u(C0820j.m2009b(c0820jM2009b, null, null, null, null, null, null, null, m122542k(c0820jM2009b.getWakeMode(), alarmModeState), null, 383, null));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: p */
    public final Object m122547p(Resource<C23454a0> resource, C0820j c0820j, InterfaceC30057d<? super AbstractC38237f> interfaceC30057d) {
        d dVar;
        if (interfaceC30057d instanceof d) {
            dVar = (d) interfaceC30057d;
            int i13 = dVar.f163914E;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                dVar.f163914E = i13 - Integer.MIN_VALUE;
            } else {
                dVar = new d(interfaceC30057d);
            }
        } else {
            dVar = new d(interfaceC30057d);
        }
        Object objM41161c = dVar.f163917y;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = dVar.f163914E;
        if (i14 == 0) {
            AbstractC34132o.m107864I(objM41161c);
            if (resource.getSuccess()) {
                C14430a c14430a = this.smartAlarmHandler;
                dVar.f163915w = resource;
                dVar.f163916x = c0820j;
                dVar.f163914E = 1;
                objM41161c = c14430a.m41161c(dVar);
                if (objM41161c == enumC31071a) {
                    return enumC31071a;
                }
            }
            this.logger.mo85228t(AbstractC11266d.m30462p("schedule flow result : ", resource.getSuccess()), new AbstractC30556a.a[0]);
            return new AbstractC38237f.f(c0820j.getScheduleSaveErrorModal());
        }
        if (i14 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        c0820j = (C0820j) dVar.f163916x;
        resource = (Resource) dVar.f163915w;
        AbstractC34132o.m107864I(objM41161c);
        if (((Resource) objM41161c).getSuccess()) {
            this.scheduleAlarmEditor.m122510a();
            return new AbstractC38237f.g(c0820j.getScheduleSaveSuccessModal());
        }
        this.logger.mo85228t(AbstractC11266d.m30462p("schedule flow result : ", resource.getSuccess()), new AbstractC30556a.a[0]);
        return new AbstractC38237f.f(c0820j.getScheduleSaveErrorModal());
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: r */
    public final Object m122548r(InterfaceC30057d<? super AbstractC38237f> interfaceC30057d) {
        e eVar;
        if (interfaceC30057d instanceof e) {
            eVar = (e) interfaceC30057d;
            int i13 = eVar.f163921y;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                eVar.f163921y = i13 - Integer.MIN_VALUE;
            } else {
                eVar = new e(interfaceC30057d);
            }
        } else {
            eVar = new e(interfaceC30057d);
        }
        Object obj = eVar.f163919w;
        Object obj2 = EnumC31071a.f128113w;
        int i14 = eVar.f163921y;
        if (i14 == 0) {
            AbstractC34132o.m107864I(obj);
            C13151a c13151a = this.sleepCoachScheduleRepository;
            eVar.f163921y = 1;
            if (c13151a.m36839k(eVar) != obj2) {
            }
        }
        if (i14 != 1) {
            if (i14 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            return obj;
        }
        AbstractC34132o.m107864I(obj);
        eVar.f163921y = 2;
        Object objM122539g = m122539g(eVar);
        return objM122539g == obj2 ? obj2 : objM122539g;
    }

    /* JADX INFO: renamed from: s */
    private final AbstractC38237f m122549s() {
        if (this.scheduleAlarmEditor.m122512c()) {
            throw new IllegalStateException("Shouldn't be going to next state with empty stack");
        }
        C0820j c0820jM122511b = this.scheduleAlarmEditor.m122511b();
        C37233b c37233b = this.sleepScheduleAnalyticHelper;
        List<C0815e> listM1988g = c0820jM122511b.getRepeatDays().m1988g();
        ArrayList arrayList = new ArrayList();
        for (Object obj : listM1988g) {
            if (((C0815e) obj).getSelectionState() == EnumC0812b.CURRENT_SCHEDULE) {
                arrayList.add(obj);
            }
        }
        c37233b.m119333c(new AbstractC37232a.c(arrayList.size()));
        return m122551u(C0820j.m2009b(c0820jM122511b, null, null, null, null, null, null, null, EnumC38233b.WAKE_MODE, null, 383, null));
    }

    /* JADX INFO: renamed from: t */
    private final AbstractC38237f m122550t(LocalTime latestWakeTime) {
        if (this.scheduleAlarmEditor.m122512c()) {
            throw new IllegalStateException("Shouldn't be editing latest wake time on empty stack");
        }
        C0820j c0820jM122511b = this.scheduleAlarmEditor.m122511b();
        return m122557j(this.scheduleAlarmEditor.m122515f(C0820j.m2009b(c0820jM122511b, null, null, C0813c.m1974b(c0820jM122511b.getWakeTime(), null, null, null, null, latestWakeTime, null, 47, null), null, null, null, null, null, null, 507, null)));
    }

    /* JADX INFO: renamed from: u */
    private final AbstractC38237f m122551u(C0820j currentDisplay) {
        return m122557j(this.scheduleAlarmEditor.m122514e(currentDisplay));
    }

    /* JADX INFO: renamed from: v */
    private final AbstractC38237f m122552v(EnumC0819i sleepGoalValue) {
        if (this.scheduleAlarmEditor.m122512c()) {
            throw new IllegalStateException("Shouldn't be editing selecting sleep goal on empty stack");
        }
        C0820j c0820jM122511b = this.scheduleAlarmEditor.m122511b();
        List<C0818h> listM2001f = c0820jM122511b.getSleepGoal().m2001f();
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(listM2001f, 10));
        for (C0818h c0818h : listM2001f) {
            arrayList.add(c0818h.getSleepGoalValue() == sleepGoalValue ? C0818h.m2003b(c0818h, null, null, null, true, 7, null) : C0818h.m2003b(c0818h, null, null, null, false, 7, null));
        }
        return m122557j(this.scheduleAlarmEditor.m122515f(C0820j.m2009b(c0820jM122511b, null, null, null, C0817g.m1996b(c0820jM122511b.getSleepGoal(), null, arrayList, null, null, sleepGoalValue, null, 45, null), null, null, null, null, null, 503, null)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:29:0x00ba A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:39:0x00ee A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX INFO: renamed from: w */
    public final Object m122553w(InterfaceC30057d<? super AbstractC38237f> interfaceC30057d) {
        f fVar;
        C0820j c0820j;
        C38236e c38236e;
        C0820j c0820j2;
        C38236e c38236e2;
        Object objM122547p;
        Object objM122547p2;
        if (interfaceC30057d instanceof f) {
            fVar = (f) interfaceC30057d;
            int i13 = fVar.f163923F;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                fVar.f163923F = i13 - Integer.MIN_VALUE;
            } else {
                fVar = new f(interfaceC30057d);
            }
        } else {
            fVar = new f(interfaceC30057d);
        }
        Object obj = fVar.f163927z;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = fVar.f163923F;
        if (i14 == 0) {
            AbstractC34132o.m107864I(obj);
            C0820j c0820jM122511b = this.scheduleAlarmEditor.m122511b();
            this.sleepScheduleAnalyticHelper.m119333c(new AbstractC37232a.f(c0820jM122511b.getWakeMode().getCurrentSelectedAlarm(), c0820jM122511b.getSleepGoal().getSelectedSleepGoalValue()));
            CreateAlarmScheduleDto createAlarmScheduleDtoM122556z = m122556z(c0820jM122511b);
            InterfaceC0816f scheduleFlow = c0820jM122511b.getScheduleFlow();
            if (AbstractC22676k.m65745e(scheduleFlow, InterfaceC0816f.a.f2993a)) {
                C13151a c13151a = this.sleepCoachScheduleRepository;
                fVar.f163924w = c0820jM122511b;
                fVar.f163925x = null;
                fVar.f163926y = this;
                fVar.f163923F = 1;
                Object objM36833e = c13151a.m36833e(createAlarmScheduleDtoM122556z, fVar);
                if (objM36833e != enumC31071a) {
                    c0820j2 = c0820jM122511b;
                    obj = objM36833e;
                    c38236e2 = this;
                    fVar.f163924w = null;
                    fVar.f163925x = null;
                    fVar.f163926y = null;
                    fVar.f163923F = 2;
                    objM122547p = c38236e2.m122547p((Resource) obj, c0820j2, fVar);
                    if (objM122547p == enumC31071a) {
                        return objM122547p;
                    }
                }
            } else {
                if (!(scheduleFlow instanceof InterfaceC0816f.b)) {
                    throw new NoWhenBranchMatchedException();
                }
                C13151a c13151a2 = this.sleepCoachScheduleRepository;
                String sleepScheduleId = ((InterfaceC0816f.b) c0820jM122511b.getScheduleFlow()).getSleepScheduleId();
                fVar.f163924w = c0820jM122511b;
                fVar.f163925x = null;
                fVar.f163926y = this;
                fVar.f163923F = 3;
                Object objM36835g = c13151a2.m36835g(sleepScheduleId, createAlarmScheduleDtoM122556z, fVar);
                if (objM36835g != enumC31071a) {
                    c0820j = c0820jM122511b;
                    obj = objM36835g;
                    c38236e = this;
                    fVar.f163924w = null;
                    fVar.f163925x = null;
                    fVar.f163926y = null;
                    fVar.f163923F = 4;
                    objM122547p2 = c38236e.m122547p((Resource) obj, c0820j, fVar);
                    if (objM122547p2 == enumC31071a) {
                        return objM122547p2;
                    }
                }
            }
        } else {
            if (i14 != 1) {
                if (i14 != 2) {
                    if (i14 == 3) {
                        c38236e = (C38236e) fVar.f163926y;
                        c0820j = (C0820j) fVar.f163924w;
                        AbstractC34132o.m107864I(obj);
                        fVar.f163924w = null;
                        fVar.f163925x = null;
                        fVar.f163926y = null;
                        fVar.f163923F = 4;
                        objM122547p2 = c38236e.m122547p((Resource) obj, c0820j, fVar);
                        if (objM122547p2 == enumC31071a) {
                            return objM122547p2;
                        }
                    } else if (i14 != 4) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                }
                AbstractC34132o.m107864I(obj);
                return obj;
            }
            c38236e2 = (C38236e) fVar.f163926y;
            c0820j2 = (C0820j) fVar.f163924w;
            AbstractC34132o.m107864I(obj);
            fVar.f163924w = null;
            fVar.f163925x = null;
            fVar.f163926y = null;
            fVar.f163923F = 2;
            objM122547p = c38236e2.m122547p((Resource) obj, c0820j2, fVar);
            if (objM122547p == enumC31071a) {
                return objM122547p;
            }
        }
        return enumC31071a;
    }

    /* JADX INFO: renamed from: x */
    private final AbstractC38237f m122554x() {
        if (this.scheduleAlarmEditor.m122512c()) {
            throw new IllegalStateException("Shouldn't be going to next state with empty stack");
        }
        return m122551u(C0820j.m2009b(this.scheduleAlarmEditor.m122511b(), null, null, null, null, null, null, null, EnumC38233b.WAKE_TIME, null, 383, null));
    }

    /* JADX INFO: renamed from: y */
    private final List<C0811a> m122555y(List<AlarmModeTypeDto> list) {
        List<AlarmModeTypeDto> list2 = list;
        ArrayList arrayList = new ArrayList(AbstractC25267u.m74163i0(list2, 10));
        for (AlarmModeTypeDto alarmModeTypeDto : list2) {
            arrayList.add(new C0811a(alarmModeTypeDto.getAlarmModeTypeLabelDisplay(), alarmModeTypeDto.getAlarmModeTypeDescriptionTextDisplay(), m122521A(alarmModeTypeDto.getNextState()), EnumC38232a.INSTANCE.m122509a(alarmModeTypeDto.getAlarmModeValue())));
        }
        return arrayList;
    }

    /* JADX INFO: renamed from: z */
    private final CreateAlarmScheduleDto m122556z(C0820j c0820j) {
        String string;
        String string2 = c0820j.getWakeTime().getLatestWakeTime().toString(C28204u.INSTANCE.m85368k());
        AbstractC22676k.m65749i(string2, "toString(...)");
        String strValueOf = String.valueOf(c0820j.getWakeMode().getCurrentSelectedAlarm());
        boolean isAlarmEnabled = c0820j.getWakeMode().getIsAlarmEnabled();
        List<C0815e> listM1988g = c0820j.getRepeatDays().m1988g();
        ArrayList arrayList = new ArrayList();
        for (Object obj : listM1988g) {
            if (((C0815e) obj).getSelectionState() == EnumC0812b.CURRENT_SCHEDULE) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(AbstractC25267u.m74163i0(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((C0815e) it.next()).getDayOfWeekValue());
        }
        EnumC0819i selectedSleepGoalValue = c0820j.getSleepGoal().getSelectedSleepGoalValue();
        if (selectedSleepGoalValue == null || (string = selectedSleepGoalValue.toString()) == null) {
            string = "";
        }
        String str = string;
        String strM85305c = AbstractC28184n0.m85305c(c0820j.getWakeTime().getLatestWakeTime().toDateTimeToday());
        AbstractC22676k.m65749i(strM85305c, "dateTimeZoneToUserOffset(...)");
        return new CreateAlarmScheduleDto(string2, strValueOf, isAlarmEnabled, arrayList2, str, strM85305c);
    }

    /* JADX INFO: renamed from: j */
    public final AbstractC38237f m122557j(C0820j topOfStack) {
        AbstractC22676k.m65750j(topOfStack, "topOfStack");
        int i13 = a.f163902a[topOfStack.getCurrentDisplay().ordinal()];
        if (i13 == 1) {
            return new AbstractC38237f.e(topOfStack.getRepeatDays());
        }
        if (i13 == 2) {
            return new AbstractC38237f.j(topOfStack.getWakeMode());
        }
        if (i13 != 3) {
            if (i13 == 4) {
                return new AbstractC38237f.i(topOfStack.getSleepGoal());
            }
            throw new NoWhenBranchMatchedException();
        }
        C0813c wakeTime = topOfStack.getWakeTime();
        EnumC38232a currentSelectedAlarm = topOfStack.getWakeMode().getCurrentSelectedAlarm();
        if (currentSelectedAlarm == null) {
            currentSelectedAlarm = EnumC38232a.NO_ALARM;
        }
        return new AbstractC38237f.c(wakeTime, currentSelectedAlarm);
    }

    /* JADX INFO: renamed from: q */
    public final Object m122558q(AbstractC38235d abstractC38235d, InterfaceC30057d<? super AbstractC38237f> interfaceC30057d) {
        if (AbstractC22676k.m65745e(abstractC38235d, AbstractC38235d.c.f163883a)) {
            return m122539g(interfaceC30057d);
        }
        if (AbstractC22676k.m65745e(abstractC38235d, AbstractC38235d.m.f163893a)) {
            return m122543l();
        }
        if (AbstractC22676k.m65745e(abstractC38235d, AbstractC38235d.j.f163890a)) {
            return new AbstractC38237f.d(this.scheduleAlarmEditor.m122511b().getScheduleSavingModal());
        }
        if (AbstractC22676k.m65745e(abstractC38235d, AbstractC38235d.g.f163887a)) {
            return m122549s();
        }
        if (AbstractC22676k.m65745e(abstractC38235d, AbstractC38235d.i.f163889a)) {
            return m122554x();
        }
        if (AbstractC22676k.m65745e(abstractC38235d, AbstractC38235d.h.f163888a)) {
            return m122553w(interfaceC30057d);
        }
        if (AbstractC22676k.m65745e(abstractC38235d, AbstractC38235d.l.f163892a)) {
            return AbstractC38237f.a.f163928a;
        }
        if (AbstractC22676k.m65745e(abstractC38235d, AbstractC38235d.a.f163881a)) {
            return m122541i();
        }
        if (AbstractC22676k.m65745e(abstractC38235d, AbstractC38235d.e.f163885a)) {
            return AbstractC38237f.a.f163928a;
        }
        if (AbstractC22676k.m65745e(abstractC38235d, AbstractC38235d.f.f163886a)) {
            return m122548r(interfaceC30057d);
        }
        if (abstractC38235d instanceof AbstractC38235d.b) {
            return m122538f((AbstractC38235d.b) abstractC38235d);
        }
        if (abstractC38235d instanceof AbstractC38235d.n) {
            return m122546o(((AbstractC38235d.n) abstractC38235d).getAlarmModeState());
        }
        if (abstractC38235d instanceof AbstractC38235d.k) {
            return m122552v(((AbstractC38235d.k) abstractC38235d).getSleepGoalState());
        }
        if (abstractC38235d instanceof AbstractC38235d.o) {
            return m122550t(((AbstractC38235d.o) abstractC38235d).getLatestWakeTime());
        }
        if (abstractC38235d instanceof AbstractC38235d.d) {
            return m122540h(((AbstractC38235d.d) abstractC38235d).getScheduleId(), interfaceC30057d);
        }
        throw new NoWhenBranchMatchedException();
    }
}
