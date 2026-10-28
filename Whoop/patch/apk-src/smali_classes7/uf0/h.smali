.class public abstract Luf0/h;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00006\n\u0002\u0010\u000e\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u001a9\u0010\t\u001a\u00020\u00082\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006H\u0007\u00a2\u0006\u0004\u0008\t\u0010\n\u001a-\u0010\u0010\u001a\u00020\u00082\u0006\u0010\u000c\u001a\u00020\u000b2\u0014\u0008\u0002\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00080\rH\u0001\u00a2\u0006\u0004\u0008\u0010\u0010\u0011\u00a8\u0006\u0014\u00b2\u0006\u000c\u0010\u0013\u001a\u00020\u00128\nX\u008a\u0084\u0002\u00b2\u0006\u000c\u0010\u000c\u001a\u00020\u000b8\nX\u008a\u0084\u0002"
    }
    d2 = {
        "",
        "source",
        "testCount",
        "initiallySelectedSegmentId",
        "Lrf0/c;",
        "navRouter",
        "Lrf0/a;",
        "actionRouter",
        "Ll83/a0;",
        "e",
        "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lrf0/c;Lrf0/a;Landroidx/compose/runtime/Composer;II)V",
        "Lsf0/c;",
        "viewState",
        "Lkotlin/Function1;",
        "Lsf0/a;",
        "onEvent",
        "f",
        "(Lsf0/c;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V",
        "Lsf0/b;",
        "viewModel",
        "advanced-labs-join_release"
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
.method public static synthetic a(Lrf0/a;Lrf0/c;Ll83/h;Lsf0/a;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Luf0/h;->i(Lrf0/a;Lrf0/c;Ll83/h;Lsf0/a;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lrf0/c;Lrf0/a;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p8}, Luf0/h;->j(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lrf0/c;Lrf0/a;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Lsf0/c;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p5}, Luf0/h;->l(Lsf0/c;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Lsf0/a;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Luf0/h;->k(Lsf0/a;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lrf0/c;Lrf0/a;Landroidx/compose/runtime/Composer;II)V
    .locals 25

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move-object/from16 v7, p3

    move-object/from16 v8, p4

    move/from16 v6, p6

    const-string v0, "source"

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "testCount"

    invoke-static {v2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "navRouter"

    invoke-static {v7, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "actionRouter"

    invoke-static {v8, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v12, p5

    check-cast v12, Lp1/q;

    const v0, 0x13f33234

    invoke-virtual {v12, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, v6, 0x6

    const/4 v3, 0x4

    if-nez v0, :cond_1

    invoke-virtual {v12, v1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    move v0, v3

    goto :goto_0

    :cond_0
    const/4 v0, 0x2

    :goto_0
    or-int/2addr v0, v6

    goto :goto_1

    :cond_1
    move v0, v6

    :goto_1
    and-int/lit8 v4, v6, 0x30

    if-nez v4, :cond_3

    invoke-virtual {v12, v2}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_2

    const/16 v4, 0x20

    goto :goto_2

    :cond_2
    const/16 v4, 0x10

    :goto_2
    or-int/2addr v0, v4

    :cond_3
    and-int/lit8 v4, p7, 0x4

    if-eqz v4, :cond_5

    or-int/lit16 v0, v0, 0x180

    :cond_4
    move-object/from16 v9, p2

    goto :goto_4

    :cond_5
    and-int/lit16 v9, v6, 0x180

    if-nez v9, :cond_4

    move-object/from16 v9, p2

    invoke-virtual {v12, v9}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_6

    const/16 v10, 0x100

    goto :goto_3

    :cond_6
    const/16 v10, 0x80

    :goto_3
    or-int/2addr v0, v10

    :goto_4
    and-int/lit16 v10, v6, 0xc00

    if-nez v10, :cond_8

    invoke-virtual {v12, v7}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_7

    const/16 v10, 0x800

    goto :goto_5

    :cond_7
    const/16 v10, 0x400

    :goto_5
    or-int/2addr v0, v10

    :cond_8
    and-int/lit16 v10, v6, 0x6000

    if-nez v10, :cond_a

    invoke-virtual {v12, v8}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_9

    const/16 v10, 0x4000

    goto :goto_6

    :cond_9
    const/16 v10, 0x2000

    :goto_6
    or-int/2addr v0, v10

    :cond_a
    and-int/lit16 v10, v0, 0x2493

    const/16 v11, 0x2492

    const/16 v16, 0x1

    const/4 v13, 0x0

    if-eq v10, v11, :cond_b

    move/from16 v10, v16

    goto :goto_7

    :cond_b
    move v10, v13

    :goto_7
    and-int/lit8 v11, v0, 0x1

    invoke-virtual {v12, v11, v10}, Lp1/q;->U(IZ)Z

    move-result v10

    if-eqz v10, :cond_17

    if-eqz v4, :cond_c

    const-string v4, ""

    goto :goto_8

    :cond_c
    move-object v4, v9

    :goto_8
    const v9, -0x649fae96

    invoke-virtual {v12, v9}, Lp1/q;->f0(I)V

    sget-object v9, Lpf3/a;->b:Lnf3/a;

    if-eqz v9, :cond_16

    iget-object v9, v9, Lnf3/a;->a:Lwf3/a;

    iget-object v9, v9, Lwf3/a;->d:Lxf3/c;

    const v10, -0x649fad62

    const v11, -0x384098

    invoke-static {v12, v10, v12, v13, v11}, Lvl/b;->r(Lp1/q;ILp1/q;ZI)Ljf3/a;

    move-result-object v10

    const/4 v11, 0x0

    invoke-virtual {v12, v11}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v14

    invoke-virtual {v12, v11}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v17

    or-int v14, v14, v17

    invoke-virtual {v12}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v15

    sget-object v5, Lp1/l;->a:Lp1/v0;

    if-nez v14, :cond_d

    if-ne v15, v5, :cond_e

    :cond_d
    sget-object v14, Ll83/i;->y:Ll83/i;

    new-instance v15, Luf0/h$a;

    invoke-direct {v15, v9, v11, v11, v10}, Luf0/h$a;-><init>(Lxf3/c;Lvf3/a;Lc93/a;Ljf3/a;)V

    invoke-static {v14, v15}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v15

    invoke-virtual {v12, v15}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_e
    invoke-virtual {v12, v13}, Lp1/q;->q(Z)V

    check-cast v15, Ll83/h;

    invoke-virtual {v12, v13}, Lp1/q;->q(Z)V

    invoke-static {v15}, Luf0/h;->g(Ll83/h;)Lsf0/b;

    move-result-object v9

    invoke-virtual {v9}, Lsf0/b;->getViewState()Lec3/l;

    move-result-object v9

    new-instance v10, Lsf0/c;

    new-instance v18, Lsf0/c$c;

    sget-object v11, Lsz0/o0;->a:Lsz0/o0;

    invoke-virtual {v11}, Lsz0/o0;->b()Lsz0/q0;

    move-result-object v19

    const/16 v23, 0xe

    const/16 v24, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    invoke-direct/range {v18 .. v24}, Lsf0/c$c;-><init>(Lsz0/q0;Lsf0/a;Lsf0/a;Lsf0/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/16 v22, 0x5

    const/16 v23, 0x0

    const/16 v19, 0x0

    move-object/from16 v20, v18

    move-object/from16 v18, v10

    invoke-direct/range {v18 .. v23}, Lsf0/c;-><init>(Lsf0/c$a;Lsf0/c$c;Lsf0/c$d;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move v11, v13

    const/4 v13, 0x0

    const/4 v14, 0x2

    move/from16 v18, v11

    const/4 v11, 0x0

    invoke-static/range {v9 .. v14}, Lp1/x;->n(Lec3/l;Ljava/lang/Object;Lq83/j;Landroidx/compose/runtime/Composer;II)Lp1/c1;

    move-result-object v9

    invoke-static {v15}, Luf0/h;->g(Ll83/h;)Lsf0/b;

    move-result-object v10

    invoke-virtual {v12, v15}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v11

    and-int/lit8 v13, v0, 0xe

    if-ne v13, v3, :cond_f

    move/from16 v13, v16

    goto :goto_9

    :cond_f
    const/4 v13, 0x0

    :goto_9
    or-int v3, v11, v13

    and-int/lit8 v11, v0, 0x70

    const/16 v13, 0x20

    if-ne v11, v13, :cond_10

    move/from16 v13, v16

    goto :goto_a

    :cond_10
    const/4 v13, 0x0

    :goto_a
    or-int/2addr v3, v13

    and-int/lit16 v0, v0, 0x380

    const/16 v11, 0x100

    if-ne v0, v11, :cond_11

    goto :goto_b

    :cond_11
    const/16 v16, 0x0

    :goto_b
    or-int v0, v3, v16

    invoke-virtual {v12}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    if-nez v0, :cond_13

    if-ne v3, v5, :cond_12

    goto :goto_c

    :cond_12
    move-object v0, v3

    move-object v3, v4

    move-object v11, v5

    move-object v4, v15

    goto :goto_d

    :cond_13
    :goto_c
    new-instance v0, Luf0/h$b;

    move-object v3, v5

    const/4 v5, 0x0

    move-object v11, v3

    move-object v3, v4

    move-object v4, v15

    invoke-direct/range {v0 .. v5}, Luf0/h$b;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ll83/h;Lq83/d;)V

    invoke-virtual {v12, v0}, Lp1/q;->p0(Ljava/lang/Object;)V

    :goto_d
    check-cast v0, Lc93/m;

    invoke-static {v12, v0, v10}, Lp1/x;->g(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v9}, Luf0/h;->h(Lp1/t2;)Lsf0/c;

    move-result-object v0

    invoke-virtual {v12, v8}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v1

    invoke-virtual {v12, v4}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v2

    or-int/2addr v1, v2

    invoke-virtual {v12, v7}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v2

    or-int/2addr v1, v2

    invoke-virtual {v12}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    if-nez v1, :cond_14

    if-ne v2, v11, :cond_15

    :cond_14
    new-instance v2, Ls90/f;

    const/16 v1, 0x11

    invoke-direct {v2, v8, v7, v4, v1}, Ls90/f;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    invoke-virtual {v12, v2}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_15
    check-cast v2, Lkotlin/jvm/functions/Function1;

    const/4 v11, 0x0

    invoke-static {v0, v2, v12, v11, v11}, Luf0/h;->f(Lsf0/c;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    move-object v9, v3

    goto :goto_e

    :cond_16
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "KoinApplication has not been started"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_17
    invoke-virtual {v12}, Lp1/q;->X()V

    :goto_e
    invoke-virtual {v12}, Lp1/q;->u()Lp1/v1;

    move-result-object v10

    if-eqz v10, :cond_18

    new-instance v0, Lj81/e;

    const/16 v3, 0x1c

    move-object v6, v9

    const/4 v9, 0x0

    move-object/from16 v4, p0

    move-object/from16 v5, p1

    move/from16 v1, p6

    move/from16 v2, p7

    invoke-direct/range {v0 .. v9}, Lj81/e;-><init>(IIILjava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Z)V

    iput-object v0, v10, Lp1/v1;->d:Lc93/m;

    :cond_18
    return-void
.end method

.method public static final f(Lsf0/c;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lsf0/c;",
            "Lkotlin/jvm/functions/Function1;",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    const-string v0, "viewState"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v5, p2

    check-cast v5, Lp1/q;

    const v0, -0x51c7a768

    invoke-virtual {v5, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, p3, 0x6

    if-nez v0, :cond_1

    invoke-virtual {v5, p0}, Lp1/q;->i(Ljava/lang/Object;)Z

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
    and-int/lit8 v2, p4, 0x2

    if-eqz v2, :cond_2

    or-int/lit8 v0, v0, 0x30

    goto :goto_3

    :cond_2
    and-int/lit8 v3, p3, 0x30

    if-nez v3, :cond_4

    invoke-virtual {v5, p1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_3

    const/16 v4, 0x20

    goto :goto_2

    :cond_3
    const/16 v4, 0x10

    :goto_2
    or-int/2addr v0, v4

    :cond_4
    :goto_3
    and-int/lit8 v4, v0, 0x13

    const/16 v6, 0x12

    const/4 v8, 0x0

    if-eq v4, v6, :cond_5

    const/4 v4, 0x1

    goto :goto_4

    :cond_5
    move v4, v8

    :goto_4
    and-int/lit8 v6, v0, 0x1

    invoke-virtual {v5, v6, v4}, Lp1/q;->U(IZ)Z

    move-result v4

    if-eqz v4, :cond_a

    if-eqz v2, :cond_7

    invoke-virtual {v5}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    sget-object v3, Lp1/l;->a:Lp1/v0;

    if-ne v2, v3, :cond_6

    new-instance v2, Lu71/c;

    const/16 v3, 0x12

    invoke-direct {v2, v3}, Lu71/c;-><init>(I)V

    invoke-virtual {v5, v2}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_6
    check-cast v2, Lkotlin/jvm/functions/Function1;

    move-object v4, v2

    goto :goto_5

    :cond_7
    move-object v4, p1

    :goto_5
    and-int/lit8 v2, v0, 0xe

    or-int/lit8 v2, v2, 0x30

    const-string v3, "advanced_labs_join"

    invoke-static {p0, v3, v5, v2}, Lfy1/j;->c(Lfy1/k;Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V

    invoke-virtual {p0}, Lsf0/c;->b()Lsf0/c$c;

    move-result-object v2

    if-eqz v2, :cond_8

    const v2, 0x184b647

    invoke-virtual {v5, v2}, Lp1/q;->e0(I)V

    invoke-virtual {p0}, Lsf0/c;->b()Lsf0/c$c;

    move-result-object v2

    and-int/lit8 v0, v0, 0x70

    invoke-static {v2, v4, v5, v0}, Luf0/b;->g(Lsf0/c$c;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    invoke-virtual {v5, v8}, Lp1/q;->q(Z)V

    goto :goto_6

    :cond_8
    invoke-virtual {p0}, Lsf0/c;->d()Lsf0/c$d;

    move-result-object v2

    if-eqz v2, :cond_9

    const v2, 0x2f13fa21

    invoke-virtual {v5, v2}, Lp1/q;->e0(I)V

    and-int/lit8 v2, v0, 0x7e

    invoke-static {p0, v4, v5, v2}, Luf0/d;->e(Lsf0/c;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    invoke-virtual {p0}, Lsf0/c;->d()Lsf0/c$d;

    move-result-object v2

    shl-int/lit8 v0, v0, 0x3

    and-int/lit16 v6, v0, 0x380

    const/4 v7, 0x2

    const/4 v3, 0x0

    invoke-static/range {v2 .. v7}, Luf0/g;->j(Lsf0/c$d;Lf0/r1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    invoke-virtual {v5, v8}, Lp1/q;->q(Z)V

    goto :goto_6

    :cond_9
    const v0, 0x2f168bca

    invoke-virtual {v5, v0}, Lp1/q;->e0(I)V

    invoke-virtual {v5, v8}, Lp1/q;->q(Z)V

    :goto_6
    move-object v3, v4

    goto :goto_7

    :cond_a
    invoke-virtual {v5}, Lp1/q;->X()V

    move-object v3, p1

    :goto_7
    invoke-virtual {v5}, Lp1/q;->u()Lp1/v1;

    move-result-object v6

    if-eqz v6, :cond_b

    new-instance v0, Lt80/b;

    const/4 v5, 0x7

    move-object v1, p0

    move v2, p3

    move v4, p4

    invoke-direct/range {v0 .. v5}, Lt80/b;-><init>(Ljava/lang/Object;ILjava/lang/Object;II)V

    iput-object v0, v6, Lp1/v1;->d:Lc93/m;

    :cond_b
    return-void
.end method

.method private static final g(Ll83/h;)Lsf0/b;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ll83/h;",
            ")",
            "Lsf0/b;"
        }
    .end annotation

    invoke-interface {p0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lsf0/b;

    return-object p0
.end method

.method private static final h(Lp1/t2;)Lsf0/c;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp1/t2;",
            ")",
            "Lsf0/c;"
        }
    .end annotation

    invoke-interface {p0}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lsf0/c;

    return-object p0
.end method

.method private static final i(Lrf0/a;Lrf0/c;Ll83/h;Lsf0/a;)Ll83/a0;
    .locals 1

    const-string v0, "event"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p3}, Lrf0/a;->c(Lsf0/a;)Lsf0/a;

    move-result-object p0

    instance-of p3, p0, Lsf0/a$l;

    if-eqz p3, :cond_0

    invoke-static {p2}, Luf0/h;->g(Ll83/h;)Lsf0/b;

    move-result-object p1

    check-cast p0, Lsf0/a$l;

    invoke-virtual {p1, p0}, Lsf0/b;->n(Lsf0/a$l;)V

    goto :goto_0

    :cond_0
    instance-of p2, p0, Lsf0/a$g;

    if-eqz p2, :cond_1

    check-cast p0, Lsf0/a$g;

    invoke-virtual {p1, p0}, Lrf0/c;->b(Lsf0/a$g;)V

    :cond_1
    :goto_0
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final j(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lrf0/c;Lrf0/a;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 8

    or-int/lit8 p5, p5, 0x1

    invoke-static {p5}, Lp1/x;->L(I)I

    move-result v6

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    move v7, p6

    move-object v5, p7

    invoke-static/range {v0 .. v7}, Luf0/h;->e(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lrf0/c;Lrf0/a;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final k(Lsf0/a;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final l(Lsf0/c;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, Lp1/x;->L(I)I

    move-result p2

    invoke-static {p0, p1, p4, p2, p3}, Luf0/h;->f(Lsf0/c;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static final synthetic m(Ll83/h;)Lsf0/b;
    .locals 0

    invoke-static {p0}, Luf0/h;->g(Ll83/h;)Lsf0/b;

    move-result-object p0

    return-object p0
.end method
