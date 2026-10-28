.class public final Lot2/h;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lot2/h$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0007\u0008\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J%\u0010\u000e\u001a\u0008\u0012\u0004\u0012\u00020\r0\u000c2\u0006\u0010\t\u001a\u00020\u00082\u0006\u0010\u000b\u001a\u00020\nH\u0002\u00a2\u0006\u0004\u0008\u000e\u0010\u000fJ%\u0010\u0010\u001a\u0008\u0012\u0004\u0012\u00020\r0\u000c2\u0006\u0010\t\u001a\u00020\u00082\u0006\u0010\u000b\u001a\u00020\nH\u0002\u00a2\u0006\u0004\u0008\u0010\u0010\u000fJ\u001d\u0010\u0012\u001a\u00020\u00112\u0006\u0010\t\u001a\u00020\u00082\u0006\u0010\u000b\u001a\u00020\n\u00a2\u0006\u0004\u0008\u0012\u0010\u0013J\u0013\u0010\u0016\u001a\u00020\u0015*\u00020\u0014H\u0000\u00a2\u0006\u0004\u0008\u0016\u0010\u0017R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0018\u0010\u0019R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001a\u0010\u001b\u00a8\u0006\u001c"
    }
    d2 = {
        "Lot2/h;",
        "",
        "Lot2/s;",
        "sliderStatReducer",
        "Lcom/whoop/data/repositories/FeatureFlagChecker;",
        "featureFlagChecker",
        "<init>",
        "(Lot2/s;Lcom/whoop/data/repositories/FeatureFlagChecker;)V",
        "Ljt2/m$i;",
        "domainState",
        "Ljt2/d;",
        "accumulator",
        "",
        "Lm91/u;",
        "e",
        "(Ljt2/m$i;Ljt2/d;)Ljava/util/List;",
        "d",
        "Lot2/r;",
        "h",
        "(Ljt2/m$i;Ljt2/d;)Lot2/r;",
        "Lcom/whoop/weeklyplan/hubandspoke/domain/models/MetricTrendStyle;",
        "Ly81/f;",
        "i",
        "(Lcom/whoop/weeklyplan/hubandspoke/domain/models/MetricTrendStyle;)Ly81/f;",
        "a",
        "Lot2/s;",
        "b",
        "Lcom/whoop/data/repositories/FeatureFlagChecker;",
        "weekly-plan_release"
    }
    k = 0x1
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# instance fields
.field private final a:Lot2/s;

.field private final b:Lcom/whoop/data/repositories/FeatureFlagChecker;


# direct methods
.method public constructor <init>(Lot2/s;Lcom/whoop/data/repositories/FeatureFlagChecker;)V
    .locals 1

    const-string v0, "sliderStatReducer"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "featureFlagChecker"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lot2/h;->a:Lot2/s;

    iput-object p2, p0, Lot2/h;->b:Lcom/whoop/data/repositories/FeatureFlagChecker;

    return-void
.end method

