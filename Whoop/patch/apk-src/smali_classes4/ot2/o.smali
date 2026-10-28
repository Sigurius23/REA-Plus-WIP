.class public final Lot2/o;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0008\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\'\u0010\u000c\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\n2\u0006\u0010\t\u001a\u00020\u0008H\u0002\u00a2\u0006\u0004\u0008\u000c\u0010\rJ\u0019\u0010\u0011\u001a\u00020\u00102\u0008\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0002\u00a2\u0006\u0004\u0008\u0011\u0010\u0012J\u001f\u0010\u0018\u001a\u0004\u0018\u00010\u00172\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0016\u001a\u00020\u0015\u00a2\u0006\u0004\u0008\u0018\u0010\u0019R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000c\u0010\u001aR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0011\u0010\u001b\u00a8\u0006\u001c"
    }
    d2 = {
        "Lot2/o;",
        "",
        "Lzs2/g;",
        "rangeContentReducer",
        "Ljt2/q;",
        "metricSliderMatcher",
        "<init>",
        "(Lzs2/g;Ljt2/q;)V",
        "Lcom/whoop/weeklyplan/customizeplan/domain/api/WeeklyPlanCustomizationScreenModel;",
        "model",
        "Ll83/k;",
        "",
        "a",
        "(Lcom/whoop/weeklyplan/customizeplan/domain/api/WeeklyPlanCustomizationScreenModel;)Ll83/k;",
        "",
        "fillPercentage",
        "Ly81/e;",
        "b",
        "(Ljava/lang/Float;)Ly81/e;",
        "Ljt2/m$i;",
        "domainState",
        "Ljt2/d;",
        "accumulator",
        "Lot2/t;",
        "c",
        "(Ljt2/m$i;Ljt2/d;)Lot2/t;",
        "Lzs2/g;",
        "Ljt2/q;",
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
.field private final a:Lzs2/g;

.field private final b:Ljt2/q;


# direct methods
.method public constructor <init>(Lzs2/g;Ljt2/q;)V
    .locals 1

    const-string v0, "rangeContentReducer"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "metricSliderMatcher"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lot2/o;->a:Lzs2/g;

    iput-object p2, p0, Lot2/o;->b:Ljt2/q;

    return-void
.end method

.method private final a(Lcom/whoop/weeklyplan/customizeplan/domain/api/WeeklyPlanCustomizationScreenModel;)Ll83/k;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/weeklyplan/customizeplan/domain/api/WeeklyPlanCustomizationScreenModel;",
            ")",
            "Ll83/k;"
        }
    .end annotation

    invoke-virtual {p1}, Lcom/whoop/weeklyplan/customizeplan/domain/api/WeeklyPlanCustomizationScreenModel;->getSlider()Lcom/whoop/weeklyplan/customizeplan/domain/api/SliderContent;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/whoop/weeklyplan/customizeplan/domain/api/SliderContent;->getAverageLine()Lcom/whoop/weeklyplan/customizeplan/domain/api/AverageLine;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/whoop/weeklyplan/customizeplan/domain/api/AverageLine;->getTitle()Ljava/lang/String;

    move-result-object v0

    goto :goto_0

    :cond_0
    move-object v0, v1

    :goto_0
    invoke-virtual {p1}, Lcom/whoop/weeklyplan/customizeplan/domain/api/WeeklyPlanCustomizationScreenModel;->getSlider()Lcom/whoop/weeklyplan/customizeplan/domain/api/SliderContent;

    move-result-object p1

    if-eqz p1, :cond_1

    invoke-virtual {p1}, Lcom/whoop/weeklyplan/customizeplan/domain/api/SliderContent;->getAverageLine()Lcom/whoop/weeklyplan/customizeplan/domain/api/AverageLine;

    move-result-object p1

    if-eqz p1, :cond_1

    invoke-virtual {p1}, Lcom/whoop/weeklyplan/customizeplan/domain/api/AverageLine;->getTitle()Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_1

    const-string v2, " "

    filled-new-array {v2}, [Ljava/lang/String;

    move-result-object v2

    const/4 v3, 0x6

    invoke-static {p1, v2, v3}, Lyb3/r;->y0(Ljava/lang/CharSequence;[Ljava/lang/String;I)Ljava/util/List;

    move-result-object p1

    goto :goto_1

    :cond_1
    move-object p1, v1

    :goto_1
    if-eqz p1, :cond_2

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v2

    const/4 v3, 0x2

    if-ne v2, v3, :cond_2

    const/4 v0, 0x0

    invoke-interface {p1, v0}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    const/4 v1, 0x1

    invoke-interface {p1, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p1

    move-object v1, p1

    check-cast v1, Ljava/lang/String;

    :cond_2
    new-instance p1, Ll83/k;

    invoke-direct {p1, v0, v1}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    return-object p1
.end method

.method private final b(Ljava/lang/Float;)Ly81/e;
    .locals 1

    const/high16 v0, 0x3f800000    # 1.0f

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->c(Ljava/lang/Float;F)Z

    move-result v0

    if-nez v0, :cond_1

    const/4 v0, 0x0

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->c(Ljava/lang/Float;F)Z

    move-result p1

    if-eqz p1, :cond_0

    goto :goto_0

    :cond_0
    sget-object p1, Lot2/o$b;->w:Lot2/o$b;

    invoke-static {p1}, Ly81/g;->a(Lkotlin/jvm/functions/Function1;)Ly81/e;

    move-result-object p1

    return-object p1

    :cond_1
    :goto_0
    sget-object p1, Lot2/o$a;->w:Lot2/o$a;

    invoke-static {p1}, Ly81/g;->a(Lkotlin/jvm/functions/Function1;)Ly81/e;

    move-result-object p1

    return-object p1
.end method


# virtual methods
.method public final c(Ljt2/m$i;Ljt2/d;)Lot2/t;
    .locals 41

    move-object/from16 v0, p0

    const-string v1, "domainState"

    move-object/from16 v2, p1

    invoke-static {v2, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "accumulator"

    move-object/from16 v3, p2

    invoke-static {v3, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v2}, Ljt2/m$i;->b()Lcom/whoop/weeklyplan/hubandspoke/domain/api/HubAndSpokeResponse;

    move-result-object v1

    invoke-virtual {v1}, Lcom/whoop/weeklyplan/hubandspoke/domain/api/HubAndSpokeResponse;->getGoalScreens()Ljava/util/List;

    move-result-object v1

    check-cast v1, Ljava/lang/Iterable;

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    const/4 v4, 0x0

    if-eqz v2, :cond_1

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    move-object v5, v2

    check-cast v5, Lcom/whoop/weeklyplan/customizeplan/domain/api/WeeklyPlanCustomizationScreenModel;

    invoke-virtual {v5}, Lcom/whoop/weeklyplan/customizeplan/domain/api/WeeklyPlanCustomizationScreenModel;->getGoal()Lcom/whoop/weeklyplan/customizeplan/domain/api/TargetGoalType;

    move-result-object v5

    sget-object v6, Lcom/whoop/weeklyplan/customizeplan/domain/api/TargetGoalType;->WEIGHT:Lcom/whoop/weeklyplan/customizeplan/domain/api/TargetGoalType;

    if-ne v5, v6, :cond_0

    goto :goto_0

    :cond_1
    move-object v2, v4

    :goto_0
    check-cast v2, Lcom/whoop/weeklyplan/customizeplan/domain/api/WeeklyPlanCustomizationScreenModel;

    if-nez v2, :cond_2

    return-object v4

    :cond_2
    invoke-virtual {v3}, Ljt2/d;->l()Ljava/util/List;

    move-result-object v1

    check-cast v1, Ljava/lang/Iterable;

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_3
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_4

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    move-object v6, v5

    check-cast v6, Ljt2/r;

    invoke-virtual {v6}, Ljt2/r;->c()Lcom/whoop/weeklyplan/customizeplan/domain/api/TargetGoalType;

    move-result-object v6

    invoke-virtual {v3}, Ljt2/d;->f()Lcom/whoop/weeklyplan/customizeplan/domain/api/TargetGoalType;

    move-result-object v7

    if-ne v6, v7, :cond_3

    goto :goto_1

    :cond_4
    move-object v5, v4

    :goto_1
    check-cast v5, Ljt2/r;

    const/4 v1, 0x0

    if-eqz v5, :cond_5

    invoke-virtual {v5}, Ljt2/r;->b()D

    move-result-wide v5

    :goto_2
    double-to-float v5, v5

    goto :goto_3

    :cond_5
    invoke-virtual {v2}, Lcom/whoop/weeklyplan/customizeplan/domain/api/WeeklyPlanCustomizationScreenModel;->getSlider()Lcom/whoop/weeklyplan/customizeplan/domain/api/SliderContent;

    move-result-object v5

    if-eqz v5, :cond_6

    invoke-virtual {v5}, Lcom/whoop/weeklyplan/customizeplan/domain/api/SliderContent;->getValue()D

    move-result-wide v5

    goto :goto_2

    :cond_6
    move v5, v1

    :goto_3
    invoke-direct {v0, v2}, Lot2/o;->a(Lcom/whoop/weeklyplan/customizeplan/domain/api/WeeklyPlanCustomizationScreenModel;)Ll83/k;

    move-result-object v6

    iget-object v7, v6, Ll83/k;->w:Ljava/lang/Object;

    check-cast v7, Ljava/lang/String;

    iget-object v6, v6, Ll83/k;->x:Ljava/lang/Object;

    check-cast v6, Ljava/lang/String;

    iget-object v8, v0, Lot2/o;->a:Lzs2/g;

    invoke-virtual {v2}, Lcom/whoop/weeklyplan/customizeplan/domain/api/WeeklyPlanCustomizationScreenModel;->getSlider()Lcom/whoop/weeklyplan/customizeplan/domain/api/SliderContent;

    move-result-object v9

    if-eqz v9, :cond_7

    invoke-virtual {v9}, Lcom/whoop/weeklyplan/customizeplan/domain/api/SliderContent;->getRangeContent()Ljava/util/List;

    move-result-object v9

    goto :goto_4

    :cond_7
    move-object v9, v4

    :goto_4
    invoke-virtual {v2}, Lcom/whoop/weeklyplan/customizeplan/domain/api/WeeklyPlanCustomizationScreenModel;->getSlider()Lcom/whoop/weeklyplan/customizeplan/domain/api/SliderContent;

    move-result-object v10

    if-eqz v10, :cond_8

    invoke-virtual {v10}, Lcom/whoop/weeklyplan/customizeplan/domain/api/SliderContent;->getIncrement()D

    move-result-wide v10

    invoke-static {v10, v11}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v10

    goto :goto_5

    :cond_8
    move-object v10, v4

    :goto_5
    const/16 v13, 0xc

    const/4 v14, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    invoke-static/range {v8 .. v14}, Lzs2/g;->d(Lzs2/g;Ljava/util/List;Ljava/lang/Double;Lcom/whoop/data/remote/domain/dto/BoundType;Ly81/f;ILjava/lang/Object;)Ljava/util/List;

    move-result-object v8

    if-nez v8, :cond_9

    sget-object v8, Lm83/y;->w:Lm83/y;

    :cond_9
    move-object/from16 v22, v8

    invoke-virtual {v3}, Ljt2/d;->f()Lcom/whoop/weeklyplan/customizeplan/domain/api/TargetGoalType;

    move-result-object v8

    new-instance v9, Lys2/f;

    invoke-virtual {v2}, Lcom/whoop/weeklyplan/customizeplan/domain/api/WeeklyPlanCustomizationScreenModel;->getNavigationTitleDisplay()Ljava/lang/String;

    move-result-object v10

    invoke-static {v10}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v10

    invoke-virtual {v2}, Lcom/whoop/weeklyplan/customizeplan/domain/api/WeeklyPlanCustomizationScreenModel;->getNavigationSubtitleDisplay()Ljava/lang/String;

    move-result-object v11

    invoke-static {v11}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v11

    invoke-virtual {v2}, Lcom/whoop/weeklyplan/customizeplan/domain/api/WeeklyPlanCustomizationScreenModel;->getTitle()Ljava/lang/String;

    move-result-object v12

    invoke-static {v12}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v12

    invoke-virtual {v2}, Lcom/whoop/weeklyplan/customizeplan/domain/api/WeeklyPlanCustomizationScreenModel;->getDescription()Ljava/lang/String;

    move-result-object v13

    invoke-static {v13}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v13

    invoke-direct {v9, v10, v11, v12, v13}, Lys2/f;-><init>(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;)V

    invoke-virtual {v3}, Ljt2/d;->l()Ljava/util/List;

    move-result-object v10

    check-cast v10, Ljava/lang/Iterable;

    invoke-interface {v10}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v10

    :cond_a
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    move-result v11

    if-eqz v11, :cond_b

    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v11

    move-object v12, v11

    check-cast v12, Ljt2/r;

    invoke-virtual {v12}, Ljt2/r;->c()Lcom/whoop/weeklyplan/customizeplan/domain/api/TargetGoalType;

    move-result-object v12

    invoke-virtual {v3}, Ljt2/d;->f()Lcom/whoop/weeklyplan/customizeplan/domain/api/TargetGoalType;

    move-result-object v13

    if-ne v12, v13, :cond_a

    goto :goto_6

    :cond_b
    move-object v11, v4

    :goto_6
    check-cast v11, Ljt2/r;

    if-eqz v11, :cond_d

    invoke-virtual {v11}, Ljt2/r;->b()D

    move-result-wide v10

    :goto_7
    double-to-float v1, v10

    :cond_c
    move v10, v1

    goto :goto_8

    :cond_d
    invoke-virtual {v2}, Lcom/whoop/weeklyplan/customizeplan/domain/api/WeeklyPlanCustomizationScreenModel;->getSlider()Lcom/whoop/weeklyplan/customizeplan/domain/api/SliderContent;

    move-result-object v3

    if-eqz v3, :cond_c

    invoke-virtual {v3}, Lcom/whoop/weeklyplan/customizeplan/domain/api/SliderContent;->getValue()D

    move-result-wide v10

    goto :goto_7

    :goto_8
    iget-object v1, v0, Lot2/o;->b:Ljt2/q;

    invoke-static {v5}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v3

    invoke-virtual {v1, v2, v3}, Ljt2/q;->a(Lcom/whoop/weeklyplan/customizeplan/domain/api/WeeklyPlanCustomizationScreenModel;Ljava/lang/Float;)D

    move-result-wide v13

    iget-object v1, v0, Lot2/o;->b:Ljt2/q;

    invoke-static {v5}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v3

    invoke-virtual {v1, v2, v3}, Ljt2/q;->a(Lcom/whoop/weeklyplan/customizeplan/domain/api/WeeklyPlanCustomizationScreenModel;Ljava/lang/Float;)D

    move-result-wide v11

    invoke-static {v11, v12}, Ljava/lang/String;->valueOf(D)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v2}, Lcom/whoop/weeklyplan/customizeplan/domain/api/WeeklyPlanCustomizationScreenModel;->getGoal()Lcom/whoop/weeklyplan/customizeplan/domain/api/TargetGoalType;

    move-result-object v3

    invoke-static {v1, v3}, Lot2/v;->b(Ljava/lang/String;Lcom/whoop/weeklyplan/customizeplan/domain/api/TargetGoalType;)Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v15

    invoke-virtual {v2}, Lcom/whoop/weeklyplan/customizeplan/domain/api/WeeklyPlanCustomizationScreenModel;->getSlider()Lcom/whoop/weeklyplan/customizeplan/domain/api/SliderContent;

    move-result-object v1

    if-eqz v1, :cond_e

    invoke-virtual {v1}, Lcom/whoop/weeklyplan/customizeplan/domain/api/SliderContent;->getValueUnits()Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_e

    invoke-static {v1}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v1

    move-object/from16 v16, v1

    goto :goto_9

    :cond_e
    move-object/from16 v16, v4

    :goto_9
    invoke-virtual {v2}, Lcom/whoop/weeklyplan/customizeplan/domain/api/WeeklyPlanCustomizationScreenModel;->getSlider()Lcom/whoop/weeklyplan/customizeplan/domain/api/SliderContent;

    move-result-object v1

    if-eqz v1, :cond_f

    invoke-virtual {v1}, Lcom/whoop/weeklyplan/customizeplan/domain/api/SliderContent;->getValueLabel()Ljava/lang/String;

    move-result-object v1

    goto :goto_a

    :cond_f
    move-object v1, v4

    :goto_a
    invoke-static {v1}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v17

    sget-object v1, Lot2/o$c;->w:Lot2/o$c;

    invoke-static {v1}, Ly81/g;->a(Lkotlin/jvm/functions/Function1;)Ly81/e;

    move-result-object v26

    invoke-virtual {v2}, Lcom/whoop/weeklyplan/customizeplan/domain/api/WeeklyPlanCustomizationScreenModel;->getSlider()Lcom/whoop/weeklyplan/customizeplan/domain/api/SliderContent;

    move-result-object v1

    if-eqz v1, :cond_10

    invoke-virtual {v1}, Lcom/whoop/weeklyplan/customizeplan/domain/api/SliderContent;->getValue()D

    move-result-wide v11

    double-to-float v1, v11

    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v1

    goto :goto_b

    :cond_10
    move-object v1, v4

    :goto_b
    invoke-direct {v0, v1}, Lot2/o;->b(Ljava/lang/Float;)Ly81/e;

    move-result-object v24

    sget-object v23, Lbu2/c0;->WEIGHT:Lbu2/c0;

    invoke-virtual {v2}, Lcom/whoop/weeklyplan/customizeplan/domain/api/WeeklyPlanCustomizationScreenModel;->getSlider()Lcom/whoop/weeklyplan/customizeplan/domain/api/SliderContent;

    move-result-object v1

    if-eqz v1, :cond_12

    invoke-virtual {v1}, Lcom/whoop/weeklyplan/customizeplan/domain/api/SliderContent;->getAverageLine()Lcom/whoop/weeklyplan/customizeplan/domain/api/AverageLine;

    move-result-object v1

    if-eqz v1, :cond_12

    new-instance v27, Lbu2/h;

    invoke-static {v7}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v29

    invoke-static {v6}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v30

    sget-object v3, Lot2/o$d;->w:Lot2/o$d;

    invoke-static {v3}, Ly81/g;->a(Lkotlin/jvm/functions/Function1;)Ly81/e;

    move-result-object v31

    sget-object v3, Lot2/o$e;->w:Lot2/o$e;

    invoke-static {v3}, Ly81/g;->a(Lkotlin/jvm/functions/Function1;)Ly81/e;

    move-result-object v35

    invoke-static {}, Lb91/e;->e()Lb91/d;

    move-result-object v3

    invoke-virtual {v3}, Lb91/d;->C()Lb91/a;

    move-result-object v32

    invoke-static {}, Lb91/e;->e()Lb91/d;

    move-result-object v3

    invoke-virtual {v3}, Lb91/d;->D()Lb91/a;

    move-result-object v33

    invoke-virtual {v1}, Lcom/whoop/weeklyplan/customizeplan/domain/api/AverageLine;->getSubtitle()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v34

    sget-object v37, Lb2/e;->M:Lb2/k;

    new-instance v28, Lbu2/a;

    const/16 v39, 0x280

    const/16 v40, 0x0

    const/16 v36, 0x0

    const/16 v38, 0x0

    invoke-direct/range {v28 .. v40}, Lbu2/a;-><init>(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ly81/e;Lb91/a;Lb91/a;Lcom/whoop/design/util/TextResource;Ly81/e;Lb91/a;Lb2/f;Lbu2/c;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {v1}, Lcom/whoop/weeklyplan/customizeplan/domain/api/AverageLine;->getPositionOnSlider()Ljava/lang/Float;

    move-result-object v1

    if-eqz v1, :cond_11

    invoke-virtual {v1}, Ljava/lang/Float;->floatValue()F

    move-result v1

    :goto_c
    move/from16 v29, v1

    goto :goto_d

    :cond_11
    const/high16 v1, 0x3f000000    # 0.5f

    goto :goto_c

    :goto_d
    sget-wide v30, Li2/x;->f:J

    const/16 v32, 0x0

    invoke-direct/range {v27 .. v32}, Lbu2/h;-><init>(Lbu2/a;FJLkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object/from16 v21, v27

    goto :goto_e

    :cond_12
    move-object/from16 v21, v4

    :goto_e
    invoke-virtual {v2}, Lcom/whoop/weeklyplan/customizeplan/domain/api/WeeklyPlanCustomizationScreenModel;->getSlider()Lcom/whoop/weeklyplan/customizeplan/domain/api/SliderContent;

    move-result-object v1

    if-eqz v1, :cond_13

    invoke-virtual {v1}, Lcom/whoop/weeklyplan/customizeplan/domain/api/SliderContent;->getTopText()Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_13

    invoke-static {v1}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v1

    move-object/from16 v18, v1

    goto :goto_f

    :cond_13
    move-object/from16 v18, v4

    :goto_f
    invoke-virtual {v2}, Lcom/whoop/weeklyplan/customizeplan/domain/api/WeeklyPlanCustomizationScreenModel;->getSlider()Lcom/whoop/weeklyplan/customizeplan/domain/api/SliderContent;

    move-result-object v1

    if-eqz v1, :cond_14

    invoke-virtual {v1}, Lcom/whoop/weeklyplan/customizeplan/domain/api/SliderContent;->getBottomText()Ljava/lang/String;

    move-result-object v1

    if-eqz v1, :cond_14

    invoke-static {v1}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v1

    move-object/from16 v19, v1

    goto :goto_10

    :cond_14
    move-object/from16 v19, v4

    :goto_10
    invoke-virtual {v2}, Lcom/whoop/weeklyplan/customizeplan/domain/api/WeeklyPlanCustomizationScreenModel;->getSlider()Lcom/whoop/weeklyplan/customizeplan/domain/api/SliderContent;

    move-result-object v1

    if-eqz v1, :cond_15

    invoke-virtual {v1}, Lcom/whoop/weeklyplan/customizeplan/domain/api/SliderContent;->getIncrement()D

    move-result-wide v3

    invoke-static {v3, v4}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v4

    :cond_15
    move-object/from16 v25, v4

    new-instance v11, Lbu2/d;

    const/16 v27, 0x200

    const/16 v28, 0x0

    move-object v1, v9

    move-object v9, v11

    const/4 v11, 0x0

    const/high16 v12, 0x3f800000    # 1.0f

    const/16 v20, 0x0

    invoke-direct/range {v9 .. v28}, Lbu2/d;-><init>(FFFDLcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lbu2/k;Lbu2/h;Ljava/util/List;Lbu2/c0;Ly81/e;Ljava/lang/Double;Ly81/e;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    iget-object v3, v0, Lot2/o;->b:Ljt2/q;

    invoke-static {v5}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v4

    invoke-virtual {v3, v2, v4}, Ljt2/q;->a(Lcom/whoop/weeklyplan/customizeplan/domain/api/WeeklyPlanCustomizationScreenModel;Ljava/lang/Float;)D

    move-result-wide v13

    new-instance v15, Lws2/g;

    const/16 v19, 0x7

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    invoke-direct/range {v15 .. v20}, Lws2/g;-><init>(IIZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {v2}, Lcom/whoop/weeklyplan/customizeplan/domain/api/WeeklyPlanCustomizationScreenModel;->getContinueButtonDisplay()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v12

    move-object v11, v9

    move-object v9, v8

    new-instance v8, Lot2/t;

    const/16 v17, 0x0

    move-object v10, v1

    invoke-direct/range {v8 .. v17}, Lot2/t;-><init>(Lcom/whoop/weeklyplan/customizeplan/domain/api/TargetGoalType;Lys2/f;Lbu2/d;Lcom/whoop/design/util/TextResource;DLws2/g;ZLys2/c;)V

    return-object v8
.end method
