.class public abstract Lzc1/q3;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u001a\u000f\u0010\u0001\u001a\u00020\u0000H\u0007\u00a2\u0006\u0004\u0008\u0001\u0010\u0002\u00a8\u0006\u0003"
    }
    d2 = {
        "Ll83/a0;",
        "b",
        "(Landroidx/compose/runtime/Composer;I)V",
        "design-showcase_release"
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
.method public static synthetic a(ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, Lzc1/q3;->c(ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final b(Landroidx/compose/runtime/Composer;I)V
    .locals 16

    move/from16 v0, p1

    sget-object v1, Lb2/e;->J:Lb2/l;

    move-object/from16 v6, p0

    check-cast v6, Lp1/q;

    const v2, -0x43f2d94a

    invoke-virtual {v6, v2}, Lp1/q;->g0(I)Lp1/q;

    const/4 v10, 0x1

    if-eqz v0, :cond_0

    move v2, v10

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    :goto_0
    and-int/lit8 v3, v0, 0x1

    invoke-virtual {v6, v3, v2}, Lp1/q;->U(IZ)Z

    move-result v2

    if-eqz v2, :cond_20

    const/high16 v2, 0x3f800000    # 1.0f

    sget-object v11, Lb2/t;->w:Lb2/t;

    invoke-static {v2, v11}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    const/4 v3, 0x4

    int-to-float v3, v3

    const/16 v4, 0x8

    int-to-float v12, v4

    mul-float v4, v3, v12

    invoke-static {v4, v2}, Landroidx/compose/foundation/layout/a;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    sget-object v4, Lb2/e;->N:Lb2/k;

    const/16 v5, 0x36

    invoke-static {v3, v3, v4, v6, v5}, Lm4/a;->n(FFLb2/k;Lp1/q;I)Ll0/x;

    move-result-object v3

    iget-wide v4, v6, Lp1/q;->T:J

    invoke-static {v4, v5}, Ljava/lang/Long;->hashCode(J)I

    move-result v4

    invoke-virtual {v6}, Lp1/q;->m()Lp1/p1;

    move-result-object v5

    invoke-static {v6, v2}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    sget-object v7, La3/l;->a:La3/k;

    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v7, La3/k;->b:La3/j;

    invoke-virtual {v6}, Lp1/q;->i0()V

    iget-boolean v8, v6, Lp1/q;->S:Z

    if-eqz v8, :cond_1

    invoke-virtual {v6, v7}, Lp1/q;->l(Lc93/a;)V

    goto :goto_1

    :cond_1
    invoke-virtual {v6}, Lp1/q;->s0()V

    :goto_1
    sget-object v8, La3/k;->g:La3/i;

    invoke-static {v6, v8, v3}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v3, La3/k;->f:La3/i;

    invoke-static {v6, v3, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v5, La3/k;->j:La3/i;

    iget-boolean v13, v6, Lp1/q;->S:Z

    if-nez v13, :cond_2

    invoke-virtual {v6}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v13

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v14

    invoke-static {v13, v14}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v13

    if-nez v13, :cond_3

    :cond_2
    invoke-static {v4, v6, v4, v5}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_3
    sget-object v4, La3/k;->d:La3/i;

    invoke-static {v6, v4, v2}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const-string v2, "HrZone = Active"

    const/4 v13, 0x6

    invoke-static {v2, v6, v13}, Lkd1/k;->c(Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V

    int-to-float v2, v10

    mul-float v14, v2, v12

    invoke-static {v14}, Ll0/m;->i(F)Ll0/k;

    move-result-object v2

    invoke-static {v2, v1, v6, v13}, Ll0/p1;->a(Ll0/i;Lb2/g;Landroidx/compose/runtime/Composer;I)Ll0/r1;

    move-result-object v2

    move v15, v14

    iget-wide v13, v6, Lp1/q;->T:J

    invoke-static {v13, v14}, Ljava/lang/Long;->hashCode(J)I

    move-result v13

    invoke-virtual {v6}, Lp1/q;->m()Lp1/p1;

    move-result-object v14

    invoke-static {v6, v11}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v10

    invoke-virtual {v6}, Lp1/q;->i0()V

    iget-boolean v9, v6, Lp1/q;->S:Z

    if-eqz v9, :cond_4

    invoke-virtual {v6, v7}, Lp1/q;->l(Lc93/a;)V

    goto :goto_2

    :cond_4
    invoke-virtual {v6}, Lp1/q;->s0()V

    :goto_2
    invoke-static {v6, v8, v2}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v6, v3, v14}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v2, v6, Lp1/q;->S:Z

    if-nez v2, :cond_5

    invoke-virtual {v6}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    invoke-static {v13}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_6

    :cond_5
    invoke-static {v13, v6, v13, v5}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_6
    invoke-static {v6, v4, v10}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const v2, -0x8459707

    invoke-virtual {v6, v2}, Lp1/q;->e0(I)V

    invoke-static {}, Ll31/j;->a()Ljava/util/List;

    move-result-object v2

    check-cast v2, Ljava/lang/Iterable;

    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v9

    :goto_3
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_7

    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lfz0/d;

    sget v7, Lfz0/d;->h:I

    const/16 v8, 0xe

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-static/range {v2 .. v8}, Lm91/l;->r(Lm91/u;Lm91/p;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    goto :goto_3

    :cond_7
    const/4 v2, 0x0

    invoke-virtual {v6, v2}, Lp1/q;->q(Z)V

    const/4 v2, 0x1

    invoke-virtual {v6, v2}, Lp1/q;->q(Z)V

    const-string v2, "HrZone = InActive"

    const/4 v3, 0x6

    invoke-static {v2, v6, v3}, Lkd1/k;->c(Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V

    invoke-static {v15}, Ll0/m;->i(F)Ll0/k;

    move-result-object v2

    invoke-static {v2, v1, v6, v3}, Ll0/p1;->a(Ll0/i;Lb2/g;Landroidx/compose/runtime/Composer;I)Ll0/r1;

    move-result-object v2

    iget-wide v3, v6, Lp1/q;->T:J

    invoke-static {v3, v4}, Ljava/lang/Long;->hashCode(J)I

    move-result v3

    invoke-virtual {v6}, Lp1/q;->m()Lp1/p1;

    move-result-object v4

    invoke-static {v6, v11}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v5

    sget-object v7, La3/l;->a:La3/k;

    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v7, La3/k;->b:La3/j;

    invoke-virtual {v6}, Lp1/q;->i0()V

    iget-boolean v8, v6, Lp1/q;->S:Z

    if-eqz v8, :cond_8

    invoke-virtual {v6, v7}, Lp1/q;->l(Lc93/a;)V

    goto :goto_4

    :cond_8
    invoke-virtual {v6}, Lp1/q;->s0()V

    :goto_4
    sget-object v7, La3/k;->g:La3/i;

    invoke-static {v6, v7, v2}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v2, La3/k;->f:La3/i;

    invoke-static {v6, v2, v4}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v2, La3/k;->j:La3/i;

    iget-boolean v4, v6, Lp1/q;->S:Z

    if-nez v4, :cond_9

    invoke-virtual {v6}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-static {v4, v7}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_a

    :cond_9
    invoke-static {v3, v6, v3, v2}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_a
    sget-object v2, La3/k;->d:La3/i;

    invoke-static {v6, v2, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const v2, -0x5b4bba1e

    invoke-virtual {v6, v2}, Lp1/q;->e0(I)V

    invoke-static {}, Ll31/j;->d()Ljava/util/List;

    move-result-object v2

    check-cast v2, Ljava/lang/Iterable;

    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v9

    :goto_5
    invoke-interface {v9}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_b

    invoke-interface {v9}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lfz0/d;

    sget v7, Lfz0/d;->h:I

    const/16 v8, 0xe

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-static/range {v2 .. v8}, Lm91/l;->r(Lm91/u;Lm91/p;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    goto :goto_5

    :cond_b
    const/4 v2, 0x0

    invoke-virtual {v6, v2}, Lp1/q;->q(Z)V

    const/4 v2, 0x1

    invoke-virtual {v6, v2}, Lp1/q;->q(Z)V

    const-string v2, "Zone = Examples"

    const/4 v3, 0x6

    invoke-static {v2, v6, v3}, Lkd1/k;->c(Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V

    const-wide v4, 0x3fc999999999999aL    # 0.2

    double-to-float v2, v4

    mul-float v9, v2, v12

    invoke-static {v9}, Ll0/m;->i(F)Ll0/k;

    move-result-object v2

    invoke-static {v2, v1, v6, v3}, Ll0/p1;->a(Ll0/i;Lb2/g;Landroidx/compose/runtime/Composer;I)Ll0/r1;

    move-result-object v2

    iget-wide v3, v6, Lp1/q;->T:J

    invoke-static {v3, v4}, Ljava/lang/Long;->hashCode(J)I

    move-result v3

    invoke-virtual {v6}, Lp1/q;->m()Lp1/p1;

    move-result-object v4

    invoke-static {v6, v11}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v5

    sget-object v7, La3/l;->a:La3/k;

    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v7, La3/k;->b:La3/j;

    invoke-virtual {v6}, Lp1/q;->i0()V

    iget-boolean v8, v6, Lp1/q;->S:Z

    if-eqz v8, :cond_c

    invoke-virtual {v6, v7}, Lp1/q;->l(Lc93/a;)V

    goto :goto_6

    :cond_c
    invoke-virtual {v6}, Lp1/q;->s0()V

    :goto_6
    sget-object v7, La3/k;->g:La3/i;

    invoke-static {v6, v7, v2}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v2, La3/k;->f:La3/i;

    invoke-static {v6, v2, v4}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v2, La3/k;->j:La3/i;

    iget-boolean v4, v6, Lp1/q;->S:Z

    if-nez v4, :cond_d

    invoke-virtual {v6}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-static {v4, v7}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_e

    :cond_d
    invoke-static {v3, v6, v3, v2}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_e
    sget-object v2, La3/k;->d:La3/i;

    invoke-static {v6, v2, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const v2, -0x5136cd5f

    invoke-virtual {v6, v2}, Lp1/q;->e0(I)V

    invoke-static {}, Ll31/j;->e()Ljava/util/List;

    move-result-object v2

    check-cast v2, Ljava/lang/Iterable;

    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v10

    :goto_7
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_f

    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lfz0/d;

    sget v7, Lfz0/d;->h:I

    const/16 v8, 0xe

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-static/range {v2 .. v8}, Lm91/l;->r(Lm91/u;Lm91/p;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    goto :goto_7

    :cond_f
    const/4 v2, 0x0

    invoke-virtual {v6, v2}, Lp1/q;->q(Z)V

    const/4 v2, 0x1

    invoke-virtual {v6, v2}, Lp1/q;->q(Z)V

    invoke-static {v9}, Ll0/m;->i(F)Ll0/k;

    move-result-object v2

    const/4 v3, 0x6

    invoke-static {v2, v1, v6, v3}, Ll0/p1;->a(Ll0/i;Lb2/g;Landroidx/compose/runtime/Composer;I)Ll0/r1;

    move-result-object v2

    iget-wide v3, v6, Lp1/q;->T:J

    invoke-static {v3, v4}, Ljava/lang/Long;->hashCode(J)I

    move-result v3

    invoke-virtual {v6}, Lp1/q;->m()Lp1/p1;

    move-result-object v4

    invoke-static {v6, v11}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v5

    sget-object v7, La3/l;->a:La3/k;

    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v7, La3/k;->b:La3/j;

    invoke-virtual {v6}, Lp1/q;->i0()V

    iget-boolean v8, v6, Lp1/q;->S:Z

    if-eqz v8, :cond_10

    invoke-virtual {v6, v7}, Lp1/q;->l(Lc93/a;)V

    goto :goto_8

    :cond_10
    invoke-virtual {v6}, Lp1/q;->s0()V

    :goto_8
    sget-object v7, La3/k;->g:La3/i;

    invoke-static {v6, v7, v2}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v2, La3/k;->f:La3/i;

    invoke-static {v6, v2, v4}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v2, La3/k;->j:La3/i;

    iget-boolean v4, v6, Lp1/q;->S:Z

    if-nez v4, :cond_11

    invoke-virtual {v6}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-static {v4, v7}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_12

    :cond_11
    invoke-static {v3, v6, v3, v2}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_12
    sget-object v2, La3/k;->d:La3/i;

    invoke-static {v6, v2, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const v2, -0x4721df80

    invoke-virtual {v6, v2}, Lp1/q;->e0(I)V

    invoke-static {}, Ll31/j;->f()Ljava/util/List;

    move-result-object v2

    check-cast v2, Ljava/lang/Iterable;

    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v10

    :goto_9
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_13

    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lfz0/d;

    sget v7, Lfz0/d;->h:I

    const/16 v8, 0xe

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-static/range {v2 .. v8}, Lm91/l;->r(Lm91/u;Lm91/p;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    goto :goto_9

    :cond_13
    const/4 v2, 0x0

    invoke-virtual {v6, v2}, Lp1/q;->q(Z)V

    const/4 v2, 0x1

    invoke-virtual {v6, v2}, Lp1/q;->q(Z)V

    invoke-static {v9}, Ll0/m;->i(F)Ll0/k;

    move-result-object v2

    const/4 v3, 0x6

    invoke-static {v2, v1, v6, v3}, Ll0/p1;->a(Ll0/i;Lb2/g;Landroidx/compose/runtime/Composer;I)Ll0/r1;

    move-result-object v2

    iget-wide v3, v6, Lp1/q;->T:J

    invoke-static {v3, v4}, Ljava/lang/Long;->hashCode(J)I

    move-result v3

    invoke-virtual {v6}, Lp1/q;->m()Lp1/p1;

    move-result-object v4

    invoke-static {v6, v11}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v5

    sget-object v7, La3/l;->a:La3/k;

    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v7, La3/k;->b:La3/j;

    invoke-virtual {v6}, Lp1/q;->i0()V

    iget-boolean v8, v6, Lp1/q;->S:Z

    if-eqz v8, :cond_14

    invoke-virtual {v6, v7}, Lp1/q;->l(Lc93/a;)V

    goto :goto_a

    :cond_14
    invoke-virtual {v6}, Lp1/q;->s0()V

    :goto_a
    sget-object v7, La3/k;->g:La3/i;

    invoke-static {v6, v7, v2}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v2, La3/k;->f:La3/i;

    invoke-static {v6, v2, v4}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v2, La3/k;->j:La3/i;

    iget-boolean v4, v6, Lp1/q;->S:Z

    if-nez v4, :cond_15

    invoke-virtual {v6}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-static {v4, v7}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_16

    :cond_15
    invoke-static {v3, v6, v3, v2}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_16
    sget-object v2, La3/k;->d:La3/i;

    invoke-static {v6, v2, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const v2, -0x3d0cf1a1

    invoke-virtual {v6, v2}, Lp1/q;->e0(I)V

    invoke-static {}, Ll31/j;->g()Ljava/util/List;

    move-result-object v2

    check-cast v2, Ljava/lang/Iterable;

    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v10

    :goto_b
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_17

    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lfz0/d;

    sget v7, Lfz0/d;->h:I

    const/16 v8, 0xe

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-static/range {v2 .. v8}, Lm91/l;->r(Lm91/u;Lm91/p;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    goto :goto_b

    :cond_17
    const/4 v2, 0x0

    invoke-virtual {v6, v2}, Lp1/q;->q(Z)V

    const/4 v2, 0x1

    invoke-virtual {v6, v2}, Lp1/q;->q(Z)V

    invoke-static {v9}, Ll0/m;->i(F)Ll0/k;

    move-result-object v2

    const/4 v3, 0x6

    invoke-static {v2, v1, v6, v3}, Ll0/p1;->a(Ll0/i;Lb2/g;Landroidx/compose/runtime/Composer;I)Ll0/r1;

    move-result-object v2

    iget-wide v3, v6, Lp1/q;->T:J

    invoke-static {v3, v4}, Ljava/lang/Long;->hashCode(J)I

    move-result v3

    invoke-virtual {v6}, Lp1/q;->m()Lp1/p1;

    move-result-object v4

    invoke-static {v6, v11}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v5

    sget-object v7, La3/l;->a:La3/k;

    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v7, La3/k;->b:La3/j;

    invoke-virtual {v6}, Lp1/q;->i0()V

    iget-boolean v8, v6, Lp1/q;->S:Z

    if-eqz v8, :cond_18

    invoke-virtual {v6, v7}, Lp1/q;->l(Lc93/a;)V

    goto :goto_c

    :cond_18
    invoke-virtual {v6}, Lp1/q;->s0()V

    :goto_c
    sget-object v7, La3/k;->g:La3/i;

    invoke-static {v6, v7, v2}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v2, La3/k;->f:La3/i;

    invoke-static {v6, v2, v4}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v2, La3/k;->j:La3/i;

    iget-boolean v4, v6, Lp1/q;->S:Z

    if-nez v4, :cond_19

    invoke-virtual {v6}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-static {v4, v7}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_1a

    :cond_19
    invoke-static {v3, v6, v3, v2}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_1a
    sget-object v2, La3/k;->d:La3/i;

    invoke-static {v6, v2, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const v2, -0x32f803c2

    invoke-virtual {v6, v2}, Lp1/q;->e0(I)V

    invoke-static {}, Ll31/j;->h()Ljava/util/List;

    move-result-object v2

    check-cast v2, Ljava/lang/Iterable;

    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v10

    :goto_d
    invoke-interface {v10}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1b

    invoke-interface {v10}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lfz0/d;

    sget v7, Lfz0/d;->h:I

    const/16 v8, 0xe

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-static/range {v2 .. v8}, Lm91/l;->r(Lm91/u;Lm91/p;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    goto :goto_d

    :cond_1b
    const/4 v2, 0x0

    invoke-virtual {v6, v2}, Lp1/q;->q(Z)V

    const/4 v2, 0x1

    invoke-virtual {v6, v2}, Lp1/q;->q(Z)V

    invoke-static {v9}, Ll0/m;->i(F)Ll0/k;

    move-result-object v2

    const/4 v3, 0x6

    invoke-static {v2, v1, v6, v3}, Ll0/p1;->a(Ll0/i;Lb2/g;Landroidx/compose/runtime/Composer;I)Ll0/r1;

    move-result-object v1

    iget-wide v2, v6, Lp1/q;->T:J

    invoke-static {v2, v3}, Ljava/lang/Long;->hashCode(J)I

    move-result v2

    invoke-virtual {v6}, Lp1/q;->m()Lp1/p1;

    move-result-object v3

    invoke-static {v6, v11}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    sget-object v5, La3/l;->a:La3/k;

    invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v5, La3/k;->b:La3/j;

    invoke-virtual {v6}, Lp1/q;->i0()V

    iget-boolean v7, v6, Lp1/q;->S:Z

    if-eqz v7, :cond_1c

    invoke-virtual {v6, v5}, Lp1/q;->l(Lc93/a;)V

    goto :goto_e

    :cond_1c
    invoke-virtual {v6}, Lp1/q;->s0()V

    :goto_e
    sget-object v5, La3/k;->g:La3/i;

    invoke-static {v6, v5, v1}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v1, La3/k;->f:La3/i;

    invoke-static {v6, v1, v3}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v1, La3/k;->j:La3/i;

    iget-boolean v3, v6, Lp1/q;->S:Z

    if-nez v3, :cond_1d

    invoke-virtual {v6}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-static {v3, v5}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_1e

    :cond_1d
    invoke-static {v2, v6, v2, v1}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_1e
    sget-object v1, La3/k;->d:La3/i;

    invoke-static {v6, v1, v4}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const v1, -0x28e315e3

    invoke-virtual {v6, v1}, Lp1/q;->e0(I)V

    invoke-static {}, Ll31/j;->i()Ljava/util/List;

    move-result-object v1

    check-cast v1, Ljava/lang/Iterable;

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v1

    :goto_f
    invoke-interface {v1}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_1f

    invoke-interface {v1}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lfz0/d;

    sget v7, Lfz0/d;->h:I

    const/16 v8, 0xe

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    invoke-static/range {v2 .. v8}, Lm91/l;->r(Lm91/u;Lm91/p;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    goto :goto_f

    :cond_1f
    const/4 v2, 0x0

    const/4 v3, 0x1

    invoke-static {v6, v2, v3, v3}, Lm4/a;->y(Lp1/q;ZZZ)V

    goto :goto_10

    :cond_20
    invoke-virtual {v6}, Lp1/q;->X()V

    :goto_10
    invoke-virtual {v6}, Lp1/q;->u()Lp1/v1;

    move-result-object v1

    if-eqz v1, :cond_21

    new-instance v2, Lzc1/l2;

    const/16 v3, 0x1c

    invoke-direct {v2, v0, v3}, Lzc1/l2;-><init>(II)V

    iput-object v2, v1, Lp1/v1;->d:Lc93/m;

    :cond_21
    return-void
.end method

.method private static final c(ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p0, p0, 0x1

    invoke-static {p0}, Lp1/x;->L(I)I

    move-result p0

    invoke-static {p1, p0}, Lzc1/q3;->b(Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method
