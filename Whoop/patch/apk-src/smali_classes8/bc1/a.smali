.class public abstract Lbc1/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0000\u00a2\u0006\u0004\u0008\u0003\u0010\u0004\u00a8\u0006\u0005"
    }
    d2 = {
        "Lcom/whoop/design/models/items/graph/plot/GridLinePlotModel;",
        "model",
        "Lj71/b$h;",
        "a",
        "(Lcom/whoop/design/models/items/graph/plot/GridLinePlotModel;)Lj71/b$h;",
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
.method public static final a(Lcom/whoop/design/models/items/graph/plot/GridLinePlotModel;)Lj71/b$h;
    .locals 11

    const-string v0, "model"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/whoop/design/models/items/graph/plot/GridLinePlotModel;->getHorizontalLines()Ljava/util/List;

    move-result-object v2

    invoke-virtual {p0}, Lcom/whoop/design/models/items/graph/plot/GridLinePlotModel;->getVerticalLines()Ljava/util/List;

    move-result-object v3

    invoke-virtual {p0}, Lcom/whoop/design/models/items/graph/plot/GridLinePlotModel;->getId()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {p0}, Lcom/whoop/design/models/items/graph/plot/GridLinePlotModel;->getHideWhileScrubbing()Ljava/lang/Boolean;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    move v8, v0

    goto :goto_0

    :cond_0
    move v8, v1

    :goto_0
    invoke-virtual {p0}, Lcom/whoop/design/models/items/graph/plot/GridLinePlotModel;->getSkipScrubbing()Ljava/lang/Boolean;

    move-result-object p0

    if-eqz p0, :cond_1

    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    :cond_1
    move v7, v1

    new-instance v1, Lj71/b$h;

    const/16 v9, 0xc

    const/4 v10, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-direct/range {v1 .. v10}, Lj71/b$h;-><init>(Ljava/util/List;Ljava/util/List;Ly81/e;FLjava/lang/String;ZZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v1
.end method
