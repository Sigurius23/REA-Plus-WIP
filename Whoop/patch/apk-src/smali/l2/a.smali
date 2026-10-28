.class public final Ll2/a;
.super Ljava/lang/Object;
.source "SourceFile"


# instance fields
.field public a:Z

.field public b:Ljava/lang/Object;

.field public c:Ljava/lang/Object;

.field public d:Ljava/lang/Object;

.field public e:Ljava/lang/Object;


# virtual methods
.method public a(Lso/q;Landroidx/compose/ui/platform/AndroidComposeView;Z)I
    .locals 17

    move-object/from16 v1, p0

    iget-object v0, v1, Ll2/a;->c:Ljava/lang/Object;

    check-cast v0, Lu2/d;

    iget-object v2, v1, Ll2/a;->e:Ljava/lang/Object;

    check-cast v2, La3/v;

    iget-boolean v3, v1, Ll2/a;->a:Z

    const/4 v4, 0x0

    if-eqz v3, :cond_0

    invoke-static {v4, v4, v4}, Lu2/d0;->a(ZZZ)I

    move-result v0

    return v0

    :cond_0
    const/4 v3, 0x1

    :try_start_0
    iput-boolean v3, v1, Ll2/a;->a:Z

    iget-object v5, v1, Ll2/a;->d:Ljava/lang/Object;

    check-cast v5, Lbu/c;

    move-object/from16 v6, p1

    move-object/from16 v7, p2

    invoke-virtual {v5, v6, v7}, Lbu/c;->H(Lso/q;Landroidx/compose/ui/platform/AndroidComposeView;)Lf1/p1;

    move-result-object v5

    invoke-virtual {v5}, Lf1/p1;->k()La0/y;

    move-result-object v6

    invoke-virtual {v6}, La0/y;->i()I

    move-result v6

    move v7, v4

    :goto_0
    if-ge v7, v6, :cond_3

    invoke-virtual {v5}, Lf1/p1;->k()La0/y;

    move-result-object v8

    invoke-virtual {v8, v7}, La0/y;->j(I)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lu2/r;

    invoke-virtual {v8}, Lu2/r;->f()Z

    move-result v9

    if-nez v9, :cond_2

    invoke-virtual {v8}, Lu2/r;->i()Z

    move-result v8

    if-eqz v8, :cond_1

    goto :goto_1

    :cond_1
    add-int/lit8 v7, v7, 0x1

    goto :goto_0

    :catchall_0
    move-exception v0

    goto/16 :goto_8

    :cond_2
    :goto_1
    move v6, v4

    goto :goto_2

    :cond_3
    move v6, v3

    :goto_2
    invoke-virtual {v5}, Lf1/p1;->k()La0/y;

    move-result-object v7

    invoke-virtual {v7}, La0/y;->i()I

    move-result v7

    move v8, v4

    :goto_3
    if-ge v8, v7, :cond_6

    invoke-virtual {v5}, Lf1/p1;->k()La0/y;

    move-result-object v9

    invoke-virtual {v9, v8}, La0/y;->j(I)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Lu2/r;

    if-nez v6, :cond_4

    invoke-static {v9}, Lu2/d0;->c(Lu2/r;)Z

    move-result v10

    if-eqz v10, :cond_5

    :cond_4
    iget-object v10, v1, Ll2/a;->b:Ljava/lang/Object;

    move-object v11, v10

    check-cast v11, La3/n0;

    invoke-virtual {v9}, Lu2/r;->e()J

    move-result-wide v12

    iget-object v10, v1, Ll2/a;->e:Ljava/lang/Object;

    move-object v14, v10

    check-cast v14, La3/v;

    invoke-virtual {v9}, Lu2/r;->j()I

    move-result v15

    const/16 v16, 0x1

    invoke-virtual/range {v11 .. v16}, La3/n0;->N(JLa3/v;IZ)V

    iget-object v10, v2, La3/v;->w:La0/q0;

    invoke-virtual {v10}, La0/q0;->g()Z

    move-result v10

    if-nez v10, :cond_5

    invoke-virtual {v9}, Lu2/r;->d()J

    move-result-wide v10

    invoke-static {v9}, Lu2/d0;->c(Lu2/r;)Z

    move-result v9

    invoke-virtual {v0, v10, v11, v2, v9}, Lu2/d;->a(JLjava/util/List;Z)V

    invoke-virtual {v2}, La3/v;->clear()V

    :cond_5
    add-int/lit8 v8, v8, 0x1

    goto :goto_3

    :cond_6
    move/from16 v2, p3

    invoke-virtual {v0, v5, v2}, Lu2/d;->b(Lf1/p1;Z)Z

    move-result v0

    invoke-virtual {v5}, Lf1/p1;->o()Z

    move-result v2

    if-eqz v2, :cond_8

    :cond_7
    move v2, v4

    goto :goto_5

    :cond_8
    invoke-virtual {v5}, Lf1/p1;->k()La0/y;

    move-result-object v2

    invoke-virtual {v2}, La0/y;->i()I

    move-result v2

    move v6, v4

    :goto_4
    if-ge v6, v2, :cond_7

    invoke-virtual {v5}, Lf1/p1;->k()La0/y;

    move-result-object v7

    invoke-virtual {v7, v6}, La0/y;->j(I)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lu2/r;

    invoke-static {v7}, Lu2/d0;->m(Lu2/r;)Z

    move-result v8

    if-eqz v8, :cond_9

    invoke-virtual {v7}, Lu2/r;->l()Z

    move-result v7

    if-eqz v7, :cond_9

    move v2, v3

    goto :goto_5

    :cond_9
    add-int/lit8 v6, v6, 0x1

    goto :goto_4

    :goto_5
    invoke-virtual {v5}, Lf1/p1;->k()La0/y;

    move-result-object v6

    invoke-virtual {v6}, La0/y;->i()I

    move-result v6

    move v7, v4

    :goto_6
    if-ge v7, v6, :cond_b

    invoke-virtual {v5}, Lf1/p1;->k()La0/y;

    move-result-object v8

    invoke-virtual {v8, v7}, La0/y;->j(I)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lu2/r;

    invoke-virtual {v8}, Lu2/r;->l()Z

    move-result v8

    if-eqz v8, :cond_a

    goto :goto_7

    :cond_a
    add-int/lit8 v7, v7, 0x1

    goto :goto_6

    :cond_b
    move v3, v4

    :goto_7
    invoke-static {v0, v2, v3}, Lu2/d0;->a(ZZZ)I

    move-result v0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    iput-boolean v4, v1, Ll2/a;->a:Z

    return v0

    :goto_8
    iput-boolean v4, v1, Ll2/a;->a:Z

    throw v0
.end method

.method public b(II)V
    .locals 2

    int-to-float v0, p1

    const/4 v1, 0x0

    cmpl-float v0, v0, v1

    if-ltz v0, :cond_0

    goto :goto_0

    :cond_0
    new-instance v0, Ljava/lang/StringBuilder;

    const-string v1, "Index should be non-negative ("

    invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const/16 v1, 0x29

    invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lk0/a;->a(Ljava/lang/String;)V

    :goto_0
    iget-object v0, p0, Ll2/a;->b:Ljava/lang/Object;

    check-cast v0, Lp1/h1;

    invoke-virtual {v0, p1}, Lp1/h1;->y(I)V

    iget-object v0, p0, Ll2/a;->e:Ljava/lang/Object;

    check-cast v0, Lp0/f0;

    invoke-virtual {v0, p1}, Lp0/f0;->a(I)V

    iget-object p1, p0, Ll2/a;->c:Ljava/lang/Object;

    check-cast p1, Lp1/h1;

    invoke-virtual {p1, p2}, Lp1/h1;->y(I)V

    return-void
.end method
