.class public abstract Lpq1/f;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u001a7\u0010\u0008\u001a\u00020\u00062\u0008\u0008\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0014\u0008\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0007\u00a2\u0006\u0004\u0008\u0008\u0010\t\u001a7\u0010\u000e\u001a\u00020\u00062\u0008\u0008\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u000b\u001a\u00020\n2\u0014\u0008\u0002\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000c\u0012\u0004\u0012\u00020\u00060\u0004H\u0001\u00a2\u0006\u0004\u0008\u000e\u0010\u000f\u00a8\u0006\u0010\u00b2\u0006\u000c\u0010\u000b\u001a\u00020\n8\nX\u008a\u0084\u0002"
    }
    d2 = {
        "Landroidx/compose/ui/Modifier;",
        "modifier",
        "Lpq1/g;",
        "state",
        "Lkotlin/Function1;",
        "",
        "Ll83/a0;",
        "onViewEvent",
        "g",
        "(Landroidx/compose/ui/Modifier;Lpq1/g;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V",
        "Liq1/a;",
        "viewState",
        "Liq1/c;",
        "onEvent",
        "f",
        "(Landroidx/compose/ui/Modifier;Liq1/a;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V",
        "behavior-impact_release"
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
.method public static synthetic a(Landroidx/compose/ui/Modifier;Lpq1/g;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p6}, Lpq1/f;->k(Landroidx/compose/ui/Modifier;Lpq1/g;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lmq1/a;Liq1/c;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lpq1/f;->j(Lmq1/a;Liq1/c;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Liq1/c;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lpq1/f;->l(Liq1/c;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Ljava/lang/Object;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lpq1/f;->h(Ljava/lang/Object;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic e(Landroidx/compose/ui/Modifier;Liq1/a;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p6}, Lpq1/f;->m(Landroidx/compose/ui/Modifier;Liq1/a;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final f(Landroidx/compose/ui/Modifier;Liq1/a;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V
    .locals 13
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/ui/Modifier;",
            "Liq1/a;",
            "Lkotlin/jvm/functions/Function1;",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    move/from16 v4, p4

    const-string v0, "viewState"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v8, p3

    check-cast v8, Lp1/q;

    const v0, -0x3a27b0eb

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

    move-result v5

    if-eqz v5, :cond_6

    const/16 v5, 0x100

    goto :goto_3

    :cond_6
    const/16 v5, 0x80

    :goto_3
    or-int/2addr v1, v5

    :cond_7
    :goto_4
    and-int/lit16 v5, v1, 0x93

    const/16 v6, 0x92

    const/4 v11, 0x0

    const/4 v12, 0x1

    if-eq v5, v6, :cond_8

    move v5, v12

    goto :goto_5

    :cond_8
    move v5, v11

    :goto_5
    and-int/lit8 v6, v1, 0x1

    invoke-virtual {v8, v6, v5}, Lp1/q;->U(IZ)Z

    move-result v5

    if-eqz v5, :cond_11

    if-eqz v0, :cond_9

    sget-object p0, Lb2/t;->w:Lb2/t;

    :cond_9
    if-eqz v2, :cond_b

    invoke-virtual {v8}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v0

    sget-object v2, Lp1/l;->a:Lp1/v0;

    if-ne v0, v2, :cond_a

    new-instance v0, Lpl0/b;

    const/16 v2, 0x13

    invoke-direct {v0, v2}, Lpl0/b;-><init>(I)V

    invoke-virtual {v8, v0}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_a
    check-cast v0, Lkotlin/jvm/functions/Function1;

    move-object v7, v0

    goto :goto_6

    :cond_b
    move-object v7, p2

    :goto_6
    sget-object v0, Lb2/e;->w:Lb2/m;

    invoke-static {v0, v11}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v0

    iget-wide v2, v8, Lp1/q;->T:J

    invoke-static {v2, v3}, Ljava/lang/Long;->hashCode(J)I

    move-result v2

    invoke-virtual {v8}, Lp1/q;->m()Lp1/p1;

    move-result-object v3

    invoke-static {v8, p0}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v5

    sget-object v6, La3/l;->a:La3/k;

    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v6, La3/k;->b:La3/j;

    invoke-virtual {v8}, Lp1/q;->i0()V

    iget-boolean v9, v8, Lp1/q;->S:Z

    if-eqz v9, :cond_c

    invoke-virtual {v8, v6}, Lp1/q;->l(Lc93/a;)V

    goto :goto_7

    :cond_c
    invoke-virtual {v8}, Lp1/q;->s0()V

    :goto_7
    sget-object v6, La3/k;->g:La3/i;

    invoke-static {v8, v6, v0}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v0, La3/k;->f:La3/i;

    invoke-static {v8, v0, v3}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v0, La3/k;->j:La3/i;

    iget-boolean v3, v8, Lp1/q;->S:Z

    if-nez v3, :cond_d

    invoke-virtual {v8}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-static {v3, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_e

    :cond_d
    invoke-static {v2, v8, v2, v0}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_e
    sget-object v0, La3/k;->d:La3/i;

    invoke-static {v8, v0, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual {p1}, Liq1/a;->b()Liq1/a$b;

    move-result-object v6

    if-nez v6, :cond_f

    const v0, -0x1d6e17f6

    invoke-virtual {v8, v0}, Lp1/q;->e0(I)V

    invoke-virtual {v8, v11}, Lp1/q;->q(Z)V

    goto :goto_8

    :cond_f
    const v0, -0x1d6e17f5

    invoke-virtual {v8, v0}, Lp1/q;->e0(I)V

    and-int/lit16 v9, v1, 0x380

    const/4 v10, 0x1

    const/4 v5, 0x0

    invoke-static/range {v5 .. v10}, Lpq1/d;->g(Landroidx/compose/ui/Modifier;Liq1/a$b;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    invoke-virtual {v8, v11}, Lp1/q;->q(Z)V

    :goto_8
    invoke-virtual {p1}, Liq1/a;->a()Liq1/a$a;

    move-result-object v0

    if-nez v0, :cond_10

    const v0, -0x1d6b3778

    invoke-virtual {v8, v0}, Lp1/q;->e0(I)V

    invoke-virtual {v8, v11}, Lp1/q;->q(Z)V

    goto :goto_9

    :cond_10
    const v2, -0x1d6b3777

    invoke-virtual {v8, v2}, Lp1/q;->e0(I)V

    shr-int/lit8 v1, v1, 0x3

    and-int/lit8 v1, v1, 0x70

    invoke-static {v0, v7, v8, v1}, Lpq1/b;->e(Liq1/a$a;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    invoke-virtual {v8, v11}, Lp1/q;->q(Z)V

    :goto_9
    invoke-virtual {v8, v12}, Lp1/q;->q(Z)V

    move-object v3, v7

    :goto_a
    move-object v1, p0

    goto :goto_b

    :cond_11
    invoke-virtual {v8}, Lp1/q;->X()V

    move-object v3, p2

    goto :goto_a

    :goto_b
    invoke-virtual {v8}, Lp1/q;->u()Lp1/v1;

    move-result-object p0

    if-eqz p0, :cond_12

    new-instance v0, Lot1/f;

    const/16 v6, 0x13

    move-object v2, p1

    move/from16 v5, p5

    invoke-direct/range {v0 .. v6}, Lot1/f;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;III)V

    iput-object v0, p0, Lp1/v1;->d:Lc93/m;

    :cond_12
    return-void
.end method

.method public static final g(Landroidx/compose/ui/Modifier;Lpq1/g;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V
    .locals 20
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/ui/Modifier;",
            "Lpq1/g;",
            "Lkotlin/jvm/functions/Function1;",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    move-object/from16 v2, p1

    const-string v0, "state"

    invoke-static {v2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v6, p3

    check-cast v6, Lp1/q;

    const v0, 0x45a2b7a5

    invoke-virtual {v6, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, p5, 0x1

    if-eqz v0, :cond_0

    or-int/lit8 v1, p4, 0x6

    move v3, v1

    move-object/from16 v1, p0

    goto :goto_1

    :cond_0
    and-int/lit8 v1, p4, 0x6

    if-nez v1, :cond_2

    move-object/from16 v1, p0

    invoke-virtual {v6, v1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_1

    const/4 v3, 0x4

    goto :goto_0

    :cond_1
    const/4 v3, 0x2

    :goto_0
    or-int v3, p4, v3

    goto :goto_1

    :cond_2
    move-object/from16 v1, p0

    move/from16 v3, p4

    :goto_1
    and-int/lit8 v4, p4, 0x30

    if-nez v4, :cond_4

    invoke-virtual {v6, v2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_3

    const/16 v4, 0x20

    goto :goto_2

    :cond_3
    const/16 v4, 0x10

    :goto_2
    or-int/2addr v3, v4

    :cond_4
    move v9, v3

    and-int/lit8 v3, v9, 0x13

    const/16 v4, 0x12

    const/4 v5, 0x0

    if-eq v3, v4, :cond_5

    const/4 v3, 0x1

    goto :goto_3

    :cond_5
    move v3, v5

    :goto_3
    and-int/lit8 v4, v9, 0x1

    invoke-virtual {v6, v4, v3}, Lp1/q;->U(IZ)Z

    move-result v3

    if-eqz v3, :cond_17

    if-eqz v0, :cond_6

    sget-object v0, Lb2/t;->w:Lb2/t;

    goto :goto_4

    :cond_6
    move-object v0, v1

    :goto_4
    and-int/lit8 v1, p5, 0x4

    sget-object v10, Lp1/l;->a:Lp1/v0;

    if-eqz v1, :cond_8

    invoke-virtual {v6}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v10, :cond_7

    new-instance v1, Lpl0/b;

    const/16 v3, 0x14

    invoke-direct {v1, v3}, Lpl0/b;-><init>(I)V

    invoke-virtual {v6, v1}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_7
    check-cast v1, Lkotlin/jvm/functions/Function1;

    goto :goto_5

    :cond_8
    move-object/from16 v1, p2

    :goto_5
    invoke-virtual {v2}, Lpq1/g;->b()Liq1/a;

    move-result-object v12

    const v3, 0x51c1188b

    invoke-virtual {v6, v3}, Lp1/q;->e0(I)V

    sget-object v3, Lx81/d;->a:Lx81/d;

    const/4 v4, 0x6

    invoke-virtual {v3, v6, v4}, Lx81/d;->c(Landroidx/compose/runtime/Composer;I)Lcom/whoop/data/repositories/FeatureFlagChecker;

    move-result-object v3

    const-string v4, "safe-design-view-model-injection-android"

    invoke-interface {v3, v4}, Lcom/whoop/data/repositories/FeatureFlagChecker;->isFeatureEnabled(Ljava/lang/String;)Z

    move-result v3

    const-class v4, Lmq1/a;

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v15, 0x0

    if-nez v3, :cond_f

    const v3, -0x2a32dbfc

    invoke-virtual {v6, v3}, Lp1/q;->e0(I)V

    invoke-static {v6}, Lm8/a;->a(Landroidx/compose/runtime/Composer;)Landroidx/lifecycle/f2;

    move-result-object v14

    if-nez v14, :cond_9

    const v3, -0x2a322beb

    invoke-virtual {v6, v3}, Lp1/q;->e0(I)V

    invoke-virtual {v6, v5}, Lp1/q;->q(Z)V

    move-object v11, v7

    move-object v3, v8

    goto :goto_8

    :cond_9
    const v3, -0x2a322bea

    invoke-virtual {v6, v3}, Lp1/q;->e0(I)V

    sget-object v3, Landroidx/compose/ui/platform/AndroidCompositionLocals_androidKt;->b:Lp1/u2;

    invoke-virtual {v6, v3}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Landroid/content/Context;

    invoke-virtual {v3}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v3

    const-string v11, "null cannot be cast to non-null type android.app.Application"

    invoke-static {v3, v11}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v13, v3

    check-cast v13, Landroid/app/Application;

    invoke-virtual {v6, v8}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v3

    invoke-virtual {v6, v12}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v11

    or-int/2addr v3, v11

    invoke-virtual {v6, v15}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v11

    or-int/2addr v3, v11

    invoke-virtual {v6}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v11

    if-nez v3, :cond_b

    if-ne v11, v10, :cond_a

    goto :goto_6

    :cond_a
    move-object v3, v8

    goto :goto_7

    :cond_b
    :goto_6
    sget-object v3, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v3, v4}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v3

    new-instance v4, Lld1/b;

    invoke-direct {v4, v12}, Lld1/b;-><init>(Ljava/lang/Object;)V

    move-object/from16 v17, v4

    move-object/from16 v18, v8

    move-object/from16 v16, v15

    move-object v15, v3

    invoke-static/range {v13 .. v18}, Lld1/d;->b(Landroid/app/Application;Landroidx/lifecycle/f2;Lj93/d;Lc93/a;Lld1/c;Ljava/lang/String;)Lld1/c;

    move-result-object v11

    move-object/from16 v15, v16

    move-object/from16 v3, v18

    invoke-virtual {v6, v11}, Lp1/q;->p0(Ljava/lang/Object;)V

    :goto_7
    check-cast v11, Lld1/c;

    invoke-virtual {v6, v5}, Lp1/q;->q(Z)V

    :goto_8
    if-nez v11, :cond_e

    const v4, -0x2a2a887e

    invoke-virtual {v6, v4}, Lp1/q;->e0(I)V

    invoke-virtual {v6, v3}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v3

    invoke-virtual {v6, v12}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v4

    or-int/2addr v3, v4

    invoke-virtual {v6, v15}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v4

    or-int/2addr v3, v4

    invoke-virtual {v6}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    if-nez v3, :cond_c

    if-ne v4, v10, :cond_d

    :cond_c
    new-instance v4, Lld1/b;

    invoke-direct {v4, v12}, Lld1/b;-><init>(Ljava/lang/Object;)V

    invoke-virtual {v6, v4}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_d
    move-object v11, v4

    check-cast v11, Lld1/b;

    invoke-virtual {v6, v5}, Lp1/q;->q(Z)V

    goto :goto_9

    :cond_e
    const v3, -0x1a22aa39

    invoke-virtual {v6, v3}, Lp1/q;->e0(I)V

    invoke-virtual {v6, v5}, Lp1/q;->q(Z)V

    :goto_9
    invoke-virtual {v6, v5}, Lp1/q;->q(Z)V

    :goto_a
    invoke-virtual {v6, v5}, Lp1/q;->q(Z)V

    goto :goto_c

    :cond_f
    move-object v3, v8

    const v8, -0x2a28ba09

    invoke-static {v6, v8, v5, v6}, Ld;->f(Lp1/q;IZLp1/q;)Landroidx/lifecycle/f2;

    move-result-object v11

    sget-object v8, Landroidx/compose/ui/platform/AndroidCompositionLocals_androidKt;->b:Lp1/u2;

    invoke-virtual {v6, v8}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Landroid/content/Context;

    invoke-virtual {v8}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;

    move-result-object v8

    instance-of v13, v8, Landroid/app/Application;

    if-eqz v13, :cond_10

    check-cast v8, Landroid/app/Application;

    move-object v13, v8

    goto :goto_b

    :cond_10
    move-object v13, v7

    :goto_b
    invoke-virtual {v6, v3}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v8

    invoke-virtual {v6, v12}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v14

    or-int/2addr v8, v14

    invoke-virtual {v6, v15}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v14

    or-int/2addr v8, v14

    invoke-virtual {v6}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v14

    if-nez v8, :cond_11

    if-ne v14, v10, :cond_12

    :cond_11
    sget-object v8, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v8, v4}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v14

    move-object/from16 v16, v3

    invoke-static/range {v11 .. v16}, Lld1/d;->d(Landroidx/lifecycle/f2;Ljava/lang/Object;Landroid/app/Application;Lj93/d;Lc93/a;Ljava/lang/String;)Lld1/c;

    move-result-object v14

    invoke-virtual {v6, v14}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_12
    move-object v11, v14

    check-cast v11, Lld1/c;

    goto :goto_a

    :goto_c
    const-string v3, "null cannot be cast to non-null type com.whoop.impacts.details.presentation.journaltrends.BehaviorDetailsImpactJournalTrendsViewModel"

    invoke-static {v11, v3}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v11, Lmq1/a;

    invoke-virtual {v11}, Lmq1/a;->getViewState()Lec3/l;

    move-result-object v3

    invoke-virtual {v2}, Lpq1/g;->b()Liq1/a;

    move-result-object v4

    move-object v5, v7

    const/4 v7, 0x0

    const/4 v8, 0x2

    move-object v12, v5

    const/4 v5, 0x0

    invoke-static/range {v3 .. v8}, Lp1/x;->n(Lec3/l;Ljava/lang/Object;Lq83/j;Landroidx/compose/runtime/Composer;II)Lp1/c1;

    move-result-object v3

    invoke-virtual {v6, v11}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v4

    invoke-virtual {v6, v2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v5

    or-int/2addr v4, v5

    invoke-virtual {v6}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    if-nez v4, :cond_13

    if-ne v5, v10, :cond_14

    :cond_13
    new-instance v5, Lpq1/f$a;

    invoke-direct {v5, v11, v2, v12}, Lpq1/f$a;-><init>(Lmq1/a;Lpq1/g;Lq83/d;)V

    invoke-virtual {v6, v5}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_14
    check-cast v5, Lc93/m;

    invoke-static {v6, v5, v11}, Lp1/x;->g(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v3}, Lpq1/f;->i(Lp1/t2;)Liq1/a;

    move-result-object v4

    invoke-virtual {v6, v11}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v3

    invoke-virtual {v6}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    if-nez v3, :cond_15

    if-ne v5, v10, :cond_16

    :cond_15
    new-instance v5, Lpf/b;

    const/4 v3, 0x7

    invoke-direct {v5, v11, v3}, Lpf/b;-><init>(Ljava/lang/Object;I)V

    invoke-virtual {v6, v5}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_16
    check-cast v5, Lkotlin/jvm/functions/Function1;

    and-int/lit8 v7, v9, 0xe

    const/4 v8, 0x0

    move-object v3, v0

    invoke-static/range {v3 .. v8}, Lpq1/f;->f(Landroidx/compose/ui/Modifier;Liq1/a;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    move-object/from16 v19, v3

    move-object v3, v1

    move-object/from16 v1, v19

    goto :goto_d

    :cond_17
    invoke-virtual {v6}, Lp1/q;->X()V

    move-object/from16 v3, p2

    :goto_d
    invoke-virtual {v6}, Lp1/q;->u()Lp1/v1;

    move-result-object v7

    if-eqz v7, :cond_18

    new-instance v0, Lot1/f;

    const/16 v6, 0x14

    move/from16 v4, p4

    move/from16 v5, p5

    invoke-direct/range {v0 .. v6}, Lot1/f;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;III)V

    iput-object v0, v7, Lp1/v1;->d:Lc93/m;

    :cond_18
    return-void
.end method

.method private static final h(Ljava/lang/Object;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final i(Lp1/t2;)Liq1/a;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp1/t2;",
            ")",
            "Liq1/a;"
        }
    .end annotation

    invoke-interface {p0}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Liq1/a;

    return-object p0
.end method

.method private static final j(Lmq1/a;Liq1/c;)Ll83/a0;
    .locals 1

    const-string v0, "event"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p1, Liq1/c$f;

    if-eqz v0, :cond_0

    check-cast p1, Liq1/c$f;

    invoke-virtual {p0, p1}, Lmq1/a;->o(Liq1/c$f;)V

    :cond_0
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final k(Landroidx/compose/ui/Modifier;Lpq1/g;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 6

    or-int/lit8 p3, p3, 0x1

    invoke-static {p3}, Lp1/x;->L(I)I

    move-result v4

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move v5, p4

    move-object v3, p5

    invoke-static/range {v0 .. v5}, Lpq1/f;->g(Landroidx/compose/ui/Modifier;Lpq1/g;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final l(Liq1/c;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final m(Landroidx/compose/ui/Modifier;Liq1/a;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 6

    or-int/lit8 p3, p3, 0x1

    invoke-static {p3}, Lp1/x;->L(I)I

    move-result v4

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move v5, p4

    move-object v3, p5

    invoke-static/range {v0 .. v5}, Lpq1/f;->f(Landroidx/compose/ui/Modifier;Liq1/a;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method
