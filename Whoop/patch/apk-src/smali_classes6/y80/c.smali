.class public abstract Ly80/c;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u001a-\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0014\u0008\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0001\u00a2\u0006\u0004\u0008\u0006\u0010\u0007\u00a8\u0006\u0008"
    }
    d2 = {
        "Ly80/d;",
        "viewState",
        "Lkotlin/Function1;",
        "",
        "Ll83/a0;",
        "onViewEvent",
        "e",
        "(Ly80/d;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V",
        "activation_release"
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
.method public static synthetic a(Lcom/whoop/design/util/TextResource;Ll0/s1;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Ly80/c;->h(Lcom/whoop/design/util/TextResource;Ll0/s1;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Ljava/lang/Object;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Ly80/c;->f(Ljava/lang/Object;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Ly80/d;Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Ly80/c;->g(Ly80/d;Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Ly80/d;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p5}, Ly80/c;->i(Ly80/d;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final e(Ly80/d;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V
    .locals 43
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ly80/d;",
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

    const v0, 0x385061d7

    invoke-virtual {v11, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, p3, 0x6

    if-nez v0, :cond_1

    invoke-virtual {v11, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

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

    invoke-virtual {v11, v3}, Lp1/q;->i(Ljava/lang/Object;)Z

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

    const/16 v15, 0x12

    const/4 v12, 0x0

    if-eq v4, v15, :cond_5

    const/4 v4, 0x1

    goto :goto_4

    :cond_5
    move v4, v12

    :goto_4
    and-int/lit8 v5, v0, 0x1

    invoke-virtual {v11, v5, v4}, Lp1/q;->U(IZ)Z

    move-result v4

    if-eqz v4, :cond_19

    sget-object v8, Lp1/l;->a:Lp1/v0;

    if-eqz v2, :cond_7

    invoke-virtual {v11}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v8, :cond_6

    new-instance v2, Ly41/b;

    const/16 v3, 0xc

    invoke-direct {v2, v3}, Ly41/b;-><init>(I)V

    invoke-virtual {v11, v2}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_6
    check-cast v2, Lkotlin/jvm/functions/Function1;

    move-object v9, v2

    goto :goto_5

    :cond_7
    move-object v9, v3

    :goto_5
    const/high16 v10, 0x3f800000    # 1.0f

    sget-object v2, Lb2/t;->w:Lb2/t;

    invoke-static {v10, v2}, Landroidx/compose/foundation/layout/d;->d(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    sget-object v4, Lb2/e;->w:Lb2/m;

    invoke-static {v4, v12}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v4

    iget-wide v5, v11, Lp1/q;->T:J

    invoke-static {v5, v6}, Ljava/lang/Long;->hashCode(J)I

    move-result v5

    invoke-virtual {v11}, Lp1/q;->m()Lp1/p1;

    move-result-object v6

    invoke-static {v11, v3}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    sget-object v7, La3/l;->a:La3/k;

    invoke-virtual {v7}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v7, La3/k;->b:La3/j;

    invoke-virtual {v11}, Lp1/q;->i0()V

    iget-boolean v14, v11, Lp1/q;->S:Z

    if-eqz v14, :cond_8

    invoke-virtual {v11, v7}, Lp1/q;->l(Lc93/a;)V

    goto :goto_6

    :cond_8
    invoke-virtual {v11}, Lp1/q;->s0()V

    :goto_6
    sget-object v14, La3/k;->g:La3/i;

    invoke-static {v11, v14, v4}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v4, La3/k;->f:La3/i;

    invoke-static {v11, v4, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v6, La3/k;->j:La3/i;

    move/from16 v16, v15

    iget-boolean v15, v11, Lp1/q;->S:Z

    if-nez v15, :cond_9

    invoke-virtual {v11}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v15

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v13

    invoke-static {v15, v13}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v13

    if-nez v13, :cond_a

    :cond_9
    invoke-static {v5, v11, v5, v6}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_a
    sget-object v5, La3/k;->d:La3/i;

    invoke-static {v11, v5, v3}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v10, v2}, Landroidx/compose/foundation/layout/d;->d(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    sget-object v13, Ll0/m;->d:Ll0/g;

    sget-object v15, Lb2/e;->M:Lb2/k;

    const/4 v10, 0x6

    invoke-static {v13, v15, v11, v10}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v10

    iget-wide v12, v11, Lp1/q;->T:J

    invoke-static {v12, v13}, Ljava/lang/Long;->hashCode(J)I

    move-result v12

    invoke-virtual {v11}, Lp1/q;->m()Lp1/p1;

    move-result-object v13

    invoke-static {v11, v3}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    invoke-virtual {v11}, Lp1/q;->i0()V

    iget-boolean v15, v11, Lp1/q;->S:Z

    if-eqz v15, :cond_b

    invoke-virtual {v11, v7}, Lp1/q;->l(Lc93/a;)V

    goto :goto_7

    :cond_b
    invoke-virtual {v11}, Lp1/q;->s0()V

    :goto_7
    invoke-static {v11, v14, v10}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v11, v4, v13}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v4, v11, Lp1/q;->S:Z

    if-nez v4, :cond_c

    invoke-virtual {v11}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-static {v4, v7}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_d

    :cond_c
    invoke-static {v12, v11, v12, v6}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_d
    invoke-static {v11, v5, v3}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual {v1}, Ly80/d;->b()Lkd1/o;

    move-result-object v3

    const v12, 0x7f7fffff    # Float.MAX_VALUE

    const-string v13, "invalid weight; must be greater than zero"

    const-wide/16 v19, 0x0

    sget-object v10, Ly2/j;->b:Ly2/b1;

    if-nez v3, :cond_e

    const v3, 0x16b763c1

    invoke-virtual {v11, v3}, Lp1/q;->e0(I)V

    const/4 v15, 0x0

    invoke-virtual {v11, v15}, Lp1/q;->q(Z)V

    const/4 v3, 0x0

    move-object v15, v2

    move-object/from16 v29, v8

    move-object/from16 v28, v9

    move-object v6, v10

    const/4 v2, 0x0

    const/high16 v14, 0x3f800000    # 1.0f

    goto :goto_b

    :cond_e
    const v4, 0x16b763c2

    invoke-virtual {v11, v4}, Lp1/q;->e0(I)V

    const/high16 v14, 0x3f800000    # 1.0f

    invoke-static {v14, v2}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    float-to-double v5, v14

    cmpl-double v5, v5, v19

    if-lez v5, :cond_f

    goto :goto_8

    :cond_f
    invoke-static {v13}, Lm0/a;->a(Ljava/lang/String;)V

    :goto_8
    new-instance v5, Landroidx/compose/foundation/layout/LayoutWeightElement;

    cmpl-float v6, v14, v12

    if-lez v6, :cond_10

    move v6, v12

    :goto_9
    const/4 v7, 0x1

    goto :goto_a

    :cond_10
    move v6, v14

    goto :goto_9

    :goto_a
    invoke-direct {v5, v6, v7}, Landroidx/compose/foundation/layout/LayoutWeightElement;-><init>(FZ)V

    invoke-interface {v4, v5}, Landroidx/compose/ui/Modifier;->e(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v18

    sget v6, Lkd1/o;->a:I

    const/4 v7, 0x3

    move-object v4, v2

    move-object v2, v3

    const/4 v3, 0x0

    move-object v5, v4

    const/4 v4, 0x0

    move-object/from16 v41, v11

    move-object v11, v5

    move-object/from16 v5, v41

    invoke-static/range {v2 .. v7}, Lkd1/p;->i(Lkd1/o;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)Ln2/a;

    move-result-object v2

    move-object/from16 v24, v5

    move-object v6, v10

    const/16 v10, 0x6030

    move-object v4, v11

    const/16 v11, 0x68

    const/4 v5, 0x0

    const/4 v7, 0x0

    move-object/from16 v21, v8

    const/4 v8, 0x0

    move-object v15, v4

    move-object/from16 v28, v9

    move-object/from16 v4, v18

    move-object/from16 v29, v21

    move-object/from16 v9, v24

    invoke-static/range {v2 .. v11}, Lpf/c;->c(Ln2/a;Ljava/lang/String;Landroidx/compose/ui/Modifier;Lb2/h;Ly2/k;FLi2/y;Landroidx/compose/runtime/Composer;II)V

    move-object v11, v9

    const/4 v2, 0x0

    invoke-virtual {v11, v2}, Lp1/q;->q(Z)V

    sget-object v3, Ll83/a0;->a:Ll83/a0;

    :goto_b
    if-nez v3, :cond_14

    const v3, 0x16bcbcd8

    invoke-virtual {v11, v3}, Lp1/q;->e0(I)V

    invoke-virtual {v1}, Ly80/d;->c()Lv41/r0;

    move-result-object v4

    if-nez v4, :cond_11

    const v3, 0x16bcbcd7

    invoke-virtual {v11, v3}, Lp1/q;->e0(I)V

    invoke-virtual {v11, v2}, Lp1/q;->q(Z)V

    move v14, v2

    goto :goto_f

    :cond_11
    invoke-virtual {v11, v3}, Lp1/q;->e0(I)V

    invoke-static {v14, v15}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    float-to-double v7, v14

    cmpl-double v5, v7, v19

    if-lez v5, :cond_12

    goto :goto_c

    :cond_12
    invoke-static {v13}, Lm0/a;->a(Ljava/lang/String;)V

    :goto_c
    new-instance v5, Landroidx/compose/foundation/layout/LayoutWeightElement;

    cmpl-float v7, v14, v12

    if-lez v7, :cond_13

    move v10, v12

    :goto_d
    const/4 v7, 0x1

    goto :goto_e

    :cond_13
    move v10, v14

    goto :goto_d

    :goto_e
    invoke-direct {v5, v10, v7}, Landroidx/compose/foundation/layout/LayoutWeightElement;-><init>(FZ)V

    invoke-interface {v3, v5}, Landroidx/compose/ui/Modifier;->e(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    const/high16 v12, 0xc00000

    const/16 v13, 0x17c

    move/from16 v18, v2

    move-object v2, v3

    move-object v3, v4

    const/4 v4, 0x0

    const/4 v5, 0x0

    move-object v9, v6

    const/4 v6, 0x0

    move/from16 v17, v7

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v10, 0x0

    move/from16 v14, v18

    invoke-static/range {v2 .. v13}, Lv41/p;->h(Landroidx/compose/ui/Modifier;Lv41/r0;ZFILc93/a;Lkotlin/jvm/functions/Function1;Ly2/k;Ljava/lang/Float;Landroidx/compose/runtime/Composer;II)V

    invoke-virtual {v11, v14}, Lp1/q;->q(Z)V

    :goto_f
    invoke-virtual {v11, v14}, Lp1/q;->q(Z)V

    goto :goto_10

    :cond_14
    move v14, v2

    const v2, -0x3912dca2

    invoke-virtual {v11, v2}, Lp1/q;->e0(I)V

    invoke-virtual {v11, v14}, Lp1/q;->q(Z)V

    :goto_10
    const-wide/high16 v2, 0x4004000000000000L    # 2.5

    double-to-float v2, v2

    const/16 v3, 0x8

    int-to-float v8, v3

    mul-float v3, v2, v8

    const/4 v6, 0x0

    const/16 v7, 0xa

    const/4 v4, 0x0

    move v5, v3

    move-object v2, v15

    invoke-static/range {v2 .. v7}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v4

    move/from16 v31, v3

    invoke-virtual {v1}, Ly80/d;->g()Lcom/whoop/design/util/TextResource;

    move-result-object v3

    sget v5, Lcom/whoop/design/util/TextResource;->$stable:I

    invoke-static {v3, v11, v5}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v3

    sget-object v6, Lx81/d;->a:Lx81/d;

    sget v7, Lx81/d;->b:I

    invoke-virtual {v6, v11, v7}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v9

    invoke-virtual {v9}, Lb91/d;->O()Lb91/a;

    move-result-object v22

    invoke-virtual {v6, v11, v7}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v9

    invoke-virtual {v9}, Ly81/i;->y()J

    move-result-wide v9

    sget v12, Lb91/a;->d:I

    shl-int/lit8 v26, v12, 0x12

    const v27, 0x2fff8

    move-object v12, v6

    move v13, v7

    const-wide/16 v6, 0x0

    move v15, v8

    const/4 v8, 0x0

    move-object/from16 v16, v2

    move-object v2, v3

    move-object v3, v4

    move-wide/from16 v41, v9

    move v10, v5

    move-wide/from16 v4, v41

    const/4 v9, 0x0

    move/from16 v17, v10

    const/4 v10, 0x0

    move-object/from16 v24, v11

    move-object/from16 v18, v12

    const-wide/16 v11, 0x0

    move/from16 v19, v13

    const/4 v13, 0x0

    move/from16 v20, v14

    const/4 v14, 0x0

    move/from16 v21, v15

    move-object/from16 v23, v16

    const-wide/16 v15, 0x0

    move/from16 v25, v17

    const/16 v17, 0x0

    move-object/from16 v32, v18

    const/16 v18, 0x0

    move/from16 v33, v19

    const/16 v19, 0x0

    move/from16 v34, v20

    const/16 v20, 0x0

    move/from16 v35, v21

    const/16 v21, 0x0

    move-object/from16 v36, v23

    const/16 v23, 0x0

    move/from16 v37, v25

    const/16 v25, 0x30

    move/from16 v38, v0

    move-object/from16 v39, v32

    move/from16 v40, v33

    move/from16 v0, v35

    move-object/from16 v1, v36

    invoke-static/range {v2 .. v27}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v11, v24

    const/4 v8, 0x1

    int-to-float v2, v8

    invoke-static {v2, v0, v1, v11}, Ld;->w(FFLb2/t;Lp1/q;)V

    const/4 v6, 0x0

    const/16 v7, 0xa

    const/4 v4, 0x0

    move/from16 v5, v31

    move-object v2, v1

    move/from16 v3, v31

    invoke-static/range {v2 .. v7}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v1

    move-object/from16 v36, v2

    invoke-virtual/range {p0 .. p0}, Ly80/d;->f()Lcom/whoop/design/util/TextResource;

    move-result-object v2

    move/from16 v10, v37

    invoke-static {v2, v11, v10}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v2

    move-object/from16 v12, v39

    move/from16 v13, v40

    invoke-virtual {v12, v11, v13}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v3

    invoke-virtual {v3}, Lb91/d;->a()Lb91/a;

    move-result-object v22

    invoke-virtual {v12, v11, v13}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v3

    invoke-virtual {v3}, Ly81/i;->c1()J

    move-result-wide v4

    const-wide/16 v6, 0x0

    move/from16 v17, v8

    const/4 v8, 0x0

    const/4 v10, 0x0

    const-wide/16 v11, 0x0

    const/4 v13, 0x0

    move/from16 v30, v17

    const/16 v17, 0x0

    move-object v3, v1

    move/from16 v1, v30

    invoke-static/range {v2 .. v27}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v11, v24

    invoke-virtual/range {p0 .. p0}, Ly80/d;->a()Lcom/whoop/design/util/TextResource;

    move-result-object v8

    if-nez v8, :cond_15

    const v2, 0x16cbe433

    invoke-virtual {v11, v2}, Lp1/q;->e0(I)V

    const/4 v15, 0x0

    invoke-virtual {v11, v15}, Lp1/q;->q(Z)V

    move-object/from16 v14, p0

    move-object/from16 v13, v36

    goto/16 :goto_14

    :cond_15
    const/4 v15, 0x0

    const v2, 0x16cbe434

    invoke-virtual {v11, v2}, Lp1/q;->e0(I)V

    const/4 v6, 0x0

    const/16 v7, 0xa

    const/4 v4, 0x0

    move/from16 v5, v31

    move/from16 v3, v31

    move-object/from16 v2, v36

    invoke-static/range {v2 .. v7}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v3

    move-object v13, v2

    const/4 v2, 0x3

    invoke-static {v4, v4, v2}, Landroidx/compose/foundation/layout/a;->a(FFI)Ll0/l1;

    move-result-object v2

    move-object/from16 v14, p0

    invoke-virtual {v11, v14}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v4

    and-int/lit8 v5, v38, 0x70

    const/16 v6, 0x20

    if-ne v5, v6, :cond_16

    move v12, v1

    goto :goto_11

    :cond_16
    move v12, v15

    :goto_11
    or-int/2addr v4, v12

    invoke-virtual {v11}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    if-nez v4, :cond_18

    move-object/from16 v4, v29

    if-ne v5, v4, :cond_17

    goto :goto_12

    :cond_17
    move-object/from16 v6, v28

    goto :goto_13

    :cond_18
    :goto_12
    new-instance v5, Lwr0/r;

    const/16 v4, 0x11

    move-object/from16 v6, v28

    invoke-direct {v5, v4, v14, v6}, Lwr0/r;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v11, v5}, Lp1/q;->p0(Ljava/lang/Object;)V

    :goto_13
    check-cast v5, Lc93/a;

    new-instance v4, Lby1/c;

    const/4 v7, 0x5

    invoke-direct {v4, v8, v7}, Lby1/c;-><init>(Lcom/whoop/design/util/TextResource;I)V

    const v7, 0x2d2cd279

    invoke-static {v7, v11, v4}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v9

    move-object/from16 v24, v11

    const v11, 0x36000030

    const/16 v12, 0xfc

    const/4 v4, 0x0

    move-object v8, v2

    move-object v2, v5

    const/4 v5, 0x0

    move-object/from16 v28, v6

    const/4 v6, 0x0

    const/4 v7, 0x0

    move-object/from16 v10, v24

    invoke-static/range {v2 .. v12}, Ldt/b;->d(Lc93/a;Landroidx/compose/ui/Modifier;ZLi2/a1;Lf0/t;Lg1/m1;Ll0/l1;Lx1/b;Landroidx/compose/runtime/Composer;II)V

    move-object v11, v10

    invoke-virtual {v11, v15}, Lp1/q;->q(Z)V

    :goto_14
    const/16 v2, 0xd

    int-to-float v2, v2

    invoke-static {v2, v0, v13, v11, v1}, Lm4/a;->u(FFLb2/t;Lp1/q;Z)V

    invoke-virtual {v11, v1}, Lp1/q;->q(Z)V

    move-object/from16 v3, v28

    goto :goto_15

    :cond_19
    move-object v14, v1

    invoke-virtual {v11}, Lp1/q;->X()V

    :goto_15
    invoke-virtual {v11}, Lp1/q;->u()Lp1/v1;

    move-result-object v6

    if-eqz v6, :cond_1a

    new-instance v0, Lwq1/b;

    const/16 v5, 0x13

    move/from16 v2, p3

    move/from16 v4, p4

    move-object v1, v14

    invoke-direct/range {v0 .. v5}, Lwq1/b;-><init>(Ljava/lang/Object;ILjava/lang/Object;II)V

    iput-object v0, v6, Lp1/v1;->d:Lc93/m;

    :cond_1a
    return-void
.end method

.method private static final f(Ljava/lang/Object;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final g(Ly80/d;Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 1

    invoke-virtual {p0}, Ly80/d;->e()Lcom/whoop/navigation/e;

    move-result-object p0

    if-eqz p0, :cond_0

    new-instance v0, Ll80/o$a;

    invoke-direct {v0, p0}, Ll80/o$a;-><init>(Lcom/whoop/navigation/e;)V

    invoke-interface {p1, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final h(Lcom/whoop/design/util/TextResource;Ll0/s1;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 27

    const-string v0, "$this$TextButton"

    move-object/from16 v1, p1

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    and-int/lit8 v0, p3, 0x11

    const/16 v1, 0x10

    const/4 v2, 0x1

    if-eq v0, v1, :cond_0

    move v0, v2

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    and-int/lit8 v1, p3, 0x1

    move-object/from16 v2, p2

    check-cast v2, Lp1/q;

    invoke-virtual {v2, v1, v0}, Lp1/q;->U(IZ)Z

    move-result v0

    if-eqz v0, :cond_1

    sget v0, Lcom/whoop/design/util/TextResource;->$stable:I

    move-object/from16 v1, p0

    invoke-static {v1, v2, v0}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v0

    sget-object v1, Lx81/d;->a:Lx81/d;

    sget v3, Lx81/d;->b:I

    invoke-virtual {v1, v2, v3}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v1

    invoke-virtual {v1}, Lb91/d;->k()Lb91/a;

    move-result-object v1

    invoke-virtual {v1}, Lb91/a;->d()Ll3/v0;

    move-result-object v3

    sget-object v4, Li2/t;->b:Li2/s;

    const-wide v5, 0xff0093e7L

    invoke-static {v5, v6}, Li2/w0;->e(J)J

    move-result-wide v5

    new-instance v1, Li2/x;

    invoke-direct {v1, v5, v6}, Li2/x;-><init>(J)V

    const-wide v5, 0xff4c9bd9L

    invoke-static {v5, v6}, Li2/w0;->e(J)J

    move-result-wide v5

    new-instance v7, Li2/x;

    invoke-direct {v7, v5, v6}, Li2/x;-><init>(J)V

    const-wide v5, 0xff66bcffL

    invoke-static {v5, v6}, Li2/w0;->e(J)J

    move-result-wide v5

    new-instance v8, Li2/x;

    invoke-direct {v8, v5, v6}, Li2/x;-><init>(J)V

    filled-new-array {v1, v7, v8}, [Li2/x;

    move-result-object v1

    invoke-static {v1}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v5

    const-wide/16 v8, 0x0

    const/16 v10, 0xe

    const-wide/16 v6, 0x0

    invoke-static/range {v4 .. v10}, Li2/s;->d(Li2/s;Ljava/util/List;JJI)Li2/k0;

    move-result-object v4

    const-wide/16 v9, 0x0

    const v11, 0x1fffffe

    const-wide/16 v5, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    invoke-static/range {v3 .. v11}, Ll3/v0;->a(Ll3/v0;Li2/t;JLp3/r;Lp3/i;JI)Ll3/v0;

    move-result-object v22

    const/16 v25, 0x0

    const v26, 0xfffe

    const/4 v3, 0x0

    const-wide/16 v4, 0x0

    const-wide/16 v6, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const-wide/16 v11, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const-wide/16 v15, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v24, 0x0

    move-object/from16 v23, v2

    move-object v2, v0

    invoke-static/range {v2 .. v26}, Lg1/f9;->b(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Ll3/v0;Landroidx/compose/runtime/Composer;III)V

    goto :goto_1

    :cond_1
    move-object/from16 v23, v2

    invoke-virtual/range {v23 .. v23}, Lp1/q;->X()V

    :goto_1
    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method

.method private static final i(Ly80/d;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, Lp1/x;->L(I)I

    move-result p2

    invoke-static {p0, p1, p4, p2, p3}, Ly80/c;->e(Ly80/d;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method
