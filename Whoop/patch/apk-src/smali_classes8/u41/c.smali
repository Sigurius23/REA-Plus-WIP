.class public abstract Lu41/c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000<\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u001a!\u0010\u0005\u001a\u00020\u00042\u0008\u0008\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0001\u00a2\u0006\u0004\u0008\u0005\u0010\u0006\u001a\u001f\u0010\n\u001a\u0008\u0012\u0004\u0012\u00020\t0\u0007*\u0008\u0012\u0004\u0012\u00020\u00080\u0007H\u0002\u00a2\u0006\u0004\u0008\n\u0010\u000b\u001a\u001f\u0010\u000f\u001a\u00020\t2\u0006\u0010\u000c\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\rH\u0002\u00a2\u0006\u0004\u0008\u000f\u0010\u0010\u001a\u001f\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u0011H\u0002\u00a2\u0006\u0004\u0008\u0015\u0010\u0016\u001a\u0019\u0010\u0017\u001a\u00020\u00042\u0008\u0008\u0002\u0010\u0001\u001a\u00020\u0000H\u0003\u00a2\u0006\u0004\u0008\u0017\u0010\u0018\u00a8\u0006\u0019"
    }
    d2 = {
        "Landroidx/compose/ui/Modifier;",
        "modifier",
        "Lu41/b;",
        "state",
        "Ll83/a0;",
        "g",
        "(Landroidx/compose/ui/Modifier;Lu41/b;Landroidx/compose/runtime/Composer;II)V",
        "",
        "Lu41/b$a;",
        "",
        "k",
        "(Ljava/util/List;)Ljava/util/List;",
        "fraction",
        "",
        "isLast",
        "j",
        "(FZ)F",
        "",
        "index",
        "zoneCount",
        "Li2/a1;",
        "i",
        "(II)Li2/a1;",
        "d",
        "(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V",
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
.method public static synthetic a(Landroidx/compose/ui/Modifier;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Lu41/c;->f(Landroidx/compose/ui/Modifier;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(JJLk2/e;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Lu41/c;->e(JJLk2/e;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Landroidx/compose/ui/Modifier;Lu41/b;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p5}, Lu41/c;->h(Landroidx/compose/ui/Modifier;Lu41/b;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method private static final d(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V
    .locals 12

    check-cast p1, Lp1/q;

    const v0, 0x9a976d8

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

    const/4 v1, 0x6

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

    const/4 v11, 0x6

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

    const/16 v1, 0x19

    invoke-direct {v0, p2, p3, v1, p0}, Lb70/a;-><init>(IIILandroidx/compose/ui/Modifier;)V

    iput-object v0, p1, Lp1/v1;->d:Lc93/m;

    :cond_8
    return-void
.end method

.method private static final e(JJLk2/e;)Ll83/a0;
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

.method private static final f(Landroidx/compose/ui/Modifier;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p1, p1, 0x1

    invoke-static {p1}, Lp1/x;->L(I)I

    move-result p1

    invoke-static {p0, p3, p1, p2}, Lu41/c;->d(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static final g(Landroidx/compose/ui/Modifier;Lu41/b;Landroidx/compose/runtime/Composer;II)V
    .locals 48

    move-object/from16 v3, p1

    sget-object v0, Lb2/e;->M:Lb2/k;

    const-string v1, "state"

    invoke-static {v3, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v1, p2

    check-cast v1, Lp1/q;

    const v2, 0x12e01cbb

    invoke-virtual {v1, v2}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v2, p4, 0x1

    if-eqz v2, :cond_0

    or-int/lit8 v6, p3, 0x6

    move v7, v6

    move-object/from16 v6, p0

    goto :goto_1

    :cond_0
    and-int/lit8 v6, p3, 0x6

    if-nez v6, :cond_2

    move-object/from16 v6, p0

    invoke-virtual {v1, v6}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_1

    const/4 v7, 0x4

    goto :goto_0

    :cond_1
    const/4 v7, 0x2

    :goto_0
    or-int v7, p3, v7

    goto :goto_1

    :cond_2
    move-object/from16 v6, p0

    move/from16 v7, p3

    :goto_1
    and-int/lit8 v8, p3, 0x30

    if-nez v8, :cond_4

    invoke-virtual {v1, v3}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_3

    const/16 v8, 0x20

    goto :goto_2

    :cond_3
    const/16 v8, 0x10

    :goto_2
    or-int/2addr v7, v8

    :cond_4
    and-int/lit8 v8, v7, 0x13

    const/16 v9, 0x12

    const/4 v10, 0x0

    const/4 v11, 0x1

    if-eq v8, v9, :cond_5

    move v8, v11

    goto :goto_3

    :cond_5
    move v8, v10

    :goto_3
    and-int/2addr v7, v11

    invoke-virtual {v1, v7, v8}, Lp1/q;->U(IZ)Z

    move-result v7

    if-eqz v7, :cond_18

    sget-object v12, Lb2/t;->w:Lb2/t;

    if-eqz v2, :cond_6

    move-object v2, v12

    goto :goto_4

    :cond_6
    move-object v2, v6

    :goto_4
    const/high16 v6, 0x3f800000    # 1.0f

    invoke-static {v6, v2}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v7

    sget-object v8, Ll0/m;->c:Ll0/g;

    invoke-static {v8, v0, v1, v10}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v8

    iget-wide v13, v1, Lp1/q;->T:J

    invoke-static {v13, v14}, Ljava/lang/Long;->hashCode(J)I

    move-result v9

    invoke-virtual {v1}, Lp1/q;->m()Lp1/p1;

    move-result-object v13

    invoke-static {v1, v7}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v7

    sget-object v14, La3/l;->a:La3/k;

    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v14, La3/k;->b:La3/j;

    invoke-virtual {v1}, Lp1/q;->i0()V

    iget-boolean v15, v1, Lp1/q;->S:Z

    if-eqz v15, :cond_7

    invoke-virtual {v1, v14}, Lp1/q;->l(Lc93/a;)V

    goto :goto_5

    :cond_7
    invoke-virtual {v1}, Lp1/q;->s0()V

    :goto_5
    sget-object v15, La3/k;->g:La3/i;

    invoke-static {v1, v15, v8}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v8, La3/k;->f:La3/i;

    invoke-static {v1, v8, v13}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v13, La3/k;->j:La3/i;

    iget-boolean v4, v1, Lp1/q;->S:Z

    if-nez v4, :cond_8

    invoke-virtual {v1}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-static {v4, v5}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_9

    :cond_8
    invoke-static {v9, v1, v9, v13}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_9
    sget-object v4, La3/k;->d:La3/i;

    invoke-static {v1, v4, v7}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    move-object v5, v4

    invoke-virtual {v3}, Lu41/b;->e()Ljava/lang/String;

    move-result-object v4

    const/16 v7, 0x8

    const/4 v9, 0x6

    if-nez v4, :cond_a

    const v4, 0x5fe5fa6b

    invoke-virtual {v1, v4}, Lp1/q;->e0(I)V

    invoke-virtual {v1, v10}, Lp1/q;->q(Z)V

    move-object/from16 v31, v0

    move-object v4, v1

    move-object/from16 v30, v2

    move-object/from16 v41, v5

    move v0, v6

    move-object/from16 v32, v8

    move v1, v10

    move-object v3, v12

    move-object/from16 v40, v13

    move-object v2, v14

    move-object/from16 v34, v15

    goto/16 :goto_6

    :cond_a
    const v6, 0x5fe5fa6c

    invoke-virtual {v1, v6}, Lp1/q;->e0(I)V

    int-to-float v6, v11

    int-to-float v10, v7

    mul-float v16, v6, v10

    const/16 v17, 0x7

    move-object v6, v13

    const/4 v13, 0x0

    move-object v10, v14

    const/4 v14, 0x0

    move-object/from16 v20, v15

    const/4 v15, 0x0

    invoke-static/range {v12 .. v17}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v13

    sget-object v14, Lx81/d;->a:Lx81/d;

    invoke-virtual {v14, v1, v9}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v15

    invoke-virtual {v15}, Lb91/d;->b()Lb91/a;

    move-result-object v24

    invoke-virtual {v14, v1, v9}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v14

    invoke-virtual {v14}, Ly81/i;->y()J

    move-result-wide v14

    const/16 v28, 0x0

    const v29, 0x2fff8

    move-object/from16 v16, v8

    move/from16 v17, v9

    const-wide/16 v8, 0x0

    move-object/from16 v21, v10

    const/4 v10, 0x0

    move/from16 v22, v11

    const/4 v11, 0x0

    move-object/from16 v23, v12

    const/4 v12, 0x0

    move-object/from16 v25, v6

    move/from16 v26, v7

    move-wide v6, v14

    move-object v15, v5

    move-object v5, v13

    const-wide/16 v13, 0x0

    move-object/from16 v27, v15

    const/4 v15, 0x0

    move-object/from16 v30, v16

    const/16 v16, 0x0

    move/from16 v32, v17

    const/16 v31, 0x2

    const-wide/16 v17, 0x0

    const/16 v33, 0x0

    const/16 v19, 0x0

    move-object/from16 v34, v20

    const/16 v20, 0x0

    move-object/from16 v35, v21

    const/16 v21, 0x0

    move/from16 v36, v22

    const/16 v22, 0x0

    move-object/from16 v37, v23

    const/16 v23, 0x0

    move-object/from16 v38, v25

    const/16 v25, 0x0

    move-object/from16 v39, v27

    const/16 v27, 0x30

    move-object/from16 v31, v0

    move-object/from16 v26, v1

    move-object/from16 v32, v30

    move/from16 v1, v33

    move-object/from16 v3, v37

    move-object/from16 v40, v38

    move-object/from16 v41, v39

    const/high16 v0, 0x3f800000    # 1.0f

    move-object/from16 v30, v2

    move-object/from16 v2, v35

    invoke-static/range {v4 .. v29}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v4, v26

    invoke-virtual {v4, v1}, Lp1/q;->q(Z)V

    :goto_6
    invoke-virtual/range {p1 .. p1}, Lu41/b;->f()Ljava/util/List;

    move-result-object v5

    invoke-static {v5}, Lu41/c;->k(Ljava/util/List;)Ljava/util/List;

    move-result-object v5

    invoke-static {v0, v3}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    sget-object v6, Lb2/e;->w:Lb2/m;

    invoke-static {v6, v1}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v6

    iget-wide v7, v4, Lp1/q;->T:J

    invoke-static {v7, v8}, Ljava/lang/Long;->hashCode(J)I

    move-result v7

    invoke-virtual {v4}, Lp1/q;->m()Lp1/p1;

    move-result-object v8

    invoke-static {v4, v0}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    invoke-virtual {v4}, Lp1/q;->i0()V

    iget-boolean v9, v4, Lp1/q;->S:Z

    if-eqz v9, :cond_b

    invoke-virtual {v4, v2}, Lp1/q;->l(Lc93/a;)V

    :goto_7
    move-object/from16 v2, v34

    goto :goto_8

    :cond_b
    invoke-virtual {v4}, Lp1/q;->s0()V

    goto :goto_7

    :goto_8
    invoke-static {v4, v2, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    move-object/from16 v2, v32

    invoke-static {v4, v2, v8}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v2, v4, Lp1/q;->S:Z

    if-nez v2, :cond_c

    invoke-virtual {v4}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-static {v2, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_d

    :cond_c
    move-object/from16 v6, v40

    goto :goto_a

    :cond_d
    :goto_9
    move-object/from16 v15, v41

    goto :goto_b

    :goto_a
    invoke-static {v7, v4, v7, v6}, Ld;->y(ILp1/q;ILa3/i;)V

    goto :goto_9

    :goto_b
    invoke-static {v4, v15, v0}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual/range {p1 .. p1}, Lu41/b;->c()Ljava/lang/Float;

    move-result-object v0

    const/4 v2, 0x0

    if-nez v0, :cond_e

    const v0, 0xf924411

    invoke-virtual {v4, v0}, Lp1/q;->e0(I)V

    invoke-virtual {v4, v1}, Lp1/q;->q(Z)V

    goto :goto_c

    :cond_e
    const v6, 0xf924412

    invoke-virtual {v4, v6}, Lp1/q;->e0(I)V

    invoke-virtual {v0}, Ljava/lang/Number;->floatValue()F

    move-result v0

    new-instance v6, Lp91/a;

    const/16 v11, 0xc

    const/4 v12, 0x0

    const/high16 v7, 0x3f000000    # 0.5f

    const v8, 0x3f666666    # 0.9f

    const/4 v9, 0x0

    const/4 v10, 0x0

    invoke-direct/range {v6 .. v12}, Lp91/a;-><init>(FFZZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-static {v3, v0, v2, v6}, Lp91/e;->j(Landroidx/compose/ui/Modifier;FFLp91/a;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    const/high16 v6, 0x41200000    # 10.0f

    invoke-static {v6, v0}, Lb2/a;->a(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    invoke-static {v0, v4, v1, v1}, Lu41/c;->d(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V

    invoke-virtual {v4, v1}, Lp1/q;->q(Z)V

    :goto_c
    const v0, 0x320d37e3

    invoke-virtual {v4, v0}, Lp1/q;->e0(I)V

    invoke-virtual/range {p1 .. p1}, Lu41/b;->f()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    move v10, v1

    :goto_d
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_17

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    add-int/lit8 v32, v10, 0x1

    if-ltz v10, :cond_16

    move-object/from16 v33, v6

    check-cast v33, Lu41/b$a;

    invoke-interface {v5, v1, v10}, Ljava/util/List;->subList(II)Ljava/util/List;

    move-result-object v6

    check-cast v6, Ljava/lang/Iterable;

    invoke-interface {v6}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v6

    move v12, v2

    :goto_e
    invoke-interface {v6}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    if-eqz v7, :cond_f

    invoke-interface {v6}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/lang/Number;

    invoke-virtual {v7}, Ljava/lang/Number;->floatValue()F

    move-result v7

    add-float/2addr v12, v7

    goto :goto_e

    :cond_f
    invoke-interface {v5, v10}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ljava/lang/Number;

    invoke-virtual {v6}, Ljava/lang/Number;->floatValue()F

    move-result v6

    add-float v34, v12, v6

    sget-object v7, Ll0/m;->c:Ll0/g;

    move-object/from16 v8, v31

    invoke-static {v7, v8, v4, v1}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v7

    iget-wide v13, v4, Lp1/q;->T:J

    invoke-static {v13, v14}, Ljava/lang/Long;->hashCode(J)I

    move-result v9

    invoke-virtual {v4}, Lp1/q;->m()Lp1/p1;

    move-result-object v11

    invoke-static {v4, v3}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v13

    sget-object v14, La3/l;->a:La3/k;

    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v14, La3/k;->b:La3/j;

    invoke-virtual {v4}, Lp1/q;->i0()V

    iget-boolean v15, v4, Lp1/q;->S:Z

    if-eqz v15, :cond_10

    invoke-virtual {v4, v14}, Lp1/q;->l(Lc93/a;)V

    goto :goto_f

    :cond_10
    invoke-virtual {v4}, Lp1/q;->s0()V

    :goto_f
    sget-object v14, La3/k;->g:La3/i;

    invoke-static {v4, v14, v7}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v7, La3/k;->f:La3/i;

    invoke-static {v4, v7, v11}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v7, La3/k;->j:La3/i;

    iget-boolean v11, v4, Lp1/q;->S:Z

    if-nez v11, :cond_11

    invoke-virtual {v4}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v11

    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v14

    invoke-static {v11, v14}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v11

    if-nez v11, :cond_12

    :cond_11
    invoke-static {v9, v4, v9, v7}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_12
    sget-object v7, La3/k;->d:La3/i;

    invoke-static {v4, v7, v13}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const-wide/high16 v13, 0x3ff8000000000000L    # 1.5

    double-to-float v7, v13

    const/4 v9, 0x4

    int-to-float v11, v9

    mul-float/2addr v7, v11

    invoke-static {v7, v3}, Landroidx/compose/foundation/layout/d;->h(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v7

    invoke-virtual/range {p1 .. p1}, Lu41/b;->f()Ljava/util/List;

    move-result-object v13

    invoke-static {v13}, Lwb3/f;->C(Ljava/util/List;)I

    move-result v13

    if-ne v10, v13, :cond_13

    const/4 v13, 0x1

    goto :goto_10

    :cond_13
    move v13, v1

    :goto_10
    invoke-static {v6, v13}, Lu41/c;->j(FZ)F

    move-result v14

    const/16 v17, 0x1a

    const/16 v18, 0x0

    const/4 v13, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    move/from16 v31, v11

    move-object v11, v7

    invoke-static/range {v11 .. v18}, Lp91/e;->f(Landroidx/compose/ui/Modifier;FFFFLp91/a;ILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    move-result-object v6

    move/from16 v35, v12

    invoke-virtual/range {v33 .. v33}, Lu41/b$a;->c()Ly81/f;

    move-result-object v7

    invoke-virtual {v7, v4, v1}, Ly81/f;->toComposableColor-WaAFU9c(Landroidx/compose/runtime/Composer;I)J

    move-result-wide v11

    invoke-virtual/range {p1 .. p1}, Lu41/b;->f()Ljava/util/List;

    move-result-object v7

    invoke-interface {v7}, Ljava/util/List;->size()I

    move-result v7

    invoke-static {v10, v7}, Lu41/c;->i(II)Li2/a1;

    move-result-object v7

    invoke-static {v6, v11, v12, v7}, Landroidx/compose/foundation/a;->c(Landroidx/compose/ui/Modifier;JLi2/a1;)Landroidx/compose/ui/Modifier;

    move-result-object v6

    invoke-static {v6, v4, v1}, Ll0/q;->a(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V

    invoke-virtual/range {v33 .. v33}, Lu41/b$a;->e()Ljava/lang/String;

    move-result-object v6

    const-wide/high16 v10, 0x3fe0000000000000L    # 0.5

    if-nez v6, :cond_14

    const v6, -0x2cb63dcd

    invoke-virtual {v4, v6}, Lp1/q;->e0(I)V

    invoke-virtual {v4, v1}, Lp1/q;->q(Z)V

    move-object/from16 v37, v3

    move-object/from16 v39, v5

    move-object/from16 v38, v8

    move/from16 v43, v9

    move-wide v2, v10

    const/16 v42, 0x8

    goto/16 :goto_11

    :cond_14
    const v7, -0x2cb63dcc

    invoke-virtual {v4, v7}, Lp1/q;->e0(I)V

    double-to-float v7, v10

    const/16 v12, 0x8

    int-to-float v13, v12

    mul-float v14, v7, v13

    const/16 v16, 0x0

    const/16 v17, 0xd

    const/4 v13, 0x0

    const/4 v15, 0x0

    move/from16 v42, v12

    move-object v12, v3

    invoke-static/range {v12 .. v17}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v18

    add-float v12, v35, v34

    const/4 v7, 0x2

    int-to-float v13, v7

    div-float v19, v12, v13

    sget-object v12, Lp91/a;->e:Lp91/a$a;

    invoke-virtual {v12}, Lp91/a$a;->b()Lp91/a;

    move-result-object v21

    const/16 v22, 0x2

    const/16 v23, 0x0

    const/16 v20, 0x0

    invoke-static/range {v18 .. v23}, Lp91/e;->k(Landroidx/compose/ui/Modifier;FFLp91/a;ILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    move-result-object v12

    sget-object v13, Lx81/d;->a:Lx81/d;

    const/4 v14, 0x6

    invoke-virtual {v13, v4, v14}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v13

    invoke-virtual {v13}, Lb91/d;->F()Lb91/a;

    move-result-object v24

    invoke-virtual/range {v33 .. v33}, Lu41/b$a;->c()Ly81/f;

    move-result-object v13

    invoke-virtual {v13, v4, v1}, Ly81/f;->toComposableColor-WaAFU9c(Landroidx/compose/runtime/Composer;I)J

    move-result-wide v15

    const/16 v28, 0x0

    const v29, 0x2fff8

    move-object v13, v8

    move/from16 v43, v9

    const-wide/16 v8, 0x0

    move-wide/from16 v17, v10

    const/4 v10, 0x0

    const/4 v11, 0x0

    move-object/from16 v19, v5

    move-object v5, v12

    const/4 v12, 0x0

    move-object/from16 v20, v13

    move/from16 v45, v14

    const-wide/16 v13, 0x0

    move-object/from16 v26, v4

    move-object v4, v6

    move/from16 v44, v7

    move-wide v6, v15

    const/4 v15, 0x0

    const/16 v16, 0x0

    move-wide/from16 v21, v17

    const-wide/16 v17, 0x0

    move-object/from16 v23, v19

    const/16 v19, 0x0

    move-object/from16 v25, v20

    const/16 v20, 0x0

    move-wide/from16 v36, v21

    const/16 v21, 0x0

    const/16 v22, 0x0

    move-object/from16 v27, v23

    const/16 v23, 0x0

    move-object/from16 v38, v25

    const/16 v25, 0x0

    move-object/from16 v39, v27

    const/16 v27, 0x0

    move-wide/from16 v46, v36

    move-object/from16 v37, v3

    move-wide/from16 v2, v46

    invoke-static/range {v4 .. v29}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v4, v26

    invoke-virtual {v4, v1}, Lp1/q;->q(Z)V

    :goto_11
    invoke-virtual/range {v33 .. v33}, Lu41/b$a;->d()Ljava/lang/String;

    move-result-object v5

    if-nez v5, :cond_15

    const v2, -0x2cabe3e8

    invoke-virtual {v4, v2}, Lp1/q;->e0(I)V

    invoke-virtual {v4, v1}, Lp1/q;->q(Z)V

    move-object/from16 v3, v37

    const/4 v2, 0x2

    const/16 v45, 0x6

    :goto_12
    const/4 v5, 0x1

    goto :goto_13

    :cond_15
    const v6, -0x2cabe3e7

    invoke-virtual {v4, v6}, Lp1/q;->e0(I)V

    double-to-float v2, v2

    mul-float v14, v2, v31

    const/16 v16, 0x0

    const/16 v17, 0xd

    const/4 v13, 0x0

    const/4 v15, 0x0

    move-object/from16 v12, v37

    invoke-static/range {v12 .. v17}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v6

    move-object v3, v12

    add-float v12, v35, v34

    const/4 v2, 0x2

    int-to-float v7, v2

    div-float v7, v12, v7

    sget-object v8, Lp91/a;->e:Lp91/a$a;

    invoke-virtual {v8}, Lp91/a$a;->b()Lp91/a;

    move-result-object v9

    const/4 v10, 0x2

    const/4 v11, 0x0

    const/4 v8, 0x0

    invoke-static/range {v6 .. v11}, Lp91/e;->k(Landroidx/compose/ui/Modifier;FFLp91/a;ILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    move-result-object v6

    sget-object v7, Lx81/d;->a:Lx81/d;

    const/4 v8, 0x6

    invoke-virtual {v7, v4, v8}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v9

    invoke-virtual {v9}, Lb91/d;->F()Lb91/a;

    move-result-object v24

    invoke-virtual {v7, v4, v8}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v7

    invoke-virtual {v7}, Ly81/i;->y()J

    move-result-wide v9

    const/16 v28, 0x0

    const v29, 0x2fff8

    move-object/from16 v26, v4

    move-object v4, v5

    move-object v5, v6

    move/from16 v45, v8

    move-wide v6, v9

    const-wide/16 v8, 0x0

    const/4 v10, 0x0

    const/4 v12, 0x0

    const-wide/16 v13, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const-wide/16 v17, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v25, 0x0

    const/16 v27, 0x0

    invoke-static/range {v4 .. v29}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v4, v26

    invoke-virtual {v4, v1}, Lp1/q;->q(Z)V

    goto :goto_12

    :goto_13
    invoke-virtual {v4, v5}, Lp1/q;->q(Z)V

    move/from16 v10, v32

    move-object/from16 v31, v38

    move-object/from16 v5, v39

    const/4 v2, 0x0

    goto/16 :goto_d

    :cond_16
    invoke-static {}, Lwb3/f;->d0()V

    const/4 v0, 0x0

    throw v0

    :cond_17
    const/4 v5, 0x1

    invoke-static {v4, v1, v5, v5}, Lm4/a;->y(Lp1/q;ZZZ)V

    move-object/from16 v1, v30

    goto :goto_14

    :cond_18
    move-object v4, v1

    invoke-virtual {v4}, Lp1/q;->X()V

    move-object v1, v6

    :goto_14
    invoke-virtual {v4}, Lp1/q;->u()Lp1/v1;

    move-result-object v6

    if-eqz v6, :cond_19

    new-instance v0, Lt80/b;

    const/4 v5, 0x3

    move-object/from16 v3, p1

    move/from16 v2, p3

    move/from16 v4, p4

    invoke-direct/range {v0 .. v5}, Lt80/b;-><init>(Ljava/lang/Object;ILjava/lang/Object;II)V

    iput-object v0, v6, Lp1/v1;->d:Lc93/m;

    :cond_19
    return-void
.end method

.method private static final h(Landroidx/compose/ui/Modifier;Lu41/b;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, Lp1/x;->L(I)I

    move-result p2

    invoke-static {p0, p1, p4, p2, p3}, Lu41/c;->g(Landroidx/compose/ui/Modifier;Lu41/b;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final i(II)Li2/a1;
    .locals 4

    const/4 v0, 0x4

    const/4 v1, 0x2

    const/4 v2, 0x1

    if-ne p1, v2, :cond_0

    int-to-float p0, v1

    int-to-float p1, v0

    mul-float/2addr p0, p1

    invoke-static {p0}, Lt0/j;->e(F)Lt0/i;

    move-result-object p0

    return-object p0

    :cond_0
    const/4 v3, 0x0

    if-nez p0, :cond_1

    int-to-float p0, v1

    int-to-float p1, v0

    mul-float/2addr p0, p1

    const/4 p1, 0x6

    invoke-static {p0, v3, v3, p0, p1}, Lt0/j;->g(FFFFI)Lt0/i;

    move-result-object p0

    return-object p0

    :cond_1
    sub-int/2addr p1, v2

    if-ne p0, p1, :cond_2

    int-to-float p0, v1

    int-to-float p1, v0

    mul-float/2addr p0, p1

    const/16 p1, 0x9

    invoke-static {v3, p0, p0, v3, p1}, Lt0/j;->g(FFFFI)Lt0/i;

    move-result-object p0

    return-object p0

    :cond_2
    sget-object p0, Li2/w0;->a:Li2/v0;

    return-object p0
.end method

.method private static final j(FZ)F
    .locals 1

    if-eqz p1, :cond_0

    return p0

    :cond_0
    const p1, 0x3ba3d70a    # 0.005f

    sub-float p1, p0, p1

    const/high16 v0, 0x40000000    # 2.0f

    div-float/2addr p0, v0

    cmpg-float v0, p1, p0

    if-gez v0, :cond_1

    return p0

    :cond_1
    return p1
.end method

.method private static final k(Ljava/util/List;)Ljava/util/List;
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Lu41/b$a;",
            ">;)",
            "Ljava/util/List<",
            "Ljava/lang/Float;",
            ">;"
        }
    .end annotation

    check-cast p0, Ljava/lang/Iterable;

    const/4 v0, 0x0

    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v1

    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_0
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_0

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lu41/b$a;

    invoke-virtual {v1}, Ljava/lang/Number;->floatValue()F

    move-result v1

    invoke-virtual {v3}, Lu41/b$a;->f()F

    move-result v3

    add-float/2addr v3, v1

    invoke-static {v3}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v1

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Ljava/lang/Number;->floatValue()F

    move-result v2

    cmpl-float v0, v2, v0

    if-lez v0, :cond_1

    goto :goto_1

    :cond_1
    const/4 v1, 0x0

    :goto_1
    if-eqz v1, :cond_2

    invoke-virtual {v1}, Ljava/lang/Float;->floatValue()F

    move-result v0

    goto :goto_2

    :cond_2
    const/high16 v0, 0x3f800000    # 1.0f

    :goto_2
    new-instance v1, Ljava/util/ArrayList;

    const/16 v2, 0xa

    invoke-static {p0, v2}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v2

    invoke-direct {v1, v2}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_3
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_3

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lu41/b$a;

    invoke-virtual {v2}, Lu41/b$a;->f()F

    move-result v2

    div-float/2addr v2, v0

    invoke-static {v2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v2

    invoke-interface {v1, v2}, Ljava/util/Collection;->add(Ljava/lang/Object;)Z

    goto :goto_3

    :cond_3
    return-object v1
.end method
