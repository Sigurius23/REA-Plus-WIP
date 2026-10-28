.class public abstract Lq90/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000<\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u001a\u00a9\u0001\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00040\u00022\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0008\u0012\u0004\u0012\u00020\u00040\u00022T\u0010\u0010\u001aP\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000c\u0012\u0004\u0012\u00020\u000c\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0008\u0012\u0004\u0012\u00020\u00040\u0002\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00040\nH\u0001\u00a2\u0006\u0004\u0008\u0011\u0010\u0012\u00a8\u0006\u0013"
    }
    d2 = {
        "Lg80/f;",
        "viewState",
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
        "(Lg80/f;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lc93/r;Landroidx/compose/runtime/Composer;I)V",
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
.method public static synthetic a(Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lq90/a;->e(Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lq90/a;->f(Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Lg80/f;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lc93/r;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p7}, Lq90/a;->g(Lg80/f;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lc93/r;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final d(Lg80/f;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lc93/r;Landroidx/compose/runtime/Composer;I)V
    .locals 17
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lg80/f;",
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

    move-object/from16 v10, p4

    move/from16 v0, p6

    const-string v5, "viewState"

    invoke-static {v1, v5}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v5, "onViewEvent"

    invoke-static {v2, v5}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v5, "onNavigationEvent"

    invoke-static {v3, v5}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v5, "onAnalyticsEvent"

    invoke-static {v4, v5}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v5, "handleProgressButtonClick"

    invoke-static {v10, v5}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v11, p5

    check-cast v11, Lp1/q;

    const v5, 0x2087f65b

    invoke-virtual {v11, v5}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v5, v0, 0x6

    if-nez v5, :cond_1

    invoke-virtual {v11, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

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

    const/16 v7, 0x20

    if-nez v6, :cond_3

    invoke-virtual {v11, v2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_2

    move v6, v7

    goto :goto_2

    :cond_2
    const/16 v6, 0x10

    :goto_2
    or-int/2addr v5, v6

    :cond_3
    and-int/lit16 v6, v0, 0x180

    if-nez v6, :cond_5

    invoke-virtual {v11, v3}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_4

    const/16 v6, 0x100

    goto :goto_3

    :cond_4
    const/16 v6, 0x80

    :goto_3
    or-int/2addr v5, v6

    :cond_5
    and-int/lit16 v6, v0, 0xc00

    if-nez v6, :cond_7

    invoke-virtual {v11, v4}, Lp1/q;->i(Ljava/lang/Object;)Z

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

    invoke-virtual {v11, v10}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_8

    const/16 v6, 0x4000

    goto :goto_5

    :cond_8
    const/16 v6, 0x2000

    :goto_5
    or-int/2addr v5, v6

    :cond_9
    and-int/lit16 v6, v5, 0x2493

    const/16 v8, 0x2492

    const/4 v14, 0x0

    if-eq v6, v8, :cond_a

    const/4 v6, 0x1

    goto :goto_6

    :cond_a
    move v6, v14

    :goto_6
    and-int/lit8 v8, v5, 0x1

    invoke-virtual {v11, v8, v6}, Lp1/q;->U(IZ)Z

    move-result v6

    if-eqz v6, :cond_1a

    sget-object v6, Lb3/v1;->p:Lp1/u2;

    invoke-virtual {v11, v6}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lb3/x2;

    invoke-static {v11, v14}, Lk80/s;->g(Landroidx/compose/runtime/Composer;I)Z

    move-result v8

    invoke-virtual {v1}, Lg80/f;->a()Lg80/d;

    move-result-object v12

    const-string v13, "activation_post_pairing"

    const/16 v15, 0x30

    invoke-static {v12, v13, v11, v15}, Lfy1/j;->c(Lfy1/k;Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V

    and-int/lit8 v12, v5, 0x70

    if-ne v12, v7, :cond_b

    const/4 v13, 0x1

    goto :goto_7

    :cond_b
    move v13, v14

    :goto_7
    invoke-virtual {v11, v8}, Lp1/q;->h(Z)Z

    move-result v16

    or-int v13, v13, v16

    invoke-virtual {v11, v6}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v16

    or-int v13, v13, v16

    invoke-virtual {v11}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v9

    move/from16 v16, v15

    const/4 v15, 0x0

    sget-object v7, Lp1/l;->a:Lp1/v0;

    if-nez v13, :cond_c

    if-ne v9, v7, :cond_d

    :cond_c
    new-instance v9, Lq90/a$a;

    invoke-direct {v9, v2, v8, v6, v15}, Lq90/a$a;-><init>(Lkotlin/jvm/functions/Function1;ZLb3/x2;Lq83/d;)V

    invoke-virtual {v11, v9}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_d
    check-cast v9, Lc93/m;

    sget-object v6, Ll83/a0;->a:Ll83/a0;

    invoke-static {v11, v9, v6}, Lp1/x;->g(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual {v1}, Lg80/f;->a()Lg80/d;

    move-result-object v6

    invoke-virtual {v6}, Lg80/d;->b()Lg80/g;

    move-result-object v6

    if-eqz v6, :cond_e

    invoke-virtual {v6}, Lg80/g;->g()Lc31/k;

    move-result-object v6

    if-eqz v6, :cond_e

    invoke-virtual {v6}, Lc31/k;->p()Lc31/d;

    move-result-object v6

    goto :goto_8

    :cond_e
    move-object v6, v15

    :goto_8
    sget-object v8, Lc31/d;->LOADING:Lc31/d;

    if-ne v6, v8, :cond_f

    const v6, -0x51d9297e

    invoke-virtual {v11, v6}, Lp1/q;->e0(I)V

    invoke-static {v11, v14}, Lk80/s;->c(Landroidx/compose/runtime/Composer;I)V

    invoke-virtual {v11, v14}, Lp1/q;->q(Z)V

    goto :goto_9

    :cond_f
    const v6, -0x51d89e99

    invoke-virtual {v11, v6}, Lp1/q;->e0(I)V

    invoke-virtual {v11, v14}, Lp1/q;->q(Z)V

    :goto_9
    invoke-virtual {v1}, Lg80/f;->a()Lg80/d;

    move-result-object v6

    invoke-virtual {v6}, Lg80/d;->d()Z

    move-result v6

    if-eqz v6, :cond_16

    const v5, -0x51d77113

    invoke-virtual {v11, v5}, Lp1/q;->e0(I)V

    const/16 v5, 0x20

    if-ne v12, v5, :cond_10

    const/4 v5, 0x1

    goto :goto_a

    :cond_10
    move v5, v14

    :goto_a
    invoke-virtual {v11}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v6

    if-nez v5, :cond_11

    if-ne v6, v7, :cond_12

    :cond_11
    new-instance v6, Lp62/h;

    const/16 v5, 0x13

    invoke-direct {v6, v2, v5}, Lp62/h;-><init>(Lkotlin/jvm/functions/Function1;I)V

    invoke-virtual {v11, v6}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_12
    check-cast v6, Lc93/a;

    const/16 v5, 0x20

    if-ne v12, v5, :cond_13

    const/4 v9, 0x1

    goto :goto_b

    :cond_13
    move v9, v14

    :goto_b
    invoke-virtual {v11}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    if-nez v9, :cond_14

    if-ne v5, v7, :cond_15

    :cond_14
    new-instance v5, Lp62/h;

    const/16 v7, 0x14

    invoke-direct {v5, v2, v7}, Lp62/h;-><init>(Lkotlin/jvm/functions/Function1;I)V

    invoke-virtual {v11, v5}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_15
    check-cast v5, Lc93/a;

    invoke-static {v6, v5, v11, v14}, Lk80/o;->b(Lc93/a;Lc93/a;Landroidx/compose/runtime/Composer;I)V

    invoke-virtual {v11, v14}, Lp1/q;->q(Z)V

    goto/16 :goto_c

    :cond_16
    invoke-virtual {v1}, Lg80/f;->a()Lg80/d;

    move-result-object v6

    invoke-virtual {v6}, Lg80/d;->e()Z

    move-result v6

    if-eqz v6, :cond_17

    const v5, -0x51d1e99c

    invoke-virtual {v11, v5}, Lp1/q;->e0(I)V

    invoke-static {v11, v14}, Lk80/s;->c(Landroidx/compose/runtime/Composer;I)V

    invoke-static {v11, v14}, Lk80/r;->b(Landroidx/compose/runtime/Composer;I)V

    invoke-virtual {v11, v14}, Lp1/q;->q(Z)V

    goto :goto_c

    :cond_17
    invoke-virtual {v1}, Lg80/f;->a()Lg80/d;

    move-result-object v6

    invoke-virtual {v6}, Lg80/d;->b()Lg80/g;

    move-result-object v6

    if-eqz v6, :cond_18

    invoke-virtual {v6}, Lg80/g;->h()Ljava/util/List;

    move-result-object v15

    :cond_18
    if-eqz v15, :cond_19

    const v6, -0x51cf815d

    invoke-virtual {v11, v6}, Lp1/q;->e0(I)V

    invoke-virtual {v1}, Lg80/f;->a()Lg80/d;

    move-result-object v6

    invoke-virtual {v6}, Lg80/d;->b()Lg80/g;

    move-result-object v6

    sget-object v3, Lcom/whoop/activation/view/navigation/ActivationFlowDestination;->POST_PAIRING:Lcom/whoop/activation/view/navigation/ActivationFlowDestination;

    shl-int/lit8 v7, v5, 0x6

    and-int/lit16 v8, v7, 0x1c00

    or-int/lit8 v8, v8, 0x30

    const v9, 0xe000

    and-int/2addr v7, v9

    or-int/2addr v7, v8

    shl-int/lit8 v8, v5, 0x9

    const/high16 v9, 0x380000

    and-int/2addr v8, v9

    or-int/2addr v7, v8

    shl-int/lit8 v5, v5, 0xc

    const/high16 v8, 0xe000000

    and-int/2addr v5, v8

    or-int v12, v7, v5

    const/16 v13, 0xa4

    const/4 v4, 0x0

    const/4 v7, 0x0

    const/4 v9, 0x0

    move-object/from16 v8, p3

    move-object v5, v2

    move-object v2, v6

    move-object/from16 v6, p2

    invoke-static/range {v2 .. v13}, Lq80/i;->m(Lg80/g;Lcom/whoop/activation/view/navigation/ActivationFlowDestination;Lcom/whoop/activation/iajf/domain/SignUpSource;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function3;Lc93/r;Landroidx/compose/runtime/Composer;II)V

    invoke-virtual {v11, v14}, Lp1/q;->q(Z)V

    goto :goto_c

    :cond_19
    const v2, -0x51c8c959

    invoke-virtual {v11, v2}, Lp1/q;->e0(I)V

    invoke-virtual {v11, v14}, Lp1/q;->q(Z)V

    goto :goto_c

    :cond_1a
    invoke-virtual {v11}, Lp1/q;->X()V

    :goto_c
    invoke-virtual {v11}, Lp1/q;->u()Lp1/v1;

    move-result-object v8

    if-eqz v8, :cond_1b

    new-instance v0, Laq1/c;

    const/16 v7, 0x1c

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move-object/from16 v4, p3

    move-object/from16 v5, p4

    move/from16 v6, p6

    invoke-direct/range {v0 .. v7}, Laq1/c;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ll83/e;Ljava/lang/Object;Ljava/lang/Object;II)V

    iput-object v0, v8, Lp1/v1;->d:Lc93/m;

    :cond_1b
    return-void
.end method

.method private static final e(Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 1

    sget-object v0, Lj80/a$x;->a:Lj80/a$x;

    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final f(Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 1

    sget-object v0, Lj80/a$x;->a:Lj80/a$x;

    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final g(Lg80/f;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lc93/r;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 7

    or-int/lit8 p5, p5, 0x1

    invoke-static {p5}, Lp1/x;->L(I)I

    move-result v6

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    move-object v5, p6

    invoke-static/range {v0 .. v6}, Lq90/a;->d(Lg80/f;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lc93/r;Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method
