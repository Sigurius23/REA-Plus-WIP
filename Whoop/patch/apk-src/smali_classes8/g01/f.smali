.class public abstract Lg01/f;
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
        "Lg01/g;",
        "state",
        "Ll83/a0;",
        "b",
        "(Landroidx/compose/ui/Modifier;Lg01/g;Landroidx/compose/runtime/Composer;II)V",
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
.method public static synthetic a(Landroidx/compose/ui/Modifier;Lg01/g;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p5}, Lg01/f;->c(Landroidx/compose/ui/Modifier;Lg01/g;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final b(Landroidx/compose/ui/Modifier;Lg01/g;Landroidx/compose/runtime/Composer;II)V
    .locals 36

    move-object/from16 v2, p1

    const-string v0, "state"

    invoke-static {v2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v8, p2

    check-cast v8, Lp1/q;

    const v0, 0x61297160

    invoke-virtual {v8, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, p4, 0x1

    const/4 v3, 0x4

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

    move v5, v3

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

    invoke-virtual {v8, v2}, Lp1/q;->g(Ljava/lang/Object;)Z

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

    const/4 v11, 0x1

    if-eq v6, v7, :cond_5

    move v6, v11

    goto :goto_3

    :cond_5
    const/4 v6, 0x0

    :goto_3
    and-int/2addr v5, v11

    invoke-virtual {v8, v5, v6}, Lp1/q;->U(IZ)Z

    move-result v5

    if-eqz v5, :cond_d

    sget-object v12, Lb2/t;->w:Lb2/t;

    if-eqz v0, :cond_6

    move-object v0, v12

    goto :goto_4

    :cond_6
    move-object v0, v4

    :goto_4
    const/high16 v13, 0x3f800000    # 1.0f

    invoke-static {v13, v0}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    int-to-float v5, v11

    const/16 v6, 0x8

    int-to-float v14, v6

    mul-float v15, v5, v14

    invoke-static {v15}, Lt0/j;->e(F)Lt0/i;

    move-result-object v6

    invoke-static {v4, v6}, Lwb3/f;->r(Landroidx/compose/ui/Modifier;Li2/a1;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    sget-object v6, Lx81/d;->a:Lx81/d;

    const/4 v7, 0x6

    invoke-virtual {v6, v8, v7}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v10

    move/from16 v16, v14

    invoke-virtual {v10}, Ly81/i;->q()J

    move-result-wide v13

    sget-object v10, Li2/w0;->a:Li2/v0;

    invoke-static {v4, v13, v14, v10}, Landroidx/compose/foundation/a;->c(Landroidx/compose/ui/Modifier;JLi2/a1;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    invoke-static {v15, v4}, Landroidx/compose/foundation/layout/a;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    sget-object v10, Ll0/m;->a:Ll0/e;

    sget-object v13, Lb2/e;->K:Lb2/l;

    const/16 v14, 0x36

    invoke-static {v10, v13, v8, v14}, Ll0/p1;->a(Ll0/i;Lb2/g;Landroidx/compose/runtime/Composer;I)Ll0/r1;

    move-result-object v10

    iget-wide v13, v8, Lp1/q;->T:J

    invoke-static {v13, v14}, Ljava/lang/Long;->hashCode(J)I

    move-result v13

    invoke-virtual {v8}, Lp1/q;->m()Lp1/p1;

    move-result-object v14

    invoke-static {v8, v4}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    sget-object v17, La3/l;->a:La3/k;

    invoke-virtual/range {v17 .. v17}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v11, La3/k;->b:La3/j;

    invoke-virtual {v8}, Lp1/q;->i0()V

    iget-boolean v7, v8, Lp1/q;->S:Z

    if-eqz v7, :cond_7

    invoke-virtual {v8, v11}, Lp1/q;->l(Lc93/a;)V

    goto :goto_5

    :cond_7
    invoke-virtual {v8}, Lp1/q;->s0()V

    :goto_5
    sget-object v7, La3/k;->g:La3/i;

    invoke-static {v8, v7, v10}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v10, La3/k;->f:La3/i;

    invoke-static {v8, v10, v14}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v14, La3/k;->j:La3/i;

    iget-boolean v1, v8, Lp1/q;->S:Z

    if-nez v1, :cond_8

    invoke-virtual {v8}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    invoke-static {v13}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    invoke-static {v1, v9}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_9

    :cond_8
    invoke-static {v13, v8, v13, v14}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_9
    sget-object v1, La3/k;->d:La3/i;

    invoke-static {v8, v1, v4}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    int-to-float v3, v3

    mul-float v4, v3, v3

    invoke-static {v4, v12}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    invoke-virtual {v2}, Lg01/g;->e()Lc41/w3;

    move-result-object v9

    move-object/from16 v29, v0

    move-object/from16 v20, v1

    const/4 v13, 0x0

    invoke-static {v9, v8, v13}, Lc41/x3;->c(Lc41/w3;Landroidx/compose/runtime/Composer;I)J

    move-result-wide v0

    invoke-virtual {v2}, Lg01/g;->e()Lc41/w3;

    move-result-object v9

    invoke-static {v9, v8, v13}, Lc41/x3;->a(Lc41/w3;Landroidx/compose/runtime/Composer;I)F

    move-result v9

    invoke-static {v9, v0, v1}, Li2/x;->c(FJ)J

    move-result-wide v0

    invoke-static {v4, v5, v3, v0, v1}, Lr80/c;->e(Landroidx/compose/ui/Modifier;FFJ)Landroidx/compose/ui/Modifier;

    move-result-object v0

    sget-object v1, Lb2/e;->E:Lb2/m;

    invoke-static {v1, v13}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v1

    iget-wide v4, v8, Lp1/q;->T:J

    invoke-static {v4, v5}, Ljava/lang/Long;->hashCode(J)I

    move-result v4

    invoke-virtual {v8}, Lp1/q;->m()Lp1/p1;

    move-result-object v5

    invoke-static {v8, v0}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    invoke-virtual {v8}, Lp1/q;->i0()V

    iget-boolean v9, v8, Lp1/q;->S:Z

    if-eqz v9, :cond_a

    invoke-virtual {v8, v11}, Lp1/q;->l(Lc93/a;)V

    goto :goto_6

    :cond_a
    invoke-virtual {v8}, Lp1/q;->s0()V

    :goto_6
    invoke-static {v8, v7, v1}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v8, v10, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v1, v8, Lp1/q;->S:Z

    if-nez v1, :cond_c

    invoke-virtual {v8}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-static {v1, v5}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_b

    goto :goto_8

    :cond_b
    :goto_7
    move-object/from16 v1, v20

    goto :goto_9

    :cond_c
    :goto_8
    invoke-static {v4, v8, v4, v14}, Ld;->y(ILp1/q;ILa3/i;)V

    goto :goto_7

    :goto_9
    invoke-static {v8, v1, v0}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const/4 v0, 0x2

    int-to-float v0, v0

    mul-float/2addr v0, v3

    invoke-static {v0, v12}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v5

    invoke-virtual {v2}, Lg01/g;->b()Lgz0/m0;

    move-result-object v0

    invoke-virtual {v0}, Lgz0/m0;->toWhoopIcon()I

    move-result v0

    const/4 v1, 0x6

    invoke-static {v0, v8, v1}, Lts/o;->S(ILandroidx/compose/runtime/Composer;I)Lo2/e;

    move-result-object v3

    invoke-virtual {v2}, Lg01/g;->e()Lc41/w3;

    move-result-object v0

    const/4 v13, 0x0

    invoke-static {v0, v8, v13}, Lc41/x3;->b(Lc41/w3;Landroidx/compose/runtime/Composer;I)J

    move-result-wide v9

    move-object v0, v6

    move-wide v6, v9

    const/16 v9, 0x1b0

    const/4 v10, 0x0

    const/4 v4, 0x0

    invoke-static/range {v3 .. v10}, Lg1/f3;->b(Lo2/e;Ljava/lang/String;Landroidx/compose/ui/Modifier;JLandroidx/compose/runtime/Composer;II)V

    const/4 v3, 0x1

    invoke-virtual {v8, v3}, Lp1/q;->q(Z)V

    const-wide v4, 0x3ff3333333333333L    # 1.2

    double-to-float v4, v4

    mul-float v13, v4, v16

    const/16 v16, 0x0

    const/16 v17, 0xe

    const/4 v14, 0x0

    move v5, v15

    const/4 v15, 0x0

    move/from16 v30, v5

    const/high16 v4, 0x3f800000    # 1.0f

    invoke-static/range {v12 .. v17}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v5

    move v6, v3

    move-object/from16 v31, v12

    invoke-virtual {v2}, Lg01/g;->c()Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v0, v8, v1}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v7

    invoke-virtual {v7}, Lb91/d;->c()Lb91/a;

    move-result-object v23

    invoke-virtual {v0, v8, v1}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v7

    invoke-virtual {v7}, Ly81/i;->y()J

    move-result-wide v9

    const/16 v27, 0xc30

    const v28, 0x2d7f8

    move-object/from16 v25, v8

    const-wide/16 v7, 0x0

    move v11, v6

    move-wide/from16 v34, v9

    move v10, v4

    move-object v4, v5

    move-wide/from16 v5, v34

    const/4 v9, 0x0

    move v12, v10

    const/4 v10, 0x0

    move v13, v11

    const/4 v11, 0x0

    move v14, v12

    move v15, v13

    const-wide/16 v12, 0x0

    move/from16 v16, v14

    const/4 v14, 0x0

    move/from16 v17, v15

    const/4 v15, 0x0

    move/from16 v18, v16

    move/from16 v19, v17

    const-wide/16 v16, 0x0

    move/from16 v20, v18

    const/16 v18, 0x2

    move/from16 v21, v19

    const/16 v19, 0x0

    move/from16 v22, v20

    const/16 v20, 0x1

    move/from16 v24, v21

    const/16 v21, 0x0

    move/from16 v26, v22

    const/16 v22, 0x0

    move/from16 v32, v24

    const/16 v24, 0x0

    move/from16 v33, v26

    const/16 v26, 0x30

    move/from16 v1, v33

    invoke-static/range {v3 .. v28}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v8, v25

    const/16 v16, 0x0

    const/16 v17, 0xe

    const/4 v14, 0x0

    const/4 v15, 0x0

    move/from16 v13, v30

    move-object/from16 v12, v31

    invoke-static/range {v12 .. v17}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v3

    invoke-static {v1, v3}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    invoke-virtual {v2}, Lg01/g;->a()Ljava/lang/String;

    move-result-object v3

    const/4 v1, 0x6

    invoke-virtual {v0, v8, v1}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v5

    invoke-virtual {v5}, Lb91/d;->c()Lb91/a;

    move-result-object v23

    invoke-virtual {v0, v8, v1}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v0

    invoke-virtual {v0}, Ly81/i;->c1()J

    move-result-wide v5

    const/16 v27, 0x0

    const v28, 0x2fff8

    const-wide/16 v7, 0x0

    const-wide/16 v12, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const-wide/16 v16, 0x0

    const/16 v18, 0x0

    const/16 v20, 0x0

    invoke-static/range {v3 .. v28}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v8, v25

    const/4 v11, 0x1

    invoke-virtual {v8, v11}, Lp1/q;->q(Z)V

    move-object/from16 v1, v29

    goto :goto_a

    :cond_d
    invoke-virtual {v8}, Lp1/q;->X()V

    move-object v1, v4

    :goto_a
    invoke-virtual {v8}, Lp1/q;->u()Lp1/v1;

    move-result-object v6

    if-eqz v6, :cond_e

    new-instance v0, Lfc0/e;

    const/4 v5, 0x4

    move/from16 v3, p3

    move/from16 v4, p4

    invoke-direct/range {v0 .. v5}, Lfc0/e;-><init>(Landroidx/compose/ui/Modifier;Ljava/lang/Object;III)V

    iput-object v0, v6, Lp1/v1;->d:Lc93/m;

    :cond_e
    return-void
.end method

.method private static final c(Landroidx/compose/ui/Modifier;Lg01/g;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, Lp1/x;->L(I)I

    move-result p2

    invoke-static {p0, p1, p4, p2, p3}, Lg01/f;->b(Landroidx/compose/ui/Modifier;Lg01/g;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method
