.class public abstract Li31/h;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u001a5\u0010\u0008\u001a\u00020\u00062\u0008\u0008\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0001\u00a2\u0006\u0004\u0008\u0008\u0010\t\u001a%\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\n2\u000c\u0010\r\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u000cH\u0003\u00a2\u0006\u0004\u0008\u000e\u0010\u000f\u00a8\u0006\u0012\u00b2\u0006\u000c\u0010\u0011\u001a\u00020\u00108\nX\u008a\u0084\u0002"
    }
    d2 = {
        "Landroidx/compose/ui/Modifier;",
        "modifier",
        "Li31/g;",
        "itemState",
        "Lkotlin/Function1;",
        "",
        "Ll83/a0;",
        "onViewEvent",
        "i",
        "(Landroidx/compose/ui/Modifier;Li31/g;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V",
        "",
        "showError",
        "Lkotlin/Function0;",
        "onShown",
        "g",
        "(ZLc93/a;Landroidx/compose/runtime/Composer;I)V",
        "Li31/d;",
        "viewState",
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
.method public static synthetic a(Landroidx/compose/ui/Modifier;Li31/g;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p6}, Li31/h;->j(Landroidx/compose/ui/Modifier;Li31/g;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lc93/a;ZLandroidx/compose/runtime/Composer;II)Ll83/a0;
    .locals 0

    invoke-static {p1, p0, p3, p2, p4}, Li31/h;->h(ZLc93/a;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Li31/g;)Luf3/a;
    .locals 0

    invoke-static {p0}, Li31/h;->k(Li31/g;)Luf3/a;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Landroidx/compose/ui/Modifier;Li31/g;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p6}, Li31/h;->o(Landroidx/compose/ui/Modifier;Li31/g;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic e(Lld1/c;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Li31/h;->m(Lld1/c;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic f(Lkotlin/jvm/functions/Function1;Lld1/c;Ljava/lang/Object;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, Li31/h;->n(Lkotlin/jvm/functions/Function1;Lld1/c;Ljava/lang/Object;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method private static final g(ZLc93/a;Landroidx/compose/runtime/Composer;I)V
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z",
            "Lc93/a;",
            "Landroidx/compose/runtime/Composer;",
            "I)V"
        }
    .end annotation

    check-cast p2, Lp1/q;

    const v0, -0x73532371

    invoke-virtual {p2, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, p3, 0x6

    if-nez v0, :cond_1

    invoke-virtual {p2, p0}, Lp1/q;->h(Z)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x4

    goto :goto_0

    :cond_0
    const/4 v0, 0x2

    :goto_0
    or-int/2addr v0, p3

    goto :goto_1

    :cond_1
    move v0, p3

    :goto_1
    and-int/lit8 v1, p3, 0x30

    const/16 v2, 0x20

    if-nez v1, :cond_3

    invoke-virtual {p2, p1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_2

    move v1, v2

    goto :goto_2

    :cond_2
    const/16 v1, 0x10

    :goto_2
    or-int/2addr v0, v1

    :cond_3
    and-int/lit8 v1, v0, 0x13

    const/16 v3, 0x12

    const/4 v4, 0x1

    const/4 v5, 0x0

    if-eq v1, v3, :cond_4

    move v1, v4

    goto :goto_3

    :cond_4
    move v1, v5

    :goto_3
    and-int/lit8 v3, v0, 0x1

    invoke-virtual {p2, v3, v1}, Lp1/q;->U(IZ)Z

    move-result v1

    if-eqz v1, :cond_9

    sget-object v1, Landroidx/compose/ui/platform/AndroidCompositionLocals_androidKt;->b:Lp1/u2;

    invoke-virtual {p2, v1}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Landroid/content/Context;

    sget v3, Lgy0/f;->f2:I

    invoke-static {p2, v3}, Lq83/g;->Y(Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v3

    if-eqz p0, :cond_8

    const v6, -0x77e63b1a

    invoke-virtual {p2, v6}, Lp1/q;->e0(I)V

    invoke-virtual {p2, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v6

    invoke-virtual {p2, v3}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v7

    or-int/2addr v6, v7

    and-int/lit8 v0, v0, 0x70

    if-ne v0, v2, :cond_5

    goto :goto_4

    :cond_5
    move v4, v5

    :goto_4
    or-int v0, v6, v4

    invoke-virtual {p2}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    if-nez v0, :cond_6

    sget-object v0, Lp1/l;->a:Lp1/v0;

    if-ne v2, v0, :cond_7

    :cond_6
    new-instance v2, Li31/h$a;

    const/4 v0, 0x0

    invoke-direct {v2, v1, v3, p1, v0}, Li31/h$a;-><init>(Landroid/content/Context;Ljava/lang/String;Lc93/a;Lq83/d;)V

    invoke-virtual {p2, v2}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_7
    check-cast v2, Lc93/m;

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    invoke-static {p2, v2, v0}, Lp1/x;->g(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual {p2, v5}, Lp1/q;->q(Z)V

    goto :goto_5

    :cond_8
    const v0, -0x77e429cd

    invoke-virtual {p2, v0}, Lp1/q;->e0(I)V

    invoke-virtual {p2, v5}, Lp1/q;->q(Z)V

    goto :goto_5

    :cond_9
    invoke-virtual {p2}, Lp1/q;->X()V

    :goto_5
    invoke-virtual {p2}, Lp1/q;->u()Lp1/v1;

    move-result-object p2

    if-eqz p2, :cond_a

    new-instance v0, La41/j;

    const/4 v1, 0x4

    invoke-direct {v0, p0, p1, p3, v1}, La41/j;-><init>(ZLc93/a;II)V

    iput-object v0, p2, Lp1/v1;->d:Lc93/m;

    :cond_a
    return-void
.end method

.method private static final h(ZLc93/a;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, Lp1/x;->L(I)I

    move-result p2

    invoke-static {p0, p1, p3, p2}, Li31/h;->g(ZLc93/a;Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static final i(Landroidx/compose/ui/Modifier;Li31/g;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V
    .locals 22
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/ui/Modifier;",
            "Li31/g;",
            "Lkotlin/jvm/functions/Function1;",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move/from16 v6, p4

    const-string v0, "itemState"

    invoke-static {v2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onViewEvent"

    invoke-static {v3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v10, p3

    check-cast v10, Lp1/q;

    const v0, -0x268a37a3

    invoke-virtual {v10, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, p5, 0x1

    const/4 v1, 0x2

    if-eqz v0, :cond_0

    or-int/lit8 v4, v6, 0x6

    move v5, v4

    move-object/from16 v4, p0

    goto :goto_1

    :cond_0
    and-int/lit8 v4, v6, 0x6

    if-nez v4, :cond_2

    move-object/from16 v4, p0

    invoke-virtual {v10, v4}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_1

    const/4 v5, 0x4

    goto :goto_0

    :cond_1
    move v5, v1

    :goto_0
    or-int/2addr v5, v6

    goto :goto_1

    :cond_2
    move-object/from16 v4, p0

    move v5, v6

    :goto_1
    and-int/lit8 v7, v6, 0x30

    if-nez v7, :cond_4

    invoke-virtual {v10, v2}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_3

    const/16 v7, 0x20

    goto :goto_2

    :cond_3
    const/16 v7, 0x10

    :goto_2
    or-int/2addr v5, v7

    :cond_4
    and-int/lit16 v7, v6, 0x180

    const/16 v13, 0x100

    if-nez v7, :cond_6

    invoke-virtual {v10, v3}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_5

    move v7, v13

    goto :goto_3

    :cond_5
    const/16 v7, 0x80

    :goto_3
    or-int/2addr v5, v7

    :cond_6
    and-int/lit16 v7, v5, 0x93

    const/16 v8, 0x92

    const/4 v14, 0x0

    const/4 v15, 0x1

    if-eq v7, v8, :cond_7

    move v7, v15

    goto :goto_4

    :cond_7
    move v7, v14

    :goto_4
    and-int/lit8 v8, v5, 0x1

    invoke-virtual {v10, v8, v7}, Lp1/q;->U(IZ)Z

    move-result v7

    if-eqz v7, :cond_1d

    if-eqz v0, :cond_8

    sget-object v0, Lb2/t;->w:Lb2/t;

    goto :goto_5

    :cond_8
    move-object v0, v4

    :goto_5
    invoke-virtual {v2}, Li31/g;->getId()Ljava/lang/String;

    move-result-object v4

    const/4 v7, 0x0

    if-eqz v4, :cond_9

    invoke-static {v4}, Lyb3/r;->i0(Ljava/lang/CharSequence;)Z

    move-result v8

    if-nez v8, :cond_9

    goto :goto_6

    :cond_9
    move-object v4, v7

    :goto_6
    sget-object v8, Lb3/k2;->a:Lp1/u2;

    invoke-virtual {v10, v8}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Ljava/lang/Boolean;

    invoke-virtual {v8}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v8

    const/4 v9, 0x6

    if-nez v8, :cond_a

    if-nez v4, :cond_b

    :cond_a
    move-object v1, v0

    move/from16 p3, v9

    goto/16 :goto_e

    :cond_b
    const v8, 0x11855e05

    invoke-virtual {v10, v8}, Lp1/q;->e0(I)V

    invoke-virtual {v10, v14}, Lp1/q;->q(Z)V

    new-instance v8, Li31/d;

    invoke-direct {v8, v2, v14, v1, v7}, Li31/d;-><init>(Li31/g;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {v10, v4}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v1

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v11

    sget-object v12, Lp1/l;->a:Lp1/v0;

    if-nez v1, :cond_c

    if-ne v11, v12, :cond_d

    :cond_c
    new-instance v11, Lh02/n0;

    const/16 v1, 0xd

    invoke-direct {v11, v2, v1}, Lh02/n0;-><init>(Ljava/lang/Object;I)V

    invoke-virtual {v10, v11}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_d
    check-cast v11, Lc93/a;

    const-string v1, "recommendation-header:"

    invoke-virtual {v1, v4}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v1

    const v4, 0x51c1188b

    invoke-virtual {v10, v4}, Lp1/q;->e0(I)V

    sget-object v4, Lx81/d;->a:Lx81/d;

    invoke-virtual {v4, v10, v9}, Lx81/d;->c(Landroidx/compose/runtime/Composer;I)Lcom/whoop/data/repositories/FeatureFlagChecker;

    move-result-object v4

    const-string v7, "safe-design-view-model-injection-android"

    invoke-interface {v4, v7}, Lcom/whoop/data/repositories/FeatureFlagChecker;->isFeatureEnabled(Ljava/lang/String;)Z

    move-result v4

    const-class v7, Li31/f;

    if-nez v4, :cond_14

    const v4, -0x2a32dbfc

    invoke-virtual {v10, v4}, Lp1/q;->e0(I)V

    invoke-static {v10}, Lm8/a;->a(Landroidx/compose/runtime/Composer;)Landroidx/lifecycle/f2;

    move-result-object v17

    if-nez v17, :cond_e

    const v4, -0x2a322beb

    invoke-virtual {v10, v4}, Lp1/q;->e0(I)V

    invoke-virtual {v10, v14}, Lp1/q;->q(Z)V

    const/4 v7, 0x0

    goto :goto_7

    :cond_e
    const v4, -0x2a322bea

    invoke-virtual {v10, v4}, Lp1/q;->e0(I)V

    sget-object v4, Landroidx/compose/ui/platform/AndroidCompositionLocals_androidKt;->b:Lp1/u2;

    invoke-virtual {v10, v4}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Landroid/content/Context;

    invoke-virtual {v4}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v4

    const-string v9, "null cannot be cast to non-null type android.app.Application"

    invoke-static {v4, v9}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v16, v4

    check-cast v16, Landroid/app/Application;

    invoke-virtual {v10, v1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v4

    invoke-virtual {v10, v8}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v9

    or-int/2addr v4, v9

    invoke-virtual {v10, v11}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v9

    or-int/2addr v4, v9

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v9

    if-nez v4, :cond_f

    if-ne v9, v12, :cond_10

    :cond_f
    sget-object v4, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v4, v7}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v18

    new-instance v4, Lld1/b;

    invoke-direct {v4, v8}, Lld1/b;-><init>(Ljava/lang/Object;)V

    move-object/from16 v21, v1

    move-object/from16 v20, v4

    move-object/from16 v19, v11

    invoke-static/range {v16 .. v21}, Lld1/d;->b(Landroid/app/Application;Landroidx/lifecycle/f2;Lj93/d;Lc93/a;Lld1/c;Ljava/lang/String;)Lld1/c;

    move-result-object v9

    invoke-virtual {v10, v9}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_10
    move-object v7, v9

    check-cast v7, Lld1/c;

    invoke-virtual {v10, v14}, Lp1/q;->q(Z)V

    :goto_7
    if-nez v7, :cond_13

    const v4, -0x2a2a887e

    invoke-virtual {v10, v4}, Lp1/q;->e0(I)V

    invoke-virtual {v10, v1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v1

    invoke-virtual {v10, v8}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v4

    or-int/2addr v1, v4

    invoke-virtual {v10, v11}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v4

    or-int/2addr v1, v4

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    if-nez v1, :cond_11

    if-ne v4, v12, :cond_12

    :cond_11
    new-instance v4, Lld1/b;

    invoke-direct {v4, v8}, Lld1/b;-><init>(Ljava/lang/Object;)V

    invoke-virtual {v10, v4}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_12
    move-object v7, v4

    check-cast v7, Lld1/b;

    invoke-virtual {v10, v14}, Lp1/q;->q(Z)V

    goto :goto_8

    :cond_13
    const v1, -0x1a22aa39

    invoke-virtual {v10, v1}, Lp1/q;->e0(I)V

    invoke-virtual {v10, v14}, Lp1/q;->q(Z)V

    :goto_8
    invoke-virtual {v10, v14}, Lp1/q;->q(Z)V

    invoke-virtual {v10, v14}, Lp1/q;->q(Z)V

    move-object/from16 v17, v8

    :goto_9
    move-object v1, v7

    goto :goto_d

    :cond_14
    const v4, -0x2a28ba09

    invoke-static {v10, v4, v14, v10}, Ld;->f(Lp1/q;IZLp1/q;)Landroidx/lifecycle/f2;

    move-result-object v16

    sget-object v4, Landroidx/compose/ui/platform/AndroidCompositionLocals_androidKt;->b:Lp1/u2;

    invoke-virtual {v10, v4}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Landroid/content/Context;

    invoke-virtual {v4}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v4

    instance-of v9, v4, Landroid/app/Application;

    if-eqz v9, :cond_15

    check-cast v4, Landroid/app/Application;

    move-object/from16 v18, v4

    goto :goto_a

    :cond_15
    const/16 v18, 0x0

    :goto_a
    invoke-virtual {v10, v1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v4

    invoke-virtual {v10, v8}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v9

    or-int/2addr v4, v9

    invoke-virtual {v10, v11}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v9

    or-int/2addr v4, v9

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v9

    if-nez v4, :cond_17

    if-ne v9, v12, :cond_16

    goto :goto_b

    :cond_16
    move-object/from16 v17, v8

    goto :goto_c

    :cond_17
    :goto_b
    sget-object v4, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v4, v7}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v19

    move-object/from16 v21, v1

    move-object/from16 v17, v8

    move-object/from16 v20, v11

    invoke-static/range {v16 .. v21}, Lld1/d;->d(Landroidx/lifecycle/f2;Ljava/lang/Object;Landroid/app/Application;Lj93/d;Lc93/a;Ljava/lang/String;)Lld1/c;

    move-result-object v9

    invoke-virtual {v10, v9}, Lp1/q;->p0(Ljava/lang/Object;)V

    :goto_c
    move-object v7, v9

    check-cast v7, Lld1/c;

    invoke-virtual {v10, v14}, Lp1/q;->q(Z)V

    goto :goto_9

    :goto_d
    invoke-virtual {v1}, Lld1/c;->getViewState()Lec3/l;

    move-result-object v7

    const/4 v11, 0x0

    move-object v4, v12

    const/4 v12, 0x2

    const/4 v9, 0x0

    move-object/from16 v8, v17

    const/16 p3, 0x6

    invoke-static/range {v7 .. v12}, Lp1/x;->n(Lec3/l;Ljava/lang/Object;Lq83/j;Landroidx/compose/runtime/Composer;II)Lp1/c1;

    move-result-object v7

    invoke-static {v7}, Li31/h;->l(Lp1/t2;)Li31/d;

    move-result-object v8

    invoke-virtual {v8}, Li31/d;->b()Z

    move-result v8

    invoke-virtual {v10, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v9

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v11

    if-nez v9, :cond_18

    if-ne v11, v4, :cond_19

    :cond_18
    new-instance v11, Lh31/r;

    const/4 v9, 0x1

    invoke-direct {v11, v1, v9}, Lh31/r;-><init>(Lld1/c;I)V

    invoke-virtual {v10, v11}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_19
    check-cast v11, Lc93/a;

    invoke-static {v8, v11, v10, v14}, Li31/h;->g(ZLc93/a;Landroidx/compose/runtime/Composer;I)V

    invoke-static {v7}, Li31/h;->l(Lp1/t2;)Li31/d;

    move-result-object v7

    invoke-virtual {v7}, Li31/d;->a()Li31/g;

    move-result-object v7

    and-int/lit16 v8, v5, 0x380

    if-ne v8, v13, :cond_1a

    move v14, v15

    :cond_1a
    invoke-virtual {v10, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v8

    or-int/2addr v8, v14

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v9

    if-nez v8, :cond_1b

    if-ne v9, v4, :cond_1c

    :cond_1b
    new-instance v9, Lb03/b;

    const/4 v4, 0x3

    invoke-direct {v9, v3, v1, v4}, Lb03/b;-><init>(Lkotlin/jvm/functions/Function1;Lld1/c;I)V

    invoke-virtual {v10, v9}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_1c
    move-object v8, v9

    check-cast v8, Lkotlin/jvm/functions/Function1;

    shl-int/lit8 v1, v5, 0x6

    and-int/lit16 v11, v1, 0x380

    const/4 v12, 0x0

    move-object v9, v0

    invoke-static/range {v7 .. v12}, Li31/c;->h(Li31/g;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V

    move-object v1, v9

    goto :goto_10

    :goto_e
    const v0, 0x11838507

    invoke-virtual {v10, v0}, Lp1/q;->e0(I)V

    shr-int/lit8 v0, v5, 0x3

    and-int/lit8 v0, v0, 0x7e

    shl-int/lit8 v4, v5, 0x6

    and-int/lit16 v4, v4, 0x380

    or-int/2addr v4, v0

    const/4 v5, 0x0

    move-object v0, v2

    move-object v2, v1

    move-object v1, v3

    move-object v3, v10

    invoke-static/range {v0 .. v5}, Li31/c;->h(Li31/g;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V

    move-object v1, v2

    invoke-virtual {v10, v14}, Lp1/q;->q(Z)V

    invoke-virtual {v10}, Lp1/q;->u()Lp1/v1;

    move-result-object v7

    if-eqz v7, :cond_1e

    new-instance v0, Li31/b;

    const/4 v6, 0x1

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move/from16 v4, p4

    move/from16 v5, p5

    invoke-direct/range {v0 .. v6}, Li31/b;-><init>(Landroidx/compose/ui/Modifier;Li31/g;Lkotlin/jvm/functions/Function1;III)V

    :goto_f
    iput-object v0, v7, Lp1/v1;->d:Lc93/m;

    return-void

    :cond_1d
    invoke-virtual {v10}, Lp1/q;->X()V

    move-object v1, v4

    :goto_10
    invoke-virtual {v10}, Lp1/q;->u()Lp1/v1;

    move-result-object v7

    if-eqz v7, :cond_1e

    new-instance v0, Li31/b;

    const/4 v6, 0x2

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move/from16 v4, p4

    move/from16 v5, p5

    invoke-direct/range {v0 .. v6}, Li31/b;-><init>(Landroidx/compose/ui/Modifier;Li31/g;Lkotlin/jvm/functions/Function1;III)V

    goto :goto_f

    :cond_1e
    return-void
.end method

.method private static final j(Landroidx/compose/ui/Modifier;Li31/g;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 6

    or-int/lit8 p3, p3, 0x1

    invoke-static {p3}, Lp1/x;->L(I)I

    move-result v4

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move v5, p4

    move-object v3, p5

    invoke-static/range {v0 .. v5}, Li31/h;->i(Landroidx/compose/ui/Modifier;Li31/g;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final k(Li31/g;)Luf3/a;
    .locals 0

    filled-new-array {p0}, [Ljava/lang/Object;

    move-result-object p0

    invoke-static {p0}, Lge3/g;->K([Ljava/lang/Object;)Luf3/a;

    move-result-object p0

    return-object p0
.end method

.method private static final l(Lp1/t2;)Li31/d;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp1/t2;",
            ")",
            "Li31/d;"
        }
    .end annotation

    invoke-interface {p0}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Li31/d;

    return-object p0
.end method

.method private static final m(Lld1/c;)Ll83/a0;
    .locals 1

    sget-object v0, Li31/e$b;->a:Li31/e$b;

    invoke-virtual {p0, v0}, Lld1/c;->g(Ljava/lang/Object;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final n(Lkotlin/jvm/functions/Function1;Lld1/c;Ljava/lang/Object;)Ll83/a0;
    .locals 1

    const-string v0, "event"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p2}, Lh31/t;->d(Ljava/lang/Object;)Lcom/whoop/whoopaction/domain/models/UpdateAction;

    move-result-object v0

    if-nez v0, :cond_0

    invoke-interface {p0, p2}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_0
    new-instance p0, Li31/e$a;

    invoke-direct {p0, v0}, Li31/e$a;-><init>(Lcom/whoop/whoopaction/domain/models/UpdateAction;)V

    invoke-virtual {p1, p0}, Lld1/c;->g(Ljava/lang/Object;)V

    :goto_0
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final o(Landroidx/compose/ui/Modifier;Li31/g;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 6

    or-int/lit8 p3, p3, 0x1

    invoke-static {p3}, Lp1/x;->L(I)I

    move-result v4

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move v5, p4

    move-object v3, p5

    invoke-static/range {v0 .. v5}, Li31/h;->i(Landroidx/compose/ui/Modifier;Li31/g;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method
