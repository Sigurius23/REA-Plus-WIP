.class public abstract Ln11/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u001a!\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u0002H\u0007\u00a2\u0006\u0004\u0008\u0005\u0010\u0006\u00a8\u0006\u0007"
    }
    d2 = {
        "Ln11/b;",
        "state",
        "Landroidx/compose/ui/Modifier;",
        "modifier",
        "Ll83/a0;",
        "b",
        "(Ln11/b;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V",
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
.method public static synthetic a(Ln11/b;Landroidx/compose/ui/Modifier;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p5}, Ln11/a;->c(Ln11/b;Landroidx/compose/ui/Modifier;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final b(Ln11/b;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V
    .locals 56

    move-object/from16 v1, p0

    const-string v0, "state"

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v7, p2

    check-cast v7, Lp1/q;

    const v0, -0x4994c2af

    invoke-virtual {v7, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, p3, 0x6

    const/4 v3, 0x2

    if-nez v0, :cond_1

    invoke-virtual {v7, v1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x4

    goto :goto_0

    :cond_0
    move v0, v3

    :goto_0
    or-int v0, p3, v0

    goto :goto_1

    :cond_1
    move/from16 v0, p3

    :goto_1
    and-int/lit8 v4, p4, 0x2

    if-eqz v4, :cond_3

    or-int/lit8 v0, v0, 0x30

    :cond_2
    move-object/from16 v5, p1

    goto :goto_3

    :cond_3
    and-int/lit8 v5, p3, 0x30

    if-nez v5, :cond_2

    move-object/from16 v5, p1

    invoke-virtual {v7, v5}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_4

    const/16 v6, 0x20

    goto :goto_2

    :cond_4
    const/16 v6, 0x10

    :goto_2
    or-int/2addr v0, v6

    :goto_3
    and-int/lit8 v6, v0, 0x13

    const/16 v8, 0x12

    const/4 v10, 0x1

    if-eq v6, v8, :cond_5

    move v6, v10

    goto :goto_4

    :cond_5
    const/4 v6, 0x0

    :goto_4
    and-int/2addr v0, v10

    invoke-virtual {v7, v0, v6}, Lp1/q;->U(IZ)Z

    move-result v0

    if-eqz v0, :cond_16

    sget-object v0, Lb2/t;->w:Lb2/t;

    if-eqz v4, :cond_6

    move-object v4, v0

    goto :goto_5

    :cond_6
    move-object v4, v5

    :goto_5
    const/high16 v5, 0x3f800000    # 1.0f

    invoke-static {v5, v4}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v6

    int-to-float v8, v10

    const/16 v11, 0x8

    int-to-float v11, v11

    mul-float/2addr v8, v11

    const/4 v12, 0x0

    invoke-static {v6, v8, v12, v3}, Landroidx/compose/foundation/layout/a;->r(Landroidx/compose/ui/Modifier;FFI)Landroidx/compose/ui/Modifier;

    move-result-object v3

    sget-object v6, Lb2/e;->K:Lb2/l;

    sget-object v8, Ll0/m;->g:Ll0/h;

    const/16 v13, 0x36

    invoke-static {v8, v6, v7, v13}, Ll0/p1;->a(Ll0/i;Lb2/g;Landroidx/compose/runtime/Composer;I)Ll0/r1;

    move-result-object v8

    iget-wide v14, v7, Lp1/q;->T:J

    invoke-static {v14, v15}, Ljava/lang/Long;->hashCode(J)I

    move-result v14

    invoke-virtual {v7}, Lp1/q;->m()Lp1/p1;

    move-result-object v15

    invoke-static {v7, v3}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    sget-object v16, La3/l;->a:La3/k;

    invoke-virtual/range {v16 .. v16}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v9, La3/k;->b:La3/j;

    invoke-virtual {v7}, Lp1/q;->i0()V

    iget-boolean v2, v7, Lp1/q;->S:Z

    if-eqz v2, :cond_7

    invoke-virtual {v7, v9}, Lp1/q;->l(Lc93/a;)V

    goto :goto_6

    :cond_7
    invoke-virtual {v7}, Lp1/q;->s0()V

    :goto_6
    sget-object v2, La3/k;->g:La3/i;

    invoke-static {v7, v2, v8}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v8, La3/k;->f:La3/i;

    invoke-static {v7, v8, v15}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v15, La3/k;->j:La3/i;

    iget-boolean v12, v7, Lp1/q;->S:Z

    if-nez v12, :cond_8

    invoke-virtual {v7}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v12

    invoke-static {v14}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v13

    invoke-static {v12, v13}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v12

    if-nez v12, :cond_9

    :cond_8
    invoke-static {v14, v7, v14, v15}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_9
    sget-object v12, La3/k;->d:La3/i;

    invoke-static {v7, v12, v3}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v3, Ll0/m;->a:Ll0/e;

    float-to-double v13, v5

    const-wide/16 v18, 0x0

    cmpl-double v13, v13, v18

    if-lez v13, :cond_a

    goto :goto_7

    :cond_a
    const-string v13, "invalid weight; must be greater than zero"

    invoke-static {v13}, Lm0/a;->a(Ljava/lang/String;)V

    :goto_7
    new-instance v13, Landroidx/compose/foundation/layout/LayoutWeightElement;

    invoke-direct {v13, v5, v10}, Landroidx/compose/foundation/layout/LayoutWeightElement;-><init>(FZ)V

    const/16 v5, 0x36

    invoke-static {v3, v6, v7, v5}, Ll0/p1;->a(Ll0/i;Lb2/g;Landroidx/compose/runtime/Composer;I)Ll0/r1;

    move-result-object v3

    move v5, v11

    iget-wide v10, v7, Lp1/q;->T:J

    invoke-static {v10, v11}, Ljava/lang/Long;->hashCode(J)I

    move-result v10

    invoke-virtual {v7}, Lp1/q;->m()Lp1/p1;

    move-result-object v11

    invoke-static {v7, v13}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v13

    invoke-virtual {v7}, Lp1/q;->i0()V

    iget-boolean v14, v7, Lp1/q;->S:Z

    if-eqz v14, :cond_b

    invoke-virtual {v7, v9}, Lp1/q;->l(Lc93/a;)V

    goto :goto_8

    :cond_b
    invoke-virtual {v7}, Lp1/q;->s0()V

    :goto_8
    invoke-static {v7, v2, v3}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v7, v8, v11}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v3, v7, Lp1/q;->S:Z

    if-nez v3, :cond_c

    invoke-virtual {v7}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v11

    invoke-static {v3, v11}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_d

    :cond_c
    invoke-static {v10, v7, v10, v15}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_d
    invoke-static {v7, v12, v13}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const/high16 v3, 0x3f000000    # 0.5f

    mul-float v28, v5, v3

    invoke-static/range {v28 .. v28}, Ll0/m;->i(F)Ll0/k;

    move-result-object v3

    const/16 v10, 0x36

    invoke-static {v3, v6, v7, v10}, Ll0/p1;->a(Ll0/i;Lb2/g;Landroidx/compose/runtime/Composer;I)Ll0/r1;

    move-result-object v3

    iget-wide v13, v7, Lp1/q;->T:J

    invoke-static {v13, v14}, Ljava/lang/Long;->hashCode(J)I

    move-result v11

    invoke-virtual {v7}, Lp1/q;->m()Lp1/p1;

    move-result-object v13

    invoke-static {v7, v0}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v14

    invoke-virtual {v7}, Lp1/q;->i0()V

    iget-boolean v10, v7, Lp1/q;->S:Z

    if-eqz v10, :cond_e

    invoke-virtual {v7, v9}, Lp1/q;->l(Lc93/a;)V

    goto :goto_9

    :cond_e
    invoke-virtual {v7}, Lp1/q;->s0()V

    :goto_9
    invoke-static {v7, v2, v3}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v7, v8, v13}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v3, v7, Lp1/q;->S:Z

    if-nez v3, :cond_f

    invoke-virtual {v7}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    invoke-static {v3, v10}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_10

    :cond_f
    invoke-static {v11, v7, v11, v15}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_10
    invoke-static {v7, v12, v14}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual {v1}, Ln11/b;->e()Ln11/c;

    move-result-object v3

    invoke-virtual {v3}, Ln11/c;->b()Ljava/lang/String;

    move-result-object v3

    sget-object v10, Lx81/d;->a:Lx81/d;

    const/4 v11, 0x6

    invoke-virtual {v10, v7, v11}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v13

    invoke-virtual {v13}, Lb91/d;->C()Lb91/a;

    move-result-object v22

    invoke-virtual {v10, v7, v11}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v13

    invoke-virtual {v13}, Ly81/i;->y()J

    move-result-wide v13

    const/16 v26, 0x0

    const v27, 0x2fffa

    move-object/from16 v19, v2

    move-object v2, v3

    const/4 v3, 0x0

    move-object/from16 v20, v6

    move-object/from16 v24, v7

    const-wide/16 v6, 0x0

    move-object/from16 v21, v8

    const/4 v8, 0x0

    move-object/from16 v23, v9

    const/4 v9, 0x0

    move-object/from16 v25, v10

    const/4 v10, 0x0

    move/from16 v30, v11

    move-object/from16 v29, v12

    const-wide/16 v11, 0x0

    move/from16 v31, v5

    move-wide/from16 v54, v13

    move-object v14, v4

    move-wide/from16 v4, v54

    const/4 v13, 0x0

    move-object/from16 v32, v14

    const/4 v14, 0x0

    move-object/from16 v33, v15

    const/16 v34, 0x4

    const-wide/16 v15, 0x0

    const/16 v35, 0x36

    const/16 v17, 0x0

    const/16 v36, 0x1

    const/16 v18, 0x0

    move-object/from16 v37, v19

    const/16 v19, 0x0

    move-object/from16 v38, v20

    const/16 v20, 0x0

    move-object/from16 v39, v21

    const/16 v21, 0x0

    move-object/from16 v40, v23

    const/16 v23, 0x0

    move-object/from16 v41, v25

    const/16 v25, 0x0

    move-object/from16 v46, v29

    move-object/from16 v45, v33

    move/from16 v1, v34

    move-object/from16 v43, v37

    move-object/from16 v44, v39

    move-object/from16 v42, v40

    invoke-static/range {v2 .. v27}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v7, v24

    const-wide/high16 v2, 0x3fd0000000000000L    # 0.25

    double-to-float v2, v2

    int-to-float v1, v1

    mul-float/2addr v2, v1

    const/4 v3, 0x0

    const/4 v4, 0x1

    invoke-static {v0, v3, v2, v4}, Landroidx/compose/foundation/layout/a;->n(Landroidx/compose/ui/Modifier;FFI)Landroidx/compose/ui/Modifier;

    move-result-object v5

    invoke-virtual/range {p0 .. p0}, Ln11/b;->e()Ln11/c;

    move-result-object v6

    invoke-virtual {v6}, Ln11/c;->a()Ljava/lang/String;

    move-result-object v6

    move-object/from16 v8, v41

    const/4 v9, 0x6

    invoke-virtual {v8, v7, v9}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v10

    invoke-virtual {v10}, Lb91/d;->b()Lb91/a;

    move-result-object v22

    invoke-virtual {v8, v7, v9}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v10

    invoke-virtual {v10}, Ly81/i;->c1()J

    move-result-wide v10

    const v27, 0x2fff8

    move v12, v2

    move-object v2, v6

    const-wide/16 v6, 0x0

    const/4 v8, 0x0

    move/from16 v30, v9

    const/4 v9, 0x0

    move/from16 v47, v3

    move v14, v4

    move-object v3, v5

    move-wide v4, v10

    const/4 v10, 0x0

    move v13, v12

    const-wide/16 v11, 0x0

    move v15, v13

    const/4 v13, 0x0

    move/from16 v49, v14

    const/4 v14, 0x0

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

    move/from16 v23, v21

    const/16 v21, 0x0

    move/from16 v25, v23

    const/16 v23, 0x0

    move/from16 v29, v25

    const/16 v25, 0x30

    move/from16 v33, v1

    move/from16 v1, v49

    invoke-static/range {v2 .. v27}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v7, v24

    invoke-virtual {v7, v1}, Lp1/q;->q(Z)V

    invoke-virtual/range {p0 .. p0}, Ln11/b;->c()Ln11/c;

    move-result-object v30

    if-nez v30, :cond_11

    const v2, 0x5527808e

    invoke-virtual {v7, v2}, Lp1/q;->e0(I)V

    const/4 v2, 0x0

    invoke-virtual {v7, v2}, Lp1/q;->q(Z)V

    move v10, v2

    move-object/from16 v53, v41

    goto/16 :goto_f

    :cond_11
    const/4 v2, 0x0

    const v3, 0x5527808f

    invoke-virtual {v7, v3}, Lp1/q;->e0(I)V

    const-wide/high16 v3, 0x3ff8000000000000L    # 1.5

    double-to-float v3, v3

    mul-float v3, v3, v31

    invoke-static {v3, v0}, Landroidx/compose/foundation/layout/d;->u(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    invoke-static {v7, v3}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    invoke-static/range {v28 .. v28}, Ll0/m;->i(F)Ll0/k;

    move-result-object v3

    move-object/from16 v4, v38

    const/16 v5, 0x36

    invoke-static {v3, v4, v7, v5}, Ll0/p1;->a(Ll0/i;Lb2/g;Landroidx/compose/runtime/Composer;I)Ll0/r1;

    move-result-object v3

    iget-wide v4, v7, Lp1/q;->T:J

    invoke-static {v4, v5}, Ljava/lang/Long;->hashCode(J)I

    move-result v4

    invoke-virtual {v7}, Lp1/q;->m()Lp1/p1;

    move-result-object v5

    invoke-static {v7, v0}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v6

    invoke-virtual {v7}, Lp1/q;->i0()V

    iget-boolean v8, v7, Lp1/q;->S:Z

    if-eqz v8, :cond_12

    move-object/from16 v8, v42

    invoke-virtual {v7, v8}, Lp1/q;->l(Lc93/a;)V

    :goto_a
    move-object/from16 v8, v43

    goto :goto_b

    :cond_12
    invoke-virtual {v7}, Lp1/q;->s0()V

    goto :goto_a

    :goto_b
    invoke-static {v7, v8, v3}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    move-object/from16 v3, v44

    invoke-static {v7, v3, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v3, v7, Lp1/q;->S:Z

    if-nez v3, :cond_13

    invoke-virtual {v7}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-static {v3, v5}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_14

    :cond_13
    move-object/from16 v3, v45

    goto :goto_d

    :cond_14
    :goto_c
    move-object/from16 v3, v46

    goto :goto_e

    :goto_d
    invoke-static {v4, v7, v4, v3}, Ld;->y(ILp1/q;ILa3/i;)V

    goto :goto_c

    :goto_e
    invoke-static {v7, v3, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    move/from16 v3, v29

    const/4 v4, 0x0

    invoke-static {v0, v4, v3, v1}, Landroidx/compose/foundation/layout/a;->n(Landroidx/compose/ui/Modifier;FFI)Landroidx/compose/ui/Modifier;

    move-result-object v5

    move/from16 v48, v2

    invoke-virtual/range {v30 .. v30}, Ln11/c;->b()Ljava/lang/String;

    move-result-object v2

    move-object/from16 v6, v41

    const/4 v8, 0x6

    invoke-virtual {v6, v7, v8}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v9

    invoke-virtual {v9}, Lb91/d;->b()Lb91/a;

    move-result-object v22

    invoke-virtual {v6, v7, v8}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v9

    invoke-virtual {v9}, Ly81/i;->c1()J

    move-result-wide v9

    const/16 v26, 0x0

    const v27, 0x2fff8

    move-object/from16 v24, v7

    const-wide/16 v6, 0x0

    move/from16 v50, v8

    const/4 v8, 0x0

    move/from16 v47, v4

    move-object v3, v5

    move-wide v4, v9

    const/4 v9, 0x0

    const/4 v10, 0x0

    const-wide/16 v11, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const-wide/16 v15, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v23, 0x0

    const/16 v25, 0x30

    move/from16 v52, v29

    move-object/from16 v51, v41

    invoke-static/range {v2 .. v27}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v7, v24

    move/from16 v3, v52

    const/4 v4, 0x0

    invoke-static {v0, v4, v3, v1}, Landroidx/compose/foundation/layout/a;->n(Landroidx/compose/ui/Modifier;FFI)Landroidx/compose/ui/Modifier;

    move-result-object v3

    invoke-virtual/range {v30 .. v30}, Ln11/c;->a()Ljava/lang/String;

    move-result-object v2

    move-object/from16 v4, v51

    const/4 v5, 0x6

    invoke-virtual {v4, v7, v5}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v6

    invoke-virtual {v6}, Lb91/d;->b()Lb91/a;

    move-result-object v22

    invoke-virtual {v4, v7, v5}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v6

    invoke-virtual {v6}, Ly81/i;->c1()J

    move-result-wide v8

    const-wide/16 v6, 0x0

    move-object/from16 v41, v4

    move/from16 v30, v5

    move-wide v4, v8

    const/4 v8, 0x0

    const/4 v9, 0x0

    move-object/from16 v53, v41

    invoke-static/range {v2 .. v27}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v7, v24

    invoke-virtual {v7, v1}, Lp1/q;->q(Z)V

    const/4 v10, 0x0

    invoke-virtual {v7, v10}, Lp1/q;->q(Z)V

    :goto_f
    invoke-virtual/range {p0 .. p0}, Ln11/b;->a()Ljava/lang/Integer;

    move-result-object v2

    if-nez v2, :cond_15

    const v0, 0x5534dd74

    invoke-virtual {v7, v0}, Lp1/q;->e0(I)V

    invoke-virtual {v7, v10}, Lp1/q;->q(Z)V

    const/4 v11, 0x6

    goto :goto_10

    :cond_15
    const v3, 0x5534dd75

    invoke-virtual {v7, v3}, Lp1/q;->e0(I)V

    invoke-virtual {v2}, Ljava/lang/Number;->intValue()I

    move-result v2

    const-wide/high16 v3, 0x3ff4000000000000L    # 1.25

    double-to-float v3, v3

    move/from16 v5, v31

    invoke-static {v3, v5, v0, v7}, Ly00/t7;->p(FFLb2/t;Lp1/q;)V

    const/4 v11, 0x6

    invoke-static {v2, v7, v11}, Lts/o;->S(ILandroidx/compose/runtime/Composer;I)Lo2/e;

    move-result-object v2

    sget v3, Lgy0/f;->y:I

    invoke-static {v7, v3}, Lq83/g;->Y(Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v3

    const/4 v4, 0x5

    int-to-float v4, v4

    mul-float v4, v4, v33

    invoke-static {v4, v0}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    sget-wide v5, Li2/x;->n:J

    const/16 v8, 0xd80

    const/4 v9, 0x0

    invoke-static/range {v2 .. v9}, Lg1/f3;->b(Lo2/e;Ljava/lang/String;Landroidx/compose/ui/Modifier;JLandroidx/compose/runtime/Composer;II)V

    invoke-virtual {v7, v10}, Lp1/q;->q(Z)V

    :goto_10
    invoke-virtual {v7, v1}, Lp1/q;->q(Z)V

    invoke-virtual/range {p0 .. p0}, Ln11/b;->b()Ljava/lang/String;

    move-result-object v2

    move-object/from16 v4, v53

    invoke-virtual {v4, v7, v11}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v0

    invoke-virtual {v0}, Lb91/d;->E()Lb91/a;

    move-result-object v22

    invoke-virtual {v4, v7, v11}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v0

    invoke-virtual {v0}, Ly81/i;->c1()J

    move-result-wide v4

    const/16 v26, 0x0

    const v27, 0x2fffa

    const/4 v3, 0x0

    move-object/from16 v24, v7

    const-wide/16 v6, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const-wide/16 v11, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const-wide/16 v15, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v23, 0x0

    const/16 v25, 0x0

    invoke-static/range {v2 .. v27}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v7, v24

    invoke-virtual {v7, v1}, Lp1/q;->q(Z)V

    move-object/from16 v3, v32

    goto :goto_11

    :cond_16
    invoke-virtual {v7}, Lp1/q;->X()V

    move-object v3, v5

    :goto_11
    invoke-virtual {v7}, Lp1/q;->u()Lp1/v1;

    move-result-object v6

    if-eqz v6, :cond_17

    new-instance v0, Llq2/c;

    const/16 v5, 0x13

    move-object/from16 v1, p0

    move/from16 v2, p3

    move/from16 v4, p4

    invoke-direct/range {v0 .. v5}, Llq2/c;-><init>(Ljava/lang/Object;ILjava/lang/Object;II)V

    iput-object v0, v6, Lp1/v1;->d:Lc93/m;

    :cond_17
    return-void
.end method

.method private static final c(Ln11/b;Landroidx/compose/ui/Modifier;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, Lp1/x;->L(I)I

    move-result p2

    invoke-static {p0, p1, p4, p2, p3}, Ln11/a;->b(Ln11/b;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method
