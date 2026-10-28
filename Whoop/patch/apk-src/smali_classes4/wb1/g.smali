.class public abstract Lwb1/g;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u001a\u001b\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0008\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\u0000\u00a2\u0006\u0004\u0008\u0003\u0010\u0004\u00a8\u0006\u0005"
    }
    d2 = {
        "Lcom/whoop/design/models/items/graph/plane/button/GraphButtons;",
        "graphButtons",
        "Lg61/g;",
        "a",
        "(Lcom/whoop/design/models/items/graph/plane/button/GraphButtons;)Lg61/g;",
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
.method public static final a(Lcom/whoop/design/models/items/graph/plane/button/GraphButtons;)Lg61/g;
    .locals 12

    const/4 v0, 0x0

    if-eqz p0, :cond_7

    invoke-virtual {p0}, Lcom/whoop/design/models/items/graph/plane/button/GraphButtons;->getPreviousButton()Lcom/whoop/design/models/items/graph/plane/button/GraphButton;

    move-result-object v1

    const/4 v2, 0x1

    if-eqz v1, :cond_0

    invoke-virtual {v1}, Lcom/whoop/design/models/items/graph/plane/button/GraphButton;->getIcon()Ljava/lang/String;

    move-result-object v1

    invoke-static {v1, v0, v2, v0}, Lgz0/n0;->f(Ljava/lang/String;Lgz0/m0;ILjava/lang/Object;)I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    goto :goto_0

    :cond_0
    move-object v1, v0

    :goto_0
    invoke-virtual {p0}, Lcom/whoop/design/models/items/graph/plane/button/GraphButtons;->getNextButton()Lcom/whoop/design/models/items/graph/plane/button/GraphButton;

    move-result-object v3

    if-eqz v3, :cond_1

    invoke-virtual {v3}, Lcom/whoop/design/models/items/graph/plane/button/GraphButton;->getIcon()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3, v0, v2, v0}, Lgz0/n0;->f(Ljava/lang/String;Lgz0/m0;ILjava/lang/Object;)I

    move-result v3

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    goto :goto_1

    :cond_1
    move-object v3, v0

    :goto_1
    invoke-virtual {p0}, Lcom/whoop/design/models/items/graph/plane/button/GraphButtons;->getGraphPlaneButtons()Ljava/util/List;

    move-result-object p0

    if-eqz p0, :cond_6

    check-cast p0, Ljava/lang/Iterable;

    new-instance v4, Ljava/util/ArrayList;

    const/16 v5, 0xa

    invoke-static {p0, v5}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v5

    invoke-direct {v4, v5}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_2
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_5

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lcom/whoop/design/models/items/graph/plane/button/GraphButton;

    invoke-static {}, Lg61/a;->values()[Lg61/a;

    move-result-object v6

    array-length v7, v6

    const/4 v8, 0x0

    :goto_3
    if-ge v8, v7, :cond_3

    aget-object v9, v6, v8

    invoke-virtual {v9}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v5}, Lcom/whoop/design/models/items/graph/plane/button/GraphButton;->getId()Ljava/lang/String;

    move-result-object v11

    invoke-static {v10, v11}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_2

    goto :goto_4

    :cond_2
    add-int/lit8 v8, v8, 0x1

    goto :goto_3

    :cond_3
    move-object v9, v0

    :goto_4
    if-nez v9, :cond_4

    sget-object v9, Lg61/a;->UNKNOWN:Lg61/a;

    :cond_4
    invoke-virtual {v5}, Lcom/whoop/design/models/items/graph/plane/button/GraphButton;->getIcon()Ljava/lang/String;

    move-result-object v6

    invoke-static {v6, v0, v2, v0}, Lgz0/n0;->f(Ljava/lang/String;Lgz0/m0;ILjava/lang/Object;)I

    move-result v6

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-virtual {v5}, Lcom/whoop/design/models/items/graph/plane/button/GraphButton;->getPositionX()Ljava/lang/Float;

    move-result-object v7

    invoke-virtual {v5}, Lcom/whoop/design/models/items/graph/plane/button/GraphButton;->getPositionY()Ljava/lang/Float;

    move-result-object v5

    new-instance v8, Lg61/e;

    invoke-direct {v8, v9, v6, v7, v5}, Lg61/e;-><init>(Lg61/a;Ljava/lang/Integer;Ljava/lang/Float;Ljava/lang/Float;)V

    invoke-virtual {v4, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_2

    :cond_5
    move-object v0, v4

    :cond_6
    new-instance p0, Lg61/g;

    invoke-direct {p0, v1, v3, v0}, Lg61/g;-><init>(Ljava/lang/Integer;Ljava/lang/Integer;Ljava/util/List;)V

    return-object p0

    :cond_7
    return-object v0
.end method
