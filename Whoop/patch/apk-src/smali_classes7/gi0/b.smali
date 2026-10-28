.class public abstract Lgi0/b;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static a:D = 0.3


# direct methods
.method public static a(Lcom/whoop/analytics/strain/model/BiologicalSex;DDJ)D
    .locals 4

    invoke-static {p5, p6}, Lgi0/c;->f(J)D

    move-result-wide p5

    sget-object v0, Lcom/whoop/analytics/strain/model/BiologicalSex;->femaleNew:Lcom/whoop/analytics/strain/model/BiologicalSex;

    invoke-virtual {p0, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    sget-object v0, Lcom/whoop/analytics/strain/model/BiologicalSex;->maleNew:Lcom/whoop/analytics/strain/model/BiologicalSex;

    invoke-virtual {p0, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1

    sget-object v0, Lcom/whoop/analytics/strain/model/BiologicalSex;->nonBinaryNew:Lcom/whoop/analytics/strain/model/BiologicalSex;

    invoke-virtual {p0, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_1

    :cond_0
    invoke-static {p1, p2}, Lgi0/b;->f(D)D

    move-result-wide p1

    invoke-static {p3, p4}, Lgi0/b;->g(D)D

    move-result-wide p3

    invoke-virtual {p0}, Lcom/whoop/analytics/strain/model/BiologicalSex;->getCalorieRestingAlphaValue()D

    move-result-wide v0

    invoke-virtual {p0}, Lcom/whoop/analytics/strain/model/BiologicalSex;->getCalorieRestingWeightValue()D

    move-result-wide v2

    mul-double/2addr v2, p1

    add-double/2addr v2, v0

    invoke-virtual {p0}, Lcom/whoop/analytics/strain/model/BiologicalSex;->getCalorieRestingHeightValue()D

    move-result-wide p1

    mul-double/2addr p1, p3

    add-double/2addr p1, v2

    invoke-virtual {p0}, Lcom/whoop/analytics/strain/model/BiologicalSex;->getCalorieRestingAgeValue()D

    move-result-wide p3

    :goto_0
    mul-double/2addr p3, p5

    sub-double/2addr p1, p3

    goto :goto_2

    :cond_1
    :goto_1
    invoke-virtual {p0}, Lcom/whoop/analytics/strain/model/BiologicalSex;->getCalorieRestingAlphaValue()D

    move-result-wide v0

    invoke-virtual {p0}, Lcom/whoop/analytics/strain/model/BiologicalSex;->getCalorieRestingWeightValue()D

    move-result-wide v2

    mul-double/2addr v2, p1

    add-double/2addr v2, v0

    invoke-virtual {p0}, Lcom/whoop/analytics/strain/model/BiologicalSex;->getCalorieRestingHeightValue()D

    move-result-wide p1

    mul-double/2addr p1, p3

    add-double/2addr p1, v2

    invoke-virtual {p0}, Lcom/whoop/analytics/strain/model/BiologicalSex;->getCalorieRestingAgeValue()D

    move-result-wide p3

    goto :goto_0

    :goto_2
    const-wide/16 p3, 0x0

    cmpg-double p0, p1, p3

    if-gez p0, :cond_2

    return-wide p3

    :cond_2
    const-wide p3, 0x40f5180000000000L    # 86400.0

    div-double/2addr p1, p3

    return-wide p1
.end method

.method public static b(Lcom/whoop/analytics/strain/model/BiologicalSex;DJDDD)Lcom/whoop/analytics/strain/model/WorkoutBurnRate;
    .locals 4

    invoke-static {p3, p4}, Lgi0/c;->f(J)D

    move-result-wide p3

    invoke-virtual {p0}, Lcom/whoop/analytics/strain/model/BiologicalSex;->getCalorieWorkoutAlphaValue()D

    move-result-wide v0

    invoke-virtual {p0}, Lcom/whoop/analytics/strain/model/BiologicalSex;->getCalorieWorkoutHeartRateValue()D

    move-result-wide v2

    mul-double/2addr v2, p5

    add-double/2addr v2, v0

    invoke-virtual {p0}, Lcom/whoop/analytics/strain/model/BiologicalSex;->getCalorieWorkoutWeightValue()D

    move-result-wide v0

    mul-double/2addr v0, p1

    add-double/2addr v0, v2

    invoke-virtual {p0}, Lcom/whoop/analytics/strain/model/BiologicalSex;->getCalorieWorkoutAgeValue()D

    move-result-wide p0

    mul-double/2addr p0, p3

    add-double/2addr p0, v0

    const-wide p2, 0x406f6147ae147ae2L    # 251.04000000000002

    div-double/2addr p0, p2

    sub-double/2addr p0, p7

    sub-double/2addr p5, p9

    div-double/2addr p0, p5

    mul-double/2addr p9, p0

    sub-double/2addr p7, p9

    new-instance p2, Lcom/whoop/analytics/strain/model/WorkoutBurnRate;

    invoke-direct {p2, p0, p1, p7, p8}, Lcom/whoop/analytics/strain/model/WorkoutBurnRate;-><init>(DD)V

    return-object p2
.end method

.method public static c(Lcom/whoop/analytics/strain/model/BiologicalSex;DJDD)D
    .locals 2

    invoke-static {p3, p4}, Lgi0/c;->f(J)D

    move-result-wide p3

    invoke-virtual {p0}, Lcom/whoop/analytics/strain/model/BiologicalSex;->getCalorieWorkoutHeartRateValue()D

    move-result-wide v0

    invoke-static {p5, p6, p7, p8}, Ljava/lang/Math;->min(DD)D

    move-result-wide p5

    mul-double/2addr p5, v0

    invoke-virtual {p0}, Lcom/whoop/analytics/strain/model/BiologicalSex;->getCalorieWorkoutWeightValue()D

    move-result-wide p7

    mul-double/2addr p7, p1

    add-double/2addr p7, p5

    invoke-virtual {p0}, Lcom/whoop/analytics/strain/model/BiologicalSex;->getCalorieWorkoutAgeValue()D

    move-result-wide p1

    mul-double/2addr p1, p3

    add-double/2addr p1, p7

    invoke-virtual {p0}, Lcom/whoop/analytics/strain/model/BiologicalSex;->getCalorieWorkoutAlphaValue()D

    move-result-wide p3

    add-double/2addr p3, p1

    const-wide/16 p0, 0x0

    cmpg-double p2, p3, p0

    if-gez p2, :cond_0

    return-wide p0

    :cond_0
    const-wide p0, 0x406f6147ae147ae2L    # 251.04000000000002

    div-double/2addr p3, p0

    return-wide p3
.end method

.method public static d(Lcom/whoop/analytics/strain/model/UserProfile;Ljava/util/List;J)Lcom/whoop/analytics/strain/model/Calories;
    .locals 27
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/analytics/strain/model/UserProfile;",
            "Ljava/util/List<",
            "Lcom/whoop/analytics/strain/model/HeartRateTimestamp;",
            ">;J)",
            "Lcom/whoop/analytics/strain/model/Calories;"
        }
    .end annotation

    move-object/from16 v0, p1

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual/range {p0 .. p0}, Lcom/whoop/analytics/strain/model/UserProfile;->getBiologicalSex()Lcom/whoop/analytics/strain/model/BiologicalSex;

    move-result-object v2

    invoke-virtual/range {p0 .. p0}, Lcom/whoop/analytics/strain/model/UserProfile;->getWeight()D

    move-result-wide v3

    invoke-virtual/range {p0 .. p0}, Lcom/whoop/analytics/strain/model/UserProfile;->getHeight()D

    move-result-wide v5

    invoke-virtual/range {p0 .. p0}, Lcom/whoop/analytics/strain/model/UserProfile;->getBirthday()J

    move-result-wide v7

    invoke-static/range {v2 .. v8}, Lgi0/b;->a(Lcom/whoop/analytics/strain/model/BiologicalSex;DDJ)D

    move-result-wide v16

    invoke-virtual/range {p0 .. p0}, Lcom/whoop/analytics/strain/model/UserProfile;->getBiologicalSex()Lcom/whoop/analytics/strain/model/BiologicalSex;

    move-result-object v2

    sget-object v3, Lcom/whoop/analytics/strain/model/BiologicalSex;->maleNew:Lcom/whoop/analytics/strain/model/BiologicalSex;

    invoke-virtual {v2, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v2

    const/4 v3, 0x0

    if-nez v2, :cond_0

    invoke-virtual/range {p0 .. p0}, Lcom/whoop/analytics/strain/model/UserProfile;->getBiologicalSex()Lcom/whoop/analytics/strain/model/BiologicalSex;

    move-result-object v2

    sget-object v4, Lcom/whoop/analytics/strain/model/BiologicalSex;->femaleNew:Lcom/whoop/analytics/strain/model/BiologicalSex;

    invoke-virtual {v2, v4}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_0

    invoke-virtual/range {p0 .. p0}, Lcom/whoop/analytics/strain/model/UserProfile;->getBiologicalSex()Lcom/whoop/analytics/strain/model/BiologicalSex;

    move-result-object v2

    sget-object v4, Lcom/whoop/analytics/strain/model/BiologicalSex;->nonBinaryNew:Lcom/whoop/analytics/strain/model/BiologicalSex;

    invoke-virtual {v2, v4}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1

    :cond_0
    move-wide/from16 v4, p2

    goto :goto_2

    :cond_1
    invoke-virtual/range {p0 .. p0}, Lcom/whoop/analytics/strain/model/UserProfile;->getRestingHeartRate()D

    move-result-wide v4

    invoke-virtual/range {p0 .. p0}, Lcom/whoop/analytics/strain/model/UserProfile;->getMaxHeartRate()D

    move-result-wide v6

    invoke-static {v0, v4, v5, v6, v7}, Lgi0/f;->i(Ljava/util/List;DD)Ljava/util/List;

    move-result-object v2

    move-wide/from16 v4, p2

    invoke-static {v2, v4, v5}, Lgi0/f;->l(Ljava/util/List;J)Ljava/util/List;

    move-result-object v4

    :goto_0
    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v5

    if-ge v3, v5, :cond_4

    invoke-interface {v2, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/whoop/analytics/strain/model/HeartRateTimestamp;

    invoke-virtual {v5}, Lcom/whoop/analytics/strain/model/HeartRateTimestamp;->getHeartRate()D

    move-result-wide v5

    invoke-interface {v4, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/lang/Double;

    invoke-virtual {v7}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v7

    sget-wide v9, Lgi0/b;->a:D

    cmpg-double v5, v5, v9

    if-gez v5, :cond_2

    mul-double v7, v7, v16

    invoke-static {v7, v8}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v5

    invoke-virtual {v1, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_2
    invoke-virtual/range {p0 .. p0}, Lcom/whoop/analytics/strain/model/UserProfile;->getBiologicalSex()Lcom/whoop/analytics/strain/model/BiologicalSex;

    move-result-object v18

    invoke-virtual/range {p0 .. p0}, Lcom/whoop/analytics/strain/model/UserProfile;->getWeight()D

    move-result-wide v19

    invoke-virtual/range {p0 .. p0}, Lcom/whoop/analytics/strain/model/UserProfile;->getBirthday()J

    move-result-wide v21

    invoke-interface {v0, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/whoop/analytics/strain/model/HeartRateTimestamp;

    invoke-virtual {v5}, Lcom/whoop/analytics/strain/model/HeartRateTimestamp;->getHeartRate()D

    move-result-wide v23

    invoke-virtual/range {p0 .. p0}, Lcom/whoop/analytics/strain/model/UserProfile;->getMaxHeartRate()D

    move-result-wide v25

    invoke-static/range {v18 .. v26}, Lgi0/b;->c(Lcom/whoop/analytics/strain/model/BiologicalSex;DJDD)D

    move-result-wide v5

    mul-double/2addr v7, v5

    invoke-static {v7, v8}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v5

    invoke-virtual {v1, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :goto_1
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :goto_2
    invoke-static/range {p1 .. p3}, Lgi0/f;->l(Ljava/util/List;J)Ljava/util/List;

    move-result-object v2

    sget-wide v4, Lgi0/b;->a:D

    invoke-virtual/range {p0 .. p0}, Lcom/whoop/analytics/strain/model/UserProfile;->getMaxHeartRate()D

    move-result-wide v6

    invoke-virtual/range {p0 .. p0}, Lcom/whoop/analytics/strain/model/UserProfile;->getRestingHeartRate()D

    move-result-wide v8

    sub-double/2addr v6, v8

    mul-double/2addr v6, v4

    invoke-virtual/range {p0 .. p0}, Lcom/whoop/analytics/strain/model/UserProfile;->getRestingHeartRate()D

    move-result-wide v4

    add-double v18, v4, v6

    invoke-virtual/range {p0 .. p0}, Lcom/whoop/analytics/strain/model/UserProfile;->getBiologicalSex()Lcom/whoop/analytics/strain/model/BiologicalSex;

    move-result-object v9

    invoke-virtual/range {p0 .. p0}, Lcom/whoop/analytics/strain/model/UserProfile;->getWeight()D

    move-result-wide v10

    invoke-virtual/range {p0 .. p0}, Lcom/whoop/analytics/strain/model/UserProfile;->getBirthday()J

    move-result-wide v12

    invoke-virtual/range {p0 .. p0}, Lcom/whoop/analytics/strain/model/UserProfile;->getMaxHeartRate()D

    move-result-wide v14

    invoke-static/range {v9 .. v19}, Lgi0/b;->b(Lcom/whoop/analytics/strain/model/BiologicalSex;DJDDD)Lcom/whoop/analytics/strain/model/WorkoutBurnRate;

    move-result-object v4

    :goto_3
    invoke-interface {v0}, Ljava/util/List;->size()I

    move-result v5

    if-ge v3, v5, :cond_4

    invoke-interface {v0, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/whoop/analytics/strain/model/HeartRateTimestamp;

    invoke-virtual {v5}, Lcom/whoop/analytics/strain/model/HeartRateTimestamp;->getHeartRate()D

    move-result-wide v5

    invoke-interface {v2, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/lang/Double;

    invoke-virtual {v7}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v7

    cmpg-double v9, v5, v18

    if-gez v9, :cond_3

    mul-double v7, v7, v16

    invoke-static {v7, v8}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v5

    invoke-virtual {v1, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_4

    :cond_3
    invoke-virtual {v4}, Lcom/whoop/analytics/strain/model/WorkoutBurnRate;->getSlope()D

    move-result-wide v9

    mul-double/2addr v9, v5

    invoke-virtual {v4}, Lcom/whoop/analytics/strain/model/WorkoutBurnRate;->getIntercept()D

    move-result-wide v5

    add-double/2addr v5, v9

    mul-double/2addr v5, v7

    invoke-static {v5, v6}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v5

    invoke-virtual {v1, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :goto_4
    add-int/lit8 v3, v3, 0x1

    goto :goto_3

    :cond_4
    invoke-interface {v1}, Ljava/util/Collection;->stream()Ljava/util/stream/Stream;

    move-result-object v0

    new-instance v1, Lgi0/a;

    const/4 v2, 0x0

    invoke-direct {v1, v2}, Lgi0/a;-><init>(I)V

    invoke-interface {v0, v1}, Ljava/util/stream/Stream;->mapToDouble(Ljava/util/function/ToDoubleFunction;)Ljava/util/stream/DoubleStream;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/stream/DoubleStream;->sum()D

    move-result-wide v0

    invoke-static {}, Lcom/whoop/analytics/strain/model/Calories;->builder()Lcom/whoop/analytics/strain/model/Calories$Builder;

    move-result-object v2

    invoke-virtual {v2, v0, v1}, Lcom/whoop/analytics/strain/model/Calories$Builder;->setTotalKilocalories(D)Lcom/whoop/analytics/strain/model/Calories$Builder;

    move-result-object v2

    const-wide v3, 0x4010bc6a7ef9db23L    # 4.184

    mul-double/2addr v0, v3

    invoke-virtual {v2, v0, v1}, Lcom/whoop/analytics/strain/model/Calories$Builder;->setTotalKilojoules(D)Lcom/whoop/analytics/strain/model/Calories$Builder;

    move-result-object v0

    invoke-virtual {v0}, Lcom/whoop/analytics/strain/model/Calories$Builder;->build()Lcom/whoop/analytics/strain/model/Calories;

    move-result-object v0

    return-object v0
.end method

.method public static e(D)D
    .locals 2

    const-wide v0, 0x4010bc6a7ef9db23L    # 4.184

    div-double/2addr p0, v0

    return-wide p0
.end method

.method public static f(D)D
    .locals 2

    const-wide v0, 0x4001a30fcf80dc33L    # 2.20462

    mul-double/2addr p0, v0

    return-wide p0
.end method

.method public static g(D)D
    .locals 2

    const-wide v0, 0x4043af5f6fd21ff3L    # 39.3701

    mul-double/2addr p0, v0

    return-wide p0
.end method
