.class final Lcom/whoop/analytics/strain/model/UserProfile$Json;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lcom/whoop/analytics/strain/model/UserProfileIF;


# annotations
.annotation runtime Lcom/fasterxml/jackson/annotation/JsonAutoDetect;
    fieldVisibility = .enum Lcom/fasterxml/jackson/annotation/JsonAutoDetect$Visibility;->NONE:Lcom/fasterxml/jackson/annotation/JsonAutoDetect$Visibility;
.end annotation

.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/whoop/analytics/strain/model/UserProfile;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x19
    name = "Json"
.end annotation

.annotation runtime Ljava/lang/Deprecated;
.end annotation


# instance fields
.field biologicalSex:Lcom/whoop/analytics/strain/model/BiologicalSex;

.field birthday:J

.field birthdayIsSet:Z

.field fitnessLevel:Lcom/whoop/analytics/strain/model/FitnessLevel;

.field height:D

.field heightIsSet:Z

.field id:I

.field idIsSet:Z

.field maxHeartRate:D

.field maxHeartRateIsSet:Z

.field restingHeartRate:D

.field restingHeartRateIsSet:Z

.field weight:D

.field weightIsSet:Z


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public getBiologicalSex()Lcom/whoop/analytics/strain/model/BiologicalSex;
    .locals 1

    new-instance v0, Ljava/lang/UnsupportedOperationException;

    invoke-direct {v0}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw v0
.end method

.method public getBirthday()J
    .locals 1

    new-instance v0, Ljava/lang/UnsupportedOperationException;

    invoke-direct {v0}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw v0
.end method

.method public getFitnessLevel()Lcom/whoop/analytics/strain/model/FitnessLevel;
    .locals 1

    new-instance v0, Ljava/lang/UnsupportedOperationException;

    invoke-direct {v0}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw v0
.end method

.method public getHeight()D
    .locals 1

    new-instance v0, Ljava/lang/UnsupportedOperationException;

    invoke-direct {v0}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw v0
.end method

.method public getId()I
    .locals 1

    new-instance v0, Ljava/lang/UnsupportedOperationException;

    invoke-direct {v0}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw v0
.end method

.method public getMaxHeartRate()D
    .locals 1

    new-instance v0, Ljava/lang/UnsupportedOperationException;

    invoke-direct {v0}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw v0
.end method

.method public getRestingHeartRate()D
    .locals 1

    new-instance v0, Ljava/lang/UnsupportedOperationException;

    invoke-direct {v0}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw v0
.end method

.method public getWeight()D
    .locals 1

    new-instance v0, Ljava/lang/UnsupportedOperationException;

    invoke-direct {v0}, Ljava/lang/UnsupportedOperationException;-><init>()V

    throw v0
.end method

.method public setBiologicalSex(Lcom/whoop/analytics/strain/model/BiologicalSex;)V
    .locals 0
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
    .end annotation

    iput-object p1, p0, Lcom/whoop/analytics/strain/model/UserProfile$Json;->biologicalSex:Lcom/whoop/analytics/strain/model/BiologicalSex;

    return-void
.end method

.method public setBirthday(J)V
    .locals 0
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
    .end annotation

    iput-wide p1, p0, Lcom/whoop/analytics/strain/model/UserProfile$Json;->birthday:J

    const/4 p1, 0x1

    iput-boolean p1, p0, Lcom/whoop/analytics/strain/model/UserProfile$Json;->birthdayIsSet:Z

    return-void
.end method

.method public setFitnessLevel(Lcom/whoop/analytics/strain/model/FitnessLevel;)V
    .locals 0
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
    .end annotation

    iput-object p1, p0, Lcom/whoop/analytics/strain/model/UserProfile$Json;->fitnessLevel:Lcom/whoop/analytics/strain/model/FitnessLevel;

    return-void
.end method

.method public setHeight(D)V
    .locals 0
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
    .end annotation

    iput-wide p1, p0, Lcom/whoop/analytics/strain/model/UserProfile$Json;->height:D

    const/4 p1, 0x1

    iput-boolean p1, p0, Lcom/whoop/analytics/strain/model/UserProfile$Json;->heightIsSet:Z

    return-void
.end method

.method public setId(I)V
    .locals 0
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
    .end annotation

    iput p1, p0, Lcom/whoop/analytics/strain/model/UserProfile$Json;->id:I

    const/4 p1, 0x1

    iput-boolean p1, p0, Lcom/whoop/analytics/strain/model/UserProfile$Json;->idIsSet:Z

    return-void
.end method

.method public setMaxHeartRate(D)V
    .locals 0
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
    .end annotation

    iput-wide p1, p0, Lcom/whoop/analytics/strain/model/UserProfile$Json;->maxHeartRate:D

    const/4 p1, 0x1

    iput-boolean p1, p0, Lcom/whoop/analytics/strain/model/UserProfile$Json;->maxHeartRateIsSet:Z

    return-void
.end method

.method public setRestingHeartRate(D)V
    .locals 0
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
    .end annotation

    iput-wide p1, p0, Lcom/whoop/analytics/strain/model/UserProfile$Json;->restingHeartRate:D

    const/4 p1, 0x1

    iput-boolean p1, p0, Lcom/whoop/analytics/strain/model/UserProfile$Json;->restingHeartRateIsSet:Z

    return-void
.end method

.method public setWeight(D)V
    .locals 0
    .annotation runtime Lcom/fasterxml/jackson/annotation/JsonProperty;
    .end annotation

    iput-wide p1, p0, Lcom/whoop/analytics/strain/model/UserProfile$Json;->weight:D

    const/4 p1, 0x1

    iput-boolean p1, p0, Lcom/whoop/analytics/strain/model/UserProfile$Json;->weightIsSet:Z

    return-void
.end method
