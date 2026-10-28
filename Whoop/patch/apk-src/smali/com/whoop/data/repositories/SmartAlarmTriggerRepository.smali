.class public final Lcom/whoop/data/repositories/SmartAlarmTriggerRepository;
.super Lhj0/n;
.source "SourceFile"

# interfaces
.implements Lca2/k;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$Companion;,
        Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$WhenMappings;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0092\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0002\u0008\r\n\u0002\u0010\u000e\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u0008\n\u0002\u0008\u0007\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0017\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u0008\u0007\u0018\u0000 \u0097\u00012\u00020\u00012\u00020\u0002:\u0002\u0097\u0001B\u00bb\u0001\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0008\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000c\u001a\u00020\u000b\u0012\u0010\u0010\u0010\u001a\u000c\u0012\u0004\u0012\u00020\u000e0\rj\u0002`\u000f\u0012\u0010\u0010\u0014\u001a\u000c\u0012\u0004\u0012\u00020\u00120\u0011j\u0002`\u0013\u0012\u0006\u0010\u0016\u001a\u00020\u0015\u0012\u0006\u0010\u0018\u001a\u00020\u0017\u0012\u0006\u0010\u001a\u001a\u00020\u0019\u0012\u0006\u0010\u001c\u001a\u00020\u001b\u0012\u0006\u0010\u001e\u001a\u00020\u001d\u0012\u0006\u0010 \u001a\u00020\u001f\u0012\u0006\u0010\"\u001a\u00020!\u0012\u0006\u0010$\u001a\u00020#\u0012\u0006\u0010&\u001a\u00020%\u0012\u0006\u0010(\u001a\u00020\'\u0012\u0006\u0010*\u001a\u00020)\u0012\u0006\u0010,\u001a\u00020+\u0012\u0006\u0010.\u001a\u00020-\u00a2\u0006\u0004\u0008/\u00100J\r\u00102\u001a\u000201\u00a2\u0006\u0004\u00082\u00103J\u001a\u00107\u001a\u0002062\u0008\u00105\u001a\u0004\u0018\u000104H\u0086@\u00a2\u0006\u0004\u00087\u00108J\r\u00109\u001a\u000201\u00a2\u0006\u0004\u00089\u00103J\u0017\u0010;\u001a\u0002012\u0008\u0008\u0002\u0010:\u001a\u000206\u00a2\u0006\u0004\u0008;\u0010<J\u001f\u0010@\u001a\u0002042\u0006\u0010>\u001a\u00020=2\u0006\u0010?\u001a\u000204H\u0007\u00a2\u0006\u0004\u0008@\u0010AJ\u0010\u0010B\u001a\u000201H\u0087@\u00a2\u0006\u0004\u0008B\u0010CJ\u0017\u0010E\u001a\u0002062\u0006\u0010D\u001a\u00020=H\u0007\u00a2\u0006\u0004\u0008E\u0010FJ\u000f\u0010G\u001a\u000201H\u0016\u00a2\u0006\u0004\u0008G\u00103J\u0010\u0010H\u001a\u000201H\u0082@\u00a2\u0006\u0004\u0008H\u0010CJ\u000f\u0010I\u001a\u000201H\u0002\u00a2\u0006\u0004\u0008I\u00103J\u0010\u0010J\u001a\u000201H\u0082@\u00a2\u0006\u0004\u0008J\u0010CJ\"\u0010M\u001a\u0002062\u0006\u0010L\u001a\u00020K2\u0008\u0008\u0002\u0010:\u001a\u000206H\u0082@\u00a2\u0006\u0004\u0008M\u0010NJ\u0018\u0010O\u001a\u0002012\u0006\u0010>\u001a\u00020=H\u0082@\u00a2\u0006\u0004\u0008O\u0010PJ\u0012\u0010Q\u001a\u0004\u0018\u000106H\u0082@\u00a2\u0006\u0004\u0008Q\u0010CJ\u0010\u0010R\u001a\u000206H\u0082@\u00a2\u0006\u0004\u0008R\u0010CJ\u0017\u0010U\u001a\u0002012\u0006\u0010T\u001a\u00020SH\u0002\u00a2\u0006\u0004\u0008U\u0010VJ\u000f\u0010W\u001a\u000201H\u0002\u00a2\u0006\u0004\u0008W\u00103J\u0010\u0010X\u001a\u000201H\u0082@\u00a2\u0006\u0004\u0008X\u0010CJ\u0012\u0010Y\u001a\u0004\u0018\u00010=H\u0082@\u00a2\u0006\u0004\u0008Y\u0010CJ(\u0010`\u001a\u0002012\u0006\u0010[\u001a\u00020Z2\u0006\u0010]\u001a\u00020\\2\u0006\u0010_\u001a\u00020^H\u0082@\u00a2\u0006\u0004\u0008`\u0010aJ\u0010\u0010b\u001a\u000206H\u0082@\u00a2\u0006\u0004\u0008b\u0010CJ\u001f\u0010g\u001a\u0002062\u0006\u0010d\u001a\u00020c2\u0006\u0010f\u001a\u00020eH\u0002\u00a2\u0006\u0004\u0008g\u0010hJ\u0017\u0010k\u001a\u00020j2\u0006\u0010i\u001a\u00020cH\u0002\u00a2\u0006\u0004\u0008k\u0010lJ\u0010\u0010m\u001a\u00020SH\u0082@\u00a2\u0006\u0004\u0008m\u0010CJ\u0010\u0010n\u001a\u000206H\u0082@\u00a2\u0006\u0004\u0008n\u0010CJ\u001f\u0010p\u001a\u0002012\u0006\u0010D\u001a\u00020=2\u0006\u0010o\u001a\u000206H\u0002\u00a2\u0006\u0004\u0008p\u0010qJ\u0017\u0010o\u001a\u0002062\u0006\u0010D\u001a\u00020=H\u0002\u00a2\u0006\u0004\u0008o\u0010FJ7\u0010x\u001a\u0002012\u0008\u0008\u0002\u0010s\u001a\u00020r2\u0006\u0010t\u001a\u00020\\2\u0008\u0008\u0002\u0010u\u001a\u00020K2\n\u0008\u0002\u0010w\u001a\u0004\u0018\u00010vH\u0002\u00a2\u0006\u0004\u0008x\u0010yJ)\u0010~\u001a\u0002012\u0006\u0010z\u001a\u00020K2\u0010\u0008\u0002\u0010}\u001a\n\u0018\u00010{j\u0004\u0018\u0001`|H\u0002\u00a2\u0006\u0004\u0008~\u0010\u007fJ\u0012\u0010\u0080\u0001\u001a\u000201H\u0082@\u00a2\u0006\u0005\u0008\u0080\u0001\u0010CJ\u0012\u0010\u0081\u0001\u001a\u000201H\u0082@\u00a2\u0006\u0005\u0008\u0081\u0001\u0010CJ\u0012\u0010\u0082\u0001\u001a\u000201H\u0082@\u00a2\u0006\u0005\u0008\u0082\u0001\u0010CR\u0015\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004\u00a2\u0006\u0007\n\u0005\u0008\u0004\u0010\u0083\u0001R\u0015\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004\u00a2\u0006\u0007\n\u0005\u0008\u0006\u0010\u0084\u0001R\u0015\u0010\u000c\u001a\u00020\u000b8\u0002X\u0082\u0004\u00a2\u0006\u0007\n\u0005\u0008\u000c\u0010\u0085\u0001R\u001f\u0010\u0010\u001a\u000c\u0012\u0004\u0012\u00020\u000e0\rj\u0002`\u000f8\u0002X\u0082\u0004\u00a2\u0006\u0007\n\u0005\u0008\u0010\u0010\u0086\u0001R\u001f\u0010\u0014\u001a\u000c\u0012\u0004\u0012\u00020\u00120\u0011j\u0002`\u00138\u0002X\u0082\u0004\u00a2\u0006\u0007\n\u0005\u0008\u0014\u0010\u0087\u0001R\u0015\u0010\u0016\u001a\u00020\u00158\u0002X\u0082\u0004\u00a2\u0006\u0007\n\u0005\u0008\u0016\u0010\u0088\u0001R\u0015\u0010\u0018\u001a\u00020\u00178\u0002X\u0082\u0004\u00a2\u0006\u0007\n\u0005\u0008\u0018\u0010\u0089\u0001R\u0015\u0010\u001a\u001a\u00020\u00198\u0002X\u0082\u0004\u00a2\u0006\u0007\n\u0005\u0008\u001a\u0010\u008a\u0001R\u0015\u0010\u001c\u001a\u00020\u001b8\u0002X\u0082\u0004\u00a2\u0006\u0007\n\u0005\u0008\u001c\u0010\u008b\u0001R\u0015\u0010\u001e\u001a\u00020\u001d8\u0002X\u0082\u0004\u00a2\u0006\u0007\n\u0005\u0008\u001e\u0010\u008c\u0001R\u0015\u0010 \u001a\u00020\u001f8\u0002X\u0082\u0004\u00a2\u0006\u0007\n\u0005\u0008 \u0010\u008d\u0001R\u0015\u0010\"\u001a\u00020!8\u0002X\u0082\u0004\u00a2\u0006\u0007\n\u0005\u0008\"\u0010\u008e\u0001R\u0015\u0010&\u001a\u00020%8\u0002X\u0082\u0004\u00a2\u0006\u0007\n\u0005\u0008&\u0010\u008f\u0001R\u0015\u0010(\u001a\u00020\'8\u0002X\u0082\u0004\u00a2\u0006\u0007\n\u0005\u0008(\u0010\u0090\u0001R\u0015\u0010*\u001a\u00020)8\u0002X\u0082\u0004\u00a2\u0006\u0007\n\u0005\u0008*\u0010\u0091\u0001R\u0015\u0010,\u001a\u00020+8\u0002X\u0082\u0004\u00a2\u0006\u0007\n\u0005\u0008,\u0010\u0092\u0001R\u0015\u0010.\u001a\u00020-8\u0002X\u0082\u0004\u00a2\u0006\u0007\n\u0005\u0008.\u0010\u0093\u0001R\u001a\u0010\u0095\u0001\u001a\u00030\u0094\u00018\u0002@\u0002X\u0082\u000e\u00a2\u0006\u0008\n\u0006\u0008\u0095\u0001\u0010\u0096\u0001\u00a8\u0006\u0098\u0001"
    }
    d2 = {
        "Lcom/whoop/data/repositories/SmartAlarmTriggerRepository;",
        "Lhj0/n;",
        "Lca2/k;",
        "Lcom/whoop/data/repositories/FeatureFlagRepository;",
        "featureFlagRepository",
        "Lg82/a;",
        "smartAlarmDiagnosticDbHelper",
        "Ltr2/n;",
        "log",
        "Lrr2/c;",
        "crashReporter",
        "Lcom/whoop/smart/alarm/data/network/api/SmartAlarmApi;",
        "smartAlarmApi",
        "Lin2/h;",
        "Lxg3/k;",
        "Lcom/whoop/ui/util/SchedulerFactory;",
        "schedulerFactory",
        "Lin2/g;",
        "Ll73/g;",
        "Lcom/whoop/ui/util/RxJava2SchedulerFactory;",
        "rxJava2SchedulerFactory",
        "Lbc3/c0;",
        "applicationScope",
        "Lrf2/a;",
        "smartAlarmUserInfoDao",
        "Lqf2/c;",
        "lwtResetRepository",
        "Lod1/a0;",
        "userSessionManager",
        "Ltd1/b;",
        "whoopStrap",
        "Lkp0/e;",
        "highFrequencySyncModeStateHolder",
        "Lic/p0;",
        "workManager",
        "Lin2/d;",
        "dispatcherFactory",
        "Lzr2/a;",
        "dateAndTimeProvider",
        "Liy1/c;",
        "metricWriter",
        "Lwm0/a;",
        "scopeCoordinator",
        "Lcom/whoop/sleep/coach/data/network/api/SleepCoachApi;",
        "sleepCoachApi",
        "Lmi1/e;",
        "smartAlarmHapticsWrapper",
        "<init>",
        "(Lcom/whoop/data/repositories/FeatureFlagRepository;Lg82/a;Ltr2/n;Lrr2/c;Lcom/whoop/smart/alarm/data/network/api/SmartAlarmApi;Lin2/h;Lin2/g;Lbc3/c0;Lrf2/a;Lqf2/c;Lod1/a0;Ltd1/b;Lkp0/e;Lic/p0;Lin2/d;Lzr2/a;Liy1/c;Lwm0/a;Lcom/whoop/sleep/coach/data/network/api/SleepCoachApi;Lmi1/e;)V",
        "Ll83/a0;",
        "start",
        "()V",
        "Lorg/joda/time/DateTime;",
        "alarmPushTriggered",
        "",
        "triggerSmartAlarmFromPush",
        "(Lorg/joda/time/DateTime;Lq83/d;)Ljava/lang/Object;",
        "onTimeZoneChanged",
        "checkWakeWindow",
        "pollSmartAlarmTrigger",
        "(Z)V",
        "Lcom/whoop/data/local/room/entity/SmartAlarmUserInfo;",
        "alarmInfo",
        "now",
        "getCalculatedLatestWakeTime",
        "(Lcom/whoop/data/local/room/entity/SmartAlarmUserInfo;Lorg/joda/time/DateTime;)Lorg/joda/time/DateTime;",
        "updateAlarmUserInfoWithSchedule",
        "(Lq83/d;)Ljava/lang/Object;",
        "smartAlarmUserInfo",
        "isHighFrequencySyncModeWindowOpen",
        "(Lcom/whoop/data/local/room/entity/SmartAlarmUserInfo;)Z",
        "onSyncAttempted",
        "disableAlarmOnStrapWhenAlarmWasDisabled",
        "doWorkOnCycleFetch",
        "fetchAndCacheSmartAlarmUserInfo",
        "",
        "tag",
        "resetLwt",
        "(Ljava/lang/String;ZLq83/d;)Ljava/lang/Object;",
        "updateTimeZoneWhenOutOfSync",
        "(Lcom/whoop/data/local/room/entity/SmartAlarmUserInfo;Lq83/d;)Ljava/lang/Object;",
        "alarmEnabledOnStrap",
        "disableAlarmOnStrap",
        "Lorg/joda/time/Instant;",
        "newLwt",
        "reportLwtReset",
        "(Lorg/joda/time/Instant;)V",
        "initListeningForAlarmRelatedStrapEvents",
        "alarmRelatedEventsWork",
        "getSmartAlarmUserInfo",
        "Lsf2/a;",
        "alarmId",
        "Lf82/b;",
        "trigger",
        "Ley1/g;",
        "datadogTriggerAction",
        "runAlarm",
        "(Lsf2/a;Lf82/b;Ley1/g;Lq83/d;)Ljava/lang/Object;",
        "exitHighFrequencySyncModeOnStrap",
        "Lcom/whoop/data/remote/domain/dto/DayOfWeekType;",
        "dayOfWeek",
        "Lorg/joda/time/LocalTime;",
        "upperBoundLocalTime",
        "shouldFetchAndCacheSmartAlarmUserInfo",
        "(Lcom/whoop/data/remote/domain/dto/DayOfWeekType;Lorg/joda/time/LocalTime;)Z",
        "dayOfWeekType",
        "",
        "dayOfWeekTypeConversion",
        "(Lcom/whoop/data/remote/domain/dto/DayOfWeekType;)I",
        "enterHighFrequencySyncModeOnStrap",
        "enterHighFreq",
        "alarmTypeRequiresPolling",
        "checkHighFrequencyMode",
        "(Lcom/whoop/data/local/room/entity/SmartAlarmUserInfo;Z)V",
        "Lf82/a;",
        "smartAlarmEventType",
        "smartAlarmTrigger",
        "phoneSetAlarmTimeMillis",
        "Lzj0/h;",
        "responsePacket",
        "saveSmartAlarmDiagnosticEvents",
        "(Lf82/a;Lf82/b;Ljava/lang/String;Lzj0/h;)V",
        "message",
        "Ljava/lang/Exception;",
        "Lkotlin/Exception;",
        "cause",
        "handledException",
        "(Ljava/lang/String;Ljava/lang/Exception;)V",
        "disableHighFrequencyMode",
        "insertResetLwtMetrics",
        "insertUpdateFromStaleCacheMetrics",
        "Lcom/whoop/data/repositories/FeatureFlagRepository;",
        "Lg82/a;",
        "Lcom/whoop/smart/alarm/data/network/api/SmartAlarmApi;",
        "Lin2/h;",
        "Lin2/g;",
        "Lbc3/c0;",
        "Lrf2/a;",
        "Lqf2/c;",
        "Lod1/a0;",
        "Ltd1/b;",
        "Lkp0/e;",
        "Lic/p0;",
        "Lzr2/a;",
        "Liy1/c;",
        "Lwm0/a;",
        "Lcom/whoop/sleep/coach/data/network/api/SleepCoachApi;",
        "Lmi1/e;",
        "Ln73/b;",
        "listenForStrapDrivenAlarm",
        "Ln73/b;",
        "Companion",
        "app_prodStandardRelease"
    }
    k = 0x1
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field public static final $stable:I

.field public static final Companion:Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$Companion;

.field public static final DEFAULT_REFRESH_SCOPE:Ljava/lang/String; = "cycle"

.field private static final HIGH_FREQ_SYNC_MODE_DURATION:Lorg/joda/time/Duration;

.field public static final SMART_ALARM_DISABLE_HIGH_FREQUENCY:Ljava/lang/String; = "DisableHighFrequency"

.field public static final SMART_ALARM_REFRESH:Ljava/lang/String; = "SmartAlarmRefresh"

.field private static final WAKE_WINDOW_SLOP_TIME:Lorg/joda/time/Duration;

.field private static final scopeListenerList:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Ljava/lang/String;",
            ">;"
        }
    .end annotation
.end field


# instance fields
.field private final applicationScope:Lbc3/c0;

.field private final dateAndTimeProvider:Lzr2/a;

.field private final featureFlagRepository:Lcom/whoop/data/repositories/FeatureFlagRepository;

.field private final highFrequencySyncModeStateHolder:Lkp0/e;

.field private listenForStrapDrivenAlarm:Ln73/b;

.field private final lwtResetRepository:Lqf2/c;

.field private final metricWriter:Liy1/c;

.field private final rxJava2SchedulerFactory:Lin2/g;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lin2/g<",
            "Ll73/g;",
            ">;"
        }
    .end annotation
.end field

.field private final schedulerFactory:Lin2/h;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Lin2/h<",
            "Lxg3/k;",
            ">;"
        }
    .end annotation
.end field

.field private final scopeCoordinator:Lwm0/a;

.field private final sleepCoachApi:Lcom/whoop/sleep/coach/data/network/api/SleepCoachApi;

.field private final smartAlarmApi:Lcom/whoop/smart/alarm/data/network/api/SmartAlarmApi;

.field private final smartAlarmDiagnosticDbHelper:Lg82/a;

.field private final smartAlarmHapticsWrapper:Lmi1/e;

.field private final smartAlarmUserInfoDao:Lrf2/a;

.field private final userSessionManager:Lod1/a0;

.field private final whoopStrap:Ltd1/b;

