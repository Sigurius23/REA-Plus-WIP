.class public Lf0/w;
.super Lf0/h;
.source "SourceFile"


# instance fields
.field public k0:Lu2/r;


# virtual methods
.method public final b0()V
    .locals 1

    invoke-super {p0}, Lf0/h;->b0()V

    iget-object v0, p0, Lf0/w;->k0:Lu2/r;

    if-eqz v0, :cond_0

    const/4 v0, 0x0

    iput-object v0, p0, Lf0/w;->k0:Lu2/r;

    invoke-virtual {p0}, Lf0/h;->e1()V

    :cond_0
    return-void
.end method

.method public final b1()Lu2/h0;
    .locals 1

    const/4 v0, 0x0

    return-object v0
.end method

.method public final h1(Landroid/view/KeyEvent;)Z
    .locals 0

    const/4 p1, 0x0

    return p1
.end method

.method public final i1(Landroid/view/KeyEvent;)V
    .locals 0

    iget-object p1, p0, Lf0/h;->W:Lc93/a;

    invoke-interface {p1}, Lc93/a;->invoke()Ljava/lang/Object;

    return-void
.end method

.method public final r0(Lu2/k;Lu2/l;J)V
    .locals 16

    move-object/from16 v1, p0

    move-object/from16 v0, p1

    move-object/from16 v2, p2

    invoke-super/range {p0 .. p4}, Lf0/h;->r0(Lu2/k;Lu2/l;J)V

    sget-object v5, Lu2/l;->x:Lu2/l;

    move-wide/from16 v6, p3

    const/4 v4, 0x0

    const/4 v3, 0x0

    if-ne v2, v5, :cond_b

    iget-object v2, v1, Lf0/w;->k0:Lu2/r;

    const/4 v8, 0x3

    const/4 v5, 0x1

    if-nez v2, :cond_2

    invoke-static {v0, v5}, Lh0/o3;->g(Lu2/k;Z)Z

    move-result v2

    if-eqz v2, :cond_d

    iget-object v0, v0, Lu2/k;->a:Ljava/lang/Object;

    invoke-interface {v0, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lu2/r;

    invoke-virtual {v0}, Lu2/r;->a()V

    iput-object v0, v1, Lf0/w;->k0:Lu2/r;

    iget-boolean v2, v1, Lf0/h;->V:Z

    if-eqz v2, :cond_d

    invoke-virtual {v0}, Lu2/r;->e()J

    move-result-wide v2

    move-object v0, v1

    iget-object v1, v0, Lf0/h;->Q:Lj0/i;

    if-eqz v1, :cond_1

    new-instance v5, Lj0/l;

    invoke-direct {v5, v2, v3}, Lj0/l;-><init>(J)V

    invoke-virtual {v0}, Lf0/h;->c1()Z

    move-result v2

    if-eqz v2, :cond_0

    invoke-virtual {v0}, Lb2/v;->L0()Lbc3/c0;

    move-result-object v6

    new-instance v0, La1/h;

    move-object v2, v5

    const/16 v5, 0x14

    move-object/from16 v3, p0

    invoke-direct/range {v0 .. v5}, La1/h;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V

    move-object v1, v3

    move-object v9, v4

    invoke-static {v6, v9, v9, v0, v8}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    move-result-object v0

    iput-object v0, v1, Lf0/h;->h0:Lbc3/c2;

    return-void

    :cond_0
    move-object v2, v1

    move-object v1, v0

    move-object v0, v2

    move-object v9, v4

    move-object v2, v5

    iput-object v2, v1, Lf0/h;->b0:Lj0/l;

    invoke-virtual {v1}, Lb2/v;->L0()Lbc3/c0;

    move-result-object v3

    new-instance v4, Lf0/e;

    invoke-direct {v4, v0, v2, v9}, Lf0/e;-><init>(Lj0/i;Lj0/l;Lq83/d;)V

    invoke-static {v3, v9, v9, v4, v8}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    return-void

    :cond_1
    move-object v1, v0

    goto/16 :goto_5

    :cond_2
    move-object v9, v4

    iget-object v0, v0, Lu2/k;->a:Ljava/lang/Object;

    move-object v4, v0

    check-cast v4, Ljava/util/Collection;

    invoke-interface {v4}, Ljava/util/Collection;->size()I

    move-result v4

    move v10, v3

    :goto_0
    if-ge v10, v4, :cond_6

    invoke-interface {v0, v10}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Lu2/r;

    invoke-static {v11}, Lu2/d0;->d(Lu2/r;)Z

    move-result v11

    if-nez v11, :cond_5

    sget-object v2, Lb3/v1;->s:Lp1/u2;

    invoke-static {v1, v2}, La3/g;->f(La3/m;Lp1/t1;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lb3/j3;

    invoke-interface {v2}, Lb3/j3;->e()J

    move-result-wide v4

    invoke-static {v1}, La3/g;->p(La3/n;)La3/n0;

    move-result-object v2

    iget-object v2, v2, La3/n0;->X:Ly3/c;

    invoke-interface {v2, v4, v5}, Ly3/c;->D0(J)J

    move-result-wide v4

    const/16 v2, 0x20

    shr-long v10, v4, v2

    long-to-int v8, v10

    invoke-static {v8}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v8

    shr-long v10, v6, v2

    long-to-int v10, v10

    int-to-float v10, v10

    sub-float/2addr v8, v10

    const/4 v10, 0x0

    invoke-static {v10, v8}, Ljava/lang/Math;->max(FF)F

    move-result v8

    const/high16 v11, 0x40000000    # 2.0f

    div-float/2addr v8, v11

    const-wide v12, 0xffffffffL

    and-long/2addr v4, v12

    long-to-int v4, v4

    invoke-static {v4}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v4

    and-long v14, v6, v12

    long-to-int v5, v14

    int-to-float v5, v5

    sub-float/2addr v4, v5

    invoke-static {v10, v4}, Ljava/lang/Math;->max(FF)F

    move-result v4

    div-float/2addr v4, v11

    invoke-static {v8}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v5

    int-to-long v10, v5

    invoke-static {v4}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v4

    int-to-long v4, v4

    shl-long/2addr v10, v2

    and-long/2addr v4, v12

    or-long/2addr v4, v10

    move-object v2, v0

    check-cast v2, Ljava/util/Collection;

    invoke-interface {v2}, Ljava/util/Collection;->size()I

    move-result v2

    :goto_1
    if-ge v3, v2, :cond_d

    invoke-interface {v0, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lu2/r;

    invoke-virtual {v8}, Lu2/r;->l()Z

    move-result v10

    if-nez v10, :cond_4

    invoke-static {v8, v6, v7, v4, v5}, Lu2/d0;->h(Lu2/r;JJ)Z

    move-result v8

    if-eqz v8, :cond_3

    goto :goto_2

    :cond_3
    add-int/lit8 v3, v3, 0x1

    goto :goto_1

    :cond_4
    :goto_2
    iput-object v9, v1, Lf0/w;->k0:Lu2/r;

    invoke-virtual {v1}, Lf0/h;->e1()V

    return-void

    :cond_5
    add-int/lit8 v10, v10, 0x1

    goto/16 :goto_0

    :cond_6
    invoke-interface {v0, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lu2/r;

    invoke-virtual {v0}, Lu2/r;->a()V

    iget-boolean v0, v1, Lf0/h;->V:Z

    if-eqz v0, :cond_a

    invoke-virtual {v2}, Lu2/r;->e()J

    move-result-wide v2

    iget-object v4, v1, Lf0/h;->Q:Lj0/i;

    if-eqz v4, :cond_9

    iget-object v0, v1, Lf0/h;->h0:Lbc3/c2;

    if-eqz v0, :cond_7

    invoke-virtual {v0}, Lbc3/t1;->isActive()Z

    move-result v0

    if-ne v0, v5, :cond_7

    invoke-virtual {v1}, Lb2/v;->L0()Lbc3/c0;

    move-result-object v7

    new-instance v0, Lf0/c;

    const/4 v5, 0x0

    const/4 v6, 0x1

    invoke-direct/range {v0 .. v6}, Lf0/c;-><init>(Ljava/lang/Object;JLjava/lang/Object;Lq83/d;I)V

    invoke-static {v7, v9, v9, v0, v8}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    goto :goto_3

    :cond_7
    iget-object v0, v1, Lf0/h;->b0:Lj0/l;

    if-eqz v0, :cond_8

    invoke-virtual {v1}, Lb2/v;->L0()Lbc3/c0;

    move-result-object v2

    new-instance v3, Lf0/e;

    const/4 v5, 0x1

    invoke-direct {v3, v0, v4, v9, v5}, Lf0/e;-><init>(Lj0/l;Lj0/i;Lq83/d;I)V

    invoke-static {v2, v9, v9, v3, v8}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    :cond_8
    :goto_3
    iput-object v9, v1, Lf0/h;->b0:Lj0/l;

    :cond_9
    iget-object v0, v1, Lf0/h;->W:Lc93/a;

    invoke-interface {v0}, Lc93/a;->invoke()Ljava/lang/Object;

    :cond_a
    iput-object v9, v1, Lf0/w;->k0:Lu2/r;

    return-void

    :cond_b
    move-object v9, v4

    sget-object v4, Lu2/l;->y:Lu2/l;

    if-ne v2, v4, :cond_d

    iget-object v2, v1, Lf0/w;->k0:Lu2/r;

    if-eqz v2, :cond_d

    iget-object v0, v0, Lu2/k;->a:Ljava/lang/Object;

    move-object v2, v0

    check-cast v2, Ljava/util/Collection;

    invoke-interface {v2}, Ljava/util/Collection;->size()I

    move-result v2

    :goto_4
    if-ge v3, v2, :cond_d

    invoke-interface {v0, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lu2/r;

    invoke-virtual {v4}, Lu2/r;->l()Z

    move-result v5

    if-eqz v5, :cond_c

    iget-object v5, v1, Lf0/w;->k0:Lu2/r;

    invoke-virtual {v4, v5}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_c

    iput-object v9, v1, Lf0/w;->k0:Lu2/r;

    invoke-virtual {v1}, Lf0/h;->e1()V

    return-void

    :cond_c
    add-int/lit8 v3, v3, 0x1

    goto :goto_4

    :cond_d
    :goto_5
    return-void
.end method
