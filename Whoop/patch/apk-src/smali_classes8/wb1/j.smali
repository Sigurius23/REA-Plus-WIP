.class public abstract Lwb1/j;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u001a\u001f\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0000\u00a2\u0006\u0004\u0008\u0005\u0010\u0006\u00a8\u0006\u0007"
    }
    d2 = {
        "Lcom/whoop/design/models/items/graph/ScrollableGraphPlaneModel;",
        "graphPlaneModel",
        "",
        "hasScrubbableData",
        "Lh71/k;",
        "a",
        "(Lcom/whoop/design/models/items/graph/ScrollableGraphPlaneModel;Z)Lh71/k;",
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
.method public static final a(Lcom/whoop/design/models/items/graph/ScrollableGraphPlaneModel;Z)Lh71/k;
    .locals 10

    const-string v0, "graphPlaneModel"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Lj61/g;

    invoke-virtual {p0}, Lcom/whoop/design/models/items/graph/ScrollableGraphPlaneModel;->getAccessibilityInfo()Lcom/whoop/design/models/items/graph/plane/GraphAccessibilityModel;

    move-result-object v0

    invoke-virtual {v0}, Lcom/whoop/design/models/items/graph/plane/GraphAccessibilityModel;->getLabel()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v2

    const/16 v6, 0xe

    const/4 v7, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-direct/range {v1 .. v7}, Lj61/g;-><init>(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {p0}, Lcom/whoop/design/models/items/graph/ScrollableGraphPlaneModel;->getStartYaxis()Lcom/whoop/design/models/items/graph/plane/axis/GraphAxisModel;

    move-result-object p0

    sget-object v0, Lwb1/c;->START_Y:Lwb1/c;

    const v2, 0x3d4ccccd    # 0.05f

    invoke-static {v2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v2

    invoke-static {p0, v0, v2}, Lwb1/f;->c(Lcom/whoop/design/models/items/graph/plane/axis/GraphAxisModel;Lwb1/c;Ljava/lang/Float;)Lg61/b;

    move-result-object v2

    move-object v4, v1

    new-instance v1, Lh71/k;

    const/16 v8, 0x32

    const/4 v9, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    move v5, p1

    invoke-direct/range {v1 .. v9}, Lh71/k;-><init>(Lg61/b;Lh2/c;Lj61/g;ZZZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v1
.end method
