.class public abstract Lzb1/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0007\n\u0002\u0008\u0004\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0000\u00a2\u0006\u0004\u0008\u0003\u0010\u0004\u001a\u001d\u0010\t\u001a\u00020\u00082\u000c\u0010\u0007\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u0005H\u0002\u00a2\u0006\u0004\u0008\t\u0010\n\u001a\u001f\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\u00082\u0006\u0010\r\u001a\u00020\u000cH\u0000\u00a2\u0006\u0004\u0008\u000f\u0010\u0010\u001a\'\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u000b\u001a\u00020\u00082\u0006\u0010\u0011\u001a\u00020\u00082\u0006\u0010\u0013\u001a\u00020\u0012H\u0000\u00a2\u0006\u0004\u0008\u0014\u0010\u0015\u00a8\u0006\u0016"
    }
    d2 = {
        "Lcom/whoop/design/models/items/graph/plot/BarPlotModel;",
        "plot",
        "Lj71/b$b;",
        "a",
        "(Lcom/whoop/design/models/items/graph/plot/BarPlotModel;)Lj71/b$b;",
        "",
        "Lcom/whoop/design/models/items/graph/plot/bar/BarModel;",
        "bars",
        "",
        "d",
        "(Ljava/util/List;)I",
        "stackedBarsSize",
        "",
        "isVisualTop",
        "Ly3/f;",
        "c",
        "(IZ)F",
        "indexOfBar",
        "",
        "yPercent",
        "b",
        "(IIF)F",
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
.method public static final a(Lcom/whoop/design/models/items/graph/plot/BarPlotModel;)Lj71/b$b;
    .locals 26

    const-string v0, "plot"

    move-object/from16 v1, p0

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v1}, Lcom/whoop/design/models/items/graph/plot/BarPlotModel;->getBarGroups()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    new-instance v2, Ljava/util/ArrayList;

    const/16 v3, 0xa

    invoke-static {v0, v3}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v4

    invoke-direct {v2, v4}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    const/4 v5, 0x0

    if-eqz v4, :cond_f

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/whoop/design/models/items/graph/plot/bar/BarGroupModel;

    invoke-virtual {v4}, Lcom/whoop/design/models/items/graph/plot/bar/BarGroupModel;->getBars()Ljava/util/List;

    move-result-object v6

    invoke-static {v6}, Lzb1/a;->d(Ljava/util/List;)I

    move-result v6

    invoke-virtual {v4}, Lcom/whoop/design/models/items/graph/plot/bar/BarGroupModel;->getAccessibilityLabel()Ljava/lang/String;

    move-result-object v7

    if-eqz v7, :cond_1

    invoke-static {v7}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v7

    if-nez v7, :cond_0

    goto :goto_2

    :cond_0
    :goto_1
    move-object v9, v7

    goto :goto_3

    :cond_1
    :goto_2
    invoke-static {}, Lcom/whoop/design/util/b;->a()Lcom/whoop/design/util/TextResource;

    move-result-object v7

    goto :goto_1

    :goto_3
    invoke-virtual {v4}, Lcom/whoop/design/models/items/graph/plot/bar/BarGroupModel;->getBars()Ljava/util/List;

    move-result-object v7

    check-cast v7, Ljava/lang/Iterable;

    new-instance v10, Ljava/util/ArrayList;

    invoke-static {v7, v3}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v8

    invoke-direct {v10, v8}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v7}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v7

    move v8, v5

    :goto_4
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v11

    if-eqz v11, :cond_8

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v11

    add-int/lit8 v13, v8, 0x1

    if-ltz v8, :cond_7

    check-cast v11, Lcom/whoop/design/models/items/graph/plot/bar/BarModel;

    invoke-virtual {v11}, Lcom/whoop/design/models/items/graph/plot/bar/BarModel;->getStyle()Lcom/whoop/design/models/items/graph/plot/bar/BarStyle;

    move-result-object v14

    sget-object v15, Lcom/whoop/design/models/items/graph/plot/bar/BarStyle;->HIDDEN:Lcom/whoop/design/models/items/graph/plot/bar/BarStyle;

    const/16 v16, 0x1

    if-ne v14, v15, :cond_2

    move/from16 v24, v16

    goto :goto_5

    :cond_2
    move/from16 v24, v5

    :goto_5
    new-instance v17, Le71/b;

    invoke-virtual {v11}, Lcom/whoop/design/models/items/graph/plot/bar/BarModel;->getPositionY()D

    move-result-wide v14

    double-to-float v14, v14

    move-object v15, v4

    invoke-virtual {v11}, Lcom/whoop/design/models/items/graph/plot/bar/BarModel;->getHeight()D

    move-result-wide v3

    double-to-float v3, v3

    invoke-virtual {v11}, Lcom/whoop/design/models/items/graph/plot/bar/BarModel;->getStyle()Lcom/whoop/design/models/items/graph/plot/bar/BarStyle;

    move-result-object v4

    const/16 v18, 0x0

    invoke-virtual {v11}, Lcom/whoop/design/models/items/graph/plot/bar/BarModel;->getTheme()Lcom/whoop/design/models/items/graph/plot/bar/BarTheme;

    move-result-object v12

    invoke-static {v4, v12}, Lzb1/b;->a(Lcom/whoop/design/models/items/graph/plot/bar/BarStyle;Lcom/whoop/design/models/items/graph/plot/bar/BarTheme;)Li91/a;

    move-result-object v20

    const/4 v4, 0x4

    if-eqz v24, :cond_3

    int-to-float v12, v5

    int-to-float v5, v4

    mul-float/2addr v12, v5

    :goto_6
    move/from16 v21, v12

    goto :goto_8

    :cond_3
    invoke-virtual {v15}, Lcom/whoop/design/models/items/graph/plot/bar/BarGroupModel;->getBars()Ljava/util/List;

    move-result-object v5

    invoke-interface {v5}, Ljava/util/List;->size()I

    move-result v5

    if-ne v8, v6, :cond_4

    move/from16 v12, v16

    goto :goto_7

    :cond_4
    const/4 v12, 0x0

    :goto_7
    invoke-static {v5, v12}, Lzb1/a;->c(IZ)F

    move-result v12

    goto :goto_6

    :goto_8
    const/4 v5, 0x0

    if-eqz v24, :cond_5

    int-to-float v11, v5

    int-to-float v4, v4

    mul-float/2addr v11, v4

    :goto_9
    move/from16 v22, v11

    goto :goto_a

    :cond_5
    invoke-virtual {v15}, Lcom/whoop/design/models/items/graph/plot/bar/BarGroupModel;->getBars()Ljava/util/List;

    move-result-object v4

    invoke-interface {v4}, Ljava/util/List;->size()I

    move-result v4

    invoke-virtual {v11}, Lcom/whoop/design/models/items/graph/plot/bar/BarModel;->getPositionY()D

    move-result-wide v11

    double-to-float v11, v11

    invoke-static {v4, v8, v11}, Lzb1/a;->b(IIF)F

    move-result v11

    goto :goto_9

    :goto_a
    invoke-virtual {v15}, Lcom/whoop/design/models/items/graph/plot/bar/BarGroupModel;->getBars()Ljava/util/List;

    move-result-object v4

    invoke-static {v8, v4}, Lm83/s;->I0(ILjava/util/List;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/whoop/design/models/items/graph/plot/bar/BarModel;

    if-eqz v4, :cond_6

    invoke-virtual {v4}, Lcom/whoop/design/models/items/graph/plot/bar/BarModel;->getDataScrubberDetails()Lcom/whoop/design/models/items/graph/plot/scrubber/DataScrubberDetailsModel;

    move-result-object v12

    goto :goto_b

    :cond_6
    move-object/from16 v12, v18

    :goto_b
    invoke-static {v12}, Lgc1/a;->a(Lcom/whoop/design/models/items/graph/plot/scrubber/DataScrubberDetailsModel;)La71/a;

    move-result-object v23

    const/16 v25, 0x0

    move/from16 v19, v3

    move/from16 v18, v14

    invoke-direct/range {v17 .. v25}, Le71/b;-><init>(FFLi91/a;FFLa71/a;ZLkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object/from16 v3, v17

    invoke-interface {v10, v3}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    move v8, v13

    move-object v4, v15

    const/16 v3, 0xa

    goto/16 :goto_4

    :cond_7
    const/16 v18, 0x0

    invoke-static {}, Lwb3/f;->d0()V

    throw v18

    :cond_8
    move-object v15, v4

    const/16 v18, 0x0

    invoke-virtual {v15}, Lcom/whoop/design/models/items/graph/plot/bar/BarGroupModel;->getPositionX()D

    move-result-wide v3

    double-to-float v11, v3

    invoke-virtual {v15}, Lcom/whoop/design/models/items/graph/plot/bar/BarGroupModel;->getWidth()D

    move-result-wide v3

    double-to-float v12, v3

    invoke-virtual {v15}, Lcom/whoop/design/models/items/graph/plot/bar/BarGroupModel;->getBars()Ljava/util/List;

    move-result-object v3

    check-cast v3, Ljava/lang/Iterable;

    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_9
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_b

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/whoop/design/models/items/graph/plot/bar/BarModel;

    invoke-virtual {v4}, Lcom/whoop/design/models/items/graph/plot/bar/BarModel;->getTheme()Lcom/whoop/design/models/items/graph/plot/bar/BarTheme;

    move-result-object v4

    if-eqz v4, :cond_a

    invoke-virtual {v4}, Lcom/whoop/design/models/items/graph/plot/bar/BarTheme;->getBarWidth()Lcom/whoop/design/models/items/graph/plot/bar/BarWidth;

    move-result-object v4

    goto :goto_c

    :cond_a
    move-object/from16 v4, v18

    :goto_c
    if-eqz v4, :cond_9

    goto :goto_d

    :cond_b
    move-object/from16 v4, v18

    :goto_d
    if-eqz v4, :cond_c

    invoke-static {v4}, Lzb1/c;->a(Lcom/whoop/design/models/items/graph/plot/bar/BarWidth;)F

    move-result v3

    invoke-static {v3}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v3

    move-object v13, v3

    goto :goto_e

    :cond_c
    move-object/from16 v13, v18

    :goto_e
    invoke-virtual {v15}, Lcom/whoop/design/models/items/graph/plot/bar/BarGroupModel;->getBottomLabel()Lcom/whoop/design/models/items/graph/plot/GraphPlotLabelModel;

    move-result-object v3

    if-eqz v3, :cond_d

    invoke-static {v3}, Lxb1/a;->a(Lcom/whoop/design/models/items/graph/plot/GraphPlotLabelModel;)Lu61/d;

    move-result-object v3

    move-object v14, v3

    goto :goto_f

    :cond_d
    move-object/from16 v14, v18

    :goto_f
    invoke-virtual {v15}, Lcom/whoop/design/models/items/graph/plot/bar/BarGroupModel;->getTopLabel()Lcom/whoop/design/models/items/graph/plot/GraphPlotLabelModel;

    move-result-object v3

    if-eqz v3, :cond_e

    invoke-static {v3}, Lxb1/a;->a(Lcom/whoop/design/models/items/graph/plot/GraphPlotLabelModel;)Lu61/d;

    move-result-object v3

    move-object/from16 v18, v3

    :cond_e
    invoke-virtual {v15}, Lcom/whoop/design/models/items/graph/plot/bar/BarGroupModel;->getDataScrubberDetails()Lcom/whoop/design/models/items/graph/plot/scrubber/DataScrubberDetailsModel;

    move-result-object v3

    invoke-static {v3}, Lgc1/a;->a(Lcom/whoop/design/models/items/graph/plot/scrubber/DataScrubberDetailsModel;)La71/a;

    move-result-object v16

    new-instance v8, Le71/a;

    const/16 v17, 0x0

    move-object/from16 v15, v18

    const/16 v18, 0x100

    const/16 v19, 0x0

    invoke-direct/range {v8 .. v19}, Le71/a;-><init>(Lcom/whoop/design/util/TextResource;Ljava/util/List;FFLjava/lang/Float;Lu61/d;Lu61/d;La71/a;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {v2, v8}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    const/16 v3, 0xa

    goto/16 :goto_0

    :cond_f
    invoke-virtual {v1}, Lcom/whoop/design/models/items/graph/plot/BarPlotModel;->getId()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1}, Lcom/whoop/design/models/items/graph/plot/BarPlotModel;->getHideWhileScrubbing()Ljava/lang/Boolean;

    move-result-object v3

    if-eqz v3, :cond_10

    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v3

    goto :goto_10

    :cond_10
    move v3, v5

    :goto_10
    invoke-virtual {v1}, Lcom/whoop/design/models/items/graph/plot/BarPlotModel;->getSkipScrubbing()Ljava/lang/Boolean;

    move-result-object v1

    if-eqz v1, :cond_11

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v5

    :cond_11
    new-instance v1, Lj71/b$b;

    invoke-direct {v1, v2, v0, v5, v3}, Lj71/b$b;-><init>(Ljava/util/List;Ljava/lang/String;ZZ)V

    return-object v1
.end method

.method public static final b(IIF)F
    .locals 2

    const/4 p1, 0x1

    const/4 v0, 0x0

    const/4 v1, 0x4

    if-le p0, p1, :cond_0

    :goto_0
    int-to-float p0, v0

    :goto_1
    int-to-float p1, v1

    mul-float/2addr p0, p1

    return p0

    :cond_0
    const/4 p0, 0x0

    cmpg-float p0, p2, p0

    if-nez p0, :cond_1

    goto :goto_0

    :cond_1
    const-wide/high16 p0, 0x3fe0000000000000L    # 0.5

    double-to-float p0, p0

    goto :goto_1
.end method

.method public static final c(IZ)F
    .locals 2

    const/4 v0, 0x1

    const/4 v1, 0x4

    if-eq p0, v0, :cond_1

    if-eqz p1, :cond_0

    goto :goto_1

    :cond_0
    const/4 p0, 0x0

    int-to-float p0, p0

    :goto_0
    int-to-float p1, v1

    mul-float/2addr p0, p1

    return p0

    :cond_1
    :goto_1
    const-wide/high16 p0, 0x3fe0000000000000L    # 0.5

    double-to-float p0, p0

    goto :goto_0
.end method

.method private static final d(Ljava/util/List;)I
    .locals 13
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/whoop/design/models/items/graph/plot/bar/BarModel;",
            ">;)I"
        }
    .end annotation

    move-object v0, p0

    check-cast v0, Ljava/util/Collection;

    invoke-static {v0}, Lwb3/f;->B(Ljava/util/Collection;)Li93/j;

    move-result-object v0

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-nez v1, :cond_0

    const/4 p0, 0x0

    goto :goto_3

    :cond_0
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-nez v2, :cond_1

    :goto_0
    move-object p0, v1

    goto :goto_3

    :cond_1
    move-object v2, v1

    check-cast v2, Ljava/lang/Number;

    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    move-result v2

    invoke-interface {p0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/whoop/design/models/items/graph/plot/bar/BarModel;

    invoke-virtual {v2}, Lcom/whoop/design/models/items/graph/plot/bar/BarModel;->getHeight()D

    move-result-wide v3

    const-wide/16 v5, 0x0

    cmpg-double v3, v3, v5

    const-wide/high16 v7, -0x10000000000000L    # Double.NEGATIVE_INFINITY

    if-gtz v3, :cond_2

    move-wide v9, v7

    goto :goto_1

    :cond_2
    invoke-virtual {v2}, Lcom/whoop/design/models/items/graph/plot/bar/BarModel;->getPositionY()D

    move-result-wide v3

    invoke-virtual {v2}, Lcom/whoop/design/models/items/graph/plot/bar/BarModel;->getHeight()D

    move-result-wide v9

    add-double/2addr v9, v3

    :cond_3
    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    move-object v3, v2

    check-cast v3, Ljava/lang/Number;

    invoke-virtual {v3}, Ljava/lang/Number;->intValue()I

    move-result v3

    invoke-interface {p0, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/whoop/design/models/items/graph/plot/bar/BarModel;

    invoke-virtual {v3}, Lcom/whoop/design/models/items/graph/plot/bar/BarModel;->getHeight()D

    move-result-wide v11

    cmpg-double v4, v11, v5

    if-gtz v4, :cond_4

    move-wide v3, v7

    goto :goto_2

    :cond_4
    invoke-virtual {v3}, Lcom/whoop/design/models/items/graph/plot/bar/BarModel;->getPositionY()D

    move-result-wide v11

    invoke-virtual {v3}, Lcom/whoop/design/models/items/graph/plot/bar/BarModel;->getHeight()D

    move-result-wide v3

    add-double/2addr v3, v11

    :goto_2
    invoke-static {v9, v10, v3, v4}, Ljava/lang/Double;->compare(DD)I

    move-result v11

    if-gez v11, :cond_5

    move-object v1, v2

    move-wide v9, v3

    :cond_5
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-nez v2, :cond_3

    goto :goto_0

    :goto_3
    check-cast p0, Ljava/lang/Integer;

    if-eqz p0, :cond_6

    invoke-virtual {p0}, Ljava/lang/Integer;->intValue()I

    move-result p0

    return p0

    :cond_6
    const/4 p0, 0x0

    return p0
.end method
