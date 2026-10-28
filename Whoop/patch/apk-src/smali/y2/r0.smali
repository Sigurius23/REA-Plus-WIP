.class public interface abstract Ly2/r0;
.super Ljava/lang/Object;
.source "SourceFile"


# virtual methods
.method public abstract a(Ly2/t0;Ljava/util/List;J)Ly2/s0;
.end method

.method public b(Ly2/r;Ljava/util/List;I)I
    .locals 9

    new-instance v0, Ljava/util/ArrayList;

    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    move-object v1, p2

    check-cast v1, Ljava/util/Collection;

    invoke-interface {v1}, Ljava/util/Collection;->size()I

    move-result v1

    const/4 v2, 0x0

    move v3, v2

    :goto_0
    if-ge v3, v1, :cond_0

    invoke-interface {p2, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ly2/q0;

    new-instance v5, La3/s1;

    sget-object v6, Ly2/s;->w:Ly2/s;

    sget-object v7, Ly2/t;->x:Ly2/t;

    const/4 v8, 0x1

    invoke-direct {v5, v4, v6, v7, v8}, La3/s1;-><init>(Ly2/q0;Ljava/lang/Enum;Ljava/lang/Enum;I)V

    invoke-virtual {v0, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_0
    const/16 p2, 0xd

    invoke-static {p3, v2, p2}, Ly3/b;->b(III)J

    move-result-wide p2

    new-instance v1, Ly2/v;

    invoke-interface {p1}, Ly2/r;->getLayoutDirection()Ly3/m;

    move-result-object v2

    invoke-direct {v1, p1, v2}, Ly2/v;-><init>(Ly2/r;Ly3/m;)V

    invoke-interface {p0, v1, v0, p2, p3}, Ly2/r0;->a(Ly2/t0;Ljava/util/List;J)Ly2/s0;

    move-result-object p1

    invoke-interface {p1}, Ly2/s0;->getHeight()I

    move-result p1

    return p1
.end method

.method public c(Ly2/r;Ljava/util/List;I)I
    .locals 9

    new-instance v0, Ljava/util/ArrayList;

    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    move-object v1, p2

    check-cast v1, Ljava/util/Collection;

    invoke-interface {v1}, Ljava/util/Collection;->size()I

    move-result v1

    const/4 v2, 0x0

    move v3, v2

    :goto_0
    if-ge v3, v1, :cond_0

    invoke-interface {p2, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ly2/q0;

    new-instance v5, La3/s1;

    sget-object v6, Ly2/s;->x:Ly2/s;

    sget-object v7, Ly2/t;->w:Ly2/t;

    const/4 v8, 0x1

    invoke-direct {v5, v4, v6, v7, v8}, La3/s1;-><init>(Ly2/q0;Ljava/lang/Enum;Ljava/lang/Enum;I)V

    invoke-virtual {v0, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_0
    const/4 p2, 0x7

    invoke-static {v2, p3, p2}, Ly3/b;->b(III)J

    move-result-wide p2

    new-instance v1, Ly2/v;

    invoke-interface {p1}, Ly2/r;->getLayoutDirection()Ly3/m;

    move-result-object v2

    invoke-direct {v1, p1, v2}, Ly2/v;-><init>(Ly2/r;Ly3/m;)V

    invoke-interface {p0, v1, v0, p2, p3}, Ly2/r0;->a(Ly2/t0;Ljava/util/List;J)Ly2/s0;

    move-result-object p1

    invoke-interface {p1}, Ly2/s0;->getWidth()I

    move-result p1

    return p1
.end method

.method public d(Ly2/r;Ljava/util/List;I)I
    .locals 9

    new-instance v0, Ljava/util/ArrayList;

    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    move-object v1, p2

    check-cast v1, Ljava/util/Collection;

    invoke-interface {v1}, Ljava/util/Collection;->size()I

    move-result v1

    const/4 v2, 0x0

    move v3, v2

    :goto_0
    if-ge v3, v1, :cond_0

    invoke-interface {p2, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ly2/q0;

    new-instance v5, La3/s1;

    sget-object v6, Ly2/s;->x:Ly2/s;

    sget-object v7, Ly2/t;->x:Ly2/t;

    const/4 v8, 0x1

    invoke-direct {v5, v4, v6, v7, v8}, La3/s1;-><init>(Ly2/q0;Ljava/lang/Enum;Ljava/lang/Enum;I)V

    invoke-virtual {v0, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_0
    const/16 p2, 0xd

    invoke-static {p3, v2, p2}, Ly3/b;->b(III)J

    move-result-wide p2

    new-instance v1, Ly2/v;

    invoke-interface {p1}, Ly2/r;->getLayoutDirection()Ly3/m;

    move-result-object v2

    invoke-direct {v1, p1, v2}, Ly2/v;-><init>(Ly2/r;Ly3/m;)V

    invoke-interface {p0, v1, v0, p2, p3}, Ly2/r0;->a(Ly2/t0;Ljava/util/List;J)Ly2/s0;

    move-result-object p1

    invoke-interface {p1}, Ly2/s0;->getHeight()I

    move-result p1

    return p1
.end method

.method public e(Ly2/r;Ljava/util/List;I)I
    .locals 9

    new-instance v0, Ljava/util/ArrayList;

    invoke-interface {p2}, Ljava/util/List;->size()I

    move-result v1

    invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V

    move-object v1, p2

    check-cast v1, Ljava/util/Collection;

    invoke-interface {v1}, Ljava/util/Collection;->size()I

    move-result v1

    const/4 v2, 0x0

    move v3, v2

    :goto_0
    if-ge v3, v1, :cond_0

    invoke-interface {p2, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ly2/q0;

    new-instance v5, La3/s1;

    sget-object v6, Ly2/s;->w:Ly2/s;

    sget-object v7, Ly2/t;->w:Ly2/t;

    const/4 v8, 0x1

    invoke-direct {v5, v4, v6, v7, v8}, La3/s1;-><init>(Ly2/q0;Ljava/lang/Enum;Ljava/lang/Enum;I)V

    invoke-virtual {v0, v5}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_0
    const/4 p2, 0x7

    invoke-static {v2, p3, p2}, Ly3/b;->b(III)J

    move-result-wide p2

    new-instance v1, Ly2/v;

    invoke-interface {p1}, Ly2/r;->getLayoutDirection()Ly3/m;

    move-result-object v2

    invoke-direct {v1, p1, v2}, Ly2/v;-><init>(Ly2/r;Ly3/m;)V

    invoke-interface {p0, v1, v0, p2, p3}, Ly2/r0;->a(Ly2/t0;Ljava/util/List;J)Ly2/s0;

    move-result-object p1

    invoke-interface {p1}, Ly2/s0;->getWidth()I

    move-result p1

    return p1
.end method
