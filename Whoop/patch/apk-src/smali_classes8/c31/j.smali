.class public abstract Lc31/j;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lc31/j$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\"\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u001a-\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0014\u0008\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0007\u00a2\u0006\u0004\u0008\u0006\u0010\u0007\u001a\u001b\u0010\u000b\u001a\u00020\u0008*\u00020\u00082\u0006\u0010\n\u001a\u00020\tH\u0002\u00a2\u0006\u0004\u0008\u000b\u0010\u000c\u00a8\u0006\r"
    }
    d2 = {
        "Lc31/k;",
        "viewState",
        "Lkotlin/Function1;",
        "Lc31/c;",
        "Ll83/a0;",
        "onViewEvent",
        "e",
        "(Lc31/k;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V",
        "Landroidx/compose/ui/Modifier;",
        "Li2/x;",
        "color",
        "i",
        "(Landroidx/compose/ui/Modifier;J)Landroidx/compose/ui/Modifier;",
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
.method public static synthetic a(Lc31/k;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p5}, Lc31/j;->h(Lc31/k;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(JLk2/e;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, Lc31/j;->j(JLk2/e;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Lc31/c;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lc31/j;->f(Lc31/c;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Lq2/a;Lkotlin/jvm/functions/Function1;Lc31/k;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, Lc31/j;->g(Lq2/a;Lkotlin/jvm/functions/Function1;Lc31/k;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final e(Lc31/k;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V
    .locals 35
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lc31/k;",
            "Lkotlin/jvm/functions/Function1;",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    move-object/from16 v1, p0

    const-string v0, "viewState"

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v12, p2

    check-cast v12, Lp1/q;

    const v0, -0x69c7d11b

    invoke-virtual {v12, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, p3, 0x6

    if-nez v0, :cond_2

    and-int/lit8 v0, p3, 0x8

    if-nez v0, :cond_0

    invoke-virtual {v12, v1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v0

    goto :goto_0

    :cond_0
    invoke-virtual {v12, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v0

    :goto_0
    if-eqz v0, :cond_1

    const/4 v0, 0x4

    goto :goto_1

    :cond_1
    const/4 v0, 0x2

    :goto_1
    or-int v0, p3, v0

    goto :goto_2

    :cond_2
    move/from16 v0, p3

    :goto_2
    and-int/lit8 v2, p4, 0x2

    if-eqz v2, :cond_4

    or-int/lit8 v0, v0, 0x30

    :cond_3
    move-object/from16 v3, p1

    goto :goto_4

    :cond_4
    and-int/lit8 v3, p3, 0x30

    if-nez v3, :cond_3

    move-object/from16 v3, p1

    invoke-virtual {v12, v3}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_5

    const/16 v4, 0x20

    goto :goto_3

    :cond_5
    const/16 v4, 0x10

    :goto_3
    or-int/2addr v0, v4

    :goto_4
    and-int/lit8 v4, v0, 0x13

    const/16 v5, 0x12

    const/4 v13, 0x0

    if-eq v4, v5, :cond_6

    const/4 v4, 0x1

    goto :goto_5

    :cond_6
    move v4, v13

    :goto_5
    and-int/lit8 v5, v0, 0x1

    invoke-virtual {v12, v5, v4}, Lp1/q;->U(IZ)Z

    move-result v4

    if-eqz v4, :cond_20

    sget-object v14, Lp1/l;->a:Lp1/v0;

    if-eqz v2, :cond_8

    invoke-virtual {v12}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v14, :cond_7

    new-instance v2, Lbs1/n;

    const/16 v3, 0x1d

    invoke-direct {v2, v3}, Lbs1/n;-><init>(I)V

    invoke-virtual {v12, v2}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_7
    check-cast v2, Lkotlin/jvm/functions/Function1;

    move-object v4, v2

    goto :goto_6

    :cond_8
    move-object v4, v3

    :goto_6
    sget-object v2, Lb3/v1;->l:Lp1/u2;

    invoke-virtual {v12, v2}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v2

    move-object v15, v2

    check-cast v15, Lq2/a;

    sget-object v2, Lb2/e;->O:Lb2/k;

    sget-object v3, Ll0/m;->c:Ll0/g;

    const/16 v5, 0x30

    invoke-static {v3, v2, v12, v5}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v2

    iget-wide v5, v12, Lp1/q;->T:J

    invoke-static {v5, v6}, Ljava/lang/Long;->hashCode(J)I

    move-result v3

    invoke-virtual {v12}, Lp1/q;->m()Lp1/p1;

    move-result-object v5

    sget-object v6, Lb2/t;->w:Lb2/t;

    invoke-static {v12, v6}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v7

    sget-object v16, La3/l;->a:La3/k;

    invoke-virtual/range {v16 .. v16}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v8, La3/k;->b:La3/j;

    invoke-virtual {v12}, Lp1/q;->i0()V

    iget-boolean v11, v12, Lp1/q;->S:Z

    if-eqz v11, :cond_9

    invoke-virtual {v12, v8}, Lp1/q;->l(Lc93/a;)V

    goto :goto_7

    :cond_9
    invoke-virtual {v12}, Lp1/q;->s0()V

    :goto_7
    sget-object v11, La3/k;->g:La3/i;

    invoke-static {v12, v11, v2}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v2, La3/k;->f:La3/i;

    invoke-static {v12, v2, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v5, La3/k;->j:La3/i;

    iget-boolean v9, v12, Lp1/q;->S:Z

    if-nez v9, :cond_a

    invoke-virtual {v12}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v9

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    invoke-static {v9, v10}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v9

    if-nez v9, :cond_b

    :cond_a
    invoke-static {v3, v12, v3, v5}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_b
    sget-object v9, La3/k;->d:La3/i;

    invoke-static {v12, v9, v7}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    move-object v3, v2

    invoke-virtual {v1}, Lc31/k;->i()Lcom/whoop/design/util/TextResource;

    move-result-object v2

    const/4 v10, 0x3

    if-nez v2, :cond_c

    const v2, 0x33352564

    invoke-virtual {v12, v2}, Lp1/q;->e0(I)V

    invoke-virtual {v12, v13}, Lp1/q;->q(Z)V

    move/from16 v28, v0

    move-object v2, v4

    move-object v0, v5

    move-object v5, v12

    move-object/from16 v26, v14

    const/16 v14, 0x8

    move-object v12, v6

    move v6, v13

    move-object v13, v3

    goto :goto_8

    :cond_c
    const v7, 0x33352565

    invoke-virtual {v12, v7}, Lp1/q;->e0(I)V

    move-object v7, v3

    invoke-virtual {v1}, Lc31/k;->h()Lcom/whoop/design/util/TextResource;

    move-result-object v3

    shl-int/lit8 v13, v0, 0x3

    and-int/lit16 v13, v13, 0x380

    move-object/from16 v16, v7

    const/4 v7, 0x0

    move/from16 v28, v0

    move-object v0, v5

    move-object v5, v12

    move-object/from16 v26, v14

    const/16 v14, 0x8

    move-object v12, v6

    move v6, v13

    move-object/from16 v13, v16

    invoke-static/range {v2 .. v7}, Lc31/h;->d(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    move-object v2, v4

    int-to-float v3, v10

    int-to-float v4, v14

    const/4 v6, 0x0

    invoke-static {v3, v4, v12, v5, v6}, Lr80/c;->z(FFLb2/t;Lp1/q;Z)V

    :goto_8
    invoke-virtual {v1}, Lc31/k;->l()Ly81/e;

    move-result-object v3

    if-nez v3, :cond_d

    const v3, 0x3339cf7f

    invoke-virtual {v5, v3}, Lp1/q;->e0(I)V

    invoke-virtual {v5, v6}, Lp1/q;->q(Z)V

    const/4 v3, 0x0

    goto :goto_9

    :cond_d
    const v4, 0x22af48c2

    invoke-virtual {v5, v4}, Lp1/q;->e0(I)V

    invoke-interface {v3, v5, v6}, Ly81/e;->toComposableColor-WaAFU9c(Landroidx/compose/runtime/Composer;I)J

    move-result-wide v3

    invoke-static {v5, v6, v3, v4}, Ldc/b;->h(Lp1/q;ZJ)Li2/x;

    move-result-object v3

    :goto_9
    if-eqz v3, :cond_e

    iget-wide v3, v3, Li2/x;->a:J

    invoke-static {v12, v3, v4}, Lc31/j;->i(Landroidx/compose/ui/Modifier;J)Landroidx/compose/ui/Modifier;

    move-result-object v3

    goto :goto_a

    :cond_e
    move-object v3, v12

    :goto_a
    sget-object v4, Lb2/e;->F:Lb2/m;

    invoke-static {v4, v6}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v7

    move-object/from16 p1, v15

    iget-wide v14, v5, Lp1/q;->T:J

    invoke-static {v14, v15}, Ljava/lang/Long;->hashCode(J)I

    move-result v14

    invoke-virtual {v5}, Lp1/q;->m()Lp1/p1;

    move-result-object v15

    invoke-static {v5, v3}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    invoke-virtual {v5}, Lp1/q;->i0()V

    iget-boolean v6, v5, Lp1/q;->S:Z

    if-eqz v6, :cond_f

    invoke-virtual {v5, v8}, Lp1/q;->l(Lc93/a;)V

    goto :goto_b

    :cond_f
    invoke-virtual {v5}, Lp1/q;->s0()V

    :goto_b
    invoke-static {v5, v11, v7}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v5, v13, v15}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v6, v5, Lp1/q;->S:Z

    if-nez v6, :cond_10

    invoke-virtual {v5}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v6

    invoke-static {v14}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-static {v6, v7}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_11

    :cond_10
    invoke-static {v14, v5, v14, v0}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_11
    invoke-static {v5, v9, v3}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual {v1}, Lc31/k;->g()Z

    move-result v3

    if-eqz v3, :cond_12

    invoke-virtual {v1}, Lc31/k;->p()Lc31/d;

    move-result-object v3

    sget-object v6, Lc31/d;->LOADING:Lc31/d;

    if-eq v3, v6, :cond_12

    const/16 v30, 0x1

    goto :goto_c

    :cond_12
    const/16 v30, 0x0

    :goto_c
    const-wide/high16 v6, 0x3fe0000000000000L    # 0.5

    double-to-float v3, v6

    const/16 v14, 0x8

    int-to-float v6, v14

    mul-float v17, v3, v6

    const/16 v3, 0xb

    int-to-float v3, v3

    mul-float v19, v3, v6

    const/16 v20, 0x0

    const/16 v21, 0xa

    const/16 v18, 0x0

    move-object/from16 v16, v12

    invoke-static/range {v16 .. v21}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v3

    const/high16 v6, 0x3f800000    # 1.0f

    invoke-static {v6, v3}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    const/4 v6, 0x0

    invoke-static {v4, v6}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v4

    iget-wide v6, v5, Lp1/q;->T:J

    invoke-static {v6, v7}, Ljava/lang/Long;->hashCode(J)I

    move-result v6

    invoke-virtual {v5}, Lp1/q;->m()Lp1/p1;

    move-result-object v7

    invoke-static {v5, v3}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    invoke-virtual {v5}, Lp1/q;->i0()V

    iget-boolean v14, v5, Lp1/q;->S:Z

    if-eqz v14, :cond_13

    invoke-virtual {v5, v8}, Lp1/q;->l(Lc93/a;)V

    goto :goto_d

    :cond_13
    invoke-virtual {v5}, Lp1/q;->s0()V

    :goto_d
    invoke-static {v5, v11, v4}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v5, v13, v7}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v4, v5, Lp1/q;->S:Z

    if-nez v4, :cond_14

    invoke-virtual {v5}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-static {v4, v7}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_15

    :cond_14
    invoke-static {v6, v5, v6, v0}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_15
    invoke-static {v5, v9, v3}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const-string v0, "progress_button_text"

    invoke-static {v12, v0}, Landroidx/compose/ui/platform/a;->a(Landroidx/compose/ui/Modifier;Ljava/lang/String;)Landroidx/compose/ui/Modifier;

    move-result-object v29

    move-object/from16 v0, p1

    invoke-virtual {v5, v0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v3

    and-int/lit8 v4, v28, 0x70

    const/16 v6, 0x20

    if-ne v4, v6, :cond_16

    const/4 v6, 0x1

    goto :goto_e

    :cond_16
    const/4 v6, 0x0

    :goto_e
    or-int/2addr v3, v6

    and-int/lit8 v4, v28, 0xe

    const/4 v6, 0x4

    if-eq v4, v6, :cond_18

    and-int/lit8 v4, v28, 0x8

    if-eqz v4, :cond_17

    invoke-virtual {v5, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_17

    goto :goto_f

    :cond_17
    const/4 v4, 0x0

    goto :goto_10

    :cond_18
    :goto_f
    const/4 v4, 0x1

    :goto_10
    or-int/2addr v3, v4

    invoke-virtual {v5}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    if-nez v3, :cond_19

    move-object/from16 v3, v26

    if-ne v4, v3, :cond_1a

    :cond_19
    new-instance v4, Lc;

    const/16 v3, 0x17

    invoke-direct {v4, v0, v2, v1, v3}, Lc;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    invoke-virtual {v5, v4}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_1a
    move-object/from16 v33, v4

    check-cast v33, Lc93/a;

    const/16 v34, 0xe

    const/16 v31, 0x0

    const/16 v32, 0x0

    invoke-static/range {v29 .. v34}, Landroidx/compose/foundation/a;->g(Landroidx/compose/ui/Modifier;ZLjava/lang/String;Li3/i;Lc93/a;I)Landroidx/compose/ui/Modifier;

    move-result-object v3

    invoke-virtual {v1}, Lc31/k;->f()Lcom/whoop/design/util/TextResource;

    move-result-object v0

    const/4 v4, 0x0

    invoke-static {v0, v5, v4}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v1}, Lc31/k;->g()Z

    move-result v7

    const/4 v8, 0x6

    if-eqz v7, :cond_1b

    const v7, -0x4e5b166a

    invoke-virtual {v5, v7}, Lp1/q;->e0(I)V

    invoke-virtual {v1}, Lc31/k;->r()Ly81/e;

    move-result-object v7

    invoke-interface {v7, v5, v4}, Ly81/e;->toComposableColor-WaAFU9c(Landroidx/compose/runtime/Composer;I)J

    move-result-wide v11

    invoke-virtual {v5, v4}, Lp1/q;->q(Z)V

    goto :goto_11

    :cond_1b
    const v7, -0x4e5b1116

    invoke-virtual {v5, v7}, Lp1/q;->e0(I)V

    sget-object v7, Lx81/d;->a:Lx81/d;

    invoke-static {v7, v5, v8, v4}, Lih0/d0;->d(Lx81/d;Lp1/q;IZ)J

    move-result-wide v11

    :goto_11
    sget-object v7, Lx81/d;->a:Lx81/d;

    invoke-virtual {v7, v5, v8}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v7

    invoke-virtual {v7}, Lb91/d;->s()Lb91/a;

    move-result-object v7

    new-instance v14, Lw3/k;

    invoke-direct {v14, v8}, Lw3/k;-><init>(I)V

    const/16 v26, 0xc30

    const v27, 0x2d5f8

    move/from16 v23, v6

    move-object/from16 v22, v7

    const/4 v8, 0x1

    const-wide/16 v6, 0x0

    move v9, v8

    const/4 v8, 0x0

    move v13, v9

    const/4 v9, 0x0

    move v15, v10

    const/4 v10, 0x0

    move/from16 v25, v4

    move-object/from16 v24, v5

    move-wide v4, v11

    const-wide/16 v11, 0x0

    move/from16 v16, v13

    const/4 v13, 0x0

    move/from16 v17, v15

    move/from16 v18, v16

    const-wide/16 v15, 0x0

    move/from16 v19, v17

    const/16 v17, 0x2

    move/from16 v20, v18

    const/16 v18, 0x0

    move/from16 v21, v19

    const/16 v19, 0x1

    move/from16 v29, v20

    const/16 v20, 0x0

    move/from16 v30, v21

    const/16 v21, 0x0

    move/from16 v31, v23

    const/16 v23, 0x0

    move/from16 v32, v25

    const/16 v25, 0x0

    move-object/from16 p1, v2

    move/from16 v1, v32

    move-object v2, v0

    move/from16 v0, v29

    invoke-static/range {v2 .. v27}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v12, v24

    invoke-virtual {v12, v0}, Lp1/q;->q(Z)V

    invoke-virtual/range {p0 .. p0}, Lc31/k;->p()Lc31/d;

    move-result-object v2

    sget-object v3, Lc31/j$a;->a:[I

    invoke-virtual {v2}, Ljava/lang/Enum;->ordinal()I

    move-result v2

    aget v2, v3, v2

    const/high16 v3, 0x70000000

    if-eq v2, v0, :cond_1f

    const/4 v4, 0x2

    if-eq v2, v4, :cond_1e

    const/4 v15, 0x3

    if-eq v2, v15, :cond_1d

    const/4 v6, 0x4

    if-ne v2, v6, :cond_1c

    const v2, 0x5c3a1f5b

    invoke-virtual {v12, v2}, Lp1/q;->e0(I)V

    invoke-virtual/range {p0 .. p0}, Lc31/k;->g()Z

    move-result v2

    move v4, v3

    invoke-virtual/range {p0 .. p0}, Lc31/k;->s()I

    move-result v3

    move v5, v4

    invoke-virtual/range {p0 .. p0}, Lc31/k;->j()I

    move-result v4

    move v6, v5

    invoke-virtual/range {p0 .. p0}, Lc31/k;->e()Ly81/e;

    move-result-object v5

    move v7, v6

    invoke-virtual/range {p0 .. p0}, Lc31/k;->c()Li2/t;

    move-result-object v6

    move v8, v7

    invoke-virtual/range {p0 .. p0}, Lc31/k;->m()Lgz0/m0;

    move-result-object v7

    invoke-virtual/range {p0 .. p0}, Lc31/k;->k()Ljava/lang/Float;

    move-result-object v9

    invoke-virtual/range {p0 .. p0}, Lc31/k;->q()Ljava/lang/String;

    move-result-object v10

    shl-int/lit8 v11, v28, 0x18

    and-int v13, v11, v8

    const/16 v14, 0x40

    const/4 v8, 0x0

    move-object/from16 v11, p1

    invoke-static/range {v2 .. v14}, Lc31/p;->j(ZIILy81/e;Li2/t;Lgz0/m0;ZLjava/lang/Float;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    invoke-virtual {v12, v1}, Lp1/q;->q(Z)V

    goto/16 :goto_12

    :cond_1c
    const v0, 0x3cc78789

    invoke-static {v0, v12, v1}, Ldc/b;->v(ILp1/q;Z)Lkotlin/NoWhenBranchMatchedException;

    move-result-object v0

    throw v0

    :cond_1d
    move-object/from16 v11, p1

    const v2, 0x5c339998

    invoke-virtual {v12, v2}, Lp1/q;->e0(I)V

    invoke-virtual/range {p0 .. p0}, Lc31/k;->g()Z

    move-result v2

    invoke-virtual/range {p0 .. p0}, Lc31/k;->e()Ly81/e;

    move-result-object v3

    invoke-virtual/range {p0 .. p0}, Lc31/k;->c()Li2/t;

    move-result-object v4

    invoke-virtual/range {p0 .. p0}, Lc31/k;->n()Ly81/e;

    move-result-object v5

    invoke-virtual/range {p0 .. p0}, Lc31/k;->m()Lgz0/m0;

    move-result-object v6

    invoke-virtual/range {p0 .. p0}, Lc31/k;->q()Ljava/lang/String;

    move-result-object v7

    shl-int/lit8 v8, v28, 0xf

    const/high16 v9, 0x380000

    and-int v10, v8, v9

    move-object v8, v11

    const/4 v11, 0x0

    move-object v9, v12

    invoke-static/range {v2 .. v11}, Lc31/g;->e(ZLy81/e;Li2/t;Ly81/e;Lgz0/m0;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    move-object v11, v8

    invoke-virtual {v12, v1}, Lp1/q;->q(Z)V

    goto :goto_12

    :cond_1e
    move-object/from16 v11, p1

    const v2, 0x3cc7d242

    invoke-virtual {v12, v2}, Lp1/q;->e0(I)V

    invoke-static {v12, v1}, Lc31/b;->d(Landroidx/compose/runtime/Composer;I)V

    invoke-virtual {v12, v1}, Lp1/q;->q(Z)V

    goto :goto_12

    :cond_1f
    move-object/from16 v11, p1

    move v8, v3

    const v2, 0x5c29d277

    invoke-virtual {v12, v2}, Lp1/q;->e0(I)V

    invoke-virtual/range {p0 .. p0}, Lc31/k;->g()Z

    move-result v2

    invoke-virtual/range {p0 .. p0}, Lc31/k;->s()I

    move-result v3

    invoke-virtual/range {p0 .. p0}, Lc31/k;->j()I

    move-result v4

    invoke-virtual/range {p0 .. p0}, Lc31/k;->e()Ly81/e;

    move-result-object v5

    invoke-virtual/range {p0 .. p0}, Lc31/k;->c()Li2/t;

    move-result-object v6

    invoke-virtual/range {p0 .. p0}, Lc31/k;->m()Lgz0/m0;

    move-result-object v7

    invoke-virtual/range {p0 .. p0}, Lc31/k;->k()Ljava/lang/Float;

    move-result-object v9

    invoke-virtual/range {p0 .. p0}, Lc31/k;->q()Ljava/lang/String;

    move-result-object v10

    shl-int/lit8 v13, v28, 0x18

    and-int/2addr v8, v13

    const/high16 v13, 0x180000

    or-int/2addr v13, v8

    const/4 v14, 0x0

    const/4 v8, 0x1

    invoke-static/range {v2 .. v14}, Lc31/p;->j(ZIILy81/e;Li2/t;Lgz0/m0;ZLjava/lang/Float;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    invoke-virtual {v12, v1}, Lp1/q;->q(Z)V

    :goto_12
    invoke-virtual {v12, v0}, Lp1/q;->q(Z)V

    invoke-virtual {v12, v0}, Lp1/q;->q(Z)V

    move-object v3, v11

    goto :goto_13

    :cond_20
    invoke-virtual {v12}, Lp1/q;->X()V

    :goto_13
    invoke-virtual {v12}, Lp1/q;->u()Lp1/v1;

    move-result-object v6

    if-eqz v6, :cond_21

    new-instance v0, La01/i;

    const/16 v5, 0x11

    move-object/from16 v1, p0

    move/from16 v2, p3

    move/from16 v4, p4

    invoke-direct/range {v0 .. v5}, La01/i;-><init>(Ljava/lang/Object;ILjava/lang/Object;II)V

    iput-object v0, v6, Lp1/v1;->d:Lc93/m;

    :cond_21
    return-void
.end method

.method private static final f(Lc31/c;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final g(Lq2/a;Lkotlin/jvm/functions/Function1;Lc31/k;)Ll83/a0;
    .locals 1

    const/4 v0, 0x0

    invoke-interface {p0, v0}, Lq2/a;->a(I)V

    invoke-virtual {p2}, Lc31/k;->p()Lc31/d;

    move-result-object p0

    invoke-virtual {p0}, Lc31/d;->toButtonClickType()Lc31/c;

    move-result-object p0

    invoke-interface {p1, p0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final h(Lc31/k;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, Lp1/x;->L(I)I

    move-result p2

    invoke-static {p0, p1, p4, p2, p3}, Lc31/j;->e(Lc31/k;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final i(Landroidx/compose/ui/Modifier;J)Landroidx/compose/ui/Modifier;
    .locals 2

    new-instance v0, Lai1/b;

    const/4 v1, 0x2

    invoke-direct {v0, p1, p2, v1}, Lai1/b;-><init>(JI)V

    invoke-static {p0, v0}, Landroidx/compose/ui/draw/a;->a(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;)Landroidx/compose/ui/Modifier;

    move-result-object p0

    return-object p0
.end method

.method private static final j(JLk2/e;)Ll83/a0;
    .locals 16

    move-object/from16 v0, p2

    const-string v1, "$this$drawBehind"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {}, Lc31/l;->b()F

    move-result v1

    invoke-interface {v0, v1}, Ly3/c;->q0(F)F

    move-result v1

    const/high16 v2, 0x40c00000    # 6.0f

    mul-float/2addr v1, v2

    invoke-static {}, Lc31/l;->b()F

    move-result v2

    invoke-interface {v0, v2}, Ly3/c;->q0(F)F

    move-result v2

    const/high16 v3, 0x40a00000    # 5.0f

    mul-float/2addr v2, v3

    invoke-interface {v0}, Lk2/e;->d()J

    move-result-wide v3

    const/16 v5, 0x20

    shr-long/2addr v3, v5

    long-to-int v3, v3

    invoke-static {v3}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v3

    invoke-interface {v0}, Lk2/e;->d()J

    move-result-wide v6

    const-wide v8, 0xffffffffL

    and-long/2addr v6, v8

    long-to-int v4, v6

    invoke-static {v4}, Ljava/lang/Float;->intBitsToFloat(I)F

    move-result v4

    invoke-static {v3}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v3

    int-to-long v6, v3

    invoke-static {v4}, Ljava/lang/Float;->floatToRawIntBits(F)I

    move-result v3

    int-to-long v3, v3

    shl-long v5, v6, v5

    and-long/2addr v3, v8

    or-long/2addr v3, v5

    const/high16 v5, 0x40000000    # 2.0f

    div-float v11, v1, v5

    div-float/2addr v2, v1

    invoke-interface {v0}, Lk2/e;->t0()La3/p;

    move-result-object v13

    invoke-virtual {v13}, La3/p;->A()J

    move-result-wide v14

    invoke-virtual {v13}, La3/p;->w()Li2/v;

    move-result-object v1

    invoke-interface {v1}, Li2/v;->q()V

    :try_start_0
    iget-object v1, v13, La3/p;->x:Ljava/lang/Object;

    check-cast v1, Laj/d;

    const/high16 v5, 0x3f800000    # 1.0f

    invoke-virtual {v1, v5, v3, v4, v2}, Laj/d;->w(FJF)V

    sget-object v7, Li2/t;->b:Li2/s;

    const v1, 0x3e99999a    # 0.3f

    move-wide/from16 v5, p0

    invoke-static {v1, v5, v6}, Li2/x;->c(FJ)J

    move-result-wide v1

    new-instance v5, Li2/x;

    invoke-direct {v5, v1, v2}, Li2/x;-><init>(J)V

    sget-wide v1, Li2/x;->m:J

    new-instance v6, Li2/x;

    invoke-direct {v6, v1, v2}, Li2/x;-><init>(J)V

    filled-new-array {v5, v6}, [Li2/x;

    move-result-object v1

    invoke-static {v1}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v8

    const/16 v12, 0x8

    move-wide v9, v3

    invoke-static/range {v7 .. v12}, Li2/s;->g(Li2/s;Ljava/util/List;JFI)Li2/u0;

    move-result-object v1

    move v2, v11

    const/4 v6, 0x0

    const/16 v7, 0x78

    const/4 v5, 0x0

    invoke-static/range {v0 .. v7}, Lk2/e;->G(Lk2/e;Li2/t;FJFLk2/f;I)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-static {v13, v14, v15}, Ld;->z(La3/p;J)V

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0

    :catchall_0
    move-exception v0

    invoke-static {v13, v14, v15}, Ld;->z(La3/p;J)V

    throw v0
.end method
