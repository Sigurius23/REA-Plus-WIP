.class public abstract Lmh0/i;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u001a5\u0010\u0008\u001a\u00020\u00062\u0008\u0008\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0001\u00a2\u0006\u0004\u0008\u0008\u0010\t\u00a8\u0006\u000c\u00b2\u0006\u000c\u0010\u000b\u001a\u00020\n8\nX\u008a\u0084\u0002"
    }
    d2 = {
        "Landroidx/compose/ui/Modifier;",
        "modifier",
        "Lmh0/h;",
        "itemState",
        "Lkotlin/Function1;",
        "",
        "Ll83/a0;",
        "onViewEvent",
        "c",
        "(Landroidx/compose/ui/Modifier;Lmh0/h;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V",
        "Lmh0/e;",
        "miniArchState",
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
.method public static synthetic a(Landroidx/compose/ui/Modifier;Lmh0/h;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p6}, Lmh0/i;->f(Landroidx/compose/ui/Modifier;Lmh0/h;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lld1/c;Lmh0/h;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lmh0/i;->e(Lld1/c;Lmh0/h;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final c(Landroidx/compose/ui/Modifier;Lmh0/h;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V
    .locals 23
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/ui/Modifier;",
            "Lmh0/h;",
            "Lkotlin/jvm/functions/Function1;",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move/from16 v4, p4

    const-string v0, "itemState"

    invoke-static {v2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onViewEvent"

    invoke-static {v3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v14, p3

    check-cast v14, Lp1/q;

    const v0, -0x1dc8e249

    invoke-virtual {v14, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, p5, 0x1

    if-eqz v0, :cond_0

    or-int/lit8 v1, v4, 0x6

    move v5, v1

    move-object/from16 v1, p0

    goto :goto_1

    :cond_0
    and-int/lit8 v1, v4, 0x6

    if-nez v1, :cond_2

    move-object/from16 v1, p0

    invoke-virtual {v14, v1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_1

    const/4 v5, 0x4

    goto :goto_0

    :cond_1
    const/4 v5, 0x2

    :goto_0
    or-int/2addr v5, v4

    goto :goto_1

    :cond_2
    move-object/from16 v1, p0

    move v5, v4

    :goto_1
    and-int/lit8 v6, v4, 0x30

    if-nez v6, :cond_4

    invoke-virtual {v14, v2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_3

    const/16 v6, 0x20

    goto :goto_2

    :cond_3
    const/16 v6, 0x10

    :goto_2
    or-int/2addr v5, v6

    :cond_4
    and-int/lit16 v6, v4, 0x180

    const/16 v11, 0x100

    if-nez v6, :cond_6

    invoke-virtual {v14, v3}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_5

    move v6, v11

    goto :goto_3

    :cond_5
    const/16 v6, 0x80

    :goto_3
    or-int/2addr v5, v6

    :cond_6
    move v12, v5

    and-int/lit16 v5, v12, 0x93

    const/16 v6, 0x92

    const/4 v13, 0x0

    if-eq v5, v6, :cond_7

    const/4 v5, 0x1

    goto :goto_4

    :cond_7
    move v5, v13

    :goto_4
    and-int/lit8 v6, v12, 0x1

    invoke-virtual {v14, v6, v5}, Lp1/q;->U(IZ)Z

    move-result v5

    if-eqz v5, :cond_1a

    if-eqz v0, :cond_8

    sget-object v0, Lb2/t;->w:Lb2/t;

    goto :goto_5

    :cond_8
    move-object v0, v1

    :goto_5
    new-instance v6, Lmh0/e;

    const/4 v1, 0x0

    const/4 v5, 0x3

    invoke-direct {v6, v13, v1, v5, v1}, Lmh0/e;-><init>(ZLjava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {v2}, Lmh0/h;->f()Lcom/whoop/navigation/models/ApiRequest;

    move-result-object v7

    invoke-virtual {v7}, Lcom/whoop/navigation/models/ApiRequest;->getPath()Ljava/lang/String;

    move-result-object v8

    invoke-static {v8}, Lyb3/r;->i0(Ljava/lang/CharSequence;)Z

    move-result v8

    if-nez v8, :cond_9

    goto :goto_6

    :cond_9
    move-object v7, v1

    :goto_6
    if-eqz v7, :cond_a

    invoke-virtual {v7}, Lcom/whoop/navigation/models/ApiRequest;->getPath()Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v7}, Lcom/whoop/navigation/models/ApiRequest;->getMethod()Lcom/whoop/navigation/models/GenericHttpMethod;

    move-result-object v9

    invoke-virtual {v7}, Lcom/whoop/navigation/models/ApiRequest;->getBody()Lkotlinx/serialization/json/JsonElement;

    move-result-object v7

    new-instance v10, Ljava/lang/StringBuilder;

    invoke-direct {v10}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v10, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v8, ":"

    invoke-virtual {v10, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v10, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    move-object v10, v7

    goto :goto_7

    :cond_a
    move-object v10, v1

    :goto_7
    const v7, 0x51c1188b

    invoke-virtual {v14, v7}, Lp1/q;->e0(I)V

    sget-object v7, Lx81/d;->a:Lx81/d;

    const/4 v8, 0x6

    invoke-virtual {v7, v14, v8}, Lx81/d;->c(Landroidx/compose/runtime/Composer;I)Lcom/whoop/data/repositories/FeatureFlagChecker;

    move-result-object v7

    const-string v8, "safe-design-view-model-injection-android"

    invoke-interface {v7, v8}, Lcom/whoop/data/repositories/FeatureFlagChecker;->isFeatureEnabled(Ljava/lang/String;)Z

    move-result v7

    const-class v8, Lmh0/g;

    sget-object v9, Lp1/l;->a:Lp1/v0;

    const/4 v5, 0x0

    if-nez v7, :cond_11

    const v7, -0x2a32dbfc

    invoke-virtual {v14, v7}, Lp1/q;->e0(I)V

    invoke-static {v14}, Lm8/a;->a(Landroidx/compose/runtime/Composer;)Landroidx/lifecycle/f2;

    move-result-object v17

    if-nez v17, :cond_b

    const v7, -0x2a322beb

    invoke-virtual {v14, v7}, Lp1/q;->e0(I)V

    invoke-virtual {v14, v13}, Lp1/q;->q(Z)V

    move-object v15, v1

    goto :goto_8

    :cond_b
    const v7, -0x2a322bea

    invoke-virtual {v14, v7}, Lp1/q;->e0(I)V

    sget-object v7, Landroidx/compose/ui/platform/AndroidCompositionLocals_androidKt;->b:Lp1/u2;

    invoke-virtual {v14, v7}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Landroid/content/Context;

    invoke-virtual {v7}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v7

    const-string v15, "null cannot be cast to non-null type android.app.Application"

    invoke-static {v7, v15}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v16, v7

    check-cast v16, Landroid/app/Application;

    invoke-virtual {v14, v10}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v7

    invoke-virtual {v14, v6}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v15

    or-int/2addr v7, v15

    invoke-virtual {v14, v5}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v15

    or-int/2addr v7, v15

    invoke-virtual {v14}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v15

    if-nez v7, :cond_c

    if-ne v15, v9, :cond_d

    :cond_c
    sget-object v7, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v7, v8}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v18

    new-instance v7, Lld1/b;

    invoke-direct {v7, v6}, Lld1/b;-><init>(Ljava/lang/Object;)V

    move-object/from16 v19, v5

    move-object/from16 v20, v7

    move-object/from16 v21, v10

    invoke-static/range {v16 .. v21}, Lld1/d;->b(Landroid/app/Application;Landroidx/lifecycle/f2;Lj93/d;Lc93/a;Lld1/c;Ljava/lang/String;)Lld1/c;

    move-result-object v15

    invoke-virtual {v14, v15}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_d
    check-cast v15, Lld1/c;

    invoke-virtual {v14, v13}, Lp1/q;->q(Z)V

    :goto_8
    if-nez v15, :cond_10

    const v7, -0x2a2a887e

    invoke-virtual {v14, v7}, Lp1/q;->e0(I)V

    invoke-virtual {v14, v10}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v7

    invoke-virtual {v14, v6}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v8

    or-int/2addr v7, v8

    invoke-virtual {v14, v5}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v5

    or-int/2addr v5, v7

    invoke-virtual {v14}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v7

    if-nez v5, :cond_e

    if-ne v7, v9, :cond_f

    :cond_e
    new-instance v7, Lld1/b;

    invoke-direct {v7, v6}, Lld1/b;-><init>(Ljava/lang/Object;)V

    invoke-virtual {v14, v7}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_f
    move-object v15, v7

    check-cast v15, Lld1/b;

    invoke-virtual {v14, v13}, Lp1/q;->q(Z)V

    goto :goto_9

    :cond_10
    const v5, -0x1a22aa39

    invoke-virtual {v14, v5}, Lp1/q;->e0(I)V

    invoke-virtual {v14, v13}, Lp1/q;->q(Z)V

    :goto_9
    invoke-virtual {v14, v13}, Lp1/q;->q(Z)V

    invoke-virtual {v14, v13}, Lp1/q;->q(Z)V

    move-object v5, v15

    const/4 v1, 0x3

    move-object v15, v9

    goto :goto_d

    :cond_11
    const v7, -0x2a28ba09

    invoke-static {v14, v7, v13, v14}, Ld;->f(Lp1/q;IZLp1/q;)Landroidx/lifecycle/f2;

    move-result-object v7

    sget-object v15, Landroidx/compose/ui/platform/AndroidCompositionLocals_androidKt;->b:Lp1/u2;

    invoke-virtual {v14, v15}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v15

    check-cast v15, Landroid/content/Context;

    invoke-virtual {v15}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v15

    instance-of v1, v15, Landroid/app/Application;

    if-eqz v1, :cond_12

    check-cast v15, Landroid/app/Application;

    goto :goto_a

    :cond_12
    const/4 v15, 0x0

    :goto_a
    invoke-virtual {v14, v10}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v1

    invoke-virtual {v14, v6}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v17

    or-int v1, v1, v17

    invoke-virtual {v14, v5}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v17

    or-int v1, v1, v17

    invoke-virtual {v14}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    if-nez v1, :cond_14

    if-ne v5, v9, :cond_13

    goto :goto_b

    :cond_13
    move-object v15, v9

    const/4 v1, 0x3

    goto :goto_c

    :cond_14
    :goto_b
    sget-object v1, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v1, v8}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v8

    move-object v5, v7

    move-object v7, v15

    const/4 v1, 0x3

    move-object v15, v9

    const/4 v9, 0x0

    invoke-static/range {v5 .. v10}, Lld1/d;->d(Landroidx/lifecycle/f2;Ljava/lang/Object;Landroid/app/Application;Lj93/d;Lc93/a;Ljava/lang/String;)Lld1/c;

    move-result-object v5

    invoke-virtual {v14, v5}, Lp1/q;->p0(Ljava/lang/Object;)V

    :goto_c
    check-cast v5, Lld1/c;

    invoke-virtual {v14, v13}, Lp1/q;->q(Z)V

    :goto_d
    invoke-virtual {v5}, Lld1/c;->getViewState()Lec3/l;

    move-result-object v7

    const/4 v9, 0x0

    const/4 v10, 0x2

    move-object v8, v5

    move-object v5, v7

    const/4 v7, 0x0

    move-object/from16 v22, v14

    move-object v14, v8

    move-object/from16 v8, v22

    invoke-static/range {v5 .. v10}, Lp1/x;->n(Lec3/l;Ljava/lang/Object;Lq83/j;Landroidx/compose/runtime/Composer;II)Lp1/c1;

    move-result-object v5

    invoke-static {v5}, Lmh0/i;->d(Lp1/t2;)Lmh0/e;

    move-result-object v6

    invoke-virtual {v6}, Lmh0/e;->c()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v8, v5}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v7

    and-int/lit16 v9, v12, 0x380

    if-ne v9, v11, :cond_15

    const/4 v13, 0x1

    :cond_15
    or-int/2addr v7, v13

    invoke-virtual {v8, v14}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v9

    or-int/2addr v7, v9

    invoke-virtual {v8}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v9

    if-nez v7, :cond_16

    if-ne v9, v15, :cond_17

    :cond_16
    new-instance v9, Lmh0/i$a;

    const/4 v7, 0x0

    invoke-direct {v9, v3, v14, v5, v7}, Lmh0/i$a;-><init>(Lkotlin/jvm/functions/Function1;Lld1/c;Lp1/t2;Lq83/d;)V

    invoke-virtual {v8, v9}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_17
    check-cast v9, Lc93/m;

    invoke-static {v8, v9, v6}, Lp1/x;->g(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual {v2}, Lmh0/h;->h()Lcom/whoop/design/util/TextResource;

    move-result-object v6

    invoke-virtual {v2}, Lmh0/h;->c()Lgz0/m0;

    move-result-object v7

    invoke-virtual {v2}, Lmh0/h;->g()Lcom/whoop/design/models/items/ActionButtonStyle;

    move-result-object v9

    move-object v10, v9

    invoke-virtual {v2}, Lmh0/h;->b()Ly81/e;

    move-result-object v9

    move-object v11, v10

    invoke-virtual {v2}, Lmh0/h;->e()Ly81/e;

    move-result-object v10

    move-object v13, v11

    invoke-virtual {v2}, Lmh0/h;->a()Ly81/e;

    move-result-object v11

    invoke-static {v5}, Lmh0/i;->d(Lp1/t2;)Lmh0/e;

    move-result-object v5

    invoke-virtual {v5}, Lmh0/e;->d()Z

    move-result v5

    invoke-virtual {v8, v14}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v16

    invoke-virtual {v8, v2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v17

    or-int v16, v16, v17

    move/from16 p0, v1

    invoke-virtual {v8}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    if-nez v16, :cond_18

    if-ne v1, v15, :cond_19

    :cond_18
    new-instance v1, Ll01/q;

    const/16 v15, 0x1c

    invoke-direct {v1, v15, v14, v2}, Ll01/q;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v8, v1}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_19
    check-cast v1, Lc93/a;

    and-int/lit8 v12, v12, 0xe

    sget v14, Lcom/whoop/design/util/TextResource;->$stable:I

    shl-int/lit8 v14, v14, 0x3

    or-int v15, v12, v14

    const/16 v16, 0x0

    move v12, v5

    move-object v14, v8

    move-object v8, v13

    move-object v5, v0

    move-object v13, v1

    invoke-static/range {v5 .. v16}, Lmh0/d;->c(Landroidx/compose/ui/Modifier;Lcom/whoop/design/util/TextResource;Lgz0/m0;Lcom/whoop/design/models/items/ActionButtonStyle;Ly81/e;Ly81/e;Ly81/e;ZLc93/a;Landroidx/compose/runtime/Composer;II)V

    move-object v8, v14

    move-object v1, v5

    goto :goto_e

    :cond_1a
    move-object v8, v14

    invoke-virtual {v8}, Lp1/q;->X()V

    :goto_e
    invoke-virtual {v8}, Lp1/q;->u()Lp1/v1;

    move-result-object v7

    if-eqz v7, :cond_1b

    new-instance v0, Lm31/h;

    const/4 v6, 0x3

    move/from16 v5, p5

    invoke-direct/range {v0 .. v6}, Lm31/h;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;III)V

    iput-object v0, v7, Lp1/v1;->d:Lc93/m;

    :cond_1b
    return-void
.end method

.method private static final d(Lp1/t2;)Lmh0/e;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp1/t2;",
            ")",
            "Lmh0/e;"
        }
    .end annotation

    invoke-interface {p0}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lmh0/e;

    return-object p0
.end method

.method private static final e(Lld1/c;Lmh0/h;)Ll83/a0;
    .locals 1

    new-instance v0, Lmh0/f$b;

    invoke-virtual {p1}, Lmh0/h;->f()Lcom/whoop/navigation/models/ApiRequest;

    move-result-object p1

    invoke-direct {v0, p1}, Lmh0/f$b;-><init>(Lcom/whoop/navigation/models/ApiRequest;)V

    invoke-virtual {p0, v0}, Lld1/c;->g(Ljava/lang/Object;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final f(Landroidx/compose/ui/Modifier;Lmh0/h;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 6

    or-int/lit8 p3, p3, 0x1

    invoke-static {p3}, Lp1/x;->L(I)I

    move-result v4

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move v5, p4

    move-object v3, p5

    invoke-static/range {v0 .. v5}, Lmh0/i;->c(Landroidx/compose/ui/Modifier;Lmh0/h;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static final synthetic g(Lp1/t2;)Lmh0/e;
    .locals 0

    invoke-static {p0}, Lmh0/i;->d(Lp1/t2;)Lmh0/e;

    move-result-object p0

    return-object p0
.end method
