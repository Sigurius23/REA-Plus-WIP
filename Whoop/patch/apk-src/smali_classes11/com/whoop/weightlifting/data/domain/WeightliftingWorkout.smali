.class public final Lcom/whoop/weightlifting/data/domain/WeightliftingWorkout;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0006\n\u0002\u0008\u0004\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008,\u0008\u0087\u0008\u0018\u00002\u00020\u0001Bw\u0012\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\u0008\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\u000c\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\n\u0012\u0008\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\n\u0008\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u0012\u000c\u0010\u0012\u001a\u0008\u0012\u0004\u0012\u00020\u00140\u0013\u0012\u0008\u0008\u0002\u0010\u0015\u001a\u00020\u0016\u00a2\u0006\u0004\u0008\u0017\u0010\u0018J\t\u00100\u001a\u00020\u0003H\u00c6\u0003J\t\u00101\u001a\u00020\u0005H\u00c6\u0003J\t\u00102\u001a\u00020\u0007H\u00c6\u0003J\t\u00103\u001a\u00020\u0003H\u00c6\u0003J\t\u00104\u001a\u00020\nH\u00c6\u0003J\t\u00105\u001a\u00020\nH\u00c6\u0003J\t\u00106\u001a\u00020\nH\u00c6\u0003J\t\u00107\u001a\u00020\nH\u00c6\u0003J\u0010\u00108\u001a\u0004\u0018\u00010\u000fH\u00c6\u0003\u00a2\u0006\u0002\u0010&J\u0010\u00109\u001a\u0004\u0018\u00010\u0011H\u00c6\u0003\u00a2\u0006\u0002\u0010)J\u000f\u0010:\u001a\u0008\u0012\u0004\u0012\u00020\u00140\u0013H\u00c6\u0003J\t\u0010;\u001a\u00020\u0016H\u00c6\u0003J\u0090\u0001\u0010<\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u00072\u0008\u0008\u0002\u0010\u0008\u001a\u00020\u00032\u0008\u0008\u0002\u0010\t\u001a\u00020\n2\u0008\u0008\u0002\u0010\u000b\u001a\u00020\n2\u0008\u0008\u0002\u0010\u000c\u001a\u00020\n2\u0008\u0008\u0002\u0010\r\u001a\u00020\n2\n\u0008\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\n\u0008\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00112\u000e\u0008\u0002\u0010\u0012\u001a\u0008\u0012\u0004\u0012\u00020\u00140\u00132\u0008\u0008\u0002\u0010\u0015\u001a\u00020\u0016H\u00c6\u0001\u00a2\u0006\u0002\u0010=J\u0014\u0010>\u001a\u00020\u00162\u0008\u0010?\u001a\u0004\u0018\u00010\u0001H\u00d6\u0083\u0004J\n\u0010@\u001a\u00020\u0011H\u00d6\u0081\u0004J\n\u0010A\u001a\u00020\u0003H\u00d6\u0081\u0004R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0019\u0010\u001aR\u0011\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001b\u0010\u001cR\u0011\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001d\u0010\u001eR\u0011\u0010\u0008\u001a\u00020\u0003\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001f\u0010\u001aR\u0011\u0010\t\u001a\u00020\n\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008 \u0010!R\u0011\u0010\u000b\u001a\u00020\n\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\"\u0010!R\u0011\u0010\u000c\u001a\u00020\n\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008#\u0010!R\u0011\u0010\r\u001a\u00020\n\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008$\u0010!R\u0015\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u00a2\u0006\n\n\u0002\u0010\'\u001a\u0004\u0008%\u0010&R\u0015\u0010\u0010\u001a\u0004\u0018\u00010\u0011\u00a2\u0006\n\n\u0002\u0010*\u001a\u0004\u0008(\u0010)R\u0017\u0010\u0012\u001a\u0008\u0012\u0004\u0012\u00020\u00140\u0013\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008+\u0010,R\u0011\u0010\u0015\u001a\u00020\u0016\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0015\u0010-R\u0014\u0010.\u001a\u00020\u0003X\u0086D\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008/\u0010\u001a\u00a8\u0006B"
    }
    d2 = {
        "Lcom/whoop/weightlifting/data/domain/WeightliftingWorkout;",
        "",
        "source",
        "",
        "dateTimeRange",
        "Lcom/whoop/data/remote/domain/dto/DateTimeRange;",
        "timezone",
        "Lorg/joda/time/DateTimeZone;",
        "name",
        "mskTotalVolumeKg",
        "",
        "rawMskStrainScore",
        "mskIntensityPercent",
        "scaledMskStrainScore",
        "workoutTemplateId",
        "",
        "rpe",
        "",
        "workoutGroups",
        "",
        "Lcom/whoop/weightlifting/data/domain/WeightliftingWorkoutGroup;",
        "isSimpleStrengthLogging",
        "",
        "<init>",
        "(Ljava/lang/String;Lcom/whoop/data/remote/domain/dto/DateTimeRange;Lorg/joda/time/DateTimeZone;Ljava/lang/String;DDDDLjava/lang/Long;Ljava/lang/Integer;Ljava/util/List;Z)V",
        "getSource",
        "()Ljava/lang/String;",
        "getDateTimeRange",
        "()Lcom/whoop/data/remote/domain/dto/DateTimeRange;",
        "getTimezone",
        "()Lorg/joda/time/DateTimeZone;",
        "getName",
        "getMskTotalVolumeKg",
        "()D",
        "getRawMskStrainScore",
        "getMskIntensityPercent",
        "getScaledMskStrainScore",
        "getWorkoutTemplateId",
        "()Ljava/lang/Long;",
        "Ljava/lang/Long;",
        "getRpe",
        "()Ljava/lang/Integer;",
        "Ljava/lang/Integer;",
        "getWorkoutGroups",
        "()Ljava/util/List;",
        "()Z",
        "type",
        "getType",
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
        "copy",
        "(Ljava/lang/String;Lcom/whoop/data/remote/domain/dto/DateTimeRange;Lorg/joda/time/DateTimeZone;Ljava/lang/String;DDDDLjava/lang/Long;Ljava/lang/Integer;Ljava/util/List;Z)Lcom/whoop/weightlifting/data/domain/WeightliftingWorkout;",
        "equals",
        "other",
        "hashCode",
        "toString",
        "weightlifting_release"
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
.field public static final $stable:I = 0x8


# instance fields
.field private final dateTimeRange:Lcom/whoop/data/remote/domain/dto/DateTimeRange;

.field private final isSimpleStrengthLogging:Z

.field private final mskIntensityPercent:D

.field private final mskTotalVolumeKg:D

.field private final name:Ljava/lang/String;

.field private final rawMskStrainScore:D

.field private final rpe:Ljava/lang/Integer;

.field private final scaledMskStrainScore:D

.field private final source:Ljava/lang/String;

.field private final timezone:Lorg/joda/time/DateTimeZone;

.field private final type:Ljava/lang/String;

.field private final workoutGroups:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/whoop/weightlifting/data/domain/WeightliftingWorkoutGroup;",
            ">;"
        }
    .end annotation
