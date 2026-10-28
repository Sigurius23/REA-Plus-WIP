.class public abstract Ljp1/q;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u001aU\u0010\n\u001a\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00032\n\u0008\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00002\u000e\u0008\u0002\u0010\u0008\u001a\u0008\u0012\u0004\u0012\u00020\u00070\u00062\u000e\u0008\u0002\u0010\t\u001a\u0008\u0012\u0004\u0012\u00020\u00070\u0006H\u0001\u00a2\u0006\u0004\u0008\n\u0010\u000b\u00a8\u0006\u000c"
    }
    d2 = {
        "Lcom/whoop/design/util/TextResource;",
        "title",
        "subtitle",
        "",
        "icon",
        "skipTitle",
        "Lkotlin/Function0;",
        "Ll83/a0;",
        "onSkipClick",
        "onLeftButtonClick",
        "e",
        "(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;ILcom/whoop/design/util/TextResource;Lc93/a;Lc93/a;Landroidx/compose/runtime/Composer;II)V",
        "hormonal-insights_release"
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
.method public static synthetic a()Ll83/a0;
    .locals 1

    invoke-static {}, Ljp1/q;->f()Ll83/a0;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic b()Ll83/a0;
    .locals 1

    invoke-static {}, Ljp1/q;->g()Ll83/a0;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic c(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;ILcom/whoop/design/util/TextResource;Lc93/a;Lc93/a;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p9}, Ljp1/q;->i(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;ILcom/whoop/design/util/TextResource;Lc93/a;Lc93/a;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Lc93/a;Ljava/lang/Object;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Ljp1/q;->h(Lc93/a;Ljava/lang/Object;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final e(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;ILcom/whoop/design/util/TextResource;Lc93/a;Lc93/a;Landroidx/compose/runtime/Composer;II)V
    .locals 40
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/design/util/TextResource;",
            "Lcom/whoop/design/util/TextResource;",
            "I",
            "Lcom/whoop/design/util/TextResource;",
            "Lc93/a;",
            "Lc93/a;",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move-object/from16 v0, p3

    move/from16 v7, p7

    const-string v3, "title"

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v3, "subtitle"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v13, p6

    check-cast v13, Lp1/q;

    const v3, -0x4939eb61

    invoke-virtual {v13, v3}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v3, v7, 0x6

    const/4 v4, 0x2

    const/4 v5, 0x4

    if-nez v3, :cond_2

    and-int/lit8 v3, v7, 0x8

    if-nez v3, :cond_0

    invoke-virtual {v13, v1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v3

    goto :goto_0

    :cond_0
    invoke-virtual {v13, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v3

    :goto_0
    if-eqz v3, :cond_1

    move v3, v5

    goto :goto_1

    :cond_1
    move v3, v4

    :goto_1
    or-int/2addr v3, v7

    goto :goto_2

    :cond_2
    move v3, v7

    :goto_2
    and-int/lit8 v6, v7, 0x30

    if-nez v6, :cond_5

    and-int/lit8 v6, v7, 0x40

    if-nez v6, :cond_3

    invoke-virtual {v13, v2}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v6

    goto :goto_3

    :cond_3
    invoke-virtual {v13, v2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v6

    :goto_3
    if-eqz v6, :cond_4

    const/16 v6, 0x20

    goto :goto_4

    :cond_4
    const/16 v6, 0x10

    :goto_4
    or-int/2addr v3, v6

    :cond_5
    and-int/lit16 v6, v7, 0x180

    if-nez v6, :cond_8

    and-int/lit8 v6, p8, 0x4

    if-nez v6, :cond_6

    move/from16 v6, p2

    invoke-virtual {v13, v6}, Lp1/q;->e(I)Z

    move-result v8

    if-eqz v8, :cond_7

    const/16 v8, 0x100

    goto :goto_5

    :cond_6
    move/from16 v6, p2

    :cond_7
    const/16 v8, 0x80

    :goto_5
    or-int/2addr v3, v8

    goto :goto_6

    :cond_8
    move/from16 v6, p2

    :goto_6
    and-int/lit8 v8, p8, 0x8

    if-eqz v8, :cond_9

    or-int/lit16 v3, v3, 0xc00

    goto :goto_9

    :cond_9
    and-int/lit16 v9, v7, 0xc00

    if-nez v9, :cond_c

    and-int/lit16 v9, v7, 0x1000

    if-nez v9, :cond_a

    invoke-virtual {v13, v0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v9

    goto :goto_7

    :cond_a
    invoke-virtual {v13, v0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v9

    :goto_7
    if-eqz v9, :cond_b

    const/16 v9, 0x800

    goto :goto_8

    :cond_b
    const/16 v9, 0x400

    :goto_8
    or-int/2addr v3, v9

    :cond_c
    :goto_9
    and-int/lit8 v9, p8, 0x10

    if-eqz v9, :cond_e

    or-int/lit16 v3, v3, 0x6000

    :cond_d
    move-object/from16 v11, p4

    goto :goto_b

    :cond_e
    and-int/lit16 v11, v7, 0x6000

    if-nez v11, :cond_d

    move-object/from16 v11, p4

    invoke-virtual {v13, v11}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v12

    if-eqz v12, :cond_f

    const/16 v12, 0x4000

    goto :goto_a

    :cond_f
    const/16 v12, 0x2000

    :goto_a
    or-int/2addr v3, v12

    :goto_b
    and-int/lit8 v12, p8, 0x20

    const/high16 v14, 0x30000

    if-eqz v12, :cond_11

    or-int/2addr v3, v14

    :cond_10
    move-object/from16 v14, p5

    goto :goto_d

    :cond_11
    and-int/2addr v14, v7

    if-nez v14, :cond_10

    move-object/from16 v14, p5

    invoke-virtual {v13, v14}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v15

    if-eqz v15, :cond_12

    const/high16 v15, 0x20000

    goto :goto_c

    :cond_12
    const/high16 v15, 0x10000

    :goto_c
    or-int/2addr v3, v15

    :goto_d
    const v15, 0x12493

    and-int/2addr v15, v3

    const v10, 0x12492

    if-eq v15, v10, :cond_13

    const/4 v10, 0x1

    goto :goto_e

    :cond_13
    const/4 v10, 0x0

    :goto_e
    and-int/lit8 v15, v3, 0x1

    invoke-virtual {v13, v15, v10}, Lp1/q;->U(IZ)Z

    move-result v10

    if-eqz v10, :cond_2a

    invoke-virtual {v13}, Lp1/q;->Z()V

    and-int/lit8 v10, v7, 0x1

    sget-object v15, Lp1/l;->a:Lp1/v0;

    if-eqz v10, :cond_16

    invoke-virtual {v13}, Lp1/q;->C()Z

    move-result v10

    if-eqz v10, :cond_14

    goto :goto_f

    :cond_14
    invoke-virtual {v13}, Lp1/q;->X()V

    and-int/lit8 v8, p8, 0x4

    if-eqz v8, :cond_15

    and-int/lit16 v3, v3, -0x381

    :cond_15
    move/from16 v20, v6

    move-object v12, v14

    move v6, v3

    move-object/from16 v3, p4

    goto :goto_12

    :cond_16
    :goto_f
    and-int/lit8 v10, p8, 0x4

    if-eqz v10, :cond_17

    sget-object v6, Lx81/d;->a:Lx81/d;

    invoke-static {v6}, Lih0/d0;->C(Lx81/d;)I

    move-result v6

    and-int/lit16 v3, v3, -0x381

    :cond_17
    if-eqz v8, :cond_18

    const/4 v0, 0x0

    :cond_18
    if-eqz v9, :cond_1a

    invoke-virtual {v13}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v8

    if-ne v8, v15, :cond_19

    new-instance v8, Ljp1/p;

    const/4 v9, 0x0

    invoke-direct {v8, v9}, Ljp1/p;-><init>(I)V

    invoke-virtual {v13, v8}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_19
    check-cast v8, Lc93/a;

    goto :goto_10

    :cond_1a
    move-object/from16 v8, p4

    :goto_10
    if-eqz v12, :cond_1c

    invoke-virtual {v13}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v9

    if-ne v9, v15, :cond_1b

    new-instance v9, Ljp1/p;

    const/4 v10, 0x1

    invoke-direct {v9, v10}, Ljp1/p;-><init>(I)V

    invoke-virtual {v13, v9}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_1b
    check-cast v9, Lc93/a;

    move/from16 v20, v6

    move-object v12, v9

    :goto_11
    move v6, v3

    move-object v3, v8

    goto :goto_12

    :cond_1c
    move/from16 v20, v6

    move-object v12, v14

    goto :goto_11

    :goto_12
    invoke-virtual {v13}, Lp1/q;->r()V

    const/high16 v8, 0x3f800000    # 1.0f

    sget-object v9, Lb2/t;->w:Lb2/t;

    invoke-static {v8, v9}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v10

    move-object/from16 p2, v12

    const-wide/high16 v11, 0x3ff8000000000000L    # 1.5

    double-to-float v11, v11

    int-to-float v5, v5

    mul-float/2addr v11, v5

    int-to-float v12, v4

    const/16 v14, 0x8

    int-to-float v14, v14

    mul-float/2addr v12, v14

    invoke-static {v10, v11, v12}, Landroidx/compose/foundation/layout/a;->q(Landroidx/compose/ui/Modifier;FF)Landroidx/compose/ui/Modifier;

    move-result-object v10

    sget-object v11, Ll0/m;->g:Ll0/h;

    sget-object v12, Lb2/e;->K:Lb2/l;

    const/16 v14, 0x36

    invoke-static {v11, v12, v13, v14}, Ll0/p1;->a(Ll0/i;Lb2/g;Landroidx/compose/runtime/Composer;I)Ll0/r1;

    move-result-object v11

    move-object v12, v15

    iget-wide v14, v13, Lp1/q;->T:J

    invoke-static {v14, v15}, Ljava/lang/Long;->hashCode(J)I

    move-result v14

    invoke-virtual {v13}, Lp1/q;->m()Lp1/p1;

    move-result-object v15

    invoke-static {v13, v10}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v10

    sget-object v18, La3/l;->a:La3/k;

    invoke-virtual/range {v18 .. v18}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v4, La3/k;->b:La3/j;

    invoke-virtual {v13}, Lp1/q;->i0()V

    iget-boolean v8, v13, Lp1/q;->S:Z

    if-eqz v8, :cond_1d

    invoke-virtual {v13, v4}, Lp1/q;->l(Lc93/a;)V

    goto :goto_13

    :cond_1d
    invoke-virtual {v13}, Lp1/q;->s0()V

    :goto_13
    sget-object v8, La3/k;->g:La3/i;

    invoke-static {v13, v8, v11}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v11, La3/k;->f:La3/i;

    invoke-static {v13, v11, v15}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v15, La3/k;->j:La3/i;

    move-object/from16 p5, v0

    iget-boolean v0, v13, Lp1/q;->S:Z

    if-nez v0, :cond_1e

    invoke-virtual {v13}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v0

    move/from16 v18, v5

    invoke-static {v14}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-static {v0, v5}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1f

    goto :goto_14

    :cond_1e
    move/from16 v18, v5

    :goto_14
    invoke-static {v14, v13, v14, v15}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_1f
    sget-object v0, La3/k;->d:La3/i;

    invoke-static {v13, v0, v10}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const/16 v5, 0xc

    int-to-float v5, v5

    mul-float v5, v5, v18

    invoke-static {v5, v9}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v10

    new-instance v18, Lny0/o;

    sget-object v19, Lny0/q$a;->f:Lny0/q$a;

    const/16 v29, 0x3fc

    const/16 v30, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    const/16 v28, 0x0

    invoke-direct/range {v18 .. v30}, Lny0/o;-><init>(Lny0/q;ILy81/e;Ly81/e;Ly81/e;ZZZFZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move/from16 v34, v20

    new-instance v14, Lcom/whoop/design/util/TextResource$b;

    move/from16 v35, v6

    sget v6, Luv0/c;->E:I

    move-object/from16 v19, v8

    const/4 v7, 0x2

    const/4 v8, 0x0

    invoke-direct {v14, v6, v8, v7, v8}, Lcom/whoop/design/util/TextResource$b;-><init>(ILjava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {v14}, Lcom/whoop/design/util/TextResource$b;->toString()Ljava/lang/String;

    move-result-object v6

    sget v7, Lny0/o;->k:I

    or-int/lit16 v7, v7, 0x180

    shr-int/lit8 v8, v35, 0x3

    const v36, 0xe000

    and-int v14, v8, v36

    or-int/2addr v14, v7

    move-object v7, v15

    const/16 v15, 0x8

    move-object/from16 v20, v11

    const/4 v11, 0x0

    move-object/from16 p4, v3

    move/from16 p3, v5

    move-object v5, v7

    move/from16 p6, v8

    move-object/from16 v38, v9

    move-object/from16 v37, v12

    move-object/from16 v8, v18

    move-object/from16 v7, v19

    const/4 v2, 0x1

    const/high16 v3, 0x3f800000    # 1.0f

    move-object/from16 v12, p2

    move-object v9, v6

    move-object/from16 v6, v20

    invoke-static/range {v8 .. v15}, Lny0/b1;->d(Lny0/o;Ljava/lang/String;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/Modifier;Lc93/a;Landroidx/compose/runtime/Composer;II)V

    move-object/from16 v39, v12

    float-to-double v8, v3

    const-wide/16 v10, 0x0

    cmpl-double v8, v8, v10

    if-lez v8, :cond_20

    move v11, v2

    goto :goto_15

    :cond_20
    const/4 v11, 0x0

    :goto_15
    if-nez v11, :cond_21

    const-string v8, "invalid weight; must be greater than zero"

    invoke-static {v8}, Lm0/a;->a(Ljava/lang/String;)V

    :cond_21
    new-instance v8, Landroidx/compose/foundation/layout/LayoutWeightElement;

    invoke-direct {v8, v3, v2}, Landroidx/compose/foundation/layout/LayoutWeightElement;-><init>(FZ)V

    sget-object v3, Lb2/e;->N:Lb2/k;

    sget-object v9, Ll0/m;->e:Ll0/h;

    const/16 v10, 0x36

    invoke-static {v9, v3, v13, v10}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v3

    iget-wide v9, v13, Lp1/q;->T:J

    invoke-static {v9, v10}, Ljava/lang/Long;->hashCode(J)I

    move-result v9

    invoke-virtual {v13}, Lp1/q;->m()Lp1/p1;

    move-result-object v10

    invoke-static {v13, v8}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v8

    invoke-virtual {v13}, Lp1/q;->i0()V

    iget-boolean v11, v13, Lp1/q;->S:Z

    if-eqz v11, :cond_22

    invoke-virtual {v13, v4}, Lp1/q;->l(Lc93/a;)V

    goto :goto_16

    :cond_22
    invoke-virtual {v13}, Lp1/q;->s0()V

    :goto_16
    invoke-static {v13, v7, v3}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v13, v6, v10}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v3, v13, Lp1/q;->S:Z

    if-nez v3, :cond_23

    invoke-virtual {v13}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-static {v3, v4}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_24

    :cond_23
    invoke-static {v9, v13, v9, v5}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_24
    invoke-static {v13, v0, v8}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget v0, Lcom/whoop/design/util/TextResource;->$stable:I

    and-int/lit8 v3, v35, 0xe

    or-int/2addr v3, v0

    invoke-static {v1, v13, v3}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v8

    sget-object v3, Lx81/d;->a:Lx81/d;

    sget v4, Lx81/d;->b:I

    invoke-virtual {v3, v13, v4}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v5

    invoke-virtual {v5}, Ly81/i;->y()J

    move-result-wide v10

    invoke-virtual {v3, v13, v4}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v5

    invoke-virtual {v5}, Lb91/d;->r()Lb91/a;

    move-result-object v28

    sget v5, Lb91/a;->d:I

    shl-int/lit8 v32, v5, 0x12

    const v33, 0x2fffa

    const/4 v9, 0x0

    move-object/from16 v30, v13

    const-wide/16 v12, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const-wide/16 v17, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const-wide/16 v21, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    const/16 v29, 0x0

    const/16 v31, 0x0

    invoke-static/range {v8 .. v33}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v13, v30

    invoke-static/range {p1 .. p1}, Lcom/whoop/design/util/b;->d(Lcom/whoop/design/util/TextResource;)Z

    move-result v5

    if-eqz v5, :cond_25

    const v5, -0x1ee95a5e

    invoke-virtual {v13, v5}, Lp1/q;->e0(I)V

    and-int/lit8 v5, p6, 0xe

    or-int/2addr v5, v0

    move-object/from16 v7, p1

    invoke-static {v7, v13, v5}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v3, v13, v4}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v5

    invoke-virtual {v5}, Ly81/i;->b1()J

    move-result-wide v10

    invoke-virtual {v3, v13, v4}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v3

    invoke-virtual {v3}, Lb91/d;->s()Lb91/a;

    move-result-object v28

    const/16 v31, 0x0

    const v33, 0x2fffa

    const/4 v9, 0x0

    move-object/from16 v30, v13

    const-wide/16 v12, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const-wide/16 v17, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const-wide/16 v21, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    const/16 v29, 0x0

    invoke-static/range {v8 .. v33}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v13, v30

    const/4 v3, 0x0

    invoke-virtual {v13, v3}, Lp1/q;->q(Z)V

    goto :goto_17

    :cond_25
    move-object/from16 v7, p1

    const/4 v3, 0x0

    const v4, -0x1ee62443

    invoke-virtual {v13, v4}, Lp1/q;->e0(I)V

    invoke-virtual {v13, v3}, Lp1/q;->q(Z)V

    :goto_17
    invoke-virtual {v13, v2}, Lp1/q;->q(Z)V

    if-eqz p5, :cond_29

    const v3, -0x2e1f6d7d

    invoke-virtual {v13, v3}, Lp1/q;->e0(I)V

    and-int v3, v35, v36

    const/16 v4, 0x4000

    if-ne v3, v4, :cond_26

    move v11, v2

    goto :goto_18

    :cond_26
    const/4 v11, 0x0

    :goto_18
    invoke-virtual {v13}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    if-nez v11, :cond_28

    move-object/from16 v12, v37

    if-ne v3, v12, :cond_27

    goto :goto_19

    :cond_27
    move-object/from16 v5, p4

    goto :goto_1a

    :cond_28
    :goto_19
    new-instance v3, Lh0/l0;

    const/16 v4, 0xb

    move-object/from16 v5, p4

    invoke-direct {v3, v5, v4}, Lh0/l0;-><init>(Lc93/a;I)V

    invoke-virtual {v13, v3}, Lp1/q;->p0(Ljava/lang/Object;)V

    :goto_1a
    move-object/from16 v20, v3

    check-cast v20, Lkotlin/jvm/functions/Function1;

    shl-int/lit8 v0, v0, 0x6

    move/from16 v3, p6

    and-int/lit16 v3, v3, 0x380

    or-int v22, v0, v3

    const/16 v23, 0x0

    const/16 v24, 0xffb

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    move-object/from16 v30, v13

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    move-object/from16 v10, p5

    move-object/from16 v21, v30

    invoke-static/range {v8 .. v24}, Lny0/l0;->i(Landroidx/compose/ui/Modifier;Lny0/n0;Lcom/whoop/design/util/TextResource;Ly71/g;Ly71/g;ZLy81/e;Lj91/b;ZZLjava/lang/Float;Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v13, v21

    const/4 v3, 0x0

    invoke-virtual {v13, v3}, Lp1/q;->q(Z)V

    goto :goto_1b

    :cond_29
    move-object/from16 v5, p4

    move-object/from16 v10, p5

    const/4 v3, 0x0

    const v0, -0x2e1d5e9c

    move/from16 v4, p3

    move-object/from16 v6, v38

    invoke-static {v13, v0, v6, v4, v13}, Lr80/c;->C(Lp1/q;ILb2/t;FLp1/q;)V

    invoke-virtual {v13, v3}, Lp1/q;->q(Z)V

    :goto_1b
    invoke-virtual {v13, v2}, Lp1/q;->q(Z)V

    move-object v4, v10

    move/from16 v3, v34

    move-object/from16 v6, v39

    goto :goto_1c

    :cond_2a
    move-object v7, v2

    invoke-virtual {v13}, Lp1/q;->X()V

    move-object/from16 v5, p4

    move-object v4, v0

    move v3, v6

    move-object v6, v14

    :goto_1c
    invoke-virtual {v13}, Lp1/q;->u()Lp1/v1;

    move-result-object v10

    if-eqz v10, :cond_2b

    new-instance v0, Lep1/r;

    const/4 v9, 0x1

    move/from16 v8, p8

    move-object v2, v7

    move/from16 v7, p7

    invoke-direct/range {v0 .. v9}, Lep1/r;-><init>(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;ILcom/whoop/design/util/TextResource;Lc93/a;Lc93/a;III)V

    iput-object v0, v10, Lp1/v1;->d:Lc93/m;

    :cond_2b
    return-void
.end method

.method private static final f()Ll83/a0;
    .locals 1

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method

.method private static final g()Ll83/a0;
    .locals 1

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method

.method private static final h(Lc93/a;Ljava/lang/Object;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0}, Lc93/a;->invoke()Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final i(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;ILcom/whoop/design/util/TextResource;Lc93/a;Lc93/a;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 10

    or-int/lit8 v0, p6, 0x1

    invoke-static {v0}, Lp1/x;->L(I)I

    move-result v8

    move-object v1, p0

    move-object v2, p1

    move v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    move/from16 v9, p7

    move-object/from16 v7, p8

    invoke-static/range {v1 .. v9}, Ljp1/q;->e(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;ILcom/whoop/design/util/TextResource;Lc93/a;Lc93/a;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method
