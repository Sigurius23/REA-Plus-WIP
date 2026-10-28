.class public abstract Lq21/g;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u001a7\u0010\u0008\u001a\u00020\u00062\u0008\u0008\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0014\u0008\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0007\u00a2\u0006\u0004\u0008\u0008\u0010\t\u00a8\u0006\n"
    }
    d2 = {
        "Landroidx/compose/ui/Modifier;",
        "modifier",
        "Lq21/i;",
        "viewState",
        "Lkotlin/Function1;",
        "",
        "Ll83/a0;",
        "onViewEvent",
        "e",
        "(Landroidx/compose/ui/Modifier;Lq21/i;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V",
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
.method public static synthetic a(Lkotlin/jvm/functions/Function1;Lny0/h;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lq21/g;->g(Lkotlin/jvm/functions/Function1;Lny0/h;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Ljava/lang/Object;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lq21/g;->f(Ljava/lang/Object;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Lkotlin/jvm/functions/Function1;Lny0/p0;Ljava/lang/Object;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, Lq21/g;->h(Lkotlin/jvm/functions/Function1;Lny0/p0;Ljava/lang/Object;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Landroidx/compose/ui/Modifier;Lq21/i;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p6}, Lq21/g;->i(Landroidx/compose/ui/Modifier;Lq21/i;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final e(Landroidx/compose/ui/Modifier;Lq21/i;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V
    .locals 29
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/ui/Modifier;",
            "Lq21/i;",
            "Lkotlin/jvm/functions/Function1;",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    move-object/from16 v2, p1

    move/from16 v4, p4

    sget-object v0, Lb2/e;->K:Lb2/l;

    sget-object v1, Lb2/e;->M:Lb2/k;

    const-string v3, "viewState"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v10, p3

    check-cast v10, Lp1/q;

    const v3, -0x187f0380

    invoke-virtual {v10, v3}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v3, p5, 0x1

    const/4 v13, 0x2

    if-eqz v3, :cond_0

    or-int/lit8 v5, v4, 0x6

    move v6, v5

    move-object/from16 v5, p0

    goto :goto_1

    :cond_0
    and-int/lit8 v5, v4, 0x6

    if-nez v5, :cond_2

    move-object/from16 v5, p0

    invoke-virtual {v10, v5}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_1

    const/4 v6, 0x4

    goto :goto_0

    :cond_1
    move v6, v13

    :goto_0
    or-int/2addr v6, v4

    goto :goto_1

    :cond_2
    move-object/from16 v5, p0

    move v6, v4

    :goto_1
    and-int/lit8 v7, v4, 0x30

    if-nez v7, :cond_4

    invoke-virtual {v10, v2}, Lp1/q;->i(Ljava/lang/Object;)Z

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

    goto :goto_4

    :cond_6
    and-int/lit16 v8, v4, 0x180

    if-nez v8, :cond_5

    move-object/from16 v8, p2

    invoke-virtual {v10, v8}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_7

    const/16 v9, 0x100

    goto :goto_3

    :cond_7
    const/16 v9, 0x80

    :goto_3
    or-int/2addr v6, v9

    :goto_4
    and-int/lit16 v9, v6, 0x93

    const/16 v11, 0x92

    if-eq v9, v11, :cond_8

    const/4 v9, 0x1

    goto :goto_5

    :cond_8
    const/4 v9, 0x0

    :goto_5
    and-int/lit8 v11, v6, 0x1

    invoke-virtual {v10, v11, v9}, Lp1/q;->U(IZ)Z

    move-result v9

    if-eqz v9, :cond_4a

    sget-object v9, Lb2/t;->w:Lb2/t;

    if-eqz v3, :cond_9

    move-object v3, v9

    goto :goto_6

    :cond_9
    move-object v3, v5

    :goto_6
    sget-object v5, Lp1/l;->a:Lp1/v0;

    if-eqz v7, :cond_b

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v7

    if-ne v7, v5, :cond_a

    new-instance v7, Lpt2/k;

    const/16 v8, 0x15

    invoke-direct {v7, v8}, Lpt2/k;-><init>(I)V

    invoke-virtual {v10, v7}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_a
    check-cast v7, Lkotlin/jvm/functions/Function1;

    goto :goto_7

    :cond_b
    move-object v7, v8

    :goto_7
    int-to-float v8, v13

    const/16 v11, 0x8

    int-to-float v11, v11

    mul-float v16, v8, v11

    invoke-static/range {v16 .. v16}, Ll0/m;->i(F)Ll0/k;

    move-result-object v13

    sget-object v14, Lb2/e;->N:Lb2/k;

    const/16 v15, 0x36

    invoke-static {v13, v14, v10, v15}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v13

    iget-wide v14, v10, Lp1/q;->T:J

    invoke-static {v14, v15}, Ljava/lang/Long;->hashCode(J)I

    move-result v14

    invoke-virtual {v10}, Lp1/q;->m()Lp1/p1;

    move-result-object v15

    invoke-static {v10, v9}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v12

    sget-object v17, La3/l;->a:La3/k;

    invoke-virtual/range {v17 .. v17}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v2, La3/k;->b:La3/j;

    invoke-virtual {v10}, Lp1/q;->i0()V

    iget-boolean v4, v10, Lp1/q;->S:Z

    if-eqz v4, :cond_c

    invoke-virtual {v10, v2}, Lp1/q;->l(Lc93/a;)V

    goto :goto_8

    :cond_c
    invoke-virtual {v10}, Lp1/q;->s0()V

    :goto_8
    sget-object v2, La3/k;->g:La3/i;

    invoke-static {v10, v2, v13}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v2, La3/k;->f:La3/i;

    invoke-static {v10, v2, v15}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v2, La3/k;->j:La3/i;

    iget-boolean v4, v10, Lp1/q;->S:Z

    if-nez v4, :cond_d

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    invoke-static {v14}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v13

    invoke-static {v4, v13}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_e

    :cond_d
    invoke-static {v14, v10, v14, v2}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_e
    sget-object v2, La3/k;->d:La3/i;

    invoke-static {v10, v2, v12}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual/range {p1 .. p1}, Lq21/i;->g()Lq21/e;

    move-result-object v2

    if-eqz v2, :cond_f

    invoke-virtual {v2}, Lq21/e;->h()Lq21/f;

    move-result-object v2

    goto :goto_9

    :cond_f
    const/4 v2, 0x0

    :goto_9
    sget-object v12, Lq21/f;->FAMILY_PLAN:Lq21/f;

    if-eq v2, v12, :cond_10

    const/4 v2, 0x1

    goto :goto_a

    :cond_10
    const/4 v2, 0x0

    :goto_a
    invoke-virtual/range {p1 .. p1}, Lq21/i;->g()Lq21/e;

    move-result-object v13

    if-eqz v13, :cond_11

    invoke-virtual {v13}, Lq21/e;->h()Lq21/f;

    move-result-object v13

    goto :goto_b

    :cond_11
    const/4 v13, 0x0

    :goto_b
    if-ne v13, v12, :cond_12

    const/4 v13, 0x1

    goto :goto_c

    :cond_12
    const/4 v13, 0x0

    :goto_c
    invoke-virtual/range {p1 .. p1}, Lq21/i;->e()Ljava/util/List;

    move-result-object v12

    check-cast v12, Ljava/lang/Iterable;

    new-instance v14, Ljava/util/ArrayList;

    invoke-direct {v14}, Ljava/util/ArrayList;-><init>()V

    new-instance v15, Ljava/util/ArrayList;

    invoke-direct {v15}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v12}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v12

    :goto_d
    invoke-interface {v12}, Ljava/util/Iterator;->hasNext()Z

    move-result v17

    if-eqz v17, :cond_17

    const/16 p0, 0x0

    invoke-interface {v12}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    move-object/from16 v17, v4

    check-cast v17, Ljava/util/List;

    move/from16 p2, v2

    if-eqz v2, :cond_15

    move-object/from16 v2, v17

    check-cast v2, Ljava/lang/Iterable;

    move-object/from16 v17, v5

    instance-of v5, v2, Ljava/util/Collection;

    if-eqz v5, :cond_13

    move-object v5, v2

    check-cast v5, Ljava/util/Collection;

    invoke-interface {v5}, Ljava/util/Collection;->isEmpty()Z

    move-result v5

    if-eqz v5, :cond_13

    goto :goto_e

    :cond_13
    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :cond_14
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_16

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lq21/d;

    instance-of v5, v5, Lq21/d$g;

    if-eqz v5, :cond_14

    invoke-virtual {v14, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_f

    :cond_15
    move-object/from16 v17, v5

    :cond_16
    :goto_e
    invoke-virtual {v15, v4}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    :goto_f
    move/from16 v2, p2

    move-object/from16 v5, v17

    goto :goto_d

    :cond_17
    move/from16 p2, v2

    move-object/from16 v17, v5

    const/16 p0, 0x0

    sget-object v2, Ll0/m;->c:Ll0/g;

    const/4 v4, 0x0

    invoke-static {v2, v1, v10, v4}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v2

    iget-wide v4, v10, Lp1/q;->T:J

    invoke-static {v4, v5}, Ljava/lang/Long;->hashCode(J)I

    move-result v4

    invoke-virtual {v10}, Lp1/q;->m()Lp1/p1;

    move-result-object v5

    invoke-static {v10, v3}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v12

    sget-object v18, La3/l;->a:La3/k;

    invoke-virtual/range {v18 .. v18}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-object/from16 v23, v3

    sget-object v3, La3/k;->b:La3/j;

    invoke-virtual {v10}, Lp1/q;->i0()V

    move/from16 v18, v6

    iget-boolean v6, v10, Lp1/q;->S:Z

    if-eqz v6, :cond_18

    invoke-virtual {v10, v3}, Lp1/q;->l(Lc93/a;)V

    goto :goto_10

    :cond_18
    invoke-virtual {v10}, Lp1/q;->s0()V

    :goto_10
    sget-object v3, La3/k;->g:La3/i;

    invoke-static {v10, v3, v2}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v2, La3/k;->f:La3/i;

    invoke-static {v10, v2, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v2, La3/k;->j:La3/i;

    iget-boolean v3, v10, Lp1/q;->S:Z

    if-nez v3, :cond_19

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-static {v3, v5}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_1a

    :cond_19
    invoke-static {v4, v10, v4, v2}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_1a
    sget-object v2, La3/k;->d:La3/i;

    invoke-static {v10, v2, v12}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const v2, 0x418e94ac

    invoke-virtual {v10, v2}, Lp1/q;->e0(I)V

    invoke-virtual {v14}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_11
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    const/high16 v4, 0x3f800000    # 1.0f

    sget-object v5, Ll0/t1;->a:Ll0/t1;

    const/4 v6, 0x0

    if-eqz v3, :cond_22

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/List;

    const/4 v12, 0x1

    int-to-float v14, v12

    mul-float/2addr v14, v11

    invoke-static {v9, v6, v14, v12}, Landroidx/compose/foundation/layout/a;->r(Landroidx/compose/ui/Modifier;FFI)Landroidx/compose/ui/Modifier;

    move-result-object v6

    invoke-static {v4, v6}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    sget-object v6, Ll0/m;->a:Ll0/e;

    const/16 v12, 0x30

    invoke-static {v6, v0, v10, v12}, Ll0/p1;->a(Ll0/i;Lb2/g;Landroidx/compose/runtime/Composer;I)Ll0/r1;

    move-result-object v6

    move-object v14, v2

    move-object v12, v3

    iget-wide v2, v10, Lp1/q;->T:J

    invoke-static {v2, v3}, Ljava/lang/Long;->hashCode(J)I

    move-result v2

    invoke-virtual {v10}, Lp1/q;->m()Lp1/p1;

    move-result-object v3

    invoke-static {v10, v4}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    sget-object v19, La3/l;->a:La3/k;

    invoke-virtual/range {v19 .. v19}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-object/from16 v19, v5

    sget-object v5, La3/k;->b:La3/j;

    invoke-virtual {v10}, Lp1/q;->i0()V

    move-object/from16 v20, v7

    iget-boolean v7, v10, Lp1/q;->S:Z

    if-eqz v7, :cond_1b

    invoke-virtual {v10, v5}, Lp1/q;->l(Lc93/a;)V

    goto :goto_12

    :cond_1b
    invoke-virtual {v10}, Lp1/q;->s0()V

    :goto_12
    sget-object v5, La3/k;->g:La3/i;

    invoke-static {v10, v5, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v5, La3/k;->f:La3/i;

    invoke-static {v10, v5, v3}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v3, La3/k;->j:La3/i;

    iget-boolean v5, v10, Lp1/q;->S:Z

    if-nez v5, :cond_1c

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-static {v5, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_1d

    :cond_1c
    invoke-static {v2, v10, v2, v3}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_1d
    sget-object v2, La3/k;->d:La3/i;

    invoke-static {v10, v2, v4}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const v2, -0x682d439a

    invoke-virtual {v10, v2}, Lp1/q;->e0(I)V

    move-object v3, v12

    check-cast v3, Ljava/lang/Iterable;

    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    const/4 v3, 0x0

    :goto_13
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_21

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    add-int/lit8 v21, v3, 0x1

    if-ltz v3, :cond_20

    move-object v6, v4

    check-cast v6, Lq21/d;

    if-nez v3, :cond_1e

    const/4 v7, 0x1

    goto :goto_14

    :cond_1e
    const/4 v7, 0x0

    :goto_14
    invoke-virtual/range {p1 .. p1}, Lq21/i;->c()I

    move-result v4

    if-ne v4, v3, :cond_1f

    move v3, v8

    const/4 v8, 0x1

    :goto_15
    move v4, v11

    goto :goto_16

    :cond_1f
    move v3, v8

    const/4 v8, 0x0

    goto :goto_15

    :goto_16
    const/4 v11, 0x6

    const/4 v12, 0x0

    move/from16 v16, v3

    move-object/from16 v24, v17

    move-object/from16 v5, v19

    const/4 v3, 0x0

    move/from16 v17, v4

    move-object v4, v9

    move/from16 v9, p2

    invoke-static/range {v5 .. v12}, Lq21/c;->w(Ll0/s1;Lq21/d;ZZZLandroidx/compose/runtime/Composer;II)V

    move/from16 v8, v16

    move/from16 v11, v17

    move/from16 v3, v21

    move-object/from16 v17, v24

    move-object v9, v4

    goto :goto_13

    :cond_20
    invoke-static {}, Lwb3/f;->d0()V

    throw p0

    :cond_21
    move/from16 v16, v8

    move-object v4, v9

    move-object/from16 v24, v17

    const/4 v3, 0x0

    move/from16 v9, p2

    move/from16 v17, v11

    invoke-virtual {v10, v3}, Lp1/q;->q(Z)V

    const/4 v12, 0x1

    invoke-virtual {v10, v12}, Lp1/q;->q(Z)V

    move-object v2, v14

    move-object/from16 v7, v20

    move-object/from16 v17, v24

    move-object v9, v4

    goto/16 :goto_11

    :cond_22
    move/from16 v16, v8

    move-object v8, v9

    move-object/from16 v24, v17

    move/from16 v2, v18

    const/4 v3, 0x0

    move/from16 v9, p2

    move/from16 v17, v11

    invoke-virtual {v10, v3}, Lp1/q;->q(Z)V

    sget-object v11, Ll0/a1;->w:Ll0/a1;

    invoke-static {v8, v11}, Landroidx/compose/foundation/layout/a;->j(Landroidx/compose/ui/Modifier;Ll0/a1;)Landroidx/compose/ui/Modifier;

    move-result-object v11

    sget-object v12, Lb2/e;->w:Lb2/m;

    invoke-static {v12, v3}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v12

    move-object v14, v7

    iget-wide v6, v10, Lp1/q;->T:J

    invoke-static {v6, v7}, Ljava/lang/Long;->hashCode(J)I

    move-result v6

    invoke-virtual {v10}, Lp1/q;->m()Lp1/p1;

    move-result-object v7

    invoke-static {v10, v11}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v11

    sget-object v18, La3/l;->a:La3/k;

    invoke-virtual/range {v18 .. v18}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v3, La3/k;->b:La3/j;

    invoke-virtual {v10}, Lp1/q;->i0()V

    iget-boolean v4, v10, Lp1/q;->S:Z

    if-eqz v4, :cond_23

    invoke-virtual {v10, v3}, Lp1/q;->l(Lc93/a;)V

    goto :goto_17

    :cond_23
    invoke-virtual {v10}, Lp1/q;->s0()V

    :goto_17
    sget-object v4, La3/k;->g:La3/i;

    invoke-static {v10, v4, v12}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v12, La3/k;->f:La3/i;

    invoke-static {v10, v12, v7}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v7, La3/k;->j:La3/i;

    move/from16 v25, v9

    iget-boolean v9, v10, Lp1/q;->S:Z

    if-nez v9, :cond_24

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v9

    move/from16 v26, v13

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v13

    invoke-static {v9, v13}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v9

    if-nez v9, :cond_25

    goto :goto_18

    :cond_24
    move/from16 v26, v13

    :goto_18
    invoke-static {v6, v10, v6, v7}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_25
    sget-object v6, La3/k;->d:La3/i;

    invoke-static {v10, v6, v11}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const/high16 v9, 0x3f800000    # 1.0f

    invoke-static {v9, v8}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v11

    sget-object v9, Ll0/m;->a:Ll0/e;

    sget-object v13, Lb2/e;->J:Lb2/l;

    move-object/from16 v27, v14

    const/4 v14, 0x0

    invoke-static {v9, v13, v10, v14}, Ll0/p1;->a(Ll0/i;Lb2/g;Landroidx/compose/runtime/Composer;I)Ll0/r1;

    move-result-object v9

    iget-wide v13, v10, Lp1/q;->T:J

    invoke-static {v13, v14}, Ljava/lang/Long;->hashCode(J)I

    move-result v13

    invoke-virtual {v10}, Lp1/q;->m()Lp1/p1;

    move-result-object v14

    invoke-static {v10, v11}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v11

    invoke-virtual {v10}, Lp1/q;->i0()V

    move-object/from16 v28, v15

    iget-boolean v15, v10, Lp1/q;->S:Z

    if-eqz v15, :cond_26

    invoke-virtual {v10, v3}, Lp1/q;->l(Lc93/a;)V

    goto :goto_19

    :cond_26
    invoke-virtual {v10}, Lp1/q;->s0()V

    :goto_19
    invoke-static {v10, v4, v9}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v10, v12, v14}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v3, v10, Lp1/q;->S:Z

    if-nez v3, :cond_27

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    invoke-static {v13}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-static {v3, v4}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_28

    :cond_27
    invoke-static {v13, v10, v13, v7}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_28
    invoke-static {v10, v6, v11}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static/range {v28 .. v28}, Lm83/s;->H0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/List;

    if-eqz v3, :cond_29

    check-cast v3, Ljava/util/Collection;

    invoke-interface {v3}, Ljava/util/Collection;->size()I

    move-result v12

    goto :goto_1a

    :cond_29
    const/4 v12, 0x0

    :goto_1a
    const v3, -0x4d915b7d

    invoke-virtual {v10, v3}, Lp1/q;->e0(I)V

    const/4 v3, 0x0

    :goto_1b
    if-ge v3, v12, :cond_2f

    invoke-virtual/range {p1 .. p1}, Lq21/i;->c()I

    move-result v4

    if-ne v4, v3, :cond_2d

    const v4, -0xd26cd82

    invoke-virtual {v10, v4}, Lp1/q;->e0(I)V

    invoke-virtual/range {p1 .. p1}, Lq21/i;->b()Li2/t;

    move-result-object v4

    const/4 v6, 0x4

    int-to-float v7, v6

    mul-float v6, v16, v7

    invoke-static {v6}, Lt0/j;->e(F)Lt0/i;

    move-result-object v6

    const v7, 0x3e19999a    # 0.15f

    invoke-static {v7, v8, v4, v6}, Landroidx/compose/foundation/a;->a(FLandroidx/compose/ui/Modifier;Li2/t;Li2/a1;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    const/4 v6, 0x1

    const/high16 v9, 0x3f800000    # 1.0f

    invoke-virtual {v5, v4, v6, v9}, Ll0/t1;->c(Landroidx/compose/ui/Modifier;ZF)Landroidx/compose/ui/Modifier;

    move-result-object v4

    sget-object v6, Ll0/m;->c:Ll0/g;

    const/4 v14, 0x0

    invoke-static {v6, v1, v10, v14}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v6

    iget-wide v13, v10, Lp1/q;->T:J

    invoke-static {v13, v14}, Ljava/lang/Long;->hashCode(J)I

    move-result v7

    invoke-virtual {v10}, Lp1/q;->m()Lp1/p1;

    move-result-object v9

    invoke-static {v10, v4}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    sget-object v11, La3/l;->a:La3/k;

    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v11, La3/k;->b:La3/j;

    invoke-virtual {v10}, Lp1/q;->i0()V

    iget-boolean v13, v10, Lp1/q;->S:Z

    if-eqz v13, :cond_2a

    invoke-virtual {v10, v11}, Lp1/q;->l(Lc93/a;)V

    goto :goto_1c

    :cond_2a
    invoke-virtual {v10}, Lp1/q;->s0()V

    :goto_1c
    sget-object v11, La3/k;->g:La3/i;

    invoke-static {v10, v11, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v6, La3/k;->f:La3/i;

    invoke-static {v10, v6, v9}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v6, La3/k;->j:La3/i;

    iget-boolean v9, v10, Lp1/q;->S:Z

    if-nez v9, :cond_2b

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v9

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v11

    invoke-static {v9, v11}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v9

    if-nez v9, :cond_2c

    :cond_2b
    invoke-static {v7, v10, v7, v6}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_2c
    sget-object v6, La3/k;->d:La3/i;

    invoke-static {v10, v6, v4}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const/high16 v9, 0x3f800000    # 1.0f

    invoke-static {v9, v8}, Landroidx/compose/foundation/layout/d;->c(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    invoke-static {v10, v4}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    const/4 v6, 0x1

    invoke-virtual {v10, v6}, Lp1/q;->q(Z)V

    const/4 v14, 0x0

    invoke-virtual {v10, v14}, Lp1/q;->q(Z)V

    const/4 v6, 0x1

    goto :goto_1f

    :cond_2d
    const v4, -0xd1dc1f4

    invoke-virtual {v10, v4}, Lp1/q;->e0(I)V

    if-nez v3, :cond_2e

    if-eqz v25, :cond_2e

    const/high16 v4, 0x40000000    # 2.0f

    :goto_1d
    const/4 v6, 0x1

    goto :goto_1e

    :cond_2e
    const/high16 v4, 0x3f800000    # 1.0f

    goto :goto_1d

    :goto_1e
    invoke-virtual {v5, v8, v6, v4}, Ll0/t1;->c(Landroidx/compose/ui/Modifier;ZF)Landroidx/compose/ui/Modifier;

    move-result-object v4

    invoke-static {v10, v4}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    const/4 v14, 0x0

    invoke-virtual {v10, v14}, Lp1/q;->q(Z)V

    :goto_1f
    add-int/lit8 v3, v3, 0x1

    goto/16 :goto_1b

    :cond_2f
    const/4 v6, 0x1

    const/4 v14, 0x0

    invoke-virtual {v10, v14}, Lp1/q;->q(Z)V

    invoke-virtual {v10, v6}, Lp1/q;->q(Z)V

    invoke-static/range {v28 .. v28}, Lm83/s;->H0(Ljava/util/List;)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/util/List;

    if-eqz v3, :cond_32

    check-cast v3, Ljava/lang/Iterable;

    instance-of v4, v3, Ljava/util/Collection;

    if-eqz v4, :cond_30

    move-object v4, v3

    check-cast v4, Ljava/util/Collection;

    invoke-interface {v4}, Ljava/util/Collection;->isEmpty()Z

    move-result v4

    if-eqz v4, :cond_30

    goto :goto_20

    :cond_30
    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :cond_31
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v4

    if-eqz v4, :cond_32

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lq21/d;

    instance-of v4, v4, Lq21/d$d;

    if-eqz v4, :cond_31

    const/4 v6, 0x1

    const/4 v12, 0x1

    goto :goto_21

    :cond_32
    :goto_20
    const/4 v6, 0x1

    const/4 v12, 0x0

    :goto_21
    int-to-float v3, v6

    mul-float v20, v3, v17

    invoke-static/range {v20 .. v20}, Ll0/m;->i(F)Ll0/k;

    move-result-object v3

    if-eqz v12, :cond_33

    move/from16 v18, v20

    goto :goto_22

    :cond_33
    const/4 v14, 0x0

    int-to-float v4, v14

    mul-float v4, v4, v17

    move/from16 v18, v4

    :goto_22
    const/16 v19, 0x0

    const/16 v21, 0x5

    const/16 v17, 0x0

    move-object/from16 v16, v8

    invoke-static/range {v16 .. v21}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v4

    move-object/from16 v13, v16

    const/high16 v9, 0x3f800000    # 1.0f

    invoke-static {v9, v4}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    const/4 v6, 0x6

    invoke-static {v3, v1, v10, v6}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v1

    iget-wide v6, v10, Lp1/q;->T:J

    invoke-static {v6, v7}, Ljava/lang/Long;->hashCode(J)I

    move-result v3

    invoke-virtual {v10}, Lp1/q;->m()Lp1/p1;

    move-result-object v6

    invoke-static {v10, v4}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    sget-object v7, La3/l;->a:La3/k;

    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v7, La3/k;->b:La3/j;

    invoke-virtual {v10}, Lp1/q;->i0()V

    iget-boolean v8, v10, Lp1/q;->S:Z

    if-eqz v8, :cond_34

    invoke-virtual {v10, v7}, Lp1/q;->l(Lc93/a;)V

    goto :goto_23

    :cond_34
    invoke-virtual {v10}, Lp1/q;->s0()V

    :goto_23
    sget-object v7, La3/k;->g:La3/i;

    invoke-static {v10, v7, v1}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v1, La3/k;->f:La3/i;

    invoke-static {v10, v1, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v1, La3/k;->j:La3/i;

    iget-boolean v6, v10, Lp1/q;->S:Z

    if-nez v6, :cond_35

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v6

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-static {v6, v7}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_36

    :cond_35
    invoke-static {v3, v10, v3, v1}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_36
    sget-object v1, La3/k;->d:La3/i;

    invoke-static {v10, v1, v4}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const v1, -0x2464ca6d

    invoke-virtual {v10, v1}, Lp1/q;->e0(I)V

    invoke-virtual/range {v28 .. v28}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v1

    const/4 v12, 0x0

    :goto_24
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_40

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    add-int/lit8 v4, v12, 0x1

    if-ltz v12, :cond_3f

    check-cast v3, Ljava/util/List;

    const-wide/high16 v6, 0x401e000000000000L    # 7.5

    double-to-float v6, v6

    const/4 v14, 0x4

    int-to-float v7, v14

    mul-float/2addr v6, v7

    const/4 v8, 0x0

    const/4 v9, 0x1

    invoke-static {v13, v8, v6, v9}, Landroidx/compose/foundation/layout/d;->b(Landroidx/compose/ui/Modifier;FFI)Landroidx/compose/ui/Modifier;

    move-result-object v15

    if-eqz v26, :cond_37

    if-nez v12, :cond_37

    const/4 v6, 0x3

    int-to-float v6, v6

    mul-float/2addr v6, v7

    :goto_25
    move/from16 v17, v6

    goto :goto_26

    :cond_37
    const/4 v6, 0x0

    int-to-float v9, v6

    mul-float v6, v9, v7

    goto :goto_25

    :goto_26
    const/16 v19, 0x0

    const/16 v20, 0xd

    const/16 v16, 0x0

    const/16 v18, 0x0

    invoke-static/range {v15 .. v20}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v6

    sget-object v7, Ll0/m;->a:Ll0/e;

    const/16 v15, 0x30

    invoke-static {v7, v0, v10, v15}, Ll0/p1;->a(Ll0/i;Lb2/g;Landroidx/compose/runtime/Composer;I)Ll0/r1;

    move-result-object v7

    iget-wide v11, v10, Lp1/q;->T:J

    invoke-static {v11, v12}, Ljava/lang/Long;->hashCode(J)I

    move-result v9

    invoke-virtual {v10}, Lp1/q;->m()Lp1/p1;

    move-result-object v11

    invoke-static {v10, v6}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v6

    sget-object v12, La3/l;->a:La3/k;

    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v12, La3/k;->b:La3/j;

    invoke-virtual {v10}, Lp1/q;->i0()V

    iget-boolean v8, v10, Lp1/q;->S:Z

    if-eqz v8, :cond_38

    invoke-virtual {v10, v12}, Lp1/q;->l(Lc93/a;)V

    goto :goto_27

    :cond_38
    invoke-virtual {v10}, Lp1/q;->s0()V

    :goto_27
    sget-object v8, La3/k;->g:La3/i;

    invoke-static {v10, v8, v7}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v7, La3/k;->f:La3/i;

    invoke-static {v10, v7, v11}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v7, La3/k;->j:La3/i;

    iget-boolean v8, v10, Lp1/q;->S:Z

    if-nez v8, :cond_39

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v8

    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v11

    invoke-static {v8, v11}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_3a

    :cond_39
    invoke-static {v9, v10, v9, v7}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_3a
    sget-object v7, La3/k;->d:La3/i;

    invoke-static {v10, v7, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const v6, 0x31569196

    invoke-virtual {v10, v6}, Lp1/q;->e0(I)V

    check-cast v3, Ljava/lang/Iterable;

    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v3

    const/4 v12, 0x0

    :goto_28
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_3e

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    add-int/lit8 v16, v12, 0x1

    if-ltz v12, :cond_3d

    check-cast v6, Lq21/d;

    if-nez v12, :cond_3b

    const/4 v7, 0x1

    goto :goto_29

    :cond_3b
    const/4 v7, 0x0

    :goto_29
    invoke-virtual/range {p1 .. p1}, Lq21/i;->c()I

    move-result v8

    if-ne v8, v12, :cond_3c

    const/4 v8, 0x1

    goto :goto_2a

    :cond_3c
    const/4 v8, 0x0

    :goto_2a
    const/4 v11, 0x6

    const/4 v12, 0x0

    move/from16 v9, v25

    move-object/from16 v14, v27

    const/16 v17, 0x0

    invoke-static/range {v5 .. v12}, Lq21/c;->w(Ll0/s1;Lq21/d;ZZZLandroidx/compose/runtime/Composer;II)V

    move/from16 v12, v16

    const/4 v14, 0x4

    goto :goto_28

    :cond_3d
    invoke-static {}, Lwb3/f;->d0()V

    throw p0

    :cond_3e
    move/from16 v9, v25

    move-object/from16 v14, v27

    const/4 v3, 0x0

    const/16 v17, 0x0

    invoke-virtual {v10, v3}, Lp1/q;->q(Z)V

    const/4 v12, 0x1

    invoke-virtual {v10, v12}, Lp1/q;->q(Z)V

    move v12, v4

    goto/16 :goto_24

    :cond_3f
    invoke-static {}, Lwb3/f;->d0()V

    throw p0

    :cond_40
    move-object/from16 v14, v27

    const/4 v3, 0x0

    const/4 v12, 0x1

    invoke-static {v10, v3, v12, v12, v12}, Lb9/y;->B(Lp1/q;ZZZZ)V

    invoke-virtual/range {p1 .. p1}, Lq21/i;->a()Lny0/h;

    move-result-object v6

    if-nez v6, :cond_41

    const v0, -0x4eafacf4

    invoke-virtual {v10, v0}, Lp1/q;->e0(I)V

    invoke-virtual {v10, v3}, Lp1/q;->q(Z)V

    move-object/from16 v0, v24

    goto :goto_2d

    :cond_41
    const v0, -0x4eafacf3

    invoke-virtual {v10, v0}, Lp1/q;->e0(I)V

    const/high16 v9, 0x3f800000    # 1.0f

    invoke-static {v9, v13}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v5

    and-int/lit16 v0, v2, 0x380

    const/16 v1, 0x100

    if-ne v0, v1, :cond_42

    move v0, v12

    goto :goto_2b

    :cond_42
    const/4 v0, 0x0

    :goto_2b
    invoke-virtual {v10, v6}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v1

    or-int/2addr v0, v1

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    if-nez v0, :cond_43

    move-object/from16 v0, v24

    if-ne v1, v0, :cond_44

    goto :goto_2c

    :cond_43
    move-object/from16 v0, v24

    :goto_2c
    new-instance v1, La80/i;

    const/16 v3, 0xa

    invoke-direct {v1, v14, v6, v3}, La80/i;-><init>(Lkotlin/jvm/functions/Function1;Lny0/h;I)V

    invoke-virtual {v10, v1}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_44
    move-object v8, v1

    check-cast v8, Lc93/a;

    move-object/from16 v18, v10

    const/4 v10, 0x6

    const/4 v11, 0x4

    const/4 v7, 0x0

    move-object/from16 v9, v18

    invoke-static/range {v5 .. v11}, Lny0/e;->d(Landroidx/compose/ui/Modifier;Lny0/h;Lj0/i;Lc93/a;Landroidx/compose/runtime/Composer;II)V

    move-object v10, v9

    const/4 v3, 0x0

    invoke-virtual {v10, v3}, Lp1/q;->q(Z)V

    :goto_2d
    invoke-virtual/range {p1 .. p1}, Lq21/i;->f()Lny0/p0;

    move-result-object v1

    if-nez v1, :cond_45

    const v0, -0x4eabfdc1

    invoke-virtual {v10, v0}, Lp1/q;->e0(I)V

    invoke-virtual {v10, v3}, Lp1/q;->q(Z)V

    move v0, v12

    move-object/from16 v27, v14

    goto/16 :goto_2f

    :cond_45
    const v3, -0x4eabfdc0

    invoke-virtual {v10, v3}, Lp1/q;->e0(I)V

    sget-object v6, Lny0/n0;->TextSmall:Lny0/n0;

    invoke-virtual {v1}, Lny0/p0;->m()Lcom/whoop/design/util/TextResource;

    move-result-object v7

    new-instance v9, Ly71/g;

    sget-object v3, Lx81/d;->a:Lx81/d;

    invoke-static {v3}, Lih0/d0;->E(Lx81/d;)I

    move-result v3

    move-object/from16 v5, p0

    const/4 v4, 0x2

    invoke-direct {v9, v3, v5, v4, v5}, Ly71/g;-><init>(ILcom/whoop/design/util/TextResource;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    if-ne v3, v0, :cond_46

    sget-object v3, Lq21/g$a;->w:Lq21/g$a;

    invoke-virtual {v10, v3}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_46
    check-cast v3, Lkotlin/jvm/functions/Function1;

    invoke-static {v3}, Ly81/g;->a(Lkotlin/jvm/functions/Function1;)Ly81/e;

    move-result-object v11

    and-int/lit16 v2, v2, 0x380

    const/16 v3, 0x100

    if-ne v2, v3, :cond_47

    move v2, v12

    goto :goto_2e

    :cond_47
    const/4 v2, 0x0

    :goto_2e
    invoke-virtual {v10, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v3

    or-int/2addr v2, v3

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    if-nez v2, :cond_48

    if-ne v3, v0, :cond_49

    :cond_48
    new-instance v3, Llf0/s0;

    const/4 v0, 0x2

    invoke-direct {v3, v14, v1, v0}, Llf0/s0;-><init>(Lkotlin/jvm/functions/Function1;Lny0/p0;I)V

    invoke-virtual {v10, v3}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_49
    move-object/from16 v17, v3

    check-cast v17, Lkotlin/jvm/functions/Function1;

    const/16 v20, 0x0

    const/16 v21, 0xea8

    const/4 v8, 0x0

    move-object/from16 v18, v10

    const/4 v10, 0x0

    move/from16 v22, v12

    const/4 v12, 0x0

    move-object/from16 v16, v13

    const/4 v13, 0x0

    move-object/from16 v27, v14

    const/4 v14, 0x0

    const/4 v15, 0x0

    move-object/from16 v4, v16

    const/16 v16, 0x0

    const v19, 0x6000036

    move-object v5, v4

    move/from16 v0, v22

    invoke-static/range {v5 .. v21}, Lny0/l0;->i(Landroidx/compose/ui/Modifier;Lny0/n0;Lcom/whoop/design/util/TextResource;Ly71/g;Ly71/g;ZLy81/e;Lj91/b;ZZLjava/lang/Float;Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v10, v18

    const/4 v14, 0x0

    invoke-virtual {v10, v14}, Lp1/q;->q(Z)V

    :goto_2f
    invoke-virtual {v10, v0}, Lp1/q;->q(Z)V

    move-object/from16 v1, v23

    move-object/from16 v3, v27

    goto :goto_30

    :cond_4a
    invoke-virtual {v10}, Lp1/q;->X()V

    move-object v1, v5

    move-object v3, v8

    :goto_30
    invoke-virtual {v10}, Lp1/q;->u()Lp1/v1;

    move-result-object v7

    if-eqz v7, :cond_4b

    new-instance v0, Lot1/f;

    const/16 v6, 0x19

    move-object/from16 v2, p1

    move/from16 v4, p4

    move/from16 v5, p5

    invoke-direct/range {v0 .. v6}, Lot1/f;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;III)V

    iput-object v0, v7, Lp1/v1;->d:Lc93/m;

    :cond_4b
    return-void
.end method

.method private static final f(Ljava/lang/Object;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final g(Lkotlin/jvm/functions/Function1;Lny0/h;)Ll83/a0;
    .locals 0

    invoke-virtual {p1}, Lny0/h;->l()Lcom/whoop/navigation/e;

    move-result-object p1

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final h(Lkotlin/jvm/functions/Function1;Lny0/p0;Ljava/lang/Object;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lny0/p0;->j()Lcom/whoop/navigation/e;

    move-result-object p1

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final i(Landroidx/compose/ui/Modifier;Lq21/i;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 6

    or-int/lit8 p3, p3, 0x1

    invoke-static {p3}, Lp1/x;->L(I)I

    move-result v4

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move v5, p4

    move-object v3, p5

    invoke-static/range {v0 .. v5}, Lq21/g;->e(Landroidx/compose/ui/Modifier;Lq21/i;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method
