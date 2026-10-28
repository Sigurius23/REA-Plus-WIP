.class public abstract Lg1/v4;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:F

.field public static final b:F

.field public static final c:F

.field public static final d:Ld0/v;

.field public static final e:Ld0/v;

.field public static final f:Ld0/v;

.field public static final g:Ld0/v;

.field public static final h:Ld0/v;


# direct methods
.method static constructor <clinit>()V
    .locals 7

    sget v0, Lg1/m4;->a:F

    sput v0, Lg1/v4;->a:F

    const/16 v0, 0xf0

    int-to-float v0, v0

    sput v0, Lg1/v4;->b:F

    const/16 v0, 0x28

    int-to-float v0, v0

    sput v0, Lg1/v4;->c:F

    new-instance v0, Ld0/v;

    const v1, 0x3e4ccccd    # 0.2f

    const/4 v2, 0x0

    const v3, 0x3f4ccccd    # 0.8f

    const/high16 v4, 0x3f800000    # 1.0f

    invoke-direct {v0, v1, v2, v3, v4}, Ld0/v;-><init>(FFFF)V

    sput-object v0, Lg1/v4;->d:Ld0/v;

    new-instance v0, Ld0/v;

    const v3, 0x3ecccccd    # 0.4f

    invoke-direct {v0, v3, v2, v4, v4}, Ld0/v;-><init>(FFFF)V

    sput-object v0, Lg1/v4;->e:Ld0/v;

    new-instance v0, Ld0/v;

    const v5, 0x3f266666    # 0.65f

    invoke-direct {v0, v2, v2, v5, v4}, Ld0/v;-><init>(FFFF)V

    sput-object v0, Lg1/v4;->f:Ld0/v;

    new-instance v0, Ld0/v;

    const v5, 0x3dcccccd    # 0.1f

    const v6, 0x3ee66666    # 0.45f

    invoke-direct {v0, v5, v2, v6, v4}, Ld0/v;-><init>(FFFF)V

    sput-object v0, Lg1/v4;->g:Ld0/v;

    new-instance v0, Ld0/v;

    invoke-direct {v0, v3, v2, v1, v4}, Ld0/v;-><init>(FFFF)V

    sput-object v0, Lg1/v4;->h:Ld0/v;

    return-void
.end method

