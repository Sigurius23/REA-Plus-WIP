.class public interface abstract Ly2/z0;
.super Ljava/lang/Object;
.source "SourceFile"


# virtual methods
.method public abstract a(Ly2/t0;Ljava/util/List;J)Ly2/s0;
.end method

.method public b(Ly2/r;Ljava/util/List;I)I
    .locals 14

    new-instance v0, Ljava/util/ArrayList;

    move-object/from16 v1, p2

    check-cast v1, Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v2

    invoke-direct {v0, v2}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface/range {p2 .. p2}, Ljava/util/Collection;->size()I

    move-result v2

    const/4 v3, 0x0

    move v4, v3

    :goto_0
    if-ge v4, v2, :cond_1

    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/util/List;

    new-instance v6, Ljava/util/ArrayList;

    invoke-interface {v5}, Ljava/util/List;->size()I

    move-result v7

    invoke-direct {v6, v7}, Ljava/util/ArrayList;-><init>(I)V

    move-object v7, v5

    check-cast v7, Ljava/util/Collection;

    invoke-interface {v7}, Ljava/util/Collection;->size()I

    move-result v7

    move v8, v3

    :goto_1
    if-ge v8, v7, :cond_0

    invoke-interface {v5, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Ly2/q0;

    new-instance v10, La3/s1;

    sget-object v11, Ly2/s;->w:Ly2/s;

    sget-object v12, Ly2/t;->x:Ly2/t;

    const/4 v13, 0x1

    invoke-direct {v10, v9, v11, v12, v13}, La3/s1;-><init>(Ly2/q0;Ljava/lang/Enum;Ljava/lang/Enum;I)V

    invoke-virtual {v6, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v8, v8, 0x1

    goto :goto_1

    :cond_0
    invoke-virtual {v0, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_1
    const/16 v1, 0xd

    move/from16 v2, p3

    invoke-static {v2, v3, v1}, Ly3/b;->b(III)J

    move-result-wide v1

    new-instance v3, Ly2/v;

    invoke-interface {p1}, Ly2/r;->getLayoutDirection()Ly3/m;

    move-result-object v4

    invoke-direct {v3, p1, v4}, Ly2/v;-><init>(Ly2/r;Ly3/m;)V

    invoke-interface {p0, v3, v0, v1, v2}, Ly2/z0;->a(Ly2/t0;Ljava/util/List;J)Ly2/s0;

    move-result-object p1

    invoke-interface {p1}, Ly2/s0;->getHeight()I

    move-result p1

    return p1
.end method

.method public c(Ly2/r;Ljava/util/List;I)I
    .locals 14

    new-instance v0, Ljava/util/ArrayList;

    move-object/from16 v1, p2

    check-cast v1, Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v2

    invoke-direct {v0, v2}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface/range {p2 .. p2}, Ljava/util/Collection;->size()I

    move-result v2

    const/4 v3, 0x0

    move v4, v3

    :goto_0
    if-ge v4, v2, :cond_1

    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/util/List;

    new-instance v6, Ljava/util/ArrayList;

    invoke-interface {v5}, Ljava/util/List;->size()I

    move-result v7

    invoke-direct {v6, v7}, Ljava/util/ArrayList;-><init>(I)V

    move-object v7, v5

    check-cast v7, Ljava/util/Collection;

    invoke-interface {v7}, Ljava/util/Collection;->size()I

    move-result v7

    move v8, v3

    :goto_1
    if-ge v8, v7, :cond_0

    invoke-interface {v5, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Ly2/q0;

    new-instance v10, La3/s1;

    sget-object v11, Ly2/s;->x:Ly2/s;

    sget-object v12, Ly2/t;->w:Ly2/t;

    const/4 v13, 0x1

    invoke-direct {v10, v9, v11, v12, v13}, La3/s1;-><init>(Ly2/q0;Ljava/lang/Enum;Ljava/lang/Enum;I)V

    invoke-virtual {v6, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v8, v8, 0x1

    goto :goto_1

    :cond_0
    invoke-virtual {v0, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_1
    const/4 v1, 0x7

    move/from16 v2, p3

    invoke-static {v3, v2, v1}, Ly3/b;->b(III)J

    move-result-wide v1

    new-instance v3, Ly2/v;

    invoke-interface {p1}, Ly2/r;->getLayoutDirection()Ly3/m;

    move-result-object v4

    invoke-direct {v3, p1, v4}, Ly2/v;-><init>(Ly2/r;Ly3/m;)V

    invoke-interface {p0, v3, v0, v1, v2}, Ly2/z0;->a(Ly2/t0;Ljava/util/List;J)Ly2/s0;

    move-result-object p1

    invoke-interface {p1}, Ly2/s0;->getWidth()I

    move-result p1

    return p1
.end method

.method public d(Ly2/r;Ljava/util/List;I)I
    .locals 14

    new-instance v0, Ljava/util/ArrayList;

    move-object/from16 v1, p2

    check-cast v1, Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v2

    invoke-direct {v0, v2}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface/range {p2 .. p2}, Ljava/util/Collection;->size()I

    move-result v2

    const/4 v3, 0x0

    move v4, v3

    :goto_0
    if-ge v4, v2, :cond_1

    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/util/List;

    new-instance v6, Ljava/util/ArrayList;

    invoke-interface {v5}, Ljava/util/List;->size()I

    move-result v7

    invoke-direct {v6, v7}, Ljava/util/ArrayList;-><init>(I)V

    move-object v7, v5

    check-cast v7, Ljava/util/Collection;

    invoke-interface {v7}, Ljava/util/Collection;->size()I

    move-result v7

    move v8, v3

    :goto_1
    if-ge v8, v7, :cond_0

    invoke-interface {v5, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Ly2/q0;

    new-instance v10, La3/s1;

    sget-object v11, Ly2/s;->x:Ly2/s;

    sget-object v12, Ly2/t;->x:Ly2/t;

    const/4 v13, 0x1

    invoke-direct {v10, v9, v11, v12, v13}, La3/s1;-><init>(Ly2/q0;Ljava/lang/Enum;Ljava/lang/Enum;I)V

    invoke-virtual {v6, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v8, v8, 0x1

    goto :goto_1

    :cond_0
    invoke-virtual {v0, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_1
    const/16 v1, 0xd

    move/from16 v2, p3

    invoke-static {v2, v3, v1}, Ly3/b;->b(III)J

    move-result-wide v1

    new-instance v3, Ly2/v;

    invoke-interface {p1}, Ly2/r;->getLayoutDirection()Ly3/m;

    move-result-object v4

    invoke-direct {v3, p1, v4}, Ly2/v;-><init>(Ly2/r;Ly3/m;)V

    invoke-interface {p0, v3, v0, v1, v2}, Ly2/z0;->a(Ly2/t0;Ljava/util/List;J)Ly2/s0;

    move-result-object p1

    invoke-interface {p1}, Ly2/s0;->getHeight()I

    move-result p1

    return p1
.end method

.method public e(Ly2/r;Ljava/util/List;I)I
    .locals 14

    new-instance v0, Ljava/util/ArrayList;

    move-object/from16 v1, p2

    check-cast v1, Ljava/util/ArrayList;

    invoke-virtual {v1}, Ljava/util/ArrayList;->size()I

    move-result v2

    invoke-direct {v0, v2}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface/range {p2 .. p2}, Ljava/util/Collection;->size()I

    move-result v2

    const/4 v3, 0x0

    move v4, v3

    :goto_0
    if-ge v4, v2, :cond_1

    invoke-virtual {v1, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/util/List;

    new-instance v6, Ljava/util/ArrayList;

    invoke-interface {v5}, Ljava/util/List;->size()I

    move-result v7

    invoke-direct {v6, v7}, Ljava/util/ArrayList;-><init>(I)V

    move-object v7, v5

    check-cast v7, Ljava/util/Collection;

    invoke-interface {v7}, Ljava/util/Collection;->size()I

    move-result v7

    move v8, v3

    :goto_1
    if-ge v8, v7, :cond_0

    invoke-interface {v5, v8}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Ly2/q0;

    new-instance v10, La3/s1;

    sget-object v11, Ly2/s;->w:Ly2/s;

    sget-object v12, Ly2/t;->w:Ly2/t;

    const/4 v13, 0x1

    invoke-direct {v10, v9, v11, v12, v13}, La3/s1;-><init>(Ly2/q0;Ljava/lang/Enum;Ljava/lang/Enum;I)V

    invoke-virtual {v6, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v8, v8, 0x1

    goto :goto_1

    :cond_0
    invoke-virtual {v0, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v4, v4, 0x1

    goto :goto_0

    :cond_1
    const/4 v1, 0x7

    move/from16 v2, p3

    invoke-static {v3, v2, v1}, Ly3/b;->b(III)J

    move-result-wide v1

    new-instance v3, Ly2/v;

    invoke-interface {p1}, Ly2/r;->getLayoutDirection()Ly3/m;

    move-result-object v4

    invoke-direct {v3, p1, v4}, Ly2/v;-><init>(Ly2/r;Ly3/m;)V

    invoke-interface {p0, v3, v0, v1, v2}, Ly2/z0;->a(Ly2/t0;Ljava/util/List;J)Ly2/s0;

    move-result-object p1

    invoke-interface {p1}, Ly2/s0;->getWidth()I

    move-result p1

    return p1
.end method
