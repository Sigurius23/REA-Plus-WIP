.class public final Lue3/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ldf3/a;


# virtual methods
.method public final a(Lxe3/d;Lxe3/d;)I
    .locals 7

    iget-object v0, p1, Lxe3/d;->a:Ljava/util/ArrayList;

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v1

    iget-object v2, p2, Lxe3/d;->a:Ljava/util/ArrayList;

    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result v3

    const/4 v4, 0x0

    if-ne v1, v3, :cond_2

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v1

    const/4 v3, 0x2

    if-gt v1, v3, :cond_2

    const/4 v1, 0x1

    invoke-static {v0, v1}, Lm4/a;->d(Ljava/util/ArrayList;I)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Laf3/a0;

    new-instance v3, Lte3/a;

    invoke-direct {v3}, Laf3/t;-><init>()V

    new-instance v5, Laa3/u0;

    invoke-direct {v5}, Ljava/lang/Object;-><init>()V

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result v6

    invoke-virtual {p1, v6}, Lxe3/d;->b(I)Ljava/util/List;

    move-result-object p1

    check-cast p1, Ljava/util/List;

    invoke-virtual {v5, p1}, Laa3/u0;->h(Ljava/util/List;)V

    invoke-virtual {v2, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Laf3/a0;

    iget-object v4, v1, Laf3/t;->e:Laf3/t;

    new-instance v6, Laf3/u;

    invoke-direct {v6, v4, p1}, Laf3/u;-><init>(Laf3/t;Laf3/t;)V

    :goto_0
    invoke-virtual {v6}, Laf3/u;->hasNext()Z

    move-result p1

    if-eqz p1, :cond_0

    invoke-virtual {v6}, Laf3/u;->next()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Laf3/t;

    invoke-virtual {v3, p1}, Laf3/t;->c(Laf3/t;)V

    invoke-virtual {p1}, Laf3/t;->e()Ljava/util/List;

    move-result-object p1

    invoke-virtual {v5, p1}, Laa3/u0;->g(Ljava/util/List;)V

    goto :goto_0

    :cond_0
    invoke-virtual {v2}, Ljava/util/ArrayList;->size()I

    move-result p1

    invoke-virtual {p2, p1}, Lxe3/d;->a(I)Ljava/util/List;

    move-result-object p1

    check-cast p1, Ljava/util/List;

    invoke-virtual {v5, p1}, Laa3/u0;->h(Ljava/util/List;)V

    iget-object p1, v5, Laa3/u0;->a:Ljava/util/ArrayList;

    if-eqz p1, :cond_1

    goto :goto_1

    :cond_1
    sget-object p1, Ljava/util/Collections;->EMPTY_LIST:Ljava/util/List;

    :goto_1
    invoke-virtual {v3, p1}, Laf3/t;->h(Ljava/util/List;)V

    invoke-virtual {v1, v3}, Laf3/t;->f(Laf3/t;)V

    invoke-virtual {v0}, Ljava/util/ArrayList;->size()I

    move-result p1

    return p1

    :cond_2
    return v4
.end method

.method public final b()C
    .locals 1

    const/16 v0, 0x7e

    return v0
.end method

.method public final c()I
    .locals 1

    const/4 v0, 0x1

    return v0
.end method

.method public final d()C
    .locals 1

    const/16 v0, 0x7e

    return v0
.end method
