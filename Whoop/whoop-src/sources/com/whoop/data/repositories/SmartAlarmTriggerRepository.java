package com.whoop.data.repositories;

import a11.C0129g;
import bc3.AbstractC3006f0;
import bc3.InterfaceC2994c0;
import c93.InterfaceC4351m;
import ca2.InterfaceC4371k;
import com.whoop.coaching.sleepcoach.harvard.worker.PostLatestWakeTimeWorker;
import com.whoop.data.local.room.entity.SmartAlarmUserInfo;
import com.whoop.data.onboarding.C6529c;
import com.whoop.data.remote.domain.dto.DayOfWeekType;
import com.whoop.data.remote.domain.dto.SmartAlarmUserInfoDtoKt;
import com.whoop.domain.model.Login;
import com.whoop.domain.model.Logout;
import com.whoop.domain.model.UserSwitchEvent;
import com.whoop.sleep.coach.data.network.api.SleepCoachApi;
import com.whoop.sleep.coach.data.network.model.AlarmOverrideDto;
import com.whoop.smart.alarm.data.network.api.SmartAlarmApi;
import com.whoop.smart.alarm.data.network.model.StrapLatestWakeTimeDto;
import com.whoop.smart.alarm.data.util.SmartAlarmException;
import ec3.InterfaceC13058l;
import ec3.InterfaceC13062m;
import ec3.InterfaceC13087t1;
import ek0.C13272a0;
import ey1.EnumC13749f;
import ey1.EnumC13750g;
import f82.EnumC14250a;
import f82.EnumC14251b;
import g82.InterfaceC15574a;
import hj0.AbstractC17355n;
import in2.InterfaceC18732d;
import in2.InterfaceC18735g;
import in2.InterfaceC18736h;
import iy1.InterfaceC21030c;
import java.util.List;
import jy1.C22047a;
import kp0.C22738e;
import l73.AbstractC23416g;
import l83.C23454a0;
import mi1.AbstractC25573b;
import mi1.InterfaceC25576e;
import n73.InterfaceC26443b;
import od1.InterfaceC27837a0;
import org.joda.time.DateTime;
import org.joda.time.Duration;
import org.joda.time.Hours;
import org.joda.time.Instant;
import org.joda.time.LocalDate;
import org.joda.time.LocalTime;
import org.joda.time.Minutes;
import p000.AbstractC11266d;
import p088dc.AbstractC11895b;
import p218ic.AbstractC18377p0;
import p505ts.AbstractC34132o;
import p715kotlin.Metadata;
import p715kotlin.NoWhenBranchMatchedException;
import p715kotlin.jvm.functions.Function1;
import p715kotlin.jvm.functions.Function3;
import p715kotlin.jvm.internal.AbstractC22676k;
import p715kotlin.jvm.internal.DefaultConstructorMarker;
import pg3.C29218v0;
import q73.EnumC30025d;
import q83.InterfaceC30057d;
import qf2.AbstractC30325d;
import qf2.C30322a;
import qf2.C30324c;
import qr2.AbstractC30556a;
import r80.AbstractC31061c;
import r83.EnumC31071a;
import rf2.InterfaceC31359a;
import rr2.InterfaceC31766c;
import s83.AbstractC32269c;
import s83.AbstractC32275i;
import s83.InterfaceC32271e;
import td1.EnumC33707e;
import td1.InterfaceC33704b;
import tf2.AbstractC33767a;
import tr2.InterfaceC34116n;
import wb3.AbstractC37056f;
import wm0.C37378a;
import xg3.AbstractC38284k;
import yb3.AbstractC39414r;
import zj0.C40727h;
import zr2.InterfaceC41070a;

