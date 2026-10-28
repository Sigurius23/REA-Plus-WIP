.class public abstract Lcr2/f;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u001a\u001f\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u0001\u00a2\u0006\u0004\u0008\u0005\u0010\u0006\u00a8\u0006\u0007"
    }
    d2 = {
        "Lcr2/c;",
        "step",
        "",
        "isCurrentStep",
        "Ll83/a0;",
        "c",
        "(Lcr2/c;ZLandroidx/compose/runtime/Composer;I)V",
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
.method public static synthetic a(Lcr2/c;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 1

    sget-object v0, Ll0/z;->a:Ll0/z;

    invoke-static {p0, v0, p1, p2}, Lcr2/f;->d(Lcr2/c;Ll0/y;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lcr2/c;ZILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Lcr2/f;->e(Lcr2/c;ZILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final c(Lcr2/c;ZLandroidx/compose/runtime/Composer;I)V
    .locals 49

    move-object/from16 v0, p0

    move/from16 v1, p1

    const-string v3, "step"

    invoke-static {v0, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v13, p2

    check-cast v13, Lp1/q;

    const v3, -0x29c17db8

    invoke-virtual {v13, v3}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v3, p3, 0x6

    if-nez v3, :cond_1

    invoke-virtual {v13, v0}, Lp1/q;->i(Ljava/lang/Object;)Z

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
    and-int/lit8 v5, p3, 0x30

    if-nez v5, :cond_3

    invoke-virtual {v13, v1}, Lp1/q;->h(Z)Z

    move-result v5

    if-eqz v5, :cond_2

    const/16 v5, 0x20

    goto :goto_2

    :cond_2
    const/16 v5, 0x10

    :goto_2
    or-int/2addr v3, v5

    :cond_3
    and-int/lit8 v5, v3, 0x13

    const/16 v6, 0x12

    const/4 v8, 0x1

    if-eq v5, v6, :cond_4

    move v5, v8

    goto :goto_3

    :cond_4
    const/4 v5, 0x0

    :goto_3
    and-int/2addr v3, v8

    invoke-virtual {v13, v3, v5}, Lp1/q;->U(IZ)Z

    move-result v3

    if-eqz v3, :cond_16

    if-eqz v1, :cond_15

    const v3, -0x2bc1ed62

    invoke-virtual {v13, v3}, Lp1/q;->e0(I)V

    invoke-virtual {v13}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    sget-object v5, Lp1/l;->a:Lp1/v0;

    if-ne v3, v5, :cond_5

    new-instance v3, Ld0/q0;

    sget-object v5, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-direct {v3, v5}, Ld0/q0;-><init>(Ljava/lang/Object;)V

    sget-object v5, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-virtual {v3, v5}, Ld0/q0;->I0(Ljava/lang/Boolean;)V

    invoke-virtual {v13, v3}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_5
    check-cast v3, Ld0/q0;

    const/high16 v5, 0x3f800000    # 1.0f

    sget-object v9, Lb2/t;->w:Lb2/t;

    invoke-static {v5, v9}, Landroidx/compose/foundation/layout/d;->d(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v14

    const-wide/high16 v10, 0x4004000000000000L    # 2.5

    double-to-float v10, v10

    const/16 v11, 0x8

    int-to-float v11, v11

    mul-float v15, v10, v11

    const/16 v10, 0xc

    int-to-float v12, v10

    mul-float v16, v12, v11

    const/16 v18, 0x0

    const/16 v19, 0x8

    move/from16 v17, v15

    invoke-static/range {v14 .. v19}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v12

    sget-object v14, Ll0/m;->e:Ll0/h;

    sget-object v15, Lb2/e;->M:Lb2/k;

    const/4 v8, 0x6

    invoke-static {v14, v15, v13, v8}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v14

    move/from16 v16, v11

    iget-wide v10, v13, Lp1/q;->T:J

    invoke-static {v10, v11}, Ljava/lang/Long;->hashCode(J)I

    move-result v10

    invoke-virtual {v13}, Lp1/q;->m()Lp1/p1;

    move-result-object v11

    invoke-static {v13, v12}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v12

    sget-object v18, La3/l;->a:La3/k;

    invoke-virtual/range {v18 .. v18}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v4, La3/k;->b:La3/j;

    invoke-virtual {v13}, Lp1/q;->i0()V

    move/from16 v19, v6

    iget-boolean v6, v13, Lp1/q;->S:Z

    if-eqz v6, :cond_6

    invoke-virtual {v13, v4}, Lp1/q;->l(Lc93/a;)V

    goto :goto_4

    :cond_6
    invoke-virtual {v13}, Lp1/q;->s0()V

    :goto_4
    sget-object v6, La3/k;->g:La3/i;

    invoke-static {v13, v6, v14}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v14, La3/k;->f:La3/i;

    invoke-static {v13, v14, v11}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v11, La3/k;->j:La3/i;

    iget-boolean v7, v13, Lp1/q;->S:Z

    if-nez v7, :cond_7

    invoke-virtual {v13}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v7

    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    invoke-static {v7, v8}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_8

    :cond_7
    invoke-static {v10, v13, v10, v11}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_8
    sget-object v7, La3/k;->d:La3/i;

    invoke-static {v13, v7, v12}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v5, v9}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v8

    sget-object v10, Ll0/m;->c:Ll0/g;

    const/4 v12, 0x6

    invoke-static {v10, v15, v13, v12}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v5

    iget-wide v1, v13, Lp1/q;->T:J

    invoke-static {v1, v2}, Ljava/lang/Long;->hashCode(J)I

    move-result v1

    invoke-virtual {v13}, Lp1/q;->m()Lp1/p1;

    move-result-object v2

    invoke-static {v13, v8}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v8

    invoke-virtual {v13}, Lp1/q;->i0()V

    iget-boolean v12, v13, Lp1/q;->S:Z

    if-eqz v12, :cond_9

    invoke-virtual {v13, v4}, Lp1/q;->l(Lc93/a;)V

    goto :goto_5

    :cond_9
    invoke-virtual {v13}, Lp1/q;->s0()V

    :goto_5
    invoke-static {v13, v6, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v13, v14, v2}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v2, v13, Lp1/q;->S:Z

    if-nez v2, :cond_a

    invoke-virtual {v13}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-static {v2, v5}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_b

    :cond_a
    invoke-static {v1, v13, v1, v11}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_b
    invoke-static {v13, v7, v8}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual {v0}, Lcr2/c;->g()Lcom/whoop/design/util/TextResource;

    move-result-object v1

    if-nez v1, :cond_c

    const v1, 0x2d0e7f3e    # 8.100019E-12f

    invoke-virtual {v13, v1}, Lp1/q;->e0(I)V

    const/4 v2, 0x0

    invoke-virtual {v13, v2}, Lp1/q;->q(Z)V

    move-object/from16 p2, v3

    move-object/from16 v43, v4

    move-object/from16 v44, v6

    move-object/from16 v47, v7

    move-object v3, v9

    move-object v5, v10

    move-object/from16 v46, v11

    move-object/from16 v45, v14

    move-object v4, v15

    move/from16 v1, v16

    const/16 v33, 0xc

    goto/16 :goto_6

    :cond_c
    const/4 v2, 0x0

    const v5, 0x2d0e7f3f    # 8.10002E-12f

    invoke-virtual {v13, v5}, Lp1/q;->e0(I)V

    const/4 v5, 0x2

    int-to-float v8, v5

    move/from16 v12, v16

    invoke-static {v8, v12, v9, v13}, Ld;->w(FFLb2/t;Lp1/q;)V

    const-string v8, "StatListTitle"

    invoke-static {v9, v8}, Landroidx/compose/ui/platform/a;->a(Landroidx/compose/ui/Modifier;Ljava/lang/String;)Landroidx/compose/ui/Modifier;

    move-result-object v8

    sget v2, Lcom/whoop/design/util/TextResource;->$stable:I

    invoke-static {v1, v13, v2}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v1

    sget-object v2, Lx81/d;->a:Lx81/d;

    sget v5, Lx81/d;->b:I

    invoke-virtual {v2, v13, v5}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v16

    invoke-virtual/range {v16 .. v16}, Lb91/d;->O()Lb91/a;

    move-result-object v24

    invoke-virtual {v2, v13, v5}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v2

    invoke-virtual {v2}, Ly81/i;->y()J

    move-result-wide v25

    sget v2, Lb91/a;->d:I

    shl-int/lit8 v28, v2, 0x12

    const v29, 0x2fff8

    move-object v5, v8

    move-object v2, v9

    const-wide/16 v8, 0x0

    move-object/from16 v16, v10

    const/4 v10, 0x0

    move-object/from16 v19, v11

    const/4 v11, 0x0

    move/from16 v23, v12

    const/4 v12, 0x0

    move-object/from16 v27, v6

    move-object/from16 v30, v7

    move-wide/from16 v6, v25

    move-object/from16 v26, v13

    move-object/from16 v25, v14

    const-wide/16 v13, 0x0

    move-object/from16 v31, v15

    const/4 v15, 0x0

    move-object/from16 v32, v16

    const/16 v16, 0x0

    const/16 v33, 0xc

    const/16 v34, 0x2

    const-wide/16 v17, 0x0

    move-object/from16 v35, v19

    const/16 v19, 0x0

    const/16 v36, 0x0

    const/16 v20, 0x0

    const/high16 v37, 0x3f800000    # 1.0f

    const/16 v21, 0x0

    const/16 v38, 0x6

    const/16 v22, 0x0

    move/from16 v39, v23

    const/16 v23, 0x0

    move-object/from16 v40, v25

    const/16 v25, 0x0

    move-object/from16 v41, v27

    const/16 v27, 0x30

    move-object/from16 p2, v3

    move-object/from16 v43, v4

    move-object/from16 v47, v30

    move-object/from16 v42, v31

    move-object/from16 v48, v32

    move-object/from16 v46, v35

    move-object/from16 v45, v40

    move-object/from16 v44, v41

    move-object v4, v1

    move-object v3, v2

    move/from16 v2, v36

    move/from16 v1, v39

    invoke-static/range {v4 .. v29}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v13, v26

    const/4 v4, 0x3

    int-to-float v4, v4

    invoke-static {v4, v1, v3, v13, v2}, Lm4/a;->u(FFLb2/t;Lp1/q;Z)V

    move-object/from16 v4, v42

    move-object/from16 v5, v48

    :goto_6
    invoke-static {v5, v4, v13, v2}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v4

    iget-wide v5, v13, Lp1/q;->T:J

    invoke-static {v5, v6}, Ljava/lang/Long;->hashCode(J)I

    move-result v5

    invoke-virtual {v13}, Lp1/q;->m()Lp1/p1;

    move-result-object v6

    invoke-static {v13, v3}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    invoke-virtual {v13}, Lp1/q;->i0()V

    iget-boolean v7, v13, Lp1/q;->S:Z

    if-eqz v7, :cond_d

    move-object/from16 v7, v43

    invoke-virtual {v13, v7}, Lp1/q;->l(Lc93/a;)V

    :goto_7
    move-object/from16 v7, v44

    goto :goto_8

    :cond_d
    invoke-virtual {v13}, Lp1/q;->s0()V

    goto :goto_7

    :goto_8
    invoke-static {v13, v7, v4}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    move-object/from16 v4, v45

    invoke-static {v13, v4, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v4, v13, Lp1/q;->S:Z

    if-nez v4, :cond_e

    invoke-virtual {v13}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-static {v4, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_f

    :cond_e
    move-object/from16 v4, v46

    goto :goto_a

    :cond_f
    :goto_9
    move-object/from16 v4, v47

    goto :goto_b

    :goto_a
    invoke-static {v5, v13, v5, v4}, Ld;->y(ILp1/q;ILa3/i;)V

    goto :goto_9

    :goto_b
    invoke-static {v13, v4, v3}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const v3, 0x2623af3f

    invoke-virtual {v13, v3}, Lp1/q;->e0(I)V

    invoke-virtual {v0}, Lcr2/c;->f()Ljava/util/List;

    move-result-object v3

    check-cast v3, Ljava/lang/Iterable;

    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v3

    move v7, v2

    :goto_c
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_12

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    add-int/lit8 v15, v7, 0x1

    if-ltz v7, :cond_11

    check-cast v4, Lcr2/g;

    move-object v5, v4

    invoke-virtual {v5}, Lcr2/g;->e()Lcom/whoop/design/util/TextResource;

    move-result-object v4

    move-object v6, v5

    invoke-virtual {v6}, Lcr2/g;->f()Lcom/whoop/design/util/TextResource;

    move-result-object v5

    move-object v8, v6

    invoke-virtual {v8}, Lcr2/g;->d()Lcom/whoop/design/util/TextResource;

    move-result-object v6

    invoke-virtual {v8}, Lcr2/g;->a()Lcr2/h;

    move-result-object v9

    move-object v10, v8

    invoke-virtual {v10}, Lcr2/g;->b()Lcom/whoop/design/util/TextResource;

    move-result-object v8

    invoke-virtual {v10}, Lcr2/g;->c()Lhy0/b2;

    move-result-object v10

    invoke-virtual {v0}, Lcr2/c;->f()Ljava/util/List;

    move-result-object v11

    invoke-static {v11}, Lwb3/f;->C(Ljava/util/List;)I

    move-result v11

    if-ne v7, v11, :cond_10

    move-object v11, v9

    move-object v9, v10

    const/4 v10, 0x1

    goto :goto_d

    :cond_10
    move-object v11, v9

    move-object v9, v10

    move v10, v2

    :goto_d
    sget-object v12, Lkotlin/time/Duration;->Companion:Lkotlin/time/Duration$Companion;

    sget-object v12, Lkotlin/time/DurationUnit;->SECONDS:Lkotlin/time/DurationUnit;

    move-object/from16 v16, v3

    invoke-static {v7, v12}, Lkotlin/time/DurationKt;->toDuration(ILkotlin/time/DurationUnit;)J

    move-result-wide v2

    move-object v7, v4

    move-object v12, v5

    const-wide/high16 v4, 0x3fe0000000000000L    # 0.5

    invoke-static {v2, v3, v4, v5}, Lkotlin/time/Duration;->times-UwyO8pc(JD)J

    move-result-wide v2

    sget v4, Lcom/whoop/design/util/TextResource;->$stable:I

    shl-int/lit8 v5, v4, 0x3

    or-int/2addr v5, v4

    shl-int/lit8 v14, v4, 0x6

    or-int/2addr v5, v14

    shl-int/lit8 v4, v4, 0xc

    or-int v14, v5, v4

    move-object v4, v7

    move-object v7, v11

    move-object v5, v12

    move-wide v11, v2

    invoke-static/range {v4 .. v14}, Lcr2/b;->f(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcr2/h;Lcom/whoop/design/util/TextResource;Lhy0/b2;ZJLandroidx/compose/runtime/Composer;I)V

    move v7, v15

    move-object/from16 v3, v16

    const/4 v2, 0x0

    goto :goto_c

    :cond_11
    invoke-static {}, Lwb3/f;->d0()V

    const/4 v0, 0x0

    throw v0

    :cond_12
    const/4 v3, 0x1

    invoke-static {v13, v2, v3, v3}, Lm4/a;->y(Lp1/q;ZZZ)V

    const/high16 v2, 0x3f800000    # 1.0f

    float-to-double v4, v2

    const-wide/16 v6, 0x0

    cmpl-double v4, v4, v6

    if-lez v4, :cond_13

    goto :goto_e

    :cond_13
    const-string v4, "invalid weight; must be greater than zero"

    invoke-static {v4}, Lm0/a;->a(Ljava/lang/String;)V

    :goto_e
    new-instance v4, Landroidx/compose/foundation/layout/LayoutWeightElement;

    const v5, 0x7f7fffff    # Float.MAX_VALUE

    cmpl-float v6, v2, v5

    if-lez v6, :cond_14

    goto :goto_f

    :cond_14
    move v5, v2

    :goto_f
    invoke-direct {v4, v5, v3}, Landroidx/compose/foundation/layout/LayoutWeightElement;-><init>(FZ)V

    const/4 v5, 0x2

    int-to-float v2, v5

    mul-float/2addr v2, v1

    const/4 v1, 0x0

    invoke-static {v4, v2, v1, v5}, Landroidx/compose/foundation/layout/d;->j(Landroidx/compose/ui/Modifier;FFI)Landroidx/compose/ui/Modifier;

    move-result-object v1

    invoke-static {v13, v1}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    sget-object v5, Lkr2/g;->BOTTOM:Lkr2/g;

    new-instance v1, Lci0/a;

    const/4 v12, 0x6

    invoke-direct {v1, v0, v12}, Lci0/a;-><init>(Ljava/lang/Object;I)V

    const v2, -0x2818d754

    invoke-static {v2, v13, v1}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v7

    const/16 v9, 0xc30

    const/4 v10, 0x4

    const/4 v6, 0x0

    move-object/from16 v4, p2

    move-object v8, v13

    invoke-static/range {v4 .. v10}, Lkr2/b;->u(Ld0/q0;Lkr2/g;Landroidx/compose/ui/Modifier;Lc93/m;Landroidx/compose/runtime/Composer;II)V

    invoke-virtual {v13, v3}, Lp1/q;->q(Z)V

    const/4 v2, 0x0

    invoke-virtual {v13, v2}, Lp1/q;->q(Z)V

    goto :goto_10

    :cond_15
    move v3, v8

    const/4 v2, 0x0

    const v1, -0x2b97c126

    invoke-virtual {v13, v1}, Lp1/q;->e0(I)V

    invoke-virtual {v13, v2}, Lp1/q;->q(Z)V

    goto :goto_10

    :cond_16
    move v3, v8

    invoke-virtual {v13}, Lp1/q;->X()V

    :goto_10
    invoke-virtual {v13}, Lp1/q;->u()Lp1/v1;

    move-result-object v1

    if-eqz v1, :cond_17

    new-instance v2, Lcr2/d;

    move/from16 v4, p1

    move/from16 v5, p3

    invoke-direct {v2, v0, v4, v5, v3}, Lcr2/d;-><init>(Lcr2/c;ZII)V

    iput-object v2, v1, Lp1/v1;->d:Lc93/m;

    :cond_17
    return-void
.end method

.method private static final d(Lcr2/c;Ll0/y;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 12

    sget-object v0, Lb2/e;->w:Lb2/m;

    and-int/lit8 v1, p3, 0x3

    const/4 v2, 0x2

    const/4 v3, 0x1

    const/4 v4, 0x0

    if-eq v1, v2, :cond_0

    move v1, v3

    goto :goto_0

    :cond_0
    move v1, v4

    :goto_0
    and-int/2addr p3, v3

    check-cast p2, Lp1/q;

    invoke-virtual {p2, p3, v1}, Lp1/q;->U(IZ)Z

    move-result p3

    sget-object v1, Ll83/a0;->a:Ll83/a0;

    if-eqz p3, :cond_a

    invoke-virtual {p0}, Lcr2/c;->i()Lcom/whoop/design/util/TextResource;

    move-result-object p3

    sget-object v2, Lb2/t;->w:Lb2/t;

    const/4 v5, 0x0

    if-nez p3, :cond_1

    const p3, -0x22c93155

    invoke-virtual {p2, p3}, Lp1/q;->e0(I)V

    invoke-virtual {p2, v4}, Lp1/q;->q(Z)V

    goto/16 :goto_3

    :cond_1
    const v6, -0x22c93154

    invoke-virtual {p2, v6}, Lp1/q;->e0(I)V

    invoke-virtual {p0}, Lcr2/c;->h()Lcom/whoop/design/util/TextResource;

    move-result-object v6

    if-nez v6, :cond_2

    const p3, -0x581746c5

    invoke-virtual {p2, p3}, Lp1/q;->e0(I)V

    invoke-virtual {p2, v4}, Lp1/q;->q(Z)V

    goto :goto_2

    :cond_2
    const v5, -0x581746c4

    invoke-virtual {p2, v5}, Lp1/q;->e0(I)V

    sget-object v5, Lb2/e;->M:Lb2/k;

    move-object v7, p1

    check-cast v7, Ll0/z;

    invoke-virtual {v7, v2, v5}, Ll0/z;->b(Landroidx/compose/ui/Modifier;Lb2/f;)Landroidx/compose/ui/Modifier;

    move-result-object v5

    const-string v7, "StatListFooterV2"

    invoke-static {v5, v7}, Landroidx/compose/ui/platform/a;->a(Landroidx/compose/ui/Modifier;Ljava/lang/String;)Landroidx/compose/ui/Modifier;

    move-result-object v5

    invoke-static {v0, v4}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v7

    iget-wide v8, p2, Lp1/q;->T:J

    invoke-static {v8, v9}, Ljava/lang/Long;->hashCode(J)I

    move-result v8

    invoke-virtual {p2}, Lp1/q;->m()Lp1/p1;

    move-result-object v9

    invoke-static {p2, v5}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v5

    sget-object v10, La3/l;->a:La3/k;

    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v10, La3/k;->b:La3/j;

    invoke-virtual {p2}, Lp1/q;->i0()V

    iget-boolean v11, p2, Lp1/q;->S:Z

    if-eqz v11, :cond_3

    invoke-virtual {p2, v10}, Lp1/q;->l(Lc93/a;)V

    goto :goto_1

    :cond_3
    invoke-virtual {p2}, Lp1/q;->s0()V

    :goto_1
    sget-object v10, La3/k;->g:La3/i;

    invoke-static {p2, v10, v7}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v7, La3/k;->f:La3/i;

    invoke-static {p2, v7, v9}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v7, La3/k;->j:La3/i;

    iget-boolean v9, p2, Lp1/q;->S:Z

    if-nez v9, :cond_4

    invoke-virtual {p2}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v9

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    invoke-static {v9, v10}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v9

    if-nez v9, :cond_5

    :cond_4
    invoke-static {v8, p2, v8, v7}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_5
    sget-object v7, La3/k;->d:La3/i;

    invoke-static {p2, v7, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget v5, Lcom/whoop/design/util/TextResource;->$stable:I

    shl-int/lit8 v7, v5, 0x3

    or-int/2addr v5, v7

    invoke-static {p3, v6, p2, v5}, Lcr2/e;->j(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)V

    invoke-virtual {p2, v3}, Lp1/q;->q(Z)V

    invoke-virtual {p2, v4}, Lp1/q;->q(Z)V

    move-object v5, v1

    :goto_2
    invoke-virtual {p2, v4}, Lp1/q;->q(Z)V

    :goto_3
    if-nez v5, :cond_9

    const p3, -0x22c2b59e

    invoke-virtual {p2, p3}, Lp1/q;->e0(I)V

    sget-object p3, Lb2/e;->O:Lb2/k;

    check-cast p1, Ll0/z;

    invoke-virtual {p1, v2, p3}, Ll0/z;->b(Landroidx/compose/ui/Modifier;Lb2/f;)Landroidx/compose/ui/Modifier;

    move-result-object p1

    const-string p3, "StatListLegendV2"

    invoke-static {p1, p3}, Landroidx/compose/ui/platform/a;->a(Landroidx/compose/ui/Modifier;Ljava/lang/String;)Landroidx/compose/ui/Modifier;

    move-result-object p1

    invoke-static {v0, v4}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object p3

    iget-wide v5, p2, Lp1/q;->T:J

    invoke-static {v5, v6}, Ljava/lang/Long;->hashCode(J)I

    move-result v0

    invoke-virtual {p2}, Lp1/q;->m()Lp1/p1;

    move-result-object v2

    invoke-static {p2, p1}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object p1

    sget-object v5, La3/l;->a:La3/k;

    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v5, La3/k;->b:La3/j;

    invoke-virtual {p2}, Lp1/q;->i0()V

    iget-boolean v6, p2, Lp1/q;->S:Z

    if-eqz v6, :cond_6

    invoke-virtual {p2, v5}, Lp1/q;->l(Lc93/a;)V

    goto :goto_4

    :cond_6
    invoke-virtual {p2}, Lp1/q;->s0()V

    :goto_4
    sget-object v5, La3/k;->g:La3/i;

    invoke-static {p2, v5, p3}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object p3, La3/k;->f:La3/i;

    invoke-static {p2, p3, v2}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object p3, La3/k;->j:La3/i;

    iget-boolean v2, p2, Lp1/q;->S:Z

    if-nez v2, :cond_7

    invoke-virtual {p2}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-static {v2, v5}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_8

    :cond_7
    invoke-static {v0, p2, v0, p3}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_8
    sget-object p3, La3/k;->d:La3/i;

    invoke-static {p2, p3, p1}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual {p0}, Lcr2/c;->e()Lcom/whoop/design/util/TextResource;

    move-result-object p0

    sget p1, Lcom/whoop/design/util/TextResource;->$stable:I

    invoke-static {p0, p2, p1}, Lcr2/e;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)V

    invoke-virtual {p2, v3}, Lp1/q;->q(Z)V

    invoke-virtual {p2, v4}, Lp1/q;->q(Z)V

    return-object v1

    :cond_9
    const p0, 0x7abfb322

    invoke-virtual {p2, p0}, Lp1/q;->e0(I)V

    invoke-virtual {p2, v4}, Lp1/q;->q(Z)V

    return-object v1

    :cond_a
    invoke-virtual {p2}, Lp1/q;->X()V

    return-object v1
.end method

.method private static final e(Lcr2/c;ZILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, Lp1/x;->L(I)I

    move-result p2

    invoke-static {p0, p1, p3, p2}, Lcr2/f;->c(Lcr2/c;ZLandroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method
