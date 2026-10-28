.class public abstract Lb30/g3;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:F


# direct methods
.method static constructor <clinit>()V
    .locals 1

    const/16 v0, 0x38

    int-to-float v0, v0

    sput v0, Lb30/g3;->a:F

    return-void
.end method

.method public static final a(IZJLc93/a;Landroidx/compose/runtime/Composer;I)V
    .locals 19

    move-object/from16 v4, p5

    check-cast v4, Lp1/q;

    const v0, -0x2117e88b

    invoke-virtual {v4, v0}, Lp1/q;->g0(I)Lp1/q;

    move/from16 v6, p0

    invoke-virtual {v4, v6}, Lp1/q;->e(I)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x4

    goto :goto_0

    :cond_0
    const/4 v0, 0x2

    :goto_0
    or-int v0, p6, v0

    move/from16 v2, p1

    invoke-virtual {v4, v2}, Lp1/q;->h(Z)Z

    move-result v1

    if-eqz v1, :cond_1

    const/16 v1, 0x20

    goto :goto_1

    :cond_1
    const/16 v1, 0x10

    :goto_1
    or-int/2addr v0, v1

    move-wide/from16 v7, p2

    invoke-virtual {v4, v7, v8}, Lp1/q;->f(J)Z

    move-result v1

    if-eqz v1, :cond_2

    const/16 v1, 0x100

    goto :goto_2

    :cond_2
    const/16 v1, 0x80

    :goto_2
    or-int/2addr v0, v1

    move-object/from16 v1, p4

    invoke-virtual {v4, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_3

    const/16 v3, 0x800

    goto :goto_3

    :cond_3
    const/16 v3, 0x400

    :goto_3
    or-int/2addr v0, v3

    and-int/lit16 v3, v0, 0x493

    const/16 v5, 0x492

    if-ne v3, v5, :cond_5

    invoke-virtual {v4}, Lp1/q;->F()Z

    move-result v3

    if-nez v3, :cond_4

    goto :goto_4

    :cond_4
    invoke-virtual {v4}, Lp1/q;->X()V

    goto/16 :goto_8

    :cond_5
    :goto_4
    sget-object v3, Landroidx/compose/ui/platform/AndroidCompositionLocals_androidKt;->b:Lp1/u2;

    invoke-virtual {v4, v3}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroid/content/Context;

    sget-object v5, Lb3/v1;->h:Lp1/u2;

    invoke-virtual {v4, v5}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ly3/c;

    invoke-static {v4}, Ld40/r;->m(Landroidx/compose/runtime/Composer;)Ld40/s;

    move-result-object v9

    const v10, -0x4bd90f3c

    invoke-virtual {v4, v10}, Lp1/q;->e0(I)V

    invoke-virtual {v4, v9}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v10

    invoke-virtual {v4}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v11

    sget-object v12, Lp1/l;->a:Lp1/v0;

    if-nez v10, :cond_6

    if-ne v11, v12, :cond_9

    :cond_6
    iget-object v10, v9, Ld40/s;->k:Ljava/lang/Integer;

    if-eqz v10, :cond_8

    invoke-virtual {v10}, Ljava/lang/Number;->intValue()I

    move-result v10

    invoke-static {v3, v10}, Lu4/k;->b(Landroid/content/Context;I)Landroid/graphics/Typeface;

    move-result-object v3

    if-nez v3, :cond_7

    goto :goto_6

    :cond_7
    :goto_5
    move-object v11, v3

    goto :goto_7

    :cond_8
    :goto_6
    sget-object v3, Landroid/graphics/Typeface;->DEFAULT:Landroid/graphics/Typeface;

    goto :goto_5

    :goto_7
    invoke-virtual {v4, v11}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_9
    check-cast v11, Landroid/graphics/Typeface;

    const/4 v3, 0x0

    invoke-virtual {v4, v3}, Lp1/q;->q(Z)V

    const v10, -0x4bd8f91f

    invoke-virtual {v4, v10}, Lp1/q;->e0(I)V

    invoke-virtual {v4, v9}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v10

    invoke-virtual {v4}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v13

    if-nez v10, :cond_a

    if-ne v13, v12, :cond_b

    :cond_a
    sget-object v10, Ld40/q;->d:Ld40/s;

    iget-wide v12, v10, Ld40/s;->g:J

    invoke-static {v12, v13}, Ly3/o;->c(J)F

    move-result v10

    iget v9, v9, Ld40/s;->d:F

    mul-float/2addr v10, v9

    invoke-interface {v5, v10}, Ly3/c;->h(F)J

    move-result-wide v9

    new-instance v13, Ly3/o;

    invoke-direct {v13, v9, v10}, Ly3/o;-><init>(J)V

    invoke-virtual {v4, v13}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_b
    check-cast v13, Ly3/o;

    iget-wide v9, v13, Ly3/o;->a:J

    invoke-virtual {v4, v3}, Lp1/q;->q(Z)V

    sget-object v3, Lb2/t;->w:Lb2/t;

    const-string v5, "PaymentSheetEditButton"

    invoke-static {v3, v5}, Landroidx/compose/ui/platform/a;->a(Landroidx/compose/ui/Modifier;Ljava/lang/String;)Landroidx/compose/ui/Modifier;

    move-result-object v12

    const/16 v3, 0xa

    int-to-float v15, v3

    const/16 v16, 0x0

    const/16 v17, 0xb

    const/4 v13, 0x0

    const/4 v14, 0x0

    invoke-static/range {v12 .. v17}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v3

    new-instance v5, Lb30/b3;

    invoke-direct/range {v5 .. v11}, Lb30/b3;-><init>(IJJLandroid/graphics/Typeface;)V

    const v6, 0x763be611

    invoke-static {v6, v4, v5}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v5

    shr-int/lit8 v6, v0, 0x9

    and-int/lit8 v6, v6, 0xe

    or-int/lit16 v6, v6, 0x6030

    shl-int/lit8 v0, v0, 0x3

    and-int/lit16 v0, v0, 0x380

    or-int/2addr v0, v6

    const/16 v6, 0x8

    move-object/from16 v18, v5

    move v5, v0

    move-object v0, v1

    move-object v1, v3

    move-object/from16 v3, v18

    invoke-static/range {v0 .. v6}, Lg1/d3;->a(Lc93/a;Landroidx/compose/ui/Modifier;ZLc93/m;Landroidx/compose/runtime/Composer;II)V

    :goto_8
    invoke-virtual {v4}, Lp1/q;->u()Lp1/v1;

    move-result-object v0

    if-eqz v0, :cond_c

    new-instance v5, Lb30/a3;

    move/from16 v6, p0

    move/from16 v7, p1

    move-wide/from16 v8, p2

    move-object/from16 v10, p4

    move/from16 v11, p6

    invoke-direct/range {v5 .. v11}, Lb30/a3;-><init>(IZJLc93/a;I)V

    iput-object v5, v0, Lp1/v1;->d:Lc93/m;

    :cond_c
    return-void
.end method

.method public static final b(FILandroidx/compose/runtime/Composer;Lb30/j3;Lc93/a;ZZ)V
    .locals 21

    move/from16 v6, p1

    move-object/from16 v1, p3

    move-object/from16 v9, p4

    move/from16 v10, p6

    const-string v0, "state"

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onNavigationIconPressed"

    invoke-static {v9, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v0, p2

    check-cast v0, Lp1/q;

    const v2, 0x5e5e41f0

    invoke-virtual {v0, v2}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v2, v6, 0x6

    if-nez v2, :cond_1

    invoke-virtual {v0, v1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    const/4 v2, 0x4

    goto :goto_0

    :cond_0
    const/4 v2, 0x2

    :goto_0
    or-int/2addr v2, v6

    goto :goto_1

    :cond_1
    move v2, v6

    :goto_1
    and-int/lit8 v3, v6, 0x30

    move/from16 v11, p5

    if-nez v3, :cond_3

    invoke-virtual {v0, v11}, Lp1/q;->h(Z)Z

    move-result v3

    if-eqz v3, :cond_2

    const/16 v3, 0x20

    goto :goto_2

    :cond_2
    const/16 v3, 0x10

    :goto_2
    or-int/2addr v2, v3

    :cond_3
    and-int/lit16 v3, v6, 0x180

    if-nez v3, :cond_5

    invoke-virtual {v0, v10}, Lp1/q;->h(Z)Z

    move-result v3

    if-eqz v3, :cond_4

    const/16 v3, 0x100

    goto :goto_3

    :cond_4
    const/16 v3, 0x80

    :goto_3
    or-int/2addr v2, v3

    :cond_5
    and-int/lit16 v3, v6, 0xc00

    move/from16 v15, p0

    if-nez v3, :cond_7

    invoke-virtual {v0, v15}, Lp1/q;->d(F)Z

    move-result v3

    if-eqz v3, :cond_6

    const/16 v3, 0x800

    goto :goto_4

    :cond_6
    const/16 v3, 0x400

    :goto_4
    or-int/2addr v2, v3

    :cond_7
    and-int/lit16 v3, v6, 0x6000

    if-nez v3, :cond_9

    invoke-virtual {v0, v9}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_8

    const/16 v3, 0x4000

    goto :goto_5

    :cond_8
    const/16 v3, 0x2000

    :goto_5
    or-int/2addr v2, v3

    :cond_9
    and-int/lit16 v3, v2, 0x2493

    const/16 v4, 0x2492

    if-ne v3, v4, :cond_b

    invoke-virtual {v0}, Lp1/q;->F()Z

    move-result v3

    if-nez v3, :cond_a

    goto :goto_6

    :cond_a
    invoke-virtual {v0}, Lp1/q;->X()V

    move-object/from16 v16, v0

    move v3, v10

    goto :goto_7

    :cond_b
    :goto_6
    sget-object v3, Lb3/v1;->p:Lp1/u2;

    invoke-virtual {v0, v3}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v3

    move-object v8, v3

    check-cast v8, Lb3/x2;

    invoke-static {v0}, Ld40/r;->k(Landroidx/compose/runtime/Composer;)Ld40/n;

    move-result-object v3

    iget-wide v12, v3, Ld40/n;->h:J

    invoke-static {v0}, Lg1/l3;->a(Landroidx/compose/runtime/Composer;)Lg1/c1;

    move-result-object v3

    invoke-virtual {v3}, Lg1/c1;->h()J

    move-result-wide v3

    new-instance v5, Lay/n;

    const/4 v7, 0x3

    invoke-direct {v5, v1, v7}, Lay/n;-><init>(Ljava/lang/Object;I)V

    const v7, 0x588cf8b4    # 1.2399984E15f

    invoke-static {v7, v0, v5}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v5

    new-instance v7, Lb30/e3;

    invoke-direct/range {v7 .. v13}, Lb30/e3;-><init>(Lb3/x2;Lc93/a;ZZJ)V

    move-wide/from16 v19, v3

    move-object v4, v7

    move-wide/from16 v7, v19

    move v3, v10

    const v9, 0x76445836

    invoke-static {v9, v0, v4}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v9

    new-instance v4, Lb30/f3;

    invoke-direct {v4, v1, v3, v12, v13}, Lb30/f3;-><init>(Lb30/j3;ZJ)V

    const v10, 0x6aecd99f    # 1.4316709E26f

    invoke-static {v10, v0, v4}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v10

    shl-int/lit8 v2, v2, 0x9

    const/high16 v4, 0x380000

    and-int/2addr v2, v4

    or-int/lit16 v2, v2, 0xd86

    const/16 v18, 0x22

    move-wide v11, v7

    const/4 v8, 0x0

    const-wide/16 v13, 0x0

    move-object/from16 v16, v0

    move/from16 v17, v2

    move-object v7, v5

    invoke-static/range {v7 .. v18}, Lg1/n0;->d(Lx1/b;Landroidx/compose/ui/Modifier;Lc93/m;Lkotlin/jvm/functions/Function3;JJFLandroidx/compose/runtime/Composer;II)V

    :goto_7
    invoke-virtual/range {v16 .. v16}, Lp1/q;->u()Lp1/v1;

    move-result-object v7

    if-eqz v7, :cond_c

    new-instance v0, Lb30/z2;

    move/from16 v4, p0

    move-object/from16 v5, p4

    move/from16 v2, p5

    invoke-direct/range {v0 .. v6}, Lb30/z2;-><init>(Lb30/j3;ZZFLc93/a;I)V

    iput-object v0, v7, Lp1/v1;->d:Lc93/m;

    :cond_c
    return-void
.end method

.method public static final c(FILandroidx/compose/runtime/Composer;Lb30/j3;Lc93/a;ZZ)V
    .locals 8

    const-string v0, "handleBackPressed"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v3, p2

    check-cast v3, Lp1/q;

    const p2, 0x10fbbb88

    invoke-virtual {v3, p2}, Lp1/q;->g0(I)Lp1/q;

    invoke-virtual {v3, p3}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_0

    const/4 p2, 0x4

    goto :goto_0

    :cond_0
    const/4 p2, 0x2

    :goto_0
    or-int/2addr p2, p1

    and-int/lit8 v0, p1, 0x30

    if-nez v0, :cond_2

    invoke-virtual {v3, p5}, Lp1/q;->h(Z)Z

    move-result v0

    if-eqz v0, :cond_1

    const/16 v0, 0x20

    goto :goto_1

    :cond_1
    const/16 v0, 0x10

    :goto_1
    or-int/2addr p2, v0

    :cond_2
    and-int/lit16 v0, p1, 0x180

    if-nez v0, :cond_4

    invoke-virtual {v3, p6}, Lp1/q;->h(Z)Z

    move-result v0

    if-eqz v0, :cond_3

    const/16 v0, 0x100

    goto :goto_2

    :cond_3
    const/16 v0, 0x80

    :goto_2
    or-int/2addr p2, v0

    :cond_4
    invoke-virtual {v3, p4}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_5

    const/16 v0, 0x800

    goto :goto_3

    :cond_5
    const/16 v0, 0x400

    :goto_3
    or-int/2addr p2, v0

    or-int/lit16 p2, p2, 0x6000

    and-int/lit16 v0, p2, 0x2493

    const/16 v1, 0x2492

    if-ne v0, v1, :cond_7

    invoke-virtual {v3}, Lp1/q;->F()Z

    move-result v0

    if-nez v0, :cond_6

    goto :goto_4

    :cond_6
    invoke-virtual {v3}, Lp1/q;->X()V

    move-object v4, p3

    move p2, p5

    move p3, p6

    move p5, p0

    goto :goto_6

    :cond_7
    :goto_4
    const/4 p0, 0x0

    int-to-float v1, p0

    if-eqz p3, :cond_8

    and-int/lit16 p0, p2, 0x3fe

    or-int/lit16 p0, p0, 0xc00

    const v0, 0xe000

    shl-int/lit8 p2, p2, 0x3

    and-int/2addr p2, v0

    or-int v2, p0, p2

    move-object v4, p3

    move-object v5, p4

    move v6, p5

    move v7, p6

    invoke-static/range {v1 .. v7}, Lb30/g3;->b(FILandroidx/compose/runtime/Composer;Lb30/j3;Lc93/a;ZZ)V

    move p2, v6

    move p3, v7

    goto :goto_5

    :cond_8
    move-object v4, p3

    move p2, p5

    move p3, p6

    :goto_5
    move p5, v1

    :goto_6
    invoke-virtual {v3}, Lp1/q;->u()Lp1/v1;

    move-result-object v0

    if-eqz v0, :cond_9

    new-instance p0, Lb30/z2;

    move p6, p1

    move-object p1, v4

    invoke-direct/range {p0 .. p6}, Lb30/z2;-><init>(Lb30/j3;ZZLc93/a;FI)V

    iput-object p0, v0, Lp1/v1;->d:Lc93/m;

    :cond_9
    return-void
.end method

.method public static final d(Landroidx/compose/runtime/Composer;I)V
    .locals 26

    move/from16 v0, p1

    move-object/from16 v1, p0

    check-cast v1, Lp1/q;

    const v2, 0x6baf8e1d

    invoke-virtual {v1, v2}, Lp1/q;->g0(I)Lp1/q;

    if-nez v0, :cond_1

    invoke-virtual {v1}, Lp1/q;->F()Z

    move-result v2

    if-nez v2, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {v1}, Lp1/q;->X()V

    goto/16 :goto_2

    :cond_1
    :goto_0
    const v2, 0x7f060502

    invoke-static {v1, v2}, Lug/m;->q(Landroidx/compose/runtime/Composer;I)J

    move-result-wide v2

    const v4, 0x7f060503

    invoke-static {v1, v4}, Lug/m;->q(Landroidx/compose/runtime/Composer;I)J

    move-result-wide v4

    const/4 v6, 0x5

    int-to-float v6, v6

    invoke-static {v6}, Lt0/j;->e(F)Lt0/i;

    move-result-object v6

    sget-object v7, Lb2/t;->w:Lb2/t;

    invoke-static {v7, v2, v3, v6}, Landroidx/compose/foundation/a;->c(Landroidx/compose/ui/Modifier;JLi2/a1;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    const/4 v3, 0x6

    int-to-float v3, v3

    const/4 v6, 0x2

    int-to-float v6, v6

    invoke-static {v2, v3, v6}, Landroidx/compose/foundation/layout/a;->q(Landroidx/compose/ui/Modifier;FF)Landroidx/compose/ui/Modifier;

    move-result-object v2

    sget-object v3, Lb2/e;->w:Lb2/m;

    const/4 v6, 0x0

    invoke-static {v3, v6}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v3

    iget-wide v6, v1, Lp1/q;->T:J

    invoke-static {v6, v7}, Ljava/lang/Long;->hashCode(J)I

    move-result v6

    invoke-virtual {v1}, Lp1/q;->m()Lp1/p1;

    move-result-object v7

    invoke-static {v1, v2}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    sget-object v8, La3/l;->a:La3/k;

    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v8, La3/k;->b:La3/j;

    invoke-virtual {v1}, Lp1/q;->i0()V

    iget-boolean v9, v1, Lp1/q;->S:Z

    if-eqz v9, :cond_2

    invoke-virtual {v1, v8}, Lp1/q;->l(Lc93/a;)V

    goto :goto_1

    :cond_2
    invoke-virtual {v1}, Lp1/q;->s0()V

    :goto_1
    sget-object v8, La3/k;->g:La3/i;

    invoke-static {v1, v8, v3}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v3, La3/k;->f:La3/i;

    invoke-static {v1, v3, v7}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v3, La3/k;->j:La3/i;

    iget-boolean v7, v1, Lp1/q;->S:Z

    if-nez v7, :cond_3

    invoke-virtual {v1}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v7

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    invoke-static {v7, v8}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_4

    :cond_3
    invoke-static {v6, v1, v6, v3}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_4
    sget-object v3, La3/k;->d:La3/i;

    invoke-static {v1, v3, v2}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v8, Lp3/r;->I:Lp3/r;

    const/16 v24, 0x0

    const v25, 0x1ffda

    move-object/from16 v22, v1

    const-string v1, "TEST"

    const/4 v2, 0x0

    move-wide v3, v4

    const-wide/16 v5, 0x0

    const/4 v7, 0x0

    const/4 v9, 0x0

    const-wide/16 v10, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const-wide/16 v14, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const v23, 0x30006

    invoke-static/range {v1 .. v25}, Lg1/f9;->b(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Ll3/v0;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v1, v22

    const/4 v2, 0x1

    invoke-virtual {v1, v2}, Lp1/q;->q(Z)V

    :goto_2
    invoke-virtual {v1}, Lp1/q;->u()Lp1/v1;

    move-result-object v1

    if-eqz v1, :cond_5

    new-instance v2, Ln;

    const/16 v3, 0xd

    invoke-direct {v2, v0, v3}, Ln;-><init>(II)V

    iput-object v2, v1, Lp1/v1;->d:Lc93/m;

    :cond_5
    return-void
.end method
