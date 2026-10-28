.class public final Lcom/whoop/analytics/strain/model/Calories;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/whoop/analytics/strain/model/CaloriesIF;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/analytics/strain/model/Calories$Builder;,
        Lcom/whoop/analytics/strain/model/Calories$Json;
    }
.end annotation

.annotation build Ledu/umd/cs/findbugs/annotations/SuppressFBWarnings;
.end annotation


# instance fields
.field private final totalKilocalories:D

.field private final totalKilojoules:D


# direct methods
.method private constructor <init>(DD)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput-wide p1, p0, Lcom/whoop/analytics/strain/model/Calories;->totalKilocalories:D

    .line 4
    iput-wide p3, p0, Lcom/whoop/analytics/strain/model/Calories;->totalKilojoules:D

    return-void
.end method

.method public synthetic constructor <init>(DDLcom/whoop/analytics/strain/model/Calories$1;)V
    .locals 0

    .line 1
    invoke-direct {p0, p1, p2, p3, p4}, Lcom/whoop/analytics/strain/model/Calories;-><init>(DD)V

    return-void
.end method

.method public static builder()Lcom/whoop/analytics/strain/model/Calories$Builder;
    .locals 2

    new-instance v0, Lcom/whoop/analytics/strain/model/Calories$Builder;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/analytics/strain/model/Calories$Builder;-><init>(Lcom/whoop/analytics/strain/model/Calories$1;)V

    return-object v0
.end method

.method public static copyOf(Lcom/whoop/analytics/strain/model/CaloriesIF;)Lcom/whoop/analytics/strain/model/Calories;
    .locals 1

    instance-of v0, p0, Lcom/whoop/analytics/strain/model/Calories;

    if-eqz v0, :cond_0

    check-cast p0, Lcom/whoop/analytics/strain/model/Calories;

    return-object p0

    :cond_0
    invoke-static {}, Lcom/whoop/analytics/strain/model/Calories;->builder()Lcom/whoop/analytics/strain/model/Calories$Builder;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/whoop/analytics/strain/model/Calories$Builder;->from(Lcom/whoop/analytics/strain/model/CaloriesIF;)Lcom/whoop/analytics/strain/model/Calories$Builder;

    move-result-object p0

    invoke-virtual {p0}, Lcom/whoop/analytics/strain/model/Calories$Builder;->build()Lcom/whoop/analytics/strain/model/Calories;

    move-result-object p0

    return-object p0
.end method

.method private equalTo(Lcom/whoop/analytics/strain/model/Calories;)Z
    .locals 4

    iget-wide v0, p0, Lcom/whoop/analytics/strain/model/Calories;->totalKilocalories:D

    invoke-static {v0, v1}, Ljava/lang/Double;->doubleToLongBits(D)J

    move-result-wide v0

    iget-wide v2, p1, Lcom/whoop/analytics/strain/model/Calories;->totalKilocalories:D

    invoke-static {v2, v3}, Ljava/lang/Double;->doubleToLongBits(D)J

    move-result-wide v2

    cmp-long v0, v0, v2

    if-nez v0, :cond_0

    iget-wide v0, p0, Lcom/whoop/analytics/strain/model/Calories;->totalKilojoules:D

    invoke-static {v0, v1}, Ljava/lang/Double;->doubleToLongBits(D)J

    move-result-wide v0

    iget-wide v2, p1, Lcom/whoop/analytics/strain/model/Calories;->totalKilojoules:D

    invoke-static {v2, v3}, Ljava/lang/Double;->doubleToLongBits(D)J

    move-result-wide v2

    cmp-long p1, v0, v2

    if-nez p1, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method

