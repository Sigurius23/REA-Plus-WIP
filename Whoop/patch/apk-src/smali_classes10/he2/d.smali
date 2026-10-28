.class public abstract Lhe2/d;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u001a7\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u000e\u0008\u0002\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u00022\u000e\u0008\u0002\u0010\u0005\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u0002H\u0001\u00a2\u0006\u0004\u0008\u0006\u0010\u0007\u00a8\u0006\u0008"
    }
    d2 = {
        "Lge2/c;",
        "viewState",
        "Lkotlin/Function0;",
        "Ll83/a0;",
        "onNav",
        "onRetry",
        "e",
        "(Lge2/c;Lc93/a;Lc93/a;Landroidx/compose/runtime/Composer;II)V",
        "shepherd_release"
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
.method public static synthetic a(Lge2/c;Lc93/a;Lc93/a;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p6}, Lhe2/d;->i(Lge2/c;Lc93/a;Lc93/a;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b()Ll83/a0;
    .locals 1

    invoke-static {}, Lhe2/d;->g()Ll83/a0;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic c(Lc93/a;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lhe2/d;->h(Lc93/a;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d()Ll83/a0;
    .locals 1

    invoke-static {}, Lhe2/d;->f()Ll83/a0;

    move-result-object v0

    return-object v0
.end method

.method public static final e(Lge2/c;Lc93/a;Lc93/a;Landroidx/compose/runtime/Composer;II)V
    .locals 23
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lge2/c;",
            "Lc93/a;",
            "Lc93/a;",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    move-object/from16 v4, p0

    move/from16 v1, p4

    const-string v0, "viewState"

    invoke-static {v4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v0, p3

    check-cast v0, Lp1/q;

    const v2, 0x2d51e86b

    invoke-virtual {v0, v2}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v2, v1, 0x6

    if-nez v2, :cond_2

    and-int/lit8 v2, v1, 0x8

    if-nez v2, :cond_0

    invoke-virtual {v0, v4}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v2

    goto :goto_0

    :cond_0
    invoke-virtual {v0, v4}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v2

    :goto_0
    if-eqz v2, :cond_1

    const/4 v2, 0x4

    goto :goto_1

    :cond_1
    const/4 v2, 0x2

    :goto_1
    or-int/2addr v2, v1

    goto :goto_2

    :cond_2
    move v2, v1

    :goto_2
    and-int/lit8 v3, p5, 0x2

    const/16 v5, 0x20

    if-eqz v3, :cond_4

    or-int/lit8 v2, v2, 0x30

    :cond_3
    move-object/from16 v6, p1

    goto :goto_4

    :cond_4
    and-int/lit8 v6, v1, 0x30

    if-nez v6, :cond_3

    move-object/from16 v6, p1

    invoke-virtual {v0, v6}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_5

    move v7, v5

    goto :goto_3

    :cond_5
    const/16 v7, 0x10

    :goto_3
    or-int/2addr v2, v7

    :goto_4
    and-int/lit8 v7, p5, 0x4

    if-eqz v7, :cond_7

    or-int/lit16 v2, v2, 0x180

    :cond_6
    move-object/from16 v8, p2

    goto :goto_6

    :cond_7
    and-int/lit16 v8, v1, 0x180

    if-nez v8, :cond_6

    move-object/from16 v8, p2

    invoke-virtual {v0, v8}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_8

    const/16 v9, 0x100

    goto :goto_5

    :cond_8
    const/16 v9, 0x80

    :goto_5
    or-int/2addr v2, v9

    :goto_6
    and-int/lit16 v9, v2, 0x93

    const/16 v10, 0x92

    const/4 v11, 0x1

    const/4 v12, 0x0

    if-eq v9, v10, :cond_9

    move v9, v11

    goto :goto_7

    :cond_9
    move v9, v12

    :goto_7
    and-int/lit8 v10, v2, 0x1

    invoke-virtual {v0, v10, v9}, Lp1/q;->U(IZ)Z

    move-result v9

    if-eqz v9, :cond_18

    sget-object v9, Lp1/l;->a:Lp1/v0;

    if-eqz v3, :cond_b

    invoke-virtual {v0}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    if-ne v3, v9, :cond_a

    new-instance v3, Lhb1/l;

    const/4 v6, 0x4

    invoke-direct {v3, v6}, Lhb1/l;-><init>(I)V

    invoke-virtual {v0, v3}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_a
    check-cast v3, Lc93/a;

    goto :goto_8

    :cond_b
    move-object v3, v6

    :goto_8
    if-eqz v7, :cond_d

    invoke-virtual {v0}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v6

    if-ne v6, v9, :cond_c

    new-instance v6, Lhb1/l;

    const/4 v7, 0x5

    invoke-direct {v6, v7}, Lhb1/l;-><init>(I)V

    invoke-virtual {v0, v6}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_c
    check-cast v6, Lc93/a;

    move-object/from16 v21, v6

    goto :goto_9

    :cond_d
    move-object/from16 v21, v8

    :goto_9
    and-int/lit8 v6, v2, 0x70

    if-ne v6, v5, :cond_e

    move v5, v11

    goto :goto_a

    :cond_e
    move v5, v12

    :goto_a
    invoke-virtual {v0}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v6

    if-nez v5, :cond_f

    if-ne v6, v9, :cond_10

    :cond_f
    new-instance v6, Lg40/i3;

    const/16 v5, 0xe

    invoke-direct {v6, v3, v5}, Lg40/i3;-><init>(Lc93/a;I)V

    invoke-virtual {v0, v6}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_10
    check-cast v6, Lc93/a;

    invoke-static {v6, v12, v0, v12, v11}, Lio/sentry/config/a;->c(Lc93/a;ZLandroidx/compose/runtime/Composer;II)V

    sget-object v5, Lb2/t;->w:Lb2/t;

    const/high16 v6, 0x3f800000    # 1.0f

    invoke-static {v6, v5}, Landroidx/compose/foundation/layout/d;->d(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v5

    sget-object v6, Lb2/e;->w:Lb2/m;

    invoke-static {v6, v12}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v6

    iget-wide v7, v0, Lp1/q;->T:J

    invoke-static {v7, v8}, Ljava/lang/Long;->hashCode(J)I

    move-result v7

    invoke-virtual {v0}, Lp1/q;->m()Lp1/p1;

    move-result-object v8

    invoke-static {v0, v5}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v5

    sget-object v9, La3/l;->a:La3/k;

    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v9, La3/k;->b:La3/j;

    invoke-virtual {v0}, Lp1/q;->i0()V

    iget-boolean v10, v0, Lp1/q;->S:Z

    if-eqz v10, :cond_11

    invoke-virtual {v0, v9}, Lp1/q;->l(Lc93/a;)V

    goto :goto_b

    :cond_11
    invoke-virtual {v0}, Lp1/q;->s0()V

    :goto_b
    sget-object v9, La3/k;->g:La3/i;

    invoke-static {v0, v9, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v6, La3/k;->f:La3/i;

    invoke-static {v0, v6, v8}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v6, La3/k;->j:La3/i;

    iget-boolean v8, v0, Lp1/q;->S:Z

    if-nez v8, :cond_12

    invoke-virtual {v0}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v8

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    invoke-static {v8, v9}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_13

    :cond_12
    invoke-static {v7, v0, v7, v6}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_13
    sget-object v6, La3/k;->d:La3/i;

    invoke-static {v0, v6, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v5, Lge2/c$b;->a:Lge2/c$b;

    invoke-virtual {v4, v5}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_14

    const v2, 0x58753f1d

    invoke-virtual {v0, v2}, Lp1/q;->e0(I)V

    new-instance v5, Lsz0/p0$e;

    sget v2, Lgy0/a;->O4:I

    const/4 v6, 0x0

    invoke-direct {v5, v6, v2, v11, v6}, Lsz0/p0$e;-><init>(Lcom/whoop/design/util/TextResource;IILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-static {}, Lcom/whoop/design/util/b;->a()Lcom/whoop/design/util/TextResource;

    move-result-object v6

    sget v2, Lsz0/p0$e;->g:I

    sget v7, Lcom/whoop/design/util/TextResource;->$stable:I

    shl-int/lit8 v7, v7, 0x3

    or-int v18, v2, v7

    const/16 v19, 0x0

    const/16 v20, 0xffc

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    move v2, v11

    const/4 v11, 0x0

    move v13, v12

    const/4 v12, 0x0

    move v14, v13

    const/4 v13, 0x0

    move v15, v14

    const/4 v14, 0x0

    move/from16 v16, v15

    const/4 v15, 0x0

    move/from16 v17, v16

    const/16 v16, 0x0

    move/from16 v22, v17

    move-object/from16 v17, v0

    move v0, v2

    move/from16 v2, v22

    invoke-static/range {v5 .. v20}, Lsz0/m0;->F(Lsz0/p0;Lcom/whoop/design/util/TextResource;Lc93/a;Lcom/whoop/design/util/TextResource;Lc93/a;ZZLcom/whoop/design/util/TextResource;Lc93/a;Landroidx/compose/ui/Modifier;ZZLandroidx/compose/runtime/Composer;III)V

    move-object/from16 v5, v17

    invoke-virtual {v5, v2}, Lp1/q;->q(Z)V

    move-object v2, v3

    goto/16 :goto_d

    :cond_14
    move-object v5, v0

    move v0, v11

    move v13, v12

    instance-of v6, v4, Lge2/c$a;

    if-eqz v6, :cond_16

    const v6, 0x587a990c

    invoke-virtual {v5, v6}, Lp1/q;->e0(I)V

    move-object v6, v4

    check-cast v6, Lge2/c$a;

    invoke-virtual {v6}, Lge2/c$a;->a()Z

    move-result v6

    const v7, 0xe000

    if-eqz v6, :cond_15

    const v6, 0x587af533

    invoke-virtual {v5, v6}, Lp1/q;->e0(I)V

    new-instance v14, Lsz0/p0$b;

    sget v6, Lkd2/a;->j:I

    invoke-static {v6}, Lcom/whoop/design/util/b;->k(I)Lcom/whoop/design/util/TextResource$b;

    move-result-object v15

    const/16 v18, 0x6

    const/16 v19, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    invoke-direct/range {v14 .. v19}, Lsz0/p0$b;-><init>(Lcom/whoop/design/util/TextResource;ZLkd1/o;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sget v6, Lkd2/a;->g:I

    invoke-static {v6}, Lcom/whoop/design/util/b;->k(I)Lcom/whoop/design/util/TextResource$b;

    move-result-object v6

    sget v8, Lkd2/a;->h:I

    invoke-static {v8}, Lcom/whoop/design/util/b;->k(I)Lcom/whoop/design/util/TextResource$b;

    move-result-object v8

    sget v9, Lkd2/a;->i:I

    invoke-static {v9}, Lcom/whoop/design/util/b;->k(I)Lcom/whoop/design/util/TextResource$b;

    move-result-object v12

    const/high16 v9, 0x30000

    sget v10, Lsz0/p0$b;->h:I

    or-int/2addr v9, v10

    sget v10, Lcom/whoop/design/util/TextResource$b;->c:I

    shl-int/lit8 v11, v10, 0x3

    or-int/2addr v9, v11

    shl-int/lit8 v11, v10, 0x9

    or-int/2addr v9, v11

    shl-int/lit8 v11, v2, 0x6

    and-int/2addr v7, v11

    or-int/2addr v7, v9

    shl-int/lit8 v9, v10, 0x15

    or-int/2addr v7, v9

    const/high16 v9, 0xe000000

    shl-int/lit8 v2, v2, 0x15

    and-int/2addr v2, v9

    or-int v18, v7, v2

    const/16 v19, 0x0

    const/16 v20, 0xe44

    const/4 v7, 0x0

    const/4 v10, 0x1

    const/4 v11, 0x0

    move-object/from16 v17, v5

    move-object v5, v14

    const/4 v14, 0x0

    const/4 v15, 0x0

    move v9, v13

    move-object v13, v3

    move v3, v9

    move-object/from16 v9, v21

    invoke-static/range {v5 .. v20}, Lsz0/m0;->F(Lsz0/p0;Lcom/whoop/design/util/TextResource;Lc93/a;Lcom/whoop/design/util/TextResource;Lc93/a;ZZLcom/whoop/design/util/TextResource;Lc93/a;Landroidx/compose/ui/Modifier;ZZLandroidx/compose/runtime/Composer;III)V

    move-object/from16 v5, v17

    invoke-virtual {v5, v3}, Lp1/q;->q(Z)V

    goto :goto_c

    :cond_15
    move/from16 v22, v13

    move-object v13, v3

    move/from16 v3, v22

    const v6, 0x5886b7d5

    invoke-virtual {v5, v6}, Lp1/q;->e0(I)V

    new-instance v14, Lsz0/p0$b;

    sget v6, Lkd2/a;->j:I

    invoke-static {v6}, Lcom/whoop/design/util/b;->k(I)Lcom/whoop/design/util/TextResource$b;

    move-result-object v15

    const/16 v18, 0x6

    const/16 v19, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    invoke-direct/range {v14 .. v19}, Lsz0/p0$b;-><init>(Lcom/whoop/design/util/TextResource;ZLkd1/o;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sget v6, Lkd2/a;->g:I

    invoke-static {v6}, Lcom/whoop/design/util/b;->k(I)Lcom/whoop/design/util/TextResource$b;

    move-result-object v6

    sget v8, Lkd2/a;->i:I

    invoke-static {v8}, Lcom/whoop/design/util/b;->k(I)Lcom/whoop/design/util/TextResource$b;

    move-result-object v8

    sget v9, Lsz0/p0$b;->h:I

    sget v10, Lcom/whoop/design/util/TextResource$b;->c:I

    shl-int/lit8 v11, v10, 0x3

    or-int/2addr v9, v11

    shl-int/lit8 v10, v10, 0x9

    or-int/2addr v9, v10

    shl-int/lit8 v2, v2, 0x9

    and-int/2addr v2, v7

    or-int v18, v9, v2

    const/16 v19, 0x0

    const/16 v20, 0xfe4

    const/4 v7, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    move-object/from16 v17, v13

    const/4 v13, 0x0

    move-object/from16 v9, v17

    move-object/from16 v17, v5

    move-object v5, v14

    const/4 v14, 0x0

    const/4 v15, 0x0

    invoke-static/range {v5 .. v20}, Lsz0/m0;->F(Lsz0/p0;Lcom/whoop/design/util/TextResource;Lc93/a;Lcom/whoop/design/util/TextResource;Lc93/a;ZZLcom/whoop/design/util/TextResource;Lc93/a;Landroidx/compose/ui/Modifier;ZZLandroidx/compose/runtime/Composer;III)V

    move-object v13, v9

    move-object/from16 v5, v17

    invoke-virtual {v5, v3}, Lp1/q;->q(Z)V

    :goto_c
    invoke-virtual {v5, v3}, Lp1/q;->q(Z)V

    move-object v2, v13

    goto :goto_d

    :cond_16
    move/from16 v22, v13

    move-object v13, v3

    move/from16 v3, v22

    sget-object v2, Lge2/c$c;->a:Lge2/c$c;

    invoke-virtual {v4, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_17

    const v2, 0x589008e5

    invoke-virtual {v5, v2}, Lp1/q;->e0(I)V

    move-object/from16 v17, v13

    new-instance v13, Lsz0/p0$h;

    const/16 v18, 0x3

    const/16 v19, 0x0

    const/4 v14, 0x0

    const-wide/16 v15, 0x0

    invoke-direct/range {v13 .. v19}, Lsz0/p0$h;-><init>(Lcom/whoop/design/util/TextResource;JLc93/a;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object/from16 v2, v17

    invoke-static {}, Lcom/whoop/design/util/b;->a()Lcom/whoop/design/util/TextResource;

    move-result-object v6

    sget v7, Lsz0/p0$h;->h:I

    sget v8, Lcom/whoop/design/util/TextResource;->$stable:I

    shl-int/lit8 v8, v8, 0x3

    or-int v18, v7, v8

    const/16 v19, 0x0

    const/16 v20, 0xffc

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    move-object/from16 v17, v5

    move-object v5, v13

    const/4 v13, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    invoke-static/range {v5 .. v20}, Lsz0/m0;->F(Lsz0/p0;Lcom/whoop/design/util/TextResource;Lc93/a;Lcom/whoop/design/util/TextResource;Lc93/a;ZZLcom/whoop/design/util/TextResource;Lc93/a;Landroidx/compose/ui/Modifier;ZZLandroidx/compose/runtime/Composer;III)V

    move-object/from16 v5, v17

    invoke-virtual {v5, v3}, Lp1/q;->q(Z)V

    :goto_d
    invoke-virtual {v5, v0}, Lp1/q;->q(Z)V

    move-object v6, v2

    move-object/from16 v17, v5

    move-object/from16 v5, v21

    goto :goto_e

    :cond_17
    const v0, 0x3ca8ef5c

    invoke-static {v0, v5, v3}, Ldc/b;->v(ILp1/q;Z)Lkotlin/NoWhenBranchMatchedException;

    move-result-object v0

    throw v0

    :cond_18
    move-object v5, v0

    invoke-virtual {v5}, Lp1/q;->X()V

    move-object/from16 v17, v5

    move-object v5, v8

    :goto_e
    invoke-virtual/range {v17 .. v17}, Lp1/q;->u()Lp1/v1;

    move-result-object v7

    if-eqz v7, :cond_19

    new-instance v0, Lf02/c;

    const/16 v3, 0x1c

    move/from16 v2, p5

    invoke-direct/range {v0 .. v6}, Lf02/c;-><init>(IIILjava/lang/Object;Ljava/lang/Object;Ll83/e;)V

    iput-object v0, v7, Lp1/v1;->d:Lc93/m;

    :cond_19
    return-void
.end method

.method private static final f()Ll83/a0;
    .locals 1

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method

.method private static final g()Ll83/a0;
    .locals 1

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method

.method private static final h(Lc93/a;)Ll83/a0;
    .locals 0

    invoke-interface {p0}, Lc93/a;->invoke()Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final i(Lge2/c;Lc93/a;Lc93/a;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 6

    or-int/lit8 p3, p3, 0x1

    invoke-static {p3}, Lp1/x;->L(I)I

    move-result v4

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move v5, p4

    move-object v3, p5

    invoke-static/range {v0 .. v5}, Lhe2/d;->e(Lge2/c;Lc93/a;Lc93/a;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method
