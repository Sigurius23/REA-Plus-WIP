.class public abstract Llb1/x1;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0006\"\u001a\u0010\u0005\u001a\u00020\u00008\u0000X\u0080\u0004\u00a2\u0006\u000c\n\u0004\u0008\u0001\u0010\u0002\u001a\u0004\u0008\u0003\u0010\u0004\u00a8\u0006\u0006"
    }
    d2 = {
        "Llb1/y0;",
        "a",
        "Llb1/y0;",
        "c",
        "()Llb1/y0;",
        "goalTileMapper",
        "design-models_release"
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
.field private static final a:Llb1/y0;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Llb1/t1;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Llb1/t1;-><init>(I)V

    invoke-static {v0}, Llb1/a1;->a(Lkotlin/jvm/functions/Function1;)Llb1/y0;

    move-result-object v0

    sput-object v0, Llb1/x1;->a:Llb1/y0;

    return-void
.end method

.method public static synthetic a(Llb1/z0;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Llb1/x1;->d(Llb1/z0;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Llb1/z0;Lcom/whoop/design/models/items/GoalTileModel;)Lw11/c;
    .locals 0

    invoke-static {p0, p1}, Llb1/x1;->e(Llb1/z0;Lcom/whoop/design/models/items/GoalTileModel;)Lw11/c;

    move-result-object p0

    return-object p0
.end method

.method public static final c()Llb1/y0;
    .locals 1

    sget-object v0, Llb1/x1;->a:Llb1/y0;

    return-object v0
.end method

.method private static final d(Llb1/z0;)Ll83/a0;
    .locals 3

    const-string v0, "$this$designModelMapper"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Llb1/w1;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Llb1/w1;-><init>(Llb1/z0;I)V

    const-class v1, Lcom/whoop/design/models/items/GoalTileModel;

    sget-object v2, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v2, v1}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v1

    new-instance v2, Llb1/x1$c;

    invoke-direct {v2, v0}, Llb1/x1$c;-><init>(Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {p0, v1, v2}, Llb1/z0;->a(Lj93/d;Lkotlin/jvm/functions/Function1;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final e(Llb1/z0;Lcom/whoop/design/models/items/GoalTileModel;)Lw11/c;
    .locals 50

    const-string v0, "model"

    move-object/from16 v1, p1

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v1}, Lcom/whoop/design/models/items/GoalTileModel;->getCheckmarkStyle()Lcom/whoop/design/models/items/CheckmarkStyle;

    move-result-object v0

    sget-object v2, Lcom/whoop/design/models/items/CheckmarkStyle;->ENABLED:Lcom/whoop/design/models/items/CheckmarkStyle;

    if-ne v0, v2, :cond_0

    const/4 v6, 0x1

    goto :goto_0

    :cond_0
    const/4 v6, 0x0

    :goto_0
    invoke-virtual {v1}, Lcom/whoop/design/models/items/GoalTileModel;->getTitleDisplay()Lcom/whoop/design/util/TextResource;

    move-result-object v7

    invoke-virtual {v1}, Lcom/whoop/design/models/items/GoalTileModel;->getProgressDisplay()Lcom/whoop/design/util/TextResource;

    move-result-object v8

    invoke-virtual {v1}, Lcom/whoop/design/models/items/GoalTileModel;->getImageUrl()Lcom/whoop/design/util/TextResource;

    move-result-object v10

    if-eqz v10, :cond_1

    new-instance v9, Lkd1/o$c;

    const/16 v14, 0xe

    const/4 v15, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    invoke-direct/range {v9 .. v15}, Lkd1/o$c;-><init>(Ljava/lang/Object;IIIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object v10, v9

    goto :goto_1

    :cond_1
    const/4 v10, 0x0

    :goto_1
    invoke-virtual {v1}, Lcom/whoop/design/models/items/GoalTileModel;->getDays()Ljava/util/List;

    move-result-object v2

    check-cast v2, Ljava/lang/Iterable;

    new-instance v11, Ljava/util/ArrayList;

    const/16 v5, 0xa

    invoke-static {v2, v5}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v9

    invoke-direct {v11, v9}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    const/4 v9, 0x0

    :goto_2
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v12

    if-eqz v12, :cond_7

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v12

    add-int/lit8 v13, v9, 0x1

    if-ltz v9, :cond_6

    check-cast v12, Lcom/whoop/design/models/items/GoalTrackerIndicatorModel;

    invoke-static {v9}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v12}, Lcom/whoop/design/models/items/GoalTrackerIndicatorModel;->getTitleDisplay()Lcom/whoop/design/util/TextResource;

    move-result-object v14

    invoke-virtual {v12}, Lcom/whoop/design/models/items/GoalTrackerIndicatorModel;->getStyle()Lcom/whoop/design/models/items/IndicatorStyle;

    move-result-object v15

    invoke-virtual {v15}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v15

    sget-object v16, Lhy0/z;->NO_DATA:Lhy0/z;

    const/16 p0, 0x0

    invoke-static {}, Lhy0/z;->values()[Lhy0/z;

    move-result-object v0

    array-length v3, v0

    const/4 v4, 0x0

    :goto_3
    if-ge v4, v3, :cond_3

    aget-object v18, v0, v4

    invoke-virtual/range {v18 .. v18}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v5

    invoke-static {v5, v15}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_2

    goto :goto_4

    :cond_2
    add-int/lit8 v4, v4, 0x1

    const/16 v5, 0xa

    goto :goto_3

    :cond_3
    move-object/from16 v18, p0

    :goto_4
    if-nez v18, :cond_4

    move-object/from16 v0, v16

    goto :goto_5

    :cond_4
    move-object/from16 v0, v18

    :goto_5
    invoke-virtual {v12}, Lcom/whoop/design/models/items/GoalTrackerIndicatorModel;->getDestination()Lcom/whoop/navigation/e;

    move-result-object v3

    if-nez v3, :cond_5

    new-instance v20, Lcom/whoop/navigation/e;

    const/16 v24, 0x7

    const/16 v25, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    invoke-direct/range {v20 .. v25}, Lcom/whoop/navigation/e;-><init>(Lcom/whoop/navigation/AppScreen;Lcom/whoop/navigation/NavigationScreenModel;Lj02/v0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object/from16 v3, v20

    :cond_5
    new-instance v4, Lhy0/u;

    invoke-direct {v4, v9, v14, v0, v3}, Lhy0/u;-><init>(Ljava/lang/String;Lcom/whoop/design/util/TextResource;Lhy0/z;Lcom/whoop/navigation/e;)V

    invoke-interface {v11, v4}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    move v9, v13

    const/16 v5, 0xa

    goto :goto_2

    :cond_6
    const/16 p0, 0x0

    invoke-static {}, Lwb3/f;->d0()V

    throw p0

    :cond_7
    const/16 p0, 0x0

    invoke-virtual {v1}, Lcom/whoop/design/models/items/GoalTileModel;->getGoalDays()I

    move-result v0

    invoke-virtual {v1}, Lcom/whoop/design/models/items/GoalTileModel;->getDestination()Lcom/whoop/navigation/e;

    move-result-object v12

    invoke-virtual {v1}, Lcom/whoop/design/models/items/GoalTileModel;->getBottomInfoSheet()Lcom/whoop/design/models/items/BottomSheetInfoModel;

    move-result-object v2

    if-eqz v2, :cond_9

    invoke-virtual {v2}, Lcom/whoop/design/models/items/BottomSheetInfoModel;->getBottomSheetTitle()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v21

    invoke-virtual {v2}, Lcom/whoop/design/models/items/BottomSheetInfoModel;->getImpactTitle()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v22

    invoke-virtual {v2}, Lcom/whoop/design/models/items/BottomSheetInfoModel;->getDescription()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v23

    invoke-virtual {v2}, Lcom/whoop/design/models/items/BottomSheetInfoModel;->getMetricsTagTitle()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v24

    invoke-virtual {v2}, Lcom/whoop/design/models/items/BottomSheetInfoModel;->getMetricTags()Ljava/util/List;

    move-result-object v2

    check-cast v2, Ljava/lang/Iterable;

    new-instance v3, Ljava/util/ArrayList;

    const/16 v4, 0xa

    invoke-static {v2, v4}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v4

    invoke-direct {v3, v4}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_6
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_8

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    new-instance v25, Lhy0/h1;

    invoke-static {v4}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v26

    sget-object v4, Llb1/x1$a;->w:Llb1/x1$a;

    invoke-static {v4}, Ly81/g;->a(Lkotlin/jvm/functions/Function1;)Ly81/e;

    move-result-object v28

    sget-object v4, Llb1/x1$b;->w:Llb1/x1$b;

    invoke-static {v4}, Ly81/g;->a(Lkotlin/jvm/functions/Function1;)Ly81/e;

    move-result-object v30

    const v48, 0x3fffea

    const/16 v49, 0x0

    const/16 v27, 0x0

    const/16 v29, 0x0

    const/16 v31, 0x0

    const/16 v32, 0x0

    const/16 v33, 0x0

    const/16 v34, 0x0

    const/16 v35, 0x0

    const/16 v36, 0x0

    const/16 v37, 0x0

    const/16 v38, 0x0

    const/16 v39, 0x0

    const/16 v40, 0x0

    const/16 v41, 0x0

    const/16 v42, 0x0

    const/16 v43, 0x0

    const/16 v44, 0x0

    const/16 v45, 0x0

    const/16 v46, 0x0

    const/16 v47, 0x0

    invoke-direct/range {v25 .. v49}, Lhy0/h1;-><init>(Lcom/whoop/design/util/TextResource;Ly71/g;Ly81/e;Li91/d;Ly81/e;Li2/t;Li2/t;Lhy0/o1;ZLi2/a1;FFFLy71/g;FLy81/e;Lcom/whoop/navigation/e;Lcom/whoop/whoopaction/domain/models/Action;Lhy0/c1;Lkd1/o;Ljava/util/List;Lcom/whoop/navigation/models/GenericInteraction;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object/from16 v4, v25

    invoke-interface {v3, v4}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_6

    :cond_8
    new-instance v20, Lf41/a;

    move-object/from16 v25, v3

    invoke-direct/range {v20 .. v25}, Lf41/a;-><init>(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/util/List;)V

    move-object/from16 v13, v20

    goto :goto_7

    :cond_9
    move-object/from16 v13, p0

    :goto_7
    invoke-virtual {v1}, Lcom/whoop/design/models/items/GoalTileModel;->getCircularProgressIndicator()Lcom/whoop/data/remote/domain/response/journal/CircularProgressIndicator;

    move-result-object v2

    if-eqz v2, :cond_e

    invoke-virtual {v2}, Lcom/whoop/data/remote/domain/response/journal/CircularProgressIndicator;->getCurrentProgressSteps()Lcom/whoop/data/remote/domain/response/journal/CurrentProgressSteps;

    move-result-object v3

    if-eqz v3, :cond_b

    invoke-virtual {v3}, Lcom/whoop/data/remote/domain/response/journal/CurrentProgressSteps;->getCurrentStep()I

    move-result v20

    invoke-virtual {v3}, Lcom/whoop/data/remote/domain/response/journal/CurrentProgressSteps;->getTotalSteps()I

    move-result v19

    invoke-virtual {v3}, Lcom/whoop/data/remote/domain/response/journal/CurrentProgressSteps;->getTextDisplay()Ljava/lang/String;

    move-result-object v22

    invoke-virtual {v3}, Lcom/whoop/data/remote/domain/response/journal/CurrentProgressSteps;->getStyle()Lcom/whoop/data/remote/domain/dto/CircularProgressStyle;

    move-result-object v2

    sget-object v3, Lcom/whoop/data/remote/domain/dto/CircularProgressStyle;->WEEKLY_PLAN_COMPLETE:Lcom/whoop/data/remote/domain/dto/CircularProgressStyle;

    if-ne v2, v3, :cond_a

    const/4 v3, 0x1

    goto :goto_8

    :cond_a
    const/4 v3, 0x0

    :goto_8
    sget-object v38, Lp01/h;->STEPS:Lp01/h;

    new-instance v18, Lp01/b;

    invoke-static {v3}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v25

    const v40, 0xbffb4

    const/16 v41, 0x0

    const/16 v21, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    const/16 v28, 0x0

    const/16 v29, 0x0

    const/16 v30, 0x0

    const/16 v31, 0x0

    const/16 v32, 0x0

    const/16 v33, 0x0

    const/16 v34, 0x0

    const/16 v35, 0x0

    const-wide/16 v36, 0x0

    const/16 v39, 0x0

    invoke-direct/range {v18 .. v41}, Lp01/b;-><init>(IIFLjava/lang/String;Lb91/a;Ly81/f;Ljava/lang/Boolean;Ly81/f;Ly81/f;Ly81/f;Li2/t;Li2/t;FFFZZJLp01/h;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    goto :goto_a

    :cond_b
    invoke-virtual {v2}, Lcom/whoop/data/remote/domain/response/journal/CircularProgressIndicator;->getCurrentProgressPercentage()Lcom/whoop/data/remote/domain/response/journal/CurrentProgressPercentage;

    move-result-object v2

    if-eqz v2, :cond_d

    new-instance v18, Lp01/b;

    invoke-virtual {v2}, Lcom/whoop/data/remote/domain/response/journal/CurrentProgressPercentage;->getPercentage()D

    move-result-wide v3

    double-to-float v3, v3

    invoke-virtual {v2}, Lcom/whoop/data/remote/domain/response/journal/CurrentProgressPercentage;->getTextDisplay()Ljava/lang/String;

    move-result-object v22

    invoke-virtual {v2}, Lcom/whoop/data/remote/domain/response/journal/CurrentProgressPercentage;->getStyle()Lcom/whoop/data/remote/domain/dto/CircularProgressStyle;

    move-result-object v2

    sget-object v4, Lcom/whoop/data/remote/domain/dto/CircularProgressStyle;->WEEKLY_PLAN_COMPLETE:Lcom/whoop/data/remote/domain/dto/CircularProgressStyle;

    if-ne v2, v4, :cond_c

    const/16 v17, 0x1

    goto :goto_9

    :cond_c
    const/16 v17, 0x0

    :goto_9
    invoke-static/range {v17 .. v17}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v25

    sget-object v38, Lp01/h;->PERCENTAGE:Lp01/h;

    const v40, 0xbffb3

    const/16 v41, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    const/16 v28, 0x0

    const/16 v29, 0x0

    const/16 v30, 0x0

    const/16 v31, 0x0

    const/16 v32, 0x0

    const/16 v33, 0x0

    const/16 v34, 0x0

    const/16 v35, 0x0

    const-wide/16 v36, 0x0

    const/16 v39, 0x0

    move/from16 v21, v3

    invoke-direct/range {v18 .. v41}, Lp01/b;-><init>(IIFLjava/lang/String;Lb91/a;Ly81/f;Ljava/lang/Boolean;Ly81/f;Ly81/f;Ly81/f;Li2/t;Li2/t;FFFZZJLp01/h;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    goto :goto_a

    :cond_d
    move-object/from16 v18, p0

    :goto_a
    move-object/from16 v14, v18

    goto :goto_b

    :cond_e
    move-object/from16 v14, p0

    :goto_b
    invoke-virtual {v1}, Lcom/whoop/design/models/items/GoalTileModel;->getId()Ljava/lang/String;

    move-result-object v15

    new-instance v5, Lw11/c;

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    invoke-direct/range {v5 .. v15}, Lw11/c;-><init>(ZLcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/lang/Integer;Lkd1/o;Ljava/util/List;Lcom/whoop/navigation/e;Lf41/a;Lp01/b;Ljava/lang/String;)V

    return-object v5
.end method
