.class public final Lzs2/b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000R\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0008\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J7\u0010\u0013\u001a\u00020\u00122\u0006\u0010\t\u001a\u00020\u00082\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u000c2\u0006\u0010\u000f\u001a\u00020\u000e2\u0008\u0008\u0002\u0010\u0011\u001a\u00020\u0010\u00a2\u0006\u0004\u0008\u0013\u0010\u0014J!\u0010\u0018\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u0016\u001a\u00020\u00152\u0006\u0010\r\u001a\u00020\u000cH\u0000\u00a2\u0006\u0004\u0008\u0018\u0010\u0019R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u001a\u0010\u001bR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0018\u0010\u001cR\u0017\u0010!\u001a\u00020\u001d8\u0006\u00a2\u0006\u000c\n\u0004\u0008\u0013\u0010\u001e\u001a\u0004\u0008\u001f\u0010 \u00a8\u0006\""
    }
    d2 = {
        "Lzs2/b;",
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
        "c",
        "(Ljava/util/UUID;Lcom/whoop/weeklyplan/customizeplan/domain/api/WeeklyPlanCustomizationScreenModel;Lsw0/g;Lws2/g;Z)Lys2/e;",
        "",
        "behaviorId",
        "Lf41/a;",
        "b",
        "(Ljava/lang/String;Lsw0/g;)Lf41/a;",
        "a",
        "Ltw0/a;",
        "Lcom/whoop/data/repositories/FeatureFlagChecker;",
        "Ljb1/a;",
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

    iput-object p1, p0, Lzs2/b;->a:Ltw0/a;

    iput-object p2, p0, Lzs2/b;->b:Lcom/whoop/data/repositories/FeatureFlagChecker;

    new-instance p1, Lzm1/d;

    const/16 p2, 0xc

    invoke-direct {p1, p2}, Lzm1/d;-><init>(I)V

    invoke-static {p1}, Ljb1/c;->d(Lkotlin/jvm/functions/Function1;)Ljb1/a;

    move-result-object p1

    iput-object p1, p0, Lzs2/b;->c:Ljb1/a;

    return-void
.end method

.method public static synthetic a(Ljb1/b;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lzs2/b;->d(Ljb1/b;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method private static final d(Ljb1/b;)Ll83/a0;
    .locals 1

    const-string v0, "$this$designItemReducer"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method


# virtual methods
.method public final b(Ljava/lang/String;Lsw0/g;)Lf41/a;
    .locals 33

    move-object/from16 v0, p1

    const-string v1, "behaviorId"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "bottomSheet"

    move-object/from16 v2, p2

    invoke-static {v2, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v2}, Lsw0/g;->j()Ljava/util/List;

    move-result-object v1

    check-cast v1, Ljava/lang/Iterable;

    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lsw0/i;

    invoke-virtual {v3}, Lsw0/i;->f()Ljava/util/List;

    move-result-object v3

    check-cast v3, Ljava/lang/Iterable;

    invoke-static {v2, v3}, Lm83/s;->p0(Ljava/util/Collection;Ljava/lang/Iterable;)V

    goto :goto_0

    :cond_0
    invoke-virtual {v2}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_1
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    const/4 v3, 0x0

    if-eqz v2, :cond_2

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    move-object v4, v2

    check-cast v4, Lsw0/j;

    invoke-virtual {v4}, Lsw0/j;->l()Ljava/lang/String;

    move-result-object v4

    invoke-static {v4, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_1

    goto :goto_1

    :cond_2
    move-object v2, v3

    :goto_1
    check-cast v2, Lsw0/j;

    if-eqz v2, :cond_4

    invoke-virtual {v2}, Lsw0/j;->h()Lsw0/a;

    move-result-object v0

    if-eqz v0, :cond_4

    invoke-virtual {v0}, Lsw0/a;->a()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v3

    invoke-virtual {v0}, Lsw0/a;->c()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v4

    invoke-virtual {v0}, Lsw0/a;->b()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v5

    invoke-virtual {v0}, Lsw0/a;->e()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v6

    invoke-virtual {v0}, Lsw0/a;->d()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    new-instance v7, Ljava/util/ArrayList;

    const/16 v1, 0xa

    invoke-static {v0, v1}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v1

    invoke-direct {v7, v1}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_2
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/String;

    new-instance v8, Lhy0/h1;

    invoke-static {v1}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v9

    sget-object v1, Lzs2/b$a;->w:Lzs2/b$a;

    invoke-static {v1}, Ly81/g;->a(Lkotlin/jvm/functions/Function1;)Ly81/e;

    move-result-object v11

    sget-object v1, Lzs2/b$b;->w:Lzs2/b$b;

    invoke-static {v1}, Ly81/g;->a(Lkotlin/jvm/functions/Function1;)Ly81/e;

    move-result-object v13

    const v31, 0x3fffea

    const/16 v32, 0x0

    const/4 v10, 0x0

    const/4 v12, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

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

    invoke-direct/range {v8 .. v32}, Lhy0/h1;-><init>(Lcom/whoop/design/util/TextResource;Ly71/g;Ly81/e;Li91/d;Ly81/e;Li2/t;Li2/t;Lhy0/o1;ZLi2/a1;FFFLy71/g;FLy81/e;Lcom/whoop/navigation/e;Lcom/whoop/whoopaction/domain/models/Action;Lhy0/c1;Lkd1/o;Ljava/util/List;Lcom/whoop/navigation/models/GenericInteraction;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {v7, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_2

    :cond_3
    new-instance v2, Lf41/a;

    invoke-direct/range {v2 .. v7}, Lf41/a;-><init>(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/util/List;)V

    return-object v2

    :cond_4
    return-object v3
.end method

.method public final c(Ljava/util/UUID;Lcom/whoop/weeklyplan/customizeplan/domain/api/WeeklyPlanCustomizationScreenModel;Lsw0/g;Lws2/g;Z)Lys2/e;
    .locals 39

    move-object/from16 v0, p0

    move-object/from16 v2, p3

    const-string v1, "planId"

    move-object/from16 v3, p1

    invoke-static {v3, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "model"

    move-object/from16 v9, p2

    invoke-static {v9, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "bottomSheet"

    invoke-static {v2, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "progress"

    move-object/from16 v10, p4

    invoke-static {v10, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v1, v0, Lzs2/b;->a:Ltw0/a;

    invoke-virtual {v1, v2}, Ltw0/a;->b(Lsw0/g;)Ljava/util/List;

    move-result-object v1

    iget-object v4, v0, Lzs2/b;->b:Lcom/whoop/data/repositories/FeatureFlagChecker;

    const-string v5, "healthspan-coaching-bottom-sheet-swipe"

    invoke-interface {v4, v5}, Lcom/whoop/data/repositories/FeatureFlagChecker;->isFeatureEnabled(Ljava/lang/String;)Z

    move-result v4

    sget-object v5, Lm83/y;->w:Lm83/y;

    if-eqz v4, :cond_0

    iget-object v4, v0, Lzs2/b;->a:Ltw0/a;

    invoke-virtual {v4, v2}, Ltw0/a;->c(Lsw0/g;)Ljava/util/List;

    move-result-object v4

    goto :goto_0

    :cond_0
    move-object v4, v5

    :goto_0
    invoke-virtual {v9}, Lcom/whoop/weeklyplan/customizeplan/domain/api/WeeklyPlanCustomizationScreenModel;->getToggles()Lcom/whoop/weeklyplan/customizeplan/domain/api/ToggleContent;

    move-result-object v6

    if-eqz v6, :cond_2

    invoke-virtual {v6}, Lcom/whoop/weeklyplan/customizeplan/domain/api/ToggleContent;->getInitialToggles()Ljava/util/List;

    move-result-object v8

    check-cast v8, Ljava/util/Collection;

    invoke-virtual {v6}, Lcom/whoop/weeklyplan/customizeplan/domain/api/ToggleContent;->getTopInitialToggles()Ljava/util/List;

    move-result-object v6

    if-eqz v6, :cond_1

    check-cast v6, Ljava/lang/Iterable;

    goto :goto_1

    :cond_1
    move-object v6, v5

    :goto_1
    invoke-static {v8, v6}, Lm83/s;->g1(Ljava/util/Collection;Ljava/lang/Iterable;)Ljava/util/ArrayList;

    move-result-object v6

    goto :goto_2

    :cond_2
    const/4 v6, 0x0

    :goto_2
    invoke-virtual {v3}, Ljava/util/UUID;->toString()Ljava/lang/String;

    move-result-object v11

    const-string v3, "toString(...)"

    invoke-static {v11, v3}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v12, Lcom/whoop/weeklyplan/customizeplan/domain/api/TargetGoalType;->BEHAVIORS:Lcom/whoop/weeklyplan/customizeplan/domain/api/TargetGoalType;

    new-instance v13, Lys2/f;

    invoke-virtual {v9}, Lcom/whoop/weeklyplan/customizeplan/domain/api/WeeklyPlanCustomizationScreenModel;->getNavigationTitleDisplay()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v3

    invoke-virtual {v9}, Lcom/whoop/weeklyplan/customizeplan/domain/api/WeeklyPlanCustomizationScreenModel;->getNavigationSubtitleDisplay()Ljava/lang/String;

    move-result-object v8

    invoke-static {v8}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v8

    invoke-virtual {v9}, Lcom/whoop/weeklyplan/customizeplan/domain/api/WeeklyPlanCustomizationScreenModel;->getTitle()Ljava/lang/String;

    move-result-object v14

    invoke-static {v14}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v14

    invoke-virtual {v9}, Lcom/whoop/weeklyplan/customizeplan/domain/api/WeeklyPlanCustomizationScreenModel;->getDescription()Ljava/lang/String;

    move-result-object v15

    invoke-static {v15}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v15

    invoke-direct {v13, v3, v8, v14, v15}, Lys2/f;-><init>(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;)V

    invoke-virtual {v9}, Lcom/whoop/weeklyplan/customizeplan/domain/api/WeeklyPlanCustomizationScreenModel;->getToggles()Lcom/whoop/weeklyplan/customizeplan/domain/api/ToggleContent;

    move-result-object v3

    if-eqz v3, :cond_3

    invoke-virtual {v3}, Lcom/whoop/weeklyplan/customizeplan/domain/api/ToggleContent;->getTopHeadingDisplay()Ljava/lang/String;

    move-result-object v3

    goto :goto_3

    :cond_3
    const/4 v3, 0x0

    :goto_3
    invoke-static {v3}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v14

    iget-object v3, v0, Lzs2/b;->c:Ljb1/a;

    invoke-virtual {v9}, Lcom/whoop/weeklyplan/customizeplan/domain/api/WeeklyPlanCustomizationScreenModel;->getToggles()Lcom/whoop/weeklyplan/customizeplan/domain/api/ToggleContent;

    move-result-object v8

    if-eqz v8, :cond_4

    invoke-virtual {v8}, Lcom/whoop/weeklyplan/customizeplan/domain/api/ToggleContent;->getTopInitialToggles()Ljava/util/List;

    move-result-object v8

    if-nez v8, :cond_5

    :cond_4
    move-object v8, v5

    :cond_5
    invoke-virtual {v3, v8}, Ljb1/a;->g(Ljava/util/List;)Ljava/util/List;

    move-result-object v3

    check-cast v3, Ljava/lang/Iterable;

    new-instance v15, Ljava/util/ArrayList;

    const/16 v8, 0xa

    invoke-static {v3, v8}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v7

    invoke-direct {v15, v7}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_4
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    const-string v8, "null cannot be cast to non-null type com.whoop.design.atomic.molecule.tile.goalsettingstile.GoalSettingsTileState"

    if-eqz v7, :cond_6

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lm91/u;

    invoke-static {v7, v8}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v17, v7

    check-cast v17, Lf41/e;

    invoke-virtual/range {v17 .. v17}, Lf41/e;->getId()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v0, v7, v2}, Lzs2/b;->b(Ljava/lang/String;Lsw0/g;)Lf41/a;

    move-result-object v31

    const/16 v32, 0x1fff

    const/16 v33, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

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

    invoke-static/range {v17 .. v33}, Lf41/e;->b(Lf41/e;Ljava/lang/String;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lkd1/o;Lhy0/c2;Ly81/e;Lkd1/o;ZZZLf41/b;ILf41/a;ILjava/lang/Object;)Lf41/e;

    move-result-object v7

    invoke-virtual {v15, v7}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const/16 v8, 0xa

    goto :goto_4

    :cond_6
    invoke-virtual {v9}, Lcom/whoop/weeklyplan/customizeplan/domain/api/WeeklyPlanCustomizationScreenModel;->getToggles()Lcom/whoop/weeklyplan/customizeplan/domain/api/ToggleContent;

    move-result-object v3

    if-eqz v3, :cond_7

    invoke-virtual {v3}, Lcom/whoop/weeklyplan/customizeplan/domain/api/ToggleContent;->getHeadingDisplay()Ljava/lang/String;

    move-result-object v3

    goto :goto_5

    :cond_7
    const/4 v3, 0x0

    :goto_5
    invoke-static {v3}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v17

    invoke-virtual {v9}, Lcom/whoop/weeklyplan/customizeplan/domain/api/WeeklyPlanCustomizationScreenModel;->getToggles()Lcom/whoop/weeklyplan/customizeplan/domain/api/ToggleContent;

    move-result-object v3

    if-eqz v3, :cond_8

    invoke-virtual {v3}, Lcom/whoop/weeklyplan/customizeplan/domain/api/ToggleContent;->getSubHeadingDisplay()Ljava/lang/String;

    move-result-object v3

    goto :goto_6

    :cond_8
    const/4 v3, 0x0

    :goto_6
    invoke-static {v3}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v18

    iget-object v3, v0, Lzs2/b;->c:Ljb1/a;

    invoke-virtual {v9}, Lcom/whoop/weeklyplan/customizeplan/domain/api/WeeklyPlanCustomizationScreenModel;->getToggles()Lcom/whoop/weeklyplan/customizeplan/domain/api/ToggleContent;

    move-result-object v7

    if-eqz v7, :cond_9

    invoke-virtual {v7}, Lcom/whoop/weeklyplan/customizeplan/domain/api/ToggleContent;->getInitialToggles()Ljava/util/List;

    move-result-object v7

    if-nez v7, :cond_a

    :cond_9
    move-object v7, v5

    :cond_a
    invoke-virtual {v3, v7}, Ljb1/a;->g(Ljava/util/List;)Ljava/util/List;

    move-result-object v3

    check-cast v3, Ljava/lang/Iterable;

    new-instance v10, Ljava/util/ArrayList;

    move-object/from16 v19, v1

    const/16 v7, 0xa

    invoke-static {v3, v7}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v1

    invoke-direct {v10, v1}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_7
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_b

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lm91/u;

    invoke-static {v3, v8}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v20, v3

    check-cast v20, Lf41/e;

    invoke-virtual/range {v20 .. v20}, Lf41/e;->getId()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v3, v2}, Lzs2/b;->b(Ljava/lang/String;Lsw0/g;)Lf41/a;

    move-result-object v34

    const/16 v35, 0x1fff

    const/16 v36, 0x0

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

    const/16 v31, 0x0

    const/16 v32, 0x0

    const/16 v33, 0x0

    invoke-static/range {v20 .. v36}, Lf41/e;->b(Lf41/e;Ljava/lang/String;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lkd1/o;Lhy0/c2;Ly81/e;Lkd1/o;ZZZLf41/b;ILf41/a;ILjava/lang/Object;)Lf41/e;

    move-result-object v3

    invoke-virtual {v10, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_7

    :cond_b
    invoke-virtual {v9}, Lcom/whoop/weeklyplan/customizeplan/domain/api/WeeklyPlanCustomizationScreenModel;->getToggles()Lcom/whoop/weeklyplan/customizeplan/domain/api/ToggleContent;

    move-result-object v1

    if-eqz v1, :cond_c

    invoke-virtual {v1}, Lcom/whoop/weeklyplan/customizeplan/domain/api/ToggleContent;->getBottomButton()Lcom/whoop/weeklyplan/customizeplan/domain/api/BottomButton;

    move-result-object v1

    if-eqz v1, :cond_c

    invoke-virtual {v1}, Lcom/whoop/weeklyplan/customizeplan/domain/api/BottomButton;->getTitleDisplay()Ljava/lang/String;

    move-result-object v1

    goto :goto_8

    :cond_c
    const/4 v1, 0x0

    :goto_8
    invoke-static {v1}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v21

    invoke-virtual {v9}, Lcom/whoop/weeklyplan/customizeplan/domain/api/WeeklyPlanCustomizationScreenModel;->getToggles()Lcom/whoop/weeklyplan/customizeplan/domain/api/ToggleContent;

    move-result-object v1

    if-eqz v1, :cond_10

    invoke-virtual {v1}, Lcom/whoop/weeklyplan/customizeplan/domain/api/ToggleContent;->getBottomButton()Lcom/whoop/weeklyplan/customizeplan/domain/api/BottomButton;

    move-result-object v1

    if-eqz v1, :cond_10

    invoke-virtual {v1}, Lcom/whoop/weeklyplan/customizeplan/domain/api/BottomButton;->getIcon()Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_10

    sget-object v7, Lgz0/m0;->SETTINGS:Lgz0/m0;

    invoke-static {}, Lgz0/m0;->values()[Lgz0/m0;

    move-result-object v8

    array-length v3, v8

    const/4 v2, 0x0

    :goto_9
    if-ge v2, v3, :cond_e

    aget-object v20, v8, v2

    move/from16 v22, v2

    invoke-virtual/range {v20 .. v20}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_d

    goto :goto_a

    :cond_d
    add-int/lit8 v2, v22, 0x1

    goto :goto_9

    :cond_e
    const/16 v20, 0x0

    :goto_a
    if-nez v20, :cond_f

    goto :goto_b

    :cond_f
    move-object/from16 v7, v20

    :goto_b
    invoke-virtual {v7}, Lgz0/m0;->toWhoopIcon()I

    move-result v1

    :goto_c
    move/from16 v24, v1

    goto :goto_d

    :cond_10
    sget-object v1, Lgz0/m0;->SETTINGS:Lgz0/m0;

    invoke-virtual {v1}, Lgz0/m0;->toWhoopIcon()I

    move-result v1

    goto :goto_c

    :goto_d
    invoke-virtual {v9}, Lcom/whoop/weeklyplan/customizeplan/domain/api/WeeklyPlanCustomizationScreenModel;->getToggles()Lcom/whoop/weeklyplan/customizeplan/domain/api/ToggleContent;

    move-result-object v1

    if-eqz v1, :cond_12

    invoke-virtual {v1}, Lcom/whoop/weeklyplan/customizeplan/domain/api/ToggleContent;->getBottomButton()Lcom/whoop/weeklyplan/customizeplan/domain/api/BottomButton;

    move-result-object v1

    if-eqz v1, :cond_12

    invoke-virtual {v1}, Lcom/whoop/weeklyplan/customizeplan/domain/api/BottomButton;->getAction()Lcom/whoop/navigation/e;

    move-result-object v1

    if-nez v1, :cond_11

    goto :goto_e

    :cond_11
    move-object/from16 v22, v1

    goto :goto_f

    :cond_12
    :goto_e
    new-instance v28, Lcom/whoop/navigation/e;

    const/16 v32, 0x7

    const/16 v33, 0x0

    const/16 v29, 0x0

    const/16 v30, 0x0

    const/16 v31, 0x0

    invoke-direct/range {v28 .. v33}, Lcom/whoop/navigation/e;-><init>(Lcom/whoop/navigation/AppScreen;Lcom/whoop/navigation/NavigationScreenModel;Lj02/v0;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object/from16 v22, v28

    :goto_f
    new-instance v20, Lys2/a;

    const/16 v25, 0x4

    const/16 v26, 0x0

    const/16 v23, 0x0

    invoke-direct/range {v20 .. v26}, Lys2/a;-><init>(Lcom/whoop/design/util/TextResource;Lcom/whoop/navigation/e;ZIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {v9}, Lcom/whoop/weeklyplan/customizeplan/domain/api/WeeklyPlanCustomizationScreenModel;->getButtonDescriptionDisplay()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v21

    invoke-virtual {v9}, Lcom/whoop/weeklyplan/customizeplan/domain/api/WeeklyPlanCustomizationScreenModel;->getContinueButtonDisplay()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v1

    invoke-virtual {v9}, Lcom/whoop/weeklyplan/customizeplan/domain/api/WeeklyPlanCustomizationScreenModel;->getSkipButtonDisplay()Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_13

    invoke-static {v2}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v2

    :goto_10
    move-object/from16 v22, v13

    goto :goto_11

    :cond_13
    const/4 v2, 0x0

    goto :goto_10

    :goto_11
    new-instance v13, Lys2/b;

    const/4 v3, 0x1

    move/from16 v7, p5

    invoke-direct {v13, v1, v3, v2, v7}, Lys2/b;-><init>(Lcom/whoop/design/util/TextResource;ZLcom/whoop/design/util/TextResource;Z)V

    if-eqz v6, :cond_1b

    new-instance v1, Ljava/util/ArrayList;

    invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v6}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_14
    :goto_12
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_15

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    move-object v5, v3

    check-cast v5, Lcom/whoop/design/models/items/GoalSettingsTileModel;

    invoke-virtual {v5}, Lcom/whoop/design/models/items/GoalSettingsTileModel;->getSelectedValue()Ljava/lang/Integer;

    move-result-object v5

    if-eqz v5, :cond_14

    invoke-virtual {v1, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_12

    :cond_15
    new-instance v5, Ljava/util/ArrayList;

    const/16 v7, 0xa

    invoke-static {v1, v7}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v2

    invoke-direct {v5, v2}, Ljava/util/ArrayList;-><init>(I)V

    invoke-virtual {v1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_13
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1b

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/whoop/design/models/items/GoalSettingsTileModel;

    if-eqz v2, :cond_16

    goto :goto_14

    :cond_16
    const/4 v2, 0x0

    :goto_14
    if-eqz v2, :cond_1a

    new-instance v3, Lcom/whoop/weeklyplan/customizeplan/domain/api/BehaviorTarget;

    invoke-virtual {v2}, Lcom/whoop/design/models/items/GoalSettingsTileModel;->getId()Ljava/lang/String;

    move-result-object v6

    invoke-static {v6}, Lyb3/y;->Q(Ljava/lang/String;)Ljava/lang/Integer;

    move-result-object v6

    if-eqz v6, :cond_17

    invoke-virtual {v6}, Ljava/lang/Integer;->intValue()I

    move-result v6

    goto :goto_15

    :cond_17
    const/4 v6, 0x0

    :goto_15
    invoke-virtual {v2}, Lcom/whoop/design/models/items/GoalSettingsTileModel;->getSelectedValue()Ljava/lang/Integer;

    move-result-object v7

    if-eqz v7, :cond_18

    invoke-virtual {v7}, Ljava/lang/Integer;->intValue()I

    move-result v7

    goto :goto_16

    :cond_18
    const/4 v7, 0x0

    :goto_16
    invoke-virtual {v2}, Lcom/whoop/design/models/items/GoalSettingsTileModel;->isAvoidChecked()Ljava/lang/Boolean;

    move-result-object v2

    if-eqz v2, :cond_19

    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v2

    goto :goto_17

    :cond_19
    const/4 v2, 0x0

    :goto_17
    invoke-direct {v3, v6, v7, v2}, Lcom/whoop/weeklyplan/customizeplan/domain/api/BehaviorTarget;-><init>(IIZ)V

    const/4 v2, 0x0

    goto :goto_18

    :cond_1a
    new-instance v3, Lcom/whoop/weeklyplan/customizeplan/domain/api/BehaviorTarget;

    const/4 v2, 0x0

    invoke-direct {v3, v2, v2, v2}, Lcom/whoop/weeklyplan/customizeplan/domain/api/BehaviorTarget;-><init>(IIZ)V

    :goto_18
    invoke-virtual {v5, v3}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_13

    :cond_1b
    move-object/from16 v16, v5

    iget-object v1, v0, Lzs2/b;->a:Ltw0/a;

    const/16 v7, 0x18

    const/4 v8, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    move-object/from16 v2, p3

    move-object/from16 v3, v19

    invoke-static/range {v1 .. v8}, Ltw0/a;->f(Ltw0/a;Lsw0/g;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/util/List;ILjava/lang/Object;)Lkm0/e;

    move-result-object v23

    invoke-static {v9}, Lot2/d;->a(Lcom/whoop/weeklyplan/customizeplan/domain/api/WeeklyPlanCustomizationScreenModel;)Ly81/e;

    move-result-object v32

    const/16 v37, 0x1eff

    const/16 v38, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    const/16 v28, 0x0

    const/16 v29, 0x0

    const/16 v30, 0x0

    const/16 v31, 0x0

    const/16 v33, 0x0

    const/16 v34, 0x0

    const/16 v35, 0x0

    const/16 v36, 0x0

    invoke-static/range {v23 .. v38}, Lkm0/e;->b(Lkm0/e;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/util/List;Lcom/whoop/design/util/TextResource;Ljava/util/List;Ljava/util/List;Lcom/whoop/design/util/TextResource;Ly81/e;Lkm0/f;Ljava/lang/String;Ljava/util/List;Lm91/u;ILjava/lang/Object;)Lkm0/e;

    move-result-object v1

    new-instance v2, Lys2/e$j;

    move-object v3, v11

    move-object v4, v12

    move-object v7, v14

    move-object v6, v15

    move-object/from16 v14, v16

    move-object/from16 v8, v17

    move-object/from16 v9, v18

    move-object/from16 v11, v20

    move-object/from16 v12, v21

    move-object/from16 v5, v22

    move-object/from16 v16, p4

    move-object v15, v1

    invoke-direct/range {v2 .. v16}, Lys2/e$j;-><init>(Ljava/lang/String;Lcom/whoop/weeklyplan/customizeplan/domain/api/TargetGoalType;Lys2/f;Ljava/util/List;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/util/List;Lys2/a;Lcom/whoop/design/util/TextResource;Lys2/b;Ljava/util/List;Lkm0/e;Lws2/g;)V

    return-object v2
.end method
