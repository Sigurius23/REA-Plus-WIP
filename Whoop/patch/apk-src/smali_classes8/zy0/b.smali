.class public abstract Lzy0/b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0007\u00a2\u0006\u0004\u0008\u0003\u0010\u0004\u00a8\u0006\u0005"
    }
    d2 = {
        "Lzy0/e;",
        "type",
        "Ll83/a0;",
        "c",
        "(Lzy0/e;Landroidx/compose/runtime/Composer;I)V",
        "design_release"
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
.method public static synthetic a(Lzy0/e;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lzy0/b;->e(Lzy0/e;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(FFFJLzy0/e;JLk2/e;)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p8}, Lzy0/b;->d(FFFJLzy0/e;JLk2/e;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final c(Lzy0/e;Landroidx/compose/runtime/Composer;I)V
    .locals 17

    move-object/from16 v6, p0

    move/from16 v9, p2

    const-string v0, "type"

    invoke-static {v6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v10, p1

    check-cast v10, Lp1/q;

    const v0, -0x4d069beb

    invoke-virtual {v10, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, v9, 0x6

    const/4 v1, 0x2

    const/4 v2, 0x4

    if-nez v0, :cond_1

    invoke-virtual {v6}, Ljava/lang/Enum;->ordinal()I

    move-result v0

    invoke-virtual {v10, v0}, Lp1/q;->e(I)Z

    move-result v0

    if-eqz v0, :cond_0

    move v0, v2

    goto :goto_0

    :cond_0
    move v0, v1

    :goto_0
    or-int/2addr v0, v9

    goto :goto_1

    :cond_1
    move v0, v9

    :goto_1
    and-int/lit8 v3, v0, 0x3

    if-eq v3, v1, :cond_2

    const/4 v3, 0x1

    goto :goto_2

    :cond_2
    const/4 v3, 0x0

    :goto_2
    and-int/lit8 v7, v0, 0x1

    invoke-virtual {v10, v7, v3}, Lp1/q;->U(IZ)Z

    move-result v3

    if-eqz v3, :cond_6

    sget-object v3, Lx81/d;->a:Lx81/d;

    const/4 v11, 0x6

    invoke-virtual {v3, v10, v11}, Lx81/d;->a(Landroidx/compose/runtime/Composer;I)Lz81/b;

    move-result-object v7

    invoke-virtual {v7}, Lz81/b;->b()Lf0/t;

    move-result-object v7

    iget v7, v7, Lf0/t;->a:F

    sget-object v8, Lb3/v1;->h:Lp1/u2;

    invoke-virtual {v10, v8}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Ly3/c;

    int-to-float v13, v2

    invoke-interface {v12, v13}, Ly3/c;->q0(F)F

    move-result v12

    invoke-virtual {v10, v8}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ly3/c;

    int-to-float v1, v1

    invoke-interface {v8, v1}, Ly3/c;->q0(F)F

    move-result v1

    invoke-virtual {v3, v10, v11}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v8

    invoke-virtual {v8}, Ly81/i;->c1()J

    move-result-wide v13

    invoke-virtual {v3, v10, v11}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v3

    invoke-virtual {v3}, Ly81/i;->W0()J

    move-result-wide v4

    sget-object v3, Lb2/t;->w:Lb2/t;

    const/high16 v15, 0x3f800000    # 1.0f

    invoke-static {v15, v3}, Landroidx/compose/foundation/layout/d;->d(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v15

    invoke-virtual {v10, v7}, Lp1/q;->d(F)Z

    move-result v3

    invoke-virtual {v10, v12}, Lp1/q;->d(F)Z

    move-result v16

    or-int v3, v3, v16

    invoke-virtual {v10, v1}, Lp1/q;->d(F)Z

    move-result v16

    or-int v3, v3, v16

    invoke-virtual {v10, v13, v14}, Lp1/q;->f(J)Z

    move-result v16

    or-int v3, v3, v16

    and-int/lit8 v0, v0, 0xe

    if-ne v0, v2, :cond_3

    const/4 v8, 0x1

    goto :goto_3

    :cond_3
    const/4 v8, 0x0

    :goto_3
    or-int v0, v3, v8

    invoke-virtual {v10, v4, v5}, Lp1/q;->f(J)Z

    move-result v2

    or-int/2addr v0, v2

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    if-nez v0, :cond_4

    sget-object v0, Lp1/l;->a:Lp1/v0;

    if-ne v2, v0, :cond_5

    :cond_4
    new-instance v0, Lzy0/a;

    move v3, v1

    move v1, v7

    move v2, v12

    move-wide v7, v4

    move-wide v4, v13

    invoke-direct/range {v0 .. v8}, Lzy0/a;-><init>(FFFJLzy0/e;J)V

    invoke-virtual {v10, v0}, Lp1/q;->p0(Ljava/lang/Object;)V

    move-object v2, v0

    :cond_5
    check-cast v2, Lkotlin/jvm/functions/Function1;

    invoke-static {v15, v2, v10, v11}, Lj93/l0;->a(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    goto :goto_4

    :cond_6
    invoke-virtual {v10}, Lp1/q;->X()V

    :goto_4
    invoke-virtual {v10}, Lp1/q;->u()Lp1/v1;

    move-result-object v0

    if-eqz v0, :cond_7

    new-instance v1, Lwr0/y;

    const/16 v2, 0xb

    invoke-direct {v1, v6, v9, v2}, Lwr0/y;-><init>(Ljava/lang/Object;II)V

    iput-object v1, v0, Lp1/v1;->d:Lc93/m;

    :cond_7
    return-void
.end method

.method private static final d(FFFJLzy0/e;JLk2/e;)Ll83/a0;
    .locals 18

    const-string v0, "$this$Canvas"

    move-object/from16 v1, p8

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static/range {p0 .. p0}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v0

    int-to-long v2, v0

    const/4 v0, 0x0

    invoke-static {v0}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v4

    int-to-long v4, v4

    const/16 v12, 0x20

    shl-long/2addr v2, v12

    const-wide v13, 0xffffffffL

    and-long/2addr v4, v13

    or-long/2addr v4, v2

    invoke-interface {v1}, Lk2/e;->d()J

    move-result-wide v2

    and-long/2addr v2, v13

    long-to-int v2, v2

    invoke-static {v2}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v2

    invoke-static/range {p0 .. p0}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v3

    int-to-long v6, v3

    invoke-static {v2}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v2

    int-to-long v2, v2

    shl-long/2addr v6, v12

    and-long/2addr v2, v13

    or-long/2addr v6, v2

    const/4 v15, 0x2

    new-array v2, v15, [F

    const/16 v16, 0x0

    aput p1, v2, v16

    const/16 v17, 0x1

    aput p2, v2, v17

    new-instance v10, Li2/k;

    new-instance v3, Landroid/graphics/DashPathEffect;

    invoke-direct {v3, v2, v0}, Landroid/graphics/DashPathEffect;-><init>([FF)V

    invoke-direct {v10, v3}, Li2/k;-><init>(Landroid/graphics/PathEffect;)V

    const/4 v9, 0x0

    const/16 v11, 0x1d0

    move/from16 v8, p0

    move-wide/from16 v2, p3

    invoke-static/range {v1 .. v11}, Lk2/e;->A0(Lk2/e;JJJFILi2/t0;I)V

    sget-object v1, Lzy0/e;->RANGE:Lzy0/e;

    move-object/from16 v2, p5

    if-ne v2, v1, :cond_0

    invoke-interface/range {p8 .. p8}, Lk2/e;->d()J

    move-result-wide v1

    shr-long/2addr v1, v12

    long-to-int v1, v1

    invoke-static {v1}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v1

    invoke-interface/range {p8 .. p8}, Lk2/e;->d()J

    move-result-wide v2

    and-long/2addr v2, v13

    long-to-int v2, v2

    invoke-static {v2}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v2

    invoke-static {v1}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v1

    int-to-long v3, v1

    invoke-static {v2}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v1

    int-to-long v1, v1

    shl-long/2addr v3, v12

    and-long/2addr v1, v13

    or-long v6, v3, v1

    const/4 v10, 0x0

    const/16 v11, 0x78

    const-wide/16 v4, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    move-wide/from16 v2, p6

    move-object/from16 v1, p8

    invoke-static/range {v1 .. v11}, Lk2/e;->i0(Lk2/e;JJJFLi2/y;II)V

    invoke-interface/range {p8 .. p8}, Lk2/e;->d()J

    move-result-wide v1

    shr-long/2addr v1, v12

    long-to-int v1, v1

    invoke-static {v1}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v1

    sub-float v1, v1, p0

    invoke-static {v1}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v1

    int-to-long v1, v1

    invoke-static {v0}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v3

    int-to-long v3, v3

    shl-long/2addr v1, v12

    and-long/2addr v3, v13

    or-long v4, v1, v3

    invoke-interface/range {p8 .. p8}, Lk2/e;->d()J

    move-result-wide v1

    shr-long/2addr v1, v12

    long-to-int v1, v1

    invoke-static {v1}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v1

    sub-float v1, v1, p0

    invoke-interface/range {p8 .. p8}, Lk2/e;->d()J

    move-result-wide v2

    and-long/2addr v2, v13

    long-to-int v2, v2

    invoke-static {v2}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v2

    invoke-static {v1}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v1

    int-to-long v6, v1

    invoke-static {v2}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v1

    int-to-long v1, v1

    shl-long/2addr v6, v12

    and-long/2addr v1, v13

    or-long/2addr v6, v1

    new-array v1, v15, [F

    aput p1, v1, v16

    aput p2, v1, v17

    new-instance v10, Li2/k;

    new-instance v2, Landroid/graphics/DashPathEffect;

    invoke-direct {v2, v1, v0}, Landroid/graphics/DashPathEffect;-><init>([FF)V

    invoke-direct {v10, v2}, Li2/k;-><init>(Landroid/graphics/PathEffect;)V

    const/4 v9, 0x0

    const/16 v11, 0x1d0

    move/from16 v8, p0

    move-wide/from16 v2, p3

    move-object/from16 v1, p8

    invoke-static/range {v1 .. v11}, Lk2/e;->A0(Lk2/e;JJJFILi2/t0;I)V

    :cond_0
    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method

.method private static final e(Lzy0/e;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p1, p1, 0x1

    invoke-static {p1}, Lp1/x;->L(I)I

    move-result p1

    invoke-static {p0, p2, p1}, Lzy0/b;->c(Lzy0/e;Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method
