.class public abstract Lac1/c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u00a8\u0006\u0004"
    }
    d2 = {
        "Lcom/whoop/design/models/items/graph/plot/FinalMarkerPlotPointModel;",
        "Lo61/e;",
        "a",
        "(Lcom/whoop/design/models/items/graph/plot/FinalMarkerPlotPointModel;)Lo61/e;",
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
.method public static final a(Lcom/whoop/design/models/items/graph/plot/FinalMarkerPlotPointModel;)Lo61/e;
    .locals 3

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lo61/e;

    invoke-virtual {p0}, Lcom/whoop/design/models/items/graph/plot/FinalMarkerPlotPointModel;->getPositionY()F

    move-result v1

    invoke-virtual {p0}, Lcom/whoop/design/models/items/graph/plot/FinalMarkerPlotPointModel;->getStyle()Ljava/lang/String;

    move-result-object v2

    if-nez v2, :cond_0

    const-string v2, "STANDARD"

    :cond_0
    invoke-virtual {p0}, Lcom/whoop/design/models/items/graph/plot/FinalMarkerPlotPointModel;->getTheme()Lcom/whoop/design/models/items/graph/plot/MarkerTheme;

    move-result-object p0

    if-eqz p0, :cond_1

    invoke-virtual {p0}, Lcom/whoop/design/models/items/graph/plot/MarkerTheme;->getMarkerColor()Ly81/f;

    move-result-object p0

    goto :goto_0

    :cond_1
    const/4 p0, 0x0

    :goto_0
    invoke-direct {v0, v1, v2, p0}, Lo61/e;-><init>(FLjava/lang/String;Ly81/e;)V

    return-object v0
.end method
