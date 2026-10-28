.class public final Ljc/a;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lmb/a;
.implements Lbh3/g;
.implements Lbh3/h;
.implements Lq83/i;
.implements Lp73/a;
.implements Lp73/b;
.implements Lul/a;
.implements Lwk/f;


# instance fields
.field public final synthetic w:I


# direct methods
.method public synthetic constructor <init>(I)V
    .locals 0

    iput p1, p0, Ljc/a;->w:I

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method public static final e(Lne3/d;)V
    .locals 8

    sget-object v0, Lne3/d;->h:Lbd3/v;

    sget-object v0, Lne3/d;->i:Lne3/d;

    const/4 v1, 0x1

    if-nez v0, :cond_0

    new-instance v0, Lne3/d;

    invoke-direct {v0}, Lne3/d;-><init>()V

    sput-object v0, Lne3/d;->i:Lne3/d;

    new-instance v0, Lne3/c;

    const-string v2, "Okio Watchdog"

    invoke-direct {v0, v2}, Lne3/c;-><init>(Ljava/lang/String;)V

    invoke-virtual {v0, v1}, Ljava/lang/Thread;->setDaemon(Z)V

    invoke-virtual {v0}, Ljava/lang/Thread;->start()V

    :cond_0
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    move-result-wide v2

    iget-wide v4, p0, Lne3/r0;->c:J

    iget-boolean v0, p0, Lne3/r0;->a:Z

    const-wide/16 v6, 0x0

    cmp-long v6, v4, v6

    if-eqz v6, :cond_1

    if-eqz v0, :cond_1

    invoke-virtual {p0}, Lne3/r0;->c()J

    move-result-wide v6

    sub-long/2addr v6, v2

    invoke-static {v4, v5, v6, v7}, Ljava/lang/Math;->min(JJ)J

    move-result-wide v4

    add-long/2addr v4, v2

    iput-wide v4, p0, Lne3/d;->g:J

    goto :goto_0

    :cond_1
    if-eqz v6, :cond_2

    add-long/2addr v2, v4

    iput-wide v2, p0, Lne3/d;->g:J

    goto :goto_0

    :cond_2
    if-eqz v0, :cond_5

    invoke-virtual {p0}, Lne3/r0;->c()J

    move-result-wide v2

    iput-wide v2, p0, Lne3/d;->g:J

    :goto_0
    sget-object v0, Lne3/d;->h:Lbd3/v;

    iget v2, v0, Lbd3/v;->x:I

    add-int/2addr v2, v1

    iput v2, v0, Lbd3/v;->x:I

    iget-object v3, v0, Lbd3/v;->y:Ljava/lang/Object;

    check-cast v3, [Lne3/d;

    array-length v4, v3

    if-ne v2, v4, :cond_3

    mul-int/lit8 v4, v2, 0x2

    new-array v4, v4, [Lne3/d;

    const/16 v5, 0xe

    const/4 v6, 0x0

    invoke-static {v6, v6, v5, v3, v4}, Lm83/n;->i0(III[Ljava/lang/Object;[Ljava/lang/Object;)V

    iput-object v4, v0, Lbd3/v;->y:Ljava/lang/Object;

    :cond_3
    invoke-virtual {v0, v2, p0}, Lbd3/v;->i(ILne3/d;)V

    iget p0, p0, Lne3/d;->f:I

    if-ne p0, v1, :cond_4

    sget-object p0, Lne3/d;->k:Ljava/util/concurrent/locks/Condition;

    invoke-interface {p0}, Ljava/util/concurrent/locks/Condition;->signal()V

    :cond_4
    return-void

    :cond_5
    new-instance p0, Ljava/lang/AssertionError;

    invoke-direct {p0}, Ljava/lang/AssertionError;-><init>()V

    throw p0
.end method

.method public static final g(Lne3/e0;)Z
    .locals 2

    sget-object v0, Loe3/g;->F:Lne3/e0;

    invoke-virtual {p0}, Lne3/e0;->b()Ljava/lang/String;

    move-result-object p0

    const-string v0, ".class"

    const/4 v1, 0x1

    invoke-static {p0, v0, v1}, Lyb3/y;->E(Ljava/lang/String;Ljava/lang/String;Z)Z

    move-result p0

    xor-int/2addr p0, v1

    return p0
.end method

.method public static h()Lne3/d;
    .locals 9

    sget-object v0, Lne3/d;->h:Lbd3/v;

    iget-object v1, v0, Lbd3/v;->y:Ljava/lang/Object;

    check-cast v1, [Lne3/d;

    const/4 v2, 0x1

    aget-object v1, v1, v2

    const/4 v3, 0x0

    if-nez v1, :cond_1

    invoke-static {}, Ljava/lang/System;->nanoTime()J

    move-result-wide v4

    sget-object v1, Lne3/d;->k:Ljava/util/concurrent/locks/Condition;

    sget-wide v6, Lne3/d;->l:J

    sget-object v8, Ljava/util/concurrent/TimeUnit;->MILLISECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-interface {v1, v6, v7, v8}, Ljava/util/concurrent/locks/Condition;->await(JLjava/util/concurrent/TimeUnit;)Z

    iget-object v0, v0, Lbd3/v;->y:Ljava/lang/Object;

    check-cast v0, [Lne3/d;

    aget-object v0, v0, v2

    if-nez v0, :cond_0

    invoke-static {}, Ljava/lang/System;->nanoTime()J

    move-result-wide v0

    sub-long/2addr v0, v4

    sget-wide v4, Lne3/d;->m:J

    cmp-long v0, v0, v4

    if-ltz v0, :cond_0

    sget-object v0, Lne3/d;->i:Lne3/d;

    return-object v0

    :cond_0
    return-object v3

    :cond_1
    invoke-static {}, Ljava/lang/System;->nanoTime()J

    move-result-wide v4

    iget-wide v6, v1, Lne3/d;->g:J

    sub-long/2addr v6, v4

    const-wide/16 v4, 0x0

    cmp-long v2, v6, v4

    if-lez v2, :cond_2

    sget-object v0, Lne3/d;->k:Ljava/util/concurrent/locks/Condition;

    sget-object v1, Ljava/util/concurrent/TimeUnit;->NANOSECONDS:Ljava/util/concurrent/TimeUnit;

    invoke-interface {v0, v6, v7, v1}, Ljava/util/concurrent/locks/Condition;->await(JLjava/util/concurrent/TimeUnit;)Z

    return-object v3

    :cond_2
    invoke-virtual {v0, v1}, Lbd3/v;->l(Lne3/d;)V

    const/4 v0, 0x2

    iput v0, v1, Lne3/d;->e:I

    return-object v1
.end method

.method public static i(Ljava/lang/String;Lp3/r;I)Landroid/graphics/Typeface;
    .locals 2

    if-nez p2, :cond_1

    sget-object v0, Lp3/r;->F:Lp3/r;

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    if-eqz p0, :cond_0

    invoke-virtual {p0}, Ljava/lang/String;->length()I

    move-result v0

    if-nez v0, :cond_1

    :cond_0
    sget-object p0, Landroid/graphics/Typeface;->DEFAULT:Landroid/graphics/Typeface;

    return-object p0

    :cond_1
    const/4 v0, 0x0

    if-nez p0, :cond_2

    sget-object p0, Landroid/graphics/Typeface;->DEFAULT:Landroid/graphics/Typeface;

    goto :goto_0

    :cond_2
    invoke-static {p0, v0}, Landroid/graphics/Typeface;->create(Ljava/lang/String;I)Landroid/graphics/Typeface;

    move-result-object p0

    :goto_0
    iget p1, p1, Lp3/r;->w:I

    const/4 v1, 0x1

    if-ne p2, v1, :cond_3

    move v0, v1

    :cond_3
    invoke-static {p0, p1, v0}, Landroid/graphics/Typeface;->create(Landroid/graphics/Typeface;IZ)Landroid/graphics/Typeface;

    move-result-object p0

    return-object p0
.end method

.method public static j(Llb3/c0;Landroidx/room/d;ILna3/p;ZZ)Ld/s;
    .locals 18

    move-object/from16 v0, p1

    move-object/from16 v1, p3

    move/from16 v2, p5

    invoke-static {v1}, Lbp/b;->G(Lna3/p;)Z

    move-result v3

    const/4 v4, 0x0

    const/4 v5, 0x1

    if-eqz v2, :cond_1

    if-nez p4, :cond_0

    goto :goto_0

    :cond_0
    move v6, v4

    goto :goto_1

    :cond_1
    :goto_0
    move v6, v5

    :goto_1
    const/4 v7, 0x0

    if-nez v3, :cond_2

    invoke-virtual/range {p0 .. p0}, Llb3/y;->X()Ljava/util/List;

    move-result-object v3

    invoke-interface {v3}, Ljava/util/List;->isEmpty()Z

    move-result v3

    if-eqz v3, :cond_2

    new-instance v0, Ld/s;

    invoke-direct {v0, v7, v5, v4}, Ld/s;-><init>(Llb3/c0;IZ)V

    return-object v0

    :cond_2
    invoke-virtual/range {p0 .. p0}, Llb3/y;->i0()Llb3/q0;

    move-result-object v3

    invoke-interface {v3}, Llb3/q0;->d()Lr93/h;

    move-result-object v3

    if-nez v3, :cond_3

    new-instance v0, Ld/s;

    invoke-direct {v0, v7, v5, v4}, Ld/s;-><init>(Llb3/c0;IZ)V

    return-object v0

    :cond_3
    invoke-static/range {p2 .. p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    invoke-virtual {v0, v8}, Landroidx/room/d;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lna3/d;

    invoke-static {v3, v8, v1}, Lna3/s;->b(Lr93/h;Lna3/d;Lna3/p;)Lr93/e;

    move-result-object v3

    invoke-static {v8, v1}, Lna3/s;->d(Lna3/d;Lna3/p;)Ljava/lang/Boolean;

    move-result-object v1

    if-eqz v3, :cond_4

    invoke-interface {v3}, Lr93/h;->e()Llb3/q0;

    move-result-object v9

    if-nez v9, :cond_5

    :cond_4
    invoke-virtual/range {p0 .. p0}, Llb3/y;->i0()Llb3/q0;

    move-result-object v9

    :cond_5
    add-int/lit8 v10, p2, 0x1

    invoke-virtual/range {p0 .. p0}, Llb3/y;->X()Ljava/util/List;

    move-result-object v11

    check-cast v11, Ljava/lang/Iterable;

    invoke-interface {v9}, Llb3/q0;->getParameters()Ljava/util/List;

    move-result-object v12

    const-string v13, "getParameters(...)"

    invoke-static {v12, v13}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v12, Ljava/lang/Iterable;

    invoke-interface {v11}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v13

    invoke-interface {v12}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v14

    new-instance v15, Ljava/util/ArrayList;

    const/16 v5, 0xa

    invoke-static {v11, v5}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v11

    invoke-static {v12, v5}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v12

    invoke-static {v11, v12}, Ljava/lang/Math;->min(II)I

    move-result v11

    invoke-direct {v15, v11}, Ljava/util/ArrayList;-><init>(I)V

    :goto_2
    invoke-interface {v13}, Ljava/util/Iterator;->hasNext()Z

    move-result v11

    if-eqz v11, :cond_c

    invoke-interface {v14}, Ljava/util/Iterator;->hasNext()Z

    move-result v11

    if-eqz v11, :cond_c

    invoke-interface {v13}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v11

    invoke-interface {v14}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Lr93/x0;

    check-cast v11, Llb3/u0;

    if-nez v6, :cond_6

    new-instance v5, Lai/j;

    invoke-direct {v5, v7, v4}, Lai/j;-><init>(Ljava/lang/Object;I)V

    goto :goto_3

    :cond_6
    invoke-virtual {v11}, Llb3/u0;->c()Z

    move-result v5

    if-nez v5, :cond_7

    invoke-virtual {v11}, Llb3/u0;->b()Llb3/y;

    move-result-object v5

    invoke-virtual {v5}, Llb3/y;->p0()Llb3/f1;

    move-result-object v5

    invoke-static {v5, v0, v10, v2}, Ljc/a;->k(Llb3/f1;Landroidx/room/d;IZ)Lai/j;

    move-result-object v5

    goto :goto_3

    :cond_7
    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-virtual {v0, v5}, Landroidx/room/d;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lna3/d;

    invoke-virtual {v5}, Lna3/d;->b()Lna3/g;

    move-result-object v5

    sget-object v7, Lna3/g;->w:Lna3/g;

    if-ne v5, v7, :cond_8

    invoke-virtual {v11}, Llb3/u0;->b()Llb3/y;

    move-result-object v5

    invoke-virtual {v5}, Llb3/y;->p0()Llb3/f1;

    move-result-object v5

    new-instance v7, Lai/j;

    invoke-static {v5}, Lds/p;->M(Llb3/y;)Llb3/c0;

    move-result-object v0

    invoke-virtual {v0, v4}, Llb3/c0;->u0(Z)Llb3/c0;

    move-result-object v0

    invoke-static {v5}, Lds/p;->g0(Llb3/y;)Llb3/c0;

    move-result-object v5

    const/4 v4, 0x1

    invoke-virtual {v5, v4}, Llb3/c0;->u0(Z)Llb3/c0;

    move-result-object v5

    invoke-static {v0, v5}, Llb3/o;->b(Llb3/c0;Llb3/c0;)Llb3/f1;

    move-result-object v0

    invoke-direct {v7, v0, v4}, Lai/j;-><init>(Ljava/lang/Object;I)V

    move-object v5, v7

    goto :goto_3

    :cond_8
    const/4 v4, 0x1

    new-instance v5, Lai/j;

    const/4 v0, 0x0

    invoke-direct {v5, v0, v4}, Lai/j;-><init>(Ljava/lang/Object;I)V

    :goto_3
    invoke-virtual {v5}, Lai/j;->i()I

    move-result v0

    add-int/2addr v10, v0

    invoke-virtual {v5}, Lai/j;->j()Llb3/y;

    move-result-object v0

    const-string v4, "getProjectionKind(...)"

    if-eqz v0, :cond_9

    invoke-virtual {v5}, Lai/j;->j()Llb3/y;

    move-result-object v0

    invoke-virtual {v11}, Llb3/u0;->a()Llb3/g1;

    move-result-object v5

    invoke-static {v5, v4}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0, v5, v12}, Lio/sentry/config/a;->r(Llb3/y;Llb3/g1;Lr93/x0;)Llb3/v0;

    move-result-object v0

    goto :goto_4

    :cond_9
    if-eqz v3, :cond_a

    invoke-virtual {v11}, Llb3/u0;->c()Z

    move-result v0

    if-nez v0, :cond_a

    invoke-virtual {v11}, Llb3/u0;->b()Llb3/y;

    move-result-object v0

    const-string v5, "getType(...)"

    invoke-static {v0, v5}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v11}, Llb3/u0;->a()Llb3/g1;

    move-result-object v5

    invoke-static {v5, v4}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0, v5, v12}, Lio/sentry/config/a;->r(Llb3/y;Llb3/g1;Lr93/x0;)Llb3/v0;

    move-result-object v0

    goto :goto_4

    :cond_a
    if-eqz v3, :cond_b

    invoke-static {v12}, Llb3/d1;->j(Lr93/x0;)Llb3/h0;

    move-result-object v0

    goto :goto_4

    :cond_b
    const/4 v0, 0x0

    :goto_4
    invoke-virtual {v15, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    move-object/from16 v0, p1

    const/4 v4, 0x0

    const/16 v5, 0xa

    const/4 v7, 0x0

    goto/16 :goto_2

    :cond_c
    sub-int v10, v10, p2

    if-nez v3, :cond_e

    if-nez v1, :cond_e

    invoke-virtual {v15}, Ljava/util/ArrayList;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_d

    goto :goto_6

    :cond_d
    invoke-virtual {v15}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_5
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_f

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Llb3/u0;

    if-nez v2, :cond_e

    goto :goto_5

    :cond_e
    const/4 v2, 0x0

    goto :goto_7

    :cond_f
    :goto_6
    new-instance v0, Ld/s;

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-direct {v0, v2, v10, v1}, Ld/s;-><init>(Llb3/c0;IZ)V

    return-object v0

    :goto_7
    invoke-virtual/range {p0 .. p0}, Llb3/y;->getAnnotations()Ls93/i;

    move-result-object v0

    invoke-static {}, Lna3/s;->c()Ls93/j;

    move-result-object v4

    if-eqz v3, :cond_10

    goto :goto_8

    :cond_10
    move-object v4, v2

    :goto_8
    invoke-static {}, Lna3/s;->e()Ls93/j;

    move-result-object v3

    if-eqz v1, :cond_11

    move-object v7, v3

    goto :goto_9

    :cond_11
    move-object v7, v2

    :goto_9
    const/4 v2, 0x3

    new-array v2, v2, [Ls93/i;

    const/16 v17, 0x0

    aput-object v0, v2, v17

    const/16 v16, 0x1

    aput-object v4, v2, v16

    const/4 v0, 0x2

    aput-object v7, v2, v0

    invoke-static {v2}, Lm83/n;->r0([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    invoke-static {v0}, Lna3/s;->a(Ljava/util/List;)Ls93/i;

    move-result-object v0

    invoke-static {v0}, Lio/sentry/config/a;->a0(Ls93/i;)Llb3/k0;

    move-result-object v0

    invoke-virtual/range {p0 .. p0}, Llb3/y;->X()Ljava/util/List;

    move-result-object v2

    check-cast v2, Ljava/lang/Iterable;

    invoke-virtual {v15}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v3

    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v4

    new-instance v5, Ljava/util/ArrayList;

    const/16 v6, 0xa

    invoke-static {v15, v6}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v7

    invoke-static {v2, v6}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v2

    invoke-static {v7, v2}, Ljava/lang/Math;->min(II)I

    move-result v2

    invoke-direct {v5, v2}, Ljava/util/ArrayList;-><init>(I)V

    :goto_a
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_13

    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_13

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Llb3/u0;

    check-cast v2, Llb3/u0;

    if-nez v2, :cond_12

    goto :goto_b

    :cond_12
    move-object v6, v2

    :goto_b
    invoke-virtual {v5, v6}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_a

    :cond_13
    if-eqz v1, :cond_14

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v2

    goto :goto_c

    :cond_14
    invoke-virtual/range {p0 .. p0}, Llb3/y;->k0()Z

    move-result v2

    :goto_c
    invoke-static {v5, v0, v9, v2}, Llb3/o;->i(Ljava/util/List;Llb3/k0;Llb3/q0;Z)Llb3/c0;

    move-result-object v0

    invoke-virtual {v8}, Lna3/d;->a()Z

    move-result v2

    if-eqz v2, :cond_15

    new-instance v2, Lna3/f;

    invoke-direct {v2, v0}, Lna3/f;-><init>(Llb3/c0;)V

    move-object v0, v2

    :cond_15
    if-eqz v1, :cond_16

    invoke-virtual {v8}, Lna3/d;->c()Z

    move-result v1

    if-eqz v1, :cond_16

    move/from16 v4, v16

    goto :goto_d

    :cond_16
    move/from16 v4, v17

    :goto_d
    new-instance v1, Ld/s;

    invoke-direct {v1, v0, v10, v4}, Ld/s;-><init>(Llb3/c0;IZ)V

    return-object v1
.end method

.method public static k(Llb3/f1;Landroidx/room/d;IZ)Lai/j;
    .locals 9

    invoke-static {p0}, Llb3/o;->e(Llb3/y;)Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    new-instance p0, Lai/j;

    const/4 p1, 0x1

    invoke-direct {p0, v1, p1}, Lai/j;-><init>(Ljava/lang/Object;I)V

    return-object p0

    :cond_0
    instance-of v0, p0, Llb3/r;

    if-eqz v0, :cond_b

    instance-of v6, p0, Lka3/h;

    move-object v0, p0

    check-cast v0, Llb3/r;

    iget-object v8, v0, Llb3/r;->y:Llb3/c0;

    iget-object v2, v0, Llb3/r;->x:Llb3/c0;

    sget-object v5, Lna3/p;->w:Lna3/p;

    move-object v3, p1

    move v4, p2

    move v7, p3

    invoke-static/range {v2 .. v7}, Ljc/a;->j(Llb3/c0;Landroidx/room/d;ILna3/p;ZZ)Ld/s;

    move-result-object p1

    move-object p2, v2

    iget-object v2, v0, Llb3/r;->y:Llb3/c0;

    sget-object v5, Lna3/p;->x:Lna3/p;

    invoke-static/range {v2 .. v7}, Ljc/a;->j(Llb3/c0;Landroidx/room/d;ILna3/p;ZZ)Ld/s;

    move-result-object p3

    invoke-virtual {p1}, Ld/s;->i()Llb3/c0;

    move-result-object v0

    if-nez v0, :cond_1

    invoke-virtual {p3}, Ld/s;->i()Llb3/c0;

    move-result-object v0

    if-nez v0, :cond_1

    goto :goto_4

    :cond_1
    invoke-virtual {p1}, Ld/s;->g()Z

    move-result v0

    if-nez v0, :cond_8

    invoke-virtual {p3}, Ld/s;->g()Z

    move-result v0

    if-eqz v0, :cond_2

    goto :goto_2

    :cond_2
    if-eqz v6, :cond_5

    new-instance v1, Lka3/h;

    invoke-virtual {p1}, Ld/s;->i()Llb3/c0;

    move-result-object v2

    if-nez v2, :cond_3

    move-object v2, p2

    :cond_3
    invoke-virtual {p3}, Ld/s;->i()Llb3/c0;

    move-result-object p0

    if-nez p0, :cond_4

    goto :goto_0

    :cond_4
    move-object v8, p0

    :goto_0
    invoke-direct {v1, v2, v8}, Lka3/h;-><init>(Llb3/c0;Llb3/c0;)V

    goto :goto_4

    :cond_5
    invoke-virtual {p1}, Ld/s;->i()Llb3/c0;

    move-result-object v2

    if-nez v2, :cond_6

    move-object v2, p2

    :cond_6
    invoke-virtual {p3}, Ld/s;->i()Llb3/c0;

    move-result-object p0

    if-nez p0, :cond_7

    goto :goto_1

    :cond_7
    move-object v8, p0

    :goto_1
    invoke-static {v2, v8}, Llb3/o;->b(Llb3/c0;Llb3/c0;)Llb3/f1;

    move-result-object v1

    goto :goto_4

    :cond_8
    :goto_2
    invoke-virtual {p3}, Ld/s;->i()Llb3/c0;

    move-result-object p2

    if-eqz p2, :cond_a

    invoke-virtual {p1}, Ld/s;->i()Llb3/c0;

    move-result-object p3

    if-nez p3, :cond_9

    move-object p3, p2

    :cond_9
    invoke-static {p3, p2}, Llb3/o;->b(Llb3/c0;Llb3/c0;)Llb3/f1;

    move-result-object p2

    goto :goto_3

    :cond_a
    invoke-virtual {p1}, Ld/s;->i()Llb3/c0;

    move-result-object p2

    invoke-static {p2}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    :goto_3
    invoke-static {p0, p2}, Llb3/o;->p(Llb3/f1;Llb3/y;)Llb3/f1;

    move-result-object v1

    :goto_4
    new-instance p0, Lai/j;

    invoke-virtual {p1}, Ld/s;->h()I

    move-result p1

    invoke-direct {p0, v1, p1}, Lai/j;-><init>(Ljava/lang/Object;I)V

    return-object p0

    :cond_b
    move-object v3, p1

    move v4, p2

    move v7, p3

    instance-of p1, p0, Llb3/c0;

    if-eqz p1, :cond_d

    move-object v2, p0

    check-cast v2, Llb3/c0;

    sget-object v5, Lna3/p;->y:Lna3/p;

    const/4 v6, 0x0

    invoke-static/range {v2 .. v7}, Ljc/a;->j(Llb3/c0;Landroidx/room/d;ILna3/p;ZZ)Ld/s;

    move-result-object p1

    new-instance p2, Lai/j;

    invoke-virtual {p1}, Ld/s;->g()Z

    move-result p3

    if-eqz p3, :cond_c

    invoke-virtual {p1}, Ld/s;->i()Llb3/c0;

    move-result-object p3

    invoke-static {p0, p3}, Llb3/o;->p(Llb3/f1;Llb3/y;)Llb3/f1;

    move-result-object p0

    goto :goto_5

    :cond_c
    invoke-virtual {p1}, Ld/s;->i()Llb3/c0;

    move-result-object p0

    :goto_5
    invoke-virtual {p1}, Ld/s;->h()I

    move-result p1

    invoke-direct {p2, p0, p1}, Lai/j;-><init>(Ljava/lang/Object;I)V

    return-object p2

    :cond_d
    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p0
.end method

.method public static l()Lp3/r;
    .locals 1

    sget-object v0, Lp3/r;->I:Lp3/r;

    return-object v0
.end method

.method public static n()Lp3/r;
    .locals 1

    sget-object v0, Lp3/r;->H:Lp3/r;

    return-object v0
.end method


# virtual methods
.method public a([BLjava/lang/Object;Ljava/security/MessageDigest;)V
    .locals 0

    return-void
.end method

.method public accept(Ljava/lang/Object;)V
    .locals 1

    check-cast p1, Ljava/lang/Throwable;

    new-instance v0, Lio/reactivex/exceptions/OnErrorNotImplementedException;

    invoke-direct {v0, p1}, Lio/reactivex/exceptions/OnErrorNotImplementedException;-><init>(Ljava/lang/Throwable;)V

    invoke-static {v0}, Ljc/x;->d0(Ljava/lang/Throwable;)V

    return-void
.end method

.method public b(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 2

    iget v0, p0, Ljc/a;->w:I

    packed-switch v0, :pswitch_data_0

    :pswitch_0
    check-cast p1, Landroid/content/Intent;

    const-string v0, "android.bluetooth.adapter.extra.STATE"

    const/4 v1, 0x0

    invoke-virtual {p1, v0, v1}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    return-object p1

    :pswitch_1
    check-cast p1, Lxg3/f;

    sget-object v0, Ljh3/f;->f:Ljh3/f;

    invoke-virtual {v0}, Ljh3/f;->c()Ljh3/b;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    return-object p1

    :pswitch_2
    check-cast p1, Lbh3/a;

    sget-object v0, Ljh3/f;->f:Ljh3/f;

    invoke-virtual {v0}, Ljh3/f;->e()Ljh3/g;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    return-object p1

    :pswitch_3
    check-cast p1, Lxg3/o;

    sget-object v0, Ljh3/f;->f:Ljh3/f;

    invoke-virtual {v0}, Ljh3/f;->f()Ljh3/h;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    return-object p1

    :pswitch_4
    check-cast p1, Ljava/lang/Throwable;

    sget-object v0, Ljh3/f;->f:Ljh3/f;

    invoke-virtual {v0}, Ljh3/f;->f()Ljh3/h;

    move-result-object v0

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    return-object p1

    nop

    :pswitch_data_0
    .packed-switch 0x1
        :pswitch_4
        :pswitch_3
        :pswitch_0
        :pswitch_0
        :pswitch_2
        :pswitch_1
    .end packed-switch
.end method

.method public c(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 3

    iget v0, p0, Ljc/a;->w:I

    packed-switch v0, :pswitch_data_0

    check-cast p1, Lxg3/p;

    check-cast p2, Lxg3/o;

    sget-object p1, Ljh3/f;->f:Ljh3/f;

    invoke-virtual {p1}, Ljh3/f;->f()Ljh3/h;

    move-result-object p1

    sget-object v0, Ljh3/h;->a:Ljh3/h;

    if-ne p1, v0, :cond_0

    goto :goto_0

    :cond_0
    new-instance v0, Lch3/s;

    new-instance v1, Lch3/n;

    const/4 v2, 0x1

    invoke-direct {v1, p2, v2}, Lch3/n;-><init>(Ljava/lang/Object;I)V

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    const/4 p1, 0x2

    invoke-direct {v0, v1, p1}, Lch3/s;-><init>(Ljava/lang/Object;I)V

    move-object p2, v0

    :goto_0
    return-object p2

    :pswitch_0
    check-cast p1, Lxg3/g;

    check-cast p2, Lxg3/e;

    sget-object p1, Ljh3/f;->f:Ljh3/f;

    invoke-virtual {p1}, Ljh3/f;->c()Ljh3/b;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    return-object p2

    nop

    :pswitch_data_0
    .packed-switch 0x3
        :pswitch_0
    .end packed-switch
.end method

.method public create()Ljava/lang/Object;
    .locals 1

    new-instance v0, Ljava/util/ArrayList;

    invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V

    return-object v0
.end method

.method public d(Lub/a;)V
    .locals 3

    const-string v0, "db"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "UPDATE workspec SET period_count = 1 WHERE last_enqueue_time <> 0 AND interval_duration <> 0"

    invoke-interface {p1, v0}, Lub/a;->E(Ljava/lang/String;)V

    new-instance v0, Landroid/content/ContentValues;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Landroid/content/ContentValues;-><init>(I)V

    invoke-static {}, Ljava/lang/System;->currentTimeMillis()J

    move-result-wide v1

    invoke-static {v1, v2}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v1

    const-string v2, "last_enqueue_time"

    invoke-virtual {v0, v2, v1}, Landroid/content/ContentValues;->put(Ljava/lang/String;Ljava/lang/Long;)V

    const/4 v1, 0x0

    new-array v1, v1, [Ljava/lang/Object;

    invoke-interface {p1, v0, v1}, Lub/a;->f1(Landroid/content/ContentValues;[Ljava/lang/Object;)I

    return-void
.end method

.method public m(Lqk/b;)Lp0/n0;
    .locals 1

    new-instance v0, Lp0/n0;

    invoke-direct {v0, p1}, Lp0/n0;-><init>(Lqk/b;)V

    return-object v0
.end method

.method public run()V
    .locals 0

    return-void
.end method

.method public toString()Ljava/lang/String;
    .locals 1

    iget v0, p0, Ljc/a;->w:I

    sparse-switch v0, :sswitch_data_0

    invoke-super {p0}, Ljava/lang/Object;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0

    :sswitch_0
    const-string v0, "NULL_VALUE"

    return-object v0

    :sswitch_1
    const-string v0, "EmptyAction"

    return-object v0

    :sswitch_data_0
    .sparse-switch
        0x15 -> :sswitch_1
        0x19 -> :sswitch_0
    .end sparse-switch
.end method
