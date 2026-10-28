.class public abstract Lzl0/j;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u001a5\u0010\u0008\u001a\u00020\u00062\u0008\u0008\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0001\u00a2\u0006\u0004\u0008\u0008\u0010\t\u001a;\u0010\u000e\u001a\u00020\u00062\u0008\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u000c\u0010\r\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u000cH\u0000\u00a2\u0006\u0004\u0008\u000e\u0010\u000f\u00a8\u0006\u0012\u00b2\u0006\u000c\u0010\u0011\u001a\u00020\u00108\nX\u008a\u0084\u0002"
    }
    d2 = {
        "Landroidx/compose/ui/Modifier;",
        "modifier",
        "Lr31/f;",
        "viewState",
        "Lkotlin/Function1;",
        "",
        "Ll83/a0;",
        "onViewEvent",
        "d",
        "(Landroidx/compose/ui/Modifier;Lr31/f;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V",
        "",
        "message",
        "Lkotlin/Function0;",
        "clearFollowup",
        "j",
        "(Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lc93/a;)V",
        "Lzl0/k;",
        "wrapperState",
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
.method public static synthetic a(Landroidx/compose/ui/Modifier;Lr31/f;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p6}, Lzl0/j;->h(Landroidx/compose/ui/Modifier;Lr31/f;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lr31/f;Ljava/lang/String;)Luf3/a;
    .locals 0

    invoke-static {p0, p1}, Lzl0/j;->e(Lr31/f;Ljava/lang/String;)Luf3/a;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Lkotlin/jvm/functions/Function1;Lld1/c;Ljava/lang/Object;)Ll83/a0;
    .locals 0

    invoke-static {p1, p0, p2}, Lzl0/j;->g(Lld1/c;Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final d(Landroidx/compose/ui/Modifier;Lr31/f;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V
    .locals 23
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/ui/Modifier;",
            "Lr31/f;",
            "Lkotlin/jvm/functions/Function1;",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move/from16 v4, p4

    const-string v0, "viewState"

    invoke-static {v2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onViewEvent"

    invoke-static {v3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v8, p3

    check-cast v8, Lp1/q;

    const v0, 0x13e6fc8b

    invoke-virtual {v8, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, p5, 0x1

    const/4 v1, 0x2

    if-eqz v0, :cond_0

    or-int/lit8 v6, v4, 0x6

    move v7, v6

    move-object/from16 v6, p0

    goto :goto_1

    :cond_0
    and-int/lit8 v6, v4, 0x6

    if-nez v6, :cond_2

    move-object/from16 v6, p0

    invoke-virtual {v8, v6}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_1

    const/4 v7, 0x4

    goto :goto_0

    :cond_1
    move v7, v1

    :goto_0
    or-int/2addr v7, v4

    goto :goto_1

    :cond_2
    move-object/from16 v6, p0

    move v7, v4

    :goto_1
    and-int/lit8 v9, v4, 0x30

    const/16 v10, 0x20

    if-nez v9, :cond_5

    and-int/lit8 v9, v4, 0x40

    if-nez v9, :cond_3

    invoke-virtual {v8, v2}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v9

    goto :goto_2

    :cond_3
    invoke-virtual {v8, v2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v9

    :goto_2
    if-eqz v9, :cond_4

    move v9, v10

    goto :goto_3

    :cond_4
    const/16 v9, 0x10

    :goto_3
    or-int/2addr v7, v9

    :cond_5
    and-int/lit16 v9, v4, 0x180

    if-nez v9, :cond_7

    invoke-virtual {v8, v3}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_6

    const/16 v9, 0x100

    goto :goto_4

    :cond_6
    const/16 v9, 0x80

    :goto_4
    or-int/2addr v7, v9

    :cond_7
    move v12, v7

    and-int/lit16 v7, v12, 0x93

    const/16 v9, 0x92

    const/4 v13, 0x0

    if-eq v7, v9, :cond_8

    const/4 v7, 0x1

    goto :goto_5

    :cond_8
    move v7, v13

    :goto_5
    and-int/lit8 v9, v12, 0x1

    invoke-virtual {v8, v9, v7}, Lp1/q;->U(IZ)Z

    move-result v7

    if-eqz v7, :cond_3c

    if-eqz v0, :cond_9

    sget-object v0, Lb2/t;->w:Lb2/t;

    goto :goto_6

    :cond_9
    move-object v0, v6

    :goto_6
    invoke-virtual {v2}, Lr31/f;->e()Lm91/u;

    move-result-object v6

    instance-of v7, v6, Ll11/e;

    const/4 v15, 0x0

    if-eqz v7, :cond_a

    check-cast v6, Ll11/e;

    goto :goto_7

    :cond_a
    move-object v6, v15

    :goto_7
    if-eqz v6, :cond_b

    invoke-virtual {v6}, Ll11/e;->h()Ljava/lang/String;

    move-result-object v6

    goto :goto_8

    :cond_b
    move-object v6, v15

    :goto_8
    if-nez v6, :cond_c

    const-string v6, ""

    :cond_c
    new-instance v7, Lzl0/k;

    invoke-direct {v7, v2, v15, v1, v15}, Lzl0/k;-><init>(Lr31/f;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {v2}, Lr31/f;->getId()Ljava/lang/String;

    move-result-object v1

    and-int/lit8 v9, v12, 0x70

    if-eq v9, v10, :cond_e

    and-int/lit8 v9, v12, 0x40

    if-eqz v9, :cond_d

    invoke-virtual {v8, v2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_d

    goto :goto_9

    :cond_d
    move v9, v13

    goto :goto_a

    :cond_e
    :goto_9
    const/4 v9, 0x1

    :goto_a
    invoke-virtual {v8, v6}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v16

    or-int v9, v9, v16

    invoke-virtual {v8}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v14

    sget-object v15, Lp1/l;->a:Lp1/v0;

    if-nez v9, :cond_f

    if-ne v14, v15, :cond_10

    :cond_f
    new-instance v14, Lyo1/b;

    const/16 v9, 0x14

    invoke-direct {v14, v9, v2, v6}, Lyo1/b;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v8, v14}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_10
    check-cast v14, Lc93/a;

    sget v6, Lr31/f;->h:I

    const v9, 0x51c1188b

    invoke-virtual {v8, v9}, Lp1/q;->e0(I)V

    sget-object v9, Lx81/d;->a:Lx81/d;

    const/4 v11, 0x6

    invoke-virtual {v9, v8, v11}, Lx81/d;->c(Landroidx/compose/runtime/Composer;I)Lcom/whoop/data/repositories/FeatureFlagChecker;

    move-result-object v9

    move/from16 v22, v11

    const-string v11, "safe-design-view-model-injection-android"

    invoke-interface {v9, v11}, Lcom/whoop/data/repositories/FeatureFlagChecker;->isFeatureEnabled(Ljava/lang/String;)Z

    move-result v9

    const-class v11, Lzl0/e;

    const/16 v5, 0x800

    if-nez v9, :cond_29

    const v9, -0x2a32dbfc

    invoke-virtual {v8, v9}, Lp1/q;->e0(I)V

    invoke-static {v8}, Lm8/a;->a(Landroidx/compose/runtime/Composer;)Landroidx/lifecycle/f2;

    move-result-object v17

    if-nez v17, :cond_11

    const v9, -0x2a322beb

    invoke-virtual {v8, v9}, Lp1/q;->e0(I)V

    invoke-virtual {v8, v13}, Lp1/q;->q(Z)V

    const/4 v10, 0x0

    goto/16 :goto_e

    :cond_11
    const v9, -0x2a322bea

    invoke-virtual {v8, v9}, Lp1/q;->e0(I)V

    sget-object v9, Landroidx/compose/ui/platform/AndroidCompositionLocals_androidKt;->b:Lp1/u2;

    invoke-virtual {v8, v9}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Landroid/content/Context;

    invoke-virtual {v9}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v9

    const-string v13, "null cannot be cast to non-null type android.app.Application"

    invoke-static {v9, v13}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v16, v9

    check-cast v16, Landroid/app/Application;

    and-int/lit8 v9, v6, 0x70

    xor-int/lit8 v9, v9, 0x30

    if-le v9, v10, :cond_12

    invoke-virtual {v8, v1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v9

    if-nez v9, :cond_13

    :cond_12
    and-int/lit8 v9, v6, 0x30

    if-ne v9, v10, :cond_14

    :cond_13
    const/4 v9, 0x1

    goto :goto_b

    :cond_14
    const/4 v9, 0x0

    :goto_b
    and-int/lit8 v13, v6, 0xe

    xor-int/lit8 v13, v13, 0x6

    const/4 v10, 0x4

    if-le v13, v10, :cond_15

    invoke-virtual {v8, v7}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v13

    if-nez v13, :cond_16

    :cond_15
    and-int/lit8 v13, v6, 0x6

    if-ne v13, v10, :cond_17

    :cond_16
    const/4 v10, 0x1

    goto :goto_c

    :cond_17
    const/4 v10, 0x0

    :goto_c
    or-int/2addr v9, v10

    and-int/lit16 v10, v6, 0x1c00

    xor-int/lit16 v10, v10, 0xc00

    if-le v10, v5, :cond_18

    invoke-virtual {v8, v14}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v10

    if-nez v10, :cond_19

    :cond_18
    and-int/lit16 v10, v6, 0xc00

    if-ne v10, v5, :cond_1a

    :cond_19
    const/4 v10, 0x1

    goto :goto_d

    :cond_1a
    const/4 v10, 0x0

    :goto_d
    or-int/2addr v9, v10

    invoke-virtual {v8}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v10

    if-nez v9, :cond_1b

    if-ne v10, v15, :cond_1c

    :cond_1b
    sget-object v9, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v9, v11}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v18

    new-instance v9, Lld1/b;

    invoke-direct {v9, v7}, Lld1/b;-><init>(Ljava/lang/Object;)V

    move-object/from16 v21, v1

    move-object/from16 v20, v9

    move-object/from16 v19, v14

    invoke-static/range {v16 .. v21}, Lld1/d;->b(Landroid/app/Application;Landroidx/lifecycle/f2;Lj93/d;Lc93/a;Lld1/c;Ljava/lang/String;)Lld1/c;

    move-result-object v10

    invoke-virtual {v8, v10}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_1c
    check-cast v10, Lld1/c;

    const/4 v9, 0x0

    invoke-virtual {v8, v9}, Lp1/q;->q(Z)V

    :goto_e
    if-nez v10, :cond_28

    const v9, -0x2a2a887e

    invoke-virtual {v8, v9}, Lp1/q;->e0(I)V

    and-int/lit8 v9, v6, 0x70

    xor-int/lit8 v9, v9, 0x30

    const/16 v10, 0x20

    if-le v9, v10, :cond_1d

    invoke-virtual {v8, v1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1e

    :cond_1d
    and-int/lit8 v1, v6, 0x30

    if-ne v1, v10, :cond_1f

    :cond_1e
    const/4 v1, 0x1

    goto :goto_f

    :cond_1f
    const/4 v1, 0x0

    :goto_f
    and-int/lit8 v9, v6, 0xe

    xor-int/lit8 v9, v9, 0x6

    const/4 v10, 0x4

    if-le v9, v10, :cond_20

    invoke-virtual {v8, v7}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v9

    if-nez v9, :cond_21

    :cond_20
    and-int/lit8 v9, v6, 0x6

    if-ne v9, v10, :cond_22

    :cond_21
    const/4 v9, 0x1

    goto :goto_10

    :cond_22
    const/4 v9, 0x0

    :goto_10
    or-int/2addr v1, v9

    and-int/lit16 v9, v6, 0x1c00

    xor-int/lit16 v9, v9, 0xc00

    if-le v9, v5, :cond_23

    invoke-virtual {v8, v14}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v9

    if-nez v9, :cond_24

    :cond_23
    and-int/lit16 v9, v6, 0xc00

    if-ne v9, v5, :cond_25

    :cond_24
    const/4 v5, 0x1

    goto :goto_11

    :cond_25
    const/4 v5, 0x0

    :goto_11
    or-int/2addr v1, v5

    invoke-virtual {v8}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    if-nez v1, :cond_26

    if-ne v5, v15, :cond_27

    :cond_26
    new-instance v5, Lld1/b;

    invoke-direct {v5, v7}, Lld1/b;-><init>(Ljava/lang/Object;)V

    invoke-virtual {v8, v5}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_27
    move-object v10, v5

    check-cast v10, Lld1/b;

    const/4 v9, 0x0

    invoke-virtual {v8, v9}, Lp1/q;->q(Z)V

    goto :goto_12

    :cond_28
    const/4 v9, 0x0

    const v1, -0x1a22aa39

    invoke-virtual {v8, v1}, Lp1/q;->e0(I)V

    invoke-virtual {v8, v9}, Lp1/q;->q(Z)V

    :goto_12
    invoke-virtual {v8, v9}, Lp1/q;->q(Z)V

    invoke-virtual {v8, v9}, Lp1/q;->q(Z)V

    move-object/from16 v17, v7

    move v1, v9

    :goto_13
    move-object v11, v10

    goto/16 :goto_1a

    :cond_29
    move v9, v13

    const v10, -0x2a28ba09

    invoke-static {v8, v10, v9, v8}, Ld;->f(Lp1/q;IZLp1/q;)Landroidx/lifecycle/f2;

    move-result-object v16

    sget-object v9, Landroidx/compose/ui/platform/AndroidCompositionLocals_androidKt;->b:Lp1/u2;

    invoke-virtual {v8, v9}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Landroid/content/Context;

    invoke-virtual {v9}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v9

    instance-of v10, v9, Landroid/app/Application;

    if-eqz v10, :cond_2a

    check-cast v9, Landroid/app/Application;

    move-object/from16 v18, v9

    goto :goto_14

    :cond_2a
    const/16 v18, 0x0

    :goto_14
    and-int/lit8 v9, v6, 0x70

    xor-int/lit8 v9, v9, 0x30

    const/16 v10, 0x20

    if-le v9, v10, :cond_2b

    invoke-virtual {v8, v1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v9

    if-nez v9, :cond_2c

    :cond_2b
    and-int/lit8 v9, v6, 0x30

    if-ne v9, v10, :cond_2d

    :cond_2c
    const/4 v9, 0x1

    goto :goto_15

    :cond_2d
    const/4 v9, 0x0

    :goto_15
    and-int/lit8 v10, v6, 0xe

    xor-int/lit8 v10, v10, 0x6

    const/4 v13, 0x4

    if-le v10, v13, :cond_2e

    invoke-virtual {v8, v7}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v10

    if-nez v10, :cond_2f

    :cond_2e
    and-int/lit8 v10, v6, 0x6

    if-ne v10, v13, :cond_30

    :cond_2f
    const/4 v10, 0x1

    goto :goto_16

    :cond_30
    const/4 v10, 0x0

    :goto_16
    or-int/2addr v9, v10

    and-int/lit16 v10, v6, 0x1c00

    xor-int/lit16 v10, v10, 0xc00

    if-le v10, v5, :cond_31

    invoke-virtual {v8, v14}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v10

    if-nez v10, :cond_32

    :cond_31
    and-int/lit16 v10, v6, 0xc00

    if-ne v10, v5, :cond_33

    :cond_32
    const/4 v5, 0x1

    goto :goto_17

    :cond_33
    const/4 v5, 0x0

    :goto_17
    or-int/2addr v5, v9

    invoke-virtual {v8}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v9

    if-nez v5, :cond_35

    if-ne v9, v15, :cond_34

    goto :goto_18

    :cond_34
    move-object/from16 v17, v7

    goto :goto_19

    :cond_35
    :goto_18
    sget-object v5, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v5, v11}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v19

    move-object/from16 v21, v1

    move-object/from16 v17, v7

    move-object/from16 v20, v14

    invoke-static/range {v16 .. v21}, Lld1/d;->d(Landroidx/lifecycle/f2;Ljava/lang/Object;Landroid/app/Application;Lj93/d;Lc93/a;Ljava/lang/String;)Lld1/c;

    move-result-object v9

    invoke-virtual {v8, v9}, Lp1/q;->p0(Ljava/lang/Object;)V

    :goto_19
    move-object v10, v9

    check-cast v10, Lld1/c;

    const/4 v1, 0x0

    invoke-virtual {v8, v1}, Lp1/q;->q(Z)V

    goto/16 :goto_13

    :goto_1a
    invoke-virtual {v11}, Lld1/c;->getViewState()Lec3/l;

    move-result-object v5

    shl-int/lit8 v9, v6, 0x3

    const/4 v10, 0x2

    const/4 v7, 0x0

    move v13, v6

    move-object/from16 v6, v17

    invoke-static/range {v5 .. v10}, Lp1/x;->n(Lec3/l;Ljava/lang/Object;Lq83/j;Landroidx/compose/runtime/Composer;II)Lp1/c1;

    move-result-object v5

    invoke-static {v5}, Lzl0/j;->f(Lp1/t2;)Lzl0/k;

    move-result-object v6

    invoke-virtual {v6}, Lzl0/k;->a()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v8, v5}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v7

    and-int/lit16 v9, v12, 0x380

    const/16 v10, 0x100

    if-ne v9, v10, :cond_36

    const/4 v10, 0x1

    goto :goto_1b

    :cond_36
    move v10, v1

    :goto_1b
    or-int/2addr v7, v10

    invoke-virtual {v8, v11}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v10

    or-int/2addr v7, v10

    invoke-virtual {v8}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v10

    if-nez v7, :cond_37

    if-ne v10, v15, :cond_38

    :cond_37
    new-instance v10, Lzl0/j$a;

    const/4 v7, 0x0

    invoke-direct {v10, v3, v5, v11, v7}, Lzl0/j$a;-><init>(Lkotlin/jvm/functions/Function1;Lp1/t2;Lld1/c;Lq83/d;)V

    invoke-virtual {v8, v10}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_38
    check-cast v10, Lc93/m;

    invoke-static {v8, v10, v6}, Lp1/x;->g(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v5}, Lzl0/j;->f(Lp1/t2;)Lzl0/k;

    move-result-object v5

    invoke-virtual {v5}, Lzl0/k;->b()Lr31/f;

    move-result-object v5

    invoke-virtual {v8, v11}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v6

    const/16 v10, 0x100

    if-ne v9, v10, :cond_39

    const/4 v1, 0x1

    :cond_39
    or-int/2addr v1, v6

    invoke-virtual {v8}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v6

    if-nez v1, :cond_3a

    if-ne v6, v15, :cond_3b

    :cond_3a
    new-instance v6, Lb03/b;

    const/16 v1, 0xa

    invoke-direct {v6, v11, v3, v1}, Lb03/b;-><init>(Lld1/c;Lkotlin/jvm/functions/Function1;I)V

    invoke-virtual {v8, v6}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_3b
    move-object v7, v6

    check-cast v7, Lkotlin/jvm/functions/Function1;

    shl-int/lit8 v1, v12, 0x3

    and-int/lit8 v1, v1, 0x70

    or-int v9, v13, v1

    const/4 v10, 0x0

    move-object v6, v0

    invoke-static/range {v5 .. v10}, Lr31/d;->d(Lr31/f;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    :goto_1c
    move-object v1, v6

    goto :goto_1d

    :cond_3c
    invoke-virtual {v8}, Lp1/q;->X()V

    goto :goto_1c

    :goto_1d
    invoke-virtual {v8}, Lp1/q;->u()Lp1/v1;

    move-result-object v6

    if-eqz v6, :cond_3d

    new-instance v0, Lr31/c;

    move/from16 v5, p5

    invoke-direct/range {v0 .. v5}, Lr31/c;-><init>(Landroidx/compose/ui/Modifier;Lr31/f;Lkotlin/jvm/functions/Function1;II)V

    iput-object v0, v6, Lp1/v1;->d:Lc93/m;

    :cond_3d
    return-void
.end method

.method private static final e(Lr31/f;Ljava/lang/String;)Luf3/a;
    .locals 1

    invoke-virtual {p0}, Lr31/f;->c()Ljava/util/List;

    move-result-object v0

    filled-new-array {v0, p1, p0}, [Ljava/lang/Object;

    move-result-object p0

    invoke-static {p0}, Lge3/g;->K([Ljava/lang/Object;)Luf3/a;

    move-result-object p0

    return-object p0
.end method

.method private static final f(Lp1/t2;)Lzl0/k;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp1/t2;",
            ")",
            "Lzl0/k;"
        }
    .end annotation

    invoke-interface {p0}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lzl0/k;

    return-object p0
.end method

.method private static final g(Lld1/c;Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Ll83/a0;
    .locals 1

    const-string v0, "event"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p2, Lb81/j;

    if-eqz v0, :cond_0

    new-instance p1, Lzl0/f$c;

    check-cast p2, Lb81/j;

    invoke-virtual {p2}, Lb81/j;->g()I

    move-result v0

    invoke-virtual {p2}, Lb81/j;->f()Z

    move-result p2

    invoke-direct {p1, v0, p2}, Lzl0/f$c;-><init>(IZ)V

    invoke-virtual {p0, p1}, Lld1/c;->g(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    instance-of v0, p2, Ll11/e;

    if-eqz v0, :cond_1

    sget-object p1, Lzl0/f$b;->a:Lzl0/f$b;

    invoke-virtual {p0, p1}, Lld1/c;->g(Ljava/lang/Object;)V

    goto :goto_0

    :cond_1
    invoke-interface {p1, p2}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :goto_0
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final h(Landroidx/compose/ui/Modifier;Lr31/f;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 6

    or-int/lit8 p3, p3, 0x1

    invoke-static {p3}, Lp1/x;->L(I)I

    move-result v4

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move v5, p4

    move-object v3, p5

    invoke-static/range {v0 .. v5}, Lzl0/j;->d(Landroidx/compose/ui/Modifier;Lr31/f;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static final synthetic i(Lp1/t2;)Lzl0/k;
    .locals 0

    invoke-static {p0}, Lzl0/j;->f(Lp1/t2;)Lzl0/k;

    move-result-object p0

    return-object p0
.end method

.method public static final j(Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lc93/a;)V
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lkotlin/jvm/functions/Function1;",
            "Lc93/a;",
            ")V"
        }
    .end annotation

    const-string v0, "onViewEvent"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "clearFollowup"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    if-eqz p0, :cond_0

    new-instance v0, Lc91/a$b;

    invoke-direct {v0, p0}, Lc91/a$b;-><init>(Ljava/lang/String;)V

    invoke-interface {p1, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-interface {p2}, Lc93/a;->invoke()Ljava/lang/Object;

    :cond_0
    return-void
.end method
