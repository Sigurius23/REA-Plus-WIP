.class public abstract Lm1/l0;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:F

.field public static final b:F

.field public static final c:F

.field public static final d:F

.field public static final e:F

.field public static final f:F


# direct methods
.method static constructor <clinit>()V
    .locals 2

    const/16 v0, 0x10

    int-to-float v0, v0

    sput v0, Lm1/l0;->a:F

    const/4 v1, 0x4

    int-to-float v1, v1

    sput v1, Lm1/l0;->b:F

    const/4 v1, 0x2

    int-to-float v1, v1

    sput v1, Lm1/l0;->c:F

    const/16 v1, 0x18

    int-to-float v1, v1

    sput v1, Lm1/l0;->d:F

    sput v0, Lm1/l0;->e:F

    sput v0, Lm1/l0;->f:F

    return-void
.end method

.method public static final a(Lm1/m0;Ljava/lang/CharSequence;Lc93/m;Ll1/k4;Lkotlin/jvm/functions/Function3;Lc93/m;Lc93/m;ZZZLj0/i;Ll0/k1;Ll1/e4;Lc93/m;Landroidx/compose/runtime/Composer;II)V
    .locals 44

    move-object/from16 v8, p3

    move-object/from16 v5, p4

    move-object/from16 v6, p5

    move-object/from16 v7, p6

    move/from16 v0, p8

    move/from16 v1, p9

    move-object/from16 v2, p10

    move-object/from16 v3, p11

    move-object/from16 v4, p12

    move-object/from16 v9, p13

    move/from16 v10, p15

    move/from16 v11, p16

    sget-object v12, Lp1/v0;->F:Lp1/v0;

    sget-object v13, Lc0/d;->z:Lc0/d;

    move-object/from16 v14, p14

    check-cast v14, Lp1/q;

    const v15, 0x20979528

    invoke-virtual {v14, v15}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v15, v10, 0x6

    const/16 v16, 0x4

    move-object/from16 v21, v12

    if-nez v15, :cond_1

    invoke-virtual/range {p0 .. p0}, Ljava/lang/Enum;->ordinal()I

    move-result v15

    invoke-virtual {v14, v15}, Lp1/q;->e(I)Z

    move-result v15

    if-eqz v15, :cond_0

    move/from16 v15, v16

    goto :goto_0

    :cond_0
    const/4 v15, 0x2

    :goto_0
    or-int/2addr v15, v10

    goto :goto_1

    :cond_1
    move v15, v10

    :goto_1
    and-int/lit8 v17, v10, 0x30

    const/16 v18, 0x10

    const/16 v19, 0x20

    move-object/from16 v12, p1

    if-nez v17, :cond_3

    invoke-virtual {v14, v12}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v17

    if-eqz v17, :cond_2

    move/from16 v17, v19

    goto :goto_2

    :cond_2
    move/from16 v17, v18

    :goto_2
    or-int v15, v15, v17

    :cond_3
    and-int/lit16 v12, v10, 0x180

    const/16 v17, 0x80

    const/16 v20, 0x100

    if-nez v12, :cond_5

    move-object/from16 v12, p2

    invoke-virtual {v14, v12}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v22

    if-eqz v22, :cond_4

    move/from16 v22, v20

    goto :goto_3

    :cond_4
    move/from16 v22, v17

    :goto_3
    or-int v15, v15, v22

    goto :goto_4

    :cond_5
    move-object/from16 v12, p2

    :goto_4
    and-int/lit16 v12, v10, 0xc00

    const/16 v22, 0x400

    move/from16 v23, v12

    if-nez v23, :cond_7

    invoke-virtual {v14, v8}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v23

    if-eqz v23, :cond_6

    const/16 v23, 0x800

    goto :goto_5

    :cond_6
    move/from16 v23, v22

    :goto_5
    or-int v15, v15, v23

    :cond_7
    and-int/lit16 v12, v10, 0x6000

    const/16 v24, 0x2000

    const/16 v25, 0x4000

    if-nez v12, :cond_9

    invoke-virtual {v14, v5}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v12

    if-eqz v12, :cond_8

    move/from16 v12, v25

    goto :goto_6

    :cond_8
    move/from16 v12, v24

    :goto_6
    or-int/2addr v15, v12

    :cond_9
    const/high16 v12, 0x30000

    and-int v26, v10, v12

    const/high16 v27, 0x10000

    const/high16 v28, 0x20000

    if-nez v26, :cond_b

    invoke-virtual {v14, v6}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v26

    if-eqz v26, :cond_a

    move/from16 v26, v28

    goto :goto_7

    :cond_a
    move/from16 v26, v27

    :goto_7
    or-int v15, v15, v26

    :cond_b
    const/high16 v26, 0x180000

    and-int v29, v10, v26

    const/high16 v30, 0x80000

    const/high16 v31, 0x100000

    move/from16 v32, v12

    const/4 v12, 0x0

    if-nez v29, :cond_d

    invoke-virtual {v14, v12}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v29

    if-eqz v29, :cond_c

    move/from16 v29, v31

    goto :goto_8

    :cond_c
    move/from16 v29, v30

    :goto_8
    or-int v15, v15, v29

    :cond_d
    const/high16 v29, 0xc00000

    and-int v33, v10, v29

    const/high16 v34, 0x400000

    const/high16 v35, 0x800000

    if-nez v33, :cond_f

    invoke-virtual {v14, v12}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v33

    if-eqz v33, :cond_e

    move/from16 v33, v35

    goto :goto_9

    :cond_e
    move/from16 v33, v34

    :goto_9
    or-int v15, v15, v33

    :cond_f
    const/high16 v33, 0x6000000

    and-int v33, v10, v33

    if-nez v33, :cond_11

    invoke-virtual {v14, v12}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v33

    if-eqz v33, :cond_10

    const/high16 v33, 0x4000000

    goto :goto_a

    :cond_10
    const/high16 v33, 0x2000000

    :goto_a
    or-int v15, v15, v33

    :cond_11
    const/high16 v33, 0x30000000

    and-int v33, v10, v33

    if-nez v33, :cond_13

    invoke-virtual {v14, v12}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v12

    if-eqz v12, :cond_12

    const/high16 v12, 0x20000000

    goto :goto_b

    :cond_12
    const/high16 v12, 0x10000000

    :goto_b
    or-int/2addr v15, v12

    :cond_13
    move v12, v15

    and-int/lit8 v15, v11, 0x6

    if-nez v15, :cond_15

    invoke-virtual {v14, v7}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v15

    if-eqz v15, :cond_14

    goto :goto_c

    :cond_14
    const/16 v16, 0x2

    :goto_c
    or-int v15, v11, v16

    goto :goto_d

    :cond_15
    move v15, v11

    :goto_d
    and-int/lit8 v16, v11, 0x30

    move/from16 v6, p7

    if-nez v16, :cond_17

    invoke-virtual {v14, v6}, Lp1/q;->h(Z)Z

    move-result v16

    if-eqz v16, :cond_16

    move/from16 v18, v19

    :cond_16
    or-int v15, v15, v18

    :cond_17
    and-int/lit16 v5, v11, 0x180

    if-nez v5, :cond_19

    invoke-virtual {v14, v0}, Lp1/q;->h(Z)Z

    move-result v5

    if-eqz v5, :cond_18

    move/from16 v17, v20

    :cond_18
    or-int v15, v15, v17

    :cond_19
    and-int/lit16 v5, v11, 0xc00

    if-nez v5, :cond_1b

    invoke-virtual {v14, v1}, Lp1/q;->h(Z)Z

    move-result v5

    if-eqz v5, :cond_1a

    const/16 v22, 0x800

    :cond_1a
    or-int v15, v15, v22

    :cond_1b
    and-int/lit16 v5, v11, 0x6000

    if-nez v5, :cond_1d

    invoke-virtual {v14, v2}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_1c

    move/from16 v24, v25

    :cond_1c
    or-int v15, v15, v24

    :cond_1d
    and-int v5, v11, v32

    if-nez v5, :cond_1f

    invoke-virtual {v14, v3}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_1e

    move/from16 v27, v28

    :cond_1e
    or-int v15, v15, v27

    :cond_1f
    and-int v5, v11, v26

    if-nez v5, :cond_21

    invoke-virtual {v14, v4}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_20

    move/from16 v30, v31

    :cond_20
    or-int v15, v15, v30

    :cond_21
    and-int v5, v11, v29

    if-nez v5, :cond_23

    invoke-virtual {v14, v9}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_22

    move/from16 v34, v35

    :cond_22
    or-int v15, v15, v34

    :cond_23
    move/from16 v22, v15

    const v5, 0x12492493

    and-int/2addr v5, v12

    const v15, 0x12492492

    if-ne v5, v15, :cond_25

    const v5, 0x492493

    and-int v5, v22, v5

    const v15, 0x492492

    if-eq v5, v15, :cond_24

    goto :goto_e

    :cond_24
    const/4 v5, 0x0

    goto :goto_f

    :cond_25
    :goto_e
    const/4 v5, 0x1

    :goto_f
    and-int/lit8 v15, v12, 0x1

    invoke-virtual {v14, v15, v5}, Lp1/q;->U(IZ)Z

    move-result v5

    if-eqz v5, :cond_62

    shr-int/lit8 v5, v22, 0xc

    and-int/lit8 v5, v5, 0xe

    invoke-static {v2, v14, v5}, Lse/h;->x(Lj0/i;Landroidx/compose/runtime/Composer;I)Lp1/c1;

    move-result-object v5

    invoke-interface {v5}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/Boolean;

    invoke-virtual {v5}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v25

    if-eqz v25, :cond_26

    sget-object v5, Lm1/y;->w:Lm1/y;

    goto :goto_10

    :cond_26
    invoke-interface/range {p1 .. p1}, Ljava/lang/CharSequence;->length()I

    move-result v5

    if-nez v5, :cond_27

    sget-object v5, Lm1/y;->x:Lm1/y;

    goto :goto_10

    :cond_27
    sget-object v5, Lm1/y;->y:Lm1/y;

    :goto_10
    if-nez v0, :cond_28

    iget-wide v6, v4, Ll1/e4;->z:J

    goto :goto_11

    :cond_28
    if-eqz v1, :cond_29

    iget-wide v6, v4, Ll1/e4;->A:J

    goto :goto_11

    :cond_29
    if-eqz v25, :cond_2a

    iget-wide v6, v4, Ll1/e4;->x:J

    goto :goto_11

    :cond_2a
    iget-wide v6, v4, Ll1/e4;->y:J

    :goto_11
    sget-object v15, Ll1/z4;->a:Lp1/u2;

    invoke-virtual {v14, v15}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v15

    check-cast v15, Ll1/y4;

    iget-object v10, v15, Ll1/y4;->j:Ll3/v0;

    iget-object v15, v15, Ll1/y4;->l:Ll3/v0;

    invoke-virtual {v10}, Ll3/v0;->c()J

    move-result-wide v0

    sget-wide v2, Li2/x;->n:J

    invoke-static {v0, v1, v2, v3}, Li2/x;->d(JJ)Z

    move-result v0

    if-eqz v0, :cond_2b

    invoke-virtual {v15}, Ll3/v0;->c()J

    move-result-wide v0

    invoke-static {v0, v1, v2, v3}, Li2/x;->d(JJ)Z

    move-result v0

    if-eqz v0, :cond_2c

    :cond_2b
    invoke-virtual {v10}, Ll3/v0;->c()J

    move-result-wide v0

    invoke-static {v0, v1, v2, v3}, Li2/x;->d(JJ)Z

    move-result v0

    if-nez v0, :cond_2d

    invoke-virtual {v15}, Ll3/v0;->c()J

    move-result-wide v0

    invoke-static {v0, v1, v2, v3}, Li2/x;->d(JJ)Z

    move-result v0

    if-eqz v0, :cond_2d

    :cond_2c
    const/4 v0, 0x1

    goto :goto_12

    :cond_2d
    const/4 v0, 0x0

    :goto_12
    invoke-virtual {v15}, Ll3/v0;->c()J

    move-result-wide v1

    const-wide/16 v16, 0x10

    if-eqz v0, :cond_2f

    cmp-long v3, v1, v16

    if-eqz v3, :cond_2e

    goto :goto_13

    :cond_2e
    move-wide v1, v6

    :cond_2f
    :goto_13
    invoke-virtual {v10}, Ll3/v0;->c()J

    move-result-wide v18

    if-eqz v0, :cond_31

    cmp-long v3, v18, v16

    if-eqz v3, :cond_30

    goto :goto_14

    :cond_30
    move-wide/from16 v27, v6

    goto :goto_15

    :cond_31
    :goto_14
    move-wide/from16 v27, v18

    :goto_15
    if-eqz p4, :cond_32

    const/4 v3, 0x1

    :goto_16
    move/from16 v29, v0

    goto :goto_17

    :cond_32
    const/4 v3, 0x0

    goto :goto_16

    :goto_17
    const-string v0, "TextFieldInputState"

    const/16 v8, 0x30

    move-wide/from16 v30, v1

    const/4 v1, 0x0

    invoke-static {v5, v0, v14, v8, v1}, Ld0/d2;->f(Ljava/lang/Object;Ljava/lang/String;Landroidx/compose/runtime/Composer;II)Ld0/z1;

    move-result-object v0

    iget-object v1, v0, Ld0/z1;->a:Lal/a;

    iget-object v2, v0, Ld0/z1;->d:Lp1/k1;

    sget-object v5, Lo1/n;->x:Lo1/n;

    invoke-static {v5, v14}, Ll1/k3;->m(Lo1/n;Landroidx/compose/runtime/Composer;)Ld0/i1;

    move-result-object v17

    sget-object v18, Ld0/f;->i:Ld0/f2;

    invoke-virtual {v1}, Lal/a;->y0()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lm1/y;

    move/from16 v32, v8

    const v8, -0x559dce72

    invoke-virtual {v14, v8}, Lp1/q;->e0(I)V

    invoke-virtual {v5}, Ljava/lang/Enum;->ordinal()I

    move-result v5

    const/16 v33, 0x0

    const/high16 v34, 0x3f800000    # 1.0f

    if-eqz v5, :cond_33

    const/4 v8, 0x1

    if-eq v5, v8, :cond_35

    const/4 v8, 0x2

    if-ne v5, v8, :cond_34

    :cond_33
    move/from16 v5, v34

    :goto_18
    const/4 v8, 0x0

    goto :goto_19

    :cond_34
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0

    :cond_35
    if-eqz v3, :cond_33

    move/from16 v5, v33

    goto :goto_18

    :goto_19
    invoke-virtual {v14, v8}, Lp1/q;->q(Z)V

    invoke-static {v5}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v5

    invoke-virtual {v2}, Lp1/k1;->getValue()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lm1/y;

    move-object/from16 v19, v0

    const v0, -0x559dce72

    invoke-virtual {v14, v0}, Lp1/q;->e0(I)V

    invoke-virtual {v8}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    if-eqz v0, :cond_36

    const/4 v8, 0x1

    if-eq v0, v8, :cond_38

    const/4 v8, 0x2

    if-ne v0, v8, :cond_37

    :cond_36
    move/from16 v0, v34

    :goto_1a
    const/4 v8, 0x0

    goto :goto_1b

    :cond_37
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0

    :cond_38
    if-eqz v3, :cond_36

    move/from16 v0, v33

    goto :goto_1a

    :goto_1b
    invoke-virtual {v14, v8}, Lp1/q;->q(Z)V

    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v16

    invoke-virtual/range {v19 .. v19}, Ld0/z1;->f()Ld0/t1;

    const v0, -0x2a50698e

    invoke-virtual {v14, v0}, Lp1/q;->e0(I)V

    invoke-virtual {v14, v8}, Lp1/q;->q(Z)V

    const/high16 v20, 0x30000

    move-object/from16 v0, v19

    move-object/from16 v19, v14

    move-object v14, v0

    move-object v0, v15

    move-object v15, v5

    invoke-static/range {v14 .. v20}, Ld0/d2;->d(Ld0/z1;Ljava/lang/Object;Ljava/lang/Object;Ld0/c0;Ld0/f2;Landroidx/compose/runtime/Composer;I)Ld0/v1;

    move-result-object v39

    move-object/from16 v43, v19

    move-object/from16 v19, v14

    move-object/from16 v14, v43

    sget-object v5, Lo1/n;->z:Lo1/n;

    invoke-static {v5, v14}, Ll1/k3;->m(Lo1/n;Landroidx/compose/runtime/Composer;)Ld0/i1;

    move-result-object v8

    sget-object v15, Lo1/n;->E:Lo1/n;

    invoke-static {v15, v14}, Ll1/k3;->m(Lo1/n;Landroidx/compose/runtime/Composer;)Ld0/i1;

    move-result-object v15

    invoke-virtual {v1}, Lal/a;->y0()Ljava/lang/Object;

    move-result-object v16

    check-cast v16, Lm1/y;

    move-object/from16 v35, v0

    const v0, -0x4128d333

    invoke-virtual {v14, v0}, Lp1/q;->e0(I)V

    invoke-virtual/range {v16 .. v16}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    if-eqz v0, :cond_3c

    move-object/from16 v36, v1

    const/4 v1, 0x1

    if-eq v0, v1, :cond_3a

    const/4 v1, 0x2

    if-ne v0, v1, :cond_39

    :goto_1c
    move/from16 v0, v33

    :goto_1d
    const/4 v1, 0x0

    goto :goto_1f

    :cond_39
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0

    :cond_3a
    if-eqz v3, :cond_3b

    goto :goto_1c

    :cond_3b
    :goto_1e
    move/from16 v0, v34

    goto :goto_1d

    :cond_3c
    move-object/from16 v36, v1

    goto :goto_1e

    :goto_1f
    invoke-virtual {v14, v1}, Lp1/q;->q(Z)V

    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v0

    invoke-virtual {v2}, Lp1/k1;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lm1/y;

    move-object/from16 v16, v0

    const v0, -0x4128d333

    invoke-virtual {v14, v0}, Lp1/q;->e0(I)V

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    if-eqz v0, :cond_3f

    const/4 v1, 0x1

    if-eq v0, v1, :cond_3e

    const/4 v1, 0x2

    if-ne v0, v1, :cond_3d

    :goto_20
    move/from16 v0, v33

    :goto_21
    const/4 v1, 0x0

    goto :goto_22

    :cond_3d
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0

    :cond_3e
    if-eqz v3, :cond_3f

    goto :goto_20

    :cond_3f
    move/from16 v0, v34

    goto :goto_21

    :goto_22
    invoke-virtual {v14, v1}, Lp1/q;->q(Z)V

    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v0

    invoke-virtual/range {v19 .. v19}, Ld0/z1;->f()Ld0/t1;

    move-result-object v1

    move-object/from16 v17, v0

    const v0, -0x3aa6c997

    invoke-virtual {v14, v0}, Lp1/q;->e0(I)V

    sget-object v0, Lm1/y;->w:Lm1/y;

    move-object/from16 v37, v2

    sget-object v2, Lm1/y;->x:Lm1/y;

    invoke-interface {v1, v0, v2}, Ld0/t1;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v38

    if-eqz v38, :cond_42

    :cond_40
    move-object v15, v8

    :cond_41
    :goto_23
    const/4 v1, 0x0

    goto :goto_24

    :cond_42
    invoke-interface {v1, v2, v0}, Ld0/t1;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_41

    sget-object v0, Lm1/y;->y:Lm1/y;

    invoke-interface {v1, v0, v2}, Ld0/t1;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_40

    goto :goto_23

    :goto_24
    invoke-virtual {v14, v1}, Lp1/q;->q(Z)V

    move-object/from16 v43, v19

    move-object/from16 v19, v14

    move-object/from16 v14, v43

    move-object/from16 v43, v17

    move-object/from16 v17, v15

    move-object/from16 v15, v16

    move-object/from16 v16, v43

    invoke-static/range {v14 .. v20}, Ld0/d2;->d(Ld0/z1;Ljava/lang/Object;Ljava/lang/Object;Ld0/c0;Ld0/f2;Landroidx/compose/runtime/Composer;I)Ld0/v1;

    move-result-object v1

    move-object/from16 v43, v19

    move-object/from16 v19, v14

    move-object/from16 v14, v43

    invoke-virtual/range {v36 .. v36}, Lal/a;->y0()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lm1/y;

    const v2, -0x4b028119

    invoke-virtual {v14, v2}, Lp1/q;->e0(I)V

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    if-eqz v0, :cond_43

    const/4 v15, 0x1

    if-eq v0, v15, :cond_45

    const/4 v15, 0x2

    if-ne v0, v15, :cond_44

    :cond_43
    move/from16 v0, v34

    :goto_25
    const/4 v15, 0x0

    goto :goto_26

    :cond_44
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0

    :cond_45
    if-eqz v3, :cond_43

    move/from16 v0, v33

    goto :goto_25

    :goto_26
    invoke-virtual {v14, v15}, Lp1/q;->q(Z)V

    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v15

    invoke-virtual/range {v37 .. v37}, Lp1/k1;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lm1/y;

    invoke-virtual {v14, v2}, Lp1/q;->e0(I)V

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    if-eqz v0, :cond_46

    const/4 v2, 0x1

    if-eq v0, v2, :cond_48

    const/4 v2, 0x2

    if-ne v0, v2, :cond_47

    :cond_46
    move/from16 v33, v34

    :goto_27
    const/4 v0, 0x0

    goto :goto_28

    :cond_47
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0

    :cond_48
    if-eqz v3, :cond_46

    goto :goto_27

    :goto_28
    invoke-virtual {v14, v0}, Lp1/q;->q(Z)V

    invoke-static/range {v33 .. v33}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v16

    invoke-virtual/range {v19 .. v19}, Ld0/z1;->f()Ld0/t1;

    const v2, 0x7ebca8cb

    invoke-virtual {v14, v2}, Lp1/q;->e0(I)V

    invoke-virtual {v14, v0}, Lp1/q;->q(Z)V

    move-object/from16 v17, v19

    move-object/from16 v19, v14

    move-object/from16 v14, v17

    move-object/from16 v17, v8

    invoke-static/range {v14 .. v20}, Ld0/d2;->d(Ld0/z1;Ljava/lang/Object;Ljava/lang/Object;Ld0/c0;Ld0/f2;Landroidx/compose/runtime/Composer;I)Ld0/v1;

    move-result-object v8

    move-object/from16 v43, v19

    move-object/from16 v19, v14

    move-object/from16 v14, v43

    invoke-static {v5, v14}, Ll1/k3;->m(Lo1/n;Landroidx/compose/runtime/Composer;)Ld0/i1;

    move-result-object v17

    invoke-virtual/range {v37 .. v37}, Lp1/k1;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lm1/y;

    const v2, -0xc5f552

    invoke-virtual {v14, v2}, Lp1/q;->e0(I)V

    sget-object v3, Lm1/j0;->a:[I

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    aget v0, v3, v0

    const/4 v15, 0x1

    if-ne v0, v15, :cond_49

    move-wide/from16 v15, v30

    :goto_29
    const/4 v0, 0x0

    goto :goto_2a

    :cond_49
    move-wide/from16 v15, v27

    goto :goto_29

    :goto_2a
    invoke-virtual {v14, v0}, Lp1/q;->q(Z)V

    invoke-static/range {v15 .. v16}, Li2/x;->g(J)Lj2/c;

    move-result-object v0

    invoke-virtual {v14, v0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v5

    invoke-virtual {v14}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v15

    sget-object v2, Lp1/l;->a:Lp1/v0;

    if-nez v5, :cond_4a

    if-ne v15, v2, :cond_4b

    :cond_4a
    new-instance v5, La3/m1;

    const/16 v15, 0x9

    invoke-direct {v5, v0, v15}, La3/m1;-><init>(Ljava/lang/Object;I)V

    new-instance v15, Ld0/f2;

    invoke-direct {v15, v13, v5}, Ld0/f2;-><init>(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v14, v15}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_4b
    move-object/from16 v18, v15

    check-cast v18, Ld0/f2;

    invoke-virtual/range {v36 .. v36}, Lal/a;->y0()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lm1/y;

    const v5, -0xc5f552

    invoke-virtual {v14, v5}, Lp1/q;->e0(I)V

    invoke-virtual {v0}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    aget v0, v3, v0

    const/4 v15, 0x1

    if-ne v0, v15, :cond_4c

    move-wide/from16 v33, v6

    move-wide/from16 v5, v30

    :goto_2b
    const/4 v0, 0x0

    goto :goto_2c

    :cond_4c
    move-wide/from16 v33, v6

    move-wide/from16 v5, v27

    goto :goto_2b

    :goto_2c
    invoke-static {v14, v0, v5, v6}, Ldc/b;->h(Lp1/q;ZJ)Li2/x;

    move-result-object v5

    invoke-virtual/range {v37 .. v37}, Lp1/k1;->getValue()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lm1/y;

    const v7, -0xc5f552

    invoke-virtual {v14, v7}, Lp1/q;->e0(I)V

    invoke-virtual {v6}, Ljava/lang/Enum;->ordinal()I

    move-result v6

    aget v3, v3, v6

    if-ne v3, v15, :cond_4d

    move-wide/from16 v6, v30

    goto :goto_2d

    :cond_4d
    move-wide/from16 v6, v27

    :goto_2d
    invoke-virtual {v14, v0}, Lp1/q;->q(Z)V

    new-instance v3, Li2/x;

    invoke-direct {v3, v6, v7}, Li2/x;-><init>(J)V

    invoke-virtual/range {v19 .. v19}, Ld0/z1;->f()Ld0/t1;

    const v6, 0x747961b9

    invoke-virtual {v14, v6}, Lp1/q;->e0(I)V

    invoke-virtual {v14, v0}, Lp1/q;->q(Z)V

    move-object/from16 v15, v19

    move-object/from16 v19, v14

    move-object v14, v15

    move-object/from16 v16, v3

    move-object v15, v5

    invoke-static/range {v14 .. v20}, Ld0/d2;->d(Ld0/z1;Ljava/lang/Object;Ljava/lang/Object;Ld0/c0;Ld0/f2;Landroidx/compose/runtime/Composer;I)Ld0/v1;

    move-result-object v3

    move-object/from16 v43, v19

    move-object/from16 v19, v14

    move-object/from16 v14, v43

    invoke-virtual/range {v37 .. v37}, Lp1/k1;->getValue()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lm1/y;

    const v5, -0x1bb38f5d

    invoke-virtual {v14, v5}, Lp1/q;->e0(I)V

    invoke-virtual {v14, v0}, Lp1/q;->q(Z)V

    invoke-static/range {v33 .. v34}, Li2/x;->g(J)Lj2/c;

    move-result-object v0

    invoke-virtual {v14, v0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v6

    invoke-virtual {v14}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v7

    if-nez v6, :cond_4e

    if-ne v7, v2, :cond_4f

    :cond_4e
    new-instance v6, La3/m1;

    const/16 v7, 0x9

    invoke-direct {v6, v0, v7}, La3/m1;-><init>(Ljava/lang/Object;I)V

    new-instance v7, Ld0/f2;

    invoke-direct {v7, v13, v6}, Ld0/f2;-><init>(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v14, v7}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_4f
    move-object/from16 v18, v7

    check-cast v18, Ld0/f2;

    invoke-virtual/range {v36 .. v36}, Lal/a;->y0()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lm1/y;

    invoke-virtual {v14, v5}, Lp1/q;->e0(I)V

    const/4 v0, 0x0

    invoke-virtual {v14, v0}, Lp1/q;->q(Z)V

    new-instance v15, Li2/x;

    move-wide/from16 v6, v33

    invoke-direct {v15, v6, v7}, Li2/x;-><init>(J)V

    invoke-virtual/range {v37 .. v37}, Lp1/k1;->getValue()Ljava/lang/Object;

    move-result-object v13

    check-cast v13, Lm1/y;

    invoke-virtual {v14, v5}, Lp1/q;->e0(I)V

    invoke-virtual {v14, v0}, Lp1/q;->q(Z)V

    new-instance v5, Li2/x;

    invoke-direct {v5, v6, v7}, Li2/x;-><init>(J)V

    invoke-virtual/range {v19 .. v19}, Ld0/z1;->f()Ld0/t1;

    const v6, 0x46fc0e6e

    invoke-virtual {v14, v6}, Lp1/q;->e0(I)V

    invoke-virtual {v14, v0}, Lp1/q;->q(Z)V

    move-object/from16 v16, v19

    move-object/from16 v19, v14

    move-object/from16 v14, v16

    move-object/from16 v16, v5

    invoke-static/range {v14 .. v20}, Ld0/d2;->d(Ld0/z1;Ljava/lang/Object;Ljava/lang/Object;Ld0/c0;Ld0/f2;Landroidx/compose/runtime/Composer;I)Ld0/v1;

    move-result-object v13

    move-object/from16 v6, v19

    invoke-virtual {v6}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v2, :cond_50

    new-instance v0, Lm1/i0;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    invoke-virtual {v6, v0}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_50
    move-object/from16 v17, v0

    check-cast v17, Lm1/i0;

    if-nez p4, :cond_51

    const v0, -0x70c16e39

    invoke-virtual {v6, v0}, Lp1/q;->e0(I)V

    const/4 v0, 0x0

    invoke-virtual {v6, v0}, Lp1/q;->q(Z)V

    move v5, v12

    move-object/from16 v3, v21

    const/16 p14, 0x0

    const/16 v7, 0x800

    const/4 v9, 0x0

    goto :goto_2e

    :cond_51
    const/4 v0, 0x0

    const v5, -0x70c16e38

    invoke-virtual {v6, v5}, Lp1/q;->e0(I)V

    new-instance v9, Ll1/m2;

    move-object/from16 v16, p4

    move-object v15, v3

    move v5, v12

    move-object/from16 v3, v21

    move/from16 v14, v29

    move-object/from16 v11, v35

    move-object/from16 v12, v39

    const/16 p14, 0x0

    const/16 v7, 0x800

    invoke-direct/range {v9 .. v17}, Ll1/m2;-><init>(Ll3/v0;Ll3/v0;Ld0/v1;Ld0/v1;ZLd0/v1;Lkotlin/jvm/functions/Function3;Lm1/i0;)V

    const v11, -0x402b4ec0

    invoke-static {v11, v6, v9}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v9

    invoke-virtual {v6, v0}, Lp1/q;->q(Z)V

    :goto_2e
    if-nez p8, :cond_52

    iget-wide v11, v4, Ll1/e4;->D:J

    goto :goto_2f

    :cond_52
    if-eqz p9, :cond_53

    iget-wide v11, v4, Ll1/e4;->E:J

    goto :goto_2f

    :cond_53
    if-eqz v25, :cond_54

    iget-wide v11, v4, Ll1/e4;->B:J

    goto :goto_2f

    :cond_54
    iget-wide v11, v4, Ll1/e4;->C:J

    :goto_2f
    invoke-virtual {v6}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v2, :cond_55

    new-instance v0, Lt;

    const/4 v13, 0x6

    invoke-direct {v0, v1, v13}, Lt;-><init>(Lp1/t2;I)V

    invoke-static {v0, v3}, Lp1/x;->s(Lc93/a;Lp1/o2;)Lp1/f0;

    move-result-object v0

    invoke-virtual {v6, v0}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_55
    check-cast v0, Lp1/t2;

    if-eqz p5, :cond_56

    invoke-interface/range {p1 .. p1}, Ljava/lang/CharSequence;->length()I

    move-result v13

    if-nez v13, :cond_56

    invoke-interface {v0}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-eqz v0, :cond_56

    const v0, -0x70b07c28

    invoke-virtual {v6, v0}, Lp1/q;->e0(I)V

    new-instance v0, Lm1/h0;

    move-object v13, v10

    move-object v10, v4

    move-object v4, v13

    move-object v14, v2

    move-object v13, v3

    move v15, v5

    move-wide v2, v11

    move-object/from16 v5, p5

    move-object/from16 v12, p11

    move-object/from16 v11, p13

    invoke-direct/range {v0 .. v5}, Lm1/h0;-><init>(Ld0/v1;JLl3/v0;Lc93/m;)V

    const v1, 0x53c6f2c5

    invoke-static {v1, v6, v0}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v6, v1}, Lp1/q;->q(Z)V

    move-object/from16 v16, v0

    goto :goto_30

    :cond_56
    move-object/from16 v12, p11

    move-object/from16 v11, p13

    move-object v14, v2

    move-object v13, v3

    move-object v10, v4

    move v15, v5

    const/4 v1, 0x0

    const v0, -0x70aa6c96

    invoke-virtual {v6, v0}, Lp1/q;->e0(I)V

    invoke-virtual {v6, v1}, Lp1/q;->q(Z)V

    move-object/from16 v16, p14

    :goto_30
    invoke-virtual {v6}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v14, :cond_57

    new-instance v0, Lt;

    const/4 v1, 0x7

    invoke-direct {v0, v8, v1}, Lt;-><init>(Lp1/t2;I)V

    invoke-static {v0, v13}, Lp1/x;->s(Lc93/a;Lp1/o2;)Lp1/f0;

    move-result-object v0

    invoke-virtual {v6, v0}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_57
    check-cast v0, Lp1/t2;

    const v0, -0x709f7ed6

    invoke-virtual {v6, v0}, Lp1/q;->e0(I)V

    const/4 v0, 0x0

    invoke-virtual {v6, v0}, Lp1/q;->q(Z)V

    const v1, -0x7096b376

    invoke-virtual {v6, v1}, Lp1/q;->e0(I)V

    invoke-virtual {v6, v0}, Lp1/q;->q(Z)V

    const v1, -0x7094085f

    invoke-virtual {v6, v1}, Lp1/q;->e0(I)V

    invoke-virtual {v6, v0}, Lp1/q;->q(Z)V

    const v1, -0x708fc380

    invoke-virtual {v6, v1}, Lp1/q;->e0(I)V

    invoke-virtual {v6, v0}, Lp1/q;->q(Z)V

    if-nez p8, :cond_58

    iget-wide v0, v10, Ll1/e4;->H:J

    :goto_31
    move-wide v2, v0

    goto :goto_32

    :cond_58
    if-eqz p9, :cond_59

    iget-wide v0, v10, Ll1/e4;->I:J

    goto :goto_31

    :cond_59
    if-eqz v25, :cond_5a

    iget-wide v0, v10, Ll1/e4;->F:J

    goto :goto_31

    :cond_5a
    iget-wide v0, v10, Ll1/e4;->G:J

    goto :goto_31

    :goto_32
    if-nez p6, :cond_5b

    const v0, -0x708b48fc

    invoke-virtual {v6, v0}, Lp1/q;->e0(I)V

    const/4 v8, 0x0

    invoke-virtual {v6, v8}, Lp1/q;->q(Z)V

    move-object/from16 v0, p14

    goto :goto_33

    :cond_5b
    const/4 v8, 0x0

    const v0, -0x708b48fb

    invoke-virtual {v6, v0}, Lp1/q;->e0(I)V

    new-instance v0, Lg1/r6;

    const/4 v5, 0x2

    move-object/from16 v4, p6

    move-object/from16 v1, v35

    invoke-direct/range {v0 .. v5}, Lg1/r6;-><init>(Ljava/lang/Object;JLjava/lang/Object;I)V

    const v1, 0x31e62e50

    invoke-static {v1, v6, v0}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v0

    invoke-virtual {v6, v8}, Lp1/q;->q(Z)V

    :goto_33
    invoke-virtual/range {p0 .. p0}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    if-eqz v1, :cond_61

    const/4 v2, 0x1

    if-ne v1, v2, :cond_60

    const v1, -0x7075f34a

    invoke-virtual {v6, v1}, Lp1/q;->e0(I)V

    invoke-virtual {v6}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v14, :cond_5c

    new-instance v1, Lh2/e;

    const-wide/16 v3, 0x0

    invoke-direct {v1, v3, v4}, Lh2/e;-><init>(J)V

    invoke-static {v1}, Lp1/x;->z(Ljava/lang/Object;)Lp1/k1;

    move-result-object v1

    invoke-virtual {v6, v1}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_5c
    check-cast v1, Lp1/c1;

    new-instance v3, Lb1/d;

    move-object/from16 v4, p3

    invoke-direct {v3, v1, v4, v12, v11}, Lb1/d;-><init>(Lp1/c1;Ll1/k4;Ll0/k1;Lc93/m;)V

    const v5, 0x1f7a6892

    invoke-static {v5, v6, v3}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v3

    new-instance v35, Lhc3/j;

    const/16 v36, 0x0

    const/16 v37, 0x4

    const-class v38, Lp1/t2;

    const-string v40, "value"

    const-string v41, "getValue()Ljava/lang/Object;"

    invoke-direct/range {v35 .. v41}, Lhc3/j;-><init>(IILjava/lang/Class;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;)V

    move/from16 v26, v2

    move-object v2, v9

    move-object/from16 v13, v35

    move-object/from16 v5, v39

    new-instance v9, Lm1/k0;

    invoke-direct {v9, v13}, Lm1/k0;-><init>(Lkotlin/jvm/internal/v;)V

    and-int/lit16 v13, v15, 0x1c00

    if-ne v13, v7, :cond_5d

    goto :goto_34

    :cond_5d
    move/from16 v26, v8

    :goto_34
    invoke-virtual {v6, v5}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v7

    or-int v7, v26, v7

    invoke-virtual {v6}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v13

    if-nez v7, :cond_5e

    if-ne v13, v14, :cond_5f

    :cond_5e
    new-instance v13, Lb30/r2;

    invoke-direct {v13, v4, v5, v1}, Lb30/r2;-><init>(Ll1/k4;Ld0/v1;Lp1/c1;)V

    invoke-virtual {v6, v13}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_5f
    check-cast v13, Lkotlin/jvm/functions/Function1;

    shr-int/lit8 v1, v15, 0x3

    and-int/lit8 v1, v1, 0x70

    or-int/lit8 v1, v1, 0x6

    shl-int/lit8 v5, v22, 0x15

    const/high16 v7, 0xe000000

    and-int/2addr v5, v7

    or-int/2addr v1, v5

    shl-int/lit8 v5, v15, 0x12

    const/high16 v7, 0x70000000

    and-int/2addr v5, v7

    or-int v15, v1, v5

    const v1, 0xe000

    shr-int/lit8 v5, v22, 0x3

    and-int/2addr v1, v5

    or-int/lit16 v1, v1, 0x180

    move-object/from16 v4, p14

    move-object/from16 v5, p14

    move-object/from16 v19, v6

    move-object/from16 v6, p14

    move-object/from16 v7, v16

    move/from16 v16, v1

    move-object v1, v7

    move-object/from16 v8, p3

    move/from16 v7, p7

    move-object v11, v3

    move-object v10, v13

    move-object/from16 v14, v19

    move-object/from16 v3, p14

    move-object v13, v12

    move-object v12, v0

    move-object/from16 v0, p2

    invoke-static/range {v0 .. v16}, Ll1/c3;->c(Lc93/m;Lkotlin/jvm/functions/Function3;Lc93/m;Lc93/m;Lc93/m;Lc93/m;Lc93/m;ZLl1/k4;Lm1/k0;Lkotlin/jvm/functions/Function1;Lx1/b;Lc93/m;Ll0/k1;Landroidx/compose/runtime/Composer;II)V

    const/4 v0, 0x0

    invoke-virtual {v14, v0}, Lp1/q;->q(Z)V

    goto/16 :goto_35

    :cond_60
    move-object v14, v6

    move v0, v8

    const v1, 0x1d670ac8

    invoke-static {v1, v14, v0}, Ldc/b;->v(ILp1/q;Z)Lkotlin/NoWhenBranchMatchedException;

    move-result-object v0

    throw v0

    :cond_61
    move-object/from16 v3, p14

    move-object v11, v0

    move-object v14, v6

    move v0, v8

    move-object v2, v9

    move-object/from16 v1, v16

    move-object/from16 v5, v39

    const v4, -0x708602aa

    invoke-virtual {v14, v4}, Lp1/q;->e0(I)V

    new-instance v4, Lg1/e;

    const/4 v6, 0x7

    move-object/from16 v7, p13

    invoke-direct {v4, v6, v7}, Lg1/e;-><init>(ILc93/m;)V

    const v6, -0x671b8a8b

    invoke-static {v6, v14, v4}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v10

    new-instance v35, Lhc3/j;

    const/16 v36, 0x0

    const/16 v37, 0x3

    const-class v38, Lp1/t2;

    const-string v40, "value"

    const-string v41, "getValue()Ljava/lang/Object;"

    invoke-direct/range {v35 .. v41}, Lhc3/j;-><init>(IILjava/lang/Class;Ljava/lang/Object;Ljava/lang/String;Ljava/lang/String;)V

    move-object/from16 v4, v35

    new-instance v9, Lm1/k0;

    invoke-direct {v9, v4}, Lm1/k0;-><init>(Lkotlin/jvm/internal/v;)V

    shr-int/lit8 v4, v15, 0x3

    and-int/lit8 v4, v4, 0x70

    or-int/lit8 v4, v4, 0x6

    shl-int/lit8 v5, v22, 0x15

    const/high16 v6, 0xe000000

    and-int/2addr v5, v6

    or-int/2addr v4, v5

    shl-int/lit8 v5, v15, 0x12

    const/high16 v6, 0x70000000

    and-int/2addr v5, v6

    or-int/2addr v4, v5

    shr-int/lit8 v5, v22, 0x6

    and-int/lit16 v5, v5, 0x1c00

    or-int/lit8 v15, v5, 0x30

    move-object/from16 v19, v14

    move v14, v4

    move-object v4, v3

    move-object v5, v3

    move-object v6, v3

    move-object v0, v2

    move-object v2, v1

    move-object v1, v0

    move-object/from16 v0, p2

    move-object/from16 v8, p3

    move/from16 v7, p7

    move-object/from16 v12, p11

    move-object/from16 v13, v19

    invoke-static/range {v0 .. v15}, Ll1/j4;->b(Lc93/m;Lc93/m;Lkotlin/jvm/functions/Function3;Lc93/m;Lc93/m;Lc93/m;Lc93/m;ZLl1/k4;Lm1/k0;Lx1/b;Lc93/m;Ll0/k1;Landroidx/compose/runtime/Composer;II)V

    move-object v14, v13

    const/4 v0, 0x0

    invoke-virtual {v14, v0}, Lp1/q;->q(Z)V

    goto :goto_35

    :cond_62
    invoke-virtual {v14}, Lp1/q;->X()V

    :goto_35
    invoke-virtual {v14}, Lp1/q;->u()Lp1/v1;

    move-result-object v0

    if-eqz v0, :cond_63

    move-object v1, v0

    new-instance v0, Li40/b;

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move-object/from16 v4, p3

    move-object/from16 v5, p4

    move-object/from16 v6, p5

    move-object/from16 v7, p6

    move/from16 v8, p7

    move/from16 v9, p8

    move/from16 v10, p9

    move-object/from16 v11, p10

    move-object/from16 v12, p11

    move-object/from16 v13, p12

    move-object/from16 v14, p13

    move/from16 v15, p15

    move/from16 v16, p16

    move-object/from16 v42, v1

    move-object/from16 v1, p0

    invoke-direct/range {v0 .. v16}, Li40/b;-><init>(Lm1/m0;Ljava/lang/CharSequence;Lc93/m;Ll1/k4;Lkotlin/jvm/functions/Function3;Lc93/m;Lc93/m;ZZZLj0/i;Ll0/k1;Ll1/e4;Lc93/m;II)V

    move-object/from16 v1, v42

    iput-object v0, v1, Lp1/v1;->d:Lc93/m;

    :cond_63
    return-void
.end method

.method public static final b(JLl3/v0;Lc93/m;Landroidx/compose/runtime/Composer;I)V
    .locals 12

    move/from16 v5, p5

    move-object/from16 v10, p4

    check-cast v10, Lp1/q;

    const v0, 0x17a3cff9

    invoke-virtual {v10, v0}, Lp1/q;->g0(I)Lp1/q;

    invoke-virtual {v10, p0, p1}, Lp1/q;->f(J)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x4

    goto :goto_0

    :cond_0
    const/4 v0, 0x2

    :goto_0
    or-int/2addr v0, v5

    invoke-virtual {v10, p2}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    const/16 v1, 0x20

    goto :goto_1

    :cond_1
    const/16 v1, 0x10

    :goto_1
    or-int/2addr v0, v1

    and-int/lit16 v1, v5, 0x180

    if-nez v1, :cond_3

    invoke-virtual {v10, p3}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    const/16 v1, 0x100

    goto :goto_2

    :cond_2
    const/16 v1, 0x80

    :goto_2
    or-int/2addr v0, v1

    :cond_3
    and-int/lit16 v1, v0, 0x93

    const/16 v2, 0x92

    if-eq v1, v2, :cond_4

    const/4 v1, 0x1

    goto :goto_3

    :cond_4
    const/4 v1, 0x0

    :goto_3
    and-int/lit8 v2, v0, 0x1

    invoke-virtual {v10, v2, v1}, Lp1/q;->U(IZ)Z

    move-result v1

    if-eqz v1, :cond_5

    and-int/lit16 v11, v0, 0x3fe

    move-wide v6, p0

    move-object v8, p2

    move-object v9, p3

    invoke-static/range {v6 .. v11}, Lm1/e0;->b(JLl3/v0;Lc93/m;Landroidx/compose/runtime/Composer;I)V

    goto :goto_4

    :cond_5
    invoke-virtual {v10}, Lp1/q;->X()V

    :goto_4
    invoke-virtual {v10}, Lp1/q;->u()Lp1/v1;

    move-result-object v7

    if-eqz v7, :cond_6

    new-instance v0, Lm1/f0;

    const/4 v6, 0x1

    move-wide v1, p0

    move-object v3, p2

    move-object v4, p3

    invoke-direct/range {v0 .. v6}, Lm1/f0;-><init>(JLl3/v0;Lc93/m;II)V

    iput-object v0, v7, Lp1/v1;->d:Lc93/m;

    :cond_6
    return-void
.end method

.method public static final c(Ll1/k4;)Lb2/f;
    .locals 3

    instance-of v0, p0, Ll1/k4;

    if-eqz v0, :cond_0

    iget-object p0, p0, Ll1/k4;->a:Lb2/k;

    return-object p0

    :cond_0
    new-instance v0, Ljava/lang/IllegalArgumentException;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "Unknown position: "

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V

    throw v0
.end method

.method public static final d(Landroidx/compose/runtime/Composer;)F
    .locals 8

    sget-object v0, Ll1/z4;->a:Lp1/u2;

    check-cast p0, Lp1/q;

    invoke-virtual {p0, v0}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll1/y4;

    iget-object v0, v0, Ll1/y4;->l:Ll3/v0;

    iget-object v0, v0, Ll3/v0;->b:Ll3/b0;

    iget-wide v0, v0, Ll3/b0;->c:J

    sget-wide v2, Lo1/a0;->l:J

    const-wide v4, 0xff00000000L

    and-long/2addr v4, v0

    const-wide v6, 0x100000000L

    cmp-long v4, v4, v6

    if-nez v4, :cond_0

    goto :goto_0

    :cond_0
    move-wide v0, v2

    :goto_0
    sget-object v2, Lb3/v1;->h:Lp1/u2;

    invoke-virtual {p0, v2}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ly3/c;

    invoke-interface {p0, v0, v1}, Ly3/c;->l(J)F

    move-result p0

    const/4 v0, 0x2

    int-to-float v0, v0

    div-float/2addr p0, v0

    return p0
.end method

.method public static final e(Landroidx/compose/runtime/Composer;)F
    .locals 2

    sget-object v0, Ll1/w1;->c:Lp1/u2;

    check-cast p0, Lp1/q;

    invoke-virtual {p0, v0}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ly3/f;

    iget p0, p0, Ly3/f;->w:F

    invoke-static {p0}, Ljava/lang/Float;->isNaN(F)Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    int-to-float p0, v1

    :cond_0
    sget v0, Lo1/w;->d:F

    sub-float/2addr p0, v0

    const/4 v0, 0x2

    int-to-float v0, v0

    div-float/2addr p0, v0

    int-to-float v0, v1

    cmpg-float v1, p0, v0

    if-gez v1, :cond_1

    return v0

    :cond_1
    return p0
.end method
