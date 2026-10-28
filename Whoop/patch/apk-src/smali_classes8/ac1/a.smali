.class public abstract Lac1/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000\u00a2\u0006\u0004\u0008\u0002\u0010\u0003\u00a8\u0006\u0004"
    }
    d2 = {
        "Lcom/whoop/design/models/items/graph/plot/FinalMarkerPlotLineModel;",
        "Lo61/a;",
        "a",
        "(Lcom/whoop/design/models/items/graph/plot/FinalMarkerPlotLineModel;)Lo61/a;",
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
.method public static final a(Lcom/whoop/design/models/items/graph/plot/FinalMarkerPlotLineModel;)Lo61/a;
    .locals 2

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lo61/a;

    invoke-virtual {p0}, Lcom/whoop/design/models/items/graph/plot/FinalMarkerPlotLineModel;->getPosition()Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_0

    const-string v1, "END"

    :cond_0
    invoke-virtual {p0}, Lcom/whoop/design/models/items/graph/plot/FinalMarkerPlotLineModel;->getStyle()Ljava/lang/String;

    move-result-object p0

    if-nez p0, :cond_1

    const-string p0, "STANDARD"

    :cond_1
    invoke-direct {v0, v1, p0}, Lo61/a;-><init>(Ljava/lang/String;Ljava/lang/String;)V

    return-object v0
.end method
