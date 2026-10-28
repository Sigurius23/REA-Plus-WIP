.class public abstract Lgo1/b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\u0008\u0004\u001aC\u0010\u0008\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0014\u0008\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\u0014\u0008\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00040\u0002H\u0001\u00a2\u0006\u0004\u0008\u0008\u0010\t\u00a8\u0006\n"
    }
    d2 = {
        "Lbo1/b;",
        "viewState",
        "Lkotlin/Function1;",
        "",
        "Ll83/a0;",
        "onToggle",
        "",
        "onCtaClick",
        "f",
        "(Lbo1/b;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V",
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
.method public static synthetic a(Ljava/lang/Object;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lgo1/b;->h(Ljava/lang/Object;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Z)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lgo1/b;->g(Z)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Lbo1/b;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lgo1/b;->i(Lbo1/b;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Lbo1/b;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p6}, Lgo1/b;->k(Lbo1/b;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic e(Lkotlin/jvm/functions/Function1;Z)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lgo1/b;->j(Lkotlin/jvm/functions/Function1;Z)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final f(Lbo1/b;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V
    .locals 40
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lbo1/b;",
            "Lkotlin/jvm/functions/Function1;",
            "Lkotlin/jvm/functions/Function1;",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    move-object/from16 v4, p0

    move/from16 v1, p4

    const-string v0, "viewState"

    invoke-static {v4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v14, p3

    check-cast v14, Lp1/q;

    const v0, -0x117491d6

    invoke-virtual {v14, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, v1, 0x6

    if-nez v0, :cond_2

    and-int/lit8 v0, v1, 0x8

    if-nez v0, :cond_0

    invoke-virtual {v14, v4}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v0

    goto :goto_0

    :cond_0
    invoke-virtual {v14, v4}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v0

    :goto_0
    if-eqz v0, :cond_1

    const/4 v0, 0x4

    goto :goto_1

    :cond_1
    const/4 v0, 0x2

    :goto_1
    or-int/2addr v0, v1

    goto :goto_2

    :cond_2
    move v0, v1

    :goto_2
    and-int/lit8 v5, p5, 0x2

    if-eqz v5, :cond_4

    or-int/lit8 v0, v0, 0x30

    :cond_3
    move-object/from16 v6, p1

    goto :goto_4

    :cond_4
    and-int/lit8 v6, v1, 0x30

    if-nez v6, :cond_3

    move-object/from16 v6, p1

    invoke-virtual {v14, v6}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_5

    const/16 v7, 0x20

    goto :goto_3

    :cond_5
    const/16 v7, 0x10

    :goto_3
    or-int/2addr v0, v7

    :goto_4
    and-int/lit8 v7, p5, 0x4

    if-eqz v7, :cond_7

    or-int/lit16 v0, v0, 0x180

    :cond_6
    move-object/from16 v8, p2

    goto :goto_6

    :cond_7
    and-int/lit16 v8, v1, 0x180

    if-nez v8, :cond_6

    move-object/from16 v8, p2

    invoke-virtual {v14, v8}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_8

    const/16 v9, 0x100

    goto :goto_5

    :cond_8
    const/16 v9, 0x80

    :goto_5
    or-int/2addr v0, v9

    :goto_6
    and-int/lit16 v9, v0, 0x93

    const/16 v10, 0x92

    const/4 v11, 0x0

    if-eq v9, v10, :cond_9

    const/4 v9, 0x1

    goto :goto_7

    :cond_9
    move v9, v11

    :goto_7
    and-int/lit8 v10, v0, 0x1

    invoke-virtual {v14, v10, v9}, Lp1/q;->U(IZ)Z

    move-result v9

    if-eqz v9, :cond_16

    sget-object v9, Lp1/l;->a:Lp1/v0;

    if-eqz v5, :cond_b

    invoke-virtual {v14}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    if-ne v5, v9, :cond_a

    new-instance v5, Lg40/y1;

    const/16 v6, 0x1d

    invoke-direct {v5, v6}, Lg40/y1;-><init>(I)V

    invoke-virtual {v14, v5}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_a
    check-cast v5, Lkotlin/jvm/functions/Function1;

    goto :goto_8

    :cond_b
    move-object v5, v6

    :goto_8
    if-eqz v7, :cond_d

    invoke-virtual {v14}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v6

    if-ne v6, v9, :cond_c

    new-instance v6, Lgo1/a;

    const/4 v7, 0x0

    invoke-direct {v6, v7}, Lgo1/a;-><init>(I)V

    invoke-virtual {v14, v6}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_c
    check-cast v6, Lkotlin/jvm/functions/Function1;

    move-object/from16 v31, v6

    goto :goto_9

    :cond_d
    move-object/from16 v31, v8

    :goto_9
    sget-object v6, Ll0/m;->c:Ll0/g;

    sget-object v7, Lb2/e;->M:Lb2/k;

    invoke-static {v6, v7, v14, v11}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v6

    iget-wide v7, v14, Lp1/q;->T:J

    invoke-static {v7, v8}, Ljava/lang/Long;->hashCode(J)I

    move-result v7

    invoke-virtual {v14}, Lp1/q;->m()Lp1/p1;

    move-result-object v8

    sget-object v9, Lb2/t;->w:Lb2/t;

    invoke-static {v14, v9}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v10

    sget-object v13, La3/l;->a:La3/k;

    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v13, La3/k;->b:La3/j;

    invoke-virtual {v14}, Lp1/q;->i0()V

    iget-boolean v15, v14, Lp1/q;->S:Z

    if-eqz v15, :cond_e

    invoke-virtual {v14, v13}, Lp1/q;->l(Lc93/a;)V

    goto :goto_a

    :cond_e
    invoke-virtual {v14}, Lp1/q;->s0()V

    :goto_a
    sget-object v15, La3/k;->g:La3/i;

    invoke-static {v14, v15, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v6, La3/k;->f:La3/i;

    invoke-static {v14, v6, v8}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v8, La3/k;->j:La3/i;

    iget-boolean v11, v14, Lp1/q;->S:Z

    if-nez v11, :cond_f

    invoke-virtual {v14}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v11

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-static {v11, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_10

    :cond_f
    invoke-static {v7, v14, v7, v8}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_10
    sget-object v2, La3/k;->d:La3/i;

    invoke-static {v14, v2, v10}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const/high16 v7, 0x3f800000    # 1.0f

    invoke-static {v7, v9}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v10

    sget-object v11, Ll0/m;->g:Ll0/h;

    sget-object v3, Lb2/e;->K:Lb2/l;

    const/16 v12, 0x36

    invoke-static {v11, v3, v14, v12}, Ll0/p1;->a(Ll0/i;Lb2/g;Landroidx/compose/runtime/Composer;I)Ll0/r1;

    move-result-object v3

    iget-wide v11, v14, Lp1/q;->T:J

    invoke-static {v11, v12}, Ljava/lang/Long;->hashCode(J)I

    move-result v11

    invoke-virtual {v14}, Lp1/q;->m()Lp1/p1;

    move-result-object v12

    invoke-static {v14, v10}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v10

    invoke-virtual {v14}, Lp1/q;->i0()V

    iget-boolean v7, v14, Lp1/q;->S:Z

    if-eqz v7, :cond_11

    invoke-virtual {v14, v13}, Lp1/q;->l(Lc93/a;)V

    goto :goto_b

    :cond_11
    invoke-virtual {v14}, Lp1/q;->s0()V

    :goto_b
    invoke-static {v14, v15, v3}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v14, v6, v12}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v3, v14, Lp1/q;->S:Z

    if-nez v3, :cond_12

    invoke-virtual {v14}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-static {v3, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_13

    :cond_12
    invoke-static {v11, v14, v11, v8}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_13
    invoke-static {v14, v2, v10}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const/high16 v2, 0x3f800000    # 1.0f

    float-to-double v6, v2

    const-wide/16 v2, 0x0

    cmpl-double v2, v6, v2

    if-lez v2, :cond_14

    const/4 v11, 0x1

    goto :goto_c

    :cond_14
    const/4 v11, 0x0

    :goto_c
    if-nez v11, :cond_15

    const-string v2, "invalid weight; must be greater than zero"

    invoke-static {v2}, Lm0/a;->a(Ljava/lang/String;)V

    :cond_15
    new-instance v6, Landroidx/compose/foundation/layout/LayoutWeightElement;

    const/high16 v2, 0x3f800000    # 1.0f

    const/4 v3, 0x1

    invoke-direct {v6, v2, v3}, Landroidx/compose/foundation/layout/LayoutWeightElement;-><init>(FZ)V

    invoke-virtual {v4}, Lbo1/b;->g()Lcom/whoop/design/util/TextResource;

    move-result-object v2

    sget v7, Lcom/whoop/design/util/TextResource;->$stable:I

    invoke-static {v2, v14, v7}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v2

    sget-object v8, Lx81/d;->a:Lx81/d;

    sget v10, Lx81/d;->b:I

    invoke-virtual {v8, v14, v10}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v11

    invoke-virtual {v11}, Lb91/d;->L()Lb91/a;

    move-result-object v25

    invoke-virtual {v8, v14, v10}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v11

    invoke-virtual {v11}, Ly81/i;->y()J

    move-result-wide v11

    sget v13, Lb91/a;->d:I

    shl-int/lit8 v29, v13, 0x12

    const v30, 0x2fff8

    move-object v15, v9

    move v13, v10

    const-wide/16 v9, 0x0

    move-object/from16 v16, v8

    move-wide/from16 v38, v11

    move v12, v7

    move-wide/from16 v7, v38

    const/4 v11, 0x0

    move/from16 v17, v12

    const/4 v12, 0x0

    move/from16 v18, v13

    const/4 v13, 0x0

    move-object/from16 v27, v14

    move-object/from16 v19, v15

    const-wide/16 v14, 0x0

    move-object/from16 v20, v16

    const/16 v16, 0x0

    move/from16 v21, v17

    const/16 v17, 0x0

    move/from16 v22, v18

    move-object/from16 v23, v19

    const-wide/16 v18, 0x0

    move-object/from16 v24, v20

    const/16 v20, 0x0

    move/from16 v26, v21

    const/16 v21, 0x0

    move/from16 v28, v22

    const/16 v22, 0x0

    move-object/from16 v33, v23

    const/16 v23, 0x0

    move-object/from16 v34, v24

    const/16 v24, 0x0

    move/from16 v35, v26

    const/16 v26, 0x0

    move/from16 v36, v28

    const/16 v28, 0x0

    move-object v1, v5

    move-object v5, v2

    move-object v2, v1

    move-object/from16 v37, v33

    move-object/from16 v1, v34

    move/from16 v33, v0

    move/from16 v0, v36

    invoke-static/range {v5 .. v30}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v14, v27

    invoke-virtual {v1, v14, v0}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v5

    invoke-virtual {v5}, Ly81/i;->a()J

    move-result-wide v7

    new-instance v5, Lf01/f;

    const/16 v6, 0x13

    invoke-direct {v5, v6, v4, v2}, Lf01/f;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    const v6, -0x12139cd5

    invoke-static {v6, v14, v5}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v13

    const/16 v15, 0x6000

    const/16 v16, 0xd

    const-wide/16 v5, 0x0

    const-wide/16 v11, 0x0

    invoke-static/range {v5 .. v16}, Ly81/c;->b(JJJJLc93/m;Landroidx/compose/runtime/Composer;II)V

    invoke-virtual {v14, v3}, Lp1/q;->q(Z)V

    const/4 v5, 0x2

    int-to-float v6, v5

    const/4 v5, 0x4

    int-to-float v5, v5

    mul-float/2addr v6, v5

    move-object/from16 v7, v37

    invoke-static {v6, v7}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v6

    invoke-static {v14, v6}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    invoke-virtual {v4}, Lbo1/b;->e()Lcom/whoop/design/util/TextResource;

    move-result-object v6

    move/from16 v8, v35

    invoke-static {v6, v14, v8}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v1, v14, v0}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v9

    invoke-virtual {v9}, Lb91/d;->a()Lb91/a;

    move-result-object v25

    invoke-virtual {v1, v14, v0}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v0

    invoke-virtual {v0}, Ly81/i;->c1()J

    move-result-wide v0

    const v30, 0x2fffa

    move v9, v5

    move-object v5, v6

    const/4 v6, 0x0

    move v11, v9

    const-wide/16 v9, 0x0

    move v12, v11

    const/4 v11, 0x0

    move v13, v12

    const/4 v12, 0x0

    move v15, v13

    const/4 v13, 0x0

    move/from16 v16, v15

    const-wide/16 v14, 0x0

    move/from16 v17, v16

    const/16 v16, 0x0

    move/from16 v18, v17

    const/16 v17, 0x0

    move/from16 v20, v18

    const-wide/16 v18, 0x0

    move/from16 v21, v20

    const/16 v20, 0x0

    move/from16 v22, v21

    const/16 v21, 0x0

    move/from16 v23, v22

    const/16 v22, 0x0

    move/from16 v24, v23

    const/16 v23, 0x0

    move/from16 v26, v24

    const/16 v24, 0x0

    move/from16 v32, v26

    const/16 v26, 0x0

    move-wide/from16 v38, v0

    move-object v1, v7

    move-wide/from16 v7, v38

    move/from16 v0, v32

    invoke-static/range {v5 .. v30}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v14, v27

    int-to-float v5, v3

    invoke-static {v5, v0, v1, v14}, Lih0/d0;->u(FFLb2/t;Lp1/q;)V

    const-wide/high16 v5, -0x4008000000000000L    # -1.5

    double-to-float v0, v5

    const/16 v5, 0x8

    int-to-float v5, v5

    mul-float/2addr v0, v5

    const/4 v5, 0x0

    const/4 v6, 0x2

    invoke-static {v1, v0, v5, v6}, Landroidx/compose/foundation/layout/a;->n(Landroidx/compose/ui/Modifier;FFI)Landroidx/compose/ui/Modifier;

    move-result-object v5

    sget-object v0, Lny0/n0;->TextSmall:Lny0/n0;

    invoke-virtual {v4}, Lbo1/b;->c()Lcom/whoop/design/util/TextResource;

    move-result-object v7

    new-instance v9, Ly71/g;

    invoke-virtual {v4}, Lbo1/b;->b()Lgz0/m0;

    move-result-object v1

    invoke-virtual {v1}, Lgz0/m0;->toWhoopIcon()I

    move-result v1

    const/4 v8, 0x0

    invoke-direct {v9, v1, v8, v6, v8}, Ly71/g;-><init>(ILcom/whoop/design/util/TextResource;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    shl-int/lit8 v1, v35, 0x6

    or-int/lit16 v1, v1, 0xc30

    sget v6, Ly71/g;->c:I

    shl-int/lit8 v6, v6, 0xc

    or-int v19, v1, v6

    move/from16 v1, v33

    and-int/lit16 v1, v1, 0x380

    const/16 v21, 0xfe0

    const/4 v10, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    move-object v6, v0

    move/from16 v20, v1

    move-object/from16 v18, v27

    move-object/from16 v17, v31

    invoke-static/range {v5 .. v21}, Lny0/l0;->i(Landroidx/compose/ui/Modifier;Lny0/n0;Lcom/whoop/design/util/TextResource;Ly71/g;Ly71/g;ZLy81/e;Lj91/b;ZZLjava/lang/Float;Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v14, v18

    invoke-virtual {v14, v3}, Lp1/q;->q(Z)V

    move-object v6, v2

    move-object/from16 v5, v17

    goto :goto_d

    :cond_16
    invoke-virtual {v14}, Lp1/q;->X()V

    move-object v5, v8

    :goto_d
    invoke-virtual {v14}, Lp1/q;->u()Lp1/v1;

    move-result-object v7

    if-eqz v7, :cond_17

    new-instance v0, Lf02/c;

    const/16 v3, 0xe

    move/from16 v1, p4

    move/from16 v2, p5

    invoke-direct/range {v0 .. v6}, Lf02/c;-><init>(IIILjava/lang/Object;Ljava/lang/Object;Ll83/e;)V

    iput-object v0, v7, Lp1/v1;->d:Lc93/m;

    :cond_17
    return-void
.end method

.method private static final g(Z)Ll83/a0;
    .locals 0

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final h(Ljava/lang/Object;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final i(Lbo1/b;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 12

    and-int/lit8 v0, p3, 0x3

    const/4 v1, 0x2

    const/4 v2, 0x1

    if-eq v0, v1, :cond_0

    move v0, v2

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    and-int/2addr p3, v2

    move-object v9, p2

    check-cast v9, Lp1/q;

    invoke-virtual {v9, p3, v0}, Lp1/q;->U(IZ)Z

    move-result p2

    if-eqz p2, :cond_3

    invoke-virtual {p0}, Lbo1/b;->f()Z

    move-result v2

    invoke-virtual {v9, p1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result p0

    invoke-virtual {v9}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object p2

    if-nez p0, :cond_1

    sget-object p0, Lp1/l;->a:Lp1/v0;

    if-ne p2, p0, :cond_2

    :cond_1
    new-instance p2, Lge0/c;

    const/4 p0, 0x6

    invoke-direct {p2, p1, p0}, Lge0/c;-><init>(Lkotlin/jvm/functions/Function1;I)V

    invoke-virtual {v9, p2}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_2
    move-object v8, p2

    check-cast v8, Lkotlin/jvm/functions/Function1;

    const/4 v10, 0x0

    const/16 v11, 0x3d

    const/4 v1, 0x0

    const/4 v3, 0x0

    const-wide/16 v4, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-static/range {v1 .. v11}, Lpz0/d;->e(Landroidx/compose/ui/Modifier;ZZJLpz0/e;Li2/t;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    goto :goto_1

    :cond_3
    invoke-virtual {v9}, Lp1/q;->X()V

    :goto_1
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final j(Lkotlin/jvm/functions/Function1;Z)Ll83/a0;
    .locals 0

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final k(Lbo1/b;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 6

    or-int/lit8 p3, p3, 0x1

    invoke-static {p3}, Lp1/x;->L(I)I

    move-result v4

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move v5, p4

    move-object v3, p5

    invoke-static/range {v0 .. v5}, Lgo1/b;->f(Lbo1/b;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method
