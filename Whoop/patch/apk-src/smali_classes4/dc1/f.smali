.class public abstract Ldc1/f;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000*\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u001ag\u0010\u000c\u001a\u0008\u0012\u0004\u0012\u00020\u000b0\u00002\u000c\u0010\u0002\u001a\u0008\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0004\u001a\u00020\u00032\n\u0008\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\u0016\u0008\u0002\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0008\u0012\u0004\u0012\u00020\u0008\u0018\u00010\u00072\u0016\u0008\u0002\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\u0008\u0012\u0004\u0012\u00020\u0008\u0018\u00010\u0007H\u0000\u00a2\u0006\u0004\u0008\u000c\u0010\r\u001a\u001d\u0010\u000f\u001a\u00020\u0005*\u00020\u00052\u0008\u0010\u000e\u001a\u0004\u0018\u00010\u0005H\u0002\u00a2\u0006\u0004\u0008\u000f\u0010\u0010\u00a8\u0006\u0011"
    }
    d2 = {
        "",
        "Lcom/whoop/design/models/items/graph/plot/line/LineSegmentModel;",
        "segments",
        "Lcom/whoop/design/models/items/graph/plot/line/LinePlotStyle;",
        "backupPlotStyle",
        "Lcom/whoop/design/models/items/graph/plot/line/LinePlotTheme;",
        "plotTheme",
        "Ll83/k;",
        "",
        "startPoint",
        "endPoint",
        "Lu61/a;",
        "a",
        "(Ljava/util/List;Lcom/whoop/design/models/items/graph/plot/line/LinePlotStyle;Lcom/whoop/design/models/items/graph/plot/line/LinePlotTheme;Ll83/k;Ll83/k;)Ljava/util/List;",
        "base",
        "b",
        "(Lcom/whoop/design/models/items/graph/plot/line/LinePlotTheme;Lcom/whoop/design/models/items/graph/plot/line/LinePlotTheme;)Lcom/whoop/design/models/items/graph/plot/line/LinePlotTheme;",
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
.method public static final a(Ljava/util/List;Lcom/whoop/design/models/items/graph/plot/line/LinePlotStyle;Lcom/whoop/design/models/items/graph/plot/line/LinePlotTheme;Ll83/k;Ll83/k;)Ljava/util/List;
    .locals 18
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/whoop/design/models/items/graph/plot/line/LineSegmentModel;",
            ">;",
            "Lcom/whoop/design/models/items/graph/plot/line/LinePlotStyle;",
            "Lcom/whoop/design/models/items/graph/plot/line/LinePlotTheme;",
            "Ll83/k;",
            "Ll83/k;",
            ")",
            "Ljava/util/List<",
            "Lu61/a;",
            ">;"
        }
    .end annotation

    move-object/from16 v0, p0

    const-string v1, "segments"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "backupPlotStyle"

    move-object/from16 v2, p1

    invoke-static {v2, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v0, Ljava/lang/Iterable;

    new-instance v1, Ljava/util/ArrayList;

    const/16 v3, 0xa

    invoke-static {v0, v3}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v4

    invoke-direct {v1, v4}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_9

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lcom/whoop/design/models/items/graph/plot/line/LineSegmentModel;

    invoke-virtual {v4}, Lcom/whoop/design/models/items/graph/plot/line/LineSegmentModel;->getTheme()Lcom/whoop/design/models/items/graph/plot/line/LinePlotTheme;

    move-result-object v5

    move-object/from16 v6, p2

    if-eqz v5, :cond_0

    invoke-static {v5, v6}, Ldc1/f;->b(Lcom/whoop/design/models/items/graph/plot/line/LinePlotTheme;Lcom/whoop/design/models/items/graph/plot/line/LinePlotTheme;)Lcom/whoop/design/models/items/graph/plot/line/LinePlotTheme;

    move-result-object v5

    if-nez v5, :cond_1

    :cond_0
    move-object v5, v6

    :cond_1
    invoke-virtual {v4}, Lcom/whoop/design/models/items/graph/plot/line/LineSegmentModel;->getPoints()Ljava/util/List;

    move-result-object v7

    check-cast v7, Ljava/lang/Iterable;

    new-instance v9, Ljava/util/ArrayList;

    invoke-static {v7, v3}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v8

    invoke-direct {v9, v8}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v7}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v7

    :goto_1
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    if-eqz v8, :cond_6

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lcom/whoop/design/models/items/graph/plot/line/LineDataPointModel;

    invoke-virtual {v8}, Lcom/whoop/design/models/items/graph/plot/line/LineDataPointModel;->getAccessibilityLabel()Ljava/lang/String;

    move-result-object v10

    if-eqz v10, :cond_3

    invoke-static {v10}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v10

    if-nez v10, :cond_2

    goto :goto_3

    :cond_2
    :goto_2
    move-object v14, v10

    goto :goto_4

    :cond_3
    :goto_3
    invoke-static {}, Lcom/whoop/design/util/b;->a()Lcom/whoop/design/util/TextResource;

    move-result-object v10

    goto :goto_2

    :goto_4
    invoke-virtual {v8}, Lcom/whoop/design/models/items/graph/plot/line/LineDataPointModel;->getVisible()Z

    move-result v10

    const/4 v11, 0x0

    if-nez v10, :cond_4

    move-object v15, v11

    goto :goto_5

    :cond_4
    invoke-virtual {v8}, Lcom/whoop/design/models/items/graph/plot/line/LineDataPointModel;->getStyle()Lcom/whoop/design/models/items/graph/plot/line/LinePointStyle;

    move-result-object v10

    invoke-virtual {v8}, Lcom/whoop/design/models/items/graph/plot/line/LineDataPointModel;->getTheme()Lcom/whoop/design/models/items/graph/plot/line/LinePointTheme;

    move-result-object v12

    invoke-static {v10, v12}, Ldc1/i;->b(Lcom/whoop/design/models/items/graph/plot/line/LinePointStyle;Lcom/whoop/design/models/items/graph/plot/line/LinePointTheme;)Lu61/c;

    move-result-object v10

    move-object v15, v10

    :goto_5
    invoke-virtual {v8}, Lcom/whoop/design/models/items/graph/plot/line/LineDataPointModel;->getGraphLabel()Lcom/whoop/design/models/items/graph/plot/GraphPlotLabelModel;

    move-result-object v10

    if-eqz v10, :cond_5

    invoke-static {v10}, Lxb1/a;->a(Lcom/whoop/design/models/items/graph/plot/GraphPlotLabelModel;)Lu61/d;

    move-result-object v11

    :cond_5
    move-object/from16 v16, v11

    invoke-virtual {v8}, Lcom/whoop/design/models/items/graph/plot/line/LineDataPointModel;->getPositionX()D

    move-result-wide v10

    double-to-float v12, v10

    invoke-virtual {v8}, Lcom/whoop/design/models/items/graph/plot/line/LineDataPointModel;->getPositionY()D

    move-result-wide v10

    double-to-float v13, v10

    invoke-virtual {v8}, Lcom/whoop/design/models/items/graph/plot/line/LineDataPointModel;->getDataScrubberDetails()Lcom/whoop/design/models/items/graph/plot/scrubber/DataScrubberDetailsModel;

    move-result-object v8

    invoke-static {v8}, Lgc1/a;->a(Lcom/whoop/design/models/items/graph/plot/scrubber/DataScrubberDetailsModel;)La71/a;

    move-result-object v17

    new-instance v11, Lu61/e;

    invoke-direct/range {v11 .. v17}, Lu61/e;-><init>(FFLcom/whoop/design/util/TextResource;Lu61/c;Lu61/d;La71/a;)V

    invoke-interface {v9, v11}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_6
    invoke-virtual {v4}, Lcom/whoop/design/models/items/graph/plot/line/LineSegmentModel;->getStyle()Lcom/whoop/design/models/items/graph/plot/line/LinePlotStyle;

    move-result-object v7

    if-nez v7, :cond_7

    move-object v7, v2

    :cond_7
    invoke-static {v7, v5}, Ldc1/d;->X(Lcom/whoop/design/models/items/graph/plot/line/LinePlotStyle;Lcom/whoop/design/models/items/graph/plot/line/LinePlotTheme;)Lk61/a;

    move-result-object v10

    invoke-virtual {v4}, Lcom/whoop/design/models/items/graph/plot/line/LineSegmentModel;->getStyle()Lcom/whoop/design/models/items/graph/plot/line/LinePlotStyle;

    move-result-object v4

    if-nez v4, :cond_8

    move-object v4, v2

    :cond_8
    move-object/from16 v7, p3

    move-object/from16 v15, p4

    invoke-static {v4, v5, v7, v15}, Ldc1/g;->h(Lcom/whoop/design/models/items/graph/plot/line/LinePlotStyle;Lcom/whoop/design/models/items/graph/plot/line/LinePlotTheme;Ll83/k;Ll83/k;)Lk61/c;

    move-result-object v11

    new-instance v8, Lu61/a;

    const/4 v12, 0x0

    const/16 v13, 0x8

    const/4 v14, 0x0

    invoke-direct/range {v8 .. v14}, Lu61/a;-><init>(Ljava/util/List;Lk61/a;Lk61/c;Li71/d;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {v1, v8}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto/16 :goto_0

    :cond_9
    return-object v1
.end method

.method private static final b(Lcom/whoop/design/models/items/graph/plot/line/LinePlotTheme;Lcom/whoop/design/models/items/graph/plot/line/LinePlotTheme;)Lcom/whoop/design/models/items/graph/plot/line/LinePlotTheme;
    .locals 6

    if-nez p1, :cond_0

    return-object p0

    :cond_0
    new-instance v0, Lcom/whoop/design/models/items/graph/plot/line/LinePlotTheme;

    invoke-virtual {p0}, Lcom/whoop/design/models/items/graph/plot/line/LinePlotTheme;->getStrokeColor()Ly81/f;

    move-result-object v1

    if-nez v1, :cond_1

    invoke-virtual {p1}, Lcom/whoop/design/models/items/graph/plot/line/LinePlotTheme;->getStrokeColor()Ly81/f;

    move-result-object v1

    :cond_1
    invoke-virtual {p0}, Lcom/whoop/design/models/items/graph/plot/line/LinePlotTheme;->getStrokeWidth()Lcom/whoop/design/models/items/graph/plot/line/LineWidth;

    move-result-object v2

    if-nez v2, :cond_2

    invoke-virtual {p1}, Lcom/whoop/design/models/items/graph/plot/line/LinePlotTheme;->getStrokeWidth()Lcom/whoop/design/models/items/graph/plot/line/LineWidth;

    move-result-object v2

    :cond_2
    invoke-virtual {p0}, Lcom/whoop/design/models/items/graph/plot/line/LinePlotTheme;->getDashPattern()Lcom/whoop/design/models/items/graph/plot/line/DashPattern;

    move-result-object v3

    if-nez v3, :cond_3

    invoke-virtual {p1}, Lcom/whoop/design/models/items/graph/plot/line/LinePlotTheme;->getDashPattern()Lcom/whoop/design/models/items/graph/plot/line/DashPattern;

    move-result-object v3

    :cond_3
    invoke-virtual {p0}, Lcom/whoop/design/models/items/graph/plot/line/LinePlotTheme;->getFillColor()Ly81/f;

    move-result-object v4

    if-nez v4, :cond_4

    invoke-virtual {p1}, Lcom/whoop/design/models/items/graph/plot/line/LinePlotTheme;->getFillColor()Ly81/f;

    move-result-object v4

    :cond_4
    invoke-virtual {p0}, Lcom/whoop/design/models/items/graph/plot/line/LinePlotTheme;->getFillOpacity()Lcom/whoop/design/models/items/graph/plot/line/FillOpacity;

    move-result-object p0

    if-nez p0, :cond_5

    invoke-virtual {p1}, Lcom/whoop/design/models/items/graph/plot/line/LinePlotTheme;->getFillOpacity()Lcom/whoop/design/models/items/graph/plot/line/FillOpacity;

    move-result-object p0

    :cond_5
    move-object v5, p0

    invoke-direct/range {v0 .. v5}, Lcom/whoop/design/models/items/graph/plot/line/LinePlotTheme;-><init>(Ly81/f;Lcom/whoop/design/models/items/graph/plot/line/LineWidth;Lcom/whoop/design/models/items/graph/plot/line/DashPattern;Ly81/f;Lcom/whoop/design/models/items/graph/plot/line/FillOpacity;)V

    return-object v0
.end method
