.class public abstract Lv41/j;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u00006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0002\u0008\u0002\u001aW\u0010\u000e\u001a\u00020\u000c2\u0008\u0008\u0002\u0010\u0001\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u000c\u0010\t\u001a\u0008\u0012\u0004\u0012\u00020\u00080\u00072\u0014\u0008\u0002\u0010\r\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u000c0\nH\u0007\u00a2\u0006\u0004\u0008\u000e\u0010\u000f\u00a8\u0006\u0012\u00b2\u0006\u000e\u0010\u0011\u001a\u00020\u00108\n@\nX\u008a\u008e\u0002"
    }
    d2 = {
        "Landroidx/compose/ui/Modifier;",
        "modifier",
        "Ll0/k1;",
        "horizontalPadding",
        "Lcom/whoop/design/util/TextResource;",
        "headline",
        "subHeadline",
        "",
        "Lc41/w2;",
        "listOfItems",
        "Lkotlin/Function1;",
        "",
        "Ll83/a0;",
        "onKeyMetricClicked",
        "d",
        "(Landroidx/compose/ui/Modifier;Ll0/k1;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/util/List;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V",
        "",
        "minHeight",
        "design_release"
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
.method public static synthetic a(Ljava/util/List;Lkotlin/jvm/functions/Function1;Lp1/c1;Ln0/q;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lv41/j;->h(Ljava/util/List;Lkotlin/jvm/functions/Function1;Lp1/c1;Ln0/q;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Landroidx/compose/ui/Modifier;Ll0/k1;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/util/List;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p9}, Lv41/j;->i(Landroidx/compose/ui/Modifier;Ll0/k1;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/util/List;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Ljava/lang/Object;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lv41/j;->e(Ljava/lang/Object;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final d(Landroidx/compose/ui/Modifier;Ll0/k1;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/util/List;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V
    .locals 45
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/ui/Modifier;",
            "Ll0/k1;",
            "Lcom/whoop/design/util/TextResource;",
            "Lcom/whoop/design/util/TextResource;",
            "Ljava/util/List<",
            "Lc41/w2;",
            ">;",
            "Lkotlin/jvm/functions/Function1;",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    move-object/from16 v3, p2

    move-object/from16 v4, p3

    move-object/from16 v5, p4

    move/from16 v7, p7

    const-string v0, "headline"

    invoke-static {v3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "subHeadline"

    invoke-static {v4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "listOfItems"

    invoke-static {v5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v0, p6

    check-cast v0, Lp1/q;

    const v1, 0xc67f760

    invoke-virtual {v0, v1}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v1, p8, 0x1

    const/4 v2, 0x2

    if-eqz v1, :cond_0

    or-int/lit8 v6, v7, 0x6

    move v8, v6

    move-object/from16 v6, p0

    goto :goto_1

    :cond_0
    and-int/lit8 v6, v7, 0x6

    if-nez v6, :cond_2

    move-object/from16 v6, p0

    invoke-virtual {v0, v6}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_1

    const/4 v8, 0x4

    goto :goto_0

    :cond_1
    move v8, v2

    :goto_0
    or-int/2addr v8, v7

    goto :goto_1

    :cond_2
    move-object/from16 v6, p0

    move v8, v7

    :goto_1
    and-int/lit8 v9, p8, 0x2

    if-eqz v9, :cond_4

    or-int/lit8 v8, v8, 0x30

    :cond_3
    move-object/from16 v10, p1

    goto :goto_3

    :cond_4
    and-int/lit8 v10, v7, 0x30

    if-nez v10, :cond_3

    move-object/from16 v10, p1

    invoke-virtual {v0, v10}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_5

    const/16 v11, 0x20

    goto :goto_2

    :cond_5
    const/16 v11, 0x10

    :goto_2
    or-int/2addr v8, v11

    :goto_3
    and-int/lit16 v11, v7, 0x180

    if-nez v11, :cond_7

    invoke-virtual {v0, v3}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_6

    const/16 v11, 0x100

    goto :goto_4

    :cond_6
    const/16 v11, 0x80

    :goto_4
    or-int/2addr v8, v11

    :cond_7
    and-int/lit16 v11, v7, 0xc00

    if-nez v11, :cond_9

    invoke-virtual {v0, v4}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_8

    const/16 v11, 0x800

    goto :goto_5

    :cond_8
    const/16 v11, 0x400

    :goto_5
    or-int/2addr v8, v11

    :cond_9
    and-int/lit16 v11, v7, 0x6000

    if-nez v11, :cond_b

    invoke-virtual {v0, v5}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_a

    const/16 v11, 0x4000

    goto :goto_6

    :cond_a
    const/16 v11, 0x2000

    :goto_6
    or-int/2addr v8, v11

    :cond_b
    and-int/lit8 v11, p8, 0x20

    const/high16 v13, 0x30000

    if-eqz v11, :cond_d

    or-int/2addr v8, v13

    :cond_c
    move-object/from16 v13, p5

    :goto_7
    move/from16 v34, v8

    goto :goto_9

    :cond_d
    and-int/2addr v13, v7

    if-nez v13, :cond_c

    move-object/from16 v13, p5

    invoke-virtual {v0, v13}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v14

    if-eqz v14, :cond_e

    const/high16 v14, 0x20000

    goto :goto_8

    :cond_e
    const/high16 v14, 0x10000

    :goto_8
    or-int/2addr v8, v14

    goto :goto_7

    :goto_9
    const v8, 0x12493

    and-int v8, v34, v8

    const v14, 0x12492

    const/4 v15, 0x0

    if-eq v8, v14, :cond_f

    const/4 v8, 0x1

    goto :goto_a

    :cond_f
    move v8, v15

    :goto_a
    and-int/lit8 v14, v34, 0x1

    invoke-virtual {v0, v14, v8}, Lp1/q;->U(IZ)Z

    move-result v8

    if-eqz v8, :cond_22

    sget-object v8, Lb2/t;->w:Lb2/t;

    if-eqz v1, :cond_10

    move-object v6, v8

    :cond_10
    const/16 v1, 0x8

    if-eqz v9, :cond_11

    int-to-float v9, v2

    int-to-float v10, v1

    mul-float/2addr v9, v10

    const/4 v10, 0x0

    invoke-static {v9, v10, v2}, Landroidx/compose/foundation/layout/a;->a(FFI)Ll0/l1;

    move-result-object v2

    goto :goto_b

    :cond_11
    move-object v2, v10

    :goto_b
    sget-object v9, Lp1/l;->a:Lp1/v0;

    if-eqz v11, :cond_13

    invoke-virtual {v0}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v10

    if-ne v10, v9, :cond_12

    new-instance v10, Lv01/k;

    const/4 v11, 0x4

    invoke-direct {v10, v11}, Lv01/k;-><init>(I)V

    invoke-virtual {v0, v10}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_12
    check-cast v10, Lkotlin/jvm/functions/Function1;

    goto :goto_c

    :cond_13
    move-object v10, v13

    :goto_c
    invoke-virtual {v0}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v11

    if-ne v11, v9, :cond_14

    invoke-static {v15, v0}, Ldc/b;->x(ILp1/q;)Lp1/k1;

    move-result-object v11

    :cond_14
    check-cast v11, Lp1/c1;

    sget-object v13, Ll0/m;->c:Ll0/g;

    sget-object v14, Lb2/e;->M:Lb2/k;

    invoke-static {v13, v14, v0, v15}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v13

    move-object/from16 p1, v2

    iget-wide v1, v0, Lp1/q;->T:J

    invoke-static {v1, v2}, Ljava/lang/Long;->hashCode(J)I

    move-result v1

    invoke-virtual {v0}, Lp1/q;->m()Lp1/p1;

    move-result-object v2

    invoke-static {v0, v6}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v14

    sget-object v16, La3/l;->a:La3/k;

    invoke-virtual/range {v16 .. v16}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v15, La3/k;->b:La3/j;

    invoke-virtual {v0}, Lp1/q;->i0()V

    iget-boolean v12, v0, Lp1/q;->S:Z

    if-eqz v12, :cond_15

    invoke-virtual {v0, v15}, Lp1/q;->l(Lc93/a;)V

    goto :goto_d

    :cond_15
    invoke-virtual {v0}, Lp1/q;->s0()V

    :goto_d
    sget-object v12, La3/k;->g:La3/i;

    invoke-static {v0, v12, v13}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v13, La3/k;->f:La3/i;

    invoke-static {v0, v13, v2}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v2, La3/k;->j:La3/i;

    move-object/from16 v35, v6

    iget-boolean v6, v0, Lp1/q;->S:Z

    if-nez v6, :cond_16

    invoke-virtual {v0}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v6

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-static {v6, v7}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_17

    :cond_16
    invoke-static {v1, v0, v1, v2}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_17
    sget-object v1, La3/k;->d:La3/i;

    invoke-static {v0, v1, v14}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const/high16 v6, 0x3f800000    # 1.0f

    invoke-static {v6, v8}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v18

    const/4 v6, 0x1

    int-to-float v7, v6

    const/16 v6, 0x8

    int-to-float v6, v6

    mul-float v22, v7, v6

    const/16 v23, 0x7

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    invoke-static/range {v18 .. v23}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v6

    move-object/from16 v7, p1

    move/from16 v36, v22

    invoke-static {v7, v6}, Landroidx/compose/foundation/layout/a;->o(Ll0/k1;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v6

    sget-object v8, Lb2/e;->K:Lb2/l;

    sget-object v14, Ll0/m;->a:Ll0/e;

    const/16 v7, 0x30

    invoke-static {v14, v8, v0, v7}, Ll0/p1;->a(Ll0/i;Lb2/g;Landroidx/compose/runtime/Composer;I)Ll0/r1;

    move-result-object v7

    move-object/from16 p0, v9

    iget-wide v8, v0, Lp1/q;->T:J

    invoke-static {v8, v9}, Ljava/lang/Long;->hashCode(J)I

    move-result v8

    invoke-virtual {v0}, Lp1/q;->m()Lp1/p1;

    move-result-object v9

    invoke-static {v0, v6}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v6

    invoke-virtual {v0}, Lp1/q;->i0()V

    iget-boolean v14, v0, Lp1/q;->S:Z

    if-eqz v14, :cond_18

    invoke-virtual {v0, v15}, Lp1/q;->l(Lc93/a;)V

    goto :goto_e

    :cond_18
    invoke-virtual {v0}, Lp1/q;->s0()V

    :goto_e
    invoke-static {v0, v12, v7}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v0, v13, v9}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v7, v0, Lp1/q;->S:Z

    if-nez v7, :cond_19

    invoke-virtual {v0}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v7

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    invoke-static {v7, v9}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_1a

    :cond_19
    invoke-static {v8, v0, v8, v2}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_1a
    invoke-static {v0, v1, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    shr-int/lit8 v1, v34, 0x6

    and-int/lit8 v1, v1, 0xe

    invoke-static {v3, v0, v1}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v1

    sget-object v2, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-virtual {v1, v2}, Ljava/lang/String;->toUpperCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v8

    const-string v1, "toUpperCase(...)"

    invoke-static {v8, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const/high16 v6, 0x40000000    # 2.0f

    float-to-double v12, v6

    const-wide/16 v37, 0x0

    cmpl-double v7, v12, v37

    const-string v39, "invalid weight; must be greater than zero"

    if-lez v7, :cond_1b

    goto :goto_f

    :cond_1b
    invoke-static/range {v39 .. v39}, Lm0/a;->a(Ljava/lang/String;)V

    :goto_f
    new-instance v9, Landroidx/compose/foundation/layout/LayoutWeightElement;

    const v7, 0x7f7fffff    # Float.MAX_VALUE

    cmpl-float v12, v6, v7

    if-lez v12, :cond_1c

    move v6, v7

    :cond_1c
    const/4 v12, 0x1

    invoke-direct {v9, v6, v12}, Landroidx/compose/foundation/layout/LayoutWeightElement;-><init>(FZ)V

    sget-object v6, Lx81/d;->a:Lx81/d;

    const/4 v13, 0x6

    invoke-virtual {v6, v0, v13}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v14

    invoke-virtual {v14}, Lb91/d;->r()Lb91/a;

    move-result-object v28

    invoke-virtual {v6, v0, v13}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v14

    invoke-virtual {v14}, Ly81/i;->y()J

    move-result-wide v14

    move/from16 p5, v7

    new-instance v7, Lw3/k;

    const/4 v12, 0x5

    invoke-direct {v7, v12}, Lw3/k;-><init>(I)V

    const/16 v32, 0x0

    const v33, 0x2fdf8

    move/from16 v18, v13

    const-wide/16 v12, 0x0

    move-object/from16 v19, v11

    move-wide/from16 v43, v14

    move-object v15, v10

    move-wide/from16 v10, v43

    const/4 v14, 0x0

    move-object/from16 v20, v15

    const/4 v15, 0x0

    const/16 v21, 0x0

    const/16 v16, 0x0

    move/from16 v22, v18

    const/16 v23, 0x1

    const-wide/16 v17, 0x0

    move-object/from16 v24, v19

    const/16 v19, 0x0

    move/from16 v25, v21

    move/from16 v26, v22

    const-wide/16 v21, 0x0

    move/from16 v27, v23

    const/16 v23, 0x0

    move-object/from16 v29, v24

    const/16 v24, 0x0

    move/from16 v30, v25

    const/16 v25, 0x0

    move/from16 v31, v26

    const/16 v26, 0x0

    move/from16 v40, v27

    const/16 v27, 0x0

    move-object/from16 v41, v29

    const/16 v29, 0x0

    move/from16 v42, v31

    const/16 v31, 0x0

    move-object/from16 v3, v20

    move-object/from16 v20, v7

    move-object v7, v3

    move-object/from16 v3, p0

    move-object/from16 v30, v0

    move/from16 v0, v40

    invoke-static/range {v8 .. v33}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v8, v30

    shr-int/lit8 v9, v34, 0x9

    and-int/lit8 v9, v9, 0xe

    invoke-static {v4, v8, v9}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v9

    invoke-virtual {v9, v2}, Ljava/lang/String;->toUpperCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v2

    invoke-static {v2, v1}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const/high16 v1, 0x40400000    # 3.0f

    float-to-double v9, v1

    cmpl-double v9, v9, v37

    if-lez v9, :cond_1d

    goto :goto_10

    :cond_1d
    invoke-static/range {v39 .. v39}, Lm0/a;->a(Ljava/lang/String;)V

    :goto_10
    new-instance v9, Landroidx/compose/foundation/layout/LayoutWeightElement;

    cmpl-float v10, v1, p5

    if-lez v10, :cond_1e

    move/from16 v1, p5

    :cond_1e
    invoke-direct {v9, v1, v0}, Landroidx/compose/foundation/layout/LayoutWeightElement;-><init>(FZ)V

    const/4 v1, 0x6

    invoke-virtual {v6, v8, v1}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v10

    invoke-virtual {v10}, Lb91/d;->M()Lb91/a;

    move-result-object v28

    invoke-virtual {v6, v8, v1}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v6

    invoke-virtual {v6}, Ly81/i;->b1()J

    move-result-wide v10

    new-instance v6, Lw3/k;

    invoke-direct {v6, v1}, Lw3/k;-><init>(I)V

    const/16 v32, 0x0

    const v33, 0x2fdf8

    const-wide/16 v12, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const-wide/16 v17, 0x0

    const/16 v19, 0x0

    const-wide/16 v21, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    const/16 v29, 0x0

    const/16 v31, 0x0

    move-object/from16 v20, v6

    move-object/from16 v30, v8

    move-object v8, v2

    invoke-static/range {v8 .. v33}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v8, v30

    invoke-virtual {v8, v0}, Lp1/q;->q(Z)V

    invoke-static/range {v36 .. v36}, Ll0/m;->i(F)Ll0/k;

    move-result-object v11

    invoke-virtual {v8, v5}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v1

    const/high16 v2, 0x70000

    and-int v2, v34, v2

    const/high16 v6, 0x20000

    if-ne v2, v6, :cond_1f

    move v15, v0

    goto :goto_11

    :cond_1f
    const/4 v15, 0x0

    :goto_11
    or-int/2addr v1, v15

    invoke-virtual {v8}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    if-nez v1, :cond_20

    if-ne v2, v3, :cond_21

    :cond_20
    new-instance v2, Ls90/f;

    const/16 v1, 0x15

    move-object/from16 v3, v41

    invoke-direct {v2, v5, v7, v3, v1}, Ls90/f;-><init>(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Ljava/lang/Object;I)V

    invoke-virtual {v8, v2}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_21
    move-object/from16 v16, v2

    check-cast v16, Lkotlin/jvm/functions/Function1;

    shl-int/lit8 v1, v34, 0x3

    and-int/lit16 v1, v1, 0x380

    or-int/lit16 v1, v1, 0x6000

    const/16 v19, 0x1eb

    move-object/from16 v30, v8

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    move-object/from16 v10, p1

    move/from16 v18, v1

    move-object/from16 v17, v30

    invoke-static/range {v8 .. v19}, Lkotlin/jvm/internal/j;->d(Landroidx/compose/ui/Modifier;Ln0/u;Ll0/k1;Ll0/i;Lb2/g;Lh0/o1;ZLf0/k;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    move-object/from16 v8, v17

    invoke-virtual {v8, v0}, Lp1/q;->q(Z)V

    move-object v6, v7

    move-object/from16 v1, v35

    :goto_12
    move-object v2, v10

    goto :goto_13

    :cond_22
    move-object v8, v0

    invoke-virtual {v8}, Lp1/q;->X()V

    move-object v1, v6

    move-object v6, v13

    goto :goto_12

    :goto_13
    invoke-virtual {v8}, Lp1/q;->u()Lp1/v1;

    move-result-object v9

    if-eqz v9, :cond_23

    new-instance v0, Lp72/a;

    move-object/from16 v3, p2

    move/from16 v7, p7

    move/from16 v8, p8

    invoke-direct/range {v0 .. v8}, Lp72/a;-><init>(Landroidx/compose/ui/Modifier;Ll0/k1;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/util/List;Lkotlin/jvm/functions/Function1;II)V

    iput-object v0, v9, Lp1/v1;->d:Lc93/m;

    :cond_23
    return-void
.end method

.method private static final e(Ljava/lang/Object;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final f(Lp1/c1;)I
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

.method private static final g(Lp1/c1;I)V
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

.method private static final h(Ljava/util/List;Lkotlin/jvm/functions/Function1;Lp1/c1;Ln0/q;)Ll83/a0;
    .locals 3

    const-string v0, "$this$LazyRow"

    invoke-static {p3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v0, Lv41/j$c;->w:Lv41/j$c;

    invoke-interface {p0}, Ljava/util/List;->size()I

    move-result v1

    new-instance v2, Lv41/j$d;

    invoke-direct {v2, v0, p0}, Lv41/j$d;-><init>(Lkotlin/jvm/functions/Function1;Ljava/util/List;)V

    new-instance v0, Lv41/j$e;

    invoke-direct {v0, p0, p1, p2}, Lv41/j$e;-><init>(Ljava/util/List;Lkotlin/jvm/functions/Function1;Lp1/c1;)V

    new-instance p0, Lx1/b;

    const/4 p1, 0x1

    const p2, 0x2fd4df92

    invoke-direct {p0, v0, p1, p2}, Lx1/b;-><init>(Ljava/lang/Object;ZI)V

    check-cast p3, Ln0/f;

    const/4 p1, 0x0

    invoke-virtual {p3, v1, p1, v2, p0}, Ln0/f;->r(ILkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Lc93/n;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final i(Landroidx/compose/ui/Modifier;Ll0/k1;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/util/List;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 10

    or-int/lit8 v0, p6, 0x1

    invoke-static {v0}, Lp1/x;->L(I)I

    move-result v8

    move-object v1, p0

    move-object v2, p1

    move-object v3, p2

    move-object v4, p3

    move-object v5, p4

    move-object v6, p5

    move/from16 v9, p7

    move-object/from16 v7, p8

    invoke-static/range {v1 .. v9}, Lv41/j;->d(Landroidx/compose/ui/Modifier;Ll0/k1;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/util/List;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static final synthetic j(Lp1/c1;)I
    .locals 0

    invoke-static {p0}, Lv41/j;->f(Lp1/c1;)I

    move-result p0

    return p0
.end method

.method public static final synthetic k(Lp1/c1;I)V
    .locals 0

    invoke-static {p0, p1}, Lv41/j;->g(Lp1/c1;I)V

    return-void
.end method
