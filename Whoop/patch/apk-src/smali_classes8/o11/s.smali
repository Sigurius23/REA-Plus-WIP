.class public abstract Lo11/s;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u001aI\u0010\n\u001a\u00020\u00082\u0008\u0008\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u00002\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00080\u0006H\u0007\u00a2\u0006\u0004\u0008\n\u0010\u000b\u001a+\u0010\u000f\u001a\u00020\u00082\u0008\u0008\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u000c\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u000e\u001a\u00020\rH\u0007\u00a2\u0006\u0004\u0008\u000f\u0010\u0010\u00a8\u0006\u0011"
    }
    d2 = {
        "Landroidx/compose/ui/Modifier;",
        "modifier",
        "",
        "isSuperset",
        "showSupersetDragHandle",
        "supersetRowModifier",
        "Lkotlin/Function1;",
        "Ll0/y;",
        "Ll83/a0;",
        "content",
        "e",
        "(Landroidx/compose/ui/Modifier;ZZLandroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V",
        "showDragHandle",
        "Li2/x;",
        "supersetColor",
        "c",
        "(Landroidx/compose/ui/Modifier;ZJLandroidx/compose/runtime/Composer;II)V",
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
.method public static synthetic a(Landroidx/compose/ui/Modifier;ZZLandroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function3;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p8}, Lo11/s;->f(Landroidx/compose/ui/Modifier;ZZLandroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function3;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Landroidx/compose/ui/Modifier;ZJIILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p7}, Lo11/s;->d(Landroidx/compose/ui/Modifier;ZJIILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final c(Landroidx/compose/ui/Modifier;ZJLandroidx/compose/runtime/Composer;II)V
    .locals 36

    move/from16 v2, p1

    move/from16 v5, p5

    move-object/from16 v11, p4

    check-cast v11, Lp1/q;

    const v0, 0x14c2b457

    invoke-virtual {v11, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, p6, 0x1

    if-eqz v0, :cond_0

    or-int/lit8 v4, v5, 0x6

    move v6, v4

    move-object/from16 v4, p0

    goto :goto_1

    :cond_0
    and-int/lit8 v4, v5, 0x6

    if-nez v4, :cond_2

    move-object/from16 v4, p0

    invoke-virtual {v11, v4}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_1

    const/4 v6, 0x4

    goto :goto_0

    :cond_1
    const/4 v6, 0x2

    :goto_0
    or-int/2addr v6, v5

    goto :goto_1

    :cond_2
    move-object/from16 v4, p0

    move v6, v5

    :goto_1
    and-int/lit8 v7, v5, 0x30

    if-nez v7, :cond_4

    invoke-virtual {v11, v2}, Lp1/q;->h(Z)Z

    move-result v7

    if-eqz v7, :cond_3

    const/16 v7, 0x20

    goto :goto_2

    :cond_3
    const/16 v7, 0x10

    :goto_2
    or-int/2addr v6, v7

    :cond_4
    and-int/lit16 v7, v5, 0x180

    if-nez v7, :cond_7

    and-int/lit8 v7, p6, 0x4

    if-nez v7, :cond_5

    move-wide/from16 v7, p2

    invoke-virtual {v11, v7, v8}, Lp1/q;->f(J)Z

    move-result v9

    if-eqz v9, :cond_6

    const/16 v9, 0x100

    goto :goto_3

    :cond_5
    move-wide/from16 v7, p2

    :cond_6
    const/16 v9, 0x80

    :goto_3
    or-int/2addr v6, v9

    goto :goto_4

    :cond_7
    move-wide/from16 v7, p2

    :goto_4
    and-int/lit16 v9, v6, 0x93

    const/16 v10, 0x92

    if-eq v9, v10, :cond_8

    const/4 v9, 0x1

    goto :goto_5

    :cond_8
    const/4 v9, 0x0

    :goto_5
    and-int/lit8 v10, v6, 0x1

    invoke-virtual {v11, v10, v9}, Lp1/q;->U(IZ)Z

    move-result v9

    if-eqz v9, :cond_12

    invoke-virtual {v11}, Lp1/q;->Z()V

    and-int/lit8 v9, v5, 0x1

    sget-object v10, Lb2/t;->w:Lb2/t;

    const/4 v12, 0x6

    if-eqz v9, :cond_b

    invoke-virtual {v11}, Lp1/q;->C()Z

    move-result v9

    if-eqz v9, :cond_9

    goto :goto_7

    :cond_9
    invoke-virtual {v11}, Lp1/q;->X()V

    and-int/lit8 v0, p6, 0x4

    if-eqz v0, :cond_a

    :goto_6
    and-int/lit16 v6, v6, -0x381

    :cond_a
    move v0, v6

    move-wide v8, v7

    goto :goto_8

    :cond_b
    :goto_7
    if-eqz v0, :cond_c

    move-object v4, v10

    :cond_c
    and-int/lit8 v0, p6, 0x4

    if-eqz v0, :cond_a

    sget-object v0, Lx81/d;->a:Lx81/d;

    invoke-virtual {v0, v11, v12}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v0

    invoke-virtual {v0}, Ly81/i;->b1()J

    move-result-wide v7

    goto :goto_6

    :goto_8
    invoke-virtual {v11}, Lp1/q;->r()V

    const/high16 v6, 0x3f800000    # 1.0f

    invoke-static {v6, v4}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v16

    const-wide/high16 v6, 0x3fe0000000000000L    # 0.5

    double-to-float v6, v6

    const/16 v7, 0x8

    int-to-float v7, v7

    mul-float v20, v6, v7

    const/16 v21, 0x7

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    invoke-static/range {v16 .. v21}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v6

    sget-object v13, Lb2/e;->K:Lb2/l;

    sget-object v14, Ll0/m;->a:Ll0/e;

    const/16 v1, 0x30

    invoke-static {v14, v13, v11, v1}, Ll0/p1;->a(Ll0/i;Lb2/g;Landroidx/compose/runtime/Composer;I)Ll0/r1;

    move-result-object v1

    iget-wide v13, v11, Lp1/q;->T:J

    invoke-static {v13, v14}, Ljava/lang/Long;->hashCode(J)I

    move-result v13

    invoke-virtual {v11}, Lp1/q;->m()Lp1/p1;

    move-result-object v14

    invoke-static {v11, v6}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v6

    sget-object v17, La3/l;->a:La3/k;

    invoke-virtual/range {v17 .. v17}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v15, La3/k;->b:La3/j;

    invoke-virtual {v11}, Lp1/q;->i0()V

    iget-boolean v3, v11, Lp1/q;->S:Z

    if-eqz v3, :cond_d

    invoke-virtual {v11, v15}, Lp1/q;->l(Lc93/a;)V

    goto :goto_9

    :cond_d
    invoke-virtual {v11}, Lp1/q;->s0()V

    :goto_9
    sget-object v3, La3/k;->g:La3/i;

    invoke-static {v11, v3, v1}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v1, La3/k;->f:La3/i;

    invoke-static {v11, v1, v14}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v1, La3/k;->j:La3/i;

    iget-boolean v3, v11, Lp1/q;->S:Z

    if-nez v3, :cond_e

    invoke-virtual {v11}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    invoke-static {v13}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v14

    invoke-static {v3, v14}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_f

    :cond_e
    invoke-static {v13, v11, v13, v1}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_f
    sget-object v1, La3/k;->d:La3/i;

    invoke-static {v11, v1, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v1, Lx81/d;->a:Lx81/d;

    invoke-virtual {v1}, Lx81/d;->d()Lgz0/o0;

    move-result-object v3

    invoke-virtual {v3}, Lgz0/o0;->m()Lgz0/e0;

    move-result-object v3

    invoke-virtual {v3}, Lgz0/e0;->o()I

    move-result v3

    invoke-static {v3, v11, v12}, Lts/o;->S(ILandroidx/compose/runtime/Composer;I)Lo2/e;

    move-result-object v6

    const/4 v3, 0x5

    int-to-float v3, v3

    const/4 v13, 0x4

    int-to-float v14, v13

    mul-float/2addr v3, v14

    invoke-static {v3, v10}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    shl-int/lit8 v13, v0, 0x3

    and-int/lit16 v15, v13, 0x1c00

    move v13, v12

    or-int/lit16 v12, v15, 0x1b0

    move/from16 v18, v13

    const/4 v13, 0x0

    move/from16 v19, v7

    const/4 v7, 0x0

    move-wide/from16 v34, v8

    move-object v8, v3

    move-object v3, v10

    move-wide/from16 v9, v34

    move/from16 v2, v18

    move/from16 v18, v14

    move v14, v2

    const/high16 v2, 0x3f800000    # 1.0f

    invoke-static/range {v6 .. v13}, Lg1/f3;->b(Lo2/e;Ljava/lang/String;Landroidx/compose/ui/Modifier;JLandroidx/compose/runtime/Composer;II)V

    sget v6, Lgy0/f;->u2:I

    invoke-static {v11, v6}, Lq83/g;->Y(Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v1, v11, v14}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v7

    invoke-virtual {v7}, Lb91/d;->L()Lb91/a;

    move-result-object v26

    const/4 v7, 0x1

    int-to-float v8, v7

    mul-float v8, v8, v19

    const/4 v7, 0x0

    const/4 v12, 0x2

    invoke-static {v3, v8, v7, v12}, Landroidx/compose/foundation/layout/a;->r(Landroidx/compose/ui/Modifier;FFI)Landroidx/compose/ui/Modifier;

    move-result-object v7

    float-to-double v12, v2

    const-wide/16 v19, 0x0

    cmpl-double v8, v12, v19

    if-lez v8, :cond_10

    :goto_a
    const/4 v8, 0x1

    goto :goto_b

    :cond_10
    const-string v8, "invalid weight; must be greater than zero"

    invoke-static {v8}, Lm0/a;->a(Ljava/lang/String;)V

    goto :goto_a

    :goto_b
    invoke-static {v7, v8, v2}, Ldc/b;->g(Landroidx/compose/ui/Modifier;ZF)Landroidx/compose/ui/Modifier;

    move-result-object v7

    and-int/lit16 v0, v0, 0x380

    const/16 v30, 0x0

    const v31, 0x2fff8

    move/from16 v17, v8

    move-wide v8, v9

    move-object/from16 v28, v11

    const-wide/16 v10, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    move v2, v14

    const/4 v14, 0x0

    move/from16 v19, v15

    const-wide/16 v15, 0x0

    move/from16 v20, v17

    const/16 v17, 0x0

    move/from16 v21, v18

    const/16 v18, 0x0

    move/from16 v22, v19

    move/from16 v23, v20

    const-wide/16 v19, 0x0

    move/from16 v24, v21

    const/16 v21, 0x0

    move/from16 v25, v22

    const/16 v22, 0x0

    move/from16 v27, v23

    const/16 v23, 0x0

    move/from16 v29, v24

    const/16 v24, 0x0

    move/from16 v32, v25

    const/16 v25, 0x0

    move/from16 v33, v27

    const/16 v27, 0x0

    move/from16 p0, v29

    move/from16 v29, v0

    move v0, v2

    move/from16 v2, v32

    invoke-static/range {v6 .. v31}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-wide v9, v8

    move-object/from16 v11, v28

    if-eqz p1, :cond_11

    const v6, 0x42db9601

    invoke-virtual {v11, v6}, Lp1/q;->e0(I)V

    invoke-virtual {v1}, Lx81/d;->d()Lgz0/o0;

    move-result-object v1

    invoke-virtual {v1}, Lgz0/o0;->p()Lgz0/k0;

    move-result-object v1

    invoke-virtual {v1}, Lgz0/k0;->p()I

    move-result v1

    invoke-static {v1, v11, v0}, Lts/o;->S(ILandroidx/compose/runtime/Composer;I)Lo2/e;

    move-result-object v6

    sget v0, Lgy0/f;->d0:I

    invoke-static {v11, v0}, Lq83/g;->Y(Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v7

    const/4 v0, 0x7

    int-to-float v0, v0

    mul-float v0, v0, p0

    invoke-static {v0, v3}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v8

    or-int/lit16 v12, v2, 0x180

    const/4 v13, 0x0

    invoke-static/range {v6 .. v13}, Lg1/f3;->b(Lo2/e;Ljava/lang/String;Landroidx/compose/ui/Modifier;JLandroidx/compose/runtime/Composer;II)V

    const/4 v0, 0x0

    invoke-virtual {v11, v0}, Lp1/q;->q(Z)V

    :goto_c
    const/4 v7, 0x1

    goto :goto_d

    :cond_11
    const/4 v0, 0x0

    const v1, 0x42dfe5a7

    invoke-virtual {v11, v1}, Lp1/q;->e0(I)V

    invoke-virtual {v11, v0}, Lp1/q;->q(Z)V

    goto :goto_c

    :goto_d
    invoke-virtual {v11, v7}, Lp1/q;->q(Z)V

    move-object v1, v4

    move-wide v3, v9

    goto :goto_e

    :cond_12
    invoke-virtual {v11}, Lp1/q;->X()V

    move-object v1, v4

    move-wide v3, v7

    :goto_e
    invoke-virtual {v11}, Lp1/q;->u()Lp1/v1;

    move-result-object v7

    if-eqz v7, :cond_13

    new-instance v0, Lo11/r;

    move/from16 v2, p1

    move/from16 v6, p6

    invoke-direct/range {v0 .. v6}, Lo11/r;-><init>(Landroidx/compose/ui/Modifier;ZJII)V

    iput-object v0, v7, Lp1/v1;->d:Lc93/m;

    :cond_13
    return-void
.end method

.method private static final d(Landroidx/compose/ui/Modifier;ZJIILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 7

    or-int/lit8 p4, p4, 0x1

    invoke-static {p4}, Lp1/x;->L(I)I

    move-result v5

    move-object v0, p0

    move v1, p1

    move-wide v2, p2

    move v6, p5

    move-object v4, p6

    invoke-static/range {v0 .. v6}, Lo11/s;->c(Landroidx/compose/ui/Modifier;ZJLandroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static final e(Landroidx/compose/ui/Modifier;ZZLandroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V
    .locals 16
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/ui/Modifier;",
            "ZZ",
            "Landroidx/compose/ui/Modifier;",
            "Lkotlin/jvm/functions/Function3;",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    move/from16 v2, p1

    move-object/from16 v5, p4

    move/from16 v6, p6

    const-string v0, "content"

    invoke-static {v5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v11, p5

    check-cast v11, Lp1/q;

    const v0, -0x378a126b

    invoke-virtual {v11, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, p7, 0x1

    const/4 v1, 0x4

    if-eqz v0, :cond_0

    or-int/lit8 v3, v6, 0x6

    move v4, v3

    move-object/from16 v3, p0

    goto :goto_1

    :cond_0
    and-int/lit8 v3, v6, 0x6

    if-nez v3, :cond_2

    move-object/from16 v3, p0

    invoke-virtual {v11, v3}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_1

    move v4, v1

    goto :goto_0

    :cond_1
    const/4 v4, 0x2

    :goto_0
    or-int/2addr v4, v6

    goto :goto_1

    :cond_2
    move-object/from16 v3, p0

    move v4, v6

    :goto_1
    and-int/lit8 v7, v6, 0x30

    if-nez v7, :cond_4

    invoke-virtual {v11, v2}, Lp1/q;->h(Z)Z

    move-result v7

    if-eqz v7, :cond_3

    const/16 v7, 0x20

    goto :goto_2

    :cond_3
    const/16 v7, 0x10

    :goto_2
    or-int/2addr v4, v7

    :cond_4
    and-int/lit8 v7, p7, 0x4

    if-eqz v7, :cond_6

    or-int/lit16 v4, v4, 0x180

    :cond_5
    move/from16 v8, p2

    goto :goto_4

    :cond_6
    and-int/lit16 v8, v6, 0x180

    if-nez v8, :cond_5

    move/from16 v8, p2

    invoke-virtual {v11, v8}, Lp1/q;->h(Z)Z

    move-result v9

    if-eqz v9, :cond_7

    const/16 v9, 0x100

    goto :goto_3

    :cond_7
    const/16 v9, 0x80

    :goto_3
    or-int/2addr v4, v9

    :goto_4
    and-int/lit8 v9, p7, 0x8

    if-eqz v9, :cond_9

    or-int/lit16 v4, v4, 0xc00

    :cond_8
    move-object/from16 v10, p3

    goto :goto_6

    :cond_9
    and-int/lit16 v10, v6, 0xc00

    if-nez v10, :cond_8

    move-object/from16 v10, p3

    invoke-virtual {v11, v10}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v12

    if-eqz v12, :cond_a

    const/16 v12, 0x800

    goto :goto_5

    :cond_a
    const/16 v12, 0x400

    :goto_5
    or-int/2addr v4, v12

    :goto_6
    and-int/lit16 v12, v6, 0x6000

    if-nez v12, :cond_c

    invoke-virtual {v11, v5}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v12

    if-eqz v12, :cond_b

    const/16 v12, 0x4000

    goto :goto_7

    :cond_b
    const/16 v12, 0x2000

    :goto_7
    or-int/2addr v4, v12

    :cond_c
    and-int/lit16 v12, v4, 0x2493

    const/16 v13, 0x2492

    const/4 v14, 0x0

    const/4 v15, 0x1

    if-eq v12, v13, :cond_d

    move v12, v15

    goto :goto_8

    :cond_d
    move v12, v14

    :goto_8
    and-int/lit8 v13, v4, 0x1

    invoke-virtual {v11, v13, v12}, Lp1/q;->U(IZ)Z

    move-result v12

    if-eqz v12, :cond_16

    sget-object v12, Lb2/t;->w:Lb2/t;

    if-eqz v0, :cond_e

    move-object v3, v12

    :cond_e
    if-eqz v7, :cond_f

    move v8, v14

    :cond_f
    if-eqz v9, :cond_10

    move-object v7, v12

    goto :goto_9

    :cond_10
    move-object v7, v10

    :goto_9
    sget-object v0, Lx81/d;->a:Lx81/d;

    const/4 v9, 0x6

    invoke-virtual {v0, v11, v9}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v0

    invoke-virtual {v0}, Ly81/i;->b1()J

    move-result-wide v12

    if-eqz v2, :cond_11

    int-to-float v0, v15

    int-to-float v1, v1

    mul-float/2addr v1, v0

    invoke-static {v1}, Lt0/j;->e(F)Lt0/i;

    move-result-object v1

    invoke-static {v3, v0, v12, v13, v1}, Lge3/g;->h(Landroidx/compose/ui/Modifier;FJLi2/a1;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    const-wide/high16 v12, 0x3ff8000000000000L    # 1.5

    double-to-float v1, v12

    const/16 v10, 0x8

    int-to-float v10, v10

    mul-float/2addr v1, v10

    invoke-static {v1, v0}, Landroidx/compose/foundation/layout/a;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    goto :goto_a

    :cond_11
    move-object v0, v3

    :goto_a
    sget-object v1, Ll0/m;->c:Ll0/g;

    sget-object v10, Lb2/e;->M:Lb2/k;

    invoke-static {v1, v10, v11, v14}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v1

    iget-wide v12, v11, Lp1/q;->T:J

    invoke-static {v12, v13}, Ljava/lang/Long;->hashCode(J)I

    move-result v10

    invoke-virtual {v11}, Lp1/q;->m()Lp1/p1;

    move-result-object v12

    invoke-static {v11, v0}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    sget-object v13, La3/l;->a:La3/k;

    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v13, La3/k;->b:La3/j;

    invoke-virtual {v11}, Lp1/q;->i0()V

    iget-boolean v9, v11, Lp1/q;->S:Z

    if-eqz v9, :cond_12

    invoke-virtual {v11, v13}, Lp1/q;->l(Lc93/a;)V

    goto :goto_b

    :cond_12
    invoke-virtual {v11}, Lp1/q;->s0()V

    :goto_b
    sget-object v9, La3/k;->g:La3/i;

    invoke-static {v11, v9, v1}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v1, La3/k;->f:La3/i;

    invoke-static {v11, v1, v12}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v1, La3/k;->j:La3/i;

    iget-boolean v9, v11, Lp1/q;->S:Z

    if-nez v9, :cond_13

    invoke-virtual {v11}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v9

    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v12

    invoke-static {v9, v12}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v9

    if-nez v9, :cond_14

    :cond_13
    invoke-static {v10, v11, v10, v1}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_14
    sget-object v1, La3/k;->d:La3/i;

    invoke-static {v11, v1, v0}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    if-eqz v2, :cond_15

    const v0, 0x35411ab3

    invoke-virtual {v11, v0}, Lp1/q;->e0(I)V

    shr-int/lit8 v0, v4, 0x9

    and-int/lit8 v0, v0, 0xe

    shr-int/lit8 v1, v4, 0x3

    and-int/lit8 v1, v1, 0x70

    or-int v12, v0, v1

    const/4 v13, 0x4

    const-wide/16 v9, 0x0

    const/4 v0, 0x6

    invoke-static/range {v7 .. v13}, Lo11/s;->c(Landroidx/compose/ui/Modifier;ZJLandroidx/compose/runtime/Composer;II)V

    invoke-virtual {v11, v14}, Lp1/q;->q(Z)V

    goto :goto_c

    :cond_15
    const/4 v0, 0x6

    const v1, 0x35424703

    invoke-virtual {v11, v1}, Lp1/q;->e0(I)V

    invoke-virtual {v11, v14}, Lp1/q;->q(Z)V

    :goto_c
    shr-int/lit8 v1, v4, 0x9

    and-int/lit8 v1, v1, 0x70

    or-int/2addr v0, v1

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    sget-object v1, Ll0/z;->a:Ll0/z;

    invoke-interface {v5, v1, v11, v0}, Lkotlin/jvm/functions/Function3;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v11, v15}, Lp1/q;->q(Z)V

    move-object v4, v7

    :goto_d
    move-object v1, v3

    move v3, v8

    goto :goto_e

    :cond_16
    invoke-virtual {v11}, Lp1/q;->X()V

    move-object v4, v10

    goto :goto_d

    :goto_e
    invoke-virtual {v11}, Lp1/q;->u()Lp1/v1;

    move-result-object v9

    if-eqz v9, :cond_17

    new-instance v0, Lep1/p;

    const/16 v8, 0xb

    move/from16 v7, p7

    invoke-direct/range {v0 .. v8}, Lep1/p;-><init>(Ljava/lang/Object;ZZLjava/lang/Object;Ll83/e;III)V

    iput-object v0, v9, Lp1/v1;->d:Lc93/m;

    :cond_17
    return-void
.end method

.method private static final f(Landroidx/compose/ui/Modifier;ZZLandroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function3;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 8

    or-int/lit8 p5, p5, 0x1

    invoke-static {p5}, Lp1/x;->L(I)I

    move-result v6

    move-object v0, p0

    move v1, p1

    move v2, p2

    move-object v3, p3

    move-object v4, p4

    move v7, p6

    move-object v5, p7

    invoke-static/range {v0 .. v7}, Lo11/s;->e(Landroidx/compose/ui/Modifier;ZZLandroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method
