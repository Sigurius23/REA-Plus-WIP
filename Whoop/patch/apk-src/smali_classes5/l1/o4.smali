.class public abstract Ll1/o4;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lp1/b0;


# direct methods
.method static constructor <clinit>()V
    .locals 2

    new-instance v0, Ll1/f0;

    const/16 v1, 0xa

    invoke-direct {v0, v1}, Ll1/f0;-><init>(I)V

    new-instance v1, Lp1/b0;

    invoke-direct {v1, v0}, Lp1/b0;-><init>(Lc93/a;)V

    sput-object v1, Ll1/o4;->a:Lp1/b0;

    return-void
.end method

.method public static final a(Ll3/v0;Lx1/b;Landroidx/compose/runtime/Composer;I)V
    .locals 3

    check-cast p2, Lp1/q;

    const v0, 0xe9e0ce

    invoke-virtual {p2, v0}, Lp1/q;->g0(I)Lp1/q;

    invoke-virtual {p2, p0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x4

    goto :goto_0

    :cond_0
    const/4 v0, 0x2

    :goto_0
    or-int/2addr v0, p3

    and-int/lit8 v1, p3, 0x30

    if-nez v1, :cond_2

    invoke-virtual {p2, p1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    const/16 v1, 0x20

    goto :goto_1

    :cond_1
    const/16 v1, 0x10

    :goto_1
    or-int/2addr v0, v1

    :cond_2
    and-int/lit8 v1, v0, 0x13

    const/16 v2, 0x12

    if-eq v1, v2, :cond_3

    const/4 v1, 0x1

    goto :goto_2

    :cond_3
    const/4 v1, 0x0

    :goto_2
    and-int/lit8 v2, v0, 0x1

    invoke-virtual {p2, v2, v1}, Lp1/q;->U(IZ)Z

    move-result v1

    if-eqz v1, :cond_4

    sget-object v1, Ll1/o4;->a:Lp1/b0;

    invoke-virtual {p2, v1}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ll3/v0;

    invoke-virtual {v2, p0}, Ll3/v0;->e(Ll3/v0;)Ll3/v0;

    move-result-object v2

    invoke-virtual {v1, v2}, Lp1/b0;->a(Ljava/lang/Object;)Lp1/u1;

    move-result-object v1

    and-int/lit8 v0, v0, 0x70

    const/16 v2, 0x8

    or-int/2addr v0, v2

    invoke-static {v1, p1, p2, v0}, Lp1/x;->a(Lp1/u1;Lc93/m;Landroidx/compose/runtime/Composer;I)V

    goto :goto_3

    :cond_4
    invoke-virtual {p2}, Lp1/q;->X()V

    :goto_3
    invoke-virtual {p2}, Lp1/q;->u()Lp1/v1;

    move-result-object p2

    if-eqz p2, :cond_5

    new-instance v0, Lkl2/f;

    const/16 v1, 0xc

    invoke-direct {v0, p0, p1, p3, v1}, Lkl2/f;-><init>(Ljava/lang/Object;Ljava/lang/Object;II)V

    iput-object v0, p2, Lp1/v1;->d:Lc93/m;

    :cond_5
    return-void
.end method

.method public static final b(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/r;JLw3/k;JIZIILl3/v0;Landroidx/compose/runtime/Composer;III)V
    .locals 27

    move/from16 v0, p18

    move/from16 v1, p19

    move/from16 v2, p20

    move-object/from16 v3, p17

    check-cast v3, Lp1/q;

    const v4, -0x7a7e7926

    invoke-virtual {v3, v4}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v4, v0, 0x6

    if-nez v4, :cond_1

    move-object/from16 v4, p0

    invoke-virtual {v3, v4}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_0

    const/4 v5, 0x4

    goto :goto_0

    :cond_0
    const/4 v5, 0x2

    :goto_0
    or-int/2addr v5, v0

    goto :goto_1

    :cond_1
    move-object/from16 v4, p0

    move v5, v0

    :goto_1
    and-int/lit8 v6, v2, 0x2

    if-eqz v6, :cond_3

    or-int/lit8 v5, v5, 0x30

    :cond_2
    move-object/from16 v7, p1

    goto :goto_3

    :cond_3
    and-int/lit8 v7, v0, 0x30

    if-nez v7, :cond_2

    move-object/from16 v7, p1

    invoke-virtual {v3, v7}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_4

    const/16 v8, 0x20

    goto :goto_2

    :cond_4
    const/16 v8, 0x10

    :goto_2
    or-int/2addr v5, v8

    :goto_3
    and-int/lit8 v8, v2, 0x4

    if-eqz v8, :cond_6

    or-int/lit16 v5, v5, 0x180

    :cond_5
    move-wide/from16 v9, p2

    goto :goto_5

    :cond_6
    and-int/lit16 v9, v0, 0x180

    if-nez v9, :cond_5

    move-wide/from16 v9, p2

    invoke-virtual {v3, v9, v10}, Lp1/q;->f(J)Z

    move-result v11

    if-eqz v11, :cond_7

    const/16 v11, 0x100

    goto :goto_4

    :cond_7
    const/16 v11, 0x80

    :goto_4
    or-int/2addr v5, v11

    :goto_5
    and-int/lit8 v11, v2, 0x8

    if-eqz v11, :cond_9

    or-int/lit16 v5, v5, 0xc00

    :cond_8
    move-wide/from16 v14, p4

    goto :goto_7

    :cond_9
    and-int/lit16 v14, v0, 0xc00

    if-nez v14, :cond_8

    move-wide/from16 v14, p4

    invoke-virtual {v3, v14, v15}, Lp1/q;->f(J)Z

    move-result v16

    if-eqz v16, :cond_a

    const/16 v16, 0x800

    goto :goto_6

    :cond_a
    const/16 v16, 0x400

    :goto_6
    or-int v5, v5, v16

    :goto_7
    or-int/lit16 v12, v5, 0x6000

    and-int/lit8 v16, v2, 0x20

    const v17, 0x36000

    const/high16 v18, 0x10000

    if-eqz v16, :cond_c

    or-int v12, v5, v17

    :cond_b
    move-object/from16 v5, p6

    goto :goto_9

    :cond_c
    const/high16 v5, 0x30000

    and-int/2addr v5, v0

    if-nez v5, :cond_b

    move-object/from16 v5, p6

    invoke-virtual {v3, v5}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v19

    if-eqz v19, :cond_d

    const/high16 v19, 0x20000

    goto :goto_8

    :cond_d
    move/from16 v19, v18

    :goto_8
    or-int v12, v12, v19

    :goto_9
    const/high16 v19, 0x6d80000

    or-int v19, v12, v19

    and-int/lit16 v13, v2, 0x200

    if-eqz v13, :cond_f

    const/high16 v19, 0x36d80000

    or-int v19, v12, v19

    :cond_e
    move-object/from16 v12, p9

    :goto_a
    move/from16 v0, v19

    goto :goto_c

    :cond_f
    const/high16 v12, 0x30000000

    and-int/2addr v12, v0

    if-nez v12, :cond_e

    move-object/from16 v12, p9

    invoke-virtual {v3, v12}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v21

    if-eqz v21, :cond_10

    const/high16 v21, 0x20000000

    goto :goto_b

    :cond_10
    const/high16 v21, 0x10000000

    :goto_b
    or-int v19, v19, v21

    goto :goto_a

    :goto_c
    or-int/lit16 v4, v1, 0x1b6

    move/from16 v19, v4

    and-int/lit16 v4, v2, 0x2000

    if-eqz v4, :cond_12

    const/16 v19, 0xdb6

    :cond_11
    move/from16 v2, p14

    goto :goto_e

    :cond_12
    and-int/lit16 v2, v1, 0xc00

    if-nez v2, :cond_11

    move/from16 v2, p14

    invoke-virtual {v3, v2}, Lp1/q;->e(I)Z

    move-result v21

    if-eqz v21, :cond_13

    const/16 v20, 0x800

    goto :goto_d

    :cond_13
    const/16 v20, 0x400

    :goto_d
    or-int v19, v19, v20

    :goto_e
    or-int v17, v19, v17

    and-int v19, p20, v18

    move-object/from16 v1, p16

    if-nez v19, :cond_14

    invoke-virtual {v3, v1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v19

    if-eqz v19, :cond_14

    const/high16 v19, 0x100000

    goto :goto_f

    :cond_14
    const/high16 v19, 0x80000

    :goto_f
    or-int v17, v17, v19

    const v19, 0x12492493

    and-int v1, v0, v19

    const v2, 0x12492492

    const/16 v19, 0x1

    if-ne v1, v2, :cond_16

    const v1, 0x92493

    and-int v1, v17, v1

    const v2, 0x92492

    if-eq v1, v2, :cond_15

    goto :goto_10

    :cond_15
    const/4 v1, 0x0

    goto :goto_11

    :cond_16
    :goto_10
    move/from16 v1, v19

    :goto_11
    and-int/lit8 v2, v0, 0x1

    invoke-virtual {v3, v2, v1}, Lp1/q;->U(IZ)Z

    move-result v1

    if-eqz v1, :cond_21

    invoke-virtual {v3}, Lp1/q;->Z()V

    and-int/lit8 v1, p18, 0x1

    const v2, -0x380001

    if-eqz v1, :cond_19

    invoke-virtual {v3}, Lp1/q;->C()Z

    move-result v1

    if-eqz v1, :cond_17

    goto :goto_12

    :cond_17
    invoke-virtual {v3}, Lp1/q;->X()V

    and-int v1, p20, v18

    if-eqz v1, :cond_18

    and-int v17, v17, v2

    :cond_18
    move-wide/from16 v18, v9

    move-object v9, v5

    move-wide/from16 v5, v18

    move-wide/from16 v10, p7

    move/from16 v16, p13

    move/from16 v18, p15

    move-object/from16 v19, p16

    move-object v4, v7

    move-wide v7, v14

    move/from16 v1, v17

    move-wide/from16 v13, p10

    move/from16 v15, p12

    move/from16 v17, p14

    goto/16 :goto_16

    :cond_19
    :goto_12
    if-eqz v6, :cond_1a

    sget-object v1, Lb2/t;->w:Lb2/t;

    goto :goto_13

    :cond_1a
    move-object v1, v7

    :goto_13
    if-eqz v8, :cond_1b

    sget-wide v6, Li2/x;->n:J

    goto :goto_14

    :cond_1b
    move-wide v6, v9

    :goto_14
    if-eqz v11, :cond_1c

    sget-wide v8, Ly3/o;->c:J

    move-wide v14, v8

    :cond_1c
    const/4 v8, 0x0

    if-eqz v16, :cond_1d

    move-object v5, v8

    :cond_1d
    sget-wide v9, Ly3/o;->c:J

    if-eqz v13, :cond_1e

    move-object v12, v8

    :cond_1e
    if-eqz v4, :cond_1f

    const v4, 0x7fffffff

    goto :goto_15

    :cond_1f
    move/from16 v4, p14

    :goto_15
    and-int v8, p20, v18

    if-eqz v8, :cond_20

    sget-object v8, Ll1/o4;->a:Lp1/b0;

    invoke-virtual {v3, v8}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ll3/v0;

    and-int v17, v17, v2

    move v11, v4

    move-object v4, v1

    move/from16 v1, v17

    move/from16 v17, v11

    move/from16 v16, v19

    move/from16 v18, v16

    move-object/from16 v19, v8

    move-wide/from16 v25, v9

    move-object v9, v5

    move-wide v5, v6

    move-wide/from16 v10, v25

    move-wide v7, v14

    move/from16 v15, v18

    move-wide v13, v10

    goto :goto_16

    :cond_20
    move-wide/from16 v25, v9

    move-object v9, v5

    move-wide v5, v6

    move-wide/from16 v10, v25

    move-wide v7, v14

    move-wide v13, v10

    move/from16 v16, v4

    move-object v4, v1

    move/from16 v1, v17

    move/from16 v17, v16

    move/from16 v15, v19

    move/from16 v16, v15

    move/from16 v18, v16

    move-object/from16 v19, p16

    :goto_16
    invoke-virtual {v3}, Lp1/q;->r()V

    and-int/lit8 v2, v0, 0xe

    or-int/lit16 v2, v2, 0xc00

    and-int/lit8 v20, v0, 0x70

    or-int v2, v2, v20

    move/from16 p1, v1

    and-int/lit16 v1, v0, 0x380

    or-int/2addr v1, v2

    shl-int/lit8 v2, v0, 0x3

    const v20, 0xe000

    and-int v21, v2, v20

    or-int v1, v1, v21

    const/high16 v21, 0x70000

    and-int v21, v2, v21

    or-int v1, v1, v21

    const/high16 v21, 0x380000

    and-int v21, v2, v21

    or-int v1, v1, v21

    const/high16 v21, 0x1c00000

    and-int v22, v2, v21

    or-int v1, v1, v22

    const/high16 v22, 0xe000000

    and-int v22, v2, v22

    or-int v1, v1, v22

    const/high16 v22, 0x70000000

    and-int v2, v2, v22

    or-int/2addr v1, v2

    shr-int/lit8 v0, v0, 0x1b

    and-int/lit8 v0, v0, 0xe

    shl-int/lit8 v2, p1, 0x3

    or-int/lit16 v0, v0, 0xdb0

    and-int v20, v2, v20

    or-int v0, v0, v20

    const/high16 v20, 0x1b0000

    or-int v0, v0, v20

    and-int v2, v2, v21

    or-int v22, v0, v2

    const/16 v23, 0x0

    move/from16 v21, v1

    move-object/from16 v20, v3

    move-object/from16 v3, p0

    invoke-static/range {v3 .. v23}, Ll1/o4;->c(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/r;JLw3/k;JIZIILl3/v0;Landroidx/compose/runtime/Composer;III)V

    move-object v2, v4

    move-wide v3, v5

    move-wide v5, v7

    move-object v7, v9

    move-wide v8, v10

    move-object v10, v12

    move-wide v11, v13

    move v13, v15

    move/from16 v14, v16

    move/from16 v15, v17

    move/from16 v16, v18

    move-object/from16 v17, v19

    goto :goto_17

    :cond_21
    move-object/from16 v20, v3

    invoke-virtual/range {v20 .. v20}, Lp1/q;->X()V

    move/from16 v13, p12

    move/from16 v16, p15

    move-object/from16 v17, p16

    move-object v2, v7

    move-wide v3, v9

    move-object v10, v12

    move-wide/from16 v8, p7

    move-wide/from16 v11, p10

    move-object v7, v5

    move-wide v5, v14

    move/from16 v14, p13

    move/from16 v15, p14

    :goto_17
    invoke-virtual/range {v20 .. v20}, Lp1/q;->u()Lp1/v1;

    move-result-object v0

    if-eqz v0, :cond_22

    move-object v1, v0

    new-instance v0, Ll1/n4;

    const/16 v21, 0x1

    move/from16 v18, p18

    move/from16 v19, p19

    move/from16 v20, p20

    move-object/from16 v24, v1

    move-object/from16 v1, p0

    invoke-direct/range {v0 .. v21}, Ll1/n4;-><init>(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/r;JLw3/k;JIZIILl3/v0;IIII)V

    move-object/from16 v1, v24

    iput-object v0, v1, Lp1/v1;->d:Lc93/m;

    :cond_22
    return-void
.end method

.method public static final c(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/r;JLw3/k;JIZIILl3/v0;Landroidx/compose/runtime/Composer;III)V
    .locals 38

    move/from16 v0, p18

    move/from16 v1, p19

    move/from16 v2, p20

    move-object/from16 v3, p17

    check-cast v3, Lp1/q;

    const v4, 0x6bda414b

    invoke-virtual {v3, v4}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v4, v0, 0x6

    if-nez v4, :cond_1

    move-object/from16 v4, p0

    invoke-virtual {v3, v4}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_0

    const/4 v7, 0x4

    goto :goto_0

    :cond_0
    const/4 v7, 0x2

    :goto_0
    or-int/2addr v7, v0

    goto :goto_1

    :cond_1
    move-object/from16 v4, p0

    move v7, v0

    :goto_1
    and-int/lit8 v8, v2, 0x2

    if-eqz v8, :cond_3

    or-int/lit8 v7, v7, 0x30

    :cond_2
    move-object/from16 v11, p1

    goto :goto_3

    :cond_3
    and-int/lit8 v11, v0, 0x30

    if-nez v11, :cond_2

    move-object/from16 v11, p1

    invoke-virtual {v3, v11}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v12

    if-eqz v12, :cond_4

    const/16 v12, 0x20

    goto :goto_2

    :cond_4
    const/16 v12, 0x10

    :goto_2
    or-int/2addr v7, v12

    :goto_3
    and-int/lit8 v12, v2, 0x4

    if-eqz v12, :cond_5

    or-int/lit16 v7, v7, 0x180

    move-wide/from16 v5, p2

    goto :goto_5

    :cond_5
    and-int/lit16 v15, v0, 0x180

    move-wide/from16 v5, p2

    if-nez v15, :cond_7

    invoke-virtual {v3, v5, v6}, Lp1/q;->f(J)Z

    move-result v16

    if-eqz v16, :cond_6

    const/16 v16, 0x100

    goto :goto_4

    :cond_6
    const/16 v16, 0x80

    :goto_4
    or-int v7, v7, v16

    :cond_7
    :goto_5
    and-int/lit8 v16, v2, 0x8

    const/4 v9, 0x0

    const/16 v18, 0x400

    const/16 v19, 0x800

    if-eqz v16, :cond_8

    or-int/lit16 v7, v7, 0xc00

    goto :goto_7

    :cond_8
    and-int/lit16 v10, v0, 0xc00

    if-nez v10, :cond_a

    invoke-virtual {v3, v9}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_9

    move/from16 v10, v19

    goto :goto_6

    :cond_9
    move/from16 v10, v18

    :goto_6
    or-int/2addr v7, v10

    :cond_a
    :goto_7
    and-int/lit8 v10, v2, 0x10

    const/16 v20, 0x2000

    const/16 v21, 0x4000

    if-eqz v10, :cond_b

    or-int/lit16 v7, v7, 0x6000

    move-wide/from16 v14, p4

    goto :goto_9

    :cond_b
    and-int/lit16 v13, v0, 0x6000

    move-wide/from16 v14, p4

    if-nez v13, :cond_d

    invoke-virtual {v3, v14, v15}, Lp1/q;->f(J)Z

    move-result v24

    if-eqz v24, :cond_c

    move/from16 v24, v21

    goto :goto_8

    :cond_c
    move/from16 v24, v20

    :goto_8
    or-int v7, v7, v24

    :cond_d
    :goto_9
    and-int/lit8 v24, v2, 0x20

    const/high16 v25, 0x10000

    const/high16 v26, 0x30000

    const/high16 v27, 0x20000

    if-eqz v24, :cond_e

    or-int v7, v7, v26

    goto :goto_b

    :cond_e
    and-int v24, v0, v26

    if-nez v24, :cond_10

    invoke-virtual {v3, v9}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v24

    if-eqz v24, :cond_f

    move/from16 v24, v27

    goto :goto_a

    :cond_f
    move/from16 v24, v25

    :goto_a
    or-int v7, v7, v24

    :cond_10
    :goto_b
    and-int/lit8 v24, v2, 0x40

    const/high16 v28, 0x80000

    const/high16 v29, 0x100000

    const/high16 v30, 0x180000

    if-eqz v24, :cond_11

    or-int v7, v7, v30

    move-object/from16 v13, p6

    goto :goto_d

    :cond_11
    and-int v31, v0, v30

    move-object/from16 v13, p6

    if-nez v31, :cond_13

    invoke-virtual {v3, v13}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v32

    if-eqz v32, :cond_12

    move/from16 v32, v29

    goto :goto_c

    :cond_12
    move/from16 v32, v28

    :goto_c
    or-int v7, v7, v32

    :cond_13
    :goto_d
    and-int/lit16 v9, v2, 0x80

    const/high16 v33, 0x400000

    const/high16 v34, 0x800000

    const/high16 v35, 0xc00000

    if-eqz v9, :cond_14

    or-int v7, v7, v35

    goto :goto_f

    :cond_14
    and-int v9, v0, v35

    if-nez v9, :cond_16

    const/4 v9, 0x0

    invoke-virtual {v3, v9}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v36

    if-eqz v36, :cond_15

    move/from16 v9, v34

    goto :goto_e

    :cond_15
    move/from16 v9, v33

    :goto_e
    or-int/2addr v7, v9

    :cond_16
    :goto_f
    and-int/lit16 v9, v2, 0x100

    const/high16 v36, 0x6000000

    if-eqz v9, :cond_17

    or-int v7, v7, v36

    move-wide/from16 v4, p7

    goto :goto_11

    :cond_17
    and-int v36, v0, v36

    move-wide/from16 v4, p7

    if-nez v36, :cond_19

    invoke-virtual {v3, v4, v5}, Lp1/q;->f(J)Z

    move-result v6

    if-eqz v6, :cond_18

    const/high16 v6, 0x4000000

    goto :goto_10

    :cond_18
    const/high16 v6, 0x2000000

    :goto_10
    or-int/2addr v7, v6

    :cond_19
    :goto_11
    and-int/lit16 v6, v2, 0x200

    const/high16 v36, 0x30000000

    if-eqz v6, :cond_1a

    or-int v7, v7, v36

    goto :goto_13

    :cond_1a
    and-int v6, v0, v36

    if-nez v6, :cond_1c

    const/4 v6, 0x0

    invoke-virtual {v3, v6}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v36

    if-eqz v36, :cond_1b

    const/high16 v6, 0x20000000

    goto :goto_12

    :cond_1b
    const/high16 v6, 0x10000000

    :goto_12
    or-int/2addr v7, v6

    :cond_1c
    :goto_13
    and-int/lit16 v6, v2, 0x400

    if-eqz v6, :cond_1d

    or-int/lit8 v23, v1, 0x6

    move-object/from16 v0, p9

    goto :goto_15

    :cond_1d
    and-int/lit8 v36, v1, 0x6

    move-object/from16 v0, p9

    if-nez v36, :cond_1f

    invoke-virtual {v3, v0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v36

    if-eqz v36, :cond_1e

    const/16 v23, 0x4

    goto :goto_14

    :cond_1e
    const/16 v23, 0x2

    :goto_14
    or-int v23, v1, v23

    goto :goto_15

    :cond_1f
    move/from16 v23, v1

    :goto_15
    and-int/lit16 v0, v2, 0x800

    if-eqz v0, :cond_21

    or-int/lit8 v23, v23, 0x30

    move-wide/from16 v4, p10

    :cond_20
    :goto_16
    move/from16 v16, v0

    move/from16 v0, v23

    goto :goto_18

    :cond_21
    and-int/lit8 v36, v1, 0x30

    move-wide/from16 v4, p10

    if-nez v36, :cond_20

    invoke-virtual {v3, v4, v5}, Lp1/q;->f(J)Z

    move-result v36

    if-eqz v36, :cond_22

    const/16 v16, 0x20

    goto :goto_17

    :cond_22
    const/16 v16, 0x10

    :goto_17
    or-int v23, v23, v16

    goto :goto_16

    :goto_18
    and-int/lit16 v4, v2, 0x1000

    if-eqz v4, :cond_24

    or-int/lit16 v0, v0, 0x180

    :cond_23
    move/from16 v5, p12

    goto :goto_1a

    :cond_24
    and-int/lit16 v5, v1, 0x180

    if-nez v5, :cond_23

    move/from16 v5, p12

    invoke-virtual {v3, v5}, Lp1/q;->e(I)Z

    move-result v17

    if-eqz v17, :cond_25

    const/16 v31, 0x100

    goto :goto_19

    :cond_25
    const/16 v31, 0x80

    :goto_19
    or-int v0, v0, v31

    :goto_1a
    move/from16 v17, v4

    and-int/lit16 v4, v2, 0x2000

    if-eqz v4, :cond_26

    or-int/lit16 v0, v0, 0xc00

    goto :goto_1b

    :cond_26
    move/from16 v22, v0

    and-int/lit16 v0, v1, 0xc00

    if-nez v0, :cond_28

    move/from16 v0, p13

    invoke-virtual {v3, v0}, Lp1/q;->h(Z)Z

    move-result v23

    if-eqz v23, :cond_27

    move/from16 v18, v19

    :cond_27
    or-int v18, v22, v18

    move/from16 v0, v18

    goto :goto_1b

    :cond_28
    move/from16 v0, p13

    move/from16 v0, v22

    :goto_1b
    move/from16 v18, v4

    and-int/lit16 v4, v2, 0x4000

    if-eqz v4, :cond_2a

    or-int/lit16 v0, v0, 0x6000

    move/from16 v19, v0

    :cond_29
    move/from16 v0, p14

    goto :goto_1c

    :cond_2a
    move/from16 v19, v0

    and-int/lit16 v0, v1, 0x6000

    if-nez v0, :cond_29

    move/from16 v0, p14

    invoke-virtual {v3, v0}, Lp1/q;->e(I)Z

    move-result v22

    if-eqz v22, :cond_2b

    move/from16 v20, v21

    :cond_2b
    or-int v19, v19, v20

    :goto_1c
    const v20, 0x8000

    and-int v20, v2, v20

    if-eqz v20, :cond_2c

    or-int v19, v19, v26

    move/from16 v0, p15

    goto :goto_1e

    :cond_2c
    and-int v21, v1, v26

    move/from16 v0, p15

    if-nez v21, :cond_2e

    invoke-virtual {v3, v0}, Lp1/q;->e(I)Z

    move-result v21

    if-eqz v21, :cond_2d

    move/from16 v21, v27

    goto :goto_1d

    :cond_2d
    move/from16 v21, v25

    :goto_1d
    or-int v19, v19, v21

    :cond_2e
    :goto_1e
    and-int v21, v2, v25

    if-eqz v21, :cond_2f

    or-int v19, v19, v30

    const/4 v0, 0x0

    goto :goto_1f

    :cond_2f
    and-int v21, v1, v30

    const/4 v0, 0x0

    if-nez v21, :cond_31

    invoke-virtual {v3, v0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v21

    if-eqz v21, :cond_30

    move/from16 v28, v29

    :cond_30
    or-int v19, v19, v28

    :cond_31
    :goto_1f
    and-int v21, v1, v35

    if-nez v21, :cond_33

    and-int v21, v2, v27

    move-object/from16 v0, p16

    if-nez v21, :cond_32

    invoke-virtual {v3, v0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v21

    if-eqz v21, :cond_32

    move/from16 v33, v34

    :cond_32
    or-int v19, v19, v33

    goto :goto_20

    :cond_33
    move-object/from16 v0, p16

    :goto_20
    const v21, 0x12492493

    and-int v0, v7, v21

    const v1, 0x12492492

    const/4 v2, 0x0

    const/16 v21, 0x1

    if-ne v0, v1, :cond_35

    const v0, 0x492493

    and-int v0, v19, v0

    const v1, 0x492492

    if-eq v0, v1, :cond_34

    goto :goto_21

    :cond_34
    move v0, v2

    goto :goto_22

    :cond_35
    :goto_21
    move/from16 v0, v21

    :goto_22
    and-int/lit8 v1, v7, 0x1

    invoke-virtual {v3, v1, v0}, Lp1/q;->U(IZ)Z

    move-result v0

    if-eqz v0, :cond_48

    invoke-virtual {v3}, Lp1/q;->Z()V

    and-int/lit8 v0, p18, 0x1

    const v1, -0x1c00001

    if-eqz v0, :cond_38

    invoke-virtual {v3}, Lp1/q;->C()Z

    move-result v0

    if-eqz v0, :cond_36

    goto :goto_23

    :cond_36
    invoke-virtual {v3}, Lp1/q;->X()V

    and-int v0, p20, v27

    if-eqz v0, :cond_37

    and-int v19, v19, v1

    :cond_37
    move-wide/from16 v22, p2

    move-wide/from16 v8, p7

    move-object/from16 v0, p9

    move-wide/from16 v24, p10

    move/from16 v1, p13

    move/from16 v4, p14

    move/from16 v21, p15

    move-object/from16 v6, p16

    goto/16 :goto_2c

    :cond_38
    :goto_23
    if-eqz v8, :cond_39

    sget-object v0, Lb2/t;->w:Lb2/t;

    move-object v11, v0

    :cond_39
    if-eqz v12, :cond_3a

    sget-wide v22, Li2/x;->n:J

    goto :goto_24

    :cond_3a
    move-wide/from16 v22, p2

    :goto_24
    if-eqz v10, :cond_3b

    sget-wide v14, Ly3/o;->c:J

    :cond_3b
    if-eqz v24, :cond_3c

    const/4 v13, 0x0

    :cond_3c
    if-eqz v9, :cond_3d

    sget-wide v8, Ly3/o;->c:J

    goto :goto_25

    :cond_3d
    move-wide/from16 v8, p7

    :goto_25
    if-eqz v6, :cond_3e

    const/16 v32, 0x0

    goto :goto_26

    :cond_3e
    move-object/from16 v32, p9

    :goto_26
    if-eqz v16, :cond_3f

    sget-wide v24, Ly3/o;->c:J

    goto :goto_27

    :cond_3f
    move-wide/from16 v24, p10

    :goto_27
    if-eqz v17, :cond_40

    move/from16 v5, v21

    :cond_40
    if-eqz v18, :cond_41

    move/from16 v0, v21

    goto :goto_28

    :cond_41
    move/from16 v0, p13

    :goto_28
    if-eqz v4, :cond_42

    const v4, 0x7fffffff

    goto :goto_29

    :cond_42
    move/from16 v4, p14

    :goto_29
    if-eqz v20, :cond_43

    goto :goto_2a

    :cond_43
    move/from16 v21, p15

    :goto_2a
    and-int v6, p20, v27

    if-eqz v6, :cond_44

    sget-object v6, Ll1/o4;->a:Lp1/b0;

    invoke-virtual {v3, v6}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ll3/v0;

    and-int v19, v19, v1

    :goto_2b
    move v1, v0

    move-object/from16 v0, v32

    goto :goto_2c

    :cond_44
    move-object/from16 v6, p16

    goto :goto_2b

    :goto_2c
    invoke-virtual {v3}, Lp1/q;->r()V

    const v10, -0x21b08752

    invoke-virtual {v3, v10}, Lp1/q;->e0(I)V

    const-wide/16 v16, 0x10

    cmp-long v10, v22, v16

    if-eqz v10, :cond_45

    move/from16 p17, v4

    move/from16 p16, v5

    move-wide/from16 v26, v22

    goto :goto_2e

    :cond_45
    const v10, -0x21b0844d

    invoke-virtual {v3, v10}, Lp1/q;->e0(I)V

    invoke-virtual {v6}, Ll3/v0;->c()J

    move-result-wide v26

    cmp-long v10, v26, v16

    if-eqz v10, :cond_46

    move/from16 p17, v4

    move/from16 p16, v5

    goto :goto_2d

    :cond_46
    sget-object v10, Ll1/s;->a:Lp1/b0;

    invoke-virtual {v3, v10}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Li2/x;

    move/from16 p17, v4

    move/from16 p16, v5

    iget-wide v4, v10, Li2/x;->a:J

    move-wide/from16 v26, v4

    :goto_2d
    invoke-virtual {v3, v2}, Lp1/q;->q(Z)V

    :goto_2e
    invoke-virtual {v3, v2}, Lp1/q;->q(Z)V

    if-eqz v0, :cond_47

    iget v2, v0, Lw3/k;->a:I

    goto :goto_2f

    :cond_47
    const/high16 v2, -0x80000000

    :goto_2f
    const v4, 0xfd6f50

    const/4 v5, 0x0

    const/4 v10, 0x0

    const/4 v12, 0x0

    move/from16 p12, v2

    move/from16 p15, v4

    move-object/from16 p7, v5

    move-object/from16 p1, v6

    move-wide/from16 p9, v8

    move-object/from16 p8, v10

    move-object/from16 p11, v12

    move-object/from16 p6, v13

    move-wide/from16 p4, v14

    move-wide/from16 p13, v24

    move-wide/from16 p2, v26

    invoke-static/range {p1 .. p15}, Ll3/v0;->f(Ll3/v0;JJLp3/r;Lp3/n;Lp3/i;JLw3/l;IJI)Ll3/v0;

    move-result-object v2

    and-int/lit8 v4, v7, 0x7e

    shr-int/lit8 v5, v19, 0x9

    and-int/lit16 v5, v5, 0x1c00

    or-int/2addr v4, v5

    shl-int/lit8 v5, v19, 0x6

    const v10, 0xe000

    and-int/2addr v10, v5

    or-int/2addr v4, v10

    const/high16 v10, 0x70000

    and-int/2addr v10, v5

    or-int/2addr v4, v10

    const/high16 v10, 0x380000

    and-int/2addr v10, v5

    or-int/2addr v4, v10

    const/high16 v10, 0x1c00000

    and-int/2addr v5, v10

    or-int/2addr v4, v5

    shl-int/lit8 v5, v7, 0x12

    const/high16 v7, 0x70000000

    and-int/2addr v5, v7

    or-int/2addr v4, v5

    const/16 v5, 0x100

    const/4 v7, 0x0

    const/4 v10, 0x0

    move-object/from16 p1, p0

    move/from16 p5, p16

    move/from16 p7, p17

    move/from16 p6, v1

    move-object/from16 p3, v2

    move-object/from16 p11, v3

    move/from16 p12, v4

    move/from16 p13, v5

    move-object/from16 p4, v7

    move-object/from16 p9, v10

    move-object/from16 p2, v11

    move-object/from16 p10, v12

    move/from16 p8, v21

    invoke-static/range {p1 .. p13}, Lq83/g;->b(Ljava/lang/String;Landroidx/compose/ui/Modifier;Ll3/v0;Lkotlin/jvm/functions/Function1;IZIILi2/a0;Lu0/z0;Landroidx/compose/runtime/Composer;II)V

    move/from16 v5, p5

    move/from16 v2, p6

    move/from16 v4, p7

    move-object/from16 v1, p11

    move-object v10, v0

    move-object/from16 v17, v6

    move-object v7, v13

    move/from16 v16, v21

    move v13, v5

    move-wide v5, v14

    move v14, v2

    move v15, v4

    move-object v2, v11

    move-wide/from16 v3, v22

    move-wide/from16 v11, v24

    goto :goto_30

    :cond_48
    move-object v1, v3

    invoke-virtual {v1}, Lp1/q;->X()V

    move-wide/from16 v3, p2

    move-wide/from16 v8, p7

    move-object/from16 v10, p9

    move/from16 v16, p15

    move-object/from16 v17, p16

    move-object v2, v11

    move-object v7, v13

    move-wide/from16 v11, p10

    move v13, v5

    move-wide v5, v14

    move/from16 v14, p13

    move/from16 v15, p14

    :goto_30
    invoke-virtual {v1}, Lp1/q;->u()Lp1/v1;

    move-result-object v0

    if-eqz v0, :cond_49

    move-object v1, v0

    new-instance v0, Ll1/n4;

    const/16 v21, 0x0

    move/from16 v18, p18

    move/from16 v19, p19

    move/from16 v20, p20

    move-object/from16 v37, v1

    move-object/from16 v1, p0

    invoke-direct/range {v0 .. v21}, Ll1/n4;-><init>(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/r;JLw3/k;JIZIILl3/v0;IIII)V

    move-object/from16 v1, v37

    iput-object v0, v1, Lp1/v1;->d:Lc93/m;

    :cond_49
    return-void
.end method
