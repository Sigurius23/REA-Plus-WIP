.class public abstract Le81/s;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0008\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u000c\u001a)\u0010\u0007\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u0005*\u00020\u00002\u0008\u0010\u0002\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0004\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\u0007\u0010\u0008\u001a7\u0010\u000c\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u00052\u000c\u0010\t\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u00052\u000c\u0010\n\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u00052\u0006\u0010\u000b\u001a\u00020\u0003\u00a2\u0006\u0004\u0008\u000c\u0010\r\u001a\'\u0010\u0010\u001a\u00020\u00032\u0006\u0010\u000e\u001a\u00020\u00032\u0006\u0010\u000f\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\u0003H\u0002\u00a2\u0006\u0004\u0008\u0010\u0010\u0011\u00a8\u0006\u0012"
    }
    d2 = {
        "Le81/r;",
        "",
        "selectedIndex",
        "",
        "unselectedAlpha",
        "",
        "Le81/w;",
        "a",
        "(Le81/r;Ljava/lang/Integer;F)Ljava/util/List;",
        "from",
        "to",
        "fraction",
        "c",
        "(Ljava/util/List;Ljava/util/List;F)Ljava/util/List;",
        "start",
        "end",
        "b",
        "(FFF)F",
        "design_release"
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
.method public static final a(Le81/r;Ljava/lang/Integer;F)Ljava/util/List;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Le81/r;",
            "Ljava/lang/Integer;",
            "F)",
            "Ljava/util/List<",
            "Le81/w;",
            ">;"
        }
    .end annotation

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Le81/r;->d()Ljava/util/List;

    move-result-object p0

    check-cast p0, Ljava/lang/Iterable;

    new-instance v0, Ljava/util/ArrayList;

    const/16 v1, 0xa

    invoke-static {p0, v1}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p0

    const/4 v1, 0x0

    move v2, v1

    :goto_0
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_3

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    add-int/lit8 v4, v2, 0x1

    if-ltz v2, :cond_2

    check-cast v3, Le81/x;

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result v5

    if-eq v2, v5, :cond_0

    const/4 v2, 0x1

    goto :goto_1

    :cond_0
    move v2, v1

    :goto_1
    new-instance v5, Le81/w;

    invoke-virtual {v3}, Le81/x;->a()F

    move-result v6

    invoke-virtual {v3}, Le81/x;->b()F

    move-result v3

    if-eqz v2, :cond_1

    move v2, p2

    goto :goto_2

    :cond_1
    const/high16 v2, 0x3f800000    # 1.0f

    :goto_2
    invoke-direct {v5, v6, v3, v2}, Le81/w;-><init>(FFF)V

    invoke-interface {v0, v5}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    move v2, v4

    goto :goto_0

    :cond_2
    invoke-static {}, Lwb3/f;->d0()V

    const/4 p0, 0x0

    throw p0

    :cond_3
    return-object v0
.end method

.method private static final b(FFF)F
    .locals 0

    invoke-static {p1, p0, p2, p0}, Lb9/y;->a(FFFF)F

    move-result p0

    return p0
.end method

.method public static final c(Ljava/util/List;Ljava/util/List;F)Ljava/util/List;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Le81/w;",
            ">;",
            "Ljava/util/List<",
            "Le81/w;",
            ">;F)",
            "Ljava/util/List<",
            "Le81/w;",
            ">;"
        }
    .end annotation

    const-string v0, "from"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "to"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result v0

    invoke-interface {p1}, Ljava/util/List;->size()I

    move-result v1

    if-eq v0, v1, :cond_0

    goto :goto_0

    :cond_0
    const/high16 v0, 0x3f800000    # 1.0f

    cmpl-float v0, p2, v0

    if-ltz v0, :cond_1

    :goto_0
    return-object p1

    :cond_1
    const/4 v0, 0x0

    cmpg-float v0, p2, v0

    if-gtz v0, :cond_2

    return-object p0

    :cond_2
    check-cast p1, Ljava/lang/Iterable;

    new-instance v0, Ljava/util/ArrayList;

    const/16 v1, 0xa

    invoke-static {p1, v1}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {p1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    const/4 v1, 0x0

    :goto_1
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_4

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    add-int/lit8 v3, v1, 0x1

    if-ltz v1, :cond_3

    check-cast v2, Le81/w;

    new-instance v4, Le81/w;

    invoke-virtual {v2}, Le81/w;->b()F

    move-result v5

    invoke-virtual {v2}, Le81/w;->c()F

    move-result v6

    invoke-interface {p0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Le81/w;

    invoke-virtual {v1}, Le81/w;->a()F

    move-result v1

    invoke-virtual {v2}, Le81/w;->a()F

    move-result v2

    invoke-static {v1, v2, p2}, Le81/s;->b(FFF)F

    move-result v1

    invoke-direct {v4, v5, v6, v1}, Le81/w;-><init>(FFF)V

    invoke-interface {v0, v4}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    move v1, v3

    goto :goto_1

    :cond_3
    invoke-static {}, Lwb3/f;->d0()V

    const/4 p0, 0x0

    throw p0

    :cond_4
    return-object v0
.end method
