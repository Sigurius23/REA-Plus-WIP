.class public abstract Lej1/o;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u001a+\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0001\u00a2\u0006\u0004\u0008\u0006\u0010\u0007\u00a8\u0006\u0008"
    }
    d2 = {
        "Lcj1/i$d;",
        "viewState",
        "Lkotlin/Function1;",
        "Lcj1/g;",
        "Ll83/a0;",
        "onEvent",
        "i",
        "(Lcj1/i$d;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V",
        "health_release"
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
.method public static synthetic a(Lkotlin/jvm/functions/Function1;Z)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lej1/o;->p(Lkotlin/jvm/functions/Function1;Z)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Ljava/lang/Integer;Ln71/r;Lkotlin/jvm/functions/Function1;Lm91/u;Ljava/lang/Object;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Lej1/o;->o(Ljava/lang/Integer;Ln71/r;Lkotlin/jvm/functions/Function1;Lm91/u;Ljava/lang/Object;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(ILcj1/i$d;Lm91/u;Ljava/lang/Integer;Ln71/r;Lkotlin/jvm/functions/Function1;Landroidx/compose/foundation/lazy/a;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p8}, Lej1/o;->m(ILcj1/i$d;Lm91/u;Ljava/lang/Integer;Ln71/r;Lkotlin/jvm/functions/Function1;Landroidx/compose/foundation/lazy/a;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Lcj1/i$d;Ljava/lang/Integer;Ln71/r;Lkotlin/jvm/functions/Function1;Ln0/q;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Lej1/o;->l(Lcj1/i$d;Ljava/lang/Integer;Ln71/r;Lkotlin/jvm/functions/Function1;Ln0/q;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic e(Lcj1/i$d;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Lej1/o;->q(Lcj1/i$d;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic f(Lkotlin/jvm/functions/Function1;Lp1/c1;)Ll83/a0;
    .locals 0

    invoke-static {p1, p0}, Lej1/o;->k(Lp1/c1;Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic g(Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lej1/o;->j(Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic h(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;
    .locals 0

    invoke-static {p0}, Lej1/o;->n(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object p0

    return-object p0
.end method

.method public static final i(Lcj1/i$d;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V
    .locals 60
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcj1/i$d;",
            "Lkotlin/jvm/functions/Function1;",
            "Landroidx/compose/runtime/Composer;",
            "I)V"
        }
    .end annotation

    move-object/from16 v1, p0

    move-object/from16 v4, p1

    const-string v0, "viewState"

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onEvent"

    invoke-static {v4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v13, p2

    check-cast v13, Lp1/q;

    const v0, 0x75b3fefd

    invoke-virtual {v13, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, p3, 0x6

    if-nez v0, :cond_1

    invoke-virtual {v13, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x4

    goto :goto_0

    :cond_0
    const/4 v0, 0x2

    :goto_0
    or-int v0, p3, v0

    goto :goto_1

    :cond_1
    move/from16 v0, p3

    :goto_1
    and-int/lit8 v3, p3, 0x30

    const/16 v5, 0x20

    if-nez v3, :cond_3

    invoke-virtual {v13, v4}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_2

    move v3, v5

    goto :goto_2

    :cond_2
    const/16 v3, 0x10

    :goto_2
    or-int/2addr v0, v3

    :cond_3
    move/from16 v19, v0

    and-int/lit8 v0, v19, 0x13

    const/16 v3, 0x12

    const/4 v14, 0x0

    if-eq v0, v3, :cond_4

    const/4 v0, 0x1

    goto :goto_3

    :cond_4
    move v0, v14

    :goto_3
    and-int/lit8 v3, v19, 0x1

    invoke-virtual {v13, v3, v0}, Lp1/q;->U(IZ)Z

    move-result v0

    if-eqz v0, :cond_25

    invoke-virtual {v13}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v0

    const/4 v3, 0x3

    sget-object v7, Lp1/l;->a:Lp1/v0;

    if-ne v0, v7, :cond_5

    new-instance v0, Ln0/u;

    invoke-direct {v0, v14, v3, v14}, Ln0/u;-><init>(III)V

    invoke-virtual {v13, v0}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_5
    check-cast v0, Ln0/u;

    invoke-virtual {v13}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v8

    if-ne v8, v7, :cond_6

    sget-object v8, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-static {v8}, Lp1/x;->z(Ljava/lang/Object;)Lp1/k1;

    move-result-object v8

    invoke-virtual {v13, v8}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_6
    check-cast v8, Lp1/c1;

    invoke-virtual {v1}, Lcj1/i$d;->d()Ljava/util/List;

    move-result-object v9

    check-cast v9, Ljava/lang/Iterable;

    invoke-interface {v9}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v9

    :cond_7
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    move-result v10

    if-eqz v10, :cond_8

    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v10

    move-object v12, v10

    check-cast v12, Lm91/u;

    instance-of v12, v12, Ln71/q;

    if-eqz v12, :cond_7

    goto :goto_4

    :cond_8
    const/4 v10, 0x0

    :goto_4
    instance-of v9, v10, Ln71/q;

    if-eqz v9, :cond_9

    check-cast v10, Ln71/q;

    goto :goto_5

    :cond_9
    const/4 v10, 0x0

    :goto_5
    if-eqz v10, :cond_a

    invoke-virtual {v10}, Ln71/q;->c()Ljava/util/List;

    move-result-object v9

    if-eqz v9, :cond_a

    invoke-static {v9}, Lm83/s;->R0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Ljava/lang/Integer;

    goto :goto_6

    :cond_a
    const/4 v9, 0x0

    :goto_6
    if-eqz v10, :cond_b

    invoke-virtual {v10}, Ln71/q;->f()Ln71/r;

    move-result-object v10

    move-object/from16 v16, v10

    goto :goto_7

    :cond_b
    const/16 v16, 0x0

    :goto_7
    invoke-virtual {v1}, Lcj1/i$d;->b()Z

    move-result v10

    and-int/lit8 v12, v19, 0x70

    if-ne v12, v5, :cond_c

    const/16 v17, 0x1

    goto :goto_8

    :cond_c
    move/from16 v17, v14

    :goto_8
    invoke-virtual {v13}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v11

    if-nez v17, :cond_d

    if-ne v11, v7, :cond_e

    :cond_d
    new-instance v11, Lcom/whoop/profile/view/i;

    const/16 v15, 0x17

    invoke-direct {v11, v4, v15}, Lcom/whoop/profile/view/i;-><init>(Lkotlin/jvm/functions/Function1;I)V

    invoke-virtual {v13, v11}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_e
    check-cast v11, Lc93/a;

    move-object v15, v8

    move-object v8, v11

    const/4 v11, 0x0

    move/from16 v18, v12

    const/16 v12, 0xc

    move-object/from16 v20, v9

    const/4 v9, 0x0

    move-object v5, v13

    move-object v13, v7

    move v7, v10

    move-object v10, v5

    const/4 v5, 0x0

    invoke-static/range {v7 .. v12}, Lj93/l0;->V(ZLc93/a;FLp1/q;II)Lj1/l;

    move-result-object v7

    const/high16 v8, 0x3f800000    # 1.0f

    sget-object v9, Lb2/t;->w:Lb2/t;

    invoke-static {v8, v9}, Landroidx/compose/foundation/layout/d;->d(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v11

    invoke-static {v11, v7}, Lhg3/i;->g0(Landroidx/compose/ui/Modifier;Lj1/l;)Landroidx/compose/ui/Modifier;

    move-result-object v11

    sget-object v12, Lb2/e;->w:Lb2/m;

    invoke-static {v12, v14}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v3

    iget-wide v5, v10, Lp1/q;->T:J

    invoke-static {v5, v6}, Ljava/lang/Long;->hashCode(J)I

    move-result v5

    invoke-virtual {v10}, Lp1/q;->m()Lp1/p1;

    move-result-object v6

    invoke-static {v10, v11}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v11

    sget-object v23, La3/l;->a:La3/k;

    invoke-virtual/range {v23 .. v23}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-object/from16 v23, v15

    sget-object v15, La3/k;->b:La3/j;

    invoke-virtual {v10}, Lp1/q;->i0()V

    iget-boolean v2, v10, Lp1/q;->S:Z

    if-eqz v2, :cond_f

    invoke-virtual {v10, v15}, Lp1/q;->l(Lc93/a;)V

    goto :goto_9

    :cond_f
    invoke-virtual {v10}, Lp1/q;->s0()V

    :goto_9
    sget-object v2, La3/k;->g:La3/i;

    invoke-static {v10, v2, v3}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v3, La3/k;->f:La3/i;

    invoke-static {v10, v3, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v6, La3/k;->j:La3/i;

    iget-boolean v8, v10, Lp1/q;->S:Z

    if-nez v8, :cond_10

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v8

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v14

    invoke-static {v8, v14}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_11

    :cond_10
    invoke-static {v5, v10, v5, v6}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_11
    sget-object v5, La3/k;->d:La3/i;

    invoke-static {v10, v5, v11}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v8, Ll0/m;->c:Ll0/g;

    sget-object v11, Lb2/e;->M:Lb2/k;

    const/4 v14, 0x0

    invoke-static {v8, v11, v10, v14}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v8

    move-object v14, v12

    iget-wide v11, v10, Lp1/q;->T:J

    invoke-static {v11, v12}, Ljava/lang/Long;->hashCode(J)I

    move-result v11

    invoke-virtual {v10}, Lp1/q;->m()Lp1/p1;

    move-result-object v12

    move-object/from16 v25, v7

    invoke-static {v10, v9}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v7

    invoke-virtual {v10}, Lp1/q;->i0()V

    move-object/from16 v26, v13

    iget-boolean v13, v10, Lp1/q;->S:Z

    if-eqz v13, :cond_12

    invoke-virtual {v10, v15}, Lp1/q;->l(Lc93/a;)V

    goto :goto_a

    :cond_12
    invoke-virtual {v10}, Lp1/q;->s0()V

    :goto_a
    invoke-static {v10, v2, v8}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v10, v3, v12}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v8, v10, Lp1/q;->S:Z

    if-nez v8, :cond_13

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v8

    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v12

    invoke-static {v8, v12}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_14

    :cond_13
    invoke-static {v11, v10, v11, v6}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_14
    invoke-static {v10, v5, v7}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const/high16 v7, 0x3f800000    # 1.0f

    invoke-static {v7, v9}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v8

    const/16 v11, 0xa

    int-to-float v11, v11

    const/4 v12, 0x4

    int-to-float v12, v12

    mul-float/2addr v11, v12

    invoke-static {v11, v8}, Landroidx/compose/foundation/layout/d;->h(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v8

    sget-object v11, Lb2/e;->E:Lb2/m;

    const/4 v12, 0x0

    invoke-static {v11, v12}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v11

    iget-wide v12, v10, Lp1/q;->T:J

    invoke-static {v12, v13}, Ljava/lang/Long;->hashCode(J)I

    move-result v12

    invoke-virtual {v10}, Lp1/q;->m()Lp1/p1;

    move-result-object v13

    invoke-static {v10, v8}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v8

    invoke-virtual {v10}, Lp1/q;->i0()V

    iget-boolean v7, v10, Lp1/q;->S:Z

    if-eqz v7, :cond_15

    invoke-virtual {v10, v15}, Lp1/q;->l(Lc93/a;)V

    goto :goto_b

    :cond_15
    invoke-virtual {v10}, Lp1/q;->s0()V

    :goto_b
    invoke-static {v10, v2, v11}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v10, v3, v13}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v7, v10, Lp1/q;->S:Z

    if-nez v7, :cond_16

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v7

    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v11

    invoke-static {v7, v11}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_17

    :cond_16
    invoke-static {v12, v10, v12, v6}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_17
    invoke-static {v10, v5, v8}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual {v1}, Lcj1/i$d;->c()Z

    move-result v7

    move-object v12, v9

    const/4 v8, 0x3

    const/4 v11, 0x0

    invoke-static {v11, v8}, Lc0/w0;->e(Ld0/c0;I)Lc0/d1;

    move-result-object v9

    move-object v13, v10

    invoke-static {v11, v8}, Lc0/w0;->f(Ld0/c0;I)Lc0/f1;

    move-result-object v10

    sget-object v21, Lej1/b;->a:Lej1/b;

    move-object/from16 v22, v12

    invoke-virtual/range {v21 .. v21}, Lej1/b;->d()Lkotlin/jvm/functions/Function3;

    move-result-object v12

    move-object/from16 v24, v14

    const v14, 0x36d80

    move-object/from16 v27, v15

    const/4 v15, 0x2

    move/from16 v28, v8

    const/4 v8, 0x0

    move-object/from16 v29, v11

    const-string v11, "Lottie Animation"

    move/from16 v17, v18

    move-object/from16 v18, v3

    move-object/from16 v3, v20

    move-object/from16 v20, v5

    move/from16 v5, v17

    move-object/from16 v17, v2

    move-object/from16 v32, v22

    move-object/from16 v2, v23

    move-object/from16 v31, v26

    move-object/from16 v30, v27

    const/16 v23, 0x1

    move-object/from16 v22, v6

    move-object/from16 v6, v29

    invoke-static/range {v7 .. v15}, Landroidx/compose/animation/b;->f(ZLandroidx/compose/ui/Modifier;Lc0/c1;Lc0/e1;Ljava/lang/String;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V

    invoke-virtual {v1}, Lcj1/i$d;->c()Z

    move-result v7

    xor-int/lit8 v7, v7, 0x1

    const/4 v8, 0x3

    invoke-static {v6, v8}, Lc0/w0;->e(Ld0/c0;I)Lc0/d1;

    move-result-object v9

    invoke-static {v6, v8}, Lc0/w0;->f(Ld0/c0;I)Lc0/f1;

    move-result-object v10

    invoke-virtual/range {v21 .. v21}, Lej1/b;->e()Lkotlin/jvm/functions/Function3;

    move-result-object v12

    const/4 v8, 0x0

    const-string v11, "Toolbar Animation"

    invoke-static/range {v7 .. v15}, Landroidx/compose/animation/b;->f(ZLandroidx/compose/ui/Modifier;Lc0/c1;Lc0/e1;Ljava/lang/String;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V

    move/from16 v6, v23

    invoke-virtual {v13, v6}, Lp1/q;->q(Z)V

    new-instance v33, Lep0/j;

    const v57, 0x7ffffb

    const/16 v58, 0x0

    const/16 v34, 0x0

    const/16 v35, 0x0

    const/16 v36, 0x1

    const/16 v37, 0x0

    const/16 v38, 0x0

    const/16 v39, 0x0

    const/16 v40, 0x0

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

    const/16 v53, 0x0

    const/16 v54, 0x0

    const/16 v55, 0x0

    const/16 v56, 0x0

    invoke-direct/range {v33 .. v58}, Lep0/j;-><init>(Ljava/lang/String;Ljava/lang/String;ZLjava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLcom/whoop/coacheverywherecommon/models/CoachEducationType;Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;ZLcom/whoop/navigation/ChatEntrypointExperience;Lcom/whoop/navigation/DrawerPresentation;Lcom/whoop/coacheverywherecommon/models/CoachEntry;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sget v6, Lep0/j;->x:I

    or-int/lit16 v11, v6, 0x180

    const/4 v12, 0x2

    const/4 v9, 0x1

    move-object v10, v13

    move-object/from16 v7, v33

    invoke-static/range {v7 .. v12}, Ldp0/d;->f(Lep0/j;Ll0/k1;ZLandroidx/compose/runtime/Composer;II)Ll0/k1;

    move-result-object v9

    move-object/from16 v6, v32

    const/high16 v7, 0x3f800000    # 1.0f

    invoke-static {v7, v6}, Landroidx/compose/foundation/layout/d;->d(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v7

    const/16 v8, 0x20

    if-ne v5, v8, :cond_18

    const/4 v14, 0x1

    goto :goto_c

    :cond_18
    const/4 v14, 0x0

    :goto_c
    invoke-virtual {v13}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v8

    move-object/from16 v10, v31

    if-nez v14, :cond_19

    if-ne v8, v10, :cond_1a

    :cond_19
    new-instance v8, Lbs1/i;

    const/16 v11, 0xb

    invoke-direct {v8, v2, v4, v11}, Lbs1/i;-><init>(Lp1/c1;Lkotlin/jvm/functions/Function1;I)V

    invoke-virtual {v13, v8}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_1a
    check-cast v8, Lc93/a;

    invoke-static {v7, v0, v8}, Lgb1/q;->m(Landroidx/compose/ui/Modifier;Ln0/u;Lc93/a;)Landroidx/compose/ui/Modifier;

    move-result-object v7

    sget-object v11, Lb2/e;->N:Lb2/k;

    invoke-virtual {v13, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v2

    invoke-virtual {v13, v3}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v8

    or-int/2addr v2, v8

    if-nez v16, :cond_1b

    const/4 v8, -0x1

    goto :goto_d

    :cond_1b
    invoke-virtual/range {v16 .. v16}, Ljava/lang/Enum;->ordinal()I

    move-result v8

    :goto_d
    invoke-virtual {v13, v8}, Lp1/q;->e(I)Z

    move-result v8

    or-int/2addr v2, v8

    const/16 v8, 0x20

    if-ne v5, v8, :cond_1c

    const/4 v14, 0x1

    goto :goto_e

    :cond_1c
    const/4 v14, 0x0

    :goto_e
    or-int/2addr v2, v14

    invoke-virtual {v13}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v12

    if-nez v2, :cond_1d

    if-ne v12, v10, :cond_1e

    :cond_1d
    move-object v2, v0

    goto :goto_f

    :cond_1e
    move v14, v8

    move-object v8, v0

    move-object v0, v12

    move-object/from16 v12, v18

    move/from16 v18, v5

    goto :goto_10

    :goto_f
    new-instance v0, Lam2/s;

    move v12, v5

    const/16 v5, 0x10

    move-object/from16 v14, v18

    move/from16 v18, v12

    move-object v12, v14

    move v14, v8

    move-object v8, v2

    move-object v2, v3

    move-object/from16 v3, v16

    invoke-direct/range {v0 .. v5}, Lam2/s;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lkotlin/jvm/functions/Function1;I)V

    invoke-virtual {v13, v0}, Lp1/q;->p0(Ljava/lang/Object;)V

    :goto_10
    move-object v15, v0

    check-cast v15, Lkotlin/jvm/functions/Function1;

    move-object/from16 v0, v17

    const v17, 0x30030

    move/from16 v5, v18

    const/16 v18, 0x1d8

    move-object/from16 v26, v10

    const/4 v10, 0x0

    move-object v2, v12

    const/4 v12, 0x0

    move-object/from16 v16, v13

    const/4 v13, 0x0

    move v3, v14

    const/4 v14, 0x0

    move-object/from16 v3, v20

    move-object/from16 v59, v26

    invoke-static/range {v7 .. v18}, Lkotlin/jvm/internal/j;->c(Landroidx/compose/ui/Modifier;Ln0/u;Ll0/k1;Ll0/l;Lb2/f;Lh0/o1;ZLf0/k;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    move-object/from16 v13, v16

    const/4 v7, 0x1

    invoke-virtual {v13, v7}, Lp1/q;->q(Z)V

    and-int/lit8 v7, v19, 0x7e

    invoke-static {v1, v4, v13, v7}, Lej1/m;->e(Lcj1/i$d;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    invoke-virtual {v1}, Lcj1/i$d;->b()Z

    move-result v7

    sget-object v8, Lb2/e;->x:Lb2/m;

    sget-object v9, Landroidx/compose/foundation/layout/b;->a:Landroidx/compose/foundation/layout/b;

    invoke-virtual {v9, v6, v8}, Landroidx/compose/foundation/layout/b;->a(Landroidx/compose/ui/Modifier;Lb2/h;)Landroidx/compose/ui/Modifier;

    move-result-object v9

    move-object v10, v13

    const-wide/16 v12, 0x0

    const/16 v15, 0x40

    move-object v14, v10

    const-wide/16 v10, 0x0

    move-object/from16 v8, v25

    invoke-static/range {v7 .. v15}, Lj1/g;->b(ZLj1/l;Landroidx/compose/ui/Modifier;JJLandroidx/compose/runtime/Composer;I)V

    move-object v13, v14

    move-object/from16 v14, v24

    const/4 v12, 0x0

    invoke-static {v14, v12}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v7

    iget-wide v8, v13, Lp1/q;->T:J

    invoke-static {v8, v9}, Ljava/lang/Long;->hashCode(J)I

    move-result v8

    invoke-virtual {v13}, Lp1/q;->m()Lp1/p1;

    move-result-object v9

    invoke-static {v13, v6}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v6

    invoke-virtual {v13}, Lp1/q;->i0()V

    iget-boolean v10, v13, Lp1/q;->S:Z

    if-eqz v10, :cond_1f

    move-object/from16 v10, v30

    invoke-virtual {v13, v10}, Lp1/q;->l(Lc93/a;)V

    goto :goto_11

    :cond_1f
    invoke-virtual {v13}, Lp1/q;->s0()V

    :goto_11
    invoke-static {v13, v0, v7}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v13, v2, v9}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v0, v13, Lp1/q;->S:Z

    if-nez v0, :cond_20

    invoke-virtual {v13}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v0

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-static {v0, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_21

    :cond_20
    move-object/from16 v0, v22

    invoke-static {v8, v13, v8, v0}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_21
    invoke-static {v13, v3, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const/16 v8, 0x20

    if-ne v5, v8, :cond_22

    const/4 v14, 0x1

    goto :goto_12

    :cond_22
    move v14, v12

    :goto_12
    invoke-virtual {v13}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v0

    if-nez v14, :cond_23

    move-object/from16 v10, v59

    if-ne v0, v10, :cond_24

    :cond_23
    new-instance v0, Ldk2/i;

    const/4 v2, 0x7

    invoke-direct {v0, v4, v2}, Ldk2/i;-><init>(Lkotlin/jvm/functions/Function1;I)V

    invoke-virtual {v13, v0}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_24
    move-object v10, v0

    check-cast v10, Lkotlin/jvm/functions/Function1;

    const/16 v15, 0x180

    const/16 v16, 0x72

    const-string v7, "OVERLAY_HEALTH_TAB"

    const/4 v8, 0x0

    const/4 v9, 0x1

    const/4 v11, 0x0

    const/4 v12, 0x0

    move-object v14, v13

    const/4 v13, 0x0

    invoke-static/range {v7 .. v16}, Lm12/d;->z(Ljava/lang/String;Lm12/e;ZLkotlin/jvm/functions/Function1;Lc93/a;Lkotlin/jvm/functions/Function1;Lc93/a;Landroidx/compose/runtime/Composer;II)V

    move-object v13, v14

    const/4 v6, 0x1

    invoke-virtual {v13, v6}, Lp1/q;->q(Z)V

    invoke-virtual {v13, v6}, Lp1/q;->q(Z)V

    goto :goto_13

    :cond_25
    invoke-virtual {v13}, Lp1/q;->X()V

    :goto_13
    invoke-virtual {v13}, Lp1/q;->u()Lp1/v1;

    move-result-object v0

    if-eqz v0, :cond_26

    new-instance v2, Lej1/k;

    const/4 v3, 0x1

    move/from16 v6, p3

    invoke-direct {v2, v1, v4, v6, v3}, Lej1/k;-><init>(Lcj1/i$d;Lkotlin/jvm/functions/Function1;II)V

    iput-object v2, v0, Lp1/v1;->d:Lc93/m;

    :cond_26
    return-void
.end method

.method private static final j(Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 2

    new-instance v0, Lcj1/g$m;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Lcj1/g$m;-><init>(Z)V

    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final k(Lp1/c1;Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 1

    invoke-interface {p0}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v0

    if-nez v0, :cond_0

    sget-object v0, Lcj1/g$o;->a:Lcj1/g$o;

    invoke-interface {p1, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-interface {p0, p1}, Lp1/c1;->setValue(Ljava/lang/Object;)V

    :cond_0
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final l(Lcj1/i$d;Ljava/lang/Integer;Ln71/r;Lkotlin/jvm/functions/Function1;Ln0/q;)Ll83/a0;
    .locals 11

    const-string v0, "$this$LazyColumn"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lcj1/i$d;->d()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    const/4 v1, 0x0

    move v3, v1

    :goto_0
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    add-int/lit8 v9, v3, 0x1

    const/4 v10, 0x0

    if-ltz v3, :cond_0

    move-object v5, v1

    check-cast v5, Lm91/u;

    new-instance v2, Lat2/a0;

    move-object v4, p0

    move-object v6, p1

    move-object v7, p2

    move-object v8, p3

    invoke-direct/range {v2 .. v8}, Lat2/a0;-><init>(ILcj1/i$d;Lm91/u;Ljava/lang/Integer;Ln71/r;Lkotlin/jvm/functions/Function1;)V

    new-instance p0, Lx1/b;

    const/4 p1, 0x1

    const p2, 0x256c0da0

    invoke-direct {p0, v2, p1, p2}, Lx1/b;-><init>(Ljava/lang/Object;ZI)V

    const/4 p1, 0x3

    invoke-static {p4, v10, p0, p1}, Ln0/q;->b(Ln0/q;Ljava/lang/String;Lkotlin/jvm/functions/Function3;I)V

    move-object p0, v4

    move-object p1, v6

    move-object p2, v7

    move v3, v9

    goto :goto_0

    :cond_0
    invoke-static {}, Lwb3/f;->d0()V

    throw v10

    :cond_1
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final m(ILcj1/i$d;Lm91/u;Ljava/lang/Integer;Ln71/r;Lkotlin/jvm/functions/Function1;Landroidx/compose/foundation/lazy/a;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 10

    const-string v0, "$this$item"

    move-object/from16 v1, p6

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    and-int/lit8 v0, p8, 0x11

    const/16 v1, 0x10

    const/4 v2, 0x0

    const/4 v6, 0x1

    if-eq v0, v1, :cond_0

    move v0, v6

    goto :goto_0

    :cond_0
    move v0, v2

    :goto_0
    and-int/lit8 v1, p8, 0x1

    move-object/from16 v7, p7

    check-cast v7, Lp1/q;

    invoke-virtual {v7, v1, v0}, Lp1/q;->U(IZ)Z

    move-result v0

    if-eqz v0, :cond_a

    invoke-virtual {p1}, Lcj1/i$d;->d()Ljava/util/List;

    move-result-object v0

    invoke-static {v0}, Lwb3/f;->C(Ljava/util/List;)I

    move-result v0

    if-eq p0, v0, :cond_2

    instance-of v0, p2, La11/r;

    if-nez v0, :cond_1

    const v0, -0x26b2ee92

    invoke-virtual {v7, v0}, Lp1/q;->e0(I)V

    invoke-virtual {v7, v2}, Lp1/q;->q(Z)V

    move v0, v6

    goto :goto_1

    :cond_1
    const v0, 0x7a9f6b02

    invoke-virtual {v7, v0}, Lp1/q;->e0(I)V

    sget-object v0, Lx81/d;->a:Lx81/d;

    sget v1, Lx81/d;->b:I

    invoke-virtual {v0, v7, v1}, Lx81/d;->c(Landroidx/compose/runtime/Composer;I)Lcom/whoop/data/repositories/FeatureFlagChecker;

    move-result-object v0

    const-string v1, "health-tab-no-hr"

    invoke-interface {v0, v1}, Lcom/whoop/data/repositories/FeatureFlagChecker;->isFeatureEnabled(Ljava/lang/String;)Z

    move-result v0

    invoke-virtual {v7, v2}, Lp1/q;->q(Z)V

    :goto_1
    if-eqz v0, :cond_2

    move v0, v6

    goto :goto_2

    :cond_2
    move v0, v2

    :goto_2
    invoke-virtual {v7}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    sget-object v3, Lp1/l;->a:Lp1/v0;

    if-ne v1, v3, :cond_3

    new-instance v1, Lej1/n;

    const/4 v5, 0x0

    invoke-direct {v1, v5}, Lej1/n;-><init>(I)V

    invoke-virtual {v7, v1}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_3
    check-cast v1, Lkotlin/jvm/functions/Function1;

    sget-object v5, Lb2/t;->w:Lb2/t;

    invoke-static {v5, v0, v1}, Lgb1/d;->b(Landroidx/compose/ui/Modifier;ZLkotlin/jvm/functions/Function1;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    invoke-static {v5, p2}, Lej1/q;->h(Landroidx/compose/ui/Modifier;Lm91/u;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    invoke-interface {v0, v1}, Landroidx/compose/ui/Modifier;->e(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    sget-object v1, Lb2/e;->w:Lb2/m;

    invoke-static {v1, v2}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v1

    iget-wide v8, v7, Lp1/q;->T:J

    invoke-static {v8, v9}, Ljava/lang/Long;->hashCode(J)I

    move-result v2

    invoke-virtual {v7}, Lp1/q;->m()Lp1/p1;

    move-result-object v5

    invoke-static {v7, v0}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    sget-object v8, La3/l;->a:La3/k;

    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v8, La3/k;->b:La3/j;

    invoke-virtual {v7}, Lp1/q;->i0()V

    iget-boolean v9, v7, Lp1/q;->S:Z

    if-eqz v9, :cond_4

    invoke-virtual {v7, v8}, Lp1/q;->l(Lc93/a;)V

    goto :goto_3

    :cond_4
    invoke-virtual {v7}, Lp1/q;->s0()V

    :goto_3
    sget-object v8, La3/k;->g:La3/i;

    invoke-static {v7, v8, v1}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v1, La3/k;->f:La3/i;

    invoke-static {v7, v1, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v1, La3/k;->j:La3/i;

    iget-boolean v5, v7, Lp1/q;->S:Z

    if-nez v5, :cond_5

    invoke-virtual {v7}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    invoke-static {v5, v8}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_6

    :cond_5
    invoke-static {v2, v7, v2, v1}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_6
    sget-object v1, La3/k;->d:La3/i;

    invoke-static {v7, v1, v0}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual {v7, p3}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v0

    if-nez p4, :cond_7

    const/4 v2, -0x1

    goto :goto_4

    :cond_7
    invoke-virtual {p4}, Ljava/lang/Enum;->ordinal()I

    move-result v2

    :goto_4
    invoke-virtual {v7, v2}, Lp1/q;->e(I)Z

    move-result v2

    or-int/2addr v0, v2

    invoke-virtual {v7, p5}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v5

    or-int/2addr v0, v5

    invoke-virtual {v7, p2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v5

    or-int/2addr v0, v5

    invoke-virtual {v7}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    if-nez v0, :cond_8

    if-ne v5, v3, :cond_9

    :cond_8
    new-instance v0, Lam2/s;

    const/16 v5, 0x11

    move-object v4, p2

    move-object v1, p3

    move-object v2, p4

    move-object v3, p5

    invoke-direct/range {v0 .. v5}, Lam2/s;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Ljava/lang/Object;I)V

    invoke-virtual {v7, v0}, Lp1/q;->p0(Ljava/lang/Object;)V

    move-object v5, v0

    :cond_9
    check-cast v5, Lkotlin/jvm/functions/Function1;

    const/4 v0, 0x0

    const/4 v1, 0x1

    const/4 v2, 0x0

    move-object p4, p2

    move/from16 p7, v0

    move/from16 p8, v1

    move-object p3, v2

    move-object p5, v5

    move-object/from16 p6, v7

    invoke-static/range {p3 .. p8}, Lej1/q;->d(Landroidx/compose/ui/Modifier;Lm91/u;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    move-object/from16 v0, p6

    invoke-virtual {v0, v6}, Lp1/q;->q(Z)V

    goto :goto_5

    :cond_a
    move-object v0, v7

    invoke-virtual {v0}, Lp1/q;->X()V

    :goto_5
    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method

.method private static final n(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;
    .locals 7

    const-string v0, "$this$applyIf"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 p0, 0x2

    int-to-float p0, p0

    const/16 v0, 0x8

    int-to-float v0, v0

    mul-float v5, p0, v0

    const/4 v6, 0x7

    sget-object v1, Lb2/t;->w:Lb2/t;

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-static/range {v1 .. v6}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object p0

    return-object p0
.end method

.method private static final o(Ljava/lang/Integer;Ln71/r;Lkotlin/jvm/functions/Function1;Lm91/u;Ljava/lang/Object;)Ll83/a0;
    .locals 9

    const-string v0, "it"

    invoke-static {p4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p4, Lcom/whoop/navigation/e;

    if-eqz v0, :cond_3

    move-object v1, p4

    check-cast v1, Lcom/whoop/navigation/e;

    invoke-virtual {v1}, Lcom/whoop/navigation/e;->d()Lcom/whoop/navigation/AppScreen;

    move-result-object v0

    instance-of v0, v0, Lcom/whoop/navigation/AppScreen$o2;

    if-eqz v0, :cond_3

    invoke-virtual {v1}, Lcom/whoop/navigation/e;->c()Lcom/whoop/navigation/NavigationScreenModel;

    move-result-object v0

    instance-of v0, v0, Lcom/whoop/navigation/HealthMonitorScreenModel;

    if-eqz v0, :cond_3

    new-instance v2, Lcom/whoop/navigation/HealthMonitorScreenModel;

    const/4 p4, 0x0

    if-eqz p1, :cond_0

    invoke-virtual {p1}, Ljava/lang/Enum;->name()Ljava/lang/String;

    move-result-object p1

    move-object v4, p1

    goto :goto_0

    :cond_0
    move-object v4, p4

    :goto_0
    invoke-virtual {v1}, Lcom/whoop/navigation/e;->c()Lcom/whoop/navigation/NavigationScreenModel;

    move-result-object p1

    instance-of v0, p1, Lcom/whoop/navigation/HealthMonitorScreenModel;

    if-eqz v0, :cond_1

    check-cast p1, Lcom/whoop/navigation/HealthMonitorScreenModel;

    goto :goto_1

    :cond_1
    move-object p1, p4

    :goto_1
    if-eqz p1, :cond_2

    invoke-virtual {p1}, Lcom/whoop/navigation/HealthMonitorScreenModel;->getSource()Ljava/lang/String;

    move-result-object p4

    :cond_2
    move-object v5, p4

    const/16 v7, 0x8

    const/4 v8, 0x0

    const/4 v6, 0x0

    move-object v3, p0

    invoke-direct/range {v2 .. v8}, Lcom/whoop/navigation/HealthMonitorScreenModel;-><init>(Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Lcom/whoop/navigation/AiAction;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/4 v5, 0x5

    move-object v3, v2

    const/4 v2, 0x0

    const/4 v4, 0x0

    invoke-static/range {v1 .. v6}, Lcom/whoop/navigation/e;->b(Lcom/whoop/navigation/e;Lcom/whoop/navigation/AppScreen;Lcom/whoop/navigation/NavigationScreenModel;Lj02/v0;ILjava/lang/Object;)Lcom/whoop/navigation/e;

    move-result-object p0

    new-instance p1, Lcj1/g$l;

    invoke-direct {p1, p0, p3}, Lcj1/g$l;-><init>(Ljava/lang/Object;Lm91/u;)V

    invoke-interface {p2, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_2

    :cond_3
    new-instance p0, Lcj1/g$l;

    invoke-direct {p0, p4, p3}, Lcj1/g$l;-><init>(Ljava/lang/Object;Lm91/u;)V

    invoke-interface {p2, p0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :goto_2
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final p(Lkotlin/jvm/functions/Function1;Z)Ll83/a0;
    .locals 1

    new-instance v0, Lcj1/g$g;

    invoke-direct {v0, p1}, Lcj1/g$g;-><init>(Z)V

    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final q(Lcj1/i$d;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, Lp1/x;->L(I)I

    move-result p2

    invoke-static {p0, p1, p3, p2}, Lej1/o;->i(Lcj1/i$d;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method