.method public static final a(FIJJLandroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V
    .locals 23

    move/from16 v4, p0

    move/from16 v7, p1

    move-wide/from16 v13, p2

    move-object/from16 v1, p7

    move-object/from16 v0, p6

    check-cast v0, Lp1/q;

    const v2, 0x681b4850

    invoke-virtual {v0, v2}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v2, v7, 0x6

    if-nez v2, :cond_1

    const v2, 0x3f19999a    # 0.6f

    invoke-virtual {v0, v2}, Lp1/q;->d(F)Z

    move-result v2

    if-eqz v2, :cond_0

    const/4 v2, 0x4

    goto :goto_0

    :cond_0
    const/4 v2, 0x2

    :goto_0
    or-int/2addr v2, v7

    goto :goto_1

    :cond_1
    move v2, v7

    :goto_1
    and-int/lit8 v3, v7, 0x30

    if-nez v3, :cond_3

    invoke-virtual {v0, v1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_2

    const/16 v3, 0x20

    goto :goto_2

    :cond_2
    const/16 v3, 0x10

    :goto_2
    or-int/2addr v2, v3

    :cond_3
    and-int/lit16 v3, v7, 0x180

    if-nez v3, :cond_5

    invoke-virtual {v0, v13, v14}, Lp1/q;->f(J)Z

    move-result v3

    if-eqz v3, :cond_4

    const/16 v3, 0x100

    goto :goto_3

    :cond_4
    const/16 v3, 0x80

    :goto_3
    or-int/2addr v2, v3

    :cond_5
    and-int/lit16 v3, v7, 0xc00

    if-nez v3, :cond_7

    invoke-virtual {v0, v4}, Lp1/q;->d(F)Z

    move-result v3

    if-eqz v3, :cond_6

    const/16 v3, 0x800

    goto :goto_4

    :cond_6
    const/16 v3, 0x400

    :goto_4
    or-int/2addr v2, v3

    :cond_7
    and-int/lit16 v3, v7, 0x6000

    move-wide/from16 v10, p4

    if-nez v3, :cond_9

    invoke-virtual {v0, v10, v11}, Lp1/q;->f(J)Z

    move-result v3

    if-eqz v3, :cond_8

    const/16 v3, 0x4000

    goto :goto_5

    :cond_8
    const/16 v3, 0x2000

    :goto_5
    or-int/2addr v2, v3

    :cond_9
    const/high16 v3, 0x30000

    and-int/2addr v3, v7

    const/4 v15, 0x0

    if-nez v3, :cond_b

    invoke-virtual {v0, v15}, Lp1/q;->e(I)Z

    move-result v3

    if-eqz v3, :cond_a

    const/high16 v3, 0x20000

    goto :goto_6

    :cond_a
    const/high16 v3, 0x10000

    :goto_6
    or-int/2addr v2, v3

    :cond_b
    const v3, 0x12493

    and-int/2addr v3, v2

    const v8, 0x12492

    const/4 v9, 0x1

    if-eq v3, v8, :cond_c

    move v3, v9

    goto :goto_7

    :cond_c
    move v3, v15

    :goto_7
    and-int/lit8 v8, v2, 0x1

    invoke-virtual {v0, v8, v3}, Lp1/q;->U(IZ)Z

    move-result v3

    if-eqz v3, :cond_17

    invoke-virtual {v0}, Lp1/q;->Z()V

    and-int/lit8 v3, v7, 0x1

    if-eqz v3, :cond_e

    invoke-virtual {v0}, Lp1/q;->C()Z

    move-result v3

    if-eqz v3, :cond_d

    goto :goto_8

    :cond_d
    invoke-virtual {v0}, Lp1/q;->X()V

    :cond_e
    :goto_8
    invoke-virtual {v0}, Lp1/q;->r()V

    sget-object v3, Lb3/v1;->h:Lp1/u2;

    invoke-virtual {v0, v3}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ly3/c;

    new-instance v12, Lk2/i;

    invoke-interface {v3, v4}, Ly3/c;->q0(F)F

    move-result v17

    const/16 v21, 0x0

    const/16 v22, 0x1a

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    move-object/from16 v16, v12

    invoke-direct/range {v16 .. v22}, Lk2/i;-><init>(FFIILi2/t0;I)V

    const v3, 0x3f19999a    # 0.6f

    invoke-static {v3}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v8

    invoke-static {v3}, Ljava/lang/Float;->isNaN(F)Z

    move-result v16

    if-nez v16, :cond_f

    goto :goto_9

    :cond_f
    const/4 v8, 0x0

    :goto_9
    const/4 v5, 0x0

    if-eqz v8, :cond_10

    invoke-virtual {v8}, Ljava/lang/Float;->floatValue()F

    move-result v8

    goto :goto_a

    :cond_10
    move v8, v5

    :goto_a
    new-instance v6, Li93/e;

    const/high16 v3, 0x3f800000    # 1.0f

    invoke-direct {v6, v5, v3}, Li93/e;-><init>(FF)V

    new-instance v3, Lf0/j1;

    invoke-direct {v3, v8, v6, v15}, Lf0/j1;-><init>(FLi93/f;I)V

    invoke-static {v1, v9, v3}, Li3/n;->c(Landroidx/compose/ui/Modifier;ZLkotlin/jvm/functions/Function1;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    sget v5, Lg1/v4;->c:F

    invoke-static {v5, v3}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    const v5, 0x3f19999a    # 0.6f

    invoke-virtual {v0, v5}, Lp1/q;->d(F)Z

    move-result v6

    const v8, 0xe000

    and-int/2addr v8, v2

    const/16 v5, 0x4000

    if-ne v8, v5, :cond_11

    move v5, v9

    goto :goto_b

    :cond_11
    move v5, v15

    :goto_b
    or-int/2addr v5, v6

    invoke-virtual {v0, v12}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v6

    or-int/2addr v5, v6

    and-int/lit16 v6, v2, 0x380

    xor-int/lit16 v6, v6, 0x180

    const/16 v8, 0x100

    if-le v6, v8, :cond_12

    invoke-virtual {v0, v13, v14}, Lp1/q;->f(J)Z

    move-result v6

    if-nez v6, :cond_14

    :cond_12
    and-int/lit16 v2, v2, 0x180

    if-ne v2, v8, :cond_13

    goto :goto_c

    :cond_13
    move v9, v15

    :cond_14
    :goto_c
    or-int v2, v5, v9

    invoke-virtual {v0}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    if-nez v2, :cond_15

    sget-object v2, Lp1/l;->a:Lp1/v0;

    if-ne v5, v2, :cond_16

    :cond_15
    new-instance v8, Lg1/t4;

    const v9, 0x3f19999a    # 0.6f

    invoke-direct/range {v8 .. v14}, Lg1/t4;-><init>(FJLk2/i;J)V

    invoke-virtual {v0, v8}, Lp1/q;->p0(Ljava/lang/Object;)V

    move-object v5, v8

    :cond_16
    check-cast v5, Lkotlin/jvm/functions/Function1;

    invoke-static {v3, v5, v0, v15}, Lj93/l0;->a(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    goto :goto_d

    :cond_17
    invoke-virtual {v0}, Lp1/q;->X()V

    :goto_d
    invoke-virtual {v0}, Lp1/q;->u()Lp1/v1;

    move-result-object v10

    if-eqz v10, :cond_18

    new-instance v0, Lg1/q4;

    const/4 v8, 0x1

    const/4 v9, 0x0

    move-wide/from16 v2, p2

    move-wide/from16 v5, p4

    invoke-direct/range {v0 .. v9}, Lg1/q4;-><init>(Landroidx/compose/ui/Modifier;JFJIIB)V

    iput-object v0, v10, Lp1/v1;->d:Lc93/m;

    :cond_18
    return-void
.end method

.method public static final b(Landroidx/compose/ui/Modifier;JFJILandroidx/compose/runtime/Composer;II)V
    .locals 29

    move/from16 v8, p8

    move-object/from16 v15, p7

    check-cast v15, Lp1/q;

    const v0, -0x42b466e0

    invoke-virtual {v15, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, p9, 0x1

    const/4 v1, 0x2

    if-eqz v0, :cond_0

    or-int/lit8 v2, v8, 0x6

    move v3, v2

    move-object/from16 v2, p0

    goto :goto_1

    :cond_0
    and-int/lit8 v2, v8, 0x6

    if-nez v2, :cond_2

    move-object/from16 v2, p0

    invoke-virtual {v15, v2}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_1

    const/4 v3, 0x4

    goto :goto_0

    :cond_1
    move v3, v1

    :goto_0
    or-int/2addr v3, v8

    goto :goto_1

    :cond_2
    move-object/from16 v2, p0

    move v3, v8

    :goto_1
    and-int/lit8 v4, v8, 0x30

    if-nez v4, :cond_4

    and-int/lit8 v4, p9, 0x2

    move-wide/from16 v6, p1

    if-nez v4, :cond_3

    invoke-virtual {v15, v6, v7}, Lp1/q;->f(J)Z

    move-result v4

    if-eqz v4, :cond_3

    const/16 v4, 0x20

    goto :goto_2

    :cond_3
    const/16 v4, 0x10

    :goto_2
    or-int/2addr v3, v4

    goto :goto_3

    :cond_4
    move-wide/from16 v6, p1

    :goto_3
    and-int/lit8 v4, p9, 0x4

    if-eqz v4, :cond_6

    or-int/lit16 v3, v3, 0x180

    :cond_5
    move/from16 v10, p3

    goto :goto_5

    :cond_6
    and-int/lit16 v10, v8, 0x180

    if-nez v10, :cond_5

    move/from16 v10, p3

    invoke-virtual {v15, v10}, Lp1/q;->d(F)Z

    move-result v11

    if-eqz v11, :cond_7

    const/16 v11, 0x100

    goto :goto_4

    :cond_7
    const/16 v11, 0x80

    :goto_4
    or-int/2addr v3, v11

    :goto_5
    and-int/lit8 v11, p9, 0x8

    if-eqz v11, :cond_9

    or-int/lit16 v3, v3, 0xc00

    :cond_8
    move-wide/from16 v13, p4

    goto :goto_7

    :cond_9
    and-int/lit16 v13, v8, 0xc00

    if-nez v13, :cond_8

    move-wide/from16 v13, p4

    invoke-virtual {v15, v13, v14}, Lp1/q;->f(J)Z

    move-result v16

    if-eqz v16, :cond_a

    const/16 v16, 0x800

    goto :goto_6

    :cond_a
    const/16 v16, 0x400

    :goto_6
    or-int v3, v3, v16

    :goto_7
    and-int/lit16 v9, v8, 0x6000

    if-nez v9, :cond_d

    and-int/lit8 v9, p9, 0x10

    if-nez v9, :cond_b

    move/from16 v9, p6

    invoke-virtual {v15, v9}, Lp1/q;->e(I)Z

    move-result v16

    if-eqz v16, :cond_c

    const/16 v16, 0x4000

    goto :goto_8

    :cond_b
    move/from16 v9, p6

    :cond_c
    const/16 v16, 0x2000

    :goto_8
    or-int v3, v3, v16

    goto :goto_9

    :cond_d
    move/from16 v9, p6

    :goto_9
    and-int/lit16 v12, v3, 0x2493

    const/16 v5, 0x2492

    const/4 v14, 0x0

    const/4 v13, 0x1

    if-eq v12, v5, :cond_e

    move v5, v13

    goto :goto_a

    :cond_e
    move v5, v14

    :goto_a
    and-int/lit8 v12, v3, 0x1

    invoke-virtual {v15, v12, v5}, Lp1/q;->U(IZ)Z

    move-result v5

    if-eqz v5, :cond_21

    invoke-virtual {v15}, Lp1/q;->Z()V

    and-int/lit8 v5, v8, 0x1

    const v12, -0xe001

    if-eqz v5, :cond_12

    invoke-virtual {v15}, Lp1/q;->C()Z

    move-result v5

    if-eqz v5, :cond_f

    goto :goto_c

    :cond_f
    invoke-virtual {v15}, Lp1/q;->X()V

    and-int/lit8 v0, p9, 0x2

    if-eqz v0, :cond_10

    and-int/lit8 v3, v3, -0x71

    :cond_10
    and-int/lit8 v0, p9, 0x10

    if-eqz v0, :cond_11

    and-int/2addr v3, v12

    :cond_11
    move-wide/from16 v19, p4

    move-object v0, v2

    :goto_b
    move v2, v10

    goto :goto_f

    :cond_12
    :goto_c
    if-eqz v0, :cond_13

    sget-object v0, Lb2/t;->w:Lb2/t;

    goto :goto_d

    :cond_13
    move-object v0, v2

    :goto_d
    and-int/lit8 v2, p9, 0x2

    if-eqz v2, :cond_14

    sget-object v2, Lg1/d1;->a:Lp1/u2;

    invoke-virtual {v15, v2}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lg1/c1;

    invoke-virtual {v2}, Lg1/c1;->f()J

    move-result-wide v5

    and-int/lit8 v3, v3, -0x71

    move-wide v6, v5

    :cond_14
    if-eqz v4, :cond_15

    sget v2, Lg1/m4;->a:F

    move v10, v2

    :cond_15
    if-eqz v11, :cond_16

    sget-wide v4, Li2/x;->m:J

    goto :goto_e

    :cond_16
    move-wide/from16 v4, p4

    :goto_e
    and-int/lit8 v2, p9, 0x10

    if-eqz v2, :cond_17

    and-int/2addr v3, v12

    move v9, v1

    :cond_17
    move-wide/from16 v19, v4

    goto :goto_b

    :goto_f
    invoke-virtual {v15}, Lp1/q;->r()V

    sget-object v4, Lb3/v1;->h:Lp1/u2;

    invoke-virtual {v15, v4}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ly3/c;

    new-instance v21, Lk2/i;

    invoke-interface {v4, v2}, Ly3/c;->q0(F)F

    move-result v4

    const/4 v5, 0x0

    const/16 v10, 0x1a

    const/4 v11, 0x0

    const/4 v12, 0x0

    move/from16 p1, v4

    move-object/from16 p5, v5

    move/from16 p3, v9

    move/from16 p6, v10

    move/from16 p2, v11

    move/from16 p4, v12

    move-object/from16 p0, v21

    invoke-direct/range {p0 .. p6}, Lk2/i;-><init>(FFIILi2/t0;I)V

    move-object/from16 v5, p0

    move/from16 v4, p3

    const/4 v9, 0x0

    invoke-static {v9, v15, v13}, Ld0/f;->s(Ljava/lang/String;Landroidx/compose/runtime/Composer;I)Ld0/l0;

    move-result-object v10

    move-object v11, v10

    invoke-static {v14}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    const/4 v12, 0x5

    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v12

    move-object/from16 v17, v11

    move-object v11, v12

    sget-object v12, Ld0/f;->j:Ld0/f2;

    sget-object v9, Ld0/b0;->c:Lb23/h;

    const/16 v13, 0x1a04

    invoke-static {v13, v14, v9, v1}, Ld0/f;->v(IILd0/z;I)Ld0/e2;

    move-result-object v13

    const/4 v1, 0x6

    const/4 v14, 0x0

    invoke-static {v13, v14, v1}, Ld0/f;->q(Ld0/y;Ld0/v0;I)Ld0/i0;

    move-result-object v13

    const/16 v23, 0x800

    const v16, 0x81b8

    move-object/from16 v24, v9

    move-object/from16 v9, v17

    const/16 v17, 0x10

    move-object/from16 v25, v14

    const/4 v14, 0x0

    move/from16 v22, v2

    move-object/from16 v2, v24

    const/4 v1, 0x0

    invoke-static/range {v9 .. v17}, Ld0/f;->j(Ld0/l0;Ljava/lang/Number;Ljava/lang/Number;Ld0/f2;Ld0/i0;Ljava/lang/String;Landroidx/compose/runtime/Composer;II)Ld0/j0;

    move-result-object v10

    const/16 v11, 0x534

    const/4 v12, 0x2

    invoke-static {v11, v1, v2, v12}, Ld0/f;->v(IILd0/z;I)Ld0/e2;

    move-result-object v2

    const/4 v11, 0x6

    const/4 v14, 0x0

    invoke-static {v2, v14, v11}, Ld0/f;->q(Ld0/y;Ld0/v0;I)Ld0/i0;

    move-result-object v2

    const/16 v11, 0x8

    const/4 v12, 0x0

    const/high16 v13, 0x438f0000    # 286.0f

    const/16 v16, 0x0

    const/16 v17, 0x11b8

    move-object/from16 p3, v2

    move-object/from16 p0, v9

    move/from16 p7, v11

    move/from16 p1, v12

    move/from16 p2, v13

    move-object/from16 p5, v15

    move-object/from16 p4, v16

    move/from16 p6, v17

    invoke-static/range {p0 .. p7}, Ld0/f;->g(Ld0/l0;FFLd0/i0;Ljava/lang/String;Landroidx/compose/runtime/Composer;II)Ld0/j0;

    move-result-object v2

    move/from16 v11, p6

    invoke-virtual {v15}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v12

    sget-object v13, Lp1/l;->a:Lp1/v0;

    if-ne v12, v13, :cond_18

    new-instance v12, Lf0/q1;

    const/4 v11, 0x5

    invoke-direct {v12, v11}, Lf0/q1;-><init>(I)V

    invoke-virtual {v15, v12}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_18
    check-cast v12, Lkotlin/jvm/functions/Function1;

    invoke-static {v12}, Ld0/f;->r(Lkotlin/jvm/functions/Function1;)Ld0/p0;

    move-result-object v11

    const/4 v12, 0x6

    invoke-static {v11, v14, v12}, Ld0/f;->q(Ld0/y;Ld0/v0;I)Ld0/i0;

    move-result-object v11

    const/4 v12, 0x0

    const/16 v16, 0x8

    const/16 v17, 0x0

    const/high16 v18, 0x43910000    # 290.0f

    move-object/from16 p0, v9

    move-object/from16 p3, v11

    move-object/from16 p4, v12

    move-object/from16 p5, v15

    move/from16 p7, v16

    move/from16 p1, v17

    move/from16 p2, v18

    const/16 p6, 0x11b8

    invoke-static/range {p0 .. p7}, Ld0/f;->g(Ld0/l0;FFLd0/i0;Ljava/lang/String;Landroidx/compose/runtime/Composer;II)Ld0/j0;

    move-result-object v9

    move-object/from16 v11, p0

    invoke-virtual {v15}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v12

    if-ne v12, v13, :cond_19

    new-instance v12, Lf0/q1;

    const/4 v1, 0x6

    invoke-direct {v12, v1}, Lf0/q1;-><init>(I)V

    invoke-virtual {v15, v12}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_19
    check-cast v12, Lkotlin/jvm/functions/Function1;

    invoke-static {v12}, Ld0/f;->r(Lkotlin/jvm/functions/Function1;)Ld0/p0;

    move-result-object v1

    const/4 v12, 0x6

    invoke-static {v1, v14, v12}, Ld0/f;->q(Ld0/y;Ld0/v0;I)Ld0/i0;

    move-result-object v1

    const/4 v12, 0x0

    const/16 v14, 0x8

    const/16 v17, 0x0

    const/high16 v18, 0x43910000    # 290.0f

    move-object/from16 p3, v1

    move-object/from16 p0, v11

    move-object/from16 p4, v12

    move/from16 p7, v14

    move-object/from16 p5, v15

    move/from16 p1, v17

    move/from16 p2, v18

    const/16 p6, 0x11b8

    invoke-static/range {p0 .. p7}, Ld0/f;->g(Ld0/l0;FFLd0/i0;Ljava/lang/String;Landroidx/compose/runtime/Composer;II)Ld0/j0;

    move-result-object v1

    new-instance v11, Ldc1/c;

    const/16 v12, 0x1d

    invoke-direct {v11, v12}, Ldc1/c;-><init>(I)V

    const/4 v12, 0x1

    invoke-static {v0, v12, v11}, Li3/n;->c(Landroidx/compose/ui/Modifier;ZLkotlin/jvm/functions/Function1;)Landroidx/compose/ui/Modifier;

    move-result-object v11

    sget v14, Lg1/v4;->c:F

    invoke-static {v14, v11}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v11

    and-int/lit16 v14, v3, 0x1c00

    const/16 v12, 0x800

    if-ne v14, v12, :cond_1a

    const/4 v14, 0x1

    goto :goto_10

    :cond_1a
    const/4 v14, 0x0

    :goto_10
    invoke-virtual {v15, v5}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v12

    or-int/2addr v12, v14

    invoke-virtual {v15, v10}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v14

    or-int/2addr v12, v14

    invoke-virtual {v15, v9}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v14

    or-int/2addr v12, v14

    invoke-virtual {v15, v1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v14

    or-int/2addr v12, v14

    invoke-virtual {v15, v2}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v14

    or-int/2addr v12, v14

    and-int/lit16 v14, v3, 0x380

    move-object/from16 v17, v0

    const/16 v0, 0x100

    if-ne v14, v0, :cond_1b

    const/4 v14, 0x1

    goto :goto_11

    :cond_1b
    const/4 v14, 0x0

    :goto_11
    or-int v0, v12, v14

    and-int/lit8 v12, v3, 0x70

    xor-int/lit8 v12, v12, 0x30

    const/16 v14, 0x20

    if-le v12, v14, :cond_1c

    invoke-virtual {v15, v6, v7}, Lp1/q;->f(J)Z

    move-result v12

    if-nez v12, :cond_1d

    :cond_1c
    and-int/lit8 v3, v3, 0x30

    if-ne v3, v14, :cond_1e

    :cond_1d
    const/4 v14, 0x1

    goto :goto_12

    :cond_1e
    const/4 v14, 0x0

    :goto_12
    or-int/2addr v0, v14

    invoke-virtual {v15}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    if-nez v0, :cond_20

    if-ne v3, v13, :cond_1f

    goto :goto_13

    :cond_1f
    move-wide/from16 v23, v6

    goto :goto_14

    :cond_20
    :goto_13
    new-instance v18, Lg1/r4;

    move-object/from16 v27, v1

    move-object/from16 v28, v2

    move-object/from16 v21, v5

    move-wide/from16 v23, v6

    move-object/from16 v26, v9

    move-object/from16 v25, v10

    invoke-direct/range {v18 .. v28}, Lg1/r4;-><init>(JLk2/i;FJLd0/j0;Ld0/j0;Ld0/j0;Ld0/j0;)V

    move-object/from16 v3, v18

    invoke-virtual {v15, v3}, Lp1/q;->p0(Ljava/lang/Object;)V

    :goto_14
    check-cast v3, Lkotlin/jvm/functions/Function1;

    const/4 v1, 0x0

    invoke-static {v11, v3, v15, v1}, Lj93/l0;->a(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    move v7, v4

    move-object/from16 v1, v17

    move-wide/from16 v5, v19

    move/from16 v4, v22

    move-wide/from16 v2, v23

    goto :goto_15

    :cond_21
    invoke-virtual {v15}, Lp1/q;->X()V

    move-object v1, v2

    move-wide v2, v6

    move v7, v9

    move v4, v10

    move-wide/from16 v5, p4

    :goto_15
    invoke-virtual {v15}, Lp1/q;->u()Lp1/v1;

    move-result-object v10

    if-eqz v10, :cond_22

    new-instance v0, Lg1/s4;

    move/from16 v9, p9

    invoke-direct/range {v0 .. v9}, Lg1/s4;-><init>(Landroidx/compose/ui/Modifier;JFJIII)V

    iput-object v0, v10, Lp1/v1;->d:Lc93/m;

    :cond_22
    return-void
.end method

.method public static final c(Landroidx/compose/ui/Modifier;JJLandroidx/compose/runtime/Composer;I)V
    .locals 23

    move-object/from16 v1, p0

    move-wide/from16 v2, p1

    move-wide/from16 v4, p3

    move-object/from16 v11, p5

    check-cast v11, Lp1/q;

    const v0, 0x598122d0

    invoke-virtual {v11, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, p6, 0x6

    if-nez v0, :cond_1

    invoke-virtual {v11, v1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x4

    goto :goto_0

    :cond_0
    const/4 v0, 0x2

    :goto_0
    or-int v0, p6, v0

    goto :goto_1

    :cond_1
    move/from16 v0, p6

    :goto_1
    invoke-virtual {v11, v2, v3}, Lp1/q;->f(J)Z

    move-result v6

    if-eqz v6, :cond_2

    const/16 v6, 0x20

    goto :goto_2

    :cond_2
    const/16 v6, 0x10

    :goto_2
    or-int/2addr v0, v6

    invoke-virtual {v11, v4, v5}, Lp1/q;->f(J)Z

    move-result v6

    if-eqz v6, :cond_3

    const/16 v6, 0x100

    goto :goto_3

    :cond_3
    const/16 v6, 0x80

    :goto_3
    or-int/2addr v0, v6

    or-int/lit16 v0, v0, 0x400

    and-int/lit16 v6, v0, 0x493

    const/16 v7, 0x492

    const/4 v8, 0x0

    const/4 v9, 0x1

    if-eq v6, v7, :cond_4

    move v6, v9

    goto :goto_4

    :cond_4
    move v6, v8

    :goto_4
    and-int/lit8 v7, v0, 0x1

    invoke-virtual {v11, v7, v6}, Lp1/q;->U(IZ)Z

    move-result v6

    if-eqz v6, :cond_13

    invoke-virtual {v11}, Lp1/q;->Z()V

    and-int/lit8 v6, p6, 0x1

    if-eqz v6, :cond_6

    invoke-virtual {v11}, Lp1/q;->C()Z

    move-result v6

    if-eqz v6, :cond_5

    goto :goto_5

    :cond_5
    invoke-virtual {v11}, Lp1/q;->X()V

    :cond_6
    :goto_5
    and-int/lit16 v0, v0, -0x1c01

    invoke-virtual {v11}, Lp1/q;->r()V

    const/4 v6, 0x0

    invoke-static {v6, v11, v9}, Ld0/f;->s(Ljava/lang/String;Landroidx/compose/runtime/Composer;I)Ld0/l0;

    move-result-object v7

    invoke-virtual {v11}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v10

    sget-object v12, Lp1/l;->a:Lp1/v0;

    if-ne v10, v12, :cond_7

    new-instance v10, Lfq2/c;

    const/16 v13, 0x1b

    invoke-direct {v10, v13}, Lfq2/c;-><init>(I)V

    invoke-virtual {v11, v10}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_7
    check-cast v10, Lkotlin/jvm/functions/Function1;

    invoke-static {v10}, Ld0/f;->r(Lkotlin/jvm/functions/Function1;)Ld0/p0;

    move-result-object v10

    const/4 v13, 0x6

    invoke-static {v10, v6, v13}, Ld0/f;->q(Ld0/y;Ld0/v0;I)Ld0/i0;

    move-result-object v10

    move/from16 v16, v13

    const/16 v13, 0x8

    move-object/from16 v17, v6

    move-object v6, v7

    const/4 v7, 0x0

    move/from16 v18, v8

    const/high16 v8, 0x3f800000    # 1.0f

    move/from16 v19, v9

    move-object v9, v10

    const/4 v10, 0x0

    move-object/from16 v20, v12

    const/16 v12, 0x11b8

    move/from16 v15, v16

    move-object/from16 v14, v20

    invoke-static/range {v6 .. v13}, Ld0/f;->g(Ld0/l0;FFLd0/i0;Ljava/lang/String;Landroidx/compose/runtime/Composer;II)Ld0/j0;

    move-result-object v7

    invoke-virtual {v11}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v8

    if-ne v8, v14, :cond_8

    new-instance v8, Lfq2/c;

    const/16 v9, 0x1c

    invoke-direct {v8, v9}, Lfq2/c;-><init>(I)V

    invoke-virtual {v11, v8}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_8
    check-cast v8, Lkotlin/jvm/functions/Function1;

    invoke-static {v8}, Ld0/f;->r(Lkotlin/jvm/functions/Function1;)Ld0/p0;

    move-result-object v8

    const/4 v9, 0x0

    invoke-static {v8, v9, v15}, Ld0/f;->q(Ld0/y;Ld0/v0;I)Ld0/i0;

    move-result-object v8

    const/4 v10, 0x0

    const/16 v13, 0x8

    move-object v9, v7

    const/4 v7, 0x0

    move-object/from16 v19, v9

    move-object v9, v8

    const/high16 v8, 0x3f800000    # 1.0f

    move-object/from16 v21, v19

    invoke-static/range {v6 .. v13}, Ld0/f;->g(Ld0/l0;FFLd0/i0;Ljava/lang/String;Landroidx/compose/runtime/Composer;II)Ld0/j0;

    move-result-object v8

    invoke-virtual {v11}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v7

    if-ne v7, v14, :cond_9

    new-instance v7, Lfq2/c;

    const/16 v9, 0x1d

    invoke-direct {v7, v9}, Lfq2/c;-><init>(I)V

    invoke-virtual {v11, v7}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_9
    check-cast v7, Lkotlin/jvm/functions/Function1;

    invoke-static {v7}, Ld0/f;->r(Lkotlin/jvm/functions/Function1;)Ld0/p0;

    move-result-object v7

    const/4 v9, 0x0

    invoke-static {v7, v9, v15}, Ld0/f;->q(Ld0/y;Ld0/v0;I)Ld0/i0;

    move-result-object v7

    const/4 v10, 0x0

    const/16 v13, 0x8

    move-object v9, v7

    const/4 v7, 0x0

    move-object/from16 v19, v8

    const/high16 v8, 0x3f800000    # 1.0f

    move-object/from16 v22, v19

    invoke-static/range {v6 .. v13}, Ld0/f;->g(Ld0/l0;FFLd0/i0;Ljava/lang/String;Landroidx/compose/runtime/Composer;II)Ld0/j0;

    move-result-object v9

    invoke-virtual {v11}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v7

    if-ne v7, v14, :cond_a

    new-instance v7, Lg1/u4;

    const/4 v8, 0x0

    invoke-direct {v7, v8}, Lg1/u4;-><init>(I)V

    invoke-virtual {v11, v7}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_a
    check-cast v7, Lkotlin/jvm/functions/Function1;

    invoke-static {v7}, Ld0/f;->r(Lkotlin/jvm/functions/Function1;)Ld0/p0;

    move-result-object v7

    const/4 v8, 0x0

    invoke-static {v7, v8, v15}, Ld0/f;->q(Ld0/y;Ld0/v0;I)Ld0/i0;

    move-result-object v7

    const/4 v10, 0x0

    const/16 v13, 0x8

    move-object v8, v9

    move-object v9, v7

    const/4 v7, 0x0

    move-object v15, v8

    const/high16 v8, 0x3f800000    # 1.0f

    invoke-static/range {v6 .. v13}, Ld0/f;->g(Ld0/l0;FFLd0/i0;Ljava/lang/String;Landroidx/compose/runtime/Composer;II)Ld0/j0;

    move-result-object v10

    const/16 v6, 0xa

    int-to-float v6, v6

    new-instance v7, Lev2/g;

    const/4 v8, 0x2

    invoke-direct {v7, v6, v8}, Lev2/g;-><init>(FI)V

    invoke-static {v1, v7}, Landroidx/compose/ui/layout/a;->b(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function3;)Landroidx/compose/ui/Modifier;

    move-result-object v7

    new-instance v8, Lfq2/c;

    const/16 v9, 0x1a

    invoke-direct {v8, v9}, Lfq2/c;-><init>(I)V

    const/4 v9, 0x1

    invoke-static {v7, v9, v8}, Li3/n;->c(Landroidx/compose/ui/Modifier;ZLkotlin/jvm/functions/Function1;)Landroidx/compose/ui/Modifier;

    move-result-object v7

    const/4 v8, 0x0

    invoke-static {v7, v8, v6, v9}, Landroidx/compose/foundation/layout/a;->r(Landroidx/compose/ui/Modifier;FFI)Landroidx/compose/ui/Modifier;

    move-result-object v6

    new-instance v7, Ldc1/c;

    const/16 v8, 0x1d

    invoke-direct {v7, v8}, Ldc1/c;-><init>(I)V

    invoke-static {v6, v9, v7}, Li3/n;->c(Landroidx/compose/ui/Modifier;ZLkotlin/jvm/functions/Function1;)Landroidx/compose/ui/Modifier;

    move-result-object v6

    sget v7, Lg1/v4;->b:F

    sget v8, Lg1/v4;->a:F

    invoke-static {v6, v7, v8}, Landroidx/compose/foundation/layout/d;->r(Landroidx/compose/ui/Modifier;FF)Landroidx/compose/ui/Modifier;

    move-result-object v12

    and-int/lit16 v6, v0, 0x380

    xor-int/lit16 v6, v6, 0x180

    const/16 v7, 0x100

    if-le v6, v7, :cond_b

    invoke-virtual {v11, v4, v5}, Lp1/q;->f(J)Z

    move-result v6

    if-nez v6, :cond_c

    :cond_b
    and-int/lit16 v6, v0, 0x180

    if-ne v6, v7, :cond_d

    :cond_c
    move v8, v9

    :goto_6
    const/4 v6, 0x0

    goto :goto_7

    :cond_d
    const/4 v8, 0x0

    goto :goto_6

    :goto_7
    invoke-virtual {v11, v6}, Lp1/q;->e(I)Z

    move-result v7

    or-int v6, v8, v7

    move-object/from16 v7, v21

    invoke-virtual {v11, v7}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v8

    or-int/2addr v6, v8

    move-object/from16 v8, v22

    invoke-virtual {v11, v8}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v13

    or-int/2addr v6, v13

    and-int/lit8 v13, v0, 0x70

    xor-int/lit8 v13, v13, 0x30

    const/16 v9, 0x20

    if-le v13, v9, :cond_e

    invoke-virtual {v11, v2, v3}, Lp1/q;->f(J)Z

    move-result v13

    if-nez v13, :cond_f

    :cond_e
    and-int/lit8 v0, v0, 0x30

    if-ne v0, v9, :cond_10

    :cond_f
    const/16 v19, 0x1

    goto :goto_8

    :cond_10
    const/16 v19, 0x0

    :goto_8
    or-int v0, v6, v19

    invoke-virtual {v11, v15}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v6

    or-int/2addr v0, v6

    invoke-virtual {v11, v10}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v6

    or-int/2addr v0, v6

    invoke-virtual {v11}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v6

    if-nez v0, :cond_11

    if-ne v6, v14, :cond_12

    :cond_11
    new-instance v2, Lg1/n4;

    move-wide v3, v4

    move-object v9, v15

    move-wide/from16 v5, p1

    invoke-direct/range {v2 .. v10}, Lg1/n4;-><init>(JJLd0/j0;Ld0/j0;Ld0/j0;Ld0/j0;)V

    invoke-virtual {v11, v2}, Lp1/q;->p0(Ljava/lang/Object;)V

    move-object v6, v2

    :cond_12
    check-cast v6, Lkotlin/jvm/functions/Function1;

    const/4 v0, 0x0

    invoke-static {v12, v6, v11, v0}, Lj93/l0;->a(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    goto :goto_9

    :cond_13
    invoke-virtual {v11}, Lp1/q;->X()V

    :goto_9
    invoke-virtual {v11}, Lp1/q;->u()Lp1/v1;

    move-result-object v8

    if-eqz v8, :cond_14

    new-instance v0, Lg1/o4;

    const/4 v7, 0x0

    move-wide/from16 v2, p1

    move-wide/from16 v4, p3

    move/from16 v6, p6

    invoke-direct/range {v0 .. v7}, Lg1/o4;-><init>(Ljava/lang/Object;JJII)V

    iput-object v0, v8, Lp1/v1;->d:Lc93/m;

    :cond_14
    return-void
.end method

.method public static final d(FIJJLandroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V
    .locals 17

    move/from16 v1, p0

    move/from16 v7, p1

    move-wide/from16 v11, p2

    move-wide/from16 v9, p4

    move-object/from16 v2, p7

    move-object/from16 v0, p6

    check-cast v0, Lp1/q;

    const v3, -0x1fb571e0

    invoke-virtual {v0, v3}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v3, v7, 0x6

    if-nez v3, :cond_1

    invoke-virtual {v0, v1}, Lp1/q;->d(F)Z

    move-result v3

    if-eqz v3, :cond_0

    const/4 v3, 0x4

    goto :goto_0

    :cond_0
    const/4 v3, 0x2

    :goto_0
    or-int/2addr v3, v7

    goto :goto_1

    :cond_1
    move v3, v7

    :goto_1
    and-int/lit8 v4, v7, 0x30

    if-nez v4, :cond_3

    invoke-virtual {v0, v2}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_2

    const/16 v4, 0x20

    goto :goto_2

    :cond_2
    const/16 v4, 0x10

    :goto_2
    or-int/2addr v3, v4

    :cond_3
    and-int/lit16 v4, v7, 0x180

    if-nez v4, :cond_5

    invoke-virtual {v0, v11, v12}, Lp1/q;->f(J)Z

    move-result v4

    if-eqz v4, :cond_4

    const/16 v4, 0x100

    goto :goto_3

    :cond_4
    const/16 v4, 0x80

    :goto_3
    or-int/2addr v3, v4

    :cond_5
    and-int/lit16 v4, v7, 0xc00

    if-nez v4, :cond_7

    invoke-virtual {v0, v9, v10}, Lp1/q;->f(J)Z

    move-result v4

    if-eqz v4, :cond_6

    const/16 v4, 0x800

    goto :goto_4

    :cond_6
    const/16 v4, 0x400

    :goto_4
    or-int/2addr v3, v4

    :cond_7
    and-int/lit16 v4, v7, 0x6000

    if-nez v4, :cond_8

    or-int/lit16 v3, v3, 0x2000

    :cond_8
    and-int/lit16 v4, v3, 0x2493

    const/16 v8, 0x2492

    const/4 v13, 0x1

    if-eq v4, v8, :cond_9

    move v4, v13

    goto :goto_5

    :cond_9
    const/4 v4, 0x0

    :goto_5
    and-int/lit8 v8, v3, 0x1

    invoke-virtual {v0, v8, v4}, Lp1/q;->U(IZ)Z

    move-result v4

    if-eqz v4, :cond_18

    invoke-virtual {v0}, Lp1/q;->Z()V

    and-int/lit8 v4, v7, 0x1

    const v8, -0xe001

    if-eqz v4, :cond_b

    invoke-virtual {v0}, Lp1/q;->C()Z

    move-result v4

    if-eqz v4, :cond_a

    goto :goto_6

    :cond_a
    invoke-virtual {v0}, Lp1/q;->X()V

    :cond_b
    :goto_6
    and-int/2addr v3, v8

    invoke-virtual {v0}, Lp1/q;->r()V

    const/4 v4, 0x0

    cmpg-float v8, v1, v4

    if-gez v8, :cond_c

    move v8, v4

    goto :goto_7

    :cond_c
    move v8, v1

    :goto_7
    const/high16 v15, 0x3f800000    # 1.0f

    cmpl-float v16, v8, v15

    if-lez v16, :cond_d

    move v8, v15

    :cond_d
    const/16 v5, 0xa

    int-to-float v5, v5

    new-instance v6, Lev2/g;

    const/4 v14, 0x2

    invoke-direct {v6, v5, v14}, Lev2/g;-><init>(FI)V

    invoke-static {v2, v6}, Landroidx/compose/ui/layout/a;->b(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function3;)Landroidx/compose/ui/Modifier;

    move-result-object v6

    new-instance v14, Lfq2/c;

    const/16 v15, 0x1a

    invoke-direct {v14, v15}, Lfq2/c;-><init>(I)V

    invoke-static {v6, v13, v14}, Li3/n;->c(Landroidx/compose/ui/Modifier;ZLkotlin/jvm/functions/Function1;)Landroidx/compose/ui/Modifier;

    move-result-object v6

    invoke-static {v6, v4, v5, v13}, Landroidx/compose/foundation/layout/a;->r(Landroidx/compose/ui/Modifier;FFI)Landroidx/compose/ui/Modifier;

    move-result-object v5

    invoke-static {v8}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v6

    invoke-static {v8}, Ljava/lang/Float;->isNaN(F)Z

    move-result v14

    if-nez v14, :cond_e

    goto :goto_8

    :cond_e
    const/4 v6, 0x0

    :goto_8
    if-eqz v6, :cond_f

    invoke-virtual {v6}, Ljava/lang/Float;->floatValue()F

    move-result v6

    goto :goto_9

    :cond_f
    move v6, v4

    :goto_9
    new-instance v14, Li93/e;

    const/high16 v15, 0x3f800000    # 1.0f

    invoke-direct {v14, v4, v15}, Li93/e;-><init>(FF)V

    new-instance v4, Lf0/j1;

    const/4 v15, 0x0

    invoke-direct {v4, v6, v14, v15}, Lf0/j1;-><init>(FLi93/f;I)V

    invoke-static {v5, v13, v4}, Li3/n;->c(Landroidx/compose/ui/Modifier;ZLkotlin/jvm/functions/Function1;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    sget v5, Lg1/v4;->b:F

    sget v6, Lg1/v4;->a:F

    invoke-static {v4, v5, v6}, Landroidx/compose/foundation/layout/d;->r(Landroidx/compose/ui/Modifier;FF)Landroidx/compose/ui/Modifier;

    move-result-object v4

    and-int/lit16 v5, v3, 0x1c00

    xor-int/lit16 v5, v5, 0xc00

    const/16 v6, 0x800

    if-le v5, v6, :cond_10

    invoke-virtual {v0, v9, v10}, Lp1/q;->f(J)Z

    move-result v5

    if-nez v5, :cond_11

    :cond_10
    and-int/lit16 v5, v3, 0xc00

    if-ne v5, v6, :cond_12

    :cond_11
    move v15, v13

    :goto_a
    const/4 v5, 0x0

    goto :goto_b

    :cond_12
    const/4 v15, 0x0

    goto :goto_a

    :goto_b
    invoke-virtual {v0, v5}, Lp1/q;->e(I)Z

    move-result v6

    or-int v5, v15, v6

    invoke-virtual {v0, v8}, Lp1/q;->d(F)Z

    move-result v6

    or-int/2addr v5, v6

    and-int/lit16 v6, v3, 0x380

    xor-int/lit16 v6, v6, 0x180

    const/16 v14, 0x100

    if-le v6, v14, :cond_13

    invoke-virtual {v0, v11, v12}, Lp1/q;->f(J)Z

    move-result v6

    if-nez v6, :cond_15

    :cond_13
    and-int/lit16 v3, v3, 0x180

    if-ne v3, v14, :cond_14

    goto :goto_c

    :cond_14
    const/4 v13, 0x0

    :cond_15
    :goto_c
    or-int v3, v5, v13

    invoke-virtual {v0}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    if-nez v3, :cond_16

    sget-object v3, Lp1/l;->a:Lp1/v0;

    if-ne v5, v3, :cond_17

    :cond_16
    move v13, v8

    new-instance v8, Lg1/p4;

    invoke-direct/range {v8 .. v13}, Lg1/p4;-><init>(JJF)V

    invoke-virtual {v0, v8}, Lp1/q;->p0(Ljava/lang/Object;)V

    move-object v5, v8

    :cond_17
    check-cast v5, Lkotlin/jvm/functions/Function1;

    const/4 v15, 0x0

    invoke-static {v4, v5, v0, v15}, Lj93/l0;->a(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    goto :goto_d

    :cond_18
    invoke-virtual {v0}, Lp1/q;->X()V

    :goto_d
    invoke-virtual {v0}, Lp1/q;->u()Lp1/v1;

    move-result-object v8

    if-eqz v8, :cond_19

    new-instance v0, Lg1/q4;

    move-wide/from16 v3, p2

    move-wide/from16 v5, p4

    invoke-direct/range {v0 .. v7}, Lg1/q4;-><init>(FLandroidx/compose/ui/Modifier;JJI)V

    iput-object v0, v8, Lp1/v1;->d:Lc93/m;

    :cond_19
    return-void
.end method

.method public static final e(Lk2/e;FFJLk2/i;)V
    .locals 12

    move-object/from16 v10, p5

    iget v0, v10, Lk2/i;->a:F

    const/4 v1, 0x2

    int-to-float v1, v1

    div-float/2addr v0, v1

    invoke-interface {p0}, Lk2/e;->d()J

    move-result-wide v2

    const/16 v4, 0x20

    shr-long/2addr v2, v4

    long-to-int v2, v2

    invoke-static {v2}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v2

    mul-float/2addr v1, v0

    sub-float/2addr v2, v1

    invoke-static {v0}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v1

    int-to-long v5, v1

    invoke-static {v0}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v0

    int-to-long v0, v0

    shl-long/2addr v5, v4

    const-wide v7, 0xffffffffL

    and-long/2addr v0, v7

    or-long/2addr v5, v0

    invoke-static {v2}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v0

    int-to-long v0, v0

    invoke-static {v2}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v2

    int-to-long v2, v2

    shl-long/2addr v0, v4

    and-long/2addr v2, v7

    or-long v7, v0, v2

    const/4 v9, 0x0

    const/16 v11, 0x340

    move-object v0, p0

    move v3, p1

    move v4, p2

    move-wide v1, p3

    invoke-static/range {v0 .. v11}, Lk2/e;->P(Lk2/e;JFFJJFLk2/i;I)V

    return-void
.end method

.method public static final f(FFJFLk2/e;)V
    .locals 22

    invoke-interface/range {p5 .. p5}, Lk2/e;->d()J

    move-result-wide v0

    const/16 v2, 0x20

    shr-long/2addr v0, v2

    long-to-int v0, v0

    invoke-static {v0}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v0

    invoke-interface/range {p5 .. p5}, Lk2/e;->d()J

    move-result-wide v3

    const-wide v5, 0xffffffffL

    and-long/2addr v3, v5

    long-to-int v1, v3

    invoke-static {v1}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v1

    const/4 v3, 0x2

    int-to-float v3, v3

    div-float/2addr v1, v3

    invoke-interface/range {p5 .. p5}, Lk2/e;->getLayoutDirection()Ly3/m;

    move-result-object v3

    sget-object v4, Ly3/m;->w:Ly3/m;

    if-ne v3, v4, :cond_0

    const/4 v3, 0x1

    goto :goto_0

    :cond_0
    const/4 v3, 0x0

    :goto_0
    const/high16 v4, 0x3f800000    # 1.0f

    if-eqz v3, :cond_1

    move/from16 v7, p0

    goto :goto_1

    :cond_1
    sub-float v7, v4, p1

    :goto_1
    mul-float/2addr v7, v0

    if-eqz v3, :cond_2

    move/from16 v3, p1

    goto :goto_2

    :cond_2
    sub-float v3, v4, p0

    :goto_2
    mul-float/2addr v3, v0

    invoke-static {v7}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v0

    int-to-long v7, v0

    invoke-static {v1}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v0

    int-to-long v9, v0

    shl-long/2addr v7, v2

    and-long/2addr v9, v5

    or-long v14, v7, v9

    invoke-static {v3}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v0

    int-to-long v3, v0

    invoke-static {v1}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v0

    int-to-long v0, v0

    shl-long v2, v3, v2

    and-long/2addr v0, v5

    or-long v16, v2, v0

    const/16 v20, 0x0

    const/16 v21, 0x1f0

    const/16 v19, 0x0

    move-wide/from16 v12, p2

    move/from16 v18, p4

    move-object/from16 v11, p5

    invoke-static/range {v11 .. v21}, Lk2/e;->A0(Lk2/e;JJJFILi2/t0;I)V

    return-void
.end method
