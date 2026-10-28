.class public final Lcom/whoop/coaching/sleepcoach/wizard/ConductorViewState;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation build Landroidx/annotation/Keep;
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0017\n\u0002\u0010\u000e\n\u0002\u0008\u0017\u0008\u0087\u0008\u0018\u00002\u00020\u0001B\u0085\u0001\u0012\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u0002\u0012\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u0005\u0012\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u0005\u0012\u0008\u0008\u0002\u0010\t\u001a\u00020\u0008\u0012\u0008\u0008\u0002\u0010\n\u001a\u00020\u0005\u0012\u0008\u0008\u0002\u0010\u000b\u001a\u00020\u0005\u0012\n\u0008\u0002\u0010\r\u001a\u0004\u0018\u00010\u000c\u0012\n\u0008\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\u0008\u0008\u0002\u0010\u0010\u001a\u00020\u0005\u0012\u0008\u0008\u0002\u0010\u0011\u001a\u00020\u0005\u0012\n\u0008\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u00a2\u0006\u0004\u0008\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002H\u00c6\u0003\u00a2\u0006\u0004\u0008\u0018\u0010\u0017J\u0010\u0010\u0019\u001a\u00020\u0005H\u00c6\u0003\u00a2\u0006\u0004\u0008\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0005H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001b\u0010\u001aJ\u0010\u0010\u001c\u001a\u00020\u0008H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0005H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001e\u0010\u001aJ\u0010\u0010\u001f\u001a\u00020\u0005H\u00c6\u0003\u00a2\u0006\u0004\u0008\u001f\u0010\u001aJ\u0012\u0010 \u001a\u0004\u0018\u00010\u000cH\u00c6\u0003\u00a2\u0006\u0004\u0008 \u0010!J\u0012\u0010\"\u001a\u0004\u0018\u00010\u000eH\u00c6\u0003\u00a2\u0006\u0004\u0008\"\u0010#J\u0010\u0010$\u001a\u00020\u0005H\u00c6\u0003\u00a2\u0006\u0004\u0008$\u0010\u001aJ\u0010\u0010%\u001a\u00020\u0005H\u00c6\u0003\u00a2\u0006\u0004\u0008%\u0010\u001aJ\u0012\u0010&\u001a\u0004\u0018\u00010\u0012H\u00c6\u0003\u00a2\u0006\u0004\u0008&\u0010\'J\u008e\u0001\u0010(\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u00052\u0008\u0008\u0002\u0010\t\u001a\u00020\u00082\u0008\u0008\u0002\u0010\n\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u000b\u001a\u00020\u00052\n\u0008\u0002\u0010\r\u001a\u0004\u0018\u00010\u000c2\n\u0008\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\u0008\u0008\u0002\u0010\u0010\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u0011\u001a\u00020\u00052\n\u0008\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u00c6\u0001\u00a2\u0006\u0004\u0008(\u0010)J\u0010\u0010+\u001a\u00020*H\u00d6\u0001\u00a2\u0006\u0004\u0008+\u0010,J\u0010\u0010-\u001a\u00020\u0008H\u00d6\u0001\u00a2\u0006\u0004\u0008-\u0010\u001dJ\u001a\u0010/\u001a\u00020\u00052\u0008\u0010.\u001a\u0004\u0018\u00010\u0001H\u00d6\u0003\u00a2\u0006\u0004\u0008/\u00100R\u0017\u0010\u0003\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0003\u00101\u001a\u0004\u00082\u0010\u0017R\u0017\u0010\u0004\u001a\u00020\u00028\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0004\u00101\u001a\u0004\u00083\u0010\u0017R\u0017\u0010\u0006\u001a\u00020\u00058\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0006\u00104\u001a\u0004\u00085\u0010\u001aR\u0017\u0010\u0007\u001a\u00020\u00058\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0007\u00104\u001a\u0004\u0008\u0007\u0010\u001aR\u0017\u0010\t\u001a\u00020\u00088\u0006\u00a2\u0006\u000c\n\u0004\u0008\t\u00106\u001a\u0004\u00087\u0010\u001dR\u0017\u0010\n\u001a\u00020\u00058\u0006\u00a2\u0006\u000c\n\u0004\u0008\n\u00104\u001a\u0004\u00088\u0010\u001aR\u0017\u0010\u000b\u001a\u00020\u00058\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000b\u00104\u001a\u0004\u0008\u000b\u0010\u001aR\u0019\u0010\r\u001a\u0004\u0018\u00010\u000c8\u0006\u00a2\u0006\u000c\n\u0004\u0008\r\u00109\u001a\u0004\u0008:\u0010!R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u000f\u0010;\u001a\u0004\u0008<\u0010#R\u0017\u0010\u0010\u001a\u00020\u00058\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0010\u00104\u001a\u0004\u0008=\u0010\u001aR\u0017\u0010\u0011\u001a\u00020\u00058\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0011\u00104\u001a\u0004\u0008>\u0010\u001aR\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0013\u0010?\u001a\u0004\u0008@\u0010\'\u00a8\u0006A"
    }
    d2 = {
        "Lcom/whoop/coaching/sleepcoach/wizard/ConductorViewState;",
        "",
        "Lkp0/a;",
        "currentAlarm",
        "previousAlarm",
        "",
        "currentSelectedAlarm",
        "isAlarmEnabledPreviously",
        "",
        "wakeWindowMinutes",
        "scheduleEnabled",
        "isSkipStrapCheck",
        "Lkp0/q;",
        "weeklyPlan",
        "Lkp0/r;",
        "weeklyPlanHoursOfSleep",
        "disableSchedule",
        "eligibleForSmartAlarms",
        "Lkp0/k;",
        "optimizeSleep",
        "<init>",
        "(Lkp0/a;Lkp0/a;ZZIZZLkp0/q;Lkp0/r;ZZLkp0/k;)V",
        "component1",
        "()Lkp0/a;",
        "component2",
        "component3",
        "()Z",
        "component4",
        "component5",
        "()I",
        "component6",
        "component7",
        "component8",
        "()Lkp0/q;",
        "component9",
        "()Lkp0/r;",
        "component10",
        "component11",
        "component12",
        "()Lkp0/k;",
        "copy",
        "(Lkp0/a;Lkp0/a;ZZIZZLkp0/q;Lkp0/r;ZZLkp0/k;)Lcom/whoop/coaching/sleepcoach/wizard/ConductorViewState;",
        "",
        "toString",
        "()Ljava/lang/String;",
        "hashCode",
        "other",
        "equals",
        "(Ljava/lang/Object;)Z",
        "Lkp0/a;",
        "getCurrentAlarm",
        "getPreviousAlarm",
        "Z",
        "getCurrentSelectedAlarm",
        "I",
        "getWakeWindowMinutes",
        "getScheduleEnabled",
        "Lkp0/q;",
        "getWeeklyPlan",
        "Lkp0/r;",
        "getWeeklyPlanHoursOfSleep",
        "getDisableSchedule",
        "getEligibleForSmartAlarms",
        "Lkp0/k;",
        "getOptimizeSleep",
        "sleep-coach_release"
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


# instance fields
.field private final currentAlarm:Lkp0/a;

.field private final currentSelectedAlarm:Z

.field private final disableSchedule:Z

.field private final eligibleForSmartAlarms:Z

.field private final isAlarmEnabledPreviously:Z

.field private final isSkipStrapCheck:Z

.field private final optimizeSleep:Lkp0/k;

.field private final previousAlarm:Lkp0/a;

.field private final scheduleEnabled:Z

.field private final wakeWindowMinutes:I

.field private final weeklyPlan:Lkp0/q;

.field private final weeklyPlanHoursOfSleep:Lkp0/r;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    sget v0, Lcom/whoop/design/util/TextResource;->$stable:I

    sput v0, Lcom/whoop/coaching/sleepcoach/wizard/ConductorViewState;->$stable:I

    return-void
.end method

.method public constructor <init>()V
    .locals 15

    .line 1
    const/16 v13, 0xfff

    const/4 v14, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    move-object v0, p0

    invoke-direct/range {v0 .. v14}, Lcom/whoop/coaching/sleepcoach/wizard/ConductorViewState;-><init>(Lkp0/a;Lkp0/a;ZZIZZLkp0/q;Lkp0/r;ZZLkp0/k;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-void
.end method

.method public constructor <init>(Lkp0/a;Lkp0/a;ZZIZZLkp0/q;Lkp0/r;ZZLkp0/k;)V
    .locals 1

    const-string v0, "currentAlarm"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "previousAlarm"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-object p1, p0, Lcom/whoop/coaching/sleepcoach/wizard/ConductorViewState;->currentAlarm:Lkp0/a;

    .line 4
    iput-object p2, p0, Lcom/whoop/coaching/sleepcoach/wizard/ConductorViewState;->previousAlarm:Lkp0/a;

    .line 5
    iput-boolean p3, p0, Lcom/whoop/coaching/sleepcoach/wizard/ConductorViewState;->currentSelectedAlarm:Z

    .line 6
    iput-boolean p4, p0, Lcom/whoop/coaching/sleepcoach/wizard/ConductorViewState;->isAlarmEnabledPreviously:Z

    .line 7
    iput p5, p0, Lcom/whoop/coaching/sleepcoach/wizard/ConductorViewState;->wakeWindowMinutes:I

    .line 8
    iput-boolean p6, p0, Lcom/whoop/coaching/sleepcoach/wizard/ConductorViewState;->scheduleEnabled:Z

    .line 9
    iput-boolean p7, p0, Lcom/whoop/coaching/sleepcoach/wizard/ConductorViewState;->isSkipStrapCheck:Z

    .line 10
    iput-object p8, p0, Lcom/whoop/coaching/sleepcoach/wizard/ConductorViewState;->weeklyPlan:Lkp0/q;

    .line 11
    iput-object p9, p0, Lcom/whoop/coaching/sleepcoach/wizard/ConductorViewState;->weeklyPlanHoursOfSleep:Lkp0/r;

    .line 12
    iput-boolean p10, p0, Lcom/whoop/coaching/sleepcoach/wizard/ConductorViewState;->disableSchedule:Z

    .line 13
    iput-boolean p11, p0, Lcom/whoop/coaching/sleepcoach/wizard/ConductorViewState;->eligibleForSmartAlarms:Z

    .line 14
    iput-object p12, p0, Lcom/whoop/coaching/sleepcoach/wizard/ConductorViewState;->optimizeSleep:Lkp0/k;

    return-void
.end method

.method public synthetic constructor <init>(Lkp0/a;Lkp0/a;ZZIZZLkp0/q;Lkp0/r;ZZLkp0/k;ILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 13

    move/from16 v0, p13

    and-int/lit8 v1, v0, 0x1

    if-eqz v1, :cond_0

    .line 15
    sget-object p1, Lcom/whoop/coaching/sleepcoach/wizard/b;->q:Lcom/whoop/coaching/sleepcoach/wizard/b$a;

    invoke-virtual {p1}, Lcom/whoop/coaching/sleepcoach/wizard/b$a;->b()Lkp0/a;

    move-result-object p1

    :cond_0
    and-int/lit8 v1, v0, 0x2

    if-eqz v1, :cond_1

    move-object v1, p1

    goto :goto_0

    :cond_1
    move-object v1, p2

    :goto_0
    and-int/lit8 v2, v0, 0x4

    const/4 v3, 0x0

    if-eqz v2, :cond_2

    move v2, v3

    goto :goto_1

    :cond_2
    move/from16 v2, p3

    :goto_1
    and-int/lit8 v4, v0, 0x8

    if-eqz v4, :cond_3

    move v4, v3

    goto :goto_2

    :cond_3
    move/from16 v4, p4

    :goto_2
    and-int/lit8 v5, v0, 0x10

    if-eqz v5, :cond_4

    const/16 v5, 0x3c

    goto :goto_3

    :cond_4
    move/from16 v5, p5

    :goto_3
    and-int/lit8 v6, v0, 0x20

    if-eqz v6, :cond_5

    move v6, v3

    goto :goto_4

    :cond_5
    move/from16 v6, p6

    :goto_4
    and-int/lit8 v7, v0, 0x40

    if-eqz v7, :cond_6

    move v7, v3

    goto :goto_5

    :cond_6
    move/from16 v7, p7

    :goto_5
    and-int/lit16 v8, v0, 0x80

    const/4 v9, 0x0

    if-eqz v8, :cond_7

    move-object v8, v9

    goto :goto_6

    :cond_7
    move-object/from16 v8, p8

    :goto_6
    and-int/lit16 v10, v0, 0x100

    if-eqz v10, :cond_8

    move-object v10, v9

    goto :goto_7

    :cond_8
    move-object/from16 v10, p9

    :goto_7
    and-int/lit16 v11, v0, 0x200

    if-eqz v11, :cond_9

    move v11, v3

    goto :goto_8

    :cond_9
    move/from16 v11, p10

    :goto_8
    and-int/lit16 v12, v0, 0x400

    if-eqz v12, :cond_a

    goto :goto_9

    :cond_a
    move/from16 v3, p11

    :goto_9
    and-int/lit16 v0, v0, 0x800

    if-eqz v0, :cond_b

    move-object/from16 p14, v9

    :goto_a
    move-object p2, p0

    move-object/from16 p3, p1

    move-object/from16 p4, v1

    move/from16 p5, v2

    move/from16 p13, v3

    move/from16 p6, v4

    move/from16 p7, v5

    move/from16 p8, v6

    move/from16 p9, v7

    move-object/from16 p10, v8

    move-object/from16 p11, v10

    move/from16 p12, v11

    goto :goto_b

    :cond_b
    move-object/from16 p14, p12

    goto :goto_a

    .line 16
    :goto_b
    invoke-direct/range {p2 .. p14}, Lcom/whoop/coaching/sleepcoach/wizard/ConductorViewState;-><init>(Lkp0/a;Lkp0/a;ZZIZZLkp0/q;Lkp0/r;ZZLkp0/k;)V

    return-void
.end method

.method public static synthetic copy$default(Lcom/whoop/coaching/sleepcoach/wizard/ConductorViewState;Lkp0/a;Lkp0/a;ZZIZZLkp0/q;Lkp0/r;ZZLkp0/k;ILjava/lang/Object;)Lcom/whoop/coaching/sleepcoach/wizard/ConductorViewState;
    .locals 0

    and-int/lit8 p14, p13, 0x1

    if-eqz p14, :cond_0

    iget-object p1, p0, Lcom/whoop/coaching/sleepcoach/wizard/ConductorViewState;->currentAlarm:Lkp0/a;

    :cond_0
    and-int/lit8 p14, p13, 0x2

    if-eqz p14, :cond_1

    iget-object p2, p0, Lcom/whoop/coaching/sleepcoach/wizard/ConductorViewState;->previousAlarm:Lkp0/a;

    :cond_1
    and-int/lit8 p14, p13, 0x4

    if-eqz p14, :cond_2

    iget-boolean p3, p0, Lcom/whoop/coaching/sleepcoach/wizard/ConductorViewState;->currentSelectedAlarm:Z

    :cond_2
    and-int/lit8 p14, p13, 0x8

    if-eqz p14, :cond_3

    iget-boolean p4, p0, Lcom/whoop/coaching/sleepcoach/wizard/ConductorViewState;->isAlarmEnabledPreviously:Z

    :cond_3
    and-int/lit8 p14, p13, 0x10

    if-eqz p14, :cond_4

    iget p5, p0, Lcom/whoop/coaching/sleepcoach/wizard/ConductorViewState;->wakeWindowMinutes:I

    :cond_4
    and-int/lit8 p14, p13, 0x20

    if-eqz p14, :cond_5

    iget-boolean p6, p0, Lcom/whoop/coaching/sleepcoach/wizard/ConductorViewState;->scheduleEnabled:Z

    :cond_5
    and-int/lit8 p14, p13, 0x40

    if-eqz p14, :cond_6

    iget-boolean p7, p0, Lcom/whoop/coaching/sleepcoach/wizard/ConductorViewState;->isSkipStrapCheck:Z

    :cond_6
    and-int/lit16 p14, p13, 0x80

    if-eqz p14, :cond_7

    iget-object p8, p0, Lcom/whoop/coaching/sleepcoach/wizard/ConductorViewState;->weeklyPlan:Lkp0/q;

    :cond_7
    and-int/lit16 p14, p13, 0x100

    if-eqz p14, :cond_8

    iget-object p9, p0, Lcom/whoop/coaching/sleepcoach/wizard/ConductorViewState;->weeklyPlanHoursOfSleep:Lkp0/r;

    :cond_8
    and-int/lit16 p14, p13, 0x200

    if-eqz p14, :cond_9

    iget-boolean p10, p0, Lcom/whoop/coaching/sleepcoach/wizard/ConductorViewState;->disableSchedule:Z

    :cond_9
    and-int/lit16 p14, p13, 0x400

    if-eqz p14, :cond_a

    iget-boolean p11, p0, Lcom/whoop/coaching/sleepcoach/wizard/ConductorViewState;->eligibleForSmartAlarms:Z

    :cond_a
    and-int/lit16 p13, p13, 0x800

    if-eqz p13, :cond_b

    iget-object p12, p0, Lcom/whoop/coaching/sleepcoach/wizard/ConductorViewState;->optimizeSleep:Lkp0/k;

    :cond_b
    move p13, p11

    move-object p14, p12

    move-object p11, p9

    move p12, p10

    move p9, p7

    move-object p10, p8

    move p7, p5

    move p8, p6

    move p5, p3

    move p6, p4

    move-object p3, p1

    move-object p4, p2

    move-object p2, p0

    invoke-virtual/range {p2 .. p14}, Lcom/whoop/coaching/sleepcoach/wizard/ConductorViewState;->copy(Lkp0/a;Lkp0/a;ZZIZZLkp0/q;Lkp0/r;ZZLkp0/k;)Lcom/whoop/coaching/sleepcoach/wizard/ConductorViewState;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Lkp0/a;
    .locals 1

    iget-object v0, p0, Lcom/whoop/coaching/sleepcoach/wizard/ConductorViewState;->currentAlarm:Lkp0/a;

    return-object v0
.end method

.method public final component10()Z
    .locals 1

    iget-boolean v0, p0, Lcom/whoop/coaching/sleepcoach/wizard/ConductorViewState;->disableSchedule:Z

    return v0
.end method

.method public final component11()Z
    .locals 1

    iget-boolean v0, p0, Lcom/whoop/coaching/sleepcoach/wizard/ConductorViewState;->eligibleForSmartAlarms:Z

    return v0
.end method

.method public final component12()Lkp0/k;
    .locals 1

    iget-object v0, p0, Lcom/whoop/coaching/sleepcoach/wizard/ConductorViewState;->optimizeSleep:Lkp0/k;

    return-object v0
.end method

.method public final component2()Lkp0/a;
    .locals 1

    iget-object v0, p0, Lcom/whoop/coaching/sleepcoach/wizard/ConductorViewState;->previousAlarm:Lkp0/a;

    return-object v0
.end method

.method public final component3()Z
    .locals 1

    iget-boolean v0, p0, Lcom/whoop/coaching/sleepcoach/wizard/ConductorViewState;->currentSelectedAlarm:Z

    return v0
.end method

.method public final component4()Z
    .locals 1

    iget-boolean v0, p0, Lcom/whoop/coaching/sleepcoach/wizard/ConductorViewState;->isAlarmEnabledPreviously:Z

    return v0
.end method

.method public final component5()I
    .locals 1

    iget v0, p0, Lcom/whoop/coaching/sleepcoach/wizard/ConductorViewState;->wakeWindowMinutes:I

    return v0
.end method

.method public final component6()Z
    .locals 1

    iget-boolean v0, p0, Lcom/whoop/coaching/sleepcoach/wizard/ConductorViewState;->scheduleEnabled:Z

    return v0
.end method

.method public final component7()Z
    .locals 1

    iget-boolean v0, p0, Lcom/whoop/coaching/sleepcoach/wizard/ConductorViewState;->isSkipStrapCheck:Z

    return v0
.end method

.method public final component8()Lkp0/q;
    .locals 1

    iget-object v0, p0, Lcom/whoop/coaching/sleepcoach/wizard/ConductorViewState;->weeklyPlan:Lkp0/q;

    return-object v0
.end method

.method public final component9()Lkp0/r;
    .locals 1

    iget-object v0, p0, Lcom/whoop/coaching/sleepcoach/wizard/ConductorViewState;->weeklyPlanHoursOfSleep:Lkp0/r;

    return-object v0
.end method

.method public final copy(Lkp0/a;Lkp0/a;ZZIZZLkp0/q;Lkp0/r;ZZLkp0/k;)Lcom/whoop/coaching/sleepcoach/wizard/ConductorViewState;
    .locals 14

    const-string v0, "currentAlarm"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "previousAlarm"

    move-object/from16 v3, p2

    invoke-static {v3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/whoop/coaching/sleepcoach/wizard/ConductorViewState;

    move-object v2, p1

    move/from16 v4, p3

    move/from16 v5, p4

    move/from16 v6, p5

    move/from16 v7, p6

    move/from16 v8, p7

    move-object/from16 v9, p8

    move-object/from16 v10, p9

    move/from16 v11, p10

    move/from16 v12, p11

    move-object/from16 v13, p12

    invoke-direct/range {v1 .. v13}, Lcom/whoop/coaching/sleepcoach/wizard/ConductorViewState;-><init>(Lkp0/a;Lkp0/a;ZZIZZLkp0/q;Lkp0/r;ZZLkp0/k;)V

    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/coaching/sleepcoach/wizard/ConductorViewState;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/coaching/sleepcoach/wizard/ConductorViewState;

    iget-object v1, p0, Lcom/whoop/coaching/sleepcoach/wizard/ConductorViewState;->currentAlarm:Lkp0/a;

    iget-object v3, p1, Lcom/whoop/coaching/sleepcoach/wizard/ConductorViewState;->currentAlarm:Lkp0/a;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/whoop/coaching/sleepcoach/wizard/ConductorViewState;->previousAlarm:Lkp0/a;

    iget-object v3, p1, Lcom/whoop/coaching/sleepcoach/wizard/ConductorViewState;->previousAlarm:Lkp0/a;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-boolean v1, p0, Lcom/whoop/coaching/sleepcoach/wizard/ConductorViewState;->currentSelectedAlarm:Z

    iget-boolean v3, p1, Lcom/whoop/coaching/sleepcoach/wizard/ConductorViewState;->currentSelectedAlarm:Z

    if-eq v1, v3, :cond_4

    return v2

    :cond_4
    iget-boolean v1, p0, Lcom/whoop/coaching/sleepcoach/wizard/ConductorViewState;->isAlarmEnabledPreviously:Z

    iget-boolean v3, p1, Lcom/whoop/coaching/sleepcoach/wizard/ConductorViewState;->isAlarmEnabledPreviously:Z

    if-eq v1, v3, :cond_5

    return v2

    :cond_5
    iget v1, p0, Lcom/whoop/coaching/sleepcoach/wizard/ConductorViewState;->wakeWindowMinutes:I

    iget v3, p1, Lcom/whoop/coaching/sleepcoach/wizard/ConductorViewState;->wakeWindowMinutes:I

    if-eq v1, v3, :cond_6

    return v2

    :cond_6
    iget-boolean v1, p0, Lcom/whoop/coaching/sleepcoach/wizard/ConductorViewState;->scheduleEnabled:Z

    iget-boolean v3, p1, Lcom/whoop/coaching/sleepcoach/wizard/ConductorViewState;->scheduleEnabled:Z

    if-eq v1, v3, :cond_7

    return v2

    :cond_7
    iget-boolean v1, p0, Lcom/whoop/coaching/sleepcoach/wizard/ConductorViewState;->isSkipStrapCheck:Z

    iget-boolean v3, p1, Lcom/whoop/coaching/sleepcoach/wizard/ConductorViewState;->isSkipStrapCheck:Z

    if-eq v1, v3, :cond_8

    return v2

    :cond_8
    iget-object v1, p0, Lcom/whoop/coaching/sleepcoach/wizard/ConductorViewState;->weeklyPlan:Lkp0/q;

    iget-object v3, p1, Lcom/whoop/coaching/sleepcoach/wizard/ConductorViewState;->weeklyPlan:Lkp0/q;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_9

    return v2

    :cond_9
    iget-object v1, p0, Lcom/whoop/coaching/sleepcoach/wizard/ConductorViewState;->weeklyPlanHoursOfSleep:Lkp0/r;

    iget-object v3, p1, Lcom/whoop/coaching/sleepcoach/wizard/ConductorViewState;->weeklyPlanHoursOfSleep:Lkp0/r;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_a

    return v2

    :cond_a
    iget-boolean v1, p0, Lcom/whoop/coaching/sleepcoach/wizard/ConductorViewState;->disableSchedule:Z

    iget-boolean v3, p1, Lcom/whoop/coaching/sleepcoach/wizard/ConductorViewState;->disableSchedule:Z

    if-eq v1, v3, :cond_b

    return v2

    :cond_b
    iget-boolean v1, p0, Lcom/whoop/coaching/sleepcoach/wizard/ConductorViewState;->eligibleForSmartAlarms:Z

    iget-boolean v3, p1, Lcom/whoop/coaching/sleepcoach/wizard/ConductorViewState;->eligibleForSmartAlarms:Z

    if-eq v1, v3, :cond_c

    return v2

    :cond_c
    iget-object v1, p0, Lcom/whoop/coaching/sleepcoach/wizard/ConductorViewState;->optimizeSleep:Lkp0/k;

    iget-object p1, p1, Lcom/whoop/coaching/sleepcoach/wizard/ConductorViewState;->optimizeSleep:Lkp0/k;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_d

    return v2

    :cond_d
    return v0
.end method

.method public final getCurrentAlarm()Lkp0/a;
    .locals 1

    iget-object v0, p0, Lcom/whoop/coaching/sleepcoach/wizard/ConductorViewState;->currentAlarm:Lkp0/a;

    return-object v0
.end method

.method public final getCurrentSelectedAlarm()Z
    .locals 1

    iget-boolean v0, p0, Lcom/whoop/coaching/sleepcoach/wizard/ConductorViewState;->currentSelectedAlarm:Z

    return v0
.end method

.method public final getDisableSchedule()Z
    .locals 1

    iget-boolean v0, p0, Lcom/whoop/coaching/sleepcoach/wizard/ConductorViewState;->disableSchedule:Z

    return v0
.end method

.method public final getEligibleForSmartAlarms()Z
    .locals 1

    iget-boolean v0, p0, Lcom/whoop/coaching/sleepcoach/wizard/ConductorViewState;->eligibleForSmartAlarms:Z

    return v0
.end method

.method public final getOptimizeSleep()Lkp0/k;
    .locals 1

    iget-object v0, p0, Lcom/whoop/coaching/sleepcoach/wizard/ConductorViewState;->optimizeSleep:Lkp0/k;

    return-object v0
.end method

.method public final getPreviousAlarm()Lkp0/a;
    .locals 1

    iget-object v0, p0, Lcom/whoop/coaching/sleepcoach/wizard/ConductorViewState;->previousAlarm:Lkp0/a;

    return-object v0
.end method

.method public final getScheduleEnabled()Z
    .locals 1

    iget-boolean v0, p0, Lcom/whoop/coaching/sleepcoach/wizard/ConductorViewState;->scheduleEnabled:Z

    return v0
.end method

.method public final getWakeWindowMinutes()I
    .locals 1

    iget v0, p0, Lcom/whoop/coaching/sleepcoach/wizard/ConductorViewState;->wakeWindowMinutes:I

    return v0
.end method

.method public final getWeeklyPlan()Lkp0/q;
    .locals 1

    iget-object v0, p0, Lcom/whoop/coaching/sleepcoach/wizard/ConductorViewState;->weeklyPlan:Lkp0/q;

    return-object v0
.end method

.method public final getWeeklyPlanHoursOfSleep()Lkp0/r;
    .locals 1

    iget-object v0, p0, Lcom/whoop/coaching/sleepcoach/wizard/ConductorViewState;->weeklyPlanHoursOfSleep:Lkp0/r;

    return-object v0
.end method

.method public hashCode()I
    .locals 4

    iget-object v0, p0, Lcom/whoop/coaching/sleepcoach/wizard/ConductorViewState;->currentAlarm:Lkp0/a;

    invoke-virtual {v0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/coaching/sleepcoach/wizard/ConductorViewState;->previousAlarm:Lkp0/a;

    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    add-int/2addr v2, v0

    mul-int/2addr v2, v1

    iget-boolean v0, p0, Lcom/whoop/coaching/sleepcoach/wizard/ConductorViewState;->currentSelectedAlarm:Z

    invoke-static {v2, v1, v0}, Lb9/y;->b(IIZ)I

    move-result v0

    iget-boolean v2, p0, Lcom/whoop/coaching/sleepcoach/wizard/ConductorViewState;->isAlarmEnabledPreviously:Z

    invoke-static {v0, v1, v2}, Lb9/y;->b(IIZ)I

    move-result v0

    iget v2, p0, Lcom/whoop/coaching/sleepcoach/wizard/ConductorViewState;->wakeWindowMinutes:I

    invoke-static {v2, v0, v1}, Ld;->b(III)I

    move-result v0

    iget-boolean v2, p0, Lcom/whoop/coaching/sleepcoach/wizard/ConductorViewState;->scheduleEnabled:Z

    invoke-static {v0, v1, v2}, Lb9/y;->b(IIZ)I

    move-result v0

    iget-boolean v2, p0, Lcom/whoop/coaching/sleepcoach/wizard/ConductorViewState;->isSkipStrapCheck:Z

    invoke-static {v0, v1, v2}, Lb9/y;->b(IIZ)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/coaching/sleepcoach/wizard/ConductorViewState;->weeklyPlan:Lkp0/q;

    const/4 v3, 0x0

    if-nez v2, :cond_0

    move v2, v3

    goto :goto_0

    :cond_0
    invoke-virtual {v2}, Lkp0/q;->hashCode()I

    move-result v2

    :goto_0
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/coaching/sleepcoach/wizard/ConductorViewState;->weeklyPlanHoursOfSleep:Lkp0/r;

    if-nez v2, :cond_1

    move v2, v3

    goto :goto_1

    :cond_1
    invoke-virtual {v2}, Lkp0/r;->hashCode()I

    move-result v2

    :goto_1
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-boolean v2, p0, Lcom/whoop/coaching/sleepcoach/wizard/ConductorViewState;->disableSchedule:Z

    invoke-static {v0, v1, v2}, Lb9/y;->b(IIZ)I

    move-result v0

    iget-boolean v2, p0, Lcom/whoop/coaching/sleepcoach/wizard/ConductorViewState;->eligibleForSmartAlarms:Z

    invoke-static {v0, v1, v2}, Lb9/y;->b(IIZ)I

    move-result v0

    iget-object v1, p0, Lcom/whoop/coaching/sleepcoach/wizard/ConductorViewState;->optimizeSleep:Lkp0/k;

    if-nez v1, :cond_2

    goto :goto_2

    :cond_2
    invoke-virtual {v1}, Lkp0/k;->hashCode()I

    move-result v3

    :goto_2
    add-int/2addr v0, v3

    return v0
.end method

.method public final isAlarmEnabledPreviously()Z
    .locals 1

    iget-boolean v0, p0, Lcom/whoop/coaching/sleepcoach/wizard/ConductorViewState;->isAlarmEnabledPreviously:Z

    return v0
.end method

.method public final isSkipStrapCheck()Z
    .locals 1

    iget-boolean v0, p0, Lcom/whoop/coaching/sleepcoach/wizard/ConductorViewState;->isSkipStrapCheck:Z

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 14

    iget-object v0, p0, Lcom/whoop/coaching/sleepcoach/wizard/ConductorViewState;->currentAlarm:Lkp0/a;

    iget-object v1, p0, Lcom/whoop/coaching/sleepcoach/wizard/ConductorViewState;->previousAlarm:Lkp0/a;

    iget-boolean v2, p0, Lcom/whoop/coaching/sleepcoach/wizard/ConductorViewState;->currentSelectedAlarm:Z

    iget-boolean v3, p0, Lcom/whoop/coaching/sleepcoach/wizard/ConductorViewState;->isAlarmEnabledPreviously:Z

    iget v4, p0, Lcom/whoop/coaching/sleepcoach/wizard/ConductorViewState;->wakeWindowMinutes:I

    iget-boolean v5, p0, Lcom/whoop/coaching/sleepcoach/wizard/ConductorViewState;->scheduleEnabled:Z

    iget-boolean v6, p0, Lcom/whoop/coaching/sleepcoach/wizard/ConductorViewState;->isSkipStrapCheck:Z

    iget-object v7, p0, Lcom/whoop/coaching/sleepcoach/wizard/ConductorViewState;->weeklyPlan:Lkp0/q;

    iget-object v8, p0, Lcom/whoop/coaching/sleepcoach/wizard/ConductorViewState;->weeklyPlanHoursOfSleep:Lkp0/r;

    iget-boolean v9, p0, Lcom/whoop/coaching/sleepcoach/wizard/ConductorViewState;->disableSchedule:Z

    iget-boolean v10, p0, Lcom/whoop/coaching/sleepcoach/wizard/ConductorViewState;->eligibleForSmartAlarms:Z

    iget-object v11, p0, Lcom/whoop/coaching/sleepcoach/wizard/ConductorViewState;->optimizeSleep:Lkp0/k;

    new-instance v12, Ljava/lang/StringBuilder;

    const-string v13, "ConductorViewState(currentAlarm="

    invoke-direct {v12, v13}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v12, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", previousAlarm="

    invoke-virtual {v12, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", currentSelectedAlarm="

    invoke-virtual {v12, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ", isAlarmEnabledPreviously="

    const-string v1, ", wakeWindowMinutes="

    invoke-static {v12, v2, v0, v3, v1}, Ly00/t7;->v(Ljava/lang/StringBuilder;ZLjava/lang/String;ZLjava/lang/String;)V

    const-string v0, ", scheduleEnabled="

    const-string v1, ", isSkipStrapCheck="

    invoke-static {v4, v0, v1, v12, v5}, Lev/n;->t(ILjava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;Z)V

    invoke-virtual {v12, v6}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v0, ", weeklyPlan="

    invoke-virtual {v12, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", weeklyPlanHoursOfSleep="

    invoke-virtual {v12, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ", disableSchedule="

    invoke-virtual {v12, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12, v9}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v0, ", eligibleForSmartAlarms="

    invoke-virtual {v12, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12, v10}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v0, ", optimizeSleep="

    invoke-virtual {v12, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v12, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v12}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
