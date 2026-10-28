.class public Lcom/whoop/service/network/model/cycles/SleepActivity;
.super Lcom/whoop/service/network/model/cycles/Activity;
.source "SourceFile"


# instance fields
.field private transient awakeDurationAfterCalculation:Lor2/z1;

.field protected cyclesCount:Ljava/lang/Integer;

.field protected disturbanceCount:Ljava/lang/Integer;

.field private transient inBed:Lor2/z1;

.field protected inBedDuration:Ljava/lang/Long;

.field private isNap:Z

.field protected latencyDuration:Ljava/lang/Long;

.field private transient latencyDurationObj:Lor2/z1;

.field private transient lightDurationAfterCalculation:Lor2/z1;

.field private transient lightSleep:Lor2/z1;

.field protected lightSleepDuration:Ljava/lang/Long;

.field private transient noData:Lor2/z1;

.field protected noDataDuration:Ljava/lang/Long;

.field private transient quality:Lor2/z1;

.field protected qualityDuration:Ljava/lang/Long;

.field private transient remSleep:Lor2/z1;

.field protected remSleepDuration:Ljava/lang/Long;

.field private respiratoryRate:Ljava/lang/Double;

.field private transient slowWaveSleep:Lor2/z1;

.field protected slowWaveSleepDuration:Ljava/lang/Long;

.field private transient wake:Lor2/z1;

.field protected wakeDuration:Ljava/lang/Long;


# direct methods
.method public constructor <init>()V
    .locals 0

    .line 1
    invoke-direct {p0}, Lcom/whoop/service/network/model/cycles/Activity;-><init>()V

    return-void
.end method

.method public constructor <init>(I)V
    .locals 0

    .line 2
    invoke-direct {p0, p1}, Lcom/whoop/service/network/model/cycles/Activity;-><init>(I)V

    return-void
.end method

.method public constructor <init>(ILjava/lang/String;DLcom/whoop/service/network/model/cycles/Period;Ljava/lang/String;ZLjava/lang/Integer;ZLjava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/Integer;Ljava/lang/Double;Ljava/lang/Integer;)V
    .locals 0

    .line 3
    invoke-direct/range {p0 .. p8}, Lcom/whoop/service/network/model/cycles/Activity;-><init>(ILjava/lang/String;DLcom/whoop/service/network/model/cycles/Period;Ljava/lang/String;ZLjava/lang/Integer;)V

    .line 4
    iput-boolean p9, p0, Lcom/whoop/service/network/model/cycles/SleepActivity;->isNap:Z

    .line 5
    iput-object p10, p0, Lcom/whoop/service/network/model/cycles/SleepActivity;->qualityDuration:Ljava/lang/Long;

    .line 6
    iput-object p11, p0, Lcom/whoop/service/network/model/cycles/SleepActivity;->inBedDuration:Ljava/lang/Long;

    .line 7
    iput-object p12, p0, Lcom/whoop/service/network/model/cycles/SleepActivity;->latencyDuration:Ljava/lang/Long;

    .line 8
    iput-object p13, p0, Lcom/whoop/service/network/model/cycles/SleepActivity;->wakeDuration:Ljava/lang/Long;

    .line 9
    iput-object p14, p0, Lcom/whoop/service/network/model/cycles/SleepActivity;->lightSleepDuration:Ljava/lang/Long;

    .line 10
    iput-object p15, p0, Lcom/whoop/service/network/model/cycles/SleepActivity;->slowWaveSleepDuration:Ljava/lang/Long;

    move-object/from16 p1, p16

    .line 11
    iput-object p1, p0, Lcom/whoop/service/network/model/cycles/SleepActivity;->remSleepDuration:Ljava/lang/Long;

    move-object/from16 p1, p17

    .line 12
    iput-object p1, p0, Lcom/whoop/service/network/model/cycles/SleepActivity;->noDataDuration:Ljava/lang/Long;

    move-object/from16 p1, p18

    .line 13
    iput-object p1, p0, Lcom/whoop/service/network/model/cycles/SleepActivity;->disturbanceCount:Ljava/lang/Integer;

    move-object/from16 p1, p19

    .line 14
    iput-object p1, p0, Lcom/whoop/service/network/model/cycles/SleepActivity;->respiratoryRate:Ljava/lang/Double;

    move-object/from16 p1, p20

    .line 15
    iput-object p1, p0, Lcom/whoop/service/network/model/cycles/SleepActivity;->cyclesCount:Ljava/lang/Integer;

    return-void
