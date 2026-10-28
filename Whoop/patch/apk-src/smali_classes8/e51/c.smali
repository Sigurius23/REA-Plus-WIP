.class public abstract Le51/c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Le51/c$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u001a7\u0010\u0008\u001a\u00020\u00062\u0008\u0008\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0014\u0008\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0007\u00a2\u0006\u0004\u0008\u0008\u0010\t\u00a8\u0006\n"
    }
    d2 = {
        "Landroidx/compose/ui/Modifier;",
        "modifier",
        "Le51/e;",
        "state",
        "Lkotlin/Function1;",
        "",
        "Ll83/a0;",
        "onViewEvent",
        "e",
        "(Landroidx/compose/ui/Modifier;Le51/e;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V",
        "design_release"
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
.method public static synthetic a(Landroidx/compose/ui/Modifier;Le51/e;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p6}, Le51/c;->i(Landroidx/compose/ui/Modifier;Le51/e;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lp31/j;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Le51/c;->g(Lp31/j;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Landroidx/compose/ui/Modifier;Lm91/u;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/Modifier;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Le51/c;->h(Landroidx/compose/ui/Modifier;Lm91/u;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/Modifier;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Ljava/lang/Object;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Le51/c;->f(Ljava/lang/Object;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final e(Landroidx/compose/ui/Modifier;Le51/e;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V
    .locals 30
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/ui/Modifier;",
            "Le51/e;",
            "Lkotlin/jvm/functions/Function1;",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    move-object/from16 v5, p1

    move/from16 v1, p4

    const-string v0, "state"

    invoke-static {v5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v10, p3

    check-cast v10, Lp1/q;

    const v0, 0x4ee5e38a

    invoke-virtual {v10, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, p5, 0x1

    if-eqz v0, :cond_0

    or-int/lit8 v4, v1, 0x6

    move v6, v4

    move-object/from16 v4, p0

    goto :goto_1

    :cond_0
    and-int/lit8 v4, v1, 0x6

    if-nez v4, :cond_2

    move-object/from16 v4, p0

    invoke-virtual {v10, v4}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_1

    const/4 v6, 0x4

    goto :goto_0

    :cond_1
    const/4 v6, 0x2

    :goto_0
    or-int/2addr v6, v1

    goto :goto_1

    :cond_2
    move-object/from16 v4, p0

    move v6, v1

    :goto_1
    and-int/lit8 v7, v1, 0x30

    if-nez v7, :cond_4

    invoke-virtual {v10, v5}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_3

    const/16 v7, 0x20

    goto :goto_2

    :cond_3
    const/16 v7, 0x10

    :goto_2
    or-int/2addr v6, v7

    :cond_4
    and-int/lit8 v7, p5, 0x4

    if-eqz v7, :cond_6

    or-int/lit16 v6, v6, 0x180

    :cond_5
    move-object/from16 v8, p2

    :goto_3
    move v12, v6

    goto :goto_5

    :cond_6
    and-int/lit16 v8, v1, 0x180

    if-nez v8, :cond_5

    move-object/from16 v8, p2

    invoke-virtual {v10, v8}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_7

    const/16 v9, 0x100

    goto :goto_4

    :cond_7
    const/16 v9, 0x80

    :goto_4
    or-int/2addr v6, v9

    goto :goto_3

    :goto_5
    and-int/lit16 v6, v12, 0x93

    const/16 v9, 0x92

    const/4 v13, 0x0

    if-eq v6, v9, :cond_8

    const/4 v6, 0x1

    goto :goto_6

    :cond_8
    move v6, v13

    :goto_6
    and-int/lit8 v9, v12, 0x1

    invoke-virtual {v10, v9, v6}, Lp1/q;->U(IZ)Z

    move-result v6

    if-eqz v6, :cond_1a

    sget-object v15, Lb2/t;->w:Lb2/t;

    if-eqz v0, :cond_9

    move-object/from16 v16, v15

    goto :goto_7

    :cond_9
    move-object/from16 v16, v4

    :goto_7
    sget-object v0, Lp1/l;->a:Lp1/v0;

    if-eqz v7, :cond_b

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    if-ne v4, v0, :cond_a

    new-instance v4, Ldo0/c;

    const/16 v6, 0x19

    invoke-direct {v4, v6}, Ldo0/c;-><init>(I)V

    invoke-virtual {v10, v4}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_a
    check-cast v4, Lkotlin/jvm/functions/Function1;

    goto :goto_8

    :cond_b
    move-object v4, v8

    :goto_8
    invoke-virtual {v5}, Le51/e;->c()Lp31/p$a;

    move-result-object v6

    if-eqz v6, :cond_c

    invoke-virtual {v6}, Lp31/p$a;->i()Lcom/whoop/design/util/TextResource;

    move-result-object v7

    :goto_9
    invoke-static {v7}, Lcom/whoop/design/util/b;->d(Lcom/whoop/design/util/TextResource;)Z

    move-result v7

    move/from16 v22, v7

    goto :goto_a

    :cond_c
    invoke-virtual {v5}, Le51/e;->h()Lcom/whoop/design/util/TextResource;

    move-result-object v7

    goto :goto_9

    :goto_a
    invoke-virtual {v5}, Le51/e;->f()F

    move-result v17

    invoke-virtual {v5}, Le51/e;->j()F

    move-result v19

    const/16 v20, 0x0

    const/16 v21, 0xa

    const/16 v18, 0x0

    invoke-static/range {v16 .. v21}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v7

    move-object/from16 v19, v16

    sget-object v8, Ll0/m;->c:Ll0/g;

    sget-object v9, Lb2/e;->M:Lb2/k;

    invoke-static {v8, v9, v10, v13}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v8

    move-object/from16 p0, v4

    iget-wide v3, v10, Lp1/q;->T:J

    invoke-static {v3, v4}, Ljava/lang/Long;->hashCode(J)I

    move-result v3

    invoke-virtual {v10}, Lp1/q;->m()Lp1/p1;

    move-result-object v4

    invoke-static {v10, v7}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v7

    sget-object v11, La3/l;->a:La3/k;

    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v11, La3/k;->b:La3/j;

    invoke-virtual {v10}, Lp1/q;->i0()V

    iget-boolean v14, v10, Lp1/q;->S:Z

    if-eqz v14, :cond_d

    invoke-virtual {v10, v11}, Lp1/q;->l(Lc93/a;)V

    goto :goto_b

    :cond_d
    invoke-virtual {v10}, Lp1/q;->s0()V

    :goto_b
    sget-object v14, La3/k;->g:La3/i;

    invoke-static {v10, v14, v8}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v8, La3/k;->f:La3/i;

    invoke-static {v10, v8, v4}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v4, La3/k;->j:La3/i;

    iget-boolean v2, v10, Lp1/q;->S:Z

    if-nez v2, :cond_e

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v13

    invoke-static {v2, v13}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_f

    :cond_e
    invoke-static {v3, v10, v3, v4}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_f
    sget-object v2, La3/k;->d:La3/i;

    invoke-static {v10, v2, v7}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const/high16 v3, 0x3f800000    # 1.0f

    if-eqz v6, :cond_11

    invoke-virtual {v6}, Lp31/p$a;->i()Lcom/whoop/design/util/TextResource;

    move-result-object v7

    invoke-static {v7}, Lcom/whoop/design/util/b;->d(Lcom/whoop/design/util/TextResource;)Z

    move-result v7

    if-eqz v7, :cond_11

    const v7, -0x47d04473

    invoke-virtual {v10, v7}, Lp1/q;->e0(I)V

    invoke-static {v3, v15}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v7

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v13

    if-ne v13, v0, :cond_10

    new-instance v13, Ldo0/c;

    const/16 v0, 0x1a

    invoke-direct {v13, v0}, Ldo0/c;-><init>(I)V

    invoke-virtual {v10, v13}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_10
    check-cast v13, Lkotlin/jvm/functions/Function1;

    move-object v0, v9

    move-object v9, v10

    const/16 v10, 0x1b0

    move-object/from16 v18, v11

    const/4 v11, 0x0

    move-object/from16 v29, v13

    move-object v13, v8

    move-object/from16 v8, v29

    invoke-static/range {v6 .. v11}, Lp31/n;->p(Lp31/p;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    const/4 v6, 0x0

    invoke-virtual {v9, v6}, Lp1/q;->q(Z)V

    move-object/from16 v21, v2

    move-object/from16 v23, v4

    move v4, v6

    move/from16 v25, v12

    move-object v2, v13

    move-object v5, v14

    move-object v3, v15

    move-object/from16 v1, v18

    goto/16 :goto_c

    :cond_11
    move-object v7, v6

    move-object v13, v8

    move-object v0, v9

    move-object v9, v10

    move-object/from16 v18, v11

    const/4 v6, 0x0

    if-nez v7, :cond_12

    invoke-virtual {v5}, Le51/e;->h()Lcom/whoop/design/util/TextResource;

    move-result-object v7

    invoke-static {v7}, Lcom/whoop/design/util/b;->d(Lcom/whoop/design/util/TextResource;)Z

    move-result v7

    if-eqz v7, :cond_12

    const v7, -0x47cc7776

    invoke-virtual {v9, v7}, Lp1/q;->e0(I)V

    move-object v10, v9

    invoke-virtual {v5}, Le51/e;->h()Lcom/whoop/design/util/TextResource;

    move-result-object v9

    move-object v7, v15

    invoke-virtual {v5}, Le51/e;->i()Lb91/c;

    move-result-object v15

    const/16 v17, 0x0

    move-object/from16 v8, v18

    const/16 v18, 0x77

    move v11, v6

    const/4 v6, 0x0

    move-object/from16 v21, v7

    const/4 v7, 0x0

    move-object/from16 v23, v8

    const/4 v8, 0x0

    move-object/from16 v16, v10

    const/16 v24, 0x1

    const/4 v10, 0x0

    move/from16 v26, v11

    move/from16 v25, v12

    const-wide/16 v11, 0x0

    move-object/from16 v28, v13

    move-object/from16 v27, v14

    const-wide/16 v13, 0x0

    move-object/from16 v3, v21

    move-object/from16 v1, v23

    move-object/from16 v5, v27

    move-object/from16 v21, v2

    move-object/from16 v23, v4

    move/from16 v4, v26

    move-object/from16 v2, v28

    invoke-static/range {v6 .. v18}, Lhy0/i2;->j(Landroidx/compose/ui/Modifier;Lhy0/g;Lhy0/f;Lcom/whoop/design/util/TextResource;Ljava/lang/Float;JJLb91/c;Landroidx/compose/runtime/Composer;II)V

    move-object/from16 v9, v16

    invoke-virtual {v9, v4}, Lp1/q;->q(Z)V

    goto :goto_c

    :cond_12
    move-object/from16 v21, v2

    move-object/from16 v23, v4

    move v4, v6

    move/from16 v25, v12

    move-object v2, v13

    move-object v5, v14

    move-object v3, v15

    move-object/from16 v1, v18

    const v6, -0x47c9e912

    invoke-virtual {v9, v6}, Lp1/q;->e0(I)V

    invoke-virtual {v9, v4}, Lp1/q;->q(Z)V

    :goto_c
    if-eqz v22, :cond_13

    invoke-virtual/range {p1 .. p1}, Le51/e;->e()Ljava/util/List;

    move-result-object v6

    check-cast v6, Ljava/util/Collection;

    invoke-interface {v6}, Ljava/util/Collection;->isEmpty()Z

    move-result v6

    if-nez v6, :cond_13

    const v6, -0x47c9016b

    invoke-virtual {v9, v6}, Lp1/q;->e0(I)V

    invoke-static {}, Le51/f;->b()F

    move-result v6

    invoke-static {v6, v3}, Landroidx/compose/foundation/layout/d;->h(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v6

    invoke-static {v9, v6}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    invoke-virtual {v9, v4}, Lp1/q;->q(Z)V

    goto :goto_d

    :cond_13
    const v6, -0x47c7b352

    invoke-virtual {v9, v6}, Lp1/q;->e0(I)V

    invoke-virtual {v9, v4}, Lp1/q;->q(Z)V

    :goto_d
    invoke-virtual/range {p1 .. p1}, Le51/e;->g()Le51/d;

    move-result-object v6

    invoke-virtual {v6}, Le51/d;->getSpacing-D9Ej5fM()F

    move-result v6

    invoke-static {v6}, Ll0/m;->i(F)Ll0/k;

    move-result-object v6

    invoke-static {v6, v0, v9, v4}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v0

    iget-wide v6, v9, Lp1/q;->T:J

    invoke-static {v6, v7}, Ljava/lang/Long;->hashCode(J)I

    move-result v6

    invoke-virtual {v9}, Lp1/q;->m()Lp1/p1;

    move-result-object v7

    invoke-static {v9, v3}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v8

    invoke-virtual {v9}, Lp1/q;->i0()V

    iget-boolean v10, v9, Lp1/q;->S:Z

    if-eqz v10, :cond_14

    invoke-virtual {v9, v1}, Lp1/q;->l(Lc93/a;)V

    goto :goto_e

    :cond_14
    invoke-virtual {v9}, Lp1/q;->s0()V

    :goto_e
    invoke-static {v9, v5, v0}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v9, v2, v7}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v0, v9, Lp1/q;->S:Z

    if-nez v0, :cond_15

    invoke-virtual {v9}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v0

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_16

    :cond_15
    move-object/from16 v0, v23

    goto :goto_10

    :cond_16
    :goto_f
    move-object/from16 v0, v21

    goto :goto_11

    :goto_10
    invoke-static {v6, v9, v6, v0}, Ld;->y(ILp1/q;ILa3/i;)V

    goto :goto_f

    :goto_11
    invoke-static {v9, v0, v8}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const v0, -0x73c45a82

    invoke-virtual {v9, v0}, Lp1/q;->e0(I)V

    invoke-virtual/range {p1 .. p1}, Le51/e;->e()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_12
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_19

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    move-object v6, v1

    check-cast v6, Lm91/u;

    invoke-static {v6}, Lv41/g0;->h(Lm91/u;)Lv41/f0;

    move-result-object v1

    sget-object v2, Le51/c$a;->a:[I

    invoke-virtual {v1}, Ljava/lang/Enum;->ordinal()I

    move-result v1

    aget v1, v2, v1

    const/4 v2, 0x3

    const/4 v5, 0x1

    if-eq v1, v5, :cond_18

    const/4 v7, 0x2

    if-ne v1, v7, :cond_17

    const v1, -0x2b8d5630

    invoke-virtual {v9, v1}, Lp1/q;->e0(I)V

    const/high16 v1, 0x3f800000    # 1.0f

    invoke-static {v1, v3}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v7

    int-to-float v8, v2

    const/4 v13, 0x4

    int-to-float v10, v13

    invoke-static {v7, v8, v10}, Lih0/d0;->e(Landroidx/compose/ui/Modifier;FF)Landroidx/compose/ui/Modifier;

    move-result-object v7

    sget-object v8, Lx81/d;->a:Lx81/d;

    const/4 v10, 0x6

    invoke-virtual {v8, v9, v10}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v8

    invoke-virtual {v8}, Ly81/i;->W0()J

    move-result-wide v10

    sget-object v8, Li2/w0;->a:Li2/v0;

    invoke-static {v7, v10, v11, v8}, Landroidx/compose/foundation/a;->c(Landroidx/compose/ui/Modifier;JLi2/a1;)Landroidx/compose/ui/Modifier;

    move-result-object v7

    const/4 v14, 0x2

    int-to-float v8, v14

    const/16 v10, 0x8

    int-to-float v10, v10

    mul-float/2addr v8, v10

    invoke-static {v8, v7}, Landroidx/compose/foundation/layout/a;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v15

    invoke-virtual {v9, v4}, Lp1/q;->q(Z)V

    goto :goto_13

    :cond_17
    const v0, -0x2b8d84dc

    invoke-static {v0, v9, v4}, Ldc/b;->v(ILp1/q;Z)Lkotlin/NoWhenBranchMatchedException;

    move-result-object v0

    throw v0

    :cond_18
    const/high16 v1, 0x3f800000    # 1.0f

    const/4 v13, 0x4

    const/4 v14, 0x2

    const v7, -0x2b8d7bdc

    invoke-virtual {v9, v7}, Lp1/q;->e0(I)V

    invoke-virtual {v9, v4}, Lp1/q;->q(Z)V

    move-object v15, v3

    :goto_13
    new-instance v8, Law0/a;

    const/4 v7, 0x3

    invoke-direct {v8, v7, v15}, Law0/a;-><init>(ILandroidx/compose/ui/Modifier;)V

    shl-int/lit8 v2, v25, 0x3

    and-int/lit16 v11, v2, 0x1c00

    const/4 v12, 0x2

    const/4 v7, 0x0

    move-object v10, v9

    move-object/from16 v9, p0

    invoke-static/range {v6 .. v12}, Lm91/l;->r(Lm91/u;Lm91/p;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    move-object v9, v10

    goto :goto_12

    :cond_19
    const/4 v5, 0x1

    move-object/from16 v8, p0

    invoke-static {v9, v4, v5, v5}, Lm4/a;->y(Lp1/q;ZZZ)V

    move-object/from16 v4, v19

    :goto_14
    move-object v6, v8

    goto :goto_15

    :cond_1a
    move-object v9, v10

    invoke-virtual {v9}, Lp1/q;->X()V

    goto :goto_14

    :goto_15
    invoke-virtual {v9}, Lp1/q;->u()Lp1/v1;

    move-result-object v7

    if-eqz v7, :cond_1b

    new-instance v0, Le11/b;

    const/4 v3, 0x3

    move-object/from16 v5, p1

    move/from16 v1, p4

    move/from16 v2, p5

    invoke-direct/range {v0 .. v6}, Le11/b;-><init>(IIILjava/lang/Object;Ljava/lang/Object;Ll83/e;)V

    iput-object v0, v7, Lp1/v1;->d:Lc93/m;

    :cond_1b
    return-void
.end method

.method private static final f(Ljava/lang/Object;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final g(Lp31/j;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final h(Landroidx/compose/ui/Modifier;Lm91/u;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/Modifier;
    .locals 0

    const-string p3, "it"

    invoke-static {p1, p3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p2, Lp1/q;

    const p1, 0x2f2d0a4c

    invoke-virtual {p2, p1}, Lp1/q;->e0(I)V

    const/4 p1, 0x0

    invoke-virtual {p2, p1}, Lp1/q;->q(Z)V

    return-object p0
.end method

.method private static final i(Landroidx/compose/ui/Modifier;Le51/e;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 6

    or-int/lit8 p3, p3, 0x1

    invoke-static {p3}, Lp1/x;->L(I)I

    move-result v4

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move v5, p4

    move-object v3, p5

    invoke-static/range {v0 .. v5}, Le51/c;->e(Landroidx/compose/ui/Modifier;Le51/e;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method
