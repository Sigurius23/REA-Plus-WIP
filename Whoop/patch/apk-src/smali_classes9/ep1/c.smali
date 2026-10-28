.class public abstract Lep1/c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\u0002\u001a-\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0014\u0008\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0007\u00a2\u0006\u0004\u0008\u0006\u0010\u0007\u00a8\u0006\n\u00b2\u0006\u000e\u0010\t\u001a\u00020\u00088\n@\nX\u008a\u008e\u0002"
    }
    d2 = {
        "Lcp1/a;",
        "viewState",
        "Lkotlin/Function1;",
        "Lcp1/i;",
        "Ll83/a0;",
        "onViewEvent",
        "h",
        "(Lcp1/a;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V",
        "",
        "isEnabled",
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
.method public static synthetic a(Lcp1/a;Lkotlin/jvm/functions/Function1;Lp1/c1;Lc31/c;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lep1/c;->o(Lcp1/a;Lkotlin/jvm/functions/Function1;Lp1/c1;Lc31/c;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lp1/c1;Z)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lep1/c;->n(Lp1/c1;Z)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lep1/c;->p(Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Lcp1/i;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lep1/c;->i(Lcp1/i;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic e(Lcp1/a;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p5}, Lep1/c;->q(Lcp1/a;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic f(Lp1/c1;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, Lep1/c;->m(Lp1/c1;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic g(Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lep1/c;->l(Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final h(Lcp1/a;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V
    .locals 82
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcp1/a;",
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

    const v0, 0x3e91a9a7

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

    const/16 v15, 0x12

    const/4 v5, 0x0

    if-eq v4, v15, :cond_6

    const/4 v4, 0x1

    goto :goto_5

    :cond_6
    move v4, v5

    :goto_5
    and-int/lit8 v7, v0, 0x1

    invoke-virtual {v11, v7, v4}, Lp1/q;->U(IZ)Z

    move-result v4

    if-eqz v4, :cond_28

    sget-object v4, Lp1/l;->a:Lp1/v0;

    if-eqz v2, :cond_8

    invoke-virtual {v11}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v4, :cond_7

    new-instance v2, Lep1/a;

    const/4 v3, 0x2

    invoke-direct {v2, v3}, Lep1/a;-><init>(I)V

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

    sget-object v3, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-static {v3}, Lp1/x;->z(Ljava/lang/Object;)Lp1/k1;

    move-result-object v3

    invoke-virtual {v11, v3}, Lp1/q;->p0(Ljava/lang/Object;)V

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

    move/from16 p2, v15

    sget-object v15, Lb2/e;->M:Lb2/k;

    invoke-static {v10, v15, v11, v5}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v10

    iget-wide v5, v11, Lp1/q;->T:J

    invoke-static {v5, v6}, Ljava/lang/Long;->hashCode(J)I

    move-result v5

    invoke-virtual {v11}, Lp1/q;->m()Lp1/p1;

    move-result-object v6

    invoke-static {v11, v9}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v9

    sget-object v18, La3/l;->a:La3/k;

    invoke-virtual/range {v18 .. v18}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v12, La3/k;->b:La3/j;

    invoke-virtual {v11}, Lp1/q;->i0()V

    iget-boolean v7, v11, Lp1/q;->S:Z

    if-eqz v7, :cond_a

    invoke-virtual {v11, v12}, Lp1/q;->l(Lc93/a;)V

    goto :goto_7

    :cond_a
    invoke-virtual {v11}, Lp1/q;->s0()V

    :goto_7
    sget-object v7, La3/k;->g:La3/i;

    invoke-static {v11, v7, v10}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v10, La3/k;->f:La3/i;

    invoke-static {v11, v10, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v6, La3/k;->j:La3/i;

    iget-boolean v13, v11, Lp1/q;->S:Z

    if-nez v13, :cond_b

    invoke-virtual {v11}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v13

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v14

    invoke-static {v13, v14}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v13

    if-nez v13, :cond_c

    :cond_b
    invoke-static {v5, v11, v5, v6}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_c
    sget-object v13, La3/k;->d:La3/i;

    invoke-static {v11, v13, v9}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual {v1}, Lcp1/a;->g()Lcom/whoop/design/util/TextResource;

    move-result-object v5

    move-object v9, v3

    invoke-virtual {v1}, Lcp1/a;->f()Lcom/whoop/design/util/TextResource;

    move-result-object v3

    and-int/lit8 v14, v0, 0x70

    move-object/from16 v21, v5

    const/16 v5, 0x20

    if-ne v14, v5, :cond_d

    const/16 v20, 0x1

    goto :goto_8

    :cond_d
    const/16 v20, 0x0

    :goto_8
    invoke-virtual {v11}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    if-nez v20, :cond_f

    if-ne v5, v4, :cond_e

    goto :goto_9

    :cond_e
    move/from16 v28, v0

    goto :goto_a

    :cond_f
    :goto_9
    new-instance v5, Leo2/j;

    move/from16 v28, v0

    const/4 v0, 0x3

    invoke-direct {v5, v2, v0}, Leo2/j;-><init>(Lkotlin/jvm/functions/Function1;I)V

    invoke-virtual {v11, v5}, Lp1/q;->p0(Ljava/lang/Object;)V

    :goto_a
    check-cast v5, Lc93/a;

    sget v0, Lcom/whoop/design/util/TextResource;->$stable:I

    shl-int/lit8 v20, v0, 0x3

    or-int v20, v0, v20

    move-object/from16 v23, v10

    const/16 v10, 0x1c

    move-object/from16 v24, v4

    const/4 v4, 0x0

    move-object/from16 v25, v7

    move-object v7, v5

    const/4 v5, 0x0

    move-object/from16 v26, v6

    const/4 v6, 0x0

    move/from16 v34, v0

    move-object/from16 v29, v2

    move-object v0, v8

    move-object/from16 v30, v9

    move-object v8, v11

    move/from16 p1, v14

    move/from16 v9, v20

    move-object/from16 v2, v21

    move-object/from16 v31, v23

    move-object/from16 v33, v24

    move-object/from16 v14, v25

    move-object/from16 v32, v26

    const/4 v1, 0x1

    const/high16 v11, 0x3f800000    # 1.0f

    const/16 v20, 0x20

    invoke-static/range {v2 .. v10}, Lep1/s;->e(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;ILcom/whoop/design/util/TextResource;Lc93/a;Lc93/a;Landroidx/compose/runtime/Composer;II)V

    move-object v5, v8

    sget-object v8, Ll0/z;->a:Ll0/z;

    invoke-virtual {v8, v0, v1, v11}, Ll0/z;->c(Landroidx/compose/ui/Modifier;ZF)Landroidx/compose/ui/Modifier;

    move-result-object v2

    const-wide/high16 v3, 0x4004000000000000L    # 2.5

    double-to-float v3, v3

    const/16 v9, 0x8

    int-to-float v10, v9

    mul-float/2addr v3, v10

    const/4 v4, 0x0

    const/4 v6, 0x2

    invoke-static {v2, v3, v4, v6}, Landroidx/compose/foundation/layout/a;->r(Landroidx/compose/ui/Modifier;FFI)Landroidx/compose/ui/Modifier;

    move-result-object v2

    const/4 v7, 0x0

    invoke-static {v2, v4, v1, v7}, Lgb1/c;->m(Landroidx/compose/ui/Modifier;FILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    const/4 v4, 0x0

    invoke-static {v4, v5, v1}, Lq83/g;->U(ILandroidx/compose/runtime/Composer;I)Lf0/r1;

    move-result-object v7

    const/16 v4, 0xe

    invoke-static {v2, v7, v4}, Lq83/g;->f0(Landroidx/compose/ui/Modifier;Lf0/r1;I)Landroidx/compose/ui/Modifier;

    move-result-object v2

    sget-object v4, Ll0/m;->d:Ll0/g;

    const/16 v7, 0x36

    invoke-static {v4, v15, v5, v7}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v4

    iget-wide v6, v5, Lp1/q;->T:J

    invoke-static {v6, v7}, Ljava/lang/Long;->hashCode(J)I

    move-result v6

    invoke-virtual {v5}, Lp1/q;->m()Lp1/p1;

    move-result-object v7

    invoke-static {v5, v2}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    invoke-virtual {v5}, Lp1/q;->i0()V

    iget-boolean v9, v5, Lp1/q;->S:Z

    if-eqz v9, :cond_10

    invoke-virtual {v5, v12}, Lp1/q;->l(Lc93/a;)V

    goto :goto_b

    :cond_10
    invoke-virtual {v5}, Lp1/q;->s0()V

    :goto_b
    invoke-static {v5, v14, v4}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    move-object/from16 v9, v31

    invoke-static {v5, v9, v7}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v4, v5, Lp1/q;->S:Z

    if-nez v4, :cond_11

    invoke-virtual {v5}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-static {v4, v7}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_12

    :cond_11
    move-object/from16 v4, v32

    goto :goto_c

    :cond_12
    move-object/from16 v4, v32

    goto :goto_d

    :goto_c
    invoke-static {v6, v5, v6, v4}, Ld;->y(ILp1/q;ILa3/i;)V

    :goto_d
    invoke-static {v5, v13, v2}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual {v8, v0, v1, v11}, Ll0/z;->c(Landroidx/compose/ui/Modifier;ZF)Landroidx/compose/ui/Modifier;

    move-result-object v2

    invoke-static {v5, v2}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    invoke-virtual/range {p0 .. p0}, Lcp1/a;->e()Lkd1/o;

    move-result-object v2

    if-nez v2, :cond_13

    const v2, 0x233b77e7

    invoke-virtual {v5, v2}, Lp1/q;->e0(I)V

    const/4 v6, 0x0

    invoke-virtual {v5, v6}, Lp1/q;->q(Z)V

    move/from16 v36, v3

    move-object/from16 v35, v4

    move-object v15, v8

    move-object/from16 v38, v9

    move/from16 v39, v10

    move-object/from16 v16, v12

    move-object/from16 v17, v13

    const/16 v19, 0x2

    const/16 v31, 0x8

    move v13, v6

    move v12, v11

    goto :goto_e

    :cond_13
    const/4 v6, 0x0

    const v7, 0x233b77e8

    invoke-virtual {v5, v7}, Lp1/q;->e0(I)V

    invoke-static {v11, v0}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v7

    const/16 v6, 0x3c

    int-to-float v6, v6

    const/4 v15, 0x4

    int-to-float v11, v15

    mul-float/2addr v6, v11

    invoke-static {v6, v7}, Landroidx/compose/foundation/layout/d;->h(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v11

    sget v6, Lkd1/o;->a:I

    const/4 v7, 0x3

    move/from16 v22, v3

    const/4 v3, 0x0

    move-object/from16 v32, v4

    const/4 v4, 0x0

    move/from16 v36, v22

    move-object/from16 v35, v32

    const/16 v16, 0x0

    const/16 v19, 0x2

    invoke-static/range {v2 .. v7}, Lkd1/p;->i(Lkd1/o;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)Ln2/a;

    move-result-object v2

    move-object/from16 v24, v5

    move v3, v10

    const/16 v10, 0x1b0

    move-object v4, v11

    const/16 v11, 0x78

    move v5, v3

    const/4 v3, 0x0

    move v6, v5

    const/4 v5, 0x0

    move v7, v6

    const/4 v6, 0x0

    move/from16 v21, v7

    const/4 v7, 0x0

    move-object/from16 v22, v8

    const/4 v8, 0x0

    move-object/from16 v38, v9

    move-object/from16 v17, v13

    move/from16 v13, v16

    move/from16 v39, v21

    move-object/from16 v15, v22

    move-object/from16 v9, v24

    const/16 v31, 0x8

    move-object/from16 v16, v12

    const/high16 v12, 0x3f800000    # 1.0f

    invoke-static/range {v2 .. v11}, Lpf/c;->c(Ln2/a;Ljava/lang/String;Landroidx/compose/ui/Modifier;Lb2/h;Ly2/k;FLi2/y;Landroidx/compose/runtime/Composer;II)V

    move-object v5, v9

    invoke-virtual {v5, v13}, Lp1/q;->q(Z)V

    :goto_e
    invoke-virtual {v15, v0, v1, v12}, Ll0/z;->c(Landroidx/compose/ui/Modifier;ZF)Landroidx/compose/ui/Modifier;

    move-result-object v2

    invoke-static {v5, v2}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    invoke-virtual/range {p0 .. p0}, Lcp1/a;->i()Lcom/whoop/design/util/TextResource;

    move-result-object v2

    move/from16 v3, v34

    invoke-static {v2, v5, v3}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v2

    sget-object v4, Lx81/d;->a:Lx81/d;

    sget v6, Lx81/d;->b:I

    invoke-virtual {v4, v5, v6}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v7

    invoke-virtual {v7}, Lb91/d;->O()Lb91/a;

    move-result-object v22

    invoke-virtual {v4, v5, v6}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v7

    invoke-virtual {v7}, Ly81/i;->y()J

    move-result-wide v7

    sget v9, Lb91/a;->d:I

    shl-int/lit8 v26, v9, 0x12

    const v27, 0x2fffa

    const/4 v3, 0x0

    move-object v9, v4

    move-object/from16 v24, v5

    move-wide v4, v7

    move v8, v6

    const-wide/16 v6, 0x0

    move v10, v8

    const/4 v8, 0x0

    move-object v11, v9

    const/4 v9, 0x0

    move v15, v10

    const/4 v10, 0x0

    move-object/from16 v21, v11

    move/from16 v23, v12

    const-wide/16 v11, 0x0

    move/from16 v25, v13

    const/4 v13, 0x0

    move-object/from16 v32, v14

    const/4 v14, 0x0

    move/from16 v41, v15

    move-object/from16 v40, v16

    const-wide/16 v15, 0x0

    move-object/from16 v42, v17

    const/16 v17, 0x0

    const/16 v43, 0x4

    const/16 v18, 0x0

    move/from16 v44, v19

    const/16 v19, 0x0

    move/from16 v45, v20

    const/16 v20, 0x0

    move-object/from16 v46, v21

    const/16 v21, 0x0

    move/from16 v47, v23

    const/16 v23, 0x0

    move/from16 v48, v25

    const/16 v25, 0x0

    move/from16 v52, p1

    move-object/from16 v50, v32

    move-object/from16 v49, v40

    move/from16 v54, v41

    move-object/from16 v51, v42

    move/from16 v1, v44

    move-object/from16 v53, v46

    invoke-static/range {v2 .. v27}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v5, v24

    int-to-float v1, v1

    move/from16 v3, v39

    mul-float/2addr v1, v3

    invoke-static {v1, v0}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    invoke-static {v5, v2}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    invoke-virtual/range {p0 .. p0}, Lcp1/a;->a()Lcom/whoop/design/util/TextResource;

    move-result-object v2

    move/from16 v4, v34

    invoke-static {v2, v5, v4}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v2

    move-object/from16 v6, v53

    move/from16 v7, v54

    invoke-virtual {v6, v5, v7}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v8

    invoke-virtual {v8}, Lb91/d;->a()Lb91/a;

    move-result-object v22

    invoke-virtual {v6, v5, v7}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v8

    invoke-virtual {v8}, Ly81/i;->c1()J

    move-result-wide v8

    move/from16 v21, v3

    const/4 v3, 0x0

    move-object v11, v6

    move v15, v7

    const-wide/16 v6, 0x0

    move-wide v4, v8

    const/4 v8, 0x0

    const/4 v9, 0x0

    move-object/from16 v46, v11

    const-wide/16 v11, 0x0

    move/from16 v54, v15

    const-wide/16 v15, 0x0

    move/from16 v39, v21

    const/16 v21, 0x0

    move/from16 p1, v1

    move/from16 v55, v34

    move/from16 v1, v39

    move-object/from16 v56, v46

    move/from16 v57, v54

    invoke-static/range {v2 .. v27}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v5, v24

    const/4 v2, 0x4

    int-to-float v3, v2

    invoke-static {v3, v1, v0, v5}, Lih0/d0;->u(FFLb2/t;Lp1/q;)V

    const/high16 v4, 0x3f800000    # 1.0f

    invoke-static {v4, v0}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v6

    move-object/from16 v7, v56

    move/from16 v8, v57

    invoke-virtual {v7, v5, v8}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v9

    invoke-virtual {v9}, Ly81/i;->a1()J

    move-result-wide v9

    const/4 v11, 0x3

    int-to-float v11, v11

    invoke-static {v6, v11, v3, v9, v10}, Lr80/c;->e(Landroidx/compose/ui/Modifier;FFJ)Landroidx/compose/ui/Modifier;

    move-result-object v6

    const-wide/high16 v9, 0x3fe0000000000000L    # 0.5

    double-to-float v9, v9

    mul-float/2addr v9, v3

    const/4 v10, 0x1

    int-to-float v12, v10

    mul-float/2addr v12, v3

    move/from16 v10, p1

    invoke-static {v6, v10, v9, v12, v9}, Landroidx/compose/foundation/layout/a;->s(Landroidx/compose/ui/Modifier;FFFF)Landroidx/compose/ui/Modifier;

    move-result-object v6

    sget-object v9, Lb2/e;->K:Lb2/l;

    sget-object v10, Ll0/m;->g:Ll0/h;

    const/16 v15, 0x36

    invoke-static {v10, v9, v5, v15}, Ll0/p1;->a(Ll0/i;Lb2/g;Landroidx/compose/runtime/Composer;I)Ll0/r1;

    move-result-object v9

    iget-wide v12, v5, Lp1/q;->T:J

    invoke-static {v12, v13}, Ljava/lang/Long;->hashCode(J)I

    move-result v10

    invoke-virtual {v5}, Lp1/q;->m()Lp1/p1;

    move-result-object v12

    invoke-static {v5, v6}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v6

    invoke-virtual {v5}, Lp1/q;->i0()V

    iget-boolean v13, v5, Lp1/q;->S:Z

    if-eqz v13, :cond_14

    move-object/from16 v13, v49

    invoke-virtual {v5, v13}, Lp1/q;->l(Lc93/a;)V

    :goto_f
    move-object/from16 v14, v50

    goto :goto_10

    :cond_14
    move-object/from16 v13, v49

    invoke-virtual {v5}, Lp1/q;->s0()V

    goto :goto_f

    :goto_10
    invoke-static {v5, v14, v9}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    move-object/from16 v9, v38

    invoke-static {v5, v9, v12}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v12, v5, Lp1/q;->S:Z

    if-nez v12, :cond_15

    invoke-virtual {v5}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v12

    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v15

    invoke-static {v12, v15}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v12

    if-nez v12, :cond_16

    :cond_15
    move-object/from16 v12, v35

    goto :goto_12

    :cond_16
    move-object/from16 v12, v35

    :goto_11
    move-object/from16 v10, v51

    goto :goto_13

    :goto_12
    invoke-static {v10, v5, v10, v12}, Ld;->y(ILp1/q;ILa3/i;)V

    goto :goto_11

    :goto_13
    invoke-static {v5, v10, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    move v6, v3

    float-to-double v2, v4

    const-wide/16 v15, 0x0

    cmpl-double v2, v2, v15

    if-lez v2, :cond_17

    const/4 v2, 0x1

    goto :goto_14

    :cond_17
    const/4 v2, 0x0

    :goto_14
    if-nez v2, :cond_18

    const-string v2, "invalid weight; must be greater than zero"

    invoke-static {v2}, Lm0/a;->a(Ljava/lang/String;)V

    :cond_18
    new-instance v3, Landroidx/compose/foundation/layout/LayoutWeightElement;

    const/4 v2, 0x1

    invoke-direct {v3, v4, v2}, Landroidx/compose/foundation/layout/LayoutWeightElement;-><init>(FZ)V

    invoke-virtual/range {p0 .. p0}, Lcp1/a;->d()Lcom/whoop/design/util/TextResource;

    move-result-object v2

    move/from16 v15, v55

    invoke-static {v2, v5, v15}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v7, v5, v8}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v15

    invoke-virtual {v15}, Lb91/d;->a()Lb91/a;

    move-result-object v22

    invoke-virtual {v7, v5, v8}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v15

    invoke-virtual {v15}, Ly81/i;->y()J

    move-result-wide v15

    const/16 v25, 0x0

    const v27, 0x2fff8

    move/from16 v17, v6

    move-object/from16 v46, v7

    const-wide/16 v6, 0x0

    move/from16 v54, v8

    const/4 v8, 0x0

    move-object/from16 v38, v9

    const/4 v9, 0x0

    move-object/from16 v51, v10

    const/4 v10, 0x0

    move/from16 v19, v11

    move-object/from16 v35, v12

    const-wide/16 v11, 0x0

    move-object/from16 v49, v13

    const/4 v13, 0x0

    move-object/from16 v50, v14

    const/4 v14, 0x0

    move/from16 v47, v4

    move-object/from16 v24, v5

    move-wide v4, v15

    const-wide/16 v15, 0x0

    move/from16 v20, v17

    const/16 v17, 0x0

    const/16 v43, 0x4

    const/16 v18, 0x0

    move/from16 v21, v19

    const/16 v19, 0x0

    move/from16 v23, v20

    const/16 v20, 0x0

    move/from16 v34, v21

    const/16 v21, 0x0

    move/from16 v37, v23

    const/16 v23, 0x0

    move/from16 v39, v1

    move-object/from16 v60, v35

    move-object/from16 v59, v38

    move-object/from16 v1, v46

    move-object/from16 v40, v49

    move-object/from16 v58, v50

    move-object/from16 v61, v51

    move/from16 v35, v34

    move-object/from16 v34, v0

    move/from16 v0, v54

    invoke-static/range {v2 .. v27}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v5, v24

    invoke-virtual {v1, v5, v0}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v0

    invoke-virtual {v0}, Ly81/i;->X()J

    move-result-wide v0

    new-instance v2, Lcom/whoop/profile/view/edit/c;

    const/4 v3, 0x3

    move-object/from16 v14, v30

    invoke-direct {v2, v3, v14}, Lcom/whoop/profile/view/edit/c;-><init>(ILp1/c1;)V

    const v3, 0x317a9f90

    invoke-static {v3, v5, v2}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v10

    const/16 v12, 0x6000

    const/16 v13, 0xd

    const-wide/16 v2, 0x0

    const-wide/16 v8, 0x0

    move-object v11, v5

    move-wide v4, v0

    invoke-static/range {v2 .. v13}, Ly81/c;->b(JJJJLc93/m;Landroidx/compose/runtime/Composer;II)V

    move-object v5, v11

    const/4 v1, 0x1

    invoke-virtual {v5, v1}, Lp1/q;->q(Z)V

    mul-float v3, v37, v37

    move-object/from16 v0, v34

    invoke-static {v3, v0}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    invoke-static {v5, v2}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    invoke-virtual {v5, v1}, Lp1/q;->q(Z)V

    const/high16 v11, 0x3f800000    # 1.0f

    invoke-static {v11, v0}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    sget-object v2, Ll0/m;->b:Ll0/e;

    sget-object v3, Lb2/e;->J:Lb2/l;

    const/4 v4, 0x6

    invoke-static {v2, v3, v5, v4}, Ll0/p1;->a(Ll0/i;Lb2/g;Landroidx/compose/runtime/Composer;I)Ll0/r1;

    move-result-object v2

    iget-wide v3, v5, Lp1/q;->T:J

    invoke-static {v3, v4}, Ljava/lang/Long;->hashCode(J)I

    move-result v3

    invoke-virtual {v5}, Lp1/q;->m()Lp1/p1;

    move-result-object v4

    invoke-static {v5, v1}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    invoke-virtual {v5}, Lp1/q;->i0()V

    iget-boolean v6, v5, Lp1/q;->S:Z

    if-eqz v6, :cond_19

    move-object/from16 v13, v40

    invoke-virtual {v5, v13}, Lp1/q;->l(Lc93/a;)V

    :goto_15
    move-object/from16 v6, v58

    goto :goto_16

    :cond_19
    move-object/from16 v13, v40

    invoke-virtual {v5}, Lp1/q;->s0()V

    goto :goto_15

    :goto_16
    invoke-static {v5, v6, v2}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    move-object/from16 v9, v59

    invoke-static {v5, v9, v4}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v2, v5, Lp1/q;->S:Z

    if-nez v2, :cond_1a

    invoke-virtual {v5}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-static {v2, v4}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_1b

    :cond_1a
    move-object/from16 v12, v60

    goto :goto_18

    :cond_1b
    move-object/from16 v12, v60

    :goto_17
    move-object/from16 v10, v61

    goto :goto_19

    :goto_18
    invoke-static {v3, v5, v3, v12}, Ld;->y(ILp1/q;ILa3/i;)V

    goto :goto_17

    :goto_19
    invoke-static {v5, v10, v1}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    mul-float v11, v35, v39

    move/from16 v3, v36

    invoke-static {v0, v3, v11}, Landroidx/compose/foundation/layout/a;->q(Landroidx/compose/ui/Modifier;FF)Landroidx/compose/ui/Modifier;

    move-result-object v0

    sget-object v1, Lb2/e;->w:Lb2/m;

    const/4 v4, 0x0

    invoke-static {v1, v4}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v1

    iget-wide v2, v5, Lp1/q;->T:J

    invoke-static {v2, v3}, Ljava/lang/Long;->hashCode(J)I

    move-result v2

    invoke-virtual {v5}, Lp1/q;->m()Lp1/p1;

    move-result-object v3

    invoke-static {v5, v0}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    invoke-virtual {v5}, Lp1/q;->i0()V

    iget-boolean v7, v5, Lp1/q;->S:Z

    if-eqz v7, :cond_1c

    invoke-virtual {v5, v13}, Lp1/q;->l(Lc93/a;)V

    goto :goto_1a

    :cond_1c
    invoke-virtual {v5}, Lp1/q;->s0()V

    :goto_1a
    invoke-static {v5, v6, v1}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v5, v9, v3}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v1, v5, Lp1/q;->S:Z

    if-nez v1, :cond_1d

    invoke-virtual {v5}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1e

    :cond_1d
    invoke-static {v2, v5, v2, v12}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_1e
    invoke-static {v5, v10, v0}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    new-instance v62, Lc31/k;

    sget-object v63, Lc31/d;->PROGRESS:Lc31/d;

    invoke-virtual/range {p0 .. p0}, Lcp1/a;->h()Lcp1/c;

    move-result-object v0

    invoke-virtual {v0}, Lcp1/c;->c()Lcom/whoop/design/util/TextResource;

    move-result-object v64

    invoke-virtual/range {p0 .. p0}, Lcp1/a;->h()Lcp1/c;

    move-result-object v0

    invoke-virtual {v0}, Lcp1/c;->a()I

    move-result v69

    invoke-virtual/range {p0 .. p0}, Lcp1/a;->h()Lcp1/c;

    move-result-object v0

    invoke-virtual {v0}, Lcp1/c;->b()I

    move-result v70

    invoke-static {}, Lgb1/b0;->G0()Li2/t;

    move-result-object v75

    const v80, 0x1ef3c

    const/16 v81, 0x0

    const/16 v65, 0x0

    const/16 v66, 0x0

    const/16 v67, 0x0

    const/16 v68, 0x0

    const/16 v71, 0x0

    const/16 v72, 0x0

    const/16 v73, 0x0

    const/16 v74, 0x0

    const/16 v76, 0x0

    const/16 v77, 0x0

    const/16 v78, 0x0

    const/16 v79, 0x0

    invoke-direct/range {v62 .. v81}, Lc31/k;-><init>(Lc31/d;Lcom/whoop/design/util/TextResource;Ly81/e;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lgz0/m0;IILjava/lang/Float;ZZLy81/e;Li2/t;Ly81/e;Ly81/e;Lcom/whoop/navigation/models/GenericInteraction;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object/from16 v0, v62

    and-int/lit8 v1, v28, 0xe

    const/4 v15, 0x4

    if-eq v1, v15, :cond_21

    and-int/lit8 v1, v28, 0x8

    if-eqz v1, :cond_1f

    move-object/from16 v1, p0

    invoke-virtual {v5, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_20

    goto :goto_1c

    :cond_1f
    move-object/from16 v1, p0

    :cond_20
    move v2, v4

    :goto_1b
    move/from16 v3, v52

    const/16 v6, 0x20

    goto :goto_1d

    :cond_21
    move-object/from16 v1, p0

    :goto_1c
    const/4 v2, 0x1

    goto :goto_1b

    :goto_1d
    if-ne v3, v6, :cond_22

    const/4 v7, 0x1

    goto :goto_1e

    :cond_22
    move v7, v4

    :goto_1e
    or-int/2addr v2, v7

    invoke-virtual {v5}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v7

    if-nez v2, :cond_24

    move-object/from16 v2, v33

    if-ne v7, v2, :cond_23

    goto :goto_1f

    :cond_23
    move-object/from16 v9, v29

    goto :goto_20

    :cond_24
    move-object/from16 v2, v33

    :goto_1f
    new-instance v7, Lq;

    const/16 v8, 0x1d

    move-object/from16 v9, v29

    invoke-direct {v7, v1, v9, v14, v8}, Lq;-><init>(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Ljava/lang/Object;I)V

    invoke-virtual {v5, v7}, Lp1/q;->p0(Ljava/lang/Object;)V

    :goto_20
    check-cast v7, Lkotlin/jvm/functions/Function1;

    sget v8, Lc31/k;->r:I

    invoke-static {v0, v7, v5, v8, v4}, Lc31/j;->e(Lc31/k;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    const/4 v10, 0x1

    invoke-static {v5, v10, v10, v10}, Lm4/a;->y(Lp1/q;ZZZ)V

    if-ne v3, v6, :cond_25

    const/4 v0, 0x1

    goto :goto_21

    :cond_25
    move v0, v4

    :goto_21
    invoke-virtual {v5}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    if-nez v0, :cond_26

    if-ne v3, v2, :cond_27

    :cond_26
    new-instance v3, Leo2/j;

    const/4 v0, 0x4

    invoke-direct {v3, v9, v0}, Leo2/j;-><init>(Lkotlin/jvm/functions/Function1;I)V

    invoke-virtual {v5, v3}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_27
    check-cast v3, Lc93/a;

    const/4 v10, 0x1

    invoke-static {v3, v4, v5, v4, v10}, Lio/sentry/config/a;->c(Lc93/a;ZLandroidx/compose/runtime/Composer;II)V

    move-object v3, v9

    goto :goto_22

    :cond_28
    move-object v5, v11

    invoke-virtual {v5}, Lp1/q;->X()V

    :goto_22
    invoke-virtual {v5}, Lp1/q;->u()Lp1/v1;

    move-result-object v6

    if-eqz v6, :cond_29

    new-instance v0, Ld62/b;

    const/16 v5, 0xe

    move/from16 v2, p3

    move/from16 v4, p4

    invoke-direct/range {v0 .. v5}, Ld62/b;-><init>(Ljava/lang/Object;ILjava/lang/Object;II)V

    iput-object v0, v6, Lp1/v1;->d:Lc93/m;

    :cond_29
    return-void
.end method

.method private static final i(Lcp1/i;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final j(Lp1/c1;)Z
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

.method private static final k(Lp1/c1;Z)V
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

.method private static final l(Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 1

    sget-object v0, Lcp1/i$a;->a:Lcp1/i$a;

    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final m(Lp1/c1;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 12

    and-int/lit8 v0, p2, 0x3

    const/4 v1, 0x2

    const/4 v2, 0x1

    if-eq v0, v1, :cond_0

    move v0, v2

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    and-int/2addr p2, v2

    move-object v9, p1

    check-cast v9, Lp1/q;

    invoke-virtual {v9, p2, v0}, Lp1/q;->U(IZ)Z

    move-result p1

    if-eqz p1, :cond_2

    invoke-static {p0}, Lep1/c;->j(Lp1/c1;)Z

    move-result v2

    invoke-virtual {v9}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object p1

    sget-object p2, Lp1/l;->a:Lp1/v0;

    if-ne p1, p2, :cond_1

    new-instance p1, Laq1/d;

    const/16 p2, 0x1c

    invoke-direct {p1, p2, p0}, Laq1/d;-><init>(ILp1/c1;)V

    invoke-virtual {v9, p1}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_1
    move-object v8, p1

    check-cast v8, Lkotlin/jvm/functions/Function1;

    const/high16 v10, 0x180000

    const/16 v11, 0x3d

    const/4 v1, 0x0

    const/4 v3, 0x0

    const-wide/16 v4, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-static/range {v1 .. v11}, Lpz0/d;->e(Landroidx/compose/ui/Modifier;ZZJLpz0/e;Li2/t;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    goto :goto_1

    :cond_2
    invoke-virtual {v9}, Lp1/q;->X()V

    :goto_1
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final n(Lp1/c1;Z)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lep1/c;->k(Lp1/c1;Z)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final o(Lcp1/a;Lkotlin/jvm/functions/Function1;Lp1/c1;Lc31/c;)Ll83/a0;
    .locals 10

    const-string v0, "it"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p2}, Lep1/c;->j(Lp1/c1;)Z

    move-result p2

    if-eqz p2, :cond_0

    invoke-virtual {p0}, Lcp1/a;->c()Lcom/whoop/hormonalinsights/postpartum/domain/models/HormonalScreenId;

    move-result-object p0

    goto :goto_0

    :cond_0
    invoke-virtual {p0}, Lcp1/a;->b()Lcom/whoop/hormonalinsights/postpartum/domain/models/HormonalScreenId;

    move-result-object p0

    :goto_0
    new-instance p2, Lcp1/i$d;

    new-instance v0, Lzo1/b;

    const/16 v8, 0x7f

    const/4 v9, 0x0

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-direct/range {v0 .. v9}, Lzo1/b;-><init>(Ljava/util/List;Ljava/util/List;Ljava/lang/Integer;Lcom/whoop/hormonalinsights/onboarding/domain/models/MciInterest;Lcom/whoop/hormonalinsights/onboarding/domain/models/ContraceptionType;Ljava/util/List;Ljava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-direct {p2, p0, v0}, Lcp1/i$d;-><init>(Lcom/whoop/hormonalinsights/postpartum/domain/models/HormonalScreenId;Lzo1/b;)V

    invoke-interface {p1, p2}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

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

.method private static final q(Lcp1/a;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, Lp1/x;->L(I)I

    move-result p2

    invoke-static {p0, p1, p4, p2, p3}, Lep1/c;->h(Lcp1/a;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method