.end method

.method public constructor <init>(Z)V
    .locals 0

    .line 16
    invoke-direct {p0}, Lcom/whoop/service/network/model/cycles/Activity;-><init>()V

    .line 17
    iput-boolean p1, p0, Lcom/whoop/service/network/model/cycles/SleepActivity;->isNap:Z

    return-void
.end method


# virtual methods
.method public getAwakeDurationAfterCalculation()Lor2/z1;
    .locals 6

    iget-object v0, p0, Lcom/whoop/service/network/model/cycles/SleepActivity;->awakeDurationAfterCalculation:Lor2/z1;

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/whoop/service/network/model/cycles/SleepActivity;->inBedDuration:Ljava/lang/Long;

    if-eqz v0, :cond_0

    iget-object v1, p0, Lcom/whoop/service/network/model/cycles/SleepActivity;->qualityDuration:Ljava/lang/Long;

    if-eqz v1, :cond_0

    iget-object v1, p0, Lcom/whoop/service/network/model/cycles/SleepActivity;->noDataDuration:Ljava/lang/Long;

    if-eqz v1, :cond_0

    new-instance v1, Lor2/z1;

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v2

    iget-object v0, p0, Lcom/whoop/service/network/model/cycles/SleepActivity;->qualityDuration:Ljava/lang/Long;

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v4

    sub-long/2addr v2, v4

    iget-object v0, p0, Lcom/whoop/service/network/model/cycles/SleepActivity;->noDataDuration:Ljava/lang/Long;

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v4

    sub-long/2addr v2, v4

    invoke-direct {v1, v2, v3}, Lor2/z1;-><init>(J)V

    iput-object v1, p0, Lcom/whoop/service/network/model/cycles/SleepActivity;->awakeDurationAfterCalculation:Lor2/z1;

    :cond_0
    iget-object v0, p0, Lcom/whoop/service/network/model/cycles/SleepActivity;->awakeDurationAfterCalculation:Lor2/z1;

    return-object v0
.end method

.method public getCyclesCount()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lcom/whoop/service/network/model/cycles/SleepActivity;->cyclesCount:Ljava/lang/Integer;

    return-object v0
.end method

.method public getDisplayNameResource()I
    .locals 1

    invoke-virtual {p0}, Lcom/whoop/service/network/model/cycles/SleepActivity;->isNap()Z

    move-result v0

    if-eqz v0, :cond_0

    sget v0, Luv0/c;->a:I

    return v0

    :cond_0
    sget v0, Luv0/c;->b:I

    return v0
.end method

.method public getDisturbanceCount()Ljava/lang/Integer;
    .locals 1

    iget-object v0, p0, Lcom/whoop/service/network/model/cycles/SleepActivity;->disturbanceCount:Ljava/lang/Integer;

    return-object v0
.end method

.method public getInBedDuration()Lor2/z1;
    .locals 4

    iget-object v0, p0, Lcom/whoop/service/network/model/cycles/SleepActivity;->inBed:Lor2/z1;

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/whoop/service/network/model/cycles/SleepActivity;->inBedDuration:Ljava/lang/Long;

    if-eqz v0, :cond_0

    new-instance v1, Lor2/z1;

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v2

    invoke-direct {v1, v2, v3}, Lor2/z1;-><init>(J)V

    iput-object v1, p0, Lcom/whoop/service/network/model/cycles/SleepActivity;->inBed:Lor2/z1;

    :cond_0
    iget-object v0, p0, Lcom/whoop/service/network/model/cycles/SleepActivity;->inBed:Lor2/z1;

    return-object v0
.end method

