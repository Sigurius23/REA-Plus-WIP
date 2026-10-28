.class public abstract Lg1/g5;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lp1/u2;

.field public static final b:F


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lfw0/a;

    const/16 v1, 0x10

    invoke-direct {v0, v1}, Lfw0/a;-><init>(I)V

    new-instance v1, Lp1/u2;

    invoke-direct {v1, v0}, Lp1/t1;-><init>(Lc93/a;)V

    sput-object v1, Lg1/g5;->a:Lp1/u2;

    const/16 v0, 0x10

    int-to-float v0, v0

    sput v0, Lg1/g5;->b:F

    return-void
.end method

.method public static final a(Landroidx/compose/ui/Modifier;Lg1/i5;Lx1/b;Lc93/m;Lkotlin/jvm/functions/Function3;Lc93/m;IZLi2/a1;FJJJJJLx1/b;Landroidx/compose/runtime/Composer;III)V
    .locals 28

    move/from16 v0, p22

    move/from16 v1, p23

    move-object/from16 v2, p21

    check-cast v2, Lp1/q;

    const v3, 0x43afe2ad

    invoke-virtual {v2, v3}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v3, p24, 0x1

    if-eqz v3, :cond_0

    or-int/lit8 v5, v0, 0x6

    move v6, v5

    move-object/from16 v5, p0

    goto :goto_1

    :cond_0
    and-int/lit8 v5, v0, 0x6

    if-nez v5, :cond_2

    move-object/from16 v5, p0

    invoke-virtual {v2, v5}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_1

    const/4 v6, 0x4

    goto :goto_0

    :cond_1
    const/4 v6, 0x2

    :goto_0
    or-int/2addr v6, v0

    goto :goto_1

    :cond_2
    move-object/from16 v5, p0

    move v6, v0

    :goto_1
    and-int/lit8 v7, v0, 0x30

    if-nez v7, :cond_3

    or-int/lit8 v6, v6, 0x10

    :cond_3
    and-int/lit16 v7, v0, 0x180

    if-nez v7, :cond_5

    move-object/from16 v7, p2

    invoke-virtual {v2, v7}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_4

    const/16 v8, 0x100

    goto :goto_2

    :cond_4
    const/16 v8, 0x80

    :goto_2
    or-int/2addr v6, v8

    goto :goto_3

    :cond_5
    move-object/from16 v7, p2

    :goto_3
    and-int/lit8 v8, p24, 0x8

    if-eqz v8, :cond_7

    or-int/lit16 v6, v6, 0xc00

    :cond_6
    move-object/from16 v9, p3

    goto :goto_5

    :cond_7
    and-int/lit16 v9, v0, 0xc00

    if-nez v9, :cond_6

    move-object/from16 v9, p3

    invoke-virtual {v2, v9}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_8

    const/16 v10, 0x800

    goto :goto_4

    :cond_8
    const/16 v10, 0x400

    :goto_4
    or-int/2addr v6, v10

    :goto_5
    const v10, 0x36db6000

    or-int/2addr v6, v10

    and-int/lit8 v10, v1, 0x6

    if-nez v10, :cond_9

    or-int/lit8 v10, v1, 0x2

    goto :goto_6

    :cond_9
    move v10, v1

    :goto_6
    or-int/lit8 v11, v10, 0x30

    and-int/lit16 v12, v1, 0x180

    if-nez v12, :cond_a

    or-int/lit16 v11, v10, 0xb0

    :cond_a
    and-int/lit16 v10, v1, 0xc00

    if-nez v10, :cond_b

    or-int/lit16 v11, v11, 0x400

    :cond_b
    and-int/lit16 v10, v1, 0x6000

    if-nez v10, :cond_c

    or-int/lit16 v11, v11, 0x2000

    :cond_c
    const/high16 v10, 0x30000

    and-int/2addr v10, v1

    const v12, 0x8000

    if-nez v10, :cond_e

    and-int v10, p24, v12

    move-wide/from16 v13, p16

    if-nez v10, :cond_d

    invoke-virtual {v2, v13, v14}, Lp1/q;->f(J)Z

    move-result v10

    if-eqz v10, :cond_d

    const/high16 v10, 0x20000

    goto :goto_7

    :cond_d
    const/high16 v10, 0x10000

    :goto_7
    or-int/2addr v11, v10

    goto :goto_8

    :cond_e
    move-wide/from16 v13, p16

    :goto_8
    const/high16 v10, 0x180000

    and-int/2addr v10, v1

    if-nez v10, :cond_f

    const/high16 v10, 0x80000

    or-int/2addr v11, v10

    :cond_f
    const/high16 v10, 0xc00000

    and-int/2addr v10, v1

    if-nez v10, :cond_11

    move-object/from16 v10, p20

    invoke-virtual {v2, v10}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v15

    if-eqz v15, :cond_10

    const/high16 v15, 0x800000

    goto :goto_9

    :cond_10
    const/high16 v15, 0x400000

    :goto_9
    or-int/2addr v11, v15

    goto :goto_a

    :cond_11
    move-object/from16 v10, p20

    :goto_a
    const v15, 0x12492493

    and-int/2addr v15, v6

    const v4, 0x12492492

    move/from16 v16, v12

    const/16 v17, 0x1

    if-ne v15, v4, :cond_13

    const v4, 0x492493

    and-int/2addr v4, v11

    const v15, 0x492492

    if-eq v4, v15, :cond_12

    goto :goto_b

    :cond_12
    const/4 v4, 0x0

    goto :goto_c

    :cond_13
    :goto_b
    move/from16 v4, v17

    :goto_c
    and-int/lit8 v15, v6, 0x1

    invoke-virtual {v2, v15, v4}, Lp1/q;->U(IZ)Z

    move-result v4

    if-eqz v4, :cond_1c

    invoke-virtual {v2}, Lp1/q;->Z()V

    and-int/lit8 v4, v0, 0x1

    const v15, -0x380001

    const v18, -0x7ff8f

    const v19, -0xff8f

    if-eqz v4, :cond_16

    invoke-virtual {v2}, Lp1/q;->C()Z

    move-result v4

    if-eqz v4, :cond_14

    goto :goto_e

    :cond_14
    invoke-virtual {v2}, Lp1/q;->X()V

    and-int/lit8 v3, v6, -0x71

    and-int v4, v11, v19

    and-int v6, p24, v16

    if-eqz v6, :cond_15

    and-int v4, v11, v18

    :cond_15
    and-int/2addr v4, v15

    move-object v0, v5

    move v5, v3

    move-object v3, v0

    move-object/from16 v7, p4

    move-object/from16 v8, p5

    move/from16 v10, p7

    move-object/from16 v11, p8

    move/from16 v12, p9

    move-wide/from16 v15, p12

    move-wide/from16 v17, p14

    move-wide/from16 v21, p18

    move v0, v4

    move-object v6, v9

    move-wide/from16 v19, v13

    move/from16 v9, p6

    move-wide/from16 v13, p10

    :goto_d
    const/4 v1, 0x0

    move-object/from16 v4, p1

    goto/16 :goto_10

    :cond_16
    :goto_e
    if-eqz v3, :cond_17

    sget-object v3, Lb2/t;->w:Lb2/t;

    goto :goto_f

    :cond_17
    move-object v3, v5

    :goto_f
    sget-object v4, Lg1/r2;->w:Lg1/r2;

    invoke-static {v2}, Lg1/p2;->d(Landroidx/compose/runtime/Composer;)Lg1/q2;

    move-result-object v4

    invoke-virtual {v2}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    move/from16 v20, v15

    sget-object v15, Lp1/l;->a:Lp1/v0;

    if-ne v5, v15, :cond_18

    new-instance v5, Lg1/n6;

    invoke-direct {v5}, Lg1/n6;-><init>()V

    invoke-virtual {v2, v5}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_18
    check-cast v5, Lg1/n6;

    invoke-virtual {v2}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v12

    if-ne v12, v15, :cond_19

    new-instance v12, Lg1/i5;

    invoke-direct {v12, v4, v5}, Lg1/i5;-><init>(Lg1/q2;Lg1/n6;)V

    invoke-virtual {v2, v12}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_19
    move-object v4, v12

    check-cast v4, Lg1/i5;

    and-int/lit8 v5, v6, -0x71

    if-eqz v8, :cond_1a

    sget-object v6, Lg1/h1;->a:Lx1/b;

    move-object v9, v6

    :cond_1a
    sget-object v6, Lg1/h1;->b:Lx1/b;

    sget-object v8, Lg1/h1;->c:Lx1/b;

    sget-object v12, Lg1/m5;->a:Lp1/u2;

    invoke-virtual {v2, v12}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Lg1/l5;

    iget-object v12, v12, Lg1/l5;->c:Lt0/i;

    sget v15, Lg1/e2;->b:F

    sget-object v0, Lg1/d1;->a:Lp1/u2;

    invoke-virtual {v2, v0}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v22

    check-cast v22, Lg1/c1;

    move-object/from16 p0, v3

    move-object/from16 p1, v4

    invoke-virtual/range {v22 .. v22}, Lg1/c1;->h()J

    move-result-wide v3

    invoke-static {v3, v4, v2}, Lg1/d1;->b(JLandroidx/compose/runtime/Composer;)J

    move-result-wide v22

    sget-object v1, Lg1/d1;->a:Lp1/u2;

    invoke-virtual {v2, v1}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lg1/c1;

    move-wide/from16 p3, v3

    invoke-virtual {v1}, Lg1/c1;->e()J

    move-result-wide v3

    const v1, 0x3ea3d70a    # 0.32f

    invoke-static {v1, v3, v4}, Li2/x;->c(FJ)J

    move-result-wide v3

    and-int v1, v11, v19

    and-int v16, p24, v16

    if-eqz v16, :cond_1b

    invoke-virtual {v2, v0}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lg1/c1;

    invoke-virtual {v0}, Lg1/c1;->b()J

    move-result-wide v0

    and-int v11, v11, v18

    move-wide v13, v0

    move v1, v11

    :cond_1b
    invoke-static {v13, v14, v2}, Lg1/d1;->b(JLandroidx/compose/runtime/Composer;)J

    move-result-wide v18

    and-int v0, v1, v20

    move-object v7, v6

    move-object v6, v9

    move-object v11, v12

    move v12, v15

    move/from16 v10, v17

    move-wide/from16 v15, v22

    const/4 v9, 0x2

    move-wide/from16 v21, v18

    move-wide/from16 v17, v3

    move-wide/from16 v19, v13

    move-object/from16 v3, p0

    move-wide/from16 v13, p3

    goto/16 :goto_d

    :goto_10
    invoke-virtual {v2}, Lp1/q;->r()V

    int-to-float v1, v1

    invoke-static {v1}, Ll0/f;->c(F)Ll0/i0;

    move-result-object v1

    shl-int/lit8 v23, v5, 0x3

    const v24, 0x7ffffff0

    and-int v25, v23, v24

    shr-int/lit8 v5, v5, 0x1b

    and-int/lit8 v5, v5, 0xe

    shl-int/lit8 v0, v0, 0x3

    move-object/from16 p0, v1

    and-int/lit16 v1, v0, 0x380

    or-int/2addr v1, v5

    const/high16 v5, 0x380000

    and-int/2addr v5, v0

    or-int/2addr v1, v5

    const/high16 v5, 0xe000000

    and-int/2addr v0, v5

    or-int v26, v1, v0

    move-object/from16 v5, p2

    move-object/from16 v23, p20

    move-object/from16 v24, v2

    move-object/from16 v2, p0

    invoke-static/range {v2 .. v26}, Lg1/g5;->b(Ll0/i0;Landroidx/compose/ui/Modifier;Lg1/i5;Lx1/b;Lc93/m;Lkotlin/jvm/functions/Function3;Lc93/m;IZLi2/a1;FJJJJJLx1/b;Landroidx/compose/runtime/Composer;II)V

    move-object v1, v3

    move-object v2, v4

    move-object v4, v6

    move-object v5, v7

    move-object v6, v8

    move v7, v9

    move v8, v10

    move-object v9, v11

    move v10, v12

    move-wide v11, v13

    move-wide v13, v15

    move-wide/from16 v15, v17

    move-wide/from16 v17, v19

    move-wide/from16 v19, v21

    goto :goto_11

    :cond_1c
    move-object/from16 v24, v2

    invoke-virtual/range {v24 .. v24}, Lp1/q;->X()V

    move-object/from16 v2, p1

    move-object/from16 v6, p5

    move/from16 v7, p6

    move/from16 v8, p7

    move/from16 v10, p9

    move-wide/from16 v11, p10

    move-wide/from16 v15, p14

    move-wide/from16 v19, p18

    move-object v1, v5

    move-object v4, v9

    move-wide/from16 v17, v13

    move-object/from16 v5, p4

    move-object/from16 v9, p8

    move-wide/from16 v13, p12

    :goto_11
    invoke-virtual/range {v24 .. v24}, Lp1/q;->u()Lp1/v1;

    move-result-object v0

    if-eqz v0, :cond_1d

    move-object v3, v0

    new-instance v0, Lg1/b5;

    move-object/from16 v21, p20

    move/from16 v22, p22

    move/from16 v23, p23

    move/from16 v24, p24

    move-object/from16 v27, v3

    move-object/from16 v3, p2

    invoke-direct/range {v0 .. v24}, Lg1/b5;-><init>(Landroidx/compose/ui/Modifier;Lg1/i5;Lx1/b;Lc93/m;Lkotlin/jvm/functions/Function3;Lc93/m;IZLi2/a1;FJJJJJLx1/b;III)V

    move-object/from16 v3, v27

    iput-object v0, v3, Lp1/v1;->d:Lc93/m;

    :cond_1d
    return-void
