.class public abstract Lig0/i;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00006\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u001a/\u0010\u0008\u001a\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0007\u00a2\u0006\u0004\u0008\u0008\u0010\t\u001a-\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u000b\u001a\u00020\n2\u0014\u0008\u0002\u0010\u000e\u001a\u000e\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u00070\u000cH\u0001\u00a2\u0006\u0004\u0008\u000f\u0010\u0010\u00a8\u0006\u0013\u00b2\u0006\u000c\u0010\u0012\u001a\u00020\u00118\nX\u008a\u0084\u0002\u00b2\u0006\u000c\u0010\u000b\u001a\u00020\n8\nX\u008a\u0084\u0002"
    }
    d2 = {
        "",
        "source",
        "testCount",
        "Lfg0/c;",
        "navRouter",
        "Lfg0/a;",
        "actionRouter",
        "Ll83/a0;",
        "f",
        "(Ljava/lang/String;Ljava/lang/String;Lfg0/c;Lfg0/a;Landroidx/compose/runtime/Composer;I)V",
        "Lgg0/c;",
        "viewState",
        "Lkotlin/Function1;",
        "Lgg0/a;",
        "onEvent",
        "e",
        "(Lgg0/c;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V",
        "Lgg0/b;",
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
.method public static synthetic a(Lgg0/a;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lig0/i;->k(Lgg0/a;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lfg0/a;Lfg0/c;Ll83/h;Lgg0/a;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lig0/i;->i(Lfg0/a;Lfg0/c;Ll83/h;Lgg0/a;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Ljava/lang/String;Ljava/lang/String;Lfg0/c;Lfg0/a;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p6}, Lig0/i;->j(Ljava/lang/String;Ljava/lang/String;Lfg0/c;Lfg0/a;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Lgg0/c;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p5}, Lig0/i;->l(Lgg0/c;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final e(Lgg0/c;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lgg0/c;",
            "Lkotlin/jvm/functions/Function1;",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    const-string v1, "viewState"

    invoke-static {p0, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v3, p2

    check-cast v3, Lp1/q;

    const v1, -0x24a4f68e

    invoke-virtual {v3, v1}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v1, p3, 0x6

    if-nez v1, :cond_1

    invoke-virtual {v3, p0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, 0x4

    goto :goto_0

    :cond_0
    const/4 v1, 0x2

    :goto_0
    or-int/2addr v1, p3

    goto :goto_1

    :cond_1
    move v1, p3

    :goto_1
    and-int/lit8 v2, p4, 0x2

    if-eqz v2, :cond_3

    or-int/lit8 v1, v1, 0x30

    :cond_2
    :goto_2
    move v6, v1

    goto :goto_4

    :cond_3
    and-int/lit8 v4, p3, 0x30

    if-nez v4, :cond_2

    invoke-virtual {v3, p1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_4

    const/16 v5, 0x20

    goto :goto_3

    :cond_4
    const/16 v5, 0x10

    :goto_3
    or-int/2addr v1, v5

    goto :goto_2

    :goto_4
    and-int/lit8 v1, v6, 0x13

    const/16 v5, 0x12

    const/4 v8, 0x0

    if-eq v1, v5, :cond_5

    const/4 v1, 0x1

    goto :goto_5

    :cond_5
    move v1, v8

    :goto_5
    and-int/lit8 v5, v6, 0x1

    invoke-virtual {v3, v5, v1}, Lp1/q;->U(IZ)Z

    move-result v1

    if-eqz v1, :cond_a

    if-eqz v2, :cond_7

    invoke-virtual {v3}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    sget-object v2, Lp1/l;->a:Lp1/v0;

    if-ne v1, v2, :cond_6

    new-instance v1, Lib0/c;

    const/16 v2, 0x14

    invoke-direct {v1, v2}, Lib0/c;-><init>(I)V

    invoke-virtual {v3, v1}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_6
    check-cast v1, Lkotlin/jvm/functions/Function1;

    goto :goto_6

    :cond_7
    move-object v1, p1

    :goto_6
    and-int/lit8 v2, v6, 0xe

    or-int/lit8 v2, v2, 0x30

    const-string v4, "advanced_labs_update_tests"

    invoke-static {p0, v4, v3, v2}, Lfy1/j;->c(Lfy1/k;Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V

    invoke-virtual {p0}, Lgg0/c;->b()Lgg0/c$b;

    move-result-object v2

    if-eqz v2, :cond_8

    const v2, 0x70be97bc

    invoke-virtual {v3, v2}, Lp1/q;->e0(I)V

    invoke-virtual {p0}, Lgg0/c;->b()Lgg0/c$b;

    move-result-object v2

    and-int/lit8 v4, v6, 0x70

    invoke-static {v2, v1, v3, v4}, Lig0/e;->j(Lgg0/c$b;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    invoke-virtual {v3, v8}, Lp1/q;->q(Z)V

    goto :goto_7

    :cond_8
    invoke-virtual {p0}, Lgg0/c;->d()Lgg0/c$c;

    move-result-object v2

    if-eqz v2, :cond_9

    const v2, -0x58e9ce23

    invoke-virtual {v3, v2}, Lp1/q;->e0(I)V

    and-int/lit8 v4, v6, 0x7e

    const/4 v5, 0x4

    const/4 v2, 0x0

    move-object v0, p0

    invoke-static/range {v0 .. v5}, Lig0/f;->f(Lgg0/c;Lkotlin/jvm/functions/Function1;Lf0/r1;Landroidx/compose/runtime/Composer;II)V

    invoke-virtual {p0}, Lgg0/c;->d()Lgg0/c$c;

    move-result-object v2

    shl-int/lit8 v0, v6, 0x3

    and-int/lit16 v6, v0, 0x380

    const/4 v7, 0x2

    move-object v5, v3

    const/4 v3, 0x0

    move-object v4, v1

    invoke-static/range {v2 .. v7}, Lig0/g;->o(Lgg0/c$c;Lf0/r1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    move-object v3, v5

    invoke-virtual {v3, v8}, Lp1/q;->q(Z)V

    goto :goto_7

    :cond_9
    const v0, -0x58e78f10

    invoke-virtual {v3, v0}, Lp1/q;->e0(I)V

    invoke-virtual {v3, v8}, Lp1/q;->q(Z)V

    goto :goto_7

    :cond_a
    invoke-virtual {v3}, Lp1/q;->X()V

    move-object v1, p1

    :goto_7
    invoke-virtual {v3}, Lp1/q;->u()Lp1/v1;

    move-result-object v6

    if-eqz v6, :cond_b

    new-instance v0, Lfc0/e;

    const/16 v5, 0x1b

    move v2, p3

    move v4, p4

    move-object v3, v1

    move-object v1, p0

    invoke-direct/range {v0 .. v5}, Lfc0/e;-><init>(Ljava/lang/Object;ILjava/lang/Object;II)V

    iput-object v0, v6, Lp1/v1;->d:Lc93/m;

    :cond_b
    return-void
.end method

.method public static final f(Ljava/lang/String;Ljava/lang/String;Lfg0/c;Lfg0/a;Landroidx/compose/runtime/Composer;I)V
    .locals 24

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move-object/from16 v6, p3

    move/from16 v7, p5

    const-string v0, "source"

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "testCount"

    invoke-static {v2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "navRouter"

    invoke-static {v3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "actionRouter"

    invoke-static {v6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v11, p4

    check-cast v11, Lp1/q;

    const v0, 0x353045d7

    invoke-virtual {v11, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, v7, 0x6

    const/4 v4, 0x4

    if-nez v0, :cond_1

    invoke-virtual {v11, v1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    move v0, v4

    goto :goto_0

    :cond_0
    const/4 v0, 0x2

    :goto_0
    or-int/2addr v0, v7

    goto :goto_1

    :cond_1
    move v0, v7

    :goto_1
    and-int/lit8 v5, v7, 0x30

    const/16 v14, 0x20

    if-nez v5, :cond_3

    invoke-virtual {v11, v2}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_2

    move v5, v14

    goto :goto_2

    :cond_2
    const/16 v5, 0x10

    :goto_2
    or-int/2addr v0, v5

    :cond_3
    and-int/lit16 v5, v7, 0x180

    if-nez v5, :cond_5

    invoke-virtual {v11, v3}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_4

    const/16 v5, 0x100

    goto :goto_3

    :cond_4
    const/16 v5, 0x80

    :goto_3
    or-int/2addr v0, v5

    :cond_5
    and-int/lit16 v5, v7, 0xc00

    if-nez v5, :cond_7

    invoke-virtual {v11, v6}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_6

    const/16 v5, 0x800

    goto :goto_4

    :cond_6
    const/16 v5, 0x400

    :goto_4
    or-int/2addr v0, v5

    :cond_7
    and-int/lit16 v5, v0, 0x493

    const/16 v8, 0x492

    const/4 v9, 0x0

    if-eq v5, v8, :cond_8

    const/4 v5, 0x1

    goto :goto_5

    :cond_8
    move v5, v9

    :goto_5
    and-int/lit8 v8, v0, 0x1

    invoke-virtual {v11, v8, v5}, Lp1/q;->U(IZ)Z

    move-result v5

    if-eqz v5, :cond_12

    const v5, -0x649fae96

    invoke-virtual {v11, v5}, Lp1/q;->f0(I)V

    sget-object v5, Lpf3/a;->b:Lnf3/a;

    if-eqz v5, :cond_11

    iget-object v5, v5, Lnf3/a;->a:Lwf3/a;

    iget-object v5, v5, Lwf3/a;->d:Lxf3/c;

    const v8, -0x649fad62

    const v10, -0x384098

    invoke-static {v11, v8, v11, v9, v10}, Lvl/b;->r(Lp1/q;ILp1/q;ZI)Ljf3/a;

    move-result-object v8

    const/4 v10, 0x0

    invoke-virtual {v11, v10}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v12

    invoke-virtual {v11, v10}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v13

    or-int/2addr v12, v13

    invoke-virtual {v11}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v13

    sget-object v15, Lp1/l;->a:Lp1/v0;

    if-nez v12, :cond_9

    if-ne v13, v15, :cond_a

    :cond_9
    sget-object v12, Ll83/i;->y:Ll83/i;

    new-instance v13, Lig0/i$a;

    invoke-direct {v13, v5, v10, v10, v8}, Lig0/i$a;-><init>(Lxf3/c;Lvf3/a;Lc93/a;Ljf3/a;)V

    invoke-static {v12, v13}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v13

    invoke-virtual {v11, v13}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_a
    invoke-virtual {v11, v9}, Lp1/q;->q(Z)V

    move-object v5, v13

    check-cast v5, Ll83/h;

    invoke-virtual {v11, v9}, Lp1/q;->q(Z)V

    invoke-static {v5}, Lig0/i;->g(Ll83/h;)Lgg0/b;

    move-result-object v8

    invoke-virtual {v8}, Lgg0/b;->getViewState()Lec3/l;

    move-result-object v8

    new-instance v16, Lgg0/c;

    new-instance v17, Lgg0/c$b;

    sget-object v10, Lsz0/o0;->a:Lsz0/o0;

    invoke-virtual {v10}, Lsz0/o0;->b()Lsz0/q0;

    move-result-object v18

    const/16 v22, 0xe

    const/16 v23, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    invoke-direct/range {v17 .. v23}, Lgg0/c$b;-><init>(Lsz0/q0;Lgg0/a;Lgg0/a;Lgg0/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/16 v20, 0x5

    move-object/from16 v18, v17

    const/16 v17, 0x0

    invoke-direct/range {v16 .. v21}, Lgg0/c;-><init>(Lgg0/c$e;Lgg0/c$b;Lgg0/c$c;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/4 v12, 0x0

    const/4 v13, 0x2

    const/4 v10, 0x0

    move-object/from16 v9, v16

    invoke-static/range {v8 .. v13}, Lp1/x;->n(Lec3/l;Ljava/lang/Object;Lq83/j;Landroidx/compose/runtime/Composer;II)Lp1/c1;

    move-result-object v8

    invoke-static {v5}, Lig0/i;->g(Ll83/h;)Lgg0/b;

    move-result-object v9

    invoke-virtual {v11, v5}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v10

    and-int/lit8 v12, v0, 0xe

    if-ne v12, v4, :cond_b

    const/4 v4, 0x1

    goto :goto_6

    :cond_b
    const/4 v4, 0x0

    :goto_6
    or-int/2addr v4, v10

    and-int/lit8 v0, v0, 0x70

    if-ne v0, v14, :cond_c

    const/4 v0, 0x1

    goto :goto_7

    :cond_c
    const/4 v0, 0x0

    :goto_7
    or-int/2addr v0, v4

    invoke-virtual {v11, v3}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v4

    or-int/2addr v0, v4

    invoke-virtual {v11}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    if-nez v0, :cond_e

    if-ne v4, v15, :cond_d

    goto :goto_8

    :cond_d
    move-object v13, v5

    goto :goto_9

    :cond_e
    :goto_8
    new-instance v0, Lig0/i$b;

    move-object v13, v5

    const/4 v5, 0x0

    move-object v4, v3

    move-object v3, v13

    invoke-direct/range {v0 .. v5}, Lig0/i$b;-><init>(Ljava/lang/String;Ljava/lang/String;Ll83/h;Lfg0/c;Lq83/d;)V

    move-object v3, v4

    invoke-virtual {v11, v0}, Lp1/q;->p0(Ljava/lang/Object;)V

    move-object v4, v0

    :goto_9
    check-cast v4, Lc93/m;

    invoke-static {v11, v4, v9}, Lp1/x;->g(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v8}, Lig0/i;->h(Lp1/t2;)Lgg0/c;

    move-result-object v0

    invoke-virtual {v11, v6}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v1

    invoke-virtual {v11, v13}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v2

    or-int/2addr v1, v2

    invoke-virtual {v11, v3}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v2

    or-int/2addr v1, v2

    invoke-virtual {v11}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    if-nez v1, :cond_f

    if-ne v2, v15, :cond_10

    :cond_f
    new-instance v2, Lig0/h;

    const/4 v1, 0x0

    invoke-direct {v2, v6, v3, v13, v1}, Lig0/h;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    invoke-virtual {v11, v2}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_10
    check-cast v2, Lkotlin/jvm/functions/Function1;

    const/4 v1, 0x0

    invoke-static {v0, v2, v11, v1, v1}, Lig0/i;->e(Lgg0/c;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    goto :goto_a

    :cond_11
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "KoinApplication has not been started"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_12
    invoke-virtual {v11}, Lp1/q;->X()V

    :goto_a
    invoke-virtual {v11}, Lp1/q;->u()Lp1/v1;

    move-result-object v8

    if-eqz v8, :cond_13

    new-instance v0, Lhy0/d1;

    const/16 v6, 0xc

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move-object/from16 v4, p3

    move v5, v7

    invoke-direct/range {v0 .. v6}, Lhy0/d1;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;II)V

    iput-object v0, v8, Lp1/v1;->d:Lc93/m;

    :cond_13
    return-void
.end method

.method private static final g(Ll83/h;)Lgg0/b;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ll83/h;",
            ")",
            "Lgg0/b;"
        }
    .end annotation

    invoke-interface {p0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lgg0/b;

    return-object p0
.end method

.method private static final h(Lp1/t2;)Lgg0/c;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp1/t2;",
            ")",
            "Lgg0/c;"
        }
    .end annotation

    invoke-interface {p0}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lgg0/c;

    return-object p0
.end method

.method private static final i(Lfg0/a;Lfg0/c;Ll83/h;Lgg0/a;)Ll83/a0;
    .locals 1

    const-string v0, "event"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p3}, Lfg0/a;->c(Lgg0/a;)Lgg0/a;

    move-result-object p0

    instance-of p3, p0, Lgg0/a$m;

    if-eqz p3, :cond_0

    invoke-static {p2}, Lig0/i;->g(Ll83/h;)Lgg0/b;

    move-result-object p1

    check-cast p0, Lgg0/a$m;

    invoke-virtual {p1, p0}, Lgg0/b;->o(Lgg0/a$m;)V

    goto :goto_0

    :cond_0
    instance-of p2, p0, Lgg0/a$h;

    if-eqz p2, :cond_1

    check-cast p0, Lgg0/a$h;

    invoke-virtual {p1, p0}, Lfg0/c;->b(Lgg0/a$h;)V

    :cond_1
    :goto_0
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final j(Ljava/lang/String;Ljava/lang/String;Lfg0/c;Lfg0/a;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 6

    or-int/lit8 p4, p4, 0x1

    invoke-static {p4}, Lp1/x;->L(I)I

    move-result v5

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p5

    invoke-static/range {v0 .. v5}, Lig0/i;->f(Ljava/lang/String;Ljava/lang/String;Lfg0/c;Lfg0/a;Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final k(Lgg0/a;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final l(Lgg0/c;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, Lp1/x;->L(I)I

    move-result p2

    invoke-static {p0, p1, p4, p2, p3}, Lig0/i;->e(Lgg0/c;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static final synthetic m(Ll83/h;)Lgg0/b;
    .locals 0

    invoke-static {p0}, Lig0/i;->g(Ll83/h;)Lgg0/b;

    move-result-object p0

    return-object p0
.end method
