.class public final Lcom/whoop/analytics/strain/model/UserProfile;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/whoop/analytics/strain/model/UserProfileIF;


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcom/whoop/analytics/strain/model/UserProfile$Builder;,
        Lcom/whoop/analytics/strain/model/UserProfile$Json;
    }
.end annotation

.annotation build Ledu/umd/cs/findbugs/annotations/SuppressFBWarnings;
.end annotation


# instance fields
.field private final biologicalSex:Lcom/whoop/analytics/strain/model/BiologicalSex;

.field private final birthday:J

.field private final fitnessLevel:Lcom/whoop/analytics/strain/model/FitnessLevel;

.field private final height:D

.field private final id:I

.field private final maxHeartRate:D

.field private final restingHeartRate:D

.field private final weight:D


# direct methods
.method private constructor <init>(IJLcom/whoop/analytics/strain/model/BiologicalSex;Lcom/whoop/analytics/strain/model/FitnessLevel;DDDD)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput p1, p0, Lcom/whoop/analytics/strain/model/UserProfile;->id:I

    .line 4
    iput-wide p2, p0, Lcom/whoop/analytics/strain/model/UserProfile;->birthday:J

    .line 5
    iput-object p4, p0, Lcom/whoop/analytics/strain/model/UserProfile;->biologicalSex:Lcom/whoop/analytics/strain/model/BiologicalSex;

    .line 6
    iput-object p5, p0, Lcom/whoop/analytics/strain/model/UserProfile;->fitnessLevel:Lcom/whoop/analytics/strain/model/FitnessLevel;

    .line 7
    iput-wide p6, p0, Lcom/whoop/analytics/strain/model/UserProfile;->height:D

    .line 8
    iput-wide p8, p0, Lcom/whoop/analytics/strain/model/UserProfile;->weight:D

    .line 9
    iput-wide p10, p0, Lcom/whoop/analytics/strain/model/UserProfile;->restingHeartRate:D

    .line 10
    iput-wide p12, p0, Lcom/whoop/analytics/strain/model/UserProfile;->maxHeartRate:D

    return-void
.end method

.method public synthetic constructor <init>(IJLcom/whoop/analytics/strain/model/BiologicalSex;Lcom/whoop/analytics/strain/model/FitnessLevel;DDDDLcom/whoop/analytics/strain/model/UserProfile$1;)V
    .locals 0

    .line 1
    invoke-direct/range {p0 .. p13}, Lcom/whoop/analytics/strain/model/UserProfile;-><init>(IJLcom/whoop/analytics/strain/model/BiologicalSex;Lcom/whoop/analytics/strain/model/FitnessLevel;DDDD)V

    return-void
.end method

.method public static builder()Lcom/whoop/analytics/strain/model/UserProfile$Builder;
    .locals 2

    new-instance v0, Lcom/whoop/analytics/strain/model/UserProfile$Builder;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lcom/whoop/analytics/strain/model/UserProfile$Builder;-><init>(Lcom/whoop/analytics/strain/model/UserProfile$1;)V

    return-object v0
.end method

.method public static copyOf(Lcom/whoop/analytics/strain/model/UserProfileIF;)Lcom/whoop/analytics/strain/model/UserProfile;
    .locals 1

    instance-of v0, p0, Lcom/whoop/analytics/strain/model/UserProfile;

    if-eqz v0, :cond_0

    check-cast p0, Lcom/whoop/analytics/strain/model/UserProfile;

    return-object p0

    :cond_0
    invoke-static {}, Lcom/whoop/analytics/strain/model/UserProfile;->builder()Lcom/whoop/analytics/strain/model/UserProfile$Builder;

    move-result-object v0

    invoke-virtual {v0, p0}, Lcom/whoop/analytics/strain/model/UserProfile$Builder;->from(Lcom/whoop/analytics/strain/model/UserProfileIF;)Lcom/whoop/analytics/strain/model/UserProfile$Builder;

    move-result-object p0

    invoke-virtual {p0}, Lcom/whoop/analytics/strain/model/UserProfile$Builder;->build()Lcom/whoop/analytics/strain/model/UserProfile;

    move-result-object p0

    return-object p0
.end method

