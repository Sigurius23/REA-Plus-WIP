.class public abstract Llb1/t0;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Llb1/t0$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u001a\u0015\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000\u00a2\u0006\u0004\u0008\u0003\u0010\u0004\u00a8\u0006\u0005"
    }
    d2 = {
        "Lcom/whoop/design/models/items/DailyTickMarkPlotModel;",
        "model",
        "Lf11/e;",
        "a",
        "(Lcom/whoop/design/models/items/DailyTickMarkPlotModel;)Lf11/e;",
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


# direct methods
.method public static final a(Lcom/whoop/design/models/items/DailyTickMarkPlotModel;)Lf11/e;
    .locals 25

    const-string v0, "model"

    move-object/from16 v1, p0

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v1}, Lcom/whoop/design/models/items/DailyTickMarkPlotModel;->getTickMarkWidthStyle()Lcom/whoop/design/models/items/DailyTickMarkWidthStyle;

    move-result-object v0

    sget-object v2, Lcom/whoop/design/models/items/DailyTickMarkWidthStyle;->HEALTH_TAB_V2:Lcom/whoop/design/models/items/DailyTickMarkWidthStyle;

    const/4 v3, 0x0

    const/4 v4, 0x1

    if-ne v0, v2, :cond_0

    move v12, v4

    goto :goto_0

    :cond_0
    move v12, v3

    :goto_0
    invoke-virtual {v1}, Lcom/whoop/design/models/items/DailyTickMarkPlotModel;->getTickMarkWidthStyle()Lcom/whoop/design/models/items/DailyTickMarkWidthStyle;

    move-result-object v0

    sget-object v2, Lcom/whoop/design/models/items/DailyTickMarkWidthStyle;->HEALTH_TAB:Lcom/whoop/design/models/items/DailyTickMarkWidthStyle;

    if-eq v0, v2, :cond_2

    if-eqz v12, :cond_1

    goto :goto_1

    :cond_1
    move v0, v3

    goto :goto_2

    :cond_2
    :goto_1
    move v0, v4

    :goto_2
    invoke-virtual {v1}, Lcom/whoop/design/models/items/DailyTickMarkPlotModel;->getHeader()Lcom/whoop/design/models/items/DailyTickMarkHeaderModel;

    move-result-object v2

    const/4 v5, 0x0

    if-eqz v2, :cond_d

    invoke-virtual {v2}, Lcom/whoop/design/models/items/DailyTickMarkHeaderModel;->getTitleDisplay()Ljava/lang/String;

    move-result-object v6

    if-eqz v6, :cond_3

    invoke-static {v6}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v6

    move-object v14, v6

    goto :goto_3

    :cond_3
    move-object v14, v5

    :goto_3
    invoke-virtual {v2}, Lcom/whoop/design/models/items/DailyTickMarkHeaderModel;->getSubtitleDisplay()Ljava/lang/String;

    move-result-object v6

    if-eqz v6, :cond_4

    invoke-static {v6}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v6

    move-object v15, v6

    goto :goto_4

    :cond_4
    move-object v15, v5

    :goto_4
    invoke-virtual {v2}, Lcom/whoop/design/models/items/DailyTickMarkHeaderModel;->getCurrentStatusDisplay()Ljava/lang/String;

    move-result-object v6

    if-eqz v6, :cond_5

    invoke-static {v6}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v6

    move-object/from16 v16, v6

    goto :goto_5

    :cond_5
    move-object/from16 v16, v5

    :goto_5
    invoke-virtual {v2}, Lcom/whoop/design/models/items/DailyTickMarkHeaderModel;->getDescriptionDisplay()Ljava/lang/String;

    move-result-object v6

    if-eqz v6, :cond_6

    invoke-static {v6}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v6

    move-object/from16 v17, v6

    goto :goto_6

    :cond_6
    move-object/from16 v17, v5

    :goto_6
    invoke-virtual {v2}, Lcom/whoop/design/models/items/DailyTickMarkHeaderModel;->getCurrentStatusStyle()Ljava/lang/String;

    move-result-object v6

    if-eqz v6, :cond_a

    invoke-static {}, Lcom/whoop/design/models/items/CyclePhaseStyle;->values()[Lcom/whoop/design/models/items/CyclePhaseStyle;

    move-result-object v7

    array-length v8, v7

    move v9, v3

    :goto_7
    if-ge v9, v8, :cond_8

    aget-object v10, v7, v9

    invoke-virtual {v10}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v11

    invoke-static {v11, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_7

    goto :goto_8

    :cond_7
    add-int/lit8 v9, v9, 0x1

    goto :goto_7

    :cond_8
    move-object v10, v5

    :goto_8
    if-eqz v10, :cond_9

    invoke-static {v10}, Llb1/s0;->a(Lcom/whoop/design/models/items/CyclePhaseStyle;)Ly81/f;

    move-result-object v6

    goto :goto_9

    :cond_9
    move-object v6, v5

    :goto_9
    move-object/from16 v18, v6

    goto :goto_a

    :cond_a
    move-object/from16 v18, v5

    :goto_a
    invoke-virtual {v2}, Lcom/whoop/design/models/items/DailyTickMarkHeaderModel;->getRightAlignedDescription()Ljava/lang/String;

    move-result-object v6

    if-eqz v6, :cond_b

    invoke-static {v6}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v6

    move-object/from16 v19, v6

    goto :goto_b

    :cond_b
    move-object/from16 v19, v5

    :goto_b
    invoke-virtual {v2}, Lcom/whoop/design/models/items/DailyTickMarkHeaderModel;->getSupertitleDisplay()Ljava/lang/String;

    move-result-object v2

    if-eqz v2, :cond_c

    invoke-static {v2}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v2

    move-object/from16 v20, v2

    goto :goto_c

    :cond_c
    move-object/from16 v20, v5

    :goto_c
    new-instance v13, Lf11/b;

    invoke-direct/range {v13 .. v20}, Lf11/b;-><init>(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ly81/f;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;)V

    move-object v6, v13

    goto :goto_d

    :cond_d
    move-object v6, v5

    :goto_d
    invoke-virtual {v1}, Lcom/whoop/design/models/items/DailyTickMarkPlotModel;->getFillFullSpace()Z

    move-result v8

    invoke-virtual {v1}, Lcom/whoop/design/models/items/DailyTickMarkPlotModel;->getStyle()Lcom/whoop/design/models/items/TickMarksStyle;

    move-result-object v2

    sget-object v7, Lcom/whoop/design/models/items/TickMarksStyle;->FADE_IN:Lcom/whoop/design/models/items/TickMarksStyle;

    if-ne v2, v7, :cond_e

    move v11, v4

    goto :goto_e

    :cond_e
    move v11, v3

    :goto_e
    invoke-virtual {v1}, Lcom/whoop/design/models/items/DailyTickMarkPlotModel;->getTickMarks()Ljava/util/List;

    move-result-object v2

    check-cast v2, Ljava/lang/Iterable;

    new-instance v9, Ljava/util/ArrayList;

    const/16 v7, 0xa

    invoke-static {v2, v7}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v10

    invoke-direct {v9, v10}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_f
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v10

    const/4 v13, 0x2

    if-eqz v10, :cond_11

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Lcom/whoop/design/models/items/TickMarkStateModel;

    new-instance v14, Lf11/h;

    invoke-virtual {v10}, Lcom/whoop/design/models/items/TickMarkStateModel;->getStyle()Lcom/whoop/design/models/items/TickMarkStyle;

    move-result-object v15

    invoke-static {v15, v3, v13, v5}, Llb1/v4;->b(Lcom/whoop/design/models/items/TickMarkStyle;ZILjava/lang/Object;)Ly81/f;

    move-result-object v13

    invoke-virtual {v10}, Lcom/whoop/design/models/items/TickMarkStateModel;->isToday()Ljava/lang/Boolean;

    move-result-object v15

    if-eqz v15, :cond_f

    invoke-virtual {v15}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v15

    goto :goto_10

    :cond_f
    move v15, v3

    :goto_10
    invoke-virtual {v10}, Lcom/whoop/design/models/items/TickMarkStateModel;->getStyle()Lcom/whoop/design/models/items/TickMarkStyle;

    move-result-object v10

    sget-object v3, Lcom/whoop/design/models/items/TickMarkStyle;->PREDICTED:Lcom/whoop/design/models/items/TickMarkStyle;

    if-ne v10, v3, :cond_10

    sget-object v3, Ly81/f;->WHITE_50:Ly81/f;

    goto :goto_11

    :cond_10
    move-object v3, v5

    :goto_11
    invoke-direct {v14, v13, v15, v3}, Lf11/h;-><init>(Ly81/f;ZLy81/f;)V

    invoke-virtual {v9, v14}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    const/4 v3, 0x0

    goto :goto_f

    :cond_11
    invoke-virtual {v1}, Lcom/whoop/design/models/items/DailyTickMarkPlotModel;->getTickMarkWidthStyle()Lcom/whoop/design/models/items/DailyTickMarkWidthStyle;

    move-result-object v2

    sget-object v3, Llb1/t0$a;->a:[I

    invoke-virtual {v2}, Ljava/lang/Enum;->ordinal()I

    move-result v2

    aget v2, v3, v2

    const/high16 v3, 0x41000000    # 8.0f

    if-eq v2, v4, :cond_13

    if-eq v2, v13, :cond_12

    const/high16 v2, 0x40800000    # 4.0f

    goto :goto_12

    :cond_12
    move v2, v3

    goto :goto_12

    :cond_13
    const/high16 v2, 0x40200000    # 2.5f

    :goto_12
    invoke-virtual {v1}, Lcom/whoop/design/models/items/DailyTickMarkPlotModel;->getTickMarksLabels()Ljava/util/List;

    move-result-object v10

    if-eqz v10, :cond_18

    check-cast v10, Ljava/lang/Iterable;

    new-instance v14, Ljava/util/ArrayList;

    invoke-static {v10, v7}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v7

    invoke-direct {v14, v7}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v10}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v7

    :goto_13
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v10

    if-eqz v10, :cond_17

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Lcom/whoop/design/models/items/TickLabelModel;

    invoke-virtual {v10}, Lcom/whoop/design/models/items/TickLabelModel;->getIndex()I

    move-result v18

    invoke-virtual {v10}, Lcom/whoop/design/models/items/TickLabelModel;->getLabel()Ljava/lang/String;

    move-result-object v15

    invoke-static {v15}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v19

    invoke-virtual {v10}, Lcom/whoop/design/models/items/TickLabelModel;->getSubLabel()Ljava/lang/String;

    move-result-object v15

    if-eqz v15, :cond_14

    invoke-static {v15}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v15

    move-object/from16 v20, v15

    goto :goto_14

    :cond_14
    move-object/from16 v20, v5

    :goto_14
    invoke-virtual {v10}, Lcom/whoop/design/models/items/TickLabelModel;->getLabelStyle()Lcom/whoop/design/models/items/TickMarkStyle;

    move-result-object v15

    invoke-static {v15, v4}, Llb1/v4;->a(Lcom/whoop/design/models/items/TickMarkStyle;Z)Ly81/f;

    move-result-object v21

    invoke-virtual {v10}, Lcom/whoop/design/models/items/TickLabelModel;->getSubLabelStyle()Lcom/whoop/design/models/items/TickMarkStyle;

    move-result-object v15

    if-eqz v15, :cond_15

    invoke-static {v15, v4}, Llb1/v4;->a(Lcom/whoop/design/models/items/TickMarkStyle;Z)Ly81/f;

    move-result-object v15

    move-object/from16 v22, v15

    goto :goto_15

    :cond_15
    move-object/from16 v22, v5

    :goto_15
    invoke-virtual {v10}, Lcom/whoop/design/models/items/TickLabelModel;->isBelow()Z

    move-result v23

    if-eqz v0, :cond_16

    const v10, 0x3f19999a    # 0.6f

    invoke-static {v10}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v10

    move-object/from16 v24, v10

    goto :goto_16

    :cond_16
    move-object/from16 v24, v5

    :goto_16
    new-instance v17, Lf11/g;

    invoke-direct/range {v17 .. v24}, Lf11/g;-><init>(ILcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ly81/f;Ly81/f;ZLjava/lang/Float;)V

    move-object/from16 v10, v17

    invoke-virtual {v14, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_13

    :cond_17
    move-object v10, v14

    goto :goto_17

    :cond_18
    move-object v10, v5

    :goto_17
    invoke-virtual {v1}, Lcom/whoop/design/models/items/DailyTickMarkPlotModel;->getTickMarkWidthStyle()Lcom/whoop/design/models/items/DailyTickMarkWidthStyle;

    move-result-object v0

    sget-object v4, Llb1/t0$a;->a:[I

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    aget v0, v4, v0

    if-eq v0, v13, :cond_1a

    const/4 v4, 0x3

    if-eq v0, v4, :cond_19

    :goto_18
    move v14, v3

    goto :goto_19

    :cond_19
    const/high16 v3, 0x41400000    # 12.0f

    goto :goto_18

    :cond_1a
    const/high16 v3, 0x41c00000    # 24.0f

    goto :goto_18

    :goto_19
    invoke-virtual {v1}, Lcom/whoop/design/models/items/DailyTickMarkPlotModel;->getExpectedAnnotation()Lcom/whoop/design/models/items/ExpectedAnnotationModel;

    move-result-object v0

    if-eqz v0, :cond_1b

    invoke-virtual {v0}, Lcom/whoop/design/models/items/ExpectedAnnotationModel;->getLabel()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0}, Lcom/whoop/design/models/items/ExpectedAnnotationModel;->getIndex()I

    move-result v0

    new-instance v4, Lf11/f;

    invoke-direct {v4, v0, v3}, Lf11/f;-><init>(ILjava/lang/String;)V

    goto :goto_1a

    :cond_1b
    move-object v4, v5

    :goto_1a
    invoke-virtual {v1}, Lcom/whoop/design/models/items/DailyTickMarkPlotModel;->getFooter()Lcom/whoop/design/models/items/TickMarkFooterModel;

    move-result-object v0

    if-eqz v0, :cond_1f

    invoke-virtual {v0}, Lcom/whoop/design/models/items/TickMarkFooterModel;->getTitle()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v1

    invoke-virtual {v0}, Lcom/whoop/design/models/items/TickMarkFooterModel;->getTitleStyle()Ljava/lang/String;

    move-result-object v0

    invoke-static {}, Lcom/whoop/design/models/items/CyclePhaseStyle;->values()[Lcom/whoop/design/models/items/CyclePhaseStyle;

    move-result-object v3

    array-length v7, v3

    const/4 v13, 0x0

    :goto_1b
    if-ge v13, v7, :cond_1d

    aget-object v15, v3, v13

    invoke-virtual {v15}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v5

    invoke-static {v5, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_1c

    move-object v5, v15

    goto :goto_1c

    :cond_1c
    add-int/lit8 v13, v13, 0x1

    const/4 v5, 0x0

    goto :goto_1b

    :cond_1d
    const/4 v5, 0x0

    :goto_1c
    if-nez v5, :cond_1e

    sget-object v5, Lcom/whoop/design/models/items/CyclePhaseStyle;->NO_PHASE:Lcom/whoop/design/models/items/CyclePhaseStyle;

    :cond_1e
    invoke-static {v5}, Llb1/s0;->a(Lcom/whoop/design/models/items/CyclePhaseStyle;)Ly81/f;

    move-result-object v0

    new-instance v5, Lf11/a;

    invoke-direct {v5, v1, v0}, Lf11/a;-><init>(Lcom/whoop/design/util/TextResource;Ly81/f;)V

    move-object/from16 v17, v5

    goto :goto_1d

    :cond_1f
    const/16 v17, 0x0

    :goto_1d
    new-instance v5, Lf11/e;

    const/16 v18, 0x2

    const/16 v19, 0x0

    const/4 v7, 0x0

    move v15, v12

    move v13, v2

    move-object/from16 v16, v4

    invoke-direct/range {v5 .. v19}, Lf11/e;-><init>(Lf11/b;ZZLjava/util/List;Ljava/util/List;ZZFFZLf11/f;Lf11/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v5
.end method
