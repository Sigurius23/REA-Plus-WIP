.class public final Lcom/whoop/data/local/room/entity/OptimalStrainMapping;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u0006\n\u0002\u0008\u0003\n\u0002\u0010\t\n\u0002\u0008\u000b\n\u0002\u0018\u0002\n\u0002\u0008\u0007\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0000\u0008\u0087\u0008\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\u0008\u001a\u00020\t\u00a2\u0006\u0004\u0008\n\u0010\u000bJ\u0006\u0010\u0014\u001a\u00020\u0015J\t\u0010\u0016\u001a\u00020\u0003H\u00c6\u0003J\t\u0010\u0017\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u0018\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u0019\u001a\u00020\u0005H\u00c6\u0003J\t\u0010\u001a\u001a\u00020\tH\u00c6\u0003J;\u0010\u001b\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u0008\u001a\u00020\tH\u00c6\u0001J\u0014\u0010\u001c\u001a\u00020\u001d2\u0008\u0010\u001e\u001a\u0004\u0018\u00010\u0001H\u00d6\u0083\u0004J\n\u0010\u001f\u001a\u00020\u0003H\u00d6\u0081\u0004J\n\u0010 \u001a\u00020!H\u00d6\u0081\u0004R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000c\u0010\rR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u000e\u0010\u000fR\u0016\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0010\u0010\u000fR\u0016\u0010\u0007\u001a\u00020\u00058\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0011\u0010\u000fR\u0016\u0010\u0008\u001a\u00020\t8\u0006X\u0087\u0004\u00a2\u0006\u0008\n\u0000\u001a\u0004\u0008\u0012\u0010\u0013\u00a8\u0006\""
    }
    d2 = {
        "Lcom/whoop/data/local/room/entity/OptimalStrainMapping;",
        "",
        "recovery",
        "",
        "lowerOptimalStrain",
        "",
        "optimalStrain",
        "upperOptimalStrain",
        "cycleId",
        "",
        "<init>",
        "(IDDDJ)V",
        "getRecovery",
        "()I",
        "getLowerOptimalStrain",
        "()D",
        "getOptimalStrain",
        "getUpperOptimalStrain",
        "getCycleId",
        "()J",
        "toStrainRecoveryMapping",
        "Lcom/whoop/domain/model/StrainRecoveryMapping;",
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
.field private final cycleId:J

.field private final lowerOptimalStrain:D

.field private final optimalStrain:D

.field private final recovery:I

.field private final upperOptimalStrain:D


# direct methods
.method public constructor <init>(IDDDJ)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lcom/whoop/data/local/room/entity/OptimalStrainMapping;->recovery:I

    iput-wide p2, p0, Lcom/whoop/data/local/room/entity/OptimalStrainMapping;->lowerOptimalStrain:D

    iput-wide p4, p0, Lcom/whoop/data/local/room/entity/OptimalStrainMapping;->optimalStrain:D

    iput-wide p6, p0, Lcom/whoop/data/local/room/entity/OptimalStrainMapping;->upperOptimalStrain:D

    iput-wide p8, p0, Lcom/whoop/data/local/room/entity/OptimalStrainMapping;->cycleId:J

    return-void
.end method

.method public static synthetic copy$default(Lcom/whoop/data/local/room/entity/OptimalStrainMapping;IDDDJILjava/lang/Object;)Lcom/whoop/data/local/room/entity/OptimalStrainMapping;
    .locals 0

    and-int/lit8 p11, p10, 0x1

    if-eqz p11, :cond_0

    iget p1, p0, Lcom/whoop/data/local/room/entity/OptimalStrainMapping;->recovery:I

    :cond_0
    and-int/lit8 p11, p10, 0x2

    if-eqz p11, :cond_1

    iget-wide p2, p0, Lcom/whoop/data/local/room/entity/OptimalStrainMapping;->lowerOptimalStrain:D

    :cond_1
    and-int/lit8 p11, p10, 0x4

    if-eqz p11, :cond_2

    iget-wide p4, p0, Lcom/whoop/data/local/room/entity/OptimalStrainMapping;->optimalStrain:D

    :cond_2
    and-int/lit8 p11, p10, 0x8

    if-eqz p11, :cond_3

    iget-wide p6, p0, Lcom/whoop/data/local/room/entity/OptimalStrainMapping;->upperOptimalStrain:D

    :cond_3
    and-int/lit8 p10, p10, 0x10

    if-eqz p10, :cond_4

    iget-wide p8, p0, Lcom/whoop/data/local/room/entity/OptimalStrainMapping;->cycleId:J

    :cond_4
    move-wide p10, p8

    move-wide p8, p6

    move-wide p6, p4

    move-wide p4, p2

    move-object p2, p0

    move p3, p1

    invoke-virtual/range {p2 .. p11}, Lcom/whoop/data/local/room/entity/OptimalStrainMapping;->copy(IDDDJ)Lcom/whoop/data/local/room/entity/OptimalStrainMapping;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public final component1()I
    .locals 1

    iget v0, p0, Lcom/whoop/data/local/room/entity/OptimalStrainMapping;->recovery:I

    return v0
.end method

.method public final component2()D
    .locals 2

    iget-wide v0, p0, Lcom/whoop/data/local/room/entity/OptimalStrainMapping;->lowerOptimalStrain:D

    return-wide v0
.end method

.method public final component3()D
    .locals 2

    iget-wide v0, p0, Lcom/whoop/data/local/room/entity/OptimalStrainMapping;->optimalStrain:D

    return-wide v0
.end method

.method public final component4()D
    .locals 2

    iget-wide v0, p0, Lcom/whoop/data/local/room/entity/OptimalStrainMapping;->upperOptimalStrain:D

    return-wide v0
.end method

.method public final component5()J
    .locals 2

    iget-wide v0, p0, Lcom/whoop/data/local/room/entity/OptimalStrainMapping;->cycleId:J

    return-wide v0
.end method

.method public final copy(IDDDJ)Lcom/whoop/data/local/room/entity/OptimalStrainMapping;
    .locals 10

    new-instance v0, Lcom/whoop/data/local/room/entity/OptimalStrainMapping;

    move v1, p1

    move-wide v2, p2

    move-wide v4, p4

    move-wide/from16 v6, p6

    move-wide/from16 v8, p8

    invoke-direct/range {v0 .. v9}, Lcom/whoop/data/local/room/entity/OptimalStrainMapping;-><init>(IDDDJ)V

    return-object v0
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 7

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/data/local/room/entity/OptimalStrainMapping;

    const/4 v2, 0x0

    if-nez v1, :cond_1

    return v2

    :cond_1
    check-cast p1, Lcom/whoop/data/local/room/entity/OptimalStrainMapping;

    iget v1, p0, Lcom/whoop/data/local/room/entity/OptimalStrainMapping;->recovery:I

    iget v3, p1, Lcom/whoop/data/local/room/entity/OptimalStrainMapping;->recovery:I

    if-eq v1, v3, :cond_2

    return v2

    :cond_2
    iget-wide v3, p0, Lcom/whoop/data/local/room/entity/OptimalStrainMapping;->lowerOptimalStrain:D

    iget-wide v5, p1, Lcom/whoop/data/local/room/entity/OptimalStrainMapping;->lowerOptimalStrain:D

    invoke-static {v3, v4, v5, v6}, Ljava/lang/Double;->compare(DD)I

    move-result v1

    if-eqz v1, :cond_3

    return v2

    :cond_3
    iget-wide v3, p0, Lcom/whoop/data/local/room/entity/OptimalStrainMapping;->optimalStrain:D

    iget-wide v5, p1, Lcom/whoop/data/local/room/entity/OptimalStrainMapping;->optimalStrain:D

    invoke-static {v3, v4, v5, v6}, Ljava/lang/Double;->compare(DD)I

    move-result v1

    if-eqz v1, :cond_4

    return v2

    :cond_4
    iget-wide v3, p0, Lcom/whoop/data/local/room/entity/OptimalStrainMapping;->upperOptimalStrain:D

    iget-wide v5, p1, Lcom/whoop/data/local/room/entity/OptimalStrainMapping;->upperOptimalStrain:D

    invoke-static {v3, v4, v5, v6}, Ljava/lang/Double;->compare(DD)I

    move-result v1

    if-eqz v1, :cond_5

    return v2

    :cond_5
    iget-wide v3, p0, Lcom/whoop/data/local/room/entity/OptimalStrainMapping;->cycleId:J

    iget-wide v5, p1, Lcom/whoop/data/local/room/entity/OptimalStrainMapping;->cycleId:J

    cmp-long p1, v3, v5

    if-eqz p1, :cond_6

    return v2

    :cond_6
    return v0
.end method

.method public final getCycleId()J
    .locals 2

    iget-wide v0, p0, Lcom/whoop/data/local/room/entity/OptimalStrainMapping;->cycleId:J

    return-wide v0
.end method

.method public final getLowerOptimalStrain()D
    .locals 2

    iget-wide v0, p0, Lcom/whoop/data/local/room/entity/OptimalStrainMapping;->lowerOptimalStrain:D

    return-wide v0
.end method

.method public final getOptimalStrain()D
    .locals 2

    iget-wide v0, p0, Lcom/whoop/data/local/room/entity/OptimalStrainMapping;->optimalStrain:D

    return-wide v0
.end method

.method public final getRecovery()I
    .locals 1

    iget v0, p0, Lcom/whoop/data/local/room/entity/OptimalStrainMapping;->recovery:I

    return v0
.end method

.method public final getUpperOptimalStrain()D
    .locals 2

    iget-wide v0, p0, Lcom/whoop/data/local/room/entity/OptimalStrainMapping;->upperOptimalStrain:D

    return-wide v0
.end method

.method public hashCode()I
    .locals 4

    iget v0, p0, Lcom/whoop/data/local/room/entity/OptimalStrainMapping;->recovery:I

    invoke-static {v0}, Ljava/lang/Integer;->hashCode(I)I

    move-result v0

    const/16 v1, 0x1f

    mul-int/2addr v0, v1

    iget-wide v2, p0, Lcom/whoop/data/local/room/entity/OptimalStrainMapping;->lowerOptimalStrain:D

    invoke-static {v0, v1, v2, v3}, Lhc3/i;->a(IID)I

    move-result v0

    iget-wide v2, p0, Lcom/whoop/data/local/room/entity/OptimalStrainMapping;->optimalStrain:D

    invoke-static {v0, v1, v2, v3}, Lhc3/i;->a(IID)I

    move-result v0

    iget-wide v2, p0, Lcom/whoop/data/local/room/entity/OptimalStrainMapping;->upperOptimalStrain:D

    invoke-static {v0, v1, v2, v3}, Lhc3/i;->a(IID)I

    move-result v0

    iget-wide v1, p0, Lcom/whoop/data/local/room/entity/OptimalStrainMapping;->cycleId:J

    invoke-static {v1, v2}, Ljava/lang/Long;->hashCode(J)I

    move-result v1

    add-int/2addr v1, v0

    return v1
.end method

.method public final toStrainRecoveryMapping()Lcom/whoop/domain/model/StrainRecoveryMapping;
    .locals 8

    new-instance v0, Lcom/whoop/domain/model/StrainRecoveryMapping;

    iget v1, p0, Lcom/whoop/data/local/room/entity/OptimalStrainMapping;->recovery:I

    iget-wide v2, p0, Lcom/whoop/data/local/room/entity/OptimalStrainMapping;->lowerOptimalStrain:D

    iget-wide v4, p0, Lcom/whoop/data/local/room/entity/OptimalStrainMapping;->optimalStrain:D

    iget-wide v6, p0, Lcom/whoop/data/local/room/entity/OptimalStrainMapping;->upperOptimalStrain:D

    invoke-direct/range {v0 .. v7}, Lcom/whoop/domain/model/StrainRecoveryMapping;-><init>(IDDD)V

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 11

    iget v0, p0, Lcom/whoop/data/local/room/entity/OptimalStrainMapping;->recovery:I

    iget-wide v1, p0, Lcom/whoop/data/local/room/entity/OptimalStrainMapping;->lowerOptimalStrain:D

    iget-wide v3, p0, Lcom/whoop/data/local/room/entity/OptimalStrainMapping;->optimalStrain:D

    iget-wide v5, p0, Lcom/whoop/data/local/room/entity/OptimalStrainMapping;->upperOptimalStrain:D

    iget-wide v7, p0, Lcom/whoop/data/local/room/entity/OptimalStrainMapping;->cycleId:J

    new-instance v9, Ljava/lang/StringBuilder;

    const-string v10, "OptimalStrainMapping(recovery="

    invoke-direct {v9, v10}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v0, ", lowerOptimalStrain="

    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v1, v2}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    const-string v0, ", optimalStrain="

    const-string v1, ", upperOptimalStrain="

    invoke-static {v9, v0, v3, v4, v1}, Lr80/c;->B(Ljava/lang/StringBuilder;Ljava/lang/String;DLjava/lang/String;)V

    invoke-virtual {v9, v5, v6}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    const-string v0, ", cycleId="

    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9, v7, v8}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v0, ")"

    invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