.field private final workManager:Lic/p0;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository;->Companion:Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$Companion;

    const/16 v0, 0x8

    sput v0, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository;->$stable:I

    sget-object v0, Lorg/joda/time/Minutes;->TWO:Lorg/joda/time/Minutes;

    invoke-virtual {v0}, Lorg/joda/time/Minutes;->toStandardDuration()Lorg/joda/time/Duration;

    move-result-object v0

    const-string v1, "toStandardDuration(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sput-object v0, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository;->WAKE_WINDOW_SLOP_TIME:Lorg/joda/time/Duration;

    sget-object v0, Lorg/joda/time/Hours;->TWO:Lorg/joda/time/Hours;

    invoke-virtual {v0}, Lorg/joda/time/Hours;->toStandardDuration()Lorg/joda/time/Duration;

    move-result-object v0

    sput-object v0, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository;->HIGH_FREQ_SYNC_MODE_DURATION:Lorg/joda/time/Duration;

    const-string v0, "DisableHighFrequency"

    const-string v1, "cycle"

    const-string v2, "SmartAlarmRefresh"

    filled-new-array {v2, v0, v1}, [Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    sput-object v0, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository;->scopeListenerList:Ljava/util/List;

    return-void
.end method

.method public constructor <init>(Lcom/whoop/data/repositories/FeatureFlagRepository;Lg82/a;Ltr2/n;Lrr2/c;Lcom/whoop/smart/alarm/data/network/api/SmartAlarmApi;Lin2/h;Lin2/g;Lbc3/c0;Lrf2/a;Lqf2/c;Lod1/a0;Ltd1/b;Lkp0/e;Lic/p0;Lin2/d;Lzr2/a;Liy1/c;Lwm0/a;Lcom/whoop/sleep/coach/data/network/api/SleepCoachApi;Lmi1/e;)V
    .locals 16
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/data/repositories/FeatureFlagRepository;",
            "Lg82/a;",
            "Ltr2/n;",
            "Lrr2/c;",
            "Lcom/whoop/smart/alarm/data/network/api/SmartAlarmApi;",
            "Lin2/h<",
            "+",
            "Lxg3/k;",
            ">;",
            "Lin2/g<",
            "+",
            "Ll73/g;",
            ">;",
            "Lbc3/c0;",
            "Lrf2/a;",
            "Lqf2/c;",
            "Lod1/a0;",
            "Ltd1/b;",
            "Lkp0/e;",
            "Lic/p0;",
            "Lin2/d;",
            "Lzr2/a;",
            "Liy1/c;",
            "Lwm0/a;",
            "Lcom/whoop/sleep/coach/data/network/api/SleepCoachApi;",
            "Lmi1/e;",
            ")V"
        }
    .end annotation

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    move-object/from16 v3, p3

    move-object/from16 v4, p4

    move-object/from16 v5, p5

    move-object/from16 v6, p6

    move-object/from16 v7, p7

    move-object/from16 v8, p8

    move-object/from16 v9, p9

    move-object/from16 v10, p10

    move-object/from16 v11, p11

    move-object/from16 v12, p12

    move-object/from16 v13, p13

    move-object/from16 v14, p14

    move-object/from16 v15, p15

    const-string v0, "featureFlagRepository"

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "smartAlarmDiagnosticDbHelper"

    invoke-static {v2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "log"

    invoke-static {v3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "crashReporter"

    invoke-static {v4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "smartAlarmApi"

    invoke-static {v5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "schedulerFactory"

    invoke-static {v6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "rxJava2SchedulerFactory"

    invoke-static {v7, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "applicationScope"

    invoke-static {v8, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "smartAlarmUserInfoDao"

    invoke-static {v9, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "lwtResetRepository"

    invoke-static {v10, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "userSessionManager"

    invoke-static {v11, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "whoopStrap"

    invoke-static {v12, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "highFrequencySyncModeStateHolder"

    invoke-static {v13, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "workManager"

    invoke-static {v14, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "dispatcherFactory"

    invoke-static {v15, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "dateAndTimeProvider"

    move-object/from16 v14, p16

    invoke-static {v14, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "metricWriter"

    move-object/from16 v14, p17

    invoke-static {v14, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "scopeCoordinator"

    move-object/from16 v14, p18

    invoke-static {v14, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "sleepCoachApi"

    move-object/from16 v14, p19

    invoke-static {v14, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "smartAlarmHapticsWrapper"

    move-object/from16 v14, p20

    invoke-static {v14, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v0, p0

    invoke-direct {v0, v3, v4, v15}, Lhj0/n;-><init>(Ltr2/n;Lrr2/c;Lin2/d;)V

    iput-object v1, v0, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository;->featureFlagRepository:Lcom/whoop/data/repositories/FeatureFlagRepository;

    iput-object v2, v0, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository;->smartAlarmDiagnosticDbHelper:Lg82/a;

    iput-object v5, v0, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository;->smartAlarmApi:Lcom/whoop/smart/alarm/data/network/api/SmartAlarmApi;

    iput-object v6, v0, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository;->schedulerFactory:Lin2/h;

    iput-object v7, v0, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository;->rxJava2SchedulerFactory:Lin2/g;

    iput-object v8, v0, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository;->applicationScope:Lbc3/c0;

    iput-object v9, v0, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository;->smartAlarmUserInfoDao:Lrf2/a;

    iput-object v10, v0, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository;->lwtResetRepository:Lqf2/c;

    iput-object v11, v0, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository;->userSessionManager:Lod1/a0;

    iput-object v12, v0, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository;->whoopStrap:Ltd1/b;

    iput-object v13, v0, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository;->highFrequencySyncModeStateHolder:Lkp0/e;

    move-object/from16 v1, p14

    iput-object v1, v0, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository;->workManager:Lic/p0;

    move-object/from16 v1, p16

    iput-object v1, v0, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository;->dateAndTimeProvider:Lzr2/a;

    move-object/from16 v1, p17

    iput-object v1, v0, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository;->metricWriter:Liy1/c;

    move-object/from16 v1, p18

    iput-object v1, v0, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository;->scopeCoordinator:Lwm0/a;

    move-object/from16 v1, p19

    iput-object v1, v0, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository;->sleepCoachApi:Lcom/whoop/sleep/coach/data/network/api/SleepCoachApi;

    iput-object v14, v0, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository;->smartAlarmHapticsWrapper:Lmi1/e;

    sget-object v1, Lq73/d;->w:Lq73/d;

    iput-object v1, v0, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository;->listenForStrapDrivenAlarm:Ln73/b;

    return-void
.end method

.method public static final synthetic access$alarmEnabledOnStrap(Lcom/whoop/data/repositories/SmartAlarmTriggerRepository;Lq83/d;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1}, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository;->alarmEnabledOnStrap(Lq83/d;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$alarmRelatedEventsWork(Lcom/whoop/data/repositories/SmartAlarmTriggerRepository;Lq83/d;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1}, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository;->alarmRelatedEventsWork(Lq83/d;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$alarmTypeRequiresPolling(Lcom/whoop/data/repositories/SmartAlarmTriggerRepository;Lcom/whoop/data/local/room/entity/SmartAlarmUserInfo;)Z
    .locals 0

    invoke-direct {p0, p1}, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository;->alarmTypeRequiresPolling(Lcom/whoop/data/local/room/entity/SmartAlarmUserInfo;)Z

    move-result p0

    return p0
.end method

.method public static final synthetic access$checkHighFrequencyMode(Lcom/whoop/data/repositories/SmartAlarmTriggerRepository;Lcom/whoop/data/local/room/entity/SmartAlarmUserInfo;Z)V
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository;->checkHighFrequencyMode(Lcom/whoop/data/local/room/entity/SmartAlarmUserInfo;Z)V

    return-void
.end method

.method public static final synthetic access$disableAlarmOnStrap(Lcom/whoop/data/repositories/SmartAlarmTriggerRepository;Lq83/d;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1}, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository;->disableAlarmOnStrap(Lq83/d;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$disableAlarmOnStrapWhenAlarmWasDisabled(Lcom/whoop/data/repositories/SmartAlarmTriggerRepository;Lq83/d;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1}, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository;->disableAlarmOnStrapWhenAlarmWasDisabled(Lq83/d;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$disableHighFrequencyMode(Lcom/whoop/data/repositories/SmartAlarmTriggerRepository;Lq83/d;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1}, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository;->disableHighFrequencyMode(Lq83/d;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$doWorkOnCycleFetch(Lcom/whoop/data/repositories/SmartAlarmTriggerRepository;)V
    .locals 0

    invoke-direct {p0}, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository;->doWorkOnCycleFetch()V

    return-void
.end method

.method public static final synthetic access$enterHighFreq(Lcom/whoop/data/repositories/SmartAlarmTriggerRepository;Lq83/d;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1}, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository;->enterHighFreq(Lq83/d;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$enterHighFrequencySyncModeOnStrap(Lcom/whoop/data/repositories/SmartAlarmTriggerRepository;Lq83/d;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1}, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository;->enterHighFrequencySyncModeOnStrap(Lq83/d;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$exitHighFrequencySyncModeOnStrap(Lcom/whoop/data/repositories/SmartAlarmTriggerRepository;Lq83/d;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1}, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository;->exitHighFrequencySyncModeOnStrap(Lq83/d;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$fetchAndCacheSmartAlarmUserInfo(Lcom/whoop/data/repositories/SmartAlarmTriggerRepository;Lq83/d;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1}, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository;->fetchAndCacheSmartAlarmUserInfo(Lq83/d;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$getCrashReporter(Lcom/whoop/data/repositories/SmartAlarmTriggerRepository;)Lrr2/c;
    .locals 0

    invoke-virtual {p0}, Lhj0/n;->getCrashReporter()Lrr2/c;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$getHighFrequencySyncModeStateHolder$p(Lcom/whoop/data/repositories/SmartAlarmTriggerRepository;)Lkp0/e;
    .locals 0

    iget-object p0, p0, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository;->highFrequencySyncModeStateHolder:Lkp0/e;

    return-object p0
.end method

.method public static final synthetic access$getListenForStrapDrivenAlarm$p(Lcom/whoop/data/repositories/SmartAlarmTriggerRepository;)Ln73/b;
    .locals 0

    iget-object p0, p0, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository;->listenForStrapDrivenAlarm:Ln73/b;

    return-object p0
.end method

.method public static final synthetic access$getLogger(Lcom/whoop/data/repositories/SmartAlarmTriggerRepository;)Ltr2/n;
    .locals 0

    invoke-virtual {p0}, Lhj0/n;->getLogger()Ltr2/n;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$getLwtResetRepository$p(Lcom/whoop/data/repositories/SmartAlarmTriggerRepository;)Lqf2/c;
    .locals 0

    iget-object p0, p0, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository;->lwtResetRepository:Lqf2/c;

    return-object p0
.end method

.method public static final synthetic access$getMetricWriter$p(Lcom/whoop/data/repositories/SmartAlarmTriggerRepository;)Liy1/c;
    .locals 0

    iget-object p0, p0, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository;->metricWriter:Liy1/c;

    return-object p0
.end method

.method public static final synthetic access$getScopeCoordinator$p(Lcom/whoop/data/repositories/SmartAlarmTriggerRepository;)Lwm0/a;
    .locals 0

    iget-object p0, p0, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository;->scopeCoordinator:Lwm0/a;

    return-object p0
.end method

.method public static final synthetic access$getScopeListenerList$cp()Ljava/util/List;
    .locals 1

    sget-object v0, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository;->scopeListenerList:Ljava/util/List;

    return-object v0
.end method

.method public static final synthetic access$getSleepCoachApi$p(Lcom/whoop/data/repositories/SmartAlarmTriggerRepository;)Lcom/whoop/sleep/coach/data/network/api/SleepCoachApi;
    .locals 0

    iget-object p0, p0, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository;->sleepCoachApi:Lcom/whoop/sleep/coach/data/network/api/SleepCoachApi;

    return-object p0
.end method

.method public static final synthetic access$getSmartAlarmApi$p(Lcom/whoop/data/repositories/SmartAlarmTriggerRepository;)Lcom/whoop/smart/alarm/data/network/api/SmartAlarmApi;
    .locals 0

    iget-object p0, p0, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository;->smartAlarmApi:Lcom/whoop/smart/alarm/data/network/api/SmartAlarmApi;

    return-object p0
.end method

.method public static final synthetic access$getSmartAlarmHapticsWrapper$p(Lcom/whoop/data/repositories/SmartAlarmTriggerRepository;)Lmi1/e;
    .locals 0

    iget-object p0, p0, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository;->smartAlarmHapticsWrapper:Lmi1/e;

    return-object p0
.end method

.method public static final synthetic access$getSmartAlarmUserInfo(Lcom/whoop/data/repositories/SmartAlarmTriggerRepository;Lq83/d;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1}, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository;->getSmartAlarmUserInfo(Lq83/d;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$getSmartAlarmUserInfoDao$p(Lcom/whoop/data/repositories/SmartAlarmTriggerRepository;)Lrf2/a;
    .locals 0

    iget-object p0, p0, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository;->smartAlarmUserInfoDao:Lrf2/a;

    return-object p0
.end method

.method public static final synthetic access$getWAKE_WINDOW_SLOP_TIME$cp()Lorg/joda/time/Duration;
    .locals 1

    sget-object v0, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository;->WAKE_WINDOW_SLOP_TIME:Lorg/joda/time/Duration;

    return-object v0
.end method

.method public static final synthetic access$getWhoopStrap$p(Lcom/whoop/data/repositories/SmartAlarmTriggerRepository;)Ltd1/b;
    .locals 0

    iget-object p0, p0, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository;->whoopStrap:Ltd1/b;

    return-object p0
.end method

.method public static final synthetic access$getWorkManager$p(Lcom/whoop/data/repositories/SmartAlarmTriggerRepository;)Lic/p0;
    .locals 0

    iget-object p0, p0, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository;->workManager:Lic/p0;

    return-object p0
.end method

.method public static final synthetic access$initListeningForAlarmRelatedStrapEvents(Lcom/whoop/data/repositories/SmartAlarmTriggerRepository;)V
    .locals 0

    invoke-direct {p0}, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository;->initListeningForAlarmRelatedStrapEvents()V

    return-void
.end method

.method public static final synthetic access$insertResetLwtMetrics(Lcom/whoop/data/repositories/SmartAlarmTriggerRepository;Lq83/d;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1}, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository;->insertResetLwtMetrics(Lq83/d;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$insertUpdateFromStaleCacheMetrics(Lcom/whoop/data/repositories/SmartAlarmTriggerRepository;Lq83/d;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1}, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository;->insertUpdateFromStaleCacheMetrics(Lq83/d;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$reportLwtReset(Lcom/whoop/data/repositories/SmartAlarmTriggerRepository;Lorg/joda/time/Instant;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository;->reportLwtReset(Lorg/joda/time/Instant;)V

    return-void
.end method

.method public static final synthetic access$resetLwt(Lcom/whoop/data/repositories/SmartAlarmTriggerRepository;Ljava/lang/String;ZLq83/d;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1, p2, p3}, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository;->resetLwt(Ljava/lang/String;ZLq83/d;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$runAlarm(Lcom/whoop/data/repositories/SmartAlarmTriggerRepository;Lsf2/a;Lf82/b;Ley1/g;Lq83/d;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1, p2, p3, p4}, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository;->runAlarm(Lsf2/a;Lf82/b;Ley1/g;Lq83/d;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic access$updateTimeZoneWhenOutOfSync(Lcom/whoop/data/repositories/SmartAlarmTriggerRepository;Lcom/whoop/data/local/room/entity/SmartAlarmUserInfo;Lq83/d;)Ljava/lang/Object;
    .locals 0

    invoke-direct {p0, p1, p2}, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository;->updateTimeZoneWhenOutOfSync(Lcom/whoop/data/local/room/entity/SmartAlarmUserInfo;Lq83/d;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method private final alarmEnabledOnStrap(Lq83/d;)Ljava/lang/Object;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lq83/d<",
            "-",
            "Ljava/lang/Boolean;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p1, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$alarmEnabledOnStrap$1;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$alarmEnabledOnStrap$1;

    iget v1, v0, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$alarmEnabledOnStrap$1;->label:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$alarmEnabledOnStrap$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$alarmEnabledOnStrap$1;

    invoke-direct {v0, p0, p1}, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$alarmEnabledOnStrap$1;-><init>(Lcom/whoop/data/repositories/SmartAlarmTriggerRepository;Lq83/d;)V

    :goto_0
    iget-object p1, v0, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$alarmEnabledOnStrap$1;->result:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$alarmEnabledOnStrap$1;->label:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository;->smartAlarmHapticsWrapper:Lmi1/e;

    iput v3, v0, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$alarmEnabledOnStrap$1;->label:I

    invoke-interface {p1, v0}, Lmi1/e;->g(Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_3

    return-object v1

    :cond_3
    :goto_1
    check-cast p1, Lmi1/b;

    instance-of v0, p1, Lmi1/b$a;

    if-eqz v0, :cond_4

    check-cast p1, Lmi1/b$a;

    invoke-virtual {p1}, Lmi1/b$a;->a()Z

    move-result p1

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1

    :cond_4
    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    return-object p1
.end method

.method private final alarmRelatedEventsWork(Lq83/d;)Ljava/lang/Object;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p1, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$alarmRelatedEventsWork$1;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$alarmRelatedEventsWork$1;

    iget v1, v0, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$alarmRelatedEventsWork$1;->label:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$alarmRelatedEventsWork$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$alarmRelatedEventsWork$1;

    invoke-direct {v0, p0, p1}, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$alarmRelatedEventsWork$1;-><init>(Lcom/whoop/data/repositories/SmartAlarmTriggerRepository;Lq83/d;)V

    :goto_0
    iget-object p1, v0, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$alarmRelatedEventsWork$1;->result:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$alarmRelatedEventsWork$1;->label:I

    sget-object v3, Ll83/a0;->a:Ll83/a0;

    const/4 v4, 0x0

    const/4 v5, 0x3

    const/4 v6, 0x1

    const/4 v7, 0x2

    const/4 v8, 0x0

    if-eqz v2, :cond_4

    if-eq v2, v6, :cond_3

    if-eq v2, v7, :cond_2

    if-ne v2, v5, :cond_1

    iget-object v1, v0, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$alarmRelatedEventsWork$1;->L$1:Ljava/lang/Object;

    check-cast v1, Lsf2/a;

    iget-object v0, v0, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$alarmRelatedEventsWork$1;->L$0:Ljava/lang/Object;

    check-cast v0, Lcom/whoop/data/local/room/entity/SmartAlarmUserInfo;

    :try_start_0
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto/16 :goto_7

    :catch_0
    move-exception p1

    goto/16 :goto_6

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    iget-object v2, v0, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$alarmRelatedEventsWork$1;->L$1:Ljava/lang/Object;

    check-cast v2, Lsf2/a;

    iget-object v6, v0, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$alarmRelatedEventsWork$1;->L$0:Ljava/lang/Object;

    check-cast v6, Lcom/whoop/data/local/room/entity/SmartAlarmUserInfo;

    :try_start_1
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_2

    goto :goto_3

    :cond_3
    :try_start_2
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_1

    goto :goto_1

    :cond_4
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    :try_start_3
    iget-object p1, p0, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository;->smartAlarmUserInfoDao:Lrf2/a;

    iput v6, v0, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$alarmRelatedEventsWork$1;->label:I

    invoke-interface {p1, v0}, Lrf2/a;->a(Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_5

    goto :goto_5

    :cond_5
    :goto_1
    check-cast p1, Lcom/whoop/data/local/room/entity/SmartAlarmUserInfo;
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_1

    goto :goto_2

    :catch_1
    move-object p1, v8

    :goto_2
    if-nez p1, :cond_6

    invoke-virtual {p0}, Lhj0/n;->getLogger()Ltr2/n;

    move-result-object p1

    const-string v0, "Couldn\'t generate comp id for strap-driven alarm: Failed to fetch smart alarm user info"

    new-array v1, v4, [Lqr2/a$a;

    invoke-interface {p1, v0, v1}, Ltr2/n;->m(Ljava/lang/String;[Lqr2/a$a;)V

    return-object v3

    :cond_6
    invoke-static {p1}, Lcom/whoop/data/repositories/SmartAlarmTriggerRepositoryKt;->generateCompositeId(Lcom/whoop/data/local/room/entity/SmartAlarmUserInfo;)Lsf2/a;

    move-result-object v2

    :try_start_4
    iget-object p1, p0, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository;->smartAlarmUserInfoDao:Lrf2/a;

    invoke-virtual {v2}, Lsf2/a;->a()Ljava/lang/String;

    move-result-object v6

    iput-object v8, v0, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$alarmRelatedEventsWork$1;->L$0:Ljava/lang/Object;

    iput-object v2, v0, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$alarmRelatedEventsWork$1;->L$1:Ljava/lang/Object;

    iput v7, v0, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$alarmRelatedEventsWork$1;->label:I

    invoke-interface {p1, v6, v0}, Lrf2/a;->e(Ljava/lang/String;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_7

    goto :goto_5

    :cond_7
    :goto_3
    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    if-eqz p1, :cond_8

    const-string p1, "contract violation: db already contained a composite ID for the strap driven alarm. This may be a duplicate alarm. Inserting it anyway."

    invoke-static {p0, p1, v8, v7, v8}, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository;->handledException$default(Lcom/whoop/data/repositories/SmartAlarmTriggerRepository;Ljava/lang/String;Ljava/lang/Exception;ILjava/lang/Object;)V
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_2

    goto :goto_4

    :catch_2
    invoke-virtual {p0}, Lhj0/n;->getLogger()Ltr2/n;

    move-result-object p1

    const-string v6, "Failed to check db for existing comp id after strap-driven alarm. Inserting a new one anyway."

    new-array v4, v4, [Lqr2/a$a;

    invoke-interface {p1, v6, v4}, Ltr2/n;->m(Ljava/lang/String;[Lqr2/a$a;)V

    :cond_8
    :goto_4
    :try_start_5
    iget-object p1, p0, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository;->smartAlarmUserInfoDao:Lrf2/a;

    iput-object v8, v0, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$alarmRelatedEventsWork$1;->L$0:Ljava/lang/Object;

    iput-object v8, v0, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$alarmRelatedEventsWork$1;->L$1:Ljava/lang/Object;

    iput v5, v0, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$alarmRelatedEventsWork$1;->label:I

    invoke-interface {p1, v2, v0}, Lrf2/a;->g(Lsf2/a;Lq83/d;)Ljava/lang/Object;

    move-result-object p1
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_0

    if-ne p1, v1, :cond_9

    :goto_5
    return-object v1

    :goto_6
    const-string v0, "Failed to save alarm composite id record after strap-run alarm"

    invoke-direct {p0, v0, p1}, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository;->handledException(Ljava/lang/String;Ljava/lang/Exception;)V

    :cond_9
    :goto_7
    return-object v3
.end method

.method private final alarmTypeRequiresPolling(Lcom/whoop/data/local/room/entity/SmartAlarmUserInfo;)Z
    .locals 1

    invoke-virtual {p1}, Lcom/whoop/data/local/room/entity/SmartAlarmUserInfo;->getSmartAlarmEnabled()Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Lcom/whoop/data/local/room/entity/SmartAlarmUserInfo;->getGoal()Lcom/whoop/data/remote/domain/dto/SmartAlarmGoalType;

    move-result-object p1

    invoke-static {p1}, Lcom/whoop/data/remote/domain/dto/SmartAlarmUserInfoDtoKt;->isExactAlarm(Lcom/whoop/data/remote/domain/dto/SmartAlarmGoalType;)Z

    move-result p1

    if-nez p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method private final checkHighFrequencyMode(Lcom/whoop/data/local/room/entity/SmartAlarmUserInfo;Z)V
    .locals 3

    iget-object v0, p0, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository;->applicationScope:Lbc3/c0;

    new-instance v1, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$checkHighFrequencyMode$1;

    const/4 v2, 0x0

    invoke-direct {v1, p0, p2, p1, v2}, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$checkHighFrequencyMode$1;-><init>(Lcom/whoop/data/repositories/SmartAlarmTriggerRepository;ZLcom/whoop/data/local/room/entity/SmartAlarmUserInfo;Lq83/d;)V

    const/4 p1, 0x3

    invoke-static {v0, v2, v2, v1, p1}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    return-void
.end method

.method private final dayOfWeekTypeConversion(Lcom/whoop/data/remote/domain/dto/DayOfWeekType;)I
    .locals 1

    sget-object v0, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$WhenMappings;->$EnumSwitchMapping$1:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    aget p1, v0, p1

    packed-switch p1, :pswitch_data_0

    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :pswitch_0
    const/4 p1, 0x7

    return p1

    :pswitch_1
    const/4 p1, 0x6

    return p1

    :pswitch_2
    const/4 p1, 0x5

    return p1

    :pswitch_3
    const/4 p1, 0x4

    return p1

    :pswitch_4
    const/4 p1, 0x3

    return p1

    :pswitch_5
    const/4 p1, 0x2

    return p1

    :pswitch_6
    const/4 p1, 0x1

    return p1

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method private final disableAlarmOnStrap(Lq83/d;)Ljava/lang/Object;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lq83/d<",
            "-",
            "Ljava/lang/Boolean;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p1, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$disableAlarmOnStrap$1;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$disableAlarmOnStrap$1;

    iget v1, v0, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$disableAlarmOnStrap$1;->label:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$disableAlarmOnStrap$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$disableAlarmOnStrap$1;

    invoke-direct {v0, p0, p1}, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$disableAlarmOnStrap$1;-><init>(Lcom/whoop/data/repositories/SmartAlarmTriggerRepository;Lq83/d;)V

    :goto_0
    iget-object p1, v0, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$disableAlarmOnStrap$1;->result:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$disableAlarmOnStrap$1;->label:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository;->smartAlarmHapticsWrapper:Lmi1/e;

    iput v3, v0, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$disableAlarmOnStrap$1;->label:I

    invoke-interface {p1, v0}, Lmi1/e;->a(Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_3

    return-object v1

    :cond_3
    :goto_1
    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    invoke-virtual {p0}, Lhj0/n;->getLogger()Ltr2/n;

    move-result-object v0

    const-string v1, "disable strap alarm success: "

    invoke-static {v1, p1}, Ld;->p(Ljava/lang/String;Z)Ljava/lang/String;

    move-result-object v1

    const/4 v2, 0x0

    new-array v2, v2, [Lqr2/a$a;

    invoke-interface {v0, v1, v2}, Ltr2/n;->t(Ljava/lang/String;[Lqr2/a$a;)V

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1
.end method

.method private final disableAlarmOnStrapWhenAlarmWasDisabled(Lq83/d;)Ljava/lang/Object;
    .locals 17
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    instance-of v2, v1, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$disableAlarmOnStrapWhenAlarmWasDisabled$1;

    if-eqz v2, :cond_0

    move-object v2, v1

    check-cast v2, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$disableAlarmOnStrapWhenAlarmWasDisabled$1;

    iget v3, v2, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$disableAlarmOnStrapWhenAlarmWasDisabled$1;->label:I

    const/high16 v4, -0x80000000

    and-int v5, v3, v4

    if-eqz v5, :cond_0

    sub-int/2addr v3, v4

    iput v3, v2, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$disableAlarmOnStrapWhenAlarmWasDisabled$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v2, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$disableAlarmOnStrapWhenAlarmWasDisabled$1;

    invoke-direct {v2, v0, v1}, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$disableAlarmOnStrapWhenAlarmWasDisabled$1;-><init>(Lcom/whoop/data/repositories/SmartAlarmTriggerRepository;Lq83/d;)V

    :goto_0
    iget-object v1, v2, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$disableAlarmOnStrapWhenAlarmWasDisabled$1;->result:Ljava/lang/Object;

    sget-object v3, Lr83/a;->w:Lr83/a;

    iget v4, v2, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$disableAlarmOnStrapWhenAlarmWasDisabled$1;->label:I

    const-string v5, "Event:"

    const/4 v6, 0x0

    const-string v7, "WakeWindow"

    const/4 v8, 0x0

    packed-switch v4, :pswitch_data_0

    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :pswitch_0
    iget-object v3, v2, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$disableAlarmOnStrapWhenAlarmWasDisabled$1;->L$1:Ljava/lang/Object;

    check-cast v3, Ljava/lang/String;

    iget-object v2, v2, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$disableAlarmOnStrapWhenAlarmWasDisabled$1;->L$0:Ljava/lang/Object;

    check-cast v2, Ljava/lang/Boolean;

    invoke-static {v1}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_7

    :pswitch_1
    iget-object v3, v2, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$disableAlarmOnStrapWhenAlarmWasDisabled$1;->L$1:Ljava/lang/Object;

    check-cast v3, Ljava/lang/String;

    iget-object v2, v2, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$disableAlarmOnStrapWhenAlarmWasDisabled$1;->L$0:Ljava/lang/Object;

    check-cast v2, Ljava/lang/Boolean;

    invoke-static {v1}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_5

    :pswitch_2
    iget-boolean v4, v2, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$disableAlarmOnStrapWhenAlarmWasDisabled$1;->Z$0:Z

    iget-object v9, v2, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$disableAlarmOnStrapWhenAlarmWasDisabled$1;->L$1:Ljava/lang/Object;

    check-cast v9, Ljava/lang/String;

    iget-object v9, v2, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$disableAlarmOnStrapWhenAlarmWasDisabled$1;->L$0:Ljava/lang/Object;

    check-cast v9, Ljava/lang/Boolean;

    invoke-static {v1}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_4

    :pswitch_3
    iget-object v4, v2, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$disableAlarmOnStrapWhenAlarmWasDisabled$1;->L$1:Ljava/lang/Object;

    check-cast v4, Ljava/lang/String;

    iget-object v4, v2, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$disableAlarmOnStrapWhenAlarmWasDisabled$1;->L$0:Ljava/lang/Object;

    check-cast v4, Ljava/lang/Boolean;

    invoke-static {v1}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_3

    :pswitch_4
    iget-object v2, v2, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$disableAlarmOnStrapWhenAlarmWasDisabled$1;->L$0:Ljava/lang/Object;

    check-cast v2, Ljava/lang/Boolean;

    invoke-static {v1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_2

    :pswitch_5
    invoke-static {v1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :pswitch_6
    invoke-static {v1}, Lts/o;->I(Ljava/lang/Object;)V

    const/4 v1, 0x1

    iput v1, v2, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$disableAlarmOnStrapWhenAlarmWasDisabled$1;->label:I

    invoke-direct {v0, v2}, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository;->alarmEnabledOnStrap(Lq83/d;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v3, :cond_1

    goto/16 :goto_6

    :cond_1
    :goto_1
    check-cast v1, Ljava/lang/Boolean;

    sget-object v4, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-static {v1, v4}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_3

    iget-object v1, v0, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository;->metricWriter:Liy1/c;

    new-instance v9, Ljy1/a;

    sget-object v4, Ley1/g;->DISABLE_ALARM:Ley1/g;

    invoke-virtual {v4}, Ley1/g;->getValue()Ljava/lang/String;

    move-result-object v11

    new-instance v12, Ljava/lang/Double;

    const-wide/high16 v13, 0x3ff0000000000000L    # 1.0

    invoke-direct {v12, v13, v14}, Ljava/lang/Double;-><init>(D)V

    sget-object v4, Ley1/f;->ALARM_ALREADY_DISABLED_AND_SYNC:Ley1/f;

    invoke-virtual {v4}, Ley1/f;->getValue()Ljava/lang/String;

    move-result-object v4

    invoke-static {v5, v4}, Lr80/c;->t(Ljava/lang/String;Ljava/lang/String;)Ljava/util/List;

    move-result-object v13

    const/16 v15, 0x11

    const/16 v16, 0x0

    const/4 v10, 0x0

    const/4 v14, 0x0

    invoke-direct/range {v9 .. v16}, Ljy1/a;-><init>(ILjava/lang/String;Ljava/lang/Double;Ljava/util/List;Lcom/whoop/metrics/domain/models/MetricPostType;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput-object v8, v2, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$disableAlarmOnStrapWhenAlarmWasDisabled$1;->L$0:Ljava/lang/Object;

    const/4 v4, 0x2

    iput v4, v2, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$disableAlarmOnStrapWhenAlarmWasDisabled$1;->label:I

    invoke-interface {v1, v9, v2}, Liy1/c;->a(Ljy1/a;Lq83/d;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v3, :cond_2

    goto/16 :goto_6

    :cond_2
    :goto_2
    invoke-virtual {v0}, Lhj0/n;->getLogger()Ltr2/n;

    move-result-object v1

    const-string v2, "Both the strap and the backend are in agreement that the alarm is off"

    new-array v3, v6, [Lqr2/a$a;

    invoke-interface {v1, v7, v2, v3}, Ltr2/n;->x(Ljava/lang/String;Ljava/lang/String;[Lqr2/a$a;)V

    goto/16 :goto_8

    :cond_3
    invoke-virtual {v0}, Lhj0/n;->getLogger()Ltr2/n;

    move-result-object v1

    new-array v4, v6, [Lqr2/a$a;

    const-string v9, "Discordant strap and server alarm state. Since the server is the source of truth, sending a command to disable the alarm on the strap.\nThe app should only be in this state if the user has switched gen4 -> gen3 -> gen4 and also set an alarm while on gen4."

    invoke-interface {v1, v7, v9, v4}, Ltr2/n;->x(Ljava/lang/String;Ljava/lang/String;[Lqr2/a$a;)V

    iput-object v8, v2, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$disableAlarmOnStrapWhenAlarmWasDisabled$1;->L$0:Ljava/lang/Object;

    iput-object v8, v2, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$disableAlarmOnStrapWhenAlarmWasDisabled$1;->L$1:Ljava/lang/Object;

    const/4 v1, 0x3

    iput v1, v2, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$disableAlarmOnStrapWhenAlarmWasDisabled$1;->label:I

    invoke-direct {v0, v2}, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository;->disableAlarmOnStrap(Lq83/d;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v3, :cond_4

    goto/16 :goto_6

    :cond_4
    :goto_3
    check-cast v1, Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v4

    if-eqz v4, :cond_7

    iget-object v1, v0, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository;->lwtResetRepository:Lqf2/c;

    new-instance v9, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$disableAlarmOnStrapWhenAlarmWasDisabled$2;

    invoke-direct {v9, v8}, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$disableAlarmOnStrapWhenAlarmWasDisabled$2;-><init>(Lq83/d;)V

    iput-object v8, v2, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$disableAlarmOnStrapWhenAlarmWasDisabled$1;->L$0:Ljava/lang/Object;

    iput-object v8, v2, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$disableAlarmOnStrapWhenAlarmWasDisabled$1;->L$1:Ljava/lang/Object;

    iput-boolean v4, v2, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$disableAlarmOnStrapWhenAlarmWasDisabled$1;->Z$0:Z

    const/4 v10, 0x4

    iput v10, v2, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$disableAlarmOnStrapWhenAlarmWasDisabled$1;->label:I

    invoke-virtual {v1, v9, v2}, Lqf2/c;->g(Lkotlin/jvm/functions/Function3;Lq83/d;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v3, :cond_5

    goto :goto_6

    :cond_5
    :goto_4
    iget-object v1, v0, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository;->metricWriter:Liy1/c;

    new-instance v9, Ljy1/a;

    sget-object v10, Ley1/g;->DISABLE_ALARM:Ley1/g;

    invoke-virtual {v10}, Ley1/g;->getValue()Ljava/lang/String;

    move-result-object v11

    sget-object v10, Ley1/f;->ALARM_SUCCESSFULLY_DISABLED:Ley1/f;

    invoke-virtual {v10}, Ley1/f;->getValue()Ljava/lang/String;

    move-result-object v10

    invoke-static {v5, v10}, Lr80/c;->t(Ljava/lang/String;Ljava/lang/String;)Ljava/util/List;

    move-result-object v13

    const/16 v15, 0x11

    const/16 v16, 0x0

    const/4 v10, 0x0

    const/4 v12, 0x0

    const/4 v14, 0x0

    invoke-direct/range {v9 .. v16}, Ljy1/a;-><init>(ILjava/lang/String;Ljava/lang/Double;Ljava/util/List;Lcom/whoop/metrics/domain/models/MetricPostType;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput-object v8, v2, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$disableAlarmOnStrapWhenAlarmWasDisabled$1;->L$0:Ljava/lang/Object;

    iput-object v8, v2, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$disableAlarmOnStrapWhenAlarmWasDisabled$1;->L$1:Ljava/lang/Object;

    iput-boolean v4, v2, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$disableAlarmOnStrapWhenAlarmWasDisabled$1;->Z$0:Z

    const/4 v4, 0x5

    iput v4, v2, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$disableAlarmOnStrapWhenAlarmWasDisabled$1;->label:I

    invoke-interface {v1, v9, v2}, Liy1/c;->a(Ljy1/a;Lq83/d;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v3, :cond_6

    goto :goto_6

    :cond_6
    :goto_5
    invoke-virtual {v0}, Lhj0/n;->getLogger()Ltr2/n;

    move-result-object v1

    const-string v2, "Successfully updated strap alarm state to disabled"

    new-array v3, v6, [Lqr2/a$a;

    invoke-interface {v1, v7, v2, v3}, Ltr2/n;->x(Ljava/lang/String;Ljava/lang/String;[Lqr2/a$a;)V

    goto :goto_8

    :cond_7
    iget-object v1, v0, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository;->metricWriter:Liy1/c;

    new-instance v9, Ljy1/a;

    sget-object v5, Ley1/g;->DISABLE_ALARM:Ley1/g;

    invoke-virtual {v5}, Ley1/g;->getValue()Ljava/lang/String;

    move-result-object v11

    sget-object v5, Ley1/e$a;->x:Ley1/e$a;

    invoke-virtual {v5}, Ley1/e;->a()Ljava/lang/String;

    move-result-object v5

    const-string v10, "Error:"

    invoke-static {v10, v5}, Lr80/c;->t(Ljava/lang/String;Ljava/lang/String;)Ljava/util/List;

    move-result-object v13

    const/16 v15, 0x11

    const/16 v16, 0x0

    const/4 v10, 0x0

    const/4 v12, 0x0

    const/4 v14, 0x0

    invoke-direct/range {v9 .. v16}, Ljy1/a;-><init>(ILjava/lang/String;Ljava/lang/Double;Ljava/util/List;Lcom/whoop/metrics/domain/models/MetricPostType;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput-object v8, v2, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$disableAlarmOnStrapWhenAlarmWasDisabled$1;->L$0:Ljava/lang/Object;

    iput-object v8, v2, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$disableAlarmOnStrapWhenAlarmWasDisabled$1;->L$1:Ljava/lang/Object;

    iput-boolean v4, v2, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$disableAlarmOnStrapWhenAlarmWasDisabled$1;->Z$0:Z

    const/4 v4, 0x6

    iput v4, v2, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$disableAlarmOnStrapWhenAlarmWasDisabled$1;->label:I

    invoke-interface {v1, v9, v2}, Liy1/c;->a(Ljy1/a;Lq83/d;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v3, :cond_8

    :goto_6
    return-object v3

    :cond_8
    :goto_7
    invoke-virtual {v0}, Lhj0/n;->getLogger()Ltr2/n;

    move-result-object v1

    const-string v2, "Failed to update strap alarm state to disabled"

    new-array v3, v6, [Lqr2/a$a;

    invoke-interface {v1, v7, v2, v3}, Ltr2/n;->e(Ljava/lang/String;Ljava/lang/String;[Lqr2/a$a;)V

    :goto_8
    sget-object v1, Ll83/a0;->a:Ll83/a0;

    return-object v1

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method private final disableHighFrequencyMode(Lq83/d;)Ljava/lang/Object;
    .locals 5
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p1, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$disableHighFrequencyMode$1;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$disableHighFrequencyMode$1;

    iget v1, v0, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$disableHighFrequencyMode$1;->label:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$disableHighFrequencyMode$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$disableHighFrequencyMode$1;

    invoke-direct {v0, p0, p1}, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$disableHighFrequencyMode$1;-><init>(Lcom/whoop/data/repositories/SmartAlarmTriggerRepository;Lq83/d;)V

    :goto_0
    iget-object p1, v0, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$disableHighFrequencyMode$1;->result:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$disableHighFrequencyMode$1;->label:I

    const/4 v3, 0x2

    const/4 v4, 0x1

    if-eqz v2, :cond_3

    if-eq v2, v4, :cond_2

    if-ne v2, v3, :cond_1

    iget-object v0, v0, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$disableHighFrequencyMode$1;->L$0:Ljava/lang/Object;

    check-cast v0, Lcom/whoop/data/local/room/entity/SmartAlarmUserInfo;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_3

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :cond_3
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iput v4, v0, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$disableHighFrequencyMode$1;->label:I

    invoke-direct {p0, v0}, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository;->getSmartAlarmUserInfo(Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_4

    goto :goto_2

    :cond_4
    :goto_1
    check-cast p1, Lcom/whoop/data/local/room/entity/SmartAlarmUserInfo;

    if-eqz p1, :cond_5

    invoke-virtual {p0, p1}, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository;->isHighFrequencySyncModeWindowOpen(Lcom/whoop/data/local/room/entity/SmartAlarmUserInfo;)Z

    move-result p1

    if-eqz p1, :cond_5

    const/4 p1, 0x0

    iput-object p1, v0, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$disableHighFrequencyMode$1;->L$0:Ljava/lang/Object;

    const/4 p1, 0x0

    iput p1, v0, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$disableHighFrequencyMode$1;->I$0:I

    iput v3, v0, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$disableHighFrequencyMode$1;->label:I

    invoke-direct {p0, v0}, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository;->exitHighFrequencySyncModeOnStrap(Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_5

    :goto_2
    return-object v1

    :cond_5
    :goto_3
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method

.method private final doWorkOnCycleFetch()V
    .locals 4

    iget-object v0, p0, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository;->featureFlagRepository:Lcom/whoop/data/repositories/FeatureFlagRepository;

    const-string v1, "smart_alarm_poll_triggered"

    invoke-interface {v0, v1}, Lcom/whoop/data/repositories/FeatureFlagChecker;->isFeatureEnabled(Ljava/lang/String;)Z

    move-result v0

    const/4 v1, 0x3

    const/4 v2, 0x0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository;->applicationScope:Lbc3/c0;

    new-instance v3, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$doWorkOnCycleFetch$1;

    invoke-direct {v3, p0, v2}, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$doWorkOnCycleFetch$1;-><init>(Lcom/whoop/data/repositories/SmartAlarmTriggerRepository;Lq83/d;)V

    invoke-static {v0, v2, v2, v3, v1}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    :cond_0
    iget-object v0, p0, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository;->applicationScope:Lbc3/c0;

    new-instance v3, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$doWorkOnCycleFetch$2;

    invoke-direct {v3, p0, v2}, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$doWorkOnCycleFetch$2;-><init>(Lcom/whoop/data/repositories/SmartAlarmTriggerRepository;Lq83/d;)V

    invoke-static {v0, v2, v2, v3, v1}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    return-void
.end method

.method public static synthetic e(Lcom/whoop/data/repositories/SmartAlarmTriggerRepository;Lcom/whoop/domain/model/UserSwitchEvent;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository;->start$lambda$0(Lcom/whoop/data/repositories/SmartAlarmTriggerRepository;Lcom/whoop/domain/model/UserSwitchEvent;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method private final enterHighFreq(Lq83/d;)Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lq83/d<",
            "-",
            "Ljava/lang/Boolean;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository;->smartAlarmHapticsWrapper:Lmi1/e;

    sget-object v1, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository;->HIGH_FREQ_SYNC_MODE_DURATION:Lorg/joda/time/Duration;

    invoke-virtual {v1}, Lorg/joda/time/Duration;->getStandardSeconds()J

    move-result-wide v1

    long-to-int v1, v1

    invoke-interface {v0, v1, p1}, Lmi1/e;->b(ILq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method private final enterHighFrequencySyncModeOnStrap(Lq83/d;)Ljava/lang/Object;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lq83/d<",
            "-",
            "Lorg/joda/time/Instant;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p1, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$enterHighFrequencySyncModeOnStrap$1;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$enterHighFrequencySyncModeOnStrap$1;

    iget v1, v0, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$enterHighFrequencySyncModeOnStrap$1;->label:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$enterHighFrequencySyncModeOnStrap$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$enterHighFrequencySyncModeOnStrap$1;

    invoke-direct {v0, p0, p1}, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$enterHighFrequencySyncModeOnStrap$1;-><init>(Lcom/whoop/data/repositories/SmartAlarmTriggerRepository;Lq83/d;)V

    :goto_0
    iget-object p1, v0, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$enterHighFrequencySyncModeOnStrap$1;->result:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$enterHighFrequencySyncModeOnStrap$1;->label:I

    const/4 v3, 0x0

    const-string v4, "WakeWindow"

    const/4 v5, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v5, :cond_1

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    invoke-virtual {p0}, Lhj0/n;->getLogger()Ltr2/n;

    move-result-object p1

    const-string v2, "Attempting to enter high frequency sync mode"

    new-array v6, v3, [Lqr2/a$a;

    invoke-interface {p1, v4, v2, v6}, Ltr2/n;->x(Ljava/lang/String;Ljava/lang/String;[Lqr2/a$a;)V

    iput v5, v0, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$enterHighFrequencySyncModeOnStrap$1;->label:I

    invoke-direct {p0, v0}, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository;->enterHighFreq(Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_3

    return-object v1

    :cond_3
    :goto_1
    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    if-eqz p1, :cond_4

    invoke-static {}, Lorg/joda/time/Instant;->now()Lorg/joda/time/Instant;

    move-result-object p1

    sget-object v0, Lorg/joda/time/Hours;->TWO:Lorg/joda/time/Hours;

    invoke-virtual {v0}, Lorg/joda/time/Hours;->toStandardDuration()Lorg/joda/time/Duration;

    move-result-object v0

    invoke-virtual {p1, v0}, Lorg/joda/time/Instant;->plus(Lorg/joda/time/ReadableDuration;)Lorg/joda/time/Instant;

    move-result-object p1

    invoke-static {p1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    return-object p1

    :cond_4
    invoke-virtual {p0}, Lhj0/n;->getLogger()Ltr2/n;

    move-result-object p1

    const-string v0, "failed to enter high freq mode"

    new-array v1, v3, [Lqr2/a$a;

    invoke-interface {p1, v4, v0, v1}, Ltr2/n;->e(Ljava/lang/String;Ljava/lang/String;[Lqr2/a$a;)V

    sget-object p1, Lorg/joda/time/Instant;->EPOCH:Lorg/joda/time/Instant;

    invoke-static {p1}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    return-object p1
.end method

.method private final exitHighFrequencySyncModeOnStrap(Lq83/d;)Ljava/lang/Object;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lq83/d<",
            "-",
            "Ljava/lang/Boolean;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p1, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$exitHighFrequencySyncModeOnStrap$1;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$exitHighFrequencySyncModeOnStrap$1;

    iget v1, v0, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$exitHighFrequencySyncModeOnStrap$1;->label:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$exitHighFrequencySyncModeOnStrap$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$exitHighFrequencySyncModeOnStrap$1;

    invoke-direct {v0, p0, p1}, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$exitHighFrequencySyncModeOnStrap$1;-><init>(Lcom/whoop/data/repositories/SmartAlarmTriggerRepository;Lq83/d;)V

    :goto_0
    iget-object p1, v0, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$exitHighFrequencySyncModeOnStrap$1;->result:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$exitHighFrequencySyncModeOnStrap$1;->label:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository;->smartAlarmHapticsWrapper:Lmi1/e;

    iput v3, v0, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$exitHighFrequencySyncModeOnStrap$1;->label:I

    invoke-interface {p1, v0}, Lmi1/e;->c(Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_3

    return-object v1

    :cond_3
    :goto_1
    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    const/4 v0, 0x0

    const-string v1, "WakeWindow"

    if-eqz p1, :cond_4

    invoke-virtual {p0}, Lhj0/n;->getLogger()Ltr2/n;

    move-result-object v2

    const-string v3, "Successfully told strap to exit high freq sync mode"

    new-array v0, v0, [Lqr2/a$a;

    invoke-interface {v2, v1, v3, v0}, Ltr2/n;->x(Ljava/lang/String;Ljava/lang/String;[Lqr2/a$a;)V

    goto :goto_2

    :cond_4
    invoke-virtual {p0}, Lhj0/n;->getLogger()Ltr2/n;

    move-result-object v2

    const-string v3, "Failed to tell strap to exit high freq sync mode"

    new-array v0, v0, [Lqr2/a$a;

    invoke-interface {v2, v1, v3, v0}, Ltr2/n;->e(Ljava/lang/String;Ljava/lang/String;[Lqr2/a$a;)V

    :goto_2
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    return-object p1
.end method

.method public static synthetic f(La11/g;Ljava/lang/Object;)Ljava/lang/Boolean;
    .locals 0

    invoke-static {p0, p1}, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository;->start$lambda$3(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Ljava/lang/Boolean;

    move-result-object p0

    return-object p0
.end method

.method private final fetchAndCacheSmartAlarmUserInfo(Lq83/d;)Ljava/lang/Object;
    .locals 14
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    const-string v1, "saving smart alarm user info to database "

    instance-of v0, p1, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$fetchAndCacheSmartAlarmUserInfo$1;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$fetchAndCacheSmartAlarmUserInfo$1;

    iget v2, v0, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$fetchAndCacheSmartAlarmUserInfo$1;->label:I

    const/high16 v3, -0x80000000

    and-int v4, v2, v3

    if-eqz v4, :cond_0

    sub-int/2addr v2, v3

    iput v2, v0, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$fetchAndCacheSmartAlarmUserInfo$1;->label:I

    :goto_0
    move-object v7, v0

    goto :goto_1

    :cond_0
    new-instance v0, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$fetchAndCacheSmartAlarmUserInfo$1;

    invoke-direct {v0, p0, p1}, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$fetchAndCacheSmartAlarmUserInfo$1;-><init>(Lcom/whoop/data/repositories/SmartAlarmTriggerRepository;Lq83/d;)V

    goto :goto_0

    :goto_1
    iget-object p1, v7, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$fetchAndCacheSmartAlarmUserInfo$1;->result:Ljava/lang/Object;

    sget-object v8, Lr83/a;->w:Lr83/a;

    iget v0, v7, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$fetchAndCacheSmartAlarmUserInfo$1;->label:I

    const/4 v9, 0x0

    const-string v10, "WakeWindow"

    sget-object v11, Ll83/a0;->a:Ll83/a0;

    const/4 v12, 0x0

    const/4 v13, 0x2

    const/4 v2, 0x1

    if-eqz v0, :cond_3

    if-eq v0, v2, :cond_2

    if-ne v0, v13, :cond_1

    iget-object v0, v7, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$fetchAndCacheSmartAlarmUserInfo$1;->L$0:Ljava/lang/Object;

    check-cast v0, Lcom/whoop/data/local/room/entity/SmartAlarmUserInfo;

    :try_start_0
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_7

    :catch_0
    move-exception v0

    move-object p1, v0

    goto :goto_6

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    :try_start_1
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    goto :goto_2

    :catch_1
    move-exception v0

    move-object p1, v0

    goto :goto_3

    :cond_3
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    move p1, v2

    :try_start_2
    iget-object v2, p0, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository;->smartAlarmApi:Lcom/whoop/smart/alarm/data/network/api/SmartAlarmApi;

    invoke-virtual {p0}, Lhj0/n;->getLogger()Ltr2/n;

    move-result-object v3

    iget-object v4, p0, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository;->smartAlarmUserInfoDao:Lrf2/a;

    iget-object v5, p0, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository;->metricWriter:Liy1/c;

    iget-object v6, p0, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository;->featureFlagRepository:Lcom/whoop/data/repositories/FeatureFlagRepository;

    iput p1, v7, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$fetchAndCacheSmartAlarmUserInfo$1;->label:I

    invoke-static/range {v2 .. v7}, Lqf2/g;->a(Lcom/whoop/smart/alarm/data/network/api/SmartAlarmApi;Ltr2/n;Lrf2/a;Liy1/c;Lcom/whoop/data/repositories/FeatureFlagChecker;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v8, :cond_4

    goto :goto_5

    :cond_4
    :goto_2
    check-cast p1, Lcom/whoop/data/local/room/entity/SmartAlarmUserInfo;
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_1

    goto :goto_4

    :goto_3
    const-string v0, "WakeWindow Failed to get SmartAlarmUserInfo"

    invoke-virtual {p0, p1, v0}, Lhj0/n;->logRetrofitSuspendException(Ljava/lang/Throwable;Ljava/lang/String;)Ljava/lang/String;

    move-object p1, v12

    :goto_4
    if-nez p1, :cond_5

    return-object v11

    :cond_5
    :try_start_3
    invoke-virtual {p0}, Lhj0/n;->getLogger()Ltr2/n;

    move-result-object v0

    new-instance v2, Ljava/lang/StringBuilder;

    invoke-direct {v2, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v1

    new-array v2, v9, [Lqr2/a$a;

    invoke-interface {v0, v10, v1, v2}, Ltr2/n;->x(Ljava/lang/String;Ljava/lang/String;[Lqr2/a$a;)V

    iget-object v0, p0, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository;->smartAlarmUserInfoDao:Lrf2/a;

    iput-object v12, v7, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$fetchAndCacheSmartAlarmUserInfo$1;->L$0:Ljava/lang/Object;

    iput v13, v7, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$fetchAndCacheSmartAlarmUserInfo$1;->label:I

    invoke-interface {v0, p1, v7}, Lrf2/a;->d(Lcom/whoop/data/local/room/entity/SmartAlarmUserInfo;Lq83/d;)Ljava/lang/Object;

    move-result-object p1
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_0

    if-ne p1, v8, :cond_6

    :goto_5
    return-object v8

    :goto_6
    invoke-virtual {p0}, Lhj0/n;->getLogger()Ltr2/n;

    move-result-object v0

    const-string v1, "Failed to update existing store smart alarm user info"

    new-array v2, v9, [Lqr2/a$a;

    invoke-interface {v0, v10, v1, p1, v2}, Ltr2/n;->f(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;[Lqr2/a$a;)V

    :cond_6
    :goto_7
    return-object v11
.end method

.method public static synthetic g(Ltd1/e;)Ljava/lang/Boolean;
    .locals 0

    invoke-static {p0}, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository;->start$lambda$2(Ltd1/e;)Ljava/lang/Boolean;

    move-result-object p0

    return-object p0
.end method

.method private final getSmartAlarmUserInfo(Lq83/d;)Ljava/lang/Object;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lq83/d<",
            "-",
            "Lcom/whoop/data/local/room/entity/SmartAlarmUserInfo;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p1, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$getSmartAlarmUserInfo$1;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$getSmartAlarmUserInfo$1;

    iget v1, v0, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$getSmartAlarmUserInfo$1;->label:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$getSmartAlarmUserInfo$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$getSmartAlarmUserInfo$1;

    invoke-direct {v0, p0, p1}, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$getSmartAlarmUserInfo$1;-><init>(Lcom/whoop/data/repositories/SmartAlarmTriggerRepository;Lq83/d;)V

    :goto_0
    iget-object p1, v0, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$getSmartAlarmUserInfo$1;->result:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$getSmartAlarmUserInfo$1;->label:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    :try_start_0
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :catch_0
    move-exception p1

    goto :goto_2

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    :try_start_1
    iget-object p1, p0, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository;->smartAlarmUserInfoDao:Lrf2/a;

    iput v3, v0, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$getSmartAlarmUserInfo$1;->label:I

    invoke-interface {p1, v0}, Lrf2/a;->a(Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_3

    return-object v1

    :cond_3
    :goto_1
    check-cast p1, Lcom/whoop/data/local/room/entity/SmartAlarmUserInfo;
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    return-object p1

    :goto_2
    invoke-virtual {p0}, Lhj0/n;->getLogger()Ltr2/n;

    move-result-object v0

    const/4 v1, 0x0

    new-array v1, v1, [Lqr2/a$a;

    const-string v2, "WakeWindow"

    const-string v3, "Failed to get smart alarm info from db"

    invoke-interface {v0, v2, v3, p1, v1}, Ltr2/n;->f(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Throwable;[Lqr2/a$a;)V

    const/4 p1, 0x0

    return-object p1
.end method

.method public static synthetic h(Lcom/whoop/data/repositories/SmartAlarmTriggerRepository;Ltd1/e;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository;->start$lambda$4(Lcom/whoop/data/repositories/SmartAlarmTriggerRepository;Ltd1/e;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method private final handledException(Ljava/lang/String;Ljava/lang/Exception;)V
    .locals 2

    const-string v0, "WakeWindow"

    const/4 v1, 0x0

    invoke-static {p1, v0, v1}, Lyb3/r;->U(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Z)Z

    move-result v0

    if-nez v0, :cond_0

    const-string v0, "WakeWindow "

    invoke-virtual {v0, p1}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object p1

    :cond_0
    new-instance v0, Lcom/whoop/smart/alarm/data/util/SmartAlarmException;

    invoke-direct {v0, p1, p2}, Lcom/whoop/smart/alarm/data/util/SmartAlarmException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    invoke-virtual {p0}, Lhj0/n;->getCrashReporter()Lrr2/c;

    move-result-object p2

    invoke-interface {p2, v0, p1}, Lrr2/c;->g(Ljava/lang/Throwable;Ljava/lang/String;)V

    return-void
.end method

.method public static synthetic handledException$default(Lcom/whoop/data/repositories/SmartAlarmTriggerRepository;Ljava/lang/String;Ljava/lang/Exception;ILjava/lang/Object;)V
    .locals 0

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    const/4 p2, 0x0

    :cond_0
    invoke-direct {p0, p1, p2}, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository;->handledException(Ljava/lang/String;Ljava/lang/Exception;)V

    return-void
.end method

.method public static synthetic i(Lcom/whoop/data/repositories/b;Ljava/lang/Object;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository;->start$lambda$1(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V

    return-void
.end method

.method private final initListeningForAlarmRelatedStrapEvents()V
    .locals 4

    iget-object v0, p0, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository;->listenForStrapDrivenAlarm:Ln73/b;

    invoke-interface {v0}, Ln73/b;->dispose()V

    iget-object v0, p0, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository;->applicationScope:Lbc3/c0;

    new-instance v1, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$initListeningForAlarmRelatedStrapEvents$1;

    const/4 v2, 0x0

    invoke-direct {v1, p0, v2}, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$initListeningForAlarmRelatedStrapEvents$1;-><init>(Lcom/whoop/data/repositories/SmartAlarmTriggerRepository;Lq83/d;)V

    const/4 v3, 0x3

    invoke-static {v0, v2, v2, v1, v3}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    return-void
.end method

.method private final insertResetLwtMetrics(Lq83/d;)Ljava/lang/Object;
    .locals 12
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p1, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$insertResetLwtMetrics$1;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$insertResetLwtMetrics$1;

    iget v1, v0, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$insertResetLwtMetrics$1;->label:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$insertResetLwtMetrics$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$insertResetLwtMetrics$1;

    invoke-direct {v0, p0, p1}, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$insertResetLwtMetrics$1;-><init>(Lcom/whoop/data/repositories/SmartAlarmTriggerRepository;Lq83/d;)V

    :goto_0
    iget-object p1, v0, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$insertResetLwtMetrics$1;->result:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$insertResetLwtMetrics$1;->label:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iget-object p1, p0, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository;->metricWriter:Liy1/c;

    new-instance v4, Ljy1/a;

    sget-object v2, Ley1/g;->RESET_LWT:Ley1/g;

    invoke-virtual {v2}, Ley1/g;->getValue()Ljava/lang/String;

    move-result-object v6

    sget-object v2, Ley1/f;->EMPTY_READ_FROM_CACHE:Ley1/f;

    invoke-virtual {v2}, Ley1/f;->getValue()Ljava/lang/String;

    move-result-object v2

    const-string v5, "Event:"

    invoke-static {v5, v2}, Lr80/c;->t(Ljava/lang/String;Ljava/lang/String;)Ljava/util/List;

    move-result-object v8

    const/16 v10, 0x11

    const/4 v11, 0x0

    const/4 v5, 0x0

    const/4 v7, 0x0

    const/4 v9, 0x0

    invoke-direct/range {v4 .. v11}, Ljy1/a;-><init>(ILjava/lang/String;Ljava/lang/Double;Ljava/util/List;Lcom/whoop/metrics/domain/models/MetricPostType;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput v3, v0, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$insertResetLwtMetrics$1;->label:I

    invoke-interface {p1, v4, v0}, Liy1/c;->a(Ljy1/a;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_3

    return-object v1

    :cond_3
    :goto_1
    invoke-virtual {p0}, Lhj0/n;->getLogger()Ltr2/n;

    move-result-object p1

    const/4 v0, 0x0

    new-array v0, v0, [Lqr2/a$a;

    const-string v1, "WakeWindow"

    const-string v2, "Tried to perform LWT check, but failed to fetch alarm info record"

    invoke-interface {p1, v1, v2, v0}, Ltr2/n;->e(Ljava/lang/String;Ljava/lang/String;[Lqr2/a$a;)V

    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method

.method private final insertUpdateFromStaleCacheMetrics(Lq83/d;)Ljava/lang/Object;
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository;->metricWriter:Liy1/c;

    new-instance v1, Ljy1/a;

    sget-object v2, Ley1/g;->RESET_LWT:Ley1/g;

    invoke-virtual {v2}, Ley1/g;->getValue()Ljava/lang/String;

    move-result-object v3

    sget-object v2, Ley1/f;->ALARM_UPDATED_FROM_STALE_CACHE:Ley1/f;

    invoke-virtual {v2}, Ley1/f;->getValue()Ljava/lang/String;

    move-result-object v2

    const-string v4, "Event:"

    invoke-static {v4, v2}, Lr80/c;->t(Ljava/lang/String;Ljava/lang/String;)Ljava/util/List;

    move-result-object v5

    const/16 v7, 0x11

    const/4 v8, 0x0

    const/4 v2, 0x0

    const/4 v4, 0x0

    const/4 v6, 0x0

    invoke-direct/range {v1 .. v8}, Ljy1/a;-><init>(ILjava/lang/String;Ljava/lang/Double;Ljava/util/List;Lcom/whoop/metrics/domain/models/MetricPostType;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {v0, v1, p1}, Liy1/c;->a(Ljy1/a;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    sget-object v0, Lr83/a;->w:Lr83/a;

    if-ne p1, v0, :cond_0

    return-object p1

    :cond_0
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method

.method public static synthetic j(Lcom/whoop/data/repositories/b;Ljava/lang/Object;)V
    .locals 0

    invoke-static {p0, p1}, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository;->start$lambda$5(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V

    return-void
.end method

.method public static synthetic pollSmartAlarmTrigger$default(Lcom/whoop/data/repositories/SmartAlarmTriggerRepository;ZILjava/lang/Object;)V
    .locals 0

    const/4 p3, 0x1

    and-int/2addr p2, p3

    if-eqz p2, :cond_0

    move p1, p3

    :cond_0
    invoke-virtual {p0, p1}, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository;->pollSmartAlarmTrigger(Z)V

    return-void
.end method

.method private final reportLwtReset(Lorg/joda/time/Instant;)V
    .locals 4

    sget-object v0, Lcom/whoop/smart/alarm/data/network/model/StrapLatestWakeTimeDto;->Factory:Lcom/whoop/smart/alarm/data/network/model/StrapLatestWakeTimeDto$Factory;

    invoke-virtual {v0, p1}, Lcom/whoop/smart/alarm/data/network/model/StrapLatestWakeTimeDto$Factory;->a(Lorg/joda/time/Instant;)Lcom/whoop/smart/alarm/data/network/model/StrapLatestWakeTimeDto;

    move-result-object v0

    iget-object v1, p0, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository;->applicationScope:Lbc3/c0;

    new-instance v2, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$reportLwtReset$1;

    const/4 v3, 0x0

    invoke-direct {v2, p0, v0, p1, v3}, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$reportLwtReset$1;-><init>(Lcom/whoop/data/repositories/SmartAlarmTriggerRepository;Lcom/whoop/smart/alarm/data/network/model/StrapLatestWakeTimeDto;Lorg/joda/time/Instant;Lq83/d;)V

    const/4 p1, 0x3

    invoke-static {v1, v3, v3, v2, p1}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    return-void
.end method

.method private final resetLwt(Ljava/lang/String;ZLq83/d;)Ljava/lang/Object;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Z",
            "Lq83/d<",
            "-",
            "Ljava/lang/Boolean;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p3, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$resetLwt$1;

    if-eqz v0, :cond_0

    move-object v0, p3

    check-cast v0, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$resetLwt$1;

    iget v1, v0, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$resetLwt$1;->label:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$resetLwt$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$resetLwt$1;

    invoke-direct {v0, p0, p3}, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$resetLwt$1;-><init>(Lcom/whoop/data/repositories/SmartAlarmTriggerRepository;Lq83/d;)V

    :goto_0
    iget-object p3, v0, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$resetLwt$1;->result:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$resetLwt$1;->label:I

    const/4 v3, 0x0

    packed-switch v2, :pswitch_data_0

    new-instance p1, Ljava/lang/IllegalStateException;

    const-string p2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, p2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :pswitch_0
    iget-object p1, v0, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$resetLwt$1;->L$2:Ljava/lang/Object;

    check-cast p1, Lcom/whoop/data/local/room/entity/SmartAlarmUserInfo;

    iget-object p1, v0, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$resetLwt$1;->L$1:Ljava/lang/Object;

    check-cast p1, Lkotlin/jvm/internal/g0;

    iget-object p1, v0, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$resetLwt$1;->L$0:Ljava/lang/Object;

    check-cast p1, Ljava/lang/String;

    invoke-static {p3}, Lts/o;->I(Ljava/lang/Object;)V

    return-object p3

    :pswitch_1
    iget-object p1, v0, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$resetLwt$1;->L$1:Ljava/lang/Object;

    check-cast p1, Lkotlin/jvm/internal/g0;

    iget-object p1, v0, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$resetLwt$1;->L$0:Ljava/lang/Object;

    check-cast p1, Ljava/lang/String;

    invoke-static {p3}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_6

    :pswitch_2
    iget-boolean p1, v0, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$resetLwt$1;->Z$0:Z

    iget-object p2, v0, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$resetLwt$1;->L$4:Ljava/lang/Object;

    check-cast p2, Lkotlin/jvm/internal/g0;

    iget-object v2, v0, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$resetLwt$1;->L$3:Ljava/lang/Object;

    check-cast v2, Lorg/joda/time/DateTime;

    iget-object v2, v0, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$resetLwt$1;->L$2:Ljava/lang/Object;

    check-cast v2, Lorg/joda/time/DateTime;

    iget-object v2, v0, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$resetLwt$1;->L$1:Ljava/lang/Object;

    check-cast v2, Lkotlin/jvm/internal/g0;

    iget-object v4, v0, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$resetLwt$1;->L$0:Ljava/lang/Object;

    check-cast v4, Ljava/lang/String;

    invoke-static {p3}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_5

    :pswitch_3
    iget p1, v0, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$resetLwt$1;->I$0:I

    iget-boolean p2, v0, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$resetLwt$1;->Z$0:Z

    iget-object v2, v0, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$resetLwt$1;->L$3:Ljava/lang/Object;

    check-cast v2, Lorg/joda/time/DateTime;

    iget-object v2, v0, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$resetLwt$1;->L$2:Ljava/lang/Object;

    check-cast v2, Lorg/joda/time/DateTime;

    iget-object v2, v0, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$resetLwt$1;->L$1:Ljava/lang/Object;

    check-cast v2, Lkotlin/jvm/internal/g0;

    iget-object v4, v0, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$resetLwt$1;->L$0:Ljava/lang/Object;

    check-cast v4, Ljava/lang/String;

    invoke-static {p3}, Lts/o;->I(Ljava/lang/Object;)V

    :cond_1
    move v7, p2

    move p2, p1

    move p1, v7

    goto/16 :goto_4

    :pswitch_4
    iget p1, v0, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$resetLwt$1;->I$0:I

    iget-boolean p2, v0, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$resetLwt$1;->Z$0:Z

    iget-object v2, v0, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$resetLwt$1;->L$3:Ljava/lang/Object;

    check-cast v2, Lorg/joda/time/DateTime;

    iget-object v2, v0, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$resetLwt$1;->L$2:Ljava/lang/Object;

    check-cast v2, Lorg/joda/time/DateTime;

    iget-object v2, v0, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$resetLwt$1;->L$1:Ljava/lang/Object;

    check-cast v2, Lkotlin/jvm/internal/g0;

    iget-object v4, v0, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$resetLwt$1;->L$0:Ljava/lang/Object;

    check-cast v4, Ljava/lang/String;

    invoke-static {p3}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_3

    :pswitch_5
    iget-object p1, v0, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$resetLwt$1;->L$1:Ljava/lang/Object;

    check-cast p1, Lkotlin/jvm/internal/g0;

    iget-object p1, v0, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$resetLwt$1;->L$0:Ljava/lang/Object;

    check-cast p1, Ljava/lang/String;

    invoke-static {p3}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_2

    :pswitch_6
    iget-boolean p2, v0, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$resetLwt$1;->Z$0:Z

    iget-object p1, v0, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$resetLwt$1;->L$2:Ljava/lang/Object;

    check-cast p1, Lkotlin/jvm/internal/g0;

    iget-object v2, v0, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$resetLwt$1;->L$1:Ljava/lang/Object;

    check-cast v2, Lkotlin/jvm/internal/g0;

    iget-object v4, v0, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$resetLwt$1;->L$0:Ljava/lang/Object;

    check-cast v4, Ljava/lang/String;

    invoke-static {p3}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :pswitch_7
    invoke-static {p3}, Ldc/b;->w(Ljava/lang/Object;)Lkotlin/jvm/internal/g0;

    move-result-object p3

    iput-object p1, v0, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$resetLwt$1;->L$0:Ljava/lang/Object;

    iput-object p3, v0, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$resetLwt$1;->L$1:Ljava/lang/Object;

    iput-object p3, v0, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$resetLwt$1;->L$2:Ljava/lang/Object;

    iput-boolean p2, v0, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$resetLwt$1;->Z$0:Z

    const/4 v2, 0x1

    iput v2, v0, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$resetLwt$1;->label:I

    invoke-direct {p0, v0}, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository;->getSmartAlarmUserInfo(Lq83/d;)Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v1, :cond_2

    goto/16 :goto_7

    :cond_2
    move-object v4, p1

    move-object p1, p3

    move-object p3, v2

    move-object v2, p1

    :goto_1
    iput-object p3, p1, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    invoke-virtual {p0}, Lhj0/n;->getLogger()Ltr2/n;

    move-result-object p1

    iget-object p3, v2, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    new-instance v5, Ljava/lang/StringBuilder;

    const-string v6, "resetLwt from "

    invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v4, " ,  alarmInfo: "

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p3

    const/4 v4, 0x0

    new-array v5, v4, [Lqr2/a$a;

    invoke-interface {p1, p3, v5}, Ltr2/n;->t(Ljava/lang/String;[Lqr2/a$a;)V

    iget-object p1, v2, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    if-nez p1, :cond_4

    iput-object v3, v0, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$resetLwt$1;->L$0:Ljava/lang/Object;

    iput-object v3, v0, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$resetLwt$1;->L$1:Ljava/lang/Object;

    iput-object v3, v0, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$resetLwt$1;->L$2:Ljava/lang/Object;

    iput-boolean p2, v0, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$resetLwt$1;->Z$0:Z

    const/4 p1, 0x2

    iput p1, v0, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$resetLwt$1;->label:I

    invoke-direct {p0, v0}, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository;->insertResetLwtMetrics(Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_3

    goto/16 :goto_7

    :cond_3
    :goto_2
    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    return-object p1

    :cond_4
    check-cast p1, Lcom/whoop/data/local/room/entity/SmartAlarmUserInfo;

    invoke-virtual {p1}, Lcom/whoop/data/local/room/entity/SmartAlarmUserInfo;->getAlarmBoundsTime()Lcom/whoop/data/remote/domain/dto/DateTimeRange;

    move-result-object p1

    if-eqz p1, :cond_7

    invoke-virtual {p1}, Lcom/whoop/data/remote/domain/dto/DateTimeRange;->getUpper()Lorg/joda/time/DateTime;

    move-result-object p1

    if-eqz p1, :cond_7

    sget-object p3, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository;->WAKE_WINDOW_SLOP_TIME:Lorg/joda/time/Duration;

    invoke-virtual {p3}, Lorg/joda/time/Duration;->getStandardMinutes()J

    move-result-wide v5

    long-to-int p3, v5

    invoke-virtual {p1, p3}, Lorg/joda/time/DateTime;->plusMinutes(I)Lorg/joda/time/DateTime;

    move-result-object p1

    iget-object p3, p0, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository;->dateAndTimeProvider:Lzr2/a;

    invoke-interface {p3}, Lzr2/a;->b()J

    move-result-wide v5

    invoke-virtual {p1, v5, v6}, Lorg/joda/time/base/AbstractInstant;->isBefore(J)Z

    move-result p1

    if-eqz p1, :cond_7

    iput-object v3, v0, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$resetLwt$1;->L$0:Ljava/lang/Object;

    iput-object v2, v0, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$resetLwt$1;->L$1:Ljava/lang/Object;

    iput-object v3, v0, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$resetLwt$1;->L$2:Ljava/lang/Object;

    iput-object v3, v0, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$resetLwt$1;->L$3:Ljava/lang/Object;

    iput-boolean p2, v0, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$resetLwt$1;->Z$0:Z

    iput v4, v0, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$resetLwt$1;->I$0:I

    const/4 p1, 0x3

    iput p1, v0, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$resetLwt$1;->label:I

    invoke-direct {p0, v0}, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository;->fetchAndCacheSmartAlarmUserInfo(Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_5

    goto/16 :goto_7

    :cond_5
    move p1, v4

    :goto_3
    iput-object v3, v0, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$resetLwt$1;->L$0:Ljava/lang/Object;

    iput-object v2, v0, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$resetLwt$1;->L$1:Ljava/lang/Object;

    iput-object v3, v0, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$resetLwt$1;->L$2:Ljava/lang/Object;

    iput-object v3, v0, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$resetLwt$1;->L$3:Ljava/lang/Object;

    iput-boolean p2, v0, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$resetLwt$1;->Z$0:Z

    iput p1, v0, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$resetLwt$1;->I$0:I

    const/4 p3, 0x4

    iput p3, v0, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$resetLwt$1;->label:I

    invoke-direct {p0, v0}, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository;->insertUpdateFromStaleCacheMetrics(Lq83/d;)Ljava/lang/Object;

    move-result-object p3

    if-ne p3, v1, :cond_1

    goto :goto_7

    :goto_4
    iput-object v3, v0, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$resetLwt$1;->L$0:Ljava/lang/Object;

    iput-object v2, v0, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$resetLwt$1;->L$1:Ljava/lang/Object;

    iput-object v3, v0, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$resetLwt$1;->L$2:Ljava/lang/Object;

    iput-object v3, v0, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$resetLwt$1;->L$3:Ljava/lang/Object;

    iput-object v2, v0, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$resetLwt$1;->L$4:Ljava/lang/Object;

    iput-boolean p1, v0, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$resetLwt$1;->Z$0:Z

    iput p2, v0, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$resetLwt$1;->I$0:I

    const/4 p2, 0x5

    iput p2, v0, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$resetLwt$1;->label:I

    invoke-direct {p0, v0}, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository;->getSmartAlarmUserInfo(Lq83/d;)Ljava/lang/Object;

    move-result-object p3

    if-ne p3, v1, :cond_6

    goto :goto_7

    :cond_6
    move-object p2, v2

    :goto_5
    iput-object p3, p2, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    move p2, p1

    :cond_7
    iget-object p1, v2, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    if-nez p1, :cond_9

    iput-object v3, v0, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$resetLwt$1;->L$0:Ljava/lang/Object;

    iput-object v3, v0, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$resetLwt$1;->L$1:Ljava/lang/Object;

    iput-object v3, v0, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$resetLwt$1;->L$2:Ljava/lang/Object;

    iput-object v3, v0, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$resetLwt$1;->L$3:Ljava/lang/Object;

    iput-object v3, v0, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$resetLwt$1;->L$4:Ljava/lang/Object;

    iput-boolean p2, v0, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$resetLwt$1;->Z$0:Z

    const/4 p1, 0x6

    iput p1, v0, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$resetLwt$1;->label:I

    invoke-direct {p0, v0}, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository;->insertResetLwtMetrics(Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_8

    goto :goto_7

    :cond_8
    :goto_6
    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    return-object p1

    :cond_9
    check-cast p1, Lcom/whoop/data/local/room/entity/SmartAlarmUserInfo;

    if-nez p1, :cond_a

    sget-object p1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    return-object p1

    :cond_a
    iget-object p3, p0, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository;->lwtResetRepository:Lqf2/c;

    new-instance v2, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$resetLwt$3;

    invoke-direct {v2, p0, p1, p2, v3}, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$resetLwt$3;-><init>(Lcom/whoop/data/repositories/SmartAlarmTriggerRepository;Lcom/whoop/data/local/room/entity/SmartAlarmUserInfo;ZLq83/d;)V

    iput-object v3, v0, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$resetLwt$1;->L$0:Ljava/lang/Object;

    iput-object v3, v0, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$resetLwt$1;->L$1:Ljava/lang/Object;

    iput-object v3, v0, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$resetLwt$1;->L$2:Ljava/lang/Object;

    iput-object v3, v0, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$resetLwt$1;->L$3:Ljava/lang/Object;

    iput-object v3, v0, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$resetLwt$1;->L$4:Ljava/lang/Object;

    iput-boolean p2, v0, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$resetLwt$1;->Z$0:Z

    const/4 p1, 0x7

    iput p1, v0, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$resetLwt$1;->label:I

    invoke-virtual {p3, v2, v0}, Lqf2/c;->g(Lkotlin/jvm/functions/Function3;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_b

    :goto_7
    return-object v1

    :cond_b
    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method public static synthetic resetLwt$default(Lcom/whoop/data/repositories/SmartAlarmTriggerRepository;Ljava/lang/String;ZLq83/d;ILjava/lang/Object;)Ljava/lang/Object;
    .locals 0

    and-int/lit8 p4, p4, 0x2

    if-eqz p4, :cond_0

    const/4 p2, 0x1

    :cond_0
    invoke-direct {p0, p1, p2, p3}, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository;->resetLwt(Ljava/lang/String;ZLq83/d;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method private final runAlarm(Lsf2/a;Lf82/b;Ley1/g;Lq83/d;)Ljava/lang/Object;
    .locals 27
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lsf2/a;",
            "Lf82/b;",
            "Ley1/g;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    move-object/from16 v1, p0

    move-object/from16 v0, p2

    move-object/from16 v2, p4

    instance-of v3, v2, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$runAlarm$1;

    if-eqz v3, :cond_0

    move-object v3, v2

    check-cast v3, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$runAlarm$1;

    iget v4, v3, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$runAlarm$1;->label:I

    const/high16 v5, -0x80000000

    and-int v6, v4, v5

    if-eqz v6, :cond_0

    sub-int/2addr v4, v5

    iput v4, v3, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$runAlarm$1;->label:I

    :goto_0
    move-object v9, v3

    goto :goto_1

    :cond_0
    new-instance v3, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$runAlarm$1;

    invoke-direct {v3, v1, v2}, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$runAlarm$1;-><init>(Lcom/whoop/data/repositories/SmartAlarmTriggerRepository;Lq83/d;)V

    goto :goto_0

    :goto_1
    iget-object v2, v9, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$runAlarm$1;->result:Ljava/lang/Object;

    sget-object v3, Lr83/a;->w:Lr83/a;

    iget v4, v9, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$runAlarm$1;->label:I

    sget-object v12, Ll83/a0;->a:Ll83/a0;

    const-string v13, "Error:"

    const/4 v14, 0x0

    const-string v15, "WakeWindow"

    const/4 v5, 0x2

    const/4 v6, 0x0

    packed-switch v4, :pswitch_data_0

    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :pswitch_0
    iget-object v0, v9, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$runAlarm$1;->L$3:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    iget-object v3, v9, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$runAlarm$1;->L$2:Ljava/lang/Object;

    check-cast v3, Ley1/g;

    iget-object v3, v9, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$runAlarm$1;->L$1:Ljava/lang/Object;

    check-cast v3, Lf82/b;

    iget-object v3, v9, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$runAlarm$1;->L$0:Ljava/lang/Object;

    check-cast v3, Lsf2/a;

    invoke-static {v2}, Lts/o;->I(Ljava/lang/Object;)V

    move-object v2, v6

    goto/16 :goto_d

    :pswitch_1
    iget-object v0, v9, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$runAlarm$1;->L$3:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    iget-object v0, v9, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$runAlarm$1;->L$2:Ljava/lang/Object;

    check-cast v0, Ley1/g;

    iget-object v0, v9, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$runAlarm$1;->L$1:Ljava/lang/Object;

    check-cast v0, Lf82/b;

    iget-object v0, v9, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$runAlarm$1;->L$0:Ljava/lang/Object;

    check-cast v0, Lsf2/a;

    invoke-static {v2}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_b

    :pswitch_2
    iget-boolean v0, v9, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$runAlarm$1;->Z$0:Z

    iget-object v4, v9, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$runAlarm$1;->L$4:Ljava/lang/Object;

    check-cast v4, Ljava/lang/Exception;

    iget-object v5, v9, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$runAlarm$1;->L$3:Ljava/lang/Object;

    check-cast v5, Ljava/lang/String;

    iget-object v7, v9, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$runAlarm$1;->L$2:Ljava/lang/Object;

    check-cast v7, Ley1/g;

    iget-object v7, v9, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$runAlarm$1;->L$1:Ljava/lang/Object;

    check-cast v7, Lf82/b;

    iget-object v7, v9, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$runAlarm$1;->L$0:Ljava/lang/Object;

    check-cast v7, Lsf2/a;

    invoke-static {v2}, Lts/o;->I(Ljava/lang/Object;)V

    move-object v2, v6

    goto/16 :goto_9

    :pswitch_3
    iget-boolean v4, v9, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$runAlarm$1;->Z$0:Z

    iget-object v0, v9, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$runAlarm$1;->L$3:Ljava/lang/Object;

    move-object v5, v0

    check-cast v5, Ljava/lang/String;

    iget-object v0, v9, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$runAlarm$1;->L$2:Ljava/lang/Object;

    move-object v7, v0

    check-cast v7, Ley1/g;

    iget-object v0, v9, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$runAlarm$1;->L$1:Ljava/lang/Object;

    check-cast v0, Lf82/b;

    iget-object v0, v9, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$runAlarm$1;->L$0:Ljava/lang/Object;

    check-cast v0, Lsf2/a;

    :try_start_0
    invoke-static {v2}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    move-object v2, v6

    goto/16 :goto_a

    :catch_0
    move-exception v0

    move v2, v4

    move-object v4, v0

    move v0, v2

    move-object v2, v6

    goto/16 :goto_8

    :pswitch_4
    iget-boolean v0, v9, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$runAlarm$1;->Z$0:Z

    iget-object v4, v9, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$runAlarm$1;->L$3:Ljava/lang/Object;

    check-cast v4, Ljava/lang/String;

    iget-object v5, v9, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$runAlarm$1;->L$2:Ljava/lang/Object;

    check-cast v5, Ley1/g;

    iget-object v7, v9, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$runAlarm$1;->L$1:Ljava/lang/Object;

    check-cast v7, Lf82/b;

    iget-object v7, v9, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$runAlarm$1;->L$0:Ljava/lang/Object;

    check-cast v7, Lsf2/a;

    invoke-static {v2}, Lts/o;->I(Ljava/lang/Object;)V

    move v8, v0

    move-object v2, v6

    goto/16 :goto_7

    :pswitch_5
    iget-boolean v0, v9, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$runAlarm$1;->Z$0:Z

    iget-object v4, v9, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$runAlarm$1;->L$4:Ljava/lang/Object;

    check-cast v4, Ljava/lang/String;

    iget-object v4, v9, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$runAlarm$1;->L$3:Ljava/lang/Object;

    check-cast v4, Ljava/lang/String;

    iget-object v5, v9, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$runAlarm$1;->L$2:Ljava/lang/Object;

    check-cast v5, Ley1/g;

    iget-object v7, v9, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$runAlarm$1;->L$1:Ljava/lang/Object;

    check-cast v7, Lf82/b;

    iget-object v7, v9, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$runAlarm$1;->L$0:Ljava/lang/Object;

    check-cast v7, Lsf2/a;

    invoke-static {v2}, Lts/o;->I(Ljava/lang/Object;)V

    move-object v14, v4

    move-object v4, v2

    move-object v2, v6

    goto/16 :goto_5

    :pswitch_6
    iget-object v0, v9, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$runAlarm$1;->L$3:Ljava/lang/Object;

    check-cast v0, Ljava/lang/String;

    iget-object v4, v9, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$runAlarm$1;->L$2:Ljava/lang/Object;

    check-cast v4, Ley1/g;

    iget-object v7, v9, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$runAlarm$1;->L$1:Ljava/lang/Object;

    check-cast v7, Lf82/b;

    iget-object v8, v9, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$runAlarm$1;->L$0:Ljava/lang/Object;

    check-cast v8, Lsf2/a;

    invoke-static {v2}, Lts/o;->I(Ljava/lang/Object;)V

    move-object/from16 v26, v4

    move-object v4, v0

    move-object v0, v8

    move-object v8, v2

    move-object/from16 v2, v26

    goto :goto_3

    :pswitch_7
    invoke-static {v2}, Lts/o;->I(Ljava/lang/Object;)V

    sget-object v2, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$WhenMappings;->$EnumSwitchMapping$0:[I

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v4

    aget v2, v2, v4

    const/4 v4, 0x1

    if-eq v2, v4, :cond_2

    if-eq v2, v5, :cond_1

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v2

    goto :goto_2

    :cond_1
    const-string v2, "push"

    goto :goto_2

    :cond_2
    const-string v2, "poll"

    :goto_2
    invoke-virtual {v1}, Lhj0/n;->getLogger()Ltr2/n;

    move-result-object v7

    const-string v8, "Attempting to run alarm command from "

    invoke-static {v8, v2}, Ld;->o(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    new-array v10, v14, [Lqr2/a$a;

    invoke-interface {v7, v15, v8, v10}, Ltr2/n;->x(Ljava/lang/String;Ljava/lang/String;[Lqr2/a$a;)V

    iget-object v7, v1, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository;->smartAlarmHapticsWrapper:Lmi1/e;

    move-object/from16 v8, p1

    iput-object v8, v9, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$runAlarm$1;->L$0:Ljava/lang/Object;

    iput-object v0, v9, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$runAlarm$1;->L$1:Ljava/lang/Object;

    move-object/from16 v10, p3

    iput-object v10, v9, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$runAlarm$1;->L$2:Ljava/lang/Object;

    iput-object v2, v9, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$runAlarm$1;->L$3:Ljava/lang/Object;

    iput v4, v9, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$runAlarm$1;->label:I

    invoke-interface {v7, v0, v9}, Lmi1/e;->d(Lf82/b;Lq83/d;)Ljava/lang/Object;

    move-result-object v4

    if-ne v4, v3, :cond_3

    goto/16 :goto_c

    :cond_3
    move-object v7, v0

    move-object v0, v8

    move-object v8, v4

    move-object v4, v2

    move-object v2, v10

    :goto_3
    check-cast v8, Ljava/lang/Boolean;

    invoke-virtual {v8}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v8

    if-eqz v8, :cond_c

    sget-object v10, Lf82/b;->LONG_REQUEST_POLL:Lf82/b;

    if-eq v7, v10, :cond_5

    sget-object v10, Lf82/b;->SMART_ALARM_PUSH:Lf82/b;

    if-ne v7, v10, :cond_4

    goto :goto_4

    :cond_4
    move-object v7, v0

    move-object v5, v2

    move-object v2, v6

    goto/16 :goto_6

    :cond_5
    :goto_4
    iget-object v7, v1, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository;->dateAndTimeProvider:Lzr2/a;

    const/16 v20, 0x7

    const/16 v21, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    move-object/from16 v16, v7

    invoke-static/range {v16 .. v21}, Lzr2/b;->c(Lzr2/a;Lorg/joda/time/LocalDate;Lorg/joda/time/LocalTime;Lorg/joda/time/DateTimeZone;ILjava/lang/Object;)Lorg/joda/time/DateTime;

    move-result-object v7

    sget-object v10, Lorg/joda/time/DateTimeZone;->UTC:Lorg/joda/time/DateTimeZone;

    invoke-virtual {v7, v10}, Lorg/joda/time/DateTime;->withZone(Lorg/joda/time/DateTimeZone;)Lorg/joda/time/DateTime;

    move-result-object v7

    invoke-virtual {v7}, Lorg/joda/time/base/AbstractDateTime;->toString()Ljava/lang/String;

    move-result-object v7

    const-string v10, "toString(...)"

    invoke-static {v7, v10}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v10, Lu02/a;->a:Lu02/a$a;

    invoke-virtual {v1}, Lhj0/n;->getLogger()Ltr2/n;

    move-result-object v11

    new-instance v14, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$runAlarm$2;

    invoke-direct {v14, v1, v7, v6}, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$runAlarm$2;-><init>(Lcom/whoop/data/repositories/SmartAlarmTriggerRepository;Ljava/lang/String;Lq83/d;)V

    iput-object v0, v9, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$runAlarm$1;->L$0:Ljava/lang/Object;

    iput-object v6, v9, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$runAlarm$1;->L$1:Ljava/lang/Object;

    iput-object v2, v9, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$runAlarm$1;->L$2:Ljava/lang/Object;

    iput-object v4, v9, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$runAlarm$1;->L$3:Ljava/lang/Object;

    iput-object v6, v9, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$runAlarm$1;->L$4:Ljava/lang/Object;

    iput-boolean v8, v9, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$runAlarm$1;->Z$0:Z

    iput v5, v9, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$runAlarm$1;->label:I

    move-object v5, v6

    const/4 v6, 0x0

    const/4 v7, 0x0

    move-object/from16 v16, v4

    move-object v4, v10

    const/4 v10, 0x6

    move-object/from16 v17, v5

    move-object v5, v11

    const/4 v11, 0x0

    move-object/from16 v26, v16

    move-object/from16 v16, v0

    move v0, v8

    move-object v8, v14

    move-object/from16 v14, v26

    move-object/from16 v26, v17

    move-object/from16 v17, v2

    move-object/from16 v2, v26

    invoke-static/range {v4 .. v11}, Lu02/a$a;->b(Lu02/a$a;Ltr2/n;Lrr2/c;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lq83/d;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    if-ne v4, v3, :cond_6

    goto/16 :goto_c

    :cond_6
    move-object/from16 v7, v16

    move-object/from16 v5, v17

    :goto_5
    check-cast v4, Lu02/a;

    instance-of v6, v4, Lu02/a$b;

    if-eqz v6, :cond_7

    invoke-virtual {v1}, Lhj0/n;->getLogger()Ltr2/n;

    move-result-object v6

    check-cast v4, Lu02/a$b;

    invoke-virtual {v4}, Lu02/a$b;->a()Ljava/lang/String;

    move-result-object v4

    const-string v8, "failed to override alarm after smart alarm trigger because: "

    invoke-static {v8, v4}, Ld;->o(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    const/4 v8, 0x0

    new-array v10, v8, [Lqr2/a$a;

    invoke-interface {v6, v15, v4, v10}, Ltr2/n;->x(Ljava/lang/String;Ljava/lang/String;[Lqr2/a$a;)V

    :cond_7
    move v8, v0

    move-object v4, v14

    :goto_6
    iget-object v0, v1, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository;->metricWriter:Liy1/c;

    new-instance v16, Ljy1/a;

    invoke-virtual {v5}, Ley1/g;->getValue()Ljava/lang/String;

    move-result-object v18

    sget-object v6, Ley1/f;->SUCCESSFULLY_TRIGGERED_ALARM:Ley1/f;

    invoke-virtual {v6}, Ley1/f;->getValue()Ljava/lang/String;

    move-result-object v6

    const-string v10, "Event:"

    invoke-static {v10, v6}, Lr80/c;->t(Ljava/lang/String;Ljava/lang/String;)Ljava/util/List;

    move-result-object v20

    const/16 v22, 0x11

    const/16 v23, 0x0

    const/16 v17, 0x0

    const/16 v19, 0x0

    const/16 v21, 0x0

    invoke-direct/range {v16 .. v23}, Ljy1/a;-><init>(ILjava/lang/String;Ljava/lang/Double;Ljava/util/List;Lcom/whoop/metrics/domain/models/MetricPostType;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object/from16 v6, v16

    iput-object v7, v9, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$runAlarm$1;->L$0:Ljava/lang/Object;

    iput-object v2, v9, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$runAlarm$1;->L$1:Ljava/lang/Object;

    iput-object v5, v9, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$runAlarm$1;->L$2:Ljava/lang/Object;

    iput-object v4, v9, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$runAlarm$1;->L$3:Ljava/lang/Object;

    iput-object v2, v9, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$runAlarm$1;->L$4:Ljava/lang/Object;

    iput-boolean v8, v9, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$runAlarm$1;->Z$0:Z

    const/4 v10, 0x3

    iput v10, v9, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$runAlarm$1;->label:I

    invoke-interface {v0, v6, v9}, Liy1/c;->a(Ljy1/a;Lq83/d;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v3, :cond_8

    goto/16 :goto_c

    :cond_8
    :goto_7
    invoke-virtual {v1}, Lhj0/n;->getLogger()Ltr2/n;

    move-result-object v0

    const-string v6, "Run alarm command success from "

    invoke-static {v6, v4}, Ld;->o(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    const/4 v10, 0x0

    new-array v10, v10, [Lqr2/a$a;

    invoke-interface {v0, v15, v6, v10}, Ltr2/n;->x(Ljava/lang/String;Ljava/lang/String;[Lqr2/a$a;)V

    :try_start_1
    iget-object v0, v1, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository;->smartAlarmUserInfoDao:Lrf2/a;

    iput-object v2, v9, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$runAlarm$1;->L$0:Ljava/lang/Object;

    iput-object v2, v9, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$runAlarm$1;->L$1:Ljava/lang/Object;

    iput-object v5, v9, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$runAlarm$1;->L$2:Ljava/lang/Object;

    iput-object v4, v9, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$runAlarm$1;->L$3:Ljava/lang/Object;

    iput-boolean v8, v9, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$runAlarm$1;->Z$0:Z

    const/4 v6, 0x4

    iput v6, v9, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$runAlarm$1;->label:I

    invoke-interface {v0, v7, v9}, Lrf2/a;->g(Lsf2/a;Lq83/d;)Ljava/lang/Object;

    move-result-object v0
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_1

    if-ne v0, v3, :cond_9

    goto/16 :goto_c

    :cond_9
    move v4, v8

    goto :goto_a

    :catch_1
    move-exception v0

    move-object v7, v5

    move-object v5, v4

    move-object v4, v0

    move v0, v8

    :goto_8
    iget-object v6, v1, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository;->metricWriter:Liy1/c;

    new-instance v14, Ljy1/a;

    invoke-virtual {v7}, Ley1/g;->getValue()Ljava/lang/String;

    move-result-object v16

    sget-object v7, Ley1/j$b;->x:Ley1/j$b;

    invoke-virtual {v7}, Ley1/j;->a()Ljava/lang/String;

    move-result-object v7

    invoke-static {v13, v7}, Lr80/c;->t(Ljava/lang/String;Ljava/lang/String;)Ljava/util/List;

    move-result-object v18

    const/16 v20, 0x11

    const/16 v21, 0x0

    const/4 v15, 0x0

    const/16 v17, 0x0

    const/16 v19, 0x0

    invoke-direct/range {v14 .. v21}, Ljy1/a;-><init>(ILjava/lang/String;Ljava/lang/Double;Ljava/util/List;Lcom/whoop/metrics/domain/models/MetricPostType;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    iput-object v2, v9, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$runAlarm$1;->L$0:Ljava/lang/Object;

    iput-object v2, v9, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$runAlarm$1;->L$1:Ljava/lang/Object;

    iput-object v2, v9, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$runAlarm$1;->L$2:Ljava/lang/Object;

    iput-object v5, v9, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$runAlarm$1;->L$3:Ljava/lang/Object;

    iput-object v4, v9, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$runAlarm$1;->L$4:Ljava/lang/Object;

    iput-boolean v0, v9, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$runAlarm$1;->Z$0:Z

    const/4 v7, 0x5

    iput v7, v9, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$runAlarm$1;->label:I

    invoke-interface {v6, v14, v9}, Liy1/c;->a(Ljy1/a;Lq83/d;)Ljava/lang/Object;

    move-result-object v6

    if-ne v6, v3, :cond_a

    goto :goto_c

    :cond_a
    :goto_9
    const-string v6, "WakeWindow Successfully ran alarm from "

    const-string v7, ", but failed to add comp alarm id to DB"

    invoke-static {v6, v5, v7}, Ldc/b;->o(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    invoke-direct {v1, v5, v4}, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository;->handledException(Ljava/lang/String;Ljava/lang/Exception;)V

    move v4, v0

    :goto_a
    iput-object v2, v9, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$runAlarm$1;->L$0:Ljava/lang/Object;

    iput-object v2, v9, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$runAlarm$1;->L$1:Ljava/lang/Object;

    iput-object v2, v9, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$runAlarm$1;->L$2:Ljava/lang/Object;

    iput-object v2, v9, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$runAlarm$1;->L$3:Ljava/lang/Object;

    iput-object v2, v9, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$runAlarm$1;->L$4:Ljava/lang/Object;

    iput-boolean v4, v9, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$runAlarm$1;->Z$0:Z

    const/4 v0, 0x6

    iput v0, v9, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$runAlarm$1;->label:I

    invoke-direct {v1, v9}, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository;->exitHighFrequencySyncModeOnStrap(Lq83/d;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v3, :cond_b

    goto :goto_c

    :cond_b
    :goto_b
    return-object v12

    :cond_c
    move-object/from16 v17, v2

    move-object v14, v4

    move-object v2, v6

    move v0, v8

    iget-object v4, v1, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository;->whoopStrap:Ltd1/b;

    invoke-interface {v4}, Ltd1/b;->A()Ltd1/e;

    move-result-object v4

    invoke-virtual {v4}, Ltd1/e;->isReady()Z

    move-result v4

    if-eqz v4, :cond_e

    iget-object v4, v1, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository;->metricWriter:Liy1/c;

    new-instance v18, Ljy1/a;

    invoke-virtual/range {v17 .. v17}, Ley1/g;->getValue()Ljava/lang/String;

    move-result-object v20

    sget-object v6, Ley1/j$a;->x:Ley1/j$a;

    invoke-virtual {v6}, Ley1/j;->a()Ljava/lang/String;

    move-result-object v6

    invoke-static {v13, v6}, Lr80/c;->t(Ljava/lang/String;Ljava/lang/String;)Ljava/util/List;

    move-result-object v22

    const/16 v24, 0x11

    const/16 v25, 0x0

    const/16 v19, 0x0

    const/16 v21, 0x0

    const/16 v23, 0x0

    invoke-direct/range {v18 .. v25}, Ljy1/a;-><init>(ILjava/lang/String;Ljava/lang/Double;Ljava/util/List;Lcom/whoop/metrics/domain/models/MetricPostType;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object/from16 v6, v18

    iput-object v2, v9, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$runAlarm$1;->L$0:Ljava/lang/Object;

    iput-object v2, v9, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$runAlarm$1;->L$1:Ljava/lang/Object;

    iput-object v2, v9, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$runAlarm$1;->L$2:Ljava/lang/Object;

    iput-object v14, v9, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$runAlarm$1;->L$3:Ljava/lang/Object;

    iput-boolean v0, v9, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$runAlarm$1;->Z$0:Z

    const/4 v0, 0x7

    iput v0, v9, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$runAlarm$1;->label:I

    invoke-interface {v4, v6, v9}, Liy1/c;->a(Ljy1/a;Lq83/d;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v3, :cond_d

    :goto_c
    return-object v3

    :cond_d
    move-object v0, v14

    :goto_d
    const-string v3, "Failed to tell strap to run alarm from "

    invoke-static {v3, v0}, Ld;->o(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-static {v1, v0, v2, v5, v2}, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository;->handledException$default(Lcom/whoop/data/repositories/SmartAlarmTriggerRepository;Ljava/lang/String;Ljava/lang/Exception;ILjava/lang/Object;)V

    :cond_e
    return-object v12

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_7
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method

.method private final saveSmartAlarmDiagnosticEvents(Lf82/a;Lf82/b;Ljava/lang/String;Lzj0/h;)V
    .locals 6

    iget-object v0, p0, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository;->smartAlarmDiagnosticDbHelper:Lg82/a;

    if-eqz p4, :cond_0

    invoke-virtual {p4}, Lzj0/h;->W()Z

    move-result v1

    :goto_0
    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    move v5, v1

    move-object v1, p1

    goto :goto_1

    :cond_0
    const/4 v1, 0x0

    goto :goto_0

    :goto_1
    invoke-interface/range {v0 .. v5}, Lg82/a;->b(Lf82/a;Lf82/b;Ljava/lang/String;Lzj0/h;Z)V

    return-void
.end method

.method public static synthetic saveSmartAlarmDiagnosticEvents$default(Lcom/whoop/data/repositories/SmartAlarmTriggerRepository;Lf82/a;Lf82/b;Ljava/lang/String;Lzj0/h;ILjava/lang/Object;)V
    .locals 2

    and-int/lit8 p6, p5, 0x1

    if-eqz p6, :cond_0

    sget-object p1, Lf82/a;->PHONE_TRIGGER_RECEIVED:Lf82/a;

    :cond_0
    and-int/lit8 p6, p5, 0x4

    if-eqz p6, :cond_1

    invoke-static {}, Lorg/joda/time/Instant;->now()Lorg/joda/time/Instant;

    move-result-object p3

    invoke-virtual {p3}, Lorg/joda/time/Instant;->getMillis()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/String;->valueOf(J)Ljava/lang/String;

    move-result-object p3

    :cond_1
    and-int/lit8 p5, p5, 0x8

    if-eqz p5, :cond_2

    const/4 p4, 0x0

    :cond_2
    invoke-direct {p0, p1, p2, p3, p4}, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository;->saveSmartAlarmDiagnosticEvents(Lf82/a;Lf82/b;Ljava/lang/String;Lzj0/h;)V

    return-void
.end method

.method private final shouldFetchAndCacheSmartAlarmUserInfo(Lcom/whoop/data/remote/domain/dto/DayOfWeekType;Lorg/joda/time/LocalTime;)Z
    .locals 4

    invoke-direct {p0, p1}, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository;->dayOfWeekTypeConversion(Lcom/whoop/data/remote/domain/dto/DayOfWeekType;)I

    move-result p1

    iget-object v0, p0, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository;->dateAndTimeProvider:Lzr2/a;

    invoke-interface {v0}, Lzr2/a;->d()Lorg/joda/time/LocalDate;

    move-result-object v0

    invoke-virtual {v0}, Lorg/joda/time/LocalDate;->getDayOfWeek()I

    move-result v1

    const/4 v2, 0x1

    if-ne p1, v2, :cond_0

    const/4 v3, 0x7

    if-ne v1, v3, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    sub-int/2addr p1, v1

    if-eqz p1, :cond_1

    if-eq p1, v2, :cond_1

    return v2

    :cond_1
    invoke-virtual {v0, p1}, Lorg/joda/time/LocalDate;->plusDays(I)Lorg/joda/time/LocalDate;

    move-result-object p1

    invoke-virtual {p1}, Lorg/joda/time/LocalDate;->toDateTimeAtStartOfDay()Lorg/joda/time/DateTime;

    move-result-object p1

    sget-object v0, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository;->WAKE_WINDOW_SLOP_TIME:Lorg/joda/time/Duration;

    invoke-virtual {v0}, Lorg/joda/time/Duration;->getStandardMinutes()J

    move-result-wide v0

    long-to-int v0, v0

    invoke-virtual {p2, v0}, Lorg/joda/time/LocalTime;->plusMinutes(I)Lorg/joda/time/LocalTime;

    move-result-object p2

    invoke-virtual {p1, p2}, Lorg/joda/time/DateTime;->withTime(Lorg/joda/time/LocalTime;)Lorg/joda/time/DateTime;

    move-result-object p1

    invoke-virtual {p1}, Lorg/joda/time/base/AbstractInstant;->isBeforeNow()Z

    move-result p1

    return p1
.end method

.method private static final start$lambda$0(Lcom/whoop/data/repositories/SmartAlarmTriggerRepository;Lcom/whoop/domain/model/UserSwitchEvent;)Ll83/a0;
    .locals 3

    instance-of v0, p1, Lcom/whoop/domain/model/Logout;

    const/4 v1, 0x3

    const/4 v2, 0x0

    if-eqz v0, :cond_0

    iget-object p1, p0, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository;->applicationScope:Lbc3/c0;

    new-instance v0, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$start$1$1;

    invoke-direct {v0, p0, v2}, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$start$1$1;-><init>(Lcom/whoop/data/repositories/SmartAlarmTriggerRepository;Lq83/d;)V

    invoke-static {p1, v2, v2, v0, v1}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    goto :goto_0

    :cond_0
    instance-of p1, p1, Lcom/whoop/domain/model/Login;

    if-eqz p1, :cond_1

    iget-object p1, p0, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository;->applicationScope:Lbc3/c0;

    new-instance v0, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$start$1$2;

    invoke-direct {v0, p0, v2}, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$start$1$2;-><init>(Lcom/whoop/data/repositories/SmartAlarmTriggerRepository;Lq83/d;)V

    invoke-static {p1, v2, v2, v0, v1}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    :goto_0
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0

    :cond_1
    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p0
.end method

.method private static final start$lambda$1(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 0

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method private static final start$lambda$2(Ltd1/e;)Ljava/lang/Boolean;
    .locals 1

    sget-object v0, Ltd1/e;->READY:Ltd1/e;

    if-ne p0, v0, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    invoke-static {p0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p0

    return-object p0
.end method

.method private static final start$lambda$3(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Ljava/lang/Boolean;
    .locals 0

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Boolean;

    return-object p0
.end method

.method private static final start$lambda$4(Lcom/whoop/data/repositories/SmartAlarmTriggerRepository;Ltd1/e;)Ll83/a0;
    .locals 2

    iget-object p1, p0, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository;->applicationScope:Lbc3/c0;

    new-instance v0, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$start$3$1;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$start$3$1;-><init>(Lcom/whoop/data/repositories/SmartAlarmTriggerRepository;Lq83/d;)V

    const/4 p0, 0x3

    invoke-static {p1, v1, v1, v0, p0}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final start$lambda$5(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V
    .locals 0

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method private final updateTimeZoneWhenOutOfSync(Lcom/whoop/data/local/room/entity/SmartAlarmUserInfo;Lq83/d;)Ljava/lang/Object;
    .locals 24
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/data/local/room/entity/SmartAlarmUserInfo;",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    move-object/from16 v0, p0

    move-object/from16 v1, p2

    instance-of v2, v1, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$updateTimeZoneWhenOutOfSync$1;

    if-eqz v2, :cond_0

    move-object v2, v1

    check-cast v2, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$updateTimeZoneWhenOutOfSync$1;

    iget v3, v2, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$updateTimeZoneWhenOutOfSync$1;->label:I

    const/high16 v4, -0x80000000

    and-int v5, v3, v4

    if-eqz v5, :cond_0

    sub-int/2addr v3, v4

    iput v3, v2, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$updateTimeZoneWhenOutOfSync$1;->label:I

    :goto_0
    move-object v8, v2

    goto :goto_1

    :cond_0
    new-instance v2, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$updateTimeZoneWhenOutOfSync$1;

    invoke-direct {v2, v0, v1}, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$updateTimeZoneWhenOutOfSync$1;-><init>(Lcom/whoop/data/repositories/SmartAlarmTriggerRepository;Lq83/d;)V

    goto :goto_0

    :goto_1
    iget-object v1, v8, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$updateTimeZoneWhenOutOfSync$1;->result:Ljava/lang/Object;

    sget-object v2, Lr83/a;->w:Lr83/a;

    iget v3, v8, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$updateTimeZoneWhenOutOfSync$1;->label:I

    const/4 v11, 0x0

    const-string v12, "Failed to sync time zone"

    const-string v13, "WakeWindow"

    const/4 v14, 0x4

    const/4 v15, 0x3

    const/4 v4, 0x2

    const/4 v5, 0x1

    const/4 v6, 0x0

    const-string v7, "Error:"

    if-eqz v3, :cond_5

    if-eq v3, v5, :cond_4

    if-eq v3, v4, :cond_3

    if-eq v3, v15, :cond_2

    if-ne v3, v14, :cond_1

    iget-object v2, v8, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$updateTimeZoneWhenOutOfSync$1;->L$1:Ljava/lang/Object;

    check-cast v2, Ljava/lang/Exception;

    iget-object v2, v8, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$updateTimeZoneWhenOutOfSync$1;->L$0:Ljava/lang/Object;

    check-cast v2, Lcom/whoop/data/local/room/entity/SmartAlarmUserInfo;

    invoke-static {v1}, Lts/o;->I(Ljava/lang/Object;)V

    goto/16 :goto_6

    :cond_1
    new-instance v1, Ljava/lang/IllegalStateException;

    const-string v2, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v1, v2}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v1

    :cond_2
    iget-object v3, v8, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$updateTimeZoneWhenOutOfSync$1;->L$1:Ljava/lang/Object;

    check-cast v3, Lu02/a;

    iget-object v3, v8, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$updateTimeZoneWhenOutOfSync$1;->L$0:Ljava/lang/Object;

    check-cast v3, Lcom/whoop/data/local/room/entity/SmartAlarmUserInfo;

    :try_start_0
    invoke-static {v1}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    goto/16 :goto_7

    :catch_0
    move-object v14, v6

    move-object v15, v7

    goto/16 :goto_4

    :cond_3
    iget-object v3, v8, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$updateTimeZoneWhenOutOfSync$1;->L$1:Ljava/lang/Object;

    check-cast v3, Lu02/a;

    iget-object v3, v8, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$updateTimeZoneWhenOutOfSync$1;->L$0:Ljava/lang/Object;

    check-cast v3, Lcom/whoop/data/local/room/entity/SmartAlarmUserInfo;

    :try_start_1
    invoke-static {v1}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_1
    .catch Ljava/lang/Exception; {:try_start_1 .. :try_end_1} :catch_0

    move-object v14, v6

    move-object v15, v7

    goto/16 :goto_3

    :cond_4
    iget-object v3, v8, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$updateTimeZoneWhenOutOfSync$1;->L$0:Ljava/lang/Object;

    check-cast v3, Lcom/whoop/data/local/room/entity/SmartAlarmUserInfo;

    :try_start_2
    invoke-static {v1}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_2
    .catch Ljava/lang/Exception; {:try_start_2 .. :try_end_2} :catch_0

    move-object v3, v1

    move v1, v4

    move-object v14, v6

    move-object v15, v7

    goto :goto_2

    :cond_5
    invoke-static {v1}, Lts/o;->I(Ljava/lang/Object;)V

    invoke-virtual/range {p1 .. p1}, Lcom/whoop/data/local/room/entity/SmartAlarmUserInfo;->getTimeZoneOffset()Ljava/lang/String;

    move-result-object v1

    invoke-static {}, Lorg/joda/time/DateTime;->now()Lorg/joda/time/DateTime;

    move-result-object v3

    invoke-static {v3}, Lor2/n0;->c(Lorg/joda/time/DateTime;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_b

    :try_start_3
    sget-object v3, Lu02/a;->a:Lu02/a$a;

    move v1, v4

    invoke-virtual {v0}, Lhj0/n;->getLogger()Ltr2/n;

    move-result-object v4
    :try_end_3
    .catch Ljava/lang/Exception; {:try_start_3 .. :try_end_3} :catch_0

    move-object v9, v7

    :try_start_4
    new-instance v7, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$updateTimeZoneWhenOutOfSync$timeZoneSyncResponse$1;

    invoke-direct {v7, v0, v6}, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$updateTimeZoneWhenOutOfSync$timeZoneSyncResponse$1;-><init>(Lcom/whoop/data/repositories/SmartAlarmTriggerRepository;Lq83/d;)V

    iput-object v6, v8, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$updateTimeZoneWhenOutOfSync$1;->L$0:Ljava/lang/Object;

    iput v5, v8, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$updateTimeZoneWhenOutOfSync$1;->label:I
    :try_end_4
    .catch Ljava/lang/Exception; {:try_start_4 .. :try_end_4} :catch_1

    const/4 v5, 0x0

    move-object v10, v6

    const/4 v6, 0x0

    move-object/from16 v16, v9

    const/4 v9, 0x6

    move-object/from16 v17, v10

    const/4 v10, 0x0

    move-object/from16 v15, v16

    move-object/from16 v14, v17

    :try_start_5
    invoke-static/range {v3 .. v10}, Lu02/a$a;->b(Lu02/a$a;Ltr2/n;Lrr2/c;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lq83/d;ILjava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    if-ne v3, v2, :cond_6

    goto/16 :goto_5

    :cond_6
    :goto_2
    check-cast v3, Lu02/a;

    instance-of v4, v3, Lu02/a$b;

    if-eqz v4, :cond_8

    iget-object v3, v0, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository;->metricWriter:Liy1/c;

    new-instance v16, Ljy1/a;

    sget-object v4, Ley1/g;->RESET_LWT:Ley1/g;

    invoke-virtual {v4}, Ley1/g;->getValue()Ljava/lang/String;

    move-result-object v18

    sget-object v4, Ley1/e$b;->x:Ley1/e$b;

    invoke-virtual {v4}, Ley1/e;->a()Ljava/lang/String;

    move-result-object v4

    new-instance v5, Ljava/lang/StringBuilder;

    invoke-direct {v5, v15}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v20

    const/16 v22, 0x11

    const/16 v23, 0x0

    const/16 v17, 0x0

    const/16 v19, 0x0

    const/16 v21, 0x0

    invoke-direct/range {v16 .. v23}, Ljy1/a;-><init>(ILjava/lang/String;Ljava/lang/Double;Ljava/util/List;Lcom/whoop/metrics/domain/models/MetricPostType;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object/from16 v4, v16

    iput-object v14, v8, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$updateTimeZoneWhenOutOfSync$1;->L$0:Ljava/lang/Object;

    iput-object v14, v8, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$updateTimeZoneWhenOutOfSync$1;->L$1:Ljava/lang/Object;

    iput v1, v8, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$updateTimeZoneWhenOutOfSync$1;->label:I

    invoke-interface {v3, v4, v8}, Liy1/c;->a(Ljy1/a;Lq83/d;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v2, :cond_7

    goto :goto_5

    :cond_7
    :goto_3
    invoke-virtual {v0}, Lhj0/n;->getLogger()Ltr2/n;

    move-result-object v1

    new-array v3, v11, [Lqr2/a$a;

    invoke-interface {v1, v13, v12, v3}, Ltr2/n;->x(Ljava/lang/String;Ljava/lang/String;[Lqr2/a$a;)V

    goto :goto_7

    :cond_8
    instance-of v1, v3, Lu02/a$c;

    if-eqz v1, :cond_9

    iput-object v14, v8, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$updateTimeZoneWhenOutOfSync$1;->L$0:Ljava/lang/Object;

    iput-object v14, v8, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$updateTimeZoneWhenOutOfSync$1;->L$1:Ljava/lang/Object;

    const/4 v1, 0x3

    iput v1, v8, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$updateTimeZoneWhenOutOfSync$1;->label:I

    invoke-direct {v0, v8}, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository;->fetchAndCacheSmartAlarmUserInfo(Lq83/d;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v2, :cond_b

    goto :goto_5

    :cond_9
    new-instance v1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v1
    :try_end_5
    .catch Ljava/lang/Exception; {:try_start_5 .. :try_end_5} :catch_2

    :catch_1
    move-object v14, v6

    move-object v15, v9

    :catch_2
    :goto_4
    iget-object v1, v0, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository;->metricWriter:Liy1/c;

    new-instance v16, Ljy1/a;

    sget-object v3, Ley1/g;->RESET_LWT:Ley1/g;

    invoke-virtual {v3}, Ley1/g;->getValue()Ljava/lang/String;

    move-result-object v18

    sget-object v3, Ley1/e$b;->x:Ley1/e$b;

    invoke-virtual {v3}, Ley1/e;->a()Ljava/lang/String;

    move-result-object v3

    invoke-static {v15, v3}, Lr80/c;->t(Ljava/lang/String;Ljava/lang/String;)Ljava/util/List;

    move-result-object v20

    const/16 v22, 0x11

    const/16 v23, 0x0

    const/16 v17, 0x0

    const/16 v19, 0x0

    const/16 v21, 0x0

    invoke-direct/range {v16 .. v23}, Ljy1/a;-><init>(ILjava/lang/String;Ljava/lang/Double;Ljava/util/List;Lcom/whoop/metrics/domain/models/MetricPostType;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object/from16 v3, v16

    iput-object v14, v8, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$updateTimeZoneWhenOutOfSync$1;->L$0:Ljava/lang/Object;

    iput-object v14, v8, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$updateTimeZoneWhenOutOfSync$1;->L$1:Ljava/lang/Object;

    const/4 v4, 0x4

    iput v4, v8, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$updateTimeZoneWhenOutOfSync$1;->label:I

    invoke-interface {v1, v3, v8}, Liy1/c;->a(Ljy1/a;Lq83/d;)Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v2, :cond_a

    :goto_5
    return-object v2

    :cond_a
    :goto_6
    invoke-virtual {v0}, Lhj0/n;->getLogger()Ltr2/n;

    move-result-object v1

    new-array v2, v11, [Lqr2/a$a;

    invoke-interface {v1, v13, v12, v2}, Ltr2/n;->x(Ljava/lang/String;Ljava/lang/String;[Lqr2/a$a;)V

    :cond_b
    :goto_7
    sget-object v1, Ll83/a0;->a:Ll83/a0;

    return-object v1
.end method


# virtual methods
.method public final getCalculatedLatestWakeTime(Lcom/whoop/data/local/room/entity/SmartAlarmUserInfo;Lorg/joda/time/DateTime;)Lorg/joda/time/DateTime;
    .locals 9

    const-string v0, "alarmInfo"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "now"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lcom/whoop/data/local/room/entity/SmartAlarmUserInfo;->getScheduleEnabled()Z

    move-result v0

    const/4 v1, 0x0

    const-string v2, "WakeWindow"

    if-eqz v0, :cond_2

    invoke-virtual {p1}, Lcom/whoop/data/local/room/entity/SmartAlarmUserInfo;->getDayOfWeek()Lcom/whoop/data/remote/domain/dto/DayOfWeekType;

    move-result-object v0

    if-eqz v0, :cond_2

    invoke-direct {p0, v0}, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository;->dayOfWeekTypeConversion(Lcom/whoop/data/remote/domain/dto/DayOfWeekType;)I

    move-result p2

    iget-object v0, p0, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository;->dateAndTimeProvider:Lzr2/a;

    invoke-interface {v0}, Lzr2/a;->d()Lorg/joda/time/LocalDate;

    move-result-object v0

    invoke-virtual {v0}, Lorg/joda/time/LocalDate;->getDayOfWeek()I

    move-result v3

    const-string v4, "withTime(...)"

    const/4 v5, 0x1

    if-ne p2, v5, :cond_0

    const/4 v6, 0x7

    if-ne v3, v6, :cond_0

    invoke-virtual {p0}, Lhj0/n;->getLogger()Ltr2/n;

    move-result-object p2

    invoke-virtual {p1}, Lcom/whoop/data/local/room/entity/SmartAlarmUserInfo;->getUpperBoundLocalTime()Lorg/joda/time/LocalTime;

    move-result-object v0

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v6, "returning Date time on sunday "

    invoke-direct {v3, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    new-array v1, v1, [Lqr2/a$a;

    invoke-interface {p2, v2, v0, v1}, Ltr2/n;->x(Ljava/lang/String;Ljava/lang/String;[Lqr2/a$a;)V

    iget-object p2, p0, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository;->dateAndTimeProvider:Lzr2/a;

    invoke-interface {p2}, Lzr2/a;->d()Lorg/joda/time/LocalDate;

    move-result-object p2

    invoke-virtual {p2, v5}, Lorg/joda/time/LocalDate;->plusDays(I)Lorg/joda/time/LocalDate;

    move-result-object p2

    invoke-virtual {p2}, Lorg/joda/time/LocalDate;->toDateTimeAtStartOfDay()Lorg/joda/time/DateTime;

    move-result-object p2

    invoke-virtual {p1}, Lcom/whoop/data/local/room/entity/SmartAlarmUserInfo;->getUpperBoundLocalTime()Lorg/joda/time/LocalTime;

    move-result-object p1

    invoke-virtual {p2, p1}, Lorg/joda/time/DateTime;->withTime(Lorg/joda/time/LocalTime;)Lorg/joda/time/DateTime;

    move-result-object p1

    invoke-static {p1, v4}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1

    :cond_0
    sub-int v3, p2, v3

    iget-object v6, p0, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository;->dateAndTimeProvider:Lzr2/a;

    invoke-interface {v6}, Lzr2/a;->d()Lorg/joda/time/LocalDate;

    move-result-object v6

    invoke-virtual {v6, p2}, Lorg/joda/time/LocalDate;->withDayOfWeek(I)Lorg/joda/time/LocalDate;

    move-result-object p2

    const-string v6, " and upperbound time "

    const-string v7, "day of difference is : "

    if-eqz v3, :cond_1

    if-eq v3, v5, :cond_1

    invoke-virtual {p0}, Lhj0/n;->getLogger()Ltr2/n;

    move-result-object p2

    invoke-virtual {p1}, Lcom/whoop/data/local/room/entity/SmartAlarmUserInfo;->getUpperBoundLocalTime()Lorg/joda/time/LocalTime;

    move-result-object v5

    new-instance v8, Ljava/lang/StringBuilder;

    invoke-direct {v8, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v8, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v5, " current local date: "

    invoke-virtual {v8, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v5

    new-array v1, v1, [Lqr2/a$a;

    invoke-interface {p2, v2, v5, v1}, Ltr2/n;->x(Ljava/lang/String;Ljava/lang/String;[Lqr2/a$a;)V

    invoke-static {v3}, Ljava/lang/Math;->abs(I)I

    move-result p2

    invoke-virtual {v0, p2}, Lorg/joda/time/LocalDate;->minusDays(I)Lorg/joda/time/LocalDate;

    move-result-object p2

    invoke-virtual {p2}, Lorg/joda/time/LocalDate;->toDateTimeAtStartOfDay()Lorg/joda/time/DateTime;

    move-result-object p2

    invoke-virtual {p1}, Lcom/whoop/data/local/room/entity/SmartAlarmUserInfo;->getUpperBoundLocalTime()Lorg/joda/time/LocalTime;

    move-result-object p1

    invoke-virtual {p2, p1}, Lorg/joda/time/DateTime;->withTime(Lorg/joda/time/LocalTime;)Lorg/joda/time/DateTime;

    move-result-object p1

    invoke-static {p1, v4}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1

    :cond_1
    invoke-virtual {p0}, Lhj0/n;->getLogger()Ltr2/n;

    move-result-object v0

    invoke-virtual {p1}, Lcom/whoop/data/local/room/entity/SmartAlarmUserInfo;->getUpperBoundLocalTime()Lorg/joda/time/LocalTime;

    move-result-object v5

    new-instance v8, Ljava/lang/StringBuilder;

    invoke-direct {v8, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v8, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v8, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    new-array v1, v1, [Lqr2/a$a;

    invoke-interface {v0, v2, v3, v1}, Ltr2/n;->x(Ljava/lang/String;Ljava/lang/String;[Lqr2/a$a;)V

    invoke-virtual {p2}, Lorg/joda/time/LocalDate;->toDateTimeAtStartOfDay()Lorg/joda/time/DateTime;

    move-result-object p2

    invoke-virtual {p1}, Lcom/whoop/data/local/room/entity/SmartAlarmUserInfo;->getUpperBoundLocalTime()Lorg/joda/time/LocalTime;

    move-result-object p1

    invoke-virtual {p2, p1}, Lorg/joda/time/DateTime;->withTime(Lorg/joda/time/LocalTime;)Lorg/joda/time/DateTime;

    move-result-object p1

    invoke-static {p1, v4}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p1

    :cond_2
    invoke-virtual {p0}, Lhj0/n;->getLogger()Ltr2/n;

    move-result-object v0

    invoke-virtual {p1}, Lcom/whoop/data/local/room/entity/SmartAlarmUserInfo;->getUpperBoundLocalTime()Lorg/joda/time/LocalTime;

    move-result-object v3

    new-instance v4, Ljava/lang/StringBuilder;

    const-string v5, "schedule disabled, upperbound time:  "

    invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v3

    new-array v1, v1, [Lqr2/a$a;

    invoke-interface {v0, v2, v3, v1}, Ltr2/n;->x(Ljava/lang/String;Ljava/lang/String;[Lqr2/a$a;)V

    invoke-virtual {p1}, Lcom/whoop/data/local/room/entity/SmartAlarmUserInfo;->getUpperBoundLocalTime()Lorg/joda/time/LocalTime;

    move-result-object p1

    invoke-static {p1, p2}, Ltf2/a;->a(Lorg/joda/time/LocalTime;Lorg/joda/time/DateTime;)Lorg/joda/time/DateTime;

    move-result-object p1

    return-object p1
.end method

.method public final isHighFrequencySyncModeWindowOpen(Lcom/whoop/data/local/room/entity/SmartAlarmUserInfo;)Z
    .locals 2

    const-string v0, "smartAlarmUserInfo"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, Lorg/joda/time/DateTime;->now()Lorg/joda/time/DateTime;

    move-result-object v0

    invoke-virtual {p1}, Lcom/whoop/data/local/room/entity/SmartAlarmUserInfo;->getUpperBoundLocalTime()Lorg/joda/time/LocalTime;

    move-result-object p1

    invoke-static {v0}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-static {p1, v0}, Ltf2/a;->a(Lorg/joda/time/LocalTime;Lorg/joda/time/DateTime;)Lorg/joda/time/DateTime;

    move-result-object p1

    sget-object v1, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository;->HIGH_FREQ_SYNC_MODE_DURATION:Lorg/joda/time/Duration;

    invoke-virtual {p1, v1}, Lorg/joda/time/DateTime;->minus(Lorg/joda/time/ReadableDuration;)Lorg/joda/time/DateTime;

    move-result-object v1

    invoke-virtual {v1, v0}, Lorg/joda/time/base/AbstractInstant;->isBefore(Lorg/joda/time/ReadableInstant;)Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-virtual {p1, v0}, Lorg/joda/time/base/AbstractInstant;->isAfter(Lorg/joda/time/ReadableInstant;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public onSyncAttempted()V
    .locals 3

    const/4 v0, 0x1

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-static {p0, v2, v0, v1}, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository;->pollSmartAlarmTrigger$default(Lcom/whoop/data/repositories/SmartAlarmTriggerRepository;ZILjava/lang/Object;)V

    return-void
.end method

.method public final onTimeZoneChanged()V
    .locals 4

    iget-object v0, p0, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository;->applicationScope:Lbc3/c0;

    new-instance v1, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$onTimeZoneChanged$1;

    const/4 v2, 0x0

    invoke-direct {v1, p0, v2}, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$onTimeZoneChanged$1;-><init>(Lcom/whoop/data/repositories/SmartAlarmTriggerRepository;Lq83/d;)V

    const/4 v3, 0x3

    invoke-static {v0, v2, v2, v1, v3}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    return-void
.end method

.method public final pollSmartAlarmTrigger(Z)V
    .locals 4

    iget-object v0, p0, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository;->applicationScope:Lbc3/c0;

    new-instance v1, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$pollSmartAlarmTrigger$1;

    const/4 v2, 0x0

    invoke-direct {v1, p0, v2}, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$pollSmartAlarmTrigger$1;-><init>(Lcom/whoop/data/repositories/SmartAlarmTriggerRepository;Lq83/d;)V

    const/4 v3, 0x3

    invoke-static {v0, v2, v2, v1, v3}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    iget-object v0, p0, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository;->applicationScope:Lbc3/c0;

    new-instance v1, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$pollSmartAlarmTrigger$2;

    invoke-direct {v1, p0, p1, v2}, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$pollSmartAlarmTrigger$2;-><init>(Lcom/whoop/data/repositories/SmartAlarmTriggerRepository;ZLq83/d;)V

    invoke-static {v0, v2, v2, v1, v3}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    return-void
.end method

.method public final start()V
    .locals 4

    invoke-direct {p0}, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository;->initListeningForAlarmRelatedStrapEvents()V

    iget-object v0, p0, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository;->userSessionManager:Lod1/a0;

    invoke-interface {v0}, Lod1/a0;->g()Lxg3/g;

    move-result-object v0

    iget-object v1, p0, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository;->schedulerFactory:Lin2/h;

    invoke-interface {v1}, Lin2/h;->a()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lxg3/k;

    invoke-virtual {v0, v1}, Lxg3/g;->B(Lxg3/k;)Lxg3/g;

    move-result-object v0

    new-instance v1, Lcom/whoop/data/repositories/b;

    const/4 v2, 0x0

    invoke-direct {v1, p0, v2}, Lcom/whoop/data/repositories/b;-><init>(Lcom/whoop/data/repositories/SmartAlarmTriggerRepository;I)V

    new-instance v2, Lcom/whoop/data/onboarding/c;

    const/4 v3, 0x4

    invoke-direct {v2, v1, v3}, Lcom/whoop/data/onboarding/c;-><init>(Ljava/lang/Object;I)V

    invoke-virtual {v0, v2}, Lxg3/g;->K(Lbh3/b;)Lxg3/t;

    iget-object v0, p0, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository;->whoopStrap:Ltd1/b;

    invoke-interface {v0}, Ltd1/b;->i()Lxg3/g;

    move-result-object v0

    iget-object v1, p0, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository;->schedulerFactory:Lin2/h;

    invoke-interface {v1}, Lin2/h;->a()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lxg3/k;

    invoke-virtual {v0, v1}, Lxg3/g;->B(Lxg3/k;)Lxg3/g;

    move-result-object v0

    new-instance v1, La11/g;

    const/16 v2, 0x1c

    invoke-direct {v1, v2}, La11/g;-><init>(I)V

    new-instance v2, Lcom/whoop/data/repositories/c;

    const/4 v3, 0x0

    invoke-direct {v2, v1, v3}, Lcom/whoop/data/repositories/c;-><init>(Ljava/lang/Object;I)V

    invoke-virtual {v0, v2}, Lxg3/g;->n(Lbh3/g;)Lxg3/g;

    move-result-object v0

    new-instance v1, Lcom/whoop/data/repositories/b;

    const/4 v2, 0x1

    invoke-direct {v1, p0, v2}, Lcom/whoop/data/repositories/b;-><init>(Lcom/whoop/data/repositories/SmartAlarmTriggerRepository;I)V

    new-instance v2, Lcom/whoop/data/onboarding/c;

    const/4 v3, 0x5

    invoke-direct {v2, v1, v3}, Lcom/whoop/data/onboarding/c;-><init>(Ljava/lang/Object;I)V

    invoke-virtual {v0, v2}, Lxg3/g;->K(Lbh3/b;)Lxg3/t;

    iget-object v0, p0, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository;->applicationScope:Lbc3/c0;

    new-instance v1, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$start$4;

    const/4 v2, 0x0

    invoke-direct {v1, p0, v2}, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$start$4;-><init>(Lcom/whoop/data/repositories/SmartAlarmTriggerRepository;Lq83/d;)V

    const/4 v3, 0x3

    invoke-static {v0, v2, v2, v1, v3}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    return-void
.end method

.method public final triggerSmartAlarmFromPush(Lorg/joda/time/DateTime;Lq83/d;)Ljava/lang/Object;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lorg/joda/time/DateTime;",
            "Lq83/d<",
            "-",
            "Ljava/lang/Boolean;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository;->applicationScope:Lbc3/c0;

    invoke-interface {v0}, Lbc3/c0;->getCoroutineContext()Lq83/j;

    move-result-object v0

    new-instance v1, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$triggerSmartAlarmFromPush$2;

    const/4 v2, 0x0

    invoke-direct {v1, p0, p1, v2}, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$triggerSmartAlarmFromPush$2;-><init>(Lcom/whoop/data/repositories/SmartAlarmTriggerRepository;Lorg/joda/time/DateTime;Lq83/d;)V

    invoke-static {v0, v1, p2}, Lbc3/f0;->K(Lq83/j;Lc93/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final updateAlarmUserInfoWithSchedule(Lq83/d;)Ljava/lang/Object;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lq83/d<",
            "-",
            "Ll83/a0;",
            ">;)",
            "Ljava/lang/Object;"
        }
    .end annotation

    instance-of v0, p1, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$updateAlarmUserInfoWithSchedule$1;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$updateAlarmUserInfoWithSchedule$1;

    iget v1, v0, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$updateAlarmUserInfoWithSchedule$1;->label:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$updateAlarmUserInfoWithSchedule$1;->label:I

    goto :goto_0

    :cond_0
    new-instance v0, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$updateAlarmUserInfoWithSchedule$1;

    invoke-direct {v0, p0, p1}, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$updateAlarmUserInfoWithSchedule$1;-><init>(Lcom/whoop/data/repositories/SmartAlarmTriggerRepository;Lq83/d;)V

    :goto_0
    iget-object p1, v0, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$updateAlarmUserInfoWithSchedule$1;->result:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$updateAlarmUserInfoWithSchedule$1;->label:I

    const/4 v3, 0x2

    const/4 v4, 0x1

    if-eqz v2, :cond_3

    if-eq v2, v4, :cond_2

    if-ne v2, v3, :cond_1

    iget-object v1, v0, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$updateAlarmUserInfoWithSchedule$1;->L$1:Ljava/lang/Object;

    check-cast v1, Lcom/whoop/data/remote/domain/dto/DayOfWeekType;

    iget-object v0, v0, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$updateAlarmUserInfoWithSchedule$1;->L$0:Ljava/lang/Object;

    check-cast v0, Lcom/whoop/data/local/room/entity/SmartAlarmUserInfo;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_3

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :cond_3
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    iput v4, v0, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$updateAlarmUserInfoWithSchedule$1;->label:I

    invoke-direct {p0, v0}, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository;->getSmartAlarmUserInfo(Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_4

    goto :goto_2

    :cond_4
    :goto_1
    check-cast p1, Lcom/whoop/data/local/room/entity/SmartAlarmUserInfo;

    if-eqz p1, :cond_5

    invoke-virtual {p1}, Lcom/whoop/data/local/room/entity/SmartAlarmUserInfo;->getScheduleEnabled()Z

    move-result v2

    if-eqz v2, :cond_5

    invoke-virtual {p1}, Lcom/whoop/data/local/room/entity/SmartAlarmUserInfo;->getDayOfWeek()Lcom/whoop/data/remote/domain/dto/DayOfWeekType;

    move-result-object v2

    if-eqz v2, :cond_5

    invoke-virtual {p1}, Lcom/whoop/data/local/room/entity/SmartAlarmUserInfo;->getUpperBoundLocalTime()Lorg/joda/time/LocalTime;

    move-result-object p1

    invoke-direct {p0, v2, p1}, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository;->shouldFetchAndCacheSmartAlarmUserInfo(Lcom/whoop/data/remote/domain/dto/DayOfWeekType;Lorg/joda/time/LocalTime;)Z

    move-result p1

    if-eqz p1, :cond_5

    invoke-virtual {p0}, Lhj0/n;->getLogger()Ltr2/n;

    move-result-object p1

    const-string v2, "fetching alarm user info as previous LWT has passed"

    const/4 v4, 0x0

    new-array v5, v4, [Lqr2/a$a;

    const-string v6, "WakeWindow"

    invoke-interface {p1, v6, v2, v5}, Ltr2/n;->x(Ljava/lang/String;Ljava/lang/String;[Lqr2/a$a;)V

    const/4 p1, 0x0

    iput-object p1, v0, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$updateAlarmUserInfoWithSchedule$1;->L$0:Ljava/lang/Object;

    iput-object p1, v0, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$updateAlarmUserInfoWithSchedule$1;->L$1:Ljava/lang/Object;

    iput v4, v0, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$updateAlarmUserInfoWithSchedule$1;->I$0:I

    iput v4, v0, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$updateAlarmUserInfoWithSchedule$1;->I$1:I

    iput v3, v0, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository$updateAlarmUserInfoWithSchedule$1;->label:I

    invoke-direct {p0, v0}, Lcom/whoop/data/repositories/SmartAlarmTriggerRepository;->fetchAndCacheSmartAlarmUserInfo(Lq83/d;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_5

    :goto_2
    return-object v1

    :cond_5
    :goto_3
    sget-object p1, Ll83/a0;->a:Ll83/a0;

    return-object p1
.end method
