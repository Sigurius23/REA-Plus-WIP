.class public abstract Lac1/b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0000\u00a2\u0006\u0004\u0008\u0003\u0010\u0004\u00a8\u0006\u0005"
    }
    d2 = {
        "Lcom/whoop/design/models/items/graph/plot/FinalMarkerPlotModel;",
        "plot",
        "Lj71/b$e;",
        "a",
        "(Lcom/whoop/design/models/items/graph/plot/FinalMarkerPlotModel;)Lj71/b$e;",
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
.method public static final a(Lcom/whoop/design/models/items/graph/plot/FinalMarkerPlotModel;)Lj71/b$e;
    .locals 7

    const-string v0, "plot"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/whoop/design/models/items/graph/plot/FinalMarkerPlotModel;->getId()Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_0

    const-string v0, "stress_final_marker"

    :cond_0
    move-object v4, v0

    invoke-virtual {p0}, Lcom/whoop/design/models/items/graph/plot/FinalMarkerPlotModel;->getMarkerLine()Lcom/whoop/design/models/items/graph/plot/FinalMarkerPlotLineModel;

    move-result-object v0

    invoke-static {v0}, Lac1/a;->a(Lcom/whoop/design/models/items/graph/plot/FinalMarkerPlotLineModel;)Lo61/a;

    move-result-object v2

    invoke-virtual {p0}, Lcom/whoop/design/models/items/graph/plot/FinalMarkerPlotModel;->getMarkerPoint()Lcom/whoop/design/models/items/graph/plot/FinalMarkerPlotPointModel;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-static {v0}, Lac1/c;->a(Lcom/whoop/design/models/items/graph/plot/FinalMarkerPlotPointModel;)Lo61/e;

    move-result-object v0

    :goto_0
    move-object v3, v0

    goto :goto_1

    :cond_1
    const/4 v0, 0x0

    goto :goto_0

    :goto_1
    invoke-virtual {p0}, Lcom/whoop/design/models/items/graph/plot/FinalMarkerPlotModel;->getHideWhileScrubbing()Ljava/lang/Boolean;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_2

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    move v6, v0

    goto :goto_2

    :cond_2
    move v6, v1

    :goto_2
    invoke-virtual {p0}, Lcom/whoop/design/models/items/graph/plot/FinalMarkerPlotModel;->getSkipScrubbing()Ljava/lang/Boolean;

    move-result-object p0

    if-eqz p0, :cond_3

    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    :cond_3
    move v5, v1

    new-instance v1, Lj71/b$e;

    invoke-direct/range {v1 .. v6}, Lj71/b$e;-><init>(Lo61/a;Lo61/e;Ljava/lang/String;ZZ)V

    return-object v1
.end method
