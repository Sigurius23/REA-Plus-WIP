.class public abstract Ln31/h;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u001aA\u0010\n\u001a\u00020\u00062\u0008\u0008\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0014\u0008\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0008\u0008\u0002\u0010\t\u001a\u00020\u0008H\u0001\u00a2\u0006\u0004\u0008\n\u0010\u000b\u00a8\u0006\u0014\u00b2\u0006\u000c\u0010\u000c\u001a\u00020\u00088\nX\u008a\u0084\u0002\u00b2\u0006\u000e\u0010\u000e\u001a\u00020\r8\n@\nX\u008a\u008e\u0002\u00b2\u0006\u000c\u0010\u0010\u001a\u00020\u000f8\nX\u008a\u0084\u0002\u00b2\u0006\u000e\u0010\u0012\u001a\u0004\u0018\u00010\u00118\nX\u008a\u0084\u0002\u00b2\u0006\u0018\u0010\u0013\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\nX\u008a\u0084\u0002"
    }
    d2 = {
        "Landroidx/compose/ui/Modifier;",
        "modifier",
        "Ln31/i;",
        "itemState",
        "Lkotlin/Function1;",
        "",
        "Ll83/a0;",
        "onViewEvent",
        "Ln31/e;",
        "defaultViewState",
        "f",
        "(Landroidx/compose/ui/Modifier;Ln31/i;Lkotlin/jvm/functions/Function1;Ln31/e;Landroidx/compose/runtime/Composer;II)V",
        "viewState",
        "",
        "searchQuery",
        "",
        "currentDebounceMs",
        "Lcom/whoop/analytics/AnalyticEventModel;",
        "currentAnalyticEvent",
        "currentOnViewEvent",
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
.method public static synthetic a(Landroidx/compose/ui/Modifier;Ln31/i;Lkotlin/jvm/functions/Function1;Ln31/e;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p7}, Ln31/h;->k(Landroidx/compose/ui/Modifier;Ln31/i;Lkotlin/jvm/functions/Function1;Ln31/e;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b()Lp1/c1;
    .locals 1

    invoke-static {}, Ln31/h;->m()Lp1/c1;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic c(Lkotlin/jvm/functions/Function1;Lld1/c;Ljava/lang/Object;)Ll83/a0;
    .locals 0

    invoke-static {p1, p0, p2}, Ln31/h;->j(Lld1/c;Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Ljava/lang/Object;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Ln31/h;->h(Ljava/lang/Object;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic e(Lp1/c1;Ljava/lang/String;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Ln31/h;->i(Lp1/c1;Ljava/lang/String;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final f(Landroidx/compose/ui/Modifier;Ln31/i;Lkotlin/jvm/functions/Function1;Ln31/e;Landroidx/compose/runtime/Composer;II)V
    .locals 33
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/ui/Modifier;",
            "Ln31/i;",
            "Lkotlin/jvm/functions/Function1;",
            "Ln31/e;",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    move-object/from16 v2, p1

    move/from16 v8, p5

    const-string v0, "itemState"

    invoke-static {v2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v12, p4

    check-cast v12, Lp1/q;

    const v0, -0x4d3c7dd

    invoke-virtual {v12, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, p6, 0x1

    const/4 v1, 0x4

    if-eqz v0, :cond_0

    or-int/lit8 v3, v8, 0x6

    move v4, v3

    move-object/from16 v3, p0

    goto :goto_1

    :cond_0
    and-int/lit8 v3, v8, 0x6

    if-nez v3, :cond_2

    move-object/from16 v3, p0

    invoke-virtual {v12, v3}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_1

    move v4, v1

    goto :goto_0

    :cond_1
    const/4 v4, 0x2

    :goto_0
    or-int/2addr v4, v8

    goto :goto_1

    :cond_2
    move-object/from16 v3, p0

    move v4, v8

    :goto_1
    and-int/lit8 v5, v8, 0x30

    if-nez v5, :cond_4

    invoke-virtual {v12, v2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_3

    const/16 v5, 0x20

    goto :goto_2

    :cond_3
    const/16 v5, 0x10

    :goto_2
    or-int/2addr v4, v5

    :cond_4
    and-int/lit8 v5, p6, 0x4

    const/16 v15, 0x100

    if-eqz v5, :cond_6

    or-int/lit16 v4, v4, 0x180

    :cond_5
    move-object/from16 v6, p2

    goto :goto_4

    :cond_6
    and-int/lit16 v6, v8, 0x180

    if-nez v6, :cond_5

    move-object/from16 v6, p2

    invoke-virtual {v12, v6}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_7

    move v7, v15

    goto :goto_3

    :cond_7
    const/16 v7, 0x80

    :goto_3
    or-int/2addr v4, v7

    :goto_4
    and-int/lit16 v7, v8, 0xc00

    if-nez v7, :cond_a

    and-int/lit8 v7, p6, 0x8

    if-nez v7, :cond_8

    move-object/from16 v7, p3

    invoke-virtual {v12, v7}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_9

    const/16 v9, 0x800

    goto :goto_5

    :cond_8
    move-object/from16 v7, p3

    :cond_9
    const/16 v9, 0x400

    :goto_5
    or-int/2addr v4, v9

    goto :goto_6

    :cond_a
    move-object/from16 v7, p3

    :goto_6
    and-int/lit16 v9, v4, 0x493

    const/16 v10, 0x492

    const/4 v11, 0x0

    const/16 v16, 0x1

    if-eq v9, v10, :cond_b

    move/from16 v9, v16

    goto :goto_7

    :cond_b
    move v9, v11

    :goto_7
    and-int/lit8 v10, v4, 0x1

    invoke-virtual {v12, v10, v9}, Lp1/q;->U(IZ)Z

    move-result v9

    if-eqz v9, :cond_31

    invoke-virtual {v12}, Lp1/q;->Z()V

    and-int/lit8 v9, v8, 0x1

    sget-object v10, Lp1/l;->a:Lp1/v0;

    if-eqz v9, :cond_e

    invoke-virtual {v12}, Lp1/q;->C()Z

    move-result v9

    if-eqz v9, :cond_c

    goto :goto_8

    :cond_c
    invoke-virtual {v12}, Lp1/q;->X()V

    and-int/lit8 v0, p6, 0x8

    if-eqz v0, :cond_d

    and-int/lit16 v4, v4, -0x1c01

    :cond_d
    move-object/from16 v17, v3

    move-object v0, v6

    goto :goto_b

    :cond_e
    :goto_8
    if-eqz v0, :cond_f

    sget-object v0, Lb2/t;->w:Lb2/t;

    goto :goto_9

    :cond_f
    move-object v0, v3

    :goto_9
    if-eqz v5, :cond_11

    invoke-virtual {v12}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    if-ne v3, v10, :cond_10

    new-instance v3, Lmx1/o;

    const/16 v5, 0x13

    invoke-direct {v3, v5}, Lmx1/o;-><init>(I)V

    invoke-virtual {v12, v3}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_10
    check-cast v3, Lkotlin/jvm/functions/Function1;

    goto :goto_a

    :cond_11
    move-object v3, v6

    :goto_a
    and-int/lit8 v5, p6, 0x8

    if-eqz v5, :cond_12

    new-instance v17, Ln31/e;

    const/16 v30, 0x7fe

    const/16 v31, 0x0

    const/16 v18, 0x1

    const/16 v19, 0x0

    const/16 v20, 0x0

    const-wide/16 v21, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    const/16 v28, 0x0

    const/16 v29, 0x0

    invoke-direct/range {v17 .. v31}, Ln31/e;-><init>(ZZLcom/whoop/design/util/TextResource;JLcom/whoop/design/util/TextResource;Lcom/whoop/analytics/AnalyticEventModel;Ljava/util/List;Ljava/lang/String;ZLjava/lang/String;Lcom/whoop/navigation/models/GenericInteraction;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    and-int/lit16 v4, v4, -0x1c01

    move-object/from16 v7, v17

    :cond_12
    move-object/from16 v17, v0

    move-object v0, v3

    :goto_b
    invoke-virtual {v12}, Lp1/q;->r()V

    sget-object v3, Landroidx/compose/ui/platform/AndroidCompositionLocals_androidKt;->b:Lp1/u2;

    invoke-virtual {v12, v3}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Landroid/content/Context;

    invoke-virtual {v5}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v5

    instance-of v5, v5, Landroid/app/Application;

    if-eqz v5, :cond_26

    const v5, -0x1f011734

    invoke-virtual {v12, v5}, Lp1/q;->e0(I)V

    shr-int/lit8 v5, v4, 0x9

    const v6, 0x51c1188b

    invoke-virtual {v12, v6}, Lp1/q;->e0(I)V

    sget-object v6, Lx81/d;->a:Lx81/d;

    const/4 v9, 0x6

    invoke-virtual {v6, v12, v9}, Lx81/d;->c(Landroidx/compose/runtime/Composer;I)Lcom/whoop/data/repositories/FeatureFlagChecker;

    move-result-object v6

    const-string v13, "safe-design-view-model-injection-android"

    invoke-interface {v6, v13}, Lcom/whoop/data/repositories/FeatureFlagChecker;->isFeatureEnabled(Ljava/lang/String;)Z

    move-result v6

    const-class v13, Ln31/d;

    move/from16 p0, v9

    const/4 v9, 0x0

    const/4 v14, 0x0

    if-nez v6, :cond_1f

    const v6, -0x2a32dbfc

    invoke-virtual {v12, v6}, Lp1/q;->e0(I)V

    invoke-static {v12}, Lm8/a;->a(Landroidx/compose/runtime/Composer;)Landroidx/lifecycle/f2;

    move-result-object v19

    if-nez v19, :cond_13

    const v3, -0x2a322beb

    invoke-virtual {v12, v3}, Lp1/q;->e0(I)V

    invoke-virtual {v12, v11}, Lp1/q;->q(Z)V

    const/4 v3, 0x0

    goto :goto_d

    :cond_13
    const v6, -0x2a322bea

    invoke-virtual {v12, v6}, Lp1/q;->e0(I)V

    invoke-virtual {v12, v3}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroid/content/Context;

    invoke-virtual {v3}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v3

    const-string v6, "null cannot be cast to non-null type android.app.Application"

    invoke-static {v3, v6}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v18, v3

    check-cast v18, Landroid/app/Application;

    invoke-virtual {v12, v9}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v3

    and-int/lit8 v6, v5, 0xe

    xor-int/lit8 v6, v6, 0x6

    if-le v6, v1, :cond_14

    invoke-virtual {v12, v7}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_15

    :cond_14
    and-int/lit8 v6, v5, 0x6

    if-ne v6, v1, :cond_16

    :cond_15
    move/from16 v6, v16

    goto :goto_c

    :cond_16
    move v6, v11

    :goto_c
    or-int/2addr v3, v6

    invoke-virtual {v12, v14}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v6

    or-int/2addr v3, v6

    invoke-virtual {v12}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v6

    if-nez v3, :cond_17

    if-ne v6, v10, :cond_18

    :cond_17
    sget-object v3, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v3, v13}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v20

    new-instance v3, Lld1/b;

    invoke-direct {v3, v7}, Lld1/b;-><init>(Ljava/lang/Object;)V

    move-object/from16 v22, v3

    move-object/from16 v23, v9

    move-object/from16 v21, v14

    invoke-static/range {v18 .. v23}, Lld1/d;->b(Landroid/app/Application;Landroidx/lifecycle/f2;Lj93/d;Lc93/a;Lld1/c;Ljava/lang/String;)Lld1/c;

    move-result-object v6

    invoke-virtual {v12, v6}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_18
    move-object v3, v6

    check-cast v3, Lld1/c;

    invoke-virtual {v12, v11}, Lp1/q;->q(Z)V

    :goto_d
    if-nez v3, :cond_1e

    const v3, -0x2a2a887e

    invoke-virtual {v12, v3}, Lp1/q;->e0(I)V

    invoke-virtual {v12, v9}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v3

    and-int/lit8 v6, v5, 0xe

    xor-int/lit8 v6, v6, 0x6

    if-le v6, v1, :cond_19

    invoke-virtual {v12, v7}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_1a

    :cond_19
    and-int/lit8 v5, v5, 0x6

    if-ne v5, v1, :cond_1b

    :cond_1a
    move/from16 v1, v16

    goto :goto_e

    :cond_1b
    move v1, v11

    :goto_e
    or-int/2addr v1, v3

    invoke-virtual {v12, v14}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v3

    or-int/2addr v1, v3

    invoke-virtual {v12}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    if-nez v1, :cond_1c

    if-ne v3, v10, :cond_1d

    :cond_1c
    new-instance v3, Lld1/b;

    invoke-direct {v3, v7}, Lld1/b;-><init>(Ljava/lang/Object;)V

    invoke-virtual {v12, v3}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_1d
    check-cast v3, Lld1/b;

    invoke-virtual {v12, v11}, Lp1/q;->q(Z)V

    goto :goto_f

    :cond_1e
    const v1, -0x1a22aa39

    invoke-virtual {v12, v1}, Lp1/q;->e0(I)V

    invoke-virtual {v12, v11}, Lp1/q;->q(Z)V

    :goto_f
    invoke-virtual {v12, v11}, Lp1/q;->q(Z)V

    :goto_10
    invoke-virtual {v12, v11}, Lp1/q;->q(Z)V

    goto :goto_13

    :cond_1f
    const v6, -0x2a28ba09

    invoke-static {v12, v6, v11, v12}, Ld;->f(Lp1/q;IZLp1/q;)Landroidx/lifecycle/f2;

    move-result-object v18

    invoke-virtual {v12, v3}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroid/content/Context;

    invoke-virtual {v3}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v3

    instance-of v6, v3, Landroid/app/Application;

    if-eqz v6, :cond_20

    check-cast v3, Landroid/app/Application;

    move-object/from16 v20, v3

    goto :goto_11

    :cond_20
    const/16 v20, 0x0

    :goto_11
    invoke-virtual {v12, v9}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v3

    and-int/lit8 v6, v5, 0xe

    xor-int/lit8 v6, v6, 0x6

    if-le v6, v1, :cond_21

    invoke-virtual {v12, v7}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_22

    :cond_21
    and-int/lit8 v5, v5, 0x6

    if-ne v5, v1, :cond_23

    :cond_22
    move/from16 v1, v16

    goto :goto_12

    :cond_23
    move v1, v11

    :goto_12
    or-int/2addr v1, v3

    invoke-virtual {v12, v14}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v3

    or-int/2addr v1, v3

    invoke-virtual {v12}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    if-nez v1, :cond_24

    if-ne v3, v10, :cond_25

    :cond_24
    sget-object v1, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v1, v13}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v21

    move-object/from16 v19, v7

    move-object/from16 v23, v9

    move-object/from16 v22, v14

    invoke-static/range {v18 .. v23}, Lld1/d;->d(Landroidx/lifecycle/f2;Ljava/lang/Object;Landroid/app/Application;Lj93/d;Lc93/a;Ljava/lang/String;)Lld1/c;

    move-result-object v3

    invoke-virtual {v12, v3}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_25
    check-cast v3, Lld1/c;

    goto :goto_10

    :goto_13
    invoke-virtual {v12, v11}, Lp1/q;->q(Z)V

    goto :goto_14

    :cond_26
    const v1, 0x3ee07e8f

    invoke-virtual {v12, v1}, Lp1/q;->e0(I)V

    invoke-virtual {v12, v7}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v1

    invoke-virtual {v12}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    if-nez v1, :cond_27

    if-ne v3, v10, :cond_28

    :cond_27
    new-instance v3, Lld1/b;

    invoke-direct {v3, v7}, Lld1/b;-><init>(Ljava/lang/Object;)V

    invoke-virtual {v12, v3}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_28
    check-cast v3, Lld1/b;

    invoke-virtual {v12, v11}, Lp1/q;->q(Z)V

    :goto_14
    invoke-virtual {v3}, Lld1/c;->getViewState()Lec3/l;

    move-result-object v9

    shr-int/lit8 v1, v4, 0x6

    and-int/lit8 v13, v1, 0x70

    const/4 v14, 0x2

    move v1, v11

    const/4 v11, 0x0

    move/from16 v18, v1

    move-object v1, v10

    move-object v10, v7

    invoke-static/range {v9 .. v14}, Lp1/x;->n(Lec3/l;Ljava/lang/Object;Lq83/j;Landroidx/compose/runtime/Composer;II)Lp1/c1;

    move-result-object v9

    move-object/from16 v19, v10

    invoke-virtual {v2}, Ln31/i;->b()Ljava/lang/String;

    move-result-object v5

    filled-new-array {v5}, [Ljava/lang/Object;

    move-result-object v5

    invoke-virtual {v12}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v6

    if-ne v6, v1, :cond_29

    new-instance v6, Lmq2/a;

    const/16 v7, 0x15

    invoke-direct {v6, v7}, Lmq2/a;-><init>(I)V

    invoke-virtual {v12, v6}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_29
    check-cast v6, Lc93/a;

    const/16 v7, 0x30

    invoke-static {v5, v6, v12, v7}, Ly1/k;->c([Ljava/lang/Object;Lc93/a;Landroidx/compose/runtime/Composer;I)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lp1/c1;

    invoke-static {v9}, Ln31/h;->l(Lp1/t2;)Ln31/e;

    move-result-object v6

    invoke-virtual {v6}, Ln31/e;->f()J

    move-result-wide v6

    invoke-static {v6, v7}, Ljava/lang/Long;->valueOf(J)Ljava/lang/Long;

    move-result-object v6

    invoke-static {v6, v12}, Lp1/x;->F(Ljava/lang/Object;Landroidx/compose/runtime/Composer;)Lp1/c1;

    move-result-object v6

    invoke-virtual {v2}, Ln31/i;->a()Lcom/whoop/analytics/AnalyticEventModel;

    move-result-object v7

    invoke-static {v7, v12}, Lp1/x;->F(Ljava/lang/Object;Landroidx/compose/runtime/Composer;)Lp1/c1;

    move-result-object v7

    invoke-static {v0, v12}, Lp1/x;->F(Ljava/lang/Object;Landroidx/compose/runtime/Composer;)Lp1/c1;

    move-result-object v10

    invoke-virtual {v2}, Ln31/i;->b()Ljava/lang/String;

    move-result-object v11

    invoke-virtual {v12, v3}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v13

    invoke-virtual {v12, v2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v14

    or-int/2addr v13, v14

    invoke-virtual {v12, v7}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v14

    or-int/2addr v13, v14

    invoke-virtual {v12, v10}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v14

    or-int/2addr v13, v14

    invoke-virtual {v12, v5}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v14

    or-int/2addr v13, v14

    invoke-virtual {v12, v6}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v14

    or-int/2addr v13, v14

    invoke-virtual {v12}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v14

    if-nez v13, :cond_2a

    if-ne v14, v1, :cond_2b

    :cond_2a
    move-object v13, v0

    goto :goto_15

    :cond_2b
    move-object v10, v0

    move-object v13, v1

    move-object v2, v3

    move-object v1, v5

    move-object v0, v14

    move v14, v4

    goto :goto_16

    :goto_15
    new-instance v0, Ln31/h$a;

    move v14, v4

    move-object v4, v7

    const/4 v7, 0x0

    move-object/from16 v32, v13

    move-object v13, v1

    move-object v1, v5

    move-object v5, v10

    move-object/from16 v10, v32

    move-object/from16 v32, v3

    move-object v3, v2

    move-object/from16 v2, v32

    invoke-direct/range {v0 .. v7}, Ln31/h$a;-><init>(Lp1/c1;Lld1/c;Ln31/i;Lp1/t2;Lp1/t2;Lp1/t2;Lq83/d;)V

    invoke-virtual {v12, v0}, Lp1/q;->p0(Ljava/lang/Object;)V

    :goto_16
    check-cast v0, Lc93/m;

    invoke-static {v12, v0, v11}, Lp1/x;->g(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v9}, Ln31/h;->l(Lp1/t2;)Ln31/e;

    move-result-object v0

    invoke-virtual/range {p1 .. p1}, Ln31/i;->b()Ljava/lang/String;

    move-result-object v11

    invoke-static {v1}, Ln31/h;->n(Lp1/c1;)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v12, v1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v4

    invoke-virtual {v12}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    if-nez v4, :cond_2c

    if-ne v5, v13, :cond_2d

    :cond_2c
    new-instance v5, Ln31/a;

    const/4 v4, 0x2

    invoke-direct {v5, v1, v4}, Ln31/a;-><init>(Ljava/lang/Object;I)V

    invoke-virtual {v12, v5}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_2d
    check-cast v5, Lkotlin/jvm/functions/Function1;

    invoke-virtual {v12, v2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v1

    and-int/lit16 v4, v14, 0x380

    if-ne v4, v15, :cond_2e

    goto :goto_17

    :cond_2e
    move/from16 v16, v18

    :goto_17
    or-int v1, v1, v16

    invoke-virtual {v12}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    if-nez v1, :cond_2f

    if-ne v4, v13, :cond_30

    :cond_2f
    new-instance v4, Lb03/b;

    const/4 v1, 0x4

    invoke-direct {v4, v2, v10, v1}, Lb03/b;-><init>(Lld1/c;Lkotlin/jvm/functions/Function1;I)V

    invoke-virtual {v12, v4}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_30
    check-cast v4, Lkotlin/jvm/functions/Function1;

    and-int/lit8 v16, v14, 0xe

    move-object/from16 v9, v17

    const/16 v17, 0x0

    move-object v14, v4

    move-object v13, v5

    move-object v15, v12

    move-object v12, v3

    move-object v3, v10

    move-object v10, v0

    invoke-static/range {v9 .. v17}, Ln31/b;->o(Landroidx/compose/ui/Modifier;Ln31/e;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    move-object v12, v15

    move-object v1, v9

    move-object/from16 v4, v19

    goto :goto_18

    :cond_31
    invoke-virtual {v12}, Lp1/q;->X()V

    move-object v1, v3

    move-object v3, v6

    move-object v4, v7

    :goto_18
    invoke-virtual {v12}, Lp1/q;->u()Lp1/v1;

    move-result-object v9

    if-eqz v9, :cond_32

    new-instance v0, Lkw1/c;

    const/16 v7, 0x13

    move-object/from16 v2, p1

    move/from16 v6, p6

    move v5, v8

    invoke-direct/range {v0 .. v7}, Lkw1/c;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;III)V

    iput-object v0, v9, Lp1/v1;->d:Lc93/m;

    :cond_32
    return-void
.end method

.method private static final g(Lld1/c;Ln31/i;Lp1/t2;Lp1/t2;Ljava/lang/String;Z)V
    .locals 10
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lld1/c<",
            "Ln31/e;",
            "Ln31/c;",
            ">;",
            "Ln31/i;",
            "Lp1/t2;",
            "Lp1/t2;",
            "Ljava/lang/String;",
            "Z)V"
        }
    .end annotation

    invoke-static {p4}, Lyb3/r;->i0(Ljava/lang/CharSequence;)Z

    move-result v0

    if-eqz v0, :cond_0

    new-instance p2, Ln31/c$d;

    invoke-virtual {p1}, Ln31/i;->b()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Ln31/c$d;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0, p2}, Lld1/c;->g(Ljava/lang/Object;)V

    return-void

    :cond_0
    if-eqz p5, :cond_1

    invoke-static {p2}, Ln31/h;->q(Lp1/t2;)Lcom/whoop/analytics/AnalyticEventModel;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-static {p3}, Ln31/h;->r(Lp1/t2;)Lkotlin/jvm/functions/Function1;

    move-result-object p1

    new-instance p2, Lcom/whoop/design/item/DesignItemInteraction;

    const/16 v8, 0x5f

    const/4 v9, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v7, 0x0

    move-object v6, p4

    invoke-static/range {v0 .. v9}, Lcom/whoop/analytics/AnalyticEventModel;->copy$default(Lcom/whoop/analytics/AnalyticEventModel;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;ILjava/lang/Object;)Lcom/whoop/analytics/AnalyticEventModel;

    move-result-object p3

    const/4 p4, 0x0

    invoke-direct {p2, p4, p3}, Lcom/whoop/design/item/DesignItemInteraction;-><init>(Ljava/lang/Object;Lcom/whoop/analytics/AnalyticEventModel;)V

    invoke-interface {p1, p2}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_1
    move-object v6, p4

    :goto_0
    new-instance p1, Ln31/c$e;

    invoke-direct {p1, v6}, Ln31/c$e;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0, p1}, Lld1/c;->g(Ljava/lang/Object;)V

    return-void
.end method

.method private static final h(Ljava/lang/Object;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final i(Lp1/c1;Ljava/lang/String;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0, p1}, Ln31/h;->o(Lp1/c1;Ljava/lang/String;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final j(Lld1/c;Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Ll83/a0;
    .locals 1

    const-string v0, "event"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p2, Ln31/c;

    if-eqz v0, :cond_0

    invoke-virtual {p0, p2}, Lld1/c;->g(Ljava/lang/Object;)V

    goto :goto_0

    :cond_0
    invoke-interface {p1, p2}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :goto_0
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final k(Landroidx/compose/ui/Modifier;Ln31/i;Lkotlin/jvm/functions/Function1;Ln31/e;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
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

    invoke-static/range {v0 .. v6}, Ln31/h;->f(Landroidx/compose/ui/Modifier;Ln31/i;Lkotlin/jvm/functions/Function1;Ln31/e;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final l(Lp1/t2;)Ln31/e;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp1/t2;",
            ")",
            "Ln31/e;"
        }
    .end annotation

    invoke-interface {p0}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ln31/e;

    return-object p0
.end method

.method private static final m()Lp1/c1;
    .locals 1

    const-string v0, ""

    invoke-static {v0}, Lp1/x;->z(Ljava/lang/Object;)Lp1/k1;

    move-result-object v0

    return-object v0
.end method

.method private static final n(Lp1/c1;)Ljava/lang/String;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp1/c1;",
            ")",
            "Ljava/lang/String;"
        }
    .end annotation

    invoke-interface {p0}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/String;

    return-object p0
.end method

.method private static final o(Lp1/c1;Ljava/lang/String;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp1/c1;",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    invoke-interface {p0, p1}, Lp1/c1;->setValue(Ljava/lang/Object;)V

    return-void
.end method

.method private static final p(Lp1/t2;)J
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp1/t2;",
            ")J"
        }
    .end annotation

    invoke-interface {p0}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Number;

    invoke-virtual {p0}, Ljava/lang/Number;->longValue()J

    move-result-wide v0

    return-wide v0
.end method

.method private static final q(Lp1/t2;)Lcom/whoop/analytics/AnalyticEventModel;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp1/t2;",
            ")",
            "Lcom/whoop/analytics/AnalyticEventModel;"
        }
    .end annotation

    invoke-interface {p0}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lcom/whoop/analytics/AnalyticEventModel;

    return-object p0
.end method

.method private static final r(Lp1/t2;)Lkotlin/jvm/functions/Function1;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp1/t2;",
            ")",
            "Lkotlin/jvm/functions/Function1;"
        }
    .end annotation

    invoke-interface {p0}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lkotlin/jvm/functions/Function1;

    return-object p0
.end method

.method public static final synthetic s(Lld1/c;Ln31/i;Lp1/t2;Lp1/t2;Ljava/lang/String;Z)V
    .locals 0

    invoke-static/range {p0 .. p5}, Ln31/h;->g(Lld1/c;Ln31/i;Lp1/t2;Lp1/t2;Ljava/lang/String;Z)V

    return-void
.end method

.method public static final synthetic t(Lp1/c1;)Ljava/lang/String;
    .locals 0

    invoke-static {p0}, Ln31/h;->n(Lp1/c1;)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic u(Lp1/t2;)J
    .locals 2

    invoke-static {p0}, Ln31/h;->p(Lp1/t2;)J

    move-result-wide v0

    return-wide v0
.end method
