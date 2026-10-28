.class public abstract Lg1/v7;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0x14

    invoke-static {v0}, Lv63/c;->h(I)J

    return-void
.end method

.method public static final a(ZLc93/a;Landroidx/compose/ui/Modifier;ZJJLx1/b;Landroidx/compose/runtime/Composer;I)V
    .locals 18

    move-object/from16 v6, p9

    check-cast v6, Lp1/q;

    const v0, -0x6e25354c

    invoke-virtual {v6, v0}, Lp1/q;->g0(I)Lp1/q;

    move/from16 v8, p0

    invoke-virtual {v6, v8}, Lp1/q;->h(Z)Z

    move-result v0

    const/4 v1, 0x2

    if-eqz v0, :cond_0

    const/4 v0, 0x4

    goto :goto_0

    :cond_0
    move v0, v1

    :goto_0
    or-int v0, p10, v0

    move-object/from16 v9, p1

    invoke-virtual {v6, v9}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1

    const/16 v2, 0x20

    goto :goto_1

    :cond_1
    const/16 v2, 0x10

    :goto_1
    or-int/2addr v0, v2

    const v2, 0x96d80

    or-int/2addr v0, v2

    const v2, 0x492493

    and-int/2addr v2, v0

    const v3, 0x492492

    const/4 v4, 0x1

    if-eq v2, v3, :cond_2

    move v2, v4

    goto :goto_2

    :cond_2
    const/4 v2, 0x0

    :goto_2
    and-int/lit8 v3, v0, 0x1

    invoke-virtual {v6, v3, v2}, Lp1/q;->U(IZ)Z

    move-result v2

    if-eqz v2, :cond_7

    invoke-virtual {v6}, Lp1/q;->Z()V

    and-int/lit8 v2, p10, 0x1

    const v3, -0x3f0001

    if-eqz v2, :cond_4

    invoke-virtual {v6}, Lp1/q;->C()Z

    move-result v2

    if-eqz v2, :cond_3

    goto :goto_3

    :cond_3
    invoke-virtual {v6}, Lp1/q;->X()V

    and-int/2addr v0, v3

    move-object/from16 v2, p2

    move/from16 v11, p3

    move-wide/from16 v14, p4

    move-wide/from16 v16, p6

    goto :goto_6

    :cond_4
    :goto_3
    sget-object v2, Lg1/l1;->a:Lp1/b0;

    invoke-virtual {v6, v2}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Li2/x;

    iget-wide v10, v5, Li2/x;->a:J

    invoke-virtual {v6, v2}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Li2/x;

    iget-wide v12, v2, Li2/x;->a:J

    sget-object v2, Lg1/d1;->a:Lp1/u2;

    invoke-virtual {v6, v2}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lg1/c1;

    invoke-virtual {v2}, Lg1/c1;->i()Z

    move-result v2

    const-wide/high16 v14, 0x3fe0000000000000L    # 0.5

    if-eqz v2, :cond_5

    invoke-static {v12, v13}, Li2/w0;->x(J)F

    move-result v2

    float-to-double v12, v2

    cmpl-double v2, v12, v14

    if-lez v2, :cond_6

    goto :goto_4

    :cond_5
    invoke-static {v12, v13}, Li2/w0;->x(J)F

    move-result v2

    float-to-double v12, v2

    cmpg-double v2, v12, v14

    if-gez v2, :cond_6

    :goto_4
    const v2, 0x3f3d70a4    # 0.74f

    goto :goto_5

    :cond_6
    const v2, 0x3f19999a    # 0.6f

    :goto_5
    invoke-static {v2, v10, v11}, Li2/x;->c(FJ)J

    move-result-wide v12

    and-int/2addr v0, v3

    sget-object v2, Lb2/t;->w:Lb2/t;

    move-wide v14, v10

    move-wide/from16 v16, v12

    move v11, v4

    :goto_6
    invoke-virtual {v6}, Lp1/q;->r()V

    const/4 v3, 0x0

    invoke-static {v14, v15, v1, v4, v3}, Lg1/z4;->a(JIZF)Landroidx/compose/material/d;

    move-result-object v10

    new-instance v7, Lg1/u7;

    move-object/from16 v13, p8

    move-object v12, v9

    move v9, v8

    move-object v8, v2

    invoke-direct/range {v7 .. v13}, Lg1/u7;-><init>(Landroidx/compose/ui/Modifier;ZLandroidx/compose/material/d;ZLc93/a;Lx1/b;)V

    const v1, -0x26e2de88

    invoke-static {v1, v6, v7}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v5

    shl-int/lit8 v0, v0, 0x6

    and-int/lit16 v0, v0, 0x380

    const/16 v1, 0xc00

    or-int v7, v1, v0

    move/from16 v4, p0

    move-wide v0, v14

    move-wide/from16 v2, v16

    invoke-static/range {v0 .. v7}, Lg1/v7;->b(JJZLx1/b;Landroidx/compose/runtime/Composer;I)V

    move-wide v12, v0

    move-wide v14, v2

    move-object v10, v8

    goto :goto_7

    :cond_7
    invoke-virtual {v6}, Lp1/q;->X()V

    move-object/from16 v10, p2

    move/from16 v11, p3

    move-wide/from16 v12, p4

    move-wide/from16 v14, p6

    :goto_7
    invoke-virtual {v6}, Lp1/q;->u()Lp1/v1;

    move-result-object v0

    if-eqz v0, :cond_8

    new-instance v7, Lg1/s7;

    move/from16 v8, p0

    move-object/from16 v9, p1

    move-object/from16 v16, p8

    move/from16 v17, p10

    invoke-direct/range {v7 .. v17}, Lg1/s7;-><init>(ZLc93/a;Landroidx/compose/ui/Modifier;ZJJLx1/b;I)V

    iput-object v7, v0, Lp1/v1;->d:Lc93/m;

    :cond_8
    return-void
