.class public abstract Lgt2/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u001a#\u0010\u0004\u001a\u00020\u00032\u0008\u0010\u0001\u001a\u0004\u0018\u00010\u00002\u0008\u0010\u0002\u001a\u0004\u0018\u00010\u0000H\u0002\u00a2\u0006\u0004\u0008\u0004\u0010\u0005\"\u001a\u0010\u000b\u001a\u00020\u00068\u0000X\u0080\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0007\u0010\u0008\u001a\u0004\u0008\t\u0010\n\u00a8\u0006\u000c"
    }
    d2 = {
        "Lcom/whoop/weeklyplan/hometile/domain/api/TextDisplayStyle;",
        "stepStyle",
        "percentStyle",
        "Lht2/j;",
        "d",
        "(Lcom/whoop/weeklyplan/hometile/domain/api/TextDisplayStyle;Lcom/whoop/weeklyplan/hometile/domain/api/TextDisplayStyle;)Lht2/j;",
        "Ljb1/a;",
        "a",
        "Ljb1/a;",
        "e",
        "()Ljb1/a;",
        "weeklyPlanHomeTileDesignItemReducer",
        "weekly-plan_release"
    }
    k = 0x2
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# static fields
.field private static final a:Ljb1/a;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lgm1/b;

    const/4 v1, 0x5

    invoke-direct {v0, v1}, Lgm1/b;-><init>(I)V

    invoke-static {v0}, Ljb1/c;->d(Lkotlin/jvm/functions/Function1;)Ljb1/a;

    move-result-object v0

    sput-object v0, Lgt2/a;->a:Ljb1/a;

    return-void
.end method

