.class public abstract Lb03/d;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u001a/\u0010\u0006\u001a\u00020\u00042\u0008\u0008\u0002\u0010\u0001\u001a\u00020\u00002\u0014\u0008\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0001\u00a2\u0006\u0004\u0008\u0006\u0010\u0007\u00a8\u0006\n\u00b2\u0006\u000c\u0010\t\u001a\u00020\u00088\nX\u008a\u0084\u0002"
    }
    d2 = {
        "Landroidx/compose/ui/Modifier;",
        "modifier",
        "Lkotlin/Function1;",
        "",
        "Ll83/a0;",
        "onViewEvent",
        "e",
        "(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V",
        "Lc03/c;",
        "viewState",
        "whoop-status_release"
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

    invoke-static {p0}, Lb03/d;->f(Ljava/lang/Object;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Landroidx/compose/ui/Modifier;Lc41/m0;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/Modifier;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lb03/d;->h(Landroidx/compose/ui/Modifier;Lc41/m0;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/Modifier;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Lkotlin/jvm/functions/Function1;Lld1/c;Ljava/lang/Object;)Ll83/a0;
    .locals 0

    invoke-static {p1, p0, p2}, Lb03/d;->i(Lld1/c;Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p5}, Lb03/d;->j(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final e(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V
    .locals 22
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/ui/Modifier;",
            "Lkotlin/jvm/functions/Function1;",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    move-object/from16 v3, p2

    check-cast v3, Lp1/q;

    const v0, 0x21e05741

    invoke-virtual {v3, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, p4, 0x1

    const/4 v1, 0x4

    if-eqz v0, :cond_0

    or-int/lit8 v2, p3, 0x6

    move v4, v2

    move-object/from16 v2, p0

    goto :goto_1

    :cond_0
    and-int/lit8 v2, p3, 0x6

    if-nez v2, :cond_2

    move-object/from16 v2, p0

    invoke-virtual {v3, v2}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_1

    move v4, v1

    goto :goto_0

    :cond_1
    const/4 v4, 0x2

    :goto_0
    or-int v4, p3, v4

    goto :goto_1

    :cond_2
    move-object/from16 v2, p0

    move/from16 v4, p3

    :goto_1
    and-int/lit8 v5, p4, 0x2

    const/16 v6, 0x20

    if-eqz v5, :cond_4

    or-int/lit8 v4, v4, 0x30

    :cond_3
    move-object/from16 v7, p1

    :goto_2
    move v8, v4

    goto :goto_4

    :cond_4
    and-int/lit8 v7, p3, 0x30

    if-nez v7, :cond_3

    move-object/from16 v7, p1

    invoke-virtual {v3, v7}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_5

    move v8, v6

    goto :goto_3

    :cond_5
    const/16 v8, 0x10

    :goto_3
    or-int/2addr v4, v8

    goto :goto_2

    :goto_4
    and-int/lit8 v4, v8, 0x13

    const/16 v9, 0x12

    const/4 v10, 0x0

    if-eq v4, v9, :cond_6

    const/4 v4, 0x1

    goto :goto_5

    :cond_6
    move v4, v10

    :goto_5
    and-int/lit8 v9, v8, 0x1

    invoke-virtual {v3, v9, v4}, Lp1/q;->U(IZ)Z

    move-result v4

    if-eqz v4, :cond_38

    if-eqz v0, :cond_7

    sget-object v0, Lb2/t;->w:Lb2/t;

    move-object v9, v0

    goto :goto_6

    :cond_7
    move-object v9, v2

    :goto_6
    sget-object v12, Lp1/l;->a:Lp1/v0;

    if-eqz v5, :cond_9

    invoke-virtual {v3}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v12, :cond_8

    new-instance v0, Lb01/f;

    const/16 v2, 0xb

    invoke-direct {v0, v2}, Lb01/f;-><init>(I)V

    invoke-virtual {v3, v0}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_8
    check-cast v0, Lkotlin/jvm/functions/Function1;

    move-object v7, v0

    :cond_9
    new-instance v13, Lc03/c;

    const/16 v17, 0x7

    const/16 v18, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    invoke-direct/range {v13 .. v18}, Lc03/c;-><init>(ZLc41/m0;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sget-object v0, Landroidx/compose/ui/platform/AndroidCompositionLocals_androidKt;->b:Lp1/u2;

    invoke-virtual {v3, v0}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/content/Context;

    invoke-virtual {v2}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v2

    instance-of v2, v2, Landroid/app/Application;

    if-eqz v2, :cond_2f

    const v2, 0x2b27ad93

    invoke-virtual {v3, v2}, Lp1/q;->e0(I)V

    sget v2, Lc41/m0;->h:I

    const v5, 0x51c1188b

    invoke-virtual {v3, v5}, Lp1/q;->e0(I)V

    sget-object v5, Lx81/d;->a:Lx81/d;

    const/4 v14, 0x6

    invoke-virtual {v5, v3, v14}, Lx81/d;->c(Landroidx/compose/runtime/Composer;I)Lcom/whoop/data/repositories/FeatureFlagChecker;

    move-result-object v5

    const-string v15, "safe-design-view-model-injection-android"

    invoke-interface {v5, v15}, Lcom/whoop/data/repositories/FeatureFlagChecker;->isFeatureEnabled(Ljava/lang/String;)Z

    move-result v5

    const-class v15, Lb03/f;

    const/16 v4, 0x800

    const/4 v11, 0x0

    move/from16 p1, v14

    const/4 v14, 0x0

    if-nez v5, :cond_22

    const v5, -0x2a32dbfc

    invoke-virtual {v3, v5}, Lp1/q;->e0(I)V

    invoke-static {v3}, Lm8/a;->a(Landroidx/compose/runtime/Composer;)Landroidx/lifecycle/f2;

    move-result-object v17

    if-nez v17, :cond_a

    const v0, -0x2a322beb

    invoke-virtual {v3, v0}, Lp1/q;->e0(I)V

    invoke-virtual {v3, v10}, Lp1/q;->q(Z)V

    const/4 v5, 0x0

    goto/16 :goto_a

    :cond_a
    const v5, -0x2a322bea

    invoke-virtual {v3, v5}, Lp1/q;->e0(I)V

    invoke-virtual {v3, v0}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    const-string v5, "null cannot be cast to non-null type android.app.Application"

    invoke-static {v0, v5}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v16, v0

    check-cast v16, Landroid/app/Application;

    and-int/lit8 v0, v2, 0x70

    xor-int/lit8 v0, v0, 0x30

    if-le v0, v6, :cond_b

    invoke-virtual {v3, v11}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_c

    :cond_b
    and-int/lit8 v0, v2, 0x30

    if-ne v0, v6, :cond_d

    :cond_c
    const/4 v0, 0x1

    goto :goto_7

    :cond_d
    move v0, v10

    :goto_7
    and-int/lit8 v5, v2, 0xe

    xor-int/lit8 v5, v5, 0x6

    if-le v5, v1, :cond_e

    invoke-virtual {v3, v13}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_f

    :cond_e
    and-int/lit8 v5, v2, 0x6

    if-ne v5, v1, :cond_10

    :cond_f
    const/4 v5, 0x1

    goto :goto_8

    :cond_10
    move v5, v10

    :goto_8
    or-int/2addr v0, v5

    and-int/lit16 v5, v2, 0x1c00

    xor-int/lit16 v5, v5, 0xc00

    if-le v5, v4, :cond_11

    invoke-virtual {v3, v14}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_12

    :cond_11
    and-int/lit16 v5, v2, 0xc00

    if-ne v5, v4, :cond_13

    :cond_12
    const/4 v5, 0x1

    goto :goto_9

    :cond_13
    move v5, v10

    :goto_9
    or-int/2addr v0, v5

    invoke-virtual {v3}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    if-nez v0, :cond_14

    if-ne v5, v12, :cond_15

    :cond_14
    sget-object v0, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v0, v15}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v18

    new-instance v0, Lld1/b;

    invoke-direct {v0, v13}, Lld1/b;-><init>(Ljava/lang/Object;)V

    move-object/from16 v20, v0

    move-object/from16 v21, v11

    move-object/from16 v19, v14

    invoke-static/range {v16 .. v21}, Lld1/d;->b(Landroid/app/Application;Landroidx/lifecycle/f2;Lj93/d;Lc93/a;Lld1/c;Ljava/lang/String;)Lld1/c;

    move-result-object v5

    invoke-virtual {v3, v5}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_15
    check-cast v5, Lld1/c;

    invoke-virtual {v3, v10}, Lp1/q;->q(Z)V

    :goto_a
    if-nez v5, :cond_21

    const v0, -0x2a2a887e

    invoke-virtual {v3, v0}, Lp1/q;->e0(I)V

    and-int/lit8 v0, v2, 0x70

    xor-int/lit8 v0, v0, 0x30

    if-le v0, v6, :cond_16

    invoke-virtual {v3, v11}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_17

    :cond_16
    and-int/lit8 v0, v2, 0x30

    if-ne v0, v6, :cond_18

    :cond_17
    const/4 v0, 0x1

    goto :goto_b

    :cond_18
    move v0, v10

    :goto_b
    and-int/lit8 v5, v2, 0xe

    xor-int/lit8 v5, v5, 0x6

    if-le v5, v1, :cond_19

    invoke-virtual {v3, v13}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_1a

    :cond_19
    and-int/lit8 v5, v2, 0x6

    if-ne v5, v1, :cond_1b

    :cond_1a
    const/4 v1, 0x1

    goto :goto_c

    :cond_1b
    move v1, v10

    :goto_c
    or-int/2addr v0, v1

    and-int/lit16 v1, v2, 0x1c00

    xor-int/lit16 v1, v1, 0xc00

    if-le v1, v4, :cond_1c

    invoke-virtual {v3, v14}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1d

    :cond_1c
    and-int/lit16 v1, v2, 0xc00

    if-ne v1, v4, :cond_1e

    :cond_1d
    const/4 v1, 0x1

    goto :goto_d

    :cond_1e
    move v1, v10

    :goto_d
    or-int/2addr v0, v1

    invoke-virtual {v3}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    if-nez v0, :cond_1f

    if-ne v1, v12, :cond_20

    :cond_1f
    new-instance v1, Lld1/b;

    invoke-direct {v1, v13}, Lld1/b;-><init>(Ljava/lang/Object;)V

    invoke-virtual {v3, v1}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_20
    move-object v5, v1

    check-cast v5, Lld1/b;

    invoke-virtual {v3, v10}, Lp1/q;->q(Z)V

    goto :goto_e

    :cond_21
    const v0, -0x1a22aa39

    invoke-virtual {v3, v0}, Lp1/q;->e0(I)V

    invoke-virtual {v3, v10}, Lp1/q;->q(Z)V

    :goto_e
    invoke-virtual {v3, v10}, Lp1/q;->q(Z)V

    invoke-virtual {v3, v10}, Lp1/q;->q(Z)V

    move v0, v10

    goto/16 :goto_13

    :cond_22
    const v5, -0x2a28ba09

    invoke-static {v3, v5, v10, v3}, Ld;->f(Lp1/q;IZLp1/q;)Landroidx/lifecycle/f2;

    move-result-object v5

    invoke-virtual {v3, v0}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Landroid/content/Context;

    invoke-virtual {v0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v0

    instance-of v10, v0, Landroid/app/Application;

    if-eqz v10, :cond_23

    check-cast v0, Landroid/app/Application;

    goto :goto_f

    :cond_23
    const/4 v0, 0x0

    :goto_f
    and-int/lit8 v10, v2, 0x70

    xor-int/lit8 v10, v10, 0x30

    if-le v10, v6, :cond_24

    invoke-virtual {v3, v11}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v10

    if-nez v10, :cond_25

    :cond_24
    and-int/lit8 v10, v2, 0x30

    if-ne v10, v6, :cond_26

    :cond_25
    const/4 v10, 0x1

    goto :goto_10

    :cond_26
    const/4 v10, 0x0

    :goto_10
    and-int/lit8 v16, v2, 0xe

    xor-int/lit8 v11, v16, 0x6

    if-le v11, v1, :cond_27

    invoke-virtual {v3, v13}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v11

    if-nez v11, :cond_28

    :cond_27
    and-int/lit8 v11, v2, 0x6

    if-ne v11, v1, :cond_29

    :cond_28
    const/4 v1, 0x1

    goto :goto_11

    :cond_29
    const/4 v1, 0x0

    :goto_11
    or-int/2addr v1, v10

    and-int/lit16 v10, v2, 0x1c00

    xor-int/lit16 v10, v10, 0xc00

    if-le v10, v4, :cond_2a

    invoke-virtual {v3, v14}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v10

    if-nez v10, :cond_2b

    :cond_2a
    and-int/lit16 v2, v2, 0xc00

    if-ne v2, v4, :cond_2c

    :cond_2b
    const/4 v2, 0x1

    goto :goto_12

    :cond_2c
    const/4 v2, 0x0

    :goto_12
    or-int/2addr v1, v2

    invoke-virtual {v3}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    if-nez v1, :cond_2d

    if-ne v2, v12, :cond_2e

    :cond_2d
    sget-object v1, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v1, v15}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v16

    move-object v15, v0

    move-object/from16 v17, v14

    const/16 v18, 0x0

    move-object v14, v13

    move-object v13, v5

    invoke-static/range {v13 .. v18}, Lld1/d;->d(Landroidx/lifecycle/f2;Ljava/lang/Object;Landroid/app/Application;Lj93/d;Lc93/a;Ljava/lang/String;)Lld1/c;

    move-result-object v2

    move-object v13, v14

    invoke-virtual {v3, v2}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_2e
    move-object v5, v2

    check-cast v5, Lld1/c;

    const/4 v0, 0x0

    invoke-virtual {v3, v0}, Lp1/q;->q(Z)V

    :goto_13
    invoke-virtual {v3, v0}, Lp1/q;->q(Z)V

    :goto_14
    move-object v10, v5

    goto :goto_15

    :cond_2f
    const v0, 0x39d07379

    invoke-virtual {v3, v0}, Lp1/q;->e0(I)V

    invoke-virtual {v3, v13}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v0

    invoke-virtual {v3}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    if-nez v0, :cond_30

    if-ne v1, v12, :cond_31

    :cond_30
    new-instance v1, Lld1/b;

    invoke-direct {v1, v13}, Lld1/b;-><init>(Ljava/lang/Object;)V

    invoke-virtual {v3, v1}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_31
    move-object v5, v1

    check-cast v5, Lld1/b;

    const/4 v0, 0x0

    invoke-virtual {v3, v0}, Lp1/q;->q(Z)V

    goto :goto_14

    :goto_15
    invoke-virtual {v10}, Lld1/c;->getViewState()Lec3/l;

    move-result-object v0

    sget v11, Lc41/m0;->h:I

    shl-int/lit8 v4, v11, 0x3

    const/4 v5, 0x2

    const/4 v2, 0x0

    move-object v1, v13

    const/4 v13, 0x0

    invoke-static/range {v0 .. v5}, Lp1/x;->n(Lec3/l;Ljava/lang/Object;Lq83/j;Landroidx/compose/runtime/Composer;II)Lp1/c1;

    move-result-object v0

    invoke-virtual {v3, v10}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v1

    invoke-virtual {v3}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    if-nez v1, :cond_32

    if-ne v2, v12, :cond_33

    :cond_32
    new-instance v2, Lb03/d$a;

    invoke-direct {v2, v10, v13}, Lb03/d$a;-><init>(Lld1/c;Lq83/d;)V

    invoke-virtual {v3, v2}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_33
    check-cast v2, Lc93/m;

    sget-object v1, Ll83/a0;->a:Ll83/a0;

    invoke-static {v3, v2, v1}, Lp1/x;->g(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v0}, Lb03/d;->g(Lp1/t2;)Lc03/c;

    move-result-object v1

    invoke-virtual {v1}, Lc03/c;->a()Lc41/m0;

    move-result-object v1

    invoke-static {v0}, Lb03/d;->g(Lp1/t2;)Lc03/c;

    move-result-object v0

    invoke-virtual {v0}, Lc03/c;->b()Z

    move-result v0

    if-eqz v0, :cond_37

    if-eqz v1, :cond_37

    const v0, 0x39d6604b

    invoke-virtual {v3, v0}, Lp1/q;->e0(I)V

    new-instance v2, Law0/a;

    const/4 v0, 0x1

    invoke-direct {v2, v0, v9}, Law0/a;-><init>(ILandroidx/compose/ui/Modifier;)V

    invoke-virtual {v3, v10}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v0

    and-int/lit8 v4, v8, 0x70

    if-ne v4, v6, :cond_34

    const/4 v4, 0x1

    goto :goto_16

    :cond_34
    const/4 v4, 0x0

    :goto_16
    or-int/2addr v0, v4

    invoke-virtual {v3}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    if-nez v0, :cond_35

    if-ne v4, v12, :cond_36

    :cond_35
    new-instance v4, Lb03/b;

    const/4 v0, 0x0

    invoke-direct {v4, v10, v7, v0}, Lb03/b;-><init>(Lld1/c;Lkotlin/jvm/functions/Function1;I)V

    invoke-virtual {v3, v4}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_36
    check-cast v4, Lkotlin/jvm/functions/Function1;

    const/4 v6, 0x2

    move-object v0, v1

    const/4 v1, 0x0

    move-object v5, v4

    move-object v4, v3

    move-object v3, v5

    move v5, v11

    invoke-static/range {v0 .. v6}, Lm91/l;->r(Lm91/u;Lm91/p;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    move-object v3, v4

    const/4 v0, 0x0

    invoke-virtual {v3, v0}, Lp1/q;->q(Z)V

    goto :goto_17

    :cond_37
    const/4 v0, 0x0

    const v1, 0x39da8b21

    invoke-virtual {v3, v1}, Lp1/q;->e0(I)V

    invoke-virtual {v3, v0}, Lp1/q;->q(Z)V

    :goto_17
    move-object v11, v9

    :goto_18
    move-object v12, v7

    goto :goto_19

    :cond_38
    invoke-virtual {v3}, Lp1/q;->X()V

    move-object v11, v2

    goto :goto_18

    :goto_19
    invoke-virtual {v3}, Lp1/q;->u()Lp1/v1;

    move-result-object v0

    if-eqz v0, :cond_39

    new-instance v10, Lb03/c;

    const/4 v15, 0x0

    move/from16 v13, p3

    move/from16 v14, p4

    invoke-direct/range {v10 .. v15}, Lb03/c;-><init>(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;III)V

    iput-object v10, v0, Lp1/v1;->d:Lc93/m;

    :cond_39
    return-void
.end method

.method private static final f(Ljava/lang/Object;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final g(Lp1/t2;)Lc03/c;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp1/t2;",
            ")",
            "Lc03/c;"
        }
    .end annotation

    invoke-interface {p0}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lc03/c;

    return-object p0
.end method

.method private static final h(Landroidx/compose/ui/Modifier;Lc41/m0;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/Modifier;
    .locals 0

    const-string p3, "it"

    invoke-static {p1, p3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p2, Lp1/q;

    const p1, 0x4e687e3a    # 9.751466E8f

    invoke-virtual {p2, p1}, Lp1/q;->e0(I)V

    const/4 p1, 0x0

    invoke-virtual {p2, p1}, Lp1/q;->q(Z)V

    return-object p0
.end method

.method private static final i(Lld1/c;Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Ll83/a0;
    .locals 2

    const-string v0, "event"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lb03/e$a;

    const-string v1, "arch_mini"

    invoke-direct {v0, v1}, Lb03/e$a;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0, v0}, Lld1/c;->g(Ljava/lang/Object;)V

    invoke-interface {p1, p2}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final j(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, Lp1/x;->L(I)I

    move-result p2

    invoke-static {p0, p1, p4, p2, p3}, Lb03/d;->e(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method
