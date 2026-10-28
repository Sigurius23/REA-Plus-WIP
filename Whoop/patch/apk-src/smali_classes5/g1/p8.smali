.class public abstract Lg1/p8;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:F

.field public static final b:F


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0x10

    int-to-float v0, v0

    sput v0, Lg1/p8;->a:F

    const/16 v0, 0xc

    int-to-float v0, v0

    sput v0, Lg1/p8;->b:F

    return-void
.end method

.method public static final a(Lg1/b9;Ljava/lang/String;Lc93/m;Lq3/g0;Lc93/m;Lc93/m;Lc93/m;Lc93/m;ZZZLj0/i;Ll0/k1;Li2/a1;Lg1/e8;Lc93/m;Landroidx/compose/runtime/Composer;II)V
    .locals 31

    move-object/from16 v2, p1

    move-object/from16 v4, p3

    move-object/from16 v5, p4

    move-object/from16 v12, p11

    move/from16 v0, p17

    move/from16 v1, p18

    const/4 v3, 0x0

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v13

    move-object/from16 v14, p16

    check-cast v14, Lp1/q;

    const v6, 0x18f3769a

    invoke-virtual {v14, v6}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v6, v0, 0x6

    if-nez v6, :cond_1

    invoke-virtual/range {p0 .. p0}, Ljava/lang/Enum;->ordinal()I

    move-result v6

    invoke-virtual {v14, v6}, Lp1/q;->e(I)Z

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
    and-int/lit8 v9, v0, 0x30

    if-nez v9, :cond_3

    invoke-virtual {v14, v2}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_2

    const/16 v9, 0x20

    goto :goto_2

    :cond_2
    const/16 v9, 0x10

    :goto_2
    or-int/2addr v6, v9

    :cond_3
    and-int/lit16 v9, v0, 0x180

    const/16 v16, 0x100

    if-nez v9, :cond_5

    move-object/from16 v9, p2

    invoke-virtual {v14, v9}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v17

    if-eqz v17, :cond_4

    move/from16 v17, v16

    goto :goto_3

    :cond_4
    const/16 v17, 0x80

    :goto_3
    or-int v6, v6, v17

    goto :goto_4

    :cond_5
    move-object/from16 v9, p2

    :goto_4
    and-int/lit16 v7, v0, 0xc00

    const/16 v17, 0x400

    if-nez v7, :cond_7

    invoke-virtual {v14, v4}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_6

    const/16 v7, 0x800

    goto :goto_5

    :cond_6
    move/from16 v7, v17

    :goto_5
    or-int/2addr v6, v7

    :cond_7
    and-int/lit16 v7, v0, 0x6000

    const/16 v19, 0x2000

    const/16 v20, 0x4000

    if-nez v7, :cond_9

    invoke-virtual {v14, v5}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_8

    move/from16 v7, v20

    goto :goto_6

    :cond_8
    move/from16 v7, v19

    :goto_6
    or-int/2addr v6, v7

    :cond_9
    const/high16 v7, 0x30000

    and-int v21, v0, v7

    const/high16 v22, 0x10000

    const/high16 v23, 0x20000

    move-object/from16 v15, p5

    if-nez v21, :cond_b

    invoke-virtual {v14, v15}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v24

    if-eqz v24, :cond_a

    move/from16 v24, v23

    goto :goto_7

    :cond_a
    move/from16 v24, v22

    :goto_7
    or-int v6, v6, v24

    :cond_b
    const/high16 v24, 0x180000

    and-int v24, v0, v24

    move-object/from16 v3, p6

    if-nez v24, :cond_d

    invoke-virtual {v14, v3}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v25

    if-eqz v25, :cond_c

    const/high16 v25, 0x100000

    goto :goto_8

    :cond_c
    const/high16 v25, 0x80000

    :goto_8
    or-int v6, v6, v25

    :cond_d
    const/high16 v25, 0xc00000

    and-int v25, v0, v25

    move-object/from16 v8, p7

    if-nez v25, :cond_f

    invoke-virtual {v14, v8}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v26

    if-eqz v26, :cond_e

    const/high16 v26, 0x800000

    goto :goto_9

    :cond_e
    const/high16 v26, 0x400000

    :goto_9
    or-int v6, v6, v26

    :cond_f
    const/high16 v26, 0x6000000

    and-int v26, v0, v26

    move/from16 v11, p8

    if-nez v26, :cond_11

    invoke-virtual {v14, v11}, Lp1/q;->h(Z)Z

    move-result v27

    if-eqz v27, :cond_10

    const/high16 v27, 0x4000000

    goto :goto_a

    :cond_10
    const/high16 v27, 0x2000000

    :goto_a
    or-int v6, v6, v27

    :cond_11
    const/high16 v27, 0x30000000

    and-int v27, v0, v27

    if-nez v27, :cond_13

    move/from16 v27, v7

    move/from16 v7, p9

    invoke-virtual {v14, v7}, Lp1/q;->h(Z)Z

    move-result v28

    if-eqz v28, :cond_12

    const/high16 v28, 0x20000000

    goto :goto_b

    :cond_12
    const/high16 v28, 0x10000000

    :goto_b
    or-int v6, v6, v28

    goto :goto_c

    :cond_13
    move/from16 v27, v7

    move/from16 v7, p9

    :goto_c
    and-int/lit8 v28, v1, 0x6

    move/from16 v10, p10

    if-nez v28, :cond_15

    invoke-virtual {v14, v10}, Lp1/q;->h(Z)Z

    move-result v29

    if-eqz v29, :cond_14

    const/16 v18, 0x4

    goto :goto_d

    :cond_14
    const/16 v18, 0x2

    :goto_d
    or-int v18, v1, v18

    goto :goto_e

    :cond_15
    move/from16 v18, v1

    :goto_e
    and-int/lit8 v29, v1, 0x30

    if-nez v29, :cond_17

    invoke-virtual {v14, v12}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v29

    if-eqz v29, :cond_16

    const/16 v28, 0x20

    goto :goto_f

    :cond_16
    const/16 v28, 0x10

    :goto_f
    or-int v18, v18, v28

    :cond_17
    and-int/lit16 v0, v1, 0x180

    if-nez v0, :cond_19

    move-object/from16 v0, p12

    invoke-virtual {v14, v0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v28

    if-eqz v28, :cond_18

    goto :goto_10

    :cond_18
    const/16 v16, 0x80

    :goto_10
    or-int v18, v18, v16

    goto :goto_11

    :cond_19
    move-object/from16 v0, p12

    :goto_11
    and-int/lit16 v0, v1, 0xc00

    if-nez v0, :cond_1b

    move-object/from16 v0, p13

    invoke-virtual {v14, v0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v16

    if-eqz v16, :cond_1a

    const/16 v17, 0x800

    :cond_1a
    or-int v18, v18, v17

    goto :goto_12

    :cond_1b
    move-object/from16 v0, p13

    :goto_12
    and-int/lit16 v0, v1, 0x6000

    if-nez v0, :cond_1d

    move-object/from16 v0, p14

    invoke-virtual {v14, v0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v16

    if-eqz v16, :cond_1c

    move/from16 v19, v20

    :cond_1c
    or-int v18, v18, v19

    goto :goto_13

    :cond_1d
    move-object/from16 v0, p14

    :goto_13
    and-int v16, v1, v27

    move-object/from16 v11, p15

    if-nez v16, :cond_1f

    invoke-virtual {v14, v11}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v16

    if-eqz v16, :cond_1e

    move/from16 v22, v23

    :cond_1e
    or-int v18, v18, v22

    :cond_1f
    const v16, 0x12492493

    and-int v0, v6, v16

    const v1, 0x12492492

    const/16 v16, 0x1

    if-ne v0, v1, :cond_21

    const v0, 0x12493

    and-int v0, v18, v0

    const v1, 0x12492

    if-eq v0, v1, :cond_20

    goto :goto_14

    :cond_20
    const/4 v0, 0x0

    goto :goto_15

    :cond_21
    :goto_14
    move/from16 v0, v16

    :goto_15
    and-int/lit8 v1, v6, 0x1

    invoke-virtual {v14, v1, v0}, Lp1/q;->U(IZ)Z

    move-result v0

    if-eqz v0, :cond_30

    and-int/lit8 v0, v6, 0x70

    const/16 v1, 0x20

    if-ne v0, v1, :cond_22

    move/from16 v0, v16

    goto :goto_16

    :cond_22
    const/4 v0, 0x0

    :goto_16
    and-int/lit16 v1, v6, 0x1c00

    const/16 v6, 0x800

    if-ne v1, v6, :cond_23

    move/from16 v1, v16

    goto :goto_17

    :cond_23
    const/4 v1, 0x0

    :goto_17
    or-int/2addr v0, v1

    invoke-virtual {v14}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    if-nez v0, :cond_24

    sget-object v0, Lp1/l;->a:Lp1/v0;

    if-ne v1, v0, :cond_25

    :cond_24
    new-instance v0, Ll3/g;

    invoke-direct {v0, v2}, Ll3/g;-><init>(Ljava/lang/String;)V

    invoke-interface {v4, v0}, Lq3/g0;->a(Ll3/g;)Lq3/e0;

    move-result-object v1

    invoke-virtual {v14, v1}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_25
    check-cast v1, Lq3/e0;

    iget-object v0, v1, Lq3/e0;->a:Ll3/g;

    iget-object v0, v0, Ll3/g;->x:Ljava/lang/String;

    shr-int/lit8 v1, v18, 0x3

    and-int/lit8 v1, v1, 0xe

    invoke-static {v12, v14, v1}, Lse/h;->x(Lj0/i;Landroidx/compose/runtime/Composer;I)Lp1/c1;

    move-result-object v1

    invoke-interface {v1}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    if-eqz v1, :cond_26

    sget-object v1, Lg1/g3;->w:Lg1/g3;

    goto :goto_18

    :cond_26
    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v1

    if-nez v1, :cond_27

    sget-object v1, Lg1/g3;->x:Lg1/g3;

    goto :goto_18

    :cond_27
    sget-object v1, Lg1/g3;->y:Lg1/g3;

    :goto_18
    new-instance v20, Lg1/h8;

    const/4 v11, 0x1

    move v8, v7

    move v9, v10

    move-object v10, v12

    move-object/from16 v6, v20

    move-object/from16 v7, p14

    invoke-direct/range {v6 .. v11}, Lg1/h8;-><init>(Lg1/e8;ZZLj0/i;I)V

    sget-object v7, Lg1/i9;->b:Lp1/u2;

    invoke-virtual {v14, v7}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lg1/h9;

    iget-object v9, v8, Lg1/h9;->g:Ll3/v0;

    iget-object v8, v8, Lg1/h9;->l:Ll3/v0;

    invoke-virtual {v9}, Ll3/v0;->c()J

    move-result-wide v10

    sget-wide v2, Li2/x;->n:J

    invoke-static {v10, v11, v2, v3}, Li2/x;->d(JJ)Z

    move-result v10

    if-eqz v10, :cond_28

    invoke-virtual {v8}, Ll3/v0;->c()J

    move-result-wide v10

    invoke-static {v10, v11, v2, v3}, Li2/x;->d(JJ)Z

    move-result v10

    if-eqz v10, :cond_29

    :cond_28
    invoke-virtual {v9}, Ll3/v0;->c()J

    move-result-wide v9

    invoke-static {v9, v10, v2, v3}, Li2/x;->d(JJ)Z

    move-result v9

    if-nez v9, :cond_2a

    invoke-virtual {v8}, Ll3/v0;->c()J

    move-result-wide v8

    invoke-static {v8, v9, v2, v3}, Li2/x;->d(JJ)Z

    move-result v2

    if-eqz v2, :cond_2a

    :cond_29
    move/from16 v20, v16

    goto :goto_19

    :cond_2a
    const/16 v20, 0x0

    :goto_19
    const v2, -0x560ed133

    invoke-virtual {v14, v2}, Lp1/q;->e0(I)V

    invoke-virtual {v14, v7}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lg1/h9;

    iget-object v2, v2, Lg1/h9;->l:Ll3/v0;

    invoke-virtual {v2}, Ll3/v0;->c()J

    move-result-wide v2

    const-wide/16 v8, 0x10

    if-eqz v20, :cond_2c

    const v10, -0x34ecb6db    # -9652517.0f

    invoke-virtual {v14, v10}, Lp1/q;->e0(I)V

    cmp-long v10, v2, v8

    if-eqz v10, :cond_2b

    :goto_1a
    const/4 v10, 0x0

    goto :goto_1b

    :cond_2b
    invoke-virtual {v6, v1, v14, v13}, Lg1/h8;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Li2/x;

    iget-wide v2, v2, Li2/x;->a:J

    goto :goto_1a

    :goto_1b
    invoke-virtual {v14, v10}, Lp1/q;->q(Z)V

    goto :goto_1c

    :cond_2c
    const/4 v10, 0x0

    const v11, 0x489d8dbc    # 322669.88f

    invoke-virtual {v14, v11}, Lp1/q;->e0(I)V

    invoke-virtual {v14, v10}, Lp1/q;->q(Z)V

    :goto_1c
    invoke-virtual {v14, v10}, Lp1/q;->q(Z)V

    const v10, -0x560eb4d1

    invoke-virtual {v14, v10}, Lp1/q;->e0(I)V

    invoke-virtual {v14, v7}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lg1/h9;

    iget-object v7, v7, Lg1/h9;->g:Ll3/v0;

    invoke-virtual {v7}, Ll3/v0;->c()J

    move-result-wide v10

    if-eqz v20, :cond_2e

    const v7, -0x3d32695a

    invoke-virtual {v14, v7}, Lp1/q;->e0(I)V

    cmp-long v7, v10, v8

    if-eqz v7, :cond_2d

    :goto_1d
    const/4 v7, 0x0

    goto :goto_1e

    :cond_2d
    invoke-virtual {v6, v1, v14, v13}, Lg1/h8;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Li2/x;

    iget-wide v10, v7, Li2/x;->a:J

    goto :goto_1d

    :goto_1e
    invoke-virtual {v14, v7}, Lp1/q;->q(Z)V

    :goto_1f
    move-wide/from16 v22, v10

    goto :goto_20

    :cond_2e
    const/4 v7, 0x0

    const v8, 0x2f930c1b

    invoke-virtual {v14, v8}, Lp1/q;->e0(I)V

    invoke-virtual {v14, v7}, Lp1/q;->q(Z)V

    goto :goto_1f

    :goto_20
    invoke-virtual {v14, v7}, Lp1/q;->q(Z)V

    if-eqz v5, :cond_2f

    move/from16 v24, v16

    goto :goto_21

    :cond_2f
    move/from16 v24, v7

    :goto_21
    new-instance v5, Lg1/n8;

    move-object/from16 v16, p0

    move-object/from16 v17, p2

    move-object/from16 v13, p6

    move/from16 v18, p8

    move/from16 v10, p9

    move/from16 v11, p10

    move-object/from16 v12, p11

    move-object/from16 v19, p12

    move-object/from16 v9, p14

    move-object/from16 v21, p15

    move-object v8, v0

    move-object/from16 v25, v6

    move-object v0, v14

    move-object v7, v15

    move-object/from16 v6, p4

    move-object/from16 v14, p7

    move-object/from16 v15, p13

    invoke-direct/range {v5 .. v21}, Lg1/n8;-><init>(Lc93/m;Lc93/m;Ljava/lang/String;Lg1/e8;ZZLj0/i;Lc93/m;Lc93/m;Li2/a1;Lg1/b9;Lc93/m;ZLl0/k1;ZLc93/m;)V

    const v6, 0x1fcac37

    invoke-static {v6, v0, v5}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v5

    move/from16 v21, v24

    const/high16 v24, 0x1b0000

    sget-object v14, Lg1/a9;->a:Lg1/a9;

    move-object v15, v1

    move-wide/from16 v16, v2

    move-wide/from16 v18, v22

    move-object/from16 v20, v25

    move-object/from16 v23, v0

    move-object/from16 v22, v5

    invoke-virtual/range {v14 .. v24}, Lg1/a9;->a(Lg1/g3;JJLg1/h8;ZLx1/b;Landroidx/compose/runtime/Composer;I)V

    goto :goto_22

    :cond_30
    move-object v0, v14

    invoke-virtual {v0}, Lp1/q;->X()V

    :goto_22
    invoke-virtual {v0}, Lp1/q;->u()Lp1/v1;

    move-result-object v0

    if-eqz v0, :cond_31

    move-object v1, v0

    new-instance v0, Lg1/f8;

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move-object/from16 v5, p4

    move-object/from16 v6, p5

    move-object/from16 v7, p6

    move-object/from16 v8, p7

    move/from16 v9, p8

    move/from16 v10, p9

    move/from16 v11, p10

    move-object/from16 v12, p11

    move-object/from16 v13, p12

    move-object/from16 v14, p13

    move-object/from16 v15, p14

    move-object/from16 v16, p15

    move/from16 v17, p17

    move/from16 v18, p18

    move-object/from16 v30, v1

    move-object/from16 v1, p0

    invoke-direct/range {v0 .. v18}, Lg1/f8;-><init>(Lg1/b9;Ljava/lang/String;Lc93/m;Lq3/g0;Lc93/m;Lc93/m;Lc93/m;Lc93/m;ZZZLj0/i;Ll0/k1;Li2/a1;Lg1/e8;Lc93/m;II)V

    move-object/from16 v1, v30

    iput-object v0, v1, Lp1/v1;->d:Lc93/m;

    :cond_31
    return-void
.end method

.method public static final b(JLl3/v0;Lc93/m;Landroidx/compose/runtime/Composer;II)V
    .locals 13

    move/from16 v5, p5

    move-object/from16 v0, p4

    check-cast v0, Lp1/q;

    const v1, 0x7b0fcb51

    invoke-virtual {v0, v1}, Lp1/q;->g0(I)Lp1/q;

    invoke-virtual {v0, p0, p1}, Lp1/q;->f(J)Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, 0x4

    goto :goto_0

    :cond_0
    const/4 v1, 0x2

    :goto_0
    or-int/2addr v1, v5

    and-int/lit8 v2, p6, 0x2

    if-eqz v2, :cond_1

    or-int/lit8 v1, v1, 0x30

    goto :goto_2

    :cond_1
    invoke-virtual {v0, p2}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_2

    const/16 v3, 0x20

    goto :goto_1

    :cond_2
    const/16 v3, 0x10

    :goto_1
    or-int/2addr v1, v3

    :goto_2
    and-int/lit8 v3, p6, 0x4

    const/4 v9, 0x0

    if-eqz v3, :cond_4

    or-int/lit16 v1, v1, 0x180

    :cond_3
    :goto_3
    move-object/from16 v10, p3

    goto :goto_5

    :cond_4
    and-int/lit16 v3, v5, 0x180

    if-nez v3, :cond_3

    invoke-virtual {v0, v9}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_5

    const/16 v3, 0x100

    goto :goto_4

    :cond_5
    const/16 v3, 0x80

    :goto_4
    or-int/2addr v1, v3

    goto :goto_3

    :goto_5
    invoke-virtual {v0, v10}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_6

    const/16 v3, 0x800

    goto :goto_6

    :cond_6
    const/16 v3, 0x400

    :goto_6
    or-int/2addr v1, v3

    and-int/lit16 v3, v1, 0x493

    const/16 v4, 0x492

    const/4 v12, 0x0

    if-eq v3, v4, :cond_7

    const/4 v3, 0x1

    goto :goto_7

    :cond_7
    move v3, v12

    :goto_7
    and-int/lit8 v4, v1, 0x1

    invoke-virtual {v0, v4, v3}, Lp1/q;->U(IZ)Z

    move-result v3

    if-eqz v3, :cond_a

    if-eqz v2, :cond_8

    move-object p2, v9

    :cond_8
    new-instance v6, Lg1/o8;

    const/4 v11, 0x1

    move-wide v7, p0

    invoke-direct/range {v6 .. v11}, Lg1/o8;-><init>(JLjava/lang/Float;Lc93/m;I)V

    const v2, -0x26ca46a5

    invoke-static {v2, v0, v6}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v2

    if-eqz p2, :cond_9

    const v3, -0x9b555e1

    invoke-virtual {v0, v3}, Lp1/q;->e0(I)V

    shr-int/lit8 v1, v1, 0x3

    and-int/lit8 v1, v1, 0xe

    or-int/lit8 v1, v1, 0x30

    invoke-static {p2, v2, v0, v1}, Lg1/f9;->a(Ll3/v0;Lc93/m;Landroidx/compose/runtime/Composer;I)V

    :goto_8
    invoke-virtual {v0, v12}, Lp1/q;->q(Z)V

    goto :goto_9

    :cond_9
    const v1, -0x9b54f7d

    invoke-virtual {v0, v1}, Lp1/q;->e0(I)V

    const/4 v1, 0x6

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-virtual {v2, v0, v1}, Lx1/b;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_8

    :goto_9
    move-object v3, p2

    goto :goto_a

    :cond_a
    invoke-virtual {v0}, Lp1/q;->X()V

    goto :goto_9

    :goto_a
    invoke-virtual {v0}, Lp1/q;->u()Lp1/v1;

    move-result-object p2

    if-eqz p2, :cond_b

    new-instance v0, Lg1/j8;

    const/4 v7, 0x0

    move-wide v1, p0

    move-object/from16 v4, p3

    move/from16 v6, p6

    invoke-direct/range {v0 .. v7}, Lg1/j8;-><init>(JLl3/v0;Lc93/m;III)V

    iput-object v0, p2, Lp1/v1;->d:Lc93/m;

    :cond_b
    return-void
.end method

.method public static final c(Landroidx/compose/ui/Modifier;ZLjava/lang/String;)Landroidx/compose/ui/Modifier;
    .locals 1

    if-eqz p1, :cond_0

    new-instance p1, Lb30/y4;

    const/16 v0, 0x17

    invoke-direct {p1, p2, v0}, Lb30/y4;-><init>(Ljava/lang/String;I)V

    const/4 p2, 0x0

    invoke-static {p0, p2, p1}, Li3/n;->c(Landroidx/compose/ui/Modifier;ZLkotlin/jvm/functions/Function1;)Landroidx/compose/ui/Modifier;

    move-result-object p0

    :cond_0
    return-object p0
.end method

.method public static final d(Ly2/q0;)Ljava/lang/Object;
    .locals 2

    invoke-interface {p0}, Ly2/q0;->p()Ljava/lang/Object;

    move-result-object p0

    instance-of v0, p0, Ly2/a0;

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    check-cast p0, Ly2/a0;

    goto :goto_0

    :cond_0
    move-object p0, v1

    :goto_0
    if-eqz p0, :cond_1

    invoke-interface {p0}, Ly2/a0;->T()Ljava/lang/Object;

    move-result-object p0

    return-object p0

    :cond_1
    return-object v1
.end method
