.class public abstract Lp00/h;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(Ljava/lang/String;ZLc93/a;Landroidx/compose/runtime/Composer;I)V
    .locals 29

    move-object/from16 v0, p0

    move/from16 v1, p1

    move-object/from16 v2, p2

    move-object/from16 v3, p3

    check-cast v3, Lp1/q;

    const v4, -0x42f7dd14

    invoke-virtual {v3, v4}, Lp1/q;->g0(I)Lp1/q;

    invoke-virtual {v3, v0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v4

    const/4 v5, 0x4

    if-eqz v4, :cond_0

    move v4, v5

    goto :goto_0

    :cond_0
    const/4 v4, 0x2

    :goto_0
    or-int v4, p4, v4

    invoke-virtual {v3, v1}, Lp1/q;->h(Z)Z

    move-result v6

    if-eqz v6, :cond_1

    const/16 v6, 0x20

    goto :goto_1

    :cond_1
    const/16 v6, 0x10

    :goto_1
    or-int/2addr v4, v6

    invoke-virtual {v3, v2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_2

    const/16 v6, 0x100

    goto :goto_2

    :cond_2
    const/16 v6, 0x80

    :goto_2
    or-int/2addr v4, v6

    and-int/lit16 v6, v4, 0x93

    const/16 v7, 0x92

    if-ne v6, v7, :cond_4

    invoke-virtual {v3}, Lp1/q;->F()Z

    move-result v6

    if-nez v6, :cond_3

    goto :goto_3

    :cond_3
    invoke-virtual {v3}, Lp1/q;->X()V

    move-object v0, v3

    goto/16 :goto_6

    :cond_4
    :goto_3
    sget-object v6, Ll0/m;->e:Ll0/h;

    sget-object v7, Lb2/e;->J:Lb2/l;

    const/4 v8, 0x6

    invoke-static {v6, v7, v3, v8}, Ll0/p1;->a(Ll0/i;Lb2/g;Landroidx/compose/runtime/Composer;I)Ll0/r1;

    move-result-object v6

    iget-wide v9, v3, Lp1/q;->T:J

    invoke-static {v9, v10}, Ljava/lang/Long;->hashCode(J)I

    move-result v7

    invoke-virtual {v3}, Lp1/q;->m()Lp1/p1;

    move-result-object v9

    sget-object v10, Lb2/t;->w:Lb2/t;

    invoke-static {v3, v10}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v11

    sget-object v12, La3/l;->a:La3/k;

    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v12, La3/k;->b:La3/j;

    invoke-virtual {v3}, Lp1/q;->i0()V

    iget-boolean v13, v3, Lp1/q;->S:Z

    if-eqz v13, :cond_5

    invoke-virtual {v3, v12}, Lp1/q;->l(Lc93/a;)V

    goto :goto_4

    :cond_5
    invoke-virtual {v3}, Lp1/q;->s0()V

    :goto_4
    sget-object v12, La3/k;->g:La3/i;

    invoke-static {v3, v12, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v6, La3/k;->f:La3/i;

    invoke-static {v3, v6, v9}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v6, La3/k;->j:La3/i;

    iget-boolean v9, v3, Lp1/q;->S:Z

    if-nez v9, :cond_6

    invoke-virtual {v3}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v9

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v12

    invoke-static {v9, v12}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v9

    if-nez v9, :cond_7

    :cond_6
    invoke-static {v7, v3, v7, v6}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_7
    sget-object v6, La3/k;->d:La3/i;

    invoke-static {v3, v6, v11}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const/high16 v6, 0x3f800000    # 1.0f

    float-to-double v11, v6

    const-wide/16 v13, 0x0

    cmpl-double v7, v11, v13

    if-lez v7, :cond_8

    goto :goto_5

    :cond_8
    const-string v7, "invalid weight; must be greater than zero"

    invoke-static {v7}, Lm0/a;->a(Ljava/lang/String;)V

    :goto_5
    new-instance v1, Landroidx/compose/foundation/layout/LayoutWeightElement;

    const/4 v7, 0x0

    invoke-direct {v1, v6, v7}, Landroidx/compose/foundation/layout/LayoutWeightElement;-><init>(FZ)V

    invoke-static {v3}, Lce/w;->K(Landroidx/compose/runtime/Composer;)Lg00/b;

    move-result-object v6

    iget-wide v6, v6, Lg00/b;->o:J

    invoke-static {v3}, Lce/w;->T(Landroidx/compose/runtime/Composer;)Lg00/e;

    move-result-object v9

    iget-object v9, v9, Lg00/e;->b:Ll3/v0;

    and-int/lit8 v22, v4, 0xe

    const/16 v23, 0xc30

    const v24, 0xd7f8

    move v11, v5

    const-wide/16 v4, 0x0

    move-object/from16 v21, v3

    move-wide v2, v6

    const/4 v6, 0x0

    const/4 v7, 0x0

    move v12, v8

    const/4 v8, 0x0

    move-object/from16 v20, v9

    move-object v13, v10

    const-wide/16 v9, 0x0

    move v14, v11

    const/4 v11, 0x0

    move v15, v12

    const/4 v12, 0x0

    move-object/from16 v17, v13

    move/from16 v16, v14

    const-wide/16 v13, 0x0

    move/from16 v18, v15

    const/4 v15, 0x2

    move/from16 v19, v16

    const/16 v16, 0x0

    move-object/from16 v25, v17

    const/16 v17, 0x1

    move/from16 v26, v18

    const/16 v18, 0x0

    move/from16 v27, v19

    const/16 v19, 0x0

    move-object/from16 v28, v25

    invoke-static/range {v0 .. v24}, Lg1/f9;->b(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Ll3/v0;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v0, v21

    const v1, 0x7f141103

    invoke-static {v0, v1}, Lq83/g;->Y(Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v1

    const-string v2, "verification_change_email_tag"

    move-object/from16 v13, v28

    invoke-static {v13, v2}, Landroidx/compose/ui/platform/a;->a(Landroidx/compose/ui/Modifier;Ljava/lang/String;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    const/4 v11, 0x4

    int-to-float v4, v11

    const/4 v7, 0x0

    const/16 v8, 0xe

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-static/range {v3 .. v8}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v2

    xor-int/lit8 v3, p1, 0x1

    const/4 v4, 0x0

    move-object/from16 v5, p2

    const/4 v12, 0x6

    invoke-static {v2, v3, v4, v5, v12}, Landroidx/compose/foundation/a;->f(Landroidx/compose/ui/Modifier;ZLjava/lang/String;Lc93/a;I)Landroidx/compose/ui/Modifier;

    move-result-object v2

    invoke-static {v0}, Lce/w;->K(Landroidx/compose/runtime/Composer;)Lg00/b;

    move-result-object v3

    iget-wide v3, v3, Lg00/b;->q:J

    invoke-static {v0}, Lce/w;->T(Landroidx/compose/runtime/Composer;)Lg00/e;

    move-result-object v6

    iget-object v6, v6, Lg00/e;->c:Ll3/v0;

    const/16 v23, 0xc00

    const v24, 0xdff8

    move-object v0, v1

    move-object v1, v2

    move-wide v2, v3

    const-wide/16 v4, 0x0

    move-object/from16 v20, v6

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const-wide/16 v13, 0x0

    const/4 v15, 0x0

    const/16 v22, 0x0

    invoke-static/range {v0 .. v24}, Lg1/f9;->b(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Ll3/v0;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v0, v21

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lp1/q;->q(Z)V

    :goto_6
    invoke-virtual {v0}, Lp1/q;->u()Lp1/v1;

    move-result-object v0

    if-eqz v0, :cond_9

    new-instance v1, Lp00/f;

    move-object/from16 v2, p0

    move/from16 v3, p1

    move-object/from16 v5, p2

    move/from16 v4, p4

    invoke-direct {v1, v2, v3, v5, v4}, Lp00/f;-><init>(Ljava/lang/String;ZLc93/a;I)V

    iput-object v1, v0, Lp1/v1;->d:Lc93/m;

    :cond_9
    return-void
.end method

.method public static final b(Lcom/stripe/android/model/ConsentUi$ConsentSection;Landroidx/compose/runtime/Composer;I)V
    .locals 28

    move-object/from16 v0, p0

    move/from16 v1, p2

    move-object/from16 v12, p1

    check-cast v12, Lp1/q;

    const v2, 0x65618cc1

    invoke-virtual {v12, v2}, Lp1/q;->g0(I)Lp1/q;

    invoke-virtual {v12, v0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v2

    const/4 v3, 0x2

    if-eqz v2, :cond_0

    const/4 v2, 0x4

    goto :goto_0

    :cond_0
    move v2, v3

    :goto_0
    or-int/2addr v2, v1

    and-int/lit8 v2, v2, 0x3

    if-ne v2, v3, :cond_2

    invoke-virtual {v12}, Lp1/q;->F()Z

    move-result v2

    if-nez v2, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {v12}, Lp1/q;->X()V

    goto :goto_2

    :cond_2
    :goto_1
    const/16 v2, 0x8

    int-to-float v5, v2

    const/4 v7, 0x0

    const/16 v8, 0xd

    sget-object v3, Lb2/t;->w:Lb2/t;

    const/4 v4, 0x0

    const/4 v6, 0x0

    invoke-static/range {v3 .. v8}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v3

    invoke-virtual {v0}, Lcom/stripe/android/model/ConsentUi$ConsentSection;->getDisclaimer()Ljava/lang/String;

    move-result-object v2

    const v4, -0x548d6062

    invoke-virtual {v12, v4}, Lp1/q;->e0(I)V

    sget-object v4, Lg00/g;->b:Lp1/u2;

    invoke-virtual {v12, v4}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lg00/e;

    const/4 v5, 0x0

    invoke-virtual {v12, v5}, Lp1/q;->q(Z)V

    iget-object v13, v4, Lg00/e;->f:Ll3/v0;

    const/16 v26, 0x0

    const v27, 0xff7fff

    const-wide/16 v14, 0x0

    const-wide/16 v16, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const-wide/16 v20, 0x0

    const/16 v22, 0x3

    const-wide/16 v23, 0x0

    const/16 v25, 0x0

    invoke-static/range {v13 .. v27}, Ll3/v0;->b(Ll3/v0;JJLp3/r;Lp3/i;JIJLl3/g0;Lw3/i;I)Ll3/v0;

    move-result-object v7

    const v4, -0x1a6f7841

    invoke-virtual {v12, v4}, Lp1/q;->e0(I)V

    sget-object v4, Lg00/g;->c:Lp1/u2;

    invoke-virtual {v12, v4}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lg00/b;

    invoke-virtual {v12, v5}, Lp1/q;->q(Z)V

    iget-wide v5, v4, Lg00/b;->o:J

    const/16 v13, 0x30

    const/16 v14, 0x1e4

    const/4 v4, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    invoke-static/range {v2 .. v14}, Lup/d;->d(Ljava/lang/String;Landroidx/compose/ui/Modifier;Ljava/util/Map;JLl3/v0;ZLl3/m0;ILc93/a;Landroidx/compose/runtime/Composer;II)V

    :goto_2
    invoke-virtual {v12}, Lp1/q;->u()Lp1/v1;

    move-result-object v2

    if-eqz v2, :cond_3

    new-instance v3, Loe2/c;

    const/16 v4, 0xb

    invoke-direct {v3, v0, v1, v4}, Loe2/c;-><init>(Ljava/lang/Object;II)V

    iput-object v3, v2, Lp1/v1;->d:Lc93/m;

    :cond_3
    return-void
.end method

.method public static final c(Lp00/q;Lg2/i;Lb3/x2;Lg2/s;Lc93/a;Landroid/content/Context;Lc93/a;Landroidx/compose/runtime/Composer;I)V
    .locals 21

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move-object/from16 v7, p5

    move/from16 v8, p8

    move-object/from16 v9, p7

    check-cast v9, Lp1/q;

    const v0, -0x57ce79ee

    invoke-virtual {v9, v0}, Lp1/q;->g0(I)Lp1/q;

    invoke-virtual {v9, v1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v0

    const/4 v10, 0x4

    if-eqz v0, :cond_0

    move v0, v10

    goto :goto_0

    :cond_0
    const/4 v0, 0x2

    :goto_0
    or-int/2addr v0, v8

    invoke-virtual {v9, v2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_1

    const/16 v3, 0x20

    goto :goto_1

    :cond_1
    const/16 v3, 0x10

    :goto_1
    or-int/2addr v0, v3

    move-object/from16 v3, p2

    invoke-virtual {v9, v3}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v4

    const/16 v6, 0x100

    if-eqz v4, :cond_2

    move v4, v6

    goto :goto_2

    :cond_2
    const/16 v4, 0x80

    :goto_2
    or-int/2addr v0, v4

    and-int/lit16 v4, v8, 0x6000

    move-object/from16 v12, p4

    if-nez v4, :cond_4

    invoke-virtual {v9, v12}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_3

    const/16 v4, 0x4000

    goto :goto_3

    :cond_3
    const/16 v4, 0x2000

    :goto_3
    or-int/2addr v0, v4

    :cond_4
    invoke-virtual {v9, v7}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_5

    const/high16 v4, 0x20000

    goto :goto_4

    :cond_5
    const/high16 v4, 0x10000

    :goto_4
    or-int/2addr v0, v4

    const/high16 v4, 0x180000

    and-int/2addr v4, v8

    move-object/from16 v14, p6

    if-nez v4, :cond_7

    invoke-virtual {v9, v14}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_6

    const/high16 v4, 0x100000

    goto :goto_5

    :cond_6
    const/high16 v4, 0x80000

    :goto_5
    or-int/2addr v0, v4

    :cond_7
    move v15, v0

    const v0, 0x92493

    and-int/2addr v0, v15

    const v4, 0x92492

    if-ne v0, v4, :cond_9

    invoke-virtual {v9}, Lp1/q;->F()Z

    move-result v0

    if-nez v0, :cond_8

    goto :goto_6

    :cond_8
    invoke-virtual {v9}, Lp1/q;->X()V

    goto/16 :goto_13

    :cond_9
    :goto_6
    iget-boolean v0, v1, Lp00/q;->w:Z

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    const v4, -0xf681ec6

    invoke-virtual {v9, v4}, Lp1/q;->e0(I)V

    and-int/lit8 v4, v15, 0xe

    const/16 v16, 0x1

    if-ne v4, v10, :cond_a

    move/from16 v17, v16

    goto :goto_7

    :cond_a
    const/16 v17, 0x0

    :goto_7
    invoke-virtual {v9, v2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v18

    or-int v17, v17, v18

    and-int/lit16 v13, v15, 0x380

    if-ne v13, v6, :cond_b

    move/from16 v18, v16

    goto :goto_8

    :cond_b
    const/16 v18, 0x0

    :goto_8
    or-int v17, v17, v18

    invoke-virtual {v9}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    move/from16 v19, v4

    const/4 v4, 0x0

    sget-object v11, Lp1/l;->a:Lp1/v0;

    if-nez v17, :cond_c

    if-ne v5, v11, :cond_d

    :cond_c
    move-object v5, v0

    goto :goto_9

    :cond_d
    move-object v10, v0

    move-object/from16 v18, v4

    move/from16 v20, v19

    const/4 v6, 0x0

    goto :goto_a

    :goto_9
    new-instance v0, Lay/u;

    move-object/from16 v17, v5

    const/16 v5, 0x10

    move-object/from16 v10, v17

    move/from16 v20, v19

    const/4 v6, 0x0

    invoke-direct/range {v0 .. v5}, Lay/u;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V

    move-object/from16 v18, v4

    invoke-virtual {v9, v0}, Lp1/q;->p0(Ljava/lang/Object;)V

    move-object v5, v0

    :goto_a
    check-cast v5, Lc93/m;

    invoke-virtual {v9, v6}, Lp1/q;->q(Z)V

    invoke-static {v9, v5, v10}, Lp1/x;->g(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v0, v1, Lp00/q;->x:Z

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v10

    const v0, -0xf6808d0

    invoke-virtual {v9, v0}, Lp1/q;->e0(I)V

    move/from16 v0, v20

    const/4 v2, 0x4

    if-ne v0, v2, :cond_e

    move/from16 v5, v16

    :goto_b
    const/16 v2, 0x100

    goto :goto_c

    :cond_e
    move v5, v6

    goto :goto_b

    :goto_c
    if-ne v13, v2, :cond_f

    move/from16 v2, v16

    goto :goto_d

    :cond_f
    move v2, v6

    :goto_d
    or-int/2addr v2, v5

    const v3, 0xe000

    and-int/2addr v3, v15

    const/16 v4, 0x4000

    if-ne v3, v4, :cond_10

    move/from16 v5, v16

    goto :goto_e

    :cond_10
    move v5, v6

    :goto_e
    or-int/2addr v2, v5

    invoke-virtual {v9}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    if-nez v2, :cond_11

    if-ne v3, v11, :cond_12

    :cond_11
    move/from16 v19, v0

    goto :goto_f

    :cond_12
    move v12, v0

    move v13, v6

    goto :goto_10

    :goto_f
    new-instance v0, Lb2/y;

    const/4 v5, 0x0

    move v2, v6

    const/16 v6, 0x14

    move-object/from16 v3, p2

    move v13, v2

    move-object v4, v12

    move/from16 v12, v19

    move-object/from16 v2, p3

    invoke-direct/range {v0 .. v6}, Lb2/y;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V

    invoke-virtual {v9, v0}, Lp1/q;->p0(Ljava/lang/Object;)V

    move-object v3, v0

    :goto_10
    check-cast v3, Lc93/m;

    invoke-virtual {v9, v13}, Lp1/q;->q(Z)V

    invoke-static {v9, v3, v10}, Lp1/x;->g(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v0, v1, Lp00/q;->E:Z

    invoke-static {v0}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v6

    const v0, -0xf67e844

    invoke-virtual {v9, v0}, Lp1/q;->e0(I)V

    const/4 v2, 0x4

    if-ne v12, v2, :cond_13

    move/from16 v5, v16

    goto :goto_11

    :cond_13
    move v5, v13

    :goto_11
    invoke-virtual {v9, v7}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v0

    or-int/2addr v0, v5

    const/high16 v2, 0x380000

    and-int/2addr v2, v15

    const/high16 v3, 0x100000

    if-ne v2, v3, :cond_14

    goto :goto_12

    :cond_14
    move/from16 v16, v13

    :goto_12
    or-int v0, v0, v16

    invoke-virtual {v9}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    if-nez v0, :cond_15

    if-ne v2, v11, :cond_16

    :cond_15
    new-instance v0, Lay/u;

    const/16 v5, 0x11

    move-object v2, v7

    move-object v3, v14

    move-object/from16 v4, v18

    invoke-direct/range {v0 .. v5}, Lay/u;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V

    invoke-virtual {v9, v0}, Lp1/q;->p0(Ljava/lang/Object;)V

    move-object v2, v0

    :cond_16
    check-cast v2, Lc93/m;

    invoke-virtual {v9, v13}, Lp1/q;->q(Z)V

    invoke-static {v9, v2, v6}, Lp1/x;->g(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    :goto_13
    invoke-virtual {v9}, Lp1/q;->u()Lp1/v1;

    move-result-object v10

    if-eqz v10, :cond_17

    new-instance v0, Lb30/u2;

    const/16 v9, 0xb

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move-object/from16 v4, p3

    move-object/from16 v5, p4

    move-object/from16 v6, p5

    move-object/from16 v7, p6

    invoke-direct/range {v0 .. v9}, Lb30/u2;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;II)V

    iput-object v0, v10, Lp1/v1;->d:Lc93/m;

    :cond_17
    return-void
.end method

.method public static final d(ZZLc93/a;Landroidx/compose/runtime/Composer;I)V
    .locals 32

    move/from16 v1, p0

    move/from16 v2, p1

    move-object/from16 v0, p2

    const-string v3, "onClick"

    invoke-static {v0, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v8, p3

    check-cast v8, Lp1/q;

    const v3, 0x51360bd7

    invoke-virtual {v8, v3}, Lp1/q;->g0(I)Lp1/q;

    invoke-virtual {v8, v1}, Lp1/q;->h(Z)Z

    move-result v3

    if-eqz v3, :cond_0

    const/4 v3, 0x4

    goto :goto_0

    :cond_0
    const/4 v3, 0x2

    :goto_0
    or-int v3, p4, v3

    invoke-virtual {v8, v2}, Lp1/q;->h(Z)Z

    move-result v4

    if-eqz v4, :cond_1

    const/16 v4, 0x20

    goto :goto_1

    :cond_1
    const/16 v4, 0x10

    :goto_1
    or-int/2addr v3, v4

    invoke-virtual {v8, v0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_2

    const/16 v4, 0x100

    goto :goto_2

    :cond_2
    const/16 v4, 0x80

    :goto_2
    or-int/2addr v3, v4

    and-int/lit16 v4, v3, 0x93

    const/16 v5, 0x92

    if-ne v4, v5, :cond_4

    invoke-virtual {v8}, Lp1/q;->F()Z

    move-result v4

    if-nez v4, :cond_3

    goto :goto_3

    :cond_3
    invoke-virtual {v8}, Lp1/q;->X()V

    goto/16 :goto_a

    :cond_4
    :goto_3
    const-string v4, "verification_resend_code_button_tag"

    sget-object v5, Lb2/t;->w:Lb2/t;

    invoke-static {v5, v4}, Landroidx/compose/ui/platform/a;->a(Landroidx/compose/ui/Modifier;Ljava/lang/String;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    const/4 v6, 0x1

    const/4 v7, 0x0

    if-nez v1, :cond_5

    if-nez v2, :cond_5

    move v9, v6

    goto :goto_4

    :cond_5
    move v9, v7

    :goto_4
    const/4 v10, 0x0

    const/4 v11, 0x6

    invoke-static {v4, v9, v10, v0, v11}, Landroidx/compose/foundation/a;->f(Landroidx/compose/ui/Modifier;ZLjava/lang/String;Lc93/a;I)Landroidx/compose/ui/Modifier;

    move-result-object v4

    sget-object v9, Lb2/e;->E:Lb2/m;

    invoke-static {v9, v7}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v9

    iget-wide v10, v8, Lp1/q;->T:J

    invoke-static {v10, v11}, Ljava/lang/Long;->hashCode(J)I

    move-result v10

    invoke-virtual {v8}, Lp1/q;->m()Lp1/p1;

    move-result-object v11

    invoke-static {v8, v4}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    sget-object v12, La3/l;->a:La3/k;

    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v12, La3/k;->b:La3/j;

    invoke-virtual {v8}, Lp1/q;->i0()V

    iget-boolean v13, v8, Lp1/q;->S:Z

    if-eqz v13, :cond_6

    invoke-virtual {v8, v12}, Lp1/q;->l(Lc93/a;)V

    goto :goto_5

    :cond_6
    invoke-virtual {v8}, Lp1/q;->s0()V

    :goto_5
    sget-object v12, La3/k;->g:La3/i;

    invoke-static {v8, v12, v9}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v9, La3/k;->f:La3/i;

    invoke-static {v8, v9, v11}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v9, La3/k;->j:La3/i;

    iget-boolean v11, v8, Lp1/q;->S:Z

    if-nez v11, :cond_7

    invoke-virtual {v8}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v11

    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v12

    invoke-static {v11, v12}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v11

    if-nez v11, :cond_8

    :cond_7
    invoke-static {v10, v8, v10, v9}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_8
    sget-object v9, La3/k;->d:La3/i;

    invoke-static {v8, v9, v4}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    if-eqz v1, :cond_a

    const v4, -0xb6a5ede

    invoke-virtual {v8, v4}, Lp1/q;->e0(I)V

    sget-object v4, Lg1/l1;->a:Lp1/b0;

    invoke-virtual {v8, v4}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Li2/x;

    iget-wide v9, v4, Li2/x;->a:J

    sget-object v4, Lg1/d1;->a:Lp1/u2;

    invoke-virtual {v8, v4}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lg1/c1;

    invoke-virtual {v4}, Lg1/c1;->i()Z

    move-result v4

    if-eqz v4, :cond_9

    invoke-static {v9, v10}, Li2/w0;->x(J)F

    goto :goto_6

    :cond_9
    invoke-static {v9, v10}, Li2/w0;->x(J)F

    :goto_6
    invoke-virtual {v8, v7}, Lp1/q;->q(Z)V

    const v4, 0x3ec28f5c    # 0.38f

    goto :goto_9

    :cond_a
    if-eqz v2, :cond_b

    const v4, -0xb69464b

    invoke-virtual {v8, v4}, Lp1/q;->e0(I)V

    invoke-virtual {v8, v7}, Lp1/q;->q(Z)V

    const/4 v4, 0x0

    goto :goto_9

    :cond_b
    const v4, -0xb68c87a

    invoke-virtual {v8, v4}, Lp1/q;->e0(I)V

    sget-object v4, Lg1/l1;->a:Lp1/b0;

    invoke-virtual {v8, v4}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Li2/x;

    iget-wide v9, v4, Li2/x;->a:J

    sget-object v4, Lg1/d1;->a:Lp1/u2;

    invoke-virtual {v8, v4}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lg1/c1;

    invoke-virtual {v4}, Lg1/c1;->i()Z

    move-result v4

    const-wide/high16 v11, 0x3fe0000000000000L    # 0.5

    if-eqz v4, :cond_c

    invoke-static {v9, v10}, Li2/w0;->x(J)F

    move-result v4

    float-to-double v9, v4

    cmpl-double v4, v9, v11

    if-lez v4, :cond_d

    goto :goto_7

    :cond_c
    invoke-static {v9, v10}, Li2/w0;->x(J)F

    move-result v4

    float-to-double v9, v4

    cmpg-double v4, v9, v11

    if-gez v4, :cond_d

    :goto_7
    const/high16 v4, 0x3f800000    # 1.0f

    goto :goto_8

    :cond_d
    const v4, 0x3f5eb852    # 0.87f

    :goto_8
    invoke-virtual {v8, v7}, Lp1/q;->q(Z)V

    :goto_9
    const v9, 0x7f14110b

    invoke-static {v8, v9}, Lq83/g;->Y(Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v9

    const v10, -0x548d6062

    invoke-virtual {v8, v10}, Lp1/q;->e0(I)V

    sget-object v10, Lg00/g;->b:Lp1/u2;

    invoke-virtual {v8, v10}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Lg00/e;

    invoke-virtual {v8, v7}, Lp1/q;->q(Z)V

    iget-object v10, v10, Lg00/e;->c:Ll3/v0;

    const v11, -0x1a6f7841

    invoke-virtual {v8, v11}, Lp1/q;->e0(I)V

    sget-object v11, Lg00/g;->c:Lp1/u2;

    invoke-virtual {v8, v11}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Lg00/b;

    invoke-virtual {v8, v7}, Lp1/q;->q(Z)V

    iget-wide v11, v11, Lg00/b;->q:J

    invoke-static {v4, v5}, Lts/o;->c(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v5

    const/16 v27, 0x0

    const v28, 0xfff8

    move-object/from16 v25, v8

    move-object v4, v9

    const-wide/16 v8, 0x0

    move-object/from16 v24, v10

    const/4 v10, 0x0

    move-wide/from16 v30, v11

    move v12, v6

    move-wide/from16 v6, v30

    const/4 v11, 0x0

    move v13, v12

    const/4 v12, 0x0

    move v15, v13

    const-wide/16 v13, 0x0

    move/from16 v16, v15

    const/4 v15, 0x0

    move/from16 v17, v16

    const/16 v16, 0x0

    move/from16 v19, v17

    const-wide/16 v17, 0x0

    move/from16 v20, v19

    const/16 v19, 0x0

    move/from16 v21, v20

    const/16 v20, 0x0

    move/from16 v22, v21

    const/16 v21, 0x0

    move/from16 v23, v22

    const/16 v22, 0x0

    move/from16 v26, v23

    const/16 v23, 0x0

    move/from16 v29, v26

    const/16 v26, 0x0

    invoke-static/range {v4 .. v28}, Lg1/f9;->b(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Ll3/v0;Landroidx/compose/runtime/Composer;III)V

    sget-object v7, Lp00/d;->b:Lx1/b;

    shr-int/lit8 v3, v3, 0x3

    and-int/lit8 v3, v3, 0xe

    const/high16 v4, 0x30000

    or-int v9, v3, v4

    const/16 v10, 0x1e

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    move-object/from16 v8, v25

    invoke-static/range {v2 .. v10}, Landroidx/compose/animation/b;->f(ZLandroidx/compose/ui/Modifier;Lc0/c1;Lc0/e1;Ljava/lang/String;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V

    const/4 v12, 0x1

    invoke-virtual {v8, v12}, Lp1/q;->q(Z)V

    :goto_a
    invoke-virtual {v8}, Lp1/q;->u()Lp1/v1;

    move-result-object v6

    if-eqz v6, :cond_e

    new-instance v0, Loy/d;

    const/4 v5, 0x1

    move/from16 v2, p1

    move-object/from16 v3, p2

    move/from16 v4, p4

    invoke-direct/range {v0 .. v5}, Loy/d;-><init>(ZZLc93/a;II)V

    iput-object v0, v6, Lp1/v1;->d:Lc93/m;

    :cond_e
    return-void
.end method

.method public static final e(ZLandroidx/compose/runtime/Composer;I)V
    .locals 28

    move/from16 v0, p0

    move/from16 v1, p2

    move-object/from16 v2, p1

    check-cast v2, Lp1/q;

    const v3, -0x4a4664ef

    invoke-virtual {v2, v3}, Lp1/q;->g0(I)Lp1/q;

    invoke-virtual {v2, v0}, Lp1/q;->h(Z)Z

    move-result v3

    const/4 v4, 0x2

    const/4 v5, 0x4

    if-eqz v3, :cond_0

    move v3, v5

    goto :goto_0

    :cond_0
    move v3, v4

    :goto_0
    or-int/2addr v3, v1

    const/4 v6, 0x3

    and-int/2addr v3, v6

    if-ne v3, v4, :cond_2

    invoke-virtual {v2}, Lp1/q;->F()Z

    move-result v3

    if-nez v3, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {v2}, Lp1/q;->X()V

    goto/16 :goto_2

    :cond_2
    :goto_1
    sget-object v3, Lb2/t;->w:Lb2/t;

    const v4, -0x1a6f7841

    const v7, -0x548d6062

    const-string v8, "verification_title"

    const v9, 0x7f141105

    const/4 v10, 0x0

    if-eqz v0, :cond_3

    const v5, 0x5e739aef

    invoke-virtual {v2, v5}, Lp1/q;->e0(I)V

    invoke-static {v2, v9}, Lq83/g;->Y(Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v5

    invoke-static {v3, v8}, Landroidx/compose/ui/platform/a;->a(Landroidx/compose/ui/Modifier;Ljava/lang/String;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    invoke-virtual {v2, v7}, Lp1/q;->e0(I)V

    sget-object v7, Lg00/g;->b:Lp1/u2;

    invoke-virtual {v2, v7}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lg00/e;

    invoke-virtual {v2, v10}, Lp1/q;->q(Z)V

    iget-object v7, v7, Lg00/e;->a:Ll3/v0;

    invoke-virtual {v2, v4}, Lp1/q;->e0(I)V

    sget-object v4, Lg00/g;->c:Lp1/u2;

    invoke-virtual {v2, v4}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lg00/b;

    invoke-virtual {v2, v10}, Lp1/q;->q(Z)V

    iget-wide v8, v4, Lg00/b;->m:J

    new-instance v14, Lw3/k;

    invoke-direct {v14, v6}, Lw3/k;-><init>(I)V

    const/16 v25, 0x0

    const v26, 0xfdf8

    move-object/from16 v22, v7

    const-wide/16 v6, 0x0

    move-object/from16 v23, v2

    move-object v2, v5

    move-wide v4, v8

    const/4 v8, 0x0

    const/4 v9, 0x0

    move v11, v10

    const/4 v10, 0x0

    move v13, v11

    const-wide/16 v11, 0x0

    move v15, v13

    const/4 v13, 0x0

    move/from16 v17, v15

    const-wide/16 v15, 0x0

    move/from16 v18, v17

    const/16 v17, 0x0

    move/from16 v19, v18

    const/16 v18, 0x0

    move/from16 v20, v19

    const/16 v19, 0x0

    move/from16 v21, v20

    const/16 v20, 0x0

    move/from16 v24, v21

    const/16 v21, 0x0

    move/from16 v27, v24

    const/16 v24, 0x30

    move/from16 v0, v27

    invoke-static/range {v2 .. v26}, Lg1/f9;->b(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Ll3/v0;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v2, v23

    invoke-virtual {v2, v0}, Lp1/q;->q(Z)V

    goto :goto_2

    :cond_3
    move v0, v10

    const v10, 0x5e78e0a5

    invoke-virtual {v2, v10}, Lp1/q;->e0(I)V

    invoke-static {v2, v9}, Lq83/g;->Y(Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v9

    invoke-static {v3, v8}, Landroidx/compose/ui/platform/a;->a(Landroidx/compose/ui/Modifier;Ljava/lang/String;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    int-to-float v5, v5

    const/4 v8, 0x1

    const/4 v10, 0x0

    invoke-static {v3, v10, v5, v8}, Landroidx/compose/foundation/layout/a;->r(Landroidx/compose/ui/Modifier;FFI)Landroidx/compose/ui/Modifier;

    move-result-object v3

    invoke-virtual {v2, v7}, Lp1/q;->e0(I)V

    sget-object v5, Lg00/g;->b:Lp1/u2;

    invoke-virtual {v2, v5}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lg00/e;

    invoke-virtual {v2, v0}, Lp1/q;->q(Z)V

    iget-object v5, v5, Lg00/e;->a:Ll3/v0;

    invoke-virtual {v2, v4}, Lp1/q;->e0(I)V

    sget-object v4, Lg00/g;->c:Lp1/u2;

    invoke-virtual {v2, v4}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lg00/b;

    invoke-virtual {v2, v0}, Lp1/q;->q(Z)V

    iget-wide v7, v4, Lg00/b;->m:J

    new-instance v14, Lw3/k;

    invoke-direct {v14, v6}, Lw3/k;-><init>(I)V

    const/16 v25, 0x0

    const v26, 0xfdf8

    move-object/from16 v22, v5

    move-wide v4, v7

    const-wide/16 v6, 0x0

    const/4 v8, 0x0

    move-object/from16 v23, v2

    move-object v2, v9

    const/4 v9, 0x0

    const/4 v10, 0x0

    const-wide/16 v11, 0x0

    const/4 v13, 0x0

    const-wide/16 v15, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v24, 0x30

    invoke-static/range {v2 .. v26}, Lg1/f9;->b(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Ll3/v0;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v2, v23

    invoke-virtual {v2, v0}, Lp1/q;->q(Z)V

    :goto_2
    invoke-virtual {v2}, Lp1/q;->u()Lp1/v1;

    move-result-object v0

    if-eqz v0, :cond_4

    new-instance v2, Lc30/b;

    const/4 v3, 0x3

    move/from16 v4, p0

    invoke-direct {v2, v4, v1, v3}, Lc30/b;-><init>(ZII)V

    iput-object v2, v0, Lp1/v1;->d:Lc93/m;

    :cond_4
    return-void
.end method

.method public static final f(Lp00/q;Lg40/o1;Lc93/a;Lc93/a;Lc93/a;Lc93/a;Lc93/a;Lc93/a;Landroidx/compose/runtime/Composer;I)V
    .locals 16

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move-object/from16 v4, p3

    move-object/from16 v5, p4

    move-object/from16 v6, p5

    move-object/from16 v7, p6

    move-object/from16 v8, p7

    move/from16 v9, p9

    const-string v0, "state"

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-boolean v10, v1, Lp00/q;->H:Z

    const-string v0, "otpElement"

    invoke-static {v2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onBack"

    invoke-static {v3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onFocusRequested"

    invoke-static {v4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "didShowCodeSentNotification"

    invoke-static {v5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onChangeEmailClick"

    invoke-static {v6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onResendCodeClick"

    invoke-static {v7, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onConsentShown"

    invoke-static {v8, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v0, p8

    check-cast v0, Lp1/q;

    const v11, 0x1193f558

    invoke-virtual {v0, v11}, Lp1/q;->g0(I)Lp1/q;

    invoke-virtual {v0, v1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_0

    const/4 v11, 0x4

    goto :goto_0

    :cond_0
    const/4 v11, 0x2

    :goto_0
    or-int/2addr v11, v9

    invoke-virtual {v0, v2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v12

    if-eqz v12, :cond_1

    const/16 v12, 0x20

    goto :goto_1

    :cond_1
    const/16 v12, 0x10

    :goto_1
    or-int/2addr v11, v12

    and-int/lit16 v12, v9, 0x180

    const/16 v13, 0x100

    if-nez v12, :cond_3

    invoke-virtual {v0, v3}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v12

    if-eqz v12, :cond_2

    move v12, v13

    goto :goto_2

    :cond_2
    const/16 v12, 0x80

    :goto_2
    or-int/2addr v11, v12

    :cond_3
    and-int/lit16 v12, v9, 0xc00

    if-nez v12, :cond_5

    invoke-virtual {v0, v4}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v12

    if-eqz v12, :cond_4

    const/16 v12, 0x800

    goto :goto_3

    :cond_4
    const/16 v12, 0x400

    :goto_3
    or-int/2addr v11, v12

    :cond_5
    and-int/lit16 v12, v9, 0x6000

    if-nez v12, :cond_7

    invoke-virtual {v0, v5}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v12

    if-eqz v12, :cond_6

    const/16 v12, 0x4000

    goto :goto_4

    :cond_6
    const/16 v12, 0x2000

    :goto_4
    or-int/2addr v11, v12

    :cond_7
    const/high16 v12, 0x30000

    and-int/2addr v12, v9

    if-nez v12, :cond_9

    invoke-virtual {v0, v6}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v12

    if-eqz v12, :cond_8

    const/high16 v12, 0x20000

    goto :goto_5

    :cond_8
    const/high16 v12, 0x10000

    :goto_5
    or-int/2addr v11, v12

    :cond_9
    const/high16 v12, 0x180000

    and-int/2addr v12, v9

    if-nez v12, :cond_b

    invoke-virtual {v0, v7}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v12

    if-eqz v12, :cond_a

    const/high16 v12, 0x100000

    goto :goto_6

    :cond_a
    const/high16 v12, 0x80000

    :goto_6
    or-int/2addr v11, v12

    :cond_b
    const/high16 v12, 0xc00000

    and-int/2addr v12, v9

    if-nez v12, :cond_d

    invoke-virtual {v0, v8}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v12

    if-eqz v12, :cond_c

    const/high16 v12, 0x800000

    goto :goto_7

    :cond_c
    const/high16 v12, 0x400000

    :goto_7
    or-int/2addr v11, v12

    :cond_d
    const v12, 0x492493

    and-int/2addr v12, v11

    const v14, 0x492492

    if-ne v12, v14, :cond_f

    invoke-virtual {v0}, Lp1/q;->F()Z

    move-result v12

    if-nez v12, :cond_e

    goto :goto_8

    :cond_e
    invoke-virtual {v0}, Lp1/q;->X()V

    move-object v7, v0

    move-object v9, v3

    goto/16 :goto_a

    :cond_f
    :goto_8
    const v12, 0x530ecd0f

    invoke-virtual {v0, v12}, Lp1/q;->e0(I)V

    iget-boolean v12, v1, Lp00/q;->L:Z

    const/16 v14, 0x180

    const/4 v15, 0x0

    if-eqz v12, :cond_10

    sget-object v12, Lp00/d;->a:Lx1/b;

    shr-int/lit8 v11, v11, 0x3

    and-int/lit8 v11, v11, 0x70

    or-int/2addr v11, v14

    invoke-static {v10, v3, v12, v0, v11}, Lp00/h;->g(ZLc93/a;Lx1/b;Landroidx/compose/runtime/Composer;I)V

    invoke-virtual {v0, v15}, Lp1/q;->q(Z)V

    invoke-virtual {v0}, Lp1/q;->u()Lp1/v1;

    move-result-object v11

    if-eqz v11, :cond_15

    new-instance v0, Lp00/e;

    const/4 v10, 0x0

    invoke-direct/range {v0 .. v10}, Lp00/e;-><init>(Lp00/q;Lg40/o1;Lc93/a;Lc93/a;Lc93/a;Lc93/a;Lc93/a;Lc93/a;II)V

    iput-object v0, v11, Lp1/v1;->d:Lc93/m;

    return-void

    :cond_10
    move-object v9, v3

    invoke-virtual {v0, v15}, Lp1/q;->q(Z)V

    sget-object v1, Landroidx/compose/ui/platform/AndroidCompositionLocals_androidKt;->b:Lp1/u2;

    invoke-virtual {v0, v1}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v1

    move-object v5, v1

    check-cast v5, Landroid/content/Context;

    sget-object v1, Lb3/v1;->i:Lp1/u2;

    invoke-virtual {v0, v1}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lg2/i;

    const v2, 0x530ef7b4

    invoke-virtual {v0, v2}, Lp1/q;->e0(I)V

    invoke-virtual {v0}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    sget-object v12, Lp1/l;->a:Lp1/v0;

    if-ne v2, v12, :cond_11

    invoke-static {v0}, Lte0/d;->h(Lp1/q;)Lg2/s;

    move-result-object v2

    :cond_11
    move-object v3, v2

    check-cast v3, Lg2/s;

    invoke-virtual {v0, v15}, Lp1/q;->q(Z)V

    sget-object v2, Lb3/v1;->p:Lp1/u2;

    invoke-virtual {v0, v2}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lb3/x2;

    and-int/lit8 v4, v11, 0xe

    or-int/lit16 v4, v4, 0xc00

    shl-int/lit8 v6, v11, 0x3

    const v7, 0xe000

    and-int/2addr v6, v7

    or-int/2addr v4, v6

    const/high16 v6, 0x380000

    shl-int/lit8 v7, v11, 0x6

    and-int/2addr v6, v7

    or-int v8, v4, v6

    move-object/from16 v4, p3

    move-object/from16 v6, p4

    move-object v7, v0

    move-object/from16 v0, p0

    invoke-static/range {v0 .. v8}, Lp00/h;->c(Lp00/q;Lg2/i;Lb3/x2;Lg2/s;Lc93/a;Landroid/content/Context;Lc93/a;Landroidx/compose/runtime/Composer;I)V

    const v0, 0x530f371d

    invoke-virtual {v7, v0}, Lp1/q;->e0(I)V

    invoke-virtual {v7, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v0

    and-int/lit16 v2, v11, 0x380

    if-ne v2, v13, :cond_12

    const/4 v2, 0x1

    goto :goto_9

    :cond_12
    move v2, v15

    :goto_9
    or-int/2addr v0, v2

    invoke-virtual {v7}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    if-nez v0, :cond_13

    if-ne v2, v12, :cond_14

    :cond_13
    new-instance v2, Li20/b1;

    const/4 v0, 0x4

    invoke-direct {v2, v1, v9, v0}, Li20/b1;-><init>(Lg2/i;Lc93/a;I)V

    invoke-virtual {v7, v2}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_14
    move-object v8, v2

    check-cast v8, Lc93/a;

    invoke-virtual {v7, v15}, Lp1/q;->q(Z)V

    new-instance v0, Lp00/g;

    move-object/from16 v1, p0

    move-object/from16 v4, p1

    move-object/from16 v2, p6

    move-object/from16 v6, p7

    move-object v5, v3

    move-object/from16 v3, p5

    invoke-direct/range {v0 .. v6}, Lp00/g;-><init>(Lp00/q;Lc93/a;Lc93/a;Lg40/o1;Lg2/s;Lc93/a;)V

    const v1, -0x29486681

    invoke-static {v1, v7, v0}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v0

    invoke-static {v10, v8, v0, v7, v14}, Lp00/h;->g(ZLc93/a;Lx1/b;Landroidx/compose/runtime/Composer;I)V

    :goto_a
    invoke-virtual {v7}, Lp1/q;->u()Lp1/v1;

    move-result-object v11

    if-eqz v11, :cond_15

    new-instance v0, Lp00/e;

    const/4 v10, 0x1

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move-object/from16 v4, p3

    move-object/from16 v5, p4

    move-object/from16 v6, p5

    move-object/from16 v7, p6

    move-object/from16 v8, p7

    move-object v3, v9

    move/from16 v9, p9

    invoke-direct/range {v0 .. v10}, Lp00/e;-><init>(Lp00/q;Lg40/o1;Lc93/a;Lc93/a;Lc93/a;Lc93/a;Lc93/a;Lc93/a;II)V

    iput-object v0, v11, Lp1/v1;->d:Lc93/m;

    :cond_15
    return-void
.end method

.method public static final g(ZLc93/a;Lx1/b;Landroidx/compose/runtime/Composer;I)V
    .locals 24

    move/from16 v1, p0

    move-object/from16 v3, p2

    move/from16 v4, p4

    move-object/from16 v12, p3

    check-cast v12, Lp1/q;

    const v0, -0x9617a97

    invoke-virtual {v12, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, v4, 0x6

    if-nez v0, :cond_1

    invoke-virtual {v12, v1}, Lp1/q;->h(Z)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x4

    goto :goto_0

    :cond_0
    const/4 v0, 0x2

    :goto_0
    or-int/2addr v0, v4

    goto :goto_1

    :cond_1
    move v0, v4

    :goto_1
    and-int/lit8 v5, v4, 0x30

    move-object/from16 v15, p1

    if-nez v5, :cond_3

    invoke-virtual {v12, v15}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_2

    const/16 v5, 0x20

    goto :goto_2

    :cond_2
    const/16 v5, 0x10

    :goto_2
    or-int/2addr v0, v5

    :cond_3
    and-int/lit16 v5, v4, 0x180

    if-nez v5, :cond_5

    invoke-virtual {v12, v3}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_4

    const/16 v5, 0x100

    goto :goto_3

    :cond_4
    const/16 v5, 0x80

    :goto_3
    or-int/2addr v0, v5

    :cond_5
    and-int/lit16 v5, v0, 0x93

    const/16 v6, 0x92

    if-ne v5, v6, :cond_7

    invoke-virtual {v12}, Lp1/q;->F()Z

    move-result v5

    if-nez v5, :cond_6

    goto :goto_4

    :cond_6
    invoke-virtual {v12}, Lp1/q;->X()V

    goto/16 :goto_c

    :cond_7
    :goto_4
    const/4 v5, 0x0

    if-eqz v1, :cond_12

    const v6, -0x43449e9

    invoke-virtual {v12, v6}, Lp1/q;->e0(I)V

    sget-object v6, Ll0/m;->c:Ll0/g;

    sget-object v7, Lb2/e;->M:Lb2/k;

    invoke-static {v6, v7, v12, v5}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v7

    iget-wide v8, v12, Lp1/q;->T:J

    invoke-static {v8, v9}, Ljava/lang/Long;->hashCode(J)I

    move-result v8

    invoke-virtual {v12}, Lp1/q;->m()Lp1/p1;

    move-result-object v9

    sget-object v10, Lb2/t;->w:Lb2/t;

    invoke-static {v12, v10}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v11

    sget-object v13, La3/l;->a:La3/k;

    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v13, La3/k;->b:La3/j;

    invoke-virtual {v12}, Lp1/q;->i0()V

    iget-boolean v14, v12, Lp1/q;->S:Z

    if-eqz v14, :cond_8

    invoke-virtual {v12, v13}, Lp1/q;->l(Lc93/a;)V

    goto :goto_5

    :cond_8
    invoke-virtual {v12}, Lp1/q;->s0()V

    :goto_5
    sget-object v14, La3/k;->g:La3/i;

    invoke-static {v12, v14, v7}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v7, La3/k;->f:La3/i;

    invoke-static {v12, v7, v9}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v9, La3/k;->j:La3/i;

    iget-boolean v2, v12, Lp1/q;->S:Z

    if-nez v2, :cond_9

    invoke-virtual {v12}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-static {v2, v5}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_a

    :cond_9
    invoke-static {v8, v12, v8, v9}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_a
    sget-object v2, La3/k;->d:La3/i;

    invoke-static {v12, v2, v11}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const/high16 v5, 0x3f800000    # 1.0f

    invoke-static {v5, v10}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v8

    const/16 v11, 0x18

    int-to-float v11, v11

    invoke-static {v11, v8}, Landroidx/compose/foundation/layout/a;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v8

    sget-object v5, Lb2/e;->K:Lb2/l;

    move/from16 v18, v0

    sget-object v0, Ll0/m;->a:Ll0/e;

    move/from16 v19, v11

    const/16 v11, 0x30

    invoke-static {v0, v5, v12, v11}, Ll0/p1;->a(Ll0/i;Lb2/g;Landroidx/compose/runtime/Composer;I)Ll0/r1;

    move-result-object v0

    iget-wide v4, v12, Lp1/q;->T:J

    invoke-static {v4, v5}, Ljava/lang/Long;->hashCode(J)I

    move-result v4

    invoke-virtual {v12}, Lp1/q;->m()Lp1/p1;

    move-result-object v5

    invoke-static {v12, v8}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v8

    invoke-virtual {v12}, Lp1/q;->i0()V

    iget-boolean v11, v12, Lp1/q;->S:Z

    if-eqz v11, :cond_b

    invoke-virtual {v12, v13}, Lp1/q;->l(Lc93/a;)V

    goto :goto_6

    :cond_b
    invoke-virtual {v12}, Lp1/q;->s0()V

    :goto_6
    invoke-static {v12, v14, v0}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v12, v7, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v0, v12, Lp1/q;->S:Z

    if-nez v0, :cond_c

    invoke-virtual {v12}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v0

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-static {v0, v5}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_d

    :cond_c
    invoke-static {v4, v12, v4, v9}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_d
    invoke-static {v12, v2, v8}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const-string v0, "verification_header_image_tag"

    invoke-static {v10, v0}, Landroidx/compose/ui/platform/a;->a(Landroidx/compose/ui/Modifier;Ljava/lang/String;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    const v4, 0x7f08085e

    const/4 v5, 0x0

    invoke-static {v4, v12, v5}, Lpf/c;->I(ILandroidx/compose/runtime/Composer;I)Ln2/a;

    move-result-object v4

    const v8, 0x7f14102c

    invoke-static {v12, v8}, Lq83/g;->Y(Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v8

    move-object v11, v13

    const/16 v13, 0x180

    move-object/from16 v16, v14

    const/16 v14, 0x78

    move-object/from16 v20, v6

    move-object v6, v8

    const/4 v8, 0x0

    move-object/from16 v21, v9

    const/4 v9, 0x0

    move-object/from16 v22, v10

    const/4 v10, 0x0

    move-object/from16 v23, v11

    const/4 v11, 0x0

    move-object v5, v4

    move-object/from16 v17, v7

    move-object/from16 v1, v16

    move-object/from16 v15, v22

    move-object/from16 v4, v23

    const/high16 v3, 0x3f800000    # 1.0f

    move-object v7, v0

    move-object/from16 v16, v2

    move/from16 v2, v19

    move-object/from16 v0, v20

    invoke-static/range {v5 .. v14}, Lpf/c;->c(Ln2/a;Ljava/lang/String;Landroidx/compose/ui/Modifier;Lb2/h;Ly2/k;FLi2/y;Landroidx/compose/runtime/Composer;II)V

    float-to-double v5, v3

    const-wide/16 v7, 0x0

    cmpl-double v5, v5, v7

    if-lez v5, :cond_e

    goto :goto_7

    :cond_e
    const-string v5, "invalid weight; must be greater than zero"

    invoke-static {v5}, Lm0/a;->a(Ljava/lang/String;)V

    :goto_7
    new-instance v5, Landroidx/compose/foundation/layout/LayoutWeightElement;

    const/4 v13, 0x1

    invoke-direct {v5, v3, v13}, Landroidx/compose/foundation/layout/LayoutWeightElement;-><init>(FZ)V

    invoke-static {v12, v5}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    const v3, 0x7f140fe6

    invoke-static {v12, v3}, Lq83/g;->Y(Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v6

    const-string v3, "verification_header_button_tag"

    invoke-static {v15, v3}, Landroidx/compose/ui/platform/a;->a(Landroidx/compose/ui/Modifier;Ljava/lang/String;)Landroidx/compose/ui/Modifier;

    move-result-object v5

    shl-int/lit8 v3, v18, 0x6

    and-int/lit16 v3, v3, 0x1c00

    or-int/lit16 v9, v3, 0x180

    const/4 v11, 0x0

    const v8, 0x7f08085c

    move-object/from16 v7, p1

    move-object v10, v12

    invoke-static/range {v5 .. v11}, Lse/b;->b(Landroidx/compose/ui/Modifier;Ljava/lang/String;Lc93/a;IILandroidx/compose/runtime/Composer;I)V

    invoke-virtual {v12, v13}, Lp1/q;->q(Z)V

    const/4 v3, 0x2

    int-to-float v3, v3

    invoke-static {v15, v2, v3, v2, v2}, Landroidx/compose/foundation/layout/a;->s(Landroidx/compose/ui/Modifier;FFFF)Landroidx/compose/ui/Modifier;

    move-result-object v2

    sget-object v3, Lb2/e;->N:Lb2/k;

    shl-int/lit8 v5, v18, 0x3

    and-int/lit16 v5, v5, 0x1c00

    or-int/lit16 v5, v5, 0x180

    const/16 v6, 0x30

    invoke-static {v0, v3, v12, v6}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v0

    iget-wide v6, v12, Lp1/q;->T:J

    invoke-static {v6, v7}, Ljava/lang/Long;->hashCode(J)I

    move-result v3

    invoke-virtual {v12}, Lp1/q;->m()Lp1/p1;

    move-result-object v6

    invoke-static {v12, v2}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    invoke-virtual {v12}, Lp1/q;->i0()V

    iget-boolean v7, v12, Lp1/q;->S:Z

    if-eqz v7, :cond_f

    invoke-virtual {v12, v4}, Lp1/q;->l(Lc93/a;)V

    goto :goto_8

    :cond_f
    invoke-virtual {v12}, Lp1/q;->s0()V

    :goto_8
    invoke-static {v12, v1, v0}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    move-object/from16 v0, v17

    invoke-static {v12, v0, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v0, v12, Lp1/q;->S:Z

    if-nez v0, :cond_10

    invoke-virtual {v12}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v0

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_11

    :cond_10
    move-object/from16 v0, v21

    goto :goto_a

    :cond_11
    :goto_9
    move-object/from16 v0, v16

    goto :goto_b

    :goto_a
    invoke-static {v3, v12, v3, v0}, Ld;->y(ILp1/q;ILa3/i;)V

    goto :goto_9

    :goto_b
    invoke-static {v12, v0, v2}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    shr-int/lit8 v0, v5, 0x6

    and-int/lit8 v0, v0, 0x70

    or-int/lit8 v0, v0, 0x6

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    sget-object v1, Ll0/z;->a:Ll0/z;

    move-object/from16 v3, p2

    invoke-virtual {v3, v1, v12, v0}, Lx1/b;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v12, v13}, Lp1/q;->q(Z)V

    invoke-virtual {v12, v13}, Lp1/q;->q(Z)V

    const/4 v5, 0x0

    invoke-virtual {v12, v5}, Lp1/q;->q(Z)V

    goto :goto_c

    :cond_12
    move/from16 v18, v0

    const v0, -0x420eaa3

    invoke-virtual {v12, v0}, Lp1/q;->e0(I)V

    shr-int/lit8 v0, v18, 0x3

    and-int/lit8 v0, v0, 0x70

    const/4 v1, 0x0

    invoke-static {v1, v3, v12, v0}, Lvd/f;->c(Landroidx/compose/ui/Modifier;Lx1/b;Landroidx/compose/runtime/Composer;I)V

    invoke-virtual {v12, v5}, Lp1/q;->q(Z)V

    :goto_c
    invoke-virtual {v12}, Lp1/q;->u()Lp1/v1;

    move-result-object v6

    if-eqz v6, :cond_13

    new-instance v0, Lar2/f;

    const/16 v5, 0x1a

    move/from16 v1, p0

    move-object/from16 v2, p1

    move/from16 v4, p4

    invoke-direct/range {v0 .. v5}, Lar2/f;-><init>(ZLjava/lang/Object;Ljava/lang/Object;II)V

    iput-object v0, v6, Lp1/v1;->d:Lc93/m;

    :cond_13
    return-void
.end method
