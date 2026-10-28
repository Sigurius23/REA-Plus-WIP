.class public abstract Lg1/g6;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:F

.field public static final b:F

.field public static final c:F

.field public static final d:F

.field public static final e:F

.field public static final f:Landroidx/compose/ui/Modifier;

.field public static final g:Ld0/e2;


# direct methods
.method static constructor <clinit>()V
    .locals 7

    const/16 v0, 0xa

    int-to-float v0, v0

    sput v0, Lg1/g6;->a:F

    const/16 v0, 0x18

    int-to-float v0, v0

    sput v0, Lg1/g6;->b:F

    const/4 v0, 0x1

    int-to-float v1, v0

    sput v1, Lg1/g6;->c:F

    const/4 v1, 0x6

    int-to-float v2, v1

    sput v2, Lg1/g6;->d:F

    const/4 v2, 0x4

    int-to-float v2, v2

    sput v2, Lg1/g6;->e:F

    const/16 v2, 0x30

    int-to-float v2, v2

    const/16 v3, 0x90

    int-to-float v3, v3

    const/4 v4, 0x2

    sget-object v5, Lb2/t;->w:Lb2/t;

    const/4 v6, 0x0

    invoke-static {v5, v3, v6, v4}, Landroidx/compose/foundation/layout/d;->v(Landroidx/compose/ui/Modifier;FFI)Landroidx/compose/ui/Modifier;

    move-result-object v3

    invoke-static {v3, v6, v2, v0}, Landroidx/compose/foundation/layout/d;->j(Landroidx/compose/ui/Modifier;FFI)Landroidx/compose/ui/Modifier;

    move-result-object v0

    sput-object v0, Lg1/g6;->f:Landroidx/compose/ui/Modifier;

    new-instance v0, Ld0/e2;

    const/16 v2, 0x64

    const/4 v3, 0x0

    invoke-direct {v0, v2, v3, v1}, Ld0/e2;-><init>(ILd0/z;I)V

    sput-object v0, Lg1/g6;->g:Ld0/e2;

    return-void
.end method

