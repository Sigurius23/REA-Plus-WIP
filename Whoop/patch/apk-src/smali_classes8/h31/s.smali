.class public abstract Lh31/s;
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
        "Lh31/q;",
        "itemState",
        "Lkotlin/Function1;",
        "",
        "Ll83/a0;",
        "onViewEvent",
        "h",
        "(Landroidx/compose/ui/Modifier;Lh31/q;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V",
        "",
        "showError",
        "Lkotlin/Function0;",
        "onDismiss",
        "f",
        "(ZLc93/a;Landroidx/compose/runtime/Composer;I)V",
        "Lh31/m;",
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
.method public static synthetic a(Lkotlin/jvm/functions/Function1;Lld1/c;Ljava/lang/Object;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, Lh31/s;->l(Lkotlin/jvm/functions/Function1;Lld1/c;Ljava/lang/Object;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Landroidx/compose/ui/Modifier;Lh31/q;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p6}, Lh31/s;->m(Landroidx/compose/ui/Modifier;Lh31/q;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Lc93/a;ZLandroidx/compose/runtime/Composer;II)Ll83/a0;
    .locals 0

    invoke-static {p1, p0, p3, p2, p4}, Lh31/s;->g(ZLc93/a;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Landroidx/compose/ui/Modifier;Lh31/q;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p6}, Lh31/s;->i(Landroidx/compose/ui/Modifier;Lh31/q;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic e(Lld1/c;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lh31/s;->k(Lld1/c;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method private static final f(ZLc93/a;Landroidx/compose/runtime/Composer;I)V
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

    const v0, 0x47de6e1a

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

    const v6, 0x7571bbf9

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
    new-instance v2, Lh31/s$a;

    const/4 v0, 0x0

    invoke-direct {v2, v1, v3, p1, v0}, Lh31/s$a;-><init>(Landroid/content/Context;Ljava/lang/String;Lc93/a;Lq83/d;)V

    invoke-virtual {p2, v2}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_7
    check-cast v2, Lc93/m;

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    invoke-static {p2, v2, v0}, Lp1/x;->g(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual {p2, v5}, Lp1/q;->q(Z)V

    goto :goto_5

    :cond_8
    const v0, 0x7573d4c8

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

    const/4 v1, 0x3

    invoke-direct {v0, p0, p1, p3, v1}, La41/j;-><init>(ZLc93/a;II)V

    iput-object v0, p2, Lp1/v1;->d:Lc93/m;

    :cond_a
    return-void
.end method

.method private static final g(ZLc93/a;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, Lp1/x;->L(I)I

    move-result p2

    invoke-static {p0, p1, p3, p2}, Lh31/s;->f(ZLc93/a;Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static final h(Landroidx/compose/ui/Modifier;Lh31/q;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V
    .locals 24
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/ui/Modifier;",
            "Lh31/q;",
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

    move-object/from16 v4, p3

    check-cast v4, Lp1/q;

    const v0, -0x1112ccbd

    invoke-virtual {v4, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, p5, 0x1

    const/4 v7, 0x4

    if-eqz v0, :cond_0

    or-int/lit8 v1, v6, 0x6

    move v5, v1

    move-object/from16 v1, p0

    goto :goto_1

    :cond_0
    and-int/lit8 v1, v6, 0x6

    if-nez v1, :cond_2

    move-object/from16 v1, p0

    invoke-virtual {v4, v1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_1

    move v5, v7

    goto :goto_0

    :cond_1
    const/4 v5, 0x2

    :goto_0
    or-int/2addr v5, v6

    goto :goto_1

    :cond_2
    move-object/from16 v1, p0

    move v5, v6

    :goto_1
    and-int/lit8 v8, v6, 0x30

    const/16 v9, 0x20

    if-nez v8, :cond_4

    invoke-virtual {v4, v2}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_3

    move v8, v9

    goto :goto_2

    :cond_3
    const/16 v8, 0x10

    :goto_2
    or-int/2addr v5, v8

    :cond_4
    and-int/lit16 v8, v6, 0x180

    if-nez v8, :cond_6

    invoke-virtual {v4, v3}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_5

    const/16 v8, 0x100

    goto :goto_3

    :cond_5
    const/16 v8, 0x80

    :goto_3
    or-int/2addr v5, v8

    :cond_6
    move v8, v5

    and-int/lit16 v5, v8, 0x93

    const/16 v11, 0x92

    const/4 v12, 0x0

    if-eq v5, v11, :cond_7

    const/4 v5, 0x1

    goto :goto_4

    :cond_7
    move v5, v12

    :goto_4
    and-int/lit8 v11, v8, 0x1

    invoke-virtual {v4, v11, v5}, Lp1/q;->U(IZ)Z

    move-result v5

    if-eqz v5, :cond_3e

    if-eqz v0, :cond_8

    sget-object v0, Lb2/t;->w:Lb2/t;

    move-object v1, v0

    :cond_8
    sget-object v0, Lb3/k2;->a:Lp1/u2;

    invoke-virtual {v4, v0}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    const/4 v11, 0x6

    if-eqz v0, :cond_9

    const v0, 0x254331a7

    invoke-virtual {v4, v0}, Lp1/q;->e0(I)V

    shr-int/lit8 v0, v8, 0x3

    and-int/lit8 v0, v0, 0x7e

    shl-int/lit8 v5, v8, 0x6

    and-int/lit16 v5, v5, 0x380

    or-int/2addr v0, v5

    const/4 v5, 0x0

    move-object/from16 v23, v4

    move v4, v0

    move-object v0, v2

    move-object v2, v1

    move-object v1, v3

    move-object/from16 v3, v23

    invoke-static/range {v0 .. v5}, Lh31/l;->c(Lh31/q;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V

    move-object v1, v2

    move-object v14, v3

    invoke-virtual {v14, v12}, Lp1/q;->q(Z)V

    invoke-virtual {v14}, Lp1/q;->u()Lp1/v1;

    move-result-object v7

    if-eqz v7, :cond_3f

    new-instance v0, Lh31/j;

    const/4 v6, 0x1

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move/from16 v4, p4

    move/from16 v5, p5

    invoke-direct/range {v0 .. v6}, Lh31/j;-><init>(Landroidx/compose/ui/Modifier;Lh31/q;Lkotlin/jvm/functions/Function1;III)V

    :goto_5
    iput-object v0, v7, Lp1/v1;->d:Lc93/m;

    return-void

    :cond_9
    move-object/from16 v16, v1

    move-object v15, v3

    move-object v14, v4

    const v0, 0x2544f41f

    invoke-virtual {v14, v0}, Lp1/q;->e0(I)V

    invoke-virtual {v14, v12}, Lp1/q;->q(Z)V

    new-instance v2, Lh31/m;

    const/16 v5, 0xe

    const/4 v6, 0x0

    move-object v0, v2

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    move-object/from16 v1, p1

    invoke-direct/range {v0 .. v6}, Lh31/m;-><init>(Lh31/q;ZLcom/whoop/navigation/e;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object v2, v0

    move-object v0, v1

    invoke-virtual {v0}, Lh31/q;->f()Ljava/lang/String;

    move-result-object v6

    sget v1, Lcom/whoop/navigation/e;->d:I

    const v3, 0x51c1188b

    invoke-virtual {v14, v3}, Lp1/q;->e0(I)V

    sget-object v3, Lx81/d;->a:Lx81/d;

    invoke-virtual {v3, v14, v11}, Lx81/d;->c(Landroidx/compose/runtime/Composer;I)Lcom/whoop/data/repositories/FeatureFlagChecker;

    move-result-object v3

    const-string v4, "safe-design-view-model-injection-android"

    invoke-interface {v3, v4}, Lcom/whoop/data/repositories/FeatureFlagChecker;->isFeatureEnabled(Ljava/lang/String;)Z

    move-result v3

    const-class v4, Lh31/p;

    const/16 v5, 0x800

    move/from16 p3, v11

    sget-object v11, Lp1/l;->a:Lp1/v0;

    const/4 v13, 0x0

    if-nez v3, :cond_22

    const v3, -0x2a32dbfc

    invoke-virtual {v14, v3}, Lp1/q;->e0(I)V

    invoke-static {v14}, Lm8/a;->a(Landroidx/compose/runtime/Composer;)Landroidx/lifecycle/f2;

    move-result-object v18

    if-nez v18, :cond_a

    const v3, -0x2a322beb

    invoke-virtual {v14, v3}, Lp1/q;->e0(I)V

    invoke-virtual {v14, v12}, Lp1/q;->q(Z)V

    move-object v3, v13

    const/4 v10, 0x0

    goto/16 :goto_b

    :cond_a
    const v3, -0x2a322bea

    invoke-virtual {v14, v3}, Lp1/q;->e0(I)V

    sget-object v3, Landroidx/compose/ui/platform/AndroidCompositionLocals_androidKt;->b:Lp1/u2;

    invoke-virtual {v14, v3}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroid/content/Context;

    invoke-virtual {v3}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v3

    const-string v10, "null cannot be cast to non-null type android.app.Application"

    invoke-static {v3, v10}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v17, v3

    check-cast v17, Landroid/app/Application;

    and-int/lit8 v3, v1, 0x70

    xor-int/lit8 v3, v3, 0x30

    if-le v3, v9, :cond_b

    invoke-virtual {v14, v6}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_c

    :cond_b
    and-int/lit8 v3, v1, 0x30

    if-ne v3, v9, :cond_d

    :cond_c
    const/4 v3, 0x1

    goto :goto_6

    :cond_d
    move v3, v12

    :goto_6
    and-int/lit8 v10, v1, 0xe

    xor-int/lit8 v10, v10, 0x6

    if-le v10, v7, :cond_e

    invoke-virtual {v14, v2}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v10

    if-nez v10, :cond_f

    :cond_e
    and-int/lit8 v10, v1, 0x6

    if-ne v10, v7, :cond_10

    :cond_f
    const/4 v10, 0x1

    goto :goto_7

    :cond_10
    move v10, v12

    :goto_7
    or-int/2addr v3, v10

    and-int/lit16 v10, v1, 0x1c00

    xor-int/lit16 v10, v10, 0xc00

    if-le v10, v5, :cond_11

    invoke-virtual {v14, v13}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v10

    if-nez v10, :cond_12

    :cond_11
    and-int/lit16 v10, v1, 0xc00

    if-ne v10, v5, :cond_13

    :cond_12
    const/4 v10, 0x1

    goto :goto_8

    :cond_13
    move v10, v12

    :goto_8
    or-int/2addr v3, v10

    invoke-virtual {v14}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v10

    if-nez v3, :cond_15

    if-ne v10, v11, :cond_14

    goto :goto_9

    :cond_14
    move-object v3, v13

    goto :goto_a

    :cond_15
    :goto_9
    sget-object v3, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v3, v4}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v19

    new-instance v3, Lld1/b;

    invoke-direct {v3, v2}, Lld1/b;-><init>(Ljava/lang/Object;)V

    move-object/from16 v21, v3

    move-object/from16 v22, v6

    move-object/from16 v20, v13

    invoke-static/range {v17 .. v22}, Lld1/d;->b(Landroid/app/Application;Landroidx/lifecycle/f2;Lj93/d;Lc93/a;Lld1/c;Ljava/lang/String;)Lld1/c;

    move-result-object v10

    move-object/from16 v3, v20

    invoke-virtual {v14, v10}, Lp1/q;->p0(Ljava/lang/Object;)V

    :goto_a
    check-cast v10, Lld1/c;

    invoke-virtual {v14, v12}, Lp1/q;->q(Z)V

    :goto_b
    if-nez v10, :cond_21

    const v4, -0x2a2a887e

    invoke-virtual {v14, v4}, Lp1/q;->e0(I)V

    and-int/lit8 v4, v1, 0x70

    xor-int/lit8 v4, v4, 0x30

    if-le v4, v9, :cond_16

    invoke-virtual {v14, v6}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_17

    :cond_16
    and-int/lit8 v4, v1, 0x30

    if-ne v4, v9, :cond_18

    :cond_17
    const/4 v4, 0x1

    goto :goto_c

    :cond_18
    move v4, v12

    :goto_c
    and-int/lit8 v6, v1, 0xe

    xor-int/lit8 v6, v6, 0x6

    if-le v6, v7, :cond_19

    invoke-virtual {v14, v2}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_1a

    :cond_19
    and-int/lit8 v6, v1, 0x6

    if-ne v6, v7, :cond_1b

    :cond_1a
    const/4 v6, 0x1

    goto :goto_d

    :cond_1b
    move v6, v12

    :goto_d
    or-int/2addr v4, v6

    and-int/lit16 v6, v1, 0x1c00

    xor-int/lit16 v6, v6, 0xc00

    if-le v6, v5, :cond_1c

    invoke-virtual {v14, v3}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_1d

    :cond_1c
    and-int/lit16 v3, v1, 0xc00

    if-ne v3, v5, :cond_1e

    :cond_1d
    const/4 v3, 0x1

    goto :goto_e

    :cond_1e
    move v3, v12

    :goto_e
    or-int/2addr v3, v4

    invoke-virtual {v14}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    if-nez v3, :cond_1f

    if-ne v4, v11, :cond_20

    :cond_1f
    new-instance v4, Lld1/b;

    invoke-direct {v4, v2}, Lld1/b;-><init>(Ljava/lang/Object;)V

    invoke-virtual {v14, v4}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_20
    move-object v10, v4

    check-cast v10, Lld1/b;

    invoke-virtual {v14, v12}, Lp1/q;->q(Z)V

    goto :goto_f

    :cond_21
    const v3, -0x1a22aa39

    invoke-virtual {v14, v3}, Lp1/q;->e0(I)V

    invoke-virtual {v14, v12}, Lp1/q;->q(Z)V

    :goto_f
    invoke-virtual {v14, v12}, Lp1/q;->q(Z)V

    invoke-virtual {v14, v12}, Lp1/q;->q(Z)V

    move v7, v1

    const/4 v9, 0x0

    goto/16 :goto_16

    :cond_22
    move-object v3, v13

    const v10, -0x2a28ba09

    invoke-static {v14, v10, v12, v14}, Ld;->f(Lp1/q;IZLp1/q;)Landroidx/lifecycle/f2;

    move-result-object v10

    sget-object v13, Landroidx/compose/ui/platform/AndroidCompositionLocals_androidKt;->b:Lp1/u2;

    invoke-virtual {v14, v13}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v13

    check-cast v13, Landroid/content/Context;

    invoke-virtual {v13}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v13

    instance-of v12, v13, Landroid/app/Application;

    if-eqz v12, :cond_23

    check-cast v13, Landroid/app/Application;

    goto :goto_10

    :cond_23
    const/4 v13, 0x0

    :goto_10
    and-int/lit8 v12, v1, 0x70

    xor-int/lit8 v12, v12, 0x30

    if-le v12, v9, :cond_24

    invoke-virtual {v14, v6}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v12

    if-nez v12, :cond_25

    :cond_24
    and-int/lit8 v12, v1, 0x30

    if-ne v12, v9, :cond_26

    :cond_25
    const/4 v12, 0x1

    goto :goto_11

    :cond_26
    const/4 v12, 0x0

    :goto_11
    and-int/lit8 v18, v1, 0xe

    xor-int/lit8 v9, v18, 0x6

    if-le v9, v7, :cond_27

    invoke-virtual {v14, v2}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v9

    if-nez v9, :cond_28

    :cond_27
    and-int/lit8 v9, v1, 0x6

    if-ne v9, v7, :cond_29

    :cond_28
    const/4 v7, 0x1

    goto :goto_12

    :cond_29
    const/4 v7, 0x0

    :goto_12
    or-int/2addr v7, v12

    and-int/lit16 v9, v1, 0x1c00

    xor-int/lit16 v9, v9, 0xc00

    if-le v9, v5, :cond_2a

    invoke-virtual {v14, v3}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v9

    if-nez v9, :cond_2b

    :cond_2a
    and-int/lit16 v9, v1, 0xc00

    if-ne v9, v5, :cond_2c

    :cond_2b
    const/4 v5, 0x1

    goto :goto_13

    :cond_2c
    const/4 v5, 0x0

    :goto_13
    or-int/2addr v5, v7

    invoke-virtual {v14}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v7

    if-nez v5, :cond_2e

    if-ne v7, v11, :cond_2d

    goto :goto_14

    :cond_2d
    move-object v9, v7

    move v7, v1

    move-object v1, v9

    const/4 v9, 0x0

    goto :goto_15

    :cond_2e
    :goto_14
    sget-object v5, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v5, v4}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v4

    move v7, v1

    move-object v5, v3

    move-object v1, v10

    move-object v3, v13

    const/4 v9, 0x0

    invoke-static/range {v1 .. v6}, Lld1/d;->d(Landroidx/lifecycle/f2;Ljava/lang/Object;Landroid/app/Application;Lj93/d;Lc93/a;Ljava/lang/String;)Lld1/c;

    move-result-object v1

    invoke-virtual {v14, v1}, Lp1/q;->p0(Ljava/lang/Object;)V

    :goto_15
    move-object v10, v1

    check-cast v10, Lld1/c;

    const/4 v1, 0x0

    invoke-virtual {v14, v1}, Lp1/q;->q(Z)V

    :goto_16
    invoke-virtual {v10}, Lld1/c;->getViewState()Lec3/l;

    move-result-object v1

    shl-int/lit8 v5, v7, 0x3

    const/4 v6, 0x2

    const/4 v3, 0x0

    move-object v4, v14

    invoke-static/range {v1 .. v6}, Lp1/x;->n(Lec3/l;Ljava/lang/Object;Lq83/j;Landroidx/compose/runtime/Composer;II)Lp1/c1;

    move-result-object v1

    invoke-virtual {v0}, Lh31/q;->f()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v4, v10}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v3

    and-int/lit8 v5, v8, 0x70

    const/16 v6, 0x20

    if-ne v5, v6, :cond_2f

    const/4 v5, 0x1

    goto :goto_17

    :cond_2f
    const/4 v5, 0x0

    :goto_17
    or-int/2addr v3, v5

    invoke-virtual {v4}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    if-nez v3, :cond_30

    if-ne v5, v11, :cond_31

    :cond_30
    new-instance v5, Lh31/s$b;

    invoke-direct {v5, v10, v0, v9}, Lh31/s$b;-><init>(Lld1/c;Lh31/q;Lq83/d;)V

    invoke-virtual {v4, v5}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_31
    check-cast v5, Lc93/m;

    invoke-static {v4, v5, v2}, Lp1/x;->g(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v1}, Lh31/s;->j(Lp1/t2;)Lh31/m;

    move-result-object v2

    invoke-virtual {v2}, Lh31/m;->b()Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v4, v1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v3

    and-int/lit16 v5, v8, 0x380

    const/16 v6, 0x100

    if-ne v5, v6, :cond_32

    const/4 v6, 0x1

    goto :goto_18

    :cond_32
    const/4 v6, 0x0

    :goto_18
    or-int/2addr v3, v6

    invoke-virtual {v4, v10}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v6

    or-int/2addr v3, v6

    invoke-virtual {v4}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v6

    if-nez v3, :cond_33

    if-ne v6, v11, :cond_34

    :cond_33
    new-instance v6, Lh31/s$c;

    invoke-direct {v6, v1, v15, v10, v9}, Lh31/s$c;-><init>(Lp1/t2;Lkotlin/jvm/functions/Function1;Lld1/c;Lq83/d;)V

    invoke-virtual {v4, v6}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_34
    check-cast v6, Lc93/m;

    invoke-static {v4, v6, v2}, Lp1/x;->g(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v1}, Lh31/s;->j(Lp1/t2;)Lh31/m;

    move-result-object v2

    invoke-virtual {v2}, Lh31/m;->c()Z

    move-result v2

    invoke-virtual {v4, v10}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v3

    invoke-virtual {v4}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v6

    if-nez v3, :cond_35

    if-ne v6, v11, :cond_36

    :cond_35
    new-instance v6, Lh31/r;

    const/4 v3, 0x0

    invoke-direct {v6, v10, v3}, Lh31/r;-><init>(Lld1/c;I)V

    invoke-virtual {v4, v6}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_36
    check-cast v6, Lc93/a;

    const/4 v3, 0x0

    invoke-static {v2, v6, v4, v3}, Lh31/s;->f(ZLc93/a;Landroidx/compose/runtime/Composer;I)V

    invoke-static {v1}, Lh31/s;->j(Lp1/t2;)Lh31/m;

    move-result-object v2

    invoke-virtual {v2}, Lh31/m;->a()Lcom/whoop/navigation/e;

    move-result-object v2

    if-nez v2, :cond_37

    const v2, 0x25542cea

    invoke-virtual {v4, v2}, Lp1/q;->e0(I)V

    invoke-virtual {v4, v3}, Lp1/q;->q(Z)V

    goto :goto_1a

    :cond_37
    const v3, 0x25542ceb

    invoke-virtual {v4, v3}, Lp1/q;->e0(I)V

    const/16 v6, 0x100

    if-ne v5, v6, :cond_38

    const/4 v3, 0x1

    goto :goto_19

    :cond_38
    const/4 v3, 0x0

    :goto_19
    invoke-virtual {v4, v2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v6

    or-int/2addr v3, v6

    invoke-virtual {v4, v10}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v6

    or-int/2addr v3, v6

    invoke-virtual {v4}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v6

    if-nez v3, :cond_39

    if-ne v6, v11, :cond_3a

    :cond_39
    new-instance v6, Lh31/s$d;

    invoke-direct {v6, v15, v2, v10, v9}, Lh31/s$d;-><init>(Lkotlin/jvm/functions/Function1;Lcom/whoop/navigation/e;Lld1/c;Lq83/d;)V

    invoke-virtual {v4, v6}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_3a
    check-cast v6, Lc93/m;

    invoke-static {v4, v6, v2}, Lp1/x;->g(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const/4 v3, 0x0

    invoke-virtual {v4, v3}, Lp1/q;->q(Z)V

    :goto_1a
    invoke-static {v1}, Lh31/s;->j(Lp1/t2;)Lh31/m;

    move-result-object v1

    invoke-virtual {v1}, Lh31/m;->d()Lh31/q;

    move-result-object v1

    const/16 v6, 0x100

    if-ne v5, v6, :cond_3b

    const/4 v12, 0x1

    goto :goto_1b

    :cond_3b
    move v12, v3

    :goto_1b
    invoke-virtual {v4, v10}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v2

    or-int/2addr v2, v12

    invoke-virtual {v4}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    if-nez v2, :cond_3c

    if-ne v3, v11, :cond_3d

    :cond_3c
    new-instance v3, Lb03/b;

    const/4 v2, 0x2

    invoke-direct {v3, v15, v10, v2}, Lb03/b;-><init>(Lkotlin/jvm/functions/Function1;Lld1/c;I)V

    invoke-virtual {v4, v3}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_3d
    move-object v2, v3

    check-cast v2, Lkotlin/jvm/functions/Function1;

    shl-int/lit8 v3, v8, 0x6

    and-int/lit16 v5, v3, 0x380

    const/4 v6, 0x0

    move-object/from16 v3, v16

    invoke-static/range {v1 .. v6}, Lh31/l;->c(Lh31/q;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V

    move-object v1, v3

    goto :goto_1c

    :cond_3e
    move-object v0, v2

    move-object v15, v3

    invoke-virtual {v4}, Lp1/q;->X()V

    :goto_1c
    invoke-virtual {v4}, Lp1/q;->u()Lp1/v1;

    move-result-object v7

    if-eqz v7, :cond_3f

    new-instance v0, Lh31/j;

    const/4 v6, 0x2

    move-object/from16 v2, p1

    move/from16 v4, p4

    move/from16 v5, p5

    move-object v3, v15

    invoke-direct/range {v0 .. v6}, Lh31/j;-><init>(Landroidx/compose/ui/Modifier;Lh31/q;Lkotlin/jvm/functions/Function1;III)V

    goto/16 :goto_5

    :cond_3f
    return-void
.end method

.method private static final i(Landroidx/compose/ui/Modifier;Lh31/q;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 6

    or-int/lit8 p3, p3, 0x1

    invoke-static {p3}, Lp1/x;->L(I)I

    move-result v4

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move v5, p4

    move-object v3, p5

    invoke-static/range {v0 .. v5}, Lh31/s;->h(Landroidx/compose/ui/Modifier;Lh31/q;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final j(Lp1/t2;)Lh31/m;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp1/t2;",
            ")",
            "Lh31/m;"
        }
    .end annotation

    invoke-interface {p0}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lh31/m;

    return-object p0
.end method

.method private static final k(Lld1/c;)Ll83/a0;
    .locals 1

    sget-object v0, Lh31/o$d;->a:Lh31/o$d;

    invoke-virtual {p0, v0}, Lld1/c;->g(Ljava/lang/Object;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final l(Lkotlin/jvm/functions/Function1;Lld1/c;Ljava/lang/Object;)Ll83/a0;
    .locals 1

    const-string v0, "event"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p2}, Lh31/t;->d(Ljava/lang/Object;)Lcom/whoop/whoopaction/domain/models/UpdateAction;

    move-result-object v0

    if-nez v0, :cond_0

    invoke-interface {p0, p2}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_0
    new-instance p0, Lh31/o$b;

    invoke-direct {p0, v0}, Lh31/o$b;-><init>(Lcom/whoop/whoopaction/domain/models/UpdateAction;)V

    invoke-virtual {p1, p0}, Lld1/c;->g(Ljava/lang/Object;)V

    :goto_0
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final m(Landroidx/compose/ui/Modifier;Lh31/q;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 6

    or-int/lit8 p3, p3, 0x1

    invoke-static {p3}, Lp1/x;->L(I)I

    move-result v4

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move v5, p4

    move-object v3, p5

    invoke-static/range {v0 .. v5}, Lh31/s;->h(Landroidx/compose/ui/Modifier;Lh31/q;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static final synthetic n(Lp1/t2;)Lh31/m;
    .locals 0

    invoke-static {p0}, Lh31/s;->j(Lp1/t2;)Lh31/m;

    move-result-object p0

    return-object p0
.end method
