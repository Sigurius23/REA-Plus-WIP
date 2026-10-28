.class public final Lcom/whoop/weightlifting/data/domain/WeightliftingWorkoutSet;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000>\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008 \n\u0002\u0010\u000e\n\u0000\u0008\u0087\u0008\u0018\u00002\u00020\u0001BU\u0012\u0008\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\u0008\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u0008\u0012\u0006\u0010\t\u001a\u00020\n\u0012\u0008\u0010\u000b\u001a\u0004\u0018\u00010\u000c\u0012\u0008\u0010\r\u001a\u0004\u0018\u00010\u000e\u0012\u0008\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u00a2\u0006\u0004\u0008\u0011\u0010\u0012J\u0010\u0010#\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\u0014J\u0010\u0010$\u001a\u0004\u0018\u00010\u0003H\u00c6\u0003\u00a2\u0006\u0002\u0010\u0014J\u0010\u0010%\u001a\u0004\u0018\u00010\u0006H\u00c6\u0003\u00a2\u0006\u0002\u0010\u0018J\u000b\u0010&\u001a\u0004\u0018\u00010\u0008H\u00c6\u0003J\t\u0010\'\u001a\u00020\nH\u00c6\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\u000cH\u00c6\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\u000eH\u00c6\u0003J\u000b\u0010*\u001a\u0004\u0018\u00010\u0010H\u00c6\u0003Jl\u0010+\u001a\u00020\u00002\n\u0008\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\u0008\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\u0008\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00062\n\u0008\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00082\u0008\u0008\u0002\u0010\t\u001a\u00020\n2\n\u0008\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u000c2\n\u0008\u0002\u0010\r\u001a\u0004\u0018\u00010\u000e2\n\u0008\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u00c6\u0001\u00a2\u0006\u0002\u0010,J\u0014\u0010-\u001a\u00020\n2\u0008\u0010.\u001a\u0004\u0018\u00010\u0001H\u00d6\u0083\u0004J\n\u0010/\u001a\u00020\u0003H\u00d6\u0081\u0004J\n\u00100\u001a\u000201H\u00d6\u0081\u0004R\u0015\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\n\n\u0002\u0010\u0015\u001a\u0004\u0008\u0013\u0010\u0014R\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\n\n\u0002\u0010\u0015\u001a\u0004\u0008\u0016\u0010\u0014R\u0015\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\n\n\u0002\u0010\u0019\u001a\u0004\u0008\u0017\u0010\u0018R\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0008\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001a\u0010\u001bR\u0011\u0010\t\u001a\u00020\n\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\t\u0010\u001cR\u0013\u0010\u000b\u001a\u0004\u0018\u00010\u000c\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001d\u0010\u001eR\u0013\u0010\r\u001a\u0004\u0018\u00010\u000e\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u001f\u0010 R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0010\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008!\u0010\"\u00a8\u00062"
    }
    d2 = {
        "Lcom/whoop/weightlifting/data/domain/WeightliftingWorkoutSet;",
        "",
        "numberOfReps",
        "",
        "timeInSeconds",
        "weight",
        "",
        "id",
        "Ljava/util/UUID;",
        "isExerciseTrackable",
        "",
        "dateTimeRange",
        "Lcom/whoop/data/remote/domain/dto/DateTimeRange;",
        "strapLocation",
        "Lcom/whoop/weightlifting/data/domain/StrapLocation;",
        "strapLaterality",
        "Lcom/whoop/weightlifting/data/domain/StrapLaterality;",
        "<init>",
        "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Float;Ljava/util/UUID;ZLcom/whoop/data/remote/domain/dto/DateTimeRange;Lcom/whoop/weightlifting/data/domain/StrapLocation;Lcom/whoop/weightlifting/data/domain/StrapLaterality;)V",
        "getNumberOfReps",
        "()Ljava/lang/Integer;",
        "Ljava/lang/Integer;",
        "getTimeInSeconds",
        "getWeight",
        "()Ljava/lang/Float;",
        "Ljava/lang/Float;",
        "getId",
        "()Ljava/util/UUID;",
        "()Z",
        "getDateTimeRange",
        "()Lcom/whoop/data/remote/domain/dto/DateTimeRange;",
        "getStrapLocation",
        "()Lcom/whoop/weightlifting/data/domain/StrapLocation;",
        "getStrapLaterality",
        "()Lcom/whoop/weightlifting/data/domain/StrapLaterality;",
        "component1",
        "component2",
        "component3",
        "component4",
        "component5",
        "component6",
        "component7",
        "component8",
        "copy",
        "(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Float;Ljava/util/UUID;ZLcom/whoop/data/remote/domain/dto/DateTimeRange;Lcom/whoop/weightlifting/data/domain/StrapLocation;Lcom/whoop/weightlifting/data/domain/StrapLaterality;)Lcom/whoop/weightlifting/data/domain/WeightliftingWorkoutSet;",
        "equals",
        "other",
        "hashCode",
        "toString",
        "",
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

.field private final id:Ljava/util/UUID;

.field private final isExerciseTrackable:Z

.field private final numberOfReps:Ljava/lang/Integer;

.field private final strapLaterality:Lcom/whoop/weightlifting/data/domain/StrapLaterality;

.field private final strapLocation:Lcom/whoop/weightlifting/data/domain/StrapLocation;

.field private final timeInSeconds:Ljava/lang/Integer;

.field private final weight:Ljava/lang/Float;


# direct methods
.method public constructor <init>(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Float;Ljava/util/UUID;ZLcom/whoop/data/remote/domain/dto/DateTimeRange;Lcom/whoop/weightlifting/data/domain/StrapLocation;Lcom/whoop/weightlifting/data/domain/StrapLaterality;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lcom/whoop/weightlifting/data/domain/WeightliftingWorkoutSet;->numberOfReps:Ljava/lang/Integer;

    iput-object p2, p0, Lcom/whoop/weightlifting/data/domain/WeightliftingWorkoutSet;->timeInSeconds:Ljava/lang/Integer;

    iput-object p3, p0, Lcom/whoop/weightlifting/data/domain/WeightliftingWorkoutSet;->weight:Ljava/lang/Float;

    iput-object p4, p0, Lcom/whoop/weightlifting/data/domain/WeightliftingWorkoutSet;->id:Ljava/util/UUID;

    iput-boolean p5, p0, Lcom/whoop/weightlifting/data/domain/WeightliftingWorkoutSet;->isExerciseTrackable:Z

    iput-object p6, p0, Lcom/whoop/weightlifting/data/domain/WeightliftingWorkoutSet;->dateTimeRange:Lcom/whoop/data/remote/domain/dto/DateTimeRange;

    iput-object p7, p0, Lcom/whoop/weightlifting/data/domain/WeightliftingWorkoutSet;->strapLocation:Lcom/whoop/weightlifting/data/domain/StrapLocation;

    iput-object p8, p0, Lcom/whoop/weightlifting/data/domain/WeightliftingWorkoutSet;->strapLaterality:Lcom/whoop/weightlifting/data/domain/StrapLaterality;

    return-void
.end method

.method public static synthetic copy$default(Lcom/whoop/weightlifting/data/domain/WeightliftingWorkoutSet;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Float;Ljava/util/UUID;ZLcom/whoop/data/remote/domain/dto/DateTimeRange;Lcom/whoop/weightlifting/data/domain/StrapLocation;Lcom/whoop/weightlifting/data/domain/StrapLaterality;ILjava/lang/Object;)Lcom/whoop/weightlifting/data/domain/WeightliftingWorkoutSet;
    .locals 0

    and-int/lit8 p10, p9, 0x1

    if-eqz p10, :cond_0

    iget-object p1, p0, Lcom/whoop/weightlifting/data/domain/WeightliftingWorkoutSet;->numberOfReps:Ljava/lang/Integer;

    :cond_0
    and-int/lit8 p10, p9, 0x2

    if-eqz p10, :cond_1

    iget-object p2, p0, Lcom/whoop/weightlifting/data/domain/WeightliftingWorkoutSet;->timeInSeconds:Ljava/lang/Integer;

    :cond_1
    and-int/lit8 p10, p9, 0x4

    if-eqz p10, :cond_2

    iget-object p3, p0, Lcom/whoop/weightlifting/data/domain/WeightliftingWorkoutSet;->weight:Ljava/lang/Float;

    :cond_2
    and-int/lit8 p10, p9, 0x8

    if-eqz p10, :cond_3

    iget-object p4, p0, Lcom/whoop/weightlifting/data/domain/WeightliftingWorkoutSet;->id:Ljava/util/UUID;

    :cond_3
    and-int/lit8 p10, p9, 0x10

    if-eqz p10, :cond_4

    iget-boolean p5, p0, Lcom/whoop/weightlifting/data/domain/WeightliftingWorkoutSet;->isExerciseTrackable:Z

    :cond_4
    and-int/lit8 p10, p9, 0x20

    if-eqz p10, :cond_5

    iget-object p6, p0, Lcom/whoop/weightlifting/data/domain/WeightliftingWorkoutSet;->dateTimeRange:Lcom/whoop/data/remote/domain/dto/DateTimeRange;

    :cond_5
    and-int/lit8 p10, p9, 0x40

    if-eqz p10, :cond_6

    iget-object p7, p0, Lcom/whoop/weightlifting/data/domain/WeightliftingWorkoutSet;->strapLocation:Lcom/whoop/weightlifting/data/domain/StrapLocation;

    :cond_6
    and-int/lit16 p9, p9, 0x80

    if-eqz p9, :cond_7

    iget-object p8, p0, Lcom/whoop/weightlifting/data/domain/WeightliftingWorkoutSet;->strapLaterality:Lcom/whoop/weightlifting/data/domain/StrapLaterality;

    :cond_7
    move-object p9, p7

    move-object p10, p8

    move p7, p5

    move-object p8, p6

    move-object p5, p3

    move-object p6, p4

    move-object p3, p1

    move-object p4, p2

    move-object p2, p0

    invoke-virtual/range {p2 .. p10}, Lcom/whoop/weightlifting/data/domain/WeightliftingWorkoutSet;->copy(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Float;Ljava/util/UUID;ZLcom/whoop/data/remote/domain/dto/DateTimeRange;Lcom/whoop/weightlifting/data/domain/StrapLocation;Lcom/whoop/weightlifting/data/domain/StrapLaterality;)Lcom/whoop/weightlifting/data/domain/WeightliftingWorkoutSet;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lcom/whoop/weightlifting/data/domain/WeightliftingWorkoutSet;->numberOfReps:Ljava/lang/Integer;

    return-object v0
.end method

.method public final component2()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lcom/whoop/weightlifting/data/domain/WeightliftingWorkoutSet;->timeInSeconds:Ljava/lang/Integer;

    return-object v0
.end method

.method public final component3()Ljava/lang/Float;
    .locals 1

    iget-object v0, p0, Lcom/whoop/weightlifting/data/domain/WeightliftingWorkoutSet;->weight:Ljava/lang/Float;

    return-object v0
.end method

.method public final component4()Ljava/util/UUID;
    .locals 1

    iget-object v0, p0, Lcom/whoop/weightlifting/data/domain/WeightliftingWorkoutSet;->id:Ljava/util/UUID;

    return-object v0
.end method

.method public final component5()Z
    .locals 1

    iget-boolean v0, p0, Lcom/whoop/weightlifting/data/domain/WeightliftingWorkoutSet;->isExerciseTrackable:Z

    return v0
.end method

.method public final component6()Lcom/whoop/data/remote/domain/dto/DateTimeRange;
    .locals 1

    iget-object v0, p0, Lcom/whoop/weightlifting/data/domain/WeightliftingWorkoutSet;->dateTimeRange:Lcom/whoop/data/remote/domain/dto/DateTimeRange;

    return-object v0
.end method

.method public final component7()Lcom/whoop/weightlifting/data/domain/StrapLocation;
    .locals 1

    iget-object v0, p0, Lcom/whoop/weightlifting/data/domain/WeightliftingWorkoutSet;->strapLocation:Lcom/whoop/weightlifting/data/domain/StrapLocation;

    return-object v0
.end method

.method public final component8()Lcom/whoop/weightlifting/data/domain/StrapLaterality;
    .locals 1

    iget-object v0, p0, Lcom/whoop/weightlifting/data/domain/WeightliftingWorkoutSet;->strapLaterality:Lcom/whoop/weightlifting/data/domain/StrapLaterality;

    return-object v0
.end method

.method public final copy(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Float;Ljava/util/UUID;ZLcom/whoop/data/remote/domain/dto/DateTimeRange;Lcom/whoop/weightlifting/data/domain/StrapLocation;Lcom/whoop/weightlifting/data/domain/StrapLaterality;)Lcom/whoop/weightlifting/data/domain/WeightliftingWorkoutSet;
    .locals 9

    new-instance v0, Lcom/whoop/weightlifting/data/domain/WeightliftingWorkoutSet;

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    move v5, p5

    move-object v6, p6

    move-object/from16 v7, p7

    move-object/from16 v8, p8

    invoke-direct/range {v0 .. v8}, Lcom/whoop/weightlifting/data/domain/WeightliftingWorkoutSet;-><init>(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Float;Ljava/util/UUID;ZLcom/whoop/data/remote/domain/dto/DateTimeRange;Lcom/whoop/weightlifting/data/domain/StrapLocation;Lcom/whoop/weightlifting/data/domain/StrapLaterality;)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 4

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/weightlifting/data/domain/WeightliftingWorkoutSet;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/weightlifting/data/domain/WeightliftingWorkoutSet;

    iget-object v1, p0, Lcom/whoop/weightlifting/data/domain/WeightliftingWorkoutSet;->numberOfReps:Ljava/lang/Integer;

    iget-object v3, p1, Lcom/whoop/weightlifting/data/domain/WeightliftingWorkoutSet;->numberOfReps:Ljava/lang/Integer;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2

    return v2

    :cond_2
    iget-object v1, p0, Lcom/whoop/weightlifting/data/domain/WeightliftingWorkoutSet;->timeInSeconds:Ljava/lang/Integer;

    iget-object v3, p1, Lcom/whoop/weightlifting/data/domain/WeightliftingWorkoutSet;->timeInSeconds:Ljava/lang/Integer;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    return v2

    :cond_3
    iget-object v1, p0, Lcom/whoop/weightlifting/data/domain/WeightliftingWorkoutSet;->weight:Ljava/lang/Float;

    iget-object v3, p1, Lcom/whoop/weightlifting/data/domain/WeightliftingWorkoutSet;->weight:Ljava/lang/Float;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4

    return v2

    :cond_4
    iget-object v1, p0, Lcom/whoop/weightlifting/data/domain/WeightliftingWorkoutSet;->id:Ljava/util/UUID;

    iget-object v3, p1, Lcom/whoop/weightlifting/data/domain/WeightliftingWorkoutSet;->id:Ljava/util/UUID;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_5

    return v2

    :cond_5
    iget-boolean v1, p0, Lcom/whoop/weightlifting/data/domain/WeightliftingWorkoutSet;->isExerciseTrackable:Z

    iget-boolean v3, p1, Lcom/whoop/weightlifting/data/domain/WeightliftingWorkoutSet;->isExerciseTrackable:Z

    if-eq v1, v3, :cond_6

    return v2

    :cond_6
    iget-object v1, p0, Lcom/whoop/weightlifting/data/domain/WeightliftingWorkoutSet;->dateTimeRange:Lcom/whoop/data/remote/domain/dto/DateTimeRange;

    iget-object v3, p1, Lcom/whoop/weightlifting/data/domain/WeightliftingWorkoutSet;->dateTimeRange:Lcom/whoop/data/remote/domain/dto/DateTimeRange;

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_7

    return v2

    :cond_7
    iget-object v1, p0, Lcom/whoop/weightlifting/data/domain/WeightliftingWorkoutSet;->strapLocation:Lcom/whoop/weightlifting/data/domain/StrapLocation;

    iget-object v3, p1, Lcom/whoop/weightlifting/data/domain/WeightliftingWorkoutSet;->strapLocation:Lcom/whoop/weightlifting/data/domain/StrapLocation;

    if-eq v1, v3, :cond_8

    return v2

    :cond_8
    iget-object v1, p0, Lcom/whoop/weightlifting/data/domain/WeightliftingWorkoutSet;->strapLaterality:Lcom/whoop/weightlifting/data/domain/StrapLaterality;

    iget-object p1, p1, Lcom/whoop/weightlifting/data/domain/WeightliftingWorkoutSet;->strapLaterality:Lcom/whoop/weightlifting/data/domain/StrapLaterality;

    if-eq v1, p1, :cond_9

    return v2

    :cond_9
    return v0
.end method

.method public final getDateTimeRange()Lcom/whoop/data/remote/domain/dto/DateTimeRange;
    .locals 1

    iget-object v0, p0, Lcom/whoop/weightlifting/data/domain/WeightliftingWorkoutSet;->dateTimeRange:Lcom/whoop/data/remote/domain/dto/DateTimeRange;

    return-object v0
.end method

.method public final getId()Ljava/util/UUID;
    .locals 1

    iget-object v0, p0, Lcom/whoop/weightlifting/data/domain/WeightliftingWorkoutSet;->id:Ljava/util/UUID;

    return-object v0
.end method

.method public final getNumberOfReps()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lcom/whoop/weightlifting/data/domain/WeightliftingWorkoutSet;->numberOfReps:Ljava/lang/Integer;

    return-object v0
.end method

.method public final getStrapLaterality()Lcom/whoop/weightlifting/data/domain/StrapLaterality;
    .locals 1

    iget-object v0, p0, Lcom/whoop/weightlifting/data/domain/WeightliftingWorkoutSet;->strapLaterality:Lcom/whoop/weightlifting/data/domain/StrapLaterality;

    return-object v0
.end method

.method public final getStrapLocation()Lcom/whoop/weightlifting/data/domain/StrapLocation;
    .locals 1

    iget-object v0, p0, Lcom/whoop/weightlifting/data/domain/WeightliftingWorkoutSet;->strapLocation:Lcom/whoop/weightlifting/data/domain/StrapLocation;

    return-object v0
.end method

.method public final getTimeInSeconds()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lcom/whoop/weightlifting/data/domain/WeightliftingWorkoutSet;->timeInSeconds:Ljava/lang/Integer;

    return-object v0
.end method

.method public final getWeight()Ljava/lang/Float;
    .locals 1

    iget-object v0, p0, Lcom/whoop/weightlifting/data/domain/WeightliftingWorkoutSet;->weight:Ljava/lang/Float;

    return-object v0
.end method

.method public hashCode()I
    .locals 4

    iget-object v0, p0, Lcom/whoop/weightlifting/data/domain/WeightliftingWorkoutSet;->numberOfReps:Ljava/lang/Integer;

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

    iget-object v3, p0, Lcom/whoop/weightlifting/data/domain/WeightliftingWorkoutSet;->timeInSeconds:Ljava/lang/Integer;

    if-nez v3, :cond_1

    move v3, v1

    goto :goto_1

    :cond_1
    invoke-virtual {v3}, Ljava/lang/Object;->hashCode()I

    move-result v3

    :goto_1
    add-int/2addr v0, v3

    mul-int/2addr v0, v2

    iget-object v3, p0, Lcom/whoop/weightlifting/data/domain/WeightliftingWorkoutSet;->weight:Ljava/lang/Float;

    if-nez v3, :cond_2

    move v3, v1

    goto :goto_2

    :cond_2
    invoke-virtual {v3}, Ljava/lang/Object;->hashCode()I

    move-result v3

    :goto_2
    add-int/2addr v0, v3

    mul-int/2addr v0, v2

    iget-object v3, p0, Lcom/whoop/weightlifting/data/domain/WeightliftingWorkoutSet;->id:Ljava/util/UUID;

    if-nez v3, :cond_3

    move v3, v1

    goto :goto_3

    :cond_3
    invoke-virtual {v3}, Ljava/util/UUID;->hashCode()I

    move-result v3

    :goto_3
    add-int/2addr v0, v3

    mul-int/2addr v0, v2

    iget-boolean v3, p0, Lcom/whoop/weightlifting/data/domain/WeightliftingWorkoutSet;->isExerciseTrackable:Z

    invoke-static {v0, v2, v3}, Lb9/y;->b(IIZ)I

    move-result v0

    iget-object v3, p0, Lcom/whoop/weightlifting/data/domain/WeightliftingWorkoutSet;->dateTimeRange:Lcom/whoop/data/remote/domain/dto/DateTimeRange;

    if-nez v3, :cond_4

    move v3, v1

    goto :goto_4

    :cond_4
    invoke-virtual {v3}, Lcom/whoop/data/remote/domain/dto/DateTimeRange;->hashCode()I

    move-result v3

    :goto_4
    add-int/2addr v0, v3

    mul-int/2addr v0, v2

    iget-object v3, p0, Lcom/whoop/weightlifting/data/domain/WeightliftingWorkoutSet;->strapLocation:Lcom/whoop/weightlifting/data/domain/StrapLocation;

    if-nez v3, :cond_5

    move v3, v1

    goto :goto_5

    :cond_5
    invoke-virtual {v3}, Ljava/lang/Object;->hashCode()I

    move-result v3

    :goto_5
    add-int/2addr v0, v3

    mul-int/2addr v0, v2

    iget-object v2, p0, Lcom/whoop/weightlifting/data/domain/WeightliftingWorkoutSet;->strapLaterality:Lcom/whoop/weightlifting/data/domain/StrapLaterality;

    if-nez v2, :cond_6

    goto :goto_6

    :cond_6
    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v1

    :goto_6
    add-int/2addr v0, v1

    return v0
.end method

.method public final isExerciseTrackable()Z
    .locals 1

    iget-boolean v0, p0, Lcom/whoop/weightlifting/data/domain/WeightliftingWorkoutSet;->isExerciseTrackable:Z

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 11

    iget-object v0, p0, Lcom/whoop/weightlifting/data/domain/WeightliftingWorkoutSet;->numberOfReps:Ljava/lang/Integer;

    iget-object v1, p0, Lcom/whoop/weightlifting/data/domain/WeightliftingWorkoutSet;->timeInSeconds:Ljava/lang/Integer;

    iget-object v2, p0, Lcom/whoop/weightlifting/data/domain/WeightliftingWorkoutSet;->weight:Ljava/lang/Float;

    iget-object v3, p0, Lcom/whoop/weightlifting/data/domain/WeightliftingWorkoutSet;->id:Ljava/util/UUID;

    iget-boolean v4, p0, Lcom/whoop/weightlifting/data/domain/WeightliftingWorkoutSet;->isExerciseTrackable:Z

    iget-object v5, p0, Lcom/whoop/weightlifting/data/domain/WeightliftingWorkoutSet;->dateTimeRange:Lcom/whoop/data/remote/domain/dto/DateTimeRange;

    iget-object v6, p0, Lcom/whoop/weightlifting/data/domain/WeightliftingWorkoutSet;->strapLocation:Lcom/whoop/weightlifting/data/domain/StrapLocation;

    iget-object v7, p0, Lcom/whoop/weightlifting/data/domain/WeightliftingWorkoutSet;->strapLaterality:Lcom/whoop/weightlifting/data/domain/StrapLaterality;

    const-string v8, ", timeInSeconds="

    const-string v9, ", weight="

    const-string v10, "WeightliftingWorkoutSet(numberOfReps="

    invoke-static {v10, v0, v8, v1, v9}, Lvl/b;->l(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", id="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", isExerciseTrackable="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", dateTimeRange="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", strapLocation="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", strapLaterality="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
