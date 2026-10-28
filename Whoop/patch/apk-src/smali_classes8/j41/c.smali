.class public abstract Lj41/c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u001a7\u0010\u0008\u001a\u00020\u00062\u0008\u0008\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0014\u0008\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0007\u00a2\u0006\u0004\u0008\u0008\u0010\t\u00a8\u0006\n"
    }
    d2 = {
        "Landroidx/compose/ui/Modifier;",
        "modifier",
        "Lok1/a;",
        "viewState",
        "Lkotlin/Function1;",
        "",
        "Ll83/a0;",
        "onViewEvent",
        "c",
        "(Landroidx/compose/ui/Modifier;Lok1/a;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V",
        "healthspan_release"
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
.method public static synthetic a(Landroidx/compose/ui/Modifier;Lok1/a;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p6}, Lj41/c;->e(Landroidx/compose/ui/Modifier;Lok1/a;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Ljava/lang/Object;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lj41/c;->d(Ljava/lang/Object;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final c(Landroidx/compose/ui/Modifier;Lok1/a;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V
    .locals 46
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/ui/Modifier;",
            "Lok1/a;",
            "Lkotlin/jvm/functions/Function1;",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    move-object/from16 v5, p1

    move/from16 v1, p4

    const-string v0, "viewState"

    invoke-static {v5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v10, p3

    check-cast v10, Lp1/q;

    const v0, -0x355a7da5    # -5423405.5f

    invoke-virtual {v10, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, p5, 0x1

    if-eqz v0, :cond_0

    or-int/lit8 v4, v1, 0x6

    move v6, v4

    move-object/from16 v4, p0

    goto :goto_1

    :cond_0
    and-int/lit8 v4, v1, 0x6

    if-nez v4, :cond_2

    move-object/from16 v4, p0

    invoke-virtual {v10, v4}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_1

    const/4 v6, 0x4

    goto :goto_0

    :cond_1
    const/4 v6, 0x2

    :goto_0
    or-int/2addr v6, v1

    goto :goto_1

    :cond_2
    move-object/from16 v4, p0

    move v6, v1

    :goto_1
    and-int/lit8 v7, v1, 0x30

    if-nez v7, :cond_4

    invoke-virtual {v10, v5}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_3

    const/16 v7, 0x20

    goto :goto_2

    :cond_3
    const/16 v7, 0x10

    :goto_2
    or-int/2addr v6, v7

    :cond_4
    and-int/lit8 v7, p5, 0x4

    if-eqz v7, :cond_6

    or-int/lit16 v6, v6, 0x180

    :cond_5
    move-object/from16 v8, p2

    goto :goto_4

    :cond_6
    and-int/lit16 v8, v1, 0x180

    if-nez v8, :cond_5

    move-object/from16 v8, p2

    invoke-virtual {v10, v8}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_7

    const/16 v9, 0x100

    goto :goto_3

    :cond_7
    const/16 v9, 0x80

    :goto_3
    or-int/2addr v6, v9

    :goto_4
    and-int/lit16 v9, v6, 0x93

    const/16 v11, 0x92

    const/4 v12, 0x0

    const/4 v13, 0x1

    if-eq v9, v11, :cond_8

    move v9, v13

    goto :goto_5

    :cond_8
    move v9, v12

    :goto_5
    and-int/lit8 v11, v6, 0x1

    invoke-virtual {v10, v11, v9}, Lp1/q;->U(IZ)Z

    move-result v9

    if-eqz v9, :cond_22

    sget-object v9, Lb2/t;->w:Lb2/t;

    if-eqz v0, :cond_9

    move-object v4, v9

    :cond_9
    if-eqz v7, :cond_b

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v0

    sget-object v7, Lp1/l;->a:Lp1/v0;

    if-ne v0, v7, :cond_a

    new-instance v0, Liz0/d;

    const/16 v7, 0x14

    invoke-direct {v0, v7}, Liz0/d;-><init>(I)V

    invoke-virtual {v10, v0}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_a
    check-cast v0, Lkotlin/jvm/functions/Function1;

    goto :goto_6

    :cond_b
    move-object v0, v8

    :goto_6
    invoke-virtual {v5}, Lok1/a;->c()Ljava/util/List;

    move-result-object v7

    check-cast v7, Ljava/lang/Iterable;

    instance-of v8, v7, Ljava/util/Collection;

    if-eqz v8, :cond_d

    move-object v8, v7

    check-cast v8, Ljava/util/Collection;

    invoke-interface {v8}, Ljava/util/Collection;->isEmpty()Z

    move-result v8

    if-eqz v8, :cond_d

    :cond_c
    move/from16 v32, v12

    goto :goto_7

    :cond_d
    invoke-interface {v7}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v7

    :cond_e
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    if-eqz v8, :cond_c

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lm91/u;

    instance-of v8, v8, Lik1/e;

    if-eqz v8, :cond_e

    move/from16 v32, v13

    :goto_7
    const/16 v7, 0xa

    int-to-float v7, v7

    const/4 v8, 0x0

    invoke-static {v4, v8, v7, v13}, Landroidx/compose/foundation/layout/a;->r(Landroidx/compose/ui/Modifier;FFI)Landroidx/compose/ui/Modifier;

    move-result-object v11

    const/high16 v14, 0x3f800000    # 1.0f

    invoke-static {v14, v11}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v11

    sget-object v15, Ll0/m;->c:Ll0/g;

    sget-object v13, Lb2/e;->M:Lb2/k;

    invoke-static {v15, v13, v10, v12}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v13

    iget-wide v2, v10, Lp1/q;->T:J

    invoke-static {v2, v3}, Ljava/lang/Long;->hashCode(J)I

    move-result v2

    invoke-virtual {v10}, Lp1/q;->m()Lp1/p1;

    move-result-object v3

    invoke-static {v10, v11}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v11

    sget-object v17, La3/l;->a:La3/k;

    invoke-virtual/range {v17 .. v17}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move/from16 v17, v7

    sget-object v7, La3/k;->b:La3/j;

    invoke-virtual {v10}, Lp1/q;->i0()V

    iget-boolean v12, v10, Lp1/q;->S:Z

    if-eqz v12, :cond_f

    invoke-virtual {v10, v7}, Lp1/q;->l(Lc93/a;)V

    goto :goto_8

    :cond_f
    invoke-virtual {v10}, Lp1/q;->s0()V

    :goto_8
    sget-object v12, La3/k;->g:La3/i;

    invoke-static {v10, v12, v13}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v13, La3/k;->f:La3/i;

    invoke-static {v10, v13, v3}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v3, La3/k;->j:La3/i;

    iget-boolean v15, v10, Lp1/q;->S:Z

    if-nez v15, :cond_10

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v15

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    invoke-static {v15, v8}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_11

    :cond_10
    invoke-static {v2, v10, v2, v3}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_11
    sget-object v2, La3/k;->d:La3/i;

    invoke-static {v10, v2, v11}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v14, v9}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v19

    const/16 v8, 0xc

    int-to-float v8, v8

    const/16 v24, 0x7

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    move/from16 v23, v8

    invoke-static/range {v19 .. v24}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v8

    const/4 v11, 0x4

    int-to-float v11, v11

    const/4 v14, 0x0

    const/4 v15, 0x2

    invoke-static {v8, v11, v14, v15}, Landroidx/compose/foundation/layout/a;->r(Landroidx/compose/ui/Modifier;FFI)Landroidx/compose/ui/Modifier;

    move-result-object v8

    invoke-virtual {v5}, Lok1/a;->g()Ljava/lang/String;

    move-result-object v14

    if-eqz v14, :cond_12

    sget-object v14, Ll0/m;->g:Ll0/h;

    goto :goto_9

    :cond_12
    sget-object v14, Ll0/m;->b:Ll0/e;

    :goto_9
    sget-object v15, Lb2/e;->K:Lb2/l;

    move/from16 v16, v11

    const/16 v11, 0x30

    invoke-static {v14, v15, v10, v11}, Ll0/p1;->a(Ll0/i;Lb2/g;Landroidx/compose/runtime/Composer;I)Ll0/r1;

    move-result-object v14

    move-object/from16 p0, v12

    iget-wide v11, v10, Lp1/q;->T:J

    invoke-static {v11, v12}, Ljava/lang/Long;->hashCode(J)I

    move-result v11

    invoke-virtual {v10}, Lp1/q;->m()Lp1/p1;

    move-result-object v12

    invoke-static {v10, v8}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v8

    invoke-virtual {v10}, Lp1/q;->i0()V

    move-object/from16 v33, v0

    iget-boolean v0, v10, Lp1/q;->S:Z

    if-eqz v0, :cond_13

    invoke-virtual {v10, v7}, Lp1/q;->l(Lc93/a;)V

    :goto_a
    move-object/from16 v0, p0

    goto :goto_b

    :cond_13
    invoke-virtual {v10}, Lp1/q;->s0()V

    goto :goto_a

    :goto_b
    invoke-static {v10, v0, v14}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v10, v13, v12}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v12, v10, Lp1/q;->S:Z

    if-nez v12, :cond_14

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v12

    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v14

    invoke-static {v12, v14}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v12

    if-nez v12, :cond_15

    :cond_14
    invoke-static {v11, v10, v11, v3}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_15
    invoke-static {v10, v2, v8}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual {v5}, Lok1/a;->g()Ljava/lang/String;

    move-result-object v8

    const/16 v11, 0x12

    if-eqz v8, :cond_16

    const v8, -0x42dbd1d1

    invoke-virtual {v10, v8}, Lp1/q;->e0(I)V

    move v8, v6

    invoke-virtual {v5}, Lok1/a;->g()Ljava/lang/String;

    move-result-object v6

    sget-object v12, Lx81/d;->a:Lx81/d;

    sget v14, Lx81/d;->b:I

    invoke-virtual {v12, v10, v14}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v19

    invoke-virtual/range {v19 .. v19}, Lb91/d;->P()Lb91/a;

    move-result-object v26

    invoke-virtual {v12, v10, v14}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v12

    invoke-virtual {v12}, Ly81/i;->y()J

    move-result-wide v19

    sget v12, Lb91/a;->d:I

    shl-int/lit8 v30, v12, 0x12

    const v31, 0x2fffa

    move-object v12, v7

    const/4 v7, 0x0

    move-object/from16 v28, v10

    move v14, v11

    const-wide/16 v10, 0x0

    move-object/from16 v21, v12

    const/4 v12, 0x0

    move-object/from16 v22, v13

    const/4 v13, 0x0

    move/from16 v24, v14

    const/4 v14, 0x0

    move-object/from16 v27, v15

    move/from16 v25, v16

    const-wide/16 v15, 0x0

    move/from16 v29, v17

    const/16 v17, 0x0

    const/16 v34, 0x0

    const/16 v18, 0x0

    move/from16 v35, v8

    move-object/from16 v36, v9

    move-wide/from16 v8, v19

    const-wide/16 v19, 0x0

    move-object/from16 v37, v21

    const/16 v21, 0x0

    move-object/from16 v38, v22

    const/16 v22, 0x0

    move/from16 v39, v23

    const/16 v23, 0x0

    move/from16 v40, v24

    const/16 v24, 0x0

    move/from16 v41, v25

    const/16 v25, 0x0

    move-object/from16 v42, v27

    const/16 v27, 0x0

    move/from16 v43, v29

    const/16 v29, 0x0

    move-object v5, v0

    move-object/from16 p0, v2

    move-object/from16 p2, v3

    move/from16 v3, v34

    move-object/from16 v2, v36

    move-object/from16 v1, v37

    move/from16 v44, v41

    move-object/from16 v0, v42

    move-object/from16 v34, v4

    move-object/from16 v4, v38

    invoke-static/range {v6 .. v31}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v10, v28

    invoke-virtual {v10, v3}, Lp1/q;->q(Z)V

    goto :goto_c

    :cond_16
    move-object v5, v0

    move-object/from16 p0, v2

    move-object/from16 p2, v3

    move-object/from16 v34, v4

    move/from16 v35, v6

    move-object v1, v7

    move-object v2, v9

    move-object v4, v13

    move-object v0, v15

    move/from16 v44, v16

    move/from16 v43, v17

    move/from16 v39, v23

    const/4 v3, 0x0

    const v6, -0x42d8d253

    invoke-virtual {v10, v6}, Lp1/q;->e0(I)V

    invoke-virtual {v10, v3}, Lp1/q;->q(Z)V

    :goto_c
    sget-object v6, Ll0/m;->a:Ll0/e;

    const/16 v7, 0x30

    invoke-static {v6, v0, v10, v7}, Ll0/p1;->a(Ll0/i;Lb2/g;Landroidx/compose/runtime/Composer;I)Ll0/r1;

    move-result-object v0

    iget-wide v6, v10, Lp1/q;->T:J

    invoke-static {v6, v7}, Ljava/lang/Long;->hashCode(J)I

    move-result v6

    invoke-virtual {v10}, Lp1/q;->m()Lp1/p1;

    move-result-object v7

    invoke-static {v10, v2}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v8

    invoke-virtual {v10}, Lp1/q;->i0()V

    iget-boolean v9, v10, Lp1/q;->S:Z

    if-eqz v9, :cond_17

    invoke-virtual {v10, v1}, Lp1/q;->l(Lc93/a;)V

    goto :goto_d

    :cond_17
    invoke-virtual {v10}, Lp1/q;->s0()V

    :goto_d
    invoke-static {v10, v5, v0}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v10, v4, v7}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v0, v10, Lp1/q;->S:Z

    if-nez v0, :cond_18

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v0

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_19

    :cond_18
    move-object/from16 v0, p2

    goto :goto_f

    :cond_19
    :goto_e
    move-object/from16 v0, p0

    goto :goto_10

    :goto_f
    invoke-static {v6, v10, v6, v0}, Ld;->y(ILp1/q;ILa3/i;)V

    goto :goto_e

    :goto_10
    invoke-static {v10, v0, v8}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const/4 v0, 0x5

    const/4 v1, 0x6

    if-eqz v32, :cond_1a

    const v4, -0x3c41650

    invoke-virtual {v10, v4}, Lp1/q;->e0(I)V

    sget-object v4, Lx81/d;->a:Lx81/d;

    invoke-virtual {v4}, Lx81/d;->d()Lgz0/o0;

    move-result-object v4

    invoke-virtual {v4}, Lgz0/o0;->f()Lgz0/q;

    move-result-object v4

    invoke-virtual {v4}, Lgz0/q;->h()I

    move-result v4

    invoke-static {v4, v10, v1}, Lts/o;->S(ILandroidx/compose/runtime/Composer;I)Lo2/e;

    move-result-object v6

    move-object/from16 v28, v10

    sget-wide v9, Li2/x;->n:J

    const-wide/high16 v4, 0x401e000000000000L    # 7.5

    double-to-float v4, v4

    move/from16 v5, v39

    invoke-static {v2, v5, v4}, Landroidx/compose/foundation/layout/d;->r(Landroidx/compose/ui/Modifier;FF)Landroidx/compose/ui/Modifier;

    move-result-object v8

    const/16 v12, 0xdb0

    const/4 v13, 0x0

    const/4 v7, 0x0

    move-object/from16 v11, v28

    invoke-static/range {v6 .. v13}, Lg1/f3;->b(Lo2/e;Ljava/lang/String;Landroidx/compose/ui/Modifier;JLandroidx/compose/runtime/Composer;II)V

    move-object v10, v11

    int-to-float v4, v0

    invoke-static {v4, v2}, Landroidx/compose/foundation/layout/d;->u(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    invoke-static {v10, v4}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    invoke-virtual {v10, v3}, Lp1/q;->q(Z)V

    goto :goto_11

    :cond_1a
    const v4, -0x3bd9ed7

    invoke-virtual {v10, v4}, Lp1/q;->e0(I)V

    invoke-virtual {v10, v3}, Lp1/q;->q(Z)V

    :goto_11
    invoke-virtual/range {p1 .. p1}, Lok1/a;->e()Ljava/lang/String;

    move-result-object v4

    if-eqz v4, :cond_1b

    const v4, -0x3bc2bcf

    invoke-virtual {v10, v4}, Lp1/q;->e0(I)V

    invoke-virtual/range {p1 .. p1}, Lok1/a;->e()Ljava/lang/String;

    move-result-object v6

    sget-object v4, Lx81/d;->a:Lx81/d;

    sget v5, Lx81/d;->b:I

    invoke-virtual {v4, v10, v5}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v7

    invoke-virtual {v7}, Lb91/d;->b()Lb91/a;

    move-result-object v26

    invoke-virtual {v4, v10, v5}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v4

    invoke-virtual {v4}, Ly81/i;->c1()J

    move-result-wide v8

    sget v4, Lb91/a;->d:I

    const/16 v5, 0x12

    shl-int/lit8 v30, v4, 0x12

    const v31, 0x2fffa

    const/4 v7, 0x0

    move-object/from16 v28, v10

    const-wide/16 v10, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const-wide/16 v15, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const-wide/16 v19, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v27, 0x0

    const/16 v29, 0x0

    invoke-static/range {v6 .. v31}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v10, v28

    invoke-virtual {v10, v3}, Lp1/q;->q(Z)V

    goto :goto_12

    :cond_1b
    const/16 v5, 0x12

    const v4, -0x3b8bb37

    invoke-virtual {v10, v4}, Lp1/q;->e0(I)V

    invoke-virtual {v10, v3}, Lp1/q;->q(Z)V

    :goto_12
    invoke-virtual/range {p1 .. p1}, Lok1/a;->e()Ljava/lang/String;

    move-result-object v4

    if-eqz v4, :cond_1c

    invoke-virtual/range {p1 .. p1}, Lok1/a;->f()Ljava/lang/String;

    move-result-object v4

    if-eqz v4, :cond_1c

    const v4, -0x3b6cbb3

    invoke-virtual {v10, v4}, Lp1/q;->e0(I)V

    move/from16 v4, v43

    invoke-static {v4, v2}, Landroidx/compose/foundation/layout/d;->u(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v6

    invoke-static {v10, v6}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    int-to-float v6, v5

    move-object/from16 v14, v34

    invoke-static {v6, v14}, Landroidx/compose/foundation/layout/d;->h(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v6

    const/4 v15, 0x1

    int-to-float v7, v15

    invoke-static {v7, v6}, Landroidx/compose/foundation/layout/d;->u(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v6

    sget-object v7, Lx81/d;->a:Lx81/d;

    sget v8, Lx81/d;->b:I

    invoke-virtual {v7, v10, v8}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v7

    invoke-virtual {v7}, Ly81/i;->X0()J

    move-result-wide v7

    sget-object v9, Li2/w0;->a:Li2/v0;

    invoke-static {v6, v7, v8, v9}, Landroidx/compose/foundation/a;->c(Landroidx/compose/ui/Modifier;JLi2/a1;)Landroidx/compose/ui/Modifier;

    move-result-object v6

    invoke-static {v6, v10, v3}, Ll0/q;->a(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V

    invoke-static {v4, v2}, Landroidx/compose/foundation/layout/d;->u(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v6

    invoke-static {v10, v6}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    invoke-virtual {v10, v3}, Lp1/q;->q(Z)V

    goto :goto_13

    :cond_1c
    move-object/from16 v14, v34

    move/from16 v4, v43

    const/4 v15, 0x1

    const v6, -0x3b13937

    invoke-virtual {v10, v6}, Lp1/q;->e0(I)V

    invoke-virtual {v10, v3}, Lp1/q;->q(Z)V

    :goto_13
    if-eqz v32, :cond_1d

    const v6, -0x3b050d6

    invoke-virtual {v10, v6}, Lp1/q;->e0(I)V

    sget-object v6, Lx81/d;->a:Lx81/d;

    invoke-virtual {v6}, Lx81/d;->d()Lgz0/o0;

    move-result-object v7

    invoke-virtual {v7}, Lgz0/o0;->f()Lgz0/q;

    move-result-object v7

    invoke-virtual {v7}, Lgz0/q;->h()I

    move-result v7

    invoke-static {v7, v10, v1}, Lts/o;->S(ILandroidx/compose/runtime/Composer;I)Lo2/e;

    move-result-object v1

    sget v7, Lx81/d;->b:I

    invoke-virtual {v6, v10, v7}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v6

    invoke-virtual {v6}, Ly81/i;->b1()J

    move-result-wide v6

    const-wide/high16 v8, 0x4019000000000000L    # 6.25

    double-to-float v8, v8

    invoke-static {v2, v4, v8}, Landroidx/compose/foundation/layout/d;->r(Landroidx/compose/ui/Modifier;FF)Landroidx/compose/ui/Modifier;

    move-result-object v16

    const/16 v25, 0x0

    const v26, 0x7feff

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/high16 v22, 0x43340000    # 180.0f

    const/16 v23, 0x0

    const/16 v24, 0x0

    invoke-static/range {v16 .. v26}, Landroidx/compose/ui/graphics/a;->c(Landroidx/compose/ui/Modifier;FFFFFFLi2/a1;Li2/r;II)Landroidx/compose/ui/Modifier;

    move-result-object v8

    const/16 v12, 0x1b0

    const/4 v13, 0x0

    move-object/from16 v28, v10

    move-wide v9, v6

    const/4 v7, 0x0

    move-object v6, v1

    move-object/from16 v11, v28

    invoke-static/range {v6 .. v13}, Lg1/f3;->b(Lo2/e;Ljava/lang/String;Landroidx/compose/ui/Modifier;JLandroidx/compose/runtime/Composer;II)V

    move-object v10, v11

    int-to-float v0, v0

    invoke-static {v0, v2}, Landroidx/compose/foundation/layout/d;->u(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    invoke-static {v10, v0}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    invoke-virtual {v10, v3}, Lp1/q;->q(Z)V

    goto :goto_14

    :cond_1d
    const v0, -0x3a8d297

    invoke-virtual {v10, v0}, Lp1/q;->e0(I)V

    invoke-virtual {v10, v3}, Lp1/q;->q(Z)V

    :goto_14
    invoke-virtual/range {p1 .. p1}, Lok1/a;->f()Ljava/lang/String;

    move-result-object v0

    if-eqz v0, :cond_1e

    const v0, -0x3a75791

    invoke-virtual {v10, v0}, Lp1/q;->e0(I)V

    invoke-virtual/range {p1 .. p1}, Lok1/a;->f()Ljava/lang/String;

    move-result-object v6

    sget-object v0, Lx81/d;->a:Lx81/d;

    sget v1, Lx81/d;->b:I

    invoke-virtual {v0, v10, v1}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v4

    invoke-virtual {v4}, Lb91/d;->b()Lb91/a;

    move-result-object v26

    invoke-virtual {v0, v10, v1}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v0

    invoke-virtual {v0}, Ly81/i;->b1()J

    move-result-wide v8

    sget v0, Lb91/a;->d:I

    shl-int/lit8 v30, v0, 0x12

    const v31, 0x2fffa

    const/4 v7, 0x0

    move-object/from16 v28, v10

    const-wide/16 v10, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    move-object/from16 v34, v14

    const/4 v14, 0x0

    move/from16 v45, v15

    const-wide/16 v15, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const-wide/16 v19, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v27, 0x0

    const/16 v29, 0x0

    move/from16 v0, v45

    invoke-static/range {v6 .. v31}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v10, v28

    invoke-virtual {v10, v3}, Lp1/q;->q(Z)V

    goto :goto_15

    :cond_1e
    move-object/from16 v34, v14

    move v0, v15

    const v1, -0x3a3df77

    invoke-virtual {v10, v1}, Lp1/q;->e0(I)V

    invoke-virtual {v10, v3}, Lp1/q;->q(Z)V

    :goto_15
    invoke-virtual {v10, v0}, Lp1/q;->q(Z)V

    invoke-virtual {v10, v0}, Lp1/q;->q(Z)V

    const v1, -0x4994dcd6

    invoke-virtual {v10, v1}, Lp1/q;->e0(I)V

    invoke-virtual/range {p1 .. p1}, Lok1/a;->c()Ljava/util/List;

    move-result-object v1

    check-cast v1, Ljava/lang/Iterable;

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_16
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_21

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    move-object v6, v4

    check-cast v6, Lm91/u;

    instance-of v4, v6, Lk71/m;

    if-eqz v4, :cond_1f

    const v4, -0x6eac1679

    invoke-virtual {v10, v4}, Lp1/q;->e0(I)V

    invoke-static {}, Llk1/c;->b()Lm91/p;

    move-result-object v7

    sget v4, Lm91/p;->b:I

    shl-int/lit8 v4, v4, 0x3

    shl-int/lit8 v5, v35, 0x3

    and-int/lit16 v5, v5, 0x1c00

    or-int v11, v4, v5

    const/4 v12, 0x4

    const/4 v8, 0x0

    move-object/from16 v9, v33

    invoke-static/range {v6 .. v12}, Lm91/l;->r(Lm91/u;Lm91/p;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    int-to-float v4, v0

    const/16 v5, 0x8

    int-to-float v5, v5

    mul-float/2addr v4, v5

    invoke-static {v4, v2}, Landroidx/compose/foundation/layout/a;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    invoke-static {v10, v4}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    invoke-virtual {v10, v3}, Lp1/q;->q(Z)V

    move/from16 v5, v44

    goto :goto_17

    :cond_1f
    move-object/from16 v9, v33

    instance-of v4, v6, Lnk1/d;

    if-eqz v4, :cond_20

    const v4, -0x6ea85a13

    move/from16 v5, v44

    invoke-static {v10, v4, v5, v5, v2}, Lih0/d0;->f(Lp1/q;IFFLb2/t;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    invoke-static {v10, v4}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    invoke-static {}, Llk1/c;->b()Lm91/p;

    move-result-object v7

    sget v4, Lm91/p;->b:I

    shl-int/lit8 v4, v4, 0x3

    shl-int/lit8 v8, v35, 0x3

    and-int/lit16 v8, v8, 0x1c00

    or-int v11, v4, v8

    const/4 v12, 0x4

    const/4 v8, 0x0

    invoke-static/range {v6 .. v12}, Lm91/l;->r(Lm91/u;Lm91/p;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    invoke-virtual {v10, v3}, Lp1/q;->q(Z)V

    goto :goto_17

    :cond_20
    move/from16 v5, v44

    const v4, 0x1d768bae

    invoke-virtual {v10, v4}, Lp1/q;->e0(I)V

    invoke-static {}, Llk1/c;->b()Lm91/p;

    move-result-object v7

    sget v4, Lm91/p;->b:I

    shl-int/lit8 v4, v4, 0x3

    shl-int/lit8 v8, v35, 0x3

    and-int/lit16 v8, v8, 0x1c00

    or-int v11, v4, v8

    const/4 v12, 0x4

    const/4 v8, 0x0

    invoke-static/range {v6 .. v12}, Lm91/l;->r(Lm91/u;Lm91/p;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    invoke-virtual {v10, v3}, Lp1/q;->q(Z)V

    :goto_17
    move/from16 v44, v5

    move-object/from16 v33, v9

    goto/16 :goto_16

    :cond_21
    move-object/from16 v9, v33

    invoke-virtual {v10, v3}, Lp1/q;->q(Z)V

    invoke-virtual {v10, v0}, Lp1/q;->q(Z)V

    move-object v6, v9

    move-object/from16 v4, v34

    goto :goto_18

    :cond_22
    invoke-virtual {v10}, Lp1/q;->X()V

    move-object v6, v8

    :goto_18
    invoke-virtual {v10}, Lp1/q;->u()Lp1/v1;

    move-result-object v7

    if-eqz v7, :cond_23

    new-instance v0, Lhy0/v;

    const/16 v3, 0x1a

    move-object/from16 v5, p1

    move/from16 v1, p4

    move/from16 v2, p5

    invoke-direct/range {v0 .. v6}, Lhy0/v;-><init>(IIILandroidx/compose/ui/Modifier;Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)V

    iput-object v0, v7, Lp1/v1;->d:Lc93/m;

    :cond_23
    return-void
.end method

.method private static final d(Ljava/lang/Object;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final e(Landroidx/compose/ui/Modifier;Lok1/a;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 6

    or-int/lit8 p3, p3, 0x1

    invoke-static {p3}, Lp1/x;->L(I)I

    move-result v4

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move v5, p4

    move-object v3, p5

    invoke-static/range {v0 .. v5}, Lj41/c;->c(Landroidx/compose/ui/Modifier;Lok1/a;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method