.end field

.field private final workoutTemplateId:Ljava/lang/Long;


# direct methods
.method public constructor <init>(Ljava/lang/String;Lcom/whoop/data/remote/domain/dto/DateTimeRange;Lorg/joda/time/DateTimeZone;Ljava/lang/String;DDDDLjava/lang/Long;Ljava/lang/Integer;Ljava/util/List;Z)V
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lcom/whoop/data/remote/domain/dto/DateTimeRange;",
            "Lorg/joda/time/DateTimeZone;",
            "Ljava/lang/String;",
            "DDDD",
            "Ljava/lang/Long;",
            "Ljava/lang/Integer;",
            "Ljava/util/List<",
            "Lcom/whoop/weightlifting/data/domain/WeightliftingWorkoutGroup;",
            ">;Z)V"
        }
    .end annotation

    move-object/from16 v0, p15

    const-string v1, "source"

    invoke-static {p1, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "dateTimeRange"

    invoke-static {p2, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "timezone"

    invoke-static {p3, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "name"

    invoke-static {p4, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "workoutGroups"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 2
    iput-object p1, p0, Lcom/whoop/weightlifting/data/domain/WeightliftingWorkout;->source:Ljava/lang/String;

    .line 3
    iput-object p2, p0, Lcom/whoop/weightlifting/data/domain/WeightliftingWorkout;->dateTimeRange:Lcom/whoop/data/remote/domain/dto/DateTimeRange;

    .line 4
    iput-object p3, p0, Lcom/whoop/weightlifting/data/domain/WeightliftingWorkout;->timezone:Lorg/joda/time/DateTimeZone;

    .line 5
    iput-object p4, p0, Lcom/whoop/weightlifting/data/domain/WeightliftingWorkout;->name:Ljava/lang/String;

    .line 6
    iput-wide p5, p0, Lcom/whoop/weightlifting/data/domain/WeightliftingWorkout;->mskTotalVolumeKg:D

    .line 7
    iput-wide p7, p0, Lcom/whoop/weightlifting/data/domain/WeightliftingWorkout;->rawMskStrainScore:D

    .line 8
    iput-wide p9, p0, Lcom/whoop/weightlifting/data/domain/WeightliftingWorkout;->mskIntensityPercent:D

    .line 9
    iput-wide p11, p0, Lcom/whoop/weightlifting/data/domain/WeightliftingWorkout;->scaledMskStrainScore:D

    .line 10
    iput-object p13, p0, Lcom/whoop/weightlifting/data/domain/WeightliftingWorkout;->workoutTemplateId:Ljava/lang/Long;

    move-object/from16 p1, p14

    .line 11
    iput-object p1, p0, Lcom/whoop/weightlifting/data/domain/WeightliftingWorkout;->rpe:Ljava/lang/Integer;

    .line 12
    iput-object v0, p0, Lcom/whoop/weightlifting/data/domain/WeightliftingWorkout;->workoutGroups:Ljava/util/List;

    move/from16 p1, p16

    .line 13
    iput-boolean p1, p0, Lcom/whoop/weightlifting/data/domain/WeightliftingWorkout;->isSimpleStrengthLogging:Z

    .line 14
    const-string p1, "weightlifting_msk"

    iput-object p1, p0, Lcom/whoop/weightlifting/data/domain/WeightliftingWorkout;->type:Ljava/lang/String;

    return-void
.end method

.method public synthetic constructor <init>(Ljava/lang/String;Lcom/whoop/data/remote/domain/dto/DateTimeRange;Lorg/joda/time/DateTimeZone;Ljava/lang/String;DDDDLjava/lang/Long;Ljava/lang/Integer;Ljava/util/List;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V
    .locals 19

    move/from16 v0, p17

    and-int/lit8 v1, v0, 0x1

    if-eqz v1, :cond_0

    .line 15
    const-string v1, "user"

    move-object v3, v1

    goto :goto_0

    :cond_0
    move-object/from16 v3, p1

    :goto_0
    and-int/lit16 v1, v0, 0x200

    if-eqz v1, :cond_1

    const/4 v1, 0x0

    move-object/from16 v16, v1

    goto :goto_1

    :cond_1
    move-object/from16 v16, p14

    :goto_1
    and-int/lit16 v0, v0, 0x800

    if-eqz v0, :cond_2

    const/4 v0, 0x0

    move/from16 v18, v0

    :goto_2
    move-object/from16 v2, p0

    move-object/from16 v4, p2

    move-object/from16 v5, p3

    move-object/from16 v6, p4

    move-wide/from16 v7, p5

    move-wide/from16 v9, p7

    move-wide/from16 v11, p9

    move-wide/from16 v13, p11

    move-object/from16 v15, p13

    move-object/from16 v17, p15

    goto :goto_3

    :cond_2
    move/from16 v18, p16

    goto :goto_2

    .line 16
    :goto_3
    invoke-direct/range {v2 .. v18}, Lcom/whoop/weightlifting/data/domain/WeightliftingWorkout;-><init>(Ljava/lang/String;Lcom/whoop/data/remote/domain/dto/DateTimeRange;Lorg/joda/time/DateTimeZone;Ljava/lang/String;DDDDLjava/lang/Long;Ljava/lang/Integer;Ljava/util/List;Z)V

    return-void
.end method

.method public static synthetic copy$default(Lcom/whoop/weightlifting/data/domain/WeightliftingWorkout;Ljava/lang/String;Lcom/whoop/data/remote/domain/dto/DateTimeRange;Lorg/joda/time/DateTimeZone;Ljava/lang/String;DDDDLjava/lang/Long;Ljava/lang/Integer;Ljava/util/List;ZILjava/lang/Object;)Lcom/whoop/weightlifting/data/domain/WeightliftingWorkout;
    .locals 16

    move-object/from16 v0, p0

    move/from16 v1, p17

    and-int/lit8 v2, v1, 0x1

    if-eqz v2, :cond_0

    iget-object v2, v0, Lcom/whoop/weightlifting/data/domain/WeightliftingWorkout;->source:Ljava/lang/String;

    goto :goto_0

    :cond_0
    move-object/from16 v2, p1

    :goto_0
    and-int/lit8 v3, v1, 0x2

    if-eqz v3, :cond_1

    iget-object v3, v0, Lcom/whoop/weightlifting/data/domain/WeightliftingWorkout;->dateTimeRange:Lcom/whoop/data/remote/domain/dto/DateTimeRange;

    goto :goto_1

    :cond_1
    move-object/from16 v3, p2

    :goto_1
    and-int/lit8 v4, v1, 0x4

    if-eqz v4, :cond_2

    iget-object v4, v0, Lcom/whoop/weightlifting/data/domain/WeightliftingWorkout;->timezone:Lorg/joda/time/DateTimeZone;

    goto :goto_2

    :cond_2
    move-object/from16 v4, p3

    :goto_2
    and-int/lit8 v5, v1, 0x8

    if-eqz v5, :cond_3

    iget-object v5, v0, Lcom/whoop/weightlifting/data/domain/WeightliftingWorkout;->name:Ljava/lang/String;

    goto :goto_3

    :cond_3
    move-object/from16 v5, p4

    :goto_3
    and-int/lit8 v6, v1, 0x10

    if-eqz v6, :cond_4

    iget-wide v6, v0, Lcom/whoop/weightlifting/data/domain/WeightliftingWorkout;->mskTotalVolumeKg:D

    goto :goto_4

    :cond_4
    move-wide/from16 v6, p5

    :goto_4
    and-int/lit8 v8, v1, 0x20

    if-eqz v8, :cond_5

    iget-wide v8, v0, Lcom/whoop/weightlifting/data/domain/WeightliftingWorkout;->rawMskStrainScore:D

    goto :goto_5

    :cond_5
    move-wide/from16 v8, p7

    :goto_5
    and-int/lit8 v10, v1, 0x40

    if-eqz v10, :cond_6

    iget-wide v10, v0, Lcom/whoop/weightlifting/data/domain/WeightliftingWorkout;->mskIntensityPercent:D

    goto :goto_6

    :cond_6
    move-wide/from16 v10, p9

    :goto_6
    and-int/lit16 v12, v1, 0x80

    if-eqz v12, :cond_7

    iget-wide v12, v0, Lcom/whoop/weightlifting/data/domain/WeightliftingWorkout;->scaledMskStrainScore:D

    goto :goto_7

    :cond_7
    move-wide/from16 v12, p11

    :goto_7
    and-int/lit16 v14, v1, 0x100

    if-eqz v14, :cond_8

    iget-object v14, v0, Lcom/whoop/weightlifting/data/domain/WeightliftingWorkout;->workoutTemplateId:Ljava/lang/Long;

    goto :goto_8

    :cond_8
    move-object/from16 v14, p13

    :goto_8
    and-int/lit16 v15, v1, 0x200

    if-eqz v15, :cond_9

    iget-object v15, v0, Lcom/whoop/weightlifting/data/domain/WeightliftingWorkout;->rpe:Ljava/lang/Integer;

    goto :goto_9

    :cond_9
    move-object/from16 v15, p14

    :goto_9
    move-object/from16 p1, v2

    and-int/lit16 v2, v1, 0x400

    if-eqz v2, :cond_a

    iget-object v2, v0, Lcom/whoop/weightlifting/data/domain/WeightliftingWorkout;->workoutGroups:Ljava/util/List;

    goto :goto_a

    :cond_a
    move-object/from16 v2, p15

    :goto_a
    and-int/lit16 v1, v1, 0x800

    if-eqz v1, :cond_b

    iget-boolean v1, v0, Lcom/whoop/weightlifting/data/domain/WeightliftingWorkout;->isSimpleStrengthLogging:Z

    move/from16 p17, v1

    :goto_b
    move-object/from16 p2, p1

    move-object/from16 p1, v0

    move-object/from16 p16, v2

    move-object/from16 p3, v3

    move-object/from16 p4, v4

    move-object/from16 p5, v5

    move-wide/from16 p6, v6

    move-wide/from16 p8, v8

    move-wide/from16 p10, v10

    move-wide/from16 p12, v12

    move-object/from16 p14, v14

    move-object/from16 p15, v15

    goto :goto_c

    :cond_b
    move/from16 p17, p16

    goto :goto_b

    :goto_c
    invoke-virtual/range {p1 .. p17}, Lcom/whoop/weightlifting/data/domain/WeightliftingWorkout;->copy(Ljava/lang/String;Lcom/whoop/data/remote/domain/dto/DateTimeRange;Lorg/joda/time/DateTimeZone;Ljava/lang/String;DDDDLjava/lang/Long;Ljava/lang/Integer;Ljava/util/List;Z)Lcom/whoop/weightlifting/data/domain/WeightliftingWorkout;

    move-result-object v0

    return-object v0
.end method


# virtual methods
.method public final component1()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/weightlifting/data/domain/WeightliftingWorkout;->source:Ljava/lang/String;

    return-object v0
.end method

.method public final component10()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lcom/whoop/weightlifting/data/domain/WeightliftingWorkout;->rpe:Ljava/lang/Integer;

    return-object v0
.end method

.method public final component11()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/whoop/weightlifting/data/domain/WeightliftingWorkoutGroup;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/weightlifting/data/domain/WeightliftingWorkout;->workoutGroups:Ljava/util/List;

    return-object v0
.end method

.method public final component12()Z
    .locals 1

    iget-boolean v0, p0, Lcom/whoop/weightlifting/data/domain/WeightliftingWorkout;->isSimpleStrengthLogging:Z

    return v0
.end method

.method public final component2()Lcom/whoop/data/remote/domain/dto/DateTimeRange;
    .locals 1

    iget-object v0, p0, Lcom/whoop/weightlifting/data/domain/WeightliftingWorkout;->dateTimeRange:Lcom/whoop/data/remote/domain/dto/DateTimeRange;

    return-object v0
.end method

.method public final component3()Lorg/joda/time/DateTimeZone;
    .locals 1

    iget-object v0, p0, Lcom/whoop/weightlifting/data/domain/WeightliftingWorkout;->timezone:Lorg/joda/time/DateTimeZone;

    return-object v0
.end method

.method public final component4()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/weightlifting/data/domain/WeightliftingWorkout;->name:Ljava/lang/String;

    return-object v0
.end method

.method public final component5()D
    .locals 2

    iget-wide v0, p0, Lcom/whoop/weightlifting/data/domain/WeightliftingWorkout;->mskTotalVolumeKg:D

    return-wide v0
.end method

.method public final component6()D
    .locals 2

    iget-wide v0, p0, Lcom/whoop/weightlifting/data/domain/WeightliftingWorkout;->rawMskStrainScore:D

    return-wide v0
.end method

.method public final component7()D
    .locals 2

    iget-wide v0, p0, Lcom/whoop/weightlifting/data/domain/WeightliftingWorkout;->mskIntensityPercent:D

    return-wide v0
.end method

.method public final component8()D
    .locals 2

    iget-wide v0, p0, Lcom/whoop/weightlifting/data/domain/WeightliftingWorkout;->scaledMskStrainScore:D

    return-wide v0
.end method

.method public final component9()Ljava/lang/Long;
    .locals 1

    iget-object v0, p0, Lcom/whoop/weightlifting/data/domain/WeightliftingWorkout;->workoutTemplateId:Ljava/lang/Long;

    return-object v0
.end method

.method public final copy(Ljava/lang/String;Lcom/whoop/data/remote/domain/dto/DateTimeRange;Lorg/joda/time/DateTimeZone;Ljava/lang/String;DDDDLjava/lang/Long;Ljava/lang/Integer;Ljava/util/List;Z)Lcom/whoop/weightlifting/data/domain/WeightliftingWorkout;
    .locals 18
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lcom/whoop/data/remote/domain/dto/DateTimeRange;",
            "Lorg/joda/time/DateTimeZone;",
            "Ljava/lang/String;",
            "DDDD",
            "Ljava/lang/Long;",
            "Ljava/lang/Integer;",
            "Ljava/util/List<",
            "Lcom/whoop/weightlifting/data/domain/WeightliftingWorkoutGroup;",
            ">;Z)",
            "Lcom/whoop/weightlifting/data/domain/WeightliftingWorkout;"
        }
    .end annotation

    const-string v0, "source"

    move-object/from16 v2, p1

    invoke-static {v2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "dateTimeRange"

    move-object/from16 v3, p2

    invoke-static {v3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "timezone"

    move-object/from16 v4, p3

    invoke-static {v4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "name"

    move-object/from16 v5, p4

    invoke-static {v5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "workoutGroups"

    move-object/from16 v1, p15

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/whoop/weightlifting/data/domain/WeightliftingWorkout;

    move-wide/from16 v6, p5

    move-wide/from16 v8, p7

    move-wide/from16 v10, p9

    move-wide/from16 v12, p11

    move-object/from16 v14, p13

    move-object/from16 v15, p14

    move-object/from16 v16, p15

    move/from16 v17, p16

    invoke-direct/range {v1 .. v17}, Lcom/whoop/weightlifting/data/domain/WeightliftingWorkout;-><init>(Ljava/lang/String;Lcom/whoop/data/remote/domain/dto/DateTimeRange;Lorg/joda/time/DateTimeZone;Ljava/lang/String;DDDDLjava/lang/Long;Ljava/lang/Integer;Ljava/util/List;Z)V

    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 7

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/weightlifting/data/domain/WeightliftingWorkout;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/weightlifting/data/domain/WeightliftingWorkout;

    iget-object v1, p0, Lcom/whoop/weightlifting/data/domain/WeightliftingWorkout;->source:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/weightlifting/data/domain/WeightliftingWorkout;->source:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/whoop/weightlifting/data/domain/WeightliftingWorkout;->dateTimeRange:Lcom/whoop/data/remote/domain/dto/DateTimeRange;

    iget-object v3, p1, Lcom/whoop/weightlifting/data/domain/WeightliftingWorkout;->dateTimeRange:Lcom/whoop/data/remote/domain/dto/DateTimeRange;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/whoop/weightlifting/data/domain/WeightliftingWorkout;->timezone:Lorg/joda/time/DateTimeZone;

    iget-object v3, p1, Lcom/whoop/weightlifting/data/domain/WeightliftingWorkout;->timezone:Lorg/joda/time/DateTimeZone;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/whoop/weightlifting/data/domain/WeightliftingWorkout;->name:Ljava/lang/String;

    iget-object v3, p1, Lcom/whoop/weightlifting/data/domain/WeightliftingWorkout;->name:Ljava/lang/String;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-wide v3, p0, Lcom/whoop/weightlifting/data/domain/WeightliftingWorkout;->mskTotalVolumeKg:D

    iget-wide v5, p1, Lcom/whoop/weightlifting/data/domain/WeightliftingWorkout;->mskTotalVolumeKg:D

    invoke-static {v3, v4, v5, v6}, Ljava/lang/Double;->compare(DD)I

    move-result v1

    if-eqz v1, :cond_6

    return v2

    :cond_6
    iget-wide v3, p0, Lcom/whoop/weightlifting/data/domain/WeightliftingWorkout;->rawMskStrainScore:D

    iget-wide v5, p1, Lcom/whoop/weightlifting/data/domain/WeightliftingWorkout;->rawMskStrainScore:D

    invoke-static {v3, v4, v5, v6}, Ljava/lang/Double;->compare(DD)I

    move-result v1

    if-eqz v1, :cond_7

    return v2

    :cond_7
    iget-wide v3, p0, Lcom/whoop/weightlifting/data/domain/WeightliftingWorkout;->mskIntensityPercent:D

    iget-wide v5, p1, Lcom/whoop/weightlifting/data/domain/WeightliftingWorkout;->mskIntensityPercent:D

    invoke-static {v3, v4, v5, v6}, Ljava/lang/Double;->compare(DD)I

    move-result v1

    if-eqz v1, :cond_8

    return v2

    :cond_8
    iget-wide v3, p0, Lcom/whoop/weightlifting/data/domain/WeightliftingWorkout;->scaledMskStrainScore:D

    iget-wide v5, p1, Lcom/whoop/weightlifting/data/domain/WeightliftingWorkout;->scaledMskStrainScore:D

    invoke-static {v3, v4, v5, v6}, Ljava/lang/Double;->compare(DD)I

    move-result v1

    if-eqz v1, :cond_9

    return v2

    :cond_9
    iget-object v1, p0, Lcom/whoop/weightlifting/data/domain/WeightliftingWorkout;->workoutTemplateId:Ljava/lang/Long;

    iget-object v3, p1, Lcom/whoop/weightlifting/data/domain/WeightliftingWorkout;->workoutTemplateId:Ljava/lang/Long;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_a

    return v2

    :cond_a
    iget-object v1, p0, Lcom/whoop/weightlifting/data/domain/WeightliftingWorkout;->rpe:Ljava/lang/Integer;

    iget-object v3, p1, Lcom/whoop/weightlifting/data/domain/WeightliftingWorkout;->rpe:Ljava/lang/Integer;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_b

    return v2

    :cond_b
    iget-object v1, p0, Lcom/whoop/weightlifting/data/domain/WeightliftingWorkout;->workoutGroups:Ljava/util/List;

    iget-object v3, p1, Lcom/whoop/weightlifting/data/domain/WeightliftingWorkout;->workoutGroups:Ljava/util/List;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_c

    return v2

    :cond_c
    iget-boolean v1, p0, Lcom/whoop/weightlifting/data/domain/WeightliftingWorkout;->isSimpleStrengthLogging:Z

    iget-boolean p1, p1, Lcom/whoop/weightlifting/data/domain/WeightliftingWorkout;->isSimpleStrengthLogging:Z

    if-eq v1, p1, :cond_d

    return v2

    :cond_d
    return v0
.end method

.method public final getDateTimeRange()Lcom/whoop/data/remote/domain/dto/DateTimeRange;
    .locals 1

    iget-object v0, p0, Lcom/whoop/weightlifting/data/domain/WeightliftingWorkout;->dateTimeRange:Lcom/whoop/data/remote/domain/dto/DateTimeRange;

    return-object v0
.end method

.method public final getMskIntensityPercent()D
    .locals 2

    iget-wide v0, p0, Lcom/whoop/weightlifting/data/domain/WeightliftingWorkout;->mskIntensityPercent:D

    return-wide v0
.end method

.method public final getMskTotalVolumeKg()D
    .locals 2

    iget-wide v0, p0, Lcom/whoop/weightlifting/data/domain/WeightliftingWorkout;->mskTotalVolumeKg:D

    return-wide v0
.end method

.method public final getName()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/weightlifting/data/domain/WeightliftingWorkout;->name:Ljava/lang/String;

    return-object v0
.end method

.method public final getRawMskStrainScore()D
    .locals 2

    iget-wide v0, p0, Lcom/whoop/weightlifting/data/domain/WeightliftingWorkout;->rawMskStrainScore:D

    return-wide v0
.end method

.method public final getRpe()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lcom/whoop/weightlifting/data/domain/WeightliftingWorkout;->rpe:Ljava/lang/Integer;

    return-object v0
.end method

.method public final getScaledMskStrainScore()D
    .locals 2

    iget-wide v0, p0, Lcom/whoop/weightlifting/data/domain/WeightliftingWorkout;->scaledMskStrainScore:D

    return-wide v0
.end method

.method public final getSource()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/weightlifting/data/domain/WeightliftingWorkout;->source:Ljava/lang/String;

    return-object v0
.end method

.method public final getTimezone()Lorg/joda/time/DateTimeZone;
    .locals 1

    iget-object v0, p0, Lcom/whoop/weightlifting/data/domain/WeightliftingWorkout;->timezone:Lorg/joda/time/DateTimeZone;

    return-object v0
.end method

.method public final getType()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/weightlifting/data/domain/WeightliftingWorkout;->type:Ljava/lang/String;

    return-object v0
.end method

.method public final getWorkoutGroups()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/whoop/weightlifting/data/domain/WeightliftingWorkoutGroup;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/weightlifting/data/domain/WeightliftingWorkout;->workoutGroups:Ljava/util/List;

    return-object v0
.end method

.method public final getWorkoutTemplateId()Ljava/lang/Long;
    .locals 1

    iget-object v0, p0, Lcom/whoop/weightlifting/data/domain/WeightliftingWorkout;->workoutTemplateId:Ljava/lang/Long;

    return-object v0
.end method

.method public hashCode()I
    .locals 4

    iget-object v0, p0, Lcom/whoop/weightlifting/data/domain/WeightliftingWorkout;->source:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->hashCode()I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/weightlifting/data/domain/WeightliftingWorkout;->dateTimeRange:Lcom/whoop/data/remote/domain/dto/DateTimeRange;

    invoke-virtual {v2}, Lcom/whoop/data/remote/domain/dto/DateTimeRange;->hashCode()I

    move-result v2

    add-int/2addr v2, v0

    mul-int/2addr v2, v1

    iget-object v0, p0, Lcom/whoop/weightlifting/data/domain/WeightliftingWorkout;->timezone:Lorg/joda/time/DateTimeZone;

    invoke-virtual {v0}, Lorg/joda/time/DateTimeZone;->hashCode()I

    move-result v0

    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/weightlifting/data/domain/WeightliftingWorkout;->name:Ljava/lang/String;

    invoke-static {v0, v1, v2}, Ld;->d(IILjava/lang/String;)I

    move-result v0

    iget-wide v2, p0, Lcom/whoop/weightlifting/data/domain/WeightliftingWorkout;->mskTotalVolumeKg:D

    invoke-static {v0, v1, v2, v3}, Lhc3/i;->a(IID)I

    move-result v0

    iget-wide v2, p0, Lcom/whoop/weightlifting/data/domain/WeightliftingWorkout;->rawMskStrainScore:D

    invoke-static {v0, v1, v2, v3}, Lhc3/i;->a(IID)I

    move-result v0

    iget-wide v2, p0, Lcom/whoop/weightlifting/data/domain/WeightliftingWorkout;->mskIntensityPercent:D

    invoke-static {v0, v1, v2, v3}, Lhc3/i;->a(IID)I

    move-result v0

    iget-wide v2, p0, Lcom/whoop/weightlifting/data/domain/WeightliftingWorkout;->scaledMskStrainScore:D

    invoke-static {v0, v1, v2, v3}, Lhc3/i;->a(IID)I

    move-result v0

    iget-object v2, p0, Lcom/whoop/weightlifting/data/domain/WeightliftingWorkout;->workoutTemplateId:Ljava/lang/Long;

    const/4 v3, 0x0

    if-nez v2, :cond_0

    move v2, v3

    goto :goto_0

    :cond_0
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    :goto_0
    add-int/2addr v0, v2

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/weightlifting/data/domain/WeightliftingWorkout;->rpe:Ljava/lang/Integer;

    if-nez v2, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v3

    :goto_1
    add-int/2addr v0, v3

    mul-int/2addr v0, v1

    iget-object v2, p0, Lcom/whoop/weightlifting/data/domain/WeightliftingWorkout;->workoutGroups:Ljava/util/List;

    invoke-static {v0, v1, v2}, Ldc/b;->b(IILjava/util/List;)I

    move-result v0

    iget-boolean v1, p0, Lcom/whoop/weightlifting/data/domain/WeightliftingWorkout;->isSimpleStrengthLogging:Z

    invoke-static {v1}, Ljava/lang/Boolean;->hashCode(Z)I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public final isSimpleStrengthLogging()Z
    .locals 1

    iget-boolean v0, p0, Lcom/whoop/weightlifting/data/domain/WeightliftingWorkout;->isSimpleStrengthLogging:Z

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 18

    move-object/from16 v0, p0

    iget-object v1, v0, Lcom/whoop/weightlifting/data/domain/WeightliftingWorkout;->source:Ljava/lang/String;

    iget-object v2, v0, Lcom/whoop/weightlifting/data/domain/WeightliftingWorkout;->dateTimeRange:Lcom/whoop/data/remote/domain/dto/DateTimeRange;

    iget-object v3, v0, Lcom/whoop/weightlifting/data/domain/WeightliftingWorkout;->timezone:Lorg/joda/time/DateTimeZone;

    iget-object v4, v0, Lcom/whoop/weightlifting/data/domain/WeightliftingWorkout;->name:Ljava/lang/String;

    iget-wide v5, v0, Lcom/whoop/weightlifting/data/domain/WeightliftingWorkout;->mskTotalVolumeKg:D

    iget-wide v7, v0, Lcom/whoop/weightlifting/data/domain/WeightliftingWorkout;->rawMskStrainScore:D

    iget-wide v9, v0, Lcom/whoop/weightlifting/data/domain/WeightliftingWorkout;->mskIntensityPercent:D

    iget-wide v11, v0, Lcom/whoop/weightlifting/data/domain/WeightliftingWorkout;->scaledMskStrainScore:D

    iget-object v13, v0, Lcom/whoop/weightlifting/data/domain/WeightliftingWorkout;->workoutTemplateId:Ljava/lang/Long;

    iget-object v14, v0, Lcom/whoop/weightlifting/data/domain/WeightliftingWorkout;->rpe:Ljava/lang/Integer;

    iget-object v15, v0, Lcom/whoop/weightlifting/data/domain/WeightliftingWorkout;->workoutGroups:Ljava/util/List;

    move-object/from16 v16, v15

    iget-boolean v15, v0, Lcom/whoop/weightlifting/data/domain/WeightliftingWorkout;->isSimpleStrengthLogging:Z

    new-instance v0, Ljava/lang/StringBuilder;

    move/from16 v17, v15

    const-string v15, "WeightliftingWorkout(source="

    invoke-direct {v0, v15}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", dateTimeRange="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", timezone="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", name="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", mskTotalVolumeKg="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v5, v6}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    const-string v1, ", rawMskStrainScore="

    const-string v2, ", mskIntensityPercent="

    invoke-static {v0, v1, v7, v8, v2}, Lr80/c;->B(Ljava/lang/StringBuilder;Ljava/lang/String;DLjava/lang/String;)V

    invoke-virtual {v0, v9, v10}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    const-string v1, ", scaledMskStrainScore="

    const-string v2, ", workoutTemplateId="

    invoke-static {v0, v1, v11, v12, v2}, Lr80/c;->B(Ljava/lang/StringBuilder;Ljava/lang/String;DLjava/lang/String;)V

    invoke-virtual {v0, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", rpe="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", workoutGroups="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-object/from16 v1, v16

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", isSimpleStrengthLogging="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    move/from16 v1, v17

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
