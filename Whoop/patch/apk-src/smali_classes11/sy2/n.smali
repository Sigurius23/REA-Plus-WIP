.class public abstract Lsy2/n;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u001a?\u0010\u0008\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00040\u0002H\u0001\u00a2\u0006\u0004\u0008\u0008\u0010\t\u00a8\u0006\n"
    }
    d2 = {
        "Lty2/a$a$e;",
        "viewState",
        "Lkotlin/Function1;",
        "Lny2/a;",
        "Ll83/a0;",
        "onViewEvent",
        "Lcom/whoop/whooplabs/feature/navigation/c;",
        "onNavEvent",
        "d",
        "(Lty2/a$a$e;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V",
        "whooplabs_release"
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
.method public static synthetic a(Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lsy2/n;->f(Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lty2/a$a$e;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p5}, Lsy2/n;->g(Lty2/a$a$e;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Lkotlin/jvm/functions/Function1;Lty2/d;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lsy2/n;->e(Lkotlin/jvm/functions/Function1;Lty2/d;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final d(Lty2/a$a$e;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V
    .locals 37
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lty2/a$a$e;",
            "Lkotlin/jvm/functions/Function1;",
            "Lkotlin/jvm/functions/Function1;",
            "Landroidx/compose/runtime/Composer;",
            "I)V"
        }
    .end annotation

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    const-string v0, "viewState"

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onViewEvent"

    invoke-static {v2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onNavEvent"

    move-object/from16 v3, p2

    invoke-static {v3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v13, p3

    check-cast v13, Lp1/q;

    const v0, 0x43fbf295

    invoke-virtual {v13, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, p4, 0x6

    if-nez v0, :cond_1

    invoke-virtual {v13, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x4

    goto :goto_0

    :cond_0
    const/4 v0, 0x2

    :goto_0
    or-int v0, p4, v0

    goto :goto_1

    :cond_1
    move/from16 v0, p4

    :goto_1
    and-int/lit8 v6, p4, 0x30

    if-nez v6, :cond_3

    invoke-virtual {v13, v2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_2

    const/16 v6, 0x20

    goto :goto_2

    :cond_2
    const/16 v6, 0x10

    :goto_2
    or-int/2addr v0, v6

    :cond_3
    and-int/lit8 v6, v0, 0x13

    const/16 v8, 0x12

    const/4 v10, 0x0

    if-eq v6, v8, :cond_4

    const/4 v6, 0x1

    goto :goto_3

    :cond_4
    move v6, v10

    :goto_3
    and-int/lit8 v11, v0, 0x1

    invoke-virtual {v13, v11, v6}, Lp1/q;->U(IZ)Z

    move-result v6

    if-eqz v6, :cond_22

    sget-object v6, Lb2/t;->w:Lb2/t;

    invoke-static {v6}, Lgb1/b0;->b0(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v11

    sget-object v12, Lb2/e;->w:Lb2/m;

    invoke-static {v12, v10}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v14

    iget-wide v4, v13, Lp1/q;->T:J

    invoke-static {v4, v5}, Ljava/lang/Long;->hashCode(J)I

    move-result v4

    invoke-virtual {v13}, Lp1/q;->m()Lp1/p1;

    move-result-object v5

    invoke-static {v13, v11}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v11

    sget-object v16, La3/l;->a:La3/k;

    invoke-virtual/range {v16 .. v16}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v7, La3/k;->b:La3/j;

    invoke-virtual {v13}, Lp1/q;->i0()V

    iget-boolean v8, v13, Lp1/q;->S:Z

    if-eqz v8, :cond_5

    invoke-virtual {v13, v7}, Lp1/q;->l(Lc93/a;)V

    goto :goto_4

    :cond_5
    invoke-virtual {v13}, Lp1/q;->s0()V

    :goto_4
    sget-object v8, La3/k;->g:La3/i;

    invoke-static {v13, v8, v14}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v14, La3/k;->f:La3/i;

    invoke-static {v13, v14, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v5, La3/k;->j:La3/i;

    iget-boolean v15, v13, Lp1/q;->S:Z

    if-nez v15, :cond_6

    invoke-virtual {v13}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v15

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    invoke-static {v15, v9}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v9

    if-nez v9, :cond_7

    :cond_6
    invoke-static {v4, v13, v4, v5}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_7
    sget-object v4, La3/k;->d:La3/i;

    invoke-static {v13, v4, v11}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const/high16 v9, 0x3f800000    # 1.0f

    invoke-static {v9, v6}, Landroidx/compose/foundation/layout/d;->d(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v11

    invoke-static {v11}, Ll0/f;->k(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v11

    sget-object v15, Ll0/m;->c:Ll0/g;

    sget-object v9, Lb2/e;->M:Lb2/k;

    invoke-static {v15, v9, v13, v10}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v9

    move-object/from16 v22, v11

    iget-wide v10, v13, Lp1/q;->T:J

    invoke-static {v10, v11}, Ljava/lang/Long;->hashCode(J)I

    move-result v10

    invoke-virtual {v13}, Lp1/q;->m()Lp1/p1;

    move-result-object v11

    move/from16 v23, v0

    move-object/from16 v0, v22

    invoke-static {v13, v0}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    invoke-virtual {v13}, Lp1/q;->i0()V

    iget-boolean v3, v13, Lp1/q;->S:Z

    if-eqz v3, :cond_8

    invoke-virtual {v13, v7}, Lp1/q;->l(Lc93/a;)V

    goto :goto_5

    :cond_8
    invoke-virtual {v13}, Lp1/q;->s0()V

    :goto_5
    invoke-static {v13, v8, v9}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v13, v14, v11}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v3, v13, Lp1/q;->S:Z

    if-nez v3, :cond_9

    invoke-virtual {v13}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    invoke-static {v3, v9}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_a

    :cond_9
    invoke-static {v10, v13, v10, v5}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_a
    invoke-static {v13, v4, v0}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    and-int/lit8 v0, v23, 0x70

    and-int/lit8 v3, v23, 0x7e

    invoke-static {v1, v2, v13, v3}, Lry2/f;->g(Lty2/a$a;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    const/high16 v3, 0x3f800000    # 1.0f

    float-to-double v9, v3

    const-wide/16 v22, 0x0

    cmpl-double v9, v9, v22

    const-string v10, "invalid weight; must be greater than zero"

    if-lez v9, :cond_b

    goto :goto_6

    :cond_b
    invoke-static {v10}, Lm0/a;->a(Ljava/lang/String;)V

    :goto_6
    new-instance v9, Landroidx/compose/foundation/layout/LayoutWeightElement;

    const v11, 0x7f7fffff    # Float.MAX_VALUE

    cmpl-float v20, v3, v11

    move/from16 v24, v11

    if-lez v20, :cond_c

    :goto_7
    const/4 v1, 0x1

    goto :goto_8

    :cond_c
    move v11, v3

    goto :goto_7

    :goto_8
    invoke-direct {v9, v11, v1}, Landroidx/compose/foundation/layout/LayoutWeightElement;-><init>(FZ)V

    invoke-static {v3, v9}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    const/4 v3, 0x0

    invoke-static {v12, v3}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v9

    iget-wide v11, v13, Lp1/q;->T:J

    invoke-static {v11, v12}, Ljava/lang/Long;->hashCode(J)I

    move-result v3

    invoke-virtual {v13}, Lp1/q;->m()Lp1/p1;

    move-result-object v11

    invoke-static {v13, v1}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    invoke-virtual {v13}, Lp1/q;->i0()V

    iget-boolean v12, v13, Lp1/q;->S:Z

    if-eqz v12, :cond_d

    invoke-virtual {v13, v7}, Lp1/q;->l(Lc93/a;)V

    goto :goto_9

    :cond_d
    invoke-virtual {v13}, Lp1/q;->s0()V

    :goto_9
    invoke-static {v13, v8, v9}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v13, v14, v11}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v9, v13, Lp1/q;->S:Z

    if-nez v9, :cond_e

    invoke-virtual {v13}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v9

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v11

    invoke-static {v9, v11}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v9

    if-nez v9, :cond_f

    :cond_e
    invoke-static {v3, v13, v3, v5}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_f
    invoke-static {v13, v4, v1}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v1, Lb2/e;->H:Lb2/m;

    sget-object v3, Landroidx/compose/foundation/layout/b;->a:Landroidx/compose/foundation/layout/b;

    invoke-virtual {v3, v6, v1}, Landroidx/compose/foundation/layout/b;->a(Landroidx/compose/ui/Modifier;Lb2/h;)Landroidx/compose/ui/Modifier;

    move-result-object v25

    const-wide/high16 v11, 0x4004000000000000L    # 2.5

    double-to-float v1, v11

    const/16 v3, 0x8

    int-to-float v3, v3

    mul-float v26, v1, v3

    const/4 v1, 0x1

    int-to-float v9, v1

    mul-float v27, v9, v3

    const/16 v29, 0x0

    const/16 v30, 0x8

    move/from16 v28, v26

    invoke-static/range {v25 .. v30}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v9

    const/4 v11, 0x0

    invoke-static {v11, v13, v1}, Lq83/g;->U(ILandroidx/compose/runtime/Composer;I)Lf0/r1;

    move-result-object v12

    const/16 v1, 0xe

    invoke-static {v9, v12, v1}, Lq83/g;->f0(Landroidx/compose/ui/Modifier;Lf0/r1;I)Landroidx/compose/ui/Modifier;

    move-result-object v1

    sget-object v9, Lb2/e;->N:Lb2/k;

    const/16 v11, 0x30

    invoke-static {v15, v9, v13, v11}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v9

    move v15, v11

    iget-wide v11, v13, Lp1/q;->T:J

    invoke-static {v11, v12}, Ljava/lang/Long;->hashCode(J)I

    move-result v11

    invoke-virtual {v13}, Lp1/q;->m()Lp1/p1;

    move-result-object v12

    invoke-static {v13, v1}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    invoke-virtual {v13}, Lp1/q;->i0()V

    move/from16 v25, v15

    iget-boolean v15, v13, Lp1/q;->S:Z

    if-eqz v15, :cond_10

    invoke-virtual {v13, v7}, Lp1/q;->l(Lc93/a;)V

    goto :goto_a

    :cond_10
    invoke-virtual {v13}, Lp1/q;->s0()V

    :goto_a
    invoke-static {v13, v8, v9}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v13, v14, v12}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v7, v13, Lp1/q;->S:Z

    if-nez v7, :cond_11

    invoke-virtual {v13}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v7

    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    invoke-static {v7, v8}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_12

    :cond_11
    invoke-static {v11, v13, v11, v5}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_12
    invoke-static {v13, v4, v1}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const/high16 v1, 0x3f800000    # 1.0f

    float-to-double v4, v1

    cmpl-double v4, v4, v22

    if-lez v4, :cond_13

    goto :goto_b

    :cond_13
    invoke-static {v10}, Lm0/a;->a(Ljava/lang/String;)V

    :goto_b
    new-instance v4, Landroidx/compose/foundation/layout/LayoutWeightElement;

    cmpl-float v5, v1, v24

    if-lez v5, :cond_14

    move/from16 v1, v24

    :goto_c
    const/4 v5, 0x1

    goto :goto_d

    :cond_14
    const/high16 v1, 0x3f800000    # 1.0f

    goto :goto_c

    :goto_d
    invoke-direct {v4, v1, v5}, Landroidx/compose/foundation/layout/LayoutWeightElement;-><init>(FZ)V

    invoke-static {v13, v4}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    invoke-virtual/range {p0 .. p0}, Lty2/a$a$e;->f()Ljava/lang/String;

    move-result-object v1

    if-nez v1, :cond_15

    const v1, 0x782657a7

    invoke-virtual {v13, v1}, Lp1/q;->e0(I)V

    const/4 v11, 0x0

    invoke-virtual {v13, v11}, Lp1/q;->q(Z)V

    move/from16 p3, v3

    move-object v1, v6

    move v3, v11

    const/16 v31, 0x12

    goto :goto_e

    :cond_15
    const/4 v11, 0x0

    const v4, 0x782657a8

    invoke-virtual {v13, v4}, Lp1/q;->e0(I)V

    invoke-static {v1, v13, v11}, Lcom/whoop/design/util/b;->i(Ljava/lang/CharSequence;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v4

    invoke-static {v13, v11}, Lkz2/d;->a(Landroidx/compose/runtime/Composer;I)Liz0/m;

    move-result-object v7

    const/high16 v1, 0x3f800000    # 1.0f

    invoke-static {v1, v6}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v19

    const-wide/high16 v8, 0x3fe0000000000000L    # 0.5

    double-to-float v8, v8

    mul-float v21, v8, v3

    const/16 v23, 0x0

    const/16 v24, 0xd

    const/16 v20, 0x0

    const/16 v22, 0x0

    invoke-static/range {v19 .. v24}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v8

    sget v9, Liz0/m;->p:I

    shl-int/lit8 v9, v9, 0x9

    or-int/lit8 v14, v9, 0x30

    const/16 v15, 0x1f4

    move-object v9, v6

    const/4 v6, 0x0

    move/from16 v19, v5

    move-object v5, v8

    const/4 v8, 0x0

    move-object v10, v9

    const/4 v9, 0x0

    move-object v12, v10

    const/4 v10, 0x0

    move/from16 v21, v11

    const/4 v11, 0x0

    move-object/from16 v20, v12

    const/4 v12, 0x0

    move/from16 p3, v3

    move-object/from16 v1, v20

    move/from16 v3, v21

    const/16 v31, 0x12

    invoke-static/range {v4 .. v15}, Liz0/g;->M(Ljava/lang/String;Landroidx/compose/ui/Modifier;ZLiz0/m;Lkotlin/jvm/functions/Function1;IIIZLandroidx/compose/runtime/Composer;II)V

    invoke-virtual {v13, v3}, Lp1/q;->q(Z)V

    :goto_e
    const v4, 0x777d5d6c

    invoke-virtual {v13, v4}, Lp1/q;->e0(I)V

    invoke-virtual/range {p0 .. p0}, Lty2/a$a$e;->i()Ljava/util/List;

    move-result-object v4

    check-cast v4, Ljava/lang/Iterable;

    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v36

    :goto_f
    invoke-interface/range {v36 .. v36}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    sget-object v5, Lp1/l;->a:Lp1/v0;

    if-eqz v4, :cond_1e

    invoke-interface/range {v36 .. v36}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lty2/d;

    const/high16 v6, 0x3f800000    # 1.0f

    invoke-static {v6, v1}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v7

    const/4 v14, 0x2

    int-to-float v8, v14

    mul-float v9, v8, p3

    const/4 v11, 0x0

    const/16 v12, 0xd

    const/4 v8, 0x0

    const/4 v10, 0x0

    invoke-static/range {v7 .. v12}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v7

    invoke-virtual {v4}, Lty2/d;->a()Ljava/lang/String;

    move-result-object v8

    invoke-virtual/range {p0 .. p0}, Lty2/a$a$e;->h()Ljava/lang/String;

    move-result-object v10

    invoke-static {v8, v10}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_16

    const v8, -0x461fbaed

    invoke-virtual {v13, v8}, Lp1/q;->e0(I)V

    sget-object v8, Lx81/d;->a:Lx81/d;

    sget v10, Lx81/d;->b:I

    invoke-static {v8, v13, v10, v3}, Lr80/c;->D(Lx81/d;Lp1/q;IZ)J

    move-result-wide v10

    goto :goto_10

    :cond_16
    const v8, -0x461fb6b0

    invoke-virtual {v13, v8}, Lp1/q;->e0(I)V

    sget-object v8, Lx81/d;->a:Lx81/d;

    sget v10, Lx81/d;->b:I

    invoke-static {v8, v13, v10, v3}, Lr80/c;->d(Lx81/d;Lp1/q;IZ)J

    move-result-wide v10

    :goto_10
    const/4 v8, 0x3

    int-to-float v8, v8

    const/4 v12, 0x4

    int-to-float v15, v12

    invoke-static {v7, v8, v15, v10, v11}, Lr80/c;->e(Landroidx/compose/ui/Modifier;FFJ)Landroidx/compose/ui/Modifier;

    move-result-object v16

    const/16 v7, 0x20

    if-ne v0, v7, :cond_17

    const/4 v8, 0x1

    goto :goto_11

    :cond_17
    move v8, v3

    :goto_11
    invoke-virtual {v13, v4}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v10

    or-int/2addr v8, v10

    invoke-virtual {v13}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v10

    if-nez v8, :cond_18

    if-ne v10, v5, :cond_19

    :cond_18
    new-instance v10, Lsy2/j;

    const/4 v5, 0x3

    invoke-direct {v10, v5, v2, v4}, Lsy2/j;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v13, v10}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_19
    move-object/from16 v20, v10

    check-cast v20, Lc93/a;

    const/16 v21, 0xf

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    invoke-static/range {v16 .. v21}, Landroidx/compose/foundation/a;->g(Landroidx/compose/ui/Modifier;ZLjava/lang/String;Li3/i;Lc93/a;I)Landroidx/compose/ui/Modifier;

    move-result-object v5

    sget-object v8, Lb2/e;->E:Lb2/m;

    invoke-static {v8, v3}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v8

    iget-wide v10, v13, Lp1/q;->T:J

    invoke-static {v10, v11}, Ljava/lang/Long;->hashCode(J)I

    move-result v10

    invoke-virtual {v13}, Lp1/q;->m()Lp1/p1;

    move-result-object v11

    invoke-static {v13, v5}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v5

    sget-object v15, La3/l;->a:La3/k;

    invoke-virtual {v15}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v15, La3/k;->b:La3/j;

    invoke-virtual {v13}, Lp1/q;->i0()V

    iget-boolean v6, v13, Lp1/q;->S:Z

    if-eqz v6, :cond_1a

    invoke-virtual {v13, v15}, Lp1/q;->l(Lc93/a;)V

    goto :goto_12

    :cond_1a
    invoke-virtual {v13}, Lp1/q;->s0()V

    :goto_12
    sget-object v6, La3/k;->g:La3/i;

    invoke-static {v13, v6, v8}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v6, La3/k;->f:La3/i;

    invoke-static {v13, v6, v11}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v6, La3/k;->j:La3/i;

    iget-boolean v8, v13, Lp1/q;->S:Z

    if-nez v8, :cond_1b

    invoke-virtual {v13}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v8

    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v11

    invoke-static {v8, v11}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_1c

    :cond_1b
    invoke-static {v10, v13, v10, v6}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_1c
    sget-object v6, La3/k;->d:La3/i;

    invoke-static {v13, v6, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v9, v1}, Landroidx/compose/foundation/layout/a;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v5

    invoke-virtual {v4}, Lty2/d;->b()Lcom/whoop/design/util/TextResource;

    move-result-object v6

    sget v8, Lcom/whoop/design/util/TextResource;->$stable:I

    invoke-static {v6, v13, v8}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v4}, Lty2/d;->a()Ljava/lang/String;

    move-result-object v4

    invoke-virtual/range {p0 .. p0}, Lty2/a$a$e;->h()Ljava/lang/String;

    move-result-object v8

    invoke-static {v4, v8}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_1d

    const v4, -0x5ee933ea

    invoke-virtual {v13, v4}, Lp1/q;->e0(I)V

    sget-object v4, Lx81/d;->a:Lx81/d;

    sget v8, Lx81/d;->b:I

    invoke-virtual {v4, v13, v8}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v4

    invoke-virtual {v4}, Ly81/i;->u()J

    move-result-wide v8

    invoke-virtual {v13, v3}, Lp1/q;->q(Z)V

    goto :goto_13

    :cond_1d
    const v4, -0x5ee93007

    invoke-virtual {v13, v4}, Lp1/q;->e0(I)V

    sget-object v4, Lx81/d;->a:Lx81/d;

    sget v8, Lx81/d;->b:I

    invoke-static {v4, v13, v8, v3}, Lr80/c;->D(Lx81/d;Lp1/q;IZ)J

    move-result-wide v8

    :goto_13
    sget-object v4, Lx81/d;->a:Lx81/d;

    sget v10, Lx81/d;->b:I

    invoke-virtual {v4, v13, v10}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v4

    invoke-virtual {v4}, Lb91/d;->P()Lb91/a;

    move-result-object v24

    sget v4, Lb91/a;->d:I

    shl-int/lit8 v28, v4, 0x12

    const v29, 0x2fff8

    move-object v4, v6

    move/from16 v16, v7

    move-wide v6, v8

    const-wide/16 v8, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    move v15, v12

    const/4 v12, 0x0

    move-object/from16 v26, v13

    move/from16 v32, v14

    const-wide/16 v13, 0x0

    move/from16 v33, v15

    const/4 v15, 0x0

    move/from16 v34, v16

    const/16 v16, 0x0

    const-wide/16 v17, 0x0

    const/16 v19, 0x0

    const/high16 v35, 0x3f800000    # 1.0f

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v25, 0x0

    const/16 v27, 0x30

    invoke-static/range {v4 .. v29}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v13, v26

    const/4 v4, 0x1

    invoke-virtual {v13, v4}, Lp1/q;->q(Z)V

    goto/16 :goto_f

    :cond_1e
    const/4 v4, 0x1

    invoke-virtual {v13, v3}, Lp1/q;->q(Z)V

    invoke-virtual {v13, v4}, Lp1/q;->q(Z)V

    invoke-virtual {v13, v4}, Lp1/q;->q(Z)V

    invoke-virtual/range {p0 .. p0}, Lty2/a$a$e;->g()Lcom/whoop/design/util/TextResource;

    move-result-object v4

    invoke-virtual/range {p0 .. p0}, Lty2/a$a$e;->j()Z

    move-result v1

    const/16 v7, 0x20

    if-ne v0, v7, :cond_1f

    const/4 v9, 0x1

    goto :goto_14

    :cond_1f
    move v9, v3

    :goto_14
    invoke-virtual {v13}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v0

    if-nez v9, :cond_20

    if-ne v0, v5, :cond_21

    :cond_20
    new-instance v0, Lsy2/a;

    const/4 v3, 0x5

    invoke-direct {v0, v2, v3}, Lsy2/a;-><init>(Lkotlin/jvm/functions/Function1;I)V

    invoke-virtual {v13, v0}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_21
    move-object v7, v0

    check-cast v7, Lc93/a;

    sget v9, Lcom/whoop/design/util/TextResource;->$stable:I

    const/4 v10, 0x4

    const/4 v6, 0x0

    move v5, v1

    move-object v8, v13

    invoke-static/range {v4 .. v10}, Lry2/i;->c(Lcom/whoop/design/util/TextResource;ZLandroidx/compose/ui/Modifier;Lc93/a;Landroidx/compose/runtime/Composer;II)V

    const/4 v1, 0x1

    invoke-virtual {v13, v1}, Lp1/q;->q(Z)V

    invoke-virtual {v13, v1}, Lp1/q;->q(Z)V

    goto :goto_15

    :cond_22
    invoke-virtual {v13}, Lp1/q;->X()V

    :goto_15
    invoke-virtual {v13}, Lp1/q;->u()Lp1/v1;

    move-result-object v6

    if-eqz v6, :cond_23

    new-instance v0, Ls01/e;

    const/16 v5, 0xc

    move-object/from16 v1, p0

    move-object/from16 v3, p2

    move/from16 v4, p4

    invoke-direct/range {v0 .. v5}, Ls01/e;-><init>(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Ll83/e;II)V

    iput-object v0, v6, Lp1/v1;->d:Lc93/m;

    :cond_23
    return-void
.end method

.method private static final e(Lkotlin/jvm/functions/Function1;Lty2/d;)Ll83/a0;
    .locals 1

    new-instance v0, Lny2/a$y;

    invoke-virtual {p1}, Lty2/d;->a()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Lny2/a$y;-><init>(Ljava/lang/String;)V

    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final f(Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 1

    sget-object v0, Lny2/a$o;->a:Lny2/a$o;

    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final g(Lty2/a$a$e;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p3, p3, 0x1

    invoke-static {p3}, Lp1/x;->L(I)I

    move-result p3

    invoke-static {p0, p1, p2, p4, p3}, Lsy2/n;->d(Lty2/a$a$e;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method
