.class public abstract Le21/c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u001a!\u0010\u0005\u001a\u00020\u00042\u0008\u0008\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0001\u00a2\u0006\u0004\u0008\u0005\u0010\u0006\u00a8\u0006\u0007"
    }
    d2 = {
        "Landroidx/compose/ui/Modifier;",
        "modifier",
        "Le21/b;",
        "state",
        "Ll83/a0;",
        "c",
        "(Landroidx/compose/ui/Modifier;Le21/b;Landroidx/compose/runtime/Composer;II)V",
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
.method public static synthetic a(Le21/b;FLl3/t0;Lb91/a;Ll0/v;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p6}, Le21/c;->d(Le21/b;FLl3/t0;Lb91/a;Ll0/v;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Landroidx/compose/ui/Modifier;Le21/b;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p5}, Le21/c;->e(Landroidx/compose/ui/Modifier;Le21/b;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final c(Landroidx/compose/ui/Modifier;Le21/b;Landroidx/compose/runtime/Composer;II)V
    .locals 37

    move-object/from16 v3, p1

    const-string v0, "state"

    invoke-static {v3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v8, p2

    check-cast v8, Lp1/q;

    const v0, -0x5eba8017

    invoke-virtual {v8, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, p4, 0x1

    if-eqz v0, :cond_0

    or-int/lit8 v4, p3, 0x6

    move v5, v4

    move-object/from16 v4, p0

    goto :goto_1

    :cond_0
    and-int/lit8 v4, p3, 0x6

    if-nez v4, :cond_2

    move-object/from16 v4, p0

    invoke-virtual {v8, v4}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_1

    const/4 v5, 0x4

    goto :goto_0

    :cond_1
    const/4 v5, 0x2

    :goto_0
    or-int v5, p3, v5

    goto :goto_1

    :cond_2
    move-object/from16 v4, p0

    move/from16 v5, p3

    :goto_1
    and-int/lit8 v6, p3, 0x30

    if-nez v6, :cond_4

    invoke-virtual {v8, v3}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_3

    const/16 v6, 0x20

    goto :goto_2

    :cond_3
    const/16 v6, 0x10

    :goto_2
    or-int/2addr v5, v6

    :cond_4
    and-int/lit8 v6, v5, 0x13

    const/16 v7, 0x12

    const/4 v12, 0x0

    const/4 v13, 0x1

    if-eq v6, v7, :cond_5

    move v6, v13

    goto :goto_3

    :cond_5
    move v6, v12

    :goto_3
    and-int/2addr v5, v13

    invoke-virtual {v8, v5, v6}, Lp1/q;->U(IZ)Z

    move-result v5

    if-eqz v5, :cond_1c

    sget-object v14, Lb2/t;->w:Lb2/t;

    if-eqz v0, :cond_6

    move-object v0, v14

    goto :goto_4

    :cond_6
    move-object v0, v4

    :goto_4
    int-to-float v4, v13

    const/16 v5, 0x8

    int-to-float v15, v5

    mul-float/2addr v4, v15

    invoke-static {v4}, Ll0/m;->i(F)Ll0/k;

    move-result-object v5

    sget-object v6, Lb2/e;->M:Lb2/k;

    const/4 v7, 0x6

    invoke-static {v5, v6, v8, v7}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v5

    iget-wide v9, v8, Lp1/q;->T:J

    invoke-static {v9, v10}, Ljava/lang/Long;->hashCode(J)I

    move-result v6

    invoke-virtual {v8}, Lp1/q;->m()Lp1/p1;

    move-result-object v9

    invoke-static {v8, v0}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v10

    sget-object v11, La3/l;->a:La3/k;

    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v11, La3/k;->b:La3/j;

    invoke-virtual {v8}, Lp1/q;->i0()V

    iget-boolean v13, v8, Lp1/q;->S:Z

    if-eqz v13, :cond_7

    invoke-virtual {v8, v11}, Lp1/q;->l(Lc93/a;)V

    goto :goto_5

    :cond_7
    invoke-virtual {v8}, Lp1/q;->s0()V

    :goto_5
    sget-object v13, La3/k;->g:La3/i;

    invoke-static {v8, v13, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v5, La3/k;->f:La3/i;

    invoke-static {v8, v5, v9}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v9, La3/k;->j:La3/i;

    iget-boolean v2, v8, Lp1/q;->S:Z

    if-nez v2, :cond_8

    invoke-virtual {v8}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-static {v2, v7}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_9

    :cond_8
    invoke-static {v6, v8, v6, v9}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_9
    sget-object v2, La3/k;->d:La3/i;

    invoke-static {v8, v2, v10}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual {v3}, Le21/b;->a()Lgz0/m0;

    move-result-object v6

    if-nez v6, :cond_b

    invoke-virtual {v3}, Le21/b;->b()Ljava/lang/String;

    move-result-object v6

    if-eqz v6, :cond_a

    goto :goto_6

    :cond_a
    const v4, -0x71e6217d

    invoke-virtual {v8, v4}, Lp1/q;->e0(I)V

    invoke-virtual {v8, v12}, Lp1/q;->q(Z)V

    move-object/from16 v36, v0

    move-object/from16 p0, v2

    move-object/from16 v30, v5

    move-object/from16 v31, v9

    move-object v1, v11

    move v0, v12

    move-object/from16 v32, v13

    move-object v2, v14

    move/from16 v33, v15

    const/4 v3, 0x1

    goto/16 :goto_a

    :cond_b
    :goto_6
    const v6, -0x71f27f3e

    invoke-virtual {v8, v6}, Lp1/q;->e0(I)V

    sget-object v6, Lb2/e;->K:Lb2/l;

    invoke-static {v4}, Ll0/m;->i(F)Ll0/k;

    move-result-object v4

    const/16 v7, 0x36

    invoke-static {v4, v6, v8, v7}, Ll0/p1;->a(Ll0/i;Lb2/g;Landroidx/compose/runtime/Composer;I)Ll0/r1;

    move-result-object v4

    iget-wide v6, v8, Lp1/q;->T:J

    invoke-static {v6, v7}, Ljava/lang/Long;->hashCode(J)I

    move-result v6

    invoke-virtual {v8}, Lp1/q;->m()Lp1/p1;

    move-result-object v7

    invoke-static {v8, v14}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v10

    invoke-virtual {v8}, Lp1/q;->i0()V

    iget-boolean v1, v8, Lp1/q;->S:Z

    if-eqz v1, :cond_c

    invoke-virtual {v8, v11}, Lp1/q;->l(Lc93/a;)V

    goto :goto_7

    :cond_c
    invoke-virtual {v8}, Lp1/q;->s0()V

    :goto_7
    invoke-static {v8, v13, v4}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v8, v5, v7}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v1, v8, Lp1/q;->S:Z

    if-nez v1, :cond_d

    invoke-virtual {v8}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-static {v1, v4}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_e

    :cond_d
    invoke-static {v6, v8, v6, v9}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_e
    invoke-static {v8, v2, v10}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual {v3}, Le21/b;->a()Lgz0/m0;

    move-result-object v1

    if-nez v1, :cond_f

    const v1, -0x1c5db445

    invoke-virtual {v8, v1}, Lp1/q;->e0(I)V

    invoke-virtual {v8, v12}, Lp1/q;->q(Z)V

    move-object/from16 v30, v5

    move-object/from16 v31, v9

    move-object v1, v11

    move-object/from16 p0, v13

    const/4 v13, 0x6

    goto :goto_8

    :cond_f
    const v4, -0x1c5db444

    invoke-virtual {v8, v4}, Lp1/q;->e0(I)V

    invoke-virtual {v1}, Lgz0/m0;->toWhoopIcon()I

    move-result v1

    invoke-static {v1, v8, v12}, Lpf/c;->I(ILandroidx/compose/runtime/Composer;I)Ln2/a;

    move-result-object v4

    sget v1, Lgy0/f;->o:I

    invoke-static {v8, v1}, Lq83/g;->Y(Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v1

    const/4 v6, 0x5

    int-to-float v6, v6

    const/4 v7, 0x4

    int-to-float v10, v7

    mul-float/2addr v6, v10

    invoke-static {v6, v14}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v6

    sget-object v7, Lx81/d;->a:Lx81/d;

    const/4 v10, 0x6

    invoke-virtual {v7, v8, v10}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v7

    invoke-virtual {v7}, Ly81/i;->b1()J

    move-result-wide v16

    move v7, v10

    const/16 v10, 0x180

    move-object/from16 v18, v11

    const/4 v11, 0x0

    move-object/from16 v30, v5

    move-object/from16 v31, v9

    move-object/from16 p0, v13

    move-object v5, v1

    move v13, v7

    move-object v9, v8

    move-wide/from16 v7, v16

    move-object/from16 v1, v18

    invoke-static/range {v4 .. v11}, Lg1/f3;->a(Ln2/a;Ljava/lang/String;Landroidx/compose/ui/Modifier;JLandroidx/compose/runtime/Composer;II)V

    move-object v8, v9

    invoke-virtual {v8, v12}, Lp1/q;->q(Z)V

    :goto_8
    invoke-virtual {v3}, Le21/b;->b()Ljava/lang/String;

    move-result-object v4

    if-nez v4, :cond_10

    const v4, -0x1c57db4f

    invoke-virtual {v8, v4}, Lp1/q;->e0(I)V

    invoke-virtual {v8, v12}, Lp1/q;->q(Z)V

    move-object/from16 v32, p0

    move-object/from16 v36, v0

    move-object/from16 p0, v2

    move v0, v12

    move-object v2, v14

    move/from16 v33, v15

    const/4 v3, 0x1

    goto/16 :goto_9

    :cond_10
    const v5, -0x1c57db4e

    invoke-virtual {v8, v5}, Lp1/q;->e0(I)V

    sget-object v5, Lx81/d;->a:Lx81/d;

    invoke-virtual {v5, v8, v13}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v6

    invoke-virtual {v6}, Lb91/d;->a()Lb91/a;

    move-result-object v24

    invoke-virtual {v5, v8, v13}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v5

    invoke-virtual {v5}, Ly81/i;->y()J

    move-result-wide v6

    const/16 v28, 0x0

    const v29, 0x2fffa

    const/4 v5, 0x0

    move-object/from16 v26, v8

    const-wide/16 v8, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    move/from16 v16, v12

    const/4 v12, 0x0

    move/from16 v18, v13

    move-object/from16 v17, v14

    const-wide/16 v13, 0x0

    move/from16 v19, v15

    const/4 v15, 0x0

    move/from16 v20, v16

    const/16 v16, 0x0

    move-object/from16 v21, v17

    move/from16 v22, v18

    const-wide/16 v17, 0x0

    move/from16 v23, v19

    const/16 v19, 0x0

    move/from16 v25, v20

    const/16 v20, 0x0

    move-object/from16 v27, v21

    const/16 v21, 0x0

    move/from16 v32, v22

    const/16 v22, 0x0

    move/from16 v33, v23

    const/16 v23, 0x0

    move/from16 v34, v25

    const/16 v25, 0x0

    move-object/from16 v35, v27

    const/16 v27, 0x0

    move-object/from16 v32, p0

    move-object/from16 v36, v0

    move-object/from16 p0, v2

    move/from16 v0, v34

    move-object/from16 v2, v35

    const/4 v3, 0x1

    invoke-static/range {v4 .. v29}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v8, v26

    invoke-virtual {v8, v0}, Lp1/q;->q(Z)V

    :goto_9
    invoke-virtual {v8, v3}, Lp1/q;->q(Z)V

    invoke-virtual {v8, v0}, Lp1/q;->q(Z)V

    :goto_a
    const/high16 v4, 0x3f800000    # 1.0f

    invoke-static {v4, v2}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v5

    const-wide/high16 v6, 0x3fd0000000000000L    # 0.25

    double-to-float v6, v6

    mul-float v6, v6, v33

    invoke-static {v6}, Ll0/m;->i(F)Ll0/k;

    move-result-object v6

    sget-object v7, Lb2/e;->J:Lb2/l;

    const/4 v13, 0x6

    invoke-static {v6, v7, v8, v13}, Ll0/p1;->a(Ll0/i;Lb2/g;Landroidx/compose/runtime/Composer;I)Ll0/r1;

    move-result-object v6

    iget-wide v9, v8, Lp1/q;->T:J

    invoke-static {v9, v10}, Ljava/lang/Long;->hashCode(J)I

    move-result v7

    invoke-virtual {v8}, Lp1/q;->m()Lp1/p1;

    move-result-object v9

    invoke-static {v8, v5}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v5

    invoke-virtual {v8}, Lp1/q;->i0()V

    iget-boolean v10, v8, Lp1/q;->S:Z

    if-eqz v10, :cond_11

    invoke-virtual {v8, v1}, Lp1/q;->l(Lc93/a;)V

    :goto_b
    move-object/from16 v1, v32

    goto :goto_c

    :cond_11
    invoke-virtual {v8}, Lp1/q;->s0()V

    goto :goto_b

    :goto_c
    invoke-static {v8, v1, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    move-object/from16 v1, v30

    invoke-static {v8, v1, v9}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v1, v8, Lp1/q;->S:Z

    if-nez v1, :cond_12

    invoke-virtual {v8}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-static {v1, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_13

    :cond_12
    move-object/from16 v1, v31

    goto :goto_e

    :cond_13
    :goto_d
    move-object/from16 v1, p0

    goto :goto_f

    :goto_e
    invoke-static {v7, v8, v7, v1}, Ld;->y(ILp1/q;ILa3/i;)V

    goto :goto_d

    :goto_f
    invoke-static {v8, v1, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const v1, -0x17ffd07b

    invoke-virtual {v8, v1}, Lp1/q;->e0(I)V

    invoke-virtual/range {p1 .. p1}, Le21/b;->c()Ljava/util/List;

    move-result-object v1

    check-cast v1, Ljava/lang/Iterable;

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    move v12, v0

    :goto_10
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    const-wide/16 v6, 0x0

    if-eqz v5, :cond_1a

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    add-int/lit8 v9, v12, 0x1

    if-ltz v12, :cond_19

    check-cast v5, Le21/b$a;

    invoke-virtual/range {p1 .. p1}, Le21/b;->c()Ljava/util/List;

    move-result-object v10

    invoke-interface {v10}, Ljava/util/List;->size()I

    move-result v10

    sget-object v11, Li2/w0;->a:Li2/v0;

    if-ne v10, v3, :cond_14

    const/16 v10, 0x32

    invoke-static {v10}, Lt0/j;->b(I)Lt0/i;

    move-result-object v10

    goto :goto_11

    :cond_14
    if-nez v12, :cond_15

    const/16 v34, 0x6

    invoke-static/range {v34 .. v34}, Lt0/j;->d(I)Lt0/i;

    move-result-object v10

    goto :goto_11

    :cond_15
    invoke-virtual/range {p1 .. p1}, Le21/b;->c()Ljava/util/List;

    move-result-object v10

    invoke-static {v10}, Lwb3/f;->C(Ljava/util/List;)I

    move-result v10

    if-ne v12, v10, :cond_16

    const/16 v10, 0x9

    invoke-static {v10}, Lt0/j;->d(I)Lt0/i;

    move-result-object v10

    goto :goto_11

    :cond_16
    move-object v10, v11

    :goto_11
    invoke-virtual {v5}, Le21/b$a;->d()F

    move-result v12

    float-to-double v13, v12

    cmpl-double v6, v13, v6

    if-lez v6, :cond_17

    goto :goto_12

    :cond_17
    const-string v6, "invalid weight; must be greater than zero"

    invoke-static {v6}, Lm0/a;->a(Ljava/lang/String;)V

    :goto_12
    new-instance v6, Landroidx/compose/foundation/layout/LayoutWeightElement;

    const v7, 0x7f7fffff    # Float.MAX_VALUE

    cmpl-float v13, v12, v7

    if-lez v13, :cond_18

    move v12, v7

    :cond_18
    invoke-direct {v6, v12, v3}, Landroidx/compose/foundation/layout/LayoutWeightElement;-><init>(FZ)V

    const/4 v7, 0x2

    int-to-float v12, v7

    const/4 v13, 0x4

    int-to-float v14, v13

    mul-float/2addr v12, v14

    invoke-static {v12, v6}, Landroidx/compose/foundation/layout/d;->h(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v6

    invoke-static {v6, v10}, Lwb3/f;->r(Landroidx/compose/ui/Modifier;Li2/a1;)Landroidx/compose/ui/Modifier;

    move-result-object v6

    invoke-virtual {v5}, Le21/b$a;->a()Ly81/f;

    move-result-object v5

    invoke-virtual {v5, v8, v0}, Ly81/f;->toComposableColor-WaAFU9c(Landroidx/compose/runtime/Composer;I)J

    move-result-wide v14

    invoke-static {v6, v14, v15, v11}, Landroidx/compose/foundation/a;->c(Landroidx/compose/ui/Modifier;JLi2/a1;)Landroidx/compose/ui/Modifier;

    move-result-object v5

    invoke-static {v5, v8, v0}, Ll0/q;->a(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V

    move v12, v9

    goto :goto_10

    :cond_19
    invoke-static {}, Lwb3/f;->d0()V

    const/4 v0, 0x0

    throw v0

    :cond_1a
    invoke-virtual {v8, v0}, Lp1/q;->q(Z)V

    invoke-virtual {v8, v3}, Lp1/q;->q(Z)V

    invoke-static {v8}, Ll3/s;->g(Landroidx/compose/runtime/Composer;)Ll3/t0;

    move-result-object v0

    sget-object v1, Lx81/d;->a:Lx81/d;

    const/4 v13, 0x6

    invoke-virtual {v1, v8, v13}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v1

    invoke-virtual {v1}, Lb91/d;->c()Lb91/a;

    move-result-object v1

    invoke-virtual/range {p1 .. p1}, Le21/b;->c()Ljava/util/List;

    move-result-object v5

    check-cast v5, Ljava/lang/Iterable;

    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_13
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v9

    if-eqz v9, :cond_1b

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Le21/b$a;

    invoke-virtual {v9}, Le21/b$a;->d()F

    move-result v9

    float-to-double v9, v9

    add-double/2addr v6, v9

    goto :goto_13

    :cond_1b
    double-to-float v5, v6

    invoke-static {v4, v2}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    new-instance v2, Lbu2/e;

    move-object/from16 v11, p1

    invoke-direct {v2, v11, v5, v0, v1}, Lbu2/e;-><init>(Le21/b;FLl3/t0;Lb91/a;)V

    const v0, 0x38914cb5

    invoke-static {v0, v8, v2}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v7

    const/16 v9, 0xc06

    const/4 v10, 0x6

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-static/range {v4 .. v10}, Ll0/f;->a(Landroidx/compose/ui/Modifier;Lb2/h;ZLkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V

    invoke-virtual {v8, v3}, Lp1/q;->q(Z)V

    move-object/from16 v1, v36

    goto :goto_14

    :cond_1c
    move-object v11, v3

    invoke-virtual {v8}, Lp1/q;->X()V

    move-object v1, v4

    :goto_14
    invoke-virtual {v8}, Lp1/q;->u()Lp1/v1;

    move-result-object v6

    if-eqz v6, :cond_1d

    new-instance v0, Ld62/b;

    const/16 v5, 0x9

    move/from16 v2, p3

    move/from16 v4, p4

    move-object v3, v11

    invoke-direct/range {v0 .. v5}, Ld62/b;-><init>(Ljava/lang/Object;ILjava/lang/Object;II)V

    iput-object v0, v6, Lp1/v1;->d:Lc93/m;

    :cond_1d
    return-void
.end method

.method private static final d(Le21/b;FLl3/t0;Lb91/a;Ll0/v;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 33

    move-object/from16 v0, p2

    move-object/from16 v1, p4

    const-string v2, "$this$BoxWithConstraints"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    and-int/lit8 v2, p6, 0x6

    if-nez v2, :cond_1

    move-object/from16 v2, p5

    check-cast v2, Lp1/q;

    invoke-virtual {v2, v1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    const/4 v2, 0x4

    goto :goto_0

    :cond_0
    const/4 v2, 0x2

    :goto_0
    or-int v2, p6, v2

    goto :goto_1

    :cond_1
    move/from16 v2, p6

    :goto_1
    and-int/lit8 v3, v2, 0x13

    const/16 v4, 0x12

    const/4 v5, 0x0

    const/4 v6, 0x1

    if-eq v3, v4, :cond_2

    move v3, v6

    goto :goto_2

    :cond_2
    move v3, v5

    :goto_2
    and-int/2addr v2, v6

    move-object/from16 v4, p5

    check-cast v4, Lp1/q;

    invoke-virtual {v4, v2, v3}, Lp1/q;->U(IZ)Z

    move-result v2

    if-eqz v2, :cond_10

    sget-object v2, Lb3/v1;->h:Lp1/u2;

    invoke-virtual {v4, v2}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ly3/c;

    const-wide/high16 v7, 0x3fd0000000000000L    # 0.25

    double-to-float v3, v7

    const/16 v7, 0x8

    int-to-float v7, v7

    mul-float/2addr v3, v7

    invoke-interface {v2, v3}, Ly3/c;->q0(F)F

    move-result v2

    check-cast v1, Landroidx/compose/foundation/layout/c;

    iget-wide v7, v1, Landroidx/compose/foundation/layout/c;->b:J

    invoke-static {v7, v8}, Ly3/a;->i(J)I

    move-result v1

    int-to-float v1, v1

    invoke-virtual/range {p0 .. p0}, Le21/b;->c()Ljava/util/List;

    move-result-object v7

    invoke-interface {v7}, Ljava/util/List;->size()I

    move-result v7

    sub-int/2addr v7, v6

    if-gez v7, :cond_3

    move v7, v5

    :cond_3
    int-to-float v7, v7

    mul-float/2addr v2, v7

    sub-float/2addr v1, v2

    sget-object v2, Lb2/t;->w:Lb2/t;

    const/high16 v7, 0x3f800000    # 1.0f

    invoke-static {v7, v2}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    invoke-static {v3}, Ll0/m;->i(F)Ll0/k;

    move-result-object v3

    sget-object v7, Lb2/e;->J:Lb2/l;

    const/4 v8, 0x6

    invoke-static {v3, v7, v4, v8}, Ll0/p1;->a(Ll0/i;Lb2/g;Landroidx/compose/runtime/Composer;I)Ll0/r1;

    move-result-object v3

    iget-wide v9, v4, Lp1/q;->T:J

    invoke-static {v9, v10}, Ljava/lang/Long;->hashCode(J)I

    move-result v7

    invoke-virtual {v4}, Lp1/q;->m()Lp1/p1;

    move-result-object v9

    invoke-static {v4, v2}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    sget-object v10, La3/l;->a:La3/k;

    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v10, La3/k;->b:La3/j;

    invoke-virtual {v4}, Lp1/q;->i0()V

    iget-boolean v11, v4, Lp1/q;->S:Z

    if-eqz v11, :cond_4

    invoke-virtual {v4, v10}, Lp1/q;->l(Lc93/a;)V

    goto :goto_3

    :cond_4
    invoke-virtual {v4}, Lp1/q;->s0()V

    :goto_3
    sget-object v10, La3/k;->g:La3/i;

    invoke-static {v4, v10, v3}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v3, La3/k;->f:La3/i;

    invoke-static {v4, v3, v9}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v3, La3/k;->j:La3/i;

    iget-boolean v9, v4, Lp1/q;->S:Z

    if-nez v9, :cond_5

    invoke-virtual {v4}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v9

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    invoke-static {v9, v10}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v9

    if-nez v9, :cond_6

    :cond_5
    invoke-static {v7, v4, v7, v3}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_6
    sget-object v3, La3/k;->d:La3/i;

    invoke-static {v4, v3, v2}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const v2, 0x5e06342d

    invoke-virtual {v4, v2}, Lp1/q;->e0(I)V

    invoke-virtual/range {p0 .. p0}, Le21/b;->c()Ljava/util/List;

    move-result-object v2

    check-cast v2, Ljava/lang/Iterable;

    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_4
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_f

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Le21/b$a;

    const/4 v7, 0x0

    cmpl-float v9, p1, v7

    if-lez v9, :cond_7

    invoke-virtual {v3}, Le21/b$a;->d()F

    move-result v7

    div-float v7, v7, p1

    mul-float/2addr v7, v1

    :cond_7
    invoke-virtual {v3}, Le21/b$a;->b()Ljava/lang/String;

    move-result-object v9

    invoke-virtual/range {p3 .. p3}, Lb91/a;->d()Ll3/v0;

    move-result-object v10

    const/16 v11, 0x3fc

    invoke-static {v0, v9, v10, v11}, Ll3/t0;->a(Ll3/t0;Ljava/lang/String;Ll3/v0;I)Ll3/r0;

    move-result-object v9

    iget-wide v9, v9, Ll3/r0;->c:J

    const/16 v12, 0x20

    shr-long/2addr v9, v12

    long-to-int v9, v9

    invoke-virtual {v3}, Le21/b$a;->c()Ljava/lang/String;

    move-result-object v10

    invoke-virtual/range {p3 .. p3}, Lb91/a;->d()Ll3/v0;

    move-result-object v13

    invoke-static {v0, v10, v13, v11}, Ll3/t0;->a(Ll3/t0;Ljava/lang/String;Ll3/v0;I)Ll3/r0;

    move-result-object v10

    iget-wide v10, v10, Ll3/r0;->c:J

    shr-long/2addr v10, v12

    long-to-int v10, v10

    invoke-static {v9, v10}, Ljava/lang/Math;->max(II)I

    move-result v9

    int-to-float v9, v9

    cmpg-float v7, v9, v7

    if-gtz v7, :cond_8

    move v7, v6

    goto :goto_5

    :cond_8
    move v7, v5

    :goto_5
    invoke-virtual {v3}, Le21/b$a;->d()F

    move-result v9

    float-to-double v10, v9

    const-wide/16 v12, 0x0

    cmpl-double v10, v10, v12

    if-lez v10, :cond_9

    goto :goto_6

    :cond_9
    const-string v10, "invalid weight; must be greater than zero"

    invoke-static {v10}, Lm0/a;->a(Ljava/lang/String;)V

    :goto_6
    new-instance v10, Landroidx/compose/foundation/layout/LayoutWeightElement;

    const v11, 0x7f7fffff    # Float.MAX_VALUE

    cmpl-float v12, v9, v11

    if-lez v12, :cond_a

    move v9, v11

    :cond_a
    invoke-direct {v10, v9, v6}, Landroidx/compose/foundation/layout/LayoutWeightElement;-><init>(FZ)V

    sget-object v9, Lb2/e;->N:Lb2/k;

    sget-object v11, Ll0/m;->c:Ll0/g;

    const/16 v12, 0x30

    invoke-static {v11, v9, v4, v12}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v9

    iget-wide v11, v4, Lp1/q;->T:J

    invoke-static {v11, v12}, Ljava/lang/Long;->hashCode(J)I

    move-result v11

    invoke-virtual {v4}, Lp1/q;->m()Lp1/p1;

    move-result-object v12

    invoke-static {v4, v10}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v10

    sget-object v13, La3/l;->a:La3/k;

    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v13, La3/k;->b:La3/j;

    invoke-virtual {v4}, Lp1/q;->i0()V

    iget-boolean v14, v4, Lp1/q;->S:Z

    if-eqz v14, :cond_b

    invoke-virtual {v4, v13}, Lp1/q;->l(Lc93/a;)V

    goto :goto_7

    :cond_b
    invoke-virtual {v4}, Lp1/q;->s0()V

    :goto_7
    sget-object v13, La3/k;->g:La3/i;

    invoke-static {v4, v13, v9}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v9, La3/k;->f:La3/i;

    invoke-static {v4, v9, v12}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v9, La3/k;->j:La3/i;

    iget-boolean v12, v4, Lp1/q;->S:Z

    if-nez v12, :cond_c

    invoke-virtual {v4}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v12

    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v13

    invoke-static {v12, v13}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v12

    if-nez v12, :cond_d

    :cond_c
    invoke-static {v11, v4, v11, v9}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_d
    sget-object v9, La3/k;->d:La3/i;

    invoke-static {v4, v9, v10}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    if-eqz v7, :cond_e

    const v7, 0x9fe5566

    invoke-virtual {v4, v7}, Lp1/q;->e0(I)V

    invoke-virtual {v3}, Le21/b$a;->b()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v3}, Le21/b$a;->a()Ly81/f;

    move-result-object v9

    invoke-virtual {v9, v4, v5}, Ly81/f;->toComposableColor-WaAFU9c(Landroidx/compose/runtime/Composer;I)J

    move-result-wide v9

    const/16 v31, 0x0

    const v32, 0x2fffa

    move v11, v8

    const/4 v8, 0x0

    move v13, v11

    const-wide/16 v11, 0x0

    move v14, v13

    const/4 v13, 0x0

    move v15, v14

    const/4 v14, 0x0

    move/from16 v16, v15

    const/4 v15, 0x0

    move/from16 v18, v16

    const-wide/16 v16, 0x0

    move/from16 v19, v18

    const/16 v18, 0x0

    move/from16 v20, v19

    const/16 v19, 0x0

    move/from16 v22, v20

    const-wide/16 v20, 0x0

    move/from16 v23, v22

    const/16 v22, 0x0

    move/from16 v24, v23

    const/16 v23, 0x0

    move/from16 v25, v24

    const/16 v24, 0x0

    move/from16 v26, v25

    const/16 v25, 0x0

    move/from16 v27, v26

    const/16 v26, 0x0

    const/16 v28, 0x0

    const/16 v30, 0x0

    move-object/from16 v29, v4

    move/from16 v4, v27

    move-object/from16 v27, p3

    invoke-static/range {v7 .. v32}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v7, v29

    invoke-virtual {v3}, Le21/b$a;->c()Ljava/lang/String;

    move-result-object v3

    sget-object v8, Lx81/d;->a:Lx81/d;

    invoke-virtual {v8, v7, v4}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v8

    invoke-virtual {v8}, Ly81/i;->y()J

    move-result-wide v9

    const/4 v8, 0x0

    move-object v7, v3

    invoke-static/range {v7 .. v32}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v7, v29

    invoke-virtual {v7, v5}, Lp1/q;->q(Z)V

    goto :goto_8

    :cond_e
    move-object v7, v4

    move v4, v8

    const v3, 0xa05d3a5

    invoke-virtual {v7, v3}, Lp1/q;->e0(I)V

    invoke-virtual {v7, v5}, Lp1/q;->q(Z)V

    :goto_8
    invoke-virtual {v7, v6}, Lp1/q;->q(Z)V

    move v8, v4

    move-object v4, v7

    goto/16 :goto_4

    :cond_f
    move-object v7, v4

    invoke-virtual {v7, v5}, Lp1/q;->q(Z)V

    invoke-virtual {v7, v6}, Lp1/q;->q(Z)V

    goto :goto_9

    :cond_10
    move-object v7, v4

    invoke-virtual {v7}, Lp1/q;->X()V

    :goto_9
    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method

.method private static final e(Landroidx/compose/ui/Modifier;Le21/b;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, Lp1/x;->L(I)I

    move-result p2

    invoke-static {p0, p1, p4, p2, p3}, Le21/c;->c(Landroidx/compose/ui/Modifier;Le21/b;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method
