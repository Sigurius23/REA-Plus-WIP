.class public abstract synthetic Le7/h;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static synthetic a(Ljava/lang/String;)Landroid/health/connect/changelog/ChangeLogsRequest$Builder;
    .locals 1

    new-instance v0, Landroid/health/connect/changelog/ChangeLogsRequest$Builder;

    invoke-direct {v0, p0}, Landroid/health/connect/changelog/ChangeLogsRequest$Builder;-><init>(Ljava/lang/String;)V

    return-object v0
.end method

.method public static synthetic b(Landroid/health/connect/datatypes/Metadata;Ljava/time/Instant;Ljava/time/Instant;I)Landroid/health/connect/datatypes/ExerciseSessionRecord$Builder;
    .locals 1

    new-instance v0, Landroid/health/connect/datatypes/ExerciseSessionRecord$Builder;

    invoke-direct {v0, p0, p1, p2, p3}, Landroid/health/connect/datatypes/ExerciseSessionRecord$Builder;-><init>(Landroid/health/connect/datatypes/Metadata;Ljava/time/Instant;Ljava/time/Instant;I)V

    return-object v0
.end method

.method public static synthetic c(Landroid/health/connect/datatypes/Metadata;Ljava/time/Instant;Ljava/time/Instant;D)Landroid/health/connect/datatypes/FloorsClimbedRecord$Builder;
    .locals 6

    new-instance v0, Landroid/health/connect/datatypes/FloorsClimbedRecord$Builder;

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-wide v4, p3

    invoke-direct/range {v0 .. v5}, Landroid/health/connect/datatypes/FloorsClimbedRecord$Builder;-><init>(Landroid/health/connect/datatypes/Metadata;Ljava/time/Instant;Ljava/time/Instant;D)V

    return-object v0
.end method

.method public static synthetic d(Landroid/health/connect/datatypes/Metadata;Ljava/time/Instant;Ljava/time/Instant;Ljava/util/ArrayList;)Landroid/health/connect/datatypes/HeartRateRecord$Builder;
    .locals 1

    new-instance v0, Landroid/health/connect/datatypes/HeartRateRecord$Builder;

    invoke-direct {v0, p0, p1, p2, p3}, Landroid/health/connect/datatypes/HeartRateRecord$Builder;-><init>(Landroid/health/connect/datatypes/Metadata;Ljava/time/Instant;Ljava/time/Instant;Ljava/util/List;)V

    return-object v0
.end method

.method public static synthetic e(JLjava/time/Instant;)Landroid/health/connect/datatypes/HeartRateRecord$HeartRateSample;
    .locals 1

    new-instance v0, Landroid/health/connect/datatypes/HeartRateRecord$HeartRateSample;

    invoke-direct {v0, p0, p1, p2}, Landroid/health/connect/datatypes/HeartRateRecord$HeartRateSample;-><init>(JLjava/time/Instant;)V

    return-object v0
.end method

.method public static synthetic f(Landroid/health/connect/datatypes/Metadata;Ljava/time/Instant;)Landroid/health/connect/datatypes/IntermenstrualBleedingRecord$Builder;
    .locals 1

    new-instance v0, Landroid/health/connect/datatypes/IntermenstrualBleedingRecord$Builder;

    invoke-direct {v0, p0, p1}, Landroid/health/connect/datatypes/IntermenstrualBleedingRecord$Builder;-><init>(Landroid/health/connect/datatypes/Metadata;Ljava/time/Instant;)V

    return-object v0
.end method

.method public static synthetic g(Landroid/health/connect/datatypes/Metadata;Ljava/time/Instant;I)Landroid/health/connect/datatypes/MenstruationFlowRecord$Builder;
    .locals 1

    new-instance v0, Landroid/health/connect/datatypes/MenstruationFlowRecord$Builder;

    invoke-direct {v0, p0, p1, p2}, Landroid/health/connect/datatypes/MenstruationFlowRecord$Builder;-><init>(Landroid/health/connect/datatypes/Metadata;Ljava/time/Instant;I)V

    return-object v0
.end method

.method public static synthetic h(Landroid/health/connect/datatypes/Metadata;Ljava/time/Instant;Ljava/time/Instant;)Landroid/health/connect/datatypes/MenstruationPeriodRecord$Builder;
    .locals 1

    new-instance v0, Landroid/health/connect/datatypes/MenstruationPeriodRecord$Builder;

    invoke-direct {v0, p0, p1, p2}, Landroid/health/connect/datatypes/MenstruationPeriodRecord$Builder;-><init>(Landroid/health/connect/datatypes/Metadata;Ljava/time/Instant;Ljava/time/Instant;)V

    return-object v0
.end method

.method public static synthetic i(Landroid/health/connect/datatypes/Metadata;Ljava/time/Instant;I)Landroid/health/connect/datatypes/OvulationTestRecord$Builder;
    .locals 1

    new-instance v0, Landroid/health/connect/datatypes/OvulationTestRecord$Builder;

    invoke-direct {v0, p0, p1, p2}, Landroid/health/connect/datatypes/OvulationTestRecord$Builder;-><init>(Landroid/health/connect/datatypes/Metadata;Ljava/time/Instant;I)V

    return-object v0
.end method

.method public static synthetic j(Landroid/health/connect/datatypes/Metadata;Ljava/time/Instant;Ljava/time/Instant;Ljava/util/ArrayList;)Landroid/health/connect/datatypes/PowerRecord$Builder;
    .locals 1

    new-instance v0, Landroid/health/connect/datatypes/PowerRecord$Builder;

    invoke-direct {v0, p0, p1, p2, p3}, Landroid/health/connect/datatypes/PowerRecord$Builder;-><init>(Landroid/health/connect/datatypes/Metadata;Ljava/time/Instant;Ljava/time/Instant;Ljava/util/List;)V

    return-object v0
