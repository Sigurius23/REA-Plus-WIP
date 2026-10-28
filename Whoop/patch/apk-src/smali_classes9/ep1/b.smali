.class public abstract Lep1/b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u001aC\u0010\u0008\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0014\u0008\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\u0014\u0008\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00040\u0002H\u0007\u00a2\u0006\u0004\u0008\u0008\u0010\t\u00a8\u0006\n"
    }
    d2 = {
        "Lcp1/k$c;",
        "viewState",
        "Lkotlin/Function1;",
        "Lcp1/i;",
        "Ll83/a0;",
        "onViewEvent",
        "Lbp1/b;",
        "onNavigationEvent",
        "h",
        "(Lcp1/k$c;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V",
        "hormonal-insights_release"
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
.method public static synthetic a(Li2/g0;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lep1/b;->k(Li2/g0;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lcp1/k$c;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p6}, Lep1/b;->o(Lcp1/k$c;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lep1/b;->m(Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Lk2/c;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lep1/b;->l(Lk2/c;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic e(Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lep1/b;->n(Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic f(Lbp1/b;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lep1/b;->j(Lbp1/b;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic g(Lcp1/i;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lep1/b;->i(Lcp1/i;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final h(Lcp1/k$c;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V
    .locals 55
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcp1/k$c;",
            "Lkotlin/jvm/functions/Function1;",
            "Lkotlin/jvm/functions/Function1;",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    move-object/from16 v4, p0

    move/from16 v1, p4

    const-string v0, "viewState"

    invoke-static {v4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v10, p3

    check-cast v10, Lp1/q;

    const v0, -0x1364cb24

    invoke-virtual {v10, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, v1, 0x6

    if-nez v0, :cond_2

    and-int/lit8 v0, v1, 0x8

    if-nez v0, :cond_0

    invoke-virtual {v10, v4}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v0

    goto :goto_0

    :cond_0
    invoke-virtual {v10, v4}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v0

    :goto_0
    if-eqz v0, :cond_1

    const/4 v0, 0x4

    goto :goto_1

    :cond_1
    const/4 v0, 0x2

    :goto_1
    or-int/2addr v0, v1

    goto :goto_2

    :cond_2
    move v0, v1

    :goto_2
    and-int/lit8 v5, p5, 0x4

    if-eqz v5, :cond_4

    or-int/lit16 v0, v0, 0x180

    :cond_3
    move-object/from16 v6, p2

    goto :goto_4

    :cond_4
    and-int/lit16 v6, v1, 0x180

    if-nez v6, :cond_3

    move-object/from16 v6, p2

    invoke-virtual {v10, v6}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_5

    const/16 v7, 0x100

    goto :goto_3

    :cond_5
    const/16 v7, 0x80

    :goto_3
    or-int/2addr v0, v7

    :goto_4
    and-int/lit16 v7, v0, 0x83

    const/16 v8, 0x82

    const/4 v11, 0x0

    if-eq v7, v8, :cond_6

    const/4 v7, 0x1

    goto :goto_5

    :cond_6
    move v7, v11

    :goto_5
    and-int/lit8 v8, v0, 0x1

    invoke-virtual {v10, v8, v7}, Lp1/q;->U(IZ)Z

    move-result v7

    if-eqz v7, :cond_1d

    and-int/lit8 v7, p5, 0x2

    sget-object v13, Lp1/l;->a:Lp1/v0;

    if-eqz v7, :cond_8

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v7

    if-ne v7, v13, :cond_7

    new-instance v7, Lej1/n;

    const/16 v8, 0x1c

    invoke-direct {v7, v8}, Lej1/n;-><init>(I)V

    invoke-virtual {v10, v7}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_7
    check-cast v7, Lkotlin/jvm/functions/Function1;

    move-object/from16 v31, v7

    goto :goto_6

    :cond_8
    move-object/from16 v31, p1

    :goto_6
    if-eqz v5, :cond_a

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    if-ne v5, v13, :cond_9

    new-instance v5, Lej1/n;

    const/16 v6, 0x1d

    invoke-direct {v5, v6}, Lej1/n;-><init>(I)V

    invoke-virtual {v10, v5}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_9
    check-cast v5, Lkotlin/jvm/functions/Function1;

    move-object v14, v5

    goto :goto_7

    :cond_a
    move-object v14, v6

    :goto_7
    const/high16 v5, 0x3f800000    # 1.0f

    sget-object v6, Lb2/t;->w:Lb2/t;

    invoke-static {v5, v6}, Landroidx/compose/foundation/layout/d;->d(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v7

    invoke-static {v7}, Lgb1/b0;->T(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v7

    invoke-static {v7}, Ll0/f;->k(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v7

    sget-object v8, Lb2/e;->w:Lb2/m;

    invoke-static {v8, v11}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v9

    move-object/from16 p2, v6

    iget-wide v5, v10, Lp1/q;->T:J

    invoke-static {v5, v6}, Ljava/lang/Long;->hashCode(J)I

    move-result v5

    invoke-virtual {v10}, Lp1/q;->m()Lp1/p1;

    move-result-object v6

    invoke-static {v10, v7}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v7

    sget-object v16, La3/l;->a:La3/k;

    invoke-virtual/range {v16 .. v16}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v2, La3/k;->b:La3/j;

    invoke-virtual {v10}, Lp1/q;->i0()V

    iget-boolean v11, v10, Lp1/q;->S:Z

    if-eqz v11, :cond_b

    invoke-virtual {v10, v2}, Lp1/q;->l(Lc93/a;)V

    goto :goto_8

    :cond_b
    invoke-virtual {v10}, Lp1/q;->s0()V

    :goto_8
    sget-object v11, La3/k;->g:La3/i;

    invoke-static {v10, v11, v9}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v9, La3/k;->f:La3/i;

    invoke-static {v10, v9, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v6, La3/k;->j:La3/i;

    iget-boolean v12, v10, Lp1/q;->S:Z

    if-nez v12, :cond_c

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v12

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-static {v12, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_d

    :cond_c
    invoke-static {v5, v10, v5, v6}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_d
    sget-object v3, La3/k;->d:La3/i;

    invoke-static {v10, v3, v7}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual {v4}, Lcp1/k$c;->a()Lkd1/o;

    move-result-object v5

    const/16 v12, 0x8

    if-eqz v5, :cond_10

    const v5, 0x1ec85ec9

    invoke-virtual {v10, v5}, Lp1/q;->e0(I)V

    invoke-virtual {v4}, Lcp1/k$c;->a()Lkd1/o;

    move-result-object v5

    move-object v7, v9

    sget v9, Lkd1/o;->a:I

    move-object/from16 v27, v10

    const/4 v10, 0x3

    move-object/from16 v19, v6

    const/4 v6, 0x0

    move-object/from16 v20, v7

    const/4 v7, 0x0

    move-object/from16 v32, v8

    move-object/from16 p1, v11

    move-object/from16 v34, v19

    move-object/from16 v33, v20

    move-object/from16 v8, v27

    const/high16 v15, 0x3f800000    # 1.0f

    move-object/from16 v11, p2

    invoke-static/range {v5 .. v10}, Lkd1/p;->i(Lkd1/o;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)Ln2/a;

    move-result-object v5

    move-object v10, v8

    invoke-static {v15, v11}, Landroidx/compose/foundation/layout/d;->d(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v6

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v7

    if-ne v7, v13, :cond_e

    new-instance v7, Lep1/a;

    const/4 v8, 0x0

    invoke-direct {v7, v8}, Lep1/a;-><init>(I)V

    invoke-virtual {v10, v7}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_e
    check-cast v7, Lkotlin/jvm/functions/Function1;

    invoke-static {v6, v7}, Landroidx/compose/ui/graphics/a;->a(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;)Landroidx/compose/ui/Modifier;

    move-result-object v6

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v7

    if-ne v7, v13, :cond_f

    new-instance v7, Lep1/a;

    const/4 v8, 0x1

    invoke-direct {v7, v8}, Lep1/a;-><init>(I)V

    invoke-virtual {v10, v7}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_f
    check-cast v7, Lkotlin/jvm/functions/Function1;

    invoke-static {v6, v7}, Landroidx/compose/ui/draw/a;->c(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;)Landroidx/compose/ui/Modifier;

    move-result-object v20

    const/16 v6, 0xe

    int-to-float v6, v6

    int-to-float v7, v12

    mul-float v24, v6, v7

    const/16 v25, 0x7

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    invoke-static/range {v20 .. v25}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v7

    move-object v6, v13

    const/16 v13, 0x6030

    move-object v8, v14

    const/16 v14, 0x68

    move-object v9, v6

    const/4 v6, 0x0

    move-object/from16 v20, v8

    const/4 v8, 0x0

    move-object/from16 v21, v9

    sget-object v9, Ly2/j;->a:Ly2/b1;

    move-object/from16 v27, v10

    const/4 v10, 0x0

    move-object/from16 v22, v11

    const/4 v11, 0x0

    move-object/from16 v16, p1

    move-object/from16 p1, v3

    move-object/from16 v1, v20

    move-object/from16 v3, v21

    move-object/from16 v4, v22

    move-object/from16 v12, v27

    const/4 v15, 0x0

    invoke-static/range {v5 .. v14}, Lpf/c;->c(Ln2/a;Ljava/lang/String;Landroidx/compose/ui/Modifier;Lb2/h;Ly2/k;FLi2/y;Landroidx/compose/runtime/Composer;II)V

    move-object v10, v12

    invoke-virtual {v10, v15}, Lp1/q;->q(Z)V

    goto :goto_9

    :cond_10
    move-object/from16 v4, p2

    move-object/from16 p1, v3

    move-object/from16 v34, v6

    move-object/from16 v32, v8

    move-object/from16 v33, v9

    move-object/from16 v16, v11

    move-object v3, v13

    move-object v1, v14

    const/4 v15, 0x0

    const v5, 0x1ed49700

    invoke-virtual {v10, v5}, Lp1/q;->e0(I)V

    invoke-virtual {v10, v15}, Lp1/q;->q(Z)V

    :goto_9
    sget-object v5, Lb2/e;->x:Lb2/m;

    sget-object v14, Landroidx/compose/foundation/layout/b;->a:Landroidx/compose/foundation/layout/b;

    invoke-virtual {v14, v4, v5}, Landroidx/compose/foundation/layout/b;->a(Landroidx/compose/ui/Modifier;Lb2/h;)Landroidx/compose/ui/Modifier;

    move-result-object v5

    invoke-static {v5}, Ll0/f;->m(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v5

    new-instance v36, Lcom/whoop/design/atomic/organism/toolbar/d$a;

    invoke-static {}, Lcom/whoop/design/util/b;->a()Lcom/whoop/design/util/TextResource;

    move-result-object v37

    sget-object v6, Lx81/d;->a:Lx81/d;

    invoke-static {v6}, Ly00/t7;->e(Lx81/d;)Ljava/lang/Integer;

    move-result-object v39

    sget v7, Lgy0/f;->L:I

    invoke-static {v10, v7}, Lq83/g;->Y(Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v40

    const v53, 0xfff2

    const/16 v54, 0x0

    const/16 v38, 0x0

    const/16 v41, 0x0

    const/16 v42, 0x0

    const/16 v43, 0x0

    const/16 v44, 0x0

    const/16 v45, 0x0

    const/16 v46, 0x0

    const/16 v47, 0x0

    const/16 v48, 0x0

    const/16 v49, 0x0

    const/16 v50, 0x0

    const/16 v51, 0x0

    const/16 v52, 0x0

    invoke-direct/range {v36 .. v54}, Lcom/whoop/design/atomic/organism/toolbar/d$a;-><init>(Lcom/whoop/design/util/TextResource;Lo81/a;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Lny0/q;Lny0/q;ZLc93/m;Ly81/f;Ly81/f;Ly81/f;Ly81/f;Lhy0/h1;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    and-int/lit16 v0, v0, 0x380

    const/16 v7, 0x100

    if-ne v0, v7, :cond_11

    const/4 v11, 0x1

    goto :goto_a

    :cond_11
    move v11, v15

    :goto_a
    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v8

    if-nez v11, :cond_12

    if-ne v8, v3, :cond_13

    :cond_12
    new-instance v8, Leo2/j;

    const/4 v9, 0x1

    invoke-direct {v8, v1, v9}, Leo2/j;-><init>(Lkotlin/jvm/functions/Function1;I)V

    invoke-virtual {v10, v8}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_13
    check-cast v8, Lc93/a;

    sget v9, Lcom/whoop/design/atomic/organism/toolbar/d$a;->r:I

    shl-int/lit8 v12, v9, 0x3

    const/16 v13, 0x34

    move/from16 v19, v7

    const/4 v7, 0x0

    const/4 v9, 0x0

    move-object/from16 v27, v10

    const/4 v10, 0x0

    move-object/from16 p2, v6

    move-object/from16 v11, v27

    move-object/from16 v6, v36

    invoke-static/range {v5 .. v13}, Lcom/whoop/design/atomic/organism/toolbar/b;->d(Landroidx/compose/ui/Modifier;Lcom/whoop/design/atomic/organism/toolbar/d;Landroidx/compose/ui/Modifier;Lc93/a;Lc93/a;Lc93/a;Landroidx/compose/runtime/Composer;II)V

    move-object v10, v11

    sget-object v5, Lb2/e;->H:Lb2/m;

    invoke-virtual {v14, v4, v5}, Landroidx/compose/foundation/layout/b;->a(Landroidx/compose/ui/Modifier;Lb2/h;)Landroidx/compose/ui/Modifier;

    move-result-object v5

    move-object/from16 v6, v32

    invoke-static {v6, v15}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v6

    iget-wide v7, v10, Lp1/q;->T:J

    invoke-static {v7, v8}, Ljava/lang/Long;->hashCode(J)I

    move-result v7

    invoke-virtual {v10}, Lp1/q;->m()Lp1/p1;

    move-result-object v8

    invoke-static {v10, v5}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v5

    invoke-virtual {v10}, Lp1/q;->i0()V

    iget-boolean v9, v10, Lp1/q;->S:Z

    if-eqz v9, :cond_14

    invoke-virtual {v10, v2}, Lp1/q;->l(Lc93/a;)V

    :goto_b
    move-object/from16 v9, v16

    goto :goto_c

    :cond_14
    invoke-virtual {v10}, Lp1/q;->s0()V

    goto :goto_b

    :goto_c
    invoke-static {v10, v9, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    move-object/from16 v6, v33

    invoke-static {v10, v6, v8}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v8, v10, Lp1/q;->S:Z

    if-nez v8, :cond_15

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v8

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v11

    invoke-static {v8, v11}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_16

    :cond_15
    move-object/from16 v8, v34

    goto :goto_e

    :cond_16
    move-object/from16 v8, v34

    :goto_d
    move-object/from16 v7, p1

    goto :goto_f

    :goto_e
    invoke-static {v7, v10, v7, v8}, Ld;->y(ILp1/q;ILa3/i;)V

    goto :goto_d

    :goto_f
    invoke-static {v10, v7, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const/4 v5, 0x4

    int-to-float v13, v5

    const/16 v5, 0x8

    int-to-float v5, v5

    mul-float/2addr v5, v13

    invoke-static {v5, v4}, Landroidx/compose/foundation/layout/a;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v5

    sget-object v11, Lb2/e;->E:Lb2/m;

    invoke-virtual {v14, v5, v11}, Landroidx/compose/foundation/layout/b;->a(Landroidx/compose/ui/Modifier;Lb2/h;)Landroidx/compose/ui/Modifier;

    move-result-object v5

    sget-object v11, Ll0/m;->c:Ll0/g;

    sget-object v12, Lb2/e;->M:Lb2/k;

    invoke-static {v11, v12, v10, v15}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v11

    move v14, v13

    iget-wide v12, v10, Lp1/q;->T:J

    invoke-static {v12, v13}, Ljava/lang/Long;->hashCode(J)I

    move-result v12

    invoke-virtual {v10}, Lp1/q;->m()Lp1/p1;

    move-result-object v13

    invoke-static {v10, v5}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v5

    invoke-virtual {v10}, Lp1/q;->i0()V

    iget-boolean v15, v10, Lp1/q;->S:Z

    if-eqz v15, :cond_17

    invoke-virtual {v10, v2}, Lp1/q;->l(Lc93/a;)V

    goto :goto_10

    :cond_17
    invoke-virtual {v10}, Lp1/q;->s0()V

    :goto_10
    invoke-static {v10, v9, v11}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v10, v6, v13}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v2, v10, Lp1/q;->S:Z

    if-nez v2, :cond_18

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-static {v2, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_19

    :cond_18
    invoke-static {v12, v10, v12, v8}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_19
    invoke-static {v10, v7, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual/range {p2 .. p2}, Lx81/d;->d()Lgz0/o0;

    move-result-object v2

    invoke-virtual {v2}, Lgz0/o0;->a()Lgz0/a;

    move-result-object v2

    invoke-virtual {v2}, Lgz0/a;->b()I

    move-result v2

    const/4 v5, 0x6

    invoke-static {v2, v10, v5}, Lts/o;->S(ILandroidx/compose/runtime/Composer;I)Lo2/e;

    move-result-object v2

    int-to-float v5, v5

    mul-float/2addr v5, v14

    invoke-static {v5, v4}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v7

    sget v13, Lx81/d;->b:I

    move-object/from16 v15, p2

    invoke-virtual {v15, v10, v13}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v5

    invoke-virtual {v5}, Ly81/i;->a()J

    move-result-wide v8

    const/16 v11, 0x1b0

    const/4 v12, 0x0

    const-string v6, ""

    move-object v5, v2

    invoke-static/range {v5 .. v12}, Lg1/f3;->b(Lo2/e;Ljava/lang/String;Landroidx/compose/ui/Modifier;JLandroidx/compose/runtime/Composer;II)V

    mul-float v2, v14, v14

    invoke-static {v2, v4}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v5

    invoke-static {v10, v5}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    invoke-virtual/range {p0 .. p0}, Lcp1/k$c;->d()Lcom/whoop/design/util/TextResource;

    move-result-object v5

    sget v6, Lcom/whoop/design/util/TextResource;->$stable:I

    invoke-static {v5, v10, v6}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v15, v10, v13}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v7

    invoke-virtual {v7}, Ly81/i;->c1()J

    move-result-wide v7

    invoke-virtual {v15, v10, v13}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v9

    invoke-virtual {v9}, Lb91/d;->r()Lb91/a;

    move-result-object v25

    sget v9, Lb91/a;->d:I

    shl-int/lit8 v29, v9, 0x12

    const v30, 0x2fffa

    move v9, v6

    const/4 v6, 0x0

    move v11, v9

    move-object/from16 v27, v10

    const-wide/16 v9, 0x0

    move v12, v11

    const/4 v11, 0x0

    move/from16 v17, v12

    const/4 v12, 0x0

    move/from16 v18, v13

    const/4 v13, 0x0

    move/from16 v21, v14

    move-object/from16 v20, v15

    const-wide/16 v14, 0x0

    const/16 v22, 0x0

    const/16 v16, 0x0

    move/from16 v24, v17

    const/16 v17, 0x0

    move/from16 v26, v18

    move/from16 v28, v19

    const-wide/16 v18, 0x0

    move-object/from16 v32, v20

    const/16 v20, 0x0

    move/from16 v33, v21

    const/16 v21, 0x0

    move/from16 v34, v22

    const/16 v22, 0x0

    const/high16 v35, 0x3f800000    # 1.0f

    const/16 v23, 0x0

    move/from16 v36, v24

    const/16 v24, 0x0

    move/from16 v37, v26

    const/16 v26, 0x0

    move/from16 v38, v28

    const/16 v28, 0x0

    move-object/from16 v39, v1

    move-object/from16 v1, v32

    move/from16 p1, v33

    move/from16 v33, v0

    move-object/from16 v32, v3

    move/from16 v3, v36

    move/from16 v0, v37

    invoke-static/range {v5 .. v30}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v10, v27

    invoke-static {v2, v4}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    invoke-static {v10, v2}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    invoke-virtual/range {p0 .. p0}, Lcp1/k$c;->e()Lcom/whoop/design/util/TextResource;

    move-result-object v2

    invoke-static {v2, v10, v3}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v1, v10, v0}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v2

    invoke-virtual {v2}, Ly81/i;->y()J

    move-result-wide v7

    invoke-virtual {v1, v10, v0}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v2

    invoke-virtual {v2}, Lb91/d;->O()Lb91/a;

    move-result-object v25

    const-wide/16 v9, 0x0

    invoke-static/range {v5 .. v30}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v10, v27

    const/4 v2, 0x2

    int-to-float v2, v2

    mul-float v2, v2, p1

    invoke-static {v2, v4}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    invoke-static {v10, v2}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    invoke-virtual/range {p0 .. p0}, Lcp1/k$c;->c()Lcom/whoop/design/util/TextResource;

    move-result-object v2

    invoke-static {v2, v10, v3}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v1, v10, v0}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v2

    invoke-virtual {v2}, Ly81/i;->c1()J

    move-result-wide v7

    invoke-virtual {v1, v10, v0}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v2

    invoke-virtual {v2}, Lb91/d;->a()Lb91/a;

    move-result-object v25

    const-wide/16 v9, 0x0

    invoke-static/range {v5 .. v30}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v10, v27

    const/16 v2, 0x13

    int-to-float v2, v2

    move/from16 v14, p1

    invoke-static {v2, v14, v4, v10}, Lih0/d0;->u(FFLb2/t;Lp1/q;)V

    const/high16 v15, 0x3f800000    # 1.0f

    invoke-static {v15, v4}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v5

    sget-object v6, Lny0/v;->TextLarge:Lny0/v;

    invoke-virtual/range {p0 .. p0}, Lcp1/k$c;->b()Lcom/whoop/design/util/TextResource;

    move-result-object v2

    invoke-static {v2, v10, v3}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v1, v10, v0}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v0

    invoke-virtual {v0}, Ly81/i;->i0()J

    move-result-wide v0

    move/from16 v2, v33

    const/16 v3, 0x100

    if-ne v2, v3, :cond_1a

    const/4 v11, 0x1

    goto :goto_11

    :cond_1a
    move/from16 v11, v34

    :goto_11
    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    if-nez v11, :cond_1c

    move-object/from16 v3, v32

    if-ne v2, v3, :cond_1b

    goto :goto_12

    :cond_1b
    move-object/from16 v4, v39

    goto :goto_13

    :cond_1c
    :goto_12
    new-instance v2, Leo2/j;

    const/4 v3, 0x2

    move-object/from16 v4, v39

    invoke-direct {v2, v4, v3}, Leo2/j;-><init>(Lkotlin/jvm/functions/Function1;I)V

    invoke-virtual {v10, v2}, Lp1/q;->p0(Ljava/lang/Object;)V

    :goto_13
    move-object v13, v2

    check-cast v13, Lc93/a;

    const/16 v15, 0x36

    const/16 v16, 0x68

    const/4 v8, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    move-object v14, v10

    move-wide v9, v0

    invoke-static/range {v5 .. v16}, Lny0/u;->h(Landroidx/compose/ui/Modifier;Lny0/v;Ljava/lang/String;ZJLi2/t;ZLc93/a;Landroidx/compose/runtime/Composer;II)V

    move-object v10, v14

    const/4 v0, 0x1

    invoke-static {v10, v0, v0, v0}, Lm4/a;->y(Lp1/q;ZZZ)V

    move-object v5, v4

    move-object/from16 v6, v31

    goto :goto_14

    :cond_1d
    invoke-virtual {v10}, Lp1/q;->X()V

    move-object v5, v6

    move-object/from16 v6, p1

    :goto_14
    invoke-virtual {v10}, Lp1/q;->u()Lp1/v1;

    move-result-object v7

    if-eqz v7, :cond_1e

    new-instance v0, Le11/b;

    const/16 v3, 0xe

    move-object/from16 v4, p0

    move/from16 v1, p4

    move/from16 v2, p5

    invoke-direct/range {v0 .. v6}, Le11/b;-><init>(IIILjava/lang/Object;Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)V

    iput-object v0, v7, Lp1/v1;->d:Lc93/m;

    :cond_1e
    return-void
.end method

.method private static final i(Lcp1/i;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final j(Lbp1/b;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final k(Li2/g0;)Ll83/a0;
    .locals 1

    const-string v0, "$this$graphicsLayer"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x1

    check-cast p0, Li2/x0;

    invoke-virtual {p0, v0}, Li2/x0;->f(I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final l(Lk2/c;)Ll83/a0;
    .locals 14

    const-string v0, "$this$drawWithContent"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v0, p0

    check-cast v0, La3/p0;

    invoke-virtual {v0}, La3/p0;->a()V

    sget-object v0, Li2/t;->b:Li2/s;

    const/4 v1, 0x0

    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v2

    sget-wide v3, Li2/x;->b:J

    new-instance v5, Li2/x;

    invoke-direct {v5, v3, v4}, Li2/x;-><init>(J)V

    new-instance v3, Ll83/k;

    invoke-direct {v3, v2, v5}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const v2, 0x3f4ccccd    # 0.8f

    invoke-static {v2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v2

    sget-wide v4, Li2/x;->m:J

    new-instance v6, Li2/x;

    invoke-direct {v6, v4, v5}, Li2/x;-><init>(J)V

    new-instance v4, Ll83/k;

    invoke-direct {v4, v2, v6}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    filled-new-array {v3, v4}, [Ll83/k;

    move-result-object v2

    const/16 v3, 0xe

    invoke-static {v0, v2, v1, v1, v3}, Li2/s;->l(Li2/s;[Ll83/k;FFI)Li2/k0;

    move-result-object v5

    const/4 v12, 0x6

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

.method private static final m(Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 2

    new-instance v0, Lbp1/b$b;

    const/4 v1, 0x0

    invoke-direct {v0, v1}, Lbp1/b$b;-><init>(Z)V

    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final n(Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 2

    new-instance v0, Lbp1/b$b;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Lbp1/b$b;-><init>(Z)V

    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final o(Lcp1/k$c;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 6

    or-int/lit8 p3, p3, 0x1

    invoke-static {p3}, Lp1/x;->L(I)I

    move-result v4

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move v5, p4

    move-object v3, p5

    invoke-static/range {v0 .. v5}, Lep1/b;->h(Lcp1/k$c;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method
