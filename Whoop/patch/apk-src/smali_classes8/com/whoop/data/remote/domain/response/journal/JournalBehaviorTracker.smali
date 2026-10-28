.class public final Lcom/whoop/data/remote/domain/response/journal/JournalBehaviorTracker;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u0006\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u00085\u0008\u0086\u0008\u0018\u00002\u00020\u0001B\u0099\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0008\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\u0008\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0008\u0010\u000b\u001a\u0004\u0018\u00010\u000c\u0012\u0008\u0010\r\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u000e\u001a\u00020\u0005\u0012\u0008\u0010\u000f\u001a\u0004\u0018\u00010\n\u0012\u0006\u0010\u0010\u001a\u00020\u0011\u0012\u0006\u0010\u0012\u001a\u00020\u0011\u0012\u0008\u0010\u0013\u001a\u0004\u0018\u00010\u0005\u0012\u0008\u0010\u0014\u001a\u0004\u0018\u00010\u0015\u0012\u0008\u0010\u0016\u001a\u0004\u0018\u00010\u0017\u0012\u0008\u0010\u0018\u001a\u0004\u0018\u00010\u0019\u00a2\u0006\u0004\u0008\u001a\u0010\u001bJ\t\u00108\u001a\u00020\u0003H\u00c6\u0003J\u000b\u00109\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010:\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\t\u0010;\u001a\u00020\u0005H\u00c6\u0003J\t\u0010<\u001a\u00020\u0005H\u00c6\u0003J\t\u0010=\u001a\u00020\nH\u00c6\u0003J\u000b\u0010>\u001a\u0004\u0018\u00010\u000cH\u00c6\u0003J\u000b\u0010?\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\t\u0010@\u001a\u00020\u0005H\u00c6\u0003J\u0010\u0010A\u001a\u0004\u0018\u00010\nH\u00c6\u0003\u00a2\u0006\u0002\u0010,J\t\u0010B\u001a\u00020\u0011H\u00c6\u0003J\t\u0010C\u001a\u00020\u0011H\u00c6\u0003J\u000b\u0010D\u001a\u0004\u0018\u00010\u0005H\u00c6\u0003J\u000b\u0010E\u001a\u0004\u0018\u00010\u0015H\u00c6\u0003J\u000b\u0010F\u001a\u0004\u0018\u00010\u0017H\u00c6\u0003J\u000b\u0010G\u001a\u0004\u0018\u00010\u0019H\u00c6\u0003J\u00c0\u0001\u0010H\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032\n\u0008\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\u0008\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u0008\u001a\u00020\u00052\u0008\u0008\u0002\u0010\t\u001a\u00020\n2\n\u0008\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u000c2\n\u0008\u0002\u0010\r\u001a\u0004\u0018\u00010\u00052\u0008\u0008\u0002\u0010\u000e\u001a\u00020\u00052\n\u0008\u0002\u0010\u000f\u001a\u0004\u0018\u00010\n2\u0008\u0008\u0002\u0010\u0010\u001a\u00020\u00112\u0008\u0008\u0002\u0010\u0012\u001a\u00020\u00112\n\u0008\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00052\n\u0008\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00152\n\u0008\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00172\n\u0008\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u00c6\u0001\u00a2\u0006\u0002\u0010IJ\u0014\u0010J\u001a\u00020\n2\u0008\u0010K\u001a\u0004\u0018\u00010\u0001H\u00d6\u0083\u0004J\n\u0010L\u001a\u00020\u0003H\u00d6\u0081\u0004J\n\u0010M\u001a\u00020\u0005H\u00d6\u0081\u0004R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\u0008\u001c\u0010\u001d\"\u0004\u0008\u001e\u0010\u001fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008 \u0010!R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\"\u0010!R\u0011\u0010\u0007\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008#\u0010!R\u0011\u0010\u0008\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008$\u0010!R\u0011\u0010\t\u001a\u00020\n\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008%\u0010&R\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u000c\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\'\u0010(R\u0013\u0010\r\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008)\u0010!R\u0011\u0010\u000e\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008*\u0010!R\u0015\u0010\u000f\u001a\u0004\u0018\u00010\n\u00a2\u0006\n\n\u0002\u0010-\u001a\u0004\u0008+\u0010,R\u0011\u0010\u0010\u001a\u00020\u0011\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008.\u0010/R\u0011\u0010\u0012\u001a\u00020\u0011\u00a2\u0006\u0008\n\u0000\u001a\u0004\u00080\u0010/R\u0013\u0010\u0013\u001a\u0004\u0018\u00010\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u00081\u0010!R\u0013\u0010\u0014\u001a\u0004\u0018\u00010\u0015\u00a2\u0006\u0008\n\u0000\u001a\u0004\u00082\u00103R\u0013\u0010\u0016\u001a\u0004\u0018\u00010\u0017\u00a2\u0006\u0008\n\u0000\u001a\u0004\u00084\u00105R\u0013\u0010\u0018\u001a\u0004\u0018\u00010\u0019\u00a2\u0006\u0008\n\u0000\u001a\u0004\u00086\u00107\u00a8\u0006N"
    }
    d2 = {
        "Lcom/whoop/data/remote/domain/response/journal/JournalBehaviorTracker;",
        "",
        "id",
        "",
        "description",
        "",
        "questionText",
        "title",
        "status",
        "sticky",
        "",
        "magnitude",
        "Lcom/whoop/data/remote/domain/response/journal/JournalMagnitude;",
        "timeLabel",
        "category",
        "deprecated",
        "createdAt",
        "",
        "updatedAt",
        "timeContextLabel",
        "questionType",
        "Lcom/whoop/data/remote/domain/dto/QuestionType;",
        "weeklyPlanGoal",
        "Lcom/whoop/data/remote/domain/response/journal/WeeklyPlanGoal;",
        "destination",
        "Lcom/whoop/data/remote/domain/response/journal/BehaviorTrackerDestination;",
        "<init>",
        "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLcom/whoop/data/remote/domain/response/journal/JournalMagnitude;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;DDLjava/lang/String;Lcom/whoop/data/remote/domain/dto/QuestionType;Lcom/whoop/data/remote/domain/response/journal/WeeklyPlanGoal;Lcom/whoop/data/remote/domain/response/journal/BehaviorTrackerDestination;)V",
        "getId",
        "()I",
        "setId",
        "(I)V",
        "getDescription",
        "()Ljava/lang/String;",
        "getQuestionText",
        "getTitle",
        "getStatus",
        "getSticky",
        "()Z",
        "getMagnitude",
        "()Lcom/whoop/data/remote/domain/response/journal/JournalMagnitude;",
        "getTimeLabel",
        "getCategory",
        "getDeprecated",
        "()Ljava/lang/Boolean;",
        "Ljava/lang/Boolean;",
        "getCreatedAt",
        "()D",
        "getUpdatedAt",
        "getTimeContextLabel",
        "getQuestionType",
        "()Lcom/whoop/data/remote/domain/dto/QuestionType;",
        "getWeeklyPlanGoal",
        "()Lcom/whoop/data/remote/domain/response/journal/WeeklyPlanGoal;",
        "getDestination",
        "()Lcom/whoop/data/remote/domain/response/journal/BehaviorTrackerDestination;",
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
        "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLcom/whoop/data/remote/domain/response/journal/JournalMagnitude;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;DDLjava/lang/String;Lcom/whoop/data/remote/domain/dto/QuestionType;Lcom/whoop/data/remote/domain/response/journal/WeeklyPlanGoal;Lcom/whoop/data/remote/domain/response/journal/BehaviorTrackerDestination;)Lcom/whoop/data/remote/domain/response/journal/JournalBehaviorTracker;",
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
.field private final category:Ljava/lang/String;

.field private final createdAt:D

.field private final deprecated:Ljava/lang/Boolean;

.field private final description:Ljava/lang/String;

.field private final destination:Lcom/whoop/data/remote/domain/response/journal/BehaviorTrackerDestination;

.field private id:I

.field private final magnitude:Lcom/whoop/data/remote/domain/response/journal/JournalMagnitude;

.field private final questionText:Ljava/lang/String;

.field private final questionType:Lcom/whoop/data/remote/domain/dto/QuestionType;

.field private final status:Ljava/lang/String;

.field private final sticky:Z

.field private final timeContextLabel:Ljava/lang/String;

.field private final timeLabel:Ljava/lang/String;

.field private final title:Ljava/lang/String;

.field private final updatedAt:D

.field private final weeklyPlanGoal:Lcom/whoop/data/remote/domain/response/journal/WeeklyPlanGoal;


# direct methods
.method public constructor <init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLcom/whoop/data/remote/domain/response/journal/JournalMagnitude;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;DDLjava/lang/String;Lcom/whoop/data/remote/domain/dto/QuestionType;Lcom/whoop/data/remote/domain/response/journal/WeeklyPlanGoal;Lcom/whoop/data/remote/domain/response/journal/BehaviorTrackerDestination;)V
    .locals 1

    const-string v0, "title"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "status"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "category"

    invoke-static {p9, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lcom/whoop/data/remote/domain/response/journal/JournalBehaviorTracker;->id:I

    iput-object p2, p0, Lcom/whoop/data/remote/domain/response/journal/JournalBehaviorTracker;->description:Ljava/lang/String;

    iput-object p3, p0, Lcom/whoop/data/remote/domain/response/journal/JournalBehaviorTracker;->questionText:Ljava/lang/String;

    iput-object p4, p0, Lcom/whoop/data/remote/domain/response/journal/JournalBehaviorTracker;->title:Ljava/lang/String;

    iput-object p5, p0, Lcom/whoop/data/remote/domain/response/journal/JournalBehaviorTracker;->status:Ljava/lang/String;

    iput-boolean p6, p0, Lcom/whoop/data/remote/domain/response/journal/JournalBehaviorTracker;->sticky:Z

    iput-object p7, p0, Lcom/whoop/data/remote/domain/response/journal/JournalBehaviorTracker;->magnitude:Lcom/whoop/data/remote/domain/response/journal/JournalMagnitude;

    iput-object p8, p0, Lcom/whoop/data/remote/domain/response/journal/JournalBehaviorTracker;->timeLabel:Ljava/lang/String;

    iput-object p9, p0, Lcom/whoop/data/remote/domain/response/journal/JournalBehaviorTracker;->category:Ljava/lang/String;

    iput-object p10, p0, Lcom/whoop/data/remote/domain/response/journal/JournalBehaviorTracker;->deprecated:Ljava/lang/Boolean;

    iput-wide p11, p0, Lcom/whoop/data/remote/domain/response/journal/JournalBehaviorTracker;->createdAt:D

    iput-wide p13, p0, Lcom/whoop/data/remote/domain/response/journal/JournalBehaviorTracker;->updatedAt:D

    move-object/from16 p1, p15

    iput-object p1, p0, Lcom/whoop/data/remote/domain/response/journal/JournalBehaviorTracker;->timeContextLabel:Ljava/lang/String;

    move-object/from16 p1, p16

    iput-object p1, p0, Lcom/whoop/data/remote/domain/response/journal/JournalBehaviorTracker;->questionType:Lcom/whoop/data/remote/domain/dto/QuestionType;

    move-object/from16 p1, p17

    iput-object p1, p0, Lcom/whoop/data/remote/domain/response/journal/JournalBehaviorTracker;->weeklyPlanGoal:Lcom/whoop/data/remote/domain/response/journal/WeeklyPlanGoal;

    move-object/from16 p1, p18

    iput-object p1, p0, Lcom/whoop/data/remote/domain/response/journal/JournalBehaviorTracker;->destination:Lcom/whoop/data/remote/domain/response/journal/BehaviorTrackerDestination;

    return-void
.end method

.method public static synthetic copy$default(Lcom/whoop/data/remote/domain/response/journal/JournalBehaviorTracker;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLcom/whoop/data/remote/domain/response/journal/JournalMagnitude;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;DDLjava/lang/String;Lcom/whoop/data/remote/domain/dto/QuestionType;Lcom/whoop/data/remote/domain/response/journal/WeeklyPlanGoal;Lcom/whoop/data/remote/domain/response/journal/BehaviorTrackerDestination;ILjava/lang/Object;)Lcom/whoop/data/remote/domain/response/journal/JournalBehaviorTracker;
    .locals 17

    move-object/from16 v0, p0

    move/from16 v1, p19

    and-int/lit8 v2, v1, 0x1

    if-eqz v2, :cond_0

    iget v2, v0, Lcom/whoop/data/remote/domain/response/journal/JournalBehaviorTracker;->id:I

    goto :goto_0

    :cond_0
    move/from16 v2, p1

    :goto_0
    and-int/lit8 v3, v1, 0x2

    if-eqz v3, :cond_1

    iget-object v3, v0, Lcom/whoop/data/remote/domain/response/journal/JournalBehaviorTracker;->description:Ljava/lang/String;

    goto :goto_1

    :cond_1
    move-object/from16 v3, p2

    :goto_1
    and-int/lit8 v4, v1, 0x4

    if-eqz v4, :cond_2

    iget-object v4, v0, Lcom/whoop/data/remote/domain/response/journal/JournalBehaviorTracker;->questionText:Ljava/lang/String;

    goto :goto_2

    :cond_2
    move-object/from16 v4, p3

    :goto_2
    and-int/lit8 v5, v1, 0x8

    if-eqz v5, :cond_3

    iget-object v5, v0, Lcom/whoop/data/remote/domain/response/journal/JournalBehaviorTracker;->title:Ljava/lang/String;

    goto :goto_3

    :cond_3
    move-object/from16 v5, p4

    :goto_3
    and-int/lit8 v6, v1, 0x10

    if-eqz v6, :cond_4

    iget-object v6, v0, Lcom/whoop/data/remote/domain/response/journal/JournalBehaviorTracker;->status:Ljava/lang/String;

    goto :goto_4

    :cond_4
    move-object/from16 v6, p5

    :goto_4
    and-int/lit8 v7, v1, 0x20

    if-eqz v7, :cond_5

    iget-boolean v7, v0, Lcom/whoop/data/remote/domain/response/journal/JournalBehaviorTracker;->sticky:Z

    goto :goto_5

    :cond_5
    move/from16 v7, p6

    :goto_5
    and-int/lit8 v8, v1, 0x40

    if-eqz v8, :cond_6

    iget-object v8, v0, Lcom/whoop/data/remote/domain/response/journal/JournalBehaviorTracker;->magnitude:Lcom/whoop/data/remote/domain/response/journal/JournalMagnitude;

    goto :goto_6

    :cond_6
    move-object/from16 v8, p7

    :goto_6
    and-int/lit16 v9, v1, 0x80

    if-eqz v9, :cond_7

    iget-object v9, v0, Lcom/whoop/data/remote/domain/response/journal/JournalBehaviorTracker;->timeLabel:Ljava/lang/String;

    goto :goto_7

    :cond_7
    move-object/from16 v9, p8

    :goto_7
    and-int/lit16 v10, v1, 0x100

    if-eqz v10, :cond_8

    iget-object v10, v0, Lcom/whoop/data/remote/domain/response/journal/JournalBehaviorTracker;->category:Ljava/lang/String;

    goto :goto_8

    :cond_8
    move-object/from16 v10, p9

    :goto_8
    and-int/lit16 v11, v1, 0x200

    if-eqz v11, :cond_9

    iget-object v11, v0, Lcom/whoop/data/remote/domain/response/journal/JournalBehaviorTracker;->deprecated:Ljava/lang/Boolean;

    goto :goto_9

    :cond_9
    move-object/from16 v11, p10

    :goto_9
    and-int/lit16 v12, v1, 0x400

    if-eqz v12, :cond_a

    iget-wide v12, v0, Lcom/whoop/data/remote/domain/response/journal/JournalBehaviorTracker;->createdAt:D

    goto :goto_a

    :cond_a
    move-wide/from16 v12, p11

    :goto_a
    and-int/lit16 v14, v1, 0x800

    if-eqz v14, :cond_b

    iget-wide v14, v0, Lcom/whoop/data/remote/domain/response/journal/JournalBehaviorTracker;->updatedAt:D

    goto :goto_b

    :cond_b
    move-wide/from16 v14, p13

    :goto_b
    move/from16 p1, v2

    and-int/lit16 v2, v1, 0x1000

    if-eqz v2, :cond_c

    iget-object v2, v0, Lcom/whoop/data/remote/domain/response/journal/JournalBehaviorTracker;->timeContextLabel:Ljava/lang/String;

    goto :goto_c

    :cond_c
    move-object/from16 v2, p15

    :goto_c
    move-object/from16 p2, v2

    and-int/lit16 v2, v1, 0x2000

    if-eqz v2, :cond_d

    iget-object v2, v0, Lcom/whoop/data/remote/domain/response/journal/JournalBehaviorTracker;->questionType:Lcom/whoop/data/remote/domain/dto/QuestionType;

    goto :goto_d

    :cond_d
    move-object/from16 v2, p16

    :goto_d
    move-object/from16 p3, v2

    and-int/lit16 v2, v1, 0x4000

    if-eqz v2, :cond_e

    iget-object v2, v0, Lcom/whoop/data/remote/domain/response/journal/JournalBehaviorTracker;->weeklyPlanGoal:Lcom/whoop/data/remote/domain/response/journal/WeeklyPlanGoal;

    goto :goto_e

    :cond_e
    move-object/from16 v2, p17

    :goto_e
    const v16, 0x8000

    and-int v1, v1, v16

    if-eqz v1, :cond_f

    iget-object v1, v0, Lcom/whoop/data/remote/domain/response/journal/JournalBehaviorTracker;->destination:Lcom/whoop/data/remote/domain/response/journal/BehaviorTrackerDestination;

    move-object/from16 p19, v1

    :goto_f
    move-object/from16 p16, p2

    move-object/from16 p17, p3

    move-object/from16 p18, v2

    move-object/from16 p3, v3

    move-object/from16 p4, v4

    move-object/from16 p5, v5

    move-object/from16 p6, v6

    move/from16 p7, v7

    move-object/from16 p8, v8

    move-object/from16 p9, v9

    move-object/from16 p10, v10

    move-object/from16 p11, v11

    move-wide/from16 p12, v12

    move-wide/from16 p14, v14

    move/from16 p2, p1

    move-object/from16 p1, v0

    goto :goto_10

    :cond_f
    move-object/from16 p19, p18

    goto :goto_f

    :goto_10
    invoke-virtual/range {p1 .. p19}, Lcom/whoop/data/remote/domain/response/journal/JournalBehaviorTracker;->copy(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLcom/whoop/data/remote/domain/response/journal/JournalMagnitude;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;DDLjava/lang/String;Lcom/whoop/data/remote/domain/dto/QuestionType;Lcom/whoop/data/remote/domain/response/journal/WeeklyPlanGoal;Lcom/whoop/data/remote/domain/response/journal/BehaviorTrackerDestination;)Lcom/whoop/data/remote/domain/response/journal/JournalBehaviorTracker;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public final component1()I
    .locals 1

    iget v0, p0, Lcom/whoop/data/remote/domain/response/journal/JournalBehaviorTracker;->id:I

    return v0
.end method

.method public final component10()Ljava/lang/Boolean;
    .locals 1

    iget-object v0, p0, Lcom/whoop/data/remote/domain/response/journal/JournalBehaviorTracker;->deprecated:Ljava/lang/Boolean;

    return-object v0
.end method

.method public final component11()D
    .locals 2

    iget-wide v0, p0, Lcom/whoop/data/remote/domain/response/journal/JournalBehaviorTracker;->createdAt:D

    return-wide v0
.end method

.method public final component12()D
    .locals 2

    iget-wide v0, p0, Lcom/whoop/data/remote/domain/response/journal/JournalBehaviorTracker;->updatedAt:D

    return-wide v0
.end method

.method public final component13()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/data/remote/domain/response/journal/JournalBehaviorTracker;->timeContextLabel:Ljava/lang/String;

    return-object v0
.end method

.method public final component14()Lcom/whoop/data/remote/domain/dto/QuestionType;
    .locals 1

    iget-object v0, p0, Lcom/whoop/data/remote/domain/response/journal/JournalBehaviorTracker;->questionType:Lcom/whoop/data/remote/domain/dto/QuestionType;

    return-object v0
.end method

.method public final component15()Lcom/whoop/data/remote/domain/response/journal/WeeklyPlanGoal;
    .locals 1

    iget-object v0, p0, Lcom/whoop/data/remote/domain/response/journal/JournalBehaviorTracker;->weeklyPlanGoal:Lcom/whoop/data/remote/domain/response/journal/WeeklyPlanGoal;

    return-object v0
.end method

.method public final component16()Lcom/whoop/data/remote/domain/response/journal/BehaviorTrackerDestination;
    .locals 1

    iget-object v0, p0, Lcom/whoop/data/remote/domain/response/journal/JournalBehaviorTracker;->destination:Lcom/whoop/data/remote/domain/response/journal/BehaviorTrackerDestination;

    return-object v0
.end method

.method public final component2()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/data/remote/domain/response/journal/JournalBehaviorTracker;->description:Ljava/lang/String;

    return-object v0
.end method

.method public final component3()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/data/remote/domain/response/journal/JournalBehaviorTracker;->questionText:Ljava/lang/String;

    return-object v0
.end method

.method public final component4()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/data/remote/domain/response/journal/JournalBehaviorTracker;->title:Ljava/lang/String;

    return-object v0
.end method

.method public final component5()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/data/remote/domain/response/journal/JournalBehaviorTracker;->status:Ljava/lang/String;

    return-object v0
.end method

.method public final component6()Z
    .locals 1

    iget-boolean v0, p0, Lcom/whoop/data/remote/domain/response/journal/JournalBehaviorTracker;->sticky:Z

    return v0
.end method

.method public final component7()Lcom/whoop/data/remote/domain/response/journal/JournalMagnitude;
    .locals 1

    iget-object v0, p0, Lcom/whoop/data/remote/domain/response/journal/JournalBehaviorTracker;->magnitude:Lcom/whoop/data/remote/domain/response/journal/JournalMagnitude;

    return-object v0
.end method

.method public final component8()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/data/remote/domain/response/journal/JournalBehaviorTracker;->timeLabel:Ljava/lang/String;

    return-object v0
.end method

.method public final component9()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/data/remote/domain/response/journal/JournalBehaviorTracker;->category:Ljava/lang/String;

    return-object v0
.end method

.method public final copy(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLcom/whoop/data/remote/domain/response/journal/JournalMagnitude;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;DDLjava/lang/String;Lcom/whoop/data/remote/domain/dto/QuestionType;Lcom/whoop/data/remote/domain/response/journal/WeeklyPlanGoal;Lcom/whoop/data/remote/domain/response/journal/BehaviorTrackerDestination;)Lcom/whoop/data/remote/domain/response/journal/JournalBehaviorTracker;
    .locals 20

    const-string v0, "title"

    move-object/from16 v5, p4

    invoke-static {v5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "status"

    move-object/from16 v6, p5

    invoke-static {v6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "category"

    move-object/from16 v10, p9

    invoke-static {v10, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/whoop/data/remote/domain/response/journal/JournalBehaviorTracker;

    move/from16 v2, p1

    move-object/from16 v3, p2

    move-object/from16 v4, p3

    move/from16 v7, p6

    move-object/from16 v8, p7

    move-object/from16 v9, p8

    move-object/from16 v11, p10

    move-wide/from16 v12, p11

    move-wide/from16 v14, p13

    move-object/from16 v16, p15

    move-object/from16 v17, p16

    move-object/from16 v18, p17

    move-object/from16 v19, p18

    invoke-direct/range {v1 .. v19}, Lcom/whoop/data/remote/domain/response/journal/JournalBehaviorTracker;-><init>(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLcom/whoop/data/remote/domain/response/journal/JournalMagnitude;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;DDLjava/lang/String;Lcom/whoop/data/remote/domain/dto/QuestionType;Lcom/whoop/data/remote/domain/response/journal/WeeklyPlanGoal;Lcom/whoop/data/remote/domain/response/journal/BehaviorTrackerDestination;)V

    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 7

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/data/remote/domain/response/journal/JournalBehaviorTracker;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/data/remote/domain/response/journal/JournalBehaviorTracker;

    iget v1, p0, Lcom/whoop/data/remote/domain/response/journal/JournalBehaviorTracker;->id:I

    iget v3, p1, Lcom/whoop/data/remote/domain/response/journal/JournalBehaviorTracker;->id:I

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/whoop/data/remote/domain/response/journal/JournalBehaviorTracker;->description:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/data/remote/domain/response/journal/JournalBehaviorTracker;->description:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/whoop/data/remote/domain/response/journal/JournalBehaviorTracker;->questionText:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/data/remote/domain/response/journal/JournalBehaviorTracker;->questionText:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/whoop/data/remote/domain/response/journal/JournalBehaviorTracker;->title:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/data/remote/domain/response/journal/JournalBehaviorTracker;->title:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lcom/whoop/data/remote/domain/response/journal/JournalBehaviorTracker;->status:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/data/remote/domain/response/journal/JournalBehaviorTracker;->status:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_6

    return v2

    :cond_6
    iget-boolean v1, p0, Lcom/whoop/data/remote/domain/response/journal/JournalBehaviorTracker;->sticky:Z

    iget-boolean v3, p1, Lcom/whoop/data/remote/domain/response/journal/JournalBehaviorTracker;->sticky:Z

    if-eq v1, v3, :cond_7

    return v2

    :cond_7
    iget-object v1, p0, Lcom/whoop/data/remote/domain/response/journal/JournalBehaviorTracker;->magnitude:Lcom/whoop/data/remote/domain/response/journal/JournalMagnitude;

    iget-object v3, p1, Lcom/whoop/data/remote/domain/response/journal/JournalBehaviorTracker;->magnitude:Lcom/whoop/data/remote/domain/response/journal/JournalMagnitude;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_8

    return v2

    :cond_8
    iget-object v1, p0, Lcom/whoop/data/remote/domain/response/journal/JournalBehaviorTracker;->timeLabel:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/data/remote/domain/response/journal/JournalBehaviorTracker;->timeLabel:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_9

    return v2

    :cond_9
    iget-object v1, p0, Lcom/whoop/data/remote/domain/response/journal/JournalBehaviorTracker;->category:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/data/remote/domain/response/journal/JournalBehaviorTracker;->category:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_a

    return v2

    :cond_a
    iget-object v1, p0, Lcom/whoop/data/remote/domain/response/journal/JournalBehaviorTracker;->deprecated:Ljava/lang/Boolean;

    iget-object v3, p1, Lcom/whoop/data/remote/domain/response/journal/JournalBehaviorTracker;->deprecated:Ljava/lang/Boolean;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_b

    return v2

    :cond_b
    iget-wide v3, p0, Lcom/whoop/data/remote/domain/response/journal/JournalBehaviorTracker;->createdAt:D

    iget-wide v5, p1, Lcom/whoop/data/remote/domain/response/journal/JournalBehaviorTracker;->createdAt:D

    invoke-static {v3, v4, v5, v6}, Ljava/lang/Double;->compare(DD)I

    move-result v1

    if-eqz v1, :cond_c

    return v2

    :cond_c
    iget-wide v3, p0, Lcom/whoop/data/remote/domain/response/journal/JournalBehaviorTracker;->updatedAt:D

    iget-wide v5, p1, Lcom/whoop/data/remote/domain/response/journal/JournalBehaviorTracker;->updatedAt:D

    invoke-static {v3, v4, v5, v6}, Ljava/lang/Double;->compare(DD)I

    move-result v1

    if-eqz v1, :cond_d

    return v2

    :cond_d
    iget-object v1, p0, Lcom/whoop/data/remote/domain/response/journal/JournalBehaviorTracker;->timeContextLabel:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/data/remote/domain/response/journal/JournalBehaviorTracker;->timeContextLabel:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_e

    return v2

    :cond_e
    iget-object v1, p0, Lcom/whoop/data/remote/domain/response/journal/JournalBehaviorTracker;->questionType:Lcom/whoop/data/remote/domain/dto/QuestionType;

    iget-object v3, p1, Lcom/whoop/data/remote/domain/response/journal/JournalBehaviorTracker;->questionType:Lcom/whoop/data/remote/domain/dto/QuestionType;

    if-eq v1, v3, :cond_f

    return v2

    :cond_f
    iget-object v1, p0, Lcom/whoop/data/remote/domain/response/journal/JournalBehaviorTracker;->weeklyPlanGoal:Lcom/whoop/data/remote/domain/response/journal/WeeklyPlanGoal;

    iget-object v3, p1, Lcom/whoop/data/remote/domain/response/journal/JournalBehaviorTracker;->weeklyPlanGoal:Lcom/whoop/data/remote/domain/response/journal/WeeklyPlanGoal;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_10

    return v2

    :cond_10
    iget-object v1, p0, Lcom/whoop/data/remote/domain/response/journal/JournalBehaviorTracker;->destination:Lcom/whoop/data/remote/domain/response/journal/BehaviorTrackerDestination;

    iget-object p1, p1, Lcom/whoop/data/remote/domain/response/journal/JournalBehaviorTracker;->destination:Lcom/whoop/data/remote/domain/response/journal/BehaviorTrackerDestination;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_11

    return v2

    :cond_11
    return v0
.end method

.method public final getCategory()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/data/remote/domain/response/journal/JournalBehaviorTracker;->category:Ljava/lang/String;

    return-object v0
.end method

.method public final getCreatedAt()D
    .locals 2

    iget-wide v0, p0, Lcom/whoop/data/remote/domain/response/journal/JournalBehaviorTracker;->createdAt:D

    return-wide v0
.end method

.method public final getDeprecated()Ljava/lang/Boolean;
    .locals 1

    iget-object v0, p0, Lcom/whoop/data/remote/domain/response/journal/JournalBehaviorTracker;->deprecated:Ljava/lang/Boolean;

    return-object v0
.end method

.method public final getDescription()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/data/remote/domain/response/journal/JournalBehaviorTracker;->description:Ljava/lang/String;

    return-object v0
.end method

.method public final getDestination()Lcom/whoop/data/remote/domain/response/journal/BehaviorTrackerDestination;
    .locals 1

    iget-object v0, p0, Lcom/whoop/data/remote/domain/response/journal/JournalBehaviorTracker;->destination:Lcom/whoop/data/remote/domain/response/journal/BehaviorTrackerDestination;

    return-object v0
.end method

.method public final getId()I
    .locals 1

    iget v0, p0, Lcom/whoop/data/remote/domain/response/journal/JournalBehaviorTracker;->id:I

    return v0
.end method

.method public final getMagnitude()Lcom/whoop/data/remote/domain/response/journal/JournalMagnitude;
    .locals 1

    iget-object v0, p0, Lcom/whoop/data/remote/domain/response/journal/JournalBehaviorTracker;->magnitude:Lcom/whoop/data/remote/domain/response/journal/JournalMagnitude;

    return-object v0
.end method

.method public final getQuestionText()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/data/remote/domain/response/journal/JournalBehaviorTracker;->questionText:Ljava/lang/String;

    return-object v0
.end method

.method public final getQuestionType()Lcom/whoop/data/remote/domain/dto/QuestionType;
    .locals 1

    iget-object v0, p0, Lcom/whoop/data/remote/domain/response/journal/JournalBehaviorTracker;->questionType:Lcom/whoop/data/remote/domain/dto/QuestionType;

    return-object v0
.end method

.method public final getStatus()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/data/remote/domain/response/journal/JournalBehaviorTracker;->status:Ljava/lang/String;

    return-object v0
.end method

.method public final getSticky()Z
    .locals 1

    iget-boolean v0, p0, Lcom/whoop/data/remote/domain/response/journal/JournalBehaviorTracker;->sticky:Z

    return v0
.end method

.method public final getTimeContextLabel()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/data/remote/domain/response/journal/JournalBehaviorTracker;->timeContextLabel:Ljava/lang/String;

    return-object v0
.end method

.method public final getTimeLabel()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/data/remote/domain/response/journal/JournalBehaviorTracker;->timeLabel:Ljava/lang/String;

    return-object v0
.end method

.method public final getTitle()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/data/remote/domain/response/journal/JournalBehaviorTracker;->title:Ljava/lang/String;

    return-object v0
.end method

.method public final getUpdatedAt()D
    .locals 2

    iget-wide v0, p0, Lcom/whoop/data/remote/domain/response/journal/JournalBehaviorTracker;->updatedAt:D

    return-wide v0
.end method

.method public final getWeeklyPlanGoal()Lcom/whoop/data/remote/domain/response/journal/WeeklyPlanGoal;
    .locals 1

    iget-object v0, p0, Lcom/whoop/data/remote/domain/response/journal/JournalBehaviorTracker;->weeklyPlanGoal:Lcom/whoop/data/remote/domain/response/journal/WeeklyPlanGoal;

    return-object v0
.end method

.method public hashCode()I
    .locals 6

    iget v0, p0, Lcom/whoop/data/remote/domain/response/journal/JournalBehaviorTracker;->id:I

    invoke-static {v0}, Ljava/lang/Integer;->hashCode(I)I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/data/remote/domain/response/journal/JournalBehaviorTracker;->description:Ljava/lang/String;

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

    iget-object v2, p0, Lcom/whoop/data/remote/domain/response/journal/JournalBehaviorTracker;->questionText:Ljava/lang/String;

    if-nez v2, :cond_1

    move v2, v3

    goto :goto_1

    :cond_1
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_1
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/data/remote/domain/response/journal/JournalBehaviorTracker;->title:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/data/remote/domain/response/journal/JournalBehaviorTracker;->status:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-boolean v2, p0, Lcom/whoop/data/remote/domain/response/journal/JournalBehaviorTracker;->sticky:Z

    invoke-static {v0, v1, v2}, Lb9/y;->b(IIZ)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/data/remote/domain/response/journal/JournalBehaviorTracker;->magnitude:Lcom/whoop/data/remote/domain/response/journal/JournalMagnitude;

    if-nez v2, :cond_2

    move v2, v3

    goto :goto_2

    :cond_2
    invoke-virtual {v2}, Lcom/whoop/data/remote/domain/response/journal/JournalMagnitude;->hashCode()I

    move-result v2

    :goto_2
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/data/remote/domain/response/journal/JournalBehaviorTracker;->timeLabel:Ljava/lang/String;

    if-nez v2, :cond_3

    move v2, v3

    goto :goto_3

    :cond_3
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_3
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/data/remote/domain/response/journal/JournalBehaviorTracker;->category:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/data/remote/domain/response/journal/JournalBehaviorTracker;->deprecated:Ljava/lang/Boolean;

    if-nez v2, :cond_4

    move v2, v3

    goto :goto_4

    :cond_4
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_4
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-wide v4, p0, Lcom/whoop/data/remote/domain/response/journal/JournalBehaviorTracker;->createdAt:D

    invoke-static {v0, v1, v4, v5}, Lhc3/i;->a(IID)I

    move-result v0

    iget-wide v4, p0, Lcom/whoop/data/remote/domain/response/journal/JournalBehaviorTracker;->updatedAt:D

    invoke-static {v0, v1, v4, v5}, Lhc3/i;->a(IID)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/data/remote/domain/response/journal/JournalBehaviorTracker;->timeContextLabel:Ljava/lang/String;

    if-nez v2, :cond_5

    move v2, v3

    goto :goto_5

    :cond_5
    invoke-virtual {v2}, Ljava/lang/String;->hashCode()I

    move-result v2

    :goto_5
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/data/remote/domain/response/journal/JournalBehaviorTracker;->questionType:Lcom/whoop/data/remote/domain/dto/QuestionType;

    if-nez v2, :cond_6

    move v2, v3

    goto :goto_6

    :cond_6
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_6
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/data/remote/domain/response/journal/JournalBehaviorTracker;->weeklyPlanGoal:Lcom/whoop/data/remote/domain/response/journal/WeeklyPlanGoal;

    if-nez v2, :cond_7

    move v2, v3

    goto :goto_7

    :cond_7
    invoke-virtual {v2}, Lcom/whoop/data/remote/domain/response/journal/WeeklyPlanGoal;->hashCode()I

    move-result v2

    :goto_7
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v1, p0, Lcom/whoop/data/remote/domain/response/journal/JournalBehaviorTracker;->destination:Lcom/whoop/data/remote/domain/response/journal/BehaviorTrackerDestination;

    if-nez v1, :cond_8

    goto :goto_8

    :cond_8
    invoke-virtual {v1}, Lcom/whoop/data/remote/domain/response/journal/BehaviorTrackerDestination;->hashCode()I

    move-result v3

    :goto_8
    add-int/2addr v0, v3

    return v0
.end method

.method public final setId(I)V
    .locals 0

    iput p1, p0, Lcom/whoop/data/remote/domain/response/journal/JournalBehaviorTracker;->id:I

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 22

    move-object/from16 v0, p0

    iget v1, v0, Lcom/whoop/data/remote/domain/response/journal/JournalBehaviorTracker;->id:I

    iget-object v2, v0, Lcom/whoop/data/remote/domain/response/journal/JournalBehaviorTracker;->description:Ljava/lang/String;

    iget-object v3, v0, Lcom/whoop/data/remote/domain/response/journal/JournalBehaviorTracker;->questionText:Ljava/lang/String;

    iget-object v4, v0, Lcom/whoop/data/remote/domain/response/journal/JournalBehaviorTracker;->title:Ljava/lang/String;

    iget-object v5, v0, Lcom/whoop/data/remote/domain/response/journal/JournalBehaviorTracker;->status:Ljava/lang/String;

    iget-boolean v6, v0, Lcom/whoop/data/remote/domain/response/journal/JournalBehaviorTracker;->sticky:Z

    iget-object v7, v0, Lcom/whoop/data/remote/domain/response/journal/JournalBehaviorTracker;->magnitude:Lcom/whoop/data/remote/domain/response/journal/JournalMagnitude;

    iget-object v8, v0, Lcom/whoop/data/remote/domain/response/journal/JournalBehaviorTracker;->timeLabel:Ljava/lang/String;

    iget-object v9, v0, Lcom/whoop/data/remote/domain/response/journal/JournalBehaviorTracker;->category:Ljava/lang/String;

    iget-object v10, v0, Lcom/whoop/data/remote/domain/response/journal/JournalBehaviorTracker;->deprecated:Ljava/lang/Boolean;

    iget-wide v11, v0, Lcom/whoop/data/remote/domain/response/journal/JournalBehaviorTracker;->createdAt:D

    iget-wide v13, v0, Lcom/whoop/data/remote/domain/response/journal/JournalBehaviorTracker;->updatedAt:D

    iget-object v15, v0, Lcom/whoop/data/remote/domain/response/journal/JournalBehaviorTracker;->timeContextLabel:Ljava/lang/String;

    move-object/from16 v16, v15

    iget-object v15, v0, Lcom/whoop/data/remote/domain/response/journal/JournalBehaviorTracker;->questionType:Lcom/whoop/data/remote/domain/dto/QuestionType;

    move-object/from16 v17, v15

    iget-object v15, v0, Lcom/whoop/data/remote/domain/response/journal/JournalBehaviorTracker;->weeklyPlanGoal:Lcom/whoop/data/remote/domain/response/journal/WeeklyPlanGoal;

    move-object/from16 v18, v15

    iget-object v15, v0, Lcom/whoop/data/remote/domain/response/journal/JournalBehaviorTracker;->destination:Lcom/whoop/data/remote/domain/response/journal/BehaviorTrackerDestination;

    const-string v0, ", description="

    move-object/from16 v19, v15

    const-string v15, ", questionText="

    move-wide/from16 v20, v13

    const-string v13, "JournalBehaviorTracker(id="

    invoke-static {v1, v13, v0, v2, v15}, Lih0/d0;->n(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    const-string v1, ", title="

    const-string v2, ", status="

    invoke-static {v0, v3, v1, v4, v2}, Ld;->B(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    const-string v1, ", sticky="

    const-string v2, ", magnitude="

    invoke-static {v0, v5, v1, v6, v2}, Ly00/t7;->t(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;)V

    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", timeLabel="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", category="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", deprecated="

    const-string v2, ", createdAt="

    invoke-static {v10, v9, v1, v2, v0}, Lvl/b;->t(Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;)V

    invoke-virtual {v0, v11, v12}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    const-string v1, ", updatedAt="

    const-string v2, ", timeContextLabel="

    move-wide/from16 v3, v20

    invoke-static {v0, v1, v3, v4, v2}, Lr80/c;->B(Ljava/lang/StringBuilder;Ljava/lang/String;DLjava/lang/String;)V

    move-object/from16 v1, v16

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", questionType="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v17

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", weeklyPlanGoal="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v18

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", destination="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v19

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
