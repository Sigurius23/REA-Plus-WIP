.class public abstract Lh81/b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u001a!\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u0002H\u0007\u00a2\u0006\u0004\u0008\u0005\u0010\u0006\u00a8\u0006\u0007"
    }
    d2 = {
        "Lh81/c;",
        "viewState",
        "Landroidx/compose/ui/Modifier;",
        "modifier",
        "Ll83/a0;",
        "b",
        "(Lh81/c;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V",
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
.method public static synthetic a(Lh81/c;Landroidx/compose/ui/Modifier;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p5}, Lh81/b;->c(Lh81/c;Landroidx/compose/ui/Modifier;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final b(Lh81/c;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V
    .locals 34

    move-object/from16 v1, p0

    const/high16 v0, 0x3f800000    # 1.0f

    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v23

    const-string v2, "viewState"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v6, p2

    check-cast v6, Lp1/q;

    const v2, 0x28e4acb9

    invoke-virtual {v6, v2}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v2, p3, 0x6

    const/4 v3, 0x2

    const/4 v13, 0x4

    if-nez v2, :cond_1

    invoke-virtual {v6, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    move v2, v13

    goto :goto_0

    :cond_0
    move v2, v3

    :goto_0
    or-int v2, p3, v2

    goto :goto_1

    :cond_1
    move/from16 v2, p3

    :goto_1
    and-int/lit8 v4, p4, 0x2

    if-eqz v4, :cond_3

    or-int/lit8 v2, v2, 0x30

    :cond_2
    move-object/from16 v5, p1

    goto :goto_3

    :cond_3
    and-int/lit8 v5, p3, 0x30

    if-nez v5, :cond_2

    move-object/from16 v5, p1

    invoke-virtual {v6, v5}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_4

    const/16 v7, 0x20

    goto :goto_2

    :cond_4
    const/16 v7, 0x10

    :goto_2
    or-int/2addr v2, v7

    :goto_3
    and-int/lit8 v7, v2, 0x13

    const/16 v8, 0x12

    const/4 v14, 0x1

    const/4 v15, 0x0

    if-eq v7, v8, :cond_5

    move v7, v14

    goto :goto_4

    :cond_5
    move v7, v15

    :goto_4
    and-int/2addr v2, v14

    invoke-virtual {v6, v2, v7}, Lp1/q;->U(IZ)Z

    move-result v2

    if-eqz v2, :cond_11

    sget-object v2, Lb2/t;->w:Lb2/t;

    if-eqz v4, :cond_6

    move-object v9, v2

    goto :goto_5

    :cond_6
    move-object v9, v5

    :goto_5
    invoke-static {v0, v9}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    int-to-float v3, v3

    const/16 v4, 0x8

    int-to-float v10, v4

    mul-float/2addr v3, v10

    invoke-static {v3}, Ll0/m;->i(F)Ll0/k;

    move-result-object v3

    sget-object v4, Lb2/e;->K:Lb2/l;

    const/16 v5, 0x36

    invoke-static {v3, v4, v6, v5}, Ll0/p1;->a(Ll0/i;Lb2/g;Landroidx/compose/runtime/Composer;I)Ll0/r1;

    move-result-object v3

    iget-wide v4, v6, Lp1/q;->T:J

    invoke-static {v4, v5}, Ljava/lang/Long;->hashCode(J)I

    move-result v4

    invoke-virtual {v6}, Lp1/q;->m()Lp1/p1;

    move-result-object v5

    invoke-static {v6, v0}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    sget-object v7, La3/l;->a:La3/k;

    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v11, La3/k;->b:La3/j;

    invoke-virtual {v6}, Lp1/q;->i0()V

    iget-boolean v7, v6, Lp1/q;->S:Z

    if-eqz v7, :cond_7

    invoke-virtual {v6, v11}, Lp1/q;->l(Lc93/a;)V

    goto :goto_6

    :cond_7
    invoke-virtual {v6}, Lp1/q;->s0()V

    :goto_6
    sget-object v12, La3/k;->g:La3/i;

    invoke-static {v6, v12, v3}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v3, La3/k;->f:La3/i;

    invoke-static {v6, v3, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v5, La3/k;->j:La3/i;

    iget-boolean v7, v6, Lp1/q;->S:Z

    if-nez v7, :cond_8

    invoke-virtual {v6}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v7

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    invoke-static {v7, v8}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_9

    :cond_8
    invoke-static {v4, v6, v4, v5}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_9
    sget-object v4, La3/k;->d:La3/i;

    invoke-static {v6, v4, v0}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    move-object v0, v3

    invoke-virtual {v1}, Lh81/c;->b()Lkd1/o;

    move-result-object v3

    const/16 v7, 0xc

    if-nez v3, :cond_a

    const v3, -0x26ff77d

    invoke-virtual {v6, v3}, Lp1/q;->e0(I)V

    invoke-virtual {v6, v15}, Lp1/q;->q(Z)V

    const/4 v3, 0x0

    move-object/from16 v28, v4

    move-object v14, v5

    move-object/from16 v29, v9

    move/from16 v17, v10

    move-object/from16 v30, v11

    move-object/from16 v31, v12

    move-object v4, v3

    move v3, v15

    move v15, v7

    goto :goto_7

    :cond_a
    const v8, -0x26ff77c

    invoke-virtual {v6, v8}, Lp1/q;->e0(I)V

    move v8, v7

    const/4 v7, 0x0

    move/from16 v16, v8

    const/4 v8, 0x3

    move-object/from16 v17, v4

    const/4 v4, 0x0

    move-object/from16 v18, v5

    const/4 v5, 0x0

    move/from16 v15, v16

    move-object/from16 v28, v17

    move-object/from16 v14, v18

    invoke-static/range {v3 .. v8}, Lkd1/p;->i(Lkd1/o;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)Ln2/a;

    move-result-object v3

    int-to-float v4, v15

    int-to-float v5, v13

    mul-float/2addr v4, v5

    invoke-static {v4, v2}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v5

    move-object v4, v11

    const/16 v11, 0x61b0

    move-object v7, v12

    const/16 v12, 0x68

    move-object v8, v4

    const/4 v4, 0x0

    move-object/from16 v24, v6

    const/4 v6, 0x0

    move-object/from16 v17, v7

    sget-object v7, Ly2/j;->b:Ly2/b1;

    move-object/from16 v18, v8

    const/4 v8, 0x0

    move-object/from16 v19, v9

    const/4 v9, 0x0

    move-object/from16 v31, v17

    move-object/from16 v30, v18

    move-object/from16 v29, v19

    move/from16 v17, v10

    move-object/from16 v10, v24

    invoke-static/range {v3 .. v12}, Lpf/c;->c(Ln2/a;Ljava/lang/String;Landroidx/compose/ui/Modifier;Lb2/h;Ly2/k;FLi2/y;Landroidx/compose/runtime/Composer;II)V

    move-object v6, v10

    const/4 v3, 0x0

    invoke-virtual {v6, v3}, Lp1/q;->q(Z)V

    sget-object v4, Ll83/a0;->a:Ll83/a0;

    :goto_7
    const/4 v11, 0x6

    if-nez v4, :cond_c

    const v4, -0x26bc2f6

    invoke-virtual {v6, v4}, Lp1/q;->e0(I)V

    invoke-virtual {v1}, Lh81/c;->a()Lgz0/m0;

    move-result-object v5

    if-nez v5, :cond_b

    const v4, -0x26bc2f7

    invoke-virtual {v6, v4}, Lp1/q;->e0(I)V

    invoke-virtual {v6, v3}, Lp1/q;->q(Z)V

    goto :goto_8

    :cond_b
    invoke-static {v6, v4, v5, v6, v11}, Lih0/d0;->s(Lp1/q;ILgz0/m0;Lp1/q;I)Lo2/e;

    move-result-object v3

    sget-object v4, Lx81/d;->a:Lx81/d;

    invoke-virtual {v4, v6, v11}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v4

    invoke-virtual {v4}, Ly81/i;->b1()J

    move-result-wide v4

    int-to-float v7, v15

    int-to-float v8, v13

    mul-float/2addr v7, v8

    invoke-static {v7, v2}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v7

    const/16 v9, 0x1b0

    const/4 v10, 0x0

    move-object/from16 v24, v6

    move-wide/from16 v32, v4

    move-object v5, v7

    move-wide/from16 v6, v32

    const/4 v4, 0x0

    move-object/from16 v8, v24

    invoke-static/range {v3 .. v10}, Lg1/f3;->b(Lo2/e;Ljava/lang/String;Landroidx/compose/ui/Modifier;JLandroidx/compose/runtime/Composer;II)V

    move-object v6, v8

    const/4 v3, 0x0

    invoke-virtual {v6, v3}, Lp1/q;->q(Z)V

    :goto_8
    invoke-virtual {v6, v3}, Lp1/q;->q(Z)V

    goto :goto_9

    :cond_c
    const v4, -0x1421a2

    invoke-virtual {v6, v4}, Lp1/q;->e0(I)V

    invoke-virtual {v6, v3}, Lp1/q;->q(Z)V

    :goto_9
    const-wide/high16 v3, 0x3fe0000000000000L    # 0.5

    double-to-float v3, v3

    mul-float v9, v3, v17

    invoke-static {v9}, Ll0/m;->i(F)Ll0/k;

    move-result-object v3

    sget-object v4, Lb2/e;->M:Lb2/k;

    invoke-static {v3, v4, v6, v11}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v3

    iget-wide v4, v6, Lp1/q;->T:J

    invoke-static {v4, v5}, Ljava/lang/Long;->hashCode(J)I

    move-result v4

    invoke-virtual {v6}, Lp1/q;->m()Lp1/p1;

    move-result-object v5

    invoke-static {v6, v2}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v7

    invoke-virtual {v6}, Lp1/q;->i0()V

    iget-boolean v8, v6, Lp1/q;->S:Z

    if-eqz v8, :cond_d

    move-object/from16 v8, v30

    invoke-virtual {v6, v8}, Lp1/q;->l(Lc93/a;)V

    :goto_a
    move-object/from16 v8, v31

    goto :goto_b

    :cond_d
    invoke-virtual {v6}, Lp1/q;->s0()V

    goto :goto_a

    :goto_b
    invoke-static {v6, v8, v3}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v6, v0, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v0, v6, Lp1/q;->S:Z

    if-nez v0, :cond_f

    invoke-virtual {v6}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v0

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-static {v0, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_e

    goto :goto_d

    :cond_e
    :goto_c
    move-object/from16 v0, v28

    goto :goto_e

    :cond_f
    :goto_d
    invoke-static {v4, v6, v4, v14}, Ld;->y(ILp1/q;ILa3/i;)V

    goto :goto_c

    :goto_e
    invoke-static {v6, v0, v7}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual {v1}, Lh81/c;->e()Lhy0/h1;

    move-result-object v3

    if-nez v3, :cond_10

    const v0, -0x2947b4c8

    invoke-virtual {v6, v0}, Lp1/q;->e0(I)V

    const/4 v0, 0x0

    invoke-virtual {v6, v0}, Lp1/q;->q(Z)V

    goto :goto_f

    :cond_10
    const/4 v0, 0x0

    const v4, -0x2947b4c7

    invoke-virtual {v6, v4}, Lp1/q;->e0(I)V

    const/4 v7, 0x0

    const/4 v8, 0x6

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-static/range {v3 .. v8}, Lhy0/g1;->h(Lhy0/h1;Landroidx/compose/ui/Modifier;Lc93/a;Landroidx/compose/runtime/Composer;II)V

    invoke-static {v2, v9, v6, v0}, Lq63/c;->u(Lb2/t;FLp1/q;Z)V

    :goto_f
    invoke-virtual {v1}, Lh81/c;->f()Lsz0/c0;

    move-result-object v2

    invoke-virtual {v2}, Lsz0/c0;->m()Ljava/lang/String;

    move-result-object v2

    sget-object v3, Lb91/c;->Companion:Lb91/c$a;

    invoke-virtual {v1}, Lh81/c;->f()Lsz0/c0;

    move-result-object v4

    invoke-virtual {v4}, Lsz0/c0;->l()Lb91/c;

    move-result-object v4

    invoke-virtual {v3, v4}, Lb91/c$a;->a(Lb91/c;)Lb91/a;

    move-result-object v22

    invoke-virtual {v1}, Lh81/c;->f()Lsz0/c0;

    move-result-object v4

    invoke-virtual {v4}, Lsz0/c0;->e()Ly81/f;

    move-result-object v4

    invoke-virtual {v4, v6, v0}, Ly81/f;->toComposableColor-WaAFU9c(Landroidx/compose/runtime/Composer;I)J

    move-result-wide v4

    const/high16 v26, 0xc00000

    const v27, 0xfffa

    move-object v7, v3

    const/4 v3, 0x0

    move-object/from16 v24, v6

    move-object v8, v7

    const-wide/16 v6, 0x0

    move-object v9, v8

    const/4 v8, 0x0

    move-object v10, v9

    const/4 v9, 0x0

    move-object v11, v10

    const/4 v10, 0x0

    move-object v13, v11

    const-wide/16 v11, 0x0

    move-object v14, v13

    const/4 v13, 0x0

    move-object v15, v14

    const/4 v14, 0x0

    move-object/from16 v17, v15

    const-wide/16 v15, 0x0

    move-object/from16 v18, v17

    const/16 v17, 0x0

    move-object/from16 v19, v18

    const/16 v18, 0x0

    move-object/from16 v20, v19

    const/16 v19, 0x0

    move-object/from16 v21, v20

    const/16 v20, 0x0

    move-object/from16 v25, v21

    const/16 v21, 0x0

    move-object/from16 v28, v25

    const/16 v25, 0x0

    move v1, v0

    move-object/from16 v0, v28

    invoke-static/range {v2 .. v27}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v6, v24

    invoke-virtual/range {p0 .. p0}, Lh81/c;->c()Lsz0/c0;

    move-result-object v2

    invoke-virtual {v2}, Lsz0/c0;->m()Ljava/lang/String;

    move-result-object v2

    invoke-virtual/range {p0 .. p0}, Lh81/c;->c()Lsz0/c0;

    move-result-object v3

    invoke-virtual {v3}, Lsz0/c0;->l()Lb91/c;

    move-result-object v3

    invoke-virtual {v0, v3}, Lb91/c$a;->a(Lb91/c;)Lb91/a;

    move-result-object v22

    invoke-virtual/range {p0 .. p0}, Lh81/c;->c()Lsz0/c0;

    move-result-object v0

    invoke-virtual {v0}, Lsz0/c0;->e()Ly81/f;

    move-result-object v0

    invoke-virtual {v0, v6, v1}, Ly81/f;->toComposableColor-WaAFU9c(Landroidx/compose/runtime/Composer;I)J

    move-result-wide v4

    const/4 v3, 0x0

    const-wide/16 v6, 0x0

    invoke-static/range {v2 .. v27}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v6, v24

    const/4 v0, 0x1

    invoke-virtual {v6, v0}, Lp1/q;->q(Z)V

    invoke-virtual {v6, v0}, Lp1/q;->q(Z)V

    move-object/from16 v3, v29

    goto :goto_10

    :cond_11
    invoke-virtual {v6}, Lp1/q;->X()V

    move-object v3, v5

    :goto_10
    invoke-virtual {v6}, Lp1/q;->u()Lp1/v1;

    move-result-object v6

    if-eqz v6, :cond_12

    new-instance v0, Lfc0/e;

    const/16 v5, 0x11

    move-object/from16 v1, p0

    move/from16 v2, p3

    move/from16 v4, p4

    invoke-direct/range {v0 .. v5}, Lfc0/e;-><init>(Ljava/lang/Object;ILjava/lang/Object;II)V

    iput-object v0, v6, Lp1/v1;->d:Lc93/m;

    :cond_12
    return-void
.end method

.method private static final c(Lh81/c;Landroidx/compose/ui/Modifier;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, Lp1/x;->L(I)I

    move-result p2

    invoke-static {p0, p1, p4, p2, p3}, Lh81/b;->b(Lh81/c;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method
