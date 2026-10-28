.class public abstract Luz0/c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u001a1\u0010\u0008\u001a\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u00002\u0008\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0004\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0005H\u0001\u00a2\u0006\u0004\u0008\u0008\u0010\t\u00a8\u0006\n"
    }
    d2 = {
        "Lkd1/o;",
        "imageSource",
        "",
        "activityStrain",
        "activityTitle",
        "Li2/t;",
        "backgroundBrush",
        "Ll83/a0;",
        "b",
        "(Lkd1/o;Ljava/lang/String;Ljava/lang/String;Li2/t;Landroidx/compose/runtime/Composer;I)V",
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
.method public static synthetic a(Lkd1/o;Ljava/lang/String;Ljava/lang/String;Li2/t;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p6}, Luz0/c;->c(Lkd1/o;Ljava/lang/String;Ljava/lang/String;Li2/t;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final b(Lkd1/o;Ljava/lang/String;Ljava/lang/String;Li2/t;Landroidx/compose/runtime/Composer;I)V
    .locals 36

    move-object/from16 v0, p0

    move-object/from16 v6, p1

    move-object/from16 v7, p2

    move-object/from16 v8, p3

    move/from16 v9, p5

    const-string v1, "imageSource"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "activityTitle"

    invoke-static {v7, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "backgroundBrush"

    invoke-static {v8, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v15, p4

    check-cast v15, Lp1/q;

    const v1, -0x37d3e66d

    invoke-virtual {v15, v1}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v1, v9, 0x6

    if-nez v1, :cond_1

    invoke-virtual {v15, v0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, 0x4

    goto :goto_0

    :cond_0
    const/4 v1, 0x2

    :goto_0
    or-int/2addr v1, v9

    goto :goto_1

    :cond_1
    move v1, v9

    :goto_1
    and-int/lit8 v4, v9, 0x30

    if-nez v4, :cond_3

    invoke-virtual {v15, v6}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_2

    const/16 v4, 0x20

    goto :goto_2

    :cond_2
    const/16 v4, 0x10

    :goto_2
    or-int/2addr v1, v4

    :cond_3
    and-int/lit16 v4, v9, 0x180

    if-nez v4, :cond_5

    invoke-virtual {v15, v7}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_4

    const/16 v4, 0x100

    goto :goto_3

    :cond_4
    const/16 v4, 0x80

    :goto_3
    or-int/2addr v1, v4

    :cond_5
    and-int/lit16 v4, v9, 0xc00

    if-nez v4, :cond_7

    invoke-virtual {v15, v8}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_6

    const/16 v4, 0x800

    goto :goto_4

    :cond_6
    const/16 v4, 0x400

    :goto_4
    or-int/2addr v1, v4

    :cond_7
    move v10, v1

    and-int/lit16 v1, v10, 0x493

    const/16 v4, 0x492

    if-eq v1, v4, :cond_8

    const/4 v1, 0x1

    goto :goto_5

    :cond_8
    const/4 v1, 0x0

    :goto_5
    and-int/lit8 v4, v10, 0x1

    invoke-virtual {v15, v4, v1}, Lp1/q;->U(IZ)Z

    move-result v1

    if-eqz v1, :cond_11

    sget-object v1, Lb2/e;->K:Lb2/l;

    const/high16 v13, 0x3f800000    # 1.0f

    sget-object v14, Lb2/t;->w:Lb2/t;

    invoke-static {v13, v14}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    sget-object v5, Ll0/m;->a:Ll0/e;

    const/16 v11, 0x30

    invoke-static {v5, v1, v15, v11}, Ll0/p1;->a(Ll0/i;Lb2/g;Landroidx/compose/runtime/Composer;I)Ll0/r1;

    move-result-object v12

    move-object/from16 v18, v14

    iget-wide v13, v15, Lp1/q;->T:J

    invoke-static {v13, v14}, Ljava/lang/Long;->hashCode(J)I

    move-result v13

    invoke-virtual {v15}, Lp1/q;->m()Lp1/p1;

    move-result-object v14

    invoke-static {v15, v4}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    sget-object v19, La3/l;->a:La3/k;

    invoke-virtual/range {v19 .. v19}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v11, La3/k;->b:La3/j;

    invoke-virtual {v15}, Lp1/q;->i0()V

    iget-boolean v2, v15, Lp1/q;->S:Z

    if-eqz v2, :cond_9

    invoke-virtual {v15, v11}, Lp1/q;->l(Lc93/a;)V

    goto :goto_6

    :cond_9
    invoke-virtual {v15}, Lp1/q;->s0()V

    :goto_6
    sget-object v2, La3/k;->g:La3/i;

    invoke-static {v15, v2, v12}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v12, La3/k;->f:La3/i;

    invoke-static {v15, v12, v14}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v14, La3/k;->j:La3/i;

    iget-boolean v3, v15, Lp1/q;->S:Z

    if-nez v3, :cond_a

    invoke-virtual {v15}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    invoke-static {v13}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v3, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_b

    :cond_a
    invoke-static {v13, v15, v13, v14}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_b
    sget-object v0, La3/k;->d:La3/i;

    invoke-static {v15, v0, v4}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const/4 v3, 0x2

    int-to-float v3, v3

    const/4 v4, 0x4

    int-to-float v13, v4

    mul-float/2addr v3, v13

    invoke-static {v3}, Lt0/j;->e(F)Lt0/i;

    move-result-object v3

    move-object/from16 v4, v18

    invoke-static {v4, v3}, Lwb3/f;->r(Landroidx/compose/ui/Modifier;Li2/a1;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    const/4 v4, 0x0

    const/4 v6, 0x0

    const/4 v9, 0x6

    invoke-static {v3, v8, v4, v6, v9}, Landroidx/compose/foundation/a;->b(Landroidx/compose/ui/Modifier;Li2/t;Li2/a1;FI)Landroidx/compose/ui/Modifier;

    move-result-object v3

    move v6, v10

    const-wide/high16 v9, 0x3ff8000000000000L    # 1.5

    double-to-float v4, v9

    const/16 v9, 0x8

    int-to-float v9, v9

    mul-float/2addr v4, v9

    invoke-static {v3, v4, v4}, Landroidx/compose/foundation/layout/a;->q(Landroidx/compose/ui/Modifier;FF)Landroidx/compose/ui/Modifier;

    move-result-object v3

    const/16 v4, 0x30

    invoke-static {v5, v1, v15, v4}, Ll0/p1;->a(Ll0/i;Lb2/g;Landroidx/compose/runtime/Composer;I)Ll0/r1;

    move-result-object v1

    iget-wide v4, v15, Lp1/q;->T:J

    invoke-static {v4, v5}, Ljava/lang/Long;->hashCode(J)I

    move-result v4

    invoke-virtual {v15}, Lp1/q;->m()Lp1/p1;

    move-result-object v5

    invoke-static {v15, v3}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    invoke-virtual {v15}, Lp1/q;->i0()V

    iget-boolean v10, v15, Lp1/q;->S:Z

    if-eqz v10, :cond_c

    invoke-virtual {v15, v11}, Lp1/q;->l(Lc93/a;)V

    goto :goto_7

    :cond_c
    invoke-virtual {v15}, Lp1/q;->s0()V

    :goto_7
    invoke-static {v15, v2, v1}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v15, v12, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v1, v15, Lp1/q;->S:Z

    if-nez v1, :cond_d

    invoke-virtual {v15}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_e

    :cond_d
    invoke-static {v4, v15, v4, v14}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_e
    invoke-static {v15, v0, v3}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    and-int/lit8 v4, v6, 0xe

    const/4 v5, 0x3

    const/4 v1, 0x0

    const/4 v2, 0x0

    move-object/from16 v0, p0

    move-object v3, v15

    move-object/from16 v10, v18

    invoke-static/range {v0 .. v5}, Lkd1/p;->i(Lkd1/o;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)Ln2/a;

    move-result-object v1

    const-string v0, " icon"

    invoke-virtual {v7, v0}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v11

    sget-object v0, Lx81/d;->a:Lx81/d;

    const/4 v2, 0x6

    invoke-virtual {v0, v15, v2}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v3

    invoke-virtual {v3}, Ly81/i;->y()J

    move-result-wide v2

    const/high16 v4, 0x40900000    # 4.5f

    mul-float/2addr v13, v4

    invoke-static {v13, v10}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v12

    const/4 v4, 0x1

    const/16 v16, 0x180

    const/high16 v5, 0x3f800000    # 1.0f

    const/16 v17, 0x0

    move-wide v13, v2

    move v2, v4

    move/from16 v26, v6

    move-object v3, v10

    move-object v10, v1

    const/4 v1, 0x0

    invoke-static/range {v10 .. v17}, Lg1/f3;->a(Ln2/a;Ljava/lang/String;Landroidx/compose/ui/Modifier;JLandroidx/compose/runtime/Composer;II)V

    if-eqz p1, :cond_f

    const v4, -0x1db6b4fe

    invoke-virtual {v15, v4}, Lp1/q;->e0(I)V

    int-to-float v4, v2

    invoke-static {v4, v9, v3, v15}, Ly00/t7;->p(FFLb2/t;Lp1/q;)V

    const/4 v4, 0x6

    invoke-virtual {v0, v15, v4}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v6

    invoke-virtual {v6}, Lb91/d;->C()Lb91/a;

    move-result-object v20

    invoke-virtual {v0, v15, v4}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v6

    invoke-virtual {v6}, Ly81/i;->y()J

    move-result-wide v10

    shr-int/lit8 v6, v26, 0x3

    and-int/lit8 v23, v6, 0xe

    const/16 v24, 0x0

    const v25, 0x2fffa

    move v6, v1

    const/4 v1, 0x0

    move v12, v4

    move/from16 v17, v5

    const-wide/16 v4, 0x0

    move v13, v6

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    move/from16 v16, v2

    move-object/from16 v18, v3

    move-wide v2, v10

    move v11, v9

    const-wide/16 v9, 0x0

    move v14, v11

    const/4 v11, 0x0

    move/from16 v19, v12

    const/4 v12, 0x0

    move/from16 v22, v13

    move/from16 v21, v14

    const-wide/16 v13, 0x0

    move/from16 v27, v22

    move-object/from16 v22, v15

    const/4 v15, 0x0

    move/from16 v28, v16

    const/16 v16, 0x0

    move/from16 v29, v17

    const/16 v17, 0x0

    move-object/from16 v30, v18

    const/16 v18, 0x0

    move/from16 v31, v19

    const/16 v19, 0x0

    move/from16 v32, v21

    const/16 v21, 0x0

    move-object/from16 v34, v0

    move-object/from16 v35, v30

    move/from16 v33, v32

    move-object/from16 v0, p1

    invoke-static/range {v0 .. v25}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v15, v22

    const/4 v13, 0x0

    invoke-virtual {v15, v13}, Lp1/q;->q(Z)V

    :goto_8
    const/4 v0, 0x1

    goto :goto_9

    :cond_f
    move-object/from16 v34, v0

    move v13, v1

    move-object/from16 v35, v3

    move/from16 v33, v9

    const v0, -0x1db2a529

    invoke-virtual {v15, v0}, Lp1/q;->e0(I)V

    invoke-virtual {v15, v13}, Lp1/q;->q(Z)V

    goto :goto_8

    :goto_9
    invoke-virtual {v15, v0}, Lp1/q;->q(Z)V

    int-to-float v1, v0

    move/from16 v11, v33

    move-object/from16 v10, v35

    invoke-static {v1, v11, v10, v15}, Ly00/t7;->p(FFLb2/t;Lp1/q;)V

    move-object/from16 v1, v34

    const/4 v12, 0x6

    invoke-virtual {v1, v15, v12}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v2

    invoke-virtual {v2}, Ly81/i;->y()J

    move-result-wide v2

    invoke-virtual {v1, v15, v12}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v1

    invoke-virtual {v1}, Lb91/d;->L()Lb91/a;

    move-result-object v20

    const/high16 v5, 0x3f800000    # 1.0f

    float-to-double v6, v5

    const-wide/16 v8, 0x0

    cmpl-double v1, v6, v8

    if-lez v1, :cond_10

    goto :goto_a

    :cond_10
    const-string v1, "invalid weight; must be greater than zero"

    invoke-static {v1}, Lm0/a;->a(Ljava/lang/String;)V

    :goto_a
    new-instance v1, Landroidx/compose/foundation/layout/LayoutWeightElement;

    invoke-direct {v1, v5, v0}, Landroidx/compose/foundation/layout/LayoutWeightElement;-><init>(FZ)V

    shr-int/lit8 v4, v26, 0x6

    and-int/lit8 v23, v4, 0xe

    const/16 v24, 0x0

    const v25, 0x2fff8

    const-wide/16 v4, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const-wide/16 v9, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const-wide/16 v13, 0x0

    move-object/from16 v22, v15

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v21, 0x0

    move-object/from16 v0, p2

    invoke-static/range {v0 .. v25}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v15, v22

    const/4 v0, 0x1

    invoke-virtual {v15, v0}, Lp1/q;->q(Z)V

    goto :goto_b

    :cond_11
    invoke-virtual {v15}, Lp1/q;->X()V

    :goto_b
    invoke-virtual {v15}, Lp1/q;->u()Lp1/v1;

    move-result-object v7

    if-eqz v7, :cond_12

    new-instance v0, Ltu1/c;

    const/16 v6, 0x17

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move-object/from16 v4, p3

    move/from16 v5, p5

    invoke-direct/range {v0 .. v6}, Ltu1/c;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;II)V

    iput-object v0, v7, Lp1/v1;->d:Lc93/m;

    :cond_12
    return-void
.end method

.method private static final c(Lkd1/o;Ljava/lang/String;Ljava/lang/String;Li2/t;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 6

    or-int/lit8 p4, p4, 0x1

    invoke-static {p4}, Lp1/x;->L(I)I

    move-result v5

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p5

    invoke-static/range {v0 .. v5}, Luz0/c;->b(Lkd1/o;Ljava/lang/String;Ljava/lang/String;Li2/t;Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method
