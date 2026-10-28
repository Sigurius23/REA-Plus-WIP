.class public abstract Lsl0/l3;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010 \n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0003\u001a5\u0010\t\u001a\u00020\u00082\u0008\u0008\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u00042\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u0006H\u0007\u00a2\u0006\u0004\u0008\t\u0010\n\u00a8\u0006\u0011\u00b2\u0006\u0014\u0010\u000c\u001a\u0008\u0012\u0004\u0012\u00020\u00040\u000b8\n@\nX\u008a\u008e\u0002\u00b2\u0006\u000e\u0010\r\u001a\u00020\u00048\n@\nX\u008a\u008e\u0002\u00b2\u0006\u000e\u0010\u000f\u001a\u00020\u000e8\n@\nX\u008a\u008e\u0002\u00b2\u0006\u000c\u0010\u0010\u001a\u00020\u00048\nX\u008a\u0084\u0002"
    }
    d2 = {
        "Landroidx/compose/ui/Modifier;",
        "modifier",
        "",
        "isActive",
        "",
        "audioLevel",
        "Li2/x;",
        "barColor",
        "Ll83/a0;",
        "c",
        "(Landroidx/compose/ui/Modifier;ZFJLandroidx/compose/runtime/Composer;II)V",
        "",
        "voiceBars",
        "slideOffsetPx",
        "",
        "visibleBarCount",
        "currentAudioLevel",
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
.method public static synthetic a(Landroidx/compose/ui/Modifier;ZFJIILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p8}, Lsl0/l3;->f(Landroidx/compose/ui/Modifier;ZFJIILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(FFLp1/c1;FJLp1/c1;Lp1/c1;Lk2/e;)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p8}, Lsl0/l3;->e(FFLp1/c1;FJLp1/c1;Lp1/c1;Lk2/e;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final c(Landroidx/compose/ui/Modifier;ZFJLandroidx/compose/runtime/Composer;II)V
    .locals 31

    move/from16 v6, p6

    move-object/from16 v0, p5

    check-cast v0, Lp1/q;

    const v1, -0x61011a56

    invoke-virtual {v0, v1}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v1, p7, 0x1

    const/4 v2, 0x4

    if-eqz v1, :cond_0

    or-int/lit8 v4, v6, 0x6

    move v5, v4

    move-object/from16 v4, p0

    goto :goto_1

    :cond_0
    and-int/lit8 v4, v6, 0x6

    if-nez v4, :cond_2

    move-object/from16 v4, p0

    invoke-virtual {v0, v4}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_1

    move v5, v2

    goto :goto_0

    :cond_1
    const/4 v5, 0x2

    :goto_0
    or-int/2addr v5, v6

    goto :goto_1

    :cond_2
    move-object/from16 v4, p0

    move v5, v6

    :goto_1
    and-int/lit8 v7, v6, 0x30

    move/from16 v11, p1

    if-nez v7, :cond_4

    invoke-virtual {v0, v11}, Lp1/q;->h(Z)Z

    move-result v7

    if-eqz v7, :cond_3

    const/16 v7, 0x20

    goto :goto_2

    :cond_3
    const/16 v7, 0x10

    :goto_2
    or-int/2addr v5, v7

    :cond_4
    and-int/lit8 v7, p7, 0x4

    if-eqz v7, :cond_6

    or-int/lit16 v5, v5, 0x180

    :cond_5
    move/from16 v10, p2

    goto :goto_4

    :cond_6
    and-int/lit16 v10, v6, 0x180

    if-nez v10, :cond_5

    move/from16 v10, p2

    invoke-virtual {v0, v10}, Lp1/q;->d(F)Z

    move-result v12

    if-eqz v12, :cond_7

    const/16 v12, 0x100

    goto :goto_3

    :cond_7
    const/16 v12, 0x80

    :goto_3
    or-int/2addr v5, v12

    :goto_4
    and-int/lit16 v12, v6, 0xc00

    if-nez v12, :cond_9

    and-int/lit8 v12, p7, 0x8

    move-wide/from16 v14, p3

    if-nez v12, :cond_8

    invoke-virtual {v0, v14, v15}, Lp1/q;->f(J)Z

    move-result v12

    if-eqz v12, :cond_8

    const/16 v12, 0x800

    goto :goto_5

    :cond_8
    const/16 v12, 0x400

    :goto_5
    or-int/2addr v5, v12

    goto :goto_6

    :cond_9
    move-wide/from16 v14, p3

    :goto_6
    and-int/lit16 v12, v5, 0x493

    const/16 v13, 0x492

    const/4 v8, 0x1

    if-eq v12, v13, :cond_a

    move v12, v8

    goto :goto_7

    :cond_a
    const/4 v12, 0x0

    :goto_7
    and-int/lit8 v13, v5, 0x1

    invoke-virtual {v0, v13, v12}, Lp1/q;->U(IZ)Z

    move-result v12

    if-eqz v12, :cond_1e

    invoke-virtual {v0}, Lp1/q;->Z()V

    and-int/lit8 v12, v6, 0x1

    sget-object v13, Lb2/t;->w:Lb2/t;

    const/4 v9, 0x0

    if-eqz v12, :cond_d

    invoke-virtual {v0}, Lp1/q;->C()Z

    move-result v12

    if-eqz v12, :cond_b

    goto :goto_9

    :cond_b
    invoke-virtual {v0}, Lp1/q;->X()V

    and-int/lit8 v1, p7, 0x8

    if-eqz v1, :cond_c

    :goto_8
    and-int/lit16 v5, v5, -0x1c01

    :cond_c
    move v1, v10

    move-wide/from16 v25, v14

    goto :goto_a

    :cond_d
    :goto_9
    if-eqz v1, :cond_e

    move-object v4, v13

    :cond_e
    if-eqz v7, :cond_f

    move v10, v9

    :cond_f
    and-int/lit8 v1, p7, 0x8

    if-eqz v1, :cond_c

    sget-object v1, Lx81/d;->a:Lx81/d;

    sget v7, Lx81/d;->b:I

    invoke-virtual {v1, v0, v7}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v1

    invoke-virtual {v1}, Ly81/i;->y()J

    move-result-wide v14

    goto :goto_8

    :goto_a
    invoke-virtual {v0}, Lp1/q;->r()V

    int-to-float v14, v8

    const/4 v7, 0x5

    int-to-float v7, v7

    int-to-float v2, v2

    mul-float/2addr v7, v2

    move-object/from16 p0, v4

    const-wide/high16 v3, 0x3ff8000000000000L    # 1.5

    double-to-float v3, v3

    mul-float v24, v3, v2

    invoke-virtual {v0}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    sget-object v4, Lp1/l;->a:Lp1/v0;

    if-ne v3, v4, :cond_10

    sget-object v3, Lm83/y;->w:Lm83/y;

    invoke-static {v3}, Lp1/x;->z(Ljava/lang/Object;)Lp1/k1;

    move-result-object v3

    invoke-virtual {v0, v3}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_10
    move-object/from16 v28, v3

    check-cast v28, Lp1/c1;

    invoke-virtual {v0}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    if-ne v3, v4, :cond_11

    invoke-static {v9, v0}, Lc13/a;->o(FLp1/q;)Lp1/k1;

    move-result-object v3

    :cond_11
    move-object/from16 v27, v3

    check-cast v27, Lp1/c1;

    invoke-virtual {v0}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    if-ne v3, v4, :cond_12

    const/4 v10, 0x0

    invoke-static {v10, v0}, Ldc/b;->x(ILp1/q;)Lp1/k1;

    move-result-object v3

    :cond_12
    move-object/from16 v23, v3

    check-cast v23, Lp1/c1;

    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v3

    invoke-static {v3, v0}, Lp1/x;->F(Ljava/lang/Object;Landroidx/compose/runtime/Composer;)Lp1/c1;

    move-result-object v3

    invoke-static {v11}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v10

    and-int/lit8 v12, v5, 0x70

    const/16 v15, 0x20

    if-ne v12, v15, :cond_13

    move v12, v8

    goto :goto_b

    :cond_13
    const/4 v12, 0x0

    :goto_b
    invoke-virtual {v0, v3}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v15

    or-int/2addr v12, v15

    invoke-virtual {v0}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v15

    if-nez v12, :cond_14

    if-ne v15, v4, :cond_15

    :cond_14
    move-object v12, v10

    goto :goto_c

    :cond_15
    move-object v3, v10

    move-object v7, v13

    move-wide/from16 v29, v25

    const/16 v8, 0x800

    goto :goto_d

    :goto_c
    new-instance v10, Lsl0/l3$a;

    const/16 v19, 0x0

    move-object v8, v13

    move v13, v7

    move-object v7, v8

    move-object/from16 v17, v3

    move-object v3, v12

    move-object/from16 v16, v23

    move/from16 v12, v24

    move-wide/from16 v29, v25

    move-object/from16 v18, v27

    move-object/from16 v15, v28

    const/16 v8, 0x800

    invoke-direct/range {v10 .. v19}, Lsl0/l3$a;-><init>(ZFFFLp1/c1;Lp1/c1;Lp1/t2;Lp1/c1;Lq83/d;)V

    invoke-virtual {v0, v10}, Lp1/q;->p0(Ljava/lang/Object;)V

    move-object v15, v10

    :goto_d
    check-cast v15, Lc93/m;

    invoke-static {v0, v15, v3}, Lp1/x;->g(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const/high16 v3, 0x3f800000    # 1.0f

    move-object/from16 v10, p0

    invoke-static {v3, v10}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v11

    const/16 v12, 0xb

    int-to-float v12, v12

    mul-float/2addr v12, v2

    invoke-static {v12, v11}, Landroidx/compose/foundation/layout/d;->h(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v11

    invoke-static {v2}, Lt0/j;->e(F)Lt0/i;

    move-result-object v2

    invoke-static {v11, v2}, Lwb3/f;->r(Landroidx/compose/ui/Modifier;Li2/a1;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    sget-object v11, Lb2/e;->z:Lb2/m;

    const/4 v13, 0x0

    invoke-static {v11, v13}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v11

    move/from16 v21, v14

    iget-wide v13, v0, Lp1/q;->T:J

    invoke-static {v13, v14}, Ljava/lang/Long;->hashCode(J)I

    move-result v13

    invoke-virtual {v0}, Lp1/q;->m()Lp1/p1;

    move-result-object v14

    invoke-static {v0, v2}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    sget-object v15, La3/l;->a:La3/k;

    invoke-virtual {v15}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v15, La3/k;->b:La3/j;

    invoke-virtual {v0}, Lp1/q;->i0()V

    iget-boolean v8, v0, Lp1/q;->S:Z

    if-eqz v8, :cond_16

    invoke-virtual {v0, v15}, Lp1/q;->l(Lc93/a;)V

    goto :goto_e

    :cond_16
    invoke-virtual {v0}, Lp1/q;->s0()V

    :goto_e
    sget-object v8, La3/k;->g:La3/i;

    invoke-static {v0, v8, v11}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v8, La3/k;->f:La3/i;

    invoke-static {v0, v8, v14}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v8, La3/k;->j:La3/i;

    iget-boolean v11, v0, Lp1/q;->S:Z

    if-nez v11, :cond_17

    invoke-virtual {v0}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v11

    invoke-static {v13}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v14

    invoke-static {v11, v14}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v11

    if-nez v11, :cond_18

    :cond_17
    invoke-static {v13, v0, v13, v8}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_18
    sget-object v8, La3/k;->d:La3/i;

    invoke-static {v0, v8, v2}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v3, v7}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    invoke-static {v12, v2}, Landroidx/compose/foundation/layout/d;->h(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    const/16 v3, 0x10

    int-to-float v3, v3

    const/4 v7, 0x2

    invoke-static {v2, v3, v9, v7}, Landroidx/compose/foundation/layout/a;->r(Landroidx/compose/ui/Modifier;FFI)Landroidx/compose/ui/Modifier;

    move-result-object v2

    and-int/lit16 v3, v5, 0x1c00

    xor-int/lit16 v3, v3, 0xc00

    const/16 v8, 0x800

    move-wide/from16 v14, v29

    if-le v3, v8, :cond_19

    invoke-virtual {v0, v14, v15}, Lp1/q;->f(J)Z

    move-result v3

    if-nez v3, :cond_1a

    :cond_19
    and-int/lit16 v3, v5, 0xc00

    if-ne v3, v8, :cond_1b

    :cond_1a
    const/4 v3, 0x1

    goto :goto_f

    :cond_1b
    const/4 v3, 0x0

    :goto_f
    invoke-virtual {v0}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    if-nez v3, :cond_1d

    if-ne v5, v4, :cond_1c

    goto :goto_10

    :cond_1c
    move-wide/from16 v25, v14

    goto :goto_11

    :cond_1d
    :goto_10
    new-instance v20, Lsl0/j3;

    move/from16 v22, v21

    move-wide/from16 v25, v14

    invoke-direct/range {v20 .. v28}, Lsl0/j3;-><init>(FFLp1/c1;FJLp1/c1;Lp1/c1;)V

    move-object/from16 v5, v20

    invoke-virtual {v0, v5}, Lp1/q;->p0(Ljava/lang/Object;)V

    :goto_11
    check-cast v5, Lkotlin/jvm/functions/Function1;

    const/4 v3, 0x6

    invoke-static {v2, v5, v0, v3}, Lj93/l0;->a(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    const/4 v2, 0x1

    invoke-virtual {v0, v2}, Lp1/q;->q(Z)V

    move v3, v1

    move-object v1, v10

    move-wide/from16 v4, v25

    goto :goto_12

    :cond_1e
    invoke-virtual {v0}, Lp1/q;->X()V

    move-object v1, v4

    move v3, v10

    move-wide v4, v14

    :goto_12
    invoke-virtual {v0}, Lp1/q;->u()Lp1/v1;

    move-result-object v8

    if-eqz v8, :cond_1f

    new-instance v0, Lsl0/k3;

    move/from16 v2, p1

    move/from16 v7, p7

    invoke-direct/range {v0 .. v7}, Lsl0/k3;-><init>(Landroidx/compose/ui/Modifier;ZFJII)V

    iput-object v0, v8, Lp1/v1;->d:Lc93/m;

    :cond_1f
    return-void
.end method

.method private static final d(Lp1/c1;)Ljava/util/List;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp1/c1;",
            ")",
            "Ljava/util/List<",
            "Ljava/lang/Float;",
            ">;"
        }
    .end annotation

    invoke-interface {p0}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/util/List;

    return-object p0
.end method

.method private static final e(FFLp1/c1;FJLp1/c1;Lp1/c1;Lk2/e;)Ll83/a0;
    .locals 21

    move-object/from16 v0, p8

    const-string v1, "$this$Canvas"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {v0}, Lk2/e;->d()J

    move-result-wide v1

    const/16 v12, 0x20

    shr-long/2addr v1, v12

    long-to-int v1, v1

    invoke-static {v1}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v13

    invoke-interface {v0}, Lk2/e;->d()J

    move-result-wide v1

    const-wide v14, 0xffffffffL

    and-long/2addr v1, v14

    long-to-int v1, v1

    invoke-static {v1}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v16

    move/from16 v1, p0

    invoke-interface {v0, v1}, Ly3/c;->q0(F)F

    move-result v1

    move/from16 v2, p1

    invoke-interface {v0, v2}, Ly3/c;->q0(F)F

    move-result v17

    add-float v2, v13, v1

    add-float v18, v17, v1

    div-float v2, v2, v18

    float-to-int v1, v2

    invoke-static/range {p2 .. p2}, Lsl0/l3;->j(Lp1/c1;)I

    move-result v2

    if-eq v1, v2, :cond_0

    move-object/from16 v2, p2

    invoke-static {v2, v1}, Lsl0/l3;->k(Lp1/c1;I)V

    goto :goto_0

    :cond_0
    move-object/from16 v2, p2

    :goto_0
    invoke-static {v2}, Lsl0/l3;->j(Lp1/c1;)I

    move-result v1

    const/4 v3, 0x0

    :goto_1
    if-ge v3, v1, :cond_3

    int-to-float v4, v3

    mul-float v4, v4, v18

    invoke-static/range {p6 .. p6}, Lsl0/l3;->h(Lp1/c1;)F

    move-result v5

    add-float/2addr v4, v5

    invoke-static/range {p7 .. p7}, Lsl0/l3;->d(Lp1/c1;)Ljava/util/List;

    move-result-object v5

    invoke-interface {v5}, Ljava/util/List;->size()I

    move-result v5

    invoke-static {v2}, Lsl0/l3;->j(Lp1/c1;)I

    move-result v6

    sub-int/2addr v5, v6

    add-int/2addr v5, v3

    if-ltz v5, :cond_1

    invoke-static/range {p7 .. p7}, Lsl0/l3;->d(Lp1/c1;)Ljava/util/List;

    move-result-object v6

    invoke-interface {v6}, Ljava/util/List;->size()I

    move-result v6

    if-ge v5, v6, :cond_1

    invoke-static/range {p7 .. p7}, Lsl0/l3;->d(Lp1/c1;)Ljava/util/List;

    move-result-object v6

    invoke-interface {v6, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/Number;

    invoke-virtual {v5}, Ljava/lang/Number;->floatValue()F

    move-result v5

    goto :goto_2

    :cond_1
    move/from16 v5, p3

    :goto_2
    invoke-interface {v0}, Ly3/c;->getDensity()F

    move-result v6

    mul-float/2addr v6, v5

    const/high16 v5, 0x40000000    # 2.0f

    div-float v7, v16, v5

    div-float v5, v6, v5

    sub-float/2addr v7, v5

    add-float v5, v4, v17

    const/4 v8, 0x0

    cmpl-float v5, v5, v8

    if-lez v5, :cond_2

    cmpg-float v5, v4, v13

    if-gez v5, :cond_2

    invoke-static {v4}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v4

    int-to-long v4, v4

    invoke-static {v7}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v7

    int-to-long v7, v7

    shl-long/2addr v4, v12

    and-long/2addr v7, v14

    or-long/2addr v4, v7

    invoke-static/range {v17 .. v17}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v7

    int-to-long v7, v7

    invoke-static {v6}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v6

    int-to-long v9, v6

    shl-long v6, v7, v12

    and-long v8, v9, v14

    or-long/2addr v6, v8

    const/4 v8, 0x2

    int-to-float v8, v8

    invoke-interface {v0, v8}, Ly3/c;->q0(F)F

    move-result v8

    invoke-static {v8}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v9

    int-to-long v9, v9

    invoke-static {v8}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v8

    move/from16 v19, v12

    move/from16 v20, v13

    int-to-long v12, v8

    shl-long v8, v9, v19

    and-long v10, v12, v14

    or-long/2addr v8, v10

    const/4 v10, 0x0

    const/16 v11, 0xf0

    move v12, v3

    move-wide v3, v4

    move-wide v5, v6

    move-wide v7, v8

    const/4 v9, 0x0

    move v13, v12

    move v12, v1

    move-wide/from16 v1, p4

    invoke-static/range {v0 .. v11}, Lk2/e;->D(Lk2/e;JJJJLk2/f;FI)V

    goto :goto_3

    :cond_2
    move/from16 v19, v12

    move/from16 v20, v13

    move v12, v1

    move v13, v3

    :goto_3
    add-int/lit8 v3, v13, 0x1

    move-object/from16 v2, p2

    move-object/from16 v0, p8

    move v1, v12

    move/from16 v12, v19

    move/from16 v13, v20

    goto/16 :goto_1

    :cond_3
    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method

.method private static final f(Landroidx/compose/ui/Modifier;ZFJIILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 8

    or-int/lit8 p5, p5, 0x1

    invoke-static {p5}, Lp1/x;->L(I)I

    move-result v6

    move-object v0, p0

    move v1, p1

    move v2, p2

    move-wide v3, p3

    move v7, p6

    move-object v5, p7

    invoke-static/range {v0 .. v7}, Lsl0/l3;->c(Landroidx/compose/ui/Modifier;ZFJLandroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final g(Lp1/c1;Ljava/util/List;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp1/c1;",
            "Ljava/util/List<",
            "Ljava/lang/Float;",
            ">;)V"
        }
    .end annotation

    invoke-interface {p0, p1}, Lp1/c1;->setValue(Ljava/lang/Object;)V

    return-void
.end method

.method private static final h(Lp1/c1;)F
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp1/c1;",
            ")F"
        }
    .end annotation

    invoke-interface {p0}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Number;

    invoke-virtual {p0}, Ljava/lang/Number;->floatValue()F

    move-result p0

    return p0
.end method

.method private static final i(Lp1/c1;F)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp1/c1;",
            "F)V"
        }
    .end annotation

    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p1

    invoke-interface {p0, p1}, Lp1/c1;->setValue(Ljava/lang/Object;)V

    return-void
.end method

.method private static final j(Lp1/c1;)I
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp1/c1;",
            ")I"
        }
    .end annotation

    invoke-interface {p0}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Number;

    invoke-virtual {p0}, Ljava/lang/Number;->intValue()I

    move-result p0

    return p0
.end method

.method private static final k(Lp1/c1;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp1/c1;",
            "I)V"
        }
    .end annotation

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-interface {p0, p1}, Lp1/c1;->setValue(Ljava/lang/Object;)V

    return-void
.end method

.method private static final l(Lp1/t2;)F
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp1/t2;",
            ")F"
        }
    .end annotation

    invoke-interface {p0}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Number;

    invoke-virtual {p0}, Ljava/lang/Number;->floatValue()F

    move-result p0

    return p0
.end method

.method public static final synthetic m(Lp1/c1;)Ljava/util/List;
    .locals 0

    invoke-static {p0}, Lsl0/l3;->d(Lp1/c1;)Ljava/util/List;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic n(Lp1/c1;Ljava/util/List;)V
    .locals 0

    invoke-static {p0, p1}, Lsl0/l3;->g(Lp1/c1;Ljava/util/List;)V

    return-void
.end method

.method public static final synthetic o(Lp1/c1;F)V
    .locals 0

    invoke-static {p0, p1}, Lsl0/l3;->i(Lp1/c1;F)V

    return-void
.end method

.method public static final synthetic p(Lp1/c1;)I
    .locals 0

    invoke-static {p0}, Lsl0/l3;->j(Lp1/c1;)I

    move-result p0

    return p0
.end method

.method public static final synthetic q(Lp1/t2;)F
    .locals 0

    invoke-static {p0}, Lsl0/l3;->l(Lp1/t2;)F

    move-result p0

    return p0
.end method
