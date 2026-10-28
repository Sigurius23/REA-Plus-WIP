.class public abstract Lzy0/f;
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
        "Li2/a1;",
        "shape",
        "Ll83/a0;",
        "c",
        "(Landroidx/compose/ui/Modifier;Li2/a1;Landroidx/compose/runtime/Composer;II)V",
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
.method public static synthetic a(JLk2/e;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, Lzy0/f;->d(JLk2/e;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Landroidx/compose/ui/Modifier;Li2/a1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p5}, Lzy0/f;->e(Landroidx/compose/ui/Modifier;Li2/a1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final c(Landroidx/compose/ui/Modifier;Li2/a1;Landroidx/compose/runtime/Composer;II)V
    .locals 16

    move-object/from16 v0, p2

    check-cast v0, Lp1/q;

    const v1, -0x5ab42f63

    invoke-virtual {v0, v1}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v1, p4, 0x1

    const/4 v2, 0x4

    if-eqz v1, :cond_0

    or-int/lit8 v3, p3, 0x6

    move v4, v3

    move-object/from16 v3, p0

    goto :goto_1

    :cond_0
    and-int/lit8 v3, p3, 0x6

    if-nez v3, :cond_2

    move-object/from16 v3, p0

    invoke-virtual {v0, v3}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_1

    move v4, v2

    goto :goto_0

    :cond_1
    const/4 v4, 0x2

    :goto_0
    or-int v4, p3, v4

    goto :goto_1

    :cond_2
    move-object/from16 v3, p0

    move/from16 v4, p3

    :goto_1
    and-int/lit8 v5, p4, 0x2

    if-eqz v5, :cond_4

    or-int/lit8 v4, v4, 0x30

    :cond_3
    move-object/from16 v6, p1

    goto :goto_3

    :cond_4
    and-int/lit8 v6, p3, 0x30

    if-nez v6, :cond_3

    move-object/from16 v6, p1

    invoke-virtual {v0, v6}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_5

    const/16 v7, 0x20

    goto :goto_2

    :cond_5
    const/16 v7, 0x10

    :goto_2
    or-int/2addr v4, v7

    :goto_3
    and-int/lit8 v7, v4, 0x13

    const/16 v8, 0x12

    const/4 v9, 0x0

    const/4 v10, 0x1

    if-eq v7, v8, :cond_6

    move v7, v10

    goto :goto_4

    :cond_6
    move v7, v9

    :goto_4
    and-int/2addr v4, v10

    invoke-virtual {v0, v4, v7}, Lp1/q;->U(IZ)Z

    move-result v4

    if-eqz v4, :cond_b

    sget-object v4, Lb2/t;->w:Lb2/t;

    if-eqz v1, :cond_7

    int-to-float v1, v2

    mul-float/2addr v1, v1

    invoke-static {v1, v4}, Landroidx/compose/foundation/layout/d;->h(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    goto :goto_5

    :cond_7
    move-object v1, v3

    :goto_5
    if-eqz v5, :cond_8

    sget-object v2, Li2/w0;->a:Li2/v0;

    goto :goto_6

    :cond_8
    move-object v2, v6

    :goto_6
    sget-object v3, Lx81/d;->a:Lx81/d;

    const/4 v5, 0x6

    invoke-virtual {v3, v0, v5}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v3

    invoke-virtual {v3}, Ly81/i;->W0()J

    move-result-wide v5

    const/high16 v3, 0x3f800000    # 1.0f

    invoke-static {v3, v4}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    invoke-static {v3, v2}, Lwb3/f;->r(Landroidx/compose/ui/Modifier;Li2/a1;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    invoke-interface {v3, v1}, Landroidx/compose/ui/Modifier;->e(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    invoke-virtual {v0, v5, v6}, Lp1/q;->f(J)Z

    move-result v4

    invoke-virtual {v0}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v7

    if-nez v4, :cond_9

    sget-object v4, Lp1/l;->a:Lp1/v0;

    if-ne v7, v4, :cond_a

    :cond_9
    new-instance v7, Lsz0/p1;

    const/16 v4, 0xc

    invoke-direct {v7, v5, v6, v4}, Lsz0/p1;-><init>(JI)V

    invoke-virtual {v0, v7}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_a
    check-cast v7, Lkotlin/jvm/functions/Function1;

    invoke-static {v3, v7, v0, v9}, Lj93/l0;->a(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    move-object v11, v1

    move-object v13, v2

    goto :goto_7

    :cond_b
    invoke-virtual {v0}, Lp1/q;->X()V

    move-object v11, v3

    move-object v13, v6

    :goto_7
    invoke-virtual {v0}, Lp1/q;->u()Lp1/v1;

    move-result-object v0

    if-eqz v0, :cond_c

    new-instance v10, Lzi1/c0;

    const/16 v15, 0xa

    move/from16 v12, p3

    move/from16 v14, p4

    invoke-direct/range {v10 .. v15}, Lzi1/c0;-><init>(Ljava/lang/Object;ILjava/lang/Object;II)V

    iput-object v10, v0, Lp1/v1;->d:Lc93/m;

    :cond_c
    return-void
.end method

.method private static final d(JLk2/e;)Ll83/a0;
    .locals 25

    move-object/from16 v0, p2

    const-string v1, "$this$Canvas"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v1, 0x6

    int-to-float v1, v1

    invoke-interface {v0, v1}, Ly3/c;->q0(F)F

    move-result v1

    invoke-interface {v0}, Lk2/e;->d()J

    move-result-wide v2

    const/16 v11, 0x20

    shr-long/2addr v2, v11

    long-to-int v2, v2

    invoke-static {v2}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v2

    div-float/2addr v2, v1

    invoke-static {v2}, Le93/b;->X(F)I

    move-result v1

    invoke-interface {v0}, Lk2/e;->d()J

    move-result-wide v2

    shr-long/2addr v2, v11

    long-to-int v2, v2

    invoke-static {v2}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v2

    int-to-float v3, v1

    div-float v12, v2, v3

    const/4 v2, 0x3

    int-to-float v2, v2

    div-float v2, v12, v2

    invoke-interface {v0}, Lk2/e;->d()J

    move-result-wide v3

    const-wide v13, 0xffffffffL

    and-long/2addr v3, v13

    long-to-int v3, v3

    invoke-static {v3}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v3

    const/4 v4, 0x2

    int-to-float v15, v4

    mul-float/2addr v3, v15

    invoke-static {v2}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v2

    int-to-long v4, v2

    invoke-static {v3}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v2

    int-to-long v2, v2

    shl-long/2addr v4, v11

    and-long/2addr v2, v13

    or-long/2addr v2, v4

    add-int/lit8 v1, v1, 0x1

    const/4 v4, -0x1

    if-gt v4, v1, :cond_0

    :goto_0
    int-to-float v5, v4

    mul-float/2addr v5, v12

    invoke-interface {v0}, Lk2/e;->d()J

    move-result-wide v6

    and-long/2addr v6, v13

    long-to-int v6, v6

    invoke-static {v6}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v6

    and-long v7, v2, v13

    long-to-int v7, v7

    invoke-static {v7}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v7

    sub-float/2addr v6, v7

    div-float/2addr v6, v15

    invoke-static {v5}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v5

    int-to-long v7, v5

    invoke-static {v6}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v5

    int-to-long v5, v5

    shl-long/2addr v7, v11

    and-long/2addr v5, v13

    or-long/2addr v5, v7

    invoke-static {v5, v6, v2, v3}, Lhg3/i;->j(JJ)Lh2/c;

    move-result-object v5

    invoke-virtual {v5}, Lh2/c;->d()J

    move-result-wide v6

    invoke-interface {v0}, Lk2/e;->t0()La3/p;

    move-result-object v8

    invoke-virtual {v8}, La3/p;->A()J

    move-result-wide v9

    invoke-virtual {v8}, La3/p;->w()Li2/v;

    move-result-object v16

    invoke-interface/range {v16 .. v16}, Li2/v;->q()V

    :try_start_0
    iget-object v11, v8, La3/p;->x:Ljava/lang/Object;

    check-cast v11, Laj/d;

    const/high16 v13, 0x42340000    # 45.0f

    invoke-virtual {v11, v13, v6, v7}, Laj/d;->v(FJ)V

    move-wide v6, v2

    move v2, v4

    invoke-virtual {v5}, Lh2/c;->f()J

    move-result-wide v3

    invoke-virtual {v5}, Lh2/c;->e()J

    move-result-wide v13
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    move-wide v10, v9

    const/4 v9, 0x0

    move-wide/from16 v17, v10

    const/16 v10, 0x78

    move-wide v5, v6

    const/4 v7, 0x0

    move-object v11, v8

    const/4 v8, 0x0

    move/from16 v20, v15

    move-object/from16 v21, v11

    move v11, v1

    move/from16 v22, v12

    move v12, v2

    move-wide/from16 v1, p0

    move-wide/from16 v23, v13

    move-object/from16 v13, v21

    move-wide/from16 v14, v17

    move-wide/from16 v18, v5

    move/from16 v17, v22

    move-wide/from16 v5, v23

    :try_start_1
    invoke-static/range {v0 .. v10}, Lk2/e;->i0(Lk2/e;JJJFLi2/y;II)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    invoke-static {v13, v14, v15}, Ld;->z(La3/p;J)V

    if-eq v12, v11, :cond_0

    add-int/lit8 v4, v12, 0x1

    move-object/from16 v0, p2

    move v1, v11

    move/from16 v12, v17

    move-wide/from16 v2, v18

    move/from16 v15, v20

    const/16 v11, 0x20

    const-wide v13, 0xffffffffL

    goto/16 :goto_0

    :catchall_0
    move-exception v0

    goto :goto_1

    :catchall_1
    move-exception v0

    move-object v13, v8

    move-wide v14, v9

    :goto_1
    invoke-static {v13, v14, v15}, Ld;->z(La3/p;J)V

    throw v0

    :cond_0
    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method

.method private static final e(Landroidx/compose/ui/Modifier;Li2/a1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, Lp1/x;->L(I)I

    move-result p2

    invoke-static {p0, p1, p4, p2, p3}, Lzy0/f;->c(Landroidx/compose/ui/Modifier;Li2/a1;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method
