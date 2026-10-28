.class public abstract Lh60/h;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u001aE\u0010\n\u001a\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0008\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u000c\u0010\u0008\u001a\u0008\u0012\u0004\u0012\u00020\u00070\u00062\u000c\u0010\t\u001a\u0008\u0012\u0004\u0012\u00020\u00070\u0006H\u0007\u00a2\u0006\u0004\u0008\n\u0010\u000b\u001a-\u0010\u0011\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\u000c2\u0014\u0008\u0002\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u000f\u0012\u0004\u0012\u00020\u00070\u000eH\u0001\u00a2\u0006\u0004\u0008\u0011\u0010\u0012\u00a8\u0006\u0013\u00b2\u0006\u000c\u0010\r\u001a\u00020\u000c8\nX\u008a\u0084\u0002"
    }
    d2 = {
        "Le60/a;",
        "navRouter",
        "Lf60/b;",
        "viewModel",
        "",
        "nextScreen",
        "Lkotlin/Function0;",
        "Ll83/a0;",
        "onSelectFiles",
        "onSelectImages",
        "e",
        "(Le60/a;Lf60/b;Ljava/lang/String;Lc93/a;Lc93/a;Landroidx/compose/runtime/Composer;I)V",
        "Lf60/c;",
        "viewState",
        "Lkotlin/Function1;",
        "Lf60/a;",
        "onEvent",
        "f",
        "(Lf60/c;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V",
        "access_release"
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
.method public static synthetic a(Lf60/c;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p5}, Lh60/h;->k(Lf60/c;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Le60/a;Lf60/b;Ljava/lang/String;Lc93/a;Lc93/a;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p7}, Lh60/h;->i(Le60/a;Lf60/b;Ljava/lang/String;Lc93/a;Lc93/a;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Lf60/b;Ljava/lang/String;Le60/a;Lc93/a;Lc93/a;Lf60/a;)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p5}, Lh60/h;->h(Lf60/b;Ljava/lang/String;Le60/a;Lc93/a;Lc93/a;Lf60/a;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Lf60/a;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lh60/h;->j(Lf60/a;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final e(Le60/a;Lf60/b;Ljava/lang/String;Lc93/a;Lc93/a;Landroidx/compose/runtime/Composer;I)V
    .locals 23
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Le60/a;",
            "Lf60/b;",
            "Ljava/lang/String;",
            "Lc93/a;",
            "Lc93/a;",
            "Landroidx/compose/runtime/Composer;",
            "I)V"
        }
    .end annotation

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move-object/from16 v4, p3

    move-object/from16 v5, p4

    move/from16 v7, p6

    const-string v0, "navRouter"

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "viewModel"

    invoke-static {v2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onSelectFiles"

    invoke-static {v4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onSelectImages"

    invoke-static {v5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v11, p5

    check-cast v11, Lp1/q;

    const v0, 0x84ccf54

    invoke-virtual {v11, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, v7, 0x6

    if-nez v0, :cond_1

    invoke-virtual {v11, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x4

    goto :goto_0

    :cond_0
    const/4 v0, 0x2

    :goto_0
    or-int/2addr v0, v7

    goto :goto_1

    :cond_1
    move v0, v7

    :goto_1
    and-int/lit8 v6, v7, 0x30

    if-nez v6, :cond_3

    invoke-virtual {v11, v2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_2

    const/16 v6, 0x20

    goto :goto_2

    :cond_2
    const/16 v6, 0x10

    :goto_2
    or-int/2addr v0, v6

    :cond_3
    and-int/lit16 v6, v7, 0x180

    const/16 v14, 0x100

    if-nez v6, :cond_5

    invoke-virtual {v11, v3}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_4

    move v6, v14

    goto :goto_3

    :cond_4
    const/16 v6, 0x80

    :goto_3
    or-int/2addr v0, v6

    :cond_5
    and-int/lit16 v6, v7, 0xc00

    const/16 v15, 0x800

    if-nez v6, :cond_7

    invoke-virtual {v11, v4}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_6

    move v6, v15

    goto :goto_4

    :cond_6
    const/16 v6, 0x400

    :goto_4
    or-int/2addr v0, v6

    :cond_7
    and-int/lit16 v6, v7, 0x6000

    const/16 v8, 0x4000

    if-nez v6, :cond_9

    invoke-virtual {v11, v5}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_8

    move v6, v8

    goto :goto_5

    :cond_8
    const/16 v6, 0x2000

    :goto_5
    or-int/2addr v0, v6

    :cond_9
    and-int/lit16 v6, v0, 0x2493

    const/16 v9, 0x2492

    const/16 v16, 0x1

    const/4 v10, 0x0

    if-eq v6, v9, :cond_a

    move/from16 v6, v16

    goto :goto_6

    :cond_a
    move v6, v10

    :goto_6
    and-int/lit8 v9, v0, 0x1

    invoke-virtual {v11, v9, v6}, Lp1/q;->U(IZ)Z

    move-result v6

    if-eqz v6, :cond_13

    move v6, v8

    invoke-virtual {v2}, Lf60/b;->getViewState()Lec3/l;

    move-result-object v8

    new-instance v9, Lf60/c;

    new-instance v17, Lf60/c$a;

    sget-object v12, Lsz0/o0;->a:Lsz0/o0;

    invoke-virtual {v12}, Lsz0/o0;->b()Lsz0/q0;

    move-result-object v18

    const/16 v21, 0x6

    const/16 v22, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    invoke-direct/range {v17 .. v22}, Lf60/c$a;-><init>(Lsz0/q0;Lf60/a;Lf60/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object/from16 v18, v17

    move-object/from16 v17, v9

    invoke-direct/range {v17 .. v22}, Lf60/c;-><init>(Lf60/c$a;Lf60/c$c;Lf60/c$b;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/4 v12, 0x0

    const/4 v13, 0x2

    move/from16 v17, v10

    const/4 v10, 0x0

    invoke-static/range {v8 .. v13}, Lp1/x;->n(Lec3/l;Ljava/lang/Object;Lq83/j;Landroidx/compose/runtime/Composer;II)Lp1/c1;

    move-result-object v8

    invoke-virtual {v11, v2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v9

    and-int/lit16 v10, v0, 0x380

    if-ne v10, v14, :cond_b

    move/from16 v12, v16

    goto :goto_7

    :cond_b
    move/from16 v12, v17

    :goto_7
    or-int/2addr v9, v12

    invoke-virtual {v11}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v12

    sget-object v13, Lp1/l;->a:Lp1/v0;

    if-nez v9, :cond_c

    if-ne v12, v13, :cond_d

    :cond_c
    new-instance v12, Lh60/h$a;

    const/4 v9, 0x0

    invoke-direct {v12, v2, v3, v9}, Lh60/h$a;-><init>(Lf60/b;Ljava/lang/String;Lq83/d;)V

    invoke-virtual {v11, v12}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_d
    check-cast v12, Lc93/m;

    invoke-static {v11, v12, v2}, Lp1/x;->g(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v8}, Lh60/h;->g(Lp1/t2;)Lf60/c;

    move-result-object v9

    const-string v12, "access_reconfirm_labs"

    const/16 v6, 0x30

    invoke-static {v9, v12, v11, v6}, Lfy1/j;->c(Lfy1/k;Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V

    invoke-static {v8}, Lh60/h;->g(Lp1/t2;)Lf60/c;

    move-result-object v8

    invoke-virtual {v11, v2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v6

    if-ne v10, v14, :cond_e

    move/from16 v10, v16

    goto :goto_8

    :cond_e
    move/from16 v10, v17

    :goto_8
    or-int/2addr v6, v10

    invoke-virtual {v11, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v9

    or-int/2addr v6, v9

    and-int/lit16 v9, v0, 0x1c00

    if-ne v9, v15, :cond_f

    move/from16 v10, v16

    goto :goto_9

    :cond_f
    move/from16 v10, v17

    :goto_9
    or-int/2addr v6, v10

    const v9, 0xe000

    and-int/2addr v0, v9

    const/16 v9, 0x4000

    if-ne v0, v9, :cond_10

    goto :goto_a

    :cond_10
    move/from16 v16, v17

    :goto_a
    or-int v0, v6, v16

    invoke-virtual {v11}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v6

    if-nez v0, :cond_12

    if-ne v6, v13, :cond_11

    goto :goto_b

    :cond_11
    move/from16 v9, v17

    goto :goto_c

    :cond_12
    :goto_b
    new-instance v0, Lam2/r;

    const/16 v6, 0xd

    move-object v9, v3

    move-object v3, v1

    move-object v1, v2

    move-object v2, v9

    move/from16 v9, v17

    invoke-direct/range {v0 .. v6}, Lam2/r;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    invoke-virtual {v11, v0}, Lp1/q;->p0(Ljava/lang/Object;)V

    move-object v6, v0

    :goto_c
    check-cast v6, Lkotlin/jvm/functions/Function1;

    invoke-static {v8, v6, v11, v9, v9}, Lh60/h;->f(Lf60/c;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    goto :goto_d

    :cond_13
    invoke-virtual {v11}, Lp1/q;->X()V

    :goto_d
    invoke-virtual {v11}, Lp1/q;->u()Lp1/v1;

    move-result-object v9

    if-eqz v9, :cond_14

    new-instance v0, Laq1/c;

    const/16 v7, 0xe

    const/4 v8, 0x0

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move-object/from16 v4, p3

    move-object/from16 v5, p4

    move/from16 v6, p6

    invoke-direct/range {v0 .. v8}, Laq1/c;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;IIZ)V

    iput-object v0, v9, Lp1/v1;->d:Lc93/m;

    :cond_14
    return-void
.end method

.method public static final f(Lf60/c;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lf60/c;",
            "Lkotlin/jvm/functions/Function1;",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    const-string v0, "viewState"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p2, Lp1/q;

    const v0, 0x7d233d68

    invoke-virtual {p2, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, p3, 0x6

    if-nez v0, :cond_1

    invoke-virtual {p2, p0}, Lp1/q;->i(Ljava/lang/Object;)Z

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
    and-int/lit8 v1, p4, 0x2

    if-eqz v1, :cond_2

    or-int/lit8 v0, v0, 0x30

    goto :goto_3

    :cond_2
    and-int/lit8 v2, p3, 0x30

    if-nez v2, :cond_4

    invoke-virtual {p2, p1}, Lp1/q;->i(Ljava/lang/Object;)Z

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
    and-int/lit8 v2, v0, 0x13

    const/16 v3, 0x12

    const/4 v4, 0x0

    if-eq v2, v3, :cond_5

    const/4 v2, 0x1

    goto :goto_4

    :cond_5
    move v2, v4

    :goto_4
    and-int/lit8 v3, v0, 0x1

    invoke-virtual {p2, v3, v2}, Lp1/q;->U(IZ)Z

    move-result v2

    if-eqz v2, :cond_b

    if-eqz v1, :cond_7

    invoke-virtual {p2}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object p1

    sget-object v1, Lp1/l;->a:Lp1/v0;

    if-ne p1, v1, :cond_6

    new-instance p1, Lh00/l0;

    const/16 v1, 0x17

    invoke-direct {p1, v1}, Lh00/l0;-><init>(I)V

    invoke-virtual {p2, p1}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_6
    check-cast p1, Lkotlin/jvm/functions/Function1;

    :cond_7
    invoke-virtual {p0}, Lf60/c;->b()Lf60/c$a;

    move-result-object v1

    if-eqz v1, :cond_8

    const v1, -0x3eb666f8

    invoke-virtual {p2, v1}, Lp1/q;->e0(I)V

    invoke-virtual {p0}, Lf60/c;->b()Lf60/c$a;

    move-result-object v1

    and-int/lit8 v0, v0, 0x70

    invoke-static {v1, p1, p2, v0, v4}, Lh60/e;->j(Lf60/c$a;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    invoke-virtual {p2, v4}, Lp1/q;->q(Z)V

    goto :goto_5

    :cond_8
    invoke-virtual {p0}, Lf60/c;->c()Lf60/c$b;

    move-result-object v1

    if-eqz v1, :cond_9

    const v1, -0x3eb6595b    # -12.603185f

    invoke-virtual {p2, v1}, Lp1/q;->e0(I)V

    invoke-virtual {p0}, Lf60/c;->c()Lf60/c$b;

    move-result-object v1

    and-int/lit8 v0, v0, 0x70

    invoke-static {v1, p1, p2, v0}, Lh60/f;->f(Lf60/c$b;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    invoke-virtual {p2, v4}, Lp1/q;->q(Z)V

    goto :goto_5

    :cond_9
    invoke-virtual {p0}, Lf60/c;->d()Lf60/c$c;

    move-result-object v1

    if-eqz v1, :cond_a

    const v1, -0x3eb64c3c

    invoke-virtual {p2, v1}, Lp1/q;->e0(I)V

    invoke-virtual {p0}, Lf60/c;->d()Lf60/c$c;

    move-result-object v1

    sget v2, Lk11/f;->n:I

    sget v3, Lc31/k;->r:I

    or-int/2addr v2, v3

    sget v3, Lc41/p2;->v:I

    or-int/2addr v2, v3

    sget v3, Lcom/whoop/navigation/e;->d:I

    or-int/2addr v2, v3

    and-int/lit8 v0, v0, 0x70

    or-int/2addr v0, v2

    invoke-static {v1, p1, p2, v0, v4}, Lh60/g;->p(Lf60/c$c;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    invoke-virtual {p2, v4}, Lp1/q;->q(Z)V

    goto :goto_5

    :cond_a
    const v0, 0x67edbd3a

    invoke-virtual {p2, v0}, Lp1/q;->e0(I)V

    invoke-virtual {p2, v4}, Lp1/q;->q(Z)V

    :goto_5
    move-object v8, p1

    goto :goto_6

    :cond_b
    invoke-virtual {p2}, Lp1/q;->X()V

    goto :goto_5

    :goto_6
    invoke-virtual {p2}, Lp1/q;->u()Lp1/v1;

    move-result-object p1

    if-eqz p1, :cond_c

    new-instance v5, Lfc0/e;

    const/16 v10, 0x10

    move-object v6, p0

    move v7, p3

    move v9, p4

    invoke-direct/range {v5 .. v10}, Lfc0/e;-><init>(Ljava/lang/Object;ILjava/lang/Object;II)V

    iput-object v5, p1, Lp1/v1;->d:Lc93/m;

    :cond_c
    return-void
.end method

.method private static final g(Lp1/t2;)Lf60/c;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp1/t2;",
            ")",
            "Lf60/c;"
        }
    .end annotation

    invoke-interface {p0}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lf60/c;

    return-object p0
.end method

.method private static final h(Lf60/b;Ljava/lang/String;Le60/a;Lc93/a;Lc93/a;Lf60/a;)Ll83/a0;
    .locals 1

    const-string v0, "event"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p5, Lf60/a$g;

    if-eqz v0, :cond_0

    new-instance p2, Lf60/a$g;

    invoke-direct {p2, p1}, Lf60/a$g;-><init>(Ljava/lang/String;)V

    invoke-virtual {p0, p2}, Lf60/b;->n(Lf60/a$k;)V

    goto :goto_0

    :cond_0
    instance-of p1, p5, Lf60/a$k;

    if-eqz p1, :cond_1

    check-cast p5, Lf60/a$k;

    invoke-virtual {p0, p5}, Lf60/b;->n(Lf60/a$k;)V

    goto :goto_0

    :cond_1
    instance-of p0, p5, Lf60/a$f;

    if-eqz p0, :cond_2

    check-cast p5, Lf60/a$f;

    invoke-virtual {p2, p5}, Le60/a;->a(Lf60/a$f;)V

    goto :goto_0

    :cond_2
    instance-of p0, p5, Lf60/a$h;

    if-eqz p0, :cond_3

    invoke-interface {p3}, Lc93/a;->invoke()Ljava/lang/Object;

    goto :goto_0

    :cond_3
    instance-of p0, p5, Lf60/a$i;

    if-eqz p0, :cond_4

    invoke-interface {p4}, Lc93/a;->invoke()Ljava/lang/Object;

    :goto_0
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0

    :cond_4
    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p0
.end method

.method private static final i(Le60/a;Lf60/b;Ljava/lang/String;Lc93/a;Lc93/a;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 7

    or-int/lit8 p5, p5, 0x1

    invoke-static {p5}, Lp1/x;->L(I)I

    move-result v6

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    move-object v5, p6

    invoke-static/range {v0 .. v6}, Lh60/h;->e(Le60/a;Lf60/b;Ljava/lang/String;Lc93/a;Lc93/a;Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final j(Lf60/a;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final k(Lf60/c;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, Lp1/x;->L(I)I

    move-result p2

    invoke-static {p0, p1, p4, p2, p3}, Lh60/h;->f(Lf60/c;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method
