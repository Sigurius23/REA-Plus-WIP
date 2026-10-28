.class public abstract Lbg0/i;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000<\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u001a9\u0010\n\u001a\u00020\t2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u0008\u001a\u00020\u0007H\u0007\u00a2\u0006\u0004\u0008\n\u0010\u000b\u001a7\u0010\u0011\u001a\u00020\t2\u0006\u0010\r\u001a\u00020\u000c2\u0008\u0008\u0002\u0010\u0008\u001a\u00020\u00072\u0014\u0008\u0002\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\t0\u000eH\u0001\u00a2\u0006\u0004\u0008\u0011\u0010\u0012\u00a8\u0006\u0015\u00b2\u0006\u000c\u0010\u0014\u001a\u00020\u00138\nX\u008a\u0084\u0002\u00b2\u0006\u000c\u0010\r\u001a\u00020\u000c8\nX\u008a\u0084\u0002"
    }
    d2 = {
        "",
        "source",
        "testCount",
        "Lyf0/c;",
        "navRouter",
        "Lyf0/a;",
        "actionRouter",
        "",
        "isPresented",
        "Ll83/a0;",
        "e",
        "(Ljava/lang/String;Ljava/lang/String;Lyf0/c;Lyf0/a;ZLandroidx/compose/runtime/Composer;II)V",
        "Lzf0/c;",
        "viewState",
        "Lkotlin/Function1;",
        "Lzf0/a;",
        "onEvent",
        "f",
        "(Lzf0/c;ZLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V",
        "Lzf0/b;",
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
.method public static synthetic a(Lzf0/a;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lbg0/i;->k(Lzf0/a;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Ljava/lang/String;Ljava/lang/String;Lyf0/c;Lyf0/a;ZIILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p8}, Lbg0/i;->j(Ljava/lang/String;Ljava/lang/String;Lyf0/c;Lyf0/a;ZIILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Lzf0/c;ZLkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p6}, Lbg0/i;->l(Lzf0/c;ZLkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Lyf0/a;Lyf0/c;Ll83/h;Lzf0/a;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lbg0/i;->i(Lyf0/a;Lyf0/c;Ll83/h;Lzf0/a;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final e(Ljava/lang/String;Ljava/lang/String;Lyf0/c;Lyf0/a;ZLandroidx/compose/runtime/Composer;II)V
    .locals 24

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move-object/from16 v4, p3

    move/from16 v6, p6

    const-string v0, "source"

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "testCount"

    invoke-static {v2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "navRouter"

    invoke-static {v3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "actionRouter"

    invoke-static {v4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v10, p5

    check-cast v10, Lp1/q;

    const v0, -0x4a1687c5

    invoke-virtual {v10, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, v6, 0x6

    const/4 v5, 0x4

    if-nez v0, :cond_1

    invoke-virtual {v10, v1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    move v0, v5

    goto :goto_0

    :cond_0
    const/4 v0, 0x2

    :goto_0
    or-int/2addr v0, v6

    goto :goto_1

    :cond_1
    move v0, v6

    :goto_1
    and-int/lit8 v7, v6, 0x30

    const/16 v13, 0x20

    if-nez v7, :cond_3

    invoke-virtual {v10, v2}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_2

    move v7, v13

    goto :goto_2

    :cond_2
    const/16 v7, 0x10

    :goto_2
    or-int/2addr v0, v7

    :cond_3
    and-int/lit16 v7, v6, 0x180

    if-nez v7, :cond_5

    invoke-virtual {v10, v3}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_4

    const/16 v7, 0x100

    goto :goto_3

    :cond_4
    const/16 v7, 0x80

    :goto_3
    or-int/2addr v0, v7

    :cond_5
    and-int/lit16 v7, v6, 0xc00

    if-nez v7, :cond_7

    invoke-virtual {v10, v4}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_6

    const/16 v7, 0x800

    goto :goto_4

    :cond_6
    const/16 v7, 0x400

    :goto_4
    or-int/2addr v0, v7

    :cond_7
    and-int/lit8 v7, p7, 0x10

    if-eqz v7, :cond_9

    or-int/lit16 v0, v0, 0x6000

    :cond_8
    move/from16 v8, p4

    goto :goto_6

    :cond_9
    and-int/lit16 v8, v6, 0x6000

    if-nez v8, :cond_8

    move/from16 v8, p4

    invoke-virtual {v10, v8}, Lp1/q;->h(Z)Z

    move-result v9

    if-eqz v9, :cond_a

    const/16 v9, 0x4000

    goto :goto_5

    :cond_a
    const/16 v9, 0x2000

    :goto_5
    or-int/2addr v0, v9

    :goto_6
    and-int/lit16 v9, v0, 0x2493

    const/16 v11, 0x2492

    const/4 v15, 0x0

    if-eq v9, v11, :cond_b

    const/4 v9, 0x1

    goto :goto_7

    :cond_b
    move v9, v15

    :goto_7
    and-int/lit8 v11, v0, 0x1

    invoke-virtual {v10, v11, v9}, Lp1/q;->U(IZ)Z

    move-result v9

    if-eqz v9, :cond_16

    if-eqz v7, :cond_c

    move/from16 v16, v15

    goto :goto_8

    :cond_c
    move/from16 v16, v8

    :goto_8
    const v7, -0x649fae96

    invoke-virtual {v10, v7}, Lp1/q;->f0(I)V

    sget-object v7, Lpf3/a;->b:Lnf3/a;

    if-eqz v7, :cond_15

    iget-object v7, v7, Lnf3/a;->a:Lwf3/a;

    iget-object v7, v7, Lwf3/a;->d:Lxf3/c;

    const v8, -0x649fad62

    const v9, -0x384098

    invoke-static {v10, v8, v10, v15, v9}, Lvl/b;->r(Lp1/q;ILp1/q;ZI)Ljf3/a;

    move-result-object v8

    const/4 v9, 0x0

    invoke-virtual {v10, v9}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v11

    invoke-virtual {v10, v9}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v12

    or-int/2addr v11, v12

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v12

    sget-object v14, Lp1/l;->a:Lp1/v0;

    if-nez v11, :cond_d

    if-ne v12, v14, :cond_e

    :cond_d
    sget-object v11, Ll83/i;->y:Ll83/i;

    new-instance v12, Lbg0/i$a;

    invoke-direct {v12, v7, v9, v9, v8}, Lbg0/i$a;-><init>(Lxf3/c;Lvf3/a;Lc93/a;Ljf3/a;)V

    invoke-static {v11, v12}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v12

    invoke-virtual {v10, v12}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_e
    invoke-virtual {v10, v15}, Lp1/q;->q(Z)V

    check-cast v12, Ll83/h;

    invoke-virtual {v10, v15}, Lp1/q;->q(Z)V

    invoke-static {v12}, Lbg0/i;->g(Ll83/h;)Lzf0/b;

    move-result-object v7

    invoke-virtual {v7}, Lzf0/b;->getViewState()Lec3/l;

    move-result-object v7

    new-instance v8, Lzf0/c;

    new-instance v17, Lzf0/c$b;

    sget-object v11, Lsz0/o0;->a:Lsz0/o0;

    invoke-virtual {v11}, Lsz0/o0;->b()Lsz0/q0;

    move-result-object v18

    const/16 v22, 0xe

    const/16 v23, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    invoke-direct/range {v17 .. v23}, Lzf0/c$b;-><init>(Lsz0/q0;Lzf0/a;Lzf0/a;Lzf0/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/16 v21, 0x5

    const/16 v22, 0x0

    const/16 v18, 0x0

    move-object/from16 v19, v17

    move-object/from16 v17, v8

    invoke-direct/range {v17 .. v22}, Lzf0/c;-><init>(Lzf0/c$c;Lzf0/c$b;Lzf0/c$d;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/4 v11, 0x0

    move-object/from16 v17, v12

    const/4 v12, 0x2

    move-object/from16 v18, v9

    const/4 v9, 0x0

    move-object/from16 p4, v17

    move-object/from16 v15, v18

    invoke-static/range {v7 .. v12}, Lp1/x;->n(Lec3/l;Ljava/lang/Object;Lq83/j;Landroidx/compose/runtime/Composer;II)Lp1/c1;

    move-result-object v7

    invoke-static/range {p4 .. p4}, Lbg0/i;->g(Ll83/h;)Lzf0/b;

    move-result-object v8

    move-object/from16 v12, p4

    invoke-virtual {v10, v12}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v9

    and-int/lit8 v11, v0, 0xe

    if-ne v11, v5, :cond_f

    const/4 v5, 0x1

    goto :goto_9

    :cond_f
    const/4 v5, 0x0

    :goto_9
    or-int/2addr v5, v9

    and-int/lit8 v9, v0, 0x70

    if-ne v9, v13, :cond_10

    const/16 v17, 0x1

    goto :goto_a

    :cond_10
    const/16 v17, 0x0

    :goto_a
    or-int v5, v5, v17

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v9

    if-nez v5, :cond_11

    if-ne v9, v14, :cond_12

    :cond_11
    new-instance v9, Lbg0/i$b;

    invoke-direct {v9, v1, v2, v12, v15}, Lbg0/i$b;-><init>(Ljava/lang/String;Ljava/lang/String;Ll83/h;Lq83/d;)V

    invoke-virtual {v10, v9}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_12
    check-cast v9, Lc93/m;

    invoke-static {v10, v9, v8}, Lp1/x;->g(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v7}, Lbg0/i;->h(Lp1/t2;)Lzf0/c;

    move-result-object v7

    invoke-virtual {v10, v4}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v5

    invoke-virtual {v10, v12}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v8

    or-int/2addr v5, v8

    invoke-virtual {v10, v3}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v8

    or-int/2addr v5, v8

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v8

    if-nez v5, :cond_13

    if-ne v8, v14, :cond_14

    :cond_13
    new-instance v8, Lq;

    const/16 v5, 0xb

    invoke-direct {v8, v4, v3, v12, v5}, Lq;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    invoke-virtual {v10, v8}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_14
    move-object v9, v8

    check-cast v9, Lkotlin/jvm/functions/Function1;

    shr-int/lit8 v0, v0, 0x9

    and-int/lit8 v11, v0, 0x70

    const/4 v12, 0x0

    move/from16 v8, v16

    invoke-static/range {v7 .. v12}, Lbg0/i;->f(Lzf0/c;ZLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    :goto_b
    move v5, v8

    goto :goto_c

    :cond_15
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "KoinApplication has not been started"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_16
    invoke-virtual {v10}, Lp1/q;->X()V

    goto :goto_b

    :goto_c
    invoke-virtual {v10}, Lp1/q;->u()Lp1/v1;

    move-result-object v9

    if-eqz v9, :cond_17

    new-instance v0, Lbf0/g;

    const/4 v8, 0x2

    move/from16 v7, p7

    invoke-direct/range {v0 .. v8}, Lbf0/g;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;ZIII)V

    iput-object v0, v9, Lp1/v1;->d:Lc93/m;

    :cond_17
    return-void
.end method

.method public static final f(Lzf0/c;ZLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V
    .locals 13
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lzf0/c;",
            "Z",
            "Lkotlin/jvm/functions/Function1;",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    move/from16 v4, p4

    const-string v0, "viewState"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v9, p3

    check-cast v9, Lp1/q;

    const v0, -0xc5cd39c

    invoke-virtual {v9, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, v4, 0x6

    if-nez v0, :cond_1

    invoke-virtual {v9, p0}, Lp1/q;->i(Ljava/lang/Object;)Z

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

    if-eqz v1, :cond_2

    or-int/lit8 v0, v0, 0x30

    goto :goto_3

    :cond_2
    and-int/lit8 v2, v4, 0x30

    if-nez v2, :cond_4

    invoke-virtual {v9, p1}, Lp1/q;->h(Z)Z

    move-result v2

    if-eqz v2, :cond_3

    const/16 v2, 0x20

    goto :goto_2

    :cond_3
    const/16 v2, 0x10

    :goto_2
    or-int/2addr v0, v2

    :cond_4
    :goto_3
    and-int/lit8 v2, p5, 0x4

    if-eqz v2, :cond_5

    or-int/lit16 v0, v0, 0x180

    goto :goto_5

    :cond_5
    and-int/lit16 v3, v4, 0x180

    if-nez v3, :cond_7

    invoke-virtual {v9, p2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_6

    const/16 v3, 0x100

    goto :goto_4

    :cond_6
    const/16 v3, 0x80

    :goto_4
    or-int/2addr v0, v3

    :cond_7
    :goto_5
    and-int/lit16 v3, v0, 0x93

    const/16 v5, 0x92

    const/4 v12, 0x0

    if-eq v3, v5, :cond_8

    const/4 v3, 0x1

    goto :goto_6

    :cond_8
    move v3, v12

    :goto_6
    and-int/lit8 v5, v0, 0x1

    invoke-virtual {v9, v5, v3}, Lp1/q;->U(IZ)Z

    move-result v3

    if-eqz v3, :cond_e

    if-eqz v1, :cond_9

    move v7, v12

    goto :goto_7

    :cond_9
    move v7, p1

    :goto_7
    if-eqz v2, :cond_b

    invoke-virtual {v9}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object p1

    sget-object p2, Lp1/l;->a:Lp1/v0;

    if-ne p1, p2, :cond_a

    new-instance p1, Lb72/a;

    const/16 p2, 0xf

    invoke-direct {p1, p2}, Lb72/a;-><init>(I)V

    invoke-virtual {v9, p1}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_a
    move-object p2, p1

    check-cast p2, Lkotlin/jvm/functions/Function1;

    :cond_b
    move-object v8, p2

    and-int/lit8 p1, v0, 0xe

    or-int/lit8 p2, p1, 0x30

    const-string v1, "advanced_labs_purchase_addons"

    invoke-static {p0, v1, v9, p2}, Lfy1/j;->c(Lfy1/k;Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V

    invoke-virtual {p0}, Lzf0/c;->b()Lzf0/c$b;

    move-result-object p2

    if-eqz p2, :cond_c

    const p1, -0x6876340f

    invoke-virtual {v9, p1}, Lp1/q;->e0(I)V

    invoke-virtual {p0}, Lzf0/c;->b()Lzf0/c$b;

    move-result-object p1

    shr-int/lit8 p2, v0, 0x3

    and-int/lit8 p2, p2, 0x70

    invoke-static {p1, v8, v9, p2}, Lbg0/d;->j(Lzf0/c$b;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    invoke-virtual {v9, v12}, Lp1/q;->q(Z)V

    goto :goto_8

    :cond_c
    invoke-virtual {p0}, Lzf0/c;->d()Lzf0/c$d;

    move-result-object p2

    if-eqz p2, :cond_d

    const p2, 0x59b1938a

    invoke-virtual {v9, p2}, Lp1/q;->e0(I)V

    shr-int/lit8 p2, v0, 0x3

    and-int/lit8 p2, p2, 0x70

    or-int/2addr p1, p2

    invoke-static {p0, v8, v9, p1}, Lbg0/f;->e(Lzf0/c;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    invoke-virtual {p0}, Lzf0/c;->d()Lzf0/c$d;

    move-result-object v5

    shl-int/lit8 p1, v0, 0x3

    and-int/lit16 v10, p1, 0x1f80

    const/4 v11, 0x2

    const/4 v6, 0x0

    invoke-static/range {v5 .. v11}, Lbg0/g;->k(Lzf0/c$d;Lf0/r1;ZLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    invoke-virtual {v9, v12}, Lp1/q;->q(Z)V

    goto :goto_8

    :cond_d
    const p1, 0x59b44e7e

    invoke-virtual {v9, p1}, Lp1/q;->e0(I)V

    invoke-virtual {v9, v12}, Lp1/q;->q(Z)V

    :goto_8
    move v2, v7

    move-object v3, v8

    goto :goto_9

    :cond_e
    invoke-virtual {v9}, Lp1/q;->X()V

    move v2, p1

    move-object v3, p2

    :goto_9
    invoke-virtual {v9}, Lp1/q;->u()Lp1/v1;

    move-result-object p1

    if-eqz p1, :cond_f

    new-instance v0, Lbg0/h;

    const/4 v6, 0x0

    move-object v1, p0

    move/from16 v5, p5

    invoke-direct/range {v0 .. v6}, Lbg0/h;-><init>(Ljava/lang/Object;ZLjava/lang/Object;III)V

    iput-object v0, p1, Lp1/v1;->d:Lc93/m;

    :cond_f
    return-void
.end method

.method private static final g(Ll83/h;)Lzf0/b;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ll83/h;",
            ")",
            "Lzf0/b;"
        }
    .end annotation

    invoke-interface {p0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lzf0/b;

    return-object p0
.end method

.method private static final h(Lp1/t2;)Lzf0/c;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp1/t2;",
            ")",
            "Lzf0/c;"
        }
    .end annotation

    invoke-interface {p0}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lzf0/c;

    return-object p0
.end method

.method private static final i(Lyf0/a;Lyf0/c;Ll83/h;Lzf0/a;)Ll83/a0;
    .locals 1

    const-string v0, "event"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0, p3}, Lyf0/a;->c(Lzf0/a;)Lzf0/a;

    move-result-object p0

    instance-of p3, p0, Lzf0/a$j;

    if-eqz p3, :cond_0

    invoke-static {p2}, Lbg0/i;->g(Ll83/h;)Lzf0/b;

    move-result-object p1

    check-cast p0, Lzf0/a$j;

    invoke-virtual {p1, p0}, Lzf0/b;->n(Lzf0/a$j;)V

    goto :goto_0

    :cond_0
    instance-of p2, p0, Lzf0/a$f;

    if-eqz p2, :cond_1

    check-cast p0, Lzf0/a$f;

    invoke-virtual {p1, p0}, Lyf0/c;->b(Lzf0/a$f;)V

    :cond_1
    :goto_0
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final j(Ljava/lang/String;Ljava/lang/String;Lyf0/c;Lyf0/a;ZIILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 8

    or-int/lit8 p5, p5, 0x1

    invoke-static {p5}, Lp1/x;->L(I)I

    move-result v6

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move v4, p4

    move v7, p6

    move-object v5, p7

    invoke-static/range {v0 .. v7}, Lbg0/i;->e(Ljava/lang/String;Ljava/lang/String;Lyf0/c;Lyf0/a;ZLandroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final k(Lzf0/a;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final l(Lzf0/c;ZLkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 6

    or-int/lit8 p3, p3, 0x1

    invoke-static {p3}, Lp1/x;->L(I)I

    move-result v4

    move-object v0, p0

    move v1, p1

    move-object v2, p2

    move v5, p4

    move-object v3, p5

    invoke-static/range {v0 .. v5}, Lbg0/i;->f(Lzf0/c;ZLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static final synthetic m(Ll83/h;)Lzf0/b;
    .locals 0

    invoke-static {p0}, Lbg0/i;->g(Ll83/h;)Lzf0/b;

    move-result-object p0

    return-object p0
.end method
