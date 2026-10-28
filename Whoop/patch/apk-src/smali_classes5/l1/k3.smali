.class public abstract Ll1/k3;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lk1/b;


# direct methods
.method static constructor <clinit>()V
    .locals 4

    new-instance v0, Lk1/b;

    const v1, 0x3dcccccd    # 0.1f

    const v2, 0x3da3d70a    # 0.08f

    const v3, 0x3e23d70a    # 0.16f

    invoke-direct {v0, v3, v1, v2, v1}, Lk1/b;-><init>(FFFF)V

    sput-object v0, Ll1/k3;->a:Lk1/b;

    return-void
.end method

.method public static final a(Lc93/a;Landroidx/compose/ui/Modifier;ZLi2/a1;Ll1/f;Ll1/h;Lf0/t;Ll0/k1;Lx1/b;Landroidx/compose/runtime/Composer;II)V
    .locals 25

    move-object/from16 v2, p1

    move/from16 v6, p2

    move-object/from16 v0, p4

    move/from16 v1, p10

    move/from16 v15, p11

    move-object/from16 v11, p9

    check-cast v11, Lp1/q;

    const v3, -0x4e1540b0

    invoke-virtual {v11, v3}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v3, v1, 0x6

    move-object/from16 v12, p0

    if-nez v3, :cond_1

    invoke-virtual {v11, v12}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    const/4 v3, 0x4

    goto :goto_0

    :cond_0
    const/4 v3, 0x2

    :goto_0
    or-int/2addr v3, v1

    goto :goto_1

    :cond_1
    move v3, v1

    :goto_1
    and-int/lit8 v5, v1, 0x30

    if-nez v5, :cond_3

    invoke-virtual {v11, v2}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_2

    const/16 v5, 0x20

    goto :goto_2

    :cond_2
    const/16 v5, 0x10

    :goto_2
    or-int/2addr v3, v5

    :cond_3
    and-int/lit16 v5, v1, 0x180

    if-nez v5, :cond_5

    invoke-virtual {v11, v6}, Lp1/q;->h(Z)Z

    move-result v5

    if-eqz v5, :cond_4

    const/16 v5, 0x100

    goto :goto_3

    :cond_4
    const/16 v5, 0x80

    :goto_3
    or-int/2addr v3, v5

    :cond_5
    and-int/lit16 v5, v1, 0xc00

    move-object/from16 v13, p3

    if-nez v5, :cond_7

    invoke-virtual {v11, v13}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_6

    const/16 v5, 0x800

    goto :goto_4

    :cond_6
    const/16 v5, 0x400

    :goto_4
    or-int/2addr v3, v5

    :cond_7
    and-int/lit16 v5, v1, 0x6000

    if-nez v5, :cond_9

    invoke-virtual {v11, v0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_8

    const/16 v5, 0x4000

    goto :goto_5

    :cond_8
    const/16 v5, 0x2000

    :goto_5
    or-int/2addr v3, v5

    :cond_9
    const/high16 v5, 0x30000

    and-int/2addr v5, v1

    if-nez v5, :cond_c

    and-int/lit8 v5, v15, 0x20

    if-nez v5, :cond_a

    move-object/from16 v5, p5

    invoke-virtual {v11, v5}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_b

    const/high16 v8, 0x20000

    goto :goto_6

    :cond_a
    move-object/from16 v5, p5

    :cond_b
    const/high16 v8, 0x10000

    :goto_6
    or-int/2addr v3, v8

    goto :goto_7

    :cond_c
    move-object/from16 v5, p5

    :goto_7
    const/high16 v8, 0x180000

    and-int/2addr v8, v1

    move-object/from16 v14, p6

    if-nez v8, :cond_e

    invoke-virtual {v11, v14}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_d

    const/high16 v8, 0x100000

    goto :goto_8

    :cond_d
    const/high16 v8, 0x80000

    :goto_8
    or-int/2addr v3, v8

    :cond_e
    const/high16 v8, 0xc00000

    and-int/2addr v8, v1

    if-nez v8, :cond_10

    move-object/from16 v8, p7

    invoke-virtual {v11, v8}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_f

    const/high16 v9, 0x800000

    goto :goto_9

    :cond_f
    const/high16 v9, 0x400000

    :goto_9
    or-int/2addr v3, v9

    goto :goto_a

    :cond_10
    move-object/from16 v8, p7

    :goto_a
    and-int/lit16 v9, v15, 0x100

    const/4 v10, 0x0

    const/high16 v16, 0x6000000

    if-eqz v9, :cond_11

    or-int v3, v3, v16

    goto :goto_c

    :cond_11
    and-int v9, v1, v16

    if-nez v9, :cond_13

    invoke-virtual {v11, v10}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_12

    const/high16 v9, 0x4000000

    goto :goto_b

    :cond_12
    const/high16 v9, 0x2000000

    :goto_b
    or-int/2addr v3, v9

    :cond_13
    :goto_c
    const/high16 v9, 0x30000000

    and-int/2addr v9, v1

    if-nez v9, :cond_15

    move-object/from16 v9, p8

    invoke-virtual {v11, v9}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v16

    if-eqz v16, :cond_14

    const/high16 v16, 0x20000000

    goto :goto_d

    :cond_14
    const/high16 v16, 0x10000000

    :goto_d
    or-int v3, v3, v16

    goto :goto_e

    :cond_15
    move-object/from16 v9, p8

    :goto_e
    const v16, 0x12492493

    and-int v7, v3, v16

    const v4, 0x12492492

    const/4 v9, 0x0

    const/16 v17, 0x1

    if-eq v7, v4, :cond_16

    move/from16 v4, v17

    goto :goto_f

    :cond_16
    move v4, v9

    :goto_f
    and-int/lit8 v7, v3, 0x1

    invoke-virtual {v11, v7, v4}, Lp1/q;->U(IZ)Z

    move-result v4

    if-eqz v4, :cond_32

    invoke-virtual {v11}, Lp1/q;->Z()V

    and-int/lit8 v4, v1, 0x1

    const v7, -0x70001

    if-eqz v4, :cond_19

    invoke-virtual {v11}, Lp1/q;->C()Z

    move-result v4

    if-eqz v4, :cond_17

    goto :goto_11

    :cond_17
    invoke-virtual {v11}, Lp1/q;->X()V

    and-int/lit8 v4, v15, 0x20

    if-eqz v4, :cond_18

    and-int/2addr v3, v7

    :cond_18
    :goto_10
    move-object v7, v5

    goto :goto_12

    :cond_19
    :goto_11
    and-int/lit8 v4, v15, 0x20

    if-eqz v4, :cond_18

    sget-object v4, Ll1/g;->a:Ll0/l1;

    sget v19, Lo1/k;->b:F

    sget v20, Lo1/k;->k:F

    sget v21, Lo1/k;->h:F

    sget v22, Lo1/k;->i:F

    sget v23, Lo1/k;->d:F

    new-instance v18, Ll1/h;

    invoke-direct/range {v18 .. v23}, Ll1/h;-><init>(FFFFF)V

    and-int/2addr v3, v7

    move-object/from16 v5, v18

    goto :goto_10

    :goto_12
    invoke-virtual {v11}, Lp1/q;->r()V

    const v4, 0x64d5e04b

    invoke-virtual {v11, v4}, Lp1/q;->e0(I)V

    invoke-virtual {v11}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    sget-object v5, Lp1/l;->a:Lp1/v0;

    if-ne v4, v5, :cond_1a

    invoke-static {v11}, Ld;->g(Lp1/q;)Lj0/j;

    move-result-object v4

    :cond_1a
    check-cast v4, Lj0/i;

    invoke-virtual {v11, v9}, Lp1/q;->q(Z)V

    if-eqz v6, :cond_1b

    iget-wide v9, v0, Ll1/f;->a:J

    :goto_13
    move-wide/from16 v22, v9

    goto :goto_14

    :cond_1b
    iget-wide v9, v0, Ll1/f;->c:J

    goto :goto_13

    :goto_14
    if-eqz v6, :cond_1c

    iget-wide v9, v0, Ll1/f;->b:J

    :goto_15
    move-wide/from16 v20, v9

    goto :goto_16

    :cond_1c
    iget-wide v9, v0, Ll1/f;->d:J

    goto :goto_15

    :goto_16
    if-nez v7, :cond_1d

    const v3, 0x64d8ada6

    invoke-virtual {v11, v3}, Lp1/q;->e0(I)V

    const/4 v9, 0x0

    invoke-virtual {v11, v9}, Lp1/q;->q(Z)V

    move-object/from16 p5, v4

    move-object v1, v5

    move-object/from16 v24, v7

    move v0, v9

    const/4 v10, 0x0

    goto/16 :goto_1d

    :cond_1d
    const/4 v9, 0x0

    const v10, -0x1dc77645

    invoke-virtual {v11, v10}, Lp1/q;->e0(I)V

    shr-int/lit8 v10, v3, 0x6

    and-int/lit8 v10, v10, 0xe

    shr-int/lit8 v3, v3, 0x9

    and-int/lit16 v3, v3, 0x380

    or-int/2addr v3, v10

    invoke-virtual {v11}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v10

    if-ne v10, v5, :cond_1e

    new-instance v10, Lz1/p;

    invoke-direct {v10}, Lz1/p;-><init>()V

    invoke-virtual {v11, v10}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_1e
    check-cast v10, Lz1/p;

    invoke-virtual {v11, v4}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v19

    invoke-virtual {v11}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v9

    if-nez v19, :cond_1f

    if-ne v9, v5, :cond_20

    :cond_1f
    new-instance v9, Lg1/o1;

    const/4 v0, 0x3

    const/4 v1, 0x0

    invoke-direct {v9, v4, v10, v1, v0}, Lg1/o1;-><init>(Lj0/i;Lz1/p;Lq83/d;I)V

    invoke-virtual {v11, v9}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_20
    check-cast v9, Lc93/m;

    invoke-static {v11, v9, v4}, Lp1/x;->g(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v10}, Lm83/s;->R0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lj0/h;

    if-nez v6, :cond_21

    iget v1, v7, Ll1/h;->e:F

    goto :goto_17

    :cond_21
    instance-of v1, v0, Lj0/l;

    if-eqz v1, :cond_22

    iget v1, v7, Ll1/h;->b:F

    goto :goto_17

    :cond_22
    instance-of v1, v0, Lj0/f;

    if-eqz v1, :cond_23

    iget v1, v7, Ll1/h;->d:F

    goto :goto_17

    :cond_23
    instance-of v1, v0, Lj0/d;

    if-eqz v1, :cond_24

    iget v1, v7, Ll1/h;->c:F

    goto :goto_17

    :cond_24
    iget v1, v7, Ll1/h;->a:F

    :goto_17
    invoke-virtual {v11}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v9

    if-ne v9, v5, :cond_25

    new-instance v9, Ld0/e;

    new-instance v10, Ly3/f;

    invoke-direct {v10, v1}, Ly3/f;-><init>(F)V

    move-object/from16 v19, v4

    sget-object v4, Ld0/f;->k:Ld0/f2;

    const/16 v8, 0xc

    const/4 v12, 0x0

    invoke-direct {v9, v10, v4, v12, v8}, Ld0/e;-><init>(Ljava/lang/Object;Ld0/f2;Ljava/lang/Object;I)V

    invoke-virtual {v11, v9}, Lp1/q;->p0(Ljava/lang/Object;)V

    goto :goto_18

    :cond_25
    move-object/from16 v19, v4

    :goto_18
    move-object v4, v9

    check-cast v4, Ld0/e;

    new-instance v12, Ly3/f;

    invoke-direct {v12, v1}, Ly3/f;-><init>(F)V

    invoke-virtual {v11, v4}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v8

    invoke-virtual {v11, v1}, Lp1/q;->d(F)Z

    move-result v9

    or-int/2addr v8, v9

    and-int/lit8 v9, v3, 0xe

    xor-int/lit8 v9, v9, 0x6

    const/4 v10, 0x4

    if-le v9, v10, :cond_26

    invoke-virtual {v11, v6}, Lp1/q;->h(Z)Z

    move-result v9

    if-nez v9, :cond_27

    :cond_26
    and-int/lit8 v9, v3, 0x6

    if-ne v9, v10, :cond_28

    :cond_27
    move/from16 v9, v17

    goto :goto_19

    :cond_28
    const/4 v9, 0x0

    :goto_19
    or-int/2addr v8, v9

    and-int/lit16 v9, v3, 0x380

    xor-int/lit16 v9, v9, 0x180

    const/16 v10, 0x100

    if-le v9, v10, :cond_29

    invoke-virtual {v11, v7}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v9

    if-nez v9, :cond_2b

    :cond_29
    and-int/lit16 v3, v3, 0x180

    if-ne v3, v10, :cond_2a

    goto :goto_1a

    :cond_2a
    const/16 v17, 0x0

    :cond_2b
    :goto_1a
    or-int v3, v8, v17

    invoke-virtual {v11, v0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v8

    or-int/2addr v3, v8

    invoke-virtual {v11}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v8

    if-nez v3, :cond_2d

    if-ne v8, v5, :cond_2c

    goto :goto_1b

    :cond_2c
    move-object v1, v5

    move-object/from16 v24, v7

    move-object/from16 p5, v19

    const/4 v0, 0x0

    goto :goto_1c

    :cond_2d
    :goto_1b
    new-instance v3, Lg1/p1;

    const/4 v9, 0x0

    const/4 v10, 0x1

    move-object/from16 p5, v5

    move v5, v1

    move-object/from16 v1, p5

    move-object v8, v0

    move-object/from16 p5, v19

    const/4 v0, 0x0

    invoke-direct/range {v3 .. v10}, Lg1/p1;-><init>(Ld0/e;FZLjava/lang/Object;Lj0/h;Lq83/d;I)V

    move-object/from16 v24, v7

    invoke-virtual {v11, v3}, Lp1/q;->p0(Ljava/lang/Object;)V

    move-object v8, v3

    :goto_1c
    check-cast v8, Lc93/m;

    invoke-static {v11, v8, v12}, Lp1/x;->g(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-object v10, v4, Ld0/e;->c:Ld0/m;

    invoke-virtual {v11, v0}, Lp1/q;->q(Z)V

    :goto_1d
    if-eqz v10, :cond_2e

    iget-object v3, v10, Ld0/m;->x:Lp1/k1;

    invoke-virtual {v3}, Lp1/k1;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ly3/f;

    iget v3, v3, Ly3/f;->w:F

    :goto_1e
    move v5, v3

    goto :goto_1f

    :cond_2e
    int-to-float v3, v0

    goto :goto_1e

    :goto_1f
    invoke-virtual {v11}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    if-ne v3, v1, :cond_2f

    new-instance v3, Lkx1/b;

    const/16 v4, 0x8

    invoke-direct {v3, v4}, Lkx1/b;-><init>(I)V

    invoke-virtual {v11, v3}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_2f
    check-cast v3, Lkotlin/jvm/functions/Function1;

    invoke-static {v2, v0, v3}, Li3/n;->c(Landroidx/compose/ui/Modifier;ZLkotlin/jvm/functions/Function1;)Landroidx/compose/ui/Modifier;

    move-result-object v8

    new-instance v16, Lg1/r6;

    move-wide/from16 v18, v20

    const/16 v21, 0x1

    move-object/from16 v17, p7

    move-object/from16 v20, p8

    invoke-direct/range {v16 .. v21}, Lg1/r6;-><init>(Ljava/lang/Object;JLjava/lang/Object;I)V

    move-object/from16 v3, v16

    move-wide/from16 v9, v18

    const v4, -0x1fed37a5

    invoke-static {v4, v11, v3}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v3

    sget-object v4, Ll1/c4;->a:Lp1/b0;

    int-to-float v4, v0

    if-nez p5, :cond_31

    const v6, -0x6563c494

    invoke-virtual {v11, v6}, Lp1/q;->e0(I)V

    invoke-virtual {v11}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v6

    if-ne v6, v1, :cond_30

    invoke-static {v11}, Ld;->g(Lp1/q;)Lj0/j;

    move-result-object v6

    :cond_30
    move-object v1, v6

    check-cast v1, Lj0/i;

    invoke-virtual {v11, v0}, Lp1/q;->q(Z)V

    move-object v12, v1

    goto :goto_20

    :cond_31
    const v1, 0x7899accb

    invoke-virtual {v11, v1}, Lp1/q;->e0(I)V

    invoke-virtual {v11, v0}, Lp1/q;->q(Z)V

    move-object/from16 v12, p5

    :goto_20
    sget-object v0, Ll1/c4;->a:Lp1/b0;

    invoke-virtual {v11, v0}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ly3/f;

    iget v1, v1, Ly3/f;->w:F

    add-float/2addr v4, v1

    sget-object v1, Ll1/s;->a:Lp1/b0;

    new-instance v6, Li2/x;

    invoke-direct {v6, v9, v10}, Li2/x;-><init>(J)V

    invoke-virtual {v1, v6}, Lp1/b0;->a(Ljava/lang/Object;)Lp1/u1;

    move-result-object v1

    new-instance v6, Ly3/f;

    invoke-direct {v6, v4}, Ly3/f;-><init>(F)V

    invoke-virtual {v0, v6}, Lp1/b0;->a(Ljava/lang/Object;)Lp1/u1;

    move-result-object v0

    filled-new-array {v1, v0}, [Lp1/u1;

    move-result-object v0

    move-object v13, v3

    new-instance v3, Ll1/a4;

    move-object/from16 v9, p0

    move-object v1, v11

    move-object v10, v14

    move-wide/from16 v6, v22

    move/from16 v14, p2

    move-object/from16 v11, p3

    invoke-direct/range {v3 .. v14}, Ll1/a4;-><init>(FFJLandroidx/compose/ui/Modifier;Lc93/a;Lf0/t;Li2/a1;Lj0/i;Lx1/b;Z)V

    const v4, 0x329de4cf

    invoke-static {v4, v1, v3}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v3

    const/16 v4, 0x38

    invoke-static {v0, v3, v1, v4}, Lp1/x;->b([Lp1/u1;Lc93/m;Landroidx/compose/runtime/Composer;I)V

    move-object/from16 v6, v24

    goto :goto_21

    :cond_32
    move-object v1, v11

    invoke-virtual {v1}, Lp1/q;->X()V

    move-object v6, v5

    :goto_21
    invoke-virtual {v1}, Lp1/q;->u()Lp1/v1;

    move-result-object v12

    if-eqz v12, :cond_33

    new-instance v0, Ll1/i;

    move-object/from16 v1, p0

    move/from16 v3, p2

    move-object/from16 v4, p3

    move-object/from16 v5, p4

    move-object/from16 v7, p6

    move-object/from16 v8, p7

    move-object/from16 v9, p8

    move/from16 v10, p10

    move v11, v15

    invoke-direct/range {v0 .. v11}, Ll1/i;-><init>(Lc93/a;Landroidx/compose/ui/Modifier;ZLi2/a1;Ll1/f;Ll1/h;Lf0/t;Ll0/k1;Lx1/b;II)V

    iput-object v0, v12, Lp1/v1;->d:Lc93/m;

    :cond_33
    return-void
.end method

.method public static final b(Landroidx/compose/ui/Modifier;Li2/a1;Ll1/k;Ll1/l;Lf0/t;Lx1/b;Landroidx/compose/runtime/Composer;I)V
    .locals 17

    move-object/from16 v3, p2

    move-object/from16 v14, p6

    check-cast v14, Lp1/q;

    const v0, 0x510b47de

    invoke-virtual {v14, v0}, Lp1/q;->g0(I)Lp1/q;

    move-object/from16 v2, p1

    invoke-virtual {v14, v2}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/16 v0, 0x20

    goto :goto_0

    :cond_0
    const/16 v0, 0x10

    :goto_0
    or-int v0, p7, v0

    invoke-virtual {v14, v3}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    const/16 v1, 0x100

    goto :goto_1

    :cond_1
    const/16 v1, 0x80

    :goto_1
    or-int/2addr v0, v1

    or-int/lit16 v0, v0, 0x400

    const v1, 0x12493

    and-int/2addr v1, v0

    const v4, 0x12492

    const/4 v5, 0x0

    if-eq v1, v4, :cond_2

    const/4 v1, 0x1

    goto :goto_2

    :cond_2
    move v1, v5

    :goto_2
    and-int/lit8 v4, v0, 0x1

    invoke-virtual {v14, v4, v1}, Lp1/q;->U(IZ)Z

    move-result v1

    if-eqz v1, :cond_6

    invoke-virtual {v14}, Lp1/q;->Z()V

    and-int/lit8 v1, p7, 0x1

    if-eqz v1, :cond_4

    invoke-virtual {v14}, Lp1/q;->C()Z

    move-result v1

    if-eqz v1, :cond_3

    goto :goto_3

    :cond_3
    invoke-virtual {v14}, Lp1/q;->X()V

    and-int/lit16 v0, v0, -0x1c01

    move v1, v0

    move-object/from16 v0, p3

    goto :goto_4

    :cond_4
    :goto_3
    sget v7, Lo1/l;->b:F

    sget v8, Lo1/l;->i:F

    sget v9, Lo1/l;->g:F

    sget v10, Lo1/l;->h:F

    sget v11, Lo1/l;->f:F

    sget v12, Lo1/l;->d:F

    new-instance v6, Ll1/l;

    invoke-direct/range {v6 .. v12}, Ll1/l;-><init>(FFFFFF)V

    and-int/lit16 v0, v0, -0x1c01

    move v1, v0

    move-object v0, v6

    :goto_4
    invoke-virtual {v14}, Lp1/q;->r()V

    iget-wide v6, v3, Ll1/k;->a:J

    iget-wide v8, v3, Ll1/k;->b:J

    iget v4, v0, Ll1/l;->a:F

    const v10, -0x691c96f5

    invoke-virtual {v14, v10}, Lp1/q;->e0(I)V

    const v10, 0x9ffae2b

    invoke-virtual {v14, v10}, Lp1/q;->e0(I)V

    invoke-virtual {v14}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v10

    sget-object v11, Lp1/l;->a:Lp1/v0;

    if-ne v10, v11, :cond_5

    new-instance v10, Ly3/f;

    invoke-direct {v10, v4}, Ly3/f;-><init>(F)V

    invoke-static {v10}, Lp1/x;->z(Ljava/lang/Object;)Lp1/k1;

    move-result-object v10

    invoke-virtual {v14, v10}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_5
    check-cast v10, Lp1/c1;

    invoke-virtual {v14, v5}, Lp1/q;->q(Z)V

    invoke-virtual {v14, v5}, Lp1/q;->q(Z)V

    invoke-interface {v10}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ly3/f;

    iget v11, v4, Ly3/f;->w:F

    new-instance v4, Lb30/l4;

    const/16 v5, 0xf

    move-object/from16 v10, p5

    invoke-direct {v4, v10, v5}, Lb30/l4;-><init>(Lx1/b;I)V

    const v5, -0x5c9c6dd

    invoke-static {v5, v14, v4}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v13

    and-int/lit8 v1, v1, 0x70

    const v4, 0xd80006

    or-int v15, v1, v4

    const/16 v16, 0x10

    const/4 v10, 0x0

    move-object/from16 v4, p0

    move-object/from16 v12, p4

    move-object v5, v2

    invoke-static/range {v4 .. v16}, Ll1/c4;->a(Landroidx/compose/ui/Modifier;Li2/a1;JJFFLf0/t;Lx1/b;Landroidx/compose/runtime/Composer;II)V

    move-object v4, v0

    goto :goto_5

    :cond_6
    invoke-virtual {v14}, Lp1/q;->X()V

    move-object/from16 v4, p3

    :goto_5
    invoke-virtual {v14}, Lp1/q;->u()Lp1/v1;

    move-result-object v9

    if-eqz v9, :cond_7

    new-instance v0, Lat2/b0;

    const/4 v8, 0x4

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move-object/from16 v5, p4

    move-object/from16 v6, p5

    move/from16 v7, p7

    invoke-direct/range {v0 .. v8}, Lat2/b0;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ll83/e;II)V

    iput-object v0, v9, Lp1/v1;->d:Lc93/m;

    :cond_7
    return-void
.end method

.method public static final c(Landroidx/compose/ui/Modifier;JFILandroidx/compose/runtime/Composer;I)V
    .locals 10

    move-object v0, p5

    check-cast v0, Lp1/q;

    const v1, 0x5d216d69

    invoke-virtual {v0, v1}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v1, p6, 0x1

    if-eqz v1, :cond_0

    or-int/lit8 v2, p4, 0x6

    move v5, v2

    goto :goto_1

    :cond_0
    and-int/lit8 v2, p4, 0x6

    if-nez v2, :cond_2

    invoke-virtual {v0, p0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_1

    const/4 v5, 0x4

    goto :goto_0

    :cond_1
    const/4 v5, 0x2

    :goto_0
    or-int/2addr v5, p4

    goto :goto_1

    :cond_2
    move v5, p4

    :goto_1
    or-int/lit8 v5, v5, 0x30

    invoke-virtual {v0, p1, p2}, Lp1/q;->f(J)Z

    move-result v6

    if-eqz v6, :cond_3

    const/16 v6, 0x100

    goto :goto_2

    :cond_3
    const/16 v6, 0x80

    :goto_2
    or-int/2addr v5, v6

    and-int/lit16 v6, v5, 0x93

    const/16 v7, 0x92

    const/4 v8, 0x0

    const/4 v9, 0x1

    if-eq v6, v7, :cond_4

    move v6, v9

    goto :goto_3

    :cond_4
    move v6, v8

    :goto_3
    and-int/2addr v5, v9

    invoke-virtual {v0, v5, v6}, Lp1/q;->U(IZ)Z

    move-result v5

    if-eqz v5, :cond_9

    invoke-virtual {v0}, Lp1/q;->Z()V

    and-int/lit8 v5, p4, 0x1

    if-eqz v5, :cond_6

    invoke-virtual {v0}, Lp1/q;->C()Z

    move-result v5

    if-eqz v5, :cond_5

    goto :goto_4

    :cond_5
    invoke-virtual {v0}, Lp1/q;->X()V

    move-object v1, p0

    move v2, p3

    goto :goto_6

    :cond_6
    :goto_4
    if-eqz v1, :cond_7

    sget-object v1, Lb2/t;->w:Lb2/t;

    goto :goto_5

    :cond_7
    move-object v1, p0

    :goto_5
    sget v2, Ll1/l1;->a:F

    :goto_6
    invoke-virtual {v0}, Lp1/q;->r()V

    const/4 v5, 0x0

    invoke-static {v2, v5}, Ly3/f;->b(FF)Z

    move-result v5

    const/high16 v6, 0x3f800000    # 1.0f

    if-eqz v5, :cond_8

    const v5, -0x4aff5f45

    invoke-virtual {v0, v5}, Lp1/q;->e0(I)V

    sget-object v5, Lb3/v1;->h:Lp1/u2;

    invoke-virtual {v0, v5}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ly3/c;

    invoke-interface {v5}, Ly3/c;->getDensity()F

    move-result v5

    div-float v5, v6, v5

    invoke-virtual {v0, v8}, Lp1/q;->q(Z)V

    goto :goto_7

    :cond_8
    const v5, -0x4afe5b48

    invoke-virtual {v0, v5}, Lp1/q;->e0(I)V

    invoke-virtual {v0, v8}, Lp1/q;->q(Z)V

    move v5, v2

    :goto_7
    invoke-static {v6, v1}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v6

    invoke-static {v5, v6}, Landroidx/compose/foundation/layout/d;->h(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v5

    sget-object v6, Li2/w0;->a:Li2/v0;

    invoke-static {v5, p1, p2, v6}, Landroidx/compose/foundation/a;->c(Landroidx/compose/ui/Modifier;JLi2/a1;)Landroidx/compose/ui/Modifier;

    move-result-object v5

    invoke-static {v5, v0, v8}, Ll0/q;->a(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V

    goto :goto_8

    :cond_9
    invoke-virtual {v0}, Lp1/q;->X()V

    move-object v1, p0

    move v2, p3

    :goto_8
    invoke-virtual {v0}, Lp1/q;->u()Lp1/v1;

    move-result-object v8

    if-eqz v8, :cond_a

    new-instance v0, Ll1/n1;

    const/4 v7, 0x1

    move-wide v3, p1

    move v5, p4

    move/from16 v6, p6

    invoke-direct/range {v0 .. v7}, Ll1/n1;-><init>(Landroidx/compose/ui/Modifier;FJIII)V

    iput-object v0, v8, Lp1/v1;->d:Lc93/m;

    :cond_a
    return-void
.end method

.method public static final d(Landroidx/compose/ui/Modifier;JFILandroidx/compose/runtime/Composer;I)V
    .locals 14

    move/from16 v5, p4

    move-object/from16 v0, p5

    check-cast v0, Lp1/q;

    const v1, 0x47a9d25

    invoke-virtual {v0, v1}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v1, p6, 0x1

    if-eqz v1, :cond_0

    or-int/lit8 v2, v5, 0x6

    goto :goto_1

    :cond_0
    and-int/lit8 v2, v5, 0x6

    if-nez v2, :cond_2

    invoke-virtual {v0, p0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1

    const/4 v2, 0x4

    goto :goto_0

    :cond_1
    const/4 v2, 0x2

    :goto_0
    or-int/2addr v2, v5

    goto :goto_1

    :cond_2
    move v2, v5

    :goto_1
    and-int/lit8 v3, p6, 0x2

    const/16 v4, 0x20

    if-eqz v3, :cond_4

    or-int/lit8 v2, v2, 0x30

    :cond_3
    move/from16 v6, p3

    goto :goto_3

    :cond_4
    and-int/lit8 v6, v5, 0x30

    if-nez v6, :cond_3

    move/from16 v6, p3

    invoke-virtual {v0, v6}, Lp1/q;->d(F)Z

    move-result v7

    if-eqz v7, :cond_5

    move v7, v4

    goto :goto_2

    :cond_5
    const/16 v7, 0x10

    :goto_2
    or-int/2addr v2, v7

    :goto_3
    and-int/lit16 v7, v5, 0x180

    const/16 v8, 0x100

    if-nez v7, :cond_7

    and-int/lit8 v7, p6, 0x4

    move-wide v9, p1

    if-nez v7, :cond_6

    invoke-virtual {v0, v9, v10}, Lp1/q;->f(J)Z

    move-result v7

    if-eqz v7, :cond_6

    move v7, v8

    goto :goto_4

    :cond_6
    const/16 v7, 0x80

    :goto_4
    or-int/2addr v2, v7

    goto :goto_5

    :cond_7
    move-wide v9, p1

    :goto_5
    and-int/lit16 v7, v2, 0x93

    const/16 v11, 0x92

    const/4 v12, 0x0

    const/4 v13, 0x1

    if-eq v7, v11, :cond_8

    move v7, v13

    goto :goto_6

    :cond_8
    move v7, v12

    :goto_6
    and-int/lit8 v11, v2, 0x1

    invoke-virtual {v0, v11, v7}, Lp1/q;->U(IZ)Z

    move-result v7

    if-eqz v7, :cond_15

    invoke-virtual {v0}, Lp1/q;->Z()V

    and-int/lit8 v7, v5, 0x1

    if-eqz v7, :cond_b

    invoke-virtual {v0}, Lp1/q;->C()Z

    move-result v7

    if-eqz v7, :cond_9

    goto :goto_7

    :cond_9
    invoke-virtual {v0}, Lp1/q;->X()V

    and-int/lit8 v1, p6, 0x4

    if-eqz v1, :cond_a

    and-int/lit16 v2, v2, -0x381

    :cond_a
    move v1, v6

    goto :goto_9

    :cond_b
    :goto_7
    if-eqz v1, :cond_c

    sget-object p0, Lb2/t;->w:Lb2/t;

    :cond_c
    if-eqz v3, :cond_d

    sget v1, Ll1/l1;->a:F

    goto :goto_8

    :cond_d
    move v1, v6

    :goto_8
    and-int/lit8 v3, p6, 0x4

    if-eqz v3, :cond_e

    sget v3, Ll1/l1;->a:F

    sget-object v3, Lo1/i;->a:Lo1/f;

    invoke-static {v3, v0}, Ll1/n;->d(Lo1/f;Landroidx/compose/runtime/Composer;)J

    move-result-wide v6

    and-int/lit16 v2, v2, -0x381

    move-wide v9, v6

    :cond_e
    :goto_9
    invoke-virtual {v0}, Lp1/q;->r()V

    const/high16 v3, 0x3f800000    # 1.0f

    invoke-static {v3, p0}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    invoke-static {v1, v3}, Landroidx/compose/foundation/layout/d;->h(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    and-int/lit8 v6, v2, 0x70

    if-ne v6, v4, :cond_f

    move v4, v13

    goto :goto_a

    :cond_f
    move v4, v12

    :goto_a
    and-int/lit16 v6, v2, 0x380

    xor-int/lit16 v6, v6, 0x180

    if-le v6, v8, :cond_10

    invoke-virtual {v0, v9, v10}, Lp1/q;->f(J)Z

    move-result v6

    if-nez v6, :cond_12

    :cond_10
    and-int/lit16 v2, v2, 0x180

    if-ne v2, v8, :cond_11

    goto :goto_b

    :cond_11
    move v13, v12

    :cond_12
    :goto_b
    or-int v2, v4, v13

    invoke-virtual {v0}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    if-nez v2, :cond_13

    sget-object v2, Lp1/l;->a:Lp1/v0;

    if-ne v4, v2, :cond_14

    :cond_13
    new-instance v4, Ll1/m1;

    invoke-direct {v4, v1, v9, v10}, Ll1/m1;-><init>(FJ)V

    invoke-virtual {v0, v4}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_14
    check-cast v4, Lkotlin/jvm/functions/Function1;

    invoke-static {v3, v4, v0, v12}, Lj93/l0;->a(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    move v2, v1

    move-wide v3, v9

    move-object v1, p0

    goto :goto_c

    :cond_15
    invoke-virtual {v0}, Lp1/q;->X()V

    move v2, v6

    move-object v1, p0

    move-wide v3, v9

    :goto_c
    invoke-virtual {v0}, Lp1/q;->u()Lp1/v1;

    move-result-object p0

    if-eqz p0, :cond_16

    new-instance v0, Ll1/n1;

    const/4 v7, 0x0

    move/from16 v6, p6

    invoke-direct/range {v0 .. v7}, Ll1/n1;-><init>(Landroidx/compose/ui/Modifier;FJIII)V

    iput-object v0, p0, Lp1/v1;->d:Lc93/m;

    :cond_16
    return-void
.end method

.method public static final e(Lc93/a;Landroidx/compose/ui/Modifier;ZLl1/p1;Li2/a1;Lc93/m;Landroidx/compose/runtime/Composer;II)V
    .locals 16

    move/from16 v7, p7

    move-object/from16 v14, p6

    check-cast v14, Lp1/q;

    const v0, 0x5438da46

    invoke-virtual {v14, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, v7, 0x6

    move-object/from16 v9, p0

    if-nez v0, :cond_1

    invoke-virtual {v14, v9}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x4

    goto :goto_0

    :cond_0
    const/4 v0, 0x2

    :goto_0
    or-int/2addr v0, v7

    goto :goto_1

    :cond_1
    move v0, v7

    :goto_1
    and-int/lit8 v1, v7, 0x30

    move-object/from16 v8, p1

    if-nez v1, :cond_3

    invoke-virtual {v14, v8}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    const/16 v1, 0x20

    goto :goto_2

    :cond_2
    const/16 v1, 0x10

    :goto_2
    or-int/2addr v0, v1

    :cond_3
    and-int/lit8 v1, p8, 0x4

    if-eqz v1, :cond_5

    or-int/lit16 v0, v0, 0x180

    :cond_4
    move/from16 v2, p2

    goto :goto_4

    :cond_5
    and-int/lit16 v2, v7, 0x180

    if-nez v2, :cond_4

    move/from16 v2, p2

    invoke-virtual {v14, v2}, Lp1/q;->h(Z)Z

    move-result v3

    if-eqz v3, :cond_6

    const/16 v3, 0x100

    goto :goto_3

    :cond_6
    const/16 v3, 0x80

    :goto_3
    or-int/2addr v0, v3

    :goto_4
    and-int/lit16 v3, v7, 0xc00

    if-nez v3, :cond_9

    and-int/lit8 v3, p8, 0x8

    if-nez v3, :cond_7

    move-object/from16 v3, p3

    invoke-virtual {v14, v3}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_8

    const/16 v4, 0x800

    goto :goto_5

    :cond_7
    move-object/from16 v3, p3

    :cond_8
    const/16 v4, 0x400

    :goto_5
    or-int/2addr v0, v4

    goto :goto_6

    :cond_9
    move-object/from16 v3, p3

    :goto_6
    and-int/lit8 v4, p8, 0x10

    if-eqz v4, :cond_a

    or-int/lit16 v0, v0, 0x6000

    goto :goto_8

    :cond_a
    and-int/lit16 v4, v7, 0x6000

    if-nez v4, :cond_c

    const/4 v4, 0x0

    invoke-virtual {v14, v4}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_b

    const/16 v4, 0x4000

    goto :goto_7

    :cond_b
    const/16 v4, 0x2000

    :goto_7
    or-int/2addr v0, v4

    :cond_c
    :goto_8
    const/high16 v4, 0x30000

    and-int/2addr v4, v7

    if-nez v4, :cond_f

    and-int/lit8 v4, p8, 0x20

    if-nez v4, :cond_d

    move-object/from16 v4, p4

    invoke-virtual {v14, v4}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_e

    const/high16 v5, 0x20000

    goto :goto_9

    :cond_d
    move-object/from16 v4, p4

    :cond_e
    const/high16 v5, 0x10000

    :goto_9
    or-int/2addr v0, v5

    goto :goto_a

    :cond_f
    move-object/from16 v4, p4

    :goto_a
    const/high16 v5, 0x180000

    and-int/2addr v5, v7

    move-object/from16 v13, p5

    if-nez v5, :cond_11

    invoke-virtual {v14, v13}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_10

    const/high16 v5, 0x100000

    goto :goto_b

    :cond_10
    const/high16 v5, 0x80000

    :goto_b
    or-int/2addr v0, v5

    :cond_11
    const v5, 0x92493

    and-int/2addr v5, v0

    const v6, 0x92492

    const/4 v10, 0x1

    if-eq v5, v6, :cond_12

    move v5, v10

    goto :goto_c

    :cond_12
    const/4 v5, 0x0

    :goto_c
    and-int/lit8 v6, v0, 0x1

    invoke-virtual {v14, v6, v5}, Lp1/q;->U(IZ)Z

    move-result v5

    if-eqz v5, :cond_1a

    invoke-virtual {v14}, Lp1/q;->Z()V

    and-int/lit8 v5, v7, 0x1

    const v6, -0x70001

    if-eqz v5, :cond_16

    invoke-virtual {v14}, Lp1/q;->C()Z

    move-result v5

    if-eqz v5, :cond_13

    goto :goto_e

    :cond_13
    invoke-virtual {v14}, Lp1/q;->X()V

    and-int/lit8 v1, p8, 0x8

    if-eqz v1, :cond_14

    and-int/lit16 v0, v0, -0x1c01

    :cond_14
    and-int/lit8 v1, p8, 0x20

    if-eqz v1, :cond_15

    and-int/2addr v0, v6

    :cond_15
    move v10, v2

    move-object v12, v3

    :goto_d
    move-object v11, v4

    goto :goto_11

    :cond_16
    :goto_e
    if-eqz v1, :cond_17

    goto :goto_f

    :cond_17
    move v10, v2

    :goto_f
    and-int/lit8 v1, p8, 0x8

    if-eqz v1, :cond_18

    invoke-static {v14}, Ll1/k3;->k(Landroidx/compose/runtime/Composer;)Ll1/p1;

    move-result-object v1

    and-int/lit16 v0, v0, -0x1c01

    goto :goto_10

    :cond_18
    move-object v1, v3

    :goto_10
    and-int/lit8 v2, p8, 0x20

    if-eqz v2, :cond_19

    sget-object v2, Lo1/w;->b:Lo1/t;

    invoke-static {v2, v14}, Ll1/q3;->b(Lo1/t;Landroidx/compose/runtime/Composer;)Li2/a1;

    move-result-object v2

    and-int/2addr v0, v6

    move-object v12, v1

    move-object v11, v2

    goto :goto_11

    :cond_19
    move-object v12, v1

    goto :goto_d

    :goto_11
    invoke-virtual {v14}, Lp1/q;->r()V

    shr-int/lit8 v1, v0, 0x3

    and-int/lit8 v1, v1, 0xe

    shl-int/lit8 v2, v0, 0x3

    and-int/lit8 v3, v2, 0x70

    or-int/2addr v1, v3

    and-int/lit16 v3, v0, 0x380

    or-int/2addr v1, v3

    shr-int/lit8 v3, v0, 0x6

    and-int/lit16 v3, v3, 0x1c00

    or-int/2addr v1, v3

    const v3, 0xe000

    and-int/2addr v3, v2

    or-int/2addr v1, v3

    const/high16 v3, 0x70000

    and-int/2addr v2, v3

    or-int/2addr v1, v2

    const/high16 v2, 0x380000

    and-int/2addr v0, v2

    or-int v15, v1, v0

    invoke-static/range {v8 .. v15}, Ll1/k3;->g(Landroidx/compose/ui/Modifier;Lc93/a;ZLi2/a1;Ll1/p1;Lc93/m;Landroidx/compose/runtime/Composer;I)V

    move v3, v10

    move-object v5, v11

    move-object v4, v12

    goto :goto_12

    :cond_1a
    invoke-virtual {v14}, Lp1/q;->X()V

    move-object v5, v4

    move-object v4, v3

    move v3, v2

    :goto_12
    invoke-virtual {v14}, Lp1/q;->u()Lp1/v1;

    move-result-object v9

    if-eqz v9, :cond_1b

    new-instance v0, Lb30/i2;

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move-object/from16 v6, p5

    move/from16 v8, p8

    invoke-direct/range {v0 .. v8}, Lb30/i2;-><init>(Lc93/a;Landroidx/compose/ui/Modifier;ZLl1/p1;Li2/a1;Lc93/m;II)V

    iput-object v0, v9, Lp1/v1;->d:Lc93/m;

    :cond_1b
    return-void
.end method

.method public static final f(Lc93/a;Landroidx/compose/ui/Modifier;ZLl1/p1;Lx1/b;Landroidx/compose/runtime/Composer;I)V
    .locals 9

    move-object v6, p5

    check-cast v6, Lp1/q;

    const p5, -0x7cf1ad45

    invoke-virtual {v6, p5}, Lp1/q;->g0(I)Lp1/q;

    invoke-virtual {v6, p0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result p5

    if-eqz p5, :cond_0

    const/4 p5, 0x4

    goto :goto_0

    :cond_0
    const/4 p5, 0x2

    :goto_0
    or-int/2addr p5, p6

    and-int/lit8 v0, p6, 0x30

    if-nez v0, :cond_2

    invoke-virtual {v6, p1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    const/16 v0, 0x20

    goto :goto_1

    :cond_1
    const/16 v0, 0x10

    :goto_1
    or-int/2addr p5, v0

    :cond_2
    or-int/lit16 p5, p5, 0x6580

    const v0, 0x12493

    and-int/2addr v0, p5

    const v1, 0x12492

    const/4 v2, 0x1

    if-eq v0, v1, :cond_3

    move v0, v2

    goto :goto_2

    :cond_3
    const/4 v0, 0x0

    :goto_2
    and-int/lit8 v1, p5, 0x1

    invoke-virtual {v6, v1, v0}, Lp1/q;->U(IZ)Z

    move-result v0

    if-eqz v0, :cond_6

    invoke-virtual {v6}, Lp1/q;->Z()V

    and-int/lit8 v0, p6, 0x1

    if-eqz v0, :cond_5

    invoke-virtual {v6}, Lp1/q;->C()Z

    move-result v0

    if-eqz v0, :cond_4

    goto :goto_4

    :cond_4
    invoke-virtual {v6}, Lp1/q;->X()V

    and-int/lit16 p5, p5, -0x1c01

    move v2, p2

    :goto_3
    move-object v3, p3

    goto :goto_5

    :cond_5
    :goto_4
    invoke-static {v6}, Ll1/k3;->k(Landroidx/compose/runtime/Composer;)Ll1/p1;

    move-result-object p3

    and-int/lit16 p5, p5, -0x1c01

    goto :goto_3

    :goto_5
    invoke-virtual {v6}, Lp1/q;->r()V

    sget-object p2, Lo1/w;->b:Lo1/t;

    invoke-static {p2, v6}, Ll1/q3;->b(Lo1/t;Landroidx/compose/runtime/Composer;)Li2/a1;

    move-result-object v4

    const p2, 0xfffe

    and-int/2addr p2, p5

    const/high16 p3, 0x180000

    or-int v7, p2, p3

    const/4 v8, 0x0

    move-object v0, p0

    move-object v1, p1

    move-object v5, p4

    invoke-static/range {v0 .. v8}, Ll1/k3;->e(Lc93/a;Landroidx/compose/ui/Modifier;ZLl1/p1;Li2/a1;Lc93/m;Landroidx/compose/runtime/Composer;II)V

    move-object p1, v0

    move-object p5, v5

    move p3, v2

    move-object p4, v3

    goto :goto_6

    :cond_6
    move-object v1, p1

    move-object p5, p4

    move-object p1, p0

    invoke-virtual {v6}, Lp1/q;->X()V

    move-object p4, p3

    move p3, p2

    :goto_6
    invoke-virtual {v6}, Lp1/q;->u()Lp1/v1;

    move-result-object v0

    if-eqz v0, :cond_7

    new-instance p0, Lb30/j2;

    move-object p2, v1

    invoke-direct/range {p0 .. p6}, Lb30/j2;-><init>(Lc93/a;Landroidx/compose/ui/Modifier;ZLl1/p1;Lx1/b;I)V

    iput-object p0, v0, Lp1/v1;->d:Lc93/m;

    :cond_7
    return-void
.end method

.method public static final g(Landroidx/compose/ui/Modifier;Lc93/a;ZLi2/a1;Ll1/p1;Lc93/m;Landroidx/compose/runtime/Composer;I)V
    .locals 17

    move-object/from16 v1, p0

    move/from16 v3, p2

    move-object/from16 v0, p3

    move-object/from16 v9, p4

    move-object/from16 v10, p5

    move/from16 v11, p7

    move-object/from16 v12, p6

    check-cast v12, Lp1/q;

    const v2, -0x439bfd92

    invoke-virtual {v12, v2}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v2, v11, 0x6

    if-nez v2, :cond_1

    invoke-virtual {v12, v1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    const/4 v2, 0x4

    goto :goto_0

    :cond_0
    const/4 v2, 0x2

    :goto_0
    or-int/2addr v2, v11

    goto :goto_1

    :cond_1
    move v2, v11

    :goto_1
    and-int/lit8 v4, v11, 0x30

    move-object/from16 v7, p1

    if-nez v4, :cond_3

    invoke-virtual {v12, v7}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_2

    const/16 v4, 0x20

    goto :goto_2

    :cond_2
    const/16 v4, 0x10

    :goto_2
    or-int/2addr v2, v4

    :cond_3
    and-int/lit16 v4, v11, 0x180

    if-nez v4, :cond_5

    invoke-virtual {v12, v3}, Lp1/q;->h(Z)Z

    move-result v4

    if-eqz v4, :cond_4

    const/16 v4, 0x100

    goto :goto_3

    :cond_4
    const/16 v4, 0x80

    :goto_3
    or-int/2addr v2, v4

    :cond_5
    and-int/lit16 v4, v11, 0xc00

    if-nez v4, :cond_7

    invoke-virtual {v12, v0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_6

    const/16 v4, 0x800

    goto :goto_4

    :cond_6
    const/16 v4, 0x400

    :goto_4
    or-int/2addr v2, v4

    :cond_7
    and-int/lit16 v4, v11, 0x6000

    if-nez v4, :cond_9

    invoke-virtual {v12, v9}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_8

    const/16 v4, 0x4000

    goto :goto_5

    :cond_8
    const/16 v4, 0x2000

    :goto_5
    or-int/2addr v2, v4

    :cond_9
    const/high16 v4, 0x30000

    and-int/2addr v4, v11

    if-nez v4, :cond_b

    const/4 v4, 0x0

    invoke-virtual {v12, v4}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_a

    const/high16 v4, 0x20000

    goto :goto_6

    :cond_a
    const/high16 v4, 0x10000

    :goto_6
    or-int/2addr v2, v4

    :cond_b
    const/high16 v4, 0x180000

    and-int/2addr v4, v11

    if-nez v4, :cond_d

    invoke-virtual {v12, v10}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_c

    const/high16 v4, 0x100000

    goto :goto_7

    :cond_c
    const/high16 v4, 0x80000

    :goto_7
    or-int/2addr v2, v4

    :cond_d
    move v13, v2

    const v2, 0x92493

    and-int/2addr v2, v13

    const v4, 0x92492

    const/4 v14, 0x1

    const/4 v15, 0x0

    if-eq v2, v4, :cond_e

    move v2, v14

    goto :goto_8

    :cond_e
    move v2, v15

    :goto_8
    and-int/lit8 v4, v13, 0x1

    invoke-virtual {v12, v4, v2}, Lp1/q;->U(IZ)Z

    move-result v2

    if-eqz v2, :cond_15

    const v2, 0x3a3c87ed

    invoke-virtual {v12, v2}, Lp1/q;->e0(I)V

    invoke-virtual {v12}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    sget-object v4, Lp1/l;->a:Lp1/v0;

    if-ne v2, v4, :cond_f

    invoke-static {v12}, Ld;->g(Lp1/q;)Lj0/j;

    move-result-object v2

    :cond_f
    check-cast v2, Lj0/i;

    invoke-virtual {v12, v15}, Lp1/q;->q(Z)V

    sget-object v4, Ll1/w1;->a:Ly2/m;

    sget-object v4, Landroidx/compose/material3/MinimumInteractiveModifier;->w:Landroidx/compose/material3/MinimumInteractiveModifier;

    invoke-interface {v1, v4}, Landroidx/compose/ui/Modifier;->e(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    sget v5, Lo1/w;->c:F

    add-float/2addr v5, v5

    sget v6, Lo1/w;->d:F

    add-float/2addr v6, v5

    sget v5, Lo1/w;->a:F

    invoke-static {v6, v5}, Lvf3/b;->a(FF)J

    move-result-wide v5

    invoke-static {v5, v6, v4}, Landroidx/compose/foundation/layout/d;->q(JLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    invoke-static {v4, v0}, Lwb3/f;->r(Landroidx/compose/ui/Modifier;Li2/a1;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    if-eqz v3, :cond_10

    iget-wide v5, v9, Ll1/p1;->a:J

    goto :goto_9

    :cond_10
    iget-wide v5, v9, Ll1/p1;->c:J

    :goto_9
    invoke-static {v4, v5, v6, v0}, Landroidx/compose/foundation/a;->c(Landroidx/compose/ui/Modifier;JLi2/a1;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    const/4 v5, 0x0

    const/4 v6, 0x7

    invoke-static {v5, v6, v15}, Ll1/l3;->a(FIZ)Landroidx/compose/material3/c;

    move-result-object v5

    new-instance v6, Li3/i;

    invoke-direct {v6, v15}, Li3/i;-><init>(I)V

    const/16 v8, 0x8

    move/from16 v16, v3

    move-object v3, v2

    move-object v2, v4

    move-object v4, v5

    move/from16 v5, v16

    invoke-static/range {v2 .. v8}, Landroidx/compose/foundation/a;->e(Landroidx/compose/ui/Modifier;Lj0/i;Lf0/v0;ZLi3/i;Lc93/a;I)Landroidx/compose/ui/Modifier;

    move-result-object v2

    invoke-static {v2}, Lm1/e0;->e(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    sget-object v3, Lb2/e;->E:Lb2/m;

    invoke-static {v3, v15}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v3

    iget-wide v4, v12, Lp1/q;->T:J

    invoke-static {v4, v5}, Ljava/lang/Long;->hashCode(J)I

    move-result v4

    invoke-virtual {v12}, Lp1/q;->m()Lp1/p1;

    move-result-object v5

    invoke-static {v12, v2}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    sget-object v6, La3/l;->a:La3/k;

    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v6, La3/k;->b:La3/j;

    invoke-virtual {v12}, Lp1/q;->i0()V

    iget-boolean v7, v12, Lp1/q;->S:Z

    if-eqz v7, :cond_11

    invoke-virtual {v12, v6}, Lp1/q;->l(Lc93/a;)V

    goto :goto_a

    :cond_11
    invoke-virtual {v12}, Lp1/q;->s0()V

    :goto_a
    sget-object v6, La3/k;->g:La3/i;

    invoke-static {v12, v6, v3}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v3, La3/k;->f:La3/i;

    invoke-static {v12, v3, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v3, La3/k;->j:La3/i;

    iget-boolean v5, v12, Lp1/q;->S:Z

    if-nez v5, :cond_12

    invoke-virtual {v12}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-static {v5, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_13

    :cond_12
    invoke-static {v4, v12, v4, v3}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_13
    sget-object v3, La3/k;->d:La3/i;

    invoke-static {v12, v3, v2}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    if-eqz p2, :cond_14

    iget-wide v2, v9, Ll1/p1;->b:J

    goto :goto_b

    :cond_14
    iget-wide v2, v9, Ll1/p1;->d:J

    :goto_b
    sget-object v4, Ll1/s;->a:Lp1/b0;

    new-instance v5, Li2/x;

    invoke-direct {v5, v2, v3}, Li2/x;-><init>(J)V

    invoke-virtual {v4, v5}, Lp1/b0;->a(Ljava/lang/Object;)Lp1/u1;

    move-result-object v2

    shr-int/lit8 v3, v13, 0xf

    and-int/lit8 v3, v3, 0x70

    const/16 v4, 0x8

    or-int/2addr v3, v4

    invoke-static {v2, v10, v12, v3}, Lp1/x;->a(Lp1/u1;Lc93/m;Landroidx/compose/runtime/Composer;I)V

    invoke-virtual {v12, v14}, Lp1/q;->q(Z)V

    goto :goto_c

    :cond_15
    invoke-virtual {v12}, Lp1/q;->X()V

    :goto_c
    invoke-virtual {v12}, Lp1/q;->u()Lp1/v1;

    move-result-object v8

    if-eqz v8, :cond_16

    new-instance v0, Ld30/l0;

    move-object/from16 v2, p1

    move/from16 v3, p2

    move-object/from16 v4, p3

    move-object v5, v9

    move-object v6, v10

    move v7, v11

    invoke-direct/range {v0 .. v7}, Ld30/l0;-><init>(Landroidx/compose/ui/Modifier;Lc93/a;ZLi2/a1;Ll1/p1;Lc93/m;I)V

    iput-object v0, v8, Lp1/v1;->d:Lc93/m;

    :cond_16
    return-void
.end method

.method public static final h(Lc93/a;JLl1/o2;Ld0/e;Lx1/b;Landroidx/compose/runtime/Composer;I)V
    .locals 22

    move-object/from16 v9, p4

    move-object/from16 v11, p5

    move/from16 v12, p7

    move-object/from16 v13, p6

    check-cast v13, Lp1/q;

    const v0, 0x2db43478

    invoke-virtual {v13, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, v12, 0x6

    move-object/from16 v1, p0

    if-nez v0, :cond_1

    invoke-virtual {v13, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x4

    goto :goto_0

    :cond_0
    const/4 v0, 0x2

    :goto_0
    or-int/2addr v0, v12

    goto :goto_1

    :cond_1
    move v0, v12

    :goto_1
    and-int/lit8 v2, v12, 0x30

    if-nez v2, :cond_3

    move-wide/from16 v2, p1

    invoke-virtual {v13, v2, v3}, Lp1/q;->f(J)Z

    move-result v4

    if-eqz v4, :cond_2

    const/16 v4, 0x20

    goto :goto_2

    :cond_2
    const/16 v4, 0x10

    :goto_2
    or-int/2addr v0, v4

    goto :goto_3

    :cond_3
    move-wide/from16 v2, p1

    :goto_3
    and-int/lit16 v4, v12, 0x180

    if-nez v4, :cond_5

    move-object/from16 v4, p3

    invoke-virtual {v13, v4}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_4

    const/16 v6, 0x100

    goto :goto_4

    :cond_4
    const/16 v6, 0x80

    :goto_4
    or-int/2addr v0, v6

    goto :goto_5

    :cond_5
    move-object/from16 v4, p3

    :goto_5
    and-int/lit16 v6, v12, 0xc00

    if-nez v6, :cond_8

    and-int/lit16 v6, v12, 0x1000

    if-nez v6, :cond_6

    invoke-virtual {v13, v9}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v6

    goto :goto_6

    :cond_6
    invoke-virtual {v13, v9}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v6

    :goto_6
    if-eqz v6, :cond_7

    const/16 v6, 0x800

    goto :goto_7

    :cond_7
    const/16 v6, 0x400

    :goto_7
    or-int/2addr v0, v6

    :cond_8
    and-int/lit16 v6, v12, 0x6000

    if-nez v6, :cond_a

    invoke-virtual {v13, v11}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_9

    const/16 v6, 0x4000

    goto :goto_8

    :cond_9
    const/16 v6, 0x2000

    :goto_8
    or-int/2addr v0, v6

    :cond_a
    and-int/lit16 v6, v0, 0x2493

    const/16 v7, 0x2492

    const/4 v10, 0x0

    if-eq v6, v7, :cond_b

    const/4 v6, 0x1

    goto :goto_9

    :cond_b
    move v6, v10

    :goto_9
    and-int/lit8 v7, v0, 0x1

    invoke-virtual {v13, v7, v6}, Lp1/q;->U(IZ)Z

    move-result v6

    if-eqz v6, :cond_17

    sget-object v6, Landroidx/compose/ui/platform/AndroidCompositionLocals_androidKt;->f:Lp1/u2;

    invoke-virtual {v13, v6}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Landroid/view/View;

    sget-object v7, Lb3/v1;->h:Lp1/u2;

    invoke-virtual {v13, v7}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ly3/c;

    sget-object v5, Lb3/v1;->n:Lp1/u2;

    invoke-virtual {v13, v5}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ly3/m;

    invoke-static {v13}, Lp1/x;->E(Landroidx/compose/runtime/Composer;)Lp1/o;

    move-result-object v15

    invoke-static {v11, v13}, Lp1/x;->F(Ljava/lang/Object;Landroidx/compose/runtime/Composer;)Lp1/c1;

    move-result-object v14

    new-array v8, v10, [Ljava/lang/Object;

    invoke-virtual {v13}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v10

    sget-object v11, Lp1/l;->a:Lp1/v0;

    if-ne v10, v11, :cond_c

    new-instance v10, Ll1/f0;

    move/from16 v17, v0

    const/4 v0, 0x6

    invoke-direct {v10, v0}, Ll1/f0;-><init>(I)V

    invoke-virtual {v13, v10}, Lp1/q;->p0(Ljava/lang/Object;)V

    goto :goto_a

    :cond_c
    move/from16 v17, v0

    :goto_a
    check-cast v10, Lc93/a;

    const/16 v0, 0x30

    invoke-static {v8, v10, v13, v0}, Ly1/k;->c([Ljava/lang/Object;Lc93/a;Landroidx/compose/runtime/Composer;I)Ljava/lang/Object;

    move-result-object v0

    move-object v8, v0

    check-cast v8, Ljava/util/UUID;

    invoke-virtual {v13}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v11, :cond_d

    invoke-static {v13}, Lp1/x;->p(Landroidx/compose/runtime/Composer;)Lbc3/c0;

    move-result-object v0

    invoke-virtual {v13, v0}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_d
    move-object v10, v0

    check-cast v10, Lbc3/c0;

    invoke-virtual {v13, v6}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v0

    invoke-virtual {v13, v7}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v18

    or-int v0, v0, v18

    move/from16 v18, v0

    invoke-virtual {v13}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v0

    if-nez v18, :cond_f

    if-ne v0, v11, :cond_e

    goto :goto_b

    :cond_e
    move-object v6, v5

    move/from16 v19, v17

    const/4 v12, 0x1

    const/16 v16, 0x0

    goto :goto_c

    :cond_f
    :goto_b
    new-instance v0, Ll1/e2;

    move-wide/from16 v20, v2

    move-object v2, v4

    move-wide/from16 v3, v20

    move-object v12, v6

    move-object v6, v5

    move-object v5, v12

    move/from16 v19, v17

    const/4 v12, 0x1

    const/16 v16, 0x0

    invoke-direct/range {v0 .. v10}, Ll1/e2;-><init>(Lc93/a;Ll1/o2;JLandroid/view/View;Ly3/m;Ly3/c;Ljava/util/UUID;Ld0/e;Lbc3/c0;)V

    new-instance v1, Ll1/u;

    const/4 v2, 0x1

    invoke-direct {v1, v2, v14}, Ll1/u;-><init>(ILp1/c1;)V

    new-instance v2, Lx1/b;

    const v3, -0x3eaaaf9b

    invoke-direct {v2, v1, v12, v3}, Lx1/b;-><init>(Ljava/lang/Object;ZI)V

    iget-object v1, v0, Ll1/e2;->H:Ll1/b2;

    invoke-virtual {v1, v15}, Lb3/a;->setParentCompositionContext(Lp1/t;)V

    iget-object v3, v1, Ll1/b2;->K:Lp1/k1;

    invoke-virtual {v3, v2}, Lp1/k1;->setValue(Ljava/lang/Object;)V

    iput-boolean v12, v1, Ll1/b2;->L:Z

    invoke-virtual {v1}, Lb3/a;->c()V

    invoke-virtual {v13, v0}, Lp1/q;->p0(Ljava/lang/Object;)V

    :goto_c
    move-object v2, v0

    check-cast v2, Ll1/e2;

    invoke-virtual {v13, v2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v0

    invoke-virtual {v13}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    if-nez v0, :cond_10

    if-ne v1, v11, :cond_11

    :cond_10
    new-instance v1, Lio/getstream/chat/android/ui/viewmodel/typing/a;

    const/16 v0, 0x19

    invoke-direct {v1, v2, v0}, Lio/getstream/chat/android/ui/viewmodel/typing/a;-><init>(Ljava/lang/Object;I)V

    invoke-virtual {v13, v1}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_11
    check-cast v1, Lkotlin/jvm/functions/Function1;

    invoke-static {v2, v1, v13}, Lp1/x;->e(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;)V

    invoke-virtual {v13, v2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v0

    move/from16 v1, v19

    and-int/lit8 v3, v1, 0xe

    const/4 v4, 0x4

    if-ne v3, v4, :cond_12

    move v8, v12

    goto :goto_d

    :cond_12
    move/from16 v8, v16

    :goto_d
    or-int/2addr v0, v8

    and-int/lit16 v3, v1, 0x380

    const/16 v4, 0x100

    if-ne v3, v4, :cond_13

    move v8, v12

    goto :goto_e

    :cond_13
    move/from16 v8, v16

    :goto_e
    or-int/2addr v0, v8

    and-int/lit8 v1, v1, 0x70

    const/16 v3, 0x20

    if-ne v1, v3, :cond_14

    move v8, v12

    goto :goto_f

    :cond_14
    move/from16 v8, v16

    :goto_f
    or-int/2addr v0, v8

    invoke-virtual {v6}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    invoke-virtual {v13, v1}, Lp1/q;->e(I)Z

    move-result v1

    or-int/2addr v0, v1

    invoke-virtual {v13}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    if-nez v0, :cond_15

    if-ne v1, v11, :cond_16

    :cond_15
    new-instance v1, Ll1/p2;

    move-object/from16 v3, p0

    move-object/from16 v4, p3

    move-object v7, v6

    move-wide/from16 v5, p1

    invoke-direct/range {v1 .. v7}, Ll1/p2;-><init>(Ll1/e2;Lc93/a;Ll1/o2;JLy3/m;)V

    invoke-virtual {v13, v1}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_16
    check-cast v1, Lc93/a;

    invoke-static {v1, v13}, Lp1/x;->k(Lc93/a;Landroidx/compose/runtime/Composer;)V

    goto :goto_10

    :cond_17
    invoke-virtual {v13}, Lp1/q;->X()V

    :goto_10
    invoke-virtual {v13}, Lp1/q;->u()Lp1/v1;

    move-result-object v8

    if-eqz v8, :cond_18

    new-instance v0, Lio2/q;

    move-object/from16 v1, p0

    move-wide/from16 v2, p1

    move-object/from16 v4, p3

    move-object/from16 v5, p4

    move-object/from16 v6, p5

    move/from16 v7, p7

    invoke-direct/range {v0 .. v7}, Lio2/q;-><init>(Lc93/a;JLl1/o2;Ld0/e;Lx1/b;I)V

    iput-object v0, v8, Lp1/v1;->d:Lc93/m;

    :cond_18
    return-void
.end method

.method public static final i(Lc93/a;Landroidx/compose/ui/Modifier;ZLi2/a1;Ll1/f;Ll0/k1;Lx1/b;Landroidx/compose/runtime/Composer;II)V
    .locals 21

    move/from16 v8, p8

    move-object/from16 v0, p7

    check-cast v0, Lp1/q;

    const v1, -0x3f43489d

    invoke-virtual {v0, v1}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v1, v8, 0x6

    move-object/from16 v9, p0

    if-nez v1, :cond_1

    invoke-virtual {v0, v9}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, 0x4

    goto :goto_0

    :cond_0
    const/4 v1, 0x2

    :goto_0
    or-int/2addr v1, v8

    goto :goto_1

    :cond_1
    move v1, v8

    :goto_1
    and-int/lit8 v2, v8, 0x30

    move-object/from16 v10, p1

    if-nez v2, :cond_3

    invoke-virtual {v0, v10}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    const/16 v2, 0x20

    goto :goto_2

    :cond_2
    const/16 v2, 0x10

    :goto_2
    or-int/2addr v1, v2

    :cond_3
    or-int/lit16 v1, v1, 0x180

    and-int/lit16 v2, v8, 0xc00

    if-nez v2, :cond_6

    and-int/lit8 v2, p9, 0x8

    if-nez v2, :cond_4

    move-object/from16 v2, p3

    invoke-virtual {v0, v2}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_5

    const/16 v3, 0x800

    goto :goto_3

    :cond_4
    move-object/from16 v2, p3

    :cond_5
    const/16 v3, 0x400

    :goto_3
    or-int/2addr v1, v3

    goto :goto_4

    :cond_6
    move-object/from16 v2, p3

    :goto_4
    and-int/lit16 v3, v8, 0x6000

    if-nez v3, :cond_9

    and-int/lit8 v3, p9, 0x10

    if-nez v3, :cond_7

    move-object/from16 v3, p4

    invoke-virtual {v0, v3}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_8

    const/16 v4, 0x4000

    goto :goto_5

    :cond_7
    move-object/from16 v3, p4

    :cond_8
    const/16 v4, 0x2000

    :goto_5
    or-int/2addr v1, v4

    goto :goto_6

    :cond_9
    move-object/from16 v3, p4

    :goto_6
    and-int/lit8 v4, p9, 0x20

    const/4 v5, 0x0

    const/high16 v6, 0x30000

    if-eqz v4, :cond_a

    or-int/2addr v1, v6

    goto :goto_8

    :cond_a
    and-int v4, v8, v6

    if-nez v4, :cond_c

    invoke-virtual {v0, v5}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_b

    const/high16 v4, 0x20000

    goto :goto_7

    :cond_b
    const/high16 v4, 0x10000

    :goto_7
    or-int/2addr v1, v4

    :cond_c
    :goto_8
    and-int/lit8 v4, p9, 0x40

    const/high16 v6, 0x180000

    if-eqz v4, :cond_d

    or-int/2addr v1, v6

    goto :goto_a

    :cond_d
    and-int v4, v8, v6

    if-nez v4, :cond_f

    invoke-virtual {v0, v5}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_e

    const/high16 v4, 0x100000

    goto :goto_9

    :cond_e
    const/high16 v4, 0x80000

    :goto_9
    or-int/2addr v1, v4

    :cond_f
    :goto_a
    const/high16 v4, 0x6c00000

    or-int/2addr v1, v4

    const/high16 v4, 0x30000000

    and-int/2addr v4, v8

    move-object/from16 v7, p6

    if-nez v4, :cond_11

    invoke-virtual {v0, v7}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_10

    const/high16 v4, 0x20000000

    goto :goto_b

    :cond_10
    const/high16 v4, 0x10000000

    :goto_b
    or-int/2addr v1, v4

    :cond_11
    const v4, 0x12492493

    and-int/2addr v4, v1

    const v5, 0x12492492

    const/4 v6, 0x1

    if-eq v4, v5, :cond_12

    move v4, v6

    goto :goto_c

    :cond_12
    const/4 v4, 0x0

    :goto_c
    and-int/lit8 v5, v1, 0x1

    invoke-virtual {v0, v5, v4}, Lp1/q;->U(IZ)Z

    move-result v4

    if-eqz v4, :cond_19

    invoke-virtual {v0}, Lp1/q;->Z()V

    and-int/lit8 v4, v8, 0x1

    const v5, -0xe001

    if-eqz v4, :cond_16

    invoke-virtual {v0}, Lp1/q;->C()Z

    move-result v4

    if-eqz v4, :cond_13

    goto :goto_d

    :cond_13
    invoke-virtual {v0}, Lp1/q;->X()V

    and-int/lit8 v4, p9, 0x8

    if-eqz v4, :cond_14

    and-int/lit16 v1, v1, -0x1c01

    :cond_14
    and-int/lit8 v4, p9, 0x10

    if-eqz v4, :cond_15

    and-int/2addr v1, v5

    :cond_15
    move/from16 v11, p2

    move-object/from16 v16, p5

    move-object v12, v2

    move-object v13, v3

    goto :goto_e

    :cond_16
    :goto_d
    and-int/lit8 v4, p9, 0x8

    if-eqz v4, :cond_17

    sget-object v2, Ll1/g;->a:Ll0/l1;

    sget-object v2, Lo1/b;->b:Lo1/t;

    invoke-static {v2, v0}, Ll1/q3;->b(Lo1/t;Landroidx/compose/runtime/Composer;)Li2/a1;

    move-result-object v2

    and-int/lit16 v1, v1, -0x1c01

    :cond_17
    and-int/lit8 v4, p9, 0x10

    if-eqz v4, :cond_18

    sget-object v3, Ll1/g;->a:Ll0/l1;

    sget-object v3, Ll1/n;->a:Lp1/u2;

    invoke-virtual {v0, v3}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ll1/m;

    invoke-static {v3}, Ll1/g;->a(Ll1/m;)Ll1/f;

    move-result-object v3

    and-int/2addr v1, v5

    :cond_18
    sget-object v4, Ll1/g;->a:Ll0/l1;

    move-object v12, v2

    move-object v13, v3

    move-object/from16 v16, v4

    move v11, v6

    :goto_e
    invoke-virtual {v0}, Lp1/q;->r()V

    const v2, 0x7ffffffe

    and-int v19, v1, v2

    const/16 v20, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    move-object/from16 v18, v0

    move-object/from16 v17, v7

    invoke-static/range {v9 .. v20}, Ll1/k3;->a(Lc93/a;Landroidx/compose/ui/Modifier;ZLi2/a1;Ll1/f;Ll1/h;Lf0/t;Ll0/k1;Lx1/b;Landroidx/compose/runtime/Composer;II)V

    move v3, v11

    move-object v4, v12

    move-object v5, v13

    move-object/from16 v6, v16

    goto :goto_f

    :cond_19
    move-object/from16 v18, v0

    invoke-virtual/range {v18 .. v18}, Lp1/q;->X()V

    move-object/from16 v6, p5

    move-object v4, v2

    move-object v5, v3

    move/from16 v3, p2

    :goto_f
    invoke-virtual/range {v18 .. v18}, Lp1/q;->u()Lp1/v1;

    move-result-object v10

    if-eqz v10, :cond_1a

    new-instance v0, Lc31/f;

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move-object/from16 v7, p6

    move/from16 v9, p9

    invoke-direct/range {v0 .. v9}, Lc31/f;-><init>(Lc93/a;Landroidx/compose/ui/Modifier;ZLi2/a1;Ll1/f;Ll0/k1;Lx1/b;II)V

    iput-object v0, v10, Lp1/v1;->d:Lc93/m;

    :cond_1a
    return-void
.end method

.method public static final j(Ll1/r2;Lo1/n;)Ld0/i1;
    .locals 1

    invoke-virtual {p1}, Ljava/lang/Enum;->ordinal()I

    move-result p1

    if-eqz p1, :cond_5

    const/4 v0, 0x1

    if-eq p1, v0, :cond_4

    const/4 v0, 0x2

    if-eq p1, v0, :cond_3

    const/4 v0, 0x3

    if-eq p1, v0, :cond_2

    const/4 v0, 0x4

    if-eq p1, v0, :cond_1

    const/4 v0, 0x5

    if-ne p1, v0, :cond_0

    check-cast p0, Ll1/q2;

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object p0, Ll1/q2;->g:Ld0/i1;

    const-string p1, "null cannot be cast to non-null type androidx.compose.animation.core.FiniteAnimationSpec<T of androidx.compose.material3.MotionScheme.StandardMotionSchemeImpl.slowEffectsSpec>"

    invoke-static {p0, p1}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p0

    :cond_0
    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p0

    :cond_1
    check-cast p0, Ll1/q2;

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object p0, Ll1/q2;->f:Ld0/i1;

    const-string p1, "null cannot be cast to non-null type androidx.compose.animation.core.FiniteAnimationSpec<T of androidx.compose.material3.MotionScheme.StandardMotionSchemeImpl.fastEffectsSpec>"

    invoke-static {p0, p1}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p0

    :cond_2
    check-cast p0, Ll1/q2;

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object p0, Ll1/q2;->e:Ld0/i1;

    const-string p1, "null cannot be cast to non-null type androidx.compose.animation.core.FiniteAnimationSpec<T of androidx.compose.material3.MotionScheme.StandardMotionSchemeImpl.defaultEffectsSpec>"

    invoke-static {p0, p1}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p0

    :cond_3
    check-cast p0, Ll1/q2;

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object p0, Ll1/q2;->d:Ld0/i1;

    const-string p1, "null cannot be cast to non-null type androidx.compose.animation.core.FiniteAnimationSpec<T of androidx.compose.material3.MotionScheme.StandardMotionSchemeImpl.slowSpatialSpec>"

    invoke-static {p0, p1}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p0

    :cond_4
    check-cast p0, Ll1/q2;

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object p0, Ll1/q2;->c:Ld0/i1;

    const-string p1, "null cannot be cast to non-null type androidx.compose.animation.core.FiniteAnimationSpec<T of androidx.compose.material3.MotionScheme.StandardMotionSchemeImpl.fastSpatialSpec>"

    invoke-static {p0, p1}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p0

    :cond_5
    check-cast p0, Ll1/q2;

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object p0, Ll1/q2;->b:Ld0/i1;

    const-string p1, "null cannot be cast to non-null type androidx.compose.animation.core.FiniteAnimationSpec<T of androidx.compose.material3.MotionScheme.StandardMotionSchemeImpl.defaultSpatialSpec>"

    invoke-static {p0, p1}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    return-object p0
.end method

.method public static k(Landroidx/compose/runtime/Composer;)Ll1/p1;
    .locals 18

    sget-object v0, Ll1/s;->a:Lp1/b0;

    move-object/from16 v1, p0

    check-cast v1, Lp1/q;

    invoke-virtual {v1, v0}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Li2/x;

    iget-wide v5, v0, Li2/x;->a:J

    sget-object v0, Ll1/n;->a:Lp1/u2;

    invoke-virtual {v1, v0}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ll1/m;

    iget-object v1, v0, Ll1/m;->a0:Ll1/p1;

    if-nez v1, :cond_0

    new-instance v2, Ll1/p1;

    sget-wide v3, Li2/x;->m:J

    sget v1, Lo1/x;->a:F

    invoke-static {v1, v5, v6}, Li2/x;->c(FJ)J

    move-result-wide v9

    move-wide v7, v3

    invoke-direct/range {v2 .. v10}, Ll1/p1;-><init>(JJJJ)V

    iput-object v2, v0, Ll1/m;->a0:Ll1/p1;

    move-object v1, v2

    :cond_0
    iget-wide v2, v1, Ll1/p1;->b:J

    invoke-static {v2, v3, v5, v6}, Li2/x;->d(JJ)Z

    move-result v0

    if-eqz v0, :cond_1

    return-object v1

    :cond_1
    sget v0, Lo1/x;->a:F

    invoke-static {v0, v5, v6}, Li2/x;->c(FJ)J

    move-result-wide v7

    iget-wide v10, v1, Ll1/p1;->a:J

    iget-wide v14, v1, Ll1/p1;->c:J

    const-wide/16 v12, 0x10

    cmp-long v0, v5, v12

    if-eqz v0, :cond_2

    goto :goto_0

    :cond_2
    move-wide v5, v2

    :goto_0
    cmp-long v0, v7, v12

    if-eqz v0, :cond_3

    :goto_1
    move-wide/from16 v16, v7

    goto :goto_2

    :cond_3
    iget-wide v7, v1, Ll1/p1;->d:J

    goto :goto_1

    :goto_2
    new-instance v9, Ll1/p1;

    move-wide v12, v5

    invoke-direct/range {v9 .. v17}, Ll1/p1;-><init>(JJJJ)V

    return-object v9
.end method

.method public static final l(Lp1/q;)Ll1/w3;
    .locals 4

    sget-object v0, Ll1/x3;->w:Ll1/x3;

    invoke-virtual {p0}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v0

    sget-object v1, Lp1/l;->a:Lp1/v0;

    if-ne v0, v1, :cond_0

    new-instance v0, Lkx1/b;

    const/4 v1, 0x7

    invoke-direct {v0, v1}, Lkx1/b;-><init>(I)V

    invoke-virtual {p0, v0}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_0
    check-cast v0, Lkotlin/jvm/functions/Function1;

    const/16 v1, 0xd80

    const/16 v2, 0x31

    const/4 v3, 0x0

    invoke-static {v3, v0, v1, p0, v2}, Ll1/t3;->b(ZLkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll1/w3;

    move-result-object p0

    return-object p0
.end method

.method public static final m(Lo1/n;Landroidx/compose/runtime/Composer;)Ld0/i1;
    .locals 1

    sget-object v0, Ll1/x1;->a:Lp1/u2;

    check-cast p1, Lp1/q;

    invoke-virtual {p1, v0}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ll1/r2;

    invoke-static {p1, p0}, Ll1/k3;->j(Ll1/r2;Lo1/n;)Ld0/i1;

    move-result-object p0

    return-object p0
.end method
