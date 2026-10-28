.class public abstract Lep1/w;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0002\u0008\u0002\u001a-\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0014\u0008\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0007\u00a2\u0006\u0004\u0008\u0006\u0010\u0007\u00a8\u0006\n\u00b2\u0006\u000e\u0010\t\u001a\u00020\u00088\n@\nX\u008a\u008e\u0002"
    }
    d2 = {
        "Lcp1/r;",
        "viewState",
        "Lkotlin/Function1;",
        "Lcp1/i;",
        "Ll83/a0;",
        "onViewEvent",
        "k",
        "(Lcp1/r;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V",
        "",
        "selectedNumber",
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
.method public static synthetic a(Lkotlin/jvm/functions/Function1;Lcp1/r;Ljava/lang/Object;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, Lep1/w;->u(Lkotlin/jvm/functions/Function1;Lcp1/r;Ljava/lang/Object;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(I)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lep1/w;->r(I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Lkotlin/jvm/functions/Function1;Lcp1/r;Lp1/c1;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, Lep1/w;->t(Lkotlin/jvm/functions/Function1;Lcp1/r;Lp1/c1;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lep1/w;->p(Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic e(Lcp1/r;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p5}, Lep1/w;->w(Lcp1/r;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic f(Lcp1/i;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lep1/w;->l(Lcp1/i;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic g(ILjava/lang/String;)Ljava/lang/String;
    .locals 0

    invoke-static {p1, p0}, Lep1/w;->s(Ljava/lang/String;I)Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic h(ILp1/c1;)Ll83/a0;
    .locals 0

    invoke-static {p1, p0}, Lep1/w;->q(Lp1/c1;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic i(Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lep1/w;->v(Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic j(Lcp1/r;Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lep1/w;->o(Lcp1/r;Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final k(Lcp1/r;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V
    .locals 54
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcp1/r;",
            "Lkotlin/jvm/functions/Function1;",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    move-object/from16 v1, p0

    const-string v0, "viewState"

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v13, p2

    check-cast v13, Lp1/q;

    const v0, 0x11543ea5

    invoke-virtual {v13, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, p3, 0x6

    const/4 v12, 0x4

    if-nez v0, :cond_2

    and-int/lit8 v0, p3, 0x8

    if-nez v0, :cond_0

    invoke-virtual {v13, v1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v0

    goto :goto_0

    :cond_0
    invoke-virtual {v13, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v0

    :goto_0
    if-eqz v0, :cond_1

    move v0, v12

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

    const/16 v14, 0x20

    if-eqz v2, :cond_4

    or-int/lit8 v0, v0, 0x30

    :cond_3
    move-object/from16 v3, p1

    goto :goto_4

    :cond_4
    and-int/lit8 v3, p3, 0x30

    if-nez v3, :cond_3

    move-object/from16 v3, p1

    invoke-virtual {v13, v3}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_5

    move v4, v14

    goto :goto_3

    :cond_5
    const/16 v4, 0x10

    :goto_3
    or-int/2addr v0, v4

    :goto_4
    and-int/lit8 v4, v0, 0x13

    const/16 v15, 0x12

    const/4 v5, 0x0

    if-eq v4, v15, :cond_6

    const/4 v4, 0x1

    goto :goto_5

    :cond_6
    move v4, v5

    :goto_5
    and-int/lit8 v7, v0, 0x1

    invoke-virtual {v13, v7, v4}, Lp1/q;->U(IZ)Z

    move-result v4

    if-eqz v4, :cond_2e

    sget-object v4, Lp1/l;->a:Lp1/v0;

    if-eqz v2, :cond_8

    invoke-virtual {v13}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v4, :cond_7

    new-instance v2, Lep1/a;

    const/16 v3, 0x18

    invoke-direct {v2, v3}, Lep1/a;-><init>(I)V

    invoke-virtual {v13, v2}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_7
    check-cast v2, Lkotlin/jvm/functions/Function1;

    goto :goto_6

    :cond_8
    move-object v2, v3

    :goto_6
    invoke-virtual {v13}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    if-ne v3, v4, :cond_9

    invoke-virtual {v1}, Lcp1/r;->b()I

    move-result v3

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-static {v3}, Lp1/x;->z(Ljava/lang/Object;)Lp1/k1;

    move-result-object v3

    invoke-virtual {v13, v3}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_9
    check-cast v3, Lp1/c1;

    const/high16 v7, 0x3f800000    # 1.0f

    sget-object v8, Lb2/t;->w:Lb2/t;

    invoke-static {v7, v8}, Landroidx/compose/foundation/layout/d;->d(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v9

    invoke-static {v9}, Lgb1/b0;->b0(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v9

    invoke-static {v9}, Ll0/f;->k(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v9

    sget-object v10, Ll0/m;->c:Ll0/g;

    sget-object v6, Lb2/e;->M:Lb2/k;

    invoke-static {v10, v6, v13, v5}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v6

    move-object/from16 v16, v8

    iget-wide v7, v13, Lp1/q;->T:J

    invoke-static {v7, v8}, Ljava/lang/Long;->hashCode(J)I

    move-result v7

    invoke-virtual {v13}, Lp1/q;->m()Lp1/p1;

    move-result-object v8

    invoke-static {v13, v9}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v9

    sget-object v10, La3/l;->a:La3/k;

    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v10, La3/k;->b:La3/j;

    invoke-virtual {v13}, Lp1/q;->i0()V

    iget-boolean v5, v13, Lp1/q;->S:Z

    if-eqz v5, :cond_a

    invoke-virtual {v13, v10}, Lp1/q;->l(Lc93/a;)V

    goto :goto_7

    :cond_a
    invoke-virtual {v13}, Lp1/q;->s0()V

    :goto_7
    sget-object v5, La3/k;->g:La3/i;

    invoke-static {v13, v5, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v6, La3/k;->f:La3/i;

    invoke-static {v13, v6, v8}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v8, La3/k;->j:La3/i;

    iget-boolean v11, v13, Lp1/q;->S:Z

    if-nez v11, :cond_b

    invoke-virtual {v13}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v11

    move/from16 v19, v15

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v15

    invoke-static {v11, v15}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v11

    if-nez v11, :cond_c

    goto :goto_8

    :cond_b
    move/from16 v19, v15

    :goto_8
    invoke-static {v7, v13, v7, v8}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_c
    sget-object v11, La3/k;->d:La3/i;

    invoke-static {v13, v11, v9}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual {v1}, Lcp1/r;->g()Lcom/whoop/design/util/TextResource;

    move-result-object v7

    move-object v9, v3

    invoke-virtual {v1}, Lcp1/r;->f()Lcom/whoop/design/util/TextResource;

    move-result-object v3

    invoke-virtual {v1}, Lcp1/r;->k()Lcom/whoop/design/util/TextResource;

    move-result-object v15

    invoke-virtual {v1}, Lcp1/r;->i()Lcp1/c;

    move-result-object v20

    if-eqz v20, :cond_d

    invoke-virtual {v1}, Lcp1/r;->j()Lcom/whoop/hormonalinsights/postpartum/domain/models/HormonalScreenId;

    move-result-object v20

    if-eqz v20, :cond_d

    invoke-static {v15}, Lcom/whoop/design/util/b;->d(Lcom/whoop/design/util/TextResource;)Z

    move-result v20

    if-eqz v20, :cond_d

    const/16 v20, 0x1

    :goto_9
    move-object/from16 v21, v15

    goto :goto_a

    :cond_d
    const/16 v20, 0x0

    goto :goto_9

    :goto_a
    if-eqz v20, :cond_e

    move-object/from16 v20, v5

    move-object/from16 v5, v21

    goto :goto_b

    :cond_e
    move-object/from16 v20, v5

    const/4 v5, 0x0

    :goto_b
    and-int/lit8 v15, v0, 0xe

    if-eq v15, v12, :cond_10

    and-int/lit8 v22, v0, 0x8

    if-eqz v22, :cond_f

    invoke-virtual {v13, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v22

    if-eqz v22, :cond_f

    goto :goto_c

    :cond_f
    const/16 v22, 0x0

    goto :goto_d

    :cond_10
    :goto_c
    const/16 v22, 0x1

    :goto_d
    and-int/lit8 v12, v0, 0x70

    if-ne v12, v14, :cond_11

    const/16 v24, 0x1

    goto :goto_e

    :cond_11
    const/16 v24, 0x0

    :goto_e
    or-int v22, v22, v24

    invoke-virtual {v13}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v14

    if-nez v22, :cond_13

    if-ne v14, v4, :cond_12

    goto :goto_f

    :cond_12
    move/from16 v28, v0

    goto :goto_10

    :cond_13
    :goto_f
    new-instance v14, Ld30/l;

    move/from16 v28, v0

    const/16 v0, 0x14

    invoke-direct {v14, v0, v1, v2}, Ld30/l;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v13, v14}, Lp1/q;->p0(Ljava/lang/Object;)V

    :goto_10
    check-cast v14, Lc93/a;

    const/16 v0, 0x20

    if-ne v12, v0, :cond_14

    const/16 v22, 0x1

    goto :goto_11

    :cond_14
    const/16 v22, 0x0

    :goto_11
    invoke-virtual {v13}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v0

    if-nez v22, :cond_16

    if-ne v0, v4, :cond_15

    goto :goto_12

    :cond_15
    move-object/from16 v22, v3

    goto :goto_13

    :cond_16
    :goto_12
    new-instance v0, Leo2/j;

    move-object/from16 v22, v3

    const/16 v3, 0x13

    invoke-direct {v0, v2, v3}, Leo2/j;-><init>(Lkotlin/jvm/functions/Function1;I)V

    invoke-virtual {v13, v0}, Lp1/q;->p0(Ljava/lang/Object;)V

    :goto_13
    check-cast v0, Lc93/a;

    sget v3, Lcom/whoop/design/util/TextResource;->$stable:I

    shl-int/lit8 v25, v3, 0x3

    or-int v29, v3, v25

    shl-int/lit8 v25, v3, 0x9

    or-int v25, v29, v25

    move-object/from16 v26, v10

    const/4 v10, 0x4

    move-object/from16 v27, v4

    const/4 v4, 0x0

    move-object/from16 v32, v6

    move-object/from16 v33, v8

    move-object/from16 p1, v9

    move/from16 p2, v12

    move-object v8, v13

    move-object v6, v14

    move/from16 v17, v15

    move-object/from16 v15, v16

    move-object/from16 v31, v20

    move/from16 v9, v25

    move-object/from16 v30, v26

    move-object/from16 v34, v27

    const/high16 v13, 0x3f800000    # 1.0f

    const/4 v14, 0x1

    move-object/from16 v16, v2

    move v12, v3

    move-object v2, v7

    move-object/from16 v3, v22

    move-object v7, v0

    const/4 v0, 0x0

    invoke-static/range {v2 .. v10}, Lep1/s;->e(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;ILcom/whoop/design/util/TextResource;Lc93/a;Lc93/a;Landroidx/compose/runtime/Composer;II)V

    move-object v7, v8

    const/4 v2, 0x3

    int-to-float v2, v2

    const/16 v3, 0x8

    int-to-float v4, v3

    mul-float v5, v2, v4

    const-wide/high16 v8, 0x3ff8000000000000L    # 1.5

    double-to-float v6, v8

    mul-float/2addr v6, v4

    invoke-static {v15, v5, v5, v5, v6}, Landroidx/compose/foundation/layout/a;->s(Landroidx/compose/ui/Modifier;FFFF)Landroidx/compose/ui/Modifier;

    move-result-object v6

    invoke-static {v0, v7, v14}, Lq83/g;->U(ILandroidx/compose/runtime/Composer;I)Lf0/r1;

    move-result-object v8

    const/16 v9, 0xe

    invoke-static {v6, v8, v9}, Lq83/g;->f0(Landroidx/compose/ui/Modifier;Lf0/r1;I)Landroidx/compose/ui/Modifier;

    move-result-object v6

    float-to-double v8, v13

    const-wide/16 v25, 0x0

    cmpl-double v8, v8, v25

    if-lez v8, :cond_17

    goto :goto_14

    :cond_17
    const-string v8, "invalid weight; must be greater than zero"

    invoke-static {v8}, Lm0/a;->a(Ljava/lang/String;)V

    :goto_14
    new-instance v8, Landroidx/compose/foundation/layout/LayoutWeightElement;

    const v9, 0x7f7fffff    # Float.MAX_VALUE

    cmpl-float v10, v13, v9

    if-lez v10, :cond_18

    goto :goto_15

    :cond_18
    move v9, v13

    :goto_15
    invoke-direct {v8, v9, v14}, Landroidx/compose/foundation/layout/LayoutWeightElement;-><init>(FZ)V

    invoke-interface {v6, v8}, Landroidx/compose/ui/Modifier;->e(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v6

    sget-object v8, Lb2/e;->N:Lb2/k;

    sget-object v9, Ll0/m;->d:Ll0/g;

    const/16 v10, 0x36

    invoke-static {v9, v8, v7, v10}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v9

    move/from16 v20, v4

    iget-wide v3, v7, Lp1/q;->T:J

    invoke-static {v3, v4}, Ljava/lang/Long;->hashCode(J)I

    move-result v3

    invoke-virtual {v7}, Lp1/q;->m()Lp1/p1;

    move-result-object v4

    invoke-static {v7, v6}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v6

    invoke-virtual {v7}, Lp1/q;->i0()V

    iget-boolean v10, v7, Lp1/q;->S:Z

    if-eqz v10, :cond_19

    move-object/from16 v10, v30

    invoke-virtual {v7, v10}, Lp1/q;->l(Lc93/a;)V

    :goto_16
    move-object/from16 v10, v31

    goto :goto_17

    :cond_19
    invoke-virtual {v7}, Lp1/q;->s0()V

    goto :goto_16

    :goto_17
    invoke-static {v7, v10, v9}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    move-object/from16 v9, v32

    invoke-static {v7, v9, v4}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v4, v7, Lp1/q;->S:Z

    if-nez v4, :cond_1a

    invoke-virtual {v7}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    invoke-static {v4, v9}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_1b

    :cond_1a
    move-object/from16 v4, v33

    invoke-static {v3, v7, v3, v4}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_1b
    invoke-static {v7, v11, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual {v1}, Lcp1/r;->l()Lcom/whoop/design/util/TextResource;

    move-result-object v3

    invoke-static {v3, v7, v12}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v3

    sget-object v4, Lx81/d;->a:Lx81/d;

    sget v6, Lx81/d;->b:I

    invoke-virtual {v4, v7, v6}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v9

    invoke-virtual {v9}, Ly81/i;->y()J

    move-result-wide v9

    invoke-virtual {v4, v7, v6}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v11

    invoke-virtual {v11}, Lb91/d;->N()Lb91/a;

    move-result-object v11

    sget v25, Lb91/a;->d:I

    shl-int/lit8 v26, v25, 0x12

    const v27, 0x2fffa

    move/from16 v19, v2

    move-object v2, v3

    const/4 v3, 0x0

    move/from16 v25, v6

    move-object/from16 v24, v7

    const/16 v30, 0x20

    const-wide/16 v6, 0x0

    move-object/from16 v31, v8

    const/4 v8, 0x0

    move/from16 v36, v5

    move-wide/from16 v52, v9

    move-object v10, v4

    move-wide/from16 v4, v52

    const/4 v9, 0x0

    move-object/from16 v32, v10

    const/4 v10, 0x0

    move-object/from16 v22, v11

    move/from16 v33, v12

    const/16 v35, 0x8

    const-wide/16 v11, 0x0

    move/from16 v37, v13

    const/4 v13, 0x0

    move/from16 v38, v14

    const/4 v14, 0x0

    move-object/from16 v40, v15

    move-object/from16 v39, v16

    const-wide/16 v15, 0x0

    move/from16 v41, v17

    const/16 v17, 0x0

    const/16 v42, 0x2

    const/16 v18, 0x0

    move/from16 v43, v19

    const/16 v19, 0x0

    move/from16 v44, v20

    const/16 v20, 0x0

    const/16 v45, 0x0

    const/16 v21, 0x0

    const/16 v46, 0x4

    const/16 v23, 0x0

    move/from16 v47, v25

    const/16 v25, 0x0

    move-object/from16 v48, v31

    move/from16 v31, v35

    move-object/from16 v30, v39

    move-object/from16 v50, v40

    move/from16 v1, v42

    move/from16 v0, v46

    move/from16 v49, v47

    invoke-static/range {v2 .. v27}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v7, v24

    int-to-float v2, v1

    int-to-float v3, v0

    mul-float/2addr v2, v3

    move-object/from16 v4, v50

    invoke-static {v2, v4}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    invoke-static {v7, v2}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    invoke-virtual/range {p0 .. p0}, Lcp1/r;->c()Lcom/whoop/design/util/TextResource;

    move-result-object v2

    move/from16 v5, v33

    invoke-static {v2, v7, v5}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v2

    move-object/from16 v6, v32

    move/from16 v8, v49

    invoke-virtual {v6, v7, v8}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v9

    invoke-virtual {v9}, Ly81/i;->c1()J

    move-result-wide v9

    invoke-virtual {v6, v7, v8}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v8

    invoke-virtual {v8}, Lb91/d;->a()Lb91/a;

    move-result-object v22

    move v8, v3

    const/4 v3, 0x0

    const-wide/16 v6, 0x0

    move v11, v8

    const/4 v8, 0x0

    move-object/from16 v16, v4

    move-wide v4, v9

    const/4 v9, 0x0

    const/4 v10, 0x0

    move v13, v11

    const-wide/16 v11, 0x0

    move v14, v13

    const/4 v13, 0x0

    move v15, v14

    const/4 v14, 0x0

    move/from16 v17, v15

    move-object/from16 v50, v16

    const-wide/16 v15, 0x0

    move/from16 v18, v17

    const/16 v17, 0x0

    move/from16 v19, v18

    const/16 v18, 0x0

    move/from16 v20, v19

    const/16 v19, 0x0

    move/from16 v21, v20

    const/16 v20, 0x0

    move/from16 v23, v21

    const/16 v21, 0x0

    move/from16 v35, v23

    const/16 v23, 0x0

    move/from16 v1, v33

    move-object/from16 v0, v50

    invoke-static/range {v2 .. v27}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v7, v24

    mul-float v2, v43, v35

    invoke-static {v2, v0}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    invoke-static {v7, v3}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    invoke-virtual/range {p0 .. p0}, Lcp1/r;->m()Lcom/whoop/design/util/TextResource;

    move-result-object v3

    invoke-static {v3, v7, v1}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual/range {p0 .. p0}, Lcp1/r;->m()Lcom/whoop/design/util/TextResource;

    move-result-object v11

    invoke-static/range {p1 .. p1}, Lep1/w;->m(Lp1/c1;)I

    move-result v4

    move v5, v4

    invoke-virtual/range {p0 .. p0}, Lcp1/r;->e()I

    move-result v4

    move v6, v5

    invoke-virtual/range {p0 .. p0}, Lcp1/r;->d()I

    move-result v5

    invoke-virtual {v7}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v8

    move-object/from16 v9, v34

    if-ne v8, v9, :cond_1c

    new-instance v8, Laq1/d;

    const/16 v10, 0x1d

    move-object/from16 v12, p1

    invoke-direct {v8, v10, v12}, Laq1/d;-><init>(ILp1/c1;)V

    invoke-virtual {v7, v8}, Lp1/q;->p0(Ljava/lang/Object;)V

    goto :goto_18

    :cond_1c
    move-object/from16 v12, p1

    :goto_18
    check-cast v8, Lkotlin/jvm/functions/Function1;

    invoke-virtual {v7}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v10

    if-ne v10, v9, :cond_1d

    new-instance v10, Lep1/a;

    const/16 v13, 0x19

    invoke-direct {v10, v13}, Lep1/a;-><init>(I)V

    invoke-virtual {v7, v10}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_1d
    check-cast v10, Lkotlin/jvm/functions/Function1;

    invoke-virtual {v7, v3}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v13

    invoke-virtual {v7}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v14

    if-nez v13, :cond_1e

    if-ne v14, v9, :cond_1f

    :cond_1e
    new-instance v14, Lb30/y4;

    const/16 v13, 0x10

    invoke-direct {v14, v3, v13}, Lb30/y4;-><init>(Ljava/lang/String;I)V

    invoke-virtual {v7, v14}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_1f
    check-cast v14, Lkotlin/jvm/functions/Function1;

    shl-int/lit8 v3, v1, 0x1b

    const v13, 0x61b6006

    or-int/2addr v3, v13

    const/4 v15, 0x0

    const/16 v16, 0x80

    move/from16 v18, v2

    const/4 v2, 0x0

    move-object v13, v12

    move-object v12, v14

    move v14, v3

    move v3, v6

    const/4 v6, 0x0

    move-object/from16 v27, v9

    const/4 v9, 0x0

    move-object/from16 v24, v7

    move-object v7, v8

    move-object v8, v10

    const/4 v10, 0x0

    move/from16 v33, v1

    move-object/from16 p1, v13

    move-object/from16 v13, v24

    move-object/from16 v1, v27

    invoke-static/range {v2 .. v16}, Lx21/d;->i(Lcom/whoop/design/util/TextResource;IIIZLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;ZZLcom/whoop/design/util/TextResource;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;III)V

    move-object v7, v13

    const/4 v10, 0x1

    invoke-virtual {v7, v10}, Lp1/q;->q(Z)V

    const/high16 v13, 0x3f800000    # 1.0f

    invoke-static {v13, v0}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v35

    const-wide/high16 v2, 0x3fe0000000000000L    # 0.5

    double-to-float v2, v2

    mul-float v37, v2, v44

    const/16 v39, 0x0

    const/16 v40, 0x8

    move/from16 v38, v36

    invoke-static/range {v35 .. v40}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v4

    invoke-virtual/range {p0 .. p0}, Lcp1/r;->i()Lcp1/c;

    move-result-object v2

    invoke-virtual/range {p0 .. p0}, Lcp1/r;->a()Lcom/whoop/design/util/TextResource;

    move-result-object v3

    move/from16 v11, p2

    const/16 v12, 0x20

    if-ne v11, v12, :cond_20

    move v5, v10

    :goto_19
    move/from16 v13, v41

    const/4 v6, 0x4

    goto :goto_1a

    :cond_20
    const/4 v5, 0x0

    goto :goto_19

    :goto_1a
    if-eq v13, v6, :cond_22

    and-int/lit8 v6, v28, 0x8

    move-object/from16 v14, p0

    if-eqz v6, :cond_21

    invoke-virtual {v7, v14}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_21

    goto :goto_1b

    :cond_21
    const/4 v6, 0x0

    goto :goto_1c

    :cond_22
    move-object/from16 v14, p0

    :goto_1b
    move v6, v10

    :goto_1c
    or-int/2addr v5, v6

    invoke-virtual {v7}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v6

    if-nez v5, :cond_24

    if-ne v6, v1, :cond_23

    goto :goto_1d

    :cond_23
    move-object/from16 v15, v30

    goto :goto_1e

    :cond_24
    :goto_1d
    new-instance v6, Ld30/r;

    const/16 v5, 0xa

    move-object/from16 v9, p1

    move-object/from16 v15, v30

    invoke-direct {v6, v15, v14, v9, v5}, Ld30/r;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    invoke-virtual {v7, v6}, Lp1/q;->p0(Ljava/lang/Object;)V

    :goto_1e
    check-cast v6, Lc93/a;

    const/16 v9, 0x8

    const/4 v5, 0x0

    move/from16 v8, v29

    invoke-static/range {v2 .. v9}, Lep1/e;->c(Lcp1/c;Lcom/whoop/design/util/TextResource;Landroidx/compose/ui/Modifier;ZLc93/a;Landroidx/compose/runtime/Composer;II)V

    invoke-virtual {v14}, Lcp1/r;->i()Lcp1/c;

    move-result-object v2

    if-nez v2, :cond_2a

    invoke-virtual {v14}, Lcp1/r;->j()Lcom/whoop/hormonalinsights/postpartum/domain/models/HormonalScreenId;

    move-result-object v2

    if-eqz v2, :cond_2a

    const v2, -0x115e781b

    invoke-virtual {v7, v2}, Lp1/q;->e0(I)V

    const/16 v20, 0x0

    const/16 v21, 0xd

    const/16 v17, 0x0

    const/16 v19, 0x0

    move-object/from16 v16, v0

    invoke-static/range {v16 .. v21}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v0

    move-object/from16 v2, v48

    invoke-static {v2, v0}, Lev/n;->g(Lb2/k;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    invoke-virtual {v14}, Lcp1/r;->k()Lcom/whoop/design/util/TextResource;

    move-result-object v4

    new-instance v6, Ly71/g;

    invoke-static/range {v32 .. v32}, Lih0/d0;->E(Lx81/d;)I

    move-result v0

    const/4 v3, 0x2

    const/4 v5, 0x0

    invoke-direct {v6, v0, v5, v3, v5}, Ly71/g;-><init>(ILcom/whoop/design/util/TextResource;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    if-ne v11, v12, :cond_25

    move v5, v10

    :goto_1f
    const/4 v0, 0x4

    goto :goto_20

    :cond_25
    const/4 v5, 0x0

    goto :goto_1f

    :goto_20
    if-eq v13, v0, :cond_27

    and-int/lit8 v0, v28, 0x8

    if-eqz v0, :cond_26

    invoke-virtual {v7, v14}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_26

    goto :goto_21

    :cond_26
    const/4 v0, 0x0

    goto :goto_22

    :cond_27
    :goto_21
    move v0, v10

    :goto_22
    or-int/2addr v0, v5

    invoke-virtual {v7}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    if-nez v0, :cond_28

    if-ne v3, v1, :cond_29

    :cond_28
    new-instance v3, Lcom/whoop/profile/view/edit/n;

    const/16 v0, 0x14

    invoke-direct {v3, v0, v15, v14}, Lcom/whoop/profile/view/edit/n;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v7, v3}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_29
    check-cast v3, Lkotlin/jvm/functions/Function1;

    shl-int/lit8 v0, v33, 0x6

    sget v5, Ly71/g;->c:I

    shl-int/lit8 v5, v5, 0xc

    or-int/2addr v0, v5

    const/16 v17, 0x0

    const/16 v18, 0xfea

    move-object v14, v3

    const/4 v3, 0x0

    const/4 v5, 0x0

    move-object/from16 v24, v7

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    move/from16 v38, v10

    const/4 v10, 0x0

    move v13, v11

    const/4 v11, 0x0

    move/from16 v30, v12

    const/4 v12, 0x0

    move/from16 v19, v13

    const/4 v13, 0x0

    move-object/from16 v27, v1

    move-object/from16 v39, v15

    move-object/from16 v51, v16

    move/from16 p2, v19

    move-object/from16 v15, v24

    move/from16 v1, v36

    move/from16 v16, v0

    move/from16 v0, v38

    invoke-static/range {v2 .. v18}, Lny0/l0;->i(Landroidx/compose/ui/Modifier;Lny0/n0;Lcom/whoop/design/util/TextResource;Ly71/g;Ly71/g;ZLy81/e;Lj91/b;ZZLjava/lang/Float;Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;III)V

    move-object v7, v15

    const/4 v2, 0x0

    invoke-virtual {v7, v2}, Lp1/q;->q(Z)V

    :goto_23
    move-object/from16 v15, v51

    goto :goto_24

    :cond_2a
    move-object/from16 v51, v0

    move-object/from16 v27, v1

    move v0, v10

    move/from16 p2, v11

    move-object/from16 v39, v15

    move/from16 v1, v36

    const/4 v2, 0x0

    const v3, -0x115856f9

    invoke-virtual {v7, v3}, Lp1/q;->e0(I)V

    invoke-virtual {v7, v2}, Lp1/q;->q(Z)V

    goto :goto_23

    :goto_24
    invoke-static {v15, v1, v7, v0}, Lq63/c;->u(Lb2/t;FLp1/q;Z)V

    move/from16 v11, p2

    const/16 v12, 0x20

    if-ne v11, v12, :cond_2b

    move v5, v0

    goto :goto_25

    :cond_2b
    const/4 v5, 0x0

    :goto_25
    invoke-virtual {v7}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    if-nez v5, :cond_2d

    move-object/from16 v9, v27

    if-ne v1, v9, :cond_2c

    goto :goto_26

    :cond_2c
    move-object/from16 v15, v39

    goto :goto_27

    :cond_2d
    :goto_26
    new-instance v1, Leo2/j;

    const/16 v2, 0x14

    move-object/from16 v15, v39

    invoke-direct {v1, v15, v2}, Leo2/j;-><init>(Lkotlin/jvm/functions/Function1;I)V

    invoke-virtual {v7, v1}, Lp1/q;->p0(Ljava/lang/Object;)V

    :goto_27
    check-cast v1, Lc93/a;

    const/4 v2, 0x0

    invoke-static {v1, v2, v7, v2, v0}, Lio/sentry/config/a;->c(Lc93/a;ZLandroidx/compose/runtime/Composer;II)V

    move-object v3, v15

    goto :goto_28

    :cond_2e
    move-object v7, v13

    invoke-virtual {v7}, Lp1/q;->X()V

    :goto_28
    invoke-virtual {v7}, Lp1/q;->u()Lp1/v1;

    move-result-object v6

    if-eqz v6, :cond_2f

    new-instance v0, Ld62/b;

    const/16 v5, 0x11

    move-object/from16 v1, p0

    move/from16 v2, p3

    move/from16 v4, p4

    invoke-direct/range {v0 .. v5}, Ld62/b;-><init>(Ljava/lang/Object;ILjava/lang/Object;II)V

    iput-object v0, v6, Lp1/v1;->d:Lc93/m;

    :cond_2f
    return-void
.end method

.method private static final l(Lcp1/i;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final m(Lp1/c1;)I
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp1/c1;",
            ")I"
        }
    .end annotation

    invoke-interface {p0}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Number;

    invoke-virtual {p0}, Ljava/lang/Number;->intValue()I

    move-result p0

    return p0
.end method

.method private static final n(Lp1/c1;I)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp1/c1;",
            "I)V"
        }
    .end annotation

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-interface {p0, p1}, Lp1/c1;->setValue(Ljava/lang/Object;)V

    return-void
.end method

.method private static final o(Lcp1/r;Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 1

    invoke-virtual {p0}, Lcp1/r;->j()Lcom/whoop/hormonalinsights/postpartum/domain/models/HormonalScreenId;

    move-result-object p0

    if-eqz p0, :cond_0

    new-instance v0, Lcp1/i$f;

    invoke-direct {v0, p0}, Lcp1/i$f;-><init>(Lcom/whoop/hormonalinsights/postpartum/domain/models/HormonalScreenId;)V

    invoke-interface {p1, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final p(Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 1

    sget-object v0, Lcp1/i$a;->a:Lcp1/i$a;

    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final q(Lp1/c1;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lep1/w;->n(Lp1/c1;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final r(I)Ll83/a0;
    .locals 0

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final s(Ljava/lang/String;I)Ljava/lang/String;
    .locals 1

    new-instance v0, Ljava/lang/StringBuilder;

    invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    const-string p1, " "

    invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object p0

    return-object p0
.end method

.method private static final t(Lkotlin/jvm/functions/Function1;Lcp1/r;Lp1/c1;)Ll83/a0;
    .locals 11

    new-instance v0, Lcp1/i$d;

    invoke-virtual {p1}, Lcp1/r;->h()Lcom/whoop/hormonalinsights/postpartum/domain/models/HormonalScreenId;

    move-result-object p1

    new-instance v1, Lzo1/b;

    invoke-static {p2}, Lep1/w;->m(Lp1/c1;)I

    move-result p2

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    const/16 v9, 0x7b

    const/4 v10, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    invoke-direct/range {v1 .. v10}, Lzo1/b;-><init>(Ljava/util/List;Ljava/util/List;Ljava/lang/Integer;Lcom/whoop/hormonalinsights/onboarding/domain/models/MciInterest;Lcom/whoop/hormonalinsights/onboarding/domain/models/ContraceptionType;Ljava/util/List;Ljava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-direct {v0, p1, v1}, Lcp1/i$d;-><init>(Lcom/whoop/hormonalinsights/postpartum/domain/models/HormonalScreenId;Lzo1/b;)V

    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final u(Lkotlin/jvm/functions/Function1;Lcp1/r;Ljava/lang/Object;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p2, Lcp1/i$f;

    invoke-virtual {p1}, Lcp1/r;->j()Lcom/whoop/hormonalinsights/postpartum/domain/models/HormonalScreenId;

    move-result-object p1

    invoke-direct {p2, p1}, Lcp1/i$f;-><init>(Lcom/whoop/hormonalinsights/postpartum/domain/models/HormonalScreenId;)V

    invoke-interface {p0, p2}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final v(Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 1

    sget-object v0, Lcp1/i$a;->a:Lcp1/i$a;

    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final w(Lcp1/r;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, Lp1/x;->L(I)I

    move-result p2

    invoke-static {p0, p1, p4, p2, p3}, Lep1/w;->k(Lcp1/r;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method
