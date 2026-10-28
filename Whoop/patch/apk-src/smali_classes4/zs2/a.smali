.class public final Lzs2/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0008\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J7\u0010\u0013\u001a\u00020\u00122\u0006\u0010\t\u001a\u00020\u00082\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u000c2\u0006\u0010\u000f\u001a\u00020\u000e2\u0008\u0008\u0002\u0010\u0011\u001a\u00020\u0010\u00a2\u0006\u0004\u0008\u0013\u0010\u0014R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0015\u0010\u0016R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0013\u0010\u0017R\u0017\u0010\u001d\u001a\u00020\u00188\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0019\u0010\u001a\u001a\u0004\u0008\u001b\u0010\u001c\u00a8\u0006\u001e"
    }
    d2 = {
        "Lzs2/a;",
        "",
        "Ltw0/a;",
        "bottomSheetReducer",
        "Lcom/whoop/data/repositories/FeatureFlagChecker;",
        "featureFlagChecker",
        "<init>",
        "(Ltw0/a;Lcom/whoop/data/repositories/FeatureFlagChecker;)V",
        "Ljava/util/UUID;",
        "planId",
        "Lcom/whoop/weeklyplan/customizeplan/domain/api/WeeklyPlanCustomizationScreenModel;",
        "model",
        "Lsw0/g;",
        "bottomSheet",
        "Lws2/g;",
        "progress",
        "",
        "showLoading",
        "Lys2/e;",
        "b",
        "(Ljava/util/UUID;Lcom/whoop/weeklyplan/customizeplan/domain/api/WeeklyPlanCustomizationScreenModel;Lsw0/g;Lws2/g;Z)Lys2/e;",
        "a",
        "Ltw0/a;",
        "Lcom/whoop/data/repositories/FeatureFlagChecker;",
        "Ljb1/a;",
        "c",
        "Ljb1/a;",
        "getReducer",
        "()Ljb1/a;",
        "reducer",
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
.field private final a:Ltw0/a;

.field private final b:Lcom/whoop/data/repositories/FeatureFlagChecker;

.field private final c:Ljb1/a;


# direct methods
.method public constructor <init>(Ltw0/a;Lcom/whoop/data/repositories/FeatureFlagChecker;)V
    .locals 1

    const-string v0, "bottomSheetReducer"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "featureFlagChecker"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lzs2/a;->a:Ltw0/a;

    iput-object p2, p0, Lzs2/a;->b:Lcom/whoop/data/repositories/FeatureFlagChecker;

    new-instance p1, Lzm1/d;

    const/16 p2, 0xb

    invoke-direct {p1, p2}, Lzm1/d;-><init>(I)V

    invoke-static {p1}, Ljb1/c;->d(Lkotlin/jvm/functions/Function1;)Ljb1/a;

    move-result-object p1

    iput-object p1, p0, Lzs2/a;->c:Ljb1/a;

    return-void
.end method

.method public static synthetic a(Ljb1/b;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lzs2/a;->c(Ljb1/b;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method private static final c(Ljb1/b;)Ll83/a0;
    .locals 1

    const-string v0, "$this$designItemReducer"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method


# virtual methods
.method public final b(Ljava/util/UUID;Lcom/whoop/weeklyplan/customizeplan/domain/api/WeeklyPlanCustomizationScreenModel;Lsw0/g;Lws2/g;Z)Lys2/e;
    .locals 45

    move-object/from16 v0, p0

    move-object/from16 v1, p3

    const-string v2, "planId"

    move-object/from16 v3, p1

    invoke-static {v3, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "model"

    move-object/from16 v4, p2

    invoke-static {v4, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "bottomSheet"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "progress"

    move-object/from16 v15, p4

    invoke-static {v15, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v2, v0, Lzs2/a;->a:Ltw0/a;

    invoke-virtual {v2, v1}, Ltw0/a;->b(Lsw0/g;)Ljava/util/List;

    move-result-object v2

    iget-object v5, v0, Lzs2/a;->b:Lcom/whoop/data/repositories/FeatureFlagChecker;

    const-string v6, "healthspan-coaching-bottom-sheet-swipe"

    invoke-interface {v5, v6}, Lcom/whoop/data/repositories/FeatureFlagChecker;->isFeatureEnabled(Ljava/lang/String;)Z

    move-result v5

    sget-object v6, Lm83/y;->w:Lm83/y;

    if-eqz v5, :cond_0

    iget-object v5, v0, Lzs2/a;->a:Ltw0/a;

    invoke-virtual {v5, v1}, Ltw0/a;->c(Lsw0/g;)Ljava/util/List;

    move-result-object v5

    goto :goto_0

    :cond_0
    move-object v5, v6

    :goto_0
    invoke-virtual {v4}, Lcom/whoop/weeklyplan/customizeplan/domain/api/WeeklyPlanCustomizationScreenModel;->getToggles()Lcom/whoop/weeklyplan/customizeplan/domain/api/ToggleContent;

    move-result-object v7

    if-eqz v7, :cond_2

    invoke-virtual {v7}, Lcom/whoop/weeklyplan/customizeplan/domain/api/ToggleContent;->getInitialToggles()Ljava/util/List;

    move-result-object v9

    check-cast v9, Ljava/util/Collection;

    invoke-virtual {v7}, Lcom/whoop/weeklyplan/customizeplan/domain/api/ToggleContent;->getTopInitialToggles()Ljava/util/List;

    move-result-object v7

    if-eqz v7, :cond_1

    check-cast v7, Ljava/lang/Iterable;

    goto :goto_1

    :cond_1
    move-object v7, v6

    :goto_1
    invoke-static {v9, v7}, Lm83/s;->g1(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/ArrayList;

    move-result-object v7

    goto :goto_2

    :cond_2
    const/4 v7, 0x0

    :goto_2
    invoke-virtual {v3}, Ljava/util/UUID;->toString()Ljava/lang/String;

    move-result-object v3

    const-string v9, "toString(...)"

    invoke-static {v3, v9}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v9, v5

    sget-object v5, Lcom/whoop/weeklyplan/customizeplan/domain/api/TargetGoalType;->ACTIVITIES:Lcom/whoop/weeklyplan/customizeplan/domain/api/TargetGoalType;

    move-object v10, v6

    new-instance v6, Lys2/f;

    invoke-virtual {v4}, Lcom/whoop/weeklyplan/customizeplan/domain/api/WeeklyPlanCustomizationScreenModel;->getNavigationTitleDisplay()Ljava/lang/String;

    move-result-object v11

    invoke-static {v11}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v11

    invoke-virtual {v4}, Lcom/whoop/weeklyplan/customizeplan/domain/api/WeeklyPlanCustomizationScreenModel;->getNavigationSubtitleDisplay()Ljava/lang/String;

    move-result-object v12

    invoke-static {v12}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v12

    invoke-virtual {v4}, Lcom/whoop/weeklyplan/customizeplan/domain/api/WeeklyPlanCustomizationScreenModel;->getTitle()Ljava/lang/String;

    move-result-object v13

    invoke-static {v13}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v13

    invoke-virtual {v4}, Lcom/whoop/weeklyplan/customizeplan/domain/api/WeeklyPlanCustomizationScreenModel;->getDescription()Ljava/lang/String;

    move-result-object v14

    invoke-static {v14}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v14

    invoke-direct {v6, v11, v12, v13, v14}, Lys2/f;-><init>(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;)V

    invoke-virtual {v4}, Lcom/whoop/weeklyplan/customizeplan/domain/api/WeeklyPlanCustomizationScreenModel;->getToggles()Lcom/whoop/weeklyplan/customizeplan/domain/api/ToggleContent;

    move-result-object v11

    if-eqz v11, :cond_3

    invoke-virtual {v11}, Lcom/whoop/weeklyplan/customizeplan/domain/api/ToggleContent;->getTopHeadingDisplay()Ljava/lang/String;

    move-result-object v11

    goto :goto_3

    :cond_3
    const/4 v11, 0x0

    :goto_3
    invoke-static {v11}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v11

    iget-object v12, v0, Lzs2/a;->c:Ljb1/a;

    invoke-virtual {v4}, Lcom/whoop/weeklyplan/customizeplan/domain/api/WeeklyPlanCustomizationScreenModel;->getToggles()Lcom/whoop/weeklyplan/customizeplan/domain/api/ToggleContent;

    move-result-object v13

    if-eqz v13, :cond_4

    invoke-virtual {v13}, Lcom/whoop/weeklyplan/customizeplan/domain/api/ToggleContent;->getTopInitialToggles()Ljava/util/List;

    move-result-object v13

    if-nez v13, :cond_5

    :cond_4
    move-object v13, v10

    :cond_5
    invoke-virtual {v12, v13}, Ljb1/a;->g(Ljava/util/List;)Ljava/util/List;

    move-result-object v12

    invoke-virtual {v4}, Lcom/whoop/weeklyplan/customizeplan/domain/api/WeeklyPlanCustomizationScreenModel;->getToggles()Lcom/whoop/weeklyplan/customizeplan/domain/api/ToggleContent;

    move-result-object v13

    if-eqz v13, :cond_6

    invoke-virtual {v13}, Lcom/whoop/weeklyplan/customizeplan/domain/api/ToggleContent;->getHeadingDisplay()Ljava/lang/String;

    move-result-object v13

    goto :goto_4

    :cond_6
    const/4 v13, 0x0

    :goto_4
    invoke-static {v13}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v13

    iget-object v14, v0, Lzs2/a;->c:Ljb1/a;

    invoke-virtual {v4}, Lcom/whoop/weeklyplan/customizeplan/domain/api/WeeklyPlanCustomizationScreenModel;->getToggles()Lcom/whoop/weeklyplan/customizeplan/domain/api/ToggleContent;

    move-result-object v16

    if-eqz v16, :cond_8

    invoke-virtual/range {v16 .. v16}, Lcom/whoop/weeklyplan/customizeplan/domain/api/ToggleContent;->getInitialToggles()Ljava/util/List;

    move-result-object v16

    if-nez v16, :cond_7

    goto :goto_5

    :cond_7
    move-object/from16 v8, v16

    goto :goto_6

    :cond_8
    :goto_5
    move-object v8, v10

    :goto_6
    invoke-virtual {v14, v8}, Ljb1/a;->g(Ljava/util/List;)Ljava/util/List;

    move-result-object v8

    invoke-virtual {v4}, Lcom/whoop/weeklyplan/customizeplan/domain/api/WeeklyPlanCustomizationScreenModel;->getToggles()Lcom/whoop/weeklyplan/customizeplan/domain/api/ToggleContent;

    move-result-object v14

    if-eqz v14, :cond_9

    invoke-virtual {v14}, Lcom/whoop/weeklyplan/customizeplan/domain/api/ToggleContent;->getBottomButton()Lcom/whoop/weeklyplan/customizeplan/domain/api/BottomButton;

    move-result-object v14

    if-eqz v14, :cond_9

    invoke-virtual {v14}, Lcom/whoop/weeklyplan/customizeplan/domain/api/BottomButton;->getTitleDisplay()Ljava/lang/String;

    move-result-object v14

    goto :goto_7

    :cond_9
    const/4 v14, 0x0

    :goto_7
    invoke-static {v14}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v18

    invoke-virtual {v4}, Lcom/whoop/weeklyplan/customizeplan/domain/api/WeeklyPlanCustomizationScreenModel;->getToggles()Lcom/whoop/weeklyplan/customizeplan/domain/api/ToggleContent;

    move-result-object v14

    if-eqz v14, :cond_d

    invoke-virtual {v14}, Lcom/whoop/weeklyplan/customizeplan/domain/api/ToggleContent;->getBottomButton()Lcom/whoop/weeklyplan/customizeplan/domain/api/BottomButton;

    move-result-object v14

    if-eqz v14, :cond_d

    invoke-virtual {v14}, Lcom/whoop/weeklyplan/customizeplan/domain/api/BottomButton;->getIcon()Ljava/lang/String;

    move-result-object v14

    if-eqz v14, :cond_d

    sget-object v17, Lgz0/m0;->SETTINGS:Lgz0/m0;

    invoke-static {}, Lgz0/m0;->values()[Lgz0/m0;

    move-result-object v0

    array-length v1, v0

    move-object/from16 v19, v0

    const/4 v0, 0x0

    :goto_8
    if-ge v0, v1, :cond_b

    aget-object v20, v19, v0

    move/from16 v21, v0

    invoke-virtual/range {v20 .. v20}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, v14}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_a

    goto :goto_9

    :cond_a
    add-int/lit8 v0, v21, 0x1

    goto :goto_8

    :cond_b
    const/16 v20, 0x0

    :goto_9
    if-nez v20, :cond_c

    goto :goto_a

    :cond_c
    move-object/from16 v17, v20

    :goto_a
    invoke-virtual/range {v17 .. v17}, Lgz0/m0;->toWhoopIcon()I

    move-result v0

    :goto_b
    move/from16 v21, v0

    goto :goto_c

    :cond_d
    sget-object v0, Lgz0/m0;->SETTINGS:Lgz0/m0;

    invoke-virtual {v0}, Lgz0/m0;->toWhoopIcon()I

    move-result v0

    goto :goto_b

    :goto_c
    invoke-virtual {v4}, Lcom/whoop/weeklyplan/customizeplan/domain/api/WeeklyPlanCustomizationScreenModel;->getToggles()Lcom/whoop/weeklyplan/customizeplan/domain/api/ToggleContent;

    move-result-object v0

    if-eqz v0, :cond_f

    invoke-virtual {v0}, Lcom/whoop/weeklyplan/customizeplan/domain/api/ToggleContent;->getBottomButton()Lcom/whoop/weeklyplan/customizeplan/domain/api/BottomButton;

    move-result-object v0

    if-eqz v0, :cond_f

    invoke-virtual {v0}, Lcom/whoop/weeklyplan/customizeplan/domain/api/BottomButton;->getAction()Lcom/whoop/navigation/e;

    move-result-object v0

    if-nez v0, :cond_e

    goto :goto_d

    :cond_e
    move-object/from16 v19, v0

    goto :goto_e

    :cond_f
    :goto_d
    new-instance v22, Lcom/whoop/navigation/e;

    const/16 v26, 0x7

    const/16 v27, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    invoke-direct/range {v22 .. v27}, Lcom/whoop/navigation/e;-><init>(Lcom/whoop/navigation/AppScreen;Lcom/whoop/navigation/NavigationScreenModel;Lj02/v0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object/from16 v19, v22

    :goto_e
    new-instance v17, Lys2/a;

    const/16 v22, 0x4

    const/16 v23, 0x0

    const/16 v20, 0x0

    invoke-direct/range {v17 .. v23}, Lys2/a;-><init>(Lcom/whoop/design/util/TextResource;Lcom/whoop/navigation/e;ZIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {v4}, Lcom/whoop/weeklyplan/customizeplan/domain/api/WeeklyPlanCustomizationScreenModel;->getContinueButtonDisplay()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v0

    invoke-virtual {v4}, Lcom/whoop/weeklyplan/customizeplan/domain/api/WeeklyPlanCustomizationScreenModel;->getSkipButtonDisplay()Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_10

    invoke-static {v1}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v1

    :goto_f
    move-object v14, v7

    move-object v7, v12

    goto :goto_10

    :cond_10
    const/4 v1, 0x0

    goto :goto_f

    :goto_10
    new-instance v12, Lys2/b;

    move-object/from16 v18, v2

    const/4 v2, 0x1

    move-object/from16 v19, v3

    move/from16 v3, p5

    invoke-direct {v12, v0, v2, v1, v3}, Lys2/b;-><init>(Lcom/whoop/design/util/TextResource;ZLcom/whoop/design/util/TextResource;Z)V

    const/16 v0, 0xa

    if-eqz v14, :cond_17

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v14}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_11
    :goto_11
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_12

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    move-object v10, v3

    check-cast v10, Lcom/whoop/design/models/items/GoalSettingsTileModel;

    invoke-virtual {v10}, Lcom/whoop/design/models/items/GoalSettingsTileModel;->getSelectedValue()Ljava/lang/Integer;

    move-result-object v10

    if-eqz v10, :cond_11

    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_11

    :cond_12
    new-instance v2, Ljava/util/ArrayList;

    invoke-static {v1, v0}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v3

    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(I)V

    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_12
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_16

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/whoop/design/models/items/GoalSettingsTileModel;

    if-eqz v3, :cond_13

    goto :goto_13

    :cond_13
    const/4 v3, 0x0

    :goto_13
    if-eqz v3, :cond_15

    new-instance v10, Lcom/whoop/weeklyplan/customizeplan/domain/api/ActivityTarget;

    invoke-virtual {v3}, Lcom/whoop/design/models/items/GoalSettingsTileModel;->getId()Ljava/lang/String;

    move-result-object v14

    invoke-virtual {v3}, Lcom/whoop/design/models/items/GoalSettingsTileModel;->getSelectedValue()Ljava/lang/Integer;

    move-result-object v3

    if-eqz v3, :cond_14

    invoke-virtual {v3}, Ljava/lang/Integer;->intValue()I

    move-result v3

    goto :goto_14

    :cond_14
    const/4 v3, 0x0

    :goto_14
    invoke-direct {v10, v14, v3}, Lcom/whoop/weeklyplan/customizeplan/domain/api/ActivityTarget;-><init>(Ljava/lang/String;I)V

    const/4 v14, 0x0

    goto :goto_15

    :cond_15
    new-instance v10, Lcom/whoop/weeklyplan/customizeplan/domain/api/ActivityTarget;

    const-string v3, ""

    const/4 v14, 0x0

    invoke-direct {v10, v3, v14}, Lcom/whoop/weeklyplan/customizeplan/domain/api/ActivityTarget;-><init>(Ljava/lang/String;I)V

    :goto_15
    invoke-virtual {v2, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_12

    :cond_16
    move-object v10, v2

    :cond_17
    invoke-virtual/range {p3 .. p3}, Lsw0/g;->n()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v21

    invoke-virtual/range {p3 .. p3}, Lsw0/g;->l()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v22

    invoke-virtual/range {p3 .. p3}, Lsw0/g;->m()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v23

    invoke-virtual/range {p3 .. p3}, Lsw0/g;->d()Ljava/util/List;

    move-result-object v1

    check-cast v1, Ljava/lang/Iterable;

    new-instance v2, Ljava/util/ArrayList;

    invoke-static {v1, v0}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v3

    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_16
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_18

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/String;

    invoke-static {v3}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v3

    invoke-virtual {v2, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_16

    :cond_18
    invoke-virtual/range {p3 .. p3}, Lsw0/g;->f()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v25

    invoke-static {v4}, Lot2/d;->a(Lcom/whoop/weeklyplan/customizeplan/domain/api/WeeklyPlanCustomizationScreenModel;)Ly81/e;

    move-result-object v29

    move-object/from16 v1, v18

    check-cast v1, Ljava/lang/Iterable;

    new-instance v3, Ljava/util/ArrayList;

    invoke-static {v1, v0}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v14

    invoke-direct {v3, v14}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_17
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v14

    if-eqz v14, :cond_1b

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v14

    check-cast v14, Lsw0/i;

    invoke-virtual {v14}, Lsw0/i;->e()Lcom/whoop/design/util/TextResource;

    move-result-object v31

    invoke-virtual {v14}, Lsw0/i;->f()Ljava/util/List;

    move-result-object v14

    check-cast v14, Ljava/lang/Iterable;

    move-object/from16 p1, v1

    new-instance v1, Ljava/util/ArrayList;

    move-object/from16 v24, v2

    invoke-static {v14, v0}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v2

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v14}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_18
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v14

    if-eqz v14, :cond_1a

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v14

    check-cast v14, Lsw0/j;

    invoke-virtual {v14}, Lsw0/j;->l()Ljava/lang/String;

    move-result-object v33

    invoke-virtual {v14}, Lsw0/j;->r()Ljava/lang/String;

    move-result-object v18

    invoke-static/range {v18 .. v18}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v34

    invoke-virtual {v14}, Lsw0/j;->v()Z

    move-result v35

    new-instance v36, Lkd1/o$c;

    invoke-virtual {v14}, Lsw0/j;->k()Ljava/lang/String;

    move-result-object v37

    const/16 v41, 0xe

    const/16 v42, 0x0

    const/16 v38, 0x0

    const/16 v39, 0x0

    const/16 v40, 0x0

    invoke-direct/range {v36 .. v42}, Lkd1/o$c;-><init>(Ljava/lang/Object;IIIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {v14}, Lsw0/j;->p()Ljava/lang/String;

    move-result-object v18

    invoke-static/range {v18 .. v18}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v37

    invoke-virtual {v14}, Lsw0/j;->i()Ljava/util/List;

    move-result-object v18

    move-object/from16 p5, v2

    move-object/from16 v2, v18

    check-cast v2, Ljava/lang/Iterable;

    new-instance v4, Ljava/util/ArrayList;

    move-object/from16 v18, v5

    invoke-static {v2, v0}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v5

    invoke-direct {v4, v5}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_19
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_19

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/String;

    invoke-static {v5}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v5

    invoke-virtual {v4, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_19

    :cond_19
    invoke-virtual {v14}, Lsw0/j;->g()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v39

    new-instance v32, Lkm0/d;

    const/16 v40, 0x0

    const/16 v41, 0x0

    const/16 v42, 0x0

    const/16 v43, 0x380

    const/16 v44, 0x0

    move-object/from16 v38, v4

    invoke-direct/range {v32 .. v44}, Lkm0/d;-><init>(Ljava/lang/String;Lcom/whoop/design/util/TextResource;ZLkd1/o;Lcom/whoop/design/util/TextResource;Ljava/util/List;Lcom/whoop/design/util/TextResource;ZLhy0/h1;Ljava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object/from16 v2, v32

    invoke-virtual {v1, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    move-object/from16 v4, p2

    move-object/from16 v2, p5

    move-object/from16 v5, v18

    goto/16 :goto_18

    :cond_1a
    move-object/from16 v18, v5

    new-instance v30, Lkm0/g;

    const/16 v33, 0x0

    const/16 v34, 0x4

    const/16 v35, 0x0

    move-object/from16 v32, v1

    invoke-direct/range {v30 .. v35}, Lkm0/g;-><init>(Lcom/whoop/design/util/TextResource;Ljava/util/List;Lm91/u;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object/from16 v1, v30

    invoke-virtual {v3, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    move-object/from16 v1, p1

    move-object/from16 v4, p2

    move-object/from16 v2, v24

    goto/16 :goto_17

    :cond_1b
    move-object/from16 v24, v2

    move-object/from16 v18, v5

    move-object v5, v9

    check-cast v5, Ljava/lang/Iterable;

    new-instance v1, Ljava/util/ArrayList;

    invoke-static {v5, v0}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v2

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_1a
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_1f

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/util/List;

    check-cast v4, Ljava/lang/Iterable;

    new-instance v5, Ljava/util/ArrayList;

    invoke-static {v4, v0}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v9

    invoke-direct {v5, v9}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_1b
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v9

    if-eqz v9, :cond_1e

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Lsw0/i;

    invoke-virtual {v9}, Lsw0/i;->e()Lcom/whoop/design/util/TextResource;

    move-result-object v31

    invoke-virtual {v9}, Lsw0/i;->f()Ljava/util/List;

    move-result-object v9

    check-cast v9, Ljava/lang/Iterable;

    new-instance v14, Ljava/util/ArrayList;

    move-object/from16 p1, v2

    invoke-static {v9, v0}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v2

    invoke-direct {v14, v2}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v9}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_1c
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v9

    if-eqz v9, :cond_1d

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Lsw0/j;

    invoke-virtual {v9}, Lsw0/j;->l()Ljava/lang/String;

    move-result-object v33

    invoke-virtual {v9}, Lsw0/j;->r()Ljava/lang/String;

    move-result-object v20

    invoke-static/range {v20 .. v20}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v34

    invoke-virtual {v9}, Lsw0/j;->v()Z

    move-result v35

    new-instance v36, Lkd1/o$c;

    invoke-virtual {v9}, Lsw0/j;->k()Ljava/lang/String;

    move-result-object v37

    const/16 v41, 0xe

    const/16 v42, 0x0

    const/16 v38, 0x0

    const/16 v39, 0x0

    const/16 v40, 0x0

    invoke-direct/range {v36 .. v42}, Lkd1/o$c;-><init>(Ljava/lang/Object;IIIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {v9}, Lsw0/j;->p()Ljava/lang/String;

    move-result-object v20

    invoke-static/range {v20 .. v20}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v37

    invoke-virtual {v9}, Lsw0/j;->i()Ljava/util/List;

    move-result-object v20

    move-object/from16 p5, v2

    move-object/from16 v2, v20

    check-cast v2, Ljava/lang/Iterable;

    move-object/from16 v26, v3

    new-instance v3, Ljava/util/ArrayList;

    move-object/from16 v20, v4

    invoke-static {v2, v0}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v4

    invoke-direct {v3, v4}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_1d
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_1c

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/String;

    invoke-static {v4}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_1d

    :cond_1c
    invoke-virtual {v9}, Lsw0/j;->g()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v39

    new-instance v32, Lkm0/d;

    const/16 v40, 0x0

    const/16 v41, 0x0

    const/16 v42, 0x0

    const/16 v43, 0x380

    const/16 v44, 0x0

    move-object/from16 v38, v3

    invoke-direct/range {v32 .. v44}, Lkm0/d;-><init>(Ljava/lang/String;Lcom/whoop/design/util/TextResource;ZLkd1/o;Lcom/whoop/design/util/TextResource;Ljava/util/List;Lcom/whoop/design/util/TextResource;ZLhy0/h1;Ljava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object/from16 v2, v32

    invoke-virtual {v14, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    move-object/from16 v2, p5

    move-object/from16 v4, v20

    move-object/from16 v3, v26

    goto/16 :goto_1c

    :cond_1d
    move-object/from16 v26, v3

    move-object/from16 v20, v4

    new-instance v30, Lkm0/g;

    const/16 v33, 0x0

    const/16 v34, 0x4

    const/16 v35, 0x0

    move-object/from16 v32, v14

    invoke-direct/range {v30 .. v35}, Lkm0/g;-><init>(Lcom/whoop/design/util/TextResource;Ljava/util/List;Lm91/u;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object/from16 v2, v30

    invoke-virtual {v5, v2}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    move-object/from16 v2, p1

    goto/16 :goto_1b

    :cond_1e
    move-object/from16 p1, v2

    move-object/from16 v26, v3

    invoke-virtual {v1, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto/16 :goto_1a

    :cond_1f
    move-object/from16 v26, v3

    invoke-virtual/range {p3 .. p3}, Lsw0/g;->c()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v28

    new-instance v14, Lkm0/e;

    const/16 v34, 0x1e00

    const/16 v35, 0x0

    const/16 v30, 0x0

    const/16 v31, 0x0

    const/16 v32, 0x0

    const/16 v33, 0x0

    move-object/from16 v27, v1

    move-object/from16 v20, v14

    invoke-direct/range {v20 .. v35}, Lkm0/e;-><init>(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/util/List;Lcom/whoop/design/util/TextResource;Ljava/util/List;Ljava/util/List;Lcom/whoop/design/util/TextResource;Ly81/e;Lkm0/f;Ljava/lang/String;Ljava/util/List;Lm91/u;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual/range {p2 .. p2}, Lcom/whoop/weeklyplan/customizeplan/domain/api/WeeklyPlanCustomizationScreenModel;->getTipContent()Lcom/whoop/weeklyplan/customizeplan/domain/api/TipContent;

    move-result-object v0

    if-eqz v0, :cond_20

    sget-object v1, Lx81/d;->a:Lx81/d;

    invoke-virtual {v1}, Lx81/d;->d()Lgz0/o0;

    move-result-object v1

    invoke-virtual {v1}, Lgz0/o0;->p()Lgz0/k0;

    move-result-object v1

    invoke-virtual {v1}, Lgz0/k0;->a()I

    move-result v1

    invoke-virtual {v0}, Lcom/whoop/weeklyplan/customizeplan/domain/api/TipContent;->getTitle()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v2

    invoke-virtual {v0}, Lcom/whoop/weeklyplan/customizeplan/domain/api/TipContent;->getTipsMarkdown()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v0

    new-instance v3, Lqt2/c0;

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-direct {v3, v2, v1, v0}, Lqt2/c0;-><init>(Lcom/whoop/design/util/TextResource;Ljava/lang/Integer;Lcom/whoop/design/util/TextResource;)V

    move-object/from16 v16, v3

    goto :goto_1e

    :cond_20
    const/16 v16, 0x0

    :goto_1e
    new-instance v3, Lys2/e$i;

    move-object v9, v13

    move-object/from16 v5, v18

    move-object/from16 v4, v19

    move-object v13, v10

    move-object v10, v8

    move-object v8, v11

    move-object/from16 v11, v17

    invoke-direct/range {v3 .. v16}, Lys2/e$i;-><init>(Ljava/lang/String;Lcom/whoop/weeklyplan/customizeplan/domain/api/TargetGoalType;Lys2/f;Ljava/util/List;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/util/List;Lys2/a;Lys2/b;Ljava/util/List;Lkm0/e;Lws2/g;Lqt2/c0;)V

    return-object v3
.end method
