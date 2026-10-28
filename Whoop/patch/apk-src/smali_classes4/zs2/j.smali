.class public final Lzs2/j;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0008\u0008\u0007\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u00a2\u0006\u0004\u0008\u0008\u0010\tJ/\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\r\u001a\u00020\u000c2\u0006\u0010\u000f\u001a\u00020\u000e2\u0008\u0008\u0002\u0010\u0011\u001a\u00020\u0010\u00a2\u0006\u0004\u0008\u0013\u0010\u0014R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0013\u0010\u0015R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0016\u0010\u0017R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0018\u0010\u0019\u00a8\u0006\u001a"
    }
    d2 = {
        "Lzs2/j;",
        "",
        "Lzs2/g;",
        "rangeContentReducer",
        "Ljt2/q;",
        "metricSliderMatcher",
        "Lzs2/h;",
        "recommendedRangeMapper",
        "<init>",
        "(Lzs2/g;Ljt2/q;Lzs2/h;)V",
        "Ljava/util/UUID;",
        "planId",
        "Lcom/whoop/weeklyplan/customizeplan/domain/api/WeeklyPlanCustomizationScreenModel;",
        "model",
        "Lws2/g;",
        "progress",
        "",
        "showLoading",
        "Lys2/e;",
        "a",
        "(Ljava/util/UUID;Lcom/whoop/weeklyplan/customizeplan/domain/api/WeeklyPlanCustomizationScreenModel;Lws2/g;Z)Lys2/e;",
        "Lzs2/g;",
        "b",
        "Ljt2/q;",
        "c",
        "Lzs2/h;",
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

.field private final c:Lzs2/h;


# direct methods
.method public constructor <init>(Lzs2/g;Ljt2/q;Lzs2/h;)V
    .locals 1

    const-string v0, "rangeContentReducer"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "metricSliderMatcher"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "recommendedRangeMapper"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lzs2/j;->a:Lzs2/g;

    iput-object p2, p0, Lzs2/j;->b:Ljt2/q;

    iput-object p3, p0, Lzs2/j;->c:Lzs2/h;

    return-void
.end method


# virtual methods
.method public final a(Ljava/util/UUID;Lcom/whoop/weeklyplan/customizeplan/domain/api/WeeklyPlanCustomizationScreenModel;Lws2/g;Z)Lys2/e;
    .locals 37

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

    invoke-virtual {v3}, Ljava/util/UUID;->toString()Ljava/lang/String;

    move-result-object v4

    const-string v2, "toString(...)"

    invoke-static {v4, v2}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v5, Lcom/whoop/weeklyplan/customizeplan/domain/api/TargetGoalType;->SLEEP_CONSISTENCY:Lcom/whoop/weeklyplan/customizeplan/domain/api/TargetGoalType;

    new-instance v6, Lys2/f;

    invoke-virtual {v1}, Lcom/whoop/weeklyplan/customizeplan/domain/api/WeeklyPlanCustomizationScreenModel;->getNavigationTitleDisplay()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v2

    invoke-virtual {v1}, Lcom/whoop/weeklyplan/customizeplan/domain/api/WeeklyPlanCustomizationScreenModel;->getNavigationSubtitleDisplay()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v3

    invoke-virtual {v1}, Lcom/whoop/weeklyplan/customizeplan/domain/api/WeeklyPlanCustomizationScreenModel;->getTitle()Ljava/lang/String;

    move-result-object v7

    invoke-static {v7}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v7

    invoke-virtual {v1}, Lcom/whoop/weeklyplan/customizeplan/domain/api/WeeklyPlanCustomizationScreenModel;->getDescription()Ljava/lang/String;

    move-result-object v8

    invoke-static {v8}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v8

    invoke-direct {v6, v2, v3, v7, v8}, Lys2/f;-><init>(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;)V

    invoke-virtual {v1}, Lcom/whoop/weeklyplan/customizeplan/domain/api/WeeklyPlanCustomizationScreenModel;->getSlider()Lcom/whoop/weeklyplan/customizeplan/domain/api/SliderContent;

    move-result-object v2

    if-eqz v2, :cond_0

    invoke-virtual {v2}, Lcom/whoop/weeklyplan/customizeplan/domain/api/SliderContent;->getValue()D

    move-result-wide v2

    double-to-float v2, v2

    :goto_0
    move v13, v2

    goto :goto_1

    :cond_0
    const/4 v2, 0x0

    goto :goto_0

    :goto_1
    invoke-virtual {v1}, Lcom/whoop/weeklyplan/customizeplan/domain/api/WeeklyPlanCustomizationScreenModel;->getSlider()Lcom/whoop/weeklyplan/customizeplan/domain/api/SliderContent;

    move-result-object v2

    if-eqz v2, :cond_1

    invoke-virtual {v2}, Lcom/whoop/weeklyplan/customizeplan/domain/api/SliderContent;->getUsableRange()Lcom/whoop/weeklyplan/customizeplan/domain/api/Range;

    move-result-object v2

    if-eqz v2, :cond_1

    invoke-virtual {v2}, Lcom/whoop/weeklyplan/customizeplan/domain/api/Range;->getMin()D

    move-result-wide v2

    goto :goto_2

    :cond_1
    const-wide/16 v2, 0x0

    :goto_2
    invoke-virtual {v1}, Lcom/whoop/weeklyplan/customizeplan/domain/api/WeeklyPlanCustomizationScreenModel;->getSlider()Lcom/whoop/weeklyplan/customizeplan/domain/api/SliderContent;

    move-result-object v7

    const-wide/high16 v8, 0x3ff0000000000000L    # 1.0

    if-eqz v7, :cond_2

    invoke-virtual {v7}, Lcom/whoop/weeklyplan/customizeplan/domain/api/SliderContent;->getUsableRange()Lcom/whoop/weeklyplan/customizeplan/domain/api/Range;

    move-result-object v7

    if-eqz v7, :cond_2

    invoke-virtual {v7}, Lcom/whoop/weeklyplan/customizeplan/domain/api/Range;->getMax()D

    move-result-wide v14

    goto :goto_3

    :cond_2
    move-wide v14, v8

    :goto_3
    div-double/2addr v2, v14

    double-to-float v14, v2

    invoke-virtual {v1}, Lcom/whoop/weeklyplan/customizeplan/domain/api/WeeklyPlanCustomizationScreenModel;->getSlider()Lcom/whoop/weeklyplan/customizeplan/domain/api/SliderContent;

    move-result-object v2

    if-eqz v2, :cond_3

    invoke-virtual {v2}, Lcom/whoop/weeklyplan/customizeplan/domain/api/SliderContent;->getUsableRange()Lcom/whoop/weeklyplan/customizeplan/domain/api/Range;

    move-result-object v2

    if-eqz v2, :cond_3

    invoke-virtual {v2}, Lcom/whoop/weeklyplan/customizeplan/domain/api/Range;->getMax()D

    move-result-wide v2

    goto :goto_4

    :cond_3
    move-wide v2, v8

    :goto_4
    invoke-virtual {v1}, Lcom/whoop/weeklyplan/customizeplan/domain/api/WeeklyPlanCustomizationScreenModel;->getSlider()Lcom/whoop/weeklyplan/customizeplan/domain/api/SliderContent;

    move-result-object v7

    if-eqz v7, :cond_4

    invoke-virtual {v7}, Lcom/whoop/weeklyplan/customizeplan/domain/api/SliderContent;->getUsableRange()Lcom/whoop/weeklyplan/customizeplan/domain/api/Range;

    move-result-object v7

    if-eqz v7, :cond_4

    invoke-virtual {v7}, Lcom/whoop/weeklyplan/customizeplan/domain/api/Range;->getMax()D

    move-result-wide v8

    :cond_4
    div-double/2addr v2, v8

    double-to-float v15, v2

    iget-object v2, v0, Lzs2/j;->b:Ljt2/q;

    const/4 v3, 0x0

    const/4 v7, 0x2

    invoke-static {v2, v1, v3, v7, v3}, Ljt2/q;->b(Ljt2/q;Lcom/whoop/weeklyplan/customizeplan/domain/api/WeeklyPlanCustomizationScreenModel;Ljava/lang/Float;ILjava/lang/Object;)D

    move-result-wide v16

    iget-object v2, v0, Lzs2/j;->b:Ljt2/q;

    invoke-static {v2, v1, v3, v7, v3}, Ljt2/q;->b(Ljt2/q;Lcom/whoop/weeklyplan/customizeplan/domain/api/WeeklyPlanCustomizationScreenModel;Ljava/lang/Float;ILjava/lang/Object;)D

    move-result-wide v8

    invoke-static {v8, v9}, Ljava/lang/String;->valueOf(D)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2, v5}, Lot2/v;->b(Ljava/lang/String;Lcom/whoop/weeklyplan/customizeplan/domain/api/TargetGoalType;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v18

    invoke-virtual {v1}, Lcom/whoop/weeklyplan/customizeplan/domain/api/WeeklyPlanCustomizationScreenModel;->getSlider()Lcom/whoop/weeklyplan/customizeplan/domain/api/SliderContent;

    move-result-object v2

    if-eqz v2, :cond_5

    invoke-virtual {v2}, Lcom/whoop/weeklyplan/customizeplan/domain/api/SliderContent;->getValueLabel()Ljava/lang/String;

    move-result-object v2

    goto :goto_5

    :cond_5
    move-object v2, v3

    :goto_5
    invoke-static {v2}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v20

    sget-object v2, Lzs2/j$a;->w:Lzs2/j$a;

    invoke-static {v2}, Ly81/g;->a(Lkotlin/jvm/functions/Function1;)Ly81/e;

    move-result-object v29

    iget-object v2, v0, Lzs2/j;->c:Lzs2/h;

    invoke-virtual {v1}, Lcom/whoop/weeklyplan/customizeplan/domain/api/WeeklyPlanCustomizationScreenModel;->getSlider()Lcom/whoop/weeklyplan/customizeplan/domain/api/SliderContent;

    move-result-object v8

    if-eqz v8, :cond_6

    invoke-virtual {v8}, Lcom/whoop/weeklyplan/customizeplan/domain/api/SliderContent;->getRecommendedRange()Lcom/whoop/weeklyplan/customizeplan/domain/api/DisplayRange;

    move-result-object v8

    goto :goto_6

    :cond_6
    move-object v8, v3

    :goto_6
    sget-object v9, Lzs2/j$b;->w:Lzs2/j$b;

    invoke-static {v9}, Ly81/g;->a(Lkotlin/jvm/functions/Function1;)Ly81/e;

    move-result-object v9

    sget-object v10, Lzs2/i;->PERCENT_RANGE_ONLY:Lzs2/i;

    invoke-virtual {v2, v8, v9, v10}, Lzs2/h;->a(Lcom/whoop/weeklyplan/customizeplan/domain/api/DisplayRange;Ly81/e;Lzs2/i;)Lbu2/k;

    move-result-object v23

    iget-object v2, v0, Lzs2/j;->a:Lzs2/g;

    invoke-virtual {v1}, Lcom/whoop/weeklyplan/customizeplan/domain/api/WeeklyPlanCustomizationScreenModel;->getSlider()Lcom/whoop/weeklyplan/customizeplan/domain/api/SliderContent;

    move-result-object v8

    if-eqz v8, :cond_7

    invoke-virtual {v8}, Lcom/whoop/weeklyplan/customizeplan/domain/api/SliderContent;->getRangeContent()Ljava/util/List;

    move-result-object v8

    move-object/from16 v31, v8

    goto :goto_7

    :cond_7
    move-object/from16 v31, v3

    :goto_7
    sget-object v33, Lcom/whoop/data/remote/domain/dto/BoundType;->CLOSED:Lcom/whoop/data/remote/domain/dto/BoundType;

    const/16 v35, 0xa

    const/16 v36, 0x0

    const/16 v32, 0x0

    const/16 v34, 0x0

    move-object/from16 v30, v2

    invoke-static/range {v30 .. v36}, Lzs2/g;->d(Lzs2/g;Ljava/util/List;Ljava/lang/Double;Lcom/whoop/data/remote/domain/dto/BoundType;Ly81/f;ILjava/lang/Object;)Ljava/util/List;

    move-result-object v2

    if-nez v2, :cond_8

    sget-object v2, Lm83/y;->w:Lm83/y;

    :cond_8
    move-object/from16 v25, v2

    new-instance v12, Lbu2/d;

    const/16 v30, 0x75a0

    const/16 v31, 0x0

    const/16 v19, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v24, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    const/16 v28, 0x0

    invoke-direct/range {v12 .. v31}, Lbu2/d;-><init>(FFFDLcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lbu2/k;Lbu2/h;Ljava/util/List;Lbu2/c0;Ly81/e;Ljava/lang/Double;Ly81/e;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {v1}, Lcom/whoop/weeklyplan/customizeplan/domain/api/WeeklyPlanCustomizationScreenModel;->getContinueButtonDisplay()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v14

    invoke-virtual {v1}, Lcom/whoop/weeklyplan/customizeplan/domain/api/WeeklyPlanCustomizationScreenModel;->getSkipButtonDisplay()Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_9

    invoke-static {v2}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v2

    move-object/from16 v16, v2

    goto :goto_8

    :cond_9
    move-object/from16 v16, v3

    :goto_8
    new-instance v13, Lys2/b;

    const/4 v15, 0x0

    const/16 v18, 0x2

    const/16 v19, 0x0

    move/from16 v17, p4

    invoke-direct/range {v13 .. v19}, Lys2/b;-><init>(Lcom/whoop/design/util/TextResource;ZLcom/whoop/design/util/TextResource;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    iget-object v2, v0, Lzs2/j;->b:Ljt2/q;

    invoke-static {v2, v1, v3, v7, v3}, Ljt2/q;->b(Ljt2/q;Lcom/whoop/weeklyplan/customizeplan/domain/api/WeeklyPlanCustomizationScreenModel;Ljava/lang/Float;ILjava/lang/Object;)D

    move-result-wide v9

    new-instance v3, Lys2/e$m;

    move-object v7, v12

    const/4 v12, 0x0

    move-object v8, v13

    invoke-direct/range {v3 .. v12}, Lys2/e$m;-><init>(Ljava/lang/String;Lcom/whoop/weeklyplan/customizeplan/domain/api/TargetGoalType;Lys2/f;Lbu2/d;Lys2/b;DLws2/g;Lys2/c;)V

    return-object v3
.end method
