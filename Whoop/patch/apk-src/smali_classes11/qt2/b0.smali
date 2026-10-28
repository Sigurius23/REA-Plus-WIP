.class public abstract Lqt2/b0;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000:\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u000c\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0007\u00a2\u0006\u0004\u0008\u0003\u0010\u0004\u001a\u0017\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0007\u00a2\u0006\u0004\u0008\u0005\u0010\u0004\u001a5\u0010\u000f\u001a\u00020\u0002*\u00020\u00062\u0006\u0010\u0008\u001a\u00020\u00072\u0006\u0010\n\u001a\u00020\t2\u0008\u0010\u000c\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0002\u00a2\u0006\u0004\u0008\u000f\u0010\u0010\u001a+\u0010\u0015\u001a\u00020\u0002*\u00020\u00062\u0006\u0010\u0008\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0014\u001a\u00020\u0013H\u0002\u00a2\u0006\u0004\u0008\u0015\u0010\u0016\u001aC\u0010\u001c\u001a\u00020\u0002*\u00020\u00062\u0006\u0010\u0008\u001a\u00020\u00072\u0006\u0010\u0017\u001a\u00020\u00072\u0006\u0010\u0018\u001a\u00020\u00072\u0006\u0010\u0019\u001a\u00020\u00072\u0006\u0010\u001a\u001a\u00020\u00132\u0006\u0010\u001b\u001a\u00020\u0013H\u0002\u00a2\u0006\u0004\u0008\u001c\u0010\u001d\u001a)\u0010\u001e\u001a\u00020\u0002*\u00020\u00062\u0006\u0010\u0008\u001a\u00020\u00072\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\u0013\u00a2\u0006\u0004\u0008\u001e\u0010\u0016\u00a8\u0006\u001f"
    }
    d2 = {
        "Lqt2/y;",
        "itemState",
        "Ll83/a0;",
        "g",
        "(Lqt2/y;Landroidx/compose/runtime/Composer;I)V",
        "d",
        "Lk2/e;",
        "Lh2/b;",
        "topLeft",
        "",
        "text",
        "Landroid/graphics/Typeface;",
        "typeFace",
        "",
        "color",
        "l",
        "(Lk2/e;JLjava/lang/String;Landroid/graphics/Typeface;I)V",
        "Lh2/e;",
        "size",
        "Li2/x;",
        "stripeColor",
        "k",
        "(Lk2/e;JJJ)V",
        "topRight",
        "bottomRight",
        "bottomLeft",
        "gradientColorStart",
        "gradientColorEnd",
        "j",
        "(Lk2/e;JJJJJJ)V",
        "i",
        "weekly-plan_release"
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
.method public static synthetic a(Lqt2/y;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lqt2/b0;->h(Lqt2/y;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lqt2/y;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lqt2/b0;->f(Lqt2/y;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(JJJLqt2/y;Landroid/graphics/Typeface;JLk2/e;)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p10}, Lqt2/b0;->e(JJJLqt2/y;Landroid/graphics/Typeface;JLk2/e;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final d(Lqt2/y;Landroidx/compose/runtime/Composer;I)V
    .locals 21

    move-object/from16 v7, p0

    move/from16 v11, p2

    const-string v0, "itemState"

    invoke-static {v7, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v12, p1

    check-cast v12, Lp1/q;

    const v0, 0x2f8865ce

    invoke-virtual {v12, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, v11, 0x6

    const/4 v1, 0x2

    if-nez v0, :cond_2

    and-int/lit8 v0, v11, 0x8

    if-nez v0, :cond_0

    invoke-virtual {v12, v7}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v0

    goto :goto_0

    :cond_0
    invoke-virtual {v12, v7}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v0

    :goto_0
    if-eqz v0, :cond_1

    const/4 v0, 0x4

    goto :goto_1

    :cond_1
    move v0, v1

    :goto_1
    or-int/2addr v0, v11

    goto :goto_2

    :cond_2
    move v0, v11

    :goto_2
    and-int/lit8 v3, v0, 0x3

    const/4 v4, 0x0

    if-eq v3, v1, :cond_3

    const/4 v3, 0x1

    goto :goto_3

    :cond_3
    move v3, v4

    :goto_3
    and-int/lit8 v6, v0, 0x1

    invoke-virtual {v12, v6, v3}, Lp1/q;->U(IZ)Z

    move-result v3

    if-eqz v3, :cond_8

    invoke-virtual {v7}, Lqt2/y;->a()Ly81/f;

    move-result-object v3

    invoke-virtual {v3, v12, v4}, Ly81/f;->toComposableColor-WaAFU9c(Landroidx/compose/runtime/Composer;I)J

    move-result-wide v8

    sget-object v3, Lx81/d;->a:Lx81/d;

    sget v6, Lx81/d;->b:I

    invoke-virtual {v3, v12, v6}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v10

    invoke-virtual {v10}, Ly81/i;->Y0()J

    move-result-wide v13

    invoke-virtual {v3, v12, v6}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v10

    invoke-virtual {v10}, Ly81/i;->W0()J

    move-result-wide v4

    invoke-virtual {v3, v12, v6}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v3

    invoke-virtual {v3}, Ly81/i;->b1()J

    move-result-wide v1

    sget-object v3, Landroidx/compose/ui/platform/AndroidCompositionLocals_androidKt;->b:Lp1/u2;

    invoke-virtual {v12, v3}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroid/content/Context;

    sget v6, Lgy0/b;->a:I

    invoke-static {v3, v6}, Lu4/k;->b(Landroid/content/Context;I)Landroid/graphics/Typeface;

    move-result-object v3

    sget-object v6, Lb2/t;->w:Lb2/t;

    const/high16 v10, 0x3f800000    # 1.0f

    invoke-static {v10, v6}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v6

    const/16 v10, 0x15

    int-to-float v10, v10

    move/from16 v16, v0

    const/4 v15, 0x4

    int-to-float v0, v15

    move v15, v10

    mul-float/2addr v0, v15

    invoke-static {v0, v6}, Landroidx/compose/foundation/layout/d;->h(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    const/4 v6, 0x5

    int-to-float v6, v6

    const/16 v15, 0x8

    int-to-float v10, v15

    mul-float/2addr v6, v10

    const/4 v10, 0x0

    move/from16 v18, v15

    const/4 v15, 0x2

    invoke-static {v0, v6, v10, v15}, Landroidx/compose/foundation/layout/a;->r(Landroidx/compose/ui/Modifier;FFI)Landroidx/compose/ui/Modifier;

    move-result-object v15

    invoke-virtual {v12, v4, v5}, Lp1/q;->f(J)Z

    move-result v0

    invoke-virtual {v12, v13, v14}, Lp1/q;->f(J)Z

    move-result v6

    or-int/2addr v0, v6

    invoke-virtual {v12, v8, v9}, Lp1/q;->f(J)Z

    move-result v6

    or-int/2addr v0, v6

    and-int/lit8 v6, v16, 0xe

    const/4 v10, 0x4

    if-eq v6, v10, :cond_5

    and-int/lit8 v6, v16, 0x8

    if-eqz v6, :cond_4

    invoke-virtual {v12, v7}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_4

    goto :goto_4

    :cond_4
    const/16 v17, 0x0

    goto :goto_5

    :cond_5
    :goto_4
    const/16 v17, 0x1

    :goto_5
    or-int v0, v0, v17

    invoke-virtual {v12, v3}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v6

    or-int/2addr v0, v6

    invoke-virtual {v12, v1, v2}, Lp1/q;->f(J)Z

    move-result v6

    or-int/2addr v0, v6

    invoke-virtual {v12}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v6

    if-nez v0, :cond_6

    sget-object v0, Lp1/l;->a:Lp1/v0;

    if-ne v6, v0, :cond_7

    :cond_6
    new-instance v0, Lqt2/z;

    move-wide/from16 v19, v8

    move-wide v9, v1

    move-wide v1, v4

    move-wide/from16 v5, v19

    move-object v8, v3

    move-wide v3, v13

    invoke-direct/range {v0 .. v10}, Lqt2/z;-><init>(JJJLqt2/y;Landroid/graphics/Typeface;J)V

    invoke-virtual {v12, v0}, Lp1/q;->p0(Ljava/lang/Object;)V

    move-object v6, v0

    :cond_7
    check-cast v6, Lkotlin/jvm/functions/Function1;

    const/4 v0, 0x6

    invoke-static {v15, v6, v12, v0}, Lj93/l0;->a(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    goto :goto_6

    :cond_8
    invoke-virtual {v12}, Lp1/q;->X()V

    :goto_6
    invoke-virtual {v12}, Lp1/q;->u()Lp1/v1;

    move-result-object v0

    if-eqz v0, :cond_9

    new-instance v1, Lqt2/a0;

    const/4 v2, 0x0

    invoke-direct {v1, v7, v11, v2}, Lqt2/a0;-><init>(Lqt2/y;II)V

    iput-object v1, v0, Lp1/v1;->d:Lc93/m;

    :cond_9
    return-void
.end method

.method private static final e(JJJLqt2/y;Landroid/graphics/Typeface;JLk2/e;)Ll83/a0;
    .locals 23

    move-object/from16 v0, p10

    const-string v1, "$this$Canvas"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 v1, 0xe

    int-to-float v1, v1

    invoke-interface {v0, v1}, Ly3/c;->q0(F)F

    move-result v13

    const/16 v1, 0x14

    int-to-float v1, v1

    invoke-interface {v0, v1}, Ly3/c;->q0(F)F

    move-result v14

    const/16 v1, 0x30

    int-to-float v1, v1

    invoke-interface {v0, v1}, Ly3/c;->q0(F)F

    move-result v15

    const/16 v1, 0x40

    int-to-float v1, v1

    invoke-interface {v0, v1}, Ly3/c;->q0(F)F

    move-result v16

    const/16 v17, 0x0

    invoke-static/range {v17 .. v17}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v1

    int-to-long v1, v1

    invoke-static/range {v17 .. v17}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v3

    int-to-long v3, v3

    const/16 v18, 0x20

    shl-long v1, v1, v18

    const-wide v19, 0xffffffffL

    and-long v3, v3, v19

    or-long/2addr v1, v3

    invoke-static {v13}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v3

    int-to-long v3, v3

    invoke-static/range {v16 .. v16}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v5

    int-to-long v5, v5

    shl-long v3, v3, v18

    and-long v5, v5, v19

    or-long/2addr v3, v5

    move-wide/from16 v5, p0

    invoke-static/range {v0 .. v6}, Lqt2/b0;->k(Lk2/e;JJJ)V

    invoke-interface/range {p10 .. p10}, Lk2/e;->d()J

    move-result-wide v0

    shr-long v0, v0, v18

    long-to-int v0, v0

    invoke-static {v0}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v0

    sub-float/2addr v0, v13

    invoke-static {v0}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v0

    int-to-long v0, v0

    invoke-static/range {v17 .. v17}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v2

    int-to-long v2, v2

    shl-long v0, v0, v18

    and-long v2, v2, v19

    or-long v1, v0, v2

    invoke-static {v13}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v0

    int-to-long v3, v0

    invoke-static/range {v16 .. v16}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v0

    int-to-long v5, v0

    shl-long v3, v3, v18

    and-long v5, v5, v19

    or-long/2addr v3, v5

    move-wide/from16 v5, p0

    move-object/from16 v0, p10

    invoke-static/range {v0 .. v6}, Lqt2/b0;->k(Lk2/e;JJJ)V

    const/high16 v0, 0x41200000    # 10.0f

    sub-float v1, v13, v0

    sub-float v21, v16, v14

    invoke-static {v1}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v2

    int-to-long v2, v2

    invoke-static/range {v21 .. v21}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v4

    int-to-long v4, v4

    shl-long v2, v2, v18

    and-long v4, v4, v19

    or-long/2addr v2, v4

    invoke-interface/range {p10 .. p10}, Lk2/e;->d()J

    move-result-wide v4

    shr-long v4, v4, v18

    long-to-int v4, v4

    invoke-static {v4}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v4

    sub-float/2addr v4, v13

    add-float/2addr v4, v0

    sub-float v22, v16, v15

    invoke-static {v4}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v4

    int-to-long v4, v4

    invoke-static/range {v22 .. v22}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v6

    int-to-long v6, v6

    shl-long v4, v4, v18

    and-long v6, v6, v19

    or-long/2addr v4, v6

    invoke-interface/range {p10 .. p10}, Lk2/e;->d()J

    move-result-wide v6

    shr-long v6, v6, v18

    long-to-int v6, v6

    invoke-static {v6}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v6

    sub-float/2addr v6, v13

    add-float/2addr v6, v0

    invoke-static {v6}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v0

    int-to-long v6, v0

    invoke-static/range {v16 .. v16}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v0

    int-to-long v8, v0

    shl-long v6, v6, v18

    and-long v8, v8, v19

    or-long/2addr v6, v8

    invoke-static {v1}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v0

    int-to-long v0, v0

    invoke-static/range {v16 .. v16}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v8

    int-to-long v8, v8

    shl-long v0, v0, v18

    and-long v8, v8, v19

    or-long/2addr v0, v8

    move-wide v9, v6

    move-wide v7, v0

    move-wide v1, v2

    move-wide v3, v4

    move-wide v5, v9

    move-wide/from16 v9, p0

    move-wide/from16 v11, p2

    move-object/from16 v0, p10

    invoke-static/range {v0 .. v12}, Lqt2/b0;->j(Lk2/e;JJJJJJ)V

    invoke-static/range {v17 .. v17}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v0

    int-to-long v0, v0

    invoke-static/range {v21 .. v21}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v2

    int-to-long v2, v2

    shl-long v0, v0, v18

    and-long v2, v2, v19

    or-long v1, v0, v2

    invoke-static {v13}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v0

    int-to-long v3, v0

    invoke-static {v14}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v0

    int-to-long v5, v0

    shl-long v3, v3, v18

    and-long v5, v5, v19

    or-long/2addr v3, v5

    move-wide/from16 v5, p4

    move-object/from16 v0, p10

    invoke-static/range {v0 .. v6}, Lqt2/b0;->i(Lk2/e;JJJ)V

    invoke-interface/range {p10 .. p10}, Lk2/e;->d()J

    move-result-wide v0

    shr-long v0, v0, v18

    long-to-int v0, v0

    invoke-static {v0}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v0

    sub-float/2addr v0, v13

    invoke-static {v0}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v0

    int-to-long v0, v0

    invoke-static/range {v22 .. v22}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v2

    int-to-long v2, v2

    shl-long v0, v0, v18

    and-long v2, v2, v19

    or-long v1, v0, v2

    invoke-static {v13}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v0

    int-to-long v3, v0

    invoke-static {v15}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v0

    int-to-long v5, v0

    shl-long v3, v3, v18

    and-long v5, v5, v19

    or-long/2addr v3, v5

    sget v0, Li2/x;->o:I

    sget-wide v5, Li2/x;->f:J

    move-object/from16 v0, p10

    invoke-static/range {v0 .. v6}, Lqt2/b0;->i(Lk2/e;JJJ)V

    const/4 v0, 0x2

    int-to-float v0, v0

    div-float/2addr v13, v0

    const/high16 v1, 0x42480000    # 50.0f

    add-float v16, v16, v1

    invoke-static {v13}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v1

    int-to-long v1, v1

    invoke-static/range {v16 .. v16}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v3

    int-to-long v3, v3

    shl-long v1, v1, v18

    and-long v3, v3, v19

    or-long/2addr v1, v3

    invoke-virtual/range {p6 .. p6}, Lqt2/y;->b()Ljava/lang/String;

    move-result-object v3

    invoke-static/range {p4 .. p5}, Li2/w0;->H(J)I

    move-result v4

    move-object/from16 p4, p7

    move-object/from16 p0, p10

    move-wide/from16 p1, v1

    move-object/from16 p3, v3

    move/from16 p5, v4

    invoke-static/range {p0 .. p5}, Lqt2/b0;->l(Lk2/e;JLjava/lang/String;Landroid/graphics/Typeface;I)V

    invoke-interface/range {p10 .. p10}, Lk2/e;->d()J

    move-result-wide v1

    shr-long v1, v1, v18

    long-to-int v1, v1

    invoke-static {v1}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v1

    div-float/2addr v1, v0

    const/4 v0, 0x4

    int-to-float v0, v0

    add-float/2addr v1, v0

    invoke-static {v1}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v0

    int-to-long v0, v0

    invoke-static/range {v16 .. v16}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v2

    int-to-long v2, v2

    shl-long v0, v0, v18

    and-long v2, v2, v19

    or-long/2addr v0, v2

    invoke-virtual/range {p6 .. p6}, Lqt2/y;->g()Ljava/lang/String;

    move-result-object v2

    invoke-static/range {p8 .. p9}, Li2/w0;->H(J)I

    move-result v3

    move-wide/from16 p1, v0

    move-object/from16 p3, v2

    move/from16 p5, v3

    invoke-static/range {p0 .. p5}, Lqt2/b0;->l(Lk2/e;JLjava/lang/String;Landroid/graphics/Typeface;I)V

    invoke-interface/range {p10 .. p10}, Lk2/e;->d()J

    move-result-wide v0

    shr-long v0, v0, v18

    long-to-int v0, v0

    invoke-static {v0}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v0

    sub-float/2addr v0, v13

    invoke-static {v0}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v0

    int-to-long v0, v0

    invoke-static/range {v16 .. v16}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v2

    int-to-long v2, v2

    shl-long v0, v0, v18

    and-long v2, v2, v19

    or-long/2addr v0, v2

    invoke-virtual/range {p6 .. p6}, Lqt2/y;->e()Ljava/lang/String;

    move-result-object v2

    invoke-static {v5, v6}, Li2/w0;->H(J)I

    move-result v3

    move-wide/from16 p1, v0

    move-object/from16 p3, v2

    move/from16 p5, v3

    invoke-static/range {p0 .. p5}, Lqt2/b0;->l(Lk2/e;JLjava/lang/String;Landroid/graphics/Typeface;I)V

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method

.method private static final f(Lqt2/y;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p1, p1, 0x1

    invoke-static {p1}, Lp1/x;->L(I)I

    move-result p1

    invoke-static {p0, p2, p1}, Lqt2/b0;->d(Lqt2/y;Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static final g(Lqt2/y;Landroidx/compose/runtime/Composer;I)V
    .locals 34

    move-object/from16 v0, p0

    const-string v2, "itemState"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v8, p1

    check-cast v8, Lp1/q;

    const v2, -0x6ac085cd

    invoke-virtual {v8, v2}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v2, p2, 0x6

    const/4 v3, 0x4

    const/4 v4, 0x2

    if-nez v2, :cond_2

    and-int/lit8 v2, p2, 0x8

    if-nez v2, :cond_0

    invoke-virtual {v8, v0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v2

    goto :goto_0

    :cond_0
    invoke-virtual {v8, v0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v2

    :goto_0
    if-eqz v2, :cond_1

    move v2, v3

    goto :goto_1

    :cond_1
    move v2, v4

    :goto_1
    or-int v2, p2, v2

    goto :goto_2

    :cond_2
    move/from16 v2, p2

    :goto_2
    and-int/lit8 v5, v2, 0x3

    if-eq v5, v4, :cond_3

    const/4 v5, 0x1

    goto :goto_3

    :cond_3
    const/4 v5, 0x0

    :goto_3
    and-int/lit8 v6, v2, 0x1

    invoke-virtual {v8, v6, v5}, Lp1/q;->U(IZ)Z

    move-result v5

    if-eqz v5, :cond_e

    sget-object v5, Lb2/e;->N:Lb2/k;

    sget-object v13, Ll0/m;->c:Ll0/g;

    const/16 v6, 0x30

    invoke-static {v13, v5, v8, v6}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v5

    iget-wide v6, v8, Lp1/q;->T:J

    invoke-static {v6, v7}, Ljava/lang/Long;->hashCode(J)I

    move-result v6

    invoke-virtual {v8}, Lp1/q;->m()Lp1/p1;

    move-result-object v7

    sget-object v14, Lb2/t;->w:Lb2/t;

    invoke-static {v8, v14}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v9

    sget-object v10, La3/l;->a:La3/k;

    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v10, La3/k;->b:La3/j;

    invoke-virtual {v8}, Lp1/q;->i0()V

    iget-boolean v15, v8, Lp1/q;->S:Z

    if-eqz v15, :cond_4

    invoke-virtual {v8, v10}, Lp1/q;->l(Lc93/a;)V

    goto :goto_4

    :cond_4
    invoke-virtual {v8}, Lp1/q;->s0()V

    :goto_4
    sget-object v15, La3/k;->g:La3/i;

    invoke-static {v8, v15, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v5, La3/k;->f:La3/i;

    invoke-static {v8, v5, v7}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v7, La3/k;->j:La3/i;

    iget-boolean v12, v8, Lp1/q;->S:Z

    if-nez v12, :cond_5

    invoke-virtual {v8}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v12

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v11

    invoke-static {v12, v11}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v11

    if-nez v11, :cond_6

    :cond_5
    invoke-static {v6, v8, v6, v7}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_6
    sget-object v11, La3/k;->d:La3/i;

    invoke-static {v8, v11, v9}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v12, Lx81/d;->a:Lx81/d;

    invoke-virtual {v12}, Lx81/d;->d()Lgz0/o0;

    move-result-object v6

    invoke-virtual {v6}, Lgz0/o0;->p()Lgz0/k0;

    move-result-object v6

    invoke-virtual {v6}, Lgz0/k0;->e()I

    move-result v6

    const/4 v9, 0x6

    invoke-static {v6, v8, v9}, Lts/o;->S(ILandroidx/compose/runtime/Composer;I)Lo2/e;

    move-result-object v6

    const/16 v23, 0x0

    const v24, 0x7fffe

    move-object v9, v15

    const v15, 0x3fa66666    # 1.3f

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    invoke-static/range {v14 .. v24}, Landroidx/compose/ui/graphics/a;->c(Landroidx/compose/ui/Modifier;FFFFFFLi2/a1;Li2/r;II)Landroidx/compose/ui/Modifier;

    move-result-object v15

    int-to-float v3, v3

    move-object/from16 v16, v9

    mul-float v9, v3, v3

    int-to-float v4, v4

    move/from16 v29, v2

    mul-float v2, v4, v3

    invoke-static {v15, v9, v2}, Landroidx/compose/foundation/layout/d;->m(Landroidx/compose/ui/Modifier;FF)Landroidx/compose/ui/Modifier;

    move-result-object v2

    sget v15, Lx81/d;->b:I

    invoke-virtual {v12, v8, v15}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v17

    invoke-virtual/range {v17 .. v17}, Ly81/i;->a1()J

    move-result-wide v17

    move/from16 v19, v9

    const/16 v9, 0x1b0

    move-object/from16 v20, v10

    const/4 v10, 0x0

    move/from16 v21, v4

    const/4 v4, 0x0

    move/from16 v30, v3

    move-object v0, v5

    move-object v3, v6

    move-object/from16 v1, v16

    move/from16 v31, v19

    move-object v5, v2

    move-object/from16 v16, v13

    move-object/from16 v2, v20

    move-object v13, v7

    move-wide/from16 v6, v17

    invoke-static/range {v3 .. v10}, Lg1/f3;->b(Lo2/e;Ljava/lang/String;Landroidx/compose/ui/Modifier;JLandroidx/compose/runtime/Composer;II)V

    const/4 v3, 0x3

    int-to-float v3, v3

    mul-float v3, v3, v30

    invoke-static {v3}, Lt0/j;->e(F)Lt0/i;

    move-result-object v3

    invoke-static {v14, v3}, Lwb3/f;->r(Landroidx/compose/ui/Modifier;Li2/a1;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    invoke-virtual {v12, v8, v15}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v4

    invoke-virtual {v4}, Ly81/i;->a1()J

    move-result-wide v4

    sget-object v6, Li2/w0;->a:Li2/v0;

    invoke-static {v3, v4, v5, v6}, Landroidx/compose/foundation/a;->c(Landroidx/compose/ui/Modifier;JLi2/a1;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    const/16 v4, 0x8

    int-to-float v4, v4

    mul-float v4, v4, v21

    invoke-static {v4, v3}, Landroidx/compose/foundation/layout/a;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    sget-object v4, Lb2/e;->w:Lb2/m;

    const/4 v5, 0x0

    invoke-static {v4, v5}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v4

    iget-wide v5, v8, Lp1/q;->T:J

    invoke-static {v5, v6}, Ljava/lang/Long;->hashCode(J)I

    move-result v5

    invoke-virtual {v8}, Lp1/q;->m()Lp1/p1;

    move-result-object v6

    invoke-static {v8, v3}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    invoke-virtual {v8}, Lp1/q;->i0()V

    iget-boolean v7, v8, Lp1/q;->S:Z

    if-eqz v7, :cond_7

    invoke-virtual {v8, v2}, Lp1/q;->l(Lc93/a;)V

    goto :goto_5

    :cond_7
    invoke-virtual {v8}, Lp1/q;->s0()V

    :goto_5
    invoke-static {v8, v1, v4}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v8, v0, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v4, v8, Lp1/q;->S:Z

    if-nez v4, :cond_8

    invoke-virtual {v8}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-static {v4, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_9

    :cond_8
    invoke-static {v5, v8, v5, v13}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_9
    invoke-static {v8, v11, v3}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v3, Lb2/e;->M:Lb2/k;

    move-object/from16 v4, v16

    const/4 v5, 0x0

    invoke-static {v4, v3, v8, v5}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v3

    iget-wide v6, v8, Lp1/q;->T:J

    invoke-static {v6, v7}, Ljava/lang/Long;->hashCode(J)I

    move-result v4

    invoke-virtual {v8}, Lp1/q;->m()Lp1/p1;

    move-result-object v6

    invoke-static {v8, v14}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v7

    invoke-virtual {v8}, Lp1/q;->i0()V

    iget-boolean v9, v8, Lp1/q;->S:Z

    if-eqz v9, :cond_a

    invoke-virtual {v8, v2}, Lp1/q;->l(Lc93/a;)V

    goto :goto_6

    :cond_a
    invoke-virtual {v8}, Lp1/q;->s0()V

    :goto_6
    invoke-static {v8, v1, v3}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v8, v0, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v0, v8, Lp1/q;->S:Z

    if-nez v0, :cond_b

    invoke-virtual {v8}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v0

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_c

    :cond_b
    invoke-static {v4, v8, v4, v13}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_c
    invoke-static {v8, v11, v7}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual/range {p0 .. p0}, Lqt2/y;->f()Lcom/whoop/design/util/TextResource;

    move-result-object v0

    sget v1, Lcom/whoop/design/util/TextResource;->$stable:I

    invoke-static {v0, v8, v1}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v12, v8, v15}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v0

    invoke-virtual {v0}, Lb91/d;->a()Lb91/a;

    move-result-object v23

    invoke-virtual {v12, v8, v15}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v0

    invoke-virtual {v0}, Ly81/i;->y()J

    move-result-wide v6

    sget v0, Lb91/a;->d:I

    shl-int/lit8 v27, v0, 0x12

    const v28, 0x2fffa

    const/4 v4, 0x0

    move v0, v5

    move-wide v5, v6

    move-object/from16 v25, v8

    const-wide/16 v7, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    move-object v2, v12

    const-wide/16 v12, 0x0

    move-object/from16 v16, v14

    const/4 v14, 0x0

    move/from16 v17, v15

    const/4 v15, 0x0

    move-object/from16 v19, v16

    move/from16 v18, v17

    const-wide/16 v16, 0x0

    move/from16 v20, v18

    const/16 v18, 0x0

    move-object/from16 v21, v19

    const/16 v19, 0x0

    move/from16 v22, v20

    const/16 v20, 0x0

    move-object/from16 v24, v21

    const/16 v21, 0x0

    move/from16 v26, v22

    const/16 v22, 0x0

    move-object/from16 v32, v24

    const/16 v24, 0x0

    move/from16 v33, v26

    const/16 v26, 0x0

    move-object/from16 v0, v32

    move-object/from16 v32, v2

    move-object v2, v0

    const/4 v0, 0x1

    invoke-static/range {v3 .. v28}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v8, v25

    int-to-float v3, v0

    mul-float v3, v3, v30

    invoke-static {v3, v2}, Landroidx/compose/foundation/layout/d;->h(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    invoke-static {v8, v3}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    invoke-virtual/range {p0 .. p0}, Lqt2/y;->c()Lcom/whoop/design/util/TextResource;

    move-result-object v3

    invoke-static {v3, v8, v1}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v3

    move-object/from16 v4, v32

    move/from16 v5, v33

    invoke-virtual {v4, v8, v5}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v6

    invoke-virtual {v6}, Lb91/d;->b()Lb91/a;

    move-result-object v23

    invoke-virtual {v4, v8, v5}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v4

    invoke-virtual {v4}, Ly81/i;->c1()J

    move-result-wide v5

    const/4 v4, 0x0

    const-wide/16 v7, 0x0

    invoke-static/range {v3 .. v28}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v8, v25

    invoke-virtual/range {p0 .. p0}, Lqt2/y;->h()Z

    move-result v3

    if-nez v3, :cond_d

    const v3, 0x37c8526b

    move/from16 v4, v31

    invoke-static {v8, v3, v2, v4, v8}, Lte0/d;->z(Lp1/q;ILb2/t;FLp1/q;)V

    and-int/lit8 v2, v29, 0xe

    or-int/2addr v1, v2

    move-object/from16 v2, p0

    invoke-static {v2, v8, v1}, Lqt2/b0;->d(Lqt2/y;Landroidx/compose/runtime/Composer;I)V

    const/4 v5, 0x0

    invoke-virtual {v8, v5}, Lp1/q;->q(Z)V

    goto :goto_7

    :cond_d
    const/4 v5, 0x0

    move-object/from16 v2, p0

    const v1, 0x37ca767d

    invoke-virtual {v8, v1}, Lp1/q;->e0(I)V

    invoke-virtual {v8, v5}, Lp1/q;->q(Z)V

    :goto_7
    invoke-static {v8, v0, v0, v0}, Lm4/a;->y(Lp1/q;ZZZ)V

    goto :goto_8

    :cond_e
    move-object v2, v0

    invoke-virtual {v8}, Lp1/q;->X()V

    :goto_8
    invoke-virtual {v8}, Lp1/q;->u()Lp1/v1;

    move-result-object v0

    if-eqz v0, :cond_f

    new-instance v1, Lqt2/a0;

    const/4 v3, 0x1

    move/from16 v4, p2

    invoke-direct {v1, v2, v4, v3}, Lqt2/a0;-><init>(Lqt2/y;II)V

    iput-object v1, v0, Lp1/v1;->d:Lc93/m;

    :cond_f
    return-void
.end method

.method private static final h(Lqt2/y;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p1, p1, 0x1

    invoke-static {p1}, Lp1/x;->L(I)I

    move-result p1

    invoke-static {p0, p2, p1}, Lqt2/b0;->g(Lqt2/y;Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static final i(Lk2/e;JJJ)V
    .locals 12

    const-string v1, "$this$drawProgressBar"

    invoke-static {p0, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-wide/high16 v1, 0x3fe0000000000000L    # 0.5

    double-to-float v1, v1

    const/4 v2, 0x4

    int-to-float v2, v2

    mul-float/2addr v1, v2

    invoke-interface {p0, v1}, Ly3/c;->q0(F)F

    move-result v1

    invoke-static {v1}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v2

    int-to-long v2, v2

    invoke-static {v1}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v1

    int-to-long v4, v1

    const/16 v1, 0x20

    shl-long v1, v2, v1

    const-wide v6, 0xffffffffL

    and-long v3, v4, v6

    or-long v7, v1, v3

    const/4 v10, 0x0

    const/16 v11, 0xf0

    const/4 v9, 0x0

    move-object v0, p0

    move-wide v3, p1

    move-wide v5, p3

    move-wide/from16 v1, p5

    invoke-static/range {v0 .. v11}, Lk2/e;->D(Lk2/e;JJJJLk2/f;FI)V

    return-void
.end method

.method private static final j(Lk2/e;JJJJJJ)V
    .locals 11

    invoke-static {}, Li2/m;->a()Li2/j;

    move-result-object v0

    const/16 v1, 0x20

    shr-long v2, p1, v1

    long-to-int v2, v2

    invoke-static {v2}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v2

    const-wide v3, 0xffffffffL

    and-long/2addr p1, v3

    long-to-int p1, p1

    invoke-static {p1}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result p1

    invoke-virtual {v0, v2, p1}, Li2/j;->i(FF)V

    shr-long p1, p3, v1

    long-to-int p1, p1

    invoke-static {p1}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result p1

    and-long v5, p3, v3

    long-to-int p2, v5

    invoke-static {p2}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result p2

    invoke-virtual {v0, p1, p2}, Li2/j;->h(FF)V

    shr-long p1, p5, v1

    long-to-int p1, p1

    invoke-static {p1}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result p1

    and-long v5, p5, v3

    long-to-int p2, v5

    invoke-static {p2}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result p2

    invoke-virtual {v0, p1, p2}, Li2/j;->h(FF)V

    shr-long p1, p7, v1

    long-to-int p1, p1

    invoke-static {p1}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result p1

    and-long v5, p7, v3

    long-to-int p2, v5

    invoke-static {p2}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result p2

    invoke-virtual {v0, p1, p2}, Li2/j;->h(FF)V

    invoke-virtual {v0}, Li2/j;->f()V

    sget-object p1, Li2/t;->b:Li2/s;

    new-instance p2, Li2/x;

    move-wide/from16 v5, p9

    invoke-direct {p2, v5, v6}, Li2/x;-><init>(J)V

    new-instance v2, Li2/x;

    move-wide/from16 v5, p11

    invoke-direct {v2, v5, v6}, Li2/x;-><init>(J)V

    filled-new-array {p2, v2}, [Li2/x;

    move-result-object p2

    invoke-static {p2}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object p2

    invoke-interface {p0}, Lk2/e;->d()J

    move-result-wide v5

    shr-long/2addr v5, v1

    long-to-int v2, v5

    invoke-static {v2}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v2

    const/4 v5, 0x3

    int-to-float v5, v5

    div-float/2addr v2, v5

    invoke-static {v2}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v2

    int-to-long v5, v2

    const/4 v2, 0x0

    invoke-static {v2}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v7

    int-to-long v7, v7

    shl-long/2addr v5, v1

    and-long/2addr v7, v3

    or-long/2addr v5, v7

    invoke-interface {p0}, Lk2/e;->d()J

    move-result-wide v7

    shr-long/2addr v7, v1

    long-to-int v7, v7

    invoke-static {v7}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v7

    invoke-static {v7}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v7

    int-to-long v7, v7

    invoke-static {v2}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v2

    int-to-long v9, v2

    shl-long v1, v7, v1

    and-long/2addr v3, v9

    or-long/2addr v1, v3

    const/16 v3, 0x8

    move-object p3, p1

    move-object p4, p2

    move-wide/from16 p7, v1

    move/from16 p9, v3

    move-wide/from16 p5, v5

    invoke-static/range {p3 .. p9}, Li2/s;->d(Li2/s;Ljava/util/List;JJI)Li2/k0;

    move-result-object p1

    const/4 p2, 0x0

    const/16 v1, 0x3c

    const/4 v2, 0x0

    move-object p3, p1

    move-object/from16 p5, p2

    move-object p2, v0

    move/from16 p6, v1

    move p4, v2

    move-object p1, p0

    invoke-static/range {p1 .. p6}, Lk2/e;->L(Lk2/e;Li2/s0;Li2/t;FLk2/f;I)V

    return-void
.end method

.method private static final k(Lk2/e;JJJ)V
    .locals 15

    const-wide/high16 v1, 0x3ff8000000000000L    # 1.5

    double-to-float v1, v1

    invoke-interface {p0, v1}, Ly3/c;->q0(F)F

    move-result v1

    add-float v2, v1, v1

    div-float/2addr v1, v2

    sget-object v3, Li2/t;->b:Li2/s;

    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v4

    sget-wide v5, Li2/x;->m:J

    new-instance v7, Li2/x;

    invoke-direct {v7, v5, v6}, Li2/x;-><init>(J)V

    new-instance v5, Ll83/k;

    invoke-direct {v5, v4, v7}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v1

    new-instance v4, Li2/x;

    move-wide/from16 v6, p5

    invoke-direct {v4, v6, v7}, Li2/x;-><init>(J)V

    new-instance v6, Ll83/k;

    invoke-direct {v6, v1, v4}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    filled-new-array {v5, v6}, [Ll83/k;

    move-result-object v7

    const/4 v1, 0x0

    invoke-static {v1}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v4

    int-to-long v4, v4

    invoke-static {v1}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v1

    int-to-long v8, v1

    const/16 v1, 0x20

    shl-long/2addr v4, v1

    const-wide v13, 0xffffffffL

    and-long/2addr v8, v13

    or-long/2addr v8, v4

    neg-float v4, v2

    invoke-static {v2}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v2

    int-to-long v5, v2

    invoke-static {v4}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v2

    int-to-long v10, v2

    shl-long v4, v5, v1

    and-long/2addr v10, v13

    or-long/2addr v10, v4

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 v12, 0x1

    invoke-static/range {v7 .. v12}, Li2/s;->c([Ll83/k;JJI)Li2/k0;

    move-result-object v2

    const-wide/high16 v3, 0x3fe0000000000000L    # 0.5

    double-to-float v3, v3

    const/4 v4, 0x4

    int-to-float v4, v4

    mul-float/2addr v3, v4

    invoke-interface {p0, v3}, Ly3/c;->q0(F)F

    move-result v3

    invoke-static {v3}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v4

    int-to-long v4, v4

    invoke-static {v3}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v3

    int-to-long v6, v3

    shl-long v3, v4, v1

    and-long v5, v6, v13

    or-long v6, v3, v5

    const/4 v9, 0x0

    const/16 v10, 0xf0

    const/4 v8, 0x0

    move-object v0, p0

    move-wide/from16 v4, p3

    move-object v1, v2

    move-wide/from16 v2, p1

    invoke-static/range {v0 .. v10}, Lk2/e;->J0(Lk2/e;Li2/t;JJJFLk2/f;I)V

    return-void
.end method

.method private static final l(Lk2/e;JLjava/lang/String;Landroid/graphics/Typeface;I)V
    .locals 3

    invoke-interface {p0}, Lk2/e;->t0()La3/p;

    move-result-object p0

    invoke-virtual {p0}, La3/p;->w()Li2/v;

    move-result-object p0

    invoke-static {p0}, Li2/d;->a(Li2/v;)Landroid/graphics/Canvas;

    move-result-object p0

    const/16 v0, 0x20

    shr-long v0, p1, v0

    long-to-int v0, v0

    invoke-static {v0}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v0

    const-wide v1, 0xffffffffL

    and-long/2addr p1, v1

    long-to-int p1, p1

    invoke-static {p1}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result p1

    new-instance p2, Landroid/graphics/Paint;

    invoke-direct {p2}, Landroid/graphics/Paint;-><init>()V

    invoke-virtual {p2, p5}, Landroid/graphics/Paint;->setColor(I)V

    const/high16 p5, 0x41e00000    # 28.0f

    invoke-virtual {p2, p5}, Landroid/graphics/Paint;->setTextSize(F)V

    const p5, 0x3dcccccd    # 0.1f

    invoke-virtual {p2, p5}, Landroid/graphics/Paint;->setLetterSpacing(F)V

    sget-object p5, Landroid/graphics/Paint$Align;->CENTER:Landroid/graphics/Paint$Align;

    invoke-virtual {p2, p5}, Landroid/graphics/Paint;->setTextAlign(Landroid/graphics/Paint$Align;)V

    invoke-virtual {p2, p4}, Landroid/graphics/Paint;->setTypeface(Landroid/graphics/Typeface;)Landroid/graphics/Typeface;

    invoke-virtual {p0, p3, v0, p1, p2}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V

    return-void
.end method
