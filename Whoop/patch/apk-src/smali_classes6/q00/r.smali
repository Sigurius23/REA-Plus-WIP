.class public final Lq00/r;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Ly2/r0;


# virtual methods
.method public final a(Ly2/t0;Ljava/util/List;J)Ly2/s0;
    .locals 17

    move-object/from16 v0, p1

    move-object/from16 v1, p2

    const-string v2, "$this$measure"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "measurables"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v8, 0x0

    const/16 v9, 0xb

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    move-wide/from16 v3, p3

    invoke-static/range {v3 .. v9}, Ly3/a;->b(JIIIII)J

    move-result-wide v10

    const/4 v2, 0x0

    invoke-interface {v1, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ly2/q0;

    invoke-interface {v3, v10, v11}, Ly2/q0;->T(J)Ly2/j1;

    move-result-object v5

    const/4 v3, 0x2

    invoke-interface {v1, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ly2/q0;

    invoke-interface {v3, v10, v11}, Ly2/q0;->T(J)Ly2/j1;

    move-result-object v8

    invoke-static/range {p3 .. p4}, Ly3/a;->i(J)I

    move-result v3

    iget v4, v5, Ly2/j1;->w:I

    sub-int/2addr v3, v4

    iget v4, v8, Ly2/j1;->w:I

    sub-int v12, v3, v4

    const/4 v3, 0x1

    invoke-interface {v1, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ly2/q0;

    const/4 v15, 0x0

    const/16 v16, 0xc

    const/4 v14, 0x0

    move v13, v12

    invoke-static/range {v10 .. v16}, Ly3/a;->b(JIIIII)J

    move-result-wide v6

    invoke-interface {v3, v6, v7}, Ly2/q0;->T(J)Ly2/j1;

    move-result-object v7

    const/4 v3, 0x3

    invoke-static {v3, v1}, Lm83/s;->I0(ILjava/util/List;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ly2/q0;

    if-eqz v1, :cond_0

    invoke-interface {v1, v10, v11}, Ly2/q0;->T(J)Ly2/j1;

    move-result-object v1

    :goto_0
    move-object v9, v1

    goto :goto_1

    :cond_0
    const/4 v1, 0x0

    goto :goto_0

    :goto_1
    iget v1, v5, Ly2/j1;->x:I

    iget v3, v7, Ly2/j1;->x:I

    iget v4, v8, Ly2/j1;->x:I

    invoke-static {v3, v4}, Ljava/lang/Math;->max(II)I

    move-result v3

    invoke-static {v1, v3}, Ljava/lang/Math;->max(II)I

    move-result v6

    invoke-static/range {p3 .. p4}, Ly3/a;->j(J)I

    move-result v1

    if-eqz v9, :cond_1

    iget v2, v9, Ly2/j1;->x:I

    :cond_1
    add-int/2addr v2, v6

    invoke-static {v1, v2}, Ljava/lang/Math;->max(II)I

    move-result v1

    invoke-static/range {p3 .. p4}, Ly3/a;->i(J)I

    move-result v2

    new-instance v4, Ll1/p0;

    invoke-direct/range {v4 .. v9}, Ll1/p0;-><init>(Ly2/j1;ILy2/j1;Ly2/j1;Ly2/j1;)V

    sget-object v3, Lm83/z;->w:Lm83/z;

    invoke-interface {v0, v2, v1, v3, v4}, Ly2/t0;->W(IILjava/util/Map;Lkotlin/jvm/functions/Function1;)Ly2/s0;

    move-result-object v0

    return-object v0
.end method

.method public final b(Ly2/r;Ljava/util/List;I)I
    .locals 1

    const-string v0, "<this>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p2, Ljava/lang/Iterable;

    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p1

    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result p2

    if-eqz p2, :cond_2

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ly2/q0;

    invoke-interface {p2, p3}, Ly2/q0;->C(I)I

    move-result p2

    :cond_0
    :goto_0
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ly2/q0;

    invoke-interface {v0, p3}, Ly2/q0;->C(I)I

    move-result v0

    if-ge p2, v0, :cond_0

    move p2, v0

    goto :goto_0

    :cond_1
    return p2

    :cond_2
    new-instance p1, Ljava/util/NoSuchElementException;

    invoke-direct {p1}, Ljava/util/NoSuchElementException;-><init>()V

    throw p1
.end method
