.class public abstract Lzs2/p;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000b\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0006\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u0008\'\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u00a2\u0006\u0004\u0008\u0006\u0010\u0007J\u0017\u0010\u000b\u001a\u00020\n2\u0006\u0010\t\u001a\u00020\u0008H\u0004\u00a2\u0006\u0004\u0008\u000b\u0010\u000cJ\u001f\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\t\u001a\u00020\u00082\u0006\u0010\u000e\u001a\u00020\rH\u0004\u00a2\u0006\u0004\u0008\u0010\u0010\u0011J!\u0010\u0015\u001a\u00020\u00142\u0008\u0010\t\u001a\u0004\u0018\u00010\u00082\u0006\u0010\u0013\u001a\u00020\u0012H\u0004\u00a2\u0006\u0004\u0008\u0015\u0010\u0016J\'\u0010\u0019\u001a\u0012\u0012\u0006\u0012\u0004\u0018\u00010\u0018\u0012\u0006\u0012\u0004\u0018\u00010\u00180\u00172\u0006\u0010\t\u001a\u00020\u0008H\u0004\u00a2\u0006\u0004\u0008\u0019\u0010\u001aJ9\u0010\"\u001a\u00020!2\u0006\u0010\t\u001a\u00020\u00082\u0006\u0010\u001b\u001a\u00020\u00142\u0006\u0010\u001d\u001a\u00020\u001c2\u0008\u0010\u001e\u001a\u0004\u0018\u00010\u001c2\u0006\u0010 \u001a\u00020\u001fH\u0004\u00a2\u0006\u0004\u0008\"\u0010#R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\"\u0010$R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004\u00a2\u0006\u0006\n\u0004\u0008\u0015\u0010%\u00a8\u0006&"
    }
    d2 = {
        "Lzs2/p;",
        "",
        "Lzs2/g;",
        "rangeContentReducer",
        "Lzs2/h;",
        "recommendedRangeMapper",
        "<init>",
        "(Lzs2/g;Lzs2/h;)V",
        "Lcom/whoop/weeklyplan/customizeplan/domain/api/WeeklyPlanCustomizationScreenModel;",
        "model",
        "Lys2/f;",
        "d",
        "(Lcom/whoop/weeklyplan/customizeplan/domain/api/WeeklyPlanCustomizationScreenModel;)Lys2/f;",
        "",
        "showLoading",
        "Lys2/b;",
        "c",
        "(Lcom/whoop/weeklyplan/customizeplan/domain/api/WeeklyPlanCustomizationScreenModel;Z)Lys2/b;",
        "",
        "fill",
        "",
        "b",
        "(Lcom/whoop/weeklyplan/customizeplan/domain/api/WeeklyPlanCustomizationScreenModel;F)D",
        "Ll83/k;",
        "",
        "e",
        "(Lcom/whoop/weeklyplan/customizeplan/domain/api/WeeklyPlanCustomizationScreenModel;)Ll83/k;",
        "saveValue",
        "Lcom/whoop/design/util/TextResource;",
        "weeklyTargetValue",
        "weeklyTargetValueSuffix",
        "Ly81/f;",
        "color",
        "Lbu2/d;",
        "a",
        "(Lcom/whoop/weeklyplan/customizeplan/domain/api/WeeklyPlanCustomizationScreenModel;DLcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ly81/f;)Lbu2/d;",
        "Lzs2/g;",
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

.field private final b:Lzs2/h;


# direct methods
.method public constructor <init>(Lzs2/g;Lzs2/h;)V
    .locals 1

    const-string v0, "rangeContentReducer"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "recommendedRangeMapper"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    iput-object p1, p0, Lzs2/p;->a:Lzs2/g;

    iput-object p2, p0, Lzs2/p;->b:Lzs2/h;

    return-void
.end method


# virtual methods
.method public final a(Lcom/whoop/weeklyplan/customizeplan/domain/api/WeeklyPlanCustomizationScreenModel;DLcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ly81/f;)Lbu2/d;
    .locals 29

    move-object/from16 v0, p0

    move-object/from16 v1, p6

    const-string v2, "model"

    move-object/from16 v3, p1

    invoke-static {v3, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "weeklyTargetValue"

    move-object/from16 v7, p4

    invoke-static {v7, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "color"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual/range {p0 .. p1}, Lzs2/p;->e(Lcom/whoop/weeklyplan/customizeplan/domain/api/WeeklyPlanCustomizationScreenModel;)Ll83/k;

    move-result-object v2

    iget-object v4, v2, Ll83/k;->w:Ljava/lang/Object;

    check-cast v4, Ljava/lang/String;

    iget-object v2, v2, Ll83/k;->x:Ljava/lang/Object;

    check-cast v2, Ljava/lang/String;

    invoke-virtual {v3}, Lcom/whoop/weeklyplan/customizeplan/domain/api/WeeklyPlanCustomizationScreenModel;->getSlider()Lcom/whoop/weeklyplan/customizeplan/domain/api/SliderContent;

    move-result-object v5

    const/4 v6, 0x0

    if-eqz v5, :cond_0

    invoke-virtual {v5}, Lcom/whoop/weeklyplan/customizeplan/domain/api/SliderContent;->getTopText()Ljava/lang/String;

    move-result-object v5

    goto :goto_0

    :cond_0
    move-object v5, v6

    :goto_0
    invoke-static {v5}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v10

    invoke-virtual {v3}, Lcom/whoop/weeklyplan/customizeplan/domain/api/WeeklyPlanCustomizationScreenModel;->getSlider()Lcom/whoop/weeklyplan/customizeplan/domain/api/SliderContent;

    move-result-object v5

    if-eqz v5, :cond_1

    invoke-virtual {v5}, Lcom/whoop/weeklyplan/customizeplan/domain/api/SliderContent;->getValue()D

    move-result-wide v8

    double-to-float v5, v8

    goto :goto_1

    :cond_1
    const/4 v5, 0x0

    :goto_1
    invoke-virtual {v3}, Lcom/whoop/weeklyplan/customizeplan/domain/api/WeeklyPlanCustomizationScreenModel;->getSlider()Lcom/whoop/weeklyplan/customizeplan/domain/api/SliderContent;

    move-result-object v8

    if-eqz v8, :cond_2

    invoke-virtual {v8}, Lcom/whoop/weeklyplan/customizeplan/domain/api/SliderContent;->getValueLabel()Ljava/lang/String;

    move-result-object v8

    goto :goto_2

    :cond_2
    move-object v8, v6

    :goto_2
    invoke-static {v8}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v9

    invoke-virtual {v3}, Lcom/whoop/weeklyplan/customizeplan/domain/api/WeeklyPlanCustomizationScreenModel;->getSlider()Lcom/whoop/weeklyplan/customizeplan/domain/api/SliderContent;

    move-result-object v8

    if-eqz v8, :cond_3

    invoke-virtual {v8}, Lcom/whoop/weeklyplan/customizeplan/domain/api/SliderContent;->getBottomText()Ljava/lang/String;

    move-result-object v8

    if-eqz v8, :cond_3

    invoke-static {v8}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v8

    move-object v11, v8

    goto :goto_3

    :cond_3
    move-object v11, v6

    :goto_3
    iget-object v8, v0, Lzs2/p;->b:Lzs2/h;

    invoke-virtual {v3}, Lcom/whoop/weeklyplan/customizeplan/domain/api/WeeklyPlanCustomizationScreenModel;->getSlider()Lcom/whoop/weeklyplan/customizeplan/domain/api/SliderContent;

    move-result-object v12

    if-eqz v12, :cond_4

    invoke-virtual {v12}, Lcom/whoop/weeklyplan/customizeplan/domain/api/SliderContent;->getRecommendedRange()Lcom/whoop/weeklyplan/customizeplan/domain/api/DisplayRange;

    move-result-object v12

    goto :goto_4

    :cond_4
    move-object v12, v6

    :goto_4
    sget-object v13, Lzs2/i;->PERCENT_RANGE_ONLY:Lzs2/i;

    invoke-virtual {v8, v12, v1, v13}, Lzs2/h;->a(Lcom/whoop/weeklyplan/customizeplan/domain/api/DisplayRange;Ly81/e;Lzs2/i;)Lbu2/k;

    move-result-object v12

    iget-object v13, v0, Lzs2/p;->a:Lzs2/g;

    invoke-virtual {v3}, Lcom/whoop/weeklyplan/customizeplan/domain/api/WeeklyPlanCustomizationScreenModel;->getSlider()Lcom/whoop/weeklyplan/customizeplan/domain/api/SliderContent;

    move-result-object v8

    if-eqz v8, :cond_5

    invoke-virtual {v8}, Lcom/whoop/weeklyplan/customizeplan/domain/api/SliderContent;->getRangeContent()Ljava/util/List;

    move-result-object v8

    move-object v14, v8

    goto :goto_5

    :cond_5
    move-object v14, v6

    :goto_5
    sget-object v16, Lcom/whoop/data/remote/domain/dto/BoundType;->CLOSED:Lcom/whoop/data/remote/domain/dto/BoundType;

    const/16 v18, 0x8

    const/16 v19, 0x0

    const/4 v15, 0x0

    const/16 v17, 0x0

    invoke-static/range {v13 .. v19}, Lzs2/g;->d(Lzs2/g;Ljava/util/List;Ljava/lang/Double;Lcom/whoop/data/remote/domain/dto/BoundType;Ly81/f;ILjava/lang/Object;)Ljava/util/List;

    move-result-object v8

    if-nez v8, :cond_6

    sget-object v8, Lm83/y;->w:Lm83/y;

    :cond_6
    move-object v14, v8

    invoke-virtual {v3}, Lcom/whoop/weeklyplan/customizeplan/domain/api/WeeklyPlanCustomizationScreenModel;->getSlider()Lcom/whoop/weeklyplan/customizeplan/domain/api/SliderContent;

    move-result-object v3

    if-eqz v3, :cond_8

    invoke-virtual {v3}, Lcom/whoop/weeklyplan/customizeplan/domain/api/SliderContent;->getAverageLine()Lcom/whoop/weeklyplan/customizeplan/domain/api/AverageLine;

    move-result-object v3

    if-eqz v3, :cond_8

    new-instance v15, Lbu2/h;

    invoke-static {v4}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v17

    invoke-static {v2}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v18

    sget-object v2, Lzs2/p$a;->w:Lzs2/p$a;

    invoke-static {v2}, Ly81/g;->a(Lkotlin/jvm/functions/Function1;)Ly81/e;

    move-result-object v19

    sget-object v2, Lzs2/p$b;->w:Lzs2/p$b;

    invoke-static {v2}, Ly81/g;->a(Lkotlin/jvm/functions/Function1;)Ly81/e;

    move-result-object v23

    invoke-static {}, Lb91/e;->e()Lb91/d;

    move-result-object v2

    invoke-virtual {v2}, Lb91/d;->C()Lb91/a;

    move-result-object v20

    invoke-static {}, Lb91/e;->e()Lb91/d;

    move-result-object v2

    invoke-virtual {v2}, Lb91/d;->D()Lb91/a;

    move-result-object v21

    invoke-virtual {v3}, Lcom/whoop/weeklyplan/customizeplan/domain/api/AverageLine;->getSubtitle()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v22

    sget-object v25, Lb2/e;->M:Lb2/k;

    new-instance v16, Lbu2/a;

    const/16 v27, 0x280

    const/16 v28, 0x0

    const/16 v24, 0x0

    const/16 v26, 0x0

    invoke-direct/range {v16 .. v28}, Lbu2/a;-><init>(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ly81/e;Lb91/a;Lb91/a;Lcom/whoop/design/util/TextResource;Ly81/e;Lb91/a;Lb2/f;Lbu2/c;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {v3}, Lcom/whoop/weeklyplan/customizeplan/domain/api/AverageLine;->getPositionOnSlider()Ljava/lang/Float;

    move-result-object v2

    if-eqz v2, :cond_7

    invoke-virtual {v2}, Ljava/lang/Float;->floatValue()F

    move-result v2

    :goto_6
    move/from16 v17, v2

    goto :goto_7

    :cond_7
    const/high16 v2, 0x3f000000    # 0.5f

    goto :goto_6

    :goto_7
    sget-wide v18, Li2/x;->f:J

    const/16 v20, 0x0

    invoke-direct/range {v15 .. v20}, Lbu2/h;-><init>(Lbu2/a;FJLkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object v13, v15

    goto :goto_8

    :cond_8
    move-object v13, v6

    :goto_8
    new-instance v1, Lbu2/d;

    const/16 v19, 0x5000

    const/16 v20, 0x0

    const/4 v3, 0x0

    const/high16 v4, 0x3f800000    # 1.0f

    const/4 v15, 0x0

    const/16 v17, 0x0

    move-object/from16 v18, p6

    move-object/from16 v8, p5

    move-object/from16 v16, p6

    move v2, v5

    move-wide/from16 v5, p2

    invoke-direct/range {v1 .. v20}, Lbu2/d;-><init>(FFFDLcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lbu2/k;Lbu2/h;Ljava/util/List;Lbu2/c0;Ly81/e;Ljava/lang/Double;Ly81/e;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v1
.end method

.method public final b(Lcom/whoop/weeklyplan/customizeplan/domain/api/WeeklyPlanCustomizationScreenModel;F)D
    .locals 6

    const-wide/high16 v0, 0x3ff0000000000000L    # 1.0

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Lcom/whoop/weeklyplan/customizeplan/domain/api/WeeklyPlanCustomizationScreenModel;->getSlider()Lcom/whoop/weeklyplan/customizeplan/domain/api/SliderContent;

    move-result-object v2

    if-eqz v2, :cond_0

    invoke-virtual {v2}, Lcom/whoop/weeklyplan/customizeplan/domain/api/SliderContent;->getRange()Lcom/whoop/weeklyplan/customizeplan/domain/api/Range;

    move-result-object v2

    if-eqz v2, :cond_0

    invoke-virtual {v2}, Lcom/whoop/weeklyplan/customizeplan/domain/api/Range;->getMax()D

    move-result-wide v2

    goto :goto_0

    :cond_0
    move-wide v2, v0

    :goto_0
    if-eqz p1, :cond_1

    invoke-virtual {p1}, Lcom/whoop/weeklyplan/customizeplan/domain/api/WeeklyPlanCustomizationScreenModel;->getSlider()Lcom/whoop/weeklyplan/customizeplan/domain/api/SliderContent;

    move-result-object v4

    if-eqz v4, :cond_1

    invoke-virtual {v4}, Lcom/whoop/weeklyplan/customizeplan/domain/api/SliderContent;->getRange()Lcom/whoop/weeklyplan/customizeplan/domain/api/Range;

    move-result-object v4

    if-eqz v4, :cond_1

    invoke-virtual {v4}, Lcom/whoop/weeklyplan/customizeplan/domain/api/Range;->getMin()D

    move-result-wide v4

    goto :goto_1

    :cond_1
    const-wide/16 v4, 0x0

    :goto_1
    if-eqz p1, :cond_2

    invoke-virtual {p1}, Lcom/whoop/weeklyplan/customizeplan/domain/api/WeeklyPlanCustomizationScreenModel;->getSlider()Lcom/whoop/weeklyplan/customizeplan/domain/api/SliderContent;

    move-result-object p1

    if-eqz p1, :cond_2

    invoke-virtual {p1}, Lcom/whoop/weeklyplan/customizeplan/domain/api/SliderContent;->getIncrement()D

    move-result-wide v0

    :cond_2
    float-to-double p1, p2

    sub-double/2addr v2, v4

    mul-double/2addr v2, p1

    add-double/2addr v2, v4

    div-double/2addr v2, v0

    invoke-static {v2, v3}, Le93/b;->W(D)I

    move-result p1

    int-to-double p1, p1

    mul-double/2addr p1, v0

    return-wide p1
.end method

.method public final c(Lcom/whoop/weeklyplan/customizeplan/domain/api/WeeklyPlanCustomizationScreenModel;Z)Lys2/b;
    .locals 8

    const-string v0, "model"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lys2/b;

    invoke-virtual {p1}, Lcom/whoop/weeklyplan/customizeplan/domain/api/WeeklyPlanCustomizationScreenModel;->getContinueButtonDisplay()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v2

    invoke-virtual {p1}, Lcom/whoop/weeklyplan/customizeplan/domain/api/WeeklyPlanCustomizationScreenModel;->getSkipButtonDisplay()Ljava/lang/String;

    move-result-object p1

    if-eqz p1, :cond_0

    invoke-static {p1}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object p1

    :goto_0
    move-object v4, p1

    goto :goto_1

    :cond_0
    const/4 p1, 0x0

    goto :goto_0

    :goto_1
    const/4 v6, 0x2

    const/4 v7, 0x0

    const/4 v3, 0x0

    move v5, p2

    invoke-direct/range {v1 .. v7}, Lys2/b;-><init>(Lcom/whoop/design/util/TextResource;ZLcom/whoop/design/util/TextResource;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v1
.end method

.method public final d(Lcom/whoop/weeklyplan/customizeplan/domain/api/WeeklyPlanCustomizationScreenModel;)Lys2/f;
    .locals 4

    const-string v0, "model"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lys2/f;

    invoke-virtual {p1}, Lcom/whoop/weeklyplan/customizeplan/domain/api/WeeklyPlanCustomizationScreenModel;->getNavigationTitleDisplay()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v1

    invoke-virtual {p1}, Lcom/whoop/weeklyplan/customizeplan/domain/api/WeeklyPlanCustomizationScreenModel;->getNavigationSubtitleDisplay()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v2

    invoke-virtual {p1}, Lcom/whoop/weeklyplan/customizeplan/domain/api/WeeklyPlanCustomizationScreenModel;->getTitle()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v3

    invoke-virtual {p1}, Lcom/whoop/weeklyplan/customizeplan/domain/api/WeeklyPlanCustomizationScreenModel;->getDescription()Ljava/lang/String;

    move-result-object p1

    invoke-static {p1}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object p1

    invoke-direct {v0, v1, v2, v3, p1}, Lys2/f;-><init>(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;)V

    return-object v0
.end method

.method public final e(Lcom/whoop/weeklyplan/customizeplan/domain/api/WeeklyPlanCustomizationScreenModel;)Ll83/k;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/weeklyplan/customizeplan/domain/api/WeeklyPlanCustomizationScreenModel;",
            ")",
            "Ll83/k;"
        }
    .end annotation

    const-string v0, "model"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

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
