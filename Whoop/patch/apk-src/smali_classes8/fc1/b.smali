.class public abstract Lfc1/b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0000\u00a2\u0006\u0004\u0008\u0003\u0010\u0004\u00a8\u0006\u0005"
    }
    d2 = {
        "Lcom/whoop/design/models/items/graph/plot/ProgressPlotModel;",
        "graphPlot",
        "Lj71/b$j;",
        "a",
        "(Lcom/whoop/design/models/items/graph/plot/ProgressPlotModel;)Lj71/b$j;",
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
.method public static final a(Lcom/whoop/design/models/items/graph/plot/ProgressPlotModel;)Lj71/b$j;
    .locals 9

    const-string v0, "graphPlot"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lz61/c;

    invoke-virtual {p0}, Lcom/whoop/design/models/items/graph/plot/ProgressPlotModel;->getStyle()Lcom/whoop/design/models/items/graph/plot/progress/ProgressPlotStyle;

    move-result-object v0

    invoke-static {v0}, Lfc1/a;->a(Lcom/whoop/design/models/items/graph/plot/progress/ProgressPlotStyle;)Ly81/e;

    move-result-object v2

    invoke-virtual {p0}, Lcom/whoop/design/models/items/graph/plot/ProgressPlotModel;->getRangeMin()D

    move-result-wide v3

    double-to-float v3, v3

    invoke-virtual {p0}, Lcom/whoop/design/models/items/graph/plot/ProgressPlotModel;->getRangeMax()D

    move-result-wide v4

    double-to-float v4, v4

    invoke-virtual {p0}, Lcom/whoop/design/models/items/graph/plot/ProgressPlotModel;->getCurrentValue()Ljava/lang/Double;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/lang/Double;->doubleValue()D

    move-result-wide v5

    double-to-float v0, v5

    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v0

    :goto_0
    move-object v5, v0

    goto :goto_1

    :cond_0
    const/4 v0, 0x0

    goto :goto_0

    :goto_1
    invoke-virtual {p0}, Lcom/whoop/design/models/items/graph/plot/ProgressPlotModel;->getHeight()D

    move-result-wide v6

    double-to-float v6, v6

    invoke-virtual {p0}, Lcom/whoop/design/models/items/graph/plot/ProgressPlotModel;->getYposition()D

    move-result-wide v7

    double-to-float v7, v7

    invoke-direct/range {v1 .. v7}, Lz61/c;-><init>(Ly81/e;FFLjava/lang/Float;FF)V

    invoke-virtual {p0}, Lcom/whoop/design/models/items/graph/plot/ProgressPlotModel;->getId()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0}, Lcom/whoop/design/models/items/graph/plot/ProgressPlotModel;->getHideWhileScrubbing()Ljava/lang/Boolean;

    move-result-object v2

    const/4 v3, 0x0

    if-eqz v2, :cond_1

    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v2

    goto :goto_2

    :cond_1
    move v2, v3

    :goto_2
    invoke-virtual {p0}, Lcom/whoop/design/models/items/graph/plot/ProgressPlotModel;->getSkipScrubbing()Ljava/lang/Boolean;

    move-result-object p0

    if-eqz p0, :cond_2

    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v3

    :cond_2
    new-instance p0, Lj71/b$j;

    invoke-direct {p0, v1, v0, v3, v2}, Lj71/b$j;-><init>(Lz61/c;Ljava/lang/String;ZZ)V

    return-object p0
.end method
