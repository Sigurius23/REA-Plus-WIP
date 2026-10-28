.class public final Lcom/whoop/service/network/model/rollups/WorkoutRollup;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0006\n\u0002\u0008\u0004\n\u0002\u0010\u0008\n\u0002\u0008\u0013\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0000\u0008\u0086\u0008\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0008\u0012\u0006\u0010\t\u001a\u00020\u0008\u00a2\u0006\u0004\u0008\n\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0015\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0016\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0017\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0018\u001a\u00020\u0008H\u00c6\u0003J\t\u0010\u0019\u001a\u00020\u0008H\u00c6\u0003JE\u0010\u001a\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u00082\u0008\u0008\u0002\u0010\t\u001a\u00020\u0008H\u00c6\u0001J\u0014\u0010\u001b\u001a\u00020\u001c2\u0008\u0010\u001d\u001a\u0004\u0018\u00010\u0001H\u00d6\u0083\u0004J\n\u0010\u001e\u001a\u00020\u0008H\u00d6\u0081\u0004J\n\u0010\u001f\u001a\u00020 H\u00d6\u0081\u0004R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000c\u0010\rR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000e\u0010\rR\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000f\u0010\rR\u0016\u0010\u0006\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0010\u0010\rR\u0016\u0010\u0007\u001a\u00020\u00088\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0011\u0010\u0012R\u0016\u0010\t\u001a\u00020\u00088\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0013\u0010\u0012\u00a8\u0006!"
    }
    d2 = {
        "Lcom/whoop/service/network/model/rollups/WorkoutRollup;",
        "",
        "avgStrainTrendDelta",
        "",
        "workoutCountTrendDelta",
        "avgStrainScore",
        "maxStrainScore",
        "sportId",
        "",
        "workoutCount",
        "<init>",
        "(DDDDII)V",
        "getAvgStrainTrendDelta",
        "()D",
        "getWorkoutCountTrendDelta",
        "getAvgStrainScore",
        "getMaxStrainScore",
        "getSportId",
        "()I",
        "getWorkoutCount",
        "component1",
        "component2",
        "component3",
        "component4",
        "component5",
        "component6",
        "copy",
        "equals",
        "",
        "other",
        "hashCode",
        "toString",
        "",
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
.field private final avgStrainScore:D
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "avg_strain_score"
    .end annotation
.end field

.field private final avgStrainTrendDelta:D
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "avg_strain_trend_delta"
    .end annotation
.end field

.field private final maxStrainScore:D
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "max_strain_score"
    .end annotation
.end field

.field private final sportId:I
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "sport_id"
    .end annotation
.end field

.field private final workoutCount:I
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "workout_count"
    .end annotation
.end field

.field private final workoutCountTrendDelta:D
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "workout_count_trend_delta"
    .end annotation
.end field


# direct methods
.method public constructor <init>(DDDDII)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-wide p1, p0, Lcom/whoop/service/network/model/rollups/WorkoutRollup;->avgStrainTrendDelta:D

    iput-wide p3, p0, Lcom/whoop/service/network/model/rollups/WorkoutRollup;->workoutCountTrendDelta:D

    iput-wide p5, p0, Lcom/whoop/service/network/model/rollups/WorkoutRollup;->avgStrainScore:D

    iput-wide p7, p0, Lcom/whoop/service/network/model/rollups/WorkoutRollup;->maxStrainScore:D

    iput p9, p0, Lcom/whoop/service/network/model/rollups/WorkoutRollup;->sportId:I

    iput p10, p0, Lcom/whoop/service/network/model/rollups/WorkoutRollup;->workoutCount:I

    return-void
.end method

.method public static synthetic copy$default(Lcom/whoop/service/network/model/rollups/WorkoutRollup;DDDDIIILjava/lang/Object;)Lcom/whoop/service/network/model/rollups/WorkoutRollup;
    .locals 11

    and-int/lit8 v0, p11, 0x1

    if-eqz v0, :cond_0

    iget-wide p1, p0, Lcom/whoop/service/network/model/rollups/WorkoutRollup;->avgStrainTrendDelta:D

    :cond_0
    move-wide v1, p1

    and-int/lit8 p1, p11, 0x2

    if-eqz p1, :cond_1

    iget-wide p3, p0, Lcom/whoop/service/network/model/rollups/WorkoutRollup;->workoutCountTrendDelta:D

    :cond_1
    move-wide v3, p3

    and-int/lit8 p1, p11, 0x4

    if-eqz p1, :cond_2

    iget-wide p1, p0, Lcom/whoop/service/network/model/rollups/WorkoutRollup;->avgStrainScore:D

    move-wide v5, p1

    goto :goto_0

    :cond_2
    move-wide/from16 v5, p5

    :goto_0
    and-int/lit8 p1, p11, 0x8

    if-eqz p1, :cond_3

    iget-wide p1, p0, Lcom/whoop/service/network/model/rollups/WorkoutRollup;->maxStrainScore:D

    move-wide v7, p1

    goto :goto_1

    :cond_3
    move-wide/from16 v7, p7

    :goto_1
    and-int/lit8 p1, p11, 0x10

    if-eqz p1, :cond_4

    iget p1, p0, Lcom/whoop/service/network/model/rollups/WorkoutRollup;->sportId:I

    move v9, p1

    goto :goto_2

    :cond_4
    move/from16 v9, p9

    :goto_2
    and-int/lit8 p1, p11, 0x20

    if-eqz p1, :cond_5

    iget p1, p0, Lcom/whoop/service/network/model/rollups/WorkoutRollup;->workoutCount:I

    move v10, p1

    :goto_3
    move-object v0, p0

    goto :goto_4

    :cond_5
    move/from16 v10, p10

    goto :goto_3

    :goto_4
    invoke-virtual/range {v0 .. v10}, Lcom/whoop/service/network/model/rollups/WorkoutRollup;->copy(DDDDII)Lcom/whoop/service/network/model/rollups/WorkoutRollup;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()D
    .locals 2

    iget-wide v0, p0, Lcom/whoop/service/network/model/rollups/WorkoutRollup;->avgStrainTrendDelta:D

    return-wide v0
.end method

.method public final component2()D
    .locals 2

    iget-wide v0, p0, Lcom/whoop/service/network/model/rollups/WorkoutRollup;->workoutCountTrendDelta:D

    return-wide v0
.end method

.method public final component3()D
    .locals 2

    iget-wide v0, p0, Lcom/whoop/service/network/model/rollups/WorkoutRollup;->avgStrainScore:D

    return-wide v0
.end method

.method public final component4()D
    .locals 2

    iget-wide v0, p0, Lcom/whoop/service/network/model/rollups/WorkoutRollup;->maxStrainScore:D

    return-wide v0
.end method

.method public final component5()I
    .locals 1

    iget v0, p0, Lcom/whoop/service/network/model/rollups/WorkoutRollup;->sportId:I

    return v0
.end method

.method public final component6()I
    .locals 1

    iget v0, p0, Lcom/whoop/service/network/model/rollups/WorkoutRollup;->workoutCount:I

    return v0
.end method

.method public final copy(DDDDII)Lcom/whoop/service/network/model/rollups/WorkoutRollup;
    .locals 11

    new-instance v0, Lcom/whoop/service/network/model/rollups/WorkoutRollup;

    move-wide v1, p1

    move-wide v3, p3

    move-wide/from16 v5, p5

    move-wide/from16 v7, p7

    move/from16 v9, p9

    move/from16 v10, p10

    invoke-direct/range {v0 .. v10}, Lcom/whoop/service/network/model/rollups/WorkoutRollup;-><init>(DDDDII)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 7

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/service/network/model/rollups/WorkoutRollup;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/service/network/model/rollups/WorkoutRollup;

    iget-wide v3, p0, Lcom/whoop/service/network/model/rollups/WorkoutRollup;->avgStrainTrendDelta:D

    iget-wide v5, p1, Lcom/whoop/service/network/model/rollups/WorkoutRollup;->avgStrainTrendDelta:D

    invoke-static {v3, v4, v5, v6}, Ljava/lang/Double;->compare(DD)I

    move-result v1

    if-eqz v1, :cond_2

    return v2

    :cond_2
    iget-wide v3, p0, Lcom/whoop/service/network/model/rollups/WorkoutRollup;->workoutCountTrendDelta:D

    iget-wide v5, p1, Lcom/whoop/service/network/model/rollups/WorkoutRollup;->workoutCountTrendDelta:D

    invoke-static {v3, v4, v5, v6}, Ljava/lang/Double;->compare(DD)I

    move-result v1

    if-eqz v1, :cond_3

    return v2

    :cond_3
    iget-wide v3, p0, Lcom/whoop/service/network/model/rollups/WorkoutRollup;->avgStrainScore:D

    iget-wide v5, p1, Lcom/whoop/service/network/model/rollups/WorkoutRollup;->avgStrainScore:D

    invoke-static {v3, v4, v5, v6}, Ljava/lang/Double;->compare(DD)I

    move-result v1

    if-eqz v1, :cond_4

    return v2

    :cond_4
    iget-wide v3, p0, Lcom/whoop/service/network/model/rollups/WorkoutRollup;->maxStrainScore:D

    iget-wide v5, p1, Lcom/whoop/service/network/model/rollups/WorkoutRollup;->maxStrainScore:D

    invoke-static {v3, v4, v5, v6}, Ljava/lang/Double;->compare(DD)I

    move-result v1

    if-eqz v1, :cond_5

    return v2

    :cond_5
    iget v1, p0, Lcom/whoop/service/network/model/rollups/WorkoutRollup;->sportId:I

    iget v3, p1, Lcom/whoop/service/network/model/rollups/WorkoutRollup;->sportId:I

    if-eq v1, v3, :cond_6

    return v2

    :cond_6
    iget v1, p0, Lcom/whoop/service/network/model/rollups/WorkoutRollup;->workoutCount:I

    iget p1, p1, Lcom/whoop/service/network/model/rollups/WorkoutRollup;->workoutCount:I

    if-eq v1, p1, :cond_7

    return v2

    :cond_7
    return v0
.end method

.method public final getAvgStrainScore()D
    .locals 2

    iget-wide v0, p0, Lcom/whoop/service/network/model/rollups/WorkoutRollup;->avgStrainScore:D

    return-wide v0
.end method

.method public final getAvgStrainTrendDelta()D
    .locals 2

    iget-wide v0, p0, Lcom/whoop/service/network/model/rollups/WorkoutRollup;->avgStrainTrendDelta:D

    return-wide v0
.end method

.method public final getMaxStrainScore()D
    .locals 2

    iget-wide v0, p0, Lcom/whoop/service/network/model/rollups/WorkoutRollup;->maxStrainScore:D

    return-wide v0
.end method

.method public final getSportId()I
    .locals 1

    iget v0, p0, Lcom/whoop/service/network/model/rollups/WorkoutRollup;->sportId:I

    return v0
.end method

.method public final getWorkoutCount()I
    .locals 1

    iget v0, p0, Lcom/whoop/service/network/model/rollups/WorkoutRollup;->workoutCount:I

    return v0
.end method

.method public final getWorkoutCountTrendDelta()D
    .locals 2

    iget-wide v0, p0, Lcom/whoop/service/network/model/rollups/WorkoutRollup;->workoutCountTrendDelta:D

    return-wide v0
.end method

.method public hashCode()I
    .locals 4

    iget-wide v0, p0, Lcom/whoop/service/network/model/rollups/WorkoutRollup;->avgStrainTrendDelta:D

    invoke-static {v0, v1}, Ljava/lang/Double;->hashCode(D)I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-wide v2, p0, Lcom/whoop/service/network/model/rollups/WorkoutRollup;->workoutCountTrendDelta:D

    invoke-static {v0, v1, v2, v3}, Lhc3/i;->a(IID)I

    move-result v0

    iget-wide v2, p0, Lcom/whoop/service/network/model/rollups/WorkoutRollup;->avgStrainScore:D

    invoke-static {v0, v1, v2, v3}, Lhc3/i;->a(IID)I

    move-result v0

    iget-wide v2, p0, Lcom/whoop/service/network/model/rollups/WorkoutRollup;->maxStrainScore:D

    invoke-static {v0, v1, v2, v3}, Lhc3/i;->a(IID)I

    move-result v0

    iget v2, p0, Lcom/whoop/service/network/model/rollups/WorkoutRollup;->sportId:I

    invoke-static {v2, v0, v1}, Ld;->b(III)I

    move-result v0

    iget v1, p0, Lcom/whoop/service/network/model/rollups/WorkoutRollup;->workoutCount:I

    invoke-static {v1}, Ljava/lang/Integer;->hashCode(I)I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public toString()Ljava/lang/String;
    .locals 12

    iget-wide v0, p0, Lcom/whoop/service/network/model/rollups/WorkoutRollup;->avgStrainTrendDelta:D

    iget-wide v2, p0, Lcom/whoop/service/network/model/rollups/WorkoutRollup;->workoutCountTrendDelta:D

    iget-wide v4, p0, Lcom/whoop/service/network/model/rollups/WorkoutRollup;->avgStrainScore:D

    iget-wide v6, p0, Lcom/whoop/service/network/model/rollups/WorkoutRollup;->maxStrainScore:D

    iget v8, p0, Lcom/whoop/service/network/model/rollups/WorkoutRollup;->sportId:I

    iget v9, p0, Lcom/whoop/service/network/model/rollups/WorkoutRollup;->workoutCount:I

    const-string v10, "WorkoutRollup(avgStrainTrendDelta="

    const-string v11, ", workoutCountTrendDelta="

    invoke-static {v10, v0, v1, v11}, Lb9/y;->s(Ljava/lang/String;DLjava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v2, v3}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    const-string v1, ", avgStrainScore="

    const-string v2, ", maxStrainScore="

    invoke-static {v0, v1, v4, v5, v2}, Lr80/c;->B(Ljava/lang/StringBuilder;Ljava/lang/String;DLjava/lang/String;)V

    invoke-virtual {v0, v6, v7}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    const-string v1, ", sportId="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v8}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", workoutCount="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, v9}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
