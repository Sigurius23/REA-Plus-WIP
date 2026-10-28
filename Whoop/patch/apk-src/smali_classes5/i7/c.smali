.class public abstract synthetic Li7/c;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static synthetic a(Ljava/time/Instant;Ljava/time/Instant;)Landroid/health/connect/datatypes/ExerciseLap$Builder;
    .locals 1

    new-instance v0, Landroid/health/connect/datatypes/ExerciseLap$Builder;

    invoke-direct {v0, p0, p1}, Landroid/health/connect/datatypes/ExerciseLap$Builder;-><init>(Ljava/time/Instant;Ljava/time/Instant;)V

    return-object v0
.end method

.method public static synthetic b(Ljava/time/Instant;DD)Landroid/health/connect/datatypes/ExerciseRoute$Location$Builder;
    .locals 6

    new-instance v0, Landroid/health/connect/datatypes/ExerciseRoute$Location$Builder;

    move-object v1, p0

    move-wide v2, p1

    move-wide v4, p3

    invoke-direct/range {v0 .. v5}, Landroid/health/connect/datatypes/ExerciseRoute$Location$Builder;-><init>(Ljava/time/Instant;DD)V

    return-object v0
.end method

.method public static synthetic c(Ljava/util/ArrayList;)Landroid/health/connect/datatypes/ExerciseRoute;
    .locals 1

    new-instance v0, Landroid/health/connect/datatypes/ExerciseRoute;

    invoke-direct {v0, p0}, Landroid/health/connect/datatypes/ExerciseRoute;-><init>(Ljava/util/List;)V

    return-object v0
.end method

.method public static synthetic d(Landroid/health/connect/datatypes/Metadata;Ljava/time/Instant;D)Landroid/health/connect/datatypes/HeartRateVariabilityRmssdRecord$Builder;
    .locals 1

    new-instance v0, Landroid/health/connect/datatypes/HeartRateVariabilityRmssdRecord$Builder;

    invoke-direct {v0, p0, p1, p2, p3}, Landroid/health/connect/datatypes/HeartRateVariabilityRmssdRecord$Builder;-><init>(Landroid/health/connect/datatypes/Metadata;Ljava/time/Instant;D)V

    return-object v0
.end method

.method public static synthetic e(Landroid/health/connect/datatypes/Metadata;Ljava/time/Instant;Landroid/health/connect/datatypes/units/Length;)Landroid/health/connect/datatypes/HeightRecord$Builder;
    .locals 1

    new-instance v0, Landroid/health/connect/datatypes/HeightRecord$Builder;

    invoke-direct {v0, p0, p1, p2}, Landroid/health/connect/datatypes/HeightRecord$Builder;-><init>(Landroid/health/connect/datatypes/Metadata;Ljava/time/Instant;Landroid/health/connect/datatypes/units/Length;)V

    return-object v0
.end method

.method public static synthetic f(Landroid/health/connect/datatypes/Metadata;Ljava/time/Instant;Ljava/time/Instant;Landroid/health/connect/datatypes/units/Volume;)Landroid/health/connect/datatypes/HydrationRecord$Builder;
    .locals 1

    new-instance v0, Landroid/health/connect/datatypes/HydrationRecord$Builder;

    invoke-direct {v0, p0, p1, p2, p3}, Landroid/health/connect/datatypes/HydrationRecord$Builder;-><init>(Landroid/health/connect/datatypes/Metadata;Ljava/time/Instant;Ljava/time/Instant;Landroid/health/connect/datatypes/units/Volume;)V

    return-object v0
.end method

.method public static synthetic g(Landroid/health/connect/datatypes/Metadata;Ljava/time/Instant;Ljava/time/Instant;)Landroid/health/connect/datatypes/NutritionRecord$Builder;
    .locals 1

    new-instance v0, Landroid/health/connect/datatypes/NutritionRecord$Builder;

    invoke-direct {v0, p0, p1, p2}, Landroid/health/connect/datatypes/NutritionRecord$Builder;-><init>(Landroid/health/connect/datatypes/Metadata;Ljava/time/Instant;Ljava/time/Instant;)V

    return-object v0
.end method

.method public static synthetic h(Landroid/health/connect/datatypes/Metadata;Ljava/time/Instant;Landroid/health/connect/datatypes/units/Percentage;)Landroid/health/connect/datatypes/OxygenSaturationRecord$Builder;
    .locals 1

    new-instance v0, Landroid/health/connect/datatypes/OxygenSaturationRecord$Builder;

    invoke-direct {v0, p0, p1, p2}, Landroid/health/connect/datatypes/OxygenSaturationRecord$Builder;-><init>(Landroid/health/connect/datatypes/Metadata;Ljava/time/Instant;Landroid/health/connect/datatypes/units/Percentage;)V

    return-object v0
