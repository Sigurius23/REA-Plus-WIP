.class public abstract Ljp1/h;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0002\u0008\u0002\u001a-\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0014\u0008\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0007\u00a2\u0006\u0004\u0008\u0006\u0010\u0007\u00a8\u0006\n\u00b2\u0006\u000e\u0010\t\u001a\u00020\u00088\n@\nX\u008a\u008e\u0002"
    }
    d2 = {
        "Lhp1/e;",
        "viewState",
        "Lkotlin/Function1;",
        "Lhp1/f;",
        "Ll83/a0;",
        "onViewEvent",
        "h",
        "(Lhp1/e;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V",
        "",
        "selectedNumber",
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
.method public static synthetic a(I)Ll83/a0;
    .locals 0

    invoke-static {p0}, Ljp1/h;->n(I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lhp1/f;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Ljp1/h;->i(Lhp1/f;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Ljp1/h;->p(Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Lhp1/e;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p5}, Ljp1/h;->q(Lhp1/e;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic e(ILp1/c1;)Ll83/a0;
    .locals 0

    invoke-static {p1, p0}, Ljp1/h;->m(Lp1/c1;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic f(Lkotlin/jvm/functions/Function1;Lhp1/e;Lp1/c1;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, Ljp1/h;->o(Lkotlin/jvm/functions/Function1;Lhp1/e;Lp1/c1;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic g(Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Ljp1/h;->l(Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final h(Lhp1/e;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V
    .locals 47
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lhp1/e;",
            "Lkotlin/jvm/functions/Function1;",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    move-object/from16 v1, p0

    const-string v0, "viewState"

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v11, p2

    check-cast v11, Lp1/q;

    const v0, 0x4b947c42    # 1.9462276E7f

    invoke-virtual {v11, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, p3, 0x6

    if-nez v0, :cond_2

    and-int/lit8 v0, p3, 0x8

    if-nez v0, :cond_0

    invoke-virtual {v11, v1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v0

    goto :goto_0

    :cond_0
    invoke-virtual {v11, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v0

    :goto_0
    if-eqz v0, :cond_1

    const/4 v0, 0x4

    goto :goto_1

    :cond_1
    const/4 v0, 0x2

    :goto_1
    or-int v0, p3, v0

    goto :goto_2

    :cond_2
    move/from16 v0, p3

    :goto_2
    and-int/lit8 v2, p4, 0x2

    if-eqz v2, :cond_4

    or-int/lit8 v0, v0, 0x30

    :cond_3
    move-object/from16 v3, p1

    goto :goto_4

    :cond_4
    and-int/lit8 v3, p3, 0x30

    if-nez v3, :cond_3

    move-object/from16 v3, p1

    invoke-virtual {v11, v3}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_5

    const/16 v4, 0x20

    goto :goto_3

    :cond_5
    const/16 v4, 0x10

    :goto_3
    or-int/2addr v0, v4

    :goto_4
    and-int/lit8 v4, v0, 0x13

    const/16 v14, 0x12

    const/4 v15, 0x0

    if-eq v4, v14, :cond_6

    const/4 v4, 0x1

    goto :goto_5

    :cond_6
    move v4, v15

    :goto_5
    and-int/lit8 v6, v0, 0x1

    invoke-virtual {v11, v6, v4}, Lp1/q;->U(IZ)Z

    move-result v4

    if-eqz v4, :cond_1f

    sget-object v4, Lp1/l;->a:Lp1/v0;

    if-eqz v2, :cond_8

    invoke-virtual {v11}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v4, :cond_7

    new-instance v2, Ljg/c;

    const/16 v3, 0x14

    invoke-direct {v2, v3}, Ljg/c;-><init>(I)V

    invoke-virtual {v11, v2}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_7
    check-cast v2, Lkotlin/jvm/functions/Function1;

    goto :goto_6

    :cond_8
    move-object v2, v3

    :goto_6
    invoke-virtual {v11}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    if-ne v3, v4, :cond_9

    invoke-virtual {v1}, Lhp1/e;->c()I

    move-result v3

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-static {v3}, Lp1/x;->z(Ljava/lang/Object;)Lp1/k1;

    move-result-object v3

    invoke-virtual {v11, v3}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_9
    check-cast v3, Lp1/c1;

    const/high16 v6, 0x3f800000    # 1.0f

    sget-object v7, Lb2/t;->w:Lb2/t;

    invoke-static {v6, v7}, Landroidx/compose/foundation/layout/d;->d(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v8

    invoke-static {v8}, Lgb1/b0;->b0(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v8

    invoke-static {v8}, Ll0/f;->k(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v8

    sget-object v9, Ll0/m;->c:Ll0/g;

    sget-object v10, Lb2/e;->M:Lb2/k;

    invoke-static {v9, v10, v11, v15}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v10

    iget-wide v5, v11, Lp1/q;->T:J

    invoke-static {v5, v6}, Ljava/lang/Long;->hashCode(J)I

    move-result v5

    invoke-virtual {v11}, Lp1/q;->m()Lp1/p1;

    move-result-object v6

    invoke-static {v11, v8}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v8

    sget-object v16, La3/l;->a:La3/k;

    invoke-virtual/range {v16 .. v16}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v12, La3/k;->b:La3/j;

    invoke-virtual {v11}, Lp1/q;->i0()V

    move/from16 v17, v14

    iget-boolean v14, v11, Lp1/q;->S:Z

    if-eqz v14, :cond_a

    invoke-virtual {v11, v12}, Lp1/q;->l(Lc93/a;)V

    goto :goto_7

    :cond_a
    invoke-virtual {v11}, Lp1/q;->s0()V

    :goto_7
    sget-object v14, La3/k;->g:La3/i;

    invoke-static {v11, v14, v10}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v10, La3/k;->f:La3/i;

    invoke-static {v11, v10, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v6, La3/k;->j:La3/i;

    iget-boolean v15, v11, Lp1/q;->S:Z

    if-nez v15, :cond_b

    invoke-virtual {v11}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v15

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v13

    invoke-static {v15, v13}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v13

    if-nez v13, :cond_c

    :cond_b
    invoke-static {v5, v11, v5, v6}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_c
    sget-object v13, La3/k;->d:La3/i;

    invoke-static {v11, v13, v8}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual {v1}, Lhp1/e;->e()Lcom/whoop/design/util/TextResource;

    move-result-object v5

    move-object v8, v3

    invoke-virtual {v1}, Lhp1/e;->d()Lcom/whoop/design/util/TextResource;

    move-result-object v3

    and-int/lit8 v15, v0, 0x70

    move-object/from16 v20, v5

    const/16 v5, 0x20

    if-ne v15, v5, :cond_d

    const/16 v19, 0x1

    goto :goto_8

    :cond_d
    const/16 v19, 0x0

    :goto_8
    invoke-virtual {v11}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    if-nez v19, :cond_f

    if-ne v5, v4, :cond_e

    goto :goto_9

    :cond_e
    move/from16 v28, v0

    goto :goto_a

    :cond_f
    :goto_9
    new-instance v5, Lif0/b;

    move/from16 v28, v0

    const/16 v0, 0x1b

    invoke-direct {v5, v2, v0}, Lif0/b;-><init>(Lkotlin/jvm/functions/Function1;I)V

    invoke-virtual {v11, v5}, Lp1/q;->p0(Ljava/lang/Object;)V

    :goto_a
    check-cast v5, Lc93/a;

    sget v0, Lcom/whoop/design/util/TextResource;->$stable:I

    shl-int/lit8 v19, v0, 0x3

    or-int v19, v0, v19

    move-object/from16 v22, v10

    const/16 v10, 0x1c

    move-object/from16 v23, v4

    const/4 v4, 0x0

    move-object/from16 v24, v7

    move-object v7, v5

    const/4 v5, 0x0

    move-object/from16 v25, v6

    const/4 v6, 0x0

    move-object/from16 v29, v2

    move-object/from16 p1, v8

    move-object/from16 v30, v9

    move-object v8, v11

    move/from16 p2, v15

    move/from16 v9, v19

    move-object/from16 v2, v20

    move-object/from16 v31, v22

    move-object/from16 v33, v23

    move-object/from16 v34, v24

    move-object/from16 v32, v25

    const/4 v11, 0x1

    const/high16 v15, 0x3f800000    # 1.0f

    const/16 v19, 0x20

    invoke-static/range {v2 .. v10}, Ljp1/q;->e(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;ILcom/whoop/design/util/TextResource;Lc93/a;Lc93/a;Landroidx/compose/runtime/Composer;II)V

    float-to-double v2, v15

    const-wide/16 v4, 0x0

    cmpl-double v2, v2, v4

    if-lez v2, :cond_10

    move v5, v11

    goto :goto_b

    :cond_10
    const/4 v5, 0x0

    :goto_b
    if-nez v5, :cond_11

    const-string v2, "invalid weight; must be greater than zero"

    invoke-static {v2}, Lm0/a;->a(Ljava/lang/String;)V

    :cond_11
    invoke-static {v15, v11, v8}, Ldc/b;->y(FZLp1/q;)V

    const/4 v2, 0x3

    int-to-float v2, v2

    const/16 v3, 0x8

    int-to-float v4, v3

    mul-float/2addr v4, v2

    move-object/from16 v5, v34

    invoke-static {v4, v5}, Landroidx/compose/foundation/layout/a;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    sget-object v6, Lb2/e;->N:Lb2/k;

    const/16 v7, 0x30

    move-object/from16 v9, v30

    invoke-static {v9, v6, v8, v7}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v6

    iget-wide v9, v8, Lp1/q;->T:J

    invoke-static {v9, v10}, Ljava/lang/Long;->hashCode(J)I

    move-result v7

    invoke-virtual {v8}, Lp1/q;->m()Lp1/p1;

    move-result-object v9

    invoke-static {v8, v4}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    invoke-virtual {v8}, Lp1/q;->i0()V

    iget-boolean v10, v8, Lp1/q;->S:Z

    if-eqz v10, :cond_12

    invoke-virtual {v8, v12}, Lp1/q;->l(Lc93/a;)V

    goto :goto_c

    :cond_12
    invoke-virtual {v8}, Lp1/q;->s0()V

    :goto_c
    invoke-static {v8, v14, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    move-object/from16 v6, v31

    invoke-static {v8, v6, v9}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v6, v8, Lp1/q;->S:Z

    if-nez v6, :cond_13

    invoke-virtual {v8}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v6

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    invoke-static {v6, v9}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_14

    :cond_13
    move-object/from16 v6, v32

    invoke-static {v7, v8, v7, v6}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_14
    invoke-static {v8, v13, v4}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual {v1}, Lhp1/e;->g()Lcom/whoop/design/util/TextResource;

    move-result-object v4

    invoke-static {v4, v8, v0}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v4

    sget-object v6, Lx81/d;->a:Lx81/d;

    sget v7, Lx81/d;->b:I

    invoke-virtual {v6, v8, v7}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v9

    invoke-virtual {v9}, Ly81/i;->y()J

    move-result-wide v9

    invoke-virtual {v6, v8, v7}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v12

    invoke-virtual {v12}, Lb91/d;->N()Lb91/a;

    move-result-object v22

    move v12, v3

    invoke-static {v15, v5}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    new-instance v14, Lw3/k;

    const/4 v13, 0x5

    invoke-direct {v14, v13}, Lw3/k;-><init>(I)V

    sget v13, Lb91/a;->d:I

    shl-int/lit8 v26, v13, 0x12

    const v27, 0x2fdf8

    move-object v13, v6

    move/from16 v17, v7

    const-wide/16 v6, 0x0

    move-object/from16 v24, v8

    const/4 v8, 0x0

    move-object/from16 v34, v5

    move-wide/from16 v45, v9

    move v10, v2

    move-object v2, v4

    move-wide/from16 v4, v45

    const/4 v9, 0x0

    move/from16 v20, v10

    const/4 v10, 0x0

    move/from16 v23, v11

    move/from16 v21, v12

    const-wide/16 v11, 0x0

    move-object/from16 v25, v13

    const/4 v13, 0x0

    move/from16 v30, v15

    const/16 v31, 0x4

    const-wide/16 v15, 0x0

    move/from16 v32, v17

    const/16 v17, 0x0

    const/16 v35, 0x0

    const/16 v18, 0x0

    move/from16 v36, v19

    const/16 v19, 0x0

    move/from16 v37, v20

    const/16 v20, 0x0

    move/from16 v38, v21

    const/16 v21, 0x0

    move/from16 v39, v23

    const/16 v23, 0x0

    move-object/from16 v40, v25

    const/16 v25, 0x30

    move/from16 v30, v0

    move/from16 v1, v31

    move/from16 v41, v32

    move-object/from16 v0, v34

    invoke-static/range {v2 .. v27}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v8, v24

    int-to-float v2, v1

    mul-float v2, v2, v37

    invoke-static {v2, v0}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    invoke-static {v8, v3}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    invoke-static/range {p1 .. p1}, Ljp1/h;->j(Lp1/c1;)I

    move-result v3

    invoke-virtual/range {p0 .. p0}, Lhp1/e;->c()I

    move-result v4

    invoke-virtual/range {p0 .. p0}, Lhp1/e;->b()I

    move-result v5

    invoke-virtual {v8}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v6

    move-object/from16 v7, v33

    if-ne v6, v7, :cond_15

    new-instance v6, Lf1/a0;

    const/16 v9, 0x1a

    move-object/from16 v10, p1

    invoke-direct {v6, v9, v10}, Lf1/a0;-><init>(ILp1/c1;)V

    invoke-virtual {v8, v6}, Lp1/q;->p0(Ljava/lang/Object;)V

    goto :goto_d

    :cond_15
    move-object/from16 v10, p1

    :goto_d
    check-cast v6, Lkotlin/jvm/functions/Function1;

    invoke-virtual {v8}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v9

    if-ne v9, v7, :cond_16

    new-instance v9, Ljg/c;

    const/16 v11, 0x15

    invoke-direct {v9, v11}, Ljg/c;-><init>(I)V

    invoke-virtual {v8, v9}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_16
    check-cast v9, Lkotlin/jvm/functions/Function1;

    const/4 v15, 0x0

    const/16 v16, 0x680

    move v11, v2

    const/4 v2, 0x0

    move-object/from16 v33, v7

    move-object v7, v6

    const/4 v6, 0x0

    move-object/from16 v24, v8

    move-object v8, v9

    const/4 v9, 0x0

    move-object v12, v10

    const/4 v10, 0x0

    move v13, v11

    const/4 v11, 0x0

    move-object v14, v12

    const/4 v12, 0x0

    move-object/from16 v17, v14

    const v14, 0x61b6006

    move v1, v13

    move-object/from16 v42, v17

    move-object/from16 v13, v24

    move-object/from16 v43, v33

    invoke-static/range {v2 .. v16}, Lx21/d;->i(Lcom/whoop/design/util/TextResource;IIIZLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;ZZLcom/whoop/design/util/TextResource;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;III)V

    move-object v8, v13

    invoke-static {v1, v0}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    invoke-static {v8, v1}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    sget-object v3, Lny0/v;->TextLarge:Lny0/v;

    invoke-virtual/range {p0 .. p0}, Lhp1/e;->a()Lcom/whoop/design/util/TextResource;

    move-result-object v1

    move/from16 v2, v30

    invoke-static {v1, v8, v2}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v4

    move-object/from16 v13, v40

    move/from16 v1, v41

    invoke-virtual {v13, v8, v1}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v1

    invoke-virtual {v1}, Ly81/i;->i0()J

    move-result-wide v6

    const/high16 v15, 0x3f800000    # 1.0f

    invoke-static {v15, v0}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    move/from16 v0, p2

    const/16 v1, 0x20

    if-ne v0, v1, :cond_17

    const/4 v15, 0x1

    goto :goto_e

    :cond_17
    const/4 v15, 0x0

    :goto_e
    and-int/lit8 v5, v28, 0xe

    const/4 v9, 0x4

    if-eq v5, v9, :cond_19

    and-int/lit8 v5, v28, 0x8

    move-object/from16 v14, p0

    if-eqz v5, :cond_18

    invoke-virtual {v8, v14}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_18

    goto :goto_f

    :cond_18
    const/4 v5, 0x0

    goto :goto_10

    :cond_19
    move-object/from16 v14, p0

    :goto_f
    const/4 v5, 0x1

    :goto_10
    or-int/2addr v5, v15

    invoke-virtual {v8}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v9

    move-object/from16 v15, v43

    if-nez v5, :cond_1b

    if-ne v9, v15, :cond_1a

    goto :goto_11

    :cond_1a
    move-object/from16 v10, v29

    goto :goto_12

    :cond_1b
    :goto_11
    new-instance v9, Lim1/a0;

    const/16 v5, 0xc

    move-object/from16 v10, v29

    move-object/from16 v12, v42

    invoke-direct {v9, v10, v14, v12, v5}, Lim1/a0;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    invoke-virtual {v8, v9}, Lp1/q;->p0(Ljava/lang/Object;)V

    :goto_12
    check-cast v9, Lc93/a;

    const/16 v12, 0x36

    const/16 v13, 0x68

    const/4 v5, 0x0

    move-object/from16 v24, v8

    const/4 v8, 0x0

    move-object/from16 v29, v10

    move-object v10, v9

    const/4 v9, 0x0

    move-object/from16 v11, v24

    move-object/from16 v44, v29

    invoke-static/range {v2 .. v13}, Lny0/u;->h(Landroidx/compose/ui/Modifier;Lny0/v;Ljava/lang/String;ZJLi2/t;ZLc93/a;Landroidx/compose/runtime/Composer;II)V

    move-object v8, v11

    const/4 v11, 0x1

    invoke-virtual {v8, v11}, Lp1/q;->q(Z)V

    invoke-virtual {v8, v11}, Lp1/q;->q(Z)V

    if-ne v0, v1, :cond_1c

    move v0, v11

    goto :goto_13

    :cond_1c
    const/4 v0, 0x0

    :goto_13
    invoke-virtual {v8}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    if-nez v0, :cond_1e

    if-ne v1, v15, :cond_1d

    goto :goto_14

    :cond_1d
    move-object/from16 v10, v44

    goto :goto_15

    :cond_1e
    :goto_14
    new-instance v1, Lif0/b;

    const/16 v0, 0x1c

    move-object/from16 v10, v44

    invoke-direct {v1, v10, v0}, Lif0/b;-><init>(Lkotlin/jvm/functions/Function1;I)V

    invoke-virtual {v8, v1}, Lp1/q;->p0(Ljava/lang/Object;)V

    :goto_15
    check-cast v1, Lc93/a;

    const/4 v0, 0x0

    invoke-static {v1, v0, v8, v0, v11}, Lio/sentry/config/a;->c(Lc93/a;ZLandroidx/compose/runtime/Composer;II)V

    move-object v3, v10

    goto :goto_16

    :cond_1f
    move-object v14, v1

    move-object v8, v11

    invoke-virtual {v8}, Lp1/q;->X()V

    :goto_16
    invoke-virtual {v8}, Lp1/q;->u()Lp1/v1;

    move-result-object v6

    if-eqz v6, :cond_20

    new-instance v0, Lio2/k0;

    const/4 v5, 0x6

    move/from16 v2, p3

    move/from16 v4, p4

    move-object v1, v14

    invoke-direct/range {v0 .. v5}, Lio2/k0;-><init>(Ljava/lang/Object;ILjava/lang/Object;II)V

    iput-object v0, v6, Lp1/v1;->d:Lc93/m;

    :cond_20
    return-void
.end method

.method private static final i(Lhp1/f;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final j(Lp1/c1;)I
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp1/c1;",
            ")I"
        }
    .end annotation

    invoke-interface {p0}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Number;

    invoke-virtual {p0}, Ljava/lang/Number;->intValue()I

    move-result p0

    return p0
.end method

.method private static final k(Lp1/c1;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp1/c1;",
            "I)V"
        }
    .end annotation

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-interface {p0, p1}, Lp1/c1;->setValue(Ljava/lang/Object;)V

    return-void
.end method

.method private static final l(Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 1

    sget-object v0, Lhp1/f$a;->a:Lhp1/f$a;

    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final m(Lp1/c1;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Ljp1/h;->k(Lp1/c1;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final n(I)Ll83/a0;
    .locals 0

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final o(Lkotlin/jvm/functions/Function1;Lhp1/e;Lp1/c1;)Ll83/a0;
    .locals 15

    new-instance v0, Lhp1/f$c;

    invoke-virtual/range {p1 .. p1}, Lhp1/e;->f()Lcom/whoop/hormonalinsights/postpartum/domain/models/HormonalScreenId;

    move-result-object v1

    new-instance v2, Lfp1/d;

    invoke-static/range {p2 .. p2}, Ljp1/h;->j(Lp1/c1;)I

    move-result v8

    const/16 v13, 0x3df

    const/4 v14, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    invoke-direct/range {v2 .. v14}, Lfp1/d;-><init>(Ljava/lang/String;Lfp1/b;Ljava/util/List;ZLjava/lang/String;ILjava/util/List;Ljava/util/List;Ljava/lang/String;Lcom/whoop/hormonalinsights/postpartum/domain/models/PostPartumScreenType;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-direct {v0, v1, v2}, Lhp1/f$c;-><init>(Lcom/whoop/hormonalinsights/postpartum/domain/models/HormonalScreenId;Lfp1/d;)V

    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final p(Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 1

    sget-object v0, Lhp1/f$a;->a:Lhp1/f$a;

    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final q(Lhp1/e;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, Lp1/x;->L(I)I

    move-result p2

    invoke-static {p0, p1, p4, p2, p3}, Ljp1/h;->h(Lhp1/e;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method
