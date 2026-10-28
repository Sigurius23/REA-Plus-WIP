.class public abstract Lgi0/f;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field private static final a:Lfg3/b;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const-class v0, Lgi0/i;

    invoke-static {v0}, Lfg3/d;->b(Ljava/lang/Class;)Lfg3/b;

    move-result-object v0

    sput-object v0, Lgi0/f;->a:Lfg3/b;

    return-void
.end method

.method public static synthetic a(Lcom/whoop/analytics/strain/model/HeartRateTimestamp;)Ljava/util/List;
    .locals 0

    invoke-static {p0}, Lgi0/f;->q(Lcom/whoop/analytics/strain/model/HeartRateTimestamp;)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(DDLcom/whoop/analytics/strain/model/HeartRateTimestamp;)Lcom/whoop/analytics/strain/model/HeartRateTimestamp;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Lgi0/f;->o(DDLcom/whoop/analytics/strain/model/HeartRateTimestamp;)Lcom/whoop/analytics/strain/model/HeartRateTimestamp;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Ljava/util/List;)Lcom/whoop/analytics/strain/model/HeartRateTimestamp;
    .locals 0

    invoke-static {p0}, Lgi0/f;->p(Ljava/util/List;)Lcom/whoop/analytics/strain/model/HeartRateTimestamp;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Ljava/lang/Double;)D
    .locals 2

    invoke-static {p0}, Lgi0/f;->n(Ljava/lang/Double;)D

    move-result-wide v0

    return-wide v0
.end method

.method public static synthetic e(Ljava/lang/Double;)Ljava/lang/Double;
    .locals 0

    invoke-static {p0}, Lgi0/f;->s(Ljava/lang/Double;)Ljava/lang/Double;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic f(Lcom/whoop/analytics/strain/model/HeartRateTimestamp;)Ljava/util/List;
    .locals 0

    invoke-static {p0}, Lgi0/f;->r(Lcom/whoop/analytics/strain/model/HeartRateTimestamp;)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method private static g(DLcom/whoop/analytics/strain/model/BiologicalSex;Lcom/whoop/analytics/strain/model/FitnessLevel;)D
    .locals 2

    const-wide v0, -0x402e8d6863c8b798L    # -0.27261915450538377

    mul-double/2addr p0, v0

    const-wide v0, 0x40698dab22fb1f3dL    # 204.4271407036521

    add-double/2addr p0, v0

    invoke-virtual {p2}, Lcom/whoop/analytics/strain/model/BiologicalSex;->getHeartRateWeightValue()D

    move-result-wide v0

    add-double/2addr v0, p0

    invoke-virtual {p3}, Lcom/whoop/analytics/strain/model/FitnessLevel;->getWeightForHeartRate()D

    move-result-wide p0

    add-double/2addr p0, v0

    return-wide p0
.end method

