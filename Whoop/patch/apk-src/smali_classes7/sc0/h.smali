.class public abstract Lsc0/h;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000:\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u001a\'\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u0004H\u0007\u00a2\u0006\u0004\u0008\u0007\u0010\u0008\u001a9\u0010\u0010\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\n\u0008\u0002\u0010\u000c\u001a\u0004\u0018\u00010\u000b2\u0014\u0008\u0002\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00060\rH\u0001\u00a2\u0006\u0004\u0008\u0010\u0010\u0011\u00a8\u0006\u0014\u00b2\u0006\u000c\u0010\u0013\u001a\u00020\u00128\nX\u008a\u0084\u0002\u00b2\u0006\u000c\u0010\n\u001a\u00020\t8\nX\u008a\u0084\u0002"
    }
    d2 = {
        "",
        "source",
        "Lpc0/c;",
        "navRouter",
        "Lpc0/a;",
        "actionRouter",
        "Ll83/a0;",
        "g",
        "(Ljava/lang/String;Lpc0/c;Lpc0/a;Landroidx/compose/runtime/Composer;I)V",
        "Lqc0/c;",
        "viewState",
        "Liy1/c;",
        "metricWriter",
        "Lkotlin/Function1;",
        "Lqc0/a;",
        "onEvent",
        "h",
        "(Lqc0/c;Liy1/c;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V",
        "Lqc0/b;",
        "viewModel",
        "advanced-labs_release"
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
.method public static synthetic a(Lp1/c1;Lmc0/c;Ljava/lang/String;Lp1/i0;)Lp1/h0;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lsc0/h;->m(Lp1/t2;Lmc0/c;Ljava/lang/String;Lp1/i0;)Lp1/h0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lqc0/a;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lsc0/h;->p(Lqc0/a;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Ljava/lang/String;Lpc0/c;Lpc0/a;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p5}, Lsc0/h;->o(Ljava/lang/String;Lpc0/c;Lpc0/a;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Lqc0/c;Liy1/c;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p6}, Lsc0/h;->l(Lqc0/c;Liy1/c;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic e(Lpc0/a;Lpc0/c;Ll83/h;Lqc0/a;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lsc0/h;->n(Lpc0/a;Lpc0/c;Ll83/h;Lqc0/a;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic f(Lkotlin/jvm/functions/Function1;La81/t;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lsc0/h;->k(Lkotlin/jvm/functions/Function1;La81/t;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final g(Ljava/lang/String;Lpc0/c;Lpc0/a;Landroidx/compose/runtime/Composer;I)V
    .locals 26

    move-object/from16 v1, p0

    move-object/from16 v6, p1

    move-object/from16 v7, p2

    move/from16 v8, p4

    const-string v0, "source"

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "navRouter"

    invoke-static {v6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "actionRouter"

    invoke-static {v7, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v12, p3

    check-cast v12, Lp1/q;

    const v0, 0x73062ec8

    invoke-virtual {v12, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, v8, 0x6

    if-nez v0, :cond_1

    invoke-virtual {v12, v1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x4

    goto :goto_0

    :cond_0
    const/4 v0, 0x2

    :goto_0
    or-int/2addr v0, v8

    goto :goto_1

    :cond_1
    move v0, v8

    :goto_1
    and-int/lit8 v2, v8, 0x30

    if-nez v2, :cond_3

    invoke-virtual {v12, v6}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    const/16 v2, 0x20

    goto :goto_2

    :cond_2
    const/16 v2, 0x10

    :goto_2
    or-int/2addr v0, v2

    :cond_3
    and-int/lit16 v2, v8, 0x180

    if-nez v2, :cond_5

    invoke-virtual {v12, v7}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_4

    const/16 v2, 0x100

    goto :goto_3

    :cond_4
    const/16 v2, 0x80

    :goto_3
    or-int/2addr v0, v2

    :cond_5
    and-int/lit16 v2, v0, 0x93

    const/16 v4, 0x92

    const/16 v16, 0x1

    const/4 v5, 0x0

    if-eq v2, v4, :cond_6

    move/from16 v2, v16

    goto :goto_4

    :cond_6
    move v2, v5

    :goto_4
    and-int/lit8 v4, v0, 0x1

    invoke-virtual {v12, v4, v2}, Lp1/q;->U(IZ)Z

    move-result v2

    if-eqz v2, :cond_20

    const v2, -0x649fae96

    invoke-virtual {v12, v2}, Lp1/q;->f0(I)V

    sget-object v2, Lpf3/a;->b:Lnf3/a;

    const-string v4, "KoinApplication has not been started"

    if-eqz v2, :cond_1f

    iget-object v2, v2, Lnf3/a;->a:Lwf3/a;

    iget-object v2, v2, Lwf3/a;->d:Lxf3/c;

    const v9, -0x649fad62

    const v10, -0x384098

    invoke-static {v12, v9, v12, v5, v10}, Lvl/b;->r(Lp1/q;ILp1/q;ZI)Ljf3/a;

    move-result-object v9

    const/4 v11, 0x0

    invoke-virtual {v12, v11}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v13

    invoke-virtual {v12, v11}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v14

    or-int/2addr v13, v14

    invoke-virtual {v12}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v14

    sget-object v15, Lp1/l;->a:Lp1/v0;

    if-nez v13, :cond_7

    if-ne v14, v15, :cond_8

    :cond_7
    sget-object v13, Ll83/i;->y:Ll83/i;

    new-instance v14, Lsc0/h$a;

    invoke-direct {v14, v2, v11, v11, v9}, Lsc0/h$a;-><init>(Lxf3/c;Lvf3/a;Lc93/a;Ljf3/a;)V

    invoke-static {v13, v14}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v14

    invoke-virtual {v12, v14}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_8
    invoke-virtual {v12, v5}, Lp1/q;->q(Z)V

    move-object v2, v14

    check-cast v2, Ll83/h;

    invoke-virtual {v12, v5}, Lp1/q;->q(Z)V

    invoke-static {v2}, Lsc0/h;->i(Ll83/h;)Lqc0/b;

    move-result-object v9

    invoke-virtual {v9}, Lqc0/b;->getViewState()Lec3/l;

    move-result-object v9

    new-instance v17, Lqc0/c;

    new-instance v18, Lqc0/c$b;

    sget-object v13, Lsz0/o0;->a:Lsz0/o0;

    invoke-virtual {v13}, Lsz0/o0;->b()Lsz0/q0;

    move-result-object v19

    const/16 v23, 0xe

    const/16 v24, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    invoke-direct/range {v18 .. v24}, Lqc0/c$b;-><init>(Lsz0/q0;Lqc0/a;Lqc0/a;Lqc0/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/16 v21, 0x5

    move-object/from16 v19, v18

    const/16 v18, 0x0

    invoke-direct/range {v17 .. v22}, Lqc0/c;-><init>(Lcom/whoop/design/models/modal/AnyModal;Lqc0/c$b;Lqc0/c$c;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/4 v13, 0x0

    const/4 v14, 0x2

    move-object/from16 v18, v11

    const/4 v11, 0x0

    move v5, v10

    move-object/from16 v10, v17

    move-object/from16 v3, v18

    invoke-static/range {v9 .. v14}, Lp1/x;->n(Lec3/l;Ljava/lang/Object;Lq83/j;Landroidx/compose/runtime/Composer;II)Lp1/c1;

    move-result-object v9

    const v10, -0x3636f461

    invoke-virtual {v12, v10}, Lp1/q;->f0(I)V

    sget-object v11, Lpf3/a;->b:Lnf3/a;

    if-eqz v11, :cond_1e

    iget-object v11, v11, Lnf3/a;->a:Lwf3/a;

    iget-object v11, v11, Lwf3/a;->d:Lxf3/c;

    invoke-virtual {v12, v5}, Lp1/q;->f0(I)V

    invoke-virtual {v12, v3}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v13

    invoke-virtual {v12, v3}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v14

    or-int/2addr v13, v14

    invoke-virtual {v12}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v14

    if-nez v13, :cond_a

    if-ne v14, v15, :cond_9

    goto :goto_6

    :cond_9
    :goto_5
    const/4 v11, 0x0

    goto :goto_7

    :cond_a
    :goto_6
    const-class v13, Liy1/c;

    sget-object v14, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v14, v13}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v13

    invoke-virtual {v11, v3, v13, v3}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v14

    invoke-virtual {v12, v14}, Lp1/q;->p0(Ljava/lang/Object;)V

    goto :goto_5

    :goto_7
    invoke-virtual {v12, v11}, Lp1/q;->q(Z)V

    invoke-virtual {v12, v11}, Lp1/q;->q(Z)V

    check-cast v14, Liy1/c;

    invoke-virtual {v12, v10}, Lp1/q;->f0(I)V

    sget-object v10, Lpf3/a;->b:Lnf3/a;

    if-eqz v10, :cond_1d

    iget-object v4, v10, Lnf3/a;->a:Lwf3/a;

    iget-object v4, v4, Lwf3/a;->d:Lxf3/c;

    invoke-virtual {v12, v5}, Lp1/q;->f0(I)V

    invoke-virtual {v12, v3}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v5

    invoke-virtual {v12, v3}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v10

    or-int/2addr v5, v10

    invoke-virtual {v12}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v10

    if-nez v5, :cond_c

    if-ne v10, v15, :cond_b

    goto :goto_9

    :cond_b
    :goto_8
    const/4 v11, 0x0

    goto :goto_a

    :cond_c
    :goto_9
    const-class v5, Lmc0/c;

    sget-object v10, Lkotlin/jvm/internal/h0;->a:Lkotlin/jvm/internal/i0;

    invoke-virtual {v10, v5}, Lkotlin/jvm/internal/i0;->getOrCreateKotlinClass(Ljava/lang/Class;)Lj93/d;

    move-result-object v5

    invoke-virtual {v4, v3, v5, v3}, Lxf3/c;->a(Lc93/a;Lj93/d;Lvf3/a;)Ljava/lang/Object;

    move-result-object v10

    invoke-virtual {v12, v10}, Lp1/q;->p0(Ljava/lang/Object;)V

    goto :goto_8

    :goto_a
    invoke-virtual {v12, v11}, Lp1/q;->q(Z)V

    invoke-virtual {v12, v11}, Lp1/q;->q(Z)V

    check-cast v10, Lmc0/c;

    invoke-static {v2}, Lsc0/h;->i(Ll83/h;)Lqc0/b;

    move-result-object v4

    invoke-virtual {v12, v10}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v5

    and-int/lit8 v13, v0, 0xe

    const/4 v11, 0x4

    if-ne v13, v11, :cond_d

    move/from16 v11, v16

    goto :goto_b

    :cond_d
    const/4 v11, 0x0

    :goto_b
    or-int/2addr v5, v11

    invoke-virtual {v12, v2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v11

    or-int/2addr v5, v11

    invoke-virtual {v12}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v11

    if-nez v5, :cond_e

    if-ne v11, v15, :cond_f

    :cond_e
    new-instance v11, Lsc0/h$b;

    invoke-direct {v11, v10, v1, v2, v3}, Lsc0/h$b;-><init>(Lmc0/c;Ljava/lang/String;Ll83/h;Lq83/d;)V

    invoke-virtual {v12, v11}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_f
    check-cast v11, Lc93/m;

    invoke-static {v12, v11, v4}, Lp1/x;->g(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v2}, Lsc0/h;->i(Ll83/h;)Lqc0/b;

    move-result-object v4

    invoke-virtual {v12, v2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v5

    invoke-virtual {v12, v6}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v11

    or-int/2addr v5, v11

    invoke-virtual {v12}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v11

    if-nez v5, :cond_10

    if-ne v11, v15, :cond_11

    :cond_10
    new-instance v11, Lsc0/h$c;

    invoke-direct {v11, v2, v6, v3}, Lsc0/h$c;-><init>(Ll83/h;Lpc0/c;Lq83/d;)V

    invoke-virtual {v12, v11}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_11
    check-cast v11, Lc93/m;

    invoke-static {v12, v11, v4}, Lp1/x;->g(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v9}, Lsc0/h;->j(Lp1/t2;)Lqc0/c;

    move-result-object v4

    invoke-virtual {v4}, Lqc0/c;->d()Lqc0/c$c;

    move-result-object v4

    if-eqz v4, :cond_12

    invoke-virtual {v4}, Lqc0/c$c;->a()Ljava/util/Map;

    move-result-object v4

    if-eqz v4, :cond_12

    const-string v3, "step"

    invoke-interface {v4, v3}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    move-object v11, v3

    check-cast v11, Ljava/lang/String;

    goto :goto_c

    :cond_12
    move-object v11, v3

    :goto_c
    invoke-virtual {v12}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    if-ne v3, v15, :cond_13

    sget-object v3, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-static {v3}, Lp1/x;->z(Ljava/lang/Object;)Lp1/k1;

    move-result-object v3

    invoke-virtual {v12, v3}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_13
    move-object v4, v3

    check-cast v4, Lp1/c1;

    invoke-static {v4, v12}, Lp1/x;->F(Ljava/lang/Object;Landroidx/compose/runtime/Composer;)Lp1/c1;

    move-result-object v3

    invoke-virtual {v12, v11}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v5

    invoke-virtual {v12, v10}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v18

    or-int v5, v5, v18

    move/from16 v18, v0

    const/4 v0, 0x4

    if-ne v13, v0, :cond_14

    move/from16 v0, v16

    goto :goto_d

    :cond_14
    const/4 v0, 0x0

    :goto_d
    or-int/2addr v0, v5

    invoke-virtual {v12}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    if-nez v0, :cond_16

    if-ne v5, v15, :cond_15

    goto :goto_e

    :cond_15
    move-object v8, v3

    move-object v3, v11

    const/16 v17, 0x0

    move-object v11, v2

    move-object v2, v10

    move/from16 v10, v18

    move-object/from16 v18, v9

    const/16 v9, 0x100

    goto :goto_f

    :cond_16
    :goto_e
    new-instance v0, Lsc0/h$d;

    const/4 v5, 0x0

    move-object v8, v3

    const/16 v17, 0x0

    move-object v3, v1

    move-object v1, v11

    move-object v11, v2

    move-object v2, v10

    move/from16 v10, v18

    move-object/from16 v18, v9

    const/16 v9, 0x100

    invoke-direct/range {v0 .. v5}, Lsc0/h$d;-><init>(Ljava/lang/String;Lmc0/c;Ljava/lang/String;Lp1/c1;Lq83/d;)V

    move-object/from16 v25, v3

    move-object v3, v1

    move-object/from16 v1, v25

    invoke-virtual {v12, v0}, Lp1/q;->p0(Ljava/lang/Object;)V

    move-object v5, v0

    :goto_f
    check-cast v5, Lc93/m;

    invoke-static {v12, v5, v3}, Lp1/x;->g(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual {v12, v8}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v0

    invoke-virtual {v12, v2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v3

    or-int/2addr v0, v3

    const/4 v3, 0x4

    if-ne v13, v3, :cond_17

    move/from16 v5, v16

    goto :goto_10

    :cond_17
    move/from16 v5, v17

    :goto_10
    or-int/2addr v0, v5

    invoke-virtual {v12}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    if-nez v0, :cond_18

    if-ne v3, v15, :cond_19

    :cond_18
    new-instance v3, Ls90/f;

    invoke-direct {v3, v8, v2, v1}, Ls90/f;-><init>(Lp1/c1;Lmc0/c;Ljava/lang/String;)V

    invoke-virtual {v12, v3}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_19
    check-cast v3, Lkotlin/jvm/functions/Function1;

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    invoke-static {v0, v3, v12}, Lp1/x;->e(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;)V

    invoke-static/range {v18 .. v18}, Lsc0/h;->j(Lp1/t2;)Lqc0/c;

    move-result-object v0

    const-string v2, "marketing_consent"

    const/16 v3, 0x30

    invoke-static {v0, v2, v12, v3}, Lfy1/j;->c(Lfy1/k;Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V

    invoke-static/range {v18 .. v18}, Lsc0/h;->j(Lp1/t2;)Lqc0/c;

    move-result-object v0

    and-int/lit16 v2, v10, 0x380

    if-ne v2, v9, :cond_1a

    goto :goto_11

    :cond_1a
    move/from16 v16, v17

    :goto_11
    invoke-virtual {v12, v11}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v2

    or-int v2, v16, v2

    invoke-virtual {v12, v6}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v3

    or-int/2addr v2, v3

    invoke-virtual {v12}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    if-nez v2, :cond_1b

    if-ne v3, v15, :cond_1c

    :cond_1b
    new-instance v3, Ls90/f;

    const/4 v2, 0x2

    invoke-direct {v3, v7, v6, v11, v2}, Ls90/f;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    invoke-virtual {v12, v3}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_1c
    move-object v11, v3

    check-cast v11, Lkotlin/jvm/functions/Function1;

    const/4 v13, 0x0

    move-object v10, v14

    const/4 v14, 0x0

    move-object v9, v0

    invoke-static/range {v9 .. v14}, Lsc0/h;->h(Lqc0/c;Liy1/c;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    goto :goto_12

    :cond_1d
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0, v4}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1e
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0, v4}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1f
    new-instance v0, Ljava/lang/IllegalStateException;

    invoke-direct {v0, v4}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_20
    invoke-virtual {v12}, Lp1/q;->X()V

    :goto_12
    invoke-virtual {v12}, Lp1/q;->u()Lp1/v1;

    move-result-object v8

    if-eqz v8, :cond_21

    new-instance v0, Ls01/e;

    const/4 v5, 0x5

    move/from16 v4, p4

    move-object v2, v6

    move-object v3, v7

    invoke-direct/range {v0 .. v5}, Ls01/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;II)V

    iput-object v0, v8, Lp1/v1;->d:Lc93/m;

    :cond_21
    return-void
.end method

.method public static final h(Lqc0/c;Liy1/c;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V
    .locals 15
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lqc0/c;",
            "Liy1/c;",
            "Lkotlin/jvm/functions/Function1;",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    move/from16 v4, p4

    const-string v0, "viewState"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v11, p3

    check-cast v11, Lp1/q;

    const v0, 0x29306457

    invoke-virtual {v11, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, v4, 0x6

    if-nez v0, :cond_1

    invoke-virtual {v11, p0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x4

    goto :goto_0

    :cond_0
    const/4 v0, 0x2

    :goto_0
    or-int/2addr v0, v4

    goto :goto_1

    :cond_1
    move v0, v4

    :goto_1
    and-int/lit8 v1, p5, 0x2

    if-eqz v1, :cond_3

    or-int/lit8 v0, v0, 0x30

    :cond_2
    move-object/from16 v2, p1

    goto :goto_3

    :cond_3
    and-int/lit8 v2, v4, 0x30

    if-nez v2, :cond_2

    move-object/from16 v2, p1

    invoke-virtual {v11, v2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_4

    const/16 v3, 0x20

    goto :goto_2

    :cond_4
    const/16 v3, 0x10

    :goto_2
    or-int/2addr v0, v3

    :goto_3
    and-int/lit8 v3, p5, 0x4

    const/16 v5, 0x100

    if-eqz v3, :cond_6

    or-int/lit16 v0, v0, 0x180

    :cond_5
    move-object/from16 v6, p2

    goto :goto_5

    :cond_6
    and-int/lit16 v6, v4, 0x180

    if-nez v6, :cond_5

    move-object/from16 v6, p2

    invoke-virtual {v11, v6}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_7

    move v7, v5

    goto :goto_4

    :cond_7
    const/16 v7, 0x80

    :goto_4
    or-int/2addr v0, v7

    :goto_5
    and-int/lit16 v7, v0, 0x93

    const/16 v8, 0x92

    const/4 v9, 0x1

    const/4 v14, 0x0

    if-eq v7, v8, :cond_8

    move v7, v9

    goto :goto_6

    :cond_8
    move v7, v14

    :goto_6
    and-int/lit8 v8, v0, 0x1

    invoke-virtual {v11, v8, v7}, Lp1/q;->U(IZ)Z

    move-result v7

    if-eqz v7, :cond_11

    if-eqz v1, :cond_9

    const/4 v1, 0x0

    move-object v7, v1

    goto :goto_7

    :cond_9
    move-object v7, v2

    :goto_7
    sget-object v1, Lp1/l;->a:Lp1/v0;

    if-eqz v3, :cond_b

    invoke-virtual {v11}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v1, :cond_a

    new-instance v2, Ls32/d;

    const/16 v3, 0x1b

    invoke-direct {v2, v3}, Ls32/d;-><init>(I)V

    invoke-virtual {v11, v2}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_a
    check-cast v2, Lkotlin/jvm/functions/Function1;

    goto :goto_8

    :cond_b
    move-object v2, v6

    :goto_8
    invoke-virtual {p0}, Lqc0/c;->b()Lqc0/c$b;

    move-result-object v3

    if-eqz v3, :cond_c

    const v1, -0x6157399a

    invoke-virtual {v11, v1}, Lp1/q;->e0(I)V

    invoke-virtual {p0}, Lqc0/c;->b()Lqc0/c$b;

    move-result-object v1

    shr-int/lit8 v0, v0, 0x3

    and-int/lit8 v0, v0, 0x70

    invoke-static {v1, v2, v11, v0, v14}, Lsc0/e;->k(Lqc0/c$b;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    invoke-virtual {v11, v14}, Lp1/q;->q(Z)V

    goto :goto_a

    :cond_c
    invoke-virtual {p0}, Lqc0/c;->d()Lqc0/c$c;

    move-result-object v3

    if-eqz v3, :cond_10

    const v3, 0x3671fe1c

    invoke-virtual {v11, v3}, Lp1/q;->e0(I)V

    invoke-virtual {p0}, Lqc0/c;->c()Lcom/whoop/design/models/modal/AnyModal;

    move-result-object v3

    and-int/lit16 v6, v0, 0x380

    if-ne v6, v5, :cond_d

    goto :goto_9

    :cond_d
    move v9, v14

    :goto_9
    invoke-virtual {v11}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    if-nez v9, :cond_e

    if-ne v5, v1, :cond_f

    :cond_e
    new-instance v5, Lp90/h;

    const/16 v1, 0x1d

    invoke-direct {v5, v2, v1}, Lp90/h;-><init>(Lkotlin/jvm/functions/Function1;I)V

    invoke-virtual {v11, v5}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_f
    move-object v6, v5

    check-cast v6, Lkotlin/jvm/functions/Function1;

    sget v1, Lcom/whoop/design/models/modal/AnyModal;->$stable:I

    shl-int/lit8 v5, v0, 0x3

    and-int/lit16 v5, v5, 0x380

    or-int v12, v1, v5

    const/16 v13, 0x38

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    move-object v5, v3

    invoke-static/range {v5 .. v13}, La81/o;->P(Lcom/whoop/design/models/modal/AnyModal;Lkotlin/jvm/functions/Function1;Liy1/c;Lfi0/a;Lc93/a;Lc93/p;Landroidx/compose/runtime/Composer;II)V

    invoke-virtual {p0}, Lqc0/c;->d()Lqc0/c$c;

    move-result-object v1

    shr-int/lit8 v0, v0, 0x3

    and-int/lit8 v0, v0, 0x70

    invoke-static {v1, v2, v11, v0, v14}, Lsc0/g;->j(Lqc0/c$c;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    invoke-virtual {v11, v14}, Lp1/q;->q(Z)V

    goto :goto_a

    :cond_10
    const v0, 0x367686cb

    invoke-virtual {v11, v0}, Lp1/q;->e0(I)V

    invoke-virtual {v11, v14}, Lp1/q;->q(Z)V

    :goto_a
    move-object v3, v2

    move-object v2, v7

    goto :goto_b

    :cond_11
    invoke-virtual {v11}, Lp1/q;->X()V

    move-object v3, v6

    :goto_b
    invoke-virtual {v11}, Lp1/q;->u()Lp1/v1;

    move-result-object v7

    if-eqz v7, :cond_12

    new-instance v0, Ls51/b;

    const/16 v6, 0x8

    move-object v1, p0

    move/from16 v5, p5

    invoke-direct/range {v0 .. v6}, Ls51/b;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;III)V

    iput-object v0, v7, Lp1/v1;->d:Lc93/m;

    :cond_12
    return-void
.end method

.method private static final i(Ll83/h;)Lqc0/b;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ll83/h;",
            ")",
            "Lqc0/b;"
        }
    .end annotation

    invoke-interface {p0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lqc0/b;

    return-object p0
.end method

.method private static final j(Lp1/t2;)Lqc0/c;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp1/t2;",
            ")",
            "Lqc0/c;"
        }
    .end annotation

    invoke-interface {p0}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lqc0/c;

    return-object p0
.end method

.method private static final k(Lkotlin/jvm/functions/Function1;La81/t;)Ll83/a0;
    .locals 1

    const-string v0, "modalEvent"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1}, Lsc0/f;->a(La81/t;)Lqc0/a;

    move-result-object p1

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final l(Lqc0/c;Liy1/c;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 6

    or-int/lit8 p3, p3, 0x1

    invoke-static {p3}, Lp1/x;->L(I)I

    move-result v4

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move v5, p4

    move-object v3, p5

    invoke-static/range {v0 .. v5}, Lsc0/h;->h(Lqc0/c;Liy1/c;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final m(Lp1/t2;Lmc0/c;Ljava/lang/String;Lp1/i0;)Lp1/h0;
    .locals 1

    const-string v0, "$this$DisposableEffect"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p3, Lsc0/h$e;

    invoke-direct {p3, p0, p1, p2}, Lsc0/h$e;-><init>(Lp1/t2;Lmc0/c;Ljava/lang/String;)V

    return-object p3
.end method

.method private static final n(Lpc0/a;Lpc0/c;Ll83/h;Lqc0/a;)Ll83/a0;
    .locals 1

    const-string v0, "event"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p3}, Lpc0/a;->d(Lqc0/a;)Lqc0/a;

    move-result-object p0

    instance-of p3, p0, Lqc0/a$k;

    if-eqz p3, :cond_0

    invoke-static {p2}, Lsc0/h;->i(Ll83/h;)Lqc0/b;

    move-result-object p1

    check-cast p0, Lqc0/a$k;

    invoke-virtual {p1, p0}, Lqc0/b;->o(Lqc0/a$k;)V

    goto :goto_0

    :cond_0
    instance-of p2, p0, Lqc0/a$f;

    if-eqz p2, :cond_1

    check-cast p0, Lqc0/a$f;

    invoke-virtual {p1, p0}, Lpc0/c;->a(Lqc0/a$f;)V

    :cond_1
    :goto_0
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final o(Ljava/lang/String;Lpc0/c;Lpc0/a;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p3, p3, 0x1

    invoke-static {p3}, Lp1/x;->L(I)I

    move-result p3

    invoke-static {p0, p1, p2, p4, p3}, Lsc0/h;->g(Ljava/lang/String;Lpc0/c;Lpc0/a;Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final p(Lqc0/a;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static final synthetic q(Ll83/h;)Lqc0/b;
    .locals 0

    invoke-static {p0}, Lsc0/h;->i(Ll83/h;)Lqc0/b;

    move-result-object p0

    return-object p0
.end method