.method public static synthetic a(Lcom/whoop/weeklyplan/hometile/domain/api/WeeklyPlanHometile;)Lht2/a;
    .locals 0

    invoke-static {p0}, Lgt2/a;->h(Lcom/whoop/weeklyplan/hometile/domain/api/WeeklyPlanHometile;)Lht2/a;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Ljb1/b;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lgt2/a;->f(Ljb1/b;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Llb1/z0;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lgt2/a;->g(Llb1/z0;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method private static final d(Lcom/whoop/weeklyplan/hometile/domain/api/TextDisplayStyle;Lcom/whoop/weeklyplan/hometile/domain/api/TextDisplayStyle;)Lht2/j;
    .locals 1

    sget-object v0, Lcom/whoop/weeklyplan/hometile/domain/api/TextDisplayStyle;->WEEKLY_PLAN_IN_PROGRESS:Lcom/whoop/weeklyplan/hometile/domain/api/TextDisplayStyle;

    if-eq p0, v0, :cond_1

    if-ne p1, v0, :cond_0

    goto :goto_0

    :cond_0
    sget-object p0, Lht2/j;->COMPLETE:Lht2/j;

    return-object p0

    :cond_1
    :goto_0
    sget-object p0, Lht2/j;->IN_PROGRESS:Lht2/j;

    return-object p0
.end method

.method public static final e()Ljb1/a;
    .locals 1

    sget-object v0, Lgt2/a;->a:Ljb1/a;

    return-object v0
.end method

.method private static final f(Ljb1/b;)Ll83/a0;
    .locals 2

    const-string v0, "$this$designItemReducer"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lgm1/b;

    const/4 v1, 0x6

    invoke-direct {v0, v1}, Lgm1/b;-><init>(I)V

    invoke-virtual {p0, v0}, Ljb1/b;->b(Lkotlin/jvm/functions/Function1;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final g(Llb1/z0;)Ll83/a0;
    .locals 3

    const-string v0, "$this$addModelMapper"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lgm1/b;

    const/4 v1, 0x7

    invoke-direct {v0, v1}, Lgm1/b;-><init>(I)V

    const-class v1, Lcom/whoop/weeklyplan/hometile/domain/api/WeeklyPlanHometile;

    sget-object v2, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v2, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    new-instance v2, Lgt2/a$a;

    invoke-direct {v2, v0}, Lgt2/a$a;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p0, v1, v2}, Llb1/z0;->a(Lj93/d;Lkotlin/jvm/functions/Function1;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final h(Lcom/whoop/weeklyplan/hometile/domain/api/WeeklyPlanHometile;)Lht2/a;
    .locals 37

    const-string v0, "model"

    move-object/from16 v1, p0

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v2, Lht2/h;->LOADING:Lht2/h;

    invoke-virtual {v1}, Lcom/whoop/weeklyplan/hometile/domain/api/WeeklyPlanHometile;->getTitle()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v1}, Lcom/whoop/weeklyplan/hometile/domain/api/WeeklyPlanHometile;->getDaysLeftDisplay()Ljava/lang/String;

    move-result-object v5

    new-instance v6, Lht2/g;

    invoke-virtual {v1}, Lcom/whoop/weeklyplan/hometile/domain/api/WeeklyPlanHometile;->getProgressBar()Lcom/whoop/weeklyplan/hometile/domain/api/ProgressBreakdownBar;

    move-result-object v0

    invoke-virtual {v0}, Lcom/whoop/weeklyplan/hometile/domain/api/ProgressBreakdownBar;->getPercentString()Ljava/lang/String;

    move-result-object v0

    const-string v3, "%"

    invoke-static {v0, v3}, Lyb3/r;->s0(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1}, Lcom/whoop/weeklyplan/hometile/domain/api/WeeklyPlanHometile;->getProgressBar()Lcom/whoop/weeklyplan/hometile/domain/api/ProgressBreakdownBar;

    move-result-object v3

    invoke-virtual {v3}, Lcom/whoop/weeklyplan/hometile/domain/api/ProgressBreakdownBar;->getPercentSubtitle()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1}, Lcom/whoop/weeklyplan/hometile/domain/api/WeeklyPlanHometile;->getProgressBar()Lcom/whoop/weeklyplan/hometile/domain/api/ProgressBreakdownBar;

    move-result-object v7

    invoke-virtual {v7}, Lcom/whoop/weeklyplan/hometile/domain/api/ProgressBreakdownBar;->getPercentValue()I

    move-result v7

    invoke-direct {v6, v0, v3, v7}, Lht2/g;-><init>(Ljava/lang/String;Ljava/lang/String;I)V

    invoke-virtual {v1}, Lcom/whoop/weeklyplan/hometile/domain/api/WeeklyPlanHometile;->getItems()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    new-instance v7, Ljava/util/ArrayList;

    const/16 v3, 0xa

    invoke-static {v0, v3}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v3

    invoke-direct {v7, v3}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_8

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/whoop/weeklyplan/hometile/domain/api/PlanItem;

    invoke-virtual {v3}, Lcom/whoop/weeklyplan/hometile/domain/api/PlanItem;->getTitle()Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v3}, Lcom/whoop/weeklyplan/hometile/domain/api/PlanItem;->getCircularProgressIndicator()Lcom/whoop/weeklyplan/hometile/domain/api/CircularProgressIndicator;

    move-result-object v9

    invoke-virtual {v9}, Lcom/whoop/weeklyplan/hometile/domain/api/CircularProgressIndicator;->getCurrentProgressSteps()Lcom/whoop/weeklyplan/hometile/domain/api/ProgressSteps;

    move-result-object v9

    const/4 v11, 0x0

    const/4 v12, 0x1

    if-eqz v9, :cond_1

    new-instance v13, Lp01/b;

    invoke-virtual {v3}, Lcom/whoop/weeklyplan/hometile/domain/api/PlanItem;->getCircularProgressIndicator()Lcom/whoop/weeklyplan/hometile/domain/api/CircularProgressIndicator;

    move-result-object v9

    invoke-virtual {v9}, Lcom/whoop/weeklyplan/hometile/domain/api/CircularProgressIndicator;->getCurrentProgressSteps()Lcom/whoop/weeklyplan/hometile/domain/api/ProgressSteps;

    move-result-object v9

    invoke-virtual {v9}, Lcom/whoop/weeklyplan/hometile/domain/api/ProgressSteps;->getTotalSteps()I

    move-result v14

    invoke-virtual {v3}, Lcom/whoop/weeklyplan/hometile/domain/api/PlanItem;->getCircularProgressIndicator()Lcom/whoop/weeklyplan/hometile/domain/api/CircularProgressIndicator;

    move-result-object v9

    invoke-virtual {v9}, Lcom/whoop/weeklyplan/hometile/domain/api/CircularProgressIndicator;->getCurrentProgressSteps()Lcom/whoop/weeklyplan/hometile/domain/api/ProgressSteps;

    move-result-object v9

    invoke-virtual {v9}, Lcom/whoop/weeklyplan/hometile/domain/api/ProgressSteps;->getCurrentStep()I

    move-result v15

    invoke-virtual {v3}, Lcom/whoop/weeklyplan/hometile/domain/api/PlanItem;->getCircularProgressIndicator()Lcom/whoop/weeklyplan/hometile/domain/api/CircularProgressIndicator;

    move-result-object v9

    invoke-virtual {v9}, Lcom/whoop/weeklyplan/hometile/domain/api/CircularProgressIndicator;->getCurrentProgressSteps()Lcom/whoop/weeklyplan/hometile/domain/api/ProgressSteps;

    move-result-object v9

    invoke-virtual {v9}, Lcom/whoop/weeklyplan/hometile/domain/api/ProgressSteps;->getTextDisplay()Ljava/lang/String;

    move-result-object v17

    invoke-virtual {v3}, Lcom/whoop/weeklyplan/hometile/domain/api/PlanItem;->getCircularProgressIndicator()Lcom/whoop/weeklyplan/hometile/domain/api/CircularProgressIndicator;

    move-result-object v9

    invoke-virtual {v9}, Lcom/whoop/weeklyplan/hometile/domain/api/CircularProgressIndicator;->getCurrentProgressSteps()Lcom/whoop/weeklyplan/hometile/domain/api/ProgressSteps;

    move-result-object v9

    invoke-virtual {v9}, Lcom/whoop/weeklyplan/hometile/domain/api/ProgressSteps;->getStyle()Lcom/whoop/weeklyplan/hometile/domain/api/TextDisplayStyle;

    move-result-object v9

    sget-object v8, Lcom/whoop/weeklyplan/hometile/domain/api/TextDisplayStyle;->WEEKLY_PLAN_COMPLETE:Lcom/whoop/weeklyplan/hometile/domain/api/TextDisplayStyle;

    if-ne v9, v8, :cond_0

    move v11, v12

    :cond_0
    invoke-static {v11}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v20

    const v35, 0xfffb4

    const/16 v36, 0x0

    const/16 v16, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    const/16 v28, 0x0

    const/16 v29, 0x0

    const/16 v30, 0x0

    const-wide/16 v31, 0x0

    const/16 v33, 0x0

    const/16 v34, 0x0

    invoke-direct/range {v13 .. v36}, Lp01/b;-><init>(IIFLjava/lang/String;Lb91/a;Ly81/f;Ljava/lang/Boolean;Ly81/f;Ly81/f;Ly81/f;Li2/t;Li2/t;FFFZZJLp01/h;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    :goto_1
    move-object v11, v13

    goto/16 :goto_5

    :cond_1
    invoke-virtual {v3}, Lcom/whoop/weeklyplan/hometile/domain/api/PlanItem;->getCircularProgressIndicator()Lcom/whoop/weeklyplan/hometile/domain/api/CircularProgressIndicator;

    move-result-object v8

    invoke-virtual {v8}, Lcom/whoop/weeklyplan/hometile/domain/api/CircularProgressIndicator;->getCurrentProgressPercentage()Lcom/whoop/weeklyplan/hometile/domain/api/ProgressPercentage;

    move-result-object v8

    if-eqz v8, :cond_2

    invoke-virtual {v8}, Lcom/whoop/weeklyplan/hometile/domain/api/ProgressPercentage;->getTextDisplay()Ljava/lang/String;

    move-result-object v8

    move-object/from16 v17, v8

    goto :goto_2

    :cond_2
    const/16 v17, 0x0

    :goto_2
    invoke-virtual {v3}, Lcom/whoop/weeklyplan/hometile/domain/api/PlanItem;->getCircularProgressIndicator()Lcom/whoop/weeklyplan/hometile/domain/api/CircularProgressIndicator;

    move-result-object v8

    invoke-virtual {v8}, Lcom/whoop/weeklyplan/hometile/domain/api/CircularProgressIndicator;->getCurrentProgressPercentage()Lcom/whoop/weeklyplan/hometile/domain/api/ProgressPercentage;

    move-result-object v8

    if-eqz v8, :cond_3

    invoke-virtual {v8}, Lcom/whoop/weeklyplan/hometile/domain/api/ProgressPercentage;->getPercentage()D

    move-result-wide v8

    double-to-float v8, v8

    goto :goto_3

    :cond_3
    const/high16 v8, 0x42c80000    # 100.0f

    :goto_3
    const/16 v9, 0x64

    int-to-float v9, v9

    div-float v16, v8, v9

    invoke-virtual {v3}, Lcom/whoop/weeklyplan/hometile/domain/api/PlanItem;->getCircularProgressIndicator()Lcom/whoop/weeklyplan/hometile/domain/api/CircularProgressIndicator;

    move-result-object v8

    invoke-virtual {v8}, Lcom/whoop/weeklyplan/hometile/domain/api/CircularProgressIndicator;->getCurrentProgressPercentage()Lcom/whoop/weeklyplan/hometile/domain/api/ProgressPercentage;

    move-result-object v8

    if-eqz v8, :cond_4

    invoke-virtual {v8}, Lcom/whoop/weeklyplan/hometile/domain/api/ProgressPercentage;->getStyle()Lcom/whoop/weeklyplan/hometile/domain/api/TextDisplayStyle;

    move-result-object v8

    goto :goto_4

    :cond_4
    const/4 v8, 0x0

    :goto_4
    sget-object v9, Lcom/whoop/weeklyplan/hometile/domain/api/TextDisplayStyle;->WEEKLY_PLAN_COMPLETE:Lcom/whoop/weeklyplan/hometile/domain/api/TextDisplayStyle;

    if-ne v8, v9, :cond_5

    move v11, v12

    :cond_5
    sget-object v33, Lp01/h;->PERCENTAGE:Lp01/h;

    new-instance v13, Lp01/b;

    invoke-static {v11}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v20

    const v35, 0xbffb3

    const/16 v36, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    const/16 v28, 0x0

    const/16 v29, 0x0

    const/16 v30, 0x0

    const-wide/16 v31, 0x0

    const/16 v34, 0x0

    invoke-direct/range {v13 .. v36}, Lp01/b;-><init>(IIFLjava/lang/String;Lb91/a;Ly81/f;Ljava/lang/Boolean;Ly81/f;Ly81/f;Ly81/f;Li2/t;Li2/t;FFFZZJLp01/h;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    goto :goto_1

    :goto_5
    invoke-virtual {v3}, Lcom/whoop/weeklyplan/hometile/domain/api/PlanItem;->getCircularProgressIndicator()Lcom/whoop/weeklyplan/hometile/domain/api/CircularProgressIndicator;

    move-result-object v8

    invoke-virtual {v8}, Lcom/whoop/weeklyplan/hometile/domain/api/CircularProgressIndicator;->getCurrentProgressSteps()Lcom/whoop/weeklyplan/hometile/domain/api/ProgressSteps;

    move-result-object v8

    if-eqz v8, :cond_6

    invoke-virtual {v8}, Lcom/whoop/weeklyplan/hometile/domain/api/ProgressSteps;->getStyle()Lcom/whoop/weeklyplan/hometile/domain/api/TextDisplayStyle;

    move-result-object v8

    goto :goto_6

    :cond_6
    const/4 v8, 0x0

    :goto_6
    invoke-virtual {v3}, Lcom/whoop/weeklyplan/hometile/domain/api/PlanItem;->getCircularProgressIndicator()Lcom/whoop/weeklyplan/hometile/domain/api/CircularProgressIndicator;

    move-result-object v9

    invoke-virtual {v9}, Lcom/whoop/weeklyplan/hometile/domain/api/CircularProgressIndicator;->getCurrentProgressPercentage()Lcom/whoop/weeklyplan/hometile/domain/api/ProgressPercentage;

    move-result-object v9

    if-eqz v9, :cond_7

    invoke-virtual {v9}, Lcom/whoop/weeklyplan/hometile/domain/api/ProgressPercentage;->getStyle()Lcom/whoop/weeklyplan/hometile/domain/api/TextDisplayStyle;

    move-result-object v9

    goto :goto_7

    :cond_7
    const/4 v9, 0x0

    :goto_7
    invoke-static {v8, v9}, Lgt2/a;->d(Lcom/whoop/weeklyplan/hometile/domain/api/TextDisplayStyle;Lcom/whoop/weeklyplan/hometile/domain/api/TextDisplayStyle;)Lht2/j;

    move-result-object v12

    invoke-virtual {v3}, Lcom/whoop/weeklyplan/hometile/domain/api/PlanItem;->getDestination()Lcom/whoop/navigation/e;

    move-result-object v13

    invoke-virtual {v3}, Lcom/whoop/weeklyplan/hometile/domain/api/PlanItem;->getId()Ljava/lang/String;

    move-result-object v14

    new-instance v9, Lht2/i;

    invoke-direct/range {v9 .. v14}, Lht2/i;-><init>(Ljava/lang/String;Lp01/b;Lht2/j;Lcom/whoop/navigation/e;Ljava/lang/String;)V

    invoke-virtual {v7, v9}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto/16 :goto_0

    :cond_8
    invoke-virtual {v1}, Lcom/whoop/weeklyplan/hometile/domain/api/WeeklyPlanHometile;->getCardButton()Lcom/whoop/design/models/items/CardButtonModel;

    move-result-object v0

    if-eqz v0, :cond_a

    invoke-virtual {v1}, Lcom/whoop/weeklyplan/hometile/domain/api/WeeklyPlanHometile;->getCardButton()Lcom/whoop/design/models/items/CardButtonModel;

    move-result-object v3

    invoke-virtual {v3}, Lcom/whoop/design/models/items/CardButtonModel;->getTitle()Lcom/whoop/design/util/TextResource;

    move-result-object v9

    invoke-virtual {v0}, Lcom/whoop/design/models/items/CardButtonModel;->getId()Ljava/lang/String;

    move-result-object v24

    invoke-virtual {v1}, Lcom/whoop/weeklyplan/hometile/domain/api/WeeklyPlanHometile;->getCardButton()Lcom/whoop/design/models/items/CardButtonModel;

    move-result-object v0

    invoke-virtual {v0}, Lcom/whoop/design/models/items/CardButtonModel;->getDestination()Lcom/whoop/navigation/e;

    move-result-object v0

    if-nez v0, :cond_9

    new-instance v10, Lcom/whoop/navigation/e;

    const/4 v14, 0x7

    const/4 v15, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    invoke-direct/range {v10 .. v15}, Lcom/whoop/navigation/e;-><init>(Lcom/whoop/navigation/AppScreen;Lcom/whoop/navigation/NavigationScreenModel;Lj02/v0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object/from16 v16, v10

    goto :goto_8

    :cond_9
    move-object/from16 v16, v0

    :goto_8
    new-instance v8, Lny0/h;

    const v34, 0x1ff7f7e

    const/16 v35, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    const/16 v28, 0x0

    const/16 v29, 0x0

    const/16 v30, 0x0

    const/16 v31, 0x0

    const/16 v32, 0x0

    const/16 v33, 0x0

    invoke-direct/range {v8 .. v35}, Lny0/h;-><init>(Lcom/whoop/design/util/TextResource;Lgz0/m0;Li91/a;Ly81/f;Ljava/lang/String;Ljava/lang/String;Lny0/p;Lcom/whoop/navigation/e;Lcom/whoop/whoopaction/domain/models/Action;Lcom/whoop/analytics/AnalyticEventModel;Lny0/g;Lb91/c;Ly3/f;ZZLjava/lang/String;ZZLi91/a;Ljava/lang/Object;Lj02/s;Lny0/c;Lcom/whoop/navigation/models/GenericInteraction;Lj91/b;Li91/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    goto :goto_9

    :cond_a
    const/4 v8, 0x0

    :goto_9
    new-instance v1, Lht2/a;

    const/4 v3, 0x0

    invoke-direct/range {v1 .. v8}, Lht2/a;-><init>(Lht2/h;ZLjava/lang/String;Ljava/lang/String;Lht2/g;Ljava/util/List;Lny0/h;)V

    return-object v1
.end method
