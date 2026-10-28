.class public abstract Ljp2/d;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\u0002\u001a7\u0010\u0008\u001a\u00020\u00062\u0008\u0008\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0014\u0008\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0007\u00a2\u0006\u0004\u0008\u0008\u0010\t\u00a8\u0006\u000c\u00b2\u0006\u000e\u0010\u000b\u001a\u00020\n8\n@\nX\u008a\u008e\u0002"
    }
    d2 = {
        "Landroidx/compose/ui/Modifier;",
        "modifier",
        "Ljp2/e;",
        "viewState",
        "Lkotlin/Function1;",
        "",
        "Ll83/a0;",
        "onViewEvent",
        "g",
        "(Landroidx/compose/ui/Modifier;Ljp2/e;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V",
        "",
        "hasFocus",
        "universal-checkout_release"
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
.method public static synthetic a(Ljava/lang/String;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Ljp2/d;->m(Ljava/lang/String;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lkotlin/jvm/functions/Function1;Ljp2/e;Ljava/lang/String;Ljava/lang/String;Lp1/c1;Lg2/v;)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p5}, Ljp2/d;->k(Lkotlin/jvm/functions/Function1;Ljp2/e;Ljava/lang/String;Ljava/lang/String;Lp1/c1;Lg2/v;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Ljp2/e;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, Ljp2/d;->n(Ljp2/e;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Landroidx/compose/ui/Modifier;Ljp2/e;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p6}, Ljp2/d;->o(Landroidx/compose/ui/Modifier;Ljp2/e;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic e(Ljava/lang/Object;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Ljp2/d;->h(Ljava/lang/Object;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic f(Lg2/i;Ljp2/e;Lkotlin/jvm/functions/Function1;Ljava/lang/String;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Ljp2/d;->l(Lg2/i;Ljp2/e;Lkotlin/jvm/functions/Function1;Ljava/lang/String;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final g(Landroidx/compose/ui/Modifier;Ljp2/e;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V
    .locals 53
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/ui/Modifier;",
            "Ljp2/e;",
            "Lkotlin/jvm/functions/Function1;",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    move-object/from16 v2, p1

    move/from16 v6, p4

    const-string v0, "viewState"

    invoke-static {v2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v0, p3

    check-cast v0, Lp1/q;

    const v1, -0x2d064b03

    invoke-virtual {v0, v1}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v1, p5, 0x1

    const/4 v3, 0x4

    if-eqz v1, :cond_0

    or-int/lit8 v4, v6, 0x6

    move v5, v4

    move-object/from16 v4, p0

    goto :goto_1

    :cond_0
    and-int/lit8 v4, v6, 0x6

    if-nez v4, :cond_2

    move-object/from16 v4, p0

    invoke-virtual {v0, v4}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_1

    move v5, v3

    goto :goto_0

    :cond_1
    const/4 v5, 0x2

    :goto_0
    or-int/2addr v5, v6

    goto :goto_1

    :cond_2
    move-object/from16 v4, p0

    move v5, v6

    :goto_1
    and-int/lit8 v7, v6, 0x30

    if-nez v7, :cond_4

    invoke-virtual {v0, v2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_3

    const/16 v7, 0x20

    goto :goto_2

    :cond_3
    const/16 v7, 0x10

    :goto_2
    or-int/2addr v5, v7

    :cond_4
    and-int/lit8 v7, p5, 0x4

    if-eqz v7, :cond_6

    or-int/lit16 v5, v5, 0x180

    :cond_5
    move-object/from16 v9, p2

    goto :goto_4

    :cond_6
    and-int/lit16 v9, v6, 0x180

    if-nez v9, :cond_5

    move-object/from16 v9, p2

    invoke-virtual {v0, v9}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_7

    const/16 v10, 0x100

    goto :goto_3

    :cond_7
    const/16 v10, 0x80

    :goto_3
    or-int/2addr v5, v10

    :goto_4
    and-int/lit16 v10, v5, 0x93

    const/16 v11, 0x92

    const/4 v12, 0x0

    if-eq v10, v11, :cond_8

    const/4 v10, 0x1

    goto :goto_5

    :cond_8
    move v10, v12

    :goto_5
    and-int/lit8 v11, v5, 0x1

    invoke-virtual {v0, v11, v10}, Lp1/q;->U(IZ)Z

    move-result v10

    if-eqz v10, :cond_23

    sget-object v14, Lb2/t;->w:Lb2/t;

    if-eqz v1, :cond_9

    move-object v1, v14

    goto :goto_6

    :cond_9
    move-object v1, v4

    :goto_6
    sget-object v4, Lp1/l;->a:Lp1/v0;

    if-eqz v7, :cond_b

    invoke-virtual {v0}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v7

    if-ne v7, v4, :cond_a

    new-instance v7, Ljg/c;

    const/16 v9, 0x1c

    invoke-direct {v7, v9}, Ljg/c;-><init>(I)V

    invoke-virtual {v0, v7}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_a
    check-cast v7, Lkotlin/jvm/functions/Function1;

    move-object/from16 v33, v7

    goto :goto_7

    :cond_b
    move-object/from16 v33, v9

    :goto_7
    sget-object v7, Lb3/v1;->i:Lp1/u2;

    invoke-virtual {v0, v7}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lg2/i;

    invoke-virtual {v2}, Ljp2/e;->c()Lcom/whoop/design/util/TextResource;

    move-result-object v9

    sget v10, Lcom/whoop/design/util/TextResource;->$stable:I

    invoke-static {v9, v0, v10}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v2}, Ljp2/e;->j()Lcom/whoop/design/util/TextResource;

    move-result-object v11

    if-nez v11, :cond_c

    const v11, 0x70b1d74c

    invoke-virtual {v0, v11}, Lp1/q;->e0(I)V

    invoke-virtual {v0, v12}, Lp1/q;->q(Z)V

    const/4 v11, 0x0

    goto :goto_8

    :cond_c
    const v15, 0x70b1d74d

    invoke-virtual {v0, v15}, Lp1/q;->e0(I)V

    invoke-static {v11, v0, v10}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v11

    invoke-virtual {v0, v12}, Lp1/q;->q(Z)V

    :goto_8
    if-nez v11, :cond_d

    const-string v11, ""

    :cond_d
    invoke-virtual {v2}, Ljp2/e;->f()Ljava/lang/String;

    move-result-object v15

    invoke-virtual {v0, v15}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v15

    invoke-virtual {v0}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v8

    if-nez v15, :cond_e

    if-ne v8, v4, :cond_f

    :cond_e
    sget-object v8, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-static {v8}, Lp1/x;->z(Ljava/lang/Object;)Lp1/k1;

    move-result-object v8

    invoke-virtual {v0, v8}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_f
    check-cast v8, Lp1/c1;

    invoke-static {v11}, Lyb3/r;->i0(Ljava/lang/CharSequence;)Z

    move-result v15

    if-nez v15, :cond_10

    invoke-virtual {v2}, Ljp2/e;->e()Lcom/whoop/design/util/TextResource;

    move-result-object v15

    if-nez v15, :cond_10

    const/16 v34, 0x1

    goto :goto_9

    :cond_10
    move/from16 v34, v12

    :goto_9
    const/4 v15, 0x3

    int-to-float v15, v15

    int-to-float v3, v3

    mul-float/2addr v15, v3

    invoke-static {v15}, Lt0/j;->e(F)Lt0/i;

    move-result-object v23

    const/high16 v15, 0x3f800000    # 1.0f

    invoke-static {v15, v1}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v13

    sget-object v15, Ll0/m;->c:Ll0/g;

    move-object/from16 v35, v1

    sget-object v1, Lb2/e;->M:Lb2/k;

    invoke-static {v15, v1, v0, v12}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v1

    move-object/from16 p2, v13

    iget-wide v12, v0, Lp1/q;->T:J

    invoke-static {v12, v13}, Ljava/lang/Long;->hashCode(J)I

    move-result v12

    invoke-virtual {v0}, Lp1/q;->m()Lp1/p1;

    move-result-object v13

    move-object/from16 v15, p2

    invoke-static {v0, v15}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v15

    sget-object v16, La3/l;->a:La3/k;

    invoke-virtual/range {v16 .. v16}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-object/from16 p2, v11

    sget-object v11, La3/k;->b:La3/j;

    invoke-virtual {v0}, Lp1/q;->i0()V

    move/from16 v36, v3

    iget-boolean v3, v0, Lp1/q;->S:Z

    if-eqz v3, :cond_11

    invoke-virtual {v0, v11}, Lp1/q;->l(Lc93/a;)V

    goto :goto_a

    :cond_11
    invoke-virtual {v0}, Lp1/q;->s0()V

    :goto_a
    sget-object v3, La3/k;->g:La3/i;

    invoke-static {v0, v3, v1}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v1, La3/k;->f:La3/i;

    invoke-static {v0, v1, v13}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v13, La3/k;->j:La3/i;

    move-object/from16 v37, v1

    iget-boolean v1, v0, Lp1/q;->S:Z

    if-nez v1, :cond_12

    invoke-virtual {v0}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    move-object/from16 v38, v3

    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_13

    goto :goto_b

    :cond_12
    move-object/from16 v38, v3

    :goto_b
    invoke-static {v12, v0, v12, v13}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_13
    sget-object v1, La3/k;->d:La3/i;

    invoke-static {v0, v1, v15}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v9}, Lyb3/r;->i0(Ljava/lang/CharSequence;)Z

    move-result v3

    if-nez v3, :cond_14

    const v3, -0x59f8e144

    invoke-virtual {v0, v3}, Lp1/q;->e0(I)V

    sget-object v3, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-virtual {v9, v3}, Ljava/lang/String;->toUpperCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v3

    const-string v15, "toUpperCase(...)"

    invoke-static {v3, v15}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v15, Lx81/d;->a:Lx81/d;

    sget v12, Lx81/d;->b:I

    invoke-virtual {v15, v0, v12}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v16

    invoke-virtual/range {v16 .. v16}, Lb91/d;->m()Lb91/a;

    move-result-object v27

    invoke-virtual {v15, v0, v12}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v12

    invoke-virtual {v12}, Ly81/i;->c1()J

    move-result-wide v24

    const/4 v12, 0x1

    int-to-float v15, v12

    move-object/from16 v29, v0

    const/16 v12, 0x8

    int-to-float v0, v12

    mul-float v18, v15, v0

    const/16 v19, 0x7

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    move-object/from16 v0, v23

    invoke-static/range {v14 .. v19}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v15

    sget v16, Lb91/a;->d:I

    shl-int/lit8 v31, v16, 0x12

    const v32, 0x2fff8

    move-object/from16 v16, v11

    move/from16 v22, v12

    const-wide/16 v11, 0x0

    move-object/from16 v17, v13

    const/4 v13, 0x0

    move-object/from16 v18, v14

    const/4 v14, 0x0

    move-object/from16 v19, v8

    move-object v8, v15

    const/4 v15, 0x0

    move-object/from16 v23, v16

    move-object/from16 v26, v17

    const-wide/16 v16, 0x0

    move-object/from16 v28, v18

    const/16 v18, 0x0

    move-object/from16 v30, v19

    const/16 v19, 0x0

    const/16 v39, 0x0

    const/16 v40, 0x1

    const-wide/16 v20, 0x0

    move/from16 v41, v22

    const/16 v22, 0x0

    move-object/from16 v42, v23

    const/16 v23, 0x0

    move-object/from16 v43, v9

    move-wide/from16 v51, v24

    move/from16 v25, v10

    move-wide/from16 v9, v51

    const/16 v24, 0x0

    move/from16 v44, v25

    const/16 v25, 0x0

    move-object/from16 v45, v26

    const/16 v26, 0x0

    move-object/from16 v46, v28

    const/16 v28, 0x0

    move-object/from16 v47, v30

    const/16 v30, 0x30

    move-object/from16 p0, v7

    move-object v7, v3

    move/from16 v3, v39

    move-object/from16 v39, p0

    move-object/from16 p0, v1

    move-object/from16 p3, v4

    move/from16 v6, v40

    move-object/from16 v49, v42

    move/from16 v48, v44

    move-object/from16 v50, v45

    move-object/from16 v1, v46

    move-object/from16 v4, v47

    invoke-static/range {v7 .. v32}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v7, v29

    invoke-virtual {v7, v3}, Lp1/q;->q(Z)V

    :goto_c
    const/high16 v8, 0x3f800000    # 1.0f

    goto :goto_d

    :cond_14
    move-object/from16 p0, v1

    move-object/from16 p3, v4

    move-object/from16 v39, v7

    move-object v4, v8

    move-object/from16 v43, v9

    move/from16 v48, v10

    move-object/from16 v49, v11

    move-object/from16 v50, v13

    move-object v1, v14

    const/4 v3, 0x0

    const/4 v6, 0x1

    move-object v7, v0

    move-object/from16 v0, v23

    const v8, -0x59f4fd45

    invoke-virtual {v7, v8}, Lp1/q;->e0(I)V

    invoke-virtual {v7, v3}, Lp1/q;->q(Z)V

    goto :goto_c

    :goto_d
    invoke-static {v8, v1}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v9

    if-eqz v34, :cond_15

    const v10, -0x59f26132

    invoke-virtual {v7, v10}, Lp1/q;->e0(I)V

    int-to-float v10, v6

    sget-object v11, Lx81/d;->a:Lx81/d;

    sget v12, Lx81/d;->b:I

    invoke-virtual {v11, v7, v12}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v11

    invoke-virtual {v11}, Ly81/i;->Y0()J

    move-result-wide v11

    invoke-static {v1, v10, v11, v12, v0}, Lge3/g;->h(Landroidx/compose/ui/Modifier;FJLi2/a1;)Landroidx/compose/ui/Modifier;

    move-result-object v14

    invoke-virtual {v7, v3}, Lp1/q;->q(Z)V

    goto :goto_e

    :cond_15
    const v10, -0x59eec97d

    invoke-virtual {v7, v10}, Lp1/q;->e0(I)V

    invoke-virtual {v7, v3}, Lp1/q;->q(Z)V

    move-object v14, v1

    :goto_e
    invoke-interface {v9, v14}, Landroidx/compose/ui/Modifier;->e(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v9

    invoke-virtual {v7, v4}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v10

    and-int/lit16 v11, v5, 0x380

    const/16 v5, 0x100

    if-ne v11, v5, :cond_16

    move v12, v6

    goto :goto_f

    :cond_16
    move v12, v3

    :goto_f
    or-int v5, v10, v12

    invoke-virtual {v7, v2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v10

    or-int/2addr v5, v10

    move-object/from16 v10, p2

    invoke-virtual {v7, v10}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v12

    or-int/2addr v5, v12

    move-object/from16 v12, v43

    invoke-virtual {v7, v12}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v13

    or-int/2addr v5, v13

    invoke-virtual {v7}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v13

    if-nez v5, :cond_18

    move-object/from16 v5, p3

    if-ne v13, v5, :cond_17

    :goto_10
    move-object/from16 v23, v0

    goto :goto_11

    :cond_17
    move-object/from16 v25, v0

    move-object v14, v1

    move v6, v3

    move-object v15, v5

    move-object v3, v10

    move-object v4, v12

    move-object v0, v13

    move-object/from16 v1, v33

    move-object/from16 v12, v37

    move-object/from16 v10, v38

    move-object/from16 v13, p0

    goto :goto_12

    :cond_18
    move-object/from16 v5, p3

    goto :goto_10

    :goto_11
    new-instance v0, Lam2/r;

    move-object/from16 v13, p0

    move-object v14, v1

    move v6, v3

    move-object v15, v5

    move-object v3, v10

    move-object/from16 v25, v23

    move-object/from16 v1, v33

    move-object/from16 v10, v38

    move-object v5, v4

    move-object v4, v12

    move-object/from16 v12, v37

    invoke-direct/range {v0 .. v5}, Lam2/r;-><init>(Lkotlin/jvm/functions/Function1;Ljp2/e;Ljava/lang/String;Ljava/lang/String;Lp1/c1;)V

    invoke-virtual {v7, v0}, Lp1/q;->p0(Ljava/lang/Object;)V

    :goto_12
    check-cast v0, Lkotlin/jvm/functions/Function1;

    invoke-static {v9, v0}, Landroidx/compose/ui/focus/a;->c(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;)Landroidx/compose/ui/Modifier;

    move-result-object v16

    move-object/from16 v0, v39

    invoke-virtual {v7, v0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v5

    invoke-virtual {v7, v2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v9

    or-int/2addr v5, v9

    const/16 v9, 0x100

    if-ne v11, v9, :cond_19

    const/4 v9, 0x1

    goto :goto_13

    :cond_19
    move v9, v6

    :goto_13
    or-int/2addr v5, v9

    invoke-virtual {v7, v4}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v9

    or-int/2addr v5, v9

    invoke-virtual {v7}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v9

    if-nez v5, :cond_1a

    if-ne v9, v15, :cond_1b

    :cond_1a
    new-instance v9, Lam2/d;

    invoke-direct {v9, v0, v2, v1, v4}, Lam2/d;-><init>(Lg2/i;Ljp2/e;Lkotlin/jvm/functions/Function1;Ljava/lang/String;)V

    invoke-virtual {v7, v9}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_1b
    move-object/from16 v20, v9

    check-cast v20, Lc93/a;

    const/16 v21, 0xf

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    invoke-static/range {v16 .. v21}, Landroidx/compose/foundation/a;->g(Landroidx/compose/ui/Modifier;ZLjava/lang/String;Li3/i;Lc93/a;I)Landroidx/compose/ui/Modifier;

    move-result-object v0

    sget-object v4, Lb2/e;->w:Lb2/m;

    invoke-static {v4, v6}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v4

    iget-wide v8, v7, Lp1/q;->T:J

    invoke-static {v8, v9}, Ljava/lang/Long;->hashCode(J)I

    move-result v5

    invoke-virtual {v7}, Lp1/q;->m()Lp1/p1;

    move-result-object v8

    invoke-static {v7, v0}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    invoke-virtual {v7}, Lp1/q;->i0()V

    iget-boolean v9, v7, Lp1/q;->S:Z

    if-eqz v9, :cond_1c

    move-object/from16 v9, v49

    invoke-virtual {v7, v9}, Lp1/q;->l(Lc93/a;)V

    goto :goto_14

    :cond_1c
    invoke-virtual {v7}, Lp1/q;->s0()V

    :goto_14
    invoke-static {v7, v10, v4}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v7, v12, v8}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v4, v7, Lp1/q;->S:Z

    if-nez v4, :cond_1d

    invoke-virtual {v7}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    invoke-static {v4, v8}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_1e

    :cond_1d
    move-object/from16 v4, v50

    invoke-static {v5, v7, v5, v4}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_1e
    invoke-static {v7, v13, v0}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const/high16 v8, 0x3f800000    # 1.0f

    invoke-static {v8, v14}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    const/16 v4, 0xc

    int-to-float v4, v4

    mul-float v4, v4, v36

    invoke-static {v4, v0}, Landroidx/compose/foundation/layout/d;->h(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    sget-object v4, Lx81/d;->a:Lx81/d;

    sget v5, Lx81/d;->b:I

    invoke-static {v4, v7, v5}, Lte0/d;->t(Lx81/d;Lp1/q;I)Ll3/v0;

    move-result-object v26

    invoke-virtual {v2}, Ljp2/e;->e()Lcom/whoop/design/util/TextResource;

    move-result-object v8

    if-eqz v8, :cond_1f

    const/16 v27, 0x1

    goto :goto_15

    :cond_1f
    move/from16 v27, v6

    :goto_15
    sget-object v8, Lg1/i8;->a:Lg1/i8;

    invoke-virtual {v2}, Ljp2/e;->e()Lcom/whoop/design/util/TextResource;

    move-result-object v8

    if-eqz v8, :cond_20

    const v8, 0x2bdc2a96

    invoke-virtual {v7, v8}, Lp1/q;->e0(I)V

    invoke-virtual {v4, v7, v5}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v8

    invoke-virtual {v8}, Ly81/i;->g()J

    move-result-wide v8

    :goto_16
    invoke-virtual {v7, v6}, Lp1/q;->q(Z)V

    move-wide v11, v8

    goto :goto_17

    :cond_20
    const v8, 0x2bdc3028

    invoke-virtual {v7, v8}, Lp1/q;->e0(I)V

    invoke-virtual {v4, v7, v5}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v8

    invoke-virtual {v8}, Ly81/i;->r()J

    move-result-wide v8

    goto :goto_16

    :goto_17
    invoke-virtual {v4, v7, v5}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v8

    invoke-virtual {v8}, Ly81/i;->b1()J

    move-result-wide v8

    invoke-virtual {v4, v7, v5}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v10

    invoke-virtual {v10}, Ly81/i;->W0()J

    move-result-wide v17

    invoke-virtual {v4, v7, v5}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v10

    invoke-virtual {v10}, Ly81/i;->f()J

    move-result-wide v21

    invoke-virtual {v4, v7, v5}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v10

    invoke-virtual {v10}, Ly81/i;->y()J

    move-result-wide v19

    invoke-virtual {v4, v7, v5}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v10

    invoke-virtual {v10}, Ly81/i;->y()J

    move-result-wide v23

    invoke-virtual {v4, v7, v5}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v10

    invoke-virtual {v10}, Ly81/i;->y()J

    move-result-wide v28

    invoke-virtual {v4, v7, v5}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v10

    invoke-virtual {v10}, Ly81/i;->W0()J

    move-result-wide v30

    move-object/from16 v46, v14

    move-wide/from16 v13, v23

    const v24, 0x1ffe10

    move-object/from16 v23, v7

    move-object v6, v15

    move-wide v15, v8

    move-wide/from16 v7, v19

    move-wide/from16 v9, v28

    move-wide/from16 v19, v30

    invoke-static/range {v7 .. v24}, Lg1/i8;->g(JJJJJJJJLandroidx/compose/runtime/Composer;I)Lg1/y1;

    move-result-object v24

    move-object/from16 v7, v23

    invoke-virtual {v7}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v8

    if-ne v8, v6, :cond_21

    new-instance v8, Ljg/c;

    const/16 v6, 0x1d

    invoke-direct {v8, v6}, Ljg/c;-><init>(I)V

    invoke-virtual {v7, v8}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_21
    check-cast v8, Lkotlin/jvm/functions/Function1;

    new-instance v6, Lhb2/f;

    const/16 v9, 0x15

    invoke-direct {v6, v2, v9}, Lhb2/f;-><init>(Ljava/lang/Object;I)V

    const v9, 0x22786ce8

    invoke-static {v9, v7, v6}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v14

    sget-object v6, Ljp2/a;->a:Ljp2/a;

    invoke-virtual {v6}, Ljp2/a;->b()Lc93/m;

    move-result-object v15

    move/from16 v16, v27

    const/16 v27, 0x6000

    const v28, 0x3b940

    const/4 v10, 0x0

    const/4 v11, 0x1

    const/4 v13, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x1

    const/16 v21, 0x0

    const/16 v22, 0x0

    move-object/from16 v12, v26

    const v26, 0x30c06db0

    move-object v9, v0

    move-object/from16 v23, v25

    move-object/from16 v25, v7

    move-object v7, v3

    invoke-static/range {v7 .. v28}, Lg1/j4;->a(Ljava/lang/String;Lkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZZLl3/v0;Lc93/m;Lc93/m;Lc93/m;ZLq3/g0;Lu0/r0;Lu0/q0;ZIILi2/a1;Lg1/y1;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v7, v25

    const/4 v12, 0x1

    invoke-virtual {v7, v12}, Lp1/q;->q(Z)V

    invoke-virtual {v2}, Ljp2/e;->e()Lcom/whoop/design/util/TextResource;

    move-result-object v0

    if-eqz v0, :cond_22

    const v0, -0x59b85c71

    invoke-virtual {v7, v0}, Lp1/q;->e0(I)V

    invoke-virtual {v2}, Ljp2/e;->e()Lcom/whoop/design/util/TextResource;

    move-result-object v0

    move/from16 v3, v48

    invoke-static {v0, v7, v3}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v0

    invoke-virtual {v4, v7, v5}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v3

    invoke-virtual {v3}, Lb91/d;->m()Lb91/a;

    move-result-object v27

    invoke-virtual {v4, v7, v5}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v3

    invoke-virtual {v3}, Ly81/i;->f()J

    move-result-wide v9

    int-to-float v3, v12

    const/16 v12, 0x8

    int-to-float v4, v12

    mul-float v16, v3, v4

    const/16 v18, 0x0

    const/16 v19, 0xd

    const/4 v15, 0x0

    const/16 v17, 0x0

    move-object/from16 v14, v46

    invoke-static/range {v14 .. v19}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v8

    sget v3, Lb91/a;->d:I

    shl-int/lit8 v31, v3, 0x12

    const v32, 0x2fff8

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

    const/16 v30, 0x30

    move-object/from16 v29, v7

    move-object v7, v0

    invoke-static/range {v7 .. v32}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v7, v29

    const/4 v3, 0x0

    invoke-virtual {v7, v3}, Lp1/q;->q(Z)V

    :goto_18
    const/4 v12, 0x1

    goto :goto_19

    :cond_22
    const/4 v3, 0x0

    const v0, -0x59b447a5

    invoke-virtual {v7, v0}, Lp1/q;->e0(I)V

    invoke-virtual {v7, v3}, Lp1/q;->q(Z)V

    goto :goto_18

    :goto_19
    invoke-virtual {v7, v12}, Lp1/q;->q(Z)V

    move-object v3, v1

    move-object/from16 v1, v35

    goto :goto_1a

    :cond_23
    move-object v7, v0

    invoke-virtual {v7}, Lp1/q;->X()V

    move-object v1, v4

    move-object v3, v9

    :goto_1a
    invoke-virtual {v7}, Lp1/q;->u()Lp1/v1;

    move-result-object v7

    if-eqz v7, :cond_24

    new-instance v0, Ljp1/d;

    const/4 v6, 0x2

    move/from16 v4, p4

    move/from16 v5, p5

    invoke-direct/range {v0 .. v6}, Ljp1/d;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;III)V

    iput-object v0, v7, Lp1/v1;->d:Lc93/m;

    :cond_24
    return-void
.end method

.method private static final h(Ljava/lang/Object;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final i(Lp1/c1;)Z
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

.method private static final j(Lp1/c1;Z)V
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

.method private static final k(Lkotlin/jvm/functions/Function1;Ljp2/e;Ljava/lang/String;Ljava/lang/String;Lp1/c1;Lg2/v;)Ll83/a0;
    .locals 6

    const-string v0, "focusState"

    invoke-static {p5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p4}, Ljp2/d;->i(Lp1/c1;)Z

    move-result v0

    check-cast p5, Lg2/w;

    invoke-virtual {p5}, Lg2/w;->b()Z

    move-result v1

    invoke-static {p4, v1}, Ljp2/d;->j(Lp1/c1;Z)V

    if-eqz v0, :cond_1

    invoke-virtual {p5}, Lg2/w;->b()Z

    move-result p4

    if-nez p4, :cond_1

    invoke-virtual {p1}, Ljp2/e;->f()Ljava/lang/String;

    move-result-object v1

    invoke-static {p2}, Lyb3/r;->i0(Ljava/lang/CharSequence;)Z

    move-result p4

    if-eqz p4, :cond_0

    const/4 p2, 0x0

    :cond_0
    move-object v2, p2

    invoke-virtual {p1}, Ljp2/e;->h()Ljava/lang/String;

    move-result-object v3

    new-instance v0, Ljp2/c$a;

    const/4 v5, 0x0

    move-object v4, p3

    invoke-direct/range {v0 .. v5}, Ljp2/c$a;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)V

    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_1
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final l(Lg2/i;Ljp2/e;Lkotlin/jvm/functions/Function1;Ljava/lang/String;)Ll83/a0;
    .locals 1

    invoke-static {p0}, Lg2/i;->a(Lg2/i;)V

    invoke-virtual {p1}, Ljp2/e;->g()Ljava/util/List;

    move-result-object p0

    check-cast p0, Ljava/util/Collection;

    invoke-interface {p0}, Ljava/util/Collection;->isEmpty()Z

    move-result p0

    if-nez p0, :cond_0

    new-instance p0, Ljp2/c$b;

    invoke-virtual {p1}, Ljp2/e;->f()Ljava/lang/String;

    move-result-object v0

    invoke-virtual {p1}, Ljp2/e;->g()Ljava/util/List;

    move-result-object p1

    invoke-direct {p0, v0, p3, p1}, Ljp2/c$b;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V

    invoke-interface {p2, p0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final m(Ljava/lang/String;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final n(Ljp2/e;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 30

    and-int/lit8 v0, p2, 0x3

    const/4 v1, 0x2

    const/4 v2, 0x1

    const/4 v3, 0x0

    if-eq v0, v1, :cond_0

    move v0, v2

    goto :goto_0

    :cond_0
    move v0, v3

    :goto_0
    and-int/lit8 v1, p2, 0x1

    move-object/from16 v2, p1

    check-cast v2, Lp1/q;

    invoke-virtual {v2, v1, v0}, Lp1/q;->U(IZ)Z

    move-result v0

    if-eqz v0, :cond_2

    invoke-virtual/range {p0 .. p0}, Ljp2/e;->i()Lcom/whoop/design/util/TextResource;

    move-result-object v0

    if-nez v0, :cond_1

    const v0, 0x5c0a5b78

    invoke-virtual {v2, v0}, Lp1/q;->e0(I)V

    invoke-virtual {v2, v3}, Lp1/q;->q(Z)V

    goto :goto_1

    :cond_1
    const v1, 0x5c0a5b79

    invoke-virtual {v2, v1}, Lp1/q;->e0(I)V

    sget v1, Lcom/whoop/design/util/TextResource;->$stable:I

    invoke-static {v0, v2, v1}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v4

    sget-object v0, Lx81/d;->a:Lx81/d;

    sget v1, Lx81/d;->b:I

    invoke-virtual {v0, v2, v1}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v5

    invoke-virtual {v5}, Ly81/i;->b1()J

    move-result-wide v6

    invoke-virtual {v0, v2, v1}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v0

    invoke-virtual {v0}, Lb91/d;->a()Lb91/a;

    move-result-object v24

    sget v0, Lb91/a;->d:I

    shl-int/lit8 v28, v0, 0x12

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

    move-object/from16 v26, v2

    invoke-static/range {v4 .. v29}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v0, v26

    invoke-virtual {v0, v3}, Lp1/q;->q(Z)V

    goto :goto_1

    :cond_2
    move-object v0, v2

    invoke-virtual {v0}, Lp1/q;->X()V

    :goto_1
    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method

.method private static final o(Landroidx/compose/ui/Modifier;Ljp2/e;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 6

    or-int/lit8 p3, p3, 0x1

    invoke-static {p3}, Lp1/x;->L(I)I

    move-result v4

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move v5, p4

    move-object v3, p5

    invoke-static/range {v0 .. v5}, Ljp2/d;->g(Landroidx/compose/ui/Modifier;Ljp2/e;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method