/* JADX INFO: loaded from: classes.dex */
@Metadata(m65680d1 = {"\u0000\u0092\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u0000 \u0097\u00012\u00020\u00012\u00020\u0002:\u0002\u0097\u0001B»\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0010\u0010\u0010\u001a\f\u0012\u0004\u0012\u00020\u000e0\rj\u0002`\u000f\u0012\u0010\u0010\u0014\u001a\f\u0012\u0004\u0012\u00020\u00120\u0011j\u0002`\u0013\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\u0006\u0010\u0018\u001a\u00020\u0017\u0012\u0006\u0010\u001a\u001a\u00020\u0019\u0012\u0006\u0010\u001c\u001a\u00020\u001b\u0012\u0006\u0010\u001e\u001a\u00020\u001d\u0012\u0006\u0010 \u001a\u00020\u001f\u0012\u0006\u0010\"\u001a\u00020!\u0012\u0006\u0010$\u001a\u00020#\u0012\u0006\u0010&\u001a\u00020%\u0012\u0006\u0010(\u001a\u00020'\u0012\u0006\u0010*\u001a\u00020)\u0012\u0006\u0010,\u001a\u00020+\u0012\u0006\u0010.\u001a\u00020-¢\u0006\u0004\b/\u00100J\r\u00102\u001a\u000201¢\u0006\u0004\b2\u00103J\u001a\u00107\u001a\u0002062\b\u00105\u001a\u0004\u0018\u000104H\u0086@¢\u0006\u0004\b7\u00108J\r\u00109\u001a\u000201¢\u0006\u0004\b9\u00103J\u0017\u0010;\u001a\u0002012\b\b\u0002\u0010:\u001a\u000206¢\u0006\u0004\b;\u0010<J\u001f\u0010@\u001a\u0002042\u0006\u0010>\u001a\u00020=2\u0006\u0010?\u001a\u000204H\u0007¢\u0006\u0004\b@\u0010AJ\u0010\u0010B\u001a\u000201H\u0087@¢\u0006\u0004\bB\u0010CJ\u0017\u0010E\u001a\u0002062\u0006\u0010D\u001a\u00020=H\u0007¢\u0006\u0004\bE\u0010FJ\u000f\u0010G\u001a\u000201H\u0016¢\u0006\u0004\bG\u00103J\u0010\u0010H\u001a\u000201H\u0082@¢\u0006\u0004\bH\u0010CJ\u000f\u0010I\u001a\u000201H\u0002¢\u0006\u0004\bI\u00103J\u0010\u0010J\u001a\u000201H\u0082@¢\u0006\u0004\bJ\u0010CJ\"\u0010M\u001a\u0002062\u0006\u0010L\u001a\u00020K2\b\b\u0002\u0010:\u001a\u000206H\u0082@¢\u0006\u0004\bM\u0010NJ\u0018\u0010O\u001a\u0002012\u0006\u0010>\u001a\u00020=H\u0082@¢\u0006\u0004\bO\u0010PJ\u0012\u0010Q\u001a\u0004\u0018\u000106H\u0082@¢\u0006\u0004\bQ\u0010CJ\u0010\u0010R\u001a\u000206H\u0082@¢\u0006\u0004\bR\u0010CJ\u0017\u0010U\u001a\u0002012\u0006\u0010T\u001a\u00020SH\u0002¢\u0006\u0004\bU\u0010VJ\u000f\u0010W\u001a\u000201H\u0002¢\u0006\u0004\bW\u00103J\u0010\u0010X\u001a\u000201H\u0082@¢\u0006\u0004\bX\u0010CJ\u0012\u0010Y\u001a\u0004\u0018\u00010=H\u0082@¢\u0006\u0004\bY\u0010CJ(\u0010`\u001a\u0002012\u0006\u0010[\u001a\u00020Z2\u0006\u0010]\u001a\u00020\\2\u0006\u0010_\u001a\u00020^H\u0082@¢\u0006\u0004\b`\u0010aJ\u0010\u0010b\u001a\u000206H\u0082@¢\u0006\u0004\bb\u0010CJ\u001f\u0010g\u001a\u0002062\u0006\u0010d\u001a\u00020c2\u0006\u0010f\u001a\u00020eH\u0002¢\u0006\u0004\bg\u0010hJ\u0017\u0010k\u001a\u00020j2\u0006\u0010i\u001a\u00020cH\u0002¢\u0006\u0004\bk\u0010lJ\u0010\u0010m\u001a\u00020SH\u0082@¢\u0006\u0004\bm\u0010CJ\u0010\u0010n\u001a\u000206H\u0082@¢\u0006\u0004\bn\u0010CJ\u001f\u0010p\u001a\u0002012\u0006\u0010D\u001a\u00020=2\u0006\u0010o\u001a\u000206H\u0002¢\u0006\u0004\bp\u0010qJ\u0017\u0010o\u001a\u0002062\u0006\u0010D\u001a\u00020=H\u0002¢\u0006\u0004\bo\u0010FJ7\u0010x\u001a\u0002012\b\b\u0002\u0010s\u001a\u00020r2\u0006\u0010t\u001a\u00020\\2\b\b\u0002\u0010u\u001a\u00020K2\n\b\u0002\u0010w\u001a\u0004\u0018\u00010vH\u0002¢\u0006\u0004\bx\u0010yJ)\u0010~\u001a\u0002012\u0006\u0010z\u001a\u00020K2\u0010\b\u0002\u0010}\u001a\n\u0018\u00010{j\u0004\u0018\u0001`|H\u0002¢\u0006\u0004\b~\u0010\u007fJ\u0012\u0010\u0080\u0001\u001a\u000201H\u0082@¢\u0006\u0005\b\u0080\u0001\u0010CJ\u0012\u0010\u0081\u0001\u001a\u000201H\u0082@¢\u0006\u0005\b\u0081\u0001\u0010CJ\u0012\u0010\u0082\u0001\u001a\u000201H\u0082@¢\u0006\u0005\b\u0082\u0001\u0010CR\u0015\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0004\u0010\u0083\u0001R\u0015\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0006\u0010\u0084\u0001R\u0015\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\f\u0010\u0085\u0001R\u001f\u0010\u0010\u001a\f\u0012\u0004\u0012\u00020\u000e0\rj\u0002`\u000f8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0010\u0010\u0086\u0001R\u001f\u0010\u0014\u001a\f\u0012\u0004\u0012\u00020\u00120\u0011j\u0002`\u00138\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0014\u0010\u0087\u0001R\u0015\u0010\u0016\u001a\u00020\u00158\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0016\u0010\u0088\u0001R\u0015\u0010\u0018\u001a\u00020\u00178\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u0018\u0010\u0089\u0001R\u0015\u0010\u001a\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u001a\u0010\u008a\u0001R\u0015\u0010\u001c\u001a\u00020\u001b8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u001c\u0010\u008b\u0001R\u0015\u0010\u001e\u001a\u00020\u001d8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\u001e\u0010\u008c\u0001R\u0015\u0010 \u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b \u0010\u008d\u0001R\u0015\u0010\"\u001a\u00020!8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b\"\u0010\u008e\u0001R\u0015\u0010&\u001a\u00020%8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b&\u0010\u008f\u0001R\u0015\u0010(\u001a\u00020'8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b(\u0010\u0090\u0001R\u0015\u0010*\u001a\u00020)8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b*\u0010\u0091\u0001R\u0015\u0010,\u001a\u00020+8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b,\u0010\u0092\u0001R\u0015\u0010.\u001a\u00020-8\u0002X\u0082\u0004¢\u0006\u0007\n\u0005\b.\u0010\u0093\u0001R\u001a\u0010\u0095\u0001\u001a\u00030\u0094\u00018\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0095\u0001\u0010\u0096\u0001¨\u0006\u0098\u0001"}, m65681d2 = {"Lcom/whoop/data/repositories/SmartAlarmTriggerRepository;", "Lhj0/n;", "Lca2/k;", "Lcom/whoop/data/repositories/FeatureFlagRepository;", "featureFlagRepository", "Lg82/a;", "smartAlarmDiagnosticDbHelper", "Ltr2/n;", "log", "Lrr2/c;", "crashReporter", "Lcom/whoop/smart/alarm/data/network/api/SmartAlarmApi;", "smartAlarmApi", "Lin2/h;", "Lxg3/k;", "Lcom/whoop/ui/util/SchedulerFactory;", "schedulerFactory", "Lin2/g;", "Ll73/g;", "Lcom/whoop/ui/util/RxJava2SchedulerFactory;", "rxJava2SchedulerFactory", "Lbc3/c0;", "applicationScope", "Lrf2/a;", "smartAlarmUserInfoDao", "Lqf2/c;", "lwtResetRepository", "Lod1/a0;", "userSessionManager", "Ltd1/b;", "whoopStrap", "Lkp0/e;", "highFrequencySyncModeStateHolder", "Lic/p0;", "workManager", "Lin2/d;", "dispatcherFactory", "Lzr2/a;", "dateAndTimeProvider", "Liy1/c;", "metricWriter", "Lwm0/a;", "scopeCoordinator", "Lcom/whoop/sleep/coach/data/network/api/SleepCoachApi;", "sleepCoachApi", "Lmi1/e;", "smartAlarmHapticsWrapper", "<init>", "(Lcom/whoop/data/repositories/FeatureFlagRepository;Lg82/a;Ltr2/n;Lrr2/c;Lcom/whoop/smart/alarm/data/network/api/SmartAlarmApi;Lin2/h;Lin2/g;Lbc3/c0;Lrf2/a;Lqf2/c;Lod1/a0;Ltd1/b;Lkp0/e;Lic/p0;Lin2/d;Lzr2/a;Liy1/c;Lwm0/a;Lcom/whoop/sleep/coach/data/network/api/SleepCoachApi;Lmi1/e;)V", "Ll83/a0;", "start", "()V", "Lorg/joda/time/DateTime;", "alarmPushTriggered", "", "triggerSmartAlarmFromPush", "(Lorg/joda/time/DateTime;Lq83/d;)Ljava/lang/Object;", "onTimeZoneChanged", "checkWakeWindow", "pollSmartAlarmTrigger", "(Z)V", "Lcom/whoop/data/local/room/entity/SmartAlarmUserInfo;", "alarmInfo", "now", "getCalculatedLatestWakeTime", "(Lcom/whoop/data/local/room/entity/SmartAlarmUserInfo;Lorg/joda/time/DateTime;)Lorg/joda/time/DateTime;", "updateAlarmUserInfoWithSchedule", "(Lq83/d;)Ljava/lang/Object;", "smartAlarmUserInfo", "isHighFrequencySyncModeWindowOpen", "(Lcom/whoop/data/local/room/entity/SmartAlarmUserInfo;)Z", "onSyncAttempted", "disableAlarmOnStrapWhenAlarmWasDisabled", "doWorkOnCycleFetch", "fetchAndCacheSmartAlarmUserInfo", "", "tag", "resetLwt", "(Ljava/lang/String;ZLq83/d;)Ljava/lang/Object;", "updateTimeZoneWhenOutOfSync", "(Lcom/whoop/data/local/room/entity/SmartAlarmUserInfo;Lq83/d;)Ljava/lang/Object;", "alarmEnabledOnStrap", "disableAlarmOnStrap", "Lorg/joda/time/Instant;", "newLwt", "reportLwtReset", "(Lorg/joda/time/Instant;)V", "initListeningForAlarmRelatedStrapEvents", "alarmRelatedEventsWork", "getSmartAlarmUserInfo", "Lsf2/a;", "alarmId", "Lf82/b;", "trigger", "Ley1/g;", "datadogTriggerAction", "runAlarm", "(Lsf2/a;Lf82/b;Ley1/g;Lq83/d;)Ljava/lang/Object;", "exitHighFrequencySyncModeOnStrap", "Lcom/whoop/data/remote/domain/dto/DayOfWeekType;", "dayOfWeek", "Lorg/joda/time/LocalTime;", "upperBoundLocalTime", "shouldFetchAndCacheSmartAlarmUserInfo", "(Lcom/whoop/data/remote/domain/dto/DayOfWeekType;Lorg/joda/time/LocalTime;)Z", "dayOfWeekType", "", "dayOfWeekTypeConversion", "(Lcom/whoop/data/remote/domain/dto/DayOfWeekType;)I", "enterHighFrequencySyncModeOnStrap", "enterHighFreq", "alarmTypeRequiresPolling", "checkHighFrequencyMode", "(Lcom/whoop/data/local/room/entity/SmartAlarmUserInfo;Z)V", "Lf82/a;", "smartAlarmEventType", "smartAlarmTrigger", "phoneSetAlarmTimeMillis", "Lzj0/h;", "responsePacket", "saveSmartAlarmDiagnosticEvents", "(Lf82/a;Lf82/b;Ljava/lang/String;Lzj0/h;)V", "message", "Ljava/lang/Exception;", "Lkotlin/Exception;", "cause", "handledException", "(Ljava/lang/String;Ljava/lang/Exception;)V", "disableHighFrequencyMode", "insertResetLwtMetrics", "insertUpdateFromStaleCacheMetrics", "Lcom/whoop/data/repositories/FeatureFlagRepository;", "Lg82/a;", "Lcom/whoop/smart/alarm/data/network/api/SmartAlarmApi;", "Lin2/h;", "Lin2/g;", "Lbc3/c0;", "Lrf2/a;", "Lqf2/c;", "Lod1/a0;", "Ltd1/b;", "Lkp0/e;", "Lic/p0;", "Lzr2/a;", "Liy1/c;", "Lwm0/a;", "Lcom/whoop/sleep/coach/data/network/api/SleepCoachApi;", "Lmi1/e;", "Ln73/b;", "listenForStrapDrivenAlarm", "Ln73/b;", "Companion", "app_prodStandardRelease"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
public final class SmartAlarmTriggerRepository extends AbstractC17355n implements InterfaceC4371k {
    public static final String DEFAULT_REFRESH_SCOPE = "cycle";
    private static final Duration HIGH_FREQ_SYNC_MODE_DURATION;
    public static final String SMART_ALARM_DISABLE_HIGH_FREQUENCY = "DisableHighFrequency";
    public static final String SMART_ALARM_REFRESH = "SmartAlarmRefresh";
    private static final Duration WAKE_WINDOW_SLOP_TIME;
    private static final List<String> scopeListenerList;
    private final InterfaceC2994c0 applicationScope;
    private final InterfaceC41070a dateAndTimeProvider;
    private final FeatureFlagRepository featureFlagRepository;
    private final C22738e highFrequencySyncModeStateHolder;
    private InterfaceC26443b listenForStrapDrivenAlarm;
    private final C30324c lwtResetRepository;
    private final InterfaceC21030c metricWriter;
    private final InterfaceC18735g<AbstractC23416g> rxJava2SchedulerFactory;
    private final InterfaceC18736h<AbstractC38284k> schedulerFactory;
    private final C37378a scopeCoordinator;
    private final SleepCoachApi sleepCoachApi;
    private final SmartAlarmApi smartAlarmApi;
    private final InterfaceC15574a smartAlarmDiagnosticDbHelper;
    private final InterfaceC25576e smartAlarmHapticsWrapper;
    private final InterfaceC31359a smartAlarmUserInfoDao;
    private final InterfaceC27837a0 userSessionManager;
    private final InterfaceC33704b whoopStrap;
    private final AbstractC18377p0 workManager;

    /* JADX INFO: renamed from: Companion, reason: from kotlin metadata */
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Metadata(m65680d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u0016\u0010\b\u001a\n \t*\u0004\u0018\u00010\u00050\u0005X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u000bX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000bX\u0086T¢\u0006\u0002\n\u0000R\u0017\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000b0\u000f¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, m65681d2 = {"Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$Companion;", "", "<init>", "()V", "WAKE_WINDOW_SLOP_TIME", "Lorg/joda/time/Duration;", "getWAKE_WINDOW_SLOP_TIME", "()Lorg/joda/time/Duration;", "HIGH_FREQ_SYNC_MODE_DURATION", "kotlin.jvm.PlatformType", "SMART_ALARM_REFRESH", "", "SMART_ALARM_DISABLE_HIGH_FREQUENCY", "DEFAULT_REFRESH_SCOPE", "scopeListenerList", "", "getScopeListenerList", "()Ljava/util/List;", "app_prodStandardRelease"}, m65682k = 1, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final List<String> getScopeListenerList() {
            return SmartAlarmTriggerRepository.scopeListenerList;
        }

        public final Duration getWAKE_WINDOW_SLOP_TIME() {
            return SmartAlarmTriggerRepository.WAKE_WINDOW_SLOP_TIME;
        }

        private Companion() {
        }
    }

    /* JADX INFO: loaded from: classes8.dex */
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[EnumC14251b.values().length];
            try {
                iArr[EnumC14251b.LONG_REQUEST_POLL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[EnumC14251b.SMART_ALARM_PUSH.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[DayOfWeekType.values().length];
            try {
                iArr2[DayOfWeekType.MONDAY.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[DayOfWeekType.TUESDAY.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[DayOfWeekType.WEDNESDAY.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[DayOfWeekType.THURSDAY.ordinal()] = 4;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[DayOfWeekType.FRIDAY.ordinal()] = 5;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[DayOfWeekType.SATURDAY.ordinal()] = 6;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr2[DayOfWeekType.SUNDAY.ordinal()] = 7;
            } catch (NoSuchFieldError unused9) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    /* JADX INFO: renamed from: com.whoop.data.repositories.SmartAlarmTriggerRepository$alarmEnabledOnStrap$1 */
    /* JADX INFO: loaded from: classes8.dex */
    @InterfaceC32271e(m100429c = "com.whoop.data.repositories.SmartAlarmTriggerRepository", m100430f = "SmartAlarmTriggerRepository.kt", m100431l = {461}, m100432m = "alarmEnabledOnStrap", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class C66101 extends AbstractC32269c {
        int label;
        /* synthetic */ Object result;

        public C66101(InterfaceC30057d<? super C66101> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return SmartAlarmTriggerRepository.this.alarmEnabledOnStrap(this);
        }
    }

    /* JADX INFO: renamed from: com.whoop.data.repositories.SmartAlarmTriggerRepository$alarmRelatedEventsWork$1 */
    /* JADX INFO: loaded from: classes8.dex */
    @InterfaceC32271e(m100429c = "com.whoop.data.repositories.SmartAlarmTriggerRepository", m100430f = "SmartAlarmTriggerRepository.kt", m100431l = {503, 513, 520}, m100432m = "alarmRelatedEventsWork", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class C66111 extends AbstractC32269c {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public C66111(InterfaceC30057d<? super C66111> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return SmartAlarmTriggerRepository.this.alarmRelatedEventsWork(this);
        }
    }

    /* JADX INFO: renamed from: com.whoop.data.repositories.SmartAlarmTriggerRepository$checkHighFrequencyMode$1 */
    @InterfaceC32271e(m100429c = "com.whoop.data.repositories.SmartAlarmTriggerRepository$checkHighFrequencyMode$1", m100430f = "SmartAlarmTriggerRepository.kt", m100431l = {858, 862, 863, 866, 868, 872, 873}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C66121 extends AbstractC32275i implements InterfaceC4351m {
        final /* synthetic */ boolean $alarmTypeRequiresPolling;
        final /* synthetic */ SmartAlarmUserInfo $smartAlarmUserInfo;
        int I$0;
        Object L$0;
        Object L$1;
        Object L$2;
        boolean Z$0;
        boolean Z$1;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C66121(boolean z4, SmartAlarmUserInfo smartAlarmUserInfo, InterfaceC30057d<? super C66121> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.$alarmTypeRequiresPolling = z4;
            this.$smartAlarmUserInfo = smartAlarmUserInfo;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return SmartAlarmTriggerRepository.this.new C66121(this.$alarmTypeRequiresPolling, this.$smartAlarmUserInfo, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((C66121) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Code duplicated, block: B:17:0x005b  */
        /* JADX WARN: Code duplicated, block: B:33:0x00b2 A[PHI: r1 r7
          0x00b2: PHI (r1v8 boolean) = (r1v5 boolean), (r1v9 boolean) binds: [B:31:0x00af, B:7:0x001b] A[DONT_GENERATE, DONT_INLINE]
          0x00b2: PHI (r7v18 java.lang.Object) = (r7v11 java.lang.Object), (r7v0 java.lang.Object) binds: [B:31:0x00af, B:7:0x001b] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:35:0x00ba  */
        /* JADX WARN: Code duplicated, block: B:38:0x00d5  */
        /* JADX WARN: Code duplicated, block: B:40:0x00db  */
        /* JADX WARN: Code duplicated, block: B:43:0x00e9 A[PHI: r7
          0x00e9: PHI (r7v24 java.lang.Object) = (r7v8 java.lang.Object), (r7v0 java.lang.Object) binds: [B:41:0x00e6, B:6:0x0012] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:45:0x00f1  */
        /* JADX WARN: Code restructure failed: missing block: B:25:0x0097, code lost:
        
            if (r2.m65823c((org.joda.time.Instant) r7, r6) == r0) goto L47;
         */
        /* JADX WARN: Code restructure failed: missing block: B:36:0x00d2, code lost:
        
            if (r4.m65823c(r5, r6) == r0) goto L47;
         */
        /* JADX WARN: Code restructure failed: missing block: B:46:0x0105, code lost:
        
            if (r7.m65823c(r1, r6) == r0) goto L47;
         */
        @Override // s83.AbstractC32267a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r7) {
            /*
                Method dump skipped, instruction units count: 288
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.whoop.data.repositories.SmartAlarmTriggerRepository.C66121.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: com.whoop.data.repositories.SmartAlarmTriggerRepository$disableAlarmOnStrap$1 */
    /* JADX INFO: loaded from: classes8.dex */
    @InterfaceC32271e(m100429c = "com.whoop.data.repositories.SmartAlarmTriggerRepository", m100430f = "SmartAlarmTriggerRepository.kt", m100431l = {468}, m100432m = "disableAlarmOnStrap", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class C66131 extends AbstractC32269c {
        int label;
        /* synthetic */ Object result;

        public C66131(InterfaceC30057d<? super C66131> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return SmartAlarmTriggerRepository.this.disableAlarmOnStrap(this);
        }
    }

    /* JADX INFO: renamed from: com.whoop.data.repositories.SmartAlarmTriggerRepository$disableAlarmOnStrapWhenAlarmWasDisabled$1 */
    /* JADX INFO: loaded from: classes8.dex */
    @InterfaceC32271e(m100429c = "com.whoop.data.repositories.SmartAlarmTriggerRepository", m100430f = "SmartAlarmTriggerRepository.kt", m100431l = {180, 182, 196, 198, 201, 210}, m100432m = "disableAlarmOnStrapWhenAlarmWasDisabled", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class C66141 extends AbstractC32269c {
        Object L$0;
        Object L$1;
        boolean Z$0;
        int label;
        /* synthetic */ Object result;

        public C66141(InterfaceC30057d<? super C66141> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return SmartAlarmTriggerRepository.this.disableAlarmOnStrapWhenAlarmWasDisabled(this);
        }
    }

    /* JADX INFO: renamed from: com.whoop.data.repositories.SmartAlarmTriggerRepository$disableAlarmOnStrapWhenAlarmWasDisabled$2 */
    /* JADX INFO: loaded from: classes8.dex */
    @InterfaceC32271e(m100429c = "com.whoop.data.repositories.SmartAlarmTriggerRepository$disableAlarmOnStrapWhenAlarmWasDisabled$2", m100430f = "SmartAlarmTriggerRepository.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\u0018\u0010\u0005\u001a\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u0000\u0012\u0004\u0012\u00020\u00030\u0002j\u0002`\u0004H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m65681d2 = {"Lqf2/d;", "<unused var>", "Lkotlin/Function1;", "Ll83/a0;", "Lcom/whoop/smart/alarm/data/repository/SetLwtTo;", "setLwtTo", "<anonymous>", "(Lqf2/d;Lkotlin/jvm/functions/Function1;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C66152 extends AbstractC32275i implements Function3 {
        /* synthetic */ Object L$0;
        int label;

        public C66152(InterfaceC30057d<? super C66152> interfaceC30057d) {
            super(3, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            Function1 function1 = (Function1) this.L$0;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
            function1.invoke(C30322a.f124400a);
            return C23454a0.f92919a;
        }

        @Override // p715kotlin.jvm.functions.Function3
        public final Object invoke(AbstractC30325d abstractC30325d, Function1 function1, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            C66152 c66152 = new C66152(interfaceC30057d);
            c66152.L$0 = function1;
            return c66152.invokeSuspend(C23454a0.f92919a);
        }
    }

    /* JADX INFO: renamed from: com.whoop.data.repositories.SmartAlarmTriggerRepository$disableHighFrequencyMode$1 */
    /* JADX INFO: loaded from: classes8.dex */
    @InterfaceC32271e(m100429c = "com.whoop.data.repositories.SmartAlarmTriggerRepository", m100430f = "SmartAlarmTriggerRepository.kt", m100431l = {921, 923}, m100432m = "disableHighFrequencyMode", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class C66161 extends AbstractC32269c {
        int I$0;
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public C66161(InterfaceC30057d<? super C66161> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return SmartAlarmTriggerRepository.this.disableHighFrequencyMode(this);
        }
    }

    /* JADX INFO: renamed from: com.whoop.data.repositories.SmartAlarmTriggerRepository$doWorkOnCycleFetch$1 */
    /* JADX INFO: loaded from: classes8.dex */
    @InterfaceC32271e(m100429c = "com.whoop.data.repositories.SmartAlarmTriggerRepository$doWorkOnCycleFetch$1", m100430f = "SmartAlarmTriggerRepository.kt", m100431l = {225, 235}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C66171 extends AbstractC32275i implements InterfaceC4351m {
        Object L$0;
        Object L$1;
        int label;

        public C66171(InterfaceC30057d<? super C66171> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return SmartAlarmTriggerRepository.this.new C66171(interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((C66171) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.label;
            C23454a0 c23454a0 = C23454a0.f92919a;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                SmartAlarmTriggerRepository smartAlarmTriggerRepository = SmartAlarmTriggerRepository.this;
                this.label = 1;
                obj = smartAlarmTriggerRepository.getSmartAlarmUserInfo(this);
                if (obj != enumC31071a) {
                }
            }
            if (i13 != 1) {
                if (i13 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
                return c23454a0;
            }
            AbstractC34132o.m107864I(obj);
            SmartAlarmUserInfo smartAlarmUserInfo = (SmartAlarmUserInfo) obj;
            DateTime dateTimeMinusHours = DateTime.now().minusHours(24);
            if (smartAlarmUserInfo != null && SmartAlarmTriggerRepository.this.listenForStrapDrivenAlarm.isDisposed()) {
                SmartAlarmTriggerRepository.this.initListeningForAlarmRelatedStrapEvents();
            }
            if (smartAlarmUserInfo != null && smartAlarmUserInfo.getLastUpdatedAt().isAfter(dateTimeMinusHours)) {
                SmartAlarmTriggerRepository.this.getLogger().mo85232x("WakeWindow", "cycles fetch: last fetch of smart alarm user info is below 24hrs", new AbstractC30556a.a[0]);
                return c23454a0;
            }
            SmartAlarmTriggerRepository smartAlarmTriggerRepository2 = SmartAlarmTriggerRepository.this;
            this.L$0 = null;
            this.L$1 = null;
            this.label = 2;
            return smartAlarmTriggerRepository2.fetchAndCacheSmartAlarmUserInfo(this) == enumC31071a ? enumC31071a : c23454a0;
        }
    }

    /* JADX INFO: renamed from: com.whoop.data.repositories.SmartAlarmTriggerRepository$doWorkOnCycleFetch$2 */
    /* JADX INFO: loaded from: classes8.dex */
    @InterfaceC32271e(m100429c = "com.whoop.data.repositories.SmartAlarmTriggerRepository$doWorkOnCycleFetch$2", m100430f = "SmartAlarmTriggerRepository.kt", m100431l = {239}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C66182 extends AbstractC32275i implements InterfaceC4351m {
        int label;

        public C66182(InterfaceC30057d<? super C66182> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return SmartAlarmTriggerRepository.this.new C66182(interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((C66182) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            C66182 c66182;
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.label;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                SmartAlarmTriggerRepository smartAlarmTriggerRepository = SmartAlarmTriggerRepository.this;
                this.label = 1;
                c66182 = this;
                obj = SmartAlarmTriggerRepository.resetLwt$default(smartAlarmTriggerRepository, "cyclesfetch", false, c66182, 2, null);
                if (obj == enumC31071a) {
                    return enumC31071a;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
                c66182 = this;
            }
            SmartAlarmTriggerRepository.this.getLogger().mo85228t(AbstractC11266d.m30462p("resetLwt success: ", ((Boolean) obj).booleanValue()), new AbstractC30556a.a[0]);
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: com.whoop.data.repositories.SmartAlarmTriggerRepository$enterHighFrequencySyncModeOnStrap$1 */
    /* JADX INFO: loaded from: classes8.dex */
    @InterfaceC32271e(m100429c = "com.whoop.data.repositories.SmartAlarmTriggerRepository", m100430f = "SmartAlarmTriggerRepository.kt", m100431l = {839}, m100432m = "enterHighFrequencySyncModeOnStrap", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class C66191 extends AbstractC32269c {
        int label;
        /* synthetic */ Object result;

        public C66191(InterfaceC30057d<? super C66191> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return SmartAlarmTriggerRepository.this.enterHighFrequencySyncModeOnStrap(this);
        }
    }

    /* JADX INFO: renamed from: com.whoop.data.repositories.SmartAlarmTriggerRepository$exitHighFrequencySyncModeOnStrap$1 */
    /* JADX INFO: loaded from: classes8.dex */
    @InterfaceC32271e(m100429c = "com.whoop.data.repositories.SmartAlarmTriggerRepository", m100430f = "SmartAlarmTriggerRepository.kt", m100431l = {648}, m100432m = "exitHighFrequencySyncModeOnStrap", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class C66201 extends AbstractC32269c {
        int label;
        /* synthetic */ Object result;

        public C66201(InterfaceC30057d<? super C66201> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return SmartAlarmTriggerRepository.this.exitHighFrequencySyncModeOnStrap(this);
        }
    }

    /* JADX INFO: renamed from: com.whoop.data.repositories.SmartAlarmTriggerRepository$fetchAndCacheSmartAlarmUserInfo$1 */
    /* JADX INFO: loaded from: classes8.dex */
    @InterfaceC32271e(m100429c = "com.whoop.data.repositories.SmartAlarmTriggerRepository", m100430f = "SmartAlarmTriggerRepository.kt", m100431l = {246, 253}, m100432m = "fetchAndCacheSmartAlarmUserInfo", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class C66211 extends AbstractC32269c {
        Object L$0;
        int label;
        /* synthetic */ Object result;

        public C66211(InterfaceC30057d<? super C66211> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return SmartAlarmTriggerRepository.this.fetchAndCacheSmartAlarmUserInfo(this);
        }
    }

    /* JADX INFO: renamed from: com.whoop.data.repositories.SmartAlarmTriggerRepository$getSmartAlarmUserInfo$1 */
    @InterfaceC32271e(m100429c = "com.whoop.data.repositories.SmartAlarmTriggerRepository", m100430f = "SmartAlarmTriggerRepository.kt", m100431l = {528}, m100432m = "getSmartAlarmUserInfo", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class C66221 extends AbstractC32269c {
        int label;
        /* synthetic */ Object result;

        public C66221(InterfaceC30057d<? super C66221> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return SmartAlarmTriggerRepository.this.getSmartAlarmUserInfo(this);
        }
    }

    /* JADX INFO: renamed from: com.whoop.data.repositories.SmartAlarmTriggerRepository$initListeningForAlarmRelatedStrapEvents$1 */
    @InterfaceC32271e(m100429c = "com.whoop.data.repositories.SmartAlarmTriggerRepository$initListeningForAlarmRelatedStrapEvents$1", m100430f = "SmartAlarmTriggerRepository.kt", m100431l = {495}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C66231 extends AbstractC32275i implements InterfaceC4351m {
        int label;

        public C66231(InterfaceC30057d<? super C66231> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return SmartAlarmTriggerRepository.this.new C66231(interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((C66231) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.label;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                final InterfaceC13058l interfaceC13058lMo75202f = SmartAlarmTriggerRepository.this.smartAlarmHapticsWrapper.mo75202f();
                InterfaceC13058l interfaceC13058l = new InterfaceC13058l() { // from class: com.whoop.data.repositories.SmartAlarmTriggerRepository$initListeningForAlarmRelatedStrapEvents$1$invokeSuspend$$inlined$filterIsInstance$1

                    /* JADX INFO: renamed from: com.whoop.data.repositories.SmartAlarmTriggerRepository$initListeningForAlarmRelatedStrapEvents$1$invokeSuspend$$inlined$filterIsInstance$1$2, reason: invalid class name */
                    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
                    public static final class AnonymousClass2<T> implements InterfaceC13062m {
                        final /* synthetic */ InterfaceC13062m $this_unsafeFlow;

                        /* JADX INFO: renamed from: com.whoop.data.repositories.SmartAlarmTriggerRepository$initListeningForAlarmRelatedStrapEvents$1$invokeSuspend$$inlined$filterIsInstance$1$2$1, reason: invalid class name */
                        /* JADX INFO: loaded from: classes8.dex */
                        @InterfaceC32271e(m100429c = "com.whoop.data.repositories.SmartAlarmTriggerRepository$initListeningForAlarmRelatedStrapEvents$1$invokeSuspend$$inlined$filterIsInstance$1$2", m100430f = "SmartAlarmTriggerRepository.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
                        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
                        public static final class AnonymousClass1 extends AbstractC32269c {
                            int I$0;
                            Object L$0;
                            Object L$1;
                            Object L$2;
                            Object L$3;
                            int label;
                            /* synthetic */ Object result;

                            public AnonymousClass1(InterfaceC30057d interfaceC30057d) {
                                super(interfaceC30057d);
                            }

                            @Override // s83.AbstractC32267a
                            public final Object invokeSuspend(Object obj) {
                                this.result = obj;
                                this.label |= Integer.MIN_VALUE;
                                return AnonymousClass2.this.emit(null, this);
                            }
                        }

                        public AnonymousClass2(InterfaceC13062m interfaceC13062m) {
                            this.$this_unsafeFlow = interfaceC13062m;
                        }

                        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                        @Override // ec3.InterfaceC13062m
                        public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                            AnonymousClass1 anonymousClass1;
                            if (interfaceC30057d instanceof AnonymousClass1) {
                                anonymousClass1 = (AnonymousClass1) interfaceC30057d;
                                int i13 = anonymousClass1.label;
                                if ((i13 & Integer.MIN_VALUE) != 0) {
                                    anonymousClass1.label = i13 - Integer.MIN_VALUE;
                                } else {
                                    anonymousClass1 = new AnonymousClass1(interfaceC30057d);
                                }
                            } else {
                                anonymousClass1 = new AnonymousClass1(interfaceC30057d);
                            }
                            Object obj2 = anonymousClass1.result;
                            EnumC31071a enumC31071a = EnumC31071a.f128113w;
                            int i14 = anonymousClass1.label;
                            if (i14 == 0) {
                                AbstractC34132o.m107864I(obj2);
                                InterfaceC13062m interfaceC13062m = this.$this_unsafeFlow;
                                if (obj instanceof C13272a0) {
                                    anonymousClass1.L$0 = null;
                                    anonymousClass1.L$1 = null;
                                    anonymousClass1.L$2 = null;
                                    anonymousClass1.L$3 = null;
                                    anonymousClass1.I$0 = 0;
                                    anonymousClass1.label = 1;
                                    if (interfaceC13062m.emit(obj, anonymousClass1) == enumC31071a) {
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

                    @Override // ec3.InterfaceC13058l
                    public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
                        Object objCollect = interfaceC13058lMo75202f.collect(new AnonymousClass2(interfaceC13062m), interfaceC30057d);
                        return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
                    }
                };
                final SmartAlarmTriggerRepository smartAlarmTriggerRepository = SmartAlarmTriggerRepository.this;
                InterfaceC13062m interfaceC13062m = new InterfaceC13062m() { // from class: com.whoop.data.repositories.SmartAlarmTriggerRepository.initListeningForAlarmRelatedStrapEvents.1.1
                    @Override // ec3.InterfaceC13062m
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, InterfaceC30057d interfaceC30057d) {
                        return emit((C13272a0) obj2, (InterfaceC30057d<? super C23454a0>) interfaceC30057d);
                    }

                    public final Object emit(C13272a0 c13272a0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
                        Object objAlarmRelatedEventsWork = smartAlarmTriggerRepository.alarmRelatedEventsWork(interfaceC30057d);
                        return objAlarmRelatedEventsWork == EnumC31071a.f128113w ? objAlarmRelatedEventsWork : C23454a0.f92919a;
                    }
                };
                this.label = 1;
                if (interfaceC13058l.collect(interfaceC13062m, this) == enumC31071a) {
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

    /* JADX INFO: renamed from: com.whoop.data.repositories.SmartAlarmTriggerRepository$insertResetLwtMetrics$1 */
    /* JADX INFO: loaded from: classes8.dex */
    @InterfaceC32271e(m100429c = "com.whoop.data.repositories.SmartAlarmTriggerRepository", m100430f = "SmartAlarmTriggerRepository.kt", m100431l = {929}, m100432m = "insertResetLwtMetrics", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class C66251 extends AbstractC32269c {
        int label;
        /* synthetic */ Object result;

        public C66251(InterfaceC30057d<? super C66251> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return SmartAlarmTriggerRepository.this.insertResetLwtMetrics(this);
        }
    }

    /* JADX INFO: renamed from: com.whoop.data.repositories.SmartAlarmTriggerRepository$onTimeZoneChanged$1 */
    /* JADX INFO: loaded from: classes8.dex */
    @InterfaceC32271e(m100429c = "com.whoop.data.repositories.SmartAlarmTriggerRepository$onTimeZoneChanged$1", m100430f = "SmartAlarmTriggerRepository.kt", m100431l = {669}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C66261 extends AbstractC32275i implements InterfaceC4351m {
        Object L$0;
        int label;

        /* JADX INFO: renamed from: com.whoop.data.repositories.SmartAlarmTriggerRepository$onTimeZoneChanged$1$1, reason: invalid class name */
        @InterfaceC32271e(m100429c = "com.whoop.data.repositories.SmartAlarmTriggerRepository$onTimeZoneChanged$1$1", m100430f = "SmartAlarmTriggerRepository.kt", m100431l = {}, m100432m = "invokeSuspend", m100433v = 2)
        @Metadata(m65680d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\u0018\u0010\u0005\u001a\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u0000\u0012\u0004\u0012\u00020\u00030\u0002j\u0002`\u0004H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, m65681d2 = {"Lqf2/d;", "<unused var>", "Lkotlin/Function1;", "Ll83/a0;", "Lcom/whoop/smart/alarm/data/repository/SetLwtTo;", "setLwtTo", "<anonymous>", "(Lqf2/d;Lkotlin/jvm/functions/Function1;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
        public static final class AnonymousClass1 extends AbstractC32275i implements Function3 {
            /* synthetic */ Object L$0;
            int label;

            public AnonymousClass1(InterfaceC30057d<? super AnonymousClass1> interfaceC30057d) {
                super(3, interfaceC30057d);
            }

            @Override // s83.AbstractC32267a
            public final Object invokeSuspend(Object obj) {
                Function1 function1 = (Function1) this.L$0;
                EnumC31071a enumC31071a = EnumC31071a.f128113w;
                if (this.label != 0) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
                function1.invoke(null);
                return C23454a0.f92919a;
            }

            @Override // p715kotlin.jvm.functions.Function3
            public final Object invoke(AbstractC30325d abstractC30325d, Function1 function1, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(interfaceC30057d);
                anonymousClass1.L$0 = function1;
                return anonymousClass1.invokeSuspend(C23454a0.f92919a);
            }
        }

        public C66261(InterfaceC30057d<? super C66261> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return SmartAlarmTriggerRepository.this.new C66261(interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((C66261) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.label;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                SmartAlarmTriggerRepository.this.getLogger().mo85232x("WakeWindow", "Time zone change detected. Setting LWT repository value to null in order\nto trigger a reset of the strap's latest wake time.", new AbstractC30556a.a[0]);
                C30324c c30324c = SmartAlarmTriggerRepository.this.lwtResetRepository;
                AnonymousClass1 anonymousClass1 = new AnonymousClass1(null);
                this.L$0 = null;
                this.label = 1;
                if (c30324c.m92669g(anonymousClass1, this) == enumC31071a) {
                    return enumC31071a;
                }
            } else {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
            }
            SmartAlarmTriggerRepository.this.pollSmartAlarmTrigger(false);
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: com.whoop.data.repositories.SmartAlarmTriggerRepository$pollSmartAlarmTrigger$1 */
    @InterfaceC32271e(m100429c = "com.whoop.data.repositories.SmartAlarmTriggerRepository$pollSmartAlarmTrigger$1", m100430f = "SmartAlarmTriggerRepository.kt", m100431l = {688, 697, 700, 705, 715, 728, 733, 734}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C66271 extends AbstractC32275i implements InterfaceC4351m {
        Object L$0;
        Object L$1;
        Object L$2;
        boolean Z$0;
        int label;

        public C66271(InterfaceC30057d<? super C66271> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return SmartAlarmTriggerRepository.this.new C66271(interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((C66271) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        /* JADX WARN: Code duplicated, block: B:25:0x00b6 A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:26:0x00b7  */
        /* JADX WARN: Code duplicated, block: B:28:0x00c4  */
        /* JADX WARN: Code duplicated, block: B:30:0x00ca  */
        /* JADX WARN: Code duplicated, block: B:31:0x00cd  */
        /* JADX WARN: Code duplicated, block: B:34:0x00e1  */
        /* JADX WARN: Code duplicated, block: B:36:0x00eb  */
        /* JADX WARN: Code duplicated, block: B:39:0x0106  */
        /* JADX WARN: Code duplicated, block: B:44:0x0131  */
        /* JADX WARN: Code duplicated, block: B:45:0x0133 A[Catch: Exception -> 0x0162, PHI: r3 r4 r10
          0x0133: PHI (r3v32 java.lang.Object) = (r3v29 java.lang.Object), (r3v42 java.lang.Object) binds: [B:43:0x012f, B:17:0x0087] A[DONT_GENERATE, DONT_INLINE]
          0x0133: PHI (r4v11 sf2.a) = (r4v30 sf2.a), (r4v31 sf2.a) binds: [B:43:0x012f, B:17:0x0087] A[DONT_GENERATE, DONT_INLINE]
          0x0133: PHI (r10v15 boolean) = (r10v24 boolean), (r10v18 boolean) binds: [B:43:0x012f, B:17:0x0087] A[DONT_GENERATE, DONT_INLINE], TryCatch #0 {Exception -> 0x0162, blocks: (B:45:0x0133, B:47:0x0156, B:49:0x015a, B:52:0x0166, B:53:0x016d, B:54:0x016e, B:42:0x010f), top: B:83:0x010f }] */
        /* JADX WARN: Code duplicated, block: B:47:0x0156 A[Catch: Exception -> 0x0162, TryCatch #0 {Exception -> 0x0162, blocks: (B:45:0x0133, B:47:0x0156, B:49:0x015a, B:52:0x0166, B:53:0x016d, B:54:0x016e, B:42:0x010f), top: B:83:0x010f }] */
        /* JADX WARN: Code duplicated, block: B:49:0x015a A[Catch: Exception -> 0x0162, TryCatch #0 {Exception -> 0x0162, blocks: (B:45:0x0133, B:47:0x0156, B:49:0x015a, B:52:0x0166, B:53:0x016d, B:54:0x016e, B:42:0x010f), top: B:83:0x010f }] */
        /* JADX WARN: Code duplicated, block: B:52:0x0166 A[Catch: Exception -> 0x0162, TryCatch #0 {Exception -> 0x0162, blocks: (B:45:0x0133, B:47:0x0156, B:49:0x015a, B:52:0x0166, B:53:0x016d, B:54:0x016e, B:42:0x010f), top: B:83:0x010f }] */
        /* JADX WARN: Code duplicated, block: B:54:0x016e A[Catch: Exception -> 0x0162, TRY_LEAVE, TryCatch #0 {Exception -> 0x0162, blocks: (B:45:0x0133, B:47:0x0156, B:49:0x015a, B:52:0x0166, B:53:0x016d, B:54:0x016e, B:42:0x010f), top: B:83:0x010f }] */
        /* JADX WARN: Code duplicated, block: B:57:0x01b0  */
        /* JADX WARN: Code duplicated, block: B:65:0x01fe A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:66:0x01ff  */
        /* JADX WARN: Code duplicated, block: B:68:0x0205  */
        /* JADX WARN: Code duplicated, block: B:71:0x0236  */
        /* JADX WARN: Code duplicated, block: B:72:0x0244  */
        /* JADX WARN: Code duplicated, block: B:73:0x0245 A[PHI: r10 r11
          0x0245: PHI (r10v9 boolean) = (r10v26 boolean), (r10v27 boolean) binds: [B:35:0x00e9, B:72:0x0244] A[DONT_GENERATE, DONT_INLINE]
          0x0245: PHI (r11v5 sf2.a) = (r11v13 sf2.a), (r11v8 sf2.a) binds: [B:35:0x00e9, B:72:0x0244] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:76:0x0260 A[PHI: r0 r3
          0x0260: PHI (r0v44 boolean) = (r0v55 boolean), (r0v56 boolean) binds: [B:74:0x025d, B:7:0x0029] A[DONT_GENERATE, DONT_INLINE]
          0x0260: PHI (r3v47 java.lang.Object) = (r3v20 java.lang.Object), (r3v56 java.lang.Object) binds: [B:74:0x025d, B:7:0x0029] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:78:0x0268  */
        /* JADX WARN: Code duplicated, block: B:80:0x029a A[RETURN] */
        /* JADX WARN: Code duplicated, block: B:83:0x010f A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Code restructure failed: missing block: B:60:0x01e5, code lost:
        
            if (r10.mo58700a(r11, r20) == r2) goto L80;
         */
        /* JADX WARN: Code restructure failed: missing block: B:79:0x0298, code lost:
        
            if (r3.mo58700a(r10, r20) == r2) goto L80;
         */
        /* JADX WARN: Instruction removed from duplicated block: B:45:0x0133, please report this as an issue */
        /* JADX WARN: Instruction removed from duplicated block: B:54:0x016e, please report this as an issue */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v13 */
        /* JADX WARN: Type inference failed for: r0v2 */
        /* JADX WARN: Type inference failed for: r0v21 */
        /* JADX WARN: Type inference failed for: r0v3, types: [boolean] */
        /* JADX WARN: Type inference failed for: r0v57 */
        /* JADX WARN: Type inference failed for: r0v58 */
        /* JADX WARN: Type inference failed for: r10v19 */
        /* JADX WARN: Type inference failed for: r10v2, types: [boolean] */
        /* JADX WARN: Type inference failed for: r10v22 */
        /* JADX WARN: Type inference failed for: r10v23 */
        /* JADX WARN: Type inference failed for: r10v3 */
        /* JADX WARN: Type inference failed for: r10v6 */
        /* JADX WARN: Type inference failed for: r4v0 */
        /* JADX WARN: Type inference failed for: r4v1, types: [java.lang.Object] */
        /* JADX WARN: Type inference failed for: r4v2, types: [sf2.a] */
        /* JADX WARN: Type inference failed for: r4v22 */
        /* JADX WARN: Type inference failed for: r4v23 */
        /* JADX WARN: Type inference failed for: r4v24 */
        /* JADX WARN: Type inference failed for: r4v25 */
        /* JADX WARN: Type inference failed for: r4v26 */
        /* JADX WARN: Type inference failed for: r4v27 */
        /* JADX WARN: Type inference failed for: r4v3 */
        /* JADX WARN: Type inference failed for: r4v33 */
        /* JADX WARN: Type inference failed for: r4v4 */
        @Override // s83.AbstractC32267a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r21) {
            /*
                Method dump skipped, instruction units count: 704
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.whoop.data.repositories.SmartAlarmTriggerRepository.C66271.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: com.whoop.data.repositories.SmartAlarmTriggerRepository$pollSmartAlarmTrigger$2 */
    @InterfaceC32271e(m100429c = "com.whoop.data.repositories.SmartAlarmTriggerRepository$pollSmartAlarmTrigger$2", m100430f = "SmartAlarmTriggerRepository.kt", m100431l = {746, 747}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C66282 extends AbstractC32275i implements InterfaceC4351m {
        final /* synthetic */ boolean $checkWakeWindow;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C66282(boolean z4, InterfaceC30057d<? super C66282> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.$checkWakeWindow = z4;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return SmartAlarmTriggerRepository.this.new C66282(this.$checkWakeWindow, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((C66282) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0036, code lost:
        
            if (r5 == r0) goto L15;
         */
        @Override // s83.AbstractC32267a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r5) {
            /*
                r4 = this;
                r83.a r0 = r83.EnumC31071a.f128113w
                int r1 = r4.label
                r2 = 2
                r3 = 1
                if (r1 == 0) goto L1c
                if (r1 == r3) goto L18
                if (r1 != r2) goto L10
                p505ts.AbstractC34132o.m107864I(r5)
                goto L39
            L10:
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r0)
                throw r5
            L18:
                p505ts.AbstractC34132o.m107864I(r5)
                goto L2a
            L1c:
                p505ts.AbstractC34132o.m107864I(r5)
                com.whoop.data.repositories.SmartAlarmTriggerRepository r5 = com.whoop.data.repositories.SmartAlarmTriggerRepository.this
                r4.label = r3
                java.lang.Object r5 = r5.updateAlarmUserInfoWithSchedule(r4)
                if (r5 != r0) goto L2a
                goto L38
            L2a:
                com.whoop.data.repositories.SmartAlarmTriggerRepository r5 = com.whoop.data.repositories.SmartAlarmTriggerRepository.this
                boolean r1 = r4.$checkWakeWindow
                r4.label = r2
                java.lang.String r2 = "poll"
                java.lang.Object r5 = com.whoop.data.repositories.SmartAlarmTriggerRepository.access$resetLwt(r5, r2, r1, r4)
                if (r5 != r0) goto L39
            L38:
                return r0
            L39:
                java.lang.Boolean r5 = (java.lang.Boolean) r5
                boolean r5 = r5.booleanValue()
                com.whoop.data.repositories.SmartAlarmTriggerRepository r0 = com.whoop.data.repositories.SmartAlarmTriggerRepository.this
                tr2.n r0 = com.whoop.data.repositories.SmartAlarmTriggerRepository.access$getLogger(r0)
                java.lang.String r1 = "reset lwt on metrics upload success? "
                java.lang.String r5 = p000.AbstractC11266d.m30462p(r1, r5)
                r1 = 0
                qr2.a$a[] r1 = new qr2.AbstractC30556a.a[r1]
                r0.mo85228t(r5, r1)
                l83.a0 r5 = l83.C23454a0.f92919a
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: com.whoop.data.repositories.SmartAlarmTriggerRepository.C66282.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: com.whoop.data.repositories.SmartAlarmTriggerRepository$reportLwtReset$1 */
    @InterfaceC32271e(m100429c = "com.whoop.data.repositories.SmartAlarmTriggerRepository$reportLwtReset$1", m100430f = "SmartAlarmTriggerRepository.kt", m100431l = {482}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C66291 extends AbstractC32275i implements InterfaceC4351m {
        final /* synthetic */ StrapLatestWakeTimeDto $dto;
        final /* synthetic */ Instant $newLwt;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C66291(StrapLatestWakeTimeDto strapLatestWakeTimeDto, Instant instant, InterfaceC30057d<? super C66291> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.$dto = strapLatestWakeTimeDto;
            this.$newLwt = instant;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return SmartAlarmTriggerRepository.this.new C66291(this.$dto, this.$newLwt, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((C66291) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.label;
            try {
                if (i13 == 0) {
                    AbstractC34132o.m107864I(obj);
                    SmartAlarmApi smartAlarmApi = SmartAlarmTriggerRepository.this.smartAlarmApi;
                    StrapLatestWakeTimeDto strapLatestWakeTimeDto = this.$dto;
                    this.label = 1;
                    if (smartAlarmApi.putNewStrapLatestWakeTime(strapLatestWakeTimeDto, this) == enumC31071a) {
                        return enumC31071a;
                    }
                } else {
                    if (i13 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    AbstractC34132o.m107864I(obj);
                }
            } catch (Exception e5) {
                SmartAlarmTriggerRepository.this.logRetrofitSuspendException(e5, "WakeWindow Failed to update backend with strap's latest wake time");
                PostLatestWakeTimeWorker.INSTANCE.m18570b(SmartAlarmTriggerRepository.this.workManager, this.$newLwt);
            }
            return C23454a0.f92919a;
        }
    }

    /* JADX INFO: renamed from: com.whoop.data.repositories.SmartAlarmTriggerRepository$resetLwt$1 */
    @InterfaceC32271e(m100429c = "com.whoop.data.repositories.SmartAlarmTriggerRepository", m100430f = "SmartAlarmTriggerRepository.kt", m100431l = {263, 267, 273, 274, 275, 279, 285}, m100432m = "resetLwt", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class C66301 extends AbstractC32269c {
        int I$0;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        boolean Z$0;
        int label;
        /* synthetic */ Object result;

        public C66301(InterfaceC30057d<? super C66301> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return SmartAlarmTriggerRepository.this.resetLwt(null, false, this);
        }
    }

    /* JADX INFO: renamed from: com.whoop.data.repositories.SmartAlarmTriggerRepository$resetLwt$3 */
    @InterfaceC32271e(m100429c = "com.whoop.data.repositories.SmartAlarmTriggerRepository$resetLwt$3", m100430f = "SmartAlarmTriggerRepository.kt", m100431l = {287, 297, 314, 325, 335, 345, 358, 382, 394, 397, 411}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0007\u001a\u00020\u00062\b\u0010\u0001\u001a\u0004\u0018\u00010\u00002\u0018\u0010\u0005\u001a\u0014\u0012\u0006\u0012\u0004\u0018\u00010\u0000\u0012\u0004\u0012\u00020\u00030\u0002j\u0002`\u0004H\n¢\u0006\u0004\b\u0007\u0010\b"}, m65681d2 = {"Lqf2/d;", "lwtState", "Lkotlin/Function1;", "Ll83/a0;", "Lcom/whoop/smart/alarm/data/repository/SetLwtTo;", "setLwtTo", "", "<anonymous>", "(Lqf2/d;Lkotlin/jvm/functions/Function1;)Z"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C66313 extends AbstractC32275i implements Function3 {
        final /* synthetic */ boolean $checkWakeWindow;
        final /* synthetic */ SmartAlarmUserInfo $smartAlarmInfo;
        int I$0;
        /* synthetic */ Object L$0;
        /* synthetic */ Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        Object L$5;
        Object L$6;
        Object L$7;
        boolean Z$0;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C66313(SmartAlarmUserInfo smartAlarmUserInfo, boolean z4, InterfaceC30057d<? super C66313> interfaceC30057d) {
            super(3, interfaceC30057d);
            this.$smartAlarmInfo = smartAlarmUserInfo;
            this.$checkWakeWindow = z4;
        }

        /* JADX WARN: Code duplicated, block: B:101:0x0504  */
        /* JADX WARN: Code duplicated, block: B:28:0x0158  */
        /* JADX WARN: Code duplicated, block: B:29:0x015a  */
        /* JADX WARN: Code duplicated, block: B:31:0x015e  */
        /* JADX WARN: Code duplicated, block: B:32:0x0166  */
        /* JADX WARN: Code duplicated, block: B:36:0x0171  */
        /* JADX WARN: Code duplicated, block: B:37:0x0173  */
        /* JADX WARN: Code duplicated, block: B:40:0x01a2  */
        /* JADX WARN: Code duplicated, block: B:45:0x01e7  */
        /* JADX WARN: Code duplicated, block: B:47:0x01ef  */
        /* JADX WARN: Code duplicated, block: B:50:0x0224  */
        /* JADX WARN: Code duplicated, block: B:52:0x0239  */
        /* JADX WARN: Code duplicated, block: B:57:0x0251  */
        /* JADX WARN: Code duplicated, block: B:59:0x0275  */
        /* JADX WARN: Code duplicated, block: B:62:0x02af  */
        /* JADX WARN: Code duplicated, block: B:65:0x02cc  */
        /* JADX WARN: Code duplicated, block: B:74:0x034e  */
        /* JADX WARN: Code duplicated, block: B:76:0x0360  */
        /* JADX WARN: Code duplicated, block: B:78:0x038d  */
        /* JADX WARN: Code duplicated, block: B:80:0x0393  */
        /* JADX WARN: Code duplicated, block: B:85:0x03e9  */
        /* JADX WARN: Code duplicated, block: B:88:0x043b  */
        /* JADX WARN: Code duplicated, block: B:91:0x0444  */
        /* JADX WARN: Code duplicated, block: B:96:0x049d  */
        /* JADX WARN: Code restructure failed: missing block: B:20:0x012f, code lost:
        
            if (r1.mo58700a(r10, r26) == r3) goto L98;
         */
        /* JADX WARN: Code restructure failed: missing block: B:41:0x01d3, code lost:
        
            if (r1.mo58700a(r10, r26) == r3) goto L98;
         */
        /* JADX WARN: Code restructure failed: missing block: B:53:0x024a, code lost:
        
            if (r1.disableAlarmOnStrapWhenAlarmWasDisabled(r26) == r3) goto L98;
         */
        /* JADX WARN: Code restructure failed: missing block: B:70:0x033a, code lost:
        
            if (r1.mo58700a(r18, r26) == r3) goto L98;
         */
        /* JADX WARN: Code restructure failed: missing block: B:81:0x03d5, code lost:
        
            if (r1.mo58700a(r18, r26) == r3) goto L98;
         */
        /* JADX WARN: Code restructure failed: missing block: B:92:0x048a, code lost:
        
            if (r2.mo58700a(r18, r26) == r3) goto L98;
         */
        /* JADX WARN: Code restructure failed: missing block: B:97:0x04fe, code lost:
        
            if (r2.mo58700a(r18, r26) == r3) goto L98;
         */
        /* JADX WARN: Instruction removed from duplicated block: B:76:0x0360, please report this as an issue */
        /* JADX WARN: Instruction removed from duplicated block: B:85:0x03e9, please report this as an issue */
        @Override // s83.AbstractC32267a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r27) throws java.io.IOException {
            /*
                Method dump skipped, instruction units count: 1318
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.whoop.data.repositories.SmartAlarmTriggerRepository.C66313.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // p715kotlin.jvm.functions.Function3
        public final Object invoke(AbstractC30325d abstractC30325d, Function1 function1, InterfaceC30057d<? super Boolean> interfaceC30057d) {
            C66313 c66313 = SmartAlarmTriggerRepository.this.new C66313(this.$smartAlarmInfo, this.$checkWakeWindow, interfaceC30057d);
            c66313.L$0 = abstractC30325d;
            c66313.L$1 = function1;
            return c66313.invokeSuspend(C23454a0.f92919a);
        }
    }

    /* JADX INFO: renamed from: com.whoop.data.repositories.SmartAlarmTriggerRepository$runAlarm$1 */
    /* JADX INFO: loaded from: classes8.dex */
    @InterfaceC32271e(m100429c = "com.whoop.data.repositories.SmartAlarmTriggerRepository", m100430f = "SmartAlarmTriggerRepository.kt", m100431l = {595, 599, 607, 616, 618, 627, 630}, m100432m = "runAlarm", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class C66321 extends AbstractC32269c {
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        boolean Z$0;
        int label;
        /* synthetic */ Object result;

        public C66321(InterfaceC30057d<? super C66321> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return SmartAlarmTriggerRepository.this.runAlarm(null, null, null, this);
        }
    }

    /* JADX INFO: renamed from: com.whoop.data.repositories.SmartAlarmTriggerRepository$runAlarm$2 */
    /* JADX INFO: loaded from: classes8.dex */
    @InterfaceC32271e(m100429c = "com.whoop.data.repositories.SmartAlarmTriggerRepository$runAlarm$2", m100430f = "SmartAlarmTriggerRepository.kt", m100431l = {600}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lpg3/v0;", "Ll83/a0;", "<anonymous>", "()Lpg3/v0;"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C66332 extends AbstractC32275i implements Function1 {
        final /* synthetic */ String $triggeredAt;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C66332(String str, InterfaceC30057d<? super C66332> interfaceC30057d) {
            super(1, interfaceC30057d);
            this.$triggeredAt = str;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(InterfaceC30057d<?> interfaceC30057d) {
            return SmartAlarmTriggerRepository.this.new C66332(this.$triggeredAt, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.label;
            if (i13 != 0) {
                if (i13 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(obj);
                return obj;
            }
            AbstractC34132o.m107864I(obj);
            SleepCoachApi sleepCoachApi = SmartAlarmTriggerRepository.this.sleepCoachApi;
            AlarmOverrideDto alarmOverrideDto = new AlarmOverrideDto(null, this.$triggeredAt);
            this.label = 1;
            Object objPostSmartAlarmOverride = sleepCoachApi.postSmartAlarmOverride(alarmOverrideDto, this);
            return objPostSmartAlarmOverride == enumC31071a ? enumC31071a : objPostSmartAlarmOverride;
        }

        @Override // p715kotlin.jvm.functions.Function1
        public final Object invoke(InterfaceC30057d<? super C29218v0<C23454a0>> interfaceC30057d) {
            return ((C66332) create(interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }
    }

    /* JADX INFO: renamed from: com.whoop.data.repositories.SmartAlarmTriggerRepository$start$4 */
    @InterfaceC32271e(m100429c = "com.whoop.data.repositories.SmartAlarmTriggerRepository$start$4", m100430f = "SmartAlarmTriggerRepository.kt", m100431l = {150}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "Ll83/a0;", "<anonymous>", "(Lbc3/c0;)V"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C66354 extends AbstractC32275i implements InterfaceC4351m {
        int label;

        public C66354(InterfaceC30057d<? super C66354> interfaceC30057d) {
            super(2, interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return SmartAlarmTriggerRepository.this.new C66354(interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
            return ((C66354) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            EnumC31071a enumC31071a = EnumC31071a.f128113w;
            int i13 = this.label;
            if (i13 == 0) {
                AbstractC34132o.m107864I(obj);
                final InterfaceC13087t1 interfaceC13087t1M119656a = SmartAlarmTriggerRepository.this.scopeCoordinator.getScopeUpdateEvents();
                InterfaceC13058l interfaceC13058l = new InterfaceC13058l() { // from class: com.whoop.data.repositories.SmartAlarmTriggerRepository$start$4$invokeSuspend$$inlined$filter$1

                    /* JADX INFO: renamed from: com.whoop.data.repositories.SmartAlarmTriggerRepository$start$4$invokeSuspend$$inlined$filter$1$2, reason: invalid class name */
                    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
                    public static final class AnonymousClass2<T> implements InterfaceC13062m {
                        final /* synthetic */ InterfaceC13062m $this_unsafeFlow;

                        /* JADX INFO: renamed from: com.whoop.data.repositories.SmartAlarmTriggerRepository$start$4$invokeSuspend$$inlined$filter$1$2$1, reason: invalid class name */
                        @InterfaceC32271e(m100429c = "com.whoop.data.repositories.SmartAlarmTriggerRepository$start$4$invokeSuspend$$inlined$filter$1$2", m100430f = "SmartAlarmTriggerRepository.kt", m100431l = {50}, m100432m = "emit", m100433v = 2)
                        @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
                        public static final class AnonymousClass1 extends AbstractC32269c {
                            int I$0;
                            Object L$0;
                            Object L$1;
                            Object L$2;
                            Object L$3;
                            int label;
                            /* synthetic */ Object result;

                            public AnonymousClass1(InterfaceC30057d interfaceC30057d) {
                                super(interfaceC30057d);
                            }

                            @Override // s83.AbstractC32267a
                            public final Object invokeSuspend(Object obj) {
                                this.result = obj;
                                this.label |= Integer.MIN_VALUE;
                                return AnonymousClass2.this.emit(null, this);
                            }
                        }

                        public AnonymousClass2(InterfaceC13062m interfaceC13062m) {
                            this.$this_unsafeFlow = interfaceC13062m;
                        }

                        /* JADX WARN: Code duplicated, block: B:7:0x0013  */
                        @Override // ec3.InterfaceC13062m
                        public final Object emit(Object obj, InterfaceC30057d interfaceC30057d) {
                            AnonymousClass1 anonymousClass1;
                            if (interfaceC30057d instanceof AnonymousClass1) {
                                anonymousClass1 = (AnonymousClass1) interfaceC30057d;
                                int i13 = anonymousClass1.label;
                                if ((i13 & Integer.MIN_VALUE) != 0) {
                                    anonymousClass1.label = i13 - Integer.MIN_VALUE;
                                } else {
                                    anonymousClass1 = new AnonymousClass1(interfaceC30057d);
                                }
                            } else {
                                anonymousClass1 = new AnonymousClass1(interfaceC30057d);
                            }
                            Object obj2 = anonymousClass1.result;
                            EnumC31071a enumC31071a = EnumC31071a.f128113w;
                            int i14 = anonymousClass1.label;
                            if (i14 == 0) {
                                AbstractC34132o.m107864I(obj2);
                                InterfaceC13062m interfaceC13062m = this.$this_unsafeFlow;
                                if (SmartAlarmTriggerRepository.INSTANCE.getScopeListenerList().contains((String) obj)) {
                                    anonymousClass1.L$0 = null;
                                    anonymousClass1.L$1 = null;
                                    anonymousClass1.L$2 = null;
                                    anonymousClass1.L$3 = null;
                                    anonymousClass1.I$0 = 0;
                                    anonymousClass1.label = 1;
                                    if (interfaceC13062m.emit(obj, anonymousClass1) == enumC31071a) {
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

                    @Override // ec3.InterfaceC13058l
                    public Object collect(InterfaceC13062m interfaceC13062m, InterfaceC30057d interfaceC30057d) {
                        Object objCollect = interfaceC13087t1M119656a.collect(new AnonymousClass2(interfaceC13062m), interfaceC30057d);
                        return objCollect == EnumC31071a.f128113w ? objCollect : C23454a0.f92919a;
                    }
                };
                final SmartAlarmTriggerRepository smartAlarmTriggerRepository = SmartAlarmTriggerRepository.this;
                InterfaceC13062m interfaceC13062m = new InterfaceC13062m() { // from class: com.whoop.data.repositories.SmartAlarmTriggerRepository.start.4.2
                    @Override // ec3.InterfaceC13062m
                    public /* bridge */ /* synthetic */ Object emit(Object obj2, InterfaceC30057d interfaceC30057d) {
                        return emit((String) obj2, (InterfaceC30057d<? super C23454a0>) interfaceC30057d);
                    }

                    public final Object emit(String str, InterfaceC30057d<? super C23454a0> interfaceC30057d) {
                        int iHashCode = str.hashCode();
                        C23454a0 c23454a0 = C23454a0.f92919a;
                        if (iHashCode != -192727054) {
                            if (iHashCode == 95131878) {
                                if (str.equals(SmartAlarmTriggerRepository.DEFAULT_REFRESH_SCOPE)) {
                                    smartAlarmTriggerRepository.getLogger().mo85228t("Trigger Smart alarm refresh after cycles fetch", new AbstractC30556a.a[0]);
                                    smartAlarmTriggerRepository.doWorkOnCycleFetch();
                                }
                                return c23454a0;
                            }
                            if (iHashCode == 539191187 && str.equals(SmartAlarmTriggerRepository.SMART_ALARM_REFRESH)) {
                                smartAlarmTriggerRepository.getLogger().mo85228t("Trigger Smart alarm refresh after weekly plan save", new AbstractC30556a.a[0]);
                                Object objFetchAndCacheSmartAlarmUserInfo = smartAlarmTriggerRepository.fetchAndCacheSmartAlarmUserInfo(interfaceC30057d);
                                return objFetchAndCacheSmartAlarmUserInfo == EnumC31071a.f128113w ? objFetchAndCacheSmartAlarmUserInfo : c23454a0;
                            }
                        } else if (str.equals(SmartAlarmTriggerRepository.SMART_ALARM_DISABLE_HIGH_FREQUENCY)) {
                            smartAlarmTriggerRepository.getLogger().mo85228t("Disable high frequency mode on turnoff alarm", new AbstractC30556a.a[0]);
                            Object objDisableHighFrequencyMode = smartAlarmTriggerRepository.disableHighFrequencyMode(interfaceC30057d);
                            return objDisableHighFrequencyMode == EnumC31071a.f128113w ? objDisableHighFrequencyMode : c23454a0;
                        }
                        SmartAlarmTriggerRepository.handledException$default(smartAlarmTriggerRepository, AbstractC11895b.m31996o("Event: ", str, " shouldn't be received here"), null, 2, null);
                        return c23454a0;
                    }
                };
                this.label = 1;
                if (interfaceC13058l.collect(interfaceC13062m, this) == enumC31071a) {
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

    /* JADX INFO: renamed from: com.whoop.data.repositories.SmartAlarmTriggerRepository$triggerSmartAlarmFromPush$2 */
    /* JADX INFO: loaded from: classes8.dex */
    @InterfaceC32271e(m100429c = "com.whoop.data.repositories.SmartAlarmTriggerRepository$triggerSmartAlarmFromPush$2", m100430f = "SmartAlarmTriggerRepository.kt", m100431l = {542, 545, 550, 553, 554, 566}, m100432m = "invokeSuspend", m100433v = 2)
    @Metadata(m65680d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, m65681d2 = {"Lbc3/c0;", "", "<anonymous>", "(Lbc3/c0;)Z"}, m65682k = 3, m65683mv = {2, 3, 0})
    public static final class C66372 extends AbstractC32275i implements InterfaceC4351m {
        final /* synthetic */ DateTime $alarmPushTriggered;
        int I$0;
        Object L$0;
        Object L$1;
        Object L$2;
        Object L$3;
        Object L$4;
        int label;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C66372(DateTime dateTime, InterfaceC30057d<? super C66372> interfaceC30057d) {
            super(2, interfaceC30057d);
            this.$alarmPushTriggered = dateTime;
        }

        @Override // s83.AbstractC32267a
        public final InterfaceC30057d<C23454a0> create(Object obj, InterfaceC30057d<?> interfaceC30057d) {
            return SmartAlarmTriggerRepository.this.new C66372(this.$alarmPushTriggered, interfaceC30057d);
        }

        @Override // c93.InterfaceC4351m
        public final Object invoke(InterfaceC2994c0 interfaceC2994c0, InterfaceC30057d<? super Boolean> interfaceC30057d) {
            return ((C66372) create(interfaceC2994c0, interfaceC30057d)).invokeSuspend(C23454a0.f92919a);
        }

        /* JADX WARN: Code duplicated, block: B:18:0x0095  */
        /* JADX WARN: Code duplicated, block: B:20:0x00a3  */
        /* JADX WARN: Code duplicated, block: B:23:0x00c1  */
        /* JADX WARN: Code duplicated, block: B:26:0x00cb  */
        /* JADX WARN: Code duplicated, block: B:28:0x00cf  */
        /* JADX WARN: Code duplicated, block: B:32:0x00dc  */
        /* JADX WARN: Code duplicated, block: B:36:0x010c  */
        /* JADX WARN: Code duplicated, block: B:37:0x010f  */
        /* JADX WARN: Code duplicated, block: B:41:0x0130 A[PHI: r2 r3 r4
          0x0130: PHI (r2v24 int) = (r2v11 int), (r2v27 int) binds: [B:39:0x012c, B:8:0x0033] A[DONT_GENERATE, DONT_INLINE]
          0x0130: PHI (r3v10 com.whoop.data.repositories.SmartAlarmTriggerRepository) = 
          (r3v3 com.whoop.data.repositories.SmartAlarmTriggerRepository)
          (r3v17 com.whoop.data.repositories.SmartAlarmTriggerRepository)
         binds: [B:39:0x012c, B:8:0x0033] A[DONT_GENERATE, DONT_INLINE]
          0x0130: PHI (r4v5 java.lang.Object) = (r4v4 java.lang.Object), (r4v13 java.lang.Object) binds: [B:39:0x012c, B:8:0x0033] A[DONT_GENERATE, DONT_INLINE]] */
        /* JADX WARN: Code duplicated, block: B:43:0x0138  */
        /* JADX WARN: Code duplicated, block: B:48:0x0170  */
        /* JADX WARN: Code duplicated, block: B:51:0x01a3  */
        /* JADX WARN: Code restructure failed: missing block: B:34:0x0108, code lost:
        
            if (r10.runAlarm(r9, r12, r2, r17) == r1) goto L50;
         */
        /* JADX WARN: Code restructure failed: missing block: B:44:0x016a, code lost:
        
            if (r3.mo58700a(r7, r17) == r1) goto L50;
         */
        @Override // s83.AbstractC32267a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r18) {
            /*
                Method dump skipped, instruction units count: 448
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.whoop.data.repositories.SmartAlarmTriggerRepository.C66372.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX INFO: renamed from: com.whoop.data.repositories.SmartAlarmTriggerRepository$updateAlarmUserInfoWithSchedule$1 */
    @InterfaceC32271e(m100429c = "com.whoop.data.repositories.SmartAlarmTriggerRepository", m100430f = "SmartAlarmTriggerRepository.kt", m100431l = {785, 790}, m100432m = "updateAlarmUserInfoWithSchedule", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class C66381 extends AbstractC32269c {
        int I$0;
        int I$1;
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public C66381(InterfaceC30057d<? super C66381> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return SmartAlarmTriggerRepository.this.updateAlarmUserInfoWithSchedule(this);
        }
    }

    /* JADX INFO: renamed from: com.whoop.data.repositories.SmartAlarmTriggerRepository$updateTimeZoneWhenOutOfSync$1 */
    @InterfaceC32271e(m100429c = "com.whoop.data.repositories.SmartAlarmTriggerRepository", m100430f = "SmartAlarmTriggerRepository.kt", m100431l = {426, 431, 441, 444}, m100432m = "updateTimeZoneWhenOutOfSync", m100433v = 2)
    @Metadata(m65682k = 3, m65683mv = {2, 3, 0}, m65685xi = 48)
    public static final class C66391 extends AbstractC32269c {
        Object L$0;
        Object L$1;
        int label;
        /* synthetic */ Object result;

        public C66391(InterfaceC30057d<? super C66391> interfaceC30057d) {
            super(interfaceC30057d);
        }

        @Override // s83.AbstractC32267a
        public final Object invokeSuspend(Object obj) {
            this.result = obj;
            this.label |= Integer.MIN_VALUE;
            return SmartAlarmTriggerRepository.this.updateTimeZoneWhenOutOfSync(null, this);
        }
    }

    static {
        Duration standardDuration = Minutes.TWO.toStandardDuration();
        AbstractC22676k.m65749i(standardDuration, "toStandardDuration(...)");
        WAKE_WINDOW_SLOP_TIME = standardDuration;
        HIGH_FREQ_SYNC_MODE_DURATION = Hours.TWO.toStandardDuration();
        scopeListenerList = AbstractC37056f.m118959K(SMART_ALARM_REFRESH, SMART_ALARM_DISABLE_HIGH_FREQUENCY, DEFAULT_REFRESH_SCOPE);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public SmartAlarmTriggerRepository(FeatureFlagRepository featureFlagRepository, InterfaceC15574a smartAlarmDiagnosticDbHelper, InterfaceC34116n log, InterfaceC31766c crashReporter, SmartAlarmApi smartAlarmApi, InterfaceC18736h<? extends AbstractC38284k> schedulerFactory, InterfaceC18735g<? extends AbstractC23416g> rxJava2SchedulerFactory, InterfaceC2994c0 applicationScope, InterfaceC31359a smartAlarmUserInfoDao, C30324c lwtResetRepository, InterfaceC27837a0 userSessionManager, InterfaceC33704b whoopStrap, C22738e highFrequencySyncModeStateHolder, AbstractC18377p0 workManager, InterfaceC18732d dispatcherFactory, InterfaceC41070a dateAndTimeProvider, InterfaceC21030c metricWriter, C37378a scopeCoordinator, SleepCoachApi sleepCoachApi, InterfaceC25576e smartAlarmHapticsWrapper) {
        super(log, crashReporter, dispatcherFactory);
        AbstractC22676k.m65750j(featureFlagRepository, "featureFlagRepository");
        AbstractC22676k.m65750j(smartAlarmDiagnosticDbHelper, "smartAlarmDiagnosticDbHelper");
        AbstractC22676k.m65750j(log, "log");
        AbstractC22676k.m65750j(crashReporter, "crashReporter");
        AbstractC22676k.m65750j(smartAlarmApi, "smartAlarmApi");
        AbstractC22676k.m65750j(schedulerFactory, "schedulerFactory");
        AbstractC22676k.m65750j(rxJava2SchedulerFactory, "rxJava2SchedulerFactory");
        AbstractC22676k.m65750j(applicationScope, "applicationScope");
        AbstractC22676k.m65750j(smartAlarmUserInfoDao, "smartAlarmUserInfoDao");
        AbstractC22676k.m65750j(lwtResetRepository, "lwtResetRepository");
        AbstractC22676k.m65750j(userSessionManager, "userSessionManager");
        AbstractC22676k.m65750j(whoopStrap, "whoopStrap");
        AbstractC22676k.m65750j(highFrequencySyncModeStateHolder, "highFrequencySyncModeStateHolder");
        AbstractC22676k.m65750j(workManager, "workManager");
        AbstractC22676k.m65750j(dispatcherFactory, "dispatcherFactory");
        AbstractC22676k.m65750j(dateAndTimeProvider, "dateAndTimeProvider");
        AbstractC22676k.m65750j(metricWriter, "metricWriter");
        AbstractC22676k.m65750j(scopeCoordinator, "scopeCoordinator");
        AbstractC22676k.m65750j(sleepCoachApi, "sleepCoachApi");
        AbstractC22676k.m65750j(smartAlarmHapticsWrapper, "smartAlarmHapticsWrapper");
        this.featureFlagRepository = featureFlagRepository;
        this.smartAlarmDiagnosticDbHelper = smartAlarmDiagnosticDbHelper;
        this.smartAlarmApi = smartAlarmApi;
        this.schedulerFactory = schedulerFactory;
        this.rxJava2SchedulerFactory = rxJava2SchedulerFactory;
        this.applicationScope = applicationScope;
        this.smartAlarmUserInfoDao = smartAlarmUserInfoDao;
        this.lwtResetRepository = lwtResetRepository;
        this.userSessionManager = userSessionManager;
        this.whoopStrap = whoopStrap;
        this.highFrequencySyncModeStateHolder = highFrequencySyncModeStateHolder;
        this.workManager = workManager;
        this.dateAndTimeProvider = dateAndTimeProvider;
        this.metricWriter = metricWriter;
        this.scopeCoordinator = scopeCoordinator;
        this.sleepCoachApi = sleepCoachApi;
        this.smartAlarmHapticsWrapper = smartAlarmHapticsWrapper;
        this.listenForStrapDrivenAlarm = EnumC30025d.f122538w;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object alarmEnabledOnStrap(InterfaceC30057d<? super Boolean> interfaceC30057d) {
        C66101 c66101;
        if (interfaceC30057d instanceof C66101) {
            c66101 = (C66101) interfaceC30057d;
            int i13 = c66101.label;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c66101.label = i13 - Integer.MIN_VALUE;
            } else {
                c66101 = new C66101(interfaceC30057d);
            }
        } else {
            c66101 = new C66101(interfaceC30057d);
        }
        Object objMo75203g = c66101.result;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = c66101.label;
        if (i14 == 0) {
            AbstractC34132o.m107864I(objMo75203g);
            InterfaceC25576e interfaceC25576e = this.smartAlarmHapticsWrapper;
            c66101.label = 1;
            objMo75203g = interfaceC25576e.mo75203g(c66101);
            if (objMo75203g == enumC31071a) {
                return enumC31071a;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(objMo75203g);
        }
        AbstractC25573b abstractC25573b = (AbstractC25573b) objMo75203g;
        return abstractC25573b instanceof AbstractC25573b.a ? Boolean.valueOf(((AbstractC25573b.a) abstractC25573b).getIsAlarmActive()) : Boolean.FALSE;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:41:0x0094 A[Catch: Exception -> 0x009a, TRY_LEAVE, TryCatch #0 {Exception -> 0x009a, blocks: (B:21:0x004d, B:39:0x008c, B:41:0x0094, B:36:0x0079), top: B:49:0x0025 }] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00b1, code lost:
    
        if (r10.mo96439g(r2, r0) == r1) goto L46;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object alarmRelatedEventsWork(q83.InterfaceC30057d<? super l83.C23454a0> r10) {
        /*
            r9 = this;
            boolean r0 = r10 instanceof com.whoop.data.repositories.SmartAlarmTriggerRepository.C66111
            if (r0 == 0) goto L13
            r0 = r10
            com.whoop.data.repositories.SmartAlarmTriggerRepository$alarmRelatedEventsWork$1 r0 = (com.whoop.data.repositories.SmartAlarmTriggerRepository.C66111) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.whoop.data.repositories.SmartAlarmTriggerRepository$alarmRelatedEventsWork$1 r0 = new com.whoop.data.repositories.SmartAlarmTriggerRepository$alarmRelatedEventsWork$1
            r0.<init>(r10)
        L18:
            java.lang.Object r10 = r0.result
            r83.a r1 = r83.EnumC31071a.f128113w
            int r2 = r0.label
            l83.a0 r3 = l83.C23454a0.f92919a
            r4 = 0
            r5 = 3
            r6 = 1
            r7 = 2
            r8 = 0
            if (r2 == 0) goto L55
            if (r2 == r6) goto L51
            if (r2 == r7) goto L45
            if (r2 != r5) goto L3d
            java.lang.Object r1 = r0.L$1
            sf2.a r1 = (sf2.C32448a) r1
            java.lang.Object r0 = r0.L$0
            com.whoop.data.local.room.entity.SmartAlarmUserInfo r0 = (com.whoop.data.local.room.entity.SmartAlarmUserInfo) r0
            p505ts.AbstractC34132o.m107864I(r10)     // Catch: java.lang.Exception -> L3a
            goto Lb9
        L3a:
            r10 = move-exception
            goto Lb4
        L3d:
            java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r10.<init>(r0)
            throw r10
        L45:
            java.lang.Object r2 = r0.L$1
            sf2.a r2 = (sf2.C32448a) r2
            java.lang.Object r6 = r0.L$0
            com.whoop.data.local.room.entity.SmartAlarmUserInfo r6 = (com.whoop.data.local.room.entity.SmartAlarmUserInfo) r6
            p505ts.AbstractC34132o.m107864I(r10)     // Catch: java.lang.Exception -> L9a
            goto L8c
        L51:
            p505ts.AbstractC34132o.m107864I(r10)     // Catch: java.lang.Exception -> L66
            goto L63
        L55:
            p505ts.AbstractC34132o.m107864I(r10)
            rf2.a r10 = r9.smartAlarmUserInfoDao     // Catch: java.lang.Exception -> L66
            r0.label = r6     // Catch: java.lang.Exception -> L66
            java.lang.Object r10 = r10.mo96434a(r0)     // Catch: java.lang.Exception -> L66
            if (r10 != r1) goto L63
            goto Lb3
        L63:
            com.whoop.data.local.room.entity.SmartAlarmUserInfo r10 = (com.whoop.data.local.room.entity.SmartAlarmUserInfo) r10     // Catch: java.lang.Exception -> L66
            goto L67
        L66:
            r10 = r8
        L67:
            if (r10 != 0) goto L75
            tr2.n r10 = r9.getLogger()
            java.lang.String r0 = "Couldn't generate comp id for strap-driven alarm: Failed to fetch smart alarm user info"
            qr2.a$a[] r1 = new qr2.AbstractC30556a.a[r4]
            r10.mo85222m(r0, r1)
            return r3
        L75:
            sf2.a r2 = com.whoop.data.repositories.SmartAlarmTriggerRepositoryKt.generateCompositeId(r10)
            rf2.a r10 = r9.smartAlarmUserInfoDao     // Catch: java.lang.Exception -> L9a
            java.lang.String r6 = r2.getCompositeId()     // Catch: java.lang.Exception -> L9a
            r0.L$0 = r8     // Catch: java.lang.Exception -> L9a
            r0.L$1 = r2     // Catch: java.lang.Exception -> L9a
            r0.label = r7     // Catch: java.lang.Exception -> L9a
            java.lang.Object r10 = r10.mo96437e(r6, r0)     // Catch: java.lang.Exception -> L9a
            if (r10 != r1) goto L8c
            goto Lb3
        L8c:
            java.lang.Boolean r10 = (java.lang.Boolean) r10     // Catch: java.lang.Exception -> L9a
            boolean r10 = r10.booleanValue()     // Catch: java.lang.Exception -> L9a
            if (r10 == 0) goto La5
            java.lang.String r10 = "contract violation: db already contained a composite ID for the strap driven alarm. This may be a duplicate alarm. Inserting it anyway."
            handledException$default(r9, r10, r8, r7, r8)     // Catch: java.lang.Exception -> L9a
            goto La5
        L9a:
            tr2.n r10 = r9.getLogger()
            java.lang.String r6 = "Failed to check db for existing comp id after strap-driven alarm. Inserting a new one anyway."
            qr2.a$a[] r4 = new qr2.AbstractC30556a.a[r4]
            r10.mo85222m(r6, r4)
        La5:
            rf2.a r10 = r9.smartAlarmUserInfoDao     // Catch: java.lang.Exception -> L3a
            r0.L$0 = r8     // Catch: java.lang.Exception -> L3a
            r0.L$1 = r8     // Catch: java.lang.Exception -> L3a
            r0.label = r5     // Catch: java.lang.Exception -> L3a
            java.lang.Object r10 = r10.mo96439g(r2, r0)     // Catch: java.lang.Exception -> L3a
            if (r10 != r1) goto Lb9
        Lb3:
            return r1
        Lb4:
            java.lang.String r0 = "Failed to save alarm composite id record after strap-run alarm"
            r9.handledException(r0, r10)
        Lb9:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whoop.data.repositories.SmartAlarmTriggerRepository.alarmRelatedEventsWork(q83.d):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean alarmTypeRequiresPolling(SmartAlarmUserInfo smartAlarmUserInfo) {
        return smartAlarmUserInfo.getSmartAlarmEnabled() && !SmartAlarmUserInfoDtoKt.isExactAlarm(smartAlarmUserInfo.getGoal());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void checkHighFrequencyMode(SmartAlarmUserInfo smartAlarmUserInfo, boolean alarmTypeRequiresPolling) {
        AbstractC3006f0.m8732z(this.applicationScope, null, null, new C66121(alarmTypeRequiresPolling, smartAlarmUserInfo, null), 3);
    }

    private final int dayOfWeekTypeConversion(DayOfWeekType dayOfWeekType) {
        switch (WhenMappings.$EnumSwitchMapping$1[dayOfWeekType.ordinal()]) {
            case 1:
                return 1;
            case 2:
                return 2;
            case 3:
                return 3;
            case 4:
                return 4;
            case 5:
                return 5;
            case 6:
                return 6;
            case 7:
                return 7;
            default:
                throw new NoWhenBranchMatchedException();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object disableAlarmOnStrap(InterfaceC30057d<? super Boolean> interfaceC30057d) {
        C66131 c66131;
        if (interfaceC30057d instanceof C66131) {
            c66131 = (C66131) interfaceC30057d;
            int i13 = c66131.label;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c66131.label = i13 - Integer.MIN_VALUE;
            } else {
                c66131 = new C66131(interfaceC30057d);
            }
        } else {
            c66131 = new C66131(interfaceC30057d);
        }
        Object objMo75197a = c66131.result;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = c66131.label;
        if (i14 == 0) {
            AbstractC34132o.m107864I(objMo75197a);
            InterfaceC25576e interfaceC25576e = this.smartAlarmHapticsWrapper;
            c66131.label = 1;
            objMo75197a = interfaceC25576e.mo75197a(c66131);
            if (objMo75197a == enumC31071a) {
                return enumC31071a;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(objMo75197a);
        }
        boolean zBooleanValue = ((Boolean) objMo75197a).booleanValue();
        getLogger().mo85228t(AbstractC11266d.m30462p("disable strap alarm success: ", zBooleanValue), new AbstractC30556a.a[0]);
        return Boolean.valueOf(zBooleanValue);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:23:0x008d  */
    /* JADX WARN: Code duplicated, block: B:27:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:30:0x00e5 A[PHI: r1
      0x00e5: PHI (r1v13 java.lang.Object) = (r1v9 java.lang.Object), (r1v1 java.lang.Object) binds: [B:28:0x00e1, B:15:0x005c] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:32:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:35:0x0104 A[PHI: r4
      0x0104: PHI (r4v13 boolean) = (r4v7 boolean), (r4v15 boolean) binds: [B:33:0x0101, B:14:0x004d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:39:0x013e  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00ba, code lost:
    
        if (r1.mo58700a(r9, r2) == r3) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x012f, code lost:
    
        if (r1.mo58700a(r9, r2) == r3) goto L41;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x016b, code lost:
    
        if (r1.mo58700a(r9, r2) == r3) goto L41;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object disableAlarmOnStrapWhenAlarmWasDisabled(q83.InterfaceC30057d<? super l83.C23454a0> r18) {
        /*
            Method dump skipped, instruction units count: 398
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whoop.data.repositories.SmartAlarmTriggerRepository.disableAlarmOnStrapWhenAlarmWasDisabled(q83.d):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x005c, code lost:
    
        if (exitHighFrequencySyncModeOnStrap(r0) == r1) goto L25;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object disableHighFrequencyMode(q83.InterfaceC30057d<? super l83.C23454a0> r6) {
        /*
            r5 = this;
            boolean r0 = r6 instanceof com.whoop.data.repositories.SmartAlarmTriggerRepository.C66161
            if (r0 == 0) goto L13
            r0 = r6
            com.whoop.data.repositories.SmartAlarmTriggerRepository$disableHighFrequencyMode$1 r0 = (com.whoop.data.repositories.SmartAlarmTriggerRepository.C66161) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.whoop.data.repositories.SmartAlarmTriggerRepository$disableHighFrequencyMode$1 r0 = new com.whoop.data.repositories.SmartAlarmTriggerRepository$disableHighFrequencyMode$1
            r0.<init>(r6)
        L18:
            java.lang.Object r6 = r0.result
            r83.a r1 = r83.EnumC31071a.f128113w
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3a
            if (r2 == r4) goto L36
            if (r2 != r3) goto L2e
            java.lang.Object r0 = r0.L$0
            com.whoop.data.local.room.entity.SmartAlarmUserInfo r0 = (com.whoop.data.local.room.entity.SmartAlarmUserInfo) r0
            p505ts.AbstractC34132o.m107864I(r6)
            goto L5f
        L2e:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r0)
            throw r6
        L36:
            p505ts.AbstractC34132o.m107864I(r6)
            goto L46
        L3a:
            p505ts.AbstractC34132o.m107864I(r6)
            r0.label = r4
            java.lang.Object r6 = r5.getSmartAlarmUserInfo(r0)
            if (r6 != r1) goto L46
            goto L5e
        L46:
            com.whoop.data.local.room.entity.SmartAlarmUserInfo r6 = (com.whoop.data.local.room.entity.SmartAlarmUserInfo) r6
            if (r6 == 0) goto L5f
            boolean r6 = r5.isHighFrequencySyncModeWindowOpen(r6)
            if (r6 == 0) goto L5f
            r6 = 0
            r0.L$0 = r6
            r6 = 0
            r0.I$0 = r6
            r0.label = r3
            java.lang.Object r6 = r5.exitHighFrequencySyncModeOnStrap(r0)
            if (r6 != r1) goto L5f
        L5e:
            return r1
        L5f:
            l83.a0 r6 = l83.C23454a0.f92919a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whoop.data.repositories.SmartAlarmTriggerRepository.disableHighFrequencyMode(q83.d):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void doWorkOnCycleFetch() {
        if (this.featureFlagRepository.isFeatureEnabled(FeatureFlagRepositoryKt.SMART_ALARM_POLL_TRIGGER)) {
            AbstractC3006f0.m8732z(this.applicationScope, null, null, new C66171(null), 3);
        }
        AbstractC3006f0.m8732z(this.applicationScope, null, null, new C66182(null), 3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object enterHighFreq(InterfaceC30057d<? super Boolean> interfaceC30057d) {
        return this.smartAlarmHapticsWrapper.mo75198b((int) HIGH_FREQ_SYNC_MODE_DURATION.getStandardSeconds(), interfaceC30057d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object enterHighFrequencySyncModeOnStrap(InterfaceC30057d<? super Instant> interfaceC30057d) {
        C66191 c66191;
        if (interfaceC30057d instanceof C66191) {
            c66191 = (C66191) interfaceC30057d;
            int i13 = c66191.label;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c66191.label = i13 - Integer.MIN_VALUE;
            } else {
                c66191 = new C66191(interfaceC30057d);
            }
        } else {
            c66191 = new C66191(interfaceC30057d);
        }
        Object objEnterHighFreq = c66191.result;
        Object obj = EnumC31071a.f128113w;
        int i14 = c66191.label;
        if (i14 == 0) {
            AbstractC34132o.m107864I(objEnterHighFreq);
            getLogger().mo85232x("WakeWindow", "Attempting to enter high frequency sync mode", new AbstractC30556a.a[0]);
            c66191.label = 1;
            objEnterHighFreq = enterHighFreq(c66191);
            if (objEnterHighFreq == obj) {
                return obj;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(objEnterHighFreq);
        }
        if (((Boolean) objEnterHighFreq).booleanValue()) {
            Instant instantPlus = Instant.now().plus(Hours.TWO.toStandardDuration());
            AbstractC22676k.m65747g(instantPlus);
            return instantPlus;
        }
        getLogger().mo85214e("WakeWindow", "failed to enter high freq mode", new AbstractC30556a.a[0]);
        Instant instant = Instant.EPOCH;
        AbstractC22676k.m65747g(instant);
        return instant;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object exitHighFrequencySyncModeOnStrap(InterfaceC30057d<? super Boolean> interfaceC30057d) {
        C66201 c66201;
        if (interfaceC30057d instanceof C66201) {
            c66201 = (C66201) interfaceC30057d;
            int i13 = c66201.label;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c66201.label = i13 - Integer.MIN_VALUE;
            } else {
                c66201 = new C66201(interfaceC30057d);
            }
        } else {
            c66201 = new C66201(interfaceC30057d);
        }
        Object objMo75199c = c66201.result;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = c66201.label;
        if (i14 == 0) {
            AbstractC34132o.m107864I(objMo75199c);
            InterfaceC25576e interfaceC25576e = this.smartAlarmHapticsWrapper;
            c66201.label = 1;
            objMo75199c = interfaceC25576e.mo75199c(c66201);
            if (objMo75199c == enumC31071a) {
                return enumC31071a;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(objMo75199c);
        }
        boolean zBooleanValue = ((Boolean) objMo75199c).booleanValue();
        if (zBooleanValue) {
            getLogger().mo85232x("WakeWindow", "Successfully told strap to exit high freq sync mode", new AbstractC30556a.a[0]);
        } else {
            getLogger().mo85214e("WakeWindow", "Failed to tell strap to exit high freq sync mode", new AbstractC30556a.a[0]);
        }
        return Boolean.valueOf(zBooleanValue);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:8:0x0016  */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x008e, code lost:
    
        if (r0.mo96436d(r15, r7) == r8) goto L35;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object fetchAndCacheSmartAlarmUserInfo(q83.InterfaceC30057d<? super l83.C23454a0> r15) {
        /*
            r14 = this;
            java.lang.String r1 = "saving smart alarm user info to database "
            boolean r0 = r15 instanceof com.whoop.data.repositories.SmartAlarmTriggerRepository.C66211
            if (r0 == 0) goto L16
            r0 = r15
            com.whoop.data.repositories.SmartAlarmTriggerRepository$fetchAndCacheSmartAlarmUserInfo$1 r0 = (com.whoop.data.repositories.SmartAlarmTriggerRepository.C66211) r0
            int r2 = r0.label
            r3 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = r2 & r3
            if (r4 == 0) goto L16
            int r2 = r2 - r3
            r0.label = r2
        L14:
            r7 = r0
            goto L1c
        L16:
            com.whoop.data.repositories.SmartAlarmTriggerRepository$fetchAndCacheSmartAlarmUserInfo$1 r0 = new com.whoop.data.repositories.SmartAlarmTriggerRepository$fetchAndCacheSmartAlarmUserInfo$1
            r0.<init>(r15)
            goto L14
        L1c:
            java.lang.Object r15 = r7.result
            r83.a r8 = r83.EnumC31071a.f128113w
            int r0 = r7.label
            r9 = 0
            java.lang.String r10 = "WakeWindow"
            l83.a0 r11 = l83.C23454a0.f92919a
            r12 = 0
            r13 = 2
            r2 = 1
            if (r0 == 0) goto L4a
            if (r0 == r2) goto L43
            if (r0 != r13) goto L3b
            java.lang.Object r0 = r7.L$0
            com.whoop.data.local.room.entity.SmartAlarmUserInfo r0 = (com.whoop.data.local.room.entity.SmartAlarmUserInfo) r0
            p505ts.AbstractC34132o.m107864I(r15)     // Catch: java.lang.Exception -> L38
            goto L9c
        L38:
            r0 = move-exception
            r15 = r0
            goto L91
        L3b:
            java.lang.IllegalStateException r15 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r15.<init>(r0)
            throw r15
        L43:
            p505ts.AbstractC34132o.m107864I(r15)     // Catch: java.lang.Exception -> L47
            goto L63
        L47:
            r0 = move-exception
            r15 = r0
            goto L66
        L4a:
            p505ts.AbstractC34132o.m107864I(r15)
            r15 = r2
            com.whoop.smart.alarm.data.network.api.SmartAlarmApi r2 = r14.smartAlarmApi     // Catch: java.lang.Exception -> L47
            tr2.n r3 = r14.getLogger()     // Catch: java.lang.Exception -> L47
            rf2.a r4 = r14.smartAlarmUserInfoDao     // Catch: java.lang.Exception -> L47
            iy1.c r5 = r14.metricWriter     // Catch: java.lang.Exception -> L47
            com.whoop.data.repositories.FeatureFlagRepository r6 = r14.featureFlagRepository     // Catch: java.lang.Exception -> L47
            r7.label = r15     // Catch: java.lang.Exception -> L47
            java.lang.Object r15 = qf2.AbstractC30328g.m92687a(r2, r3, r4, r5, r6, r7)     // Catch: java.lang.Exception -> L47
            if (r15 != r8) goto L63
            goto L90
        L63:
            com.whoop.data.local.room.entity.SmartAlarmUserInfo r15 = (com.whoop.data.local.room.entity.SmartAlarmUserInfo) r15     // Catch: java.lang.Exception -> L47
            goto L6c
        L66:
            java.lang.String r0 = "WakeWindow Failed to get SmartAlarmUserInfo"
            r14.logRetrofitSuspendException(r15, r0)
            r15 = r12
        L6c:
            if (r15 != 0) goto L6f
            return r11
        L6f:
            tr2.n r0 = r14.getLogger()     // Catch: java.lang.Exception -> L38
            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch: java.lang.Exception -> L38
            r2.<init>(r1)     // Catch: java.lang.Exception -> L38
            r2.append(r15)     // Catch: java.lang.Exception -> L38
            java.lang.String r1 = r2.toString()     // Catch: java.lang.Exception -> L38
            qr2.a$a[] r2 = new qr2.AbstractC30556a.a[r9]     // Catch: java.lang.Exception -> L38
            r0.mo85232x(r10, r1, r2)     // Catch: java.lang.Exception -> L38
            rf2.a r0 = r14.smartAlarmUserInfoDao     // Catch: java.lang.Exception -> L38
            r7.L$0 = r12     // Catch: java.lang.Exception -> L38
            r7.label = r13     // Catch: java.lang.Exception -> L38
            java.lang.Object r15 = r0.mo96436d(r15, r7)     // Catch: java.lang.Exception -> L38
            if (r15 != r8) goto L9c
        L90:
            return r8
        L91:
            tr2.n r0 = r14.getLogger()
            java.lang.String r1 = "Failed to update existing store smart alarm user info"
            qr2.a$a[] r2 = new qr2.AbstractC30556a.a[r9]
            r0.mo85215f(r10, r1, r15, r2)
        L9c:
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whoop.data.repositories.SmartAlarmTriggerRepository.fetchAndCacheSmartAlarmUserInfo(q83.d):java.lang.Object");
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object getSmartAlarmUserInfo(InterfaceC30057d<? super SmartAlarmUserInfo> interfaceC30057d) {
        C66221 c66221;
        if (interfaceC30057d instanceof C66221) {
            c66221 = (C66221) interfaceC30057d;
            int i13 = c66221.label;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c66221.label = i13 - Integer.MIN_VALUE;
            } else {
                c66221 = new C66221(interfaceC30057d);
            }
        } else {
            c66221 = new C66221(interfaceC30057d);
        }
        Object objMo96434a = c66221.result;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = c66221.label;
        try {
            if (i14 == 0) {
                AbstractC34132o.m107864I(objMo96434a);
                InterfaceC31359a interfaceC31359a = this.smartAlarmUserInfoDao;
                c66221.label = 1;
                objMo96434a = interfaceC31359a.mo96434a(c66221);
                if (objMo96434a == enumC31071a) {
                    return enumC31071a;
                }
            } else {
                if (i14 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                AbstractC34132o.m107864I(objMo96434a);
            }
            return (SmartAlarmUserInfo) objMo96434a;
        } catch (Exception e5) {
            getLogger().mo85215f("WakeWindow", "Failed to get smart alarm info from db", e5, new AbstractC30556a.a[0]);
            return null;
        }
    }

    private final void handledException(String message, Exception cause) {
        if (!AbstractC39414r.m125876U(message, "WakeWindow", false)) {
            message = "WakeWindow ".concat(message);
        }
        getCrashReporter().mo98626g(new SmartAlarmException(message, cause), message);
    }

    public static /* synthetic */ void handledException$default(SmartAlarmTriggerRepository smartAlarmTriggerRepository, String str, Exception exc, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            exc = null;
        }
        smartAlarmTriggerRepository.handledException(str, exc);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void initListeningForAlarmRelatedStrapEvents() {
        this.listenForStrapDrivenAlarm.dispose();
        AbstractC3006f0.m8732z(this.applicationScope, null, null, new C66231(null), 3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object insertResetLwtMetrics(InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        C66251 c66251;
        if (interfaceC30057d instanceof C66251) {
            c66251 = (C66251) interfaceC30057d;
            int i13 = c66251.label;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                c66251.label = i13 - Integer.MIN_VALUE;
            } else {
                c66251 = new C66251(interfaceC30057d);
            }
        } else {
            c66251 = new C66251(interfaceC30057d);
        }
        Object obj = c66251.result;
        EnumC31071a enumC31071a = EnumC31071a.f128113w;
        int i14 = c66251.label;
        if (i14 == 0) {
            AbstractC34132o.m107864I(obj);
            InterfaceC21030c interfaceC21030c = this.metricWriter;
            C22047a c22047a = new C22047a(0, EnumC13750g.RESET_LWT.getValue(), null, AbstractC31061c.m95644t("Event:", EnumC13749f.EMPTY_READ_FROM_CACHE.getValue()), null, 17, null);
            c66251.label = 1;
            if (interfaceC21030c.mo58700a(c22047a, c66251) == enumC31071a) {
                return enumC31071a;
            }
        } else {
            if (i14 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            AbstractC34132o.m107864I(obj);
        }
        getLogger().mo85214e("WakeWindow", "Tried to perform LWT check, but failed to fetch alarm info record", new AbstractC30556a.a[0]);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object insertUpdateFromStaleCacheMetrics(InterfaceC30057d<? super C23454a0> interfaceC30057d) {
        Object objMo58700a = this.metricWriter.mo58700a(new C22047a(0, EnumC13750g.RESET_LWT.getValue(), null, AbstractC31061c.m95644t("Event:", EnumC13749f.ALARM_UPDATED_FROM_STALE_CACHE.getValue()), null, 17, null), interfaceC30057d);
        return objMo58700a == EnumC31071a.f128113w ? objMo58700a : C23454a0.f92919a;
    }

    public static /* synthetic */ void pollSmartAlarmTrigger$default(SmartAlarmTriggerRepository smartAlarmTriggerRepository, boolean z4, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            z4 = true;
        }
        smartAlarmTriggerRepository.pollSmartAlarmTrigger(z4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void reportLwtReset(Instant newLwt) {
        AbstractC3006f0.m8732z(this.applicationScope, null, null, new C66291(StrapLatestWakeTimeDto.INSTANCE.m25960a(newLwt), newLwt, null), 3);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:17:0x0079 A[PHI: r2 r9 r10
      0x0079: PHI (r2v14 kotlin.jvm.internal.g0) = (r2v7 kotlin.jvm.internal.g0), (r2v20 kotlin.jvm.internal.g0) binds: [B:43:0x015e, B:16:0x0062] A[DONT_GENERATE, DONT_INLINE]
      0x0079: PHI (r9v24 int) = (r9v22 int), (r9v26 int) binds: [B:43:0x015e, B:16:0x0062] A[DONT_GENERATE, DONT_INLINE]
      0x0079: PHI (r10v5 boolean) = (r10v3 boolean), (r10v9 boolean) binds: [B:43:0x015e, B:16:0x0062] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:27:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:32:0x010e  */
    /* JADX WARN: Code duplicated, block: B:48:0x0179  */
    /* JADX WARN: Code duplicated, block: B:50:0x017d A[PHI: r2 r10
      0x017d: PHI (r2v21 kotlin.jvm.internal.g0) = 
      (r2v4 kotlin.jvm.internal.g0)
      (r2v4 kotlin.jvm.internal.g0)
      (r2v4 kotlin.jvm.internal.g0)
      (r2v23 kotlin.jvm.internal.g0)
     binds: [B:33:0x0114, B:35:0x011a, B:37:0x0131, B:49:0x017a] A[DONT_GENERATE, DONT_INLINE]
      0x017d: PHI (r10v10 boolean) = (r10v1 boolean), (r10v1 boolean), (r10v1 boolean), (r10v12 boolean) binds: [B:33:0x0114, B:35:0x011a, B:37:0x0131, B:49:0x017a] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:52:0x0181  */
    /* JADX WARN: Code duplicated, block: B:57:0x019a  */
    /* JADX WARN: Code duplicated, block: B:59:0x019e  */
    /* JADX WARN: Code duplicated, block: B:61:0x01a1  */
    /* JADX WARN: Code duplicated, block: B:64:0x01be A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0107, code lost:
    
        if (insertResetLwtMetrics(r0) == r1) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0194, code lost:
    
        if (insertResetLwtMetrics(r0) == r1) goto L63;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object resetLwt(java.lang.String r9, boolean r10, q83.InterfaceC30057d<? super java.lang.Boolean> r11) {
        /*
            Method dump skipped, instruction units count: 468
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whoop.data.repositories.SmartAlarmTriggerRepository.resetLwt(java.lang.String, boolean, q83.d):java.lang.Object");
    }

    public static /* synthetic */ Object resetLwt$default(SmartAlarmTriggerRepository smartAlarmTriggerRepository, String str, boolean z4, InterfaceC30057d interfaceC30057d, int i13, Object obj) {
        if ((i13 & 2) != 0) {
            z4 = true;
        }
        return smartAlarmTriggerRepository.resetLwt(str, z4, interfaceC30057d);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:36:0x0142  */
    /* JADX WARN: Code duplicated, block: B:45:0x01ab  */
    /* JADX WARN: Code duplicated, block: B:48:0x01b5  */
    /* JADX WARN: Code duplicated, block: B:53:0x0207 A[PHI: r2 r4 r5 r7 r8
      0x0207: PHI (r2v17 java.lang.Object) = (r2v14 java.lang.Object), (r2v18 java.lang.Object) binds: [B:51:0x0203, B:21:0x00a2] A[DONT_GENERATE, DONT_INLINE]
      0x0207: PHI (r4v27 java.lang.String) = (r4v15 java.lang.String), (r4v31 java.lang.String) binds: [B:51:0x0203, B:21:0x00a2] A[DONT_GENERATE, DONT_INLINE]
      0x0207: PHI (r5v9 ey1.g) = (r5v5 ey1.g), (r5v12 ey1.g) binds: [B:51:0x0203, B:21:0x00a2] A[DONT_GENERATE, DONT_INLINE]
      0x0207: PHI (r7v19 sf2.a) = (r7v13 sf2.a), (r7v24 sf2.a) binds: [B:51:0x0203, B:21:0x00a2] A[DONT_GENERATE, DONT_INLINE]
      0x0207: PHI (r8v15 boolean) = (r8v11 boolean), (r8v16 boolean) binds: [B:51:0x0203, B:21:0x00a2] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:57:0x022e  */
    /* JADX WARN: Code duplicated, block: B:67:0x028b A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:68:0x028c  */
    /* JADX WARN: Code duplicated, block: B:70:0x029d  */
    /* JADX WARN: Code duplicated, block: B:72:0x02d1 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:73:0x02d2  */
    /* JADX WARN: Code duplicated, block: B:8:0x001a  */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x0266, code lost:
    
        if (r6.mo58700a(r14, r9) == r3) goto L72;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object runAlarm(sf2.C32448a r28, f82.EnumC14251b r29, ey1.EnumC13750g r30, q83.InterfaceC30057d<? super l83.C23454a0> r31) {
        /*
            Method dump skipped, instruction units count: 754
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whoop.data.repositories.SmartAlarmTriggerRepository.runAlarm(sf2.a, f82.b, ey1.g, q83.d):java.lang.Object");
    }

    private final void saveSmartAlarmDiagnosticEvents(EnumC14250a smartAlarmEventType, EnumC14251b smartAlarmTrigger, String phoneSetAlarmTimeMillis, C40727h responsePacket) {
        this.smartAlarmDiagnosticDbHelper.mo43871b(smartAlarmEventType, smartAlarmTrigger, phoneSetAlarmTimeMillis, responsePacket, responsePacket != null ? responsePacket.m132198W() : false);
    }

    public static /* synthetic */ void saveSmartAlarmDiagnosticEvents$default(SmartAlarmTriggerRepository smartAlarmTriggerRepository, EnumC14250a enumC14250a, EnumC14251b enumC14251b, String str, C40727h c40727h, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            enumC14250a = EnumC14250a.PHONE_TRIGGER_RECEIVED;
        }
        if ((i13 & 4) != 0) {
            str = String.valueOf(Instant.now().getMillis());
        }
        if ((i13 & 8) != 0) {
            c40727h = null;
        }
        smartAlarmTriggerRepository.saveSmartAlarmDiagnosticEvents(enumC14250a, enumC14251b, str, c40727h);
    }

    private final boolean shouldFetchAndCacheSmartAlarmUserInfo(DayOfWeekType dayOfWeek, LocalTime upperBoundLocalTime) {
        int iDayOfWeekTypeConversion = dayOfWeekTypeConversion(dayOfWeek);
        LocalDate localDateMo133365d = this.dateAndTimeProvider.mo133365d();
        int dayOfWeek2 = localDateMo133365d.getDayOfWeek();
        if (iDayOfWeekTypeConversion == 1 && dayOfWeek2 == 7) {
            return false;
        }
        int i13 = iDayOfWeekTypeConversion - dayOfWeek2;
        if (i13 == 0 || i13 == 1) {
            return localDateMo133365d.plusDays(i13).toDateTimeAtStartOfDay().withTime(upperBoundLocalTime.plusMinutes((int) WAKE_WINDOW_SLOP_TIME.getStandardMinutes())).isBeforeNow();
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C23454a0 start$lambda$0(SmartAlarmTriggerRepository smartAlarmTriggerRepository, UserSwitchEvent userSwitchEvent) {
        if (userSwitchEvent instanceof Logout) {
            AbstractC3006f0.m8732z(smartAlarmTriggerRepository.applicationScope, null, null, new SmartAlarmTriggerRepository$start$1$1(smartAlarmTriggerRepository, null), 3);
        } else {
            if (!(userSwitchEvent instanceof Login)) {
                throw new NoWhenBranchMatchedException();
            }
            AbstractC3006f0.m8732z(smartAlarmTriggerRepository.applicationScope, null, null, new SmartAlarmTriggerRepository$start$1$2(smartAlarmTriggerRepository, null), 3);
        }
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Boolean start$lambda$2(EnumC33707e enumC33707e) {
        return Boolean.valueOf(enumC33707e == EnumC33707e.READY);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Boolean start$lambda$3(Function1 function1, Object obj) {
        return (Boolean) function1.invoke(obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final C23454a0 start$lambda$4(SmartAlarmTriggerRepository smartAlarmTriggerRepository, EnumC33707e enumC33707e) {
        AbstractC3006f0.m8732z(smartAlarmTriggerRepository.applicationScope, null, null, new SmartAlarmTriggerRepository$start$3$1(smartAlarmTriggerRepository, null), 3);
        return C23454a0.f92919a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:39:0x00bc A[Catch: Exception -> 0x011c, TryCatch #0 {Exception -> 0x011c, blocks: (B:42:0x00f8, B:37:0x00b6, B:39:0x00bc, B:43:0x0102, B:45:0x0106, B:48:0x0114, B:49:0x0119, B:34:0x00ae), top: B:58:0x00ae }] */
    /* JADX WARN: Code duplicated, block: B:41:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:43:0x0102 A[Catch: Exception -> 0x011c, TryCatch #0 {Exception -> 0x011c, blocks: (B:42:0x00f8, B:37:0x00b6, B:39:0x00bc, B:43:0x0102, B:45:0x0106, B:48:0x0114, B:49:0x0119, B:34:0x00ae), top: B:58:0x00ae }] */
    /* JADX WARN: Code duplicated, block: B:45:0x0106 A[Catch: Exception -> 0x011c, TryCatch #0 {Exception -> 0x011c, blocks: (B:42:0x00f8, B:37:0x00b6, B:39:0x00bc, B:43:0x0102, B:45:0x0106, B:48:0x0114, B:49:0x0119, B:34:0x00ae), top: B:58:0x00ae }] */
    /* JADX WARN: Code duplicated, block: B:47:0x0113  */
    /* JADX WARN: Code duplicated, block: B:48:0x0114 A[Catch: Exception -> 0x011c, TryCatch #0 {Exception -> 0x011c, blocks: (B:42:0x00f8, B:37:0x00b6, B:39:0x00bc, B:43:0x0102, B:45:0x0106, B:48:0x0114, B:49:0x0119, B:34:0x00ae), top: B:58:0x00ae }] */
    /* JADX WARN: Code duplicated, block: B:8:0x0018  */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x014a, code lost:
    
        if (r1.mo58700a(r16, r8) == r2) goto L53;
     */
    /* JADX WARN: Instruction removed from duplicated block: B:39:0x00bc, please report this as an issue */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object updateTimeZoneWhenOutOfSync(com.whoop.data.local.room.entity.SmartAlarmUserInfo r25, q83.InterfaceC30057d<? super l83.C23454a0> r26) {
        /*
            Method dump skipped, instruction units count: 345
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whoop.data.repositories.SmartAlarmTriggerRepository.updateTimeZoneWhenOutOfSync(com.whoop.data.local.room.entity.SmartAlarmUserInfo, q83.d):java.lang.Object");
    }

    public final DateTime getCalculatedLatestWakeTime(SmartAlarmUserInfo alarmInfo, DateTime now) {
        DayOfWeekType dayOfWeek;
        AbstractC22676k.m65750j(alarmInfo, "alarmInfo");
        AbstractC22676k.m65750j(now, "now");
        if (!alarmInfo.getScheduleEnabled() || (dayOfWeek = alarmInfo.getDayOfWeek()) == null) {
            getLogger().mo85232x("WakeWindow", "schedule disabled, upperbound time:  " + alarmInfo.getUpperBoundLocalTime(), new AbstractC30556a.a[0]);
            return AbstractC33767a.m106769a(alarmInfo.getUpperBoundLocalTime(), now);
        }
        int iDayOfWeekTypeConversion = dayOfWeekTypeConversion(dayOfWeek);
        LocalDate localDateMo133365d = this.dateAndTimeProvider.mo133365d();
        int dayOfWeek2 = localDateMo133365d.getDayOfWeek();
        if (iDayOfWeekTypeConversion == 1 && dayOfWeek2 == 7) {
            getLogger().mo85232x("WakeWindow", "returning Date time on sunday " + alarmInfo.getUpperBoundLocalTime(), new AbstractC30556a.a[0]);
            DateTime dateTimeWithTime = this.dateAndTimeProvider.mo133365d().plusDays(1).toDateTimeAtStartOfDay().withTime(alarmInfo.getUpperBoundLocalTime());
            AbstractC22676k.m65749i(dateTimeWithTime, "withTime(...)");
            return dateTimeWithTime;
        }
        int i13 = iDayOfWeekTypeConversion - dayOfWeek2;
        LocalDate localDateWithDayOfWeek = this.dateAndTimeProvider.mo133365d().withDayOfWeek(iDayOfWeekTypeConversion);
        if (i13 == 0 || i13 == 1) {
            getLogger().mo85232x("WakeWindow", "day of difference is : " + i13 + " and upperbound time " + alarmInfo.getUpperBoundLocalTime(), new AbstractC30556a.a[0]);
            DateTime dateTimeWithTime2 = localDateWithDayOfWeek.toDateTimeAtStartOfDay().withTime(alarmInfo.getUpperBoundLocalTime());
            AbstractC22676k.m65749i(dateTimeWithTime2, "withTime(...)");
            return dateTimeWithTime2;
        }
        getLogger().mo85232x("WakeWindow", "day of difference is : " + i13 + " and upperbound time " + alarmInfo.getUpperBoundLocalTime() + " current local date: " + localDateMo133365d, new AbstractC30556a.a[0]);
        DateTime dateTimeWithTime3 = localDateMo133365d.minusDays(Math.abs(i13)).toDateTimeAtStartOfDay().withTime(alarmInfo.getUpperBoundLocalTime());
        AbstractC22676k.m65749i(dateTimeWithTime3, "withTime(...)");
        return dateTimeWithTime3;
    }

    public final boolean isHighFrequencySyncModeWindowOpen(SmartAlarmUserInfo smartAlarmUserInfo) {
        AbstractC22676k.m65750j(smartAlarmUserInfo, "smartAlarmUserInfo");
        DateTime dateTimeNow = DateTime.now();
        LocalTime upperBoundLocalTime = smartAlarmUserInfo.getUpperBoundLocalTime();
        AbstractC22676k.m65747g(dateTimeNow);
        DateTime dateTimeM106769a = AbstractC33767a.m106769a(upperBoundLocalTime, dateTimeNow);
        return dateTimeM106769a.minus(HIGH_FREQ_SYNC_MODE_DURATION).isBefore(dateTimeNow) && dateTimeM106769a.isAfter(dateTimeNow);
    }

    @Override // ca2.InterfaceC4371k
    public void onSyncAttempted() {
        pollSmartAlarmTrigger$default(this, false, 1, null);
    }

    public final void onTimeZoneChanged() {
        AbstractC3006f0.m8732z(this.applicationScope, null, null, new C66261(null), 3);
    }

    public final void pollSmartAlarmTrigger(boolean checkWakeWindow) {
        AbstractC3006f0.m8732z(this.applicationScope, null, null, new C66271(null), 3);
        AbstractC3006f0.m8732z(this.applicationScope, null, null, new C66282(checkWakeWindow, null), 3);
    }

    public final void start() {
        initListeningForAlarmRelatedStrapEvents();
        final int i13 = 0;
        this.userSessionManager.mo83917g().m122652B(this.schedulerFactory.mo54469a()).m122661K(new C6529c(new Function1(this) { // from class: com.whoop.data.repositories.b

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ SmartAlarmTriggerRepository f25444x;

            {
                this.f25444x = this;
            }

            @Override // p715kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                switch (i13) {
                    case 0:
                        return SmartAlarmTriggerRepository.start$lambda$0(this.f25444x, (UserSwitchEvent) obj);
                    default:
                        return SmartAlarmTriggerRepository.start$lambda$4(this.f25444x, (EnumC33707e) obj);
                }
            }
        }, 4));
        final int i14 = 1;
        this.whoopStrap.mo106496i().m122652B(this.schedulerFactory.mo54469a()).m122678n(new C6656c(new C0129g(28), 0)).m122661K(new C6529c(new Function1(this) { // from class: com.whoop.data.repositories.b

            /* JADX INFO: renamed from: x */
            public final /* synthetic */ SmartAlarmTriggerRepository f25444x;

            {
                this.f25444x = this;
            }

            @Override // p715kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                switch (i14) {
                    case 0:
                        return SmartAlarmTriggerRepository.start$lambda$0(this.f25444x, (UserSwitchEvent) obj);
                    default:
                        return SmartAlarmTriggerRepository.start$lambda$4(this.f25444x, (EnumC33707e) obj);
                }
            }
        }, 5));
        AbstractC3006f0.m8732z(this.applicationScope, null, null, new C66354(null), 3);
    }

    public final Object triggerSmartAlarmFromPush(DateTime dateTime, InterfaceC30057d<? super Boolean> interfaceC30057d) {
        return AbstractC3006f0.m8705K(this.applicationScope.getCoroutineContext(), new C66372(dateTime, null), interfaceC30057d);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0081, code lost:
    
        if (fetchAndCacheSmartAlarmUserInfo(r0) == r1) goto L29;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object updateAlarmUserInfoWithSchedule(q83.InterfaceC30057d<? super l83.C23454a0> r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof com.whoop.data.repositories.SmartAlarmTriggerRepository.C66381
            if (r0 == 0) goto L13
            r0 = r8
            com.whoop.data.repositories.SmartAlarmTriggerRepository$updateAlarmUserInfoWithSchedule$1 r0 = (com.whoop.data.repositories.SmartAlarmTriggerRepository.C66381) r0
            int r1 = r0.label
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.label = r1
            goto L18
        L13:
            com.whoop.data.repositories.SmartAlarmTriggerRepository$updateAlarmUserInfoWithSchedule$1 r0 = new com.whoop.data.repositories.SmartAlarmTriggerRepository$updateAlarmUserInfoWithSchedule$1
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.result
            r83.a r1 = r83.EnumC31071a.f128113w
            int r2 = r0.label
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L3e
            if (r2 == r4) goto L3a
            if (r2 != r3) goto L32
            java.lang.Object r1 = r0.L$1
            com.whoop.data.remote.domain.dto.DayOfWeekType r1 = (com.whoop.data.remote.domain.dto.DayOfWeekType) r1
            java.lang.Object r0 = r0.L$0
            com.whoop.data.local.room.entity.SmartAlarmUserInfo r0 = (com.whoop.data.local.room.entity.SmartAlarmUserInfo) r0
            p505ts.AbstractC34132o.m107864I(r8)
            goto L84
        L32:
            java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r8.<init>(r0)
            throw r8
        L3a:
            p505ts.AbstractC34132o.m107864I(r8)
            goto L4a
        L3e:
            p505ts.AbstractC34132o.m107864I(r8)
            r0.label = r4
            java.lang.Object r8 = r7.getSmartAlarmUserInfo(r0)
            if (r8 != r1) goto L4a
            goto L83
        L4a:
            com.whoop.data.local.room.entity.SmartAlarmUserInfo r8 = (com.whoop.data.local.room.entity.SmartAlarmUserInfo) r8
            if (r8 == 0) goto L84
            boolean r2 = r8.getScheduleEnabled()
            if (r2 == 0) goto L84
            com.whoop.data.remote.domain.dto.DayOfWeekType r2 = r8.getDayOfWeek()
            if (r2 == 0) goto L84
            org.joda.time.LocalTime r8 = r8.getUpperBoundLocalTime()
            boolean r8 = r7.shouldFetchAndCacheSmartAlarmUserInfo(r2, r8)
            if (r8 == 0) goto L84
            tr2.n r8 = r7.getLogger()
            java.lang.String r2 = "fetching alarm user info as previous LWT has passed"
            r4 = 0
            qr2.a$a[] r5 = new qr2.AbstractC30556a.a[r4]
            java.lang.String r6 = "WakeWindow"
            r8.mo85232x(r6, r2, r5)
            r8 = 0
            r0.L$0 = r8
            r0.L$1 = r8
            r0.I$0 = r4
            r0.I$1 = r4
            r0.label = r3
            java.lang.Object r8 = r7.fetchAndCacheSmartAlarmUserInfo(r0)
            if (r8 != r1) goto L84
        L83:
            return r1
        L84:
            l83.a0 r8 = l83.C23454a0.f92919a
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.whoop.data.repositories.SmartAlarmTriggerRepository.updateAlarmUserInfoWithSchedule(q83.d):java.lang.Object");
    }
}
