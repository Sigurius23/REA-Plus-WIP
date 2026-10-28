.class public abstract Lrq2/s0;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u001a\u001f\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0001\u00a2\u0006\u0004\u0008\u0005\u0010\u0006\u00a8\u0006\u0007"
    }
    d2 = {
        "Lrq2/p0;",
        "step",
        "",
        "isCurrentStep",
        "Ll83/a0;",
        "b",
        "(Lrq2/p0;ZLandroidx/compose/runtime/Composer;I)V",
        "user-journey_release"
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
.method public static synthetic a(Lrq2/p0;ZILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Lrq2/s0;->c(Lrq2/p0;ZILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final b(Lrq2/p0;ZLandroidx/compose/runtime/Composer;I)V
    .locals 38

    move-object/from16 v0, p0

    move/from16 v1, p1

    const-string v3, "step"

    invoke-static {v0, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v3, p2

    check-cast v3, Lp1/q;

    const v4, 0x42a2f590

    invoke-virtual {v3, v4}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v4, p3, 0x6

    if-nez v4, :cond_1

    invoke-virtual {v3, v0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_0

    const/4 v4, 0x4

    goto :goto_0

    :cond_0
    const/4 v4, 0x2

    :goto_0
    or-int v4, p3, v4

    goto :goto_1

    :cond_1
    move/from16 v4, p3

    :goto_1
    and-int/lit8 v6, p3, 0x30

    if-nez v6, :cond_3

    invoke-virtual {v3, v1}, Lp1/q;->h(Z)Z

    move-result v6

    if-eqz v6, :cond_2

    const/16 v6, 0x20

    goto :goto_2

    :cond_2
    const/16 v6, 0x10

    :goto_2
    or-int/2addr v4, v6

    :cond_3
    and-int/lit8 v6, v4, 0x13

    const/16 v7, 0x12

    if-eq v6, v7, :cond_4

    const/4 v6, 0x1

    goto :goto_3

    :cond_4
    const/4 v6, 0x0

    :goto_3
    and-int/lit8 v7, v4, 0x1

    invoke-virtual {v3, v7, v6}, Lp1/q;->U(IZ)Z

    move-result v6

    if-eqz v6, :cond_10

    if-eqz v1, :cond_f

    const v6, -0x6e3ec692

    invoke-virtual {v3, v6}, Lp1/q;->e0(I)V

    const/high16 v6, 0x3f800000    # 1.0f

    sget-object v10, Lb2/t;->w:Lb2/t;

    invoke-static {v6, v10}, Landroidx/compose/foundation/layout/d;->c(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v7

    sget-object v11, Lb2/e;->N:Lb2/k;

    sget-object v12, Ll0/m;->e:Ll0/h;

    const/16 v13, 0x36

    invoke-static {v12, v11, v3, v13}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v14

    iget-wide v5, v3, Lp1/q;->T:J

    invoke-static {v5, v6}, Ljava/lang/Long;->hashCode(J)I

    move-result v5

    invoke-virtual {v3}, Lp1/q;->m()Lp1/p1;

    move-result-object v6

    invoke-static {v3, v7}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v7

    sget-object v15, La3/l;->a:La3/k;

    invoke-virtual {v15}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v15, La3/k;->b:La3/j;

    invoke-virtual {v3}, Lp1/q;->i0()V

    iget-boolean v9, v3, Lp1/q;->S:Z

    if-eqz v9, :cond_5

    invoke-virtual {v3, v15}, Lp1/q;->l(Lc93/a;)V

    goto :goto_4

    :cond_5
    invoke-virtual {v3}, Lp1/q;->s0()V

    :goto_4
    sget-object v9, La3/k;->g:La3/i;

    invoke-static {v3, v9, v14}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v14, La3/k;->f:La3/i;

    invoke-static {v3, v14, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v6, La3/k;->j:La3/i;

    iget-boolean v13, v3, Lp1/q;->S:Z

    if-nez v13, :cond_6

    invoke-virtual {v3}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v13

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    invoke-static {v13, v8}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_7

    :cond_6
    invoke-static {v5, v3, v5, v6}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_7
    sget-object v5, La3/k;->d:La3/i;

    invoke-static {v3, v5, v7}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const/4 v7, 0x6

    int-to-float v8, v7

    const/16 v13, 0x8

    int-to-float v13, v13

    mul-float/2addr v8, v13

    move-object/from16 v20, v15

    const/4 v15, 0x7

    move-object/from16 v21, v11

    const/4 v11, 0x0

    move-object/from16 v22, v12

    const/4 v12, 0x0

    move/from16 v23, v13

    const/4 v13, 0x0

    move-object/from16 v1, v20

    move/from16 v20, v4

    move-object v4, v1

    move-object v1, v14

    move-object/from16 v7, v22

    move/from16 v30, v23

    const/16 v2, 0x36

    move v14, v8

    move-object/from16 v8, v21

    invoke-static/range {v10 .. v15}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v11

    sget-object v12, Lb2/e;->E:Lb2/m;

    const/4 v13, 0x0

    invoke-static {v12, v13}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v12

    iget-wide v14, v3, Lp1/q;->T:J

    invoke-static {v14, v15}, Ljava/lang/Long;->hashCode(J)I

    move-result v14

    invoke-virtual {v3}, Lp1/q;->m()Lp1/p1;

    move-result-object v15

    invoke-static {v3, v11}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v11

    invoke-virtual {v3}, Lp1/q;->i0()V

    iget-boolean v13, v3, Lp1/q;->S:Z

    if-eqz v13, :cond_8

    invoke-virtual {v3, v4}, Lp1/q;->l(Lc93/a;)V

    goto :goto_5

    :cond_8
    invoke-virtual {v3}, Lp1/q;->s0()V

    :goto_5
    invoke-static {v3, v9, v12}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v3, v1, v15}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v12, v3, Lp1/q;->S:Z

    if-nez v12, :cond_9

    invoke-virtual {v3}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v12

    invoke-static {v14}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v13

    invoke-static {v12, v13}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v12

    if-nez v12, :cond_a

    :cond_9
    invoke-static {v14, v3, v14, v6}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_a
    invoke-static {v3, v5, v11}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    and-int/lit8 v11, v20, 0xe

    invoke-static {v0, v3, v11}, Lrq2/r0;->d(Lrq2/p0;Landroidx/compose/runtime/Composer;I)V

    invoke-static {v7, v8, v3, v2}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v2

    iget-wide v7, v3, Lp1/q;->T:J

    invoke-static {v7, v8}, Ljava/lang/Long;->hashCode(J)I

    move-result v7

    invoke-virtual {v3}, Lp1/q;->m()Lp1/p1;

    move-result-object v8

    invoke-static {v3, v10}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v11

    invoke-virtual {v3}, Lp1/q;->i0()V

    iget-boolean v12, v3, Lp1/q;->S:Z

    if-eqz v12, :cond_b

    invoke-virtual {v3, v4}, Lp1/q;->l(Lc93/a;)V

    goto :goto_6

    :cond_b
    invoke-virtual {v3}, Lp1/q;->s0()V

    :goto_6
    invoke-static {v3, v9, v2}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v3, v1, v8}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v1, v3, Lp1/q;->S:Z

    if-nez v1, :cond_c

    invoke-virtual {v3}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_d

    :cond_c
    invoke-static {v7, v3, v7, v6}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_d
    invoke-static {v3, v5, v11}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual {v0}, Lrq2/p0;->j()Lcom/whoop/design/util/TextResource;

    move-result-object v1

    sget v2, Lcom/whoop/design/util/TextResource;->$stable:I

    invoke-static {v1, v3, v2}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v4

    sget-object v1, Lx81/d;->a:Lx81/d;

    sget v5, Lx81/d;->b:I

    invoke-virtual {v1, v3, v5}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v6

    invoke-virtual {v6}, Ly81/i;->y()J

    move-result-wide v6

    invoke-virtual {v1, v3, v5}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v8

    invoke-virtual {v8}, Lb91/d;->u()Lb91/a;

    move-result-object v24

    new-instance v8, Lw3/k;

    const/4 v9, 0x3

    invoke-direct {v8, v9}, Lw3/k;-><init>(I)V

    sget v31, Lb91/a;->d:I

    shl-int/lit8 v28, v31, 0x12

    const v29, 0x2fdfa

    move v11, v5

    const/4 v5, 0x0

    move-object/from16 v16, v8

    move v13, v9

    const/high16 v12, 0x3f800000    # 1.0f

    const-wide/16 v8, 0x0

    move-object v14, v10

    const/4 v10, 0x0

    move v15, v11

    const/4 v11, 0x0

    move/from16 v20, v12

    const/4 v12, 0x0

    move/from16 v21, v13

    move-object/from16 v22, v14

    const-wide/16 v13, 0x0

    move/from16 v23, v15

    const/4 v15, 0x0

    const/16 v25, 0x1

    const/16 v26, 0x6

    const-wide/16 v17, 0x0

    const/16 v27, 0x0

    const/16 v19, 0x0

    move/from16 v32, v20

    const/16 v20, 0x0

    move/from16 v33, v21

    const/16 v21, 0x0

    move-object/from16 v34, v22

    const/16 v22, 0x0

    move/from16 v35, v23

    const/16 v23, 0x0

    move/from16 v36, v25

    const/16 v25, 0x0

    move/from16 v37, v27

    const/16 v27, 0x0

    move/from16 v0, v35

    move-object/from16 v35, v1

    move-object/from16 v1, v34

    move/from16 v34, v26

    move-object/from16 v26, v3

    move v3, v0

    move/from16 v0, v36

    invoke-static/range {v4 .. v29}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v4, v26

    int-to-float v5, v0

    mul-float v5, v5, v30

    invoke-static {v5, v1}, Landroidx/compose/foundation/layout/a;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v5

    invoke-static {v4, v5}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    invoke-virtual/range {p0 .. p0}, Lrq2/p0;->i()Lcom/whoop/design/util/TextResource;

    move-result-object v5

    invoke-static {v5, v4, v2}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v5

    sget-object v6, Ly81/f;->WHITE_50:Ly81/f;

    invoke-virtual {v6}, Ly81/f;->toTestableColor-0d7_KjU()J

    move-result-wide v6

    move-object/from16 v8, v35

    invoke-virtual {v8, v4, v3}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v9

    invoke-virtual {v9}, Lb91/d;->q()Lb91/a;

    move-result-object v24

    new-instance v9, Lw3/k;

    const/4 v13, 0x3

    invoke-direct {v9, v13}, Lw3/k;-><init>(I)V

    move-object v4, v5

    const/4 v5, 0x0

    move-object/from16 v16, v9

    const-wide/16 v8, 0x0

    const-wide/16 v13, 0x0

    move/from16 v36, v2

    move-object/from16 v2, v35

    invoke-static/range {v4 .. v29}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v4, v26

    invoke-virtual {v4, v0}, Lp1/q;->q(Z)V

    invoke-virtual {v4, v0}, Lp1/q;->q(Z)V

    invoke-virtual/range {p0 .. p0}, Lrq2/p0;->h()Ljava/util/List;

    move-result-object v5

    check-cast v5, Ljava/util/Collection;

    invoke-interface {v5}, Ljava/util/Collection;->isEmpty()Z

    move-result v5

    const/4 v6, 0x0

    if-nez v5, :cond_e

    const v5, 0x6e324751

    invoke-virtual {v4, v5}, Lp1/q;->e0(I)V

    invoke-virtual/range {p0 .. p0}, Lrq2/p0;->h()Ljava/util/List;

    move-result-object v5

    invoke-static {v5}, Ljr2/c;->i(Ljava/util/List;)Ljava/util/List;

    move-result-object v5

    invoke-virtual {v2, v4, v3}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v7

    invoke-virtual {v7}, Lb91/d;->N()Lb91/a;

    move-result-object v25

    invoke-virtual {v2, v4, v3}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v2

    invoke-virtual {v2}, Ly81/i;->y()J

    move-result-wide v2

    const/4 v13, 0x3

    int-to-float v7, v13

    mul-float v7, v7, v30

    const/4 v8, 0x2

    invoke-static {v1, v7, v6, v8}, Landroidx/compose/foundation/layout/a;->r(Landroidx/compose/ui/Modifier;FFI)Landroidx/compose/ui/Modifier;

    move-result-object v1

    shl-int/lit8 v28, v31, 0x15

    const v29, 0x1fff8

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

    const/16 v24, 0x0

    const/16 v27, 0x30

    move-wide v6, v2

    move-object/from16 v26, v4

    move-object v4, v5

    move-object v5, v1

    invoke-static/range {v4 .. v29}, Lqz0/n;->e(Ljava/util/List;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILjava/util/Map;Lkotlin/jvm/functions/Function1;Lb91/a;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v4, v26

    const/4 v13, 0x0

    invoke-virtual {v4, v13}, Lp1/q;->q(Z)V

    goto :goto_7

    :cond_e
    const/4 v13, 0x0

    const v2, 0x6e3744bc

    invoke-virtual {v4, v2}, Lp1/q;->e0(I)V

    const/high16 v12, 0x3f800000    # 1.0f

    invoke-static {v12, v1}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    const-wide/high16 v2, 0x4004000000000000L    # 2.5

    double-to-float v2, v2

    mul-float v2, v2, v30

    const/4 v8, 0x2

    invoke-static {v1, v2, v6, v8}, Landroidx/compose/foundation/layout/a;->r(Landroidx/compose/ui/Modifier;FFI)Landroidx/compose/ui/Modifier;

    move-result-object v1

    sget-object v2, Lb2/e;->M:Lb2/k;

    new-instance v3, Landroidx/compose/foundation/layout/HorizontalAlignElement;

    invoke-direct {v3, v2}, Landroidx/compose/foundation/layout/HorizontalAlignElement;-><init>(Lb2/f;)V

    invoke-interface {v1, v3}, Landroidx/compose/ui/Modifier;->e(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    const-string v2, "StrainGaugeV2Footer"

    invoke-static {v1, v2}, Landroidx/compose/ui/platform/a;->a(Landroidx/compose/ui/Modifier;Ljava/lang/String;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    invoke-virtual/range {p0 .. p0}, Lrq2/p0;->g()Lcom/whoop/design/util/TextResource;

    move-result-object v2

    invoke-virtual/range {p0 .. p0}, Lrq2/p0;->f()Lcom/whoop/design/util/TextResource;

    move-result-object v3

    shl-int/lit8 v5, v36, 0x3

    shl-int/lit8 v6, v36, 0x6

    or-int/2addr v5, v6

    invoke-static {v1, v2, v3, v4, v5}, Lkq2/b;->b(Landroidx/compose/ui/Modifier;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)V

    invoke-virtual {v4, v13}, Lp1/q;->q(Z)V

    :goto_7
    invoke-virtual {v4, v0}, Lp1/q;->q(Z)V

    invoke-virtual {v4, v13}, Lp1/q;->q(Z)V

    goto :goto_8

    :cond_f
    move-object v4, v3

    const/4 v13, 0x0

    const v0, -0x6e20202e

    invoke-virtual {v4, v0}, Lp1/q;->e0(I)V

    invoke-virtual {v4, v13}, Lp1/q;->q(Z)V

    goto :goto_8

    :cond_10
    move-object v4, v3

    invoke-virtual {v4}, Lp1/q;->X()V

    :goto_8
    invoke-virtual {v4}, Lp1/q;->u()Lp1/v1;

    move-result-object v0

    if-eqz v0, :cond_11

    new-instance v1, Lrq2/q0;

    const/4 v2, 0x1

    move-object/from16 v3, p0

    move/from16 v4, p1

    move/from16 v5, p3

    invoke-direct {v1, v3, v4, v5, v2}, Lrq2/q0;-><init>(Lrq2/p0;ZII)V

    iput-object v1, v0, Lp1/v1;->d:Lc93/m;

    :cond_11
    return-void
.end method

.method private static final c(Lrq2/p0;ZILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, Lp1/x;->L(I)I

    move-result p2

    invoke-static {p0, p1, p3, p2}, Lrq2/s0;->b(Lrq2/p0;ZLandroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method
