.class public abstract Lu0/i;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final synthetic a:I


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0x28

    int-to-float v0, v0

    invoke-static {v0, v0}, Lvf3/b;->a(FF)J

    return-void
.end method

.method public static final a(Ljava/lang/String;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZZLl3/v0;Lu0/r0;Lu0/q0;ZIILq3/g0;Lkotlin/jvm/functions/Function1;Lj0/i;Li2/t;Lx1/b;Landroidx/compose/runtime/Composer;III)V
    .locals 32

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move-object/from16 v7, p6

    move/from16 v0, p17

    move/from16 v3, p18

    move/from16 v4, p19

    move-object/from16 v5, p16

    check-cast v5, Lp1/q;

    const v6, 0x78d0d0fc

    invoke-virtual {v5, v6}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v6, v0, 0x6

    if-nez v6, :cond_1

    invoke-virtual {v5, v1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_0

    const/4 v6, 0x4

    goto :goto_0

    :cond_0
    const/4 v6, 0x2

    :goto_0
    or-int/2addr v6, v0

    goto :goto_1

    :cond_1
    move v6, v0

    :goto_1
    and-int/lit8 v10, v0, 0x30

    if-nez v10, :cond_3

    invoke-virtual {v5, v2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_2

    const/16 v10, 0x20

    goto :goto_2

    :cond_2
    const/16 v10, 0x10

    :goto_2
    or-int/2addr v6, v10

    :cond_3
    and-int/lit16 v10, v0, 0x180

    if-nez v10, :cond_5

    move-object/from16 v10, p2

    invoke-virtual {v5, v10}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v13

    if-eqz v13, :cond_4

    const/16 v13, 0x100

    goto :goto_3

    :cond_4
    const/16 v13, 0x80

    :goto_3
    or-int/2addr v6, v13

    goto :goto_4

    :cond_5
    move-object/from16 v10, p2

    :goto_4
    and-int/lit16 v13, v0, 0xc00

    if-nez v13, :cond_7

    move/from16 v13, p3

    invoke-virtual {v5, v13}, Lp1/q;->h(Z)Z

    move-result v16

    if-eqz v16, :cond_6

    const/16 v16, 0x800

    goto :goto_5

    :cond_6
    const/16 v16, 0x400

    :goto_5
    or-int v6, v6, v16

    goto :goto_6

    :cond_7
    move/from16 v13, p3

    :goto_6
    and-int/lit8 v16, v4, 0x10

    const/16 v17, 0x2000

    const/16 v18, 0x4000

    if-eqz v16, :cond_9

    or-int/lit16 v6, v6, 0x6000

    :cond_8
    move/from16 v9, p4

    goto :goto_8

    :cond_9
    and-int/lit16 v9, v0, 0x6000

    if-nez v9, :cond_8

    move/from16 v9, p4

    invoke-virtual {v5, v9}, Lp1/q;->h(Z)Z

    move-result v19

    if-eqz v19, :cond_a

    move/from16 v19, v18

    goto :goto_7

    :cond_a
    move/from16 v19, v17

    :goto_7
    or-int v6, v6, v19

    :goto_8
    const/high16 v19, 0x30000

    and-int v20, v0, v19

    const/high16 v21, 0x10000

    const/high16 v22, 0x20000

    move-object/from16 v11, p5

    if-nez v20, :cond_c

    invoke-virtual {v5, v11}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v23

    if-eqz v23, :cond_b

    move/from16 v23, v22

    goto :goto_9

    :cond_b
    move/from16 v23, v21

    :goto_9
    or-int v6, v6, v23

    :cond_c
    const/high16 v23, 0x180000

    and-int v23, v0, v23

    if-nez v23, :cond_e

    invoke-virtual {v5, v7}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v23

    if-eqz v23, :cond_d

    const/high16 v23, 0x100000

    goto :goto_a

    :cond_d
    const/high16 v23, 0x80000

    :goto_a
    or-int v6, v6, v23

    :cond_e
    const/high16 v23, 0xc00000

    and-int v23, v0, v23

    move-object/from16 v14, p7

    if-nez v23, :cond_10

    invoke-virtual {v5, v14}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v24

    if-eqz v24, :cond_f

    const/high16 v24, 0x800000

    goto :goto_b

    :cond_f
    const/high16 v24, 0x400000

    :goto_b
    or-int v6, v6, v24

    :cond_10
    and-int/lit16 v15, v4, 0x100

    const/high16 v25, 0x6000000

    if-eqz v15, :cond_11

    or-int v6, v6, v25

    move/from16 v12, p8

    goto :goto_d

    :cond_11
    and-int v25, v0, v25

    move/from16 v12, p8

    if-nez v25, :cond_13

    invoke-virtual {v5, v12}, Lp1/q;->h(Z)Z

    move-result v26

    if-eqz v26, :cond_12

    const/high16 v26, 0x4000000

    goto :goto_c

    :cond_12
    const/high16 v26, 0x2000000

    :goto_c
    or-int v6, v6, v26

    :cond_13
    :goto_d
    const/high16 v26, 0x30000000

    and-int v26, v0, v26

    if-nez v26, :cond_16

    and-int/lit16 v8, v4, 0x200

    if-nez v8, :cond_14

    move/from16 v8, p9

    invoke-virtual {v5, v8}, Lp1/q;->e(I)Z

    move-result v27

    if-eqz v27, :cond_15

    const/high16 v27, 0x20000000

    goto :goto_e

    :cond_14
    move/from16 v8, p9

    :cond_15
    const/high16 v27, 0x10000000

    :goto_e
    or-int v6, v6, v27

    goto :goto_f

    :cond_16
    move/from16 v8, p9

    :goto_f
    and-int/lit16 v0, v4, 0x400

    if-eqz v0, :cond_17

    or-int/lit8 v27, v3, 0x6

    move/from16 v28, v27

    move/from16 v27, v0

    move/from16 v0, p10

    goto :goto_11

    :cond_17
    and-int/lit8 v27, v3, 0x6

    if-nez v27, :cond_19

    move/from16 v27, v0

    move/from16 v0, p10

    invoke-virtual {v5, v0}, Lp1/q;->e(I)Z

    move-result v28

    if-eqz v28, :cond_18

    const/16 v28, 0x4

    goto :goto_10

    :cond_18
    const/16 v28, 0x2

    :goto_10
    or-int v28, v3, v28

    goto :goto_11

    :cond_19
    move/from16 v27, v0

    move/from16 v0, p10

    move/from16 v28, v3

    :goto_11
    and-int/lit16 v0, v4, 0x800

    if-eqz v0, :cond_1a

    or-int/lit8 v28, v28, 0x30

    move/from16 v29, v0

    :goto_12
    move/from16 v0, v28

    goto :goto_14

    :cond_1a
    and-int/lit8 v29, v3, 0x30

    if-nez v29, :cond_1c

    move/from16 v29, v0

    move-object/from16 v0, p11

    invoke-virtual {v5, v0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v30

    if-eqz v30, :cond_1b

    const/16 v20, 0x20

    goto :goto_13

    :cond_1b
    const/16 v20, 0x10

    :goto_13
    or-int v28, v28, v20

    goto :goto_12

    :cond_1c
    move/from16 v29, v0

    move-object/from16 v0, p11

    goto :goto_12

    :goto_14
    move/from16 p16, v6

    or-int/lit16 v6, v0, 0x180

    move/from16 v20, v6

    and-int/lit16 v6, v4, 0x2000

    if-eqz v6, :cond_1d

    or-int/lit16 v0, v0, 0xd80

    goto :goto_17

    :cond_1d
    and-int/lit16 v0, v3, 0xc00

    if-nez v0, :cond_1f

    move-object/from16 v0, p13

    invoke-virtual {v5, v0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v28

    if-eqz v28, :cond_1e

    const/16 v23, 0x800

    goto :goto_15

    :cond_1e
    const/16 v23, 0x400

    :goto_15
    or-int v20, v20, v23

    :goto_16
    move/from16 v0, v20

    goto :goto_17

    :cond_1f
    move-object/from16 v0, p13

    goto :goto_16

    :goto_17
    move/from16 v20, v6

    and-int/lit16 v6, v4, 0x4000

    if-eqz v6, :cond_20

    or-int/lit16 v0, v0, 0x6000

    move/from16 v17, v0

    move-object/from16 v0, p14

    goto :goto_18

    :cond_20
    move/from16 v23, v0

    and-int/lit16 v0, v3, 0x6000

    if-nez v0, :cond_22

    move-object/from16 v0, p14

    invoke-virtual {v5, v0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v24

    if-eqz v24, :cond_21

    move/from16 v17, v18

    :cond_21
    or-int v17, v23, v17

    goto :goto_18

    :cond_22
    move-object/from16 v0, p14

    move/from16 v17, v23

    :goto_18
    and-int v18, v3, v19

    move-object/from16 v0, p15

    if-nez v18, :cond_24

    invoke-virtual {v5, v0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v18

    if-eqz v18, :cond_23

    move/from16 v21, v22

    :cond_23
    or-int v17, v17, v21

    :cond_24
    const v18, 0x12492493

    and-int v0, p16, v18

    const v3, 0x12492492

    const/16 v18, 0x0

    const/16 v19, 0x1

    if-ne v0, v3, :cond_26

    const v0, 0x12493

    and-int v0, v17, v0

    const v3, 0x12492

    if-eq v0, v3, :cond_25

    goto :goto_19

    :cond_25
    move/from16 v0, v18

    goto :goto_1a

    :cond_26
    :goto_19
    move/from16 v0, v19

    :goto_1a
    and-int/lit8 v3, p16, 0x1

    invoke-virtual {v5, v3, v0}, Lp1/q;->U(IZ)Z

    move-result v0

    if-eqz v0, :cond_3e

    invoke-virtual {v5}, Lp1/q;->Z()V

    and-int/lit8 v0, p17, 0x1

    sget-object v3, Lp1/l;->a:Lp1/v0;

    const v21, -0x70000001

    if-eqz v0, :cond_29

    invoke-virtual {v5}, Lp1/q;->C()Z

    move-result v0

    if-eqz v0, :cond_27

    goto :goto_1b

    :cond_27
    invoke-virtual {v5}, Lp1/q;->X()V

    and-int/lit16 v0, v4, 0x200

    if-eqz v0, :cond_28

    and-int v6, p16, v21

    move-object/from16 v13, p12

    move-object/from16 v14, p13

    move-object/from16 v15, p14

    move v4, v8

    move/from16 v22, v9

    move v0, v12

    move-object/from16 v12, p11

    move v8, v6

    move/from16 v6, p10

    goto/16 :goto_23

    :cond_28
    move/from16 v6, p10

    move-object/from16 v13, p12

    move-object/from16 v14, p13

    move-object/from16 v15, p14

    move v4, v8

    move/from16 v22, v9

    move v0, v12

    move-object/from16 v12, p11

    move/from16 v8, p16

    goto/16 :goto_23

    :cond_29
    :goto_1b
    if-eqz v16, :cond_2a

    move/from16 v9, v18

    :cond_2a
    if-eqz v15, :cond_2b

    move/from16 v12, v18

    :cond_2b
    and-int/lit16 v0, v4, 0x200

    if-eqz v0, :cond_2d

    if-eqz v12, :cond_2c

    move/from16 v0, v19

    goto :goto_1c

    :cond_2c
    const v0, 0x7fffffff

    :goto_1c
    and-int v8, p16, v21

    goto :goto_1d

    :cond_2d
    move v0, v8

    move/from16 v8, p16

    :goto_1d
    if-eqz v27, :cond_2e

    move/from16 v15, v19

    goto :goto_1e

    :cond_2e
    move/from16 v15, p10

    :goto_1e
    if-eqz v29, :cond_2f

    sget-object v16, Lq3/f0;->w:Lg40/h2;

    :goto_1f
    move/from16 p4, v0

    goto :goto_20

    :cond_2f
    move-object/from16 v16, p11

    goto :goto_1f

    :goto_20
    invoke-virtual {v5}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v3, :cond_30

    new-instance v0, Lt71/i;

    const/16 v4, 0x1c

    invoke-direct {v0, v4}, Lt71/i;-><init>(I)V

    invoke-virtual {v5, v0}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_30
    check-cast v0, Lkotlin/jvm/functions/Function1;

    if-eqz v20, :cond_31

    const/4 v4, 0x0

    goto :goto_21

    :cond_31
    move-object/from16 v4, p13

    :goto_21
    if-eqz v6, :cond_32

    new-instance v6, Li2/c1;

    move/from16 p8, v8

    move/from16 p12, v9

    sget-wide v8, Li2/x;->b:J

    invoke-direct {v6, v8, v9}, Li2/c1;-><init>(J)V

    goto :goto_22

    :cond_32
    move/from16 p8, v8

    move/from16 p12, v9

    move-object/from16 v6, p14

    :goto_22
    move v8, v15

    move-object v15, v6

    move v6, v8

    move/from16 v8, p8

    move/from16 v22, p12

    move-object v13, v0

    move-object v14, v4

    move v0, v12

    move-object/from16 v12, v16

    move/from16 v4, p4

    :goto_23
    invoke-virtual {v5}, Lp1/q;->r()V

    invoke-virtual {v5}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v9

    const/4 v10, 0x6

    if-ne v9, v3, :cond_33

    new-instance v9, Lq3/y;

    move-object/from16 p4, v12

    const-wide/16 v11, 0x0

    invoke-direct {v9, v10, v1, v11, v12}, Lq3/y;-><init>(ILjava/lang/String;J)V

    invoke-static {v9}, Lp1/x;->z(Ljava/lang/Object;)Lp1/k1;

    move-result-object v9

    invoke-virtual {v5, v9}, Lp1/q;->p0(Ljava/lang/Object;)V

    goto :goto_24

    :cond_33
    move-object/from16 p4, v12

    const-wide/16 v11, 0x0

    :goto_24
    check-cast v9, Lp1/c1;

    invoke-interface {v9}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object v16

    move/from16 p8, v4

    move-object/from16 v4, v16

    check-cast v4, Lq3/y;

    invoke-static {v4, v1, v11, v12, v10}, Lq3/y;->a(Lq3/y;Ljava/lang/String;JI)Lq3/y;

    move-result-object v4

    invoke-virtual {v5, v4}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v10

    invoke-virtual {v5}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v11

    if-nez v10, :cond_34

    if-ne v11, v3, :cond_35

    :cond_34
    new-instance v11, Ls51/f;

    const/16 v10, 0x14

    invoke-direct {v11, v10, v4, v9}, Ls51/f;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v5, v11}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_35
    check-cast v11, Lc93/a;

    invoke-static {v11, v5}, Lp1/x;->k(Lc93/a;Landroidx/compose/runtime/Composer;)V

    and-int/lit8 v10, v8, 0xe

    const/4 v11, 0x4

    if-ne v10, v11, :cond_36

    move/from16 v10, v19

    goto :goto_25

    :cond_36
    move/from16 v10, v18

    :goto_25
    invoke-virtual {v5}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v11

    if-nez v10, :cond_37

    if-ne v11, v3, :cond_38

    :cond_37
    invoke-static {v1}, Lp1/x;->z(Ljava/lang/Object;)Lp1/k1;

    move-result-object v11

    invoke-virtual {v5, v11}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_38
    check-cast v11, Lp1/c1;

    move/from16 v10, v19

    invoke-virtual {v7, v0}, Lu0/r0;->a(Z)Lq3/l;

    move-result-object v19

    xor-int/lit8 v16, v0, 0x1

    move/from16 v12, v18

    if-eqz v0, :cond_39

    move/from16 v18, v10

    goto :goto_26

    :cond_39
    move/from16 v18, v6

    :goto_26
    move/from16 v20, v17

    if-eqz v0, :cond_3a

    move/from16 v17, v10

    goto :goto_27

    :cond_3a
    move/from16 v17, p8

    :goto_27
    invoke-virtual {v5, v11}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v21

    and-int/lit8 v10, v8, 0x70

    const/16 v12, 0x20

    if-ne v10, v12, :cond_3b

    const/4 v10, 0x1

    goto :goto_28

    :cond_3b
    const/4 v10, 0x0

    :goto_28
    or-int v10, v21, v10

    invoke-virtual {v5}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v12

    if-nez v10, :cond_3c

    if-ne v12, v3, :cond_3d

    :cond_3c
    new-instance v12, Lb90/e;

    const/4 v3, 0x4

    invoke-direct {v12, v3, v2, v9, v11}, Lb90/e;-><init>(ILkotlin/jvm/functions/Function1;Lp1/c1;Lp1/c1;)V

    invoke-virtual {v5, v12}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_3d
    move-object v9, v12

    check-cast v9, Lkotlin/jvm/functions/Function1;

    and-int/lit16 v3, v8, 0x380

    shr-int/lit8 v10, v8, 0x6

    and-int/lit16 v10, v10, 0x1c00

    or-int/2addr v3, v10

    shl-int/lit8 v10, v20, 0x9

    const v11, 0xe000

    and-int v12, v10, v11

    or-int/2addr v3, v12

    const/high16 v12, 0x70000

    and-int v21, v10, v12

    or-int v3, v3, v21

    const/high16 v21, 0x380000

    and-int v21, v10, v21

    or-int v3, v3, v21

    const/high16 v21, 0x1c00000

    and-int v10, v10, v21

    or-int v25, v3, v10

    shr-int/lit8 v3, v8, 0xf

    and-int/lit16 v3, v3, 0x380

    and-int/lit16 v10, v8, 0x1c00

    or-int/2addr v3, v10

    and-int/2addr v8, v11

    or-int/2addr v3, v8

    and-int v8, v20, v12

    or-int v26, v3, v8

    move-object/from16 v10, p2

    move/from16 v21, p3

    move-object/from16 v12, p4

    move-object/from16 v11, p5

    move-object/from16 v20, p7

    move-object/from16 v23, p15

    move-object v8, v4

    move-object/from16 v24, v5

    invoke-static/range {v8 .. v26}, Lu0/n0;->d(Lq3/y;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Ll3/v0;Lq3/g0;Lkotlin/jvm/functions/Function1;Lj0/i;Li2/t;ZIILq3/l;Lu0/q0;ZZLkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V

    move/from16 v10, p8

    move v9, v0

    move v11, v6

    move/from16 v5, v22

    goto :goto_29

    :cond_3e
    move-object/from16 v24, v5

    invoke-virtual/range {v24 .. v24}, Lp1/q;->X()V

    move/from16 v11, p10

    move-object/from16 v13, p12

    move-object/from16 v14, p13

    move-object/from16 v15, p14

    move v10, v8

    move v5, v9

    move v9, v12

    move-object/from16 v12, p11

    :goto_29
    invoke-virtual/range {v24 .. v24}, Lp1/q;->u()Lp1/v1;

    move-result-object v0

    if-eqz v0, :cond_3f

    move-object v3, v0

    new-instance v0, Lu0/h;

    const/16 v20, 0x1

    move/from16 v4, p3

    move-object/from16 v6, p5

    move-object/from16 v8, p7

    move-object/from16 v16, p15

    move/from16 v17, p17

    move/from16 v18, p18

    move/from16 v19, p19

    move-object/from16 v31, v3

    move-object/from16 v3, p2

    invoke-direct/range {v0 .. v20}, Lu0/h;-><init>(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZZLl3/v0;Lu0/r0;Lu0/q0;ZIILq3/g0;Lkotlin/jvm/functions/Function1;Lj0/i;Li2/t;Lkotlin/jvm/functions/Function3;IIII)V

    move-object/from16 v3, v31

    iput-object v0, v3, Lp1/v1;->d:Lc93/m;

    :cond_3f
    return-void
.end method

.method public static final b(Lq3/y;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZZLl3/v0;Lu0/r0;Lu0/q0;ZIILq3/g0;Lkotlin/jvm/functions/Function1;Lj0/i;Li2/c1;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;III)V
    .locals 32

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v2, p6

    move/from16 v3, p8

    move/from16 v4, p17

    move/from16 v5, p18

    move/from16 v6, p19

    move-object/from16 v7, p16

    check-cast v7, Lp1/q;

    const v8, -0x39e1fa71

    invoke-virtual {v7, v8}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v8, v4, 0x6

    if-nez v8, :cond_1

    invoke-virtual {v7, v0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_0

    const/4 v8, 0x4

    goto :goto_0

    :cond_0
    const/4 v8, 0x2

    :goto_0
    or-int/2addr v8, v4

    goto :goto_1

    :cond_1
    move v8, v4

    :goto_1
    and-int/lit8 v11, v4, 0x30

    if-nez v11, :cond_3

    invoke-virtual {v7, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_2

    const/16 v11, 0x20

    goto :goto_2

    :cond_2
    const/16 v11, 0x10

    :goto_2
    or-int/2addr v8, v11

    :cond_3
    and-int/lit16 v11, v4, 0x180

    if-nez v11, :cond_5

    move-object/from16 v11, p2

    invoke-virtual {v7, v11}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v14

    if-eqz v14, :cond_4

    const/16 v14, 0x100

    goto :goto_3

    :cond_4
    const/16 v14, 0x80

    :goto_3
    or-int/2addr v8, v14

    goto :goto_4

    :cond_5
    move-object/from16 v11, p2

    :goto_4
    and-int/lit16 v14, v4, 0xc00

    const/16 v16, 0x800

    if-nez v14, :cond_7

    move/from16 v14, p3

    invoke-virtual {v7, v14}, Lp1/q;->h(Z)Z

    move-result v17

    if-eqz v17, :cond_6

    move/from16 v17, v16

    goto :goto_5

    :cond_6
    const/16 v17, 0x400

    :goto_5
    or-int v8, v8, v17

    goto :goto_6

    :cond_7
    move/from16 v14, p3

    :goto_6
    and-int/lit8 v17, v6, 0x10

    const/16 v18, 0x2000

    const/16 v19, 0x4000

    if-eqz v17, :cond_9

    or-int/lit16 v8, v8, 0x6000

    :cond_8
    move/from16 v9, p4

    goto :goto_8

    :cond_9
    and-int/lit16 v9, v4, 0x6000

    if-nez v9, :cond_8

    move/from16 v9, p4

    invoke-virtual {v7, v9}, Lp1/q;->h(Z)Z

    move-result v20

    if-eqz v20, :cond_a

    move/from16 v20, v19

    goto :goto_7

    :cond_a
    move/from16 v20, v18

    :goto_7
    or-int v8, v8, v20

    :goto_8
    const/high16 v20, 0x30000

    and-int v21, v4, v20

    const/high16 v22, 0x10000

    const/high16 v23, 0x20000

    move-object/from16 v12, p5

    if-nez v21, :cond_c

    invoke-virtual {v7, v12}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v24

    if-eqz v24, :cond_b

    move/from16 v24, v23

    goto :goto_9

    :cond_b
    move/from16 v24, v22

    :goto_9
    or-int v8, v8, v24

    :cond_c
    const/high16 v24, 0x180000

    and-int v24, v4, v24

    if-nez v24, :cond_e

    invoke-virtual {v7, v2}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v24

    if-eqz v24, :cond_d

    const/high16 v24, 0x100000

    goto :goto_a

    :cond_d
    const/high16 v24, 0x80000

    :goto_a
    or-int v8, v8, v24

    :cond_e
    and-int/lit16 v15, v6, 0x80

    const/high16 v25, 0xc00000

    if-eqz v15, :cond_f

    or-int v8, v8, v25

    move-object/from16 v13, p7

    goto :goto_c

    :cond_f
    and-int v25, v4, v25

    move-object/from16 v13, p7

    if-nez v25, :cond_11

    invoke-virtual {v7, v13}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v26

    if-eqz v26, :cond_10

    const/high16 v26, 0x800000

    goto :goto_b

    :cond_10
    const/high16 v26, 0x400000

    :goto_b
    or-int v8, v8, v26

    :cond_11
    :goto_c
    const/high16 v26, 0x6000000

    and-int v26, v4, v26

    if-nez v26, :cond_13

    invoke-virtual {v7, v3}, Lp1/q;->h(Z)Z

    move-result v26

    if-eqz v26, :cond_12

    const/high16 v26, 0x4000000

    goto :goto_d

    :cond_12
    const/high16 v26, 0x2000000

    :goto_d
    or-int v8, v8, v26

    :cond_13
    const/high16 v26, 0x30000000

    and-int v26, v4, v26

    if-nez v26, :cond_16

    and-int/lit16 v10, v6, 0x200

    if-nez v10, :cond_14

    move/from16 v10, p9

    invoke-virtual {v7, v10}, Lp1/q;->e(I)Z

    move-result v27

    if-eqz v27, :cond_15

    const/high16 v27, 0x20000000

    goto :goto_e

    :cond_14
    move/from16 v10, p9

    :cond_15
    const/high16 v27, 0x10000000

    :goto_e
    or-int v8, v8, v27

    goto :goto_f

    :cond_16
    move/from16 v10, p9

    :goto_f
    and-int/lit16 v4, v6, 0x400

    if-eqz v4, :cond_17

    or-int/lit8 v27, v5, 0x6

    move/from16 v28, v27

    move/from16 v27, v4

    move/from16 v4, p10

    goto :goto_11

    :cond_17
    and-int/lit8 v27, v5, 0x6

    if-nez v27, :cond_19

    move/from16 v27, v4

    move/from16 v4, p10

    invoke-virtual {v7, v4}, Lp1/q;->e(I)Z

    move-result v28

    if-eqz v28, :cond_18

    const/16 v28, 0x4

    goto :goto_10

    :cond_18
    const/16 v28, 0x2

    :goto_10
    or-int v28, v5, v28

    goto :goto_11

    :cond_19
    move/from16 v27, v4

    move/from16 v4, p10

    move/from16 v28, v5

    :goto_11
    and-int/lit16 v4, v6, 0x800

    if-eqz v4, :cond_1a

    or-int/lit8 v28, v28, 0x30

    move/from16 v29, v4

    :goto_12
    move/from16 v4, v28

    goto :goto_14

    :cond_1a
    and-int/lit8 v29, v5, 0x30

    if-nez v29, :cond_1c

    move/from16 v29, v4

    move-object/from16 v4, p11

    invoke-virtual {v7, v4}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v30

    if-eqz v30, :cond_1b

    const/16 v21, 0x20

    goto :goto_13

    :cond_1b
    const/16 v21, 0x10

    :goto_13
    or-int v28, v28, v21

    goto :goto_12

    :cond_1c
    move/from16 v29, v4

    move-object/from16 v4, p11

    goto :goto_12

    :goto_14
    move/from16 p16, v8

    or-int/lit16 v8, v4, 0x180

    move/from16 v21, v8

    and-int/lit16 v8, v6, 0x2000

    if-eqz v8, :cond_1d

    or-int/lit16 v4, v4, 0xd80

    move/from16 v16, v4

    move-object/from16 v4, p13

    goto :goto_16

    :cond_1d
    and-int/lit16 v4, v5, 0xc00

    if-nez v4, :cond_1f

    move-object/from16 v4, p13

    invoke-virtual {v7, v4}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v28

    if-eqz v28, :cond_1e

    goto :goto_15

    :cond_1e
    const/16 v16, 0x400

    :goto_15
    or-int v16, v21, v16

    goto :goto_16

    :cond_1f
    move-object/from16 v4, p13

    move/from16 v16, v21

    :goto_16
    and-int/lit16 v4, v5, 0x6000

    if-nez v4, :cond_21

    move-object/from16 v4, p14

    invoke-virtual {v7, v4}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v21

    if-eqz v21, :cond_20

    move/from16 v18, v19

    :cond_20
    or-int v16, v16, v18

    goto :goto_17

    :cond_21
    move-object/from16 v4, p14

    :goto_17
    const v18, 0x8000

    and-int v18, v6, v18

    if-eqz v18, :cond_22

    or-int v16, v16, v20

    move-object/from16 v4, p15

    goto :goto_18

    :cond_22
    and-int v19, v5, v20

    move-object/from16 v4, p15

    if-nez v19, :cond_24

    invoke-virtual {v7, v4}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v19

    if-eqz v19, :cond_23

    move/from16 v22, v23

    :cond_23
    or-int v16, v16, v22

    :cond_24
    :goto_18
    const v19, 0x12492493

    and-int v4, p16, v19

    const v5, 0x12492492

    const/16 v19, 0x0

    const/16 v20, 0x1

    if-ne v4, v5, :cond_26

    const v4, 0x12493

    and-int v4, v16, v4

    const v5, 0x12492

    if-eq v4, v5, :cond_25

    goto :goto_19

    :cond_25
    move/from16 v4, v19

    goto :goto_1a

    :cond_26
    :goto_19
    move/from16 v4, v20

    :goto_1a
    and-int/lit8 v5, p16, 0x1

    invoke-virtual {v7, v5, v4}, Lp1/q;->U(IZ)Z

    move-result v4

    if-eqz v4, :cond_39

    invoke-virtual {v7}, Lp1/q;->Z()V

    and-int/lit8 v4, p17, 0x1

    sget-object v5, Lp1/l;->a:Lp1/v0;

    const v21, -0x70000001

    if-eqz v4, :cond_29

    invoke-virtual {v7}, Lp1/q;->C()Z

    move-result v4

    if-eqz v4, :cond_27

    goto :goto_1b

    :cond_27
    invoke-virtual {v7}, Lp1/q;->X()V

    and-int/lit16 v4, v6, 0x200

    if-eqz v4, :cond_28

    and-int v8, p16, v21

    move/from16 v22, p10

    move-object/from16 v4, p11

    move-object/from16 v6, p12

    move-object/from16 v15, p15

    move/from16 v21, v10

    move-object v12, v13

    move v10, v8

    move-object/from16 v8, p13

    goto/16 :goto_23

    :cond_28
    move/from16 v22, p10

    move-object/from16 v4, p11

    move-object/from16 v6, p12

    move-object/from16 v8, p13

    move-object/from16 v15, p15

    move/from16 v21, v10

    move-object v12, v13

    move/from16 v10, p16

    goto/16 :goto_23

    :cond_29
    :goto_1b
    if-eqz v17, :cond_2a

    move/from16 v9, v19

    :cond_2a
    if-eqz v15, :cond_2b

    sget-object v4, Lu0/q0;->g:Lu0/q0;

    move-object v13, v4

    :cond_2b
    and-int/lit16 v4, v6, 0x200

    if-eqz v4, :cond_2d

    if-eqz v3, :cond_2c

    move/from16 v4, v20

    goto :goto_1c

    :cond_2c
    const v4, 0x7fffffff

    :goto_1c
    and-int v10, p16, v21

    goto :goto_1d

    :cond_2d
    move v4, v10

    move/from16 v10, p16

    :goto_1d
    if-eqz v27, :cond_2e

    move/from16 v15, v20

    goto :goto_1e

    :cond_2e
    move/from16 v15, p10

    :goto_1e
    if-eqz v29, :cond_2f

    sget-object v17, Lq3/f0;->w:Lg40/h2;

    :goto_1f
    move/from16 p4, v4

    goto :goto_20

    :cond_2f
    move-object/from16 v17, p11

    goto :goto_1f

    :goto_20
    invoke-virtual {v7}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    if-ne v4, v5, :cond_30

    new-instance v4, Lt71/i;

    const/16 v6, 0x1c

    invoke-direct {v4, v6}, Lt71/i;-><init>(I)V

    invoke-virtual {v7, v4}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_30
    check-cast v4, Lkotlin/jvm/functions/Function1;

    if-eqz v8, :cond_31

    const/4 v6, 0x0

    goto :goto_21

    :cond_31
    move-object/from16 v6, p13

    :goto_21
    if-eqz v18, :cond_32

    sget-object v8, Lu0/s;->a:Lx1/b;

    move/from16 v21, p4

    move-object v12, v13

    move/from16 v22, v15

    move-object v15, v8

    move-object v8, v6

    :goto_22
    move-object v6, v4

    move-object/from16 v4, v17

    goto :goto_23

    :cond_32
    move/from16 v21, p4

    move-object v8, v6

    move-object v12, v13

    move/from16 v22, v15

    move-object/from16 v15, p15

    goto :goto_22

    :goto_23
    invoke-virtual {v7}, Lp1/q;->r()V

    invoke-virtual {v2, v3}, Lu0/r0;->a(Z)Lq3/l;

    move-result-object v11

    move-object v13, v6

    move-object v6, v8

    xor-int/lit8 v8, v3, 0x1

    if-eqz v3, :cond_33

    move/from16 v17, v20

    goto :goto_24

    :cond_33
    move/from16 v17, v22

    :goto_24
    move v14, v9

    if-eqz v3, :cond_34

    move/from16 v9, v20

    goto :goto_25

    :cond_34
    move/from16 v9, v21

    :goto_25
    and-int/lit8 v2, v10, 0xe

    const/4 v3, 0x4

    if-ne v2, v3, :cond_35

    move/from16 v2, v20

    goto :goto_26

    :cond_35
    move/from16 v2, v19

    :goto_26
    and-int/lit8 v3, v10, 0x70

    move/from16 p4, v2

    const/16 v2, 0x20

    if-ne v3, v2, :cond_36

    move/from16 v19, v20

    :cond_36
    or-int v2, p4, v19

    invoke-virtual {v7}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    if-nez v2, :cond_37

    if-ne v3, v5, :cond_38

    :cond_37
    new-instance v3, Lsg2/t;

    const/16 v2, 0x12

    invoke-direct {v3, v2, v0, v1}, Lsg2/t;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v7, v3}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_38
    check-cast v3, Lkotlin/jvm/functions/Function1;

    and-int/lit16 v2, v10, 0x38e

    shr-int/lit8 v5, v10, 0x6

    and-int/lit16 v5, v5, 0x1c00

    or-int/2addr v2, v5

    shl-int/lit8 v5, v16, 0x9

    const v18, 0xe000

    and-int v19, v5, v18

    or-int v2, v2, v19

    const/high16 v19, 0x70000

    and-int v20, v5, v19

    or-int v2, v2, v20

    const/high16 v20, 0x380000

    and-int v20, v5, v20

    or-int v2, v2, v20

    const/high16 v20, 0x1c00000

    and-int v5, v5, v20

    or-int/2addr v2, v5

    shr-int/lit8 v5, v10, 0xf

    and-int/lit16 v5, v5, 0x380

    and-int/lit16 v0, v10, 0x1c00

    or-int/2addr v0, v5

    and-int v5, v10, v18

    or-int/2addr v0, v5

    and-int v5, v16, v19

    or-int v18, v0, v5

    move-object/from16 v0, p0

    move-object v1, v3

    move-object/from16 v16, v7

    move-object v5, v13

    move/from16 v10, v17

    move/from16 v13, p3

    move-object/from16 v3, p5

    move-object/from16 v7, p14

    move/from16 v17, v2

    move-object/from16 v2, p2

    invoke-static/range {v0 .. v18}, Lu0/n0;->d(Lq3/y;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Ll3/v0;Lq3/g0;Lkotlin/jvm/functions/Function1;Lj0/i;Li2/t;ZIILq3/l;Lu0/q0;ZZLkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V

    move-object v13, v5

    move-object v8, v12

    move v5, v14

    move-object/from16 v0, v16

    move/from16 v10, v21

    move/from16 v11, v22

    move-object v12, v4

    move-object v14, v6

    move-object/from16 v16, v15

    goto :goto_27

    :cond_39
    move-object/from16 v16, v7

    invoke-virtual/range {v16 .. v16}, Lp1/q;->X()V

    move/from16 v11, p10

    move-object/from16 v12, p11

    move-object/from16 v14, p13

    move v5, v9

    move-object v8, v13

    move-object/from16 v0, v16

    move-object/from16 v13, p12

    move-object/from16 v16, p15

    :goto_27
    invoke-virtual {v0}, Lp1/q;->u()Lp1/v1;

    move-result-object v0

    if-eqz v0, :cond_3a

    move-object v1, v0

    new-instance v0, Lu0/h;

    const/16 v20, 0x0

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move/from16 v4, p3

    move-object/from16 v6, p5

    move-object/from16 v7, p6

    move/from16 v9, p8

    move-object/from16 v15, p14

    move/from16 v17, p17

    move/from16 v18, p18

    move/from16 v19, p19

    move-object/from16 v31, v1

    move-object/from16 v1, p0

    invoke-direct/range {v0 .. v20}, Lu0/h;-><init>(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZZLl3/v0;Lu0/r0;Lu0/q0;ZIILq3/g0;Lkotlin/jvm/functions/Function1;Lj0/i;Li2/t;Lkotlin/jvm/functions/Function3;IIII)V

    move-object/from16 v1, v31

    iput-object v0, v1, Lp1/v1;->d:Lc93/m;

    :cond_3a
    return-void
.end method
