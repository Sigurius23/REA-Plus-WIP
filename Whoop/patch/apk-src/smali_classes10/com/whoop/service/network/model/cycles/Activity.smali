.class public abstract Lcom/whoop/service/network/model/cycles/Activity;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private transient activityState:Lcom/whoop/domain/model/ActivityState;

.field protected during:Lcom/whoop/service/network/model/cycles/Period;

.field private id:I

.field private transient offsetDuring:Lcom/whoop/service/network/model/cycles/Period;

.field private responded:Z

.field private score:D

.field private state:Ljava/lang/String;

.field private surveyResponseId:Ljava/lang/Integer;

.field private timezoneOffset:Ljava/lang/String;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public constructor <init>(I)V
    .locals 0

    .line 2
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 3
    iput p1, p0, Lcom/whoop/service/network/model/cycles/Activity;->id:I

    return-void
.end method

.method public constructor <init>(ILjava/lang/String;DLcom/whoop/service/network/model/cycles/Period;Ljava/lang/String;ZLjava/lang/Integer;)V
    .locals 0

    .line 4
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 5
    iput p1, p0, Lcom/whoop/service/network/model/cycles/Activity;->id:I

    .line 6
    iput-object p2, p0, Lcom/whoop/service/network/model/cycles/Activity;->state:Ljava/lang/String;

    .line 7
    iput-wide p3, p0, Lcom/whoop/service/network/model/cycles/Activity;->score:D

    .line 8
    iput-object p5, p0, Lcom/whoop/service/network/model/cycles/Activity;->during:Lcom/whoop/service/network/model/cycles/Period;

    .line 9
    iput-object p6, p0, Lcom/whoop/service/network/model/cycles/Activity;->timezoneOffset:Ljava/lang/String;

    .line 10
    iput-boolean p7, p0, Lcom/whoop/service/network/model/cycles/Activity;->responded:Z

    .line 11
    iput-object p8, p0, Lcom/whoop/service/network/model/cycles/Activity;->surveyResponseId:Ljava/lang/Integer;

    return-void
.end method

.method public constructor <init>(ILjava/lang/String;Lcom/whoop/service/network/model/cycles/Period;Ljava/lang/String;)V
    .locals 0

    .line 12
    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    .line 13
    iput p1, p0, Lcom/whoop/service/network/model/cycles/Activity;->id:I

    .line 14
    iput-object p2, p0, Lcom/whoop/service/network/model/cycles/Activity;->state:Ljava/lang/String;

    .line 15
    iput-object p3, p0, Lcom/whoop/service/network/model/cycles/Activity;->during:Lcom/whoop/service/network/model/cycles/Period;

    .line 16
    iput-object p4, p0, Lcom/whoop/service/network/model/cycles/Activity;->timezoneOffset:Ljava/lang/String;

    return-void
.end method


# virtual methods
.method public equals(Ljava/lang/Object;)Z
    .locals 2

    instance-of v0, p1, Lcom/whoop/service/network/model/cycles/Activity;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    check-cast p1, Lcom/whoop/service/network/model/cycles/Activity;

    invoke-virtual {p1}, Lcom/whoop/service/network/model/cycles/Activity;->getId()I

    move-result p1

    iget v0, p0, Lcom/whoop/service/network/model/cycles/Activity;->id:I

    if-ne p1, v0, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    return v1
.end method