.method private equalTo(Lcom/whoop/analytics/strain/model/UserProfile;)Z
    .locals 4

    iget v0, p0, Lcom/whoop/analytics/strain/model/UserProfile;->id:I

    iget v1, p1, Lcom/whoop/analytics/strain/model/UserProfile;->id:I

    if-ne v0, v1, :cond_0

    iget-wide v0, p0, Lcom/whoop/analytics/strain/model/UserProfile;->birthday:J

    iget-wide v2, p1, Lcom/whoop/analytics/strain/model/UserProfile;->birthday:J

    cmp-long v0, v0, v2

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/whoop/analytics/strain/model/UserProfile;->biologicalSex:Lcom/whoop/analytics/strain/model/BiologicalSex;

    iget-object v1, p1, Lcom/whoop/analytics/strain/model/UserProfile;->biologicalSex:Lcom/whoop/analytics/strain/model/BiologicalSex;

    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/whoop/analytics/strain/model/UserProfile;->fitnessLevel:Lcom/whoop/analytics/strain/model/FitnessLevel;

    iget-object v1, p1, Lcom/whoop/analytics/strain/model/UserProfile;->fitnessLevel:Lcom/whoop/analytics/strain/model/FitnessLevel;

    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-wide v0, p0, Lcom/whoop/analytics/strain/model/UserProfile;->height:D

    invoke-static {v0, v1}, Ljava/lang/Double;->doubleToLongBits(D)J

    move-result-wide v0

    iget-wide v2, p1, Lcom/whoop/analytics/strain/model/UserProfile;->height:D

    invoke-static {v2, v3}, Ljava/lang/Double;->doubleToLongBits(D)J

    move-result-wide v2

    cmp-long v0, v0, v2

    if-nez v0, :cond_0

    iget-wide v0, p0, Lcom/whoop/analytics/strain/model/UserProfile;->weight:D

    invoke-static {v0, v1}, Ljava/lang/Double;->doubleToLongBits(D)J

    move-result-wide v0

    iget-wide v2, p1, Lcom/whoop/analytics/strain/model/UserProfile;->weight:D

    invoke-static {v2, v3}, Ljava/lang/Double;->doubleToLongBits(D)J

    move-result-wide v2

    cmp-long v0, v0, v2

    if-nez v0, :cond_0

    iget-wide v0, p0, Lcom/whoop/analytics/strain/model/UserProfile;->restingHeartRate:D

    invoke-static {v0, v1}, Ljava/lang/Double;->doubleToLongBits(D)J

    move-result-wide v0

    iget-wide v2, p1, Lcom/whoop/analytics/strain/model/UserProfile;->restingHeartRate:D

    invoke-static {v2, v3}, Ljava/lang/Double;->doubleToLongBits(D)J

    move-result-wide v2

    cmp-long v0, v0, v2

    if-nez v0, :cond_0

    iget-wide v0, p0, Lcom/whoop/analytics/strain/model/UserProfile;->maxHeartRate:D

    invoke-static {v0, v1}, Ljava/lang/Double;->doubleToLongBits(D)J

    move-result-wide v0

    iget-wide v2, p1, Lcom/whoop/analytics/strain/model/UserProfile;->maxHeartRate:D

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

