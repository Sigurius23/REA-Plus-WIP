.class public abstract Ldk2/l;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u001a#\u0010\u0005\u001a\u00020\u00042\u0008\u0008\u0002\u0010\u0001\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u0002H\u0007\u00a2\u0006\u0004\u0008\u0005\u0010\u0006\u00a8\u0006\u0007"
    }
    d2 = {
        "Landroidx/compose/ui/Modifier;",
        "modifier",
        "Lh2/c;",
        "plotPadding",
        "Ll83/a0;",
        "c",
        "(Landroidx/compose/ui/Modifier;Lh2/c;Landroidx/compose/runtime/Composer;II)V",
        "tilt-graph_release"
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
.method public static synthetic a(Landroidx/compose/ui/Modifier;Lh2/c;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p5}, Ldk2/l;->e(Landroidx/compose/ui/Modifier;Lh2/c;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lk2/c;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Ldk2/l;->d(Lk2/c;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final c(Landroidx/compose/ui/Modifier;Lh2/c;Landroidx/compose/runtime/Composer;II)V
    .locals 28

    move-object/from16 v0, p2

    check-cast v0, Lp1/q;

    const v1, -0x7981cedb

    invoke-virtual {v0, v1}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v1, p4, 0x1

    if-eqz v1, :cond_0

    or-int/lit8 v2, p3, 0x6

    move v3, v2

    move-object/from16 v2, p0

    goto :goto_1

    :cond_0
    and-int/lit8 v2, p3, 0x6

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
    or-int v3, p3, v3

    goto :goto_1

    :cond_2
    move-object/from16 v2, p0

    move/from16 v3, p3

    :goto_1
    and-int/lit8 v4, p4, 0x2

    if-eqz v4, :cond_4

    or-int/lit8 v3, v3, 0x30

    :cond_3
    move-object/from16 v5, p1

    goto :goto_3

    :cond_4
    and-int/lit8 v5, p3, 0x30

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
    and-int/lit8 v6, v3, 0x13

    const/16 v7, 0x12

    const/4 v8, 0x0

    const/4 v9, 0x1

    if-eq v6, v7, :cond_6

    move v6, v9

    goto :goto_4

    :cond_6
    move v6, v8

    :goto_4
    and-int/2addr v3, v9

    invoke-virtual {v0, v3, v6}, Lp1/q;->U(IZ)Z

    move-result v3

    if-eqz v3, :cond_a

    if-eqz v1, :cond_7

    sget-object v1, Lb2/t;->w:Lb2/t;

    move-object v9, v1

    goto :goto_5

    :cond_7
    move-object v9, v2

    :goto_5
    if-eqz v4, :cond_8

    sget-object v1, Lh2/c;->e:Lh2/c;

    goto :goto_6

    :cond_8
    move-object v1, v5

    :goto_6
    iget v13, v1, Lh2/c;->b:F

    const/16 v15, 0x17

    const/16 v16, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v14, 0x0

    invoke-static/range {v9 .. v16}, Lp91/e;->f(Landroidx/compose/ui/Modifier;FFFFLp91/a;ILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    move-result-object v17

    const/16 v26, 0x1

    const v27, 0x6ffff

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    invoke-static/range {v17 .. v27}, Landroidx/compose/ui/graphics/a;->c(Landroidx/compose/ui/Modifier;FFFFFFLi2/a1;Li2/r;II)Landroidx/compose/ui/Modifier;

    move-result-object v2

    invoke-virtual {v0}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    sget-object v4, Lp1/l;->a:Lp1/v0;

    if-ne v3, v4, :cond_9

    new-instance v3, Ldh0/a;

    const/16 v4, 0x15

    invoke-direct {v3, v4}, Ldh0/a;-><init>(I)V

    invoke-virtual {v0, v3}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_9
    check-cast v3, Lkotlin/jvm/functions/Function1;

    invoke-static {v2, v3}, Landroidx/compose/ui/draw/a;->c(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    sget-object v3, Lx81/d;->a:Lx81/d;

    sget v4, Lx81/d;->b:I

    invoke-virtual {v3, v0, v4}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v3

    invoke-virtual {v3}, Ly81/i;->o()J

    move-result-wide v3

    sget-object v5, Li2/w0;->a:Li2/v0;

    invoke-static {v2, v3, v4, v5}, Landroidx/compose/foundation/a;->c(Landroidx/compose/ui/Modifier;JLi2/a1;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    invoke-static {v2, v0, v8}, Ll0/q;->a(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V

    move-object v13, v1

    move-object v11, v9

    goto :goto_7

    :cond_a
    invoke-virtual {v0}, Lp1/q;->X()V

    move-object v11, v2

    move-object v13, v5

    :goto_7
    invoke-virtual {v0}, Lp1/q;->u()Lp1/v1;

    move-result-object v0

    if-eqz v0, :cond_b

    new-instance v10, Ld62/b;

    const/4 v15, 0x4

    move/from16 v12, p3

    move/from16 v14, p4

    invoke-direct/range {v10 .. v15}, Ld62/b;-><init>(Ljava/lang/Object;ILjava/lang/Object;II)V

    iput-object v10, v0, Lp1/v1;->d:Lc93/m;

    :cond_b
    return-void
.end method

.method private static final d(Lk2/c;)Ll83/a0;
    .locals 20

    move-object/from16 v0, p0

    const-string v1, "$this$drawWithContent"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v11, v0

    check-cast v11, La3/p0;

    invoke-virtual {v11}, La3/p0;->a()V

    sget-object v1, Li2/t;->b:Li2/s;

    const/4 v12, 0x0

    invoke-static {v12}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v2

    sget-wide v3, Li2/x;->m:J

    new-instance v5, Li2/x;

    invoke-direct {v5, v3, v4}, Li2/x;-><init>(J)V

    new-instance v3, Ll83/k;

    invoke-direct {v3, v2, v5}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const v2, 0x3dcccccd    # 0.1f

    invoke-static {v2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v2

    sget-wide v13, Li2/x;->b:J

    new-instance v4, Li2/x;

    invoke-direct {v4, v13, v14}, Li2/x;-><init>(J)V

    new-instance v5, Ll83/k;

    invoke-direct {v5, v2, v4}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    filled-new-array {v3, v5}, [Ll83/k;

    move-result-object v2

    invoke-static {v1, v2}, Li2/s;->b(Li2/s;[Ll83/k;)Li2/k0;

    move-result-object v1

    const/4 v8, 0x6

    const/16 v9, 0x3e

    const-wide/16 v2, 0x0

    const-wide/16 v4, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-static/range {v0 .. v9}, Lk2/e;->u(Lk2/e;Li2/t;JJFLk2/f;II)V

    invoke-static {v12}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v0

    int-to-long v0, v0

    invoke-static {v12}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v2

    int-to-long v2, v2

    const/16 v15, 0x20

    shl-long/2addr v0, v15

    const-wide v16, 0xffffffffL

    and-long v2, v2, v16

    or-long v3, v0, v2

    iget-object v0, v11, La3/p0;->w:Lk2/b;

    invoke-interface {v0}, Lk2/e;->d()J

    move-result-wide v1

    shr-long/2addr v1, v15

    long-to-int v1, v1

    invoke-static {v1}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v1

    invoke-static {v1}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v1

    int-to-long v1, v1

    invoke-static {v12}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v5

    int-to-long v5, v5

    shl-long/2addr v1, v15

    and-long v5, v5, v16

    or-long/2addr v5, v1

    const/4 v1, 0x1

    int-to-float v1, v1

    invoke-virtual {v11, v1}, La3/p0;->q0(F)F

    move-result v7

    const/4 v9, 0x0

    const/16 v10, 0x1f0

    const/4 v8, 0x0

    move-wide/from16 v18, v13

    move v14, v1

    move-wide/from16 v1, v18

    move-object v13, v0

    move-object/from16 v0, p0

    invoke-static/range {v0 .. v10}, Lk2/e;->A0(Lk2/e;JJJFILi2/t0;I)V

    invoke-interface {v13}, Lk2/e;->d()J

    move-result-wide v3

    and-long v3, v3, v16

    long-to-int v0, v3

    invoke-static {v0}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v0

    invoke-static {v12}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v3

    int-to-long v3, v3

    invoke-static {v0}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v0

    int-to-long v5, v0

    shl-long/2addr v3, v15

    and-long v5, v5, v16

    or-long/2addr v3, v5

    invoke-interface {v13}, Lk2/e;->d()J

    move-result-wide v5

    shr-long/2addr v5, v15

    long-to-int v0, v5

    invoke-static {v0}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v0

    invoke-interface {v13}, Lk2/e;->d()J

    move-result-wide v5

    and-long v5, v5, v16

    long-to-int v5, v5

    invoke-static {v5}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v5

    invoke-static {v0}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v0

    int-to-long v6, v0

    invoke-static {v5}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v0

    int-to-long v8, v0

    shl-long v5, v6, v15

    and-long v7, v8, v16

    or-long/2addr v5, v7

    invoke-virtual {v11, v14}, La3/p0;->q0(F)F

    move-result v7

    const/4 v9, 0x0

    const/4 v8, 0x0

    move-object/from16 v0, p0

    invoke-static/range {v0 .. v10}, Lk2/e;->A0(Lk2/e;JJJFILi2/t0;I)V

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method

.method private static final e(Landroidx/compose/ui/Modifier;Lh2/c;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, Lp1/x;->L(I)I

    move-result p2

    invoke-static {p0, p1, p4, p2, p3}, Ldk2/l;->c(Landroidx/compose/ui/Modifier;Lh2/c;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method
