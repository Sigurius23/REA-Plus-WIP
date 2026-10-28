.class public abstract Lrx0/g;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0018\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u001a?\u0010\u0007\u001a\u00020\u00032\u0008\u0010\u0001\u001a\u0004\u0018\u00010\u00002\u0014\u0008\u0002\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00030\u00022\u000e\u0008\u0002\u0010\u0006\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u0005H\u0007\u00a2\u0006\u0004\u0008\u0007\u0010\u0008\u00a8\u0006\n\u00b2\u0006\u000e\u0010\t\u001a\u00020\u00008\n@\nX\u008a\u008e\u0002"
    }
    d2 = {
        "",
        "initialJson",
        "Lkotlin/Function1;",
        "Ll83/a0;",
        "onRender",
        "Lkotlin/Function0;",
        "onNavigateBack",
        "h",
        "(Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lc93/a;Landroidx/compose/runtime/Composer;II)V",
        "jsonText",
        "debug-tools_release"
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

    invoke-static {}, Lrx0/g;->j()Ll83/a0;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic b(Ljava/lang/String;)Lp1/c1;
    .locals 0

    invoke-static {p0}, Lrx0/g;->k(Ljava/lang/String;)Lp1/c1;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Ljava/lang/String;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lrx0/g;->i(Ljava/lang/String;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lc93/a;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p6}, Lrx0/g;->q(Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lc93/a;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic e()Ll83/a0;
    .locals 1

    invoke-static {}, Lrx0/g;->n()Ll83/a0;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic f(Lkotlin/jvm/functions/Function1;Lp1/c1;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lrx0/g;->p(Lkotlin/jvm/functions/Function1;Lp1/c1;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic g(Lp1/c1;Ljava/lang/String;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lrx0/g;->o(Lp1/c1;Ljava/lang/String;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final h(Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lc93/a;Landroidx/compose/runtime/Composer;II)V
    .locals 48
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lkotlin/jvm/functions/Function1;",
            "Lc93/a;",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    move-object/from16 v1, p0

    move/from16 v4, p4

    move-object/from16 v11, p3

    check-cast v11, Lp1/q;

    const v0, -0x7fa9e16c

    invoke-virtual {v11, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, v4, 0x6

    const/4 v2, 0x4

    const/4 v3, 0x2

    if-nez v0, :cond_1

    invoke-virtual {v11, v1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    move v0, v2

    goto :goto_0

    :cond_0
    move v0, v3

    :goto_0
    or-int/2addr v0, v4

    goto :goto_1

    :cond_1
    move v0, v4

    :goto_1
    and-int/lit8 v5, p5, 0x2

    if-eqz v5, :cond_3

    or-int/lit8 v0, v0, 0x30

    :cond_2
    move-object/from16 v6, p1

    goto :goto_3

    :cond_3
    and-int/lit8 v6, v4, 0x30

    if-nez v6, :cond_2

    move-object/from16 v6, p1

    invoke-virtual {v11, v6}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_4

    const/16 v7, 0x20

    goto :goto_2

    :cond_4
    const/16 v7, 0x10

    :goto_2
    or-int/2addr v0, v7

    :goto_3
    and-int/lit8 v7, p5, 0x4

    if-eqz v7, :cond_6

    or-int/lit16 v0, v0, 0x180

    :cond_5
    move-object/from16 v8, p2

    goto :goto_5

    :cond_6
    and-int/lit16 v8, v4, 0x180

    if-nez v8, :cond_5

    move-object/from16 v8, p2

    invoke-virtual {v11, v8}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_7

    const/16 v9, 0x100

    goto :goto_4

    :cond_7
    const/16 v9, 0x80

    :goto_4
    or-int/2addr v0, v9

    :goto_5
    and-int/lit16 v9, v0, 0x93

    const/16 v10, 0x92

    const/4 v15, 0x0

    if-eq v9, v10, :cond_8

    const/4 v9, 0x1

    goto :goto_6

    :cond_8
    move v9, v15

    :goto_6
    and-int/lit8 v10, v0, 0x1

    invoke-virtual {v11, v10, v9}, Lp1/q;->U(IZ)Z

    move-result v9

    if-eqz v9, :cond_1b

    sget-object v9, Lp1/l;->a:Lp1/v0;

    if-eqz v5, :cond_a

    invoke-virtual {v11}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    if-ne v5, v9, :cond_9

    new-instance v5, Lrm2/d;

    const/16 v6, 0x15

    invoke-direct {v5, v6}, Lrm2/d;-><init>(I)V

    invoke-virtual {v11, v5}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_9
    check-cast v5, Lkotlin/jvm/functions/Function1;

    goto :goto_7

    :cond_a
    move-object v5, v6

    :goto_7
    if-eqz v7, :cond_c

    invoke-virtual {v11}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v6

    if-ne v6, v9, :cond_b

    new-instance v6, Lrx0/f;

    const/4 v7, 0x0

    invoke-direct {v6, v7}, Lrx0/f;-><init>(I)V

    invoke-virtual {v11, v6}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_b
    check-cast v6, Lc93/a;

    move-object v8, v6

    :cond_c
    const/high16 v6, 0x3f800000    # 1.0f

    sget-object v7, Lb2/t;->w:Lb2/t;

    invoke-static {v6, v7}, Landroidx/compose/foundation/layout/d;->d(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v10

    sget-object v13, Lx81/d;->a:Lx81/d;

    sget v6, Lx81/d;->b:I

    invoke-virtual {v13, v11, v6}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v6

    invoke-virtual {v6}, Ly81/i;->o()J

    move-result-wide v12

    sget-object v6, Li2/w0;->a:Li2/v0;

    invoke-static {v10, v12, v13, v6}, Landroidx/compose/foundation/a;->c(Landroidx/compose/ui/Modifier;JLi2/a1;)Landroidx/compose/ui/Modifier;

    move-result-object v6

    invoke-static {v6}, Ll0/f;->n(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v6

    int-to-float v3, v3

    const/16 v10, 0x8

    int-to-float v10, v10

    mul-float/2addr v3, v10

    invoke-static {v3, v6}, Landroidx/compose/foundation/layout/a;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v6

    sget-object v10, Ll0/m;->c:Ll0/g;

    sget-object v12, Lb2/e;->M:Lb2/k;

    invoke-static {v10, v12, v11, v15}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v10

    iget-wide v12, v11, Lp1/q;->T:J

    invoke-static {v12, v13}, Ljava/lang/Long;->hashCode(J)I

    move-result v12

    invoke-virtual {v11}, Lp1/q;->m()Lp1/p1;

    move-result-object v13

    invoke-static {v11, v6}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v6

    sget-object v16, La3/l;->a:La3/k;

    invoke-virtual/range {v16 .. v16}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v14, La3/k;->b:La3/j;

    invoke-virtual {v11}, Lp1/q;->i0()V

    iget-boolean v15, v11, Lp1/q;->S:Z

    if-eqz v15, :cond_d

    invoke-virtual {v11, v14}, Lp1/q;->l(Lc93/a;)V

    goto :goto_8

    :cond_d
    invoke-virtual {v11}, Lp1/q;->s0()V

    :goto_8
    sget-object v14, La3/k;->g:La3/i;

    invoke-static {v11, v14, v10}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v10, La3/k;->f:La3/i;

    invoke-static {v11, v10, v13}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v10, La3/k;->j:La3/i;

    iget-boolean v13, v11, Lp1/q;->S:Z

    if-nez v13, :cond_e

    invoke-virtual {v11}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v13

    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v14

    invoke-static {v13, v14}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v13

    if-nez v13, :cond_f

    :cond_e
    invoke-static {v12, v11, v12, v10}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_f
    sget-object v10, La3/k;->d:La3/i;

    invoke-static {v11, v10, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v6, Lcom/whoop/design/atomic/organism/toolbar/d;->a:Lcom/whoop/design/atomic/organism/toolbar/d$b;

    const-string v10, "JSON Playground"

    invoke-static {v10}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v10

    invoke-virtual {v6, v10}, Lcom/whoop/design/atomic/organism/toolbar/d$b;->a(Lcom/whoop/design/util/TextResource;)Lcom/whoop/design/atomic/organism/toolbar/d$a;

    move-result-object v6

    sget v10, Lcom/whoop/design/atomic/organism/toolbar/d$a;->r:I

    shl-int/lit8 v10, v10, 0x3

    shl-int/lit8 v12, v0, 0x3

    and-int/lit16 v12, v12, 0x1c00

    or-int/2addr v12, v10

    const/16 v13, 0x35

    move-object v10, v5

    const/4 v5, 0x0

    move-object v14, v7

    const/4 v7, 0x0

    move-object v15, v9

    const/4 v9, 0x0

    move-object/from16 v18, v10

    const/4 v10, 0x0

    move-object/from16 v38, v14

    move-object v14, v15

    const/high16 v15, 0x3f800000    # 1.0f

    invoke-static/range {v5 .. v13}, Lcom/whoop/design/atomic/organism/toolbar/b;->d(Landroidx/compose/ui/Modifier;Lcom/whoop/design/atomic/organism/toolbar/d;Landroidx/compose/ui/Modifier;Lc93/a;Lc93/a;Lc93/a;Landroidx/compose/runtime/Composer;II)V

    move-object/from16 v39, v8

    if-eqz v1, :cond_1a

    const v5, 0x58078e53

    invoke-virtual {v11, v5}, Lp1/q;->e0(I)V

    filled-new-array {v1}, [Ljava/lang/Object;

    move-result-object v5

    and-int/lit8 v6, v0, 0xe

    if-ne v6, v2, :cond_10

    const/4 v12, 0x1

    goto :goto_9

    :cond_10
    const/4 v12, 0x0

    :goto_9
    invoke-virtual {v11}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    if-nez v12, :cond_11

    if-ne v2, v14, :cond_12

    :cond_11
    new-instance v2, Lar0/a;

    const/16 v6, 0x8

    invoke-direct {v2, v1, v6}, Lar0/a;-><init>(Ljava/lang/String;I)V

    invoke-virtual {v11, v2}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_12
    check-cast v2, Lc93/a;

    const/4 v6, 0x0

    invoke-static {v5, v2, v11, v6}, Ly1/k;->c([Ljava/lang/Object;Lc93/a;Landroidx/compose/runtime/Composer;I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lp1/c1;

    move-object/from16 v5, v38

    invoke-static {v15, v5}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v7

    float-to-double v8, v15

    const-wide/16 v12, 0x0

    cmpl-double v8, v8, v12

    if-lez v8, :cond_13

    :goto_a
    const/4 v8, 0x1

    goto :goto_b

    :cond_13
    const-string v8, "invalid weight; must be greater than zero"

    invoke-static {v8}, Lm0/a;->a(Ljava/lang/String;)V

    goto :goto_a

    :goto_b
    invoke-static {v7, v8, v15}, Ldc/b;->g(Landroidx/compose/ui/Modifier;ZF)Landroidx/compose/ui/Modifier;

    move-result-object v7

    invoke-static {v2}, Lrx0/g;->l(Lp1/c1;)Ljava/lang/String;

    move-result-object v9

    invoke-static {v9}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v9

    const-string v10, ""

    move/from16 v17, v6

    move-object v6, v9

    invoke-static {v10}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v9

    invoke-static {v10}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v10

    invoke-virtual {v11}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v12

    if-ne v12, v14, :cond_14

    new-instance v12, Lrx0/f;

    const/4 v13, 0x1

    invoke-direct {v12, v13}, Lrx0/f;-><init>(I)V

    invoke-virtual {v11, v12}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_14
    move-object/from16 v31, v12

    check-cast v31, Lc93/a;

    invoke-virtual {v11, v2}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v12

    invoke-virtual {v11}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v13

    if-nez v12, :cond_15

    if-ne v13, v14, :cond_16

    :cond_15
    new-instance v13, Lq12/c;

    const/16 v12, 0x8

    invoke-direct {v13, v12, v2}, Lq12/c;-><init>(ILp1/c1;)V

    invoke-virtual {v11, v13}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_16
    move-object/from16 v32, v13

    check-cast v32, Lkotlin/jvm/functions/Function1;

    sget v38, Lcom/whoop/design/util/TextResource;->$stable:I

    shl-int/lit8 v12, v38, 0x3

    shl-int/lit8 v13, v38, 0xc

    or-int/2addr v12, v13

    shl-int/lit8 v13, v38, 0x18

    or-int v34, v12, v13

    const/high16 v36, 0x30000

    const v37, 0x1f7deec

    move-object v12, v5

    move-object v5, v7

    const/4 v7, 0x0

    move v13, v8

    const/4 v8, 0x0

    move-object/from16 v19, v14

    move-object v14, v10

    const/4 v10, 0x0

    move-object/from16 v33, v11

    const/4 v11, 0x0

    move-object/from16 v21, v12

    move/from16 v20, v13

    const-wide/16 v12, 0x0

    move/from16 v22, v15

    const/4 v15, 0x0

    const/16 v23, 0x20

    const/16 v16, 0x0

    move/from16 v24, v17

    const/16 v17, 0x0

    move-object/from16 v25, v18

    const/16 v18, 0x0

    move-object/from16 v26, v19

    const/16 v19, 0x1

    move/from16 v27, v20

    const/16 v20, 0x0

    move-object/from16 v28, v21

    const/16 v21, 0x0

    move/from16 v29, v22

    const/16 v22, 0x0

    move/from16 v30, v23

    const/16 v23, 0x0

    move/from16 v35, v24

    const/16 v24, 0x0

    move-object/from16 v40, v25

    const/16 v25, 0x0

    move-object/from16 v41, v26

    const/16 v26, 0x0

    move/from16 v42, v27

    const/16 v27, 0x0

    move-object/from16 v43, v28

    const/16 v28, 0x0

    move/from16 v44, v29

    const/16 v29, 0x0

    move/from16 v45, v30

    const/16 v30, 0x0

    move/from16 v46, v35

    const v35, 0x30000c00

    move/from16 p3, v0

    move-object/from16 v0, v40

    move-object/from16 v47, v41

    move-object/from16 v4, v43

    move/from16 v1, v44

    invoke-static/range {v5 .. v37}, Lqz0/k;->m(Landroidx/compose/ui/Modifier;Lcom/whoop/design/util/TextResource;Lb91/a;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lc93/m;Lqz0/c;JLcom/whoop/design/util/TextResource;ZZLb91/a;ZIIIZLq3/g0;ZZLj0/i;Li2/a1;Lg1/e8;Ll0/k1;Lu0/q0;Lc93/a;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;IIII)V

    move-object/from16 v11, v33

    invoke-static {v4, v3, v11, v4, v1}, Lq63/c;->e(Lb2/t;FLp1/q;Lb2/t;F)Landroidx/compose/ui/Modifier;

    move-result-object v5

    const-string v1, "Render"

    invoke-static {v1}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v1

    invoke-static {v2}, Lrx0/g;->l(Lp1/c1;)Ljava/lang/String;

    move-result-object v3

    invoke-static {v3}, Lyb3/r;->i0(Ljava/lang/CharSequence;)Z

    move-result v3

    xor-int/lit8 v6, v3, 0x1

    and-int/lit8 v3, p3, 0x70

    const/16 v4, 0x20

    if-ne v3, v4, :cond_17

    move/from16 v15, v42

    goto :goto_c

    :cond_17
    const/4 v15, 0x0

    :goto_c
    invoke-virtual {v11, v2}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v3

    or-int/2addr v3, v15

    invoke-virtual {v11}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    if-nez v3, :cond_18

    move-object/from16 v14, v47

    if-ne v4, v14, :cond_19

    :cond_18
    new-instance v4, Lpj2/g;

    const/4 v3, 0x4

    invoke-direct {v4, v0, v2, v3}, Lpj2/g;-><init>(Lkotlin/jvm/functions/Function1;Lp1/c1;I)V

    invoke-virtual {v11, v4}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_19
    move-object/from16 v18, v4

    check-cast v18, Lc93/a;

    shl-int/lit8 v2, v38, 0x12

    or-int/lit8 v20, v2, 0x6

    const/16 v21, 0x0

    const/16 v22, 0x1fbc

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    move-object/from16 v19, v11

    move-object v11, v1

    invoke-static/range {v5 .. v22}, Lny0/z;->j(Landroidx/compose/ui/Modifier;ZZLjava/lang/Integer;Landroidx/compose/ui/Modifier;Lv41/r0;Lcom/whoop/design/util/TextResource;Lg1/u0;Li2/t;Lf0/t;FLl0/k1;Lb91/a;Lc93/a;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v11, v19

    const/4 v6, 0x0

    invoke-virtual {v11, v6}, Lp1/q;->q(Z)V

    :goto_d
    move/from16 v13, v42

    goto :goto_e

    :cond_1a
    move-object/from16 v0, v18

    const/4 v6, 0x0

    const/16 v42, 0x1

    const v1, 0x58147984

    invoke-virtual {v11, v1}, Lp1/q;->e0(I)V

    invoke-virtual {v11, v6}, Lp1/q;->q(Z)V

    goto :goto_d

    :goto_e
    invoke-virtual {v11, v13}, Lp1/q;->q(Z)V

    move-object v2, v0

    move-object/from16 v3, v39

    goto :goto_f

    :cond_1b
    invoke-virtual {v11}, Lp1/q;->X()V

    move-object v2, v6

    move-object v3, v8

    :goto_f
    invoke-virtual {v11}, Lp1/q;->u()Lp1/v1;

    move-result-object v7

    if-eqz v7, :cond_1c

    new-instance v0, Lqb0/a;

    const/16 v6, 0x17

    move-object/from16 v1, p0

    move/from16 v4, p4

    move/from16 v5, p5

    invoke-direct/range {v0 .. v6}, Lqb0/a;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;III)V

    iput-object v0, v7, Lp1/v1;->d:Lc93/m;

    :cond_1c
    return-void
.end method

.method private static final i(Ljava/lang/String;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final j()Ll83/a0;
    .locals 1

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method

.method private static final k(Ljava/lang/String;)Lp1/c1;
    .locals 0

    invoke-static {p0}, Lp1/x;->z(Ljava/lang/Object;)Lp1/k1;

    move-result-object p0

    return-object p0
.end method

.method private static final l(Lp1/c1;)Ljava/lang/String;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp1/c1;",
            ")",
            "Ljava/lang/String;"
        }
    .end annotation

    invoke-interface {p0}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/String;

    return-object p0
.end method

.method private static final m(Lp1/c1;Ljava/lang/String;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp1/c1;",
            "Ljava/lang/String;",
            ")V"
        }
    .end annotation

    invoke-interface {p0, p1}, Lp1/c1;->setValue(Ljava/lang/Object;)V

    return-void
.end method

.method private static final n()Ll83/a0;
    .locals 1

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method

.method private static final o(Lp1/c1;Ljava/lang/String;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p0, p1}, Lrx0/g;->m(Lp1/c1;Ljava/lang/String;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final p(Lkotlin/jvm/functions/Function1;Lp1/c1;)Ll83/a0;
    .locals 0

    invoke-static {p1}, Lrx0/g;->l(Lp1/c1;)Ljava/lang/String;

    move-result-object p1

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final q(Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lc93/a;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 6

    or-int/lit8 p3, p3, 0x1

    invoke-static {p3}, Lp1/x;->L(I)I

    move-result v4

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move v5, p4

    move-object v3, p5

    invoke-static/range {v0 .. v5}, Lrx0/g;->h(Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lc93/a;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method