.method public static synthetic a(Lot2/h;Ljt2/d;Ljt2/m$i;Lcom/whoop/weeklyplan/hubandspoke/domain/api/MetricDetail;Ljb1/b;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Lot2/h;->g(Lot2/h;Ljt2/d;Ljt2/m$i;Lcom/whoop/weeklyplan/hubandspoke/domain/api/MetricDetail;Ljb1/b;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lcom/whoop/design/models/items/HorizontalStatModel;Ljb1/b;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lot2/h;->f(Lcom/whoop/design/models/items/HorizontalStatModel;Ljb1/b;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic c(Lot2/h;)Lot2/s;
    .locals 0

    iget-object p0, p0, Lot2/h;->a:Lot2/s;

    return-object p0
.end method

.method private final d(Ljt2/m$i;Ljt2/d;)Ljava/util/List;
    .locals 19
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljt2/m$i;",
            "Ljt2/d;",
            ")",
            "Ljava/util/List<",
            "Lm91/u;",
            ">;"
        }
    .end annotation

    move-object/from16 v0, p0

    invoke-virtual/range {p1 .. p1}, Ljt2/m$i;->b()Lcom/whoop/weeklyplan/hubandspoke/domain/api/HubAndSpokeResponse;

    move-result-object v1

    invoke-virtual {v1}, Lcom/whoop/weeklyplan/hubandspoke/domain/api/HubAndSpokeResponse;->getMetricDetails()Ljava/util/List;

    move-result-object v1

    check-cast v1, Ljava/lang/Iterable;

    instance-of v2, v1, Ljava/util/Collection;

    if-eqz v2, :cond_0

    move-object v2, v1

    check-cast v2, Ljava/util/Collection;

    invoke-interface {v2}, Ljava/util/Collection;->isEmpty()Z

    move-result v2

    if-eqz v2, :cond_0

    goto/16 :goto_6

    :cond_0
    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_9

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/whoop/weeklyplan/hubandspoke/domain/api/MetricDetail;

    invoke-virtual/range {p2 .. p2}, Ljt2/d;->t()Ljava/util/List;

    move-result-object v3

    invoke-virtual {v2}, Lcom/whoop/weeklyplan/hubandspoke/domain/api/MetricDetail;->getGoalTypeId()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-interface {v3, v2}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_1

    invoke-virtual/range {p1 .. p1}, Ljt2/m$i;->b()Lcom/whoop/weeklyplan/hubandspoke/domain/api/HubAndSpokeResponse;

    move-result-object v1

    invoke-virtual {v1}, Lcom/whoop/weeklyplan/hubandspoke/domain/api/HubAndSpokeResponse;->getMetricDetails()Ljava/util/List;

    move-result-object v1

    check-cast v1, Ljava/lang/Iterable;

    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_2
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_3

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    move-object v4, v3

    check-cast v4, Lcom/whoop/weeklyplan/hubandspoke/domain/api/MetricDetail;

    invoke-virtual/range {p2 .. p2}, Ljt2/d;->t()Ljava/util/List;

    move-result-object v5

    invoke-virtual {v4}, Lcom/whoop/weeklyplan/hubandspoke/domain/api/MetricDetail;->getGoalTypeId()I

    move-result v4

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-interface {v5, v4}, Ljava/util/List;->contains(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_2

    invoke-interface {v2, v3}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_3
    new-instance v1, Ljava/util/ArrayList;

    const/16 v3, 0xa

    invoke-static {v2, v3}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v4

    invoke-direct {v1, v4}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_1
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_8

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/whoop/weeklyplan/hubandspoke/domain/api/MetricDetail;

    invoke-virtual {v4}, Lcom/whoop/weeklyplan/hubandspoke/domain/api/MetricDetail;->getGoalTypeId()I

    move-result v5

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-virtual {v4}, Lcom/whoop/weeklyplan/hubandspoke/domain/api/MetricDetail;->getMetricCard()Lcom/whoop/weeklyplan/hubandspoke/domain/models/MetricCardModel;

    move-result-object v5

    invoke-virtual {v5}, Lcom/whoop/weeklyplan/hubandspoke/domain/models/MetricCardModel;->getLeftIcon()Ljava/lang/String;

    move-result-object v5

    sget-object v6, Lgz0/m0;->ACTIVITY:Lgz0/m0;

    invoke-static {}, Lgz0/m0;->values()[Lgz0/m0;

    move-result-object v8

    array-length v9, v8

    const/4 v10, 0x0

    :goto_2
    const/4 v11, 0x0

    if-ge v10, v9, :cond_5

    aget-object v12, v8, v10

    invoke-virtual {v12}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v13

    invoke-static {v13, v5}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v13

    if-eqz v13, :cond_4

    goto :goto_3

    :cond_4
    add-int/lit8 v10, v10, 0x1

    goto :goto_2

    :cond_5
    move-object v12, v11

    :goto_3
    if-nez v12, :cond_6

    move-object v8, v6

    goto :goto_4

    :cond_6
    move-object v8, v12

    :goto_4
    invoke-virtual {v4}, Lcom/whoop/weeklyplan/hubandspoke/domain/api/MetricDetail;->getMetricPlanTile()Lcom/whoop/weeklyplan/hubandspoke/domain/models/MetricPlanTileModel;

    move-result-object v5

    invoke-virtual {v5}, Lcom/whoop/weeklyplan/hubandspoke/domain/models/MetricPlanTileModel;->getTitle()Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v9

    invoke-static {}, Lcom/whoop/design/util/b;->a()Lcom/whoop/design/util/TextResource;

    move-result-object v10

    invoke-virtual {v4}, Lcom/whoop/weeklyplan/hubandspoke/domain/api/MetricDetail;->getMetricCard()Lcom/whoop/weeklyplan/hubandspoke/domain/models/MetricCardModel;

    move-result-object v5

    invoke-virtual {v5}, Lcom/whoop/weeklyplan/hubandspoke/domain/models/MetricCardModel;->getBarStyles()Ljava/util/List;

    move-result-object v5

    if-eqz v5, :cond_7

    check-cast v5, Ljava/lang/Iterable;

    new-instance v11, Ljava/util/ArrayList;

    invoke-static {v5, v3}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v6

    invoke-direct {v11, v6}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_5
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_7

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lcom/whoop/weeklyplan/hubandspoke/domain/models/MetricTrendStyle;

    invoke-virtual {v0, v6}, Lot2/h;->i(Lcom/whoop/weeklyplan/hubandspoke/domain/models/MetricTrendStyle;)Ly81/f;

    move-result-object v6

    invoke-interface {v11, v6}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_5

    :cond_7
    move-object v12, v11

    invoke-virtual {v4}, Lcom/whoop/weeklyplan/hubandspoke/domain/api/MetricDetail;->getMetricPlanTile()Lcom/whoop/weeklyplan/hubandspoke/domain/models/MetricPlanTileModel;

    move-result-object v5

    invoke-virtual {v5}, Lcom/whoop/weeklyplan/hubandspoke/domain/models/MetricPlanTileModel;->getMetricValue()Lcom/whoop/weeklyplan/hubandspoke/domain/models/MetricValue;

    move-result-object v5

    invoke-virtual {v5}, Lcom/whoop/weeklyplan/hubandspoke/domain/models/MetricValue;->getMetricValue()Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v13

    invoke-virtual {v4}, Lcom/whoop/weeklyplan/hubandspoke/domain/api/MetricDetail;->getMetricPlanTile()Lcom/whoop/weeklyplan/hubandspoke/domain/models/MetricPlanTileModel;

    move-result-object v4

    invoke-virtual {v4}, Lcom/whoop/weeklyplan/hubandspoke/domain/models/MetricPlanTileModel;->getMetricValue()Lcom/whoop/weeklyplan/hubandspoke/domain/models/MetricValue;

    move-result-object v4

    invoke-virtual {v4}, Lcom/whoop/weeklyplan/hubandspoke/domain/models/MetricValue;->getMetricValueStyle()Lcom/whoop/weeklyplan/hubandspoke/domain/models/MetricTrendStyle;

    move-result-object v4

    invoke-virtual {v0, v4}, Lot2/h;->i(Lcom/whoop/weeklyplan/hubandspoke/domain/models/MetricTrendStyle;)Ly81/f;

    move-result-object v14

    sget-object v15, Lgz0/m0;->ADD:Lgz0/m0;

    new-instance v6, Lqt2/v;

    const/4 v11, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x200

    const/16 v18, 0x0

    invoke-direct/range {v6 .. v18}, Lqt2/v;-><init>(Ljava/lang/Integer;Lgz0/m0;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lf41/a;Ljava/util/List;Lcom/whoop/design/util/TextResource;Ly81/f;Lgz0/m0;Ljava/lang/Object;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {v1, v6}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto/16 :goto_1

    :cond_8
    return-object v1

    :cond_9
    :goto_6
    new-instance v1, Lqt2/h;

    invoke-virtual/range {p1 .. p1}, Ljt2/m$i;->b()Lcom/whoop/weeklyplan/hubandspoke/domain/api/HubAndSpokeResponse;

    move-result-object v2

    invoke-virtual {v2}, Lcom/whoop/weeklyplan/hubandspoke/domain/api/HubAndSpokeResponse;->getMetricScreen()Lcom/whoop/weeklyplan/hubandspoke/domain/api/MetricScreen;

    move-result-object v2

    invoke-virtual {v2}, Lcom/whoop/weeklyplan/hubandspoke/domain/api/MetricScreen;->getUnselectedEmptyState()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v2

    invoke-direct {v1, v2}, Lqt2/h;-><init>(Lcom/whoop/design/util/TextResource;)V

    invoke-static {v1}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    return-object v1
.end method

.method private final e(Ljt2/m$i;Ljt2/d;)Ljava/util/List;
    .locals 22
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljt2/m$i;",
            "Ljt2/d;",
            ")",
            "Ljava/util/List<",
            "Lm91/u;",
            ">;"
        }
    .end annotation

    new-instance v0, Lqt2/m;

    invoke-virtual/range {p1 .. p1}, Ljt2/m$i;->b()Lcom/whoop/weeklyplan/hubandspoke/domain/api/HubAndSpokeResponse;

    move-result-object v1

    invoke-virtual {v1}, Lcom/whoop/weeklyplan/hubandspoke/domain/api/HubAndSpokeResponse;->getMetricScreen()Lcom/whoop/weeklyplan/hubandspoke/domain/api/MetricScreen;

    move-result-object v1

    invoke-virtual {v1}, Lcom/whoop/weeklyplan/hubandspoke/domain/api/MetricScreen;->getSelectedHeader()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v1

    invoke-virtual/range {p2 .. p2}, Ljt2/d;->t()Ljava/util/List;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    new-instance v3, Ljava/lang/StringBuilder;

    const-string v4, "("

    invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string v2, ")"

    invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v2

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v3, 0x0

    invoke-direct/range {v0 .. v5}, Lqt2/m;-><init>(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lgz0/m0;Lmt2/g;)V

    invoke-virtual/range {p2 .. p2}, Ljt2/d;->t()Ljava/util/List;

    move-result-object v1

    invoke-interface {v1}, Ljava/util/List;->isEmpty()Z

    move-result v1

    if-eqz v1, :cond_0

    new-instance v1, Lqt2/h;

    invoke-virtual/range {p1 .. p1}, Ljt2/m$i;->b()Lcom/whoop/weeklyplan/hubandspoke/domain/api/HubAndSpokeResponse;

    move-result-object v2

    invoke-virtual {v2}, Lcom/whoop/weeklyplan/hubandspoke/domain/api/HubAndSpokeResponse;->getMetricScreen()Lcom/whoop/weeklyplan/hubandspoke/domain/api/MetricScreen;

    move-result-object v2

    invoke-virtual {v2}, Lcom/whoop/weeklyplan/hubandspoke/domain/api/MetricScreen;->getSelectedEmptyState()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v2

    invoke-direct {v1, v2}, Lqt2/h;-><init>(Lcom/whoop/design/util/TextResource;)V

    invoke-static {v1}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    goto/16 :goto_c

    :cond_0
    invoke-virtual/range {p2 .. p2}, Ljt2/d;->t()Ljava/util/List;

    move-result-object v1

    check-cast v1, Ljava/lang/Iterable;

    new-instance v2, Ljava/util/ArrayList;

    const/16 v3, 0xa

    invoke-static {v1, v3}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v4

    invoke-direct {v2, v4}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_11

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/Number;

    invoke-virtual {v4}, Ljava/lang/Number;->intValue()I

    move-result v4

    invoke-virtual/range {p1 .. p1}, Ljt2/m$i;->b()Lcom/whoop/weeklyplan/hubandspoke/domain/api/HubAndSpokeResponse;

    move-result-object v5

    invoke-virtual {v5}, Lcom/whoop/weeklyplan/hubandspoke/domain/api/HubAndSpokeResponse;->getMetricDetails()Ljava/util/List;

    move-result-object v5

    check-cast v5, Ljava/lang/Iterable;

    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :cond_1
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    const/4 v7, 0x0

    if-eqz v6, :cond_2

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    move-object v8, v6

    check-cast v8, Lcom/whoop/weeklyplan/hubandspoke/domain/api/MetricDetail;

    invoke-virtual {v8}, Lcom/whoop/weeklyplan/hubandspoke/domain/api/MetricDetail;->getGoalTypeId()I

    move-result v8

    if-ne v8, v4, :cond_1

    goto :goto_1

    :cond_2
    move-object v6, v7

    :goto_1
    move-object v12, v6

    check-cast v12, Lcom/whoop/weeklyplan/hubandspoke/domain/api/MetricDetail;

    if-eqz v12, :cond_10

    invoke-virtual {v12}, Lcom/whoop/weeklyplan/hubandspoke/domain/api/MetricDetail;->getMetricCard()Lcom/whoop/weeklyplan/hubandspoke/domain/models/MetricCardModel;

    move-result-object v4

    invoke-virtual {v4}, Lcom/whoop/weeklyplan/hubandspoke/domain/models/MetricCardModel;->getTitle()Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v14

    invoke-virtual {v12}, Lcom/whoop/weeklyplan/hubandspoke/domain/api/MetricDetail;->getGoalTypeId()I

    move-result v18

    invoke-virtual {v12}, Lcom/whoop/weeklyplan/hubandspoke/domain/api/MetricDetail;->getMetricCard()Lcom/whoop/weeklyplan/hubandspoke/domain/models/MetricCardModel;

    move-result-object v4

    invoke-virtual {v4}, Lcom/whoop/weeklyplan/hubandspoke/domain/models/MetricCardModel;->getHorizontalStatAvg()Lcom/whoop/design/models/items/HorizontalStatModel;

    move-result-object v4

    new-instance v5, Lot2/f;

    const/4 v6, 0x1

    invoke-direct {v5, v4, v6}, Lot2/f;-><init>(Lcom/whoop/design/models/items/HorizontalStatModel;I)V

    invoke-static {v5}, Ljb1/c;->d(Lkotlin/jvm/functions/Function1;)Ljb1/a;

    move-result-object v5

    invoke-virtual {v5, v4}, Ljb1/a;->h(Lcom/whoop/design/models/DesignSystemModel;)Lm91/u;

    move-result-object v4

    const-string v5, "null cannot be cast to non-null type com.whoop.design.atomic.molecule.HorizontalStatState"

    invoke-static {v4, v5}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v19, v4

    check-cast v19, Lsz0/q;

    invoke-virtual {v12}, Lcom/whoop/weeklyplan/hubandspoke/domain/api/MetricDetail;->getMetricCard()Lcom/whoop/weeklyplan/hubandspoke/domain/models/MetricCardModel;

    move-result-object v4

    invoke-virtual {v4}, Lcom/whoop/weeklyplan/hubandspoke/domain/models/MetricCardModel;->getHorizontalStatGoal()Lcom/whoop/design/models/items/HorizontalStatModel;

    move-result-object v4

    new-instance v8, Ljp2/l;

    const/16 v13, 0x13

    move-object/from16 v9, p0

    move-object/from16 v11, p1

    move-object/from16 v10, p2

    invoke-direct/range {v8 .. v13}, Ljp2/l;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    invoke-static {v8}, Ljb1/c;->d(Lkotlin/jvm/functions/Function1;)Ljb1/a;

    move-result-object v6

    invoke-virtual {v6, v4}, Ljb1/a;->h(Lcom/whoop/design/models/DesignSystemModel;)Lm91/u;

    move-result-object v4

    invoke-static {v4, v5}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v20, v4

    check-cast v20, Lsz0/q;

    invoke-virtual {v12}, Lcom/whoop/weeklyplan/hubandspoke/domain/api/MetricDetail;->getMetricCard()Lcom/whoop/weeklyplan/hubandspoke/domain/models/MetricCardModel;

    move-result-object v4

    invoke-virtual {v4}, Lcom/whoop/weeklyplan/hubandspoke/domain/models/MetricCardModel;->getRecommendationText()Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v21

    invoke-virtual {v12}, Lcom/whoop/weeklyplan/hubandspoke/domain/api/MetricDetail;->getMetricCard()Lcom/whoop/weeklyplan/hubandspoke/domain/models/MetricCardModel;

    move-result-object v4

    invoke-virtual {v4}, Lcom/whoop/weeklyplan/hubandspoke/domain/models/MetricCardModel;->getBarStyles()Ljava/util/List;

    move-result-object v4

    if-eqz v4, :cond_8

    check-cast v4, Ljava/lang/Iterable;

    new-instance v5, Ljava/util/ArrayList;

    invoke-static {v4, v3}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v6

    invoke-direct {v5, v6}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_2
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_7

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lcom/whoop/weeklyplan/hubandspoke/domain/models/MetricTrendStyle;

    sget-object v8, Lot2/h$a;->a:[I

    invoke-virtual {v6}, Ljava/lang/Enum;->ordinal()I

    move-result v6

    aget v6, v8, v6

    const/4 v8, 0x1

    if-eq v6, v8, :cond_6

    const/4 v8, 0x2

    if-eq v6, v8, :cond_5

    const/4 v8, 0x3

    if-eq v6, v8, :cond_4

    const/4 v8, 0x4

    if-ne v6, v8, :cond_3

    sget-object v6, Ly81/f;->WHITE_10:Ly81/f;

    goto :goto_3

    :cond_3
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0

    :cond_4
    sget-object v6, Ly81/f;->WHITE_50:Ly81/f;

    goto :goto_3

    :cond_5
    sget-object v6, Ly81/f;->ACCENT_ACTION:Ly81/f;

    goto :goto_3

    :cond_6
    sget-object v6, Ly81/f;->ACCENT_NEGATIVE_TREND:Ly81/f;

    :goto_3
    invoke-virtual {v5, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_2

    :cond_7
    :goto_4
    move-object/from16 v17, v5

    goto :goto_5

    :cond_8
    sget-object v5, Lm83/y;->w:Lm83/y;

    goto :goto_4

    :goto_5
    invoke-virtual {v12}, Lcom/whoop/weeklyplan/hubandspoke/domain/api/MetricDetail;->getMetricCard()Lcom/whoop/weeklyplan/hubandspoke/domain/models/MetricCardModel;

    move-result-object v4

    invoke-virtual {v4}, Lcom/whoop/weeklyplan/hubandspoke/domain/models/MetricCardModel;->getLeftIcon()Ljava/lang/String;

    move-result-object v4

    sget-object v5, Lgz0/m0;->ACTIVITY:Lgz0/m0;

    invoke-static {}, Lgz0/m0;->values()[Lgz0/m0;

    move-result-object v6

    array-length v8, v6

    const/4 v9, 0x0

    move v10, v9

    :goto_6
    if-ge v10, v8, :cond_a

    aget-object v11, v6, v10

    invoke-virtual {v11}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v13

    invoke-static {v13, v4}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v13

    if-eqz v13, :cond_9

    goto :goto_7

    :cond_9
    add-int/lit8 v10, v10, 0x1

    goto :goto_6

    :cond_a
    move-object v11, v7

    :goto_7
    if-nez v11, :cond_b

    goto :goto_8

    :cond_b
    move-object v5, v11

    :goto_8
    invoke-virtual {v5}, Lgz0/m0;->toWhoopIcon()I

    move-result v4

    invoke-virtual {v12}, Lcom/whoop/weeklyplan/hubandspoke/domain/api/MetricDetail;->getMetricCard()Lcom/whoop/weeklyplan/hubandspoke/domain/models/MetricCardModel;

    move-result-object v5

    invoke-virtual {v5}, Lcom/whoop/weeklyplan/hubandspoke/domain/models/MetricCardModel;->getRightIcon()Ljava/lang/String;

    move-result-object v5

    if-eqz v5, :cond_f

    sget-object v6, Lgz0/m0;->ACTIVITY:Lgz0/m0;

    invoke-static {}, Lgz0/m0;->values()[Lgz0/m0;

    move-result-object v8

    array-length v10, v8

    :goto_9
    if-ge v9, v10, :cond_d

    aget-object v11, v8, v9

    invoke-virtual {v11}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v12

    invoke-static {v12, v5}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v12

    if-eqz v12, :cond_c

    move-object v7, v11

    goto :goto_a

    :cond_c
    add-int/lit8 v9, v9, 0x1

    goto :goto_9

    :cond_d
    :goto_a
    if-nez v7, :cond_e

    goto :goto_b

    :cond_e
    move-object v6, v7

    :goto_b
    invoke-virtual {v6}, Lgz0/m0;->toWhoopIcon()I

    move-result v5

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    :cond_f
    move-object/from16 v16, v7

    new-instance v13, Lqt2/r;

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v15

    invoke-direct/range {v13 .. v21}, Lqt2/r;-><init>(Lcom/whoop/design/util/TextResource;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/util/List;ILsz0/q;Lsz0/q;Lcom/whoop/design/util/TextResource;)V

    move-object v7, v13

    :cond_10
    invoke-virtual {v2, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto/16 :goto_0

    :cond_11
    move-object v1, v2

    :goto_c
    invoke-static {v0}, Lwb3/f;->J(Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/util/Collection;

    check-cast v1, Ljava/lang/Iterable;

    invoke-static {v1}, Lm83/s;->D0(Ljava/lang/Iterable;)Ljava/util/ArrayList;

    move-result-object v1

    invoke-static {v0, v1}, Lm83/s;->g1(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/ArrayList;

    move-result-object v0

    return-object v0
.end method

.method private static final f(Lcom/whoop/design/models/items/HorizontalStatModel;Ljb1/b;)Ll83/a0;
    .locals 2

    const-string v0, "$this$designItemReducer"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-class v0, Lsz0/q;

    sget-object v1, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v1, v0}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v0

    new-instance v1, Lot2/h$b;

    invoke-direct {v1, p0}, Lot2/h$b;-><init>(Lcom/whoop/design/models/items/HorizontalStatModel;)V

    invoke-virtual {p1, v0, v1}, Ljb1/b;->a(Lj93/d;Lkotlin/jvm/functions/Function1;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final g(Lot2/h;Ljt2/d;Ljt2/m$i;Lcom/whoop/weeklyplan/hubandspoke/domain/api/MetricDetail;Ljb1/b;)Ll83/a0;
    .locals 2

    const-string v0, "$this$designItemReducer"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-class v0, Lsz0/q;

    sget-object v1, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v1, v0}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v0

    new-instance v1, Lot2/h$c;

    invoke-direct {v1, p0, p1, p2, p3}, Lot2/h$c;-><init>(Lot2/h;Ljt2/d;Ljt2/m$i;Lcom/whoop/weeklyplan/hubandspoke/domain/api/MetricDetail;)V

    invoke-virtual {p4, v0, v1}, Ljb1/b;->a(Lj93/d;Lkotlin/jvm/functions/Function1;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method


# virtual methods
.method public final h(Ljt2/m$i;Ljt2/d;)Lot2/r;
    .locals 18

    const-string v0, "domainState"

    move-object/from16 v1, p1

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "accumulator"

    move-object/from16 v2, p2

    invoke-static {v2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v1}, Ljt2/m$i;->b()Lcom/whoop/weeklyplan/hubandspoke/domain/api/HubAndSpokeResponse;

    move-result-object v0

    invoke-virtual {v0}, Lcom/whoop/weeklyplan/hubandspoke/domain/api/HubAndSpokeResponse;->getMetricScreen()Lcom/whoop/weeklyplan/hubandspoke/domain/api/MetricScreen;

    move-result-object v3

    invoke-virtual {v3}, Lcom/whoop/weeklyplan/hubandspoke/domain/api/MetricScreen;->getNavigationTitleDisplay()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v5

    invoke-virtual {v0}, Lcom/whoop/weeklyplan/hubandspoke/domain/api/HubAndSpokeResponse;->getMetricScreen()Lcom/whoop/weeklyplan/hubandspoke/domain/api/MetricScreen;

    move-result-object v3

    invoke-virtual {v3}, Lcom/whoop/weeklyplan/hubandspoke/domain/api/MetricScreen;->getHeaderDisplay()Ljava/lang/String;

    move-result-object v3

    if-eqz v3, :cond_0

    invoke-static {v3}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v3

    move-object v6, v3

    goto :goto_0

    :cond_0
    const/4 v6, 0x0

    :goto_0
    invoke-virtual {v0}, Lcom/whoop/weeklyplan/hubandspoke/domain/api/HubAndSpokeResponse;->getMetricScreen()Lcom/whoop/weeklyplan/hubandspoke/domain/api/MetricScreen;

    move-result-object v3

    invoke-virtual {v3}, Lcom/whoop/weeklyplan/hubandspoke/domain/api/MetricScreen;->getSubtitle()Ljava/lang/String;

    move-result-object v3

    if-eqz v3, :cond_1

    invoke-static {v3}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v3

    move-object v7, v3

    goto :goto_1

    :cond_1
    const/4 v7, 0x0

    :goto_1
    invoke-direct/range {p0 .. p2}, Lot2/h;->e(Ljt2/m$i;Ljt2/d;)Ljava/util/List;

    move-result-object v8

    invoke-virtual {v0}, Lcom/whoop/weeklyplan/hubandspoke/domain/api/HubAndSpokeResponse;->getMetricScreen()Lcom/whoop/weeklyplan/hubandspoke/domain/api/MetricScreen;

    move-result-object v3

    invoke-virtual {v3}, Lcom/whoop/weeklyplan/hubandspoke/domain/api/MetricScreen;->getUnselectedHeader()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v9

    invoke-virtual {v0}, Lcom/whoop/weeklyplan/hubandspoke/domain/api/HubAndSpokeResponse;->getMetricScreen()Lcom/whoop/weeklyplan/hubandspoke/domain/api/MetricScreen;

    move-result-object v3

    invoke-virtual {v3}, Lcom/whoop/weeklyplan/hubandspoke/domain/api/MetricScreen;->getTimeRange()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v10

    invoke-virtual {v0}, Lcom/whoop/weeklyplan/hubandspoke/domain/api/HubAndSpokeResponse;->getMetricScreen()Lcom/whoop/weeklyplan/hubandspoke/domain/api/MetricScreen;

    move-result-object v3

    invoke-virtual {v3}, Lcom/whoop/weeklyplan/hubandspoke/domain/api/MetricScreen;->getLegend()Ljava/util/List;

    move-result-object v3

    check-cast v3, Ljava/lang/Iterable;

    new-instance v11, Ljava/util/ArrayList;

    const/16 v12, 0xa

    invoke-static {v3, v12}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v12

    invoke-direct {v11, v12}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v3

    const/4 v12, 0x0

    move v13, v12

    :goto_2
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v14

    const/4 v15, 0x1

    if-eqz v14, :cond_5

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v14

    add-int/lit8 v16, v13, 0x1

    if-ltz v13, :cond_4

    check-cast v14, Ljava/lang/String;

    const/16 v17, 0x0

    new-instance v4, Lot2/q;

    invoke-static {v14}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v14

    if-eqz v13, :cond_3

    if-eq v13, v15, :cond_2

    sget-object v13, Ly81/f;->ACCENT_POSITIVE_TREND:Ly81/f;

    goto :goto_3

    :cond_2
    sget-object v13, Ly81/f;->WHITE_50:Ly81/f;

    goto :goto_3

    :cond_3
    sget-object v13, Ly81/f;->ACCENT_NEGATIVE_TREND:Ly81/f;

    :goto_3
    invoke-direct {v4, v14, v13}, Lot2/q;-><init>(Lcom/whoop/design/util/TextResource;Ly81/f;)V

    invoke-virtual {v11, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    move/from16 v13, v16

    goto :goto_2

    :cond_4
    const/16 v17, 0x0

    invoke-static {}, Lwb3/f;->d0()V

    throw v17

    :cond_5
    invoke-direct/range {p0 .. p2}, Lot2/h;->d(Ljt2/m$i;Ljt2/d;)Ljava/util/List;

    move-result-object v1

    invoke-virtual {v0}, Lcom/whoop/weeklyplan/hubandspoke/domain/api/HubAndSpokeResponse;->getMetricScreen()Lcom/whoop/weeklyplan/hubandspoke/domain/api/MetricScreen;

    move-result-object v0

    invoke-virtual {v0}, Lcom/whoop/weeklyplan/hubandspoke/domain/api/MetricScreen;->getButtonText()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v13

    invoke-virtual {v2}, Ljt2/d;->t()Ljava/util/List;

    move-result-object v0

    invoke-virtual {v2}, Ljt2/d;->e()Ljava/util/List;

    move-result-object v3

    invoke-static {v0, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_7

    invoke-virtual {v2}, Ljt2/d;->l()Ljava/util/List;

    move-result-object v0

    invoke-virtual {v2}, Ljt2/d;->r()Ljava/util/List;

    move-result-object v2

    invoke-static {v0, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_6

    goto :goto_4

    :cond_6
    move v14, v12

    goto :goto_5

    :cond_7
    :goto_4
    move v14, v15

    :goto_5
    new-instance v4, Lot2/r;

    move-object v12, v1

    invoke-direct/range {v4 .. v14}, Lot2/r;-><init>(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/util/List;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/util/List;Ljava/util/List;Lcom/whoop/design/util/TextResource;Z)V

    return-object v4
.end method

.method public final i(Lcom/whoop/weeklyplan/hubandspoke/domain/models/MetricTrendStyle;)Ly81/f;
    .locals 1

    const-string v0, "<this>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lot2/h$a;->a:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    aget p1, v0, p1

    const/4 v0, 0x1

    if-eq p1, v0, :cond_3

    const/4 v0, 0x2

    if-eq p1, v0, :cond_2

    const/4 v0, 0x3

    if-eq p1, v0, :cond_1

    const/4 v0, 0x4

    if-ne p1, v0, :cond_0

    sget-object p1, Ly81/f;->WHITE_10:Ly81/f;

    return-object p1

    :cond_0
    new-instance p1, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p1}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p1

    :cond_1
    sget-object p1, Ly81/f;->WHITE_50:Ly81/f;

    return-object p1

    :cond_2
    sget-object p1, Ly81/f;->ACCENT_ACTION:Ly81/f;

    return-object p1

    :cond_3
    sget-object p1, Ly81/f;->ACCENT_NEGATIVE_TREND:Ly81/f;

    return-object p1
.end method
