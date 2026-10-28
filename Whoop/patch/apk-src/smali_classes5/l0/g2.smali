.class public abstract Ll0/g2;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lkf0/l;

.field public static final b:I = 0x9

.field public static final c:I = 0x6

.field public static final d:I = 0xa

.field public static final e:I = 0x5


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Lkf0/l;

    const/4 v1, 0x3

    invoke-direct {v0, v1}, Lkf0/l;-><init>(I)V

    sput-object v0, Ll0/g2;->a:Lkf0/l;

    return-void
.end method

.method public static final a(Landroidx/compose/ui/Modifier;Ll0/i;Ll0/l;Lb2/g;IILkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V
    .locals 19

    move/from16 v8, p8

    move-object/from16 v0, p7

    check-cast v0, Lp1/q;

    const v1, -0x4dacdb7f

    invoke-virtual {v0, v1}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v1, p9, 0x1

    if-eqz v1, :cond_0

    or-int/lit8 v2, v8, 0x6

    move v3, v2

    move-object/from16 v2, p0

    goto :goto_1

    :cond_0
    and-int/lit8 v2, v8, 0x6

    if-nez v2, :cond_2

    move-object/from16 v2, p0

    invoke-virtual {v0, v2}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_1

    const/4 v3, 0x4

    goto :goto_0

    :cond_1
    const/4 v3, 0x2

    :goto_0
    or-int/2addr v3, v8

    goto :goto_1

    :cond_2
    move-object/from16 v2, p0

    move v3, v8

    :goto_1
    and-int/lit8 v4, p9, 0x2

    if-eqz v4, :cond_4

    or-int/lit8 v3, v3, 0x30

    :cond_3
    move-object/from16 v5, p1

    goto :goto_3

    :cond_4
    and-int/lit8 v5, v8, 0x30

    if-nez v5, :cond_3

    move-object/from16 v5, p1

    invoke-virtual {v0, v5}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_5

    const/16 v6, 0x20

    goto :goto_2

    :cond_5
    const/16 v6, 0x10

    :goto_2
    or-int/2addr v3, v6

    :goto_3
    and-int/lit8 v6, p9, 0x4

    if-eqz v6, :cond_7

    or-int/lit16 v3, v3, 0x180

    :cond_6
    move-object/from16 v7, p2

    goto :goto_5

    :cond_7
    and-int/lit16 v7, v8, 0x180

    if-nez v7, :cond_6

    move-object/from16 v7, p2

    invoke-virtual {v0, v7}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_8

    const/16 v9, 0x100

    goto :goto_4

    :cond_8
    const/16 v9, 0x80

    :goto_4
    or-int/2addr v3, v9

    :goto_5
    and-int/lit8 v9, p9, 0x8

    if-eqz v9, :cond_a

    or-int/lit16 v3, v3, 0xc00

    :cond_9
    move-object/from16 v10, p3

    goto :goto_7

    :cond_a
    and-int/lit16 v10, v8, 0xc00

    if-nez v10, :cond_9

    move-object/from16 v10, p3

    invoke-virtual {v0, v10}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_b

    const/16 v11, 0x800

    goto :goto_6

    :cond_b
    const/16 v11, 0x400

    :goto_6
    or-int/2addr v3, v11

    :goto_7
    and-int/lit8 v11, p9, 0x10

    if-eqz v11, :cond_d

    or-int/lit16 v3, v3, 0x6000

    :cond_c
    move/from16 v12, p4

    goto :goto_9

    :cond_d
    and-int/lit16 v12, v8, 0x6000

    if-nez v12, :cond_c

    move/from16 v12, p4

    invoke-virtual {v0, v12}, Lp1/q;->e(I)Z

    move-result v13

    if-eqz v13, :cond_e

    const/16 v13, 0x4000

    goto :goto_8

    :cond_e
    const/16 v13, 0x2000

    :goto_8
    or-int/2addr v3, v13

    :goto_9
    const/high16 v13, 0x30000

    or-int/2addr v3, v13

    const/high16 v13, 0x180000

    and-int v14, v8, v13

    move-object/from16 v15, p6

    if-nez v14, :cond_10

    invoke-virtual {v0, v15}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v14

    if-eqz v14, :cond_f

    const/high16 v14, 0x100000

    goto :goto_a

    :cond_f
    const/high16 v14, 0x80000

    :goto_a
    or-int/2addr v3, v14

    :cond_10
    const v14, 0x92493

    and-int/2addr v14, v3

    move/from16 p7, v13

    const v13, 0x92492

    if-eq v14, v13, :cond_11

    const/4 v13, 0x1

    goto :goto_b

    :cond_11
    const/4 v13, 0x0

    :goto_b
    and-int/lit8 v14, v3, 0x1

    invoke-virtual {v0, v14, v13}, Lp1/q;->U(IZ)Z

    move-result v13

    if-eqz v13, :cond_17

    if-eqz v1, :cond_12

    sget-object v1, Lb2/t;->w:Lb2/t;

    move/from16 v18, v9

    move-object v9, v1

    move/from16 v1, v18

    goto :goto_c

    :cond_12
    move v1, v9

    move-object v9, v2

    :goto_c
    if-eqz v4, :cond_13

    sget-object v2, Ll0/m;->a:Ll0/e;

    move-object v10, v2

    goto :goto_d

    :cond_13
    move-object v10, v5

    :goto_d
    if-eqz v6, :cond_14

    sget-object v2, Ll0/m;->c:Ll0/g;

    move/from16 v18, v11

    move-object v11, v2

    move/from16 v2, v18

    goto :goto_e

    :cond_14
    move v2, v11

    move-object v11, v7

    :goto_e
    if-eqz v1, :cond_15

    sget-object v1, Lb2/e;->J:Lb2/l;

    move-object v12, v1

    goto :goto_f

    :cond_15
    move-object/from16 v12, p3

    :goto_f
    const v1, 0x7fffffff

    if-eqz v2, :cond_16

    move v13, v1

    goto :goto_10

    :cond_16
    move/from16 v13, p4

    :goto_10
    sget-object v14, Ll0/r0;->f:Ll0/r0;

    and-int/lit8 v2, v3, 0xe

    or-int v2, v2, p7

    and-int/lit8 v4, v3, 0x70

    or-int/2addr v2, v4

    and-int/lit16 v4, v3, 0x380

    or-int/2addr v2, v4

    and-int/lit16 v4, v3, 0x1c00

    or-int/2addr v2, v4

    const v4, 0xe000

    and-int/2addr v4, v3

    or-int/2addr v2, v4

    const/high16 v4, 0x70000

    and-int/2addr v4, v3

    or-int/2addr v2, v4

    shl-int/lit8 v3, v3, 0x3

    const/high16 v4, 0x1c00000

    and-int/2addr v3, v4

    or-int v17, v2, v3

    move-object/from16 v16, v0

    invoke-static/range {v9 .. v17}, Ll0/g2;->b(Landroidx/compose/ui/Modifier;Ll0/i;Ll0/l;Lb2/g;ILl0/r0;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;I)V

    move v6, v1

    move-object v1, v9

    move-object v2, v10

    move-object v3, v11

    move-object v4, v12

    move v5, v13

    goto :goto_11

    :cond_17
    move-object/from16 v16, v0

    invoke-virtual/range {v16 .. v16}, Lp1/q;->X()V

    move-object/from16 v4, p3

    move/from16 v6, p5

    move-object v1, v2

    move-object v2, v5

    move-object v3, v7

    move/from16 v5, p4

    :goto_11
    invoke-virtual/range {v16 .. v16}, Lp1/q;->u()Lp1/v1;

    move-result-object v10

    if-eqz v10, :cond_18

    new-instance v0, Ll0/m0;

    move-object/from16 v7, p6

    move/from16 v9, p9

    invoke-direct/range {v0 .. v9}, Ll0/m0;-><init>(Landroidx/compose/ui/Modifier;Ll0/i;Ll0/l;Lb2/g;IILkotlin/jvm/functions/Function3;II)V

    iput-object v0, v10, Lp1/v1;->d:Lc93/m;

    :cond_18
    return-void
.end method

.method public static final b(Landroidx/compose/ui/Modifier;Ll0/i;Ll0/l;Lb2/g;ILl0/r0;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;I)V
    .locals 18

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move-object/from16 v0, p3

    move/from16 v8, p4

    move-object/from16 v10, p6

    move/from16 v11, p8

    move-object/from16 v12, p7

    check-cast v12, Lp1/q;

    const v4, -0x749f38e1

    invoke-virtual {v12, v4}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v4, v11, 0x6

    const/4 v5, 0x4

    if-nez v4, :cond_1

    invoke-virtual {v12, v1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_0

    move v4, v5

    goto :goto_0

    :cond_0
    const/4 v4, 0x2

    :goto_0
    or-int/2addr v4, v11

    goto :goto_1

    :cond_1
    move v4, v11

    :goto_1
    and-int/lit8 v6, v11, 0x30

    const/16 v7, 0x20

    if-nez v6, :cond_3

    invoke-virtual {v12, v2}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_2

    move v6, v7

    goto :goto_2

    :cond_2
    const/16 v6, 0x10

    :goto_2
    or-int/2addr v4, v6

    :cond_3
    and-int/lit16 v6, v11, 0x180

    if-nez v6, :cond_5

    invoke-virtual {v12, v3}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_4

    const/16 v6, 0x100

    goto :goto_3

    :cond_4
    const/16 v6, 0x80

    :goto_3
    or-int/2addr v4, v6

    :cond_5
    and-int/lit16 v6, v11, 0xc00

    if-nez v6, :cond_7

    invoke-virtual {v12, v0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_6

    const/16 v6, 0x800

    goto :goto_4

    :cond_6
    const/16 v6, 0x400

    :goto_4
    or-int/2addr v4, v6

    :cond_7
    and-int/lit16 v6, v11, 0x6000

    if-nez v6, :cond_9

    invoke-virtual {v12, v8}, Lp1/q;->e(I)Z

    move-result v6

    if-eqz v6, :cond_8

    const/16 v6, 0x4000

    goto :goto_5

    :cond_8
    const/16 v6, 0x2000

    :goto_5
    or-int/2addr v4, v6

    :cond_9
    const/high16 v6, 0x30000

    and-int/2addr v6, v11

    const v15, 0x7fffffff

    if-nez v6, :cond_b

    invoke-virtual {v12, v15}, Lp1/q;->e(I)Z

    move-result v6

    if-eqz v6, :cond_a

    const/high16 v6, 0x20000

    goto :goto_6

    :cond_a
    const/high16 v6, 0x10000

    :goto_6
    or-int/2addr v4, v6

    :cond_b
    const/high16 v6, 0x180000

    and-int/2addr v6, v11

    const/high16 v14, 0x100000

    if-nez v6, :cond_d

    move-object/from16 v6, p5

    invoke-virtual {v12, v6}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v16

    if-eqz v16, :cond_c

    move/from16 v16, v14

    goto :goto_7

    :cond_c
    const/high16 v16, 0x80000

    :goto_7
    or-int v4, v4, v16

    goto :goto_8

    :cond_d
    move-object/from16 v6, p5

    :goto_8
    const/high16 v16, 0xc00000

    and-int v16, v11, v16

    if-nez v16, :cond_f

    invoke-virtual {v12, v10}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v16

    if-eqz v16, :cond_e

    const/high16 v16, 0x800000

    goto :goto_9

    :cond_e
    const/high16 v16, 0x400000

    :goto_9
    or-int v4, v4, v16

    :cond_f
    move/from16 v16, v4

    const v4, 0x492493

    and-int v4, v16, v4

    const v15, 0x492492

    if-eq v4, v15, :cond_10

    const/4 v4, 0x1

    goto :goto_a

    :cond_10
    const/4 v4, 0x0

    :goto_a
    and-int/lit8 v15, v16, 0x1

    invoke-virtual {v12, v15, v4}, Lp1/q;->U(IZ)Z

    move-result v4

    if-eqz v4, :cond_2f

    const/high16 v4, 0x380000

    and-int v15, v16, v4

    if-ne v15, v14, :cond_11

    const/4 v4, 0x1

    goto :goto_b

    :cond_11
    const/4 v4, 0x0

    :goto_b
    invoke-virtual {v12}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v13

    sget-object v14, Lp1/l;->a:Lp1/v0;

    if-nez v4, :cond_12

    if-ne v13, v14, :cond_13

    :cond_12
    new-instance v13, Ll0/o0;

    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v4, Ll0/n0;->w:Ll0/n0;

    invoke-direct {v13}, Ljava/lang/Object;-><init>()V

    invoke-virtual {v12, v13}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_13
    check-cast v13, Ll0/o0;

    shr-int/lit8 v4, v16, 0x3

    and-int/lit8 v17, v4, 0xe

    xor-int/lit8 v9, v17, 0x6

    if-le v9, v5, :cond_14

    invoke-virtual {v12, v2}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v9

    if-nez v9, :cond_15

    :cond_14
    and-int/lit8 v9, v4, 0x6

    if-ne v9, v5, :cond_16

    :cond_15
    const/4 v5, 0x1

    goto :goto_c

    :cond_16
    const/4 v5, 0x0

    :goto_c
    and-int/lit8 v9, v4, 0x70

    xor-int/lit8 v9, v9, 0x30

    if-le v9, v7, :cond_17

    invoke-virtual {v12, v3}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v9

    if-nez v9, :cond_18

    :cond_17
    and-int/lit8 v9, v4, 0x30

    if-ne v9, v7, :cond_19

    :cond_18
    const/4 v7, 0x1

    goto :goto_d

    :cond_19
    const/4 v7, 0x0

    :goto_d
    or-int/2addr v5, v7

    and-int/lit16 v7, v4, 0x380

    xor-int/lit16 v7, v7, 0x180

    const/16 v9, 0x100

    if-le v7, v9, :cond_1a

    invoke-virtual {v12, v0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_1b

    :cond_1a
    and-int/lit16 v7, v4, 0x180

    if-ne v7, v9, :cond_1c

    :cond_1b
    const/4 v7, 0x1

    goto :goto_e

    :cond_1c
    const/4 v7, 0x0

    :goto_e
    or-int/2addr v5, v7

    and-int/lit16 v7, v4, 0x1c00

    xor-int/lit16 v7, v7, 0xc00

    const/16 v9, 0x800

    if-le v7, v9, :cond_1d

    invoke-virtual {v12, v8}, Lp1/q;->e(I)Z

    move-result v7

    if-nez v7, :cond_1e

    :cond_1d
    and-int/lit16 v7, v4, 0xc00

    if-ne v7, v9, :cond_1f

    :cond_1e
    const/4 v7, 0x1

    goto :goto_f

    :cond_1f
    const/4 v7, 0x0

    :goto_f
    or-int/2addr v5, v7

    const v7, 0xe000

    and-int/2addr v7, v4

    xor-int/lit16 v7, v7, 0x6000

    const/16 v9, 0x4000

    if-le v7, v9, :cond_20

    const v7, 0x7fffffff

    invoke-virtual {v12, v7}, Lp1/q;->e(I)Z

    move-result v7

    if-nez v7, :cond_21

    :cond_20
    and-int/lit16 v4, v4, 0x6000

    if-ne v4, v9, :cond_22

    :cond_21
    const/4 v4, 0x1

    goto :goto_10

    :cond_22
    const/4 v4, 0x0

    :goto_10
    or-int/2addr v4, v5

    invoke-virtual {v12, v13}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v5

    or-int/2addr v4, v5

    invoke-virtual {v12}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    if-nez v4, :cond_23

    if-ne v5, v14, :cond_24

    :cond_23
    invoke-interface {v2}, Ll0/i;->a()F

    move-result v5

    new-instance v6, Ll0/d0;

    invoke-direct {v6, v0}, Ll0/d0;-><init>(Lb2/g;)V

    invoke-interface {v3}, Ll0/l;->a()F

    move-result v7

    new-instance v2, Ll0/q0;

    move-object v4, v3

    move-object v9, v13

    move-object/from16 v3, p1

    invoke-direct/range {v2 .. v9}, Ll0/q0;-><init>(Ll0/i;Ll0/l;FLl0/d0;FILl0/o0;)V

    invoke-virtual {v12, v2}, Lp1/q;->p0(Ljava/lang/Object;)V

    move-object v5, v2

    :cond_24
    check-cast v5, Ll0/q0;

    const/high16 v2, 0x100000

    if-ne v15, v2, :cond_25

    const/4 v2, 0x1

    goto :goto_11

    :cond_25
    const/4 v2, 0x0

    :goto_11
    const/high16 v3, 0x1c00000

    and-int v3, v16, v3

    const/high16 v4, 0x800000

    if-ne v3, v4, :cond_26

    const/4 v3, 0x1

    goto :goto_12

    :cond_26
    const/4 v3, 0x0

    :goto_12
    or-int/2addr v2, v3

    const/high16 v3, 0x70000

    and-int v3, v16, v3

    const/high16 v4, 0x20000

    if-ne v3, v4, :cond_27

    const/4 v3, 0x1

    goto :goto_13

    :cond_27
    const/4 v3, 0x0

    :goto_13
    or-int/2addr v2, v3

    invoke-virtual {v12}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    if-nez v2, :cond_28

    if-ne v3, v14, :cond_29

    :cond_28
    new-instance v3, Ljava/util/ArrayList;

    invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V

    new-instance v2, Lg1/m0;

    const/4 v4, 0x5

    invoke-direct {v2, v4, v10}, Lg1/m0;-><init>(ILkotlin/jvm/functions/Function3;)V

    new-instance v4, Lx1/b;

    const v6, -0x471afb91

    const/4 v7, 0x1

    invoke-direct {v4, v2, v7, v6}, Lx1/b;-><init>(Ljava/lang/Object;ZI)V

    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    invoke-virtual/range {p5 .. p5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v2, Ll0/n0;->w:Ll0/n0;

    invoke-virtual {v12, v3}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_29
    check-cast v3, Ljava/util/List;

    new-instance v2, Lc4/e;

    const/16 v4, 0xd

    invoke-direct {v2, v3, v4}, Lc4/e;-><init>(Ljava/lang/Object;I)V

    new-instance v3, Lx1/b;

    const v4, 0x4bcece3c    # 2.7106424E7f

    const/4 v7, 0x1

    invoke-direct {v3, v2, v7, v4}, Lx1/b;-><init>(Ljava/lang/Object;ZI)V

    invoke-virtual {v12, v5}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v2

    invoke-virtual {v12}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    if-nez v2, :cond_2a

    if-ne v4, v14, :cond_2b

    :cond_2a
    new-instance v4, Ly2/a1;

    invoke-direct {v4, v5}, Ly2/a1;-><init>(Ly2/z0;)V

    invoke-virtual {v12, v4}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_2b
    check-cast v4, Ly2/r0;

    iget-wide v5, v12, Lp1/q;->T:J

    invoke-static {v5, v6}, Ljava/lang/Long;->hashCode(J)I

    move-result v2

    invoke-virtual {v12}, Lp1/q;->m()Lp1/p1;

    move-result-object v5

    invoke-static {v12, v1}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v6

    sget-object v7, La3/l;->a:La3/k;

    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v7, La3/k;->b:La3/j;

    invoke-virtual {v12}, Lp1/q;->i0()V

    iget-boolean v8, v12, Lp1/q;->S:Z

    if-eqz v8, :cond_2c

    invoke-virtual {v12, v7}, Lp1/q;->l(Lc93/a;)V

    goto :goto_14

    :cond_2c
    invoke-virtual {v12}, Lp1/q;->s0()V

    :goto_14
    sget-object v7, La3/k;->g:La3/i;

    invoke-static {v12, v7, v4}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v4, La3/k;->f:La3/i;

    invoke-static {v12, v4, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v4, La3/k;->j:La3/i;

    iget-boolean v5, v12, Lp1/q;->S:Z

    if-nez v5, :cond_2d

    invoke-virtual {v12}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-static {v5, v7}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_2e

    :cond_2d
    invoke-static {v2, v12, v2, v4}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_2e
    sget-object v2, La3/k;->d:La3/i;

    invoke-static {v12, v2, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const/4 v2, 0x0

    const/4 v7, 0x1

    invoke-static {v2, v3, v12, v7}, Lih0/d0;->y(ILx1/b;Lp1/q;Z)V

    goto :goto_15

    :cond_2f
    invoke-virtual {v12}, Lp1/q;->X()V

    :goto_15
    invoke-virtual {v12}, Lp1/q;->u()Lp1/v1;

    move-result-object v9

    if-eqz v9, :cond_30

    new-instance v0, Laz1/f;

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move-object/from16 v4, p3

    move/from16 v5, p4

    move-object/from16 v6, p5

    move-object v7, v10

    move v8, v11

    invoke-direct/range {v0 .. v8}, Laz1/f;-><init>(Landroidx/compose/ui/Modifier;Ll0/i;Ll0/l;Lb2/g;ILl0/r0;Lkotlin/jvm/functions/Function3;I)V

    iput-object v0, v9, Lp1/v1;->d:Lc93/m;

    :cond_30
    return-void
.end method

.method public static c(JLl0/c1;)J
    .locals 4

    sget-object v0, Ll0/c1;->w:Ll0/c1;

    if-ne p2, v0, :cond_0

    invoke-static {p0, p1}, Ly3/a;->k(J)I

    move-result v1

    goto :goto_0

    :cond_0
    invoke-static {p0, p1}, Ly3/a;->j(J)I

    move-result v1

    :goto_0
    if-ne p2, v0, :cond_1

    invoke-static {p0, p1}, Ly3/a;->i(J)I

    move-result v2

    goto :goto_1

    :cond_1
    invoke-static {p0, p1}, Ly3/a;->h(J)I

    move-result v2

    :goto_1
    if-ne p2, v0, :cond_2

    invoke-static {p0, p1}, Ly3/a;->j(J)I

    move-result v3

    goto :goto_2

    :cond_2
    invoke-static {p0, p1}, Ly3/a;->k(J)I

    move-result v3

    :goto_2
    if-ne p2, v0, :cond_3

    invoke-static {p0, p1}, Ly3/a;->h(J)I

    move-result p0

    goto :goto_3

    :cond_3
    invoke-static {p0, p1}, Ly3/a;->i(J)I

    move-result p0

    :goto_3
    invoke-static {v1, v2, v3, p0}, Ly3/b;->a(IIII)J

    move-result-wide p0

    return-wide p0
.end method

.method public static d(IJ)J
    .locals 2

    invoke-static {p1, p2}, Ly3/a;->i(J)I

    move-result v0

    and-int/lit8 p0, p0, 0x4

    const/4 v1, 0x0

    if-eqz p0, :cond_0

    invoke-static {p1, p2}, Ly3/a;->j(J)I

    move-result p0

    goto :goto_0

    :cond_0
    move p0, v1

    :goto_0
    invoke-static {p1, p2}, Ly3/a;->h(J)I

    move-result p1

    invoke-static {v1, v0, p0, p1}, Ly3/b;->a(IIII)J

    move-result-wide p0

    return-wide p0
.end method

.method public static final e(J)J
    .locals 3

    sget-object v0, Ll0/c1;->w:Ll0/c1;

    invoke-static {p0, p1}, Ly3/a;->k(J)I

    move-result v0

    invoke-static {p0, p1}, Ly3/a;->i(J)I

    move-result v1

    invoke-static {p0, p1}, Ly3/a;->j(J)I

    move-result v2

    invoke-static {p0, p1}, Ly3/a;->h(J)I

    move-result p0

    invoke-static {v0, v1, v2, p0}, Ly3/b;->a(IIII)J

    move-result-wide p0

    return-wide p0
.end method

.method public static final f(Ljava/lang/StringBuilder;Ljava/lang/String;)V
    .locals 1

    invoke-virtual {p0}, Ljava/lang/StringBuilder;->length()I

    move-result v0

    if-lez v0, :cond_0

    const/16 v0, 0x2b

    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;

    :cond_0
    invoke-virtual {p0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    return-void
.end method
