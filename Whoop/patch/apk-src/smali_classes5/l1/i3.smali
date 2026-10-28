.class public abstract Ll1/i3;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:F

.field public static final b:Ld0/v;


# direct methods
.method static constructor <clinit>()V
    .locals 1

    sget v0, Lo1/c;->a:F

    sput v0, Ll1/i3;->a:F

    sget-object v0, Lo1/o;->c:Ld0/v;

    sput-object v0, Ll1/i3;->b:Ld0/v;

    return-void
.end method

.method public static final a(Landroidx/compose/ui/Modifier;JFJIFLandroidx/compose/runtime/Composer;II)V
    .locals 29

    move-object/from16 v1, p0

    move-wide/from16 v12, p1

    move/from16 v6, p3

    move/from16 v0, p9

    move-object/from16 v2, p8

    check-cast v2, Lp1/q;

    const v3, 0x13db87c1

    invoke-virtual {v2, v3}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v3, v0, 0x6

    const/4 v4, 0x2

    if-nez v3, :cond_1

    invoke-virtual {v2, v1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    const/4 v3, 0x4

    goto :goto_0

    :cond_0
    move v3, v4

    :goto_0
    or-int/2addr v3, v0

    goto :goto_1

    :cond_1
    move v3, v0

    :goto_1
    and-int/lit8 v5, v0, 0x30

    if-nez v5, :cond_3

    invoke-virtual {v2, v12, v13}, Lp1/q;->f(J)Z

    move-result v5

    if-eqz v5, :cond_2

    const/16 v5, 0x20

    goto :goto_2

    :cond_2
    const/16 v5, 0x10

    :goto_2
    or-int/2addr v3, v5

    :cond_3
    and-int/lit16 v5, v0, 0x180

    if-nez v5, :cond_5

    invoke-virtual {v2, v6}, Lp1/q;->d(F)Z

    move-result v5

    if-eqz v5, :cond_4

    const/16 v5, 0x100

    goto :goto_3

    :cond_4
    const/16 v5, 0x80

    :goto_3
    or-int/2addr v3, v5

    :cond_5
    and-int/lit16 v5, v0, 0xc00

    if-nez v5, :cond_7

    and-int/lit8 v5, p10, 0x8

    move-wide/from16 v10, p4

    if-nez v5, :cond_6

    invoke-virtual {v2, v10, v11}, Lp1/q;->f(J)Z

    move-result v5

    if-eqz v5, :cond_6

    const/16 v5, 0x800

    goto :goto_4

    :cond_6
    const/16 v5, 0x400

    :goto_4
    or-int/2addr v3, v5

    goto :goto_5

    :cond_7
    move-wide/from16 v10, p4

    :goto_5
    and-int/lit8 v5, p10, 0x10

    if-eqz v5, :cond_9

    or-int/lit16 v3, v3, 0x6000

    :cond_8
    move/from16 v15, p6

    goto :goto_7

    :cond_9
    and-int/lit16 v15, v0, 0x6000

    if-nez v15, :cond_8

    move/from16 v15, p6

    invoke-virtual {v2, v15}, Lp1/q;->e(I)Z

    move-result v16

    if-eqz v16, :cond_a

    const/16 v16, 0x4000

    goto :goto_6

    :cond_a
    const/16 v16, 0x2000

    :goto_6
    or-int v3, v3, v16

    :goto_7
    and-int/lit8 v16, p10, 0x20

    const/high16 v17, 0x30000

    if-eqz v16, :cond_b

    or-int v3, v3, v17

    move/from16 v14, p7

    goto :goto_9

    :cond_b
    and-int v17, v0, v17

    move/from16 v14, p7

    if-nez v17, :cond_d

    invoke-virtual {v2, v14}, Lp1/q;->d(F)Z

    move-result v18

    if-eqz v18, :cond_c

    const/high16 v18, 0x20000

    goto :goto_8

    :cond_c
    const/high16 v18, 0x10000

    :goto_8
    or-int v3, v3, v18

    :cond_d
    :goto_9
    const v18, 0x12493

    and-int v9, v3, v18

    const v8, 0x12492

    const/4 v7, 0x0

    const/4 v15, 0x1

    if-eq v9, v8, :cond_e

    move v8, v15

    goto :goto_a

    :cond_e
    move v8, v7

    :goto_a
    and-int/lit8 v9, v3, 0x1

    invoke-virtual {v2, v9, v8}, Lp1/q;->U(IZ)Z

    move-result v8

    if-eqz v8, :cond_20

    invoke-virtual {v2}, Lp1/q;->Z()V

    and-int/lit8 v8, v0, 0x1

    if-eqz v8, :cond_11

    invoke-virtual {v2}, Lp1/q;->C()Z

    move-result v8

    if-eqz v8, :cond_f

    goto :goto_c

    :cond_f
    invoke-virtual {v2}, Lp1/q;->X()V

    and-int/lit8 v5, p10, 0x8

    if-eqz v5, :cond_10

    and-int/lit16 v3, v3, -0x1c01

    :cond_10
    move/from16 v25, p6

    move-wide v9, v10

    :goto_b
    move v5, v14

    goto :goto_f

    :cond_11
    :goto_c
    and-int/lit8 v8, p10, 0x8

    if-eqz v8, :cond_12

    sget v8, Ll1/f3;->a:I

    sget-wide v8, Li2/x;->m:J

    and-int/lit16 v3, v3, -0x1c01

    goto :goto_d

    :cond_12
    move-wide v8, v10

    :goto_d
    if-eqz v5, :cond_13

    sget v5, Ll1/f3;->a:I

    goto :goto_e

    :cond_13
    move/from16 v5, p6

    :goto_e
    if-eqz v16, :cond_14

    sget v10, Ll1/f3;->b:F

    move/from16 v25, v5

    move v5, v10

    move-wide v9, v8

    goto :goto_f

    :cond_14
    move/from16 v25, v5

    move-wide v9, v8

    goto :goto_b

    :goto_f
    invoke-virtual {v2}, Lp1/q;->r()V

    sget-object v8, Lb3/v1;->h:Lp1/u2;

    invoke-virtual {v2, v8}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ly3/c;

    new-instance v22, Lk2/i;

    invoke-interface {v8, v6}, Ly3/c;->q0(F)F

    move-result v23

    const/16 v27, 0x0

    const/16 v28, 0x1a

    const/16 v24, 0x0

    const/16 v26, 0x0

    invoke-direct/range {v22 .. v28}, Lk2/i;-><init>(FFIILi2/t0;I)V

    move-object/from16 v11, v22

    const/4 v8, 0x0

    invoke-static {v8, v2, v15}, Ld0/f;->s(Ljava/lang/String;Landroidx/compose/runtime/Composer;I)Ld0/l0;

    move-result-object v14

    sget-object v15, Ld0/b0;->c:Lb23/h;

    const/16 v8, 0x1770

    invoke-static {v8, v7, v15, v4}, Ld0/f;->v(IILd0/z;I)Ld0/e2;

    move-result-object v4

    const/4 v15, 0x6

    const/4 v7, 0x0

    invoke-static {v4, v7, v15}, Ld0/f;->q(Ld0/y;Ld0/v0;I)Ld0/i0;

    move-result-object v4

    const/16 v21, 0x8

    move/from16 v18, v15

    const/4 v15, 0x0

    const/16 v19, 0x1

    const/high16 v16, 0x44870000    # 1080.0f

    move/from16 v20, v18

    const/16 v18, 0x0

    move/from16 v23, v20

    const/16 v20, 0x11b8

    move/from16 v17, v19

    move-object/from16 v19, v2

    move/from16 v2, v17

    move-object/from16 v17, v4

    move/from16 v4, v23

    invoke-static/range {v14 .. v21}, Ld0/f;->g(Ld0/l0;FFLd0/i0;Ljava/lang/String;Landroidx/compose/runtime/Composer;II)Ld0/j0;

    move-result-object v15

    new-instance v2, Lkx1/b;

    const/16 v8, 0x11

    invoke-direct {v2, v8}, Lkx1/b;-><init>(I)V

    invoke-static {v2}, Ld0/f;->r(Lkotlin/jvm/functions/Function1;)Ld0/p0;

    move-result-object v2

    invoke-static {v2, v7, v4}, Ld0/f;->q(Ld0/y;Ld0/v0;I)Ld0/i0;

    move-result-object v17

    move-object v7, v15

    const/4 v15, 0x0

    const/high16 v16, 0x43b40000    # 360.0f

    invoke-static/range {v14 .. v21}, Ld0/f;->g(Ld0/l0;FFLd0/i0;Ljava/lang/String;Landroidx/compose/runtime/Composer;II)Ld0/j0;

    move-result-object v8

    new-instance v2, Ld0/p0;

    new-instance v15, Ld0/o0;

    invoke-direct {v15}, Ld0/o0;-><init>()V

    const/16 v4, 0x1770

    iput v4, v15, Ld0/o0;->a:I

    const v16, 0x3f5eb852    # 0.87f

    invoke-static/range {v16 .. v16}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v4

    const/16 v0, 0xbb8

    invoke-virtual {v15, v0, v4}, Ld0/o0;->a(ILjava/lang/Float;)Ld0/n0;

    move-result-object v0

    sget-object v4, Ll1/i3;->b:Ld0/v;

    iput-object v4, v0, Ld0/n0;->b:Ld0/z;

    const v0, 0x3dcccccd    # 0.1f

    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v0

    const/16 v4, 0x1770

    invoke-virtual {v15, v4, v0}, Ld0/o0;->a(ILjava/lang/Float;)Ld0/n0;

    invoke-direct {v2, v15}, Ld0/p0;-><init>(Ld0/o0;)V

    const/4 v0, 0x0

    const/4 v4, 0x6

    invoke-static {v2, v0, v4}, Ld0/f;->q(Ld0/y;Ld0/v0;I)Ld0/i0;

    move-result-object v17

    const v15, 0x3dcccccd    # 0.1f

    invoke-static/range {v14 .. v21}, Ld0/f;->g(Ld0/l0;FFLd0/i0;Ljava/lang/String;Landroidx/compose/runtime/Composer;II)Ld0/j0;

    move-result-object v0

    move-object/from16 v15, v19

    new-instance v2, Ldc1/c;

    const/16 v4, 0x1d

    invoke-direct {v2, v4}, Ldc1/c;-><init>(I)V

    const/4 v4, 0x1

    invoke-static {v1, v4, v2}, Li3/n;->c(Landroidx/compose/ui/Modifier;ZLkotlin/jvm/functions/Function1;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    sget v14, Ll1/i3;->a:F

    invoke-static {v14, v2}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v14

    invoke-virtual {v15, v0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v2

    const v16, 0xe000

    and-int v4, v3, v16

    move-object/from16 p4, v0

    const/16 v0, 0x4000

    if-ne v4, v0, :cond_15

    const/4 v0, 0x1

    goto :goto_10

    :cond_15
    const/4 v0, 0x0

    :goto_10
    or-int/2addr v0, v2

    const/high16 v2, 0x70000

    and-int/2addr v2, v3

    const/high16 v4, 0x20000

    if-ne v2, v4, :cond_16

    const/4 v2, 0x1

    goto :goto_11

    :cond_16
    const/4 v2, 0x0

    :goto_11
    or-int/2addr v0, v2

    and-int/lit16 v2, v3, 0x380

    const/16 v4, 0x100

    if-ne v2, v4, :cond_17

    const/4 v2, 0x1

    goto :goto_12

    :cond_17
    const/4 v2, 0x0

    :goto_12
    or-int/2addr v0, v2

    invoke-virtual {v15, v7}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v2

    or-int/2addr v0, v2

    invoke-virtual {v15, v8}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v2

    or-int/2addr v0, v2

    and-int/lit16 v2, v3, 0x1c00

    xor-int/lit16 v2, v2, 0xc00

    const/16 v4, 0x800

    if-le v2, v4, :cond_18

    invoke-virtual {v15, v9, v10}, Lp1/q;->f(J)Z

    move-result v2

    if-nez v2, :cond_19

    :cond_18
    and-int/lit16 v2, v3, 0xc00

    if-ne v2, v4, :cond_1a

    :cond_19
    const/4 v2, 0x1

    goto :goto_13

    :cond_1a
    const/4 v2, 0x0

    :goto_13
    or-int/2addr v0, v2

    invoke-virtual {v15, v11}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v2

    or-int/2addr v0, v2

    and-int/lit8 v2, v3, 0x70

    xor-int/lit8 v2, v2, 0x30

    const/16 v4, 0x20

    if-le v2, v4, :cond_1b

    invoke-virtual {v15, v12, v13}, Lp1/q;->f(J)Z

    move-result v2

    if-nez v2, :cond_1c

    :cond_1b
    and-int/lit8 v2, v3, 0x30

    if-ne v2, v4, :cond_1d

    :cond_1c
    const/16 v19, 0x1

    goto :goto_14

    :cond_1d
    const/16 v19, 0x0

    :goto_14
    or-int v0, v0, v19

    invoke-virtual {v15}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    if-nez v0, :cond_1f

    sget-object v0, Lp1/l;->a:Lp1/v0;

    if-ne v2, v0, :cond_1e

    goto :goto_15

    :cond_1e
    const/4 v0, 0x0

    goto :goto_16

    :cond_1f
    :goto_15
    new-instance v2, Ll1/g3;

    move-object/from16 v3, p4

    move/from16 v4, v25

    const/4 v0, 0x0

    invoke-direct/range {v2 .. v13}, Ll1/g3;-><init>(Ld0/j0;IFFLd0/j0;Ld0/j0;JLk2/i;J)V

    invoke-virtual {v15, v2}, Lp1/q;->p0(Ljava/lang/Object;)V

    :goto_16
    check-cast v2, Lkotlin/jvm/functions/Function1;

    invoke-static {v14, v2, v15, v0}, Lj93/l0;->a(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    move v8, v5

    move-wide v5, v9

    move/from16 v7, v25

    goto :goto_17

    :cond_20
    move-object v15, v2

    invoke-virtual {v15}, Lp1/q;->X()V

    move/from16 v7, p6

    move-wide v5, v10

    move v8, v14

    :goto_17
    invoke-virtual {v15}, Lp1/q;->u()Lp1/v1;

    move-result-object v11

    if-eqz v11, :cond_21

    new-instance v0, Ll1/h3;

    move-wide/from16 v2, p1

    move/from16 v4, p3

    move/from16 v9, p9

    move/from16 v10, p10

    invoke-direct/range {v0 .. v10}, Ll1/h3;-><init>(Landroidx/compose/ui/Modifier;JFJIFII)V

    iput-object v0, v11, Lp1/v1;->d:Lc93/m;

    :cond_21
    return-void
.end method

.method public static final b(FIIJJLandroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V
    .locals 18

    move-object/from16 v8, p7

    check-cast v8, Lp1/q;

    const v0, -0x6e80f9f

    invoke-virtual {v8, v0}, Lp1/q;->g0(I)Lp1/q;

    move-wide/from16 v13, p3

    invoke-virtual {v8, v13, v14}, Lp1/q;->f(J)Z

    move-result v0

    if-eqz v0, :cond_0

    const/16 v0, 0x20

    goto :goto_0

    :cond_0
    const/16 v0, 0x10

    :goto_0
    or-int v0, p2, v0

    or-int/lit16 v0, v0, 0x6400

    and-int/lit16 v1, v0, 0x2493

    const/16 v2, 0x2492

    if-eq v1, v2, :cond_1

    const/4 v1, 0x1

    goto :goto_1

    :cond_1
    const/4 v1, 0x0

    :goto_1
    and-int/lit8 v2, v0, 0x1

    invoke-virtual {v8, v2, v1}, Lp1/q;->U(IZ)Z

    move-result v1

    if-eqz v1, :cond_4

    invoke-virtual {v8}, Lp1/q;->Z()V

    and-int/lit8 v1, p2, 0x1

    if-eqz v1, :cond_3

    invoke-virtual {v8}, Lp1/q;->C()Z

    move-result v1

    if-eqz v1, :cond_2

    goto :goto_2

    :cond_2
    invoke-virtual {v8}, Lp1/q;->X()V

    and-int/lit16 v0, v0, -0x1c01

    move/from16 v6, p1

    move-wide/from16 v4, p5

    goto :goto_3

    :cond_3
    :goto_2
    sget v1, Ll1/f3;->a:I

    sget-wide v1, Li2/x;->m:J

    and-int/lit16 v0, v0, -0x1c01

    sget v3, Ll1/f3;->a:I

    move-wide v4, v1

    move v6, v3

    :goto_3
    invoke-virtual {v8}, Lp1/q;->r()V

    sget v7, Ll1/f3;->b:F

    and-int/lit8 v0, v0, 0x70

    const v1, 0x36186

    or-int v9, v0, v1

    const/4 v10, 0x0

    move/from16 v3, p0

    move-object/from16 v0, p8

    move-wide v1, v13

    invoke-static/range {v0 .. v10}, Ll1/i3;->a(Landroidx/compose/ui/Modifier;JFJIFLandroidx/compose/runtime/Composer;II)V

    move-wide v15, v4

    move v11, v6

    goto :goto_4

    :cond_4
    invoke-virtual {v8}, Lp1/q;->X()V

    move/from16 v11, p1

    move-wide/from16 v15, p5

    :goto_4
    invoke-virtual {v8}, Lp1/q;->u()Lp1/v1;

    move-result-object v0

    if-eqz v0, :cond_5

    new-instance v9, Lg1/q4;

    move/from16 v10, p0

    move/from16 v12, p2

    move-wide/from16 v13, p3

    move-object/from16 v17, p8

    invoke-direct/range {v9 .. v17}, Lg1/q4;-><init>(FIIJJLandroidx/compose/ui/Modifier;)V

    iput-object v9, v0, Lp1/v1;->d:Lc93/m;

    :cond_5
    return-void
.end method

.method public static final c(Lk2/e;FFJLk2/i;)V
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
