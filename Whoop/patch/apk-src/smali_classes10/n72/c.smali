.class public abstract Ln72/c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0000\u00a2\u0006\u0004\u0008\u0003\u0010\u0004\u00a8\u0006\u0005"
    }
    d2 = {
        "Lcom/whoop/data/repositories/FeatureFlagChecker;",
        "featureFlagChecker",
        "Ljb1/a;",
        "f",
        "(Lcom/whoop/data/repositories/FeatureFlagChecker;)Ljb1/a;",
        "sage_release"
    }
    k = 0x2
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public static synthetic a(Llb1/z0;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Ln72/c;->h(Llb1/z0;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lcom/whoop/sage/domain/models/StudyInsightsModel;)Lm72/k;
    .locals 0

    invoke-static {p0}, Ln72/c;->i(Lcom/whoop/sage/domain/models/StudyInsightsModel;)Lm72/k;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Lcom/whoop/data/repositories/FeatureFlagChecker;Ljb1/b;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Ln72/c;->g(Lcom/whoop/data/repositories/FeatureFlagChecker;Ljb1/b;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Lcom/whoop/data/repositories/FeatureFlagChecker;Llb1/z0;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Ln72/c;->j(Lcom/whoop/data/repositories/FeatureFlagChecker;Llb1/z0;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic e(Lcom/whoop/data/repositories/FeatureFlagChecker;Lcom/whoop/sage/design/sagemeter/SageGaugeModel;)Lb72/e;
    .locals 0

    invoke-static {p0, p1}, Ln72/c;->k(Lcom/whoop/data/repositories/FeatureFlagChecker;Lcom/whoop/sage/design/sagemeter/SageGaugeModel;)Lb72/e;

    move-result-object p0

    return-object p0
.end method

.method public static final f(Lcom/whoop/data/repositories/FeatureFlagChecker;)Ljb1/a;
    .locals 2

    const-string v0, "featureFlagChecker"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Ln72/a;

    const/4 v1, 0x0

    invoke-direct {v0, v1, p0}, Ln72/a;-><init>(ILcom/whoop/data/repositories/FeatureFlagChecker;)V

    invoke-static {v0}, Ljb1/c;->d(Lkotlin/jvm/functions/Function1;)Ljb1/a;

    move-result-object p0

    return-object p0
.end method

.method private static final g(Lcom/whoop/data/repositories/FeatureFlagChecker;Ljb1/b;)Ll83/a0;
    .locals 2

    const-string v0, "$this$designItemReducer"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lmx1/o;

    const/16 v1, 0x1d

    invoke-direct {v0, v1}, Lmx1/o;-><init>(I)V

    invoke-virtual {p1, v0}, Ljb1/b;->b(Lkotlin/jvm/functions/Function1;)V

    new-instance v0, Ln72/a;

    const/4 v1, 0x1

    invoke-direct {v0, v1, p0}, Ln72/a;-><init>(ILcom/whoop/data/repositories/FeatureFlagChecker;)V

    invoke-virtual {p1, v0}, Ljb1/b;->b(Lkotlin/jvm/functions/Function1;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final h(Llb1/z0;)Ll83/a0;
    .locals 3

    const-string v0, "$this$addModelMapper"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Ln72/b;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Ln72/b;-><init>(I)V

    const-class v1, Lcom/whoop/sage/domain/models/StudyInsightsModel;

    sget-object v2, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v2, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    new-instance v2, Ln72/c$a;

    invoke-direct {v2, v0}, Ln72/c$a;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p0, v1, v2}, Llb1/z0;->a(Lj93/d;Lkotlin/jvm/functions/Function1;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final i(Lcom/whoop/sage/domain/models/StudyInsightsModel;)Lm72/k;
    .locals 25

    const-string v0, "model"

    move-object/from16 v1, p0

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v1}, Lcom/whoop/sage/domain/models/StudyInsightsModel;->getImageUrl()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1}, Lcom/whoop/sage/domain/models/StudyInsightsModel;->getCardTitle()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1}, Lcom/whoop/sage/domain/models/StudyInsightsModel;->getCardSubtitle()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v1}, Lcom/whoop/sage/domain/models/StudyInsightsModel;->getMetricList()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    new-instance v5, Ljava/util/ArrayList;

    const/16 v6, 0xa

    invoke-static {v0, v6}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v6

    invoke-direct {v5, v6}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    const/4 v7, 0x0

    if-eqz v6, :cond_3

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lcom/whoop/sage/domain/models/StudyInsightsMetricModel;

    invoke-virtual {v6}, Lcom/whoop/sage/domain/models/StudyInsightsMetricModel;->getIcon()Ljava/lang/String;

    move-result-object v8

    sget-object v9, Lgz0/m0;->RHR:Lgz0/m0;

    invoke-static {}, Lgz0/m0;->values()[Lgz0/m0;

    move-result-object v10

    array-length v11, v10

    const/4 v12, 0x0

    :goto_1
    if-ge v12, v11, :cond_1

    aget-object v13, v10, v12

    invoke-virtual {v13}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v14

    invoke-static {v14, v8}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v14

    if-eqz v14, :cond_0

    move-object v7, v13

    goto :goto_2

    :cond_0
    add-int/lit8 v12, v12, 0x1

    goto :goto_1

    :cond_1
    :goto_2
    if-nez v7, :cond_2

    goto :goto_3

    :cond_2
    move-object v9, v7

    :goto_3
    invoke-virtual {v6}, Lcom/whoop/sage/domain/models/StudyInsightsMetricModel;->getTitle()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v6}, Lcom/whoop/sage/domain/models/StudyInsightsMetricModel;->getStatDisplay()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v6}, Lcom/whoop/sage/domain/models/StudyInsightsMetricModel;->getStatUnitDisplay()Ljava/lang/String;

    move-result-object v6

    new-instance v10, Lm72/j;

    invoke-direct {v10, v9, v7, v8, v6}, Lm72/j;-><init>(Lgz0/m0;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    invoke-virtual {v5, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_3
    invoke-virtual {v1}, Lcom/whoop/sage/domain/models/StudyInsightsModel;->getSecondaryButton()Lcom/whoop/design/models/items/SecondaryButtonModel;

    move-result-object v0

    invoke-virtual {v0}, Lcom/whoop/design/models/items/SecondaryButtonModel;->getText()Lcom/whoop/design/util/TextResource;

    move-result-object v9

    invoke-virtual {v1}, Lcom/whoop/sage/domain/models/StudyInsightsModel;->getSecondaryButton()Lcom/whoop/design/models/items/SecondaryButtonModel;

    move-result-object v0

    invoke-virtual {v0}, Lcom/whoop/design/models/items/SecondaryButtonModel;->getAction()Lcom/whoop/navigation/e;

    move-result-object v10

    invoke-virtual {v1}, Lcom/whoop/sage/domain/models/StudyInsightsModel;->getSecondaryButton()Lcom/whoop/design/models/items/SecondaryButtonModel;

    move-result-object v0

    invoke-virtual {v0}, Lcom/whoop/design/models/items/SecondaryButtonModel;->getIcon()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_4

    invoke-static {v0}, Lgz0/n0;->a(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v0

    if-eqz v0, :cond_4

    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    move-result v0

    new-instance v1, Ly71/g;

    const/4 v6, 0x2

    invoke-direct {v1, v0, v7, v6, v7}, Ly71/g;-><init>(ILcom/whoop/design/util/TextResource;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object v12, v1

    goto :goto_4

    :cond_4
    move-object v12, v7

    :goto_4
    new-instance v6, Lny0/p0;

    const/4 v11, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x3ff4

    const/16 v24, 0x0

    move-object v8, v6

    invoke-direct/range {v8 .. v24}, Lny0/p0;-><init>(Lcom/whoop/design/util/TextResource;Lcom/whoop/navigation/e;Ly71/g;Ly71/g;Ly81/e;Lj91/b;ZLjava/lang/Object;Lcom/whoop/analytics/AnalyticEventModel;Lj02/s;Lk81/a;ZLny0/m0;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v1, Lm72/k;

    invoke-direct/range {v1 .. v6}, Lm72/k;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lny0/p0;)V

    return-object v1
.end method

.method private static final j(Lcom/whoop/data/repositories/FeatureFlagChecker;Llb1/z0;)Ll83/a0;
    .locals 2

    const-string v0, "$this$addModelMapper"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Ln72/a;

    const/4 v1, 0x2

    invoke-direct {v0, v1, p0}, Ln72/a;-><init>(ILcom/whoop/data/repositories/FeatureFlagChecker;)V

    const-class p0, Lcom/whoop/sage/design/sagemeter/SageGaugeModel;

    sget-object v1, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v1, p0}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object p0

    new-instance v1, Ln72/c$b;

    invoke-direct {v1, v0}, Ln72/c$b;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p1, p0, v1}, Llb1/z0;->a(Lj93/d;Lkotlin/jvm/functions/Function1;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final k(Lcom/whoop/data/repositories/FeatureFlagChecker;Lcom/whoop/sage/design/sagemeter/SageGaugeModel;)Lb72/e;
    .locals 1

    const-string v0, "model"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "sage-non-beta"

    invoke-interface {p0, v0}, Lcom/whoop/data/repositories/FeatureFlagChecker;->isFeatureEnabled(Ljava/lang/String;)Z

    move-result p0

    invoke-static {p1, p0}, Lb72/c;->a(Lcom/whoop/sage/design/sagemeter/SageGaugeModel;Z)Lb72/e;

    move-result-object p0

    return-object p0
.end method
