.class public abstract Lqn0/e;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000:\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u001aG\u0010\n\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0008\u0012\u0004\u0012\u00020\u00060\u0004H\u0001\u00a2\u0006\u0004\u0008\n\u0010\u000b\u001a\u001b\u0010\u000f\u001a\u00020\u0006*\u00020\u000c2\u0006\u0010\u000e\u001a\u00020\rH\u0003\u00a2\u0006\u0004\u0008\u000f\u0010\u0010\u001a\u001d\u0010\u0014\u001a\u00020\u0011*\u00020\u00112\u0008\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0002\u00a2\u0006\u0004\u0008\u0014\u0010\u0015\u00a8\u0006\u0016"
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
        "d",
        "(Lmn0/c;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V",
        "Ll0/u;",
        "Ly3/f;",
        "shadowHeight",
        "g",
        "(Ll0/u;FLandroidx/compose/runtime/Composer;I)V",
        "Landroidx/compose/ui/Modifier;",
        "Ljn0/d;",
        "joinChallengeState",
        "i",
        "(Landroidx/compose/ui/Modifier;Ljn0/d;)Landroidx/compose/ui/Modifier;",
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
.method public static synthetic a(Ljava/lang/String;Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 0

    invoke-static {p1, p0}, Lqn0/e;->e(Lkotlin/jvm/functions/Function1;Ljava/lang/String;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lmn0/c;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p6}, Lqn0/e;->f(Lmn0/c;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Ll0/u;FILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Lqn0/e;->h(Ll0/u;FILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final d(Lmn0/c;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V
    .locals 28
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lmn0/c;",
            "Ljava/lang/String;",
            "Lkotlin/jvm/functions/Function1;",
            "Lkotlin/jvm/functions/Function1;",
            "Landroidx/compose/runtime/Composer;",
            "I)V"
        }
    .end annotation

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move-object/from16 v4, p3

    move/from16 v0, p5

    const-string v5, "viewState"

    invoke-static {v1, v5}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v5, "name"

    invoke-static {v2, v5}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v5, "onViewEvent"

    invoke-static {v3, v5}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v5, "onNavigationEvent"

    invoke-static {v4, v5}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v10, p4

    check-cast v10, Lp1/q;

    const v5, -0x656b7ed9

    invoke-virtual {v10, v5}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v5, v0, 0x6

    const/4 v6, 0x4

    if-nez v5, :cond_1

    invoke-virtual {v10, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_0

    move v5, v6

    goto :goto_0

    :cond_0
    const/4 v5, 0x2

    :goto_0
    or-int/2addr v5, v0

    goto :goto_1

    :cond_1
    move v5, v0

    :goto_1
    and-int/lit8 v7, v0, 0x30

    if-nez v7, :cond_3

    invoke-virtual {v10, v2}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_2

    const/16 v7, 0x20

    goto :goto_2

    :cond_2
    const/16 v7, 0x10

    :goto_2
    or-int/2addr v5, v7

    :cond_3
    and-int/lit16 v7, v0, 0x180

    if-nez v7, :cond_5

    invoke-virtual {v10, v3}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_4

    const/16 v7, 0x100

    goto :goto_3

    :cond_4
    const/16 v7, 0x80

    :goto_3
    or-int/2addr v5, v7

    :cond_5
    and-int/lit16 v7, v0, 0xc00

    if-nez v7, :cond_7

    invoke-virtual {v10, v4}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_6

    const/16 v7, 0x800

    goto :goto_4

    :cond_6
    const/16 v7, 0x400

    :goto_4
    or-int/2addr v5, v7

    :cond_7
    and-int/lit16 v7, v5, 0x493

    const/16 v8, 0x492

    const/4 v9, 0x0

    if-eq v7, v8, :cond_8

    const/4 v7, 0x1

    goto :goto_5

    :cond_8
    move v7, v9

    :goto_5
    and-int/lit8 v8, v5, 0x1

    invoke-virtual {v10, v8, v7}, Lp1/q;->U(IZ)Z

    move-result v7

    if-eqz v7, :cond_1a

    invoke-virtual {v1}, Lmn0/c;->a()Lnn0/a;

    move-result-object v19

    if-nez v19, :cond_9

    const v5, -0x5859bdfe

    invoke-virtual {v10, v5}, Lp1/q;->e0(I)V

    invoke-virtual {v10, v9}, Lp1/q;->q(Z)V

    move-object v5, v2

    goto/16 :goto_11

    :cond_9
    const v7, -0x5859bdfd

    invoke-virtual {v10, v7}, Lp1/q;->e0(I)V

    const/16 v7, 0xb

    int-to-float v7, v7

    int-to-float v6, v6

    mul-float/2addr v7, v6

    sget-object v6, Lb2/t;->w:Lb2/t;

    invoke-static {v6}, Lgb1/b0;->b0(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v8

    const/high16 v11, 0x3f800000    # 1.0f

    invoke-static {v11, v8}, Landroidx/compose/foundation/layout/d;->d(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v20

    const/4 v8, 0x5

    int-to-float v8, v8

    const/16 v12, 0x8

    int-to-float v12, v12

    mul-float v24, v8, v12

    const/16 v25, 0x7

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    invoke-static/range {v20 .. v25}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v8

    move/from16 v26, v24

    invoke-virtual {v1}, Lmn0/c;->b()Ljn0/d;

    move-result-object v13

    invoke-static {v8, v13}, Lqn0/e;->i(Landroidx/compose/ui/Modifier;Ljn0/d;)Landroidx/compose/ui/Modifier;

    move-result-object v8

    sget-object v13, Ll0/m;->c:Ll0/g;

    sget-object v14, Lb2/e;->M:Lb2/k;

    invoke-static {v13, v14, v10, v9}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v15

    move/from16 v21, v12

    iget-wide v11, v10, Lp1/q;->T:J

    invoke-static {v11, v12}, Ljava/lang/Long;->hashCode(J)I

    move-result v11

    invoke-virtual {v10}, Lp1/q;->m()Lp1/p1;

    move-result-object v12

    invoke-static {v10, v8}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v8

    sget-object v22, La3/l;->a:La3/k;

    invoke-virtual/range {v22 .. v22}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v9, La3/k;->b:La3/j;

    invoke-virtual {v10}, Lp1/q;->i0()V

    iget-boolean v0, v10, Lp1/q;->S:Z

    if-eqz v0, :cond_a

    invoke-virtual {v10, v9}, Lp1/q;->l(Lc93/a;)V

    goto :goto_6

    :cond_a
    invoke-virtual {v10}, Lp1/q;->s0()V

    :goto_6
    sget-object v0, La3/k;->g:La3/i;

    invoke-static {v10, v0, v15}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v15, La3/k;->f:La3/i;

    invoke-static {v10, v15, v12}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v12, La3/k;->j:La3/i;

    iget-boolean v1, v10, Lp1/q;->S:Z

    if-nez v1, :cond_b

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-static {v1, v4}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_c

    :cond_b
    invoke-static {v11, v10, v11, v12}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_c
    sget-object v1, La3/k;->d:La3/i;

    invoke-static {v10, v1, v8}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    move v11, v7

    const/high16 v4, 0x3f800000    # 1.0f

    float-to-double v7, v4

    const-wide/16 v23, 0x0

    cmpl-double v7, v7, v23

    if-lez v7, :cond_d

    goto :goto_7

    :cond_d
    const-string v7, "invalid weight; must be greater than zero"

    invoke-static {v7}, Lm0/a;->a(Ljava/lang/String;)V

    :goto_7
    new-instance v7, Landroidx/compose/foundation/layout/LayoutWeightElement;

    const v8, 0x7f7fffff    # Float.MAX_VALUE

    cmpl-float v20, v4, v8

    if-lez v20, :cond_e

    :goto_8
    const/4 v4, 0x1

    goto :goto_9

    :cond_e
    move v8, v4

    goto :goto_8

    :goto_9
    invoke-direct {v7, v8, v4}, Landroidx/compose/foundation/layout/LayoutWeightElement;-><init>(FZ)V

    sget-object v4, Lb2/e;->w:Lb2/m;

    const/4 v8, 0x0

    invoke-static {v4, v8}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v4

    iget-wide v2, v10, Lp1/q;->T:J

    invoke-static {v2, v3}, Ljava/lang/Long;->hashCode(J)I

    move-result v2

    invoke-virtual {v10}, Lp1/q;->m()Lp1/p1;

    move-result-object v3

    invoke-static {v10, v7}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v7

    invoke-virtual {v10}, Lp1/q;->i0()V

    iget-boolean v8, v10, Lp1/q;->S:Z

    if-eqz v8, :cond_f

    invoke-virtual {v10, v9}, Lp1/q;->l(Lc93/a;)V

    goto :goto_a

    :cond_f
    invoke-virtual {v10}, Lp1/q;->s0()V

    :goto_a
    invoke-static {v10, v0, v4}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v10, v15, v3}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v3, v10, Lp1/q;->S:Z

    if-nez v3, :cond_10

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-static {v3, v4}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_11

    :cond_10
    invoke-static {v2, v10, v2, v12}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_11
    invoke-static {v10, v1, v7}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const/4 v4, 0x1

    const/4 v8, 0x0

    invoke-static {v8, v10, v4}, Lq83/g;->U(ILandroidx/compose/runtime/Composer;I)Lf0/r1;

    move-result-object v2

    const/16 v3, 0xe

    invoke-static {v6, v2, v3}, Lq83/g;->f0(Landroidx/compose/ui/Modifier;Lf0/r1;I)Landroidx/compose/ui/Modifier;

    move-result-object v3

    invoke-static {v13, v14, v10, v8}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v7

    iget-wide v13, v10, Lp1/q;->T:J

    invoke-static {v13, v14}, Ljava/lang/Long;->hashCode(J)I

    move-result v13

    invoke-virtual {v10}, Lp1/q;->m()Lp1/p1;

    move-result-object v14

    invoke-static {v10, v3}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    invoke-virtual {v10}, Lp1/q;->i0()V

    iget-boolean v4, v10, Lp1/q;->S:Z

    if-eqz v4, :cond_12

    invoke-virtual {v10, v9}, Lp1/q;->l(Lc93/a;)V

    goto :goto_b

    :cond_12
    invoke-virtual {v10}, Lp1/q;->s0()V

    :goto_b
    invoke-static {v10, v0, v7}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v10, v15, v14}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v0, v10, Lp1/q;->S:Z

    if-nez v0, :cond_13

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v0

    invoke-static {v13}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-static {v0, v4}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_14

    :cond_13
    invoke-static {v13, v10, v13, v12}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_14
    invoke-static {v10, v1, v3}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    move-object v0, v6

    invoke-virtual/range {v19 .. v19}, Lnn0/a;->f()Lkd1/o;

    move-result-object v6

    invoke-virtual/range {v19 .. v19}, Lnn0/a;->b()Lcom/whoop/design/util/TextResource;

    move-result-object v7

    move/from16 v22, v8

    invoke-virtual/range {v19 .. v19}, Lnn0/a;->g()Lcom/whoop/design/util/TextResource;

    move-result-object v8

    sget v1, Lkd1/o;->a:I

    sget v3, Lcom/whoop/design/util/TextResource;->$stable:I

    shl-int/lit8 v4, v3, 0x3

    or-int/2addr v1, v4

    shl-int/lit8 v23, v3, 0x6

    or-int v1, v1, v23

    move-object v12, v0

    move-object v9, v2

    move v0, v11

    move/from16 v2, v22

    move v11, v1

    const/high16 v1, 0x3f800000    # 1.0f

    invoke-static/range {v6 .. v11}, Lqn0/h;->d(Lkd1/o;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lf0/r1;Landroidx/compose/runtime/Composer;I)V

    move-object/from16 v20, v9

    invoke-virtual/range {v19 .. v19}, Lnn0/a;->a()Ljava/util/List;

    move-result-object v6

    invoke-static {v6, v10, v2}, Lqn0/a;->c(Ljava/util/List;Landroidx/compose/runtime/Composer;I)V

    const-wide/high16 v6, 0x4004000000000000L    # 2.5

    double-to-float v6, v6

    mul-float v6, v6, v21

    invoke-static {v6, v12}, Landroidx/compose/foundation/layout/a;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v6

    const/16 v7, 0x100

    const/16 v17, 0x6

    const/4 v8, 0x1

    const/16 v18, 0xfe

    move v9, v7

    const/4 v7, 0x0

    move v11, v8

    const/4 v8, 0x0

    move v13, v9

    const/4 v9, 0x0

    move-object v15, v10

    const/4 v10, 0x0

    move v14, v11

    move-object/from16 v21, v12

    const-wide/16 v11, 0x0

    move/from16 v22, v13

    move/from16 v24, v14

    const-wide/16 v13, 0x0

    move-object/from16 v16, v15

    const/16 v25, 0x20

    const/4 v15, 0x0

    move-object/from16 v27, v21

    move/from16 v2, v24

    invoke-static/range {v6 .. v18}, Lhy0/i2;->j(Landroidx/compose/ui/Modifier;Lhy0/g;Lhy0/f;Lcom/whoop/design/util/TextResource;Ljava/lang/Float;JJLb91/c;Landroidx/compose/runtime/Composer;II)V

    move-object/from16 v10, v16

    invoke-virtual/range {v19 .. v19}, Lnn0/a;->e()Lcom/whoop/design/util/TextResource;

    move-result-object v6

    invoke-virtual/range {v19 .. v19}, Lnn0/a;->d()Lcom/whoop/design/util/TextResource;

    move-result-object v7

    or-int/lit16 v8, v3, 0x180

    or-int/2addr v4, v8

    invoke-static {v6, v7, v0, v10, v4}, Lqn0/b;->b(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;FLandroidx/compose/runtime/Composer;I)V

    invoke-virtual {v10, v2}, Lp1/q;->q(Z)V

    invoke-virtual/range {v19 .. v19}, Lnn0/a;->i()Lcom/whoop/design/util/TextResource;

    move-result-object v6

    const/4 v4, 0x6

    or-int v4, v4, v23

    and-int/lit16 v7, v5, 0x1c00

    or-int v9, v4, v7

    sget-object v4, Landroidx/compose/foundation/layout/b;->a:Landroidx/compose/foundation/layout/b;

    move-object/from16 v7, p3

    move-object v8, v10

    move v10, v5

    move-object/from16 v5, v20

    invoke-static/range {v4 .. v9}, Lqn0/l;->c(Ll0/u;Lf0/r1;Lcom/whoop/design/util/TextResource;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    move-object v15, v8

    const/16 v5, 0x36

    invoke-static {v4, v0, v15, v5}, Lqn0/e;->g(Ll0/u;FLandroidx/compose/runtime/Composer;I)V

    invoke-virtual {v15, v2}, Lp1/q;->q(Z)V

    move-object/from16 v12, v27

    invoke-static {v1, v12}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    const/4 v1, 0x0

    move/from16 v8, v26

    const/4 v4, 0x2

    invoke-static {v0, v8, v1, v4}, Landroidx/compose/foundation/layout/a;->r(Landroidx/compose/ui/Modifier;FFI)Landroidx/compose/ui/Modifier;

    move-result-object v0

    sget-object v1, Lb2/e;->N:Lb2/k;

    invoke-static {v1, v0}, Lev/n;->g(Lb2/k;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v6

    sget-object v7, Lny0/v;->TextLarge:Lny0/v;

    invoke-virtual/range {v19 .. v19}, Lnn0/a;->c()Lcom/whoop/design/util/TextResource;

    move-result-object v0

    invoke-static {v0, v15, v3}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v8

    invoke-virtual/range {v19 .. v19}, Lnn0/a;->j()Z

    move-result v9

    invoke-virtual/range {v19 .. v19}, Lnn0/a;->j()Z

    move-result v0

    if-eqz v0, :cond_15

    const v0, -0x6824552a

    invoke-virtual {v15, v0}, Lp1/q;->e0(I)V

    invoke-virtual/range {v19 .. v19}, Lnn0/a;->h()Lcom/whoop/challengedetails/domain/models/ChallengeDetailsStyle;

    move-result-object v0

    invoke-virtual {v0}, Lcom/whoop/challengedetails/domain/models/ChallengeDetailsStyle;->getColor()Ly81/f;

    move-result-object v0

    const/4 v1, 0x0

    invoke-virtual {v0, v15, v1}, Ly81/f;->toComposableColor-WaAFU9c(Landroidx/compose/runtime/Composer;I)J

    move-result-wide v3

    invoke-virtual {v15, v1}, Lp1/q;->q(Z)V

    goto :goto_c

    :cond_15
    const/4 v1, 0x0

    const v0, -0x68231c23

    invoke-virtual {v15, v0}, Lp1/q;->e0(I)V

    sget-object v0, Lx81/d;->a:Lx81/d;

    sget v3, Lx81/d;->b:I

    invoke-static {v0, v15, v3, v1}, Lr80/c;->D(Lx81/d;Lp1/q;IZ)J

    move-result-wide v3

    :goto_c
    and-int/lit16 v0, v10, 0x380

    const/16 v13, 0x100

    if-ne v0, v13, :cond_16

    move v0, v2

    goto :goto_d

    :cond_16
    const/4 v0, 0x0

    :goto_d
    and-int/lit8 v1, v10, 0x70

    const/16 v5, 0x20

    if-ne v1, v5, :cond_17

    move v1, v2

    goto :goto_e

    :cond_17
    const/4 v1, 0x0

    :goto_e
    or-int/2addr v0, v1

    invoke-virtual {v15}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    if-nez v0, :cond_19

    sget-object v0, Lp1/l;->a:Lp1/v0;

    if-ne v1, v0, :cond_18

    goto :goto_f

    :cond_18
    move-object/from16 v5, p1

    move-wide v10, v3

    move-object/from16 v3, p2

    goto :goto_10

    :cond_19
    :goto_f
    new-instance v1, Lc41/j0;

    const/16 v0, 0x9

    move-object/from16 v5, p1

    move-wide v10, v3

    move-object/from16 v3, p2

    invoke-direct {v1, v3, v5, v0}, Lc41/j0;-><init>(Lkotlin/jvm/functions/Function1;Ljava/lang/String;I)V

    invoke-virtual {v15, v1}, Lp1/q;->p0(Ljava/lang/Object;)V

    :goto_10
    move-object v14, v1

    check-cast v14, Lc93/a;

    const/16 v16, 0x30

    const/16 v17, 0x60

    const/4 v12, 0x0

    const/4 v13, 0x0

    invoke-static/range {v6 .. v17}, Lny0/u;->h(Landroidx/compose/ui/Modifier;Lny0/v;Ljava/lang/String;ZJLi2/t;ZLc93/a;Landroidx/compose/runtime/Composer;II)V

    move-object v10, v15

    invoke-virtual {v10, v2}, Lp1/q;->q(Z)V

    const/4 v8, 0x0

    invoke-virtual {v10, v8}, Lp1/q;->q(Z)V

    goto :goto_11

    :cond_1a
    move-object v5, v2

    invoke-virtual {v10}, Lp1/q;->X()V

    :goto_11
    invoke-virtual {v10}, Lp1/q;->u()Lp1/v1;

    move-result-object v7

    if-eqz v7, :cond_1b

    new-instance v0, Lqn0/c;

    const/4 v6, 0x0

    move-object/from16 v1, p0

    move-object/from16 v4, p3

    move-object v2, v5

    move/from16 v5, p5

    invoke-direct/range {v0 .. v6}, Lqn0/c;-><init>(Lmn0/c;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;II)V

    iput-object v0, v7, Lp1/v1;->d:Lc93/m;

    :cond_1b
    return-void
.end method

.method private static final e(Lkotlin/jvm/functions/Function1;Ljava/lang/String;)Ll83/a0;
    .locals 1

    new-instance v0, Lmn0/a$b;

    invoke-direct {v0, p1}, Lmn0/a$b;-><init>(Ljava/lang/String;)V

    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final f(Lmn0/c;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 6

    or-int/lit8 p4, p4, 0x1

    invoke-static {p4}, Lp1/x;->L(I)I

    move-result v5

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p5

    invoke-static/range {v0 .. v5}, Lqn0/e;->d(Lmn0/c;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final g(Ll0/u;FLandroidx/compose/runtime/Composer;I)V
    .locals 8

    check-cast p2, Lp1/q;

    const v0, 0x3c5420ce

    invoke-virtual {p2, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, p3, 0x6

    if-nez v0, :cond_1

    invoke-virtual {p2, p0}, Lp1/q;->g(Ljava/lang/Object;)Z

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
    and-int/lit8 v1, p3, 0x30

    if-nez v1, :cond_3

    invoke-virtual {p2, p1}, Lp1/q;->d(F)Z

    move-result v1

    if-eqz v1, :cond_2

    const/16 v1, 0x20

    goto :goto_2

    :cond_2
    const/16 v1, 0x10

    :goto_2
    or-int/2addr v0, v1

    :cond_3
    and-int/lit8 v1, v0, 0x13

    const/16 v2, 0x12

    const/4 v3, 0x0

    const/4 v4, 0x1

    if-eq v1, v2, :cond_4

    move v1, v4

    goto :goto_3

    :cond_4
    move v1, v3

    :goto_3
    and-int/2addr v0, v4

    invoke-virtual {p2, v0, v1}, Lp1/q;->U(IZ)Z

    move-result v0

    if-eqz v0, :cond_5

    sget-object v0, Li2/t;->b:Li2/s;

    sget-object v1, Lx81/d;->a:Lx81/d;

    sget v2, Lx81/d;->b:I

    invoke-virtual {v1, p2, v2}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v4

    invoke-virtual {v4}, Ly81/i;->o()J

    move-result-wide v4

    const/4 v6, 0x0

    invoke-static {v6, v4, v5}, Li2/x;->c(FJ)J

    move-result-wide v4

    new-instance v7, Li2/x;

    invoke-direct {v7, v4, v5}, Li2/x;-><init>(J)V

    invoke-virtual {v1, p2, v2}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v1

    invoke-virtual {v1}, Ly81/i;->o()J

    move-result-wide v1

    new-instance v4, Li2/x;

    invoke-direct {v4, v1, v2}, Li2/x;-><init>(J)V

    filled-new-array {v7, v4}, [Li2/x;

    move-result-object v1

    invoke-static {v1}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v1

    const/16 v2, 0xe

    invoke-static {v0, v1, v6, v6, v2}, Li2/s;->k(Li2/s;Ljava/util/List;FFI)Li2/k0;

    move-result-object v0

    const/4 v1, 0x0

    sget-object v2, Lb2/t;->w:Lb2/t;

    const/4 v4, 0x6

    invoke-static {v2, v0, v1, v6, v4}, Landroidx/compose/foundation/a;->b(Landroidx/compose/ui/Modifier;Li2/t;Li2/a1;FI)Landroidx/compose/ui/Modifier;

    move-result-object v0

    invoke-static {p1, v0}, Landroidx/compose/foundation/layout/d;->h(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    const/high16 v1, 0x3f800000    # 1.0f

    invoke-static {v1, v0}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    sget-object v1, Lb2/e;->H:Lb2/m;

    invoke-interface {p0, v0, v1}, Ll0/u;->a(Landroidx/compose/ui/Modifier;Lb2/h;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    invoke-static {v0, p2, v3}, Ll0/q;->a(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V

    goto :goto_4

    :cond_5
    invoke-virtual {p2}, Lp1/q;->X()V

    :goto_4
    invoke-virtual {p2}, Lp1/q;->u()Lp1/v1;

    move-result-object p2

    if-eqz p2, :cond_6

    new-instance v0, Lqn0/d;

    const/4 v1, 0x0

    invoke-direct {v0, p0, p1, p3, v1}, Lqn0/d;-><init>(Ll0/u;FII)V

    iput-object v0, p2, Lp1/v1;->d:Lc93/m;

    :cond_6
    return-void
.end method

.method private static final h(Ll0/u;FILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, Lp1/x;->L(I)I

    move-result p2

    invoke-static {p0, p1, p3, p2}, Lqn0/e;->g(Ll0/u;FLandroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final i(Landroidx/compose/ui/Modifier;Ljn0/d;)Landroidx/compose/ui/Modifier;
    .locals 1

    sget-object v0, Lb2/t;->w:Lb2/t;

    if-eqz p1, :cond_0

    const/4 p1, 0x4

    int-to-float p1, p1

    mul-float/2addr p1, p1

    invoke-static {p1, v0}, Lds/p;->s(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    :cond_0
    invoke-interface {p0, v0}, Landroidx/compose/ui/Modifier;->e(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object p0

    return-object p0
.end method
