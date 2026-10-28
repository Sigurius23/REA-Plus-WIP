.class public abstract Lt01/f;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u001a5\u0010\u0008\u001a\u00020\u00062\u0008\u0008\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0001\u00a2\u0006\u0004\u0008\u0008\u0010\t\u00a8\u0006\n"
    }
    d2 = {
        "Landroidx/compose/ui/Modifier;",
        "modifier",
        "Lt01/c;",
        "state",
        "Lkotlin/Function1;",
        "",
        "Ll83/a0;",
        "onViewEvent",
        "h",
        "(Landroidx/compose/ui/Modifier;Lt01/c;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V",
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
.method public static synthetic a(Lkotlin/jvm/functions/Function1;Lt01/c;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lt01/f;->k(Lkotlin/jvm/functions/Function1;Lt01/c;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lkotlin/jvm/functions/Function1;Lt01/c;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lt01/f;->j(Lkotlin/jvm/functions/Function1;Lt01/c;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Lkotlin/jvm/functions/Function1;Lt01/c;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lt01/f;->i(Lkotlin/jvm/functions/Function1;Lt01/c;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Lt01/c;Lkotlin/jvm/functions/Function1;Lc0/i0;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Lt01/f;->l(Lt01/c;Lkotlin/jvm/functions/Function1;Lc0/i0;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic e(Lp1/c1;Lt01/c;Lkotlin/jvm/functions/Function1;Lc0/i0;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p5}, Lt01/f;->m(Lp1/c1;Lt01/c;Lkotlin/jvm/functions/Function1;Lc0/i0;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic f(Landroidx/compose/ui/Modifier;Lt01/c;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p6}, Lt01/f;->o(Landroidx/compose/ui/Modifier;Lt01/c;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic g(Lt01/c;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lt01/f;->n(Lt01/c;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final h(Landroidx/compose/ui/Modifier;Lt01/c;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V
    .locals 33
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/ui/Modifier;",
            "Lt01/c;",
            "Lkotlin/jvm/functions/Function1;",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move/from16 v0, p4

    const-string v1, "state"

    invoke-static {v2, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "onViewEvent"

    invoke-static {v3, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v10, p3

    check-cast v10, Lp1/q;

    const v1, 0x4e07a50a    # 5.6893504E8f

    invoke-virtual {v10, v1}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v1, p5, 0x1

    if-eqz v1, :cond_0

    or-int/lit8 v4, v0, 0x6

    move v5, v4

    move-object/from16 v4, p0

    goto :goto_1

    :cond_0
    and-int/lit8 v4, v0, 0x6

    if-nez v4, :cond_2

    move-object/from16 v4, p0

    invoke-virtual {v10, v4}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_1

    const/4 v5, 0x4

    goto :goto_0

    :cond_1
    const/4 v5, 0x2

    :goto_0
    or-int/2addr v5, v0

    goto :goto_1

    :cond_2
    move-object/from16 v4, p0

    move v5, v0

    :goto_1
    and-int/lit8 v6, v0, 0x30

    if-nez v6, :cond_4

    invoke-virtual {v10, v2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_3

    const/16 v6, 0x20

    goto :goto_2

    :cond_3
    const/16 v6, 0x10

    :goto_2
    or-int/2addr v5, v6

    :cond_4
    and-int/lit16 v6, v0, 0x180

    const/16 v7, 0x100

    if-nez v6, :cond_6

    invoke-virtual {v10, v3}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_5

    move v6, v7

    goto :goto_3

    :cond_5
    const/16 v6, 0x80

    :goto_3
    or-int/2addr v5, v6

    :cond_6
    and-int/lit16 v6, v5, 0x93

    const/16 v8, 0x92

    const/4 v11, 0x0

    const/4 v12, 0x1

    if-eq v6, v8, :cond_7

    move v6, v12

    goto :goto_4

    :cond_7
    move v6, v11

    :goto_4
    and-int/lit8 v8, v5, 0x1

    invoke-virtual {v10, v8, v6}, Lp1/q;->U(IZ)Z

    move-result v6

    if-eqz v6, :cond_2f

    sget-object v13, Lb2/t;->w:Lb2/t;

    if-eqz v1, :cond_8

    move-object v1, v13

    goto :goto_5

    :cond_8
    move-object v1, v4

    :goto_5
    invoke-virtual {v2}, Lt01/c;->b()Ljava/util/List;

    move-result-object v4

    invoke-virtual {v10, v4}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v4

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v6

    sget-object v8, Lp1/l;->a:Lp1/v0;

    const/4 v9, 0x0

    if-nez v4, :cond_9

    if-ne v6, v8, :cond_f

    :cond_9
    invoke-virtual {v2}, Lt01/c;->b()Ljava/util/List;

    move-result-object v4

    check-cast v4, Ljava/lang/Iterable;

    new-instance v6, Ljava/util/ArrayList;

    invoke-direct {v6}, Ljava/util/ArrayList;-><init>()V

    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :cond_a
    :goto_6
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v14

    if-eqz v14, :cond_b

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v14

    instance-of v15, v14, Ly21/b;

    if-eqz v15, :cond_a

    invoke-virtual {v6, v14}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_6

    :cond_b
    invoke-virtual {v6}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v4

    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-nez v6, :cond_c

    move-object v4, v9

    goto :goto_8

    :cond_c
    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Ly21/b;

    invoke-virtual {v6}, Ly21/b;->k()F

    move-result v14

    invoke-virtual {v6}, Ly21/b;->g()F

    move-result v6

    invoke-static {v14, v6}, Ljava/lang/Math;->max(FF)F

    move-result v6

    :goto_7
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v14

    if-eqz v14, :cond_d

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v14

    check-cast v14, Ly21/b;

    invoke-virtual {v14}, Ly21/b;->k()F

    move-result v15

    invoke-virtual {v14}, Ly21/b;->g()F

    move-result v14

    invoke-static {v15, v14}, Ljava/lang/Math;->max(FF)F

    move-result v14

    invoke-static {v6, v14}, Ljava/lang/Math;->max(FF)F

    move-result v6

    goto :goto_7

    :cond_d
    invoke-static {v6}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v4

    :goto_8
    if-eqz v4, :cond_e

    invoke-virtual {v4}, Ljava/lang/Float;->floatValue()F

    move-result v4

    goto :goto_9

    :cond_e
    const/4 v4, 0x0

    :goto_9
    invoke-static {v4, v10}, Lc13/a;->o(FLp1/q;)Lp1/k1;

    move-result-object v6

    :cond_f
    move-object v14, v6

    check-cast v14, Lp1/c1;

    invoke-virtual {v2}, Lt01/c;->e()Z

    move-result v4

    if-nez v4, :cond_13

    const v4, 0x6ba5cb25

    invoke-virtual {v10, v4}, Lp1/q;->e0(I)V

    and-int/lit16 v4, v5, 0x380

    if-ne v4, v7, :cond_10

    move v4, v12

    goto :goto_a

    :cond_10
    move v4, v11

    :goto_a
    invoke-virtual {v10, v2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v6

    or-int/2addr v4, v6

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v6

    if-nez v4, :cond_11

    if-ne v6, v8, :cond_12

    :cond_11
    new-instance v6, Lt01/d;

    const/4 v4, 0x0

    invoke-direct {v6, v3, v2, v4}, Lt01/d;-><init>(Lkotlin/jvm/functions/Function1;Lt01/c;I)V

    invoke-virtual {v10, v6}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_12
    check-cast v6, Lc93/a;

    invoke-virtual {v10, v11}, Lp1/q;->q(Z)V

    move-object/from16 v17, v6

    goto :goto_b

    :cond_13
    const v4, 0x6ba71c64

    invoke-virtual {v10, v4}, Lp1/q;->e0(I)V

    invoke-virtual {v10, v11}, Lp1/q;->q(Z)V

    move-object/from16 v17, v9

    :goto_b
    invoke-virtual {v2}, Lt01/c;->c()Lt01/k;

    move-result-object v4

    invoke-virtual {v4}, Lt01/k;->e()Z

    move-result v4

    if-nez v4, :cond_14

    const v4, 0x6ba8c4b3

    invoke-virtual {v10, v4}, Lp1/q;->e0(I)V

    invoke-virtual {v10, v11}, Lp1/q;->q(Z)V

    :goto_c
    move-object/from16 v29, v9

    goto/16 :goto_f

    :cond_14
    invoke-virtual {v2}, Lt01/c;->e()Z

    move-result v4

    if-eqz v4, :cond_18

    const v4, 0x6ba9667c

    invoke-virtual {v10, v4}, Lp1/q;->e0(I)V

    and-int/lit16 v4, v5, 0x380

    if-ne v4, v7, :cond_15

    move v4, v12

    goto :goto_d

    :cond_15
    move v4, v11

    :goto_d
    invoke-virtual {v10, v2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v6

    or-int/2addr v4, v6

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v6

    if-nez v4, :cond_16

    if-ne v6, v8, :cond_17

    :cond_16
    new-instance v6, Lt01/d;

    const/4 v4, 0x1

    invoke-direct {v6, v3, v2, v4}, Lt01/d;-><init>(Lkotlin/jvm/functions/Function1;Lt01/c;I)V

    invoke-virtual {v10, v6}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_17
    move-object v9, v6

    check-cast v9, Lc93/a;

    invoke-virtual {v10, v11}, Lp1/q;->q(Z)V

    goto :goto_c

    :cond_18
    invoke-virtual {v2}, Lt01/c;->i()Z

    move-result v4

    if-nez v4, :cond_1c

    invoke-virtual {v2}, Lt01/c;->f()Z

    move-result v4

    if-eqz v4, :cond_1c

    const v4, 0x6babb73d

    invoke-virtual {v10, v4}, Lp1/q;->e0(I)V

    and-int/lit16 v4, v5, 0x380

    if-ne v4, v7, :cond_19

    move v4, v12

    goto :goto_e

    :cond_19
    move v4, v11

    :goto_e
    invoke-virtual {v10, v2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v6

    or-int/2addr v4, v6

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v6

    if-nez v4, :cond_1a

    if-ne v6, v8, :cond_1b

    :cond_1a
    new-instance v6, Lt01/d;

    const/4 v4, 0x2

    invoke-direct {v6, v3, v2, v4}, Lt01/d;-><init>(Lkotlin/jvm/functions/Function1;Lt01/c;I)V

    invoke-virtual {v10, v6}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_1b
    move-object v9, v6

    check-cast v9, Lc93/a;

    invoke-virtual {v10, v11}, Lp1/q;->q(Z)V

    goto :goto_c

    :cond_1c
    const v4, 0x6bad4f33

    invoke-virtual {v10, v4}, Lp1/q;->e0(I)V

    invoke-virtual {v10, v11}, Lp1/q;->q(Z)V

    goto :goto_c

    :goto_f
    const/high16 v15, 0x3f800000    # 1.0f

    invoke-static {v15, v1}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    int-to-float v6, v12

    const/16 v7, 0x8

    int-to-float v7, v7

    mul-float/2addr v6, v7

    invoke-static {v6}, Ll0/m;->i(F)Ll0/k;

    move-result-object v6

    sget-object v8, Lb2/e;->M:Lb2/k;

    const/4 v9, 0x6

    invoke-static {v6, v8, v10, v9}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v6

    iget-wide v11, v10, Lp1/q;->T:J

    invoke-static {v11, v12}, Ljava/lang/Long;->hashCode(J)I

    move-result v8

    invoke-virtual {v10}, Lp1/q;->m()Lp1/p1;

    move-result-object v11

    invoke-static {v10, v4}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    sget-object v12, La3/l;->a:La3/k;

    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v12, La3/k;->b:La3/j;

    invoke-virtual {v10}, Lp1/q;->i0()V

    iget-boolean v9, v10, Lp1/q;->S:Z

    if-eqz v9, :cond_1d

    invoke-virtual {v10, v12}, Lp1/q;->l(Lc93/a;)V

    goto :goto_10

    :cond_1d
    invoke-virtual {v10}, Lp1/q;->s0()V

    :goto_10
    sget-object v9, La3/k;->g:La3/i;

    invoke-static {v10, v9, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v6, La3/k;->f:La3/i;

    invoke-static {v10, v6, v11}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v11, La3/k;->j:La3/i;

    iget-boolean v15, v10, Lp1/q;->S:Z

    if-nez v15, :cond_1e

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v15

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v15, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1f

    :cond_1e
    invoke-static {v8, v10, v8, v11}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_1f
    sget-object v0, La3/k;->d:La3/i;

    invoke-static {v10, v0, v4}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const/high16 v4, 0x3f800000    # 1.0f

    invoke-static {v4, v13}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v8

    sget-object v15, Lb2/e;->K:Lb2/l;

    const-wide/high16 v3, 0x3ff8000000000000L    # 1.5

    double-to-float v3, v3

    const/16 v4, 0x36

    invoke-static {v3, v7, v15, v10, v4}, Lih0/d0;->q(FFLb2/l;Lp1/q;I)Ll0/r1;

    move-result-object v3

    move-object/from16 v18, v13

    move-object/from16 v20, v14

    iget-wide v13, v10, Lp1/q;->T:J

    invoke-static {v13, v14}, Ljava/lang/Long;->hashCode(J)I

    move-result v4

    invoke-virtual {v10}, Lp1/q;->m()Lp1/p1;

    move-result-object v7

    invoke-static {v10, v8}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v8

    invoke-virtual {v10}, Lp1/q;->i0()V

    iget-boolean v13, v10, Lp1/q;->S:Z

    if-eqz v13, :cond_20

    invoke-virtual {v10, v12}, Lp1/q;->l(Lc93/a;)V

    goto :goto_11

    :cond_20
    invoke-virtual {v10}, Lp1/q;->s0()V

    :goto_11
    invoke-static {v10, v9, v3}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v10, v6, v7}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v3, v10, Lp1/q;->S:Z

    if-nez v3, :cond_21

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-static {v3, v7}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_22

    :cond_21
    invoke-static {v4, v10, v4, v11}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_22
    invoke-static {v10, v0, v8}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual {v2}, Lt01/c;->g()Lm91/u;

    move-result-object v3

    if-nez v3, :cond_23

    const v3, -0x4e626b11

    invoke-virtual {v10, v3}, Lp1/q;->e0(I)V

    const/4 v3, 0x0

    invoke-virtual {v10, v3}, Lp1/q;->q(Z)V

    move-object v13, v6

    move-object v7, v10

    const/4 v14, 0x6

    move-object v10, v9

    :goto_12
    const/high16 v4, 0x3f800000    # 1.0f

    goto/16 :goto_17

    :cond_23
    const v4, -0x4e626b10

    invoke-virtual {v10, v4}, Lp1/q;->e0(I)V

    instance-of v4, v3, Lsy0/e;

    if-eqz v4, :cond_26

    move-object v4, v3

    move-object v3, v4

    check-cast v3, Lsy0/e;

    invoke-virtual {v3}, Lsy0/e;->c()Lsy0/k;

    move-result-object v7

    instance-of v7, v7, Lsy0/k$c;

    if-eqz v7, :cond_25

    const v4, 0x7ae018e7

    invoke-virtual {v10, v4}, Lp1/q;->e0(I)V

    invoke-virtual {v3}, Lsy0/e;->e()Ljava/lang/String;

    move-result-object v4

    invoke-static {v4}, Lyb3/r;->i0(Ljava/lang/CharSequence;)Z

    move-result v4

    if-nez v4, :cond_24

    invoke-virtual {v3}, Lsy0/e;->e()Ljava/lang/String;

    move-result-object v4

    goto :goto_13

    :cond_24
    invoke-virtual {v2}, Lt01/c;->h()Ljava/lang/String;

    move-result-object v4

    :goto_13
    invoke-static {v4}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v4

    and-int/lit16 v8, v5, 0x380

    move-object v5, v9

    const/16 v9, 0x8

    move-object v7, v6

    const/4 v6, 0x0

    move-object v13, v7

    move-object v7, v10

    const/4 v14, 0x6

    move-object v10, v5

    move-object/from16 v5, p2

    invoke-static/range {v3 .. v9}, Lt01/g;->d(Lsy0/e;Lcom/whoop/design/util/TextResource;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V

    const/4 v3, 0x0

    invoke-virtual {v7, v3}, Lp1/q;->q(Z)V

    goto :goto_16

    :cond_25
    :goto_14
    move-object v13, v6

    move-object v7, v10

    const/4 v14, 0x6

    move-object v10, v9

    goto :goto_15

    :cond_26
    move-object v4, v3

    goto :goto_14

    :goto_15
    const v3, 0x3f6f8f3

    invoke-virtual {v7, v3}, Lp1/q;->e0(I)V

    shl-int/lit8 v3, v5, 0x3

    and-int/lit16 v8, v3, 0x1c00

    const/4 v9, 0x6

    move-object v3, v4

    const/4 v4, 0x0

    const/4 v5, 0x0

    move-object/from16 v6, p2

    invoke-static/range {v3 .. v9}, Lm91/l;->r(Lm91/u;Lm91/p;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    const/4 v3, 0x0

    invoke-virtual {v7, v3}, Lp1/q;->q(Z)V

    :goto_16
    invoke-virtual {v7, v3}, Lp1/q;->q(Z)V

    goto :goto_12

    :goto_17
    float-to-double v5, v4

    const-wide/16 v8, 0x0

    cmpl-double v3, v5, v8

    const-string v5, "invalid weight; must be greater than zero"

    if-lez v3, :cond_27

    goto :goto_18

    :cond_27
    invoke-static {v5}, Lm0/a;->a(Ljava/lang/String;)V

    :goto_18
    new-instance v3, Landroidx/compose/foundation/layout/LayoutWeightElement;

    const v6, 0x7f7fffff    # Float.MAX_VALUE

    cmpl-float v16, v4, v6

    move/from16 p0, v6

    if-lez v16, :cond_28

    move/from16 v4, p0

    :cond_28
    const/4 v6, 0x1

    invoke-direct {v3, v4, v6}, Landroidx/compose/foundation/layout/LayoutWeightElement;-><init>(FZ)V

    if-eqz v17, :cond_29

    const/high16 v4, 0x3f800000    # 1.0f

    const/16 v16, 0x0

    move-object v6, v13

    move-object/from16 v13, v18

    const/16 v18, 0xf

    move/from16 v21, v14

    const/4 v14, 0x0

    move-object/from16 v22, v15

    const/4 v15, 0x0

    move-wide/from16 v31, v8

    move/from16 v9, v21

    move-object/from16 v8, v22

    move-wide/from16 v21, v31

    invoke-static/range {v13 .. v18}, Landroidx/compose/foundation/a;->g(Landroidx/compose/ui/Modifier;ZLjava/lang/String;Li3/i;Lc93/a;I)Landroidx/compose/ui/Modifier;

    move-result-object v13

    const-string v14, "CollapsibleRowHeader"

    invoke-static {v13, v14}, Landroidx/compose/ui/platform/a;->a(Landroidx/compose/ui/Modifier;Ljava/lang/String;)Landroidx/compose/ui/Modifier;

    move-result-object v13

    goto :goto_19

    :cond_29
    move-wide/from16 v21, v8

    move-object v6, v13

    move v9, v14

    move-object v8, v15

    move-object/from16 v13, v18

    const/high16 v4, 0x3f800000    # 1.0f

    :goto_19
    invoke-interface {v3, v13}, Landroidx/compose/ui/Modifier;->e(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    sget-object v13, Ll0/m;->a:Ll0/e;

    const/16 v14, 0x30

    invoke-static {v13, v8, v7, v14}, Ll0/p1;->a(Ll0/i;Lb2/g;Landroidx/compose/runtime/Composer;I)Ll0/r1;

    move-result-object v8

    iget-wide v13, v7, Lp1/q;->T:J

    invoke-static {v13, v14}, Ljava/lang/Long;->hashCode(J)I

    move-result v13

    invoke-virtual {v7}, Lp1/q;->m()Lp1/p1;

    move-result-object v14

    invoke-static {v7, v3}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    invoke-virtual {v7}, Lp1/q;->i0()V

    iget-boolean v15, v7, Lp1/q;->S:Z

    if-eqz v15, :cond_2a

    invoke-virtual {v7, v12}, Lp1/q;->l(Lc93/a;)V

    goto :goto_1a

    :cond_2a
    invoke-virtual {v7}, Lp1/q;->s0()V

    :goto_1a
    invoke-static {v7, v10, v8}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v7, v6, v14}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v6, v7, Lp1/q;->S:Z

    if-nez v6, :cond_2b

    invoke-virtual {v7}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v6

    invoke-static {v13}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    invoke-static {v6, v8}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_2c

    :cond_2b
    invoke-static {v13, v7, v13, v11}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_2c
    invoke-static {v7, v0, v3}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual {v2}, Lt01/c;->h()Ljava/lang/String;

    move-result-object v3

    sget-object v0, Lx81/d;->a:Lx81/d;

    invoke-virtual {v0, v7, v9}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v6

    invoke-virtual {v6}, Lb91/d;->Q()Lb91/a;

    move-result-object v23

    invoke-virtual {v0, v7, v9}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v0

    invoke-virtual {v0}, Ly81/i;->y()J

    move-result-wide v8

    float-to-double v10, v4

    cmpl-double v0, v10, v21

    if-lez v0, :cond_2d

    :goto_1b
    move/from16 v16, v4

    goto :goto_1c

    :cond_2d
    invoke-static {v5}, Lm0/a;->a(Ljava/lang/String;)V

    goto :goto_1b

    :goto_1c
    new-instance v4, Landroidx/compose/foundation/layout/LayoutWeightElement;

    cmpl-float v0, v16, p0

    if-lez v0, :cond_2e

    move/from16 v15, p0

    :goto_1d
    const/4 v6, 0x1

    goto :goto_1e

    :cond_2e
    move/from16 v15, v16

    goto :goto_1d

    :goto_1e
    invoke-direct {v4, v15, v6}, Landroidx/compose/foundation/layout/LayoutWeightElement;-><init>(FZ)V

    const/16 v27, 0x0

    const v28, 0x2fff8

    move/from16 v19, v6

    move-object v10, v7

    move-wide v5, v8

    const-wide/16 v7, 0x0

    const/4 v9, 0x0

    move-object/from16 v25, v10

    const/4 v10, 0x0

    const/4 v11, 0x0

    const-wide/16 v12, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const-wide/16 v16, 0x0

    const/16 v18, 0x0

    move/from16 v0, v19

    const/16 v19, 0x0

    move-object/from16 v21, v20

    const/16 v20, 0x0

    move-object/from16 v22, v21

    const/16 v21, 0x0

    move-object/from16 v24, v22

    const/16 v22, 0x0

    move-object/from16 v26, v24

    const/16 v24, 0x0

    move-object/from16 v30, v26

    const/16 v26, 0x0

    move-object/from16 p0, v30

    move-object/from16 v30, v1

    move v1, v0

    move-object/from16 v0, p2

    invoke-static/range {v3 .. v28}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v7, v25

    invoke-virtual {v7, v1}, Lp1/q;->q(Z)V

    invoke-virtual {v2}, Lt01/c;->c()Lt01/k;

    move-result-object v3

    move-object v10, v7

    const/4 v7, 0x0

    const/4 v8, 0x4

    const/4 v5, 0x0

    move-object v6, v10

    move-object/from16 v4, v29

    invoke-static/range {v3 .. v8}, Lt01/a;->b(Lt01/k;Lc93/a;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V

    move-object v7, v6

    invoke-virtual {v7, v1}, Lp1/q;->q(Z)V

    invoke-virtual {v2}, Lt01/c;->i()Z

    move-result v3

    xor-int/lit8 v4, v3, 0x1

    new-instance v3, Loq1/c;

    const/16 v5, 0x15

    invoke-direct {v3, v5, v2, v0}, Loq1/c;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    const v5, 0x67fe8d58

    invoke-static {v5, v7, v3}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v9

    const/16 v12, 0x1e

    sget-object v3, Ll0/z;->a:Ll0/z;

    const/4 v5, 0x0

    const/4 v6, 0x0

    move-object v10, v7

    const/4 v7, 0x0

    const/4 v8, 0x0

    const v11, 0x180006

    invoke-static/range {v3 .. v12}, Landroidx/compose/animation/b;->e(Ll0/y;ZLandroidx/compose/ui/Modifier;Lc0/c1;Lc0/e1;Ljava/lang/String;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V

    move-object v7, v10

    invoke-virtual {v2}, Lt01/c;->i()Z

    move-result v4

    new-instance v5, Lno0/h;

    const/16 v6, 0x12

    move-object/from16 v8, p0

    invoke-direct {v5, v8, v2, v0, v6}, Lno0/h;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    const v6, 0x6e7e198f

    invoke-static {v6, v7, v5}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v9

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    invoke-static/range {v3 .. v12}, Landroidx/compose/animation/b;->e(Ll0/y;ZLandroidx/compose/ui/Modifier;Lc0/c1;Lc0/e1;Ljava/lang/String;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V

    move-object v7, v10

    invoke-virtual {v7, v1}, Lp1/q;->q(Z)V

    move-object/from16 v1, v30

    goto :goto_1f

    :cond_2f
    move-object v0, v3

    move-object v7, v10

    invoke-virtual {v7}, Lp1/q;->X()V

    move-object v1, v4

    :goto_1f
    invoke-virtual {v7}, Lp1/q;->u()Lp1/v1;

    move-result-object v7

    if-eqz v7, :cond_30

    new-instance v0, Lt01/e;

    const/4 v6, 0x0

    move-object/from16 v3, p2

    move/from16 v4, p4

    move/from16 v5, p5

    invoke-direct/range {v0 .. v6}, Lt01/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;III)V

    iput-object v0, v7, Lp1/v1;->d:Lc93/m;

    :cond_30
    return-void
.end method

.method private static final i(Lkotlin/jvm/functions/Function1;Lt01/c;)Ll83/a0;
    .locals 1

    new-instance v0, Lt01/i;

    invoke-virtual {p1}, Lt01/c;->h()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Lt01/i;-><init>(Ljava/lang/String;)V

    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final j(Lkotlin/jvm/functions/Function1;Lt01/c;)Ll83/a0;
    .locals 1

    new-instance v0, Lt01/h;

    invoke-virtual {p1}, Lt01/c;->h()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Lt01/h;-><init>(Ljava/lang/String;)V

    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final k(Lkotlin/jvm/functions/Function1;Lt01/c;)Ll83/a0;
    .locals 1

    new-instance v0, Lt01/i;

    invoke-virtual {p1}, Lt01/c;->h()Ljava/lang/String;

    move-result-object p1

    invoke-direct {v0, p1}, Lt01/i;-><init>(Ljava/lang/String;)V

    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final l(Lt01/c;Lkotlin/jvm/functions/Function1;Lc0/i0;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 7

    const-string p4, "$this$AnimatedVisibility"

    invoke-static {p2, p4}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lt01/c;->a()Lm91/u;

    move-result-object v0

    const/4 p0, 0x0

    if-nez v0, :cond_0

    check-cast p3, Lp1/q;

    const p1, -0x107d2cb5

    invoke-virtual {p3, p1}, Lp1/q;->e0(I)V

    invoke-virtual {p3, p0}, Lp1/q;->q(Z)V

    goto :goto_0

    :cond_0
    move-object v4, p3

    check-cast v4, Lp1/q;

    const p2, -0x107d2cb4

    invoke-virtual {v4, p2}, Lp1/q;->e0(I)V

    const/4 v5, 0x0

    const/4 v6, 0x6

    const/4 v1, 0x0

    const/4 v2, 0x0

    move-object v3, p1

    invoke-static/range {v0 .. v6}, Lm91/l;->r(Lm91/u;Lm91/p;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    invoke-virtual {v4, p0}, Lp1/q;->q(Z)V

    :goto_0
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final m(Lp1/c1;Lt01/c;Lkotlin/jvm/functions/Function1;Lc0/i0;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    const-string p5, "$this$AnimatedVisibility"

    invoke-static {p3, p5}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, Ly21/i;->V()Lp1/t1;

    move-result-object p3

    invoke-virtual {p3, p0}, Lp1/t1;->a(Ljava/lang/Object;)Lp1/u1;

    move-result-object p0

    new-instance p3, Lpp2/o;

    const/16 p5, 0xa

    invoke-direct {p3, p5, p1, p2}, Lpp2/o;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    const p1, -0x4c9961b1

    invoke-static {p1, p4, p3}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object p1

    const/16 p2, 0x38

    invoke-static {p0, p1, p4, p2}, Lp1/x;->a(Lp1/u1;Lc93/m;Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final n(Lt01/c;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 11

    and-int/lit8 v0, p3, 0x3

    const/4 v1, 0x2

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-eq v0, v1, :cond_0

    move v0, v3

    goto :goto_0

    :cond_0
    move v0, v2

    :goto_0
    and-int/2addr p3, v3

    move-object v8, p2

    check-cast v8, Lp1/q;

    invoke-virtual {v8, p3, v0}, Lp1/q;->U(IZ)Z

    move-result p2

    if-eqz p2, :cond_9

    int-to-float p2, v3

    const/16 p3, 0x8

    int-to-float p3, p3

    mul-float/2addr p2, p3

    invoke-static {p2}, Ll0/m;->i(F)Ll0/k;

    move-result-object p2

    sget-object p3, Lb2/e;->M:Lb2/k;

    const/4 v0, 0x6

    invoke-static {p2, p3, v8, v0}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object p2

    iget-wide v0, v8, Lp1/q;->T:J

    invoke-static {v0, v1}, Ljava/lang/Long;->hashCode(J)I

    move-result p3

    invoke-virtual {v8}, Lp1/q;->m()Lp1/p1;

    move-result-object v0

    sget-object v1, Lb2/t;->w:Lb2/t;

    invoke-static {v8, v1}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    sget-object v4, La3/l;->a:La3/k;

    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v4, La3/k;->b:La3/j;

    invoke-virtual {v8}, Lp1/q;->i0()V

    iget-boolean v5, v8, Lp1/q;->S:Z

    if-eqz v5, :cond_1

    invoke-virtual {v8, v4}, Lp1/q;->l(Lc93/a;)V

    goto :goto_1

    :cond_1
    invoke-virtual {v8}, Lp1/q;->s0()V

    :goto_1
    sget-object v4, La3/k;->g:La3/i;

    invoke-static {v8, v4, p2}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object p2, La3/k;->f:La3/i;

    invoke-static {v8, p2, v0}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object p2, La3/k;->j:La3/i;

    iget-boolean v0, v8, Lp1/q;->S:Z

    if-nez v0, :cond_2

    invoke-virtual {v8}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v0

    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-static {v0, v4}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_3

    :cond_2
    invoke-static {p3, v8, p3, p2}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_3
    sget-object p2, La3/k;->d:La3/i;

    invoke-static {v8, p2, v1}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const p2, -0x7f83ad09

    invoke-virtual {v8, p2}, Lp1/q;->e0(I)V

    invoke-virtual {p0}, Lt01/c;->b()Ljava/util/List;

    move-result-object p0

    check-cast p0, Ljava/lang/Iterable;

    invoke-interface {p0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p0

    move p2, v2

    :goto_2
    invoke-interface {p0}, Ljava/util/Iterator;->hasNext()Z

    move-result p3

    if-eqz p3, :cond_8

    invoke-interface {p0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object p3

    add-int/lit8 v0, p2, 0x1

    const/4 v1, 0x0

    if-ltz p2, :cond_7

    move-object v4, p3

    check-cast v4, Lm91/u;

    instance-of p3, v4, Lm91/n;

    if-eqz p3, :cond_4

    move-object v1, v4

    check-cast v1, Lm91/n;

    :cond_4
    if-eqz v1, :cond_5

    invoke-interface {v1}, Lm91/n;->getId()Ljava/lang/Object;

    move-result-object p3

    if-nez p3, :cond_6

    :cond_5
    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p3

    :cond_6
    const p2, -0x170048e9

    invoke-virtual {v8, p2, p3}, Lp1/q;->b0(ILjava/lang/Object;)V

    const/4 v9, 0x0

    const/4 v10, 0x6

    const/4 v5, 0x0

    const/4 v6, 0x0

    move-object v7, p1

    invoke-static/range {v4 .. v10}, Lm91/l;->r(Lm91/u;Lm91/p;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    invoke-virtual {v8, v2}, Lp1/q;->q(Z)V

    move p2, v0

    goto :goto_2

    :cond_7
    invoke-static {}, Lwb3/f;->d0()V

    throw v1

    :cond_8
    invoke-virtual {v8, v2}, Lp1/q;->q(Z)V

    invoke-virtual {v8, v3}, Lp1/q;->q(Z)V

    goto :goto_3

    :cond_9
    invoke-virtual {v8}, Lp1/q;->X()V

    :goto_3
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final o(Landroidx/compose/ui/Modifier;Lt01/c;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 6

    or-int/lit8 p3, p3, 0x1

    invoke-static {p3}, Lp1/x;->L(I)I

    move-result v4

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move v5, p4

    move-object v3, p5

    invoke-static/range {v0 .. v5}, Lt01/f;->h(Landroidx/compose/ui/Modifier;Lt01/c;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method