.method public static fromJson(Lcom/whoop/analytics/strain/model/UserProfile$Json;)Lcom/whoop/analytics/strain/model/UserProfile;
    .locals 3
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonCreator;
        mode = .enum Lcom/fasterxml/jackson/annotation/JsonCreator$Mode;->DELEGATING:Lcom/fasterxml/jackson/annotation/JsonCreator$Mode;
    .end annotation

    .annotation runtime Ljava/lang/Deprecated;
    .end annotation

    invoke-static {}, Lcom/whoop/analytics/strain/model/UserProfile;->builder()Lcom/whoop/analytics/strain/model/UserProfile$Builder;

    move-result-object v0

    iget-boolean v1, p0, Lcom/whoop/analytics/strain/model/UserProfile$Json;->idIsSet:Z

    if-eqz v1, :cond_0

    iget v1, p0, Lcom/whoop/analytics/strain/model/UserProfile$Json;->id:I

    invoke-virtual {v0, v1}, Lcom/whoop/analytics/strain/model/UserProfile$Builder;->setId(I)Lcom/whoop/analytics/strain/model/UserProfile$Builder;

    :cond_0
    iget-boolean v1, p0, Lcom/whoop/analytics/strain/model/UserProfile$Json;->birthdayIsSet:Z

    if-eqz v1, :cond_1

    iget-wide v1, p0, Lcom/whoop/analytics/strain/model/UserProfile$Json;->birthday:J

    invoke-virtual {v0, v1, v2}, Lcom/whoop/analytics/strain/model/UserProfile$Builder;->setBirthday(J)Lcom/whoop/analytics/strain/model/UserProfile$Builder;

    :cond_1
    iget-object v1, p0, Lcom/whoop/analytics/strain/model/UserProfile$Json;->biologicalSex:Lcom/whoop/analytics/strain/model/BiologicalSex;

    if-eqz v1, :cond_2

    invoke-virtual {v0, v1}, Lcom/whoop/analytics/strain/model/UserProfile$Builder;->setBiologicalSex(Lcom/whoop/analytics/strain/model/BiologicalSex;)Lcom/whoop/analytics/strain/model/UserProfile$Builder;

    :cond_2
    iget-object v1, p0, Lcom/whoop/analytics/strain/model/UserProfile$Json;->fitnessLevel:Lcom/whoop/analytics/strain/model/FitnessLevel;

    if-eqz v1, :cond_3

    invoke-virtual {v0, v1}, Lcom/whoop/analytics/strain/model/UserProfile$Builder;->setFitnessLevel(Lcom/whoop/analytics/strain/model/FitnessLevel;)Lcom/whoop/analytics/strain/model/UserProfile$Builder;

    :cond_3
    iget-boolean v1, p0, Lcom/whoop/analytics/strain/model/UserProfile$Json;->heightIsSet:Z

    if-eqz v1, :cond_4

    iget-wide v1, p0, Lcom/whoop/analytics/strain/model/UserProfile$Json;->height:D

    invoke-virtual {v0, v1, v2}, Lcom/whoop/analytics/strain/model/UserProfile$Builder;->setHeight(D)Lcom/whoop/analytics/strain/model/UserProfile$Builder;

    :cond_4
    iget-boolean v1, p0, Lcom/whoop/analytics/strain/model/UserProfile$Json;->weightIsSet:Z

    if-eqz v1, :cond_5

    iget-wide v1, p0, Lcom/whoop/analytics/strain/model/UserProfile$Json;->weight:D

    invoke-virtual {v0, v1, v2}, Lcom/whoop/analytics/strain/model/UserProfile$Builder;->setWeight(D)Lcom/whoop/analytics/strain/model/UserProfile$Builder;

    :cond_5
    iget-boolean v1, p0, Lcom/whoop/analytics/strain/model/UserProfile$Json;->restingHeartRateIsSet:Z

    if-eqz v1, :cond_6

    iget-wide v1, p0, Lcom/whoop/analytics/strain/model/UserProfile$Json;->restingHeartRate:D

    invoke-virtual {v0, v1, v2}, Lcom/whoop/analytics/strain/model/UserProfile$Builder;->setRestingHeartRate(D)Lcom/whoop/analytics/strain/model/UserProfile$Builder;

    :cond_6
    iget-boolean v1, p0, Lcom/whoop/analytics/strain/model/UserProfile$Json;->maxHeartRateIsSet:Z

    if-eqz v1, :cond_7

    iget-wide v1, p0, Lcom/whoop/analytics/strain/model/UserProfile$Json;->maxHeartRate:D

    invoke-virtual {v0, v1, v2}, Lcom/whoop/analytics/strain/model/UserProfile$Builder;->setMaxHeartRate(D)Lcom/whoop/analytics/strain/model/UserProfile$Builder;

    :cond_7
    invoke-virtual {v0}, Lcom/whoop/analytics/strain/model/UserProfile$Builder;->build()Lcom/whoop/analytics/strain/model/UserProfile;

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
    instance-of v1, p1, Lcom/whoop/analytics/strain/model/UserProfile;

    if-eqz v1, :cond_1

    check-cast p1, Lcom/whoop/analytics/strain/model/UserProfile;

    invoke-direct {p0, p1}, Lcom/whoop/analytics/strain/model/UserProfile;->equalTo(Lcom/whoop/analytics/strain/model/UserProfile;)Z

    move-result p1

    if-eqz p1, :cond_1

    return v0

    :cond_1
    const/4 p1, 0x0

    return p1
