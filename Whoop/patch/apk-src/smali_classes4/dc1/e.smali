.class public abstract Ldc1/e;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0000\u00a2\u0006\u0004\u0008\u0003\u0010\u0004\u00a8\u0006\u0005"
    }
    d2 = {
        "Lcom/whoop/design/models/items/graph/plot/LinePlotModel;",
        "plot",
        "Lj71/b$g;",
        "a",
        "(Lcom/whoop/design/models/items/graph/plot/LinePlotModel;)Lj71/b$g;",
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
.method public static final a(Lcom/whoop/design/models/items/graph/plot/LinePlotModel;)Lj71/b$g;
    .locals 15

    const-string v0, "plot"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/whoop/design/models/items/graph/plot/LinePlotModel;->getSegments()Ljava/util/List;

    move-result-object v0

    invoke-virtual {p0}, Lcom/whoop/design/models/items/graph/plot/LinePlotModel;->getStyle()Lcom/whoop/design/models/items/graph/plot/line/LinePlotStyle;

    move-result-object v1

    invoke-virtual {p0}, Lcom/whoop/design/models/items/graph/plot/LinePlotModel;->getTheme()Lcom/whoop/design/models/items/graph/plot/line/LinePlotTheme;

    move-result-object v2

    invoke-virtual {p0}, Lcom/whoop/design/models/items/graph/plot/LinePlotModel;->getDiagonalPoints()Lcom/whoop/design/models/items/graph/plot/DiagonalPoints;

    move-result-object v3

    const/4 v4, 0x0

    if-eqz v3, :cond_0

    new-instance v5, Ll83/k;

    invoke-virtual {v3}, Lcom/whoop/design/models/items/graph/plot/DiagonalPoints;->getStartX()F

    move-result v6

    invoke-static {v6}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v6

    invoke-virtual {v3}, Lcom/whoop/design/models/items/graph/plot/DiagonalPoints;->getStartY()F

    move-result v3

    invoke-static {v3}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v3

    invoke-direct {v5, v6, v3}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    move-object v5, v4

    :goto_0
    invoke-virtual {p0}, Lcom/whoop/design/models/items/graph/plot/LinePlotModel;->getDiagonalPoints()Lcom/whoop/design/models/items/graph/plot/DiagonalPoints;

    move-result-object v3

    if-eqz v3, :cond_1

    new-instance v4, Ll83/k;

    invoke-virtual {v3}, Lcom/whoop/design/models/items/graph/plot/DiagonalPoints;->getEndX()F

    move-result v6

    invoke-static {v6}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v6

    invoke-virtual {v3}, Lcom/whoop/design/models/items/graph/plot/DiagonalPoints;->getEndY()F

    move-result v3

    invoke-static {v3}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v3

    invoke-direct {v4, v6, v3}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    :cond_1
    invoke-static {v0, v1, v2, v5, v4}, Ldc1/f;->a(Ljava/util/List;Lcom/whoop/design/models/items/graph/plot/line/LinePlotStyle;Lcom/whoop/design/models/items/graph/plot/line/LinePlotTheme;Ll83/k;Ll83/k;)Ljava/util/List;

    move-result-object v7

    invoke-virtual {p0}, Lcom/whoop/design/models/items/graph/plot/LinePlotModel;->getId()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {p0}, Lcom/whoop/design/models/items/graph/plot/LinePlotModel;->getHideWhileScrubbing()Ljava/lang/Boolean;

    move-result-object v0

    const/4 v1, 0x0

    if-eqz v0, :cond_2

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    move v12, v0

    goto :goto_1

    :cond_2
    move v12, v1

    :goto_1
    invoke-virtual {p0}, Lcom/whoop/design/models/items/graph/plot/LinePlotModel;->getSkipScrubbing()Ljava/lang/Boolean;

    move-result-object p0

    if-eqz p0, :cond_3

    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    :cond_3
    move v9, v1

    new-instance v6, Lj71/b$g;

    const/16 v13, 0x18

    const/4 v14, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    invoke-direct/range {v6 .. v14}, Lj71/b$g;-><init>(Ljava/util/List;Ljava/lang/String;ZLi71/g;Li71/h;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v6
.end method
