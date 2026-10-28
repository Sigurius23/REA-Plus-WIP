.class public abstract Ljp1/m;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u001aC\u0010\u0008\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0014\u0008\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\u0014\u0008\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00040\u0002H\u0007\u00a2\u0006\u0004\u0008\u0008\u0010\t\u00a8\u0006\n"
    }
    d2 = {
        "Lhp1/j;",
        "viewState",
        "Lkotlin/Function1;",
        "Lyn1/a;",
        "Ll83/a0;",
        "onAnalyticEvent",
        "Lhp1/f;",
        "onViewEvent",
        "j",
        "(Lhp1/j;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V",
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
.method public static synthetic a(Lhp1/j;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p6}, Ljp1/m;->s(Lhp1/j;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Ljp1/m;->r(Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Lhp1/f;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Ljp1/m;->l(Lhp1/f;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Ljp1/m;->m(Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic e(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lp1/c1;)Ll83/a0;
    .locals 0

    invoke-static {p0, p2, p1}, Ljp1/m;->q(Lkotlin/jvm/functions/Function1;Lp1/c1;Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic f(Lp1/c1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Ljp1/m;->o(Lp1/c1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic g(Lhp1/j;Lp1/c1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Ljp1/m;->n(Lhp1/j;Lp1/c1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic h(Lyn1/a;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Ljp1/m;->k(Lyn1/a;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic i(Lkotlin/jvm/functions/Function1;Lp1/c1;Z)Ll83/a0;
    .locals 0

    invoke-static {p1, p0, p2}, Ljp1/m;->p(Lp1/c1;Lkotlin/jvm/functions/Function1;Z)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final j(Lhp1/j;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V
    .locals 42
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lhp1/j;",
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

    move-object/from16 v11, p3

    check-cast v11, Lp1/q;

    const v0, 0x39af45

    invoke-virtual {v11, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, v1, 0x6

    if-nez v0, :cond_2

    and-int/lit8 v0, v1, 0x8

    if-nez v0, :cond_0

    invoke-virtual {v11, v4}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v0

    goto :goto_0

    :cond_0
    invoke-virtual {v11, v4}, Lp1/q;->i(Ljava/lang/Object;)Z

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
    and-int/lit8 v5, p5, 0x2

    if-eqz v5, :cond_4

    or-int/lit8 v0, v0, 0x30

    :cond_3
    move-object/from16 v6, p1

    goto :goto_4

    :cond_4
    and-int/lit8 v6, v1, 0x30

    if-nez v6, :cond_3

    move-object/from16 v6, p1

    invoke-virtual {v11, v6}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_5

    const/16 v7, 0x20

    goto :goto_3

    :cond_5
    const/16 v7, 0x10

    :goto_3
    or-int/2addr v0, v7

    :goto_4
    and-int/lit8 v7, p5, 0x4

    if-eqz v7, :cond_7

    or-int/lit16 v0, v0, 0x180

    :cond_6
    move-object/from16 v8, p2

    goto :goto_6

    :cond_7
    and-int/lit16 v8, v1, 0x180

    if-nez v8, :cond_6

    move-object/from16 v8, p2

    invoke-virtual {v11, v8}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_8

    const/16 v9, 0x100

    goto :goto_5

    :cond_8
    const/16 v9, 0x80

    :goto_5
    or-int/2addr v0, v9

    :goto_6
    and-int/lit16 v9, v0, 0x93

    const/16 v10, 0x92

    const/4 v12, 0x0

    if-eq v9, v10, :cond_9

    const/4 v9, 0x1

    goto :goto_7

    :cond_9
    move v9, v12

    :goto_7
    and-int/lit8 v10, v0, 0x1

    invoke-virtual {v11, v10, v9}, Lp1/q;->U(IZ)Z

    move-result v9

    if-eqz v9, :cond_21

    sget-object v9, Lp1/l;->a:Lp1/v0;

    if-eqz v5, :cond_b

    invoke-virtual {v11}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    if-ne v5, v9, :cond_a

    new-instance v5, Ljg/c;

    const/16 v6, 0x16

    invoke-direct {v5, v6}, Ljg/c;-><init>(I)V

    invoke-virtual {v11, v5}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_a
    check-cast v5, Lkotlin/jvm/functions/Function1;

    goto :goto_8

    :cond_b
    move-object v5, v6

    :goto_8
    if-eqz v7, :cond_d

    invoke-virtual {v11}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v6

    if-ne v6, v9, :cond_c

    new-instance v6, Ljg/c;

    const/16 v7, 0x17

    invoke-direct {v6, v7}, Ljg/c;-><init>(I)V

    invoke-virtual {v11, v6}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_c
    check-cast v6, Lkotlin/jvm/functions/Function1;

    goto :goto_9

    :cond_d
    move-object v6, v8

    :goto_9
    invoke-virtual {v11}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v7

    if-ne v7, v9, :cond_e

    sget-object v7, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-static {v7}, Lp1/x;->z(Ljava/lang/Object;)Lp1/k1;

    move-result-object v7

    invoke-virtual {v11, v7}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_e
    check-cast v7, Lp1/c1;

    const/high16 v8, 0x3f800000    # 1.0f

    sget-object v10, Lb2/t;->w:Lb2/t;

    invoke-static {v8, v10}, Landroidx/compose/foundation/layout/d;->d(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v16

    invoke-static/range {v16 .. v16}, Lgb1/b0;->b0(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v16

    invoke-static/range {v16 .. v16}, Ll0/f;->n(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v8

    sget-object v14, Ll0/m;->c:Ll0/g;

    sget-object v2, Lb2/e;->M:Lb2/k;

    invoke-static {v14, v2, v11, v12}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v13

    iget-wide v3, v11, Lp1/q;->T:J

    invoke-static {v3, v4}, Ljava/lang/Long;->hashCode(J)I

    move-result v3

    invoke-virtual {v11}, Lp1/q;->m()Lp1/p1;

    move-result-object v4

    invoke-static {v11, v8}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v8

    sget-object v17, La3/l;->a:La3/k;

    invoke-virtual/range {v17 .. v17}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-object/from16 p2, v7

    sget-object v7, La3/k;->b:La3/j;

    invoke-virtual {v11}, Lp1/q;->i0()V

    iget-boolean v12, v11, Lp1/q;->S:Z

    if-eqz v12, :cond_f

    invoke-virtual {v11, v7}, Lp1/q;->l(Lc93/a;)V

    goto :goto_a

    :cond_f
    invoke-virtual {v11}, Lp1/q;->s0()V

    :goto_a
    sget-object v12, La3/k;->g:La3/i;

    invoke-static {v11, v12, v13}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v13, La3/k;->f:La3/i;

    invoke-static {v11, v13, v4}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v4, La3/k;->j:La3/i;

    iget-boolean v15, v11, Lp1/q;->S:Z

    if-nez v15, :cond_10

    invoke-virtual {v11}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v15

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-static {v15, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_11

    :cond_10
    invoke-static {v3, v11, v3, v4}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_11
    sget-object v1, La3/k;->d:La3/i;

    invoke-static {v11, v1, v8}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    move-object v3, v5

    invoke-virtual/range {p0 .. p0}, Lhp1/j;->b()Lcom/whoop/design/util/TextResource;

    move-result-object v5

    invoke-virtual/range {p0 .. p0}, Lhp1/j;->a()Lcom/whoop/design/util/TextResource;

    move-result-object v8

    and-int/lit16 v15, v0, 0x380

    move-object/from16 v19, v7

    const/16 v7, 0x100

    if-ne v15, v7, :cond_12

    const/16 v18, 0x1

    goto :goto_b

    :cond_12
    const/16 v18, 0x0

    :goto_b
    invoke-virtual {v11}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v7

    if-nez v18, :cond_14

    if-ne v7, v9, :cond_13

    goto :goto_c

    :cond_13
    move/from16 v33, v0

    goto :goto_d

    :cond_14
    :goto_c
    new-instance v7, Lif0/b;

    move/from16 v33, v0

    const/16 v0, 0x1d

    invoke-direct {v7, v6, v0}, Lif0/b;-><init>(Lkotlin/jvm/functions/Function1;I)V

    invoke-virtual {v11, v7}, Lp1/q;->p0(Ljava/lang/Object;)V

    :goto_d
    check-cast v7, Lc93/a;

    sget v0, Lcom/whoop/design/util/TextResource;->$stable:I

    shl-int/lit8 v18, v0, 0x3

    or-int v18, v0, v18

    move-object/from16 v21, v13

    const/16 v13, 0x1c

    move-object/from16 v22, v10

    move-object v10, v7

    const/4 v7, 0x0

    move-object/from16 v23, v6

    move-object v6, v8

    const/4 v8, 0x0

    move-object/from16 v24, v9

    const/4 v9, 0x0

    move-object/from16 v36, p2

    move-object/from16 v34, v3

    move-object/from16 v38, v12

    move/from16 v16, v15

    move/from16 v12, v18

    move-object/from16 v37, v19

    move-object/from16 v39, v21

    move-object/from16 v41, v22

    move-object/from16 v35, v23

    move-object/from16 v40, v24

    const/4 v3, 0x1

    const/high16 v15, 0x3f800000    # 1.0f

    const/16 v18, 0x100

    invoke-static/range {v5 .. v13}, Ljp1/q;->e(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;ILcom/whoop/design/util/TextResource;Lc93/a;Lc93/a;Landroidx/compose/runtime/Composer;II)V

    float-to-double v5, v15

    const-wide/16 v7, 0x0

    cmpl-double v5, v5, v7

    if-lez v5, :cond_15

    move v12, v3

    goto :goto_e

    :cond_15
    const/4 v12, 0x0

    :goto_e
    if-nez v12, :cond_16

    const-string v5, "invalid weight; must be greater than zero"

    invoke-static {v5}, Lm0/a;->a(Ljava/lang/String;)V

    :cond_16
    invoke-static {v15, v3, v11}, Ldc/b;->y(FZLp1/q;)V

    const/4 v5, 0x3

    int-to-float v5, v5

    const/16 v6, 0x8

    int-to-float v6, v6

    mul-float/2addr v6, v5

    move-object/from16 v7, v41

    invoke-static {v6, v7}, Landroidx/compose/foundation/layout/a;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v6

    const/4 v8, 0x0

    invoke-static {v14, v2, v11, v8}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v2

    iget-wide v8, v11, Lp1/q;->T:J

    invoke-static {v8, v9}, Ljava/lang/Long;->hashCode(J)I

    move-result v8

    invoke-virtual {v11}, Lp1/q;->m()Lp1/p1;

    move-result-object v9

    invoke-static {v11, v6}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v6

    invoke-virtual {v11}, Lp1/q;->i0()V

    iget-boolean v10, v11, Lp1/q;->S:Z

    if-eqz v10, :cond_17

    move-object/from16 v10, v37

    invoke-virtual {v11, v10}, Lp1/q;->l(Lc93/a;)V

    :goto_f
    move-object/from16 v10, v38

    goto :goto_10

    :cond_17
    invoke-virtual {v11}, Lp1/q;->s0()V

    goto :goto_f

    :goto_10
    invoke-static {v11, v10, v2}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    move-object/from16 v2, v39

    invoke-static {v11, v2, v9}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v2, v11, Lp1/q;->S:Z

    if-nez v2, :cond_18

    invoke-virtual {v11}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    invoke-static {v2, v9}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_19

    :cond_18
    invoke-static {v8, v11, v8, v4}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_19
    invoke-static {v11, v1, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual/range {p0 .. p0}, Lhp1/j;->f()Lcom/whoop/design/util/TextResource;

    move-result-object v1

    invoke-static {v1, v11, v0}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v1

    sget-object v2, Lx81/d;->a:Lx81/d;

    sget v4, Lx81/d;->b:I

    invoke-virtual {v2, v11, v4}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v6

    invoke-virtual {v6}, Ly81/i;->y()J

    move-result-wide v8

    invoke-virtual {v2, v11, v4}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v6

    invoke-virtual {v6}, Lb91/d;->N()Lb91/a;

    move-result-object v25

    sget v6, Lb91/a;->d:I

    shl-int/lit8 v29, v6, 0x12

    const v30, 0x2fffa

    const/4 v6, 0x0

    move-object/from16 v22, v7

    move-wide v7, v8

    const-wide/16 v9, 0x0

    move-object/from16 v27, v11

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    move/from16 v17, v15

    const-wide/16 v14, 0x0

    move/from16 v19, v16

    const/16 v16, 0x0

    move/from16 v20, v17

    const/16 v17, 0x0

    move/from16 v23, v18

    move/from16 v21, v19

    const-wide/16 v18, 0x0

    move/from16 v24, v20

    const/16 v20, 0x0

    move/from16 v26, v21

    const/16 v21, 0x0

    move-object/from16 v41, v22

    const/16 v22, 0x0

    move/from16 v28, v23

    const/16 v23, 0x0

    move/from16 v37, v24

    const/16 v24, 0x0

    move/from16 v38, v26

    const/16 v26, 0x0

    move/from16 v39, v28

    const/16 v28, 0x0

    move/from16 v37, v5

    move-object/from16 v3, v41

    move-object v5, v1

    move/from16 v1, v38

    invoke-static/range {v5 .. v30}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v11, v27

    const/4 v5, 0x2

    int-to-float v5, v5

    const/4 v6, 0x4

    int-to-float v6, v6

    mul-float/2addr v5, v6

    invoke-static {v5, v3}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v5

    invoke-static {v11, v5}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    invoke-virtual/range {p0 .. p0}, Lhp1/j;->e()Lcom/whoop/design/util/TextResource;

    move-result-object v5

    invoke-static {v5, v11, v0}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v2, v11, v4}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v7

    invoke-virtual {v7}, Ly81/i;->c1()J

    move-result-wide v7

    invoke-virtual {v2, v11, v4}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v9

    invoke-virtual {v9}, Lb91/d;->a()Lb91/a;

    move-result-object v25

    move v9, v6

    const/4 v6, 0x0

    move v12, v9

    const-wide/16 v9, 0x0

    const/4 v11, 0x0

    move v13, v12

    const/4 v12, 0x0

    move v14, v13

    const/4 v13, 0x0

    move/from16 v16, v14

    const-wide/16 v14, 0x0

    move/from16 v17, v16

    const/16 v16, 0x0

    move/from16 v18, v17

    const/16 v17, 0x0

    move/from16 v20, v18

    const-wide/16 v18, 0x0

    move/from16 v21, v20

    const/16 v20, 0x0

    move/from16 v22, v21

    const/16 v21, 0x0

    move/from16 v23, v22

    const/16 v22, 0x0

    move/from16 v24, v23

    const/16 v23, 0x0

    move/from16 v26, v24

    const/16 v24, 0x0

    move/from16 v31, v26

    const/16 v26, 0x0

    move/from16 v32, v1

    move/from16 v1, v31

    invoke-static/range {v5 .. v30}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v11, v27

    const/4 v5, 0x5

    int-to-float v5, v5

    mul-float/2addr v5, v1

    invoke-static {v5, v3}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v6

    invoke-static {v11, v6}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    sget-object v6, Lhy0/g;->DOTTED:Lhy0/g;

    const/16 v16, 0x30

    const/16 v17, 0xfd

    move v7, v5

    const/4 v5, 0x0

    move v8, v7

    const/4 v7, 0x0

    move v9, v8

    const/4 v8, 0x0

    move v10, v9

    const/4 v9, 0x0

    move v12, v10

    const-wide/16 v10, 0x0

    move v14, v12

    const-wide/16 v12, 0x0

    move v15, v14

    const/4 v14, 0x0

    move/from16 p2, v0

    move v0, v15

    move-object/from16 v15, v27

    invoke-static/range {v5 .. v17}, Lhy0/i2;->j(Landroidx/compose/ui/Modifier;Lhy0/g;Lhy0/f;Lcom/whoop/design/util/TextResource;Ljava/lang/Float;JJLb91/c;Landroidx/compose/runtime/Composer;II)V

    move-object v11, v15

    invoke-static {v0, v3}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    invoke-static {v11, v0}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    const/high16 v15, 0x3f800000    # 1.0f

    invoke-static {v15, v3}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v5

    mul-float v0, v37, v1

    invoke-static {v0}, Lt0/j;->e(F)Lt0/i;

    move-result-object v6

    const/4 v8, 0x0

    int-to-float v0, v8

    mul-float v10, v0, v1

    invoke-virtual {v2, v11, v4}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v0

    invoke-virtual {v0}, Ly81/i;->a1()J

    move-result-wide v7

    new-instance v0, Ljp1/k;

    const/4 v9, 0x0

    move-object/from16 v15, p0

    move-object/from16 v12, v34

    move-object/from16 v13, v36

    invoke-direct {v0, v15, v13, v12, v9}, Ljp1/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    const v9, -0x4c8fd5ec

    invoke-static {v9, v11, v0}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v0

    const v13, 0x1b0006

    const/16 v14, 0x18

    const/4 v9, 0x0

    move-object v15, v11

    move-object v11, v0

    move-object v0, v12

    move-object v12, v15

    move-object/from16 v15, v36

    invoke-static/range {v5 .. v14}, Le93/b;->b(Landroidx/compose/ui/Modifier;Li2/a1;JLf0/t;FLc93/m;Landroidx/compose/runtime/Composer;II)V

    move-object v11, v12

    const/16 v5, 0x11

    int-to-float v5, v5

    invoke-static {v5, v1, v3, v11}, Lih0/d0;->u(FFLb2/t;Lp1/q;)V

    sget-object v6, Lny0/v;->TextLarge:Lny0/v;

    invoke-virtual/range {p0 .. p0}, Lhp1/j;->c()Lcom/whoop/design/util/TextResource;

    move-result-object v1

    move/from16 v5, p2

    invoke-static {v1, v11, v5}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v2, v11, v4}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v1

    invoke-virtual {v1}, Ly81/i;->i0()J

    move-result-wide v9

    const/high16 v1, 0x3f800000    # 1.0f

    invoke-static {v1, v3}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v5

    move/from16 v1, v32

    const/16 v2, 0x100

    if-ne v1, v2, :cond_1a

    const/4 v12, 0x1

    goto :goto_11

    :cond_1a
    const/4 v12, 0x0

    :goto_11
    and-int/lit8 v3, v33, 0x70

    const/16 v4, 0x20

    if-ne v3, v4, :cond_1b

    const/4 v3, 0x1

    goto :goto_12

    :cond_1b
    const/4 v3, 0x0

    :goto_12
    or-int/2addr v3, v12

    invoke-virtual {v11}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    if-nez v3, :cond_1d

    move-object/from16 v3, v40

    if-ne v4, v3, :cond_1c

    goto :goto_13

    :cond_1c
    move-object/from16 v12, v35

    goto :goto_14

    :cond_1d
    move-object/from16 v3, v40

    :goto_13
    new-instance v4, Lim1/a0;

    const/16 v8, 0xd

    move-object/from16 v12, v35

    invoke-direct {v4, v12, v15, v0, v8}, Lim1/a0;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    invoke-virtual {v11, v4}, Lp1/q;->p0(Ljava/lang/Object;)V

    :goto_14
    move-object v13, v4

    check-cast v13, Lc93/a;

    const/16 v15, 0x36

    const/16 v16, 0x68

    const/4 v8, 0x0

    move-object/from16 v27, v11

    const/4 v11, 0x0

    move-object/from16 v35, v12

    const/4 v12, 0x0

    move-object/from16 v14, v27

    move-object/from16 v4, v35

    invoke-static/range {v5 .. v16}, Lny0/u;->h(Landroidx/compose/ui/Modifier;Lny0/v;Ljava/lang/String;ZJLi2/t;ZLc93/a;Landroidx/compose/runtime/Composer;II)V

    move-object v11, v14

    const/4 v5, 0x1

    invoke-virtual {v11, v5}, Lp1/q;->q(Z)V

    invoke-virtual {v11, v5}, Lp1/q;->q(Z)V

    if-ne v1, v2, :cond_1e

    const/4 v12, 0x1

    goto :goto_15

    :cond_1e
    const/4 v12, 0x0

    :goto_15
    invoke-virtual {v11}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    if-nez v12, :cond_1f

    if-ne v1, v3, :cond_20

    :cond_1f
    new-instance v1, Ljp1/l;

    const/4 v2, 0x0

    invoke-direct {v1, v4, v2}, Ljp1/l;-><init>(Lkotlin/jvm/functions/Function1;I)V

    invoke-virtual {v11, v1}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_20
    check-cast v1, Lc93/a;

    const/4 v3, 0x1

    const/4 v8, 0x0

    invoke-static {v1, v8, v11, v8, v3}, Lio/sentry/config/a;->c(Lc93/a;ZLandroidx/compose/runtime/Composer;II)V

    move-object v6, v0

    move-object v5, v4

    goto :goto_16

    :cond_21
    invoke-virtual {v11}, Lp1/q;->X()V

    move-object v5, v8

    :goto_16
    invoke-virtual {v11}, Lp1/q;->u()Lp1/v1;

    move-result-object v7

    if-eqz v7, :cond_22

    new-instance v0, Ljp1/d;

    const/4 v3, 0x1

    move-object/from16 v4, p0

    move/from16 v1, p4

    move/from16 v2, p5

    invoke-direct/range {v0 .. v6}, Ljp1/d;-><init>(IIILjava/lang/Object;Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)V

    iput-object v0, v7, Lp1/v1;->d:Lc93/m;

    :cond_22
    return-void
.end method

.method private static final k(Lyn1/a;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final l(Lhp1/f;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final m(Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 1

    sget-object v0, Lhp1/f$a;->a:Lhp1/f$a;

    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final n(Lhp1/j;Lp1/c1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 33

    and-int/lit8 v0, p4, 0x3

    const/4 v1, 0x0

    const/4 v2, 0x1

    const/4 v3, 0x2

    if-eq v0, v3, :cond_0

    move v0, v2

    goto :goto_0

    :cond_0
    move v0, v1

    :goto_0
    and-int/lit8 v4, p4, 0x1

    move-object/from16 v14, p3

    check-cast v14, Lp1/q;

    invoke-virtual {v14, v4, v0}, Lp1/q;->U(IZ)Z

    move-result v0

    if-eqz v0, :cond_8

    const/4 v0, 0x3

    int-to-float v0, v0

    const/16 v4, 0x8

    int-to-float v4, v4

    mul-float/2addr v0, v4

    sget-object v4, Lb2/t;->w:Lb2/t;

    invoke-static {v0, v4}, Landroidx/compose/foundation/layout/a;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    sget-object v5, Ll0/m;->c:Ll0/g;

    sget-object v6, Lb2/e;->M:Lb2/k;

    invoke-static {v5, v6, v14, v1}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v1

    iget-wide v5, v14, Lp1/q;->T:J

    invoke-static {v5, v6}, Ljava/lang/Long;->hashCode(J)I

    move-result v5

    invoke-virtual {v14}, Lp1/q;->m()Lp1/p1;

    move-result-object v6

    invoke-static {v14, v0}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    sget-object v7, La3/l;->a:La3/k;

    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v7, La3/k;->b:La3/j;

    invoke-virtual {v14}, Lp1/q;->i0()V

    iget-boolean v8, v14, Lp1/q;->S:Z

    if-eqz v8, :cond_1

    invoke-virtual {v14, v7}, Lp1/q;->l(Lc93/a;)V

    goto :goto_1

    :cond_1
    invoke-virtual {v14}, Lp1/q;->s0()V

    :goto_1
    sget-object v8, La3/k;->g:La3/i;

    invoke-static {v14, v8, v1}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v1, La3/k;->f:La3/i;

    invoke-static {v14, v1, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v6, La3/k;->j:La3/i;

    iget-boolean v9, v14, Lp1/q;->S:Z

    if-nez v9, :cond_2

    invoke-virtual {v14}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v9

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    invoke-static {v9, v10}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v9

    if-nez v9, :cond_3

    :cond_2
    invoke-static {v5, v14, v5, v6}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_3
    sget-object v5, La3/k;->d:La3/i;

    invoke-static {v14, v5, v0}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v0, Lb2/e;->K:Lb2/l;

    sget-object v9, Ll0/m;->a:Ll0/e;

    const/16 v10, 0x30

    invoke-static {v9, v0, v14, v10}, Ll0/p1;->a(Ll0/i;Lb2/g;Landroidx/compose/runtime/Composer;I)Ll0/r1;

    move-result-object v0

    iget-wide v9, v14, Lp1/q;->T:J

    invoke-static {v9, v10}, Ljava/lang/Long;->hashCode(J)I

    move-result v9

    invoke-virtual {v14}, Lp1/q;->m()Lp1/p1;

    move-result-object v10

    invoke-static {v14, v4}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v11

    invoke-virtual {v14}, Lp1/q;->i0()V

    iget-boolean v12, v14, Lp1/q;->S:Z

    if-eqz v12, :cond_4

    invoke-virtual {v14, v7}, Lp1/q;->l(Lc93/a;)V

    goto :goto_2

    :cond_4
    invoke-virtual {v14}, Lp1/q;->s0()V

    :goto_2
    invoke-static {v14, v8, v0}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v14, v1, v10}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v0, v14, Lp1/q;->S:Z

    if-nez v0, :cond_5

    invoke-virtual {v14}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v0

    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_6

    :cond_5
    invoke-static {v9, v14, v9, v6}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_6
    invoke-static {v14, v5, v11}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual/range {p0 .. p0}, Lhp1/j;->d()Lhp1/k;

    move-result-object v0

    invoke-virtual {v0}, Lhp1/k;->a()Lgz0/m0;

    move-result-object v0

    invoke-virtual {v0}, Lgz0/m0;->toWhoopIcon()I

    move-result v0

    const/4 v1, 0x6

    invoke-static {v0, v14, v1}, Lts/o;->S(ILandroidx/compose/runtime/Composer;I)Lo2/e;

    move-result-object v5

    int-to-float v0, v1

    const/4 v1, 0x4

    int-to-float v1, v1

    mul-float/2addr v0, v1

    invoke-static {v0, v4}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v7

    sget-object v0, Lx81/d;->a:Lx81/d;

    sget v13, Lx81/d;->b:I

    invoke-virtual {v0, v14, v13}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v6

    invoke-virtual {v6}, Ly81/i;->b1()J

    move-result-wide v8

    const/16 v11, 0x1b0

    const/4 v12, 0x0

    const/4 v6, 0x0

    move-object v10, v14

    invoke-static/range {v5 .. v12}, Lg1/f3;->b(Lo2/e;Ljava/lang/String;Landroidx/compose/ui/Modifier;JLandroidx/compose/runtime/Composer;II)V

    int-to-float v3, v3

    mul-float/2addr v3, v1

    invoke-static {v3, v4}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    invoke-static {v14, v1}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    invoke-virtual/range {p0 .. p0}, Lhp1/j;->d()Lhp1/k;

    move-result-object v1

    invoke-virtual {v1}, Lhp1/k;->b()Lcom/whoop/design/util/TextResource;

    move-result-object v1

    sget v5, Lcom/whoop/design/util/TextResource;->$stable:I

    invoke-static {v1, v14, v5}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v14, v13}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v6

    invoke-virtual {v6}, Ly81/i;->y()J

    move-result-wide v7

    invoke-virtual {v0, v14, v13}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v6

    invoke-virtual {v6}, Lb91/d;->a()Lb91/a;

    move-result-object v25

    sget v6, Lb91/a;->d:I

    shl-int/lit8 v29, v6, 0x12

    const v30, 0x2fffa

    const/4 v6, 0x0

    const-wide/16 v9, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    move v15, v13

    const/4 v13, 0x0

    move-object/from16 v27, v14

    move/from16 v16, v15

    const-wide/16 v14, 0x0

    move/from16 v17, v16

    const/16 v16, 0x0

    move/from16 v18, v17

    const/16 v17, 0x0

    move/from16 v20, v18

    const-wide/16 v18, 0x0

    move/from16 v21, v20

    const/16 v20, 0x0

    move/from16 v22, v21

    const/16 v21, 0x0

    move/from16 v23, v22

    const/16 v22, 0x0

    move/from16 v24, v23

    const/16 v23, 0x0

    move/from16 v26, v24

    const/16 v24, 0x0

    move/from16 v28, v26

    const/16 v26, 0x0

    move/from16 v31, v28

    const/16 v28, 0x0

    move/from16 v32, v5

    move-object v5, v1

    move/from16 v1, v31

    invoke-static/range {v5 .. v30}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v14, v27

    const/high16 v5, 0x3f800000    # 1.0f

    float-to-double v6, v5

    const-wide/16 v8, 0x0

    cmpl-double v6, v6, v8

    if-lez v6, :cond_7

    goto :goto_3

    :cond_7
    const-string v6, "invalid weight; must be greater than zero"

    invoke-static {v6}, Lm0/a;->a(Ljava/lang/String;)V

    :goto_3
    invoke-static {v5, v2, v14}, Ldc/b;->y(FZLp1/q;)V

    invoke-virtual {v0, v14, v1}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v5

    invoke-virtual {v5}, Ly81/i;->a()J

    move-result-wide v7

    new-instance v5, Lcom/whoop/profile/view/f;

    const/4 v6, 0x2

    move-object/from16 v9, p1

    move-object/from16 v10, p2

    invoke-direct {v5, v9, v10, v6}, Lcom/whoop/profile/view/f;-><init>(Lp1/c1;Lkotlin/jvm/functions/Function1;I)V

    const v6, -0x42c9376b

    invoke-static {v6, v14, v5}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v13

    const/16 v15, 0x6000

    const/16 v16, 0xd

    const-wide/16 v5, 0x0

    const-wide/16 v9, 0x0

    const-wide/16 v11, 0x0

    invoke-static/range {v5 .. v16}, Ly81/c;->b(JJJJLc93/m;Landroidx/compose/runtime/Composer;II)V

    invoke-static {v14, v2, v4, v3, v14}, Lhc3/i;->r(Lp1/q;ZLb2/t;FLp1/q;)V

    invoke-virtual/range {p0 .. p0}, Lhp1/j;->d()Lhp1/k;

    move-result-object v3

    invoke-virtual {v3}, Lhp1/k;->c()Lcom/whoop/design/util/TextResource;

    move-result-object v3

    move/from16 v4, v32

    invoke-static {v3, v14, v4}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v0, v14, v1}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v3

    invoke-virtual {v3}, Ly81/i;->c1()J

    move-result-wide v7

    invoke-virtual {v0, v14, v1}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v0

    invoke-virtual {v0}, Lb91/d;->c()Lb91/a;

    move-result-object v25

    const/16 v28, 0x0

    const v30, 0x2fffa

    const/4 v6, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    move-object/from16 v27, v14

    const-wide/16 v14, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const-wide/16 v18, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v26, 0x0

    invoke-static/range {v5 .. v30}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v14, v27

    invoke-virtual {v14, v2}, Lp1/q;->q(Z)V

    goto :goto_4

    :cond_8
    invoke-virtual {v14}, Lp1/q;->X()V

    :goto_4
    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method

.method private static final o(Lp1/c1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 12

    and-int/lit8 v0, p3, 0x3

    const/4 v1, 0x2

    const/4 v2, 0x1

    if-eq v0, v1, :cond_0

    move v0, v2

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    and-int/2addr p3, v2

    move-object v9, p2

    check-cast v9, Lp1/q;

    invoke-virtual {v9, p3, v0}, Lp1/q;->U(IZ)Z

    move-result p2

    if-eqz p2, :cond_3

    invoke-interface {p0}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Ljava/lang/Boolean;

    invoke-virtual {p2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v2

    invoke-virtual {v9, p1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result p2

    invoke-virtual {v9}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object p3

    if-nez p2, :cond_1

    sget-object p2, Lp1/l;->a:Lp1/v0;

    if-ne p3, p2, :cond_2

    :cond_1
    new-instance p3, Lb30/r;

    const/16 p2, 0x11

    invoke-direct {p3, p0, p1, p2}, Lb30/r;-><init>(Lp1/c1;Lkotlin/jvm/functions/Function1;I)V

    invoke-virtual {v9, p3}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_2
    move-object v8, p3

    check-cast v8, Lkotlin/jvm/functions/Function1;

    const/4 v10, 0x0

    const/16 v11, 0x3d

    const/4 v1, 0x0

    const/4 v3, 0x0

    const-wide/16 v4, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-static/range {v1 .. v11}, Lpz0/d;->e(Landroidx/compose/ui/Modifier;ZZJLpz0/e;Li2/t;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    goto :goto_1

    :cond_3
    invoke-virtual {v9}, Lp1/q;->X()V

    :goto_1
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final p(Lp1/c1;Lkotlin/jvm/functions/Function1;Z)Ll83/a0;
    .locals 1

    invoke-static {p2}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v0

    invoke-interface {p0, v0}, Lp1/c1;->setValue(Ljava/lang/Object;)V

    new-instance p0, Lyn1/a$f;

    invoke-direct {p0, p2}, Lyn1/a$f;-><init>(Z)V

    invoke-interface {p1, p0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final q(Lkotlin/jvm/functions/Function1;Lp1/c1;Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 1

    new-instance v0, Lhp1/f$e;

    invoke-interface {p1}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Ljava/lang/Boolean;

    invoke-virtual {p1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p1

    invoke-direct {v0, p1}, Lhp1/f$e;-><init>(Z)V

    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Lyn1/a$p;->a:Lyn1/a$p;

    invoke-interface {p2, p0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final r(Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 1

    sget-object v0, Lhp1/f$a;->a:Lhp1/f$a;

    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final s(Lhp1/j;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 6

    or-int/lit8 p3, p3, 0x1

    invoke-static {p3}, Lp1/x;->L(I)I

    move-result v4

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move v5, p4

    move-object v3, p5

    invoke-static/range {v0 .. v5}, Ljp1/m;->j(Lhp1/j;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method
