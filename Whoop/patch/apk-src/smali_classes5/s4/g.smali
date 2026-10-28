.class public abstract Ls4/g;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lwy/b;


# direct methods
.method public static final a(FIJJLandroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V
    .locals 18

    move/from16 v7, p1

    move-object/from16 v14, p6

    check-cast v14, Lp1/q;

    const v0, -0x60153b45

    invoke-virtual {v14, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, v7, 0x6

    move-object/from16 v8, p7

    if-nez v0, :cond_1

    invoke-virtual {v14, v8}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x4

    goto :goto_0

    :cond_0
    const/4 v0, 0x2

    :goto_0
    or-int/2addr v0, v7

    goto :goto_1

    :cond_1
    move v0, v7

    :goto_1
    and-int/lit8 v1, v7, 0x30

    move-wide/from16 v9, p2

    if-nez v1, :cond_3

    invoke-virtual {v14, v9, v10}, Lp1/q;->f(J)Z

    move-result v1

    if-eqz v1, :cond_2

    const/16 v1, 0x20

    goto :goto_2

    :cond_2
    const/16 v1, 0x10

    :goto_2
    or-int/2addr v0, v1

    :cond_3
    and-int/lit16 v1, v7, 0x180

    move/from16 v11, p0

    if-nez v1, :cond_5

    invoke-virtual {v14, v11}, Lp1/q;->d(F)Z

    move-result v1

    if-eqz v1, :cond_4

    const/16 v1, 0x100

    goto :goto_3

    :cond_4
    const/16 v1, 0x80

    :goto_3
    or-int/2addr v0, v1

    :cond_5
    or-int/lit16 v1, v0, 0xc00

    and-int/lit16 v2, v7, 0x6000

    if-nez v2, :cond_6

    or-int/lit16 v1, v0, 0x2c00

    :cond_6
    and-int/lit16 v0, v1, 0x2493

    const/16 v2, 0x2492

    if-ne v0, v2, :cond_8

    invoke-virtual {v14}, Lp1/q;->F()Z

    move-result v0

    if-nez v0, :cond_7

    goto :goto_4

    :cond_7
    invoke-virtual {v14}, Lp1/q;->X()V

    move-wide/from16 v5, p4

    goto/16 :goto_8

    :cond_8
    :goto_4
    invoke-virtual {v14}, Lp1/q;->Z()V

    and-int/lit8 v0, v7, 0x1

    const v2, -0xe001

    if-eqz v0, :cond_a

    invoke-virtual {v14}, Lp1/q;->C()Z

    move-result v0

    if-eqz v0, :cond_9

    goto :goto_5

    :cond_9
    invoke-virtual {v14}, Lp1/q;->X()V

    and-int v0, v1, v2

    move-wide/from16 v12, p4

    goto :goto_6

    :cond_a
    :goto_5
    sget-wide v3, Li2/x;->m:J

    and-int v0, v1, v2

    move-wide v12, v3

    :goto_6
    invoke-virtual {v14}, Lp1/q;->r()V

    sget-object v1, Lb3/k2;->a:Lp1/u2;

    invoke-virtual {v14, v1}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    const/4 v2, 0x0

    if-eqz v1, :cond_b

    const v1, 0x253ee451

    invoke-virtual {v14, v1}, Lp1/q;->e0(I)V

    shl-int/lit8 v0, v0, 0x3

    and-int/lit8 v1, v0, 0x70

    or-int/lit8 v1, v1, 0x6

    and-int/lit16 v3, v0, 0x380

    or-int/2addr v1, v3

    and-int/lit16 v3, v0, 0x1c00

    or-int/2addr v1, v3

    const v3, 0xe000

    and-int/2addr v0, v3

    or-int/2addr v0, v1

    move-object v15, v8

    move v8, v11

    move-wide v10, v9

    move v9, v0

    invoke-static/range {v8 .. v15}, Lg1/v4;->a(FIJJLandroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    invoke-virtual {v14, v2}, Lp1/q;->q(Z)V

    goto :goto_7

    :cond_b
    const v1, 0x25432c37

    invoke-virtual {v14, v1}, Lp1/q;->e0(I)V

    const v1, 0xfffe

    and-int v16, v0, v1

    const/16 v17, 0x0

    move-object v15, v14

    const/4 v14, 0x0

    move/from16 v11, p0

    move-wide/from16 v9, p2

    move-object/from16 v8, p7

    invoke-static/range {v8 .. v17}, Lg1/v4;->b(Landroidx/compose/ui/Modifier;JFJILandroidx/compose/runtime/Composer;II)V

    move-object v14, v15

    invoke-virtual {v14, v2}, Lp1/q;->q(Z)V

    :goto_7
    move-wide v5, v12

    :goto_8
    invoke-virtual {v14}, Lp1/q;->u()Lp1/v1;

    move-result-object v10

    if-eqz v10, :cond_c

    new-instance v0, Lg1/q4;

    const/4 v8, 0x3

    const/4 v9, 0x0

    move/from16 v4, p0

    move-wide/from16 v2, p2

    move-object/from16 v1, p7

    invoke-direct/range {v0 .. v9}, Lg1/q4;-><init>(Landroidx/compose/ui/Modifier;JFJIIB)V

    iput-object v0, v10, Lp1/v1;->d:Lc93/m;

    :cond_c
    return-void
.end method

.method public static final b(Ly2/i1;Z[Ly2/o;F)F
    .locals 6

    array-length v0, p2

    const/high16 v1, 0x7fc00000    # Float.NaN

    const/4 v2, 0x0

    move v3, v2

    :goto_0
    if-ge v3, v0, :cond_3

    aget-object v4, p2, v3

    invoke-virtual {p0, v4}, Ly2/i1;->b(Ly2/o;)F

    move-result v4

    invoke-static {v1}, Ljava/lang/Float;->isNaN(F)Z

    move-result v5

    if-nez v5, :cond_1

    cmpl-float v5, v4, v1

    if-lez v5, :cond_0

    const/4 v5, 0x1

    goto :goto_1

    :cond_0
    move v5, v2

    :goto_1
    if-ne p1, v5, :cond_2

    :cond_1
    move v1, v4

    :cond_2
    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_3
    invoke-static {v1}, Ljava/lang/Float;->isNaN(F)Z

    move-result p0

    if-eqz p0, :cond_4

    return p3

    :cond_4
    return v1
.end method

.method public static final c(Lx6/u;Landroid/content/Context;Lp6/l;Lx6/t;Lwr1/f;Ls83/c;)Ljava/lang/Object;
    .locals 18

    move-object/from16 v5, p0

    move-object/from16 v3, p1

    move-object/from16 v2, p2

    move-object/from16 v0, p5

    instance-of v1, v0, Lx6/r;

    if-eqz v1, :cond_0

    move-object v1, v0

    check-cast v1, Lx6/r;

    iget v4, v1, Lx6/r;->J:I

    const/high16 v6, -0x80000000

    and-int v7, v4, v6

    if-eqz v7, :cond_0

    sub-int/2addr v4, v6

    iput v4, v1, Lx6/r;->J:I

    :goto_0
    move-object v10, v1

    goto :goto_1

    :cond_0
    new-instance v1, Lx6/r;

    invoke-direct {v1, v0}, Ls83/c;-><init>(Lq83/d;)V

    goto :goto_0

    :goto_1
    iget-object v0, v10, Lx6/r;->I:Ljava/lang/Object;

    sget-object v11, Lr83/a;->w:Lr83/a;

    iget v1, v10, Lx6/r;->J:I

    const/4 v12, 0x2

    const/4 v13, 0x1

    const/4 v14, 0x0

    if-eqz v1, :cond_3

    if-eq v1, v13, :cond_2

    if-ne v1, v12, :cond_1

    iget-object v1, v10, Lx6/r;->z:Ljava/lang/Object;

    check-cast v1, Lp1/s;

    iget-object v2, v10, Lx6/r;->y:Ljava/lang/Object;

    check-cast v2, Lp1/y1;

    iget-object v3, v10, Lx6/r;->x:Ljava/lang/Object;

    check-cast v3, Lbc3/k1;

    iget-object v4, v10, Lx6/r;->w:Ljava/lang/Object;

    check-cast v4, Lx6/d;

    :try_start_0
    invoke-static {v0}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto/16 :goto_4

    :catchall_0
    move-exception v0

    goto/16 :goto_8

    :cond_1
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_2
    iget-object v1, v10, Lx6/r;->H:Lp1/w;

    iget-object v2, v10, Lx6/r;->G:Lp1/y1;

    iget-object v3, v10, Lx6/r;->F:Lbc3/c2;

    iget-object v4, v10, Lx6/r;->E:Lx6/d;

    iget-object v5, v10, Lx6/r;->z:Ljava/lang/Object;

    check-cast v5, Lx6/t;

    iget-object v6, v10, Lx6/r;->y:Ljava/lang/Object;

    check-cast v6, Lp6/l;

    iget-object v7, v10, Lx6/r;->x:Ljava/lang/Object;

    check-cast v7, Landroid/content/Context;

    iget-object v8, v10, Lx6/r;->w:Ljava/lang/Object;

    check-cast v8, Lx6/u;

    :try_start_1
    invoke-static {v0}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    move-object v15, v4

    move-object v4, v2

    move-object v2, v6

    move-object v6, v3

    move-object v3, v7

    move-object v7, v5

    move-object v5, v8

    goto/16 :goto_2

    :cond_3
    invoke-static {v0}, Lts/o;->I(Ljava/lang/Object;)V

    new-instance v15, Lx6/d;

    invoke-direct {v15, v5}, Lx6/d;-><init>(Lx6/u;)V

    new-instance v0, Lh20/u4;

    const/4 v1, 0x2

    invoke-direct {v0, v12, v1, v14}, Lh20/u4;-><init>(IILq83/d;)V

    const/4 v8, 0x3

    invoke-static {v5, v14, v14, v0, v8}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    move-result-object v9

    invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v0, Lp6/m1;

    const/16 v1, 0x32

    invoke-direct {v0, v1}, Lp6/m1;-><init>(I)V

    sget-object v1, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-static {v1}, Lec3/v;->c(Ljava/lang/Object;)Lec3/h2;

    move-result-object v16

    new-instance v1, Lx6/q;

    invoke-direct {v1, v5, v2, v3}, Lx6/q;-><init>(Lx6/u;Lp6/l;Landroid/content/Context;)V

    invoke-virtual/range {p4 .. p4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {}, Lbc3/f0;->c()Lbc3/l1;

    move-result-object v4

    move-object v6, v5

    check-cast v6, Lx6/v;

    iget-object v6, v6, Lx6/v;->w:Lbc3/c0;

    invoke-interface {v6}, Lbc3/c0;->getCoroutineContext()Lq83/j;

    move-result-object v7

    sget-object v8, Lbc3/j1;->w:Lbc3/j1;

    invoke-interface {v7, v8}, Lq83/j;->get(Lq83/i;)Lq83/h;

    move-result-object v7

    check-cast v7, Lbc3/k1;

    if-eqz v7, :cond_4

    new-instance v8, Lx30/h1;

    const/4 v13, 0x1

    invoke-direct {v8, v4, v13}, Lx30/h1;-><init>(Ljava/lang/Object;I)V

    invoke-interface {v7, v8}, Lbc3/k1;->invokeOnCompletion(Lkotlin/jvm/functions/Function1;)Lbc3/s0;

    :cond_4
    invoke-interface {v6}, Lbc3/c0;->getCoroutineContext()Lq83/j;

    move-result-object v6

    invoke-interface {v6, v4}, Lq83/j;->plus(Lq83/j;)Lq83/j;

    move-result-object v4

    invoke-interface {v4, v1}, Lq83/j;->plus(Lq83/j;)Lq83/j;

    move-result-object v1

    new-instance v4, Lp1/y1;

    invoke-direct {v4, v1}, Lp1/y1;-><init>(Lq83/j;)V

    new-instance v1, Ln6/b;

    invoke-direct {v1, v0}, Lhb3/a0;-><init>(Ljava/lang/Object;)V

    new-instance v6, Lp1/w;

    invoke-direct {v6, v4, v1}, Lp1/w;-><init>(Lp1/t;Lhb3/a0;)V

    move-object v1, v0

    :try_start_2
    new-instance v0, La30/s;
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_6

    move-object v7, v1

    move-object v1, v6

    const/4 v6, 0x0

    move-object v8, v7

    const/4 v7, 0x6

    :try_start_3
    invoke-direct/range {v0 .. v7}, La30/s;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_5

    move-object v13, v1

    move-object v1, v4

    :try_start_4
    invoke-static {v5, v15, v14, v0, v12}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    new-instance v0, La30/q;
    :try_end_4
    .catchall {:try_start_4 .. :try_end_4} :catchall_4

    move-object v7, v8

    const/4 v8, 0x0

    move-object v2, v9

    const/4 v9, 0x3

    move-object/from16 v4, p1

    move-object/from16 v17, v2

    move-object v6, v5

    move-object v5, v7

    move-object/from16 v3, v16

    const/4 v12, 0x3

    move-object/from16 v2, p2

    move-object/from16 v7, p3

    :try_start_5
    invoke-direct/range {v0 .. v9}, La30/q;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V

    move-object v5, v4

    move-object v4, v0

    move-object v0, v3

    move-object v3, v5

    move-object v5, v6

    invoke-static {v5, v14, v14, v4, v12}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    new-instance v4, Lh40/c;

    const/4 v6, 0x5

    const/4 v7, 0x2

    invoke-direct {v4, v7, v6, v14}, Lh40/c;-><init>(IILq83/d;)V

    iput-object v5, v10, Lx6/r;->w:Ljava/lang/Object;

    iput-object v3, v10, Lx6/r;->x:Ljava/lang/Object;

    iput-object v2, v10, Lx6/r;->y:Ljava/lang/Object;

    move-object/from16 v7, p3

    iput-object v7, v10, Lx6/r;->z:Ljava/lang/Object;

    iput-object v15, v10, Lx6/r;->E:Lx6/d;
    :try_end_5
    .catchall {:try_start_5 .. :try_end_5} :catchall_3

    move-object/from16 v6, v17

    :try_start_6
    iput-object v6, v10, Lx6/r;->F:Lbc3/c2;

    iput-object v1, v10, Lx6/r;->G:Lp1/y1;

    iput-object v13, v10, Lx6/r;->H:Lp1/w;

    const/4 v8, 0x1

    iput v8, v10, Lx6/r;->J:I

    invoke-static {v0, v4, v10}, Lec3/v;->z(Lec3/l;Lc93/m;Lq83/d;)Ljava/lang/Object;

    move-result-object v0
    :try_end_6
    .catchall {:try_start_6 .. :try_end_6} :catchall_2

    if-ne v0, v11, :cond_5

    goto :goto_3

    :cond_5
    move-object v4, v1

    move-object v1, v13

    :goto_2
    :try_start_7
    new-instance v0, Lwc/e1;

    invoke-direct {v0, v5, v7, v2, v15}, Lwc/e1;-><init>(Lx6/u;Lx6/t;Lp6/l;Lx6/d;)V

    iput-object v15, v10, Lx6/r;->w:Ljava/lang/Object;

    iput-object v6, v10, Lx6/r;->x:Ljava/lang/Object;

    iput-object v4, v10, Lx6/r;->y:Ljava/lang/Object;

    iput-object v1, v10, Lx6/r;->z:Ljava/lang/Object;

    iput-object v14, v10, Lx6/r;->E:Lx6/d;

    iput-object v14, v10, Lx6/r;->F:Lbc3/c2;

    iput-object v14, v10, Lx6/r;->G:Lp1/y1;

    iput-object v14, v10, Lx6/r;->H:Lp1/w;

    const/4 v7, 0x2

    iput v7, v10, Lx6/r;->J:I

    invoke-virtual {v2, v3, v0, v10}, Lp6/l;->c(Landroid/content/Context;Lwc/e1;Ls83/c;)Ljava/lang/Object;

    move-result-object v0
    :try_end_7
    .catchall {:try_start_7 .. :try_end_7} :catchall_1

    if-ne v0, v11, :cond_6

    :goto_3
    return-object v11

    :cond_6
    move-object v2, v4

    move-object v3, v6

    move-object v4, v15

    :goto_4
    invoke-interface {v1}, Lp1/s;->dispose()V

    invoke-virtual {v4}, Lx6/d;->a()V

    invoke-interface {v3, v14}, Lbc3/k1;->cancel(Ljava/util/concurrent/CancellationException;)V

    invoke-virtual {v2}, Lp1/y1;->v()V

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0

    :catchall_1
    move-exception v0

    move-object v2, v4

    move-object v3, v6

    :goto_5
    move-object v4, v15

    goto :goto_8

    :catchall_2
    move-exception v0

    :goto_6
    move-object v2, v1

    move-object v3, v6

    move-object v1, v13

    goto :goto_5

    :catchall_3
    move-exception v0

    move-object/from16 v6, v17

    goto :goto_6

    :catchall_4
    move-exception v0

    :goto_7
    move-object v6, v9

    goto :goto_6

    :catchall_5
    move-exception v0

    move-object v13, v1

    move-object v1, v4

    goto :goto_7

    :catchall_6
    move-exception v0

    move-object v1, v4

    move-object v13, v6

    goto :goto_7

    :goto_8
    invoke-interface {v1}, Lp1/s;->dispose()V

    invoke-virtual {v4}, Lx6/d;->a()V

    invoke-interface {v3, v14}, Lbc3/k1;->cancel(Ljava/util/concurrent/CancellationException;)V

    invoke-virtual {v2}, Lp1/y1;->v()V

    throw v0
.end method

.method public static d(Ljava/lang/String;Z)V
    .locals 0

    if-eqz p1, :cond_0

    return-void

    :cond_0
    const/4 p1, 0x0

    invoke-static {p1, p0}, Lcom/google/android/exoplayer2/ParserException;->a(Ljava/lang/Exception;Ljava/lang/String;)Lcom/google/android/exoplayer2/ParserException;

    move-result-object p0

    throw p0
.end method

.method public static final e(Lsz/b0;)Lux/j;
    .locals 4

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lux/j;

    iget-boolean v1, p0, Lsz/b0;->w:Z

    iget-object v2, p0, Lsz/b0;->x:Lsz/a0;

    invoke-virtual {v2}, Ljava/lang/Enum;->ordinal()I

    move-result v2

    if-eqz v2, :cond_1

    const/4 v3, 0x1

    if-ne v2, v3, :cond_0

    sget-object v2, Lux/i;->y:Lux/i;

    goto :goto_0

    :cond_0
    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p0

    :cond_1
    sget-object v2, Lux/i;->x:Lux/i;

    :goto_0
    iget-boolean p0, p0, Lsz/b0;->y:Z

    invoke-direct {v0, v1, v2, p0}, Lux/j;-><init>(ZLux/i;Z)V

    return-object v0
.end method

.method public static f(Landroid/graphics/drawable/Icon;)Landroidx/core/graphics/drawable/IconCompat;
    .locals 2

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p0}, Landroid/graphics/drawable/Icon;->getType()I

    move-result v0

    const/4 v1, 0x2

    if-eq v0, v1, :cond_2

    const/4 v1, 0x4

    if-eq v0, v1, :cond_1

    const/4 v1, 0x6

    if-eq v0, v1, :cond_0

    new-instance v0, Landroidx/core/graphics/drawable/IconCompat;

    const/4 v1, -0x1

    invoke-direct {v0, v1}, Landroidx/core/graphics/drawable/IconCompat;-><init>(I)V

    iput-object p0, v0, Landroidx/core/graphics/drawable/IconCompat;->b:Ljava/lang/Object;

    return-object v0

    :cond_0
    invoke-virtual {p0}, Landroid/graphics/drawable/Icon;->getUri()Landroid/net/Uri;

    move-result-object p0

    sget-object v0, Landroidx/core/graphics/drawable/IconCompat;->k:Landroid/graphics/PorterDuff$Mode;

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p0}, Landroid/net/Uri;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v0, Landroidx/core/graphics/drawable/IconCompat;

    invoke-direct {v0, v1}, Landroidx/core/graphics/drawable/IconCompat;-><init>(I)V

    iput-object p0, v0, Landroidx/core/graphics/drawable/IconCompat;->b:Ljava/lang/Object;

    return-object v0

    :cond_1
    invoke-virtual {p0}, Landroid/graphics/drawable/Icon;->getUri()Landroid/net/Uri;

    move-result-object p0

    sget-object v0, Landroidx/core/graphics/drawable/IconCompat;->k:Landroid/graphics/PorterDuff$Mode;

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p0}, Landroid/net/Uri;->toString()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    new-instance v0, Landroidx/core/graphics/drawable/IconCompat;

    invoke-direct {v0, v1}, Landroidx/core/graphics/drawable/IconCompat;-><init>(I)V

    iput-object p0, v0, Landroidx/core/graphics/drawable/IconCompat;->b:Ljava/lang/Object;

    return-object v0

    :cond_2
    invoke-virtual {p0}, Landroid/graphics/drawable/Icon;->getResPackage()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p0}, Landroid/graphics/drawable/Icon;->getResId()I

    move-result p0

    const/4 v1, 0x0

    invoke-static {v1, v0, p0}, Landroidx/core/graphics/drawable/IconCompat;->e(Landroid/content/res/Resources;Ljava/lang/String;I)Landroidx/core/graphics/drawable/IconCompat;

    move-result-object p0

    return-object p0
.end method

.method public static final g(Lb9/b;)Lud/e;
    .locals 4

    new-instance v0, Lf9/u;

    const/4 v1, 0x3

    invoke-direct {v0, v1}, Lf9/u;-><init>(I)V

    :goto_0
    invoke-virtual {p0}, Lb9/b;->t()Lb9/b;

    move-result-object v1

    if-nez v1, :cond_2

    iget-object p0, v0, Lf9/u;->b:Ljava/lang/String;

    const-string v1, ""

    if-nez p0, :cond_0

    iput-object v1, v0, Lf9/u;->b:Ljava/lang/String;

    :cond_0
    iget-object p0, v0, Lf9/u;->c:Ljava/lang/String;

    if-nez p0, :cond_1

    iput-object v1, v0, Lf9/u;->c:Ljava/lang/String;

    :cond_1
    new-instance p0, Lud/e;

    invoke-direct {p0, v0}, Lud/e;-><init>(Lf9/u;)V

    return-object p0

    :cond_2
    invoke-virtual {v1}, Lb9/b;->q()Ljava/lang/String;

    move-result-object v2

    const-string v3, "AssumedRoleId"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_4

    :try_start_0
    invoke-static {v1}, Lvd/f;->l(Lb9/b;)Ljava/lang/String;

    move-result-object v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_1

    :catchall_0
    move-exception v2

    invoke-static {v2}, Lts/o;->l(Ljava/lang/Throwable;)Ll83/m;

    move-result-object v2

    :goto_1
    invoke-static {v2}, Ll83/n;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v3

    if-nez v3, :cond_3

    goto :goto_2

    :cond_3
    const-string v2, "expected (string: `com.amazonaws.sts#assumedRoleIdType`)"

    invoke-static {v2, v3}, Lte0/d;->u(Ljava/lang/String;Ljava/lang/Throwable;)Ll83/m;

    move-result-object v2

    :goto_2
    invoke-static {v2}, Lts/o;->I(Ljava/lang/Object;)V

    check-cast v2, Ljava/lang/String;

    iput-object v2, v0, Lf9/u;->c:Ljava/lang/String;

    goto :goto_5

    :cond_4
    const-string v3, "Arn"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_6

    :try_start_1
    invoke-static {v1}, Lvd/f;->l(Lb9/b;)Ljava/lang/String;

    move-result-object v2
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    goto :goto_3

    :catchall_1
    move-exception v2

    invoke-static {v2}, Lts/o;->l(Ljava/lang/Throwable;)Ll83/m;

    move-result-object v2

    :goto_3
    invoke-static {v2}, Ll83/n;->a(Ljava/lang/Object;)Ljava/lang/Throwable;

    move-result-object v3

    if-nez v3, :cond_5

    goto :goto_4

    :cond_5
    const-string v2, "expected (string: `com.amazonaws.sts#arnType`)"

    invoke-static {v2, v3}, Lte0/d;->u(Ljava/lang/String;Ljava/lang/Throwable;)Ll83/m;

    move-result-object v2

    :goto_4
    invoke-static {v2}, Lts/o;->I(Ljava/lang/Object;)V

    check-cast v2, Ljava/lang/String;

    iput-object v2, v0, Lf9/u;->b:Ljava/lang/String;

    :cond_6
    :goto_5
    invoke-virtual {v1}, Lb9/b;->j()V

    goto :goto_0
.end method

.method public static h(Landroid/content/Intent;Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;
    .locals 2

    sget v0, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v1, 0x22

    if-lt v0, v1, :cond_0

    invoke-static {p0, p1, p2}, Lc4/v;->d(Landroid/content/Intent;Ljava/lang/String;Ljava/lang/Class;)Ljava/lang/Object;

    move-result-object p0

    return-object p0

    :cond_0
    invoke-virtual {p0, p1}, Landroid/content/Intent;->getParcelableExtra(Ljava/lang/String;)Landroid/os/Parcelable;

    move-result-object p0

    invoke-virtual {p2, p0}, Ljava/lang/Class;->isInstance(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    return-object p0

    :cond_1
    const/4 p0, 0x0

    return-object p0
.end method

.method public static synthetic i(Ly00/c8;)I
    .locals 1

    const-string v0, "intent"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of p0, p0, Ly00/l3;

    if-eqz p0, :cond_0

    const p0, 0xc350

    return p0

    :cond_0
    const p0, 0xc351

    return p0
.end method

.method public static j(Lorg/json/JSONObject;)Ly00/z3;
    .locals 35

    move-object/from16 v0, p0

    sget-object v1, Ly00/i;->M:Lt9/c0;

    const-string v2, "brand"

    invoke-static {v2, v0}, Ls/s;->t(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-static {v2}, Lt9/c0;->i(Ljava/lang/String;)Ly00/i;

    move-result-object v4

    const-string v1, "checks"

    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v1

    if-eqz v1, :cond_0

    new-instance v3, Ly00/w3;

    const-string v5, "address_line1_check"

    invoke-static {v5, v1}, Ls/s;->t(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    move-result-object v5

    const-string v6, "address_postal_code_check"

    invoke-static {v6, v1}, Ls/s;->t(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    move-result-object v6

    const-string v7, "cvc_check"

    invoke-static {v7, v1}, Ls/s;->t(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v3, v5, v6, v1}, Ly00/w3;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    move-object v5, v3

    goto :goto_0

    :cond_0
    const/4 v5, 0x0

    :goto_0
    const-string v1, "country"

    invoke-static {v1, v0}, Ls/s;->t(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    move-result-object v6

    const-string v1, "exp_month"

    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v3

    if-nez v3, :cond_1

    const/4 v7, 0x0

    goto :goto_1

    :cond_1
    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    move-object v7, v1

    :goto_1
    const-string v1, "exp_year"

    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v3

    if-nez v3, :cond_2

    const/4 v8, 0x0

    goto :goto_2

    :cond_2
    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->optInt(Ljava/lang/String;)I

    move-result v1

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    move-object v8, v1

    :goto_2
    const-string v1, "fingerprint"

    invoke-static {v1, v0}, Ls/s;->t(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    move-result-object v9

    const-string v1, "funding"

    invoke-static {v1, v0}, Ls/s;->t(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    move-result-object v10

    const-string v1, "last4"

    invoke-static {v1, v0}, Ls/s;->t(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    move-result-object v11

    const-string v1, "three_d_secure_usage"

    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v1

    if-eqz v1, :cond_4

    new-instance v3, Ly00/y3;

    const-string v12, "supported"

    invoke-virtual {v1, v12}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v13

    const/4 v14, 0x0

    if-eqz v13, :cond_3

    invoke-virtual {v1, v12, v14}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z

    move-result v1

    if-eqz v1, :cond_3

    const/4 v14, 0x1

    :cond_3
    invoke-direct {v3, v14}, Ly00/y3;-><init>(Z)V

    move-object v12, v3

    goto :goto_3

    :cond_4
    const/4 v12, 0x0

    :goto_3
    const-string v1, "wallet"

    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v1

    if-eqz v1, :cond_d

    sget-object v3, La10/h;->x:Lkr/e;

    const-string v13, "type"

    invoke-static {v13, v1}, Ls/s;->t(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    move-result-object v13

    invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v3, La10/h;->K:Lt83/b;

    invoke-virtual {v3}, Lm83/e;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_5
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v14

    if-eqz v14, :cond_6

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v14

    move-object v2, v14

    check-cast v2, La10/h;

    iget-object v2, v2, La10/h;->w:Ljava/lang/String;

    invoke-virtual {v2, v13}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_5

    goto :goto_4

    :cond_6
    const/4 v14, 0x0

    :goto_4
    check-cast v14, La10/h;

    if-nez v14, :cond_7

    goto :goto_5

    :cond_7
    iget-object v2, v14, La10/h;->w:Ljava/lang/String;

    invoke-virtual {v1, v2}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v2

    if-nez v2, :cond_8

    :goto_5
    move-object/from16 v22, v4

    move-object/from16 v23, v5

    move-object/from16 v24, v6

    move-object/from16 v25, v7

    move-object/from16 v26, v8

    move-object/from16 v27, v9

    const/4 v15, 0x0

    goto/16 :goto_a

    :cond_8
    const-string v3, "dynamic_last4"

    invoke-static {v3, v1}, Ls/s;->t(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v14}, Ljava/lang/Enum;->ordinal()I

    move-result v3

    const-string v13, "shipping_address"

    const-string v14, "name"

    const-string v15, "email"

    move/from16 v17, v3

    const-string v3, "billing_address"

    move-object/from16 v22, v4

    const-string v4, "city"

    move-object/from16 v23, v5

    const-string v5, "country"

    move-object/from16 v24, v6

    const-string v6, "line1"

    move-object/from16 v25, v7

    const-string v7, "line2"

    move-object/from16 v26, v8

    const-string v8, "postal_code"

    move-object/from16 v27, v9

    const-string v9, "state"

    packed-switch v17, :pswitch_data_0

    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0

    :pswitch_0
    new-instance v15, La10/e;

    invoke-direct {v15, v1}, La10/e;-><init>(Ljava/lang/String;)V

    goto/16 :goto_a

    :pswitch_1
    invoke-virtual {v2, v3}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v3

    if-eqz v3, :cond_9

    invoke-static {v4, v3}, Ls/s;->t(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    move-result-object v29

    invoke-static {v5, v3}, Ls/s;->t(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    move-result-object v30

    invoke-static {v6, v3}, Ls/s;->t(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    move-result-object v31

    invoke-static {v7, v3}, Ls/s;->t(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    move-result-object v32

    invoke-static {v8, v3}, Ls/s;->t(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    move-result-object v33

    invoke-static {v9, v3}, Ls/s;->t(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    move-result-object v34

    new-instance v28, Ly00/c;

    invoke-direct/range {v28 .. v34}, Ly00/c;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    move-object/from16 v17, v28

    goto :goto_6

    :cond_9
    const/16 v17, 0x0

    :goto_6
    invoke-static {v15, v2}, Ls/s;->t(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    move-result-object v18

    invoke-static {v14, v2}, Ls/s;->t(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    move-result-object v19

    invoke-virtual {v2, v13}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v2

    if-eqz v2, :cond_a

    invoke-static {v4, v2}, Ls/s;->t(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    move-result-object v29

    invoke-static {v5, v2}, Ls/s;->t(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    move-result-object v30

    invoke-static {v6, v2}, Ls/s;->t(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    move-result-object v31

    invoke-static {v7, v2}, Ls/s;->t(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    move-result-object v32

    invoke-static {v8, v2}, Ls/s;->t(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    move-result-object v33

    invoke-static {v9, v2}, Ls/s;->t(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    move-result-object v34

    new-instance v28, Ly00/c;

    invoke-direct/range {v28 .. v34}, Ly00/c;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    move-object/from16 v20, v28

    goto :goto_7

    :cond_a
    const/16 v20, 0x0

    :goto_7
    new-instance v16, La10/i;

    move-object/from16 v21, v1

    invoke-direct/range {v16 .. v21}, La10/i;-><init>(Ly00/c;Ljava/lang/String;Ljava/lang/String;Ly00/c;Ljava/lang/String;)V

    move-object/from16 v15, v16

    goto/16 :goto_a

    :pswitch_2
    new-instance v15, La10/g;

    invoke-direct {v15, v1}, La10/g;-><init>(Ljava/lang/String;)V

    goto/16 :goto_a

    :pswitch_3
    invoke-virtual {v2, v3}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v1

    if-eqz v1, :cond_b

    invoke-static {v4, v1}, Ls/s;->t(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    move-result-object v29

    invoke-static {v5, v1}, Ls/s;->t(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    move-result-object v30

    invoke-static {v6, v1}, Ls/s;->t(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    move-result-object v31

    invoke-static {v7, v1}, Ls/s;->t(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    move-result-object v32

    invoke-static {v8, v1}, Ls/s;->t(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    move-result-object v33

    invoke-static {v9, v1}, Ls/s;->t(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    move-result-object v34

    new-instance v28, Ly00/c;

    invoke-direct/range {v28 .. v34}, Ly00/c;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    move-object/from16 v1, v28

    goto :goto_8

    :cond_b
    const/4 v1, 0x0

    :goto_8
    invoke-static {v15, v2}, Ls/s;->t(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v14, v2}, Ls/s;->t(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    move-result-object v14

    invoke-virtual {v2, v13}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v2

    if-eqz v2, :cond_c

    invoke-static {v4, v2}, Ls/s;->t(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    move-result-object v29

    invoke-static {v5, v2}, Ls/s;->t(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    move-result-object v30

    invoke-static {v6, v2}, Ls/s;->t(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    move-result-object v31

    invoke-static {v7, v2}, Ls/s;->t(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    move-result-object v32

    invoke-static {v8, v2}, Ls/s;->t(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    move-result-object v33

    invoke-static {v9, v2}, Ls/s;->t(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    move-result-object v34

    new-instance v28, Ly00/c;

    invoke-direct/range {v28 .. v34}, Ly00/c;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V

    move-object/from16 v15, v28

    goto :goto_9

    :cond_c
    const/4 v15, 0x0

    :goto_9
    new-instance v2, La10/f;

    invoke-direct {v2, v1, v3, v14, v15}, La10/f;-><init>(Ly00/c;Ljava/lang/String;Ljava/lang/String;Ly00/c;)V

    move-object v15, v2

    goto :goto_a

    :pswitch_4
    new-instance v15, La10/d;

    invoke-direct {v15, v1}, La10/d;-><init>(Ljava/lang/String;)V

    goto :goto_a

    :pswitch_5
    new-instance v15, La10/c;

    invoke-direct {v15, v1}, La10/c;-><init>(Ljava/lang/String;)V

    goto :goto_a

    :pswitch_6
    new-instance v15, La10/b;

    invoke-direct {v15, v1}, La10/b;-><init>(Ljava/lang/String;)V

    :goto_a
    move-object v13, v15

    goto :goto_b

    :cond_d
    move-object/from16 v22, v4

    move-object/from16 v23, v5

    move-object/from16 v24, v6

    move-object/from16 v25, v7

    move-object/from16 v26, v8

    move-object/from16 v27, v9

    const/4 v13, 0x0

    :goto_b
    const-string v1, "networks"

    invoke-virtual {v0, v1}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;

    move-result-object v1

    if-eqz v1, :cond_11

    const-string v2, "available"

    invoke-virtual {v1, v2}, Lorg/json/JSONObject;->optJSONArray(Ljava/lang/String;)Lorg/json/JSONArray;

    move-result-object v2

    invoke-static {v2}, Ls/s;->l(Lorg/json/JSONArray;)Ljava/util/ArrayList;

    move-result-object v2

    if-nez v2, :cond_e

    sget-object v2, Lm83/y;->w:Lm83/y;

    :cond_e
    check-cast v2, Ljava/lang/Iterable;

    new-instance v3, Ljava/util/ArrayList;

    const/16 v4, 0xa

    invoke-static {v2, v4}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v4

    invoke-direct {v3, v4}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_c
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_f

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    invoke-virtual {v4}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v3, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_c

    :cond_f
    invoke-static {v3}, Lm83/s;->I1(Ljava/lang/Iterable;)Ljava/util/Set;

    move-result-object v2

    new-instance v3, Ly00/x3;

    const-string v4, "selection_mandatory"

    invoke-virtual {v1, v4}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z

    move-result v5

    const/4 v6, 0x0

    if-eqz v5, :cond_10

    invoke-virtual {v1, v4, v6}, Lorg/json/JSONObject;->optBoolean(Ljava/lang/String;Z)Z

    move-result v4

    if-eqz v4, :cond_10

    const/4 v6, 0x1

    :cond_10
    const-string v4, "preferred"

    invoke-static {v4, v1}, Ls/s;->t(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    move-result-object v1

    invoke-direct {v3, v6, v1, v2}, Ly00/x3;-><init>(ZLjava/lang/String;Ljava/util/Set;)V

    move-object v14, v3

    goto :goto_d

    :cond_11
    const/4 v14, 0x0

    :goto_d
    const-string v1, "display_brand"

    invoke-static {v1, v0}, Ls/s;->t(Ljava/lang/String;Lorg/json/JSONObject;)Ljava/lang/String;

    move-result-object v15

    new-instance v3, Ly00/z3;

    move-object/from16 v4, v22

    move-object/from16 v5, v23

    move-object/from16 v6, v24

    move-object/from16 v7, v25

    move-object/from16 v8, v26

    move-object/from16 v9, v27

    invoke-direct/range {v3 .. v15}, Ly00/z3;-><init>(Ly00/i;Ly00/w3;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ly00/y3;La10/j;Ly00/x3;Ljava/lang/String;)V

    return-object v3

    nop

    :pswitch_data_0
    .packed-switch 0x0
        :pswitch_6
        :pswitch_5
        :pswitch_4
        :pswitch_3
        :pswitch_2
        :pswitch_1
        :pswitch_0
    .end packed-switch
.end method