.end method

.method public getBiologicalSex()Lcom/whoop/analytics/strain/model/BiologicalSex;
    .locals 1
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
    .end annotation

    iget-object v0, p0, Lcom/whoop/analytics/strain/model/UserProfile;->biologicalSex:Lcom/whoop/analytics/strain/model/BiologicalSex;

    return-object v0
.end method

.method public getBirthday()J
    .locals 2
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
    .end annotation

    iget-wide v0, p0, Lcom/whoop/analytics/strain/model/UserProfile;->birthday:J

    return-wide v0
.end method

.method public getFitnessLevel()Lcom/whoop/analytics/strain/model/FitnessLevel;
    .locals 1
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
    .end annotation

    iget-object v0, p0, Lcom/whoop/analytics/strain/model/UserProfile;->fitnessLevel:Lcom/whoop/analytics/strain/model/FitnessLevel;

    return-object v0
.end method

.method public getHeight()D
    .locals 2
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
    .end annotation

    iget-wide v0, p0, Lcom/whoop/analytics/strain/model/UserProfile;->height:D

    return-wide v0
.end method

.method public getId()I
    .locals 1
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
    .end annotation

    iget v0, p0, Lcom/whoop/analytics/strain/model/UserProfile;->id:I

    return v0
.end method

.method public getMaxHeartRate()D
    .locals 2
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
    .end annotation

    iget-wide v0, p0, Lcom/whoop/analytics/strain/model/UserProfile;->maxHeartRate:D

    return-wide v0
.end method

.method public getRestingHeartRate()D
    .locals 2
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
    .end annotation

    iget-wide v0, p0, Lcom/whoop/analytics/strain/model/UserProfile;->restingHeartRate:D

    return-wide v0
.end method

.method public getWeight()D
    .locals 2
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
    .end annotation

    iget-wide v0, p0, Lcom/whoop/analytics/strain/model/UserProfile;->weight:D

    return-wide v0
.end method

.method public hashCode()I
    .locals 5

    iget v0, p0, Lcom/whoop/analytics/strain/model/UserProfile;->id:I

    const v1, 0x2b5a5

    add-int/2addr v0, v1

    shl-int/lit8 v1, v0, 0x5

    iget-wide v2, p0, Lcom/whoop/analytics/strain/model/UserProfile;->birthday:J

    invoke-static {v2, v3}, Ljava/lang/Long;->hashCode(J)I

    move-result v2

    add-int/2addr v2, v1

    add-int/2addr v2, v0

    shl-int/lit8 v0, v2, 0x5

    iget-object v1, p0, Lcom/whoop/analytics/strain/model/UserProfile;->biologicalSex:Lcom/whoop/analytics/strain/model/BiologicalSex;

    invoke-virtual {v1}, Ljava/lang/Object;->hashCode()I

    move-result v1

    add-int/2addr v1, v0

    add-int/2addr v1, v2

    shl-int/lit8 v0, v1, 0x5

    iget-object v2, p0, Lcom/whoop/analytics/strain/model/UserProfile;->fitnessLevel:Lcom/whoop/analytics/strain/model/FitnessLevel;

    invoke-virtual {v2}, Ljava/lang/Object;->hashCode()I

    move-result v2

    add-int/2addr v2, v0

    add-int/2addr v2, v1

    shl-int/lit8 v0, v2, 0x5

    iget-wide v3, p0, Lcom/whoop/analytics/strain/model/UserProfile;->height:D

    invoke-static {v3, v4}, Ljava/lang/Double;->hashCode(D)I

    move-result v1

    add-int/2addr v1, v0

    add-int/2addr v1, v2

    shl-int/lit8 v0, v1, 0x5

    iget-wide v2, p0, Lcom/whoop/analytics/strain/model/UserProfile;->weight:D

    invoke-static {v2, v3}, Ljava/lang/Double;->hashCode(D)I

    move-result v2

    add-int/2addr v2, v0

    add-int/2addr v2, v1

    shl-int/lit8 v0, v2, 0x5

    iget-wide v3, p0, Lcom/whoop/analytics/strain/model/UserProfile;->restingHeartRate:D

    invoke-static {v3, v4}, Ljava/lang/Double;->hashCode(D)I

    move-result v1

    add-int/2addr v1, v0

    add-int/2addr v1, v2

    shl-int/lit8 v0, v1, 0x5

    iget-wide v2, p0, Lcom/whoop/analytics/strain/model/UserProfile;->maxHeartRate:D

    invoke-static {v2, v3}, Ljava/lang/Double;->hashCode(D)I

    move-result v2

    add-int/2addr v2, v0

    add-int/2addr v2, v1

    return v2
