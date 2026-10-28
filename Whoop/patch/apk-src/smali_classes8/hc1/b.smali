.class public abstract Lhc1/b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0000\u00a2\u0006\u0004\u0008\u0003\u0010\u0004\u00a8\u0006\u0005"
    }
    d2 = {
        "Lcom/whoop/design/models/items/graph/plot/TrendPlotModel;",
        "graphPlot",
        "Lj71/b$k;",
        "a",
        "(Lcom/whoop/design/models/items/graph/plot/TrendPlotModel;)Lj71/b$k;",
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
.method public static final a(Lcom/whoop/design/models/items/graph/plot/TrendPlotModel;)Lj71/b$k;
    .locals 22

    const-string v0, "graphPlot"

    move-object/from16 v1, p0

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v1}, Lcom/whoop/design/models/items/graph/plot/TrendPlotModel;->getSegments()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    new-instance v2, Ljava/util/ArrayList;

    const/16 v3, 0xa

    invoke-static {v0, v3}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v3

    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    const/4 v4, 0x0

    if-eqz v3, :cond_3

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/whoop/design/models/items/graph/plot/trend/TrendSegmentModel;

    invoke-virtual {v3}, Lcom/whoop/design/models/items/graph/plot/trend/TrendSegmentModel;->getStyle()Ljava/lang/String;

    move-result-object v5

    sget-object v6, Lcom/whoop/design/models/items/graph/plot/trend/TrendSegmentStyle;->NONE:Lcom/whoop/design/models/items/graph/plot/trend/TrendSegmentStyle;

    invoke-static {}, Lcom/whoop/design/models/items/graph/plot/trend/TrendSegmentStyle;->values()[Lcom/whoop/design/models/items/graph/plot/trend/TrendSegmentStyle;

    move-result-object v7

    array-length v8, v7

    :goto_1
    if-ge v4, v8, :cond_1

    aget-object v9, v7, v4

    invoke-virtual {v9}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v10

    invoke-static {v10, v5}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_0

    goto :goto_2

    :cond_0
    add-int/lit8 v4, v4, 0x1

    goto :goto_1

    :cond_1
    const/4 v9, 0x0

    :goto_2
    if-nez v9, :cond_2

    move-object v10, v6

    goto :goto_3

    :cond_2
    move-object v10, v9

    :goto_3
    new-instance v4, Lc71/a;

    invoke-virtual {v3}, Lcom/whoop/design/models/items/graph/plot/trend/TrendSegmentModel;->getTopLabel()Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v5

    invoke-virtual {v3}, Lcom/whoop/design/models/items/graph/plot/trend/TrendSegmentModel;->getBottomLabel()Ljava/lang/String;

    move-result-object v6

    invoke-static {v6}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v6

    invoke-virtual {v1}, Lcom/whoop/design/models/items/graph/plot/TrendPlotModel;->getStyle()Lcom/whoop/design/models/items/graph/plot/trend/TrendPlotStyle;

    move-result-object v11

    const/16 v14, 0x8

    const/4 v15, 0x0

    const/4 v12, 0x1

    const/4 v13, 0x0

    invoke-static/range {v10 .. v15}, Lhc1/a;->b(Lcom/whoop/design/models/items/graph/plot/trend/TrendSegmentStyle;Lcom/whoop/design/models/items/graph/plot/trend/TrendPlotStyle;ZZILjava/lang/Object;)Ly81/e;

    move-result-object v7

    invoke-virtual {v1}, Lcom/whoop/design/models/items/graph/plot/TrendPlotModel;->getStyle()Lcom/whoop/design/models/items/graph/plot/trend/TrendPlotStyle;

    move-result-object v11

    const/4 v14, 0x4

    const/4 v12, 0x0

    const/4 v13, 0x1

    invoke-static/range {v10 .. v15}, Lhc1/a;->b(Lcom/whoop/design/models/items/graph/plot/trend/TrendSegmentStyle;Lcom/whoop/design/models/items/graph/plot/trend/TrendPlotStyle;ZZILjava/lang/Object;)Ly81/e;

    move-result-object v8

    invoke-virtual {v1}, Lcom/whoop/design/models/items/graph/plot/TrendPlotModel;->getStyle()Lcom/whoop/design/models/items/graph/plot/trend/TrendPlotStyle;

    move-result-object v11

    const/16 v14, 0xc

    const/4 v13, 0x0

    invoke-static/range {v10 .. v15}, Lhc1/a;->b(Lcom/whoop/design/models/items/graph/plot/trend/TrendSegmentStyle;Lcom/whoop/design/models/items/graph/plot/trend/TrendPlotStyle;ZZILjava/lang/Object;)Ly81/e;

    move-result-object v16

    invoke-virtual {v3}, Lcom/whoop/design/models/items/graph/plot/trend/TrendSegmentModel;->getPositionX()D

    move-result-wide v9

    double-to-float v9, v9

    invoke-virtual {v3}, Lcom/whoop/design/models/items/graph/plot/trend/TrendSegmentModel;->getPositionY()D

    move-result-wide v10

    double-to-float v10, v10

    invoke-virtual {v3}, Lcom/whoop/design/models/items/graph/plot/trend/TrendSegmentModel;->getWidthPercent()D

    move-result-wide v11

    double-to-float v3, v11

    const v20, 0x3c23d70a    # 0.01f

    invoke-static {}, Lcom/whoop/design/util/b;->a()Lcom/whoop/design/util/TextResource;

    move-result-object v21

    move/from16 v19, v3

    move-object v11, v4

    move-object v12, v5

    move-object v13, v6

    move-object v14, v7

    move-object v15, v8

    move/from16 v17, v9

    move/from16 v18, v10

    invoke-direct/range {v11 .. v21}, Lc71/a;-><init>(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ly81/e;Ly81/e;Ly81/e;FFFFLcom/whoop/design/util/TextResource;)V

    invoke-interface {v2, v11}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto/16 :goto_0

    :cond_3
    invoke-virtual {v1}, Lcom/whoop/design/models/items/graph/plot/TrendPlotModel;->getId()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1}, Lcom/whoop/design/models/items/graph/plot/TrendPlotModel;->getSkipScrubbing()Ljava/lang/Boolean;

    move-result-object v1

    if-eqz v1, :cond_4

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v4

    :cond_4
    new-instance v1, Lj71/b$k;

    invoke-direct {v1, v2, v0, v4}, Lj71/b$k;-><init>(Ljava/util/List;Ljava/lang/String;Z)V

    return-object v1
.end method