.method public static final a(Lkotlin/jvm/functions/Function1;Li93/f;Li93/e;Lp1/c1;FLandroidx/compose/runtime/Composer;I)V
    .locals 12

    move-object/from16 v0, p5

    check-cast v0, Lp1/q;

    const v1, -0x2c580438

    invoke-virtual {v0, v1}, Lp1/q;->g0(I)Lp1/q;

    invoke-virtual {v0, p0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v1

    const/4 v2, 0x4

    if-eqz v1, :cond_0

    move v1, v2

    goto :goto_0

    :cond_0
    const/4 v1, 0x2

    :goto_0
    or-int v1, p6, v1

    invoke-virtual {v0, p1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v3

    const/16 v4, 0x20

    if-eqz v3, :cond_1

    move v3, v4

    goto :goto_1

    :cond_1
    const/16 v3, 0x10

    :goto_1
    or-int/2addr v1, v3

    invoke-virtual {v0, p2}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v3

    const/16 v5, 0x100

    if-eqz v3, :cond_2

    move v3, v5

    goto :goto_2

    :cond_2
    const/16 v3, 0x80

    :goto_2
    or-int/2addr v1, v3

    move/from16 v8, p4

    invoke-virtual {v0, v8}, Lp1/q;->d(F)Z

    move-result v3

    const/16 v6, 0x4000

    if-eqz v3, :cond_3

    move v3, v6

    goto :goto_3

    :cond_3
    const/16 v3, 0x2000

    :goto_3
    or-int/2addr v1, v3

    and-int/lit16 v3, v1, 0x2493

    const/16 v7, 0x2492

    const/4 v9, 0x0

    const/4 v11, 0x1

    if-eq v3, v7, :cond_4

    move v3, v11

    goto :goto_4

    :cond_4
    move v3, v9

    :goto_4
    and-int/lit8 v7, v1, 0x1

    invoke-virtual {v0, v7, v3}, Lp1/q;->U(IZ)Z

    move-result v3

    if-eqz v3, :cond_b

    and-int/lit8 v3, v1, 0x70

    if-ne v3, v4, :cond_5

    move v3, v11

    goto :goto_5

    :cond_5
    move v3, v9

    :goto_5
    and-int/lit8 v4, v1, 0xe

    if-ne v4, v2, :cond_6

    move v2, v11

    goto :goto_6

    :cond_6
    move v2, v9

    :goto_6
    or-int/2addr v2, v3

    const v3, 0xe000

    and-int/2addr v3, v1

    if-ne v3, v6, :cond_7

    move v3, v11

    goto :goto_7

    :cond_7
    move v3, v9

    :goto_7
    or-int/2addr v2, v3

    and-int/lit16 v1, v1, 0x380

    if-ne v1, v5, :cond_8

    move v9, v11

    :cond_8
    or-int v1, v2, v9

    invoke-virtual {v0}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    if-nez v1, :cond_9

    sget-object v1, Lp1/l;->a:Lp1/v0;

    if-ne v2, v1, :cond_a

    :cond_9
    new-instance v5, Lg1/q5;

    move-object v7, p0

    move-object v6, p1

    move-object v10, p2

    move-object v9, p3

    invoke-direct/range {v5 .. v10}, Lg1/q5;-><init>(Li93/f;Lkotlin/jvm/functions/Function1;FLp1/c1;Li93/e;)V

    invoke-virtual {v0, v5}, Lp1/q;->p0(Ljava/lang/Object;)V

    move-object v2, v5

    :cond_a
    check-cast v2, Lc93/a;

    invoke-static {v2, v0}, Lp1/x;->k(Lc93/a;Landroidx/compose/runtime/Composer;)V

    goto :goto_8

    :cond_b
    invoke-virtual {v0}, Lp1/q;->X()V

    :goto_8
    invoke-virtual {v0}, Lp1/q;->u()Lp1/v1;

    move-result-object v0

    if-eqz v0, :cond_c

    new-instance v5, Lg1/r5;

    move-object v6, p0

    move-object v7, p1

    move-object v8, p2

    move-object v9, p3

    move/from16 v10, p4

    move/from16 v11, p6

    invoke-direct/range {v5 .. v11}, Lg1/r5;-><init>(Lkotlin/jvm/functions/Function1;Li93/f;Li93/e;Lp1/c1;FI)V

    iput-object v5, v0, Lp1/v1;->d:Lc93/m;

    :cond_c
    return-void
.end method

.method public static final b(FLkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZLi93/f;ILc93/a;Lg1/w1;Landroidx/compose/runtime/Composer;II)V
    .locals 36

    move/from16 v5, p0

    move-object/from16 v2, p1

    move/from16 v10, p10

    move-object/from16 v0, p8

    check-cast v0, Lp1/q;

    const v1, -0x74f6dbdc

    invoke-virtual {v0, v1}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v1, p9, 0x6

    if-nez v1, :cond_1

    invoke-virtual {v0, v5}, Lp1/q;->d(F)Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, 0x4

    goto :goto_0

    :cond_0
    const/4 v1, 0x2

    :goto_0
    or-int v1, p9, v1

    goto :goto_1

    :cond_1
    move/from16 v1, p9

    :goto_1
    and-int/lit8 v4, p9, 0x30

    if-nez v4, :cond_3

    invoke-virtual {v0, v2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_2

    const/16 v4, 0x20

    goto :goto_2

    :cond_2
    const/16 v4, 0x10

    :goto_2
    or-int/2addr v1, v4

    :cond_3
    and-int/lit8 v4, v10, 0x4

    if-eqz v4, :cond_4

    or-int/lit16 v1, v1, 0x180

    move-object/from16 v6, p2

    goto :goto_4

    :cond_4
    move-object/from16 v6, p2

    invoke-virtual {v0, v6}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_5

    const/16 v7, 0x100

    goto :goto_3

    :cond_5
    const/16 v7, 0x80

    :goto_3
    or-int/2addr v1, v7

    :goto_4
    and-int/lit8 v7, v10, 0x8

    if-eqz v7, :cond_6

    or-int/lit16 v1, v1, 0xc00

    move/from16 v8, p3

    goto :goto_6

    :cond_6
    move/from16 v8, p3

    invoke-virtual {v0, v8}, Lp1/q;->h(Z)Z

    move-result v9

    if-eqz v9, :cond_7

    const/16 v9, 0x800

    goto :goto_5

    :cond_7
    const/16 v9, 0x400

    :goto_5
    or-int/2addr v1, v9

    :goto_6
    and-int/lit8 v9, v10, 0x10

    if-nez v9, :cond_8

    move-object/from16 v9, p4

    invoke-virtual {v0, v9}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_9

    const/16 v11, 0x4000

    goto :goto_7

    :cond_8
    move-object/from16 v9, p4

    :cond_9
    const/16 v11, 0x2000

    :goto_7
    or-int/2addr v1, v11

    and-int/lit8 v11, v10, 0x20

    if-eqz v11, :cond_a

    const/high16 v13, 0x30000

    or-int/2addr v1, v13

    move/from16 v13, p5

    goto :goto_9

    :cond_a
    move/from16 v13, p5

    invoke-virtual {v0, v13}, Lp1/q;->e(I)Z

    move-result v14

    if-eqz v14, :cond_b

    const/high16 v14, 0x20000

    goto :goto_8

    :cond_b
    const/high16 v14, 0x10000

    :goto_8
    or-int/2addr v1, v14

    :goto_9
    and-int/lit8 v14, v10, 0x40

    if-eqz v14, :cond_c

    const/high16 v15, 0x180000

    or-int/2addr v1, v15

    move-object/from16 v15, p6

    goto :goto_b

    :cond_c
    move-object/from16 v15, p6

    invoke-virtual {v0, v15}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v16

    if-eqz v16, :cond_d

    const/high16 v16, 0x100000

    goto :goto_a

    :cond_d
    const/high16 v16, 0x80000

    :goto_a
    or-int v1, v1, v16

    :goto_b
    const/high16 v16, 0xc00000

    or-int v1, v1, v16

    and-int/lit16 v12, v10, 0x100

    if-nez v12, :cond_e

    move-object/from16 v12, p7

    invoke-virtual {v0, v12}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v16

    if-eqz v16, :cond_f

    const/high16 v16, 0x4000000

    goto :goto_c

    :cond_e
    move-object/from16 v12, p7

    :cond_f
    const/high16 v16, 0x2000000

    :goto_c
    or-int v1, v1, v16

    const v16, 0x2492493

    and-int v3, v1, v16

    move/from16 v16, v1

    const v1, 0x2492492

    move/from16 v17, v11

    const/4 v11, 0x1

    if-eq v3, v1, :cond_10

    move v1, v11

    goto :goto_d

    :cond_10
    const/4 v1, 0x0

    :goto_d
    and-int/lit8 v3, v16, 0x1

    invoke-virtual {v0, v3, v1}, Lp1/q;->U(IZ)Z

    move-result v1

    if-eqz v1, :cond_24

    invoke-virtual {v0}, Lp1/q;->Z()V

    and-int/lit8 v1, p9, 0x1

    const v3, -0xe000001

    const v19, -0xe001

    if-eqz v1, :cond_14

    invoke-virtual {v0}, Lp1/q;->C()Z

    move-result v1

    if-eqz v1, :cond_11

    goto :goto_f

    :cond_11
    invoke-virtual {v0}, Lp1/q;->X()V

    and-int/lit8 v1, v10, 0x10

    if-eqz v1, :cond_12

    and-int v1, v16, v19

    goto :goto_e

    :cond_12
    move/from16 v1, v16

    :goto_e
    and-int/lit16 v4, v10, 0x100

    if-eqz v4, :cond_13

    and-int/2addr v1, v3

    :cond_13
    move v3, v8

    move v8, v1

    move-object v1, v9

    move-object v9, v6

    move v6, v3

    move v4, v13

    move-object v7, v15

    const/high16 v3, 0x20000

    move-object v13, v0

    const/4 v0, 0x0

    goto/16 :goto_13

    :cond_14
    :goto_f
    if-eqz v4, :cond_15

    sget-object v1, Lb2/t;->w:Lb2/t;

    move-object v6, v1

    :cond_15
    if-eqz v7, :cond_16

    move v8, v11

    :cond_16
    and-int/lit8 v1, v10, 0x10

    if-eqz v1, :cond_17

    new-instance v1, Li93/e;

    const/4 v4, 0x0

    const/high16 v7, 0x3f800000    # 1.0f

    invoke-direct {v1, v4, v7}, Li93/e;-><init>(FF)V

    and-int v4, v16, v19

    move-object v9, v1

    move v1, v4

    goto :goto_10

    :cond_17
    move/from16 v1, v16

    :goto_10
    if-eqz v17, :cond_18

    const/4 v4, 0x0

    goto :goto_11

    :cond_18
    move v4, v13

    :goto_11
    if-eqz v14, :cond_19

    const/4 v7, 0x0

    goto :goto_12

    :cond_19
    move-object v7, v15

    :goto_12
    and-int/lit16 v13, v10, 0x100

    if-eqz v13, :cond_1a

    const/16 v32, 0x0

    const/16 v33, 0x3ff

    move v13, v11

    const-wide/16 v11, 0x0

    move v15, v13

    const-wide/16 v13, 0x0

    move/from16 v17, v15

    const-wide/16 v15, 0x0

    move/from16 v20, v17

    const/16 v19, 0x0

    const-wide/16 v17, 0x0

    move/from16 v21, v19

    move/from16 v22, v20

    const-wide/16 v19, 0x0

    move/from16 v23, v21

    move/from16 v24, v22

    const-wide/16 v21, 0x0

    move/from16 v25, v23

    move/from16 v26, v24

    const-wide/16 v23, 0x0

    move/from16 v27, v25

    move/from16 v28, v26

    const-wide/16 v25, 0x0

    move/from16 v29, v27

    move/from16 v30, v28

    const-wide/16 v27, 0x0

    move/from16 v31, v29

    move/from16 v34, v30

    const-wide/16 v29, 0x0

    move/from16 p8, v31

    move-object/from16 v31, v0

    move/from16 v0, p8

    move/from16 p8, v3

    const/high16 v3, 0x20000

    invoke-static/range {v11 .. v33}, Lse/b;->v(JJJJJJJJJJLandroidx/compose/runtime/Composer;II)Lg1/w1;

    move-result-object v11

    move-object/from16 v13, v31

    and-int v1, v1, p8

    move v12, v8

    move v8, v1

    move-object v1, v9

    move-object v9, v6

    move v6, v12

    move-object v12, v11

    goto :goto_13

    :cond_1a
    move-object v13, v0

    const/4 v0, 0x0

    const/high16 v3, 0x20000

    move/from16 v35, v8

    move v8, v1

    move-object v1, v9

    move-object v9, v6

    move/from16 v6, v35

    :goto_13
    invoke-virtual {v13}, Lp1/q;->r()V

    const v11, -0x4333f249

    invoke-virtual {v13, v11}, Lp1/q;->e0(I)V

    invoke-virtual {v13}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v11

    sget-object v14, Lp1/l;->a:Lp1/v0;

    if-ne v11, v14, :cond_1b

    invoke-static {v13}, Ld;->g(Lp1/q;)Lj0/j;

    move-result-object v11

    :cond_1b
    check-cast v11, Lj0/i;

    invoke-virtual {v13, v0}, Lp1/q;->q(Z)V

    const-string v15, "steps should be >= 0"

    if-ltz v4, :cond_23

    move/from16 v16, v4

    invoke-static {v2, v13}, Lp1/x;->F(Ljava/lang/Object;Landroidx/compose/runtime/Composer;)Lp1/c1;

    move-result-object v4

    move-object v0, v7

    invoke-static {v0, v13}, Lp1/x;->F(Ljava/lang/Object;Landroidx/compose/runtime/Composer;)Lp1/c1;

    move-result-object v7

    const/high16 v17, 0x70000

    and-int v8, v8, v17

    if-ne v8, v3, :cond_1c

    const/4 v3, 0x1

    goto :goto_14

    :cond_1c
    const/4 v3, 0x0

    :goto_14
    invoke-virtual {v13}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v8

    if-nez v3, :cond_1e

    if-ne v8, v14, :cond_1d

    goto :goto_15

    :cond_1d
    move-object/from16 p8, v0

    goto :goto_18

    :cond_1e
    :goto_15
    if-nez v16, :cond_1f

    sget-object v3, Lm83/y;->w:Lm83/y;

    move-object v8, v3

    move-object/from16 p8, v0

    goto :goto_17

    :cond_1f
    add-int/lit8 v3, v16, 0x2

    new-instance v8, Ljava/util/ArrayList;

    invoke-direct {v8, v3}, Ljava/util/ArrayList;-><init>(I)V

    const/4 v14, 0x0

    :goto_16
    move-object/from16 p8, v0

    if-ge v14, v3, :cond_20

    int-to-float v0, v14

    move/from16 v17, v0

    add-int/lit8 v0, v16, 0x1

    int-to-float v0, v0

    div-float v0, v17, v0

    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v0

    invoke-virtual {v8, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v14, v14, 0x1

    move-object/from16 v0, p8

    goto :goto_16

    :cond_20
    :goto_17
    invoke-virtual {v13, v8}, Lp1/q;->p0(Ljava/lang/Object;)V

    :goto_18
    check-cast v8, Ljava/util/List;

    sget-object v0, Lg1/h3;->a:Lp1/u2;

    sget-object v0, Landroidx/compose/material/MinimumInteractiveModifier;->w:Landroidx/compose/material/MinimumInteractiveModifier;

    invoke-interface {v9, v0}, Landroidx/compose/ui/Modifier;->e(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    sget v3, Lg1/g6;->a:F

    const/4 v14, 0x2

    int-to-float v14, v14

    mul-float/2addr v3, v14

    const/4 v14, 0x0

    const/16 v17, 0xc

    const/16 v19, 0x0

    move/from16 v20, v3

    move-object/from16 p2, v0

    move/from16 p3, v3

    move/from16 p6, v14

    move/from16 p7, v17

    move/from16 p5, v19

    move/from16 p4, v20

    invoke-static/range {p2 .. p7}, Landroidx/compose/foundation/layout/d;->n(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v0

    invoke-interface {v1}, Li93/g;->getStart()Ljava/lang/Comparable;

    move-result-object v3

    check-cast v3, Ljava/lang/Number;

    invoke-virtual {v3}, Ljava/lang/Number;->floatValue()F

    move-result v3

    invoke-interface {v1}, Li93/g;->d()Ljava/lang/Comparable;

    move-result-object v14

    check-cast v14, Ljava/lang/Number;

    invoke-virtual {v14}, Ljava/lang/Number;->floatValue()F

    move-result v14

    invoke-static {v5, v3, v14}, Le93/b;->m(FFF)F

    move-result v3

    new-instance v14, Lg1/p5;

    move-object/from16 p4, v1

    move-object/from16 p7, v2

    move/from16 p6, v3

    move/from16 p3, v6

    move-object/from16 p2, v14

    move/from16 p5, v16

    invoke-direct/range {p2 .. p8}, Lg1/p5;-><init>(ZLi93/f;IFLkotlin/jvm/functions/Function1;Lc93/a;)V

    move-object/from16 v2, p2

    move/from16 v3, p5

    move-object/from16 v14, p8

    move-object/from16 p2, v4

    const/4 v4, 0x0

    invoke-static {v0, v4, v2}, Li3/n;->c(Landroidx/compose/ui/Modifier;ZLkotlin/jvm/functions/Function1;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    new-instance v2, Lf0/j1;

    invoke-direct {v2, v5, v1, v3}, Lf0/j1;-><init>(FLi93/f;I)V

    const/4 v4, 0x1

    invoke-static {v0, v4, v2}, Li3/n;->c(Landroidx/compose/ui/Modifier;ZLkotlin/jvm/functions/Function1;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    invoke-static {v0, v6, v11}, Landroidx/compose/foundation/c;->a(Landroidx/compose/ui/Modifier;ZLj0/i;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    sget-object v2, Lb3/v1;->n:Lp1/u2;

    invoke-virtual {v13, v2}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v2

    sget-object v4, Ly3/m;->x:Ly3/m;

    if-ne v2, v4, :cond_21

    const/16 v17, 0x1

    goto :goto_19

    :cond_21
    const/16 v17, 0x0

    :goto_19
    if-ltz v3, :cond_22

    move-object v2, v0

    new-instance v0, Lg1/c6;

    move-object/from16 v4, p2

    move-object v15, v2

    move-object v2, v1

    move v1, v6

    move/from16 v6, v17

    invoke-direct/range {v0 .. v7}, Lg1/c6;-><init>(ZLi93/f;ILp1/c1;FZLp1/c1;)V

    move v6, v1

    move-object v1, v2

    move/from16 v16, v3

    invoke-static {v15, v0}, Landroidx/compose/ui/input/key/a;->a(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;)Landroidx/compose/ui/Modifier;

    move-result-object v15

    new-instance v0, Lg1/z5;

    move/from16 v2, p0

    move-object v3, v8

    move-object v5, v11

    move-object v7, v12

    move-object v8, v4

    move-object v4, v14

    invoke-direct/range {v0 .. v8}, Lg1/z5;-><init>(Li93/f;FLjava/util/List;Lc93/a;Lj0/i;ZLg1/w1;Lp1/c1;)V

    const v2, 0x7c485b8e

    invoke-static {v2, v13, v0}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v0

    const/16 v2, 0xc00

    const/4 v3, 0x6

    const/4 v4, 0x0

    const/4 v5, 0x0

    move-object/from16 p5, v0

    move/from16 p7, v2

    move/from16 p8, v3

    move-object/from16 p3, v4

    move/from16 p4, v5

    move-object/from16 p6, v13

    move-object/from16 p2, v15

    invoke-static/range {p2 .. p8}, Ll0/f;->a(Landroidx/compose/ui/Modifier;Lb2/h;ZLkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V

    move-object/from16 v31, p6

    move-object v5, v1

    move v4, v6

    move-object v8, v7

    move-object v3, v9

    move-object v7, v14

    move/from16 v6, v16

    goto :goto_1a

    :cond_22
    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-direct {v0, v15}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_23
    new-instance v0, Ljava/lang/IllegalArgumentException;

    invoke-direct {v0, v15}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_24
    move-object/from16 v31, v0

    invoke-virtual/range {v31 .. v31}, Lp1/q;->X()V

    move-object v3, v6

    move v4, v8

    move-object v5, v9

    move-object v8, v12

    move v6, v13

    move-object v7, v15

    :goto_1a
    invoke-virtual/range {v31 .. v31}, Lp1/q;->u()Lp1/v1;

    move-result-object v11

    if-eqz v11, :cond_25

    new-instance v0, Lg1/o5;

    move/from16 v1, p0

    move-object/from16 v2, p1

    move/from16 v9, p9

    invoke-direct/range {v0 .. v10}, Lg1/o5;-><init>(FLkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZLi93/f;ILc93/a;Lg1/w1;II)V

    iput-object v0, v11, Lp1/v1;->d:Lc93/m;

    :cond_25
    return-void
.end method

.method public static final c(ZFLjava/util/List;Lg1/w1;FLj0/i;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V
    .locals 18

    move/from16 v2, p1

    move/from16 v9, p4

    move-object/from16 v10, p6

    move-object/from16 v7, p7

    check-cast v7, Lp1/q;

    const v0, 0x641dece1

    invoke-virtual {v7, v0}, Lp1/q;->g0(I)Lp1/q;

    move/from16 v1, p0

    invoke-virtual {v7, v1}, Lp1/q;->h(Z)Z

    move-result v0

    const/4 v3, 0x2

    if-eqz v0, :cond_0

    const/4 v0, 0x4

    goto :goto_0

    :cond_0
    move v0, v3

    :goto_0
    or-int v0, p8, v0

    invoke-virtual {v7, v2}, Lp1/q;->d(F)Z

    move-result v4

    if-eqz v4, :cond_1

    const/16 v4, 0x20

    goto :goto_1

    :cond_1
    const/16 v4, 0x10

    :goto_1
    or-int/2addr v0, v4

    move-object/from16 v4, p2

    invoke-virtual {v7, v4}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_2

    const/16 v5, 0x100

    goto :goto_2

    :cond_2
    const/16 v5, 0x80

    :goto_2
    or-int/2addr v0, v5

    move-object/from16 v5, p3

    invoke-virtual {v7, v5}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_3

    const/16 v6, 0x800

    goto :goto_3

    :cond_3
    const/16 v6, 0x400

    :goto_3
    or-int/2addr v0, v6

    invoke-virtual {v7, v9}, Lp1/q;->d(F)Z

    move-result v6

    if-eqz v6, :cond_4

    const/16 v6, 0x4000

    goto :goto_4

    :cond_4
    const/16 v6, 0x2000

    :goto_4
    or-int/2addr v0, v6

    move-object/from16 v11, p5

    invoke-virtual {v7, v11}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_5

    const/high16 v6, 0x20000

    goto :goto_5

    :cond_5
    const/high16 v6, 0x10000

    :goto_5
    or-int/2addr v0, v6

    invoke-virtual {v7, v10}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_6

    const/high16 v6, 0x100000

    goto :goto_6

    :cond_6
    const/high16 v6, 0x80000

    :goto_6
    or-int v12, v0, v6

    const v0, 0x92493

    and-int/2addr v0, v12

    const v6, 0x92492

    const/4 v8, 0x0

    if-eq v0, v6, :cond_7

    const/4 v0, 0x1

    goto :goto_7

    :cond_7
    move v0, v8

    :goto_7
    and-int/lit8 v6, v12, 0x1

    invoke-virtual {v7, v6, v0}, Lp1/q;->U(IZ)Z

    move-result v0

    if-eqz v0, :cond_b

    sget-object v0, Lg1/g6;->f:Landroidx/compose/ui/Modifier;

    invoke-interface {v10, v0}, Landroidx/compose/ui/Modifier;->e(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    sget-object v6, Lb2/e;->w:Lb2/m;

    invoke-static {v6, v8}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v6

    iget-wide v14, v7, Lp1/q;->T:J

    invoke-static {v14, v15}, Ljava/lang/Long;->hashCode(J)I

    move-result v8

    invoke-virtual {v7}, Lp1/q;->m()Lp1/p1;

    move-result-object v14

    invoke-static {v7, v0}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    sget-object v15, La3/l;->a:La3/k;

    invoke-virtual {v15}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v15, La3/k;->b:La3/j;

    invoke-virtual {v7}, Lp1/q;->i0()V

    iget-boolean v13, v7, Lp1/q;->S:Z

    if-eqz v13, :cond_8

    invoke-virtual {v7, v15}, Lp1/q;->l(Lc93/a;)V

    goto :goto_8

    :cond_8
    invoke-virtual {v7}, Lp1/q;->s0()V

    :goto_8
    sget-object v13, La3/k;->g:La3/i;

    invoke-static {v7, v13, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v6, La3/k;->f:La3/i;

    invoke-static {v7, v6, v14}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v6, La3/k;->j:La3/i;

    iget-boolean v13, v7, Lp1/q;->S:Z

    if-nez v13, :cond_9

    invoke-virtual {v7}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v13

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v14

    invoke-static {v13, v14}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v13

    if-nez v13, :cond_a

    :cond_9
    invoke-static {v8, v7, v8, v6}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_a
    sget-object v6, La3/k;->d:La3/i;

    invoke-static {v7, v6, v0}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v0, Lb3/v1;->h:Lp1/u2;

    invoke-virtual {v7, v0}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ly3/c;

    sget v6, Lg1/g6;->e:F

    invoke-interface {v0, v6}, Ly3/c;->q0(F)F

    move-result v6

    sget v8, Lg1/g6;->a:F

    invoke-interface {v0, v8}, Ly3/c;->q0(F)F

    move-result v5

    invoke-interface {v0, v9}, Ly3/c;->f0(F)F

    move-result v0

    int-to-float v3, v3

    mul-float v13, v8, v3

    mul-float v14, v0, v2

    sget-object v0, Lb2/t;->w:Lb2/t;

    const/high16 v3, 0x3f800000    # 1.0f

    invoke-static {v3, v0}, Landroidx/compose/foundation/layout/d;->d(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    shr-int/lit8 v15, v12, 0x6

    and-int/lit8 v3, v15, 0x70

    or-int/lit16 v3, v3, 0xc06

    shl-int/lit8 v8, v12, 0x6

    and-int/lit16 v8, v8, 0x380

    or-int/2addr v3, v8

    shl-int/lit8 v8, v12, 0x9

    const v16, 0xe000

    and-int v17, v8, v16

    or-int v3, v3, v17

    const/high16 v17, 0x70000

    and-int v8, v8, v17

    or-int/2addr v8, v3

    move v3, v2

    move v2, v1

    move-object/from16 v1, p3

    invoke-static/range {v0 .. v8}, Lg1/g6;->e(Landroidx/compose/ui/Modifier;Lg1/w1;ZFLjava/util/List;FFLandroidx/compose/runtime/Composer;I)V

    and-int/lit16 v0, v15, 0x1c00

    const v1, 0x180036

    or-int/2addr v0, v1

    shl-int/lit8 v1, v12, 0x3

    and-int v1, v1, v16

    or-int/2addr v0, v1

    shl-int/lit8 v1, v12, 0xf

    and-int v1, v1, v17

    or-int v6, v0, v1

    move/from16 v3, p0

    move-object/from16 v2, p3

    move-object v5, v7

    move-object v1, v11

    move v4, v13

    move v0, v14

    invoke-static/range {v0 .. v6}, Lg1/g6;->d(FLj0/i;Lg1/w1;ZFLandroidx/compose/runtime/Composer;I)V

    const/4 v0, 0x1

    invoke-virtual {v7, v0}, Lp1/q;->q(Z)V

    goto :goto_9

    :cond_b
    invoke-virtual {v7}, Lp1/q;->X()V

    :goto_9
    invoke-virtual {v7}, Lp1/q;->u()Lp1/v1;

    move-result-object v11

    if-eqz v11, :cond_c

    new-instance v0, Lg1/s5;

    move/from16 v1, p0

    move/from16 v2, p1

    move-object/from16 v3, p2

    move-object/from16 v4, p3

    move-object/from16 v6, p5

    move/from16 v8, p8

    move v5, v9

    move-object v7, v10

    invoke-direct/range {v0 .. v8}, Lg1/s5;-><init>(ZFLjava/util/List;Lg1/w1;FLj0/i;Landroidx/compose/ui/Modifier;I)V

    iput-object v0, v11, Lp1/v1;->d:Lc93/m;

    :cond_c
    return-void
.end method

.method public static final d(FLj0/i;Lg1/w1;ZFLandroidx/compose/runtime/Composer;I)V
    .locals 26

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move/from16 v4, p3

    move/from16 v5, p4

    move/from16 v6, p6

    move-object/from16 v0, p5

    check-cast v0, Lp1/q;

    const v1, 0x19909aaa

    invoke-virtual {v0, v1}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v1, v6, 0x6

    sget-object v8, Landroidx/compose/foundation/layout/b;->a:Landroidx/compose/foundation/layout/b;

    if-nez v1, :cond_1

    invoke-virtual {v0, v8}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, 0x4

    goto :goto_0

    :cond_0
    const/4 v1, 0x2

    :goto_0
    or-int/2addr v1, v6

    goto :goto_1

    :cond_1
    move v1, v6

    :goto_1
    and-int/lit8 v9, v6, 0x30

    sget-object v10, Lb2/t;->w:Lb2/t;

    if-nez v9, :cond_3

    invoke-virtual {v0, v10}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_2

    const/16 v9, 0x20

    goto :goto_2

    :cond_2
    const/16 v9, 0x10

    :goto_2
    or-int/2addr v1, v9

    :cond_3
    and-int/lit16 v9, v6, 0x180

    move/from16 v11, p0

    if-nez v9, :cond_5

    invoke-virtual {v0, v11}, Lp1/q;->d(F)Z

    move-result v9

    if-eqz v9, :cond_4

    const/16 v9, 0x100

    goto :goto_3

    :cond_4
    const/16 v9, 0x80

    :goto_3
    or-int/2addr v1, v9

    :cond_5
    and-int/lit16 v9, v6, 0xc00

    const/16 v12, 0x800

    if-nez v9, :cond_7

    invoke-virtual {v0, v2}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_6

    move v9, v12

    goto :goto_4

    :cond_6
    const/16 v9, 0x400

    :goto_4
    or-int/2addr v1, v9

    :cond_7
    and-int/lit16 v9, v6, 0x6000

    if-nez v9, :cond_9

    invoke-virtual {v0, v3}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_8

    const/16 v9, 0x4000

    goto :goto_5

    :cond_8
    const/16 v9, 0x2000

    :goto_5
    or-int/2addr v1, v9

    :cond_9
    const/high16 v9, 0x30000

    and-int/2addr v9, v6

    if-nez v9, :cond_b

    invoke-virtual {v0, v4}, Lp1/q;->h(Z)Z

    move-result v9

    if-eqz v9, :cond_a

    const/high16 v9, 0x20000

    goto :goto_6

    :cond_a
    const/high16 v9, 0x10000

    :goto_6
    or-int/2addr v1, v9

    :cond_b
    const/high16 v9, 0x180000

    and-int/2addr v9, v6

    if-nez v9, :cond_d

    invoke-virtual {v0, v5}, Lp1/q;->d(F)Z

    move-result v9

    if-eqz v9, :cond_c

    const/high16 v9, 0x100000

    goto :goto_7

    :cond_c
    const/high16 v9, 0x80000

    :goto_7
    or-int/2addr v1, v9

    :cond_d
    const v9, 0x92493

    and-int/2addr v9, v1

    const v13, 0x92492

    const/4 v14, 0x1

    const/4 v15, 0x0

    if-eq v9, v13, :cond_e

    move v9, v14

    goto :goto_8

    :cond_e
    move v9, v15

    :goto_8
    and-int/lit8 v13, v1, 0x1

    invoke-virtual {v0, v13, v9}, Lp1/q;->U(IZ)Z

    move-result v9

    if-eqz v9, :cond_19

    move v9, v14

    const/4 v14, 0x0

    move v13, v15

    const/16 v15, 0xe

    move/from16 v16, v12

    const/4 v12, 0x0

    move/from16 v17, v13

    const/4 v13, 0x0

    move/from16 v9, v16

    move/from16 v7, v17

    invoke-static/range {v10 .. v15}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v12

    sget-object v11, Lb2/e;->z:Lb2/m;

    invoke-virtual {v8, v12, v11}, Landroidx/compose/foundation/layout/b;->a(Landroidx/compose/ui/Modifier;Lb2/h;)Landroidx/compose/ui/Modifier;

    move-result-object v8

    sget-object v11, Lb2/e;->w:Lb2/m;

    invoke-static {v11, v7}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v11

    iget-wide v12, v0, Lp1/q;->T:J

    invoke-static {v12, v13}, Ljava/lang/Long;->hashCode(J)I

    move-result v12

    invoke-virtual {v0}, Lp1/q;->m()Lp1/p1;

    move-result-object v13

    invoke-static {v0, v8}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v8

    sget-object v14, La3/l;->a:La3/k;

    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v14, La3/k;->b:La3/j;

    invoke-virtual {v0}, Lp1/q;->i0()V

    iget-boolean v15, v0, Lp1/q;->S:Z

    if-eqz v15, :cond_f

    invoke-virtual {v0, v14}, Lp1/q;->l(Lc93/a;)V

    goto :goto_9

    :cond_f
    invoke-virtual {v0}, Lp1/q;->s0()V

    :goto_9
    sget-object v14, La3/k;->g:La3/i;

    invoke-static {v0, v14, v11}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v11, La3/k;->f:La3/i;

    invoke-static {v0, v11, v13}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v11, La3/k;->j:La3/i;

    iget-boolean v13, v0, Lp1/q;->S:Z

    if-nez v13, :cond_10

    invoke-virtual {v0}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v13

    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v14

    invoke-static {v13, v14}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v13

    if-nez v13, :cond_11

    :cond_10
    invoke-static {v12, v0, v12, v11}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_11
    sget-object v11, La3/k;->d:La3/i;

    invoke-static {v0, v11, v8}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual {v0}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v8

    sget-object v11, Lp1/l;->a:Lp1/v0;

    if-ne v8, v11, :cond_12

    new-instance v8, Lz1/p;

    invoke-direct {v8}, Lz1/p;-><init>()V

    invoke-virtual {v0, v8}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_12
    check-cast v8, Lz1/p;

    and-int/lit16 v1, v1, 0x1c00

    if-ne v1, v9, :cond_13

    const/4 v14, 0x1

    goto :goto_a

    :cond_13
    move v14, v7

    :goto_a
    invoke-virtual {v0}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    if-nez v14, :cond_14

    if-ne v1, v11, :cond_15

    :cond_14
    new-instance v1, Lg1/o1;

    const/4 v9, 0x1

    const/4 v11, 0x0

    invoke-direct {v1, v2, v8, v11, v9}, Lg1/o1;-><init>(Lj0/i;Lz1/p;Lq83/d;I)V

    invoke-virtual {v0, v1}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_15
    check-cast v1, Lc93/m;

    invoke-static {v0, v1, v2}, Lp1/x;->g(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual {v8}, Lz1/p;->isEmpty()Z

    move-result v1

    if-nez v1, :cond_16

    sget v1, Lg1/g6;->d:F

    goto :goto_b

    :cond_16
    sget v1, Lg1/g6;->c:F

    :goto_b
    invoke-static {v10, v5, v5}, Landroidx/compose/foundation/layout/d;->r(Landroidx/compose/ui/Modifier;FF)Landroidx/compose/ui/Modifier;

    move-result-object v8

    sget v9, Lg1/g6;->b:F

    const-wide/16 v10, 0x0

    const/4 v12, 0x4

    invoke-static {v10, v11, v12, v7, v9}, Lg1/z4;->a(JIZF)Landroidx/compose/material/d;

    move-result-object v9

    invoke-static {v8, v2, v9}, Landroidx/compose/foundation/d;->a(Landroidx/compose/ui/Modifier;Lj0/i;Lf0/v0;)Landroidx/compose/ui/Modifier;

    move-result-object v8

    invoke-static {v8, v2}, Landroidx/compose/foundation/c;->b(Landroidx/compose/ui/Modifier;Lj0/i;)Landroidx/compose/ui/Modifier;

    move-result-object v17

    if-eqz v4, :cond_17

    :goto_c
    move/from16 v18, v1

    goto :goto_d

    :cond_17
    int-to-float v1, v7

    goto :goto_c

    :goto_d
    sget-object v19, Lt0/j;->a:Lt0/i;

    const-wide/16 v23, 0x0

    const/16 v25, 0x18

    const/16 v20, 0x0

    const-wide/16 v21, 0x0

    invoke-static/range {v17 .. v25}, Le93/b;->a0(Landroidx/compose/ui/Modifier;FLi2/a1;ZJJI)Landroidx/compose/ui/Modifier;

    move-result-object v1

    move-object/from16 v8, v19

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const v9, -0x67579f35

    invoke-virtual {v0, v9}, Lp1/q;->e0(I)V

    if-eqz v4, :cond_18

    iget-wide v9, v3, Lg1/w1;->a:J

    goto :goto_e

    :cond_18
    iget-wide v9, v3, Lg1/w1;->b:J

    :goto_e
    new-instance v11, Li2/x;

    invoke-direct {v11, v9, v10}, Li2/x;-><init>(J)V

    invoke-static {v11, v0}, Lp1/x;->F(Ljava/lang/Object;Landroidx/compose/runtime/Composer;)Lp1/c1;

    move-result-object v9

    invoke-virtual {v0, v7}, Lp1/q;->q(Z)V

    invoke-interface {v9}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Li2/x;

    iget-wide v9, v7, Li2/x;->a:J

    invoke-static {v1, v9, v10, v8}, Landroidx/compose/foundation/a;->c(Landroidx/compose/ui/Modifier;JLi2/a1;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    invoke-static {v0, v1}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    const/4 v9, 0x1

    invoke-virtual {v0, v9}, Lp1/q;->q(Z)V

    goto :goto_f

    :cond_19
    invoke-virtual {v0}, Lp1/q;->X()V

    :goto_f
    invoke-virtual {v0}, Lp1/q;->u()Lp1/v1;

    move-result-object v7

    if-eqz v7, :cond_1a

    new-instance v0, Lg1/t5;

    move/from16 v1, p0

    invoke-direct/range {v0 .. v6}, Lg1/t5;-><init>(FLj0/i;Lg1/w1;ZFI)V

    iput-object v0, v7, Lp1/v1;->d:Lc93/m;

    :cond_1a
    return-void
.end method

.method public static final e(Landroidx/compose/ui/Modifier;Lg1/w1;ZFLjava/util/List;FFLandroidx/compose/runtime/Composer;I)V
    .locals 18

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move/from16 v3, p2

    move-object/from16 v10, p4

    move/from16 v0, p8

    move-object/from16 v13, p7

    check-cast v13, Lp1/q;

    const v4, 0x6d4348a2

    invoke-virtual {v13, v4}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v4, v0, 0x6

    if-nez v4, :cond_1

    invoke-virtual {v13, v1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_0

    const/4 v4, 0x4

    goto :goto_0

    :cond_0
    const/4 v4, 0x2

    :goto_0
    or-int/2addr v4, v0

    goto :goto_1

    :cond_1
    move v4, v0

    :goto_1
    and-int/lit8 v5, v0, 0x30

    if-nez v5, :cond_3

    invoke-virtual {v13, v2}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_2

    const/16 v5, 0x20

    goto :goto_2

    :cond_2
    const/16 v5, 0x10

    :goto_2
    or-int/2addr v4, v5

    :cond_3
    and-int/lit16 v5, v0, 0x180

    if-nez v5, :cond_5

    invoke-virtual {v13, v3}, Lp1/q;->h(Z)Z

    move-result v5

    if-eqz v5, :cond_4

    const/16 v5, 0x100

    goto :goto_3

    :cond_4
    const/16 v5, 0x80

    :goto_3
    or-int/2addr v4, v5

    :cond_5
    and-int/lit16 v5, v0, 0xc00

    if-nez v5, :cond_7

    const/4 v5, 0x0

    invoke-virtual {v13, v5}, Lp1/q;->d(F)Z

    move-result v5

    if-eqz v5, :cond_6

    const/16 v5, 0x800

    goto :goto_4

    :cond_6
    const/16 v5, 0x400

    :goto_4
    or-int/2addr v4, v5

    :cond_7
    and-int/lit16 v5, v0, 0x6000

    move/from16 v8, p3

    if-nez v5, :cond_9

    invoke-virtual {v13, v8}, Lp1/q;->d(F)Z

    move-result v5

    if-eqz v5, :cond_8

    const/16 v5, 0x4000

    goto :goto_5

    :cond_8
    const/16 v5, 0x2000

    :goto_5
    or-int/2addr v4, v5

    :cond_9
    const/high16 v5, 0x30000

    and-int/2addr v5, v0

    if-nez v5, :cond_b

    invoke-virtual {v13, v10}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_a

    const/high16 v5, 0x20000

    goto :goto_6

    :cond_a
    const/high16 v5, 0x10000

    :goto_6
    or-int/2addr v4, v5

    :cond_b
    const/high16 v5, 0x180000

    and-int/2addr v5, v0

    const/high16 v9, 0x100000

    if-nez v5, :cond_d

    move/from16 v5, p5

    invoke-virtual {v13, v5}, Lp1/q;->d(F)Z

    move-result v11

    if-eqz v11, :cond_c

    move v11, v9

    goto :goto_7

    :cond_c
    const/high16 v11, 0x80000

    :goto_7
    or-int/2addr v4, v11

    goto :goto_8

    :cond_d
    move/from16 v5, p5

    :goto_8
    const/high16 v11, 0xc00000

    and-int/2addr v11, v0

    const/high16 v12, 0x800000

    if-nez v11, :cond_f

    move/from16 v11, p6

    invoke-virtual {v13, v11}, Lp1/q;->d(F)Z

    move-result v14

    if-eqz v14, :cond_e

    move v14, v12

    goto :goto_9

    :cond_e
    const/high16 v14, 0x400000

    :goto_9
    or-int/2addr v4, v14

    :goto_a
    move v14, v4

    goto :goto_b

    :cond_f
    move/from16 v11, p6

    goto :goto_a

    :goto_b
    const v4, 0x492493

    and-int/2addr v4, v14

    const v15, 0x492492

    const/4 v6, 0x0

    const/4 v7, 0x1

    if-eq v4, v15, :cond_10

    move v4, v7

    goto :goto_c

    :cond_10
    move v4, v6

    :goto_c
    and-int/lit8 v15, v14, 0x1

    invoke-virtual {v13, v15, v4}, Lp1/q;->U(IZ)Z

    move-result v4

    if-eqz v4, :cond_17

    invoke-virtual {v2, v3, v6, v13}, Lg1/w1;->b(ZZLandroidx/compose/runtime/Composer;)Lp1/c1;

    move-result-object v4

    invoke-virtual {v2, v3, v7, v13}, Lg1/w1;->b(ZZLandroidx/compose/runtime/Composer;)Lp1/c1;

    move-result-object v15

    invoke-virtual {v2, v3, v6, v13}, Lg1/w1;->a(ZZLandroidx/compose/runtime/Composer;)Lp1/c1;

    move-result-object v11

    invoke-virtual {v2, v3, v7, v13}, Lg1/w1;->a(ZZLandroidx/compose/runtime/Composer;)Lp1/c1;

    move-result-object v6

    const/high16 v17, 0x380000

    and-int v7, v14, v17

    if-ne v7, v9, :cond_11

    const/4 v7, 0x1

    goto :goto_d

    :cond_11
    const/4 v7, 0x0

    :goto_d
    invoke-virtual {v13, v4}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v9

    or-int/2addr v7, v9

    const/high16 v9, 0x1c00000

    and-int/2addr v9, v14

    if-ne v9, v12, :cond_12

    const/4 v9, 0x1

    goto :goto_e

    :cond_12
    const/4 v9, 0x0

    :goto_e
    or-int/2addr v7, v9

    const v9, 0xe000

    and-int/2addr v9, v14

    const/16 v12, 0x4000

    if-ne v9, v12, :cond_13

    const/4 v9, 0x1

    goto :goto_f

    :cond_13
    const/4 v9, 0x0

    :goto_f
    or-int/2addr v7, v9

    and-int/lit16 v9, v14, 0x1c00

    const/16 v12, 0x800

    if-ne v9, v12, :cond_14

    const/16 v16, 0x1

    goto :goto_10

    :cond_14
    const/16 v16, 0x0

    :goto_10
    or-int v7, v7, v16

    invoke-virtual {v13, v15}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v9

    or-int/2addr v7, v9

    invoke-virtual {v13, v10}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v9

    or-int/2addr v7, v9

    invoke-virtual {v13, v11}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v9

    or-int/2addr v7, v9

    invoke-virtual {v13, v6}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v9

    or-int/2addr v7, v9

    invoke-virtual {v13}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v9

    if-nez v7, :cond_15

    sget-object v7, Lp1/l;->a:Lp1/v0;

    if-ne v9, v7, :cond_16

    :cond_15
    move-object v12, v6

    move-object v6, v4

    new-instance v4, Lg1/u5;

    move/from16 v7, p6

    move-object v9, v15

    invoke-direct/range {v4 .. v12}, Lg1/u5;-><init>(FLp1/c1;FFLp1/c1;Ljava/util/List;Lp1/c1;Lp1/c1;)V

    invoke-virtual {v13, v4}, Lp1/q;->p0(Ljava/lang/Object;)V

    move-object v9, v4

    :cond_16
    check-cast v9, Lkotlin/jvm/functions/Function1;

    and-int/lit8 v4, v14, 0xe

    invoke-static {v1, v9, v13, v4}, Lj93/l0;->a(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    goto :goto_11

    :cond_17
    invoke-virtual {v13}, Lp1/q;->X()V

    :goto_11
    invoke-virtual {v13}, Lp1/q;->u()Lp1/v1;

    move-result-object v9

    if-eqz v9, :cond_18

    new-instance v0, Lg1/v5;

    move/from16 v4, p3

    move-object/from16 v5, p4

    move/from16 v6, p5

    move/from16 v7, p6

    move/from16 v8, p8

    invoke-direct/range {v0 .. v8}, Lg1/v5;-><init>(Landroidx/compose/ui/Modifier;Lg1/w1;ZFLjava/util/List;FFI)V

    iput-object v0, v9, Lp1/v1;->d:Lc93/m;

    :cond_18
    return-void
.end method
