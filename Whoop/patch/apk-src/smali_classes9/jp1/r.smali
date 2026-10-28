.class public abstract Ljp1/r;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u001a-\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0014\u0008\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0007\u00a2\u0006\u0004\u0008\u0006\u0010\u0007\u00a8\u0006\u0008"
    }
    d2 = {
        "Lhp1/i;",
        "viewState",
        "Lkotlin/Function1;",
        "Lhp1/f;",
        "Ll83/a0;",
        "onViewEvent",
        "h",
        "(Lhp1/i;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V",
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
.method public static synthetic a(Lhp1/f;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Ljp1/r;->i(Lhp1/f;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b()Ll83/a0;
    .locals 1

    invoke-static {}, Ljp1/r;->k()Ll83/a0;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic c(Lhp1/i;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p5}, Ljp1/r;->o(Lhp1/i;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Lkotlin/jvm/functions/Function1;Lp1/c1;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Ljp1/r;->m(Lkotlin/jvm/functions/Function1;Lp1/c1;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic e(Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Ljp1/r;->j(Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic f(Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Ljp1/r;->n(Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic g(Lp1/c1;Ljava/lang/String;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Ljp1/r;->l(Lp1/c1;Ljava/lang/String;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final h(Lhp1/i;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V
    .locals 57
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lhp1/i;",
            "Lkotlin/jvm/functions/Function1;",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    move-object/from16 v1, p0

    const-string v0, "viewState"

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v11, p2

    check-cast v11, Lp1/q;

    const v0, -0x54fddb3

    invoke-virtual {v11, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, p3, 0x6

    if-nez v0, :cond_2

    and-int/lit8 v0, p3, 0x8

    if-nez v0, :cond_0

    invoke-virtual {v11, v1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v0

    goto :goto_0

    :cond_0
    invoke-virtual {v11, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

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

    invoke-virtual {v11, v3}, Lp1/q;->i(Ljava/lang/Object;)Z

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

    const/4 v15, 0x0

    if-eq v4, v5, :cond_6

    const/4 v4, 0x1

    goto :goto_5

    :cond_6
    move v4, v15

    :goto_5
    and-int/lit8 v5, v0, 0x1

    invoke-virtual {v11, v5, v4}, Lp1/q;->U(IZ)Z

    move-result v4

    if-eqz v4, :cond_1f

    sget-object v4, Lp1/l;->a:Lp1/v0;

    if-eqz v2, :cond_8

    invoke-virtual {v11}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v4, :cond_7

    new-instance v2, Ljg/c;

    const/16 v3, 0x1a

    invoke-direct {v2, v3}, Ljg/c;-><init>(I)V

    invoke-virtual {v11, v2}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_7
    check-cast v2, Lkotlin/jvm/functions/Function1;

    goto :goto_6

    :cond_8
    move-object v2, v3

    :goto_6
    invoke-virtual {v11}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    if-ne v3, v4, :cond_9

    invoke-virtual {v1}, Lhp1/i;->a()Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lp1/x;->z(Ljava/lang/Object;)Lp1/k1;

    move-result-object v3

    invoke-virtual {v11, v3}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_9
    check-cast v3, Lp1/c1;

    const/high16 v5, 0x3f800000    # 1.0f

    sget-object v7, Lb2/t;->w:Lb2/t;

    invoke-static {v5, v7}, Landroidx/compose/foundation/layout/d;->d(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v8

    invoke-static {v8}, Lgb1/b0;->b0(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v8

    invoke-static {v8}, Ll0/f;->k(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v8

    sget-object v9, Ll0/m;->c:Ll0/g;

    sget-object v10, Lb2/e;->M:Lb2/k;

    invoke-static {v9, v10, v11, v15}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v5

    move-object/from16 v16, v7

    iget-wide v6, v11, Lp1/q;->T:J

    invoke-static {v6, v7}, Ljava/lang/Long;->hashCode(J)I

    move-result v6

    invoke-virtual {v11}, Lp1/q;->m()Lp1/p1;

    move-result-object v7

    invoke-static {v11, v8}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v8

    sget-object v17, La3/l;->a:La3/k;

    invoke-virtual/range {v17 .. v17}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v12, La3/k;->b:La3/j;

    invoke-virtual {v11}, Lp1/q;->i0()V

    iget-boolean v15, v11, Lp1/q;->S:Z

    if-eqz v15, :cond_a

    invoke-virtual {v11, v12}, Lp1/q;->l(Lc93/a;)V

    goto :goto_7

    :cond_a
    invoke-virtual {v11}, Lp1/q;->s0()V

    :goto_7
    sget-object v15, La3/k;->g:La3/i;

    invoke-static {v11, v15, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v5, La3/k;->f:La3/i;

    invoke-static {v11, v5, v7}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v7, La3/k;->j:La3/i;

    iget-boolean v13, v11, Lp1/q;->S:Z

    if-nez v13, :cond_b

    invoke-virtual {v11}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v13

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v14

    invoke-static {v13, v14}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v13

    if-nez v13, :cond_c

    :cond_b
    invoke-static {v6, v11, v6, v7}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_c
    sget-object v13, La3/k;->d:La3/i;

    invoke-static {v11, v13, v8}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual {v1}, Lhp1/i;->c()Lcom/whoop/design/util/TextResource;

    move-result-object v6

    move-object v8, v3

    invoke-virtual {v1}, Lhp1/i;->b()Lcom/whoop/design/util/TextResource;

    move-result-object v3

    sget-object v14, Lx81/d;->a:Lx81/d;

    invoke-static {v14}, Lyb0/f;->a(Lx81/d;)I

    move-result v21

    and-int/lit8 v0, v0, 0x70

    move-object/from16 v22, v5

    const/16 v5, 0x20

    if-ne v0, v5, :cond_d

    const/16 v20, 0x1

    goto :goto_8

    :cond_d
    const/16 v20, 0x0

    :goto_8
    invoke-virtual {v11}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    if-nez v20, :cond_e

    if-ne v5, v4, :cond_f

    :cond_e
    new-instance v5, Ljp1/l;

    const/4 v1, 0x1

    invoke-direct {v5, v2, v1}, Ljp1/l;-><init>(Lkotlin/jvm/functions/Function1;I)V

    invoke-virtual {v11, v5}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_f
    check-cast v5, Lc93/a;

    sget v1, Lcom/whoop/design/util/TextResource;->$stable:I

    shl-int/lit8 v20, v1, 0x3

    move-object/from16 v24, v9

    or-int v9, v1, v20

    move-object/from16 v25, v10

    const/16 v10, 0x18

    move-object/from16 v26, v7

    move-object v7, v5

    const/4 v5, 0x0

    move-object/from16 v27, v2

    move-object v2, v6

    const/4 v6, 0x0

    move/from16 v43, v0

    move/from16 v44, v1

    move-object/from16 v45, v4

    move-object/from16 p1, v8

    move-object v8, v11

    move-object/from16 p2, v14

    move/from16 v4, v21

    move-object/from16 v0, v22

    move-object/from16 v11, v24

    move-object/from16 v14, v25

    move-object/from16 v1, v26

    move-object/from16 v42, v27

    const/16 v23, 0x20

    move-object/from16 v21, v13

    move-object/from16 v13, v16

    invoke-static/range {v2 .. v10}, Ljp1/q;->e(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;ILcom/whoop/design/util/TextResource;Lc93/a;Lc93/a;Landroidx/compose/runtime/Composer;II)V

    const/4 v2, 0x3

    int-to-float v2, v2

    const/16 v3, 0x8

    int-to-float v3, v3

    mul-float/2addr v3, v2

    const/4 v4, 0x2

    int-to-float v4, v4

    invoke-static {v13, v3, v4, v3, v3}, Landroidx/compose/foundation/layout/a;->s(Landroidx/compose/ui/Modifier;FFFF)Landroidx/compose/ui/Modifier;

    move-result-object v3

    const/4 v5, 0x0

    invoke-static {v11, v14, v8, v5}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v6

    iget-wide v9, v8, Lp1/q;->T:J

    invoke-static {v9, v10}, Ljava/lang/Long;->hashCode(J)I

    move-result v7

    invoke-virtual {v8}, Lp1/q;->m()Lp1/p1;

    move-result-object v9

    invoke-static {v8, v3}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    invoke-virtual {v8}, Lp1/q;->i0()V

    iget-boolean v10, v8, Lp1/q;->S:Z

    if-eqz v10, :cond_10

    invoke-virtual {v8, v12}, Lp1/q;->l(Lc93/a;)V

    goto :goto_9

    :cond_10
    invoke-virtual {v8}, Lp1/q;->s0()V

    :goto_9
    invoke-static {v8, v15, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v8, v0, v9}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v0, v8, Lp1/q;->S:Z

    if-nez v0, :cond_12

    invoke-virtual {v8}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v0

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-static {v0, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_11

    goto :goto_b

    :cond_11
    :goto_a
    move-object/from16 v0, v21

    goto :goto_c

    :cond_12
    :goto_b
    invoke-static {v7, v8, v7, v1}, Ld;->y(ILp1/q;ILa3/i;)V

    goto :goto_a

    :goto_c
    invoke-static {v8, v0, v3}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const/4 v0, 0x4

    int-to-float v0, v0

    invoke-static {v4, v0, v13, v8}, Lih0/d0;->u(FFLb2/t;Lp1/q;)V

    const/high16 v1, 0x3f800000    # 1.0f

    float-to-double v3, v1

    const-wide/16 v47, 0x0

    cmpl-double v3, v3, v47

    const-string v49, "invalid weight; must be greater than zero"

    if-lez v3, :cond_13

    :goto_d
    move v3, v2

    goto :goto_e

    :cond_13
    invoke-static/range {v49 .. v49}, Lm0/a;->a(Ljava/lang/String;)V

    goto :goto_d

    :goto_e
    new-instance v2, Landroidx/compose/foundation/layout/LayoutWeightElement;

    const v50, 0x7f7fffff    # Float.MAX_VALUE

    cmpl-float v4, v1, v50

    if-lez v4, :cond_14

    move/from16 v4, v50

    :goto_f
    const/4 v6, 0x1

    goto :goto_10

    :cond_14
    move v4, v1

    goto :goto_f

    :goto_10
    invoke-direct {v2, v4, v6}, Landroidx/compose/foundation/layout/LayoutWeightElement;-><init>(FZ)V

    mul-float/2addr v0, v3

    invoke-static {v0}, Lt0/j;->e(F)Lt0/i;

    move-result-object v28

    invoke-interface/range {p1 .. p1}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/String;

    invoke-static {v0}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v3

    invoke-static {}, Lcom/whoop/design/util/b;->a()Lcom/whoop/design/util/TextResource;

    move-result-object v10

    invoke-virtual {v8}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v0

    move-object/from16 v4, v45

    if-ne v0, v4, :cond_15

    new-instance v0, Ljp1/p;

    const/4 v7, 0x2

    invoke-direct {v0, v7}, Ljp1/p;-><init>(I)V

    invoke-virtual {v8, v0}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_15
    move-object/from16 v33, v0

    check-cast v33, Lc93/a;

    invoke-virtual {v8}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v4, :cond_16

    new-instance v0, Lf1/a0;

    const/16 v7, 0x1b

    move-object/from16 v9, p1

    invoke-direct {v0, v7, v9}, Lf1/a0;-><init>(ILp1/c1;)V

    invoke-virtual {v8, v0}, Lp1/q;->p0(Ljava/lang/Object;)V

    goto :goto_11

    :cond_16
    move-object/from16 v9, p1

    :goto_11
    move-object/from16 v34, v0

    check-cast v34, Lkotlin/jvm/functions/Function1;

    const/high16 v0, 0x30000

    or-int v0, v20, v0

    shl-int/lit8 v7, v44, 0x18

    or-int v36, v0, v7

    const v40, 0x3dffbedc

    const/16 v41, 0x0

    move-object/from16 v45, v4

    const/4 v4, 0x0

    move/from16 v18, v5

    const/4 v5, 0x0

    move/from16 v46, v6

    const/4 v6, 0x0

    const/4 v7, 0x0

    move-object v11, v8

    const/4 v8, 0x0

    move-object v0, v9

    const/4 v9, 0x0

    move-object/from16 v35, v11

    const/4 v11, 0x0

    const/4 v12, 0x0

    move-object/from16 v16, v13

    const/4 v13, 0x0

    const-wide/16 v14, 0x0

    move-object/from16 v17, v16

    const/16 v16, 0x0

    move-object/from16 v19, v17

    const/16 v17, 0x1

    move/from16 v20, v18

    const/16 v18, 0x0

    move-object/from16 v21, v19

    const/16 v19, 0x0

    move/from16 v22, v20

    const/16 v20, 0x0

    move-object/from16 v24, v21

    const/16 v21, 0x0

    move/from16 v25, v22

    const/16 v22, 0x0

    move/from16 v26, v23

    const/16 v23, 0x0

    move-object/from16 v27, v24

    const/16 v24, 0x0

    move/from16 v29, v25

    const/16 v25, 0x0

    move/from16 v30, v26

    const/16 v26, 0x0

    move-object/from16 v31, v27

    const/16 v27, 0x0

    move/from16 v32, v29

    const/16 v29, 0x0

    move/from16 v37, v30

    const/16 v30, 0x0

    move-object/from16 v38, v31

    const/16 v31, 0x0

    move/from16 v39, v32

    const/16 v32, 0x0

    move/from16 v51, v37

    const/16 v37, 0x6000

    move-object/from16 v52, v38

    const/16 v38, 0x0

    move/from16 v53, v39

    const/16 v39, 0x36

    move-object/from16 p1, v0

    move-object/from16 v54, v45

    move/from16 v0, v46

    move-object/from16 v55, v52

    invoke-static/range {v2 .. v41}, Lqz0/k;->l(Landroidx/compose/ui/Modifier;Lcom/whoop/design/util/TextResource;Lb91/a;Lcom/whoop/design/util/TextResource;Lb91/a;Lc93/m;Lc93/m;Lqz0/c;Lcom/whoop/design/util/TextResource;ZZLb91/a;JZIIIZLq3/g0;ZZIZLj0/i;Ljava/lang/String;Li2/a1;Lg1/e8;Ll0/k1;Ll0/k1;Lu0/q0;Lc93/a;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;IIIIII)V

    move-object/from16 v11, v35

    float-to-double v2, v1

    cmpl-double v2, v2, v47

    if-lez v2, :cond_17

    goto :goto_12

    :cond_17
    invoke-static/range {v49 .. v49}, Lm0/a;->a(Ljava/lang/String;)V

    :goto_12
    new-instance v2, Landroidx/compose/foundation/layout/LayoutWeightElement;

    cmpl-float v3, v1, v50

    if-lez v3, :cond_18

    move/from16 v5, v50

    goto :goto_13

    :cond_18
    move v5, v1

    :goto_13
    invoke-direct {v2, v5, v0}, Landroidx/compose/foundation/layout/LayoutWeightElement;-><init>(FZ)V

    invoke-static {v11, v2}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    sget-object v3, Lny0/v;->TextLarge:Lny0/v;

    invoke-virtual/range {p0 .. p0}, Lhp1/i;->d()Lcom/whoop/design/util/TextResource;

    move-result-object v2

    move/from16 v4, v44

    invoke-static {v2, v11, v4}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v4

    sget v2, Lx81/d;->b:I

    move-object/from16 v5, p2

    invoke-virtual {v5, v11, v2}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v2

    invoke-virtual {v2}, Ly81/i;->i0()J

    move-result-wide v6

    move-object/from16 v13, v55

    invoke-static {v1, v13}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    move/from16 v1, v43

    const/16 v14, 0x20

    if-ne v1, v14, :cond_19

    move v15, v0

    goto :goto_14

    :cond_19
    const/4 v15, 0x0

    :goto_14
    invoke-virtual {v11}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    if-nez v15, :cond_1b

    move-object/from16 v15, v54

    if-ne v5, v15, :cond_1a

    goto :goto_15

    :cond_1a
    move-object/from16 v9, v42

    goto :goto_16

    :cond_1b
    move-object/from16 v15, v54

    :goto_15
    new-instance v5, Lbs1/i;

    const/16 v8, 0x15

    move-object/from16 v10, p1

    move-object/from16 v9, v42

    invoke-direct {v5, v9, v10, v8}, Lbs1/i;-><init>(Lkotlin/jvm/functions/Function1;Lp1/c1;I)V

    invoke-virtual {v11, v5}, Lp1/q;->p0(Ljava/lang/Object;)V

    :goto_16
    move-object v10, v5

    check-cast v10, Lc93/a;

    const/16 v12, 0x36

    const/16 v13, 0x68

    const/4 v5, 0x0

    const/4 v8, 0x0

    move-object/from16 v27, v9

    const/4 v9, 0x0

    move-object/from16 v56, v27

    invoke-static/range {v2 .. v13}, Lny0/u;->h(Landroidx/compose/ui/Modifier;Lny0/v;Ljava/lang/String;ZJLi2/t;ZLc93/a;Landroidx/compose/runtime/Composer;II)V

    invoke-virtual {v11, v0}, Lp1/q;->q(Z)V

    invoke-virtual {v11, v0}, Lp1/q;->q(Z)V

    if-ne v1, v14, :cond_1c

    move v1, v0

    goto :goto_17

    :cond_1c
    const/4 v1, 0x0

    :goto_17
    invoke-virtual {v11}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    if-nez v1, :cond_1e

    if-ne v2, v15, :cond_1d

    goto :goto_18

    :cond_1d
    move-object/from16 v9, v56

    goto :goto_19

    :cond_1e
    :goto_18
    new-instance v2, Ljp1/l;

    const/4 v1, 0x2

    move-object/from16 v9, v56

    invoke-direct {v2, v9, v1}, Ljp1/l;-><init>(Lkotlin/jvm/functions/Function1;I)V

    invoke-virtual {v11, v2}, Lp1/q;->p0(Ljava/lang/Object;)V

    :goto_19
    check-cast v2, Lc93/a;

    const/4 v5, 0x0

    invoke-static {v2, v5, v11, v5, v0}, Lio/sentry/config/a;->c(Lc93/a;ZLandroidx/compose/runtime/Composer;II)V

    move-object v3, v9

    goto :goto_1a

    :cond_1f
    invoke-virtual {v11}, Lp1/q;->X()V

    :goto_1a
    invoke-virtual {v11}, Lp1/q;->u()Lp1/v1;

    move-result-object v6

    if-eqz v6, :cond_20

    new-instance v0, Lio2/k0;

    const/4 v5, 0x7

    move-object/from16 v1, p0

    move/from16 v2, p3

    move/from16 v4, p4

    invoke-direct/range {v0 .. v5}, Lio2/k0;-><init>(Ljava/lang/Object;ILjava/lang/Object;II)V

    iput-object v0, v6, Lp1/v1;->d:Lc93/m;

    :cond_20
    return-void
.end method

.method private static final i(Lhp1/f;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final j(Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 1

    sget-object v0, Lhp1/f$b;->a:Lhp1/f$b;

    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final k()Ll83/a0;
    .locals 1

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method

.method private static final l(Lp1/c1;Ljava/lang/String;)Ll83/a0;
    .locals 1

    const-string v0, "text"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lp1/c1;->setValue(Ljava/lang/Object;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final m(Lkotlin/jvm/functions/Function1;Lp1/c1;)Ll83/a0;
    .locals 14

    new-instance v0, Lhp1/f$c;

    new-instance v1, Lfp1/d;

    invoke-interface {p1}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object p1

    move-object v6, p1

    check-cast v6, Ljava/lang/String;

    const/16 v12, 0x3ef

    const/4 v13, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    invoke-direct/range {v1 .. v13}, Lfp1/d;-><init>(Ljava/lang/String;Lfp1/b;Ljava/util/List;ZLjava/lang/String;ILjava/util/List;Ljava/util/List;Ljava/lang/String;Lcom/whoop/hormonalinsights/postpartum/domain/models/PostPartumScreenType;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/4 p1, 0x0

    invoke-direct {v0, p1, v1}, Lhp1/f$c;-><init>(Lcom/whoop/hormonalinsights/postpartum/domain/models/HormonalScreenId;Lfp1/d;)V

    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final n(Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 1

    sget-object v0, Lhp1/f$b;->a:Lhp1/f$b;

    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final o(Lhp1/i;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, Lp1/x;->L(I)I

    move-result p2

    invoke-static {p0, p1, p4, p2, p3}, Ljp1/r;->h(Lhp1/i;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method
