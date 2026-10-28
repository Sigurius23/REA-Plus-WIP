.class public abstract Lg1/u8;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:F

.field public static final b:F

.field public static final c:F


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0x14

    int-to-float v0, v0

    sput v0, Lg1/u8;->a:F

    const/16 v0, 0xa

    int-to-float v0, v0

    sput v0, Lg1/u8;->b:F

    const/4 v0, 0x2

    int-to-float v0, v0

    sput v0, Lg1/u8;->c:F

    return-void
.end method

.method public static final a(Ljava/lang/String;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZLl3/v0;Lc93/m;Lc93/m;Lc93/m;Lq3/g0;Lu0/r0;Lu0/q0;ZIILi2/a1;Lg1/y1;Landroidx/compose/runtime/Composer;III)V
    .locals 38

    move-object/from16 v3, p2

    move-object/from16 v0, p15

    move/from16 v1, p17

    move/from16 v2, p18

    move/from16 v4, p19

    move-object/from16 v5, p16

    check-cast v5, Lp1/q;

    const v6, 0xaad51e0

    invoke-virtual {v5, v6}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v6, v1, 0x6

    if-nez v6, :cond_1

    move-object/from16 v6, p0

    invoke-virtual {v5, v6}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_0

    const/4 v7, 0x4

    goto :goto_0

    :cond_0
    const/4 v7, 0x2

    :goto_0
    or-int/2addr v7, v1

    goto :goto_1

    :cond_1
    move-object/from16 v6, p0

    move v7, v1

    :goto_1
    and-int/lit8 v8, v1, 0x30

    if-nez v8, :cond_3

    move-object/from16 v8, p1

    invoke-virtual {v5, v8}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_2

    const/16 v9, 0x20

    goto :goto_2

    :cond_2
    const/16 v9, 0x10

    :goto_2
    or-int/2addr v7, v9

    goto :goto_3

    :cond_3
    move-object/from16 v8, p1

    :goto_3
    and-int/lit16 v9, v1, 0x180

    if-nez v9, :cond_5

    invoke-virtual {v5, v3}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_4

    const/16 v9, 0x100

    goto :goto_4

    :cond_4
    const/16 v9, 0x80

    :goto_4
    or-int/2addr v7, v9

    :cond_5
    and-int/lit8 v9, v4, 0x8

    if-eqz v9, :cond_7

    or-int/lit16 v7, v7, 0xc00

    :cond_6
    move/from16 v12, p3

    goto :goto_6

    :cond_7
    and-int/lit16 v12, v1, 0xc00

    if-nez v12, :cond_6

    move/from16 v12, p3

    invoke-virtual {v5, v12}, Lp1/q;->h(Z)Z

    move-result v13

    if-eqz v13, :cond_8

    const/16 v13, 0x800

    goto :goto_5

    :cond_8
    const/16 v13, 0x400

    :goto_5
    or-int/2addr v7, v13

    :goto_6
    or-int/lit16 v7, v7, 0x6000

    const/high16 v13, 0x30000

    and-int/2addr v13, v1

    if-nez v13, :cond_b

    and-int/lit8 v13, v4, 0x20

    if-nez v13, :cond_9

    move-object/from16 v13, p4

    invoke-virtual {v5, v13}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v14

    if-eqz v14, :cond_a

    const/high16 v14, 0x20000

    goto :goto_7

    :cond_9
    move-object/from16 v13, p4

    :cond_a
    const/high16 v14, 0x10000

    :goto_7
    or-int/2addr v7, v14

    goto :goto_8

    :cond_b
    move-object/from16 v13, p4

    :goto_8
    and-int/lit8 v14, v4, 0x40

    const/high16 v15, 0x180000

    if-eqz v14, :cond_d

    or-int/2addr v7, v15

    :cond_c
    move-object/from16 v15, p5

    goto :goto_a

    :cond_d
    and-int/2addr v15, v1

    if-nez v15, :cond_c

    move-object/from16 v15, p5

    invoke-virtual {v5, v15}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v16

    if-eqz v16, :cond_e

    const/high16 v16, 0x100000

    goto :goto_9

    :cond_e
    const/high16 v16, 0x80000

    :goto_9
    or-int v7, v7, v16

    :goto_a
    and-int/lit16 v10, v4, 0x80

    const/high16 v16, 0xc00000

    if-eqz v10, :cond_f

    or-int v7, v7, v16

    move-object/from16 v11, p6

    goto :goto_c

    :cond_f
    and-int v16, v1, v16

    move-object/from16 v11, p6

    if-nez v16, :cond_11

    invoke-virtual {v5, v11}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v17

    if-eqz v17, :cond_10

    const/high16 v17, 0x800000

    goto :goto_b

    :cond_10
    const/high16 v17, 0x400000

    :goto_b
    or-int v7, v7, v17

    :cond_11
    :goto_c
    const/high16 v17, 0x6000000

    or-int v17, v7, v17

    and-int/lit16 v1, v4, 0x200

    const/high16 v18, 0x10000000

    const/high16 v19, 0x20000000

    if-eqz v1, :cond_13

    const/high16 v17, 0x36000000

    or-int v17, v7, v17

    :cond_12
    move-object/from16 v7, p7

    goto :goto_e

    :cond_13
    const/high16 v7, 0x30000000

    and-int v7, p17, v7

    if-nez v7, :cond_12

    move-object/from16 v7, p7

    invoke-virtual {v5, v7}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v20

    if-eqz v20, :cond_14

    move/from16 v20, v19

    goto :goto_d

    :cond_14
    move/from16 v20, v18

    :goto_d
    or-int v17, v17, v20

    :goto_e
    or-int/lit8 v20, v2, 0x36

    move/from16 v21, v1

    and-int/lit16 v1, v4, 0x1000

    if-eqz v1, :cond_15

    move/from16 v22, v1

    or-int/lit16 v1, v2, 0x1b6

    goto :goto_11

    :cond_15
    move/from16 v22, v1

    and-int/lit16 v1, v2, 0x180

    if-nez v1, :cond_17

    move-object/from16 v1, p9

    invoke-virtual {v5, v1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v23

    if-eqz v23, :cond_16

    const/16 v16, 0x100

    goto :goto_f

    :cond_16
    const/16 v16, 0x80

    :goto_f
    or-int v20, v20, v16

    :goto_10
    move/from16 v1, v20

    goto :goto_11

    :cond_17
    move-object/from16 v1, p9

    goto :goto_10

    :goto_11
    or-int/lit16 v6, v1, 0x400

    move/from16 v16, v6

    and-int/lit16 v6, v4, 0x4000

    if-eqz v6, :cond_19

    or-int/lit16 v1, v1, 0x6400

    move/from16 v16, v1

    :cond_18
    move/from16 v1, p11

    goto :goto_13

    :cond_19
    and-int/lit16 v1, v2, 0x6000

    if-nez v1, :cond_18

    move/from16 v1, p11

    invoke-virtual {v5, v1}, Lp1/q;->h(Z)Z

    move-result v20

    if-eqz v20, :cond_1a

    const/16 v20, 0x4000

    goto :goto_12

    :cond_1a
    const/16 v20, 0x2000

    :goto_12
    or-int v16, v16, v20

    :goto_13
    const/high16 v20, 0xd90000

    or-int v16, v16, v20

    const/high16 v20, 0x40000

    and-int v23, v4, v20

    move-object/from16 v1, p14

    if-nez v23, :cond_1b

    invoke-virtual {v5, v1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v23

    if-eqz v23, :cond_1b

    const/high16 v23, 0x4000000

    goto :goto_14

    :cond_1b
    const/high16 v23, 0x2000000

    :goto_14
    or-int v16, v16, v23

    invoke-virtual {v5, v0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v23

    if-eqz v23, :cond_1c

    move/from16 v18, v19

    :cond_1c
    or-int v16, v16, v18

    const v18, 0x12492493

    and-int v1, v17, v18

    const v2, 0x12492492

    const/16 v19, 0x1

    if-ne v1, v2, :cond_1e

    and-int v1, v16, v18

    if-eq v1, v2, :cond_1d

    goto :goto_15

    :cond_1d
    const/4 v1, 0x0

    goto :goto_16

    :cond_1e
    :goto_15
    move/from16 v1, v19

    :goto_16
    and-int/lit8 v2, v17, 0x1

    invoke-virtual {v5, v2, v1}, Lp1/q;->U(IZ)Z

    move-result v1

    if-eqz v1, :cond_2e

    invoke-virtual {v5}, Lp1/q;->Z()V

    and-int/lit8 v1, p17, 0x1

    const v2, -0xe071c01

    const v18, -0x71c01

    const v23, -0x70001

    if-eqz v1, :cond_22

    invoke-virtual {v5}, Lp1/q;->C()Z

    move-result v1

    if-eqz v1, :cond_1f

    goto :goto_17

    :cond_1f
    invoke-virtual {v5}, Lp1/q;->X()V

    and-int/lit8 v1, p19, 0x20

    if-eqz v1, :cond_20

    and-int v17, v17, v23

    :cond_20
    and-int v1, v16, v18

    and-int v6, p19, v20

    if-eqz v6, :cond_21

    and-int v1, v16, v2

    :cond_21
    move-object/from16 v16, p8

    move-object/from16 v2, p9

    move-object/from16 v9, p10

    move/from16 v14, p12

    move/from16 v19, p13

    move-object/from16 v6, p14

    move v10, v1

    move-object v1, v13

    move/from16 v13, p11

    goto/16 :goto_1d

    :cond_22
    :goto_17
    if-eqz v9, :cond_23

    move/from16 v12, v19

    :cond_23
    and-int/lit8 v1, p19, 0x20

    if-eqz v1, :cond_24

    sget-object v1, Lg1/f9;->a:Lp1/b0;

    invoke-virtual {v5, v1}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll3/v0;

    and-int v17, v17, v23

    move-object v13, v1

    :cond_24
    const/4 v1, 0x0

    if-eqz v14, :cond_25

    move-object v15, v1

    :cond_25
    if-eqz v10, :cond_26

    move-object v11, v1

    :cond_26
    if-eqz v21, :cond_27

    goto :goto_18

    :cond_27
    move-object v1, v7

    :goto_18
    if-eqz v22, :cond_28

    sget-object v7, Lu0/r0;->e:Lu0/r0;

    goto :goto_19

    :cond_28
    move-object/from16 v7, p9

    :goto_19
    new-instance v9, Lu0/q0;

    const/4 v10, 0x0

    const/16 v14, 0x3f

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    move-object/from16 p3, v9

    move-object/from16 p7, v10

    move/from16 p8, v14

    move-object/from16 p4, v21

    move-object/from16 p5, v22

    move-object/from16 p6, v23

    invoke-direct/range {p3 .. p8}, Lu0/q0;-><init>(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;I)V

    if-eqz v6, :cond_29

    const/4 v6, 0x0

    goto :goto_1a

    :cond_29
    move/from16 v6, p11

    :goto_1a
    if-eqz v6, :cond_2a

    move/from16 v10, v19

    goto :goto_1b

    :cond_2a
    const v10, 0x7fffffff

    :goto_1b
    and-int v14, v16, v18

    and-int v18, p19, v20

    if-eqz v18, :cond_2b

    sget-object v14, Lg1/i8;->a:Lg1/i8;

    invoke-static {v5}, Lg1/i8;->e(Landroidx/compose/runtime/Composer;)Lt0/a;

    move-result-object v14

    and-int v2, v16, v2

    goto :goto_1c

    :cond_2b
    move v2, v14

    move-object/from16 v14, p14

    :goto_1c
    sget-object v16, Lq3/f0;->w:Lg40/h2;

    move-object/from16 v37, v7

    move-object v7, v1

    move-object v1, v13

    move v13, v6

    move-object v6, v14

    move v14, v10

    move v10, v2

    move-object/from16 v2, v37

    :goto_1d
    invoke-virtual {v5}, Lp1/q;->r()V

    const v4, 0x7f7a85db

    invoke-virtual {v5, v4}, Lp1/q;->e0(I)V

    invoke-virtual {v5}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    move-object/from16 p14, v2

    sget-object v2, Lp1/l;->a:Lp1/v0;

    if-ne v4, v2, :cond_2c

    invoke-static {v5}, Ld;->g(Lp1/q;)Lj0/j;

    move-result-object v4

    :cond_2c
    check-cast v4, Lj0/i;

    const/4 v2, 0x0

    invoke-virtual {v5, v2}, Lp1/q;->q(Z)V

    const v2, 0x14a0eeee

    invoke-virtual {v5, v2}, Lp1/q;->e0(I)V

    invoke-virtual {v1}, Ll3/v0;->c()J

    move-result-wide v20

    const-wide/16 v22, 0x10

    cmp-long v2, v20, v22

    if-eqz v2, :cond_2d

    move-object/from16 p12, v6

    move-object/from16 p11, v7

    move-wide/from16 v21, v20

    :goto_1e
    const/4 v2, 0x0

    goto :goto_1f

    :cond_2d
    invoke-virtual {v0, v12, v5}, Lg1/y1;->e(ZLandroidx/compose/runtime/Composer;)Lp1/c1;

    move-result-object v2

    invoke-interface {v2}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Li2/x;

    move-object/from16 p12, v6

    move-object/from16 p11, v7

    iget-wide v6, v2, Li2/x;->a:J

    move-wide/from16 v21, v6

    goto :goto_1e

    :goto_1f
    invoke-virtual {v5, v2}, Lp1/q;->q(Z)V

    new-instance v20, Ll3/v0;

    const-wide/16 v33, 0x0

    const v35, 0xfffffe

    const-wide/16 v23, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    const-wide/16 v28, 0x0

    const/16 v30, 0x0

    const/16 v31, 0x0

    const/16 v32, 0x0

    invoke-direct/range {v20 .. v35}, Ll3/v0;-><init>(JJLp3/r;Lp3/n;Lp3/i;JLw3/l;Li2/z0;IJI)V

    move-object/from16 v2, v20

    invoke-virtual {v1, v2}, Ll3/v0;->e(Ll3/v0;)Ll3/v0;

    move-result-object v2

    const/4 v6, 0x0

    invoke-static {v3, v12, v6, v4, v0}, Lg1/i8;->f(Landroidx/compose/ui/Modifier;ZZLj0/i;Lg1/e8;)Landroidx/compose/ui/Modifier;

    move-result-object v7

    move-object/from16 p16, v1

    const/4 v1, 0x3

    invoke-static {v5, v1}, Lse/h;->H(Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v1

    invoke-static {v7, v6, v1}, Lg1/p8;->c(Landroidx/compose/ui/Modifier;ZLjava/lang/String;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    sget v7, Lg1/i8;->c:F

    sget v6, Lg1/i8;->b:F

    invoke-static {v1, v7, v6}, Landroidx/compose/foundation/layout/d;->a(Landroidx/compose/ui/Modifier;FF)Landroidx/compose/ui/Modifier;

    move-result-object v7

    new-instance v1, Li2/c1;

    const/4 v6, 0x0

    invoke-virtual {v0, v6, v5}, Lg1/y1;->b(ZLandroidx/compose/runtime/Composer;)Lp1/c1;

    move-result-object v6

    invoke-interface {v6}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Li2/x;

    move-object/from16 v18, v2

    iget-wide v2, v6, Li2/x;->a:J

    invoke-direct {v1, v2, v3}, Li2/c1;-><init>(J)V

    new-instance v2, Lg1/t8;

    move-object/from16 p4, p0

    move-object/from16 p13, v0

    move-object/from16 p3, v2

    move-object/from16 p8, v4

    move-object/from16 p10, v11

    move/from16 p5, v12

    move/from16 p6, v13

    move-object/from16 p9, v15

    move-object/from16 p7, v16

    invoke-direct/range {p3 .. p13}, Lg1/t8;-><init>(Ljava/lang/String;ZZLq3/g0;Lj0/i;Lc93/m;Lc93/m;Lc93/m;Li2/a1;Lg1/y1;)V

    move-object/from16 v11, p3

    move/from16 v8, p5

    move-object/from16 v0, p9

    move-object/from16 v2, p10

    move-object/from16 v3, p11

    move-object/from16 v4, p12

    move v6, v10

    move-object/from16 v10, v18

    move-object/from16 v18, p8

    const v12, -0x4f7d6fd

    invoke-static {v12, v5, v11}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v20

    const v11, 0xfc7e

    and-int v11, v17, v11

    shl-int/lit8 v6, v6, 0xc

    const/high16 v12, 0x380000

    and-int/2addr v12, v6

    or-int/2addr v11, v12

    const/high16 v12, 0xe000000

    and-int/2addr v6, v12

    or-int v22, v11, v6

    const v23, 0x30036

    const/16 v24, 0x1000

    move-object v12, v9

    const/4 v9, 0x0

    const/16 v17, 0x0

    move-object/from16 v6, p1

    move-object/from16 v11, p14

    move-object/from16 v21, v5

    move/from16 v15, v19

    move-object/from16 v5, p0

    move-object/from16 v19, v1

    invoke-static/range {v5 .. v24}, Lu0/i;->a(Ljava/lang/String;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZZLl3/v0;Lu0/r0;Lu0/q0;ZIILq3/g0;Lkotlin/jvm/functions/Function1;Lj0/i;Li2/t;Lx1/b;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v5, p16

    move-object v6, v0

    move-object v7, v2

    move-object v10, v11

    move-object v11, v12

    move v12, v13

    move v13, v14

    move v14, v15

    move-object/from16 v9, v16

    move-object v15, v4

    move v4, v8

    move-object v8, v3

    goto :goto_20

    :cond_2e
    move-object/from16 v21, v5

    invoke-virtual/range {v21 .. v21}, Lp1/q;->X()V

    move-object/from16 v9, p8

    move-object/from16 v10, p9

    move/from16 v14, p13

    move-object v8, v7

    move-object v7, v11

    move v4, v12

    move-object v5, v13

    move-object v6, v15

    move-object/from16 v11, p10

    move/from16 v12, p11

    move/from16 v13, p12

    move-object/from16 v15, p14

    :goto_20
    invoke-virtual/range {v21 .. v21}, Lp1/q;->u()Lp1/v1;

    move-result-object v0

    if-eqz v0, :cond_2f

    move-object v1, v0

    new-instance v0, Lg1/r8;

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move-object/from16 v16, p15

    move/from16 v17, p17

    move/from16 v18, p18

    move/from16 v19, p19

    move-object/from16 v36, v1

    move-object/from16 v1, p0

    invoke-direct/range {v0 .. v19}, Lg1/r8;-><init>(Ljava/lang/String;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZLl3/v0;Lc93/m;Lc93/m;Lc93/m;Lq3/g0;Lu0/r0;Lu0/q0;ZIILi2/a1;Lg1/y1;III)V

    move-object/from16 v1, v36

    iput-object v0, v1, Lp1/v1;->d:Lc93/m;

    :cond_2f
    return-void
.end method

.method public static final b(Lq3/y;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZLl3/v0;Lc93/m;Lc93/m;Lq3/g0;Lu0/r0;Lu0/q0;IILj0/i;Li2/a1;Lg1/y1;Landroidx/compose/runtime/Composer;I)V
    .locals 35

    move-object/from16 v3, p2

    move/from16 v4, p3

    move-object/from16 v0, p4

    move-object/from16 v15, p14

    move/from16 v1, p16

    move-object/from16 v2, p15

    check-cast v2, Lp1/q;

    const v5, -0x57a136cd

    invoke-virtual {v2, v5}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v5, v1, 0x6

    if-nez v5, :cond_1

    move-object/from16 v5, p0

    invoke-virtual {v2, v5}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_0

    const/4 v6, 0x4

    goto :goto_0

    :cond_0
    const/4 v6, 0x2

    :goto_0
    or-int/2addr v6, v1

    goto :goto_1

    :cond_1
    move-object/from16 v5, p0

    move v6, v1

    :goto_1
    and-int/lit8 v7, v1, 0x30

    move-object/from16 v13, p1

    if-nez v7, :cond_3

    invoke-virtual {v2, v13}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_2

    const/16 v7, 0x20

    goto :goto_2

    :cond_2
    const/16 v7, 0x10

    :goto_2
    or-int/2addr v6, v7

    :cond_3
    and-int/lit16 v7, v1, 0x180

    if-nez v7, :cond_5

    invoke-virtual {v2, v3}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_4

    const/16 v7, 0x100

    goto :goto_3

    :cond_4
    const/16 v7, 0x80

    :goto_3
    or-int/2addr v6, v7

    :cond_5
    and-int/lit16 v7, v1, 0xc00

    if-nez v7, :cond_7

    invoke-virtual {v2, v4}, Lp1/q;->h(Z)Z

    move-result v7

    if-eqz v7, :cond_6

    const/16 v7, 0x800

    goto :goto_4

    :cond_6
    const/16 v7, 0x400

    :goto_4
    or-int/2addr v6, v7

    :cond_7
    or-int/lit16 v6, v6, 0x6000

    const/high16 v7, 0x30000

    and-int/2addr v7, v1

    if-nez v7, :cond_9

    invoke-virtual {v2, v0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_8

    const/high16 v7, 0x20000

    goto :goto_5

    :cond_8
    const/high16 v7, 0x10000

    :goto_5
    or-int/2addr v6, v7

    :cond_9
    const/high16 v7, 0x180000

    or-int/2addr v6, v7

    const/high16 v7, 0xc00000

    and-int/2addr v7, v1

    move-object/from16 v9, p5

    if-nez v7, :cond_b

    invoke-virtual {v2, v9}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_a

    const/high16 v7, 0x800000

    goto :goto_6

    :cond_a
    const/high16 v7, 0x400000

    :goto_6
    or-int/2addr v6, v7

    :cond_b
    const/high16 v7, 0x6000000

    or-int/2addr v6, v7

    const/high16 v7, 0x30000000

    and-int/2addr v7, v1

    const/high16 v8, 0x10000000

    const/high16 v10, 0x20000000

    if-nez v7, :cond_d

    move-object/from16 v7, p6

    invoke-virtual {v2, v7}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_c

    move v11, v10

    goto :goto_7

    :cond_c
    move v11, v8

    :goto_7
    or-int/2addr v6, v11

    :goto_8
    move-object/from16 v11, p13

    move v14, v6

    goto :goto_9

    :cond_d
    move-object/from16 v7, p6

    goto :goto_8

    :goto_9
    invoke-virtual {v2, v11}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_e

    const/high16 v6, 0x4000000

    goto :goto_a

    :cond_e
    const/high16 v6, 0x2000000

    :goto_a
    const v12, 0xd965b6

    or-int/2addr v6, v12

    invoke-virtual {v2, v15}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v12

    if-eqz v12, :cond_f

    move v8, v10

    :cond_f
    or-int/2addr v6, v8

    const v8, 0x12492493

    and-int v10, v14, v8

    const v12, 0x12492492

    move/from16 p15, v8

    const/4 v8, 0x0

    const/16 v16, 0x1

    if-ne v10, v12, :cond_11

    and-int v6, v6, p15

    if-eq v6, v12, :cond_10

    goto :goto_b

    :cond_10
    move v6, v8

    goto :goto_c

    :cond_11
    :goto_b
    move/from16 v6, v16

    :goto_c
    and-int/lit8 v10, v14, 0x1

    invoke-virtual {v2, v10, v6}, Lp1/q;->U(IZ)Z

    move-result v6

    if-eqz v6, :cond_17

    invoke-virtual {v2}, Lp1/q;->Z()V

    and-int/lit8 v6, v1, 0x1

    if-eqz v6, :cond_13

    invoke-virtual {v2}, Lp1/q;->C()Z

    move-result v6

    if-eqz v6, :cond_12

    goto :goto_d

    :cond_12
    invoke-virtual {v2}, Lp1/q;->X()V

    move-object/from16 v6, p7

    move-object/from16 v17, p9

    move/from16 v13, p10

    move/from16 v16, v14

    move/from16 v14, p11

    goto :goto_e

    :cond_13
    :goto_d
    new-instance v17, Lu0/q0;

    const/16 v21, 0x0

    const/16 v22, 0x3f

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    invoke-direct/range {v17 .. v22}, Lu0/q0;-><init>(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;I)V

    sget-object v6, Lq3/f0;->w:Lg40/h2;

    const v10, 0x7fffffff

    move/from16 v13, v16

    move/from16 v16, v14

    move v14, v13

    move v13, v10

    :goto_e
    invoke-virtual {v2}, Lp1/q;->r()V

    if-nez p12, :cond_15

    const v10, 0x6e67a7a8

    invoke-virtual {v2, v10}, Lp1/q;->e0(I)V

    invoke-virtual {v2}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v10

    sget-object v12, Lp1/l;->a:Lp1/v0;

    if-ne v10, v12, :cond_14

    invoke-static {v2}, Ld;->g(Lp1/q;)Lj0/j;

    move-result-object v10

    :cond_14
    check-cast v10, Lj0/i;

    invoke-virtual {v2, v8}, Lp1/q;->q(Z)V

    goto :goto_f

    :cond_15
    const v10, 0xbd1c90f

    invoke-virtual {v2, v10}, Lp1/q;->e0(I)V

    invoke-virtual {v2, v8}, Lp1/q;->q(Z)V

    move-object/from16 v10, p12

    :goto_f
    const v12, 0xbd1df81

    invoke-virtual {v2, v12}, Lp1/q;->e0(I)V

    invoke-virtual {v0}, Ll3/v0;->c()J

    move-result-wide v18

    const-wide/16 v20, 0x10

    cmp-long v12, v18, v20

    if-eqz v12, :cond_16

    move-object/from16 p7, v6

    move-wide/from16 v19, v18

    goto :goto_10

    :cond_16
    invoke-virtual {v15, v4, v2}, Lg1/y1;->e(ZLandroidx/compose/runtime/Composer;)Lp1/c1;

    move-result-object v12

    invoke-interface {v12}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Li2/x;

    move-object/from16 p7, v6

    iget-wide v5, v12, Li2/x;->a:J

    move-wide/from16 v19, v5

    :goto_10
    invoke-virtual {v2, v8}, Lp1/q;->q(Z)V

    new-instance v18, Ll3/v0;

    const-wide/16 v31, 0x0

    const v33, 0xfffffe

    const-wide/16 v21, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const-wide/16 v26, 0x0

    const/16 v28, 0x0

    const/16 v29, 0x0

    const/16 v30, 0x0

    invoke-direct/range {v18 .. v33}, Ll3/v0;-><init>(JJLp3/r;Lp3/n;Lp3/i;JLw3/l;Li2/z0;IJI)V

    move-object/from16 v5, v18

    invoke-virtual {v0, v5}, Ll3/v0;->e(Ll3/v0;)Ll3/v0;

    move-result-object v18

    invoke-static {v3, v4, v8, v10, v15}, Lg1/i8;->f(Landroidx/compose/ui/Modifier;ZZLj0/i;Lg1/e8;)Landroidx/compose/ui/Modifier;

    move-result-object v5

    const/4 v6, 0x3

    invoke-static {v2, v6}, Lse/h;->H(Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v6

    invoke-static {v5, v8, v6}, Lg1/p8;->c(Landroidx/compose/ui/Modifier;ZLjava/lang/String;)Landroidx/compose/ui/Modifier;

    move-result-object v5

    sget v6, Lg1/i8;->c:F

    sget v12, Lg1/i8;->b:F

    invoke-static {v5, v6, v12}, Landroidx/compose/foundation/layout/d;->a(Landroidx/compose/ui/Modifier;FF)Landroidx/compose/ui/Modifier;

    move-result-object v19

    new-instance v5, Li2/c1;

    invoke-virtual {v15, v8, v2}, Lg1/y1;->b(ZLandroidx/compose/runtime/Composer;)Lp1/c1;

    move-result-object v6

    invoke-interface {v6}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Li2/x;

    iget-wide v0, v6, Li2/x;->a:J

    invoke-direct {v5, v0, v1}, Li2/c1;-><init>(J)V

    new-instance v4, Li20/c1;

    move/from16 v6, p3

    move-object v0, v5

    move-object v8, v10

    move-object v12, v15

    move-object/from16 v5, p0

    move-object v10, v7

    move-object/from16 v7, p7

    invoke-direct/range {v4 .. v12}, Li20/c1;-><init>(Lq3/y;ZLq3/g0;Lj0/i;Lc93/m;Lc93/m;Li2/a1;Lg1/y1;)V

    move-object v15, v7

    const v1, 0x5d4dcd56

    invoke-static {v1, v2, v4}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v1

    const v4, 0xfc7e

    and-int v4, v16, v4

    const/high16 v5, 0x6180000

    or-int v21, v4, v5

    const v22, 0x30036

    const/16 v23, 0x1000

    move-object/from16 v11, v17

    move-object/from16 v17, v8

    const/4 v8, 0x0

    const/4 v12, 0x0

    const/16 v16, 0x0

    move-object/from16 v4, p0

    move-object/from16 v5, p1

    move/from16 v7, p3

    move-object/from16 v10, p8

    move-object/from16 v20, v2

    move-object/from16 v9, v18

    move-object/from16 v6, v19

    move-object/from16 v18, v0

    move-object/from16 v19, v1

    invoke-static/range {v4 .. v23}, Lu0/i;->b(Lq3/y;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZZLl3/v0;Lu0/r0;Lu0/q0;ZIILq3/g0;Lkotlin/jvm/functions/Function1;Lj0/i;Li2/c1;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;III)V

    move-object v10, v11

    move v11, v13

    move v12, v14

    move-object v8, v15

    goto :goto_11

    :cond_17
    move-object/from16 v20, v2

    invoke-virtual/range {v20 .. v20}, Lp1/q;->X()V

    move-object/from16 v8, p7

    move-object/from16 v10, p9

    move/from16 v11, p10

    move/from16 v12, p11

    :goto_11
    invoke-virtual/range {v20 .. v20}, Lp1/q;->u()Lp1/v1;

    move-result-object v0

    if-eqz v0, :cond_18

    move-object v1, v0

    new-instance v0, Lg1/q8;

    move-object/from16 v2, p1

    move/from16 v4, p3

    move-object/from16 v5, p4

    move-object/from16 v6, p5

    move-object/from16 v7, p6

    move-object/from16 v9, p8

    move-object/from16 v13, p12

    move-object/from16 v14, p13

    move-object/from16 v15, p14

    move/from16 v16, p16

    move-object/from16 v34, v1

    move-object/from16 v1, p0

    invoke-direct/range {v0 .. v16}, Lg1/q8;-><init>(Lq3/y;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZLl3/v0;Lc93/m;Lc93/m;Lq3/g0;Lu0/r0;Lu0/q0;IILj0/i;Li2/a1;Lg1/y1;I)V

    move-object/from16 v1, v34

    iput-object v0, v1, Lp1/v1;->d:Lc93/m;

    :cond_18
    return-void
.end method

.method public static final c(Landroidx/compose/ui/Modifier;Lc93/m;Lc93/m;Lkotlin/jvm/functions/Function3;Lc93/m;Lc93/m;ZFLl0/k1;Landroidx/compose/runtime/Composer;I)V
    .locals 24

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move-object/from16 v4, p3

    move-object/from16 v5, p4

    move-object/from16 v6, p5

    move/from16 v7, p6

    move/from16 v8, p7

    move-object/from16 v9, p8

    move/from16 v10, p10

    sget-object v0, Lb2/e;->w:Lb2/m;

    sget-object v11, Lb2/e;->E:Lb2/m;

    move-object/from16 v12, p9

    check-cast v12, Lp1/q;

    const v13, -0x5f12e814

    invoke-virtual {v12, v13}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v13, v10, 0x6

    if-nez v13, :cond_1

    invoke-virtual {v12, v1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v13

    if-eqz v13, :cond_0

    const/4 v13, 0x4

    goto :goto_0

    :cond_0
    const/4 v13, 0x2

    :goto_0
    or-int/2addr v13, v10

    goto :goto_1

    :cond_1
    move v13, v10

    :goto_1
    and-int/lit8 v14, v10, 0x30

    if-nez v14, :cond_3

    invoke-virtual {v12, v2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v14

    if-eqz v14, :cond_2

    const/16 v14, 0x20

    goto :goto_2

    :cond_2
    const/16 v14, 0x10

    :goto_2
    or-int/2addr v13, v14

    :cond_3
    and-int/lit16 v14, v10, 0x180

    if-nez v14, :cond_5

    invoke-virtual {v12, v3}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v14

    if-eqz v14, :cond_4

    const/16 v14, 0x100

    goto :goto_3

    :cond_4
    const/16 v14, 0x80

    :goto_3
    or-int/2addr v13, v14

    :cond_5
    and-int/lit16 v14, v10, 0xc00

    if-nez v14, :cond_7

    invoke-virtual {v12, v4}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v14

    if-eqz v14, :cond_6

    const/16 v14, 0x800

    goto :goto_4

    :cond_6
    const/16 v14, 0x400

    :goto_4
    or-int/2addr v13, v14

    :cond_7
    and-int/lit16 v14, v10, 0x6000

    if-nez v14, :cond_9

    invoke-virtual {v12, v5}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v14

    if-eqz v14, :cond_8

    const/16 v14, 0x4000

    goto :goto_5

    :cond_8
    const/16 v14, 0x2000

    :goto_5
    or-int/2addr v13, v14

    :cond_9
    const/high16 v14, 0x30000

    and-int/2addr v14, v10

    if-nez v14, :cond_b

    invoke-virtual {v12, v6}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v14

    if-eqz v14, :cond_a

    const/high16 v14, 0x20000

    goto :goto_6

    :cond_a
    const/high16 v14, 0x10000

    :goto_6
    or-int/2addr v13, v14

    :cond_b
    const/high16 v14, 0x180000

    and-int/2addr v14, v10

    if-nez v14, :cond_d

    invoke-virtual {v12, v7}, Lp1/q;->h(Z)Z

    move-result v14

    if-eqz v14, :cond_c

    const/high16 v14, 0x100000

    goto :goto_7

    :cond_c
    const/high16 v14, 0x80000

    :goto_7
    or-int/2addr v13, v14

    :cond_d
    const/high16 v14, 0xc00000

    and-int/2addr v14, v10

    if-nez v14, :cond_f

    invoke-virtual {v12, v8}, Lp1/q;->d(F)Z

    move-result v14

    if-eqz v14, :cond_e

    const/high16 v14, 0x800000

    goto :goto_8

    :cond_e
    const/high16 v14, 0x400000

    :goto_8
    or-int/2addr v13, v14

    :cond_f
    const/high16 v14, 0x6000000

    and-int/2addr v14, v10

    if-nez v14, :cond_11

    invoke-virtual {v12, v9}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v14

    if-eqz v14, :cond_10

    const/high16 v14, 0x4000000

    goto :goto_9

    :cond_10
    const/high16 v14, 0x2000000

    :goto_9
    or-int/2addr v13, v14

    :cond_11
    const v14, 0x2492493

    and-int/2addr v14, v13

    const v15, 0x2492492

    if-eq v14, v15, :cond_12

    const/4 v14, 0x1

    goto :goto_a

    :cond_12
    const/4 v14, 0x0

    :goto_a
    and-int/lit8 v15, v13, 0x1

    invoke-virtual {v12, v15, v14}, Lp1/q;->U(IZ)Z

    move-result v14

    if-eqz v14, :cond_2d

    const/high16 v14, 0x380000

    and-int/2addr v14, v13

    const/high16 v15, 0x100000

    if-ne v14, v15, :cond_13

    const/4 v14, 0x1

    goto :goto_b

    :cond_13
    const/4 v14, 0x0

    :goto_b
    const/high16 v15, 0x1c00000

    and-int/2addr v15, v13

    const/high16 v10, 0x800000

    if-ne v15, v10, :cond_14

    const/4 v10, 0x1

    goto :goto_c

    :cond_14
    const/4 v10, 0x0

    :goto_c
    or-int/2addr v10, v14

    const/high16 v14, 0xe000000

    and-int/2addr v14, v13

    const/high16 v15, 0x4000000

    if-ne v14, v15, :cond_15

    const/4 v14, 0x1

    goto :goto_d

    :cond_15
    const/4 v14, 0x0

    :goto_d
    or-int/2addr v10, v14

    invoke-virtual {v12}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v14

    if-nez v10, :cond_16

    sget-object v10, Lp1/l;->a:Lp1/v0;

    if-ne v14, v10, :cond_17

    :cond_16
    new-instance v14, Lg1/x8;

    invoke-direct {v14, v7, v8, v9}, Lg1/x8;-><init>(ZFLl0/k1;)V

    invoke-virtual {v12, v14}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_17
    check-cast v14, Lg1/x8;

    sget-object v10, Lb3/v1;->n:Lp1/u2;

    invoke-virtual {v12, v10}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Ly3/m;

    iget-wide v7, v12, Lp1/q;->T:J

    invoke-static {v7, v8}, Ljava/lang/Long;->hashCode(J)I

    move-result v7

    invoke-virtual {v12}, Lp1/q;->m()Lp1/p1;

    move-result-object v8

    invoke-static {v12, v1}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v15

    sget-object v16, La3/l;->a:La3/k;

    invoke-virtual/range {v16 .. v16}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v1, La3/k;->b:La3/j;

    invoke-virtual {v12}, Lp1/q;->i0()V

    move/from16 v16, v13

    iget-boolean v13, v12, Lp1/q;->S:Z

    if-eqz v13, :cond_18

    invoke-virtual {v12, v1}, Lp1/q;->l(Lc93/a;)V

    goto :goto_e

    :cond_18
    invoke-virtual {v12}, Lp1/q;->s0()V

    :goto_e
    sget-object v13, La3/k;->g:La3/i;

    invoke-static {v12, v13, v14}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v14, La3/k;->f:La3/i;

    invoke-static {v12, v14, v8}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v8, La3/k;->j:La3/i;

    iget-boolean v2, v12, Lp1/q;->S:Z

    if-nez v2, :cond_19

    invoke-virtual {v12}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_1a

    :cond_19
    invoke-static {v7, v12, v7, v8}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_1a
    sget-object v2, La3/k;->d:La3/i;

    invoke-static {v12, v2, v15}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v3, Lb2/t;->w:Lb2/t;

    if-eqz v5, :cond_1e

    const v7, -0x561b0621

    invoke-virtual {v12, v7}, Lp1/q;->e0(I)V

    const-string v7, "Leading"

    invoke-static {v3, v7}, Landroidx/compose/ui/layout/a;->c(Landroidx/compose/ui/Modifier;Ljava/lang/String;)Landroidx/compose/ui/Modifier;

    move-result-object v7

    sget-object v15, Lg1/h3;->a:Lp1/u2;

    sget-object v15, Landroidx/compose/material/MinimumInteractiveModifier;->w:Landroidx/compose/material/MinimumInteractiveModifier;

    invoke-interface {v7, v15}, Landroidx/compose/ui/Modifier;->e(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v7

    move-object/from16 v17, v0

    const/4 v15, 0x0

    invoke-static {v11, v15}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v0

    move-object v15, v10

    iget-wide v9, v12, Lp1/q;->T:J

    invoke-static {v9, v10}, Ljava/lang/Long;->hashCode(J)I

    move-result v9

    invoke-virtual {v12}, Lp1/q;->m()Lp1/p1;

    move-result-object v10

    invoke-static {v12, v7}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v7

    invoke-virtual {v12}, Lp1/q;->i0()V

    move-object/from16 v18, v15

    iget-boolean v15, v12, Lp1/q;->S:Z

    if-eqz v15, :cond_1b

    invoke-virtual {v12, v1}, Lp1/q;->l(Lc93/a;)V

    goto :goto_f

    :cond_1b
    invoke-virtual {v12}, Lp1/q;->s0()V

    :goto_f
    invoke-static {v12, v13, v0}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v12, v14, v10}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v0, v12, Lp1/q;->S:Z

    if-nez v0, :cond_1c

    invoke-virtual {v12}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v0

    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    invoke-static {v0, v10}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1d

    :cond_1c
    invoke-static {v9, v12, v9, v8}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_1d
    invoke-static {v12, v2, v7}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    shr-int/lit8 v0, v16, 0xc

    and-int/lit8 v0, v0, 0xe

    const/4 v7, 0x1

    const/4 v15, 0x0

    invoke-static {v0, v5, v12, v7, v15}, Ldc/b;->A(ILc93/m;Lp1/q;ZZ)V

    goto :goto_10

    :cond_1e
    move-object/from16 v17, v0

    move-object/from16 v18, v10

    const/4 v15, 0x0

    const v0, -0x56174521

    invoke-virtual {v12, v0}, Lp1/q;->e0(I)V

    invoke-virtual {v12, v15}, Lp1/q;->q(Z)V

    :goto_10
    if-eqz v6, :cond_22

    const v0, -0x56169e43

    invoke-virtual {v12, v0}, Lp1/q;->e0(I)V

    const-string v0, "Trailing"

    invoke-static {v3, v0}, Landroidx/compose/ui/layout/a;->c(Landroidx/compose/ui/Modifier;Ljava/lang/String;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    sget-object v7, Lg1/h3;->a:Lp1/u2;

    sget-object v7, Landroidx/compose/material/MinimumInteractiveModifier;->w:Landroidx/compose/material/MinimumInteractiveModifier;

    invoke-interface {v0, v7}, Landroidx/compose/ui/Modifier;->e(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    invoke-static {v11, v15}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v7

    iget-wide v9, v12, Lp1/q;->T:J

    invoke-static {v9, v10}, Ljava/lang/Long;->hashCode(J)I

    move-result v9

    invoke-virtual {v12}, Lp1/q;->m()Lp1/p1;

    move-result-object v10

    invoke-static {v12, v0}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    invoke-virtual {v12}, Lp1/q;->i0()V

    iget-boolean v11, v12, Lp1/q;->S:Z

    if-eqz v11, :cond_1f

    invoke-virtual {v12, v1}, Lp1/q;->l(Lc93/a;)V

    goto :goto_11

    :cond_1f
    invoke-virtual {v12}, Lp1/q;->s0()V

    :goto_11
    invoke-static {v12, v13, v7}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v12, v14, v10}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v7, v12, Lp1/q;->S:Z

    if-nez v7, :cond_20

    invoke-virtual {v12}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v7

    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    invoke-static {v7, v10}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_21

    :cond_20
    invoke-static {v9, v12, v9, v8}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_21
    invoke-static {v12, v2, v0}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    shr-int/lit8 v0, v16, 0xf

    and-int/lit8 v0, v0, 0xe

    const/4 v7, 0x1

    const/4 v15, 0x0

    invoke-static {v0, v6, v12, v7, v15}, Ldc/b;->A(ILc93/m;Lp1/q;ZZ)V

    :goto_12
    move-object/from16 v9, p8

    move-object/from16 v10, v18

    goto :goto_13

    :cond_22
    const v0, -0x5612d5c1

    invoke-virtual {v12, v0}, Lp1/q;->e0(I)V

    invoke-virtual {v12, v15}, Lp1/q;->q(Z)V

    goto :goto_12

    :goto_13
    invoke-static {v9, v10}, Landroidx/compose/foundation/layout/a;->i(Ll0/k1;Ly3/m;)F

    move-result v0

    invoke-static {v9, v10}, Landroidx/compose/foundation/layout/a;->h(Ll0/k1;Ly3/m;)F

    move-result v7

    if-eqz v5, :cond_23

    sget v10, Lg1/p8;->b:F

    sub-float/2addr v0, v10

    int-to-float v10, v15

    cmpg-float v11, v0, v10

    if-gez v11, :cond_23

    move v0, v10

    :cond_23
    move/from16 v19, v0

    if-eqz v6, :cond_24

    sget v0, Lg1/p8;->b:F

    sub-float/2addr v7, v0

    int-to-float v0, v15

    cmpg-float v10, v7, v0

    if-gez v10, :cond_24

    move v7, v0

    :cond_24
    move/from16 v21, v7

    const/16 v22, 0x0

    const/16 v23, 0xa

    const/16 v20, 0x0

    move-object/from16 v18, v3

    invoke-static/range {v18 .. v23}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v0

    if-eqz v4, :cond_25

    const v7, -0x5605d5bc

    invoke-virtual {v12, v7}, Lp1/q;->e0(I)V

    const-string v7, "Hint"

    invoke-static {v3, v7}, Landroidx/compose/ui/layout/a;->c(Landroidx/compose/ui/Modifier;Ljava/lang/String;)Landroidx/compose/ui/Modifier;

    move-result-object v7

    invoke-interface {v7, v0}, Landroidx/compose/ui/Modifier;->e(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v7

    shr-int/lit8 v10, v16, 0x6

    and-int/lit8 v10, v10, 0x70

    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    invoke-interface {v4, v7, v12, v10}, Lkotlin/jvm/functions/Function3;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/4 v15, 0x0

    invoke-virtual {v12, v15}, Lp1/q;->q(Z)V

    goto :goto_14

    :cond_25
    const/4 v15, 0x0

    const v7, -0x56048021

    invoke-virtual {v12, v7}, Lp1/q;->e0(I)V

    invoke-virtual {v12, v15}, Lp1/q;->q(Z)V

    :goto_14
    if-eqz p2, :cond_29

    const v7, -0x5603f95a

    invoke-virtual {v12, v7}, Lp1/q;->e0(I)V

    const-string v7, "Label"

    invoke-static {v3, v7}, Landroidx/compose/ui/layout/a;->c(Landroidx/compose/ui/Modifier;Ljava/lang/String;)Landroidx/compose/ui/Modifier;

    move-result-object v7

    invoke-interface {v7, v0}, Landroidx/compose/ui/Modifier;->e(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v7

    move-object/from16 v10, v17

    invoke-static {v10, v15}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v11

    iget-wide v4, v12, Lp1/q;->T:J

    invoke-static {v4, v5}, Ljava/lang/Long;->hashCode(J)I

    move-result v4

    invoke-virtual {v12}, Lp1/q;->m()Lp1/p1;

    move-result-object v5

    invoke-static {v12, v7}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v7

    invoke-virtual {v12}, Lp1/q;->i0()V

    iget-boolean v15, v12, Lp1/q;->S:Z

    if-eqz v15, :cond_26

    invoke-virtual {v12, v1}, Lp1/q;->l(Lc93/a;)V

    goto :goto_15

    :cond_26
    invoke-virtual {v12}, Lp1/q;->s0()V

    :goto_15
    invoke-static {v12, v13, v11}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v12, v14, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v5, v12, Lp1/q;->S:Z

    if-nez v5, :cond_27

    invoke-virtual {v12}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v11

    invoke-static {v5, v11}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_28

    :cond_27
    invoke-static {v4, v12, v4, v8}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_28
    invoke-static {v12, v2, v7}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    shr-int/lit8 v4, v16, 0x6

    and-int/lit8 v4, v4, 0xe

    move-object/from16 v5, p2

    const/4 v7, 0x1

    const/4 v15, 0x0

    invoke-static {v4, v5, v12, v7, v15}, Ldc/b;->A(ILc93/m;Lp1/q;ZZ)V

    goto :goto_16

    :cond_29
    move-object/from16 v5, p2

    move-object/from16 v10, v17

    const/4 v7, 0x1

    const v4, -0x5602ab41

    invoke-virtual {v12, v4}, Lp1/q;->e0(I)V

    invoke-virtual {v12, v15}, Lp1/q;->q(Z)V

    :goto_16
    const-string v4, "TextField"

    invoke-static {v3, v4}, Landroidx/compose/ui/layout/a;->c(Landroidx/compose/ui/Modifier;Ljava/lang/String;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    invoke-interface {v3, v0}, Landroidx/compose/ui/Modifier;->e(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    invoke-static {v10, v7}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v3

    iget-wide v10, v12, Lp1/q;->T:J

    invoke-static {v10, v11}, Ljava/lang/Long;->hashCode(J)I

    move-result v4

    invoke-virtual {v12}, Lp1/q;->m()Lp1/p1;

    move-result-object v7

    invoke-static {v12, v0}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    invoke-virtual {v12}, Lp1/q;->i0()V

    iget-boolean v10, v12, Lp1/q;->S:Z

    if-eqz v10, :cond_2a

    invoke-virtual {v12, v1}, Lp1/q;->l(Lc93/a;)V

    goto :goto_17

    :cond_2a
    invoke-virtual {v12}, Lp1/q;->s0()V

    :goto_17
    invoke-static {v12, v13, v3}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v12, v14, v7}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v1, v12, Lp1/q;->S:Z

    if-nez v1, :cond_2b

    invoke-virtual {v12}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2c

    :cond_2b
    invoke-static {v4, v12, v4, v8}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_2c
    invoke-static {v12, v2, v0}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    shr-int/lit8 v0, v16, 0x3

    and-int/lit8 v0, v0, 0xe

    move-object/from16 v2, p1

    const/4 v7, 0x1

    invoke-static {v0, v2, v12, v7, v7}, Ldc/b;->A(ILc93/m;Lp1/q;ZZ)V

    goto :goto_18

    :cond_2d
    move-object v5, v3

    invoke-virtual {v12}, Lp1/q;->X()V

    :goto_18
    invoke-virtual {v12}, Lp1/q;->u()Lp1/v1;

    move-result-object v11

    if-eqz v11, :cond_2e

    new-instance v0, Lg1/s8;

    move-object/from16 v1, p0

    move-object/from16 v4, p3

    move/from16 v7, p6

    move/from16 v8, p7

    move/from16 v10, p10

    move-object v3, v5

    move-object/from16 v5, p4

    invoke-direct/range {v0 .. v10}, Lg1/s8;-><init>(Landroidx/compose/ui/Modifier;Lc93/m;Lc93/m;Lkotlin/jvm/functions/Function3;Lc93/m;Lc93/m;ZFLl0/k1;I)V

    iput-object v0, v11, Lp1/v1;->d:Lc93/m;

    :cond_2e
    return-void
.end method

.method public static final d(IZIIIIJFLl0/k1;)I
    .locals 2

    sget v0, Lg1/u8;->c:F

    mul-float/2addr v0, p8

    invoke-interface {p9}, Ll0/k1;->d()F

    move-result v1

    mul-float/2addr v1, p8

    invoke-interface {p9}, Ll0/k1;->a()F

    move-result p9

    mul-float/2addr p9, p8

    invoke-static {p0, p5}, Ljava/lang/Math;->max(II)I

    move-result p0

    if-eqz p1, :cond_0

    int-to-float p1, p2

    add-float/2addr p1, v0

    int-to-float p0, p0

    add-float/2addr p1, p0

    add-float/2addr p1, p9

    goto :goto_0

    :cond_0
    int-to-float p0, p0

    add-float/2addr v1, p0

    add-float p1, v1, p9

    :goto_0
    invoke-static {p1}, Le93/b;->X(F)I

    move-result p0

    invoke-static {p3, p4}, Ljava/lang/Math;->max(II)I

    move-result p1

    invoke-static {p0, p1}, Ljava/lang/Math;->max(II)I

    move-result p0

    invoke-static {p0, p6, p7}, Ly3/b;->f(IJ)I

    move-result p0

    return p0
.end method