.method public getLatencyDuration()Lor2/z1;
    .locals 4

    iget-object v0, p0, Lcom/whoop/service/network/model/cycles/SleepActivity;->latencyDurationObj:Lor2/z1;

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/whoop/service/network/model/cycles/SleepActivity;->latencyDuration:Ljava/lang/Long;

    if-eqz v0, :cond_0

    new-instance v1, Lor2/z1;

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v2

    invoke-direct {v1, v2, v3}, Lor2/z1;-><init>(J)V

    iput-object v1, p0, Lcom/whoop/service/network/model/cycles/SleepActivity;->latencyDurationObj:Lor2/z1;

    :cond_0
    iget-object v0, p0, Lcom/whoop/service/network/model/cycles/SleepActivity;->latencyDurationObj:Lor2/z1;

    return-object v0
.end method

.method public getLightDurationAfterCalculation()Lor2/z1;
    .locals 6

    iget-object v0, p0, Lcom/whoop/service/network/model/cycles/SleepActivity;->lightDurationAfterCalculation:Lor2/z1;

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/whoop/service/network/model/cycles/SleepActivity;->qualityDuration:Ljava/lang/Long;

    if-eqz v0, :cond_0

    iget-object v1, p0, Lcom/whoop/service/network/model/cycles/SleepActivity;->remSleepDuration:Ljava/lang/Long;

    if-eqz v1, :cond_0

    iget-object v1, p0, Lcom/whoop/service/network/model/cycles/SleepActivity;->slowWaveSleepDuration:Ljava/lang/Long;

    if-eqz v1, :cond_0

    new-instance v1, Lor2/z1;

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v2

    iget-object v0, p0, Lcom/whoop/service/network/model/cycles/SleepActivity;->remSleepDuration:Ljava/lang/Long;

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v4

    sub-long/2addr v2, v4

    iget-object v0, p0, Lcom/whoop/service/network/model/cycles/SleepActivity;->slowWaveSleepDuration:Ljava/lang/Long;

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v4

    sub-long/2addr v2, v4

    invoke-direct {v1, v2, v3}, Lor2/z1;-><init>(J)V

    iput-object v1, p0, Lcom/whoop/service/network/model/cycles/SleepActivity;->lightDurationAfterCalculation:Lor2/z1;

    :cond_0
    iget-object v0, p0, Lcom/whoop/service/network/model/cycles/SleepActivity;->lightDurationAfterCalculation:Lor2/z1;

    return-object v0
.end method

.method public getLightSleepDuration()Lor2/z1;
    .locals 4

    iget-object v0, p0, Lcom/whoop/service/network/model/cycles/SleepActivity;->lightSleep:Lor2/z1;

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/whoop/service/network/model/cycles/SleepActivity;->lightSleepDuration:Ljava/lang/Long;

    if-eqz v0, :cond_0

    new-instance v1, Lor2/z1;

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v2

    invoke-direct {v1, v2, v3}, Lor2/z1;-><init>(J)V

    iput-object v1, p0, Lcom/whoop/service/network/model/cycles/SleepActivity;->lightSleep:Lor2/z1;

    :cond_0
    iget-object v0, p0, Lcom/whoop/service/network/model/cycles/SleepActivity;->lightSleep:Lor2/z1;

    return-object v0
.end method

.method public getNameKey()Ljava/lang/String;
    .locals 1

    iget-boolean v0, p0, Lcom/whoop/service/network/model/cycles/SleepActivity;->isNap:Z

    if-eqz v0, :cond_0

    const-string v0, "Nap"

    return-object v0

    :cond_0
    const-string v0, "Sleep"

    return-object v0
.end method

.method public getNoDataDuration()Lor2/z1;
    .locals 4

    iget-object v0, p0, Lcom/whoop/service/network/model/cycles/SleepActivity;->noData:Lor2/z1;

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/whoop/service/network/model/cycles/SleepActivity;->noDataDuration:Ljava/lang/Long;

    if-eqz v0, :cond_0

    new-instance v1, Lor2/z1;

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v2

    invoke-direct {v1, v2, v3}, Lor2/z1;-><init>(J)V

    iput-object v1, p0, Lcom/whoop/service/network/model/cycles/SleepActivity;->noData:Lor2/z1;

    :cond_0
    iget-object v0, p0, Lcom/whoop/service/network/model/cycles/SleepActivity;->noData:Lor2/z1;

    return-object v0
.end method