.end method

.method public static final b(Ll0/i0;Landroidx/compose/ui/Modifier;Lg1/i5;Lx1/b;Lc93/m;Lkotlin/jvm/functions/Function3;Lc93/m;IZLi2/a1;FJJJJJLx1/b;Landroidx/compose/runtime/Composer;II)V
    .locals 37

    move-object/from16 v1, p0

    move-object/from16 v14, p1

    move/from16 v15, p23

    move/from16 v0, p24

    move-object/from16 v2, p22

    check-cast v2, Lp1/q;

    const v3, 0x2fc112f

    invoke-virtual {v2, v3}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v3, v15, 0x6

    if-nez v3, :cond_1

    invoke-virtual {v2, v1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    const/4 v3, 0x4

    goto :goto_0

    :cond_0
    const/4 v3, 0x2

    :goto_0
    or-int/2addr v3, v15

    goto :goto_1

    :cond_1
    move v3, v15

    :goto_1
    and-int/lit8 v6, v15, 0x30

    if-nez v6, :cond_3

    invoke-virtual {v2, v14}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_2

    const/16 v6, 0x20

    goto :goto_2

    :cond_2
    const/16 v6, 0x10

    :goto_2
    or-int/2addr v3, v6

    :cond_3
    and-int/lit16 v6, v15, 0x180

    move-object/from16 v13, p2

    if-nez v6, :cond_5

    invoke-virtual {v2, v13}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_4

    const/16 v6, 0x100

    goto :goto_3

    :cond_4
    const/16 v6, 0x80

    :goto_3
    or-int/2addr v3, v6

    :cond_5
    and-int/lit16 v6, v15, 0xc00

    const/16 v12, 0x800

    if-nez v6, :cond_7

    move-object/from16 v6, p3

    invoke-virtual {v2, v6}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v16

    if-eqz v16, :cond_6

    move/from16 v16, v12

    goto :goto_4

    :cond_6
    const/16 v16, 0x400

    :goto_4
    or-int v3, v3, v16

    goto :goto_5

    :cond_7
    move-object/from16 v6, p3

    :goto_5
    and-int/lit16 v4, v15, 0x6000

    const/16 v16, 0x2000

    const/16 v17, 0x4000

    if-nez v4, :cond_9

    move-object/from16 v4, p4

    invoke-virtual {v2, v4}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v18

    if-eqz v18, :cond_8

    move/from16 v18, v17

    goto :goto_6

    :cond_8
    move/from16 v18, v16

    :goto_6
    or-int v3, v3, v18

    goto :goto_7

    :cond_9
    move-object/from16 v4, p4

    :goto_7
    const/high16 v18, 0x30000

    and-int v19, v15, v18

    const/high16 v20, 0x10000

    const/high16 v21, 0x20000

    move-object/from16 v7, p5

    if-nez v19, :cond_b

    invoke-virtual {v2, v7}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v22

    if-eqz v22, :cond_a

    move/from16 v22, v21

    goto :goto_8

    :cond_a
    move/from16 v22, v20

    :goto_8
    or-int v3, v3, v22

    :cond_b
    const/high16 v22, 0x180000

    and-int v23, v15, v22

    const/high16 v24, 0x80000

    const/high16 v25, 0x100000

    move-object/from16 v8, p6

    if-nez v23, :cond_d

    invoke-virtual {v2, v8}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v26

    if-eqz v26, :cond_c

    move/from16 v26, v25

    goto :goto_9

    :cond_c
    move/from16 v26, v24

    :goto_9
    or-int v3, v3, v26

    :cond_d
    const/high16 v26, 0xc00000

    and-int v27, v15, v26

    const/high16 v28, 0x400000

    const/high16 v29, 0x800000

    move/from16 v9, p7

    if-nez v27, :cond_f

    invoke-virtual {v2, v9}, Lp1/q;->e(I)Z

    move-result v30

    if-eqz v30, :cond_e

    move/from16 v30, v29

    goto :goto_a

    :cond_e
    move/from16 v30, v28

    :goto_a
    or-int v3, v3, v30

    :cond_f
    const/high16 v30, 0x6000000

    and-int v31, v15, v30

    const/high16 v32, 0x2000000

    const/high16 v33, 0x4000000

    const/4 v5, 0x0

    if-nez v31, :cond_11

    invoke-virtual {v2, v5}, Lp1/q;->h(Z)Z

    move-result v31

    if-eqz v31, :cond_10

    move/from16 v31, v33

    goto :goto_b

    :cond_10
    move/from16 v31, v32

    :goto_b
    or-int v3, v3, v31

    :cond_11
    const/high16 v31, 0x30000000

    and-int v31, v15, v31

    if-nez v31, :cond_13

    const/4 v5, 0x0

    invoke-virtual {v2, v5}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_12

    const/high16 v5, 0x20000000

    goto :goto_c

    :cond_12
    const/high16 v5, 0x10000000

    :goto_c
    or-int/2addr v3, v5

    :cond_13
    move/from16 v34, v3

    and-int/lit8 v3, v0, 0x6

    if-nez v3, :cond_15

    move/from16 v3, p8

    invoke-virtual {v2, v3}, Lp1/q;->h(Z)Z

    move-result v5

    if-eqz v5, :cond_14

    const/4 v5, 0x4

    goto :goto_d

    :cond_14
    const/4 v5, 0x2

    :goto_d
    or-int/2addr v5, v0

    goto :goto_e

    :cond_15
    move/from16 v3, p8

    move v5, v0

    :goto_e
    and-int/lit8 v35, v0, 0x30

    move-object/from16 v15, p9

    if-nez v35, :cond_17

    invoke-virtual {v2, v15}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v35

    if-eqz v35, :cond_16

    const/16 v23, 0x20

    goto :goto_f

    :cond_16
    const/16 v23, 0x10

    :goto_f
    or-int v5, v5, v23

    :cond_17
    and-int/lit16 v10, v0, 0x180

    if-nez v10, :cond_19

    move/from16 v10, p10

    invoke-virtual {v2, v10}, Lp1/q;->d(F)Z

    move-result v19

    if-eqz v19, :cond_18

    const/16 v27, 0x100

    goto :goto_10

    :cond_18
    const/16 v27, 0x80

    :goto_10
    or-int v5, v5, v27

    goto :goto_11

    :cond_19
    move/from16 v10, p10

    :goto_11
    and-int/lit16 v11, v0, 0xc00

    move-wide/from16 v14, p11

    if-nez v11, :cond_1b

    invoke-virtual {v2, v14, v15}, Lp1/q;->f(J)Z

    move-result v11

    if-eqz v11, :cond_1a

    move v11, v12

    goto :goto_12

    :cond_1a
    const/16 v11, 0x400

    :goto_12
    or-int/2addr v5, v11

    :cond_1b
    and-int/lit16 v11, v0, 0x6000

    if-nez v11, :cond_1d

    move-wide/from16 v11, p13

    invoke-virtual {v2, v11, v12}, Lp1/q;->f(J)Z

    move-result v19

    if-eqz v19, :cond_1c

    move/from16 v16, v17

    :cond_1c
    or-int v5, v5, v16

    goto :goto_13

    :cond_1d
    move-wide/from16 v11, p13

    :goto_13
    and-int v16, v0, v18

    move-wide/from16 v14, p15

    if-nez v16, :cond_1f

    invoke-virtual {v2, v14, v15}, Lp1/q;->f(J)Z

    move-result v16

    if-eqz v16, :cond_1e

    move/from16 v20, v21

    :cond_1e
    or-int v5, v5, v20

    :cond_1f
    and-int v16, v0, v22

    move-wide/from16 v3, p17

    if-nez v16, :cond_21

    invoke-virtual {v2, v3, v4}, Lp1/q;->f(J)Z

    move-result v16

    if-eqz v16, :cond_20

    move/from16 v24, v25

    :cond_20
    or-int v5, v5, v24

    :cond_21
    and-int v16, v0, v26

    move-wide/from16 v3, p19

    if-nez v16, :cond_23

    invoke-virtual {v2, v3, v4}, Lp1/q;->f(J)Z

    move-result v16

    if-eqz v16, :cond_22

    move/from16 v28, v29

    :cond_22
    or-int v5, v5, v28

    :cond_23
    and-int v16, v0, v30

    move-object/from16 v0, p21

    if-nez v16, :cond_25

    invoke-virtual {v2, v0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v16

    if-eqz v16, :cond_24

    move/from16 v32, v33

    :cond_24
    or-int v5, v5, v32

    :cond_25
    const v16, 0x12492493

    and-int v0, v34, v16

    const v3, 0x12492492

    const/4 v4, 0x1

    if-ne v0, v3, :cond_27

    const v0, 0x2492493

    and-int/2addr v0, v5

    const v3, 0x2492492

    if-eq v0, v3, :cond_26

    goto :goto_14

    :cond_26
    const/4 v0, 0x0

    goto :goto_15

    :cond_27
    :goto_14
    move v0, v4

    :goto_15
    and-int/lit8 v3, v34, 0x1

    invoke-virtual {v2, v3, v0}, Lp1/q;->U(IZ)Z

    move-result v0

    if-eqz v0, :cond_2d

    invoke-virtual {v2}, Lp1/q;->Z()V

    and-int/lit8 v0, p23, 0x1

    if-eqz v0, :cond_29

    invoke-virtual {v2}, Lp1/q;->C()Z

    move-result v0

    if-eqz v0, :cond_28

    goto :goto_16

    :cond_28
    invoke-virtual {v2}, Lp1/q;->X()V

    :cond_29
    :goto_16
    invoke-virtual {v2}, Lp1/q;->r()V

    and-int/lit8 v0, v34, 0xe

    const/4 v3, 0x4

    if-ne v0, v3, :cond_2a

    goto :goto_17

    :cond_2a
    const/4 v4, 0x0

    :goto_17
    invoke-virtual {v2}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v0

    if-nez v4, :cond_2b

    sget-object v3, Lp1/l;->a:Lp1/v0;

    if-ne v0, v3, :cond_2c

    :cond_2b
    new-instance v0, Lg1/a4;

    invoke-direct {v0, v1}, Lg1/a4;-><init>(Ll0/i0;)V

    invoke-virtual {v2, v0}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_2c
    check-cast v0, Lg1/a4;

    move-object v1, v0

    new-instance v0, Lg1/e5;

    move-object/from16 v11, p4

    move-wide/from16 v3, p17

    move-object v14, v2

    move-object v12, v7

    move-object v10, v8

    move v7, v9

    const/4 v15, 0x0

    move-object/from16 v2, p0

    move-object/from16 v9, p21

    move-object v8, v6

    move-wide/from16 v5, p19

    invoke-direct/range {v0 .. v13}, Lg1/e5;-><init>(Lg1/a4;Ll0/i0;JJILx1/b;Lx1/b;Lc93/m;Lc93/m;Lkotlin/jvm/functions/Function3;Lg1/i5;)V

    const v1, -0x49b75a84

    invoke-static {v1, v14, v0}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v0

    const v1, 0x537dc4b4

    invoke-virtual {v14, v1}, Lp1/q;->e0(I)V

    shr-int/lit8 v1, v34, 0x3

    and-int/lit8 v1, v1, 0xe

    or-int/lit8 v1, v1, 0x30

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    move-object/from16 v2, p1

    invoke-virtual {v0, v2, v14, v1}, Lx1/b;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v14, v15}, Lp1/q;->q(Z)V

    goto :goto_18

    :cond_2d
    move-object v14, v2

    move-object/from16 v2, p1

    invoke-virtual {v14}, Lp1/q;->X()V

    :goto_18
    invoke-virtual {v14}, Lp1/q;->u()Lp1/v1;

    move-result-object v0

    if-eqz v0, :cond_2e

    move-object v1, v0

    new-instance v0, Lg1/c5;

    move-object/from16 v3, p2

    move-object/from16 v4, p3

    move-object/from16 v5, p4

    move-object/from16 v6, p5

    move-object/from16 v7, p6

    move/from16 v8, p7

    move/from16 v9, p8

    move-object/from16 v10, p9

    move/from16 v11, p10

    move-wide/from16 v12, p11

    move-wide/from16 v14, p13

    move-wide/from16 v16, p15

    move-wide/from16 v18, p17

    move-wide/from16 v20, p19

    move-object/from16 v22, p21

    move/from16 v23, p23

    move/from16 v24, p24

    move-object/from16 v36, v1

    move-object/from16 v1, p0

    invoke-direct/range {v0 .. v24}, Lg1/c5;-><init>(Ll0/i0;Landroidx/compose/ui/Modifier;Lg1/i5;Lx1/b;Lc93/m;Lkotlin/jvm/functions/Function3;Lc93/m;IZLi2/a1;FJJJJJLx1/b;II)V

    move-object/from16 v1, v36

    iput-object v0, v1, Lp1/v1;->d:Lc93/m;

    :cond_2e
    return-void
.end method

.method public static final c(ILx1/b;Lx1/b;Lx1/b;Lc93/m;Ll0/b2;Lc93/m;Landroidx/compose/runtime/Composer;I)V
    .locals 16

    move-object/from16 v0, p7

    check-cast v0, Lp1/q;

    const v1, 0x283ddabc

    invoke-virtual {v0, v1}, Lp1/q;->g0(I)Lp1/q;

    const/4 v1, 0x0

    invoke-virtual {v0, v1}, Lp1/q;->h(Z)Z

    move-result v2

    const/4 v3, 0x4

    if-eqz v2, :cond_0

    move v2, v3

    goto :goto_0

    :cond_0
    const/4 v2, 0x2

    :goto_0
    or-int v2, p8, v2

    move/from16 v8, p0

    invoke-virtual {v0, v8}, Lp1/q;->e(I)Z

    move-result v4

    const/16 v5, 0x20

    if-eqz v4, :cond_1

    move v4, v5

    goto :goto_1

    :cond_1
    const/16 v4, 0x10

    :goto_1
    or-int/2addr v2, v4

    move-object/from16 v6, p1

    invoke-virtual {v0, v6}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v4

    const/16 v7, 0x100

    if-eqz v4, :cond_2

    move v4, v7

    goto :goto_2

    :cond_2
    const/16 v4, 0x80

    :goto_2
    or-int/2addr v2, v4

    move-object/from16 v12, p2

    invoke-virtual {v0, v12}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_3

    const/16 v4, 0x800

    goto :goto_3

    :cond_3
    const/16 v4, 0x400

    :goto_3
    or-int/2addr v2, v4

    move-object/from16 v4, p4

    invoke-virtual {v0, v4}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v10

    const/high16 v11, 0x20000

    if-eqz v10, :cond_4

    move v10, v11

    goto :goto_4

    :cond_4
    const/high16 v10, 0x10000

    :goto_4
    or-int/2addr v2, v10

    move-object/from16 v10, p5

    invoke-virtual {v0, v10}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v13

    const/high16 v14, 0x100000

    if-eqz v13, :cond_5

    move v13, v14

    goto :goto_5

    :cond_5
    const/high16 v13, 0x80000

    :goto_5
    or-int/2addr v2, v13

    move-object/from16 v13, p6

    invoke-virtual {v0, v13}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v15

    if-eqz v15, :cond_6

    const/high16 v15, 0x800000

    goto :goto_6

    :cond_6
    const/high16 v15, 0x400000

    :goto_6
    or-int/2addr v2, v15

    const v15, 0x492493

    and-int/2addr v15, v2

    const v9, 0x492492

    if-eq v15, v9, :cond_7

    const/4 v9, 0x1

    goto :goto_7

    :cond_7
    const/4 v9, 0x0

    :goto_7
    and-int/lit8 v15, v2, 0x1

    invoke-virtual {v0, v15, v9}, Lp1/q;->U(IZ)Z

    move-result v9

    if-eqz v9, :cond_12

    invoke-virtual {v0}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v9

    sget-object v15, Lp1/l;->a:Lp1/v0;

    if-ne v9, v15, :cond_8

    new-instance v9, Lg1/f5;

    invoke-direct {v9}, Lg1/f5;-><init>()V

    invoke-virtual {v0, v9}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_8
    check-cast v9, Lg1/f5;

    and-int/lit16 v1, v2, 0x380

    if-ne v1, v7, :cond_9

    const/4 v1, 0x1

    goto :goto_8

    :cond_9
    const/4 v1, 0x0

    :goto_8
    const/high16 v7, 0x380000

    and-int/2addr v7, v2

    if-ne v7, v14, :cond_a

    const/4 v7, 0x1

    goto :goto_9

    :cond_a
    const/4 v7, 0x0

    :goto_9
    or-int/2addr v1, v7

    const/high16 v7, 0x70000

    and-int/2addr v7, v2

    if-ne v7, v11, :cond_b

    const/4 v7, 0x1

    goto :goto_a

    :cond_b
    const/4 v7, 0x0

    :goto_a
    or-int/2addr v1, v7

    and-int/lit8 v7, v2, 0x70

    if-ne v7, v5, :cond_c

    const/4 v5, 0x1

    goto :goto_b

    :cond_c
    const/4 v5, 0x0

    :goto_b
    or-int/2addr v1, v5

    and-int/lit8 v5, v2, 0xe

    if-ne v5, v3, :cond_d

    const/4 v3, 0x1

    goto :goto_c

    :cond_d
    const/4 v3, 0x0

    :goto_c
    or-int/2addr v1, v3

    const/high16 v3, 0x1c00000

    and-int/2addr v3, v2

    const/high16 v5, 0x800000

    if-ne v3, v5, :cond_e

    const/4 v3, 0x1

    goto :goto_d

    :cond_e
    const/4 v3, 0x0

    :goto_d
    or-int/2addr v1, v3

    and-int/lit16 v2, v2, 0x1c00

    const/16 v3, 0x800

    if-ne v2, v3, :cond_f

    const/4 v2, 0x1

    goto :goto_e

    :cond_f
    const/4 v2, 0x0

    :goto_e
    or-int/2addr v1, v2

    invoke-virtual {v0}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    if-nez v1, :cond_10

    if-ne v2, v15, :cond_11

    :cond_10
    new-instance v4, Lb30/u2;

    move-object v5, v10

    move-object v10, v9

    move-object v9, v5

    move-object/from16 v7, p4

    move-object v5, v6

    move-object v11, v13

    move-object/from16 v6, p3

    invoke-direct/range {v4 .. v12}, Lb30/u2;-><init>(Lx1/b;Lx1/b;Lc93/m;ILl0/b2;Lg1/f5;Lc93/m;Lx1/b;)V

    invoke-virtual {v0, v4}, Lp1/q;->p0(Ljava/lang/Object;)V

    move-object v2, v4

    :cond_11
    check-cast v2, Lc93/m;

    const/4 v1, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x1

    invoke-static {v1, v2, v0, v3, v4}, Ly2/q1;->b(Landroidx/compose/ui/Modifier;Lc93/m;Landroidx/compose/runtime/Composer;II)V

    goto :goto_f

    :cond_12
    invoke-virtual {v0}, Lp1/q;->X()V

    :goto_f
    invoke-virtual {v0}, Lp1/q;->u()Lp1/v1;

    move-result-object v0

    if-eqz v0, :cond_13

    new-instance v4, Lbe1/f;

    move/from16 v5, p0

    move-object/from16 v6, p1

    move-object/from16 v7, p2

    move-object/from16 v8, p3

    move-object/from16 v9, p4

    move-object/from16 v10, p5

    move-object/from16 v11, p6

    move/from16 v12, p8

    invoke-direct/range {v4 .. v12}, Lbe1/f;-><init>(ILx1/b;Lx1/b;Lx1/b;Lc93/m;Ll0/b2;Lc93/m;I)V

    iput-object v4, v0, Lp1/v1;->d:Lc93/m;

    :cond_13
    return-void
.end method