.end method

.method public static final b(JJZLx1/b;Landroidx/compose/runtime/Composer;I)V
    .locals 18

    move-object/from16 v6, p5

    move/from16 v7, p7

    move-object/from16 v13, p6

    check-cast v13, Lp1/q;

    const v0, -0x6dc56680

    invoke-virtual {v13, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, v7, 0x6

    const/4 v1, 0x2

    move-wide/from16 v2, p0

    if-nez v0, :cond_1

    invoke-virtual {v13, v2, v3}, Lp1/q;->f(J)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x4

    goto :goto_0

    :cond_0
    move v0, v1

    :goto_0
    or-int/2addr v0, v7

    goto :goto_1

    :cond_1
    move v0, v7

    :goto_1
    and-int/lit8 v4, v7, 0x30

    if-nez v4, :cond_3

    move-wide/from16 v4, p2

    invoke-virtual {v13, v4, v5}, Lp1/q;->f(J)Z

    move-result v8

    if-eqz v8, :cond_2

    const/16 v8, 0x20

    goto :goto_2

    :cond_2
    const/16 v8, 0x10

    :goto_2
    or-int/2addr v0, v8

    goto :goto_3

    :cond_3
    move-wide/from16 v4, p2

    :goto_3
    and-int/lit16 v8, v7, 0x180

    move/from16 v15, p4

    if-nez v8, :cond_5

    invoke-virtual {v13, v15}, Lp1/q;->h(Z)Z

    move-result v8

    if-eqz v8, :cond_4

    const/16 v8, 0x100

    goto :goto_4

    :cond_4
    const/16 v8, 0x80

    :goto_4
    or-int/2addr v0, v8

    :cond_5
    and-int/lit16 v8, v7, 0xc00

    if-nez v8, :cond_7

    invoke-virtual {v13, v6}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_6

    const/16 v8, 0x800

    goto :goto_5

    :cond_6
    const/16 v8, 0x400

    :goto_5
    or-int/2addr v0, v8

    :cond_7
    and-int/lit16 v8, v0, 0x493

    const/16 v9, 0x492

    const/4 v10, 0x0

    if-eq v8, v9, :cond_8

    const/4 v8, 0x1

    goto :goto_6

    :cond_8
    move v8, v10

    :goto_6
    and-int/lit8 v9, v0, 0x1

    invoke-virtual {v13, v9, v8}, Lp1/q;->U(IZ)Z

    move-result v8

    if-eqz v8, :cond_f

    invoke-static {v15}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v8

    shr-int/lit8 v0, v0, 0x6

    and-int/lit8 v9, v0, 0xe

    const/4 v11, 0x0

    invoke-static {v8, v11, v13, v9, v1}, Ld0/d2;->f(Ljava/lang/Object;Ljava/lang/String;Landroidx/compose/runtime/Composer;II)Ld0/z1;

    move-result-object v8

    iget-object v9, v8, Ld0/z1;->d:Lp1/k1;

    invoke-virtual {v9}, Lp1/k1;->getValue()Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Ljava/lang/Boolean;

    invoke-virtual {v11}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v11

    const v12, 0x5634b83

    invoke-virtual {v13, v12}, Lp1/q;->e0(I)V

    if-eqz v11, :cond_9

    move-wide/from16 v16, v2

    goto :goto_7

    :cond_9
    move-wide/from16 v16, v4

    :goto_7
    invoke-virtual {v13, v10}, Lp1/q;->q(Z)V

    invoke-static/range {v16 .. v17}, Li2/x;->g(J)Lj2/c;

    move-result-object v11

    invoke-virtual {v13, v11}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v14

    invoke-virtual {v13}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    if-nez v14, :cond_a

    sget-object v14, Lp1/l;->a:Lp1/v0;

    if-ne v1, v14, :cond_b

    :cond_a
    sget-object v1, Lc0/d;->z:Lc0/d;

    new-instance v14, La3/m1;

    const/16 v10, 0x9

    invoke-direct {v14, v11, v10}, La3/m1;-><init>(Ljava/lang/Object;I)V

    new-instance v10, Ld0/f2;

    invoke-direct {v10, v1, v14}, Ld0/f2;-><init>(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)V

    invoke-virtual {v13, v10}, Lp1/q;->p0(Ljava/lang/Object;)V

    move-object v1, v10

    :cond_b
    check-cast v1, Ld0/f2;

    iget-object v10, v8, Ld0/z1;->a:Lal/a;

    invoke-virtual {v10}, Lal/a;->y0()Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Ljava/lang/Boolean;

    invoke-virtual {v10}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v10

    invoke-virtual {v13, v12}, Lp1/q;->e0(I)V

    if-eqz v10, :cond_c

    move-wide v10, v2

    :goto_8
    const/4 v14, 0x0

    goto :goto_9

    :cond_c
    move-wide v10, v4

    goto :goto_8

    :goto_9
    invoke-static {v13, v14, v10, v11}, Ldc/b;->h(Lp1/q;ZJ)Li2/x;

    move-result-object v10

    invoke-virtual {v9}, Lp1/k1;->getValue()Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Ljava/lang/Boolean;

    invoke-virtual {v9}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v9

    invoke-virtual {v13, v12}, Lp1/q;->e0(I)V

    if-eqz v9, :cond_d

    move-wide v11, v2

    goto :goto_a

    :cond_d
    move-wide v11, v4

    :goto_a
    invoke-static {v13, v14, v11, v12}, Ldc/b;->h(Lp1/q;ZJ)Li2/x;

    move-result-object v9

    invoke-virtual {v8}, Ld0/z1;->f()Ld0/t1;

    move-result-object v11

    const v12, 0x11bcbe97

    invoke-virtual {v13, v12}, Lp1/q;->e0(I)V

    sget-object v12, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    sget-object v14, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-interface {v11, v12, v14}, Ld0/t1;->d(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v11

    const/16 v12, 0x64

    if-eqz v11, :cond_e

    sget-object v11, Ld0/b0;->c:Lb23/h;

    new-instance v14, Ld0/e2;

    move/from16 v17, v0

    const/16 v0, 0x96

    invoke-direct {v14, v0, v12, v11}, Ld0/e2;-><init>(IILd0/z;)V

    move-object v11, v14

    const/4 v14, 0x0

    goto :goto_b

    :cond_e
    move/from16 v17, v0

    sget-object v0, Ld0/b0;->c:Lb23/h;

    const/4 v11, 0x2

    const/4 v14, 0x0

    invoke-static {v12, v14, v0, v11}, Ld0/f;->v(IILd0/z;I)Ld0/e2;

    move-result-object v0

    move-object v11, v0

    :goto_b
    invoke-virtual {v13, v14}, Lp1/q;->q(Z)V

    const/4 v14, 0x0

    move-object v12, v10

    move-object v10, v9

    move-object v9, v12

    move-object v12, v1

    invoke-static/range {v8 .. v14}, Ld0/d2;->d(Ld0/z1;Ljava/lang/Object;Ljava/lang/Object;Ld0/c0;Ld0/f2;Landroidx/compose/runtime/Composer;I)Ld0/v1;

    move-result-object v0

    sget-object v1, Lg1/l1;->a:Lp1/b0;

    iget-object v8, v0, Ld0/v1;->J:Lp1/k1;

    invoke-virtual {v8}, Lp1/k1;->getValue()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Li2/x;

    iget-wide v8, v8, Li2/x;->a:J

    const/high16 v10, 0x3f800000    # 1.0f

    invoke-static {v10, v8, v9}, Li2/x;->c(FJ)J

    move-result-wide v8

    new-instance v10, Li2/x;

    invoke-direct {v10, v8, v9}, Li2/x;-><init>(J)V

    invoke-virtual {v1, v10}, Lp1/b0;->a(Ljava/lang/Object;)Lp1/u1;

    move-result-object v1

    sget-object v8, Lg1/j1;->a:Lp1/b0;

    iget-object v0, v0, Ld0/v1;->J:Lp1/k1;

    invoke-virtual {v0}, Lp1/k1;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Li2/x;

    iget-wide v9, v0, Li2/x;->a:J

    invoke-static {v9, v10}, Li2/x;->e(J)F

    move-result v0

    invoke-static {v0}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v0

    invoke-virtual {v8, v0}, Lp1/b0;->a(Ljava/lang/Object;)Lp1/u1;

    move-result-object v0

    filled-new-array {v1, v0}, [Lp1/u1;

    move-result-object v0

    and-int/lit8 v1, v17, 0x70

    const/16 v8, 0x8

    or-int/2addr v1, v8

    invoke-static {v0, v6, v13, v1}, Lp1/x;->b([Lp1/u1;Lc93/m;Landroidx/compose/runtime/Composer;I)V

    goto :goto_c

    :cond_f
    invoke-virtual {v13}, Lp1/q;->X()V

    :goto_c
    invoke-virtual {v13}, Lp1/q;->u()Lp1/v1;

    move-result-object v8

    if-eqz v8, :cond_10

    new-instance v0, Lg1/t7;

    move-wide v1, v2

    move-wide v3, v4

    move v5, v15

    invoke-direct/range {v0 .. v7}, Lg1/t7;-><init>(JJZLx1/b;I)V

    iput-object v0, v8, Lp1/v1;->d:Lc93/m;

    :cond_10
    return-void
.end method
