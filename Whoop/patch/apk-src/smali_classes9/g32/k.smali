.class public abstract Lg32/k;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00008\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u001a7\u0010\u0008\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u00022\u0014\u0008\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0007\u00a2\u0006\u0004\u0008\u0008\u0010\t\u001a3\u0010\u000f\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\n2\u000c\u0010\r\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u000c2\u000c\u0010\u000e\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u000cH\u0001\u00a2\u0006\u0004\u0008\u000f\u0010\u0010\u001a7\u0010\u0011\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\n2\u000e\u0008\u0002\u0010\r\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u000c2\u000e\u0008\u0002\u0010\u000e\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u000cH\u0001\u00a2\u0006\u0004\u0008\u0011\u0010\u0012\u001aG\u0010\u0014\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u00022\u000e\u0008\u0002\u0010\u0013\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u000c2\u0014\u0008\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0001\u00a2\u0006\u0004\u0008\u0014\u0010\u0015\u00a8\u0006\u001a\u00b2\u0006\u000c\u0010\u0017\u001a\u00020\u00168\nX\u008a\u0084\u0002\u00b2\u0006\u000c\u0010\u0019\u001a\u00020\u00188\nX\u008a\u0084\u0002"
    }
    d2 = {
        "Lg32/l;",
        "viewState",
        "Landroidx/compose/ui/Modifier;",
        "modifier",
        "Lkotlin/Function1;",
        "",
        "Ll83/a0;",
        "onViewEvent",
        "D",
        "(Lg32/l;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V",
        "Le32/a;",
        "state",
        "Lkotlin/Function0;",
        "onRetry",
        "onDismiss",
        "s",
        "(Le32/a;Lc93/a;Lc93/a;Landroidx/compose/runtime/Composer;I)V",
        "y",
        "(Le32/a;Lc93/a;Lc93/a;Landroidx/compose/runtime/Composer;II)V",
        "initializePaymentSheet",
        "K",
        "(Lg32/l;Landroidx/compose/ui/Modifier;Lc93/a;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V",
        "Lg32/o;",
        "helper",
        "Le32/c;",
        "paymentViewState",
        "payments_release"
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
.method private static final A()Ll83/a0;
    .locals 1

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method

.method private static final B(Le32/a;Lc93/a;Lc93/a;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 6

    or-int/lit8 p3, p3, 0x1

    invoke-static {p3}, Lp1/x;->L(I)I

    move-result v4

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move v5, p4

    move-object v3, p5

    invoke-static/range {v0 .. v5}, Lg32/k;->y(Le32/a;Lc93/a;Lc93/a;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final C(Le32/a;Lc93/a;Lc93/a;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 6

    or-int/lit8 p3, p3, 0x1

    invoke-static {p3}, Lp1/x;->L(I)I

    move-result v4

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move v5, p4

    move-object v3, p5

    invoke-static/range {v0 .. v5}, Lg32/k;->y(Le32/a;Lc93/a;Lc93/a;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static final D(Lg32/l;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V
    .locals 26
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lg32/l;",
            "Landroidx/compose/ui/Modifier;",
            "Lkotlin/jvm/functions/Function1;",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    move-object/from16 v1, p0

    move/from16 v7, p4

    const-string v0, "viewState"

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v11, p3

    check-cast v11, Lp1/q;

    const v0, -0x40087454

    invoke-virtual {v11, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, v7, 0x6

    if-nez v0, :cond_1

    invoke-virtual {v11, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

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
    and-int/lit8 v2, p5, 0x2

    if-eqz v2, :cond_3

    or-int/lit8 v0, v0, 0x30

    :cond_2
    move-object/from16 v3, p1

    goto :goto_3

    :cond_3
    and-int/lit8 v3, v7, 0x30

    if-nez v3, :cond_2

    move-object/from16 v3, p1

    invoke-virtual {v11, v3}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_4

    const/16 v4, 0x20

    goto :goto_2

    :cond_4
    const/16 v4, 0x10

    :goto_2
    or-int/2addr v0, v4

    :goto_3
    and-int/lit8 v4, p5, 0x4

    const/16 v5, 0x100

    if-eqz v4, :cond_6

    or-int/lit16 v0, v0, 0x180

    :cond_5
    move-object/from16 v6, p2

    :goto_4
    move v15, v0

    goto :goto_6

    :cond_6
    and-int/lit16 v6, v7, 0x180

    if-nez v6, :cond_5

    move-object/from16 v6, p2

    invoke-virtual {v11, v6}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_7

    move v8, v5

    goto :goto_5

    :cond_7
    const/16 v8, 0x80

    :goto_5
    or-int/2addr v0, v8

    goto :goto_4

    :goto_6
    and-int/lit16 v0, v15, 0x93

    const/16 v8, 0x92

    const/16 v16, 0x1

    const/4 v14, 0x0

    if-eq v0, v8, :cond_8

    move/from16 v0, v16

    goto :goto_7

    :cond_8
    move v0, v14

    :goto_7
    and-int/lit8 v8, v15, 0x1

    invoke-virtual {v11, v8, v0}, Lp1/q;->U(IZ)Z

    move-result v0

    if-eqz v0, :cond_23

    if-eqz v2, :cond_9

    sget-object v0, Lb2/t;->w:Lb2/t;

    move-object/from16 v17, v0

    goto :goto_8

    :cond_9
    move-object/from16 v17, v3

    :goto_8
    sget-object v0, Lp1/l;->a:Lp1/v0;

    if-eqz v4, :cond_b

    invoke-virtual {v11}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v0, :cond_a

    new-instance v2, Lg1/u4;

    const/16 v3, 0x8

    invoke-direct {v2, v3}, Lg1/u4;-><init>(I)V

    invoke-virtual {v11, v2}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_a
    check-cast v2, Lkotlin/jvm/functions/Function1;

    move-object v3, v2

    goto :goto_9

    :cond_b
    move-object v3, v6

    :goto_9
    sget-object v2, Landroidx/compose/ui/platform/AndroidCompositionLocals_androidKt;->b:Lp1/u2;

    invoke-virtual {v11, v2}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/content/Context;

    const v4, 0x717a6169

    invoke-virtual {v11, v4}, Lp1/q;->f0(I)V

    sget-object v4, Lpf3/a;->b:Lnf3/a;

    const-string v6, "KoinApplication has not been started"

    if-eqz v4, :cond_22

    iget-object v4, v4, Lnf3/a;->a:Lwf3/a;

    iget-object v4, v4, Lwf3/a;->d:Lxf3/c;

    const v8, -0x384098

    invoke-virtual {v11, v8}, Lp1/q;->f0(I)V

    const/4 v9, 0x0

    invoke-virtual {v11, v9}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v10

    invoke-virtual {v11, v9}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v12

    or-int/2addr v10, v12

    invoke-virtual {v11}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v12

    if-nez v10, :cond_c

    if-ne v12, v0, :cond_d

    :cond_c
    sget-object v10, Ll83/i;->y:Ll83/i;

    new-instance v12, Lg32/k$b;

    invoke-direct {v12, v4, v9, v9}, Lg32/k$b;-><init>(Lxf3/c;Lvf3/a;Lc93/a;)V

    invoke-static {v10, v12}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v12

    invoke-virtual {v11, v12}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_d
    invoke-virtual {v11, v14}, Lp1/q;->q(Z)V

    move-object v4, v12

    check-cast v4, Ll83/h;

    invoke-virtual {v11, v14}, Lp1/q;->q(Z)V

    const v10, 0x59f3c69b

    invoke-virtual {v11, v10}, Lp1/q;->f0(I)V

    sget-object v10, Lpf3/a;->b:Lnf3/a;

    if-eqz v10, :cond_21

    iget-object v6, v10, Lnf3/a;->a:Lwf3/a;

    iget-object v6, v6, Lwf3/a;->d:Lxf3/c;

    const v10, 0x59f3c7cc

    invoke-static {v11, v10, v11, v14, v8}, Lvl/b;->r(Lp1/q;ILp1/q;ZI)Ljf3/a;

    move-result-object v8

    const/4 v10, 0x0

    invoke-virtual {v11, v10}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v12

    const/4 v13, 0x0

    invoke-virtual {v11, v13}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v18

    or-int v12, v12, v18

    invoke-virtual {v11}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v10

    if-nez v12, :cond_e

    if-ne v10, v0, :cond_f

    :cond_e
    new-instance v10, Lg32/k$a;

    invoke-direct {v10, v8}, Lg32/k$a;-><init>(Ljf3/a;)V

    const-class v8, Le32/e;

    sget-object v12, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v12, v8}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v21

    const/16 v22, 0x0

    move-object/from16 v18, v6

    move-object/from16 v20, v10

    move-object/from16 v23, v13

    const/16 v19, 0x0

    invoke-static/range {v18 .. v23}, Ljc/x;->X(Lxf3/c;Lvf3/a;Lc93/a;Lj93/d;Lc93/a;Lc93/a;)Landroidx/lifecycle/w1;

    move-result-object v10

    invoke-virtual {v11, v10}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_f
    invoke-virtual {v11, v14}, Lp1/q;->q(Z)V

    check-cast v10, Landroidx/lifecycle/w1;

    invoke-virtual {v11, v14}, Lp1/q;->q(Z)V

    move-object v6, v10

    check-cast v6, Le32/e;

    invoke-virtual {v1}, Lg32/l;->h()Lg32/m;

    move-result-object v21

    invoke-virtual {v6}, Le32/e;->n()Lec3/t1;

    move-result-object v8

    new-instance v10, Le32/c;

    const/4 v12, 0x3

    invoke-direct {v10, v9, v9, v12, v9}, Le32/c;-><init>(Le32/b;Le32/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move v13, v12

    const/4 v12, 0x0

    move/from16 v18, v13

    const/4 v13, 0x2

    move-object/from16 v19, v9

    move-object v9, v10

    const/4 v10, 0x0

    move/from16 v24, v18

    move-object/from16 v14, v19

    move-object/from16 p1, v21

    invoke-static/range {v8 .. v13}, Lp1/x;->n(Lec3/l;Ljava/lang/Object;Lq83/j;Landroidx/compose/runtime/Composer;II)Lp1/c1;

    move-result-object v25

    invoke-virtual/range {p1 .. p1}, Lg32/m;->c()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v11, v4}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v9

    invoke-virtual {v11, v2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v10

    or-int/2addr v9, v10

    move-object/from16 v10, p1

    invoke-virtual {v11, v10}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v12

    or-int/2addr v9, v12

    invoke-virtual {v11}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v12

    if-nez v9, :cond_10

    if-ne v12, v0, :cond_11

    :cond_10
    new-instance v12, Lg32/k$c;

    invoke-direct {v12, v2, v10, v4, v14}, Lg32/k$c;-><init>(Landroid/content/Context;Lg32/m;Ll83/h;Lq83/d;)V

    invoke-virtual {v11, v12}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_11
    check-cast v12, Lc93/m;

    invoke-static {v11, v12, v8}, Lp1/x;->g(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v4}, Lg32/k;->F(Ll83/h;)Lg32/o;

    move-result-object v8

    invoke-virtual {v10}, Lg32/m;->b()Lg32/f;

    move-result-object v9

    invoke-virtual {v10}, Lg32/m;->a()Lg32/e;

    move-result-object v2

    invoke-virtual {v11, v6}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v4

    invoke-virtual {v11, v10}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v12

    or-int/2addr v4, v12

    invoke-virtual {v11}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v12

    if-nez v4, :cond_12

    if-ne v12, v0, :cond_13

    :cond_12
    new-instance v12, Lg32/k$h;

    invoke-direct {v12, v6, v10, v14}, Lg32/k$h;-><init>(Le32/e;Lg32/m;Lq83/d;)V

    invoke-virtual {v11, v12}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_13
    check-cast v12, Lkotlin/jvm/functions/Function3;

    invoke-virtual {v11, v6}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v4

    invoke-virtual {v11, v10}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v13

    or-int/2addr v4, v13

    invoke-virtual {v11}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v13

    if-nez v4, :cond_14

    if-ne v13, v0, :cond_15

    :cond_14
    new-instance v13, Lfd3/a;

    const/16 v4, 0xe

    invoke-direct {v13, v4, v6, v10}, Lfd3/a;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v11, v13}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_15
    check-cast v13, Lkotlin/jvm/functions/Function1;

    const/4 v14, 0x0

    move-object v4, v10

    move-object v10, v2

    move-object v2, v4

    move-object v4, v13

    move-object v13, v11

    move-object v11, v12

    move-object v12, v4

    const/4 v4, 0x0

    invoke-virtual/range {v8 .. v14}, Lg32/o;->f(Lg32/f;Lg32/e;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)Lc93/a;

    move-result-object v8

    move-object v11, v13

    invoke-virtual {v11, v6}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v9

    and-int/lit16 v10, v15, 0x380

    if-ne v10, v5, :cond_16

    goto :goto_a

    :cond_16
    move/from16 v16, v4

    :goto_a
    or-int v5, v9, v16

    invoke-virtual {v11, v2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v9

    or-int/2addr v5, v9

    invoke-virtual {v11, v8}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v9

    or-int/2addr v5, v9

    invoke-virtual {v11}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v9

    if-nez v5, :cond_18

    if-ne v9, v0, :cond_17

    goto :goto_b

    :cond_17
    move-object v10, v2

    move-object/from16 v20, v3

    move v3, v4

    move-object v2, v6

    move-object v4, v8

    goto :goto_c

    :cond_18
    :goto_b
    new-instance v18, Lg32/k$d;

    const/16 v23, 0x0

    move-object/from16 v21, v2

    move-object/from16 v20, v3

    move-object/from16 v19, v6

    move-object/from16 v22, v8

    invoke-direct/range {v18 .. v23}, Lg32/k$d;-><init>(Le32/e;Lkotlin/jvm/functions/Function1;Lg32/m;Lc93/a;Lq83/d;)V

    move v3, v4

    move-object/from16 v9, v18

    move-object/from16 v2, v19

    move-object/from16 v10, v21

    move-object/from16 v4, v22

    invoke-virtual {v11, v9}, Lp1/q;->p0(Ljava/lang/Object;)V

    :goto_c
    check-cast v9, Lc93/m;

    sget-object v5, Ll83/a0;->a:Ll83/a0;

    invoke-static {v11, v9, v5}, Lp1/x;->g(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual {v1}, Lg32/l;->e()Z

    move-result v5

    invoke-static {v5}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v6

    invoke-virtual {v11, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v5

    invoke-virtual {v11, v2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v8

    or-int/2addr v5, v8

    invoke-virtual {v11, v10}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v8

    or-int/2addr v5, v8

    invoke-virtual {v11, v4}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v8

    or-int/2addr v5, v8

    invoke-virtual {v11}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v8

    if-nez v5, :cond_19

    if-ne v8, v0, :cond_1a

    :cond_19
    move-object v5, v0

    goto :goto_d

    :cond_1a
    move-object v9, v8

    move-object v8, v0

    move-object v0, v9

    move-object v9, v10

    move-object v10, v2

    move-object v2, v9

    move v9, v3

    goto :goto_e

    :goto_d
    new-instance v0, Lg32/k$e;

    move-object v8, v5

    const/4 v5, 0x0

    move v9, v3

    move-object v3, v10

    invoke-direct/range {v0 .. v5}, Lg32/k$e;-><init>(Lg32/l;Le32/e;Lg32/m;Lc93/a;Lq83/d;)V

    move-object v10, v2

    move-object v2, v3

    invoke-virtual {v11, v0}, Lp1/q;->p0(Ljava/lang/Object;)V

    :goto_e
    check-cast v0, Lc93/m;

    invoke-static {v11, v0, v6}, Lp1/x;->g(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual {v11, v10}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v0

    invoke-virtual {v11, v2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v1

    or-int/2addr v0, v1

    invoke-virtual {v11, v4}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v1

    or-int/2addr v0, v1

    invoke-virtual {v11}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    if-nez v0, :cond_1b

    if-ne v1, v8, :cond_1c

    :cond_1b
    new-instance v1, Ld30/r;

    const/16 v0, 0x10

    invoke-direct {v1, v10, v2, v4, v0}, Ld30/r;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    invoke-virtual {v11, v1}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_1c
    move-object v2, v1

    check-cast v2, Lc93/a;

    and-int/lit8 v0, v15, 0x7e

    shl-int/lit8 v1, v15, 0x3

    and-int/lit16 v1, v1, 0x1c00

    or-int v5, v0, v1

    const/4 v6, 0x0

    move-object/from16 v0, p0

    move-object v4, v11

    move-object/from16 v1, v17

    move-object/from16 v3, v20

    invoke-static/range {v0 .. v6}, Lg32/k;->K(Lg32/l;Landroidx/compose/ui/Modifier;Lc93/a;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    invoke-static/range {v25 .. v25}, Lg32/k;->H(Lp1/t2;)Le32/c;

    move-result-object v0

    invoke-virtual {v0}, Le32/c;->b()Le32/a;

    move-result-object v0

    invoke-virtual {v11, v10}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v2

    invoke-virtual {v11}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    if-nez v2, :cond_1d

    if-ne v3, v8, :cond_1e

    :cond_1d
    new-instance v3, Lg32/k$f;

    invoke-direct {v3, v10}, Lg32/k$f;-><init>(Ljava/lang/Object;)V

    invoke-virtual {v11, v3}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_1e
    check-cast v3, Lj93/g;

    check-cast v3, Lc93/a;

    invoke-virtual {v11, v10}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v2

    invoke-virtual {v11}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    if-nez v2, :cond_1f

    if-ne v4, v8, :cond_20

    :cond_1f
    new-instance v4, Lg32/k$g;

    invoke-direct {v4, v10}, Lg32/k$g;-><init>(Ljava/lang/Object;)V

    invoke-virtual {v11, v4}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_20
    check-cast v4, Lj93/g;

    check-cast v4, Lc93/a;

    invoke-static {v0, v3, v4, v11, v9}, Lg32/k;->s(Le32/a;Lc93/a;Lc93/a;Landroidx/compose/runtime/Composer;I)V

    move-object v2, v1

    move-object/from16 v3, v20

    goto :goto_f

    :cond_21
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0, v6}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_22
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0, v6}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_23
    invoke-virtual {v11}, Lp1/q;->X()V

    move-object v2, v3

    move-object v3, v6

    :goto_f
    invoke-virtual {v11}, Lp1/q;->u()Lp1/v1;

    move-result-object v8

    if-eqz v8, :cond_24

    new-instance v0, Lf02/c;

    const/16 v6, 0xa

    move-object/from16 v1, p0

    move/from16 v5, p5

    move v4, v7

    invoke-direct/range {v0 .. v6}, Lf02/c;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;III)V

    iput-object v0, v8, Lp1/v1;->d:Lc93/m;

    :cond_24
    return-void
.end method

.method private static final E(Ljava/lang/Object;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final F(Ll83/h;)Lg32/o;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ll83/h;",
            ")",
            "Lg32/o;"
        }
    .end annotation

    invoke-interface {p0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lg32/o;

    return-object p0
.end method

.method private static final G(Lg32/l;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 6

    or-int/lit8 p3, p3, 0x1

    invoke-static {p3}, Lp1/x;->L(I)I

    move-result v4

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move v5, p4

    move-object v3, p5

    invoke-static/range {v0 .. v5}, Lg32/k;->D(Lg32/l;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final H(Lp1/t2;)Le32/c;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp1/t2;",
            ")",
            "Le32/c;"
        }
    .end annotation

    invoke-interface {p0}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Le32/c;

    return-object p0
.end method

.method private static final I(Le32/e;Lg32/m;Lh20/b4;)Ll83/a0;
    .locals 1

    const-string v0, "result"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lg32/m;->d()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p2, p1}, Le32/e;->q(Lh20/b4;Ljava/lang/String;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final J(Le32/e;Lg32/m;Lc93/a;)Ll83/a0;
    .locals 0

    invoke-virtual {p1}, Lg32/m;->d()Ljava/lang/String;

    move-result-object p1

    invoke-virtual {p0, p1}, Le32/e;->p(Ljava/lang/String;)V

    invoke-interface {p2}, Lc93/a;->invoke()Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static final K(Lg32/l;Landroidx/compose/ui/Modifier;Lc93/a;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V
    .locals 21
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lg32/l;",
            "Landroidx/compose/ui/Modifier;",
            "Lc93/a;",
            "Lkotlin/jvm/functions/Function1;",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    move-object/from16 v1, p0

    move/from16 v5, p5

    const-string v0, "viewState"

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v9, p4

    check-cast v9, Lp1/q;

    const v0, -0x8571e2b

    invoke-virtual {v9, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, v5, 0x6

    if-nez v0, :cond_1

    invoke-virtual {v9, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x4

    goto :goto_0

    :cond_0
    const/4 v0, 0x2

    :goto_0
    or-int/2addr v0, v5

    goto :goto_1

    :cond_1
    move v0, v5

    :goto_1
    and-int/lit8 v4, p6, 0x2

    if-eqz v4, :cond_3

    or-int/lit8 v0, v0, 0x30

    :cond_2
    move-object/from16 v6, p1

    goto :goto_3

    :cond_3
    and-int/lit8 v6, v5, 0x30

    if-nez v6, :cond_2

    move-object/from16 v6, p1

    invoke-virtual {v9, v6}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_4

    const/16 v7, 0x20

    goto :goto_2

    :cond_4
    const/16 v7, 0x10

    :goto_2
    or-int/2addr v0, v7

    :goto_3
    and-int/lit8 v7, p6, 0x4

    if-eqz v7, :cond_6

    or-int/lit16 v0, v0, 0x180

    :cond_5
    move-object/from16 v8, p2

    goto :goto_5

    :cond_6
    and-int/lit16 v8, v5, 0x180

    if-nez v8, :cond_5

    move-object/from16 v8, p2

    invoke-virtual {v9, v8}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_7

    const/16 v10, 0x100

    goto :goto_4

    :cond_7
    const/16 v10, 0x80

    :goto_4
    or-int/2addr v0, v10

    :goto_5
    and-int/lit8 v10, p6, 0x8

    if-eqz v10, :cond_9

    or-int/lit16 v0, v0, 0xc00

    :cond_8
    move-object/from16 v11, p3

    goto :goto_7

    :cond_9
    and-int/lit16 v11, v5, 0xc00

    if-nez v11, :cond_8

    move-object/from16 v11, p3

    invoke-virtual {v9, v11}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v14

    if-eqz v14, :cond_a

    const/16 v14, 0x800

    goto :goto_6

    :cond_a
    const/16 v14, 0x400

    :goto_6
    or-int/2addr v0, v14

    :goto_7
    and-int/lit16 v14, v0, 0x493

    const/16 v15, 0x492

    move/from16 v16, v7

    if-eq v14, v15, :cond_b

    const/4 v14, 0x1

    goto :goto_8

    :cond_b
    const/4 v14, 0x0

    :goto_8
    and-int/lit8 v15, v0, 0x1

    invoke-virtual {v9, v15, v14}, Lp1/q;->U(IZ)Z

    move-result v14

    if-eqz v14, :cond_24

    sget-object v14, Lb2/t;->w:Lb2/t;

    if-eqz v4, :cond_c

    move-object v4, v14

    goto :goto_9

    :cond_c
    move-object v4, v6

    :goto_9
    sget-object v15, Lp1/l;->a:Lp1/v0;

    if-eqz v16, :cond_e

    invoke-virtual {v9}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v6

    if-ne v6, v15, :cond_d

    new-instance v6, Lfw0/a;

    const/16 v8, 0x16

    invoke-direct {v6, v8}, Lfw0/a;-><init>(I)V

    invoke-virtual {v9, v6}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_d
    check-cast v6, Lc93/a;

    goto :goto_a

    :cond_e
    move-object v6, v8

    :goto_a
    if-eqz v10, :cond_10

    invoke-virtual {v9}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v8

    if-ne v8, v15, :cond_f

    new-instance v8, Lg1/u4;

    const/16 v10, 0x9

    invoke-direct {v8, v10}, Lg1/u4;-><init>(I)V

    invoke-virtual {v9, v8}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_f
    check-cast v8, Lkotlin/jvm/functions/Function1;

    goto :goto_b

    :cond_10
    move-object v8, v11

    :goto_b
    const/4 v10, 0x3

    int-to-float v11, v10

    const/16 v7, 0x8

    int-to-float v7, v7

    mul-float/2addr v11, v7

    invoke-static {v11}, Ll0/m;->i(F)Ll0/k;

    move-result-object v11

    sget-object v10, Lb2/e;->N:Lb2/k;

    const/16 v12, 0x36

    invoke-static {v11, v10, v9, v12}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v10

    iget-wide v11, v9, Lp1/q;->T:J

    invoke-static {v11, v12}, Ljava/lang/Long;->hashCode(J)I

    move-result v11

    invoke-virtual {v9}, Lp1/q;->m()Lp1/p1;

    move-result-object v12

    invoke-static {v9, v4}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v13

    sget-object v17, La3/l;->a:La3/k;

    invoke-virtual/range {v17 .. v17}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move/from16 v17, v7

    sget-object v7, La3/k;->b:La3/j;

    invoke-virtual {v9}, Lp1/q;->i0()V

    iget-boolean v3, v9, Lp1/q;->S:Z

    if-eqz v3, :cond_11

    invoke-virtual {v9, v7}, Lp1/q;->l(Lc93/a;)V

    goto :goto_c

    :cond_11
    invoke-virtual {v9}, Lp1/q;->s0()V

    :goto_c
    sget-object v3, La3/k;->g:La3/i;

    invoke-static {v9, v3, v10}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v10, La3/k;->f:La3/i;

    invoke-static {v9, v10, v12}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v12, La3/k;->j:La3/i;

    iget-boolean v2, v9, Lp1/q;->S:Z

    if-nez v2, :cond_12

    invoke-virtual {v9}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-static {v2, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_13

    :cond_12
    invoke-static {v11, v9, v11, v12}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_13
    sget-object v1, La3/k;->d:La3/i;

    invoke-static {v9, v1, v13}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const/4 v2, 0x2

    int-to-float v2, v2

    mul-float v2, v2, v17

    invoke-static {v2}, Ll0/m;->i(F)Ll0/k;

    move-result-object v2

    sget-object v11, Lb2/e;->M:Lb2/k;

    const/4 v13, 0x6

    invoke-static {v2, v11, v9, v13}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v2

    move/from16 p2, v13

    move-object/from16 v18, v14

    iget-wide v13, v9, Lp1/q;->T:J

    invoke-static {v13, v14}, Ljava/lang/Long;->hashCode(J)I

    move-result v11

    invoke-virtual {v9}, Lp1/q;->m()Lp1/p1;

    move-result-object v13

    move-object/from16 v14, v18

    move-object/from16 v18, v4

    invoke-static {v9, v14}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    invoke-virtual {v9}, Lp1/q;->i0()V

    iget-boolean v5, v9, Lp1/q;->S:Z

    if-eqz v5, :cond_14

    invoke-virtual {v9, v7}, Lp1/q;->l(Lc93/a;)V

    goto :goto_d

    :cond_14
    invoke-virtual {v9}, Lp1/q;->s0()V

    :goto_d
    invoke-static {v9, v3, v2}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v9, v10, v13}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v2, v9, Lp1/q;->S:Z

    if-nez v2, :cond_15

    invoke-virtual {v9}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-static {v2, v5}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_16

    :cond_15
    invoke-static {v11, v9, v11, v12}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_16
    invoke-static {v9, v1, v4}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual/range {p0 .. p0}, Lg32/l;->f()Lp31/p;

    move-result-object v2

    if-nez v2, :cond_17

    const v2, 0x6bd8dd41

    invoke-virtual {v9, v2}, Lp1/q;->e0(I)V

    const/4 v2, 0x0

    invoke-virtual {v9, v2}, Lp1/q;->q(Z)V

    move-object v4, v6

    move-object v13, v7

    move-object v5, v8

    move-object/from16 v19, v10

    const/4 v2, 0x1

    const/16 v16, 0x3

    goto :goto_10

    :cond_17
    const v4, 0x6bd8dd42

    invoke-virtual {v9, v4}, Lp1/q;->e0(I)V

    and-int/lit16 v4, v0, 0x1c00

    const/16 v5, 0x800

    if-ne v4, v5, :cond_18

    const/4 v4, 0x1

    goto :goto_e

    :cond_18
    const/4 v4, 0x0

    :goto_e
    and-int/lit16 v5, v0, 0x380

    const/16 v11, 0x100

    if-ne v5, v11, :cond_19

    const/4 v5, 0x1

    goto :goto_f

    :cond_19
    const/4 v5, 0x0

    :goto_f
    or-int/2addr v4, v5

    invoke-virtual {v9}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    if-nez v4, :cond_1a

    if-ne v5, v15, :cond_1b

    :cond_1a
    new-instance v5, Lat2/l;

    const/4 v4, 0x3

    invoke-direct {v5, v8, v6, v4}, Lat2/l;-><init>(Lkotlin/jvm/functions/Function1;Lc93/a;I)V

    invoke-virtual {v9, v5}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_1b
    check-cast v5, Lkotlin/jvm/functions/Function1;

    move-object v4, v10

    sget v10, Lp31/p;->a:I

    const/4 v11, 0x2

    move-object v13, v7

    const/4 v7, 0x0

    move-object/from16 v16, v8

    move-object v8, v5

    move-object/from16 v5, v16

    move-object/from16 v19, v4

    move-object v4, v6

    const/16 v16, 0x3

    move-object v6, v2

    const/4 v2, 0x1

    invoke-static/range {v6 .. v11}, Lp31/n;->p(Lp31/p;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    const/4 v6, 0x0

    invoke-virtual {v9, v6}, Lp1/q;->q(Z)V

    :goto_10
    const/16 v6, 0xf

    int-to-float v6, v6

    const/4 v7, 0x4

    int-to-float v7, v7

    mul-float/2addr v6, v7

    const/4 v8, 0x0

    invoke-static {v14, v8, v6, v2}, Landroidx/compose/foundation/layout/d;->b(Landroidx/compose/ui/Modifier;FFI)Landroidx/compose/ui/Modifier;

    move-result-object v6

    move v8, v7

    invoke-virtual/range {p0 .. p0}, Lg32/l;->g()Ly71/o;

    move-result-object v7

    and-int/lit16 v10, v0, 0x1c00

    const/16 v11, 0x800

    if-ne v10, v11, :cond_1c

    move v10, v2

    goto :goto_11

    :cond_1c
    const/4 v10, 0x0

    :goto_11
    and-int/lit16 v0, v0, 0x380

    const/16 v11, 0x100

    if-ne v0, v11, :cond_1d

    move v0, v2

    goto :goto_12

    :cond_1d
    const/4 v0, 0x0

    :goto_12
    or-int/2addr v0, v10

    invoke-virtual {v9}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v10

    if-nez v0, :cond_1e

    if-ne v10, v15, :cond_1f

    :cond_1e
    new-instance v10, Lg32/j;

    const/4 v0, 0x0

    invoke-direct {v10, v5, v4, v0}, Lg32/j;-><init>(Lkotlin/jvm/functions/Function1;Lc93/a;I)V

    invoke-virtual {v9, v10}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_1f
    check-cast v10, Lc93/a;

    sget v0, Ly71/o;->q:I

    shl-int/lit8 v0, v0, 0x3

    or-int/lit8 v0, v0, 0x6

    const/4 v11, 0x0

    move-object/from16 v20, v10

    move v10, v0

    move v0, v8

    move-object/from16 v8, v20

    invoke-static/range {v6 .. v11}, Ly71/n;->c(Landroidx/compose/ui/Modifier;Ly71/o;Lc93/a;Landroidx/compose/runtime/Composer;II)V

    invoke-virtual {v9, v2}, Lp1/q;->q(Z)V

    int-to-float v6, v2

    mul-float v6, v6, v17

    invoke-static {v6}, Ll0/m;->i(F)Ll0/k;

    move-result-object v6

    sget-object v7, Lb2/e;->J:Lb2/l;

    move/from16 v8, p2

    invoke-static {v6, v7, v9, v8}, Ll0/p1;->a(Ll0/i;Lb2/g;Landroidx/compose/runtime/Composer;I)Ll0/r1;

    move-result-object v6

    iget-wide v7, v9, Lp1/q;->T:J

    invoke-static {v7, v8}, Ljava/lang/Long;->hashCode(J)I

    move-result v7

    invoke-virtual {v9}, Lp1/q;->m()Lp1/p1;

    move-result-object v8

    invoke-static {v9, v14}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v10

    invoke-virtual {v9}, Lp1/q;->i0()V

    iget-boolean v11, v9, Lp1/q;->S:Z

    if-eqz v11, :cond_20

    invoke-virtual {v9, v13}, Lp1/q;->l(Lc93/a;)V

    goto :goto_13

    :cond_20
    invoke-virtual {v9}, Lp1/q;->s0()V

    :goto_13
    invoke-static {v9, v3, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    move-object/from16 v3, v19

    invoke-static {v9, v3, v8}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v3, v9, Lp1/q;->S:Z

    if-nez v3, :cond_21

    invoke-virtual {v9}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-static {v3, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_22

    :cond_21
    invoke-static {v7, v9, v7, v12}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_22
    invoke-static {v9, v1, v10}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const v1, -0x2fa99cef

    invoke-virtual {v9, v1}, Lp1/q;->e0(I)V

    invoke-virtual/range {p0 .. p0}, Lg32/l;->c()Ljava/util/List;

    move-result-object v1

    check-cast v1, Ljava/lang/Iterable;

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_14
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_23

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    move-object v6, v3

    check-cast v6, Lkd1/o;

    const-wide/high16 v7, 0x401f000000000000L    # 7.75

    double-to-float v3, v7

    mul-float/2addr v3, v0

    invoke-static {v3, v14}, Landroidx/compose/foundation/layout/d;->u(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    const/4 v7, 0x5

    int-to-float v7, v7

    mul-float/2addr v7, v0

    invoke-static {v7, v3}, Landroidx/compose/foundation/layout/d;->h(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    sget v10, Lkd1/o;->a:I

    const/4 v11, 0x3

    const/4 v7, 0x0

    const/4 v8, 0x0

    invoke-static/range {v6 .. v11}, Lkd1/p;->i(Lkd1/o;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)Ln2/a;

    move-result-object v6

    move-object v7, v14

    const/16 v14, 0x1b0

    const/16 v15, 0x78

    move-object v8, v7

    const/4 v7, 0x0

    move-object v13, v9

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    move-object/from16 v20, v8

    move-object v8, v3

    move-object/from16 v3, v20

    invoke-static/range {v6 .. v15}, Lpf/c;->c(Ln2/a;Ljava/lang/String;Landroidx/compose/ui/Modifier;Lb2/h;Ly2/k;FLi2/y;Landroidx/compose/runtime/Composer;II)V

    move-object v14, v3

    move-object v9, v13

    goto :goto_14

    :cond_23
    const/4 v6, 0x0

    invoke-static {v9, v6, v2, v2}, Lm4/a;->y(Lp1/q;ZZZ)V

    move-object v3, v4

    move-object v4, v5

    move-object/from16 v2, v18

    goto :goto_15

    :cond_24
    invoke-virtual {v9}, Lp1/q;->X()V

    move-object v2, v6

    move-object v3, v8

    move-object v4, v11

    :goto_15
    invoke-virtual {v9}, Lp1/q;->u()Lp1/v1;

    move-result-object v8

    if-eqz v8, :cond_25

    new-instance v0, Lg1/m3;

    const/4 v7, 0x1

    move-object/from16 v1, p0

    move/from16 v5, p5

    move/from16 v6, p6

    invoke-direct/range {v0 .. v7}, Lg1/m3;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;III)V

    iput-object v0, v8, Lp1/v1;->d:Lc93/m;

    :cond_25
    return-void
.end method

.method private static final L()Ll83/a0;
    .locals 1

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method

.method private static final M(Ljava/lang/Object;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final N(Lkotlin/jvm/functions/Function1;Lc93/a;Lp31/j;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p2, Le32/d$a;->a:Le32/d$a;

    invoke-interface {p0, p2}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-interface {p1}, Lc93/a;->invoke()Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final O(Lkotlin/jvm/functions/Function1;Lc93/a;)Ll83/a0;
    .locals 1

    sget-object v0, Le32/d$a;->a:Le32/d$a;

    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-interface {p1}, Lc93/a;->invoke()Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final P(Lg32/l;Landroidx/compose/ui/Modifier;Lc93/a;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 7

    or-int/lit8 p4, p4, 0x1

    invoke-static {p4}, Lp1/x;->L(I)I

    move-result v5

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move v6, p5

    move-object v4, p6

    invoke-static/range {v0 .. v6}, Lg32/k;->K(Lg32/l;Landroidx/compose/ui/Modifier;Lc93/a;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static final synthetic Q(Ll83/h;)Lg32/o;
    .locals 0

    invoke-static {p0}, Lg32/k;->F(Ll83/h;)Lg32/o;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic a()Ll83/a0;
    .locals 1

    invoke-static {}, Lg32/k;->z()Ll83/a0;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic b(Le32/a;Lc93/a;Lc93/a;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p5}, Lg32/k;->x(Le32/a;Lc93/a;Lc93/a;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Le32/a;Lc93/a;Lc93/a;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p5}, Lg32/k;->t(Le32/a;Lc93/a;Lc93/a;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Ljava/lang/Object;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lg32/k;->M(Ljava/lang/Object;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic e(Le32/a;Lc93/a;Lc93/a;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p6}, Lg32/k;->B(Le32/a;Lc93/a;Lc93/a;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic f()Ll83/a0;
    .locals 1

    invoke-static {}, Lg32/k;->u()Ll83/a0;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic g(Le32/a;Lc93/a;Lc93/a;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Lg32/k;->v(Le32/a;Lc93/a;Lc93/a;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic h()Ll83/a0;
    .locals 1

    invoke-static {}, Lg32/k;->A()Ll83/a0;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic i(Le32/e;Lg32/m;Lh20/b4;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, Lg32/k;->I(Le32/e;Lg32/m;Lh20/b4;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic j()Ll83/a0;
    .locals 1

    invoke-static {}, Lg32/k;->L()Ll83/a0;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic k(Lg32/l;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p6}, Lg32/k;->G(Lg32/l;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic l(Lg32/l;Landroidx/compose/ui/Modifier;Lc93/a;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p7}, Lg32/k;->P(Lg32/l;Landroidx/compose/ui/Modifier;Lc93/a;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic m(Le32/e;Lg32/m;Lc93/a;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, Lg32/k;->J(Le32/e;Lg32/m;Lc93/a;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic n(Lkotlin/jvm/functions/Function1;Lc93/a;Lp31/j;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, Lg32/k;->N(Lkotlin/jvm/functions/Function1;Lc93/a;Lp31/j;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic o(Ljava/lang/Object;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lg32/k;->E(Ljava/lang/Object;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic p(Le32/a;Lc93/a;Lc93/a;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p6}, Lg32/k;->C(Le32/a;Lc93/a;Lc93/a;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic q(Lc93/a;Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 0

    invoke-static {p1, p0}, Lg32/k;->O(Lkotlin/jvm/functions/Function1;Lc93/a;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic r(Landroid/view/Window;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lg32/k;->w(Landroid/view/Window;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final s(Le32/a;Lc93/a;Lc93/a;Landroidx/compose/runtime/Composer;I)V
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Le32/a;",
            "Lc93/a;",
            "Lc93/a;",
            "Landroidx/compose/runtime/Composer;",
            "I)V"
        }
    .end annotation

    const-string v0, "state"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onRetry"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onDismiss"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p3, Lp1/q;

    const v0, -0x58ed594b

    invoke-virtual {p3, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, p4, 0x6

    if-nez v0, :cond_1

    invoke-virtual {p3, p0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x4

    goto :goto_0

    :cond_0
    const/4 v0, 0x2

    :goto_0
    or-int/2addr v0, p4

    goto :goto_1

    :cond_1
    move v0, p4

    :goto_1
    and-int/lit8 v1, p4, 0x30

    if-nez v1, :cond_3

    invoke-virtual {p3, p1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    const/16 v1, 0x20

    goto :goto_2

    :cond_2
    const/16 v1, 0x10

    :goto_2
    or-int/2addr v0, v1

    :cond_3
    and-int/lit16 v1, p4, 0x180

    if-nez v1, :cond_5

    invoke-virtual {p3, p2}, Lp1/q;->i(Ljava/lang/Object;)Z

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

    const/4 v3, 0x1

    if-eq v1, v2, :cond_6

    move v1, v3

    goto :goto_4

    :cond_6
    const/4 v1, 0x0

    :goto_4
    and-int/2addr v0, v3

    invoke-virtual {p3, v0, v1}, Lp1/q;->U(IZ)Z

    move-result v0

    if-eqz v0, :cond_9

    instance-of v0, p0, Le32/a$c;

    if-eqz v0, :cond_7

    invoke-virtual {p3}, Lp1/q;->u()Lp1/v1;

    move-result-object p3

    if-eqz p3, :cond_a

    new-instance v0, Lg32/h;

    const/4 v5, 0x0

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move v4, p4

    invoke-direct/range {v0 .. v5}, Lg32/h;-><init>(Le32/a;Lc93/a;Lc93/a;II)V

    iput-object v0, p3, Lp1/v1;->d:Lc93/m;

    return-void

    :cond_7
    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move v4, p4

    invoke-virtual {p3}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object p0

    sget-object p1, Lp1/l;->a:Lp1/v0;

    if-ne p0, p1, :cond_8

    new-instance p0, Lfw0/a;

    const/16 p1, 0x15

    invoke-direct {p0, p1}, Lfw0/a;-><init>(I)V

    invoke-virtual {p3, p0}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_8
    check-cast p0, Lc93/a;

    new-instance v5, Lc4/a0;

    const/4 v9, 0x0

    const/16 v10, 0x24

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    invoke-direct/range {v5 .. v10}, Lc4/a0;-><init>(ZZZZI)V

    new-instance p1, La01/d;

    const/16 p2, 0xe

    invoke-direct {p1, v1, v2, v3, p2}, La01/d;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    const p2, 0x3043498c

    invoke-static {p2, p3, p1}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object p1

    const/16 p2, 0x1b6

    invoke-static {p0, v5, p1, p3, p2}, Lse/b;->d(Lc93/a;Lc4/a0;Lx1/b;Landroidx/compose/runtime/Composer;I)V

    goto :goto_5

    :cond_9
    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move v4, p4

    invoke-virtual {p3}, Lp1/q;->X()V

    :goto_5
    invoke-virtual {p3}, Lp1/q;->u()Lp1/v1;

    move-result-object p0

    if-eqz p0, :cond_a

    move v5, v4

    move-object v4, v3

    move-object v3, v2

    move-object v2, v1

    new-instance v1, Lg32/h;

    const/4 v6, 0x1

    invoke-direct/range {v1 .. v6}, Lg32/h;-><init>(Le32/a;Lc93/a;Lc93/a;II)V

    iput-object v1, p0, Lp1/v1;->d:Lc93/m;

    :cond_a
    return-void
.end method

.method private static final t(Le32/a;Lc93/a;Lc93/a;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p3, p3, 0x1

    invoke-static {p3}, Lp1/x;->L(I)I

    move-result p3

    invoke-static {p0, p1, p2, p4, p3}, Lg32/k;->s(Le32/a;Lc93/a;Lc93/a;Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final u()Ll83/a0;
    .locals 1

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method

.method private static final v(Le32/a;Lc93/a;Lc93/a;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 7

    and-int/lit8 v0, p4, 0x3

    const/4 v1, 0x2

    const/4 v2, 0x1

    if-eq v0, v1, :cond_0

    move v0, v2

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    and-int/2addr p4, v2

    move-object v4, p3

    check-cast v4, Lp1/q;

    invoke-virtual {v4, p4, v0}, Lp1/q;->U(IZ)Z

    move-result p3

    if-eqz p3, :cond_5

    sget-object p3, Landroidx/compose/ui/platform/AndroidCompositionLocals_androidKt;->f:Lp1/u2;

    invoke-virtual {v4, p3}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Landroid/view/View;

    invoke-virtual {p3}, Landroid/view/View;->getParent()Landroid/view/ViewParent;

    move-result-object p3

    instance-of p4, p3, Lc4/b0;

    const/4 v0, 0x0

    if-eqz p4, :cond_1

    check-cast p3, Lc4/b0;

    goto :goto_1

    :cond_1
    move-object p3, v0

    :goto_1
    if-eqz p3, :cond_2

    invoke-interface {p3}, Lc4/b0;->getWindow()Landroid/view/Window;

    move-result-object v0

    :cond_2
    invoke-virtual {v4, v0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result p3

    invoke-virtual {v4}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object p4

    if-nez p3, :cond_3

    sget-object p3, Lp1/l;->a:Lp1/v0;

    if-ne p4, p3, :cond_4

    :cond_3
    new-instance p4, Ld1/i;

    const/16 p3, 0x18

    invoke-direct {p4, v0, p3}, Ld1/i;-><init>(Ljava/lang/Object;I)V

    invoke-virtual {v4, p4}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_4
    check-cast p4, Lc93/a;

    invoke-static {p4, v4}, Lp1/x;->k(Lc93/a;Landroidx/compose/runtime/Composer;)V

    const/4 v5, 0x0

    const/4 v6, 0x0

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    invoke-static/range {v1 .. v6}, Lg32/k;->y(Le32/a;Lc93/a;Lc93/a;Landroidx/compose/runtime/Composer;II)V

    goto :goto_2

    :cond_5
    invoke-virtual {v4}, Lp1/q;->X()V

    :goto_2
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final w(Landroid/view/Window;)Ll83/a0;
    .locals 1

    if-eqz p0, :cond_0

    const/4 v0, 0x0

    invoke-virtual {p0, v0}, Landroid/view/Window;->setDimAmount(F)V

    const/4 v0, -0x1

    invoke-virtual {p0, v0, v0}, Landroid/view/Window;->setLayout(II)V

    :cond_0
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final x(Le32/a;Lc93/a;Lc93/a;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p3, p3, 0x1

    invoke-static {p3}, Lp1/x;->L(I)I

    move-result p3

    invoke-static {p0, p1, p2, p4, p3}, Lg32/k;->s(Le32/a;Lc93/a;Lc93/a;Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static final y(Le32/a;Lc93/a;Lc93/a;Landroidx/compose/runtime/Composer;II)V
    .locals 21
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Le32/a;",
            "Lc93/a;",
            "Lc93/a;",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    move-object/from16 v1, p0

    move/from16 v4, p4

    const-string v0, "state"

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v0, p3

    check-cast v0, Lp1/q;

    const v2, -0x724c4f98

    invoke-virtual {v0, v2}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v2, v4, 0x6

    if-nez v2, :cond_1

    invoke-virtual {v0, v1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    const/4 v2, 0x4

    goto :goto_0

    :cond_0
    const/4 v2, 0x2

    :goto_0
    or-int/2addr v2, v4

    goto :goto_1

    :cond_1
    move v2, v4

    :goto_1
    and-int/lit8 v3, p5, 0x2

    if-eqz v3, :cond_3

    or-int/lit8 v2, v2, 0x30

    :cond_2
    move-object/from16 v5, p1

    goto :goto_3

    :cond_3
    and-int/lit8 v5, v4, 0x30

    if-nez v5, :cond_2

    move-object/from16 v5, p1

    invoke-virtual {v0, v5}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_4

    const/16 v6, 0x20

    goto :goto_2

    :cond_4
    const/16 v6, 0x10

    :goto_2
    or-int/2addr v2, v6

    :goto_3
    and-int/lit8 v6, p5, 0x4

    if-eqz v6, :cond_6

    or-int/lit16 v2, v2, 0x180

    :cond_5
    move-object/from16 v7, p2

    goto :goto_5

    :cond_6
    and-int/lit16 v7, v4, 0x180

    if-nez v7, :cond_5

    move-object/from16 v7, p2

    invoke-virtual {v0, v7}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_7

    const/16 v8, 0x100

    goto :goto_4

    :cond_7
    const/16 v8, 0x80

    :goto_4
    or-int/2addr v2, v8

    :goto_5
    and-int/lit16 v8, v2, 0x93

    const/16 v9, 0x92

    if-eq v8, v9, :cond_8

    const/4 v8, 0x1

    goto :goto_6

    :cond_8
    const/4 v8, 0x0

    :goto_6
    and-int/lit8 v9, v2, 0x1

    invoke-virtual {v0, v9, v8}, Lp1/q;->U(IZ)Z

    move-result v8

    if-eqz v8, :cond_13

    sget-object v8, Lp1/l;->a:Lp1/v0;

    if-eqz v3, :cond_a

    invoke-virtual {v0}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    if-ne v3, v8, :cond_9

    new-instance v3, Lfw0/a;

    const/16 v5, 0x13

    invoke-direct {v3, v5}, Lfw0/a;-><init>(I)V

    invoke-virtual {v0, v3}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_9
    check-cast v3, Lc93/a;

    move-object v9, v3

    goto :goto_7

    :cond_a
    move-object v9, v5

    :goto_7
    if-eqz v6, :cond_c

    invoke-virtual {v0}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    if-ne v3, v8, :cond_b

    new-instance v3, Lfw0/a;

    const/16 v5, 0x14

    invoke-direct {v3, v5}, Lfw0/a;-><init>(I)V

    invoke-virtual {v0, v3}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_b
    check-cast v3, Lc93/a;

    move-object v13, v3

    goto :goto_8

    :cond_c
    move-object v13, v7

    :goto_8
    sget-object v3, Le32/a$b;->a:Le32/a$b;

    invoke-virtual {v1, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_d

    new-instance v3, Lsz0/p0$d;

    sget v5, Lp22/b;->m:I

    invoke-static {v5}, Lcom/whoop/design/util/b;->k(I)Lcom/whoop/design/util/TextResource$b;

    move-result-object v5

    invoke-direct {v3, v5}, Lsz0/p0$d;-><init>(Lcom/whoop/design/util/TextResource;)V

    move-object v5, v3

    goto :goto_9

    :cond_d
    sget-object v3, Le32/a$a;->a:Le32/a$a;

    invoke-virtual {v1, v3}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_11

    new-instance v14, Lsz0/p0$b;

    sget v3, Lp22/b;->l:I

    invoke-static {v3}, Lcom/whoop/design/util/b;->k(I)Lcom/whoop/design/util/TextResource$b;

    move-result-object v15

    const/16 v18, 0x6

    const/16 v19, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    invoke-direct/range {v14 .. v19}, Lsz0/p0$b;-><init>(Lcom/whoop/design/util/TextResource;ZLkd1/o;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object v5, v14

    :goto_9
    instance-of v10, v5, Lsz0/p0$b;

    if-eqz v10, :cond_e

    sget v3, Lp22/b;->k:I

    invoke-static {v3}, Lcom/whoop/design/util/b;->k(I)Lcom/whoop/design/util/TextResource$b;

    move-result-object v3

    :goto_a
    move-object v6, v3

    goto :goto_b

    :cond_e
    invoke-static {}, Lcom/whoop/design/util/b;->a()Lcom/whoop/design/util/TextResource;

    move-result-object v3

    goto :goto_a

    :goto_b
    if-eqz v10, :cond_f

    sget v3, Lp22/b;->o:I

    invoke-static {v3}, Lcom/whoop/design/util/b;->k(I)Lcom/whoop/design/util/TextResource$b;

    move-result-object v3

    :goto_c
    move-object v8, v3

    goto :goto_d

    :cond_f
    invoke-static {}, Lcom/whoop/design/util/b;->a()Lcom/whoop/design/util/TextResource;

    move-result-object v3

    goto :goto_c

    :goto_d
    if-eqz v10, :cond_10

    sget v3, Lgy0/f;->b0:I

    invoke-static {v3}, Lcom/whoop/design/util/b;->k(I)Lcom/whoop/design/util/TextResource$b;

    move-result-object v3

    :goto_e
    move-object v12, v3

    goto :goto_f

    :cond_10
    invoke-static {}, Lcom/whoop/design/util/b;->a()Lcom/whoop/design/util/TextResource;

    move-result-object v3

    goto :goto_e

    :goto_f
    sget v3, Lsz0/p0;->d:I

    sget v7, Lcom/whoop/design/util/TextResource;->$stable:I

    shl-int/lit8 v11, v7, 0x3

    or-int/2addr v3, v11

    shl-int/lit8 v11, v7, 0x9

    or-int/2addr v3, v11

    const v11, 0xe000

    shl-int/lit8 v14, v2, 0x9

    and-int/2addr v11, v14

    or-int/2addr v3, v11

    shl-int/lit8 v7, v7, 0x15

    or-int/2addr v3, v7

    shl-int/lit8 v2, v2, 0x12

    const/high16 v7, 0xe000000

    and-int/2addr v2, v7

    or-int v18, v3, v2

    const/16 v19, 0x30

    const/16 v20, 0x644

    const/4 v7, 0x0

    const/4 v11, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x1

    move-object/from16 v17, v0

    invoke-static/range {v5 .. v20}, Lsz0/m0;->F(Lsz0/p0;Lcom/whoop/design/util/TextResource;Lc93/a;Lcom/whoop/design/util/TextResource;Lc93/a;ZZLcom/whoop/design/util/TextResource;Lc93/a;Landroidx/compose/ui/Modifier;ZZLandroidx/compose/runtime/Composer;III)V

    move-object v2, v9

    move-object v3, v13

    goto :goto_11

    :cond_11
    move-object/from16 v17, v0

    move-object v2, v9

    sget-object v0, Le32/a$c;->a:Le32/a$c;

    invoke-virtual {v1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_12

    invoke-virtual/range {v17 .. v17}, Lp1/q;->u()Lp1/v1;

    move-result-object v7

    if-eqz v7, :cond_14

    new-instance v0, Lg32/i;

    const/4 v6, 0x0

    move/from16 v5, p5

    move-object v3, v13

    invoke-direct/range {v0 .. v6}, Lg32/i;-><init>(Le32/a;Lc93/a;Lc93/a;III)V

    :goto_10
    iput-object v0, v7, Lp1/v1;->d:Lc93/m;

    return-void

    :cond_12
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0

    :cond_13
    move-object/from16 v17, v0

    invoke-virtual/range {v17 .. v17}, Lp1/q;->X()V

    move-object v2, v5

    move-object v3, v7

    :goto_11
    invoke-virtual/range {v17 .. v17}, Lp1/q;->u()Lp1/v1;

    move-result-object v7

    if-eqz v7, :cond_14

    new-instance v0, Lg32/i;

    const/4 v6, 0x1

    move-object/from16 v1, p0

    move/from16 v4, p4

    move/from16 v5, p5

    invoke-direct/range {v0 .. v6}, Lg32/i;-><init>(Le32/a;Lc93/a;Lc93/a;III)V

    goto :goto_10

    :cond_14
    return-void
.end method

.method private static final z()Ll83/a0;
    .locals 1

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method
