.class public abstract Lzi1/h;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u001a!\u0010\u0005\u001a\u00020\u00042\u0008\u0008\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0001\u00a2\u0006\u0004\u0008\u0005\u0010\u0006\u00a8\u0006\t\u00b2\u0006\u000c\u0010\u0008\u001a\u00020\u00078\nX\u008a\u0084\u0002"
    }
    d2 = {
        "Lyi1/b;",
        "viewModel",
        "Lxi1/b;",
        "navRouter",
        "Ll83/a0;",
        "d",
        "(Lyi1/b;Lxi1/b;Landroidx/compose/runtime/Composer;II)V",
        "Lyi1/d;",
        "viewState",
        "kennel_release"
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
.method public static synthetic a(Lyi1/b;Lxi1/b;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p5}, Lzi1/h;->h(Lyi1/b;Lxi1/b;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lyi1/b;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lzi1/h;->f(Lyi1/b;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Lxi1/b;Ljava/lang/Object;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lzi1/h;->g(Lxi1/b;Ljava/lang/Object;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final d(Lyi1/b;Lxi1/b;Landroidx/compose/runtime/Composer;II)V
    .locals 17

    move-object/from16 v3, p1

    const-string v0, "navRouter"

    invoke-static {v3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v7, p2

    check-cast v7, Lp1/q;

    const v0, 0x53850696

    invoke-virtual {v7, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, p3, 0x6

    if-nez v0, :cond_2

    and-int/lit8 v0, p4, 0x1

    if-nez v0, :cond_0

    move-object/from16 v0, p0

    invoke-virtual {v7, v0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_1

    const/4 v1, 0x4

    goto :goto_0

    :cond_0
    move-object/from16 v0, p0

    :cond_1
    const/4 v1, 0x2

    :goto_0
    or-int v1, p3, v1

    goto :goto_1

    :cond_2
    move-object/from16 v0, p0

    move/from16 v1, p3

    :goto_1
    and-int/lit8 v2, p3, 0x30

    if-nez v2, :cond_4

    invoke-virtual {v7, v3}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_3

    const/16 v2, 0x20

    goto :goto_2

    :cond_3
    const/16 v2, 0x10

    :goto_2
    or-int/2addr v1, v2

    :cond_4
    and-int/lit8 v2, v1, 0x13

    const/16 v4, 0x12

    const/4 v5, 0x1

    const/4 v10, 0x0

    if-eq v2, v4, :cond_5

    move v2, v5

    goto :goto_3

    :cond_5
    move v2, v10

    :goto_3
    and-int/2addr v1, v5

    invoke-virtual {v7, v1, v2}, Lp1/q;->U(IZ)Z

    move-result v1

    if-eqz v1, :cond_15

    invoke-virtual {v7}, Lp1/q;->Z()V

    and-int/lit8 v1, p3, 0x1

    sget-object v2, Lp1/l;->a:Lp1/v0;

    if-eqz v1, :cond_7

    invoke-virtual {v7}, Lp1/q;->C()Z

    move-result v1

    if-eqz v1, :cond_6

    goto :goto_4

    :cond_6
    invoke-virtual {v7}, Lp1/q;->X()V

    and-int/lit8 v1, p4, 0x1

    goto :goto_5

    :cond_7
    :goto_4
    and-int/lit8 v1, p4, 0x1

    if-eqz v1, :cond_b

    const v0, 0x59f3c69b

    invoke-virtual {v7, v0}, Lp1/q;->f0(I)V

    sget-object v0, Lpf3/a;->b:Lnf3/a;

    if-eqz v0, :cond_a

    iget-object v0, v0, Lnf3/a;->a:Lwf3/a;

    iget-object v11, v0, Lwf3/a;->d:Lxf3/c;

    const v0, 0x59f3c7cc

    const v1, -0x384098

    invoke-static {v7, v0, v7, v10, v1}, Lvl/b;->r(Lp1/q;ILp1/q;ZI)Ljf3/a;

    move-result-object v0

    const/4 v12, 0x0

    invoke-virtual {v7, v12}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v1

    const/4 v4, 0x0

    invoke-virtual {v7, v4}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v5

    or-int/2addr v1, v5

    invoke-virtual {v7}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    if-nez v1, :cond_8

    if-ne v5, v2, :cond_9

    :cond_8
    new-instance v13, Lzi1/h$a;

    invoke-direct {v13, v0}, Lzi1/h$a;-><init>(Ljf3/a;)V

    const-class v0, Lyi1/b;

    sget-object v1, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v1, v0}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v14

    const/4 v15, 0x0

    move-object/from16 v16, v4

    invoke-static/range {v11 .. v16}, Ljc/x;->X(Lxf3/c;Lvf3/a;Lc93/a;Lj93/d;Lc93/a;Lc93/a;)Landroidx/lifecycle/w1;

    move-result-object v5

    invoke-virtual {v7, v5}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_9
    invoke-virtual {v7, v10}, Lp1/q;->q(Z)V

    check-cast v5, Landroidx/lifecycle/w1;

    invoke-virtual {v7, v10}, Lp1/q;->q(Z)V

    move-object v0, v5

    check-cast v0, Lyi1/b;

    goto :goto_5

    :cond_a
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "KoinApplication has not been started"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_b
    :goto_5
    invoke-virtual {v7}, Lp1/q;->r()V

    invoke-virtual {v0}, Lyi1/b;->l()Lec3/t1;

    move-result-object v4

    sget-object v5, Lyi1/d$b;->a:Lyi1/d$b;

    const/16 v8, 0x30

    const/4 v9, 0x2

    const/4 v6, 0x0

    invoke-static/range {v4 .. v9}, Lp1/x;->n(Lec3/l;Ljava/lang/Object;Lq83/j;Landroidx/compose/runtime/Composer;II)Lp1/c1;

    move-result-object v1

    invoke-virtual {v7, v0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v4

    invoke-virtual {v7}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v6

    if-nez v4, :cond_c

    if-ne v6, v2, :cond_d

    :cond_c
    new-instance v6, Lzi1/h$b;

    const/4 v4, 0x0

    invoke-direct {v6, v0, v4}, Lzi1/h$b;-><init>(Lyi1/b;Lq83/d;)V

    invoke-virtual {v7, v6}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_d
    check-cast v6, Lc93/m;

    sget-object v4, Ll83/a0;->a:Ll83/a0;

    invoke-static {v7, v6, v4}, Lp1/x;->g(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v1}, Lzi1/h;->e(Lp1/t2;)Lyi1/d;

    move-result-object v4

    invoke-static {v4, v5}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_e

    const v1, -0x79a21930

    invoke-virtual {v7, v1}, Lp1/q;->e0(I)V

    invoke-static {v7, v10}, Lzi1/b;->b(Landroidx/compose/runtime/Composer;I)V

    invoke-virtual {v7, v10}, Lp1/q;->q(Z)V

    goto :goto_6

    :cond_e
    instance-of v5, v4, Lyi1/d$a;

    if-eqz v5, :cond_11

    const v4, 0x45600c22

    invoke-virtual {v7, v4}, Lp1/q;->e0(I)V

    invoke-static {v1}, Lzi1/h;->e(Lp1/t2;)Lyi1/d;

    move-result-object v1

    const-string v4, "null cannot be cast to non-null type com.whoop.health.monitor.medical.presentation.HeartHealthViewState.Error"

    invoke-static {v1, v4}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v1, Lyi1/d$a;

    invoke-virtual {v7, v0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v4

    invoke-virtual {v7}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    if-nez v4, :cond_f

    if-ne v5, v2, :cond_10

    :cond_f
    new-instance v5, Lyy/b0;

    const/4 v2, 0x7

    invoke-direct {v5, v0, v2}, Lyy/b0;-><init>(Ljava/lang/Object;I)V

    invoke-virtual {v7, v5}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_10
    check-cast v5, Lc93/a;

    invoke-static {v1, v5, v7, v10, v10}, Lzi1/a;->c(Lyi1/d$a;Lc93/a;Landroidx/compose/runtime/Composer;II)V

    invoke-virtual {v7, v10}, Lp1/q;->q(Z)V

    goto :goto_6

    :cond_11
    instance-of v4, v4, Lyi1/d$c;

    if-eqz v4, :cond_14

    const v4, 0x45636615

    invoke-virtual {v7, v4}, Lp1/q;->e0(I)V

    invoke-static {v1}, Lzi1/h;->e(Lp1/t2;)Lyi1/d;

    move-result-object v1

    const-string v4, "null cannot be cast to non-null type com.whoop.health.monitor.medical.presentation.HeartHealthViewState.Success"

    invoke-static {v1, v4}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast v1, Lyi1/d$c;

    invoke-virtual {v7, v3}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v4

    invoke-virtual {v7}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    if-nez v4, :cond_12

    if-ne v5, v2, :cond_13

    :cond_12
    new-instance v5, Lx30/h1;

    const/16 v2, 0x11

    invoke-direct {v5, v3, v2}, Lx30/h1;-><init>(Ljava/lang/Object;I)V

    invoke-virtual {v7, v5}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_13
    check-cast v5, Lkotlin/jvm/functions/Function1;

    invoke-static {v1, v5, v7, v10, v10}, Lzi1/g;->e(Lyi1/d$c;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    invoke-virtual {v7, v10}, Lp1/q;->q(Z)V

    :goto_6
    move-object v1, v0

    goto :goto_7

    :cond_14
    const v0, -0x79a21dd7

    invoke-static {v0, v7, v10}, Ldc/b;->v(ILp1/q;Z)Lkotlin/NoWhenBranchMatchedException;

    move-result-object v0

    throw v0

    :cond_15
    invoke-virtual {v7}, Lp1/q;->X()V

    goto :goto_6

    :goto_7
    invoke-virtual {v7}, Lp1/q;->u()Lp1/v1;

    move-result-object v6

    if-eqz v6, :cond_16

    new-instance v0, Lwq1/b;

    const/16 v5, 0x1d

    move/from16 v2, p3

    move/from16 v4, p4

    invoke-direct/range {v0 .. v5}, Lwq1/b;-><init>(Ljava/lang/Object;ILjava/lang/Object;II)V

    iput-object v0, v6, Lp1/v1;->d:Lc93/m;

    :cond_16
    return-void
.end method

.method private static final e(Lp1/t2;)Lyi1/d;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp1/t2;",
            ")",
            "Lyi1/d;"
        }
    .end annotation

    invoke-interface {p0}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lyi1/d;

    return-object p0
.end method

.method private static final f(Lyi1/b;)Ll83/a0;
    .locals 1

    sget-object v0, Lyi1/c$a;->a:Lyi1/c$a;

    invoke-virtual {p0, v0}, Lyi1/b;->n(Lyi1/c;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final g(Lxi1/b;Ljava/lang/Object;)Ll83/a0;
    .locals 2

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p1, Lcom/whoop/design/models/items/ArticleTileModelEvent;

    if-eqz v0, :cond_0

    new-instance v0, Lxi1/a$b;

    move-object v1, p1

    check-cast v1, Lcom/whoop/design/models/items/ArticleTileModelEvent;

    invoke-direct {v0, v1}, Lxi1/a$b;-><init>(Lcom/whoop/design/models/items/ArticleTileModelEvent;)V

    invoke-virtual {p0, v0}, Lxi1/b;->c(Lxi1/a;)V

    :cond_0
    instance-of v0, p1, Lxi1/a;

    if-eqz v0, :cond_1

    check-cast p1, Lxi1/a;

    invoke-virtual {p0, p1}, Lxi1/b;->c(Lxi1/a;)V

    :cond_1
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final h(Lyi1/b;Lxi1/b;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, Lp1/x;->L(I)I

    move-result p2

    invoke-static {p0, p1, p4, p2, p3}, Lzi1/h;->d(Lyi1/b;Lxi1/b;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method