.method public getQualityDuration()Lor2/z1;
    .locals 4

    iget-object v0, p0, Lcom/whoop/service/network/model/cycles/SleepActivity;->quality:Lor2/z1;

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/whoop/service/network/model/cycles/SleepActivity;->qualityDuration:Ljava/lang/Long;

    if-eqz v0, :cond_0

    new-instance v1, Lor2/z1;

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v2

    invoke-direct {v1, v2, v3}, Lor2/z1;-><init>(J)V

    iput-object v1, p0, Lcom/whoop/service/network/model/cycles/SleepActivity;->quality:Lor2/z1;

    :cond_0
    iget-object v0, p0, Lcom/whoop/service/network/model/cycles/SleepActivity;->quality:Lor2/z1;

    return-object v0
.end method

.method public getRemSleepDuration()Lor2/z1;
    .locals 4

    iget-object v0, p0, Lcom/whoop/service/network/model/cycles/SleepActivity;->remSleep:Lor2/z1;

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/whoop/service/network/model/cycles/SleepActivity;->remSleepDuration:Ljava/lang/Long;

    if-eqz v0, :cond_0

    new-instance v1, Lor2/z1;

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v2

    invoke-direct {v1, v2, v3}, Lor2/z1;-><init>(J)V

    iput-object v1, p0, Lcom/whoop/service/network/model/cycles/SleepActivity;->remSleep:Lor2/z1;

    :cond_0
    iget-object v0, p0, Lcom/whoop/service/network/model/cycles/SleepActivity;->remSleep:Lor2/z1;

    return-object v0
.end method

.method public getRespiratoryRate()Ljava/lang/Double;
    .locals 1

    iget-object v0, p0, Lcom/whoop/service/network/model/cycles/SleepActivity;->respiratoryRate:Ljava/lang/Double;

    return-object v0
.end method

.method public getSleepEfficiency()Ljava/lang/Integer;
    .locals 4

    invoke-virtual {p0}, Lcom/whoop/service/network/model/cycles/SleepActivity;->getInBedDuration()Lor2/z1;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-virtual {p0}, Lcom/whoop/service/network/model/cycles/SleepActivity;->getInBedDuration()Lor2/z1;

    move-result-object v0

    invoke-virtual {v0}, Lor2/z1;->b()J

    move-result-wide v0

    const-wide/16 v2, 0x0

    cmp-long v0, v0, v2

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Lcom/whoop/service/network/model/cycles/SleepActivity;->getQualityDuration()Lor2/z1;

    move-result-object v0

    invoke-virtual {v0}, Lor2/z1;->b()J

    move-result-wide v0

    long-to-double v0, v0

    invoke-virtual {p0}, Lcom/whoop/service/network/model/cycles/SleepActivity;->getInBedDuration()Lor2/z1;

    move-result-object v2

    invoke-virtual {v2}, Lor2/z1;->b()J

    move-result-wide v2

    long-to-double v2, v2

    div-double/2addr v0, v2

    const-wide/high16 v2, 0x4059000000000000L    # 100.0

    mul-double/2addr v0, v2

    invoke-static {v0, v1}, Ljava/lang/Math;->round(D)J

    move-result-wide v0

    long-to-int v0, v0

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    return-object v0

    :cond_1
    :goto_0
    const/4 v0, 0x0

    return-object v0
.end method

.method public getSlowWaveSleepDuration()Lor2/z1;
    .locals 4

    iget-object v0, p0, Lcom/whoop/service/network/model/cycles/SleepActivity;->slowWaveSleep:Lor2/z1;

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/whoop/service/network/model/cycles/SleepActivity;->slowWaveSleepDuration:Ljava/lang/Long;

    if-eqz v0, :cond_0

    new-instance v1, Lor2/z1;

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v2

    invoke-direct {v1, v2, v3}, Lor2/z1;-><init>(J)V

    iput-object v1, p0, Lcom/whoop/service/network/model/cycles/SleepActivity;->slowWaveSleep:Lor2/z1;

    :cond_0
    iget-object v0, p0, Lcom/whoop/service/network/model/cycles/SleepActivity;->slowWaveSleep:Lor2/z1;

    return-object v0
.end method

