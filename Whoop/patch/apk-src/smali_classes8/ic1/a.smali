.class public abstract Lic1/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0000\u00a2\u0006\u0004\u0008\u0003\u0010\u0004\u00a8\u0006\u0005"
    }
    d2 = {
        "Lcom/whoop/design/models/items/graph/plot/VerticalMarkerPlotModel;",
        "model",
        "Lj71/b$l;",
        "a",
        "(Lcom/whoop/design/models/items/graph/plot/VerticalMarkerPlotModel;)Lj71/b$l;",
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
.method public static final a(Lcom/whoop/design/models/items/graph/plot/VerticalMarkerPlotModel;)Lj71/b$l;
    .locals 10

    const-string v0, "model"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/whoop/design/models/items/graph/plot/VerticalMarkerPlotModel;->getVerticalMarkers()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    new-instance v1, Ljava/util/ArrayList;

    const/16 v2, 0xa

    invoke-static {v0, v2}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v2

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    const/4 v3, 0x0

    if-eqz v2, :cond_3

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/whoop/design/models/items/graph/plot/VerticalMarkerModel;

    invoke-virtual {v2}, Lcom/whoop/design/models/items/graph/plot/VerticalMarkerModel;->getMarkerType()Ljava/lang/String;

    move-result-object v4

    sget-object v5, Lf71/f;->STRAIN:Lf71/f;

    invoke-static {}, Lf71/f;->values()[Lf71/f;

    move-result-object v6

    array-length v7, v6

    :goto_1
    if-ge v3, v7, :cond_1

    aget-object v8, v6, v3

    invoke-virtual {v8}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v9

    invoke-static {v9, v4}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_0

    goto :goto_2

    :cond_0
    add-int/lit8 v3, v3, 0x1

    goto :goto_1

    :cond_1
    const/4 v8, 0x0

    :goto_2
    if-nez v8, :cond_2

    goto :goto_3

    :cond_2
    move-object v5, v8

    :goto_3
    new-instance v3, Lf71/e;

    invoke-virtual {v2}, Lcom/whoop/design/models/items/graph/plot/VerticalMarkerModel;->getXpercent()F

    move-result v4

    invoke-virtual {v2}, Lcom/whoop/design/models/items/graph/plot/VerticalMarkerModel;->getLabel()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v2}, Lcom/whoop/design/models/items/graph/plot/VerticalMarkerModel;->getSubLabel()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v3, v4, v5, v6, v2}, Lf71/e;-><init>(FLf71/f;Ljava/lang/String;Ljava/lang/String;)V

    invoke-interface {v1, v3}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_3
    invoke-virtual {p0}, Lcom/whoop/design/models/items/graph/plot/VerticalMarkerPlotModel;->getId()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0}, Lcom/whoop/design/models/items/graph/plot/VerticalMarkerPlotModel;->getHideWhileScrubbing()Ljava/lang/Boolean;

    move-result-object v2

    if-eqz v2, :cond_4

    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v2

    goto :goto_4

    :cond_4
    move v2, v3

    :goto_4
    invoke-virtual {p0}, Lcom/whoop/design/models/items/graph/plot/VerticalMarkerPlotModel;->getSkipScrubbing()Ljava/lang/Boolean;

    move-result-object p0

    if-eqz p0, :cond_5

    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v3

    :cond_5
    new-instance p0, Lj71/b$l;

    invoke-direct {p0, v1, v0, v3, v2}, Lj71/b$l;-><init>(Ljava/util/List;Ljava/lang/String;ZZ)V

    return-object p0
.end method
