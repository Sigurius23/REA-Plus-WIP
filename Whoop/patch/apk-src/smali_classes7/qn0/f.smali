.class public abstract Lqn0/f;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u001aK\u0010\n\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0014\u0008\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0014\u0008\u0002\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0008\u0012\u0004\u0012\u00020\u00060\u0004H\u0001\u00a2\u0006\u0004\u0008\n\u0010\u000b\u00a8\u0006\u000c"
    }
    d2 = {
        "Lmn0/c;",
        "viewState",
        "",
        "name",
        "Lkotlin/Function1;",
        "Lmn0/a;",
        "Ll83/a0;",
        "onViewEvent",
        "Lln0/b;",
        "onNavigationEvent",
        "f",
        "(Lmn0/c;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V",
        "challenge-details_release"
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
.method public static synthetic a(Lmn0/c;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p7}, Lqn0/f;->k(Lmn0/c;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Ljava/lang/String;Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 0

    invoke-static {p1, p0}, Lqn0/f;->j(Lkotlin/jvm/functions/Function1;Ljava/lang/String;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Lln0/b;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lqn0/f;->h(Lln0/b;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Lmn0/a;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lqn0/f;->g(Lmn0/a;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic e(Ljava/lang/String;Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 0

    invoke-static {p1, p0}, Lqn0/f;->i(Lkotlin/jvm/functions/Function1;Ljava/lang/String;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final f(Lmn0/c;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V
    .locals 24
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lmn0/c;",
            "Ljava/lang/String;",
            "Lkotlin/jvm/functions/Function1;",
            "Lkotlin/jvm/functions/Function1;",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move/from16 v6, p5

    sget-object v2, Lb2/e;->w:Lb2/m;

    const-string v3, "viewState"

    invoke-static {v0, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v3, "name"

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v4, p4

    check-cast v4, Lp1/q;

    const v3, -0x3b0ef559

    invoke-virtual {v4, v3}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v3, v6, 0x6

    if-nez v3, :cond_1

    invoke-virtual {v4, v0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    const/4 v3, 0x4

    goto :goto_0

    :cond_0
    const/4 v3, 0x2

    :goto_0
    or-int/2addr v3, v6

    goto :goto_1

    :cond_1
    move v3, v6

    :goto_1
    and-int/lit8 v7, v6, 0x30

    const/16 v8, 0x20

    if-nez v7, :cond_3

    invoke-virtual {v4, v1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_2

    move v7, v8

    goto :goto_2

    :cond_2
    const/16 v7, 0x10

    :goto_2
    or-int/2addr v3, v7

    :cond_3
    and-int/lit8 v7, p6, 0x4

    const/16 v9, 0x100

    if-eqz v7, :cond_5

    or-int/lit16 v3, v3, 0x180

    :cond_4
    move-object/from16 v10, p2

    goto :goto_4

    :cond_5
    and-int/lit16 v10, v6, 0x180

    if-nez v10, :cond_4

    move-object/from16 v10, p2

    invoke-virtual {v4, v10}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_6

    move v11, v9

    goto :goto_3

    :cond_6
    const/16 v11, 0x80

    :goto_3
    or-int/2addr v3, v11

    :goto_4
    and-int/lit8 v11, p6, 0x8

    if-eqz v11, :cond_8

    or-int/lit16 v3, v3, 0xc00

    :cond_7
    move-object/from16 v12, p3

    goto :goto_6

    :cond_8
    and-int/lit16 v12, v6, 0xc00

    if-nez v12, :cond_7

    move-object/from16 v12, p3

    invoke-virtual {v4, v12}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v13

    if-eqz v13, :cond_9

    const/16 v13, 0x800

    goto :goto_5

    :cond_9
    const/16 v13, 0x400

    :goto_5
    or-int/2addr v3, v13

    :goto_6
    and-int/lit16 v13, v3, 0x493

    const/16 v14, 0x492

    const/4 v15, 0x1

    const/4 v5, 0x0

    if-eq v13, v14, :cond_a

    move v13, v15

    goto :goto_7

    :cond_a
    move v13, v5

    :goto_7
    and-int/lit8 v14, v3, 0x1

    invoke-virtual {v4, v14, v13}, Lp1/q;->U(IZ)Z

    move-result v13

    if-eqz v13, :cond_1f

    sget-object v13, Lp1/l;->a:Lp1/v0;

    if-eqz v7, :cond_c

    invoke-virtual {v4}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v7

    if-ne v7, v13, :cond_b

    new-instance v7, Lqe0/b;

    const/16 v10, 0xb

    invoke-direct {v7, v10}, Lqe0/b;-><init>(I)V

    invoke-virtual {v4, v7}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_b
    check-cast v7, Lkotlin/jvm/functions/Function1;

    move-object v10, v7

    :cond_c
    if-eqz v11, :cond_e

    invoke-virtual {v4}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v7

    if-ne v7, v13, :cond_d

    new-instance v7, Lqe0/b;

    const/16 v11, 0xc

    invoke-direct {v7, v11}, Lqe0/b;-><init>(I)V

    invoke-virtual {v4, v7}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_d
    check-cast v7, Lkotlin/jvm/functions/Function1;

    move-object/from16 v23, v7

    goto :goto_8

    :cond_e
    move-object/from16 v23, v12

    :goto_8
    invoke-virtual {v0}, Lmn0/c;->d()Z

    move-result v7

    sget-object v11, Lb2/t;->w:Lb2/t;

    if-eqz v7, :cond_12

    const v3, 0x4e4acf2d    # 8.506438E8f

    invoke-virtual {v4, v3}, Lp1/q;->e0(I)V

    invoke-static {v2, v5}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v2

    iget-wide v7, v4, Lp1/q;->T:J

    invoke-static {v7, v8}, Ljava/lang/Long;->hashCode(J)I

    move-result v3

    invoke-virtual {v4}, Lp1/q;->m()Lp1/p1;

    move-result-object v7

    invoke-static {v4, v11}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v8

    sget-object v9, La3/l;->a:La3/k;

    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v9, La3/k;->b:La3/j;

    invoke-virtual {v4}, Lp1/q;->i0()V

    iget-boolean v11, v4, Lp1/q;->S:Z

    if-eqz v11, :cond_f

    invoke-virtual {v4, v9}, Lp1/q;->l(Lc93/a;)V

    goto :goto_9

    :cond_f
    invoke-virtual {v4}, Lp1/q;->s0()V

    :goto_9
    sget-object v9, La3/k;->g:La3/i;

    invoke-static {v4, v9, v2}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v2, La3/k;->f:La3/i;

    invoke-static {v4, v2, v7}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v2, La3/k;->j:La3/i;

    iget-boolean v7, v4, Lp1/q;->S:Z

    if-nez v7, :cond_10

    invoke-virtual {v4}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v7

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    invoke-static {v7, v9}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_11

    :cond_10
    invoke-static {v3, v4, v3, v2}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_11
    sget-object v2, La3/k;->d:La3/i;

    invoke-static {v4, v2, v8}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v7, Lsz0/p0$c;->e:Lsz0/p0$c;

    invoke-static {}, Lcom/whoop/design/util/b;->a()Lcom/whoop/design/util/TextResource;

    move-result-object v8

    sget v2, Lsz0/p0$c;->f:I

    sget v3, Lcom/whoop/design/util/TextResource;->$stable:I

    shl-int/lit8 v3, v3, 0x3

    or-int v20, v2, v3

    const/16 v21, 0x0

    const/16 v22, 0xffc

    const/4 v9, 0x0

    move-object v2, v10

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    move v3, v15

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    move-object/from16 v19, v4

    move v4, v3

    invoke-static/range {v7 .. v22}, Lsz0/m0;->F(Lsz0/p0;Lcom/whoop/design/util/TextResource;Lc93/a;Lcom/whoop/design/util/TextResource;Lc93/a;ZZLcom/whoop/design/util/TextResource;Lc93/a;Landroidx/compose/ui/Modifier;ZZLandroidx/compose/runtime/Composer;III)V

    move-object/from16 v7, v19

    invoke-virtual {v7, v4}, Lp1/q;->q(Z)V

    invoke-virtual {v7, v5}, Lp1/q;->q(Z)V

    :goto_a
    move-object v4, v7

    move-object/from16 v3, v23

    goto/16 :goto_10

    :cond_12
    move-object v7, v4

    move v4, v15

    invoke-virtual {v0}, Lmn0/c;->c()Z

    move-result v12

    if-eqz v12, :cond_1e

    const v12, 0x4e4db7a9    # 8.628414E8f

    invoke-virtual {v7, v12}, Lp1/q;->e0(I)V

    invoke-static {v2, v5}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v2

    iget-wide v14, v7, Lp1/q;->T:J

    invoke-static {v14, v15}, Ljava/lang/Long;->hashCode(J)I

    move-result v12

    invoke-virtual {v7}, Lp1/q;->m()Lp1/p1;

    move-result-object v14

    invoke-static {v7, v11}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v11

    sget-object v15, La3/l;->a:La3/k;

    invoke-virtual {v15}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v15, La3/k;->b:La3/j;

    invoke-virtual {v7}, Lp1/q;->i0()V

    iget-boolean v5, v7, Lp1/q;->S:Z

    if-eqz v5, :cond_13

    invoke-virtual {v7, v15}, Lp1/q;->l(Lc93/a;)V

    goto :goto_b

    :cond_13
    invoke-virtual {v7}, Lp1/q;->s0()V

    :goto_b
    sget-object v5, La3/k;->g:La3/i;

    invoke-static {v7, v5, v2}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v2, La3/k;->f:La3/i;

    invoke-static {v7, v2, v14}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v2, La3/k;->j:La3/i;

    iget-boolean v5, v7, Lp1/q;->S:Z

    if-nez v5, :cond_14

    invoke-virtual {v7}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v14

    invoke-static {v5, v14}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_15

    :cond_14
    invoke-static {v12, v7, v12, v2}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_15
    sget-object v2, La3/k;->d:La3/i;

    invoke-static {v7, v2, v11}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    new-instance v14, Lsz0/p0$b;

    new-instance v15, Lcom/whoop/design/util/TextResource$b;

    sget v2, Lgn0/a;->b:I

    const/4 v5, 0x0

    const/4 v11, 0x2

    invoke-direct {v15, v2, v5, v11, v5}, Lcom/whoop/design/util/TextResource$b;-><init>(ILjava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/16 v18, 0x6

    const/16 v19, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    invoke-direct/range {v14 .. v19}, Lsz0/p0$b;-><init>(Lcom/whoop/design/util/TextResource;ZLkd1/o;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-static {}, Lcom/whoop/design/util/b;->a()Lcom/whoop/design/util/TextResource;

    move-result-object v2

    new-instance v12, Lcom/whoop/design/util/TextResource$b;

    sget v15, Lgn0/a;->a:I

    invoke-direct {v12, v15, v5, v11, v5}, Lcom/whoop/design/util/TextResource$b;-><init>(ILjava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    and-int/lit16 v5, v3, 0x380

    if-ne v5, v9, :cond_16

    move v15, v4

    goto :goto_c

    :cond_16
    const/4 v15, 0x0

    :goto_c
    and-int/lit8 v3, v3, 0x70

    if-ne v3, v8, :cond_17

    move v11, v4

    goto :goto_d

    :cond_17
    const/4 v11, 0x0

    :goto_d
    or-int/2addr v11, v15

    invoke-virtual {v7}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v15

    if-nez v11, :cond_18

    if-ne v15, v13, :cond_19

    :cond_18
    new-instance v15, Lc41/j0;

    const/16 v11, 0xa

    invoke-direct {v15, v10, v1, v11}, Lc41/j0;-><init>(Lkotlin/jvm/functions/Function1;Ljava/lang/String;I)V

    invoke-virtual {v7, v15}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_19
    check-cast v15, Lc93/a;

    if-ne v5, v9, :cond_1a

    move v5, v4

    goto :goto_e

    :cond_1a
    const/4 v5, 0x0

    :goto_e
    if-ne v3, v8, :cond_1b

    move v3, v4

    goto :goto_f

    :cond_1b
    const/4 v3, 0x0

    :goto_f
    or-int/2addr v3, v5

    invoke-virtual {v7}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    if-nez v3, :cond_1c

    if-ne v5, v13, :cond_1d

    :cond_1c
    new-instance v5, Lc41/j0;

    const/16 v3, 0xb

    invoke-direct {v5, v10, v1, v3}, Lc41/j0;-><init>(Lkotlin/jvm/functions/Function1;Ljava/lang/String;I)V

    invoke-virtual {v7, v5}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_1d
    move-object v11, v5

    check-cast v11, Lc93/a;

    sget v3, Lsz0/p0$b;->h:I

    sget v5, Lcom/whoop/design/util/TextResource;->$stable:I

    shl-int/lit8 v5, v5, 0x3

    or-int/2addr v3, v5

    sget v5, Lcom/whoop/design/util/TextResource$b;->c:I

    shl-int/lit8 v5, v5, 0x9

    or-int v20, v3, v5

    const/16 v21, 0x0

    const/16 v22, 0xfe0

    move-object v3, v10

    move-object v10, v12

    const/4 v12, 0x0

    const/4 v13, 0x0

    move-object/from16 v19, v7

    move-object v7, v14

    const/4 v14, 0x0

    move-object v9, v15

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    move-object v8, v2

    move-object v2, v3

    invoke-static/range {v7 .. v22}, Lsz0/m0;->F(Lsz0/p0;Lcom/whoop/design/util/TextResource;Lc93/a;Lcom/whoop/design/util/TextResource;Lc93/a;ZZLcom/whoop/design/util/TextResource;Lc93/a;Landroidx/compose/ui/Modifier;ZZLandroidx/compose/runtime/Composer;III)V

    move-object/from16 v7, v19

    invoke-virtual {v7, v4}, Lp1/q;->q(Z)V

    const/4 v4, 0x0

    invoke-virtual {v7, v4}, Lp1/q;->q(Z)V

    goto/16 :goto_a

    :cond_1e
    move v4, v5

    move-object v2, v10

    const v5, 0x4e592739    # 9.108066E8f

    invoke-virtual {v7, v5}, Lp1/q;->e0(I)V

    and-int/lit16 v5, v3, 0x1ffe

    move-object v3, v7

    move v7, v4

    move-object v4, v3

    move-object/from16 v3, v23

    invoke-static/range {v0 .. v5}, Lqn0/g;->b(Lmn0/c;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    invoke-virtual {v4, v7}, Lp1/q;->q(Z)V

    :goto_10
    move-object/from16 v19, v4

    move-object v4, v3

    move-object v3, v2

    goto :goto_11

    :cond_1f
    invoke-virtual {v4}, Lp1/q;->X()V

    move-object/from16 v19, v4

    move-object v3, v10

    move-object v4, v12

    :goto_11
    invoke-virtual/range {v19 .. v19}, Lp1/q;->u()Lp1/v1;

    move-result-object v8

    if-eqz v8, :cond_20

    new-instance v0, Lo72/a;

    const/16 v7, 0xf

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move v5, v6

    move/from16 v6, p6

    invoke-direct/range {v0 .. v7}, Lo72/a;-><init>(Ljava/lang/Object;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;III)V

    iput-object v0, v8, Lp1/v1;->d:Lc93/m;

    :cond_20
    return-void
.end method

.method private static final g(Lmn0/a;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final h(Lln0/b;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final i(Lkotlin/jvm/functions/Function1;Ljava/lang/String;)Ll83/a0;
    .locals 1

    new-instance v0, Lmn0/a$c;

    invoke-direct {v0, p1}, Lmn0/a$c;-><init>(Ljava/lang/String;)V

    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final j(Lkotlin/jvm/functions/Function1;Ljava/lang/String;)Ll83/a0;
    .locals 1

    new-instance v0, Lmn0/a$c;

    invoke-direct {v0, p1}, Lmn0/a$c;-><init>(Ljava/lang/String;)V

    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final k(Lmn0/c;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 7

    or-int/lit8 p4, p4, 0x1

    invoke-static {p4}, Lp1/x;->L(I)I

    move-result v5

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move v6, p5

    move-object v4, p6

    invoke-static/range {v0 .. v6}, Lqn0/f;->f(Lmn0/c;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method
