.class public abstract Lo80/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000B\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u001a\u00b1\u0001\u0010\u0013\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0008\u0012\u0004\u0012\u00020\u00060\u00042\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00060\u00042T\u0010\u0012\u001aP\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u0010\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00060\u0004\u0012\u0004\u0012\u00020\u0011\u0012\u0004\u0012\u00020\u00060\u000cH\u0001\u00a2\u0006\u0004\u0008\u0013\u0010\u0014\u00a8\u0006\u0015"
    }
    d2 = {
        "Lg80/f;",
        "viewState",
        "Lf80/e;",
        "saveCredentialOnAdvance",
        "Lkotlin/Function1;",
        "Lj80/b;",
        "Ll83/a0;",
        "onViewEvent",
        "Ll80/o;",
        "onNavigationEvent",
        "Lh80/b;",
        "onAnalyticsEvent",
        "Lkotlin/Function8;",
        "Lm91/u;",
        "Lp90/e;",
        "Lc31/k;",
        "Lg80/g;",
        "Lcom/whoop/activation/iajf/domain/SignUpSource;",
        "handleProgressButtonClick",
        "d",
        "(Lg80/f;Lf80/e;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lc93/r;Landroidx/compose/runtime/Composer;I)V",
        "activation_release"
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
.method public static synthetic a(Lg80/f;Lf80/e;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lc93/r;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p8}, Lo80/a;->g(Lg80/f;Lf80/e;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lc93/r;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lo80/a;->e(Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lo80/a;->f(Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final d(Lg80/f;Lf80/e;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lc93/r;Landroidx/compose/runtime/Composer;I)V
    .locals 18
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lg80/f;",
            "Lf80/e;",
            "Lkotlin/jvm/functions/Function1;",
            "Lkotlin/jvm/functions/Function1;",
            "Lkotlin/jvm/functions/Function1;",
            "Lc93/r;",
            "Landroidx/compose/runtime/Composer;",
            "I)V"
        }
    .end annotation

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move-object/from16 v4, p3

    move-object/from16 v9, p4

    move-object/from16 v11, p5

    move/from16 v0, p7

    const-string v5, "viewState"

    invoke-static {v1, v5}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v5, "saveCredentialOnAdvance"

    invoke-static {v2, v5}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v5, "onViewEvent"

    invoke-static {v3, v5}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v5, "onNavigationEvent"

    invoke-static {v4, v5}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v5, "onAnalyticsEvent"

    invoke-static {v9, v5}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v5, "handleProgressButtonClick"

    invoke-static {v11, v5}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v12, p6

    check-cast v12, Lp1/q;

    const v5, 0x6fe6fa1

    invoke-virtual {v12, v5}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v5, v0, 0x6

    if-nez v5, :cond_1

    invoke-virtual {v12, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_0

    const/4 v5, 0x4

    goto :goto_0

    :cond_0
    const/4 v5, 0x2

    :goto_0
    or-int/2addr v5, v0

    goto :goto_1

    :cond_1
    move v5, v0

    :goto_1
    and-int/lit8 v6, v0, 0x30

    if-nez v6, :cond_3

    invoke-virtual {v12, v2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_2

    const/16 v6, 0x20

    goto :goto_2

    :cond_2
    const/16 v6, 0x10

    :goto_2
    or-int/2addr v5, v6

    :cond_3
    and-int/lit16 v6, v0, 0x180

    const/16 v7, 0x100

    if-nez v6, :cond_5

    invoke-virtual {v12, v3}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_4

    move v6, v7

    goto :goto_3

    :cond_4
    const/16 v6, 0x80

    :goto_3
    or-int/2addr v5, v6

    :cond_5
    and-int/lit16 v6, v0, 0xc00

    if-nez v6, :cond_7

    invoke-virtual {v12, v4}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_6

    const/16 v6, 0x800

    goto :goto_4

    :cond_6
    const/16 v6, 0x400

    :goto_4
    or-int/2addr v5, v6

    :cond_7
    and-int/lit16 v6, v0, 0x6000

    if-nez v6, :cond_9

    invoke-virtual {v12, v9}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_8

    const/16 v6, 0x4000

    goto :goto_5

    :cond_8
    const/16 v6, 0x2000

    :goto_5
    or-int/2addr v5, v6

    :cond_9
    const/high16 v6, 0x30000

    and-int/2addr v6, v0

    if-nez v6, :cond_b

    invoke-virtual {v12, v11}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_a

    const/high16 v6, 0x20000

    goto :goto_6

    :cond_a
    const/high16 v6, 0x10000

    :goto_6
    or-int/2addr v5, v6

    :cond_b
    const v6, 0x12493

    and-int/2addr v6, v5

    const v8, 0x12492

    const/4 v15, 0x0

    if-eq v6, v8, :cond_c

    const/4 v6, 0x1

    goto :goto_7

    :cond_c
    move v6, v15

    :goto_7
    and-int/lit8 v8, v5, 0x1

    invoke-virtual {v12, v8, v6}, Lp1/q;->U(IZ)Z

    move-result v6

    if-eqz v6, :cond_1e

    invoke-virtual {v1}, Lg80/f;->a()Lg80/d;

    move-result-object v6

    const-string v8, "activation_account_creation"

    const/16 v13, 0x30

    invoke-static {v6, v8, v12, v13}, Lfy1/j;->c(Lfy1/k;Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V

    sget-object v6, Landroidx/compose/ui/platform/AndroidCompositionLocals_androidKt;->b:Lp1/u2;

    invoke-virtual {v12, v6}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Landroid/content/Context;

    sget-object v8, Lb3/v1;->p:Lp1/u2;

    invoke-virtual {v12, v8}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lb3/x2;

    invoke-static {v12, v15}, Lk80/s;->g(Landroidx/compose/runtime/Composer;I)Z

    move-result v14

    and-int/lit16 v10, v5, 0x380

    if-ne v10, v7, :cond_d

    const/16 v16, 0x1

    goto :goto_8

    :cond_d
    move/from16 v16, v15

    :goto_8
    invoke-virtual {v12, v14}, Lp1/q;->h(Z)Z

    move-result v17

    or-int v16, v16, v17

    invoke-virtual {v12, v8}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v17

    or-int v16, v16, v17

    move/from16 v17, v13

    invoke-virtual {v12}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v13

    const/4 v7, 0x0

    sget-object v15, Lp1/l;->a:Lp1/v0;

    if-nez v16, :cond_e

    if-ne v13, v15, :cond_f

    :cond_e
    new-instance v13, Lo80/a$a;

    invoke-direct {v13, v3, v14, v8, v7}, Lo80/a$a;-><init>(Lkotlin/jvm/functions/Function1;ZLb3/x2;Lq83/d;)V

    invoke-virtual {v12, v13}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_f
    check-cast v13, Lc93/m;

    sget-object v8, Ll83/a0;->a:Ll83/a0;

    invoke-static {v12, v13, v8}, Lp1/x;->g(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual {v1}, Lg80/f;->a()Lg80/d;

    move-result-object v8

    invoke-virtual {v8}, Lg80/d;->b()Lg80/g;

    move-result-object v8

    if-eqz v8, :cond_10

    invoke-virtual {v8}, Lg80/g;->g()Lc31/k;

    move-result-object v8

    if-eqz v8, :cond_10

    invoke-virtual {v8}, Lc31/k;->p()Lc31/d;

    move-result-object v8

    goto :goto_9

    :cond_10
    move-object v8, v7

    :goto_9
    sget-object v13, Lc31/d;->LOADING:Lc31/d;

    if-ne v8, v13, :cond_11

    const v8, -0x1cecd1e4

    invoke-virtual {v12, v8}, Lp1/q;->e0(I)V

    const/4 v8, 0x0

    invoke-static {v12, v8}, Lk80/s;->c(Landroidx/compose/runtime/Composer;I)V

    invoke-virtual {v12, v8}, Lp1/q;->q(Z)V

    goto :goto_a

    :cond_11
    const/4 v8, 0x0

    const v13, -0x1cec46ff

    invoke-virtual {v12, v13}, Lp1/q;->e0(I)V

    invoke-virtual {v12, v8}, Lp1/q;->q(Z)V

    :goto_a
    invoke-virtual {v1}, Lg80/f;->a()Lg80/d;

    move-result-object v8

    invoke-virtual {v8}, Lg80/d;->d()Z

    move-result v8

    if-eqz v8, :cond_18

    const v5, -0x1ceb226f

    invoke-virtual {v12, v5}, Lp1/q;->e0(I)V

    const/16 v5, 0x100

    if-ne v10, v5, :cond_12

    const/4 v5, 0x1

    goto :goto_b

    :cond_12
    const/4 v5, 0x0

    :goto_b
    invoke-virtual {v12}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v6

    if-nez v5, :cond_13

    if-ne v6, v15, :cond_14

    :cond_13
    new-instance v6, Lnw0/n;

    const/16 v5, 0xa

    invoke-direct {v6, v3, v5}, Lnw0/n;-><init>(Lkotlin/jvm/functions/Function1;I)V

    invoke-virtual {v12, v6}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_14
    check-cast v6, Lc93/a;

    const/16 v5, 0x100

    if-ne v10, v5, :cond_15

    const/4 v10, 0x1

    goto :goto_c

    :cond_15
    const/4 v10, 0x0

    :goto_c
    invoke-virtual {v12}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    if-nez v10, :cond_16

    if-ne v5, v15, :cond_17

    :cond_16
    new-instance v5, Lnw0/n;

    const/16 v7, 0xb

    invoke-direct {v5, v3, v7}, Lnw0/n;-><init>(Lkotlin/jvm/functions/Function1;I)V

    invoke-virtual {v12, v5}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_17
    check-cast v5, Lc93/a;

    const/4 v8, 0x0

    invoke-static {v6, v5, v12, v8}, Lk80/o;->b(Lc93/a;Lc93/a;Landroidx/compose/runtime/Composer;I)V

    invoke-virtual {v12, v8}, Lp1/q;->q(Z)V

    goto/16 :goto_e

    :cond_18
    const/4 v8, 0x0

    invoke-virtual {v1}, Lg80/f;->a()Lg80/d;

    move-result-object v10

    invoke-virtual {v10}, Lg80/d;->e()Z

    move-result v10

    if-eqz v10, :cond_19

    const v5, -0x1ce6b0c2

    invoke-virtual {v12, v5}, Lp1/q;->e0(I)V

    invoke-static {v12, v8}, Lk80/s;->c(Landroidx/compose/runtime/Composer;I)V

    invoke-static {v12, v8}, Lk80/r;->b(Landroidx/compose/runtime/Composer;I)V

    invoke-virtual {v12, v8}, Lp1/q;->q(Z)V

    goto/16 :goto_e

    :cond_19
    invoke-virtual {v1}, Lg80/f;->a()Lg80/d;

    move-result-object v8

    invoke-virtual {v8}, Lg80/d;->b()Lg80/g;

    move-result-object v8

    if-eqz v8, :cond_1a

    invoke-virtual {v8}, Lg80/g;->h()Ljava/util/List;

    move-result-object v8

    goto :goto_d

    :cond_1a
    move-object v8, v7

    :goto_d
    if-eqz v8, :cond_1d

    const v8, -0x1ce4229c

    invoke-virtual {v12, v8}, Lp1/q;->e0(I)V

    invoke-virtual {v1}, Lg80/f;->a()Lg80/d;

    move-result-object v8

    invoke-virtual {v8}, Lg80/d;->b()Lg80/g;

    move-result-object v8

    sget-object v4, Lcom/whoop/activation/view/navigation/ActivationFlowDestination;->ACCOUNT_CREATION:Lcom/whoop/activation/view/navigation/ActivationFlowDestination;

    invoke-virtual {v12, v2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v10

    invoke-virtual {v12, v6}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v13

    or-int/2addr v10, v13

    invoke-virtual {v12}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v13

    if-nez v10, :cond_1b

    if-ne v13, v15, :cond_1c

    :cond_1b
    new-instance v13, Lo80/a$b;

    invoke-direct {v13, v2, v6, v7}, Lo80/a$b;-><init>(Lf80/e;Landroid/content/Context;Lq83/d;)V

    invoke-virtual {v12, v13}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_1c
    move-object v10, v13

    check-cast v10, Lkotlin/jvm/functions/Function3;

    shl-int/lit8 v6, v5, 0x3

    and-int/lit16 v7, v6, 0x1c00

    or-int/lit8 v7, v7, 0x30

    const v13, 0xe000

    and-int/2addr v6, v13

    or-int/2addr v6, v7

    const/high16 v7, 0x380000

    shl-int/lit8 v13, v5, 0x6

    and-int/2addr v7, v13

    or-int/2addr v6, v7

    shl-int/lit8 v5, v5, 0x9

    const/high16 v7, 0xe000000

    and-int/2addr v5, v7

    or-int v13, v6, v5

    const/16 v14, 0x24

    const/4 v5, 0x0

    move-object v3, v8

    const/4 v8, 0x0

    move-object/from16 v6, p2

    move-object/from16 v7, p3

    invoke-static/range {v3 .. v14}, Lq80/i;->m(Lg80/g;Lcom/whoop/activation/view/navigation/ActivationFlowDestination;Lcom/whoop/activation/iajf/domain/SignUpSource;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function3;Lc93/r;Landroidx/compose/runtime/Composer;II)V

    const/4 v8, 0x0

    invoke-virtual {v12, v8}, Lp1/q;->q(Z)V

    goto :goto_e

    :cond_1d
    const/4 v8, 0x0

    const v3, -0x1cd8d39f

    invoke-virtual {v12, v3}, Lp1/q;->e0(I)V

    invoke-virtual {v12, v8}, Lp1/q;->q(Z)V

    goto :goto_e

    :cond_1e
    invoke-virtual {v12}, Lp1/q;->X()V

    :goto_e
    invoke-virtual {v12}, Lp1/q;->u()Lp1/v1;

    move-result-object v8

    if-eqz v8, :cond_1f

    new-instance v0, Lbe1/f;

    move-object/from16 v3, p2

    move-object/from16 v4, p3

    move-object/from16 v5, p4

    move-object/from16 v6, p5

    move/from16 v7, p7

    invoke-direct/range {v0 .. v7}, Lbe1/f;-><init>(Lg80/f;Lf80/e;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lc93/r;I)V

    iput-object v0, v8, Lp1/v1;->d:Lc93/m;

    :cond_1f
    return-void
.end method

.method private static final e(Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 1

    sget-object v0, Lj80/a$i;->a:Lj80/a$i;

    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final f(Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 1

    sget-object v0, Lj80/a$i;->a:Lj80/a$i;

    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final g(Lg80/f;Lf80/e;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lc93/r;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 8

    or-int/lit8 p6, p6, 0x1

    invoke-static {p6}, Lp1/x;->L(I)I

    move-result v7

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    move-object v5, p5

    move-object v6, p7

    invoke-static/range {v0 .. v7}, Lo80/a;->d(Lg80/f;Lf80/e;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lc93/r;Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method
