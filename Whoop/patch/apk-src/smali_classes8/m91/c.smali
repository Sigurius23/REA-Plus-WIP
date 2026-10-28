.class public abstract Lm91/c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000$\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u001aS\u0010\u0008\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00070\u0003\"\u0004\u0008\u0000\u0010\u0000\"\u0008\u0008\u0001\u0010\u0002*\u00020\u00012\u000c\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00028\u00010\u00032\u0012\u0010\u0006\u001a\u000e\u0012\u0004\u0012\u00028\u0001\u0012\u0004\u0012\u00028\u00000\u0005H\u0007\u00a2\u0006\u0004\u0008\u0008\u0010\t\u001aE\u0010\u000b\u001a\u0014\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u00070\u0003\"\u0004\u0008\u0000\u0010\u0000\"\u000e\u0008\u0001\u0010\u0002*\u0008\u0012\u0004\u0012\u00028\u00000\n2\u000c\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00028\u00010\u0003H\u0007\u00a2\u0006\u0004\u0008\u000b\u0010\u000c\u00a8\u0006\r"
    }
    d2 = {
        "K",
        "Lm91/u;",
        "V",
        "",
        "items",
        "Lkotlin/Function1;",
        "id",
        "Lm91/a;",
        "c",
        "(Ljava/util/List;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)Ljava/util/List;",
        "Lm91/n;",
        "b",
        "(Ljava/util/List;Landroidx/compose/runtime/Composer;I)Ljava/util/List;",
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
.method public static synthetic a(Lm91/n;)Ljava/lang/Object;
    .locals 0

    invoke-static {p0}, Lm91/c;->d(Lm91/n;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final b(Ljava/util/List;Landroidx/compose/runtime/Composer;I)Ljava/util/List;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<K:",
            "Ljava/lang/Object;",
            "V::",
            "Lm91/n<",
            "TK;>;>(",
            "Ljava/util/List<",
            "+TV;>;",
            "Landroidx/compose/runtime/Composer;",
            "I)",
            "Ljava/util/List<",
            "Lm91/a<",
            "TK;TV;>;>;"
        }
    .end annotation

    const-string v0, "items"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Lp1/q;

    invoke-virtual {p1}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v0

    sget-object v1, Lp1/l;->a:Lp1/v0;

    if-ne v0, v1, :cond_0

    new-instance v0, Lm91/d;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Lm91/d;-><init>(I)V

    invoke-virtual {p1, v0}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_0
    check-cast v0, Lkotlin/jvm/functions/Function1;

    and-int/lit8 p2, p2, 0xe

    or-int/lit8 p2, p2, 0x30

    invoke-static {p0, v0, p1, p2}, Lm91/c;->c(Ljava/util/List;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method public static final c(Ljava/util/List;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)Ljava/util/List;
    .locals 7
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<K:",
            "Ljava/lang/Object;",
            "V::",
            "Lm91/u;",
            ">(",
            "Ljava/util/List<",
            "+TV;>;",
            "Lkotlin/jvm/functions/Function1;",
            "Landroidx/compose/runtime/Composer;",
            "I)",
            "Ljava/util/List<",
            "Lm91/a<",
            "TK;TV;>;>;"
        }
    .end annotation

    const-string p3, "items"

    invoke-static {p0, p3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p3, "id"

    invoke-static {p1, p3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p2, Lp1/q;

    invoke-virtual {p2}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object p3

    const/16 v0, 0xa

    sget-object v1, Lp1/l;->a:Lp1/v0;

    if-ne p3, v1, :cond_1

    move-object p3, p0

    check-cast p3, Ljava/lang/Iterable;

    new-instance v2, Ljava/util/ArrayList;

    invoke-static {p3, v0}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v3

    invoke-direct {v2, v3}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {p3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p3

    :goto_0
    invoke-interface {p3}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-interface {p3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lm91/u;

    new-instance v4, Lm91/a;

    invoke-interface {p1, v3}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    sget-object v6, Lm91/e0;->Visible:Lm91/e0;

    invoke-direct {v4, v5, v3, v6}, Lm91/a;-><init>(Ljava/lang/Object;Lm91/u;Lm91/e0;)V

    invoke-virtual {v2, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    invoke-static {v2}, Lp1/x;->J(Ljava/util/Collection;)Lz1/p;

    move-result-object p3

    invoke-virtual {p2, p3}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_1
    check-cast p3, Lz1/p;

    check-cast p0, Ljava/lang/Iterable;

    invoke-static {p0, v0}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v2

    invoke-static {v2}, Lm83/g0;->W(I)I

    move-result v2

    const/16 v3, 0x10

    if-ge v2, v3, :cond_2

    move v2, v3

    :cond_2
    new-instance v3, Ljava/util/LinkedHashMap;

    invoke-direct {v3, v2}, Ljava/util/LinkedHashMap;-><init>(I)V

    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_1
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_3

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    invoke-interface {p1, v2}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v4

    invoke-interface {v3, v4, v2}, Ljava/util/Map;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_1

    :cond_3
    invoke-static {v3, p2}, Lp1/x;->F(Ljava/lang/Object;Landroidx/compose/runtime/Composer;)Lp1/c1;

    move-result-object p0

    invoke-virtual {p2, p0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result p1

    invoke-virtual {p2}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    const/4 v3, 0x0

    if-nez p1, :cond_4

    if-ne v2, v1, :cond_5

    :cond_4
    new-instance v2, Lm91/c$a;

    invoke-direct {v2, p0, p3, v3}, Lm91/c$a;-><init>(Lp1/t2;Lz1/p;Lq83/d;)V

    invoke-virtual {p2, v2}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_5
    check-cast v2, Lc93/m;

    invoke-static {p2, v2, p0}, Lp1/x;->g(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual {p2}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_6

    new-instance p1, Lm91/c$b;

    invoke-direct {p1, p3, v3}, Lm91/c$b;-><init>(Lz1/p;Lq83/d;)V

    invoke-virtual {p2, p1}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_6
    check-cast p1, Lc93/m;

    invoke-static {p2, p1, p3}, Lp1/x;->g(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    new-instance p1, Ljava/util/ArrayList;

    invoke-static {p3, v0}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result p2

    invoke-direct {p1, p2}, Ljava/util/ArrayList;-><init>(I)V

    invoke-virtual {p3}, Lz1/p;->listIterator()Ljava/util/ListIterator;

    move-result-object p2

    :goto_2
    move-object p3, p2

    check-cast p3, Ln83/b;

    invoke-virtual {p3}, Ln83/b;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_8

    invoke-virtual {p3}, Ln83/b;->next()Ljava/lang/Object;

    move-result-object p3

    move-object v0, p3

    check-cast v0, Lm91/a;

    invoke-interface {p0}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Ljava/util/Map;

    invoke-virtual {v0}, Lm91/a;->c()Ljava/lang/Object;

    move-result-object v1

    invoke-interface {p3, v1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p3

    move-object v2, p3

    check-cast v2, Lm91/u;

    if-eqz v2, :cond_7

    const/4 v4, 0x5

    const/4 v5, 0x0

    const/4 v1, 0x0

    const/4 v3, 0x0

    invoke-static/range {v0 .. v5}, Lm91/a;->b(Lm91/a;Ljava/lang/Object;Lm91/u;Ld0/q0;ILjava/lang/Object;)Lm91/a;

    move-result-object v0

    :cond_7
    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_2

    :cond_8
    return-object p1
.end method

.method private static final d(Lm91/n;)Ljava/lang/Object;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0}, Lm91/n;->getId()Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method