.method public getActivityState()Lcom/whoop/domain/model/ActivityState;
    .locals 2

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/whoop/service/network/model/cycles/Activity;->activityState:Lcom/whoop/domain/model/ActivityState;

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/whoop/service/network/model/cycles/Activity;->state:Ljava/lang/String;

    invoke-static {v0}, Lcom/whoop/domain/model/ActivityState;->fromValue(Ljava/lang/String;)Lcom/whoop/domain/model/ActivityState;

    move-result-object v0

    iput-object v0, p0, Lcom/whoop/service/network/model/cycles/Activity;->activityState:Lcom/whoop/domain/model/ActivityState;

    sget-object v1, Lcom/whoop/domain/model/ActivityState;->SCHEDULED:Lcom/whoop/domain/model/ActivityState;

    if-ne v0, v1, :cond_0

    iget-object v0, p0, Lcom/whoop/service/network/model/cycles/Activity;->during:Lcom/whoop/service/network/model/cycles/Period;

    invoke-virtual {v0}, Lcom/whoop/service/network/model/cycles/Period;->getUpper()Lorg/joda/time/DateTime;

    move-result-object v0

    invoke-virtual {v0}, Lorg/joda/time/base/AbstractInstant;->isBeforeNow()Z

    move-result v0

    if-eqz v0, :cond_0

    sget-object v0, Lcom/whoop/domain/model/ActivityState;->PENDING:Lcom/whoop/domain/model/ActivityState;

    iput-object v0, p0, Lcom/whoop/service/network/model/cycles/Activity;->activityState:Lcom/whoop/domain/model/ActivityState;

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_1

    :cond_0
    :goto_0
    iget-object v0, p0, Lcom/whoop/service/network/model/cycles/Activity;->activityState:Lcom/whoop/domain/model/ActivityState;

    monitor-exit p0

    return-object v0

    :goto_1
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public getDisplayName(Landroid/content/Context;)Ljava/lang/String;
    .locals 1

    invoke-virtual {p0}, Lcom/whoop/service/network/model/cycles/Activity;->getDisplayNameResource()I

    move-result v0

    invoke-virtual {p1, v0}, Landroid/content/Context;->getString(I)Ljava/lang/String;

    move-result-object p1

    return-object p1
.end method

.method public abstract getDisplayNameResource()I
.end method

.method public getDuring()Lcom/whoop/service/network/model/cycles/Period;
    .locals 4

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Lcom/whoop/service/network/model/cycles/Activity;->offsetDuring:Lcom/whoop/service/network/model/cycles/Period;

    if-nez v0, :cond_0

    invoke-static {}, Lorg/joda/time/DateTimeZone;->getDefault()Lorg/joda/time/DateTimeZone;

    move-result-object v0

    new-instance v1, Lcom/whoop/service/network/model/cycles/Period;

    iget-object v2, p0, Lcom/whoop/service/network/model/cycles/Activity;->during:Lcom/whoop/service/network/model/cycles/Period;

    invoke-virtual {v2}, Lcom/whoop/service/network/model/cycles/Period;->getLower()Lorg/joda/time/DateTime;

    move-result-object v2

    invoke-virtual {v2, v0}, Lorg/joda/time/DateTime;->withZone(Lorg/joda/time/DateTimeZone;)Lorg/joda/time/DateTime;

    move-result-object v2

    iget-object v3, p0, Lcom/whoop/service/network/model/cycles/Activity;->during:Lcom/whoop/service/network/model/cycles/Period;

    invoke-virtual {v3}, Lcom/whoop/service/network/model/cycles/Period;->getUpper()Lorg/joda/time/DateTime;

    move-result-object v3

    invoke-virtual {v3, v0}, Lorg/joda/time/DateTime;->withZone(Lorg/joda/time/DateTimeZone;)Lorg/joda/time/DateTime;

    move-result-object v0

    invoke-direct {v1, v2, v0}, Lcom/whoop/service/network/model/cycles/Period;-><init>(Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;)V

    iput-object v1, p0, Lcom/whoop/service/network/model/cycles/Activity;->offsetDuring:Lcom/whoop/service/network/model/cycles/Period;

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_1

    :cond_0
    :goto_0
    iget-object v0, p0, Lcom/whoop/service/network/model/cycles/Activity;->offsetDuring:Lcom/whoop/service/network/model/cycles/Period;

    monitor-exit p0

    return-object v0

    :goto_1
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public getId()I
    .locals 1

    iget v0, p0, Lcom/whoop/service/network/model/cycles/Activity;->id:I

    return v0