.method public static fromJson(Lcom/whoop/analytics/strain/model/Calories$Json;)Lcom/whoop/analytics/strain/model/Calories;
    .locals 3
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonCreator;
        mode = .enum Lcom/fasterxml/jackson/annotation/JsonCreator$Mode;->DELEGATING:Lcom/fasterxml/jackson/annotation/JsonCreator$Mode;
    .end annotation

    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    invoke-static {}, Lcom/whoop/analytics/strain/model/Calories;->builder()Lcom/whoop/analytics/strain/model/Calories$Builder;

    move-result-object v0

    iget-boolean v1, p0, Lcom/whoop/analytics/strain/model/Calories$Json;->totalKilocaloriesIsSet:Z

    if-eqz v1, :cond_0

    iget-wide v1, p0, Lcom/whoop/analytics/strain/model/Calories$Json;->totalKilocalories:D

    invoke-virtual {v0, v1, v2}, Lcom/whoop/analytics/strain/model/Calories$Builder;->setTotalKilocalories(D)Lcom/whoop/analytics/strain/model/Calories$Builder;

    :cond_0
    iget-boolean v1, p0, Lcom/whoop/analytics/strain/model/Calories$Json;->totalKilojoulesIsSet:Z

    if-eqz v1, :cond_1

    iget-wide v1, p0, Lcom/whoop/analytics/strain/model/Calories$Json;->totalKilojoules:D

    invoke-virtual {v0, v1, v2}, Lcom/whoop/analytics/strain/model/Calories$Builder;->setTotalKilojoules(D)Lcom/whoop/analytics/strain/model/Calories$Builder;

    :cond_1
    invoke-virtual {v0}, Lcom/whoop/analytics/strain/model/Calories$Builder;->build()Lcom/whoop/analytics/strain/model/Calories;

    move-result-object p0

    return-object p0
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 2

    const/4 v0, 0x1

    if-ne p0, p1, :cond_0

    return v0

    :cond_0
    instance-of v1, p1, Lcom/whoop/analytics/strain/model/Calories;

    if-eqz v1, :cond_1

    check-cast p1, Lcom/whoop/analytics/strain/model/Calories;

    invoke-direct {p0, p1}, Lcom/whoop/analytics/strain/model/Calories;->equalTo(Lcom/whoop/analytics/strain/model/Calories;)Z

    move-result p1

    if-eqz p1, :cond_1

    return v0

    :cond_1
    const/4 p1, 0x0

    return p1
.end method

.method public getTotalKilocalories()D
    .locals 2
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
    .end annotation

    iget-wide v0, p0, Lcom/whoop/analytics/strain/model/Calories;->totalKilocalories:D

    return-wide v0
.end method

.method public getTotalKilojoules()D
    .locals 2
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
    .end annotation

    iget-wide v0, p0, Lcom/whoop/analytics/strain/model/Calories;->totalKilojoules:D

    return-wide v0
.end method

.method public hashCode()I
    .locals 4

    iget-wide v0, p0, Lcom/whoop/analytics/strain/model/Calories;->totalKilocalories:D

    invoke-static {v0, v1}, Ljava/lang/Double;->hashCode(D)I

    move-result v0

    const v1, 0x2b5a5

    add-int/2addr v0, v1

    shl-int/lit8 v1, v0, 0x5

    iget-wide v2, p0, Lcom/whoop/analytics/strain/model/Calories;->totalKilojoules:D

    invoke-static {v2, v3}, Ljava/lang/Double;->hashCode(D)I

    move-result v2

    add-int/2addr v2, v1

    add-int/2addr v2, v0

    return v2
.end method

.method public toString()Ljava/lang/String;
    .locals 4

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Calories{totalKilocalories="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-wide v1, p0, Lcom/whoop/analytics/strain/model/Calories;->totalKilocalories:D

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    const-string v1, ", totalKilojoules="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v1, p0, Lcom/whoop/analytics/strain/model/Calories;->totalKilojoules:D

    const-string v3, "}"

    invoke-static {v1, v2, v3, v0}, Lq63/c;->f(DLjava/lang/String;Ljava/lang/StringBuilder;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final withTotalKilocalories(D)Lcom/whoop/analytics/strain/model/Calories;
    .locals 4

    iget-wide v0, p0, Lcom/whoop/analytics/strain/model/Calories;->totalKilocalories:D

    invoke-static {v0, v1}, Ljava/lang/Double;->doubleToLongBits(D)J

    move-result-wide v0

    invoke-static {p1, p2}, Ljava/lang/Double;->doubleToLongBits(D)J

    move-result-wide v2

    cmp-long v0, v0, v2

    if-nez v0, :cond_0

    return-object p0

    :cond_0
    new-instance v0, Lcom/whoop/analytics/strain/model/Calories;

    iget-wide v1, p0, Lcom/whoop/analytics/strain/model/Calories;->totalKilojoules:D

    invoke-direct {v0, p1, p2, v1, v2}, Lcom/whoop/analytics/strain/model/Calories;-><init>(DD)V

    return-object v0
.end method

.method public final withTotalKilojoules(D)Lcom/whoop/analytics/strain/model/Calories;
    .locals 4

    iget-wide v0, p0, Lcom/whoop/analytics/strain/model/Calories;->totalKilojoules:D

    invoke-static {v0, v1}, Ljava/lang/Double;->doubleToLongBits(D)J

    move-result-wide v0

    invoke-static {p1, p2}, Ljava/lang/Double;->doubleToLongBits(D)J

    move-result-wide v2

    cmp-long v0, v0, v2

    if-nez v0, :cond_0

    return-object p0

    :cond_0
    new-instance v0, Lcom/whoop/analytics/strain/model/Calories;

    iget-wide v1, p0, Lcom/whoop/analytics/strain/model/Calories;->totalKilocalories:D

    invoke-direct {v0, v1, v2, p1, p2}, Lcom/whoop/analytics/strain/model/Calories;-><init>(DD)V

    return-object v0
.end method
