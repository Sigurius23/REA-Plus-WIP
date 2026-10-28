.class public abstract Lg1/n0;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:F

.field public static final b:F

.field public static final c:Landroidx/compose/ui/Modifier;

.field public static final d:Landroidx/compose/ui/Modifier;

.field public static final e:Ll0/i0;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    const/16 v0, 0x38

    int-to-float v0, v0

    sput v0, Lg1/n0;->a:F

    const/4 v0, 0x4

    int-to-float v0, v0

    sput v0, Lg1/n0;->b:F

    const/16 v1, 0x10

    int-to-float v1, v1

    sub-float/2addr v1, v0

    sget-object v2, Lb2/t;->w:Lb2/t;

    invoke-static {v1, v2}, Landroidx/compose/foundation/layout/d;->u(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    sput-object v1, Lg1/n0;->c:Landroidx/compose/ui/Modifier;

    const/high16 v1, 0x3f800000    # 1.0f

    invoke-static {v1, v2}, Landroidx/compose/foundation/layout/d;->c(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    const/16 v2, 0x48

    int-to-float v2, v2

    sub-float/2addr v2, v0

    invoke-static {v2, v1}, Landroidx/compose/foundation/layout/d;->u(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    sput-object v0, Lg1/n0;->d:Landroidx/compose/ui/Modifier;

    const/4 v0, 0x0

    int-to-float v0, v0

    invoke-static {v0}, Ll0/f;->c(F)Ll0/i0;

    move-result-object v0

    sput-object v0, Lg1/n0;->e:Ll0/i0;

    return-void
.end method

.method public static final a(JJFLl0/k1;Ll0/b2;Landroidx/compose/ui/Modifier;Lx1/b;Landroidx/compose/runtime/Composer;I)V
    .locals 23

    move-object/from16 v6, p5

    move-object/from16 v7, p6

    move-object/from16 v9, p8

    move/from16 v10, p10

    move-object/from16 v0, p9

    check-cast v0, Lp1/q;

    const v1, 0x48db14d1

    invoke-virtual {v0, v1}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v1, v10, 0x6

    move-wide/from16 v13, p0

    if-nez v1, :cond_1

    invoke-virtual {v0, v13, v14}, Lp1/q;->f(J)Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, 0x4

    goto :goto_0

    :cond_0
    const/4 v1, 0x2

    :goto_0
    or-int/2addr v1, v10

    goto :goto_1

    :cond_1
    move v1, v10

    :goto_1
    and-int/lit8 v2, v10, 0x30

    move-wide/from16 v3, p2

    if-nez v2, :cond_3

    invoke-virtual {v0, v3, v4}, Lp1/q;->f(J)Z

    move-result v2

    if-eqz v2, :cond_2

    const/16 v2, 0x20

    goto :goto_2

    :cond_2
    const/16 v2, 0x10

    :goto_2
    or-int/2addr v1, v2

    :cond_3
    and-int/lit16 v2, v10, 0x180

    move/from16 v5, p4

    if-nez v2, :cond_5

    invoke-virtual {v0, v5}, Lp1/q;->d(F)Z

    move-result v2

    if-eqz v2, :cond_4

    const/16 v2, 0x100

    goto :goto_3

    :cond_4
    const/16 v2, 0x80

    :goto_3
    or-int/2addr v1, v2

    :cond_5
    and-int/lit16 v2, v10, 0xc00

    if-nez v2, :cond_7

    invoke-virtual {v0, v6}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_6

    const/16 v2, 0x800

    goto :goto_4

    :cond_6
    const/16 v2, 0x400

    :goto_4
    or-int/2addr v1, v2

    :cond_7
    and-int/lit16 v2, v10, 0x6000

    sget-object v12, Li2/w0;->a:Li2/v0;

    if-nez v2, :cond_9

    invoke-virtual {v0, v12}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_8

    const/16 v2, 0x4000

    goto :goto_5

    :cond_8
    const/16 v2, 0x2000

    :goto_5
    or-int/2addr v1, v2

    :cond_9
    const/high16 v2, 0x30000

    and-int/2addr v2, v10

    if-nez v2, :cond_b

    invoke-virtual {v0, v7}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_a

    const/high16 v2, 0x20000

    goto :goto_6

    :cond_a
    const/high16 v2, 0x10000

    :goto_6
    or-int/2addr v1, v2

    :cond_b
    const/high16 v2, 0x180000

    and-int v8, v10, v2

    if-nez v8, :cond_d

    move-object/from16 v8, p7

    invoke-virtual {v0, v8}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_c

    const/high16 v11, 0x100000

    goto :goto_7

    :cond_c
    const/high16 v11, 0x80000

    :goto_7
    or-int/2addr v1, v11

    goto :goto_8

    :cond_d
    move-object/from16 v8, p7

    :goto_8
    const/high16 v11, 0xc00000

    and-int/2addr v11, v10

    if-nez v11, :cond_f

    invoke-virtual {v0, v9}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_e

    const/high16 v11, 0x800000

    goto :goto_9

    :cond_e
    const/high16 v11, 0x400000

    :goto_9
    or-int/2addr v1, v11

    :cond_f
    const v11, 0x492493

    and-int/2addr v11, v1

    const v15, 0x492492

    if-eq v11, v15, :cond_10

    const/4 v11, 0x1

    goto :goto_a

    :cond_10
    const/4 v11, 0x0

    :goto_a
    and-int/lit8 v15, v1, 0x1

    invoke-virtual {v0, v15, v11}, Lp1/q;->U(IZ)Z

    move-result v11

    if-eqz v11, :cond_11

    new-instance v11, Lg1/l0;

    const/4 v15, 0x1

    invoke-direct {v11, v7, v6, v9, v15}, Lg1/l0;-><init>(Ll0/b2;Ll0/k1;Lx1/b;I)V

    const v15, -0x611482f3

    invoke-static {v15, v0, v11}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v19

    shr-int/lit8 v11, v1, 0x12

    and-int/lit8 v11, v11, 0xe

    or-int/2addr v2, v11

    shr-int/lit8 v11, v1, 0x9

    and-int/lit8 v11, v11, 0x70

    or-int/2addr v2, v11

    shl-int/lit8 v11, v1, 0x6

    and-int/lit16 v15, v11, 0x380

    or-int/2addr v2, v15

    and-int/lit16 v11, v11, 0x1c00

    or-int/2addr v2, v11

    const/high16 v11, 0x70000

    shl-int/lit8 v1, v1, 0x9

    and-int/2addr v1, v11

    or-int v21, v2, v1

    const/16 v22, 0x10

    const/16 v17, 0x0

    move-object/from16 v20, v0

    move-wide v15, v3

    move/from16 v18, v5

    move-object v11, v8

    invoke-static/range {v11 .. v22}, Lhg3/i;->k(Landroidx/compose/ui/Modifier;Li2/a1;JJLf0/t;FLc93/m;Landroidx/compose/runtime/Composer;II)V

    goto :goto_b

    :cond_11
    move-object/from16 v20, v0

    invoke-virtual/range {v20 .. v20}, Lp1/q;->X()V

    :goto_b
    invoke-virtual/range {v20 .. v20}, Lp1/q;->u()Lp1/v1;

    move-result-object v11

    if-eqz v11, :cond_12

    new-instance v0, Lg1/j0;

    move-wide/from16 v1, p0

    move-wide/from16 v3, p2

    move/from16 v5, p4

    move-object/from16 v8, p7

    invoke-direct/range {v0 .. v10}, Lg1/j0;-><init>(JJFLl0/k1;Ll0/b2;Landroidx/compose/ui/Modifier;Lx1/b;I)V

    iput-object v0, v11, Lp1/v1;->d:Lc93/m;

    :cond_12
    return-void
.end method

.method public static final b(Landroidx/compose/ui/Modifier;JJFLl0/k1;Lx1/b;Landroidx/compose/runtime/Composer;I)V
    .locals 13

    move-object/from16 v9, p8

    check-cast v9, Lp1/q;

    const v2, -0x790786f7

    invoke-virtual {v9, v2}, Lp1/q;->g0(I)Lp1/q;

    invoke-virtual {v9, p1, p2}, Lp1/q;->f(J)Z

    move-result v2

    if-eqz v2, :cond_0

    const/16 v2, 0x20

    goto :goto_0

    :cond_0
    const/16 v2, 0x10

    :goto_0
    or-int v2, p9, v2

    or-int/lit16 v2, v2, 0x6080

    const v3, 0x12493

    and-int/2addr v3, v2

    const v4, 0x12492

    if-eq v3, v4, :cond_1

    const/4 v3, 0x1

    goto :goto_1

    :cond_1
    const/4 v3, 0x0

    :goto_1
    and-int/lit8 v4, v2, 0x1

    invoke-virtual {v9, v4, v3}, Lp1/q;->U(IZ)Z

    move-result v3

    if-eqz v3, :cond_4

    invoke-virtual {v9}, Lp1/q;->Z()V

    and-int/lit8 v3, p9, 0x1

    if-eqz v3, :cond_3

    invoke-virtual {v9}, Lp1/q;->C()Z

    move-result v3

    if-eqz v3, :cond_2

    goto :goto_2

    :cond_2
    invoke-virtual {v9}, Lp1/q;->X()V

    and-int/lit16 v2, v2, -0x381

    move-object/from16 v5, p6

    move v4, v2

    move-wide/from16 v2, p3

    goto :goto_3

    :cond_3
    :goto_2
    invoke-static {p1, p2, v9}, Lg1/d1;->b(JLandroidx/compose/runtime/Composer;)J

    move-result-wide v3

    and-int/lit16 v2, v2, -0x381

    sget-object v5, Lg1/g0;->b:Ll0/l1;

    move-wide v11, v3

    move v4, v2

    move-wide v2, v11

    :goto_3
    invoke-virtual {v9}, Lp1/q;->r()V

    shr-int/lit8 v4, v4, 0x3

    and-int/lit8 v4, v4, 0xe

    const v6, 0xdb6d80

    or-int v10, v4, v6

    sget-object v6, Lg1/n0;->e:Ll0/i0;

    move-object v7, p0

    move-wide v0, p1

    move/from16 v4, p5

    move-object/from16 v8, p7

    invoke-static/range {v0 .. v10}, Lg1/n0;->a(JJFLl0/k1;Ll0/b2;Landroidx/compose/ui/Modifier;Lx1/b;Landroidx/compose/runtime/Composer;I)V

    move-object v7, v5

    move-wide v4, v2

    goto :goto_4

    :cond_4
    invoke-virtual {v9}, Lp1/q;->X()V

    move-wide/from16 v4, p3

    move-object/from16 v7, p6

    :goto_4
    invoke-virtual {v9}, Lp1/q;->u()Lp1/v1;

    move-result-object v10

    if-eqz v10, :cond_5

    new-instance v0, Lg1/k0;

    move-object v1, p0

    move-wide v2, p1

    move/from16 v6, p5

    move-object/from16 v8, p7

    move/from16 v9, p9

    invoke-direct/range {v0 .. v9}, Lg1/k0;-><init>(Landroidx/compose/ui/Modifier;JJFLl0/k1;Lx1/b;I)V

    iput-object v0, v10, Lp1/v1;->d:Lc93/m;

    :cond_5
    return-void
.end method

.method public static final c(Lx1/b;Ll0/b2;Landroidx/compose/ui/Modifier;Lc93/m;Lkotlin/jvm/functions/Function3;JJFLandroidx/compose/runtime/Composer;I)V
    .locals 23

    move-object/from16 v1, p0

    move-object/from16 v4, p3

    move-object/from16 v5, p4

    move/from16 v11, p11

    move-object/from16 v0, p10

    check-cast v0, Lp1/q;

    const v2, 0x83b16fc

    invoke-virtual {v0, v2}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v2, v11, 0x6

    if-nez v2, :cond_1

    invoke-virtual {v0, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

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
    and-int/lit8 v3, v11, 0x30

    if-nez v3, :cond_3

    move-object/from16 v3, p1

    invoke-virtual {v0, v3}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_2

    const/16 v6, 0x20

    goto :goto_2

    :cond_2
    const/16 v6, 0x10

    :goto_2
    or-int/2addr v2, v6

    goto :goto_3

    :cond_3
    move-object/from16 v3, p1

    :goto_3
    and-int/lit16 v6, v11, 0x180

    if-nez v6, :cond_5

    move-object/from16 v6, p2

    invoke-virtual {v0, v6}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_4

    const/16 v7, 0x100

    goto :goto_4

    :cond_4
    const/16 v7, 0x80

    :goto_4
    or-int/2addr v2, v7

    goto :goto_5

    :cond_5
    move-object/from16 v6, p2

    :goto_5
    and-int/lit16 v7, v11, 0xc00

    if-nez v7, :cond_7

    invoke-virtual {v0, v4}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_6

    const/16 v7, 0x800

    goto :goto_6

    :cond_6
    const/16 v7, 0x400

    :goto_6
    or-int/2addr v2, v7

    :cond_7
    and-int/lit16 v7, v11, 0x6000

    if-nez v7, :cond_9

    invoke-virtual {v0, v5}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_8

    const/16 v7, 0x4000

    goto :goto_7

    :cond_8
    const/16 v7, 0x2000

    :goto_7
    or-int/2addr v2, v7

    :cond_9
    const/high16 v7, 0x30000

    and-int/2addr v7, v11

    move-wide/from16 v12, p5

    if-nez v7, :cond_b

    invoke-virtual {v0, v12, v13}, Lp1/q;->f(J)Z

    move-result v7

    if-eqz v7, :cond_a

    const/high16 v7, 0x20000

    goto :goto_8

    :cond_a
    const/high16 v7, 0x10000

    :goto_8
    or-int/2addr v2, v7

    :cond_b
    const/high16 v7, 0x180000

    and-int/2addr v7, v11

    move-wide/from16 v8, p7

    if-nez v7, :cond_d

    invoke-virtual {v0, v8, v9}, Lp1/q;->f(J)Z

    move-result v7

    if-eqz v7, :cond_c

    const/high16 v7, 0x100000

    goto :goto_9

    :cond_c
    const/high16 v7, 0x80000

    :goto_9
    or-int/2addr v2, v7

    :cond_d
    const/high16 v7, 0xc00000

    and-int/2addr v7, v11

    move/from16 v10, p9

    if-nez v7, :cond_f

    invoke-virtual {v0, v10}, Lp1/q;->d(F)Z

    move-result v7

    if-eqz v7, :cond_e

    const/high16 v7, 0x800000

    goto :goto_a

    :cond_e
    const/high16 v7, 0x400000

    :goto_a
    or-int/2addr v2, v7

    :cond_f
    const v7, 0x492493

    and-int/2addr v7, v2

    const v14, 0x492492

    if-eq v7, v14, :cond_10

    const/4 v7, 0x1

    goto :goto_b

    :cond_10
    const/4 v7, 0x0

    :goto_b
    and-int/lit8 v14, v2, 0x1

    invoke-virtual {v0, v14, v7}, Lp1/q;->U(IZ)Z

    move-result v7

    if-eqz v7, :cond_13

    invoke-virtual {v0}, Lp1/q;->Z()V

    and-int/lit8 v7, v11, 0x1

    if-eqz v7, :cond_12

    invoke-virtual {v0}, Lp1/q;->C()Z

    move-result v7

    if-eqz v7, :cond_11

    goto :goto_c

    :cond_11
    invoke-virtual {v0}, Lp1/q;->X()V

    :cond_12
    :goto_c
    invoke-virtual {v0}, Lp1/q;->r()V

    sget-object v17, Lg1/g0;->b:Ll0/l1;

    new-instance v7, Lch/t;

    invoke-direct {v7, v4, v1, v5}, Lch/t;-><init>(Lc93/m;Lx1/b;Lkotlin/jvm/functions/Function3;)V

    const v14, -0x7864bd32

    invoke-static {v14, v0, v7}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v20

    shr-int/lit8 v7, v2, 0xf

    and-int/lit8 v14, v7, 0xe

    const v15, 0xc06c00

    or-int/2addr v14, v15

    and-int/lit8 v15, v7, 0x70

    or-int/2addr v14, v15

    and-int/lit16 v7, v7, 0x380

    or-int/2addr v7, v14

    shl-int/lit8 v2, v2, 0xc

    const/high16 v14, 0x70000

    and-int/2addr v14, v2

    or-int/2addr v7, v14

    const/high16 v14, 0x380000

    and-int/2addr v2, v14

    or-int v22, v7, v2

    move-object/from16 v21, v0

    move-object/from16 v18, v3

    move-object/from16 v19, v6

    move-wide v14, v8

    move/from16 v16, v10

    invoke-static/range {v12 .. v22}, Lg1/n0;->a(JJFLl0/k1;Ll0/b2;Landroidx/compose/ui/Modifier;Lx1/b;Landroidx/compose/runtime/Composer;I)V

    goto :goto_d

    :cond_13
    move-object/from16 v21, v0

    invoke-virtual/range {v21 .. v21}, Lp1/q;->X()V

    :goto_d
    invoke-virtual/range {v21 .. v21}, Lp1/q;->u()Lp1/v1;

    move-result-object v12

    if-eqz v12, :cond_14

    new-instance v0, Lg1/i0;

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move-wide/from16 v6, p5

    move-wide/from16 v8, p7

    move/from16 v10, p9

    invoke-direct/range {v0 .. v11}, Lg1/i0;-><init>(Lx1/b;Ll0/b2;Landroidx/compose/ui/Modifier;Lc93/m;Lkotlin/jvm/functions/Function3;JJFI)V

    iput-object v0, v12, Lp1/v1;->d:Lc93/m;

    :cond_14
    return-void
.end method

.method public static final d(Lx1/b;Landroidx/compose/ui/Modifier;Lc93/m;Lkotlin/jvm/functions/Function3;JJFLandroidx/compose/runtime/Composer;II)V
    .locals 15

    move-wide/from16 v5, p4

    move/from16 v12, p10

    move-object/from16 v10, p9

    check-cast v10, Lp1/q;

    const v0, -0x14ddd55e

    invoke-virtual {v10, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, v12, 0x6

    if-nez v0, :cond_1

    invoke-virtual {v10, p0}, Lp1/q;->i(Ljava/lang/Object;)Z

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
    or-int/lit8 v0, v0, 0x30

    and-int/lit16 v1, v12, 0x180

    move-object/from16 v3, p2

    if-nez v1, :cond_3

    invoke-virtual {v10, v3}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    const/16 v1, 0x100

    goto :goto_2

    :cond_2
    const/16 v1, 0x80

    :goto_2
    or-int/2addr v0, v1

    :cond_3
    and-int/lit8 v1, p11, 0x8

    if-eqz v1, :cond_5

    or-int/lit16 v0, v0, 0xc00

    :cond_4
    move-object/from16 v2, p3

    goto :goto_4

    :cond_5
    and-int/lit16 v2, v12, 0xc00

    if-nez v2, :cond_4

    move-object/from16 v2, p3

    invoke-virtual {v10, v2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_6

    const/16 v4, 0x800

    goto :goto_3

    :cond_6
    const/16 v4, 0x400

    :goto_3
    or-int/2addr v0, v4

    :goto_4
    and-int/lit16 v4, v12, 0x6000

    if-nez v4, :cond_8

    invoke-virtual {v10, v5, v6}, Lp1/q;->f(J)Z

    move-result v4

    if-eqz v4, :cond_7

    const/16 v4, 0x4000

    goto :goto_5

    :cond_7
    const/16 v4, 0x2000

    :goto_5
    or-int/2addr v0, v4

    :cond_8
    const/high16 v4, 0x30000

    and-int/2addr v4, v12

    if-nez v4, :cond_9

    const/high16 v4, 0x10000

    or-int/2addr v0, v4

    :cond_9
    const/high16 v4, 0x180000

    and-int/2addr v4, v12

    move/from16 v9, p8

    if-nez v4, :cond_b

    invoke-virtual {v10, v9}, Lp1/q;->d(F)Z

    move-result v4

    if-eqz v4, :cond_a

    const/high16 v4, 0x100000

    goto :goto_6

    :cond_a
    const/high16 v4, 0x80000

    :goto_6
    or-int/2addr v0, v4

    :cond_b
    const v4, 0x92493

    and-int/2addr v4, v0

    const v7, 0x92492

    if-eq v4, v7, :cond_c

    const/4 v4, 0x1

    goto :goto_7

    :cond_c
    const/4 v4, 0x0

    :goto_7
    and-int/lit8 v7, v0, 0x1

    invoke-virtual {v10, v7, v4}, Lp1/q;->U(IZ)Z

    move-result v4

    if-eqz v4, :cond_10

    invoke-virtual {v10}, Lp1/q;->Z()V

    and-int/lit8 v4, v12, 0x1

    const v7, -0x70001

    if-eqz v4, :cond_e

    invoke-virtual {v10}, Lp1/q;->C()Z

    move-result v4

    if-eqz v4, :cond_d

    goto :goto_8

    :cond_d
    invoke-virtual {v10}, Lp1/q;->X()V

    and-int/2addr v0, v7

    move-wide/from16 v7, p6

    move-object v4, v2

    move-object/from16 v2, p1

    goto :goto_a

    :cond_e
    :goto_8
    if-eqz v1, :cond_f

    sget-object v1, Lg1/f1;->a:Lx1/b;

    goto :goto_9

    :cond_f
    move-object v1, v2

    :goto_9
    invoke-static {v5, v6, v10}, Lg1/d1;->b(JLandroidx/compose/runtime/Composer;)J

    move-result-wide v13

    and-int/2addr v0, v7

    sget-object v2, Lb2/t;->w:Lb2/t;

    move-object v4, v1

    move-wide v7, v13

    :goto_a
    invoke-virtual {v10}, Lp1/q;->r()V

    and-int/lit8 v1, v0, 0xe

    or-int/lit8 v1, v1, 0x30

    shl-int/lit8 v0, v0, 0x3

    and-int/lit16 v11, v0, 0x380

    or-int/2addr v1, v11

    and-int/lit16 v11, v0, 0x1c00

    or-int/2addr v1, v11

    const v11, 0xe000

    and-int/2addr v11, v0

    or-int/2addr v1, v11

    const/high16 v11, 0x70000

    and-int/2addr v11, v0

    or-int/2addr v1, v11

    const/high16 v11, 0x1c00000

    and-int/2addr v0, v11

    or-int v11, v1, v0

    sget-object v1, Lg1/n0;->e:Ll0/i0;

    move-object v0, p0

    invoke-static/range {v0 .. v11}, Lg1/n0;->c(Lx1/b;Ll0/b2;Landroidx/compose/ui/Modifier;Lc93/m;Lkotlin/jvm/functions/Function3;JJFLandroidx/compose/runtime/Composer;I)V

    goto :goto_b

    :cond_10
    invoke-virtual {v10}, Lp1/q;->X()V

    move-wide/from16 v7, p6

    move-object v4, v2

    move-object/from16 v2, p1

    :goto_b
    invoke-virtual {v10}, Lp1/q;->u()Lp1/v1;

    move-result-object v13

    if-eqz v13, :cond_11

    new-instance v0, Lg1/h0;

    move-object v1, p0

    move-object/from16 v3, p2

    move-wide/from16 v5, p4

    move/from16 v9, p8

    move/from16 v11, p11

    move v10, v12

    invoke-direct/range {v0 .. v11}, Lg1/h0;-><init>(Lx1/b;Landroidx/compose/ui/Modifier;Lc93/m;Lkotlin/jvm/functions/Function3;JJFII)V

    iput-object v0, v13, Lp1/v1;->d:Lc93/m;

    :cond_11
    return-void
.end method
