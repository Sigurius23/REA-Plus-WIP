.class public abstract Lxq2/p;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0003\u00a2\u0006\u0004\u0008\u0003\u0010\u0004\u00a8\u0006\u0005"
    }
    d2 = {
        "Lxq2/n;",
        "state",
        "Ll83/a0;",
        "b",
        "(Lxq2/n;Landroidx/compose/runtime/Composer;I)V",
        "user-journey_release"
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
.method public static synthetic a(Lxq2/n;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lxq2/p;->c(Lxq2/n;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method private static final b(Lxq2/n;Landroidx/compose/runtime/Composer;I)V
    .locals 45

    move-object/from16 v0, p0

    move-object/from16 v11, p1

    check-cast v11, Lp1/q;

    const v2, -0x34eee50f    # -9509617.0f

    invoke-virtual {v11, v2}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v2, p2, 0x6

    const/4 v3, 0x2

    const/4 v4, 0x4

    if-nez v2, :cond_2

    and-int/lit8 v2, p2, 0x8

    if-nez v2, :cond_0

    invoke-virtual {v11, v0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v2

    goto :goto_0

    :cond_0
    invoke-virtual {v11, v0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v2

    :goto_0
    if-eqz v2, :cond_1

    move v2, v4

    goto :goto_1

    :cond_1
    move v2, v3

    :goto_1
    or-int v2, p2, v2

    goto :goto_2

    :cond_2
    move/from16 v2, p2

    :goto_2
    and-int/lit8 v5, v2, 0x3

    const/4 v14, 0x1

    if-eq v5, v3, :cond_3

    move v3, v14

    goto :goto_3

    :cond_3
    const/4 v3, 0x0

    :goto_3
    and-int/2addr v2, v14

    invoke-virtual {v11, v2, v3}, Lp1/q;->U(IZ)Z

    move-result v2

    if-eqz v2, :cond_13

    sget-object v15, Lb2/e;->N:Lb2/k;

    int-to-float v2, v14

    const/16 v3, 0x8

    int-to-float v3, v3

    mul-float/2addr v2, v3

    invoke-static {v2}, Ll0/m;->i(F)Ll0/k;

    move-result-object v2

    const/16 v5, 0x36

    invoke-static {v2, v15, v11, v5}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v2

    iget-wide v7, v11, Lp1/q;->T:J

    invoke-static {v7, v8}, Ljava/lang/Long;->hashCode(J)I

    move-result v7

    invoke-virtual {v11}, Lp1/q;->m()Lp1/p1;

    move-result-object v8

    sget-object v9, Lb2/t;->w:Lb2/t;

    invoke-static {v11, v9}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v10

    sget-object v12, La3/l;->a:La3/k;

    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v12, La3/k;->b:La3/j;

    invoke-virtual {v11}, Lp1/q;->i0()V

    iget-boolean v13, v11, Lp1/q;->S:Z

    if-eqz v13, :cond_4

    invoke-virtual {v11, v12}, Lp1/q;->l(Lc93/a;)V

    goto :goto_4

    :cond_4
    invoke-virtual {v11}, Lp1/q;->s0()V

    :goto_4
    sget-object v13, La3/k;->g:La3/i;

    invoke-static {v11, v13, v2}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v2, La3/k;->f:La3/i;

    invoke-static {v11, v2, v8}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v8, La3/k;->j:La3/i;

    iget-boolean v14, v11, Lp1/q;->S:Z

    if-nez v14, :cond_5

    invoke-virtual {v11}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v14

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-static {v14, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_6

    :cond_5
    invoke-static {v7, v11, v7, v8}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_6
    sget-object v14, La3/k;->d:La3/i;

    invoke-static {v11, v14, v10}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const/16 v6, 0xa

    int-to-float v6, v6

    int-to-float v4, v4

    mul-float/2addr v6, v4

    invoke-static {v6, v9}, Landroidx/compose/foundation/layout/d;->h(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v6

    move-object v10, v6

    const-wide/high16 v5, 0x3ff8000000000000L    # 1.5

    double-to-float v5, v5

    mul-float/2addr v5, v3

    invoke-static {v5}, Ll0/m;->i(F)Ll0/k;

    move-result-object v5

    sget-object v6, Lb2/e;->K:Lb2/l;

    const/16 v7, 0x36

    invoke-static {v5, v6, v11, v7}, Ll0/p1;->a(Ll0/i;Lb2/g;Landroidx/compose/runtime/Composer;I)Ll0/r1;

    move-result-object v5

    iget-wide v6, v11, Lp1/q;->T:J

    invoke-static {v6, v7}, Ljava/lang/Long;->hashCode(J)I

    move-result v6

    invoke-virtual {v11}, Lp1/q;->m()Lp1/p1;

    move-result-object v7

    invoke-static {v11, v10}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v10

    invoke-virtual {v11}, Lp1/q;->i0()V

    move/from16 v17, v3

    iget-boolean v3, v11, Lp1/q;->S:Z

    if-eqz v3, :cond_7

    invoke-virtual {v11, v12}, Lp1/q;->l(Lc93/a;)V

    goto :goto_5

    :cond_7
    invoke-virtual {v11}, Lp1/q;->s0()V

    :goto_5
    invoke-static {v11, v13, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v11, v2, v7}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v3, v11, Lp1/q;->S:Z

    if-nez v3, :cond_8

    invoke-virtual {v11}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-static {v3, v5}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_9

    :cond_8
    invoke-static {v6, v11, v6, v8}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_9
    invoke-static {v11, v14, v10}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v3, Lb2/e;->E:Lb2/m;

    const/4 v5, 0x0

    invoke-static {v3, v5}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v3

    iget-wide v5, v11, Lp1/q;->T:J

    invoke-static {v5, v6}, Ljava/lang/Long;->hashCode(J)I

    move-result v5

    invoke-virtual {v11}, Lp1/q;->m()Lp1/p1;

    move-result-object v6

    invoke-static {v11, v9}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v7

    invoke-virtual {v11}, Lp1/q;->i0()V

    iget-boolean v10, v11, Lp1/q;->S:Z

    if-eqz v10, :cond_a

    invoke-virtual {v11, v12}, Lp1/q;->l(Lc93/a;)V

    goto :goto_6

    :cond_a
    invoke-virtual {v11}, Lp1/q;->s0()V

    :goto_6
    invoke-static {v11, v13, v3}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v11, v2, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v3, v11, Lp1/q;->S:Z

    if-nez v3, :cond_b

    invoke-virtual {v11}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-static {v3, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_c

    :cond_b
    invoke-static {v5, v11, v5, v8}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_c
    invoke-static {v11, v14, v7}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const/4 v3, 0x3

    int-to-float v3, v3

    mul-float/2addr v3, v4

    const-wide/high16 v5, 0x3fe0000000000000L    # 0.5

    double-to-float v5, v5

    mul-float v6, v5, v4

    sget-object v4, Lx81/d;->a:Lx81/d;

    sget v7, Lx81/d;->b:I

    invoke-virtual {v4, v11, v7}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v10

    invoke-virtual {v10}, Ly81/i;->W0()J

    move-result-wide v18

    invoke-static/range {v18 .. v19}, Li91/c;->o(J)Li91/a;

    move-result-object v10

    sget v16, Li91/a;->a:I

    move-object/from16 v18, v2

    shl-int/lit8 v2, v16, 0x9

    move-object/from16 v16, v12

    or-int/lit16 v12, v2, 0x61b0

    move-object/from16 v19, v13

    const/16 v13, 0x1e1

    move/from16 v20, v2

    const/4 v2, 0x0

    move-object/from16 v21, v4

    const/high16 v4, 0x3f800000    # 1.0f

    move/from16 v22, v7

    const/4 v7, 0x0

    move-object/from16 v23, v8

    const/4 v8, 0x0

    move-object/from16 v24, v9

    const/4 v9, 0x0

    move/from16 v25, v5

    move-object v5, v10

    const/4 v10, 0x0

    move-object/from16 v0, v16

    move-object/from16 v16, v15

    move-object v15, v0

    move/from16 v28, v17

    move-object/from16 v32, v18

    move-object/from16 v0, v19

    move-object/from16 v30, v21

    move/from16 v31, v22

    move-object/from16 v1, v24

    move/from16 v29, v25

    move-object/from16 v17, v14

    move/from16 v14, v20

    invoke-static/range {v2 .. v13}, Lwy0/c;->c(Landroidx/compose/ui/Modifier;FFLi91/a;FZFILwy0/d;Landroidx/compose/runtime/Composer;II)V

    move-object/from16 v24, v11

    invoke-virtual/range {p0 .. p0}, Lxq2/n;->a()D

    move-result-wide v4

    double-to-float v4, v4

    invoke-virtual/range {p0 .. p0}, Lxq2/n;->b()Li91/a;

    move-result-object v5

    or-int/lit16 v12, v14, 0x6030

    invoke-static/range {v2 .. v13}, Lwy0/c;->c(Landroidx/compose/ui/Modifier;FFLi91/a;FZFILwy0/d;Landroidx/compose/runtime/Composer;II)V

    const/4 v2, 0x1

    invoke-virtual {v11, v2}, Lp1/q;->q(Z)V

    sget-object v3, Lb2/e;->L:Lb2/l;

    sget-object v4, Ll0/m;->a:Ll0/e;

    const/16 v5, 0x30

    invoke-static {v4, v3, v11, v5}, Ll0/p1;->a(Ll0/i;Lb2/g;Landroidx/compose/runtime/Composer;I)Ll0/r1;

    move-result-object v3

    iget-wide v6, v11, Lp1/q;->T:J

    invoke-static {v6, v7}, Ljava/lang/Long;->hashCode(J)I

    move-result v4

    invoke-virtual {v11}, Lp1/q;->m()Lp1/p1;

    move-result-object v6

    invoke-static {v11, v1}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v7

    invoke-virtual {v11}, Lp1/q;->i0()V

    iget-boolean v8, v11, Lp1/q;->S:Z

    if-eqz v8, :cond_d

    invoke-virtual {v11, v15}, Lp1/q;->l(Lc93/a;)V

    goto :goto_7

    :cond_d
    invoke-virtual {v11}, Lp1/q;->s0()V

    :goto_7
    invoke-static {v11, v0, v3}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    move-object/from16 v3, v32

    invoke-static {v11, v3, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v6, v11, Lp1/q;->S:Z

    if-nez v6, :cond_e

    invoke-virtual {v11}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v6

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    invoke-static {v6, v8}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_f

    :cond_e
    move-object/from16 v6, v23

    goto :goto_9

    :cond_f
    move-object/from16 v6, v23

    :goto_8
    move-object/from16 v4, v17

    goto :goto_a

    :goto_9
    invoke-static {v4, v11, v4, v6}, Ld;->y(ILp1/q;ILa3/i;)V

    goto :goto_8

    :goto_a
    invoke-static {v11, v4, v7}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual/range {p0 .. p0}, Lxq2/n;->e()I

    move-result v7

    invoke-static {v7}, Ljava/lang/String;->valueOf(I)Ljava/lang/String;

    move-result-object v7

    move-object/from16 v8, v30

    move/from16 v9, v31

    invoke-virtual {v8, v11, v9}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v10

    invoke-virtual {v10}, Lb91/d;->A()Lb91/a;

    move-result-object v22

    invoke-virtual {v8, v11, v9}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v10

    invoke-virtual {v10}, Ly81/i;->y()J

    move-result-wide v12

    sget v10, Lb91/a;->d:I

    shl-int/lit8 v26, v10, 0x12

    const v27, 0x2fffa

    move-object/from16 v32, v3

    const/4 v3, 0x0

    move v10, v2

    move-object/from16 v23, v6

    move-object v2, v7

    const-wide/16 v6, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    move v14, v10

    const/4 v10, 0x0

    move-object/from16 v17, v4

    move-object/from16 v24, v11

    move-wide/from16 v43, v12

    move v13, v5

    move-wide/from16 v4, v43

    const-wide/16 v11, 0x0

    move/from16 v18, v13

    const/4 v13, 0x0

    move/from16 v19, v14

    const/4 v14, 0x0

    move-object/from16 v21, v15

    move-object/from16 v20, v16

    const-wide/16 v15, 0x0

    move-object/from16 v25, v17

    const/16 v17, 0x0

    move/from16 v33, v18

    const/16 v18, 0x0

    move/from16 v34, v19

    const/16 v19, 0x0

    move-object/from16 v35, v20

    const/16 v20, 0x0

    move-object/from16 v36, v21

    const/16 v21, 0x0

    move-object/from16 v37, v23

    const/16 v23, 0x0

    move-object/from16 v38, v25

    const/16 v25, 0x0

    move-object/from16 p1, v30

    move-object/from16 v30, v0

    move-object/from16 v0, p1

    move-object/from16 p1, v1

    move/from16 v1, v31

    move-object/from16 v39, v32

    move-object/from16 v40, v37

    move-object/from16 v41, v38

    invoke-static/range {v2 .. v27}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v11, v24

    mul-float v20, v29, v28

    const/16 v21, 0x7

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    move-object/from16 v16, p1

    invoke-static/range {v16 .. v21}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v3

    invoke-virtual/range {p0 .. p0}, Lxq2/n;->f()Lcom/whoop/design/util/TextResource;

    move-result-object v2

    sget v4, Lcom/whoop/design/util/TextResource;->$stable:I

    invoke-static {v2, v11, v4}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v0, v11, v1}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v5

    invoke-virtual {v5}, Lb91/d;->D()Lb91/a;

    move-result-object v22

    invoke-virtual {v0, v11, v1}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v5

    invoke-virtual {v5}, Ly81/i;->y()J

    move-result-wide v5

    const/16 v25, 0x30

    const v27, 0x2fff8

    move v8, v4

    move-wide v4, v5

    const-wide/16 v6, 0x0

    move v9, v8

    const/4 v8, 0x0

    move v10, v9

    const/4 v9, 0x0

    move v12, v10

    const/4 v10, 0x0

    move v13, v12

    const-wide/16 v11, 0x0

    move v14, v13

    const/4 v13, 0x0

    move v15, v14

    const/4 v14, 0x0

    move/from16 v17, v15

    move-object/from16 v18, v16

    const-wide/16 v15, 0x0

    move/from16 v19, v17

    const/16 v17, 0x0

    move-object/from16 v20, v18

    const/16 v18, 0x0

    move/from16 v21, v19

    const/16 v19, 0x0

    move-object/from16 v23, v20

    const/16 v20, 0x0

    move/from16 v28, v21

    const/16 v21, 0x0

    move-object/from16 v29, v23

    const/16 v23, 0x0

    move-object/from16 v31, v0

    move/from16 v0, v28

    move/from16 v28, v1

    move-object/from16 v1, v29

    invoke-static/range {v2 .. v27}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v11, v24

    const/4 v2, 0x1

    invoke-virtual {v11, v2}, Lp1/q;->q(Z)V

    invoke-virtual {v11, v2}, Lp1/q;->q(Z)V

    sget-object v3, Ll0/m;->c:Ll0/g;

    move-object/from16 v4, v35

    const/16 v13, 0x30

    invoke-static {v3, v4, v11, v13}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v3

    iget-wide v4, v11, Lp1/q;->T:J

    invoke-static {v4, v5}, Ljava/lang/Long;->hashCode(J)I

    move-result v4

    invoke-virtual {v11}, Lp1/q;->m()Lp1/p1;

    move-result-object v5

    invoke-static {v11, v1}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    invoke-virtual {v11}, Lp1/q;->i0()V

    iget-boolean v6, v11, Lp1/q;->S:Z

    if-eqz v6, :cond_10

    move-object/from16 v15, v36

    invoke-virtual {v11, v15}, Lp1/q;->l(Lc93/a;)V

    :goto_b
    move-object/from16 v6, v30

    goto :goto_c

    :cond_10
    invoke-virtual {v11}, Lp1/q;->s0()V

    goto :goto_b

    :goto_c
    invoke-static {v11, v6, v3}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    move-object/from16 v3, v39

    invoke-static {v11, v3, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v3, v11, Lp1/q;->S:Z

    if-nez v3, :cond_11

    invoke-virtual {v11}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-static {v3, v5}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_12

    :cond_11
    move-object/from16 v6, v40

    goto :goto_e

    :cond_12
    :goto_d
    move-object/from16 v4, v41

    goto :goto_f

    :goto_e
    invoke-static {v4, v11, v4, v6}, Ld;->y(ILp1/q;ILa3/i;)V

    goto :goto_d

    :goto_f
    invoke-static {v11, v4, v1}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual/range {p0 .. p0}, Lxq2/n;->c()Lcom/whoop/design/util/TextResource;

    move-result-object v1

    invoke-static {v1, v11, v0}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v1

    move/from16 v4, v28

    move-object/from16 v3, v31

    invoke-virtual {v3, v11, v4}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v5

    invoke-virtual {v5}, Lb91/d;->b()Lb91/a;

    move-result-object v22

    invoke-virtual {v3, v11, v4}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v5

    invoke-virtual {v5}, Ly81/i;->y()J

    move-result-wide v5

    const/16 v25, 0x0

    const v27, 0x2fffa

    move-object/from16 v30, v3

    const/4 v3, 0x0

    move/from16 v31, v4

    move-wide v4, v5

    const-wide/16 v6, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    move-object/from16 v24, v11

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

    move-object v2, v1

    move-object/from16 v1, v30

    move/from16 v42, v31

    invoke-static/range {v2 .. v27}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v11, v24

    invoke-virtual/range {p0 .. p0}, Lxq2/n;->d()Lcom/whoop/design/util/TextResource;

    move-result-object v2

    invoke-static {v2, v11, v0}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v2

    move/from16 v4, v42

    invoke-virtual {v1, v11, v4}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v0

    invoke-virtual {v0}, Lb91/d;->b()Lb91/a;

    move-result-object v22

    invoke-virtual {v1, v11, v4}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v0

    invoke-virtual {v0}, Ly81/i;->y()J

    move-result-wide v4

    const-wide/16 v11, 0x0

    invoke-static/range {v2 .. v27}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v11, v24

    const/4 v2, 0x1

    invoke-virtual {v11, v2}, Lp1/q;->q(Z)V

    invoke-virtual {v11, v2}, Lp1/q;->q(Z)V

    goto :goto_10

    :cond_13
    invoke-virtual {v11}, Lp1/q;->X()V

    :goto_10
    invoke-virtual {v11}, Lp1/q;->u()Lp1/v1;

    move-result-object v0

    if-eqz v0, :cond_14

    new-instance v1, Lxq2/b;

    const/4 v2, 0x1

    move-object/from16 v3, p0

    move/from16 v4, p2

    invoke-direct {v1, v3, v4, v2}, Lxq2/b;-><init>(Ljava/lang/Object;II)V

    iput-object v1, v0, Lp1/v1;->d:Lc93/m;

    :cond_14
    return-void
.end method

.method private static final c(Lxq2/n;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p1, p1, 0x1

    invoke-static {p1}, Lp1/x;->L(I)I

    move-result p1

    invoke-static {p0, p2, p1}, Lxq2/p;->b(Lxq2/n;Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static final synthetic d(Lxq2/n;Landroidx/compose/runtime/Composer;I)V
    .locals 0

    invoke-static {p0, p1, p2}, Lxq2/p;->b(Lxq2/n;Landroidx/compose/runtime/Composer;I)V

    return-void
.end method
