.class public abstract Law0/b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u001a7\u0010\u0008\u001a\u00020\u00062\u0008\u0008\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0014\u0008\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0001\u00a2\u0006\u0004\u0008\u0008\u0010\t\u001a7\u0010\u000c\u001a\u00020\u00062\u0008\u0008\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\n2\u0014\u0008\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0001\u00a2\u0006\u0004\u0008\u000c\u0010\r\u00a8\u0006\u000e\u00b2\u0006\u000c\u0010\u000b\u001a\u00020\n8\nX\u008a\u0084\u0002"
    }
    d2 = {
        "Landroidx/compose/ui/Modifier;",
        "modifier",
        "Lyv0/a;",
        "itemState",
        "Lkotlin/Function1;",
        "",
        "Ll83/a0;",
        "onViewEvent",
        "g",
        "(Landroidx/compose/ui/Modifier;Lyv0/a;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V",
        "Lyv0/d;",
        "viewState",
        "l",
        "(Landroidx/compose/ui/Modifier;Lyv0/d;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V",
        "core-details_release"
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

    invoke-static {p0}, Law0/b;->m(Ljava/lang/Object;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Ljava/lang/Object;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Law0/b;->h(Ljava/lang/Object;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Lp1/t2;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Law0/b;->j(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Lp1/t2;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Landroidx/compose/ui/Modifier;Lyv0/d;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p6}, Law0/b;->o(Landroidx/compose/ui/Modifier;Lyv0/d;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic e(Landroidx/compose/ui/Modifier;Lm91/u;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/Modifier;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Law0/b;->n(Landroidx/compose/ui/Modifier;Lm91/u;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/Modifier;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic f(Landroidx/compose/ui/Modifier;Lyv0/a;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p6}, Law0/b;->k(Landroidx/compose/ui/Modifier;Lyv0/a;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final g(Landroidx/compose/ui/Modifier;Lyv0/a;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V
    .locals 21
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/ui/Modifier;",
            "Lyv0/a;",
            "Lkotlin/jvm/functions/Function1;",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    move-object/from16 v2, p1

    move/from16 v4, p4

    const-string v0, "itemState"

    invoke-static {v2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v8, p3

    check-cast v8, Lp1/q;

    const v0, -0x34e35636    # -1.0267082E7f

    invoke-virtual {v8, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, p5, 0x1

    if-eqz v0, :cond_0

    or-int/lit8 v1, v4, 0x6

    move v3, v1

    move-object/from16 v1, p0

    goto :goto_1

    :cond_0
    and-int/lit8 v1, v4, 0x6

    if-nez v1, :cond_2

    move-object/from16 v1, p0

    invoke-virtual {v8, v1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_1

    const/4 v3, 0x4

    goto :goto_0

    :cond_1
    const/4 v3, 0x2

    :goto_0
    or-int/2addr v3, v4

    goto :goto_1

    :cond_2
    move-object/from16 v1, p0

    move v3, v4

    :goto_1
    and-int/lit8 v5, v4, 0x30

    const/16 v11, 0x20

    if-nez v5, :cond_4

    invoke-virtual {v8, v2}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_3

    move v5, v11

    goto :goto_2

    :cond_3
    const/16 v5, 0x10

    :goto_2
    or-int/2addr v3, v5

    :cond_4
    and-int/lit8 v5, p5, 0x4

    if-eqz v5, :cond_6

    or-int/lit16 v3, v3, 0x180

    :cond_5
    move-object/from16 v6, p2

    goto :goto_4

    :cond_6
    and-int/lit16 v6, v4, 0x180

    if-nez v6, :cond_5

    move-object/from16 v6, p2

    invoke-virtual {v8, v6}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_7

    const/16 v7, 0x100

    goto :goto_3

    :cond_7
    const/16 v7, 0x80

    :goto_3
    or-int/2addr v3, v7

    :goto_4
    and-int/lit16 v7, v3, 0x93

    const/16 v9, 0x92

    const/4 v12, 0x0

    if-eq v7, v9, :cond_8

    const/4 v7, 0x1

    goto :goto_5

    :cond_8
    move v7, v12

    :goto_5
    and-int/lit8 v9, v3, 0x1

    invoke-virtual {v8, v9, v7}, Lp1/q;->U(IZ)Z

    move-result v7

    if-eqz v7, :cond_19

    if-eqz v0, :cond_9

    sget-object v0, Lb2/t;->w:Lb2/t;

    goto :goto_6

    :cond_9
    move-object v0, v1

    :goto_6
    sget-object v1, Lp1/l;->a:Lp1/v0;

    if-eqz v5, :cond_b

    invoke-virtual {v8}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    if-ne v5, v1, :cond_a

    new-instance v5, Lat2/b1;

    const/16 v6, 0xc

    invoke-direct {v5, v6}, Lat2/b1;-><init>(I)V

    invoke-virtual {v8, v5}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_a
    check-cast v5, Lkotlin/jvm/functions/Function1;

    move-object v14, v5

    goto :goto_7

    :cond_b
    move-object v14, v6

    :goto_7
    sget-object v6, Lyv0/d$c;->a:Lyv0/d$c;

    invoke-virtual {v2}, Lyv0/a;->getId()Ljava/lang/String;

    move-result-object v5

    const v7, 0x51c1188b

    invoke-virtual {v8, v7}, Lp1/q;->e0(I)V

    sget-object v7, Lx81/d;->a:Lx81/d;

    const/4 v9, 0x6

    invoke-virtual {v7, v8, v9}, Lx81/d;->c(Landroidx/compose/runtime/Composer;I)Lcom/whoop/data/repositories/FeatureFlagChecker;

    move-result-object v7

    const-string v9, "safe-design-view-model-injection-android"

    invoke-interface {v7, v9}, Lcom/whoop/data/repositories/FeatureFlagChecker;->isFeatureEnabled(Ljava/lang/String;)Z

    move-result v7

    const-class v9, Lyv0/c;

    const/4 v15, 0x0

    if-nez v7, :cond_12

    const v7, -0x2a32dbfc

    invoke-virtual {v8, v7}, Lp1/q;->e0(I)V

    invoke-static {v8}, Lm8/a;->a(Landroidx/compose/runtime/Composer;)Landroidx/lifecycle/f2;

    move-result-object v16

    if-nez v16, :cond_c

    const v7, -0x2a322beb

    invoke-virtual {v8, v7}, Lp1/q;->e0(I)V

    invoke-virtual {v8, v12}, Lp1/q;->q(Z)V

    move-object v7, v15

    const/4 v13, 0x0

    goto :goto_a

    :cond_c
    const v7, -0x2a322bea

    invoke-virtual {v8, v7}, Lp1/q;->e0(I)V

    sget-object v7, Landroidx/compose/ui/platform/AndroidCompositionLocals_androidKt;->b:Lp1/u2;

    invoke-virtual {v8, v7}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Landroid/content/Context;

    invoke-virtual {v7}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v7

    const-string v10, "null cannot be cast to non-null type android.app.Application"

    invoke-static {v7, v10}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v7, Landroid/app/Application;

    invoke-virtual {v8, v5}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v10

    invoke-virtual {v8, v15}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v17

    or-int v10, v10, v17

    invoke-virtual {v8}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v13

    if-nez v10, :cond_e

    if-ne v13, v1, :cond_d

    goto :goto_8

    :cond_d
    move-object v7, v15

    goto :goto_9

    :cond_e
    :goto_8
    sget-object v10, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v10, v9}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v17

    new-instance v9, Lld1/b;

    invoke-direct {v9, v6}, Lld1/b;-><init>(Ljava/lang/Object;)V

    move-object/from16 v20, v5

    move-object/from16 v19, v9

    move-object/from16 v18, v15

    move-object v15, v7

    invoke-static/range {v15 .. v20}, Lld1/d;->b(Landroid/app/Application;Landroidx/lifecycle/f2;Lj93/d;Lc93/a;Lld1/c;Ljava/lang/String;)Lld1/c;

    move-result-object v13

    move-object/from16 v7, v18

    invoke-virtual {v8, v13}, Lp1/q;->p0(Ljava/lang/Object;)V

    :goto_9
    check-cast v13, Lld1/c;

    invoke-virtual {v8, v12}, Lp1/q;->q(Z)V

    :goto_a
    if-nez v13, :cond_11

    const v9, -0x2a2a887e

    invoke-virtual {v8, v9}, Lp1/q;->e0(I)V

    invoke-virtual {v8, v5}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v5

    invoke-virtual {v8, v7}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v7

    or-int/2addr v5, v7

    invoke-virtual {v8}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v7

    if-nez v5, :cond_f

    if-ne v7, v1, :cond_10

    :cond_f
    new-instance v7, Lld1/b;

    invoke-direct {v7, v6}, Lld1/b;-><init>(Ljava/lang/Object;)V

    invoke-virtual {v8, v7}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_10
    move-object v13, v7

    check-cast v13, Lld1/b;

    invoke-virtual {v8, v12}, Lp1/q;->q(Z)V

    goto :goto_b

    :cond_11
    const v5, -0x1a22aa39

    invoke-virtual {v8, v5}, Lp1/q;->e0(I)V

    invoke-virtual {v8, v12}, Lp1/q;->q(Z)V

    :goto_b
    invoke-virtual {v8, v12}, Lp1/q;->q(Z)V

    invoke-virtual {v8, v12}, Lp1/q;->q(Z)V

    move-object/from16 v16, v6

    goto :goto_f

    :cond_12
    move-object v7, v15

    const v10, -0x2a28ba09

    invoke-static {v8, v10, v12, v8}, Ld;->f(Lp1/q;IZLp1/q;)Landroidx/lifecycle/f2;

    move-result-object v15

    sget-object v10, Landroidx/compose/ui/platform/AndroidCompositionLocals_androidKt;->b:Lp1/u2;

    invoke-virtual {v8, v10}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Landroid/content/Context;

    invoke-virtual {v10}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v10

    instance-of v13, v10, Landroid/app/Application;

    if-eqz v13, :cond_13

    check-cast v10, Landroid/app/Application;

    move-object/from16 v17, v10

    goto :goto_c

    :cond_13
    const/16 v17, 0x0

    :goto_c
    invoke-virtual {v8, v5}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v10

    invoke-virtual {v8, v7}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v13

    or-int/2addr v10, v13

    invoke-virtual {v8}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v13

    if-nez v10, :cond_15

    if-ne v13, v1, :cond_14

    goto :goto_d

    :cond_14
    move-object/from16 v16, v6

    goto :goto_e

    :cond_15
    :goto_d
    sget-object v10, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v10, v9}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v18

    move-object/from16 v20, v5

    move-object/from16 v16, v6

    move-object/from16 v19, v7

    invoke-static/range {v15 .. v20}, Lld1/d;->d(Landroidx/lifecycle/f2;Ljava/lang/Object;Landroid/app/Application;Lj93/d;Lc93/a;Ljava/lang/String;)Lld1/c;

    move-result-object v13

    invoke-virtual {v8, v13}, Lp1/q;->p0(Ljava/lang/Object;)V

    :goto_e
    check-cast v13, Lld1/c;

    invoke-virtual {v8, v12}, Lp1/q;->q(Z)V

    :goto_f
    invoke-virtual {v13}, Lld1/c;->getViewState()Lec3/l;

    move-result-object v5

    const/16 v9, 0x30

    const/4 v10, 0x2

    const/4 v7, 0x0

    move-object/from16 v6, v16

    const/4 v15, 0x0

    invoke-static/range {v5 .. v10}, Lp1/x;->n(Lec3/l;Ljava/lang/Object;Lq83/j;Landroidx/compose/runtime/Composer;II)Lp1/c1;

    move-result-object v5

    invoke-virtual {v2}, Lyv0/a;->getId()Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v8, v13}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v7

    and-int/lit8 v3, v3, 0x70

    if-ne v3, v11, :cond_16

    const/4 v12, 0x1

    :cond_16
    or-int v3, v7, v12

    invoke-virtual {v8}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v7

    if-nez v3, :cond_17

    if-ne v7, v1, :cond_18

    :cond_17
    new-instance v7, Law0/b$a;

    invoke-direct {v7, v13, v2, v15}, Law0/b$a;-><init>(Lld1/c;Lyv0/a;Lq83/d;)V

    invoke-virtual {v8, v7}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_18
    check-cast v7, Lc93/m;

    invoke-static {v8, v7, v6}, Lp1/x;->g(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {}, Lm91/l;->C()Lp1/t1;

    move-result-object v1

    invoke-static {}, Law0/l;->h()Lm91/p;

    move-result-object v3

    invoke-virtual {v1, v3}, Lp1/t1;->a(Ljava/lang/Object;)Lp1/u1;

    move-result-object v1

    new-instance v3, La01/d;

    const/4 v6, 0x1

    invoke-direct {v3, v0, v14, v5, v6}, La01/d;-><init>(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Ljava/lang/Object;I)V

    const v5, 0x24bbee8a

    invoke-static {v5, v8, v3}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v3

    const/16 v5, 0x38

    invoke-static {v1, v3, v8, v5}, Lp1/x;->a(Lp1/u1;Lc93/m;Landroidx/compose/runtime/Composer;I)V

    move-object v1, v0

    move-object v3, v14

    goto :goto_10

    :cond_19
    invoke-virtual {v8}, Lp1/q;->X()V

    move-object v3, v6

    :goto_10
    invoke-virtual {v8}, Lp1/q;->u()Lp1/v1;

    move-result-object v7

    if-eqz v7, :cond_1a

    new-instance v0, La01/e;

    const/16 v6, 0x8

    move/from16 v5, p5

    invoke-direct/range {v0 .. v6}, La01/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;III)V

    iput-object v0, v7, Lp1/v1;->d:Lc93/m;

    :cond_1a
    return-void
.end method

.method private static final h(Ljava/lang/Object;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final i(Lp1/t2;)Lyv0/d;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp1/t2;",
            ")",
            "Lyv0/d;"
        }
    .end annotation

    invoke-interface {p0}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lyv0/d;

    return-object p0
.end method

.method private static final j(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Lp1/t2;Landroidx/compose/runtime/Composer;I)Ll83/a0;
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

    if-eqz p3, :cond_1

    invoke-static {p2}, Law0/b;->i(Lp1/t2;)Lyv0/d;

    move-result-object v2

    const/4 v5, 0x0

    const/4 v6, 0x0

    move-object v1, p0

    move-object v3, p1

    invoke-static/range {v1 .. v6}, Law0/b;->l(Landroidx/compose/ui/Modifier;Lyv0/d;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    goto :goto_1

    :cond_1
    invoke-virtual {v4}, Lp1/q;->X()V

    :goto_1
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final k(Landroidx/compose/ui/Modifier;Lyv0/a;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 6

    or-int/lit8 p3, p3, 0x1

    invoke-static {p3}, Lp1/x;->L(I)I

    move-result v4

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move v5, p4

    move-object v3, p5

    invoke-static/range {v0 .. v5}, Law0/b;->g(Landroidx/compose/ui/Modifier;Lyv0/a;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static final l(Landroidx/compose/ui/Modifier;Lyv0/d;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V
    .locals 13
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/ui/Modifier;",
            "Lyv0/d;",
            "Lkotlin/jvm/functions/Function1;",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    move/from16 v4, p4

    const-string v0, "viewState"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v9, p3

    check-cast v9, Lp1/q;

    const v0, 0x865f33e

    invoke-virtual {v9, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, p5, 0x1

    if-eqz v0, :cond_0

    or-int/lit8 v1, v4, 0x6

    goto :goto_1

    :cond_0
    and-int/lit8 v1, v4, 0x6

    if-nez v1, :cond_2

    invoke-virtual {v9, p0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    const/4 v1, 0x4

    goto :goto_0

    :cond_1
    const/4 v1, 0x2

    :goto_0
    or-int/2addr v1, v4

    goto :goto_1

    :cond_2
    move v1, v4

    :goto_1
    and-int/lit8 v2, v4, 0x30

    if-nez v2, :cond_4

    invoke-virtual {v9, p1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_3

    const/16 v2, 0x20

    goto :goto_2

    :cond_3
    const/16 v2, 0x10

    :goto_2
    or-int/2addr v1, v2

    :cond_4
    and-int/lit8 v2, p5, 0x4

    if-eqz v2, :cond_5

    or-int/lit16 v1, v1, 0x180

    goto :goto_4

    :cond_5
    and-int/lit16 v3, v4, 0x180

    if-nez v3, :cond_7

    invoke-virtual {v9, p2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_6

    const/16 v3, 0x100

    goto :goto_3

    :cond_6
    const/16 v3, 0x80

    :goto_3
    or-int/2addr v1, v3

    :cond_7
    :goto_4
    and-int/lit16 v3, v1, 0x93

    const/16 v5, 0x92

    const/4 v12, 0x0

    if-eq v3, v5, :cond_8

    const/4 v3, 0x1

    goto :goto_5

    :cond_8
    move v3, v12

    :goto_5
    and-int/lit8 v5, v1, 0x1

    invoke-virtual {v9, v5, v3}, Lp1/q;->U(IZ)Z

    move-result v3

    if-eqz v3, :cond_f

    if-eqz v0, :cond_9

    sget-object p0, Lb2/t;->w:Lb2/t;

    :cond_9
    if-eqz v2, :cond_b

    invoke-virtual {v9}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object p2

    sget-object v0, Lp1/l;->a:Lp1/v0;

    if-ne p2, v0, :cond_a

    new-instance p2, Lat2/b1;

    const/16 v0, 0xd

    invoke-direct {p2, v0}, Lat2/b1;-><init>(I)V

    invoke-virtual {v9, p2}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_a
    check-cast p2, Lkotlin/jvm/functions/Function1;

    :cond_b
    move-object v8, p2

    sget-object p2, Lyv0/d$c;->a:Lyv0/d$c;

    invoke-virtual {p1, p2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-nez p2, :cond_e

    sget-object p2, Lyv0/d$a;->a:Lyv0/d$a;

    invoke-virtual {p1, p2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_c

    goto :goto_6

    :cond_c
    instance-of p2, p1, Lyv0/d$b;

    if-eqz p2, :cond_d

    const p2, -0x79499d11

    invoke-virtual {v9, p2}, Lp1/q;->e0(I)V

    move-object p2, p1

    check-cast p2, Lyv0/d$b;

    invoke-virtual {p2}, Lyv0/d$b;->a()Lm91/o;

    move-result-object v5

    new-instance v7, Law0/a;

    const/4 p2, 0x0

    invoke-direct {v7, p2, p0}, Law0/a;-><init>(ILandroidx/compose/ui/Modifier;)V

    sget p2, Lm91/o;->c:I

    shl-int/lit8 v0, v1, 0x3

    and-int/lit16 v0, v0, 0x1c00

    or-int v10, p2, v0

    const/4 v11, 0x2

    const/4 v6, 0x0

    invoke-static/range {v5 .. v11}, Lm91/l;->q(Lm91/o;Lm91/p;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    invoke-virtual {v9, v12}, Lp1/q;->q(Z)V

    goto :goto_7

    :cond_d
    const p0, -0x7949cb0f

    invoke-static {p0, v9, v12}, Ldc/b;->v(ILp1/q;Z)Lkotlin/NoWhenBranchMatchedException;

    move-result-object p0

    throw p0

    :cond_e
    :goto_6
    const p2, -0x7949a5fe

    invoke-virtual {v9, p2}, Lp1/q;->e0(I)V

    invoke-virtual {v9, v12}, Lp1/q;->q(Z)V

    :goto_7
    move-object v3, v8

    :goto_8
    move-object v1, p0

    goto :goto_9

    :cond_f
    invoke-virtual {v9}, Lp1/q;->X()V

    move-object v3, p2

    goto :goto_8

    :goto_9
    invoke-virtual {v9}, Lp1/q;->u()Lp1/v1;

    move-result-object p0

    if-eqz p0, :cond_10

    new-instance v0, La01/e;

    const/16 v6, 0x9

    move-object v2, p1

    move/from16 v5, p5

    invoke-direct/range {v0 .. v6}, La01/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;III)V

    iput-object v0, p0, Lp1/v1;->d:Lc93/m;

    :cond_10
    return-void
.end method

.method private static final m(Ljava/lang/Object;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final n(Landroidx/compose/ui/Modifier;Lm91/u;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/Modifier;
    .locals 0

    const-string p3, "it"

    invoke-static {p1, p3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p2, Lp1/q;

    const p1, -0x4e8d7893

    invoke-virtual {p2, p1}, Lp1/q;->e0(I)V

    const/4 p1, 0x0

    invoke-virtual {p2, p1}, Lp1/q;->q(Z)V

    return-object p0
.end method

.method private static final o(Landroidx/compose/ui/Modifier;Lyv0/d;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 6

    or-int/lit8 p3, p3, 0x1

    invoke-static {p3}, Lp1/x;->L(I)I

    move-result v4

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move v5, p4

    move-object v3, p5

    invoke-static/range {v0 .. v5}, Law0/b;->l(Landroidx/compose/ui/Modifier;Lyv0/d;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method
