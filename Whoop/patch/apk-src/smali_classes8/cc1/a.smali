.class public abstract Lcc1/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lcc1/a$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0000\u00a2\u0006\u0004\u0008\u0003\u0010\u0004\u00a8\u0006\u0005"
    }
    d2 = {
        "Lcom/whoop/design/models/items/graph/plot/IconPlotModel;",
        "plot",
        "Lj71/b$f;",
        "a",
        "(Lcom/whoop/design/models/items/graph/plot/IconPlotModel;)Lj71/b$f;",
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
.method public static final a(Lcom/whoop/design/models/items/graph/plot/IconPlotModel;)Lj71/b$f;
    .locals 13

    const-string v0, "plot"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lcom/whoop/design/models/items/graph/plot/IconPlotModel;->getPoints()Ljava/util/List;

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

    if-eqz v2, :cond_7

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/whoop/design/models/items/graph/plot/IconGroupModel;

    invoke-virtual {v2}, Lcom/whoop/design/models/items/graph/plot/IconGroupModel;->getIcon()Ljava/lang/String;

    move-result-object v4

    const/4 v5, 0x0

    if-eqz v4, :cond_3

    sget-object v6, Lgz0/m0;->CHECKMARK:Lgz0/m0;

    invoke-static {}, Lgz0/m0;->values()[Lgz0/m0;

    move-result-object v7

    array-length v8, v7

    :goto_1
    if-ge v3, v8, :cond_1

    aget-object v9, v7, v3

    invoke-virtual {v9}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v10

    invoke-static {v10, v4}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_0

    goto :goto_2

    :cond_0
    add-int/lit8 v3, v3, 0x1

    goto :goto_1

    :cond_1
    move-object v9, v5

    :goto_2
    if-nez v9, :cond_2

    goto :goto_3

    :cond_2
    move-object v6, v9

    :goto_3
    if-eqz v6, :cond_3

    invoke-virtual {v6}, Lgz0/m0;->toWhoopIcon()I

    move-result v3

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    :cond_3
    move-object v9, v5

    invoke-virtual {v2}, Lcom/whoop/design/models/items/graph/plot/IconGroupModel;->getStyle()Lcom/whoop/design/models/items/graph/plot/IconPointStyle;

    move-result-object v3

    sget-object v4, Lcc1/a$a;->a:[I

    invoke-virtual {v3}, Ljava/lang/Enum;->ordinal()I

    move-result v3

    aget v3, v4, v3

    const/4 v4, 0x1

    if-eq v3, v4, :cond_5

    const/4 v5, 0x2

    if-eq v3, v5, :cond_4

    sget-object v3, Lcc1/a$f;->w:Lcc1/a$f;

    invoke-static {v3}, Ly81/g;->a(Lkotlin/jvm/functions/Function1;)Ly81/e;

    move-result-object v3

    :goto_4
    move-object v11, v3

    goto :goto_5

    :cond_4
    sget-object v3, Lcc1/a$e;->w:Lcc1/a$e;

    invoke-static {v3}, Ly81/g;->a(Lkotlin/jvm/functions/Function1;)Ly81/e;

    move-result-object v3

    goto :goto_4

    :cond_5
    sget-object v3, Lcc1/a$d;->w:Lcc1/a$d;

    invoke-static {v3}, Ly81/g;->a(Lkotlin/jvm/functions/Function1;)Ly81/e;

    move-result-object v3

    goto :goto_4

    :goto_5
    new-instance v6, Lq61/c;

    invoke-virtual {v2}, Lcom/whoop/design/models/items/graph/plot/IconGroupModel;->getX()F

    move-result v7

    int-to-float v3, v4

    invoke-virtual {v2}, Lcom/whoop/design/models/items/graph/plot/IconGroupModel;->getY()F

    move-result v4

    sub-float v8, v3, v4

    invoke-virtual {v2}, Lcom/whoop/design/models/items/graph/plot/IconGroupModel;->getStyle()Lcom/whoop/design/models/items/graph/plot/IconPointStyle;

    move-result-object v3

    sget-object v4, Lcom/whoop/design/models/items/graph/plot/IconPointStyle;->FAILED:Lcom/whoop/design/models/items/graph/plot/IconPointStyle;

    if-ne v3, v4, :cond_6

    sget-object v3, Lcc1/a$b;->w:Lcc1/a$b;

    :goto_6
    invoke-static {v3}, Ly81/g;->a(Lkotlin/jvm/functions/Function1;)Ly81/e;

    move-result-object v3

    move-object v10, v3

    goto :goto_7

    :cond_6
    sget-object v3, Lcc1/a$c;->w:Lcc1/a$c;

    goto :goto_6

    :goto_7
    invoke-virtual {v2}, Lcom/whoop/design/models/items/graph/plot/IconGroupModel;->getWidth()F

    move-result v12

    invoke-direct/range {v6 .. v12}, Lq61/c;-><init>(FFLjava/lang/Integer;Ly81/e;Ly81/e;F)V

    invoke-interface {v1, v6}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto/16 :goto_0

    :cond_7
    invoke-virtual {p0}, Lcom/whoop/design/models/items/graph/plot/IconPlotModel;->getId()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0}, Lcom/whoop/design/models/items/graph/plot/IconPlotModel;->getHideWhileScrubbing()Ljava/lang/Boolean;

    move-result-object v2

    if-eqz v2, :cond_8

    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v2

    goto :goto_8

    :cond_8
    move v2, v3

    :goto_8
    invoke-virtual {p0}, Lcom/whoop/design/models/items/graph/plot/IconPlotModel;->getSkipScrubbing()Ljava/lang/Boolean;

    move-result-object p0

    if-eqz p0, :cond_9

    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v3

    :cond_9
    new-instance p0, Lj71/b$f;

    invoke-direct {p0, v1, v0, v3, v2}, Lj71/b$f;-><init>(Ljava/util/List;Ljava/lang/String;ZZ)V

    return-object p0
.end method
