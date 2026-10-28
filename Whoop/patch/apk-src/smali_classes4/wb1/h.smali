.class public abstract Lwb1/h;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lwb1/h$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000 \n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u001a#\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u00002\u000c\u0010\u0002\u001a\u0008\u0012\u0004\u0012\u00020\u00010\u0000H\u0000\u00a2\u0006\u0004\u0008\u0004\u0010\u0005\u001a\u0017\u0010\t\u001a\u00020\u00082\u0006\u0010\u0007\u001a\u00020\u0006H\u0002\u00a2\u0006\u0004\u0008\t\u0010\n\u00a8\u0006\u000b"
    }
    d2 = {
        "",
        "Lcom/whoop/design/models/items/graph/plane/line/GraphLineModel;",
        "lines",
        "Lj61/f;",
        "b",
        "(Ljava/util/List;)Ljava/util/List;",
        "Lcom/whoop/design/models/items/graph/plane/line/GraphLineStyle;",
        "graphLineStyle",
        "Ly81/e;",
        "a",
        "(Lcom/whoop/design/models/items/graph/plane/line/GraphLineStyle;)Ly81/e;",
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
.method private static final a(Lcom/whoop/design/models/items/graph/plane/line/GraphLineStyle;)Ly81/e;
    .locals 1

    sget-object v0, Lwb1/h$a;->a:[I

    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    move-result p0

    aget p0, v0, p0

    const/4 v0, 0x1

    if-eq p0, v0, :cond_2

    const/4 v0, 0x2

    if-eq p0, v0, :cond_1

    const/4 v0, 0x3

    if-ne p0, v0, :cond_0

    sget-object p0, Lwb1/h$d;->w:Lwb1/h$d;

    invoke-static {p0}, Ly81/g;->a(Lkotlin/jvm/functions/Function1;)Ly81/e;

    move-result-object p0

    return-object p0

    :cond_0
    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p0

    :cond_1
    sget-object p0, Lwb1/h$c;->w:Lwb1/h$c;

    invoke-static {p0}, Ly81/g;->a(Lkotlin/jvm/functions/Function1;)Ly81/e;

    move-result-object p0

    return-object p0

    :cond_2
    sget-object p0, Lwb1/h$b;->w:Lwb1/h$b;

    invoke-static {p0}, Ly81/g;->a(Lkotlin/jvm/functions/Function1;)Ly81/e;

    move-result-object p0

    return-object p0
.end method

.method public static final b(Ljava/util/List;)Ljava/util/List;
    .locals 20
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lcom/whoop/design/models/items/graph/plane/line/GraphLineModel;",
            ">;)",
            "Ljava/util/List<",
            "Lj61/f;",
            ">;"
        }
    .end annotation

    move-object/from16 v0, p0

    const-string v1, "lines"

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

    if-eqz v2, :cond_7

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lcom/whoop/design/models/items/graph/plane/line/GraphLineModel;

    invoke-virtual {v2}, Lcom/whoop/design/models/items/graph/plane/line/GraphLineModel;->getPosition()D

    move-result-wide v3

    double-to-float v6, v3

    invoke-virtual {v2}, Lcom/whoop/design/models/items/graph/plane/line/GraphLineModel;->getAxis()Lg61/f;

    move-result-object v8

    invoke-virtual {v2}, Lcom/whoop/design/models/items/graph/plane/line/GraphLineModel;->getTheme()Lcom/whoop/design/models/items/graph/plane/line/GraphLineTheme;

    move-result-object v3

    if-eqz v3, :cond_0

    invoke-virtual {v3}, Lcom/whoop/design/models/items/graph/plane/line/GraphLineTheme;->getLineColor()Ly81/f;

    move-result-object v3

    if-eqz v3, :cond_0

    :goto_1
    move-object v7, v3

    goto :goto_2

    :cond_0
    invoke-virtual {v2}, Lcom/whoop/design/models/items/graph/plane/line/GraphLineModel;->getStyle()Lcom/whoop/design/models/items/graph/plane/line/GraphLineStyle;

    move-result-object v3

    invoke-static {v3}, Lwb1/h;->a(Lcom/whoop/design/models/items/graph/plane/line/GraphLineStyle;)Ly81/e;

    move-result-object v3

    goto :goto_1

    :goto_2
    invoke-virtual {v2}, Lcom/whoop/design/models/items/graph/plane/line/GraphLineModel;->getLabel()Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v2}, Lcom/whoop/design/models/items/graph/plane/line/GraphLineModel;->getLabelStyle()Ljava/lang/String;

    move-result-object v3

    if-nez v3, :cond_1

    const-string v3, ""

    :cond_1
    sget-object v4, Lj61/i;->DEFAULT:Lj61/i;

    invoke-static {}, Lj61/i;->values()[Lj61/i;

    move-result-object v5

    array-length v9, v5

    const/4 v11, 0x0

    :goto_3
    const/4 v12, 0x0

    if-ge v11, v9, :cond_3

    aget-object v13, v5, v11

    invoke-virtual {v13}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object v14

    invoke-static {v14, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v14

    if-eqz v14, :cond_2

    goto :goto_4

    :cond_2
    add-int/lit8 v11, v11, 0x1

    goto :goto_3

    :cond_3
    move-object v13, v12

    :goto_4
    if-nez v13, :cond_4

    move-object v11, v4

    goto :goto_5

    :cond_4
    move-object v11, v13

    :goto_5
    invoke-virtual {v2}, Lcom/whoop/design/models/items/graph/plane/line/GraphLineModel;->getPosition()D

    move-result-wide v3

    double-to-float v3, v3

    const/4 v4, 0x0

    cmpg-float v3, v3, v4

    if-nez v3, :cond_5

    new-instance v13, Lp91/a;

    const/16 v18, 0xd

    const/16 v19, 0x0

    const/4 v14, 0x0

    const/high16 v15, 0x3f800000    # 1.0f

    const/16 v16, 0x0

    const/16 v17, 0x0

    invoke-direct/range {v13 .. v19}, Lp91/a;-><init>(FFZZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    :goto_6
    move-object v9, v13

    goto :goto_7

    :cond_5
    sget-object v3, Lp91/a;->e:Lp91/a$a;

    invoke-virtual {v3}, Lp91/a$a;->d()Lp91/a;

    move-result-object v13

    goto :goto_6

    :goto_7
    invoke-virtual {v2}, Lcom/whoop/design/models/items/graph/plane/line/GraphLineModel;->getTheme()Lcom/whoop/design/models/items/graph/plane/line/GraphLineTheme;

    move-result-object v2

    if-eqz v2, :cond_6

    invoke-virtual {v2}, Lcom/whoop/design/models/items/graph/plane/line/GraphLineTheme;->getLabelColor()Ly81/f;

    move-result-object v12

    :cond_6
    new-instance v5, Lj61/f;

    invoke-direct/range {v5 .. v12}, Lj61/f;-><init>(FLy81/e;Lg61/f;Lp91/a;Ljava/lang/String;Lj61/i;Ly81/e;)V

    invoke-interface {v1, v5}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto/16 :goto_0

    :cond_7
    return-object v1
.end method
