.class public abstract Lo61/d;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u001a\u001f\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0007\u00a2\u0006\u0004\u0008\u0005\u0010\u0006\u00a8\u0006\u0007"
    }
    d2 = {
        "Landroidx/compose/ui/Modifier;",
        "modifier",
        "Lj71/b$e;",
        "plotState",
        "Ll83/a0;",
        "c",
        "(Landroidx/compose/ui/Modifier;Lj71/b$e;Landroidx/compose/runtime/Composer;I)V",
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
.method public static synthetic a(Lj71/b$e;JFFFFJFJFLk2/e;)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p13}, Lo61/d;->d(Lj71/b$e;JFFFFJFJFLk2/e;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Landroidx/compose/ui/Modifier;Lj71/b$e;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Lo61/d;->e(Landroidx/compose/ui/Modifier;Lj71/b$e;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final c(Landroidx/compose/ui/Modifier;Lj71/b$e;Landroidx/compose/runtime/Composer;I)V
    .locals 25

    move-object/from16 v0, p0

    move-object/from16 v2, p1

    const-string v1, "modifier"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "plotState"

    invoke-static {v2, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v1, p2

    check-cast v1, Lp1/q;

    const v3, -0x42a58cc

    invoke-virtual {v1, v3}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v3, p3, 0x6

    const/4 v4, 0x2

    const/4 v5, 0x4

    if-nez v3, :cond_1

    invoke-virtual {v1, v0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    move v3, v5

    goto :goto_0

    :cond_0
    move v3, v4

    :goto_0
    or-int v3, p3, v3

    goto :goto_1

    :cond_1
    move/from16 v3, p3

    :goto_1
    and-int/lit8 v6, p3, 0x30

    if-nez v6, :cond_4

    and-int/lit8 v6, p3, 0x40

    if-nez v6, :cond_2

    invoke-virtual {v1, v2}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v6

    goto :goto_2

    :cond_2
    invoke-virtual {v1, v2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v6

    :goto_2
    if-eqz v6, :cond_3

    const/16 v6, 0x20

    goto :goto_3

    :cond_3
    const/16 v6, 0x10

    :goto_3
    or-int/2addr v3, v6

    :cond_4
    and-int/lit8 v6, v3, 0x13

    const/16 v8, 0x12

    const/4 v9, 0x1

    const/4 v10, 0x0

    if-eq v6, v8, :cond_5

    move v6, v9

    goto :goto_4

    :cond_5
    move v6, v10

    :goto_4
    and-int/lit8 v8, v3, 0x1

    invoke-virtual {v1, v8, v6}, Lp1/q;->U(IZ)Z

    move-result v6

    if-eqz v6, :cond_10

    sget-object v6, Lx81/d;->a:Lx81/d;

    const/4 v8, 0x6

    invoke-virtual {v6, v1, v8}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v11

    invoke-virtual {v11}, Ly81/i;->r()J

    move-result-wide v11

    invoke-virtual {v2}, Lj71/b$e;->e()Lo61/e;

    move-result-object v13

    const/4 v14, 0x0

    if-eqz v13, :cond_6

    invoke-virtual {v13}, Lo61/e;->a()Ly81/e;

    move-result-object v13

    goto :goto_5

    :cond_6
    move-object v13, v14

    :goto_5
    if-nez v13, :cond_7

    const v13, 0x440fa1ba

    invoke-virtual {v1, v13}, Lp1/q;->e0(I)V

    invoke-virtual {v1, v10}, Lp1/q;->q(Z)V

    goto :goto_6

    :cond_7
    const v14, 0x5d08c327

    invoke-virtual {v1, v14}, Lp1/q;->e0(I)V

    invoke-interface {v13, v1, v10}, Ly81/e;->toComposableColor-WaAFU9c(Landroidx/compose/runtime/Composer;I)J

    move-result-wide v13

    invoke-static {v1, v10, v13, v14}, Ldc/b;->h(Lp1/q;ZJ)Li2/x;

    move-result-object v14

    :goto_6
    if-nez v14, :cond_8

    const v13, 0x5d08c83e

    invoke-static {v1, v13, v6, v1, v8}, Lm4/a;->B(Lp1/q;ILx81/d;Lp1/q;I)J

    move-result-wide v13

    invoke-virtual {v1, v10}, Lp1/q;->q(Z)V

    goto :goto_7

    :cond_8
    const v13, 0x5d08be12

    invoke-virtual {v1, v13}, Lp1/q;->e0(I)V

    invoke-virtual {v1, v10}, Lp1/q;->q(Z)V

    iget-wide v13, v14, Li2/x;->a:J

    :goto_7
    invoke-virtual {v6, v1, v8}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v6

    invoke-virtual {v6}, Ly81/i;->b1()J

    move-result-wide v7

    sget-object v6, Lb3/v1;->h:Lp1/u2;

    invoke-virtual {v1, v6}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ly3/c;

    move-wide/from16 v17, v11

    const-wide/high16 v10, 0x3ff8000000000000L    # 1.5

    double-to-float v10, v10

    invoke-interface {v6, v10}, Ly3/c;->q0(F)F

    move-result v11

    invoke-interface {v6, v10}, Ly3/c;->q0(F)F

    move-result v10

    int-to-float v12, v9

    invoke-interface {v6, v12}, Ly3/c;->q0(F)F

    move-result v12

    int-to-float v5, v5

    move v9, v5

    invoke-interface {v6, v9}, Ly3/c;->q0(F)F

    move-result v5

    move/from16 v19, v3

    mul-float v3, v9, v9

    invoke-interface {v6, v3}, Ly3/c;->q0(F)F

    move-result v3

    int-to-float v4, v4

    mul-float/2addr v4, v9

    invoke-interface {v6, v4}, Ly3/c;->q0(F)F

    move-result v4

    const/high16 v6, 0x3f800000    # 1.0f

    sget-object v9, Lb2/t;->w:Lb2/t;

    invoke-static {v6, v9}, Landroidx/compose/foundation/layout/d;->d(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v15

    invoke-interface {v15, v0}, Landroidx/compose/ui/Modifier;->e(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v15

    sget-object v6, Lb2/e;->y:Lb2/m;

    const/4 v0, 0x0

    invoke-static {v6, v0}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v6

    move-wide/from16 v20, v13

    iget-wide v13, v1, Lp1/q;->T:J

    invoke-static {v13, v14}, Ljava/lang/Long;->hashCode(J)I

    move-result v13

    invoke-virtual {v1}, Lp1/q;->m()Lp1/p1;

    move-result-object v14

    invoke-static {v1, v15}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v15

    sget-object v16, La3/l;->a:La3/k;

    invoke-virtual/range {v16 .. v16}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v0, La3/k;->b:La3/j;

    invoke-virtual {v1}, Lp1/q;->i0()V

    move/from16 v22, v4

    iget-boolean v4, v1, Lp1/q;->S:Z

    if-eqz v4, :cond_9

    invoke-virtual {v1, v0}, Lp1/q;->l(Lc93/a;)V

    goto :goto_8

    :cond_9
    invoke-virtual {v1}, Lp1/q;->s0()V

    :goto_8
    sget-object v0, La3/k;->g:La3/i;

    invoke-static {v1, v0, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v0, La3/k;->f:La3/i;

    invoke-static {v1, v0, v14}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v0, La3/k;->j:La3/i;

    iget-boolean v4, v1, Lp1/q;->S:Z

    if-nez v4, :cond_a

    invoke-virtual {v1}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    invoke-static {v13}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-static {v4, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_b

    :cond_a
    invoke-static {v13, v1, v13, v0}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_b
    sget-object v0, La3/k;->d:La3/i;

    invoke-static {v1, v0, v15}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const/high16 v0, 0x3f800000    # 1.0f

    invoke-static {v0, v9}, Landroidx/compose/foundation/layout/d;->d(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    and-int/lit8 v4, v19, 0x70

    const/16 v6, 0x20

    if-eq v4, v6, :cond_d

    and-int/lit8 v4, v19, 0x40

    if-eqz v4, :cond_c

    invoke-virtual {v1, v2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_c

    goto :goto_9

    :cond_c
    const/16 v16, 0x0

    goto :goto_a

    :cond_d
    :goto_9
    const/16 v16, 0x1

    :goto_a
    invoke-virtual {v1, v7, v8}, Lp1/q;->f(J)Z

    move-result v4

    or-int v4, v16, v4

    invoke-virtual {v1, v5}, Lp1/q;->d(F)Z

    move-result v6

    or-int/2addr v4, v6

    invoke-virtual {v1, v12}, Lp1/q;->d(F)Z

    move-result v6

    or-int/2addr v4, v6

    invoke-virtual {v1, v11}, Lp1/q;->d(F)Z

    move-result v6

    or-int/2addr v4, v6

    invoke-virtual {v1, v10}, Lp1/q;->d(F)Z

    move-result v6

    or-int/2addr v4, v6

    move-wide/from16 v13, v17

    invoke-virtual {v1, v13, v14}, Lp1/q;->f(J)Z

    move-result v6

    or-int/2addr v4, v6

    invoke-virtual {v1, v3}, Lp1/q;->d(F)Z

    move-result v6

    or-int/2addr v4, v6

    move/from16 p2, v3

    move-wide/from16 v2, v20

    invoke-virtual {v1, v2, v3}, Lp1/q;->f(J)Z

    move-result v6

    or-int/2addr v4, v6

    move/from16 v6, v22

    invoke-virtual {v1, v6}, Lp1/q;->d(F)Z

    move-result v9

    or-int/2addr v4, v9

    invoke-virtual {v1}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v9

    if-nez v4, :cond_e

    sget-object v4, Lp1/l;->a:Lp1/v0;

    if-ne v9, v4, :cond_f

    :cond_e
    move-object v4, v1

    goto :goto_b

    :cond_f
    move-object/from16 v2, p1

    move-object v15, v1

    goto :goto_c

    :goto_b
    new-instance v1, Lo61/c;

    move-object v15, v4

    move-wide/from16 v23, v2

    move-object/from16 v2, p1

    move-wide v3, v7

    move v8, v10

    move v7, v11

    move-wide v9, v13

    move/from16 v11, p2

    move v14, v6

    move v6, v12

    move-wide/from16 v12, v23

    invoke-direct/range {v1 .. v14}, Lo61/c;-><init>(Lj71/b$e;JFFFFJFJF)V

    invoke-virtual {v15, v1}, Lp1/q;->p0(Ljava/lang/Object;)V

    move-object v9, v1

    :goto_c
    check-cast v9, Lkotlin/jvm/functions/Function1;

    const/4 v1, 0x6

    invoke-static {v0, v9, v15, v1}, Lj93/l0;->a(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    const/4 v0, 0x1

    invoke-virtual {v15, v0}, Lp1/q;->q(Z)V

    goto :goto_d

    :cond_10
    move-object v15, v1

    invoke-virtual {v15}, Lp1/q;->X()V

    :goto_d
    invoke-virtual {v15}, Lp1/q;->u()Lp1/v1;

    move-result-object v0

    if-eqz v0, :cond_11

    new-instance v1, Lmx1/i;

    const/16 v3, 0x19

    move-object/from16 v4, p0

    move/from16 v15, p3

    invoke-direct {v1, v4, v2, v15, v3}, Lmx1/i;-><init>(Ljava/lang/Object;Ljava/lang/Object;II)V

    iput-object v1, v0, Lp1/v1;->d:Lc93/m;

    :cond_11
    return-void
.end method

.method private static final d(Lj71/b$e;JFFFFJFJFLk2/e;)Ll83/a0;
    .locals 15

    move/from16 v0, p3

    const-string v1, "$this$Canvas"

    move-object/from16 v2, p13

    invoke-static {v2, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lj71/b$e;->e()Lo61/e;

    move-result-object p0

    if-eqz p0, :cond_0

    invoke-interface {v2}, Lk2/e;->d()J

    move-result-wide v3

    const/16 v1, 0x20

    shr-long/2addr v3, v1

    long-to-int v3, v3

    invoke-static {v3}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v3

    invoke-interface {v2}, Lk2/e;->d()J

    move-result-wide v4

    const-wide v6, 0xffffffffL

    and-long/2addr v4, v6

    long-to-int v4, v4

    invoke-static {v4}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v4

    const/4 v5, 0x1

    int-to-float v8, v5

    invoke-virtual {p0}, Lo61/e;->b()F

    move-result p0

    sub-float/2addr v8, p0

    mul-float/2addr v8, v4

    invoke-static {v3}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result p0

    int-to-long v3, p0

    invoke-static {v8}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result p0

    int-to-long v8, p0

    shl-long/2addr v3, v1

    and-long/2addr v8, v6

    or-long v13, v3, v8

    shr-long v3, v13, v1

    long-to-int p0, v3

    invoke-static {p0}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v3

    neg-float v4, v0

    invoke-static {v3}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v3

    int-to-long v8, v3

    invoke-static {v4}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v3

    int-to-long v3, v3

    shl-long/2addr v8, v1

    and-long/2addr v3, v6

    or-long/2addr v3, v8

    invoke-static {p0}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result p0

    invoke-interface {v2}, Lk2/e;->d()J

    move-result-wide v8

    and-long/2addr v8, v6

    long-to-int v8, v8

    invoke-static {v8}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v8

    add-float/2addr v8, v0

    invoke-static {p0}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result p0

    int-to-long v9, p0

    invoke-static {v8}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result p0

    int-to-long v11, p0

    shl-long v0, v9, v1

    and-long/2addr v6, v11

    or-long v7, v0, v6

    const/4 p0, 0x2

    new-array v0, p0, [F

    const/4 v1, 0x0

    aput p5, v0, v1

    aput p6, v0, v5

    new-instance v11, Li2/k;

    new-instance v1, Landroid/graphics/DashPathEffect;

    const/4 v5, 0x0

    invoke-direct {v1, v0, v5}, Landroid/graphics/DashPathEffect;-><init>([FF)V

    invoke-direct {v11, v1}, Li2/k;-><init>(Landroid/graphics/PathEffect;)V

    const/16 v12, 0x1d0

    const/4 v10, 0x0

    move/from16 v9, p4

    move-wide v5, v3

    move-wide/from16 v3, p1

    invoke-static/range {v2 .. v12}, Lk2/e;->A0(Lk2/e;JJJFILi2/t0;I)V

    int-to-float p0, p0

    div-float v5, p9, p0

    const/4 v9, 0x0

    const/16 v10, 0x78

    const/4 v8, 0x0

    move-wide/from16 v3, p7

    move-object/from16 v2, p13

    move-wide v6, v13

    invoke-static/range {v2 .. v10}, Lk2/e;->M(Lk2/e;JFJFLk2/f;I)V

    div-float p0, p12, p0

    const/4 v0, 0x0

    const/16 v1, 0x78

    const/4 v2, 0x0

    move/from16 p3, p0

    move-wide/from16 p1, p10

    move-object/from16 p0, p13

    move-object/from16 p7, v0

    move/from16 p8, v1

    move/from16 p6, v2

    move-wide/from16 p4, v6

    invoke-static/range {p0 .. p8}, Lk2/e;->M(Lk2/e;JFJFLk2/f;I)V

    :cond_0
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final e(Landroidx/compose/ui/Modifier;Lj71/b$e;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, Lp1/x;->L(I)I

    move-result p2

    invoke-static {p0, p1, p3, p2}, Lo61/d;->c(Landroidx/compose/ui/Modifier;Lj71/b$e;Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method
