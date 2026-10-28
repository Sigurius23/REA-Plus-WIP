.class public abstract Lzc1/u4;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u001a\u000f\u0010\u0001\u001a\u00020\u0000H\u0007\u00a2\u0006\u0004\u0008\u0001\u0010\u0002\u00a8\u0006\u0003"
    }
    d2 = {
        "Ll83/a0;",
        "h",
        "(Landroidx/compose/runtime/Composer;I)V",
        "design-showcase_release"
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
.method public static synthetic a(Lp1/c1;Z)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lzc1/u4;->k(Lp1/c1;Z)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lp1/c1;Z)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lzc1/u4;->i(Lp1/c1;Z)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, Lzc1/u4;->o(ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Lp1/c1;Z)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lzc1/u4;->j(Lp1/c1;Z)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic e(Lp1/c1;F)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lzc1/u4;->m(Lp1/c1;F)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic f(Lp1/c1;F)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lzc1/u4;->n(Lp1/c1;F)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic g(Lp1/c1;Z)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lzc1/u4;->l(Lp1/c1;Z)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final h(Landroidx/compose/runtime/Composer;I)V
    .locals 64

    move-object/from16 v14, p0

    check-cast v14, Lp1/q;

    const v1, -0x2a16cec4

    invoke-virtual {v14, v1}, Lp1/q;->g0(I)Lp1/q;

    if-eqz p1, :cond_0

    const/4 v3, 0x1

    goto :goto_0

    :cond_0
    const/4 v3, 0x0

    :goto_0
    and-int/lit8 v4, p1, 0x1

    invoke-virtual {v14, v4, v3}, Lp1/q;->U(IZ)Z

    move-result v3

    if-eqz v3, :cond_19

    const/4 v3, 0x2

    int-to-float v3, v3

    const/16 v4, 0x8

    int-to-float v4, v4

    mul-float/2addr v3, v4

    sget-object v4, Lb2/t;->w:Lb2/t;

    invoke-static {v3, v4}, Landroidx/compose/foundation/layout/a;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    const/high16 v5, 0x3f800000    # 1.0f

    invoke-static {v5, v3}, Landroidx/compose/foundation/layout/d;->d(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    sget-object v5, Lb2/e;->N:Lb2/k;

    const/4 v6, 0x4

    int-to-float v6, v6

    const/16 v7, 0x36

    invoke-static {v6, v6, v5, v14, v7}, Lm4/a;->n(FFLb2/k;Lp1/q;I)Ll0/x;

    move-result-object v5

    iget-wide v6, v14, Lp1/q;->T:J

    invoke-static {v6, v7}, Ljava/lang/Long;->hashCode(J)I

    move-result v6

    invoke-virtual {v14}, Lp1/q;->m()Lp1/p1;

    move-result-object v7

    invoke-static {v14, v3}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    sget-object v8, La3/l;->a:La3/k;

    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v8, La3/k;->b:La3/j;

    invoke-virtual {v14}, Lp1/q;->i0()V

    iget-boolean v9, v14, Lp1/q;->S:Z

    if-eqz v9, :cond_1

    invoke-virtual {v14, v8}, Lp1/q;->l(Lc93/a;)V

    goto :goto_1

    :cond_1
    invoke-virtual {v14}, Lp1/q;->s0()V

    :goto_1
    sget-object v9, La3/k;->g:La3/i;

    invoke-static {v14, v9, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v5, La3/k;->f:La3/i;

    invoke-static {v14, v5, v7}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v7, La3/k;->j:La3/i;

    iget-boolean v10, v14, Lp1/q;->S:Z

    if-nez v10, :cond_2

    invoke-virtual {v14}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v10

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v11

    invoke-static {v10, v11}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v10

    if-nez v10, :cond_3

    :cond_2
    invoke-static {v6, v14, v6, v7}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_3
    sget-object v6, La3/k;->d:La3/i;

    invoke-static {v14, v6, v3}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual {v14}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    sget-object v10, Lp1/l;->a:Lp1/v0;

    if-ne v3, v10, :cond_4

    sget-object v3, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-static {v3}, Lp1/x;->z(Ljava/lang/Object;)Lp1/k1;

    move-result-object v3

    invoke-virtual {v14, v3}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_4
    check-cast v3, Lp1/c1;

    invoke-virtual {v14}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v11

    if-ne v11, v10, :cond_5

    sget-object v11, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-static {v11}, Lp1/x;->z(Ljava/lang/Object;)Lp1/k1;

    move-result-object v11

    invoke-virtual {v14, v11}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_5
    check-cast v11, Lp1/c1;

    invoke-virtual {v14}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v12

    if-ne v12, v10, :cond_6

    sget-object v12, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-static {v12}, Lp1/x;->z(Ljava/lang/Object;)Lp1/k1;

    move-result-object v12

    invoke-virtual {v14, v12}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_6
    check-cast v12, Lp1/c1;

    invoke-virtual {v14}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v13

    if-ne v13, v10, :cond_7

    sget-object v13, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-static {v13}, Lp1/x;->z(Ljava/lang/Object;)Lp1/k1;

    move-result-object v13

    invoke-virtual {v14, v13}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_7
    check-cast v13, Lp1/c1;

    invoke-virtual {v14}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v15

    if-ne v15, v10, :cond_8

    const/high16 v15, 0x43570000    # 215.0f

    invoke-static {v15, v14}, Lc13/a;->o(FLp1/q;)Lp1/k1;

    move-result-object v15

    :cond_8
    check-cast v15, Lp1/c1;

    invoke-virtual {v14}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v10, :cond_9

    const v2, 0x43a78000    # 335.0f

    invoke-static {v2, v14}, Lc13/a;->o(FLp1/q;)Lp1/k1;

    move-result-object v2

    :cond_9
    check-cast v2, Lp1/c1;

    const-string v1, "Variants"

    move-object/from16 v17, v11

    const/4 v11, 0x6

    invoke-static {v1, v14, v11}, Lkd1/k;->c(Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V

    sget-object v1, Ll0/m;->a:Ll0/e;

    sget-object v11, Lb2/e;->J:Lb2/l;

    move-object/from16 v19, v2

    move-object/from16 v16, v12

    const/4 v2, 0x0

    invoke-static {v1, v11, v14, v2}, Ll0/p1;->a(Ll0/i;Lb2/g;Landroidx/compose/runtime/Composer;I)Ll0/r1;

    move-result-object v12

    move-object/from16 v20, v3

    iget-wide v2, v14, Lp1/q;->T:J

    invoke-static {v2, v3}, Ljava/lang/Long;->hashCode(J)I

    move-result v2

    invoke-virtual {v14}, Lp1/q;->m()Lp1/p1;

    move-result-object v3

    move-object/from16 v22, v1

    invoke-static {v14, v4}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    invoke-virtual {v14}, Lp1/q;->i0()V

    move-object/from16 v23, v4

    iget-boolean v4, v14, Lp1/q;->S:Z

    if-eqz v4, :cond_a

    invoke-virtual {v14, v8}, Lp1/q;->l(Lc93/a;)V

    goto :goto_2

    :cond_a
    invoke-virtual {v14}, Lp1/q;->s0()V

    :goto_2
    invoke-static {v14, v9, v12}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v14, v5, v3}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v3, v14, Lp1/q;->S:Z

    if-nez v3, :cond_b

    invoke-virtual {v14}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-static {v3, v4}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_c

    :cond_b
    invoke-static {v2, v14, v2, v7}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_c
    invoke-static {v14, v6, v1}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const-string v24, "MEDIA TITLE"

    invoke-static/range {v24 .. v24}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v1

    new-instance v2, Lsy0/k$g;

    const/4 v3, 0x0

    const/4 v4, 0x3

    invoke-direct {v2, v3, v3, v4, v3}, Lsy0/k$g;-><init>(Lb91/a;Lb2/g;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface/range {v20 .. v20}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object v12

    check-cast v12, Ljava/lang/Boolean;

    invoke-virtual {v12}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v12

    invoke-virtual {v14}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    if-ne v3, v10, :cond_d

    new-instance v3, Lzc1/n0;

    move/from16 v26, v4

    const/16 v4, 0x11

    move-object/from16 v27, v1

    move-object/from16 v1, v20

    invoke-direct {v3, v4, v1}, Lzc1/n0;-><init>(ILp1/c1;)V

    invoke-virtual {v14, v3}, Lp1/q;->p0(Ljava/lang/Object;)V

    goto :goto_3

    :cond_d
    move-object/from16 v27, v1

    move/from16 v26, v4

    move-object/from16 v1, v20

    :goto_3
    check-cast v3, Lkotlin/jvm/functions/Function1;

    sget v4, Lcom/whoop/design/util/TextResource;->$stable:I

    or-int/lit16 v4, v4, 0xc00

    sget v20, Lsy0/k$g;->d:I

    shl-int/lit8 v20, v20, 0x3

    or-int v4, v4, v20

    move-object/from16 v20, v16

    const/16 v16, 0x6

    move-object/from16 v28, v17

    const/16 v17, 0x3f0

    move-object/from16 v29, v15

    move v15, v4

    const/4 v4, 0x1

    move-object/from16 v30, v5

    const/4 v5, 0x0

    move-object/from16 v32, v6

    move-object/from16 v31, v7

    const-wide/16 v6, 0x0

    move-object/from16 v33, v8

    const/4 v8, 0x0

    move-object/from16 v34, v9

    const/4 v9, 0x0

    move-object/from16 v35, v10

    const/4 v10, 0x0

    move-object/from16 v36, v11

    move-object/from16 v37, v13

    move-object v13, v3

    move v3, v12

    const-wide/16 v11, 0x0

    move-object/from16 p0, v20

    move-object/from16 v43, v22

    move-object/from16 v47, v23

    move-object/from16 v40, v30

    move-object/from16 v41, v31

    move-object/from16 v42, v32

    move-object/from16 v38, v33

    move-object/from16 v39, v34

    move-object/from16 v48, v35

    move-object/from16 v44, v36

    const/4 v0, 0x0

    move-object/from16 v20, v1

    move-object/from16 v1, v27

    invoke-static/range {v1 .. v17}, Lsy0/j;->f(Lcom/whoop/design/util/TextResource;Lsy0/k;ZZIJLandroidx/compose/ui/Modifier;Ll0/k1;ZJLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;III)V

    const-string v18, "MEDIA SUBTITLE"

    invoke-static/range {v18 .. v18}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v1

    new-instance v2, Lsy0/k$g;

    const/4 v3, 0x3

    invoke-direct {v2, v0, v0, v3, v0}, Lsy0/k$g;-><init>(Lb91/a;Lb2/g;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface/range {v28 .. v28}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/Boolean;

    invoke-virtual {v4}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v4

    invoke-virtual {v14}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    move-object/from16 v6, v48

    if-ne v5, v6, :cond_e

    new-instance v5, Lzc1/n0;

    const/16 v7, 0x12

    move-object/from16 v8, v28

    invoke-direct {v5, v7, v8}, Lzc1/n0;-><init>(ILp1/c1;)V

    invoke-virtual {v14, v5}, Lp1/q;->p0(Ljava/lang/Object;)V

    goto :goto_4

    :cond_e
    move-object/from16 v8, v28

    :goto_4
    move-object v13, v5

    check-cast v13, Lkotlin/jvm/functions/Function1;

    const/16 v16, 0x6

    const/16 v17, 0x3f0

    move/from16 v46, v3

    move v3, v4

    const/4 v4, 0x1

    const/4 v5, 0x0

    move-object/from16 v48, v6

    const-wide/16 v6, 0x0

    move-object/from16 v28, v8

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const-wide/16 v11, 0x0

    move-object/from16 v49, v48

    invoke-static/range {v1 .. v17}, Lsy0/j;->f(Lcom/whoop/design/util/TextResource;Lsy0/k;ZZIJLandroidx/compose/ui/Modifier;Ll0/k1;ZJLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;III)V

    const/4 v1, 0x1

    invoke-virtual {v14, v1}, Lp1/q;->q(Z)V

    move-object/from16 v2, v43

    move-object/from16 v3, v44

    const/4 v4, 0x0

    invoke-static {v2, v3, v14, v4}, Ll0/p1;->a(Ll0/i;Lb2/g;Landroidx/compose/runtime/Composer;I)Ll0/r1;

    move-result-object v2

    iget-wide v3, v14, Lp1/q;->T:J

    invoke-static {v3, v4}, Ljava/lang/Long;->hashCode(J)I

    move-result v3

    invoke-virtual {v14}, Lp1/q;->m()Lp1/p1;

    move-result-object v4

    move-object/from16 v5, v47

    invoke-static {v14, v5}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v5

    invoke-virtual {v14}, Lp1/q;->i0()V

    iget-boolean v6, v14, Lp1/q;->S:Z

    if-eqz v6, :cond_f

    move-object/from16 v6, v38

    invoke-virtual {v14, v6}, Lp1/q;->l(Lc93/a;)V

    :goto_5
    move-object/from16 v6, v39

    goto :goto_6

    :cond_f
    invoke-virtual {v14}, Lp1/q;->s0()V

    goto :goto_5

    :goto_6
    invoke-static {v14, v6, v2}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    move-object/from16 v2, v40

    invoke-static {v14, v2, v4}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v2, v14, Lp1/q;->S:Z

    if-nez v2, :cond_10

    invoke-virtual {v14}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-static {v2, v4}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_11

    :cond_10
    move-object/from16 v2, v41

    goto :goto_8

    :cond_11
    :goto_7
    move-object/from16 v2, v42

    goto :goto_9

    :goto_8
    invoke-static {v3, v14, v3, v2}, Ld;->y(ILp1/q;ILa3/i;)V

    goto :goto_7

    :goto_9
    invoke-static {v14, v2, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const-string v21, "TAG LABEL"

    move/from16 v45, v1

    invoke-static/range {v21 .. v21}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v1

    new-instance v2, Lsy0/k$g;

    const/4 v3, 0x3

    invoke-direct {v2, v0, v0, v3, v0}, Lsy0/k$g;-><init>(Lb91/a;Lb2/g;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface/range {p0 .. p0}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/Boolean;

    invoke-virtual {v4}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v4

    invoke-virtual {v14}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    move-object/from16 v6, v49

    if-ne v5, v6, :cond_12

    new-instance v5, Lzc1/n0;

    const/16 v7, 0x13

    move-object/from16 v8, p0

    invoke-direct {v5, v7, v8}, Lzc1/n0;-><init>(ILp1/c1;)V

    invoke-virtual {v14, v5}, Lp1/q;->p0(Ljava/lang/Object;)V

    goto :goto_a

    :cond_12
    move-object/from16 v8, p0

    :goto_a
    move-object v13, v5

    check-cast v13, Lkotlin/jvm/functions/Function1;

    const/16 v16, 0x6

    const/16 v17, 0x3f0

    move/from16 v46, v3

    move v3, v4

    const/4 v4, 0x1

    const/4 v5, 0x0

    move-object/from16 v48, v6

    const-wide/16 v6, 0x0

    move-object v12, v8

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    move-object/from16 v22, v12

    const-wide/16 v11, 0x0

    move-object/from16 v50, v48

    invoke-static/range {v1 .. v17}, Lsy0/j;->f(Lcom/whoop/design/util/TextResource;Lsy0/k;ZZIJLandroidx/compose/ui/Modifier;Ll0/k1;ZJLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;III)V

    const-string v1, "PLAY BUTTON"

    invoke-static {v1}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v1

    new-instance v2, Lsy0/k$g;

    const/4 v3, 0x3

    invoke-direct {v2, v0, v0, v3, v0}, Lsy0/k$g;-><init>(Lb91/a;Lb2/g;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface/range {v37 .. v37}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/Boolean;

    invoke-virtual {v4}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v4

    invoke-virtual {v14}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    move-object/from16 v6, v50

    if-ne v5, v6, :cond_13

    new-instance v5, Lzc1/n0;

    const/16 v7, 0x14

    move-object/from16 v8, v37

    invoke-direct {v5, v7, v8}, Lzc1/n0;-><init>(ILp1/c1;)V

    invoke-virtual {v14, v5}, Lp1/q;->p0(Ljava/lang/Object;)V

    goto :goto_b

    :cond_13
    move-object/from16 v8, v37

    :goto_b
    move-object v13, v5

    check-cast v13, Lkotlin/jvm/functions/Function1;

    const/16 v16, 0x6

    const/16 v17, 0x3f0

    move/from16 v46, v3

    move v3, v4

    const/4 v4, 0x1

    const/4 v5, 0x0

    move-object/from16 v48, v6

    const-wide/16 v6, 0x0

    move-object/from16 v37, v8

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const-wide/16 v11, 0x0

    move-object/from16 v51, v48

    invoke-static/range {v1 .. v17}, Lsy0/j;->f(Lcom/whoop/design/util/TextResource;Lsy0/k;ZZIJLandroidx/compose/ui/Modifier;Ll0/k1;ZJLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;III)V

    const/4 v11, 0x1

    invoke-virtual {v14, v11}, Lp1/q;->q(Z)V

    invoke-interface/range {v20 .. v20}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    if-eqz v1, :cond_14

    invoke-static/range {v24 .. v24}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v3

    move-object/from16 v57, v3

    goto :goto_c

    :cond_14
    move-object/from16 v57, v0

    :goto_c
    invoke-interface/range {v28 .. v28}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    if-eqz v1, :cond_15

    invoke-static/range {v18 .. v18}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v3

    move-object/from16 v58, v3

    goto :goto_d

    :cond_15
    move-object/from16 v58, v0

    :goto_d
    invoke-interface/range {v22 .. v22}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    if-eqz v1, :cond_16

    invoke-static/range {v21 .. v21}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v3

    move-object/from16 v59, v3

    goto :goto_e

    :cond_16
    move-object/from16 v59, v0

    :goto_e
    const-string v1, "Default"

    const/4 v12, 0x6

    invoke-static {v1, v14, v12}, Lkd1/k;->c(Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V

    new-instance v1, Lp21/f$c;

    const/4 v2, 0x0

    invoke-direct {v1, v2, v11, v0}, Lp21/f$c;-><init>(FILkotlin/jvm/internal/DefaultConstructorMarker;)V

    new-instance v3, Lkd1/o$c;

    const/16 v8, 0xe

    const/4 v9, 0x0

    const-string v4, "https://placekitten.com/1000/800"

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-direct/range {v3 .. v9}, Lkd1/o$c;-><init>(Ljava/lang/Object;IIIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const-string v13, "Exercise Name"

    invoke-static {v13}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v56

    invoke-interface/range {v37 .. v37}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Boolean;

    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v61

    new-instance v2, Lp21/g;

    const/16 v62, 0x81

    const/16 v63, 0x0

    const/16 v53, 0x0

    const/16 v60, 0x0

    move-object/from16 v54, v1

    move-object/from16 v52, v2

    move-object/from16 v55, v3

    invoke-direct/range {v52 .. v63}, Lp21/g;-><init>(Ljava/lang/Object;Lp21/f;Lkd1/o;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lhy0/o1;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sget v1, Lp21/g;->j:I

    shl-int/lit8 v5, v1, 0x3

    const/4 v6, 0x5

    const/4 v1, 0x0

    const/4 v3, 0x0

    move-object v4, v14

    invoke-static/range {v1 .. v6}, Lp21/e;->l(Landroidx/compose/ui/Modifier;Lp21/g;Lc93/a;Landroidx/compose/runtime/Composer;II)V

    const-string v1, "Onboarding Tag"

    invoke-static {v1, v14, v12}, Lkd1/k;->c(Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V

    new-instance v1, Lp21/f$a;

    invoke-interface/range {v29 .. v29}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Number;

    invoke-virtual {v2}, Ljava/lang/Number;->floatValue()F

    move-result v2

    float-to-int v2, v2

    int-to-float v2, v2

    invoke-interface/range {v19 .. v19}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Number;

    invoke-virtual {v3}, Ljava/lang/Number;->floatValue()F

    move-result v3

    float-to-int v3, v3

    int-to-float v3, v3

    invoke-direct {v1, v2, v3, v0}, Lp21/f$a;-><init>(FFLkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-static {v13}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v56

    new-instance v20, Lkd1/o$c;

    const/16 v25, 0xe

    const/16 v26, 0x0

    const-string v21, "https://placekitten.com/1000/800"

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    invoke-direct/range {v20 .. v26}, Lkd1/o$c;-><init>(Ljava/lang/Object;IIIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sget-object v60, Lhy0/o1;->ONBOARDING:Lhy0/o1;

    invoke-interface/range {v37 .. v37}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Boolean;

    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v61

    new-instance v2, Lp21/g;

    const/16 v62, 0x1

    move-object/from16 v54, v1

    move-object/from16 v52, v2

    move-object/from16 v55, v20

    invoke-direct/range {v52 .. v63}, Lp21/g;-><init>(Ljava/lang/Object;Lp21/f;Lkd1/o;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lhy0/o1;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/4 v3, 0x0

    const/4 v1, 0x0

    invoke-static/range {v1 .. v6}, Lp21/e;->l(Landroidx/compose/ui/Modifier;Lp21/g;Lc93/a;Landroidx/compose/runtime/Composer;II)V

    const-string v1, "Aspect Ratio"

    invoke-static {v1, v14, v12}, Lkd1/k;->c(Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V

    sget-object v54, Lp21/f$b;->a:Lp21/f$b;

    new-instance v20, Lkd1/o$c;

    const-string v21, "https://placekitten.com/1000/800"

    invoke-direct/range {v20 .. v26}, Lkd1/o$c;-><init>(Ljava/lang/Object;IIIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-static {v13}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v56

    invoke-interface/range {v37 .. v37}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v61

    new-instance v2, Lp21/g;

    const/16 v62, 0x81

    const/16 v60, 0x0

    move-object/from16 v52, v2

    move-object/from16 v55, v20

    invoke-direct/range {v52 .. v63}, Lp21/g;-><init>(Ljava/lang/Object;Lp21/f;Lkd1/o;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lhy0/o1;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/4 v1, 0x0

    invoke-static/range {v1 .. v6}, Lp21/e;->l(Landroidx/compose/ui/Modifier;Lp21/g;Lc93/a;Landroidx/compose/runtime/Composer;II)V

    move v15, v5

    const-string v1, "Adjust Height And Width"

    invoke-static {v1, v14, v12}, Lkd1/k;->c(Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V

    const-string v1, "Adjust Height"

    invoke-static {v1, v14, v12}, Lkd1/k;->c(Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V

    invoke-interface/range {v29 .. v29}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Number;

    invoke-virtual {v1}, Ljava/lang/Number;->floatValue()F

    move-result v3

    new-instance v4, Li93/e;

    const/high16 v1, 0x43160000    # 150.0f

    const/high16 v2, 0x43c80000    # 400.0f

    invoke-direct {v4, v1, v2}, Li93/e;-><init>(FF)V

    invoke-virtual {v14}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    move-object/from16 v2, v51

    if-ne v1, v2, :cond_17

    new-instance v1, Lzc1/n0;

    const/16 v5, 0x15

    move-object/from16 v6, v29

    invoke-direct {v1, v5, v6}, Lzc1/n0;-><init>(ILp1/c1;)V

    invoke-virtual {v14, v1}, Lp1/q;->p0(Ljava/lang/Object;)V

    goto :goto_f

    :cond_17
    move-object/from16 v6, v29

    :goto_f
    move-object v7, v1

    check-cast v7, Lkotlin/jvm/functions/Function1;

    const/high16 v9, 0x180000

    const/16 v10, 0x33

    const/4 v1, 0x0

    move-object/from16 v48, v2

    const/4 v2, 0x0

    const/4 v5, 0x0

    move-object/from16 v29, v6

    const/4 v6, 0x0

    move-object v8, v14

    move-object/from16 v14, v48

    invoke-static/range {v1 .. v10}, Lhy0/k2;->d(Landroidx/compose/ui/Modifier;ZFLi93/f;ILc93/a;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    move-object v4, v8

    const-string v1, "Adjust Width"

    invoke-static {v1, v4, v12}, Lkd1/k;->c(Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V

    invoke-interface/range {v19 .. v19}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Number;

    invoke-virtual {v1}, Ljava/lang/Number;->floatValue()F

    move-result v3

    new-instance v1, Li93/e;

    const/high16 v2, 0x43700000    # 240.0f

    const/high16 v5, 0x43fa0000    # 500.0f

    invoke-direct {v1, v2, v5}, Li93/e;-><init>(FF)V

    invoke-virtual {v4}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v14, :cond_18

    new-instance v2, Lzc1/n0;

    const/16 v5, 0x16

    move-object/from16 v12, v19

    invoke-direct {v2, v5, v12}, Lzc1/n0;-><init>(ILp1/c1;)V

    invoke-virtual {v4, v2}, Lp1/q;->p0(Ljava/lang/Object;)V

    goto :goto_10

    :cond_18
    move-object/from16 v12, v19

    :goto_10
    move-object v7, v2

    check-cast v7, Lkotlin/jvm/functions/Function1;

    const/high16 v9, 0x180000

    const/16 v10, 0x33

    move-object v14, v4

    move-object v4, v1

    const/4 v1, 0x0

    const/4 v2, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    move-object v8, v14

    invoke-static/range {v1 .. v10}, Lhy0/k2;->d(Landroidx/compose/ui/Modifier;ZFLi93/f;ILc93/a;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    new-instance v1, Lp21/f$a;

    invoke-interface/range {v29 .. v29}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Number;

    invoke-virtual {v2}, Ljava/lang/Number;->floatValue()F

    move-result v2

    float-to-int v2, v2

    int-to-float v2, v2

    invoke-interface {v12}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Number;

    invoke-virtual {v3}, Ljava/lang/Number;->floatValue()F

    move-result v3

    float-to-int v3, v3

    int-to-float v3, v3

    invoke-direct {v1, v2, v3, v0}, Lp21/f$a;-><init>(FFLkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-static {v13}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v56

    new-instance v2, Lkd1/o$c;

    const/16 v7, 0xe

    const/4 v8, 0x0

    const-string v3, "https://placekitten.com/1000/800"

    const/4 v4, 0x0

    const/4 v6, 0x0

    invoke-direct/range {v2 .. v8}, Lkd1/o$c;-><init>(Ljava/lang/Object;IIIILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface/range {v37 .. v37}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v61

    new-instance v52, Lp21/g;

    const/16 v62, 0x81

    const/16 v63, 0x0

    const/16 v53, 0x0

    const/16 v60, 0x0

    move-object/from16 v54, v1

    move-object/from16 v55, v2

    invoke-direct/range {v52 .. v63}, Lp21/g;-><init>(Ljava/lang/Object;Lp21/f;Lkd1/o;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lhy0/o1;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object/from16 v2, v52

    const/4 v3, 0x0

    const/4 v6, 0x5

    const/4 v1, 0x0

    move-object v4, v14

    move v5, v15

    invoke-static/range {v1 .. v6}, Lp21/e;->l(Landroidx/compose/ui/Modifier;Lp21/g;Lc93/a;Landroidx/compose/runtime/Composer;II)V

    invoke-virtual {v14, v11}, Lp1/q;->q(Z)V

    goto :goto_11

    :cond_19
    invoke-virtual {v14}, Lp1/q;->X()V

    :goto_11
    invoke-virtual {v14}, Lp1/q;->u()Lp1/v1;

    move-result-object v0

    if-eqz v0, :cond_1a

    new-instance v1, Lzc1/s3;

    const/16 v2, 0x18

    move/from16 v3, p1

    invoke-direct {v1, v3, v2}, Lzc1/s3;-><init>(II)V

    iput-object v1, v0, Lp1/v1;->d:Lc93/m;

    :cond_1a
    return-void
.end method

.method private static final i(Lp1/c1;Z)Ll83/a0;
    .locals 0

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    invoke-interface {p0, p1}, Lp1/c1;->setValue(Ljava/lang/Object;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final j(Lp1/c1;Z)Ll83/a0;
    .locals 0

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    invoke-interface {p0, p1}, Lp1/c1;->setValue(Ljava/lang/Object;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final k(Lp1/c1;Z)Ll83/a0;
    .locals 0

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    invoke-interface {p0, p1}, Lp1/c1;->setValue(Ljava/lang/Object;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final l(Lp1/c1;Z)Ll83/a0;
    .locals 0

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    invoke-interface {p0, p1}, Lp1/c1;->setValue(Ljava/lang/Object;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final m(Lp1/c1;F)Ll83/a0;
    .locals 0

    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p1

    invoke-interface {p0, p1}, Lp1/c1;->setValue(Ljava/lang/Object;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final n(Lp1/c1;F)Ll83/a0;
    .locals 0

    invoke-static {p1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object p1

    invoke-interface {p0, p1}, Lp1/c1;->setValue(Ljava/lang/Object;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final o(ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p0, p0, 0x1

    invoke-static {p0}, Lp1/x;->L(I)I

    move-result p0

    invoke-static {p1, p0}, Lzc1/u4;->h(Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method
