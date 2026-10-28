.class public abstract Lg1/b1;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:F

.field public static final b:F

.field public static final c:F

.field public static final d:F

.field public static final e:F


# direct methods
.method static constructor <clinit>()V
    .locals 2

    const/16 v0, 0x18

    int-to-float v0, v0

    sput v0, Lg1/b1;->a:F

    const/4 v0, 0x2

    int-to-float v0, v0

    sput v0, Lg1/b1;->b:F

    const/16 v1, 0x14

    int-to-float v1, v1

    sput v1, Lg1/b1;->c:F

    sput v0, Lg1/b1;->d:F

    sput v0, Lg1/b1;->e:F

    return-void
.end method

.method public static final a(ZLkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZLg1/a1;Landroidx/compose/runtime/Composer;II)V
    .locals 16

    move/from16 v1, p0

    move-object/from16 v2, p1

    move/from16 v6, p6

    move-object/from16 v12, p5

    check-cast v12, Lp1/q;

    const v0, -0x7e483386

    invoke-virtual {v12, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, v6, 0x6

    const/4 v3, 0x4

    if-nez v0, :cond_1

    invoke-virtual {v12, v1}, Lp1/q;->h(Z)Z

    move-result v0

    if-eqz v0, :cond_0

    move v0, v3

    goto :goto_0

    :cond_0
    const/4 v0, 0x2

    :goto_0
    or-int/2addr v0, v6

    goto :goto_1

    :cond_1
    move v0, v6

    :goto_1
    and-int/lit8 v4, v6, 0x30

    const/16 v5, 0x20

    if-nez v4, :cond_3

    invoke-virtual {v12, v2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_2

    move v4, v5

    goto :goto_2

    :cond_2
    const/16 v4, 0x10

    :goto_2
    or-int/2addr v0, v4

    :cond_3
    and-int/lit8 v4, p7, 0x4

    if-eqz v4, :cond_5

    or-int/lit16 v0, v0, 0x180

    :cond_4
    move-object/from16 v7, p2

    goto :goto_4

    :cond_5
    and-int/lit16 v7, v6, 0x180

    if-nez v7, :cond_4

    move-object/from16 v7, p2

    invoke-virtual {v12, v7}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_6

    const/16 v8, 0x100

    goto :goto_3

    :cond_6
    const/16 v8, 0x80

    :goto_3
    or-int/2addr v0, v8

    :goto_4
    and-int/lit8 v8, p7, 0x8

    if-eqz v8, :cond_8

    or-int/lit16 v0, v0, 0xc00

    :cond_7
    move/from16 v9, p3

    goto :goto_6

    :cond_8
    and-int/lit16 v9, v6, 0xc00

    if-nez v9, :cond_7

    move/from16 v9, p3

    invoke-virtual {v12, v9}, Lp1/q;->h(Z)Z

    move-result v10

    if-eqz v10, :cond_9

    const/16 v10, 0x800

    goto :goto_5

    :cond_9
    const/16 v10, 0x400

    :goto_5
    or-int/2addr v0, v10

    :goto_6
    or-int/lit16 v0, v0, 0x6000

    const/high16 v10, 0x30000

    and-int/2addr v10, v6

    move-object/from16 v11, p4

    if-nez v10, :cond_b

    invoke-virtual {v12, v11}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_a

    const/high16 v10, 0x20000

    goto :goto_7

    :cond_a
    const/high16 v10, 0x10000

    :goto_7
    or-int/2addr v0, v10

    :cond_b
    const v10, 0x12493

    and-int/2addr v10, v0

    const v13, 0x12492

    const/4 v14, 0x0

    const/4 v15, 0x1

    if-eq v10, v13, :cond_c

    move v10, v15

    goto :goto_8

    :cond_c
    move v10, v14

    :goto_8
    and-int/lit8 v13, v0, 0x1

    invoke-virtual {v12, v13, v10}, Lp1/q;->U(IZ)Z

    move-result v10

    if-eqz v10, :cond_16

    invoke-virtual {v12}, Lp1/q;->Z()V

    and-int/lit8 v10, v6, 0x1

    if-eqz v10, :cond_e

    invoke-virtual {v12}, Lp1/q;->C()Z

    move-result v10

    if-eqz v10, :cond_d

    goto :goto_9

    :cond_d
    invoke-virtual {v12}, Lp1/q;->X()V

    move v10, v9

    move-object v9, v7

    goto :goto_b

    :cond_e
    :goto_9
    if-eqz v4, :cond_f

    sget-object v4, Lb2/t;->w:Lb2/t;

    goto :goto_a

    :cond_f
    move-object v4, v7

    :goto_a
    if-eqz v8, :cond_10

    move v9, v15

    :cond_10
    move v10, v9

    move-object v9, v4

    :goto_b
    invoke-virtual {v12}, Lp1/q;->r()V

    invoke-static {v1}, Lse/g;->j(Z)Lk3/a;

    move-result-object v7

    if-eqz v2, :cond_15

    const v4, 0x6be22b4b

    invoke-virtual {v12, v4}, Lp1/q;->e0(I)V

    and-int/lit8 v4, v0, 0x70

    if-ne v4, v5, :cond_11

    move v4, v15

    goto :goto_c

    :cond_11
    move v4, v14

    :goto_c
    and-int/lit8 v5, v0, 0xe

    if-ne v5, v3, :cond_12

    goto :goto_d

    :cond_12
    move v15, v14

    :goto_d
    or-int v3, v4, v15

    invoke-virtual {v12}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    if-nez v3, :cond_13

    sget-object v3, Lp1/l;->a:Lp1/v0;

    if-ne v4, v3, :cond_14

    :cond_13
    new-instance v4, Lbv2/b;

    const/4 v3, 0x2

    invoke-direct {v4, v2, v1, v3}, Lbv2/b;-><init>(Lkotlin/jvm/functions/Function1;ZI)V

    invoke-virtual {v12, v4}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_14
    check-cast v4, Lc93/a;

    invoke-virtual {v12, v14}, Lp1/q;->q(Z)V

    :goto_e
    move-object v8, v4

    goto :goto_f

    :cond_15
    const v3, 0x6be32803

    invoke-virtual {v12, v3}, Lp1/q;->e0(I)V

    invoke-virtual {v12, v14}, Lp1/q;->q(Z)V

    const/4 v4, 0x0

    goto :goto_e

    :goto_f
    const v3, 0x7ff80

    and-int v13, v0, v3

    invoke-static/range {v7 .. v13}, Lg1/b1;->c(Lk3/a;Lc93/a;Landroidx/compose/ui/Modifier;ZLg1/a1;Landroidx/compose/runtime/Composer;I)V

    move-object v3, v9

    move v4, v10

    goto :goto_10

    :cond_16
    invoke-virtual {v12}, Lp1/q;->X()V

    move-object v3, v7

    move v4, v9

    :goto_10
    invoke-virtual {v12}, Lp1/q;->u()Lp1/v1;

    move-result-object v9

    if-eqz v9, :cond_17

    new-instance v0, Lep1/p;

    const/4 v8, 0x2

    move-object/from16 v5, p4

    move/from16 v7, p7

    invoke-direct/range {v0 .. v8}, Lep1/p;-><init>(ZLkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZLjava/lang/Object;III)V

    iput-object v0, v9, Lp1/v1;->d:Lc93/m;

    :cond_17
    return-void
.end method

.method public static final b(ZLk3/a;Landroidx/compose/ui/Modifier;Lg1/a1;Landroidx/compose/runtime/Composer;I)V
    .locals 28

    move/from16 v1, p0

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move-object/from16 v4, p3

    move/from16 v5, p5

    move-object/from16 v11, p4

    check-cast v11, Lp1/q;

    const v0, -0x7e4bc86f

    invoke-virtual {v11, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, v5, 0x6

    const/4 v13, 0x2

    if-nez v0, :cond_1

    invoke-virtual {v11, v1}, Lp1/q;->h(Z)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x4

    goto :goto_0

    :cond_0
    move v0, v13

    :goto_0
    or-int/2addr v0, v5

    goto :goto_1

    :cond_1
    move v0, v5

    :goto_1
    and-int/lit8 v6, v5, 0x30

    if-nez v6, :cond_3

    invoke-virtual {v2}, Ljava/lang/Enum;->ordinal()I

    move-result v6

    invoke-virtual {v11, v6}, Lp1/q;->e(I)Z

    move-result v6

    if-eqz v6, :cond_2

    const/16 v6, 0x20

    goto :goto_2

    :cond_2
    const/16 v6, 0x10

    :goto_2
    or-int/2addr v0, v6

    :cond_3
    and-int/lit16 v6, v5, 0x180

    if-nez v6, :cond_5

    invoke-virtual {v11, v3}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_4

    const/16 v6, 0x100

    goto :goto_3

    :cond_4
    const/16 v6, 0x80

    :goto_3
    or-int/2addr v0, v6

    :cond_5
    and-int/lit16 v6, v5, 0xc00

    if-nez v6, :cond_7

    invoke-virtual {v11, v4}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_6

    const/16 v6, 0x800

    goto :goto_4

    :cond_6
    const/16 v6, 0x400

    :goto_4
    or-int/2addr v0, v6

    :cond_7
    and-int/lit16 v6, v0, 0x493

    const/16 v7, 0x492

    const/4 v14, 0x1

    const/4 v15, 0x0

    if-eq v6, v7, :cond_8

    move v6, v14

    goto :goto_5

    :cond_8
    move v6, v15

    :goto_5
    and-int/lit8 v7, v0, 0x1

    invoke-virtual {v11, v7, v6}, Lp1/q;->U(IZ)Z

    move-result v6

    if-eqz v6, :cond_1a

    shr-int/lit8 v0, v0, 0x3

    and-int/lit8 v0, v0, 0xe

    const/4 v6, 0x0

    invoke-static {v2, v6, v11, v0, v13}, Ld0/d2;->f(Ljava/lang/Object;Ljava/lang/String;Landroidx/compose/runtime/Composer;II)Ld0/z1;

    move-result-object v0

    iget-object v7, v0, Ld0/z1;->d:Lp1/k1;

    iget-object v8, v0, Ld0/z1;->a:Lal/a;

    sget-object v10, Ld0/f;->i:Ld0/f2;

    invoke-virtual {v8}, Lal/a;->y0()Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Lk3/a;

    const v12, -0x6b309374

    invoke-virtual {v11, v12}, Lp1/q;->e0(I)V

    invoke-virtual {v9}, Ljava/lang/Enum;->ordinal()I

    move-result v9

    const/high16 v16, 0x3f800000    # 1.0f

    if-eqz v9, :cond_9

    if-eq v9, v14, :cond_b

    if-ne v9, v13, :cond_a

    :cond_9
    move/from16 v9, v16

    goto :goto_6

    :cond_a
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0

    :cond_b
    const/4 v9, 0x0

    :goto_6
    invoke-virtual {v11, v15}, Lp1/q;->q(Z)V

    invoke-static {v9}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v9

    invoke-virtual {v7}, Lp1/k1;->getValue()Ljava/lang/Object;

    move-result-object v17

    check-cast v17, Lk3/a;

    invoke-virtual {v11, v12}, Lp1/q;->e0(I)V

    invoke-virtual/range {v17 .. v17}, Ljava/lang/Enum;->ordinal()I

    move-result v12

    if-eqz v12, :cond_c

    if-eq v12, v14, :cond_e

    if-ne v12, v13, :cond_d

    :cond_c
    move/from16 v12, v16

    goto :goto_7

    :cond_d
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0

    :cond_e
    const/4 v12, 0x0

    :goto_7
    invoke-virtual {v11, v15}, Lp1/q;->q(Z)V

    invoke-static {v12}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v12

    invoke-virtual {v0}, Ld0/z1;->f()Ld0/t1;

    move-result-object v17

    const v13, -0x65c97a74

    invoke-virtual {v11, v13}, Lp1/q;->e0(I)V

    invoke-interface/range {v17 .. v17}, Ld0/t1;->c()Ljava/lang/Object;

    move-result-object v13

    sget-object v14, Lk3/a;->x:Lk3/a;

    move-object/from16 v18, v12

    const/16 v12, 0x64

    const/4 v6, 0x6

    if-ne v13, v14, :cond_f

    const/4 v13, 0x0

    invoke-static {v12, v15, v13, v6}, Ld0/f;->v(IILd0/z;I)Ld0/e2;

    move-result-object v17

    move-object/from16 v6, v17

    :goto_8
    const/4 v12, 0x0

    goto :goto_9

    :cond_f
    const/4 v13, 0x0

    invoke-interface/range {v17 .. v17}, Ld0/t1;->b()Ljava/lang/Object;

    move-result-object v6

    if-ne v6, v14, :cond_10

    new-instance v6, Ld0/g1;

    invoke-direct {v6, v12}, Ld0/g1;-><init>(I)V

    goto :goto_8

    :cond_10
    const/4 v6, 0x7

    const/4 v12, 0x0

    invoke-static {v12, v12, v6, v13}, Ld0/f;->u(FFILjava/lang/Object;)Ld0/i1;

    move-result-object v6

    :goto_9
    invoke-virtual {v11, v15}, Lp1/q;->q(Z)V

    move/from16 v19, v12

    const/4 v12, 0x0

    move-object v13, v6

    move-object v6, v0

    move-object v0, v7

    move-object v7, v9

    move-object v9, v13

    move-object v13, v8

    move-object/from16 v8, v18

    invoke-static/range {v6 .. v12}, Ld0/d2;->d(Ld0/z1;Ljava/lang/Object;Ljava/lang/Object;Ld0/c0;Ld0/f2;Landroidx/compose/runtime/Composer;I)Ld0/v1;

    move-result-object v25

    invoke-virtual {v13}, Lal/a;->y0()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lk3/a;

    const v8, -0x7d1b526b

    invoke-virtual {v11, v8}, Lp1/q;->e0(I)V

    invoke-virtual {v7}, Ljava/lang/Enum;->ordinal()I

    move-result v7

    if-eqz v7, :cond_12

    const/4 v9, 0x1

    if-eq v7, v9, :cond_12

    const/4 v9, 0x2

    if-ne v7, v9, :cond_11

    move/from16 v7, v16

    goto :goto_a

    :cond_11
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0

    :cond_12
    move/from16 v7, v19

    :goto_a
    invoke-virtual {v11, v15}, Lp1/q;->q(Z)V

    invoke-static {v7}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v7

    invoke-virtual {v0}, Lp1/k1;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lk3/a;

    invoke-virtual {v11, v8}, Lp1/q;->e0(I)V

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    if-eqz v0, :cond_14

    const/4 v9, 0x1

    if-eq v0, v9, :cond_14

    const/4 v9, 0x2

    if-ne v0, v9, :cond_13

    goto :goto_b

    :cond_13
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0

    :cond_14
    move/from16 v16, v19

    :goto_b
    invoke-virtual {v11, v15}, Lp1/q;->q(Z)V

    invoke-static/range {v16 .. v16}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v8

    invoke-virtual {v6}, Ld0/z1;->f()Ld0/t1;

    move-result-object v0

    const v9, 0x40178695

    invoke-virtual {v11, v9}, Lp1/q;->e0(I)V

    invoke-interface {v0}, Ld0/t1;->c()Ljava/lang/Object;

    move-result-object v9

    if-ne v9, v14, :cond_15

    invoke-static {}, Ld0/f;->t()Ld0/g1;

    move-result-object v0

    :goto_c
    move-object v9, v0

    goto :goto_d

    :cond_15
    invoke-interface {v0}, Ld0/t1;->b()Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v14, :cond_16

    new-instance v0, Ld0/g1;

    const/16 v9, 0x64

    invoke-direct {v0, v9}, Ld0/g1;-><init>(I)V

    goto :goto_c

    :cond_16
    const/4 v0, 0x6

    const/16 v9, 0x64

    const/4 v13, 0x0

    invoke-static {v9, v15, v13, v0}, Ld0/f;->v(IILd0/z;I)Ld0/e2;

    move-result-object v0

    goto :goto_c

    :goto_d
    invoke-virtual {v11, v15}, Lp1/q;->q(Z)V

    move-object/from16 v0, v25

    invoke-static/range {v6 .. v12}, Ld0/d2;->d(Ld0/z1;Ljava/lang/Object;Ljava/lang/Object;Ld0/c0;Ld0/f2;Landroidx/compose/runtime/Composer;I)Ld0/v1;

    move-result-object v6

    invoke-virtual {v11}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v7

    sget-object v8, Lp1/l;->a:Lp1/v0;

    if-ne v7, v8, :cond_17

    new-instance v7, Lg1/z0;

    invoke-direct {v7}, Lg1/z0;-><init>()V

    invoke-virtual {v11, v7}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_17
    move-object/from16 v21, v7

    check-cast v21, Lg1/z0;

    move-object v7, v4

    check-cast v7, Lg1/r1;

    invoke-virtual {v7, v2, v11}, Lg1/r1;->c(Lk3/a;Landroidx/compose/runtime/Composer;)Lp1/t2;

    move-result-object v9

    invoke-virtual {v7, v1, v2, v11}, Lg1/r1;->b(ZLk3/a;Landroidx/compose/runtime/Composer;)Lp1/t2;

    move-result-object v10

    invoke-virtual {v7, v1, v2, v11}, Lg1/r1;->a(ZLk3/a;Landroidx/compose/runtime/Composer;)Lp1/t2;

    move-result-object v7

    sget-object v12, Lb2/e;->E:Lb2/m;

    const/4 v13, 0x2

    invoke-static {v3, v12, v15, v13}, Landroidx/compose/foundation/layout/d;->y(Landroidx/compose/ui/Modifier;Lb2/m;ZI)Landroidx/compose/ui/Modifier;

    move-result-object v12

    sget v13, Lg1/b1;->c:F

    invoke-static {v13, v12}, Landroidx/compose/foundation/layout/d;->l(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v12

    invoke-virtual {v11, v10}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v13

    invoke-virtual {v11, v7}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v14

    or-int/2addr v13, v14

    invoke-virtual {v11, v9}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v14

    or-int/2addr v13, v14

    invoke-virtual {v11, v0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v14

    or-int/2addr v13, v14

    invoke-virtual {v11, v6}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v14

    or-int/2addr v13, v14

    invoke-virtual {v11}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v14

    if-nez v13, :cond_18

    if-ne v14, v8, :cond_19

    :cond_18
    new-instance v20, Lam2/b;

    const/16 v27, 0x7

    move-object/from16 v25, v0

    move-object/from16 v26, v6

    move-object/from16 v23, v7

    move-object/from16 v24, v9

    move-object/from16 v22, v10

    invoke-direct/range {v20 .. v27}, Lam2/b;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    move-object/from16 v14, v20

    invoke-virtual {v11, v14}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_19
    check-cast v14, Lkotlin/jvm/functions/Function1;

    invoke-static {v12, v14, v11, v15}, Lj93/l0;->a(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    goto :goto_e

    :cond_1a
    invoke-virtual {v11}, Lp1/q;->X()V

    :goto_e
    invoke-virtual {v11}, Lp1/q;->u()Lp1/v1;

    move-result-object v7

    if-eqz v7, :cond_1b

    new-instance v0, Lar2/a;

    const/16 v6, 0x8

    invoke-direct/range {v0 .. v6}, Lar2/a;-><init>(ZLjava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;II)V

    iput-object v0, v7, Lp1/v1;->d:Lc93/m;

    :cond_1b
    return-void
.end method

.method public static final c(Lk3/a;Lc93/a;Landroidx/compose/ui/Modifier;ZLg1/a1;Landroidx/compose/runtime/Composer;I)V
    .locals 13

    move/from16 v4, p3

    move/from16 v0, p6

    move-object/from16 v8, p5

    check-cast v8, Lp1/q;

    const v1, 0x79127e9a

    invoke-virtual {v8, v1}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v1, v0, 0x6

    const/4 v2, 0x4

    if-nez v1, :cond_1

    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    invoke-virtual {v8, v1}, Lp1/q;->e(I)Z

    move-result v1

    if-eqz v1, :cond_0

    move v1, v2

    goto :goto_0

    :cond_0
    const/4 v1, 0x2

    :goto_0
    or-int/2addr v1, v0

    goto :goto_1

    :cond_1
    move v1, v0

    :goto_1
    and-int/lit8 v5, v0, 0x30

    if-nez v5, :cond_3

    invoke-virtual {v8, p1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_2

    const/16 v5, 0x20

    goto :goto_2

    :cond_2
    const/16 v5, 0x10

    :goto_2
    or-int/2addr v1, v5

    :cond_3
    and-int/lit16 v5, v0, 0x180

    if-nez v5, :cond_5

    invoke-virtual {v8, p2}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_4

    const/16 v5, 0x100

    goto :goto_3

    :cond_4
    const/16 v5, 0x80

    :goto_3
    or-int/2addr v1, v5

    :cond_5
    and-int/lit16 v5, v0, 0xc00

    if-nez v5, :cond_7

    invoke-virtual {v8, v4}, Lp1/q;->h(Z)Z

    move-result v5

    if-eqz v5, :cond_6

    const/16 v5, 0x800

    goto :goto_4

    :cond_6
    const/16 v5, 0x400

    :goto_4
    or-int/2addr v1, v5

    :cond_7
    and-int/lit16 v5, v0, 0x6000

    if-nez v5, :cond_9

    const/4 v5, 0x0

    invoke-virtual {v8, v5}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_8

    const/16 v5, 0x4000

    goto :goto_5

    :cond_8
    const/16 v5, 0x2000

    :goto_5
    or-int/2addr v1, v5

    :cond_9
    const/high16 v5, 0x30000

    and-int/2addr v5, v0

    if-nez v5, :cond_b

    move-object/from16 v5, p4

    invoke-virtual {v8, v5}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_a

    const/high16 v6, 0x20000

    goto :goto_6

    :cond_a
    const/high16 v6, 0x10000

    :goto_6
    or-int/2addr v1, v6

    goto :goto_7

    :cond_b
    move-object/from16 v5, p4

    :goto_7
    const v6, 0x12493

    and-int/2addr v6, v1

    const v7, 0x12492

    const/4 v9, 0x0

    const/4 v10, 0x1

    if-eq v6, v7, :cond_c

    move v6, v10

    goto :goto_8

    :cond_c
    move v6, v9

    :goto_8
    and-int/lit8 v7, v1, 0x1

    invoke-virtual {v8, v7, v6}, Lp1/q;->U(IZ)Z

    move-result v6

    if-eqz v6, :cond_11

    invoke-virtual {v8}, Lp1/q;->Z()V

    and-int/lit8 v6, v0, 0x1

    if-eqz v6, :cond_e

    invoke-virtual {v8}, Lp1/q;->C()Z

    move-result v6

    if-eqz v6, :cond_d

    goto :goto_9

    :cond_d
    invoke-virtual {v8}, Lp1/q;->X()V

    :cond_e
    :goto_9
    invoke-virtual {v8}, Lp1/q;->r()V

    sget-object v6, Lb2/t;->w:Lb2/t;

    if-eqz p1, :cond_f

    sget v7, Lg1/b1;->a:F

    const-wide/16 v11, 0x0

    invoke-static {v11, v12, v2, v9, v7}, Lg1/z4;->a(JIZF)Landroidx/compose/material/d;

    move-result-object v2

    new-instance v7, Li3/i;

    invoke-direct {v7, v10}, Li3/i;-><init>(I)V

    invoke-static {p0, v2, v4, v7, p1}, Landroidx/compose/foundation/selection/d;->c(Lk3/a;Landroidx/compose/material/d;ZLi3/i;Lc93/a;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    goto :goto_a

    :cond_f
    move-object v2, v6

    :goto_a
    if-eqz p1, :cond_10

    sget-object v6, Lg1/h3;->a:Lp1/u2;

    sget-object v6, Landroidx/compose/material/MinimumInteractiveModifier;->w:Landroidx/compose/material/MinimumInteractiveModifier;

    :cond_10
    invoke-interface {p2, v6}, Landroidx/compose/ui/Modifier;->e(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v6

    invoke-interface {v6, v2}, Landroidx/compose/ui/Modifier;->e(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    sget v6, Lg1/b1;->b:F

    invoke-static {v6, v2}, Landroidx/compose/foundation/layout/a;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v6

    shr-int/lit8 v2, v1, 0x9

    and-int/lit8 v2, v2, 0xe

    shl-int/lit8 v7, v1, 0x3

    and-int/lit8 v7, v7, 0x70

    or-int/2addr v2, v7

    shr-int/lit8 v1, v1, 0x6

    and-int/lit16 v1, v1, 0x1c00

    or-int v9, v2, v1

    move-object v7, v5

    move-object v5, p0

    invoke-static/range {v4 .. v9}, Lg1/b1;->b(ZLk3/a;Landroidx/compose/ui/Modifier;Lg1/a1;Landroidx/compose/runtime/Composer;I)V

    goto :goto_b

    :cond_11
    invoke-virtual {v8}, Lp1/q;->X()V

    :goto_b
    invoke-virtual {v8}, Lp1/q;->u()Lp1/v1;

    move-result-object v8

    if-eqz v8, :cond_12

    new-instance v0, Lb30/j2;

    const/4 v7, 0x4

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move/from16 v4, p3

    move-object/from16 v5, p4

    move/from16 v6, p6

    invoke-direct/range {v0 .. v7}, Lb30/j2;-><init>(Ljava/lang/Object;Ll83/e;Ljava/lang/Object;ZLjava/lang/Object;II)V

    iput-object v0, v8, Lp1/v1;->d:Lc93/m;

    :cond_12
    return-void
.end method
