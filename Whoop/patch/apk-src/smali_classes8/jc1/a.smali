.class public abstract Ljc1/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0000\u00a2\u0006\u0004\u0008\u0003\u0010\u0004\u00a8\u0006\u0005"
    }
    d2 = {
        "Lcom/whoop/design/models/items/graph/plot/XLabelPlotModel;",
        "model",
        "Lj71/b$m;",
        "a",
        "(Lcom/whoop/design/models/items/graph/plot/XLabelPlotModel;)Lj71/b$m;",
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
.method public static final a(Lcom/whoop/design/models/items/graph/plot/XLabelPlotModel;)Lj71/b$m;
    .locals 14

    const-string v0, "model"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/whoop/design/models/items/graph/plot/XLabelPlotModel;->getZoomBuckets()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    new-instance v1, Ljava/util/ArrayList;

    const/16 v2, 0xa

    invoke-static {v0, v2}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v3

    invoke-direct {v1, v3}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lcom/whoop/design/models/items/graph/plot/XPlotZoomBucketsModel;

    invoke-virtual {v3}, Lcom/whoop/design/models/items/graph/plot/XPlotZoomBucketsModel;->getZoomThreshold()D

    move-result-wide v4

    invoke-virtual {v3}, Lcom/whoop/design/models/items/graph/plot/XPlotZoomBucketsModel;->getAxisLabels()Ljava/util/List;

    move-result-object v3

    check-cast v3, Ljava/lang/Iterable;

    new-instance v6, Ljava/util/ArrayList;

    invoke-static {v3, v2}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v7

    invoke-direct {v6, v7}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_1
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_0

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    move-object v8, v7

    check-cast v8, Lcom/whoop/design/models/items/graph/plane/axis/label/AxisLabelModel;

    sget-object v9, Lwb1/c;->BOTTOM_X:Lwb1/c;

    sget-object v10, Lg61/d;->STANDARD:Lg61/d;

    const/16 v12, 0x8

    const/4 v13, 0x0

    const/4 v11, 0x0

    invoke-static/range {v8 .. v13}, Lwb1/e;->c(Lcom/whoop/design/models/items/graph/plane/axis/label/AxisLabelModel;Lwb1/c;Lg61/d;Ly81/e;ILjava/lang/Object;)Lyy0/c;

    move-result-object v7

    invoke-interface {v6, v7}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_1

    :cond_0
    new-instance v3, Lg71/d;

    invoke-direct {v3, v4, v5, v6}, Lg71/d;-><init>(DLjava/util/List;)V

    invoke-interface {v1, v3}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_1
    invoke-virtual {p0}, Lcom/whoop/design/models/items/graph/plot/XLabelPlotModel;->getId()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0}, Lcom/whoop/design/models/items/graph/plot/XLabelPlotModel;->getHideWhileScrubbing()Ljava/lang/Boolean;

    move-result-object v2

    const/4 v3, 0x0

    if-eqz v2, :cond_2

    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v2

    goto :goto_2

    :cond_2
    move v2, v3

    :goto_2
    invoke-virtual {p0}, Lcom/whoop/design/models/items/graph/plot/XLabelPlotModel;->getSkipScrubbing()Ljava/lang/Boolean;

    move-result-object p0

    if-eqz p0, :cond_3

    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v3

    :cond_3
    new-instance p0, Lj71/b$m;

    invoke-direct {p0, v1, v0, v3, v2}, Lj71/b$m;-><init>(Ljava/util/List;Ljava/lang/String;ZZ)V

    return-object p0
.end method
