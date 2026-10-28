.class public abstract Lm80/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000(\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u001ae\u0010\u000c\u001a\u00020\u00062\u0008\u0008\u0002\u0010\u0001\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u00022\u0014\u0008\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0014\u0008\u0002\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0008\u0012\u0004\u0012\u00020\u00060\u00042\u0014\u0008\u0002\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00060\u0004H\u0001\u00a2\u0006\u0004\u0008\u000c\u0010\r\u00a8\u0006\u000e"
    }
    d2 = {
        "Lcom/whoop/design/util/TextResource;",
        "email",
        "",
        "isPasswordResetFlow",
        "Lkotlin/Function1;",
        "Lj80/a;",
        "Ll83/a0;",
        "onViewEvent",
        "Ll80/o;",
        "onNavigationEvent",
        "Lh80/b;",
        "onAnalyticsEvent",
        "g",
        "(Lcom/whoop/design/util/TextResource;ZLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V",
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
.method public static synthetic a(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lm80/a;->k(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Z)Ll83/a0;
    .locals 0

    invoke-static {p2, p0, p1}, Lm80/a;->l(ZLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Lj80/a;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lm80/a;->h(Lj80/a;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Ll80/o;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lm80/a;->i(Ll80/o;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic e(Lcom/whoop/design/util/TextResource;ZLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p8}, Lm80/a;->m(Lcom/whoop/design/util/TextResource;ZLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic f(Lh80/b;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lm80/a;->j(Lh80/b;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final g(Lcom/whoop/design/util/TextResource;ZLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V
    .locals 44
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/design/util/TextResource;",
            "Z",
            "Lkotlin/jvm/functions/Function1;",
            "Lkotlin/jvm/functions/Function1;",
            "Lkotlin/jvm/functions/Function1;",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    move-object/from16 v0, p0

    move/from16 v6, p6

    move-object/from16 v13, p5

    check-cast v13, Lp1/q;

    const v1, 0x6756c282

    invoke-virtual {v13, v1}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v1, v6, 0x6

    const/4 v2, 0x2

    if-nez v1, :cond_2

    and-int/lit8 v1, p7, 0x1

    if-nez v1, :cond_1

    and-int/lit8 v1, v6, 0x8

    if-nez v1, :cond_0

    invoke-virtual {v13, v0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v1

    goto :goto_0

    :cond_0
    invoke-virtual {v13, v0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v1

    :goto_0
    if-eqz v1, :cond_1

    const/4 v1, 0x4

    goto :goto_1

    :cond_1
    move v1, v2

    :goto_1
    or-int/2addr v1, v6

    goto :goto_2

    :cond_2
    move v1, v6

    :goto_2
    and-int/lit8 v3, p7, 0x2

    if-eqz v3, :cond_4

    or-int/lit8 v1, v1, 0x30

    :cond_3
    move/from16 v5, p1

    goto :goto_4

    :cond_4
    and-int/lit8 v5, v6, 0x30

    if-nez v5, :cond_3

    move/from16 v5, p1

    invoke-virtual {v13, v5}, Lp1/q;->h(Z)Z

    move-result v7

    if-eqz v7, :cond_5

    const/16 v7, 0x20

    goto :goto_3

    :cond_5
    const/16 v7, 0x10

    :goto_3
    or-int/2addr v1, v7

    :goto_4
    and-int/lit8 v7, p7, 0x4

    if-eqz v7, :cond_7

    or-int/lit16 v1, v1, 0x180

    :cond_6
    move-object/from16 v9, p2

    goto :goto_6

    :cond_7
    and-int/lit16 v9, v6, 0x180

    if-nez v9, :cond_6

    move-object/from16 v9, p2

    invoke-virtual {v13, v9}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_8

    const/16 v10, 0x100

    goto :goto_5

    :cond_8
    const/16 v10, 0x80

    :goto_5
    or-int/2addr v1, v10

    :goto_6
    and-int/lit8 v10, p7, 0x8

    if-eqz v10, :cond_a

    or-int/lit16 v1, v1, 0xc00

    :cond_9
    move-object/from16 v12, p3

    goto :goto_8

    :cond_a
    and-int/lit16 v12, v6, 0xc00

    if-nez v12, :cond_9

    move-object/from16 v12, p3

    invoke-virtual {v13, v12}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v14

    if-eqz v14, :cond_b

    const/16 v14, 0x800

    goto :goto_7

    :cond_b
    const/16 v14, 0x400

    :goto_7
    or-int/2addr v1, v14

    :goto_8
    and-int/lit8 v14, p7, 0x10

    const/16 v15, 0x4000

    if-eqz v14, :cond_d

    or-int/lit16 v1, v1, 0x6000

    :cond_c
    move-object/from16 v11, p4

    goto :goto_a

    :cond_d
    and-int/lit16 v11, v6, 0x6000

    if-nez v11, :cond_c

    move-object/from16 v11, p4

    invoke-virtual {v13, v11}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v16

    if-eqz v16, :cond_e

    move/from16 v16, v15

    goto :goto_9

    :cond_e
    const/16 v16, 0x2000

    :goto_9
    or-int v1, v1, v16

    :goto_a
    and-int/lit16 v4, v1, 0x2493

    const/16 v8, 0x2492

    const/4 v11, 0x0

    if-eq v4, v8, :cond_f

    const/4 v4, 0x1

    goto :goto_b

    :cond_f
    move v4, v11

    :goto_b
    and-int/lit8 v8, v1, 0x1

    invoke-virtual {v13, v8, v4}, Lp1/q;->U(IZ)Z

    move-result v4

    if-eqz v4, :cond_2f

    invoke-virtual {v13}, Lp1/q;->Z()V

    and-int/lit8 v4, v6, 0x1

    sget-object v8, Lp1/l;->a:Lp1/v0;

    if-eqz v4, :cond_13

    invoke-virtual {v13}, Lp1/q;->C()Z

    move-result v4

    if-eqz v4, :cond_10

    goto :goto_d

    :cond_10
    invoke-virtual {v13}, Lp1/q;->X()V

    and-int/lit8 v3, p7, 0x1

    if-eqz v3, :cond_11

    and-int/lit8 v1, v1, -0xf

    :cond_11
    move-object/from16 v3, p3

    :cond_12
    move-object/from16 v4, p4

    :goto_c
    move v7, v1

    move-object v1, v9

    goto :goto_f

    :cond_13
    :goto_d
    and-int/lit8 v4, p7, 0x1

    if-eqz v4, :cond_14

    invoke-static {}, Lcom/whoop/design/util/b;->a()Lcom/whoop/design/util/TextResource;

    move-result-object v0

    and-int/lit8 v1, v1, -0xf

    :cond_14
    if-eqz v3, :cond_15

    move v5, v11

    :cond_15
    if-eqz v7, :cond_17

    invoke-virtual {v13}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    if-ne v3, v8, :cond_16

    new-instance v3, Lm01/c;

    const/16 v4, 0xa

    invoke-direct {v3, v4}, Lm01/c;-><init>(I)V

    invoke-virtual {v13, v3}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_16
    check-cast v3, Lkotlin/jvm/functions/Function1;

    move-object v9, v3

    :cond_17
    if-eqz v10, :cond_19

    invoke-virtual {v13}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    if-ne v3, v8, :cond_18

    new-instance v3, Lm01/c;

    const/16 v4, 0xb

    invoke-direct {v3, v4}, Lm01/c;-><init>(I)V

    invoke-virtual {v13, v3}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_18
    check-cast v3, Lkotlin/jvm/functions/Function1;

    goto :goto_e

    :cond_19
    move-object/from16 v3, p3

    :goto_e
    if-eqz v14, :cond_12

    invoke-virtual {v13}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    if-ne v4, v8, :cond_1a

    new-instance v4, Lm01/c;

    const/16 v7, 0xc

    invoke-direct {v4, v7}, Lm01/c;-><init>(I)V

    invoke-virtual {v13, v4}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_1a
    check-cast v4, Lkotlin/jvm/functions/Function1;

    goto :goto_c

    :goto_f
    invoke-virtual {v13}, Lp1/q;->r()V

    const v9, 0xe000

    and-int/2addr v9, v7

    if-ne v9, v15, :cond_1b

    const/4 v10, 0x1

    goto :goto_10

    :cond_1b
    move v10, v11

    :goto_10
    invoke-virtual {v13}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v14

    const/4 v15, 0x0

    if-nez v10, :cond_1c

    if-ne v14, v8, :cond_1d

    :cond_1c
    new-instance v14, Lm80/a$a;

    invoke-direct {v14, v4, v15}, Lm80/a$a;-><init>(Lkotlin/jvm/functions/Function1;Lq83/d;)V

    invoke-virtual {v13, v14}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_1d
    check-cast v14, Lc93/m;

    sget-object v10, Ll83/a0;->a:Ll83/a0;

    invoke-static {v13, v14, v10}, Lp1/x;->g(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v13, v11}, Lk80/s;->c(Landroidx/compose/runtime/Composer;I)V

    sget-object v10, Lb2/t;->w:Lb2/t;

    invoke-static {v10}, Ll0/f;->l(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v14

    const/4 v12, 0x5

    int-to-float v12, v12

    const/16 v15, 0x8

    int-to-float v15, v15

    mul-float/2addr v12, v15

    move/from16 v19, v15

    const/4 v15, 0x3

    int-to-float v11, v15

    mul-float v11, v11, v19

    int-to-float v15, v2

    mul-float v15, v15, v19

    invoke-static {v14, v15, v12, v15, v11}, Landroidx/compose/foundation/layout/a;->s(Landroidx/compose/ui/Modifier;FFFF)Landroidx/compose/ui/Modifier;

    move-result-object v11

    sget-object v12, Lb2/e;->w:Lb2/m;

    const/4 v14, 0x0

    invoke-static {v12, v14}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v12

    move/from16 v20, v15

    iget-wide v14, v13, Lp1/q;->T:J

    invoke-static {v14, v15}, Ljava/lang/Long;->hashCode(J)I

    move-result v14

    invoke-virtual {v13}, Lp1/q;->m()Lp1/p1;

    move-result-object v15

    invoke-static {v13, v11}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v11

    sget-object v22, La3/l;->a:La3/k;

    invoke-virtual/range {v22 .. v22}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v2, La3/k;->b:La3/j;

    invoke-virtual {v13}, Lp1/q;->i0()V

    iget-boolean v6, v13, Lp1/q;->S:Z

    if-eqz v6, :cond_1e

    invoke-virtual {v13, v2}, Lp1/q;->l(Lc93/a;)V

    goto :goto_11

    :cond_1e
    invoke-virtual {v13}, Lp1/q;->s0()V

    :goto_11
    sget-object v6, La3/k;->g:La3/i;

    invoke-static {v13, v6, v12}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v12, La3/k;->f:La3/i;

    invoke-static {v13, v12, v15}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v15, La3/k;->j:La3/i;

    move-object/from16 p2, v12

    iget-boolean v12, v13, Lp1/q;->S:Z

    if-nez v12, :cond_1f

    invoke-virtual {v13}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v12

    move-object/from16 v33, v3

    invoke-static {v14}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-static {v12, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_20

    goto :goto_12

    :cond_1f
    move-object/from16 v33, v3

    :goto_12
    invoke-static {v14, v13, v14, v15}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_20
    sget-object v3, La3/k;->d:La3/i;

    invoke-static {v13, v3, v11}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    if-eqz v5, :cond_25

    const v12, -0x60cf6a85

    invoke-virtual {v13, v12}, Lp1/q;->e0(I)V

    sget-object v12, Lb2/e;->y:Lb2/m;

    sget-object v14, Landroidx/compose/foundation/layout/b;->a:Landroidx/compose/foundation/layout/b;

    invoke-virtual {v14, v10, v12}, Landroidx/compose/foundation/layout/b;->a(Landroidx/compose/ui/Modifier;Lb2/h;)Landroidx/compose/ui/Modifier;

    move-result-object v22

    const/16 p3, 0x6

    const-wide/high16 v11, 0x3fe0000000000000L    # 0.5

    double-to-float v11, v11

    mul-float v24, v11, v19

    const/16 v26, 0x0

    const/16 v27, 0xd

    const/16 v23, 0x0

    const/16 v25, 0x0

    invoke-static/range {v22 .. v27}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v11

    new-instance v12, Lcom/whoop/design/util/TextResource$b;

    sget v14, Lsn0/b;->y:I

    move-object/from16 p4, v10

    move-object/from16 p0, v11

    const/4 v10, 0x2

    const/4 v11, 0x0

    invoke-direct {v12, v14, v11, v10, v11}, Lcom/whoop/design/util/TextResource$b;-><init>(ILjava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sget-object v10, Lx81/d;->a:Lx81/d;

    sget v14, Lx81/d;->b:I

    invoke-virtual {v10, v13, v14}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v10

    invoke-virtual {v10}, Lb91/d;->b()Lb91/a;

    move-result-object v10

    const/4 v14, 0x1

    int-to-float v11, v14

    mul-float v11, v11, v19

    new-instance v14, Ll0/l1;

    invoke-direct {v14, v11, v11, v11, v11}, Ll0/l1;-><init>(FFFF)V

    and-int/lit16 v11, v7, 0x380

    move/from16 v23, v7

    const/16 v7, 0x100

    if-ne v11, v7, :cond_21

    const/4 v7, 0x1

    :goto_13
    const/16 v11, 0x4000

    goto :goto_14

    :cond_21
    const/4 v7, 0x0

    goto :goto_13

    :goto_14
    if-ne v9, v11, :cond_22

    const/16 v16, 0x1

    goto :goto_15

    :cond_22
    const/16 v16, 0x0

    :goto_15
    or-int v7, v7, v16

    invoke-virtual {v13}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v11

    if-nez v7, :cond_23

    if-ne v11, v8, :cond_24

    :cond_23
    new-instance v11, Ldc0/c;

    const/4 v7, 0x3

    invoke-direct {v11, v1, v7, v4}, Ldc0/c;-><init>(Lkotlin/jvm/functions/Function1;ILkotlin/jvm/functions/Function1;)V

    invoke-virtual {v13, v11}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_24
    check-cast v11, Lc93/a;

    sget v7, Lcom/whoop/design/util/TextResource$b;->c:I

    shl-int/lit8 v7, v7, 0x6

    const/high16 v16, 0x36030000

    or-int v7, v7, v16

    sget v16, Lb91/a;->d:I

    shl-int/lit8 v16, v16, 0x9

    or-int v7, v7, v16

    move/from16 v16, v20

    const/16 v20, 0x0

    const/16 v24, 0x0

    const/16 v21, 0xd2

    move-object/from16 v25, v8

    const/4 v8, 0x0

    move-object/from16 v17, v11

    const/16 v26, 0x4000

    const/4 v11, 0x0

    move/from16 v27, v9

    move-object v9, v12

    const/4 v12, 0x0

    move-object/from16 v29, v13

    const/4 v13, 0x0

    move/from16 v28, v16

    move-object/from16 v16, v14

    const/4 v14, 0x0

    move-object/from16 v30, v15

    const/4 v15, 0x0

    move-object/from16 v42, v0

    move-object/from16 v34, v1

    move-object/from16 v35, v4

    move/from16 v36, v5

    move/from16 v22, v19

    move/from16 v39, v23

    move/from16 v1, v24

    move-object/from16 v40, v25

    move/from16 v38, v27

    move/from16 v37, v28

    move-object/from16 v18, v29

    move-object/from16 v4, v30

    const/16 v23, 0x3

    move-object/from16 v5, p2

    move-object/from16 v0, p4

    move/from16 v19, v7

    move-object/from16 v7, p0

    invoke-static/range {v7 .. v21}, Lny0/o0;->b(Landroidx/compose/ui/Modifier;ZLcom/whoop/design/util/TextResource;Lb91/a;Lg1/u0;Lf0/t;Ljava/lang/Integer;Landroidx/compose/ui/Modifier;ZLl0/k1;Lc93/a;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v13, v18

    invoke-virtual {v13, v1}, Lp1/q;->q(Z)V

    goto :goto_16

    :cond_25
    move-object/from16 v42, v0

    move-object/from16 v34, v1

    move-object/from16 v35, v4

    move/from16 v36, v5

    move/from16 v39, v7

    move-object/from16 v40, v8

    move/from16 v38, v9

    move-object v0, v10

    move-object v4, v15

    move/from16 v22, v19

    move/from16 v37, v20

    const/4 v1, 0x0

    const/16 v23, 0x3

    move-object/from16 v5, p2

    const v7, -0x60c42b46

    invoke-virtual {v13, v7}, Lp1/q;->e0(I)V

    invoke-virtual {v13, v1}, Lp1/q;->q(Z)V

    :goto_16
    const/high16 v7, 0x3f800000    # 1.0f

    invoke-static {v7, v0}, Landroidx/compose/foundation/layout/d;->d(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v7

    sget-object v8, Ll0/m;->d:Ll0/g;

    sget-object v9, Lb2/e;->M:Lb2/k;

    const/4 v10, 0x6

    invoke-static {v8, v9, v13, v10}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v8

    iget-wide v9, v13, Lp1/q;->T:J

    invoke-static {v9, v10}, Ljava/lang/Long;->hashCode(J)I

    move-result v9

    invoke-virtual {v13}, Lp1/q;->m()Lp1/p1;

    move-result-object v10

    invoke-static {v13, v7}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v7

    invoke-virtual {v13}, Lp1/q;->i0()V

    iget-boolean v11, v13, Lp1/q;->S:Z

    if-eqz v11, :cond_26

    invoke-virtual {v13, v2}, Lp1/q;->l(Lc93/a;)V

    goto :goto_17

    :cond_26
    invoke-virtual {v13}, Lp1/q;->s0()V

    :goto_17
    invoke-static {v13, v6, v8}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v13, v5, v10}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v2, v13, Lp1/q;->S:Z

    if-nez v2, :cond_27

    invoke-virtual {v13}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-static {v2, v5}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_28

    :cond_27
    invoke-static {v9, v13, v9, v4}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_28
    invoke-static {v13, v3, v7}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    new-instance v2, Lkd1/o$a;

    sget v3, Lx60/a;->b:I

    invoke-direct {v2, v3}, Lkd1/o$a;-><init>(I)V

    sget v3, Lx60/b;->j:I

    invoke-static {v3}, Lcom/whoop/design/util/b;->k(I)Lcom/whoop/design/util/TextResource$b;

    move-result-object v3

    sget v4, Lx60/b;->i:I

    invoke-static {v4, v13, v1}, Lcom/whoop/design/util/b;->g(ILandroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v4

    sget v5, Lcom/whoop/design/util/TextResource;->$stable:I

    and-int/lit8 v6, v39, 0xe

    or-int/2addr v5, v6

    move-object/from16 v6, v42

    invoke-static {v6, v13, v5}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v5

    filled-new-array {v5}, [Ljava/lang/Object;

    move-result-object v5

    const/4 v7, 0x1

    invoke-static {v5, v7}, Ljava/util/Arrays;->copyOf([Ljava/lang/Object;I)[Ljava/lang/Object;

    move-result-object v5

    invoke-static {v4, v5}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String;

    move-result-object v4

    sget v5, Lkd1/o$a;->c:I

    sget v8, Lcom/whoop/design/util/TextResource$b;->c:I

    shl-int/lit8 v41, v8, 0x3

    or-int v5, v5, v41

    const/4 v8, 0x0

    move-object/from16 p0, v2

    move-object/from16 p1, v3

    move-object/from16 p2, v4

    move/from16 p4, v5

    move/from16 p5, v8

    move-object/from16 p3, v13

    invoke-static/range {p0 .. p5}, Lk80/q;->b(Lkd1/o;Lcom/whoop/design/util/TextResource;Ljava/lang/String;Landroidx/compose/runtime/Composer;II)V

    int-to-float v2, v7

    mul-float v20, v2, v22

    const/16 v22, 0x0

    const/16 v23, 0xd

    const/16 v19, 0x0

    const/16 v21, 0x0

    move-object/from16 v18, v0

    invoke-static/range {v18 .. v23}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v8

    sget v2, Lx60/b;->h:I

    invoke-static {v2, v13, v1}, Lcom/whoop/design/util/b;->g(ILandroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v2

    sget-object v3, Lx81/d;->a:Lx81/d;

    sget v4, Lx81/d;->b:I

    invoke-virtual {v3, v13, v4}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v5

    invoke-virtual {v5}, Lb91/d;->a()Lb91/a;

    move-result-object v27

    invoke-virtual {v3, v13, v4}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v3

    invoke-virtual {v3}, Ly81/i;->c1()J

    move-result-wide v9

    sget v3, Lb91/a;->d:I

    shl-int/lit8 v31, v3, 0x12

    const v32, 0x2fff8

    const-wide/16 v11, 0x0

    move-object/from16 v29, v13

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

    move/from16 v43, v7

    move-object v7, v2

    move/from16 v2, v43

    invoke-static/range {v7 .. v32}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v13, v29

    const/16 v22, 0x0

    const/16 v23, 0xd

    const/16 v19, 0x0

    const/16 v21, 0x0

    move-object/from16 v18, v0

    move/from16 v20, v37

    invoke-static/range {v18 .. v23}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v0

    invoke-static {v13, v0}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    if-eqz v36, :cond_29

    new-instance v0, Lcom/whoop/design/util/TextResource$b;

    sget v3, Lx60/b;->O:I

    const/4 v10, 0x2

    const/4 v11, 0x0

    invoke-direct {v0, v3, v11, v10, v11}, Lcom/whoop/design/util/TextResource$b;-><init>(ILjava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    :goto_18
    move-object v8, v0

    goto :goto_19

    :cond_29
    const/4 v10, 0x2

    const/4 v11, 0x0

    new-instance v0, Lcom/whoop/design/util/TextResource$b;

    sget v3, Lx60/b;->a:I

    invoke-direct {v0, v3, v11, v10, v11}, Lcom/whoop/design/util/TextResource$b;-><init>(ILjava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    goto :goto_18

    :goto_19
    and-int/lit8 v0, v39, 0x70

    const/16 v3, 0x20

    if-ne v0, v3, :cond_2a

    move v11, v2

    goto :goto_1a

    :cond_2a
    move v11, v1

    :goto_1a
    move/from16 v0, v39

    and-int/lit16 v0, v0, 0x1c00

    const/16 v3, 0x800

    if-ne v0, v3, :cond_2b

    move v0, v2

    goto :goto_1b

    :cond_2b
    move v0, v1

    :goto_1b
    or-int/2addr v0, v11

    move/from16 v3, v38

    const/16 v11, 0x4000

    if-ne v3, v11, :cond_2c

    move v11, v2

    goto :goto_1c

    :cond_2c
    move v11, v1

    :goto_1c
    or-int/2addr v0, v11

    invoke-virtual {v13}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    if-nez v0, :cond_2e

    move-object/from16 v0, v40

    if-ne v1, v0, :cond_2d

    goto :goto_1d

    :cond_2d
    move-object/from16 v3, v33

    move-object/from16 v4, v35

    move/from16 v5, v36

    goto :goto_1e

    :cond_2e
    :goto_1d
    new-instance v1, Lep1/n;

    const/4 v0, 0x3

    move-object/from16 v3, v33

    move-object/from16 v4, v35

    move/from16 v5, v36

    invoke-direct {v1, v5, v3, v4, v0}, Lep1/n;-><init>(ZLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;I)V

    invoke-virtual {v13, v1}, Lp1/q;->p0(Ljava/lang/Object;)V

    :goto_1e
    move-object v12, v1

    check-cast v12, Lc93/a;

    const/16 v15, 0x1d

    const/4 v7, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    move/from16 v14, v41

    invoke-static/range {v7 .. v15}, Lk80/i;->d(ZLcom/whoop/design/util/TextResource;Lg1/u0;Li2/a1;Lf0/t;Lc93/a;Landroidx/compose/runtime/Composer;II)V

    invoke-virtual {v13, v2}, Lp1/q;->q(Z)V

    invoke-virtual {v13, v2}, Lp1/q;->q(Z)V

    move v2, v5

    move-object v1, v6

    move-object v5, v4

    move-object v4, v3

    move-object/from16 v3, v34

    goto :goto_1f

    :cond_2f
    invoke-virtual {v13}, Lp1/q;->X()V

    move-object/from16 v4, p3

    move-object v1, v0

    move v2, v5

    move-object v3, v9

    move-object/from16 v5, p4

    :goto_1f
    invoke-virtual {v13}, Lp1/q;->u()Lp1/v1;

    move-result-object v9

    if-eqz v9, :cond_30

    new-instance v0, Lbf0/g;

    const/16 v8, 0x1b

    move/from16 v6, p6

    move/from16 v7, p7

    invoke-direct/range {v0 .. v8}, Lbf0/g;-><init>(Ljava/lang/Object;ZLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;III)V

    iput-object v0, v9, Lp1/v1;->d:Lc93/m;

    :cond_30
    return-void
.end method

.method private static final h(Lj80/a;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final i(Ll80/o;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final j(Lh80/b;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final k(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 1

    sget-object v0, Lj80/a$p0;->a:Lj80/a$p0;

    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance p0, Lh80/b$f;

    const-string v0, "skip"

    invoke-direct {p0, v0}, Lh80/b$f;-><init>(Ljava/lang/String;)V

    invoke-interface {p1, p0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final l(ZLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 10

    if-eqz p0, :cond_0

    sget-object p0, Ll80/o$l;->a:Ll80/o$l;

    invoke-interface {p1, p0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance p0, Ll80/o$f;

    sget-object v0, Lcom/whoop/activation/view/navigation/ActivationFlowDestination;->START_SCREEN:Lcom/whoop/activation/view/navigation/ActivationFlowDestination;

    invoke-direct {p0, v0}, Ll80/o$f;-><init>(Lcom/whoop/activation/view/navigation/ActivationFlowDestination;)V

    invoke-interface {p1, p0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v1, Lh80/b$i;

    const/16 v8, 0x26

    const/4 v9, 0x0

    const-string v2, "check_your_inbox"

    const/4 v3, 0x0

    const/4 v4, 0x0

    const-string v5, "open_email"

    const-string v6, "authentication"

    const/4 v7, 0x0

    invoke-direct/range {v1 .. v9}, Lh80/b$i;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {p2, v1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_0
    new-instance p0, Ll80/o$f;

    sget-object v0, Lcom/whoop/activation/view/navigation/ActivationFlowDestination;->START_SCREEN:Lcom/whoop/activation/view/navigation/ActivationFlowDestination;

    invoke-direct {p0, v0}, Ll80/o$f;-><init>(Lcom/whoop/activation/view/navigation/ActivationFlowDestination;)V

    invoke-interface {p1, p0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance v1, Lh80/b$i;

    const/16 v8, 0x26

    const/4 v9, 0x0

    const-string v2, "check_your_inbox"

    const/4 v3, 0x0

    const/4 v4, 0x0

    const-string v5, "back_to_login"

    const-string v6, "authentication"

    const/4 v7, 0x0

    invoke-direct/range {v1 .. v9}, Lh80/b$i;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {p2, v1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :goto_0
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final m(Lcom/whoop/design/util/TextResource;ZLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 8

    or-int/lit8 p5, p5, 0x1

    invoke-static {p5}, Lp1/x;->L(I)I

    move-result v6

    move-object v0, p0

    move v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    move v7, p6

    move-object v5, p7

    invoke-static/range {v0 .. v7}, Lm80/a;->g(Lcom/whoop/design/util/TextResource;ZLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method
