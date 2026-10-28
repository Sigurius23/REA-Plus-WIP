.class public abstract Lkv2/b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000P\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u001a)\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u0004H\u0007\u00a2\u0006\u0004\u0008\u0007\u0010\u0008\u001a+\u0010\u000e\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\t2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000c\u0012\u0004\u0012\u00020\u00060\u000bH\u0007\u00a2\u0006\u0004\u0008\u000e\u0010\u000f\u001a+\u0010\u0011\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u00102\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000c\u0012\u0004\u0012\u00020\u00060\u000bH\u0003\u00a2\u0006\u0004\u0008\u0011\u0010\u0012\u001a\u001d\u0010\u0016\u001a\u00020\u00062\u000c\u0010\u0015\u001a\u0008\u0012\u0004\u0012\u00020\u00140\u0013H\u0007\u00a2\u0006\u0004\u0008\u0016\u0010\u0017\u001a+\u0010\u0019\u001a\u00020\u00062\u0006\u0010\n\u001a\u00020\u00182\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000c\u0012\u0004\u0012\u00020\u00060\u000bH\u0003\u00a2\u0006\u0004\u0008\u0019\u0010\u001a\u00a8\u0006\u001d\u00b2\u0006\u000c\u0010\u001c\u001a\u00020\u001b8\nX\u008a\u0084\u0002\u00b2\u0006\u000c\u0010\n\u001a\u00020\t8\nX\u008a\u0084\u0002"
    }
    d2 = {
        "Lcom/whoop/weightlifting/StrengthTrainerDestination$i$a;",
        "navArgs",
        "Leb/u0;",
        "navController",
        "",
        "isExerciseDetailsV2ExperimentEnabled",
        "Ll83/a0;",
        "E",
        "(Lcom/whoop/weightlifting/StrengthTrainerDestination$i$a;Leb/u0;ZLandroidx/compose/runtime/Composer;II)V",
        "Ljv2/c;",
        "viewState",
        "Lkotlin/Function1;",
        "Ljv2/a;",
        "onEvent",
        "C",
        "(Ljv2/c;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V",
        "Ljv2/c$b;",
        "s",
        "(Ljv2/c$b;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V",
        "",
        "Ljv2/e;",
        "metaDataList",
        "J",
        "(Ljava/util/List;Landroidx/compose/runtime/Composer;I)V",
        "Ljv2/c$a;",
        "p",
        "(Ljv2/c$a;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V",
        "Ljv2/b;",
        "viewModel",
        "weightlifting_release"
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
.method private static final A(Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 1

    sget-object v0, Ljv2/a$c;->a:Ljv2/a$c;

    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final B(Ljv2/c$b;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, Lp1/x;->L(I)I

    move-result p2

    invoke-static {p0, p1, p3, p2}, Lkv2/b;->s(Ljv2/c$b;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static final C(Ljv2/c;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V
    .locals 4
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljv2/c;",
            "Lkotlin/jvm/functions/Function1;",
            "Landroidx/compose/runtime/Composer;",
            "I)V"
        }
    .end annotation

    const-string v0, "viewState"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onEvent"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p2, Lp1/q;

    const v0, -0x2bec0712

    invoke-virtual {p2, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, p3, 0x6

    if-nez v0, :cond_2

    and-int/lit8 v0, p3, 0x8

    if-nez v0, :cond_0

    invoke-virtual {p2, p0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v0

    goto :goto_0

    :cond_0
    invoke-virtual {p2, p0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v0

    :goto_0
    if-eqz v0, :cond_1

    const/4 v0, 0x4

    goto :goto_1

    :cond_1
    const/4 v0, 0x2

    :goto_1
    or-int/2addr v0, p3

    goto :goto_2

    :cond_2
    move v0, p3

    :goto_2
    and-int/lit8 v1, p3, 0x30

    if-nez v1, :cond_4

    invoke-virtual {p2, p1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_3

    const/16 v1, 0x20

    goto :goto_3

    :cond_3
    const/16 v1, 0x10

    :goto_3
    or-int/2addr v0, v1

    :cond_4
    and-int/lit8 v1, v0, 0x13

    const/16 v2, 0x12

    const/4 v3, 0x0

    if-eq v1, v2, :cond_5

    const/4 v1, 0x1

    goto :goto_4

    :cond_5
    move v1, v3

    :goto_4
    and-int/lit8 v2, v0, 0x1

    invoke-virtual {p2, v2, v1}, Lp1/q;->U(IZ)Z

    move-result v1

    if-eqz v1, :cond_8

    instance-of v1, p0, Ljv2/c$a;

    if-eqz v1, :cond_6

    const v1, -0x3fc7f404

    invoke-virtual {p2, v1}, Lp1/q;->e0(I)V

    move-object v1, p0

    check-cast v1, Ljv2/c$a;

    and-int/lit8 v0, v0, 0x7e

    invoke-static {v1, p1, p2, v0}, Lkv2/b;->p(Ljv2/c$a;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    invoke-virtual {p2, v3}, Lp1/q;->q(Z)V

    goto :goto_5

    :cond_6
    instance-of v1, p0, Ljv2/c$b;

    if-eqz v1, :cond_7

    const v1, -0x3fc5ecc4

    invoke-virtual {p2, v1}, Lp1/q;->e0(I)V

    move-object v1, p0

    check-cast v1, Ljv2/c$b;

    and-int/lit8 v0, v0, 0x7e

    invoke-static {v1, p1, p2, v0}, Lkv2/b;->s(Ljv2/c$b;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    invoke-virtual {p2, v3}, Lp1/q;->q(Z)V

    goto :goto_5

    :cond_7
    const p0, 0x1ef9845c

    invoke-static {p0, p2, v3}, Ldc/b;->v(ILp1/q;Z)Lkotlin/NoWhenBranchMatchedException;

    move-result-object p0

    throw p0

    :cond_8
    invoke-virtual {p2}, Lp1/q;->X()V

    :goto_5
    invoke-virtual {p2}, Lp1/q;->u()Lp1/v1;

    move-result-object p2

    if-eqz p2, :cond_9

    new-instance v0, Lkl2/f;

    const/4 v1, 0x7

    invoke-direct {v0, p0, p1, p3, v1}, Lkl2/f;-><init>(Ljava/lang/Object;Ljava/lang/Object;II)V

    iput-object v0, p2, Lp1/v1;->d:Lc93/m;

    :cond_9
    return-void
.end method

.method private static final D(Ljv2/c;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, Lp1/x;->L(I)I

    move-result p2

    invoke-static {p0, p1, p3, p2}, Lkv2/b;->C(Ljv2/c;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static final E(Lcom/whoop/weightlifting/StrengthTrainerDestination$i$a;Leb/u0;ZLandroidx/compose/runtime/Composer;II)V
    .locals 18

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move/from16 v4, p4

    const-string v0, "navArgs"

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "navController"

    invoke-static {v2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v8, p3

    check-cast v8, Lp1/q;

    const v0, -0x238e9e01

    invoke-virtual {v8, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, v4, 0x6

    const/4 v3, 0x4

    if-nez v0, :cond_1

    invoke-virtual {v8, v1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    move v0, v3

    goto :goto_0

    :cond_0
    const/4 v0, 0x2

    :goto_0
    or-int/2addr v0, v4

    goto :goto_1

    :cond_1
    move v0, v4

    :goto_1
    and-int/lit8 v5, v4, 0x30

    if-nez v5, :cond_3

    invoke-virtual {v8, v2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_2

    const/16 v5, 0x20

    goto :goto_2

    :cond_2
    const/16 v5, 0x10

    :goto_2
    or-int/2addr v0, v5

    :cond_3
    and-int/lit8 v5, p5, 0x4

    const/16 v11, 0x100

    if-eqz v5, :cond_5

    or-int/lit16 v0, v0, 0x180

    :cond_4
    move/from16 v6, p2

    goto :goto_4

    :cond_5
    and-int/lit16 v6, v4, 0x180

    if-nez v6, :cond_4

    move/from16 v6, p2

    invoke-virtual {v8, v6}, Lp1/q;->h(Z)Z

    move-result v7

    if-eqz v7, :cond_6

    move v7, v11

    goto :goto_3

    :cond_6
    const/16 v7, 0x80

    :goto_3
    or-int/2addr v0, v7

    :goto_4
    and-int/lit16 v7, v0, 0x93

    const/16 v9, 0x92

    const/4 v13, 0x0

    if-eq v7, v9, :cond_7

    const/4 v7, 0x1

    goto :goto_5

    :cond_7
    move v7, v13

    :goto_5
    and-int/lit8 v9, v0, 0x1

    invoke-virtual {v8, v9, v7}, Lp1/q;->U(IZ)Z

    move-result v7

    if-eqz v7, :cond_12

    if-eqz v5, :cond_8

    move v14, v13

    goto :goto_6

    :cond_8
    move v14, v6

    :goto_6
    const v5, -0x649fae96

    invoke-virtual {v8, v5}, Lp1/q;->f0(I)V

    sget-object v5, Lpf3/a;->b:Lnf3/a;

    if-eqz v5, :cond_11

    iget-object v5, v5, Lnf3/a;->a:Lwf3/a;

    iget-object v5, v5, Lwf3/a;->d:Lxf3/c;

    const v6, -0x649fad62

    const v7, -0x384098

    invoke-static {v8, v6, v8, v13, v7}, Lvl/b;->r(Lp1/q;ILp1/q;ZI)Ljf3/a;

    move-result-object v6

    const/4 v15, 0x0

    invoke-virtual {v8, v15}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v7

    invoke-virtual {v8, v15}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v9

    or-int/2addr v7, v9

    invoke-virtual {v8}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v9

    sget-object v10, Lp1/l;->a:Lp1/v0;

    if-nez v7, :cond_9

    if-ne v9, v10, :cond_a

    :cond_9
    sget-object v7, Ll83/i;->y:Ll83/i;

    new-instance v9, Lkv2/b$f;

    invoke-direct {v9, v5, v15, v15, v6}, Lkv2/b$f;-><init>(Lxf3/c;Lvf3/a;Lc93/a;Ljf3/a;)V

    invoke-static {v7, v9}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v9

    invoke-virtual {v8, v9}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_a
    invoke-virtual {v8, v13}, Lp1/q;->q(Z)V

    check-cast v9, Ll83/h;

    invoke-virtual {v8, v13}, Lp1/q;->q(Z)V

    invoke-static {v9}, Lkv2/b;->F(Ll83/h;)Ljv2/b;

    move-result-object v5

    invoke-virtual {v5}, Ljv2/b;->getViewState()Lec3/l;

    move-result-object v5

    sget-object v6, Ljv2/c$a;->e:Ljv2/c$a$a;

    invoke-virtual {v6}, Ljv2/c$a$a;->a()Ljv2/c$a;

    move-result-object v6

    move-object v7, v9

    const/4 v9, 0x0

    move-object/from16 v16, v10

    const/4 v10, 0x2

    move-object/from16 v17, v7

    const/4 v7, 0x0

    move-object/from16 v12, v16

    move-object/from16 p2, v17

    invoke-static/range {v5 .. v10}, Lp1/x;->n(Lec3/l;Ljava/lang/Object;Lq83/j;Landroidx/compose/runtime/Composer;II)Lp1/c1;

    move-result-object v5

    invoke-static/range {p2 .. p2}, Lkv2/b;->F(Ll83/h;)Ljv2/b;

    move-result-object v6

    move-object/from16 v7, p2

    invoke-virtual {v8, v7}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v9

    and-int/lit8 v10, v0, 0xe

    if-ne v10, v3, :cond_b

    const/4 v3, 0x1

    goto :goto_7

    :cond_b
    move v3, v13

    :goto_7
    or-int/2addr v3, v9

    invoke-virtual {v8}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v9

    if-nez v3, :cond_c

    if-ne v9, v12, :cond_d

    :cond_c
    new-instance v9, Lkv2/b$g;

    invoke-direct {v9, v1, v7, v15}, Lkv2/b$g;-><init>(Lcom/whoop/weightlifting/StrengthTrainerDestination$i$a;Ll83/h;Lq83/d;)V

    invoke-virtual {v8, v9}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_d
    check-cast v9, Lc93/m;

    invoke-static {v8, v9, v6}, Lp1/x;->g(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v5}, Lkv2/b;->G(Lp1/t2;)Ljv2/c;

    move-result-object v3

    invoke-virtual {v8, v2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v5

    invoke-virtual {v8, v7}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v6

    or-int/2addr v5, v6

    and-int/lit16 v0, v0, 0x380

    if-ne v0, v11, :cond_e

    const/4 v0, 0x1

    goto :goto_8

    :cond_e
    move v0, v13

    :goto_8
    or-int/2addr v0, v5

    invoke-virtual {v8}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    if-nez v0, :cond_f

    if-ne v5, v12, :cond_10

    :cond_f
    new-instance v5, Lam2/i0;

    const/16 v0, 0x9

    invoke-direct {v5, v2, v14, v7, v0}, Lam2/i0;-><init>(Ljava/lang/Object;ZLjava/lang/Object;I)V

    invoke-virtual {v8, v5}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_10
    check-cast v5, Lkotlin/jvm/functions/Function1;

    invoke-static {v3, v5, v8, v13}, Lkv2/b;->C(Ljv2/c;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    move v3, v14

    goto :goto_9

    :cond_11
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "KoinApplication has not been started"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_12
    invoke-virtual {v8}, Lp1/q;->X()V

    move v3, v6

    :goto_9
    invoke-virtual {v8}, Lp1/q;->u()Lp1/v1;

    move-result-object v7

    if-eqz v7, :cond_13

    new-instance v0, Lbg0/h;

    const/16 v6, 0xe

    move/from16 v5, p5

    invoke-direct/range {v0 .. v6}, Lbg0/h;-><init>(Ljava/lang/Object;Ljava/lang/Object;ZIII)V

    iput-object v0, v7, Lp1/v1;->d:Lc93/m;

    :cond_13
    return-void
.end method

.method private static final F(Ll83/h;)Ljv2/b;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ll83/h;",
            ")",
            "Ljv2/b;"
        }
    .end annotation

    invoke-interface {p0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljv2/b;

    return-object p0
.end method

.method private static final G(Lp1/t2;)Ljv2/c;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp1/t2;",
            ")",
            "Ljv2/c;"
        }
    .end annotation

    invoke-interface {p0}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljv2/c;

    return-object p0
.end method

.method private static final H(Leb/u0;ZLl83/h;Ljv2/a;)Ll83/a0;
    .locals 22

    move-object/from16 v0, p3

    const-string v1, "event"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v1, Ljv2/a$a;->a:Ljv2/a$a;

    invoke-virtual {v0, v1}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-virtual/range {p0 .. p0}, Leb/a0;->z()Z

    goto :goto_0

    :cond_0
    instance-of v1, v0, Ljv2/a$e;

    if-eqz v1, :cond_1

    invoke-static/range {p2 .. p2}, Lkv2/b;->F(Ll83/h;)Ljv2/b;

    move-result-object v1

    check-cast v0, Ljv2/a$e;

    invoke-virtual {v1, v0}, Ljv2/b;->n(Ljv2/a$e;)V

    goto :goto_0

    :cond_1
    instance-of v1, v0, Ljv2/a$d;

    if-eqz v1, :cond_2

    sget-object v2, Lcom/whoop/weightlifting/StrengthTrainerDestination$e;->a:Lcom/whoop/weightlifting/StrengthTrainerDestination$e;

    check-cast v0, Ljv2/a$d;

    invoke-virtual {v0}, Ljv2/a$d;->a()Ljava/lang/String;

    move-result-object v4

    const/16 v9, 0xc

    const/4 v10, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    move-object/from16 v3, p0

    move/from16 v8, p1

    invoke-static/range {v2 .. v10}, Lcom/whoop/weightlifting/StrengthTrainerDestination$e;->p(Lcom/whoop/weightlifting/StrengthTrainerDestination$e;Leb/a0;Ljava/lang/String;ZLcu2/b;Ljava/lang/String;ZILjava/lang/Object;)V

    goto :goto_0

    :cond_2
    instance-of v0, v0, Ljv2/a$c;

    if-eqz v0, :cond_3

    sget-object v11, Lcom/whoop/weightlifting/StrengthTrainerDestination$d;->a:Lcom/whoop/weightlifting/StrengthTrainerDestination$d;

    const/16 v20, 0x3b

    const/16 v21, 0x0

    const-wide/16 v13, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    move-object/from16 v12, p0

    invoke-static/range {v11 .. v21}, Lcom/whoop/weightlifting/StrengthTrainerDestination$d;->n(Lcom/whoop/weightlifting/StrengthTrainerDestination$d;Leb/a0;JLjava/lang/String;Lcom/whoop/weightlifting/StrengthTrainerDestination;ZZLjava/lang/String;ILjava/lang/Object;)V

    :goto_0
    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0

    :cond_3
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0
.end method

.method private static final I(Lcom/whoop/weightlifting/StrengthTrainerDestination$i$a;Leb/u0;ZIILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 6

    or-int/lit8 p3, p3, 0x1

    invoke-static {p3}, Lp1/x;->L(I)I

    move-result v4

    move-object v0, p0

    move-object v1, p1

    move v2, p2

    move v5, p4

    move-object v3, p5

    invoke-static/range {v0 .. v5}, Lkv2/b;->E(Lcom/whoop/weightlifting/StrengthTrainerDestination$i$a;Leb/u0;ZLandroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static final J(Ljava/util/List;Landroidx/compose/runtime/Composer;I)V
    .locals 38
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/util/List<",
            "Ljv2/e;",
            ">;",
            "Landroidx/compose/runtime/Composer;",
            "I)V"
        }
    .end annotation

    move-object/from16 v0, p0

    const-string v2, "metaDataList"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v2, p1

    check-cast v2, Lp1/q;

    const v3, 0x5a8b34c9

    invoke-virtual {v2, v3}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v3, p2, 0x6

    const/4 v4, 0x2

    const/4 v5, 0x4

    if-nez v3, :cond_1

    invoke-virtual {v2, v0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    move v3, v5

    goto :goto_0

    :cond_0
    move v3, v4

    :goto_0
    or-int v3, p2, v3

    goto :goto_1

    :cond_1
    move/from16 v3, p2

    :goto_1
    and-int/lit8 v6, v3, 0x3

    const/4 v7, 0x0

    const/4 v8, 0x1

    if-eq v6, v4, :cond_2

    move v4, v8

    goto :goto_2

    :cond_2
    move v4, v7

    :goto_2
    and-int/2addr v3, v8

    invoke-virtual {v2, v3, v4}, Lp1/q;->U(IZ)Z

    move-result v3

    if-eqz v3, :cond_7

    sget-object v3, Ll0/m;->c:Ll0/g;

    sget-object v4, Lb2/e;->M:Lb2/k;

    invoke-static {v3, v4, v2, v7}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v3

    iget-wide v9, v2, Lp1/q;->T:J

    invoke-static {v9, v10}, Ljava/lang/Long;->hashCode(J)I

    move-result v4

    invoke-virtual {v2}, Lp1/q;->m()Lp1/p1;

    move-result-object v6

    sget-object v9, Lb2/t;->w:Lb2/t;

    invoke-static {v2, v9}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v10

    sget-object v11, La3/l;->a:La3/k;

    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v11, La3/k;->b:La3/j;

    invoke-virtual {v2}, Lp1/q;->i0()V

    iget-boolean v12, v2, Lp1/q;->S:Z

    if-eqz v12, :cond_3

    invoke-virtual {v2, v11}, Lp1/q;->l(Lc93/a;)V

    goto :goto_3

    :cond_3
    invoke-virtual {v2}, Lp1/q;->s0()V

    :goto_3
    sget-object v11, La3/k;->g:La3/i;

    invoke-static {v2, v11, v3}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v3, La3/k;->f:La3/i;

    invoke-static {v2, v3, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v3, La3/k;->j:La3/i;

    iget-boolean v6, v2, Lp1/q;->S:Z

    if-nez v6, :cond_4

    invoke-virtual {v2}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v6

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v11

    invoke-static {v6, v11}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_5

    :cond_4
    invoke-static {v4, v2, v4, v3}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_5
    sget-object v3, La3/k;->d:La3/i;

    invoke-static {v2, v3, v10}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const v3, 0x79ec1122

    invoke-virtual {v2, v3}, Lp1/q;->e0(I)V

    invoke-interface {v0}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v29

    :goto_4
    invoke-interface/range {v29 .. v29}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_6

    invoke-interface/range {v29 .. v29}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    move-object/from16 v30, v3

    check-cast v30, Ljv2/e;

    invoke-virtual/range {v30 .. v30}, Ljv2/e;->a()Ljava/lang/String;

    move-result-object v3

    sget-object v4, Lx81/d;->a:Lx81/d;

    sget v6, Lx81/d;->b:I

    invoke-virtual {v4, v2, v6}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v10

    invoke-virtual {v10}, Lb91/d;->s()Lb91/a;

    move-result-object v23

    invoke-virtual {v4, v2, v6}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v10

    invoke-virtual {v10}, Ly81/i;->y()J

    move-result-wide v15

    const-wide/high16 v10, 0x3fe0000000000000L    # 0.5

    double-to-float v10, v10

    const/16 v11, 0x8

    int-to-float v11, v11

    mul-float v13, v10, v11

    const/4 v14, 0x7

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    invoke-static/range {v9 .. v14}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v10

    sget v11, Lb91/a;->d:I

    shl-int/lit8 v27, v11, 0x12

    const v28, 0x2fff8

    move v11, v7

    move v12, v8

    const-wide/16 v7, 0x0

    move-object v13, v9

    const/4 v9, 0x0

    move-object v14, v4

    move-object v4, v10

    const/4 v10, 0x0

    move/from16 v17, v11

    const/4 v11, 0x0

    move/from16 v19, v12

    move-object/from16 v18, v13

    const-wide/16 v12, 0x0

    move-object/from16 v20, v14

    const/4 v14, 0x0

    move/from16 v21, v5

    move-wide/from16 v36, v15

    move/from16 v16, v6

    move-wide/from16 v5, v36

    const/4 v15, 0x0

    move/from16 v22, v16

    move/from16 v24, v17

    const-wide/16 v16, 0x0

    move-object/from16 v25, v18

    const/16 v18, 0x0

    move/from16 v26, v19

    const/16 v19, 0x0

    move-object/from16 v31, v20

    const/16 v20, 0x0

    move/from16 v32, v21

    const/16 v21, 0x0

    move/from16 v33, v22

    const/16 v22, 0x0

    move/from16 v34, v24

    const/16 v24, 0x0

    move/from16 v35, v26

    const/16 v26, 0x30

    move-object/from16 v0, v25

    move-object/from16 v25, v2

    move-object/from16 v2, v31

    move-object/from16 v31, v0

    move/from16 v1, v32

    move/from16 v0, v33

    invoke-static/range {v3 .. v28}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v3, v25

    invoke-virtual/range {v30 .. v30}, Ljv2/e;->b()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v2, v3, v0}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v5

    invoke-virtual {v5}, Lb91/d;->b()Lb91/a;

    move-result-object v23

    invoke-virtual {v2, v3, v0}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v0

    invoke-virtual {v0}, Ly81/i;->b1()J

    move-result-wide v5

    const/16 v26, 0x0

    const v28, 0x2fffa

    move-object v3, v4

    const/4 v4, 0x0

    invoke-static/range {v3 .. v28}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v3, v25

    const/4 v0, 0x6

    int-to-float v0, v0

    int-to-float v2, v1

    move-object/from16 v9, v31

    invoke-static {v0, v2, v9, v3}, Lih0/d0;->u(FFLb2/t;Lp1/q;)V

    const/4 v7, 0x0

    const/4 v8, 0x1

    move-object/from16 v0, p0

    move v5, v1

    move-object v2, v3

    goto/16 :goto_4

    :cond_6
    move-object v3, v2

    move v11, v7

    invoke-virtual {v3, v11}, Lp1/q;->q(Z)V

    const/4 v12, 0x1

    invoke-virtual {v3, v12}, Lp1/q;->q(Z)V

    goto :goto_5

    :cond_7
    move-object v3, v2

    invoke-virtual {v3}, Lp1/q;->X()V

    :goto_5
    invoke-virtual {v3}, Lp1/q;->u()Lp1/v1;

    move-result-object v0

    if-eqz v0, :cond_8

    new-instance v1, Lbm0/o;

    const/16 v2, 0x9

    move-object/from16 v3, p0

    move/from16 v4, p2

    invoke-direct {v1, v3, v4, v2}, Lbm0/o;-><init>(Ljava/util/List;II)V

    iput-object v1, v0, Lp1/v1;->d:Lc93/m;

    :cond_8
    return-void
.end method

.method private static final K(Ljava/util/List;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p1, p1, 0x1

    invoke-static {p1}, Lp1/x;->L(I)I

    move-result p1

    invoke-static {p0, p2, p1}, Lkv2/b;->J(Ljava/util/List;Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static final synthetic L(Ll83/h;)Ljv2/b;
    .locals 0

    invoke-static {p0}, Lkv2/b;->F(Ll83/h;)Ljv2/b;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic a(Lk2/c;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lkv2/b;->y(Lk2/c;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Ljava/util/List;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lkv2/b;->K(Ljava/util/List;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Ljv2/c$b;Lkotlin/jvm/functions/Function1;Ln0/q;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, Lkv2/b;->u(Ljv2/c$b;Lkotlin/jvm/functions/Function1;Ln0/q;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lkv2/b;->A(Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic e(Ljv2/c$a;Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lkv2/b;->q(Ljv2/c$a;Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic f(Ljv2/c$b;Landroidx/compose/foundation/lazy/a;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lkv2/b;->v(Ljv2/c$b;Landroidx/compose/foundation/lazy/a;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic g(Ljv2/c$a;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Lkv2/b;->r(Ljv2/c$a;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic h(Li2/g0;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lkv2/b;->x(Li2/g0;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic i(Lcom/whoop/weightlifting/StrengthTrainerDestination$i$a;Leb/u0;ZIILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p6}, Lkv2/b;->I(Lcom/whoop/weightlifting/StrengthTrainerDestination$i$a;Leb/u0;ZIILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic j(Ljv2/c;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Lkv2/b;->D(Ljv2/c;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic k(Leb/u0;ZLl83/h;Ljv2/a;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lkv2/b;->H(Leb/u0;ZLl83/h;Ljv2/a;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic l(Ljv2/c$b;Ll0/v;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lkv2/b;->w(Ljv2/c$b;Ll0/v;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic m(IILmh/h;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, Lkv2/b;->z(IILmh/h;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic n(Ljv2/c$b;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Lkv2/b;->B(Ljv2/c$b;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic o(Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lkv2/b;->t(Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method private static final p(Ljv2/c$a;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V
    .locals 19
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljv2/c$a;",
            "Lkotlin/jvm/functions/Function1;",
            "Landroidx/compose/runtime/Composer;",
            "I)V"
        }
    .end annotation

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move/from16 v2, p3

    move-object/from16 v15, p2

    check-cast v15, Lp1/q;

    const v3, 0x40e7af13

    invoke-virtual {v15, v3}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v3, v2, 0x6

    if-nez v3, :cond_2

    and-int/lit8 v3, v2, 0x8

    if-nez v3, :cond_0

    invoke-virtual {v15, v0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v3

    goto :goto_0

    :cond_0
    invoke-virtual {v15, v0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v3

    :goto_0
    if-eqz v3, :cond_1

    const/4 v3, 0x4

    goto :goto_1

    :cond_1
    const/4 v3, 0x2

    :goto_1
    or-int/2addr v3, v2

    goto :goto_2

    :cond_2
    move v3, v2

    :goto_2
    and-int/lit8 v4, v2, 0x30

    const/16 v5, 0x20

    if-nez v4, :cond_4

    invoke-virtual {v15, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_3

    move v4, v5

    goto :goto_3

    :cond_3
    const/16 v4, 0x10

    :goto_3
    or-int/2addr v3, v4

    :cond_4
    and-int/lit8 v4, v3, 0x13

    const/16 v6, 0x12

    const/4 v7, 0x0

    const/4 v8, 0x1

    if-eq v4, v6, :cond_5

    move v4, v8

    goto :goto_4

    :cond_5
    move v4, v7

    :goto_4
    and-int/lit8 v6, v3, 0x1

    invoke-virtual {v15, v6, v4}, Lp1/q;->U(IZ)Z

    move-result v4

    if-eqz v4, :cond_9

    move v4, v3

    invoke-virtual {v0}, Ljv2/c$a;->i()Lsz0/p0;

    move-result-object v3

    move v6, v4

    invoke-virtual {v0}, Ljv2/c$a;->h()Lcom/whoop/design/util/TextResource;

    move-result-object v4

    move v9, v6

    invoke-virtual {v0}, Ljv2/c$a;->g()Lcom/whoop/design/util/TextResource;

    move-result-object v6

    invoke-virtual {v15, v0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v10

    and-int/lit8 v9, v9, 0x70

    if-ne v9, v5, :cond_6

    move v7, v8

    :cond_6
    or-int v5, v10, v7

    invoke-virtual {v15}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v7

    if-nez v5, :cond_7

    sget-object v5, Lp1/l;->a:Lp1/v0;

    if-ne v7, v5, :cond_8

    :cond_7
    new-instance v7, Lj11/q;

    const/16 v5, 0x19

    invoke-direct {v7, v0, v1, v5}, Lj11/q;-><init>(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;I)V

    invoke-virtual {v15, v7}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_8
    check-cast v7, Lc93/a;

    sget v5, Lsz0/p0;->d:I

    sget v8, Lcom/whoop/design/util/TextResource;->$stable:I

    shl-int/lit8 v9, v8, 0x3

    or-int/2addr v5, v9

    shl-int/lit8 v8, v8, 0x9

    or-int v16, v5, v8

    const/16 v17, 0x0

    const/16 v18, 0xfe4

    const/4 v5, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    invoke-static/range {v3 .. v18}, Lsz0/m0;->F(Lsz0/p0;Lcom/whoop/design/util/TextResource;Lc93/a;Lcom/whoop/design/util/TextResource;Lc93/a;ZZLcom/whoop/design/util/TextResource;Lc93/a;Landroidx/compose/ui/Modifier;ZZLandroidx/compose/runtime/Composer;III)V

    goto :goto_5

    :cond_9
    invoke-virtual {v15}, Lp1/q;->X()V

    :goto_5
    invoke-virtual {v15}, Lp1/q;->u()Lp1/v1;

    move-result-object v3

    if-eqz v3, :cond_a

    new-instance v4, Lkl2/f;

    const/16 v5, 0x8

    invoke-direct {v4, v0, v1, v2, v5}, Lkl2/f;-><init>(Ljava/lang/Object;Ljava/lang/Object;II)V

    iput-object v4, v3, Lp1/v1;->d:Lc93/m;

    :cond_a
    return-void
.end method

.method private static final q(Ljv2/c$a;Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 0

    invoke-virtual {p0}, Ljv2/c$a;->f()Ljv2/a;

    move-result-object p0

    if-eqz p0, :cond_0

    invoke-interface {p1, p0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final r(Ljv2/c$a;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, Lp1/x;->L(I)I

    move-result p2

    invoke-static {p0, p1, p3, p2}, Lkv2/b;->p(Ljv2/c$a;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final s(Ljv2/c$b;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V
    .locals 38
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljv2/c$b;",
            "Lkotlin/jvm/functions/Function1;",
            "Landroidx/compose/runtime/Composer;",
            "I)V"
        }
    .end annotation

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move/from16 v2, p3

    move-object/from16 v12, p2

    check-cast v12, Lp1/q;

    const v3, 0x28072dd2

    invoke-virtual {v12, v3}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v3, v2, 0x6

    if-nez v3, :cond_1

    invoke-virtual {v12, v0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    const/4 v3, 0x4

    goto :goto_0

    :cond_0
    const/4 v3, 0x2

    :goto_0
    or-int/2addr v3, v2

    goto :goto_1

    :cond_1
    move v3, v2

    :goto_1
    and-int/lit8 v4, v2, 0x30

    const/16 v15, 0x20

    if-nez v4, :cond_3

    invoke-virtual {v12, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_2

    move v4, v15

    goto :goto_2

    :cond_2
    const/16 v4, 0x10

    :goto_2
    or-int/2addr v3, v4

    :cond_3
    and-int/lit8 v4, v3, 0x13

    const/16 v5, 0x12

    const/16 v16, 0x0

    const/4 v13, 0x1

    if-eq v4, v5, :cond_4

    move v4, v13

    goto :goto_3

    :cond_4
    move/from16 v4, v16

    :goto_3
    and-int/lit8 v5, v3, 0x1

    invoke-virtual {v12, v5, v4}, Lp1/q;->U(IZ)Z

    move-result v4

    if-eqz v4, :cond_12

    sget-object v5, Lb2/t;->w:Lb2/t;

    const/high16 v14, 0x3f800000    # 1.0f

    invoke-static {v5, v14}, Lr;->f(Lb2/t;F)Landroidx/compose/ui/Modifier;

    move-result-object v4

    sget-object v6, Lb2/e;->N:Lb2/k;

    sget-object v7, Ll0/m;->c:Ll0/g;

    const/16 v8, 0x30

    invoke-static {v7, v6, v12, v8}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v6

    iget-wide v7, v12, Lp1/q;->T:J

    invoke-static {v7, v8}, Ljava/lang/Long;->hashCode(J)I

    move-result v7

    invoke-virtual {v12}, Lp1/q;->m()Lp1/p1;

    move-result-object v8

    invoke-static {v12, v4}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    sget-object v9, La3/l;->a:La3/k;

    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v9, La3/k;->b:La3/j;

    invoke-virtual {v12}, Lp1/q;->i0()V

    iget-boolean v10, v12, Lp1/q;->S:Z

    if-eqz v10, :cond_5

    invoke-virtual {v12, v9}, Lp1/q;->l(Lc93/a;)V

    goto :goto_4

    :cond_5
    invoke-virtual {v12}, Lp1/q;->s0()V

    :goto_4
    sget-object v9, La3/k;->g:La3/i;

    invoke-static {v12, v9, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v6, La3/k;->f:La3/i;

    invoke-static {v12, v6, v8}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v6, La3/k;->j:La3/i;

    iget-boolean v8, v12, Lp1/q;->S:Z

    if-nez v8, :cond_6

    invoke-virtual {v12}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v8

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    invoke-static {v8, v9}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_7

    :cond_6
    invoke-static {v7, v12, v7, v6}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_7
    sget-object v6, La3/k;->d:La3/i;

    invoke-static {v12, v6, v4}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    new-instance v17, Lcom/whoop/design/atomic/organism/toolbar/d$a;

    invoke-virtual {v0}, Ljv2/c$b;->i()Lcom/whoop/design/util/TextResource;

    move-result-object v18

    invoke-static {}, Lgz0/p0;->a()Lgz0/o0;

    move-result-object v4

    invoke-virtual {v4}, Lgz0/o0;->i()Lgz0/w;

    move-result-object v4

    invoke-virtual {v4}, Lgz0/w;->a()I

    move-result v4

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v20

    sget v4, Lgy0/f;->K:I

    invoke-static {v12, v4}, Lq83/g;->Y(Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v21

    const v34, 0xfff2

    const/16 v35, 0x0

    const/16 v19, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    const/16 v28, 0x0

    const/16 v29, 0x0

    const/16 v30, 0x0

    const/16 v31, 0x0

    const/16 v32, 0x0

    const/16 v33, 0x0

    invoke-direct/range {v17 .. v35}, Lcom/whoop/design/atomic/organism/toolbar/d$a;-><init>(Lcom/whoop/design/util/TextResource;Lo81/a;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Lny0/q;Lny0/q;ZLc93/m;Ly81/f;Ly81/f;Ly81/f;Ly81/f;Lhy0/h1;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    int-to-float v4, v13

    const/16 v6, 0x8

    int-to-float v6, v6

    mul-float v9, v4, v6

    const/4 v10, 0x7

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    invoke-static/range {v5 .. v10}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v4

    and-int/lit8 v3, v3, 0x70

    if-ne v3, v15, :cond_8

    move v5, v13

    goto :goto_5

    :cond_8
    move/from16 v5, v16

    :goto_5
    invoke-virtual {v12}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v6

    sget-object v7, Lp1/l;->a:Lp1/v0;

    if-nez v5, :cond_9

    if-ne v6, v7, :cond_a

    :cond_9
    new-instance v6, Ljp1/l;

    const/16 v5, 0x1b

    invoke-direct {v6, v1, v5}, Ljp1/l;-><init>(Lkotlin/jvm/functions/Function1;I)V

    invoke-virtual {v12, v6}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_a
    check-cast v6, Lc93/a;

    sget v5, Lcom/whoop/design/atomic/organism/toolbar/d$a;->r:I

    shl-int/lit8 v5, v5, 0x3

    or-int/lit8 v10, v5, 0x6

    const/16 v11, 0x34

    const/4 v5, 0x0

    move-object v8, v7

    const/4 v7, 0x0

    move-object v9, v8

    const/4 v8, 0x0

    move-object/from16 v36, v9

    move-object v9, v12

    move v12, v3

    move-object v3, v4

    move-object/from16 v4, v17

    invoke-static/range {v3 .. v11}, Lcom/whoop/design/atomic/organism/toolbar/b;->d(Landroidx/compose/ui/Modifier;Lcom/whoop/design/atomic/organism/toolbar/d;Landroidx/compose/ui/Modifier;Lc93/a;Lc93/a;Lc93/a;Landroidx/compose/runtime/Composer;II)V

    float-to-double v3, v14

    const-wide/16 v5, 0x0

    cmpl-double v3, v3, v5

    if-lez v3, :cond_b

    goto :goto_6

    :cond_b
    const-string v3, "invalid weight; must be greater than zero"

    invoke-static {v3}, Lm0/a;->a(Ljava/lang/String;)V

    :goto_6
    new-instance v3, Landroidx/compose/foundation/layout/LayoutWeightElement;

    invoke-direct {v3, v14, v13}, Landroidx/compose/foundation/layout/LayoutWeightElement;-><init>(FZ)V

    invoke-virtual {v9, v0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v4

    if-ne v12, v15, :cond_c

    move v5, v13

    goto :goto_7

    :cond_c
    move/from16 v5, v16

    :goto_7
    or-int/2addr v4, v5

    invoke-virtual {v9}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    if-nez v4, :cond_d

    move-object/from16 v4, v36

    if-ne v5, v4, :cond_e

    goto :goto_8

    :cond_d
    move-object/from16 v4, v36

    :goto_8
    new-instance v5, Ljp1/c;

    const/16 v6, 0xe

    invoke-direct {v5, v6, v0, v1}, Ljp1/c;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v9, v5}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_e
    move-object v11, v5

    check-cast v11, Lkotlin/jvm/functions/Function1;

    move v5, v13

    const/4 v13, 0x0

    const/16 v14, 0x1fe

    move-object/from16 v36, v4

    const/4 v4, 0x0

    move v6, v5

    const/4 v5, 0x0

    move v7, v6

    const/4 v6, 0x0

    move v8, v7

    const/4 v7, 0x0

    move v10, v8

    const/4 v8, 0x0

    move/from16 v17, v12

    move-object v12, v9

    const/4 v9, 0x0

    move/from16 v18, v10

    const/4 v10, 0x0

    move/from16 v0, v17

    move-object/from16 v37, v36

    invoke-static/range {v3 .. v14}, Lkotlin/jvm/internal/j;->c(Landroidx/compose/ui/Modifier;Ln0/u;Ll0/k1;Ll0/l;Lb2/f;Lh0/o1;ZLf0/k;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    invoke-virtual/range {p0 .. p0}, Ljv2/c$b;->f()Lcom/whoop/design/util/TextResource;

    move-result-object v3

    sget v4, Lcom/whoop/design/util/TextResource;->$stable:I

    invoke-static {v3, v12, v4}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v4

    if-ne v0, v15, :cond_f

    const/16 v16, 0x1

    :cond_f
    invoke-virtual {v12}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v0

    if-nez v16, :cond_10

    move-object/from16 v8, v37

    if-ne v0, v8, :cond_11

    :cond_10
    new-instance v0, Ljp1/l;

    const/16 v3, 0x1a

    invoke-direct {v0, v1, v3}, Ljp1/l;-><init>(Lkotlin/jvm/functions/Function1;I)V

    invoke-virtual {v12, v0}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_11
    move-object v9, v0

    check-cast v9, Lc93/a;

    const/4 v11, 0x0

    move-object v10, v12

    const/16 v12, 0x3d

    const/4 v3, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    invoke-static/range {v3 .. v12}, Leu2/j;->g(Landroidx/compose/ui/Modifier;Ljava/lang/String;ZLy81/e;ZZLc93/a;Landroidx/compose/runtime/Composer;II)V

    move-object v12, v10

    const/4 v5, 0x1

    invoke-virtual {v12, v5}, Lp1/q;->q(Z)V

    goto :goto_9

    :cond_12
    invoke-virtual {v12}, Lp1/q;->X()V

    :goto_9
    invoke-virtual {v12}, Lp1/q;->u()Lp1/v1;

    move-result-object v0

    if-eqz v0, :cond_13

    new-instance v3, Lkl2/f;

    const/4 v4, 0x6

    move-object/from16 v5, p0

    invoke-direct {v3, v5, v1, v2, v4}, Lkl2/f;-><init>(Ljava/lang/Object;Ljava/lang/Object;II)V

    iput-object v3, v0, Lp1/v1;->d:Lc93/m;

    :cond_13
    return-void
.end method

.method private static final t(Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 1

    sget-object v0, Ljv2/a$a;->a:Ljv2/a$a;

    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final u(Ljv2/c$b;Lkotlin/jvm/functions/Function1;Ln0/q;)Ll83/a0;
    .locals 5

    const-string v0, "$this$LazyColumn"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lkv2/a;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lkv2/a;-><init>(Ljv2/c$b;I)V

    new-instance v1, Lx1/b;

    const/4 v2, 0x1

    const v3, -0x424a1159

    invoke-direct {v1, v0, v2, v3}, Lx1/b;-><init>(Ljava/lang/Object;ZI)V

    const/4 v0, 0x3

    const/4 v3, 0x0

    invoke-static {p2, v3, v1, v0}, Ln0/q;->b(Ln0/q;Ljava/lang/String;Lkotlin/jvm/functions/Function3;I)V

    invoke-virtual {p0}, Ljv2/c$b;->c()Ljava/util/List;

    move-result-object p0

    sget-object v0, Lkv2/b$c;->w:Lkv2/b$c;

    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result v1

    new-instance v4, Lkv2/b$d;

    invoke-direct {v4, v0, p0}, Lkv2/b$d;-><init>(Lkotlin/jvm/functions/Function1;Ljava/util/List;)V

    new-instance v0, Lkv2/b$e;

    invoke-direct {v0, p0, p1}, Lkv2/b$e;-><init>(Ljava/util/List;Lkotlin/jvm/functions/Function1;)V

    new-instance p0, Lx1/b;

    const p1, 0x2fd4df92

    invoke-direct {p0, v0, v2, p1}, Lx1/b;-><init>(Ljava/lang/Object;ZI)V

    check-cast p2, Ln0/f;

    invoke-virtual {p2, v1, v3, v4, p0}, Ln0/f;->r(ILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lc93/n;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final v(Ljv2/c$b;Landroidx/compose/foundation/lazy/a;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 7

    const-string v0, "$this$item"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    and-int/lit8 p1, p3, 0x11

    const/16 v0, 0x10

    const/4 v1, 0x1

    if-eq p1, v0, :cond_0

    move p1, v1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    and-int/2addr p3, v1

    move-object v4, p2

    check-cast v4, Lp1/q;

    invoke-virtual {v4, p3, p1}, Lp1/q;->U(IZ)Z

    move-result p1

    if-eqz p1, :cond_1

    new-instance p1, Lkv2/a;

    const/4 p2, 0x1

    invoke-direct {p1, p0, p2}, Lkv2/a;-><init>(Ljv2/c$b;I)V

    const p0, 0x6416df11

    invoke-static {p0, v4, p1}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v3

    const/16 v5, 0xc00

    const/4 v6, 0x7

    const/4 v0, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    invoke-static/range {v0 .. v6}, Ll0/f;->a(Landroidx/compose/ui/Modifier;Lb2/h;ZLkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V

    goto :goto_1

    :cond_1
    invoke-virtual {v4}, Lp1/q;->X()V

    :goto_1
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final w(Ljv2/c$b;Ll0/v;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 44

    move-object/from16 v0, p1

    const-string v1, "$this$BoxWithConstraints"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    and-int/lit8 v1, p3, 0x6

    const/4 v2, 0x2

    const/4 v3, 0x4

    if-nez v1, :cond_1

    move-object/from16 v1, p2

    check-cast v1, Lp1/q;

    invoke-virtual {v1, v0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    move v1, v3

    goto :goto_0

    :cond_0
    move v1, v2

    :goto_0
    or-int v1, p3, v1

    goto :goto_1

    :cond_1
    move/from16 v1, p3

    :goto_1
    and-int/lit8 v4, v1, 0x13

    const/4 v5, 0x0

    const/16 v6, 0x12

    const/4 v7, 0x1

    if-eq v4, v6, :cond_2

    move v4, v7

    goto :goto_2

    :cond_2
    move v4, v5

    :goto_2
    and-int/2addr v1, v7

    move-object/from16 v12, p2

    check-cast v12, Lp1/q;

    invoke-virtual {v12, v1, v4}, Lp1/q;->U(IZ)Z

    move-result v1

    if-eqz v1, :cond_e

    sget-object v1, Lb3/v1;->h:Lp1/u2;

    invoke-virtual {v12, v1}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ly3/c;

    check-cast v0, Landroidx/compose/foundation/layout/c;

    invoke-virtual {v0}, Landroidx/compose/foundation/layout/c;->d()F

    move-result v8

    invoke-interface {v4, v8}, Ly3/c;->q0(F)F

    move-result v4

    float-to-int v4, v4

    invoke-virtual {v12, v1}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ly3/c;

    invoke-virtual {v0}, Landroidx/compose/foundation/layout/c;->c()F

    move-result v0

    invoke-interface {v1, v0}, Ly3/c;->q0(F)F

    move-result v0

    float-to-int v0, v0

    const/high16 v1, 0x3f800000    # 1.0f

    sget-object v14, Lb2/t;->w:Lb2/t;

    invoke-static {v1, v14}, Landroidx/compose/foundation/layout/d;->d(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v8

    invoke-virtual {v12}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v9

    sget-object v10, Lp1/l;->a:Lp1/v0;

    if-ne v9, v10, :cond_3

    new-instance v9, Lkm2/e;

    const/16 v11, 0x9

    invoke-direct {v9, v11}, Lkm2/e;-><init>(I)V

    invoke-virtual {v12, v9}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_3
    check-cast v9, Lkotlin/jvm/functions/Function1;

    invoke-static {v8, v9}, Landroidx/compose/ui/graphics/a;->a(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;)Landroidx/compose/ui/Modifier;

    move-result-object v8

    invoke-virtual {v12}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v9

    if-ne v9, v10, :cond_4

    new-instance v9, Lkm2/e;

    const/16 v11, 0xa

    invoke-direct {v9, v11}, Lkm2/e;-><init>(I)V

    invoke-virtual {v12, v9}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_4
    check-cast v9, Lkotlin/jvm/functions/Function1;

    invoke-static {v8, v9}, Landroidx/compose/ui/draw/a;->c(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;)Landroidx/compose/ui/Modifier;

    move-result-object v15

    invoke-virtual/range {p0 .. p0}, Ljv2/c$b;->e()Lkd1/o;

    move-result-object v8

    invoke-virtual {v12, v4}, Lp1/q;->e(I)Z

    move-result v9

    invoke-virtual {v12, v0}, Lp1/q;->e(I)Z

    move-result v11

    or-int/2addr v9, v11

    invoke-virtual {v12}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v11

    if-nez v9, :cond_5

    if-ne v11, v10, :cond_6

    :cond_5
    new-instance v11, Lhu1/f;

    const/4 v9, 0x1

    invoke-direct {v11, v4, v0, v9}, Lhu1/f;-><init>(III)V

    invoke-virtual {v12, v11}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_6
    move-object v10, v11

    check-cast v10, Lkotlin/jvm/functions/Function1;

    move-object/from16 v30, v12

    sget v12, Lkd1/o;->a:I

    const/4 v13, 0x1

    const/4 v9, 0x0

    move-object/from16 v11, v30

    invoke-static/range {v8 .. v13}, Lkd1/p;->i(Lkd1/o;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)Ln2/a;

    move-result-object v8

    const/16 v16, 0x6030

    const/16 v17, 0x68

    const/4 v11, 0x0

    sget-object v12, Ly2/j;->a:Ly2/b1;

    const/4 v13, 0x0

    move-object v0, v14

    const/4 v14, 0x0

    move-object v10, v15

    move-object/from16 v15, v30

    invoke-static/range {v8 .. v17}, Lpf/c;->c(Ln2/a;Ljava/lang/String;Landroidx/compose/ui/Modifier;Lb2/h;Ly2/k;FLi2/y;Landroidx/compose/runtime/Composer;II)V

    move-object v12, v15

    const-wide/high16 v8, 0x4004000000000000L    # 2.5

    double-to-float v4, v8

    const/16 v8, 0x8

    int-to-float v8, v8

    mul-float/2addr v4, v8

    const/4 v9, 0x0

    invoke-static {v0, v4, v9, v2}, Landroidx/compose/foundation/layout/a;->r(Landroidx/compose/ui/Modifier;FFI)Landroidx/compose/ui/Modifier;

    move-result-object v2

    sget-object v9, Ll0/m;->c:Ll0/g;

    sget-object v10, Lb2/e;->M:Lb2/k;

    invoke-static {v9, v10, v12, v5}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v9

    iget-wide v10, v12, Lp1/q;->T:J

    invoke-static {v10, v11}, Ljava/lang/Long;->hashCode(J)I

    move-result v10

    invoke-virtual {v12}, Lp1/q;->m()Lp1/p1;

    move-result-object v11

    invoke-static {v12, v2}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    sget-object v13, La3/l;->a:La3/k;

    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v13, La3/k;->b:La3/j;

    invoke-virtual {v12}, Lp1/q;->i0()V

    iget-boolean v14, v12, Lp1/q;->S:Z

    if-eqz v14, :cond_7

    invoke-virtual {v12, v13}, Lp1/q;->l(Lc93/a;)V

    goto :goto_3

    :cond_7
    invoke-virtual {v12}, Lp1/q;->s0()V

    :goto_3
    sget-object v14, La3/k;->g:La3/i;

    invoke-static {v12, v14, v9}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v9, La3/k;->f:La3/i;

    invoke-static {v12, v9, v11}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v11, La3/k;->j:La3/i;

    iget-boolean v15, v12, Lp1/q;->S:Z

    if-nez v15, :cond_8

    invoke-virtual {v12}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v15

    move/from16 p3, v6

    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-static {v15, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_9

    goto :goto_4

    :cond_8
    move/from16 p3, v6

    :goto_4
    invoke-static {v10, v12, v10, v11}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_9
    sget-object v6, La3/k;->d:La3/i;

    invoke-static {v12, v6, v2}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const/16 v2, 0x32

    int-to-float v2, v2

    int-to-float v3, v3

    mul-float/2addr v2, v3

    invoke-static {v2, v0}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    invoke-static {v12, v2}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    invoke-virtual/range {p0 .. p0}, Ljv2/c$b;->h()Lcom/whoop/design/util/TextResource;

    move-result-object v2

    sget v10, Lcom/whoop/design/util/TextResource;->$stable:I

    invoke-static {v2, v12, v10}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v2

    sget-object v15, Lx81/d;->a:Lx81/d;

    sget v5, Lx81/d;->b:I

    invoke-virtual {v15, v12, v5}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v16

    invoke-virtual/range {v16 .. v16}, Ly81/i;->y()J

    move-result-wide v16

    invoke-static {}, Lb91/e;->e()Lb91/d;

    move-result-object v18

    invoke-virtual/range {v18 .. v18}, Lb91/d;->N()Lb91/a;

    move-result-object v28

    new-instance v1, Lw3/k;

    const/4 v7, 0x5

    invoke-direct {v1, v7}, Lw3/k;-><init>(I)V

    sget v18, Lb91/a;->d:I

    shl-int/lit8 v32, v18, 0x12

    const v33, 0x2fdfa

    move-object/from16 v18, v9

    const/4 v9, 0x0

    move-object/from16 v30, v12

    move-object/from16 v19, v13

    const-wide/16 v12, 0x0

    move-object/from16 v20, v14

    const/4 v14, 0x0

    move-object/from16 v21, v15

    const/4 v15, 0x0

    move/from16 v22, v10

    move-wide/from16 v42, v16

    move-object/from16 v17, v11

    move-wide/from16 v10, v42

    const/16 v16, 0x0

    move-object/from16 v24, v17

    move-object/from16 v23, v18

    const-wide/16 v17, 0x0

    move-object/from16 v25, v19

    const/16 v19, 0x0

    move-object/from16 v27, v21

    move/from16 v26, v22

    const-wide/16 v21, 0x0

    move-object/from16 v29, v23

    const/16 v23, 0x0

    move-object/from16 v31, v24

    const/16 v24, 0x0

    move-object/from16 v34, v25

    const/16 v25, 0x0

    move/from16 v35, v26

    const/16 v26, 0x0

    move-object/from16 v36, v27

    const/16 v27, 0x0

    move-object/from16 v37, v29

    const/16 v29, 0x0

    move-object/from16 v38, v31

    const/16 v31, 0x0

    move v7, v8

    move-object v8, v2

    move-object/from16 v2, v34

    move/from16 v34, v7

    move-object/from16 v39, v20

    move/from16 v7, v35

    move-object/from16 v40, v37

    move-object/from16 v41, v38

    move-object/from16 v20, v1

    move-object/from16 v1, v36

    invoke-static/range {v8 .. v33}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v12, v30

    const/4 v8, 0x1

    int-to-float v9, v8

    mul-float v8, v9, v3

    invoke-static {v8, v0}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v8

    invoke-static {v12, v8}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    invoke-virtual/range {p0 .. p0}, Ljv2/c$b;->g()Lcom/whoop/design/util/TextResource;

    move-result-object v8

    invoke-static {v8, v12, v7}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v1, v12, v5}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v1

    invoke-virtual {v1}, Ly81/i;->c1()J

    move-result-wide v10

    invoke-static {}, Lb91/e;->e()Lb91/d;

    move-result-object v1

    invoke-virtual {v1}, Lb91/d;->b()Lb91/a;

    move-result-object v28

    new-instance v1, Lw3/k;

    const/4 v5, 0x5

    invoke-direct {v1, v5}, Lw3/k;-><init>(I)V

    move v5, v9

    const/4 v9, 0x0

    const-wide/16 v12, 0x0

    move-object/from16 v20, v1

    invoke-static/range {v8 .. v33}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v12, v30

    const/4 v1, 0x6

    int-to-float v7, v1

    mul-float/2addr v7, v3

    invoke-static {v7, v0}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v8

    invoke-static {v12, v8}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    const/high16 v8, 0x3f800000    # 1.0f

    invoke-static {v8, v0}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v9

    mul-float v3, v3, v34

    invoke-static {v3}, Ll0/m;->i(F)Ll0/k;

    move-result-object v8

    sget-object v10, Lb2/e;->J:Lb2/l;

    invoke-static {v8, v10, v12, v1}, Ll0/p1;->a(Ll0/i;Lb2/g;Landroidx/compose/runtime/Composer;I)Ll0/r1;

    move-result-object v8

    iget-wide v10, v12, Lp1/q;->T:J

    invoke-static {v10, v11}, Ljava/lang/Long;->hashCode(J)I

    move-result v10

    invoke-virtual {v12}, Lp1/q;->m()Lp1/p1;

    move-result-object v11

    invoke-static {v12, v9}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v9

    invoke-virtual {v12}, Lp1/q;->i0()V

    iget-boolean v13, v12, Lp1/q;->S:Z

    if-eqz v13, :cond_a

    invoke-virtual {v12, v2}, Lp1/q;->l(Lc93/a;)V

    :goto_5
    move-object/from16 v2, v39

    goto :goto_6

    :cond_a
    invoke-virtual {v12}, Lp1/q;->s0()V

    goto :goto_5

    :goto_6
    invoke-static {v12, v2, v8}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    move-object/from16 v2, v40

    invoke-static {v12, v2, v11}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v2, v12, Lp1/q;->S:Z

    if-nez v2, :cond_b

    invoke-virtual {v12}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    invoke-static {v2, v8}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_c

    :cond_b
    move-object/from16 v2, v41

    invoke-static {v10, v12, v10, v2}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_c
    invoke-static {v12, v6, v9}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const v2, 0x27522ef6

    invoke-virtual {v12, v2}, Lp1/q;->e0(I)V

    invoke-virtual/range {p0 .. p0}, Ljv2/c$b;->d()Ljava/util/List;

    move-result-object v2

    invoke-interface {v2}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_7
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_d

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    move-object v8, v6

    check-cast v8, Lsz0/q;

    sget v13, Lsz0/q;->m:I

    const/16 v14, 0xe

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    invoke-static/range {v8 .. v14}, Lm91/l;->r(Lm91/u;Lm91/p;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    goto :goto_7

    :cond_d
    const/4 v6, 0x0

    invoke-virtual {v12, v6}, Lp1/q;->q(Z)V

    const/4 v8, 0x1

    invoke-virtual {v12, v8}, Lp1/q;->q(Z)V

    invoke-static {v3, v0}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    invoke-static {v12, v2}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    invoke-virtual/range {p0 .. p0}, Ljv2/c$b;->a()Lcom/whoop/design/util/TextResource;

    move-result-object v2

    sget v3, Lcom/whoop/design/util/TextResource;->$stable:I

    invoke-static {v2, v12, v3}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v8

    sget-object v2, Lx81/d;->a:Lx81/d;

    sget v6, Lx81/d;->b:I

    invoke-virtual {v2, v12, v6}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v9

    invoke-virtual {v9}, Ly81/i;->y()J

    move-result-wide v10

    invoke-static {}, Lb91/e;->e()Lb91/d;

    move-result-object v9

    invoke-virtual {v9}, Lb91/d;->a()Lb91/a;

    move-result-object v28

    new-instance v9, Lw3/k;

    const/4 v13, 0x5

    invoke-direct {v9, v13}, Lw3/k;-><init>(I)V

    sget v13, Lb91/a;->d:I

    shl-int/lit8 v32, v13, 0x12

    const v33, 0x2fdfa

    move-object/from16 v20, v9

    const/4 v9, 0x0

    move-object/from16 v30, v12

    const-wide/16 v12, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const-wide/16 v17, 0x0

    const/16 v19, 0x0

    const-wide/16 v21, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    const/16 v29, 0x0

    const/16 v31, 0x0

    invoke-static/range {v8 .. v33}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v12, v30

    invoke-static {v7, v0}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v8

    invoke-static {v12, v8}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    sget-object v8, Lb2/e;->N:Lb2/k;

    new-instance v9, Landroidx/compose/foundation/layout/HorizontalAlignElement;

    invoke-direct {v9, v8}, Landroidx/compose/foundation/layout/HorizontalAlignElement;-><init>(Lb2/f;)V

    const/high16 v8, 0x3f800000    # 1.0f

    invoke-static {v8, v9}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v8

    invoke-virtual {v2, v12, v6}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v2

    invoke-virtual {v2}, Ly81/i;->W0()J

    move-result-wide v9

    const/16 v14, 0x180

    const/16 v15, 0x8

    const/4 v12, 0x0

    move v11, v5

    move-object/from16 v13, v30

    invoke-static/range {v8 .. v15}, Lge3/g;->b(Landroidx/compose/ui/Modifier;JFFLandroidx/compose/runtime/Composer;II)V

    move-object v12, v13

    invoke-static {v7, v0}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    invoke-static {v12, v2}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    invoke-virtual/range {p0 .. p0}, Ljv2/c$b;->j()Ljava/util/List;

    move-result-object v2

    const/4 v6, 0x0

    invoke-static {v2, v12, v6}, Lkv2/b;->J(Ljava/util/List;Landroidx/compose/runtime/Composer;I)V

    mul-float v15, v5, v34

    const/16 v16, 0x0

    const/16 v18, 0x5

    const/4 v14, 0x0

    move-object v13, v0

    move/from16 v17, v4

    invoke-static/range {v13 .. v18}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v8

    invoke-virtual/range {p0 .. p0}, Ljv2/c$b;->b()Lcom/whoop/design/util/TextResource;

    move-result-object v11

    shl-int/lit8 v0, v3, 0x9

    or-int/lit8 v19, v0, 0x6

    const/16 v20, 0xf6

    const/4 v9, 0x0

    const/4 v10, 0x0

    move-object/from16 v30, v12

    const/4 v12, 0x0

    const-wide/16 v13, 0x0

    const-wide/16 v15, 0x0

    const/16 v17, 0x0

    move-object/from16 v18, v30

    invoke-static/range {v8 .. v20}, Lhy0/i2;->j(Landroidx/compose/ui/Modifier;Lhy0/g;Lhy0/f;Lcom/whoop/design/util/TextResource;Ljava/lang/Float;JJLb91/c;Landroidx/compose/runtime/Composer;II)V

    move-object/from16 v12, v18

    const/4 v8, 0x1

    invoke-virtual {v12, v8}, Lp1/q;->q(Z)V

    goto :goto_8

    :cond_e
    invoke-virtual {v12}, Lp1/q;->X()V

    :goto_8
    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method

.method private static final x(Li2/g0;)Ll83/a0;
    .locals 1

    const-string v0, "$this$graphicsLayer"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const v0, 0x3f7d70a4    # 0.99f

    check-cast p0, Li2/x0;

    invoke-virtual {p0, v0}, Li2/x0;->a(F)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final y(Lk2/c;)Ll83/a0;
    .locals 14

    const-string v0, "$this$drawWithContent"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-wide v0, Li2/x;->m:J

    new-instance v2, Li2/x;

    invoke-direct {v2, v0, v1}, Li2/x;-><init>(J)V

    sget-wide v0, Li2/x;->b:J

    new-instance v3, Li2/x;

    invoke-direct {v3, v0, v1}, Li2/x;-><init>(J)V

    filled-new-array {v2, v3}, [Li2/x;

    move-result-object v0

    invoke-static {v0}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    move-object v1, p0

    check-cast v1, La3/p0;

    invoke-virtual {v1}, La3/p0;->a()V

    sget-object v1, Li2/t;->b:Li2/s;

    const/4 v2, 0x0

    const/16 v3, 0xe

    invoke-static {v1, v0, v2, v2, v3}, Li2/s;->k(Li2/s;Ljava/util/List;FFI)Li2/k0;

    move-result-object v5

    const/16 v12, 0x8

    const/16 v13, 0x3e

    const-wide/16 v6, 0x0

    const-wide/16 v8, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    move-object v4, p0

    invoke-static/range {v4 .. v13}, Lk2/e;->u(Lk2/e;Li2/t;JJFLk2/f;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final z(IILmh/h;)Ll83/a0;
    .locals 1

    const-string v0, "$this$rememberImagePainter"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p2, p0, p1}, Lmh/h;->d(II)V

    new-instance p0, Lph/a;

    const/4 p1, 0x0

    const/4 v0, 0x3

    invoke-direct {p0, p1, v0}, Lph/a;-><init>(II)V

    iput-object p0, p2, Lmh/h;->j:Lph/e;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method
