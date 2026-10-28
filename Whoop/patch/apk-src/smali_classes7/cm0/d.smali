.class public abstract Lcm0/d;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u001a7\u0010\u0008\u001a\u00020\u00062\u0008\u0008\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0014\u0008\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0001\u00a2\u0006\u0004\u0008\u0008\u0010\t\u00a8\u0006\n"
    }
    d2 = {
        "Landroidx/compose/ui/Modifier;",
        "modifier",
        "Lcm0/e;",
        "viewState",
        "Lkotlin/Function1;",
        "",
        "Ll83/a0;",
        "onViewEvent",
        "g",
        "(Landroidx/compose/ui/Modifier;Lcm0/e;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V",
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
.method public static synthetic a(Lcm0/a;Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lcm0/d;->j(Lcm0/a;Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lcm0/a;Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, Lcm0/d;->l(Lcm0/a;Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Luz0/h;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lcm0/d;->i(Luz0/h;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Ljava/lang/Object;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lcm0/d;->h(Ljava/lang/Object;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic e(Landroidx/compose/ui/Modifier;Lcm0/e;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p6}, Lcm0/d;->m(Landroidx/compose/ui/Modifier;Lcm0/e;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic f(Lcm0/a;Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lcm0/d;->k(Lcm0/a;Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final g(Landroidx/compose/ui/Modifier;Lcm0/e;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V
    .locals 27
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/ui/Modifier;",
            "Lcm0/e;",
            "Lkotlin/jvm/functions/Function1;",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    move-object/from16 v2, p1

    move/from16 v4, p4

    const-string v0, "viewState"

    invoke-static {v2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v8, p3

    check-cast v8, Lp1/q;

    const v0, -0x173b6a17

    invoke-virtual {v8, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, p5, 0x1

    const/4 v1, 0x4

    if-eqz v0, :cond_0

    or-int/lit8 v3, v4, 0x6

    move v5, v3

    move-object/from16 v3, p0

    goto :goto_1

    :cond_0
    and-int/lit8 v3, v4, 0x6

    if-nez v3, :cond_2

    move-object/from16 v3, p0

    invoke-virtual {v8, v3}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_1

    move v5, v1

    goto :goto_0

    :cond_1
    const/4 v5, 0x2

    :goto_0
    or-int/2addr v5, v4

    goto :goto_1

    :cond_2
    move-object/from16 v3, p0

    move v5, v4

    :goto_1
    and-int/lit8 v6, v4, 0x30

    if-nez v6, :cond_4

    invoke-virtual {v8, v2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_3

    const/16 v6, 0x20

    goto :goto_2

    :cond_3
    const/16 v6, 0x10

    :goto_2
    or-int/2addr v5, v6

    :cond_4
    and-int/lit8 v6, p5, 0x4

    if-eqz v6, :cond_6

    or-int/lit16 v5, v5, 0x180

    :cond_5
    move-object/from16 v7, p2

    :goto_3
    move v12, v5

    goto :goto_5

    :cond_6
    and-int/lit16 v7, v4, 0x180

    if-nez v7, :cond_5

    move-object/from16 v7, p2

    invoke-virtual {v8, v7}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_7

    const/16 v9, 0x100

    goto :goto_4

    :cond_7
    const/16 v9, 0x80

    :goto_4
    or-int/2addr v5, v9

    goto :goto_3

    :goto_5
    and-int/lit16 v5, v12, 0x93

    const/16 v9, 0x92

    const/4 v13, 0x0

    if-eq v5, v9, :cond_8

    const/4 v5, 0x1

    goto :goto_6

    :cond_8
    move v5, v13

    :goto_6
    and-int/lit8 v9, v12, 0x1

    invoke-virtual {v8, v9, v5}, Lp1/q;->U(IZ)Z

    move-result v5

    if-eqz v5, :cond_1c

    sget-object v15, Lb2/t;->w:Lb2/t;

    if-eqz v0, :cond_9

    move-object v3, v15

    :cond_9
    sget-object v0, Lp1/l;->a:Lp1/v0;

    if-eqz v6, :cond_b

    invoke-virtual {v8}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    if-ne v5, v0, :cond_a

    new-instance v5, Lcj2/a;

    const/16 v6, 0x10

    invoke-direct {v5, v6}, Lcj2/a;-><init>(I)V

    invoke-virtual {v8, v5}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_a
    check-cast v5, Lkotlin/jvm/functions/Function1;

    goto :goto_7

    :cond_b
    move-object v5, v7

    :goto_7
    const/high16 v6, 0x3f800000    # 1.0f

    invoke-static {v6, v15}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v6

    invoke-interface {v6, v3}, Landroidx/compose/ui/Modifier;->e(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v6

    const-wide/high16 v9, 0x3ff8000000000000L    # 1.5

    double-to-float v7, v9

    const/16 v9, 0x8

    int-to-float v9, v9

    mul-float/2addr v7, v9

    invoke-static {v7}, Ll0/m;->i(F)Ll0/k;

    move-result-object v7

    sget-object v9, Lb2/e;->N:Lb2/k;

    const/16 v10, 0x36

    invoke-static {v7, v9, v8, v10}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v7

    iget-wide v9, v8, Lp1/q;->T:J

    invoke-static {v9, v10}, Ljava/lang/Long;->hashCode(J)I

    move-result v9

    invoke-virtual {v8}, Lp1/q;->m()Lp1/p1;

    move-result-object v10

    invoke-static {v8, v6}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v6

    sget-object v16, La3/l;->a:La3/k;

    invoke-virtual/range {v16 .. v16}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v14, La3/k;->b:La3/j;

    invoke-virtual {v8}, Lp1/q;->i0()V

    iget-boolean v11, v8, Lp1/q;->S:Z

    if-eqz v11, :cond_c

    invoke-virtual {v8, v14}, Lp1/q;->l(Lc93/a;)V

    goto :goto_8

    :cond_c
    invoke-virtual {v8}, Lp1/q;->s0()V

    :goto_8
    sget-object v11, La3/k;->g:La3/i;

    invoke-static {v8, v11, v7}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v7, La3/k;->f:La3/i;

    invoke-static {v8, v7, v10}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v7, La3/k;->j:La3/i;

    iget-boolean v10, v8, Lp1/q;->S:Z

    if-nez v10, :cond_d

    invoke-virtual {v8}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v10

    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v11

    invoke-static {v10, v11}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v10

    if-nez v10, :cond_e

    :cond_d
    invoke-static {v9, v8, v9, v7}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_e
    sget-object v7, La3/k;->d:La3/i;

    invoke-static {v8, v7, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual {v2}, Lcm0/e;->e()Luz0/i;

    move-result-object v6

    if-eqz v6, :cond_10

    const v6, 0x2e58ada9

    invoke-virtual {v8, v6}, Lp1/q;->e0(I)V

    move-object v7, v5

    invoke-virtual {v2}, Lcm0/e;->e()Luz0/i;

    move-result-object v5

    invoke-virtual {v8}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v6

    if-ne v6, v0, :cond_f

    new-instance v6, Lcj2/a;

    const/16 v9, 0x11

    invoke-direct {v6, v9}, Lcj2/a;-><init>(I)V

    invoke-virtual {v8, v6}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_f
    check-cast v6, Lkotlin/jvm/functions/Function1;

    const/16 v9, 0x30

    const/4 v10, 0x4

    move-object v11, v7

    const/4 v7, 0x0

    invoke-static/range {v5 .. v10}, Luz0/g;->d(Luz0/i;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V

    invoke-virtual {v8, v13}, Lp1/q;->q(Z)V

    goto :goto_9

    :cond_10
    move-object v11, v5

    invoke-virtual {v2}, Lcm0/e;->c()Lbm0/s;

    move-result-object v5

    if-eqz v5, :cond_11

    const v5, 0x2e5ba450

    invoke-virtual {v8, v5}, Lp1/q;->e0(I)V

    invoke-virtual {v2}, Lcm0/e;->c()Lbm0/s;

    move-result-object v5

    const/4 v9, 0x0

    const/4 v10, 0x6

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-static/range {v5 .. v10}, Lbm0/r;->v(Lbm0/s;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    invoke-virtual {v8, v13}, Lp1/q;->q(Z)V

    goto :goto_9

    :cond_11
    const v5, 0x2e5cdbe3

    invoke-virtual {v8, v5}, Lp1/q;->e0(I)V

    invoke-virtual {v8, v13}, Lp1/q;->q(Z)V

    :goto_9
    const/4 v5, 0x3

    int-to-float v5, v5

    int-to-float v1, v1

    mul-float/2addr v5, v1

    invoke-static {v5, v15}, Landroidx/compose/foundation/layout/d;->h(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    invoke-static {v8, v1}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    const v1, 0x6497ac95

    invoke-virtual {v8, v1}, Lp1/q;->e0(I)V

    invoke-virtual {v2}, Lcm0/e;->f()Lcm0/a;

    move-result-object v1

    invoke-virtual {v1}, Lcm0/a;->c()Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v5

    invoke-virtual {v1}, Lcm0/a;->a()Lcom/whoop/navigation/e;

    move-result-object v6

    if-eqz v6, :cond_12

    const/4 v6, 0x1

    goto :goto_a

    :cond_12
    move v6, v13

    :goto_a
    invoke-virtual {v8, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v7

    and-int/lit16 v9, v12, 0x380

    const/16 v10, 0x100

    if-ne v9, v10, :cond_13

    const/4 v12, 0x1

    goto :goto_b

    :cond_13
    move v12, v13

    :goto_b
    or-int/2addr v7, v12

    invoke-virtual {v8}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v12

    if-nez v7, :cond_14

    if-ne v12, v0, :cond_15

    :cond_14
    new-instance v12, Lcm0/c;

    const/4 v7, 0x0

    invoke-direct {v12, v1, v11, v7}, Lcm0/c;-><init>(Lcm0/a;Lkotlin/jvm/functions/Function1;I)V

    invoke-virtual {v8, v12}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_15
    move-object/from16 v18, v12

    check-cast v18, Lc93/a;

    sget v1, Lcom/whoop/design/util/TextResource;->$stable:I

    shl-int/lit8 v20, v1, 0x12

    const/16 v21, 0x0

    const/16 v22, 0x1fbd

    move-object v7, v11

    move-object v11, v5

    const/4 v5, 0x0

    move-object v12, v7

    const/4 v7, 0x0

    move-object/from16 v16, v8

    const/4 v8, 0x0

    move v14, v9

    const/4 v9, 0x0

    move v15, v10

    const/4 v10, 0x0

    move-object/from16 v17, v12

    const/4 v12, 0x0

    move/from16 v19, v13

    const/4 v13, 0x0

    move/from16 v23, v14

    const/4 v14, 0x0

    move/from16 v24, v15

    const/4 v15, 0x0

    move/from16 v25, v19

    move-object/from16 v19, v16

    const/16 v16, 0x0

    move-object/from16 v26, v17

    const/16 v17, 0x0

    move/from16 p0, v23

    move-object/from16 v23, v3

    move/from16 v3, p0

    move/from16 p0, v1

    move/from16 v4, v24

    move/from16 v1, v25

    move-object/from16 v2, v26

    invoke-static/range {v5 .. v22}, Lny0/z;->j(Landroidx/compose/ui/Modifier;ZZLjava/lang/Integer;Landroidx/compose/ui/Modifier;Lv41/r0;Lcom/whoop/design/util/TextResource;Lg1/u0;Li2/t;Lf0/t;FLl0/k1;Lb91/a;Lc93/a;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v8, v19

    invoke-virtual {v8, v1}, Lp1/q;->q(Z)V

    const v5, 0x6497c87c

    invoke-virtual {v8, v5}, Lp1/q;->e0(I)V

    invoke-virtual/range {p1 .. p1}, Lcm0/e;->b()Lcm0/a;

    move-result-object v5

    invoke-virtual {v5}, Lcm0/a;->c()Ljava/lang/String;

    move-result-object v6

    sget-object v7, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    const-string v9, "toUpperCase(...)"

    invoke-static {v7, v6, v9}, Ld13/a;->e(Ljava/util/Locale;Ljava/lang/String;Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v7

    invoke-virtual {v8, v5}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v6

    if-ne v3, v4, :cond_16

    const/4 v13, 0x1

    goto :goto_c

    :cond_16
    move v13, v1

    :goto_c
    or-int/2addr v6, v13

    invoke-virtual {v8}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v9

    if-nez v6, :cond_17

    if-ne v9, v0, :cond_18

    :cond_17
    new-instance v9, Lcm0/c;

    const/4 v6, 0x1

    invoke-direct {v9, v5, v2, v6}, Lcm0/c;-><init>(Lcm0/a;Lkotlin/jvm/functions/Function1;I)V

    invoke-virtual {v8, v9}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_18
    move-object v15, v9

    check-cast v15, Lc93/a;

    shl-int/lit8 v17, p0, 0x6

    const/16 v18, 0x0

    const/16 v19, 0x3fb

    const/4 v5, 0x0

    const/4 v6, 0x0

    move-object/from16 v16, v8

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    invoke-static/range {v5 .. v19}, Lny0/o0;->b(Landroidx/compose/ui/Modifier;ZLcom/whoop/design/util/TextResource;Lb91/a;Lg1/u0;Lf0/t;Ljava/lang/Integer;Landroidx/compose/ui/Modifier;ZLl0/k1;Lc93/a;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v8, v16

    invoke-virtual {v8, v1}, Lp1/q;->q(Z)V

    const v5, 0x6497e15b

    invoke-virtual {v8, v5}, Lp1/q;->e0(I)V

    invoke-virtual/range {p1 .. p1}, Lcm0/e;->a()Lcm0/a;

    move-result-object v5

    invoke-virtual {v5}, Lcm0/a;->c()Ljava/lang/String;

    move-result-object v6

    invoke-static {v6}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v7

    invoke-virtual {v8, v5}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v6

    if-ne v3, v4, :cond_19

    const/4 v13, 0x1

    goto :goto_d

    :cond_19
    move v13, v1

    :goto_d
    or-int v3, v6, v13

    invoke-virtual {v8}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    if-nez v3, :cond_1a

    if-ne v4, v0, :cond_1b

    :cond_1a
    new-instance v4, Lbe1/c;

    const/16 v0, 0xe

    invoke-direct {v4, v0, v5, v2}, Lbe1/c;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v8, v4}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_1b
    check-cast v4, Lkotlin/jvm/functions/Function1;

    const/16 v20, 0x0

    const/16 v21, 0xffb

    const/4 v5, 0x0

    const/4 v6, 0x0

    move-object/from16 v16, v8

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    move-object/from16 v19, v16

    const/16 v16, 0x0

    move-object/from16 v18, v19

    move/from16 v19, v17

    move-object/from16 v17, v4

    invoke-static/range {v5 .. v21}, Lny0/l0;->i(Landroidx/compose/ui/Modifier;Lny0/n0;Lcom/whoop/design/util/TextResource;Ly71/g;Ly71/g;ZLy81/e;Lj91/b;ZZLjava/lang/Float;Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v8, v18

    invoke-virtual {v8, v1}, Lp1/q;->q(Z)V

    const/4 v0, 0x1

    invoke-virtual {v8, v0}, Lp1/q;->q(Z)V

    move-object v3, v2

    move-object/from16 v1, v23

    goto :goto_e

    :cond_1c
    invoke-virtual {v8}, Lp1/q;->X()V

    move-object v1, v3

    move-object v3, v7

    :goto_e
    invoke-virtual {v8}, Lp1/q;->u()Lp1/v1;

    move-result-object v7

    if-eqz v7, :cond_1d

    new-instance v0, Lc41/d1;

    const/16 v6, 0xc

    move-object/from16 v2, p1

    move/from16 v4, p4

    move/from16 v5, p5

    invoke-direct/range {v0 .. v6}, Lc41/d1;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;III)V

    iput-object v0, v7, Lp1/v1;->d:Lc93/m;

    :cond_1d
    return-void
.end method

.method private static final h(Ljava/lang/Object;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final i(Luz0/h;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final j(Lcm0/a;Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 0

    invoke-virtual {p0}, Lcm0/a;->a()Lcom/whoop/navigation/e;

    move-result-object p0

    if-eqz p0, :cond_0

    invoke-interface {p1, p0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final k(Lcm0/a;Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 0

    invoke-virtual {p0}, Lcm0/a;->b()Lnl0/d;

    move-result-object p0

    if-eqz p0, :cond_0

    invoke-interface {p1, p0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final l(Lcm0/a;Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lcm0/a;->b()Lnl0/d;

    move-result-object p0

    if-eqz p0, :cond_0

    invoke-interface {p1, p0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final m(Landroidx/compose/ui/Modifier;Lcm0/e;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 6

    or-int/lit8 p3, p3, 0x1

    invoke-static {p3}, Lp1/x;->L(I)I

    move-result v4

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move v5, p4

    move-object v3, p5

    invoke-static/range {v0 .. v5}, Lcm0/d;->g(Landroidx/compose/ui/Modifier;Lcm0/e;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method
