.class public final Lcom/whoop/service/network/model/rollups/SleepRollups;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0006\n\u0002\u0010\u000e\n\u0002\u0008\u0017\n\u0002\u0010\u000b\n\u0002\u0008\u0004\u0008\u0086\u0008\u0018\u00002\u00020\u0001BG\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\u0008\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u000c\u00a2\u0006\u0004\u0008\r\u0010\u000eJ\t\u0010\u001a\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u001b\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u001c\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u001d\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u001e\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u001f\u001a\u00020\u0005H\u00c6\u0003J\t\u0010 \u001a\u00020\u0003H\u00c6\u0003J\t\u0010!\u001a\u00020\u000cH\u00c6\u0003JY\u0010\"\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0008\u001a\u00020\u00052\u0008\u0008\u0002\u0010\t\u001a\u00020\u00052\u0008\u0008\u0002\u0010\n\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u000b\u001a\u00020\u000cH\u00c6\u0001J\u0014\u0010#\u001a\u00020$2\u0008\u0010%\u001a\u0004\u0018\u00010\u0001H\u00d6\u0083\u0004J\n\u0010&\u001a\u00020\u0005H\u00d6\u0081\u0004J\n\u0010\'\u001a\u00020\u000cH\u00d6\u0081\u0004R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000f\u0010\u0010R\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0011\u0010\u0012R\u0016\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0013\u0010\u0012R\u0016\u0010\u0007\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0014\u0010\u0010R\u0016\u0010\u0008\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0015\u0010\u0012R\u0016\u0010\t\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0016\u0010\u0012R\u0016\u0010\n\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0017\u0010\u0010R\u0016\u0010\u000b\u001a\u00020\u000c8\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0018\u0010\u0019\u00a8\u0006("
    }
    d2 = {
        "Lcom/whoop/service/network/model/rollups/SleepRollups;",
        "",
        "avgSleepPerformanceTrendDelta",
        "",
        "avgQualityDuration",
        "",
        "avgSleepNeed",
        "avgSleepPerformance",
        "maxQualityDuration",
        "maxSleepNeed",
        "maxSleepPerformance",
        "updatedAt",
        "",
        "<init>",
        "(DIIDIIDLjava/lang/String;)V",
        "getAvgSleepPerformanceTrendDelta",
        "()D",
        "getAvgQualityDuration",
        "()I",
        "getAvgSleepNeed",
        "getAvgSleepPerformance",
        "getMaxQualityDuration",
        "getMaxSleepNeed",
        "getMaxSleepPerformance",
        "getUpdatedAt",
        "()Ljava/lang/String;",
        "component1",
        "component2",
        "component3",
        "component4",
        "component5",
        "component6",
        "component7",
        "component8",
        "copy",
        "equals",
        "",
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
.field private final avgQualityDuration:I
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "avg_quality_duration"
    .end annotation
.end field

.field private final avgSleepNeed:I
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "avg_sleep_need"
    .end annotation
.end field

.field private final avgSleepPerformance:D
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "avg_sleep_performance"
    .end annotation
.end field

.field private final avgSleepPerformanceTrendDelta:D
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "avg_sleep_performance_trend_delta"
    .end annotation
.end field

.field private final maxQualityDuration:I
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "max_quality_duration"
    .end annotation
.end field

.field private final maxSleepNeed:I
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "max_sleep_need"
    .end annotation
.end field

.field private final maxSleepPerformance:D
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "max_sleep_performance"
    .end annotation
.end field

.field private final updatedAt:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "updated_at"
    .end annotation
.end field


# direct methods
.method public constructor <init>(DIIDIIDLjava/lang/String;)V
    .locals 1

    const-string v0, "updatedAt"

    invoke-static {p11, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-wide p1, p0, Lcom/whoop/service/network/model/rollups/SleepRollups;->avgSleepPerformanceTrendDelta:D

    iput p3, p0, Lcom/whoop/service/network/model/rollups/SleepRollups;->avgQualityDuration:I

    iput p4, p0, Lcom/whoop/service/network/model/rollups/SleepRollups;->avgSleepNeed:I

    iput-wide p5, p0, Lcom/whoop/service/network/model/rollups/SleepRollups;->avgSleepPerformance:D

    iput p7, p0, Lcom/whoop/service/network/model/rollups/SleepRollups;->maxQualityDuration:I

    iput p8, p0, Lcom/whoop/service/network/model/rollups/SleepRollups;->maxSleepNeed:I

    iput-wide p9, p0, Lcom/whoop/service/network/model/rollups/SleepRollups;->maxSleepPerformance:D

    iput-object p11, p0, Lcom/whoop/service/network/model/rollups/SleepRollups;->updatedAt:Ljava/lang/String;

    return-void
.end method

.method public static synthetic copy$default(Lcom/whoop/service/network/model/rollups/SleepRollups;DIIDIIDLjava/lang/String;ILjava/lang/Object;)Lcom/whoop/service/network/model/rollups/SleepRollups;
    .locals 12

    move/from16 v0, p12

    and-int/lit8 v1, v0, 0x1

    if-eqz v1, :cond_0

    iget-wide p1, p0, Lcom/whoop/service/network/model/rollups/SleepRollups;->avgSleepPerformanceTrendDelta:D

    :cond_0
    move-wide v1, p1

    and-int/lit8 p1, v0, 0x2

    if-eqz p1, :cond_1

    iget p3, p0, Lcom/whoop/service/network/model/rollups/SleepRollups;->avgQualityDuration:I

    :cond_1
    move v3, p3

    and-int/lit8 p1, v0, 0x4

    if-eqz p1, :cond_2

    iget p1, p0, Lcom/whoop/service/network/model/rollups/SleepRollups;->avgSleepNeed:I

    move v4, p1

    goto :goto_0

    :cond_2
    move/from16 v4, p4

    :goto_0
    and-int/lit8 p1, v0, 0x8

    if-eqz p1, :cond_3

    iget-wide p1, p0, Lcom/whoop/service/network/model/rollups/SleepRollups;->avgSleepPerformance:D

    move-wide v5, p1

    goto :goto_1

    :cond_3
    move-wide/from16 v5, p5

    :goto_1
    and-int/lit8 p1, v0, 0x10

    if-eqz p1, :cond_4

    iget p1, p0, Lcom/whoop/service/network/model/rollups/SleepRollups;->maxQualityDuration:I

    move v7, p1

    goto :goto_2

    :cond_4
    move/from16 v7, p7

    :goto_2
    and-int/lit8 p1, v0, 0x20

    if-eqz p1, :cond_5

    iget p1, p0, Lcom/whoop/service/network/model/rollups/SleepRollups;->maxSleepNeed:I

    move v8, p1

    goto :goto_3

    :cond_5
    move/from16 v8, p8

    :goto_3
    and-int/lit8 p1, v0, 0x40

    if-eqz p1, :cond_6

    iget-wide p1, p0, Lcom/whoop/service/network/model/rollups/SleepRollups;->maxSleepPerformance:D

    move-wide v9, p1

    goto :goto_4

    :cond_6
    move-wide/from16 v9, p9

    :goto_4
    and-int/lit16 p1, v0, 0x80

    if-eqz p1, :cond_7

    iget-object p1, p0, Lcom/whoop/service/network/model/rollups/SleepRollups;->updatedAt:Ljava/lang/String;

    move-object v11, p1

    :goto_5
    move-object v0, p0

    goto :goto_6

    :cond_7
    move-object/from16 v11, p11

    goto :goto_5

    :goto_6
    invoke-virtual/range {v0 .. v11}, Lcom/whoop/service/network/model/rollups/SleepRollups;->copy(DIIDIIDLjava/lang/String;)Lcom/whoop/service/network/model/rollups/SleepRollups;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()D
    .locals 2

    iget-wide v0, p0, Lcom/whoop/service/network/model/rollups/SleepRollups;->avgSleepPerformanceTrendDelta:D

    return-wide v0
.end method

.method public final component2()I
    .locals 1

    iget v0, p0, Lcom/whoop/service/network/model/rollups/SleepRollups;->avgQualityDuration:I

    return v0
.end method

.method public final component3()I
    .locals 1

    iget v0, p0, Lcom/whoop/service/network/model/rollups/SleepRollups;->avgSleepNeed:I

    return v0
.end method

.method public final component4()D
    .locals 2

    iget-wide v0, p0, Lcom/whoop/service/network/model/rollups/SleepRollups;->avgSleepPerformance:D

    return-wide v0
.end method

.method public final component5()I
    .locals 1

    iget v0, p0, Lcom/whoop/service/network/model/rollups/SleepRollups;->maxQualityDuration:I

    return v0
.end method

.method public final component6()I
    .locals 1

    iget v0, p0, Lcom/whoop/service/network/model/rollups/SleepRollups;->maxSleepNeed:I

    return v0
.end method

.method public final component7()D
    .locals 2

    iget-wide v0, p0, Lcom/whoop/service/network/model/rollups/SleepRollups;->maxSleepPerformance:D

    return-wide v0
.end method

.method public final component8()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/service/network/model/rollups/SleepRollups;->updatedAt:Ljava/lang/String;

    return-object v0
.end method

.method public final copy(DIIDIIDLjava/lang/String;)Lcom/whoop/service/network/model/rollups/SleepRollups;
    .locals 13

    const-string v0, "updatedAt"

    move-object/from16 v12, p11

    invoke-static {v12, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/whoop/service/network/model/rollups/SleepRollups;

    move-wide v2, p1

    move/from16 v4, p3

    move/from16 v5, p4

    move-wide/from16 v6, p5

    move/from16 v8, p7

    move/from16 v9, p8

    move-wide/from16 v10, p9

    invoke-direct/range {v1 .. v12}, Lcom/whoop/service/network/model/rollups/SleepRollups;-><init>(DIIDIIDLjava/lang/String;)V

    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 7

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/service/network/model/rollups/SleepRollups;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/service/network/model/rollups/SleepRollups;

    iget-wide v3, p0, Lcom/whoop/service/network/model/rollups/SleepRollups;->avgSleepPerformanceTrendDelta:D

    iget-wide v5, p1, Lcom/whoop/service/network/model/rollups/SleepRollups;->avgSleepPerformanceTrendDelta:D

    invoke-static {v3, v4, v5, v6}, Ljava/lang/Double;->compare(DD)I

    move-result v1

    if-eqz v1, :cond_2

    return v2

    :cond_2
    iget v1, p0, Lcom/whoop/service/network/model/rollups/SleepRollups;->avgQualityDuration:I

    iget v3, p1, Lcom/whoop/service/network/model/rollups/SleepRollups;->avgQualityDuration:I

    if-eq v1, v3, :cond_3

    return v2

    :cond_3
    iget v1, p0, Lcom/whoop/service/network/model/rollups/SleepRollups;->avgSleepNeed:I

    iget v3, p1, Lcom/whoop/service/network/model/rollups/SleepRollups;->avgSleepNeed:I

    if-eq v1, v3, :cond_4

    return v2

    :cond_4
    iget-wide v3, p0, Lcom/whoop/service/network/model/rollups/SleepRollups;->avgSleepPerformance:D

    iget-wide v5, p1, Lcom/whoop/service/network/model/rollups/SleepRollups;->avgSleepPerformance:D

    invoke-static {v3, v4, v5, v6}, Ljava/lang/Double;->compare(DD)I

    move-result v1

    if-eqz v1, :cond_5

    return v2

    :cond_5
    iget v1, p0, Lcom/whoop/service/network/model/rollups/SleepRollups;->maxQualityDuration:I

    iget v3, p1, Lcom/whoop/service/network/model/rollups/SleepRollups;->maxQualityDuration:I

    if-eq v1, v3, :cond_6

    return v2

    :cond_6
    iget v1, p0, Lcom/whoop/service/network/model/rollups/SleepRollups;->maxSleepNeed:I

    iget v3, p1, Lcom/whoop/service/network/model/rollups/SleepRollups;->maxSleepNeed:I

    if-eq v1, v3, :cond_7

    return v2

    :cond_7
    iget-wide v3, p0, Lcom/whoop/service/network/model/rollups/SleepRollups;->maxSleepPerformance:D

    iget-wide v5, p1, Lcom/whoop/service/network/model/rollups/SleepRollups;->maxSleepPerformance:D

    invoke-static {v3, v4, v5, v6}, Ljava/lang/Double;->compare(DD)I

    move-result v1

    if-eqz v1, :cond_8

    return v2

    :cond_8
    iget-object v1, p0, Lcom/whoop/service/network/model/rollups/SleepRollups;->updatedAt:Ljava/lang/String;

    iget-object p1, p1, Lcom/whoop/service/network/model/rollups/SleepRollups;->updatedAt:Ljava/lang/String;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_9

    return v2

    :cond_9
    return v0
.end method

.method public final getAvgQualityDuration()I
    .locals 1

    iget v0, p0, Lcom/whoop/service/network/model/rollups/SleepRollups;->avgQualityDuration:I

    return v0
.end method

.method public final getAvgSleepNeed()I
    .locals 1

    iget v0, p0, Lcom/whoop/service/network/model/rollups/SleepRollups;->avgSleepNeed:I

    return v0
.end method

.method public final getAvgSleepPerformance()D
    .locals 2

    iget-wide v0, p0, Lcom/whoop/service/network/model/rollups/SleepRollups;->avgSleepPerformance:D

    return-wide v0
.end method

.method public final getAvgSleepPerformanceTrendDelta()D
    .locals 2

    iget-wide v0, p0, Lcom/whoop/service/network/model/rollups/SleepRollups;->avgSleepPerformanceTrendDelta:D

    return-wide v0
.end method

.method public final getMaxQualityDuration()I
    .locals 1

    iget v0, p0, Lcom/whoop/service/network/model/rollups/SleepRollups;->maxQualityDuration:I

    return v0
.end method

.method public final getMaxSleepNeed()I
    .locals 1

    iget v0, p0, Lcom/whoop/service/network/model/rollups/SleepRollups;->maxSleepNeed:I

    return v0
.end method

.method public final getMaxSleepPerformance()D
    .locals 2

    iget-wide v0, p0, Lcom/whoop/service/network/model/rollups/SleepRollups;->maxSleepPerformance:D

    return-wide v0
.end method

.method public final getUpdatedAt()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/service/network/model/rollups/SleepRollups;->updatedAt:Ljava/lang/String;

    return-object v0
.end method

.method public hashCode()I
    .locals 4

    iget-wide v0, p0, Lcom/whoop/service/network/model/rollups/SleepRollups;->avgSleepPerformanceTrendDelta:D

    invoke-static {v0, v1}, Ljava/lang/Double;->hashCode(D)I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget v2, p0, Lcom/whoop/service/network/model/rollups/SleepRollups;->avgQualityDuration:I

    invoke-static {v2, v0, v1}, Ld;->b(III)I

    move-result v0

    iget v2, p0, Lcom/whoop/service/network/model/rollups/SleepRollups;->avgSleepNeed:I

    invoke-static {v2, v0, v1}, Ld;->b(III)I

    move-result v0

    iget-wide v2, p0, Lcom/whoop/service/network/model/rollups/SleepRollups;->avgSleepPerformance:D

    invoke-static {v0, v1, v2, v3}, Lhc3/i;->a(IID)I

    move-result v0

    iget v2, p0, Lcom/whoop/service/network/model/rollups/SleepRollups;->maxQualityDuration:I

    invoke-static {v2, v0, v1}, Ld;->b(III)I

    move-result v0

    iget v2, p0, Lcom/whoop/service/network/model/rollups/SleepRollups;->maxSleepNeed:I

    invoke-static {v2, v0, v1}, Ld;->b(III)I

    move-result v0

    iget-wide v2, p0, Lcom/whoop/service/network/model/rollups/SleepRollups;->maxSleepPerformance:D

    invoke-static {v0, v1, v2, v3}, Lhc3/i;->a(IID)I

    move-result v0

    iget-object v1, p0, Lcom/whoop/service/network/model/rollups/SleepRollups;->updatedAt:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public toString()Ljava/lang/String;
    .locals 13

    iget-wide v0, p0, Lcom/whoop/service/network/model/rollups/SleepRollups;->avgSleepPerformanceTrendDelta:D

    iget v2, p0, Lcom/whoop/service/network/model/rollups/SleepRollups;->avgQualityDuration:I

    iget v3, p0, Lcom/whoop/service/network/model/rollups/SleepRollups;->avgSleepNeed:I

    iget-wide v4, p0, Lcom/whoop/service/network/model/rollups/SleepRollups;->avgSleepPerformance:D

    iget v6, p0, Lcom/whoop/service/network/model/rollups/SleepRollups;->maxQualityDuration:I

    iget v7, p0, Lcom/whoop/service/network/model/rollups/SleepRollups;->maxSleepNeed:I

    iget-wide v8, p0, Lcom/whoop/service/network/model/rollups/SleepRollups;->maxSleepPerformance:D

    iget-object v10, p0, Lcom/whoop/service/network/model/rollups/SleepRollups;->updatedAt:Ljava/lang/String;

    new-instance v11, Ljava/lang/StringBuilder;

    const-string v12, "SleepRollups(avgSleepPerformanceTrendDelta="

    invoke-direct {v11, v12}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v11, v0, v1}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    const-string v0, ", avgQualityDuration="

    invoke-virtual {v11, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ", avgSleepNeed="

    invoke-virtual {v11, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ", avgSleepPerformance="

    invoke-virtual {v11, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11, v4, v5}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    const-string v0, ", maxQualityDuration="

    invoke-virtual {v11, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ", maxSleepNeed="

    invoke-virtual {v11, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ", maxSleepPerformance="

    invoke-virtual {v11, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11, v8, v9}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    const-string v0, ", updatedAt="

    invoke-virtual {v11, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v11, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
