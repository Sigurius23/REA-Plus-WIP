.class public abstract Lyb1/c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0000\u00a2\u0006\u0004\u0008\u0003\u0010\u0004\u001a\u0017\u0010\u0006\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0005H\u0000\u00a2\u0006\u0004\u0008\u0006\u0010\u0007\u00a8\u0006\u0008"
    }
    d2 = {
        "Lcom/whoop/design/models/items/graph/plot/BandPlotModel;",
        "plot",
        "Lj71/b$a;",
        "a",
        "(Lcom/whoop/design/models/items/graph/plot/BandPlotModel;)Lj71/b$a;",
        "Lcom/whoop/design/models/items/graph/plot/CenterScrubBandPlotModel;",
        "b",
        "(Lcom/whoop/design/models/items/graph/plot/CenterScrubBandPlotModel;)Lj71/b$a;",
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
.method public static final a(Lcom/whoop/design/models/items/graph/plot/BandPlotModel;)Lj71/b$a;
    .locals 8

    const-string v0, "plot"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/whoop/design/models/items/graph/plot/BandPlotModel;->getSegments()Ljava/util/List;

    move-result-object v0

    invoke-virtual {p0}, Lcom/whoop/design/models/items/graph/plot/BandPlotModel;->getStyle()Lcom/whoop/design/models/items/graph/plot/band/BandPlotStyle;

    move-result-object v1

    invoke-static {v0, v1}, Lyb1/d;->a(Ljava/util/List;Lcom/whoop/design/models/items/graph/plot/band/BandPlotStyle;)Ljava/util/List;

    move-result-object v3

    sget-object v4, Lj71/a;->TWO_DOTS:Lj71/a;

    invoke-virtual {p0}, Lcom/whoop/design/models/items/graph/plot/BandPlotModel;->getId()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {p0}, Lcom/whoop/design/models/items/graph/plot/BandPlotModel;->getHideWhileScrubbing()Ljava/lang/Boolean;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    move v7, v0

    goto :goto_0

    :cond_0
    move v7, v1

    :goto_0
    invoke-virtual {p0}, Lcom/whoop/design/models/items/graph/plot/BandPlotModel;->getSkipScrubbing()Ljava/lang/Boolean;

    move-result-object p0

    if-eqz p0, :cond_1

    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    :cond_1
    move v6, v1

    new-instance v2, Lj71/b$a;

    invoke-direct/range {v2 .. v7}, Lj71/b$a;-><init>(Ljava/util/List;Lj71/a;Ljava/lang/String;ZZ)V

    return-object v2
.end method

.method public static final b(Lcom/whoop/design/models/items/graph/plot/CenterScrubBandPlotModel;)Lj71/b$a;
    .locals 8

    const-string v0, "plot"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/whoop/design/models/items/graph/plot/CenterScrubBandPlotModel;->getSegments()Ljava/util/List;

    move-result-object v0

    invoke-virtual {p0}, Lcom/whoop/design/models/items/graph/plot/CenterScrubBandPlotModel;->getStyle()Lcom/whoop/design/models/items/graph/plot/band/BandPlotStyle;

    move-result-object v1

    invoke-static {v0, v1}, Lyb1/d;->a(Ljava/util/List;Lcom/whoop/design/models/items/graph/plot/band/BandPlotStyle;)Ljava/util/List;

    move-result-object v3

    sget-object v4, Lj71/a;->CENTER_DOT:Lj71/a;

    invoke-virtual {p0}, Lcom/whoop/design/models/items/graph/plot/CenterScrubBandPlotModel;->getId()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {p0}, Lcom/whoop/design/models/items/graph/plot/CenterScrubBandPlotModel;->getHideWhileScrubbing()Ljava/lang/Boolean;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    move v7, v0

    goto :goto_0

    :cond_0
    move v7, v1

    :goto_0
    invoke-virtual {p0}, Lcom/whoop/design/models/items/graph/plot/CenterScrubBandPlotModel;->getSkipScrubbing()Ljava/lang/Boolean;

    move-result-object p0

    if-eqz p0, :cond_1

    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    :cond_1
    move v6, v1

    new-instance v2, Lj71/b$a;

    invoke-direct/range {v2 .. v7}, Lj71/b$a;-><init>(Ljava/util/List;Lj71/a;Ljava/lang/String;ZZ)V

    return-object v2
.end method
