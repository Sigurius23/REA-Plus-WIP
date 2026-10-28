.class public abstract Lrp2/d;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u001a5\u0010\u0008\u001a\u00020\u00062\u0008\u0008\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0003\u00a2\u0006\u0004\u0008\u0008\u0010\t\u00a8\u0006\n"
    }
    d2 = {
        "Landroidx/compose/ui/Modifier;",
        "modifier",
        "Lrp2/b;",
        "viewState",
        "Lkotlin/Function1;",
        "",
        "Ll83/a0;",
        "onViewEvent",
        "d",
        "(Landroidx/compose/ui/Modifier;Lrp2/b;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V",
        "universal-checkout_release"
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
.method public static synthetic a(Landroidx/compose/ui/Modifier;Lrp2/b;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p6}, Lrp2/d;->g(Landroidx/compose/ui/Modifier;Lrp2/b;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lkotlin/jvm/functions/Function1;Lrp2/b;Z)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, Lrp2/d;->f(Lkotlin/jvm/functions/Function1;Lrp2/b;Z)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Lrp2/b;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, Lrp2/d;->e(Lrp2/b;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method private static final d(Landroidx/compose/ui/Modifier;Lrp2/b;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V
    .locals 20
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/ui/Modifier;",
            "Lrp2/b;",
            "Lkotlin/jvm/functions/Function1;",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    move-object/from16 v5, p1

    move-object/from16 v6, p2

    move/from16 v1, p4

    move-object/from16 v0, p3

    check-cast v0, Lp1/q;

    const v2, -0x7a62f51f

    invoke-virtual {v0, v2}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v2, p5, 0x1

    const/4 v3, 0x2

    if-eqz v2, :cond_0

    or-int/lit8 v4, v1, 0x6

    move v7, v4

    move-object/from16 v4, p0

    goto :goto_1

    :cond_0
    and-int/lit8 v4, v1, 0x6

    if-nez v4, :cond_2

    move-object/from16 v4, p0

    invoke-virtual {v0, v4}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_1

    const/4 v7, 0x4

    goto :goto_0

    :cond_1
    move v7, v3

    :goto_0
    or-int/2addr v7, v1

    goto :goto_1

    :cond_2
    move-object/from16 v4, p0

    move v7, v1

    :goto_1
    and-int/lit8 v8, v1, 0x30

    if-nez v8, :cond_5

    and-int/lit8 v8, v1, 0x40

    if-nez v8, :cond_3

    invoke-virtual {v0, v5}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v8

    goto :goto_2

    :cond_3
    invoke-virtual {v0, v5}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v8

    :goto_2
    if-eqz v8, :cond_4

    const/16 v8, 0x20

    goto :goto_3

    :cond_4
    const/16 v8, 0x10

    :goto_3
    or-int/2addr v7, v8

    :cond_5
    and-int/lit16 v8, v1, 0x180

    if-nez v8, :cond_7

    invoke-virtual {v0, v6}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_6

    const/16 v8, 0x100

    goto :goto_4

    :cond_6
    const/16 v8, 0x80

    :goto_4
    or-int/2addr v7, v8

    :cond_7
    and-int/lit16 v8, v7, 0x93

    const/16 v11, 0x92

    const/4 v12, 0x0

    if-eq v8, v11, :cond_8

    const/4 v8, 0x1

    goto :goto_5

    :cond_8
    move v8, v12

    :goto_5
    and-int/lit8 v11, v7, 0x1

    invoke-virtual {v0, v11, v8}, Lp1/q;->U(IZ)Z

    move-result v8

    if-eqz v8, :cond_16

    sget-object v8, Lb2/t;->w:Lb2/t;

    if-eqz v2, :cond_9

    move-object v4, v8

    :cond_9
    sget-object v2, Ll0/m;->c:Ll0/g;

    sget-object v11, Lb2/e;->M:Lb2/k;

    invoke-static {v2, v11, v0, v12}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v2

    iget-wide v14, v0, Lp1/q;->T:J

    invoke-static {v14, v15}, Ljava/lang/Long;->hashCode(J)I

    move-result v11

    invoke-virtual {v0}, Lp1/q;->m()Lp1/p1;

    move-result-object v14

    invoke-static {v0, v4}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v15

    sget-object v16, La3/l;->a:La3/k;

    invoke-virtual/range {v16 .. v16}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v9, La3/k;->b:La3/j;

    invoke-virtual {v0}, Lp1/q;->i0()V

    iget-boolean v10, v0, Lp1/q;->S:Z

    if-eqz v10, :cond_a

    invoke-virtual {v0, v9}, Lp1/q;->l(Lc93/a;)V

    goto :goto_6

    :cond_a
    invoke-virtual {v0}, Lp1/q;->s0()V

    :goto_6
    sget-object v10, La3/k;->g:La3/i;

    invoke-static {v0, v10, v2}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v2, La3/k;->f:La3/i;

    invoke-static {v0, v2, v14}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v14, La3/k;->j:La3/i;

    iget-boolean v12, v0, Lp1/q;->S:Z

    if-nez v12, :cond_b

    invoke-virtual {v0}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v12

    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v13

    invoke-static {v12, v13}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v12

    if-nez v12, :cond_c

    :cond_b
    invoke-static {v11, v0, v11, v14}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_c
    sget-object v11, La3/k;->d:La3/i;

    invoke-static {v0, v11, v15}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const/high16 v12, 0x3f800000    # 1.0f

    invoke-static {v12, v8}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v8

    int-to-float v3, v3

    const/16 v12, 0x8

    int-to-float v12, v12

    mul-float/2addr v3, v12

    const/4 v12, 0x0

    const/4 v13, 0x1

    invoke-static {v8, v12, v3, v13}, Landroidx/compose/foundation/layout/a;->r(Landroidx/compose/ui/Modifier;FFI)Landroidx/compose/ui/Modifier;

    move-result-object v3

    sget-object v8, Ll0/m;->a:Ll0/e;

    sget-object v12, Lb2/e;->J:Lb2/l;

    const/4 v15, 0x0

    invoke-static {v8, v12, v0, v15}, Ll0/p1;->a(Ll0/i;Lb2/g;Landroidx/compose/runtime/Composer;I)Ll0/r1;

    move-result-object v8

    move-object/from16 p0, v14

    iget-wide v13, v0, Lp1/q;->T:J

    invoke-static {v13, v14}, Ljava/lang/Long;->hashCode(J)I

    move-result v12

    invoke-virtual {v0}, Lp1/q;->m()Lp1/p1;

    move-result-object v13

    invoke-static {v0, v3}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    invoke-virtual {v0}, Lp1/q;->i0()V

    iget-boolean v14, v0, Lp1/q;->S:Z

    if-eqz v14, :cond_d

    invoke-virtual {v0, v9}, Lp1/q;->l(Lc93/a;)V

    goto :goto_7

    :cond_d
    invoke-virtual {v0}, Lp1/q;->s0()V

    :goto_7
    invoke-static {v0, v10, v8}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v0, v2, v13}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v2, v0, Lp1/q;->S:Z

    if-nez v2, :cond_e

    invoke-virtual {v0}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    invoke-static {v2, v8}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_f

    :cond_e
    move-object/from16 v2, p0

    invoke-static {v12, v0, v12, v2}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_f
    invoke-static {v0, v11, v3}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v9, Lny0/e0;->TEXT:Lny0/e0;

    invoke-virtual {v5}, Lrp2/b;->c()Z

    move-result v12

    new-instance v2, Lr12/a;

    const/4 v3, 0x6

    invoke-direct {v2, v5, v3}, Lr12/a;-><init>(Ljava/lang/Object;I)V

    const v3, 0xf7b77d

    invoke-static {v3, v0, v2}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v2

    and-int/lit16 v3, v7, 0x380

    const/16 v8, 0x100

    if-ne v3, v8, :cond_10

    const/4 v3, 0x1

    goto :goto_8

    :cond_10
    move v3, v15

    :goto_8
    and-int/lit8 v8, v7, 0x70

    const/16 v10, 0x20

    if-eq v8, v10, :cond_12

    and-int/lit8 v7, v7, 0x40

    if-eqz v7, :cond_11

    invoke-virtual {v0, v5}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_11

    goto :goto_9

    :cond_11
    move v7, v15

    goto :goto_a

    :cond_12
    :goto_9
    const/4 v7, 0x1

    :goto_a
    or-int/2addr v3, v7

    invoke-virtual {v0}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v7

    if-nez v3, :cond_13

    sget-object v3, Lp1/l;->a:Lp1/v0;

    if-ne v7, v3, :cond_14

    :cond_13
    new-instance v7, Lq11/c;

    const/16 v3, 0x13

    invoke-direct {v7, v3, v6, v5}, Lq11/c;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v0, v7}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_14
    move-object/from16 v16, v7

    check-cast v16, Lkotlin/jvm/functions/Function1;

    const/4 v13, 0x1

    const v18, 0xc00180

    const/16 v19, 0x6b

    const/4 v7, 0x0

    const/4 v8, 0x0

    const-wide/16 v10, 0x0

    move v3, v13

    const/4 v13, 0x0

    const/4 v14, 0x0

    move-object/from16 v17, v0

    move v0, v15

    move-object v15, v2

    invoke-static/range {v7 .. v19}, Lny0/d1;->e(Landroidx/compose/ui/Modifier;Lcom/whoop/design/util/TextResource;Lny0/e0;JZZLny0/d0;Lc93/m;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    move-object/from16 v2, v17

    invoke-virtual {v2, v3}, Lp1/q;->q(Z)V

    invoke-virtual {v5}, Lrp2/b;->a()Z

    move-result v7

    if-eqz v7, :cond_15

    const v7, -0x1091465b

    invoke-virtual {v2, v7}, Lp1/q;->e0(I)V

    const/16 v18, 0x0

    const/16 v19, 0xff

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const-wide/16 v12, 0x0

    const-wide/16 v14, 0x0

    const/16 v16, 0x0

    move-object/from16 v17, v2

    invoke-static/range {v7 .. v19}, Lhy0/i2;->j(Landroidx/compose/ui/Modifier;Lhy0/g;Lhy0/f;Lcom/whoop/design/util/TextResource;Ljava/lang/Float;JJLb91/c;Landroidx/compose/runtime/Composer;II)V

    invoke-virtual {v2, v0}, Lp1/q;->q(Z)V

    goto :goto_b

    :cond_15
    const v7, -0x1090b7b5

    invoke-virtual {v2, v7}, Lp1/q;->e0(I)V

    invoke-virtual {v2, v0}, Lp1/q;->q(Z)V

    :goto_b
    invoke-virtual {v2, v3}, Lp1/q;->q(Z)V

    goto :goto_c

    :cond_16
    move-object v2, v0

    invoke-virtual {v2}, Lp1/q;->X()V

    :goto_c
    invoke-virtual {v2}, Lp1/q;->u()Lp1/v1;

    move-result-object v7

    if-eqz v7, :cond_17

    new-instance v0, Lqb0/a;

    const/16 v3, 0x16

    move/from16 v2, p5

    invoke-direct/range {v0 .. v6}, Lqb0/a;-><init>(IIILjava/lang/Object;Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)V

    iput-object v0, v7, Lp1/v1;->d:Lc93/m;

    :cond_17
    return-void
.end method

.method private static final e(Lrp2/b;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 29

    and-int/lit8 v0, p2, 0x3

    const/4 v1, 0x2

    const/4 v2, 0x1

    if-eq v0, v1, :cond_0

    move v0, v2

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    and-int/lit8 v1, p2, 0x1

    move-object/from16 v3, p1

    check-cast v3, Lp1/q;

    invoke-virtual {v3, v1, v0}, Lp1/q;->U(IZ)Z

    move-result v0

    if-eqz v0, :cond_4

    const-wide/high16 v0, 0x3fe0000000000000L    # 0.5

    double-to-float v0, v0

    const/16 v1, 0x8

    int-to-float v1, v1

    mul-float/2addr v0, v1

    invoke-static {v0}, Ll0/m;->i(F)Ll0/k;

    move-result-object v0

    sget-object v1, Lb2/e;->M:Lb2/k;

    const/4 v4, 0x6

    invoke-static {v0, v1, v3, v4}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v0

    iget-wide v4, v3, Lp1/q;->T:J

    invoke-static {v4, v5}, Ljava/lang/Long;->hashCode(J)I

    move-result v1

    invoke-virtual {v3}, Lp1/q;->m()Lp1/p1;

    move-result-object v4

    sget-object v5, Lb2/t;->w:Lb2/t;

    invoke-static {v3, v5}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v5

    sget-object v6, La3/l;->a:La3/k;

    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v6, La3/k;->b:La3/j;

    invoke-virtual {v3}, Lp1/q;->i0()V

    iget-boolean v7, v3, Lp1/q;->S:Z

    if-eqz v7, :cond_1

    invoke-virtual {v3, v6}, Lp1/q;->l(Lc93/a;)V

    goto :goto_1

    :cond_1
    invoke-virtual {v3}, Lp1/q;->s0()V

    :goto_1
    sget-object v6, La3/k;->g:La3/i;

    invoke-static {v3, v6, v0}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v0, La3/k;->f:La3/i;

    invoke-static {v3, v0, v4}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v0, La3/k;->j:La3/i;

    iget-boolean v4, v3, Lp1/q;->S:Z

    if-nez v4, :cond_2

    invoke-virtual {v3}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-static {v4, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_3

    :cond_2
    invoke-static {v1, v3, v1, v0}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_3
    sget-object v0, La3/k;->d:La3/i;

    invoke-static {v3, v0, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual/range {p0 .. p0}, Lrp2/b;->b()Lcom/whoop/design/util/TextResource;

    move-result-object v0

    sget v1, Lcom/whoop/design/util/TextResource;->$stable:I

    invoke-static {v0, v3, v1}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v0

    invoke-static {}, Lx81/e;->s()Lp1/t1;

    move-result-object v4

    invoke-virtual {v3, v4}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ly81/i;

    invoke-virtual {v4}, Ly81/i;->y()J

    move-result-wide v5

    invoke-static {}, Lb91/e;->e()Lb91/d;

    move-result-object v4

    invoke-virtual {v4}, Lb91/d;->a()Lb91/a;

    move-result-object v23

    sget v4, Lb91/a;->d:I

    shl-int/lit8 v27, v4, 0x12

    const v28, 0x2fffa

    const/4 v4, 0x0

    const-wide/16 v7, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const-wide/16 v12, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const-wide/16 v16, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v24, 0x0

    const/16 v26, 0x0

    move-object/from16 v25, v3

    move-object v3, v0

    invoke-static/range {v3 .. v28}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v0, v25

    invoke-virtual/range {p0 .. p0}, Lrp2/b;->d()Lcom/whoop/design/util/TextResource;

    move-result-object v3

    invoke-static {v3, v0, v1}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v3

    invoke-static {}, Lx81/e;->s()Lp1/t1;

    move-result-object v1

    invoke-virtual {v0, v1}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ly81/i;

    invoke-virtual {v1}, Ly81/i;->c1()J

    move-result-wide v5

    invoke-static {}, Lb91/e;->e()Lb91/d;

    move-result-object v1

    invoke-virtual {v1}, Lb91/d;->b()Lb91/a;

    move-result-object v23

    invoke-static/range {v3 .. v28}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    invoke-virtual {v0, v2}, Lp1/q;->q(Z)V

    goto :goto_2

    :cond_4
    move-object v0, v3

    invoke-virtual {v0}, Lp1/q;->X()V

    :goto_2
    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method

.method private static final f(Lkotlin/jvm/functions/Function1;Lrp2/b;Z)Ll83/a0;
    .locals 0

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final g(Landroidx/compose/ui/Modifier;Lrp2/b;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 6

    or-int/lit8 p3, p3, 0x1

    invoke-static {p3}, Lp1/x;->L(I)I

    move-result v4

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move v5, p4

    move-object v3, p5

    invoke-static/range {v0 .. v5}, Lrp2/d;->d(Landroidx/compose/ui/Modifier;Lrp2/b;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static final synthetic h(Landroidx/compose/ui/Modifier;Lrp2/b;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V
    .locals 0

    invoke-static/range {p0 .. p5}, Lrp2/d;->d(Landroidx/compose/ui/Modifier;Lrp2/b;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    return-void
.end method
