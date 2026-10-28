.class public abstract Lst1/f;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u001aK\u0010\n\u001a\u00020\t2\u0008\u0008\u0002\u0010\u0001\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u00042\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0008\u001a\u00020\u0002H\u0001\u00a2\u0006\u0004\u0008\n\u0010\u000b\u00a8\u0006\u000c"
    }
    d2 = {
        "Ly3/f;",
        "gridSize",
        "",
        "strokeWidth",
        "Li2/x;",
        "lineColor",
        "gradientRadius",
        "gradientStartX",
        "gradientStartY",
        "Ll83/a0;",
        "c",
        "(FFJFFFLandroidx/compose/runtime/Composer;II)V",
        "labrador_release"
    }
    k = 0x2
    mv = {
        0x2,
        0x3,
        0x0
    }
    xi = 0x30
.end annotation


# direct methods
.method public static synthetic a(FFJFFFIILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p10}, Lst1/f;->e(FFJFFFIILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(FFFFJFLk2/e;)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p7}, Lst1/f;->d(FFFFJFLk2/e;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final c(FFJFFFLandroidx/compose/runtime/Composer;II)V
    .locals 28

    move/from16 v8, p8

    move-object/from16 v0, p7

    check-cast v0, Lp1/q;

    const v1, 0x7aa90543

    invoke-virtual {v0, v1}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v1, p9, 0x1

    if-eqz v1, :cond_0

    or-int/lit8 v2, v8, 0x6

    move v3, v2

    move/from16 v2, p0

    goto :goto_1

    :cond_0
    and-int/lit8 v2, v8, 0x6

    if-nez v2, :cond_2

    move/from16 v2, p0

    invoke-virtual {v0, v2}, Lp1/q;->d(F)Z

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
    move/from16 v2, p0

    move v3, v8

    :goto_1
    and-int/lit8 v4, p9, 0x2

    if-eqz v4, :cond_4

    or-int/lit8 v3, v3, 0x30

    :cond_3
    move/from16 v6, p1

    goto :goto_3

    :cond_4
    and-int/lit8 v6, v8, 0x30

    if-nez v6, :cond_3

    move/from16 v6, p1

    invoke-virtual {v0, v6}, Lp1/q;->d(F)Z

    move-result v7

    if-eqz v7, :cond_5

    const/16 v7, 0x20

    goto :goto_2

    :cond_5
    const/16 v7, 0x10

    :goto_2
    or-int/2addr v3, v7

    :goto_3
    and-int/lit16 v7, v8, 0x180

    if-nez v7, :cond_7

    and-int/lit8 v7, p9, 0x4

    move-wide/from16 v10, p2

    if-nez v7, :cond_6

    invoke-virtual {v0, v10, v11}, Lp1/q;->f(J)Z

    move-result v7

    if-eqz v7, :cond_6

    const/16 v7, 0x100

    goto :goto_4

    :cond_6
    const/16 v7, 0x80

    :goto_4
    or-int/2addr v3, v7

    goto :goto_5

    :cond_7
    move-wide/from16 v10, p2

    :goto_5
    and-int/lit8 v7, p9, 0x8

    if-eqz v7, :cond_9

    or-int/lit16 v3, v3, 0xc00

    :cond_8
    move/from16 v13, p4

    goto :goto_7

    :cond_9
    and-int/lit16 v13, v8, 0xc00

    if-nez v13, :cond_8

    move/from16 v13, p4

    invoke-virtual {v0, v13}, Lp1/q;->d(F)Z

    move-result v14

    if-eqz v14, :cond_a

    const/16 v14, 0x800

    goto :goto_6

    :cond_a
    const/16 v14, 0x400

    :goto_6
    or-int/2addr v3, v14

    :goto_7
    and-int/lit8 v14, p9, 0x10

    if-eqz v14, :cond_c

    or-int/lit16 v3, v3, 0x6000

    :cond_b
    move/from16 v5, p5

    goto :goto_9

    :cond_c
    and-int/lit16 v5, v8, 0x6000

    if-nez v5, :cond_b

    move/from16 v5, p5

    invoke-virtual {v0, v5}, Lp1/q;->d(F)Z

    move-result v16

    if-eqz v16, :cond_d

    const/16 v16, 0x4000

    goto :goto_8

    :cond_d
    const/16 v16, 0x2000

    :goto_8
    or-int v3, v3, v16

    :goto_9
    and-int/lit8 v16, p9, 0x20

    const/high16 v17, 0x30000

    if-eqz v16, :cond_e

    or-int v3, v3, v17

    move/from16 v12, p6

    goto :goto_b

    :cond_e
    and-int v17, v8, v17

    move/from16 v12, p6

    if-nez v17, :cond_10

    invoke-virtual {v0, v12}, Lp1/q;->d(F)Z

    move-result v18

    if-eqz v18, :cond_f

    const/high16 v18, 0x20000

    goto :goto_a

    :cond_f
    const/high16 v18, 0x10000

    :goto_a
    or-int v3, v3, v18

    :cond_10
    :goto_b
    const v18, 0x12493

    and-int v9, v3, v18

    const v15, 0x12492

    move/from16 v19, v1

    const/4 v1, 0x1

    if-eq v9, v15, :cond_11

    move v9, v1

    goto :goto_c

    :cond_11
    const/4 v9, 0x0

    :goto_c
    and-int/lit8 v15, v3, 0x1

    invoke-virtual {v0, v15, v9}, Lp1/q;->U(IZ)Z

    move-result v9

    if-eqz v9, :cond_27

    invoke-virtual {v0}, Lp1/q;->Z()V

    and-int/lit8 v9, v8, 0x1

    const/high16 v15, 0x3f800000    # 1.0f

    if-eqz v9, :cond_14

    invoke-virtual {v0}, Lp1/q;->C()Z

    move-result v9

    if-eqz v9, :cond_12

    goto :goto_f

    :cond_12
    invoke-virtual {v0}, Lp1/q;->X()V

    and-int/lit8 v4, p9, 0x4

    if-eqz v4, :cond_13

    and-int/lit16 v3, v3, -0x381

    :cond_13
    move/from16 v21, v5

    move/from16 v27, v6

    move-wide v9, v10

    :goto_d
    move/from16 v22, v12

    :goto_e
    move/from16 v23, v13

    goto :goto_12

    :cond_14
    :goto_f
    if-eqz v19, :cond_15

    const/16 v2, 0xf

    int-to-float v2, v2

    :cond_15
    if-eqz v4, :cond_16

    move v6, v15

    :cond_16
    and-int/lit8 v4, p9, 0x4

    if-eqz v4, :cond_17

    sget-object v4, Lx81/d;->a:Lx81/d;

    sget v9, Lx81/d;->b:I

    invoke-virtual {v4, v0, v9}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v4

    invoke-virtual {v4}, Ly81/i;->X0()J

    move-result-wide v9

    and-int/lit16 v3, v3, -0x381

    goto :goto_10

    :cond_17
    move-wide v9, v10

    :goto_10
    if-eqz v7, :cond_18

    const/high16 v4, 0x40400000    # 3.0f

    move v13, v4

    :cond_18
    if-eqz v14, :cond_19

    const/high16 v4, 0x40000000    # 2.0f

    goto :goto_11

    :cond_19
    move v4, v5

    :goto_11
    if-eqz v16, :cond_1a

    const/high16 v5, 0x40200000    # 2.5f

    move/from16 v21, v4

    move/from16 v22, v5

    move/from16 v27, v6

    goto :goto_e

    :cond_1a
    move/from16 v21, v4

    move/from16 v27, v6

    goto :goto_d

    :goto_12
    invoke-virtual {v0}, Lp1/q;->r()V

    sget-object v4, Lb2/t;->w:Lb2/t;

    invoke-static {v15, v4}, Landroidx/compose/foundation/layout/d;->d(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v5

    sget-object v6, Lb2/e;->w:Lb2/m;

    const/4 v7, 0x0

    invoke-static {v6, v7}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v6

    iget-wide v11, v0, Lp1/q;->T:J

    invoke-static {v11, v12}, Ljava/lang/Long;->hashCode(J)I

    move-result v11

    invoke-virtual {v0}, Lp1/q;->m()Lp1/p1;

    move-result-object v12

    invoke-static {v0, v5}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v5

    sget-object v13, La3/l;->a:La3/k;

    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v13, La3/k;->b:La3/j;

    invoke-virtual {v0}, Lp1/q;->i0()V

    iget-boolean v14, v0, Lp1/q;->S:Z

    if-eqz v14, :cond_1b

    invoke-virtual {v0, v13}, Lp1/q;->l(Lc93/a;)V

    goto :goto_13

    :cond_1b
    invoke-virtual {v0}, Lp1/q;->s0()V

    :goto_13
    sget-object v13, La3/k;->g:La3/i;

    invoke-static {v0, v13, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v6, La3/k;->f:La3/i;

    invoke-static {v0, v6, v12}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v6, La3/k;->j:La3/i;

    iget-boolean v12, v0, Lp1/q;->S:Z

    if-nez v12, :cond_1c

    invoke-virtual {v0}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v12

    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v13

    invoke-static {v12, v13}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v12

    if-nez v12, :cond_1d

    :cond_1c
    invoke-static {v11, v0, v11, v6}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_1d
    sget-object v6, La3/k;->d:La3/i;

    invoke-static {v0, v6, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v5, Lb3/v1;->h:Lp1/u2;

    invoke-virtual {v0, v5}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ly3/c;

    invoke-interface {v5, v2}, Ly3/c;->q0(F)F

    move-result v5

    invoke-static {v15, v4}, Landroidx/compose/foundation/layout/d;->d(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    const v6, 0xe000

    and-int/2addr v6, v3

    const/16 v11, 0x4000

    if-ne v6, v11, :cond_1e

    move v6, v1

    goto :goto_14

    :cond_1e
    move v6, v7

    :goto_14
    const/high16 v11, 0x70000

    and-int/2addr v11, v3

    const/high16 v12, 0x20000

    if-ne v11, v12, :cond_1f

    move v11, v1

    goto :goto_15

    :cond_1f
    move v11, v7

    :goto_15
    or-int/2addr v6, v11

    and-int/lit16 v11, v3, 0x1c00

    const/16 v12, 0x800

    if-ne v11, v12, :cond_20

    move v11, v1

    goto :goto_16

    :cond_20
    move v11, v7

    :goto_16
    or-int/2addr v6, v11

    invoke-virtual {v0, v5}, Lp1/q;->d(F)Z

    move-result v11

    or-int/2addr v6, v11

    and-int/lit16 v11, v3, 0x380

    xor-int/lit16 v11, v11, 0x180

    const/16 v12, 0x100

    if-le v11, v12, :cond_21

    invoke-virtual {v0, v9, v10}, Lp1/q;->f(J)Z

    move-result v11

    if-nez v11, :cond_22

    :cond_21
    and-int/lit16 v11, v3, 0x180

    if-ne v11, v12, :cond_23

    :cond_22
    move v11, v1

    goto :goto_17

    :cond_23
    move v11, v7

    :goto_17
    or-int/2addr v6, v11

    and-int/lit8 v3, v3, 0x70

    const/16 v11, 0x20

    if-ne v3, v11, :cond_24

    move v7, v1

    :cond_24
    or-int v3, v6, v7

    invoke-virtual {v0}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v6

    if-nez v3, :cond_26

    sget-object v3, Lp1/l;->a:Lp1/v0;

    if-ne v6, v3, :cond_25

    goto :goto_18

    :cond_25
    move-wide/from16 v25, v9

    goto :goto_19

    :cond_26
    :goto_18
    new-instance v20, Lst1/d;

    move/from16 v24, v5

    move-wide/from16 v25, v9

    invoke-direct/range {v20 .. v27}, Lst1/d;-><init>(FFFFJF)V

    move-object/from16 v6, v20

    invoke-virtual {v0, v6}, Lp1/q;->p0(Ljava/lang/Object;)V

    :goto_19
    check-cast v6, Lkotlin/jvm/functions/Function1;

    const/4 v3, 0x6

    invoke-static {v4, v6, v0, v3}, Lj93/l0;->a(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    invoke-virtual {v0, v1}, Lp1/q;->q(Z)V

    move v1, v2

    move/from16 v6, v21

    move/from16 v7, v22

    move/from16 v5, v23

    move-wide/from16 v3, v25

    move/from16 v2, v27

    goto :goto_1a

    :cond_27
    invoke-virtual {v0}, Lp1/q;->X()V

    move v1, v2

    move v2, v6

    move-wide v3, v10

    move v7, v12

    move v6, v5

    move v5, v13

    :goto_1a
    invoke-virtual {v0}, Lp1/q;->u()Lp1/v1;

    move-result-object v10

    if-eqz v10, :cond_28

    new-instance v0, Lst1/e;

    move/from16 v9, p9

    invoke-direct/range {v0 .. v9}, Lst1/e;-><init>(FFJFFFII)V

    iput-object v0, v10, Lp1/v1;->d:Lc93/m;

    :cond_28
    return-void
.end method

.method private static final d(FFFFJFLk2/e;)Ll83/a0;
    .locals 30

    const-string v0, "$this$Canvas"

    move-object/from16 v1, p7

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {v1}, Lk2/e;->d()J

    move-result-wide v2

    const/16 v0, 0x20

    shr-long/2addr v2, v0

    long-to-int v2, v2

    invoke-static {v2}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v2

    div-float v2, v2, p0

    invoke-interface {v1}, Lk2/e;->d()J

    move-result-wide v3

    const-wide v11, 0xffffffffL

    and-long/2addr v3, v11

    long-to-int v3, v3

    invoke-static {v3}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v3

    div-float v3, v3, p1

    invoke-static {v2}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v2

    int-to-long v4, v2

    invoke-static {v3}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v2

    int-to-long v2, v2

    shl-long/2addr v4, v0

    and-long/2addr v2, v11

    or-long v15, v4, v2

    invoke-interface {v1}, Lk2/e;->d()J

    move-result-wide v2

    shr-long/2addr v2, v0

    long-to-int v2, v2

    invoke-static {v2}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v2

    invoke-interface {v1}, Lk2/e;->d()J

    move-result-wide v3

    shr-long/2addr v3, v0

    long-to-int v3, v3

    invoke-static {v3}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v3

    mul-float/2addr v3, v2

    invoke-interface {v1}, Lk2/e;->d()J

    move-result-wide v4

    and-long/2addr v4, v11

    long-to-int v2, v4

    invoke-static {v2}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v2

    invoke-interface {v1}, Lk2/e;->d()J

    move-result-wide v4

    and-long/2addr v4, v11

    long-to-int v4, v4

    invoke-static {v4}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v4

    mul-float/2addr v4, v2

    add-float/2addr v4, v3

    float-to-double v2, v4

    invoke-static {v2, v3}, Ljava/lang/Math;->sqrt(D)D

    move-result-wide v2

    double-to-float v2, v2

    div-float v17, v2, p2

    invoke-interface {v1}, Lk2/e;->d()J

    move-result-wide v2

    and-long/2addr v2, v11

    long-to-int v2, v2

    invoke-static {v2}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v2

    div-float v2, v2, p3

    float-to-int v2, v2

    invoke-interface {v1}, Lk2/e;->d()J

    move-result-wide v3

    shr-long/2addr v3, v0

    long-to-int v3, v3

    invoke-static {v3}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v3

    div-float v3, v3, p3

    float-to-int v3, v3

    if-ltz v2, :cond_2

    const/16 v19, 0x0

    move/from16 v4, v19

    :goto_0
    if-ltz v3, :cond_0

    move/from16 v5, v19

    :goto_1
    int-to-float v6, v5

    mul-float v20, v6, p3

    int-to-float v6, v4

    mul-float v21, v6, p3

    add-int/lit8 v6, v5, 0x1

    int-to-float v7, v6

    mul-float v7, v7, p3

    add-int/lit8 v8, v4, 0x1

    int-to-float v8, v8

    mul-float v22, v8, p3

    sget-object v13, Li2/t;->b:Li2/s;

    new-instance v8, Li2/x;

    move-wide/from16 v9, p4

    invoke-direct {v8, v9, v10}, Li2/x;-><init>(J)V

    move/from16 v23, v0

    sget-wide v0, Li2/x;->m:J

    new-instance v14, Li2/x;

    invoke-direct {v14, v0, v1}, Li2/x;-><init>(J)V

    filled-new-array {v8, v14}, [Li2/x;

    move-result-object v0

    invoke-static {v0}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v14

    const/16 v18, 0x8

    invoke-static/range {v13 .. v18}, Li2/s;->g(Li2/s;Ljava/util/List;JFI)Li2/u0;

    move-result-object v0

    invoke-static/range {v20 .. v20}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v1

    int-to-long v13, v1

    invoke-static/range {v21 .. v21}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v1

    move-wide/from16 v24, v11

    int-to-long v11, v1

    shl-long v13, v13, v23

    and-long v11, v11, v24

    or-long/2addr v11, v13

    invoke-static {v7}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v1

    int-to-long v7, v1

    invoke-static/range {v21 .. v21}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v1

    int-to-long v13, v1

    shl-long v7, v7, v23

    and-long v13, v13, v24

    or-long/2addr v7, v13

    const/4 v9, 0x0

    const/16 v10, 0x1f0

    move v1, v5

    move-wide/from16 v26, v7

    move v7, v6

    move-wide/from16 v5, v26

    const/4 v8, 0x0

    move v14, v1

    move v13, v4

    move-object/from16 v1, p7

    move/from16 v26, v7

    move/from16 v7, p6

    move/from16 v27, v2

    move-object v2, v0

    move/from16 v0, v26

    move-wide/from16 v28, v11

    move/from16 v11, v27

    move v12, v3

    move-wide/from16 v3, v28

    invoke-static/range {v1 .. v10}, Lk2/e;->j(Lk2/e;Li2/t;JJFLi2/t0;FI)V

    invoke-static/range {v20 .. v20}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v1

    int-to-long v3, v1

    invoke-static/range {v21 .. v21}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v1

    int-to-long v5, v1

    shl-long v3, v3, v23

    and-long v5, v5, v24

    or-long/2addr v3, v5

    invoke-static/range {v20 .. v20}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v1

    int-to-long v5, v1

    invoke-static/range {v22 .. v22}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v1

    int-to-long v7, v1

    shl-long v5, v5, v23

    and-long v7, v7, v24

    or-long/2addr v5, v7

    const/4 v8, 0x0

    move/from16 v7, p6

    move-object/from16 v1, p7

    invoke-static/range {v1 .. v10}, Lk2/e;->j(Lk2/e;Li2/t;JJFLi2/t0;FI)V

    if-eq v14, v12, :cond_1

    move-object/from16 v1, p7

    move v5, v0

    move v2, v11

    move v3, v12

    move v4, v13

    move/from16 v0, v23

    move-wide/from16 v11, v24

    goto/16 :goto_1

    :cond_0
    move/from16 v23, v0

    move v13, v4

    move-wide/from16 v24, v11

    move v11, v2

    move v12, v3

    :cond_1
    if-eq v13, v11, :cond_2

    add-int/lit8 v4, v13, 0x1

    move-object/from16 v1, p7

    move v2, v11

    move v3, v12

    move/from16 v0, v23

    move-wide/from16 v11, v24

    goto/16 :goto_0

    :cond_2
    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method

.method private static final e(FFJFFFIILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 11

    or-int/lit8 v0, p7, 0x1

    invoke-static {v0}, Lp1/x;->L(I)I

    move-result v9

    move v1, p0

    move v2, p1

    move-wide v3, p2

    move v5, p4

    move/from16 v6, p5

    move/from16 v7, p6

    move/from16 v10, p8

    move-object/from16 v8, p9

    invoke-static/range {v1 .. v10}, Lst1/f;->c(FFJFFFLandroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method
