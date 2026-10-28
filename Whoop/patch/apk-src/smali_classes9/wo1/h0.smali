.class public abstract Lwo1/h0;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000,\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u000e\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0005\u001aC\u0010\u0008\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0014\u0008\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\u0014\u0008\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00040\u0002H\u0001\u00a2\u0006\u0004\u0008\u0008\u0010\t\u001a%\u0010\u000e\u001a\u0004\u0018\u00010\r*\u00020\u00002\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\u000c\u001a\u00020\nH\u0002\u00a2\u0006\u0004\u0008\u000e\u0010\u000f\u00a8\u0006\u0012\u00b2\u0006\u000e\u0010\u0010\u001a\u00020\n8\n@\nX\u008a\u008e\u0002\u00b2\u0006\u000e\u0010\u0011\u001a\u00020\n8\n@\nX\u008a\u008e\u0002"
    }
    d2 = {
        "Lso1/c;",
        "viewState",
        "Lkotlin/Function1;",
        "Lro1/g;",
        "Ll83/a0;",
        "onNavigationEvent",
        "Lyn1/a;",
        "onAnalyticEvent",
        "g",
        "(Lso1/c;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V",
        "",
        "cycleId",
        "trendId",
        "Lso1/d0;",
        "r",
        "(Lso1/c;Ljava/lang/String;Ljava/lang/String;)Lso1/d0;",
        "selectedButtonId",
        "selectedCycleId",
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
.method public static synthetic a(Ljava/util/List;Lp1/c1;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, Lwo1/h0;->p(Ljava/util/List;Lp1/c1;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lcom/whoop/navigation/e;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 0

    invoke-static {p1, p2, p0}, Lwo1/h0;->o(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lcom/whoop/navigation/e;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Lyn1/a;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lwo1/h0;->i(Lyn1/a;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Lso1/c;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p6}, Lwo1/h0;->q(Lso1/c;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic e(Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lp1/c1;)Ll83/a0;
    .locals 0

    invoke-static {p1, p2, p0}, Lwo1/h0;->n(Lkotlin/jvm/functions/Function1;Lp1/c1;Ljava/lang/String;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic f(Lro1/g;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lwo1/h0;->h(Lro1/g;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final g(Lso1/c;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V
    .locals 54
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lso1/c;",
            "Lkotlin/jvm/functions/Function1;",
            "Lkotlin/jvm/functions/Function1;",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    move-object/from16 v1, p0

    move/from16 v4, p4

    const-string v0, "viewState"

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v10, p3

    check-cast v10, Lp1/q;

    const v0, -0x56b87e8f

    invoke-virtual {v10, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, v4, 0x6

    if-nez v0, :cond_1

    invoke-virtual {v10, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x4

    goto :goto_0

    :cond_0
    const/4 v0, 0x2

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
    move-object/from16 v7, p1

    goto :goto_3

    :cond_3
    and-int/lit8 v7, v4, 0x30

    if-nez v7, :cond_2

    move-object/from16 v7, p1

    invoke-virtual {v10, v7}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_4

    const/16 v8, 0x20

    goto :goto_2

    :cond_4
    const/16 v8, 0x10

    :goto_2
    or-int/2addr v0, v8

    :goto_3
    and-int/lit8 v8, p5, 0x4

    if-eqz v8, :cond_6

    or-int/lit16 v0, v0, 0x180

    :cond_5
    move-object/from16 v11, p2

    goto :goto_5

    :cond_6
    and-int/lit16 v11, v4, 0x180

    if-nez v11, :cond_5

    move-object/from16 v11, p2

    invoke-virtual {v10, v11}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v12

    if-eqz v12, :cond_7

    const/16 v12, 0x100

    goto :goto_4

    :cond_7
    const/16 v12, 0x80

    :goto_4
    or-int/2addr v0, v12

    :goto_5
    and-int/lit16 v12, v0, 0x93

    const/16 v13, 0x92

    const/4 v15, 0x0

    if-eq v12, v13, :cond_8

    const/4 v12, 0x1

    goto :goto_6

    :cond_8
    move v12, v15

    :goto_6
    and-int/lit8 v13, v0, 0x1

    invoke-virtual {v10, v13, v12}, Lp1/q;->U(IZ)Z

    move-result v12

    if-eqz v12, :cond_2f

    sget-object v12, Lp1/l;->a:Lp1/v0;

    if-eqz v5, :cond_a

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    if-ne v5, v12, :cond_9

    new-instance v5, Lwo1/e0;

    const/4 v7, 0x1

    invoke-direct {v5, v7}, Lwo1/e0;-><init>(I)V

    invoke-virtual {v10, v5}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_9
    check-cast v5, Lkotlin/jvm/functions/Function1;

    goto :goto_7

    :cond_a
    move-object v5, v7

    :goto_7
    if-eqz v8, :cond_c

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v7

    if-ne v7, v12, :cond_b

    new-instance v7, Lwo1/e0;

    const/4 v8, 0x2

    invoke-direct {v7, v8}, Lwo1/e0;-><init>(I)V

    invoke-virtual {v10, v7}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_b
    check-cast v7, Lkotlin/jvm/functions/Function1;

    move-object v11, v7

    :cond_c
    invoke-virtual {v1}, Lso1/c;->l()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v10, v7}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v7

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v8

    if-nez v7, :cond_d

    if-ne v8, v12, :cond_e

    :cond_d
    invoke-virtual {v1}, Lso1/c;->l()Ljava/lang/String;

    move-result-object v7

    invoke-static {v7}, Lp1/x;->z(Ljava/lang/Object;)Lp1/k1;

    move-result-object v8

    invoke-virtual {v10, v8}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_e
    check-cast v8, Lp1/c1;

    invoke-virtual {v1}, Lso1/c;->j()Ljava/lang/String;

    move-result-object v7

    invoke-virtual {v10, v7}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v7

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v13

    if-nez v7, :cond_f

    if-ne v13, v12, :cond_10

    :cond_f
    invoke-virtual {v1}, Lso1/c;->j()Ljava/lang/String;

    move-result-object v7

    invoke-static {v7}, Lp1/x;->z(Ljava/lang/Object;)Lp1/k1;

    move-result-object v13

    invoke-virtual {v10, v13}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_10
    check-cast v13, Lp1/c1;

    invoke-static {v13}, Lwo1/h0;->l(Lp1/c1;)Ljava/lang/String;

    move-result-object v7

    invoke-static {v8}, Lwo1/h0;->j(Lp1/c1;)Ljava/lang/String;

    move-result-object v6

    invoke-static {v1, v7, v6}, Lwo1/h0;->r(Lso1/c;Ljava/lang/String;Ljava/lang/String;)Lso1/d0;

    move-result-object v31

    invoke-virtual {v1}, Lso1/c;->a()Ljava/util/Map;

    move-result-object v6

    invoke-static {v13}, Lwo1/h0;->l(Lp1/c1;)Ljava/lang/String;

    move-result-object v7

    invoke-interface {v6, v7}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lcom/whoop/design/util/TextResource;

    sget-object v7, Ll0/m;->c:Ll0/g;

    sget-object v9, Lb2/e;->M:Lb2/k;

    invoke-static {v7, v9, v10, v15}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v7

    iget-wide v14, v10, Lp1/q;->T:J

    invoke-static {v14, v15}, Ljava/lang/Long;->hashCode(J)I

    move-result v14

    invoke-virtual {v10}, Lp1/q;->m()Lp1/p1;

    move-result-object v15

    sget-object v3, Lb2/t;->w:Lb2/t;

    invoke-static {v10, v3}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v9

    sget-object v18, La3/l;->a:La3/k;

    invoke-virtual/range {v18 .. v18}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move-object/from16 p2, v6

    sget-object v6, La3/k;->b:La3/j;

    invoke-virtual {v10}, Lp1/q;->i0()V

    iget-boolean v2, v10, Lp1/q;->S:Z

    if-eqz v2, :cond_11

    invoke-virtual {v10, v6}, Lp1/q;->l(Lc93/a;)V

    goto :goto_8

    :cond_11
    invoke-virtual {v10}, Lp1/q;->s0()V

    :goto_8
    sget-object v2, La3/k;->g:La3/i;

    invoke-static {v10, v2, v7}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v7, La3/k;->f:La3/i;

    invoke-static {v10, v7, v15}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v15, La3/k;->j:La3/i;

    iget-boolean v1, v10, Lp1/q;->S:Z

    if-nez v1, :cond_12

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    invoke-static {v14}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-static {v1, v4}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_13

    :cond_12
    invoke-static {v14, v10, v14, v15}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_13
    sget-object v1, La3/k;->d:La3/i;

    invoke-static {v10, v1, v9}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual/range {p0 .. p0}, Lso1/c;->m()Z

    move-result v4

    const/16 v9, 0x8

    if-eqz v4, :cond_14

    const v4, 0x7c7f5f63

    invoke-virtual {v10, v4}, Lp1/q;->e0(I)V

    int-to-float v4, v9

    move-object/from16 v18, v6

    const/4 v14, 0x4

    int-to-float v6, v14

    mul-float/2addr v4, v6

    invoke-static {v4, v3}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    invoke-static {v10, v4}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    invoke-virtual/range {p0 .. p0}, Lso1/c;->o()Lcom/whoop/design/util/TextResource;

    move-result-object v4

    sget v14, Lcom/whoop/design/util/TextResource;->$stable:I

    invoke-static {v4, v10, v14}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v4

    sget-object v14, Lx81/d;->a:Lx81/d;

    sget v9, Lx81/d;->b:I

    invoke-virtual {v14, v10, v9}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v20

    invoke-virtual/range {v20 .. v20}, Lb91/d;->P()Lb91/a;

    move-result-object v25

    invoke-virtual {v14, v10, v9}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v9

    invoke-virtual {v9}, Ly81/i;->y()J

    move-result-wide v20

    sget v9, Lb91/a;->d:I

    shl-int/lit8 v29, v9, 0x12

    const v30, 0x2fffa

    move v9, v6

    const/4 v6, 0x0

    move v14, v9

    move-object/from16 v27, v10

    const-wide/16 v9, 0x0

    move-object/from16 v22, v11

    const/4 v11, 0x0

    move-object/from16 v23, v12

    const/4 v12, 0x0

    move-object/from16 v24, v13

    const/4 v13, 0x0

    move/from16 v28, v14

    move-object/from16 v26, v15

    const-wide/16 v14, 0x0

    const/16 v32, 0x100

    const/16 v16, 0x0

    const/16 v33, 0x0

    const/16 v17, 0x0

    move-object/from16 v34, v18

    const/16 v35, 0x8

    const-wide/16 v18, 0x0

    move-object/from16 v36, v7

    move-wide/from16 v52, v20

    move-object/from16 v21, v8

    move-wide/from16 v7, v52

    const/16 v20, 0x0

    move-object/from16 v37, v21

    const/16 v21, 0x0

    move-object/from16 v38, v22

    const/16 v22, 0x0

    move-object/from16 v39, v23

    const/16 v23, 0x0

    move-object/from16 v40, v24

    const/16 v24, 0x0

    move-object/from16 v41, v26

    const/16 v26, 0x0

    move/from16 v42, v28

    const/16 v28, 0x0

    move-object/from16 v44, p2

    move-object/from16 p2, v1

    move-object/from16 p3, v2

    move-object/from16 v43, v5

    move/from16 v1, v32

    move-object/from16 v45, v36

    move-object/from16 v48, v39

    move-object/from16 v46, v41

    move/from16 v2, v42

    move-object v5, v4

    move/from16 v4, v33

    invoke-static/range {v5 .. v30}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v10, v27

    invoke-static {v2, v2, v3, v10, v4}, Lr80/c;->z(FFLb2/t;Lp1/q;Z)V

    goto :goto_9

    :cond_14
    move-object/from16 v44, p2

    move-object/from16 p2, v1

    move-object/from16 p3, v2

    move-object/from16 v43, v5

    move-object/from16 v34, v6

    move-object/from16 v45, v7

    move-object/from16 v37, v8

    move-object/from16 v38, v11

    move-object/from16 v48, v12

    move-object/from16 v40, v13

    move-object/from16 v46, v15

    const/16 v1, 0x100

    const/4 v4, 0x0

    const v2, 0x7c841fa7

    invoke-virtual {v10, v2}, Lp1/q;->e0(I)V

    invoke-virtual {v10, v4}, Lp1/q;->q(Z)V

    :goto_9
    invoke-virtual/range {p0 .. p0}, Lso1/c;->b()Ljava/util/List;

    move-result-object v5

    sget-object v2, Lx81/d;->a:Lx81/d;

    sget v6, Lx81/d;->b:I

    invoke-virtual {v2, v10, v6}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v2

    invoke-virtual {v2}, Ly81/i;->y()J

    move-result-wide v7

    invoke-static/range {v37 .. v37}, Lwo1/h0;->j(Lp1/c1;)Ljava/lang/String;

    move-result-object v6

    move-object/from16 v2, v37

    invoke-virtual {v10, v2}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v9

    and-int/lit16 v11, v0, 0x380

    if-ne v11, v1, :cond_15

    const/4 v14, 0x1

    goto :goto_a

    :cond_15
    move v14, v4

    :goto_a
    or-int/2addr v9, v14

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v12

    if-nez v9, :cond_17

    move-object/from16 v9, v48

    if-ne v12, v9, :cond_16

    goto :goto_b

    :cond_16
    move-object/from16 v14, v38

    goto :goto_c

    :cond_17
    move-object/from16 v9, v48

    :goto_b
    new-instance v12, Lp40/b;

    const/16 v13, 0x12

    move-object/from16 v14, v38

    invoke-direct {v12, v14, v2, v13}, Lp40/b;-><init>(Lkotlin/jvm/functions/Function1;Lp1/c1;I)V

    invoke-virtual {v10, v12}, Lp1/q;->p0(Ljava/lang/Object;)V

    :goto_c
    check-cast v12, Lkotlin/jvm/functions/Function1;

    move-object/from16 v38, v14

    const/4 v14, 0x0

    const/16 v15, 0x38

    move-object/from16 v48, v9

    const/4 v9, 0x0

    move-object/from16 v27, v10

    const/4 v10, 0x0

    move v2, v11

    const/4 v11, 0x0

    move/from16 v49, v2

    move-object/from16 v13, v27

    move-object/from16 v2, v38

    move-object/from16 v1, v48

    invoke-static/range {v5 .. v15}, Lm81/e;->m(Ljava/util/List;Ljava/lang/String;JLy3/f;Lm81/f;Lm81/f;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    move-object v10, v13

    const/4 v14, 0x4

    int-to-float v5, v14

    invoke-static {v5, v5, v3, v10}, Lih0/d0;->u(FFLb2/t;Lp1/q;)V

    const/16 v6, 0xa

    const/4 v7, 0x3

    const/4 v8, 0x0

    if-nez v31, :cond_18

    const v0, 0x7c8b3d81

    invoke-virtual {v10, v0}, Lp1/q;->e0(I)V

    invoke-virtual {v10, v4}, Lp1/q;->q(Z)V

    move-object/from16 v38, v2

    move-object v0, v3

    move v3, v5

    move v2, v6

    goto/16 :goto_1e

    :cond_18
    const v9, 0x7c8b3d82

    invoke-virtual {v10, v9}, Lp1/q;->e0(I)V

    sget-object v9, Ll0/m;->g:Ll0/h;

    sget-object v11, Lb2/e;->K:Lb2/l;

    const/16 v12, 0x36

    invoke-static {v9, v11, v10, v12}, Ll0/p1;->a(Ll0/i;Lb2/g;Landroidx/compose/runtime/Composer;I)Ll0/r1;

    move-result-object v9

    iget-wide v11, v10, Lp1/q;->T:J

    invoke-static {v11, v12}, Ljava/lang/Long;->hashCode(J)I

    move-result v11

    invoke-virtual {v10}, Lp1/q;->m()Lp1/p1;

    move-result-object v12

    invoke-static {v10, v3}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v13

    invoke-virtual {v10}, Lp1/q;->i0()V

    iget-boolean v14, v10, Lp1/q;->S:Z

    if-eqz v14, :cond_19

    move-object/from16 v14, v34

    invoke-virtual {v10, v14}, Lp1/q;->l(Lc93/a;)V

    :goto_d
    move-object/from16 v14, p3

    goto :goto_e

    :cond_19
    invoke-virtual {v10}, Lp1/q;->s0()V

    goto :goto_d

    :goto_e
    invoke-static {v10, v14, v9}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    move-object/from16 v9, v45

    invoke-static {v10, v9, v12}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v9, v10, Lp1/q;->S:Z

    if-nez v9, :cond_1a

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v9

    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v12

    invoke-static {v9, v12}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v9

    if-nez v9, :cond_1b

    :cond_1a
    move-object/from16 v9, v46

    goto :goto_10

    :cond_1b
    :goto_f
    move-object/from16 v9, p2

    goto :goto_11

    :goto_10
    invoke-static {v11, v10, v11, v9}, Ld;->y(ILp1/q;ILa3/i;)V

    goto :goto_f

    :goto_11
    invoke-static {v10, v9, v13}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const v9, 0x73bdd13

    invoke-virtual {v10, v9}, Lp1/q;->e0(I)V

    invoke-virtual/range {v31 .. v31}, Lso1/d0;->c()Ljava/util/List;

    move-result-object v9

    check-cast v9, Ljava/lang/Iterable;

    invoke-interface {v9}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v19

    :goto_12
    invoke-interface/range {v19 .. v19}, Ljava/util/Iterator;->hasNext()Z

    move-result v9

    if-eqz v9, :cond_1e

    invoke-interface/range {v19 .. v19}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v9

    check-cast v9, Lk71/d;

    move v11, v5

    invoke-virtual {v9}, Lk71/d;->b()Li91/a;

    move-result-object v5

    move v12, v6

    invoke-virtual {v9}, Lk71/d;->c()Lcom/whoop/design/util/TextResource;

    move-result-object v6

    move v13, v7

    invoke-virtual {v9}, Lk71/d;->e()Ln21/i;

    move-result-object v7

    move-object v14, v8

    invoke-virtual {v9}, Lk71/d;->a()Lgz0/m0;

    move-result-object v8

    invoke-virtual {v9}, Lk71/d;->d()Li91/a;

    move-result-object v9

    if-nez v9, :cond_1c

    const v9, -0x22de746

    invoke-virtual {v10, v9}, Lp1/q;->e0(I)V

    invoke-virtual {v10, v4}, Lp1/q;->q(Z)V

    move/from16 p3, v13

    move-object v9, v14

    goto :goto_13

    :cond_1c
    const v15, -0x4a6493d9

    invoke-virtual {v10, v15}, Lp1/q;->e0(I)V

    sget v15, Li91/a;->a:I

    move/from16 p3, v13

    invoke-static {v9, v10, v15}, Li91/c;->k(Li91/a;Landroidx/compose/runtime/Composer;I)J

    move-result-wide v12

    invoke-static {v10, v4, v12, v13}, Ldc/b;->h(Lp1/q;ZJ)Li2/x;

    move-result-object v9

    :goto_13
    if-nez v9, :cond_1d

    const v9, -0x4a649036

    invoke-virtual {v10, v9}, Lp1/q;->e0(I)V

    sget-object v9, Lx81/d;->a:Lx81/d;

    sget v12, Lx81/d;->b:I

    invoke-static {v9, v10, v12, v4}, Lr80/c;->D(Lx81/d;Lp1/q;IZ)J

    move-result-wide v12

    goto :goto_14

    :cond_1d
    const v12, -0x4a6496a1

    invoke-virtual {v10, v12}, Lp1/q;->e0(I)V

    invoke-virtual {v10, v4}, Lp1/q;->q(Z)V

    iget-wide v12, v9, Li2/x;->a:J

    :goto_14
    sget v9, Li91/a;->a:I

    sget v15, Lcom/whoop/design/util/TextResource;->$stable:I

    shl-int/lit8 v15, v15, 0x3

    or-int v17, v9, v15

    const/16 v18, 0x2f0

    const/4 v9, 0x0

    move-object/from16 v27, v10

    const/4 v10, 0x0

    move v15, v11

    const/4 v11, 0x0

    move-object/from16 v16, v14

    move-wide v13, v12

    const/4 v12, 0x0

    move/from16 v20, v15

    const/4 v15, 0x0

    move/from16 v50, v20

    move-object/from16 v16, v27

    invoke-static/range {v5 .. v18}, Ln21/h;->u(Li91/a;Lcom/whoop/design/util/TextResource;Ln21/i;Lgz0/m0;Li91/a;Lcom/whoop/design/util/TextResource;Ln21/i;Lgz0/m0;JLandroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V

    move-object/from16 v10, v16

    move/from16 v5, v50

    const/16 v6, 0xa

    const/4 v7, 0x3

    const/4 v8, 0x0

    goto/16 :goto_12

    :cond_1e
    move/from16 v50, v5

    invoke-virtual {v10, v4}, Lp1/q;->q(Z)V

    const/high16 v13, 0x3f800000    # 1.0f

    float-to-double v5, v13

    const-wide/16 v7, 0x0

    cmpl-double v5, v5, v7

    if-lez v5, :cond_1f

    goto :goto_15

    :cond_1f
    const-string v5, "invalid weight; must be greater than zero"

    invoke-static {v5}, Lm0/a;->a(Ljava/lang/String;)V

    :goto_15
    new-instance v5, Landroidx/compose/foundation/layout/LayoutWeightElement;

    const/4 v9, 0x1

    invoke-direct {v5, v13, v9}, Landroidx/compose/foundation/layout/LayoutWeightElement;-><init>(FZ)V

    invoke-static {v10, v5}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    invoke-virtual/range {v31 .. v31}, Lso1/d0;->b()Lcom/whoop/navigation/e;

    move-result-object v5

    if-nez v5, :cond_20

    const v0, -0x1fb7b458

    invoke-virtual {v10, v0}, Lp1/q;->e0(I)V

    invoke-virtual {v10, v4}, Lp1/q;->q(Z)V

    move-object/from16 v0, v43

    :goto_16
    const/4 v9, 0x1

    goto/16 :goto_1b

    :cond_20
    const v6, -0x1fb7b457

    invoke-virtual {v10, v6}, Lp1/q;->e0(I)V

    const-string v6, "MciGraphEducationTag"

    invoke-static {v3, v6}, Landroidx/compose/ui/platform/a;->a(Landroidx/compose/ui/Modifier;Ljava/lang/String;)Landroidx/compose/ui/Modifier;

    move-result-object v7

    sget-object v15, Lny0/q$d;->f:Lny0/q$d;

    sget-object v6, Lx81/d;->a:Lx81/d;

    invoke-virtual {v6}, Lx81/d;->d()Lgz0/o0;

    move-result-object v6

    invoke-virtual {v6}, Lgz0/o0;->o()Lgz0/i0;

    move-result-object v6

    invoke-virtual {v6}, Lgz0/i0;->w()I

    move-result v16

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v6

    if-ne v6, v1, :cond_21

    sget-object v6, Lwo1/h0$a;->w:Lwo1/h0$a;

    invoke-virtual {v10, v6}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_21
    check-cast v6, Lkotlin/jvm/functions/Function1;

    invoke-static {v6}, Ly81/g;->a(Lkotlin/jvm/functions/Function1;)Ly81/e;

    move-result-object v17

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v6

    if-ne v6, v1, :cond_22

    sget-object v6, Lwo1/h0$b;->w:Lwo1/h0$b;

    invoke-virtual {v10, v6}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_22
    check-cast v6, Lkotlin/jvm/functions/Function1;

    invoke-static {v6}, Ly81/g;->a(Lkotlin/jvm/functions/Function1;)Ly81/e;

    move-result-object v18

    new-instance v14, Lny0/o;

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x3f0

    const/16 v26, 0x0

    invoke-direct/range {v14 .. v26}, Lny0/o;-><init>(Lny0/q;ILy81/e;Ly81/e;Ly81/e;ZZZFZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sget v6, Lxn1/c;->l:I

    invoke-static {v10, v6}, Lq83/g;->Y(Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v6

    move/from16 v8, v49

    const/16 v9, 0x100

    if-ne v8, v9, :cond_23

    const/4 v8, 0x1

    goto :goto_17

    :cond_23
    move v8, v4

    :goto_17
    and-int/lit8 v0, v0, 0x70

    const/16 v9, 0x20

    if-ne v0, v9, :cond_24

    const/4 v0, 0x1

    goto :goto_18

    :cond_24
    move v0, v4

    :goto_18
    or-int/2addr v0, v8

    invoke-virtual {v10, v5}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v8

    or-int/2addr v0, v8

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v8

    if-nez v0, :cond_26

    if-ne v8, v1, :cond_25

    goto :goto_19

    :cond_25
    move-object/from16 v0, v43

    goto :goto_1a

    :cond_26
    :goto_19
    new-instance v8, Lwo1/g0;

    move-object/from16 v0, v43

    invoke-direct {v8, v2, v0, v5}, Lwo1/g0;-><init>(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lcom/whoop/navigation/e;)V

    invoke-virtual {v10, v8}, Lp1/q;->p0(Ljava/lang/Object;)V

    :goto_1a
    move-object v9, v8

    check-cast v9, Lc93/a;

    sget v5, Lny0/o;->k:I

    or-int/lit16 v11, v5, 0x180

    const/16 v12, 0x8

    const/4 v8, 0x0

    move-object v5, v14

    invoke-static/range {v5 .. v12}, Lny0/b1;->d(Lny0/o;Ljava/lang/String;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/Modifier;Lc93/a;Landroidx/compose/runtime/Composer;II)V

    invoke-virtual {v10, v4}, Lp1/q;->q(Z)V

    goto/16 :goto_16

    :goto_1b
    invoke-virtual {v10, v9}, Lp1/q;->q(Z)V

    invoke-virtual/range {v31 .. v31}, Lso1/d0;->a()Lj71/c;

    move-result-object v6

    if-nez v6, :cond_27

    const v5, 0x390d6856

    invoke-virtual {v10, v5}, Lp1/q;->e0(I)V

    invoke-virtual {v10, v4}, Lp1/q;->q(Z)V

    move-object/from16 v43, v0

    move-object/from16 v38, v2

    move-object v0, v3

    move/from16 v3, v50

    const/16 v2, 0xa

    goto/16 :goto_1d

    :cond_27
    const v5, 0x390d6857

    invoke-virtual {v10, v5}, Lp1/q;->e0(I)V

    const/4 v5, 0x7

    int-to-float v5, v5

    move/from16 v15, v50

    invoke-static {v5, v15, v3, v10}, Lih0/d0;->u(FFLb2/t;Lp1/q;)V

    const/16 v5, 0x3c

    int-to-float v5, v5

    mul-float/2addr v5, v15

    invoke-static {v5, v3}, Landroidx/compose/foundation/layout/d;->h(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v16

    const/4 v5, 0x2

    int-to-float v7, v5

    const/16 v5, 0x8

    int-to-float v8, v5

    mul-float v19, v7, v8

    const/16 v20, 0x0

    const/16 v21, 0xb

    const/16 v17, 0x0

    const/16 v18, 0x0

    invoke-static/range {v16 .. v21}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v7

    invoke-static {v13, v7}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v7

    sget v8, Lj71/c;->e:I

    const/4 v13, 0x3

    shl-int/2addr v8, v13

    or-int/lit8 v8, v8, 0x6

    const/16 v14, 0x7c

    move/from16 v47, v5

    move-object v5, v7

    const/4 v7, 0x0

    move/from16 v51, v13

    move v13, v8

    const/4 v8, 0x0

    const/4 v9, 0x0

    move-object/from16 v27, v10

    const/4 v10, 0x0

    const/4 v11, 0x0

    move-object/from16 v12, v27

    invoke-static/range {v5 .. v14}, Lb61/k;->p(Landroidx/compose/ui/Modifier;Lj71/c;Lj71/c;Lj71/c;ZLb61/l;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    move-object v10, v12

    move-object/from16 v6, v44

    if-nez v6, :cond_28

    const v5, -0xdcc0831

    invoke-virtual {v10, v5}, Lp1/q;->e0(I)V

    invoke-virtual {v10, v4}, Lp1/q;->q(Z)V

    move-object/from16 v43, v0

    move-object/from16 v38, v2

    move-object v0, v3

    move v3, v15

    const/16 v2, 0xa

    goto/16 :goto_1c

    :cond_28
    const v5, -0xdcc0830

    invoke-virtual {v10, v5}, Lp1/q;->e0(I)V

    sget-object v5, Lb3/v1;->h:Lp1/u2;

    invoke-virtual {v10, v5}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ly3/c;

    invoke-interface {v5}, Ly3/c;->m0()F

    move-result v5

    const/4 v7, -0x4

    int-to-float v7, v7

    mul-float/2addr v7, v5

    const/16 v5, 0xa

    int-to-float v8, v5

    mul-float v19, v8, v15

    const/16 v22, 0x0

    const/16 v23, 0xe

    const/16 v20, 0x0

    const/16 v21, 0x0

    move-object/from16 v18, v3

    invoke-static/range {v18 .. v23}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v3

    mul-float/2addr v7, v15

    const/4 v8, 0x0

    const/4 v9, 0x1

    invoke-static {v3, v8, v7, v9}, Landroidx/compose/foundation/layout/a;->n(Landroidx/compose/ui/Modifier;FFI)Landroidx/compose/ui/Modifier;

    move-result-object v3

    sget v7, Lcom/whoop/design/util/TextResource;->$stable:I

    invoke-static {v6, v10, v7}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v6

    sget-object v7, Lx81/d;->a:Lx81/d;

    sget v8, Lx81/d;->b:I

    invoke-virtual {v7, v10, v8}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v9

    invoke-virtual {v9}, Lb91/d;->s()Lb91/a;

    move-result-object v25

    invoke-virtual {v7, v10, v8}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v7

    invoke-virtual {v7}, Ly81/i;->b1()J

    move-result-wide v7

    sget v9, Lb91/a;->d:I

    shl-int/lit8 v29, v9, 0x12

    const v30, 0x2fff8

    move-object/from16 v27, v10

    const-wide/16 v9, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    move/from16 v20, v15

    const-wide/16 v14, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    move-object/from16 v21, v18

    const-wide/16 v18, 0x0

    move/from16 v50, v20

    const/16 v20, 0x0

    move-object/from16 v22, v21

    const/16 v21, 0x0

    move-object/from16 v23, v22

    const/16 v22, 0x0

    move-object/from16 v24, v23

    const/16 v23, 0x0

    move-object/from16 v26, v24

    const/16 v24, 0x0

    move-object/from16 v28, v26

    const/16 v26, 0x0

    move-object/from16 v31, v28

    const/16 v28, 0x0

    move-object/from16 v43, v0

    move-object/from16 v38, v2

    move v2, v5

    move-object v5, v6

    move-object/from16 v0, v31

    move-object v6, v3

    move/from16 v3, v50

    invoke-static/range {v5 .. v30}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v10, v27

    invoke-virtual {v10, v4}, Lp1/q;->q(Z)V

    :goto_1c
    invoke-virtual {v10, v4}, Lp1/q;->q(Z)V

    :goto_1d
    invoke-virtual {v10, v4}, Lp1/q;->q(Z)V

    :goto_1e
    invoke-virtual/range {p0 .. p0}, Lso1/c;->k()Ljava/util/List;

    move-result-object v5

    if-nez v5, :cond_29

    const v1, 0x7cb2adb2

    invoke-virtual {v10, v1}, Lp1/q;->e0(I)V

    invoke-virtual {v10, v4}, Lp1/q;->q(Z)V

    :goto_1f
    const/4 v13, 0x3

    goto/16 :goto_24

    :cond_29
    const v6, 0x7cb2adb3

    invoke-virtual {v10, v6}, Lp1/q;->e0(I)V

    move-object v6, v5

    check-cast v6, Ljava/lang/Iterable;

    new-instance v7, Ljava/util/ArrayList;

    invoke-static {v6, v2}, Lm83/u;->i0(Ljava/lang/Iterable;I)I

    move-result v2

    invoke-direct {v7, v2}, Ljava/util/ArrayList;-><init>(I)V

    invoke-interface {v6}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_20
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_2a

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lnp1/k;

    new-instance v8, Lsz0/u0;

    invoke-virtual {v6}, Lnp1/k;->b()Ljava/lang/String;

    move-result-object v6

    const/4 v9, 0x2

    const/4 v14, 0x0

    invoke-direct {v8, v6, v14, v9, v14}, Lsz0/u0;-><init>(Ljava/lang/String;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {v7, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z

    goto :goto_20

    :cond_2a
    invoke-interface {v5}, Ljava/util/List;->iterator()Ljava/util/Iterator;

    move-result-object v2

    move v15, v4

    :goto_21
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    if-eqz v6, :cond_2c

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lnp1/k;

    invoke-virtual {v6}, Lnp1/k;->a()Ljava/lang/String;

    move-result-object v6

    invoke-static/range {v40 .. v40}, Lwo1/h0;->l(Lp1/c1;)Ljava/lang/String;

    move-result-object v8

    invoke-static {v6, v8}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_2b

    :goto_22
    move v6, v15

    move-object/from16 v13, v40

    goto :goto_23

    :cond_2b
    add-int/lit8 v15, v15, 0x1

    goto :goto_21

    :cond_2c
    const/4 v15, -0x1

    goto :goto_22

    :goto_23
    invoke-virtual {v10, v13}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v2

    invoke-virtual {v10, v5}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v8

    or-int/2addr v2, v8

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v8

    if-nez v2, :cond_2d

    if-ne v8, v1, :cond_2e

    :cond_2d
    new-instance v8, Lum0/b;

    const/16 v1, 0x1b

    invoke-direct {v8, v1, v5, v13}, Lum0/b;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v10, v8}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_2e
    move-object v9, v8

    check-cast v9, Lkotlin/jvm/functions/Function1;

    const/4 v11, 0x0

    const/16 v12, 0xc

    move-object v5, v7

    const/4 v7, 0x0

    const/4 v8, 0x0

    invoke-static/range {v5 .. v12}, Lsz0/x0;->e(Ljava/util/List;ILandroidx/compose/ui/Modifier;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    invoke-virtual {v10, v4}, Lp1/q;->q(Z)V

    goto/16 :goto_1f

    :goto_24
    int-to-float v1, v13

    mul-float/2addr v1, v3

    invoke-static {v1, v0}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    invoke-static {v10, v1}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    invoke-virtual/range {p0 .. p0}, Lso1/c;->e()Lcom/whoop/design/util/TextResource;

    move-result-object v1

    sget v2, Lcom/whoop/design/util/TextResource;->$stable:I

    invoke-static {v1, v10, v2}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v5

    sget-object v1, Lx81/d;->a:Lx81/d;

    sget v2, Lx81/d;->b:I

    invoke-virtual {v1, v10, v2}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v4

    invoke-virtual {v4}, Lb91/d;->a()Lb91/a;

    move-result-object v25

    invoke-virtual {v1, v10, v2}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v1

    invoke-virtual {v1}, Ly81/i;->c1()J

    move-result-wide v7

    sget v1, Lb91/a;->d:I

    shl-int/lit8 v29, v1, 0x12

    const v30, 0x2fffa

    const/4 v6, 0x0

    move-object/from16 v27, v10

    const-wide/16 v9, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const-wide/16 v14, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const-wide/16 v18, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v26, 0x0

    const/16 v28, 0x0

    invoke-static/range {v5 .. v30}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v10, v27

    const/16 v5, 0x8

    int-to-float v1, v5

    const/4 v9, 0x1

    invoke-static {v1, v3, v0, v10, v9}, Lr80/c;->z(FFLb2/t;Lp1/q;Z)V

    move-object/from16 v3, v38

    move-object/from16 v2, v43

    goto :goto_25

    :cond_2f
    invoke-virtual {v10}, Lp1/q;->X()V

    move-object v2, v7

    move-object v3, v11

    :goto_25
    invoke-virtual {v10}, Lp1/q;->u()Lp1/v1;

    move-result-object v7

    if-eqz v7, :cond_30

    new-instance v0, Lv31/d;

    const/16 v6, 0x1b

    move-object/from16 v1, p0

    move/from16 v4, p4

    move/from16 v5, p5

    invoke-direct/range {v0 .. v6}, Lv31/d;-><init>(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Ll83/e;III)V

    iput-object v0, v7, Lp1/v1;->d:Lc93/m;

    :cond_30
    return-void
.end method

.method private static final h(Lro1/g;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final i(Lyn1/a;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final j(Lp1/c1;)Ljava/lang/String;
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

.method private static final k(Lp1/c1;Ljava/lang/String;)V
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

.method private static final n(Lkotlin/jvm/functions/Function1;Lp1/c1;Ljava/lang/String;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {p1, p2}, Lwo1/h0;->k(Lp1/c1;Ljava/lang/String;)V

    sget-object p1, Lyn1/a$v;->a:Lyn1/a$v;

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final o(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lcom/whoop/navigation/e;)Ll83/a0;
    .locals 1

    sget-object v0, Lyn1/a$d0;->a:Lyn1/a$d0;

    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    new-instance p0, Lro1/g$e;

    invoke-direct {p0, p2}, Lro1/g$e;-><init>(Lcom/whoop/navigation/e;)V

    invoke-interface {p1, p0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final p(Ljava/util/List;Lp1/c1;I)Ll83/a0;
    .locals 0

    invoke-interface {p0, p2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lnp1/k;

    invoke-virtual {p0}, Lnp1/k;->a()Ljava/lang/String;

    move-result-object p0

    invoke-static {p1, p0}, Lwo1/h0;->m(Lp1/c1;Ljava/lang/String;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final q(Lso1/c;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 6

    or-int/lit8 p3, p3, 0x1

    invoke-static {p3}, Lp1/x;->L(I)I

    move-result v4

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move v5, p4

    move-object v3, p5

    invoke-static/range {v0 .. v5}, Lwo1/h0;->g(Lso1/c;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final r(Lso1/c;Ljava/lang/String;Ljava/lang/String;)Lso1/d0;
    .locals 1

    const-string v0, "CURRENT_CYCLE"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p0}, Lso1/c;->c()Ljava/util/Map;

    move-result-object p0

    invoke-interface {p0, p2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lso1/d0;

    return-object p0

    :cond_0
    const-string v0, "LAST_SIX_CYCLE"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_1

    invoke-virtual {p0}, Lso1/c;->h()Ljava/util/Map;

    move-result-object p0

    invoke-interface {p0, p2}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lso1/d0;

    return-object p0

    :cond_1
    const/4 p0, 0x0

    return-object p0
.end method