.method public static h(Ljava/util/List;DDJ)D
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/whoop/analytics/strain/model/HeartRateTimestamp;",
            ">;DDJ)D"
        }
    .end annotation

    const-wide/high16 v0, 0x4008000000000000L    # 3.0

    add-double/2addr p3, v0

    invoke-static {p0, p1, p2, p3, p4}, Lgi0/f;->i(Ljava/util/List;DD)Ljava/util/List;

    move-result-object p0

    invoke-static {p0, p5, p6}, Lgi0/f;->l(Ljava/util/List;J)Ljava/util/List;

    move-result-object p1

    invoke-static {p0, p1}, Lgi0/f;->m(Ljava/util/List;Ljava/util/List;)Ljava/util/List;

    move-result-object p0

    invoke-interface {p0}, Ljava/util/Collection;->stream()Ljava/util/stream/Stream;

    move-result-object p0

    new-instance p1, Lgi0/a;

    const/4 p2, 0x2

    invoke-direct {p1, p2}, Lgi0/a;-><init>(I)V

    invoke-interface {p0, p1}, Ljava/util/stream/Stream;->mapToDouble(Ljava/util/function/ToDoubleFunction;)Ljava/util/stream/DoubleStream;

    move-result-object p0

    invoke-interface {p0}, Ljava/util/stream/DoubleStream;->boxed()Ljava/util/stream/Stream;

    move-result-object p0

    invoke-static {}, Ljava/util/stream/Collectors;->toList()Ljava/util/stream/Collector;

    move-result-object p1

    invoke-interface {p0, p1}, Ljava/util/stream/Stream;->collect(Ljava/util/stream/Collector;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/util/List;

    invoke-interface {p0}, Ljava/util/Collection;->stream()Ljava/util/stream/Stream;

    move-result-object p0

    new-instance p1, Lgi0/a;

    const/4 p2, 0x0

    invoke-direct {p1, p2}, Lgi0/a;-><init>(I)V

    invoke-interface {p0, p1}, Ljava/util/stream/Stream;->mapToDouble(Ljava/util/function/ToDoubleFunction;)Ljava/util/stream/DoubleStream;

    move-result-object p0

    invoke-interface {p0}, Ljava/util/stream/DoubleStream;->sum()D

    move-result-wide p0

    const-wide p2, 0x4125180000000000L    # 691200.0

    div-double/2addr p0, p2

    const-wide/16 p2, 0x0

    cmpg-double p4, p0, p2

    if-gez p4, :cond_0

    sget-object p4, Lgi0/f;->a:Lfg3/b;

    const-string p5, "Calculated negative strain, this should not happen. raw={}"

    invoke-static {p0, p1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object p6

    invoke-interface {p4, p5, p6}, Lfg3/b;->v(Ljava/lang/String;Ljava/lang/Number;)V

    :cond_0
    invoke-static {p2, p3, p0, p1}, Ljava/lang/Math;->max(DD)D

    move-result-wide p0

    const-wide/high16 p2, 0x3ff0000000000000L    # 1.0

    invoke-static {p0, p1, p2, p3}, Ljava/lang/Math;->min(DD)D

    move-result-wide p0

    return-wide p0
.end method

.method public static i(Ljava/util/List;DD)Ljava/util/List;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/whoop/analytics/strain/model/HeartRateTimestamp;",
            ">;DD)",
            "Ljava/util/List<",
            "Lcom/whoop/analytics/strain/model/HeartRateTimestamp;",
            ">;"
        }
    .end annotation

    invoke-interface {p0}, Ljava/util/Collection;->stream()Ljava/util/stream/Stream;

    move-result-object p0

    new-instance v0, Lgi0/e;

    invoke-direct {v0, p1, p2, p3, p4}, Lgi0/e;-><init>(DD)V

    invoke-interface {p0, v0}, Ljava/util/stream/Stream;->map(Ljava/util/function/Function;)Ljava/util/stream/Stream;

    move-result-object p0

    invoke-static {}, Ljava/util/stream/Collectors;->toList()Ljava/util/stream/Collector;

    move-result-object p1

    invoke-interface {p0, p1}, Ljava/util/stream/Stream;->collect(Ljava/util/stream/Collector;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/util/List;

    return-object p0
.end method

.method public static j(D)D
    .locals 10

    const/4 v0, 0x0

    move v1, v0

    :goto_0
    sget-object v2, Lgi0/g;->a:Ljava/util/List;

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v3

    if-ge v1, v3, :cond_2

    invoke-interface {v2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/List;

    invoke-interface {v3, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Double;

    invoke-virtual {v3}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v3

    add-int/lit8 v5, v1, 0x1

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v6

    const/4 v7, 0x1

    sub-int/2addr v6, v7

    invoke-static {v5, v6}, Ljava/lang/Math;->min(II)I

    move-result v6

    invoke-interface {v2, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/util/List;

    invoke-interface {v8, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/lang/Double;

    invoke-virtual {v8}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v8

    cmpl-double v3, p0, v3

    if-ltz v3, :cond_0

    cmpg-double v3, p0, v8

    if-gez v3, :cond_0

    invoke-interface {v2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/util/List;

    invoke-interface {p0, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Double;

    invoke-virtual {p0}, Ljava/lang/Double;->doubleValue()D

    move-result-wide p0

    return-wide p0

    :cond_0
    if-ne v1, v6, :cond_1

    invoke-interface {v2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/util/List;

    invoke-interface {p0, v7}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Double;

    invoke-virtual {p0}, Ljava/lang/Double;->doubleValue()D

    move-result-wide p0

    return-wide p0

    :cond_1
    move v1, v5

    goto :goto_0

    :cond_2
    const-wide/16 p0, 0x0

    return-wide p0
.end method

.method public static k(Lcom/whoop/analytics/strain/model/UserProfile;Ljava/util/List;Lcom/whoop/analytics/strain/model/AnalyticsState;)Lcom/whoop/analytics/strain/model/StrainScore;
    .locals 20
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/analytics/strain/model/UserProfile;",
            "Ljava/util/List<",
            "Lcom/whoop/analytics/strain/model/HeartRateTimestamp;",
            ">;",
            "Lcom/whoop/analytics/strain/model/AnalyticsState;",
            ")",
            "Lcom/whoop/analytics/strain/model/StrainScore;"
        }
    .end annotation

    .annotation system Ldalvik/annotation/Throws;
        value = {
            Ljava/lang/Exception;
        }
    .end annotation

    move-object/from16 v0, p2

    invoke-virtual/range {p0 .. p0}, Lcom/whoop/analytics/strain/model/UserProfile;->getId()I

    move-result v1

    invoke-virtual/range {p0 .. p0}, Lcom/whoop/analytics/strain/model/UserProfile;->getBiologicalSex()Lcom/whoop/analytics/strain/model/BiologicalSex;

    move-result-object v2

    invoke-virtual/range {p0 .. p0}, Lcom/whoop/analytics/strain/model/UserProfile;->getBirthday()J

    move-result-wide v3

    invoke-virtual/range {p0 .. p0}, Lcom/whoop/analytics/strain/model/UserProfile;->getRestingHeartRate()D

    move-result-wide v6

    invoke-virtual/range {p0 .. p0}, Lcom/whoop/analytics/strain/model/UserProfile;->getFitnessLevel()Lcom/whoop/analytics/strain/model/FitnessLevel;

    move-result-object v5

    invoke-virtual/range {p0 .. p0}, Lcom/whoop/analytics/strain/model/UserProfile;->getMaxHeartRate()D

    move-result-wide v8

    sget-object v10, Lgi0/f;->a:Lfg3/b;

    const-string v11, "Calculate strain score for user userId={} heartRates={}"

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v12

    move-object/from16 v13, p1

    invoke-interface {v10, v11, v12, v13}, Lfg3/b;->q(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Object;)V

    invoke-static {v3, v4}, Lgi0/c;->f(J)D

    move-result-wide v11

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v14

    invoke-static {v3, v4}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    invoke-static {v11, v12}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v4

    filled-new-array {v14, v3, v4}, [Ljava/lang/Object;

    move-result-object v3

    const-string v4, "Calculated age for user userId={} using birthday={} to be age={}"

    invoke-interface {v10, v4, v3}, Lfg3/b;->h(Ljava/lang/String;[Ljava/lang/Object;)V

    invoke-static {v11, v12, v2, v5}, Lgi0/f;->g(DLcom/whoop/analytics/strain/model/BiologicalSex;Lcom/whoop/analytics/strain/model/FitnessLevel;)D

    move-result-wide v2

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-static {v2, v3}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v5

    const-string v11, "Max heart rate estimate for userId={} is {}"

    invoke-interface {v10, v11, v4, v5}, Lfg3/b;->q(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Object;)V

    invoke-static {}, Lcom/whoop/analytics/strain/model/StrainScore;->builder()Lcom/whoop/analytics/strain/model/StrainScore$Builder;

    move-result-object v4

    invoke-static {v2, v3}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v5

    invoke-virtual {v4, v5}, Lcom/whoop/analytics/strain/model/StrainScore$Builder;->setMaxHr(Ljava/lang/Double;)Lcom/whoop/analytics/strain/model/StrainScore$Builder;

    move-result-object v4

    invoke-static {v6, v7}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v5

    invoke-virtual {v4, v5}, Lcom/whoop/analytics/strain/model/StrainScore$Builder;->setAvgHr(Ljava/lang/Double;)Lcom/whoop/analytics/strain/model/StrainScore$Builder;

    move-result-object v4

    const-wide/16 v11, 0x0

    invoke-static {v11, v12}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v5

    invoke-virtual {v4, v5}, Lcom/whoop/analytics/strain/model/StrainScore$Builder;->setKilojoules(Ljava/lang/Double;)Lcom/whoop/analytics/strain/model/StrainScore$Builder;

    move-result-object v4

    invoke-virtual {v4, v5}, Lcom/whoop/analytics/strain/model/StrainScore$Builder;->setStrainScore(Ljava/lang/Double;)Lcom/whoop/analytics/strain/model/StrainScore$Builder;

    move-result-object v4

    invoke-virtual {v4, v0}, Lcom/whoop/analytics/strain/model/StrainScore$Builder;->setState(Lcom/whoop/analytics/strain/model/AnalyticsState;)Lcom/whoop/analytics/strain/model/StrainScore$Builder;

    move-result-object v4

    invoke-virtual {v4}, Lcom/whoop/analytics/strain/model/StrainScore$Builder;->build()Lcom/whoop/analytics/strain/model/StrainScore;

    move-result-object v4

    invoke-interface {v13}, Ljava/util/List;->size()I

    move-result v5

    if-nez v5, :cond_0

    const-string v0, "No rate data supplied to calculate strain for userId={} score={}"

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-interface {v10, v0, v1, v4}, Lfg3/b;->o(Ljava/lang/String;Ljava/lang/Number;Ljava/lang/Object;)V

    return-object v4

    :cond_0
    invoke-interface {v13}, Ljava/util/List;->size()I

    move-result v5

    const/4 v11, 0x3

    if-ge v5, v11, :cond_1

    invoke-interface {v13}, Ljava/util/List;->size()I

    move-result v5

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v11

    const-string v12, "Only had {} heart rate data supplied to calculate strain for userId={}"

    invoke-interface {v10, v12, v5, v11}, Lfg3/b;->o(Ljava/lang/String;Ljava/lang/Number;Ljava/lang/Object;)V

    :cond_1
    invoke-static {v1, v0}, Lgi0/i;->c(ILcom/whoop/analytics/strain/model/AnalyticsState;)Ljava/util/List;

    move-result-object v5

    invoke-interface {v5}, Ljava/util/Collection;->stream()Ljava/util/stream/Stream;

    move-result-object v5

    new-instance v10, Lgi0/d;

    const/4 v11, 0x0

    invoke-direct {v10, v11}, Lgi0/d;-><init>(I)V

    invoke-interface {v5, v10}, Ljava/util/stream/Stream;->map(Ljava/util/function/Function;)Ljava/util/stream/Stream;

    move-result-object v5

    invoke-static {}, Ljava/util/stream/Collectors;->toList()Ljava/util/stream/Collector;

    move-result-object v10

    invoke-interface {v5, v10}, Ljava/util/stream/Stream;->collect(Ljava/util/stream/Collector;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/util/List;

    invoke-virtual {v0}, Lcom/whoop/analytics/strain/model/AnalyticsState;->getLastUsed()Ljava/util/Optional;

    move-result-object v0

    const-wide/16 v10, 0x0

    invoke-static {v10, v11}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v10

    invoke-virtual {v0, v10}, Ljava/util/Optional;->orElse(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Long;

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v10

    new-instance v12, Ljava/util/ArrayList;

    invoke-direct {v12}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v5}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_0
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v14

    if-eqz v14, :cond_3

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v14

    check-cast v14, Lcom/whoop/analytics/strain/model/HeartRateTimestamp;

    invoke-virtual {v12, v14}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result v15

    if-nez v15, :cond_2

    invoke-virtual {v12, v14}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    move-wide/from16 v18, v2

    goto :goto_1

    :cond_2
    sget-object v15, Lgi0/f;->a:Lfg3/b;

    invoke-virtual {v14}, Lcom/whoop/analytics/strain/model/HeartRateTimestamp;->getTime()J

    move-result-wide v16

    move-wide/from16 v18, v2

    invoke-static/range {v16 .. v17}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v2

    invoke-virtual {v14}, Lcom/whoop/analytics/strain/model/HeartRateTimestamp;->getHeartRate()D

    move-result-wide v16

    invoke-static/range {v16 .. v17}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v3

    const-string v14, "Found duplicate leftover data for ts={} hr={}"

    invoke-interface {v15, v14, v2, v3}, Lfg3/b;->o(Ljava/lang/String;Ljava/lang/Number;Ljava/lang/Object;)V

    :goto_1
    move-wide/from16 v2, v18

    goto :goto_0

    :cond_3
    move-wide/from16 v18, v2

    invoke-interface {v13}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_2
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_5

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/whoop/analytics/strain/model/HeartRateTimestamp;

    invoke-virtual {v12, v3}, Ljava/util/ArrayList;->contains(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_4

    invoke-virtual {v12, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_2

    :cond_4
    sget-object v5, Lgi0/f;->a:Lfg3/b;

    invoke-virtual {v3}, Lcom/whoop/analytics/strain/model/HeartRateTimestamp;->getTime()J

    move-result-wide v13

    invoke-static {v13, v14}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v13

    invoke-virtual {v3}, Lcom/whoop/analytics/strain/model/HeartRateTimestamp;->getHeartRate()D

    move-result-wide v14

    invoke-static {v14, v15}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v3

    const-string v14, "Found duplicate heart rate data for ts={} hr={}"

    invoke-interface {v5, v14, v13, v3}, Lfg3/b;->o(Ljava/lang/String;Ljava/lang/Number;Ljava/lang/Object;)V

    goto :goto_2

    :cond_5
    invoke-static {v1, v12}, Lgi0/i;->b(ILjava/util/List;)Ljava/util/List;

    move-result-object v2

    invoke-static {v10, v11, v2}, Lgi0/f;->t(JLjava/util/List;)Lcom/whoop/analytics/strain/model/SmoothingResult;

    move-result-object v3

    invoke-virtual {v3}, Lcom/whoop/analytics/strain/model/SmoothingResult;->getSmoothedHrs()Ljava/util/List;

    move-result-object v5

    invoke-interface {v5}, Ljava/util/List;->size()I

    move-result v5

    if-nez v5, :cond_6

    sget-object v5, Lgi0/f;->a:Lfg3/b;

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    filled-new-array {v1, v0, v2}, [Ljava/lang/Object;

    move-result-object v0

    const-string v1, "No heart rates available after smoothing - no score for this. userId={} lastUsed={} heartRates={}"

    invoke-interface {v5, v1, v0}, Lfg3/b;->c(Ljava/lang/String;[Ljava/lang/Object;)V

    invoke-virtual {v4}, Lcom/whoop/analytics/strain/model/StrainScore;->getState()Ljava/util/Optional;

    move-result-object v0

    sget-object v1, Lcom/whoop/analytics/strain/model/util/ModelUtilities;->DefaultAnalyticsState:Lcom/whoop/analytics/strain/model/AnalyticsState;

    invoke-virtual {v0, v1}, Ljava/util/Optional;->orElse(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/whoop/analytics/strain/model/AnalyticsState;

    invoke-virtual {v3}, Lcom/whoop/analytics/strain/model/SmoothingResult;->getLastUsedTime()J

    move-result-wide v5

    invoke-static {v5, v6}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/whoop/analytics/strain/model/AnalyticsState;->withLastUsed(Ljava/lang/Long;)Lcom/whoop/analytics/strain/model/AnalyticsState;

    move-result-object v0

    invoke-interface {v2}, Ljava/util/Collection;->stream()Ljava/util/stream/Stream;

    move-result-object v1

    new-instance v2, Lgi0/d;

    const/4 v3, 0x1

    invoke-direct {v2, v3}, Lgi0/d;-><init>(I)V

    invoke-interface {v1, v2}, Ljava/util/stream/Stream;->map(Ljava/util/function/Function;)Ljava/util/stream/Stream;

    move-result-object v1

    invoke-static {}, Ljava/util/stream/Collectors;->toList()Ljava/util/stream/Collector;

    move-result-object v2

    invoke-interface {v1, v2}, Ljava/util/stream/Stream;->collect(Ljava/util/stream/Collector;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Iterable;

    invoke-virtual {v0, v1}, Lcom/whoop/analytics/strain/model/AnalyticsState;->withLeftOvers(Ljava/lang/Iterable;)Lcom/whoop/analytics/strain/model/AnalyticsState;

    move-result-object v0

    invoke-virtual {v4, v0}, Lcom/whoop/analytics/strain/model/StrainScore;->withState(Lcom/whoop/analytics/strain/model/AnalyticsState;)Lcom/whoop/analytics/strain/model/StrainScore;

    move-result-object v0

    return-object v0

    :cond_6
    sget-object v0, Lgi0/f;->a:Lfg3/b;

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-virtual {v3}, Lcom/whoop/analytics/strain/model/SmoothingResult;->getSmoothedHrs()Ljava/util/List;

    move-result-object v10

    filled-new-array {v5, v2, v10}, [Ljava/lang/Object;

    move-result-object v5

    const-string v10, "Heart rates smoothed userId={} heartRates={} smoothed={}"

    invoke-interface {v0, v10, v5}, Lfg3/b;->h(Ljava/lang/String;[Ljava/lang/Object;)V

    invoke-virtual {v3}, Lcom/whoop/analytics/strain/model/SmoothingResult;->getSmoothedHrs()Ljava/util/List;

    move-result-object v5

    invoke-interface {v5}, Ljava/util/Collection;->stream()Ljava/util/stream/Stream;

    move-result-object v5

    new-instance v10, Lgi0/a;

    const/4 v11, 0x1

    invoke-direct {v10, v11}, Lgi0/a;-><init>(I)V

    invoke-static {v10}, Ljava/util/stream/Collectors;->summarizingDouble(Ljava/util/function/ToDoubleFunction;)Ljava/util/stream/Collector;

    move-result-object v10

    invoke-interface {v5, v10}, Ljava/util/stream/Stream;->collect(Ljava/util/stream/Collector;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/util/DoubleSummaryStatistics;

    invoke-virtual {v5}, Ljava/util/DoubleSummaryStatistics;->getMax()D

    move-result-wide v10

    const-wide/high16 v12, 0x4024000000000000L    # 10.0

    add-double v12, v18, v12

    invoke-static {v12, v13, v10, v11}, Ljava/lang/Math;->max(DD)D

    move-result-wide v14

    cmpl-double v16, v10, v12

    if-lez v16, :cond_7

    move/from16 v16, v1

    invoke-static/range {v16 .. v16}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    move-object/from16 p1, v3

    invoke-static {v10, v11}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v3

    invoke-static {v12, v13}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v12

    filled-new-array {v1, v3, v12}, [Ljava/lang/Object;

    move-result-object v1

    const-string v3, "User logged heart rate greater than max estimate userId={} currentMaxHr={} estimate={}"

    invoke-interface {v0, v3, v1}, Lfg3/b;->c(Ljava/lang/String;[Ljava/lang/Object;)V

    goto :goto_3

    :cond_7
    move/from16 v16, v1

    move-object/from16 p1, v3

    :goto_3
    cmpl-double v1, v10, v8

    if-lez v1, :cond_8

    invoke-static/range {v16 .. v16}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-static {v8, v9}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v3

    invoke-static {v10, v11}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v8

    filled-new-array {v1, v3, v8}, [Ljava/lang/Object;

    move-result-object v1

    const-string v3, "User logged new max heart rate userId={} maxHeartRateFromProfile={} newLifetimeMax={}"

    invoke-interface {v0, v3, v1}, Lfg3/b;->c(Ljava/lang/String;[Ljava/lang/Object;)V

    move-wide v8, v10

    :cond_8
    invoke-virtual {v5}, Ljava/util/DoubleSummaryStatistics;->getAverage()D

    move-result-wide v12

    invoke-static/range {v16 .. v16}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-static {v6, v7}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v3

    invoke-static {v10, v11}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v5

    invoke-static {v14, v15}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v10

    invoke-static {v12, v13}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v11

    filled-new-array {v1, v3, v5, v10, v11}, [Ljava/lang/Object;

    move-result-object v1

    const-string v3, "Calculating strain for userId={}. restingHeartRate={} currentMaxHeartRate={} lifetimeMaxHeartRate={} averageCurrentHeartRate={}"

    invoke-interface {v0, v3, v1}, Lfg3/b;->h(Ljava/lang/String;[Ljava/lang/Object;)V

    cmpl-double v1, v6, v14

    if-gtz v1, :cond_9

    invoke-virtual/range {p1 .. p1}, Lcom/whoop/analytics/strain/model/SmoothingResult;->getSmoothedHrs()Ljava/util/List;

    move-result-object v5

    invoke-virtual/range {p1 .. p1}, Lcom/whoop/analytics/strain/model/SmoothingResult;->getLastUsedTime()J

    move-result-wide v10

    invoke-static/range {v5 .. v11}, Lgi0/f;->h(Ljava/util/List;DDJ)D

    move-result-wide v5

    invoke-static/range {v16 .. v16}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-static {v5, v6}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v3

    const-string v7, "Calculated raw strain for userId={}. rawStrainScore={}"

    invoke-interface {v0, v7, v1, v3}, Lfg3/b;->q(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Object;)V

    invoke-static {v5, v6}, Lgi0/f;->j(D)D

    move-result-wide v10

    invoke-static/range {v16 .. v16}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-static {v5, v6}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v3

    invoke-static {v10, v11}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v7

    filled-new-array {v1, v3, v7}, [Ljava/lang/Object;

    move-result-object v1

    const-string v3, "Calculated scaled strain for userId={}. rawStrainScore={} scaledStrainScore={}"

    invoke-interface {v0, v3, v1}, Lfg3/b;->h(Ljava/lang/String;[Ljava/lang/Object;)V

    invoke-virtual/range {p1 .. p1}, Lcom/whoop/analytics/strain/model/SmoothingResult;->getSmoothedHrs()Ljava/util/List;

    move-result-object v1

    invoke-virtual/range {p1 .. p1}, Lcom/whoop/analytics/strain/model/SmoothingResult;->getLastUsedTime()J

    move-result-wide v14

    move-object/from16 v3, p0

    invoke-static {v3, v1, v14, v15}, Lgi0/b;->d(Lcom/whoop/analytics/strain/model/UserProfile;Ljava/util/List;J)Lcom/whoop/analytics/strain/model/Calories;

    move-result-object v1

    invoke-static/range {v16 .. v16}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-virtual {v1}, Lcom/whoop/analytics/strain/model/Calories;->getTotalKilojoules()D

    move-result-wide v14

    invoke-static {v14, v15}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v7

    const-string v14, "Calculated calories for userId={}. totalKilojoules={}"

    invoke-interface {v0, v14, v3, v7}, Lfg3/b;->q(Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Object;)V

    invoke-virtual/range {p1 .. p1}, Lcom/whoop/analytics/strain/model/SmoothingResult;->getLastUsedTime()J

    move-result-wide v14

    invoke-static {v14, v15}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-static {v2, v0}, Lgi0/c;->d(Ljava/util/List;Ljava/lang/Long;)I

    move-result v0

    invoke-interface {v2}, Ljava/util/Collection;->stream()Ljava/util/stream/Stream;

    move-result-object v3

    new-instance v7, Lgi0/d;

    const/4 v14, 0x2

    invoke-direct {v7, v14}, Lgi0/d;-><init>(I)V

    invoke-interface {v3, v7}, Ljava/util/stream/Stream;->map(Ljava/util/function/Function;)Ljava/util/stream/Stream;

    move-result-object v3

    invoke-static {}, Ljava/util/stream/Collectors;->toList()Ljava/util/stream/Collector;

    move-result-object v7

    invoke-interface {v3, v7}, Ljava/util/stream/Stream;->collect(Ljava/util/stream/Collector;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/List;

    add-int/lit8 v0, v0, -0x3c

    const/4 v7, 0x0

    invoke-static {v7, v0}, Ljava/lang/Math;->max(II)I

    move-result v0

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    invoke-interface {v3, v0, v2}, Ljava/util/List;->subList(II)Ljava/util/List;

    move-result-object v0

    invoke-virtual {v4}, Lcom/whoop/analytics/strain/model/StrainScore;->getState()Ljava/util/Optional;

    move-result-object v2

    sget-object v3, Lcom/whoop/analytics/strain/model/util/ModelUtilities;->DefaultAnalyticsState:Lcom/whoop/analytics/strain/model/AnalyticsState;

    invoke-virtual {v2, v3}, Ljava/util/Optional;->orElse(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/whoop/analytics/strain/model/AnalyticsStateIF;

    invoke-static {v2}, Lcom/whoop/analytics/strain/model/AnalyticsState;->copyOf(Lcom/whoop/analytics/strain/model/AnalyticsStateIF;)Lcom/whoop/analytics/strain/model/AnalyticsState;

    move-result-object v2

    invoke-virtual/range {p1 .. p1}, Lcom/whoop/analytics/strain/model/SmoothingResult;->getLastUsedTime()J

    move-result-wide v14

    invoke-static {v14, v15}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v3

    invoke-virtual {v2, v3}, Lcom/whoop/analytics/strain/model/AnalyticsState;->withLastUsed(Ljava/lang/Long;)Lcom/whoop/analytics/strain/model/AnalyticsState;

    move-result-object v2

    invoke-virtual {v2, v0}, Lcom/whoop/analytics/strain/model/AnalyticsState;->withLeftOvers(Ljava/lang/Iterable;)Lcom/whoop/analytics/strain/model/AnalyticsState;

    move-result-object v0

    invoke-static {v4}, Lcom/whoop/analytics/strain/model/StrainScore;->copyOf(Lcom/whoop/analytics/strain/model/StrainScoreIF;)Lcom/whoop/analytics/strain/model/StrainScore;

    move-result-object v2

    invoke-static {v5, v6}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v3

    invoke-virtual {v2, v3}, Lcom/whoop/analytics/strain/model/StrainScore;->withStrainScore(Ljava/lang/Double;)Lcom/whoop/analytics/strain/model/StrainScore;

    move-result-object v2

    invoke-virtual {v2, v0}, Lcom/whoop/analytics/strain/model/StrainScore;->withState(Lcom/whoop/analytics/strain/model/AnalyticsState;)Lcom/whoop/analytics/strain/model/StrainScore;

    move-result-object v0

    invoke-static {v10, v11}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v2

    invoke-virtual {v0, v2}, Lcom/whoop/analytics/strain/model/StrainScore;->withScaledScore(Ljava/lang/Double;)Lcom/whoop/analytics/strain/model/StrainScore;

    move-result-object v0

    invoke-virtual {v1}, Lcom/whoop/analytics/strain/model/Calories;->getTotalKilojoules()D

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/whoop/analytics/strain/model/StrainScore;->withKilojoules(Ljava/lang/Double;)Lcom/whoop/analytics/strain/model/StrainScore;

    move-result-object v0

    invoke-static {v8, v9}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/whoop/analytics/strain/model/StrainScore;->withMaxHr(Ljava/lang/Double;)Lcom/whoop/analytics/strain/model/StrainScore;

    move-result-object v0

    invoke-static {v12, v13}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v1

    invoke-virtual {v0, v1}, Lcom/whoop/analytics/strain/model/StrainScore;->withAvgHr(Ljava/lang/Double;)Lcom/whoop/analytics/strain/model/StrainScore;

    move-result-object v0

    return-object v0

    :cond_9
    invoke-static {v6, v7}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v0

    invoke-static {v14, v15}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v1

    filled-new-array {v0, v1}, [Ljava/lang/Object;

    move-result-object v0

    const-string v1, "Resting heart rate must be less than max. restingHeartRate=%f maxHeartRate=%f"

    invoke-static {v1, v0}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v0

    new-instance v1, Ljava/lang/Exception;

    invoke-direct {v1, v0}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V

    throw v1
.end method

.method public static l(Ljava/util/List;J)Ljava/util/List;
    .locals 6
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/whoop/analytics/strain/model/HeartRateTimestamp;",
            ">;J)",
            "Ljava/util/List<",
            "Ljava/lang/Double;",
            ">;"
        }
    .end annotation

    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result v0

    if-nez v0, :cond_0

    const/4 p0, 0x0

    new-array p0, p0, [Ljava/lang/Double;

    invoke-static {p0}, Lgi0/c;->a([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p0

    return-object p0

    :cond_0
    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result v0

    const-wide/16 v1, 0x3e8

    const/4 v3, 0x1

    if-ne v0, v3, :cond_2

    const-wide/16 v4, -0x1

    cmp-long v0, p1, v4

    if-nez v0, :cond_1

    const-wide/high16 p0, 0x3ff0000000000000L    # 1.0

    invoke-static {p0, p1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object p0

    filled-new-array {p0}, [Ljava/lang/Double;

    move-result-object p0

    invoke-static {p0}, Lgi0/c;->a([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p0

    return-object p0

    :cond_1
    invoke-static {v3, p0}, Ld;->i(ILjava/util/List;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/whoop/analytics/strain/model/HeartRateTimestamp;

    invoke-virtual {p0}, Lcom/whoop/analytics/strain/model/HeartRateTimestamp;->getTime()J

    move-result-wide v3

    div-long/2addr v3, v1

    sub-long/2addr p1, v3

    long-to-double p0, p1

    const-wide/high16 v0, 0x4008000000000000L    # 3.0

    invoke-static {p0, p1, v0, v1}, Ljava/lang/Math;->min(DD)D

    move-result-wide p0

    invoke-static {p0, p1}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object p0

    filled-new-array {p0}, [Ljava/lang/Double;

    move-result-object p0

    invoke-static {p0}, Lgi0/c;->a([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p0

    return-object p0

    :cond_2
    invoke-interface {p0}, Ljava/util/Collection;->stream()Ljava/util/stream/Stream;

    move-result-object v0

    new-instance v4, Lgi0/d;

    const/4 v5, 0x3

    invoke-direct {v4, v5}, Lgi0/d;-><init>(I)V

    invoke-interface {v0, v4}, Ljava/util/stream/Stream;->map(Ljava/util/function/Function;)Ljava/util/stream/Stream;

    move-result-object v0

    invoke-static {}, Ljava/util/stream/Collectors;->toList()Ljava/util/stream/Collector;

    move-result-object v4

    invoke-interface {v0, v4}, Ljava/util/stream/Stream;->collect(Ljava/util/stream/Collector;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/util/List;

    invoke-static {v0, v1, v2}, Lgi0/c;->h(Ljava/util/List;J)Ljava/util/List;

    move-result-object v1

    const-wide/16 v4, 0x0

    cmp-long v2, p1, v4

    if-nez v2, :cond_3

    invoke-static {v3, v1}, Ld;->i(ILjava/util/List;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Double;

    invoke-interface {v1, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_3
    invoke-static {v3, v0}, Ld;->i(ILjava/util/List;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Long;

    invoke-virtual {v0}, Ljava/lang/Long;->longValue()J

    move-result-wide v2

    sub-long/2addr p1, v2

    long-to-double p1, p1

    const-wide v2, 0x408f400000000000L    # 1000.0

    div-double/2addr p1, v2

    invoke-static {p1, p2}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object p1

    invoke-interface {v1, p1}, Ljava/util/List;->add(Ljava/lang/Object;)Z

    :goto_0
    invoke-interface {v1}, Ljava/util/Collection;->stream()Ljava/util/stream/Stream;

    move-result-object p1

    new-instance p2, Lgi0/d;

    const/4 v0, 0x5

    invoke-direct {p2, v0}, Lgi0/d;-><init>(I)V

    invoke-interface {p1, p2}, Ljava/util/stream/Stream;->map(Ljava/util/function/Function;)Ljava/util/stream/Stream;

    move-result-object p1

    invoke-static {}, Ljava/util/stream/Collectors;->toList()Ljava/util/stream/Collector;

    move-result-object p2

    invoke-interface {p1, p2}, Ljava/util/stream/Stream;->collect(Ljava/util/stream/Collector;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/util/List;

    sget-object p2, Lgi0/f;->a:Lfg3/b;

    const-string v0, "Timescales for heart rates reserves={} scales={} timestampDiffs={}"

    filled-new-array {p0, p1, v1}, [Ljava/lang/Object;

    move-result-object p0

    invoke-interface {p2, v0, p0}, Lfg3/b;->h(Ljava/lang/String;[Ljava/lang/Object;)V

    return-object p1
.end method

.method public static m(Ljava/util/List;Ljava/util/List;)Ljava/util/List;
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/whoop/analytics/strain/model/HeartRateTimestamp;",
            ">;",
            "Ljava/util/List<",
            "Ljava/lang/Double;",
            ">;)",
            "Ljava/util/List<",
            "Ljava/lang/Double;",
            ">;"
        }
    .end annotation

    new-instance v0, Ljava/util/ArrayList;

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V

    const/4 v1, 0x0

    :goto_0
    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result v2

    if-ge v1, v2, :cond_1

    invoke-interface {p0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/whoop/analytics/strain/model/HeartRateTimestamp;

    invoke-virtual {v2}, Lcom/whoop/analytics/strain/model/HeartRateTimestamp;->getHeartRate()D

    move-result-wide v2

    invoke-interface {p1, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/Double;

    const-wide/16 v5, 0x0

    cmpl-double v7, v2, v5

    if-lez v7, :cond_0

    invoke-virtual {v4}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v4

    invoke-static {v2, v3, v4, v5}, Lgi0/f;->u(DD)D

    move-result-wide v2

    invoke-static {v2, v3}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_0
    invoke-static {v5, v6}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :goto_1
    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_1
    return-object v0
.end method

.method private static synthetic n(Ljava/lang/Double;)D
    .locals 2

    invoke-virtual {p0}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v0

    return-wide v0
.end method

.method private static synthetic o(DDLcom/whoop/analytics/strain/model/HeartRateTimestamp;)Lcom/whoop/analytics/strain/model/HeartRateTimestamp;
    .locals 7

    invoke-static {}, Lcom/whoop/analytics/strain/model/HeartRateTimestamp;->builder()Lcom/whoop/analytics/strain/model/HeartRateTimestamp$Builder;

    move-result-object v0

    invoke-virtual {p4}, Lcom/whoop/analytics/strain/model/HeartRateTimestamp;->getTime()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Lcom/whoop/analytics/strain/model/HeartRateTimestamp$Builder;->setTime(J)Lcom/whoop/analytics/strain/model/HeartRateTimestamp$Builder;

    move-result-object v0

    invoke-virtual {p4}, Lcom/whoop/analytics/strain/model/HeartRateTimestamp;->getHeartRate()D

    move-result-wide v1

    move-wide v3, p0

    move-wide v5, p2

    invoke-static/range {v1 .. v6}, Lgi0/c;->b(DDD)D

    move-result-wide p0

    invoke-virtual {v0, p0, p1}, Lcom/whoop/analytics/strain/model/HeartRateTimestamp$Builder;->setHeartRate(D)Lcom/whoop/analytics/strain/model/HeartRateTimestamp$Builder;

    move-result-object p0

    invoke-virtual {p0}, Lcom/whoop/analytics/strain/model/HeartRateTimestamp$Builder;->build()Lcom/whoop/analytics/strain/model/HeartRateTimestamp;

    move-result-object p0

    return-object p0
.end method

.method private static synthetic p(Ljava/util/List;)Lcom/whoop/analytics/strain/model/HeartRateTimestamp;
    .locals 3

    invoke-static {}, Lcom/whoop/analytics/strain/model/HeartRateTimestamp;->builder()Lcom/whoop/analytics/strain/model/HeartRateTimestamp$Builder;

    move-result-object v0

    const/4 v1, 0x0

    invoke-interface {p0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Long;

    invoke-virtual {v1}, Ljava/lang/Long;->longValue()J

    move-result-wide v1

    invoke-virtual {v0, v1, v2}, Lcom/whoop/analytics/strain/model/HeartRateTimestamp$Builder;->setTime(J)Lcom/whoop/analytics/strain/model/HeartRateTimestamp$Builder;

    move-result-object v0

    const/4 v1, 0x1

    invoke-interface {p0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Long;

    invoke-virtual {p0}, Ljava/lang/Long;->longValue()J

    move-result-wide v1

    long-to-double v1, v1

    invoke-virtual {v0, v1, v2}, Lcom/whoop/analytics/strain/model/HeartRateTimestamp$Builder;->setHeartRate(D)Lcom/whoop/analytics/strain/model/HeartRateTimestamp$Builder;

    move-result-object p0

    invoke-virtual {p0}, Lcom/whoop/analytics/strain/model/HeartRateTimestamp$Builder;->build()Lcom/whoop/analytics/strain/model/HeartRateTimestamp;

    move-result-object p0

    return-object p0
.end method

.method private static synthetic q(Lcom/whoop/analytics/strain/model/HeartRateTimestamp;)Ljava/util/List;
    .locals 3

    invoke-virtual {p0}, Lcom/whoop/analytics/strain/model/HeartRateTimestamp;->getTime()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-virtual {p0}, Lcom/whoop/analytics/strain/model/HeartRateTimestamp;->getHeartRate()D

    move-result-wide v1

    double-to-long v1, v1

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p0

    filled-new-array {v0, p0}, [Ljava/lang/Long;

    move-result-object p0

    invoke-static {p0}, Lgi0/c;->a([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method private static synthetic r(Lcom/whoop/analytics/strain/model/HeartRateTimestamp;)Ljava/util/List;
    .locals 3

    invoke-virtual {p0}, Lcom/whoop/analytics/strain/model/HeartRateTimestamp;->getTime()J

    move-result-wide v0

    invoke-static {v0, v1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v0

    invoke-virtual {p0}, Lcom/whoop/analytics/strain/model/HeartRateTimestamp;->getHeartRate()D

    move-result-wide v1

    double-to-long v1, v1

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p0

    filled-new-array {v0, p0}, [Ljava/lang/Long;

    move-result-object p0

    invoke-static {p0}, Lgi0/c;->a([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method private static synthetic s(Ljava/lang/Double;)Ljava/lang/Double;
    .locals 4

    invoke-virtual {p0}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v0

    const-wide/high16 v2, 0x4008000000000000L    # 3.0

    cmpl-double v0, v0, v2

    if-ltz v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v2

    :goto_0
    invoke-static {v2, v3}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object p0

    return-object p0
.end method

.method public static t(JLjava/util/List;)Lcom/whoop/analytics/strain/model/SmoothingResult;
    .locals 13
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(J",
            "Ljava/util/List<",
            "Lcom/whoop/analytics/strain/model/HeartRateTimestamp;",
            ">;)",
            "Lcom/whoop/analytics/strain/model/SmoothingResult;"
        }
    .end annotation

    invoke-static {p0, p1}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object p0

    invoke-static {p2, p0}, Lgi0/c;->d(Ljava/util/List;Ljava/lang/Long;)I

    move-result p0

    const/4 p1, 0x0

    invoke-static {p1, p0}, Ljava/lang/Math;->max(II)I

    move-result p0

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {p2}, Ljava/util/Collection;->stream()Ljava/util/stream/Stream;

    move-result-object v1

    new-instance v2, Lgi0/d;

    const/4 v3, 0x3

    invoke-direct {v2, v3}, Lgi0/d;-><init>(I)V

    invoke-interface {v1, v2}, Ljava/util/stream/Stream;->map(Ljava/util/function/Function;)Ljava/util/stream/Stream;

    move-result-object v1

    invoke-static {}, Ljava/util/stream/Collectors;->toList()Ljava/util/stream/Collector;

    move-result-object v2

    invoke-interface {v1, v2}, Ljava/util/stream/Stream;->collect(Ljava/util/stream/Collector;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/util/List;

    move v2, p0

    :goto_0
    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result v3

    const/16 v4, 0x1e

    sub-int/2addr v3, v4

    if-ge p0, v3, :cond_3

    invoke-interface {p2, p0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/whoop/analytics/strain/model/HeartRateTimestamp;

    invoke-virtual {v2}, Lcom/whoop/analytics/strain/model/HeartRateTimestamp;->getTime()J

    move-result-wide v2

    add-int/lit8 v5, p0, -0x1e

    invoke-static {p1, v5}, Ljava/lang/Math;->max(II)I

    move-result v5

    add-int/lit8 v6, p0, 0x1e

    invoke-interface {p2, v5, v6}, Ljava/util/List;->subList(II)Ljava/util/List;

    move-result-object v7

    invoke-interface {v1, v5, v6}, Ljava/util/List;->subList(II)Ljava/util/List;

    move-result-object v5

    invoke-static {v5}, Lgi0/c;->g(Ljava/util/List;)Ljava/util/List;

    move-result-object v5

    invoke-interface {v5}, Ljava/util/Collection;->stream()Ljava/util/stream/Stream;

    move-result-object v6

    new-instance v8, Ldb/k0;

    const/4 v9, 0x4

    invoke-direct {v8, v9}, Ldb/k0;-><init>(I)V

    invoke-interface {v6, v8}, Ljava/util/stream/Stream;->max(Ljava/util/Comparator;)Ljava/util/Optional;

    move-result-object v6

    const-wide/16 v8, 0x0

    invoke-static {v8, v9}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v8

    invoke-virtual {v6, v8}, Ljava/util/Optional;->orElse(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/Long;

    invoke-virtual {v6}, Ljava/lang/Long;->longValue()J

    move-result-wide v8

    const-wide/16 v10, 0x7530

    cmp-long v8, v8, v10

    if-ltz v8, :cond_1

    invoke-static {v5, v6}, Lgi0/c;->e(Ljava/util/List;Ljava/lang/Long;)I

    move-result v5

    if-lt v5, v4, :cond_0

    invoke-interface {v7}, Ljava/util/Collection;->stream()Ljava/util/stream/Stream;

    move-result-object v4

    int-to-long v5, v5

    invoke-interface {v4, v5, v6}, Ljava/util/stream/Stream;->limit(J)Ljava/util/stream/Stream;

    move-result-object v4

    invoke-static {}, Ljava/util/stream/Collectors;->toList()Ljava/util/stream/Collector;

    move-result-object v5

    invoke-interface {v4, v5}, Ljava/util/stream/Stream;->collect(Ljava/util/stream/Collector;)Ljava/lang/Object;

    move-result-object v4

    move-object v7, v4

    check-cast v7, Ljava/util/List;

    goto :goto_1

    :cond_0
    invoke-interface {v7}, Ljava/util/Collection;->stream()Ljava/util/stream/Stream;

    move-result-object v4

    add-int/lit8 v5, v5, 0x1

    int-to-long v5, v5

    invoke-interface {v4, v5, v6}, Ljava/util/stream/Stream;->skip(J)Ljava/util/stream/Stream;

    move-result-object v4

    invoke-interface {v7}, Ljava/util/List;->size()I

    move-result v5

    add-int/lit8 v5, v5, -0x1

    int-to-long v5, v5

    invoke-interface {v4, v5, v6}, Ljava/util/stream/Stream;->limit(J)Ljava/util/stream/Stream;

    move-result-object v4

    invoke-static {}, Ljava/util/stream/Collectors;->toList()Ljava/util/stream/Collector;

    move-result-object v5

    invoke-interface {v4, v5}, Ljava/util/stream/Stream;->collect(Ljava/util/stream/Collector;)Ljava/lang/Object;

    move-result-object v4

    move-object v7, v4

    check-cast v7, Ljava/util/List;

    :cond_1
    :goto_1
    invoke-interface {v7}, Ljava/util/List;->size()I

    move-result v4

    if-lez v4, :cond_2

    invoke-interface {v7}, Ljava/util/Collection;->stream()Ljava/util/stream/Stream;

    move-result-object v4

    new-instance v5, Lgi0/d;

    const/4 v6, 0x4

    invoke-direct {v5, v6}, Lgi0/d;-><init>(I)V

    invoke-interface {v4, v5}, Ljava/util/stream/Stream;->map(Ljava/util/function/Function;)Ljava/util/stream/Stream;

    move-result-object v4

    invoke-static {}, Ljava/util/stream/Collectors;->toList()Ljava/util/stream/Collector;

    move-result-object v5

    invoke-interface {v4, v5}, Ljava/util/stream/Stream;->collect(Ljava/util/stream/Collector;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/List;

    const-wide/high16 v5, 0x3fd0000000000000L    # 0.25

    invoke-static {v4, v5, v6}, Lgi0/c;->j(Ljava/util/List;D)Ljava/lang/Double;

    move-result-object v4

    invoke-static {}, Lcom/whoop/analytics/strain/model/HeartRateTimestamp;->builder()Lcom/whoop/analytics/strain/model/HeartRateTimestamp$Builder;

    move-result-object v5

    invoke-virtual {v5, v2, v3}, Lcom/whoop/analytics/strain/model/HeartRateTimestamp$Builder;->setTime(J)Lcom/whoop/analytics/strain/model/HeartRateTimestamp$Builder;

    move-result-object v2

    invoke-virtual {v4}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v3

    invoke-virtual {v2, v3, v4}, Lcom/whoop/analytics/strain/model/HeartRateTimestamp$Builder;->setHeartRate(D)Lcom/whoop/analytics/strain/model/HeartRateTimestamp$Builder;

    move-result-object v2

    invoke-virtual {v2}, Lcom/whoop/analytics/strain/model/HeartRateTimestamp$Builder;->build()Lcom/whoop/analytics/strain/model/HeartRateTimestamp;

    move-result-object v2

    invoke-virtual {v0, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :cond_2
    add-int/lit8 v2, p0, 0x1

    move v12, v2

    move v2, p0

    move p0, v12

    goto/16 :goto_0

    :cond_3
    invoke-static {}, Lcom/whoop/analytics/strain/model/SmoothingResult;->builder()Lcom/whoop/analytics/strain/model/SmoothingResult$Builder;

    move-result-object p0

    invoke-virtual {p0, v0}, Lcom/whoop/analytics/strain/model/SmoothingResult$Builder;->setSmoothedHrs(Ljava/lang/Iterable;)Lcom/whoop/analytics/strain/model/SmoothingResult$Builder;

    move-result-object p0

    invoke-virtual {p0, v2}, Lcom/whoop/analytics/strain/model/SmoothingResult$Builder;->setLastUsedIndex(I)Lcom/whoop/analytics/strain/model/SmoothingResult$Builder;

    move-result-object p0

    invoke-interface {p2, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lcom/whoop/analytics/strain/model/HeartRateTimestamp;

    invoke-virtual {p1}, Lcom/whoop/analytics/strain/model/HeartRateTimestamp;->getTime()J

    move-result-wide p1

    invoke-virtual {p0, p1, p2}, Lcom/whoop/analytics/strain/model/SmoothingResult$Builder;->setLastUsedTime(J)Lcom/whoop/analytics/strain/model/SmoothingResult$Builder;

    move-result-object p0

    invoke-virtual {p0}, Lcom/whoop/analytics/strain/model/SmoothingResult$Builder;->build()Lcom/whoop/analytics/strain/model/SmoothingResult;

    move-result-object p0

    return-object p0
.end method

.method private static u(DD)D
    .locals 4

    const-wide/high16 v0, 0x3ff0000000000000L    # 1.0

    sub-double p0, v0, p0

    mul-double/2addr p0, v0

    const-wide v2, 0x3fc3333333333333L    # 0.15

    div-double/2addr p0, v2

    invoke-static {p0, p1}, Ljava/lang/Math;->exp(D)D

    move-result-wide p0

    add-double/2addr p0, v0

    const-wide/high16 v0, 0x4030000000000000L    # 16.0

    div-double/2addr v0, p0

    mul-double/2addr v0, p2

    return-wide v0
.end method
