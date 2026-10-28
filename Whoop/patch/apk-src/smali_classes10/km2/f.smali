.class public abstract Lkm2/f;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u001a7\u0010\u0008\u001a\u00020\u00062\u0008\u0008\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0014\u0008\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0007\u00a2\u0006\u0004\u0008\u0008\u0010\t\u001a7\u0010\u000e\u001a\u00020\u00062\u0008\u0008\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\n2\u0014\u0008\u0002\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000c\u0012\u0004\u0012\u00020\u00060\u0004H\u0001\u00a2\u0006\u0004\u0008\u000e\u0010\u000f\u00a8\u0006\u0012\u00b2\u0006\u000c\u0010\u0011\u001a\u00020\u00108\nX\u008a\u0084\u0002\u00b2\u0006\u000c\u0010\u000b\u001a\u00020\n8\nX\u008a\u0084\u0002"
    }
    d2 = {
        "Landroidx/compose/ui/Modifier;",
        "modifier",
        "Lkm2/g;",
        "state",
        "Lkotlin/Function1;",
        "",
        "Ll83/a0;",
        "onViewEvent",
        "g",
        "(Landroidx/compose/ui/Modifier;Lkm2/g;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V",
        "Lim2/c;",
        "viewState",
        "Lim2/a;",
        "onEvent",
        "f",
        "(Landroidx/compose/ui/Modifier;Lim2/c;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V",
        "Lhm2/a;",
        "actionRouter",
        "trends-mini-arch_release"
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
.method public static synthetic a(Lim2/b;Lkotlin/jvm/functions/Function1;Ll83/h;Lim2/a;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lkm2/f;->k(Lim2/b;Lkotlin/jvm/functions/Function1;Ll83/h;Lim2/a;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lim2/a;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lkm2/f;->m(Lim2/a;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Ljava/lang/Object;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lkm2/f;->h(Ljava/lang/Object;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Landroidx/compose/ui/Modifier;Lim2/c;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p6}, Lkm2/f;->n(Landroidx/compose/ui/Modifier;Lim2/c;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic e(Landroidx/compose/ui/Modifier;Lkm2/g;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p6}, Lkm2/f;->l(Landroidx/compose/ui/Modifier;Lkm2/g;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final f(Landroidx/compose/ui/Modifier;Lim2/c;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V
    .locals 12
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/ui/Modifier;",
            "Lim2/c;",
            "Lkotlin/jvm/functions/Function1;",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    move/from16 v4, p4

    const-string v0, "viewState"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v8, p3

    check-cast v8, Lp1/q;

    const v0, 0x4dd8c681    # 4.5461098E8f

    invoke-virtual {v8, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, p5, 0x1

    if-eqz v0, :cond_0

    or-int/lit8 v1, v4, 0x6

    goto :goto_1

    :cond_0
    and-int/lit8 v1, v4, 0x6

    if-nez v1, :cond_2

    invoke-virtual {v8, p0}, Lp1/q;->g(Ljava/lang/Object;)Z

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

    invoke-virtual {v8, p1}, Lp1/q;->i(Ljava/lang/Object;)Z

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

    invoke-virtual {v8, p2}, Lp1/q;->i(Ljava/lang/Object;)Z

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

    const/4 v11, 0x0

    if-eq v3, v5, :cond_8

    const/4 v3, 0x1

    goto :goto_5

    :cond_8
    move v3, v11

    :goto_5
    and-int/lit8 v5, v1, 0x1

    invoke-virtual {v8, v5, v3}, Lp1/q;->U(IZ)Z

    move-result v3

    if-eqz v3, :cond_e

    if-eqz v0, :cond_9

    sget-object p0, Lb2/t;->w:Lb2/t;

    :cond_9
    move-object v5, p0

    if-eqz v2, :cond_b

    invoke-virtual {v8}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object p0

    sget-object p2, Lp1/l;->a:Lp1/v0;

    if-ne p0, p2, :cond_a

    new-instance p0, Lkm2/e;

    const/4 p2, 0x0

    invoke-direct {p0, p2}, Lkm2/e;-><init>(I)V

    invoke-virtual {v8, p0}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_a
    move-object p2, p0

    check-cast p2, Lkotlin/jvm/functions/Function1;

    :cond_b
    move-object v7, p2

    invoke-virtual {p1}, Lim2/c;->a()Lim2/c$a;

    move-result-object p0

    if-eqz p0, :cond_c

    const p0, 0x3ac1446c

    invoke-virtual {v8, p0}, Lp1/q;->e0(I)V

    invoke-virtual {p1}, Lim2/c;->a()Lim2/c$a;

    move-result-object p0

    shr-int/lit8 p2, v1, 0x3

    and-int/lit8 p2, p2, 0x70

    invoke-static {p0, v7, v8, p2}, Lkm2/b;->e(Lim2/c$a;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    invoke-virtual {v8, v11}, Lp1/q;->q(Z)V

    goto :goto_6

    :cond_c
    invoke-virtual {p1}, Lim2/c;->b()Lim2/c$b;

    move-result-object p0

    if-eqz p0, :cond_d

    const p0, 0x1d691ca1

    invoke-virtual {v8, p0}, Lp1/q;->e0(I)V

    invoke-virtual {p1}, Lim2/c;->b()Lim2/c$b;

    move-result-object v6

    and-int/lit16 v9, v1, 0x38e

    const/4 v10, 0x0

    invoke-static/range {v5 .. v10}, Lkm2/c;->n(Landroidx/compose/ui/Modifier;Lim2/c$b;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    invoke-virtual {v8, v11}, Lp1/q;->q(Z)V

    goto :goto_6

    :cond_d
    const p0, 0x1d6b1461

    invoke-virtual {v8, p0}, Lp1/q;->e0(I)V

    invoke-virtual {v8, v11}, Lp1/q;->q(Z)V

    :goto_6
    move-object v1, v5

    move-object v3, v7

    goto :goto_7

    :cond_e
    invoke-virtual {v8}, Lp1/q;->X()V

    move-object v1, p0

    move-object v3, p2

    :goto_7
    invoke-virtual {v8}, Lp1/q;->u()Lp1/v1;

    move-result-object p0

    if-eqz p0, :cond_f

    new-instance v0, Ljp1/d;

    const/16 v6, 0x11

    move-object v2, p1

    move/from16 v5, p5

    invoke-direct/range {v0 .. v6}, Ljp1/d;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;III)V

    iput-object v0, p0, Lp1/v1;->d:Lc93/m;

    :cond_f
    return-void
.end method

.method public static final g(Landroidx/compose/ui/Modifier;Lkm2/g;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V
    .locals 22
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/ui/Modifier;",
            "Lkm2/g;",
            "Lkotlin/jvm/functions/Function1;",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    move-object/from16 v2, p1

    move/from16 v4, p4

    const-string v0, "state"

    invoke-static {v2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v8, p3

    check-cast v8, Lp1/q;

    const v0, 0xb03c9a

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

    if-nez v5, :cond_4

    invoke-virtual {v8, v2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_3

    const/16 v5, 0x20

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

    if-eqz v7, :cond_1e

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

    new-instance v5, Lkm2/e;

    const/4 v6, 0x1

    invoke-direct {v5, v6}, Lkm2/e;-><init>(I)V

    invoke-virtual {v8, v5}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_a
    check-cast v5, Lkotlin/jvm/functions/Function1;

    move-object v14, v5

    goto :goto_7

    :cond_b
    move-object v14, v6

    :goto_7
    const v5, 0x717a6169

    invoke-virtual {v8, v5}, Lp1/q;->f0(I)V

    sget-object v5, Lpf3/a;->b:Lnf3/a;

    if-eqz v5, :cond_1d

    iget-object v5, v5, Lnf3/a;->a:Lwf3/a;

    iget-object v5, v5, Lwf3/a;->d:Lxf3/c;

    const v6, -0x384098

    invoke-virtual {v8, v6}, Lp1/q;->f0(I)V

    const/4 v15, 0x0

    invoke-virtual {v8, v15}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v6

    invoke-virtual {v8, v15}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v7

    or-int/2addr v6, v7

    invoke-virtual {v8}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v7

    if-nez v6, :cond_c

    if-ne v7, v1, :cond_d

    :cond_c
    sget-object v6, Ll83/i;->y:Ll83/i;

    new-instance v7, Lkm2/f$a;

    invoke-direct {v7, v5, v15, v15}, Lkm2/f$a;-><init>(Lxf3/c;Lvf3/a;Lc93/a;)V

    invoke-static {v6, v7}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v7

    invoke-virtual {v8, v7}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_d
    invoke-virtual {v8, v12}, Lp1/q;->q(Z)V

    check-cast v7, Ll83/h;

    invoke-virtual {v8, v12}, Lp1/q;->q(Z)V

    invoke-virtual {v2}, Lkm2/g;->b()Lim2/c;

    move-result-object v5

    const v6, 0x51c1188b

    invoke-virtual {v8, v6}, Lp1/q;->e0(I)V

    sget-object v6, Lx81/d;->a:Lx81/d;

    const/4 v9, 0x6

    invoke-virtual {v6, v8, v9}, Lx81/d;->c(Landroidx/compose/runtime/Composer;I)Lcom/whoop/data/repositories/FeatureFlagChecker;

    move-result-object v6

    const-string v9, "safe-design-view-model-injection-android"

    invoke-interface {v6, v9}, Lcom/whoop/data/repositories/FeatureFlagChecker;->isFeatureEnabled(Ljava/lang/String;)Z

    move-result v6

    const-class v9, Lim2/b;

    const/4 v10, 0x0

    const/4 v13, 0x0

    if-nez v6, :cond_14

    const v6, -0x2a32dbfc

    invoke-virtual {v8, v6}, Lp1/q;->e0(I)V

    invoke-static {v8}, Lm8/a;->a(Landroidx/compose/runtime/Composer;)Landroidx/lifecycle/f2;

    move-result-object v17

    if-nez v17, :cond_e

    const v6, -0x2a322beb

    invoke-virtual {v8, v6}, Lp1/q;->e0(I)V

    invoke-virtual {v8, v12}, Lp1/q;->q(Z)V

    move-object v6, v10

    move-object v10, v13

    move-object v11, v15

    goto :goto_a

    :cond_e
    const v6, -0x2a322bea

    invoke-virtual {v8, v6}, Lp1/q;->e0(I)V

    sget-object v6, Landroidx/compose/ui/platform/AndroidCompositionLocals_androidKt;->b:Lp1/u2;

    invoke-virtual {v8, v6}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Landroid/content/Context;

    invoke-virtual {v6}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v6

    const-string v11, "null cannot be cast to non-null type android.app.Application"

    invoke-static {v6, v11}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v16, v6

    check-cast v16, Landroid/app/Application;

    invoke-virtual {v8, v10}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v6

    invoke-virtual {v8, v5}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v11

    or-int/2addr v6, v11

    invoke-virtual {v8, v13}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v11

    or-int/2addr v6, v11

    invoke-virtual {v8}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v11

    if-nez v6, :cond_10

    if-ne v11, v1, :cond_f

    goto :goto_8

    :cond_f
    move-object v6, v10

    move-object v10, v13

    goto :goto_9

    :cond_10
    :goto_8
    sget-object v6, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v6, v9}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v18

    new-instance v6, Lld1/b;

    invoke-direct {v6, v5}, Lld1/b;-><init>(Ljava/lang/Object;)V

    move-object/from16 v20, v6

    move-object/from16 v21, v10

    move-object/from16 v19, v13

    invoke-static/range {v16 .. v21}, Lld1/d;->b(Landroid/app/Application;Landroidx/lifecycle/f2;Lj93/d;Lc93/a;Lld1/c;Ljava/lang/String;)Lld1/c;

    move-result-object v11

    move-object/from16 v10, v19

    move-object/from16 v6, v21

    invoke-virtual {v8, v11}, Lp1/q;->p0(Ljava/lang/Object;)V

    :goto_9
    check-cast v11, Lld1/c;

    invoke-virtual {v8, v12}, Lp1/q;->q(Z)V

    :goto_a
    if-nez v11, :cond_13

    const v9, -0x2a2a887e

    invoke-virtual {v8, v9}, Lp1/q;->e0(I)V

    invoke-virtual {v8, v6}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v6

    invoke-virtual {v8, v5}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v9

    or-int/2addr v6, v9

    invoke-virtual {v8, v10}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v9

    or-int/2addr v6, v9

    invoke-virtual {v8}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v9

    if-nez v6, :cond_11

    if-ne v9, v1, :cond_12

    :cond_11
    new-instance v9, Lld1/b;

    invoke-direct {v9, v5}, Lld1/b;-><init>(Ljava/lang/Object;)V

    invoke-virtual {v8, v9}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_12
    move-object v11, v9

    check-cast v11, Lld1/b;

    invoke-virtual {v8, v12}, Lp1/q;->q(Z)V

    goto :goto_b

    :cond_13
    const v5, -0x1a22aa39

    invoke-virtual {v8, v5}, Lp1/q;->e0(I)V

    invoke-virtual {v8, v12}, Lp1/q;->q(Z)V

    :goto_b
    invoke-virtual {v8, v12}, Lp1/q;->q(Z)V

    :goto_c
    invoke-virtual {v8, v12}, Lp1/q;->q(Z)V

    goto :goto_e

    :cond_14
    move-object v6, v10

    move-object v10, v13

    const v11, -0x2a28ba09

    invoke-static {v8, v11, v12, v8}, Ld;->f(Lp1/q;IZLp1/q;)Landroidx/lifecycle/f2;

    move-result-object v16

    sget-object v11, Landroidx/compose/ui/platform/AndroidCompositionLocals_androidKt;->b:Lp1/u2;

    invoke-virtual {v8, v11}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v11

    check-cast v11, Landroid/content/Context;

    invoke-virtual {v11}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v11

    instance-of v13, v11, Landroid/app/Application;

    if-eqz v13, :cond_15

    check-cast v11, Landroid/app/Application;

    move-object/from16 v18, v11

    goto :goto_d

    :cond_15
    move-object/from16 v18, v15

    :goto_d
    invoke-virtual {v8, v6}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v11

    invoke-virtual {v8, v5}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v13

    or-int/2addr v11, v13

    invoke-virtual {v8, v10}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v13

    or-int/2addr v11, v13

    invoke-virtual {v8}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v13

    if-nez v11, :cond_16

    if-ne v13, v1, :cond_17

    :cond_16
    sget-object v11, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v11, v9}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v19

    move-object/from16 v17, v5

    move-object/from16 v21, v6

    move-object/from16 v20, v10

    invoke-static/range {v16 .. v21}, Lld1/d;->d(Landroidx/lifecycle/f2;Ljava/lang/Object;Landroid/app/Application;Lj93/d;Lc93/a;Ljava/lang/String;)Lld1/c;

    move-result-object v13

    invoke-virtual {v8, v13}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_17
    move-object v11, v13

    check-cast v11, Lld1/c;

    goto :goto_c

    :goto_e
    const-string v5, "null cannot be cast to non-null type com.whoop.trendsminiarch.presentation.TrendsMiniArchViewModel"

    invoke-static {v11, v5}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v11, Lim2/b;

    invoke-virtual {v11}, Lim2/b;->getViewState()Lec3/l;

    move-result-object v5

    invoke-virtual {v2}, Lkm2/g;->b()Lim2/c;

    move-result-object v6

    const/4 v9, 0x0

    const/4 v10, 0x2

    move-object v13, v7

    const/4 v7, 0x0

    invoke-static/range {v5 .. v10}, Lp1/x;->n(Lec3/l;Ljava/lang/Object;Lq83/j;Landroidx/compose/runtime/Composer;II)Lp1/c1;

    move-result-object v5

    invoke-virtual {v8, v11}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v6

    invoke-virtual {v8, v2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v7

    or-int/2addr v6, v7

    invoke-virtual {v8}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v7

    if-nez v6, :cond_18

    if-ne v7, v1, :cond_19

    :cond_18
    new-instance v7, Lkm2/f$b;

    invoke-direct {v7, v11, v2, v15}, Lkm2/f$b;-><init>(Lim2/b;Lkm2/g;Lq83/d;)V

    invoke-virtual {v8, v7}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_19
    check-cast v7, Lc93/m;

    invoke-static {v8, v7, v11}, Lp1/x;->g(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v5}, Lkm2/f;->j(Lp1/t2;)Lim2/c;

    move-result-object v6

    invoke-virtual {v8, v13}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v5

    invoke-virtual {v8, v11}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v7

    or-int/2addr v5, v7

    and-int/lit16 v7, v3, 0x380

    const/16 v9, 0x100

    if-ne v7, v9, :cond_1a

    const/4 v12, 0x1

    :cond_1a
    or-int/2addr v5, v12

    invoke-virtual {v8}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v7

    if-nez v5, :cond_1b

    if-ne v7, v1, :cond_1c

    :cond_1b
    new-instance v7, Ljs2/h;

    const/4 v1, 0x4

    invoke-direct {v7, v11, v14, v13, v1}, Ljs2/h;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    invoke-virtual {v8, v7}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_1c
    check-cast v7, Lkotlin/jvm/functions/Function1;

    and-int/lit8 v9, v3, 0xe

    const/4 v10, 0x0

    move-object v5, v0

    invoke-static/range {v5 .. v10}, Lkm2/f;->f(Landroidx/compose/ui/Modifier;Lim2/c;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    move-object v1, v5

    move-object v3, v14

    goto :goto_f

    :cond_1d
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "KoinApplication has not been started"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1e
    invoke-virtual {v8}, Lp1/q;->X()V

    move-object v3, v6

    :goto_f
    invoke-virtual {v8}, Lp1/q;->u()Lp1/v1;

    move-result-object v7

    if-eqz v7, :cond_1f

    new-instance v0, Ljp1/d;

    const/16 v6, 0x12

    move/from16 v5, p5

    invoke-direct/range {v0 .. v6}, Ljp1/d;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;III)V

    iput-object v0, v7, Lp1/v1;->d:Lc93/m;

    :cond_1f
    return-void
.end method

.method private static final h(Ljava/lang/Object;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final i(Ll83/h;)Lhm2/a;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ll83/h;",
            ")",
            "Lhm2/a;"
        }
    .end annotation

    invoke-interface {p0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lhm2/a;

    return-object p0
.end method

.method private static final j(Lp1/t2;)Lim2/c;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp1/t2;",
            ")",
            "Lim2/c;"
        }
    .end annotation

    invoke-interface {p0}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lim2/c;

    return-object p0
.end method

.method private static final k(Lim2/b;Lkotlin/jvm/functions/Function1;Ll83/h;Lim2/a;)Ll83/a0;
    .locals 1

    const-string v0, "event"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p2}, Lkm2/f;->i(Ll83/h;)Lhm2/a;

    move-result-object p2

    invoke-virtual {p2, p3}, Lhm2/a;->b(Lim2/a;)Lim2/a;

    move-result-object p2

    instance-of p3, p2, Lim2/a$f;

    if-eqz p3, :cond_0

    check-cast p2, Lim2/a$f;

    invoke-virtual {p0, p2}, Lim2/b;->o(Lim2/a$f;)V

    goto :goto_0

    :cond_0
    instance-of p0, p2, Lim2/a$c;

    if-eqz p0, :cond_1

    invoke-interface {p1, p2}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_1
    :goto_0
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final l(Landroidx/compose/ui/Modifier;Lkm2/g;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 6

    or-int/lit8 p3, p3, 0x1

    invoke-static {p3}, Lp1/x;->L(I)I

    move-result v4

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move v5, p4

    move-object v3, p5

    invoke-static/range {v0 .. v5}, Lkm2/f;->g(Landroidx/compose/ui/Modifier;Lkm2/g;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final m(Lim2/a;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final n(Landroidx/compose/ui/Modifier;Lim2/c;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 6

    or-int/lit8 p3, p3, 0x1

    invoke-static {p3}, Lp1/x;->L(I)I

    move-result v4

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move v5, p4

    move-object v3, p5

    invoke-static/range {v0 .. v5}, Lkm2/f;->f(Landroidx/compose/ui/Modifier;Lim2/c;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method
