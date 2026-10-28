.class public abstract Lwb1/i;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u001a)\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0000\u00a2\u0006\u0004\u0008\u0007\u0010\u0008\u00a8\u0006\t"
    }
    d2 = {
        "Lcom/whoop/design/models/items/graph/plane/GraphPlaneModel;",
        "graphPlaneModel",
        "",
        "hasScrubbableData",
        "Lcom/whoop/design/models/items/graph/plane/button/GraphButtons;",
        "graphButtons",
        "Lj61/h;",
        "a",
        "(Lcom/whoop/design/models/items/graph/plane/GraphPlaneModel;ZLcom/whoop/design/models/items/graph/plane/button/GraphButtons;)Lj61/h;",
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
.method public static final a(Lcom/whoop/design/models/items/graph/plane/GraphPlaneModel;ZLcom/whoop/design/models/items/graph/plane/button/GraphButtons;)Lj61/h;
    .locals 24

    const-string v0, "graphPlaneModel"

    move-object/from16 v1, p0

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v2, Lj61/g;

    invoke-virtual {v1}, Lcom/whoop/design/models/items/graph/plane/GraphPlaneModel;->getAccessibilityInfo()Lcom/whoop/design/models/items/graph/plane/GraphAccessibilityModel;

    move-result-object v0

    invoke-virtual {v0}, Lcom/whoop/design/models/items/graph/plane/GraphAccessibilityModel;->getLabel()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v3

    const/16 v7, 0xe

    const/4 v8, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-direct/range {v2 .. v8}, Lj61/g;-><init>(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {v1}, Lcom/whoop/design/models/items/graph/plane/GraphPlaneModel;->getEndYAxis()Lcom/whoop/design/models/items/graph/plane/axis/GraphAxisModel;

    move-result-object v0

    sget-object v3, Lwb1/c;->END_Y:Lwb1/c;

    invoke-static {v0, v3}, Lwb1/f;->a(Lcom/whoop/design/models/items/graph/plane/axis/GraphAxisModel;Lwb1/c;)Lg61/b;

    move-result-object v3

    invoke-virtual {v1}, Lcom/whoop/design/models/items/graph/plane/GraphPlaneModel;->getStartYAxis()Lcom/whoop/design/models/items/graph/plane/axis/GraphAxisModel;

    move-result-object v0

    sget-object v4, Lwb1/c;->START_Y:Lwb1/c;

    invoke-static {v0, v4}, Lwb1/f;->a(Lcom/whoop/design/models/items/graph/plane/axis/GraphAxisModel;Lwb1/c;)Lg61/b;

    move-result-object v0

    invoke-virtual {v1}, Lcom/whoop/design/models/items/graph/plane/GraphPlaneModel;->getBottomXAxis()Lcom/whoop/design/models/items/graph/plane/axis/GraphAxisModel;

    move-result-object v4

    sget-object v5, Lwb1/c;->BOTTOM_X:Lwb1/c;

    invoke-static {v4, v5}, Lwb1/f;->a(Lcom/whoop/design/models/items/graph/plane/axis/GraphAxisModel;Lwb1/c;)Lg61/b;

    move-result-object v4

    invoke-virtual {v1}, Lcom/whoop/design/models/items/graph/plane/GraphPlaneModel;->getTopXAxis()Lcom/whoop/design/models/items/graph/plane/axis/GraphAxisModel;

    move-result-object v5

    sget-object v6, Lwb1/c;->TOP_X:Lwb1/c;

    invoke-static {v5, v6}, Lwb1/f;->a(Lcom/whoop/design/models/items/graph/plane/axis/GraphAxisModel;Lwb1/c;)Lg61/b;

    move-result-object v5

    invoke-static/range {p2 .. p2}, Lwb1/g;->a(Lcom/whoop/design/models/items/graph/plane/button/GraphButtons;)Lg61/g;

    move-result-object v12

    new-instance v6, Lh2/c;

    const v7, 0x3d99999a    # 0.075f

    const v8, 0x3d23d70a    # 0.04f

    invoke-direct {v6, v7, v8, v7, v8}, Lh2/c;-><init>(FFFF)V

    invoke-virtual {v1}, Lcom/whoop/design/models/items/graph/plane/GraphPlaneModel;->getLines()Ljava/util/List;

    move-result-object v7

    invoke-static {v7}, Lwb1/h;->b(Ljava/util/List;)Ljava/util/List;

    move-result-object v7

    invoke-virtual {v1}, Lcom/whoop/design/models/items/graph/plane/GraphPlaneModel;->getAnnotations()Ljava/util/List;

    move-result-object v1

    invoke-static {v1}, Lwb1/a;->a(Ljava/util/List;)Ljava/util/List;

    move-result-object v8

    new-instance v1, Lj61/h;

    if-nez v4, :cond_0

    new-instance v13, Lg61/b;

    const/16 v22, 0xff

    const/16 v23, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    invoke-direct/range {v13 .. v23}, Lg61/b;-><init>(FLjava/util/List;FLg61/d;Lcom/whoop/design/util/TextResource;ZLg61/c;Ly81/e;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object v4, v13

    :cond_0
    const/16 v16, 0x1a00

    const/16 v17, 0x0

    const/4 v11, 0x0

    const-wide/16 v13, 0x0

    const/4 v15, 0x0

    move/from16 v10, p1

    move-object v9, v2

    move-object v2, v0

    invoke-direct/range {v1 .. v17}, Lj61/h;-><init>(Lg61/b;Lg61/b;Lg61/b;Lg61/b;Lh2/c;Ljava/util/List;Ljava/util/List;Lj61/g;ZZLg61/g;JFILkotlin/jvm/internal/DefaultConstructorMarker;)V

    return-object v1
.end method
