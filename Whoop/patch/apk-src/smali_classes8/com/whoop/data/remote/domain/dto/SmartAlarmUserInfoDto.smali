.class public final Lcom/whoop/data/remote/domain/dto/SmartAlarmUserInfoDto;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/data/remote/domain/dto/SmartAlarmUserInfoDto$$serializer;,
        Lcom/whoop/data/remote/domain/dto/SmartAlarmUserInfoDto$Companion;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\t\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008 \u0008\u0087\u0008\u0018\u0000 a2\u00020\u0001:\u0002baB\u00a5\u0001\u0012\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0008\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\u0008\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u0008\u0010\r\u001a\u0004\u0018\u00010\u000c\u0012\u0008\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u000f\u001a\u00020\n\u0012\u0008\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\u0008\u0010\u0012\u001a\u0004\u0018\u00010\n\u0012\u0008\u0010\u0013\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0014\u001a\u0004\u0018\u00010\u0004\u0012\u0008\u0010\u0015\u001a\u0004\u0018\u00010\u0004\u0012\u0008\u0010\u0016\u001a\u0004\u0018\u00010\u0004\u00a2\u0006\u0004\u0008\u0017\u0010\u0018B\u00b9\u0001\u0008\u0010\u0012\u0006\u0010\u0019\u001a\u00020\u0002\u0012\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0008\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\u0008\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u0008\u0010\r\u001a\u0004\u0018\u00010\u000c\u0012\u0008\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u000f\u001a\u00020\n\u0012\u0008\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\u0008\u0010\u0012\u001a\u0004\u0018\u00010\n\u0012\u0008\u0010\u0013\u001a\u0004\u0018\u00010\u0002\u0012\u0008\u0010\u0014\u001a\u0004\u0018\u00010\u0004\u0012\u0008\u0010\u0015\u001a\u0004\u0018\u00010\u0004\u0012\u0008\u0010\u0016\u001a\u0004\u0018\u00010\u0004\u0012\u0008\u0010\u001b\u001a\u0004\u0018\u00010\u001a\u00a2\u0006\u0004\u0008\u0017\u0010\u001cJ\r\u0010\u001e\u001a\u00020\u001d\u00a2\u0006\u0004\u0008\u001e\u0010\u001fJ\u0012\u0010 \u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008 \u0010!J\u0012\u0010\"\u001a\u0004\u0018\u00010\u0004H\u00c6\u0003\u00a2\u0006\u0004\u0008\"\u0010#J\u0012\u0010$\u001a\u0004\u0018\u00010\u0004H\u00c6\u0003\u00a2\u0006\u0004\u0008$\u0010#J\u0012\u0010%\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008%\u0010!J\u0012\u0010&\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008&\u0010!J\u0012\u0010\'\u001a\u0004\u0018\u00010\u0004H\u00c6\u0003\u00a2\u0006\u0004\u0008\'\u0010#J\u0012\u0010(\u001a\u0004\u0018\u00010\nH\u00c6\u0003\u00a2\u0006\u0004\u0008(\u0010)J\u0012\u0010*\u001a\u0004\u0018\u00010\u000cH\u00c6\u0003\u00a2\u0006\u0004\u0008*\u0010+J\u0012\u0010,\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008,\u0010!J\u0010\u0010-\u001a\u00020\nH\u00c6\u0003\u00a2\u0006\u0004\u0008-\u0010.J\u0012\u0010/\u001a\u0004\u0018\u00010\u0010H\u00c6\u0003\u00a2\u0006\u0004\u0008/\u00100J\u0012\u00101\u001a\u0004\u0018\u00010\nH\u00c6\u0003\u00a2\u0006\u0004\u00081\u0010)J\u0012\u00102\u001a\u0004\u0018\u00010\u0002H\u00c6\u0003\u00a2\u0006\u0004\u00082\u0010!J\u0012\u00103\u001a\u0004\u0018\u00010\u0004H\u00c6\u0003\u00a2\u0006\u0004\u00083\u0010#J\u0012\u00104\u001a\u0004\u0018\u00010\u0004H\u00c6\u0003\u00a2\u0006\u0004\u00084\u0010#J\u0012\u00105\u001a\u0004\u0018\u00010\u0004H\u00c6\u0003\u00a2\u0006\u0004\u00085\u0010#J\u00ce\u0001\u00106\u001a\u00020\u00002\n\u0008\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\u0008\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\u0008\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\n\u0008\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\u0008\u0002\u0010\u0008\u001a\u0004\u0018\u00010\u00022\n\u0008\u0002\u0010\t\u001a\u0004\u0018\u00010\u00042\n\u0008\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\u0008\u0002\u0010\r\u001a\u0004\u0018\u00010\u000c2\n\u0008\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00022\u0008\u0008\u0002\u0010\u000f\u001a\u00020\n2\n\u0008\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00102\n\u0008\u0002\u0010\u0012\u001a\u0004\u0018\u00010\n2\n\u0008\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00022\n\u0008\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00042\n\u0008\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00042\n\u0008\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0004H\u00c6\u0001\u00a2\u0006\u0004\u00086\u00107J\u0010\u00108\u001a\u00020\u0004H\u00d6\u0001\u00a2\u0006\u0004\u00088\u0010#J\u0010\u00109\u001a\u00020\u0002H\u00d6\u0001\u00a2\u0006\u0004\u00089\u0010:J\u001a\u0010<\u001a\u00020\n2\u0008\u0010;\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003\u00a2\u0006\u0004\u0008<\u0010=J\u000f\u0010\u0012\u001a\u00020\nH\u0002\u00a2\u0006\u0004\u0008\u0012\u0010.J\'\u0010F\u001a\u00020C2\u0006\u0010>\u001a\u00020\u00002\u0006\u0010@\u001a\u00020?2\u0006\u0010B\u001a\u00020AH\u0001\u00a2\u0006\u0004\u0008D\u0010ER\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0003\u0010G\u001a\u0004\u0008H\u0010!R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0005\u0010I\u001a\u0004\u0008J\u0010#R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0006\u0010I\u001a\u0004\u0008K\u0010#R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0007\u0010G\u001a\u0004\u0008L\u0010!R\u001c\u0010\u0008\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0008\u0010G\u001a\u0004\u0008M\u0010!R\"\u0010\t\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\t\u0010I\u0012\u0004\u0008O\u0010P\u001a\u0004\u0008N\u0010#R\"\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u000b\u0010Q\u0012\u0004\u0008S\u0010P\u001a\u0004\u0008R\u0010)R\"\u0010\r\u001a\u0004\u0018\u00010\u000c8\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\r\u0010T\u0012\u0004\u0008V\u0010P\u001a\u0004\u0008U\u0010+R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u000e\u0010G\u001a\u0004\u0008W\u0010!R\u001a\u0010\u000f\u001a\u00020\n8\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u000f\u0010X\u001a\u0004\u0008Y\u0010.R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0011\u0010Z\u001a\u0004\u0008[\u00100R\"\u0010\u0012\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004\u00a2\u0006\u0012\n\u0004\u0008\u0012\u0010Q\u0012\u0004\u0008\\\u0010P\u001a\u0004\u0008\u0012\u0010)R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0013\u0010G\u001a\u0004\u0008]\u0010!R\u001c\u0010\u0014\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0014\u0010I\u001a\u0004\u0008^\u0010#R\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0015\u0010I\u001a\u0004\u0008_\u0010#R\u001c\u0010\u0016\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0016\u0010I\u001a\u0004\u0008`\u0010#\u00a8\u0006c"
    }
    d2 = {
        "Lcom/whoop/data/remote/domain/dto/SmartAlarmUserInfoDto;",
        "",
        "",
        "userId",
        "",
        "upperTimeBound",
        "lastTriggeredAt",
        "sleepScoreGoal",
        "recoveryScoreGoal",
        "weeklyPlanHoursOfSleep",
        "",
        "smartAlarmEnabled",
        "Lcom/whoop/data/remote/domain/dto/SmartAlarmGoalType;",
        "smartAlarmGoal",
        "windowMinutes",
        "scheduleEnabled",
        "Lcom/whoop/data/remote/domain/dto/DayOfWeekType;",
        "dayOfWeek",
        "isEnrolledInWeeklyPlan",
        "weeklyPlanGoal",
        "timeZoneOffset",
        "alarmBounds",
        "optimizeSleep",
        "<init>",
        "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Boolean;Lcom/whoop/data/remote/domain/dto/SmartAlarmGoalType;Ljava/lang/Integer;ZLcom/whoop/data/remote/domain/dto/DayOfWeekType;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V",
        "seen0",
        "Lkotlinx/serialization/internal/SerializationConstructorMarker;",
        "serializationConstructorMarker",
        "(ILjava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Boolean;Lcom/whoop/data/remote/domain/dto/SmartAlarmGoalType;Ljava/lang/Integer;ZLcom/whoop/data/remote/domain/dto/DayOfWeekType;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V",
        "Lcom/whoop/data/local/room/entity/SmartAlarmUserInfo;",
        "toSmartAlarmUserInfo",
        "()Lcom/whoop/data/local/room/entity/SmartAlarmUserInfo;",
        "component1",
        "()Ljava/lang/Integer;",
        "component2",
        "()Ljava/lang/String;",
        "component3",
        "component4",
        "component5",
        "component6",
        "component7",
        "()Ljava/lang/Boolean;",
        "component8",
        "()Lcom/whoop/data/remote/domain/dto/SmartAlarmGoalType;",
        "component9",
        "component10",
        "()Z",
        "component11",
        "()Lcom/whoop/data/remote/domain/dto/DayOfWeekType;",
        "component12",
        "component13",
        "component14",
        "component15",
        "component16",
        "copy",
        "(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Boolean;Lcom/whoop/data/remote/domain/dto/SmartAlarmGoalType;Ljava/lang/Integer;ZLcom/whoop/data/remote/domain/dto/DayOfWeekType;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/whoop/data/remote/domain/dto/SmartAlarmUserInfoDto;",
        "toString",
        "hashCode",
        "()I",
        "other",
        "equals",
        "(Ljava/lang/Object;)Z",
        "self",
        "Lzc3/c;",
        "output",
        "Lyc3/g;",
        "serialDesc",
        "Ll83/a0;",
        "write$Self$core_release",
        "(Lcom/whoop/data/remote/domain/dto/SmartAlarmUserInfoDto;Lzc3/c;Lyc3/g;)V",
        "write$Self",
        "Ljava/lang/Integer;",
        "getUserId",
        "Ljava/lang/String;",
        "getUpperTimeBound",
        "getLastTriggeredAt",
        "getSleepScoreGoal",
        "getRecoveryScoreGoal",
        "getWeeklyPlanHoursOfSleep",
        "getWeeklyPlanHoursOfSleep$annotations",
        "()V",
        "Ljava/lang/Boolean;",
        "getSmartAlarmEnabled",
        "getSmartAlarmEnabled$annotations",
        "Lcom/whoop/data/remote/domain/dto/SmartAlarmGoalType;",
        "getSmartAlarmGoal",
        "getSmartAlarmGoal$annotations",
        "getWindowMinutes",
        "Z",
        "getScheduleEnabled",
        "Lcom/whoop/data/remote/domain/dto/DayOfWeekType;",
        "getDayOfWeek",
        "isEnrolledInWeeklyPlan$annotations",
        "getWeeklyPlanGoal",
        "getTimeZoneOffset",
        "getAlarmBounds",
        "getOptimizeSleep",
        "Companion",
        "$serializer",
        "core_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation

.annotation runtime Lwc3/i;
.end annotation


# static fields
.field private static final $childSerializers:[Ll83/h;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "[",
            "Ll83/h;"
        }
    .end annotation
.end field

.field public static final Companion:Lcom/whoop/data/remote/domain/dto/SmartAlarmUserInfoDto$Companion;


# instance fields
.field private final alarmBounds:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "alarm_bounds"
    .end annotation
.end field

.field private final dayOfWeek:Lcom/whoop/data/remote/domain/dto/DayOfWeekType;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "day_of_week"
    .end annotation
.end field

.field private final isEnrolledInWeeklyPlan:Ljava/lang/Boolean;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "enrolled_weekly_plan"
    .end annotation
.end field

.field private final lastTriggeredAt:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "last_triggered_at"
    .end annotation
.end field

.field private final optimizeSleep:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "optimize_sleep"
    .end annotation
.end field

.field private final recoveryScoreGoal:Ljava/lang/Integer;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "recovery_score_goal"
    .end annotation
.end field

.field private final scheduleEnabled:Z
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "schedule_enabled"
    .end annotation
.end field

.field private final sleepScoreGoal:Ljava/lang/Integer;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "sleep_score_goal"
    .end annotation
.end field

.field private final smartAlarmEnabled:Ljava/lang/Boolean;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "enabled"
    .end annotation
.end field

.field private final smartAlarmGoal:Lcom/whoop/data/remote/domain/dto/SmartAlarmGoalType;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "goal"
    .end annotation
.end field

.field private final timeZoneOffset:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "time_zone_offset"
    .end annotation
.end field

.field private final upperTimeBound:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "upper_time_bound"
    .end annotation
.end field

.field private final userId:Ljava/lang/Integer;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "user_id"
    .end annotation
.end field

.field private final weeklyPlanGoal:Ljava/lang/Integer;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "weekly_plan_goal"
    .end annotation
.end field

.field private final weeklyPlanHoursOfSleep:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "weekly_plan_sleep_hours_goal"
    .end annotation
.end field

.field private final windowMinutes:Ljava/lang/Integer;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "window_minutes"
    .end annotation
.end field


# direct methods
.method static constructor <clinit>()V
    .locals 7

    new-instance v0, Lcom/whoop/data/remote/domain/dto/SmartAlarmUserInfoDto$Companion;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/data/remote/domain/dto/SmartAlarmUserInfoDto$Companion;-><init>(Lkotlin/jvm/internal/DefaultConstructorMarker;)V

    sput-object v0, Lcom/whoop/data/remote/domain/dto/SmartAlarmUserInfoDto;->Companion:Lcom/whoop/data/remote/domain/dto/SmartAlarmUserInfoDto$Companion;

    sget-object v0, Ll83/i;->x:Ll83/i;

    new-instance v2, Lvw0/a;

    const/16 v3, 0xa

    invoke-direct {v2, v3}, Lvw0/a;-><init>(I)V

    invoke-static {v0, v2}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v2

    new-instance v4, Lvw0/a;

    const/16 v5, 0xb

    invoke-direct {v4, v5}, Lvw0/a;-><init>(I)V

    invoke-static {v0, v4}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v0

    const/16 v4, 0x10

    new-array v4, v4, [Ll83/h;

    const/4 v6, 0x0

    aput-object v1, v4, v6

    const/4 v6, 0x1

    aput-object v1, v4, v6

    const/4 v6, 0x2

    aput-object v1, v4, v6

    const/4 v6, 0x3

    aput-object v1, v4, v6

    const/4 v6, 0x4

    aput-object v1, v4, v6

    const/4 v6, 0x5

    aput-object v1, v4, v6

    const/4 v6, 0x6

    aput-object v1, v4, v6

    const/4 v6, 0x7

    aput-object v2, v4, v6

    const/16 v2, 0x8

    aput-object v1, v4, v2

    const/16 v2, 0x9

    aput-object v1, v4, v2

    aput-object v0, v4, v3

    aput-object v1, v4, v5

    const/16 v0, 0xc

    aput-object v1, v4, v0

    const/16 v0, 0xd

    aput-object v1, v4, v0

    const/16 v0, 0xe

    aput-object v1, v4, v0

    const/16 v0, 0xf

    aput-object v1, v4, v0

    sput-object v4, Lcom/whoop/data/remote/domain/dto/SmartAlarmUserInfoDto;->$childSerializers:[Ll83/h;

    return-void
.end method

.method public synthetic constructor <init>(ILjava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Boolean;Lcom/whoop/data/remote/domain/dto/SmartAlarmGoalType;Ljava/lang/Integer;ZLcom/whoop/data/remote/domain/dto/DayOfWeekType;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlinx/serialization/internal/SerializationConstructorMarker;)V
    .locals 2

    const v0, 0xffff

    and-int v1, p1, v0

    if-eq v0, v1, :cond_0

    .line 1
    sget-object v1, Lcom/whoop/data/remote/domain/dto/SmartAlarmUserInfoDto$$serializer;->INSTANCE:Lcom/whoop/data/remote/domain/dto/SmartAlarmUserInfoDto$$serializer;

    invoke-virtual {v1}, Lcom/whoop/data/remote/domain/dto/SmartAlarmUserInfoDto$$serializer;->getDescriptor()Lyc3/g;

    move-result-object v1

    invoke-static {p1, v0, v1}, Lkotlinx/serialization/internal/PluginExceptionsKt;->throwMissingFieldException(IILyc3/g;)V

    :cond_0
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p2, p0, Lcom/whoop/data/remote/domain/dto/SmartAlarmUserInfoDto;->userId:Ljava/lang/Integer;

    iput-object p3, p0, Lcom/whoop/data/remote/domain/dto/SmartAlarmUserInfoDto;->upperTimeBound:Ljava/lang/String;

    iput-object p4, p0, Lcom/whoop/data/remote/domain/dto/SmartAlarmUserInfoDto;->lastTriggeredAt:Ljava/lang/String;

    iput-object p5, p0, Lcom/whoop/data/remote/domain/dto/SmartAlarmUserInfoDto;->sleepScoreGoal:Ljava/lang/Integer;

    iput-object p6, p0, Lcom/whoop/data/remote/domain/dto/SmartAlarmUserInfoDto;->recoveryScoreGoal:Ljava/lang/Integer;

    iput-object p7, p0, Lcom/whoop/data/remote/domain/dto/SmartAlarmUserInfoDto;->weeklyPlanHoursOfSleep:Ljava/lang/String;

    iput-object p8, p0, Lcom/whoop/data/remote/domain/dto/SmartAlarmUserInfoDto;->smartAlarmEnabled:Ljava/lang/Boolean;

    iput-object p9, p0, Lcom/whoop/data/remote/domain/dto/SmartAlarmUserInfoDto;->smartAlarmGoal:Lcom/whoop/data/remote/domain/dto/SmartAlarmGoalType;

    iput-object p10, p0, Lcom/whoop/data/remote/domain/dto/SmartAlarmUserInfoDto;->windowMinutes:Ljava/lang/Integer;

    iput-boolean p11, p0, Lcom/whoop/data/remote/domain/dto/SmartAlarmUserInfoDto;->scheduleEnabled:Z

    iput-object p12, p0, Lcom/whoop/data/remote/domain/dto/SmartAlarmUserInfoDto;->dayOfWeek:Lcom/whoop/data/remote/domain/dto/DayOfWeekType;

    iput-object p13, p0, Lcom/whoop/data/remote/domain/dto/SmartAlarmUserInfoDto;->isEnrolledInWeeklyPlan:Ljava/lang/Boolean;

    move-object/from16 p1, p14

    iput-object p1, p0, Lcom/whoop/data/remote/domain/dto/SmartAlarmUserInfoDto;->weeklyPlanGoal:Ljava/lang/Integer;

    move-object/from16 p1, p15

    iput-object p1, p0, Lcom/whoop/data/remote/domain/dto/SmartAlarmUserInfoDto;->timeZoneOffset:Ljava/lang/String;

    move-object/from16 p1, p16

    iput-object p1, p0, Lcom/whoop/data/remote/domain/dto/SmartAlarmUserInfoDto;->alarmBounds:Ljava/lang/String;

    move-object/from16 p1, p17

    iput-object p1, p0, Lcom/whoop/data/remote/domain/dto/SmartAlarmUserInfoDto;->optimizeSleep:Ljava/lang/String;

    return-void
.end method

.method public constructor <init>(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Boolean;Lcom/whoop/data/remote/domain/dto/SmartAlarmGoalType;Ljava/lang/Integer;ZLcom/whoop/data/remote/domain/dto/DayOfWeekType;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lcom/whoop/data/remote/domain/dto/SmartAlarmUserInfoDto;->userId:Ljava/lang/Integer;

    .line 4
    iput-object p2, p0, Lcom/whoop/data/remote/domain/dto/SmartAlarmUserInfoDto;->upperTimeBound:Ljava/lang/String;

    .line 5
    iput-object p3, p0, Lcom/whoop/data/remote/domain/dto/SmartAlarmUserInfoDto;->lastTriggeredAt:Ljava/lang/String;

    .line 6
    iput-object p4, p0, Lcom/whoop/data/remote/domain/dto/SmartAlarmUserInfoDto;->sleepScoreGoal:Ljava/lang/Integer;

    .line 7
    iput-object p5, p0, Lcom/whoop/data/remote/domain/dto/SmartAlarmUserInfoDto;->recoveryScoreGoal:Ljava/lang/Integer;

    .line 8
    iput-object p6, p0, Lcom/whoop/data/remote/domain/dto/SmartAlarmUserInfoDto;->weeklyPlanHoursOfSleep:Ljava/lang/String;

    .line 9
    iput-object p7, p0, Lcom/whoop/data/remote/domain/dto/SmartAlarmUserInfoDto;->smartAlarmEnabled:Ljava/lang/Boolean;

    .line 10
    iput-object p8, p0, Lcom/whoop/data/remote/domain/dto/SmartAlarmUserInfoDto;->smartAlarmGoal:Lcom/whoop/data/remote/domain/dto/SmartAlarmGoalType;

    .line 11
    iput-object p9, p0, Lcom/whoop/data/remote/domain/dto/SmartAlarmUserInfoDto;->windowMinutes:Ljava/lang/Integer;

    .line 12
    iput-boolean p10, p0, Lcom/whoop/data/remote/domain/dto/SmartAlarmUserInfoDto;->scheduleEnabled:Z

    .line 13
    iput-object p11, p0, Lcom/whoop/data/remote/domain/dto/SmartAlarmUserInfoDto;->dayOfWeek:Lcom/whoop/data/remote/domain/dto/DayOfWeekType;

    .line 14
    iput-object p12, p0, Lcom/whoop/data/remote/domain/dto/SmartAlarmUserInfoDto;->isEnrolledInWeeklyPlan:Ljava/lang/Boolean;

    .line 15
    iput-object p13, p0, Lcom/whoop/data/remote/domain/dto/SmartAlarmUserInfoDto;->weeklyPlanGoal:Ljava/lang/Integer;

    .line 16
    iput-object p14, p0, Lcom/whoop/data/remote/domain/dto/SmartAlarmUserInfoDto;->timeZoneOffset:Ljava/lang/String;

    .line 17
    iput-object p15, p0, Lcom/whoop/data/remote/domain/dto/SmartAlarmUserInfoDto;->alarmBounds:Ljava/lang/String;

    move-object/from16 p1, p16

    .line 18
    iput-object p1, p0, Lcom/whoop/data/remote/domain/dto/SmartAlarmUserInfoDto;->optimizeSleep:Ljava/lang/String;

    return-void
.end method

.method private static final synthetic _childSerializers$_anonymous_()Lwc3/c;
    .locals 1

    sget-object v0, Lcom/whoop/data/remote/domain/dto/SmartAlarmGoalType;->Companion:Lcom/whoop/data/remote/domain/dto/SmartAlarmGoalType$Companion;

    invoke-virtual {v0}, Lcom/whoop/data/remote/domain/dto/SmartAlarmGoalType$Companion;->serializer()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method private static final synthetic _childSerializers$_anonymous_$0()Lwc3/c;
    .locals 1

    sget-object v0, Lcom/whoop/data/remote/domain/dto/DayOfWeekType;->Companion:Lcom/whoop/data/remote/domain/dto/DayOfWeekType$Companion;

    invoke-virtual {v0}, Lcom/whoop/data/remote/domain/dto/DayOfWeekType$Companion;->serializer()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic a()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/data/remote/domain/dto/SmartAlarmUserInfoDto;->_childSerializers$_anonymous_()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static final synthetic access$get$childSerializers$cp()[Ll83/h;
    .locals 1

    sget-object v0, Lcom/whoop/data/remote/domain/dto/SmartAlarmUserInfoDto;->$childSerializers:[Ll83/h;

    return-object v0
.end method

.method public static synthetic b()Lwc3/c;
    .locals 1

    invoke-static {}, Lcom/whoop/data/remote/domain/dto/SmartAlarmUserInfoDto;->_childSerializers$_anonymous_$0()Lwc3/c;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic copy$default(Lcom/whoop/data/remote/domain/dto/SmartAlarmUserInfoDto;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Boolean;Lcom/whoop/data/remote/domain/dto/SmartAlarmGoalType;Ljava/lang/Integer;ZLcom/whoop/data/remote/domain/dto/DayOfWeekType;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Lcom/whoop/data/remote/domain/dto/SmartAlarmUserInfoDto;
    .locals 17

    move-object/from16 v0, p0

    move/from16 v1, p17

    and-int/lit8 v2, v1, 0x1

    if-eqz v2, :cond_0

    iget-object v2, v0, Lcom/whoop/data/remote/domain/dto/SmartAlarmUserInfoDto;->userId:Ljava/lang/Integer;

    goto :goto_0

    :cond_0
    move-object/from16 v2, p1

    :goto_0
    and-int/lit8 v3, v1, 0x2

    if-eqz v3, :cond_1

    iget-object v3, v0, Lcom/whoop/data/remote/domain/dto/SmartAlarmUserInfoDto;->upperTimeBound:Ljava/lang/String;

    goto :goto_1

    :cond_1
    move-object/from16 v3, p2

    :goto_1
    and-int/lit8 v4, v1, 0x4

    if-eqz v4, :cond_2

    iget-object v4, v0, Lcom/whoop/data/remote/domain/dto/SmartAlarmUserInfoDto;->lastTriggeredAt:Ljava/lang/String;

    goto :goto_2

    :cond_2
    move-object/from16 v4, p3

    :goto_2
    and-int/lit8 v5, v1, 0x8

    if-eqz v5, :cond_3

    iget-object v5, v0, Lcom/whoop/data/remote/domain/dto/SmartAlarmUserInfoDto;->sleepScoreGoal:Ljava/lang/Integer;

    goto :goto_3

    :cond_3
    move-object/from16 v5, p4

    :goto_3
    and-int/lit8 v6, v1, 0x10

    if-eqz v6, :cond_4

    iget-object v6, v0, Lcom/whoop/data/remote/domain/dto/SmartAlarmUserInfoDto;->recoveryScoreGoal:Ljava/lang/Integer;

    goto :goto_4

    :cond_4
    move-object/from16 v6, p5

    :goto_4
    and-int/lit8 v7, v1, 0x20

    if-eqz v7, :cond_5

    iget-object v7, v0, Lcom/whoop/data/remote/domain/dto/SmartAlarmUserInfoDto;->weeklyPlanHoursOfSleep:Ljava/lang/String;

    goto :goto_5

    :cond_5
    move-object/from16 v7, p6

    :goto_5
    and-int/lit8 v8, v1, 0x40

    if-eqz v8, :cond_6

    iget-object v8, v0, Lcom/whoop/data/remote/domain/dto/SmartAlarmUserInfoDto;->smartAlarmEnabled:Ljava/lang/Boolean;

    goto :goto_6

    :cond_6
    move-object/from16 v8, p7

    :goto_6
    and-int/lit16 v9, v1, 0x80

    if-eqz v9, :cond_7

    iget-object v9, v0, Lcom/whoop/data/remote/domain/dto/SmartAlarmUserInfoDto;->smartAlarmGoal:Lcom/whoop/data/remote/domain/dto/SmartAlarmGoalType;

    goto :goto_7

    :cond_7
    move-object/from16 v9, p8

    :goto_7
    and-int/lit16 v10, v1, 0x100

    if-eqz v10, :cond_8

    iget-object v10, v0, Lcom/whoop/data/remote/domain/dto/SmartAlarmUserInfoDto;->windowMinutes:Ljava/lang/Integer;

    goto :goto_8

    :cond_8
    move-object/from16 v10, p9

    :goto_8
    and-int/lit16 v11, v1, 0x200

    if-eqz v11, :cond_9

    iget-boolean v11, v0, Lcom/whoop/data/remote/domain/dto/SmartAlarmUserInfoDto;->scheduleEnabled:Z

    goto :goto_9

    :cond_9
    move/from16 v11, p10

    :goto_9
    and-int/lit16 v12, v1, 0x400

    if-eqz v12, :cond_a

    iget-object v12, v0, Lcom/whoop/data/remote/domain/dto/SmartAlarmUserInfoDto;->dayOfWeek:Lcom/whoop/data/remote/domain/dto/DayOfWeekType;

    goto :goto_a

    :cond_a
    move-object/from16 v12, p11

    :goto_a
    and-int/lit16 v13, v1, 0x800

    if-eqz v13, :cond_b

    iget-object v13, v0, Lcom/whoop/data/remote/domain/dto/SmartAlarmUserInfoDto;->isEnrolledInWeeklyPlan:Ljava/lang/Boolean;

    goto :goto_b

    :cond_b
    move-object/from16 v13, p12

    :goto_b
    and-int/lit16 v14, v1, 0x1000

    if-eqz v14, :cond_c

    iget-object v14, v0, Lcom/whoop/data/remote/domain/dto/SmartAlarmUserInfoDto;->weeklyPlanGoal:Ljava/lang/Integer;

    goto :goto_c

    :cond_c
    move-object/from16 v14, p13

    :goto_c
    and-int/lit16 v15, v1, 0x2000

    if-eqz v15, :cond_d

    iget-object v15, v0, Lcom/whoop/data/remote/domain/dto/SmartAlarmUserInfoDto;->timeZoneOffset:Ljava/lang/String;

    goto :goto_d

    :cond_d
    move-object/from16 v15, p14

    :goto_d
    move-object/from16 p1, v2

    and-int/lit16 v2, v1, 0x4000

    if-eqz v2, :cond_e

    iget-object v2, v0, Lcom/whoop/data/remote/domain/dto/SmartAlarmUserInfoDto;->alarmBounds:Ljava/lang/String;

    goto :goto_e

    :cond_e
    move-object/from16 v2, p15

    :goto_e
    const v16, 0x8000

    and-int v1, v1, v16

    if-eqz v1, :cond_f

    iget-object v1, v0, Lcom/whoop/data/remote/domain/dto/SmartAlarmUserInfoDto;->optimizeSleep:Ljava/lang/String;

    move-object/from16 p17, v1

    :goto_f
    move-object/from16 p2, p1

    move-object/from16 p1, v0

    move-object/from16 p16, v2

    move-object/from16 p3, v3

    move-object/from16 p4, v4

    move-object/from16 p5, v5

    move-object/from16 p6, v6

    move-object/from16 p7, v7

    move-object/from16 p8, v8

    move-object/from16 p9, v9

    move-object/from16 p10, v10

    move/from16 p11, v11

    move-object/from16 p12, v12

    move-object/from16 p13, v13

    move-object/from16 p14, v14

    move-object/from16 p15, v15

    goto :goto_10

    :cond_f
    move-object/from16 p17, p16

    goto :goto_f

    :goto_10
    invoke-virtual/range {p1 .. p17}, Lcom/whoop/data/remote/domain/dto/SmartAlarmUserInfoDto;->copy(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Boolean;Lcom/whoop/data/remote/domain/dto/SmartAlarmGoalType;Ljava/lang/Integer;ZLcom/whoop/data/remote/domain/dto/DayOfWeekType;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/whoop/data/remote/domain/dto/SmartAlarmUserInfoDto;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic getSmartAlarmEnabled$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "enabled"
    .end annotation

    return-void
.end method

.method public static synthetic getSmartAlarmGoal$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "goal"
    .end annotation

    return-void
.end method

.method public static synthetic getWeeklyPlanHoursOfSleep$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "weekly_plan_sleep_hours_goal"
    .end annotation

    return-void
.end method

.method private final isEnrolledInWeeklyPlan()Z
    .locals 2

    .line 2
    iget-object v0, p0, Lcom/whoop/data/remote/domain/dto/SmartAlarmUserInfoDto;->smartAlarmGoal:Lcom/whoop/data/remote/domain/dto/SmartAlarmGoalType;

    if-eqz v0, :cond_0

    iget-object v1, p0, Lcom/whoop/data/remote/domain/dto/SmartAlarmUserInfoDto;->weeklyPlanGoal:Ljava/lang/Integer;

    if-eqz v1, :cond_0

    invoke-static {v0}, Lcom/whoop/data/remote/domain/dto/SmartAlarmUserInfoDtoKt;->isExactWeeklyPlanAlarm(Lcom/whoop/data/remote/domain/dto/SmartAlarmGoalType;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public static synthetic isEnrolledInWeeklyPlan$annotations()V
    .locals 0
    .annotation runtime Lwc3/h;
        value = "enrolled_weekly_plan"
    .end annotation

    return-void
.end method

.method public static final synthetic write$Self$core_release(Lcom/whoop/data/remote/domain/dto/SmartAlarmUserInfoDto;Lzc3/c;Lyc3/g;)V
    .locals 7

    sget-object v0, Lcom/whoop/data/remote/domain/dto/SmartAlarmUserInfoDto;->$childSerializers:[Ll83/h;

    sget-object v1, Lkotlinx/serialization/internal/IntSerializer;->INSTANCE:Lkotlinx/serialization/internal/IntSerializer;

    iget-object v2, p0, Lcom/whoop/data/remote/domain/dto/SmartAlarmUserInfoDto;->userId:Ljava/lang/Integer;

    const/4 v3, 0x0

    invoke-interface {p1, p2, v3, v1, v2}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    sget-object v2, Lkotlinx/serialization/internal/StringSerializer;->INSTANCE:Lkotlinx/serialization/internal/StringSerializer;

    iget-object v3, p0, Lcom/whoop/data/remote/domain/dto/SmartAlarmUserInfoDto;->upperTimeBound:Ljava/lang/String;

    const/4 v4, 0x1

    invoke-interface {p1, p2, v4, v2, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v3, 0x2

    iget-object v4, p0, Lcom/whoop/data/remote/domain/dto/SmartAlarmUserInfoDto;->lastTriggeredAt:Ljava/lang/String;

    invoke-interface {p1, p2, v3, v2, v4}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v3, 0x3

    iget-object v4, p0, Lcom/whoop/data/remote/domain/dto/SmartAlarmUserInfoDto;->sleepScoreGoal:Ljava/lang/Integer;

    invoke-interface {p1, p2, v3, v1, v4}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v3, 0x4

    iget-object v4, p0, Lcom/whoop/data/remote/domain/dto/SmartAlarmUserInfoDto;->recoveryScoreGoal:Ljava/lang/Integer;

    invoke-interface {p1, p2, v3, v1, v4}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v3, 0x5

    iget-object v4, p0, Lcom/whoop/data/remote/domain/dto/SmartAlarmUserInfoDto;->weeklyPlanHoursOfSleep:Ljava/lang/String;

    invoke-interface {p1, p2, v3, v2, v4}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    sget-object v3, Lkotlinx/serialization/internal/BooleanSerializer;->INSTANCE:Lkotlinx/serialization/internal/BooleanSerializer;

    iget-object v4, p0, Lcom/whoop/data/remote/domain/dto/SmartAlarmUserInfoDto;->smartAlarmEnabled:Ljava/lang/Boolean;

    const/4 v5, 0x6

    invoke-interface {p1, p2, v5, v3, v4}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/4 v4, 0x7

    aget-object v5, v0, v4

    invoke-interface {v5}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lwc3/j;

    iget-object v6, p0, Lcom/whoop/data/remote/domain/dto/SmartAlarmUserInfoDto;->smartAlarmGoal:Lcom/whoop/data/remote/domain/dto/SmartAlarmGoalType;

    invoke-interface {p1, p2, v4, v5, v6}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/16 v4, 0x8

    iget-object v5, p0, Lcom/whoop/data/remote/domain/dto/SmartAlarmUserInfoDto;->windowMinutes:Ljava/lang/Integer;

    invoke-interface {p1, p2, v4, v1, v5}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/16 v4, 0x9

    iget-boolean v5, p0, Lcom/whoop/data/remote/domain/dto/SmartAlarmUserInfoDto;->scheduleEnabled:Z

    invoke-interface {p1, p2, v4, v5}, Lzc3/c;->encodeBooleanElement(Lyc3/g;IZ)V

    const/16 v4, 0xa

    aget-object v0, v0, v4

    invoke-interface {v0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lwc3/j;

    iget-object v5, p0, Lcom/whoop/data/remote/domain/dto/SmartAlarmUserInfoDto;->dayOfWeek:Lcom/whoop/data/remote/domain/dto/DayOfWeekType;

    invoke-interface {p1, p2, v4, v0, v5}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/16 v0, 0xb

    iget-object v4, p0, Lcom/whoop/data/remote/domain/dto/SmartAlarmUserInfoDto;->isEnrolledInWeeklyPlan:Ljava/lang/Boolean;

    invoke-interface {p1, p2, v0, v3, v4}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/16 v0, 0xc

    iget-object v3, p0, Lcom/whoop/data/remote/domain/dto/SmartAlarmUserInfoDto;->weeklyPlanGoal:Ljava/lang/Integer;

    invoke-interface {p1, p2, v0, v1, v3}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/16 v0, 0xd

    iget-object v1, p0, Lcom/whoop/data/remote/domain/dto/SmartAlarmUserInfoDto;->timeZoneOffset:Ljava/lang/String;

    invoke-interface {p1, p2, v0, v2, v1}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/16 v0, 0xe

    iget-object v1, p0, Lcom/whoop/data/remote/domain/dto/SmartAlarmUserInfoDto;->alarmBounds:Ljava/lang/String;

    invoke-interface {p1, p2, v0, v2, v1}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    const/16 v0, 0xf

    iget-object p0, p0, Lcom/whoop/data/remote/domain/dto/SmartAlarmUserInfoDto;->optimizeSleep:Ljava/lang/String;

    invoke-interface {p1, p2, v0, v2, p0}, Lzc3/c;->encodeNullableSerializableElement(Lyc3/g;ILwc3/j;Ljava/lang/Object;)V

    return-void
.end method


# virtual methods
.method public final component1()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lcom/whoop/data/remote/domain/dto/SmartAlarmUserInfoDto;->userId:Ljava/lang/Integer;

    return-object v0
.end method

.method public final component10()Z
    .locals 1

    iget-boolean v0, p0, Lcom/whoop/data/remote/domain/dto/SmartAlarmUserInfoDto;->scheduleEnabled:Z

    return v0
.end method

.method public final component11()Lcom/whoop/data/remote/domain/dto/DayOfWeekType;
    .locals 1

    iget-object v0, p0, Lcom/whoop/data/remote/domain/dto/SmartAlarmUserInfoDto;->dayOfWeek:Lcom/whoop/data/remote/domain/dto/DayOfWeekType;

    return-object v0
.end method

.method public final component12()Ljava/lang/Boolean;
    .locals 1

    iget-object v0, p0, Lcom/whoop/data/remote/domain/dto/SmartAlarmUserInfoDto;->isEnrolledInWeeklyPlan:Ljava/lang/Boolean;

    return-object v0
.end method

.method public final component13()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lcom/whoop/data/remote/domain/dto/SmartAlarmUserInfoDto;->weeklyPlanGoal:Ljava/lang/Integer;

    return-object v0
.end method

.method public final component14()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/data/remote/domain/dto/SmartAlarmUserInfoDto;->timeZoneOffset:Ljava/lang/String;

    return-object v0
.end method

.method public final component15()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/data/remote/domain/dto/SmartAlarmUserInfoDto;->alarmBounds:Ljava/lang/String;

    return-object v0
.end method

.method public final component16()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/data/remote/domain/dto/SmartAlarmUserInfoDto;->optimizeSleep:Ljava/lang/String;

    return-object v0
.end method

.method public final component2()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/data/remote/domain/dto/SmartAlarmUserInfoDto;->upperTimeBound:Ljava/lang/String;

    return-object v0
.end method

.method public final component3()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/data/remote/domain/dto/SmartAlarmUserInfoDto;->lastTriggeredAt:Ljava/lang/String;

    return-object v0
.end method

.method public final component4()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lcom/whoop/data/remote/domain/dto/SmartAlarmUserInfoDto;->sleepScoreGoal:Ljava/lang/Integer;

    return-object v0
.end method

.method public final component5()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lcom/whoop/data/remote/domain/dto/SmartAlarmUserInfoDto;->recoveryScoreGoal:Ljava/lang/Integer;

    return-object v0
.end method

.method public final component6()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/data/remote/domain/dto/SmartAlarmUserInfoDto;->weeklyPlanHoursOfSleep:Ljava/lang/String;

    return-object v0
.end method

.method public final component7()Ljava/lang/Boolean;
    .locals 1

    iget-object v0, p0, Lcom/whoop/data/remote/domain/dto/SmartAlarmUserInfoDto;->smartAlarmEnabled:Ljava/lang/Boolean;

    return-object v0
.end method

.method public final component8()Lcom/whoop/data/remote/domain/dto/SmartAlarmGoalType;
    .locals 1

    iget-object v0, p0, Lcom/whoop/data/remote/domain/dto/SmartAlarmUserInfoDto;->smartAlarmGoal:Lcom/whoop/data/remote/domain/dto/SmartAlarmGoalType;

    return-object v0
.end method

.method public final component9()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lcom/whoop/data/remote/domain/dto/SmartAlarmUserInfoDto;->windowMinutes:Ljava/lang/Integer;

    return-object v0
.end method

.method public final copy(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Boolean;Lcom/whoop/data/remote/domain/dto/SmartAlarmGoalType;Ljava/lang/Integer;ZLcom/whoop/data/remote/domain/dto/DayOfWeekType;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/whoop/data/remote/domain/dto/SmartAlarmUserInfoDto;
    .locals 17

    new-instance v0, Lcom/whoop/data/remote/domain/dto/SmartAlarmUserInfoDto;

    move-object/from16 v1, p1

    move-object/from16 v2, p2

    move-object/from16 v3, p3

    move-object/from16 v4, p4

    move-object/from16 v5, p5

    move-object/from16 v6, p6

    move-object/from16 v7, p7

    move-object/from16 v8, p8

    move-object/from16 v9, p9

    move/from16 v10, p10

    move-object/from16 v11, p11

    move-object/from16 v12, p12

    move-object/from16 v13, p13

    move-object/from16 v14, p14

    move-object/from16 v15, p15

    move-object/from16 v16, p16

    invoke-direct/range {v0 .. v16}, Lcom/whoop/data/remote/domain/dto/SmartAlarmUserInfoDto;-><init>(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Boolean;Lcom/whoop/data/remote/domain/dto/SmartAlarmGoalType;Ljava/lang/Integer;ZLcom/whoop/data/remote/domain/dto/DayOfWeekType;Ljava/lang/Boolean;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/data/remote/domain/dto/SmartAlarmUserInfoDto;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/data/remote/domain/dto/SmartAlarmUserInfoDto;

    iget-object v1, p0, Lcom/whoop/data/remote/domain/dto/SmartAlarmUserInfoDto;->userId:Ljava/lang/Integer;

    iget-object v3, p1, Lcom/whoop/data/remote/domain/dto/SmartAlarmUserInfoDto;->userId:Ljava/lang/Integer;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/whoop/data/remote/domain/dto/SmartAlarmUserInfoDto;->upperTimeBound:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/data/remote/domain/dto/SmartAlarmUserInfoDto;->upperTimeBound:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/whoop/data/remote/domain/dto/SmartAlarmUserInfoDto;->lastTriggeredAt:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/data/remote/domain/dto/SmartAlarmUserInfoDto;->lastTriggeredAt:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/whoop/data/remote/domain/dto/SmartAlarmUserInfoDto;->sleepScoreGoal:Ljava/lang/Integer;

    iget-object v3, p1, Lcom/whoop/data/remote/domain/dto/SmartAlarmUserInfoDto;->sleepScoreGoal:Ljava/lang/Integer;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lcom/whoop/data/remote/domain/dto/SmartAlarmUserInfoDto;->recoveryScoreGoal:Ljava/lang/Integer;

    iget-object v3, p1, Lcom/whoop/data/remote/domain/dto/SmartAlarmUserInfoDto;->recoveryScoreGoal:Ljava/lang/Integer;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lcom/whoop/data/remote/domain/dto/SmartAlarmUserInfoDto;->weeklyPlanHoursOfSleep:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/data/remote/domain/dto/SmartAlarmUserInfoDto;->weeklyPlanHoursOfSleep:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    return v2

    :cond_7
    iget-object v1, p0, Lcom/whoop/data/remote/domain/dto/SmartAlarmUserInfoDto;->smartAlarmEnabled:Ljava/lang/Boolean;

    iget-object v3, p1, Lcom/whoop/data/remote/domain/dto/SmartAlarmUserInfoDto;->smartAlarmEnabled:Ljava/lang/Boolean;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_8

    return v2

    :cond_8
    iget-object v1, p0, Lcom/whoop/data/remote/domain/dto/SmartAlarmUserInfoDto;->smartAlarmGoal:Lcom/whoop/data/remote/domain/dto/SmartAlarmGoalType;

    iget-object v3, p1, Lcom/whoop/data/remote/domain/dto/SmartAlarmUserInfoDto;->smartAlarmGoal:Lcom/whoop/data/remote/domain/dto/SmartAlarmGoalType;

    if-eq v1, v3, :cond_9

    return v2

    :cond_9
    iget-object v1, p0, Lcom/whoop/data/remote/domain/dto/SmartAlarmUserInfoDto;->windowMinutes:Ljava/lang/Integer;

    iget-object v3, p1, Lcom/whoop/data/remote/domain/dto/SmartAlarmUserInfoDto;->windowMinutes:Ljava/lang/Integer;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_a

    return v2

    :cond_a
    iget-boolean v1, p0, Lcom/whoop/data/remote/domain/dto/SmartAlarmUserInfoDto;->scheduleEnabled:Z

    iget-boolean v3, p1, Lcom/whoop/data/remote/domain/dto/SmartAlarmUserInfoDto;->scheduleEnabled:Z

    if-eq v1, v3, :cond_b

    return v2

    :cond_b
    iget-object v1, p0, Lcom/whoop/data/remote/domain/dto/SmartAlarmUserInfoDto;->dayOfWeek:Lcom/whoop/data/remote/domain/dto/DayOfWeekType;

    iget-object v3, p1, Lcom/whoop/data/remote/domain/dto/SmartAlarmUserInfoDto;->dayOfWeek:Lcom/whoop/data/remote/domain/dto/DayOfWeekType;

    if-eq v1, v3, :cond_c

    return v2

    :cond_c
    iget-object v1, p0, Lcom/whoop/data/remote/domain/dto/SmartAlarmUserInfoDto;->isEnrolledInWeeklyPlan:Ljava/lang/Boolean;

    iget-object v3, p1, Lcom/whoop/data/remote/domain/dto/SmartAlarmUserInfoDto;->isEnrolledInWeeklyPlan:Ljava/lang/Boolean;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_d

    return v2

    :cond_d
    iget-object v1, p0, Lcom/whoop/data/remote/domain/dto/SmartAlarmUserInfoDto;->weeklyPlanGoal:Ljava/lang/Integer;

    iget-object v3, p1, Lcom/whoop/data/remote/domain/dto/SmartAlarmUserInfoDto;->weeklyPlanGoal:Ljava/lang/Integer;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_e

    return v2

    :cond_e
    iget-object v1, p0, Lcom/whoop/data/remote/domain/dto/SmartAlarmUserInfoDto;->timeZoneOffset:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/data/remote/domain/dto/SmartAlarmUserInfoDto;->timeZoneOffset:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_f

    return v2

    :cond_f
    iget-object v1, p0, Lcom/whoop/data/remote/domain/dto/SmartAlarmUserInfoDto;->alarmBounds:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/data/remote/domain/dto/SmartAlarmUserInfoDto;->alarmBounds:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_10

    return v2

    :cond_10
    iget-object v1, p0, Lcom/whoop/data/remote/domain/dto/SmartAlarmUserInfoDto;->optimizeSleep:Ljava/lang/String;

    iget-object p1, p1, Lcom/whoop/data/remote/domain/dto/SmartAlarmUserInfoDto;->optimizeSleep:Ljava/lang/String;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_11

    return v2

    :cond_11
    return v0
.end method

.method public final getAlarmBounds()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/data/remote/domain/dto/SmartAlarmUserInfoDto;->alarmBounds:Ljava/lang/String;

    return-object v0
.end method

.method public final getDayOfWeek()Lcom/whoop/data/remote/domain/dto/DayOfWeekType;
    .locals 1

    iget-object v0, p0, Lcom/whoop/data/remote/domain/dto/SmartAlarmUserInfoDto;->dayOfWeek:Lcom/whoop/data/remote/domain/dto/DayOfWeekType;

    return-object v0
.end method

.method public final getLastTriggeredAt()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/data/remote/domain/dto/SmartAlarmUserInfoDto;->lastTriggeredAt:Ljava/lang/String;

    return-object v0
.end method

.method public final getOptimizeSleep()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/data/remote/domain/dto/SmartAlarmUserInfoDto;->optimizeSleep:Ljava/lang/String;

    return-object v0
.end method

.method public final getRecoveryScoreGoal()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lcom/whoop/data/remote/domain/dto/SmartAlarmUserInfoDto;->recoveryScoreGoal:Ljava/lang/Integer;

    return-object v0
.end method

.method public final getScheduleEnabled()Z
    .locals 1

    iget-boolean v0, p0, Lcom/whoop/data/remote/domain/dto/SmartAlarmUserInfoDto;->scheduleEnabled:Z

    return v0
.end method

.method public final getSleepScoreGoal()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lcom/whoop/data/remote/domain/dto/SmartAlarmUserInfoDto;->sleepScoreGoal:Ljava/lang/Integer;

    return-object v0
.end method

.method public final getSmartAlarmEnabled()Ljava/lang/Boolean;
    .locals 1

    iget-object v0, p0, Lcom/whoop/data/remote/domain/dto/SmartAlarmUserInfoDto;->smartAlarmEnabled:Ljava/lang/Boolean;

    return-object v0
.end method

.method public final getSmartAlarmGoal()Lcom/whoop/data/remote/domain/dto/SmartAlarmGoalType;
    .locals 1

    iget-object v0, p0, Lcom/whoop/data/remote/domain/dto/SmartAlarmUserInfoDto;->smartAlarmGoal:Lcom/whoop/data/remote/domain/dto/SmartAlarmGoalType;

    return-object v0
.end method

.method public final getTimeZoneOffset()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/data/remote/domain/dto/SmartAlarmUserInfoDto;->timeZoneOffset:Ljava/lang/String;

    return-object v0
.end method

.method public final getUpperTimeBound()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/data/remote/domain/dto/SmartAlarmUserInfoDto;->upperTimeBound:Ljava/lang/String;

    return-object v0
.end method

.method public final getUserId()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lcom/whoop/data/remote/domain/dto/SmartAlarmUserInfoDto;->userId:Ljava/lang/Integer;

    return-object v0
.end method

.method public final getWeeklyPlanGoal()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lcom/whoop/data/remote/domain/dto/SmartAlarmUserInfoDto;->weeklyPlanGoal:Ljava/lang/Integer;

    return-object v0
.end method

.method public final getWeeklyPlanHoursOfSleep()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/data/remote/domain/dto/SmartAlarmUserInfoDto;->weeklyPlanHoursOfSleep:Ljava/lang/String;

    return-object v0
.end method

.method public final getWindowMinutes()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lcom/whoop/data/remote/domain/dto/SmartAlarmUserInfoDto;->windowMinutes:Ljava/lang/Integer;

    return-object v0
.end method

.method public hashCode()I
    .locals 4

    iget-object v0, p0, Lcom/whoop/data/remote/domain/dto/SmartAlarmUserInfoDto;->userId:Ljava/lang/Integer;

    const/4 v1, 0x0

    if-nez v0, :cond_0

    move v0, v1

    goto :goto_0

    :cond_0
    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    :goto_0
    const/16 v2, 0x1f

    mul-int/2addr v0, v2

    iget-object v3, p0, Lcom/whoop/data/remote/domain/dto/SmartAlarmUserInfoDto;->upperTimeBound:Ljava/lang/String;

    if-nez v3, :cond_1

    move v3, v1

    goto :goto_1

    :cond_1
    invoke-virtual {v3}, Ljava/lang/String;->hashCode()I

    move-result v3

    :goto_1
    add-int/2addr v0, v3

    mul-int/2addr v0, v2

    iget-object v3, p0, Lcom/whoop/data/remote/domain/dto/SmartAlarmUserInfoDto;->lastTriggeredAt:Ljava/lang/String;

    if-nez v3, :cond_2

    move v3, v1

    goto :goto_2

    :cond_2
    invoke-virtual {v3}, Ljava/lang/String;->hashCode()I

    move-result v3

    :goto_2
    add-int/2addr v0, v3

    mul-int/2addr v0, v2

    iget-object v3, p0, Lcom/whoop/data/remote/domain/dto/SmartAlarmUserInfoDto;->sleepScoreGoal:Ljava/lang/Integer;

    if-nez v3, :cond_3

    move v3, v1

    goto :goto_3

    :cond_3
    invoke-virtual {v3}, Ljava/lang/Object;->hashCode()I

    move-result v3

    :goto_3
    add-int/2addr v0, v3

    mul-int/2addr v0, v2

    iget-object v3, p0, Lcom/whoop/data/remote/domain/dto/SmartAlarmUserInfoDto;->recoveryScoreGoal:Ljava/lang/Integer;

    if-nez v3, :cond_4

    move v3, v1

    goto :goto_4

    :cond_4
    invoke-virtual {v3}, Ljava/lang/Object;->hashCode()I

    move-result v3

    :goto_4
    add-int/2addr v0, v3

    mul-int/2addr v0, v2

    iget-object v3, p0, Lcom/whoop/data/remote/domain/dto/SmartAlarmUserInfoDto;->weeklyPlanHoursOfSleep:Ljava/lang/String;

    if-nez v3, :cond_5

    move v3, v1

    goto :goto_5

    :cond_5
    invoke-virtual {v3}, Ljava/lang/String;->hashCode()I

    move-result v3

    :goto_5
    add-int/2addr v0, v3

    mul-int/2addr v0, v2

    iget-object v3, p0, Lcom/whoop/data/remote/domain/dto/SmartAlarmUserInfoDto;->smartAlarmEnabled:Ljava/lang/Boolean;

    if-nez v3, :cond_6

    move v3, v1

    goto :goto_6

    :cond_6
    invoke-virtual {v3}, Ljava/lang/Object;->hashCode()I

    move-result v3

    :goto_6
    add-int/2addr v0, v3

    mul-int/2addr v0, v2

    iget-object v3, p0, Lcom/whoop/data/remote/domain/dto/SmartAlarmUserInfoDto;->smartAlarmGoal:Lcom/whoop/data/remote/domain/dto/SmartAlarmGoalType;

    if-nez v3, :cond_7

    move v3, v1

    goto :goto_7

    :cond_7
    invoke-virtual {v3}, Ljava/lang/Object;->hashCode()I

    move-result v3

    :goto_7
    add-int/2addr v0, v3

    mul-int/2addr v0, v2

    iget-object v3, p0, Lcom/whoop/data/remote/domain/dto/SmartAlarmUserInfoDto;->windowMinutes:Ljava/lang/Integer;

    if-nez v3, :cond_8

    move v3, v1

    goto :goto_8

    :cond_8
    invoke-virtual {v3}, Ljava/lang/Object;->hashCode()I

    move-result v3

    :goto_8
    add-int/2addr v0, v3

    mul-int/2addr v0, v2

    iget-boolean v3, p0, Lcom/whoop/data/remote/domain/dto/SmartAlarmUserInfoDto;->scheduleEnabled:Z

    invoke-static {v0, v2, v3}, Lb9/y;->b(IIZ)I

    move-result v0

    iget-object v3, p0, Lcom/whoop/data/remote/domain/dto/SmartAlarmUserInfoDto;->dayOfWeek:Lcom/whoop/data/remote/domain/dto/DayOfWeekType;

    if-nez v3, :cond_9

    move v3, v1

    goto :goto_9

    :cond_9
    invoke-virtual {v3}, Ljava/lang/Object;->hashCode()I

    move-result v3

    :goto_9
    add-int/2addr v0, v3

    mul-int/2addr v0, v2

    iget-object v3, p0, Lcom/whoop/data/remote/domain/dto/SmartAlarmUserInfoDto;->isEnrolledInWeeklyPlan:Ljava/lang/Boolean;

    if-nez v3, :cond_a

    move v3, v1

    goto :goto_a

    :cond_a
    invoke-virtual {v3}, Ljava/lang/Object;->hashCode()I

    move-result v3

    :goto_a
    add-int/2addr v0, v3

    mul-int/2addr v0, v2

    iget-object v3, p0, Lcom/whoop/data/remote/domain/dto/SmartAlarmUserInfoDto;->weeklyPlanGoal:Ljava/lang/Integer;

    if-nez v3, :cond_b

    move v3, v1

    goto :goto_b

    :cond_b
    invoke-virtual {v3}, Ljava/lang/Object;->hashCode()I

    move-result v3

    :goto_b
    add-int/2addr v0, v3

    mul-int/2addr v0, v2

    iget-object v3, p0, Lcom/whoop/data/remote/domain/dto/SmartAlarmUserInfoDto;->timeZoneOffset:Ljava/lang/String;

    if-nez v3, :cond_c

    move v3, v1

    goto :goto_c

    :cond_c
    invoke-virtual {v3}, Ljava/lang/String;->hashCode()I

    move-result v3

    :goto_c
    add-int/2addr v0, v3

    mul-int/2addr v0, v2

    iget-object v3, p0, Lcom/whoop/data/remote/domain/dto/SmartAlarmUserInfoDto;->alarmBounds:Ljava/lang/String;

    if-nez v3, :cond_d

    move v3, v1

    goto :goto_d

    :cond_d
    invoke-virtual {v3}, Ljava/lang/String;->hashCode()I

    move-result v3

    :goto_d
    add-int/2addr v0, v3

    mul-int/2addr v0, v2

    iget-object v2, p0, Lcom/whoop/data/remote/domain/dto/SmartAlarmUserInfoDto;->optimizeSleep:Ljava/lang/String;

    if-nez v2, :cond_e

    goto :goto_e

    :cond_e
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v1

    :goto_e
    add-int/2addr v0, v1

    return v0
.end method

.method public final isEnrolledInWeeklyPlan()Ljava/lang/Boolean;
    .locals 1

    .line 1
    iget-object v0, p0, Lcom/whoop/data/remote/domain/dto/SmartAlarmUserInfoDto;->isEnrolledInWeeklyPlan:Ljava/lang/Boolean;

    return-object v0
.end method

.method public final toSmartAlarmUserInfo()Lcom/whoop/data/local/room/entity/SmartAlarmUserInfo;
    .locals 20

    move-object/from16 v0, p0

    new-instance v1, Lcom/whoop/data/local/room/entity/SmartAlarmUserInfo;

    iget-object v2, v0, Lcom/whoop/data/remote/domain/dto/SmartAlarmUserInfoDto;->userId:Ljava/lang/Integer;

    invoke-static {v2}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v2

    iget-object v3, v0, Lcom/whoop/data/remote/domain/dto/SmartAlarmUserInfoDto;->windowMinutes:Ljava/lang/Integer;

    invoke-static {v3}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v3

    iget-object v4, v0, Lcom/whoop/data/remote/domain/dto/SmartAlarmUserInfoDto;->upperTimeBound:Ljava/lang/String;

    invoke-static {v4}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    iget-object v5, v0, Lcom/whoop/data/remote/domain/dto/SmartAlarmUserInfoDto;->lastTriggeredAt:Ljava/lang/String;

    iget-object v6, v0, Lcom/whoop/data/remote/domain/dto/SmartAlarmUserInfoDto;->sleepScoreGoal:Ljava/lang/Integer;

    iget-object v7, v0, Lcom/whoop/data/remote/domain/dto/SmartAlarmUserInfoDto;->recoveryScoreGoal:Ljava/lang/Integer;

    iget-object v8, v0, Lcom/whoop/data/remote/domain/dto/SmartAlarmUserInfoDto;->smartAlarmGoal:Lcom/whoop/data/remote/domain/dto/SmartAlarmGoalType;

    invoke-static {v8}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    iget-object v9, v0, Lcom/whoop/data/remote/domain/dto/SmartAlarmUserInfoDto;->smartAlarmEnabled:Ljava/lang/Boolean;

    invoke-static {v9}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-virtual {v9}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v9

    invoke-static {}, Lorg/joda/time/Instant;->now()Lorg/joda/time/Instant;

    move-result-object v10

    invoke-virtual {v10}, Lorg/joda/time/Instant;->getMillis()J

    move-result-wide v10

    iget-boolean v12, v0, Lcom/whoop/data/remote/domain/dto/SmartAlarmUserInfoDto;->scheduleEnabled:Z

    iget-object v13, v0, Lcom/whoop/data/remote/domain/dto/SmartAlarmUserInfoDto;->dayOfWeek:Lcom/whoop/data/remote/domain/dto/DayOfWeekType;

    invoke-direct {v0}, Lcom/whoop/data/remote/domain/dto/SmartAlarmUserInfoDto;->isEnrolledInWeeklyPlan()Z

    move-result v14

    iget-object v15, v0, Lcom/whoop/data/remote/domain/dto/SmartAlarmUserInfoDto;->weeklyPlanGoal:Ljava/lang/Integer;

    move-object/from16 v16, v1

    iget-object v1, v0, Lcom/whoop/data/remote/domain/dto/SmartAlarmUserInfoDto;->timeZoneOffset:Ljava/lang/String;

    move-object/from16 v17, v1

    iget-object v1, v0, Lcom/whoop/data/remote/domain/dto/SmartAlarmUserInfoDto;->alarmBounds:Ljava/lang/String;

    move-object/from16 v18, v1

    iget-object v1, v0, Lcom/whoop/data/remote/domain/dto/SmartAlarmUserInfoDto;->weeklyPlanHoursOfSleep:Ljava/lang/String;

    move-object/from16 v19, v18

    move-object/from16 v18, v1

    move-object/from16 v1, v16

    move-object/from16 v16, v17

    move-object/from16 v17, v19

    invoke-direct/range {v1 .. v18}, Lcom/whoop/data/local/room/entity/SmartAlarmUserInfo;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Lcom/whoop/data/remote/domain/dto/SmartAlarmGoalType;ZJZLcom/whoop/data/remote/domain/dto/DayOfWeekType;ZLjava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    move-object/from16 v16, v1

    return-object v16
.end method

.method public toString()Ljava/lang/String;
    .locals 19

    move-object/from16 v0, p0

    iget-object v1, v0, Lcom/whoop/data/remote/domain/dto/SmartAlarmUserInfoDto;->userId:Ljava/lang/Integer;

    iget-object v2, v0, Lcom/whoop/data/remote/domain/dto/SmartAlarmUserInfoDto;->upperTimeBound:Ljava/lang/String;

    iget-object v3, v0, Lcom/whoop/data/remote/domain/dto/SmartAlarmUserInfoDto;->lastTriggeredAt:Ljava/lang/String;

    iget-object v4, v0, Lcom/whoop/data/remote/domain/dto/SmartAlarmUserInfoDto;->sleepScoreGoal:Ljava/lang/Integer;

    iget-object v5, v0, Lcom/whoop/data/remote/domain/dto/SmartAlarmUserInfoDto;->recoveryScoreGoal:Ljava/lang/Integer;

    iget-object v6, v0, Lcom/whoop/data/remote/domain/dto/SmartAlarmUserInfoDto;->weeklyPlanHoursOfSleep:Ljava/lang/String;

    iget-object v7, v0, Lcom/whoop/data/remote/domain/dto/SmartAlarmUserInfoDto;->smartAlarmEnabled:Ljava/lang/Boolean;

    iget-object v8, v0, Lcom/whoop/data/remote/domain/dto/SmartAlarmUserInfoDto;->smartAlarmGoal:Lcom/whoop/data/remote/domain/dto/SmartAlarmGoalType;

    iget-object v9, v0, Lcom/whoop/data/remote/domain/dto/SmartAlarmUserInfoDto;->windowMinutes:Ljava/lang/Integer;

    iget-boolean v10, v0, Lcom/whoop/data/remote/domain/dto/SmartAlarmUserInfoDto;->scheduleEnabled:Z

    iget-object v11, v0, Lcom/whoop/data/remote/domain/dto/SmartAlarmUserInfoDto;->dayOfWeek:Lcom/whoop/data/remote/domain/dto/DayOfWeekType;

    iget-object v12, v0, Lcom/whoop/data/remote/domain/dto/SmartAlarmUserInfoDto;->isEnrolledInWeeklyPlan:Ljava/lang/Boolean;

    iget-object v13, v0, Lcom/whoop/data/remote/domain/dto/SmartAlarmUserInfoDto;->weeklyPlanGoal:Ljava/lang/Integer;

    iget-object v14, v0, Lcom/whoop/data/remote/domain/dto/SmartAlarmUserInfoDto;->timeZoneOffset:Ljava/lang/String;

    iget-object v15, v0, Lcom/whoop/data/remote/domain/dto/SmartAlarmUserInfoDto;->alarmBounds:Ljava/lang/String;

    move-object/from16 v16, v15

    iget-object v15, v0, Lcom/whoop/data/remote/domain/dto/SmartAlarmUserInfoDto;->optimizeSleep:Ljava/lang/String;

    const-string v0, ", upperTimeBound="

    move-object/from16 v17, v15

    const-string v15, ", lastTriggeredAt="

    move-object/from16 v18, v13

    const-string v13, "SmartAlarmUserInfoDto(userId="

    invoke-static {v13, v0, v1, v2, v15}, Lr80/c;->s(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", sleepScoreGoal="

    const-string v2, ", recoveryScoreGoal="

    invoke-static {v4, v3, v1, v2, v0}, Lq63/c;->w(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;)V

    const-string v1, ", weeklyPlanHoursOfSleep="

    const-string v2, ", smartAlarmEnabled="

    invoke-static {v5, v1, v6, v2, v0}, Lev/n;->x(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;)V

    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", smartAlarmGoal="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", windowMinutes="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", scheduleEnabled="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v10}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", dayOfWeek="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", isEnrolledInWeeklyPlan="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", weeklyPlanGoal="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", timeZoneOffset="

    const-string v2, ", alarmBounds="

    move-object/from16 v3, v18

    invoke-static {v3, v1, v14, v2, v0}, Lev/n;->x(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;)V

    const-string v1, ", optimizeSleep="

    const-string v2, ")"

    move-object/from16 v3, v16

    move-object/from16 v4, v17

    invoke-static {v0, v3, v1, v4, v2}, Ld;->r(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
