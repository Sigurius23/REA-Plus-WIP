.class public abstract Lcom/whoop/design/atomic/organism/toolbar/c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u001aK\u0010\t\u001a\u00020\u00062\u0008\u0008\u0002\u0010\u0001\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u000e\u0008\u0002\u0010\u0007\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u00052\u000e\u0008\u0002\u0010\u0008\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u0005H\u0001\u00a2\u0006\u0004\u0008\t\u0010\n\u00a8\u0006\u000b"
    }
    d2 = {
        "Landroidx/compose/ui/Modifier;",
        "modifier",
        "titleColumnModifier",
        "Lcom/whoop/design/atomic/organism/toolbar/d$c;",
        "state",
        "Lkotlin/Function0;",
        "Ll83/a0;",
        "onLeftButtonClick",
        "onRightButtonClick",
        "d",
        "(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/Modifier;Lcom/whoop/design/atomic/organism/toolbar/d$c;Lc93/a;Lc93/a;Landroidx/compose/runtime/Composer;II)V",
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
.method public static synthetic a(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/Modifier;Lcom/whoop/design/atomic/organism/toolbar/d$c;Lc93/a;Lc93/a;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p8}, Lcom/whoop/design/atomic/organism/toolbar/c;->g(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/Modifier;Lcom/whoop/design/atomic/organism/toolbar/d$c;Lc93/a;Lc93/a;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b()Ll83/a0;
    .locals 1

    invoke-static {}, Lcom/whoop/design/atomic/organism/toolbar/c;->e()Ll83/a0;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic c()Ll83/a0;
    .locals 1

    invoke-static {}, Lcom/whoop/design/atomic/organism/toolbar/c;->f()Ll83/a0;

    move-result-object v0

    return-object v0
.end method

.method public static final d(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/Modifier;Lcom/whoop/design/atomic/organism/toolbar/d$c;Lc93/a;Lc93/a;Landroidx/compose/runtime/Composer;II)V
    .locals 45
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/ui/Modifier;",
            "Landroidx/compose/ui/Modifier;",
            "Lcom/whoop/design/atomic/organism/toolbar/d$c;",
            "Lc93/a;",
            "Lc93/a;",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    move-object/from16 v3, p2

    move/from16 v6, p6

    const-string v0, "state"

    invoke-static {v3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v12, p5

    check-cast v12, Lp1/q;

    const v0, -0x29161f17

    invoke-virtual {v12, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, p7, 0x1

    const/4 v1, 0x4

    const/4 v2, 0x2

    if-eqz v0, :cond_0

    or-int/lit8 v4, v6, 0x6

    move v5, v4

    move-object/from16 v4, p0

    goto :goto_1

    :cond_0
    and-int/lit8 v4, v6, 0x6

    if-nez v4, :cond_2

    move-object/from16 v4, p0

    invoke-virtual {v12, v4}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_1

    move v5, v1

    goto :goto_0

    :cond_1
    move v5, v2

    :goto_0
    or-int/2addr v5, v6

    goto :goto_1

    :cond_2
    move-object/from16 v4, p0

    move v5, v6

    :goto_1
    and-int/lit8 v7, p7, 0x2

    if-eqz v7, :cond_4

    or-int/lit8 v5, v5, 0x30

    :cond_3
    move-object/from16 v8, p1

    goto :goto_3

    :cond_4
    and-int/lit8 v8, v6, 0x30

    if-nez v8, :cond_3

    move-object/from16 v8, p1

    invoke-virtual {v12, v8}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_5

    const/16 v9, 0x20

    goto :goto_2

    :cond_5
    const/16 v9, 0x10

    :goto_2
    or-int/2addr v5, v9

    :goto_3
    and-int/lit16 v9, v6, 0x180

    if-nez v9, :cond_7

    invoke-virtual {v12, v3}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_6

    const/16 v9, 0x100

    goto :goto_4

    :cond_6
    const/16 v9, 0x80

    :goto_4
    or-int/2addr v5, v9

    :cond_7
    and-int/lit8 v9, p7, 0x8

    if-eqz v9, :cond_9

    or-int/lit16 v5, v5, 0xc00

    :cond_8
    move-object/from16 v10, p3

    goto :goto_6

    :cond_9
    and-int/lit16 v10, v6, 0xc00

    if-nez v10, :cond_8

    move-object/from16 v10, p3

    invoke-virtual {v12, v10}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_a

    const/16 v11, 0x800

    goto :goto_5

    :cond_a
    const/16 v11, 0x400

    :goto_5
    or-int/2addr v5, v11

    :goto_6
    and-int/lit8 v11, p7, 0x10

    if-eqz v11, :cond_c

    or-int/lit16 v5, v5, 0x6000

    :cond_b
    move-object/from16 v13, p4

    goto :goto_8

    :cond_c
    and-int/lit16 v13, v6, 0x6000

    if-nez v13, :cond_b

    move-object/from16 v13, p4

    invoke-virtual {v12, v13}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v14

    if-eqz v14, :cond_d

    const/16 v14, 0x4000

    goto :goto_7

    :cond_d
    const/16 v14, 0x2000

    :goto_7
    or-int/2addr v5, v14

    :goto_8
    and-int/lit16 v14, v5, 0x2493

    const/16 v15, 0x2492

    if-eq v14, v15, :cond_e

    const/4 v14, 0x1

    goto :goto_9

    :cond_e
    const/4 v14, 0x0

    :goto_9
    and-int/lit8 v15, v5, 0x1

    invoke-virtual {v12, v15, v14}, Lp1/q;->U(IZ)Z

    move-result v14

    if-eqz v14, :cond_25

    sget-object v15, Lb2/t;->w:Lb2/t;

    if-eqz v0, :cond_f

    move-object v4, v15

    :cond_f
    if-eqz v7, :cond_10

    move-object v0, v15

    goto :goto_a

    :cond_10
    move-object v0, v8

    :goto_a
    sget-object v7, Lp1/l;->a:Lp1/v0;

    if-eqz v9, :cond_12

    invoke-virtual {v12}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v8

    if-ne v8, v7, :cond_11

    new-instance v8, Lnx1/a;

    const/16 v9, 0xf

    invoke-direct {v8, v9}, Lnx1/a;-><init>(I)V

    invoke-virtual {v12, v8}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_11
    check-cast v8, Lc93/a;

    move/from16 v43, v11

    move-object v11, v8

    move/from16 v8, v43

    goto :goto_b

    :cond_12
    move v8, v11

    move-object/from16 v11, p3

    :goto_b
    if-eqz v8, :cond_14

    invoke-virtual {v12}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v8

    if-ne v8, v7, :cond_13

    new-instance v8, Lnx1/a;

    const/16 v7, 0x10

    invoke-direct {v8, v7}, Lnx1/a;-><init>(I)V

    invoke-virtual {v12, v8}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_13
    move-object v7, v8

    check-cast v7, Lc93/a;

    move-object/from16 v33, v7

    goto :goto_c

    :cond_14
    move-object/from16 v33, v13

    :goto_c
    const/high16 v7, 0x3f800000    # 1.0f

    invoke-static {v7, v15}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v8

    sget-object v9, Ll0/a1;->x:Ll0/a1;

    invoke-static {v8, v9}, Landroidx/compose/foundation/layout/a;->j(Landroidx/compose/ui/Modifier;Ll0/a1;)Landroidx/compose/ui/Modifier;

    move-result-object v8

    const-wide/high16 v13, 0x3ff8000000000000L    # 1.5

    double-to-float v9, v13

    int-to-float v1, v1

    mul-float/2addr v9, v1

    const/4 v13, 0x0

    invoke-static {v8, v9, v13, v2}, Landroidx/compose/foundation/layout/a;->r(Landroidx/compose/ui/Modifier;FFI)Landroidx/compose/ui/Modifier;

    move-result-object v2

    invoke-interface {v2, v4}, Landroidx/compose/ui/Modifier;->e(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    sget-object v8, Ll0/m;->g:Ll0/h;

    sget-object v9, Lb2/e;->J:Lb2/l;

    const/4 v13, 0x6

    invoke-static {v8, v9, v12, v13}, Ll0/p1;->a(Ll0/i;Lb2/g;Landroidx/compose/runtime/Composer;I)Ll0/r1;

    move-result-object v8

    move-object/from16 p0, v11

    iget-wide v10, v12, Lp1/q;->T:J

    invoke-static {v10, v11}, Ljava/lang/Long;->hashCode(J)I

    move-result v10

    invoke-virtual {v12}, Lp1/q;->m()Lp1/p1;

    move-result-object v11

    invoke-static {v12, v2}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    sget-object v16, La3/l;->a:La3/k;

    invoke-virtual/range {v16 .. v16}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v14, La3/k;->b:La3/j;

    invoke-virtual {v12}, Lp1/q;->i0()V

    iget-boolean v7, v12, Lp1/q;->S:Z

    if-eqz v7, :cond_15

    invoke-virtual {v12, v14}, Lp1/q;->l(Lc93/a;)V

    goto :goto_d

    :cond_15
    invoke-virtual {v12}, Lp1/q;->s0()V

    :goto_d
    sget-object v7, La3/k;->g:La3/i;

    invoke-static {v12, v7, v8}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v8, La3/k;->f:La3/i;

    invoke-static {v12, v8, v11}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v11, La3/k;->j:La3/i;

    iget-boolean v13, v12, Lp1/q;->S:Z

    if-nez v13, :cond_16

    invoke-virtual {v12}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v13

    move/from16 v34, v1

    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-static {v13, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_17

    goto :goto_e

    :cond_16
    move/from16 v34, v1

    :goto_e
    invoke-static {v10, v12, v10, v11}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_17
    sget-object v1, La3/k;->d:La3/i;

    invoke-static {v12, v1, v2}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual {v3}, Lcom/whoop/design/atomic/organism/toolbar/d$c;->h()Ljava/lang/Integer;

    move-result-object v2

    const v35, 0xe000

    if-eqz v2, :cond_18

    const v2, 0x3610d4e5

    invoke-virtual {v12, v2}, Lp1/q;->e0(I)V

    invoke-static {}, Lcom/whoop/design/atomic/organism/toolbar/b;->h()F

    move-result v2

    invoke-static {v2, v15}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    new-instance v16, Lny0/o;

    invoke-virtual {v3}, Lcom/whoop/design/atomic/organism/toolbar/d$c;->i()Lny0/q;

    move-result-object v17

    invoke-virtual {v3}, Lcom/whoop/design/atomic/organism/toolbar/d$c;->h()Ljava/lang/Integer;

    move-result-object v10

    invoke-virtual {v10}, Ljava/lang/Integer;->intValue()I

    move-result v18

    const/16 v27, 0x3fc

    const/16 v28, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    invoke-direct/range {v16 .. v28}, Lny0/o;-><init>(Lny0/q;ILy81/e;Ly81/e;Ly81/e;ZZZFZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object v10, v8

    invoke-virtual {v3}, Lcom/whoop/design/atomic/organism/toolbar/d$c;->d()Ljava/lang/String;

    move-result-object v8

    shl-int/lit8 v13, v5, 0x3

    and-int v13, v13, v35

    or-int/lit16 v13, v13, 0x180

    move-object/from16 v17, v14

    const/16 v14, 0x8

    move-object/from16 v18, v10

    const/4 v10, 0x0

    move-object/from16 p1, v9

    move-object v9, v2

    move-object/from16 v2, p1

    move-object/from16 p1, v0

    move-object/from16 p4, v1

    move/from16 p5, v5

    move-object v6, v11

    move-object/from16 v3, v17

    move-object/from16 v5, v18

    const/4 v0, 0x0

    const/4 v1, 0x1

    move-object/from16 v11, p0

    move-object/from16 p0, v4

    move-object v4, v7

    move-object/from16 v7, v16

    invoke-static/range {v7 .. v14}, Lny0/b1;->d(Lny0/o;Ljava/lang/String;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/Modifier;Lc93/a;Landroidx/compose/runtime/Composer;II)V

    move-object/from16 v37, v11

    invoke-virtual {v12, v0}, Lp1/q;->q(Z)V

    :goto_f
    const/high16 v7, 0x3f800000    # 1.0f

    goto :goto_10

    :cond_18
    move-object/from16 v37, p0

    move-object/from16 p1, v0

    move-object/from16 p4, v1

    move-object/from16 p0, v4

    move/from16 p5, v5

    move-object v4, v7

    move-object v5, v8

    move-object v2, v9

    move-object v6, v11

    move-object v3, v14

    const/4 v0, 0x0

    const/4 v1, 0x1

    const v7, 0x361591e4

    invoke-virtual {v12, v7}, Lp1/q;->e0(I)V

    invoke-static {}, Lcom/whoop/design/atomic/organism/toolbar/b;->h()F

    move-result v7

    invoke-static {v7, v15}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v7

    invoke-static {v12, v7}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    invoke-virtual {v12, v0}, Lp1/q;->q(Z)V

    goto :goto_f

    :goto_10
    float-to-double v8, v7

    const-wide/16 v10, 0x0

    cmpl-double v8, v8, v10

    if-lez v8, :cond_19

    goto :goto_11

    :cond_19
    const-string v8, "invalid weight; must be greater than zero"

    invoke-static {v8}, Lm0/a;->a(Ljava/lang/String;)V

    :goto_11
    new-instance v8, Landroidx/compose/foundation/layout/LayoutWeightElement;

    invoke-direct {v8, v7, v1}, Landroidx/compose/foundation/layout/LayoutWeightElement;-><init>(FZ)V

    sget-object v7, Ll0/m;->a:Ll0/e;

    const/16 v9, 0x36

    invoke-static {v7, v2, v12, v9}, Ll0/p1;->a(Ll0/i;Lb2/g;Landroidx/compose/runtime/Composer;I)Ll0/r1;

    move-result-object v2

    iget-wide v10, v12, Lp1/q;->T:J

    invoke-static {v10, v11}, Ljava/lang/Long;->hashCode(J)I

    move-result v7

    invoke-virtual {v12}, Lp1/q;->m()Lp1/p1;

    move-result-object v10

    invoke-static {v12, v8}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v8

    invoke-virtual {v12}, Lp1/q;->i0()V

    iget-boolean v11, v12, Lp1/q;->S:Z

    if-eqz v11, :cond_1a

    invoke-virtual {v12, v3}, Lp1/q;->l(Lc93/a;)V

    goto :goto_12

    :cond_1a
    invoke-virtual {v12}, Lp1/q;->s0()V

    :goto_12
    invoke-static {v12, v4, v2}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v12, v5, v10}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v2, v12, Lp1/q;->S:Z

    if-nez v2, :cond_1c

    invoke-virtual {v12}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    invoke-static {v2, v10}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_1b

    goto :goto_14

    :cond_1b
    :goto_13
    move-object/from16 v2, p4

    goto :goto_15

    :cond_1c
    :goto_14
    invoke-static {v7, v12, v7, v6}, Ld;->y(ILp1/q;ILa3/i;)V

    goto :goto_13

    :goto_15
    invoke-static {v12, v2, v8}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual/range {p2 .. p2}, Lcom/whoop/design/atomic/organism/toolbar/d$c;->f()Lcom/whoop/design/util/TextResource;

    move-result-object v7

    invoke-static {v7, v12, v0}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v7

    invoke-virtual/range {p2 .. p2}, Lcom/whoop/design/atomic/organism/toolbar/d$c;->m()Lcom/whoop/design/util/TextResource;

    move-result-object v8

    invoke-static {v8, v12, v0}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v38

    invoke-virtual/range {p2 .. p2}, Lcom/whoop/design/atomic/organism/toolbar/d$c;->l()Lcom/whoop/design/util/TextResource;

    move-result-object v8

    invoke-static {v8, v12, v0}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v39

    invoke-virtual {v7}, Ljava/lang/String;->length()I

    move-result v8

    const/16 v10, 0x8

    if-lez v8, :cond_1d

    const v8, -0x23960521

    invoke-virtual {v12, v8}, Lp1/q;->e0(I)V

    int-to-float v8, v1

    int-to-float v11, v10

    mul-float v16, v8, v11

    const/16 v19, 0x0

    const/16 v20, 0xe

    const/16 v17, 0x0

    const/16 v18, 0x0

    invoke-static/range {v15 .. v20}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v8

    move-object/from16 v40, v15

    sget-object v11, Lx81/d;->a:Lx81/d;

    const/4 v13, 0x6

    invoke-virtual {v11, v12, v13}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v14

    invoke-virtual {v14}, Ly81/i;->y()J

    move-result-wide v14

    invoke-virtual {v11, v12, v13}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v11

    invoke-virtual {v11}, Lb91/d;->y()Lb91/a;

    move-result-object v27

    const/16 v31, 0x0

    const v32, 0x2fff8

    move-object/from16 v29, v12

    const-wide/16 v11, 0x0

    move/from16 v36, v13

    const/4 v13, 0x0

    move/from16 v16, v9

    move-wide/from16 v43, v14

    move v15, v10

    move-wide/from16 v9, v43

    const/4 v14, 0x0

    move/from16 v17, v15

    const/4 v15, 0x0

    move/from16 v19, v16

    move/from16 v18, v17

    const-wide/16 v16, 0x0

    move/from16 v20, v18

    const/16 v18, 0x0

    move/from16 v21, v19

    const/16 v19, 0x0

    move/from16 v22, v20

    move/from16 v23, v21

    const-wide/16 v20, 0x0

    move/from16 v24, v22

    const/16 v22, 0x0

    move/from16 v25, v23

    const/16 v23, 0x0

    move/from16 v26, v24

    const/16 v24, 0x0

    move/from16 v28, v25

    const/16 v25, 0x0

    move/from16 v30, v26

    const/16 v26, 0x0

    move/from16 v41, v28

    const/16 v28, 0x0

    move/from16 v42, v30

    const/16 v30, 0x30

    invoke-static/range {v7 .. v32}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v12, v29

    invoke-virtual {v12, v0}, Lp1/q;->q(Z)V

    goto :goto_16

    :cond_1d
    move-object/from16 v40, v15

    const v7, -0x2392008f

    invoke-virtual {v12, v7}, Lp1/q;->e0(I)V

    invoke-virtual {v12, v0}, Lp1/q;->q(Z)V

    :goto_16
    invoke-virtual/range {p2 .. p2}, Lcom/whoop/design/atomic/organism/toolbar/d$c;->g()Lkd1/o;

    move-result-object v7

    if-nez v7, :cond_1e

    const v7, -0x23915917

    invoke-virtual {v12, v7}, Lp1/q;->e0(I)V

    invoke-virtual {v12, v0}, Lp1/q;->q(Z)V

    const/4 v15, 0x6

    goto :goto_17

    :cond_1e
    const v8, -0x23915916

    invoke-virtual {v12, v8}, Lp1/q;->e0(I)V

    const/4 v11, 0x0

    move-object/from16 v29, v12

    const/4 v12, 0x3

    const/4 v8, 0x0

    const/4 v9, 0x0

    move-object/from16 v10, v29

    invoke-static/range {v7 .. v12}, Lkd1/p;->i(Lkd1/o;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)Ln2/a;

    move-result-object v7

    move-object v12, v10

    invoke-virtual/range {p2 .. p2}, Lcom/whoop/design/atomic/organism/toolbar/d$c;->c()Ljava/lang/String;

    move-result-object v8

    int-to-float v9, v1

    const/16 v10, 0x8

    int-to-float v11, v10

    mul-float v16, v9, v11

    const/16 v18, 0x0

    const/16 v20, 0x4

    move/from16 v17, v16

    move/from16 v19, v16

    move-object/from16 v15, v40

    invoke-static/range {v15 .. v20}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v9

    mul-float v11, v11, v34

    invoke-static {v11, v9}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v9

    sget-object v11, Lx81/d;->a:Lx81/d;

    const/4 v13, 0x6

    invoke-virtual {v11, v12, v13}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v11

    invoke-virtual {v11}, Ly81/i;->y()J

    move-result-wide v16

    move/from16 v36, v13

    const/16 v13, 0x180

    const/4 v14, 0x0

    move-wide/from16 v10, v16

    move/from16 v15, v36

    invoke-static/range {v7 .. v14}, Lg1/f3;->a(Ln2/a;Ljava/lang/String;Landroidx/compose/ui/Modifier;JLandroidx/compose/runtime/Composer;II)V

    invoke-virtual {v12, v0}, Lp1/q;->q(Z)V

    :goto_17
    invoke-virtual/range {v38 .. v38}, Ljava/lang/String;->length()I

    move-result v7

    if-lez v7, :cond_23

    const v7, -0x2389e95f    # -2.770709E17f

    invoke-virtual {v12, v7}, Lp1/q;->e0(I)V

    int-to-float v7, v1

    const/16 v10, 0x8

    int-to-float v8, v10

    mul-float/2addr v7, v8

    move-object/from16 v8, p1

    invoke-static {v7, v8}, Landroidx/compose/foundation/layout/a;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v7

    const/high16 v9, 0x3f800000    # 1.0f

    invoke-static {v9, v7}, Landroidx/compose/foundation/layout/d;->c(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v7

    sget-object v9, Lb2/e;->M:Lb2/k;

    sget-object v10, Ll0/m;->e:Ll0/h;

    const/16 v11, 0x36

    invoke-static {v10, v9, v12, v11}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v9

    iget-wide v10, v12, Lp1/q;->T:J

    invoke-static {v10, v11}, Ljava/lang/Long;->hashCode(J)I

    move-result v10

    invoke-virtual {v12}, Lp1/q;->m()Lp1/p1;

    move-result-object v11

    invoke-static {v12, v7}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v7

    invoke-virtual {v12}, Lp1/q;->i0()V

    iget-boolean v13, v12, Lp1/q;->S:Z

    if-eqz v13, :cond_1f

    invoke-virtual {v12, v3}, Lp1/q;->l(Lc93/a;)V

    goto :goto_18

    :cond_1f
    invoke-virtual {v12}, Lp1/q;->s0()V

    :goto_18
    invoke-static {v12, v4, v9}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v12, v5, v11}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v3, v12, Lp1/q;->S:Z

    if-nez v3, :cond_20

    invoke-virtual {v12}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-static {v3, v4}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_21

    :cond_20
    invoke-static {v10, v12, v10, v6}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_21
    invoke-static {v12, v2, v7}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v2, Lx81/d;->a:Lx81/d;

    invoke-virtual {v2, v12, v15}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v3

    invoke-virtual {v3}, Ly81/i;->y()J

    move-result-wide v9

    invoke-virtual {v2, v12, v15}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v3

    invoke-virtual {v3}, Lb91/d;->r()Lb91/a;

    move-result-object v27

    const/16 v31, 0x0

    const v32, 0x2fffa

    move-object v3, v8

    const/4 v8, 0x0

    move-object/from16 v29, v12

    const-wide/16 v11, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    move/from16 v36, v15

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

    const/16 v30, 0x0

    move/from16 v5, v36

    move-object/from16 v7, v38

    move-object/from16 v4, v40

    invoke-static/range {v7 .. v32}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v12, v29

    invoke-virtual/range {v39 .. v39}, Ljava/lang/String;->length()I

    move-result v6

    if-lez v6, :cond_22

    const v6, -0x101e2074

    invoke-static {v12, v6, v2, v12, v5}, Lr80/c;->c(Lp1/q;ILx81/d;Lp1/q;I)J

    move-result-wide v9

    invoke-virtual {v2, v12, v5}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v2

    invoke-virtual {v2}, Lb91/d;->d()Lb91/a;

    move-result-object v27

    const/16 v31, 0x0

    const v32, 0x2fffa

    const/4 v8, 0x0

    move-object/from16 v29, v12

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

    const/16 v30, 0x0

    move-object/from16 v7, v39

    invoke-static/range {v7 .. v32}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v12, v29

    invoke-virtual {v12, v0}, Lp1/q;->q(Z)V

    goto :goto_19

    :cond_22
    const v2, -0x101a6ab7

    invoke-virtual {v12, v2}, Lp1/q;->e0(I)V

    invoke-virtual {v12, v0}, Lp1/q;->q(Z)V

    :goto_19
    invoke-virtual {v12, v1}, Lp1/q;->q(Z)V

    invoke-virtual {v12, v0}, Lp1/q;->q(Z)V

    goto :goto_1a

    :cond_23
    move-object/from16 v3, p1

    move-object/from16 v4, v40

    const v2, -0x237dbbef

    invoke-virtual {v12, v2}, Lp1/q;->e0(I)V

    invoke-virtual {v12, v0}, Lp1/q;->q(Z)V

    :goto_1a
    invoke-virtual {v12, v1}, Lp1/q;->q(Z)V

    invoke-virtual/range {p2 .. p2}, Lcom/whoop/design/atomic/organism/toolbar/d$c;->j()Ljava/lang/Integer;

    move-result-object v2

    if-eqz v2, :cond_24

    const v2, 0x3635c081

    invoke-virtual {v12, v2}, Lp1/q;->e0(I)V

    invoke-static {}, Lcom/whoop/design/atomic/organism/toolbar/b;->h()F

    move-result v2

    invoke-static {v2, v4}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v9

    new-instance v13, Lny0/o;

    invoke-virtual/range {p2 .. p2}, Lcom/whoop/design/atomic/organism/toolbar/d$c;->k()Lny0/q;

    move-result-object v14

    invoke-virtual/range {p2 .. p2}, Lcom/whoop/design/atomic/organism/toolbar/d$c;->j()Ljava/lang/Integer;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I

    move-result v15

    const/16 v24, 0x3fc

    const/16 v25, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    invoke-direct/range {v13 .. v25}, Lny0/o;-><init>(Lny0/q;ILy81/e;Ly81/e;Ly81/e;ZZZFZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual/range {p2 .. p2}, Lcom/whoop/design/atomic/organism/toolbar/d$c;->e()Ljava/lang/String;

    move-result-object v8

    and-int v2, p5, v35

    or-int/lit16 v2, v2, 0x180

    const/16 v14, 0x8

    const/4 v10, 0x0

    move-object v7, v13

    move-object/from16 v11, v33

    move v13, v2

    invoke-static/range {v7 .. v14}, Lny0/b1;->d(Lny0/o;Ljava/lang/String;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/Modifier;Lc93/a;Landroidx/compose/runtime/Composer;II)V

    invoke-virtual {v12, v0}, Lp1/q;->q(Z)V

    goto :goto_1b

    :cond_24
    move-object/from16 v11, v33

    const v2, 0x363a8c84

    invoke-virtual {v12, v2}, Lp1/q;->e0(I)V

    invoke-static {}, Lcom/whoop/design/atomic/organism/toolbar/b;->h()F

    move-result v2

    invoke-static {v2, v4}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    invoke-static {v12, v2}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    invoke-virtual {v12, v0}, Lp1/q;->q(Z)V

    :goto_1b
    invoke-virtual {v12, v1}, Lp1/q;->q(Z)V

    move-object/from16 v1, p0

    move-object v2, v3

    move-object v5, v11

    move-object/from16 v4, v37

    goto :goto_1c

    :cond_25
    invoke-virtual {v12}, Lp1/q;->X()V

    move-object v1, v4

    move-object v2, v8

    move-object v5, v13

    move-object/from16 v4, p3

    :goto_1c
    invoke-virtual {v12}, Lp1/q;->u()Lp1/v1;

    move-result-object v9

    if-eqz v9, :cond_26

    new-instance v0, Lj81/e;

    const/16 v8, 0xe

    move-object/from16 v3, p2

    move/from16 v6, p6

    move/from16 v7, p7

    invoke-direct/range {v0 .. v8}, Lj81/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;III)V

    iput-object v0, v9, Lp1/v1;->d:Lc93/m;

    :cond_26
    return-void
.end method

.method private static final e()Ll83/a0;
    .locals 1

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method

.method private static final f()Ll83/a0;
    .locals 1

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method

.method private static final g(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/Modifier;Lcom/whoop/design/atomic/organism/toolbar/d$c;Lc93/a;Lc93/a;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 8

    or-int/lit8 p5, p5, 0x1

    invoke-static {p5}, Lp1/x;->L(I)I

    move-result v6

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p4

    move v7, p6

    move-object v5, p7

    invoke-static/range {v0 .. v7}, Lcom/whoop/design/atomic/organism/toolbar/c;->d(Landroidx/compose/ui/Modifier;Landroidx/compose/ui/Modifier;Lcom/whoop/design/atomic/organism/toolbar/d$c;Lc93/a;Lc93/a;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method
