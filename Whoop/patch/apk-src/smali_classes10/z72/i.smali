.class public abstract Lz72/i;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u001a+\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0007\u00a2\u0006\u0004\u0008\u0006\u0010\u0007\u00a8\u0006\u0008"
    }
    d2 = {
        "Lx72/a;",
        "section",
        "Lkotlin/Function1;",
        "",
        "Ll83/a0;",
        "onViewEvent",
        "h",
        "(Lx72/a;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V",
        "sanguine_release"
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
.method public static synthetic a(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;
    .locals 0

    invoke-static {p0}, Lz72/i;->i(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Ljava/lang/Object;Lm91/u;Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 0

    invoke-static {p1, p2, p0}, Lz72/i;->n(Lm91/u;Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;
    .locals 0

    invoke-static {p0}, Lz72/i;->m(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Lx72/a;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Lz72/i;->o(Lx72/a;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic e(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;
    .locals 0

    invoke-static {p0}, Lz72/i;->j(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic f(Lhy0/h0;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/Modifier;
    .locals 0

    invoke-static {p0, p1, p2}, Lz72/i;->k(Lhy0/h0;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/Modifier;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic g(Lm91/u;Lm91/u;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/Modifier;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lz72/i;->l(Lm91/u;Lm91/u;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/Modifier;

    move-result-object p0

    return-object p0
.end method

.method public static final h(Lx72/a;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V
    .locals 47
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lx72/a;",
            "Lkotlin/jvm/functions/Function1;",
            "Landroidx/compose/runtime/Composer;",
            "I)V"
        }
    .end annotation

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    const-string v3, "section"

    invoke-static {v0, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v3, "onViewEvent"

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v8, p2

    check-cast v8, Lp1/q;

    const v3, 0x50f910cc

    invoke-virtual {v8, v3}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v3, p3, 0x6

    if-nez v3, :cond_1

    invoke-virtual {v8, v0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    const/4 v3, 0x4

    goto :goto_0

    :cond_0
    const/4 v3, 0x2

    :goto_0
    or-int v3, p3, v3

    goto :goto_1

    :cond_1
    move/from16 v3, p3

    :goto_1
    and-int/lit8 v4, p3, 0x30

    if-nez v4, :cond_3

    invoke-virtual {v8, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_2

    const/16 v4, 0x20

    goto :goto_2

    :cond_2
    const/16 v4, 0x10

    :goto_2
    or-int/2addr v3, v4

    :cond_3
    and-int/lit8 v4, v3, 0x13

    const/16 v7, 0x12

    const/4 v10, 0x0

    if-eq v4, v7, :cond_4

    const/4 v4, 0x1

    goto :goto_3

    :cond_4
    move v4, v10

    :goto_3
    and-int/lit8 v11, v3, 0x1

    invoke-virtual {v8, v11, v4}, Lp1/q;->U(IZ)Z

    move-result v4

    if-eqz v4, :cond_19

    invoke-virtual {v0}, Lx72/a;->b()Ljava/util/List;

    move-result-object v4

    check-cast v4, Ljava/lang/Iterable;

    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :cond_5
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v11

    if-eqz v11, :cond_6

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v11

    move-object v12, v11

    check-cast v12, Lm91/u;

    instance-of v12, v12, Lh51/f;

    if-eqz v12, :cond_5

    goto :goto_4

    :cond_6
    const/4 v11, 0x0

    :goto_4
    if-eqz v11, :cond_7

    const/4 v4, 0x1

    goto :goto_5

    :cond_7
    move v4, v10

    :goto_5
    const/high16 v11, 0x3f800000    # 1.0f

    sget-object v12, Lb2/t;->w:Lb2/t;

    invoke-static {v11, v12}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v11

    sget-object v13, Ll0/m;->c:Ll0/g;

    sget-object v14, Lb2/e;->M:Lb2/k;

    invoke-static {v13, v14, v8, v10}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v13

    iget-wide v5, v8, Lp1/q;->T:J

    invoke-static {v5, v6}, Ljava/lang/Long;->hashCode(J)I

    move-result v5

    invoke-virtual {v8}, Lp1/q;->m()Lp1/p1;

    move-result-object v6

    invoke-static {v8, v11}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v11

    sget-object v15, La3/l;->a:La3/k;

    invoke-virtual {v15}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v15, La3/k;->b:La3/j;

    invoke-virtual {v8}, Lp1/q;->i0()V

    move/from16 v19, v7

    iget-boolean v7, v8, Lp1/q;->S:Z

    if-eqz v7, :cond_8

    invoke-virtual {v8, v15}, Lp1/q;->l(Lc93/a;)V

    goto :goto_6

    :cond_8
    invoke-virtual {v8}, Lp1/q;->s0()V

    :goto_6
    sget-object v7, La3/k;->g:La3/i;

    invoke-static {v8, v7, v13}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v13, La3/k;->f:La3/i;

    invoke-static {v8, v13, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v6, La3/k;->j:La3/i;

    iget-boolean v9, v8, Lp1/q;->S:Z

    if-nez v9, :cond_9

    invoke-virtual {v8}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v9

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    invoke-static {v9, v10}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v9

    if-nez v9, :cond_a

    :cond_9
    invoke-static {v5, v8, v5, v6}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_a
    sget-object v5, La3/k;->d:La3/i;

    invoke-static {v8, v5, v11}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual {v0}, Lx72/a;->c()Ljava/lang/String;

    move-result-object v9

    sget-object v11, Lp1/l;->a:Lp1/v0;

    if-nez v9, :cond_b

    const v9, 0x5ad72e1d

    invoke-virtual {v8, v9}, Lp1/q;->e0(I)V

    const/4 v9, 0x0

    invoke-virtual {v8, v9}, Lp1/q;->q(Z)V

    move/from16 v30, v3

    move v3, v4

    move-object/from16 v46, v5

    move-object/from16 v45, v6

    move-object/from16 v33, v7

    move v2, v9

    move-object v1, v11

    move-object v0, v12

    move-object/from16 v44, v13

    move-object/from16 v35, v14

    move-object/from16 v41, v15

    move/from16 v37, v19

    goto/16 :goto_7

    :cond_b
    const/16 v21, 0x0

    const v10, 0x5ad72e1e

    invoke-virtual {v8, v10}, Lp1/q;->e0(I)V

    sget-object v10, Lx81/d;->a:Lx81/d;

    move/from16 v30, v3

    sget v3, Lx81/d;->b:I

    invoke-virtual {v10, v8, v3}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v16

    invoke-virtual/range {v16 .. v16}, Lb91/d;->O()Lb91/a;

    move-result-object v24

    invoke-virtual {v10, v8, v3}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v3

    invoke-virtual {v3}, Ly81/i;->y()J

    move-result-wide v25

    const/4 v3, 0x1

    int-to-float v10, v3

    move-object/from16 v22, v5

    const/16 v3, 0x8

    int-to-float v5, v3

    mul-float v16, v10, v5

    const/16 v17, 0x7

    move-object v5, v13

    const/4 v13, 0x0

    move-object v10, v14

    const/4 v14, 0x0

    move-object/from16 v23, v15

    const/4 v15, 0x0

    invoke-static/range {v12 .. v17}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v13

    invoke-virtual {v8}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v14

    if-ne v14, v11, :cond_c

    new-instance v14, Lz72/f;

    const/4 v15, 0x3

    invoke-direct {v14, v15}, Lz72/f;-><init>(I)V

    invoke-virtual {v8, v14}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_c
    check-cast v14, Lkotlin/jvm/functions/Function1;

    invoke-static {v13, v4, v14}, Lgb1/d;->b(Landroidx/compose/ui/Modifier;ZLkotlin/jvm/functions/Function1;)Landroidx/compose/ui/Modifier;

    move-result-object v13

    sget v14, Lb91/a;->d:I

    shl-int/lit8 v28, v14, 0x12

    const v29, 0x2fff8

    move v14, v4

    move-object/from16 v16, v6

    move-object v15, v7

    move-object v4, v9

    move-wide/from16 v6, v25

    move-object/from16 v26, v8

    const-wide/16 v8, 0x0

    move-object/from16 v17, v10

    const/4 v10, 0x0

    move-object/from16 v25, v11

    const/4 v11, 0x0

    move-object/from16 v27, v12

    const/4 v12, 0x0

    move-object/from16 v32, v5

    move-object v5, v13

    move/from16 v31, v14

    const-wide/16 v13, 0x0

    move-object/from16 v33, v15

    const/4 v15, 0x0

    move-object/from16 v34, v16

    const/16 v16, 0x0

    move-object/from16 v35, v17

    const/16 v36, 0x20

    const-wide/16 v17, 0x0

    move/from16 v37, v19

    const/16 v19, 0x0

    const/16 v38, 0x1

    const/16 v20, 0x0

    move/from16 v39, v21

    const/16 v21, 0x0

    move-object/from16 v40, v22

    const/16 v22, 0x0

    move-object/from16 v41, v23

    const/16 v23, 0x0

    move-object/from16 v42, v25

    const/16 v25, 0x0

    move-object/from16 v43, v27

    const/16 v27, 0x0

    move/from16 v3, v31

    move-object/from16 v44, v32

    move-object/from16 v45, v34

    move/from16 v2, v39

    move-object/from16 v46, v40

    move-object/from16 v1, v42

    move-object/from16 v0, v43

    invoke-static/range {v4 .. v29}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v8, v26

    invoke-virtual {v8, v2}, Lp1/q;->q(Z)V

    :goto_7
    invoke-virtual/range {p0 .. p0}, Lx72/a;->a()Ljava/lang/String;

    move-result-object v4

    if-nez v4, :cond_d

    const v3, 0x5adea537

    invoke-virtual {v8, v3}, Lp1/q;->e0(I)V

    invoke-virtual {v8, v2}, Lp1/q;->q(Z)V

    goto :goto_8

    :cond_d
    const v5, 0x5adea538

    invoke-virtual {v8, v5}, Lp1/q;->e0(I)V

    sget-object v5, Lx81/d;->a:Lx81/d;

    sget v6, Lx81/d;->b:I

    invoke-virtual {v5, v8, v6}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v7

    invoke-virtual {v7}, Lb91/d;->a()Lb91/a;

    move-result-object v24

    invoke-virtual {v5, v8, v6}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v5

    invoke-virtual {v5}, Ly81/i;->c1()J

    move-result-wide v6

    invoke-virtual {v8}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    if-ne v5, v1, :cond_e

    new-instance v5, Lz72/f;

    const/4 v9, 0x4

    invoke-direct {v5, v9}, Lz72/f;-><init>(I)V

    invoke-virtual {v8, v5}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_e
    check-cast v5, Lkotlin/jvm/functions/Function1;

    invoke-static {v0, v3, v5}, Lgb1/d;->b(Landroidx/compose/ui/Modifier;ZLkotlin/jvm/functions/Function1;)Landroidx/compose/ui/Modifier;

    move-result-object v5

    sget v3, Lb91/a;->d:I

    shl-int/lit8 v28, v3, 0x12

    const v29, 0x2fff8

    move-object/from16 v26, v8

    const-wide/16 v8, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const-wide/16 v13, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const-wide/16 v17, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v25, 0x0

    const/16 v27, 0x0

    invoke-static/range {v4 .. v29}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v8, v26

    invoke-virtual {v8, v2}, Lp1/q;->q(Z)V

    :goto_8
    invoke-virtual/range {p0 .. p0}, Lx72/a;->c()Ljava/lang/String;

    move-result-object v3

    if-nez v3, :cond_10

    invoke-virtual/range {p0 .. p0}, Lx72/a;->a()Ljava/lang/String;

    move-result-object v3

    if-eqz v3, :cond_f

    goto :goto_a

    :cond_f
    const v3, 0x5ae5c560

    invoke-virtual {v8, v3}, Lp1/q;->e0(I)V

    invoke-virtual {v8, v2}, Lp1/q;->q(Z)V

    :goto_9
    const/16 v3, 0x8

    goto :goto_b

    :cond_10
    :goto_a
    const v3, 0x5ae5022c

    invoke-virtual {v8, v3}, Lp1/q;->e0(I)V

    const/16 v3, 0x10

    int-to-float v3, v3

    invoke-static {v0, v3, v8, v2}, Lm4/a;->v(Lb2/t;FLp1/q;Z)V

    goto :goto_9

    :goto_b
    int-to-float v3, v3

    invoke-static {v3}, Ll0/m;->i(F)Ll0/k;

    move-result-object v3

    const/4 v4, 0x6

    move-object/from16 v10, v35

    invoke-static {v3, v10, v8, v4}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v3

    iget-wide v4, v8, Lp1/q;->T:J

    invoke-static {v4, v5}, Ljava/lang/Long;->hashCode(J)I

    move-result v4

    invoke-virtual {v8}, Lp1/q;->m()Lp1/p1;

    move-result-object v5

    invoke-static {v8, v0}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    invoke-virtual {v8}, Lp1/q;->i0()V

    iget-boolean v6, v8, Lp1/q;->S:Z

    if-eqz v6, :cond_11

    move-object/from16 v6, v41

    invoke-virtual {v8, v6}, Lp1/q;->l(Lc93/a;)V

    :goto_c
    move-object/from16 v15, v33

    goto :goto_d

    :cond_11
    invoke-virtual {v8}, Lp1/q;->s0()V

    goto :goto_c

    :goto_d
    invoke-static {v8, v15, v3}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    move-object/from16 v3, v44

    invoke-static {v8, v3, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v3, v8, Lp1/q;->S:Z

    if-nez v3, :cond_12

    invoke-virtual {v8}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-static {v3, v5}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_13

    :cond_12
    move-object/from16 v3, v45

    goto :goto_f

    :cond_13
    :goto_e
    move-object/from16 v3, v46

    goto :goto_10

    :goto_f
    invoke-static {v4, v8, v4, v3}, Ld;->y(ILp1/q;ILa3/i;)V

    goto :goto_e

    :goto_10
    invoke-static {v8, v3, v0}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const v0, 0x7fc67217

    invoke-virtual {v8, v0}, Lp1/q;->e0(I)V

    invoke-virtual/range {p0 .. p0}, Lx72/a;->b()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_11
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_18

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    move-object v4, v3

    check-cast v4, Lm91/u;

    instance-of v3, v4, Lhy0/h0;

    if-eqz v3, :cond_14

    const v3, -0x7124f104

    invoke-virtual {v8, v3}, Lp1/q;->e0(I)V

    new-instance v6, Lvx0/a;

    const/16 v3, 0x1b

    invoke-direct {v6, v3}, Lvx0/a;-><init>(I)V

    const/4 v9, 0x0

    const/16 v10, 0xa

    const/4 v5, 0x0

    const/4 v7, 0x0

    invoke-static/range {v4 .. v10}, Lm91/l;->r(Lm91/u;Lm91/p;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    invoke-virtual {v8, v2}, Lp1/q;->q(Z)V

    move-object/from16 v12, p1

    const/16 v11, 0x20

    goto :goto_11

    :cond_14
    const v3, -0x7121a615

    invoke-virtual {v8, v3}, Lp1/q;->e0(I)V

    invoke-static {}, Ly72/a;->h()Lm91/p;

    move-result-object v5

    new-instance v6, Lej1/u;

    const/4 v3, 0x7

    invoke-direct {v6, v3, v4}, Lej1/u;-><init>(ILm91/u;)V

    invoke-virtual {v8, v4}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v3

    and-int/lit8 v7, v30, 0x70

    const/16 v11, 0x20

    if-ne v7, v11, :cond_15

    const/4 v9, 0x1

    goto :goto_12

    :cond_15
    move v9, v2

    :goto_12
    or-int/2addr v3, v9

    invoke-virtual {v8}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v7

    if-nez v3, :cond_17

    if-ne v7, v1, :cond_16

    goto :goto_13

    :cond_16
    move-object/from16 v12, p1

    goto :goto_14

    :cond_17
    :goto_13
    new-instance v7, Luf0/f;

    const/4 v3, 0x7

    move-object/from16 v12, p1

    invoke-direct {v7, v4, v12, v3}, Luf0/f;-><init>(Lm91/u;Lkotlin/jvm/functions/Function1;I)V

    invoke-virtual {v8, v7}, Lp1/q;->p0(Ljava/lang/Object;)V

    :goto_14
    check-cast v7, Lkotlin/jvm/functions/Function1;

    sget v3, Lm91/p;->b:I

    shl-int/lit8 v9, v3, 0x3

    const/4 v10, 0x0

    invoke-static/range {v4 .. v10}, Lm91/l;->r(Lm91/u;Lm91/p;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    invoke-virtual {v8, v2}, Lp1/q;->q(Z)V

    goto :goto_11

    :cond_18
    move-object/from16 v12, p1

    const/4 v3, 0x1

    invoke-static {v8, v2, v3, v3}, Lm4/a;->y(Lp1/q;ZZZ)V

    goto :goto_15

    :cond_19
    move-object v12, v1

    invoke-virtual {v8}, Lp1/q;->X()V

    :goto_15
    invoke-virtual {v8}, Lp1/q;->u()Lp1/v1;

    move-result-object v0

    if-eqz v0, :cond_1a

    new-instance v1, Lyf1/e;

    const/16 v2, 0xd

    move-object/from16 v3, p0

    move/from16 v4, p3

    invoke-direct {v1, v3, v12, v4, v2}, Lyf1/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;II)V

    iput-object v1, v0, Lp1/v1;->d:Lc93/m;

    :cond_1a
    return-void
.end method

.method private static final i(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;
    .locals 3

    const-string v0, "$this$applyIf"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 v0, 0x10

    int-to-float v0, v0

    const/4 v1, 0x0

    const/4 v2, 0x2

    invoke-static {p0, v0, v1, v2}, Landroidx/compose/foundation/layout/a;->r(Landroidx/compose/ui/Modifier;FFI)Landroidx/compose/ui/Modifier;

    move-result-object p0

    return-object p0
.end method

.method private static final j(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;
    .locals 3

    const-string v0, "$this$applyIf"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 v0, 0x10

    int-to-float v0, v0

    const/4 v1, 0x0

    const/4 v2, 0x2

    invoke-static {p0, v0, v1, v2}, Landroidx/compose/foundation/layout/a;->r(Landroidx/compose/ui/Modifier;FFI)Landroidx/compose/ui/Modifier;

    move-result-object p0

    return-object p0
.end method

.method private static final k(Lhy0/h0;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/Modifier;
    .locals 1

    const-string p2, "it"

    invoke-static {p0, p2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Lp1/q;

    const p0, 0x489db403

    invoke-virtual {p1, p0}, Lp1/q;->e0(I)V

    const/high16 p0, 0x3f800000    # 1.0f

    sget-object p2, Lb2/t;->w:Lb2/t;

    invoke-static {p0, p2}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object p2

    const/4 v0, 0x0

    invoke-static {p2, v0, p0}, Landroidx/compose/foundation/layout/a;->f(Landroidx/compose/ui/Modifier;ZF)Landroidx/compose/ui/Modifier;

    move-result-object p0

    invoke-virtual {p1, v0}, Lp1/q;->q(Z)V

    return-object p0
.end method

.method private static final l(Lm91/u;Lm91/u;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/Modifier;
    .locals 0

    const-string p3, "it"

    invoke-static {p1, p3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p2, Lp1/q;

    const p1, 0x23efdcb

    invoke-virtual {p2, p1}, Lp1/q;->e0(I)V

    instance-of p0, p0, Lhy0/e;

    invoke-virtual {p2}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object p1

    sget-object p3, Lp1/l;->a:Lp1/v0;

    if-ne p1, p3, :cond_0

    new-instance p1, Lz72/f;

    const/4 p3, 0x5

    invoke-direct {p1, p3}, Lz72/f;-><init>(I)V

    invoke-virtual {p2, p1}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_0
    check-cast p1, Lkotlin/jvm/functions/Function1;

    sget-object p3, Lb2/t;->w:Lb2/t;

    invoke-static {p3, p0, p1}, Lgb1/d;->b(Landroidx/compose/ui/Modifier;ZLkotlin/jvm/functions/Function1;)Landroidx/compose/ui/Modifier;

    move-result-object p0

    const/4 p1, 0x0

    invoke-virtual {p2, p1}, Lp1/q;->q(Z)V

    return-object p0
.end method

.method private static final m(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;
    .locals 3

    const-string v0, "$this$applyIf"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 p0, 0x10

    int-to-float p0, p0

    const/4 v0, 0x1

    sget-object v1, Lb2/t;->w:Lb2/t;

    const/4 v2, 0x0

    invoke-static {v1, v2, p0, v0}, Landroidx/compose/foundation/layout/a;->r(Landroidx/compose/ui/Modifier;FFI)Landroidx/compose/ui/Modifier;

    move-result-object p0

    return-object p0
.end method

.method private static final n(Lm91/u;Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p0, Ld11/i;

    if-eqz v0, :cond_0

    invoke-interface {p1, p0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_0
    instance-of v0, p0, Lb01/i;

    if-eqz v0, :cond_1

    check-cast p0, Lb01/i;

    invoke-virtual {p0}, Lb01/i;->e()Lb01/d;

    move-result-object p0

    invoke-interface {p1, p0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_1
    invoke-interface {p1, p2}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :goto_0
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final o(Lx72/a;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, Lp1/x;->L(I)I

    move-result p2

    invoke-static {p0, p1, p3, p2}, Lz72/i;->h(Lx72/a;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method
