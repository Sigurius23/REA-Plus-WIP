.class public abstract Lqg0/e;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000:\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u001a1\u0010\t\u001a\u00020\u00082\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u0006H\u0007\u00a2\u0006\u0004\u0008\t\u0010\n\u001a7\u0010\u0010\u001a\u00020\u00082\u0006\u0010\u000c\u001a\u00020\u000b2\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u00062\u0014\u0008\u0002\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00080\rH\u0001\u00a2\u0006\u0004\u0008\u0010\u0010\u0011\u00a8\u0006\u0014\u00b2\u0006\u000c\u0010\u0013\u001a\u00020\u00128\nX\u008a\u0084\u0002\u00b2\u0006\u000c\u0010\u000c\u001a\u00020\u000b8\nX\u008a\u0084\u0002"
    }
    d2 = {
        "Log0/a$a;",
        "screenViewEvent",
        "Lng0/c;",
        "navRouter",
        "Lng0/a;",
        "actionRouter",
        "",
        "isPresented",
        "Ll83/a0;",
        "e",
        "(Log0/a$a;Lng0/c;Lng0/a;ZLandroidx/compose/runtime/Composer;II)V",
        "Log0/c;",
        "viewState",
        "Lkotlin/Function1;",
        "Log0/a;",
        "onEvent",
        "f",
        "(Log0/c;ZLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V",
        "Log0/b;",
        "viewModel",
        "advanced-labs-management_release"
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
.method public static synthetic a(Log0/a;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lqg0/e;->k(Log0/a;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Log0/a$a;Lng0/c;Lng0/a;ZIILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p7}, Lqg0/e;->j(Log0/a$a;Lng0/c;Lng0/a;ZIILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Log0/c;ZLkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p6}, Lqg0/e;->l(Log0/c;ZLkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Lng0/a;Lng0/c;Ll83/h;Log0/a;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lqg0/e;->i(Lng0/a;Lng0/c;Ll83/h;Log0/a;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final e(Log0/a$a;Lng0/c;Lng0/a;ZLandroidx/compose/runtime/Composer;II)V
    .locals 24

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move/from16 v5, p5

    const-string v0, "screenViewEvent"

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "navRouter"

    invoke-static {v2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "actionRouter"

    invoke-static {v3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v9, p4

    check-cast v9, Lp1/q;

    const v0, -0x5757ff9e

    invoke-virtual {v9, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, v5, 0x6

    const/4 v4, 0x4

    if-nez v0, :cond_1

    invoke-virtual {v9, v1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    move v0, v4

    goto :goto_0

    :cond_0
    const/4 v0, 0x2

    :goto_0
    or-int/2addr v0, v5

    goto :goto_1

    :cond_1
    move v0, v5

    :goto_1
    and-int/lit8 v6, v5, 0x30

    if-nez v6, :cond_3

    invoke-virtual {v9, v2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_2

    const/16 v6, 0x20

    goto :goto_2

    :cond_2
    const/16 v6, 0x10

    :goto_2
    or-int/2addr v0, v6

    :cond_3
    and-int/lit16 v6, v5, 0x180

    if-nez v6, :cond_5

    invoke-virtual {v9, v3}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_4

    const/16 v6, 0x100

    goto :goto_3

    :cond_4
    const/16 v6, 0x80

    :goto_3
    or-int/2addr v0, v6

    :cond_5
    and-int/lit8 v6, p6, 0x8

    if-eqz v6, :cond_7

    or-int/lit16 v0, v0, 0xc00

    :cond_6
    move/from16 v7, p3

    goto :goto_5

    :cond_7
    and-int/lit16 v7, v5, 0xc00

    if-nez v7, :cond_6

    move/from16 v7, p3

    invoke-virtual {v9, v7}, Lp1/q;->h(Z)Z

    move-result v8

    if-eqz v8, :cond_8

    const/16 v8, 0x800

    goto :goto_4

    :cond_8
    const/16 v8, 0x400

    :goto_4
    or-int/2addr v0, v8

    :goto_5
    and-int/lit16 v8, v0, 0x493

    const/16 v10, 0x492

    const/4 v13, 0x0

    if-eq v8, v10, :cond_9

    const/4 v8, 0x1

    goto :goto_6

    :cond_9
    move v8, v13

    :goto_6
    and-int/lit8 v10, v0, 0x1

    invoke-virtual {v9, v10, v8}, Lp1/q;->U(IZ)Z

    move-result v8

    if-eqz v8, :cond_13

    if-eqz v6, :cond_a

    move v14, v13

    goto :goto_7

    :cond_a
    move v14, v7

    :goto_7
    const v6, -0x649fae96

    invoke-virtual {v9, v6}, Lp1/q;->f0(I)V

    sget-object v6, Lpf3/a;->b:Lnf3/a;

    if-eqz v6, :cond_12

    iget-object v6, v6, Lnf3/a;->a:Lwf3/a;

    iget-object v6, v6, Lwf3/a;->d:Lxf3/c;

    const v7, -0x649fad62

    const v8, -0x384098

    invoke-static {v9, v7, v9, v13, v8}, Lvl/b;->r(Lp1/q;ILp1/q;ZI)Ljf3/a;

    move-result-object v7

    const/4 v15, 0x0

    invoke-virtual {v9, v15}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v8

    invoke-virtual {v9, v15}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v10

    or-int/2addr v8, v10

    invoke-virtual {v9}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v10

    sget-object v11, Lp1/l;->a:Lp1/v0;

    if-nez v8, :cond_b

    if-ne v10, v11, :cond_c

    :cond_b
    sget-object v8, Ll83/i;->y:Ll83/i;

    new-instance v10, Lqg0/e$a;

    invoke-direct {v10, v6, v15, v15, v7}, Lqg0/e$a;-><init>(Lxf3/c;Lvf3/a;Lc93/a;Ljf3/a;)V

    invoke-static {v8, v10}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v10

    invoke-virtual {v9, v10}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_c
    invoke-virtual {v9, v13}, Lp1/q;->q(Z)V

    check-cast v10, Ll83/h;

    invoke-virtual {v9, v13}, Lp1/q;->q(Z)V

    invoke-static {v10}, Lqg0/e;->g(Ll83/h;)Log0/b;

    move-result-object v6

    invoke-virtual {v6}, Log0/b;->getViewState()Lec3/l;

    move-result-object v6

    new-instance v16, Log0/c;

    new-instance v17, Log0/c$c;

    sget-object v7, Lsz0/o0;->a:Lsz0/o0;

    invoke-virtual {v7}, Lsz0/o0;->b()Lsz0/q0;

    move-result-object v18

    const/16 v22, 0xe

    const/16 v23, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    invoke-direct/range {v17 .. v23}, Log0/c$c;-><init>(Lsz0/q0;Log0/a;Log0/a;Log0/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/16 v20, 0x5

    move-object/from16 v18, v17

    const/16 v17, 0x0

    invoke-direct/range {v16 .. v21}, Log0/c;-><init>(Log0/c$a;Log0/c$c;Log0/c$d;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object v7, v10

    const/4 v10, 0x0

    move-object v8, v11

    const/4 v11, 0x2

    move-object/from16 v17, v8

    const/4 v8, 0x0

    move-object/from16 p3, v7

    move-object/from16 v7, v16

    move-object/from16 v12, v17

    invoke-static/range {v6 .. v11}, Lp1/x;->n(Lec3/l;Ljava/lang/Object;Lq83/j;Landroidx/compose/runtime/Composer;II)Lp1/c1;

    move-result-object v6

    invoke-static/range {p3 .. p3}, Lqg0/e;->g(Ll83/h;)Log0/b;

    move-result-object v7

    invoke-virtual {v9, v3}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v8

    and-int/lit8 v10, v0, 0xe

    if-ne v10, v4, :cond_d

    const/4 v13, 0x1

    :cond_d
    or-int v4, v8, v13

    move-object/from16 v10, p3

    invoke-virtual {v9, v10}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v8

    or-int/2addr v4, v8

    invoke-virtual {v9}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v8

    if-nez v4, :cond_e

    if-ne v8, v12, :cond_f

    :cond_e
    new-instance v8, Lqg0/e$b;

    invoke-direct {v8, v3, v1, v10, v15}, Lqg0/e$b;-><init>(Lng0/a;Log0/a$a;Ll83/h;Lq83/d;)V

    invoke-virtual {v9, v8}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_f
    check-cast v8, Lc93/m;

    invoke-static {v9, v8, v7}, Lp1/x;->g(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v6}, Lqg0/e;->h(Lp1/t2;)Log0/c;

    move-result-object v6

    invoke-virtual {v9, v3}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v4

    invoke-virtual {v9, v10}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v7

    or-int/2addr v4, v7

    invoke-virtual {v9, v2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v7

    or-int/2addr v4, v7

    invoke-virtual {v9}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v7

    if-nez v4, :cond_10

    if-ne v7, v12, :cond_11

    :cond_10
    new-instance v7, Lno0/j0;

    const/16 v4, 0x17

    invoke-direct {v7, v3, v2, v10, v4}, Lno0/j0;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    invoke-virtual {v9, v7}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_11
    move-object v8, v7

    check-cast v8, Lkotlin/jvm/functions/Function1;

    shr-int/lit8 v0, v0, 0x6

    and-int/lit8 v10, v0, 0x70

    const/4 v11, 0x0

    move v7, v14

    invoke-static/range {v6 .. v11}, Lqg0/e;->f(Log0/c;ZLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    :goto_8
    move v4, v7

    goto :goto_9

    :cond_12
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "KoinApplication has not been started"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_13
    invoke-virtual {v9}, Lp1/q;->X()V

    goto :goto_8

    :goto_9
    invoke-virtual {v9}, Lp1/q;->u()Lp1/v1;

    move-result-object v8

    if-eqz v8, :cond_14

    new-instance v0, Law0/h;

    const/16 v7, 0x1a

    move/from16 v6, p6

    invoke-direct/range {v0 .. v7}, Law0/h;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;ZIII)V

    iput-object v0, v8, Lp1/v1;->d:Lc93/m;

    :cond_14
    return-void
.end method

.method public static final f(Log0/c;ZLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V
    .locals 12
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Log0/c;",
            "Z",
            "Lkotlin/jvm/functions/Function1;",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    move/from16 v4, p4

    const-string v0, "viewState"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v8, p3

    check-cast v8, Lp1/q;

    const p3, -0x4237bfe4

    invoke-virtual {v8, p3}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 p3, v4, 0x6

    if-nez p3, :cond_1

    invoke-virtual {v8, p0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result p3

    if-eqz p3, :cond_0

    const/4 p3, 0x4

    goto :goto_0

    :cond_0
    const/4 p3, 0x2

    :goto_0
    or-int/2addr p3, v4

    goto :goto_1

    :cond_1
    move p3, v4

    :goto_1
    and-int/lit8 v0, p5, 0x2

    if-eqz v0, :cond_2

    or-int/lit8 p3, p3, 0x30

    goto :goto_3

    :cond_2
    and-int/lit8 v1, v4, 0x30

    if-nez v1, :cond_4

    invoke-virtual {v8, p1}, Lp1/q;->h(Z)Z

    move-result v1

    if-eqz v1, :cond_3

    const/16 v1, 0x20

    goto :goto_2

    :cond_3
    const/16 v1, 0x10

    :goto_2
    or-int/2addr p3, v1

    :cond_4
    :goto_3
    and-int/lit8 v1, p5, 0x4

    if-eqz v1, :cond_5

    or-int/lit16 p3, p3, 0x180

    goto :goto_5

    :cond_5
    and-int/lit16 v2, v4, 0x180

    if-nez v2, :cond_7

    invoke-virtual {v8, p2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_6

    const/16 v2, 0x100

    goto :goto_4

    :cond_6
    const/16 v2, 0x80

    :goto_4
    or-int/2addr p3, v2

    :cond_7
    :goto_5
    and-int/lit16 v2, p3, 0x93

    const/16 v3, 0x92

    const/4 v11, 0x0

    if-eq v2, v3, :cond_8

    const/4 v2, 0x1

    goto :goto_6

    :cond_8
    move v2, v11

    :goto_6
    and-int/lit8 v3, p3, 0x1

    invoke-virtual {v8, v3, v2}, Lp1/q;->U(IZ)Z

    move-result v2

    if-eqz v2, :cond_e

    if-eqz v0, :cond_9

    move v6, v11

    goto :goto_7

    :cond_9
    move v6, p1

    :goto_7
    if-eqz v1, :cond_b

    invoke-virtual {v8}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object p1

    sget-object p2, Lp1/l;->a:Lp1/v0;

    if-ne p1, p2, :cond_a

    new-instance p1, Lqe0/b;

    const/16 p2, 0x8

    invoke-direct {p1, p2}, Lqe0/b;-><init>(I)V

    invoke-virtual {v8, p1}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_a
    move-object p2, p1

    check-cast p2, Lkotlin/jvm/functions/Function1;

    :cond_b
    move-object v7, p2

    and-int/lit8 p1, p3, 0xe

    or-int/lit8 p2, p1, 0x30

    const-string v0, "advanced_labs_management"

    invoke-static {p0, v0, v8, p2}, Lfy1/j;->c(Lfy1/k;Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V

    invoke-virtual {p0}, Log0/c;->b()Log0/c$c;

    move-result-object p2

    if-eqz p2, :cond_c

    const p1, 0x6cb8d411

    invoke-virtual {v8, p1}, Lp1/q;->e0(I)V

    invoke-virtual {p0}, Log0/c;->b()Log0/c$c;

    move-result-object p1

    shr-int/lit8 p2, p3, 0x3

    and-int/lit8 p2, p2, 0x70

    invoke-static {p1, v7, v8, p2}, Lqg0/b;->g(Log0/c$c;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    invoke-virtual {v8, v11}, Lp1/q;->q(Z)V

    goto :goto_8

    :cond_c
    invoke-virtual {p0}, Log0/c;->d()Log0/c$d;

    move-result-object p2

    if-eqz p2, :cond_d

    const p2, 0x2a63ac7a

    invoke-virtual {v8, p2}, Lp1/q;->e0(I)V

    shr-int/lit8 p2, p3, 0x3

    and-int/lit8 p2, p2, 0x70

    or-int/2addr p1, p2

    invoke-static {p0, v7, v8, p1}, Lqg0/c;->c(Log0/c;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    invoke-virtual {p0}, Log0/c;->d()Log0/c$d;

    move-result-object v5

    and-int/lit16 v9, p3, 0x3f0

    const/4 v10, 0x0

    invoke-static/range {v5 .. v10}, Lqg0/d;->i(Log0/c$d;ZLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    invoke-virtual {v8, v11}, Lp1/q;->q(Z)V

    goto :goto_8

    :cond_d
    const p1, 0x2a664966

    invoke-virtual {v8, p1}, Lp1/q;->e0(I)V

    invoke-virtual {v8, v11}, Lp1/q;->q(Z)V

    :goto_8
    move v2, v6

    move-object v3, v7

    goto :goto_9

    :cond_e
    invoke-virtual {v8}, Lp1/q;->X()V

    move v2, p1

    move-object v3, p2

    :goto_9
    invoke-virtual {v8}, Lp1/q;->u()Lp1/v1;

    move-result-object p1

    if-eqz p1, :cond_f

    new-instance v0, Lbg0/h;

    const/16 v6, 0x1b

    move-object v1, p0

    move/from16 v5, p5

    invoke-direct/range {v0 .. v6}, Lbg0/h;-><init>(Ljava/lang/Object;ZLjava/lang/Object;III)V

    iput-object v0, p1, Lp1/v1;->d:Lc93/m;

    :cond_f
    return-void
.end method

.method private static final g(Ll83/h;)Log0/b;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ll83/h;",
            ")",
            "Log0/b;"
        }
    .end annotation

    invoke-interface {p0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Log0/b;

    return-object p0
.end method

.method private static final h(Lp1/t2;)Log0/c;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp1/t2;",
            ")",
            "Log0/c;"
        }
    .end annotation

    invoke-interface {p0}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Log0/c;

    return-object p0
.end method

.method private static final i(Lng0/a;Lng0/c;Ll83/h;Log0/a;)Ll83/a0;
    .locals 1

    const-string v0, "event"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p3}, Lng0/a;->c(Log0/a;)Log0/a;

    move-result-object p0

    instance-of p3, p0, Log0/a$i;

    if-eqz p3, :cond_0

    invoke-static {p2}, Lqg0/e;->g(Ll83/h;)Log0/b;

    move-result-object p1

    check-cast p0, Log0/a$i;

    invoke-virtual {p1, p0}, Log0/b;->n(Log0/a$i;)V

    goto :goto_0

    :cond_0
    instance-of p2, p0, Log0/a$g;

    if-eqz p2, :cond_1

    check-cast p0, Log0/a$g;

    invoke-virtual {p1, p0}, Lng0/c;->b(Log0/a$g;)V

    :cond_1
    :goto_0
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final j(Log0/a$a;Lng0/c;Lng0/a;ZIILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 7

    or-int/lit8 p4, p4, 0x1

    invoke-static {p4}, Lp1/x;->L(I)I

    move-result v5

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move v3, p3

    move v6, p5

    move-object v4, p6

    invoke-static/range {v0 .. v6}, Lqg0/e;->e(Log0/a$a;Lng0/c;Lng0/a;ZLandroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final k(Log0/a;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final l(Log0/c;ZLkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 6

    or-int/lit8 p3, p3, 0x1

    invoke-static {p3}, Lp1/x;->L(I)I

    move-result v4

    move-object v0, p0

    move v1, p1

    move-object v2, p2

    move v5, p4

    move-object v3, p5

    invoke-static/range {v0 .. v5}, Lqg0/e;->f(Log0/c;ZLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static final synthetic m(Ll83/h;)Log0/b;
    .locals 0

    invoke-static {p0}, Lqg0/e;->g(Ll83/h;)Log0/b;

    move-result-object p0

    return-object p0
.end method
