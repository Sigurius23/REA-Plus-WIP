.class public abstract Lyb1/d;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0018\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u001a+\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u00002\u000c\u0010\u0002\u001a\u0008\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0004\u001a\u00020\u0003H\u0000\u00a2\u0006\u0004\u0008\u0006\u0010\u0007\u00a8\u0006\u0008"
    }
    d2 = {
        "",
        "Lcom/whoop/design/models/items/graph/plot/band/BandSegmentModel;",
        "segments",
        "Lcom/whoop/design/models/items/graph/plot/band/BandPlotStyle;",
        "backupPlotStyle",
        "Ll61/d;",
        "a",
        "(Ljava/util/List;Lcom/whoop/design/models/items/graph/plot/band/BandPlotStyle;)Ljava/util/List;",
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
.method public static final a(Ljava/util/List;Lcom/whoop/design/models/items/graph/plot/band/BandPlotStyle;)Ljava/util/List;
    .locals 13
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/whoop/design/models/items/graph/plot/band/BandSegmentModel;",
            ">;",
            "Lcom/whoop/design/models/items/graph/plot/band/BandPlotStyle;",
            ")",
            "Ljava/util/List<",
            "Ll61/d;",
            ">;"
        }
    .end annotation

    const-string v0, "segments"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "backupPlotStyle"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p0, Ljava/lang/Iterable;

    new-instance v0, Ljava/util/ArrayList;

    const/16 v1, 0xa

    invoke-static {p0, v1}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v2

    invoke-direct {v0, v2}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_3

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/whoop/design/models/items/graph/plot/band/BandSegmentModel;

    invoke-virtual {v2}, Lcom/whoop/design/models/items/graph/plot/band/BandSegmentModel;->getPoints()Ljava/util/List;

    move-result-object v3

    check-cast v3, Ljava/lang/Iterable;

    new-instance v4, Ljava/util/ArrayList;

    invoke-static {v3, v1}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v5

    invoke-direct {v4, v5}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_1
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_0

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/whoop/design/models/items/graph/plot/band/BandDataPointModel;

    invoke-virtual {v5}, Lcom/whoop/design/models/items/graph/plot/band/BandDataPointModel;->getAccessibilityLabel()Ljava/lang/String;

    move-result-object v6

    invoke-static {v6}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v8

    invoke-virtual {v5}, Lcom/whoop/design/models/items/graph/plot/band/BandDataPointModel;->getPositionBottomY()D

    move-result-wide v6

    double-to-float v11, v6

    invoke-virtual {v5}, Lcom/whoop/design/models/items/graph/plot/band/BandDataPointModel;->getPositionTopY()D

    move-result-wide v6

    double-to-float v10, v6

    invoke-virtual {v5}, Lcom/whoop/design/models/items/graph/plot/band/BandDataPointModel;->getPositionX()D

    move-result-wide v6

    double-to-float v9, v6

    invoke-virtual {v5}, Lcom/whoop/design/models/items/graph/plot/band/BandDataPointModel;->getDataScrubberDetails()Lcom/whoop/design/models/items/graph/plot/scrubber/DataScrubberDetailsModel;

    move-result-object v5

    invoke-static {v5}, Lgc1/a;->a(Lcom/whoop/design/models/items/graph/plot/scrubber/DataScrubberDetailsModel;)La71/a;

    move-result-object v12

    new-instance v7, Ll61/c;

    invoke-direct/range {v7 .. v12}, Ll61/c;-><init>(Lcom/whoop/design/util/TextResource;FFFLa71/a;)V

    invoke-interface {v4, v7}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_0
    invoke-virtual {v2}, Lcom/whoop/design/models/items/graph/plot/band/BandSegmentModel;->getStyle()Lcom/whoop/design/models/items/graph/plot/band/BandPlotStyle;

    move-result-object v3

    if-nez v3, :cond_1

    move-object v3, p1

    :cond_1
    invoke-static {v3}, Lyb1/b;->k(Lcom/whoop/design/models/items/graph/plot/band/BandPlotStyle;)Lk61/a;

    move-result-object v3

    invoke-virtual {v2}, Lcom/whoop/design/models/items/graph/plot/band/BandSegmentModel;->getStyle()Lcom/whoop/design/models/items/graph/plot/band/BandPlotStyle;

    move-result-object v2

    if-nez v2, :cond_2

    move-object v2, p1

    :cond_2
    invoke-static {v2}, Lyb1/e;->a(Lcom/whoop/design/models/items/graph/plot/band/BandPlotStyle;)Lk61/c;

    move-result-object v2

    new-instance v5, Ll61/d;

    invoke-direct {v5, v4, v3, v2}, Ll61/d;-><init>(Ljava/util/List;Lk61/a;Lk61/c;)V

    invoke-interface {v0, v5}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_3
    return-object v0
.end method
