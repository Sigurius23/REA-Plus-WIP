.class public abstract Lry0/b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0005\u001a;\u0010\t\u001a\u00020\u00052\u0008\u0008\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u000e\u0008\u0002\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00050\u00042\u0008\u0008\u0002\u0010\u0008\u001a\u00020\u0007H\u0007\u00a2\u0006\u0004\u0008\t\u0010\n\u00a8\u0006\u000c\u00b2\u0006\u000e\u0010\u000b\u001a\u00020\u00078\n@\nX\u008a\u008e\u0002"
    }
    d2 = {
        "Landroidx/compose/ui/Modifier;",
        "modifier",
        "Lry0/d;",
        "state",
        "Lkotlin/Function0;",
        "Ll83/a0;",
        "onClick",
        "",
        "selectionDisabled",
        "f",
        "(Landroidx/compose/ui/Modifier;Lry0/d;Lc93/a;ZLandroidx/compose/runtime/Composer;II)V",
        "isSelected",
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
.method public static synthetic a(Lc93/a;Z)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lry0/b;->l(Lc93/a;Z)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lc93/a;ZLp1/c1;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, Lry0/b;->j(Lc93/a;ZLp1/c1;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Lc93/a;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lry0/b;->k(Lc93/a;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Landroidx/compose/ui/Modifier;Lry0/d;Lc93/a;ZIILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p7}, Lry0/b;->m(Landroidx/compose/ui/Modifier;Lry0/d;Lc93/a;ZIILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic e()Ll83/a0;
    .locals 1

    invoke-static {}, Lry0/b;->g()Ll83/a0;

    move-result-object v0

    return-object v0
.end method

.method public static final f(Landroidx/compose/ui/Modifier;Lry0/d;Lc93/a;ZLandroidx/compose/runtime/Composer;II)V
    .locals 43
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/ui/Modifier;",
            "Lry0/d;",
            "Lc93/a;",
            "Z",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    move-object/from16 v2, p1

    move/from16 v5, p5

    const-string v0, "state"

    invoke-static {v2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v9, p4

    check-cast v9, Lp1/q;

    const v0, -0x32e5f4b5    # -1.6152696E8f

    invoke-virtual {v9, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, p6, 0x1

    const/4 v1, 0x4

    if-eqz v0, :cond_0

    or-int/lit8 v4, v5, 0x6

    move v6, v4

    move-object/from16 v4, p0

    goto :goto_1

    :cond_0
    and-int/lit8 v4, v5, 0x6

    if-nez v4, :cond_2

    move-object/from16 v4, p0

    invoke-virtual {v9, v4}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_1

    move v6, v1

    goto :goto_0

    :cond_1
    const/4 v6, 0x2

    :goto_0
    or-int/2addr v6, v5

    goto :goto_1

    :cond_2
    move-object/from16 v4, p0

    move v6, v5

    :goto_1
    and-int/lit8 v7, v5, 0x30

    if-nez v7, :cond_4

    invoke-virtual {v9, v2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_3

    const/16 v7, 0x20

    goto :goto_2

    :cond_3
    const/16 v7, 0x10

    :goto_2
    or-int/2addr v6, v7

    :cond_4
    and-int/lit8 v7, p6, 0x4

    const/16 v8, 0x100

    if-eqz v7, :cond_6

    or-int/lit16 v6, v6, 0x180

    :cond_5
    move-object/from16 v10, p2

    goto :goto_4

    :cond_6
    and-int/lit16 v10, v5, 0x180

    if-nez v10, :cond_5

    move-object/from16 v10, p2

    invoke-virtual {v9, v10}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_7

    move v11, v8

    goto :goto_3

    :cond_7
    const/16 v11, 0x80

    :goto_3
    or-int/2addr v6, v11

    :goto_4
    and-int/lit16 v11, v5, 0xc00

    const/16 v12, 0x800

    if-nez v11, :cond_a

    and-int/lit8 v11, p6, 0x8

    if-nez v11, :cond_8

    move/from16 v11, p3

    invoke-virtual {v9, v11}, Lp1/q;->h(Z)Z

    move-result v13

    if-eqz v13, :cond_9

    move v13, v12

    goto :goto_5

    :cond_8
    move/from16 v11, p3

    :cond_9
    const/16 v13, 0x400

    :goto_5
    or-int/2addr v6, v13

    goto :goto_6

    :cond_a
    move/from16 v11, p3

    :goto_6
    and-int/lit16 v13, v6, 0x493

    const/16 v14, 0x492

    const/4 v15, 0x0

    move/from16 p4, v7

    if-eq v13, v14, :cond_b

    const/4 v13, 0x1

    goto :goto_7

    :cond_b
    move v13, v15

    :goto_7
    and-int/lit8 v14, v6, 0x1

    invoke-virtual {v9, v14, v13}, Lp1/q;->U(IZ)Z

    move-result v13

    if-eqz v13, :cond_42

    invoke-virtual {v9}, Lp1/q;->Z()V

    and-int/lit8 v13, v5, 0x1

    sget-object v14, Lb2/t;->w:Lb2/t;

    sget-object v10, Lp1/l;->a:Lp1/v0;

    if-eqz v13, :cond_f

    invoke-virtual {v9}, Lp1/q;->C()Z

    move-result v13

    if-eqz v13, :cond_c

    goto :goto_9

    :cond_c
    invoke-virtual {v9}, Lp1/q;->X()V

    and-int/lit8 v0, p6, 0x8

    if-eqz v0, :cond_d

    and-int/lit16 v6, v6, -0x1c01

    :cond_d
    move-object/from16 v0, p2

    :cond_e
    :goto_8
    move v13, v11

    goto :goto_b

    :cond_f
    :goto_9
    if-eqz v0, :cond_10

    move-object v4, v14

    :cond_10
    if-eqz p4, :cond_12

    invoke-virtual {v9}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v10, :cond_11

    new-instance v0, Lrx0/f;

    const/4 v13, 0x2

    invoke-direct {v0, v13}, Lrx0/f;-><init>(I)V

    invoke-virtual {v9, v0}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_11
    check-cast v0, Lc93/a;

    goto :goto_a

    :cond_12
    move-object/from16 v0, p2

    :goto_a
    and-int/lit8 v13, p6, 0x8

    if-eqz v13, :cond_e

    invoke-virtual {v2}, Lry0/d;->k()Z

    move-result v11

    and-int/lit16 v6, v6, -0x1c01

    goto :goto_8

    :goto_b
    invoke-virtual {v9}, Lp1/q;->r()V

    invoke-virtual {v2}, Lry0/d;->getId()Ljava/lang/String;

    move-result-object v11

    const/16 p4, 0x1

    invoke-virtual {v2}, Lry0/d;->j()Z

    move-result v7

    invoke-virtual {v9, v11}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v11

    invoke-virtual {v9, v7}, Lp1/q;->h(Z)Z

    move-result v7

    or-int/2addr v7, v11

    invoke-virtual {v9}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v11

    if-nez v7, :cond_13

    if-ne v11, v10, :cond_14

    :cond_13
    invoke-virtual {v2}, Lry0/d;->j()Z

    move-result v7

    invoke-static {v7}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object v7

    invoke-static {v7}, Lp1/x;->z(Ljava/lang/Object;)Lp1/k1;

    move-result-object v11

    invoke-virtual {v9, v11}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_14
    move-object v7, v11

    check-cast v7, Lp1/c1;

    invoke-static {v7}, Lry0/b;->h(Lp1/c1;)Z

    move-result v11

    const/16 v16, 0x0

    if-eqz v11, :cond_15

    invoke-virtual {v2}, Lry0/d;->l()Lry0/c;

    move-result-object v11

    move-object/from16 v17, v11

    goto :goto_c

    :cond_15
    move-object/from16 v17, v16

    :goto_c
    invoke-virtual {v2}, Lry0/d;->f()Ly3/f;

    move-result-object v11

    and-int/lit16 v3, v6, 0x380

    if-ne v3, v8, :cond_16

    move/from16 v3, p4

    goto :goto_d

    :cond_16
    move v3, v15

    :goto_d
    and-int/lit16 v8, v6, 0x1c00

    xor-int/lit16 v8, v8, 0xc00

    if-le v8, v12, :cond_17

    invoke-virtual {v9, v13}, Lp1/q;->h(Z)Z

    move-result v8

    if-nez v8, :cond_18

    :cond_17
    and-int/lit16 v6, v6, 0xc00

    if-ne v6, v12, :cond_19

    :cond_18
    move/from16 v6, p4

    goto :goto_e

    :cond_19
    move v6, v15

    :goto_e
    or-int/2addr v3, v6

    invoke-virtual {v9, v7}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v6

    or-int/2addr v3, v6

    invoke-virtual {v9}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v6

    if-nez v3, :cond_1a

    if-ne v6, v10, :cond_1b

    :cond_1a
    new-instance v6, Lbm2/d0;

    const/16 v3, 0x8

    invoke-direct {v6, v0, v13, v7, v3}, Lbm2/d0;-><init>(Ljava/lang/Object;ZLjava/lang/Object;I)V

    invoke-virtual {v9, v6}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_1b
    move-object v3, v6

    check-cast v3, Lc93/a;

    const/high16 v12, 0x3f800000    # 1.0f

    invoke-static {v12, v4}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v19

    invoke-virtual {v2}, Lry0/d;->q()Z

    move-result v6

    xor-int/lit8 v20, v6, 0x1

    invoke-virtual {v9, v3}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v6

    invoke-virtual {v9}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v8

    if-nez v6, :cond_1c

    if-ne v8, v10, :cond_1d

    :cond_1c
    new-instance v8, Lot1/e;

    const/16 v6, 0x1d

    invoke-direct {v8, v3, v6}, Lot1/e;-><init>(Lc93/a;I)V

    invoke-virtual {v9, v8}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_1d
    move-object/from16 v23, v8

    check-cast v23, Lc93/a;

    const/16 v24, 0xe

    const/16 v21, 0x0

    const/16 v22, 0x0

    invoke-static/range {v19 .. v24}, Landroidx/compose/foundation/a;->g(Landroidx/compose/ui/Modifier;ZLjava/lang/String;Li3/i;Lc93/a;I)Landroidx/compose/ui/Modifier;

    move-result-object v6

    invoke-virtual {v2}, Lry0/d;->q()Z

    move-result v8

    move-object/from16 p0, v7

    const/4 v7, 0x6

    if-eqz v8, :cond_1e

    const v8, -0x162cb0fa

    invoke-virtual {v9, v8}, Lp1/q;->e0(I)V

    sget-object v8, Ly81/f;->WHITE_5:Ly81/f;

    invoke-virtual {v8, v9, v7}, Ly81/f;->toComposableColor-WaAFU9c(Landroidx/compose/runtime/Composer;I)J

    move-result-wide v19

    invoke-virtual {v9, v15}, Lp1/q;->q(Z)V

    :goto_f
    move-wide/from16 v7, v19

    goto :goto_10

    :cond_1e
    const v8, -0x162b5b7e

    invoke-virtual {v9, v8}, Lp1/q;->e0(I)V

    if-eqz v17, :cond_1f

    invoke-virtual/range {v17 .. v17}, Lry0/c;->getBackgroundColor()Ly81/f;

    move-result-object v8

    if-nez v8, :cond_20

    :cond_1f
    sget-object v8, Ly81/f;->WHITE_10:Ly81/f;

    :cond_20
    invoke-virtual {v8, v9, v15}, Ly81/f;->toComposableColor-WaAFU9c(Landroidx/compose/runtime/Composer;I)J

    move-result-wide v19

    invoke-virtual {v9, v15}, Lp1/q;->q(Z)V

    goto :goto_f

    :goto_10
    const/4 v12, 0x3

    int-to-float v12, v12

    int-to-float v1, v1

    mul-float/2addr v12, v1

    invoke-static {v12}, Lt0/j;->e(F)Lt0/i;

    move-result-object v15

    invoke-static {v6, v7, v8, v15}, Landroidx/compose/foundation/a;->c(Landroidx/compose/ui/Modifier;JLi2/a1;)Landroidx/compose/ui/Modifier;

    move-result-object v6

    invoke-static/range {p0 .. p0}, Lry0/b;->h(Lp1/c1;)Z

    move-result v7

    move v15, v7

    const-wide/high16 v7, 0x3ff8000000000000L    # 1.5

    if-eqz v15, :cond_21

    double-to-float v15, v7

    move v7, v15

    const/4 v15, 0x0

    goto :goto_11

    :cond_21
    const/4 v15, 0x0

    int-to-float v7, v15

    :goto_11
    if-eqz v17, :cond_23

    invoke-virtual/range {v17 .. v17}, Lry0/c;->getBorderColor()Ly81/f;

    move-result-object v8

    if-nez v8, :cond_22

    goto :goto_13

    :cond_22
    :goto_12
    move-object/from16 v32, v4

    goto :goto_14

    :cond_23
    :goto_13
    sget-object v8, Ly81/f;->TRANSPARENT:Ly81/f;

    goto :goto_12

    :goto_14
    invoke-virtual {v8, v9, v15}, Ly81/f;->toComposableColor-WaAFU9c(Landroidx/compose/runtime/Composer;I)J

    move-result-wide v4

    invoke-static {v12}, Lt0/j;->e(F)Lt0/i;

    move-result-object v8

    invoke-static {v6, v7, v4, v5, v8}, Lge3/g;->h(Landroidx/compose/ui/Modifier;FJLi2/a1;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    const/4 v5, 0x2

    int-to-float v5, v5

    const/16 v6, 0x8

    int-to-float v12, v6

    mul-float/2addr v5, v12

    invoke-static {v4, v5, v5}, Landroidx/compose/foundation/layout/a;->q(Landroidx/compose/ui/Modifier;FF)Landroidx/compose/ui/Modifier;

    move-result-object v4

    invoke-virtual {v2}, Lry0/d;->l()Lry0/c;

    move-result-object v5

    if-nez v5, :cond_24

    sget-object v5, Lry0/c;->DEFAULT:Lry0/c;

    :cond_24
    invoke-virtual {v5}, Lry0/c;->getMinContentHeight-D9Ej5fM()F

    move-result v5

    const/4 v6, 0x0

    move/from16 v7, p4

    invoke-static {v4, v6, v5, v7}, Landroidx/compose/foundation/layout/d;->b(Landroidx/compose/ui/Modifier;FFI)Landroidx/compose/ui/Modifier;

    move-result-object v4

    sget-object v5, Lb2/e;->K:Lb2/l;

    sget-object v6, Ll0/m;->a:Ll0/e;

    const/16 v8, 0x36

    invoke-static {v6, v5, v9, v8}, Ll0/p1;->a(Ll0/i;Lb2/g;Landroidx/compose/runtime/Composer;I)Ll0/r1;

    move-result-object v5

    iget-wide v7, v9, Lp1/q;->T:J

    invoke-static {v7, v8}, Ljava/lang/Long;->hashCode(J)I

    move-result v6

    invoke-virtual {v9}, Lp1/q;->m()Lp1/p1;

    move-result-object v7

    invoke-static {v9, v4}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    sget-object v8, La3/l;->a:La3/k;

    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v15, La3/k;->b:La3/j;

    invoke-virtual {v9}, Lp1/q;->i0()V

    iget-boolean v8, v9, Lp1/q;->S:Z

    if-eqz v8, :cond_25

    invoke-virtual {v9, v15}, Lp1/q;->l(Lc93/a;)V

    goto :goto_15

    :cond_25
    invoke-virtual {v9}, Lp1/q;->s0()V

    :goto_15
    sget-object v8, La3/k;->g:La3/i;

    invoke-static {v9, v8, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v5, La3/k;->f:La3/i;

    invoke-static {v9, v5, v7}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v7, La3/k;->j:La3/i;

    move-object/from16 v33, v0

    iget-boolean v0, v9, Lp1/q;->S:Z

    if-nez v0, :cond_26

    invoke-virtual {v9}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v0

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-static {v0, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_27

    :cond_26
    invoke-static {v6, v9, v6, v7}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_27
    sget-object v0, La3/k;->d:La3/i;

    invoke-static {v9, v0, v4}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual/range {p1 .. p1}, Lry0/d;->h()Lkd1/o;

    move-result-object v2

    if-eqz v2, :cond_2d

    const v2, 0x65254466

    invoke-virtual {v9, v2}, Lp1/q;->e0(I)V

    invoke-virtual/range {p1 .. p1}, Lry0/d;->h()Lkd1/o;

    move-result-object v6

    move-object v2, v10

    const/4 v10, 0x0

    const/4 v11, 0x3

    move-object/from16 v18, v7

    const/4 v7, 0x0

    move-object/from16 v22, v8

    const/4 v8, 0x0

    move-object/from16 v38, v2

    move-object/from16 v35, v18

    move-object/from16 v34, v22

    const/4 v4, 0x1

    move-object/from16 v2, p0

    move-object/from16 p0, v15

    const/4 v15, 0x6

    invoke-static/range {v6 .. v11}, Lkd1/p;->i(Lkd1/o;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)Ln2/a;

    move-result-object v6

    const-string v7, "selectable_cell_left_image"

    invoke-static {v14, v7}, Landroidx/compose/ui/platform/a;->a(Landroidx/compose/ui/Modifier;Ljava/lang/String;)Landroidx/compose/ui/Modifier;

    move-result-object v7

    int-to-float v8, v15

    mul-float/2addr v8, v1

    invoke-static {v8, v7}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v7

    int-to-float v8, v4

    invoke-static {v7, v8, v1}, Lih0/d0;->e(Landroidx/compose/ui/Modifier;FF)Landroidx/compose/ui/Modifier;

    move-result-object v8

    invoke-virtual/range {p1 .. p1}, Lry0/d;->q()Z

    move-result v7

    if-eqz v7, :cond_28

    const v7, 0x3e4ccccd    # 0.2f

    move v11, v7

    goto :goto_16

    :cond_28
    const/high16 v11, 0x3f800000    # 1.0f

    :goto_16
    if-eqz v17, :cond_29

    invoke-virtual/range {v17 .. v17}, Lry0/c;->getIconColor()Ly81/f;

    move-result-object v7

    if-nez v7, :cond_2a

    :cond_29
    sget-object v7, Ly81/f;->WHITE_50:Ly81/f;

    :cond_2a
    invoke-virtual/range {p1 .. p1}, Lry0/d;->m()Z

    move-result v10

    if-eqz v10, :cond_2b

    invoke-virtual/range {p1 .. p1}, Lry0/d;->q()Z

    move-result v10

    if-nez v10, :cond_2b

    goto :goto_17

    :cond_2b
    move-object/from16 v7, v16

    :goto_17
    if-nez v7, :cond_2c

    const v7, 0x652f0442

    invoke-virtual {v9, v7}, Lp1/q;->e0(I)V

    const/4 v10, 0x0

    invoke-virtual {v9, v10}, Lp1/q;->q(Z)V

    move-object/from16 p4, v5

    :goto_18
    move-object v4, v14

    goto :goto_19

    :cond_2c
    const/4 v10, 0x0

    const v15, 0x652f0443

    invoke-virtual {v9, v15}, Lp1/q;->e0(I)V

    move-object/from16 p4, v5

    invoke-virtual {v7, v9, v10}, Ly81/f;->toComposableColor-WaAFU9c(Landroidx/compose/runtime/Composer;I)J

    move-result-wide v4

    new-instance v7, Li2/p;

    const/4 v15, 0x5

    invoke-direct {v7, v4, v5, v15}, Li2/p;-><init>(JI)V

    invoke-virtual {v9, v10}, Lp1/q;->q(Z)V

    move-object/from16 v16, v7

    goto :goto_18

    :goto_19
    const/16 v14, 0x6030

    const/16 v15, 0x8

    const/4 v7, 0x0

    move-object/from16 v28, v9

    const/4 v9, 0x0

    move/from16 v19, v10

    sget-object v10, Ly2/j;->a:Ly2/b1;

    move-object/from16 p3, v2

    move-object/from16 v2, p0

    move-object/from16 p0, p3

    move-object/from16 v40, v3

    move v5, v12

    move/from16 p3, v13

    move-object/from16 v12, v16

    move/from16 v3, v19

    move-object/from16 v13, v28

    invoke-static/range {v6 .. v15}, Lpf/c;->c(Ln2/a;Ljava/lang/String;Landroidx/compose/ui/Modifier;Lb2/h;Ly2/k;FLi2/y;Landroidx/compose/runtime/Composer;II)V

    move-object v9, v13

    const-wide/high16 v14, 0x3ff8000000000000L    # 1.5

    double-to-float v6, v14

    invoke-static {v6, v5, v4, v9, v3}, Lih0/d0;->v(FFLb2/t;Lp1/q;Z)V

    :goto_1a
    const/high16 v6, 0x3f800000    # 1.0f

    goto/16 :goto_20

    :cond_2d
    move-object/from16 v40, v3

    move-object/from16 p4, v5

    move-object/from16 v35, v7

    move-object/from16 v34, v8

    move-object/from16 v38, v10

    move v5, v12

    move/from16 p3, v13

    move-object v4, v14

    move-object v2, v15

    const/4 v3, 0x0

    const-wide/high16 v14, 0x3ff8000000000000L    # 1.5

    invoke-virtual/range {p1 .. p1}, Lry0/d;->g()Lgz0/m0;

    move-result-object v6

    if-eqz v6, :cond_31

    const v6, 0x6532196e

    invoke-virtual {v9, v6}, Lp1/q;->e0(I)V

    invoke-virtual/range {p1 .. p1}, Lry0/d;->g()Lgz0/m0;

    move-result-object v6

    invoke-virtual {v6}, Lgz0/m0;->toWhoopIcon()I

    move-result v6

    const/4 v7, 0x6

    invoke-static {v6, v9, v7}, Lts/o;->S(ILandroidx/compose/runtime/Composer;I)Lo2/e;

    move-result-object v6

    const-string v8, "selectable_cell_left_icon"

    invoke-static {v4, v8}, Landroidx/compose/ui/platform/a;->a(Landroidx/compose/ui/Modifier;Ljava/lang/String;)Landroidx/compose/ui/Modifier;

    move-result-object v8

    const/4 v10, 0x5

    int-to-float v10, v10

    mul-float/2addr v10, v1

    invoke-static {v10, v8}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v8

    invoke-virtual/range {p1 .. p1}, Lry0/d;->q()Z

    move-result v10

    if-eqz v10, :cond_2e

    const v10, 0x65374d19

    invoke-virtual {v9, v10}, Lp1/q;->e0(I)V

    sget-object v10, Ly81/f;->WHITE_20:Ly81/f;

    invoke-virtual {v10, v9, v7}, Ly81/f;->toComposableColor-WaAFU9c(Landroidx/compose/runtime/Composer;I)J

    move-result-wide v10

    invoke-virtual {v9, v3}, Lp1/q;->q(Z)V

    goto :goto_1b

    :cond_2e
    const v7, 0x6538c4f9

    invoke-virtual {v9, v7}, Lp1/q;->e0(I)V

    if-eqz v17, :cond_2f

    invoke-virtual/range {v17 .. v17}, Lry0/c;->getIconColor()Ly81/f;

    move-result-object v7

    if-nez v7, :cond_30

    :cond_2f
    sget-object v7, Ly81/f;->BRAND_WHITE:Ly81/f;

    :cond_30
    invoke-virtual {v7, v9, v3}, Ly81/f;->toComposableColor-WaAFU9c(Landroidx/compose/runtime/Composer;I)J

    move-result-wide v10

    invoke-virtual {v9, v3}, Lp1/q;->q(Z)V

    :goto_1b
    const/16 v12, 0x1b0

    const/4 v13, 0x0

    const/4 v7, 0x0

    move-wide/from16 v41, v10

    move-object v11, v9

    move-wide/from16 v9, v41

    invoke-static/range {v6 .. v13}, Lg1/f3;->b(Lo2/e;Ljava/lang/String;Landroidx/compose/ui/Modifier;JLandroidx/compose/runtime/Composer;II)V

    move-object v9, v11

    double-to-float v6, v14

    invoke-static {v6, v5, v4, v9, v3}, Lih0/d0;->v(FFLb2/t;Lp1/q;Z)V

    goto :goto_1a

    :cond_31
    const v6, 0x653c7ef3

    invoke-virtual {v9, v6}, Lp1/q;->e0(I)V

    invoke-virtual/range {p1 .. p1}, Lry0/d;->l()Lry0/c;

    move-result-object v6

    if-nez v6, :cond_32

    sget-object v6, Lry0/c;->DEFAULT:Lry0/c;

    :cond_32
    invoke-virtual {v6}, Lry0/c;->getMinContentHeight-D9Ej5fM()F

    move-result v6

    new-instance v7, Ly3/f;

    invoke-direct {v7, v6}, Ly3/f;-><init>(F)V

    int-to-float v8, v3

    invoke-static {v6, v8}, Ljava/lang/Float;->compare(FF)I

    move-result v6

    if-lez v6, :cond_33

    goto :goto_1c

    :cond_33
    move-object/from16 v7, v16

    :goto_1c
    if-eqz v7, :cond_34

    iget v6, v7, Ly3/f;->w:F

    goto :goto_1d

    :cond_34
    mul-float v6, v5, v1

    :goto_1d
    if-nez v11, :cond_35

    const v6, 0x653f7b0c

    invoke-virtual {v9, v6}, Lp1/q;->e0(I)V

    invoke-virtual {v9, v3}, Lp1/q;->q(Z)V

    goto :goto_1f

    :cond_35
    const v7, 0x653f7b0d

    invoke-virtual {v9, v7}, Lp1/q;->e0(I)V

    iget v7, v11, Ly3/f;->w:F

    cmpl-float v8, v7, v6

    if-lez v8, :cond_36

    goto :goto_1e

    :cond_36
    move v6, v7

    :goto_1e
    invoke-static {v4, v6, v9, v3}, Lq63/c;->u(Lb2/t;FLp1/q;Z)V

    :goto_1f
    invoke-virtual {v9, v3}, Lp1/q;->q(Z)V

    goto/16 :goto_1a

    :goto_20
    float-to-double v7, v6

    const-wide/16 v10, 0x0

    cmpl-double v7, v7, v10

    if-lez v7, :cond_37

    goto :goto_21

    :cond_37
    const-string v7, "invalid weight; must be greater than zero"

    invoke-static {v7}, Lm0/a;->a(Ljava/lang/String;)V

    :goto_21
    new-instance v7, Landroidx/compose/foundation/layout/LayoutWeightElement;

    const/4 v8, 0x1

    invoke-direct {v7, v6, v8}, Landroidx/compose/foundation/layout/LayoutWeightElement;-><init>(FZ)V

    sget-object v6, Ll0/m;->e:Ll0/h;

    sget-object v8, Lb2/e;->M:Lb2/k;

    const/4 v10, 0x6

    invoke-static {v6, v8, v9, v10}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v6

    iget-wide v10, v9, Lp1/q;->T:J

    invoke-static {v10, v11}, Ljava/lang/Long;->hashCode(J)I

    move-result v8

    invoke-virtual {v9}, Lp1/q;->m()Lp1/p1;

    move-result-object v10

    invoke-static {v9, v7}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v7

    invoke-virtual {v9}, Lp1/q;->i0()V

    iget-boolean v11, v9, Lp1/q;->S:Z

    if-eqz v11, :cond_38

    invoke-virtual {v9, v2}, Lp1/q;->l(Lc93/a;)V

    :goto_22
    move-object/from16 v2, v34

    goto :goto_23

    :cond_38
    invoke-virtual {v9}, Lp1/q;->s0()V

    goto :goto_22

    :goto_23
    invoke-static {v9, v2, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    move-object/from16 v2, p4

    invoke-static {v9, v2, v10}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v2, v9, Lp1/q;->S:Z

    if-nez v2, :cond_39

    invoke-virtual {v9}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-static {v2, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_3a

    :cond_39
    move-object/from16 v2, v35

    invoke-static {v8, v9, v8, v2}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_3a
    invoke-static {v9, v0, v7}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual/range {p1 .. p1}, Lry0/d;->p()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0, v9, v3}, Lcom/whoop/design/util/b;->i(Ljava/lang/CharSequence;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v6

    sget-object v0, Lx81/d;->a:Lx81/d;

    const/4 v10, 0x6

    invoke-virtual {v0, v9, v10}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v2

    invoke-virtual {v2}, Lb91/d;->a()Lb91/a;

    move-result-object v26

    invoke-virtual/range {p1 .. p1}, Lry0/d;->q()Z

    move-result v2

    if-eqz v2, :cond_3b

    const v2, 0x1ba0138c

    invoke-virtual {v9, v2}, Lp1/q;->e0(I)V

    invoke-virtual {v0, v9, v10}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v2

    invoke-virtual {v2}, Ly81/i;->X0()J

    move-result-wide v7

    :goto_24
    invoke-virtual {v9, v3}, Lp1/q;->q(Z)V

    goto :goto_25

    :cond_3b
    const v2, 0x1ba0176f

    invoke-static {v9, v2, v0, v9, v10}, Lm4/a;->B(Lp1/q;ILx81/d;Lp1/q;I)J

    move-result-wide v7

    goto :goto_24

    :goto_25
    const/16 v30, 0x0

    const v31, 0x2fffa

    move-object/from16 v28, v9

    move-wide v8, v7

    const/4 v7, 0x0

    const-wide/16 v10, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    move-wide/from16 v20, v14

    const/4 v14, 0x0

    const-wide/16 v15, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    move-wide/from16 v36, v20

    const-wide/16 v19, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v27, 0x0

    const/16 v29, 0x0

    invoke-static/range {v6 .. v31}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v9, v28

    invoke-virtual/range {p1 .. p1}, Lry0/d;->o()Ljava/lang/String;

    move-result-object v2

    if-nez v2, :cond_3c

    const v1, 0x5863cd1d

    invoke-virtual {v9, v1}, Lp1/q;->e0(I)V

    invoke-virtual {v9, v3}, Lp1/q;->q(Z)V

    :goto_26
    const/4 v7, 0x1

    goto :goto_29

    :cond_3c
    const v6, 0x5863cd1e

    invoke-virtual {v9, v6}, Lp1/q;->e0(I)V

    const-wide/high16 v6, 0x3fe0000000000000L    # 0.5

    double-to-float v6, v6

    invoke-static {v6, v1, v4, v9}, Ld;->w(FFLb2/t;Lp1/q;)V

    invoke-static {v2, v9, v3}, Lcom/whoop/design/util/b;->i(Ljava/lang/CharSequence;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v6

    const/4 v10, 0x6

    invoke-virtual {v0, v9, v10}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v1

    invoke-virtual {v1}, Lb91/d;->c()Lb91/a;

    move-result-object v26

    invoke-virtual/range {p1 .. p1}, Lry0/d;->q()Z

    move-result v1

    if-eqz v1, :cond_3d

    const v1, -0x18635ef2

    invoke-virtual {v9, v1}, Lp1/q;->e0(I)V

    invoke-virtual {v0, v9, v10}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v1

    invoke-virtual {v1}, Ly81/i;->X0()J

    move-result-wide v1

    :goto_27
    invoke-virtual {v9, v3}, Lp1/q;->q(Z)V

    goto :goto_28

    :cond_3d
    const v1, -0x18635b12

    invoke-static {v9, v1, v0, v9, v10}, Lm4/a;->c(Lp1/q;ILx81/d;Lp1/q;I)J

    move-result-wide v1

    goto :goto_27

    :goto_28
    const/16 v30, 0x0

    const v31, 0x2fffa

    const/4 v7, 0x0

    const-wide/16 v10, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const-wide/16 v15, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const-wide/16 v19, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v27, 0x0

    const/16 v29, 0x0

    move-object/from16 v28, v9

    move-wide v8, v1

    invoke-static/range {v6 .. v31}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v9, v28

    invoke-virtual {v9, v3}, Lp1/q;->q(Z)V

    goto :goto_26

    :goto_29
    invoke-virtual {v9, v7}, Lp1/q;->q(Z)V

    invoke-virtual/range {p1 .. p1}, Lry0/d;->n()Z

    move-result v1

    if-eqz v1, :cond_41

    const v1, 0x654da3a1

    invoke-virtual {v9, v1}, Lp1/q;->e0(I)V

    const-wide/high16 v14, 0x3ff8000000000000L    # 1.5

    double-to-float v1, v14

    mul-float/2addr v1, v5

    invoke-static {v1, v4}, Landroidx/compose/foundation/layout/d;->u(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    invoke-static {v9, v1}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    invoke-virtual/range {p1 .. p1}, Lry0/d;->l()Lry0/c;

    move-result-object v1

    if-nez v1, :cond_3e

    sget-object v1, Lry0/c;->DEFAULT:Lry0/c;

    :cond_3e
    invoke-virtual {v1}, Lry0/c;->getBorderColor()Ly81/f;

    move-result-object v1

    invoke-virtual {v1, v9, v3}, Ly81/f;->toComposableColor-WaAFU9c(Landroidx/compose/runtime/Composer;I)J

    move-result-wide v6

    invoke-static/range {p0 .. p0}, Lry0/b;->h(Lp1/c1;)Z

    move-result v1

    invoke-virtual/range {p1 .. p1}, Lry0/d;->q()Z

    move-result v2

    const/16 v39, 0x1

    xor-int/lit8 v2, v2, 0x1

    const/4 v10, 0x6

    invoke-virtual {v0, v9, v10}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v4

    invoke-virtual {v4}, Ly81/i;->w()J

    move-result-wide v4

    invoke-virtual {v0, v9, v10}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v0

    invoke-virtual {v0}, Ly81/i;->Z0()J

    move-result-wide v10

    const/4 v15, 0x0

    const/16 v16, 0x18

    const-wide/16 v12, 0x0

    move-object v14, v9

    move-wide v8, v10

    move-wide v10, v4

    invoke-static/range {v6 .. v16}, Ldp/d;->r(JJJJLandroidx/compose/runtime/Composer;II)Lg1/r1;

    move-result-object v11

    move-object v9, v14

    move-object/from16 v6, v40

    invoke-virtual {v9, v6}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v0

    invoke-virtual {v9}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    if-nez v0, :cond_3f

    move-object/from16 v0, v38

    if-ne v4, v0, :cond_40

    :cond_3f
    new-instance v4, Lpy0/a;

    const/16 v0, 0x13

    invoke-direct {v4, v6, v0}, Lpy0/a;-><init>(Lc93/a;I)V

    invoke-virtual {v9, v4}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_40
    move-object v8, v4

    check-cast v8, Lkotlin/jvm/functions/Function1;

    const/16 v16, 0x0

    const/16 v17, 0x1d1

    const/4 v6, 0x0

    const/4 v10, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    move v7, v1

    move-object v15, v9

    move v9, v2

    invoke-static/range {v6 .. v17}, Lsy0/h;->c(Landroidx/compose/ui/Modifier;ZLkotlin/jvm/functions/Function1;ZLj0/i;Lg1/a1;Ly71/g;FFLandroidx/compose/runtime/Composer;II)V

    move-object v9, v15

    invoke-virtual {v9, v3}, Lp1/q;->q(Z)V

    :goto_2a
    const/4 v7, 0x1

    goto :goto_2b

    :cond_41
    const v0, 0x6556d193

    invoke-virtual {v9, v0}, Lp1/q;->e0(I)V

    invoke-virtual {v9, v3}, Lp1/q;->q(Z)V

    goto :goto_2a

    :goto_2b
    invoke-virtual {v9, v7}, Lp1/q;->q(Z)V

    move/from16 v4, p3

    move-object/from16 v1, v32

    move-object/from16 v3, v33

    goto :goto_2c

    :cond_42
    invoke-virtual {v9}, Lp1/q;->X()V

    move-object/from16 v3, p2

    move-object v1, v4

    move v4, v11

    :goto_2c
    invoke-virtual {v9}, Lp1/q;->u()Lp1/v1;

    move-result-object v7

    if-eqz v7, :cond_43

    new-instance v0, Law0/h;

    move-object/from16 v2, p1

    move/from16 v5, p5

    move/from16 v6, p6

    invoke-direct/range {v0 .. v6}, Law0/h;-><init>(Landroidx/compose/ui/Modifier;Lry0/d;Lc93/a;ZII)V

    iput-object v0, v7, Lp1/v1;->d:Lc93/m;

    :cond_43
    return-void
.end method

.method private static final g()Ll83/a0;
    .locals 1

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method

.method private static final h(Lp1/c1;)Z
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

.method private static final i(Lp1/c1;Z)V
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

.method private static final j(Lc93/a;ZLp1/c1;)Ll83/a0;
    .locals 0

    invoke-interface {p0}, Lc93/a;->invoke()Ljava/lang/Object;

    if-nez p1, :cond_0

    invoke-static {p2}, Lry0/b;->h(Lp1/c1;)Z

    move-result p0

    xor-int/lit8 p0, p0, 0x1

    invoke-static {p2, p0}, Lry0/b;->i(Lp1/c1;Z)V

    :cond_0
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final k(Lc93/a;)Ll83/a0;
    .locals 0

    invoke-interface {p0}, Lc93/a;->invoke()Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final l(Lc93/a;Z)Ll83/a0;
    .locals 0

    invoke-interface {p0}, Lc93/a;->invoke()Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final m(Landroidx/compose/ui/Modifier;Lry0/d;Lc93/a;ZIILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 7

    or-int/lit8 p4, p4, 0x1

    invoke-static {p4}, Lp1/x;->L(I)I

    move-result v5

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move v3, p3

    move v6, p5

    move-object v4, p6

    invoke-static/range {v0 .. v6}, Lry0/b;->f(Landroidx/compose/ui/Modifier;Lry0/d;Lc93/a;ZLandroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method
