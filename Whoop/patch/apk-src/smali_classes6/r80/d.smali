.class public abstract Lr80/d;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lr80/d$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0002\u0008\u0003\u001a+\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0001\u00a2\u0006\u0004\u0008\u0006\u0010\u0007\u001a3\u0010\u000e\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u00082\u0006\u0010\u000b\u001a\u00020\n2\u0012\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000c\u0012\u0004\u0012\u00020\u00040\u0002H\u0003\u00a2\u0006\u0004\u0008\u000e\u0010\u000f\u001a\u0013\u0010\u0011\u001a\u00020\u0010*\u00020\u000cH\u0002\u00a2\u0006\u0004\u0008\u0011\u0010\u0012\u00a8\u0006\u0013"
    }
    d2 = {
        "Lr80/f;",
        "viewState",
        "Lkotlin/Function1;",
        "",
        "Ll83/a0;",
        "onViewEvent",
        "g",
        "(Lr80/f;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V",
        "Lr80/e;",
        "tile",
        "",
        "isSelected",
        "Lr80/a;",
        "onTileSelected",
        "l",
        "(Lr80/e;ZLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V",
        "",
        "o",
        "(Lr80/a;)Ljava/lang/String;",
        "activation_release"
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
.method public static synthetic a(Lr80/e;Lkotlin/jvm/functions/Function1;Lr80/f;Lr80/a;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lr80/d;->j(Lr80/e;Lkotlin/jvm/functions/Function1;Lr80/f;Lr80/a;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lr80/e;ZLkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p5}, Lr80/d;->n(Lr80/e;ZLkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Lr80/e;Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lr80/d;->m(Lr80/e;Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Lr80/f;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Lr80/d;->k(Lr80/f;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic e(Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lr80/d;->h(Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic f(Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lr80/d;->i(Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final g(Lr80/f;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V
    .locals 41
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lr80/f;",
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

    move-object/from16 v3, p2

    check-cast v3, Lp1/q;

    const v4, -0x1ebe13a0

    invoke-virtual {v3, v4}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v4, p3, 0x6

    const/4 v5, 0x2

    if-nez v4, :cond_1

    invoke-virtual {v3, v0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_0

    const/4 v4, 0x4

    goto :goto_0

    :cond_0
    move v4, v5

    :goto_0
    or-int v4, p3, v4

    goto :goto_1

    :cond_1
    move/from16 v4, p3

    :goto_1
    and-int/lit8 v7, p3, 0x30

    const/16 v8, 0x20

    if-nez v7, :cond_3

    invoke-virtual {v3, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_2

    move v7, v8

    goto :goto_2

    :cond_2
    const/16 v7, 0x10

    :goto_2
    or-int/2addr v4, v7

    :cond_3
    move/from16 v30, v4

    and-int/lit8 v4, v30, 0x13

    const/16 v7, 0x12

    const/4 v9, 0x0

    const/4 v10, 0x1

    if-eq v4, v7, :cond_4

    move v4, v10

    goto :goto_3

    :cond_4
    move v4, v9

    :goto_3
    and-int/lit8 v11, v30, 0x1

    invoke-virtual {v3, v11, v4}, Lp1/q;->U(IZ)Z

    move-result v4

    if-eqz v4, :cond_14

    invoke-virtual {v0}, Lr80/f;->g()Z

    move-result v4

    sget-object v11, Lp1/l;->a:Lp1/v0;

    if-eqz v4, :cond_b

    const v4, 0x7694a8b8

    invoke-virtual {v3, v4}, Lp1/q;->e0(I)V

    and-int/lit8 v4, v30, 0x70

    if-ne v4, v8, :cond_5

    move v5, v10

    goto :goto_4

    :cond_5
    move v5, v9

    :goto_4
    invoke-virtual {v3}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v6

    if-nez v5, :cond_6

    if-ne v6, v11, :cond_7

    :cond_6
    new-instance v6, Lqn0/j;

    const/4 v5, 0x4

    invoke-direct {v6, v1, v5}, Lqn0/j;-><init>(Lkotlin/jvm/functions/Function1;I)V

    invoke-virtual {v3, v6}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_7
    check-cast v6, Lc93/a;

    if-ne v4, v8, :cond_8

    goto :goto_5

    :cond_8
    move v10, v9

    :goto_5
    invoke-virtual {v3}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    if-nez v10, :cond_9

    if-ne v4, v11, :cond_a

    :cond_9
    new-instance v4, Lqn0/j;

    const/4 v5, 0x5

    invoke-direct {v4, v1, v5}, Lqn0/j;-><init>(Lkotlin/jvm/functions/Function1;I)V

    invoke-virtual {v3, v4}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_a
    check-cast v4, Lc93/a;

    invoke-static {v6, v4, v3, v9}, Lk80/o;->b(Lc93/a;Lc93/a;Landroidx/compose/runtime/Composer;I)V

    invoke-virtual {v3, v9}, Lp1/q;->q(Z)V

    move-object v2, v1

    move-object v4, v3

    goto/16 :goto_c

    :cond_b
    const v4, 0x769bfcd3

    invoke-virtual {v3, v4}, Lp1/q;->e0(I)V

    sget-object v4, Lb2/t;->w:Lb2/t;

    invoke-static {v4}, Lgb1/b0;->b0(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v12

    const/high16 v13, 0x3f800000    # 1.0f

    invoke-static {v13, v12}, Landroidx/compose/foundation/layout/d;->d(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v12

    int-to-float v5, v5

    const/16 v13, 0x8

    int-to-float v13, v13

    mul-float/2addr v5, v13

    const-wide/high16 v14, 0x401d000000000000L    # 7.25

    double-to-float v14, v14

    mul-float/2addr v14, v13

    const/16 v15, 0xd

    int-to-float v15, v15

    mul-float/2addr v15, v13

    invoke-static {v12, v5, v14, v5, v15}, Landroidx/compose/foundation/layout/a;->s(Landroidx/compose/ui/Modifier;FFFF)Landroidx/compose/ui/Modifier;

    move-result-object v5

    sget-object v12, Ll0/m;->d:Ll0/g;

    sget-object v14, Lb2/e;->M:Lb2/k;

    const/4 v15, 0x6

    invoke-static {v12, v14, v3, v15}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v12

    iget-wide v14, v3, Lp1/q;->T:J

    invoke-static {v14, v15}, Ljava/lang/Long;->hashCode(J)I

    move-result v14

    invoke-virtual {v3}, Lp1/q;->m()Lp1/p1;

    move-result-object v15

    invoke-static {v3, v5}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v5

    sget-object v16, La3/l;->a:La3/k;

    invoke-virtual/range {v16 .. v16}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v6, La3/k;->b:La3/j;

    invoke-virtual {v3}, Lp1/q;->i0()V

    move/from16 v16, v7

    iget-boolean v7, v3, Lp1/q;->S:Z

    if-eqz v7, :cond_c

    invoke-virtual {v3, v6}, Lp1/q;->l(Lc93/a;)V

    goto :goto_6

    :cond_c
    invoke-virtual {v3}, Lp1/q;->s0()V

    :goto_6
    sget-object v6, La3/k;->g:La3/i;

    invoke-static {v3, v6, v12}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v6, La3/k;->f:La3/i;

    invoke-static {v3, v6, v15}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v6, La3/k;->j:La3/i;

    iget-boolean v7, v3, Lp1/q;->S:Z

    if-nez v7, :cond_d

    invoke-virtual {v3}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v7

    invoke-static {v14}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v12

    invoke-static {v7, v12}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_e

    :cond_d
    invoke-static {v14, v3, v14, v6}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_e
    sget-object v6, La3/k;->d:La3/i;

    invoke-static {v3, v6, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual {v0}, Lr80/f;->i()Lcom/whoop/design/util/TextResource;

    move-result-object v5

    sget v6, Lcom/whoop/design/util/TextResource;->$stable:I

    invoke-static {v5, v3, v6}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v5

    sget-object v7, Lx81/d;->a:Lx81/d;

    sget v12, Lx81/d;->b:I

    invoke-virtual {v7, v3, v12}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v14

    invoke-virtual {v14}, Lb91/d;->O()Lb91/a;

    move-result-object v24

    invoke-virtual {v7, v3, v12}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v14

    invoke-virtual {v14}, Ly81/i;->y()J

    move-result-wide v14

    sget v17, Lb91/a;->d:I

    shl-int/lit8 v28, v17, 0x12

    const v29, 0x2fffa

    move-object/from16 v17, v4

    move-object v4, v5

    const/4 v5, 0x0

    move/from16 v18, v8

    move/from16 v19, v9

    const-wide/16 v8, 0x0

    move/from16 v20, v10

    const/4 v10, 0x0

    move-object/from16 v21, v11

    const/4 v11, 0x0

    move/from16 v22, v12

    const/4 v12, 0x0

    move/from16 v23, v6

    move-object/from16 v25, v7

    move-wide v6, v14

    move v15, v13

    const-wide/16 v13, 0x0

    move/from16 v26, v15

    const/4 v15, 0x0

    move/from16 v27, v16

    const/16 v16, 0x0

    move-object/from16 v31, v17

    move/from16 v32, v18

    const-wide/16 v17, 0x0

    move/from16 v33, v19

    const/16 v19, 0x0

    move/from16 v34, v20

    const/16 v20, 0x0

    move-object/from16 v35, v21

    const/16 v21, 0x0

    move/from16 v36, v22

    const/16 v22, 0x0

    move/from16 v37, v23

    const/16 v23, 0x0

    move-object/from16 v38, v25

    const/16 v25, 0x0

    move/from16 v39, v27

    const/16 v27, 0x0

    move/from16 p2, v26

    move-object/from16 v0, v31

    move/from16 v1, v34

    move-object/from16 v40, v35

    move/from16 v2, v37

    move-object/from16 v26, v3

    move-object/from16 v3, v38

    invoke-static/range {v4 .. v29}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v4, v26

    int-to-float v5, v1

    mul-float v5, v5, p2

    invoke-static {v5, v0}, Landroidx/compose/foundation/layout/d;->h(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v5

    invoke-static {v4, v5}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    invoke-virtual/range {p0 .. p0}, Lr80/f;->d()Lcom/whoop/design/util/TextResource;

    move-result-object v5

    invoke-static {v5, v4, v2}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v2

    move/from16 v5, v36

    invoke-virtual {v3, v4, v5}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v6

    invoke-virtual {v6}, Lb91/d;->a()Lb91/a;

    move-result-object v24

    invoke-virtual {v3, v4, v5}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v3

    invoke-virtual {v3}, Ly81/i;->c1()J

    move-result-wide v6

    const/4 v5, 0x0

    move-object v4, v2

    invoke-static/range {v4 .. v29}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v4, v26

    const/4 v2, 0x4

    int-to-float v2, v2

    mul-float v2, v2, p2

    invoke-static {v2, v0}, Landroidx/compose/foundation/layout/d;->h(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    invoke-static {v4, v2}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    const v2, -0x1a57677a

    invoke-virtual {v4, v2}, Lp1/q;->e0(I)V

    invoke-virtual/range {p0 .. p0}, Lr80/f;->h()Ljava/util/List;

    move-result-object v2

    check-cast v2, Ljava/lang/Iterable;

    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_7
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_13

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lr80/e;

    invoke-virtual/range {p0 .. p0}, Lr80/f;->e()Lr80/a;

    move-result-object v5

    invoke-virtual {v3}, Lr80/e;->a()Lr80/a;

    move-result-object v6

    if-ne v5, v6, :cond_f

    move v9, v1

    goto :goto_8

    :cond_f
    const/4 v9, 0x0

    :goto_8
    invoke-virtual {v4, v3}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v5

    and-int/lit8 v6, v30, 0x70

    const/16 v7, 0x20

    if-ne v6, v7, :cond_10

    move v6, v1

    goto :goto_9

    :cond_10
    const/4 v6, 0x0

    :goto_9
    or-int/2addr v5, v6

    move-object/from16 v6, p0

    invoke-virtual {v4, v6}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v8

    or-int/2addr v5, v8

    invoke-virtual {v4}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v8

    if-nez v5, :cond_12

    move-object/from16 v5, v40

    if-ne v8, v5, :cond_11

    goto :goto_a

    :cond_11
    move-object/from16 v11, p1

    goto :goto_b

    :cond_12
    move-object/from16 v5, v40

    :goto_a
    new-instance v8, Lno0/j0;

    const/16 v10, 0x18

    move-object/from16 v11, p1

    invoke-direct {v8, v3, v11, v6, v10}, Lno0/j0;-><init>(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Ljava/lang/Object;I)V

    invoke-virtual {v4, v8}, Lp1/q;->p0(Ljava/lang/Object;)V

    :goto_b
    check-cast v8, Lkotlin/jvm/functions/Function1;

    sget v10, Lcom/whoop/design/util/TextResource;->$stable:I

    invoke-static {v3, v9, v8, v4, v10}, Lr80/d;->l(Lr80/e;ZLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    const-wide/high16 v8, 0x3ff8000000000000L    # 1.5

    double-to-float v3, v8

    move/from16 v15, p2

    invoke-static {v3, v15, v0, v4}, Ld;->w(FFLb2/t;Lp1/q;)V

    move-object/from16 v40, v5

    goto :goto_7

    :cond_13
    const/4 v3, 0x0

    move-object/from16 v6, p0

    move-object/from16 v11, p1

    invoke-virtual {v4, v3}, Lp1/q;->q(Z)V

    invoke-virtual {v6}, Lr80/f;->f()Lcom/whoop/design/util/TextResource;

    move-result-object v0

    sget v2, Lcom/whoop/design/util/TextResource;->$stable:I

    invoke-static {v0, v4, v2}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v0

    sget-object v2, Lx81/d;->a:Lx81/d;

    sget v3, Lx81/d;->b:I

    invoke-virtual {v2, v4, v3}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v5

    invoke-virtual {v5}, Lb91/d;->a()Lb91/a;

    move-result-object v24

    invoke-virtual {v2, v4, v3}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v2

    invoke-virtual {v2}, Ly81/i;->c1()J

    move-result-wide v2

    sget v5, Lb91/a;->d:I

    shl-int/lit8 v28, v5, 0x12

    const v29, 0x2fffa

    const/4 v5, 0x0

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

    move-object/from16 v26, v4

    move-object v4, v0

    move-object v0, v6

    move-wide v6, v2

    move-object/from16 v2, p1

    invoke-static/range {v4 .. v29}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v4, v26

    invoke-virtual {v4, v1}, Lp1/q;->q(Z)V

    const/4 v3, 0x0

    invoke-virtual {v4, v3}, Lp1/q;->q(Z)V

    goto :goto_c

    :cond_14
    move-object v2, v1

    move-object v4, v3

    invoke-virtual {v4}, Lp1/q;->X()V

    :goto_c
    invoke-virtual {v4}, Lp1/q;->u()Lp1/v1;

    move-result-object v1

    if-eqz v1, :cond_15

    new-instance v3, Lq81/e;

    const/16 v4, 0xf

    move/from16 v5, p3

    invoke-direct {v3, v0, v2, v5, v4}, Lq81/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;II)V

    iput-object v3, v1, Lp1/v1;->d:Lc93/m;

    :cond_15
    return-void
.end method

.method private static final h(Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 2

    new-instance v0, Lj80/a$m0;

    sget-object v1, Lcom/whoop/activation/view/navigation/ActivationFlowDestination;->ACCOUNT_ACTIVATION:Lcom/whoop/activation/view/navigation/ActivationFlowDestination;

    invoke-direct {v0, v1}, Lj80/a$m0;-><init>(Lcom/whoop/activation/view/navigation/ActivationFlowDestination;)V

    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final i(Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 2

    new-instance v0, Lj80/a$m0;

    sget-object v1, Lcom/whoop/activation/view/navigation/ActivationFlowDestination;->ACCOUNT_ACTIVATION:Lcom/whoop/activation/view/navigation/ActivationFlowDestination;

    invoke-direct {v0, v1}, Lj80/a$m0;-><init>(Lcom/whoop/activation/view/navigation/ActivationFlowDestination;)V

    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final j(Lr80/e;Lkotlin/jvm/functions/Function1;Lr80/f;Lr80/a;)Ll83/a0;
    .locals 9

    const-string v0, "it"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lr80/e;->a()Lr80/a;

    move-result-object p0

    if-eqz p0, :cond_0

    new-instance p3, Lj80/a$d0;

    invoke-direct {p3, p0}, Lj80/a$d0;-><init>(Lr80/a;)V

    invoke-interface {p1, p3}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v0, Lh80/b$i;

    invoke-virtual {p2}, Lr80/f;->c()Ljava/lang/String;

    move-result-object v1

    invoke-static {p0}, Lr80/d;->o(Lr80/a;)Ljava/lang/String;

    move-result-object v4

    const/16 v7, 0x22

    const/4 v8, 0x0

    const/4 v2, 0x0

    const-string v3, "tile"

    const-string v5, "membership"

    const/4 v6, 0x0

    invoke-direct/range {v0 .. v8}, Lh80/b$i;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {p1, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final k(Lr80/f;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, Lp1/x;->L(I)I

    move-result p2

    invoke-static {p0, p1, p3, p2}, Lr80/d;->g(Lr80/f;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final l(Lr80/e;ZLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V
    .locals 36
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lr80/e;",
            "Z",
            "Lkotlin/jvm/functions/Function1;",
            "Landroidx/compose/runtime/Composer;",
            "I)V"
        }
    .end annotation

    move-object/from16 v1, p0

    move/from16 v2, p1

    move-object/from16 v3, p2

    move/from16 v4, p4

    move-object/from16 v0, p3

    check-cast v0, Lp1/q;

    const v5, 0x48f2e30b

    invoke-virtual {v0, v5}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v5, v4, 0x6

    const/4 v6, 0x4

    const/4 v7, 0x2

    if-nez v5, :cond_2

    and-int/lit8 v5, v4, 0x8

    if-nez v5, :cond_0

    invoke-virtual {v0, v1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v5

    goto :goto_0

    :cond_0
    invoke-virtual {v0, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v5

    :goto_0
    if-eqz v5, :cond_1

    move v5, v6

    goto :goto_1

    :cond_1
    move v5, v7

    :goto_1
    or-int/2addr v5, v4

    goto :goto_2

    :cond_2
    move v5, v4

    :goto_2
    and-int/lit8 v8, v4, 0x30

    if-nez v8, :cond_4

    invoke-virtual {v0, v2}, Lp1/q;->h(Z)Z

    move-result v8

    if-eqz v8, :cond_3

    const/16 v8, 0x20

    goto :goto_3

    :cond_3
    const/16 v8, 0x10

    :goto_3
    or-int/2addr v5, v8

    :cond_4
    and-int/lit16 v8, v4, 0x180

    const/16 v9, 0x100

    if-nez v8, :cond_6

    invoke-virtual {v0, v3}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_5

    move v8, v9

    goto :goto_4

    :cond_5
    const/16 v8, 0x80

    :goto_4
    or-int/2addr v5, v8

    :cond_6
    and-int/lit16 v8, v5, 0x93

    const/16 v10, 0x92

    const/4 v12, 0x0

    if-eq v8, v10, :cond_7

    const/4 v8, 0x1

    goto :goto_5

    :cond_7
    move v8, v12

    :goto_5
    and-int/lit8 v10, v5, 0x1

    invoke-virtual {v0, v10, v8}, Lp1/q;->U(IZ)Z

    move-result v8

    if-eqz v8, :cond_19

    and-int/lit8 v8, v5, 0xe

    if-eq v8, v6, :cond_9

    and-int/lit8 v8, v5, 0x8

    if-eqz v8, :cond_8

    invoke-virtual {v0, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_8

    goto :goto_6

    :cond_8
    move v8, v12

    goto :goto_7

    :cond_9
    :goto_6
    const/4 v8, 0x1

    :goto_7
    and-int/lit16 v5, v5, 0x380

    if-ne v5, v9, :cond_a

    const/4 v5, 0x1

    goto :goto_8

    :cond_a
    move v5, v12

    :goto_8
    or-int/2addr v5, v8

    invoke-virtual {v0}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v8

    if-nez v5, :cond_b

    sget-object v5, Lp1/l;->a:Lp1/v0;

    if-ne v8, v5, :cond_c

    :cond_b
    new-instance v8, Lqt2/e;

    const/16 v5, 0x9

    invoke-direct {v8, v1, v3, v5}, Lqt2/e;-><init>(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;I)V

    invoke-virtual {v0, v8}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_c
    move-object/from16 v17, v8

    check-cast v17, Lc93/a;

    const/16 v18, 0xf

    sget-object v13, Lb2/t;->w:Lb2/t;

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    invoke-static/range {v13 .. v18}, Landroidx/compose/foundation/a;->g(Landroidx/compose/ui/Modifier;ZLjava/lang/String;Li3/i;Lc93/a;I)Landroidx/compose/ui/Modifier;

    move-result-object v5

    move-object v8, v13

    const/high16 v9, 0x3f800000    # 1.0f

    invoke-static {v9, v5}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v5

    if-eqz v2, :cond_d

    const v10, -0x2839822b

    invoke-virtual {v0, v10}, Lp1/q;->e0(I)V

    sget-object v10, Lx81/d;->a:Lx81/d;

    sget v13, Lx81/d;->b:I

    invoke-static {v10, v0, v13, v12}, Lr80/c;->D(Lx81/d;Lp1/q;IZ)J

    move-result-wide v13

    goto :goto_9

    :cond_d
    const v10, -0x28397dee

    invoke-virtual {v0, v10}, Lp1/q;->e0(I)V

    sget-object v10, Lx81/d;->a:Lx81/d;

    sget v13, Lx81/d;->b:I

    invoke-static {v10, v0, v13, v12}, Lr80/c;->d(Lx81/d;Lp1/q;IZ)J

    move-result-wide v13

    :goto_9
    const/4 v10, 0x3

    int-to-float v10, v10

    int-to-float v6, v6

    invoke-static {v5, v10, v6, v13, v14}, Lr80/c;->e(Landroidx/compose/ui/Modifier;FFJ)Landroidx/compose/ui/Modifier;

    move-result-object v5

    int-to-float v6, v7

    const/16 v7, 0x8

    int-to-float v7, v7

    mul-float/2addr v6, v7

    invoke-static {v5, v6, v6}, Landroidx/compose/foundation/layout/a;->q(Landroidx/compose/ui/Modifier;FF)Landroidx/compose/ui/Modifier;

    move-result-object v5

    sget-object v6, Ll0/m;->a:Ll0/e;

    sget-object v10, Lb2/e;->J:Lb2/l;

    invoke-static {v6, v10, v0, v12}, Ll0/p1;->a(Ll0/i;Lb2/g;Landroidx/compose/runtime/Composer;I)Ll0/r1;

    move-result-object v6

    iget-wide v13, v0, Lp1/q;->T:J

    invoke-static {v13, v14}, Ljava/lang/Long;->hashCode(J)I

    move-result v10

    invoke-virtual {v0}, Lp1/q;->m()Lp1/p1;

    move-result-object v13

    invoke-static {v0, v5}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v5

    sget-object v14, La3/l;->a:La3/k;

    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v14, La3/k;->b:La3/j;

    invoke-virtual {v0}, Lp1/q;->i0()V

    iget-boolean v15, v0, Lp1/q;->S:Z

    if-eqz v15, :cond_e

    invoke-virtual {v0, v14}, Lp1/q;->l(Lc93/a;)V

    goto :goto_a

    :cond_e
    invoke-virtual {v0}, Lp1/q;->s0()V

    :goto_a
    sget-object v15, La3/k;->g:La3/i;

    invoke-static {v0, v15, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v6, La3/k;->f:La3/i;

    invoke-static {v0, v6, v13}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v13, La3/k;->j:La3/i;

    iget-boolean v9, v0, Lp1/q;->S:Z

    if-nez v9, :cond_f

    invoke-virtual {v0}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v9

    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v11

    invoke-static {v9, v11}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v9

    if-nez v9, :cond_10

    :cond_f
    invoke-static {v10, v0, v10, v13}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_10
    sget-object v9, La3/k;->d:La3/i;

    invoke-static {v0, v9, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v5, Ll0/m;->c:Ll0/g;

    sget-object v10, Lb2/e;->M:Lb2/k;

    invoke-static {v5, v10, v0, v12}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v5

    iget-wide v10, v0, Lp1/q;->T:J

    invoke-static {v10, v11}, Ljava/lang/Long;->hashCode(J)I

    move-result v10

    invoke-virtual {v0}, Lp1/q;->m()Lp1/p1;

    move-result-object v11

    invoke-static {v0, v8}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v12

    invoke-virtual {v0}, Lp1/q;->i0()V

    iget-boolean v1, v0, Lp1/q;->S:Z

    if-eqz v1, :cond_11

    invoke-virtual {v0, v14}, Lp1/q;->l(Lc93/a;)V

    goto :goto_b

    :cond_11
    invoke-virtual {v0}, Lp1/q;->s0()V

    :goto_b
    invoke-static {v0, v15, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v0, v6, v11}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v1, v0, Lp1/q;->S:Z

    if-nez v1, :cond_12

    invoke-virtual {v0}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-static {v1, v5}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_13

    :cond_12
    invoke-static {v10, v0, v10, v13}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_13
    invoke-static {v0, v9, v12}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual/range {p0 .. p0}, Lr80/e;->c()Lcom/whoop/design/util/TextResource;

    move-result-object v1

    sget v5, Lcom/whoop/design/util/TextResource;->$stable:I

    invoke-static {v1, v0, v5}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v1

    sget-object v6, Lx81/d;->a:Lx81/d;

    sget v9, Lx81/d;->b:I

    invoke-virtual {v6, v0, v9}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v10

    invoke-virtual {v10}, Lb91/d;->L()Lb91/a;

    move-result-object v25

    if-eqz v2, :cond_14

    const v10, 0x23ffcf6f

    invoke-virtual {v0, v10}, Lp1/q;->e0(I)V

    invoke-virtual {v6, v0, v9}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v10

    invoke-virtual {v10}, Ly81/i;->w()J

    move-result-wide v10

    const/4 v12, 0x0

    :goto_c
    invoke-virtual {v0, v12}, Lp1/q;->q(Z)V

    goto :goto_d

    :cond_14
    const/4 v12, 0x0

    const v10, 0x23ffd3af

    invoke-static {v0, v10, v6, v0, v9}, Lm4/a;->B(Lp1/q;ILx81/d;Lp1/q;I)J

    move-result-wide v10

    goto :goto_c

    :goto_d
    sget v13, Lb91/a;->d:I

    shl-int/lit8 v29, v13, 0x12

    const v30, 0x2fffa

    move-object v13, v6

    const/4 v6, 0x0

    move v14, v7

    move-object v15, v8

    move-wide v7, v10

    move v11, v9

    const-wide/16 v9, 0x0

    move/from16 v17, v11

    const/4 v11, 0x0

    move/from16 v18, v12

    const/4 v12, 0x0

    move-object/from16 v19, v13

    const/4 v13, 0x0

    move/from16 v20, v14

    move-object/from16 v21, v15

    const-wide/16 v14, 0x0

    const/16 v22, 0x1

    const/16 v16, 0x0

    move/from16 v23, v17

    const/16 v17, 0x0

    move/from16 v26, v18

    move-object/from16 v24, v19

    const-wide/16 v18, 0x0

    move/from16 v27, v20

    const/16 v20, 0x0

    move-object/from16 v28, v21

    const/16 v21, 0x0

    move/from16 v31, v22

    const/16 v22, 0x0

    move/from16 v32, v23

    const/16 v23, 0x0

    move-object/from16 v33, v24

    const/16 v24, 0x0

    move/from16 v34, v26

    const/16 v26, 0x0

    move-object/from16 v35, v28

    const/16 v28, 0x0

    move/from16 p3, v27

    move/from16 v2, v32

    move-object/from16 v3, v35

    move-object/from16 v27, v0

    move v0, v5

    move-object v5, v1

    move-object/from16 v1, v33

    invoke-static/range {v5 .. v30}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v5, v27

    const-wide/high16 v6, 0x3fe0000000000000L    # 0.5

    double-to-float v6, v6

    mul-float v6, v6, p3

    invoke-static {v6, v3}, Landroidx/compose/foundation/layout/d;->h(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    invoke-static {v5, v3}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    invoke-virtual/range {p0 .. p0}, Lr80/e;->b()Lcom/whoop/design/util/TextResource;

    move-result-object v3

    invoke-static {v3, v5, v0}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v1, v5, v2}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v6

    invoke-virtual {v6}, Lb91/d;->d()Lb91/a;

    move-result-object v25

    if-eqz p1, :cond_15

    const v6, 0x23fff54f

    invoke-virtual {v5, v6}, Lp1/q;->e0(I)V

    invoke-virtual {v1, v5, v2}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v6

    invoke-virtual {v6}, Ly81/i;->w()J

    move-result-wide v6

    const/4 v12, 0x0

    :goto_e
    invoke-virtual {v5, v12}, Lp1/q;->q(Z)V

    move-wide v7, v6

    goto :goto_f

    :cond_15
    const/4 v12, 0x0

    const v6, 0x23fff98f

    invoke-static {v5, v6, v1, v5, v2}, Lm4/a;->B(Lp1/q;ILx81/d;Lp1/q;I)J

    move-result-wide v6

    goto :goto_e

    :goto_f
    const/16 v28, 0x0

    const v30, 0x2fffa

    const/4 v6, 0x0

    const-wide/16 v9, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

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

    move-object/from16 v27, v5

    move-object v5, v3

    invoke-static/range {v5 .. v30}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v5, v27

    const/4 v3, 0x1

    invoke-virtual {v5, v3}, Lp1/q;->q(Z)V

    invoke-virtual/range {p0 .. p0}, Lr80/e;->d()Lcom/whoop/design/util/TextResource;

    move-result-object v3

    if-nez v3, :cond_16

    const v0, -0x7cfcbff2

    invoke-virtual {v5, v0}, Lp1/q;->e0(I)V

    const/4 v12, 0x0

    invoke-virtual {v5, v12}, Lp1/q;->q(Z)V

    :goto_10
    const/4 v3, 0x1

    goto :goto_12

    :cond_16
    const v6, -0x7cfcbff1

    invoke-virtual {v5, v6}, Lp1/q;->e0(I)V

    const/high16 v6, 0x3f800000    # 1.0f

    float-to-double v7, v6

    const-wide/16 v9, 0x0

    cmpl-double v7, v7, v9

    if-lez v7, :cond_17

    const/4 v11, 0x1

    goto :goto_11

    :cond_17
    const/4 v11, 0x0

    :goto_11
    if-nez v11, :cond_18

    const-string v7, "invalid weight; must be greater than zero"

    invoke-static {v7}, Lm0/a;->a(Ljava/lang/String;)V

    :cond_18
    const/4 v7, 0x1

    invoke-static {v6, v7, v5}, Ldc/b;->y(FZLp1/q;)V

    invoke-static {v3, v5, v0}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1, v5, v2}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v3

    invoke-virtual {v3}, Lb91/d;->s()Lb91/a;

    move-result-object v25

    invoke-virtual {v1, v5, v2}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v1

    invoke-virtual {v1}, Ly81/i;->x()J

    move-result-wide v7

    new-instance v1, Lw3/k;

    const/4 v2, 0x6

    invoke-direct {v1, v2}, Lw3/k;-><init>(I)V

    const/16 v28, 0x0

    const v30, 0x2fdfa

    const/4 v6, 0x0

    const-wide/16 v9, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const-wide/16 v14, 0x0

    const/16 v16, 0x0

    const-wide/16 v18, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v26, 0x0

    move-object/from16 v17, v1

    move-object/from16 v27, v5

    move-object v5, v0

    invoke-static/range {v5 .. v30}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v5, v27

    const/4 v12, 0x0

    invoke-virtual {v5, v12}, Lp1/q;->q(Z)V

    goto :goto_10

    :goto_12
    invoke-virtual {v5, v3}, Lp1/q;->q(Z)V

    goto :goto_13

    :cond_19
    move-object v5, v0

    invoke-virtual {v5}, Lp1/q;->X()V

    :goto_13
    invoke-virtual {v5}, Lp1/q;->u()Lp1/v1;

    move-result-object v6

    if-eqz v6, :cond_1a

    new-instance v0, Lar2/f;

    const/16 v5, 0x1d

    move-object/from16 v1, p0

    move/from16 v2, p1

    move-object/from16 v3, p2

    invoke-direct/range {v0 .. v5}, Lar2/f;-><init>(Ljava/lang/Object;ZLjava/lang/Object;II)V

    iput-object v0, v6, Lp1/v1;->d:Lc93/m;

    :cond_1a
    return-void
.end method

.method private static final m(Lr80/e;Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 0

    invoke-virtual {p0}, Lr80/e;->a()Lr80/a;

    move-result-object p0

    if-eqz p0, :cond_0

    invoke-interface {p1, p0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final n(Lr80/e;ZLkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p3, p3, 0x1

    invoke-static {p3}, Lp1/x;->L(I)I

    move-result p3

    invoke-static {p0, p1, p2, p4, p3}, Lr80/d;->l(Lr80/e;ZLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final o(Lr80/a;)Ljava/lang/String;
    .locals 1

    sget-object v0, Lr80/d$a;->a:[I

    invoke-virtual {p0}, Ljava/lang/Enum;->ordinal()I

    move-result p0

    aget p0, v0, p0

    const/4 v0, 0x1

    if-eq p0, v0, :cond_1

    const/4 v0, 0x2

    if-ne p0, v0, :cond_0

    const-string p0, "1YR"

    return-object p0

    :cond_0
    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p0

    :cond_1
    const-string p0, "monthly"

    return-object p0
.end method
