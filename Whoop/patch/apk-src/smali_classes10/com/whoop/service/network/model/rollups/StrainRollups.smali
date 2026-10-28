.class public final Lcom/whoop/service/network/model/rollups/StrainRollups;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0006\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0011\n\u0002\u0010\u000b\n\u0002\u0008\u0004\u0008\u0086\u0008\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u0012\u0006\u0010\u0008\u001a\u00020\t\u00a2\u0006\u0004\u0008\n\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0015\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0016\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0017\u001a\u00020\u0007H\u00c6\u0003J\t\u0010\u0018\u001a\u00020\tH\u00c6\u0003J;\u0010\u0019\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u00072\u0008\u0008\u0002\u0010\u0008\u001a\u00020\tH\u00c6\u0001J\u0014\u0010\u001a\u001a\u00020\u001b2\u0008\u0010\u001c\u001a\u0004\u0018\u00010\u0001H\u00d6\u0083\u0004J\n\u0010\u001d\u001a\u00020\u0007H\u00d6\u0081\u0004J\n\u0010\u001e\u001a\u00020\tH\u00d6\u0081\u0004R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000c\u0010\rR\u0016\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000e\u0010\rR\u0016\u0010\u0005\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000f\u0010\rR\u0016\u0010\u0006\u001a\u00020\u00078\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0010\u0010\u0011R\u0016\u0010\u0008\u001a\u00020\t8\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0012\u0010\u0013\u00a8\u0006\u001f"
    }
    d2 = {
        "Lcom/whoop/service/network/model/rollups/StrainRollups;",
        "",
        "avgDayStrainTrendDelta",
        "",
        "avgDayStrain",
        "maxDayStrain",
        "maxHeartRate",
        "",
        "updatedAt",
        "",
        "<init>",
        "(DDDILjava/lang/String;)V",
        "getAvgDayStrainTrendDelta",
        "()D",
        "getAvgDayStrain",
        "getMaxDayStrain",
        "getMaxHeartRate",
        "()I",
        "getUpdatedAt",
        "()Ljava/lang/String;",
        "component1",
        "component2",
        "component3",
        "component4",
        "component5",
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
.field private final avgDayStrain:D
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "avg_day_strain"
    .end annotation
.end field

.field private final avgDayStrainTrendDelta:D
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "avg_day_strain_trend_delta"
    .end annotation
.end field

.field private final maxDayStrain:D
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "max_day_strain"
    .end annotation
.end field

.field private final maxHeartRate:I
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "max_heart_rate"
    .end annotation
.end field

.field private final updatedAt:Ljava/lang/String;
    .annotation runtime Lcom/google/gson/annotations/SerializedName;
        value = "updated_at"
    .end annotation
.end field


# direct methods
.method public constructor <init>(DDDILjava/lang/String;)V
    .locals 1

    const-string v0, "updatedAt"

    invoke-static {p8, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-wide p1, p0, Lcom/whoop/service/network/model/rollups/StrainRollups;->avgDayStrainTrendDelta:D

    iput-wide p3, p0, Lcom/whoop/service/network/model/rollups/StrainRollups;->avgDayStrain:D

    iput-wide p5, p0, Lcom/whoop/service/network/model/rollups/StrainRollups;->maxDayStrain:D

    iput p7, p0, Lcom/whoop/service/network/model/rollups/StrainRollups;->maxHeartRate:I

    iput-object p8, p0, Lcom/whoop/service/network/model/rollups/StrainRollups;->updatedAt:Ljava/lang/String;

    return-void
.end method

.method public static synthetic copy$default(Lcom/whoop/service/network/model/rollups/StrainRollups;DDDILjava/lang/String;ILjava/lang/Object;)Lcom/whoop/service/network/model/rollups/StrainRollups;
    .locals 9

    and-int/lit8 v0, p9, 0x1

    if-eqz v0, :cond_0

    iget-wide p1, p0, Lcom/whoop/service/network/model/rollups/StrainRollups;->avgDayStrainTrendDelta:D

    :cond_0
    move-wide v1, p1

    and-int/lit8 p1, p9, 0x2

    if-eqz p1, :cond_1

    iget-wide p3, p0, Lcom/whoop/service/network/model/rollups/StrainRollups;->avgDayStrain:D

    :cond_1
    move-wide v3, p3

    and-int/lit8 p1, p9, 0x4

    if-eqz p1, :cond_2

    iget-wide p5, p0, Lcom/whoop/service/network/model/rollups/StrainRollups;->maxDayStrain:D

    :cond_2
    move-wide v5, p5

    and-int/lit8 p1, p9, 0x8

    if-eqz p1, :cond_3

    iget p1, p0, Lcom/whoop/service/network/model/rollups/StrainRollups;->maxHeartRate:I

    move v7, p1

    goto :goto_0

    :cond_3
    move/from16 v7, p7

    :goto_0
    and-int/lit8 p1, p9, 0x10

    if-eqz p1, :cond_4

    iget-object p1, p0, Lcom/whoop/service/network/model/rollups/StrainRollups;->updatedAt:Ljava/lang/String;

    move-object v8, p1

    :goto_1
    move-object v0, p0

    goto :goto_2

    :cond_4
    move-object/from16 v8, p8

    goto :goto_1

    :goto_2
    invoke-virtual/range {v0 .. v8}, Lcom/whoop/service/network/model/rollups/StrainRollups;->copy(DDDILjava/lang/String;)Lcom/whoop/service/network/model/rollups/StrainRollups;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()D
    .locals 2

    iget-wide v0, p0, Lcom/whoop/service/network/model/rollups/StrainRollups;->avgDayStrainTrendDelta:D

    return-wide v0
.end method

.method public final component2()D
    .locals 2

    iget-wide v0, p0, Lcom/whoop/service/network/model/rollups/StrainRollups;->avgDayStrain:D

    return-wide v0
.end method

.method public final component3()D
    .locals 2

    iget-wide v0, p0, Lcom/whoop/service/network/model/rollups/StrainRollups;->maxDayStrain:D

    return-wide v0
.end method

.method public final component4()I
    .locals 1

    iget v0, p0, Lcom/whoop/service/network/model/rollups/StrainRollups;->maxHeartRate:I

    return v0
.end method

.method public final component5()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/service/network/model/rollups/StrainRollups;->updatedAt:Ljava/lang/String;

    return-object v0
.end method

.method public final copy(DDDILjava/lang/String;)Lcom/whoop/service/network/model/rollups/StrainRollups;
    .locals 10

    const-string v0, "updatedAt"

    move-object/from16 v9, p8

    invoke-static {v9, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lcom/whoop/service/network/model/rollups/StrainRollups;

    move-wide v2, p1

    move-wide v4, p3

    move-wide v6, p5

    move/from16 v8, p7

    invoke-direct/range {v1 .. v9}, Lcom/whoop/service/network/model/rollups/StrainRollups;-><init>(DDDILjava/lang/String;)V

    return-object v1
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 7

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/service/network/model/rollups/StrainRollups;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/service/network/model/rollups/StrainRollups;

    iget-wide v3, p0, Lcom/whoop/service/network/model/rollups/StrainRollups;->avgDayStrainTrendDelta:D

    iget-wide v5, p1, Lcom/whoop/service/network/model/rollups/StrainRollups;->avgDayStrainTrendDelta:D

    invoke-static {v3, v4, v5, v6}, Ljava/lang/Double;->compare(DD)I

    move-result v1

    if-eqz v1, :cond_2

    return v2

    :cond_2
    iget-wide v3, p0, Lcom/whoop/service/network/model/rollups/StrainRollups;->avgDayStrain:D

    iget-wide v5, p1, Lcom/whoop/service/network/model/rollups/StrainRollups;->avgDayStrain:D

    invoke-static {v3, v4, v5, v6}, Ljava/lang/Double;->compare(DD)I

    move-result v1

    if-eqz v1, :cond_3

    return v2

    :cond_3
    iget-wide v3, p0, Lcom/whoop/service/network/model/rollups/StrainRollups;->maxDayStrain:D

    iget-wide v5, p1, Lcom/whoop/service/network/model/rollups/StrainRollups;->maxDayStrain:D

    invoke-static {v3, v4, v5, v6}, Ljava/lang/Double;->compare(DD)I

    move-result v1

    if-eqz v1, :cond_4

    return v2

    :cond_4
    iget v1, p0, Lcom/whoop/service/network/model/rollups/StrainRollups;->maxHeartRate:I

    iget v3, p1, Lcom/whoop/service/network/model/rollups/StrainRollups;->maxHeartRate:I

    if-eq v1, v3, :cond_5

    return v2

    :cond_5
    iget-object v1, p0, Lcom/whoop/service/network/model/rollups/StrainRollups;->updatedAt:Ljava/lang/String;

    iget-object p1, p1, Lcom/whoop/service/network/model/rollups/StrainRollups;->updatedAt:Ljava/lang/String;

    invoke-static {v1, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-nez p1, :cond_6

    return v2

    :cond_6
    return v0
.end method

.method public final getAvgDayStrain()D
    .locals 2

    iget-wide v0, p0, Lcom/whoop/service/network/model/rollups/StrainRollups;->avgDayStrain:D

    return-wide v0
.end method

.method public final getAvgDayStrainTrendDelta()D
    .locals 2

    iget-wide v0, p0, Lcom/whoop/service/network/model/rollups/StrainRollups;->avgDayStrainTrendDelta:D

    return-wide v0
.end method

.method public final getMaxDayStrain()D
    .locals 2

    iget-wide v0, p0, Lcom/whoop/service/network/model/rollups/StrainRollups;->maxDayStrain:D

    return-wide v0
.end method

.method public final getMaxHeartRate()I
    .locals 1

    iget v0, p0, Lcom/whoop/service/network/model/rollups/StrainRollups;->maxHeartRate:I

    return v0
.end method

.method public final getUpdatedAt()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/service/network/model/rollups/StrainRollups;->updatedAt:Ljava/lang/String;

    return-object v0
.end method

.method public hashCode()I
    .locals 4

    iget-wide v0, p0, Lcom/whoop/service/network/model/rollups/StrainRollups;->avgDayStrainTrendDelta:D

    invoke-static {v0, v1}, Ljava/lang/Double;->hashCode(D)I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-wide v2, p0, Lcom/whoop/service/network/model/rollups/StrainRollups;->avgDayStrain:D

    invoke-static {v0, v1, v2, v3}, Lhc3/i;->a(IID)I

    move-result v0

    iget-wide v2, p0, Lcom/whoop/service/network/model/rollups/StrainRollups;->maxDayStrain:D

    invoke-static {v0, v1, v2, v3}, Lhc3/i;->a(IID)I

    move-result v0

    iget v2, p0, Lcom/whoop/service/network/model/rollups/StrainRollups;->maxHeartRate:I

    invoke-static {v2, v0, v1}, Ld;->b(III)I

    move-result v0

    iget-object v1, p0, Lcom/whoop/service/network/model/rollups/StrainRollups;->updatedAt:Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public toString()Ljava/lang/String;
    .locals 10

    iget-wide v0, p0, Lcom/whoop/service/network/model/rollups/StrainRollups;->avgDayStrainTrendDelta:D

    iget-wide v2, p0, Lcom/whoop/service/network/model/rollups/StrainRollups;->avgDayStrain:D

    iget-wide v4, p0, Lcom/whoop/service/network/model/rollups/StrainRollups;->maxDayStrain:D

    iget v6, p0, Lcom/whoop/service/network/model/rollups/StrainRollups;->maxHeartRate:I

    iget-object v7, p0, Lcom/whoop/service/network/model/rollups/StrainRollups;->updatedAt:Ljava/lang/String;

    const-string v8, "StrainRollups(avgDayStrainTrendDelta="

    const-string v9, ", avgDayStrain="

    invoke-static {v8, v0, v1, v9}, Lb9/y;->s(Ljava/lang/String;DLjava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v0

    invoke-virtual {v0, v2, v3}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    const-string v1, ", maxDayStrain="

    const-string v2, ", maxHeartRate="

    invoke-static {v0, v1, v4, v5, v2}, Lr80/c;->B(Ljava/lang/StringBuilder;Ljava/lang/String;DLjava/lang/String;)V

    const-string v1, ", updatedAt="

    const-string v2, ")"

    invoke-static {v6, v1, v7, v2, v0}, Ly00/t7;->f(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/StringBuilder;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
