.class public abstract Lry2/f;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\u0002\u001a+\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0001\u00a2\u0006\u0004\u0008\u0006\u0010\u0007\u00a8\u0006\n\u00b2\u0006\u000e\u0010\t\u001a\u00020\u00088\n@\nX\u008a\u008e\u0002"
    }
    d2 = {
        "Lty2/a$a;",
        "viewState",
        "Lkotlin/Function1;",
        "Lny2/a;",
        "Ll83/a0;",
        "onViewEvent",
        "g",
        "(Lty2/a$a;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V",
        "",
        "isPaused",
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
.method public static synthetic a(Lkotlin/jvm/functions/Function1;Ljava/lang/Integer;)I
    .locals 0

    invoke-static {p0, p1}, Lry2/f;->m(Lkotlin/jvm/functions/Function1;Ljava/lang/Integer;)I

    move-result p0

    return p0
.end method

.method public static synthetic b(Lp1/c1;Landroidx/lifecycle/g0;Landroidx/lifecycle/v;)V
    .locals 0

    invoke-static {p0, p1, p2}, Lry2/f;->k(Lp1/c1;Landroidx/lifecycle/g0;Landroidx/lifecycle/v;)V

    return-void
.end method

.method public static synthetic c(Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lry2/f;->n(Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Lty2/a$a;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Lry2/f;->o(Lty2/a$a;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic e(Landroidx/lifecycle/g0;Lp1/c1;Lp1/i0;)Lp1/h0;
    .locals 0

    invoke-static {p0, p1, p2}, Lry2/f;->j(Landroidx/lifecycle/g0;Lp1/c1;Lp1/i0;)Lp1/h0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic f(Lty2/a$a;Lkotlin/jvm/functions/Function1;Lp1/c1;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lry2/f;->l(Lty2/a$a;Lkotlin/jvm/functions/Function1;Lp1/c1;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final g(Lty2/a$a;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V
    .locals 46
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lty2/a$a;",
            "Lkotlin/jvm/functions/Function1;",
            "Landroidx/compose/runtime/Composer;",
            "I)V"
        }
    .end annotation

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    const-string v3, "viewState"

    invoke-static {v0, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v3, "onViewEvent"

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v14, p2

    check-cast v14, Lp1/q;

    const v3, 0x32c6ffce

    invoke-virtual {v14, v3}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v3, p3, 0x6

    const/4 v4, 0x4

    if-nez v3, :cond_1

    invoke-virtual {v14, v0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    move v3, v4

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

    invoke-virtual {v14, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

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

    const/16 v15, 0x12

    const/4 v7, 0x1

    if-eq v5, v15, :cond_4

    move v5, v7

    goto :goto_3

    :cond_4
    const/4 v5, 0x0

    :goto_3
    and-int/lit8 v8, v3, 0x1

    invoke-virtual {v14, v8, v5}, Lp1/q;->U(IZ)Z

    move-result v5

    if-eqz v5, :cond_1b

    invoke-static {}, Landroidx/compose/ui/platform/AndroidCompositionLocals_androidKt;->getLocalLifecycleOwner()Lp1/t1;

    move-result-object v5

    invoke-virtual {v14, v5}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Landroidx/lifecycle/g0;

    invoke-virtual {v14}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v8

    sget-object v9, Lp1/l;->a:Lp1/v0;

    if-ne v8, v9, :cond_5

    sget-object v8, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-static {v8}, Lp1/x;->z(Ljava/lang/Object;)Lp1/k1;

    move-result-object v8

    invoke-virtual {v14, v8}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_5
    check-cast v8, Lp1/c1;

    invoke-virtual {v14, v5}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v10

    invoke-virtual {v14}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v11

    if-nez v10, :cond_6

    if-ne v11, v9, :cond_7

    :cond_6
    new-instance v11, Lq11/c;

    const/16 v10, 0x16

    invoke-direct {v11, v10, v5, v8}, Lq11/c;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v14, v11}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_7
    check-cast v11, Lkotlin/jvm/functions/Function1;

    invoke-static {v5, v11, v14}, Lp1/x;->e(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;)V

    sget-object v5, Lb2/t;->w:Lb2/t;

    invoke-static {v5}, Ll0/f;->m(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v10

    const/high16 v11, 0x3f800000    # 1.0f

    invoke-static {v11, v10}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v10

    sget-object v12, Ll0/a1;->x:Ll0/a1;

    invoke-static {v10, v12}, Landroidx/compose/foundation/layout/a;->j(Landroidx/compose/ui/Modifier;Ll0/a1;)Landroidx/compose/ui/Modifier;

    move-result-object v10

    const-wide/high16 v11, 0x4004000000000000L    # 2.5

    double-to-float v11, v11

    int-to-float v4, v4

    mul-float/2addr v11, v4

    int-to-float v12, v7

    const/16 v6, 0x8

    int-to-float v6, v6

    mul-float/2addr v6, v12

    invoke-static {v10, v11, v6, v11, v6}, Landroidx/compose/foundation/layout/a;->s(Landroidx/compose/ui/Modifier;FFFF)Landroidx/compose/ui/Modifier;

    move-result-object v10

    sget-object v11, Ll0/m;->g:Ll0/h;

    sget-object v12, Lb2/e;->K:Lb2/l;

    move/from16 v23, v15

    const/16 v15, 0x36

    invoke-static {v11, v12, v14, v15}, Ll0/p1;->a(Ll0/i;Lb2/g;Landroidx/compose/runtime/Composer;I)Ll0/r1;

    move-result-object v11

    move-object/from16 v17, v8

    iget-wide v7, v14, Lp1/q;->T:J

    invoke-static {v7, v8}, Ljava/lang/Long;->hashCode(J)I

    move-result v7

    invoke-virtual {v14}, Lp1/q;->m()Lp1/p1;

    move-result-object v8

    invoke-static {v14, v10}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v10

    sget-object v18, La3/l;->a:La3/k;

    invoke-virtual/range {v18 .. v18}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v15, La3/k;->b:La3/j;

    invoke-virtual {v14}, Lp1/q;->i0()V

    iget-boolean v12, v14, Lp1/q;->S:Z

    if-eqz v12, :cond_8

    invoke-virtual {v14, v15}, Lp1/q;->l(Lc93/a;)V

    goto :goto_4

    :cond_8
    invoke-virtual {v14}, Lp1/q;->s0()V

    :goto_4
    sget-object v12, La3/k;->g:La3/i;

    invoke-static {v14, v12, v11}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v11, La3/k;->f:La3/i;

    invoke-static {v14, v11, v8}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v8, La3/k;->j:La3/i;

    iget-boolean v13, v14, Lp1/q;->S:Z

    if-nez v13, :cond_9

    invoke-virtual {v14}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v13

    move/from16 v30, v3

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-static {v13, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_a

    goto :goto_5

    :cond_9
    move/from16 v30, v3

    :goto_5
    invoke-static {v7, v14, v7, v8}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_a
    sget-object v3, La3/k;->d:La3/i;

    invoke-static {v14, v3, v10}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual {v0}, Lty2/a$a;->c()Lty2/f;

    move-result-object v7

    invoke-virtual {v7}, Lty2/f;->a()Ljava/lang/Integer;

    move-result-object v7

    if-eqz v7, :cond_12

    const/16 v19, 0x3

    const v10, -0xd0680c2

    invoke-virtual {v14, v10}, Lp1/q;->e0(I)V

    sget-object v10, Lx81/d;->a:Lx81/d;

    sget v13, Lx81/d;->b:I

    invoke-virtual {v10, v14, v13}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v10

    invoke-virtual {v10}, Lb91/d;->C()Lb91/a;

    move-result-object v10

    invoke-virtual {v7}, Ljava/lang/Integer;->intValue()I

    move-result v32

    invoke-virtual {v7}, Ljava/lang/Integer;->intValue()I

    move-result v13

    move/from16 v20, v4

    const/16 v4, 0xe10

    if-le v13, v4, :cond_b

    const/16 v36, 0x1

    goto :goto_6

    :cond_b
    const/16 v36, 0x0

    :goto_6
    invoke-virtual {v0}, Lty2/a$a;->c()Lty2/f;

    move-result-object v4

    invoke-virtual {v4}, Lty2/f;->d()Z

    move-result v38

    invoke-static/range {v17 .. v17}, Lry2/f;->h(Lp1/c1;)Z

    move-result v33

    invoke-virtual {v14, v0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v4

    and-int/lit8 v13, v30, 0x70

    move/from16 v21, v4

    const/16 v4, 0x20

    if-ne v13, v4, :cond_c

    const/4 v4, 0x1

    goto :goto_7

    :cond_c
    const/4 v4, 0x0

    :goto_7
    or-int v4, v21, v4

    move/from16 v21, v4

    invoke-virtual {v14}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    if-nez v21, :cond_e

    if-ne v4, v9, :cond_d

    goto :goto_8

    :cond_d
    move-object/from16 v21, v5

    move/from16 v22, v6

    goto :goto_9

    :cond_e
    :goto_8
    new-instance v4, Lno0/j0;

    move-object/from16 v21, v5

    const/16 v5, 0x1c

    move/from16 v22, v6

    move-object/from16 v6, v17

    invoke-direct {v4, v0, v1, v6, v5}, Lno0/j0;-><init>(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Ljava/lang/Object;I)V

    invoke-virtual {v14, v4}, Lp1/q;->p0(Ljava/lang/Object;)V

    :goto_9
    move-object/from16 v34, v4

    check-cast v34, Lkotlin/jvm/functions/Function1;

    const/16 v4, 0x20

    if-ne v13, v4, :cond_f

    const/4 v5, 0x1

    goto :goto_a

    :cond_f
    const/4 v5, 0x0

    :goto_a
    invoke-virtual {v14, v7}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v6

    or-int/2addr v5, v6

    invoke-virtual {v14}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v6

    if-nez v5, :cond_10

    if-ne v6, v9, :cond_11

    :cond_10
    new-instance v6, Lqt2/e;

    const/16 v5, 0x18

    invoke-direct {v6, v5, v1, v7}, Lqt2/e;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v14, v6}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_11
    move-object/from16 v35, v6

    check-cast v35, Lc93/a;

    new-instance v31, Lq81/b;

    const/16 v37, 0x0

    const/16 v39, 0x20

    const/16 v40, 0x0

    invoke-direct/range {v31 .. v40}, Lq81/b;-><init>(IZLkotlin/jvm/functions/Function1;Lc93/a;ZLjava/lang/Long;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sget v5, Lq81/b;->h:I

    shl-int/lit8 v5, v5, 0x3

    sget v6, Lb91/a;->d:I

    shl-int/lit8 v6, v6, 0x9

    or-int/2addr v5, v6

    move-object v6, v12

    const/16 v12, 0x15

    move/from16 v25, v4

    const/4 v4, 0x0

    move-object v7, v6

    const/4 v6, 0x0

    move-object v13, v8

    move-object/from16 v17, v9

    const-wide/16 v8, 0x0

    move-object/from16 p2, v3

    move-object v0, v7

    move-object v7, v10

    move-object v2, v11

    move-object v1, v13

    move-object v10, v14

    move-object/from16 v43, v17

    move/from16 v14, v20

    move-object/from16 v3, v21

    move/from16 v18, v22

    const/4 v13, 0x0

    move v11, v5

    move-object/from16 v5, v31

    invoke-static/range {v4 .. v12}, Lq81/a;->e(Landroidx/compose/ui/Modifier;Lq81/b;Landroidx/lifecycle/g0;Lb91/a;JLandroidx/compose/runtime/Composer;II)V

    move-object v9, v10

    invoke-virtual {v9, v13}, Lp1/q;->q(Z)V

    const/16 v4, 0xc

    :goto_b
    const/high16 v5, 0x3f800000    # 1.0f

    goto :goto_c

    :cond_12
    move-object/from16 p2, v3

    move-object v3, v5

    move/from16 v18, v6

    move-object v1, v8

    move-object/from16 v43, v9

    move-object v2, v11

    move-object v0, v12

    move-object v9, v14

    const/4 v13, 0x0

    const/16 v25, 0x20

    move v14, v4

    const v4, -0xcf7e489

    invoke-virtual {v9, v4}, Lp1/q;->e0(I)V

    const/16 v4, 0xc

    int-to-float v5, v4

    invoke-static {v5, v14, v3, v9, v13}, Lih0/d0;->v(FFLb2/t;Lp1/q;Z)V

    goto :goto_b

    :goto_c
    invoke-static {v5, v3}, Landroidx/compose/foundation/layout/d;->c(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v6

    float-to-double v7, v5

    const-wide/16 v10, 0x0

    cmpl-double v7, v7, v10

    if-lez v7, :cond_13

    :goto_d
    const/4 v7, 0x1

    goto :goto_e

    :cond_13
    const-string v7, "invalid weight; must be greater than zero"

    invoke-static {v7}, Lm0/a;->a(Ljava/lang/String;)V

    goto :goto_d

    :goto_e
    invoke-static {v6, v7, v5}, Ldc/b;->g(Landroidx/compose/ui/Modifier;ZF)Landroidx/compose/ui/Modifier;

    move-result-object v17

    const/16 v21, 0x0

    const/16 v22, 0xa

    const/16 v19, 0x0

    move/from16 v20, v18

    invoke-static/range {v17 .. v22}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v5

    sget-object v6, Ll0/m;->e:Ll0/h;

    sget-object v8, Lb2/e;->N:Lb2/k;

    const/16 v10, 0x36

    invoke-static {v6, v8, v9, v10}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v6

    iget-wide v10, v9, Lp1/q;->T:J

    invoke-static {v10, v11}, Ljava/lang/Long;->hashCode(J)I

    move-result v8

    invoke-virtual {v9}, Lp1/q;->m()Lp1/p1;

    move-result-object v10

    invoke-static {v9, v5}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v5

    invoke-virtual {v9}, Lp1/q;->i0()V

    iget-boolean v11, v9, Lp1/q;->S:Z

    if-eqz v11, :cond_14

    invoke-virtual {v9, v15}, Lp1/q;->l(Lc93/a;)V

    goto :goto_f

    :cond_14
    invoke-virtual {v9}, Lp1/q;->s0()V

    :goto_f
    invoke-static {v9, v0, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v9, v2, v10}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v0, v9, Lp1/q;->S:Z

    if-nez v0, :cond_16

    invoke-virtual {v9}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v0

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-static {v0, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_15

    goto :goto_11

    :cond_15
    :goto_10
    move-object/from16 v0, p2

    goto :goto_12

    :cond_16
    :goto_11
    invoke-static {v8, v9, v8, v1}, Ld;->y(ILp1/q;ILa3/i;)V

    goto :goto_10

    :goto_12
    invoke-static {v9, v0, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const/high16 v5, 0x3f800000    # 1.0f

    invoke-static {v5, v3}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    invoke-virtual/range {p0 .. p0}, Lty2/a$a;->c()Lty2/f;

    move-result-object v1

    invoke-virtual {v1}, Lty2/f;->c()Lcom/whoop/design/util/TextResource;

    move-result-object v1

    sget v2, Lcom/whoop/design/util/TextResource;->$stable:I

    invoke-static {v1, v9, v2}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v1

    sget-object v5, Lx81/d;->a:Lx81/d;

    sget v6, Lx81/d;->b:I

    invoke-virtual {v5, v9, v6}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v8

    invoke-virtual {v8}, Ly81/i;->y()J

    move-result-wide v10

    invoke-virtual {v5, v9, v6}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v8

    invoke-virtual {v8}, Lb91/d;->r()Lb91/a;

    move-result-object v24

    new-instance v8, Lw3/k;

    const/4 v12, 0x3

    invoke-direct {v8, v12}, Lw3/k;-><init>(I)V

    sget v15, Lb91/a;->d:I

    shl-int/lit8 v15, v15, 0x12

    or-int/lit16 v15, v15, 0xc30

    const v29, 0x2d5f8

    move-object/from16 v16, v8

    move-object/from16 v26, v9

    const-wide/16 v8, 0x0

    move/from16 v18, v7

    move-wide/from16 v44, v10

    move v11, v6

    move-wide/from16 v6, v44

    const/4 v10, 0x0

    move/from16 v17, v11

    const/4 v11, 0x0

    move/from16 v19, v12

    const/4 v12, 0x0

    move/from16 v21, v13

    move/from16 v20, v14

    const-wide/16 v13, 0x0

    move/from16 v28, v15

    const/4 v15, 0x0

    move/from16 v22, v17

    move/from16 v42, v18

    const-wide/16 v17, 0x0

    move/from16 v41, v19

    const/16 v19, 0x2

    move/from16 v23, v20

    const/16 v20, 0x0

    move/from16 v27, v21

    const/16 v21, 0x2

    move/from16 v32, v22

    const/16 v22, 0x0

    move/from16 v33, v23

    const/16 v23, 0x0

    move/from16 v34, v25

    const/16 v25, 0x0

    move/from16 v35, v27

    const/16 v27, 0x30

    move-object v4, v5

    move-object v5, v0

    move-object v0, v4

    move-object v4, v1

    move/from16 v1, v32

    invoke-static/range {v4 .. v29}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v9, v26

    invoke-virtual/range {p0 .. p0}, Lty2/a$a;->c()Lty2/f;

    move-result-object v4

    invoke-virtual {v4}, Lty2/f;->b()Lcom/whoop/design/util/TextResource;

    move-result-object v4

    invoke-static {v4}, Lcom/whoop/design/util/b;->d(Lcom/whoop/design/util/TextResource;)Z

    move-result v4

    if-eqz v4, :cond_17

    const v4, 0x112fd766

    invoke-virtual {v9, v4}, Lp1/q;->e0(I)V

    const/high16 v5, 0x3f800000    # 1.0f

    invoke-static {v5, v3}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v5

    invoke-virtual/range {p0 .. p0}, Lty2/a$a;->c()Lty2/f;

    move-result-object v4

    invoke-virtual {v4}, Lty2/f;->b()Lcom/whoop/design/util/TextResource;

    move-result-object v4

    invoke-static {v4, v9, v2}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v0, v9, v1}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v2

    invoke-virtual {v2}, Ly81/i;->b1()J

    move-result-wide v6

    invoke-virtual {v0, v9, v1}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v1

    invoke-virtual {v1}, Lb91/d;->s()Lb91/a;

    move-result-object v24

    new-instance v1, Lw3/k;

    const/4 v12, 0x3

    invoke-direct {v1, v12}, Lw3/k;-><init>(I)V

    const/16 v27, 0x30

    const v29, 0x2d5f8

    move-object/from16 v26, v9

    const-wide/16 v8, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const-wide/16 v13, 0x0

    const/4 v15, 0x0

    const-wide/16 v17, 0x0

    const/16 v19, 0x2

    const/16 v20, 0x0

    const/16 v21, 0x1

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v25, 0x0

    move-object/from16 v16, v1

    invoke-static/range {v4 .. v29}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v9, v26

    const/4 v13, 0x0

    invoke-virtual {v9, v13}, Lp1/q;->q(Z)V

    :goto_13
    const/4 v12, 0x1

    goto :goto_14

    :cond_17
    const/4 v13, 0x0

    const v1, 0x1135fa3a

    invoke-virtual {v9, v1}, Lp1/q;->e0(I)V

    invoke-virtual {v9, v13}, Lp1/q;->q(Z)V

    goto :goto_13

    :goto_14
    invoke-virtual {v9, v12}, Lp1/q;->q(Z)V

    const/16 v4, 0xc

    int-to-float v1, v4

    mul-float v1, v1, v33

    invoke-static {v1, v3}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v6

    new-instance v14, Lny0/o;

    sget-object v15, Lny0/q$a;->f:Lny0/q$a;

    invoke-virtual {v0}, Lx81/d;->d()Lgz0/o0;

    move-result-object v0

    invoke-virtual {v0}, Lgz0/o0;->i()Lgz0/w;

    move-result-object v0

    invoke-virtual {v0}, Lgz0/w;->l()I

    move-result v16

    const/16 v25, 0x3fc

    const/16 v26, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    invoke-direct/range {v14 .. v26}, Lny0/o;-><init>(Lny0/q;ILy81/e;Ly81/e;Ly81/e;ZZZFZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sget v0, Lyw2/e;->u:I

    invoke-static {v9, v0}, Lq83/g;->Y(Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v5

    and-int/lit8 v0, v30, 0x70

    const/16 v4, 0x20

    if-ne v0, v4, :cond_18

    move v13, v12

    :cond_18
    invoke-virtual {v9}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v0

    if-nez v13, :cond_1a

    move-object/from16 v1, v43

    if-ne v0, v1, :cond_19

    goto :goto_15

    :cond_19
    move-object/from16 v2, p1

    goto :goto_16

    :cond_1a
    :goto_15
    new-instance v0, Lqn0/j;

    const/16 v1, 0x17

    move-object/from16 v2, p1

    invoke-direct {v0, v2, v1}, Lqn0/j;-><init>(Lkotlin/jvm/functions/Function1;I)V

    invoke-virtual {v9, v0}, Lp1/q;->p0(Ljava/lang/Object;)V

    :goto_16
    move-object v8, v0

    check-cast v8, Lc93/a;

    sget v0, Lny0/o;->k:I

    or-int/lit16 v10, v0, 0x180

    const/16 v11, 0x8

    const/4 v7, 0x0

    move-object v4, v14

    invoke-static/range {v4 .. v11}, Lny0/b1;->d(Lny0/o;Ljava/lang/String;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/Modifier;Lc93/a;Landroidx/compose/runtime/Composer;II)V

    invoke-virtual {v9, v12}, Lp1/q;->q(Z)V

    sget-object v5, Lhy0/g;->SOLID:Lhy0/g;

    const/16 v15, 0x30

    const/16 v16, 0xfd

    const/4 v4, 0x0

    const/4 v6, 0x0

    const/4 v8, 0x0

    move-object/from16 v26, v9

    const-wide/16 v9, 0x0

    const-wide/16 v11, 0x0

    const/4 v13, 0x0

    move-object/from16 v14, v26

    invoke-static/range {v4 .. v16}, Lhy0/i2;->j(Landroidx/compose/ui/Modifier;Lhy0/g;Lhy0/f;Lcom/whoop/design/util/TextResource;Ljava/lang/Float;JJLb91/c;Landroidx/compose/runtime/Composer;II)V

    move-object v9, v14

    goto :goto_17

    :cond_1b
    move-object v2, v1

    move-object v9, v14

    invoke-virtual {v9}, Lp1/q;->X()V

    :goto_17
    invoke-virtual {v9}, Lp1/q;->u()Lp1/v1;

    move-result-object v0

    if-eqz v0, :cond_1c

    new-instance v1, Lq81/e;

    const/16 v3, 0x12

    move-object/from16 v4, p0

    move/from16 v5, p3

    invoke-direct {v1, v4, v2, v5, v3}, Lq81/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;II)V

    iput-object v1, v0, Lp1/v1;->d:Lc93/m;

    :cond_1c
    return-void
.end method

.method private static final h(Lp1/c1;)Z
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp1/c1;",
            ")Z"
        }
    .end annotation

    invoke-interface {p0}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Boolean;

    invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result p0

    return p0
.end method

.method private static final i(Lp1/c1;Z)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp1/c1;",
            "Z)V"
        }
    .end annotation

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    invoke-interface {p0, p1}, Lp1/c1;->setValue(Ljava/lang/Object;)V

    return-void
.end method

.method private static final j(Landroidx/lifecycle/g0;Lp1/c1;Lp1/i0;)Lp1/h0;
    .locals 1

    const-string v0, "$this$DisposableEffect"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p2, Lcu2/r;

    const/4 v0, 0x2

    invoke-direct {p2, p1, v0}, Lcu2/r;-><init>(Ljava/lang/Object;I)V

    invoke-interface {p0}, Landroidx/lifecycle/g0;->getLifecycle()Landroidx/lifecycle/x;

    move-result-object p1

    invoke-virtual {p1, p2}, Landroidx/lifecycle/x;->a(Landroidx/lifecycle/f0;)V

    new-instance p1, Lry2/f$a;

    invoke-direct {p1, p0, p2}, Lry2/f$a;-><init>(Landroidx/lifecycle/g0;Landroidx/lifecycle/e0;)V

    return-object p1
.end method

.method private static final k(Lp1/c1;Landroidx/lifecycle/g0;Landroidx/lifecycle/v;)V
    .locals 1

    const-string v0, "<unused var>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string p1, "event"

    invoke-static {p2, p1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p1, Landroidx/lifecycle/v;->ON_RESUME:Landroidx/lifecycle/v;

    if-eq p2, p1, :cond_0

    const/4 p1, 0x1

    goto :goto_0

    :cond_0
    const/4 p1, 0x0

    :goto_0
    invoke-static {p0, p1}, Lry2/f;->i(Lp1/c1;Z)V

    return-void
.end method

.method private static final l(Lty2/a$a;Lkotlin/jvm/functions/Function1;Lp1/c1;I)Ll83/a0;
    .locals 0

    if-gtz p3, :cond_0

    invoke-virtual {p0}, Lty2/a$a;->c()Lty2/f;

    move-result-object p0

    invoke-virtual {p0}, Lty2/f;->d()Z

    move-result p0

    if-eqz p0, :cond_0

    new-instance p0, Lny2/a$q;

    const/4 p3, 0x0

    invoke-direct {p0, p3}, Lny2/a$q;-><init>(Z)V

    invoke-interface {p1, p0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    const/4 p0, 0x1

    invoke-static {p2, p0}, Lry2/f;->i(Lp1/c1;Z)V

    :cond_0
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final m(Lkotlin/jvm/functions/Function1;Ljava/lang/Integer;)I
    .locals 2

    new-instance v0, Lny2/a$q;

    const/4 v1, 0x1

    invoke-direct {v0, v1}, Lny2/a$q;-><init>(Z)V

    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p0

    return p0
.end method

.method private static final n(Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 1

    sget-object v0, Lny2/a$k;->a:Lny2/a$k;

    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final o(Lty2/a$a;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, Lp1/x;->L(I)I

    move-result p2

    invoke-static {p0, p1, p3, p2}, Lry2/f;->g(Lty2/a$a;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method
