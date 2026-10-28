.class public abstract Lxq2/b0;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000*\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\u0008\u0002\u001a5\u0010\u0008\u001a\u00020\u00062\u0008\u0008\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0007\u00a2\u0006\u0004\u0008\u0008\u0010\t\u00a8\u0006\u000e\u00b2\u0006\u000e\u0010\u000b\u001a\u00020\n8\n@\nX\u008a\u008e\u0002\u00b2\u0006\u000e\u0010\r\u001a\u00020\u000c8\n@\nX\u008a\u008e\u0002"
    }
    d2 = {
        "Landroidx/compose/ui/Modifier;",
        "modifier",
        "Lxq2/c0;",
        "viewState",
        "Lkotlin/Function1;",
        "",
        "Ll83/a0;",
        "onViewEvent",
        "j",
        "(Landroidx/compose/ui/Modifier;Lxq2/c0;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V",
        "Lq3/y;",
        "textFieldValue",
        "",
        "previewText",
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
.method public static synthetic a(Landroidx/compose/ui/Modifier;Lxq2/c0;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p6}, Lxq2/b0;->u(Landroidx/compose/ui/Modifier;Lxq2/c0;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lb3/x2;Lu0/p0;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lxq2/b0;->r(Lb3/x2;Lu0/p0;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Lkotlin/jvm/functions/Function1;Lp1/c1;Lq3/y;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, Lxq2/b0;->s(Lkotlin/jvm/functions/Function1;Lp1/c1;Lq3/y;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Li3/z;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lxq2/b0;->q(Li3/z;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic e(Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lxq2/b0;->n(Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic f(Lp1/c1;Lg2/v;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lxq2/b0;->p(Lp1/c1;Lg2/v;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic g(Ljava/lang/String;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lxq2/b0;->k(Ljava/lang/String;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic h(Lxq2/d0;Lkotlin/jvm/functions/Function1;Lb3/x2;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, Lxq2/b0;->t(Lxq2/d0;Lkotlin/jvm/functions/Function1;Lb3/x2;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic i(Lxq2/c0;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, Lxq2/b0;->o(Lxq2/c0;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final j(Landroidx/compose/ui/Modifier;Lxq2/c0;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V
    .locals 60
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/ui/Modifier;",
            "Lxq2/c0;",
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

    move-object/from16 v0, p3

    check-cast v0, Lp1/q;

    const v2, 0x45eed2bb

    invoke-virtual {v0, v2}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v2, p5, 0x1

    const/4 v3, 0x4

    if-eqz v2, :cond_0

    or-int/lit8 v7, v1, 0x6

    move v8, v7

    move-object/from16 v7, p0

    goto :goto_1

    :cond_0
    and-int/lit8 v7, v1, 0x6

    if-nez v7, :cond_2

    move-object/from16 v7, p0

    invoke-virtual {v0, v7}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_1

    move v8, v3

    goto :goto_0

    :cond_1
    const/4 v8, 0x2

    :goto_0
    or-int/2addr v8, v1

    goto :goto_1

    :cond_2
    move-object/from16 v7, p0

    move v8, v1

    :goto_1
    and-int/lit8 v9, v1, 0x30

    if-nez v9, :cond_5

    and-int/lit8 v9, v1, 0x40

    if-nez v9, :cond_3

    invoke-virtual {v0, v5}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v9

    goto :goto_2

    :cond_3
    invoke-virtual {v0, v5}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v9

    :goto_2
    if-eqz v9, :cond_4

    const/16 v9, 0x20

    goto :goto_3

    :cond_4
    const/16 v9, 0x10

    :goto_3
    or-int/2addr v8, v9

    :cond_5
    and-int/lit16 v9, v1, 0x180

    if-nez v9, :cond_7

    invoke-virtual {v0, v6}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_6

    const/16 v9, 0x100

    goto :goto_4

    :cond_6
    const/16 v9, 0x80

    :goto_4
    or-int/2addr v8, v9

    :cond_7
    and-int/lit16 v9, v8, 0x93

    const/16 v11, 0x92

    const/4 v12, 0x0

    if-eq v9, v11, :cond_8

    const/4 v9, 0x1

    goto :goto_5

    :cond_8
    move v9, v12

    :goto_5
    and-int/lit8 v11, v8, 0x1

    invoke-virtual {v0, v11, v9}, Lp1/q;->U(IZ)Z

    move-result v9

    if-eqz v9, :cond_37

    sget-object v14, Lb2/t;->w:Lb2/t;

    if-eqz v2, :cond_9

    move-object v2, v14

    goto :goto_6

    :cond_9
    move-object v2, v7

    :goto_6
    invoke-static {}, Lxq2/e0;->e()Lp1/t1;

    move-result-object v7

    invoke-virtual {v0, v7}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lxq2/d0;

    sget-object v9, Lb3/v1;->p:Lp1/u2;

    invoke-virtual {v0, v9}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Lb3/x2;

    if-eqz v7, :cond_a

    invoke-virtual {v7}, Lxq2/d0;->b()Ljava/lang/String;

    move-result-object v11

    if-nez v11, :cond_b

    :cond_a
    const-string v11, ""

    :cond_b
    if-eqz v7, :cond_c

    invoke-virtual {v7}, Lxq2/d0;->a()Lkotlin/jvm/functions/Function1;

    move-result-object v16

    goto :goto_7

    :cond_c
    const/16 v16, 0x0

    :goto_7
    sget-object v4, Lp1/l;->a:Lp1/v0;

    if-nez v16, :cond_e

    const v10, 0x2b225705

    invoke-virtual {v0, v10}, Lp1/q;->e0(I)V

    invoke-virtual {v0}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v10

    if-ne v10, v4, :cond_d

    new-instance v10, Lxl0/b;

    const/4 v13, 0x7

    invoke-direct {v10, v13}, Lxl0/b;-><init>(I)V

    invoke-virtual {v0, v10}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_d
    move-object/from16 v16, v10

    check-cast v16, Lkotlin/jvm/functions/Function1;

    :goto_8
    invoke-virtual {v0, v12}, Lp1/q;->q(Z)V

    move-object/from16 v10, v16

    goto :goto_9

    :cond_e
    const v10, -0x7a7ac781

    invoke-virtual {v0, v10}, Lp1/q;->e0(I)V

    goto :goto_8

    :goto_9
    invoke-virtual {v0}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v13

    if-ne v13, v4, :cond_f

    invoke-static {v0}, Lte0/d;->h(Lp1/q;)Lg2/s;

    move-result-object v13

    :cond_f
    check-cast v13, Lg2/s;

    invoke-virtual {v5}, Lxq2/c0;->f()Ljava/lang/String;

    move-result-object v12

    if-eqz v12, :cond_10

    invoke-virtual {v11, v12}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v12

    if-eqz v12, :cond_10

    const/4 v12, 0x1

    goto :goto_a

    :cond_10
    const/4 v12, 0x0

    :goto_a
    invoke-static {v11}, Lyb3/r;->i0(Ljava/lang/CharSequence;)Z

    move-result v16

    if-nez v16, :cond_11

    if-nez v12, :cond_11

    const/16 v33, 0x1

    goto :goto_b

    :cond_11
    const/16 v33, 0x0

    :goto_b
    invoke-virtual {v0, v11}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v12

    invoke-virtual {v0}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v15

    if-nez v12, :cond_13

    if-ne v15, v4, :cond_12

    goto :goto_c

    :cond_12
    move-object/from16 v24, v7

    move/from16 v23, v8

    goto :goto_f

    :cond_13
    :goto_c
    invoke-virtual {v11}, Ljava/lang/String;->length()I

    move-result v12

    if-lez v12, :cond_14

    const/4 v12, 0x1

    goto :goto_d

    :cond_14
    const/4 v12, 0x0

    :goto_d
    if-eqz v12, :cond_15

    new-instance v12, Lq3/y;

    invoke-virtual {v11}, Ljava/lang/String;->length()I

    move-result v15

    move-object/from16 v24, v7

    move/from16 v23, v8

    invoke-static {v15, v15}, Lj93/l0;->f(II)J

    move-result-wide v7

    invoke-direct {v12, v3, v11, v7, v8}, Lq3/y;-><init>(ILjava/lang/String;J)V

    goto :goto_e

    :cond_15
    move-object/from16 v24, v7

    move/from16 v23, v8

    new-instance v12, Lq3/y;

    const-wide/16 v7, 0x0

    const/4 v3, 0x6

    invoke-direct {v12, v3, v11, v7, v8}, Lq3/y;-><init>(ILjava/lang/String;J)V

    :goto_e
    invoke-static {v12}, Lp1/x;->z(Ljava/lang/Object;)Lp1/k1;

    move-result-object v15

    invoke-virtual {v0, v15}, Lp1/q;->p0(Ljava/lang/Object;)V

    :goto_f
    move-object v3, v15

    check-cast v3, Lp1/c1;

    invoke-virtual {v0, v3}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v7

    invoke-virtual {v0, v11}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v8

    or-int/2addr v7, v8

    invoke-virtual {v0}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v8

    if-nez v7, :cond_17

    if-ne v8, v4, :cond_16

    goto :goto_10

    :cond_16
    const/4 v7, 0x0

    goto :goto_11

    :cond_17
    :goto_10
    new-instance v8, Lxq2/b0$a;

    const/4 v7, 0x0

    invoke-direct {v8, v11, v3, v7}, Lxq2/b0$a;-><init>(Ljava/lang/String;Lp1/c1;Lq83/d;)V

    invoke-virtual {v0, v8}, Lp1/q;->p0(Ljava/lang/Object;)V

    :goto_11
    check-cast v8, Lc93/m;

    invoke-static {v0, v8, v11}, Lp1/x;->g(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const/high16 v8, 0x3f800000    # 1.0f

    invoke-static {v8, v2}, Landroidx/compose/foundation/layout/d;->d(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v11

    const/4 v12, 0x3

    int-to-float v12, v12

    const/16 v15, 0x8

    int-to-float v15, v15

    mul-float/2addr v12, v15

    invoke-static {v12, v11}, Landroidx/compose/foundation/layout/a;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v11

    sget-object v7, Ll0/m;->c:Ll0/g;

    sget-object v8, Lb2/e;->M:Lb2/k;

    move-object/from16 v34, v2

    const/4 v1, 0x0

    invoke-static {v7, v8, v0, v1}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v2

    move-object v1, v9

    move-object/from16 v26, v10

    iget-wide v9, v0, Lp1/q;->T:J

    invoke-static {v9, v10}, Ljava/lang/Long;->hashCode(J)I

    move-result v9

    invoke-virtual {v0}, Lp1/q;->m()Lp1/p1;

    move-result-object v10

    invoke-static {v0, v11}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v11

    sget-object v16, La3/l;->a:La3/k;

    invoke-virtual/range {v16 .. v16}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move/from16 v29, v12

    sget-object v12, La3/k;->b:La3/j;

    invoke-virtual {v0}, Lp1/q;->i0()V

    move-object/from16 v27, v1

    iget-boolean v1, v0, Lp1/q;->S:Z

    if-eqz v1, :cond_18

    invoke-virtual {v0, v12}, Lp1/q;->l(Lc93/a;)V

    goto :goto_12

    :cond_18
    invoke-virtual {v0}, Lp1/q;->s0()V

    :goto_12
    sget-object v1, La3/k;->g:La3/i;

    invoke-static {v0, v1, v2}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v2, La3/k;->f:La3/i;

    invoke-static {v0, v2, v10}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v10, La3/k;->j:La3/i;

    move-object/from16 v28, v13

    iget-boolean v13, v0, Lp1/q;->S:Z

    if-nez v13, :cond_19

    invoke-virtual {v0}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v13

    move/from16 v16, v15

    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v15

    invoke-static {v13, v15}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v13

    if-nez v13, :cond_1a

    goto :goto_13

    :cond_19
    move/from16 v16, v15

    :goto_13
    invoke-static {v9, v0, v9, v10}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_1a
    sget-object v9, La3/k;->d:La3/i;

    invoke-static {v0, v9, v11}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const/4 v11, 0x0

    const/4 v13, 0x1

    invoke-static {v11, v0, v13}, Lq83/g;->U(ILandroidx/compose/runtime/Composer;I)Lf0/r1;

    move-result-object v15

    const/16 v13, 0xe

    invoke-static {v14, v15, v13}, Lq83/g;->f0(Landroidx/compose/ui/Modifier;Lf0/r1;I)Landroidx/compose/ui/Modifier;

    move-result-object v13

    invoke-static {v7, v8, v0, v11}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v7

    move-object v8, v12

    iget-wide v11, v0, Lp1/q;->T:J

    invoke-static {v11, v12}, Ljava/lang/Long;->hashCode(J)I

    move-result v11

    invoke-virtual {v0}, Lp1/q;->m()Lp1/p1;

    move-result-object v12

    invoke-static {v0, v13}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v13

    invoke-virtual {v0}, Lp1/q;->i0()V

    iget-boolean v15, v0, Lp1/q;->S:Z

    if-eqz v15, :cond_1b

    invoke-virtual {v0, v8}, Lp1/q;->l(Lc93/a;)V

    goto :goto_14

    :cond_1b
    invoke-virtual {v0}, Lp1/q;->s0()V

    :goto_14
    invoke-static {v0, v1, v7}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v0, v2, v12}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v7, v0, Lp1/q;->S:Z

    if-nez v7, :cond_1c

    invoke-virtual {v0}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v7

    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v12

    invoke-static {v7, v12}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_1d

    :cond_1c
    invoke-static {v11, v0, v11, v10}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_1d
    invoke-static {v0, v9, v13}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual {v5}, Lxq2/c0;->e()Lcom/whoop/design/util/TextResource;

    move-result-object v7

    sget v11, Lcom/whoop/design/util/TextResource;->$stable:I

    invoke-static {v7, v0, v11}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v7

    sget-object v12, Lx81/d;->a:Lx81/d;

    sget v13, Lx81/d;->b:I

    invoke-virtual {v12, v0, v13}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v15

    invoke-virtual {v15}, Lb91/d;->q()Lb91/a;

    move-result-object v30

    invoke-virtual {v12, v0, v13}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v15

    invoke-virtual {v15}, Ly81/i;->c1()J

    move-result-wide v31

    move-object/from16 v36, v7

    move-object/from16 v35, v8

    const-wide/high16 v7, 0x3fe0000000000000L    # 0.5

    double-to-float v7, v7

    mul-float v18, v7, v16

    const/16 v19, 0x7

    const/4 v15, 0x0

    move/from16 v7, v16

    const/16 v16, 0x0

    const/16 v17, 0x0

    move v8, v7

    const/4 v7, 0x0

    invoke-static/range {v14 .. v19}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v15

    sget v16, Lb91/a;->d:I

    shl-int/lit8 v16, v16, 0x12

    move-object/from16 v18, v9

    move-object/from16 v17, v10

    move-wide/from16 v9, v31

    const v32, 0x2fff8

    move/from16 v19, v11

    move-object/from16 v31, v12

    const-wide/16 v11, 0x0

    move/from16 v37, v13

    const/4 v13, 0x0

    move-object/from16 v38, v14

    const/4 v14, 0x0

    move/from16 v39, v8

    move-object v8, v15

    const/4 v15, 0x0

    move-object/from16 v40, v17

    move-object/from16 v41, v31

    move/from16 v31, v16

    const-wide/16 v16, 0x0

    move-object/from16 v42, v18

    const/16 v18, 0x0

    move/from16 v43, v19

    const/16 v19, 0x0

    const/16 v44, 0x100

    const/16 v45, 0x1

    const-wide/16 v20, 0x0

    const/16 v46, 0x0

    const/16 v22, 0x0

    move/from16 v47, v23

    const/16 v23, 0x0

    move-object/from16 v48, v24

    const/16 v24, 0x0

    const/high16 v49, 0x3f800000    # 1.0f

    const/16 v25, 0x0

    move-object/from16 v50, v26

    const/16 v26, 0x0

    move-object/from16 v51, v28

    const/16 v28, 0x0

    move-object/from16 v52, v27

    move-object/from16 v27, v30

    const/16 v30, 0x30

    move-object/from16 p0, v3

    move-object/from16 v3, v35

    move-object/from16 v7, v36

    move/from16 v59, v37

    move-object/from16 v5, v40

    move-object/from16 v58, v41

    move/from16 v6, v45

    move/from16 v53, v47

    move-object/from16 v54, v48

    move-object/from16 v56, v50

    move-object/from16 v57, v51

    move-object/from16 v55, v52

    move-object/from16 v36, v4

    move/from16 v35, v29

    move-object/from16 v4, v38

    move-object/from16 v29, v0

    move/from16 v0, v39

    invoke-static/range {v7 .. v32}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v7, v29

    int-to-float v8, v6

    invoke-static {v8, v0, v4, v7}, Ld;->w(FFLb2/t;Lp1/q;)V

    sget-object v8, Lb2/e;->J:Lb2/l;

    const/high16 v9, 0x3f800000    # 1.0f

    invoke-static {v9, v4}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v10

    sget-object v9, Ll0/m;->a:Ll0/e;

    const/16 v11, 0x30

    invoke-static {v9, v8, v7, v11}, Ll0/p1;->a(Ll0/i;Lb2/g;Landroidx/compose/runtime/Composer;I)Ll0/r1;

    move-result-object v8

    iget-wide v11, v7, Lp1/q;->T:J

    invoke-static {v11, v12}, Ljava/lang/Long;->hashCode(J)I

    move-result v9

    invoke-virtual {v7}, Lp1/q;->m()Lp1/p1;

    move-result-object v11

    invoke-static {v7, v10}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v10

    invoke-virtual {v7}, Lp1/q;->i0()V

    iget-boolean v12, v7, Lp1/q;->S:Z

    if-eqz v12, :cond_1e

    invoke-virtual {v7, v3}, Lp1/q;->l(Lc93/a;)V

    goto :goto_15

    :cond_1e
    invoke-virtual {v7}, Lp1/q;->s0()V

    :goto_15
    invoke-static {v7, v1, v8}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v7, v2, v11}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v1, v7, Lp1/q;->S:Z

    if-nez v1, :cond_20

    invoke-virtual {v7}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1f

    goto :goto_17

    :cond_1f
    :goto_16
    move-object/from16 v1, v42

    goto :goto_18

    :cond_20
    :goto_17
    invoke-static {v9, v7, v9, v5}, Ld;->y(ILp1/q;ILa3/i;)V

    goto :goto_16

    :goto_18
    invoke-static {v7, v1, v10}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual/range {p1 .. p1}, Lxq2/c0;->h()Lcom/whoop/design/util/TextResource;

    move-result-object v1

    move/from16 v2, v43

    invoke-static {v1, v7, v2}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v1

    move-object/from16 v3, v58

    move/from16 v5, v59

    invoke-virtual {v3, v7, v5}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v8

    invoke-virtual {v8}, Lb91/d;->N()Lb91/a;

    move-result-object v8

    invoke-virtual {v3, v7, v5}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v9

    invoke-virtual {v9}, Ly81/i;->y()J

    move-result-wide v9

    const/high16 v11, 0x3f800000    # 1.0f

    float-to-double v12, v11

    const-wide/16 v14, 0x0

    cmpl-double v37, v12, v14

    if-lez v37, :cond_21

    move v12, v6

    goto :goto_19

    :cond_21
    const/4 v12, 0x0

    :goto_19
    const-string v38, "invalid weight; must be greater than zero"

    if-nez v12, :cond_22

    invoke-static/range {v38 .. v38}, Lm0/a;->a(Ljava/lang/String;)V

    :cond_22
    new-instance v11, Landroidx/compose/foundation/layout/LayoutWeightElement;

    const/high16 v12, 0x3f800000    # 1.0f

    invoke-direct {v11, v12, v6}, Landroidx/compose/foundation/layout/LayoutWeightElement;-><init>(FZ)V

    const/4 v12, 0x2

    int-to-float v13, v12

    mul-float v28, v13, v0

    const/16 v30, 0x3

    const/16 v26, 0x0

    const/16 v27, 0x0

    move-object/from16 v25, v11

    move/from16 v29, v35

    invoke-static/range {v25 .. v30}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v11

    move/from16 v35, v28

    const/16 v30, 0x0

    const v32, 0x2fff8

    move-object/from16 v27, v8

    move-object v8, v11

    const-wide/16 v11, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const-wide/16 v16, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const-wide/16 v20, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v28, 0x0

    move-object/from16 v29, v7

    move-object v7, v1

    invoke-static/range {v7 .. v32}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v7, v29

    sget v1, Lyp2/c;->v:I

    const/4 v11, 0x0

    invoke-static {v1, v7, v11}, Lcom/whoop/design/util/b;->g(ILandroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v3, v7, v5}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v8

    invoke-virtual {v8}, Lb91/d;->k()Lb91/a;

    move-result-object v27

    invoke-virtual {v3, v7, v5}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v8

    invoke-virtual {v8}, Ly81/i;->y()J

    move-result-wide v9

    const/16 v18, 0x0

    const/16 v19, 0xe

    const/16 v16, 0x0

    const/16 v17, 0x0

    move-object v14, v4

    move/from16 v15, v35

    invoke-static/range {v14 .. v19}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v20

    move/from16 v8, v53

    and-int/lit16 v8, v8, 0x380

    const/16 v11, 0x100

    if-ne v8, v11, :cond_23

    move v12, v6

    goto :goto_1a

    :cond_23
    const/4 v12, 0x0

    :goto_1a
    invoke-virtual {v7}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v13

    if-nez v12, :cond_25

    move-object/from16 v12, v36

    if-ne v13, v12, :cond_24

    goto :goto_1b

    :cond_24
    move-object/from16 v15, p2

    goto :goto_1c

    :cond_25
    move-object/from16 v12, v36

    :goto_1b
    new-instance v13, Lxq2/d1;

    const/4 v14, 0x1

    move-object/from16 v15, p2

    invoke-direct {v13, v15, v14}, Lxq2/d1;-><init>(Ljava/lang/Object;I)V

    invoke-virtual {v7, v13}, Lp1/q;->p0(Ljava/lang/Object;)V

    :goto_1c
    move-object/from16 v24, v13

    check-cast v24, Lc93/a;

    const/16 v25, 0xf

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    invoke-static/range {v20 .. v25}, Landroidx/compose/foundation/a;->g(Landroidx/compose/ui/Modifier;ZLjava/lang/String;Li3/i;Lc93/a;I)Landroidx/compose/ui/Modifier;

    move-result-object v13

    const/16 v30, 0x0

    const v32, 0x2fff8

    move/from16 v44, v11

    move-object/from16 v36, v12

    const-wide/16 v11, 0x0

    move v14, v8

    move-object v8, v13

    const/4 v13, 0x0

    move/from16 v16, v14

    const/4 v14, 0x0

    const/4 v15, 0x0

    move/from16 v18, v16

    const-wide/16 v16, 0x0

    move/from16 v19, v18

    const/16 v18, 0x0

    move/from16 v20, v19

    const/16 v19, 0x0

    move/from16 v22, v20

    const-wide/16 v20, 0x0

    move/from16 v23, v22

    const/16 v22, 0x0

    move/from16 v24, v23

    const/16 v23, 0x0

    move/from16 v25, v24

    const/16 v24, 0x0

    move/from16 v26, v25

    const/16 v25, 0x0

    move/from16 v28, v26

    const/16 v26, 0x0

    move/from16 v29, v28

    const/16 v28, 0x0

    move/from16 v39, v0

    move/from16 v43, v2

    move/from16 v0, v29

    move-object/from16 v2, v36

    move-object/from16 v29, v7

    move-object v7, v1

    move/from16 v1, v44

    invoke-static/range {v7 .. v32}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v7, v29

    invoke-virtual {v7, v6}, Lp1/q;->q(Z)V

    invoke-static/range {p0 .. p0}, Lxq2/b0;->l(Lp1/c1;)Lq3/y;

    move-result-object v8

    invoke-static/range {p0 .. p0}, Lxq2/b0;->l(Lp1/c1;)Lq3/y;

    move-result-object v9

    iget-object v9, v9, Lq3/y;->a:Ll3/g;

    iget-object v9, v9, Ll3/g;->x:Ljava/lang/String;

    invoke-virtual {v9}, Ljava/lang/String;->length()I

    move-result v9

    if-nez v9, :cond_26

    move v12, v6

    goto :goto_1d

    :cond_26
    const/4 v12, 0x0

    :goto_1d
    if-eqz v12, :cond_27

    const v9, -0x67c81ccc

    invoke-virtual {v7, v9}, Lp1/q;->e0(I)V

    new-instance v9, Lxq2/z;

    const/4 v10, 0x0

    move-object/from16 v11, p1

    invoke-direct {v9, v11, v10}, Lxq2/z;-><init>(Ljava/lang/Object;I)V

    const v10, -0x1bf31dc4

    invoke-static {v10, v7, v9}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v15

    const/4 v9, 0x0

    invoke-virtual {v7, v9}, Lp1/q;->q(Z)V

    move-object v12, v15

    goto :goto_1e

    :cond_27
    move-object/from16 v11, p1

    const/4 v9, 0x0

    const v10, -0x67c352b9

    invoke-virtual {v7, v10}, Lp1/q;->e0(I)V

    invoke-virtual {v7, v9}, Lp1/q;->q(Z)V

    const/4 v12, 0x0

    :goto_1e
    const/4 v9, -0x2

    int-to-float v9, v9

    mul-float v9, v9, v39

    invoke-static {v4, v9, v9}, Landroidx/compose/foundation/layout/a;->m(Landroidx/compose/ui/Modifier;FF)Landroidx/compose/ui/Modifier;

    move-result-object v4

    const/high16 v9, 0x3f800000    # 1.0f

    invoke-static {v9, v4}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    const/16 v9, 0x50

    int-to-float v9, v9

    const/4 v10, 0x0

    const/4 v13, 0x2

    invoke-static {v4, v9, v10, v13}, Landroidx/compose/foundation/layout/d;->j(Landroidx/compose/ui/Modifier;FFI)Landroidx/compose/ui/Modifier;

    move-result-object v4

    move-object/from16 v9, v57

    invoke-static {v4, v9}, Landroidx/compose/ui/focus/a;->b(Landroidx/compose/ui/Modifier;Lg2/s;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    move-object/from16 v15, p0

    invoke-virtual {v7, v15}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v10

    invoke-virtual {v7}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v13

    if-nez v10, :cond_28

    if-ne v13, v2, :cond_29

    :cond_28
    new-instance v13, Lxq2/a0;

    const/4 v10, 0x0

    invoke-direct {v13, v15, v10}, Lxq2/a0;-><init>(Ljava/lang/Object;I)V

    invoke-virtual {v7, v13}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_29
    check-cast v13, Lkotlin/jvm/functions/Function1;

    invoke-static {v4, v13}, Landroidx/compose/ui/focus/a;->c(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    invoke-virtual {v7}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v10

    if-ne v10, v2, :cond_2a

    new-instance v10, Lxl0/b;

    const/16 v13, 0x8

    invoke-direct {v10, v13}, Lxl0/b;-><init>(I)V

    invoke-virtual {v7, v10}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_2a
    check-cast v10, Lkotlin/jvm/functions/Function1;

    const/4 v13, 0x0

    invoke-static {v4, v13, v10}, Li3/n;->c(Landroidx/compose/ui/Modifier;ZLkotlin/jvm/functions/Function1;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    new-instance v14, Lu0/r0;

    const/4 v10, 0x7

    const/16 v1, 0x77

    invoke-direct {v14, v13, v13, v10, v1}, Lu0/r0;-><init>(IIII)V

    move-object/from16 v1, v55

    invoke-virtual {v7, v1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v10

    invoke-virtual {v7}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v13

    if-nez v10, :cond_2b

    if-ne v13, v2, :cond_2c

    :cond_2b
    new-instance v13, Lxq2/a0;

    const/4 v10, 0x2

    invoke-direct {v13, v1, v10}, Lxq2/a0;-><init>(Ljava/lang/Object;I)V

    invoke-virtual {v7, v13}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_2c
    move-object/from16 v17, v13

    check-cast v17, Lkotlin/jvm/functions/Function1;

    new-instance v16, Lu0/q0;

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x3e

    invoke-direct/range {v16 .. v21}, Lu0/q0;-><init>(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;I)V

    invoke-virtual {v3, v7, v5}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v10

    invoke-virtual {v10}, Lb91/d;->N()Lb91/a;

    move-result-object v10

    invoke-virtual {v10}, Lb91/a;->d()Ll3/v0;

    move-result-object v10

    new-instance v17, Ll3/v0;

    invoke-virtual {v3, v7, v5}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v3

    invoke-virtual {v3}, Ly81/i;->y()J

    move-result-wide v18

    const-wide/16 v30, 0x0

    const v32, 0xfffffe

    const-wide/16 v20, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const-wide/16 v25, 0x0

    const/16 v27, 0x0

    const/16 v28, 0x0

    const/16 v29, 0x0

    invoke-direct/range {v17 .. v32}, Ll3/v0;-><init>(JJLp3/r;Lp3/n;Lp3/i;JLw3/l;Li2/z0;IJI)V

    move-object/from16 v3, v17

    invoke-virtual {v10, v3}, Ll3/v0;->e(Ll3/v0;)Ll3/v0;

    move-result-object v3

    invoke-virtual {v7, v15}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v5

    move-object/from16 v10, v56

    invoke-virtual {v7, v10}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v13

    or-int/2addr v5, v13

    invoke-virtual {v7}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v13

    if-nez v5, :cond_2d

    if-ne v13, v2, :cond_2e

    :cond_2d
    new-instance v13, Lp40/b;

    const/16 v5, 0x14

    invoke-direct {v13, v10, v15, v5}, Lp40/b;-><init>(Lkotlin/jvm/functions/Function1;Lp1/c1;I)V

    invoke-virtual {v7, v13}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_2e
    check-cast v13, Lkotlin/jvm/functions/Function1;

    const/16 v19, 0x0

    const/16 v21, 0x0

    const/4 v10, 0x0

    move-object/from16 v29, v7

    move-object v7, v8

    move-object v8, v13

    const/4 v13, 0x0

    move-object/from16 v15, v16

    const/16 v16, 0xa

    const/16 v17, 0x5

    const/16 v18, 0x0

    move-object v11, v3

    move-object v3, v9

    move-object/from16 v20, v29

    move-object v9, v4

    invoke-static/range {v7 .. v21}, Lg1/j4;->b(Lq3/y;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZLl3/v0;Lc93/m;Lq3/g0;Lu0/r0;Lu0/q0;IILi2/a1;Lg1/e8;Landroidx/compose/runtime/Composer;I)V

    move-object/from16 v7, v20

    invoke-virtual {v7, v6}, Lp1/q;->q(Z)V

    if-lez v37, :cond_2f

    move v12, v6

    goto :goto_1f

    :cond_2f
    const/4 v12, 0x0

    :goto_1f
    if-nez v12, :cond_30

    invoke-static/range {v38 .. v38}, Lm0/a;->a(Ljava/lang/String;)V

    :cond_30
    new-instance v4, Landroidx/compose/foundation/layout/LayoutWeightElement;

    const/high16 v9, 0x3f800000    # 1.0f

    invoke-direct {v4, v9, v6}, Landroidx/compose/foundation/layout/LayoutWeightElement;-><init>(FZ)V

    invoke-static {v7, v4}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    invoke-virtual/range {p1 .. p1}, Lxq2/c0;->c()Lny0/h;

    move-result-object v4

    if-nez v4, :cond_31

    const v0, 0x6e587bf7

    invoke-virtual {v7, v0}, Lp1/q;->e0(I)V

    const/4 v11, 0x0

    invoke-virtual {v7, v11}, Lp1/q;->q(Z)V

    move-object v0, v7

    goto :goto_23

    :cond_31
    const v5, 0x6e587bf8

    invoke-virtual {v7, v5}, Lp1/q;->e0(I)V

    invoke-virtual {v4}, Lny0/h;->x()Lcom/whoop/design/util/TextResource;

    move-result-object v13

    move-object/from16 v4, v54

    invoke-virtual {v7, v4}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v5

    const/16 v11, 0x100

    if-ne v0, v11, :cond_32

    move v12, v6

    goto :goto_20

    :cond_32
    const/4 v12, 0x0

    :goto_20
    or-int v0, v5, v12

    invoke-virtual {v7, v1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v5

    or-int/2addr v0, v5

    invoke-virtual {v7}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    if-nez v0, :cond_34

    if-ne v5, v2, :cond_33

    goto :goto_21

    :cond_33
    move-object/from16 v8, p2

    goto :goto_22

    :cond_34
    :goto_21
    new-instance v5, Lre1/k;

    const/16 v0, 0x17

    move-object/from16 v8, p2

    invoke-direct {v5, v4, v8, v1, v0}, Lre1/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    invoke-virtual {v7, v5}, Lp1/q;->p0(Ljava/lang/Object;)V

    :goto_22
    move-object/from16 v20, v5

    check-cast v20, Lc93/a;

    shl-int/lit8 v22, v43, 0x12

    const/16 v23, 0x0

    const/16 v24, 0x1fbd

    move-object/from16 v29, v7

    const/4 v7, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    move-object/from16 v21, v29

    move/from16 v8, v33

    invoke-static/range {v7 .. v24}, Lny0/z;->j(Landroidx/compose/ui/Modifier;ZZLjava/lang/Integer;Landroidx/compose/ui/Modifier;Lv41/r0;Lcom/whoop/design/util/TextResource;Lg1/u0;Li2/t;Lf0/t;FLl0/k1;Lb91/a;Lc93/a;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v0, v21

    const/4 v11, 0x0

    invoke-virtual {v0, v11}, Lp1/q;->q(Z)V

    :goto_23
    invoke-virtual {v0, v6}, Lp1/q;->q(Z)V

    sget-object v4, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-virtual {v0, v1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v5

    invoke-virtual {v0}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v6

    if-nez v5, :cond_35

    if-ne v6, v2, :cond_36

    :cond_35
    new-instance v6, Lxq2/b0$b;

    const/4 v7, 0x0

    invoke-direct {v6, v3, v1, v7}, Lxq2/b0$b;-><init>(Lg2/s;Lb3/x2;Lq83/d;)V

    invoke-virtual {v0, v6}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_36
    check-cast v6, Lc93/m;

    invoke-static {v0, v6, v4}, Lp1/x;->g(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    move-object/from16 v4, v34

    goto :goto_24

    :cond_37
    invoke-virtual {v0}, Lp1/q;->X()V

    move-object v4, v7

    :goto_24
    invoke-virtual {v0}, Lp1/q;->u()Lp1/v1;

    move-result-object v7

    if-eqz v7, :cond_38

    new-instance v0, Lwr0/f;

    const/16 v3, 0xf

    move-object/from16 v5, p1

    move-object/from16 v6, p2

    move/from16 v1, p4

    move/from16 v2, p5

    invoke-direct/range {v0 .. v6}, Lwr0/f;-><init>(IIILjava/lang/Object;Ljava/lang/Object;Ll83/e;)V

    iput-object v0, v7, Lp1/v1;->d:Lc93/m;

    :cond_38
    return-void
.end method

.method private static final k(Ljava/lang/String;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final l(Lp1/c1;)Lq3/y;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp1/c1;",
            ")",
            "Lq3/y;"
        }
    .end annotation

    invoke-interface {p0}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lq3/y;

    return-object p0
.end method

.method private static final m(Lp1/c1;Lq3/y;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp1/c1;",
            "Lq3/y;",
            ")V"
        }
    .end annotation

    invoke-interface {p0, p1}, Lp1/c1;->setValue(Ljava/lang/Object;)V

    return-void
.end method

.method private static final n(Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 1

    sget-object v0, Lrq2/t0$b;->a:Lrq2/t0$b;

    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final o(Lxq2/c0;Landroidx/compose/runtime/Composer;I)Ll83/a0;
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

    invoke-virtual/range {p0 .. p0}, Lxq2/c0;->g()Lcom/whoop/design/util/TextResource;

    move-result-object v0

    sget v1, Lcom/whoop/design/util/TextResource;->$stable:I

    invoke-static {v0, v2, v1}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v0

    sget-object v1, Lx81/d;->a:Lx81/d;

    sget v3, Lx81/d;->b:I

    invoke-virtual {v1, v2, v3}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v4

    invoke-virtual {v4}, Lb91/d;->O()Lb91/a;

    move-result-object v22

    invoke-virtual {v1, v2, v3}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v1

    invoke-virtual {v1}, Ly81/i;->b1()J

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

.method private static final p(Lp1/c1;Lg2/v;)Ll83/a0;
    .locals 4

    const-string v0, "focusState"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Lg2/w;

    invoke-virtual {p1}, Lg2/w;->a()Z

    move-result p1

    if-eqz p1, :cond_0

    invoke-static {p0}, Lxq2/b0;->l(Lp1/c1;)Lq3/y;

    move-result-object p1

    iget-object p1, p1, Lq3/y;->a:Ll3/g;

    iget-object p1, p1, Ll3/g;->x:Ljava/lang/String;

    invoke-virtual {p1}, Ljava/lang/String;->length()I

    move-result p1

    if-lez p1, :cond_0

    invoke-static {p0}, Lxq2/b0;->l(Lp1/c1;)Lq3/y;

    move-result-object p1

    invoke-static {p0}, Lxq2/b0;->l(Lp1/c1;)Lq3/y;

    move-result-object v0

    iget-object v0, v0, Lq3/y;->a:Ll3/g;

    iget-object v0, v0, Ll3/g;->x:Ljava/lang/String;

    invoke-virtual {v0}, Ljava/lang/String;->length()I

    move-result v0

    invoke-static {v0, v0}, Lj93/l0;->f(II)J

    move-result-wide v0

    const/4 v2, 0x5

    const/4 v3, 0x0

    invoke-static {p1, v3, v0, v1, v2}, Lq3/y;->b(Lq3/y;Ll3/g;JI)Lq3/y;

    move-result-object p1

    invoke-static {p0, p1}, Lxq2/b0;->m(Lp1/c1;Lq3/y;)V

    :cond_0
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final q(Li3/z;)Ll83/a0;
    .locals 1

    const-string v0, "$this$semantics"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "TimeCapsuleTextField"

    invoke-static {v0, p0}, Li3/w;->k(Ljava/lang/String;Li3/z;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final r(Lb3/x2;Lu0/p0;)Ll83/a0;
    .locals 1

    const-string v0, "$this$KeyboardActions"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    if-eqz p0, :cond_0

    check-cast p0, Lb3/x1;

    invoke-virtual {p0}, Lb3/x1;->a()V

    :cond_0
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final s(Lkotlin/jvm/functions/Function1;Lp1/c1;Lq3/y;)Ll83/a0;
    .locals 1

    const-string v0, "newValue"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1, p2}, Lxq2/b0;->m(Lp1/c1;Lq3/y;)V

    iget-object p1, p2, Lq3/y;->a:Ll3/g;

    iget-object p1, p1, Ll3/g;->x:Ljava/lang/String;

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final t(Lxq2/d0;Lkotlin/jvm/functions/Function1;Lb3/x2;)Ll83/a0;
    .locals 1

    if-eqz p0, :cond_0

    invoke-virtual {p0}, Lxq2/d0;->b()Ljava/lang/String;

    move-result-object p0

    if-eqz p0, :cond_0

    new-instance v0, Lrq2/t0$g;

    invoke-direct {v0, p0}, Lrq2/t0$g;-><init>(Ljava/lang/String;)V

    invoke-interface {p1, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    if-eqz p2, :cond_0

    check-cast p2, Lb3/x1;

    invoke-virtual {p2}, Lb3/x1;->a()V

    :cond_0
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final u(Landroidx/compose/ui/Modifier;Lxq2/c0;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 6

    or-int/lit8 p3, p3, 0x1

    invoke-static {p3}, Lp1/x;->L(I)I

    move-result v4

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move v5, p4

    move-object v3, p5

    invoke-static/range {v0 .. v5}, Lxq2/b0;->j(Landroidx/compose/ui/Modifier;Lxq2/c0;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static final synthetic v(Lp1/c1;)Lq3/y;
    .locals 0

    invoke-static {p0}, Lxq2/b0;->l(Lp1/c1;)Lq3/y;

    move-result-object p0

    return-object p0
.end method

.method public static final synthetic w(Lp1/c1;Lq3/y;)V
    .locals 0

    invoke-static {p0, p1}, Lxq2/b0;->m(Lp1/c1;Lq3/y;)V

    return-void
.end method
