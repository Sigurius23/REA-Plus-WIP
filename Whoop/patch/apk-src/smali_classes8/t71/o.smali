.class public abstract Lt71/o;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u001a7\u0010\u0008\u001a\u00020\u00062\u0008\u0008\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0014\u0008\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0007\u00a2\u0006\u0004\u0008\u0008\u0010\t\u00a8\u0006\n"
    }
    d2 = {
        "Landroidx/compose/ui/Modifier;",
        "modifier",
        "Lt71/p;",
        "state",
        "Lkotlin/Function1;",
        "",
        "Ll83/a0;",
        "onViewEvent",
        "d",
        "(Landroidx/compose/ui/Modifier;Lt71/p;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V",
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
.method public static synthetic a(Ljava/lang/Object;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lt71/o;->e(Ljava/lang/Object;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lkotlin/jvm/functions/Function1;Lt71/p;Li21/a;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, Lt71/o;->f(Lkotlin/jvm/functions/Function1;Lt71/p;Li21/a;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Landroidx/compose/ui/Modifier;Lt71/p;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p6}, Lt71/o;->g(Landroidx/compose/ui/Modifier;Lt71/p;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final d(Landroidx/compose/ui/Modifier;Lt71/p;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V
    .locals 38
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/ui/Modifier;",
            "Lt71/p;",
            "Lkotlin/jvm/functions/Function1;",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    move-object/from16 v2, p1

    move/from16 v4, p4

    const-string v0, "state"

    invoke-static {v2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v8, p3

    check-cast v8, Lp1/q;

    const v0, -0x50f4a2cb

    invoke-virtual {v8, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, p5, 0x1

    if-eqz v0, :cond_0

    or-int/lit8 v1, v4, 0x6

    move v3, v1

    move-object/from16 v1, p0

    goto :goto_1

    :cond_0
    and-int/lit8 v1, v4, 0x6

    if-nez v1, :cond_2

    move-object/from16 v1, p0

    invoke-virtual {v8, v1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_1

    const/4 v3, 0x4

    goto :goto_0

    :cond_1
    const/4 v3, 0x2

    :goto_0
    or-int/2addr v3, v4

    goto :goto_1

    :cond_2
    move-object/from16 v1, p0

    move v3, v4

    :goto_1
    and-int/lit8 v5, v4, 0x30

    if-nez v5, :cond_4

    invoke-virtual {v8, v2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_3

    const/16 v5, 0x20

    goto :goto_2

    :cond_3
    const/16 v5, 0x10

    :goto_2
    or-int/2addr v3, v5

    :cond_4
    and-int/lit8 v5, p5, 0x4

    if-eqz v5, :cond_6

    or-int/lit16 v3, v3, 0x180

    :cond_5
    move-object/from16 v7, p2

    goto :goto_4

    :cond_6
    and-int/lit16 v7, v4, 0x180

    if-nez v7, :cond_5

    move-object/from16 v7, p2

    invoke-virtual {v8, v7}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_7

    const/16 v9, 0x100

    goto :goto_3

    :cond_7
    const/16 v9, 0x80

    :goto_3
    or-int/2addr v3, v9

    :goto_4
    and-int/lit16 v9, v3, 0x93

    const/16 v10, 0x92

    const/4 v11, 0x0

    if-eq v9, v10, :cond_8

    const/4 v9, 0x1

    goto :goto_5

    :cond_8
    move v9, v11

    :goto_5
    and-int/lit8 v10, v3, 0x1

    invoke-virtual {v8, v10, v9}, Lp1/q;->U(IZ)Z

    move-result v9

    if-eqz v9, :cond_17

    sget-object v9, Lb2/t;->w:Lb2/t;

    if-eqz v0, :cond_9

    move-object v1, v9

    :cond_9
    sget-object v0, Lp1/l;->a:Lp1/v0;

    if-eqz v5, :cond_b

    invoke-virtual {v8}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    if-ne v5, v0, :cond_a

    new-instance v5, Lt71/i;

    const/4 v7, 0x2

    invoke-direct {v5, v7}, Lt71/i;-><init>(I)V

    invoke-virtual {v8, v5}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_a
    check-cast v5, Lkotlin/jvm/functions/Function1;

    goto :goto_6

    :cond_b
    move-object v5, v7

    :goto_6
    sget-object v7, Ll0/m;->e:Ll0/h;

    sget-object v10, Lb2/e;->M:Lb2/k;

    const/4 v13, 0x6

    invoke-static {v7, v10, v8, v13}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v7

    iget-wide v14, v8, Lp1/q;->T:J

    invoke-static {v14, v15}, Ljava/lang/Long;->hashCode(J)I

    move-result v10

    invoke-virtual {v8}, Lp1/q;->m()Lp1/p1;

    move-result-object v14

    invoke-static {v8, v1}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v15

    sget-object v16, La3/l;->a:La3/k;

    invoke-virtual/range {v16 .. v16}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v6, La3/k;->b:La3/j;

    invoke-virtual {v8}, Lp1/q;->i0()V

    iget-boolean v12, v8, Lp1/q;->S:Z

    if-eqz v12, :cond_c

    invoke-virtual {v8, v6}, Lp1/q;->l(Lc93/a;)V

    goto :goto_7

    :cond_c
    invoke-virtual {v8}, Lp1/q;->s0()V

    :goto_7
    sget-object v6, La3/k;->g:La3/i;

    invoke-static {v8, v6, v7}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v6, La3/k;->f:La3/i;

    invoke-static {v8, v6, v14}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v6, La3/k;->j:La3/i;

    iget-boolean v7, v8, Lp1/q;->S:Z

    if-nez v7, :cond_d

    invoke-virtual {v8}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v7

    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v12

    invoke-static {v7, v12}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_e

    :cond_d
    invoke-static {v10, v8, v10, v6}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_e
    sget-object v6, La3/k;->d:La3/i;

    invoke-static {v8, v6, v15}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual {v2}, Lt71/p;->g()Lcom/whoop/design/util/TextResource;

    move-result-object v6

    invoke-static {v6}, Lcom/whoop/design/util/b;->d(Lcom/whoop/design/util/TextResource;)Z

    move-result v6

    const/16 v7, 0x8

    if-eqz v6, :cond_f

    const v6, -0x6edde131

    invoke-virtual {v8, v6}, Lp1/q;->e0(I)V

    invoke-virtual {v2}, Lt71/p;->g()Lcom/whoop/design/util/TextResource;

    move-result-object v6

    invoke-static {v6, v8, v11}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v6

    sget-object v10, Lx81/d;->a:Lx81/d;

    invoke-virtual {v10, v8, v13}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v12

    invoke-virtual {v12}, Ly81/i;->y()J

    move-result-wide v14

    invoke-virtual {v10, v8, v13}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v10

    invoke-virtual {v10}, Lb91/d;->r()Lb91/a;

    move-result-object v25

    const/16 v29, 0x0

    const v30, 0x2fffa

    move-object v10, v5

    move-object v5, v6

    const/4 v6, 0x0

    move-object/from16 v17, v9

    move-object v12, v10

    const-wide/16 v9, 0x0

    move/from16 v18, v11

    const/4 v11, 0x0

    move-object/from16 v19, v12

    const/4 v12, 0x0

    move/from16 v20, v13

    const/4 v13, 0x0

    move/from16 v21, v7

    move-object/from16 v27, v8

    move-wide v7, v14

    const-wide/16 v14, 0x0

    const/16 v22, 0x1

    const/16 v16, 0x0

    move-object/from16 v23, v17

    const/16 v17, 0x0

    move/from16 v26, v18

    move-object/from16 v24, v19

    const-wide/16 v18, 0x0

    move/from16 v28, v20

    const/16 v20, 0x0

    move/from16 v31, v21

    const/16 v21, 0x0

    move/from16 v32, v22

    const/16 v22, 0x0

    move-object/from16 v33, v23

    const/16 v23, 0x0

    move-object/from16 v34, v24

    const/16 v24, 0x0

    move/from16 v35, v26

    const/16 v26, 0x0

    move/from16 v36, v28

    const/16 v28, 0x0

    move-object/from16 p0, v1

    move/from16 v1, v32

    move-object/from16 v4, v33

    move-object/from16 v37, v34

    invoke-static/range {v5 .. v30}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v8, v27

    int-to-float v5, v1

    const/16 v6, 0x8

    int-to-float v7, v6

    const/4 v6, 0x0

    invoke-static {v5, v7, v4, v8, v6}, Lr80/c;->z(FFLb2/t;Lp1/q;Z)V

    goto :goto_8

    :cond_f
    move-object/from16 p0, v1

    move-object/from16 v37, v5

    move-object v4, v9

    move v6, v11

    const/4 v1, 0x1

    const v5, -0x6eda0229

    invoke-virtual {v8, v5}, Lp1/q;->e0(I)V

    invoke-virtual {v8, v6}, Lp1/q;->q(Z)V

    :goto_8
    invoke-virtual {v2}, Lt71/p;->i()Lcom/whoop/design/util/TextResource;

    move-result-object v5

    invoke-static {v5}, Lcom/whoop/design/util/b;->d(Lcom/whoop/design/util/TextResource;)Z

    move-result v5

    if-eqz v5, :cond_10

    const v5, -0x6ed93fed

    invoke-virtual {v8, v5}, Lp1/q;->e0(I)V

    invoke-virtual {v2}, Lt71/p;->i()Lcom/whoop/design/util/TextResource;

    move-result-object v5

    invoke-static {v5, v8, v6}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v5

    sget-object v6, Lx81/d;->a:Lx81/d;

    const/4 v7, 0x6

    invoke-virtual {v6, v8, v7}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v9

    invoke-virtual {v9}, Ly81/i;->b1()J

    move-result-wide v9

    invoke-virtual {v6, v8, v7}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v6

    invoke-virtual {v6}, Lb91/d;->a()Lb91/a;

    move-result-object v25

    const/16 v29, 0x0

    const v30, 0x2fffa

    const/4 v6, 0x0

    move-object/from16 v27, v8

    move-wide v7, v9

    const-wide/16 v9, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const-wide/16 v14, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const-wide/16 v18, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v26, 0x0

    const/16 v28, 0x0

    invoke-static/range {v5 .. v30}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v8, v27

    const-wide/high16 v5, 0x4004000000000000L    # 2.5

    double-to-float v5, v5

    const/16 v6, 0x8

    int-to-float v7, v6

    const/4 v6, 0x0

    invoke-static {v5, v7, v4, v8, v6}, Lr80/c;->z(FFLb2/t;Lp1/q;Z)V

    goto :goto_9

    :cond_10
    const v5, -0x6ed56fe9

    invoke-virtual {v8, v5}, Lp1/q;->e0(I)V

    invoke-virtual {v8, v6}, Lp1/q;->q(Z)V

    :goto_9
    const v5, -0x14176136

    invoke-virtual {v8, v5}, Lp1/q;->e0(I)V

    invoke-virtual {v2}, Lt71/p;->h()Ljava/util/List;

    move-result-object v5

    check-cast v5, Ljava/lang/Iterable;

    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v11

    const/4 v12, 0x0

    :goto_a
    invoke-interface {v11}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_16

    invoke-interface {v11}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    add-int/lit8 v13, v12, 0x1

    if-ltz v12, :cond_15

    move-object v6, v5

    check-cast v6, Li21/j;

    and-int/lit16 v5, v3, 0x380

    const/16 v14, 0x100

    if-ne v5, v14, :cond_11

    move v5, v1

    goto :goto_b

    :cond_11
    const/4 v5, 0x0

    :goto_b
    invoke-virtual {v8, v2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v7

    or-int/2addr v5, v7

    invoke-virtual {v8}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v7

    if-nez v5, :cond_13

    if-ne v7, v0, :cond_12

    goto :goto_c

    :cond_12
    move-object/from16 v15, v37

    goto :goto_d

    :cond_13
    :goto_c
    new-instance v7, Lsg2/t;

    const/16 v5, 0x10

    move-object/from16 v15, v37

    invoke-direct {v7, v5, v15, v2}, Lsg2/t;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v8, v7}, Lp1/q;->p0(Ljava/lang/Object;)V

    :goto_d
    check-cast v7, Lkotlin/jvm/functions/Function1;

    const/4 v9, 0x0

    const/4 v10, 0x1

    const/4 v5, 0x0

    invoke-static/range {v5 .. v10}, Li21/i;->i(Landroidx/compose/ui/Modifier;Li21/j;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    invoke-virtual {v2}, Lt71/p;->h()Ljava/util/List;

    move-result-object v5

    invoke-interface {v5}, Ljava/util/List;->size()I

    move-result v5

    if-le v5, v1, :cond_14

    invoke-virtual {v2}, Lt71/p;->h()Ljava/util/List;

    move-result-object v5

    invoke-static {v5}, Lwb3/f;->C(Ljava/util/List;)I

    move-result v5

    if-eq v5, v12, :cond_14

    const v5, 0x55d9b13e

    invoke-virtual {v8, v5}, Lp1/q;->e0(I)V

    int-to-float v5, v1

    const/16 v6, 0x8

    int-to-float v7, v6

    const/4 v9, 0x0

    invoke-static {v5, v7, v4, v8, v9}, Lr80/c;->z(FFLb2/t;Lp1/q;Z)V

    goto :goto_e

    :cond_14
    const/16 v6, 0x8

    const/4 v9, 0x0

    const v5, 0x55dad24b

    invoke-virtual {v8, v5}, Lp1/q;->e0(I)V

    invoke-virtual {v8, v9}, Lp1/q;->q(Z)V

    :goto_e
    move v12, v13

    move-object/from16 v37, v15

    goto :goto_a

    :cond_15
    invoke-static {}, Lwb3/f;->d0()V

    const/4 v0, 0x0

    throw v0

    :cond_16
    move-object/from16 v15, v37

    const/4 v9, 0x0

    invoke-virtual {v8, v9}, Lp1/q;->q(Z)V

    invoke-virtual {v8, v1}, Lp1/q;->q(Z)V

    move-object/from16 v1, p0

    move-object v3, v15

    goto :goto_f

    :cond_17
    invoke-virtual {v8}, Lp1/q;->X()V

    move-object v3, v7

    :goto_f
    invoke-virtual {v8}, Lp1/q;->u()Lp1/v1;

    move-result-object v7

    if-eqz v7, :cond_18

    new-instance v0, Lt01/e;

    const/4 v6, 0x4

    move/from16 v4, p4

    move/from16 v5, p5

    invoke-direct/range {v0 .. v6}, Lt01/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;III)V

    iput-object v0, v7, Lp1/v1;->d:Lc93/m;

    :cond_18
    return-void
.end method

.method private static final e(Ljava/lang/Object;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final f(Lkotlin/jvm/functions/Function1;Lt71/p;Li21/a;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lt71/p;->f()Lkotlin/jvm/functions/Function1;

    move-result-object p1

    invoke-interface {p1, p2}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final g(Landroidx/compose/ui/Modifier;Lt71/p;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 6

    or-int/lit8 p3, p3, 0x1

    invoke-static {p3}, Lp1/x;->L(I)I

    move-result v4

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move v5, p4

    move-object v3, p5

    invoke-static/range {v0 .. v5}, Lt71/o;->d(Landroidx/compose/ui/Modifier;Lt71/p;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method
