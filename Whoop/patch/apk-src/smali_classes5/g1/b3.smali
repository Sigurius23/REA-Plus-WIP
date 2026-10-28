.class public abstract Lg1/b3;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:F


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0x38

    int-to-float v0, v0

    sput v0, Lg1/b3;->a:F

    return-void
.end method

.method public static final a(Lc93/a;Landroidx/compose/ui/Modifier;Li2/a1;JJLg1/t1;Lx1/b;Landroidx/compose/runtime/Composer;II)V
    .locals 20

    move-object/from16 v2, p1

    move-wide/from16 v6, p5

    move-object/from16 v0, p8

    move/from16 v1, p10

    move-object/from16 v15, p9

    check-cast v15, Lp1/q;

    const v3, -0x1cc51c1d

    invoke-virtual {v15, v3}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v3, v1, 0x6

    if-nez v3, :cond_1

    move-object/from16 v3, p0

    invoke-virtual {v15, v3}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_0

    const/4 v4, 0x4

    goto :goto_0

    :cond_0
    const/4 v4, 0x2

    :goto_0
    or-int/2addr v4, v1

    goto :goto_1

    :cond_1
    move-object/from16 v3, p0

    move v4, v1

    :goto_1
    and-int/lit8 v5, v1, 0x30

    if-nez v5, :cond_3

    invoke-virtual {v15, v2}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_2

    const/16 v5, 0x20

    goto :goto_2

    :cond_2
    const/16 v5, 0x10

    :goto_2
    or-int/2addr v4, v5

    :cond_3
    and-int/lit8 v5, p11, 0x4

    const/4 v9, 0x0

    if-eqz v5, :cond_4

    or-int/lit16 v4, v4, 0x180

    goto :goto_4

    :cond_4
    and-int/lit16 v5, v1, 0x180

    if-nez v5, :cond_6

    invoke-virtual {v15, v9}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_5

    const/16 v5, 0x100

    goto :goto_3

    :cond_5
    const/16 v5, 0x80

    :goto_3
    or-int/2addr v4, v5

    :cond_6
    :goto_4
    and-int/lit16 v5, v1, 0xc00

    if-nez v5, :cond_9

    and-int/lit8 v5, p11, 0x8

    if-nez v5, :cond_7

    move-object/from16 v5, p2

    invoke-virtual {v15, v5}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_8

    const/16 v10, 0x800

    goto :goto_5

    :cond_7
    move-object/from16 v5, p2

    :cond_8
    const/16 v10, 0x400

    :goto_5
    or-int/2addr v4, v10

    goto :goto_6

    :cond_9
    move-object/from16 v5, p2

    :goto_6
    and-int/lit16 v10, v1, 0x6000

    if-nez v10, :cond_b

    move-wide/from16 v10, p3

    invoke-virtual {v15, v10, v11}, Lp1/q;->f(J)Z

    move-result v12

    if-eqz v12, :cond_a

    const/16 v12, 0x4000

    goto :goto_7

    :cond_a
    const/16 v12, 0x2000

    :goto_7
    or-int/2addr v4, v12

    goto :goto_8

    :cond_b
    move-wide/from16 v10, p3

    :goto_8
    const/high16 v12, 0x30000

    and-int/2addr v12, v1

    if-nez v12, :cond_d

    invoke-virtual {v15, v6, v7}, Lp1/q;->f(J)Z

    move-result v12

    if-eqz v12, :cond_c

    const/high16 v12, 0x20000

    goto :goto_9

    :cond_c
    const/high16 v12, 0x10000

    :goto_9
    or-int/2addr v4, v12

    :cond_d
    const/high16 v12, 0x180000

    and-int/2addr v12, v1

    if-nez v12, :cond_10

    and-int/lit8 v12, p11, 0x40

    if-nez v12, :cond_e

    move-object/from16 v12, p7

    invoke-virtual {v15, v12}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v13

    if-eqz v13, :cond_f

    const/high16 v13, 0x100000

    goto :goto_a

    :cond_e
    move-object/from16 v12, p7

    :cond_f
    const/high16 v13, 0x80000

    :goto_a
    or-int/2addr v4, v13

    goto :goto_b

    :cond_10
    move-object/from16 v12, p7

    :goto_b
    const/high16 v13, 0xc00000

    and-int/2addr v13, v1

    if-nez v13, :cond_12

    invoke-virtual {v15, v0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v13

    if-eqz v13, :cond_11

    const/high16 v13, 0x800000

    goto :goto_c

    :cond_11
    const/high16 v13, 0x400000

    :goto_c
    or-int/2addr v4, v13

    :cond_12
    const v13, 0x492493

    and-int/2addr v13, v4

    const v14, 0x492492

    const/16 v16, 0x1

    if-eq v13, v14, :cond_13

    move/from16 v13, v16

    goto :goto_d

    :cond_13
    const/4 v13, 0x0

    :goto_d
    and-int/lit8 v14, v4, 0x1

    invoke-virtual {v15, v14, v13}, Lp1/q;->U(IZ)Z

    move-result v13

    if-eqz v13, :cond_26

    invoke-virtual {v15}, Lp1/q;->Z()V

    and-int/lit8 v13, v1, 0x1

    const v14, -0x380001

    if-eqz v13, :cond_17

    invoke-virtual {v15}, Lp1/q;->C()Z

    move-result v13

    if-eqz v13, :cond_14

    goto :goto_e

    :cond_14
    invoke-virtual {v15}, Lp1/q;->X()V

    and-int/lit8 v13, p11, 0x8

    if-eqz v13, :cond_15

    and-int/lit16 v4, v4, -0x1c01

    :cond_15
    and-int/lit8 v13, p11, 0x40

    if-eqz v13, :cond_16

    and-int/2addr v4, v14

    :cond_16
    move-object v1, v12

    goto :goto_f

    :cond_17
    :goto_e
    and-int/lit8 v13, p11, 0x8

    if-eqz v13, :cond_18

    sget-object v5, Lg1/m5;->a:Lp1/u2;

    invoke-virtual {v15, v5}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lg1/l5;

    iget-object v5, v5, Lg1/l5;->a:Lt0/a;

    const/16 v13, 0x32

    invoke-static {v13}, Lt0/d;->a(I)Lt0/g;

    move-result-object v13

    invoke-virtual {v5, v13}, Lt0/a;->b(Lt0/b;)Lt0/a;

    move-result-object v5

    and-int/lit16 v4, v4, -0x1c01

    :cond_18
    and-int/lit8 v13, p11, 0x40

    if-eqz v13, :cond_16

    const/4 v12, 0x6

    int-to-float v12, v12

    const/16 v13, 0xc

    int-to-float v13, v13

    move/from16 v17, v14

    const/16 v14, 0x8

    int-to-float v8, v14

    int-to-float v14, v14

    invoke-virtual {v15, v12}, Lp1/q;->d(F)Z

    move-result v18

    invoke-virtual {v15, v13}, Lp1/q;->d(F)Z

    move-result v19

    or-int v18, v18, v19

    invoke-virtual {v15, v8}, Lp1/q;->d(F)Z

    move-result v19

    or-int v18, v18, v19

    invoke-virtual {v15, v14}, Lp1/q;->d(F)Z

    move-result v19

    or-int v18, v18, v19

    invoke-virtual {v15}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v9

    if-nez v18, :cond_19

    sget-object v1, Lp1/l;->a:Lp1/v0;

    if-ne v9, v1, :cond_1a

    :cond_19
    new-instance v9, Lg1/t1;

    invoke-direct {v9, v12, v13, v8, v14}, Lg1/t1;-><init>(FFFF)V

    invoke-virtual {v15, v9}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_1a
    move-object v1, v9

    check-cast v1, Lg1/t1;

    and-int v4, v4, v17

    :goto_f
    invoke-virtual {v15}, Lp1/q;->r()V

    const v8, 0x2269678

    invoke-virtual {v15, v8}, Lp1/q;->e0(I)V

    invoke-virtual {v15}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v8

    sget-object v9, Lp1/l;->a:Lp1/v0;

    if-ne v8, v9, :cond_1b

    invoke-static {v15}, Ld;->g(Lp1/q;)Lj0/j;

    move-result-object v8

    :cond_1b
    move-object v13, v8

    check-cast v13, Lj0/i;

    const/4 v8, 0x0

    invoke-virtual {v15, v8}, Lp1/q;->q(Z)V

    invoke-virtual {v15}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v12

    if-ne v12, v9, :cond_1c

    new-instance v12, Lfq2/c;

    const/16 v14, 0x17

    invoke-direct {v12, v14}, Lfq2/c;-><init>(I)V

    invoke-virtual {v15, v12}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_1c
    check-cast v12, Lkotlin/jvm/functions/Function1;

    invoke-static {v2, v8, v12}, Li3/n;->c(Landroidx/compose/ui/Modifier;ZLkotlin/jvm/functions/Function1;)Landroidx/compose/ui/Modifier;

    move-result-object v12

    shr-int/lit8 v8, v4, 0xf

    and-int/lit8 v14, v8, 0x70

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const v2, -0x1c84f447

    invoke-virtual {v15, v2}, Lp1/q;->e0(I)V

    invoke-virtual {v15, v13}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v2

    move/from16 p2, v2

    invoke-virtual {v15}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    if-nez p2, :cond_1e

    if-ne v2, v9, :cond_1d

    goto :goto_10

    :cond_1d
    move-object/from16 p2, v5

    move/from16 p7, v8

    goto :goto_11

    :cond_1e
    :goto_10
    new-instance v2, Lg1/z2;

    iget v3, v1, Lg1/t1;->a:F

    move-object/from16 p2, v5

    iget v5, v1, Lg1/t1;->b:F

    move/from16 p7, v8

    iget v8, v1, Lg1/t1;->c:F

    iget v10, v1, Lg1/t1;->d:F

    invoke-direct {v2, v3, v5, v8, v10}, Lg1/z2;-><init>(FFFF)V

    invoke-virtual {v15, v2}, Lp1/q;->p0(Ljava/lang/Object;)V

    :goto_11
    check-cast v2, Lg1/z2;

    invoke-virtual {v15, v2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v3

    xor-int/lit8 v5, v14, 0x30

    const/16 v8, 0x20

    if-le v5, v8, :cond_1f

    invoke-virtual {v15, v1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_21

    :cond_1f
    and-int/lit8 v5, p7, 0x30

    if-ne v5, v8, :cond_20

    goto :goto_12

    :cond_20
    const/16 v16, 0x0

    :cond_21
    :goto_12
    or-int v3, v3, v16

    invoke-virtual {v15}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    if-nez v3, :cond_22

    if-ne v5, v9, :cond_23

    :cond_22
    new-instance v5, Ld30/o;

    const/16 v3, 0x10

    const/4 v8, 0x0

    invoke-direct {v5, v2, v1, v8, v3}, Ld30/o;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V

    invoke-virtual {v15, v5}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_23
    check-cast v5, Lc93/m;

    invoke-static {v15, v5, v1}, Lp1/x;->g(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual {v15, v13}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v3

    invoke-virtual {v15, v2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v5

    or-int/2addr v3, v5

    invoke-virtual {v15}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    if-nez v3, :cond_24

    if-ne v5, v9, :cond_25

    :cond_24
    new-instance v5, La1/h;

    const/16 v3, 0x1c

    const/4 v8, 0x0

    invoke-direct {v5, v13, v2, v8, v3}, La1/h;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V

    invoke-virtual {v15, v5}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_25
    check-cast v5, Lc93/m;

    invoke-static {v15, v5, v13}, Lp1/x;->g(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-object v2, v2, Lg1/z2;->e:Ld0/e;

    iget-object v2, v2, Ld0/e;->c:Ld0/m;

    const/4 v8, 0x0

    invoke-virtual {v15, v8}, Lp1/q;->q(Z)V

    iget-object v2, v2, Ld0/m;->x:Lp1/k1;

    invoke-virtual {v2}, Lp1/k1;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ly3/f;

    iget v2, v2, Ly3/f;->w:F

    new-instance v3, Lg1/a3;

    const/4 v5, 0x0

    invoke-direct {v3, v6, v7, v0, v5}, Lg1/a3;-><init>(JLjava/lang/Object;I)V

    const v5, -0x6caf9816

    invoke-static {v5, v15, v3}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v14

    const/high16 v3, 0x30000000

    and-int/lit8 v5, v4, 0xe

    or-int/2addr v3, v5

    and-int/lit16 v5, v4, 0x1c00

    or-int/2addr v3, v5

    const v5, 0xe000

    and-int/2addr v5, v4

    or-int/2addr v3, v5

    const/high16 v5, 0x70000

    and-int/2addr v4, v5

    or-int v16, v3, v4

    const/16 v17, 0x44

    const/4 v5, 0x0

    const/4 v11, 0x0

    move-object/from16 v3, p0

    move-wide v9, v6

    move-object v4, v12

    move-object/from16 v6, p2

    move-wide/from16 v7, p3

    move v12, v2

    invoke-static/range {v3 .. v17}, Lhg3/i;->l(Lc93/a;Landroidx/compose/ui/Modifier;ZLi2/a1;JJLf0/t;FLj0/i;Lx1/b;Landroidx/compose/runtime/Composer;II)V

    move-object v8, v1

    move-object v3, v6

    goto :goto_13

    :cond_26
    invoke-virtual {v15}, Lp1/q;->X()V

    move-object v3, v5

    move-object v8, v12

    :goto_13
    invoke-virtual {v15}, Lp1/q;->u()Lp1/v1;

    move-result-object v12

    if-eqz v12, :cond_27

    new-instance v0, Lhy0/h2;

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move-wide/from16 v4, p3

    move-wide/from16 v6, p5

    move-object/from16 v9, p8

    move/from16 v10, p10

    move/from16 v11, p11

    invoke-direct/range {v0 .. v11}, Lhy0/h2;-><init>(Lc93/a;Landroidx/compose/ui/Modifier;Li2/a1;JJLg1/t1;Lx1/b;II)V

    iput-object v0, v12, Lp1/v1;->d:Lc93/m;

    :cond_27
    return-void
.end method