.method public getWakeDuration()Lor2/z1;
    .locals 4

    iget-object v0, p0, Lcom/whoop/service/network/model/cycles/SleepActivity;->wake:Lor2/z1;

    if-nez v0, :cond_0

    iget-object v0, p0, Lcom/whoop/service/network/model/cycles/SleepActivity;->wakeDuration:Ljava/lang/Long;

    if-eqz v0, :cond_0

    new-instance v1, Lor2/z1;

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v2

    invoke-direct {v1, v2, v3}, Lor2/z1;-><init>(J)V

    iput-object v1, p0, Lcom/whoop/service/network/model/cycles/SleepActivity;->wake:Lor2/z1;

    :cond_0
    iget-object v0, p0, Lcom/whoop/service/network/model/cycles/SleepActivity;->wake:Lor2/z1;

    return-object v0
.end method

.method public isNap()Z
    .locals 1

    iget-boolean v0, p0, Lcom/whoop/service/network/model/cycles/SleepActivity;->isNap:Z

    return v0
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "SleepActivity{isNap="

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-boolean v1, p0, Lcom/whoop/service/network/model/cycles/SleepActivity;->isNap:Z

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;

    const-string v1, ", qualityDuration="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/whoop/service/network/model/cycles/SleepActivity;->qualityDuration:Ljava/lang/Long;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", quality="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/whoop/service/network/model/cycles/SleepActivity;->quality:Lor2/z1;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", inBedDuration="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/whoop/service/network/model/cycles/SleepActivity;->inBedDuration:Ljava/lang/Long;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", inBed="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/whoop/service/network/model/cycles/SleepActivity;->inBed:Lor2/z1;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", latencyDuration="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/whoop/service/network/model/cycles/SleepActivity;->latencyDuration:Ljava/lang/Long;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", latencyDurationObj="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/whoop/service/network/model/cycles/SleepActivity;->latencyDurationObj:Lor2/z1;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", wakeDuration="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/whoop/service/network/model/cycles/SleepActivity;->wakeDuration:Ljava/lang/Long;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", wake="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/whoop/service/network/model/cycles/SleepActivity;->wake:Lor2/z1;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", lightSleepDuration="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/whoop/service/network/model/cycles/SleepActivity;->lightSleepDuration:Ljava/lang/Long;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", lightSleep="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/whoop/service/network/model/cycles/SleepActivity;->lightSleep:Lor2/z1;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", slowWaveSleepDuration="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/whoop/service/network/model/cycles/SleepActivity;->slowWaveSleepDuration:Ljava/lang/Long;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", slowWaveSleep="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/whoop/service/network/model/cycles/SleepActivity;->slowWaveSleep:Lor2/z1;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", remSleepDuration="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/whoop/service/network/model/cycles/SleepActivity;->remSleepDuration:Ljava/lang/Long;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", remSleep="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/whoop/service/network/model/cycles/SleepActivity;->remSleep:Lor2/z1;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", noDataDuration="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/whoop/service/network/model/cycles/SleepActivity;->noDataDuration:Ljava/lang/Long;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", noData="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/whoop/service/network/model/cycles/SleepActivity;->noData:Lor2/z1;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", cyclesCount="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/whoop/service/network/model/cycles/SleepActivity;->cyclesCount:Ljava/lang/Integer;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", disturbanceCount="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/whoop/service/network/model/cycles/SleepActivity;->disturbanceCount:Ljava/lang/Integer;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", awakeDurationAfterCalculation="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/whoop/service/network/model/cycles/SleepActivity;->awakeDurationAfterCalculation:Lor2/z1;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", lightDurationAfterCalculation="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/whoop/service/network/model/cycles/SleepActivity;->lightDurationAfterCalculation:Lor2/z1;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", respiratoryRate="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/whoop/service/network/model/cycles/SleepActivity;->respiratoryRate:Ljava/lang/Double;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", super="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-super {p0}, Lcom/whoop/service/network/model/cycles/Activity;->toString()Ljava/lang/String;

    move-result-object v1

    const/16 v2, 0x7d

    invoke-static {v0, v1, v2}, Lm4/a;->j(Ljava/lang/StringBuilder;Ljava/lang/String;C)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
