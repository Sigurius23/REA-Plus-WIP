.class public abstract Lwb1/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0012\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u001a!\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u00002\u000c\u0010\u0002\u001a\u0008\u0012\u0004\u0012\u00020\u00010\u0000\u00a2\u0006\u0004\u0008\u0004\u0010\u0005\u00a8\u0006\u0006"
    }
    d2 = {
        "",
        "Lcom/whoop/design/models/items/graph/plane/annotations/GraphAnnotationModel;",
        "annotations",
        "Lj61/c;",
        "a",
        "(Ljava/util/List;)Ljava/util/List;",
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
.method public static final a(Ljava/util/List;)Ljava/util/List;
    .locals 21
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/whoop/design/models/items/graph/plane/annotations/GraphAnnotationModel;",
            ">;)",
            "Ljava/util/List<",
            "Lj61/c;",
            ">;"
        }
    .end annotation

    move-object/from16 v0, p0

    const-string v1, "annotations"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

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

    if-eqz v2, :cond_2

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/whoop/design/models/items/graph/plane/annotations/GraphAnnotationModel;

    invoke-virtual {v2}, Lcom/whoop/design/models/items/graph/plane/annotations/GraphAnnotationModel;->getXPosition()D

    move-result-wide v3

    double-to-float v6, v3

    invoke-virtual {v2}, Lcom/whoop/design/models/items/graph/plane/annotations/GraphAnnotationModel;->getYPosition()D

    move-result-wide v3

    double-to-float v7, v3

    invoke-virtual {v2}, Lcom/whoop/design/models/items/graph/plane/annotations/GraphAnnotationModel;->getWidth()D

    move-result-wide v3

    double-to-float v8, v3

    invoke-virtual {v2}, Lcom/whoop/design/models/items/graph/plane/annotations/GraphAnnotationModel;->getHeight()D

    move-result-wide v3

    double-to-float v9, v3

    invoke-virtual {v2}, Lcom/whoop/design/models/items/graph/plane/annotations/GraphAnnotationModel;->getDimension()Lj61/a;

    move-result-object v11

    invoke-virtual {v2}, Lcom/whoop/design/models/items/graph/plane/annotations/GraphAnnotationModel;->getStyle()Lj61/d;

    move-result-object v3

    invoke-static {v3}, Lwb1/d;->a(Lj61/d;)Ly81/e;

    move-result-object v10

    invoke-virtual {v2}, Lcom/whoop/design/models/items/graph/plane/annotations/GraphAnnotationModel;->getType()Lj61/e;

    move-result-object v12

    invoke-virtual {v2}, Lcom/whoop/design/models/items/graph/plane/annotations/GraphAnnotationModel;->getAlignment()Lcom/whoop/design/models/items/graph/plane/annotations/GraphAnnotationLabelAlignment;

    move-result-object v3

    sget-object v4, Lcom/whoop/design/models/items/graph/plane/annotations/GraphAnnotationLabelAlignment;->LEFT:Lcom/whoop/design/models/items/graph/plane/annotations/GraphAnnotationLabelAlignment;

    if-ne v3, v4, :cond_0

    invoke-virtual {v2}, Lcom/whoop/design/models/items/graph/plane/annotations/GraphAnnotationModel;->getLabel()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v3

    :goto_1
    move-object v13, v3

    goto :goto_2

    :cond_0
    invoke-static {}, Lcom/whoop/design/util/b;->a()Lcom/whoop/design/util/TextResource;

    move-result-object v3

    goto :goto_1

    :goto_2
    invoke-virtual {v2}, Lcom/whoop/design/models/items/graph/plane/annotations/GraphAnnotationModel;->getAlignment()Lcom/whoop/design/models/items/graph/plane/annotations/GraphAnnotationLabelAlignment;

    move-result-object v3

    sget-object v4, Lcom/whoop/design/models/items/graph/plane/annotations/GraphAnnotationLabelAlignment;->RIGHT:Lcom/whoop/design/models/items/graph/plane/annotations/GraphAnnotationLabelAlignment;

    if-ne v3, v4, :cond_1

    invoke-virtual {v2}, Lcom/whoop/design/models/items/graph/plane/annotations/GraphAnnotationModel;->getLabel()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v3

    :goto_3
    move-object v14, v3

    goto :goto_4

    :cond_1
    invoke-static {}, Lcom/whoop/design/util/b;->a()Lcom/whoop/design/util/TextResource;

    move-result-object v3

    goto :goto_3

    :goto_4
    invoke-virtual {v2}, Lcom/whoop/design/models/items/graph/plane/annotations/GraphAnnotationModel;->getSubLabel()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v15

    invoke-virtual {v2}, Lcom/whoop/design/models/items/graph/plane/annotations/GraphAnnotationModel;->getLabelStyle()Lj61/b;

    move-result-object v16

    new-instance v5, Lj61/c;

    const/16 v19, 0x1800

    const/16 v20, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    invoke-direct/range {v5 .. v20}, Lj61/c;-><init>(FFFFLy81/e;Lj61/a;Lj61/e;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lj61/b;ZFILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {v1, v5}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_2
    return-object v1
.end method
