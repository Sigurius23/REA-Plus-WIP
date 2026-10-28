.class public abstract Ltm1/b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u001a+\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0007\u00a2\u0006\u0004\u0008\u0006\u0010\u0007\u00a8\u0006\n\u00b2\u0006\u000c\u0010\t\u001a\u00020\u00088\nX\u008a\u0084\u0002"
    }
    d2 = {
        "Ljs1/m;",
        "viewState",
        "Lkotlin/Function1;",
        "",
        "Ll83/a0;",
        "onViewEvent",
        "c",
        "(Ljs1/m;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V",
        "Lhs1/c;",
        "journalHomeTileViewState",
        "home_release"
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
.method public static synthetic a(Ljs1/m;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Ltm1/b;->f(Ljs1/m;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lhs1/b;Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, Ltm1/b;->e(Lhs1/b;Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final c(Ljs1/m;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V
    .locals 22
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljs1/m;",
            "Lkotlin/jvm/functions/Function1;",
            "Landroidx/compose/runtime/Composer;",
            "I)V"
        }
    .end annotation

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move/from16 v2, p3

    const-string v3, "viewState"

    invoke-static {v0, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v3, "onViewEvent"

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v7, p2

    check-cast v7, Lp1/q;

    const v3, 0x608263bf

    invoke-virtual {v7, v3}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v3, v2, 0x6

    const/4 v4, 0x4

    if-nez v3, :cond_2

    and-int/lit8 v3, v2, 0x8

    if-nez v3, :cond_0

    invoke-virtual {v7, v0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v3

    goto :goto_0

    :cond_0
    invoke-virtual {v7, v0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v3

    :goto_0
    if-eqz v3, :cond_1

    move v3, v4

    goto :goto_1

    :cond_1
    const/4 v3, 0x2

    :goto_1
    or-int/2addr v3, v2

    goto :goto_2

    :cond_2
    move v3, v2

    :goto_2
    and-int/lit8 v5, v2, 0x30

    const/16 v10, 0x20

    if-nez v5, :cond_4

    invoke-virtual {v7, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_3

    move v5, v10

    goto :goto_3

    :cond_3
    const/16 v5, 0x10

    :goto_3
    or-int/2addr v3, v5

    :cond_4
    and-int/lit8 v5, v3, 0x13

    const/16 v6, 0x12

    const/4 v12, 0x0

    if-eq v5, v6, :cond_5

    const/4 v5, 0x1

    goto :goto_4

    :cond_5
    move v5, v12

    :goto_4
    and-int/lit8 v6, v3, 0x1

    invoke-virtual {v7, v6, v5}, Lp1/q;->U(IZ)Z

    move-result v5

    if-eqz v5, :cond_2e

    invoke-virtual {v0}, Ljs1/m;->a()Lhs1/c;

    move-result-object v14

    sget v5, Lhs1/c;->a:I

    const v6, 0x51c1188b

    invoke-virtual {v7, v6}, Lp1/q;->e0(I)V

    sget-object v6, Lx81/d;->a:Lx81/d;

    const/4 v8, 0x6

    invoke-virtual {v6, v7, v8}, Lx81/d;->c(Landroidx/compose/runtime/Composer;I)Lcom/whoop/data/repositories/FeatureFlagChecker;

    move-result-object v6

    const-string v9, "safe-design-view-model-injection-android"

    invoke-interface {v6, v9}, Lcom/whoop/data/repositories/FeatureFlagChecker;->isFeatureEnabled(Ljava/lang/String;)Z

    move-result v6

    const-class v9, Lhs1/b;

    sget-object v15, Lp1/l;->a:Lp1/v0;

    move/from16 p2, v8

    const/16 v8, 0x800

    const/4 v11, 0x0

    const/4 v13, 0x0

    if-nez v6, :cond_1e

    const v6, -0x2a32dbfc

    invoke-virtual {v7, v6}, Lp1/q;->e0(I)V

    invoke-static {v7}, Lm8/a;->a(Landroidx/compose/runtime/Composer;)Landroidx/lifecycle/f2;

    move-result-object v17

    if-nez v17, :cond_6

    const v6, -0x2a322beb

    invoke-virtual {v7, v6}, Lp1/q;->e0(I)V

    invoke-virtual {v7, v12}, Lp1/q;->q(Z)V

    move-object v6, v11

    move-object v11, v13

    const/4 v13, 0x0

    goto/16 :goto_a

    :cond_6
    const v6, -0x2a322bea

    invoke-virtual {v7, v6}, Lp1/q;->e0(I)V

    sget-object v6, Landroidx/compose/ui/platform/AndroidCompositionLocals_androidKt;->b:Lp1/u2;

    invoke-virtual {v7, v6}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Landroid/content/Context;

    invoke-virtual {v6}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v6

    const-string v12, "null cannot be cast to non-null type android.app.Application"

    invoke-static {v6, v12}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v16, v6

    check-cast v16, Landroid/app/Application;

    and-int/lit8 v6, v5, 0x70

    xor-int/lit8 v6, v6, 0x30

    if-le v6, v10, :cond_7

    invoke-virtual {v7, v11}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_8

    :cond_7
    and-int/lit8 v6, v5, 0x30

    if-ne v6, v10, :cond_9

    :cond_8
    const/4 v6, 0x1

    goto :goto_5

    :cond_9
    const/4 v6, 0x0

    :goto_5
    and-int/lit8 v12, v5, 0xe

    xor-int/lit8 v12, v12, 0x6

    if-le v12, v4, :cond_a

    invoke-virtual {v7, v14}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v12

    if-nez v12, :cond_b

    :cond_a
    and-int/lit8 v12, v5, 0x6

    if-ne v12, v4, :cond_c

    :cond_b
    const/4 v12, 0x1

    goto :goto_6

    :cond_c
    const/4 v12, 0x0

    :goto_6
    or-int/2addr v6, v12

    and-int/lit16 v12, v5, 0x1c00

    xor-int/lit16 v12, v12, 0xc00

    if-le v12, v8, :cond_d

    invoke-virtual {v7, v13}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v12

    if-nez v12, :cond_e

    :cond_d
    and-int/lit16 v12, v5, 0xc00

    if-ne v12, v8, :cond_f

    :cond_e
    const/4 v12, 0x1

    goto :goto_7

    :cond_f
    const/4 v12, 0x0

    :goto_7
    or-int/2addr v6, v12

    invoke-virtual {v7}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v12

    if-nez v6, :cond_11

    if-ne v12, v15, :cond_10

    goto :goto_8

    :cond_10
    move-object v6, v11

    move-object v11, v13

    goto :goto_9

    :cond_11
    :goto_8
    sget-object v6, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v6, v9}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v18

    new-instance v6, Lld1/b;

    invoke-direct {v6, v14}, Lld1/b;-><init>(Ljava/lang/Object;)V

    move-object/from16 v20, v6

    move-object/from16 v21, v11

    move-object/from16 v19, v13

    invoke-static/range {v16 .. v21}, Lld1/d;->b(Landroid/app/Application;Landroidx/lifecycle/f2;Lj93/d;Lc93/a;Lld1/c;Ljava/lang/String;)Lld1/c;

    move-result-object v12

    move-object/from16 v11, v19

    move-object/from16 v6, v21

    invoke-virtual {v7, v12}, Lp1/q;->p0(Ljava/lang/Object;)V

    :goto_9
    move-object v13, v12

    check-cast v13, Lld1/c;

    const/4 v9, 0x0

    invoke-virtual {v7, v9}, Lp1/q;->q(Z)V

    :goto_a
    if-nez v13, :cond_1d

    const v9, -0x2a2a887e

    invoke-virtual {v7, v9}, Lp1/q;->e0(I)V

    and-int/lit8 v9, v5, 0x70

    xor-int/lit8 v9, v9, 0x30

    if-le v9, v10, :cond_12

    invoke-virtual {v7, v6}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_13

    :cond_12
    and-int/lit8 v6, v5, 0x30

    if-ne v6, v10, :cond_14

    :cond_13
    const/4 v6, 0x1

    goto :goto_b

    :cond_14
    const/4 v6, 0x0

    :goto_b
    and-int/lit8 v9, v5, 0xe

    xor-int/lit8 v9, v9, 0x6

    if-le v9, v4, :cond_15

    invoke-virtual {v7, v14}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v9

    if-nez v9, :cond_16

    :cond_15
    and-int/lit8 v9, v5, 0x6

    if-ne v9, v4, :cond_17

    :cond_16
    const/4 v4, 0x1

    goto :goto_c

    :cond_17
    const/4 v4, 0x0

    :goto_c
    or-int/2addr v4, v6

    and-int/lit16 v6, v5, 0x1c00

    xor-int/lit16 v6, v6, 0xc00

    if-le v6, v8, :cond_18

    invoke-virtual {v7, v11}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_19

    :cond_18
    and-int/lit16 v6, v5, 0xc00

    if-ne v6, v8, :cond_1a

    :cond_19
    const/4 v6, 0x1

    goto :goto_d

    :cond_1a
    const/4 v6, 0x0

    :goto_d
    or-int/2addr v4, v6

    invoke-virtual {v7}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v6

    if-nez v4, :cond_1b

    if-ne v6, v15, :cond_1c

    :cond_1b
    new-instance v6, Lld1/b;

    invoke-direct {v6, v14}, Lld1/b;-><init>(Ljava/lang/Object;)V

    invoke-virtual {v7, v6}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_1c
    move-object v13, v6

    check-cast v13, Lld1/b;

    const/4 v12, 0x0

    invoke-virtual {v7, v12}, Lp1/q;->q(Z)V

    goto :goto_e

    :cond_1d
    const/4 v12, 0x0

    const v4, -0x1a22aa39

    invoke-virtual {v7, v4}, Lp1/q;->e0(I)V

    invoke-virtual {v7, v12}, Lp1/q;->q(Z)V

    :goto_e
    invoke-virtual {v7, v12}, Lp1/q;->q(Z)V

    invoke-virtual {v7, v12}, Lp1/q;->q(Z)V

    move-object v11, v15

    goto/16 :goto_16

    :cond_1e
    move-object v6, v11

    move-object v11, v13

    const v13, -0x2a28ba09

    invoke-static {v7, v13, v12, v7}, Ld;->f(Lp1/q;IZLp1/q;)Landroidx/lifecycle/f2;

    move-result-object v13

    sget-object v12, Landroidx/compose/ui/platform/AndroidCompositionLocals_androidKt;->b:Lp1/u2;

    invoke-virtual {v7, v12}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Landroid/content/Context;

    invoke-virtual {v12}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v12

    instance-of v11, v12, Landroid/app/Application;

    if-eqz v11, :cond_1f

    move-object v11, v12

    check-cast v11, Landroid/app/Application;

    move-object/from16 v16, v11

    goto :goto_f

    :cond_1f
    const/16 v16, 0x0

    :goto_f
    and-int/lit8 v11, v5, 0x70

    xor-int/lit8 v11, v11, 0x30

    if-le v11, v10, :cond_20

    invoke-virtual {v7, v6}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v11

    if-nez v11, :cond_21

    :cond_20
    and-int/lit8 v11, v5, 0x30

    if-ne v11, v10, :cond_22

    :cond_21
    const/4 v11, 0x1

    goto :goto_10

    :cond_22
    const/4 v11, 0x0

    :goto_10
    and-int/lit8 v12, v5, 0xe

    xor-int/lit8 v12, v12, 0x6

    if-le v12, v4, :cond_23

    invoke-virtual {v7, v14}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v12

    if-nez v12, :cond_24

    :cond_23
    and-int/lit8 v12, v5, 0x6

    if-ne v12, v4, :cond_25

    :cond_24
    const/4 v4, 0x1

    goto :goto_11

    :cond_25
    const/4 v4, 0x0

    :goto_11
    or-int/2addr v4, v11

    and-int/lit16 v11, v5, 0x1c00

    xor-int/lit16 v11, v11, 0xc00

    if-le v11, v8, :cond_26

    const/4 v11, 0x0

    invoke-virtual {v7, v11}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v12

    if-nez v12, :cond_27

    goto :goto_12

    :cond_26
    const/4 v11, 0x0

    :goto_12
    and-int/lit16 v12, v5, 0xc00

    if-ne v12, v8, :cond_28

    :cond_27
    const/4 v8, 0x1

    goto :goto_13

    :cond_28
    const/4 v8, 0x0

    :goto_13
    or-int/2addr v4, v8

    invoke-virtual {v7}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v8

    if-nez v4, :cond_2a

    if-ne v8, v15, :cond_29

    goto :goto_14

    :cond_29
    move-object v11, v15

    goto :goto_15

    :cond_2a
    :goto_14
    sget-object v4, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v4, v9}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v4

    move-object/from16 v18, v6

    move-object/from16 v17, v11

    move-object v11, v15

    move-object/from16 v15, v16

    move-object/from16 v16, v4

    invoke-static/range {v13 .. v18}, Lld1/d;->d(Landroidx/lifecycle/f2;Ljava/lang/Object;Landroid/app/Application;Lj93/d;Lc93/a;Ljava/lang/String;)Lld1/c;

    move-result-object v8

    invoke-virtual {v7, v8}, Lp1/q;->p0(Ljava/lang/Object;)V

    :goto_15
    move-object v13, v8

    check-cast v13, Lld1/c;

    const/4 v12, 0x0

    invoke-virtual {v7, v12}, Lp1/q;->q(Z)V

    :goto_16
    const-string v4, "null cannot be cast to non-null type com.whoop.journalhometile.presentation.JournalHomeTileViewModel"

    invoke-static {v13, v4}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v13, Lhs1/b;

    invoke-virtual {v13}, Lhs1/b;->getViewState()Lec3/f2;

    move-result-object v4

    move v6, v5

    sget-object v5, Lhs1/c$b;->b:Lhs1/c$b;

    sget v8, Lhs1/c$b;->c:I

    shl-int/lit8 v8, v8, 0x3

    const/4 v9, 0x2

    move v14, v6

    const/4 v6, 0x0

    invoke-static/range {v4 .. v9}, Lp1/x;->n(Lec3/l;Ljava/lang/Object;Lq83/j;Landroidx/compose/runtime/Composer;II)Lp1/c1;

    move-result-object v4

    invoke-static {v4}, Ltm1/b;->d(Lp1/t2;)Lhs1/c;

    move-result-object v5

    invoke-virtual {v0}, Ljs1/m;->b()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v7, v13}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v4

    and-int/lit8 v3, v3, 0x70

    if-ne v3, v10, :cond_2b

    const/4 v12, 0x1

    :cond_2b
    or-int v3, v4, v12

    invoke-virtual {v7}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    if-nez v3, :cond_2c

    if-ne v4, v11, :cond_2d

    :cond_2c
    new-instance v4, Lp3/b0;

    const/16 v3, 0xa

    invoke-direct {v4, v3, v13, v1}, Lp3/b0;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v7, v4}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_2d
    move-object v8, v4

    check-cast v8, Lkotlin/jvm/functions/Function1;

    shl-int/lit8 v10, v14, 0x3

    const/16 v11, 0x9

    const/4 v4, 0x0

    move-object v9, v7

    const/4 v7, 0x0

    invoke-static/range {v4 .. v11}, Ljs1/l;->y(Landroidx/compose/ui/Modifier;Lhs1/c;Ljava/lang/String;ZLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    move-object v7, v9

    goto :goto_17

    :cond_2e
    invoke-virtual {v7}, Lp1/q;->X()V

    :goto_17
    invoke-virtual {v7}, Lp1/q;->u()Lp1/v1;

    move-result-object v3

    if-eqz v3, :cond_2f

    new-instance v4, La11/j;

    const/16 v5, 0x11

    invoke-direct {v4, v0, v1, v2, v5}, La11/j;-><init>(Ljava/lang/Object;Ljava/lang/Object;II)V

    iput-object v4, v3, Lp1/v1;->d:Lc93/m;

    :cond_2f
    return-void
.end method

.method private static final d(Lp1/t2;)Lhs1/c;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp1/t2;",
            ")",
            "Lhs1/c;"
        }
    .end annotation

    invoke-interface {p0}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lhs1/c;

    return-object p0
.end method

.method private static final e(Lhs1/b;Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p2, Lhs1/a;

    if-eqz v0, :cond_0

    check-cast p2, Lhs1/a;

    invoke-virtual {p0, p2}, Lhs1/b;->n(Lhs1/a;)V

    goto :goto_0

    :cond_0
    invoke-interface {p1, p2}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :goto_0
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final f(Ljs1/m;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, Lp1/x;->L(I)I

    move-result p2

    invoke-static {p0, p1, p3, p2}, Ltm1/b;->c(Ljs1/m;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method
