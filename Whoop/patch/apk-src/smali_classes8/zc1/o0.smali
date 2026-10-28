.class public abstract Lzc1/o0;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0007\u001a\u000f\u0010\u0001\u001a\u00020\u0000H\u0001\u00a2\u0006\u0004\u0008\u0001\u0010\u0002\u001a\u001f\u0010\u0007\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0003\u00a2\u0006\u0004\u0008\u0007\u0010\u0008\u001a\u001f\u0010\t\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0003\u00a2\u0006\u0004\u0008\t\u0010\u0008\u001a\u001f\u0010\n\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0003\u00a2\u0006\u0004\u0008\n\u0010\u0008\u001a\u001f\u0010\u000b\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0005H\u0003\u00a2\u0006\u0004\u0008\u000b\u0010\u0008\u00a8\u0006\u000c"
    }
    d2 = {
        "Ll83/a0;",
        "t",
        "(Landroidx/compose/runtime/Composer;I)V",
        "",
        "title",
        "",
        "isEnabled",
        "L",
        "(Ljava/lang/String;ZLandroidx/compose/runtime/Composer;I)V",
        "F",
        "z",
        "v",
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
.method private static final A(Lp1/c1;Z)Ll83/a0;
    .locals 0

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    invoke-interface {p0, p1}, Lp1/c1;->setValue(Ljava/lang/Object;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final B(Lp1/c1;Z)Ll83/a0;
    .locals 0

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    invoke-interface {p0, p1}, Lp1/c1;->setValue(Ljava/lang/Object;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final C(Lp1/c1;Z)Ll83/a0;
    .locals 0

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    invoke-interface {p0, p1}, Lp1/c1;->setValue(Ljava/lang/Object;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final D(Lp1/c1;Z)Ll83/a0;
    .locals 0

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    invoke-interface {p0, p1}, Lp1/c1;->setValue(Ljava/lang/Object;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final E(Ljava/lang/String;ZILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, Lp1/x;->L(I)I

    move-result p2

    invoke-static {p0, p1, p3, p2}, Lzc1/o0;->z(Ljava/lang/String;ZLandroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final F(Ljava/lang/String;ZLandroidx/compose/runtime/Composer;I)V
    .locals 57

    move-object/from16 v0, p0

    move/from16 v4, p1

    move-object/from16 v14, p2

    check-cast v14, Lp1/q;

    const v1, 0x1d48b081

    invoke-virtual {v14, v1}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v1, p3, 0x6

    if-nez v1, :cond_1

    invoke-virtual {v14, v0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, 0x4

    goto :goto_0

    :cond_0
    const/4 v1, 0x2

    :goto_0
    or-int v1, p3, v1

    goto :goto_1

    :cond_1
    move/from16 v1, p3

    :goto_1
    and-int/lit8 v3, p3, 0x30

    if-nez v3, :cond_3

    invoke-virtual {v14, v4}, Lp1/q;->h(Z)Z

    move-result v3

    if-eqz v3, :cond_2

    const/16 v3, 0x20

    goto :goto_2

    :cond_2
    const/16 v3, 0x10

    :goto_2
    or-int/2addr v1, v3

    :cond_3
    and-int/lit8 v3, v1, 0x13

    const/16 v5, 0x12

    const/4 v6, 0x0

    if-eq v3, v5, :cond_4

    const/4 v3, 0x1

    goto :goto_3

    :cond_4
    move v3, v6

    :goto_3
    and-int/lit8 v5, v1, 0x1

    invoke-virtual {v14, v5, v3}, Lp1/q;->U(IZ)Z

    move-result v3

    if-eqz v3, :cond_1a

    and-int/lit8 v3, v1, 0xe

    invoke-static {v0, v14, v3}, Lkd1/k;->c(Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V

    invoke-virtual {v14}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    sget-object v5, Lp1/l;->a:Lp1/v0;

    if-ne v3, v5, :cond_5

    sget-object v3, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-static {v3}, Lp1/x;->z(Ljava/lang/Object;)Lp1/k1;

    move-result-object v3

    invoke-virtual {v14, v3}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_5
    check-cast v3, Lp1/c1;

    invoke-virtual {v14}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v8

    if-ne v8, v5, :cond_6

    sget-object v8, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-static {v8}, Lp1/x;->z(Ljava/lang/Object;)Lp1/k1;

    move-result-object v8

    invoke-virtual {v14, v8}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_6
    check-cast v8, Lp1/c1;

    invoke-virtual {v14}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v9

    if-ne v9, v5, :cond_7

    sget-object v9, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-static {v9}, Lp1/x;->z(Ljava/lang/Object;)Lp1/k1;

    move-result-object v9

    invoke-virtual {v14, v9}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_7
    check-cast v9, Lp1/c1;

    invoke-virtual {v14}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v10

    if-ne v10, v5, :cond_8

    sget-object v10, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-static {v10}, Lp1/x;->z(Ljava/lang/Object;)Lp1/k1;

    move-result-object v10

    invoke-virtual {v14, v10}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_8
    check-cast v10, Lp1/c1;

    const/high16 v11, 0x3f800000    # 1.0f

    sget-object v12, Lb2/t;->w:Lb2/t;

    invoke-static {v11, v12}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v13

    sget-object v15, Ll0/m;->a:Ll0/e;

    sget-object v2, Lb2/e;->J:Lb2/l;

    invoke-static {v15, v2, v14, v6}, Ll0/p1;->a(Ll0/i;Lb2/g;Landroidx/compose/runtime/Composer;I)Ll0/r1;

    move-result-object v2

    move-object v15, v8

    iget-wide v7, v14, Lp1/q;->T:J

    invoke-static {v7, v8}, Ljava/lang/Long;->hashCode(J)I

    move-result v7

    invoke-virtual {v14}, Lp1/q;->m()Lp1/p1;

    move-result-object v8

    invoke-static {v14, v13}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v13

    sget-object v16, La3/l;->a:La3/k;

    invoke-virtual/range {v16 .. v16}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v6, La3/k;->b:La3/j;

    invoke-virtual {v14}, Lp1/q;->i0()V

    iget-boolean v11, v14, Lp1/q;->S:Z

    if-eqz v11, :cond_9

    invoke-virtual {v14, v6}, Lp1/q;->l(Lc93/a;)V

    goto :goto_4

    :cond_9
    invoke-virtual {v14}, Lp1/q;->s0()V

    :goto_4
    sget-object v11, La3/k;->g:La3/i;

    invoke-static {v14, v11, v2}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v2, La3/k;->f:La3/i;

    invoke-static {v14, v2, v8}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v8, La3/k;->j:La3/i;

    move/from16 v18, v1

    iget-boolean v1, v14, Lp1/q;->S:Z

    if-nez v1, :cond_a

    invoke-virtual {v14}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-static {v1, v4}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_b

    :cond_a
    invoke-static {v7, v14, v7, v8}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_b
    sget-object v1, La3/k;->d:La3/i;

    invoke-static {v14, v1, v13}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    move-object v7, v9

    move-object v13, v10

    const/high16 v4, 0x3f800000    # 1.0f

    float-to-double v9, v4

    const-wide/16 v19, 0x0

    cmpl-double v9, v9, v19

    const-string v21, "invalid weight; must be greater than zero"

    if-lez v9, :cond_c

    goto :goto_5

    :cond_c
    invoke-static/range {v21 .. v21}, Lm0/a;->a(Ljava/lang/String;)V

    :goto_5
    new-instance v9, Landroidx/compose/foundation/layout/LayoutWeightElement;

    const v22, 0x7f7fffff    # Float.MAX_VALUE

    cmpl-float v10, v4, v22

    if-lez v10, :cond_d

    move/from16 v10, v22

    :goto_6
    const/4 v4, 0x1

    goto :goto_7

    :cond_d
    move v10, v4

    goto :goto_6

    :goto_7
    invoke-direct {v9, v10, v4}, Landroidx/compose/foundation/layout/LayoutWeightElement;-><init>(FZ)V

    sget-object v4, Ll0/a1;->x:Ll0/a1;

    invoke-static {v9, v4}, Landroidx/compose/foundation/layout/a;->u(Landroidx/compose/ui/Modifier;Ll0/a1;)Landroidx/compose/ui/Modifier;

    move-result-object v9

    sget-object v10, Lb2/e;->N:Lb2/k;

    move-object/from16 v23, v7

    sget-object v7, Ll0/m;->c:Ll0/g;

    const/16 v0, 0x30

    move-object/from16 v24, v4

    invoke-static {v7, v10, v14, v0}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v4

    move-object/from16 v25, v1

    iget-wide v0, v14, Lp1/q;->T:J

    invoke-static {v0, v1}, Ljava/lang/Long;->hashCode(J)I

    move-result v0

    invoke-virtual {v14}, Lp1/q;->m()Lp1/p1;

    move-result-object v1

    invoke-static {v14, v9}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v9

    invoke-virtual {v14}, Lp1/q;->i0()V

    move-object/from16 v26, v7

    iget-boolean v7, v14, Lp1/q;->S:Z

    if-eqz v7, :cond_e

    invoke-virtual {v14, v6}, Lp1/q;->l(Lc93/a;)V

    goto :goto_8

    :cond_e
    invoke-virtual {v14}, Lp1/q;->s0()V

    :goto_8
    invoke-static {v14, v11, v4}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v14, v2, v1}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v1, v14, Lp1/q;->S:Z

    if-nez v1, :cond_10

    invoke-virtual {v14}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-static {v1, v4}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_f

    goto :goto_a

    :cond_f
    :goto_9
    move-object/from16 v0, v25

    goto :goto_b

    :cond_10
    :goto_a
    invoke-static {v0, v14, v0, v8}, Ld;->y(ILp1/q;ILa3/i;)V

    goto :goto_9

    :goto_b
    invoke-static {v14, v0, v9}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const-string v1, "On"

    const/4 v4, 0x6

    invoke-static {v1, v14, v4}, Lkd1/k;->e(Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V

    const/4 v1, 0x1

    int-to-float v7, v1

    const/4 v9, 0x4

    int-to-float v9, v9

    mul-float/2addr v7, v9

    move-object/from16 p2, v6

    const-string v6, "Toggle"

    move/from16 v16, v1

    invoke-static {v12, v7, v14, v6}, Ljh3/c;->d(Lb2/t;FLp1/q;Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v1

    move-object/from16 v25, v2

    sget-object v2, Lsy0/k$e;->b:Lsy0/k$e;

    invoke-interface {v3}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object v27

    check-cast v27, Ljava/lang/Boolean;

    invoke-virtual/range {v27 .. v27}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v27

    move/from16 v28, v4

    invoke-virtual {v14}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    if-ne v4, v5, :cond_11

    new-instance v4, Lzc1/n0;

    move-object/from16 v29, v0

    const/4 v0, 0x4

    invoke-direct {v4, v0, v3}, Lzc1/n0;-><init>(ILp1/c1;)V

    invoke-virtual {v14, v4}, Lp1/q;->p0(Ljava/lang/Object;)V

    goto :goto_c

    :cond_11
    move-object/from16 v29, v0

    :goto_c
    check-cast v4, Lkotlin/jvm/functions/Function1;

    sget v0, Lcom/whoop/design/util/TextResource;->$stable:I

    sget v3, Lsy0/k$e;->c:I

    shl-int/lit8 v3, v3, 0x3

    or-int/2addr v3, v0

    move/from16 v30, v0

    shl-int/lit8 v0, v18, 0x6

    and-int/lit16 v0, v0, 0x1c00

    or-int/2addr v3, v0

    move/from16 v18, v16

    const/16 v16, 0x6

    const/high16 v31, 0x3f800000    # 1.0f

    const/16 v17, 0x3f0

    move-object/from16 v32, v5

    const/4 v5, 0x0

    move-object/from16 v34, v6

    move/from16 v33, v7

    const-wide/16 v6, 0x0

    move-object/from16 v35, v8

    const/4 v8, 0x0

    move/from16 v36, v9

    const/4 v9, 0x0

    move-object/from16 v37, v10

    const/4 v10, 0x0

    move-object/from16 v38, v11

    move-object/from16 v39, v12

    const-wide/16 v11, 0x0

    move-object/from16 v41, p2

    move/from16 v40, v0

    move-object/from16 v18, v13

    move-object/from16 p2, v15

    move-object/from16 v46, v24

    move-object/from16 v43, v25

    move-object/from16 v48, v26

    move-object/from16 v45, v29

    move-object/from16 v50, v32

    move/from16 v0, v33

    move-object/from16 v49, v34

    move-object/from16 v44, v35

    move-object/from16 v47, v37

    move-object/from16 v42, v38

    move-object/from16 v51, v39

    move v15, v3

    move-object v13, v4

    move/from16 v3, v27

    move/from16 v4, p1

    invoke-static/range {v1 .. v17}, Lsy0/j;->f(Lcom/whoop/design/util/TextResource;Lsy0/k;ZZIJLandroidx/compose/ui/Modifier;Ll0/k1;ZJLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v24, v2

    move/from16 v25, v15

    const-string v1, "10:30pm"

    move-object v3, v1

    move-object/from16 v2, v51

    invoke-static {v2, v0, v14, v3}, Ljh3/c;->d(Lb2/t;FLp1/q;Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v1

    sget-object v2, Lsy0/k$d;->b:Lsy0/k$d;

    invoke-interface/range {p2 .. p2}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/Boolean;

    invoke-virtual {v4}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v4

    invoke-virtual {v14}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    move-object/from16 v6, v50

    if-ne v5, v6, :cond_12

    new-instance v5, Lyb0/e;

    const/16 v7, 0x15

    move-object/from16 v15, p2

    invoke-direct {v5, v7, v15}, Lyb0/e;-><init>(ILp1/c1;)V

    invoke-virtual {v14, v5}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_12
    move-object v13, v5

    check-cast v13, Lkotlin/jvm/functions/Function1;

    sget v5, Lsy0/k$d;->c:I

    shl-int/lit8 v5, v5, 0x3

    or-int v5, v30, v5

    or-int v15, v5, v40

    const/16 v16, 0x6

    const/16 v17, 0x3f0

    const/4 v5, 0x0

    move-object/from16 v32, v6

    const-wide/16 v6, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const-wide/16 v11, 0x0

    move/from16 v33, v0

    move-object/from16 v52, v3

    move v3, v4

    move-object/from16 v53, v32

    move-object/from16 v0, v51

    move/from16 v4, p1

    invoke-static/range {v1 .. v17}, Lsy0/j;->f(Lcom/whoop/design/util/TextResource;Lsy0/k;ZZIJLandroidx/compose/ui/Modifier;Ll0/k1;ZJLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v26, v2

    move/from16 v27, v15

    const/4 v1, 0x1

    invoke-virtual {v14, v1}, Lp1/q;->q(Z)V

    mul-float v9, v36, v36

    invoke-static {v9, v0}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    invoke-static {v14, v2}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    const/high16 v4, 0x3f800000    # 1.0f

    float-to-double v2, v4

    cmpl-double v2, v2, v19

    if-lez v2, :cond_13

    goto :goto_d

    :cond_13
    invoke-static/range {v21 .. v21}, Lm0/a;->a(Ljava/lang/String;)V

    :goto_d
    new-instance v2, Landroidx/compose/foundation/layout/LayoutWeightElement;

    cmpl-float v3, v4, v22

    if-lez v3, :cond_14

    move/from16 v11, v22

    goto :goto_e

    :cond_14
    move v11, v4

    :goto_e
    invoke-direct {v2, v11, v1}, Landroidx/compose/foundation/layout/LayoutWeightElement;-><init>(FZ)V

    move-object/from16 v3, v46

    invoke-static {v2, v3}, Landroidx/compose/foundation/layout/a;->u(Landroidx/compose/ui/Modifier;Ll0/a1;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    move-object/from16 v3, v47

    move-object/from16 v4, v48

    const/16 v5, 0x30

    invoke-static {v4, v3, v14, v5}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v3

    iget-wide v4, v14, Lp1/q;->T:J

    invoke-static {v4, v5}, Ljava/lang/Long;->hashCode(J)I

    move-result v4

    invoke-virtual {v14}, Lp1/q;->m()Lp1/p1;

    move-result-object v5

    invoke-static {v14, v2}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    invoke-virtual {v14}, Lp1/q;->i0()V

    iget-boolean v6, v14, Lp1/q;->S:Z

    if-eqz v6, :cond_15

    move-object/from16 v6, v41

    invoke-virtual {v14, v6}, Lp1/q;->l(Lc93/a;)V

    :goto_f
    move-object/from16 v6, v42

    goto :goto_10

    :cond_15
    invoke-virtual {v14}, Lp1/q;->s0()V

    goto :goto_f

    :goto_10
    invoke-static {v14, v6, v3}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    move-object/from16 v3, v43

    invoke-static {v14, v3, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v3, v14, Lp1/q;->S:Z

    if-nez v3, :cond_16

    invoke-virtual {v14}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-static {v3, v5}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_17

    :cond_16
    move-object/from16 v3, v44

    goto :goto_12

    :cond_17
    :goto_11
    move-object/from16 v3, v45

    goto :goto_13

    :goto_12
    invoke-static {v4, v14, v4, v3}, Ld;->y(ILp1/q;ILa3/i;)V

    goto :goto_11

    :goto_13
    invoke-static {v14, v3, v2}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const-string v2, "Off"

    const/4 v3, 0x6

    invoke-static {v2, v14, v3}, Lkd1/k;->e(Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V

    move/from16 v2, v33

    move-object/from16 v3, v49

    invoke-static {v0, v2, v14, v3}, Ljh3/c;->d(Lb2/t;FLp1/q;Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v3

    invoke-interface/range {v23 .. v23}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/Boolean;

    invoke-virtual {v4}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v4

    invoke-virtual {v14}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    move-object/from16 v6, v53

    if-ne v5, v6, :cond_18

    new-instance v5, Lyb0/e;

    const/16 v7, 0x16

    move-object/from16 v9, v23

    invoke-direct {v5, v7, v9}, Lyb0/e;-><init>(ILp1/c1;)V

    invoke-virtual {v14, v5}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_18
    move-object v13, v5

    check-cast v13, Lkotlin/jvm/functions/Function1;

    const/16 v16, 0x6

    const/16 v17, 0x3f0

    const/4 v5, 0x0

    move-object/from16 v32, v6

    const-wide/16 v6, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const-wide/16 v11, 0x0

    move/from16 v54, v2

    move-object v1, v3

    move v3, v4

    move-object/from16 v2, v24

    move/from16 v15, v25

    move-object/from16 v55, v32

    move/from16 v4, p1

    invoke-static/range {v1 .. v17}, Lsy0/j;->f(Lcom/whoop/design/util/TextResource;Lsy0/k;ZZIJLandroidx/compose/ui/Modifier;Ll0/k1;ZJLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v3, v52

    move/from16 v1, v54

    invoke-static {v0, v1, v14, v3}, Ljh3/c;->d(Lb2/t;FLp1/q;Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v2

    invoke-interface/range {v18 .. v18}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Boolean;

    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v3

    invoke-virtual {v14}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    move-object/from16 v6, v55

    if-ne v4, v6, :cond_19

    new-instance v4, Lyb0/e;

    const/16 v5, 0x17

    move-object/from16 v13, v18

    invoke-direct {v4, v5, v13}, Lyb0/e;-><init>(ILp1/c1;)V

    invoke-virtual {v14, v4}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_19
    move-object v13, v4

    check-cast v13, Lkotlin/jvm/functions/Function1;

    const/16 v16, 0x6

    const/16 v17, 0x3f0

    const/4 v5, 0x0

    const-wide/16 v6, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const-wide/16 v11, 0x0

    move/from16 v4, p1

    move/from16 v56, v1

    move-object v1, v2

    move-object/from16 v2, v26

    move/from16 v15, v27

    invoke-static/range {v1 .. v17}, Lsy0/j;->f(Lcom/whoop/design/util/TextResource;Lsy0/k;ZZIJLandroidx/compose/ui/Modifier;Ll0/k1;ZJLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;III)V

    move/from16 v1, v56

    invoke-static {v1, v0}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    invoke-static {v14, v0}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    const/4 v1, 0x1

    invoke-virtual {v14, v1}, Lp1/q;->q(Z)V

    invoke-virtual {v14, v1}, Lp1/q;->q(Z)V

    goto :goto_14

    :cond_1a
    invoke-virtual {v14}, Lp1/q;->X()V

    :goto_14
    invoke-virtual {v14}, Lp1/q;->u()Lp1/v1;

    move-result-object v0

    if-eqz v0, :cond_1b

    new-instance v1, Lzc1/m0;

    const/4 v2, 0x0

    move-object/from16 v3, p0

    move/from16 v5, p3

    invoke-direct {v1, v5, v3, v2, v4}, Lzc1/m0;-><init>(ILjava/lang/String;IZ)V

    iput-object v1, v0, Lp1/v1;->d:Lc93/m;

    :cond_1b
    return-void
.end method

.method private static final G(Lp1/c1;Z)Ll83/a0;
    .locals 0

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    invoke-interface {p0, p1}, Lp1/c1;->setValue(Ljava/lang/Object;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final H(Lp1/c1;Z)Ll83/a0;
    .locals 0

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    invoke-interface {p0, p1}, Lp1/c1;->setValue(Ljava/lang/Object;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final I(Lp1/c1;Z)Ll83/a0;
    .locals 0

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    invoke-interface {p0, p1}, Lp1/c1;->setValue(Ljava/lang/Object;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final J(Lp1/c1;Z)Ll83/a0;
    .locals 0

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    invoke-interface {p0, p1}, Lp1/c1;->setValue(Ljava/lang/Object;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final K(Ljava/lang/String;ZILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, Lp1/x;->L(I)I

    move-result p2

    invoke-static {p0, p1, p3, p2}, Lzc1/o0;->F(Ljava/lang/String;ZLandroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final L(Ljava/lang/String;ZLandroidx/compose/runtime/Composer;I)V
    .locals 58

    move-object/from16 v0, p0

    move/from16 v4, p1

    move-object/from16 v14, p2

    check-cast v14, Lp1/q;

    const v1, -0x5a6f2e6e

    invoke-virtual {v14, v1}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v1, p3, 0x6

    if-nez v1, :cond_1

    invoke-virtual {v14, v0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, 0x4

    goto :goto_0

    :cond_0
    const/4 v1, 0x2

    :goto_0
    or-int v1, p3, v1

    goto :goto_1

    :cond_1
    move/from16 v1, p3

    :goto_1
    and-int/lit8 v3, p3, 0x30

    if-nez v3, :cond_3

    invoke-virtual {v14, v4}, Lp1/q;->h(Z)Z

    move-result v3

    if-eqz v3, :cond_2

    const/16 v3, 0x20

    goto :goto_2

    :cond_2
    const/16 v3, 0x10

    :goto_2
    or-int/2addr v1, v3

    :cond_3
    and-int/lit8 v3, v1, 0x13

    const/16 v5, 0x12

    const/4 v6, 0x0

    if-eq v3, v5, :cond_4

    const/4 v3, 0x1

    goto :goto_3

    :cond_4
    move v3, v6

    :goto_3
    and-int/lit8 v5, v1, 0x1

    invoke-virtual {v14, v5, v3}, Lp1/q;->U(IZ)Z

    move-result v3

    if-eqz v3, :cond_1a

    and-int/lit8 v3, v1, 0xe

    invoke-static {v0, v14, v3}, Lkd1/k;->c(Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V

    invoke-virtual {v14}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    sget-object v5, Lp1/l;->a:Lp1/v0;

    if-ne v3, v5, :cond_5

    sget-object v3, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-static {v3}, Lp1/x;->z(Ljava/lang/Object;)Lp1/k1;

    move-result-object v3

    invoke-virtual {v14, v3}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_5
    check-cast v3, Lp1/c1;

    invoke-virtual {v14}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v8

    if-ne v8, v5, :cond_6

    sget-object v8, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-static {v8}, Lp1/x;->z(Ljava/lang/Object;)Lp1/k1;

    move-result-object v8

    invoke-virtual {v14, v8}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_6
    check-cast v8, Lp1/c1;

    invoke-virtual {v14}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v9

    if-ne v9, v5, :cond_7

    sget-object v9, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-static {v9}, Lp1/x;->z(Ljava/lang/Object;)Lp1/k1;

    move-result-object v9

    invoke-virtual {v14, v9}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_7
    check-cast v9, Lp1/c1;

    invoke-virtual {v14}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v10

    if-ne v10, v5, :cond_8

    sget-object v10, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-static {v10}, Lp1/x;->z(Ljava/lang/Object;)Lp1/k1;

    move-result-object v10

    invoke-virtual {v14, v10}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_8
    check-cast v10, Lp1/c1;

    const/high16 v11, 0x3f800000    # 1.0f

    sget-object v12, Lb2/t;->w:Lb2/t;

    invoke-static {v11, v12}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v13

    sget-object v15, Ll0/m;->a:Ll0/e;

    sget-object v2, Lb2/e;->J:Lb2/l;

    invoke-static {v15, v2, v14, v6}, Ll0/p1;->a(Ll0/i;Lb2/g;Landroidx/compose/runtime/Composer;I)Ll0/r1;

    move-result-object v2

    move-object v15, v8

    iget-wide v7, v14, Lp1/q;->T:J

    invoke-static {v7, v8}, Ljava/lang/Long;->hashCode(J)I

    move-result v7

    invoke-virtual {v14}, Lp1/q;->m()Lp1/p1;

    move-result-object v8

    invoke-static {v14, v13}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v13

    sget-object v16, La3/l;->a:La3/k;

    invoke-virtual/range {v16 .. v16}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v6, La3/k;->b:La3/j;

    invoke-virtual {v14}, Lp1/q;->i0()V

    iget-boolean v11, v14, Lp1/q;->S:Z

    if-eqz v11, :cond_9

    invoke-virtual {v14, v6}, Lp1/q;->l(Lc93/a;)V

    goto :goto_4

    :cond_9
    invoke-virtual {v14}, Lp1/q;->s0()V

    :goto_4
    sget-object v11, La3/k;->g:La3/i;

    invoke-static {v14, v11, v2}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v2, La3/k;->f:La3/i;

    invoke-static {v14, v2, v8}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v8, La3/k;->j:La3/i;

    move/from16 v18, v1

    iget-boolean v1, v14, Lp1/q;->S:Z

    if-nez v1, :cond_a

    invoke-virtual {v14}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-static {v1, v4}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_b

    :cond_a
    invoke-static {v7, v14, v7, v8}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_b
    sget-object v1, La3/k;->d:La3/i;

    invoke-static {v14, v1, v13}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    move-object v7, v9

    move-object v13, v10

    const/high16 v4, 0x3f800000    # 1.0f

    float-to-double v9, v4

    const-wide/16 v19, 0x0

    cmpl-double v9, v9, v19

    const-string v21, "invalid weight; must be greater than zero"

    if-lez v9, :cond_c

    goto :goto_5

    :cond_c
    invoke-static/range {v21 .. v21}, Lm0/a;->a(Ljava/lang/String;)V

    :goto_5
    new-instance v9, Landroidx/compose/foundation/layout/LayoutWeightElement;

    const v22, 0x7f7fffff    # Float.MAX_VALUE

    cmpl-float v10, v4, v22

    if-lez v10, :cond_d

    move/from16 v10, v22

    :goto_6
    const/4 v4, 0x1

    goto :goto_7

    :cond_d
    move v10, v4

    goto :goto_6

    :goto_7
    invoke-direct {v9, v10, v4}, Landroidx/compose/foundation/layout/LayoutWeightElement;-><init>(FZ)V

    sget-object v4, Ll0/a1;->x:Ll0/a1;

    invoke-static {v9, v4}, Landroidx/compose/foundation/layout/a;->u(Landroidx/compose/ui/Modifier;Ll0/a1;)Landroidx/compose/ui/Modifier;

    move-result-object v9

    sget-object v10, Lb2/e;->N:Lb2/k;

    move-object/from16 v23, v7

    sget-object v7, Ll0/m;->c:Ll0/g;

    const/16 v0, 0x30

    move-object/from16 v24, v4

    invoke-static {v7, v10, v14, v0}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v4

    move-object/from16 v25, v1

    iget-wide v0, v14, Lp1/q;->T:J

    invoke-static {v0, v1}, Ljava/lang/Long;->hashCode(J)I

    move-result v0

    invoke-virtual {v14}, Lp1/q;->m()Lp1/p1;

    move-result-object v1

    invoke-static {v14, v9}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v9

    invoke-virtual {v14}, Lp1/q;->i0()V

    move-object/from16 v26, v7

    iget-boolean v7, v14, Lp1/q;->S:Z

    if-eqz v7, :cond_e

    invoke-virtual {v14, v6}, Lp1/q;->l(Lc93/a;)V

    goto :goto_8

    :cond_e
    invoke-virtual {v14}, Lp1/q;->s0()V

    :goto_8
    invoke-static {v14, v11, v4}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v14, v2, v1}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v1, v14, Lp1/q;->S:Z

    if-nez v1, :cond_10

    invoke-virtual {v14}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-static {v1, v4}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_f

    goto :goto_a

    :cond_f
    :goto_9
    move-object/from16 v0, v25

    goto :goto_b

    :cond_10
    :goto_a
    invoke-static {v0, v14, v0, v8}, Ld;->y(ILp1/q;ILa3/i;)V

    goto :goto_9

    :goto_b
    invoke-static {v14, v0, v9}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const-string v1, "On"

    const/4 v4, 0x6

    invoke-static {v1, v14, v4}, Lkd1/k;->e(Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V

    const/4 v1, 0x1

    int-to-float v7, v1

    const/4 v9, 0x4

    int-to-float v9, v9

    mul-float/2addr v7, v9

    move-object/from16 p2, v6

    const-string v6, "Traditional"

    move/from16 v16, v1

    invoke-static {v12, v7, v14, v6}, Ljh3/c;->d(Lb2/t;FLp1/q;Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v1

    move-object/from16 v25, v2

    new-instance v2, Lsy0/k$g;

    move-object/from16 v27, v6

    const/4 v6, 0x0

    move/from16 v28, v7

    const/4 v7, 0x3

    invoke-direct {v2, v6, v6, v7, v6}, Lsy0/k$g;-><init>(Lb91/a;Lb2/g;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {v3}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object v29

    check-cast v29, Ljava/lang/Boolean;

    invoke-virtual/range {v29 .. v29}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v29

    move/from16 v30, v4

    invoke-virtual {v14}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    if-ne v4, v5, :cond_11

    new-instance v4, Lyb0/e;

    const/16 v6, 0x1c

    invoke-direct {v4, v6, v3}, Lyb0/e;-><init>(ILp1/c1;)V

    invoke-virtual {v14, v4}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_11
    check-cast v4, Lkotlin/jvm/functions/Function1;

    sget v31, Lcom/whoop/design/util/TextResource;->$stable:I

    sget v3, Lsy0/k$g;->d:I

    shl-int/2addr v3, v7

    or-int v3, v31, v3

    shl-int/lit8 v6, v18, 0x6

    and-int/lit16 v6, v6, 0x1c00

    or-int/2addr v3, v6

    move/from16 v18, v16

    const/16 v16, 0x6

    const/high16 v32, 0x3f800000    # 1.0f

    const/16 v17, 0x3f0

    move-object/from16 v33, v5

    const/4 v5, 0x0

    move/from16 v34, v6

    move/from16 v35, v7

    const-wide/16 v6, 0x0

    move-object/from16 v36, v8

    const/4 v8, 0x0

    move/from16 v37, v9

    const/4 v9, 0x0

    move-object/from16 v38, v10

    const/4 v10, 0x0

    move-object/from16 v39, v11

    move-object/from16 v40, v12

    const-wide/16 v11, 0x0

    move-object/from16 v41, p2

    move-object/from16 v45, v0

    move-object/from16 v18, v13

    move-object/from16 p2, v15

    move-object/from16 v46, v24

    move-object/from16 v43, v25

    move-object/from16 v48, v26

    move-object/from16 v50, v27

    move/from16 v0, v28

    move-object/from16 v51, v33

    move-object/from16 v44, v36

    move-object/from16 v47, v38

    move-object/from16 v42, v39

    move-object/from16 v52, v40

    move v15, v3

    move-object v13, v4

    move/from16 v3, v29

    move/from16 v4, p1

    invoke-static/range {v1 .. v17}, Lsy0/j;->f(Lcom/whoop/design/util/TextResource;Lsy0/k;ZZIJLandroidx/compose/ui/Modifier;Ll0/k1;ZJLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;III)V

    move/from16 v24, v15

    const-string v1, "10:30pm"

    move-object v3, v1

    move-object/from16 v2, v52

    invoke-static {v2, v0, v14, v3}, Ljh3/c;->d(Lb2/t;FLp1/q;Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v1

    sget-object v2, Lsy0/k$f;->b:Lsy0/k$f;

    invoke-interface/range {p2 .. p2}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/Boolean;

    invoke-virtual {v4}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v4

    invoke-virtual {v14}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    move-object/from16 v6, v51

    if-ne v5, v6, :cond_12

    new-instance v5, Lyb0/e;

    const/16 v7, 0x1d

    move-object/from16 v15, p2

    invoke-direct {v5, v7, v15}, Lyb0/e;-><init>(ILp1/c1;)V

    invoke-virtual {v14, v5}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_12
    move-object v13, v5

    check-cast v13, Lkotlin/jvm/functions/Function1;

    sget v5, Lsy0/k$f;->c:I

    const/16 v49, 0x3

    shl-int/lit8 v5, v5, 0x3

    or-int v5, v31, v5

    or-int v15, v5, v34

    const/16 v16, 0x6

    const/16 v17, 0x3f0

    const/4 v5, 0x0

    move-object/from16 v33, v6

    const-wide/16 v6, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const-wide/16 v11, 0x0

    move/from16 v28, v0

    move-object/from16 v53, v3

    move v3, v4

    move-object/from16 v54, v33

    move-object/from16 v0, v52

    move/from16 v4, p1

    invoke-static/range {v1 .. v17}, Lsy0/j;->f(Lcom/whoop/design/util/TextResource;Lsy0/k;ZZIJLandroidx/compose/ui/Modifier;Ll0/k1;ZJLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v25, v2

    move/from16 v26, v15

    const/4 v1, 0x1

    invoke-virtual {v14, v1}, Lp1/q;->q(Z)V

    mul-float v9, v37, v37

    invoke-static {v9, v0}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    invoke-static {v14, v2}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    const/high16 v4, 0x3f800000    # 1.0f

    float-to-double v2, v4

    cmpl-double v2, v2, v19

    if-lez v2, :cond_13

    goto :goto_c

    :cond_13
    invoke-static/range {v21 .. v21}, Lm0/a;->a(Ljava/lang/String;)V

    :goto_c
    new-instance v2, Landroidx/compose/foundation/layout/LayoutWeightElement;

    cmpl-float v3, v4, v22

    if-lez v3, :cond_14

    move/from16 v11, v22

    goto :goto_d

    :cond_14
    move v11, v4

    :goto_d
    invoke-direct {v2, v11, v1}, Landroidx/compose/foundation/layout/LayoutWeightElement;-><init>(FZ)V

    move-object/from16 v3, v46

    invoke-static {v2, v3}, Landroidx/compose/foundation/layout/a;->u(Landroidx/compose/ui/Modifier;Ll0/a1;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    move-object/from16 v3, v47

    move-object/from16 v4, v48

    const/16 v5, 0x30

    invoke-static {v4, v3, v14, v5}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v3

    iget-wide v4, v14, Lp1/q;->T:J

    invoke-static {v4, v5}, Ljava/lang/Long;->hashCode(J)I

    move-result v4

    invoke-virtual {v14}, Lp1/q;->m()Lp1/p1;

    move-result-object v5

    invoke-static {v14, v2}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    invoke-virtual {v14}, Lp1/q;->i0()V

    iget-boolean v6, v14, Lp1/q;->S:Z

    if-eqz v6, :cond_15

    move-object/from16 v6, v41

    invoke-virtual {v14, v6}, Lp1/q;->l(Lc93/a;)V

    :goto_e
    move-object/from16 v6, v42

    goto :goto_f

    :cond_15
    invoke-virtual {v14}, Lp1/q;->s0()V

    goto :goto_e

    :goto_f
    invoke-static {v14, v6, v3}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    move-object/from16 v3, v43

    invoke-static {v14, v3, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v3, v14, Lp1/q;->S:Z

    if-nez v3, :cond_16

    invoke-virtual {v14}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-static {v3, v5}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_17

    :cond_16
    move-object/from16 v3, v44

    goto :goto_11

    :cond_17
    :goto_10
    move-object/from16 v3, v45

    goto :goto_12

    :goto_11
    invoke-static {v4, v14, v4, v3}, Ld;->y(ILp1/q;ILa3/i;)V

    goto :goto_10

    :goto_12
    invoke-static {v14, v3, v2}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const-string v2, "Off"

    const/4 v3, 0x6

    invoke-static {v2, v14, v3}, Lkd1/k;->e(Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V

    move/from16 v2, v28

    move-object/from16 v3, v50

    invoke-static {v0, v2, v14, v3}, Ljh3/c;->d(Lb2/t;FLp1/q;Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v3

    new-instance v2, Lsy0/k$g;

    const/4 v4, 0x3

    const/4 v5, 0x0

    invoke-direct {v2, v5, v5, v4, v5}, Lsy0/k$g;-><init>(Lb91/a;Lb2/g;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface/range {v23 .. v23}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/Boolean;

    invoke-virtual {v4}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v4

    invoke-virtual {v14}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    move-object/from16 v6, v54

    if-ne v5, v6, :cond_18

    new-instance v5, Lzc1/n0;

    const/4 v7, 0x0

    move-object/from16 v9, v23

    invoke-direct {v5, v7, v9}, Lzc1/n0;-><init>(ILp1/c1;)V

    invoke-virtual {v14, v5}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_18
    move-object v13, v5

    check-cast v13, Lkotlin/jvm/functions/Function1;

    const/16 v16, 0x6

    const/16 v17, 0x3f0

    const/4 v5, 0x0

    move-object/from16 v33, v6

    const-wide/16 v6, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const-wide/16 v11, 0x0

    move-object v1, v3

    move v3, v4

    move/from16 v15, v24

    move/from16 v55, v28

    move-object/from16 v56, v33

    move/from16 v4, p1

    invoke-static/range {v1 .. v17}, Lsy0/j;->f(Lcom/whoop/design/util/TextResource;Lsy0/k;ZZIJLandroidx/compose/ui/Modifier;Ll0/k1;ZJLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v3, v53

    move/from16 v1, v55

    invoke-static {v0, v1, v14, v3}, Ljh3/c;->d(Lb2/t;FLp1/q;Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v2

    invoke-interface/range {v18 .. v18}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Boolean;

    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v3

    invoke-virtual {v14}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    move-object/from16 v6, v56

    if-ne v4, v6, :cond_19

    new-instance v4, Lzc1/n0;

    const/4 v5, 0x1

    move-object/from16 v13, v18

    invoke-direct {v4, v5, v13}, Lzc1/n0;-><init>(ILp1/c1;)V

    invoke-virtual {v14, v4}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_19
    move-object v13, v4

    check-cast v13, Lkotlin/jvm/functions/Function1;

    const/16 v16, 0x6

    const/16 v17, 0x3f0

    const/4 v5, 0x0

    const-wide/16 v6, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const-wide/16 v11, 0x0

    move/from16 v4, p1

    move/from16 v57, v1

    move-object v1, v2

    move-object/from16 v2, v25

    move/from16 v15, v26

    invoke-static/range {v1 .. v17}, Lsy0/j;->f(Lcom/whoop/design/util/TextResource;Lsy0/k;ZZIJLandroidx/compose/ui/Modifier;Ll0/k1;ZJLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;III)V

    move/from16 v1, v57

    invoke-static {v1, v0}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    invoke-static {v14, v0}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    const/4 v1, 0x1

    invoke-virtual {v14, v1}, Lp1/q;->q(Z)V

    invoke-virtual {v14, v1}, Lp1/q;->q(Z)V

    goto :goto_13

    :cond_1a
    invoke-virtual {v14}, Lp1/q;->X()V

    :goto_13
    invoke-virtual {v14}, Lp1/q;->u()Lp1/v1;

    move-result-object v0

    if-eqz v0, :cond_1b

    new-instance v1, Lzc1/m0;

    const/4 v2, 0x2

    move-object/from16 v3, p0

    move/from16 v5, p3

    invoke-direct {v1, v5, v3, v2, v4}, Lzc1/m0;-><init>(ILjava/lang/String;IZ)V

    iput-object v1, v0, Lp1/v1;->d:Lc93/m;

    :cond_1b
    return-void
.end method

.method private static final M(Lp1/c1;Z)Ll83/a0;
    .locals 0

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    invoke-interface {p0, p1}, Lp1/c1;->setValue(Ljava/lang/Object;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final N(Lp1/c1;Z)Ll83/a0;
    .locals 0

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    invoke-interface {p0, p1}, Lp1/c1;->setValue(Ljava/lang/Object;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final O(Lp1/c1;Z)Ll83/a0;
    .locals 0

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    invoke-interface {p0, p1}, Lp1/c1;->setValue(Ljava/lang/Object;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final P(Lp1/c1;Z)Ll83/a0;
    .locals 0

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    invoke-interface {p0, p1}, Lp1/c1;->setValue(Ljava/lang/Object;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final Q(Ljava/lang/String;ZILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, Lp1/x;->L(I)I

    move-result p2

    invoke-static {p0, p1, p3, p2}, Lzc1/o0;->L(Ljava/lang/String;ZLandroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static synthetic a(Lp1/c1;Z)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lzc1/o0;->x(Lp1/c1;Z)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Ljava/lang/String;ZILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Lzc1/o0;->K(Ljava/lang/String;ZILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Ljava/lang/String;ZILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Lzc1/o0;->Q(Ljava/lang/String;ZILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Lp1/c1;Z)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lzc1/o0;->A(Lp1/c1;Z)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic e(Ljava/lang/String;ZILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Lzc1/o0;->E(Ljava/lang/String;ZILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic f(ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, Lzc1/o0;->u(ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic g(Lp1/c1;Z)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lzc1/o0;->M(Lp1/c1;Z)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic h(Lp1/c1;Z)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lzc1/o0;->N(Lp1/c1;Z)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic i(Lp1/c1;Z)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lzc1/o0;->H(Lp1/c1;Z)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic j(Lp1/c1;Z)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lzc1/o0;->w(Lp1/c1;Z)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic k(Lp1/c1;Z)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lzc1/o0;->I(Lp1/c1;Z)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic l(Lp1/c1;Z)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lzc1/o0;->G(Lp1/c1;Z)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic m(Lp1/c1;Z)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lzc1/o0;->O(Lp1/c1;Z)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic n(Ljava/lang/String;ZILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Lzc1/o0;->y(Ljava/lang/String;ZILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic o(Lp1/c1;Z)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lzc1/o0;->C(Lp1/c1;Z)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic p(Lp1/c1;Z)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lzc1/o0;->D(Lp1/c1;Z)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic q(Lp1/c1;Z)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lzc1/o0;->P(Lp1/c1;Z)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic r(Lp1/c1;Z)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lzc1/o0;->B(Lp1/c1;Z)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic s(Lp1/c1;Z)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lzc1/o0;->J(Lp1/c1;Z)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final t(Landroidx/compose/runtime/Composer;I)V
    .locals 8

    check-cast p0, Lp1/q;

    const v0, -0x55dfdf0

    invoke-virtual {p0, v0}, Lp1/q;->g0(I)Lp1/q;

    const/4 v0, 0x0

    const/4 v1, 0x1

    if-eqz p1, :cond_0

    move v2, v1

    goto :goto_0

    :cond_0
    move v2, v0

    :goto_0
    and-int/lit8 v3, p1, 0x1

    invoke-virtual {p0, v3, v2}, Lp1/q;->U(IZ)Z

    move-result v2

    if-eqz v2, :cond_4

    sget-object v2, Lb2/t;->w:Lb2/t;

    const/high16 v3, 0x3f800000    # 1.0f

    invoke-static {v3, v2}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    const/4 v3, 0x4

    int-to-float v3, v3

    const/16 v4, 0x8

    int-to-float v4, v4

    mul-float/2addr v3, v4

    invoke-static {v3, v2}, Landroidx/compose/foundation/layout/a;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    sget-object v3, Lb2/e;->N:Lb2/k;

    sget-object v4, Ll0/m;->c:Ll0/g;

    const/16 v5, 0x30

    invoke-static {v4, v3, p0, v5}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v3

    iget-wide v4, p0, Lp1/q;->T:J

    invoke-static {v4, v5}, Ljava/lang/Long;->hashCode(J)I

    move-result v4

    invoke-virtual {p0}, Lp1/q;->m()Lp1/p1;

    move-result-object v5

    invoke-static {p0, v2}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    sget-object v6, La3/l;->a:La3/k;

    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v6, La3/k;->b:La3/j;

    invoke-virtual {p0}, Lp1/q;->i0()V

    iget-boolean v7, p0, Lp1/q;->S:Z

    if-eqz v7, :cond_1

    invoke-virtual {p0, v6}, Lp1/q;->l(Lc93/a;)V

    goto :goto_1

    :cond_1
    invoke-virtual {p0}, Lp1/q;->s0()V

    :goto_1
    sget-object v6, La3/k;->g:La3/i;

    invoke-static {p0, v6, v3}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v3, La3/k;->f:La3/i;

    invoke-static {p0, v3, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v3, La3/k;->j:La3/i;

    iget-boolean v5, p0, Lp1/q;->S:Z

    if-nez v5, :cond_2

    invoke-virtual {p0}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-static {v5, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_3

    :cond_2
    invoke-static {v4, p0, v4, v3}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_3
    sget-object v3, La3/k;->d:La3/i;

    invoke-static {p0, v3, v2}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const-string v2, "Traditional - Enabled"

    const/16 v3, 0x36

    invoke-static {v2, v1, p0, v3}, Lzc1/o0;->L(Ljava/lang/String;ZLandroidx/compose/runtime/Composer;I)V

    const-string v2, "Traditional - Disabled"

    invoke-static {v2, v0, p0, v3}, Lzc1/o0;->L(Ljava/lang/String;ZLandroidx/compose/runtime/Composer;I)V

    const-string v2, "Toggle - Enabled"

    invoke-static {v2, v1, p0, v3}, Lzc1/o0;->F(Ljava/lang/String;ZLandroidx/compose/runtime/Composer;I)V

    const-string v2, "Toggle - Disabled"

    invoke-static {v2, v0, p0, v3}, Lzc1/o0;->F(Ljava/lang/String;ZLandroidx/compose/runtime/Composer;I)V

    const-string v2, "MultiSelect - Enabled"

    invoke-static {v2, v1, p0, v3}, Lzc1/o0;->z(Ljava/lang/String;ZLandroidx/compose/runtime/Composer;I)V

    const-string v2, "MultiSelect - Disabled"

    invoke-static {v2, v0, p0, v3}, Lzc1/o0;->z(Ljava/lang/String;ZLandroidx/compose/runtime/Composer;I)V

    const-string v2, "Markdown - Enabled"

    invoke-static {v2, v1, p0, v3}, Lzc1/o0;->v(Ljava/lang/String;ZLandroidx/compose/runtime/Composer;I)V

    const-string v2, "Markdown - Disabled"

    invoke-static {v2, v0, p0, v3}, Lzc1/o0;->v(Ljava/lang/String;ZLandroidx/compose/runtime/Composer;I)V

    invoke-virtual {p0, v1}, Lp1/q;->q(Z)V

    goto :goto_2

    :cond_4
    invoke-virtual {p0}, Lp1/q;->X()V

    :goto_2
    invoke-virtual {p0}, Lp1/q;->u()Lp1/v1;

    move-result-object p0

    if-eqz p0, :cond_5

    new-instance v0, Lzc1/j;

    const/16 v1, 0x17

    invoke-direct {v0, p1, v1}, Lzc1/j;-><init>(II)V

    iput-object v0, p0, Lp1/v1;->d:Lc93/m;

    :cond_5
    return-void
.end method

.method private static final u(ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p0, p0, 0x1

    invoke-static {p0}, Lp1/x;->L(I)I

    move-result p0

    invoke-static {p1, p0}, Lzc1/o0;->t(Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final v(Ljava/lang/String;ZLandroidx/compose/runtime/Composer;I)V
    .locals 50

    move-object/from16 v0, p0

    move/from16 v4, p1

    move-object/from16 v14, p2

    check-cast v14, Lp1/q;

    const v1, 0x69f21d9c

    invoke-virtual {v14, v1}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v1, p3, 0x6

    if-nez v1, :cond_1

    invoke-virtual {v14, v0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, 0x4

    goto :goto_0

    :cond_0
    const/4 v1, 0x2

    :goto_0
    or-int v1, p3, v1

    goto :goto_1

    :cond_1
    move/from16 v1, p3

    :goto_1
    and-int/lit8 v3, p3, 0x30

    if-nez v3, :cond_3

    invoke-virtual {v14, v4}, Lp1/q;->h(Z)Z

    move-result v3

    if-eqz v3, :cond_2

    const/16 v3, 0x20

    goto :goto_2

    :cond_2
    const/16 v3, 0x10

    :goto_2
    or-int/2addr v1, v3

    :cond_3
    and-int/lit8 v3, v1, 0x13

    const/16 v5, 0x12

    const/4 v6, 0x0

    if-eq v3, v5, :cond_4

    const/4 v3, 0x1

    goto :goto_3

    :cond_4
    move v3, v6

    :goto_3
    and-int/lit8 v5, v1, 0x1

    invoke-virtual {v14, v5, v3}, Lp1/q;->U(IZ)Z

    move-result v3

    if-eqz v3, :cond_16

    and-int/lit8 v3, v1, 0xe

    invoke-static {v0, v14, v3}, Lkd1/k;->c(Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V

    invoke-virtual {v14}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    sget-object v5, Lp1/l;->a:Lp1/v0;

    if-ne v3, v5, :cond_5

    sget-object v3, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-static {v3}, Lp1/x;->z(Ljava/lang/Object;)Lp1/k1;

    move-result-object v3

    invoke-virtual {v14, v3}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_5
    check-cast v3, Lp1/c1;

    invoke-virtual {v14}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v8

    if-ne v8, v5, :cond_6

    sget-object v8, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-static {v8}, Lp1/x;->z(Ljava/lang/Object;)Lp1/k1;

    move-result-object v8

    invoke-virtual {v14, v8}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_6
    check-cast v8, Lp1/c1;

    const/high16 v9, 0x3f800000    # 1.0f

    sget-object v10, Lb2/t;->w:Lb2/t;

    invoke-static {v9, v10}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v11

    sget-object v12, Ll0/m;->a:Ll0/e;

    sget-object v13, Lb2/e;->J:Lb2/l;

    invoke-static {v12, v13, v14, v6}, Ll0/p1;->a(Ll0/i;Lb2/g;Landroidx/compose/runtime/Composer;I)Ll0/r1;

    move-result-object v6

    iget-wide v12, v14, Lp1/q;->T:J

    invoke-static {v12, v13}, Ljava/lang/Long;->hashCode(J)I

    move-result v12

    invoke-virtual {v14}, Lp1/q;->m()Lp1/p1;

    move-result-object v13

    invoke-static {v14, v11}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v11

    sget-object v15, La3/l;->a:La3/k;

    invoke-virtual {v15}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v15, La3/k;->b:La3/j;

    invoke-virtual {v14}, Lp1/q;->i0()V

    iget-boolean v2, v14, Lp1/q;->S:Z

    if-eqz v2, :cond_7

    invoke-virtual {v14, v15}, Lp1/q;->l(Lc93/a;)V

    goto :goto_4

    :cond_7
    invoke-virtual {v14}, Lp1/q;->s0()V

    :goto_4
    sget-object v2, La3/k;->g:La3/i;

    invoke-static {v14, v2, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v6, La3/k;->f:La3/i;

    invoke-static {v14, v6, v13}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v13, La3/k;->j:La3/i;

    iget-boolean v7, v14, Lp1/q;->S:Z

    if-nez v7, :cond_8

    invoke-virtual {v14}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v7

    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    invoke-static {v7, v9}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_9

    :cond_8
    invoke-static {v12, v14, v12, v13}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_9
    sget-object v7, La3/k;->d:La3/i;

    invoke-static {v14, v7, v11}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const/high16 v9, 0x3f800000    # 1.0f

    float-to-double v11, v9

    const-wide/16 v18, 0x0

    cmpl-double v11, v11, v18

    const-string v20, "invalid weight; must be greater than zero"

    if-lez v11, :cond_a

    goto :goto_5

    :cond_a
    invoke-static/range {v20 .. v20}, Lm0/a;->a(Ljava/lang/String;)V

    :goto_5
    new-instance v11, Landroidx/compose/foundation/layout/LayoutWeightElement;

    const v21, 0x7f7fffff    # Float.MAX_VALUE

    cmpl-float v12, v9, v21

    if-lez v12, :cond_b

    move/from16 v12, v21

    :goto_6
    const/4 v9, 0x1

    goto :goto_7

    :cond_b
    move v12, v9

    goto :goto_6

    :goto_7
    invoke-direct {v11, v12, v9}, Landroidx/compose/foundation/layout/LayoutWeightElement;-><init>(FZ)V

    sget-object v9, Ll0/a1;->x:Ll0/a1;

    invoke-static {v11, v9}, Landroidx/compose/foundation/layout/a;->u(Landroidx/compose/ui/Modifier;Ll0/a1;)Landroidx/compose/ui/Modifier;

    move-result-object v11

    sget-object v12, Lb2/e;->N:Lb2/k;

    move-object/from16 v22, v8

    sget-object v8, Ll0/m;->c:Ll0/g;

    move-object/from16 v23, v9

    const/16 v9, 0x30

    move/from16 v24, v1

    invoke-static {v8, v12, v14, v9}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v1

    move-object/from16 v25, v10

    iget-wide v9, v14, Lp1/q;->T:J

    invoke-static {v9, v10}, Ljava/lang/Long;->hashCode(J)I

    move-result v9

    invoke-virtual {v14}, Lp1/q;->m()Lp1/p1;

    move-result-object v10

    invoke-static {v14, v11}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v11

    invoke-virtual {v14}, Lp1/q;->i0()V

    iget-boolean v4, v14, Lp1/q;->S:Z

    if-eqz v4, :cond_c

    invoke-virtual {v14, v15}, Lp1/q;->l(Lc93/a;)V

    goto :goto_8

    :cond_c
    invoke-virtual {v14}, Lp1/q;->s0()V

    :goto_8
    invoke-static {v14, v2, v1}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v14, v6, v10}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v1, v14, Lp1/q;->S:Z

    if-nez v1, :cond_d

    invoke-virtual {v14}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-static {v1, v4}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_e

    :cond_d
    invoke-static {v9, v14, v9, v13}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_e
    invoke-static {v14, v7, v11}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const-string v1, "On"

    const/4 v4, 0x6

    invoke-static {v1, v14, v4}, Lkd1/k;->e(Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V

    const/4 v9, 0x1

    int-to-float v1, v9

    const/4 v10, 0x4

    int-to-float v10, v10

    mul-float/2addr v1, v10

    const-string v11, "I agree to the [Terms of Service](https://whoop.com/terms) and [Privacy Policy](https://whoop.com/privacy)"

    move/from16 p2, v4

    move-object/from16 v4, v25

    invoke-static {v4, v1, v14, v11}, Ljh3/c;->d(Lb2/t;FLp1/q;Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v11

    new-instance v26, Lsy0/k$a;

    move-object/from16 v16, v6

    sget-object v6, Lx81/d;->a:Lx81/d;

    move-object/from16 v25, v7

    sget v7, Lx81/d;->b:I

    invoke-virtual {v6, v14, v7}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v27

    move/from16 v33, v10

    invoke-virtual/range {v27 .. v27}, Ly81/i;->k0()J

    move-result-wide v9

    move/from16 v34, v1

    new-instance v1, Li2/x;

    invoke-direct {v1, v9, v10}, Li2/x;-><init>(J)V

    const/16 v31, 0xe

    const/16 v32, 0x0

    const/16 v28, 0x0

    const/16 v29, 0x0

    const/16 v30, 0x0

    move-object/from16 v27, v1

    invoke-direct/range {v26 .. v32}, Lsy0/k$a;-><init>(Li2/x;Lb91/a;Lb2/f;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface {v3}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ljava/lang/Boolean;

    invoke-virtual {v1}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v1

    invoke-virtual {v14}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v9

    if-ne v9, v5, :cond_f

    new-instance v9, Lzc1/n0;

    const/4 v10, 0x2

    invoke-direct {v9, v10, v3}, Lzc1/n0;-><init>(ILp1/c1;)V

    invoke-virtual {v14, v9}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_f
    check-cast v9, Lkotlin/jvm/functions/Function1;

    sget v3, Lcom/whoop/design/util/TextResource;->$stable:I

    sget v10, Lsy0/k$a;->f:I

    shl-int/lit8 v10, v10, 0x3

    or-int/2addr v3, v10

    shl-int/lit8 v10, v24, 0x6

    and-int/lit16 v10, v10, 0x1c00

    or-int/2addr v3, v10

    move-object/from16 v10, v16

    const/16 v16, 0x6

    const/high16 v24, 0x3f800000    # 1.0f

    const/16 v17, 0x3f0

    move-object/from16 v27, v5

    const/4 v5, 0x0

    move-object/from16 v28, v6

    move/from16 v29, v7

    const-wide/16 v6, 0x0

    move-object/from16 v30, v8

    const/4 v8, 0x0

    move-object/from16 v31, v13

    move-object v13, v9

    const/4 v9, 0x0

    move-object/from16 v32, v10

    const/4 v10, 0x0

    move-object/from16 v35, v12

    move-object/from16 v36, v15

    move v15, v3

    move v3, v1

    move-object v1, v11

    const-wide/16 v11, 0x0

    move-object/from16 v38, v2

    move-object/from16 v48, v4

    move-object/from16 v42, v23

    move-object/from16 v41, v25

    move-object/from16 v2, v26

    move-object/from16 v47, v27

    move-object/from16 v45, v28

    move/from16 v46, v29

    move-object/from16 v44, v30

    move-object/from16 v40, v31

    move-object/from16 v39, v32

    move/from16 v0, v34

    move-object/from16 v43, v35

    move-object/from16 v37, v36

    move/from16 v4, p1

    invoke-static/range {v1 .. v17}, Lsy0/j;->f(Lcom/whoop/design/util/TextResource;Lsy0/k;ZZIJLandroidx/compose/ui/Modifier;Ll0/k1;ZJLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v1, v48

    invoke-static {v0, v1}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    invoke-static {v14, v2}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    const/4 v2, 0x1

    invoke-virtual {v14, v2}, Lp1/q;->q(Z)V

    mul-float v10, v33, v33

    invoke-static {v10, v1}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    invoke-static {v14, v3}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    const/high16 v9, 0x3f800000    # 1.0f

    float-to-double v3, v9

    cmpl-double v3, v3, v18

    if-lez v3, :cond_10

    goto :goto_9

    :cond_10
    invoke-static/range {v20 .. v20}, Lm0/a;->a(Ljava/lang/String;)V

    :goto_9
    new-instance v3, Landroidx/compose/foundation/layout/LayoutWeightElement;

    cmpl-float v4, v9, v21

    if-lez v4, :cond_11

    move/from16 v9, v21

    :cond_11
    invoke-direct {v3, v9, v2}, Landroidx/compose/foundation/layout/LayoutWeightElement;-><init>(FZ)V

    move-object/from16 v4, v42

    invoke-static {v3, v4}, Landroidx/compose/foundation/layout/a;->u(Landroidx/compose/ui/Modifier;Ll0/a1;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    move-object/from16 v4, v43

    move-object/from16 v5, v44

    const/16 v6, 0x30

    invoke-static {v5, v4, v14, v6}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v4

    iget-wide v5, v14, Lp1/q;->T:J

    invoke-static {v5, v6}, Ljava/lang/Long;->hashCode(J)I

    move-result v5

    invoke-virtual {v14}, Lp1/q;->m()Lp1/p1;

    move-result-object v6

    invoke-static {v14, v3}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    invoke-virtual {v14}, Lp1/q;->i0()V

    iget-boolean v7, v14, Lp1/q;->S:Z

    if-eqz v7, :cond_12

    move-object/from16 v7, v37

    invoke-virtual {v14, v7}, Lp1/q;->l(Lc93/a;)V

    :goto_a
    move-object/from16 v7, v38

    goto :goto_b

    :cond_12
    invoke-virtual {v14}, Lp1/q;->s0()V

    goto :goto_a

    :goto_b
    invoke-static {v14, v7, v4}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    move-object/from16 v10, v39

    invoke-static {v14, v10, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v4, v14, Lp1/q;->S:Z

    if-nez v4, :cond_13

    invoke-virtual {v14}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-static {v4, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_14

    :cond_13
    move-object/from16 v4, v40

    goto :goto_d

    :cond_14
    :goto_c
    move-object/from16 v4, v41

    goto :goto_e

    :goto_d
    invoke-static {v5, v14, v5, v4}, Ld;->y(ILp1/q;ILa3/i;)V

    goto :goto_c

    :goto_e
    invoke-static {v14, v4, v3}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const-string v3, "Off"

    const/4 v4, 0x6

    invoke-static {v3, v14, v4}, Lkd1/k;->e(Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V

    const-string v3, "I consent to **Advanced Labs** processing my health data"

    invoke-static {v1, v0, v14, v3}, Ljh3/c;->d(Lb2/t;FLp1/q;Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v3

    new-instance v4, Lsy0/k$a;

    move-object/from16 v5, v45

    move/from16 v6, v46

    invoke-virtual {v5, v14, v6}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v5

    invoke-virtual {v5}, Ly81/i;->X()J

    move-result-wide v5

    new-instance v7, Li2/x;

    invoke-direct {v7, v5, v6}, Li2/x;-><init>(J)V

    const/16 v9, 0xe

    const/4 v10, 0x0

    const/4 v6, 0x0

    move-object v5, v7

    const/4 v7, 0x0

    const/4 v8, 0x0

    invoke-direct/range {v4 .. v10}, Lsy0/k$a;-><init>(Li2/x;Lb91/a;Lb2/f;ZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-interface/range {v22 .. v22}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Ljava/lang/Boolean;

    invoke-virtual {v5}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v5

    invoke-virtual {v14}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v6

    move-object/from16 v7, v47

    if-ne v6, v7, :cond_15

    new-instance v6, Lzc1/n0;

    const/4 v7, 0x3

    move-object/from16 v8, v22

    invoke-direct {v6, v7, v8}, Lzc1/n0;-><init>(ILp1/c1;)V

    invoke-virtual {v14, v6}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_15
    move-object v13, v6

    check-cast v13, Lkotlin/jvm/functions/Function1;

    const/16 v16, 0x6

    const/16 v17, 0x3f0

    move-object/from16 v48, v1

    move-object v1, v3

    move v3, v5

    const/4 v5, 0x0

    const-wide/16 v6, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const-wide/16 v11, 0x0

    move-object v2, v4

    move-object/from16 v49, v48

    move/from16 v4, p1

    invoke-static/range {v1 .. v17}, Lsy0/j;->f(Lcom/whoop/design/util/TextResource;Lsy0/k;ZZIJLandroidx/compose/ui/Modifier;Ll0/k1;ZJLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v1, v49

    invoke-static {v0, v1}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    invoke-static {v14, v0}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    const/4 v9, 0x1

    invoke-virtual {v14, v9}, Lp1/q;->q(Z)V

    invoke-virtual {v14, v9}, Lp1/q;->q(Z)V

    goto :goto_f

    :cond_16
    invoke-virtual {v14}, Lp1/q;->X()V

    :goto_f
    invoke-virtual {v14}, Lp1/q;->u()Lp1/v1;

    move-result-object v0

    if-eqz v0, :cond_17

    new-instance v1, Lzc1/m0;

    const/4 v2, 0x3

    move-object/from16 v3, p0

    move/from16 v5, p3

    invoke-direct {v1, v5, v3, v2, v4}, Lzc1/m0;-><init>(ILjava/lang/String;IZ)V

    iput-object v1, v0, Lp1/v1;->d:Lc93/m;

    :cond_17
    return-void
.end method

.method private static final w(Lp1/c1;Z)Ll83/a0;
    .locals 0

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    invoke-interface {p0, p1}, Lp1/c1;->setValue(Ljava/lang/Object;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final x(Lp1/c1;Z)Ll83/a0;
    .locals 0

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    invoke-interface {p0, p1}, Lp1/c1;->setValue(Ljava/lang/Object;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final y(Ljava/lang/String;ZILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, Lp1/x;->L(I)I

    move-result p2

    invoke-static {p0, p1, p3, p2}, Lzc1/o0;->v(Ljava/lang/String;ZLandroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final z(Ljava/lang/String;ZLandroidx/compose/runtime/Composer;I)V
    .locals 36

    move-object/from16 v0, p0

    move/from16 v4, p1

    move-object/from16 v14, p2

    check-cast v14, Lp1/q;

    const v1, -0x674cb94c

    invoke-virtual {v14, v1}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v1, p3, 0x6

    const/4 v3, 0x2

    if-nez v1, :cond_1

    invoke-virtual {v14, v0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, 0x4

    goto :goto_0

    :cond_0
    move v1, v3

    :goto_0
    or-int v1, p3, v1

    goto :goto_1

    :cond_1
    move/from16 v1, p3

    :goto_1
    and-int/lit8 v5, p3, 0x30

    if-nez v5, :cond_3

    invoke-virtual {v14, v4}, Lp1/q;->h(Z)Z

    move-result v5

    if-eqz v5, :cond_2

    const/16 v5, 0x20

    goto :goto_2

    :cond_2
    const/16 v5, 0x10

    :goto_2
    or-int/2addr v1, v5

    :cond_3
    and-int/lit8 v5, v1, 0x13

    const/16 v6, 0x12

    if-eq v5, v6, :cond_4

    const/4 v5, 0x1

    goto :goto_3

    :cond_4
    const/4 v5, 0x0

    :goto_3
    and-int/lit8 v6, v1, 0x1

    invoke-virtual {v14, v6, v5}, Lp1/q;->U(IZ)Z

    move-result v5

    if-eqz v5, :cond_10

    and-int/lit8 v5, v1, 0xe

    invoke-static {v0, v14, v5}, Lkd1/k;->c(Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V

    new-instance v5, Ly71/g;

    invoke-static {}, Lc13/a;->a()I

    move-result v6

    const/4 v8, 0x0

    invoke-direct {v5, v6, v8, v3, v8}, Ly71/g;-><init>(ILcom/whoop/design/util/TextResource;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {v14}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    sget-object v6, Lp1/l;->a:Lp1/v0;

    if-ne v3, v6, :cond_5

    sget-object v3, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-static {v3}, Lp1/x;->z(Ljava/lang/Object;)Lp1/k1;

    move-result-object v3

    invoke-virtual {v14, v3}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_5
    check-cast v3, Lp1/c1;

    invoke-virtual {v14}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v8

    if-ne v8, v6, :cond_6

    sget-object v8, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-static {v8}, Lp1/x;->z(Ljava/lang/Object;)Lp1/k1;

    move-result-object v8

    invoke-virtual {v14, v8}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_6
    check-cast v8, Lp1/c1;

    invoke-virtual {v14}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v9

    if-ne v9, v6, :cond_7

    sget-object v9, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-static {v9}, Lp1/x;->z(Ljava/lang/Object;)Lp1/k1;

    move-result-object v9

    invoke-virtual {v14, v9}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_7
    check-cast v9, Lp1/c1;

    invoke-virtual {v14}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v10

    if-ne v10, v6, :cond_8

    sget-object v10, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-static {v10}, Lp1/x;->z(Ljava/lang/Object;)Lp1/k1;

    move-result-object v10

    invoke-virtual {v14, v10}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_8
    check-cast v10, Lp1/c1;

    const/high16 v11, 0x3f800000    # 1.0f

    sget-object v12, Lb2/t;->w:Lb2/t;

    invoke-static {v11, v12}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v11

    sget-object v13, Lb2/e;->N:Lb2/k;

    sget-object v15, Ll0/m;->c:Ll0/g;

    const/16 v2, 0x30

    invoke-static {v15, v13, v14, v2}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v2

    move-object v15, v8

    iget-wide v7, v14, Lp1/q;->T:J

    invoke-static {v7, v8}, Ljava/lang/Long;->hashCode(J)I

    move-result v7

    invoke-virtual {v14}, Lp1/q;->m()Lp1/p1;

    move-result-object v8

    invoke-static {v14, v11}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v11

    sget-object v16, La3/l;->a:La3/k;

    invoke-virtual/range {v16 .. v16}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v13, La3/k;->b:La3/j;

    invoke-virtual {v14}, Lp1/q;->i0()V

    move/from16 v17, v1

    iget-boolean v1, v14, Lp1/q;->S:Z

    if-eqz v1, :cond_9

    invoke-virtual {v14, v13}, Lp1/q;->l(Lc93/a;)V

    goto :goto_4

    :cond_9
    invoke-virtual {v14}, Lp1/q;->s0()V

    :goto_4
    sget-object v1, La3/k;->g:La3/i;

    invoke-static {v14, v1, v2}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v1, La3/k;->f:La3/i;

    invoke-static {v14, v1, v8}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v1, La3/k;->j:La3/i;

    iget-boolean v2, v14, Lp1/q;->S:Z

    if-nez v2, :cond_a

    invoke-virtual {v14}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    invoke-static {v2, v8}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_b

    :cond_a
    invoke-static {v7, v14, v7, v1}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_b
    sget-object v1, La3/k;->d:La3/i;

    invoke-static {v14, v1, v11}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const-string v1, "On"

    const/4 v2, 0x6

    invoke-static {v1, v14, v2}, Lkd1/k;->e(Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V

    const/4 v13, 0x1

    int-to-float v1, v13

    const/4 v7, 0x4

    int-to-float v7, v7

    mul-float/2addr v1, v7

    const-string v8, "weightlifting"

    move v11, v1

    invoke-static {v12, v11, v14, v8}, Ljh3/c;->d(Lb2/t;FLp1/q;Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v1

    move/from16 v16, v2

    new-instance v2, Lsy0/k$b;

    invoke-static {v5}, Ly71/p;->a(Ly71/g;)Lkd1/o$a;

    move-result-object v13

    invoke-direct {v2, v13}, Lsy0/k$b;-><init>(Lkd1/o;)V

    invoke-interface {v3}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object v13

    check-cast v13, Ljava/lang/Boolean;

    invoke-virtual {v13}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v13

    move-object/from16 v18, v1

    invoke-virtual {v14}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v6, :cond_c

    new-instance v1, Lyb0/e;

    move-object/from16 v19, v2

    const/16 v2, 0x18

    invoke-direct {v1, v2, v3}, Lyb0/e;-><init>(ILp1/c1;)V

    invoke-virtual {v14, v1}, Lp1/q;->p0(Ljava/lang/Object;)V

    goto :goto_5

    :cond_c
    move-object/from16 v19, v2

    :goto_5
    check-cast v1, Lkotlin/jvm/functions/Function1;

    sget v2, Lcom/whoop/design/util/TextResource;->$stable:I

    sget v3, Lsy0/k$b;->c:I

    shl-int/lit8 v3, v3, 0x3

    or-int/2addr v2, v3

    shl-int/lit8 v3, v17, 0x6

    and-int/lit16 v3, v3, 0x1c00

    or-int/2addr v2, v3

    move/from16 v3, v16

    const/16 v16, 0x6

    const/16 v17, 0x3f0

    move-object/from16 v20, v5

    const/4 v5, 0x0

    move-object/from16 v22, v6

    move/from16 v21, v7

    const-wide/16 v6, 0x0

    move-object/from16 v23, v8

    const/4 v8, 0x0

    move-object/from16 v24, v9

    const/4 v9, 0x0

    move-object/from16 v25, v10

    const/4 v10, 0x0

    move/from16 v26, v11

    move-object/from16 v27, v12

    const-wide/16 v11, 0x0

    move v3, v13

    move-object/from16 p2, v15

    move-object/from16 v29, v22

    move-object/from16 v28, v23

    move/from16 v0, v26

    move-object/from16 v30, v27

    move-object v13, v1

    move v15, v2

    move-object/from16 v1, v18

    move-object/from16 v2, v19

    invoke-static/range {v1 .. v17}, Lsy0/j;->f(Lcom/whoop/design/util/TextResource;Lsy0/k;ZZIJLandroidx/compose/ui/Modifier;Ll0/k1;ZJLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;III)V

    const-string v1, "10:30pm"

    move-object v3, v1

    move-object/from16 v2, v30

    invoke-static {v2, v0, v14, v3}, Ljh3/c;->d(Lb2/t;FLp1/q;Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v1

    new-instance v2, Lsy0/k$b;

    invoke-static/range {v20 .. v20}, Ly71/p;->a(Ly71/g;)Lkd1/o$a;

    move-result-object v4

    invoke-direct {v2, v4}, Lsy0/k$b;-><init>(Lkd1/o;)V

    invoke-interface/range {p2 .. p2}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Ljava/lang/Boolean;

    invoke-virtual {v4}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v4

    invoke-virtual {v14}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    move-object/from16 v6, v29

    if-ne v5, v6, :cond_d

    new-instance v5, Lyb0/e;

    const/16 v7, 0x19

    move-object/from16 v8, p2

    invoke-direct {v5, v7, v8}, Lyb0/e;-><init>(ILp1/c1;)V

    invoke-virtual {v14, v5}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_d
    move-object v13, v5

    check-cast v13, Lkotlin/jvm/functions/Function1;

    const/16 v16, 0x6

    const/16 v17, 0x3f0

    const/4 v5, 0x0

    move-object/from16 v29, v6

    const-wide/16 v6, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const-wide/16 v11, 0x0

    move/from16 v26, v0

    move-object/from16 v31, v3

    move v3, v4

    move-object/from16 v32, v29

    move-object/from16 v0, v30

    move/from16 v4, p1

    invoke-static/range {v1 .. v17}, Lsy0/j;->f(Lcom/whoop/design/util/TextResource;Lsy0/k;ZZIJLandroidx/compose/ui/Modifier;Ll0/k1;ZJLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;III)V

    move/from16 v1, v21

    invoke-static {v1, v1, v0, v14}, Lih0/d0;->u(FFLb2/t;Lp1/q;)V

    const-string v1, "Off"

    const/4 v3, 0x6

    invoke-static {v1, v14, v3}, Lkd1/k;->e(Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V

    move/from16 v1, v26

    move-object/from16 v2, v28

    invoke-static {v0, v1, v14, v2}, Ljh3/c;->d(Lb2/t;FLp1/q;Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v2

    move-object v1, v2

    new-instance v2, Lsy0/k$b;

    invoke-static/range {v20 .. v20}, Ly71/p;->a(Ly71/g;)Lkd1/o$a;

    move-result-object v3

    invoke-direct {v2, v3}, Lsy0/k$b;-><init>(Lkd1/o;)V

    invoke-interface/range {v24 .. v24}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Boolean;

    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v3

    invoke-virtual {v14}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    move-object/from16 v5, v32

    if-ne v4, v5, :cond_e

    new-instance v4, Lyb0/e;

    const/16 v6, 0x1a

    move-object/from16 v9, v24

    invoke-direct {v4, v6, v9}, Lyb0/e;-><init>(ILp1/c1;)V

    invoke-virtual {v14, v4}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_e
    move-object v13, v4

    check-cast v13, Lkotlin/jvm/functions/Function1;

    const/16 v16, 0x6

    const/16 v17, 0x3f0

    move-object/from16 v29, v5

    const/4 v5, 0x0

    const-wide/16 v6, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const-wide/16 v11, 0x0

    move/from16 v4, p1

    move/from16 v33, v26

    move-object/from16 v34, v29

    invoke-static/range {v1 .. v17}, Lsy0/j;->f(Lcom/whoop/design/util/TextResource;Lsy0/k;ZZIJLandroidx/compose/ui/Modifier;Ll0/k1;ZJLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v3, v31

    move/from16 v1, v33

    invoke-static {v0, v1, v14, v3}, Ljh3/c;->d(Lb2/t;FLp1/q;Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v2

    move/from16 v26, v1

    move-object v1, v2

    new-instance v2, Lsy0/k$b;

    invoke-static/range {v20 .. v20}, Ly71/p;->a(Ly71/g;)Lkd1/o$a;

    move-result-object v3

    invoke-direct {v2, v3}, Lsy0/k$b;-><init>(Lkd1/o;)V

    invoke-interface/range {v25 .. v25}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Ljava/lang/Boolean;

    invoke-virtual {v3}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v3

    invoke-virtual {v14}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    move-object/from16 v5, v34

    if-ne v4, v5, :cond_f

    new-instance v4, Lyb0/e;

    const/16 v5, 0x1b

    move-object/from16 v10, v25

    invoke-direct {v4, v5, v10}, Lyb0/e;-><init>(ILp1/c1;)V

    invoke-virtual {v14, v4}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_f
    move-object v13, v4

    check-cast v13, Lkotlin/jvm/functions/Function1;

    const/16 v16, 0x6

    const/16 v17, 0x3f0

    const/4 v5, 0x0

    const-wide/16 v6, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const-wide/16 v11, 0x0

    move/from16 v4, p1

    move/from16 v35, v26

    invoke-static/range {v1 .. v17}, Lsy0/j;->f(Lcom/whoop/design/util/TextResource;Lsy0/k;ZZIJLandroidx/compose/ui/Modifier;Ll0/k1;ZJLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;III)V

    move/from16 v1, v35

    const/4 v13, 0x1

    invoke-static {v0, v1, v14, v13}, Lm4/a;->v(Lb2/t;FLp1/q;Z)V

    goto :goto_6

    :cond_10
    invoke-virtual {v14}, Lp1/q;->X()V

    :goto_6
    invoke-virtual {v14}, Lp1/q;->u()Lp1/v1;

    move-result-object v0

    if-eqz v0, :cond_11

    new-instance v1, Lzc1/m0;

    const/4 v2, 0x1

    move-object/from16 v3, p0

    move/from16 v5, p3

    invoke-direct {v1, v5, v3, v2, v4}, Lzc1/m0;-><init>(ILjava/lang/String;IZ)V

    iput-object v1, v0, Lp1/v1;->d:Lc93/m;

    :cond_11
    return-void
.end method
