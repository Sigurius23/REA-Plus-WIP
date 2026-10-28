.class public Lcom/whoop/service/network/model/cycles/Recovery;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final SCORE_NONE:I = -0x1


# instance fields
.field private transient activityState:Lcom/whoop/domain/model/ActivityState;

.field private blackoutUntil:Ljava/lang/String;

.field private transient blackoutUntilDate:Lorg/joda/time/DateTime;

.field private calibrating:Z

.field private heartRateVariabilityRmssd:Ljava/lang/Double;

.field private id:I

.field private recoveryResponseId:Ljava/lang/Integer;

.field private responded:Z

.field private restingHeartRate:Ljava/lang/Integer;

.field private score:I

.field private state:Ljava/lang/String;

.field private timestamp:Ljava/lang/String;

.field private transient timestampDate:Lorg/joda/time/DateTime;


# direct methods
.method public constructor <init>(ILjava/lang/String;IZLjava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Double;ZLjava/lang/Integer;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lcom/whoop/service/network/model/cycles/Recovery;->id:I

    iput-object p2, p0, Lcom/whoop/service/network/model/cycles/Recovery;->state:Ljava/lang/String;

    iput p3, p0, Lcom/whoop/service/network/model/cycles/Recovery;->score:I

    iput-boolean p4, p0, Lcom/whoop/service/network/model/cycles/Recovery;->calibrating:Z

    iput-object p5, p0, Lcom/whoop/service/network/model/cycles/Recovery;->timestamp:Ljava/lang/String;

    iput-object p6, p0, Lcom/whoop/service/network/model/cycles/Recovery;->blackoutUntil:Ljava/lang/String;

    iput-object p7, p0, Lcom/whoop/service/network/model/cycles/Recovery;->restingHeartRate:Ljava/lang/Integer;

    iput-object p8, p0, Lcom/whoop/service/network/model/cycles/Recovery;->heartRateVariabilityRmssd:Ljava/lang/Double;

    iput-boolean p9, p0, Lcom/whoop/service/network/model/cycles/Recovery;->responded:Z

    iput-object p10, p0, Lcom/whoop/service/network/model/cycles/Recovery;->recoveryResponseId:Ljava/lang/Integer;

    return-void
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 2

    instance-of v0, p1, Lcom/whoop/service/network/model/cycles/Recovery;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    check-cast p1, Lcom/whoop/service/network/model/cycles/Recovery;

    invoke-virtual {p1}, Lcom/whoop/service/network/model/cycles/Recovery;->getId()I

    move-result p1

    iget v0, p0, Lcom/whoop/service/network/model/cycles/Recovery;->id:I

    if-ne p1, v0, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    return v1
.end method

.method public getActivityState()Lcom/whoop/domain/model/ActivityState;
    .locals 1

    iget-object v0, p0, Lcom/whoop/service/network/model/cycles/Recovery;->activityState:Lcom/whoop/domain/model/ActivityState;

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/whoop/service/network/model/cycles/Recovery;->state:Ljava/lang/String;

    invoke-static {v0}, Lcom/whoop/domain/model/ActivityState;->fromValue(Ljava/lang/String;)Lcom/whoop/domain/model/ActivityState;

    move-result-object v0

    iput-object v0, p0, Lcom/whoop/service/network/model/cycles/Recovery;->activityState:Lcom/whoop/domain/model/ActivityState;

    :cond_0
    iget-object v0, p0, Lcom/whoop/service/network/model/cycles/Recovery;->activityState:Lcom/whoop/domain/model/ActivityState;

    return-object v0
.end method

.method public getBlackoutUntilDate()Lorg/joda/time/DateTime;
    .locals 1

    iget-object v0, p0, Lcom/whoop/service/network/model/cycles/Recovery;->blackoutUntilDate:Lorg/joda/time/DateTime;

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/whoop/service/network/model/cycles/Recovery;->blackoutUntil:Ljava/lang/String;

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/lang/String;->isEmpty()Z

    move-result v0

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/whoop/service/network/model/cycles/Recovery;->blackoutUntil:Ljava/lang/String;

    invoke-static {v0}, Lorg/joda/time/DateTime;->parse(Ljava/lang/String;)Lorg/joda/time/DateTime;

    move-result-object v0

    iput-object v0, p0, Lcom/whoop/service/network/model/cycles/Recovery;->blackoutUntilDate:Lorg/joda/time/DateTime;

    :cond_0
    iget-object v0, p0, Lcom/whoop/service/network/model/cycles/Recovery;->blackoutUntilDate:Lorg/joda/time/DateTime;

    return-object v0
.end method

.method public getHeartRateVariabilityRmssd()Ljava/lang/Double;
    .locals 1

    iget-object v0, p0, Lcom/whoop/service/network/model/cycles/Recovery;->heartRateVariabilityRmssd:Ljava/lang/Double;

    return-object v0
.end method

.method public getId()I
    .locals 1

    iget v0, p0, Lcom/whoop/service/network/model/cycles/Recovery;->id:I

    return v0
.end method

.method public getRecoveryResponseId()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lcom/whoop/service/network/model/cycles/Recovery;->recoveryResponseId:Ljava/lang/Integer;

    return-object v0
.end method

.method public getRestingHeartRate()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lcom/whoop/service/network/model/cycles/Recovery;->restingHeartRate:Ljava/lang/Integer;

    return-object v0
.end method

.method public getScore()I
    .locals 1

    iget v0, p0, Lcom/whoop/service/network/model/cycles/Recovery;->score:I

    return v0
.end method

.method public getTimestamp()Lorg/joda/time/DateTime;
    .locals 1

    iget-object v0, p0, Lcom/whoop/service/network/model/cycles/Recovery;->timestampDate:Lorg/joda/time/DateTime;

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/whoop/service/network/model/cycles/Recovery;->timestamp:Ljava/lang/String;

    invoke-static {v0}, Lorg/joda/time/DateTime;->parse(Ljava/lang/String;)Lorg/joda/time/DateTime;

    move-result-object v0

    iput-object v0, p0, Lcom/whoop/service/network/model/cycles/Recovery;->timestampDate:Lorg/joda/time/DateTime;

    :cond_0
    iget-object v0, p0, Lcom/whoop/service/network/model/cycles/Recovery;->timestampDate:Lorg/joda/time/DateTime;

    return-object v0
.end method

.method public hasScore()Z
    .locals 2

    iget v0, p0, Lcom/whoop/service/network/model/cycles/Recovery;->score:I

    const/4 v1, -0x1

    if-eq v0, v1, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public hashCode()I
    .locals 1

    iget v0, p0, Lcom/whoop/service/network/model/cycles/Recovery;->id:I

    return v0
.end method

.method public isCalibrating()Z
    .locals 1

    iget-boolean v0, p0, Lcom/whoop/service/network/model/cycles/Recovery;->calibrating:Z

    return v0
.end method

.method public isCurrentlyBlackedOut()Z
    .locals 3

    invoke-virtual {p0}, Lcom/whoop/service/network/model/cycles/Recovery;->getBlackoutUntilDate()Lorg/joda/time/DateTime;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Lorg/joda/time/base/AbstractInstant;->isAfter(J)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public isIncomplete()Z
    .locals 2

    invoke-virtual {p0}, Lcom/whoop/service/network/model/cycles/Recovery;->getActivityState()Lcom/whoop/domain/model/ActivityState;

    move-result-object v0

    sget-object v1, Lcom/whoop/domain/model/ActivityState;->INCOMPLETE:Lcom/whoop/domain/model/ActivityState;

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public isPending()Z
    .locals 2

    invoke-virtual {p0}, Lcom/whoop/service/network/model/cycles/Recovery;->getActivityState()Lcom/whoop/domain/model/ActivityState;

    move-result-object v0

    sget-object v1, Lcom/whoop/domain/model/ActivityState;->PENDING:Lcom/whoop/domain/model/ActivityState;

    if-ne v0, v1, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public isResponded()Z
    .locals 1

    iget-boolean v0, p0, Lcom/whoop/service/network/model/cycles/Recovery;->responded:Z

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Recovery{id="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget v1, p0, Lcom/whoop/service/network/model/cycles/Recovery;->id:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", state=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/whoop/service/network/model/cycles/Recovery;->state:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "\', score="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/whoop/service/network/model/cycles/Recovery;->score:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", activityState="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/whoop/service/network/model/cycles/Recovery;->activityState:Lcom/whoop/domain/model/ActivityState;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", calibrating="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Lcom/whoop/service/network/model/cycles/Recovery;->calibrating:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", timestamp=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/whoop/service/network/model/cycles/Recovery;->timestamp:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "\', timestampDate="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/whoop/service/network/model/cycles/Recovery;->timestampDate:Lorg/joda/time/DateTime;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", blackoutUntil=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/whoop/service/network/model/cycles/Recovery;->blackoutUntil:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "\', blackoutUntilDate="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/whoop/service/network/model/cycles/Recovery;->blackoutUntilDate:Lorg/joda/time/DateTime;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", restingHeartRate="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/whoop/service/network/model/cycles/Recovery;->restingHeartRate:Ljava/lang/Integer;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", heartRateVariabilityRmssd="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/whoop/service/network/model/cycles/Recovery;->heartRateVariabilityRmssd:Ljava/lang/Double;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", responded="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Lcom/whoop/service/network/model/cycles/Recovery;->responded:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", recoveryResponseId="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/whoop/service/network/model/cycles/Recovery;->recoveryResponseId:Ljava/lang/Integer;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
