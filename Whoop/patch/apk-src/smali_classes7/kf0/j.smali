.class public abstract Lkf0/j;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0006\u001a+\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0007\u00a2\u0006\u0004\u0008\u0006\u0010\u0007\u001a#\u0010\r\u001a\u00020\u0008*\u00020\u00082\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000c\u001a\u00020\u000bH\u0000\u00a2\u0006\u0004\u0008\r\u0010\u000e\u001a\u001b\u0010\u000f\u001a\u00020\u0008*\u00020\u00082\u0006\u0010\u000c\u001a\u00020\u000bH\u0000\u00a2\u0006\u0004\u0008\u000f\u0010\u0010\u00a8\u0006\u0011"
    }
    d2 = {
        "Lkf0/k;",
        "state",
        "Lkotlin/Function1;",
        "",
        "Ll83/a0;",
        "onViewEvent",
        "f",
        "(Lkf0/k;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V",
        "Landroidx/compose/ui/Modifier;",
        "Lm91/u;",
        "item",
        "",
        "sectionId",
        "l",
        "(Landroidx/compose/ui/Modifier;Lm91/u;Ljava/lang/String;)Landroidx/compose/ui/Modifier;",
        "m",
        "(Landroidx/compose/ui/Modifier;Ljava/lang/String;)Landroidx/compose/ui/Modifier;",
        "advanced-labs_release"
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

    invoke-static {p0}, Lkf0/j;->h(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;
    .locals 0

    invoke-static {p0}, Lkf0/j;->j(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Lm91/u;Lkf0/k;Lm91/u;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/Modifier;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Lkf0/j;->i(Lm91/u;Lkf0/k;Lm91/u;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/Modifier;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Lkf0/k;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Lkf0/j;->k(Lkf0/k;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic e(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;
    .locals 0

    invoke-static {p0}, Lkf0/j;->g(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object p0

    return-object p0
.end method

.method public static final f(Lkf0/k;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V
    .locals 42
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkf0/k;",
            "Lkotlin/jvm/functions/Function1;",
            "Landroidx/compose/runtime/Composer;",
            "I)V"
        }
    .end annotation

    move-object/from16 v0, p0

    move-object/from16 v4, p1

    const-string v1, "state"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "onViewEvent"

    invoke-static {v4, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v5, p2

    check-cast v5, Lp1/q;

    const v1, -0xcbf64d2

    invoke-virtual {v5, v1}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v1, p3, 0x6

    if-nez v1, :cond_1

    invoke-virtual {v5, v0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, 0x4

    goto :goto_0

    :cond_0
    const/4 v1, 0x2

    :goto_0
    or-int v1, p3, v1

    goto :goto_1

    :cond_1
    move/from16 v1, p3

    :goto_1
    and-int/lit8 v2, p3, 0x30

    if-nez v2, :cond_3

    invoke-virtual {v5, v4}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_2

    const/16 v2, 0x20

    goto :goto_2

    :cond_2
    const/16 v2, 0x10

    :goto_2
    or-int/2addr v1, v2

    :cond_3
    move/from16 v35, v1

    and-int/lit8 v1, v35, 0x13

    const/16 v2, 0x12

    const/4 v6, 0x0

    if-eq v1, v2, :cond_4

    const/4 v1, 0x1

    goto :goto_3

    :cond_4
    move v1, v6

    :goto_3
    and-int/lit8 v7, v35, 0x1

    invoke-virtual {v5, v7, v1}, Lp1/q;->U(IZ)Z

    move-result v1

    if-eqz v1, :cond_1d

    invoke-virtual {v0}, Lkf0/k;->e()Ljava/util/List;

    move-result-object v1

    check-cast v1, Ljava/lang/Iterable;

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :cond_5
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v7

    const/4 v9, 0x0

    if-eqz v7, :cond_6

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v7

    move-object v10, v7

    check-cast v10, Lm91/u;

    instance-of v10, v10, Lh51/f;

    if-eqz v10, :cond_5

    goto :goto_4

    :cond_6
    move-object v7, v9

    :goto_4
    if-eqz v7, :cond_7

    const/4 v1, 0x1

    goto :goto_5

    :cond_7
    move v1, v6

    :goto_5
    invoke-virtual {v0}, Lkf0/k;->e()Ljava/util/List;

    move-result-object v7

    check-cast v7, Ljava/lang/Iterable;

    invoke-interface {v7}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v7

    :cond_8
    invoke-interface {v7}, Ljava/util/Iterator;->hasNext()Z

    move-result v10

    if-eqz v10, :cond_9

    invoke-interface {v7}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v10

    move-object v11, v10

    check-cast v11, Lm91/u;

    instance-of v11, v11, Ln81/f;

    if-eqz v11, :cond_8

    move-object v9, v10

    :cond_9
    if-eqz v9, :cond_a

    const/4 v7, 0x1

    goto :goto_6

    :cond_a
    move v7, v6

    :goto_6
    const/high16 v9, 0x3f800000    # 1.0f

    sget-object v10, Lb2/t;->w:Lb2/t;

    invoke-static {v9, v10}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v9

    invoke-virtual {v0}, Lkf0/k;->getId()Ljava/lang/String;

    move-result-object v11

    invoke-static {v9, v11}, Lkf0/j;->m(Landroidx/compose/ui/Modifier;Ljava/lang/String;)Landroidx/compose/ui/Modifier;

    move-result-object v9

    sget-object v11, Ll0/m;->c:Ll0/g;

    sget-object v12, Lb2/e;->M:Lb2/k;

    invoke-static {v11, v12, v5, v6}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v11

    iget-wide v13, v5, Lp1/q;->T:J

    invoke-static {v13, v14}, Ljava/lang/Long;->hashCode(J)I

    move-result v13

    invoke-virtual {v5}, Lp1/q;->m()Lp1/p1;

    move-result-object v14

    invoke-static {v5, v9}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v9

    sget-object v15, La3/l;->a:La3/k;

    invoke-virtual {v15}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v15, La3/k;->b:La3/j;

    invoke-virtual {v5}, Lp1/q;->i0()V

    move/from16 p2, v2

    iget-boolean v2, v5, Lp1/q;->S:Z

    if-eqz v2, :cond_b

    invoke-virtual {v5, v15}, Lp1/q;->l(Lc93/a;)V

    goto :goto_7

    :cond_b
    invoke-virtual {v5}, Lp1/q;->s0()V

    :goto_7
    sget-object v2, La3/k;->g:La3/i;

    invoke-static {v5, v2, v11}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v11, La3/k;->f:La3/i;

    invoke-static {v5, v11, v14}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v14, La3/k;->j:La3/i;

    iget-boolean v3, v5, Lp1/q;->S:Z

    if-nez v3, :cond_c

    invoke-virtual {v5}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    invoke-static {v13}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-static {v3, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_d

    :cond_c
    invoke-static {v13, v5, v13, v14}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_d
    sget-object v3, La3/k;->d:La3/i;

    invoke-static {v5, v3, v9}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual {v0}, Lkf0/k;->f()Ljava/lang/String;

    move-result-object v9

    sget-object v6, Lp1/l;->a:Lp1/v0;

    if-nez v9, :cond_e

    const v9, 0x166351f8

    invoke-virtual {v5, v9}, Lp1/q;->e0(I)V

    const/4 v9, 0x0

    invoke-virtual {v5, v9}, Lp1/q;->q(Z)V

    move/from16 v36, v1

    move/from16 p2, v7

    move-object/from16 v37, v10

    move-object v1, v12

    move-object v7, v14

    move-object v4, v15

    move v10, v9

    move-object v9, v5

    move-object v5, v11

    goto/16 :goto_a

    :cond_e
    const v13, 0x166351f9

    invoke-virtual {v5, v13}, Lp1/q;->e0(I)V

    sget-object v13, Lx81/d;->a:Lx81/d;

    move/from16 v36, v1

    sget v1, Lx81/d;->b:I

    invoke-virtual {v13, v5, v1}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v16

    invoke-virtual/range {v16 .. v16}, Lb91/d;->P()Lb91/a;

    move-result-object v29

    invoke-virtual {v13, v5, v1}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v1

    invoke-virtual {v1}, Ly81/i;->y()J

    move-result-wide v16

    if-nez v36, :cond_10

    if-eqz v7, :cond_f

    goto :goto_8

    :cond_f
    const/4 v1, 0x0

    goto :goto_9

    :cond_10
    :goto_8
    const/4 v1, 0x1

    :goto_9
    invoke-virtual {v5}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v13

    if-ne v13, v6, :cond_11

    new-instance v13, Lkf0/d;

    const/4 v4, 0x2

    invoke-direct {v13, v4}, Lkf0/d;-><init>(I)V

    invoke-virtual {v5, v13}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_11
    check-cast v13, Lkotlin/jvm/functions/Function1;

    invoke-static {v10, v1, v13}, Lgb1/d;->b(Landroidx/compose/ui/Modifier;ZLkotlin/jvm/functions/Function1;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    sget v4, Lb91/a;->d:I

    shl-int/lit8 v33, v4, 0x12

    const v34, 0x2fff8

    move-object v4, v14

    const-wide/16 v13, 0x0

    move-object/from16 v18, v15

    const/4 v15, 0x0

    move-object/from16 v19, v11

    move-wide/from16 v40, v16

    move-object/from16 v17, v12

    move-wide/from16 v11, v40

    const/16 v16, 0x0

    move-object/from16 v20, v17

    const/16 v17, 0x0

    move-object/from16 v21, v18

    move-object/from16 v22, v19

    const-wide/16 v18, 0x0

    move-object/from16 v23, v20

    const/16 v20, 0x0

    move-object/from16 v24, v21

    const/16 v21, 0x0

    move-object/from16 v26, v22

    move-object/from16 v25, v23

    const-wide/16 v22, 0x0

    move-object/from16 v27, v24

    const/16 v24, 0x0

    move-object/from16 v28, v25

    const/16 v25, 0x0

    move-object/from16 v30, v26

    const/16 v26, 0x0

    move-object/from16 v31, v27

    const/16 v27, 0x0

    move-object/from16 v32, v28

    const/16 v28, 0x0

    move-object/from16 v37, v30

    const/16 v30, 0x0

    move-object/from16 v38, v32

    const/16 v32, 0x0

    move/from16 p2, v7

    move-object v7, v4

    move-object/from16 v4, v31

    move-object/from16 v31, v5

    move-object/from16 v5, v37

    move-object/from16 v37, v10

    move-object v10, v1

    move-object/from16 v1, v38

    invoke-static/range {v9 .. v34}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v9, v31

    const/4 v10, 0x0

    invoke-virtual {v9, v10}, Lp1/q;->q(Z)V

    :goto_a
    invoke-virtual {v0}, Lkf0/k;->c()Ljava/lang/String;

    move-result-object v38

    const/16 v11, 0x8

    if-nez v38, :cond_12

    const v6, 0x1669b0fb

    invoke-virtual {v9, v6}, Lp1/q;->e0(I)V

    invoke-virtual {v9, v10}, Lp1/q;->q(Z)V

    move v8, v11

    move-object/from16 v6, v37

    goto/16 :goto_e

    :cond_12
    const v10, 0x1669b0fc

    invoke-virtual {v9, v10}, Lp1/q;->e0(I)V

    sget-object v10, Liz0/l;->a:Liz0/l;

    sget-object v12, Lx81/d;->a:Lx81/d;

    sget v13, Lx81/d;->b:I

    move-object v14, v10

    invoke-static {v12, v9, v13}, Lte0/d;->t(Lx81/d;Lp1/q;I)Ll3/v0;

    move-result-object v10

    invoke-virtual {v12, v9, v13}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v15

    invoke-virtual {v15}, Ly81/i;->c1()J

    move-result-wide v15

    invoke-virtual {v12, v9, v13}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v12

    invoke-virtual {v12}, Ly81/i;->k0()J

    move-result-wide v12

    sget v17, Liz0/l;->b:I

    shl-int/lit8 v33, v17, 0xf

    const/16 v34, 0x7ff8

    move-object/from16 v31, v9

    move/from16 v17, v11

    move-object v9, v14

    move-wide v13, v12

    move-wide v11, v15

    const-wide/16 v15, 0x0

    move/from16 v18, v17

    const/16 v17, 0x0

    move/from16 v20, v18

    const-wide/16 v18, 0x0

    move/from16 v21, v20

    const/16 v20, 0x0

    move/from16 v23, v21

    const-wide/16 v21, 0x0

    move/from16 v24, v23

    const/16 v23, 0x0

    move/from16 v26, v24

    const-wide/16 v24, 0x0

    move/from16 v27, v26

    const/16 v26, 0x0

    move/from16 v28, v27

    const/16 v27, 0x0

    move/from16 v29, v28

    const/16 v28, 0x0

    move/from16 v30, v29

    const/16 v29, 0x0

    move/from16 v32, v30

    const/16 v30, 0x0

    move/from16 v39, v32

    const/16 v32, 0x0

    move/from16 v8, v39

    invoke-virtual/range {v9 .. v34}, Liz0/l;->a(Ll3/v0;JJJLp3/r;JIJLiz0/a;JFFZZFLandroidx/compose/runtime/Composer;III)Liz0/m;

    move-result-object v9

    const/4 v10, 0x1

    int-to-float v11, v10

    int-to-float v10, v8

    mul-float v12, v11, v10

    const/4 v14, 0x0

    const/16 v15, 0xd

    const/4 v11, 0x0

    const/4 v13, 0x0

    move-object/from16 v18, v31

    move-object/from16 v10, v37

    invoke-static/range {v10 .. v15}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v11

    if-nez v36, :cond_14

    if-eqz p2, :cond_13

    goto :goto_b

    :cond_13
    const/4 v10, 0x0

    goto :goto_c

    :cond_14
    :goto_b
    const/4 v10, 0x1

    :goto_c
    invoke-virtual/range {v18 .. v18}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v12

    if-ne v12, v6, :cond_15

    new-instance v12, Lkf0/d;

    const/4 v6, 0x3

    invoke-direct {v12, v6}, Lkf0/d;-><init>(I)V

    move-object/from16 v6, v18

    invoke-virtual {v6, v12}, Lp1/q;->p0(Ljava/lang/Object;)V

    goto :goto_d

    :cond_15
    move-object/from16 v6, v18

    :goto_d
    check-cast v12, Lkotlin/jvm/functions/Function1;

    invoke-static {v11, v10, v12}, Lgb1/d;->b(Landroidx/compose/ui/Modifier;ZLkotlin/jvm/functions/Function1;)Landroidx/compose/ui/Modifier;

    move-result-object v10

    sget v11, Liz0/m;->p:I

    shl-int/lit8 v19, v11, 0x9

    const/16 v20, 0x1f4

    const/4 v11, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    move-object/from16 v18, v6

    move-object v12, v9

    move-object/from16 v6, v37

    move-object/from16 v9, v38

    invoke-static/range {v9 .. v20}, Liz0/g;->M(Ljava/lang/String;Landroidx/compose/ui/Modifier;ZLiz0/m;Lkotlin/jvm/functions/Function1;IIIZLandroidx/compose/runtime/Composer;II)V

    move-object/from16 v9, v18

    const/4 v10, 0x0

    invoke-virtual {v9, v10}, Lp1/q;->q(Z)V

    :goto_e
    invoke-virtual {v0}, Lkf0/k;->f()Ljava/lang/String;

    move-result-object v10

    if-nez v10, :cond_17

    invoke-virtual {v0}, Lkf0/k;->c()Ljava/lang/String;

    move-result-object v10

    if-eqz v10, :cond_16

    goto :goto_f

    :cond_16
    const/4 v10, 0x1

    const/4 v13, 0x0

    goto :goto_10

    :cond_17
    :goto_f
    invoke-virtual {v0}, Lkf0/k;->e()Ljava/util/List;

    move-result-object v10

    check-cast v10, Ljava/util/Collection;

    invoke-interface {v10}, Ljava/util/Collection;->isEmpty()Z

    move-result v10

    if-nez v10, :cond_16

    const v10, 0x1673ad84

    invoke-virtual {v9, v10}, Lp1/q;->e0(I)V

    const/4 v10, 0x1

    int-to-float v11, v10

    int-to-float v12, v8

    const/4 v13, 0x0

    invoke-static {v11, v12, v6, v9, v13}, Lr80/c;->z(FFLb2/t;Lp1/q;Z)V

    goto :goto_11

    :goto_10
    const v11, 0x1674873e

    invoke-virtual {v9, v11}, Lp1/q;->e0(I)V

    invoke-virtual {v9, v13}, Lp1/q;->q(Z)V

    :goto_11
    int-to-float v8, v8

    invoke-static {v8}, Ll0/m;->i(F)Ll0/k;

    move-result-object v8

    const/4 v11, 0x6

    invoke-static {v8, v1, v9, v11}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v1

    iget-wide v14, v9, Lp1/q;->T:J

    invoke-static {v14, v15}, Ljava/lang/Long;->hashCode(J)I

    move-result v8

    invoke-virtual {v9}, Lp1/q;->m()Lp1/p1;

    move-result-object v12

    invoke-static {v9, v6}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v6

    invoke-virtual {v9}, Lp1/q;->i0()V

    iget-boolean v14, v9, Lp1/q;->S:Z

    if-eqz v14, :cond_18

    invoke-virtual {v9, v4}, Lp1/q;->l(Lc93/a;)V

    goto :goto_12

    :cond_18
    invoke-virtual {v9}, Lp1/q;->s0()V

    :goto_12
    invoke-static {v9, v2, v1}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v9, v5, v12}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v1, v9, Lp1/q;->S:Z

    if-nez v1, :cond_19

    invoke-virtual {v9}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1a

    :cond_19
    invoke-static {v8, v9, v8, v7}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_1a
    invoke-static {v9, v3, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const v1, 0x536e6dc9

    invoke-virtual {v9, v1}, Lp1/q;->e0(I)V

    invoke-virtual {v0}, Lkf0/k;->e()Ljava/util/List;

    move-result-object v1

    check-cast v1, Ljava/lang/Iterable;

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v8

    :goto_13
    invoke-interface {v8}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_1c

    invoke-interface {v8}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lm91/u;

    instance-of v2, v1, Le81/n;

    if-eqz v2, :cond_1b

    move-object v14, v1

    check-cast v14, Le81/n;

    const/16 v24, 0xff

    const/16 v25, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const v23, 0x3f4ccccd    # 0.8f

    invoke-static/range {v14 .. v25}, Le81/n;->c(Le81/n;Ljava/lang/String;Le81/l;Le81/f0;Le81/a;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Le81/m;FILjava/lang/Object;)Le81/n;

    move-result-object v1

    :cond_1b
    invoke-static {}, Lmd0/c;->B0()Lm91/p;

    move-result-object v2

    new-instance v3, Lih1/f;

    const/16 v4, 0x8

    invoke-direct {v3, v4, v1, v0}, Lih1/f;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    sget v4, Lm91/p;->b:I

    shl-int/lit8 v4, v4, 0x3

    shl-int/lit8 v5, v35, 0x6

    and-int/lit16 v5, v5, 0x1c00

    or-int v6, v4, v5

    const/4 v7, 0x0

    move-object/from16 v4, p1

    move-object v5, v9

    invoke-static/range {v1 .. v7}, Lm91/l;->r(Lm91/u;Lm91/p;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    goto :goto_13

    :cond_1c
    move-object/from16 v4, p1

    invoke-static {v9, v13, v10, v10}, Lm4/a;->y(Lp1/q;ZZZ)V

    goto :goto_14

    :cond_1d
    move-object v9, v5

    invoke-virtual {v9}, Lp1/q;->X()V

    :goto_14
    invoke-virtual {v9}, Lp1/q;->u()Lp1/v1;

    move-result-object v1

    if-eqz v1, :cond_1e

    new-instance v2, Lig0/d;

    const/16 v3, 0x1c

    move/from16 v8, p3

    invoke-direct {v2, v0, v4, v8, v3}, Lig0/d;-><init>(Ljava/lang/Object;Ljava/lang/Object;II)V

    iput-object v2, v1, Lp1/v1;->d:Lc93/m;

    :cond_1e
    return-void
.end method

.method private static final g(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;
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

.method private static final h(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;
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

.method private static final i(Lm91/u;Lkf0/k;Lm91/u;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/Modifier;
    .locals 1

    const-string p4, "it"

    invoke-static {p2, p4}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p3, Lp1/q;

    const p2, 0x75ae19ac

    invoke-virtual {p3, p2}, Lp1/q;->e0(I)V

    sget-object p2, Lb2/t;->w:Lb2/t;

    invoke-virtual {p1}, Lkf0/k;->getId()Ljava/lang/String;

    move-result-object p1

    invoke-static {p2, p0, p1}, Lkf0/j;->l(Landroidx/compose/ui/Modifier;Lm91/u;Ljava/lang/String;)Landroidx/compose/ui/Modifier;

    move-result-object p1

    instance-of p2, p0, Le81/n;

    const/4 p4, 0x0

    if-eqz p2, :cond_0

    check-cast p0, Le81/n;

    invoke-virtual {p0}, Le81/n;->g()Le81/l;

    move-result-object p0

    sget-object p2, Le81/l;->PIE_BOTTOM:Le81/l;

    if-ne p0, p2, :cond_0

    const/4 p0, 0x1

    goto :goto_0

    :cond_0
    move p0, p4

    :goto_0
    invoke-virtual {p3}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object p2

    sget-object v0, Lp1/l;->a:Lp1/v0;

    if-ne p2, v0, :cond_1

    new-instance p2, Lkf0/d;

    const/4 v0, 0x4

    invoke-direct {p2, v0}, Lkf0/d;-><init>(I)V

    invoke-virtual {p3, p2}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_1
    check-cast p2, Lkotlin/jvm/functions/Function1;

    invoke-static {p1, p0, p2}, Lgb1/d;->b(Landroidx/compose/ui/Modifier;ZLkotlin/jvm/functions/Function1;)Landroidx/compose/ui/Modifier;

    move-result-object p0

    invoke-virtual {p3, p4}, Lp1/q;->q(Z)V

    return-object p0
.end method

.method private static final j(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;
    .locals 6

    const-string v0, "$this$applyIf"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/high16 p0, 0x3f800000    # 1.0f

    sget-object v0, Lb2/t;->w:Lb2/t;

    invoke-static {p0, v0}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object p0

    const/4 v1, 0x0

    const/4 v2, 0x3

    const/4 v3, 0x0

    invoke-static {p0, v3, v1, v2}, Landroidx/compose/foundation/layout/d;->y(Landroidx/compose/ui/Modifier;Lb2/m;ZI)Landroidx/compose/ui/Modifier;

    move-result-object p0

    const/4 v1, 0x2

    int-to-float v1, v1

    const/16 v2, 0x8

    int-to-float v2, v2

    mul-float v4, v1, v2

    const/4 v5, 0x7

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static/range {v0 .. v5}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v0

    invoke-interface {p0, v0}, Landroidx/compose/ui/Modifier;->e(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object p0

    return-object p0
.end method

.method private static final k(Lkf0/k;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, Lp1/x;->L(I)I

    move-result p2

    invoke-static {p0, p1, p3, p2}, Lkf0/j;->f(Lkf0/k;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static final l(Landroidx/compose/ui/Modifier;Lm91/u;Ljava/lang/String;)Landroidx/compose/ui/Modifier;
    .locals 6

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "item"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "sectionId"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p1, Lhy0/e;

    const/4 v1, 0x0

    const/4 v2, 0x1

    if-eqz v0, :cond_0

    const/16 p1, 0x10

    int-to-float p1, p1

    invoke-static {p0, v1, p1, v2}, Landroidx/compose/foundation/layout/a;->r(Landroidx/compose/ui/Modifier;FFI)Landroidx/compose/ui/Modifier;

    move-result-object p0

    return-object p0

    :cond_0
    instance-of v0, p1, Ld41/h;

    const/4 v3, 0x2

    const/16 v4, 0x8

    if-eqz v0, :cond_2

    check-cast p1, Ld41/h;

    invoke-virtual {p1}, Ld41/h;->g()Ld41/j;

    move-result-object p1

    instance-of p1, p1, Ld41/j$e;

    if-eqz p1, :cond_1

    int-to-float p1, v3

    int-to-float p2, v4

    mul-float v4, p1, p2

    const/4 v5, 0x7

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    move-object v0, p0

    invoke-static/range {v0 .. v5}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object p0

    return-object p0

    :cond_1
    move-object v0, p0

    goto/16 :goto_0

    :cond_2
    move-object v0, p0

    instance-of p0, p1, Lsz0/k1;

    if-eqz p0, :cond_3

    int-to-float p0, v3

    int-to-float p1, v4

    mul-float v4, p0, p1

    const/4 v5, 0x7

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static/range {v0 .. v5}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object p0

    return-object p0

    :cond_3
    instance-of p0, p1, Llf0/t1;

    if-eqz p0, :cond_4

    const/4 p0, 0x3

    int-to-float p0, p0

    int-to-float p1, v4

    mul-float/2addr p0, p1

    invoke-static {v0, v1, p0, v2}, Landroidx/compose/foundation/layout/a;->r(Landroidx/compose/ui/Modifier;FFI)Landroidx/compose/ui/Modifier;

    move-result-object p0

    return-object p0

    :cond_4
    instance-of p0, p1, Lq21/i;

    if-eqz p0, :cond_5

    const-wide/high16 p0, -0x3ffc000000000000L    # -2.5

    double-to-float p0, p0

    int-to-float p1, v4

    mul-float/2addr p0, p1

    invoke-static {v0, v1, p0, v2}, Landroidx/compose/foundation/layout/a;->n(Landroidx/compose/ui/Modifier;FFI)Landroidx/compose/ui/Modifier;

    move-result-object p0

    return-object p0

    :cond_5
    instance-of p0, p1, Lb01/i;

    if-eqz p0, :cond_6

    int-to-float p0, v3

    int-to-float p1, v4

    mul-float v4, p0, p1

    const/4 v5, 0x7

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static/range {v0 .. v5}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object p0

    return-object p0

    :cond_6
    instance-of p0, p1, Ll01/d;

    if-eqz p0, :cond_7

    const-wide/high16 p0, 0x3ff8000000000000L    # 1.5

    double-to-float p0, p0

    int-to-float p1, v4

    mul-float v4, p0, p1

    const/4 v5, 0x7

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static/range {v0 .. v5}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object p0

    return-object p0

    :cond_7
    instance-of p0, p1, La41/m;

    if-eqz p0, :cond_8

    int-to-float p0, v3

    int-to-float p1, v4

    mul-float v1, p0, p1

    const/4 v4, 0x0

    const/16 v5, 0x8

    move v2, v1

    move v3, v1

    invoke-static/range {v0 .. v5}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object p0

    return-object p0

    :cond_8
    instance-of p0, p1, Lny0/h;

    if-eqz p0, :cond_9

    check-cast p1, Lny0/h;

    invoke-virtual {p1}, Lny0/h;->getId()Ljava/lang/String;

    move-result-object p0

    const-string p1, "coaching_carousel_start_testing_standard_button"

    invoke-static {p0, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_b

    int-to-float p0, v2

    int-to-float p1, v4

    mul-float/2addr p0, p1

    int-to-float p2, v3

    mul-float/2addr p2, p1

    invoke-static {v0, p0, p0, p0, p2}, Landroidx/compose/foundation/layout/a;->s(Landroidx/compose/ui/Modifier;FFFF)Landroidx/compose/ui/Modifier;

    move-result-object p0

    return-object p0

    :cond_9
    instance-of p0, p1, Lc41/p2;

    if-eqz p0, :cond_a

    const-string p0, "feature_list_section"

    invoke-virtual {p2, p0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_b

    int-to-float p0, v2

    int-to-float p1, v4

    mul-float v4, p0, p1

    const/4 v5, 0x7

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    invoke-static/range {v0 .. v5}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object p0

    return-object p0

    :cond_a
    instance-of p0, p1, Lf01/q;

    if-eqz p0, :cond_b

    check-cast p1, Lf01/q;

    invoke-virtual {p1}, Lf01/q;->getId()Ljava/lang/String;

    move-result-object p0

    const-string p1, "home_upsell_featured_card"

    invoke-static {p0, p1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p0

    if-eqz p0, :cond_b

    int-to-float p0, v3

    int-to-float p1, v4

    mul-float v2, p0, p1

    const/4 v4, 0x0

    const/16 v5, 0xd

    const/4 v1, 0x0

    const/4 v3, 0x0

    invoke-static/range {v0 .. v5}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object p0

    return-object p0

    :cond_b
    :goto_0
    return-object v0
.end method

.method public static final m(Landroidx/compose/ui/Modifier;Ljava/lang/String;)Landroidx/compose/ui/Modifier;
    .locals 2

    const-string v0, "<this>"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "sectionId"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "faq_section"

    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_0

    const/4 p1, 0x2

    int-to-float p1, p1

    const/16 v0, 0x8

    int-to-float v0, v0

    mul-float/2addr p1, v0

    const/4 v0, 0x1

    const/4 v1, 0x0

    invoke-static {p0, v1, p1, v0}, Landroidx/compose/foundation/layout/a;->r(Landroidx/compose/ui/Modifier;FFI)Landroidx/compose/ui/Modifier;

    move-result-object p0

    :cond_0
    return-object p0
.end method
