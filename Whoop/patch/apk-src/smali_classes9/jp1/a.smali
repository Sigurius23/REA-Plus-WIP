.class public abstract Ljp1/a;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u001a-\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0014\u0008\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0007\u00a2\u0006\u0004\u0008\u0006\u0010\u0007\u00a8\u0006\u0008"
    }
    d2 = {
        "Lhp1/a;",
        "viewState",
        "Lkotlin/Function1;",
        "Lhp1/f;",
        "Ll83/a0;",
        "onViewEvent",
        "d",
        "(Lhp1/a;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V",
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
.method public static synthetic a(Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Ljp1/a;->f(Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lhp1/a;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p5}, Ljp1/a;->g(Lhp1/a;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Lhp1/f;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Ljp1/a;->e(Lhp1/f;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final d(Lhp1/a;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V
    .locals 42
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lhp1/a;",
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

    const v0, -0x3ffbdc34

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

    const/16 v13, 0x12

    if-eq v4, v13, :cond_6

    const/4 v4, 0x1

    goto :goto_5

    :cond_6
    const/4 v4, 0x0

    :goto_5
    and-int/lit8 v5, v0, 0x1

    invoke-virtual {v11, v5, v4}, Lp1/q;->U(IZ)Z

    move-result v4

    if-eqz v4, :cond_16

    sget-object v9, Lp1/l;->a:Lp1/v0;

    if-eqz v2, :cond_8

    invoke-virtual {v11}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    if-ne v2, v9, :cond_7

    new-instance v2, Ljg/c;

    const/16 v3, 0x11

    invoke-direct {v2, v3}, Ljg/c;-><init>(I)V

    invoke-virtual {v11, v2}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_7
    check-cast v2, Lkotlin/jvm/functions/Function1;

    move-object v10, v2

    goto :goto_6

    :cond_8
    move-object v10, v3

    :goto_6
    const/high16 v2, 0x3f800000    # 1.0f

    sget-object v3, Lb2/t;->w:Lb2/t;

    invoke-static {v2, v3}, Landroidx/compose/foundation/layout/d;->d(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    invoke-static {v4}, Lgb1/b0;->b0(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    invoke-static {v4}, Ll0/f;->k(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    sget-object v5, Lb2/e;->N:Lb2/k;

    sget-object v6, Ll0/m;->c:Ll0/g;

    const/16 v7, 0x30

    invoke-static {v6, v5, v11, v7}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v5

    move/from16 v16, v13

    iget-wide v12, v11, Lp1/q;->T:J

    invoke-static {v12, v13}, Ljava/lang/Long;->hashCode(J)I

    move-result v7

    invoke-virtual {v11}, Lp1/q;->m()Lp1/p1;

    move-result-object v12

    invoke-static {v11, v4}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    sget-object v13, La3/l;->a:La3/k;

    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v13, La3/k;->b:La3/j;

    invoke-virtual {v11}, Lp1/q;->i0()V

    iget-boolean v14, v11, Lp1/q;->S:Z

    if-eqz v14, :cond_9

    invoke-virtual {v11, v13}, Lp1/q;->l(Lc93/a;)V

    goto :goto_7

    :cond_9
    invoke-virtual {v11}, Lp1/q;->s0()V

    :goto_7
    sget-object v14, La3/k;->g:La3/i;

    invoke-static {v11, v14, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v5, La3/k;->f:La3/i;

    invoke-static {v11, v5, v12}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v12, La3/k;->j:La3/i;

    iget-boolean v8, v11, Lp1/q;->S:Z

    if-nez v8, :cond_a

    invoke-virtual {v11}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v8

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v15

    invoke-static {v8, v15}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_b

    :cond_a
    invoke-static {v7, v11, v7, v12}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_b
    sget-object v15, La3/k;->d:La3/i;

    invoke-static {v11, v15, v4}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    float-to-double v7, v2

    const-wide/16 v20, 0x0

    cmpl-double v4, v7, v20

    const-string v22, "invalid weight; must be greater than zero"

    if-lez v4, :cond_c

    goto :goto_8

    :cond_c
    invoke-static/range {v22 .. v22}, Lm0/a;->a(Ljava/lang/String;)V

    :goto_8
    new-instance v4, Landroidx/compose/foundation/layout/LayoutWeightElement;

    const v23, 0x7f7fffff    # Float.MAX_VALUE

    cmpl-float v7, v2, v23

    if-lez v7, :cond_d

    move/from16 v7, v23

    :goto_9
    const/4 v8, 0x1

    goto :goto_a

    :cond_d
    move v7, v2

    goto :goto_9

    :goto_a
    invoke-direct {v4, v7, v8}, Landroidx/compose/foundation/layout/LayoutWeightElement;-><init>(FZ)V

    invoke-static {v11, v4}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    move v4, v2

    invoke-virtual {v1}, Lhp1/a;->a()Lkd1/o;

    move-result-object v2

    move-object v7, v6

    sget v6, Lkd1/o;->a:I

    move-object v8, v7

    const/4 v7, 0x3

    move-object/from16 v24, v3

    const/4 v3, 0x0

    move/from16 v25, v4

    const/4 v4, 0x0

    move-object/from16 p1, v11

    move-object v11, v5

    move-object/from16 v5, p1

    move-object/from16 p1, v8

    move-object/from16 v8, v24

    invoke-static/range {v2 .. v7}, Lkd1/p;->i(Lkd1/o;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)Ln2/a;

    move-result-object v2

    move-object/from16 v24, v5

    const/16 v3, 0x32

    int-to-float v3, v3

    const/4 v4, 0x4

    int-to-float v4, v4

    mul-float/2addr v3, v4

    invoke-static {v3, v8}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    move-object v5, v10

    const/16 v10, 0x1b0

    move-object v6, v11

    const/16 v11, 0x78

    move v7, v4

    move-object v4, v3

    const/4 v3, 0x0

    move-object/from16 v18, v5

    const/4 v5, 0x0

    move-object/from16 v26, v6

    const/4 v6, 0x0

    move/from16 v27, v7

    const/4 v7, 0x0

    move-object/from16 v28, v8

    const/4 v8, 0x0

    move-object/from16 v1, v18

    move-object/from16 v18, v12

    move-object/from16 v12, v28

    move-object/from16 v28, v1

    move-object/from16 v1, p1

    move/from16 v29, v0

    move-object/from16 v31, v9

    move-object/from16 p1, v15

    move-object/from16 v9, v24

    move/from16 v15, v25

    move-object/from16 v0, v26

    move/from16 v30, v27

    invoke-static/range {v2 .. v11}, Lpf/c;->c(Ln2/a;Ljava/lang/String;Landroidx/compose/ui/Modifier;Lb2/h;Ly2/k;FLi2/y;Landroidx/compose/runtime/Composer;II)V

    move-object v11, v9

    float-to-double v2, v15

    cmpl-double v2, v2, v20

    if-lez v2, :cond_e

    goto :goto_b

    :cond_e
    invoke-static/range {v22 .. v22}, Lm0/a;->a(Ljava/lang/String;)V

    :goto_b
    new-instance v2, Landroidx/compose/foundation/layout/LayoutWeightElement;

    cmpl-float v3, v15, v23

    if-lez v3, :cond_f

    move/from16 v3, v23

    :goto_c
    const/4 v8, 0x1

    goto :goto_d

    :cond_f
    move v3, v15

    goto :goto_c

    :goto_d
    invoke-direct {v2, v3, v8}, Landroidx/compose/foundation/layout/LayoutWeightElement;-><init>(FZ)V

    invoke-static {v11, v2}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    const/4 v2, 0x3

    int-to-float v2, v2

    const/16 v3, 0x8

    int-to-float v3, v3

    mul-float/2addr v2, v3

    invoke-static {v2, v12}, Landroidx/compose/foundation/layout/a;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    sget-object v3, Lb2/e;->M:Lb2/k;

    const/4 v4, 0x0

    invoke-static {v1, v3, v11, v4}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v1

    iget-wide v5, v11, Lp1/q;->T:J

    invoke-static {v5, v6}, Ljava/lang/Long;->hashCode(J)I

    move-result v3

    invoke-virtual {v11}, Lp1/q;->m()Lp1/p1;

    move-result-object v5

    invoke-static {v11, v2}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    invoke-virtual {v11}, Lp1/q;->i0()V

    iget-boolean v6, v11, Lp1/q;->S:Z

    if-eqz v6, :cond_10

    invoke-virtual {v11, v13}, Lp1/q;->l(Lc93/a;)V

    goto :goto_e

    :cond_10
    invoke-virtual {v11}, Lp1/q;->s0()V

    :goto_e
    invoke-static {v11, v14, v1}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v11, v0, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v0, v11, Lp1/q;->S:Z

    if-nez v0, :cond_11

    invoke-virtual {v11}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v0

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_12

    :cond_11
    move-object/from16 v0, v18

    goto :goto_10

    :cond_12
    :goto_f
    move-object/from16 v0, p1

    goto :goto_11

    :goto_10
    invoke-static {v3, v11, v3, v0}, Ld;->y(ILp1/q;ILa3/i;)V

    goto :goto_f

    :goto_11
    invoke-static {v11, v0, v2}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual/range {p0 .. p0}, Lhp1/a;->d()Lcom/whoop/design/util/TextResource;

    move-result-object v0

    sget v1, Lcom/whoop/design/util/TextResource;->$stable:I

    invoke-static {v0, v11, v1}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v2

    sget-object v0, Lx81/d;->a:Lx81/d;

    sget v3, Lx81/d;->b:I

    invoke-virtual {v0, v11, v3}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v5

    invoke-virtual {v5}, Lb91/d;->O()Lb91/a;

    move-result-object v22

    invoke-virtual {v0, v11, v3}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v5

    invoke-virtual {v5}, Ly81/i;->y()J

    move-result-wide v5

    sget v7, Lb91/a;->d:I

    shl-int/lit8 v26, v7, 0x12

    const v27, 0x2fffa

    move v7, v3

    const/4 v3, 0x0

    move-wide v9, v5

    move v5, v7

    const-wide/16 v6, 0x0

    move/from16 v19, v8

    const/4 v8, 0x0

    move/from16 v17, v4

    move-wide/from16 v40, v9

    move v10, v5

    move-wide/from16 v4, v40

    const/4 v9, 0x0

    move v13, v10

    const/4 v10, 0x0

    move-object/from16 v24, v11

    move-object v14, v12

    const-wide/16 v11, 0x0

    move/from16 v16, v13

    const/4 v13, 0x0

    move-object/from16 v18, v14

    const/4 v14, 0x0

    move/from16 v25, v15

    move/from16 v20, v16

    const-wide/16 v15, 0x0

    move/from16 v21, v17

    const/16 v17, 0x0

    move-object/from16 v23, v18

    const/16 v18, 0x0

    move/from16 v32, v19

    const/16 v19, 0x0

    move/from16 v33, v20

    const/16 v20, 0x0

    move/from16 v34, v21

    const/16 v21, 0x0

    move-object/from16 v35, v23

    const/16 v23, 0x0

    move/from16 v36, v25

    const/16 v25, 0x0

    move-object/from16 p1, v0

    move/from16 v37, v33

    move-object/from16 v0, v35

    invoke-static/range {v2 .. v27}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v11, v24

    move/from16 v27, v30

    mul-float v4, v27, v27

    invoke-static {v4, v0}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    invoke-static {v11, v2}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    invoke-virtual/range {p0 .. p0}, Lhp1/a;->c()Lcom/whoop/design/util/TextResource;

    move-result-object v2

    invoke-static {v2, v11, v1}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v2

    move-object/from16 v3, p1

    move/from16 v4, v37

    invoke-virtual {v3, v11, v4}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v5

    invoke-virtual {v5}, Lb91/d;->a()Lb91/a;

    move-result-object v22

    invoke-virtual {v3, v11, v4}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v5

    invoke-virtual {v5}, Ly81/i;->y()J

    move-result-wide v5

    const v27, 0x2fffa

    move-object v7, v3

    const/4 v3, 0x0

    move-wide v8, v5

    move-object v5, v7

    const-wide/16 v6, 0x0

    move v13, v4

    move-wide/from16 v40, v8

    move-object v9, v5

    move-wide/from16 v4, v40

    const/4 v8, 0x0

    move-object v10, v9

    const/4 v9, 0x0

    move-object v12, v10

    const/4 v10, 0x0

    move-object v14, v12

    const-wide/16 v11, 0x0

    move/from16 v16, v13

    const/4 v13, 0x0

    move-object v15, v14

    const/4 v14, 0x0

    move-object/from16 v17, v15

    move/from16 v33, v16

    const-wide/16 v15, 0x0

    move-object/from16 v18, v17

    const/16 v17, 0x0

    move-object/from16 v19, v18

    const/16 v18, 0x0

    move-object/from16 v20, v19

    const/16 v19, 0x0

    move-object/from16 v21, v20

    const/16 v20, 0x0

    move-object/from16 v23, v21

    const/16 v21, 0x0

    move-object/from16 v32, v23

    const/16 v23, 0x0

    move/from16 p1, v1

    move/from16 v1, v30

    move-object/from16 v38, v32

    move/from16 v39, v33

    invoke-static/range {v2 .. v27}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v11, v24

    const/16 v2, 0xb

    int-to-float v2, v2

    invoke-static {v2, v1, v0, v11}, Lih0/d0;->u(FFLb2/t;Lp1/q;)V

    sget-object v3, Lny0/v;->TextLarge:Lny0/v;

    invoke-virtual/range {p0 .. p0}, Lhp1/a;->b()Lcom/whoop/design/util/TextResource;

    move-result-object v1

    move/from16 v2, p1

    invoke-static {v1, v11, v2}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v4

    move-object/from16 v5, v38

    move/from16 v13, v39

    invoke-virtual {v5, v11, v13}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v1

    invoke-virtual {v1}, Ly81/i;->i0()J

    move-result-wide v6

    const/high16 v15, 0x3f800000    # 1.0f

    invoke-static {v15, v0}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    and-int/lit8 v0, v29, 0x70

    const/16 v1, 0x20

    if-ne v0, v1, :cond_13

    const/4 v14, 0x1

    goto :goto_12

    :cond_13
    move/from16 v14, v34

    :goto_12
    invoke-virtual {v11}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v0

    if-nez v14, :cond_15

    move-object/from16 v1, v31

    if-ne v0, v1, :cond_14

    goto :goto_13

    :cond_14
    move-object/from16 v14, v28

    goto :goto_14

    :cond_15
    :goto_13
    new-instance v0, Lif0/b;

    const/16 v1, 0x19

    move-object/from16 v14, v28

    invoke-direct {v0, v14, v1}, Lif0/b;-><init>(Lkotlin/jvm/functions/Function1;I)V

    invoke-virtual {v11, v0}, Lp1/q;->p0(Ljava/lang/Object;)V

    :goto_14
    move-object v10, v0

    check-cast v10, Lc93/a;

    const/16 v12, 0x36

    const/16 v13, 0x68

    const/4 v5, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    invoke-static/range {v2 .. v13}, Lny0/u;->h(Landroidx/compose/ui/Modifier;Lny0/v;Ljava/lang/String;ZJLi2/t;ZLc93/a;Landroidx/compose/runtime/Composer;II)V

    const/4 v8, 0x1

    invoke-virtual {v11, v8}, Lp1/q;->q(Z)V

    invoke-virtual {v11, v8}, Lp1/q;->q(Z)V

    move-object v3, v14

    goto :goto_15

    :cond_16
    invoke-virtual {v11}, Lp1/q;->X()V

    :goto_15
    invoke-virtual {v11}, Lp1/q;->u()Lp1/v1;

    move-result-object v6

    if-eqz v6, :cond_17

    new-instance v0, Lio2/k0;

    const/4 v5, 0x5

    move-object/from16 v1, p0

    move/from16 v2, p3

    move/from16 v4, p4

    invoke-direct/range {v0 .. v5}, Lio2/k0;-><init>(Ljava/lang/Object;ILjava/lang/Object;II)V

    iput-object v0, v6, Lp1/v1;->d:Lc93/m;

    :cond_17
    return-void
.end method

.method private static final e(Lhp1/f;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final f(Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 1

    sget-object v0, Lhp1/f$h;->a:Lhp1/f$h;

    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final g(Lhp1/a;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, Lp1/x;->L(I)I

    move-result p2

    invoke-static {p0, p1, p4, p2, p3}, Ljp1/a;->d(Lhp1/a;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method