.end method

.method public static synthetic k(Landroid/health/connect/datatypes/Metadata;Ljava/time/Instant;I)Landroid/health/connect/datatypes/SexualActivityRecord$Builder;
    .locals 1

    new-instance v0, Landroid/health/connect/datatypes/SexualActivityRecord$Builder;

    invoke-direct {v0, p0, p1, p2}, Landroid/health/connect/datatypes/SexualActivityRecord$Builder;-><init>(Landroid/health/connect/datatypes/Metadata;Ljava/time/Instant;I)V

    return-object v0
.end method

.method public static synthetic l(Landroid/health/connect/datatypes/Metadata;Ljava/time/Instant;Ljava/time/Instant;)Landroid/health/connect/datatypes/SleepSessionRecord$Builder;
    .locals 1

    new-instance v0, Landroid/health/connect/datatypes/SleepSessionRecord$Builder;

    invoke-direct {v0, p0, p1, p2}, Landroid/health/connect/datatypes/SleepSessionRecord$Builder;-><init>(Landroid/health/connect/datatypes/Metadata;Ljava/time/Instant;Ljava/time/Instant;)V

    return-object v0
.end method

.method public static synthetic m(Landroid/health/connect/datatypes/Metadata;Ljava/time/Instant;Ljava/time/Instant;Ljava/util/ArrayList;)Landroid/health/connect/datatypes/SpeedRecord$Builder;
    .locals 1

    new-instance v0, Landroid/health/connect/datatypes/SpeedRecord$Builder;

    invoke-direct {v0, p0, p1, p2, p3}, Landroid/health/connect/datatypes/SpeedRecord$Builder;-><init>(Landroid/health/connect/datatypes/Metadata;Ljava/time/Instant;Ljava/time/Instant;Ljava/util/List;)V

    return-object v0
.end method

.method public static synthetic n(Landroid/health/connect/datatypes/Metadata;Ljava/time/Instant;Ljava/time/Instant;Ljava/util/ArrayList;)Landroid/health/connect/datatypes/StepsCadenceRecord$Builder;
    .locals 1

    new-instance v0, Landroid/health/connect/datatypes/StepsCadenceRecord$Builder;

    invoke-direct {v0, p0, p1, p2, p3}, Landroid/health/connect/datatypes/StepsCadenceRecord$Builder;-><init>(Landroid/health/connect/datatypes/Metadata;Ljava/time/Instant;Ljava/time/Instant;Ljava/util/List;)V

    return-object v0
.end method

.method public static synthetic o(DLjava/time/Instant;)Landroid/health/connect/datatypes/StepsCadenceRecord$StepsCadenceRecordSample;
    .locals 1

    new-instance v0, Landroid/health/connect/datatypes/StepsCadenceRecord$StepsCadenceRecordSample;

    invoke-direct {v0, p0, p1, p2}, Landroid/health/connect/datatypes/StepsCadenceRecord$StepsCadenceRecordSample;-><init>(DLjava/time/Instant;)V

    return-object v0
.end method

.method public static synthetic p(Landroid/health/connect/datatypes/Metadata;Ljava/time/Instant;ID)Landroid/health/connect/datatypes/Vo2MaxRecord$Builder;
    .locals 6

    new-instance v0, Landroid/health/connect/datatypes/Vo2MaxRecord$Builder;

    move-object v1, p0

    move-object v2, p1

    move v3, p2

    move-wide v4, p3

    invoke-direct/range {v0 .. v5}, Landroid/health/connect/datatypes/Vo2MaxRecord$Builder;-><init>(Landroid/health/connect/datatypes/Metadata;Ljava/time/Instant;ID)V

    return-object v0
.end method

.method public static synthetic q()V
    .locals 1

    new-instance v0, Landroid/health/connect/changelog/ChangeLogsRequest$Builder;

    return-void
.end method

.method public static synthetic r()V
    .locals 1

    new-instance v0, Landroid/health/connect/datatypes/FloorsClimbedRecord$Builder;

    return-void
.end method

.method public static synthetic s()V
    .locals 1

    new-instance v0, Landroid/health/connect/datatypes/SexualActivityRecord$Builder;

    return-void
.end method

.method public static synthetic t()V
    .locals 1

    new-instance v0, Landroid/health/connect/datatypes/OvulationTestRecord$Builder;

    return-void
.end method

.method public static synthetic u()V
    .locals 1

    new-instance v0, Landroid/health/connect/datatypes/SleepSessionRecord$Builder;

    return-void
.end method

.method public static synthetic v()V
    .locals 1

    new-instance v0, Landroid/health/connect/datatypes/IntermenstrualBleedingRecord$Builder;

    return-void
.end method

.method public static synthetic w()V
    .locals 1

    new-instance v0, Landroid/health/connect/datatypes/StepsCadenceRecord$StepsCadenceRecordSample;

    return-void
.end method

.method public static synthetic x()V
    .locals 1

    new-instance v0, Landroid/health/connect/datatypes/MenstruationPeriodRecord$Builder;

    return-void
.end method

.method public static synthetic y()V
    .locals 1

    new-instance v0, Landroid/health/connect/datatypes/MenstruationFlowRecord$Builder;

    return-void
.end method

.method public static synthetic z()V
    .locals 1

    new-instance v0, Landroid/health/connect/datatypes/Vo2MaxRecord$Builder;

    return-void
.end method
