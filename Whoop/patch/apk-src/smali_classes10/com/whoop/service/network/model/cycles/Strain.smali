.class public Lcom/whoop/service/network/model/cycles/Strain;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final MAX_STRAIN:D = 21.0


# instance fields
.field private transient activityState:Lcom/whoop/domain/model/ActivityState;

.field private averageHeartRate:F

.field private transient kilocalories:I

.field private kilojoules:D

.field private maxHeartRate:I

.field private rawScore:D

.field private score:D

.field private state:Ljava/lang/String;

.field private workouts:[Lcom/whoop/service/network/model/cycles/Workout;

.field private transient workoutsList:Ljava/util/List;
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "Ljava/util/List<",
            "Lcom/whoop/service/network/model/cycles/Workout;",
            ">;"
        }
    .end annotation
.end field


# direct methods
.method public constructor <init>(Ljava/lang/String;FIDDD[Lcom/whoop/service/network/model/cycles/Workout;)V
    .locals 1

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    const/4 v0, -0x1

    iput v0, p0, Lcom/whoop/service/network/model/cycles/Strain;->kilocalories:I

    iput-object p1, p0, Lcom/whoop/service/network/model/cycles/Strain;->state:Ljava/lang/String;

    iput p2, p0, Lcom/whoop/service/network/model/cycles/Strain;->averageHeartRate:F

    iput p3, p0, Lcom/whoop/service/network/model/cycles/Strain;->maxHeartRate:I

    iput-wide p4, p0, Lcom/whoop/service/network/model/cycles/Strain;->kilojoules:D

    iput-wide p6, p0, Lcom/whoop/service/network/model/cycles/Strain;->score:D

    iput-wide p8, p0, Lcom/whoop/service/network/model/cycles/Strain;->rawScore:D

    iput-object p10, p0, Lcom/whoop/service/network/model/cycles/Strain;->workouts:[Lcom/whoop/service/network/model/cycles/Workout;

    return-void
.end method


# virtual methods
.method public getActivityState()Lcom/whoop/domain/model/ActivityState;
    .locals 1

    sget-object v0, Lcom/whoop/domain/model/ActivityState;->UNKNOWN:Lcom/whoop/domain/model/ActivityState;

    return-object v0
.end method

.method public getAverageHeartRate()F
    .locals 1

    iget v0, p0, Lcom/whoop/service/network/model/cycles/Strain;->averageHeartRate:F

    return v0
.end method

.method public getKilocalories()I
    .locals 2

    iget v0, p0, Lcom/whoop/service/network/model/cycles/Strain;->kilocalories:I

    if-gtz v0, :cond_0

    iget-wide v0, p0, Lcom/whoop/service/network/model/cycles/Strain;->kilojoules:D

    invoke-static {v0, v1}, Lor2/l;->d(D)I

    move-result v0

    iput v0, p0, Lcom/whoop/service/network/model/cycles/Strain;->kilocalories:I

    :cond_0
    iget v0, p0, Lcom/whoop/service/network/model/cycles/Strain;->kilocalories:I

    return v0
.end method

.method public getKilojoules()D
    .locals 2

    iget-wide v0, p0, Lcom/whoop/service/network/model/cycles/Strain;->kilojoules:D

    return-wide v0
.end method

.method public getMaxHeartRate()I
    .locals 1

    iget v0, p0, Lcom/whoop/service/network/model/cycles/Strain;->maxHeartRate:I

    return v0
.end method

.method public getRawScore()D
    .locals 2

    iget-wide v0, p0, Lcom/whoop/service/network/model/cycles/Strain;->rawScore:D

    return-wide v0
.end method

.method public getScore()D
    .locals 2

    iget-wide v0, p0, Lcom/whoop/service/network/model/cycles/Strain;->score:D

    return-wide v0
.end method

.method public getScorePercent()D
    .locals 4

    invoke-virtual {p0}, Lcom/whoop/service/network/model/cycles/Strain;->getScore()D

    move-result-wide v0

    const-wide/high16 v2, 0x4035000000000000L    # 21.0

    div-double/2addr v0, v2

    return-wide v0
.end method

.method public getWorkouts()Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "()",
            "Ljava/util/List<",
            "Lcom/whoop/service/network/model/cycles/Workout;",
            ">;"
        }
    .end annotation

    iget-object v0, p0, Lcom/whoop/service/network/model/cycles/Strain;->workoutsList:Ljava/util/List;

    if-nez v0, :cond_1

    iget-object v0, p0, Lcom/whoop/service/network/model/cycles/Strain;->workouts:[Lcom/whoop/service/network/model/cycles/Workout;

    if-nez v0, :cond_0

    sget-object v0, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    return-object v0

    :cond_0
    invoke-static {v0}, Ljava/util/Arrays;->asList([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    iput-object v0, p0, Lcom/whoop/service/network/model/cycles/Strain;->workoutsList:Ljava/util/List;

    :cond_1
    iget-object v0, p0, Lcom/whoop/service/network/model/cycles/Strain;->workoutsList:Ljava/util/List;

    return-object v0
.end method

.method public toString()Ljava/lang/String;
    .locals 3

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Strain{state=\'"

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v1, p0, Lcom/whoop/service/network/model/cycles/Strain;->state:Ljava/lang/String;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, "\', activityState="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/whoop/service/network/model/cycles/Strain;->activityState:Lcom/whoop/domain/model/ActivityState;

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v1, ", averageHeartRate="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/whoop/service/network/model/cycles/Strain;->averageHeartRate:F

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;

    const-string v1, ", maxHeartRate="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/whoop/service/network/model/cycles/Strain;->maxHeartRate:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", kilojoules="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v1, p0, Lcom/whoop/service/network/model/cycles/Strain;->kilojoules:D

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    const-string v1, ", kilocalories="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget v1, p0, Lcom/whoop/service/network/model/cycles/Strain;->kilocalories:I

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v1, ", score="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v1, p0, Lcom/whoop/service/network/model/cycles/Strain;->score:D

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    const-string v1, ", rawScore="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-wide v1, p0, Lcom/whoop/service/network/model/cycles/Strain;->rawScore:D

    invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;

    const-string v1, ", workouts="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/whoop/service/network/model/cycles/Strain;->workouts:[Lcom/whoop/service/network/model/cycles/Workout;

    invoke-static {v1}, Ljava/util/Arrays;->toString([Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v1, ", workoutsList="

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    iget-object v1, p0, Lcom/whoop/service/network/model/cycles/Strain;->workoutsList:Ljava/util/List;

    const/16 v2, 0x7d

    invoke-static {v0, v1, v2}, Lhc3/i;->h(Ljava/lang/StringBuilder;Ljava/util/List;C)Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method
