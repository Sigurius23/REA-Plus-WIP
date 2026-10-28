.class public Lcom/whoop/service/network/model/cycles/Sleep;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field private transient activityState:Lcom/whoop/domain/model/ActivityState;

.field private final id:I

.field private final naps:[Lcom/whoop/service/network/model/cycles/SleepActivity;

.field private transient napsList:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/whoop/service/network/model/cycles/SleepActivity;",
            ">;"
        }
    .end annotation
.end field

.field private final needBreakdown:Lcom/whoop/data/local/room/entity/SleepNeedBreakdown;

.field private transient quality:Lor2/z1;

.field private final qualityDuration:Ljava/lang/Long;

.field private final score:I

.field private final sleeps:[Lcom/whoop/service/network/model/cycles/SleepActivity;

.field private transient sleepsList:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/whoop/service/network/model/cycles/SleepActivity;",
            ">;"
        }
    .end annotation
.end field

.field private final state:Ljava/lang/String;


# direct methods
.method public constructor <init>(ILjava/lang/String;ILjava/lang/Long;Lcom/whoop/data/local/room/entity/SleepNeedBreakdown;[Lcom/whoop/service/network/model/cycles/SleepActivity;[Lcom/whoop/service/network/model/cycles/SleepActivity;)V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput p1, p0, Lcom/whoop/service/network/model/cycles/Sleep;->id:I

    iput-object p2, p0, Lcom/whoop/service/network/model/cycles/Sleep;->state:Ljava/lang/String;

    iput p3, p0, Lcom/whoop/service/network/model/cycles/Sleep;->score:I

    iput-object p4, p0, Lcom/whoop/service/network/model/cycles/Sleep;->qualityDuration:Ljava/lang/Long;

    iput-object p5, p0, Lcom/whoop/service/network/model/cycles/Sleep;->needBreakdown:Lcom/whoop/data/local/room/entity/SleepNeedBreakdown;

    iput-object p6, p0, Lcom/whoop/service/network/model/cycles/Sleep;->naps:[Lcom/whoop/service/network/model/cycles/SleepActivity;

    iput-object p7, p0, Lcom/whoop/service/network/model/cycles/Sleep;->sleeps:[Lcom/whoop/service/network/model/cycles/SleepActivity;

    return-void
.end method


# virtual methods
.method public getActivityState()Lcom/whoop/domain/model/ActivityState;
    .locals 1

    iget-object v0, p0, Lcom/whoop/service/network/model/cycles/Sleep;->activityState:Lcom/whoop/domain/model/ActivityState;

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/whoop/service/network/model/cycles/Sleep;->state:Ljava/lang/String;

    invoke-static {v0}, Lcom/whoop/domain/model/ActivityState;->fromValue(Ljava/lang/String;)Lcom/whoop/domain/model/ActivityState;

    move-result-object v0

    iput-object v0, p0, Lcom/whoop/service/network/model/cycles/Sleep;->activityState:Lcom/whoop/domain/model/ActivityState;

    :cond_0
    iget-object v0, p0, Lcom/whoop/service/network/model/cycles/Sleep;->activityState:Lcom/whoop/domain/model/ActivityState;

    return-object v0
.end method

.method public getId()I
    .locals 1

    iget v0, p0, Lcom/whoop/service/network/model/cycles/Sleep;->id:I

    return v0
.end method

.method public getNaps()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/whoop/service/network/model/cycles/SleepActivity;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/service/network/model/cycles/Sleep;->napsList:Ljava/util/List;

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/whoop/service/network/model/cycles/Sleep;->naps:[Lcom/whoop/service/network/model/cycles/SleepActivity;

    invoke-static {v0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/whoop/service/network/model/cycles/Sleep;->napsList:Ljava/util/List;

    :cond_0
    iget-object v0, p0, Lcom/whoop/service/network/model/cycles/Sleep;->napsList:Ljava/util/List;

    return-object v0
.end method

.method public getNeedBreakdown()Lcom/whoop/data/local/room/entity/SleepNeedBreakdown;
    .locals 1

    iget-object v0, p0, Lcom/whoop/service/network/model/cycles/Sleep;->needBreakdown:Lcom/whoop/data/local/room/entity/SleepNeedBreakdown;

    return-object v0
.end method

.method public getQualityDuration()Lor2/z1;
    .locals 4

    iget-object v0, p0, Lcom/whoop/service/network/model/cycles/Sleep;->quality:Lor2/z1;

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/whoop/service/network/model/cycles/Sleep;->qualityDuration:Ljava/lang/Long;

    if-eqz v0, :cond_0

    new-instance v1, Lor2/z1;

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v2

    invoke-direct {v1, v2, v3}, Lor2/z1;-><init>(J)V

    iput-object v1, p0, Lcom/whoop/service/network/model/cycles/Sleep;->quality:Lor2/z1;

    :cond_0
    iget-object v0, p0, Lcom/whoop/service/network/model/cycles/Sleep;->quality:Lor2/z1;

    return-object v0
.end method

.method public getScore()I
    .locals 1

    iget v0, p0, Lcom/whoop/service/network/model/cycles/Sleep;->score:I

    return v0
.end method

.method public getSignificantSleep()Lcom/whoop/service/network/model/cycles/SleepActivity;
    .locals 2

    invoke-virtual {p0}, Lcom/whoop/service/network/model/cycles/Sleep;->getSleeps()Ljava/util/List;

    move-result-object v0

    invoke-static {v0}, Lce/w;->W(Ljava/util/List;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    return-object v0

    :cond_0
    invoke-virtual {p0}, Lcom/whoop/service/network/model/cycles/Sleep;->getSleeps()Ljava/util/List;

    move-result-object v0

    const/4 v1, 0x0

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/whoop/service/network/model/cycles/SleepActivity;

    return-object v0
.end method

.method public getSleepActivity(I)Lcom/whoop/service/network/model/cycles/SleepActivity;
    .locals 3

    invoke-virtual {p0}, Lcom/whoop/service/network/model/cycles/Sleep;->getSleeps()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/whoop/service/network/model/cycles/SleepActivity;

    invoke-virtual {v1}, Lcom/whoop/service/network/model/cycles/Activity;->getId()I

    move-result v2

    if-ne v2, p1, :cond_0

    return-object v1

    :cond_1
    invoke-virtual {p0}, Lcom/whoop/service/network/model/cycles/Sleep;->getNaps()Ljava/util/List;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :cond_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lcom/whoop/service/network/model/cycles/SleepActivity;

    invoke-virtual {v1}, Lcom/whoop/service/network/model/cycles/Activity;->getId()I

    move-result v2

    if-ne v2, p1, :cond_2

    return-object v1

    :cond_3
    const/4 p1, 0x0

    return-object p1
.end method

.method public getSleeps()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/whoop/service/network/model/cycles/SleepActivity;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/service/network/model/cycles/Sleep;->sleepsList:Ljava/util/List;

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/whoop/service/network/model/cycles/Sleep;->sleeps:[Lcom/whoop/service/network/model/cycles/SleepActivity;

    invoke-static {v0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/whoop/service/network/model/cycles/Sleep;->sleepsList:Ljava/util/List;

    :cond_0
    iget-object v0, p0, Lcom/whoop/service/network/model/cycles/Sleep;->sleepsList:Ljava/util/List;

    return-object v0
.end method

.method public getState()Ljava/lang/String;
    .locals 1

    iget-object v0, p0, Lcom/whoop/service/network/model/cycles/Sleep;->state:Ljava/lang/String;

    return-object v0
.end method

.method public isEmpty()Z
    .locals 4

    iget v0, p0, Lcom/whoop/service/network/model/cycles/Sleep;->id:I

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/whoop/service/network/model/cycles/Sleep;->sleepsList:Ljava/util/List;

    invoke-static {v0}, Lce/w;->W(Ljava/util/List;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/whoop/service/network/model/cycles/Sleep;->qualityDuration:Ljava/lang/Long;

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v0

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-nez v0, :cond_0

    iget v0, p0, Lcom/whoop/service/network/model/cycles/Sleep;->score:I

    if-nez v0, :cond_0

    const/4 v0, 0x1

    return v0

    :cond_0
    const/4 v0, 0x0

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Sleep{id="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget v1, p0, Lcom/whoop/service/network/model/cycles/Sleep;->id:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", state=\'"

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/whoop/service/network/model/cycles/Sleep;->state:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "\', activityState="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/whoop/service/network/model/cycles/Sleep;->activityState:Lcom/whoop/domain/model/ActivityState;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", score="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/whoop/service/network/model/cycles/Sleep;->score:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", qualityDuration="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/whoop/service/network/model/cycles/Sleep;->qualityDuration:Ljava/lang/Long;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", quality="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/whoop/service/network/model/cycles/Sleep;->quality:Lor2/z1;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", needBreakdown="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/whoop/service/network/model/cycles/Sleep;->needBreakdown:Lcom/whoop/data/local/room/entity/SleepNeedBreakdown;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", naps="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/whoop/service/network/model/cycles/Sleep;->naps:[Lcom/whoop/service/network/model/cycles/SleepActivity;

    invoke-static {v1}, Ljava/util/Arrays;->toString([Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", napsList="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/whoop/service/network/model/cycles/Sleep;->napsList:Ljava/util/List;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", sleeps="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/whoop/service/network/model/cycles/Sleep;->sleeps:[Lcom/whoop/service/network/model/cycles/SleepActivity;

    invoke-static {v1}, Ljava/util/Arrays;->toString([Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", sleepsList="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/whoop/service/network/model/cycles/Sleep;->sleepsList:Ljava/util/List;

    const/16 v2, 0x7d

    invoke-static {v0, v1, v2}, Lhc3/i;->h(Ljava/lang/StringBuilder;Ljava/util/List;C)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
