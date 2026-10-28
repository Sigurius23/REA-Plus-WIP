.class public abstract Lxy0/b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u001a\'\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0002H\u0007\u00a2\u0006\u0004\u0008\u0006\u0010\u0007\u00a8\u0006\u0008"
    }
    d2 = {
        "Ly3/f;",
        "radius",
        "",
        "startPercent",
        "endPercent",
        "Ll83/a0;",
        "c",
        "(FFFLandroidx/compose/runtime/Composer;I)V",
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
.method public static synthetic a(FFFILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p5}, Lxy0/b;->e(FFFILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(FFJFJFFFFLk2/e;)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p11}, Lxy0/b;->d(FFJFJFFFFLk2/e;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final c(FFFLandroidx/compose/runtime/Composer;I)V
    .locals 21

    move/from16 v1, p0

    move/from16 v2, p1

    move/from16 v3, p2

    move/from16 v0, p4

    move-object/from16 v14, p3

    check-cast v14, Lp1/q;

    const v4, -0x34ce3bd3    # -1.1650093E7f

    invoke-virtual {v14, v4}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v4, v0, 0x6

    const/4 v5, 0x2

    const/4 v6, 0x4

    if-nez v4, :cond_1

    invoke-virtual {v14, v1}, Lp1/q;->d(F)Z

    move-result v4

    if-eqz v4, :cond_0

    move v4, v6

    goto :goto_0

    :cond_0
    move v4, v5

    :goto_0
    or-int/2addr v4, v0

    goto :goto_1

    :cond_1
    move v4, v0

    :goto_1
    and-int/lit8 v7, v0, 0x30

    if-nez v7, :cond_3

    invoke-virtual {v14, v2}, Lp1/q;->d(F)Z

    move-result v7

    if-eqz v7, :cond_2

    const/16 v7, 0x20

    goto :goto_2

    :cond_2
    const/16 v7, 0x10

    :goto_2
    or-int/2addr v4, v7

    :cond_3
    and-int/lit16 v7, v0, 0x180

    if-nez v7, :cond_5

    invoke-virtual {v14, v3}, Lp1/q;->d(F)Z

    move-result v7

    if-eqz v7, :cond_4

    const/16 v7, 0x100

    goto :goto_3

    :cond_4
    const/16 v7, 0x80

    :goto_3
    or-int/2addr v4, v7

    :cond_5
    and-int/lit16 v7, v4, 0x93

    const/16 v10, 0x92

    if-eq v7, v10, :cond_6

    const/4 v7, 0x1

    goto :goto_4

    :cond_6
    const/4 v7, 0x0

    :goto_4
    and-int/lit8 v10, v4, 0x1

    invoke-virtual {v14, v10, v7}, Lp1/q;->U(IZ)Z

    move-result v7

    if-eqz v7, :cond_b

    sub-float v7, v3, v2

    int-to-float v5, v5

    div-float v10, v7, v5

    add-float/2addr v10, v2

    sget-object v12, Lx81/d;->a:Lx81/d;

    const/4 v13, 0x6

    invoke-virtual {v12, v14, v13}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v16

    move/from16 v17, v10

    invoke-virtual/range {v16 .. v16}, Ly81/i;->y()J

    move-result-wide v9

    const/4 v11, 0x0

    invoke-static {v12, v14, v13, v11}, Lev/n;->f(Lx81/d;Lp1/q;IF)J

    move-result-wide v11

    sget-object v13, Lb3/v1;->h:Lp1/u2;

    invoke-virtual {v14, v13}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v18

    move-object/from16 v15, v18

    check-cast v15, Ly3/c;

    int-to-float v6, v6

    invoke-interface {v15, v6}, Ly3/c;->q0(F)F

    move-result v6

    invoke-virtual {v14, v13}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v15

    check-cast v15, Ly3/c;

    invoke-interface {v15, v5}, Ly3/c;->q0(F)F

    move-result v15

    invoke-virtual {v14, v13}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v13

    check-cast v13, Ly3/c;

    invoke-interface {v13, v5}, Ly3/c;->q0(F)F

    move-result v13

    sget-object v8, Lb2/t;->w:Lb2/t;

    mul-float v0, v1, v5

    invoke-static {v0, v8}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    mul-float/2addr v5, v5

    invoke-static {v5, v0}, Landroidx/compose/foundation/layout/a;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    and-int/lit8 v5, v4, 0x70

    const/16 v8, 0x20

    if-ne v5, v8, :cond_7

    const/4 v5, 0x1

    goto :goto_5

    :cond_7
    const/4 v5, 0x0

    :goto_5
    invoke-virtual {v14, v7}, Lp1/q;->d(F)Z

    move-result v8

    or-int/2addr v5, v8

    invoke-virtual {v14, v11, v12}, Lp1/q;->f(J)Z

    move-result v8

    or-int/2addr v5, v8

    move/from16 v8, v17

    invoke-virtual {v14, v8}, Lp1/q;->d(F)Z

    move-result v17

    or-int v5, v5, v17

    invoke-virtual {v14, v9, v10}, Lp1/q;->f(J)Z

    move-result v17

    or-int v5, v5, v17

    and-int/lit16 v4, v4, 0x380

    const/16 v1, 0x100

    if-ne v4, v1, :cond_8

    const/16 v16, 0x1

    goto :goto_6

    :cond_8
    const/16 v16, 0x0

    :goto_6
    or-int v1, v5, v16

    invoke-virtual {v14, v13}, Lp1/q;->d(F)Z

    move-result v4

    or-int/2addr v1, v4

    invoke-virtual {v14, v6}, Lp1/q;->d(F)Z

    move-result v4

    or-int/2addr v1, v4

    invoke-virtual {v14, v15}, Lp1/q;->d(F)Z

    move-result v4

    or-int/2addr v1, v4

    invoke-virtual {v14}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    if-nez v1, :cond_9

    sget-object v1, Lp1/l;->a:Lp1/v0;

    if-ne v4, v1, :cond_a

    :cond_9
    new-instance v2, Lxy0/a;

    move-wide/from16 v19, v11

    move v12, v6

    move-wide/from16 v5, v19

    move v4, v7

    move v7, v8

    move-wide v8, v9

    move v11, v13

    move v13, v15

    move v10, v3

    move/from16 v3, p1

    invoke-direct/range {v2 .. v13}, Lxy0/a;-><init>(FFJFJFFFF)V

    invoke-virtual {v14, v2}, Lp1/q;->p0(Ljava/lang/Object;)V

    move-object v4, v2

    :cond_a
    check-cast v4, Lkotlin/jvm/functions/Function1;

    const/4 v1, 0x0

    invoke-static {v0, v4, v14, v1}, Lj93/l0;->a(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    goto :goto_7

    :cond_b
    invoke-virtual {v14}, Lp1/q;->X()V

    :goto_7
    invoke-virtual {v14}, Lp1/q;->u()Lp1/v1;

    move-result-object v6

    if-eqz v6, :cond_c

    new-instance v0, Lb21/c;

    const/4 v5, 0x1

    move/from16 v1, p0

    move/from16 v2, p1

    move/from16 v3, p2

    move/from16 v4, p4

    invoke-direct/range {v0 .. v5}, Lb21/c;-><init>(FFFII)V

    iput-object v0, v6, Lp1/v1;->d:Lc93/m;

    :cond_c
    return-void
.end method

.method private static final d(FFJFJFFFFLk2/e;)Ll83/a0;
    .locals 19

    move-wide/from16 v0, p2

    const-string v2, "$this$Canvas"

    move-object/from16 v3, p11

    invoke-static {v3, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {v3}, Lk2/e;->B0()J

    move-result-wide v4

    invoke-interface {v3}, Lk2/e;->t0()La3/p;

    move-result-object v2

    invoke-virtual {v2}, La3/p;->A()J

    move-result-wide v6

    invoke-virtual {v2}, La3/p;->w()Li2/v;

    move-result-object v8

    invoke-interface {v8}, Li2/v;->q()V

    :try_start_0
    iget-object v8, v2, La3/p;->x:Ljava/lang/Object;

    check-cast v8, Laj/d;

    const/high16 v9, -0x3d4c0000    # -90.0f

    invoke-virtual {v8, v9, v4, v5}, Laj/d;->v(FJ)V

    const/high16 v4, 0x43b40000    # 360.0f

    mul-float v5, p0, v4

    mul-float v4, v4, p1

    sget-object v8, Li2/t;->b:Li2/s;

    invoke-static/range {p0 .. p0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v9

    new-instance v10, Li2/x;

    invoke-direct {v10, v0, v1}, Li2/x;-><init>(J)V

    new-instance v11, Ll83/k;

    invoke-direct {v11, v9, v10}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static/range {p4 .. p4}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v9

    new-instance v10, Li2/x;

    move-wide/from16 v12, p5

    invoke-direct {v10, v12, v13}, Li2/x;-><init>(J)V

    new-instance v12, Ll83/k;

    invoke-direct {v12, v9, v10}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    invoke-static/range {p7 .. p7}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v9

    new-instance v10, Li2/x;

    invoke-direct {v10, v0, v1}, Li2/x;-><init>(J)V

    new-instance v0, Ll83/k;

    invoke-direct {v0, v9, v10}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    filled-new-array {v11, v12, v0}, [Ll83/k;

    move-result-object v0

    invoke-static {v8, v0}, Li2/s;->j(Li2/s;[Ll83/k;)Li2/d1;

    move-result-object v0

    new-instance v12, Lk2/i;

    const/4 v1, 0x2

    new-array v1, v1, [F

    const/4 v8, 0x0

    aput p9, v1, v8

    const/4 v8, 0x1

    aput p10, v1, v8

    new-instance v8, Li2/k;

    new-instance v9, Landroid/graphics/DashPathEffect;

    const/4 v10, 0x0

    invoke-direct {v9, v1, v10}, Landroid/graphics/DashPathEffect;-><init>([FF)V

    invoke-direct {v8, v9}, Li2/k;-><init>(Landroid/graphics/PathEffect;)V

    const/16 v1, 0xe

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    move/from16 p1, p8

    move/from16 p6, v1

    move-object/from16 p5, v8

    move/from16 p2, v9

    move/from16 p3, v10

    move/from16 p4, v11

    move-object/from16 p0, v12

    invoke-direct/range {p0 .. p6}, Lk2/i;-><init>(FFIILi2/t0;I)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    const/4 v13, 0x0

    const/16 v14, 0x370

    move-wide v8, v6

    const/4 v7, 0x0

    move-wide v10, v8

    const-wide/16 v8, 0x0

    move-wide v15, v10

    const-wide/16 v10, 0x0

    move v6, v4

    move-wide/from16 v17, v15

    move-object v4, v0

    :try_start_1
    invoke-static/range {v3 .. v14}, Lk2/e;->X(Lk2/e;Li2/t;FFZJJLk2/i;II)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    move-wide/from16 v8, v17

    invoke-static {v2, v8, v9}, Ld;->z(La3/p;J)V

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0

    :catchall_0
    move-exception v0

    move-wide/from16 v8, v17

    goto :goto_0

    :catchall_1
    move-exception v0

    move-wide v8, v6

    :goto_0
    invoke-static {v2, v8, v9}, Ld;->z(La3/p;J)V

    throw v0
.end method

.method private static final e(FFFILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p3, p3, 0x1

    invoke-static {p3}, Lp1/x;->L(I)I

    move-result p3

    invoke-static {p0, p1, p2, p4, p3}, Lxy0/b;->c(FFFLandroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method
