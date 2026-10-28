.class public final Lzs2/q;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0008\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\'\u0010\u000c\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u000b\u0012\u0006\u0012\u0004\u0018\u00010\u000b0\n2\u0006\u0010\t\u001a\u00020\u0008H\u0002\u00a2\u0006\u0004\u0008\u000c\u0010\rJ\u0019\u0010\u0011\u001a\u00020\u00102\u0008\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0002\u00a2\u0006\u0004\u0008\u0011\u0010\u0012J/\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u0014\u001a\u00020\u00132\u0006\u0010\t\u001a\u00020\u00082\u0006\u0010\u0016\u001a\u00020\u00152\u0008\u0008\u0002\u0010\u0018\u001a\u00020\u0017\u00a2\u0006\u0004\u0008\u001a\u0010\u001bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u000c\u0010\u001cR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0011\u0010\u001d\u00a8\u0006\u001e"
    }
    d2 = {
        "Lzs2/q;",
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
        "Ljava/util/UUID;",
        "planId",
        "Lws2/g;",
        "progress",
        "",
        "showLoading",
        "Lys2/e;",
        "c",
        "(Ljava/util/UUID;Lcom/whoop/weeklyplan/customizeplan/domain/api/WeeklyPlanCustomizationScreenModel;Lws2/g;Z)Lys2/e;",
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

    iput-object p1, p0, Lzs2/q;->a:Lzs2/g;

    iput-object p2, p0, Lzs2/q;->b:Ljt2/q;

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
    sget-object p1, Lzs2/q$b;->w:Lzs2/q$b;

    invoke-static {p1}, Ly81/g;->a(Lkotlin/jvm/functions/Function1;)Ly81/e;

    move-result-object p1

    return-object p1

    :cond_1
    :goto_0
    sget-object p1, Lzs2/q$a;->w:Lzs2/q$a;

    invoke-static {p1}, Ly81/g;->a(Lkotlin/jvm/functions/Function1;)Ly81/e;

    move-result-object p1

    return-object p1
.end method


# virtual methods
.method public final c(Ljava/util/UUID;Lcom/whoop/weeklyplan/customizeplan/domain/api/WeeklyPlanCustomizationScreenModel;Lws2/g;Z)Lys2/e;
    .locals 44

    move-object/from16 v0, p0

    move-object/from16 v1, p2

    const-string v2, "planId"

    move-object/from16 v3, p1

    invoke-static {v3, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "model"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "progress"

    move-object/from16 v11, p3

    invoke-static {v11, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {v0, v1}, Lzs2/q;->a(Lcom/whoop/weeklyplan/customizeplan/domain/api/WeeklyPlanCustomizationScreenModel;)Ll83/k;

    move-result-object v2

    iget-object v4, v2, Ll83/k;->w:Ljava/lang/Object;

    check-cast v4, Ljava/lang/String;

    iget-object v2, v2, Ll83/k;->x:Ljava/lang/Object;

    check-cast v2, Ljava/lang/String;

    iget-object v12, v0, Lzs2/q;->a:Lzs2/g;

    invoke-virtual {v1}, Lcom/whoop/weeklyplan/customizeplan/domain/api/WeeklyPlanCustomizationScreenModel;->getSlider()Lcom/whoop/weeklyplan/customizeplan/domain/api/SliderContent;

    move-result-object v5

    const/4 v6, 0x0

    if-eqz v5, :cond_0

    invoke-virtual {v5}, Lcom/whoop/weeklyplan/customizeplan/domain/api/SliderContent;->getRangeContent()Ljava/util/List;

    move-result-object v5

    move-object v13, v5

    goto :goto_0

    :cond_0
    move-object v13, v6

    :goto_0
    invoke-virtual {v1}, Lcom/whoop/weeklyplan/customizeplan/domain/api/WeeklyPlanCustomizationScreenModel;->getSlider()Lcom/whoop/weeklyplan/customizeplan/domain/api/SliderContent;

    move-result-object v5

    if-eqz v5, :cond_1

    invoke-virtual {v5}, Lcom/whoop/weeklyplan/customizeplan/domain/api/SliderContent;->getIncrement()D

    move-result-wide v7

    invoke-static {v7, v8}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v5

    move-object v14, v5

    goto :goto_1

    :cond_1
    move-object v14, v6

    :goto_1
    const/16 v17, 0xc

    const/16 v18, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    invoke-static/range {v12 .. v18}, Lzs2/g;->d(Lzs2/g;Ljava/util/List;Ljava/lang/Double;Lcom/whoop/data/remote/domain/dto/BoundType;Ly81/f;ILjava/lang/Object;)Ljava/util/List;

    move-result-object v5

    if-nez v5, :cond_2

    sget-object v5, Lm83/y;->w:Lm83/y;

    :cond_2
    move-object/from16 v25, v5

    invoke-virtual {v3}, Ljava/util/UUID;->toString()Ljava/lang/String;

    move-result-object v3

    const-string v5, "toString(...)"

    invoke-static {v3, v5}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v5, Lcom/whoop/weeklyplan/customizeplan/domain/api/TargetGoalType;->WEIGHT:Lcom/whoop/weeklyplan/customizeplan/domain/api/TargetGoalType;

    new-instance v7, Lys2/f;

    invoke-virtual {v1}, Lcom/whoop/weeklyplan/customizeplan/domain/api/WeeklyPlanCustomizationScreenModel;->getNavigationTitleDisplay()Ljava/lang/String;

    move-result-object v8

    invoke-static {v8}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v8

    invoke-virtual {v1}, Lcom/whoop/weeklyplan/customizeplan/domain/api/WeeklyPlanCustomizationScreenModel;->getNavigationSubtitleDisplay()Ljava/lang/String;

    move-result-object v9

    invoke-static {v9}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v9

    invoke-virtual {v1}, Lcom/whoop/weeklyplan/customizeplan/domain/api/WeeklyPlanCustomizationScreenModel;->getTitle()Ljava/lang/String;

    move-result-object v10

    invoke-static {v10}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v10

    invoke-virtual {v1}, Lcom/whoop/weeklyplan/customizeplan/domain/api/WeeklyPlanCustomizationScreenModel;->getDescription()Ljava/lang/String;

    move-result-object v12

    invoke-static {v12}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v12

    invoke-direct {v7, v8, v9, v10, v12}, Lys2/f;-><init>(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;)V

    invoke-virtual {v1}, Lcom/whoop/weeklyplan/customizeplan/domain/api/WeeklyPlanCustomizationScreenModel;->getSlider()Lcom/whoop/weeklyplan/customizeplan/domain/api/SliderContent;

    move-result-object v8

    if-eqz v8, :cond_3

    invoke-virtual {v8}, Lcom/whoop/weeklyplan/customizeplan/domain/api/SliderContent;->getValue()D

    move-result-wide v8

    double-to-float v8, v8

    :goto_2
    move v13, v8

    goto :goto_3

    :cond_3
    const/4 v8, 0x0

    goto :goto_2

    :goto_3
    iget-object v8, v0, Lzs2/q;->b:Ljt2/q;

    const/4 v9, 0x2

    invoke-static {v8, v1, v6, v9, v6}, Ljt2/q;->b(Ljt2/q;Lcom/whoop/weeklyplan/customizeplan/domain/api/WeeklyPlanCustomizationScreenModel;Ljava/lang/Float;ILjava/lang/Object;)D

    move-result-wide v16

    iget-object v8, v0, Lzs2/q;->b:Ljt2/q;

    invoke-static {v8, v1, v6, v9, v6}, Ljt2/q;->b(Ljt2/q;Lcom/whoop/weeklyplan/customizeplan/domain/api/WeeklyPlanCustomizationScreenModel;Ljava/lang/Float;ILjava/lang/Object;)D

    move-result-wide v14

    invoke-static {v14, v15}, Ljava/lang/String;->valueOf(D)Ljava/lang/String;

    move-result-object v8

    invoke-static {v8, v5}, Lot2/v;->b(Ljava/lang/String;Lcom/whoop/weeklyplan/customizeplan/domain/api/TargetGoalType;)Ljava/lang/String;

    move-result-object v8

    invoke-static {v8}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v18

    invoke-virtual {v1}, Lcom/whoop/weeklyplan/customizeplan/domain/api/WeeklyPlanCustomizationScreenModel;->getSlider()Lcom/whoop/weeklyplan/customizeplan/domain/api/SliderContent;

    move-result-object v8

    if-eqz v8, :cond_4

    invoke-virtual {v8}, Lcom/whoop/weeklyplan/customizeplan/domain/api/SliderContent;->getValueUnits()Ljava/lang/String;

    move-result-object v8

    if-eqz v8, :cond_4

    invoke-static {v8}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v8

    move-object/from16 v19, v8

    goto :goto_4

    :cond_4
    move-object/from16 v19, v6

    :goto_4
    invoke-virtual {v1}, Lcom/whoop/weeklyplan/customizeplan/domain/api/WeeklyPlanCustomizationScreenModel;->getSlider()Lcom/whoop/weeklyplan/customizeplan/domain/api/SliderContent;

    move-result-object v8

    if-eqz v8, :cond_5

    invoke-virtual {v8}, Lcom/whoop/weeklyplan/customizeplan/domain/api/SliderContent;->getValueLabel()Ljava/lang/String;

    move-result-object v8

    goto :goto_5

    :cond_5
    move-object v8, v6

    :goto_5
    invoke-static {v8}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v20

    sget-object v8, Lzs2/q$c;->w:Lzs2/q$c;

    invoke-static {v8}, Ly81/g;->a(Lkotlin/jvm/functions/Function1;)Ly81/e;

    move-result-object v29

    invoke-virtual {v1}, Lcom/whoop/weeklyplan/customizeplan/domain/api/WeeklyPlanCustomizationScreenModel;->getSlider()Lcom/whoop/weeklyplan/customizeplan/domain/api/SliderContent;

    move-result-object v8

    if-eqz v8, :cond_6

    invoke-virtual {v8}, Lcom/whoop/weeklyplan/customizeplan/domain/api/SliderContent;->getValue()D

    move-result-wide v14

    double-to-float v8, v14

    invoke-static {v8}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v8

    goto :goto_6

    :cond_6
    move-object v8, v6

    :goto_6
    invoke-direct {v0, v8}, Lzs2/q;->b(Ljava/lang/Float;)Ly81/e;

    move-result-object v27

    invoke-virtual {v1}, Lcom/whoop/weeklyplan/customizeplan/domain/api/WeeklyPlanCustomizationScreenModel;->getSlider()Lcom/whoop/weeklyplan/customizeplan/domain/api/SliderContent;

    move-result-object v8

    if-eqz v8, :cond_8

    invoke-virtual {v8}, Lcom/whoop/weeklyplan/customizeplan/domain/api/SliderContent;->getAverageLine()Lcom/whoop/weeklyplan/customizeplan/domain/api/AverageLine;

    move-result-object v8

    if-eqz v8, :cond_8

    new-instance v30, Lbu2/h;

    invoke-static {v4}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v32

    invoke-static {v2}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v33

    sget-object v2, Lzs2/q$d;->w:Lzs2/q$d;

    invoke-static {v2}, Ly81/g;->a(Lkotlin/jvm/functions/Function1;)Ly81/e;

    move-result-object v34

    sget-object v2, Lzs2/q$e;->w:Lzs2/q$e;

    invoke-static {v2}, Ly81/g;->a(Lkotlin/jvm/functions/Function1;)Ly81/e;

    move-result-object v38

    invoke-static {}, Lb91/e;->e()Lb91/d;

    move-result-object v2

    invoke-virtual {v2}, Lb91/d;->C()Lb91/a;

    move-result-object v35

    invoke-static {}, Lb91/e;->e()Lb91/d;

    move-result-object v2

    invoke-virtual {v2}, Lb91/d;->D()Lb91/a;

    move-result-object v36

    invoke-virtual {v8}, Lcom/whoop/weeklyplan/customizeplan/domain/api/AverageLine;->getSubtitle()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v37

    sget-object v40, Lb2/e;->M:Lb2/k;

    new-instance v31, Lbu2/a;

    const/16 v42, 0x280

    const/16 v43, 0x0

    const/16 v39, 0x0

    const/16 v41, 0x0

    invoke-direct/range {v31 .. v43}, Lbu2/a;-><init>(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ly81/e;Lb91/a;Lb91/a;Lcom/whoop/design/util/TextResource;Ly81/e;Lb91/a;Lb2/f;Lbu2/c;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {v8}, Lcom/whoop/weeklyplan/customizeplan/domain/api/AverageLine;->getPositionOnSlider()Ljava/lang/Float;

    move-result-object v2

    if-eqz v2, :cond_7

    invoke-virtual {v2}, Ljava/lang/Float;->floatValue()F

    move-result v2

    :goto_7
    move/from16 v32, v2

    goto :goto_8

    :cond_7
    const/high16 v2, 0x3f000000    # 0.5f

    goto :goto_7

    :goto_8
    sget-wide v33, Li2/x;->f:J

    const/16 v35, 0x0

    invoke-direct/range {v30 .. v35}, Lbu2/h;-><init>(Lbu2/a;FJLkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object/from16 v24, v30

    goto :goto_9

    :cond_8
    move-object/from16 v24, v6

    :goto_9
    invoke-virtual {v1}, Lcom/whoop/weeklyplan/customizeplan/domain/api/WeeklyPlanCustomizationScreenModel;->getSlider()Lcom/whoop/weeklyplan/customizeplan/domain/api/SliderContent;

    move-result-object v2

    if-eqz v2, :cond_9

    invoke-virtual {v2}, Lcom/whoop/weeklyplan/customizeplan/domain/api/SliderContent;->getTopText()Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_9

    invoke-static {v2}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v2

    move-object/from16 v21, v2

    goto :goto_a

    :cond_9
    move-object/from16 v21, v6

    :goto_a
    invoke-virtual {v1}, Lcom/whoop/weeklyplan/customizeplan/domain/api/WeeklyPlanCustomizationScreenModel;->getSlider()Lcom/whoop/weeklyplan/customizeplan/domain/api/SliderContent;

    move-result-object v2

    if-eqz v2, :cond_a

    invoke-virtual {v2}, Lcom/whoop/weeklyplan/customizeplan/domain/api/SliderContent;->getBottomText()Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_a

    invoke-static {v2}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v2

    move-object/from16 v22, v2

    goto :goto_b

    :cond_a
    move-object/from16 v22, v6

    :goto_b
    invoke-virtual {v1}, Lcom/whoop/weeklyplan/customizeplan/domain/api/WeeklyPlanCustomizationScreenModel;->getSlider()Lcom/whoop/weeklyplan/customizeplan/domain/api/SliderContent;

    move-result-object v2

    if-eqz v2, :cond_b

    invoke-virtual {v2}, Lcom/whoop/weeklyplan/customizeplan/domain/api/SliderContent;->getIncrement()D

    move-result-wide v14

    invoke-static {v14, v15}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v2

    move-object/from16 v28, v2

    goto :goto_c

    :cond_b
    move-object/from16 v28, v6

    :goto_c
    new-instance v12, Lbu2/d;

    const/16 v30, 0x1200

    const/16 v31, 0x0

    const/4 v14, 0x0

    const/high16 v15, 0x3f800000    # 1.0f

    const/16 v23, 0x0

    const/16 v26, 0x0

    invoke-direct/range {v12 .. v31}, Lbu2/d;-><init>(FFFDLcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lbu2/k;Lbu2/h;Ljava/util/List;Lbu2/c0;Ly81/e;Ljava/lang/Double;Ly81/e;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {v1}, Lcom/whoop/weeklyplan/customizeplan/domain/api/WeeklyPlanCustomizationScreenModel;->getContinueButtonDisplay()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v14

    invoke-virtual {v1}, Lcom/whoop/weeklyplan/customizeplan/domain/api/WeeklyPlanCustomizationScreenModel;->getSkipButtonDisplay()Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_c

    invoke-static {v2}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v2

    move-object/from16 v16, v2

    goto :goto_d

    :cond_c
    move-object/from16 v16, v6

    :goto_d
    new-instance v13, Lys2/b;

    const/4 v15, 0x0

    const/16 v18, 0x2

    const/16 v19, 0x0

    move/from16 v17, p4

    invoke-direct/range {v13 .. v19}, Lys2/b;-><init>(Lcom/whoop/design/util/TextResource;ZLcom/whoop/design/util/TextResource;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    iget-object v2, v0, Lzs2/q;->b:Ljt2/q;

    invoke-static {v2, v1, v6, v9, v6}, Ljt2/q;->b(Ljt2/q;Lcom/whoop/weeklyplan/customizeplan/domain/api/WeeklyPlanCustomizationScreenModel;Ljava/lang/Float;ILjava/lang/Object;)D

    move-result-wide v9

    invoke-virtual {v1}, Lcom/whoop/weeklyplan/customizeplan/domain/api/WeeklyPlanCustomizationScreenModel;->getSmartAlarmOverride()Lcom/whoop/weeklyplan/customizeplan/domain/api/SmartAlarmOverride;

    move-result-object v1

    if-eqz v1, :cond_d

    new-instance v6, Lys2/c;

    invoke-virtual {v1}, Lcom/whoop/weeklyplan/customizeplan/domain/api/SmartAlarmOverride;->getTitle()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v2

    invoke-virtual {v1}, Lcom/whoop/weeklyplan/customizeplan/domain/api/SmartAlarmOverride;->getDescription()Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v4

    invoke-virtual {v1}, Lcom/whoop/weeklyplan/customizeplan/domain/api/SmartAlarmOverride;->getButtonConfirmTitle()Ljava/lang/String;

    move-result-object v8

    invoke-static {v8}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v8

    invoke-virtual {v1}, Lcom/whoop/weeklyplan/customizeplan/domain/api/SmartAlarmOverride;->getButtonRejectTitle()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v1

    invoke-direct {v6, v2, v4, v8, v1}, Lys2/c;-><init>(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;)V

    :cond_d
    move-object v4, v3

    new-instance v3, Lys2/e$q;

    move-object v8, v12

    move-object v12, v6

    move-object v6, v7

    move-object v7, v8

    move-object v8, v13

    invoke-direct/range {v3 .. v12}, Lys2/e$q;-><init>(Ljava/lang/String;Lcom/whoop/weeklyplan/customizeplan/domain/api/TargetGoalType;Lys2/f;Lbu2/d;Lys2/b;DLws2/g;Lys2/c;)V

    return-object v3
.end method