.end method

.method public abstract getNameKey()Ljava/lang/String;
.end method

.method public getScore()D
    .locals 2

    iget-wide v0, p0, Lcom/whoop/service/network/model/cycles/Activity;->score:D

    return-wide v0
.end method

.method public getState()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/service/network/model/cycles/Activity;->state:Ljava/lang/String;

    return-object v0
.end method

.method public getSurveyResponseId()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lcom/whoop/service/network/model/cycles/Activity;->surveyResponseId:Ljava/lang/Integer;

    return-object v0
.end method

.method public getTimezoneOffset()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/service/network/model/cycles/Activity;->timezoneOffset:Ljava/lang/String;

    return-object v0
.end method

.method public isResponded()Z
    .locals 1

    iget-boolean v0, p0, Lcom/whoop/service/network/model/cycles/Activity;->responded:Z

    return v0
.end method

.method public printDuring()Ljava/lang/String;
    .locals 2

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "("

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Lcom/whoop/service/network/model/cycles/Activity;->during:Lcom/whoop/service/network/model/cycles/Period;

    invoke-virtual {v1}, Lcom/whoop/service/network/model/cycles/Period;->getLower()Lorg/joda/time/DateTime;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, " - "

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/whoop/service/network/model/cycles/Activity;->during:Lcom/whoop/service/network/model/cycles/Period;

    invoke-virtual {v1}, Lcom/whoop/service/network/model/cycles/Period;->getUpper()Lorg/joda/time/DateTime;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ")"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public toAnalyticsFormat(ILjava/lang/String;)Ljava/util/HashMap;
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(I",
            "Ljava/lang/String;",
            ")",
            "Ljava/util/HashMap<",
            "Ljava/lang/String;",
            "Ljava/lang/Object;",
            ">;"
        }
    .end annotation

    new-instance v0, Ljava/util/HashMap;

    invoke-direct {v0}, Ljava/util/HashMap;-><init>()V

    iget-object v1, p0, Lcom/whoop/service/network/model/cycles/Activity;->during:Lcom/whoop/service/network/model/cycles/Period;

    invoke-virtual {v1}, Lcom/whoop/service/network/model/cycles/Period;->getLower()Lorg/joda/time/DateTime;

    move-result-object v1

    const-string v2, "startTime"

    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    iget-object v1, p0, Lcom/whoop/service/network/model/cycles/Activity;->during:Lcom/whoop/service/network/model/cycles/Period;

    invoke-virtual {v1}, Lcom/whoop/service/network/model/cycles/Period;->getUpper()Lorg/joda/time/DateTime;

    move-result-object v1

    const-string v2, "endTime"

    invoke-virtual {v0, v2, v1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string v1, "placement"

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {v0, v1, p1}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const-string p1, "activity"

    invoke-virtual {v0, p1, p2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Activity{id="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget v1, p0, Lcom/whoop/service/network/model/cycles/Activity;->id:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", state=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/whoop/service/network/model/cycles/Activity;->state:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "\', activityState="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/whoop/service/network/model/cycles/Activity;->activityState:Lcom/whoop/domain/model/ActivityState;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", score="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v1, p0, Lcom/whoop/service/network/model/cycles/Activity;->score:D

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    const-string v1, ", during="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/whoop/service/network/model/cycles/Activity;->during:Lcom/whoop/service/network/model/cycles/Period;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", offsetDuring="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/whoop/service/network/model/cycles/Activity;->offsetDuring:Lcom/whoop/service/network/model/cycles/Period;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", timezoneOffset=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/whoop/service/network/model/cycles/Activity;->timezoneOffset:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "\', responded="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-boolean v1, p0, Lcom/whoop/service/network/model/cycles/Activity;->responded:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", surveyResponseId="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/whoop/service/network/model/cycles/Activity;->surveyResponseId:Ljava/lang/Integer;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const/16 v1, 0x7d

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