.end method

.method public static synthetic i(Landroid/health/connect/datatypes/Metadata;Ljava/time/Instant;D)Landroid/health/connect/datatypes/RespiratoryRateRecord$Builder;
    .locals 1

    new-instance v0, Landroid/health/connect/datatypes/RespiratoryRateRecord$Builder;

    invoke-direct {v0, p0, p1, p2, p3}, Landroid/health/connect/datatypes/RespiratoryRateRecord$Builder;-><init>(Landroid/health/connect/datatypes/Metadata;Ljava/time/Instant;D)V

    return-object v0
.end method

.method public static synthetic j(Landroid/health/connect/datatypes/Metadata;Ljava/time/Instant;J)Landroid/health/connect/datatypes/RestingHeartRateRecord$Builder;
    .locals 1

    new-instance v0, Landroid/health/connect/datatypes/RestingHeartRateRecord$Builder;

    invoke-direct {v0, p0, p1, p2, p3}, Landroid/health/connect/datatypes/RestingHeartRateRecord$Builder;-><init>(Landroid/health/connect/datatypes/Metadata;Ljava/time/Instant;J)V

    return-object v0
.end method

.method public static synthetic k(Landroid/health/connect/datatypes/Metadata;Ljava/time/Instant;Ljava/time/Instant;J)Landroid/health/connect/datatypes/StepsRecord$Builder;
    .locals 6

    new-instance v0, Landroid/health/connect/datatypes/StepsRecord$Builder;

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-wide v4, p3

    invoke-direct/range {v0 .. v5}, Landroid/health/connect/datatypes/StepsRecord$Builder;-><init>(Landroid/health/connect/datatypes/Metadata;Ljava/time/Instant;Ljava/time/Instant;J)V

    return-object v0
.end method

.method public static synthetic l(Landroid/health/connect/datatypes/Metadata;Ljava/time/Instant;Landroid/health/connect/datatypes/units/Mass;)Landroid/health/connect/datatypes/WeightRecord$Builder;
    .locals 1

    new-instance v0, Landroid/health/connect/datatypes/WeightRecord$Builder;

    invoke-direct {v0, p0, p1, p2}, Landroid/health/connect/datatypes/WeightRecord$Builder;-><init>(Landroid/health/connect/datatypes/Metadata;Ljava/time/Instant;Landroid/health/connect/datatypes/units/Mass;)V

    return-object v0
.end method

.method public static synthetic m()V
    .locals 1

    new-instance v0, Landroid/health/connect/datatypes/StepsRecord$Builder;

    return-void
.end method

.method public static synthetic n()V
    .locals 1

    new-instance v0, Landroid/health/connect/datatypes/OxygenSaturationRecord$Builder;

    return-void
.end method

.method public static synthetic o()V
    .locals 1

    new-instance v0, Landroid/health/connect/datatypes/ExerciseRoute$Location$Builder;

    return-void
.end method

.method public static synthetic p()V
    .locals 1

    new-instance v0, Landroid/health/connect/datatypes/HydrationRecord$Builder;

    return-void
.end method

.method public static synthetic q()V
    .locals 1

    new-instance v0, Landroid/health/connect/datatypes/HeightRecord$Builder;

    return-void
.end method

.method public static synthetic r()V
    .locals 1

    new-instance v0, Landroid/health/connect/datatypes/RespiratoryRateRecord$Builder;

    return-void
.end method

.method public static synthetic s()V
    .locals 1

    new-instance v0, Landroid/health/connect/datatypes/HeartRateRecord$HeartRateSample;

    return-void
.end method

.method public static synthetic t()V
    .locals 1

    new-instance v0, Landroid/health/connect/datatypes/HeartRateVariabilityRmssdRecord$Builder;

    return-void
.end method

.method public static synthetic u()V
    .locals 1

    new-instance v0, Landroid/health/connect/datatypes/RestingHeartRateRecord$Builder;

    return-void
.end method

.method public static synthetic v()V
    .locals 1

    new-instance v0, Landroid/health/connect/datatypes/WeightRecord$Builder;

    return-void
.end method

.method public static synthetic w()V
    .locals 1

    new-instance v0, Landroid/health/connect/datatypes/NutritionRecord$Builder;

    return-void
.end method
