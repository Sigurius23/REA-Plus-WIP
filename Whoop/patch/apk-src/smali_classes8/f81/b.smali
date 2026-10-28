.class public abstract Lf81/b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u001a!\u0010\u0005\u001a\u00020\u00042\u0008\u0008\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0007\u00a2\u0006\u0004\u0008\u0005\u0010\u0006\u00a8\u0006\u0007"
    }
    d2 = {
        "Landroidx/compose/ui/Modifier;",
        "modifier",
        "Lf81/c;",
        "state",
        "Ll83/a0;",
        "b",
        "(Landroidx/compose/ui/Modifier;Lf81/c;Landroidx/compose/runtime/Composer;II)V",
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
.method public static synthetic a(Landroidx/compose/ui/Modifier;Lf81/c;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p5}, Lf81/b;->c(Landroidx/compose/ui/Modifier;Lf81/c;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final b(Landroidx/compose/ui/Modifier;Lf81/c;Landroidx/compose/runtime/Composer;II)V
    .locals 40

    move-object/from16 v3, p1

    const-string v0, "state"

    invoke-static {v3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v0, p2

    check-cast v0, Lp1/q;

    const v1, -0x14a768e6

    invoke-virtual {v0, v1}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v1, p4, 0x1

    const/4 v2, 0x4

    if-eqz v1, :cond_0

    or-int/lit8 v4, p3, 0x6

    move v5, v4

    move-object/from16 v4, p0

    goto :goto_1

    :cond_0
    and-int/lit8 v4, p3, 0x6

    if-nez v4, :cond_2

    move-object/from16 v4, p0

    invoke-virtual {v0, v4}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_1

    move v5, v2

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

    invoke-virtual {v0, v3}, Lp1/q;->g(Ljava/lang/Object;)Z

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

    const/4 v8, 0x0

    const/4 v9, 0x1

    if-eq v6, v7, :cond_5

    move v6, v9

    goto :goto_3

    :cond_5
    move v6, v8

    :goto_3
    and-int/2addr v5, v9

    invoke-virtual {v0, v5, v6}, Lp1/q;->U(IZ)Z

    move-result v5

    if-eqz v5, :cond_f

    sget-object v5, Lb2/t;->w:Lb2/t;

    if-eqz v1, :cond_6

    move-object v1, v5

    goto :goto_4

    :cond_6
    move-object v1, v4

    :goto_4
    const/4 v4, 0x3

    int-to-float v4, v4

    int-to-float v2, v2

    mul-float/2addr v4, v2

    invoke-static {v4}, Ll0/m;->i(F)Ll0/k;

    move-result-object v4

    sget-object v6, Lb2/e;->M:Lb2/k;

    const/4 v7, 0x6

    invoke-static {v4, v6, v0, v7}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v4

    iget-wide v10, v0, Lp1/q;->T:J

    invoke-static {v10, v11}, Ljava/lang/Long;->hashCode(J)I

    move-result v6

    invoke-virtual {v0}, Lp1/q;->m()Lp1/p1;

    move-result-object v10

    invoke-static {v0, v1}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v11

    sget-object v12, La3/l;->a:La3/k;

    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v12, La3/k;->b:La3/j;

    invoke-virtual {v0}, Lp1/q;->i0()V

    iget-boolean v13, v0, Lp1/q;->S:Z

    if-eqz v13, :cond_7

    invoke-virtual {v0, v12}, Lp1/q;->l(Lc93/a;)V

    goto :goto_5

    :cond_7
    invoke-virtual {v0}, Lp1/q;->s0()V

    :goto_5
    sget-object v13, La3/k;->g:La3/i;

    invoke-static {v0, v13, v4}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v4, La3/k;->f:La3/i;

    invoke-static {v0, v4, v10}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v10, La3/k;->j:La3/i;

    iget-boolean v14, v0, Lp1/q;->S:Z

    if-nez v14, :cond_8

    invoke-virtual {v0}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v14

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v15

    invoke-static {v14, v15}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v14

    if-nez v14, :cond_9

    :cond_8
    invoke-static {v6, v0, v6, v10}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_9
    sget-object v6, La3/k;->d:La3/i;

    invoke-static {v0, v6, v11}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    move-object v11, v4

    invoke-virtual {v3}, Lf81/c;->e()Ljava/lang/String;

    move-result-object v4

    if-nez v4, :cond_a

    const v4, -0x4be0a152

    invoke-virtual {v0, v4}, Lp1/q;->e0(I)V

    invoke-virtual {v0, v8}, Lp1/q;->q(Z)V

    move-object v4, v0

    move-object/from16 v30, v1

    move-object v3, v5

    move-object/from16 v39, v6

    move v0, v7

    move v1, v8

    move-object/from16 v38, v10

    move-object/from16 v32, v11

    move-object/from16 v33, v12

    move-object/from16 v36, v13

    goto/16 :goto_6

    :cond_a
    const v14, -0x4be0a151

    invoke-virtual {v0, v14}, Lp1/q;->e0(I)V

    sget-object v14, Lx81/d;->a:Lx81/d;

    invoke-virtual {v14, v0, v7}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v15

    invoke-virtual {v15}, Lb91/d;->L()Lb91/a;

    move-result-object v24

    invoke-virtual {v14, v0, v7}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v14

    invoke-virtual {v14}, Ly81/i;->y()J

    move-result-wide v14

    const/16 v28, 0x0

    const v29, 0x2fffa

    move-object/from16 v16, v5

    const/4 v5, 0x0

    move/from16 v17, v8

    move/from16 v18, v9

    const-wide/16 v8, 0x0

    move-object/from16 v19, v10

    const/4 v10, 0x0

    move-object/from16 v20, v11

    const/4 v11, 0x0

    move-object/from16 v21, v12

    const/4 v12, 0x0

    move-object/from16 v22, v6

    move/from16 v23, v7

    move-wide v6, v14

    move-object v15, v13

    const-wide/16 v13, 0x0

    move-object/from16 v25, v15

    const/4 v15, 0x0

    move-object/from16 v26, v16

    const/16 v16, 0x0

    move/from16 v27, v17

    move/from16 v30, v18

    const-wide/16 v17, 0x0

    move-object/from16 v31, v19

    const/16 v19, 0x0

    move-object/from16 v32, v20

    const/16 v20, 0x0

    move-object/from16 v33, v21

    const/16 v21, 0x0

    move-object/from16 v34, v22

    const/16 v22, 0x0

    move/from16 v35, v23

    const/16 v23, 0x0

    move-object/from16 v36, v25

    const/16 v25, 0x0

    move/from16 v37, v27

    const/16 v27, 0x0

    move-object/from16 v30, v1

    move-object/from16 v3, v26

    move-object/from16 v38, v31

    move-object/from16 v39, v34

    move/from16 v1, v37

    move-object/from16 v26, v0

    move/from16 v0, v35

    invoke-static/range {v4 .. v29}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v4, v26

    invoke-virtual {v4, v1}, Lp1/q;->q(Z)V

    :goto_6
    invoke-virtual/range {p1 .. p1}, Lf81/c;->c()Ljava/lang/String;

    move-result-object v5

    if-nez v5, :cond_b

    const v5, -0x4bdd48b4

    invoke-virtual {v4, v5}, Lp1/q;->e0(I)V

    invoke-virtual {v4, v1}, Lp1/q;->q(Z)V

    move-object v5, v4

    goto :goto_7

    :cond_b
    const v6, -0x4bdd48b3

    invoke-virtual {v4, v6}, Lp1/q;->e0(I)V

    sget-object v6, Lx81/d;->a:Lx81/d;

    invoke-virtual {v6, v4, v0}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v7

    invoke-virtual {v7}, Lb91/d;->b()Lb91/a;

    move-result-object v24

    invoke-virtual {v6, v4, v0}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v6

    invoke-virtual {v6}, Ly81/i;->c1()J

    move-result-wide v6

    const/16 v28, 0x0

    const v29, 0x2fffa

    move-object/from16 v26, v4

    move-object v4, v5

    const/4 v5, 0x0

    const-wide/16 v8, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const-wide/16 v13, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const-wide/16 v17, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v25, 0x0

    const/16 v27, 0x0

    invoke-static/range {v4 .. v29}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v5, v26

    invoke-virtual {v5, v1}, Lp1/q;->q(Z)V

    :goto_7
    const/high16 v4, 0x3f800000    # 1.0f

    invoke-static {v4, v3}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    invoke-static {v2, v4}, Landroidx/compose/foundation/layout/d;->h(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    const/4 v6, 0x1

    int-to-float v7, v6

    mul-float/2addr v7, v2

    invoke-static {v7}, Lt0/j;->e(F)Lt0/i;

    move-result-object v2

    invoke-static {v4, v2}, Lwb3/f;->r(Landroidx/compose/ui/Modifier;Li2/a1;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    sget-object v4, Lx81/d;->a:Lx81/d;

    invoke-virtual {v4, v5, v0}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v0

    invoke-virtual {v0}, Ly81/i;->X0()J

    move-result-wide v8

    sget-object v0, Li2/w0;->a:Li2/v0;

    invoke-static {v2, v8, v9, v0}, Landroidx/compose/foundation/a;->c(Landroidx/compose/ui/Modifier;JLi2/a1;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    sget-object v4, Lb2/e;->w:Lb2/m;

    invoke-static {v4, v1}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v4

    iget-wide v8, v5, Lp1/q;->T:J

    invoke-static {v8, v9}, Ljava/lang/Long;->hashCode(J)I

    move-result v8

    invoke-virtual {v5}, Lp1/q;->m()Lp1/p1;

    move-result-object v9

    invoke-static {v5, v2}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    invoke-virtual {v5}, Lp1/q;->i0()V

    iget-boolean v10, v5, Lp1/q;->S:Z

    if-eqz v10, :cond_c

    move-object/from16 v10, v33

    invoke-virtual {v5, v10}, Lp1/q;->l(Lc93/a;)V

    :goto_8
    move-object/from16 v15, v36

    goto :goto_9

    :cond_c
    invoke-virtual {v5}, Lp1/q;->s0()V

    goto :goto_8

    :goto_9
    invoke-static {v5, v15, v4}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    move-object/from16 v11, v32

    invoke-static {v5, v11, v9}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v4, v5, Lp1/q;->S:Z

    if-nez v4, :cond_d

    invoke-virtual {v5}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    invoke-static {v4, v9}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_e

    :cond_d
    move-object/from16 v4, v38

    goto :goto_b

    :cond_e
    :goto_a
    move-object/from16 v4, v39

    goto :goto_c

    :goto_b
    invoke-static {v8, v5, v8, v4}, Ld;->y(ILp1/q;ILa3/i;)V

    goto :goto_a

    :goto_c
    invoke-static {v5, v4, v2}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v7}, Lt0/j;->e(F)Lt0/i;

    move-result-object v2

    invoke-static {v3, v2}, Lwb3/f;->r(Landroidx/compose/ui/Modifier;Li2/a1;)Landroidx/compose/ui/Modifier;

    move-result-object v7

    invoke-virtual/range {p1 .. p1}, Lf81/c;->b()F

    move-result v10

    const/16 v13, 0x1b

    const/4 v14, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    invoke-static/range {v7 .. v14}, Lp91/e;->f(Landroidx/compose/ui/Modifier;FFFFLp91/a;ILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    invoke-virtual/range {p1 .. p1}, Lf81/c;->a()Ly81/f;

    move-result-object v3

    invoke-virtual {v3, v5, v1}, Ly81/f;->toComposableColor-WaAFU9c(Landroidx/compose/runtime/Composer;I)J

    move-result-wide v3

    invoke-static {v2, v3, v4, v0}, Landroidx/compose/foundation/a;->c(Landroidx/compose/ui/Modifier;JLi2/a1;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    invoke-static {v0, v5, v1}, Ll0/q;->a(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V

    invoke-virtual {v5, v6}, Lp1/q;->q(Z)V

    invoke-virtual {v5, v6}, Lp1/q;->q(Z)V

    move-object/from16 v1, v30

    goto :goto_d

    :cond_f
    move-object v5, v0

    invoke-virtual {v5}, Lp1/q;->X()V

    move-object v1, v4

    :goto_d
    invoke-virtual {v5}, Lp1/q;->u()Lp1/v1;

    move-result-object v6

    if-eqz v6, :cond_10

    new-instance v0, Ld62/b;

    const/16 v5, 0x1d

    move-object/from16 v3, p1

    move/from16 v2, p3

    move/from16 v4, p4

    invoke-direct/range {v0 .. v5}, Ld62/b;-><init>(Ljava/lang/Object;ILjava/lang/Object;II)V

    iput-object v0, v6, Lp1/v1;->d:Lc93/m;

    :cond_10
    return-void
.end method

.method private static final c(Landroidx/compose/ui/Modifier;Lf81/c;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, Lp1/x;->L(I)I

    move-result p2

    invoke-static {p0, p1, p4, p2, p3}, Lf81/b;->b(Landroidx/compose/ui/Modifier;Lf81/c;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method
