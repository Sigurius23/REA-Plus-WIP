.class public abstract Lep1/i;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation system Ldalvik/annotation/MemberClasses;
    value = {
        Lep1/i$a;
    }
.end annotation

.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0002\u0008\u0002\u001a-\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0014\u0008\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0007\u00a2\u0006\u0004\u0008\u0006\u0010\u0007\u00a8\u0006\n\u00b2\u0006\u000e\u0010\t\u001a\u00020\u00088\n@\nX\u008a\u008e\u0002"
    }
    d2 = {
        "Lcp1/h;",
        "viewState",
        "Lkotlin/Function1;",
        "Lcp1/i;",
        "Ll83/a0;",
        "onViewEvent",
        "j",
        "(Lcp1/h;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V",
        "",
        "optionLimit",
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
.method public static synthetic a(ZLz1/p;Lhp1/c;Lp1/a1;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lep1/i;->q(ZLz1/p;Lhp1/c;Lp1/a1;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lcp1/h;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p5}, Lep1/i;->u(Lcp1/h;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Lcp1/h;Lz1/p;Lp1/a1;Ll0/s0;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p5}, Lep1/i;->p(Lcp1/h;Lz1/p;Lp1/a1;Ll0/s0;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Lcp1/h;Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lep1/i;->n(Lcp1/h;Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic e(Lkotlin/jvm/functions/Function1;Lcp1/h;Lz1/p;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, Lep1/i;->r(Lkotlin/jvm/functions/Function1;Lcp1/h;Lz1/p;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic f(Lkotlin/jvm/functions/Function1;Lcp1/h;Ljava/lang/Object;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, Lep1/i;->s(Lkotlin/jvm/functions/Function1;Lcp1/h;Ljava/lang/Object;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic g(Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lep1/i;->t(Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic h(Lcp1/i;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lep1/i;->k(Lcp1/i;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic i(Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lep1/i;->o(Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final j(Lcp1/h;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V
    .locals 50
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcp1/h;",
            "Lkotlin/jvm/functions/Function1;",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    move-object/from16 v1, p0

    const-string v0, "viewState"

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v15, p2

    check-cast v15, Lp1/q;

    const v0, -0x4fdf0f59

    invoke-virtual {v15, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, p3, 0x6

    if-nez v0, :cond_1

    invoke-virtual {v15, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x4

    goto :goto_0

    :cond_0
    const/4 v0, 0x2

    :goto_0
    or-int v0, p3, v0

    goto :goto_1

    :cond_1
    move/from16 v0, p3

    :goto_1
    and-int/lit8 v2, p4, 0x2

    if-eqz v2, :cond_3

    or-int/lit8 v0, v0, 0x30

    :cond_2
    move-object/from16 v3, p1

    goto :goto_3

    :cond_3
    and-int/lit8 v3, p3, 0x30

    if-nez v3, :cond_2

    move-object/from16 v3, p1

    invoke-virtual {v15, v3}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_4

    const/16 v4, 0x20

    goto :goto_2

    :cond_4
    const/16 v4, 0x10

    :goto_2
    or-int/2addr v0, v4

    :goto_3
    and-int/lit8 v4, v0, 0x13

    const/16 v14, 0x12

    const/4 v6, 0x0

    if-eq v4, v14, :cond_5

    const/4 v4, 0x1

    goto :goto_4

    :cond_5
    move v4, v6

    :goto_4
    and-int/lit8 v7, v0, 0x1

    invoke-virtual {v15, v7, v4}, Lp1/q;->U(IZ)Z

    move-result v4

    if-eqz v4, :cond_26

    sget-object v4, Lp1/l;->a:Lp1/v0;

    if-eqz v2, :cond_7

    invoke-virtual {v15}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v4, :cond_6

    new-instance v2, Lep1/a;

    const/16 v3, 0x8

    invoke-direct {v2, v3}, Lep1/a;-><init>(I)V

    invoke-virtual {v15, v2}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_6
    check-cast v2, Lkotlin/jvm/functions/Function1;

    goto :goto_5

    :cond_7
    move-object v2, v3

    :goto_5
    invoke-virtual {v15}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    if-ne v3, v4, :cond_8

    invoke-virtual {v1}, Lcp1/h;->f()I

    move-result v3

    invoke-static {v3, v15}, Lr80/c;->v(ILp1/q;)Lp1/h1;

    move-result-object v3

    :cond_8
    check-cast v3, Lp1/a1;

    invoke-virtual {v15}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v7

    if-ne v7, v4, :cond_9

    new-instance v7, Lz1/p;

    invoke-direct {v7}, Lz1/p;-><init>()V

    invoke-virtual {v15, v7}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_9
    check-cast v7, Lz1/p;

    const/high16 v8, 0x3f800000    # 1.0f

    sget-object v9, Lb2/t;->w:Lb2/t;

    invoke-static {v8, v9}, Landroidx/compose/foundation/layout/d;->d(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v10

    invoke-static {v10}, Lgb1/b0;->b0(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v10

    invoke-static {v10}, Ll0/f;->k(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v10

    sget-object v5, Ll0/m;->c:Ll0/g;

    sget-object v11, Lb2/e;->M:Lb2/k;

    invoke-static {v5, v11, v15, v6}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v5

    move-object/from16 p1, v7

    iget-wide v6, v15, Lp1/q;->T:J

    invoke-static {v6, v7}, Ljava/lang/Long;->hashCode(J)I

    move-result v6

    invoke-virtual {v15}, Lp1/q;->m()Lp1/p1;

    move-result-object v7

    invoke-static {v15, v10}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v10

    sget-object v18, La3/l;->a:La3/k;

    invoke-virtual/range {v18 .. v18}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v12, La3/k;->b:La3/j;

    invoke-virtual {v15}, Lp1/q;->i0()V

    iget-boolean v8, v15, Lp1/q;->S:Z

    if-eqz v8, :cond_a

    invoke-virtual {v15, v12}, Lp1/q;->l(Lc93/a;)V

    goto :goto_6

    :cond_a
    invoke-virtual {v15}, Lp1/q;->s0()V

    :goto_6
    sget-object v8, La3/k;->g:La3/i;

    invoke-static {v15, v8, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v5, La3/k;->f:La3/i;

    invoke-static {v15, v5, v7}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v7, La3/k;->j:La3/i;

    move/from16 v20, v14

    iget-boolean v14, v15, Lp1/q;->S:Z

    if-nez v14, :cond_b

    invoke-virtual {v15}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v14

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v13

    invoke-static {v14, v13}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v13

    if-nez v13, :cond_c

    :cond_b
    invoke-static {v6, v15, v6, v7}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_c
    sget-object v13, La3/k;->d:La3/i;

    invoke-static {v15, v13, v10}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual {v1}, Lcp1/h;->d()Lcom/whoop/design/util/TextResource;

    move-result-object v6

    move-object v10, v3

    invoke-virtual {v1}, Lcp1/h;->c()Lcom/whoop/design/util/TextResource;

    move-result-object v3

    invoke-virtual {v1}, Lcp1/h;->k()Lcom/whoop/design/util/TextResource;

    move-result-object v14

    move-object/from16 v22, v10

    if-eqz v14, :cond_d

    invoke-virtual {v1}, Lcp1/h;->h()Lcp1/c;

    move-result-object v23

    if-eqz v23, :cond_d

    invoke-virtual {v1}, Lcp1/h;->j()Lcom/whoop/hormonalinsights/postpartum/domain/models/HormonalScreenId;

    move-result-object v23

    if-eqz v23, :cond_d

    invoke-static {v14}, Lcom/whoop/design/util/b;->d(Lcom/whoop/design/util/TextResource;)Z

    move-result v23

    if-eqz v23, :cond_d

    goto :goto_7

    :cond_d
    const/4 v14, 0x0

    :goto_7
    invoke-virtual {v15, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v23

    and-int/lit8 v0, v0, 0x70

    const/16 v10, 0x20

    if-ne v0, v10, :cond_e

    const/4 v10, 0x1

    goto :goto_8

    :cond_e
    const/4 v10, 0x0

    :goto_8
    or-int v10, v23, v10

    move-object/from16 v23, v3

    invoke-virtual {v15}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    if-nez v10, :cond_f

    if-ne v3, v4, :cond_10

    :cond_f
    new-instance v3, Ld30/l;

    const/16 v10, 0x13

    invoke-direct {v3, v10, v1, v2}, Ld30/l;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v15, v3}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_10
    check-cast v3, Lc93/a;

    const/16 v10, 0x20

    if-ne v0, v10, :cond_11

    const/16 v21, 0x1

    goto :goto_9

    :cond_11
    const/16 v21, 0x0

    :goto_9
    invoke-virtual {v15}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v10

    if-nez v21, :cond_13

    if-ne v10, v4, :cond_12

    goto :goto_a

    :cond_12
    move-object/from16 v21, v3

    goto :goto_b

    :cond_13
    :goto_a
    new-instance v10, Leo2/j;

    move-object/from16 v21, v3

    const/16 v3, 0x8

    invoke-direct {v10, v2, v3}, Leo2/j;-><init>(Lkotlin/jvm/functions/Function1;I)V

    invoke-virtual {v15, v10}, Lp1/q;->p0(Ljava/lang/Object;)V

    :goto_b
    check-cast v10, Lc93/a;

    sget v3, Lcom/whoop/design/util/TextResource;->$stable:I

    shl-int/lit8 v26, v3, 0x3

    or-int v28, v3, v26

    shl-int/lit8 v26, v3, 0x9

    or-int v26, v28, v26

    move-object/from16 v27, v7

    move-object v7, v10

    const/4 v10, 0x4

    move-object/from16 v29, v4

    const/4 v4, 0x0

    move-object/from16 v32, p1

    move-object/from16 v30, v2

    move/from16 v36, v3

    move-object/from16 v34, v5

    move-object v2, v6

    move-object/from16 v33, v8

    move-object v5, v14

    move-object v8, v15

    move-object/from16 v6, v21

    move-object/from16 v31, v22

    move-object/from16 v3, v23

    move-object/from16 v35, v27

    move-object/from16 v37, v29

    const/4 v15, 0x0

    const/16 v21, 0x20

    move-object v14, v9

    move/from16 v9, v26

    invoke-static/range {v2 .. v10}, Lep1/s;->e(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;ILcom/whoop/design/util/TextResource;Lc93/a;Lc93/a;Landroidx/compose/runtime/Composer;II)V

    move-object v7, v8

    const/4 v2, 0x3

    int-to-float v2, v2

    const/16 v3, 0x8

    int-to-float v3, v3

    mul-float v4, v2, v3

    invoke-static {v4, v14}, Landroidx/compose/foundation/layout/a;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v5

    const/4 v6, 0x1

    invoke-static {v15, v7, v6}, Lq83/g;->U(ILandroidx/compose/runtime/Composer;I)Lf0/r1;

    move-result-object v8

    const/16 v6, 0xe

    invoke-static {v5, v8, v6}, Lq83/g;->f0(Landroidx/compose/ui/Modifier;Lf0/r1;I)Landroidx/compose/ui/Modifier;

    move-result-object v5

    const/high16 v6, 0x3f800000    # 1.0f

    float-to-double v8, v6

    const-wide/16 v22, 0x0

    cmpl-double v8, v8, v22

    if-lez v8, :cond_14

    goto :goto_c

    :cond_14
    const-string v8, "invalid weight; must be greater than zero"

    invoke-static {v8}, Lm0/a;->a(Ljava/lang/String;)V

    :goto_c
    new-instance v8, Landroidx/compose/foundation/layout/LayoutWeightElement;

    const v9, 0x7f7fffff    # Float.MAX_VALUE

    cmpl-float v10, v6, v9

    if-lez v10, :cond_15

    :goto_d
    const/4 v6, 0x1

    goto :goto_e

    :cond_15
    const/high16 v9, 0x3f800000    # 1.0f

    goto :goto_d

    :goto_e
    invoke-direct {v8, v9, v6}, Landroidx/compose/foundation/layout/LayoutWeightElement;-><init>(FZ)V

    invoke-interface {v5, v8}, Landroidx/compose/ui/Modifier;->e(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v5

    sget-object v8, Ll0/m;->d:Ll0/g;

    const/4 v9, 0x6

    invoke-static {v8, v11, v7, v9}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v8

    iget-wide v10, v7, Lp1/q;->T:J

    invoke-static {v10, v11}, Ljava/lang/Long;->hashCode(J)I

    move-result v10

    invoke-virtual {v7}, Lp1/q;->m()Lp1/p1;

    move-result-object v11

    invoke-static {v7, v5}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v5

    invoke-virtual {v7}, Lp1/q;->i0()V

    iget-boolean v6, v7, Lp1/q;->S:Z

    if-eqz v6, :cond_16

    invoke-virtual {v7, v12}, Lp1/q;->l(Lc93/a;)V

    :goto_f
    move-object/from16 v6, v33

    goto :goto_10

    :cond_16
    invoke-virtual {v7}, Lp1/q;->s0()V

    goto :goto_f

    :goto_10
    invoke-static {v7, v6, v8}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    move-object/from16 v6, v34

    invoke-static {v7, v6, v11}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v6, v7, Lp1/q;->S:Z

    if-nez v6, :cond_17

    invoke-virtual {v7}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v6

    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    invoke-static {v6, v8}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_18

    :cond_17
    move-object/from16 v6, v35

    invoke-static {v10, v7, v10, v6}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_18
    invoke-static {v7, v13, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual {v1}, Lcp1/h;->l()Lcom/whoop/design/util/TextResource;

    move-result-object v5

    move/from16 v6, v36

    invoke-static {v5, v7, v6}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v5

    sget-object v8, Lx81/d;->a:Lx81/d;

    sget v10, Lx81/d;->b:I

    invoke-virtual {v8, v7, v10}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v11

    invoke-virtual {v11}, Ly81/i;->y()J

    move-result-wide v11

    invoke-virtual {v8, v7, v10}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v13

    invoke-virtual {v13}, Lb91/d;->N()Lb91/a;

    move-result-object v22

    move/from16 v17, v3

    const/high16 v13, 0x3f800000    # 1.0f

    invoke-static {v13, v14}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    move-object/from16 v19, v14

    new-instance v14, Lw3/k;

    const/4 v6, 0x5

    invoke-direct {v14, v6}, Lw3/k;-><init>(I)V

    sget v23, Lb91/a;->d:I

    shl-int/lit8 v26, v23, 0x12

    const v27, 0x2fdf8

    move/from16 v20, v6

    move-object/from16 v24, v7

    const-wide/16 v6, 0x0

    move-object/from16 v23, v8

    const/4 v8, 0x0

    move/from16 v25, v9

    const/4 v9, 0x0

    move/from16 v29, v10

    const/4 v10, 0x0

    move/from16 v34, v2

    move/from16 v33, v4

    move-object v2, v5

    move-wide v4, v11

    const-wide/16 v11, 0x0

    move/from16 v35, v13

    const/4 v13, 0x0

    move/from16 v39, v15

    const/16 v38, 0x4

    const-wide/16 v15, 0x0

    move/from16 v40, v17

    const/16 v17, 0x0

    const/16 v41, 0x2

    const/16 v18, 0x0

    move-object/from16 v42, v19

    const/16 v19, 0x0

    move/from16 v43, v20

    const/16 v20, 0x0

    move/from16 v44, v21

    const/16 v21, 0x0

    move-object/from16 v45, v23

    const/16 v23, 0x0

    move/from16 v46, v25

    const/16 v25, 0x30

    move/from16 p1, v0

    move/from16 v47, v29

    move-object/from16 v0, v42

    const/4 v1, 0x1

    invoke-static/range {v2 .. v27}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v7, v24

    int-to-float v2, v1

    const/4 v3, 0x4

    int-to-float v3, v3

    mul-float/2addr v2, v3

    invoke-static {v2, v0}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    invoke-static {v7, v2}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    invoke-virtual/range {p0 .. p0}, Lcp1/h;->b()Lcom/whoop/design/util/TextResource;

    move-result-object v2

    if-nez v2, :cond_19

    const v2, -0x25b7eb27

    invoke-virtual {v7, v2}, Lp1/q;->e0(I)V

    const/4 v15, 0x0

    invoke-virtual {v7, v15}, Lp1/q;->q(Z)V

    move v1, v3

    goto/16 :goto_11

    :cond_19
    const v2, -0x25b7eb26

    invoke-virtual {v7, v2}, Lp1/q;->e0(I)V

    invoke-virtual/range {p0 .. p0}, Lcp1/h;->b()Lcom/whoop/design/util/TextResource;

    move-result-object v2

    move/from16 v4, v36

    invoke-static {v2, v7, v4}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v2

    move-object/from16 v5, v45

    move/from16 v6, v47

    invoke-virtual {v5, v7, v6}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v8

    invoke-virtual {v8}, Ly81/i;->c1()J

    move-result-wide v8

    invoke-virtual {v5, v7, v6}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v6

    invoke-virtual {v6}, Lb91/d;->a()Lb91/a;

    move-result-object v22

    move v10, v3

    const/high16 v6, 0x3f800000    # 1.0f

    invoke-static {v6, v0}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    new-instance v14, Lw3/k;

    const/4 v11, 0x5

    invoke-direct {v14, v11}, Lw3/k;-><init>(I)V

    const/16 v25, 0x30

    const v27, 0x2fdf8

    move/from16 v19, v6

    move-object/from16 v24, v7

    const-wide/16 v6, 0x0

    move-wide v4, v8

    const/4 v8, 0x0

    const/4 v9, 0x0

    move v11, v10

    const/4 v10, 0x0

    move v13, v11

    const-wide/16 v11, 0x0

    move v15, v13

    const/4 v13, 0x0

    move/from16 v17, v15

    const-wide/16 v15, 0x0

    move/from16 v18, v17

    const/16 v17, 0x0

    move/from16 v20, v18

    const/16 v18, 0x0

    move/from16 v48, v19

    const/16 v19, 0x0

    move/from16 v21, v20

    const/16 v20, 0x0

    move/from16 v23, v21

    const/16 v21, 0x0

    move/from16 v29, v23

    const/16 v23, 0x0

    move/from16 v1, v29

    invoke-static/range {v2 .. v27}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v7, v24

    const/4 v15, 0x0

    invoke-virtual {v7, v15}, Lp1/q;->q(Z)V

    :goto_11
    invoke-static {v1, v1, v0, v7}, Lih0/d0;->u(FFLb2/t;Lp1/q;)V

    const/4 v12, 0x2

    int-to-float v2, v12

    mul-float v18, v2, v40

    const/16 v20, 0x0

    const/16 v21, 0xd

    const/16 v17, 0x0

    const/16 v19, 0x0

    move-object/from16 v16, v0

    invoke-static/range {v16 .. v21}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v0

    move-object/from16 v13, v16

    mul-float/2addr v2, v1

    invoke-static {v2}, Ll0/m;->i(F)Ll0/k;

    move-result-object v3

    invoke-static {v2}, Ll0/m;->i(F)Ll0/k;

    move-result-object v4

    new-instance v2, La80/f;

    const/16 v5, 0xd

    move-object/from16 v14, p0

    move-object/from16 v10, v31

    move-object/from16 v15, v32

    invoke-direct {v2, v14, v15, v10, v5}, La80/f;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    const v5, 0x43e49fb8

    invoke-static {v5, v7, v2}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v8

    const v10, 0x1801b6

    const/16 v11, 0x38

    const/4 v5, 0x0

    const/4 v6, 0x0

    move-object/from16 v24, v7

    const/4 v7, 0x0

    move-object v2, v0

    move-object/from16 v9, v24

    invoke-static/range {v2 .. v11}, Ll0/g2;->a(Landroidx/compose/ui/Modifier;Ll0/i;Ll0/l;Lb2/g;IILkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V

    move-object v7, v9

    const/4 v6, 0x1

    invoke-virtual {v7, v6}, Lp1/q;->q(Z)V

    const/high16 v6, 0x3f800000    # 1.0f

    invoke-static {v6, v13}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v22

    const-wide/high16 v2, 0x3fe0000000000000L    # 0.5

    double-to-float v0, v2

    mul-float v24, v0, v40

    const/16 v26, 0x0

    const/16 v27, 0x8

    move/from16 v25, v33

    move/from16 v23, v33

    invoke-static/range {v22 .. v27}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v4

    move/from16 v0, v23

    invoke-virtual {v14}, Lcp1/h;->h()Lcp1/c;

    move-result-object v2

    invoke-virtual {v14}, Lcp1/h;->a()Lcom/whoop/design/util/TextResource;

    move-result-object v3

    invoke-virtual {v15}, Lz1/p;->isEmpty()Z

    move-result v5

    const/4 v6, 0x1

    xor-int/2addr v5, v6

    move/from16 v10, p1

    const/16 v11, 0x20

    if-ne v10, v11, :cond_1a

    const/4 v6, 0x1

    goto :goto_12

    :cond_1a
    const/4 v6, 0x0

    :goto_12
    invoke-virtual {v7, v14}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v8

    or-int/2addr v6, v8

    invoke-virtual {v7}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v8

    if-nez v6, :cond_1c

    move-object/from16 v6, v37

    if-ne v8, v6, :cond_1b

    goto :goto_13

    :cond_1b
    move-object/from16 v19, v13

    move-object/from16 v13, v30

    goto :goto_14

    :cond_1c
    move-object/from16 v6, v37

    :goto_13
    new-instance v8, Ld30/r;

    const/16 v9, 0x9

    move-object/from16 v19, v13

    move-object/from16 v13, v30

    invoke-direct {v8, v13, v14, v15, v9}, Ld30/r;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    invoke-virtual {v7, v8}, Lp1/q;->p0(Ljava/lang/Object;)V

    :goto_14
    check-cast v8, Lc93/a;

    const/4 v9, 0x0

    move-object v15, v6

    move-object v6, v8

    move/from16 v8, v28

    invoke-static/range {v2 .. v9}, Lep1/e;->c(Lcp1/c;Lcom/whoop/design/util/TextResource;Landroidx/compose/ui/Modifier;ZLc93/a;Landroidx/compose/runtime/Composer;II)V

    invoke-virtual {v14}, Lcp1/h;->h()Lcp1/c;

    move-result-object v2

    if-nez v2, :cond_22

    const v2, 0x716df0a5

    invoke-virtual {v7, v2}, Lp1/q;->e0(I)V

    invoke-virtual {v14}, Lcp1/h;->j()Lcom/whoop/hormonalinsights/postpartum/domain/models/HormonalScreenId;

    move-result-object v2

    if-nez v2, :cond_1d

    const v1, -0x43afdc04

    invoke-virtual {v7, v1}, Lp1/q;->e0(I)V

    const/4 v2, 0x0

    invoke-virtual {v7, v2}, Lp1/q;->q(Z)V

    move/from16 p1, v10

    move-object/from16 v30, v13

    move-object/from16 v49, v15

    move-object/from16 v1, v19

    move v15, v2

    goto/16 :goto_17

    :cond_1d
    const/4 v2, 0x0

    const v3, -0x43afdc03

    invoke-virtual {v7, v3}, Lp1/q;->e0(I)V

    invoke-virtual {v14}, Lcp1/h;->k()Lcom/whoop/design/util/TextResource;

    move-result-object v4

    if-nez v4, :cond_1e

    const v1, 0x5d0bd716

    invoke-virtual {v7, v1}, Lp1/q;->e0(I)V

    invoke-virtual {v7, v2}, Lp1/q;->q(Z)V

    move/from16 p1, v10

    move-object/from16 v30, v13

    move-object/from16 v49, v15

    move-object/from16 v1, v19

    move v15, v2

    goto/16 :goto_16

    :cond_1e
    const v2, 0x5d0bd717

    invoke-virtual {v7, v2}, Lp1/q;->e0(I)V

    sget-object v2, Lb2/e;->N:Lb2/k;

    new-instance v3, Landroidx/compose/foundation/layout/HorizontalAlignElement;

    invoke-direct {v3, v2}, Landroidx/compose/foundation/layout/HorizontalAlignElement;-><init>(Lb2/f;)V

    mul-float v22, v34, v1

    const/16 v24, 0x0

    const/16 v25, 0xd

    const/16 v21, 0x0

    const/16 v23, 0x0

    move-object/from16 v20, v3

    invoke-static/range {v20 .. v25}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v2

    new-instance v6, Ly71/g;

    invoke-static/range {v45 .. v45}, Lih0/d0;->E(Lx81/d;)I

    move-result v1

    const/4 v3, 0x0

    invoke-direct {v6, v1, v3, v12, v3}, Ly71/g;-><init>(ILcom/whoop/design/util/TextResource;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    if-ne v10, v11, :cond_1f

    const/4 v5, 0x1

    goto :goto_15

    :cond_1f
    const/4 v5, 0x0

    :goto_15
    invoke-virtual {v7, v14}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v1

    or-int/2addr v1, v5

    invoke-virtual {v7}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    if-nez v1, :cond_20

    if-ne v3, v15, :cond_21

    :cond_20
    new-instance v3, Lcom/whoop/profile/view/edit/n;

    const/16 v1, 0x13

    invoke-direct {v3, v1, v13, v14}, Lcom/whoop/profile/view/edit/n;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v7, v3}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_21
    check-cast v3, Lkotlin/jvm/functions/Function1;

    shl-int/lit8 v1, v36, 0x6

    sget v5, Ly71/g;->c:I

    shl-int/lit8 v5, v5, 0xc

    or-int v16, v1, v5

    const/16 v17, 0x0

    const/16 v18, 0xfea

    move-object v14, v3

    const/4 v3, 0x0

    const/4 v5, 0x0

    move-object/from16 v24, v7

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    move v1, v10

    const/4 v10, 0x0

    move/from16 v21, v11

    const/4 v11, 0x0

    const/4 v12, 0x0

    move-object/from16 v30, v13

    const/4 v13, 0x0

    move/from16 p1, v1

    move-object/from16 v49, v15

    move-object/from16 v1, v19

    move-object/from16 v15, v24

    invoke-static/range {v2 .. v18}, Lny0/l0;->i(Landroidx/compose/ui/Modifier;Lny0/n0;Lcom/whoop/design/util/TextResource;Ly71/g;Ly71/g;ZLy81/e;Lj91/b;ZZLjava/lang/Float;Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;III)V

    move-object v7, v15

    const/4 v15, 0x0

    invoke-virtual {v7, v15}, Lp1/q;->q(Z)V

    :goto_16
    invoke-virtual {v7, v15}, Lp1/q;->q(Z)V

    :goto_17
    invoke-virtual {v7, v15}, Lp1/q;->q(Z)V

    :goto_18
    const/4 v6, 0x1

    goto :goto_19

    :cond_22
    move/from16 p1, v10

    move-object/from16 v30, v13

    move-object/from16 v49, v15

    move-object/from16 v1, v19

    const/4 v15, 0x0

    const v2, -0x43a79d1b

    invoke-virtual {v7, v2}, Lp1/q;->e0(I)V

    invoke-virtual {v7, v15}, Lp1/q;->q(Z)V

    goto :goto_18

    :goto_19
    invoke-static {v1, v0, v7, v6}, Lq63/c;->u(Lb2/t;FLp1/q;Z)V

    move/from16 v1, p1

    const/16 v10, 0x20

    if-ne v1, v10, :cond_23

    const/4 v5, 0x1

    goto :goto_1a

    :cond_23
    const/4 v5, 0x0

    :goto_1a
    invoke-virtual {v7}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v0

    if-nez v5, :cond_25

    move-object/from16 v15, v49

    if-ne v0, v15, :cond_24

    goto :goto_1b

    :cond_24
    move-object/from16 v13, v30

    goto :goto_1c

    :cond_25
    :goto_1b
    new-instance v0, Leo2/j;

    const/16 v1, 0x9

    move-object/from16 v13, v30

    invoke-direct {v0, v13, v1}, Leo2/j;-><init>(Lkotlin/jvm/functions/Function1;I)V

    invoke-virtual {v7, v0}, Lp1/q;->p0(Ljava/lang/Object;)V

    :goto_1c
    check-cast v0, Lc93/a;

    const/4 v6, 0x1

    const/4 v15, 0x0

    invoke-static {v0, v15, v7, v15, v6}, Lio/sentry/config/a;->c(Lc93/a;ZLandroidx/compose/runtime/Composer;II)V

    move-object v3, v13

    goto :goto_1d

    :cond_26
    move-object v7, v15

    invoke-virtual {v7}, Lp1/q;->X()V

    :goto_1d
    invoke-virtual {v7}, Lp1/q;->u()Lp1/v1;

    move-result-object v6

    if-eqz v6, :cond_27

    new-instance v0, Ld62/b;

    const/16 v5, 0xf

    move-object/from16 v1, p0

    move/from16 v2, p3

    move/from16 v4, p4

    invoke-direct/range {v0 .. v5}, Ld62/b;-><init>(Ljava/lang/Object;ILjava/lang/Object;II)V

    iput-object v0, v6, Lp1/v1;->d:Lc93/m;

    :cond_27
    return-void
.end method

.method private static final k(Lcp1/i;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final l(Lp1/a1;)I
    .locals 0

    check-cast p0, Lp1/h1;

    invoke-virtual {p0}, Lp1/h1;->x()I

    move-result p0

    return p0
.end method

.method private static final m(Lp1/a1;I)V
    .locals 0

    check-cast p0, Lp1/h1;

    invoke-virtual {p0, p1}, Lp1/h1;->y(I)V

    return-void
.end method

.method private static final n(Lcp1/h;Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 1

    invoke-virtual {p0}, Lcp1/h;->j()Lcom/whoop/hormonalinsights/postpartum/domain/models/HormonalScreenId;

    move-result-object p0

    if-eqz p0, :cond_0

    new-instance v0, Lcp1/i$f;

    invoke-direct {v0, p0}, Lcp1/i$f;-><init>(Lcom/whoop/hormonalinsights/postpartum/domain/models/HormonalScreenId;)V

    invoke-interface {p1, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final o(Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 1

    sget-object v0, Lcp1/i$a;->a:Lcp1/i$a;

    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final p(Lcp1/h;Lz1/p;Lp1/a1;Ll0/s0;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 30

    const-string v0, "$this$FlowRow"

    move-object/from16 v1, p3

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    and-int/lit8 v0, p5, 0x11

    const/16 v1, 0x10

    const/4 v2, 0x1

    const/4 v3, 0x0

    if-eq v0, v1, :cond_0

    move v0, v2

    goto :goto_0

    :cond_0
    move v0, v3

    :goto_0
    and-int/lit8 v1, p5, 0x1

    move-object/from16 v4, p4

    check-cast v4, Lp1/q;

    invoke-virtual {v4, v1, v0}, Lp1/q;->U(IZ)Z

    move-result v0

    if-eqz v0, :cond_8

    invoke-virtual/range {p0 .. p0}, Lcp1/h;->g()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_1
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_9

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    move-object v8, v1

    check-cast v8, Lhp1/c;

    invoke-virtual {v8}, Lhp1/c;->f()Ljava/lang/String;

    move-result-object v1

    move-object/from16 v7, p1

    invoke-virtual {v7, v1}, Lz1/p;->contains(Ljava/lang/Object;)Z

    move-result v6

    const/4 v1, 0x3

    int-to-float v1, v1

    const/4 v5, 0x4

    int-to-float v5, v5

    mul-float/2addr v1, v5

    invoke-static {v1}, Lt0/j;->e(F)Lt0/i;

    move-result-object v9

    sget-object v10, Lb2/t;->w:Lb2/t;

    invoke-static {v10, v9}, Lwb3/f;->r(Landroidx/compose/ui/Modifier;Li2/a1;)Landroidx/compose/ui/Modifier;

    move-result-object v9

    if-eqz v6, :cond_1

    const v10, 0x764b1cd

    invoke-virtual {v4, v10}, Lp1/q;->e0(I)V

    sget-object v10, Lx81/d;->a:Lx81/d;

    sget v11, Lx81/d;->b:I

    invoke-virtual {v10, v4, v11}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v10

    invoke-virtual {v10}, Ly81/i;->i0()J

    move-result-wide v10

    invoke-virtual {v4, v3}, Lp1/q;->q(Z)V

    goto :goto_2

    :cond_1
    const v10, 0x764b6a5

    invoke-virtual {v4, v10}, Lp1/q;->e0(I)V

    sget-object v10, Lx81/d;->a:Lx81/d;

    sget v11, Lx81/d;->b:I

    invoke-static {v10, v4, v11, v3}, Lr80/c;->d(Lx81/d;Lp1/q;IZ)J

    move-result-wide v10

    :goto_2
    sget-object v12, Li2/w0;->a:Li2/v0;

    invoke-static {v9, v10, v11, v12}, Landroidx/compose/foundation/a;->c(Landroidx/compose/ui/Modifier;JLi2/a1;)Landroidx/compose/ui/Modifier;

    move-result-object v9

    const/4 v10, 0x2

    int-to-float v10, v10

    mul-float/2addr v10, v5

    invoke-static {v9, v1, v10}, Landroidx/compose/foundation/layout/a;->q(Landroidx/compose/ui/Modifier;FF)Landroidx/compose/ui/Modifier;

    move-result-object v11

    invoke-virtual {v4, v6}, Lp1/q;->h(Z)Z

    move-result v1

    invoke-virtual {v4, v8}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v5

    or-int/2addr v1, v5

    invoke-virtual {v4}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    if-nez v1, :cond_2

    sget-object v1, Lp1/l;->a:Lp1/v0;

    if-ne v5, v1, :cond_3

    :cond_2
    new-instance v5, Ldn0/k;

    const/4 v10, 0x1

    move-object/from16 v9, p2

    invoke-direct/range {v5 .. v10}, Ldn0/k;-><init>(ZLjava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    invoke-virtual {v4, v5}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_3
    move-object v15, v5

    check-cast v15, Lc93/a;

    const/16 v16, 0xf

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    invoke-static/range {v11 .. v16}, Landroidx/compose/foundation/a;->g(Landroidx/compose/ui/Modifier;ZLjava/lang/String;Li3/i;Lc93/a;I)Landroidx/compose/ui/Modifier;

    move-result-object v1

    sget-object v5, Lb2/e;->w:Lb2/m;

    invoke-static {v5, v3}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v5

    iget-wide v9, v4, Lp1/q;->T:J

    invoke-static {v9, v10}, Ljava/lang/Long;->hashCode(J)I

    move-result v7

    invoke-virtual {v4}, Lp1/q;->m()Lp1/p1;

    move-result-object v9

    invoke-static {v4, v1}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    sget-object v10, La3/l;->a:La3/k;

    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v10, La3/k;->b:La3/j;

    invoke-virtual {v4}, Lp1/q;->i0()V

    iget-boolean v11, v4, Lp1/q;->S:Z

    if-eqz v11, :cond_4

    invoke-virtual {v4, v10}, Lp1/q;->l(Lc93/a;)V

    goto :goto_3

    :cond_4
    invoke-virtual {v4}, Lp1/q;->s0()V

    :goto_3
    sget-object v10, La3/k;->g:La3/i;

    invoke-static {v4, v10, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v5, La3/k;->f:La3/i;

    invoke-static {v4, v5, v9}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v5, La3/k;->j:La3/i;

    iget-boolean v9, v4, Lp1/q;->S:Z

    if-nez v9, :cond_5

    invoke-virtual {v4}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v9

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    invoke-static {v9, v10}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v9

    if-nez v9, :cond_6

    :cond_5
    invoke-static {v7, v4, v7, v5}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_6
    sget-object v5, La3/k;->d:La3/i;

    invoke-static {v4, v5, v1}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual {v8}, Lhp1/c;->e()Lcom/whoop/design/util/TextResource;

    move-result-object v1

    sget v5, Lcom/whoop/design/util/TextResource;->$stable:I

    invoke-static {v1, v4, v5}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v1

    sget-object v5, Lx81/d;->a:Lx81/d;

    sget v7, Lx81/d;->b:I

    invoke-virtual {v5, v4, v7}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v8

    invoke-virtual {v8}, Lb91/d;->a()Lb91/a;

    move-result-object v24

    if-eqz v6, :cond_7

    const v6, 0x5c60c782

    invoke-virtual {v4, v6}, Lp1/q;->e0(I)V

    invoke-virtual {v5, v4, v7}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v5

    invoke-virtual {v5}, Ly81/i;->w()J

    move-result-wide v5

    :goto_4
    invoke-virtual {v4, v3}, Lp1/q;->q(Z)V

    move-wide v6, v5

    goto :goto_5

    :cond_7
    const v6, 0x5c60cbc2

    invoke-static {v4, v6, v5, v4, v7}, Lm4/a;->B(Lp1/q;ILx81/d;Lp1/q;I)J

    move-result-wide v5

    goto :goto_4

    :goto_5
    sget v5, Lb91/a;->d:I

    shl-int/lit8 v28, v5, 0x12

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

    move-object/from16 v26, v4

    move-object v4, v1

    invoke-static/range {v4 .. v29}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v1, v26

    invoke-virtual {v1, v2}, Lp1/q;->q(Z)V

    move-object v4, v1

    goto/16 :goto_1

    :cond_8
    move-object v1, v4

    invoke-virtual {v1}, Lp1/q;->X()V

    :cond_9
    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method

.method private static final q(ZLz1/p;Lhp1/c;Lp1/a1;)Ll83/a0;
    .locals 0

    if-eqz p0, :cond_0

    invoke-static {p3}, Lep1/i;->l(Lp1/a1;)I

    move-result p0

    add-int/lit8 p0, p0, 0x1

    invoke-static {p3, p0}, Lep1/i;->m(Lp1/a1;I)V

    invoke-virtual {p2}, Lhp1/c;->f()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p1, p0}, Lz1/p;->remove(Ljava/lang/Object;)Z

    goto :goto_0

    :cond_0
    invoke-static {p3}, Lep1/i;->l(Lp1/a1;)I

    move-result p0

    if-lez p0, :cond_1

    invoke-virtual {p2}, Lhp1/c;->f()Ljava/lang/String;

    move-result-object p0

    invoke-virtual {p1, p0}, Lz1/p;->add(Ljava/lang/Object;)Z

    invoke-static {p3}, Lep1/i;->l(Lp1/a1;)I

    move-result p0

    add-int/lit8 p0, p0, -0x1

    invoke-static {p3, p0}, Lep1/i;->m(Lp1/a1;I)V

    :cond_1
    :goto_0
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final r(Lkotlin/jvm/functions/Function1;Lcp1/h;Lz1/p;)Ll83/a0;
    .locals 15

    new-instance v0, Lcp1/i$d;

    invoke-virtual/range {p1 .. p1}, Lcp1/h;->e()Lcom/whoop/hormonalinsights/postpartum/domain/models/HormonalScreenId;

    move-result-object v1

    invoke-virtual/range {p1 .. p1}, Lcp1/h;->i()Lcom/whoop/hormonalinsights/postpartum/domain/models/HormonalScreenId;

    move-result-object v2

    sget-object v3, Lep1/i$a;->a:[I

    invoke-virtual {v2}, Ljava/lang/Enum;->ordinal()I

    move-result v2

    aget v2, v3, v2

    const/4 v3, 0x1

    if-eq v2, v3, :cond_1

    const/4 v3, 0x2

    if-eq v2, v3, :cond_0

    new-instance v4, Lzo1/b;

    const/16 v12, 0x5f

    const/4 v13, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v11, 0x0

    move-object/from16 v10, p2

    invoke-direct/range {v4 .. v13}, Lzo1/b;-><init>(Ljava/util/List;Ljava/util/List;Ljava/lang/Integer;Lcom/whoop/hormonalinsights/onboarding/domain/models/MciInterest;Lcom/whoop/hormonalinsights/onboarding/domain/models/ContraceptionType;Ljava/util/List;Ljava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    goto :goto_1

    :cond_0
    new-instance v5, Lzo1/b;

    const/16 v13, 0x5f

    const/4 v14, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v12, 0x0

    move-object/from16 v11, p2

    invoke-direct/range {v5 .. v14}, Lzo1/b;-><init>(Ljava/util/List;Ljava/util/List;Ljava/lang/Integer;Lcom/whoop/hormonalinsights/onboarding/domain/models/MciInterest;Lcom/whoop/hormonalinsights/onboarding/domain/models/ContraceptionType;Ljava/util/List;Ljava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    :goto_0
    move-object v4, v5

    goto :goto_1

    :cond_1
    new-instance v5, Lzo1/b;

    const/16 v13, 0x3f

    const/4 v14, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    move-object/from16 v12, p2

    invoke-direct/range {v5 .. v14}, Lzo1/b;-><init>(Ljava/util/List;Ljava/util/List;Ljava/lang/Integer;Lcom/whoop/hormonalinsights/onboarding/domain/models/MciInterest;Lcom/whoop/hormonalinsights/onboarding/domain/models/ContraceptionType;Ljava/util/List;Ljava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    goto :goto_0

    :goto_1
    invoke-direct {v0, v1, v4}, Lcp1/i$d;-><init>(Lcom/whoop/hormonalinsights/postpartum/domain/models/HormonalScreenId;Lzo1/b;)V

    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final s(Lkotlin/jvm/functions/Function1;Lcp1/h;Ljava/lang/Object;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p2, Lcp1/i$f;

    invoke-virtual {p1}, Lcp1/h;->j()Lcom/whoop/hormonalinsights/postpartum/domain/models/HormonalScreenId;

    move-result-object p1

    invoke-direct {p2, p1}, Lcp1/i$f;-><init>(Lcom/whoop/hormonalinsights/postpartum/domain/models/HormonalScreenId;)V

    invoke-interface {p0, p2}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final t(Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 1

    sget-object v0, Lcp1/i$a;->a:Lcp1/i$a;

    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final u(Lcp1/h;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, Lp1/x;->L(I)I

    move-result p2

    invoke-static {p0, p1, p4, p2, p3}, Lep1/i;->j(Lcp1/h;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method
