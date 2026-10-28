.class public abstract Lcom/whoop/design/atomic/organism/toolbar/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u001a]\u0010\n\u001a\u00020\u00062\u0008\u0008\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00002\u000e\u0008\u0002\u0010\u0007\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u00052\u000e\u0008\u0002\u0010\u0008\u001a\u0008\u0012\u0004\u0012\u00020\u00060\u00052\u0010\u0008\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005H\u0001\u00a2\u0006\u0004\u0008\n\u0010\u000b\u00a8\u0006\u000c"
    }
    d2 = {
        "Landroidx/compose/ui/Modifier;",
        "modifier",
        "Lcom/whoop/design/atomic/organism/toolbar/d$a;",
        "state",
        "titleColumnModifier",
        "Lkotlin/Function0;",
        "Ll83/a0;",
        "onLeftButtonClick",
        "onRightButtonClick",
        "onTagClick",
        "d",
        "(Landroidx/compose/ui/Modifier;Lcom/whoop/design/atomic/organism/toolbar/d$a;Landroidx/compose/ui/Modifier;Lc93/a;Lc93/a;Lc93/a;Landroidx/compose/runtime/Composer;II)V",
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
.method public static synthetic a(Landroidx/compose/ui/Modifier;Lcom/whoop/design/atomic/organism/toolbar/d$a;Landroidx/compose/ui/Modifier;Lc93/a;Lc93/a;Lc93/a;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p9}, Lcom/whoop/design/atomic/organism/toolbar/a;->g(Landroidx/compose/ui/Modifier;Lcom/whoop/design/atomic/organism/toolbar/d$a;Landroidx/compose/ui/Modifier;Lc93/a;Lc93/a;Lc93/a;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b()Ll83/a0;
    .locals 1

    invoke-static {}, Lcom/whoop/design/atomic/organism/toolbar/a;->e()Ll83/a0;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic c()Ll83/a0;
    .locals 1

    invoke-static {}, Lcom/whoop/design/atomic/organism/toolbar/a;->f()Ll83/a0;

    move-result-object v0

    return-object v0
.end method

.method public static final d(Landroidx/compose/ui/Modifier;Lcom/whoop/design/atomic/organism/toolbar/d$a;Landroidx/compose/ui/Modifier;Lc93/a;Lc93/a;Lc93/a;Landroidx/compose/runtime/Composer;II)V
    .locals 49
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/ui/Modifier;",
            "Lcom/whoop/design/atomic/organism/toolbar/d$a;",
            "Landroidx/compose/ui/Modifier;",
            "Lc93/a;",
            "Lc93/a;",
            "Lc93/a;",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    move-object/from16 v5, p1

    move/from16 v1, p7

    const-string v0, "state"

    invoke-static {v5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v11, p6

    check-cast v11, Lp1/q;

    const v0, -0x2b2353b1

    invoke-virtual {v11, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, p8, 0x1

    const/4 v2, 0x4

    if-eqz v0, :cond_0

    or-int/lit8 v4, v1, 0x6

    move v6, v4

    move-object/from16 v4, p0

    goto :goto_1

    :cond_0
    and-int/lit8 v4, v1, 0x6

    if-nez v4, :cond_2

    move-object/from16 v4, p0

    invoke-virtual {v11, v4}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_1

    move v6, v2

    goto :goto_0

    :cond_1
    const/4 v6, 0x2

    :goto_0
    or-int/2addr v6, v1

    goto :goto_1

    :cond_2
    move-object/from16 v4, p0

    move v6, v1

    :goto_1
    and-int/lit8 v7, v1, 0x30

    if-nez v7, :cond_4

    invoke-virtual {v11, v5}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_3

    const/16 v7, 0x20

    goto :goto_2

    :cond_3
    const/16 v7, 0x10

    :goto_2
    or-int/2addr v6, v7

    :cond_4
    and-int/lit8 v7, p8, 0x4

    if-eqz v7, :cond_6

    or-int/lit16 v6, v6, 0x180

    :cond_5
    move-object/from16 v8, p2

    goto :goto_4

    :cond_6
    and-int/lit16 v8, v1, 0x180

    if-nez v8, :cond_5

    move-object/from16 v8, p2

    invoke-virtual {v11, v8}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_7

    const/16 v9, 0x100

    goto :goto_3

    :cond_7
    const/16 v9, 0x80

    :goto_3
    or-int/2addr v6, v9

    :goto_4
    and-int/lit8 v9, p8, 0x8

    if-eqz v9, :cond_9

    or-int/lit16 v6, v6, 0xc00

    :cond_8
    move-object/from16 v10, p3

    goto :goto_6

    :cond_9
    and-int/lit16 v10, v1, 0xc00

    if-nez v10, :cond_8

    move-object/from16 v10, p3

    invoke-virtual {v11, v10}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v12

    if-eqz v12, :cond_a

    const/16 v12, 0x800

    goto :goto_5

    :cond_a
    const/16 v12, 0x400

    :goto_5
    or-int/2addr v6, v12

    :goto_6
    and-int/lit8 v12, p8, 0x10

    if-eqz v12, :cond_c

    or-int/lit16 v6, v6, 0x6000

    :cond_b
    move-object/from16 v13, p4

    goto :goto_8

    :cond_c
    and-int/lit16 v13, v1, 0x6000

    if-nez v13, :cond_b

    move-object/from16 v13, p4

    invoke-virtual {v11, v13}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v14

    if-eqz v14, :cond_d

    const/16 v14, 0x4000

    goto :goto_7

    :cond_d
    const/16 v14, 0x2000

    :goto_7
    or-int/2addr v6, v14

    :goto_8
    and-int/lit8 v14, p8, 0x20

    const/high16 v15, 0x30000

    if-eqz v14, :cond_f

    or-int/2addr v6, v15

    :cond_e
    move-object/from16 v15, p5

    :goto_9
    move/from16 v32, v6

    goto :goto_b

    :cond_f
    and-int/2addr v15, v1

    if-nez v15, :cond_e

    move-object/from16 v15, p5

    invoke-virtual {v11, v15}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v16

    if-eqz v16, :cond_10

    const/high16 v16, 0x20000

    goto :goto_a

    :cond_10
    const/high16 v16, 0x10000

    :goto_a
    or-int v6, v6, v16

    goto :goto_9

    :goto_b
    const v6, 0x12493

    and-int v6, v32, v6

    const v3, 0x12492

    move/from16 v16, v14

    const/4 v15, 0x1

    if-eq v6, v3, :cond_11

    move v3, v15

    goto :goto_c

    :cond_11
    const/4 v3, 0x0

    :goto_c
    and-int/lit8 v6, v32, 0x1

    invoke-virtual {v11, v6, v3}, Lp1/q;->U(IZ)Z

    move-result v3

    if-eqz v3, :cond_27

    sget-object v3, Lb2/t;->w:Lb2/t;

    if-eqz v0, :cond_12

    move-object v4, v3

    :cond_12
    if-eqz v7, :cond_13

    move-object v0, v3

    goto :goto_d

    :cond_13
    move-object v0, v8

    :goto_d
    sget-object v6, Lp1/l;->a:Lp1/v0;

    if-eqz v9, :cond_15

    invoke-virtual {v11}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v7

    if-ne v7, v6, :cond_14

    new-instance v7, Lnx1/a;

    const/16 v8, 0x9

    invoke-direct {v7, v8}, Lnx1/a;-><init>(I)V

    invoke-virtual {v11, v7}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_14
    check-cast v7, Lc93/a;

    move-object v10, v7

    :cond_15
    if-eqz v12, :cond_17

    invoke-virtual {v11}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v7

    if-ne v7, v6, :cond_16

    new-instance v7, Lnx1/a;

    const/16 v6, 0xa

    invoke-direct {v7, v6}, Lnx1/a;-><init>(I)V

    invoke-virtual {v11, v7}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_16
    move-object v6, v7

    check-cast v6, Lc93/a;

    move-object/from16 v33, v6

    goto :goto_e

    :cond_17
    move-object/from16 v33, v13

    :goto_e
    if-eqz v16, :cond_18

    const/4 v6, 0x0

    move-object/from16 v34, v6

    goto :goto_f

    :cond_18
    move-object/from16 v34, p5

    :goto_f
    const/high16 v6, 0x3f800000    # 1.0f

    invoke-static {v6, v3}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v7

    const-wide/high16 v8, 0x3ff8000000000000L    # 1.5

    double-to-float v8, v8

    int-to-float v2, v2

    mul-float/2addr v8, v2

    const/4 v9, 0x0

    const/4 v12, 0x2

    invoke-static {v7, v8, v9, v12}, Landroidx/compose/foundation/layout/a;->r(Landroidx/compose/ui/Modifier;FFI)Landroidx/compose/ui/Modifier;

    move-result-object v16

    int-to-float v7, v15

    const/16 v8, 0x8

    int-to-float v8, v8

    mul-float v20, v7, v8

    const/16 v21, 0x7

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    invoke-static/range {v16 .. v21}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v8

    invoke-interface {v8, v4}, Landroidx/compose/ui/Modifier;->e(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v8

    sget-object v12, Ll0/m;->g:Ll0/h;

    sget-object v13, Lb2/e;->K:Lb2/l;

    const/16 v15, 0x36

    invoke-static {v12, v13, v11, v15}, Ll0/p1;->a(Ll0/i;Lb2/g;Landroidx/compose/runtime/Composer;I)Ll0/r1;

    move-result-object v12

    move v13, v7

    iget-wide v6, v11, Lp1/q;->T:J

    invoke-static {v6, v7}, Ljava/lang/Long;->hashCode(J)I

    move-result v6

    invoke-virtual {v11}, Lp1/q;->m()Lp1/p1;

    move-result-object v7

    invoke-static {v11, v8}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v8

    sget-object v17, La3/l;->a:La3/k;

    invoke-virtual/range {v17 .. v17}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v15, La3/k;->b:La3/j;

    invoke-virtual {v11}, Lp1/q;->i0()V

    iget-boolean v9, v11, Lp1/q;->S:Z

    if-eqz v9, :cond_19

    invoke-virtual {v11, v15}, Lp1/q;->l(Lc93/a;)V

    goto :goto_10

    :cond_19
    invoke-virtual {v11}, Lp1/q;->s0()V

    :goto_10
    sget-object v9, La3/k;->g:La3/i;

    invoke-static {v11, v9, v12}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v12, La3/k;->f:La3/i;

    invoke-static {v11, v12, v7}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v7, La3/k;->j:La3/i;

    iget-boolean v14, v11, Lp1/q;->S:Z

    if-nez v14, :cond_1a

    invoke-virtual {v11}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v14

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-static {v14, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1b

    :cond_1a
    invoke-static {v6, v11, v6, v7}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_1b
    sget-object v1, La3/k;->d:La3/i;

    invoke-static {v11, v1, v8}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual {v5}, Lcom/whoop/design/atomic/organism/toolbar/d$a;->c()Ly71/g;

    move-result-object v6

    const v35, 0xe000

    if-eqz v6, :cond_1d

    const v6, 0x5a046dbd

    invoke-virtual {v11, v6}, Lp1/q;->e0(I)V

    invoke-static {}, Lcom/whoop/design/atomic/organism/toolbar/b;->h()F

    move-result v6

    invoke-static {v6, v3}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v6

    invoke-virtual {v5}, Lcom/whoop/design/atomic/organism/toolbar/d$a;->d()Ljava/lang/String;

    move-result-object v8

    if-nez v8, :cond_1c

    const-string v8, "toolbar_left_icon_tag"

    :cond_1c
    invoke-static {v6, v8}, Lgb1/d;->d(Landroidx/compose/ui/Modifier;Ljava/lang/String;)Landroidx/compose/ui/Modifier;

    move-result-object v8

    new-instance v36, Lny0/o;

    invoke-virtual {v5}, Lcom/whoop/design/atomic/organism/toolbar/d$a;->e()Lny0/q;

    move-result-object v37

    invoke-virtual {v5}, Lcom/whoop/design/atomic/organism/toolbar/d$a;->c()Ly71/g;

    move-result-object v6

    invoke-virtual {v6}, Ly71/g;->b()I

    move-result v38

    invoke-virtual {v5}, Lcom/whoop/design/atomic/organism/toolbar/d$a;->f()Ly81/f;

    move-result-object v39

    const/16 v47, 0x3f8

    const/16 v48, 0x0

    const/16 v40, 0x0

    const/16 v41, 0x0

    const/16 v42, 0x0

    const/16 v43, 0x0

    const/16 v44, 0x0

    const/16 v45, 0x0

    const/16 v46, 0x0

    invoke-direct/range {v36 .. v48}, Lny0/o;-><init>(Lny0/q;ILy81/e;Ly81/e;Ly81/e;ZZZFZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {v5}, Lcom/whoop/design/atomic/organism/toolbar/d$a;->c()Ly71/g;

    move-result-object v6

    invoke-virtual {v6}, Ly71/g;->a()Lcom/whoop/design/util/TextResource;

    move-result-object v6

    const/4 v14, 0x0

    invoke-static {v6, v11, v14}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v6

    shl-int/lit8 v17, v32, 0x3

    and-int v17, v17, v35

    move/from16 v18, v13

    const/16 v13, 0x8

    move-object/from16 v19, v9

    const/4 v9, 0x0

    move-object/from16 p0, v1

    move-object/from16 v37, v4

    move-object v4, v12

    move/from16 v12, v17

    move/from16 v38, v18

    move/from16 v5, v20

    const/high16 v1, 0x3f800000    # 1.0f

    move-object/from16 v18, v7

    move-object v7, v6

    move-object/from16 v6, v36

    move/from16 v36, v2

    move-object/from16 v2, v19

    invoke-static/range {v6 .. v13}, Lny0/b1;->d(Lny0/o;Ljava/lang/String;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/Modifier;Lc93/a;Landroidx/compose/runtime/Composer;II)V

    move-object/from16 v39, v10

    invoke-virtual {v11, v14}, Lp1/q;->q(Z)V

    goto :goto_11

    :cond_1d
    move-object/from16 p0, v1

    move/from16 v36, v2

    move-object/from16 v37, v4

    move-object/from16 v18, v7

    move-object v2, v9

    move-object/from16 v39, v10

    move-object v4, v12

    move/from16 v38, v13

    move/from16 v5, v20

    const/high16 v1, 0x3f800000    # 1.0f

    const/4 v14, 0x0

    const v6, 0x5a0b30c6

    invoke-virtual {v11, v6}, Lp1/q;->e0(I)V

    invoke-static {}, Lcom/whoop/design/atomic/organism/toolbar/b;->h()F

    move-result v6

    invoke-static {v6, v3}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v6

    invoke-static {v11, v6}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    invoke-virtual {v11, v14}, Lp1/q;->q(Z)V

    :goto_11
    float-to-double v6, v1

    const-wide/16 v8, 0x0

    cmpl-double v6, v6, v8

    if-lez v6, :cond_1e

    :goto_12
    const/4 v6, 0x1

    goto :goto_13

    :cond_1e
    const-string v6, "invalid weight; must be greater than zero"

    invoke-static {v6}, Lm0/a;->a(Ljava/lang/String;)V

    goto :goto_12

    :goto_13
    invoke-static {v0, v6, v1}, Ldc/b;->g(Landroidx/compose/ui/Modifier;ZF)Landroidx/compose/ui/Modifier;

    move-result-object v1

    const/4 v7, 0x0

    const/4 v12, 0x2

    invoke-static {v1, v5, v7, v12}, Landroidx/compose/foundation/layout/a;->r(Landroidx/compose/ui/Modifier;FFI)Landroidx/compose/ui/Modifier;

    move-result-object v1

    sget-object v5, Lb2/e;->N:Lb2/k;

    sget-object v7, Ll0/m;->e:Ll0/h;

    const/16 v8, 0x36

    invoke-static {v7, v5, v11, v8}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v5

    iget-wide v7, v11, Lp1/q;->T:J

    invoke-static {v7, v8}, Ljava/lang/Long;->hashCode(J)I

    move-result v7

    invoke-virtual {v11}, Lp1/q;->m()Lp1/p1;

    move-result-object v8

    invoke-static {v11, v1}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    invoke-virtual {v11}, Lp1/q;->i0()V

    iget-boolean v9, v11, Lp1/q;->S:Z

    if-eqz v9, :cond_1f

    invoke-virtual {v11, v15}, Lp1/q;->l(Lc93/a;)V

    goto :goto_14

    :cond_1f
    invoke-virtual {v11}, Lp1/q;->s0()V

    :goto_14
    invoke-static {v11, v2, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v11, v4, v8}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v2, v11, Lp1/q;->S:Z

    if-nez v2, :cond_20

    invoke-virtual {v11}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-static {v2, v4}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_21

    :cond_20
    move-object/from16 v2, v18

    goto :goto_16

    :cond_21
    :goto_15
    move-object/from16 v2, p0

    goto :goto_17

    :goto_16
    invoke-static {v7, v11, v7, v2}, Ld;->y(ILp1/q;ILa3/i;)V

    goto :goto_15

    :goto_17
    invoke-static {v11, v2, v1}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual/range {p1 .. p1}, Lcom/whoop/design/atomic/organism/toolbar/d$a;->o()Lcom/whoop/design/util/TextResource;

    move-result-object v1

    const/4 v14, 0x0

    invoke-static {v1, v11, v14}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual/range {p1 .. p1}, Lcom/whoop/design/atomic/organism/toolbar/d$a;->p()Ljava/lang/String;

    move-result-object v2

    invoke-static {v3, v2}, Lgb1/d;->d(Landroidx/compose/ui/Modifier;Ljava/lang/String;)Landroidx/compose/ui/Modifier;

    move-result-object v7

    invoke-virtual/range {p1 .. p1}, Lcom/whoop/design/atomic/organism/toolbar/d$a;->q()Ly81/f;

    move-result-object v2

    invoke-virtual {v2, v11, v14}, Ly81/f;->toComposableColor-WaAFU9c(Landroidx/compose/runtime/Composer;I)J

    move-result-wide v8

    sget-object v2, Lx81/d;->a:Lx81/d;

    const/4 v4, 0x6

    invoke-virtual {v2, v11, v4}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v5

    invoke-virtual {v5}, Lb91/d;->r()Lb91/a;

    move-result-object v26

    new-instance v5, Lw3/k;

    const/4 v10, 0x3

    invoke-direct {v5, v10}, Lw3/k;-><init>(I)V

    const/16 v30, 0x0

    const v31, 0x2fdf8

    move v12, v10

    move-object/from16 v28, v11

    const-wide/16 v10, 0x0

    move v13, v12

    const/4 v12, 0x0

    move v15, v13

    const/4 v13, 0x0

    move/from16 v17, v14

    const/4 v14, 0x0

    move/from16 v18, v15

    const-wide/16 v15, 0x0

    move/from16 v19, v17

    const/16 v17, 0x0

    move/from16 v21, v19

    const-wide/16 v19, 0x0

    move/from16 v22, v21

    const/16 v21, 0x0

    move/from16 v23, v22

    const/16 v22, 0x0

    move/from16 v24, v23

    const/16 v23, 0x0

    move/from16 v25, v24

    const/16 v24, 0x0

    move/from16 v27, v25

    const/16 v25, 0x0

    move/from16 v29, v27

    const/16 v27, 0x0

    move/from16 v40, v29

    const/16 v29, 0x0

    move-object v6, v1

    move/from16 v1, v18

    move-object/from16 v18, v5

    move/from16 v5, v40

    invoke-static/range {v6 .. v31}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v11, v28

    invoke-virtual/range {p1 .. p1}, Lcom/whoop/design/atomic/organism/toolbar/d$a;->l()Lo81/a;

    move-result-object v6

    if-eqz v6, :cond_23

    const v6, 0x10685e4c

    invoke-virtual {v11, v6}, Lp1/q;->e0(I)V

    invoke-virtual/range {p1 .. p1}, Lcom/whoop/design/atomic/organism/toolbar/d$a;->l()Lo81/a;

    move-result-object v6

    invoke-virtual {v6}, Lo81/a;->a()Lcom/whoop/design/util/TextResource;

    move-result-object v6

    invoke-static {v6, v11, v5}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v6

    invoke-virtual/range {p1 .. p1}, Lcom/whoop/design/atomic/organism/toolbar/d$a;->m()Ly81/f;

    move-result-object v7

    invoke-virtual {v7, v11, v5}, Ly81/f;->toComposableColor-WaAFU9c(Landroidx/compose/runtime/Composer;I)J

    move-result-wide v8

    invoke-virtual/range {p1 .. p1}, Lcom/whoop/design/atomic/organism/toolbar/d$a;->l()Lo81/a;

    move-result-object v7

    invoke-virtual {v7}, Lo81/a;->b()Z

    move-result v7

    if-eqz v7, :cond_22

    const v7, 0x194dcad7

    invoke-virtual {v11, v7}, Lp1/q;->e0(I)V

    invoke-virtual {v2, v11, v4}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v2

    invoke-virtual {v2}, Lb91/d;->E()Lb91/a;

    move-result-object v2

    :goto_18
    invoke-virtual {v11, v5}, Lp1/q;->q(Z)V

    move-object/from16 v26, v2

    goto :goto_19

    :cond_22
    const v7, 0x194dce97

    invoke-virtual {v11, v7}, Lp1/q;->e0(I)V

    invoke-virtual {v2, v11, v4}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v2

    invoke-virtual {v2}, Lb91/d;->d()Lb91/a;

    move-result-object v2

    goto :goto_18

    :goto_19
    new-instance v2, Lw3/k;

    invoke-direct {v2, v1}, Lw3/k;-><init>(I)V

    const/16 v30, 0x0

    const v31, 0x2fdfa

    const/4 v7, 0x0

    move-object/from16 v28, v11

    const-wide/16 v10, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const-wide/16 v15, 0x0

    const/16 v17, 0x0

    const-wide/16 v19, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v27, 0x0

    const/16 v29, 0x0

    move-object/from16 v18, v2

    invoke-static/range {v6 .. v31}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v11, v28

    invoke-virtual {v11, v5}, Lp1/q;->q(Z)V

    goto :goto_1a

    :cond_23
    const v1, 0x106d498d

    invoke-virtual {v11, v1}, Lp1/q;->e0(I)V

    invoke-virtual {v11, v5}, Lp1/q;->q(Z)V

    :goto_1a
    invoke-virtual/range {p1 .. p1}, Lcom/whoop/design/atomic/organism/toolbar/d$a;->n()Lhy0/h1;

    move-result-object v1

    if-eqz v1, :cond_24

    const v1, 0x106df0a9

    move/from16 v2, v36

    move/from16 v13, v38

    invoke-static {v11, v1, v13, v2, v3}, Lih0/d0;->f(Lp1/q;IFFLb2/t;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    invoke-static {v11, v1}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    invoke-virtual/range {p1 .. p1}, Lcom/whoop/design/atomic/organism/toolbar/d$a;->n()Lhy0/h1;

    move-result-object v6

    shr-int/lit8 v1, v32, 0x9

    and-int/lit16 v10, v1, 0x380

    move-object/from16 v28, v11

    const/4 v11, 0x2

    const/4 v7, 0x0

    move-object/from16 v9, v28

    move-object/from16 v8, v34

    invoke-static/range {v6 .. v11}, Lhy0/g1;->h(Lhy0/h1;Landroidx/compose/ui/Modifier;Lc93/a;Landroidx/compose/runtime/Composer;II)V

    move-object v1, v8

    move-object v11, v9

    invoke-virtual {v11, v5}, Lp1/q;->q(Z)V

    :goto_1b
    const/4 v2, 0x1

    goto :goto_1c

    :cond_24
    move-object/from16 v1, v34

    const v2, 0x1070d06d

    invoke-virtual {v11, v2}, Lp1/q;->e0(I)V

    invoke-virtual {v11, v5}, Lp1/q;->q(Z)V

    goto :goto_1b

    :goto_1c
    invoke-virtual {v11, v2}, Lp1/q;->q(Z)V

    invoke-virtual/range {p1 .. p1}, Lcom/whoop/design/atomic/organism/toolbar/d$a;->j()Lc93/m;

    move-result-object v4

    invoke-virtual/range {p1 .. p1}, Lcom/whoop/design/atomic/organism/toolbar/d$a;->g()Ly71/g;

    move-result-object v6

    if-eqz v6, :cond_25

    const v4, 0x5a20bcf5

    invoke-virtual {v11, v4}, Lp1/q;->e0(I)V

    invoke-static {}, Lcom/whoop/design/atomic/organism/toolbar/b;->h()F

    move-result v4

    invoke-static {v4, v3}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    const-string v4, "toolbar_right_icon_tag"

    invoke-static {v3, v4}, Lgb1/d;->d(Landroidx/compose/ui/Modifier;Ljava/lang/String;)Landroidx/compose/ui/Modifier;

    move-result-object v8

    invoke-virtual/range {p1 .. p1}, Lcom/whoop/design/atomic/organism/toolbar/d$a;->h()Lny0/q;

    move-result-object v13

    invoke-virtual/range {p1 .. p1}, Lcom/whoop/design/atomic/organism/toolbar/d$a;->g()Ly71/g;

    move-result-object v3

    invoke-virtual {v3}, Ly71/g;->b()I

    move-result v14

    invoke-virtual/range {p1 .. p1}, Lcom/whoop/design/atomic/organism/toolbar/d$a;->k()Z

    move-result v20

    invoke-virtual/range {p1 .. p1}, Lcom/whoop/design/atomic/organism/toolbar/d$a;->i()Ly81/f;

    move-result-object v15

    new-instance v12, Lny0/o;

    const/16 v23, 0x378

    const/16 v24, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    invoke-direct/range {v12 .. v24}, Lny0/o;-><init>(Lny0/q;ILy81/e;Ly81/e;Ly81/e;ZZZFZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual/range {p1 .. p1}, Lcom/whoop/design/atomic/organism/toolbar/d$a;->g()Ly71/g;

    move-result-object v3

    invoke-virtual {v3}, Ly71/g;->a()Lcom/whoop/design/util/TextResource;

    move-result-object v3

    invoke-static {v3, v11, v5}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v7

    and-int v3, v32, v35

    const/16 v13, 0x8

    const/4 v9, 0x0

    move-object v6, v12

    move-object/from16 v10, v33

    move v12, v3

    invoke-static/range {v6 .. v13}, Lny0/b1;->d(Lny0/o;Ljava/lang/String;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/Modifier;Lc93/a;Landroidx/compose/runtime/Composer;II)V

    invoke-virtual {v11, v5}, Lp1/q;->q(Z)V

    goto :goto_1d

    :cond_25
    move-object/from16 v10, v33

    if-eqz v4, :cond_26

    const v3, 0x5a2879b0

    invoke-virtual {v11, v3}, Lp1/q;->e0(I)V

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-interface {v4, v11, v3}, Lc93/m;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    invoke-virtual {v11, v5}, Lp1/q;->q(Z)V

    goto :goto_1d

    :cond_26
    const v4, 0x5a292d26

    invoke-virtual {v11, v4}, Lp1/q;->e0(I)V

    invoke-static {}, Lcom/whoop/design/atomic/organism/toolbar/b;->h()F

    move-result v4

    invoke-static {v4, v3}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    invoke-static {v11, v3}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    invoke-virtual {v11, v5}, Lp1/q;->q(Z)V

    :goto_1d
    invoke-virtual {v11, v2}, Lp1/q;->q(Z)V

    move-object v6, v0

    move-object v9, v1

    move-object v8, v10

    move-object/from16 v4, v37

    move-object/from16 v7, v39

    goto :goto_1e

    :cond_27
    invoke-virtual {v11}, Lp1/q;->X()V

    move-object/from16 v9, p5

    move-object v6, v8

    move-object v7, v10

    move-object v8, v13

    :goto_1e
    invoke-virtual {v11}, Lp1/q;->u()Lp1/v1;

    move-result-object v10

    if-eqz v10, :cond_28

    new-instance v0, Laz1/f;

    const/16 v3, 0x1c

    move-object/from16 v5, p1

    move/from16 v1, p7

    move/from16 v2, p8

    invoke-direct/range {v0 .. v9}, Laz1/f;-><init>(IIILjava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ll83/e;Ll83/e;)V

    iput-object v0, v10, Lp1/v1;->d:Lc93/m;

    :cond_28
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

.method private static final g(Landroidx/compose/ui/Modifier;Lcom/whoop/design/atomic/organism/toolbar/d$a;Landroidx/compose/ui/Modifier;Lc93/a;Lc93/a;Lc93/a;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 10

    or-int/lit8 v0, p6, 0x1

    invoke-static {v0}, Lp1/x;->L(I)I

    move-result v8

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    move/from16 v9, p7

    move-object/from16 v7, p8

    invoke-static/range {v1 .. v9}, Lcom/whoop/design/atomic/organism/toolbar/a;->d(Landroidx/compose/ui/Modifier;Lcom/whoop/design/atomic/organism/toolbar/d$a;Landroidx/compose/ui/Modifier;Lc93/a;Lc93/a;Lc93/a;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method
