.class public final Lcom/whoop/data/local/room/entity/SmartAlarmUserInfo;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000V\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\t\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u001f\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0019\u0008\u0087\u0008\u0018\u00002\u00020\u0001B\u009b\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0008\u0010\u0008\u001a\u0004\u0018\u00010\u0003\u0012\u0008\u0010\t\u001a\u0004\u0018\u00010\u0003\u0012\u0008\u0008\u0001\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\u000c\u001a\u00020\r\u0012\u0006\u0010\u000e\u001a\u00020\u000f\u0012\u0006\u0010\u0010\u001a\u00020\r\u0012\n\u0008\u0001\u0010\u0011\u001a\u0004\u0018\u00010\u0012\u0012\u0006\u0010\u0013\u001a\u00020\r\u0012\u0008\u0010\u0014\u001a\u0004\u0018\u00010\u0003\u0012\u0008\u0010\u0015\u001a\u0004\u0018\u00010\u0006\u0012\u0008\u0010\u0016\u001a\u0004\u0018\u00010\u0006\u0012\u0008\u0010\u0017\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\u0004\u0008\u0018\u0010\u0019J\t\u0010A\u001a\u00020\u0003H\u00c6\u0003J\t\u0010B\u001a\u00020\u0003H\u00c6\u0003J\t\u0010C\u001a\u00020\u0006H\u00c6\u0003J\u000b\u0010D\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003J\u0010\u0010E\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010!J\u0010\u0010F\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010!J\t\u0010G\u001a\u00020\u000bH\u00c6\u0003J\t\u0010H\u001a\u00020\rH\u00c6\u0003J\t\u0010I\u001a\u00020\u000fH\u00c6\u0003J\t\u0010J\u001a\u00020\rH\u00c6\u0003J\u000b\u0010K\u001a\u0004\u0018\u00010\u0012H\u00c6\u0003J\t\u0010L\u001a\u00020\rH\u00c6\u0003J\u0010\u0010M\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010!J\u000b\u0010N\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003J\u000b\u0010O\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003J\u000b\u0010P\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003J\u00be\u0001\u0010Q\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u00062\n\u0008\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\u0008\u0002\u0010\u0008\u001a\u0004\u0018\u00010\u00032\n\u0008\u0002\u0010\t\u001a\u0004\u0018\u00010\u00032\u0008\u0008\u0003\u0010\n\u001a\u00020\u000b2\u0008\u0008\u0002\u0010\u000c\u001a\u00020\r2\u0008\u0008\u0002\u0010\u000e\u001a\u00020\u000f2\u0008\u0008\u0002\u0010\u0010\u001a\u00020\r2\n\u0008\u0003\u0010\u0011\u001a\u0004\u0018\u00010\u00122\u0008\u0008\u0002\u0010\u0013\u001a\u00020\r2\n\u0008\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00032\n\u0008\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00062\n\u0008\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00062\n\u0008\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0006H\u00c6\u0001\u00a2\u0006\u0002\u0010RJ\u0014\u0010S\u001a\u00020\r2\u0008\u0010T\u001a\u0004\u0018\u00010\u0001H\u00d6\u0083\u0004J\n\u0010U\u001a\u00020\u0003H\u00d6\u0081\u0004J\n\u0010V\u001a\u00020\u0006H\u00d6\u0081\u0004R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001a\u0010\u001bR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001c\u0010\u001bR\u0016\u0010\u0005\u001a\u00020\u00068\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001d\u0010\u001eR\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001f\u0010\u001eR\u001a\u0010\u0008\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\n\n\u0002\u0010\"\u001a\u0004\u0008 \u0010!R\u001a\u0010\t\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\n\n\u0002\u0010\"\u001a\u0004\u0008#\u0010!R\u0016\u0010\n\u001a\u00020\u000b8\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008$\u0010%R\u0016\u0010\u000c\u001a\u00020\r8\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008&\u0010\'R\u0016\u0010\u000e\u001a\u00020\u000f8\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008(\u0010)R\u0016\u0010\u0010\u001a\u00020\r8\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008*\u0010\'R\u0018\u0010\u0011\u001a\u0004\u0018\u00010\u00128\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008+\u0010,R\u0016\u0010\u0013\u001a\u00020\r8\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0013\u0010\'R\u001a\u0010\u0014\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004\u00a2\u0006\n\n\u0002\u0010\"\u001a\u0004\u0008-\u0010!R\u0018\u0010\u0015\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008.\u0010\u001eR\u0018\u0010\u0016\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008/\u0010\u001eR\u0018\u0010\u0017\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u00080\u0010\u001eR\u0011\u00101\u001a\u0002028F\u00a2\u0006\u0006\u001a\u0004\u00083\u00104R\u0016\u00105\u001a\u0002068\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u00087\u00108R\u0016\u00109\u001a\u00020:8\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008;\u0010<R\u0018\u0010=\u001a\u0004\u0018\u00010>8\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008?\u0010@\u00a8\u0006W"
    }
    d2 = {
        "Lcom/whoop/data/local/room/entity/SmartAlarmUserInfo;",
        "",
        "userId",
        "",
        "windowMinutes",
        "upperTimeBound",
        "",
        "lastTriggeredAt",
        "sleepScoreGoal",
        "recoveryScoreGoal",
        "goal",
        "Lcom/whoop/data/remote/domain/dto/SmartAlarmGoalType;",
        "smartAlarmEnabled",
        "",
        "lastUpdatedTime",
        "",
        "scheduleEnabled",
        "dayOfWeek",
        "Lcom/whoop/data/remote/domain/dto/DayOfWeekType;",
        "isEnrolledInWeeklyPlan",
        "weeklyPlanGoal",
        "timeZoneOffset",
        "alarmBounds",
        "weeklyPlanHourGoal",
        "<init>",
        "(IILjava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Lcom/whoop/data/remote/domain/dto/SmartAlarmGoalType;ZJZLcom/whoop/data/remote/domain/dto/DayOfWeekType;ZLjava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V",
        "getUserId",
        "()I",
        "getWindowMinutes",
        "getUpperTimeBound",
        "()Ljava/lang/String;",
        "getLastTriggeredAt",
        "getSleepScoreGoal",
        "()Ljava/lang/Integer;",
        "Ljava/lang/Integer;",
        "getRecoveryScoreGoal",
        "getGoal",
        "()Lcom/whoop/data/remote/domain/dto/SmartAlarmGoalType;",
        "getSmartAlarmEnabled",
        "()Z",
        "getLastUpdatedTime",
        "()J",
        "getScheduleEnabled",
        "getDayOfWeek",
        "()Lcom/whoop/data/remote/domain/dto/DayOfWeekType;",
        "getWeeklyPlanGoal",
        "getTimeZoneOffset",
        "getAlarmBounds",
        "getWeeklyPlanHourGoal",
        "upperTimeBoundLocalDateTime",
        "Lorg/joda/time/LocalDateTime;",
        "getUpperTimeBoundLocalDateTime",
        "()Lorg/joda/time/LocalDateTime;",
        "upperBoundLocalTime",
        "Lorg/joda/time/LocalTime;",
        "getUpperBoundLocalTime",
        "()Lorg/joda/time/LocalTime;",
        "lastUpdatedAt",
        "Lorg/joda/time/Instant;",
        "getLastUpdatedAt",
        "()Lorg/joda/time/Instant;",
        "alarmBoundsTime",
        "Lcom/whoop/data/remote/domain/dto/DateTimeRange;",
        "getAlarmBoundsTime",
        "()Lcom/whoop/data/remote/domain/dto/DateTimeRange;",
        "component1",
        "component2",
        "component3",
        "component4",
        "component5",
        "component6",
        "component7",
        "component8",
        "component9",
        "component10",
        "component11",
        "component12",
        "component13",
        "component14",
        "component15",
        "component16",
        "copy",
        "(IILjava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Lcom/whoop/data/remote/domain/dto/SmartAlarmGoalType;ZJZLcom/whoop/data/remote/domain/dto/DayOfWeekType;ZLjava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/whoop/data/local/room/entity/SmartAlarmUserInfo;",
        "equals",
        "other",
        "hashCode",
        "toString",
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


# instance fields
.field private final alarmBounds:Ljava/lang/String;

.field private final alarmBoundsTime:Lcom/whoop/data/remote/domain/dto/DateTimeRange;

.field private final dayOfWeek:Lcom/whoop/data/remote/domain/dto/DayOfWeekType;

.field private final goal:Lcom/whoop/data/remote/domain/dto/SmartAlarmGoalType;

.field private final isEnrolledInWeeklyPlan:Z

.field private final lastTriggeredAt:Ljava/lang/String;

.field private final lastUpdatedAt:Lorg/joda/time/Instant;

.field private final lastUpdatedTime:J

.field private final recoveryScoreGoal:Ljava/lang/Integer;

.field private final scheduleEnabled:Z

.field private final sleepScoreGoal:Ljava/lang/Integer;

.field private final smartAlarmEnabled:Z

.field private final timeZoneOffset:Ljava/lang/String;

.field private final upperBoundLocalTime:Lorg/joda/time/LocalTime;

.field private final upperTimeBound:Ljava/lang/String;

.field private final userId:I

.field private final weeklyPlanGoal:Ljava/lang/Integer;

.field private final weeklyPlanHourGoal:Ljava/lang/String;

.field private final windowMinutes:I


# direct methods
.method public constructor <init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Lcom/whoop/data/remote/domain/dto/SmartAlarmGoalType;ZJZLcom/whoop/data/remote/domain/dto/DayOfWeekType;ZLjava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
    .locals 2

    move-object/from16 v0, p16

    const-string v1, "upperTimeBound"

    invoke-static {p3, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "goal"

    invoke-static {p7, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lcom/whoop/data/local/room/entity/SmartAlarmUserInfo;->userId:I

    iput p2, p0, Lcom/whoop/data/local/room/entity/SmartAlarmUserInfo;->windowMinutes:I

    iput-object p3, p0, Lcom/whoop/data/local/room/entity/SmartAlarmUserInfo;->upperTimeBound:Ljava/lang/String;

    iput-object p4, p0, Lcom/whoop/data/local/room/entity/SmartAlarmUserInfo;->lastTriggeredAt:Ljava/lang/String;

    iput-object p5, p0, Lcom/whoop/data/local/room/entity/SmartAlarmUserInfo;->sleepScoreGoal:Ljava/lang/Integer;

    iput-object p6, p0, Lcom/whoop/data/local/room/entity/SmartAlarmUserInfo;->recoveryScoreGoal:Ljava/lang/Integer;

    iput-object p7, p0, Lcom/whoop/data/local/room/entity/SmartAlarmUserInfo;->goal:Lcom/whoop/data/remote/domain/dto/SmartAlarmGoalType;

    iput-boolean p8, p0, Lcom/whoop/data/local/room/entity/SmartAlarmUserInfo;->smartAlarmEnabled:Z

    iput-wide p9, p0, Lcom/whoop/data/local/room/entity/SmartAlarmUserInfo;->lastUpdatedTime:J

    iput-boolean p11, p0, Lcom/whoop/data/local/room/entity/SmartAlarmUserInfo;->scheduleEnabled:Z

    move-object p1, p12

    iput-object p1, p0, Lcom/whoop/data/local/room/entity/SmartAlarmUserInfo;->dayOfWeek:Lcom/whoop/data/remote/domain/dto/DayOfWeekType;

    move p1, p13

    iput-boolean p1, p0, Lcom/whoop/data/local/room/entity/SmartAlarmUserInfo;->isEnrolledInWeeklyPlan:Z

    move-object/from16 p1, p14

    iput-object p1, p0, Lcom/whoop/data/local/room/entity/SmartAlarmUserInfo;->weeklyPlanGoal:Ljava/lang/Integer;

    move-object/from16 p1, p15

    iput-object p1, p0, Lcom/whoop/data/local/room/entity/SmartAlarmUserInfo;->timeZoneOffset:Ljava/lang/String;

    iput-object v0, p0, Lcom/whoop/data/local/room/entity/SmartAlarmUserInfo;->alarmBounds:Ljava/lang/String;

    move-object/from16 p1, p17

    iput-object p1, p0, Lcom/whoop/data/local/room/entity/SmartAlarmUserInfo;->weeklyPlanHourGoal:Ljava/lang/String;

    sget-object p1, Lor2/u;->b:Lor2/u$a;

    invoke-virtual {p1}, Lor2/u$a;->k()Lorg/joda/time/format/DateTimeFormatter;

    move-result-object p1

    invoke-virtual {p1, p3}, Lorg/joda/time/format/DateTimeFormatter;->parseLocalTime(Ljava/lang/String;)Lorg/joda/time/LocalTime;

    move-result-object p1

    const-string p2, "parseLocalTime(...)"

    invoke-static {p1, p2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    iput-object p1, p0, Lcom/whoop/data/local/room/entity/SmartAlarmUserInfo;->upperBoundLocalTime:Lorg/joda/time/LocalTime;

    new-instance p1, Lorg/joda/time/Instant;

    invoke-direct {p1, p9, p10}, Lorg/joda/time/Instant;-><init>(J)V

    iput-object p1, p0, Lcom/whoop/data/local/room/entity/SmartAlarmUserInfo;->lastUpdatedAt:Lorg/joda/time/Instant;

    const/4 p1, 0x0

    if-eqz v0, :cond_1

    invoke-interface {v0}, Ljava/lang/CharSequence;->length()I

    move-result p2

    if-lez p2, :cond_0

    goto :goto_0

    :cond_0
    move-object v0, p1

    :goto_0
    if-eqz v0, :cond_1

    new-instance p1, Lcom/whoop/data/remote/domain/dto/DateTimeRange;

    invoke-direct {p1, v0}, Lcom/whoop/data/remote/domain/dto/DateTimeRange;-><init>(Ljava/lang/String;)V

    :cond_1
    iput-object p1, p0, Lcom/whoop/data/local/room/entity/SmartAlarmUserInfo;->alarmBoundsTime:Lcom/whoop/data/remote/domain/dto/DateTimeRange;

    return-void
.end method

.method public static synthetic copy$default(Lcom/whoop/data/local/room/entity/SmartAlarmUserInfo;IILjava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Lcom/whoop/data/remote/domain/dto/SmartAlarmGoalType;ZJZLcom/whoop/data/remote/domain/dto/DayOfWeekType;ZLjava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ILjava/lang/Object;)Lcom/whoop/data/local/room/entity/SmartAlarmUserInfo;
    .locals 17

    move-object/from16 v0, p0

    move/from16 v1, p18

    and-int/lit8 v2, v1, 0x1

    if-eqz v2, :cond_0

    iget v2, v0, Lcom/whoop/data/local/room/entity/SmartAlarmUserInfo;->userId:I

    goto :goto_0

    :cond_0
    move/from16 v2, p1

    :goto_0
    and-int/lit8 v3, v1, 0x2

    if-eqz v3, :cond_1

    iget v3, v0, Lcom/whoop/data/local/room/entity/SmartAlarmUserInfo;->windowMinutes:I

    goto :goto_1

    :cond_1
    move/from16 v3, p2

    :goto_1
    and-int/lit8 v4, v1, 0x4

    if-eqz v4, :cond_2

    iget-object v4, v0, Lcom/whoop/data/local/room/entity/SmartAlarmUserInfo;->upperTimeBound:Ljava/lang/String;

    goto :goto_2

    :cond_2
    move-object/from16 v4, p3

    :goto_2
    and-int/lit8 v5, v1, 0x8

    if-eqz v5, :cond_3

    iget-object v5, v0, Lcom/whoop/data/local/room/entity/SmartAlarmUserInfo;->lastTriggeredAt:Ljava/lang/String;

    goto :goto_3

    :cond_3
    move-object/from16 v5, p4

    :goto_3
    and-int/lit8 v6, v1, 0x10

    if-eqz v6, :cond_4

    iget-object v6, v0, Lcom/whoop/data/local/room/entity/SmartAlarmUserInfo;->sleepScoreGoal:Ljava/lang/Integer;

    goto :goto_4

    :cond_4
    move-object/from16 v6, p5

    :goto_4
    and-int/lit8 v7, v1, 0x20

    if-eqz v7, :cond_5

    iget-object v7, v0, Lcom/whoop/data/local/room/entity/SmartAlarmUserInfo;->recoveryScoreGoal:Ljava/lang/Integer;

    goto :goto_5

    :cond_5
    move-object/from16 v7, p6

    :goto_5
    and-int/lit8 v8, v1, 0x40

    if-eqz v8, :cond_6

    iget-object v8, v0, Lcom/whoop/data/local/room/entity/SmartAlarmUserInfo;->goal:Lcom/whoop/data/remote/domain/dto/SmartAlarmGoalType;

    goto :goto_6

    :cond_6
    move-object/from16 v8, p7

    :goto_6
    and-int/lit16 v9, v1, 0x80

    if-eqz v9, :cond_7

    iget-boolean v9, v0, Lcom/whoop/data/local/room/entity/SmartAlarmUserInfo;->smartAlarmEnabled:Z

    goto :goto_7

    :cond_7
    move/from16 v9, p8

    :goto_7
    and-int/lit16 v10, v1, 0x100

    if-eqz v10, :cond_8

    iget-wide v10, v0, Lcom/whoop/data/local/room/entity/SmartAlarmUserInfo;->lastUpdatedTime:J

    goto :goto_8

    :cond_8
    move-wide/from16 v10, p9

    :goto_8
    and-int/lit16 v12, v1, 0x200

    if-eqz v12, :cond_9

    iget-boolean v12, v0, Lcom/whoop/data/local/room/entity/SmartAlarmUserInfo;->scheduleEnabled:Z

    goto :goto_9

    :cond_9
    move/from16 v12, p11

    :goto_9
    and-int/lit16 v13, v1, 0x400

    if-eqz v13, :cond_a

    iget-object v13, v0, Lcom/whoop/data/local/room/entity/SmartAlarmUserInfo;->dayOfWeek:Lcom/whoop/data/remote/domain/dto/DayOfWeekType;

    goto :goto_a

    :cond_a
    move-object/from16 v13, p12

    :goto_a
    and-int/lit16 v14, v1, 0x800

    if-eqz v14, :cond_b

    iget-boolean v14, v0, Lcom/whoop/data/local/room/entity/SmartAlarmUserInfo;->isEnrolledInWeeklyPlan:Z

    goto :goto_b

    :cond_b
    move/from16 v14, p13

    :goto_b
    and-int/lit16 v15, v1, 0x1000

    if-eqz v15, :cond_c

    iget-object v15, v0, Lcom/whoop/data/local/room/entity/SmartAlarmUserInfo;->weeklyPlanGoal:Ljava/lang/Integer;

    goto :goto_c

    :cond_c
    move-object/from16 v15, p14

    :goto_c
    move/from16 p1, v2

    and-int/lit16 v2, v1, 0x2000

    if-eqz v2, :cond_d

    iget-object v2, v0, Lcom/whoop/data/local/room/entity/SmartAlarmUserInfo;->timeZoneOffset:Ljava/lang/String;

    goto :goto_d

    :cond_d
    move-object/from16 v2, p15

    :goto_d
    move-object/from16 p2, v2

    and-int/lit16 v2, v1, 0x4000

    if-eqz v2, :cond_e

    iget-object v2, v0, Lcom/whoop/data/local/room/entity/SmartAlarmUserInfo;->alarmBounds:Ljava/lang/String;

    goto :goto_e

    :cond_e
    move-object/from16 v2, p16

    :goto_e
    const v16, 0x8000

    and-int v1, v1, v16

    if-eqz v1, :cond_f

    iget-object v1, v0, Lcom/whoop/data/local/room/entity/SmartAlarmUserInfo;->weeklyPlanHourGoal:Ljava/lang/String;

    move-object/from16 p18, v1

    :goto_f
    move-object/from16 p16, p2

    move-object/from16 p17, v2

    move/from16 p3, v3

    move-object/from16 p4, v4

    move-object/from16 p5, v5

    move-object/from16 p6, v6

    move-object/from16 p7, v7

    move-object/from16 p8, v8

    move/from16 p9, v9

    move-wide/from16 p10, v10

    move/from16 p12, v12

    move-object/from16 p13, v13

    move/from16 p14, v14

    move-object/from16 p15, v15

    move/from16 p2, p1

    move-object/from16 p1, v0

    goto :goto_10

    :cond_f
    move-object/from16 p18, p17

    goto :goto_f

    :goto_10
    invoke-virtual/range {p1 .. p18}, Lcom/whoop/data/local/room/entity/SmartAlarmUserInfo;->copy(IILjava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Lcom/whoop/data/remote/domain/dto/SmartAlarmGoalType;ZJZLcom/whoop/data/remote/domain/dto/DayOfWeekType;ZLjava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/whoop/data/local/room/entity/SmartAlarmUserInfo;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public final component1()I
    .locals 1

    iget v0, p0, Lcom/whoop/data/local/room/entity/SmartAlarmUserInfo;->userId:I

    return v0
.end method

.method public final component10()Z
    .locals 1

    iget-boolean v0, p0, Lcom/whoop/data/local/room/entity/SmartAlarmUserInfo;->scheduleEnabled:Z

    return v0
.end method

.method public final component11()Lcom/whoop/data/remote/domain/dto/DayOfWeekType;
    .locals 1

    iget-object v0, p0, Lcom/whoop/data/local/room/entity/SmartAlarmUserInfo;->dayOfWeek:Lcom/whoop/data/remote/domain/dto/DayOfWeekType;

    return-object v0
.end method

.method public final component12()Z
    .locals 1

    iget-boolean v0, p0, Lcom/whoop/data/local/room/entity/SmartAlarmUserInfo;->isEnrolledInWeeklyPlan:Z

    return v0
.end method

.method public final component13()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lcom/whoop/data/local/room/entity/SmartAlarmUserInfo;->weeklyPlanGoal:Ljava/lang/Integer;

    return-object v0
.end method

.method public final component14()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/data/local/room/entity/SmartAlarmUserInfo;->timeZoneOffset:Ljava/lang/String;

    return-object v0
.end method

.method public final component15()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/data/local/room/entity/SmartAlarmUserInfo;->alarmBounds:Ljava/lang/String;

    return-object v0
.end method

.method public final component16()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/data/local/room/entity/SmartAlarmUserInfo;->weeklyPlanHourGoal:Ljava/lang/String;

    return-object v0
.end method

.method public final component2()I
    .locals 1

    iget v0, p0, Lcom/whoop/data/local/room/entity/SmartAlarmUserInfo;->windowMinutes:I

    return v0
.end method

.method public final component3()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/data/local/room/entity/SmartAlarmUserInfo;->upperTimeBound:Ljava/lang/String;

    return-object v0
.end method

.method public final component4()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/data/local/room/entity/SmartAlarmUserInfo;->lastTriggeredAt:Ljava/lang/String;

    return-object v0
.end method

.method public final component5()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lcom/whoop/data/local/room/entity/SmartAlarmUserInfo;->sleepScoreGoal:Ljava/lang/Integer;

    return-object v0
.end method

.method public final component6()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lcom/whoop/data/local/room/entity/SmartAlarmUserInfo;->recoveryScoreGoal:Ljava/lang/Integer;

    return-object v0
.end method

.method public final component7()Lcom/whoop/data/remote/domain/dto/SmartAlarmGoalType;
    .locals 1

    iget-object v0, p0, Lcom/whoop/data/local/room/entity/SmartAlarmUserInfo;->goal:Lcom/whoop/data/remote/domain/dto/SmartAlarmGoalType;

    return-object v0
.end method

.method public final component8()Z
    .locals 1

    iget-boolean v0, p0, Lcom/whoop/data/local/room/entity/SmartAlarmUserInfo;->smartAlarmEnabled:Z

    return v0
.end method

.method public final component9()J
    .locals 2

    iget-wide v0, p0, Lcom/whoop/data/local/room/entity/SmartAlarmUserInfo;->lastUpdatedTime:J

    return-wide v0
.end method

.method public final copy(IILjava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Lcom/whoop/data/remote/domain/dto/SmartAlarmGoalType;ZJZLcom/whoop/data/remote/domain/dto/DayOfWeekType;ZLjava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/whoop/data/local/room/entity/SmartAlarmUserInfo;
    .locals 19

    const-string v0, "upperTimeBound"

    move-object/from16 v4, p3

    invoke-static {v4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "goal"

    move-object/from16 v8, p7

    invoke-static {v8, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/whoop/data/local/room/entity/SmartAlarmUserInfo;

    move/from16 v2, p1

    move/from16 v3, p2

    move-object/from16 v5, p4

    move-object/from16 v6, p5

    move-object/from16 v7, p6

    move/from16 v9, p8

    move-wide/from16 v10, p9

    move/from16 v12, p11

    move-object/from16 v13, p12

    move/from16 v14, p13

    move-object/from16 v15, p14

    move-object/from16 v16, p15

    move-object/from16 v17, p16

    move-object/from16 v18, p17

    invoke-direct/range {v1 .. v18}, Lcom/whoop/data/local/room/entity/SmartAlarmUserInfo;-><init>(IILjava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Lcom/whoop/data/remote/domain/dto/SmartAlarmGoalType;ZJZLcom/whoop/data/remote/domain/dto/DayOfWeekType;ZLjava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 7

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/data/local/room/entity/SmartAlarmUserInfo;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/data/local/room/entity/SmartAlarmUserInfo;

    iget v1, p0, Lcom/whoop/data/local/room/entity/SmartAlarmUserInfo;->userId:I

    iget v3, p1, Lcom/whoop/data/local/room/entity/SmartAlarmUserInfo;->userId:I

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget v1, p0, Lcom/whoop/data/local/room/entity/SmartAlarmUserInfo;->windowMinutes:I

    iget v3, p1, Lcom/whoop/data/local/room/entity/SmartAlarmUserInfo;->windowMinutes:I

    if-eq v1, v3, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/whoop/data/local/room/entity/SmartAlarmUserInfo;->upperTimeBound:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/data/local/room/entity/SmartAlarmUserInfo;->upperTimeBound:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/whoop/data/local/room/entity/SmartAlarmUserInfo;->lastTriggeredAt:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/data/local/room/entity/SmartAlarmUserInfo;->lastTriggeredAt:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lcom/whoop/data/local/room/entity/SmartAlarmUserInfo;->sleepScoreGoal:Ljava/lang/Integer;

    iget-object v3, p1, Lcom/whoop/data/local/room/entity/SmartAlarmUserInfo;->sleepScoreGoal:Ljava/lang/Integer;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lcom/whoop/data/local/room/entity/SmartAlarmUserInfo;->recoveryScoreGoal:Ljava/lang/Integer;

    iget-object v3, p1, Lcom/whoop/data/local/room/entity/SmartAlarmUserInfo;->recoveryScoreGoal:Ljava/lang/Integer;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    return v2

    :cond_7
    iget-object v1, p0, Lcom/whoop/data/local/room/entity/SmartAlarmUserInfo;->goal:Lcom/whoop/data/remote/domain/dto/SmartAlarmGoalType;

    iget-object v3, p1, Lcom/whoop/data/local/room/entity/SmartAlarmUserInfo;->goal:Lcom/whoop/data/remote/domain/dto/SmartAlarmGoalType;

    if-eq v1, v3, :cond_8

    return v2

    :cond_8
    iget-boolean v1, p0, Lcom/whoop/data/local/room/entity/SmartAlarmUserInfo;->smartAlarmEnabled:Z

    iget-boolean v3, p1, Lcom/whoop/data/local/room/entity/SmartAlarmUserInfo;->smartAlarmEnabled:Z

    if-eq v1, v3, :cond_9

    return v2

    :cond_9
    iget-wide v3, p0, Lcom/whoop/data/local/room/entity/SmartAlarmUserInfo;->lastUpdatedTime:J

    iget-wide v5, p1, Lcom/whoop/data/local/room/entity/SmartAlarmUserInfo;->lastUpdatedTime:J

    cmp-long v1, v3, v5

    if-eqz v1, :cond_a

    return v2

    :cond_a
    iget-boolean v1, p0, Lcom/whoop/data/local/room/entity/SmartAlarmUserInfo;->scheduleEnabled:Z

    iget-boolean v3, p1, Lcom/whoop/data/local/room/entity/SmartAlarmUserInfo;->scheduleEnabled:Z

    if-eq v1, v3, :cond_b

    return v2

    :cond_b
    iget-object v1, p0, Lcom/whoop/data/local/room/entity/SmartAlarmUserInfo;->dayOfWeek:Lcom/whoop/data/remote/domain/dto/DayOfWeekType;

    iget-object v3, p1, Lcom/whoop/data/local/room/entity/SmartAlarmUserInfo;->dayOfWeek:Lcom/whoop/data/remote/domain/dto/DayOfWeekType;

    if-eq v1, v3, :cond_c

    return v2

    :cond_c
    iget-boolean v1, p0, Lcom/whoop/data/local/room/entity/SmartAlarmUserInfo;->isEnrolledInWeeklyPlan:Z

    iget-boolean v3, p1, Lcom/whoop/data/local/room/entity/SmartAlarmUserInfo;->isEnrolledInWeeklyPlan:Z

    if-eq v1, v3, :cond_d

    return v2

    :cond_d
    iget-object v1, p0, Lcom/whoop/data/local/room/entity/SmartAlarmUserInfo;->weeklyPlanGoal:Ljava/lang/Integer;

    iget-object v3, p1, Lcom/whoop/data/local/room/entity/SmartAlarmUserInfo;->weeklyPlanGoal:Ljava/lang/Integer;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_e

    return v2

    :cond_e
    iget-object v1, p0, Lcom/whoop/data/local/room/entity/SmartAlarmUserInfo;->timeZoneOffset:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/data/local/room/entity/SmartAlarmUserInfo;->timeZoneOffset:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_f

    return v2

    :cond_f
    iget-object v1, p0, Lcom/whoop/data/local/room/entity/SmartAlarmUserInfo;->alarmBounds:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/data/local/room/entity/SmartAlarmUserInfo;->alarmBounds:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_10

    return v2

    :cond_10
    iget-object v1, p0, Lcom/whoop/data/local/room/entity/SmartAlarmUserInfo;->weeklyPlanHourGoal:Ljava/lang/String;

    iget-object p1, p1, Lcom/whoop/data/local/room/entity/SmartAlarmUserInfo;->weeklyPlanHourGoal:Ljava/lang/String;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_11

    return v2

    :cond_11
    return v0
.end method

.method public final getAlarmBounds()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/data/local/room/entity/SmartAlarmUserInfo;->alarmBounds:Ljava/lang/String;

    return-object v0
.end method

.method public final getAlarmBoundsTime()Lcom/whoop/data/remote/domain/dto/DateTimeRange;
    .locals 1

    iget-object v0, p0, Lcom/whoop/data/local/room/entity/SmartAlarmUserInfo;->alarmBoundsTime:Lcom/whoop/data/remote/domain/dto/DateTimeRange;

    return-object v0
.end method

.method public final getDayOfWeek()Lcom/whoop/data/remote/domain/dto/DayOfWeekType;
    .locals 1

    iget-object v0, p0, Lcom/whoop/data/local/room/entity/SmartAlarmUserInfo;->dayOfWeek:Lcom/whoop/data/remote/domain/dto/DayOfWeekType;

    return-object v0
.end method

.method public final getGoal()Lcom/whoop/data/remote/domain/dto/SmartAlarmGoalType;
    .locals 1

    iget-object v0, p0, Lcom/whoop/data/local/room/entity/SmartAlarmUserInfo;->goal:Lcom/whoop/data/remote/domain/dto/SmartAlarmGoalType;

    return-object v0
.end method

.method public final getLastTriggeredAt()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/data/local/room/entity/SmartAlarmUserInfo;->lastTriggeredAt:Ljava/lang/String;

    return-object v0
.end method

.method public final getLastUpdatedAt()Lorg/joda/time/Instant;
    .locals 1

    iget-object v0, p0, Lcom/whoop/data/local/room/entity/SmartAlarmUserInfo;->lastUpdatedAt:Lorg/joda/time/Instant;

    return-object v0
.end method

.method public final getLastUpdatedTime()J
    .locals 2

    iget-wide v0, p0, Lcom/whoop/data/local/room/entity/SmartAlarmUserInfo;->lastUpdatedTime:J

    return-wide v0
.end method

.method public final getRecoveryScoreGoal()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lcom/whoop/data/local/room/entity/SmartAlarmUserInfo;->recoveryScoreGoal:Ljava/lang/Integer;

    return-object v0
.end method

.method public final getScheduleEnabled()Z
    .locals 1

    iget-boolean v0, p0, Lcom/whoop/data/local/room/entity/SmartAlarmUserInfo;->scheduleEnabled:Z

    return v0
.end method

.method public final getSleepScoreGoal()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lcom/whoop/data/local/room/entity/SmartAlarmUserInfo;->sleepScoreGoal:Ljava/lang/Integer;

    return-object v0
.end method

.method public final getSmartAlarmEnabled()Z
    .locals 1

    iget-boolean v0, p0, Lcom/whoop/data/local/room/entity/SmartAlarmUserInfo;->smartAlarmEnabled:Z

    return v0
.end method

.method public final getTimeZoneOffset()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/data/local/room/entity/SmartAlarmUserInfo;->timeZoneOffset:Ljava/lang/String;

    return-object v0
.end method

.method public final getUpperBoundLocalTime()Lorg/joda/time/LocalTime;
    .locals 1

    iget-object v0, p0, Lcom/whoop/data/local/room/entity/SmartAlarmUserInfo;->upperBoundLocalTime:Lorg/joda/time/LocalTime;

    return-object v0
.end method

.method public final getUpperTimeBound()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/data/local/room/entity/SmartAlarmUserInfo;->upperTimeBound:Ljava/lang/String;

    return-object v0
.end method

.method public final getUpperTimeBoundLocalDateTime()Lorg/joda/time/LocalDateTime;
    .locals 5

    invoke-static {}, Lorg/joda/time/LocalDateTime;->now()Lorg/joda/time/LocalDateTime;

    move-result-object v0

    iget-object v1, p0, Lcom/whoop/data/local/room/entity/SmartAlarmUserInfo;->upperBoundLocalTime:Lorg/joda/time/LocalTime;

    invoke-virtual {v1}, Lorg/joda/time/LocalTime;->getHourOfDay()I

    move-result v1

    iget-object v2, p0, Lcom/whoop/data/local/room/entity/SmartAlarmUserInfo;->upperBoundLocalTime:Lorg/joda/time/LocalTime;

    invoke-virtual {v2}, Lorg/joda/time/LocalTime;->getMinuteOfHour()I

    move-result v2

    iget-object v3, p0, Lcom/whoop/data/local/room/entity/SmartAlarmUserInfo;->upperBoundLocalTime:Lorg/joda/time/LocalTime;

    invoke-virtual {v3}, Lorg/joda/time/LocalTime;->getSecondOfMinute()I

    move-result v3

    iget-object v4, p0, Lcom/whoop/data/local/room/entity/SmartAlarmUserInfo;->upperBoundLocalTime:Lorg/joda/time/LocalTime;

    invoke-virtual {v4}, Lorg/joda/time/LocalTime;->getMillisOfSecond()I

    move-result v4

    invoke-virtual {v0, v1, v2, v3, v4}, Lorg/joda/time/LocalDateTime;->withTime(IIII)Lorg/joda/time/LocalDateTime;

    move-result-object v0

    const-string v1, "withTime(...)"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    return-object v0
.end method

.method public final getUserId()I
    .locals 1

    iget v0, p0, Lcom/whoop/data/local/room/entity/SmartAlarmUserInfo;->userId:I

    return v0
.end method

.method public final getWeeklyPlanGoal()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lcom/whoop/data/local/room/entity/SmartAlarmUserInfo;->weeklyPlanGoal:Ljava/lang/Integer;

    return-object v0
.end method

.method public final getWeeklyPlanHourGoal()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/data/local/room/entity/SmartAlarmUserInfo;->weeklyPlanHourGoal:Ljava/lang/String;

    return-object v0
.end method

.method public final getWindowMinutes()I
    .locals 1

    iget v0, p0, Lcom/whoop/data/local/room/entity/SmartAlarmUserInfo;->windowMinutes:I

    return v0
.end method

.method public hashCode()I
    .locals 6

    iget v0, p0, Lcom/whoop/data/local/room/entity/SmartAlarmUserInfo;->userId:I

    invoke-static {v0}, Ljava/lang/Integer;->hashCode(I)I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget v2, p0, Lcom/whoop/data/local/room/entity/SmartAlarmUserInfo;->windowMinutes:I

    invoke-static {v2, v0, v1}, Ld;->b(III)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/data/local/room/entity/SmartAlarmUserInfo;->upperTimeBound:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/data/local/room/entity/SmartAlarmUserInfo;->lastTriggeredAt:Ljava/lang/String;

    const/4 v3, 0x0

    if-nez v2, :cond_0

    move v2, v3

    goto :goto_0

    :cond_0
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_0
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/data/local/room/entity/SmartAlarmUserInfo;->sleepScoreGoal:Ljava/lang/Integer;

    if-nez v2, :cond_1

    move v2, v3

    goto :goto_1

    :cond_1
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_1
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/data/local/room/entity/SmartAlarmUserInfo;->recoveryScoreGoal:Ljava/lang/Integer;

    if-nez v2, :cond_2

    move v2, v3

    goto :goto_2

    :cond_2
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_2
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/data/local/room/entity/SmartAlarmUserInfo;->goal:Lcom/whoop/data/remote/domain/dto/SmartAlarmGoalType;

    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    add-int/2addr v2, v0

    mul-int/2addr v2, v1

    iget-boolean v0, p0, Lcom/whoop/data/local/room/entity/SmartAlarmUserInfo;->smartAlarmEnabled:Z

    invoke-static {v2, v1, v0}, Lb9/y;->b(IIZ)I

    move-result v0

    iget-wide v4, p0, Lcom/whoop/data/local/room/entity/SmartAlarmUserInfo;->lastUpdatedTime:J

    invoke-static {v0, v4, v5, v1}, Ld;->e(IJI)I

    move-result v0

    iget-boolean v2, p0, Lcom/whoop/data/local/room/entity/SmartAlarmUserInfo;->scheduleEnabled:Z

    invoke-static {v0, v1, v2}, Lb9/y;->b(IIZ)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/data/local/room/entity/SmartAlarmUserInfo;->dayOfWeek:Lcom/whoop/data/remote/domain/dto/DayOfWeekType;

    if-nez v2, :cond_3

    move v2, v3

    goto :goto_3

    :cond_3
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_3
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-boolean v2, p0, Lcom/whoop/data/local/room/entity/SmartAlarmUserInfo;->isEnrolledInWeeklyPlan:Z

    invoke-static {v0, v1, v2}, Lb9/y;->b(IIZ)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/data/local/room/entity/SmartAlarmUserInfo;->weeklyPlanGoal:Ljava/lang/Integer;

    if-nez v2, :cond_4

    move v2, v3

    goto :goto_4

    :cond_4
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_4
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/data/local/room/entity/SmartAlarmUserInfo;->timeZoneOffset:Ljava/lang/String;

    if-nez v2, :cond_5

    move v2, v3

    goto :goto_5

    :cond_5
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_5
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/data/local/room/entity/SmartAlarmUserInfo;->alarmBounds:Ljava/lang/String;

    if-nez v2, :cond_6

    move v2, v3

    goto :goto_6

    :cond_6
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_6
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v1, p0, Lcom/whoop/data/local/room/entity/SmartAlarmUserInfo;->weeklyPlanHourGoal:Ljava/lang/String;

    if-nez v1, :cond_7

    goto :goto_7

    :cond_7
    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v3

    :goto_7
    add-int/2addr v0, v3

    return v0
.end method

.method public final isEnrolledInWeeklyPlan()Z
    .locals 1

    iget-boolean v0, p0, Lcom/whoop/data/local/room/entity/SmartAlarmUserInfo;->isEnrolledInWeeklyPlan:Z

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 20

    move-object/from16 v0, p0

    iget v1, v0, Lcom/whoop/data/local/room/entity/SmartAlarmUserInfo;->userId:I

    iget v2, v0, Lcom/whoop/data/local/room/entity/SmartAlarmUserInfo;->windowMinutes:I

    iget-object v3, v0, Lcom/whoop/data/local/room/entity/SmartAlarmUserInfo;->upperTimeBound:Ljava/lang/String;

    iget-object v4, v0, Lcom/whoop/data/local/room/entity/SmartAlarmUserInfo;->lastTriggeredAt:Ljava/lang/String;

    iget-object v5, v0, Lcom/whoop/data/local/room/entity/SmartAlarmUserInfo;->sleepScoreGoal:Ljava/lang/Integer;

    iget-object v6, v0, Lcom/whoop/data/local/room/entity/SmartAlarmUserInfo;->recoveryScoreGoal:Ljava/lang/Integer;

    iget-object v7, v0, Lcom/whoop/data/local/room/entity/SmartAlarmUserInfo;->goal:Lcom/whoop/data/remote/domain/dto/SmartAlarmGoalType;

    iget-boolean v8, v0, Lcom/whoop/data/local/room/entity/SmartAlarmUserInfo;->smartAlarmEnabled:Z

    iget-wide v9, v0, Lcom/whoop/data/local/room/entity/SmartAlarmUserInfo;->lastUpdatedTime:J

    iget-boolean v11, v0, Lcom/whoop/data/local/room/entity/SmartAlarmUserInfo;->scheduleEnabled:Z

    iget-object v12, v0, Lcom/whoop/data/local/room/entity/SmartAlarmUserInfo;->dayOfWeek:Lcom/whoop/data/remote/domain/dto/DayOfWeekType;

    iget-boolean v13, v0, Lcom/whoop/data/local/room/entity/SmartAlarmUserInfo;->isEnrolledInWeeklyPlan:Z

    iget-object v14, v0, Lcom/whoop/data/local/room/entity/SmartAlarmUserInfo;->weeklyPlanGoal:Ljava/lang/Integer;

    iget-object v15, v0, Lcom/whoop/data/local/room/entity/SmartAlarmUserInfo;->timeZoneOffset:Ljava/lang/String;

    move-object/from16 v16, v15

    iget-object v15, v0, Lcom/whoop/data/local/room/entity/SmartAlarmUserInfo;->alarmBounds:Ljava/lang/String;

    move-object/from16 v17, v15

    iget-object v15, v0, Lcom/whoop/data/local/room/entity/SmartAlarmUserInfo;->weeklyPlanHourGoal:Ljava/lang/String;

    const-string v0, ", windowMinutes="

    move-object/from16 v18, v15

    const-string v15, ", upperTimeBound="

    move-object/from16 v19, v14

    const-string v14, "SmartAlarmUserInfo(userId="

    invoke-static {v1, v2, v14, v0, v15}, Ld;->s(IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", lastTriggeredAt="

    const-string v2, ", sleepScoreGoal="

    invoke-static {v0, v3, v1, v4, v2}, Ld;->B(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, ", recoveryScoreGoal="

    const-string v2, ", goal="

    invoke-static {v0, v5, v1, v6, v2}, Lr80/c;->A(Ljava/lang/StringBuilder;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;)V

    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", smartAlarmEnabled="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v8}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", lastUpdatedTime="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v9, v10}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v1, ", scheduleEnabled="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v11}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", dayOfWeek="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", isEnrolledInWeeklyPlan="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v13}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", weeklyPlanGoal="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v19

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", timeZoneOffset="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v16

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", alarmBounds="

    const-string v2, ", weeklyPlanHourGoal="

    move-object/from16 v3, v17

    move-object/from16 v4, v18

    invoke-static {v0, v1, v3, v2, v4}, Ld;->B(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
