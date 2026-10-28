.class public abstract Lxb1/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0000\u00a2\u0006\u0004\u0008\u0003\u0010\u0004\u00a8\u0006\u0005"
    }
    d2 = {
        "Lcom/whoop/design/models/items/graph/plot/GraphPlotLabelModel;",
        "graphPlotLabelModel",
        "Lu61/d;",
        "a",
        "(Lcom/whoop/design/models/items/graph/plot/GraphPlotLabelModel;)Lu61/d;",
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
.method public static final a(Lcom/whoop/design/models/items/graph/plot/GraphPlotLabelModel;)Lu61/d;
    .locals 4

    const-string v0, "graphPlotLabelModel"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lu61/d;

    invoke-virtual {p0}, Lcom/whoop/design/models/items/graph/plot/GraphPlotLabelModel;->getLabel()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v1

    invoke-virtual {p0}, Lcom/whoop/design/models/items/graph/plot/GraphPlotLabelModel;->getLabelStyle()Lcom/whoop/design/models/items/graph/plot/GraphPlotLabelStyle;

    move-result-object v2

    invoke-static {v2}, Lxb1/b;->a(Lcom/whoop/design/models/items/graph/plot/GraphPlotLabelStyle;)Ly81/e;

    move-result-object v2

    invoke-virtual {p0}, Lcom/whoop/design/models/items/graph/plot/GraphPlotLabelModel;->getShowBackgroundGradient()Z

    move-result v3

    invoke-virtual {p0}, Lcom/whoop/design/models/items/graph/plot/GraphPlotLabelModel;->getRenderedBelow()Z

    move-result p0

    invoke-direct {v0, v1, v2, v3, p0}, Lu61/d;-><init>(Lcom/whoop/design/util/TextResource;Ly81/e;ZZ)V

    return-object v0
.end method
