.class public abstract Lsy2/m;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u001a+\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0007\u00a2\u0006\u0004\u0008\u0006\u0010\u0007\u00a8\u0006\u0008"
    }
    d2 = {
        "Lty2/a$a$d;",
        "viewState",
        "Lkotlin/Function1;",
        "Lny2/a;",
        "Ll83/a0;",
        "onViewEvent",
        "g",
        "(Lty2/a$a$d;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V",
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
.method public static synthetic a(Lg2/i;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lsy2/m;->h(Lg2/i;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lsy2/m;->l(Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c()Ll83/a0;
    .locals 1

    invoke-static {}, Lsy2/m;->j()Ll83/a0;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic d(Lty2/a$a$d;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, Lsy2/m;->i(Lty2/a$a$d;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic e(Ljava/lang/String;Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 0

    invoke-static {p1, p0}, Lsy2/m;->k(Lkotlin/jvm/functions/Function1;Ljava/lang/String;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic f(Lty2/a$a$d;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Lsy2/m;->m(Lty2/a$a$d;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final g(Lty2/a$a$d;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V
    .locals 49
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lty2/a$a$d;",
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

    move-object/from16 v13, p2

    check-cast v13, Lp1/q;

    const v3, -0x2d251561

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
    and-int/lit8 v6, p3, 0x30

    if-nez v6, :cond_3

    invoke-virtual {v13, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_2

    const/16 v6, 0x20

    goto :goto_2

    :cond_2
    const/16 v6, 0x10

    :goto_2
    or-int/2addr v3, v6

    :cond_3
    and-int/lit8 v6, v3, 0x13

    const/16 v8, 0x12

    const/4 v9, 0x0

    if-eq v6, v8, :cond_4

    const/4 v6, 0x1

    goto :goto_3

    :cond_4
    move v6, v9

    :goto_3
    and-int/lit8 v8, v3, 0x1

    invoke-virtual {v13, v8, v6}, Lp1/q;->U(IZ)Z

    move-result v6

    if-eqz v6, :cond_1b

    sget-object v6, Lb3/v1;->i:Lp1/u2;

    invoke-virtual {v13, v6}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lg2/i;

    sget-object v8, Lb2/t;->w:Lb2/t;

    invoke-static {v8}, Lgb1/b0;->b0(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v14

    invoke-virtual {v13}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v11

    sget-object v12, Lp1/l;->a:Lp1/v0;

    if-ne v11, v12, :cond_5

    invoke-static {v13}, Ld;->g(Lp1/q;)Lj0/j;

    move-result-object v11

    :cond_5
    move-object v15, v11

    check-cast v15, Lj0/i;

    invoke-virtual {v13, v6}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v11

    invoke-virtual {v13}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    if-nez v11, :cond_6

    if-ne v4, v12, :cond_7

    :cond_6
    new-instance v4, Lsy2/g;

    const/4 v11, 0x1

    invoke-direct {v4, v6, v11}, Lsy2/g;-><init>(Lg2/i;I)V

    invoke-virtual {v13, v4}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_7
    move-object/from16 v19, v4

    check-cast v19, Lc93/a;

    const/16 v20, 0x1c

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    invoke-static/range {v14 .. v20}, Landroidx/compose/foundation/a;->e(Landroidx/compose/ui/Modifier;Lj0/i;Lf0/v0;ZLi3/i;Lc93/a;I)Landroidx/compose/ui/Modifier;

    move-result-object v4

    sget-object v6, Lb2/e;->w:Lb2/m;

    invoke-static {v6, v9}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v6

    iget-wide v14, v13, Lp1/q;->T:J

    invoke-static {v14, v15}, Ljava/lang/Long;->hashCode(J)I

    move-result v11

    invoke-virtual {v13}, Lp1/q;->m()Lp1/p1;

    move-result-object v14

    invoke-static {v13, v4}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    sget-object v15, La3/l;->a:La3/k;

    invoke-virtual {v15}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v15, La3/k;->b:La3/j;

    invoke-virtual {v13}, Lp1/q;->i0()V

    iget-boolean v7, v13, Lp1/q;->S:Z

    if-eqz v7, :cond_8

    invoke-virtual {v13, v15}, Lp1/q;->l(Lc93/a;)V

    goto :goto_4

    :cond_8
    invoke-virtual {v13}, Lp1/q;->s0()V

    :goto_4
    sget-object v7, La3/k;->g:La3/i;

    invoke-static {v13, v7, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v6, La3/k;->f:La3/i;

    invoke-static {v13, v6, v14}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v14, La3/k;->j:La3/i;

    iget-boolean v5, v13, Lp1/q;->S:Z

    if-nez v5, :cond_9

    invoke-virtual {v13}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    invoke-static {v5, v10}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_a

    :cond_9
    invoke-static {v11, v13, v11, v14}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_a
    sget-object v5, La3/k;->d:La3/i;

    invoke-static {v13, v5, v4}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const/high16 v4, 0x3f800000    # 1.0f

    invoke-static {v4, v8}, Landroidx/compose/foundation/layout/d;->d(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v10

    invoke-static {v10}, Ll0/f;->k(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v10

    sget-object v11, Ll0/m;->c:Ll0/g;

    sget-object v4, Lb2/e;->M:Lb2/k;

    invoke-static {v11, v4, v13, v9}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v4

    move-object/from16 v21, v10

    iget-wide v9, v13, Lp1/q;->T:J

    invoke-static {v9, v10}, Ljava/lang/Long;->hashCode(J)I

    move-result v9

    invoke-virtual {v13}, Lp1/q;->m()Lp1/p1;

    move-result-object v10

    move/from16 v22, v3

    move-object/from16 v3, v21

    invoke-static {v13, v3}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    invoke-virtual {v13}, Lp1/q;->i0()V

    move-object/from16 v21, v12

    iget-boolean v12, v13, Lp1/q;->S:Z

    if-eqz v12, :cond_b

    invoke-virtual {v13, v15}, Lp1/q;->l(Lc93/a;)V

    goto :goto_5

    :cond_b
    invoke-virtual {v13}, Lp1/q;->s0()V

    :goto_5
    invoke-static {v13, v7, v4}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v13, v6, v10}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v4, v13, Lp1/q;->S:Z

    if-nez v4, :cond_c

    invoke-virtual {v13}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    invoke-static {v4, v10}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_d

    :cond_c
    invoke-static {v9, v13, v9, v14}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_d
    invoke-static {v13, v5, v3}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    and-int/lit8 v3, v22, 0x70

    and-int/lit8 v4, v22, 0x7e

    invoke-static {v0, v1, v13, v4}, Lry2/f;->g(Lty2/a$a;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    const/high16 v4, 0x3f800000    # 1.0f

    float-to-double v9, v4

    const-wide/16 v22, 0x0

    cmpl-double v9, v9, v22

    if-lez v9, :cond_e

    :goto_6
    const/4 v9, 0x1

    goto :goto_7

    :cond_e
    const-string v9, "invalid weight; must be greater than zero"

    invoke-static {v9}, Lm0/a;->a(Ljava/lang/String;)V

    goto :goto_6

    :goto_7
    invoke-static {v4, v9, v13}, Ldc/b;->y(FZLp1/q;)V

    sget-object v4, Lb2/e;->N:Lb2/k;

    const/4 v10, 0x2

    int-to-float v10, v10

    const/16 v12, 0x8

    int-to-float v12, v12

    mul-float/2addr v10, v12

    const/16 v9, 0xd

    move/from16 v17, v12

    const/4 v12, 0x0

    invoke-static {v12, v10, v12, v12, v9}, Landroidx/compose/foundation/layout/a;->c(FFFFI)Ll0/l1;

    move-result-object v9

    invoke-static {v9, v8}, Landroidx/compose/foundation/layout/a;->o(Ll0/k1;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v9

    invoke-static {v9}, Ll0/f;->i(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v9

    move/from16 v23, v10

    const/4 v10, 0x1

    const/4 v12, 0x0

    invoke-static {v12, v13, v10}, Lq83/g;->U(ILandroidx/compose/runtime/Composer;I)Lf0/r1;

    move-result-object v2

    const/16 v12, 0xe

    invoke-static {v9, v2, v12}, Lq83/g;->f0(Landroidx/compose/ui/Modifier;Lf0/r1;I)Landroidx/compose/ui/Modifier;

    move-result-object v2

    const/16 v9, 0x30

    invoke-static {v11, v4, v13, v9}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v4

    iget-wide v11, v13, Lp1/q;->T:J

    invoke-static {v11, v12}, Ljava/lang/Long;->hashCode(J)I

    move-result v9

    invoke-virtual {v13}, Lp1/q;->m()Lp1/p1;

    move-result-object v11

    invoke-static {v13, v2}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    invoke-virtual {v13}, Lp1/q;->i0()V

    iget-boolean v12, v13, Lp1/q;->S:Z

    if-eqz v12, :cond_f

    invoke-virtual {v13, v15}, Lp1/q;->l(Lc93/a;)V

    goto :goto_8

    :cond_f
    invoke-virtual {v13}, Lp1/q;->s0()V

    :goto_8
    invoke-static {v13, v7, v4}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v13, v6, v11}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v4, v13, Lp1/q;->S:Z

    if-nez v4, :cond_10

    invoke-virtual {v13}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-static {v4, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_11

    :cond_10
    invoke-static {v9, v13, v9, v14}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_11
    invoke-static {v13, v5, v2}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual {v0}, Lty2/a$a$d;->f()Ljava/lang/String;

    move-result-object v2

    if-nez v2, :cond_12

    const v2, 0x67d0d0f7

    invoke-virtual {v13, v2}, Lp1/q;->e0(I)V

    const/4 v12, 0x0

    invoke-virtual {v13, v12}, Lp1/q;->q(Z)V

    move-object/from16 v46, v8

    move v2, v12

    move-object/from16 v47, v21

    const/4 v1, 0x4

    goto :goto_9

    :cond_12
    const/4 v12, 0x0

    const v4, 0x67d0d0f8

    invoke-virtual {v13, v4}, Lp1/q;->e0(I)V

    invoke-static {v2, v13, v12}, Lcom/whoop/design/util/b;->i(Ljava/lang/CharSequence;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v4

    invoke-static {v13, v12}, Lkz2/d;->a(Landroidx/compose/runtime/Composer;I)Liz0/m;

    move-result-object v7

    const/high16 v2, 0x3f800000    # 1.0f

    invoke-static {v2, v8}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v22

    const-wide/high16 v5, 0x3fe0000000000000L    # 0.5

    double-to-float v2, v5

    mul-float v24, v2, v17

    const/16 v26, 0x0

    const/16 v27, 0x8

    move/from16 v25, v23

    invoke-static/range {v22 .. v27}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v5

    sget v2, Liz0/m;->p:I

    shl-int/lit8 v14, v2, 0x9

    const/16 v15, 0x1f4

    const/4 v6, 0x0

    move-object v2, v8

    const/4 v8, 0x0

    const/4 v9, 0x0

    move/from16 v18, v10

    const/4 v10, 0x0

    const/4 v11, 0x0

    move/from16 v20, v12

    const/4 v12, 0x0

    move-object/from16 v46, v2

    move/from16 v2, v20

    move-object/from16 v47, v21

    const/4 v1, 0x4

    invoke-static/range {v4 .. v15}, Liz0/g;->M(Ljava/lang/String;Landroidx/compose/ui/Modifier;ZLiz0/m;Lkotlin/jvm/functions/Function1;IIIZLandroidx/compose/runtime/Composer;II)V

    invoke-virtual {v13, v2}, Lp1/q;->q(Z)V

    :goto_9
    const-wide/high16 v4, 0x4004000000000000L    # 2.5

    double-to-float v4, v4

    int-to-float v1, v1

    mul-float/2addr v4, v1

    move-object/from16 v14, v46

    invoke-static {v4, v14}, Landroidx/compose/foundation/layout/d;->h(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    invoke-static {v13, v1}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    invoke-virtual {v0}, Lty2/a$a$d;->i()Lcom/whoop/design/util/TextResource;

    move-result-object v7

    sget-object v1, Lx81/d;->a:Lx81/d;

    sget v4, Lx81/d;->b:I

    invoke-virtual {v1, v13, v4}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v1

    invoke-virtual {v1}, Lb91/d;->a()Lb91/a;

    move-result-object v8

    invoke-virtual {v0}, Lty2/a$a$d;->k()Lcom/whoop/design/util/TextResource;

    move-result-object v5

    invoke-virtual {v0}, Lty2/a$a$d;->g()Lcom/whoop/design/util/TextResource;

    move-result-object v1

    if-nez v1, :cond_13

    invoke-static {}, Lcom/whoop/design/util/b;->a()Lcom/whoop/design/util/TextResource;

    move-result-object v1

    :cond_13
    move-object v12, v1

    invoke-virtual {v0}, Lty2/a$a$d;->g()Lcom/whoop/design/util/TextResource;

    move-result-object v1

    invoke-static {}, Lcom/whoop/design/util/b;->a()Lcom/whoop/design/util/TextResource;

    move-result-object v4

    invoke-static {v1, v4}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    const/16 v45, 0x1

    xor-int/lit8 v1, v1, 0x1

    const/16 v18, 0x0

    const/16 v19, 0xa

    const/16 v16, 0x0

    move/from16 v17, v23

    move/from16 v15, v23

    invoke-static/range {v14 .. v19}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v4

    new-instance v6, Lsy2/l;

    const/4 v9, 0x0

    invoke-direct {v6, v0, v9}, Lsy2/l;-><init>(Ljava/lang/Object;I)V

    const v9, -0x4255126f

    invoke-static {v9, v13, v6}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v10

    invoke-virtual {v13}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v6

    move-object/from16 v9, v47

    if-ne v6, v9, :cond_14

    new-instance v6, Lsr2/v;

    const/16 v11, 0xd

    invoke-direct {v6, v11}, Lsr2/v;-><init>(I)V

    invoke-virtual {v13, v6}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_14
    move-object/from16 v35, v6

    check-cast v35, Lc93/a;

    const/16 v6, 0x20

    if-ne v3, v6, :cond_15

    move/from16 v11, v45

    goto :goto_a

    :cond_15
    move v11, v2

    :goto_a
    invoke-virtual {v13}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v14

    if-nez v11, :cond_17

    if-ne v14, v9, :cond_16

    goto :goto_b

    :cond_16
    move-object/from16 v15, p1

    goto :goto_c

    :cond_17
    :goto_b
    new-instance v14, Lsy2/h;

    const/4 v11, 0x3

    move-object/from16 v15, p1

    invoke-direct {v14, v15, v11}, Lsy2/h;-><init>(Lkotlin/jvm/functions/Function1;I)V

    invoke-virtual {v13, v14}, Lp1/q;->p0(Ljava/lang/Object;)V

    :goto_c
    move-object/from16 v36, v14

    check-cast v36, Lkotlin/jvm/functions/Function1;

    sget v44, Lcom/whoop/design/util/TextResource;->$stable:I

    shl-int/lit8 v11, v44, 0x3

    const v14, 0x180006

    or-int/2addr v11, v14

    shl-int/lit8 v14, v44, 0x9

    or-int/2addr v11, v14

    sget v14, Lb91/a;->d:I

    shl-int/lit8 v14, v14, 0xc

    or-int/2addr v11, v14

    shl-int/lit8 v14, v44, 0x18

    or-int v38, v11, v14

    const v42, 0x3ffebca4

    const/16 v43, 0x0

    move/from16 v16, v6

    const/4 v6, 0x0

    move-object/from16 v47, v9

    const/4 v9, 0x0

    const/4 v11, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    move/from16 v18, v16

    const-wide/16 v16, 0x0

    move/from16 v19, v18

    const/16 v18, 0x0

    move/from16 v20, v19

    const/16 v19, 0x3

    move/from16 v21, v20

    const/16 v20, 0x0

    move/from16 v22, v21

    const/16 v21, 0x7

    move/from16 v23, v22

    const/16 v22, 0x0

    move/from16 v24, v23

    const/16 v23, 0x0

    move/from16 v25, v24

    const/16 v24, 0x0

    move/from16 v26, v25

    const/16 v25, 0x0

    move/from16 v27, v26

    const/16 v26, 0x0

    move/from16 v28, v27

    const/16 v27, 0x0

    move/from16 v29, v28

    const/16 v28, 0x0

    move/from16 v30, v29

    const/16 v29, 0x0

    move/from16 v31, v30

    const/16 v30, 0x0

    move/from16 v32, v31

    const/16 v31, 0x0

    move/from16 v33, v32

    const/16 v32, 0x0

    move/from16 v34, v33

    const/16 v33, 0x0

    move/from16 v37, v34

    const/16 v34, 0x0

    const v39, 0x186000

    const/16 v40, 0x0

    const/16 v41, 0x6

    move/from16 v2, v37

    move-object/from16 v48, v47

    move-object/from16 v37, v13

    move v13, v1

    move-object/from16 v1, p1

    invoke-static/range {v4 .. v43}, Lqz0/k;->l(Landroidx/compose/ui/Modifier;Lcom/whoop/design/util/TextResource;Lb91/a;Lcom/whoop/design/util/TextResource;Lb91/a;Lc93/m;Lc93/m;Lqz0/c;Lcom/whoop/design/util/TextResource;ZZLb91/a;JZIIIZLq3/g0;ZZIZLj0/i;Ljava/lang/String;Li2/a1;Lg1/e8;Ll0/k1;Ll0/k1;Lu0/q0;Lc93/a;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;IIIIII)V

    move-object/from16 v13, v37

    invoke-virtual {v0}, Lty2/a$a$d;->j()Lcom/whoop/design/util/TextResource;

    move-result-object v4

    invoke-virtual {v0}, Lty2/a$a$d;->l()Z

    move-result v5

    if-ne v3, v2, :cond_18

    const/4 v9, 0x1

    goto :goto_d

    :cond_18
    const/4 v9, 0x0

    :goto_d
    invoke-virtual {v13}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    if-nez v9, :cond_19

    move-object/from16 v9, v48

    if-ne v2, v9, :cond_1a

    :cond_19
    new-instance v2, Lsy2/a;

    const/4 v3, 0x4

    invoke-direct {v2, v1, v3}, Lsy2/a;-><init>(Lkotlin/jvm/functions/Function1;I)V

    invoke-virtual {v13, v2}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_1a
    move-object v7, v2

    check-cast v7, Lc93/a;

    const/4 v10, 0x4

    const/4 v6, 0x0

    move-object v8, v13

    move/from16 v9, v44

    invoke-static/range {v4 .. v10}, Lry2/i;->c(Lcom/whoop/design/util/TextResource;ZLandroidx/compose/ui/Modifier;Lc93/a;Landroidx/compose/runtime/Composer;II)V

    const/4 v9, 0x1

    invoke-static {v13, v9, v9, v9}, Lm4/a;->y(Lp1/q;ZZZ)V

    goto :goto_e

    :cond_1b
    invoke-virtual {v13}, Lp1/q;->X()V

    :goto_e
    invoke-virtual {v13}, Lp1/q;->u()Lp1/v1;

    move-result-object v2

    if-eqz v2, :cond_1c

    new-instance v3, Lso2/f;

    const/16 v4, 0xb

    move/from16 v5, p3

    invoke-direct {v3, v0, v1, v5, v4}, Lso2/f;-><init>(Ljava/lang/Object;Ljava/lang/Object;II)V

    iput-object v3, v2, Lp1/v1;->d:Lc93/m;

    :cond_1c
    return-void
.end method

.method private static final h(Lg2/i;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lg2/i;->a(Lg2/i;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final i(Lty2/a$a$d;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 28

    and-int/lit8 v0, p2, 0x3

    const/4 v1, 0x2

    const/4 v2, 0x1

    if-eq v0, v1, :cond_0

    move v0, v2

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    and-int/lit8 v1, p2, 0x1

    move-object/from16 v2, p1

    check-cast v2, Lp1/q;

    invoke-virtual {v2, v1, v0}, Lp1/q;->U(IZ)Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-virtual/range {p0 .. p0}, Lty2/a$a$d;->h()Ljava/lang/String;

    move-result-object v0

    sget-object v1, Lx81/d;->a:Lx81/d;

    sget v3, Lx81/d;->b:I

    invoke-virtual {v1, v2, v3}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v4

    invoke-virtual {v4}, Lb91/d;->b()Lb91/a;

    move-result-object v22

    invoke-virtual {v1, v2, v3}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v1

    invoke-virtual {v1}, Ly81/i;->Y0()J

    move-result-wide v4

    sget v1, Lb91/a;->d:I

    shl-int/lit8 v26, v1, 0x12

    const v27, 0x2fffa

    const/4 v3, 0x0

    const-wide/16 v6, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const-wide/16 v11, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const-wide/16 v15, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v23, 0x0

    const/16 v25, 0x0

    move-object/from16 v24, v2

    move-object v2, v0

    invoke-static/range {v2 .. v27}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    goto :goto_1

    :cond_1
    move-object/from16 v24, v2

    invoke-virtual/range {v24 .. v24}, Lp1/q;->X()V

    :goto_1
    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method

.method private static final j()Ll83/a0;
    .locals 1

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method

.method private static final k(Lkotlin/jvm/functions/Function1;Ljava/lang/String;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Lny2/a$p;

    invoke-direct {v0, p1}, Lny2/a$p;-><init>(Ljava/lang/String;)V

    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final l(Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 1

    sget-object v0, Lny2/a$o;->a:Lny2/a$o;

    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final m(Lty2/a$a$d;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, Lp1/x;->L(I)I

    move-result p2

    invoke-static {p0, p1, p3, p2}, Lsy2/m;->g(Lty2/a$a$d;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method
