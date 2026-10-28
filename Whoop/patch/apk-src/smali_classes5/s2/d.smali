.class public abstract Ls2/d;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lwy/b;


# direct methods
.method public static final a(ZLc93/a;Landroidx/compose/runtime/Composer;I)V
    .locals 11

    move-object v7, p2

    check-cast v7, Lp1/q;

    const p2, -0x64c72f69

    invoke-virtual {v7, p2}, Lp1/q;->g0(I)Lp1/q;

    invoke-virtual {v7, p0}, Lp1/q;->h(Z)Z

    move-result p2

    if-eqz p2, :cond_0

    const/4 p2, 0x4

    goto :goto_0

    :cond_0
    const/4 p2, 0x2

    :goto_0
    or-int/2addr p2, p3

    invoke-virtual {v7, p1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v0

    const/16 v1, 0x20

    if-eqz v0, :cond_1

    move v0, v1

    goto :goto_1

    :cond_1
    const/16 v0, 0x10

    :goto_1
    or-int/2addr p2, v0

    and-int/lit8 v0, p2, 0x13

    const/16 v2, 0x12

    if-ne v0, v2, :cond_3

    invoke-virtual {v7}, Lp1/q;->F()Z

    move-result v0

    if-nez v0, :cond_2

    goto :goto_2

    :cond_2
    invoke-virtual {v7}, Lp1/q;->X()V

    move v2, p0

    goto/16 :goto_5

    :cond_3
    :goto_2
    sget-object v0, Lb2/t;->w:Lb2/t;

    const/high16 v2, 0x3f800000    # 1.0f

    invoke-static {v2, v0}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    const/4 v2, 0x0

    int-to-float v3, v2

    int-to-float v4, v1

    const/16 v5, 0x14

    int-to-float v5, v5

    invoke-static {v0, v3, v4, v3, v5}, Landroidx/compose/foundation/layout/a;->s(Landroidx/compose/ui/Modifier;FFFF)Landroidx/compose/ui/Modifier;

    move-result-object v0

    const-string v3, "CVC_CONFIRM"

    invoke-static {v0, v3}, Landroidx/compose/ui/platform/a;->a(Landroidx/compose/ui/Modifier;Ljava/lang/String;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    sget-object v3, Lb2/e;->E:Lb2/m;

    invoke-static {v3, v2}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v3

    iget-wide v4, v7, Lp1/q;->T:J

    invoke-static {v4, v5}, Ljava/lang/Long;->hashCode(J)I

    move-result v4

    invoke-virtual {v7}, Lp1/q;->m()Lp1/p1;

    move-result-object v5

    invoke-static {v7, v0}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    sget-object v6, La3/l;->a:La3/k;

    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v6, La3/k;->b:La3/j;

    invoke-virtual {v7}, Lp1/q;->i0()V

    iget-boolean v8, v7, Lp1/q;->S:Z

    if-eqz v8, :cond_4

    invoke-virtual {v7, v6}, Lp1/q;->l(Lc93/a;)V

    goto :goto_3

    :cond_4
    invoke-virtual {v7}, Lp1/q;->s0()V

    :goto_3
    sget-object v6, La3/k;->g:La3/i;

    invoke-static {v7, v6, v3}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v3, La3/k;->f:La3/i;

    invoke-static {v7, v3, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v3, La3/k;->j:La3/i;

    iget-boolean v5, v7, Lp1/q;->S:Z

    if-nez v5, :cond_5

    invoke-virtual {v7}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-static {v5, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_6

    :cond_5
    invoke-static {v4, v7, v4, v3}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_6
    sget-object v3, La3/k;->d:La3/i;

    invoke-static {v7, v3, v0}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const v0, 0x7f14107c

    invoke-static {v7, v0}, Lq83/g;->Y(Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v0

    const v3, 0x4aa36f4

    invoke-virtual {v7, v3}, Lp1/q;->e0(I)V

    and-int/lit8 v3, p2, 0x70

    const/4 v10, 0x1

    if-ne v3, v1, :cond_7

    move v1, v10

    goto :goto_4

    :cond_7
    move v1, v2

    :goto_4
    invoke-virtual {v7}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    if-nez v1, :cond_8

    sget-object v1, Lp1/l;->a:Lp1/v0;

    if-ne v3, v1, :cond_9

    :cond_8
    new-instance v3, Lry2/g;

    const/16 v1, 0x13

    invoke-direct {v3, p1, v1}, Lry2/g;-><init>(Lc93/a;I)V

    invoke-virtual {v7, v3}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_9
    move-object v6, v3

    check-cast v6, Lc93/a;

    invoke-virtual {v7, v2}, Lp1/q;->q(Z)V

    shl-int/lit8 p2, p2, 0x6

    and-int/lit16 p2, p2, 0x380

    or-int/lit8 v8, p2, 0x30

    const/16 v9, 0x38

    const/4 v1, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    move v2, p0

    invoke-static/range {v0 .. v9}, Lb30/c4;->d(Ljava/lang/String;ZZLandroidx/compose/ui/Modifier;Lb30/g4;Lc93/a;Lc93/a;Landroidx/compose/runtime/Composer;II)V

    invoke-virtual {v7, v10}, Lp1/q;->q(Z)V

    :goto_5
    invoke-virtual {v7}, Lp1/q;->u()Lp1/v1;

    move-result-object p0

    if-eqz p0, :cond_a

    new-instance p2, Lt10/k;

    const/4 v0, 0x1

    invoke-direct {p2, v2, p1, p3, v0}, Lt10/k;-><init>(ZLc93/a;II)V

    iput-object p2, p0, Lp1/v1;->d:Lc93/m;

    :cond_a
    return-void
.end method

.method public static final b(Ljava/lang/String;ZLw20/z;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V
    .locals 12

    move-object v3, p3

    const-string v0, "lastFour"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onValueChanged"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v8, p4

    check-cast v8, Lp1/q;

    const v0, 0x2aa855fc

    invoke-virtual {v8, v0}, Lp1/q;->g0(I)Lp1/q;

    invoke-virtual {v8, p0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x4

    goto :goto_0

    :cond_0
    const/4 v0, 0x2

    :goto_0
    or-int v0, p5, v0

    and-int/lit8 v2, p5, 0x30

    if-nez v2, :cond_2

    invoke-virtual {v8, p1}, Lp1/q;->h(Z)Z

    move-result v4

    if-eqz v4, :cond_1

    const/16 v4, 0x20

    goto :goto_1

    :cond_1
    const/16 v4, 0x10

    :goto_1
    or-int/2addr v0, v4

    :cond_2
    move-object v5, p2

    invoke-virtual {v8, p2}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_3

    const/16 v4, 0x100

    goto :goto_2

    :cond_3
    const/16 v4, 0x80

    :goto_2
    or-int/2addr v0, v4

    invoke-virtual {v8, p3}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_4

    const/16 v4, 0x800

    goto :goto_3

    :cond_4
    const/16 v4, 0x400

    :goto_3
    or-int/2addr v0, v4

    and-int/lit16 v0, v0, 0x493

    const/16 v4, 0x492

    if-ne v0, v4, :cond_6

    invoke-virtual {v8}, Lp1/q;->F()Z

    move-result v0

    if-nez v0, :cond_5

    goto :goto_4

    :cond_5
    invoke-virtual {v8}, Lp1/q;->X()V

    goto/16 :goto_6

    :cond_6
    :goto_4
    invoke-static {v8}, Ldc/a;->G(Landroidx/compose/runtime/Composer;)Z

    move-result v0

    const v4, 0x3d99999a    # 0.075f

    if-eqz v0, :cond_7

    sget-wide v6, Li2/x;->f:J

    invoke-static {v4, v6, v7}, Li2/x;->c(FJ)J

    move-result-wide v6

    goto :goto_5

    :cond_7
    sget-wide v6, Li2/x;->b:J

    invoke-static {v4, v6, v7}, Li2/x;->c(FJ)J

    move-result-wide v6

    :goto_5
    const v0, 0x13c6cff1

    invoke-virtual {v8, v0}, Lp1/q;->e0(I)V

    invoke-virtual {v8}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v0

    sget-object v4, Lp1/l;->a:Lp1/v0;

    if-ne v0, v4, :cond_8

    invoke-static {v8}, Lte0/d;->h(Lp1/q;)Lg2/s;

    move-result-object v0

    :cond_8
    check-cast v0, Lg2/s;

    const/4 v9, 0x0

    invoke-virtual {v8, v9}, Lp1/q;->q(Z)V

    const v10, 0x13c6d624

    invoke-virtual {v8, v10}, Lp1/q;->e0(I)V

    sget-object v10, Lb3/k2;->a:Lp1/u2;

    invoke-virtual {v8, v10}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Ljava/lang/Boolean;

    invoke-virtual {v10}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v10

    if-nez v10, :cond_a

    const v10, 0x13c6ddfd

    invoke-virtual {v8, v10}, Lp1/q;->e0(I)V

    invoke-virtual {v8}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v10

    if-ne v10, v4, :cond_9

    new-instance v10, Li20/m0;

    const/4 v4, 0x0

    const/4 v11, 0x1

    invoke-direct {v10, v0, v4, v11}, Li20/m0;-><init>(Lg2/s;Lq83/d;I)V

    invoke-virtual {v8, v10}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_9
    check-cast v10, Lc93/m;

    invoke-virtual {v8, v9}, Lp1/q;->q(Z)V

    sget-object v4, Ll83/a0;->a:Ll83/a0;

    invoke-static {v8, v10, v4}, Lp1/x;->g(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    :cond_a
    invoke-virtual {v8, v9}, Lp1/q;->q(Z)V

    move-object v4, v0

    new-instance v0, Lw20/s;

    move-wide v1, v6

    move-object v7, p0

    move v6, p1

    invoke-direct/range {v0 .. v7}, Lw20/s;-><init>(JLkotlin/jvm/functions/Function1;Lg2/s;Lw20/z;ZLjava/lang/String;)V

    const v1, -0x1814f9ff

    invoke-static {v1, v8, v0}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v7

    const/high16 v9, 0x30000

    const/16 v10, 0x1f

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const-wide/16 v4, 0x0

    const/4 v6, 0x0

    invoke-static/range {v1 .. v10}, Lse/a;->p(Landroidx/compose/ui/Modifier;Li2/a1;ZJLf0/t;Lx1/b;Landroidx/compose/runtime/Composer;II)V

    :goto_6
    invoke-virtual {v8}, Lp1/q;->u()Lp1/v1;

    move-result-object v7

    if-eqz v7, :cond_b

    new-instance v0, Lw20/p;

    const/4 v6, 0x1

    move-object v1, p0

    move v2, p1

    move-object v3, p2

    move-object v4, p3

    move/from16 v5, p5

    invoke-direct/range {v0 .. v6}, Lw20/p;-><init>(Ljava/lang/String;ZLw20/z;Lkotlin/jvm/functions/Function1;II)V

    iput-object v0, v7, Lp1/v1;->d:Lc93/m;

    :cond_b
    return-void
.end method

.method public static final c(Lw20/b0;Landroidx/compose/runtime/Composer;I)V
    .locals 11

    move-object v8, p1

    check-cast v8, Lp1/q;

    const p1, -0x43871762

    invoke-virtual {v8, p1}, Lp1/q;->g0(I)Lp1/q;

    invoke-virtual {v8, p0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result p1

    const/4 v0, 0x2

    if-eqz p1, :cond_0

    const/4 p1, 0x4

    goto :goto_0

    :cond_0
    move p1, v0

    :goto_0
    or-int/2addr p1, p2

    and-int/lit8 p1, p1, 0x3

    if-ne p1, v0, :cond_2

    invoke-virtual {v8}, Lp1/q;->F()Z

    move-result p1

    if-nez p1, :cond_1

    goto :goto_1

    :cond_1
    invoke-virtual {v8}, Lp1/q;->X()V

    goto :goto_2

    :cond_2
    :goto_1
    iget-object p1, p0, Lw20/b0;->c:Lec3/r1;

    const/4 v0, 0x0

    invoke-static {p1, v8, v0}, Lo73/a;->t(Lec3/f2;Landroidx/compose/runtime/Composer;I)Lp1/c1;

    move-result-object p1

    new-instance v0, Lu10/f;

    const/4 v1, 0x2

    invoke-direct {v0, v1, p0, p1}, Lu10/f;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    const p1, 0x2f1d5db4

    invoke-static {p1, v8, v0}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v7

    const/high16 v9, 0xc00000

    const/16 v10, 0x7f

    const/4 v0, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    invoke-static/range {v0 .. v10}, Ld40/r;->a(Ld40/n;Ld40/o;Ld40/s;Ljava/lang/Float;Ld40/m;Ld40/g;Ld40/h;Lx1/b;Landroidx/compose/runtime/Composer;II)V

    :goto_2
    invoke-virtual {v8}, Lp1/q;->u()Lp1/v1;

    move-result-object p1

    if-eqz p1, :cond_3

    new-instance v0, Lw20/q;

    invoke-direct {v0, p0, p2}, Lw20/q;-><init>(Lw20/b0;I)V

    iput-object v0, p1, Lp1/v1;->d:Lc93/m;

    :cond_3
    return-void
.end method

.method public static final d(Ljava/lang/String;ZLw20/z;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V
    .locals 19

    move-object/from16 v1, p0

    move-object/from16 v2, p3

    move/from16 v6, p5

    const-string v0, "lastFour"

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "viewActionHandler"

    invoke-static {v2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v15, p4

    check-cast v15, Lp1/q;

    const v0, -0x2960fcbc

    invoke-virtual {v15, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, v6, 0x6

    if-nez v0, :cond_1

    invoke-virtual {v15, v1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x4

    goto :goto_0

    :cond_0
    const/4 v0, 0x2

    :goto_0
    or-int/2addr v0, v6

    goto :goto_1

    :cond_1
    move v0, v6

    :goto_1
    and-int/lit8 v3, v6, 0x30

    if-nez v3, :cond_3

    move/from16 v3, p1

    invoke-virtual {v15, v3}, Lp1/q;->h(Z)Z

    move-result v4

    if-eqz v4, :cond_2

    const/16 v4, 0x20

    goto :goto_2

    :cond_2
    const/16 v4, 0x10

    :goto_2
    or-int/2addr v0, v4

    goto :goto_3

    :cond_3
    move/from16 v3, p1

    :goto_3
    and-int/lit16 v4, v6, 0x180

    if-nez v4, :cond_5

    move-object/from16 v4, p2

    invoke-virtual {v15, v4}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_4

    const/16 v5, 0x100

    goto :goto_4

    :cond_4
    const/16 v5, 0x80

    :goto_4
    or-int/2addr v0, v5

    goto :goto_5

    :cond_5
    move-object/from16 v4, p2

    :goto_5
    and-int/lit16 v5, v6, 0xc00

    if-nez v5, :cond_7

    invoke-virtual {v15, v2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_6

    const/16 v5, 0x800

    goto :goto_6

    :cond_6
    const/16 v5, 0x400

    :goto_6
    or-int/2addr v0, v5

    :cond_7
    and-int/lit16 v0, v0, 0x493

    const/16 v5, 0x492

    if-ne v0, v5, :cond_9

    invoke-virtual {v15}, Lp1/q;->F()Z

    move-result v0

    if-nez v0, :cond_8

    goto :goto_7

    :cond_8
    invoke-virtual {v15}, Lp1/q;->X()V

    goto :goto_8

    :cond_9
    :goto_7
    new-instance v0, Lg1/f4;

    const/4 v5, 0x3

    move/from16 v18, v3

    move-object v3, v1

    move/from16 v1, v18

    invoke-direct/range {v0 .. v5}, Lg1/f4;-><init>(ZLjava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    const v1, -0x5f3a8ca6

    invoke-static {v1, v15, v0}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v14

    const/high16 v16, 0xc00000

    const/16 v17, 0x7f

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    invoke-static/range {v7 .. v17}, Ld40/r;->a(Ld40/n;Ld40/o;Ld40/s;Ljava/lang/Float;Ld40/m;Ld40/g;Ld40/h;Lx1/b;Landroidx/compose/runtime/Composer;II)V

    :goto_8
    invoke-virtual {v15}, Lp1/q;->u()Lp1/v1;

    move-result-object v7

    if-eqz v7, :cond_a

    new-instance v0, Lw20/p;

    const/4 v6, 0x0

    move-object/from16 v1, p0

    move/from16 v2, p1

    move-object/from16 v3, p2

    move-object/from16 v4, p3

    move/from16 v5, p5

    invoke-direct/range {v0 .. v6}, Lw20/p;-><init>(Ljava/lang/String;ZLw20/z;Lkotlin/jvm/functions/Function1;II)V

    iput-object v0, v7, Lp1/v1;->d:Lc93/m;

    :cond_a
    return-void
.end method

.method public static final e(Landroidx/compose/runtime/Composer;I)V
    .locals 5

    check-cast p0, Lp1/q;

    const v0, 0x2fd9b865

    invoke-virtual {p0, v0}, Lp1/q;->g0(I)Lp1/q;

    if-nez p1, :cond_1

    invoke-virtual {p0}, Lp1/q;->F()Z

    move-result v0

    if-nez v0, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Lp1/q;->X()V

    goto :goto_1

    :cond_1
    :goto_0
    const v0, 0x7f14107d

    invoke-static {p0, v0}, Lq83/g;->Y(Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v0

    const/4 v1, 0x0

    int-to-float v2, v1

    const/16 v3, 0x10

    int-to-float v3, v3

    sget-object v4, Lb2/t;->w:Lb2/t;

    invoke-static {v4, v2, v2, v2, v3}, Landroidx/compose/foundation/layout/a;->s(Landroidx/compose/ui/Modifier;FFFF)Landroidx/compose/ui/Modifier;

    move-result-object v2

    const-string v3, "TEST_TAG_CONFIRM_CVC"

    invoke-static {v2, v3}, Landroidx/compose/ui/platform/a;->a(Landroidx/compose/ui/Modifier;Ljava/lang/String;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    const/16 v3, 0x30

    invoke-static {v0, v2, p0, v3, v1}, Ls/s;->a(Ljava/lang/String;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V

    :goto_1
    invoke-virtual {p0}, Lp1/q;->u()Lp1/v1;

    move-result-object p0

    if-eqz p0, :cond_2

    new-instance v0, Lv6/q;

    invoke-direct {v0, p1}, Lv6/q;-><init>(I)V

    iput-object v0, p0, Lp1/v1;->d:Lc93/m;

    :cond_2
    return-void
.end method

.method public static final f(ZLc93/a;Landroidx/compose/runtime/Composer;I)V
    .locals 11

    move-object v4, p2

    check-cast v4, Lp1/q;

    const p2, -0x3cb5a835

    invoke-virtual {v4, p2}, Lp1/q;->g0(I)Lp1/q;

    invoke-virtual {v4, p0}, Lp1/q;->h(Z)Z

    move-result p2

    if-eqz p2, :cond_0

    const/4 p2, 0x4

    goto :goto_0

    :cond_0
    const/4 p2, 0x2

    :goto_0
    or-int/2addr p2, p3

    invoke-virtual {v4, p1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v0

    const/16 v1, 0x10

    const/16 v2, 0x20

    if-eqz v0, :cond_1

    move v0, v2

    goto :goto_1

    :cond_1
    move v0, v1

    :goto_1
    or-int/2addr p2, v0

    and-int/lit8 v0, p2, 0x13

    const/16 v3, 0x12

    if-ne v0, v3, :cond_3

    invoke-virtual {v4}, Lp1/q;->F()Z

    move-result v0

    if-nez v0, :cond_2

    goto :goto_2

    :cond_2
    invoke-virtual {v4}, Lp1/q;->X()V

    goto/16 :goto_6

    :cond_3
    :goto_2
    const/4 v0, 0x0

    int-to-float v3, v0

    int-to-float v1, v1

    sget-object v5, Lb2/t;->w:Lb2/t;

    invoke-static {v5, v3, v1, v3, v3}, Landroidx/compose/foundation/layout/a;->s(Landroidx/compose/ui/Modifier;FFFF)Landroidx/compose/ui/Modifier;

    move-result-object v3

    int-to-float v6, v2

    invoke-static {v6, v3}, Landroidx/compose/foundation/layout/d;->h(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    sget-object v6, Ll0/m;->a:Ll0/e;

    sget-object v7, Lb2/e;->J:Lb2/l;

    invoke-static {v6, v7, v4, v0}, Ll0/p1;->a(Ll0/i;Lb2/g;Landroidx/compose/runtime/Composer;I)Ll0/r1;

    move-result-object v6

    iget-wide v7, v4, Lp1/q;->T:J

    invoke-static {v7, v8}, Ljava/lang/Long;->hashCode(J)I

    move-result v7

    invoke-virtual {v4}, Lp1/q;->m()Lp1/p1;

    move-result-object v8

    invoke-static {v4, v3}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    sget-object v9, La3/l;->a:La3/k;

    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v9, La3/k;->b:La3/j;

    invoke-virtual {v4}, Lp1/q;->i0()V

    iget-boolean v10, v4, Lp1/q;->S:Z

    if-eqz v10, :cond_4

    invoke-virtual {v4, v9}, Lp1/q;->l(Lc93/a;)V

    goto :goto_3

    :cond_4
    invoke-virtual {v4}, Lp1/q;->s0()V

    :goto_3
    sget-object v9, La3/k;->g:La3/i;

    invoke-static {v4, v9, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v6, La3/k;->f:La3/i;

    invoke-static {v4, v6, v8}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v6, La3/k;->j:La3/i;

    iget-boolean v8, v4, Lp1/q;->S:Z

    if-nez v8, :cond_5

    invoke-virtual {v4}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v8

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    invoke-static {v8, v9}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_6

    :cond_5
    invoke-static {v7, v4, v7, v6}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_6
    sget-object v6, La3/k;->d:La3/i;

    invoke-static {v4, v6, v3}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const v3, -0x45f4ea5a

    invoke-virtual {v4, v3}, Lp1/q;->e0(I)V

    if-eqz p0, :cond_7

    invoke-static {v4, v0}, Lb30/g3;->d(Landroidx/compose/runtime/Composer;I)V

    :cond_7
    invoke-virtual {v4, v0}, Lp1/q;->q(Z)V

    const/high16 v3, 0x3f800000    # 1.0f

    float-to-double v6, v3

    const-wide/16 v8, 0x0

    cmpl-double v6, v6, v8

    if-lez v6, :cond_8

    goto :goto_4

    :cond_8
    const-string v6, "invalid weight; must be greater than zero"

    invoke-static {v6}, Lm0/a;->a(Ljava/lang/String;)V

    :goto_4
    new-instance v6, Landroidx/compose/foundation/layout/LayoutWeightElement;

    const/4 v7, 0x1

    invoke-direct {v6, v3, v7}, Landroidx/compose/foundation/layout/LayoutWeightElement;-><init>(FZ)V

    invoke-static {v4, v6}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    const v3, -0x45f4d856

    invoke-virtual {v4, v3}, Lp1/q;->e0(I)V

    and-int/lit8 p2, p2, 0x70

    if-ne p2, v2, :cond_9

    move p2, v7

    goto :goto_5

    :cond_9
    move p2, v0

    :goto_5
    invoke-virtual {v4}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    if-nez p2, :cond_a

    sget-object p2, Lp1/l;->a:Lp1/v0;

    if-ne v2, p2, :cond_b

    :cond_a
    new-instance v2, Lry2/g;

    const/16 p2, 0x14

    invoke-direct {v2, p1, p2}, Lry2/g;-><init>(Lc93/a;I)V

    invoke-virtual {v4, v2}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_b
    check-cast v2, Lc93/a;

    invoke-virtual {v4, v0}, Lp1/q;->q(Z)V

    const/16 p2, 0x8

    int-to-float p2, p2

    neg-float p2, p2

    invoke-static {v5, v1, p2}, Landroidx/compose/foundation/layout/a;->m(Landroidx/compose/ui/Modifier;FF)Landroidx/compose/ui/Modifier;

    move-result-object v1

    sget-object v3, Lw20/c;->a:Lx1/b;

    const/16 v5, 0x6030

    const/16 v6, 0xc

    move-object v0, v2

    const/4 v2, 0x0

    invoke-static/range {v0 .. v6}, Lg1/d3;->a(Lc93/a;Landroidx/compose/ui/Modifier;ZLc93/m;Landroidx/compose/runtime/Composer;II)V

    invoke-virtual {v4, v7}, Lp1/q;->q(Z)V

    :goto_6
    invoke-virtual {v4}, Lp1/q;->u()Lp1/v1;

    move-result-object p2

    if-eqz p2, :cond_c

    new-instance v0, Lt10/k;

    const/4 v1, 0x2

    invoke-direct {v0, p0, p1, p3, v1}, Lt10/k;-><init>(ZLc93/a;II)V

    iput-object v0, p2, Lp1/v1;->d:Lc93/m;

    :cond_c
    return-void
.end method

.method public static g(Lne3/e0;Lne3/p;Ljava/lang/String;Lth/g;I)Lsh/p;
    .locals 2

    and-int/lit8 v0, p4, 0x4

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    move-object p2, v1

    :cond_0
    and-int/lit8 p4, p4, 0x8

    if-eqz p4, :cond_1

    move-object p3, v1

    :cond_1
    new-instance p4, Lsh/p;

    invoke-direct {p4, p0, p1, p2, p3}, Lsh/p;-><init>(Lne3/e0;Lne3/p;Ljava/lang/String;Ljava/lang/AutoCloseable;)V

    return-object p4
.end method

.method public static h(Lne3/j;Lne3/p;)Lsh/s;
    .locals 2

    new-instance v0, Lsh/s;

    const/4 v1, 0x0

    invoke-direct {v0, p0, p1, v1}, Lsh/s;-><init>(Lne3/j;Lne3/p;Ls2/a;)V

    return-object v0
.end method

.method public static final i(ZLx30/i1;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V
    .locals 14

    move/from16 v4, p4

    const-string v0, "element"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v11, p3

    check-cast v11, Lp1/q;

    const v0, 0x3f3ea4fc

    invoke-virtual {v11, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, v4, 0x6

    if-nez v0, :cond_1

    invoke-virtual {v11, p0}, Lp1/q;->h(Z)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x4

    goto :goto_0

    :cond_0
    const/4 v0, 0x2

    :goto_0
    or-int/2addr v0, v4

    goto :goto_1

    :cond_1
    move v0, v4

    :goto_1
    and-int/lit8 v1, v4, 0x30

    if-nez v1, :cond_3

    invoke-virtual {v11, p1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    const/16 v1, 0x20

    goto :goto_2

    :cond_2
    const/16 v1, 0x10

    :goto_2
    or-int/2addr v0, v1

    :cond_3
    and-int/lit16 v1, v4, 0x180

    move-object/from16 v3, p2

    if-nez v1, :cond_5

    invoke-virtual {v11, v3}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_4

    const/16 v1, 0x100

    goto :goto_3

    :cond_4
    const/16 v1, 0x80

    :goto_3
    or-int/2addr v0, v1

    :cond_5
    and-int/lit16 v1, v0, 0x93

    const/16 v2, 0x92

    if-ne v1, v2, :cond_7

    invoke-virtual {v11}, Lp1/q;->F()Z

    move-result v1

    if-nez v1, :cond_6

    goto :goto_4

    :cond_6
    invoke-virtual {v11}, Lp1/q;->X()V

    goto :goto_5

    :cond_7
    :goto_4
    iget-object v1, p1, Lx30/i1;->c:Lg40/u2;

    iget-object v2, v1, Lg40/u2;->f:Ljava/lang/Object;

    check-cast v2, Lec3/h2;

    const/4 v5, 0x0

    invoke-static {v2, v11, v5}, Lo73/a;->t(Lec3/f2;Landroidx/compose/runtime/Composer;I)Lp1/c1;

    move-result-object v2

    iget-object v6, v1, Lg40/u2;->b:Lec3/h2;

    invoke-static {v6, v11, v5}, Lo73/a;->t(Lec3/f2;Landroidx/compose/runtime/Composer;I)Lp1/c1;

    move-result-object v6

    invoke-interface {v2}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Ljava/lang/Boolean;

    invoke-virtual {v7}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v7

    invoke-interface {v6}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lzy/c;

    invoke-static {v6, v11}, Lv8/b;->S(Lzy/c;Landroidx/compose/runtime/Composer;)Ljava/lang/String;

    move-result-object v8

    const v6, -0xdb751fd

    invoke-virtual {v11, v6}, Lp1/q;->e0(I)V

    invoke-virtual {v11, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v6

    invoke-virtual {v11, v2}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v9

    or-int/2addr v6, v9

    invoke-virtual {v11}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v9

    if-nez v6, :cond_8

    sget-object v6, Lp1/l;->a:Lp1/v0;

    if-ne v9, v6, :cond_9

    :cond_8
    new-instance v9, Lx30/j1;

    const/4 v6, 0x0

    invoke-direct {v9, v6, v1, v2}, Lx30/j1;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v11, v9}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_9
    move-object v10, v9

    check-cast v10, Lkotlin/jvm/functions/Function1;

    invoke-virtual {v11, v5}, Lp1/q;->q(Z)V

    shr-int/lit8 v1, v0, 0x6

    and-int/lit8 v1, v1, 0xe

    or-int/lit8 v1, v1, 0x30

    shl-int/lit8 v0, v0, 0xc

    const v2, 0xe000

    and-int/2addr v0, v2

    or-int v12, v1, v0

    const/4 v13, 0x0

    const-string v6, "SAVE_FOR_FUTURE_CHECKBOX_TEST_TAG"

    move v9, p0

    move-object v5, v3

    invoke-static/range {v5 .. v13}, Lx30/s0;->a(Landroidx/compose/ui/Modifier;Ljava/lang/String;ZLjava/lang/String;ZLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    :goto_5
    invoke-virtual {v11}, Lp1/q;->u()Lp1/v1;

    move-result-object v6

    if-eqz v6, :cond_a

    new-instance v0, Lsg2/o;

    const/16 v5, 0x8

    move v1, p0

    move-object v2, p1

    move-object/from16 v3, p2

    invoke-direct/range {v0 .. v5}, Lsg2/o;-><init>(ZLjava/lang/Object;Ljava/lang/Object;II)V

    iput-object v0, v6, Lp1/v1;->d:Lc93/m;

    :cond_a
    return-void
.end method

.method public static final j(II)Z
    .locals 0

    if-ne p0, p1, :cond_0

    const/4 p0, 0x1

    return p0

    :cond_0
    const/4 p0, 0x0

    return p0
.end method

.method public static final k(Ln6/o;)Ln6/o;
    .locals 2

    invoke-static {p0}, Ls2/d;->l(Ln6/o;)Ln6/o;

    move-result-object p0

    new-instance v0, Lv6/n;

    sget-object v1, La7/c;->a:La7/c;

    invoke-direct {v0, v1}, Lv6/n;-><init>(La7/e;)V

    invoke-interface {p0, v0}, Ln6/o;->d(Ln6/o;)Ln6/o;

    move-result-object p0

    return-object p0
.end method

.method public static final l(Ln6/o;)Ln6/o;
    .locals 2

    new-instance v0, Lv6/v;

    sget-object v1, La7/c;->a:La7/c;

    invoke-direct {v0, v1}, Lv6/v;-><init>(La7/e;)V

    invoke-interface {p0, v0}, Ln6/o;->d(Ln6/o;)Ln6/o;

    move-result-object p0

    return-object p0
.end method

.method public static n()Lgf/a;
    .locals 1

    sget-object v0, Lte/e;->e:Lgf/a;

    return-object v0
.end method

.method public static final o(Ln6/o;F)Ln6/o;
    .locals 2

    new-instance v0, Lv6/n;

    new-instance v1, La7/a;

    invoke-direct {v1, p1}, La7/a;-><init>(F)V

    invoke-direct {v0, v1}, Lv6/n;-><init>(La7/e;)V

    invoke-interface {p0, v0}, Ln6/o;->d(Ln6/o;)Ln6/o;

    move-result-object p0

    return-object p0
.end method

.method public static p(Ljava/util/List;)Ljava/util/LinkedList;
    .locals 5

    if-nez p0, :cond_0

    const/4 p0, 0x0

    return-object p0

    :cond_0
    new-instance v0, Ljava/util/LinkedList;

    invoke-direct {v0}, Ljava/util/LinkedList;-><init>()V

    const/4 v1, 0x0

    move v2, v1

    :goto_0
    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result v3

    if-ge v2, v3, :cond_2

    invoke-interface {p0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    if-nez v3, :cond_1

    goto :goto_1

    :cond_1
    :try_start_0
    invoke-interface {p0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lxw/a;

    invoke-virtual {v3}, Lxw/a;->a()[B

    move-result-object v3

    invoke-static {v3}, Ls2/h;->k([B)Ljava/security/cert/X509Certificate;

    move-result-object v3
    :try_end_0
    .catch Ljava/security/cert/CertificateException; {:try_start_0 .. :try_end_0} :catch_0

    invoke-virtual {v0, v3}, Ljava/util/LinkedList;->add(Ljava/lang/Object;)Z

    :goto_1
    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :catch_0
    move-exception p0

    new-instance v0, Ljava/text/ParseException;

    const-string v3, "Invalid X.509 certificate at position "

    const-string v4, ": "

    invoke-static {v2, v3, v4}, Ld;->t(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object v2

    invoke-virtual {p0}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-direct {v0, p0, v1}, Ljava/text/ParseException;-><init>(Ljava/lang/String;I)V

    throw v0

    :cond_2
    return-object v0
.end method

.method public static q(Lorg/json/JSONObject;)Ly00/e;
    .locals 15

    new-instance v0, Ly00/e;

    const-string v1, "id"

    invoke-static {v1, p0}, Ls/s;->t(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    move-result-object v1

    const-string v2, "account_holder_name"

    invoke-static {v2, p0}, Ls/s;->t(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    move-result-object v2

    sget-object v3, Lcom/stripe/android/model/BankAccount$Type;->x:Lt9/p;

    const-string v4, "account_holder_type"

    invoke-static {v4, p0}, Ls/s;->t(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v3, Lcom/stripe/android/model/BankAccount$Type;->z:Lt83/b;

    invoke-virtual {v3}, Lm83/e;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_0
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    const/4 v6, 0x0

    if-eqz v5, :cond_1

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    move-object v7, v5

    check-cast v7, Lcom/stripe/android/model/BankAccount$Type;

    iget-object v7, v7, Lcom/stripe/android/model/BankAccount$Type;->w:Ljava/lang/String;

    invoke-virtual {v7, v4}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_0

    goto :goto_0

    :cond_1
    move-object v5, v6

    :goto_0
    move-object v3, v5

    check-cast v3, Lcom/stripe/android/model/BankAccount$Type;

    const-string v4, "bank_name"

    invoke-static {v4, p0}, Ls/s;->t(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    move-result-object v4

    const-string v5, "country"

    invoke-virtual {p0, v5}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    if-eqz v5, :cond_2

    const-string v7, "null"

    invoke-virtual {v7, v5}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_2

    invoke-virtual {v5}, Ljava/lang/String;->length()I

    move-result v7

    if-nez v7, :cond_3

    :cond_2
    move-object v5, v6

    :cond_3
    if-eqz v5, :cond_4

    invoke-virtual {v5}, Ljava/lang/String;->length()I

    move-result v7

    const/4 v8, 0x2

    if-ne v7, v8, :cond_4

    move-object v7, v6

    goto :goto_1

    :cond_4
    move-object v5, v6

    move-object v7, v5

    :goto_1
    invoke-static {p0}, Ls/s;->r(Lorg/json/JSONObject;)Ljava/lang/String;

    move-result-object v6

    const-string v8, "fingerprint"

    invoke-static {v8, p0}, Ls/s;->t(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    move-result-object v8

    const-string v9, "last4"

    invoke-static {v9, p0}, Ls/s;->t(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    move-result-object v9

    const-string v10, "routing_number"

    invoke-static {v10, p0}, Ls/s;->t(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    move-result-object v10

    sget-object v11, Lcom/stripe/android/model/BankAccount$Status;->x:Lt9/c0;

    const-string v12, "status"

    invoke-static {v12, p0}, Ls/s;->t(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    move-result-object p0

    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v11, Lcom/stripe/android/model/BankAccount$Status;->z:Lt83/b;

    invoke-virtual {v11}, Lm83/e;->iterator()Ljava/util/Iterator;

    move-result-object v11

    :cond_5
    invoke-interface {v11}, Ljava/util/Iterator;->hasNext()Z

    move-result v12

    if-eqz v12, :cond_6

    invoke-interface {v11}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v12

    move-object v13, v12

    check-cast v13, Lcom/stripe/android/model/BankAccount$Status;

    iget-object v13, v13, Lcom/stripe/android/model/BankAccount$Status;->w:Ljava/lang/String;

    invoke-virtual {v13, p0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v13

    if-eqz v13, :cond_5

    move-object v7, v12

    :cond_6
    check-cast v7, Lcom/stripe/android/model/BankAccount$Status;

    move-object v14, v10

    move-object v10, v7

    move-object v7, v8

    move-object v8, v9

    move-object v9, v14

    invoke-direct/range {v0 .. v10}, Ly00/e;-><init>(Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/model/BankAccount$Type;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/stripe/android/model/BankAccount$Status;)V

    return-object v0
.end method

.method public static r(Lce/j;)Lwd/l;
    .locals 15

    const-string v0, "config"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v1, Ljava/util/LinkedHashSet;

    invoke-direct {v1}, Ljava/util/LinkedHashSet;-><init>()V

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {p0}, Lce/j;->a()Lce/k;

    move-result-object v2

    iget-object v2, v2, Lce/k;->a:Ljava/lang/String;

    move-object v7, v2

    :goto_0
    invoke-virtual {p0}, Lce/j;->b()Ljava/util/Map;

    move-result-object v2

    invoke-interface {v2, v7}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lce/k;

    const/4 v8, 0x0

    if-nez v2, :cond_1

    invoke-interface {v1}, Ljava/util/Set;->isEmpty()Z

    move-result p0

    const-string v0, "could not find source profile "

    if-eqz p0, :cond_0

    invoke-static {v0, v7}, Ld;->o(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    goto :goto_1

    :cond_0
    const-string p0, " referenced from "

    invoke-static {v0, v7, p0}, Lih0/d0;->p(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/StringBuilder;

    move-result-object p0

    invoke-static {v1}, Lm83/s;->O0(Ljava/lang/Iterable;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    :goto_1
    new-instance v0, Laws/sdk/kotlin/runtime/auth/credentials/ProviderConfigurationException;

    invoke-direct {v0, p0, v8}, Laws/sdk/kotlin/runtime/auth/credentials/ProviderConfigurationException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw v0

    :cond_1
    iget-object v3, v2, Lce/k;->b:Ljava/util/Map;

    iget-object v4, v2, Lce/k;->a:Ljava/lang/String;

    invoke-interface {v1, v7}, Ljava/util/Set;->add(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_15

    const-string v5, "aws_access_key_id"

    invoke-virtual {v2, v5, v8}, Lce/k;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    const-string v5, "aws_secret_access_key"

    invoke-virtual {v2, v5, v8}, Lce/k;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v10

    const-string v5, "aws_account_id"

    invoke-virtual {v2, v5, v8}, Lce/k;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v13

    const-string v5, "profile ("

    if-nez v9, :cond_2

    if-nez v10, :cond_2

    new-instance v6, Lwd/h;

    const-string v7, ") missing `aws_access_key_id` & `aws_secret_access_key`"

    invoke-static {v5, v4, v7}, Ldc/b;->o(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    invoke-direct {v6, v7}, Lwd/h;-><init>(Ljava/lang/String;)V

    goto :goto_2

    :cond_2
    if-nez v9, :cond_3

    new-instance v6, Lwd/h;

    const-string v7, ") missing `aws_access_key_id`"

    invoke-static {v5, v4, v7}, Ldc/b;->o(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    invoke-direct {v6, v7}, Lwd/h;-><init>(Ljava/lang/String;)V

    goto :goto_2

    :cond_3
    if-nez v10, :cond_4

    new-instance v6, Lwd/h;

    const-string v7, ") missing `aws_secret_access_key`"

    invoke-static {v5, v4, v7}, Ldc/b;->o(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    invoke-direct {v6, v7}, Lwd/h;-><init>(Ljava/lang/String;)V

    goto :goto_2

    :cond_4
    const-string v6, "aws_session_token"

    invoke-virtual {v2, v6, v8}, Lce/k;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v11

    new-instance v6, Lwd/a;

    const/4 v12, 0x0

    const/16 v14, 0x18

    invoke-static/range {v9 .. v14}, Ls93/h;->h(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;I)Lve/e;

    move-result-object v7

    invoke-direct {v6, v7}, Lwd/a;-><init>(Lve/e;)V

    new-instance v7, Lwd/i;

    invoke-direct {v7, v6}, Lwd/i;-><init>(Lrv/n;)V

    move-object v6, v7

    :goto_2
    nop

    instance-of v7, v6, Lwd/i;

    if-eqz v7, :cond_5

    check-cast v6, Lwd/i;

    iget-object v6, v6, Lwd/i;->a:Lrv/n;

    goto :goto_3

    :cond_5
    move-object v6, v8

    :goto_3
    if-nez v6, :cond_14

    const-string v6, "credential_source"

    invoke-interface {v3, v6}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v7

    const-string v9, "source_profile"

    if-nez v7, :cond_7

    invoke-interface {v3, v9}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_6

    goto :goto_4

    :cond_6
    const-string v7, "web_identity_token_file"

    invoke-interface {v3, v7}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_7

    goto :goto_5

    :cond_7
    :goto_4
    const-string v7, "role_arn"

    invoke-virtual {v2, v7, v8}, Lce/k;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v7

    if-nez v7, :cond_8

    :goto_5
    move-object v10, v8

    goto :goto_7

    :cond_8
    invoke-interface {v3, v9}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_9

    invoke-interface {v3, v6}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v10

    if-nez v10, :cond_9

    sget-object v3, Lwd/n;->w:Lwd/n;

    goto :goto_6

    :cond_9
    invoke-interface {v3, v6}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_a

    invoke-interface {v3, v9}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_a

    sget-object v3, Lwd/n;->x:Lwd/n;

    goto :goto_6

    :cond_a
    move-object v3, v8

    :goto_6
    new-instance v10, Lwd/m;

    const-string v11, "role_session_name"

    invoke-virtual {v2, v11, v8}, Lce/k;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v11

    const-string v12, "external_id"

    invoke-virtual {v2, v12, v8}, Lce/k;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v12

    invoke-direct {v10, v7, v3, v11, v12}, Lwd/m;-><init>(Ljava/lang/String;Lwd/n;Ljava/lang/String;Ljava/lang/String;)V

    :goto_7
    if-eqz v10, :cond_13

    invoke-virtual {v0, v10}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    invoke-virtual {v2, v9, v8}, Lce/k;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v2, v6, v8}, Lce/k;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v6

    if-eqz v3, :cond_c

    if-nez v6, :cond_b

    goto :goto_8

    :cond_b
    new-instance p0, Laws/sdk/kotlin/runtime/auth/credentials/ProviderConfigurationException;

    const-string v0, ") contained both `source_profile` and `credential_source`. Only one or the other can be defined."

    invoke-static {v5, v4, v0}, Ldc/b;->o(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0, v8}, Laws/sdk/kotlin/runtime/auth/credentials/ProviderConfigurationException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw p0

    :cond_c
    :goto_8
    if-nez v3, :cond_e

    if-eqz v6, :cond_d

    goto :goto_9

    :cond_d
    new-instance p0, Laws/sdk/kotlin/runtime/auth/credentials/ProviderConfigurationException;

    const-string v0, ") must contain `source_profile` or `credential_source` but neither were defined"

    invoke-static {v5, v4, v0}, Ldc/b;->o(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0, v8}, Laws/sdk/kotlin/runtime/auth/credentials/ProviderConfigurationException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw p0

    :cond_e
    :goto_9
    if-eqz v3, :cond_10

    if-nez v6, :cond_10

    invoke-virtual {v3, v4}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_f

    goto :goto_a

    :cond_f
    new-instance v4, Lwd/j;

    invoke-direct {v4, v3}, Lwd/j;-><init>(Ljava/lang/String;)V

    goto :goto_b

    :cond_10
    :goto_a
    sget-object v4, Lwd/k;->a:Lwd/k;

    :goto_b
    instance-of v3, v4, Lwd/k;

    if-eqz v3, :cond_11

    invoke-static {v2, p0}, Ls2/h;->e(Lce/k;Lce/j;)Lrv/n;

    move-result-object v6

    goto :goto_c

    :cond_11
    instance-of v2, v4, Lwd/j;

    if-eqz v2, :cond_12

    check-cast v4, Lwd/j;

    iget-object v7, v4, Lwd/j;->a:Ljava/lang/String;

    goto/16 :goto_0

    :cond_12
    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p0

    :cond_13
    invoke-static {v2, p0}, Ls2/h;->e(Lce/k;Lce/j;)Lrv/n;

    move-result-object v6

    :cond_14
    :goto_c
    invoke-static {v0}, Ljava/util/Collections;->reverse(Ljava/util/List;)V

    new-instance p0, Lwd/l;

    invoke-direct {p0, v6, v0}, Lwd/l;-><init>(Lrv/n;Ljava/util/ArrayList;)V

    return-object p0

    :cond_15
    new-instance p0, Laws/sdk/kotlin/runtime/auth/credentials/ProviderConfigurationException;

    new-instance v0, Ljava/lang/StringBuilder;

    const-string v2, "profile formed an infinite loop: "

    invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    const/4 v5, 0x0

    const/16 v6, 0x3e

    const-string v2, " -> "

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-static/range {v1 .. v6}, Lm83/s;->N0(Ljava/lang/Iterable;Ljava/lang/CharSequence;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;I)Ljava/lang/String;

    move-result-object v1

    const-string v2, " -> "

    invoke-static {v0, v1, v2, v7}, Lb9/y;->q(Ljava/lang/StringBuilder;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0, v8}, Laws/sdk/kotlin/runtime/auth/credentials/ProviderConfigurationException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V

    throw p0
.end method

.method public static final s(Lvg/n;Ls/m2;Ls83/c;)Ljava/lang/Object;
    .locals 4

    instance-of v0, p2, Lzd/a;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lzd/a;

    iget v1, v0, Lzd/a;->x:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lzd/a;->x:I

    goto :goto_0

    :cond_0
    new-instance v0, Lzd/a;

    invoke-direct {v0, p2}, Ls83/c;-><init>(Lq83/d;)V

    :goto_0
    iget-object p2, v0, Lzd/a;->w:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lzd/a;->x:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_2
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    sget-object p2, Lyd/f;->z:Ljf/a;

    invoke-static {p2, p0}, Ljf/e;->b(Ljf/a;Lvg/l;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/String;

    if-nez p0, :cond_4

    iput v3, v0, Lzd/a;->x:I

    invoke-virtual {p1, v0}, Ls/m2;->g(Ls83/c;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v1, :cond_3

    return-object v1

    :cond_3
    :goto_1
    check-cast p2, Lce/k;

    const-string p0, "<this>"

    invoke-static {p2, p0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p0, "auth_scheme_preference"

    const/4 p1, 0x0

    invoke-virtual {p2, p0, p1}, Lce/k;->a(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object p0

    :cond_4
    if-eqz p0, :cond_9

    const-string p1, ","

    filled-new-array {p1}, [Ljava/lang/String;

    move-result-object p1

    const/4 p2, 0x6

    invoke-static {p0, p1, p2}, Lyb3/r;->y0(Ljava/lang/CharSequence;[Ljava/lang/String;I)Ljava/util/List;

    move-result-object p0

    check-cast p0, Ljava/lang/Iterable;

    new-instance p1, Ljava/util/ArrayList;

    const/16 p2, 0xa

    invoke-static {p0, p2}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v0

    invoke-direct {p1, v0}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_2
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_5

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-static {v0}, Lyb3/r;->O0(Ljava/lang/CharSequence;)Ljava/lang/CharSequence;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_2

    :cond_5
    new-instance p0, Ljava/util/ArrayList;

    invoke-direct {p0}, Ljava/util/ArrayList;-><init>()V

    invoke-virtual {p1}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p1

    :cond_6
    :goto_3
    invoke-interface {p1}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_7

    invoke-interface {p1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    move-object v1, v0

    check-cast v1, Ljava/lang/String;

    invoke-virtual {v1}, Ljava/lang/String;->length()I

    move-result v1

    if-lez v1, :cond_6

    invoke-virtual {p0, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_3

    :cond_7
    new-instance p1, Ljava/util/ArrayList;

    invoke-static {p0, p2}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result p2

    invoke-direct {p1, p2}, Ljava/util/ArrayList;-><init>(I)V

    invoke-virtual {p0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_4
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result p2

    if-eqz p2, :cond_8

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/String;

    const-string v0, "id"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lue/b;

    invoke-direct {v0, p2}, Lue/b;-><init>(Ljava/lang/String;)V

    invoke-virtual {p1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_4

    :cond_8
    invoke-static {p1}, Lm83/s;->D1(Ljava/lang/Iterable;)Ljava/util/List;

    move-result-object p0

    return-object p0

    :cond_9
    sget-object p0, Lm83/y;->w:Lm83/y;

    return-object p0
.end method

.method public static final t(F)Ln6/o;
    .locals 2

    new-instance v0, Lv6/v;

    new-instance v1, La7/a;

    invoke-direct {v1, p0}, La7/a;-><init>(F)V

    invoke-direct {v0, v1}, Lv6/v;-><init>(La7/e;)V

    invoke-static {v0, p0}, Ls2/d;->o(Ln6/o;F)Ln6/o;

    move-result-object p0

    return-object p0
.end method

.method public static u(Ljava/util/List;)Ljava/util/LinkedList;
    .locals 6

    if-nez p0, :cond_0

    const/4 p0, 0x0

    return-object p0

    :cond_0
    new-instance v0, Ljava/util/LinkedList;

    invoke-direct {v0}, Ljava/util/LinkedList;-><init>()V

    const/4 v1, 0x0

    move v2, v1

    :goto_0
    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result v3

    if-ge v2, v3, :cond_3

    invoke-interface {p0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    const-string v4, "The X.509 certificate at position "

    if-eqz v3, :cond_2

    instance-of v5, v3, Ljava/lang/String;

    if-eqz v5, :cond_1

    new-instance v4, Lxw/a;

    check-cast v3, Ljava/lang/String;

    invoke-direct {v4, v3}, Lxw/a;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v4}, Ljava/util/LinkedList;->add(Ljava/lang/Object;)Z

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_1
    new-instance p0, Ljava/text/ParseException;

    const-string v0, " must be encoded as a Base64 string"

    invoke-static {v2, v4, v0}, Lb9/y;->i(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0, v1}, Ljava/text/ParseException;-><init>(Ljava/lang/String;I)V

    throw p0

    :cond_2
    new-instance p0, Ljava/text/ParseException;

    const-string v0, " must not be null"

    invoke-static {v2, v4, v0}, Lb9/y;->i(ILjava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    invoke-direct {p0, v0, v1}, Ljava/text/ParseException;-><init>(Ljava/lang/String;I)V

    throw p0

    :cond_3
    return-object v0
.end method
