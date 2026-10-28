.class public abstract Lw12/h;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0008\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u001a5\u0010\t\u001a\u00020\u00082\u0006\u0010\u0001\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u00042\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u0006H\u0001\u00a2\u0006\u0004\u0008\t\u0010\n\u001a+\u0010\r\u001a\u00020\u00082\u0006\u0010\u000c\u001a\u00020\u000b2\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u0006H\u0001\u00a2\u0006\u0004\u0008\r\u0010\u000e\u00a8\u0006\u000f\u00b2\u0006\u000c\u0010\u000c\u001a\u00020\u000b8\nX\u008a\u0084\u0002"
    }
    d2 = {
        "Lcom/whoop/navigation/models/ChatHeaderMetadata;",
        "metadata",
        "Landroidx/compose/ui/Modifier;",
        "modifier",
        "",
        "turnsCompleted",
        "Ly3/f;",
        "spacing",
        "Ll83/a0;",
        "f",
        "(Lcom/whoop/navigation/models/ChatHeaderMetadata;Landroidx/compose/ui/Modifier;IFLandroidx/compose/runtime/Composer;II)V",
        "Lv12/c;",
        "viewState",
        "g",
        "(Lv12/c;Landroidx/compose/ui/Modifier;FLandroidx/compose/runtime/Composer;II)V",
        "onboarding-personalization_release"
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
.method public static synthetic a(Lm91/u;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/Modifier;
    .locals 0

    invoke-static {p0, p1, p2}, Lw12/h;->j(Lm91/u;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/Modifier;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Landroidx/compose/ui/Modifier;FLv12/c;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Lw12/h;->i(Landroidx/compose/ui/Modifier;FLv12/c;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Lv12/c;Landroidx/compose/ui/Modifier;FIILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p6}, Lw12/h;->h(Lv12/c;Landroidx/compose/ui/Modifier;FIILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Lv12/c;Landroidx/compose/ui/Modifier;FIILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p6}, Lw12/h;->k(Lv12/c;Landroidx/compose/ui/Modifier;FIILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic e(Lcom/whoop/navigation/models/ChatHeaderMetadata;Landroidx/compose/ui/Modifier;IFIILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p7}, Lw12/h;->m(Lcom/whoop/navigation/models/ChatHeaderMetadata;Landroidx/compose/ui/Modifier;IFIILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final f(Lcom/whoop/navigation/models/ChatHeaderMetadata;Landroidx/compose/ui/Modifier;IFLandroidx/compose/runtime/Composer;II)V
    .locals 21

    move-object/from16 v1, p0

    move/from16 v5, p5

    const-string v0, "metadata"

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v9, p4

    check-cast v9, Lp1/q;

    const v0, -0xff0456e

    invoke-virtual {v9, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, v5, 0x6

    if-nez v0, :cond_2

    and-int/lit8 v0, v5, 0x8

    if-nez v0, :cond_0

    invoke-virtual {v9, v1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v0

    goto :goto_0

    :cond_0
    invoke-virtual {v9, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v0

    :goto_0
    if-eqz v0, :cond_1

    const/4 v0, 0x4

    goto :goto_1

    :cond_1
    const/4 v0, 0x2

    :goto_1
    or-int/2addr v0, v5

    goto :goto_2

    :cond_2
    move v0, v5

    :goto_2
    and-int/lit8 v3, p6, 0x2

    if-eqz v3, :cond_4

    or-int/lit8 v0, v0, 0x30

    :cond_3
    move-object/from16 v4, p1

    goto :goto_4

    :cond_4
    and-int/lit8 v4, v5, 0x30

    if-nez v4, :cond_3

    move-object/from16 v4, p1

    invoke-virtual {v9, v4}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_5

    const/16 v6, 0x20

    goto :goto_3

    :cond_5
    const/16 v6, 0x10

    :goto_3
    or-int/2addr v0, v6

    :goto_4
    and-int/lit8 v6, p6, 0x4

    if-eqz v6, :cond_7

    or-int/lit16 v0, v0, 0x180

    :cond_6
    move/from16 v7, p2

    goto :goto_6

    :cond_7
    and-int/lit16 v7, v5, 0x180

    if-nez v7, :cond_6

    move/from16 v7, p2

    invoke-virtual {v9, v7}, Lp1/q;->e(I)Z

    move-result v8

    if-eqz v8, :cond_8

    const/16 v8, 0x100

    goto :goto_5

    :cond_8
    const/16 v8, 0x80

    :goto_5
    or-int/2addr v0, v8

    :goto_6
    and-int/lit8 v8, p6, 0x8

    if-eqz v8, :cond_a

    or-int/lit16 v0, v0, 0xc00

    :cond_9
    move/from16 v10, p3

    goto :goto_8

    :cond_a
    and-int/lit16 v10, v5, 0xc00

    if-nez v10, :cond_9

    move/from16 v10, p3

    invoke-virtual {v9, v10}, Lp1/q;->d(F)Z

    move-result v11

    if-eqz v11, :cond_b

    const/16 v11, 0x800

    goto :goto_7

    :cond_b
    const/16 v11, 0x400

    :goto_7
    or-int/2addr v0, v11

    :goto_8
    and-int/lit16 v11, v0, 0x493

    const/16 v12, 0x492

    const/4 v13, 0x1

    const/4 v14, 0x0

    if-eq v11, v12, :cond_c

    move v11, v13

    goto :goto_9

    :cond_c
    move v11, v14

    :goto_9
    and-int/lit8 v12, v0, 0x1

    invoke-virtual {v9, v12, v11}, Lp1/q;->U(IZ)Z

    move-result v11

    if-eqz v11, :cond_1e

    if-eqz v3, :cond_d

    sget-object v3, Lb2/t;->w:Lb2/t;

    goto :goto_a

    :cond_d
    move-object v3, v4

    :goto_a
    if-eqz v6, :cond_e

    move v4, v14

    goto :goto_b

    :cond_e
    move v4, v7

    :goto_b
    if-eqz v8, :cond_f

    int-to-float v6, v13

    const/16 v7, 0x8

    int-to-float v7, v7

    mul-float/2addr v6, v7

    move v12, v6

    goto :goto_c

    :cond_f
    move v12, v10

    :goto_c
    new-instance v6, Lv12/c;

    const/4 v7, 0x0

    invoke-direct {v6, v7, v13, v7}, Lv12/c;-><init>(Ljava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const v8, 0x51c1188b

    invoke-virtual {v9, v8}, Lp1/q;->e0(I)V

    sget-object v8, Lx81/d;->a:Lx81/d;

    const/4 v10, 0x6

    invoke-virtual {v8, v9, v10}, Lx81/d;->c(Landroidx/compose/runtime/Composer;I)Lcom/whoop/data/repositories/FeatureFlagChecker;

    move-result-object v8

    const-string v10, "safe-design-view-model-injection-android"

    invoke-interface {v8, v10}, Lcom/whoop/data/repositories/FeatureFlagChecker;->isFeatureEnabled(Ljava/lang/String;)Z

    move-result v8

    const-class v10, Lv12/b;

    sget-object v11, Lp1/l;->a:Lp1/v0;

    const/4 v15, 0x0

    const/4 v2, 0x0

    if-nez v8, :cond_16

    const v8, -0x2a32dbfc

    invoke-virtual {v9, v8}, Lp1/q;->e0(I)V

    invoke-static {v9}, Lm8/a;->a(Landroidx/compose/runtime/Composer;)Landroidx/lifecycle/f2;

    move-result-object v16

    if-nez v16, :cond_10

    const v8, -0x2a322beb

    invoke-virtual {v9, v8}, Lp1/q;->e0(I)V

    invoke-virtual {v9, v14}, Lp1/q;->q(Z)V

    move-object v8, v2

    move-object v2, v7

    move-object v7, v15

    goto :goto_f

    :cond_10
    const v8, -0x2a322bea

    invoke-virtual {v9, v8}, Lp1/q;->e0(I)V

    sget-object v8, Landroidx/compose/ui/platform/AndroidCompositionLocals_androidKt;->b:Lp1/u2;

    invoke-virtual {v9, v8}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Landroid/content/Context;

    invoke-virtual {v8}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v8

    const-string v7, "null cannot be cast to non-null type android.app.Application"

    invoke-static {v8, v7}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v8, Landroid/app/Application;

    invoke-virtual {v9, v15}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v7

    invoke-virtual {v9, v6}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v17

    or-int v7, v7, v17

    invoke-virtual {v9, v2}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v17

    or-int v7, v7, v17

    invoke-virtual {v9}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    if-nez v7, :cond_12

    if-ne v2, v11, :cond_11

    goto :goto_d

    :cond_11
    move-object v7, v15

    const/4 v8, 0x0

    goto :goto_e

    :cond_12
    :goto_d
    sget-object v2, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v2, v10}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v17

    new-instance v2, Lld1/b;

    invoke-direct {v2, v6}, Lld1/b;-><init>(Ljava/lang/Object;)V

    move-object/from16 v19, v2

    move-object/from16 v20, v15

    const/16 v18, 0x0

    move-object v15, v8

    invoke-static/range {v15 .. v20}, Lld1/d;->b(Landroid/app/Application;Landroidx/lifecycle/f2;Lj93/d;Lc93/a;Lld1/c;Ljava/lang/String;)Lld1/c;

    move-result-object v2

    move-object/from16 v8, v18

    move-object/from16 v7, v20

    invoke-virtual {v9, v2}, Lp1/q;->p0(Ljava/lang/Object;)V

    :goto_e
    check-cast v2, Lld1/c;

    invoke-virtual {v9, v14}, Lp1/q;->q(Z)V

    :goto_f
    if-nez v2, :cond_15

    const v2, -0x2a2a887e

    invoke-virtual {v9, v2}, Lp1/q;->e0(I)V

    invoke-virtual {v9, v7}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v2

    invoke-virtual {v9, v6}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v7

    or-int/2addr v2, v7

    invoke-virtual {v9, v8}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v7

    or-int/2addr v2, v7

    invoke-virtual {v9}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v7

    if-nez v2, :cond_13

    if-ne v7, v11, :cond_14

    :cond_13
    new-instance v7, Lld1/b;

    invoke-direct {v7, v6}, Lld1/b;-><init>(Ljava/lang/Object;)V

    invoke-virtual {v9, v7}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_14
    move-object v2, v7

    check-cast v2, Lld1/b;

    invoke-virtual {v9, v14}, Lp1/q;->q(Z)V

    goto :goto_10

    :cond_15
    const v6, -0x1a22aa39

    invoke-virtual {v9, v6}, Lp1/q;->e0(I)V

    invoke-virtual {v9, v14}, Lp1/q;->q(Z)V

    :goto_10
    invoke-virtual {v9, v14}, Lp1/q;->q(Z)V

    :goto_11
    invoke-virtual {v9, v14}, Lp1/q;->q(Z)V

    goto :goto_13

    :cond_16
    move-object v8, v2

    move-object v7, v15

    const v2, -0x2a28ba09

    invoke-static {v9, v2, v14, v9}, Ld;->f(Lp1/q;IZLp1/q;)Landroidx/lifecycle/f2;

    move-result-object v15

    sget-object v2, Landroidx/compose/ui/platform/AndroidCompositionLocals_androidKt;->b:Lp1/u2;

    invoke-virtual {v9, v2}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Landroid/content/Context;

    invoke-virtual {v2}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v2

    instance-of v13, v2, Landroid/app/Application;

    if-eqz v13, :cond_17

    check-cast v2, Landroid/app/Application;

    move-object/from16 v17, v2

    goto :goto_12

    :cond_17
    const/16 v17, 0x0

    :goto_12
    invoke-virtual {v9, v7}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v2

    invoke-virtual {v9, v6}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v13

    or-int/2addr v2, v13

    invoke-virtual {v9, v8}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v13

    or-int/2addr v2, v13

    invoke-virtual {v9}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v13

    if-nez v2, :cond_18

    if-ne v13, v11, :cond_19

    :cond_18
    sget-object v2, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v2, v10}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v18

    move-object/from16 v16, v6

    move-object/from16 v20, v7

    move-object/from16 v19, v8

    invoke-static/range {v15 .. v20}, Lld1/d;->d(Landroidx/lifecycle/f2;Ljava/lang/Object;Landroid/app/Application;Lj93/d;Lc93/a;Ljava/lang/String;)Lld1/c;

    move-result-object v13

    invoke-virtual {v9, v13}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_19
    move-object v2, v13

    check-cast v2, Lld1/c;

    goto :goto_11

    :goto_13
    invoke-virtual {v2}, Lld1/c;->getViewState()Lec3/l;

    move-result-object v6

    new-instance v7, Lv12/c;

    const/4 v8, 0x0

    const/4 v13, 0x1

    invoke-direct {v7, v8, v13, v8}, Lv12/c;-><init>(Ljava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/4 v10, 0x0

    move-object v15, v11

    const/4 v11, 0x2

    move-object/from16 v16, v8

    const/4 v8, 0x0

    move-object/from16 v13, v16

    invoke-static/range {v6 .. v11}, Lp1/x;->n(Lec3/l;Ljava/lang/Object;Lq83/j;Landroidx/compose/runtime/Composer;II)Lp1/c1;

    move-result-object v6

    invoke-virtual {v1}, Lcom/whoop/navigation/models/ChatHeaderMetadata;->getPath()Ljava/lang/String;

    move-result-object v7

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    invoke-virtual {v9, v2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v10

    and-int/lit8 v11, v0, 0xe

    const/4 v14, 0x4

    if-eq v11, v14, :cond_1b

    and-int/lit8 v11, v0, 0x8

    if-eqz v11, :cond_1a

    invoke-virtual {v9, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_1a

    goto :goto_14

    :cond_1a
    const/16 v16, 0x0

    goto :goto_15

    :cond_1b
    :goto_14
    const/16 v16, 0x1

    :goto_15
    or-int v10, v10, v16

    invoke-virtual {v9}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v11

    if-nez v10, :cond_1c

    if-ne v11, v15, :cond_1d

    :cond_1c
    new-instance v11, Lw12/h$a;

    invoke-direct {v11, v2, v1, v13}, Lw12/h$a;-><init>(Lld1/c;Lcom/whoop/navigation/models/ChatHeaderMetadata;Lq83/d;)V

    invoke-virtual {v9, v11}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_1d
    check-cast v11, Lc93/m;

    invoke-static {v2, v7, v8, v11, v9}, Lp1/x;->i(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lc93/m;Landroidx/compose/runtime/Composer;)V

    invoke-static {v6}, Lw12/h;->l(Lp1/t2;)Lv12/c;

    move-result-object v6

    and-int/lit8 v2, v0, 0x70

    shr-int/lit8 v0, v0, 0x3

    and-int/lit16 v0, v0, 0x380

    or-int v10, v2, v0

    const/4 v11, 0x0

    move-object v7, v3

    move v8, v12

    invoke-static/range {v6 .. v11}, Lw12/h;->g(Lv12/c;Landroidx/compose/ui/Modifier;FLandroidx/compose/runtime/Composer;II)V

    move v3, v4

    move-object v2, v7

    move v4, v8

    goto :goto_16

    :cond_1e
    invoke-virtual {v9}, Lp1/q;->X()V

    move-object v2, v4

    move v3, v7

    move v4, v10

    :goto_16
    invoke-virtual {v9}, Lp1/q;->u()Lp1/v1;

    move-result-object v7

    if-eqz v7, :cond_1f

    new-instance v0, Lw12/e;

    move/from16 v6, p6

    invoke-direct/range {v0 .. v6}, Lw12/e;-><init>(Lcom/whoop/navigation/models/ChatHeaderMetadata;Landroidx/compose/ui/Modifier;IFII)V

    iput-object v0, v7, Lp1/v1;->d:Lc93/m;

    :cond_1f
    return-void
.end method

.method public static final g(Lv12/c;Landroidx/compose/ui/Modifier;FLandroidx/compose/runtime/Composer;II)V
    .locals 11

    const-string v0, "viewState"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v0, p3

    check-cast v0, Lp1/q;

    const v2, -0x6ee68a89

    invoke-virtual {v0, v2}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v2, p4, 0x6

    if-nez v2, :cond_1

    invoke-virtual {v0, p0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    const/4 v2, 0x4

    goto :goto_0

    :cond_0
    const/4 v2, 0x2

    :goto_0
    or-int/2addr v2, p4

    goto :goto_1

    :cond_1
    move v2, p4

    :goto_1
    and-int/lit8 v3, p5, 0x2

    if-eqz v3, :cond_2

    or-int/lit8 v2, v2, 0x30

    goto :goto_3

    :cond_2
    and-int/lit8 v5, p4, 0x30

    if-nez v5, :cond_4

    invoke-virtual {v0, p1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_3

    const/16 v6, 0x20

    goto :goto_2

    :cond_3
    const/16 v6, 0x10

    :goto_2
    or-int/2addr v2, v6

    :cond_4
    :goto_3
    and-int/lit8 v6, p5, 0x4

    if-eqz v6, :cond_5

    or-int/lit16 v2, v2, 0x180

    goto :goto_5

    :cond_5
    and-int/lit16 v7, p4, 0x180

    if-nez v7, :cond_7

    invoke-virtual {v0, p2}, Lp1/q;->d(F)Z

    move-result v8

    if-eqz v8, :cond_6

    const/16 v8, 0x100

    goto :goto_4

    :cond_6
    const/16 v8, 0x80

    :goto_4
    or-int/2addr v2, v8

    :cond_7
    :goto_5
    and-int/lit16 v8, v2, 0x93

    const/16 v9, 0x92

    const/4 v10, 0x1

    if-eq v8, v9, :cond_8

    move v8, v10

    goto :goto_6

    :cond_8
    const/4 v8, 0x0

    :goto_6
    and-int/2addr v2, v10

    invoke-virtual {v0, v2, v8}, Lp1/q;->U(IZ)Z

    move-result v2

    if-eqz v2, :cond_c

    if-eqz v3, :cond_9

    sget-object v2, Lb2/t;->w:Lb2/t;

    goto :goto_7

    :cond_9
    move-object v2, p1

    :goto_7
    if-eqz v6, :cond_a

    int-to-float v3, v10

    const/16 v5, 0x8

    int-to-float v5, v5

    mul-float/2addr v3, v5

    goto :goto_8

    :cond_a
    move v3, p2

    :goto_8
    invoke-virtual {p0}, Lv12/c;->a()Ljava/util/List;

    move-result-object v5

    invoke-interface {v5}, Ljava/util/List;->isEmpty()Z

    move-result v5

    if-eqz v5, :cond_b

    invoke-virtual {v0}, Lp1/q;->u()Lp1/v1;

    move-result-object v7

    if-eqz v7, :cond_d

    new-instance v0, Lw12/f;

    const/4 v6, 0x0

    move-object v1, p0

    move v4, p4

    move/from16 v5, p5

    invoke-direct/range {v0 .. v6}, Lw12/f;-><init>(Lv12/c;Landroidx/compose/ui/Modifier;FIII)V

    :goto_9
    iput-object v0, v7, Lp1/v1;->d:Lc93/m;

    return-void

    :cond_b
    invoke-static {}, Lm91/l;->C()Lp1/t1;

    move-result-object v4

    invoke-static {}, Lw12/d;->j()Lm91/p;

    move-result-object v5

    invoke-virtual {v4, v5}, Lp1/t1;->a(Ljava/lang/Object;)Lp1/u1;

    move-result-object v4

    new-instance v5, Lw12/g;

    invoke-direct {v5, v2, v3, p0}, Lw12/g;-><init>(Landroidx/compose/ui/Modifier;FLv12/c;)V

    const v6, -0x52d98749

    invoke-static {v6, v0, v5}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v5

    const/16 v6, 0x38

    invoke-static {v4, v5, v0, v6}, Lp1/x;->a(Lp1/u1;Lc93/m;Landroidx/compose/runtime/Composer;I)V

    goto :goto_a

    :cond_c
    invoke-virtual {v0}, Lp1/q;->X()V

    move-object v2, p1

    move v3, p2

    :goto_a
    invoke-virtual {v0}, Lp1/q;->u()Lp1/v1;

    move-result-object v7

    if-eqz v7, :cond_d

    new-instance v0, Lw12/f;

    const/4 v6, 0x1

    move-object v1, p0

    move v4, p4

    move/from16 v5, p5

    invoke-direct/range {v0 .. v6}, Lw12/f;-><init>(Lv12/c;Landroidx/compose/ui/Modifier;FIII)V

    goto :goto_9

    :cond_d
    return-void
.end method

.method private static final h(Lv12/c;Landroidx/compose/ui/Modifier;FIILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 6

    or-int/lit8 p3, p3, 0x1

    invoke-static {p3}, Lp1/x;->L(I)I

    move-result v4

    move-object v0, p0

    move-object v1, p1

    move v2, p2

    move v5, p4

    move-object v3, p5

    invoke-static/range {v0 .. v5}, Lw12/h;->g(Lv12/c;Landroidx/compose/ui/Modifier;FLandroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final i(Landroidx/compose/ui/Modifier;FLv12/c;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 11

    and-int/lit8 v0, p4, 0x3

    const/4 v1, 0x2

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-eq v0, v1, :cond_0

    move v0, v3

    goto :goto_0

    :cond_0
    move v0, v2

    :goto_0
    and-int/2addr p4, v3

    move-object v8, p3

    check-cast v8, Lp1/q;

    invoke-virtual {v8, p4, v0}, Lp1/q;->U(IZ)Z

    move-result p3

    if-eqz p3, :cond_5

    invoke-static {p1}, Ll0/m;->i(F)Ll0/k;

    move-result-object p1

    sget-object p3, Lb2/e;->M:Lb2/k;

    invoke-static {p1, p3, v8, v2}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object p1

    iget-wide p3, v8, Lp1/q;->T:J

    invoke-static {p3, p4}, Ljava/lang/Long;->hashCode(J)I

    move-result p3

    invoke-virtual {v8}, Lp1/q;->m()Lp1/p1;

    move-result-object p4

    invoke-static {v8, p0}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object p0

    sget-object v0, La3/l;->a:La3/k;

    invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v0, La3/k;->b:La3/j;

    invoke-virtual {v8}, Lp1/q;->i0()V

    iget-boolean v1, v8, Lp1/q;->S:Z

    if-eqz v1, :cond_1

    invoke-virtual {v8, v0}, Lp1/q;->l(Lc93/a;)V

    goto :goto_1

    :cond_1
    invoke-virtual {v8}, Lp1/q;->s0()V

    :goto_1
    sget-object v0, La3/k;->g:La3/i;

    invoke-static {v8, v0, p1}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object p1, La3/k;->f:La3/i;

    invoke-static {v8, p1, p4}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object p1, La3/k;->j:La3/i;

    iget-boolean p4, v8, Lp1/q;->S:Z

    if-nez p4, :cond_2

    invoke-virtual {v8}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object p4

    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p4

    if-nez p4, :cond_3

    :cond_2
    invoke-static {p3, v8, p3, p1}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_3
    sget-object p1, La3/k;->d:La3/i;

    invoke-static {v8, p1, p0}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const p0, 0x4a103077    # 2362397.8f

    invoke-virtual {v8, p0}, Lp1/q;->e0(I)V

    invoke-virtual {p2}, Lv12/c;->a()Ljava/util/List;

    move-result-object p0

    check-cast p0, Ljava/lang/Iterable;

    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p0

    :goto_2
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result p1

    if-eqz p1, :cond_4

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p1

    move-object v4, p1

    check-cast v4, Lm91/u;

    new-instance v6, Lvx0/a;

    const/16 p1, 0xa

    invoke-direct {v6, p1}, Lvx0/a;-><init>(I)V

    const/4 v9, 0x0

    const/16 v10, 0xa

    const/4 v5, 0x0

    const/4 v7, 0x0

    invoke-static/range {v4 .. v10}, Lm91/l;->r(Lm91/u;Lm91/p;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    goto :goto_2

    :cond_4
    invoke-virtual {v8, v2}, Lp1/q;->q(Z)V

    invoke-virtual {v8, v3}, Lp1/q;->q(Z)V

    goto :goto_3

    :cond_5
    invoke-virtual {v8}, Lp1/q;->X()V

    :goto_3
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final j(Lm91/u;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/Modifier;
    .locals 0

    const-string p2, "it"

    invoke-static {p0, p2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Lp1/q;

    const p0, -0x5b9ae0d1

    invoke-virtual {p1, p0}, Lp1/q;->e0(I)V

    sget-object p0, Lb2/t;->w:Lb2/t;

    const/high16 p2, 0x3f800000    # 1.0f

    invoke-static {p2, p0}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object p0

    const/4 p2, 0x0

    invoke-virtual {p1, p2}, Lp1/q;->q(Z)V

    return-object p0
.end method

.method private static final k(Lv12/c;Landroidx/compose/ui/Modifier;FIILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 6

    or-int/lit8 p3, p3, 0x1

    invoke-static {p3}, Lp1/x;->L(I)I

    move-result v4

    move-object v0, p0

    move-object v1, p1

    move v2, p2

    move v5, p4

    move-object v3, p5

    invoke-static/range {v0 .. v5}, Lw12/h;->g(Lv12/c;Landroidx/compose/ui/Modifier;FLandroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final l(Lp1/t2;)Lv12/c;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp1/t2;",
            ")",
            "Lv12/c;"
        }
    .end annotation

    invoke-interface {p0}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lv12/c;

    return-object p0
.end method

.method private static final m(Lcom/whoop/navigation/models/ChatHeaderMetadata;Landroidx/compose/ui/Modifier;IFIILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 7

    or-int/lit8 p4, p4, 0x1

    invoke-static {p4}, Lp1/x;->L(I)I

    move-result v5

    move-object v0, p0

    move-object v1, p1

    move v2, p2

    move v3, p3

    move v6, p5

    move-object v4, p6

    invoke-static/range {v0 .. v6}, Lw12/h;->f(Lcom/whoop/navigation/models/ChatHeaderMetadata;Landroidx/compose/ui/Modifier;IFLandroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method
