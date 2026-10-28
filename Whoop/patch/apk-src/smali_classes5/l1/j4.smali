.class public abstract Ll1/j4;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method static constructor <clinit>()V
    .locals 0

    return-void
.end method

.method public static final a(Ljava/lang/String;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZLl3/v0;Lc93/m;Lq3/g0;Lu0/r0;Lu0/q0;ZIILi2/a1;Ll1/e4;Landroidx/compose/runtime/Composer;I)V
    .locals 36

    move-object/from16 v5, p4

    move-object/from16 v8, p13

    move-object/from16 v0, p14

    check-cast v0, Lp1/q;

    const v1, -0x93c9958

    invoke-virtual {v0, v1}, Lp1/q;->g0(I)Lp1/q;

    move-object/from16 v1, p0

    invoke-virtual {v0, v1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    const/4 v2, 0x4

    goto :goto_0

    :cond_0
    const/4 v2, 0x2

    :goto_0
    or-int v2, p15, v2

    move-object/from16 v10, p1

    invoke-virtual {v0, v10}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v3

    const/16 v4, 0x10

    const/16 v6, 0x20

    if-eqz v3, :cond_1

    move v3, v6

    goto :goto_1

    :cond_1
    move v3, v4

    :goto_1
    or-int/2addr v2, v3

    move-object/from16 v3, p2

    invoke-virtual {v0, v3}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v7

    const/16 v9, 0x80

    const/16 v11, 0x100

    if-eqz v7, :cond_2

    move v7, v11

    goto :goto_2

    :cond_2
    move v7, v9

    :goto_2
    or-int/2addr v2, v7

    or-int/lit16 v2, v2, 0x6c00

    invoke-virtual {v0, v5}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_3

    const/high16 v7, 0x20000

    goto :goto_3

    :cond_3
    const/high16 v7, 0x10000

    :goto_3
    or-int/2addr v2, v7

    const/high16 v7, 0x36180000

    or-int/2addr v2, v7

    move-object/from16 v13, p12

    invoke-virtual {v0, v13}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_4

    move v4, v6

    :cond_4
    const/4 v6, 0x6

    or-int/2addr v4, v6

    invoke-virtual {v0, v8}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_5

    move v9, v11

    :cond_5
    or-int/2addr v4, v9

    const v6, 0x12492493

    and-int/2addr v6, v2

    const v7, 0x12492492

    const/4 v9, 0x0

    const/4 v11, 0x1

    if-ne v6, v7, :cond_7

    and-int/lit16 v4, v4, 0x93

    const/16 v6, 0x92

    if-eq v4, v6, :cond_6

    goto :goto_4

    :cond_6
    move v4, v9

    goto :goto_5

    :cond_7
    :goto_4
    move v4, v11

    :goto_5
    and-int/2addr v2, v11

    invoke-virtual {v0, v2, v4}, Lp1/q;->U(IZ)Z

    move-result v2

    if-eqz v2, :cond_d

    invoke-virtual {v0}, Lp1/q;->Z()V

    and-int/lit8 v2, p15, 0x1

    if-eqz v2, :cond_9

    invoke-virtual {v0}, Lp1/q;->C()Z

    move-result v2

    if-eqz v2, :cond_8

    goto :goto_6

    :cond_8
    invoke-virtual {v0}, Lp1/q;->X()V

    move/from16 v11, p3

    move-object/from16 v18, p6

    move-object/from16 v14, p8

    move/from16 v16, p10

    move/from16 v17, p11

    goto :goto_8

    :cond_9
    :goto_6
    sget-object v2, Lu0/q0;->g:Lu0/q0;

    if-eqz p9, :cond_a

    move v4, v11

    goto :goto_7

    :cond_a
    const v4, 0x7fffffff

    :goto_7
    sget-object v6, Lq3/f0;->w:Lg40/h2;

    move-object v14, v2

    move/from16 v16, v4

    move-object/from16 v18, v6

    move/from16 v17, v11

    :goto_8
    invoke-virtual {v0}, Lp1/q;->r()V

    const v2, 0x1d197e53

    invoke-virtual {v0, v2}, Lp1/q;->e0(I)V

    invoke-virtual {v0}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    sget-object v4, Lp1/l;->a:Lp1/v0;

    if-ne v2, v4, :cond_b

    invoke-static {v0}, Ld;->g(Lp1/q;)Lj0/j;

    move-result-object v2

    :cond_b
    check-cast v2, Lj0/i;

    invoke-virtual {v0, v9}, Lp1/q;->q(Z)V

    const v4, 0x538508e2

    invoke-virtual {v0, v4}, Lp1/q;->e0(I)V

    invoke-virtual {v5}, Ll3/v0;->c()J

    move-result-wide v6

    const-wide/16 v19, 0x10

    cmp-long v4, v6, v19

    if-eqz v4, :cond_c

    :goto_9
    move-wide/from16 v20, v6

    goto :goto_a

    :cond_c
    invoke-static {v2, v0, v9}, Lse/h;->x(Lj0/i;Landroidx/compose/runtime/Composer;I)Lp1/c1;

    move-result-object v4

    invoke-interface {v4}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/Boolean;

    invoke-virtual {v4}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v4

    invoke-virtual {v8, v11, v9, v4}, Ll1/e4;->d(ZZZ)J

    move-result-wide v6

    goto :goto_9

    :goto_a
    invoke-virtual {v0, v9}, Lp1/q;->q(Z)V

    new-instance v19, Ll3/v0;

    const-wide/16 v32, 0x0

    const v34, 0xfffffe

    const-wide/16 v22, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    const-wide/16 v27, 0x0

    const/16 v29, 0x0

    const/16 v30, 0x0

    const/16 v31, 0x0

    invoke-direct/range {v19 .. v34}, Ll3/v0;-><init>(JJLp3/r;Lp3/n;Lp3/i;JLw3/l;Li2/z0;IJI)V

    move-object/from16 v4, v19

    invoke-virtual {v5, v4}, Ll3/v0;->e(Ll3/v0;)Ll3/v0;

    move-result-object v12

    sget-object v4, Lf1/a2;->a:Lp1/b0;

    iget-object v6, v8, Ll1/e4;->k:Lf1/y1;

    invoke-virtual {v4, v6}, Lp1/b0;->a(Ljava/lang/Object;)Lp1/u1;

    move-result-object v4

    new-instance v6, Ll1/a3;

    const/16 v22, 0x1

    move-object/from16 v20, p5

    move/from16 v15, p9

    move-object v9, v1

    move-object/from16 v19, v2

    move-object v7, v3

    move-object/from16 v21, v13

    move-object/from16 v13, p7

    invoke-direct/range {v6 .. v22}, Ll1/a3;-><init>(Landroidx/compose/ui/Modifier;Ll1/e4;Ljava/lang/String;Lkotlin/jvm/functions/Function1;ZLl3/v0;Lu0/r0;Lu0/q0;ZIILq3/g0;Lj0/i;Lc93/m;Li2/a1;I)V

    const v1, 0x5701cb68

    invoke-static {v1, v0, v6}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v1

    const/16 v2, 0x38

    invoke-static {v4, v1, v0, v2}, Lp1/x;->a(Lp1/u1;Lc93/m;Landroidx/compose/runtime/Composer;I)V

    move v4, v11

    move-object v9, v14

    move/from16 v11, v16

    move/from16 v12, v17

    move-object/from16 v7, v18

    goto :goto_b

    :cond_d
    invoke-virtual {v0}, Lp1/q;->X()V

    move/from16 v4, p3

    move-object/from16 v7, p6

    move-object/from16 v9, p8

    move/from16 v11, p10

    move/from16 v12, p11

    :goto_b
    invoke-virtual {v0}, Lp1/q;->u()Lp1/v1;

    move-result-object v0

    if-eqz v0, :cond_e

    move-object v1, v0

    new-instance v0, Lb30/a0;

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move-object/from16 v6, p5

    move-object/from16 v8, p7

    move/from16 v10, p9

    move-object/from16 v13, p12

    move-object/from16 v14, p13

    move/from16 v15, p15

    move-object/from16 v35, v1

    move-object/from16 v1, p0

    invoke-direct/range {v0 .. v15}, Lb30/a0;-><init>(Ljava/lang/String;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZLl3/v0;Lc93/m;Lq3/g0;Lu0/r0;Lu0/q0;ZIILi2/a1;Ll1/e4;I)V

    move-object/from16 v1, v35

    iput-object v0, v1, Lp1/v1;->d:Lc93/m;

    :cond_e
    return-void
.end method

.method public static final b(Lc93/m;Lc93/m;Lkotlin/jvm/functions/Function3;Lc93/m;Lc93/m;Lc93/m;Lc93/m;ZLl1/k4;Lm1/k0;Lx1/b;Lc93/m;Ll0/k1;Landroidx/compose/runtime/Composer;II)V
    .locals 40

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move-object/from16 v4, p3

    move-object/from16 v5, p4

    move-object/from16 v6, p5

    move-object/from16 v7, p6

    move-object/from16 v10, p9

    move-object/from16 v0, p10

    move-object/from16 v14, p11

    move-object/from16 v12, p12

    move/from16 v15, p14

    move/from16 v8, p15

    sget-object v9, Lb2/e;->E:Lb2/m;

    sget-object v11, Lb2/e;->w:Lb2/m;

    move-object/from16 v13, p13

    check-cast v13, Lp1/q;

    move-object/from16 v16, v9

    const v9, -0x40c2260f

    invoke-virtual {v13, v9}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v9, v15, 0x6

    move/from16 p13, v9

    sget-object v9, Lb2/t;->w:Lb2/t;

    move-object/from16 v17, v11

    if-nez p13, :cond_1

    invoke-virtual {v13, v9}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v19

    if-eqz v19, :cond_0

    const/16 v19, 0x4

    goto :goto_0

    :cond_0
    const/16 v19, 0x2

    :goto_0
    or-int v19, v15, v19

    goto :goto_1

    :cond_1
    move/from16 v19, v15

    :goto_1
    and-int/lit8 v20, v15, 0x30

    const/16 v21, 0x10

    const/16 v22, 0x20

    if-nez v20, :cond_3

    invoke-virtual {v13, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v20

    if-eqz v20, :cond_2

    move/from16 v20, v22

    goto :goto_2

    :cond_2
    move/from16 v20, v21

    :goto_2
    or-int v19, v19, v20

    :cond_3
    and-int/lit16 v11, v15, 0x180

    const/16 v20, 0x80

    const/16 v23, 0x100

    if-nez v11, :cond_5

    invoke-virtual {v13, v2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_4

    move/from16 v11, v23

    goto :goto_3

    :cond_4
    move/from16 v11, v20

    :goto_3
    or-int v19, v19, v11

    :cond_5
    and-int/lit16 v11, v15, 0xc00

    const/16 v24, 0x400

    move-object/from16 v25, v9

    if-nez v11, :cond_7

    invoke-virtual {v13, v3}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_6

    const/16 v11, 0x800

    goto :goto_4

    :cond_6
    move/from16 v11, v24

    :goto_4
    or-int v19, v19, v11

    :cond_7
    and-int/lit16 v11, v15, 0x6000

    if-nez v11, :cond_9

    invoke-virtual {v13, v4}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_8

    const/16 v11, 0x4000

    goto :goto_5

    :cond_8
    const/16 v11, 0x2000

    :goto_5
    or-int v19, v19, v11

    :cond_9
    const/high16 v11, 0x30000

    and-int/2addr v11, v15

    if-nez v11, :cond_b

    invoke-virtual {v13, v5}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_a

    const/high16 v11, 0x20000

    goto :goto_6

    :cond_a
    const/high16 v11, 0x10000

    :goto_6
    or-int v19, v19, v11

    :cond_b
    const/high16 v11, 0x180000

    and-int/2addr v11, v15

    if-nez v11, :cond_d

    invoke-virtual {v13, v6}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_c

    const/high16 v11, 0x100000

    goto :goto_7

    :cond_c
    const/high16 v11, 0x80000

    :goto_7
    or-int v19, v19, v11

    :cond_d
    const/high16 v11, 0xc00000

    and-int/2addr v11, v15

    if-nez v11, :cond_f

    invoke-virtual {v13, v7}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_e

    const/high16 v11, 0x800000

    goto :goto_8

    :cond_e
    const/high16 v11, 0x400000

    :goto_8
    or-int v19, v19, v11

    :cond_f
    const/high16 v11, 0x6000000

    and-int/2addr v11, v15

    if-nez v11, :cond_11

    move/from16 v11, p7

    invoke-virtual {v13, v11}, Lp1/q;->h(Z)Z

    move-result v26

    if-eqz v26, :cond_10

    const/high16 v26, 0x4000000

    goto :goto_9

    :cond_10
    const/high16 v26, 0x2000000

    :goto_9
    or-int v19, v19, v26

    goto :goto_a

    :cond_11
    move/from16 v11, p7

    :goto_a
    const/high16 v26, 0x30000000

    and-int v26, v15, v26

    move-object/from16 v9, p8

    if-nez v26, :cond_13

    invoke-virtual {v13, v9}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v27

    if-eqz v27, :cond_12

    const/high16 v27, 0x20000000

    goto :goto_b

    :cond_12
    const/high16 v27, 0x10000000

    :goto_b
    or-int v19, v19, v27

    :cond_13
    move/from16 v27, v19

    and-int/lit8 v19, v8, 0x6

    if-nez v19, :cond_16

    and-int/lit8 v19, v8, 0x8

    if-nez v19, :cond_14

    invoke-virtual {v13, v10}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v19

    goto :goto_c

    :cond_14
    invoke-virtual {v13, v10}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v19

    :goto_c
    if-eqz v19, :cond_15

    const/16 v19, 0x4

    goto :goto_d

    :cond_15
    const/16 v19, 0x2

    :goto_d
    or-int v19, v8, v19

    goto :goto_e

    :cond_16
    move/from16 v19, v8

    :goto_e
    and-int/lit8 v28, v8, 0x30

    if-nez v28, :cond_18

    invoke-virtual {v13, v0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v28

    if-eqz v28, :cond_17

    move/from16 v21, v22

    :cond_17
    or-int v19, v19, v21

    :cond_18
    and-int/lit16 v9, v8, 0x180

    if-nez v9, :cond_1a

    invoke-virtual {v13, v14}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_19

    move/from16 v20, v23

    :cond_19
    or-int v19, v19, v20

    :cond_1a
    and-int/lit16 v9, v8, 0xc00

    if-nez v9, :cond_1c

    invoke-virtual {v13, v12}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_1b

    const/16 v24, 0x800

    :cond_1b
    or-int v19, v19, v24

    :cond_1c
    move/from16 v9, v19

    const v19, 0x12492493

    and-int v8, v27, v19

    const v11, 0x12492492

    if-ne v8, v11, :cond_1e

    and-int/lit16 v8, v9, 0x493

    const/16 v11, 0x492

    if-eq v8, v11, :cond_1d

    goto :goto_f

    :cond_1d
    const/4 v8, 0x0

    goto :goto_10

    :cond_1e
    :goto_f
    const/4 v8, 0x1

    :goto_10
    and-int/lit8 v11, v27, 0x1

    invoke-virtual {v13, v11, v8}, Lp1/q;->U(IZ)Z

    move-result v8

    if-eqz v8, :cond_4e

    invoke-static {v13}, Lm1/l0;->d(Landroidx/compose/runtime/Composer;)F

    move-result v8

    const/high16 v11, 0xe000000

    and-int v11, v27, v11

    const/high16 v15, 0x4000000

    if-ne v11, v15, :cond_1f

    const/4 v11, 0x1

    goto :goto_11

    :cond_1f
    const/4 v11, 0x0

    :goto_11
    const/high16 v15, 0x70000000

    and-int v15, v27, v15

    move/from16 v19, v11

    const/high16 v11, 0x20000000

    if-ne v15, v11, :cond_20

    const/4 v11, 0x1

    goto :goto_12

    :cond_20
    const/4 v11, 0x0

    :goto_12
    or-int v11, v19, v11

    and-int/lit8 v15, v9, 0xe

    move/from16 v19, v11

    const/4 v11, 0x4

    if-eq v15, v11, :cond_22

    and-int/lit8 v18, v9, 0x8

    if-eqz v18, :cond_21

    invoke-virtual {v13, v10}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v18

    if-eqz v18, :cond_21

    goto :goto_13

    :cond_21
    const/16 v18, 0x0

    goto :goto_14

    :cond_22
    :goto_13
    const/16 v18, 0x1

    :goto_14
    or-int v18, v19, v18

    and-int/lit16 v11, v9, 0x1c00

    move/from16 v20, v9

    const/16 v9, 0x800

    if-ne v11, v9, :cond_23

    const/4 v9, 0x1

    goto :goto_15

    :cond_23
    const/4 v9, 0x0

    :goto_15
    or-int v9, v18, v9

    invoke-virtual {v13, v8}, Lp1/q;->d(F)Z

    move-result v11

    or-int/2addr v9, v11

    invoke-virtual {v13}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v11

    sget-object v14, Lp1/l;->a:Lp1/v0;

    if-nez v9, :cond_24

    if-ne v11, v14, :cond_25

    :cond_24
    move-object v9, v13

    move v13, v8

    goto :goto_16

    :cond_25
    move-object v2, v13

    move-object/from16 p13, v14

    move-object/from16 v1, v16

    move-object/from16 v3, v17

    move/from16 v16, v20

    move-object/from16 v14, v25

    move/from16 v25, v15

    const/4 v15, 0x2

    goto :goto_17

    :goto_16
    new-instance v8, Ll1/m4;

    move-object v2, v9

    move-object v11, v10

    move-object/from16 p13, v14

    move-object/from16 v1, v16

    move-object/from16 v3, v17

    move/from16 v16, v20

    move-object/from16 v14, v25

    move/from16 v9, p7

    move-object/from16 v10, p8

    move/from16 v25, v15

    const/4 v15, 0x2

    invoke-direct/range {v8 .. v13}, Ll1/m4;-><init>(ZLl1/k4;Lm1/k0;Ll0/k1;F)V

    invoke-virtual {v2, v8}, Lp1/q;->p0(Ljava/lang/Object;)V

    move-object v11, v8

    :goto_17
    check-cast v11, Ll1/m4;

    sget-object v8, Lb3/v1;->n:Lp1/u2;

    invoke-virtual {v2, v8}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ly3/m;

    iget-wide v9, v2, Lp1/q;->T:J

    invoke-static {v9, v10}, Ljava/lang/Long;->hashCode(J)I

    move-result v9

    invoke-virtual {v2}, Lp1/q;->m()Lp1/p1;

    move-result-object v10

    invoke-static {v2, v14}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v13

    sget-object v17, La3/l;->a:La3/k;

    invoke-virtual/range {v17 .. v17}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v15, La3/k;->b:La3/j;

    invoke-virtual {v2}, Lp1/q;->i0()V

    iget-boolean v7, v2, Lp1/q;->S:Z

    if-eqz v7, :cond_26

    invoke-virtual {v2, v15}, Lp1/q;->l(Lc93/a;)V

    goto :goto_18

    :cond_26
    invoke-virtual {v2}, Lp1/q;->s0()V

    :goto_18
    sget-object v7, La3/k;->g:La3/i;

    invoke-static {v2, v7, v11}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v11, La3/k;->f:La3/i;

    invoke-static {v2, v11, v10}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v10, La3/k;->j:La3/i;

    iget-boolean v6, v2, Lp1/q;->S:Z

    if-nez v6, :cond_27

    invoke-virtual {v2}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v6

    move-object/from16 v26, v3

    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-static {v6, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_28

    goto :goto_19

    :cond_27
    move-object/from16 v26, v3

    :goto_19
    invoke-static {v9, v2, v9, v10}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_28
    sget-object v3, La3/k;->d:La3/i;

    invoke-static {v2, v3, v13}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    shr-int/lit8 v6, v16, 0x3

    and-int/lit8 v6, v6, 0xe

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-virtual {v0, v2, v6}, Lx1/b;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    if-eqz v4, :cond_2c

    const v6, -0x5623b6a6

    invoke-virtual {v2, v6}, Lp1/q;->e0(I)V

    const-string v6, "Leading"

    invoke-static {v14, v6}, Landroidx/compose/ui/layout/a;->c(Landroidx/compose/ui/Modifier;Ljava/lang/String;)Landroidx/compose/ui/Modifier;

    move-result-object v6

    sget-object v9, Ll1/w1;->a:Ly2/m;

    sget-object v9, Landroidx/compose/material3/MinimumInteractiveModifier;->w:Landroidx/compose/material3/MinimumInteractiveModifier;

    invoke-interface {v6, v9}, Landroidx/compose/ui/Modifier;->e(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v6

    const/4 v9, 0x0

    invoke-static {v1, v9}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v13

    move-object/from16 v17, v8

    iget-wide v8, v2, Lp1/q;->T:J

    invoke-static {v8, v9}, Ljava/lang/Long;->hashCode(J)I

    move-result v8

    invoke-virtual {v2}, Lp1/q;->m()Lp1/p1;

    move-result-object v9

    invoke-static {v2, v6}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v6

    invoke-virtual {v2}, Lp1/q;->i0()V

    iget-boolean v0, v2, Lp1/q;->S:Z

    if-eqz v0, :cond_29

    invoke-virtual {v2, v15}, Lp1/q;->l(Lc93/a;)V

    goto :goto_1a

    :cond_29
    invoke-virtual {v2}, Lp1/q;->s0()V

    :goto_1a
    invoke-static {v2, v7, v13}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v2, v11, v9}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v0, v2, Lp1/q;->S:Z

    if-nez v0, :cond_2a

    invoke-virtual {v2}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v0

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    invoke-static {v0, v9}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2b

    :cond_2a
    invoke-static {v8, v2, v8, v10}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_2b
    invoke-static {v2, v3, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    shr-int/lit8 v0, v27, 0xc

    and-int/lit8 v0, v0, 0xe

    const/4 v6, 0x1

    const/4 v9, 0x0

    invoke-static {v0, v4, v2, v6, v9}, Ldc/b;->A(ILc93/m;Lp1/q;ZZ)V

    goto :goto_1b

    :cond_2c
    move-object/from16 v17, v8

    const/4 v9, 0x0

    const v0, -0x561ff5a6

    invoke-virtual {v2, v0}, Lp1/q;->e0(I)V

    invoke-virtual {v2, v9}, Lp1/q;->q(Z)V

    :goto_1b
    if-eqz v5, :cond_30

    const v0, -0x561f4ec8

    invoke-virtual {v2, v0}, Lp1/q;->e0(I)V

    const-string v0, "Trailing"

    invoke-static {v14, v0}, Landroidx/compose/ui/layout/a;->c(Landroidx/compose/ui/Modifier;Ljava/lang/String;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    sget-object v6, Ll1/w1;->a:Ly2/m;

    sget-object v6, Landroidx/compose/material3/MinimumInteractiveModifier;->w:Landroidx/compose/material3/MinimumInteractiveModifier;

    invoke-interface {v0, v6}, Landroidx/compose/ui/Modifier;->e(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    invoke-static {v1, v9}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v1

    iget-wide v8, v2, Lp1/q;->T:J

    invoke-static {v8, v9}, Ljava/lang/Long;->hashCode(J)I

    move-result v6

    invoke-virtual {v2}, Lp1/q;->m()Lp1/p1;

    move-result-object v8

    invoke-static {v2, v0}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    invoke-virtual {v2}, Lp1/q;->i0()V

    iget-boolean v9, v2, Lp1/q;->S:Z

    if-eqz v9, :cond_2d

    invoke-virtual {v2, v15}, Lp1/q;->l(Lc93/a;)V

    goto :goto_1c

    :cond_2d
    invoke-virtual {v2}, Lp1/q;->s0()V

    :goto_1c
    invoke-static {v2, v7, v1}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v2, v11, v8}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v1, v2, Lp1/q;->S:Z

    if-nez v1, :cond_2e

    invoke-virtual {v2}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    invoke-static {v1, v8}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_2f

    :cond_2e
    invoke-static {v6, v2, v6, v10}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_2f
    invoke-static {v2, v3, v0}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    shr-int/lit8 v0, v27, 0xf

    and-int/lit8 v0, v0, 0xe

    const/4 v6, 0x1

    const/4 v9, 0x0

    invoke-static {v0, v5, v2, v6, v9}, Ldc/b;->A(ILc93/m;Lp1/q;ZZ)V

    :goto_1d
    move-object/from16 v8, v17

    goto :goto_1e

    :cond_30
    const v0, -0x561b8646

    invoke-virtual {v2, v0}, Lp1/q;->e0(I)V

    invoke-virtual {v2, v9}, Lp1/q;->q(Z)V

    goto :goto_1d

    :goto_1e
    invoke-static {v12, v8}, Landroidx/compose/foundation/layout/a;->i(Ll0/k1;Ly3/m;)F

    move-result v0

    invoke-static {v12, v8}, Landroidx/compose/foundation/layout/a;->h(Ll0/k1;Ly3/m;)F

    move-result v1

    invoke-static {v2}, Lm1/l0;->e(Landroidx/compose/runtime/Composer;)F

    move-result v6

    if-eqz v4, :cond_31

    sub-float/2addr v0, v6

    int-to-float v8, v9

    cmpg-float v13, v0, v8

    if-gez v13, :cond_31

    move v0, v8

    :cond_31
    move/from16 v18, v0

    if-eqz v5, :cond_32

    sub-float/2addr v1, v6

    int-to-float v0, v9

    cmpg-float v6, v1, v0

    if-gez v6, :cond_32

    move v1, v0

    :cond_32
    move/from16 v32, v1

    const/4 v0, 0x0

    const/4 v1, 0x3

    const/4 v6, 0x0

    if-eqz p5, :cond_36

    const v8, -0x560fad7b

    invoke-virtual {v2, v8}, Lp1/q;->e0(I)V

    const-string v8, "Prefix"

    invoke-static {v14, v8}, Landroidx/compose/ui/layout/a;->c(Landroidx/compose/ui/Modifier;Ljava/lang/String;)Landroidx/compose/ui/Modifier;

    move-result-object v8

    sget v9, Lm1/l0;->d:F

    const/4 v13, 0x2

    invoke-static {v8, v9, v0, v13}, Landroidx/compose/foundation/layout/d;->j(Landroidx/compose/ui/Modifier;FFI)Landroidx/compose/ui/Modifier;

    move-result-object v8

    invoke-static {v8, v6, v1}, Landroidx/compose/foundation/layout/d;->x(Landroidx/compose/ui/Modifier;Lb2/l;I)Landroidx/compose/ui/Modifier;

    move-result-object v17

    sget v20, Lm1/l0;->c:F

    const/16 v21, 0x0

    const/16 v22, 0xa

    const/16 v19, 0x0

    invoke-static/range {v17 .. v22}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v8

    move-object/from16 v9, v26

    const/4 v13, 0x0

    invoke-static {v9, v13}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v1

    move-object/from16 v17, v1

    iget-wide v0, v2, Lp1/q;->T:J

    invoke-static {v0, v1}, Ljava/lang/Long;->hashCode(J)I

    move-result v0

    invoke-virtual {v2}, Lp1/q;->m()Lp1/p1;

    move-result-object v1

    invoke-static {v2, v8}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v8

    invoke-virtual {v2}, Lp1/q;->i0()V

    iget-boolean v13, v2, Lp1/q;->S:Z

    if-eqz v13, :cond_33

    invoke-virtual {v2, v15}, Lp1/q;->l(Lc93/a;)V

    :goto_1f
    move-object/from16 v13, v17

    goto :goto_20

    :cond_33
    invoke-virtual {v2}, Lp1/q;->s0()V

    goto :goto_1f

    :goto_20
    invoke-static {v2, v7, v13}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v2, v11, v1}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v1, v2, Lp1/q;->S:Z

    if-nez v1, :cond_34

    invoke-virtual {v2}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v13

    invoke-static {v1, v13}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_35

    :cond_34
    invoke-static {v0, v2, v0, v10}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_35
    invoke-static {v2, v3, v8}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    shr-int/lit8 v0, v27, 0x12

    and-int/lit8 v0, v0, 0xe

    move-object/from16 v1, p5

    const/4 v8, 0x1

    const/4 v13, 0x0

    invoke-static {v0, v1, v2, v8, v13}, Ldc/b;->A(ILc93/m;Lp1/q;ZZ)V

    goto :goto_21

    :cond_36
    move-object/from16 v1, p5

    move-object/from16 v9, v26

    const/4 v13, 0x0

    const v0, -0x560aad66

    invoke-virtual {v2, v0}, Lp1/q;->e0(I)V

    invoke-virtual {v2, v13}, Lp1/q;->q(Z)V

    :goto_21
    if-eqz p6, :cond_3a

    const v0, -0x560a0479

    invoke-virtual {v2, v0}, Lp1/q;->e0(I)V

    const-string v0, "Suffix"

    invoke-static {v14, v0}, Landroidx/compose/ui/layout/a;->c(Landroidx/compose/ui/Modifier;Ljava/lang/String;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    sget v8, Lm1/l0;->d:F

    const/4 v1, 0x2

    const/4 v13, 0x0

    invoke-static {v0, v8, v13, v1}, Landroidx/compose/foundation/layout/d;->j(Landroidx/compose/ui/Modifier;FFI)Landroidx/compose/ui/Modifier;

    move-result-object v0

    const/4 v1, 0x3

    invoke-static {v0, v6, v1}, Landroidx/compose/foundation/layout/d;->x(Landroidx/compose/ui/Modifier;Lb2/l;I)Landroidx/compose/ui/Modifier;

    move-result-object v29

    sget v30, Lm1/l0;->c:F

    const/16 v33, 0x0

    const/16 v34, 0xa

    const/16 v31, 0x0

    invoke-static/range {v29 .. v34}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v0

    const/4 v1, 0x0

    invoke-static {v9, v1}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v8

    move-object/from16 v17, v14

    iget-wide v13, v2, Lp1/q;->T:J

    invoke-static {v13, v14}, Ljava/lang/Long;->hashCode(J)I

    move-result v13

    invoke-virtual {v2}, Lp1/q;->m()Lp1/p1;

    move-result-object v14

    invoke-static {v2, v0}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    invoke-virtual {v2}, Lp1/q;->i0()V

    iget-boolean v1, v2, Lp1/q;->S:Z

    if-eqz v1, :cond_37

    invoke-virtual {v2, v15}, Lp1/q;->l(Lc93/a;)V

    goto :goto_22

    :cond_37
    invoke-virtual {v2}, Lp1/q;->s0()V

    :goto_22
    invoke-static {v2, v7, v8}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v2, v11, v14}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v1, v2, Lp1/q;->S:Z

    if-nez v1, :cond_38

    invoke-virtual {v2}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    invoke-static {v13}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    invoke-static {v1, v8}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_39

    :cond_38
    invoke-static {v13, v2, v13, v10}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_39
    invoke-static {v2, v3, v0}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    shr-int/lit8 v0, v27, 0x15

    and-int/lit8 v0, v0, 0xe

    move-object/from16 v1, p6

    const/4 v8, 0x1

    const/4 v13, 0x0

    invoke-static {v0, v1, v2, v8, v13}, Ldc/b;->A(ILc93/m;Lp1/q;ZZ)V

    goto :goto_23

    :cond_3a
    move-object/from16 v1, p6

    move-object/from16 v17, v14

    const/4 v13, 0x0

    const v0, -0x56050be6

    invoke-virtual {v2, v0}, Lp1/q;->e0(I)V

    invoke-virtual {v2, v13}, Lp1/q;->q(Z)V

    :goto_23
    const/16 v21, 0x0

    const/16 v22, 0xa

    const/16 v19, 0x0

    move/from16 v20, v32

    invoke-static/range {v17 .. v22}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v0

    move-object/from16 v14, v17

    if-eqz p1, :cond_43

    const v8, -0x55fd6b81

    invoke-virtual {v2, v8}, Lp1/q;->e0(I)V

    const-string v8, "Label"

    invoke-static {v14, v8}, Landroidx/compose/ui/layout/a;->c(Landroidx/compose/ui/Modifier;Ljava/lang/String;)Landroidx/compose/ui/Modifier;

    move-result-object v8

    move/from16 v13, v25

    const/4 v6, 0x4

    if-eq v13, v6, :cond_3d

    and-int/lit8 v6, v16, 0x8

    if-eqz v6, :cond_3b

    move-object/from16 v6, p9

    invoke-virtual {v2, v6}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v13

    if-eqz v13, :cond_3c

    goto :goto_24

    :cond_3b
    move-object/from16 v6, p9

    :cond_3c
    const/4 v13, 0x0

    goto :goto_25

    :cond_3d
    move-object/from16 v6, p9

    :goto_24
    const/4 v13, 0x1

    :goto_25
    invoke-virtual {v2}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    if-nez v13, :cond_3f

    move-object/from16 v13, p13

    if-ne v1, v13, :cond_3e

    goto :goto_26

    :cond_3e
    const/4 v13, 0x1

    goto :goto_27

    :cond_3f
    :goto_26
    new-instance v1, Ll1/u2;

    const/4 v13, 0x1

    invoke-direct {v1, v6, v13}, Ll1/u2;-><init>(Lm1/k0;I)V

    invoke-virtual {v2, v1}, Lp1/q;->p0(Ljava/lang/Object;)V

    :goto_27
    check-cast v1, Lc93/a;

    new-instance v4, Lfg2/l;

    invoke-direct {v4, v1, v13}, Lfg2/l;-><init>(Lc93/a;I)V

    invoke-static {v8, v4}, Landroidx/compose/ui/layout/a;->b(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function3;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    const/4 v4, 0x3

    const/4 v8, 0x0

    invoke-static {v1, v8, v4}, Landroidx/compose/foundation/layout/d;->x(Landroidx/compose/ui/Modifier;Lb2/l;I)Landroidx/compose/ui/Modifier;

    move-result-object v1

    invoke-interface {v1, v0}, Landroidx/compose/ui/Modifier;->e(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    const/4 v13, 0x0

    invoke-static {v9, v13}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v1

    iget-wide v4, v2, Lp1/q;->T:J

    invoke-static {v4, v5}, Ljava/lang/Long;->hashCode(J)I

    move-result v4

    invoke-virtual {v2}, Lp1/q;->m()Lp1/p1;

    move-result-object v5

    invoke-static {v2, v0}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    invoke-virtual {v2}, Lp1/q;->i0()V

    iget-boolean v8, v2, Lp1/q;->S:Z

    if-eqz v8, :cond_40

    invoke-virtual {v2, v15}, Lp1/q;->l(Lc93/a;)V

    goto :goto_28

    :cond_40
    invoke-virtual {v2}, Lp1/q;->s0()V

    :goto_28
    invoke-static {v2, v7, v1}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v2, v11, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v1, v2, Lp1/q;->S:Z

    if-nez v1, :cond_41

    invoke-virtual {v2}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-static {v1, v5}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_42

    :cond_41
    invoke-static {v4, v2, v4, v10}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_42
    invoke-static {v2, v3, v0}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    shr-int/lit8 v0, v27, 0x6

    and-int/lit8 v0, v0, 0xe

    move-object/from16 v1, p1

    const/4 v4, 0x0

    const/4 v8, 0x1

    invoke-static {v0, v1, v2, v8, v4}, Ldc/b;->A(ILc93/m;Lp1/q;ZZ)V

    goto :goto_29

    :cond_43
    move-object/from16 v1, p1

    move-object/from16 v6, p9

    const/4 v4, 0x0

    const v0, -0x55f764a6

    invoke-virtual {v2, v0}, Lp1/q;->e0(I)V

    invoke-virtual {v2, v4}, Lp1/q;->q(Z)V

    :goto_29
    sget v0, Lm1/l0;->d:F

    const/4 v5, 0x2

    const/4 v13, 0x0

    invoke-static {v14, v0, v13, v5}, Landroidx/compose/foundation/layout/d;->j(Landroidx/compose/ui/Modifier;FFI)Landroidx/compose/ui/Modifier;

    move-result-object v0

    const/4 v5, 0x3

    const/4 v8, 0x0

    invoke-static {v0, v8, v5}, Landroidx/compose/foundation/layout/d;->x(Landroidx/compose/ui/Modifier;Lb2/l;I)Landroidx/compose/ui/Modifier;

    move-result-object v33

    if-nez p5, :cond_44

    move/from16 v34, v18

    goto :goto_2a

    :cond_44
    int-to-float v0, v4

    move/from16 v34, v0

    :goto_2a
    if-nez p6, :cond_45

    move/from16 v36, v32

    goto :goto_2b

    :cond_45
    int-to-float v0, v4

    move/from16 v36, v0

    :goto_2b
    const/16 v37, 0x0

    const/16 v38, 0xa

    const/16 v35, 0x0

    invoke-static/range {v33 .. v38}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v0

    if-eqz p2, :cond_46

    const v4, -0x55f1bf65

    invoke-virtual {v2, v4}, Lp1/q;->e0(I)V

    const-string v4, "Hint"

    invoke-static {v14, v4}, Landroidx/compose/ui/layout/a;->c(Landroidx/compose/ui/Modifier;Ljava/lang/String;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    invoke-interface {v4, v0}, Landroidx/compose/ui/Modifier;->e(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    shr-int/lit8 v5, v27, 0x6

    and-int/lit8 v5, v5, 0x70

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    move-object/from16 v8, p2

    invoke-interface {v8, v4, v2, v5}, Lkotlin/jvm/functions/Function3;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    const/4 v4, 0x0

    invoke-virtual {v2, v4}, Lp1/q;->q(Z)V

    goto :goto_2c

    :cond_46
    move-object/from16 v8, p2

    const/4 v4, 0x0

    const v5, -0x55f05ac6

    invoke-virtual {v2, v5}, Lp1/q;->e0(I)V

    invoke-virtual {v2, v4}, Lp1/q;->q(Z)V

    :goto_2c
    const-string v4, "TextField"

    invoke-static {v14, v4}, Landroidx/compose/ui/layout/a;->c(Landroidx/compose/ui/Modifier;Ljava/lang/String;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    invoke-interface {v4, v0}, Landroidx/compose/ui/Modifier;->e(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    const/4 v4, 0x1

    invoke-static {v9, v4}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v5

    move-object/from16 v25, v14

    iget-wide v13, v2, Lp1/q;->T:J

    invoke-static {v13, v14}, Ljava/lang/Long;->hashCode(J)I

    move-result v4

    invoke-virtual {v2}, Lp1/q;->m()Lp1/p1;

    move-result-object v13

    invoke-static {v2, v0}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    invoke-virtual {v2}, Lp1/q;->i0()V

    iget-boolean v14, v2, Lp1/q;->S:Z

    if-eqz v14, :cond_47

    invoke-virtual {v2, v15}, Lp1/q;->l(Lc93/a;)V

    goto :goto_2d

    :cond_47
    invoke-virtual {v2}, Lp1/q;->s0()V

    :goto_2d
    invoke-static {v2, v7, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v2, v11, v13}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v5, v2, Lp1/q;->S:Z

    if-nez v5, :cond_48

    invoke-virtual {v2}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v13

    invoke-static {v5, v13}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_49

    :cond_48
    invoke-static {v4, v2, v4, v10}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_49
    invoke-static {v2, v3, v0}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const/4 v4, 0x3

    shr-int/lit8 v0, v27, 0x3

    and-int/lit8 v0, v0, 0xe

    const/4 v13, 0x1

    move-object/from16 v5, p0

    invoke-static {v0, v5, v2, v13}, Ldc/b;->z(ILc93/m;Lp1/q;Z)V

    if-eqz p11, :cond_4d

    const v0, -0x55ec8f7b

    invoke-virtual {v2, v0}, Lp1/q;->e0(I)V

    const-string v0, "Supporting"

    move-object/from16 v14, v25

    invoke-static {v14, v0}, Landroidx/compose/ui/layout/a;->c(Landroidx/compose/ui/Modifier;Ljava/lang/String;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    sget v13, Lm1/l0;->f:F

    const/4 v1, 0x2

    const/4 v14, 0x0

    invoke-static {v0, v13, v14, v1}, Landroidx/compose/foundation/layout/d;->j(Landroidx/compose/ui/Modifier;FFI)Landroidx/compose/ui/Modifier;

    move-result-object v0

    const/4 v1, 0x0

    invoke-static {v0, v1, v4}, Landroidx/compose/foundation/layout/d;->x(Landroidx/compose/ui/Modifier;Lb2/l;I)Landroidx/compose/ui/Modifier;

    move-result-object v0

    invoke-static {}, Ll1/h4;->d()Ll0/l1;

    move-result-object v1

    invoke-static {v1, v0}, Landroidx/compose/foundation/layout/a;->o(Ll0/k1;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    const/4 v13, 0x0

    invoke-static {v9, v13}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v1

    iget-wide v13, v2, Lp1/q;->T:J

    invoke-static {v13, v14}, Ljava/lang/Long;->hashCode(J)I

    move-result v4

    invoke-virtual {v2}, Lp1/q;->m()Lp1/p1;

    move-result-object v9

    invoke-static {v2, v0}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    invoke-virtual {v2}, Lp1/q;->i0()V

    iget-boolean v13, v2, Lp1/q;->S:Z

    if-eqz v13, :cond_4a

    invoke-virtual {v2, v15}, Lp1/q;->l(Lc93/a;)V

    goto :goto_2e

    :cond_4a
    invoke-virtual {v2}, Lp1/q;->s0()V

    :goto_2e
    invoke-static {v2, v7, v1}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v2, v11, v9}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v1, v2, Lp1/q;->S:Z

    if-nez v1, :cond_4b

    invoke-virtual {v2}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-static {v1, v7}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_4c

    :cond_4b
    invoke-static {v4, v2, v4, v10}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_4c
    invoke-static {v2, v3, v0}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    shr-int/lit8 v0, v16, 0x6

    and-int/lit8 v0, v0, 0xe

    move-object/from16 v14, p11

    const/4 v9, 0x0

    const/4 v13, 0x1

    invoke-static {v0, v14, v2, v13, v9}, Ldc/b;->A(ILc93/m;Lp1/q;ZZ)V

    goto :goto_2f

    :cond_4d
    move-object/from16 v14, p11

    const/4 v9, 0x0

    const/4 v13, 0x1

    const v0, -0x55e69f26

    invoke-virtual {v2, v0}, Lp1/q;->e0(I)V

    invoke-virtual {v2, v9}, Lp1/q;->q(Z)V

    :goto_2f
    invoke-virtual {v2, v13}, Lp1/q;->q(Z)V

    goto :goto_30

    :cond_4e
    move-object v5, v1

    move-object v8, v3

    move-object v6, v10

    move-object v2, v13

    invoke-virtual {v2}, Lp1/q;->X()V

    :goto_30
    invoke-virtual {v2}, Lp1/q;->u()Lp1/v1;

    move-result-object v0

    if-eqz v0, :cond_4f

    move-object v1, v0

    new-instance v0, Ll1/i4;

    move-object/from16 v2, p1

    move-object/from16 v4, p3

    move-object/from16 v7, p6

    move-object/from16 v9, p8

    move-object/from16 v11, p10

    move/from16 v15, p15

    move-object/from16 v39, v1

    move-object v1, v5

    move-object v10, v6

    move-object v3, v8

    move-object v13, v12

    move-object v12, v14

    move-object/from16 v5, p4

    move-object/from16 v6, p5

    move/from16 v8, p7

    move/from16 v14, p14

    invoke-direct/range {v0 .. v15}, Ll1/i4;-><init>(Lc93/m;Lc93/m;Lkotlin/jvm/functions/Function3;Lc93/m;Lc93/m;Lc93/m;Lc93/m;ZLl1/k4;Lm1/k0;Lx1/b;Lc93/m;Ll0/k1;II)V

    move-object/from16 v1, v39

    iput-object v0, v1, Lp1/v1;->d:Lc93/m;

    :cond_4f
    return-void
.end method
