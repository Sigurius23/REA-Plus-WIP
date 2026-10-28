.class public final Ljt2/q;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Ljt2/q$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0006\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u0008\u0007\u0018\u00002\u00020\u0001B\u0007\u00a2\u0006\u0004\u0008\u0002\u0010\u0003J!\u0010\t\u001a\u00020\u00082\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0002\u00a2\u0006\u0004\u0008\t\u0010\nJ\u001b\u0010\u000f\u001a\u0008\u0012\u0004\u0012\u00020\u000e0\r2\u0006\u0010\u000c\u001a\u00020\u000b\u00a2\u0006\u0004\u0008\u000f\u0010\u0010J)\u0010\u0013\u001a\u0008\u0012\u0004\u0012\u00020\u000e0\r2\u0006\u0010\u000c\u001a\u00020\u000b2\u000c\u0010\u0012\u001a\u0008\u0012\u0004\u0012\u00020\u00110\r\u00a2\u0006\u0004\u0008\u0013\u0010\u0014J#\u0010\u0015\u001a\u00020\u00082\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\u0008\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u00a2\u0006\u0004\u0008\u0015\u0010\u0016\u00a8\u0006\u0017"
    }
    d2 = {
        "Ljt2/q;",
        "",
        "<init>",
        "()V",
        "Lcom/whoop/weeklyplan/customizeplan/domain/api/WeeklyPlanCustomizationScreenModel;",
        "model",
        "",
        "fill",
        "",
        "c",
        "(Lcom/whoop/weeklyplan/customizeplan/domain/api/WeeklyPlanCustomizationScreenModel;F)D",
        "Ljt2/j;",
        "combineState",
        "",
        "Ljt2/r;",
        "e",
        "(Ljt2/j;)Ljava/util/List;",
        "Lcom/whoop/weeklyplan/hubandspoke/domain/api/Goal;",
        "effectiveTargetGoals",
        "d",
        "(Ljt2/j;Ljava/util/List;)Ljava/util/List;",
        "a",
        "(Lcom/whoop/weeklyplan/customizeplan/domain/api/WeeklyPlanCustomizationScreenModel;Ljava/lang/Float;)D",
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


# direct methods
.method public constructor <init>()V
    .locals 0

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static synthetic b(Ljt2/q;Lcom/whoop/weeklyplan/customizeplan/domain/api/WeeklyPlanCustomizationScreenModel;Ljava/lang/Float;ILjava/lang/Object;)D
    .locals 0

    and-int/lit8 p3, p3, 0x2

    if-eqz p3, :cond_0

    const/4 p2, 0x0

    :cond_0
    invoke-virtual {p0, p1, p2}, Ljt2/q;->a(Lcom/whoop/weeklyplan/customizeplan/domain/api/WeeklyPlanCustomizationScreenModel;Ljava/lang/Float;)D

    move-result-wide p0

    return-wide p0
.end method

.method private final c(Lcom/whoop/weeklyplan/customizeplan/domain/api/WeeklyPlanCustomizationScreenModel;F)D
    .locals 10

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
    float-to-double v6, p2

    mul-double v8, v2, v6

    if-eqz p1, :cond_2

    invoke-virtual {p1}, Lcom/whoop/weeklyplan/customizeplan/domain/api/WeeklyPlanCustomizationScreenModel;->getSlider()Lcom/whoop/weeklyplan/customizeplan/domain/api/SliderContent;

    move-result-object p2

    if-eqz p2, :cond_2

    invoke-virtual {p2}, Lcom/whoop/weeklyplan/customizeplan/domain/api/SliderContent;->getIncrement()D

    move-result-wide v0

    :cond_2
    div-double/2addr v8, v0

    invoke-static {v8, v9}, Le93/b;->W(D)I

    move-result p2

    int-to-double v8, p2

    mul-double/2addr v8, v0

    if-eqz p1, :cond_3

    invoke-virtual {p1}, Lcom/whoop/weeklyplan/customizeplan/domain/api/WeeklyPlanCustomizationScreenModel;->getGoal()Lcom/whoop/weeklyplan/customizeplan/domain/api/TargetGoalType;

    move-result-object p1

    goto :goto_2

    :cond_3
    const/4 p1, 0x0

    :goto_2
    if-nez p1, :cond_4

    const/4 p1, -0x1

    goto :goto_3

    :cond_4
    sget-object p2, Ljt2/q$a;->a:[I

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    aget p1, p2, p1

    :goto_3
    const/4 p2, 0x1

    packed-switch p1, :pswitch_data_0

    return-wide v8

    :pswitch_0
    sub-double/2addr v2, v4

    mul-double/2addr v2, v6

    add-double/2addr v2, v4

    div-double/2addr v2, v0

    invoke-static {v2, v3}, Le93/b;->W(D)I

    move-result p1

    int-to-double p1, p1

    mul-double/2addr p1, v0

    return-wide p1

    :pswitch_1
    sub-double/2addr v2, v4

    mul-double/2addr v2, v6

    add-double/2addr v2, v4

    div-double/2addr v2, v0

    invoke-static {v2, v3}, Le93/b;->W(D)I

    move-result p1

    int-to-double p1, p1

    mul-double/2addr p1, v0

    return-wide p1

    :pswitch_2
    new-instance p1, Ljava/math/BigDecimal;

    invoke-static {v8, v9}, Ljava/lang/String;->valueOf(D)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/math/BigDecimal;-><init>(Ljava/lang/String;)V

    sget-object v0, Ljava/math/RoundingMode;->HALF_UP:Ljava/math/RoundingMode;

    invoke-virtual {p1, p2, v0}, Ljava/math/BigDecimal;->setScale(ILjava/math/RoundingMode;)Ljava/math/BigDecimal;

    move-result-object p1

    invoke-virtual {p1}, Ljava/math/BigDecimal;->doubleValue()D

    move-result-wide p1

    return-wide p1

    :pswitch_3
    new-instance p1, Ljava/math/BigDecimal;

    sub-double/2addr v2, v4

    mul-double/2addr v2, v6

    add-double/2addr v2, v4

    invoke-static {v2, v3}, Ljava/lang/String;->valueOf(D)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p1, v0}, Ljava/math/BigDecimal;-><init>(Ljava/lang/String;)V

    sget-object v0, Ljava/math/RoundingMode;->HALF_UP:Ljava/math/RoundingMode;

    invoke-virtual {p1, p2, v0}, Ljava/math/BigDecimal;->setScale(ILjava/math/RoundingMode;)Ljava/math/BigDecimal;

    move-result-object p1

    invoke-virtual {p1}, Ljava/math/BigDecimal;->doubleValue()D

    move-result-wide p1

    return-wide p1

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method


# virtual methods
.method public final a(Lcom/whoop/weeklyplan/customizeplan/domain/api/WeeklyPlanCustomizationScreenModel;Ljava/lang/Float;)D
    .locals 2

    if-eqz p2, :cond_0

    :goto_0
    invoke-virtual {p2}, Ljava/lang/Float;->floatValue()F

    move-result p2

    goto :goto_2

    :cond_0
    if-eqz p1, :cond_1

    invoke-virtual {p1}, Lcom/whoop/weeklyplan/customizeplan/domain/api/WeeklyPlanCustomizationScreenModel;->getSlider()Lcom/whoop/weeklyplan/customizeplan/domain/api/SliderContent;

    move-result-object p2

    if-eqz p2, :cond_1

    invoke-virtual {p2}, Lcom/whoop/weeklyplan/customizeplan/domain/api/SliderContent;->getValue()D

    move-result-wide v0

    double-to-float p2, v0

    invoke-static {p2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p2

    goto :goto_1

    :cond_1
    const/4 p2, 0x0

    :goto_1
    if-eqz p2, :cond_2

    goto :goto_0

    :cond_2
    const/4 p2, 0x0

    :goto_2
    invoke-direct {p0, p1, p2}, Ljt2/q;->c(Lcom/whoop/weeklyplan/customizeplan/domain/api/WeeklyPlanCustomizationScreenModel;F)D

    move-result-wide p1

    return-wide p1
.end method

.method public final d(Ljt2/j;Ljava/util/List;)Ljava/util/List;
    .locals 20
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljt2/j;",
            "Ljava/util/List<",
            "Lcom/whoop/weeklyplan/hubandspoke/domain/api/Goal;",
            ">;)",
            "Ljava/util/List<",
            "Ljt2/r;",
            ">;"
        }
    .end annotation

    move-object/from16 v0, p2

    const-string v1, "combineState"

    move-object/from16 v2, p1

    invoke-static {v2, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "effectiveTargetGoals"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v2}, Ljt2/j;->d()Ljt2/m;

    move-result-object v1

    instance-of v1, v1, Ljt2/m$i;

    if-nez v1, :cond_0

    sget-object v0, Lm83/y;->w:Lm83/y;

    return-object v0

    :cond_0
    invoke-virtual {v2}, Ljt2/j;->c()Ljt2/d;

    move-result-object v1

    invoke-virtual {v2}, Ljt2/j;->d()Ljt2/m;

    move-result-object v2

    invoke-virtual {v1}, Ljt2/d;->t()Ljava/util/List;

    move-result-object v3

    check-cast v3, Ljava/lang/Iterable;

    new-instance v4, Ljava/util/ArrayList;

    invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_1
    :goto_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_18

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/Number;

    invoke-virtual {v5}, Ljava/lang/Number;->intValue()I

    move-result v5

    move-object v6, v2

    check-cast v6, Ljt2/m$i;

    invoke-virtual {v6}, Ljt2/m$i;->b()Lcom/whoop/weeklyplan/hubandspoke/domain/api/HubAndSpokeResponse;

    move-result-object v7

    invoke-virtual {v7}, Lcom/whoop/weeklyplan/hubandspoke/domain/api/HubAndSpokeResponse;->getMetricDetails()Ljava/util/List;

    move-result-object v7

    check-cast v7, Ljava/lang/Iterable;

    invoke-interface {v7}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v7

    :cond_2
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    const/4 v9, 0x0

    if-eqz v8, :cond_3

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v8

    move-object v10, v8

    check-cast v10, Lcom/whoop/weeklyplan/hubandspoke/domain/api/MetricDetail;

    invoke-virtual {v10}, Lcom/whoop/weeklyplan/hubandspoke/domain/api/MetricDetail;->getGoalTypeId()I

    move-result v10

    if-ne v10, v5, :cond_2

    goto :goto_1

    :cond_3
    move-object v8, v9

    :goto_1
    check-cast v8, Lcom/whoop/weeklyplan/hubandspoke/domain/api/MetricDetail;

    if-eqz v8, :cond_4

    invoke-virtual {v8}, Lcom/whoop/weeklyplan/hubandspoke/domain/api/MetricDetail;->getGoalType()Lcom/whoop/weeklyplan/customizeplan/domain/api/TargetGoalType;

    move-result-object v7

    move-object v11, v7

    goto :goto_2

    :cond_4
    move-object v11, v9

    :goto_2
    invoke-virtual {v6}, Ljt2/m$i;->b()Lcom/whoop/weeklyplan/hubandspoke/domain/api/HubAndSpokeResponse;

    move-result-object v7

    invoke-virtual {v7}, Lcom/whoop/weeklyplan/hubandspoke/domain/api/HubAndSpokeResponse;->getGoalScreens()Ljava/util/List;

    move-result-object v7

    check-cast v7, Ljava/lang/Iterable;

    invoke-interface {v7}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v7

    :cond_5
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    if-eqz v8, :cond_6

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v8

    move-object v10, v8

    check-cast v10, Lcom/whoop/weeklyplan/customizeplan/domain/api/WeeklyPlanCustomizationScreenModel;

    invoke-virtual {v10}, Lcom/whoop/weeklyplan/customizeplan/domain/api/WeeklyPlanCustomizationScreenModel;->getGoal()Lcom/whoop/weeklyplan/customizeplan/domain/api/TargetGoalType;

    move-result-object v10

    if-ne v10, v11, :cond_5

    goto :goto_3

    :cond_6
    move-object v8, v9

    :goto_3
    check-cast v8, Lcom/whoop/weeklyplan/customizeplan/domain/api/WeeklyPlanCustomizationScreenModel;

    move-object v7, v0

    check-cast v7, Ljava/lang/Iterable;

    invoke-interface {v7}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v7

    :cond_7
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v10

    if-eqz v10, :cond_8

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v10

    move-object v12, v10

    check-cast v12, Lcom/whoop/weeklyplan/hubandspoke/domain/api/Goal;

    invoke-virtual {v12}, Lcom/whoop/weeklyplan/hubandspoke/domain/api/Goal;->getGoalTypeId()I

    move-result v12

    if-ne v12, v5, :cond_7

    goto :goto_4

    :cond_8
    move-object v10, v9

    :goto_4
    check-cast v10, Lcom/whoop/weeklyplan/hubandspoke/domain/api/Goal;

    const-wide/16 v12, 0x0

    if-eqz v10, :cond_a

    invoke-virtual {v10}, Lcom/whoop/weeklyplan/hubandspoke/domain/api/Goal;->getTarget()D

    move-result-wide v5

    if-eqz v8, :cond_9

    invoke-virtual {v8}, Lcom/whoop/weeklyplan/customizeplan/domain/api/WeeklyPlanCustomizationScreenModel;->getSlider()Lcom/whoop/weeklyplan/customizeplan/domain/api/SliderContent;

    move-result-object v7

    if-eqz v7, :cond_9

    invoke-virtual {v7}, Lcom/whoop/weeklyplan/customizeplan/domain/api/SliderContent;->getRange()Lcom/whoop/weeklyplan/customizeplan/domain/api/Range;

    move-result-object v7

    if-eqz v7, :cond_9

    invoke-virtual {v7}, Lcom/whoop/weeklyplan/customizeplan/domain/api/Range;->getMax()D

    move-result-wide v12

    invoke-virtual {v7}, Lcom/whoop/weeklyplan/customizeplan/domain/api/Range;->getMin()D

    move-result-wide v14

    sub-double/2addr v12, v14

    invoke-virtual {v7}, Lcom/whoop/weeklyplan/customizeplan/domain/api/Range;->getMin()D

    move-result-wide v14

    sub-double/2addr v5, v14

    div-double v14, v5, v12

    const-wide/16 v16, 0x0

    const-wide/high16 v18, 0x3ff0000000000000L    # 1.0

    invoke-static/range {v14 .. v19}, Le93/b;->l(DDD)D

    move-result-wide v12

    goto/16 :goto_b

    :cond_9
    if-eqz v8, :cond_15

    invoke-virtual {v8}, Lcom/whoop/weeklyplan/customizeplan/domain/api/WeeklyPlanCustomizationScreenModel;->getSlider()Lcom/whoop/weeklyplan/customizeplan/domain/api/SliderContent;

    move-result-object v5

    if-eqz v5, :cond_15

    invoke-virtual {v5}, Lcom/whoop/weeklyplan/customizeplan/domain/api/SliderContent;->getValue()D

    move-result-wide v12

    goto/16 :goto_b

    :cond_a
    invoke-virtual {v6}, Ljt2/m$i;->b()Lcom/whoop/weeklyplan/hubandspoke/domain/api/HubAndSpokeResponse;

    move-result-object v7

    invoke-virtual {v7}, Lcom/whoop/weeklyplan/hubandspoke/domain/api/HubAndSpokeResponse;->getInitialSelection()Lcom/whoop/weeklyplan/hubandspoke/domain/api/InitialSelection;

    move-result-object v7

    invoke-virtual {v7}, Lcom/whoop/weeklyplan/hubandspoke/domain/api/InitialSelection;->getTargetGoals()Ljava/util/List;

    move-result-object v7

    check-cast v7, Ljava/lang/Iterable;

    invoke-interface {v7}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v7

    :cond_b
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v14

    if-eqz v14, :cond_c

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v14

    move-object v15, v14

    check-cast v15, Lcom/whoop/weeklyplan/hubandspoke/domain/api/Goal;

    invoke-virtual {v15}, Lcom/whoop/weeklyplan/hubandspoke/domain/api/Goal;->getGoalTypeId()I

    move-result v15

    if-ne v15, v5, :cond_b

    goto :goto_5

    :cond_c
    move-object v14, v9

    :goto_5
    check-cast v14, Lcom/whoop/weeklyplan/hubandspoke/domain/api/Goal;

    if-eqz v14, :cond_f

    invoke-virtual {v14}, Lcom/whoop/weeklyplan/hubandspoke/domain/api/Goal;->getTarget()D

    move-result-wide v14

    invoke-virtual {v6}, Ljt2/m$i;->b()Lcom/whoop/weeklyplan/hubandspoke/domain/api/HubAndSpokeResponse;

    move-result-object v5

    invoke-virtual {v5}, Lcom/whoop/weeklyplan/hubandspoke/domain/api/HubAndSpokeResponse;->getGoalScreens()Ljava/util/List;

    move-result-object v5

    check-cast v5, Ljava/lang/Iterable;

    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :cond_d
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_e

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    move-object v7, v6

    check-cast v7, Lcom/whoop/weeklyplan/customizeplan/domain/api/WeeklyPlanCustomizationScreenModel;

    invoke-virtual {v7}, Lcom/whoop/weeklyplan/customizeplan/domain/api/WeeklyPlanCustomizationScreenModel;->getGoal()Lcom/whoop/weeklyplan/customizeplan/domain/api/TargetGoalType;

    move-result-object v7

    if-ne v7, v11, :cond_d

    goto :goto_6

    :cond_e
    move-object v6, v9

    :goto_6
    check-cast v6, Lcom/whoop/weeklyplan/customizeplan/domain/api/WeeklyPlanCustomizationScreenModel;

    if-eqz v6, :cond_f

    invoke-virtual {v6}, Lcom/whoop/weeklyplan/customizeplan/domain/api/WeeklyPlanCustomizationScreenModel;->getSlider()Lcom/whoop/weeklyplan/customizeplan/domain/api/SliderContent;

    move-result-object v5

    if-eqz v5, :cond_f

    invoke-virtual {v5}, Lcom/whoop/weeklyplan/customizeplan/domain/api/SliderContent;->getRange()Lcom/whoop/weeklyplan/customizeplan/domain/api/Range;

    move-result-object v5

    if-eqz v5, :cond_f

    invoke-virtual {v5}, Lcom/whoop/weeklyplan/customizeplan/domain/api/Range;->getMax()D

    move-result-wide v6

    invoke-virtual {v5}, Lcom/whoop/weeklyplan/customizeplan/domain/api/Range;->getMin()D

    move-result-wide v16

    sub-double v6, v6, v16

    invoke-virtual {v5}, Lcom/whoop/weeklyplan/customizeplan/domain/api/Range;->getMin()D

    move-result-wide v16

    sub-double v14, v14, v16

    div-double/2addr v14, v6

    invoke-static {v14, v15}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v5

    goto :goto_7

    :cond_f
    move-object v5, v9

    :goto_7
    invoke-virtual {v1}, Ljt2/d;->l()Ljava/util/List;

    move-result-object v6

    check-cast v6, Ljava/lang/Iterable;

    invoke-interface {v6}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v6

    :cond_10
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_11

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    move-object v14, v7

    check-cast v14, Ljt2/r;

    invoke-virtual {v14}, Ljt2/r;->c()Lcom/whoop/weeklyplan/customizeplan/domain/api/TargetGoalType;

    move-result-object v14

    if-ne v14, v11, :cond_10

    goto :goto_8

    :cond_11
    move-object v7, v9

    :goto_8
    check-cast v7, Ljt2/r;

    if-eqz v7, :cond_12

    invoke-virtual {v7}, Ljt2/r;->b()D

    move-result-wide v12

    goto :goto_b

    :cond_12
    if-eqz v5, :cond_13

    :goto_9
    invoke-virtual {v5}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v12

    goto :goto_b

    :cond_13
    if-eqz v8, :cond_14

    invoke-virtual {v8}, Lcom/whoop/weeklyplan/customizeplan/domain/api/WeeklyPlanCustomizationScreenModel;->getSlider()Lcom/whoop/weeklyplan/customizeplan/domain/api/SliderContent;

    move-result-object v5

    if-eqz v5, :cond_14

    invoke-virtual {v5}, Lcom/whoop/weeklyplan/customizeplan/domain/api/SliderContent;->getValue()D

    move-result-wide v5

    invoke-static {v5, v6}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v5

    goto :goto_a

    :cond_14
    move-object v5, v9

    :goto_a
    if-eqz v5, :cond_15

    goto :goto_9

    :cond_15
    :goto_b
    if-eqz v11, :cond_17

    move-object v5, v10

    new-instance v10, Ljt2/r;

    if-eqz v5, :cond_16

    invoke-virtual {v5}, Lcom/whoop/weeklyplan/hubandspoke/domain/api/Goal;->getTarget()D

    move-result-wide v5

    move-wide v14, v5

    move-object/from16 v6, p0

    goto :goto_c

    :cond_16
    double-to-float v5, v12

    move-object/from16 v6, p0

    invoke-direct {v6, v8, v5}, Ljt2/q;->c(Lcom/whoop/weeklyplan/customizeplan/domain/api/WeeklyPlanCustomizationScreenModel;F)D

    move-result-wide v7

    move-wide v14, v7

    :goto_c
    invoke-direct/range {v10 .. v15}, Ljt2/r;-><init>(Lcom/whoop/weeklyplan/customizeplan/domain/api/TargetGoalType;DD)V

    move-object v9, v10

    goto :goto_d

    :cond_17
    move-object/from16 v6, p0

    :goto_d
    if-eqz v9, :cond_1

    invoke-interface {v4, v9}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto/16 :goto_0

    :cond_18
    move-object/from16 v6, p0

    return-object v4
.end method

.method public final e(Ljt2/j;)Ljava/util/List;
    .locals 14
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljt2/j;",
            ")",
            "Ljava/util/List<",
            "Ljt2/r;",
            ">;"
        }
    .end annotation

    const-string v0, "combineState"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Ljt2/j;->d()Ljt2/m;

    move-result-object v0

    instance-of v0, v0, Ljt2/m$i;

    if-nez v0, :cond_0

    sget-object p1, Lm83/y;->w:Lm83/y;

    return-object p1

    :cond_0
    invoke-virtual {p1}, Ljt2/j;->c()Ljt2/d;

    move-result-object v0

    invoke-virtual {p1}, Ljt2/j;->d()Ljt2/m;

    move-result-object p1

    invoke-virtual {v0}, Ljt2/d;->t()Ljava/util/List;

    move-result-object v1

    check-cast v1, Ljava/lang/Iterable;

    new-instance v2, Ljava/util/ArrayList;

    invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_1
    :goto_0
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_13

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Number;

    invoke-virtual {v3}, Ljava/lang/Number;->intValue()I

    move-result v3

    move-object v4, p1

    check-cast v4, Ljt2/m$i;

    invoke-virtual {v4}, Ljt2/m$i;->b()Lcom/whoop/weeklyplan/hubandspoke/domain/api/HubAndSpokeResponse;

    move-result-object v5

    invoke-virtual {v5}, Lcom/whoop/weeklyplan/hubandspoke/domain/api/HubAndSpokeResponse;->getMetricDetails()Ljava/util/List;

    move-result-object v5

    check-cast v5, Ljava/lang/Iterable;

    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :cond_2
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    const/4 v7, 0x0

    if-eqz v6, :cond_3

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    move-object v8, v6

    check-cast v8, Lcom/whoop/weeklyplan/hubandspoke/domain/api/MetricDetail;

    invoke-virtual {v8}, Lcom/whoop/weeklyplan/hubandspoke/domain/api/MetricDetail;->getGoalTypeId()I

    move-result v8

    if-ne v8, v3, :cond_2

    goto :goto_1

    :cond_3
    move-object v6, v7

    :goto_1
    check-cast v6, Lcom/whoop/weeklyplan/hubandspoke/domain/api/MetricDetail;

    if-eqz v6, :cond_4

    invoke-virtual {v6}, Lcom/whoop/weeklyplan/hubandspoke/domain/api/MetricDetail;->getGoalType()Lcom/whoop/weeklyplan/customizeplan/domain/api/TargetGoalType;

    move-result-object v5

    move-object v9, v5

    goto :goto_2

    :cond_4
    move-object v9, v7

    :goto_2
    invoke-virtual {v4}, Ljt2/m$i;->b()Lcom/whoop/weeklyplan/hubandspoke/domain/api/HubAndSpokeResponse;

    move-result-object v5

    invoke-virtual {v5}, Lcom/whoop/weeklyplan/hubandspoke/domain/api/HubAndSpokeResponse;->getGoalScreens()Ljava/util/List;

    move-result-object v5

    check-cast v5, Ljava/lang/Iterable;

    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :cond_5
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_6

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    move-object v8, v6

    check-cast v8, Lcom/whoop/weeklyplan/customizeplan/domain/api/WeeklyPlanCustomizationScreenModel;

    invoke-virtual {v8}, Lcom/whoop/weeklyplan/customizeplan/domain/api/WeeklyPlanCustomizationScreenModel;->getGoal()Lcom/whoop/weeklyplan/customizeplan/domain/api/TargetGoalType;

    move-result-object v8

    if-ne v8, v9, :cond_5

    goto :goto_3

    :cond_6
    move-object v6, v7

    :goto_3
    check-cast v6, Lcom/whoop/weeklyplan/customizeplan/domain/api/WeeklyPlanCustomizationScreenModel;

    invoke-virtual {v4}, Ljt2/m$i;->b()Lcom/whoop/weeklyplan/hubandspoke/domain/api/HubAndSpokeResponse;

    move-result-object v5

    invoke-virtual {v5}, Lcom/whoop/weeklyplan/hubandspoke/domain/api/HubAndSpokeResponse;->getInitialSelection()Lcom/whoop/weeklyplan/hubandspoke/domain/api/InitialSelection;

    move-result-object v5

    invoke-virtual {v5}, Lcom/whoop/weeklyplan/hubandspoke/domain/api/InitialSelection;->getTargetGoals()Ljava/util/List;

    move-result-object v5

    check-cast v5, Ljava/lang/Iterable;

    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :cond_7
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    if-eqz v8, :cond_8

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v8

    move-object v10, v8

    check-cast v10, Lcom/whoop/weeklyplan/hubandspoke/domain/api/Goal;

    invoke-virtual {v10}, Lcom/whoop/weeklyplan/hubandspoke/domain/api/Goal;->getGoalTypeId()I

    move-result v10

    if-ne v10, v3, :cond_7

    goto :goto_4

    :cond_8
    move-object v8, v7

    :goto_4
    check-cast v8, Lcom/whoop/weeklyplan/hubandspoke/domain/api/Goal;

    if-eqz v8, :cond_b

    invoke-virtual {v8}, Lcom/whoop/weeklyplan/hubandspoke/domain/api/Goal;->getTarget()D

    move-result-wide v10

    invoke-virtual {v4}, Ljt2/m$i;->b()Lcom/whoop/weeklyplan/hubandspoke/domain/api/HubAndSpokeResponse;

    move-result-object v3

    invoke-virtual {v3}, Lcom/whoop/weeklyplan/hubandspoke/domain/api/HubAndSpokeResponse;->getGoalScreens()Ljava/util/List;

    move-result-object v3

    check-cast v3, Ljava/lang/Iterable;

    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_9
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_a

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    move-object v5, v4

    check-cast v5, Lcom/whoop/weeklyplan/customizeplan/domain/api/WeeklyPlanCustomizationScreenModel;

    invoke-virtual {v5}, Lcom/whoop/weeklyplan/customizeplan/domain/api/WeeklyPlanCustomizationScreenModel;->getGoal()Lcom/whoop/weeklyplan/customizeplan/domain/api/TargetGoalType;

    move-result-object v5

    if-ne v5, v9, :cond_9

    goto :goto_5

    :cond_a
    move-object v4, v7

    :goto_5
    check-cast v4, Lcom/whoop/weeklyplan/customizeplan/domain/api/WeeklyPlanCustomizationScreenModel;

    if-eqz v4, :cond_b

    invoke-virtual {v4}, Lcom/whoop/weeklyplan/customizeplan/domain/api/WeeklyPlanCustomizationScreenModel;->getSlider()Lcom/whoop/weeklyplan/customizeplan/domain/api/SliderContent;

    move-result-object v3

    if-eqz v3, :cond_b

    invoke-virtual {v3}, Lcom/whoop/weeklyplan/customizeplan/domain/api/SliderContent;->getRange()Lcom/whoop/weeklyplan/customizeplan/domain/api/Range;

    move-result-object v3

    if-eqz v3, :cond_b

    invoke-virtual {v3}, Lcom/whoop/weeklyplan/customizeplan/domain/api/Range;->getMax()D

    move-result-wide v4

    invoke-virtual {v3}, Lcom/whoop/weeklyplan/customizeplan/domain/api/Range;->getMin()D

    move-result-wide v12

    sub-double/2addr v4, v12

    invoke-virtual {v3}, Lcom/whoop/weeklyplan/customizeplan/domain/api/Range;->getMin()D

    move-result-wide v12

    sub-double/2addr v10, v12

    div-double/2addr v10, v4

    invoke-static {v10, v11}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v3

    goto :goto_6

    :cond_b
    move-object v3, v7

    :goto_6
    invoke-virtual {v0}, Ljt2/d;->l()Ljava/util/List;

    move-result-object v4

    check-cast v4, Ljava/lang/Iterable;

    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :cond_c
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_d

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    move-object v8, v5

    check-cast v8, Ljt2/r;

    invoke-virtual {v8}, Ljt2/r;->c()Lcom/whoop/weeklyplan/customizeplan/domain/api/TargetGoalType;

    move-result-object v8

    if-ne v8, v9, :cond_c

    goto :goto_7

    :cond_d
    move-object v5, v7

    :goto_7
    check-cast v5, Ljt2/r;

    if-eqz v5, :cond_e

    invoke-virtual {v5}, Ljt2/r;->b()D

    move-result-wide v3

    :goto_8
    move-wide v10, v3

    goto :goto_b

    :cond_e
    if-eqz v3, :cond_f

    :goto_9
    invoke-virtual {v3}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v3

    goto :goto_8

    :cond_f
    if-eqz v6, :cond_10

    invoke-virtual {v6}, Lcom/whoop/weeklyplan/customizeplan/domain/api/WeeklyPlanCustomizationScreenModel;->getSlider()Lcom/whoop/weeklyplan/customizeplan/domain/api/SliderContent;

    move-result-object v3

    if-eqz v3, :cond_10

    invoke-virtual {v3}, Lcom/whoop/weeklyplan/customizeplan/domain/api/SliderContent;->getValue()D

    move-result-wide v3

    invoke-static {v3, v4}, Ljava/lang/Double;->valueOf(D)Ljava/lang/Double;

    move-result-object v3

    goto :goto_a

    :cond_10
    move-object v3, v7

    :goto_a
    if-eqz v3, :cond_11

    goto :goto_9

    :cond_11
    const-wide/16 v3, 0x0

    goto :goto_8

    :goto_b
    if-eqz v9, :cond_12

    new-instance v8, Ljt2/r;

    double-to-float v3, v10

    invoke-direct {p0, v6, v3}, Ljt2/q;->c(Lcom/whoop/weeklyplan/customizeplan/domain/api/WeeklyPlanCustomizationScreenModel;F)D

    move-result-wide v12

    invoke-direct/range {v8 .. v13}, Ljt2/r;-><init>(Lcom/whoop/weeklyplan/customizeplan/domain/api/TargetGoalType;DD)V

    move-object v7, v8

    :cond_12
    if-eqz v7, :cond_1

    invoke-interface {v2, v7}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto/16 :goto_0

    :cond_13
    return-object v2
.end method
