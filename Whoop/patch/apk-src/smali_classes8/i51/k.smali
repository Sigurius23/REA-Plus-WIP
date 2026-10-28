.class public abstract Li51/k;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Li51/k$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u001a5\u0010\u0008\u001a\u00020\u00062\u0008\u0008\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0001\u00a2\u0006\u0004\u0008\u0008\u0010\t\u00a8\u0006\u000c\u00b2\u0006\u000e\u0010\u000b\u001a\u00020\n8\n@\nX\u008a\u008e\u0002"
    }
    d2 = {
        "Landroidx/compose/ui/Modifier;",
        "modifier",
        "Li51/l;",
        "viewState",
        "Lkotlin/Function1;",
        "",
        "Ll83/a0;",
        "onViewEvent",
        "f",
        "(Landroidx/compose/ui/Modifier;Li51/l;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V",
        "Lv41/s;",
        "loadingState",
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
.method public static synthetic a(ILandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;
    .locals 0

    invoke-static {p0, p1}, Li51/k;->k(ILandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lp1/c1;Lv41/s;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Li51/k;->j(Lp1/c1;Lv41/s;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;
    .locals 0

    invoke-static {p0}, Li51/k;->l(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Lcom/whoop/navigation/e;Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 0

    invoke-static {p1, p0}, Li51/k;->i(Lkotlin/jvm/functions/Function1;Lcom/whoop/navigation/e;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic e(Landroidx/compose/ui/Modifier;Li51/l;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p6}, Li51/k;->m(Landroidx/compose/ui/Modifier;Li51/l;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final f(Landroidx/compose/ui/Modifier;Li51/l;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V
    .locals 47
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/ui/Modifier;",
            "Li51/l;",
            "Lkotlin/jvm/functions/Function1;",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    move-object/from16 v5, p1

    move-object/from16 v6, p2

    move/from16 v1, p4

    const-string v0, "viewState"

    invoke-static {v5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onViewEvent"

    invoke-static {v6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v10, p3

    check-cast v10, Lp1/q;

    const v0, -0x447074a8

    invoke-virtual {v10, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, p5, 0x1

    const/4 v2, 0x4

    const/4 v3, 0x2

    if-eqz v0, :cond_0

    or-int/lit8 v4, v1, 0x6

    move v7, v4

    move-object/from16 v4, p0

    goto :goto_1

    :cond_0
    and-int/lit8 v4, v1, 0x6

    if-nez v4, :cond_2

    move-object/from16 v4, p0

    invoke-virtual {v10, v4}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_1

    move v7, v2

    goto :goto_0

    :cond_1
    move v7, v3

    :goto_0
    or-int/2addr v7, v1

    goto :goto_1

    :cond_2
    move-object/from16 v4, p0

    move v7, v1

    :goto_1
    and-int/lit8 v8, v1, 0x30

    if-nez v8, :cond_5

    and-int/lit8 v8, v1, 0x40

    if-nez v8, :cond_3

    invoke-virtual {v10, v5}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v8

    goto :goto_2

    :cond_3
    invoke-virtual {v10, v5}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v8

    :goto_2
    if-eqz v8, :cond_4

    const/16 v8, 0x20

    goto :goto_3

    :cond_4
    const/16 v8, 0x10

    :goto_3
    or-int/2addr v7, v8

    :cond_5
    and-int/lit16 v8, v1, 0x180

    if-nez v8, :cond_7

    invoke-virtual {v10, v6}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_6

    const/16 v8, 0x100

    goto :goto_4

    :cond_6
    const/16 v8, 0x80

    :goto_4
    or-int/2addr v7, v8

    :cond_7
    and-int/lit16 v8, v7, 0x93

    const/16 v11, 0x92

    const/4 v14, 0x1

    if-eq v8, v11, :cond_8

    move v8, v14

    goto :goto_5

    :cond_8
    const/4 v8, 0x0

    :goto_5
    and-int/lit8 v11, v7, 0x1

    invoke-virtual {v10, v11, v8}, Lp1/q;->U(IZ)Z

    move-result v8

    if-eqz v8, :cond_37

    sget-object v15, Lb2/t;->w:Lb2/t;

    if-eqz v0, :cond_9

    move-object v4, v15

    :cond_9
    invoke-virtual {v5}, Li51/l;->e()Li51/i;

    move-result-object v0

    invoke-virtual {v0}, Li51/i;->c()Li51/h;

    move-result-object v0

    instance-of v0, v0, Li51/h$a;

    invoke-virtual {v10, v0}, Lp1/q;->h(Z)Z

    move-result v0

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v8

    sget-object v11, Lp1/l;->a:Lp1/v0;

    if-nez v0, :cond_a

    if-ne v8, v11, :cond_c

    :cond_a
    invoke-virtual {v5}, Li51/l;->e()Li51/i;

    move-result-object v0

    invoke-virtual {v0}, Li51/i;->c()Li51/h;

    move-result-object v0

    instance-of v0, v0, Li51/h$a;

    if-eqz v0, :cond_b

    sget-object v0, Lv41/s;->LOADING:Lv41/s;

    goto :goto_6

    :cond_b
    sget-object v0, Lv41/s;->READY:Lv41/s;

    :goto_6
    invoke-static {v0}, Lp1/x;->z(Ljava/lang/Object;)Lp1/k1;

    move-result-object v8

    invoke-virtual {v10, v8}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_c
    move-object v0, v8

    check-cast v0, Lp1/c1;

    invoke-virtual {v5}, Li51/l;->e()Li51/i;

    move-result-object v8

    invoke-virtual {v8}, Li51/i;->f()Li51/g;

    move-result-object v8

    sget-object v12, Li51/k$a;->a:[I

    invoke-virtual {v8}, Ljava/lang/Enum;->ordinal()I

    move-result v8

    aget v8, v12, v8

    const/4 v12, 0x3

    if-eq v8, v14, :cond_f

    if-eq v8, v3, :cond_e

    if-eq v8, v12, :cond_e

    const/4 v3, 0x5

    if-eq v8, v2, :cond_10

    if-ne v8, v3, :cond_d

    goto :goto_7

    :cond_d
    new-instance v0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {v0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw v0

    :cond_e
    move v3, v12

    goto :goto_7

    :cond_f
    const/4 v3, 0x2

    :cond_10
    :goto_7
    sget-object v8, Lb2/e;->N:Lb2/k;

    const-wide/high16 v12, 0x3fe0000000000000L    # 0.5

    double-to-float v13, v12

    const/16 v12, 0x8

    int-to-float v12, v12

    const/16 v14, 0x36

    invoke-static {v13, v12, v8, v10, v14}, Lm4/a;->n(FFLb2/k;Lp1/q;I)Ll0/x;

    move-result-object v8

    move/from16 v33, v3

    iget-wide v2, v10, Lp1/q;->T:J

    invoke-static {v2, v3}, Ljava/lang/Long;->hashCode(J)I

    move-result v2

    invoke-virtual {v10}, Lp1/q;->m()Lp1/p1;

    move-result-object v3

    invoke-static {v10, v4}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v14

    sget-object v17, La3/l;->a:La3/k;

    invoke-virtual/range {v17 .. v17}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move/from16 v23, v13

    sget-object v13, La3/k;->b:La3/j;

    invoke-virtual {v10}, Lp1/q;->i0()V

    iget-boolean v9, v10, Lp1/q;->S:Z

    if-eqz v9, :cond_11

    invoke-virtual {v10, v13}, Lp1/q;->l(Lc93/a;)V

    goto :goto_8

    :cond_11
    invoke-virtual {v10}, Lp1/q;->s0()V

    :goto_8
    sget-object v9, La3/k;->g:La3/i;

    invoke-static {v10, v9, v8}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v8, La3/k;->f:La3/i;

    invoke-static {v10, v8, v3}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v3, La3/k;->j:La3/i;

    iget-boolean v1, v10, Lp1/q;->S:Z

    if-nez v1, :cond_12

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    move-object/from16 v34, v4

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-static {v1, v4}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_13

    goto :goto_9

    :cond_12
    move-object/from16 v34, v4

    :goto_9
    invoke-static {v2, v10, v2, v3}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_13
    sget-object v1, La3/k;->d:La3/i;

    invoke-static {v10, v1, v14}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual {v5}, Li51/l;->e()Li51/i;

    move-result-object v2

    invoke-virtual {v2}, Li51/i;->f()Li51/g;

    move-result-object v2

    const/16 v4, 0xa

    int-to-float v4, v4

    const/4 v14, 0x4

    int-to-float v14, v14

    mul-float/2addr v4, v14

    invoke-virtual {v2, v4}, Li51/g;->getMediaSize-0ZcVfYs(F)J

    move-result-wide v4

    invoke-static {v4, v5, v15}, Landroidx/compose/foundation/layout/d;->q(JLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    sget-object v4, Lb2/e;->E:Lb2/m;

    const/4 v5, 0x0

    invoke-static {v4, v5}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v4

    move/from16 v24, v14

    move-object v5, v15

    iget-wide v14, v10, Lp1/q;->T:J

    invoke-static {v14, v15}, Ljava/lang/Long;->hashCode(J)I

    move-result v14

    invoke-virtual {v10}, Lp1/q;->m()Lp1/p1;

    move-result-object v15

    invoke-static {v10, v2}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    invoke-virtual {v10}, Lp1/q;->i0()V

    move-object/from16 v16, v5

    iget-boolean v5, v10, Lp1/q;->S:Z

    if-eqz v5, :cond_14

    invoke-virtual {v10, v13}, Lp1/q;->l(Lc93/a;)V

    goto :goto_a

    :cond_14
    invoke-virtual {v10}, Lp1/q;->s0()V

    :goto_a
    invoke-static {v10, v9, v4}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v10, v8, v15}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v4, v10, Lp1/q;->S:Z

    if-nez v4, :cond_15

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    invoke-static {v14}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-static {v4, v5}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_16

    :cond_15
    invoke-static {v14, v10, v14, v3}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_16
    invoke-static {v10, v1, v2}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual/range {p1 .. p1}, Li51/l;->c()Lcom/whoop/navigation/e;

    move-result-object v2

    const/4 v4, 0x0

    if-nez v2, :cond_17

    const v2, 0xab12143

    invoke-virtual {v10, v2}, Lp1/q;->e0(I)V

    const/4 v5, 0x0

    invoke-virtual {v10, v5}, Lp1/q;->q(Z)V

    move-object v2, v4

    move-object/from16 v15, v16

    goto :goto_c

    :cond_17
    const v5, 0xab12144

    invoke-virtual {v10, v5}, Lp1/q;->e0(I)V

    and-int/lit16 v5, v7, 0x380

    const/16 v7, 0x100

    if-ne v5, v7, :cond_18

    const/4 v5, 0x1

    goto :goto_b

    :cond_18
    const/4 v5, 0x0

    :goto_b
    invoke-virtual {v10, v2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v7

    or-int/2addr v5, v7

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v7

    if-nez v5, :cond_19

    if-ne v7, v11, :cond_1a

    :cond_19
    new-instance v7, Lck1/l;

    const/4 v5, 0x4

    invoke-direct {v7, v6, v2, v5}, Lck1/l;-><init>(Lkotlin/jvm/functions/Function1;Lcom/whoop/navigation/e;I)V

    invoke-virtual {v10, v7}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_1a
    move-object/from16 v19, v7

    check-cast v19, Lc93/a;

    const/16 v20, 0xf

    move-object/from16 v15, v16

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    invoke-static/range {v15 .. v20}, Landroidx/compose/foundation/a;->g(Landroidx/compose/ui/Modifier;ZLjava/lang/String;Li3/i;Lc93/a;I)Landroidx/compose/ui/Modifier;

    move-result-object v2

    const/4 v5, 0x0

    invoke-virtual {v10, v5}, Lp1/q;->q(Z)V

    :goto_c
    if-nez v2, :cond_1b

    move-object v2, v15

    :cond_1b
    invoke-virtual/range {p1 .. p1}, Li51/l;->e()Li51/i;

    move-result-object v7

    invoke-virtual {v10, v0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v5

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v14

    if-nez v5, :cond_1c

    if-ne v14, v11, :cond_1d

    :cond_1c
    new-instance v14, Lf1/a0;

    const/16 v5, 0x14

    invoke-direct {v14, v5, v0}, Lf1/a0;-><init>(ILp1/c1;)V

    invoke-virtual {v10, v14}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_1d
    check-cast v14, Lkotlin/jvm/functions/Function1;

    move-object v5, v11

    const/4 v11, 0x0

    move/from16 v16, v12

    const/4 v12, 0x0

    move-object/from16 v36, v5

    move-object v5, v9

    move-object v9, v14

    move-object v14, v8

    move-object v8, v2

    move/from16 v2, v16

    invoke-static/range {v7 .. v12}, Li51/f;->d(Li51/i;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    const/4 v7, 0x1

    invoke-virtual {v10, v7}, Lp1/q;->q(Z)V

    invoke-static {v0}, Li51/k;->g(Lp1/c1;)Lv41/s;

    move-result-object v7

    sget-object v8, Lv41/s;->READY:Lv41/s;

    const/16 v9, 0xc

    if-eq v7, v8, :cond_1e

    const v7, -0x675350b5

    invoke-virtual {v10, v7}, Lp1/q;->e0(I)V

    mul-float v17, v24, v24

    const/16 v19, 0x0

    const/16 v20, 0xd

    const/16 v16, 0x0

    const/16 v18, 0x0

    invoke-static/range {v15 .. v20}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v7

    move-object v11, v15

    int-to-float v12, v9

    mul-float v12, v12, v24

    move/from16 v15, v33

    int-to-float v9, v15

    mul-float/2addr v12, v9

    invoke-static {v12, v7}, Landroidx/compose/foundation/layout/d;->u(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v7

    invoke-static {v2, v7}, Landroidx/compose/foundation/layout/d;->h(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v7

    invoke-static/range {v24 .. v24}, Lt0/j;->e(F)Lt0/i;

    move-result-object v12

    invoke-static {v7, v12}, Lwb3/f;->r(Landroidx/compose/ui/Modifier;Li2/a1;)Landroidx/compose/ui/Modifier;

    move-result-object v7

    move-object/from16 v16, v0

    const/4 v0, 0x1

    const/4 v12, 0x0

    invoke-static {v7, v12, v0, v4}, Lgb1/c0;->d(Landroidx/compose/ui/Modifier;ZILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    move-result-object v7

    invoke-static {v7, v10, v12}, Ll0/q;->a(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V

    const/4 v7, 0x7

    int-to-float v7, v7

    mul-float v7, v7, v24

    mul-float/2addr v7, v9

    invoke-static {v7, v11}, Landroidx/compose/foundation/layout/d;->u(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v7

    invoke-static {v2, v7}, Landroidx/compose/foundation/layout/d;->h(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    invoke-static/range {v24 .. v24}, Lt0/j;->e(F)Lt0/i;

    move-result-object v7

    invoke-static {v2, v7}, Lwb3/f;->r(Landroidx/compose/ui/Modifier;Li2/a1;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    invoke-static {v2, v12, v0, v4}, Lgb1/c0;->d(Landroidx/compose/ui/Modifier;ZILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    invoke-static {v2, v10, v12}, Ll0/q;->a(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V

    invoke-virtual {v10, v12}, Lp1/q;->q(Z)V

    goto :goto_d

    :cond_1e
    move-object/from16 v16, v0

    move-object v11, v15

    move/from16 v15, v33

    const/4 v0, 0x1

    const/4 v12, 0x0

    const v2, -0x674b34cc

    invoke-virtual {v10, v2}, Lp1/q;->e0(I)V

    invoke-virtual {v10, v12}, Lp1/q;->q(Z)V

    :goto_d
    invoke-virtual/range {p1 .. p1}, Li51/l;->a()Lcom/whoop/design/util/TextResource;

    move-result-object v2

    if-eqz v2, :cond_1f

    invoke-static {v2}, Lcom/whoop/design/util/b;->d(Lcom/whoop/design/util/TextResource;)Z

    move-result v7

    if-eqz v7, :cond_1f

    goto :goto_e

    :cond_1f
    move-object v2, v4

    :goto_e
    invoke-virtual/range {p1 .. p1}, Li51/l;->g()Lcom/whoop/design/util/TextResource;

    move-result-object v7

    if-eqz v7, :cond_20

    invoke-static {v7}, Lcom/whoop/design/util/b;->d(Lcom/whoop/design/util/TextResource;)Z

    move-result v9

    if-eqz v9, :cond_20

    goto :goto_f

    :cond_20
    move-object v7, v4

    :goto_f
    invoke-virtual/range {p1 .. p1}, Li51/l;->e()Li51/i;

    move-result-object v9

    invoke-virtual {v9}, Li51/i;->g()Lcom/whoop/design/util/TextResource;

    move-result-object v9

    if-eqz v9, :cond_21

    invoke-static {v9}, Lcom/whoop/design/util/b;->d(Lcom/whoop/design/util/TextResource;)Z

    move-result v9

    invoke-static {v9}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v9

    goto :goto_10

    :cond_21
    move-object v9, v4

    :goto_10
    invoke-static/range {v16 .. v16}, Li51/k;->g(Lp1/c1;)Lv41/s;

    move-result-object v12

    if-ne v12, v8, :cond_36

    const v8, -0x674569e2

    invoke-virtual {v10, v8}, Lp1/q;->e0(I)V

    const/4 v8, 0x6

    if-nez v2, :cond_22

    const v12, -0x67461615

    invoke-virtual {v10, v12}, Lp1/q;->e0(I)V

    const/4 v12, 0x0

    invoke-virtual {v10, v12}, Lp1/q;->q(Z)V

    move-object/from16 p3, v1

    move-object/from16 p0, v2

    move-object/from16 v37, v3

    move-object/from16 v35, v7

    move v3, v8

    move-object/from16 v46, v9

    move-object v1, v11

    move v0, v12

    move-object v6, v13

    move-object v2, v14

    move v4, v15

    move/from16 v41, v23

    move/from16 v45, v24

    goto/16 :goto_15

    :cond_22
    const v12, -0x67461614

    invoke-virtual {v10, v12}, Lp1/q;->e0(I)V

    invoke-virtual/range {p1 .. p1}, Li51/l;->b()Lb91/c;

    move-result-object v12

    if-eqz v12, :cond_23

    sget-object v0, Lb91/c;->Companion:Lb91/c$a;

    invoke-virtual {v0, v12}, Lb91/c$a;->a(Lb91/c;)Lb91/a;

    move-result-object v0

    goto :goto_11

    :cond_23
    move-object v0, v4

    :goto_11
    if-nez v0, :cond_24

    const v0, -0x18b05af2

    invoke-virtual {v10, v0}, Lp1/q;->e0(I)V

    sget-object v0, Lx81/d;->a:Lx81/d;

    invoke-virtual {v0, v10, v8}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v0

    invoke-virtual {v0}, Lb91/d;->b()Lb91/a;

    move-result-object v0

    const/4 v12, 0x0

    :goto_12
    invoke-virtual {v10, v12}, Lp1/q;->q(Z)V

    move-object/from16 v27, v0

    move-object v4, v7

    goto :goto_13

    :cond_24
    const/4 v12, 0x0

    const v4, -0x18b06e14

    invoke-virtual {v10, v4}, Lp1/q;->e0(I)V

    goto :goto_12

    :goto_13
    invoke-static {v2, v10, v12}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v7

    sget-object v0, Lx81/d;->a:Lx81/d;

    invoke-virtual {v0, v10, v8}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v0

    invoke-virtual {v0}, Ly81/i;->y()J

    move-result-wide v16

    const/16 v0, 0xc

    int-to-float v8, v0

    mul-float v8, v8, v24

    int-to-float v0, v15

    mul-float/2addr v0, v8

    invoke-static {v0, v11}, Landroidx/compose/foundation/layout/d;->u(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v37

    mul-float v39, v24, v24

    const/16 v41, 0x0

    const/16 v42, 0xd

    const/16 v38, 0x0

    const/16 v40, 0x0

    invoke-static/range {v37 .. v42}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v8

    if-eqz v4, :cond_25

    const/16 v25, 0x1

    goto :goto_14

    :cond_25
    const/16 v25, 0x2

    :goto_14
    new-instance v0, Lw3/k;

    const/4 v12, 0x3

    invoke-direct {v0, v12}, Lw3/k;-><init>(I)V

    const/high16 v12, 0x3fc00000    # 1.5f

    invoke-static {v12}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v28

    const v31, 0xc00c30

    const v32, 0x95f8

    move-object/from16 v19, v11

    const-wide/16 v11, 0x0

    move-object/from16 v20, v13

    const/4 v13, 0x0

    move-object/from16 v26, v14

    const/4 v14, 0x0

    move/from16 v29, v15

    const/4 v15, 0x0

    move-object/from16 v35, v9

    move/from16 v30, v29

    move-object/from16 v29, v10

    move-wide/from16 v9, v16

    const-wide/16 v16, 0x0

    const/16 v37, 0xc

    const/16 v18, 0x0

    move-object/from16 v38, v20

    const/16 v39, 0x0

    const-wide/16 v20, 0x0

    const/16 v40, 0x1

    const/16 v22, 0x2

    move/from16 v41, v23

    const/16 v23, 0x0

    move/from16 v42, v24

    const/16 v24, 0x2

    move-object/from16 v43, v26

    const/16 v26, 0x0

    move/from16 v44, v30

    const/16 v30, 0x0

    move-object/from16 p3, v1

    move-object/from16 p0, v2

    move-object/from16 v37, v3

    move-object/from16 v1, v19

    move-object/from16 v46, v35

    move-object/from16 v6, v38

    move/from16 v45, v42

    move-object/from16 v2, v43

    const/4 v3, 0x6

    move-object/from16 v19, v0

    move-object/from16 v35, v4

    move/from16 v0, v39

    move/from16 v4, v44

    invoke-static/range {v7 .. v32}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v10, v29

    invoke-virtual {v10, v0}, Lp1/q;->q(Z)V

    :goto_15
    if-nez v35, :cond_26

    const v1, -0x6738bbf8

    invoke-virtual {v10, v1}, Lp1/q;->e0(I)V

    invoke-virtual {v10, v0}, Lp1/q;->q(Z)V

    const/4 v1, 0x1

    goto/16 :goto_24

    :cond_26
    const v7, -0x6738bbf7

    invoke-virtual {v10, v7}, Lp1/q;->e0(I)V

    invoke-virtual/range {p1 .. p1}, Li51/l;->h()Lb91/c;

    move-result-object v7

    if-eqz v7, :cond_27

    sget-object v8, Lb91/c;->Companion:Lb91/c$a;

    invoke-virtual {v8, v7}, Lb91/c$a;->a(Lb91/c;)Lb91/a;

    move-result-object v7

    move-object/from16 v33, v7

    goto :goto_16

    :cond_27
    const/16 v33, 0x0

    :goto_16
    if-nez v33, :cond_28

    const v7, 0x596c1a05

    invoke-virtual {v10, v7}, Lp1/q;->e0(I)V

    sget-object v7, Lx81/d;->a:Lx81/d;

    invoke-virtual {v7, v10, v3}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v7

    invoke-virtual {v7}, Lb91/d;->b()Lb91/a;

    move-result-object v33

    :goto_17
    invoke-virtual {v10, v0}, Lp1/q;->q(Z)V

    goto :goto_18

    :cond_28
    const v7, 0x596c0686

    invoke-virtual {v10, v7}, Lp1/q;->e0(I)V

    goto :goto_17

    :goto_18
    invoke-virtual/range {p1 .. p1}, Li51/l;->f()Lkd1/o;

    move-result-object v7

    if-eqz v7, :cond_29

    const/4 v13, 0x1

    goto :goto_19

    :cond_29
    move v13, v0

    :goto_19
    invoke-virtual {v10, v4}, Lp1/q;->e(I)Z

    move-result v7

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v8

    move-object/from16 v14, v36

    if-nez v7, :cond_2a

    if-ne v8, v14, :cond_2b

    :cond_2a
    new-instance v8, Lcom/whoop/data/local/room/dao/persistent/e;

    const/16 v7, 0xf

    invoke-direct {v8, v4, v7}, Lcom/whoop/data/local/room/dao/persistent/e;-><init>(II)V

    invoke-virtual {v10, v8}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_2b
    check-cast v8, Lkotlin/jvm/functions/Function1;

    invoke-static {v1, v13, v8}, Lgb1/d;->b(Landroidx/compose/ui/Modifier;ZLkotlin/jvm/functions/Function1;)Landroidx/compose/ui/Modifier;

    move-result-object v7

    if-eqz v13, :cond_2c

    sget-object v8, Ll0/m;->e:Ll0/h;

    goto :goto_1a

    :cond_2c
    sget-object v8, Ll0/m;->a:Ll0/e;

    :goto_1a
    sget-object v9, Lb2/e;->K:Lb2/l;

    const/16 v11, 0x30

    invoke-static {v8, v9, v10, v11}, Ll0/p1;->a(Ll0/i;Lb2/g;Landroidx/compose/runtime/Composer;I)Ll0/r1;

    move-result-object v8

    iget-wide v11, v10, Lp1/q;->T:J

    invoke-static {v11, v12}, Ljava/lang/Long;->hashCode(J)I

    move-result v9

    invoke-virtual {v10}, Lp1/q;->m()Lp1/p1;

    move-result-object v11

    invoke-static {v10, v7}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v7

    invoke-virtual {v10}, Lp1/q;->i0()V

    iget-boolean v12, v10, Lp1/q;->S:Z

    if-eqz v12, :cond_2d

    invoke-virtual {v10, v6}, Lp1/q;->l(Lc93/a;)V

    goto :goto_1b

    :cond_2d
    invoke-virtual {v10}, Lp1/q;->s0()V

    :goto_1b
    invoke-static {v10, v5, v8}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v10, v2, v11}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v2, v10, Lp1/q;->S:Z

    if-nez v2, :cond_2e

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-static {v2, v5}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_2f

    :cond_2e
    move-object/from16 v2, v37

    goto :goto_1d

    :cond_2f
    :goto_1c
    move-object/from16 v2, p3

    goto :goto_1e

    :goto_1d
    invoke-static {v9, v10, v9, v2}, Ld;->y(ILp1/q;ILa3/i;)V

    goto :goto_1c

    :goto_1e
    invoke-static {v10, v2, v7}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual/range {p1 .. p1}, Li51/l;->f()Lkd1/o;

    move-result-object v7

    if-nez v7, :cond_30

    const v2, -0x2bc70582

    invoke-virtual {v10, v2}, Lp1/q;->e0(I)V

    invoke-virtual {v10, v0}, Lp1/q;->q(Z)V

    move v5, v13

    move-object v6, v14

    move/from16 v2, v45

    :goto_1f
    move-object/from16 v7, v35

    goto :goto_20

    :cond_30
    const v2, -0x2bc70581

    invoke-virtual {v10, v2}, Lp1/q;->e0(I)V

    const/4 v11, 0x0

    const/4 v12, 0x3

    const/4 v8, 0x0

    const/4 v9, 0x0

    invoke-static/range {v7 .. v12}, Lkd1/p;->i(Lkd1/o;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)Ln2/a;

    move-result-object v7

    move/from16 v2, v45

    mul-float v5, v2, v2

    invoke-static {v5, v1}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v9

    const/16 v15, 0x61b0

    const/16 v16, 0x68

    const-string v8, ""

    move-object/from16 v29, v10

    const/4 v10, 0x0

    sget-object v11, Ly2/j;->b:Ly2/b1;

    const/4 v12, 0x0

    move v5, v13

    const/4 v13, 0x0

    move-object v6, v14

    move-object/from16 v14, v29

    invoke-static/range {v7 .. v16}, Lpf/c;->c(Ln2/a;Ljava/lang/String;Landroidx/compose/ui/Modifier;Lb2/h;Ly2/k;FLi2/y;Landroidx/compose/runtime/Composer;II)V

    move-object v10, v14

    move/from16 v7, v41

    invoke-static {v7, v2, v1, v10, v0}, Lih0/d0;->v(FFLb2/t;Lp1/q;Z)V

    goto :goto_1f

    :goto_20
    invoke-static {v7, v10, v0}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v35

    sget-object v7, Liz0/l;->a:Liz0/l;

    invoke-virtual/range {v33 .. v33}, Lb91/a;->d()Ll3/v0;

    move-result-object v11

    const/16 v24, 0x0

    const v25, 0xff7fff

    const-wide/16 v12, 0x0

    const-wide/16 v14, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const-wide/16 v18, 0x0

    const/16 v20, 0x3

    const-wide/16 v21, 0x0

    const/16 v23, 0x0

    invoke-static/range {v11 .. v25}, Ll3/v0;->b(Ll3/v0;JJLp3/r;Lp3/i;JIJLl3/g0;Lw3/i;I)Ll3/v0;

    move-result-object v8

    sget-object v9, Lx81/d;->a:Lx81/d;

    invoke-virtual {v9, v10, v3}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v11

    invoke-virtual {v11}, Ly81/i;->c1()J

    move-result-wide v11

    invoke-virtual {v9, v10, v3}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v3

    invoke-virtual {v3}, Ly81/i;->y()J

    move-result-wide v13

    const/high16 v31, 0x30000

    const/16 v32, 0x7ff8

    move-object/from16 v29, v10

    move-wide v9, v11

    move-wide v11, v13

    const-wide/16 v13, 0x0

    const/4 v15, 0x0

    const-wide/16 v16, 0x0

    const/16 v18, 0x0

    const-wide/16 v19, 0x0

    const/16 v21, 0x0

    const-wide/16 v22, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    const/16 v28, 0x0

    const/16 v30, 0x0

    invoke-virtual/range {v7 .. v32}, Liz0/l;->a(Ll3/v0;JJJLp3/r;JIJLiz0/a;JFFZZFLandroidx/compose/runtime/Composer;III)Liz0/m;

    move-result-object v10

    move-object/from16 v14, v29

    if-eqz v5, :cond_33

    const/high16 v1, 0x3f800000    # 1.0f

    float-to-double v2, v1

    const-wide/16 v7, 0x0

    cmpl-double v2, v2, v7

    if-lez v2, :cond_31

    const/4 v13, 0x1

    goto :goto_21

    :cond_31
    move v13, v0

    :goto_21
    if-nez v13, :cond_32

    const-string v2, "invalid weight; must be greater than zero"

    invoke-static {v2}, Lm0/a;->a(Ljava/lang/String;)V

    :cond_32
    new-instance v2, Landroidx/compose/foundation/layout/LayoutWeightElement;

    invoke-direct {v2, v1, v0}, Landroidx/compose/foundation/layout/LayoutWeightElement;-><init>(FZ)V

    goto :goto_22

    :cond_33
    const/16 v3, 0xc

    int-to-float v3, v3

    mul-float/2addr v3, v2

    int-to-float v2, v4

    mul-float/2addr v2, v3

    invoke-static {v2, v1}, Landroidx/compose/foundation/layout/d;->u(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    :goto_22
    sget-object v1, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    move-object/from16 v4, v46

    invoke-static {v4, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_34

    if-nez p0, :cond_34

    const/4 v13, 0x1

    goto :goto_23

    :cond_34
    move v13, v0

    :goto_23
    invoke-virtual {v14}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v6, :cond_35

    new-instance v1, Lhu1/g;

    const/16 v3, 0x16

    invoke-direct {v1, v3}, Lhu1/g;-><init>(I)V

    invoke-virtual {v14, v1}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_35
    check-cast v1, Lkotlin/jvm/functions/Function1;

    invoke-static {v2, v13, v1}, Lgb1/d;->b(Landroidx/compose/ui/Modifier;ZLkotlin/jvm/functions/Function1;)Landroidx/compose/ui/Modifier;

    move-result-object v8

    const/4 v1, 0x1

    xor-int/lit8 v9, v5, 0x1

    const/high16 v17, 0xc30000

    const/16 v18, 0x150

    const/4 v11, 0x0

    const/4 v12, 0x2

    const/4 v13, 0x0

    move-object/from16 v29, v14

    const/4 v14, 0x2

    const/4 v15, 0x0

    move-object/from16 v16, v29

    move-object/from16 v7, v35

    invoke-static/range {v7 .. v18}, Liz0/g;->M(Ljava/lang/String;Landroidx/compose/ui/Modifier;ZLiz0/m;Lkotlin/jvm/functions/Function1;IIIZLandroidx/compose/runtime/Composer;II)V

    move-object/from16 v10, v16

    invoke-virtual {v10, v1}, Lp1/q;->q(Z)V

    invoke-virtual {v10, v0}, Lp1/q;->q(Z)V

    :goto_24
    invoke-virtual {v10, v0}, Lp1/q;->q(Z)V

    goto :goto_25

    :cond_36
    move v1, v0

    const/4 v0, 0x0

    const v2, -0x67180b4c

    invoke-virtual {v10, v2}, Lp1/q;->e0(I)V

    invoke-virtual {v10, v0}, Lp1/q;->q(Z)V

    :goto_25
    invoke-virtual {v10, v1}, Lp1/q;->q(Z)V

    move-object/from16 v4, v34

    goto :goto_26

    :cond_37
    invoke-virtual {v10}, Lp1/q;->X()V

    :goto_26
    invoke-virtual {v10}, Lp1/q;->u()Lp1/v1;

    move-result-object v7

    if-eqz v7, :cond_38

    new-instance v0, Lhy0/v;

    const/4 v3, 0x6

    move-object/from16 v5, p1

    move-object/from16 v6, p2

    move/from16 v1, p4

    move/from16 v2, p5

    invoke-direct/range {v0 .. v6}, Lhy0/v;-><init>(IIILandroidx/compose/ui/Modifier;Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)V

    iput-object v0, v7, Lp1/v1;->d:Lc93/m;

    :cond_38
    return-void
.end method

.method private static final g(Lp1/c1;)Lv41/s;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp1/c1;",
            ")",
            "Lv41/s;"
        }
    .end annotation

    invoke-interface {p0}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lv41/s;

    return-object p0
.end method

.method private static final h(Lp1/c1;Lv41/s;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp1/c1;",
            "Lv41/s;",
            ")V"
        }
    .end annotation

    invoke-interface {p0, p1}, Lp1/c1;->setValue(Ljava/lang/Object;)V

    return-void
.end method

.method private static final i(Lkotlin/jvm/functions/Function1;Lcom/whoop/navigation/e;)Ll83/a0;
    .locals 0

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final j(Lp1/c1;Lv41/s;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0, p1}, Li51/k;->h(Lp1/c1;Lv41/s;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final k(ILandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;
    .locals 2

    const-string v0, "$this$applyIf"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/16 v0, 0xc

    int-to-float v0, v0

    const/4 v1, 0x4

    int-to-float v1, v1

    mul-float/2addr v0, v1

    int-to-float p0, p0

    mul-float/2addr p0, v0

    invoke-static {p0, p1}, Landroidx/compose/foundation/layout/d;->u(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object p0

    return-object p0
.end method

.method private static final l(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;
    .locals 7

    const-string v0, "$this$applyIf"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x4

    int-to-float v0, v0

    mul-float v3, v0, v0

    const/4 v5, 0x0

    const/16 v6, 0xd

    const/4 v2, 0x0

    const/4 v4, 0x0

    move-object v1, p0

    invoke-static/range {v1 .. v6}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object p0

    return-object p0
.end method

.method private static final m(Landroidx/compose/ui/Modifier;Li51/l;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 6

    or-int/lit8 p3, p3, 0x1

    invoke-static {p3}, Lp1/x;->L(I)I

    move-result v4

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move v5, p4

    move-object v3, p5

    invoke-static/range {v0 .. v5}, Li51/k;->f(Landroidx/compose/ui/Modifier;Li51/l;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method
