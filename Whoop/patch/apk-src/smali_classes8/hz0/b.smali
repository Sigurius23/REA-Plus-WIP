.class public abstract Lhz0/b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0002\u0008\u0005\u001a!\u0010\u0005\u001a\u00020\u00042\u0008\u0008\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0007\u00a2\u0006\u0004\u0008\u0005\u0010\u0006\u001a\u0017\u0010\u0008\u001a\u00020\u00072\u0006\u0010\u0003\u001a\u00020\u0002H\u0000\u00a2\u0006\u0004\u0008\u0008\u0010\t\u001a\u000f\u0010\n\u001a\u00020\u0004H\u0007\u00a2\u0006\u0004\u0008\n\u0010\u000b\u00a8\u0006\u000c"
    }
    d2 = {
        "Landroidx/compose/ui/Modifier;",
        "modifier",
        "Lhz0/c;",
        "state",
        "Ll83/a0;",
        "c",
        "(Landroidx/compose/ui/Modifier;Lhz0/c;Landroidx/compose/runtime/Composer;II)V",
        "",
        "g",
        "(Lhz0/c;)Z",
        "e",
        "(Landroidx/compose/runtime/Composer;I)V",
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
.method public static synthetic a(ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, Lhz0/b;->f(ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Landroidx/compose/ui/Modifier;Lhz0/c;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p5}, Lhz0/b;->d(Landroidx/compose/ui/Modifier;Lhz0/c;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final c(Landroidx/compose/ui/Modifier;Lhz0/c;Landroidx/compose/runtime/Composer;II)V
    .locals 41

    move-object/from16 v2, p1

    const-string v0, "state"

    invoke-static {v2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v0, p2

    check-cast v0, Lp1/q;

    const v1, -0x365f6ac

    invoke-virtual {v0, v1}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v1, p4, 0x1

    if-eqz v1, :cond_0

    or-int/lit8 v5, p3, 0x6

    move v6, v5

    move-object/from16 v5, p0

    goto :goto_1

    :cond_0
    and-int/lit8 v5, p3, 0x6

    if-nez v5, :cond_2

    move-object/from16 v5, p0

    invoke-virtual {v0, v5}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_1

    const/4 v6, 0x4

    goto :goto_0

    :cond_1
    const/4 v6, 0x2

    :goto_0
    or-int v6, p3, v6

    goto :goto_1

    :cond_2
    move-object/from16 v5, p0

    move/from16 v6, p3

    :goto_1
    and-int/lit8 v7, p3, 0x30

    if-nez v7, :cond_4

    invoke-virtual {v0, v2}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_3

    const/16 v7, 0x20

    goto :goto_2

    :cond_3
    const/16 v7, 0x10

    :goto_2
    or-int/2addr v6, v7

    :cond_4
    and-int/lit8 v7, v6, 0x13

    const/16 v8, 0x12

    const/4 v9, 0x0

    const/4 v10, 0x1

    if-eq v7, v8, :cond_5

    move v7, v10

    goto :goto_3

    :cond_5
    move v7, v9

    :goto_3
    and-int/2addr v6, v10

    invoke-virtual {v0, v6, v7}, Lp1/q;->U(IZ)Z

    move-result v6

    if-eqz v6, :cond_1b

    sget-object v6, Lb2/t;->w:Lb2/t;

    if-eqz v1, :cond_6

    move-object v1, v6

    goto :goto_4

    :cond_6
    move-object v1, v5

    :goto_4
    invoke-virtual {v2}, Lhz0/c;->g()Ly81/f;

    move-result-object v5

    invoke-virtual {v5, v0, v9}, Ly81/f;->toComposableColor-WaAFU9c(Landroidx/compose/runtime/Composer;I)J

    move-result-wide v7

    const v5, 0x3e19999a    # 0.15f

    invoke-static {v5, v7, v8}, Li2/x;->c(FJ)J

    move-result-wide v11

    sget-object v5, Ll0/m;->c:Ll0/g;

    sget-object v13, Lb2/e;->M:Lb2/k;

    invoke-static {v5, v13, v0, v9}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v14

    iget-wide v9, v0, Lp1/q;->T:J

    invoke-static {v9, v10}, Ljava/lang/Long;->hashCode(J)I

    move-result v9

    invoke-virtual {v0}, Lp1/q;->m()Lp1/p1;

    move-result-object v10

    invoke-static {v0, v1}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v15

    sget-object v16, La3/l;->a:La3/k;

    invoke-virtual/range {v16 .. v16}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v3, La3/k;->b:La3/j;

    invoke-virtual {v0}, Lp1/q;->i0()V

    iget-boolean v4, v0, Lp1/q;->S:Z

    if-eqz v4, :cond_7

    invoke-virtual {v0, v3}, Lp1/q;->l(Lc93/a;)V

    goto :goto_5

    :cond_7
    invoke-virtual {v0}, Lp1/q;->s0()V

    :goto_5
    sget-object v4, La3/k;->g:La3/i;

    invoke-static {v0, v4, v14}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v14, La3/k;->f:La3/i;

    invoke-static {v0, v14, v10}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v10, La3/k;->j:La3/i;

    move-object/from16 v29, v1

    iget-boolean v1, v0, Lp1/q;->S:Z

    if-nez v1, :cond_8

    invoke-virtual {v0}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_9

    :cond_8
    invoke-static {v9, v0, v9, v10}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_9
    sget-object v1, La3/k;->d:La3/i;

    invoke-static {v0, v1, v15}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const/high16 v2, 0x3f800000    # 1.0f

    invoke-static {v2, v6}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v9

    const/16 v15, 0xc

    int-to-float v15, v15

    invoke-static {v15, v9}, Landroidx/compose/foundation/layout/d;->h(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v9

    const/4 v15, 0x3

    int-to-float v15, v15

    const/4 v2, 0x4

    int-to-float v2, v2

    invoke-static {v9, v15, v2}, Lih0/d0;->e(Landroidx/compose/ui/Modifier;FF)Landroidx/compose/ui/Modifier;

    move-result-object v9

    sget-object v15, Li2/w0;->a:Li2/v0;

    invoke-static {v9, v11, v12, v15}, Landroidx/compose/foundation/a;->c(Landroidx/compose/ui/Modifier;JLi2/a1;)Landroidx/compose/ui/Modifier;

    move-result-object v9

    sget-object v11, Lb2/e;->w:Lb2/m;

    const/4 v12, 0x0

    invoke-static {v11, v12}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v11

    move-object/from16 v17, v13

    iget-wide v12, v0, Lp1/q;->T:J

    invoke-static {v12, v13}, Ljava/lang/Long;->hashCode(J)I

    move-result v12

    invoke-virtual {v0}, Lp1/q;->m()Lp1/p1;

    move-result-object v13

    invoke-static {v0, v9}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v9

    invoke-virtual {v0}, Lp1/q;->i0()V

    move-object/from16 v19, v15

    iget-boolean v15, v0, Lp1/q;->S:Z

    if-eqz v15, :cond_a

    invoke-virtual {v0, v3}, Lp1/q;->l(Lc93/a;)V

    goto :goto_6

    :cond_a
    invoke-virtual {v0}, Lp1/q;->s0()V

    :goto_6
    invoke-static {v0, v4, v11}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v0, v14, v13}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v11, v0, Lp1/q;->S:Z

    if-nez v11, :cond_b

    invoke-virtual {v0}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v11

    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v13

    invoke-static {v11, v13}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v11

    if-nez v11, :cond_c

    :cond_b
    invoke-static {v12, v0, v12, v10}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_c
    invoke-static {v0, v1, v9}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const/4 v15, 0x1

    int-to-float v9, v15

    move-object/from16 v11, v19

    invoke-static {v9, v6}, Landroidx/compose/foundation/layout/a;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v9

    const/4 v12, 0x2

    int-to-float v12, v12

    invoke-static {v9, v12, v2}, Lih0/d0;->e(Landroidx/compose/ui/Modifier;FF)Landroidx/compose/ui/Modifier;

    move-result-object v19

    invoke-virtual/range {p1 .. p1}, Lhz0/c;->c()F

    move-result v22

    const/16 v25, 0x1b

    const/16 v26, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    invoke-static/range {v19 .. v26}, Lp91/e;->f(Landroidx/compose/ui/Modifier;FFFFLp91/a;ILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    invoke-static {v2, v7, v8, v11}, Landroidx/compose/foundation/a;->c(Landroidx/compose/ui/Modifier;JLi2/a1;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    const/4 v12, 0x0

    invoke-static {v2, v0, v12}, Ll0/q;->a(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V

    const/4 v15, 0x1

    invoke-virtual {v0, v15}, Lp1/q;->q(Z)V

    invoke-static/range {p1 .. p1}, Lhz0/b;->g(Lhz0/c;)Z

    move-result v2

    if-eqz v2, :cond_1a

    const v2, -0x3f05e9d

    invoke-virtual {v0, v2}, Lp1/q;->e0(I)V

    const/high16 v2, 0x3f800000    # 1.0f

    invoke-static {v2, v6}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v18

    const/16 v2, 0x8

    int-to-float v2, v2

    const/16 v22, 0x0

    const/16 v23, 0xd

    const/16 v19, 0x0

    const/16 v21, 0x0

    move/from16 v20, v2

    invoke-static/range {v18 .. v23}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v2

    sget-object v7, Ll0/m;->g:Ll0/h;

    sget-object v8, Lb2/e;->K:Lb2/l;

    const/16 v9, 0x36

    invoke-static {v7, v8, v0, v9}, Ll0/p1;->a(Ll0/i;Lb2/g;Landroidx/compose/runtime/Composer;I)Ll0/r1;

    move-result-object v7

    iget-wide v8, v0, Lp1/q;->T:J

    invoke-static {v8, v9}, Ljava/lang/Long;->hashCode(J)I

    move-result v8

    invoke-virtual {v0}, Lp1/q;->m()Lp1/p1;

    move-result-object v9

    invoke-static {v0, v2}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    invoke-virtual {v0}, Lp1/q;->i0()V

    iget-boolean v11, v0, Lp1/q;->S:Z

    if-eqz v11, :cond_d

    invoke-virtual {v0, v3}, Lp1/q;->l(Lc93/a;)V

    goto :goto_7

    :cond_d
    invoke-virtual {v0}, Lp1/q;->s0()V

    :goto_7
    invoke-static {v0, v4, v7}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v0, v14, v9}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v7, v0, Lp1/q;->S:Z

    if-nez v7, :cond_e

    invoke-virtual {v0}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v7

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    invoke-static {v7, v9}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_f

    :cond_e
    invoke-static {v8, v0, v8, v10}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_f
    invoke-static {v0, v1, v2}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    move-object/from16 v2, v17

    const/4 v12, 0x0

    invoke-static {v5, v2, v0, v12}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v7

    iget-wide v8, v0, Lp1/q;->T:J

    invoke-static {v8, v9}, Ljava/lang/Long;->hashCode(J)I

    move-result v8

    invoke-virtual {v0}, Lp1/q;->m()Lp1/p1;

    move-result-object v9

    invoke-static {v0, v6}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v11

    invoke-virtual {v0}, Lp1/q;->i0()V

    iget-boolean v12, v0, Lp1/q;->S:Z

    if-eqz v12, :cond_10

    invoke-virtual {v0, v3}, Lp1/q;->l(Lc93/a;)V

    goto :goto_8

    :cond_10
    invoke-virtual {v0}, Lp1/q;->s0()V

    :goto_8
    invoke-static {v0, v4, v7}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v0, v14, v9}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v7, v0, Lp1/q;->S:Z

    if-nez v7, :cond_11

    invoke-virtual {v0}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v7

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    invoke-static {v7, v9}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_12

    :cond_11
    invoke-static {v8, v0, v8, v10}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_12
    invoke-static {v0, v1, v11}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual/range {p1 .. p1}, Lhz0/c;->a()Ljava/lang/String;

    move-result-object v7

    const/4 v8, 0x6

    if-nez v7, :cond_13

    const v7, -0x372e280a

    invoke-virtual {v0, v7}, Lp1/q;->e0(I)V

    const/4 v12, 0x0

    invoke-virtual {v0, v12}, Lp1/q;->q(Z)V

    move-object/from16 p0, v1

    move-object/from16 v33, v3

    move-object/from16 v38, v4

    move-object/from16 v37, v5

    move-object/from16 v30, v6

    move-object/from16 v40, v10

    move v1, v12

    move-object/from16 v39, v14

    move-object v3, v0

    move v0, v15

    goto/16 :goto_9

    :cond_13
    const/4 v12, 0x0

    const v7, -0x372e2809

    invoke-virtual {v0, v7}, Lp1/q;->e0(I)V

    move-object v7, v3

    invoke-virtual/range {p1 .. p1}, Lhz0/c;->a()Ljava/lang/String;

    move-result-object v3

    sget-object v9, Lx81/d;->a:Lx81/d;

    invoke-virtual {v9, v0, v8}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v11

    invoke-virtual {v11}, Lb91/d;->L()Lb91/a;

    move-result-object v23

    invoke-virtual {v9, v0, v8}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v9

    invoke-virtual {v9}, Ly81/i;->y()J

    move-result-wide v16

    const/16 v27, 0x0

    const v28, 0x2fffa

    move-object v9, v4

    const/4 v4, 0x0

    move-object v11, v7

    move v13, v8

    const-wide/16 v7, 0x0

    move-object/from16 v18, v9

    const/4 v9, 0x0

    move-object/from16 v19, v10

    const/4 v10, 0x0

    move-object/from16 v20, v11

    const/4 v11, 0x0

    move/from16 v22, v12

    move/from16 v21, v13

    const-wide/16 v12, 0x0

    move-object/from16 v24, v14

    const/4 v14, 0x0

    move/from16 v25, v15

    const/4 v15, 0x0

    move-object/from16 v26, v5

    move-object/from16 v30, v6

    move-wide/from16 v5, v16

    const-wide/16 v16, 0x0

    move-object/from16 v31, v18

    const/16 v18, 0x0

    move-object/from16 v32, v19

    const/16 v19, 0x0

    move-object/from16 v33, v20

    const/16 v20, 0x0

    move/from16 v34, v21

    const/16 v21, 0x0

    move/from16 v35, v22

    const/16 v22, 0x0

    move-object/from16 v36, v24

    const/16 v24, 0x0

    move-object/from16 v37, v26

    const/16 v26, 0x0

    move/from16 p0, v25

    move-object/from16 v25, v0

    move/from16 v0, p0

    move-object/from16 p0, v1

    move-object/from16 v38, v31

    move-object/from16 v40, v32

    move/from16 v1, v35

    move-object/from16 v39, v36

    invoke-static/range {v3 .. v28}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v3, v25

    invoke-virtual {v3, v1}, Lp1/q;->q(Z)V

    :goto_9
    invoke-virtual/range {p1 .. p1}, Lhz0/c;->b()Ljava/lang/String;

    move-result-object v4

    if-nez v4, :cond_14

    const v4, -0x372976e9

    invoke-virtual {v3, v4}, Lp1/q;->e0(I)V

    invoke-virtual {v3, v1}, Lp1/q;->q(Z)V

    goto :goto_a

    :cond_14
    const v4, -0x372976e8    # -439368.75f

    invoke-virtual {v3, v4}, Lp1/q;->e0(I)V

    invoke-virtual/range {p1 .. p1}, Lhz0/c;->b()Ljava/lang/String;

    move-result-object v4

    sget-object v5, Lx81/d;->a:Lx81/d;

    const/4 v13, 0x6

    invoke-virtual {v5, v3, v13}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v6

    invoke-virtual {v6}, Lb91/d;->c()Lb91/a;

    move-result-object v23

    invoke-virtual {v5, v3, v13}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v5

    invoke-virtual {v5}, Ly81/i;->c1()J

    move-result-wide v5

    const/16 v27, 0x0

    const v28, 0x2fffa

    move-object/from16 v25, v3

    move-object v3, v4

    const/4 v4, 0x0

    const-wide/16 v7, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const-wide/16 v12, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const-wide/16 v16, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v24, 0x0

    const/16 v26, 0x0

    invoke-static/range {v3 .. v28}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v3, v25

    invoke-virtual {v3, v1}, Lp1/q;->q(Z)V

    :goto_a
    invoke-virtual {v3, v0}, Lp1/q;->q(Z)V

    move-object/from16 v4, v37

    invoke-static {v4, v2, v3, v1}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v2

    iget-wide v4, v3, Lp1/q;->T:J

    invoke-static {v4, v5}, Ljava/lang/Long;->hashCode(J)I

    move-result v4

    invoke-virtual {v3}, Lp1/q;->m()Lp1/p1;

    move-result-object v5

    move-object/from16 v6, v30

    invoke-static {v3, v6}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v6

    invoke-virtual {v3}, Lp1/q;->i0()V

    iget-boolean v7, v3, Lp1/q;->S:Z

    if-eqz v7, :cond_15

    move-object/from16 v11, v33

    invoke-virtual {v3, v11}, Lp1/q;->l(Lc93/a;)V

    :goto_b
    move-object/from16 v9, v38

    goto :goto_c

    :cond_15
    invoke-virtual {v3}, Lp1/q;->s0()V

    goto :goto_b

    :goto_c
    invoke-static {v3, v9, v2}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    move-object/from16 v2, v39

    invoke-static {v3, v2, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v2, v3, Lp1/q;->S:Z

    if-nez v2, :cond_16

    invoke-virtual {v3}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-static {v2, v5}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_17

    :cond_16
    move-object/from16 v2, v40

    goto :goto_e

    :cond_17
    :goto_d
    move-object/from16 v2, p0

    goto :goto_f

    :goto_e
    invoke-static {v4, v3, v4, v2}, Ld;->y(ILp1/q;ILa3/i;)V

    goto :goto_d

    :goto_f
    invoke-static {v3, v2, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual/range {p1 .. p1}, Lhz0/c;->e()Ljava/lang/String;

    move-result-object v2

    if-nez v2, :cond_18

    const v2, 0x76e6c39e

    invoke-virtual {v3, v2}, Lp1/q;->e0(I)V

    invoke-virtual {v3, v1}, Lp1/q;->q(Z)V

    goto :goto_10

    :cond_18
    const v2, 0x76e6c39f

    invoke-virtual {v3, v2}, Lp1/q;->e0(I)V

    invoke-virtual/range {p1 .. p1}, Lhz0/c;->e()Ljava/lang/String;

    move-result-object v2

    sget-object v4, Lx81/d;->a:Lx81/d;

    const/4 v13, 0x6

    invoke-virtual {v4, v3, v13}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v5

    invoke-virtual {v5}, Lb91/d;->L()Lb91/a;

    move-result-object v23

    invoke-virtual {v4, v3, v13}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v4

    invoke-virtual {v4}, Ly81/i;->y()J

    move-result-wide v5

    const/16 v27, 0x0

    const v28, 0x2fffa

    const/4 v4, 0x0

    const-wide/16 v7, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const-wide/16 v12, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const-wide/16 v16, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v24, 0x0

    const/16 v26, 0x0

    move-object/from16 v25, v3

    move-object v3, v2

    invoke-static/range {v3 .. v28}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v3, v25

    invoke-virtual {v3, v1}, Lp1/q;->q(Z)V

    :goto_10
    invoke-virtual/range {p1 .. p1}, Lhz0/c;->f()Ljava/lang/String;

    move-result-object v2

    if-nez v2, :cond_19

    const v2, 0x76eb7c7f

    invoke-virtual {v3, v2}, Lp1/q;->e0(I)V

    invoke-virtual {v3, v1}, Lp1/q;->q(Z)V

    goto :goto_11

    :cond_19
    const v2, 0x76eb7c80

    invoke-virtual {v3, v2}, Lp1/q;->e0(I)V

    invoke-virtual/range {p1 .. p1}, Lhz0/c;->f()Ljava/lang/String;

    move-result-object v2

    sget-object v4, Lx81/d;->a:Lx81/d;

    const/4 v13, 0x6

    invoke-virtual {v4, v3, v13}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v5

    invoke-virtual {v5}, Lb91/d;->c()Lb91/a;

    move-result-object v23

    invoke-virtual {v4, v3, v13}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v4

    invoke-virtual {v4}, Ly81/i;->c1()J

    move-result-wide v5

    const/16 v27, 0x0

    const v28, 0x2fffa

    const/4 v4, 0x0

    const-wide/16 v7, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const-wide/16 v12, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const-wide/16 v16, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v24, 0x0

    const/16 v26, 0x0

    move-object/from16 v25, v3

    move-object v3, v2

    invoke-static/range {v3 .. v28}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v3, v25

    invoke-virtual {v3, v1}, Lp1/q;->q(Z)V

    :goto_11
    invoke-static {v3, v0, v0, v1}, Lm4/a;->y(Lp1/q;ZZZ)V

    goto :goto_12

    :cond_1a
    move-object v3, v0

    move v0, v15

    const/4 v1, 0x0

    const v2, -0x3d89988

    invoke-virtual {v3, v2}, Lp1/q;->e0(I)V

    invoke-virtual {v3, v1}, Lp1/q;->q(Z)V

    :goto_12
    invoke-virtual {v3, v0}, Lp1/q;->q(Z)V

    move-object/from16 v1, v29

    goto :goto_13

    :cond_1b
    move-object v3, v0

    invoke-virtual {v3}, Lp1/q;->X()V

    move-object v1, v5

    :goto_13
    invoke-virtual {v3}, Lp1/q;->u()Lp1/v1;

    move-result-object v6

    if-eqz v6, :cond_1c

    new-instance v0, Lfc0/e;

    const/16 v5, 0x19

    move-object/from16 v2, p1

    move/from16 v3, p3

    move/from16 v4, p4

    invoke-direct/range {v0 .. v5}, Lfc0/e;-><init>(Landroidx/compose/ui/Modifier;Ljava/lang/Object;III)V

    iput-object v0, v6, Lp1/v1;->d:Lc93/m;

    :cond_1c
    return-void
.end method

.method private static final d(Landroidx/compose/ui/Modifier;Lhz0/c;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, Lp1/x;->L(I)I

    move-result p2

    invoke-static {p0, p1, p4, p2, p3}, Lhz0/b;->c(Landroidx/compose/ui/Modifier;Lhz0/c;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static final e(Landroidx/compose/runtime/Composer;I)V
    .locals 3

    check-cast p0, Lp1/q;

    const v0, -0x967d6e1

    invoke-virtual {p0, v0}, Lp1/q;->g0(I)Lp1/q;

    if-eqz p1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    and-int/lit8 v1, p1, 0x1

    invoke-virtual {p0, v1, v0}, Lp1/q;->U(IZ)Z

    move-result v0

    if-eqz v0, :cond_1

    new-instance v0, Lkotlin/jvm/internal/k0;

    const/16 v1, 0xa

    invoke-direct {v0, v1}, Lkotlin/jvm/internal/k0;-><init>(I)V

    invoke-static {}, Lx81/e;->s()Lp1/t1;

    move-result-object v1

    invoke-static {v1, v0}, Lc13/a;->r(Lp1/t1;Lkotlin/jvm/internal/k0;)Lp1/t1;

    move-result-object v1

    invoke-static {v1, v0}, Lc13/a;->C(Lp1/t1;Lkotlin/jvm/internal/k0;)Lp1/t1;

    move-result-object v1

    invoke-static {v1, v0}, Lc13/a;->A(Lp1/t1;Lkotlin/jvm/internal/k0;)Lp1/t1;

    move-result-object v1

    invoke-static {v1, v0}, Lc13/a;->B(Lp1/t1;Lkotlin/jvm/internal/k0;)Lp1/t1;

    move-result-object v1

    sget-object v2, Lm83/a0;->w:Lm83/a0;

    invoke-static {v2, v1, v0}, Lc13/a;->p(Lm83/a0;Lp1/t1;Lkotlin/jvm/internal/k0;)Lp1/t1;

    move-result-object v1

    invoke-static {v2, v1, v0}, Lc13/a;->z(Lm83/a0;Lp1/t1;Lkotlin/jvm/internal/k0;)Lp1/t1;

    move-result-object v1

    sget-object v2, Lfy1/i;->a:Lfy1/i;

    invoke-static {v1, v2, v0}, Lc13/a;->q(Lp1/t1;Lfy1/i;Lkotlin/jvm/internal/k0;)Lp1/t1;

    move-result-object v1

    sget-object v2, Ldp0/i;->a:Ldp0/i;

    invoke-virtual {v1, v2}, Lp1/t1;->a(Ljava/lang/Object;)Lp1/u1;

    move-result-object v1

    invoke-virtual {v0, v1}, Lkotlin/jvm/internal/k0;->a(Ljava/lang/Object;)V

    sget-object v1, Lb3/v1;->l:Lp1/u2;

    iget-object v2, v0, Lkotlin/jvm/internal/k0;->a:Ljava/util/ArrayList;

    invoke-static {v1, v0, v2}, Lc13/a;->g(Lp1/u2;Lkotlin/jvm/internal/k0;Ljava/util/ArrayList;)I

    move-result v0

    new-array v0, v0, [Lp1/u1;

    invoke-virtual {v2, v0}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lp1/u1;

    new-instance v1, Lhz0/b$a;

    invoke-direct {v1}, Lhz0/b$a;-><init>()V

    const v2, -0x124c2861

    invoke-static {v2, p0, v1}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v1

    const/16 v2, 0x38

    invoke-static {v0, v1, p0, v2}, Lp1/x;->b([Lp1/u1;Lc93/m;Landroidx/compose/runtime/Composer;I)V

    goto :goto_1

    :cond_1
    invoke-virtual {p0}, Lp1/q;->X()V

    :goto_1
    invoke-virtual {p0}, Lp1/q;->u()Lp1/v1;

    move-result-object p0

    if-eqz p0, :cond_2

    new-instance v0, Lhy0/e0;

    const/4 v1, 0x3

    invoke-direct {v0, p1, v1}, Lhy0/e0;-><init>(II)V

    iput-object v0, p0, Lp1/v1;->d:Lc93/m;

    :cond_2
    return-void
.end method

.method private static final f(ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p0, p0, 0x1

    invoke-static {p0}, Lp1/x;->L(I)I

    move-result p0

    invoke-static {p1, p0}, Lhz0/b;->e(Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static final g(Lhz0/c;)Z
    .locals 1

    const-string v0, "state"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lhz0/c;->a()Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_1

    invoke-virtual {p0}, Lhz0/c;->b()Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_1

    invoke-virtual {p0}, Lhz0/c;->e()Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_1

    invoke-virtual {p0}, Lhz0/c;->f()Ljava/lang/String;

    move-result-object p0

    if-eqz p0, :cond_0

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    return p0

    :cond_1
    :goto_0
    const/4 p0, 0x1

    return p0
.end method