.end method

.method public toString()Ljava/lang/String;
    .locals 4

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "UserProfile{id="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget v1, p0, Lcom/whoop/analytics/strain/model/UserProfile;->id:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", birthday="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v1, p0, Lcom/whoop/analytics/strain/model/UserProfile;->birthday:J

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;

    const-string v1, ", biologicalSex="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/whoop/analytics/strain/model/UserProfile;->biologicalSex:Lcom/whoop/analytics/strain/model/BiologicalSex;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", fitnessLevel="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/whoop/analytics/strain/model/UserProfile;->fitnessLevel:Lcom/whoop/analytics/strain/model/FitnessLevel;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", height="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v1, p0, Lcom/whoop/analytics/strain/model/UserProfile;->height:D

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    const-string v1, ", weight="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v1, p0, Lcom/whoop/analytics/strain/model/UserProfile;->weight:D

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    const-string v1, ", restingHeartRate="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v1, p0, Lcom/whoop/analytics/strain/model/UserProfile;->restingHeartRate:D

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    const-string v1, ", maxHeartRate="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v1, p0, Lcom/whoop/analytics/strain/model/UserProfile;->maxHeartRate:D

    const-string v3, "}"

    invoke-static {v1, v2, v3, v0}, Lq63/c;->f(DLjava/lang/String;Ljava/lang/StringBuilder;)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final withBiologicalSex(Lcom/whoop/analytics/strain/model/BiologicalSex;)Lcom/whoop/analytics/strain/model/UserProfile;
    .locals 14

    move-object v4, p1

    iget-object v0, p0, Lcom/whoop/analytics/strain/model/UserProfile;->biologicalSex:Lcom/whoop/analytics/strain/model/BiologicalSex;

    if-ne v0, v4, :cond_0

    return-object p0

    :cond_0
    const-string v0, "biologicalSex"

    invoke-static {p1, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    new-instance v0, Lcom/whoop/analytics/strain/model/UserProfile;

    iget v1, p0, Lcom/whoop/analytics/strain/model/UserProfile;->id:I

    iget-wide v2, p0, Lcom/whoop/analytics/strain/model/UserProfile;->birthday:J

    iget-object v5, p0, Lcom/whoop/analytics/strain/model/UserProfile;->fitnessLevel:Lcom/whoop/analytics/strain/model/FitnessLevel;

    iget-wide v6, p0, Lcom/whoop/analytics/strain/model/UserProfile;->height:D

    iget-wide v8, p0, Lcom/whoop/analytics/strain/model/UserProfile;->weight:D

    iget-wide v10, p0, Lcom/whoop/analytics/strain/model/UserProfile;->restingHeartRate:D

    iget-wide v12, p0, Lcom/whoop/analytics/strain/model/UserProfile;->maxHeartRate:D

    invoke-direct/range {v0 .. v13}, Lcom/whoop/analytics/strain/model/UserProfile;-><init>(IJLcom/whoop/analytics/strain/model/BiologicalSex;Lcom/whoop/analytics/strain/model/FitnessLevel;DDDD)V

    return-object v0
.end method

.method public final withBirthday(J)Lcom/whoop/analytics/strain/model/UserProfile;
    .locals 16

    move-object/from16 v0, p0

    iget-wide v1, v0, Lcom/whoop/analytics/strain/model/UserProfile;->birthday:J

    cmp-long v1, v1, p1

    if-nez v1, :cond_0

    return-object v0

    :cond_0
    new-instance v2, Lcom/whoop/analytics/strain/model/UserProfile;

    iget v3, v0, Lcom/whoop/analytics/strain/model/UserProfile;->id:I

    iget-object v6, v0, Lcom/whoop/analytics/strain/model/UserProfile;->biologicalSex:Lcom/whoop/analytics/strain/model/BiologicalSex;

    iget-object v7, v0, Lcom/whoop/analytics/strain/model/UserProfile;->fitnessLevel:Lcom/whoop/analytics/strain/model/FitnessLevel;

    iget-wide v8, v0, Lcom/whoop/analytics/strain/model/UserProfile;->height:D

    iget-wide v10, v0, Lcom/whoop/analytics/strain/model/UserProfile;->weight:D

    iget-wide v12, v0, Lcom/whoop/analytics/strain/model/UserProfile;->restingHeartRate:D

    iget-wide v14, v0, Lcom/whoop/analytics/strain/model/UserProfile;->maxHeartRate:D

    move-wide/from16 v4, p1

    invoke-direct/range {v2 .. v15}, Lcom/whoop/analytics/strain/model/UserProfile;-><init>(IJLcom/whoop/analytics/strain/model/BiologicalSex;Lcom/whoop/analytics/strain/model/FitnessLevel;DDDD)V

    return-object v2
.end method

.method public final withFitnessLevel(Lcom/whoop/analytics/strain/model/FitnessLevel;)Lcom/whoop/analytics/strain/model/UserProfile;
    .locals 14

    move-object v5, p1

    iget-object v0, p0, Lcom/whoop/analytics/strain/model/UserProfile;->fitnessLevel:Lcom/whoop/analytics/strain/model/FitnessLevel;

    if-ne v0, v5, :cond_0

    return-object p0

    :cond_0
    const-string v0, "fitnessLevel"

    invoke-static {p1, v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;Ljava/lang/String;)Ljava/lang/Object;

    new-instance v0, Lcom/whoop/analytics/strain/model/UserProfile;

    iget v1, p0, Lcom/whoop/analytics/strain/model/UserProfile;->id:I

    iget-wide v2, p0, Lcom/whoop/analytics/strain/model/UserProfile;->birthday:J

    iget-object v4, p0, Lcom/whoop/analytics/strain/model/UserProfile;->biologicalSex:Lcom/whoop/analytics/strain/model/BiologicalSex;

    iget-wide v6, p0, Lcom/whoop/analytics/strain/model/UserProfile;->height:D

    iget-wide v8, p0, Lcom/whoop/analytics/strain/model/UserProfile;->weight:D

    iget-wide v10, p0, Lcom/whoop/analytics/strain/model/UserProfile;->restingHeartRate:D

    iget-wide v12, p0, Lcom/whoop/analytics/strain/model/UserProfile;->maxHeartRate:D

    invoke-direct/range {v0 .. v13}, Lcom/whoop/analytics/strain/model/UserProfile;-><init>(IJLcom/whoop/analytics/strain/model/BiologicalSex;Lcom/whoop/analytics/strain/model/FitnessLevel;DDDD)V

    return-object v0
.end method

.method public final withHeight(D)Lcom/whoop/analytics/strain/model/UserProfile;
    .locals 16

    move-object/from16 v0, p0

    iget-wide v1, v0, Lcom/whoop/analytics/strain/model/UserProfile;->height:D

    invoke-static {v1, v2}, Ljava/lang/Double;->doubleToLongBits(D)J

    move-result-wide v1

    invoke-static/range {p1 .. p2}, Ljava/lang/Double;->doubleToLongBits(D)J

    move-result-wide v3

    cmp-long v1, v1, v3

    if-nez v1, :cond_0

    return-object v0

    :cond_0
    new-instance v2, Lcom/whoop/analytics/strain/model/UserProfile;

    iget v3, v0, Lcom/whoop/analytics/strain/model/UserProfile;->id:I

    iget-wide v4, v0, Lcom/whoop/analytics/strain/model/UserProfile;->birthday:J

    iget-object v6, v0, Lcom/whoop/analytics/strain/model/UserProfile;->biologicalSex:Lcom/whoop/analytics/strain/model/BiologicalSex;

    iget-object v7, v0, Lcom/whoop/analytics/strain/model/UserProfile;->fitnessLevel:Lcom/whoop/analytics/strain/model/FitnessLevel;

    iget-wide v10, v0, Lcom/whoop/analytics/strain/model/UserProfile;->weight:D

    iget-wide v12, v0, Lcom/whoop/analytics/strain/model/UserProfile;->restingHeartRate:D

    iget-wide v14, v0, Lcom/whoop/analytics/strain/model/UserProfile;->maxHeartRate:D

    move-wide/from16 v8, p1

    invoke-direct/range {v2 .. v15}, Lcom/whoop/analytics/strain/model/UserProfile;-><init>(IJLcom/whoop/analytics/strain/model/BiologicalSex;Lcom/whoop/analytics/strain/model/FitnessLevel;DDDD)V

    return-object v2
.end method

.method public final withId(I)Lcom/whoop/analytics/strain/model/UserProfile;
    .locals 16

    move-object/from16 v0, p0

    iget v1, v0, Lcom/whoop/analytics/strain/model/UserProfile;->id:I

    move/from16 v3, p1

    if-ne v1, v3, :cond_0

    return-object v0

    :cond_0
    new-instance v2, Lcom/whoop/analytics/strain/model/UserProfile;

    iget-wide v4, v0, Lcom/whoop/analytics/strain/model/UserProfile;->birthday:J

    iget-object v6, v0, Lcom/whoop/analytics/strain/model/UserProfile;->biologicalSex:Lcom/whoop/analytics/strain/model/BiologicalSex;

    iget-object v7, v0, Lcom/whoop/analytics/strain/model/UserProfile;->fitnessLevel:Lcom/whoop/analytics/strain/model/FitnessLevel;

    iget-wide v8, v0, Lcom/whoop/analytics/strain/model/UserProfile;->height:D

    iget-wide v10, v0, Lcom/whoop/analytics/strain/model/UserProfile;->weight:D

    iget-wide v12, v0, Lcom/whoop/analytics/strain/model/UserProfile;->restingHeartRate:D

    iget-wide v14, v0, Lcom/whoop/analytics/strain/model/UserProfile;->maxHeartRate:D

    invoke-direct/range {v2 .. v15}, Lcom/whoop/analytics/strain/model/UserProfile;-><init>(IJLcom/whoop/analytics/strain/model/BiologicalSex;Lcom/whoop/analytics/strain/model/FitnessLevel;DDDD)V

    return-object v2
.end method

.method public final withMaxHeartRate(D)Lcom/whoop/analytics/strain/model/UserProfile;
    .locals 16

    move-object/from16 v0, p0

    iget-wide v1, v0, Lcom/whoop/analytics/strain/model/UserProfile;->maxHeartRate:D

    invoke-static {v1, v2}, Ljava/lang/Double;->doubleToLongBits(D)J

    move-result-wide v1

    invoke-static/range {p1 .. p2}, Ljava/lang/Double;->doubleToLongBits(D)J

    move-result-wide v3

    cmp-long v1, v1, v3

    if-nez v1, :cond_0

    return-object v0

    :cond_0
    new-instance v2, Lcom/whoop/analytics/strain/model/UserProfile;

    iget v3, v0, Lcom/whoop/analytics/strain/model/UserProfile;->id:I

    iget-wide v4, v0, Lcom/whoop/analytics/strain/model/UserProfile;->birthday:J

    iget-object v6, v0, Lcom/whoop/analytics/strain/model/UserProfile;->biologicalSex:Lcom/whoop/analytics/strain/model/BiologicalSex;

    iget-object v7, v0, Lcom/whoop/analytics/strain/model/UserProfile;->fitnessLevel:Lcom/whoop/analytics/strain/model/FitnessLevel;

    iget-wide v8, v0, Lcom/whoop/analytics/strain/model/UserProfile;->height:D

    iget-wide v10, v0, Lcom/whoop/analytics/strain/model/UserProfile;->weight:D

    iget-wide v12, v0, Lcom/whoop/analytics/strain/model/UserProfile;->restingHeartRate:D

    move-wide/from16 v14, p1

    invoke-direct/range {v2 .. v15}, Lcom/whoop/analytics/strain/model/UserProfile;-><init>(IJLcom/whoop/analytics/strain/model/BiologicalSex;Lcom/whoop/analytics/strain/model/FitnessLevel;DDDD)V

    return-object v2
.end method

.method public final withRestingHeartRate(D)Lcom/whoop/analytics/strain/model/UserProfile;
    .locals 16

    move-object/from16 v0, p0

    iget-wide v1, v0, Lcom/whoop/analytics/strain/model/UserProfile;->restingHeartRate:D

    invoke-static {v1, v2}, Ljava/lang/Double;->doubleToLongBits(D)J

    move-result-wide v1

    invoke-static/range {p1 .. p2}, Ljava/lang/Double;->doubleToLongBits(D)J

    move-result-wide v3

    cmp-long v1, v1, v3

    if-nez v1, :cond_0

    return-object v0

    :cond_0
    new-instance v2, Lcom/whoop/analytics/strain/model/UserProfile;

    iget v3, v0, Lcom/whoop/analytics/strain/model/UserProfile;->id:I

    iget-wide v4, v0, Lcom/whoop/analytics/strain/model/UserProfile;->birthday:J

    iget-object v6, v0, Lcom/whoop/analytics/strain/model/UserProfile;->biologicalSex:Lcom/whoop/analytics/strain/model/BiologicalSex;

    iget-object v7, v0, Lcom/whoop/analytics/strain/model/UserProfile;->fitnessLevel:Lcom/whoop/analytics/strain/model/FitnessLevel;

    iget-wide v8, v0, Lcom/whoop/analytics/strain/model/UserProfile;->height:D

    iget-wide v10, v0, Lcom/whoop/analytics/strain/model/UserProfile;->weight:D

    iget-wide v14, v0, Lcom/whoop/analytics/strain/model/UserProfile;->maxHeartRate:D

    move-wide/from16 v12, p1

    invoke-direct/range {v2 .. v15}, Lcom/whoop/analytics/strain/model/UserProfile;-><init>(IJLcom/whoop/analytics/strain/model/BiologicalSex;Lcom/whoop/analytics/strain/model/FitnessLevel;DDDD)V

    return-object v2
.end method

.method public final withWeight(D)Lcom/whoop/analytics/strain/model/UserProfile;
    .locals 16

    move-object/from16 v0, p0

    iget-wide v1, v0, Lcom/whoop/analytics/strain/model/UserProfile;->weight:D

    invoke-static {v1, v2}, Ljava/lang/Double;->doubleToLongBits(D)J

    move-result-wide v1

    invoke-static/range {p1 .. p2}, Ljava/lang/Double;->doubleToLongBits(D)J

    move-result-wide v3

    cmp-long v1, v1, v3

    if-nez v1, :cond_0

    return-object v0

    :cond_0
    new-instance v2, Lcom/whoop/analytics/strain/model/UserProfile;

    iget v3, v0, Lcom/whoop/analytics/strain/model/UserProfile;->id:I

    iget-wide v4, v0, Lcom/whoop/analytics/strain/model/UserProfile;->birthday:J

    iget-object v6, v0, Lcom/whoop/analytics/strain/model/UserProfile;->biologicalSex:Lcom/whoop/analytics/strain/model/BiologicalSex;

    iget-object v7, v0, Lcom/whoop/analytics/strain/model/UserProfile;->fitnessLevel:Lcom/whoop/analytics/strain/model/FitnessLevel;

    iget-wide v8, v0, Lcom/whoop/analytics/strain/model/UserProfile;->height:D

    iget-wide v12, v0, Lcom/whoop/analytics/strain/model/UserProfile;->restingHeartRate:D

    iget-wide v14, v0, Lcom/whoop/analytics/strain/model/UserProfile;->maxHeartRate:D

    move-wide/from16 v10, p1

    invoke-direct/range {v2 .. v15}, Lcom/whoop/analytics/strain/model/UserProfile;-><init>(IJLcom/whoop/analytics/strain/model/BiologicalSex;Lcom/whoop/analytics/strain/model/FitnessLevel;DDDD)V

    return-object v2
.end method
