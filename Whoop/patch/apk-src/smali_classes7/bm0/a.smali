.class public abstract Lbm0/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u001a\u0019\u0010\u0003\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0001\u001a\u00020\u0000H\u0001\u00a2\u0006\u0004\u0008\u0003\u0010\u0004\u00a8\u0006\u0005"
    }
    d2 = {
        "Landroidx/compose/ui/Modifier;",
        "modifier",
        "Ll83/a0;",
        "c",
        "(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V",
        "bot_release"
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
.method public static synthetic a(JJLk2/e;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Lbm0/a;->d(JJLk2/e;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Landroidx/compose/ui/Modifier;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Lbm0/a;->e(Landroidx/compose/ui/Modifier;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final c(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V
    .locals 12

    check-cast p1, Lp1/q;

    const v0, -0xa1fcdb9

    invoke-virtual {p1, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, p3, 0x1

    const/4 v1, 0x2

    const/4 v2, 0x4

    if-eqz v0, :cond_0

    or-int/lit8 v3, p2, 0x6

    goto :goto_1

    :cond_0
    and-int/lit8 v3, p2, 0x6

    if-nez v3, :cond_2

    invoke-virtual {p1, p0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_1

    move v3, v2

    goto :goto_0

    :cond_1
    move v3, v1

    :goto_0
    or-int/2addr v3, p2

    goto :goto_1

    :cond_2
    move v3, p2

    :goto_1
    and-int/lit8 v4, v3, 0x3

    const/4 v5, 0x0

    const/4 v6, 0x1

    if-eq v4, v1, :cond_3

    move v1, v6

    goto :goto_2

    :cond_3
    move v1, v5

    :goto_2
    and-int/2addr v3, v6

    invoke-virtual {p1, v3, v1}, Lp1/q;->U(IZ)Z

    move-result v1

    if-eqz v1, :cond_7

    if-eqz v0, :cond_4

    sget-object p0, Lb2/t;->w:Lb2/t;

    :cond_4
    sget-object v0, Lx81/d;->a:Lx81/d;

    sget v1, Lx81/d;->b:I

    invoke-virtual {v0, p1, v1}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v3

    invoke-virtual {v3}, Ly81/i;->w()J

    move-result-wide v9

    invoke-virtual {v0, p1, v1}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v0

    invoke-virtual {v0}, Ly81/i;->y()J

    move-result-wide v7

    int-to-float v0, v2

    mul-float v1, v0, v0

    invoke-static {v1, p0}, Landroidx/compose/foundation/layout/d;->u(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    const-wide/high16 v2, 0x4004000000000000L    # 2.5

    double-to-float v2, v2

    mul-float/2addr v2, v0

    invoke-static {v2, v1}, Landroidx/compose/foundation/layout/d;->h(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    invoke-virtual {p1, v7, v8}, Lp1/q;->f(J)Z

    move-result v1

    invoke-virtual {p1, v9, v10}, Lp1/q;->f(J)Z

    move-result v2

    or-int/2addr v1, v2

    invoke-virtual {p1}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    if-nez v1, :cond_5

    sget-object v1, Lp1/l;->a:Lp1/v0;

    if-ne v2, v1, :cond_6

    :cond_5
    new-instance v6, Lbb2/a;

    const/4 v11, 0x1

    invoke-direct/range {v6 .. v11}, Lbb2/a;-><init>(JJI)V

    invoke-virtual {p1, v6}, Lp1/q;->p0(Ljava/lang/Object;)V

    move-object v2, v6

    :cond_6
    check-cast v2, Lkotlin/jvm/functions/Function1;

    invoke-static {v0, v2, p1, v5}, Lj93/l0;->a(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    goto :goto_3

    :cond_7
    invoke-virtual {p1}, Lp1/q;->X()V

    :goto_3
    invoke-virtual {p1}, Lp1/q;->u()Lp1/v1;

    move-result-object p1

    if-eqz p1, :cond_8

    new-instance v0, Lb70/a;

    const/4 v1, 0x1

    invoke-direct {v0, p2, p3, v1, p0}, Lb70/a;-><init>(IIILandroidx/compose/ui/Modifier;)V

    iput-object v0, p1, Lp1/v1;->d:Lc93/m;

    :cond_8
    return-void
.end method

.method private static final d(JJLk2/e;)Ll83/a0;
    .locals 18

    move-object/from16 v0, p4

    const-string v1, "$this$Canvas"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {v0}, Lk2/e;->B0()J

    move-result-wide v1

    invoke-interface {v0}, Lk2/e;->t0()La3/p;

    move-result-object v7

    invoke-virtual {v7}, La3/p;->A()J

    move-result-wide v8

    invoke-virtual {v7}, La3/p;->w()Li2/v;

    move-result-object v3

    invoke-interface {v3}, Li2/v;->q()V

    :try_start_0
    iget-object v3, v7, La3/p;->x:Ljava/lang/Object;

    check-cast v3, Laj/d;

    const/high16 v4, 0x43340000    # 180.0f

    invoke-virtual {v3, v4, v1, v2}, Laj/d;->v(FJ)V

    invoke-interface {v0}, Lk2/e;->d()J

    move-result-wide v1

    const/16 v3, 0x20

    shr-long/2addr v1, v3

    long-to-int v1, v1

    invoke-static {v1}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v1

    const/4 v2, 0x2

    int-to-float v10, v2

    div-float/2addr v1, v10

    invoke-static {v1}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v1

    int-to-long v1, v1

    const/4 v4, 0x0

    invoke-static {v4}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v5

    int-to-long v5, v5

    shl-long/2addr v1, v3

    const-wide v11, 0xffffffffL

    and-long/2addr v5, v11

    or-long/2addr v1, v5

    invoke-interface {v0}, Lk2/e;->d()J

    move-result-wide v5

    and-long/2addr v5, v11

    long-to-int v5, v5

    invoke-static {v5}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v5

    invoke-static {v4}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v4

    int-to-long v13, v4

    invoke-static {v5}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v4

    int-to-long v4, v4

    shl-long/2addr v13, v3

    and-long/2addr v4, v11

    or-long/2addr v4, v13

    invoke-interface {v0}, Lk2/e;->d()J

    move-result-wide v13

    shr-long/2addr v13, v3

    long-to-int v6, v13

    invoke-static {v6}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v6

    invoke-interface {v0}, Lk2/e;->d()J

    move-result-wide v13

    and-long/2addr v13, v11

    long-to-int v13, v13

    invoke-static {v13}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v13

    invoke-static {v6}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v6

    int-to-long v14, v6

    invoke-static {v13}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v6

    move v13, v3

    move-wide/from16 v16, v4

    int-to-long v3, v6

    shl-long v5, v14, v13

    and-long/2addr v3, v11

    or-long/2addr v3, v5

    move-wide v5, v1

    invoke-static {}, Li2/m;->a()Li2/j;

    move-result-object v1

    shr-long v14, v5, v13

    long-to-int v2, v14

    invoke-static {v2}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v14

    and-long/2addr v5, v11

    long-to-int v5, v5

    invoke-static {v5}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v6

    invoke-virtual {v1, v14, v6}, Li2/j;->i(FF)V

    shr-long v14, v16, v13

    long-to-int v6, v14

    invoke-static {v6}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v6

    and-long v14, v16, v11

    long-to-int v14, v14

    invoke-static {v14}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v14

    invoke-virtual {v1, v6, v14}, Li2/j;->h(FF)V

    shr-long v13, v3, v13

    long-to-int v6, v13

    invoke-static {v6}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v6

    and-long/2addr v3, v11

    long-to-int v3, v3

    invoke-static {v3}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v3

    invoke-virtual {v1, v6, v3}, Li2/j;->h(FF)V

    invoke-static {v2}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v2

    invoke-static {v5}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v3

    invoke-virtual {v1, v2, v3}, Li2/j;->h(FF)V

    invoke-virtual {v1}, Li2/j;->f()V

    sget-object v5, Lk2/h;->a:Lk2/h;

    const/16 v6, 0x34

    const/4 v4, 0x0

    move-wide/from16 v2, p0

    invoke-static/range {v0 .. v6}, Lk2/e;->z(Lk2/e;Li2/s0;JFLk2/f;I)V

    invoke-interface {v0, v10}, Ly3/c;->q0(F)F

    move-result v12

    invoke-interface {v0, v10}, Ly3/c;->q0(F)F

    move-result v2

    new-instance v3, Li2/k;

    new-instance v4, Landroid/graphics/CornerPathEffect;

    invoke-direct {v4, v2}, Landroid/graphics/CornerPathEffect;-><init>(F)V

    invoke-direct {v3, v4}, Li2/k;-><init>(Landroid/graphics/PathEffect;)V

    new-instance v11, Lk2/i;

    const/4 v13, 0x0

    const/16 v17, 0x2

    const/4 v15, 0x1

    const/4 v14, 0x1

    move-object/from16 v16, v3

    invoke-direct/range {v11 .. v17}, Lk2/i;-><init>(FFIILi2/t0;I)V

    const/16 v6, 0x34

    const/4 v4, 0x0

    move-wide/from16 v2, p2

    move-object v5, v11

    invoke-static/range {v0 .. v6}, Lk2/e;->z(Lk2/e;Li2/s0;JFLk2/f;I)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-static {v7, v8, v9}, Ld;->z(La3/p;J)V

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0

    :catchall_0
    move-exception v0

    invoke-static {v7, v8, v9}, Ld;->z(La3/p;J)V

    throw v0
.end method

.method private static final e(Landroidx/compose/ui/Modifier;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p1, p1, 0x1

    invoke-static {p1}, Lp1/x;->L(I)I

    move-result p1

    invoke-static {p0, p3, p1, p2}, Lbm0/a;->c(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method
