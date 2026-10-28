.class public abstract Lmr1/j;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u001a\u0017\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u0007\u00a2\u0006\u0004\u0008\u0003\u0010\u0004\u00a8\u0006\t\u00b2\u0006\u000c\u0010\u0006\u001a\u00020\u00058\nX\u008a\u0084\u0002\u00b2\u0006\u000c\u0010\u0008\u001a\u00020\u00078\nX\u008a\u0084\u0002"
    }
    d2 = {
        "Leb/a0;",
        "globalNavController",
        "Ll83/a0;",
        "f",
        "(Leb/a0;Landroidx/compose/runtime/Composer;I)V",
        "Lmr1/k;",
        "viewModel",
        "Lmr1/l;",
        "viewState",
        "internal-tooling_release"
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
.method public static synthetic a(Leb/a0;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lmr1/j;->j(Leb/a0;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Leb/a0;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lmr1/j;->i(Leb/a0;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Ll83/h;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lmr1/j;->l(Ll83/h;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Leb/a0;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lmr1/j;->m(Leb/a0;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic e(Ll83/h;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lmr1/j;->k(Ll83/h;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final f(Leb/a0;Landroidx/compose/runtime/Composer;I)V
    .locals 47

    move-object/from16 v0, p0

    const-string v2, "globalNavController"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v6, p1

    check-cast v6, Lp1/q;

    const v2, -0x74427d5e

    invoke-virtual {v6, v2}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v2, p2, 0x6

    const/4 v9, 0x2

    if-nez v2, :cond_1

    invoke-virtual {v6, v0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    const/4 v2, 0x4

    goto :goto_0

    :cond_0
    move v2, v9

    :goto_0
    or-int v2, p2, v2

    goto :goto_1

    :cond_1
    move/from16 v2, p2

    :goto_1
    and-int/lit8 v3, v2, 0x3

    const/4 v13, 0x1

    const/4 v14, 0x0

    if-eq v3, v9, :cond_2

    move v3, v13

    goto :goto_2

    :cond_2
    move v3, v14

    :goto_2
    and-int/2addr v2, v13

    invoke-virtual {v6, v2, v3}, Lp1/q;->U(IZ)Z

    move-result v2

    if-eqz v2, :cond_18

    const v2, -0x649fae96

    invoke-virtual {v6, v2}, Lp1/q;->f0(I)V

    sget-object v2, Lpf3/a;->b:Lnf3/a;

    if-eqz v2, :cond_17

    iget-object v2, v2, Lnf3/a;->a:Lwf3/a;

    iget-object v2, v2, Lwf3/a;->d:Lxf3/c;

    const v3, -0x649fad62

    const v4, -0x384098

    invoke-static {v6, v3, v6, v14, v4}, Lvl/b;->r(Lp1/q;ILp1/q;ZI)Ljf3/a;

    move-result-object v3

    const/4 v10, 0x0

    invoke-virtual {v6, v10}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v4

    invoke-virtual {v6, v10}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v5

    or-int/2addr v4, v5

    invoke-virtual {v6}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    sget-object v15, Lp1/l;->a:Lp1/v0;

    if-nez v4, :cond_3

    if-ne v5, v15, :cond_4

    :cond_3
    sget-object v4, Ll83/i;->y:Ll83/i;

    new-instance v5, Lmr1/j$a;

    invoke-direct {v5, v2, v10, v10, v3}, Lmr1/j$a;-><init>(Lxf3/c;Lvf3/a;Lc93/a;Ljf3/a;)V

    invoke-static {v4, v5}, Lq83/g;->G(Ll83/i;Lc93/a;)Ll83/h;

    move-result-object v5

    invoke-virtual {v6, v5}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_4
    invoke-virtual {v6, v14}, Lp1/q;->q(Z)V

    move-object v2, v5

    check-cast v2, Ll83/h;

    invoke-virtual {v6, v14}, Lp1/q;->q(Z)V

    invoke-static {v2}, Lmr1/j;->g(Ll83/h;)Lmr1/k;

    move-result-object v3

    invoke-virtual {v3}, Lmr1/k;->getViewState()Lec3/l;

    move-result-object v3

    new-instance v16, Lmr1/l;

    const/16 v25, 0xff

    const/16 v26, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    invoke-direct/range {v16 .. v26}, Lmr1/l;-><init>(Ljava/lang/String;ZLjava/lang/String;ZZZLjava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/4 v7, 0x0

    const/4 v8, 0x2

    const/4 v5, 0x0

    move-object/from16 v4, v16

    invoke-static/range {v3 .. v8}, Lp1/x;->n(Lec3/l;Ljava/lang/Object;Lq83/j;Landroidx/compose/runtime/Composer;II)Lp1/c1;

    move-result-object v3

    invoke-virtual {v6, v0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v4

    invoke-virtual {v6}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    if-nez v4, :cond_5

    if-ne v5, v15, :cond_6

    :cond_5
    new-instance v5, Lmr1/h;

    const/4 v4, 0x0

    invoke-direct {v5, v0, v4}, Lmr1/h;-><init>(Leb/a0;I)V

    invoke-virtual {v6, v5}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_6
    check-cast v5, Lc93/a;

    invoke-static {v5, v14, v6, v14, v13}, Lio/sentry/config/a;->c(Lc93/a;ZLandroidx/compose/runtime/Composer;II)V

    invoke-static {v3}, Lmr1/j;->h(Lp1/t2;)Lmr1/l;

    move-result-object v4

    invoke-virtual {v4}, Lmr1/l;->c()Z

    move-result v4

    invoke-static {v4}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v4

    invoke-static {v3}, Lmr1/j;->h(Lp1/t2;)Lmr1/l;

    move-result-object v5

    invoke-virtual {v5}, Lmr1/l;->a()Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v6, v3}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v7

    invoke-virtual {v6, v0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v8

    or-int/2addr v7, v8

    invoke-virtual {v6, v2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v8

    or-int/2addr v7, v8

    invoke-virtual {v6}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v8

    if-nez v7, :cond_7

    if-ne v8, v15, :cond_8

    :cond_7
    new-instance v8, Lmr1/j$b;

    invoke-direct {v8, v0, v3, v2, v10}, Lmr1/j$b;-><init>(Leb/a0;Lp1/t2;Ll83/h;Lq83/d;)V

    invoke-virtual {v6, v8}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_8
    check-cast v8, Lc93/m;

    invoke-static {v4, v5, v8, v6}, Lp1/x;->h(Ljava/lang/Object;Ljava/lang/Object;Lc93/m;Landroidx/compose/runtime/Composer;)V

    sget-object v4, Lb2/t;->w:Lb2/t;

    const/high16 v5, 0x3f800000    # 1.0f

    invoke-static {v4, v5}, Lvl/b;->c(Lb2/t;F)Landroidx/compose/ui/Modifier;

    move-result-object v7

    sget-object v8, Ll0/m;->c:Ll0/g;

    sget-object v10, Lb2/e;->M:Lb2/k;

    invoke-static {v8, v10, v6, v14}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v8

    iget-wide v10, v6, Lp1/q;->T:J

    invoke-static {v10, v11}, Ljava/lang/Long;->hashCode(J)I

    move-result v10

    invoke-virtual {v6}, Lp1/q;->m()Lp1/p1;

    move-result-object v11

    invoke-static {v6, v7}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v7

    sget-object v16, La3/l;->a:La3/k;

    invoke-virtual/range {v16 .. v16}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move/from16 p1, v13

    sget-object v13, La3/k;->b:La3/j;

    invoke-virtual {v6}, Lp1/q;->i0()V

    iget-boolean v5, v6, Lp1/q;->S:Z

    if-eqz v5, :cond_9

    invoke-virtual {v6, v13}, Lp1/q;->l(Lc93/a;)V

    goto :goto_3

    :cond_9
    invoke-virtual {v6}, Lp1/q;->s0()V

    :goto_3
    sget-object v5, La3/k;->g:La3/i;

    invoke-static {v6, v5, v8}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v8, La3/k;->f:La3/i;

    invoke-static {v6, v8, v11}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v11, La3/k;->j:La3/i;

    iget-boolean v14, v6, Lp1/q;->S:Z

    if-nez v14, :cond_a

    invoke-virtual {v6}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v14

    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v12

    invoke-static {v14, v12}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v12

    if-nez v12, :cond_b

    :cond_a
    invoke-static {v10, v6, v10, v11}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_b
    sget-object v12, La3/k;->d:La3/i;

    invoke-static {v6, v12, v7}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    new-instance v25, Lcom/whoop/design/atomic/organism/toolbar/d$a;

    const-string v7, "Universal Checkout Debug"

    invoke-static {v7}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v26

    sget-object v14, Lx81/d;->a:Lx81/d;

    invoke-static {v14}, Lev/n;->h(Lx81/d;)Ljava/lang/Integer;

    move-result-object v28

    const v42, 0xfffa

    const/16 v43, 0x0

    const/16 v27, 0x0

    const/16 v29, 0x0

    const/16 v30, 0x0

    const/16 v31, 0x0

    const/16 v32, 0x0

    const/16 v33, 0x0

    const/16 v34, 0x0

    const/16 v35, 0x0

    const/16 v36, 0x0

    const/16 v37, 0x0

    const/16 v38, 0x0

    const/16 v39, 0x0

    const/16 v40, 0x0

    const/16 v41, 0x0

    invoke-direct/range {v25 .. v43}, Lcom/whoop/design/atomic/organism/toolbar/d$a;-><init>(Lcom/whoop/design/util/TextResource;Lo81/a;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Lny0/q;Lny0/q;ZLc93/m;Ly81/f;Ly81/f;Ly81/f;Ly81/f;Lhy0/h1;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    int-to-float v7, v9

    const/16 v9, 0x8

    int-to-float v9, v9

    mul-float v18, v7, v9

    const/16 v20, 0x0

    const/16 v21, 0xd

    const/16 v17, 0x0

    const/16 v19, 0x0

    move-object/from16 v16, v4

    invoke-static/range {v16 .. v21}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v4

    invoke-virtual {v6, v0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v7

    invoke-virtual {v6}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v10

    if-nez v7, :cond_c

    if-ne v10, v15, :cond_d

    :cond_c
    new-instance v10, Lmr1/h;

    const/4 v7, 0x1

    invoke-direct {v10, v0, v7}, Lmr1/h;-><init>(Leb/a0;I)V

    invoke-virtual {v6, v10}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_d
    check-cast v10, Lc93/a;

    sget v7, Lcom/whoop/design/atomic/organism/toolbar/d$a;->r:I

    move-object/from16 v17, v5

    const/4 v5, 0x3

    shl-int/2addr v7, v5

    or-int/lit8 v7, v7, 0x6

    move-object/from16 v18, v11

    const/16 v11, 0x34

    move/from16 v19, v5

    const/4 v5, 0x0

    move/from16 v20, v9

    move-object v9, v6

    move-object v6, v10

    move v10, v7

    const/4 v7, 0x0

    move-object/from16 v21, v8

    const/4 v8, 0x0

    move-object/from16 v30, v2

    move-object/from16 v29, v3

    move-object v3, v4

    move-object/from16 v2, v16

    move-object/from16 v0, v17

    move-object/from16 v1, v21

    move-object/from16 v4, v25

    move-object/from16 v16, v15

    move-object/from16 v15, v18

    invoke-static/range {v3 .. v11}, Lcom/whoop/design/atomic/organism/toolbar/b;->d(Landroidx/compose/ui/Modifier;Lcom/whoop/design/atomic/organism/toolbar/d;Landroidx/compose/ui/Modifier;Lc93/a;Lc93/a;Lc93/a;Landroidx/compose/runtime/Composer;II)V

    move-object v6, v9

    const/4 v3, 0x4

    int-to-float v3, v3

    mul-float v3, v3, v20

    invoke-static {v3, v2}, Landroidx/compose/foundation/layout/a;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    const/high16 v4, 0x3f800000    # 1.0f

    invoke-static {v4, v3}, Landroidx/compose/foundation/layout/d;->d(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    sget-object v4, Ll0/m;->e:Ll0/h;

    sget-object v5, Lb2/e;->N:Lb2/k;

    const/16 v7, 0x36

    invoke-static {v4, v5, v6, v7}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v4

    iget-wide v7, v6, Lp1/q;->T:J

    invoke-static {v7, v8}, Ljava/lang/Long;->hashCode(J)I

    move-result v5

    invoke-virtual {v6}, Lp1/q;->m()Lp1/p1;

    move-result-object v7

    invoke-static {v6, v3}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    invoke-virtual {v6}, Lp1/q;->i0()V

    iget-boolean v8, v6, Lp1/q;->S:Z

    if-eqz v8, :cond_e

    invoke-virtual {v6, v13}, Lp1/q;->l(Lc93/a;)V

    goto :goto_4

    :cond_e
    invoke-virtual {v6}, Lp1/q;->s0()V

    :goto_4
    invoke-static {v6, v0, v4}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v6, v1, v7}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v0, v6, Lp1/q;->S:Z

    if-nez v0, :cond_f

    invoke-virtual {v6}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v0

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_10

    :cond_f
    invoke-static {v5, v6, v5, v15}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_10
    invoke-static {v6, v12, v3}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const/high16 v4, 0x3f800000    # 1.0f

    invoke-static {v4, v2}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    const-string v0, "Fetch Cart ID"

    invoke-static {v0}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v9

    sget v0, Lx81/d;->b:I

    invoke-virtual {v14, v6, v0}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v1

    invoke-virtual {v1}, Lb91/d;->k()Lb91/a;

    move-result-object v15

    invoke-static/range {v29 .. v29}, Lmr1/j;->h(Lp1/t2;)Lmr1/l;

    move-result-object v1

    invoke-virtual {v1}, Lmr1/l;->e()Z

    move-result v1

    xor-int/lit8 v4, v1, 0x1

    move-object/from16 v1, v30

    invoke-virtual {v6, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v5

    invoke-virtual {v6}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v7

    if-nez v5, :cond_11

    move-object/from16 v5, v16

    if-ne v7, v5, :cond_12

    goto :goto_5

    :cond_11
    move-object/from16 v5, v16

    :goto_5
    new-instance v7, Lcom/whoop/profile/view/edit/o;

    const/4 v8, 0x1

    invoke-direct {v7, v1, v8}, Lcom/whoop/profile/view/edit/o;-><init>(Ll83/h;I)V

    invoke-virtual {v6, v7}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_12
    move-object/from16 v16, v7

    check-cast v16, Lc93/a;

    sget v7, Lcom/whoop/design/util/TextResource;->$stable:I

    shl-int/lit8 v7, v7, 0x12

    or-int/lit8 v18, v7, 0x6

    sget v7, Lb91/a;->d:I

    shl-int/lit8 v19, v7, 0x6

    const/16 v20, 0xfbc

    move-object v7, v5

    const/4 v5, 0x0

    move-object/from16 v17, v6

    const/4 v6, 0x0

    move-object v8, v7

    const/4 v7, 0x0

    move-object v10, v8

    const/4 v8, 0x0

    move-object v11, v10

    const/4 v10, 0x0

    move-object v12, v11

    const/4 v11, 0x0

    move-object v13, v12

    const/4 v12, 0x0

    move-object/from16 v21, v13

    const/4 v13, 0x0

    move-object/from16 v22, v14

    const/4 v14, 0x0

    move-object/from16 v30, v1

    move-object/from16 v45, v21

    move-object/from16 v1, v22

    invoke-static/range {v3 .. v20}, Lny0/z;->j(Landroidx/compose/ui/Modifier;ZZLjava/lang/Integer;Landroidx/compose/ui/Modifier;Lv41/r0;Lcom/whoop/design/util/TextResource;Lg1/u0;Li2/t;Lf0/t;FLl0/k1;Lb91/a;Lc93/a;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v6, v17

    move/from16 v32, v18

    move/from16 v33, v19

    const/16 v3, 0x18

    int-to-float v3, v3

    invoke-static {v3, v2}, Landroidx/compose/foundation/layout/d;->h(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    invoke-static {v6, v4}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    invoke-static/range {v29 .. v29}, Lmr1/j;->h(Lp1/t2;)Lmr1/l;

    move-result-object v4

    invoke-virtual {v4}, Lmr1/l;->a()Ljava/lang/String;

    move-result-object v4

    const/16 v5, 0x10

    if-eqz v4, :cond_15

    const v4, 0x2499dc80

    invoke-virtual {v6, v4}, Lp1/q;->e0(I)V

    invoke-static/range {v29 .. v29}, Lmr1/j;->h(Lp1/t2;)Lmr1/l;

    move-result-object v4

    invoke-virtual {v4}, Lmr1/l;->a()Ljava/lang/String;

    move-result-object v4

    const-string v7, "Cart ID: "

    invoke-static {v7, v4}, Ld;->o(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    sget-object v10, Lp3/r;->G:Lp3/r;

    sget-wide v7, Li2/x;->f:J

    int-to-float v9, v5

    move v11, v3

    move-object v3, v4

    invoke-static {v9, v2}, Landroidx/compose/foundation/layout/a;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    new-instance v15, Lw3/k;

    const/4 v12, 0x3

    invoke-direct {v15, v12}, Lw3/k;-><init>(I)V

    const/16 v27, 0x0

    const v28, 0x3fdd8

    move v13, v5

    move-object/from16 v17, v6

    move-wide v5, v7

    const-wide/16 v7, 0x0

    move v14, v9

    const/4 v9, 0x0

    move/from16 v16, v11

    const/4 v11, 0x0

    move/from16 v19, v12

    move/from16 v18, v13

    const-wide/16 v12, 0x0

    move/from16 v20, v14

    const/4 v14, 0x0

    move/from16 v21, v16

    move-object/from16 v24, v17

    const-wide/16 v16, 0x0

    move/from16 v22, v18

    const/16 v18, 0x0

    move/from16 v44, v19

    const/16 v19, 0x0

    move/from16 v23, v20

    const/16 v20, 0x0

    move/from16 v25, v21

    const/16 v21, 0x0

    move/from16 v26, v22

    const/16 v22, 0x0

    move/from16 v34, v23

    const/16 v23, 0x0

    move/from16 v35, v25

    move-object/from16 v25, v24

    const/16 v24, 0x0

    move/from16 v36, v26

    const v26, 0x301b0

    move/from16 p1, v0

    move/from16 v0, v34

    move/from16 v46, v35

    invoke-static/range {v3 .. v28}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v6, v25

    const/high16 v4, 0x3f800000    # 1.0f

    invoke-static {v2, v0, v6, v2, v4}, Lq63/c;->e(Lb2/t;FLp1/q;Lb2/t;F)Landroidx/compose/ui/Modifier;

    move-result-object v3

    move/from16 v0, p1

    invoke-virtual {v1, v6, v0}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v0

    invoke-virtual {v0}, Lb91/d;->k()Lb91/a;

    move-result-object v15

    const-string v0, "Navigate to Universal Checkout"

    invoke-static {v0}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v9

    invoke-static/range {v29 .. v29}, Lmr1/j;->h(Lp1/t2;)Lmr1/l;

    move-result-object v0

    invoke-virtual {v0}, Lmr1/l;->e()Z

    move-result v0

    const/4 v1, 0x1

    xor-int/lit8 v4, v0, 0x1

    move-object/from16 v5, v30

    invoke-virtual {v6, v5}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v0

    invoke-virtual {v6}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v7

    if-nez v0, :cond_13

    move-object/from16 v13, v45

    if-ne v7, v13, :cond_14

    :cond_13
    new-instance v7, Lcom/whoop/profile/view/edit/o;

    const/4 v0, 0x2

    invoke-direct {v7, v5, v0}, Lcom/whoop/profile/view/edit/o;-><init>(Ll83/h;I)V

    invoke-virtual {v6, v7}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_14
    move-object/from16 v16, v7

    check-cast v16, Lc93/a;

    const/16 v20, 0xfbc

    const/4 v5, 0x0

    move-object/from16 v17, v6

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    move/from16 v18, v32

    move/from16 v19, v33

    invoke-static/range {v3 .. v20}, Lny0/z;->j(Landroidx/compose/ui/Modifier;ZZLjava/lang/Integer;Landroidx/compose/ui/Modifier;Lv41/r0;Lcom/whoop/design/util/TextResource;Lg1/u0;Li2/t;Lf0/t;FLl0/k1;Lb91/a;Lc93/a;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v6, v17

    const/4 v0, 0x0

    invoke-virtual {v6, v0}, Lp1/q;->q(Z)V

    goto :goto_6

    :cond_15
    move/from16 v46, v3

    const/4 v0, 0x0

    const/4 v1, 0x1

    const v3, 0x24a5c4ac

    invoke-virtual {v6, v3}, Lp1/q;->e0(I)V

    invoke-virtual {v6, v0}, Lp1/q;->q(Z)V

    :goto_6
    invoke-static/range {v29 .. v29}, Lmr1/j;->h(Lp1/t2;)Lmr1/l;

    move-result-object v3

    invoke-virtual {v3}, Lmr1/l;->b()Ljava/lang/String;

    move-result-object v3

    if-eqz v3, :cond_16

    invoke-static/range {v29 .. v29}, Lmr1/j;->h(Lp1/t2;)Lmr1/l;

    move-result-object v3

    invoke-virtual {v3}, Lmr1/l;->d()Z

    move-result v3

    if-nez v3, :cond_16

    const v3, 0x24a6f270

    move/from16 v11, v46

    invoke-static {v6, v3, v2, v11, v6}, Lte0/d;->z(Lp1/q;ILb2/t;FLp1/q;)V

    invoke-static/range {v29 .. v29}, Lmr1/j;->h(Lp1/t2;)Lmr1/l;

    move-result-object v3

    invoke-virtual {v3}, Lmr1/l;->b()Ljava/lang/String;

    move-result-object v3

    const-string v4, "Error: "

    invoke-static {v4, v3}, Ld;->o(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    move-object/from16 v17, v6

    sget-wide v5, Li2/x;->f:J

    const/16 v13, 0x10

    int-to-float v4, v13

    invoke-static {v4, v2}, Landroidx/compose/foundation/layout/a;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    new-instance v15, Lw3/k;

    const/4 v12, 0x3

    invoke-direct {v15, v12}, Lw3/k;-><init>(I)V

    const/16 v26, 0x0

    const v27, 0x1fdf8

    const-wide/16 v7, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const-wide/16 v12, 0x0

    const/4 v14, 0x0

    move-object/from16 v24, v17

    const-wide/16 v16, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v25, 0x1b0

    invoke-static/range {v3 .. v27}, Lg1/f9;->b(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Ll3/v0;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v6, v24

    invoke-virtual {v6, v0}, Lp1/q;->q(Z)V

    goto :goto_7

    :cond_16
    const v2, 0x24ab94ac

    invoke-virtual {v6, v2}, Lp1/q;->e0(I)V

    invoke-virtual {v6, v0}, Lp1/q;->q(Z)V

    :goto_7
    invoke-virtual {v6, v1}, Lp1/q;->q(Z)V

    invoke-virtual {v6, v1}, Lp1/q;->q(Z)V

    goto :goto_8

    :cond_17
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "KoinApplication has not been started"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_18
    invoke-virtual {v6}, Lp1/q;->X()V

    :goto_8
    invoke-virtual {v6}, Lp1/q;->u()Lp1/v1;

    move-result-object v0

    if-eqz v0, :cond_19

    new-instance v1, Lmr1/i;

    const/4 v2, 0x0

    move-object/from16 v3, p0

    move/from16 v4, p2

    invoke-direct {v1, v3, v4, v2}, Lmr1/i;-><init>(Leb/a0;II)V

    iput-object v1, v0, Lp1/v1;->d:Lc93/m;

    :cond_19
    return-void
.end method

.method private static final g(Ll83/h;)Lmr1/k;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ll83/h;",
            ")",
            "Lmr1/k;"
        }
    .end annotation

    invoke-interface {p0}, Ll83/h;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lmr1/k;

    return-object p0
.end method

.method private static final h(Lp1/t2;)Lmr1/l;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp1/t2;",
            ")",
            "Lmr1/l;"
        }
    .end annotation

    invoke-interface {p0}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lmr1/l;

    return-object p0
.end method

.method private static final i(Leb/a0;)Ll83/a0;
    .locals 0

    invoke-virtual {p0}, Leb/a0;->z()Z

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final j(Leb/a0;)Ll83/a0;
    .locals 0

    invoke-virtual {p0}, Leb/a0;->z()Z

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final k(Ll83/h;)Ll83/a0;
    .locals 1

    invoke-static {p0}, Lmr1/j;->g(Ll83/h;)Lmr1/k;

    move-result-object p0

    sget-object v0, Lmr1/d$a$a;->a:Lmr1/d$a$a;

    invoke-virtual {p0, v0}, Lmr1/k;->n(Lmr1/d$a;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final l(Ll83/h;)Ll83/a0;
    .locals 1

    invoke-static {p0}, Lmr1/j;->g(Ll83/h;)Lmr1/k;

    move-result-object p0

    sget-object v0, Lmr1/d$a$b;->a:Lmr1/d$a$b;

    invoke-virtual {p0, v0}, Lmr1/k;->n(Lmr1/d$a;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final m(Leb/a0;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p1, p1, 0x1

    invoke-static {p1}, Lp1/x;->L(I)I

    move-result p1

    invoke-static {p0, p2, p1}, Lmr1/j;->f(Leb/a0;Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static final synthetic n(Ll83/h;)Lmr1/k;
    .locals 0

    invoke-static {p0}, Lmr1/j;->g(Ll83/h;)Lmr1/k;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic o(Lp1/t2;)Lmr1/l;
    .locals 0

    invoke-static {p0}, Lmr1/j;->h(Lp1/t2;)Lmr1/l;

    move-result-object p0

    return-object p0
.end method
