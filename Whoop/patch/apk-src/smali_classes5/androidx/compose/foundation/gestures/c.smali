.class public abstract Landroidx/compose/foundation/gestures/c;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(Lu2/b;Le10/k0;Ls83/a;)Ljava/lang/Object;
    .locals 5

    instance-of v0, p2, Lh0/w3;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lh0/w3;

    iget v1, v0, Lh0/w3;->z:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lh0/w3;->z:I

    goto :goto_0

    :cond_0
    new-instance v0, Lh0/w3;

    invoke-direct {v0, p2}, Ls83/c;-><init>(Lq83/d;)V

    :goto_0
    iget-object p2, v0, Lh0/w3;->y:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lh0/w3;->z:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p0, v0, Lh0/w3;->x:Le10/k0;

    iget-object p1, v0, Lh0/w3;->w:Lu2/b;

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    move-object v4, p1

    move-object p1, p0

    move-object p0, v4

    goto :goto_1

    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_2
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    :cond_3
    iput-object p0, v0, Lh0/w3;->w:Lu2/b;

    iput-object p1, v0, Lh0/w3;->x:Le10/k0;

    iput v3, v0, Lh0/w3;->z:I

    invoke-static {p0, p1, v0}, Landroidx/compose/foundation/gestures/c;->c(Lu2/b;Le10/k0;Ls83/a;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v1, :cond_4

    return-object v1

    :cond_4
    :goto_1
    check-cast p2, Lh2/b;

    if-eqz p2, :cond_3

    return-object p2
.end method

.method public static final b(Lu2/b;Ldc3/h;Leg/j;Ls83/a;)Ljava/lang/Object;
    .locals 26

    move-object/from16 v0, p3

    instance-of v1, v0, Lh0/x3;

    if-eqz v1, :cond_0

    move-object v1, v0

    check-cast v1, Lh0/x3;

    iget v2, v1, Lh0/x3;->M:I

    const/high16 v3, -0x80000000

    and-int v4, v2, v3

    if-eqz v4, :cond_0

    sub-int/2addr v2, v3

    iput v2, v1, Lh0/x3;->M:I

    goto :goto_0

    :cond_0
    new-instance v1, Lh0/x3;

    invoke-direct {v1, v0}, Ls83/c;-><init>(Lq83/d;)V

    :goto_0
    iget-object v0, v1, Lh0/x3;->L:Ljava/lang/Object;

    sget-object v2, Lr83/a;->w:Lr83/a;

    iget v3, v1, Lh0/x3;->M:I

    const/4 v7, 0x3

    const/4 v8, 0x2

    const/4 v9, 0x0

    const/4 v11, 0x1

    if-eqz v3, :cond_4

    if-eq v3, v11, :cond_3

    if-eq v3, v8, :cond_2

    if-ne v3, v7, :cond_1

    iget v3, v1, Lh0/x3;->K:I

    iget v12, v1, Lh0/x3;->J:I

    iget v13, v1, Lh0/x3;->G:F

    iget v14, v1, Lh0/x3;->I:I

    iget-wide v7, v1, Lh0/x3;->H:J

    iget v15, v1, Lh0/x3;->F:F

    iget v11, v1, Lh0/x3;->E:F

    iget-object v10, v1, Lh0/x3;->z:Lu2/k;

    iget-object v4, v1, Lh0/x3;->y:Lkotlin/jvm/functions/Function1;

    iget-object v5, v1, Lh0/x3;->x:Ldc3/l;

    iget-object v6, v1, Lh0/x3;->w:Lu2/b;

    invoke-static {v0}, Lts/o;->I(Ljava/lang/Object;)V

    move/from16 v20, v14

    move-object v14, v5

    move/from16 v5, v20

    move/from16 v20, v15

    move-object v15, v6

    move-wide v6, v7

    move/from16 v8, v20

    move/from16 v21, v9

    move-object v9, v10

    const/4 v10, 0x3

    const/high16 v20, 0x3f800000    # 1.0f

    goto/16 :goto_e

    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    iget v3, v1, Lh0/x3;->J:I

    iget v4, v1, Lh0/x3;->G:F

    iget v5, v1, Lh0/x3;->I:I

    iget-wide v6, v1, Lh0/x3;->H:J

    iget v8, v1, Lh0/x3;->F:F

    iget v10, v1, Lh0/x3;->E:F

    iget-object v11, v1, Lh0/x3;->y:Lkotlin/jvm/functions/Function1;

    iget-object v12, v1, Lh0/x3;->x:Ldc3/l;

    iget-object v13, v1, Lh0/x3;->w:Lu2/b;

    invoke-static {v0}, Lts/o;->I(Ljava/lang/Object;)V

    move-object v15, v13

    move v13, v4

    move-object v4, v11

    move v11, v10

    move v10, v8

    move-wide v7, v6

    move v6, v5

    move-object v5, v12

    move-object v12, v15

    const/4 v15, 0x2

    goto/16 :goto_2

    :cond_3
    iget v3, v1, Lh0/x3;->J:I

    iget v4, v1, Lh0/x3;->G:F

    iget v5, v1, Lh0/x3;->I:I

    iget-wide v6, v1, Lh0/x3;->H:J

    iget v8, v1, Lh0/x3;->F:F

    iget v10, v1, Lh0/x3;->E:F

    iget-object v11, v1, Lh0/x3;->y:Lkotlin/jvm/functions/Function1;

    iget-object v12, v1, Lh0/x3;->x:Ldc3/l;

    iget-object v13, v1, Lh0/x3;->w:Lu2/b;

    invoke-static {v0}, Lts/o;->I(Ljava/lang/Object;)V

    move v0, v3

    move-object v3, v11

    goto :goto_1

    :cond_4
    invoke-static {v0}, Lts/o;->I(Ljava/lang/Object;)V

    move-object/from16 v13, p0

    check-cast v13, Lu2/g0;

    invoke-virtual {v13}, Lu2/g0;->f()Lb3/j3;

    move-result-object v0

    invoke-interface {v0}, Lb3/j3;->g()F

    move-result v4

    iput-object v13, v1, Lh0/x3;->w:Lu2/b;

    move-object/from16 v0, p1

    iput-object v0, v1, Lh0/x3;->x:Ldc3/l;

    move-object/from16 v3, p2

    iput-object v3, v1, Lh0/x3;->y:Lkotlin/jvm/functions/Function1;

    iput v9, v1, Lh0/x3;->E:F

    const/high16 v5, 0x3f800000    # 1.0f

    iput v5, v1, Lh0/x3;->F:F

    const-wide/16 v5, 0x0

    iput-wide v5, v1, Lh0/x3;->H:J

    const/4 v5, 0x0

    iput v5, v1, Lh0/x3;->I:I

    iput v4, v1, Lh0/x3;->G:F

    iput v5, v1, Lh0/x3;->J:I

    const/4 v5, 0x1

    iput v5, v1, Lh0/x3;->M:I

    const/4 v15, 0x2

    invoke-static {v13, v1, v15}, Lh0/o3;->c(Lu2/b;Lq83/d;I)Ljava/lang/Object;

    move-result-object v5

    if-ne v5, v2, :cond_5

    goto/16 :goto_d

    :cond_5
    move-object v12, v0

    move v10, v9

    const/4 v0, 0x0

    const/4 v5, 0x0

    const-wide/16 v6, 0x0

    const/high16 v8, 0x3f800000    # 1.0f

    :goto_1
    iput-object v13, v1, Lh0/x3;->w:Lu2/b;

    iput-object v12, v1, Lh0/x3;->x:Ldc3/l;

    iput-object v3, v1, Lh0/x3;->y:Lkotlin/jvm/functions/Function1;

    const/4 v11, 0x0

    iput-object v11, v1, Lh0/x3;->z:Lu2/k;

    iput v10, v1, Lh0/x3;->E:F

    iput v8, v1, Lh0/x3;->F:F

    iput-wide v6, v1, Lh0/x3;->H:J

    iput v5, v1, Lh0/x3;->I:I

    iput v4, v1, Lh0/x3;->G:F

    iput v0, v1, Lh0/x3;->J:I

    const/4 v15, 0x2

    iput v15, v1, Lh0/x3;->M:I

    invoke-static {v13, v1}, Lu2/b;->H(Lu2/b;Ls83/a;)Ljava/lang/Object;

    move-result-object v11

    if-ne v11, v2, :cond_6

    goto/16 :goto_d

    :cond_6
    move-object/from16 v25, v3

    move v3, v0

    move-object v0, v11

    move v11, v10

    move v10, v8

    move-wide v7, v6

    move v6, v5

    move-object v5, v12

    move-object v12, v13

    move v13, v4

    move-object/from16 v4, v25

    :goto_2
    check-cast v0, Lu2/k;

    iget-object v14, v0, Lu2/k;->a:Ljava/lang/Object;

    move-object/from16 v16, v14

    check-cast v16, Ljava/util/Collection;

    move/from16 v21, v9

    invoke-interface/range {v16 .. v16}, Ljava/util/Collection;->size()I

    move-result v9

    const/4 v15, 0x0

    :goto_3
    if-ge v15, v9, :cond_8

    invoke-interface {v14, v15}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v22

    check-cast v22, Lu2/r;

    invoke-virtual/range {v22 .. v22}, Lu2/r;->l()Z

    move-result v22

    if-eqz v22, :cond_7

    const/4 v9, 0x1

    goto :goto_4

    :cond_7
    add-int/lit8 v15, v15, 0x1

    goto :goto_3

    :cond_8
    const/4 v9, 0x0

    :goto_4
    if-nez v9, :cond_13

    invoke-static {v0}, Lh0/q3;->l(Lu2/k;)F

    move-result v14

    invoke-static {v0}, Lh0/q3;->k(Lu2/k;)F

    move-result v15

    move/from16 p0, v10

    move/from16 p1, v11

    invoke-static {v0}, Lh0/q3;->j(Lu2/k;)J

    move-result-wide v10

    if-nez v6, :cond_b

    mul-float v22, p0, v14

    add-float v23, p1, v15

    invoke-static {v7, v8, v10, v11}, Lh2/b;->h(JJ)J

    move-result-wide v7

    move/from16 p2, v3

    const/4 v3, 0x0

    invoke-static {v0, v3}, Lh0/q3;->i(Lu2/k;Z)F

    move-result v18

    move/from16 v17, v6

    const/4 v3, 0x1

    int-to-float v6, v3

    sub-float v6, v6, v22

    invoke-static {v6}, Ljava/lang/Math;->abs(F)F

    move-result v6

    mul-float v6, v6, v18

    const v24, 0x40490fdb    # (float)Math.PI

    mul-float v24, v24, v23

    mul-float v24, v24, v18

    const/high16 v18, 0x43340000    # 180.0f

    div-float v24, v24, v18

    invoke-static/range {v24 .. v24}, Ljava/lang/Math;->abs(F)F

    move-result v18

    invoke-static {v7, v8}, Lh2/b;->d(J)F

    move-result v24

    cmpl-float v6, v6, v13

    if-gtz v6, :cond_a

    cmpl-float v6, v18, v13

    if-gtz v6, :cond_a

    cmpl-float v6, v24, v13

    if-lez v6, :cond_9

    new-instance v6, Lh2/b;

    invoke-direct {v6, v10, v11}, Lh2/b;-><init>(J)V

    invoke-interface {v4, v6}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/Boolean;

    invoke-virtual {v6}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v6

    if-eqz v6, :cond_9

    goto :goto_6

    :cond_9
    :goto_5
    move/from16 v6, p2

    goto :goto_7

    :cond_a
    :goto_6
    sget-object v6, Lh0/s3;->b:Lh0/s3;

    invoke-interface {v5, v6}, Ldc3/x;->s(Ljava/lang/Object;)Ljava/lang/Object;

    move/from16 v17, v3

    const/4 v6, 0x0

    goto :goto_7

    :cond_b
    move/from16 p2, v3

    move/from16 v17, v6

    const/4 v3, 0x1

    move/from16 v22, p0

    move/from16 v23, p1

    goto :goto_5

    :goto_7
    if-eqz v17, :cond_11

    if-eqz v6, :cond_c

    move/from16 v15, v21

    :cond_c
    cmpg-float v18, v15, v21

    const/high16 v20, 0x3f800000    # 1.0f

    if-nez v18, :cond_e

    cmpg-float v18, v14, v20

    if-nez v18, :cond_e

    move-object/from16 v18, v4

    const-wide/16 v3, 0x0

    invoke-static {v10, v11, v3, v4}, Lh2/b;->c(JJ)Z

    move-result v19

    if-nez v19, :cond_d

    new-instance v3, Lh2/b;

    invoke-direct {v3, v10, v11}, Lh2/b;-><init>(J)V

    move-object/from16 v4, v18

    invoke-interface {v4, v3}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Boolean;

    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v3

    if-eqz v3, :cond_f

    goto :goto_8

    :cond_d
    move-object/from16 v4, v18

    goto :goto_9

    :cond_e
    :goto_8
    new-instance v3, Lh0/r3;

    invoke-direct {v3, v14, v10, v11, v15}, Lh0/r3;-><init>(FJF)V

    invoke-interface {v5, v3}, Ldc3/x;->s(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_f
    :goto_9
    iget-object v3, v0, Lu2/k;->a:Ljava/lang/Object;

    move-object v10, v3

    check-cast v10, Ljava/util/Collection;

    invoke-interface {v10}, Ljava/util/Collection;->size()I

    move-result v10

    const/4 v11, 0x0

    :goto_a
    if-ge v11, v10, :cond_12

    invoke-interface {v3, v11}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v14

    check-cast v14, Lu2/r;

    invoke-static {v14}, Lu2/d0;->l(Lu2/r;)Z

    move-result v15

    if-eqz v15, :cond_10

    invoke-virtual {v14}, Lu2/r;->a()V

    :cond_10
    add-int/lit8 v11, v11, 0x1

    goto :goto_a

    :cond_11
    const/high16 v20, 0x3f800000    # 1.0f

    :cond_12
    move/from16 v15, v22

    move/from16 v11, v23

    :goto_b
    move/from16 v14, v17

    goto :goto_c

    :cond_13
    move/from16 p2, v3

    move/from16 v17, v6

    move/from16 p0, v10

    move/from16 p1, v11

    const/high16 v20, 0x3f800000    # 1.0f

    sget-object v3, Lh0/t3;->b:Lh0/t3;

    invoke-interface {v5, v3}, Ldc3/x;->s(Ljava/lang/Object;)Ljava/lang/Object;

    move/from16 v15, p0

    move/from16 v6, p2

    goto :goto_b

    :goto_c
    sget-object v3, Lu2/l;->y:Lu2/l;

    iput-object v12, v1, Lh0/x3;->w:Lu2/b;

    iput-object v5, v1, Lh0/x3;->x:Ldc3/l;

    iput-object v4, v1, Lh0/x3;->y:Lkotlin/jvm/functions/Function1;

    iput-object v0, v1, Lh0/x3;->z:Lu2/k;

    iput v11, v1, Lh0/x3;->E:F

    iput v15, v1, Lh0/x3;->F:F

    iput-wide v7, v1, Lh0/x3;->H:J

    iput v14, v1, Lh0/x3;->I:I

    iput v13, v1, Lh0/x3;->G:F

    iput v6, v1, Lh0/x3;->J:I

    iput v9, v1, Lh0/x3;->K:I

    const/4 v10, 0x3

    iput v10, v1, Lh0/x3;->M:I

    check-cast v12, Lu2/g0;

    invoke-virtual {v12, v3, v1}, Lu2/g0;->a(Lu2/l;Lq83/d;)Ljava/lang/Object;

    move-result-object v3

    if-ne v3, v2, :cond_14

    :goto_d
    return-object v2

    :cond_14
    move/from16 v25, v9

    move-object v9, v0

    move-object v0, v3

    move/from16 v3, v25

    move/from16 v25, v14

    move-object v14, v5

    move/from16 v5, v25

    move-object/from16 v25, v12

    move v12, v6

    move-wide v6, v7

    move v8, v15

    move-object/from16 v15, v25

    :goto_e
    check-cast v0, Lu2/k;

    iget-object v0, v0, Lu2/k;->a:Ljava/lang/Object;

    move-object/from16 v17, v0

    check-cast v17, Ljava/util/Collection;

    invoke-interface/range {v17 .. v17}, Ljava/util/Collection;->size()I

    move-result v10

    move-object/from16 p0, v1

    const/4 v1, 0x0

    :goto_f
    if-ge v1, v10, :cond_16

    invoke-interface {v0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v17

    check-cast v17, Lu2/r;

    invoke-virtual/range {v17 .. v17}, Lu2/r;->l()Z

    move-result v17

    if-eqz v17, :cond_15

    if-nez v5, :cond_16

    const/4 v0, 0x1

    goto :goto_10

    :cond_15
    add-int/lit8 v1, v1, 0x1

    goto :goto_f

    :cond_16
    const/4 v0, 0x0

    :goto_10
    if-nez v3, :cond_18

    if-nez v0, :cond_18

    iget-object v0, v9, Lu2/k;->a:Ljava/lang/Object;

    move-object v1, v0

    check-cast v1, Ljava/util/Collection;

    invoke-interface {v1}, Ljava/util/Collection;->size()I

    move-result v1

    const/4 v3, 0x0

    :goto_11
    if-ge v3, v1, :cond_18

    invoke-interface {v0, v3}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Lu2/r;

    iget-boolean v9, v9, Lu2/r;->d:Z

    if-eqz v9, :cond_17

    move-object/from16 v1, p0

    move-object v3, v4

    move v10, v11

    move v0, v12

    move v4, v13

    move-object v12, v14

    move-object v13, v15

    move/from16 v9, v21

    goto/16 :goto_1

    :cond_17
    add-int/lit8 v3, v3, 0x1

    goto :goto_11

    :cond_18
    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method

.method public static final c(Lu2/b;Le10/k0;Ls83/a;)Ljava/lang/Object;
    .locals 4

    instance-of v0, p2, Lh0/v3;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lh0/v3;

    iget v1, v0, Lh0/v3;->z:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lh0/v3;->z:I

    goto :goto_0

    :cond_0
    new-instance v0, Lh0/v3;

    invoke-direct {v0, p2}, Ls83/c;-><init>(Lq83/d;)V

    :goto_0
    iget-object p2, v0, Lh0/v3;->y:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lh0/v3;->z:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p1, v0, Lh0/v3;->x:Le10/k0;

    iget-object p0, v0, Lh0/v3;->w:Lu2/b;

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_2
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    iput-object p0, v0, Lh0/v3;->w:Lu2/b;

    iput-object p1, v0, Lh0/v3;->x:Le10/k0;

    iput v3, v0, Lh0/v3;->z:I

    invoke-static {p0, v0}, Lu2/b;->H(Lu2/b;Ls83/a;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v1, :cond_3

    return-object v1

    :cond_3
    :goto_1
    check-cast p2, Lu2/k;

    iget v0, p2, Lu2/k;->e:I

    and-int/lit16 v0, v0, 0x1000

    if-eqz v0, :cond_6

    iget v0, p2, Lu2/k;->f:I

    const/4 v1, 0x6

    if-ne v0, v1, :cond_6

    check-cast p0, Lu2/g0;

    iget-object p0, p0, Lu2/g0;->F:Lu2/h0;

    invoke-virtual {p1, p2}, Le10/k0;->l(Lu2/k;)J

    move-result-wide p0

    const-wide/16 v0, 0x0

    invoke-static {p0, p1, v0, v1}, Lh2/b;->c(JJ)Z

    move-result v0

    if-eqz v0, :cond_4

    goto :goto_3

    :cond_4
    iget-object p2, p2, Lu2/k;->a:Ljava/lang/Object;

    move-object v0, p2

    check-cast v0, Ljava/util/Collection;

    invoke-interface {v0}, Ljava/util/Collection;->size()I

    move-result v0

    const/4 v1, 0x0

    :goto_2
    if-ge v1, v0, :cond_5

    invoke-interface {p2, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lu2/r;

    invoke-virtual {v2}, Lu2/r;->a()V

    add-int/lit8 v1, v1, 0x1

    goto :goto_2

    :cond_5
    new-instance p2, Lh2/b;

    invoke-direct {p2, p0, p1}, Lh2/b;-><init>(J)V

    return-object p2

    :cond_6
    :goto_3
    const/4 p0, 0x0

    return-object p0
.end method

.method public static d(Landroidx/compose/ui/Modifier;Lh0/a4;)Landroidx/compose/ui/Modifier;
    .locals 2

    new-instance v0, Lgo1/a;

    const/16 v1, 0x18

    invoke-direct {v0, v1}, Lgo1/a;-><init>(I)V

    new-instance v1, Landroidx/compose/foundation/gestures/TransformableElement;

    invoke-direct {v1, p1, v0}, Landroidx/compose/foundation/gestures/TransformableElement;-><init>(Lh0/a4;Lgo1/a;)V

    invoke-interface {p0, v1}, Landroidx/compose/ui/Modifier;->e(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object p0

    return-object p0
.end method
