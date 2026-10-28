.class public abstract Lw71/g0;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000&\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0008\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u001aY\u0010\u000c\u001a\u00020\n2\u0006\u0010\u0001\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u00022\n\u0008\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u00022\n\u0008\u0002\u0010\u0008\u001a\u0004\u0018\u00010\u00072\u0014\u0010\u000b\u001a\u0010\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0012\u0004\u0012\u00020\n0\tH\u0007\u00a2\u0006\u0004\u0008\u000c\u0010\r\u00a8\u0006\u000e"
    }
    d2 = {
        "Lcom/whoop/design/util/TextResource;",
        "question",
        "",
        "isSubQuestion",
        "",
        "selectedIndex",
        "enabled",
        "Lp01/b;",
        "indicatorItemState",
        "Lkotlin/Function1;",
        "Ll83/a0;",
        "onAnswer",
        "d",
        "(Lcom/whoop/design/util/TextResource;ZLjava/lang/Integer;ZLp01/b;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V",
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
.method public static synthetic a(Lkotlin/jvm/functions/Function1;Ljava/lang/Integer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, Lw71/g0;->f(Lkotlin/jvm/functions/Function1;Ljava/lang/Integer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Ljava/lang/Integer;ZLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Lw71/g0;->e(Ljava/lang/Integer;ZLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Lcom/whoop/design/util/TextResource;ZLjava/lang/Integer;ZLp01/b;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p9}, Lw71/g0;->g(Lcom/whoop/design/util/TextResource;ZLjava/lang/Integer;ZLp01/b;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final d(Lcom/whoop/design/util/TextResource;ZLjava/lang/Integer;ZLp01/b;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V
    .locals 30
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/design/util/TextResource;",
            "Z",
            "Ljava/lang/Integer;",
            "Z",
            "Lp01/b;",
            "Lkotlin/jvm/functions/Function1;",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    move-object/from16 v0, p0

    move-object/from16 v1, p4

    move-object/from16 v7, p5

    move/from16 v8, p7

    const-string v2, "question"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "onAnswer"

    invoke-static {v7, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v4, p6

    check-cast v4, Lp1/q;

    const v2, 0x3f2d3894

    invoke-virtual {v4, v2}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v2, v8, 0x6

    if-nez v2, :cond_1

    invoke-virtual {v4, v0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    const/4 v2, 0x4

    goto :goto_0

    :cond_0
    const/4 v2, 0x2

    :goto_0
    or-int/2addr v2, v8

    goto :goto_1

    :cond_1
    move v2, v8

    :goto_1
    and-int/lit8 v6, p8, 0x2

    if-eqz v6, :cond_3

    or-int/lit8 v2, v2, 0x30

    :cond_2
    move/from16 v9, p1

    goto :goto_3

    :cond_3
    and-int/lit8 v9, v8, 0x30

    if-nez v9, :cond_2

    move/from16 v9, p1

    invoke-virtual {v4, v9}, Lp1/q;->h(Z)Z

    move-result v10

    if-eqz v10, :cond_4

    const/16 v10, 0x20

    goto :goto_2

    :cond_4
    const/16 v10, 0x10

    :goto_2
    or-int/2addr v2, v10

    :goto_3
    and-int/lit8 v10, p8, 0x4

    if-eqz v10, :cond_6

    or-int/lit16 v2, v2, 0x180

    :cond_5
    move-object/from16 v11, p2

    goto :goto_5

    :cond_6
    and-int/lit16 v11, v8, 0x180

    if-nez v11, :cond_5

    move-object/from16 v11, p2

    invoke-virtual {v4, v11}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v12

    if-eqz v12, :cond_7

    const/16 v12, 0x100

    goto :goto_4

    :cond_7
    const/16 v12, 0x80

    :goto_4
    or-int/2addr v2, v12

    :goto_5
    and-int/lit8 v12, p8, 0x8

    if-eqz v12, :cond_9

    or-int/lit16 v2, v2, 0xc00

    :cond_8
    move/from16 v13, p3

    goto :goto_7

    :cond_9
    and-int/lit16 v13, v8, 0xc00

    if-nez v13, :cond_8

    move/from16 v13, p3

    invoke-virtual {v4, v13}, Lp1/q;->h(Z)Z

    move-result v14

    if-eqz v14, :cond_a

    const/16 v14, 0x800

    goto :goto_6

    :cond_a
    const/16 v14, 0x400

    :goto_6
    or-int/2addr v2, v14

    :goto_7
    and-int/lit8 v14, p8, 0x10

    if-eqz v14, :cond_b

    or-int/lit16 v2, v2, 0x6000

    goto :goto_a

    :cond_b
    and-int/lit16 v15, v8, 0x6000

    if-nez v15, :cond_e

    const v15, 0x8000

    and-int/2addr v15, v8

    if-nez v15, :cond_c

    invoke-virtual {v4, v1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v15

    goto :goto_8

    :cond_c
    invoke-virtual {v4, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v15

    :goto_8
    if-eqz v15, :cond_d

    const/16 v15, 0x4000

    goto :goto_9

    :cond_d
    const/16 v15, 0x2000

    :goto_9
    or-int/2addr v2, v15

    :cond_e
    :goto_a
    const/high16 v15, 0x30000

    and-int/2addr v15, v8

    if-nez v15, :cond_10

    invoke-virtual {v4, v7}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v15

    if-eqz v15, :cond_f

    const/high16 v15, 0x20000

    goto :goto_b

    :cond_f
    const/high16 v15, 0x10000

    :goto_b
    or-int/2addr v2, v15

    :cond_10
    const v15, 0x12493

    and-int/2addr v15, v2

    const v5, 0x12492

    if-eq v15, v5, :cond_11

    const/4 v5, 0x1

    goto :goto_c

    :cond_11
    const/4 v5, 0x0

    :goto_c
    and-int/lit8 v15, v2, 0x1

    invoke-virtual {v4, v15, v5}, Lp1/q;->U(IZ)Z

    move-result v5

    if-eqz v5, :cond_25

    if-eqz v6, :cond_12

    const/16 v21, 0x0

    goto :goto_d

    :cond_12
    move/from16 v21, p1

    :goto_d
    const/4 v5, 0x0

    if-eqz v10, :cond_13

    move-object v10, v5

    goto :goto_e

    :cond_13
    move-object v10, v11

    :goto_e
    if-eqz v12, :cond_14

    const/4 v11, 0x1

    goto :goto_f

    :cond_14
    move v11, v13

    :goto_f
    if-eqz v14, :cond_15

    move-object v12, v5

    goto :goto_10

    :cond_15
    move-object v12, v1

    :goto_10
    sget-object v1, Lw71/c;->a:Lw71/c;

    if-eqz v21, :cond_16

    invoke-virtual {v1}, Lw71/c;->b()F

    move-result v1

    :goto_11
    move/from16 v23, v1

    goto :goto_12

    :cond_16
    invoke-virtual {v1}, Lw71/c;->a()F

    move-result v1

    goto :goto_11

    :goto_12
    shl-int/lit8 v1, v2, 0x3

    and-int/lit8 v1, v1, 0x70

    const/4 v13, 0x6

    or-int/2addr v1, v13

    const-string v5, "Journal_YesNo_"

    invoke-static {v5, v0, v4, v1}, Lw71/a;->c(Ljava/lang/String;Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v1

    const/high16 v14, 0x3f800000    # 1.0f

    sget-object v5, Lb2/t;->w:Lb2/t;

    invoke-static {v14, v5}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v22

    const/16 v26, 0x0

    const/16 v27, 0xe

    const/16 v24, 0x0

    const/16 v25, 0x0

    invoke-static/range {v22 .. v27}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v6

    invoke-static {v6, v1}, Lgb1/d;->d(Landroidx/compose/ui/Modifier;Ljava/lang/String;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    sget-object v6, Lb2/e;->K:Lb2/l;

    sget-object v15, Ll0/m;->g:Ll0/h;

    const/16 v14, 0x36

    invoke-static {v15, v6, v4, v14}, Ll0/p1;->a(Ll0/i;Lb2/g;Landroidx/compose/runtime/Composer;I)Ll0/r1;

    move-result-object v6

    iget-wide v14, v4, Lp1/q;->T:J

    invoke-static {v14, v15}, Ljava/lang/Long;->hashCode(J)I

    move-result v14

    invoke-virtual {v4}, Lp1/q;->m()Lp1/p1;

    move-result-object v15

    invoke-static {v4, v1}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    sget-object v17, La3/l;->a:La3/k;

    invoke-virtual/range {v17 .. v17}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    move/from16 v17, v2

    sget-object v2, La3/k;->b:La3/j;

    invoke-virtual {v4}, Lp1/q;->i0()V

    iget-boolean v9, v4, Lp1/q;->S:Z

    if-eqz v9, :cond_17

    invoke-virtual {v4, v2}, Lp1/q;->l(Lc93/a;)V

    goto :goto_13

    :cond_17
    invoke-virtual {v4}, Lp1/q;->s0()V

    :goto_13
    sget-object v9, La3/k;->g:La3/i;

    invoke-static {v4, v9, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v6, La3/k;->f:La3/i;

    invoke-static {v4, v6, v15}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v15, La3/k;->j:La3/i;

    iget-boolean v13, v4, Lp1/q;->S:Z

    if-nez v13, :cond_18

    invoke-virtual {v4}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v13

    invoke-static {v14}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-static {v13, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_19

    :cond_18
    invoke-static {v14, v4, v14, v15}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_19
    sget-object v13, La3/k;->d:La3/i;

    invoke-static {v4, v13, v1}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    if-nez v12, :cond_1a

    const v1, -0x19c321a5

    invoke-virtual {v4, v1}, Lp1/q;->e0(I)V

    const/4 v1, 0x0

    invoke-virtual {v4, v1}, Lp1/q;->q(Z)V

    goto :goto_14

    :cond_1a
    const v1, -0x19c321a4

    invoke-virtual {v4, v1}, Lp1/q;->e0(I)V

    const/4 v1, 0x2

    int-to-float v1, v1

    const/4 v3, 0x3

    int-to-float v3, v3

    const/4 v14, 0x4

    int-to-float v14, v14

    mul-float v27, v3, v14

    const/16 v28, 0x0

    const/16 v29, 0xa

    const/16 v26, 0x0

    move/from16 v25, v1

    move-object/from16 v24, v5

    invoke-static/range {v24 .. v29}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v1

    const/4 v3, 0x0

    const/4 v5, 0x6

    invoke-static {v1, v12, v4, v5, v3}, Lp01/f;->i(Landroidx/compose/ui/Modifier;Lp01/b;Landroidx/compose/runtime/Composer;II)V

    invoke-virtual {v4, v3}, Lp1/q;->q(Z)V

    :goto_14
    const/high16 v1, 0x40000000    # 2.0f

    float-to-double v7, v1

    const-wide/16 v19, 0x0

    cmpl-double v3, v7, v19

    const-string v7, "invalid weight; must be greater than zero"

    if-lez v3, :cond_1b

    goto :goto_15

    :cond_1b
    invoke-static {v7}, Lm0/a;->a(Ljava/lang/String;)V

    :goto_15
    new-instance v3, Landroidx/compose/foundation/layout/LayoutWeightElement;

    const v8, 0x7f7fffff    # Float.MAX_VALUE

    cmpl-float v5, v1, v8

    if-lez v5, :cond_1c

    move v1, v8

    :cond_1c
    const/4 v5, 0x1

    invoke-direct {v3, v1, v5}, Landroidx/compose/foundation/layout/LayoutWeightElement;-><init>(FZ)V

    sget-object v1, Lb2/e;->M:Lb2/k;

    sget-object v14, Ll0/m;->c:Ll0/g;

    const/16 v5, 0x30

    invoke-static {v14, v1, v4, v5}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v1

    move-object/from16 p3, v6

    iget-wide v5, v4, Lp1/q;->T:J

    invoke-static {v5, v6}, Ljava/lang/Long;->hashCode(J)I

    move-result v5

    invoke-virtual {v4}, Lp1/q;->m()Lp1/p1;

    move-result-object v6

    invoke-static {v4, v3}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    invoke-virtual {v4}, Lp1/q;->i0()V

    move/from16 p6, v8

    iget-boolean v8, v4, Lp1/q;->S:Z

    if-eqz v8, :cond_1d

    invoke-virtual {v4, v2}, Lp1/q;->l(Lc93/a;)V

    goto :goto_16

    :cond_1d
    invoke-virtual {v4}, Lp1/q;->s0()V

    :goto_16
    invoke-static {v4, v9, v1}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    move-object/from16 v1, p3

    invoke-static {v4, v1, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v6, v4, Lp1/q;->S:Z

    if-nez v6, :cond_1e

    invoke-virtual {v4}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v6

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    invoke-static {v6, v8}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_1f

    :cond_1e
    invoke-static {v5, v4, v5, v15}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_1f
    invoke-static {v4, v13, v3}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    and-int/lit8 v5, v17, 0xe

    const/16 v6, 0xe

    move-object v3, v1

    const/4 v1, 0x0

    move-object v8, v2

    const/4 v2, 0x0

    move-object/from16 v16, v3

    const/4 v3, 0x0

    move-object/from16 p3, v7

    move-object/from16 p4, v12

    move-object/from16 v7, v16

    const/16 v12, 0x30

    invoke-static/range {v0 .. v6}, Lw71/z;->c(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;ZLw71/a0;Landroidx/compose/runtime/Composer;II)V

    const/4 v5, 0x1

    invoke-virtual {v4, v5}, Lp1/q;->q(Z)V

    const/high16 v0, 0x3f800000    # 1.0f

    float-to-double v1, v0

    cmpl-double v1, v1, v19

    if-lez v1, :cond_20

    goto :goto_17

    :cond_20
    invoke-static/range {p3 .. p3}, Lm0/a;->a(Ljava/lang/String;)V

    :goto_17
    new-instance v1, Landroidx/compose/foundation/layout/LayoutWeightElement;

    cmpl-float v2, v0, p6

    if-lez v2, :cond_21

    move/from16 v0, p6

    :cond_21
    const/4 v5, 0x1

    invoke-direct {v1, v0, v5}, Landroidx/compose/foundation/layout/LayoutWeightElement;-><init>(FZ)V

    sget-object v0, Lb2/e;->O:Lb2/k;

    invoke-static {v14, v0, v4, v12}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v0

    iget-wide v2, v4, Lp1/q;->T:J

    invoke-static {v2, v3}, Ljava/lang/Long;->hashCode(J)I

    move-result v2

    invoke-virtual {v4}, Lp1/q;->m()Lp1/p1;

    move-result-object v3

    invoke-static {v4, v1}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    invoke-virtual {v4}, Lp1/q;->i0()V

    iget-boolean v6, v4, Lp1/q;->S:Z

    if-eqz v6, :cond_22

    invoke-virtual {v4, v8}, Lp1/q;->l(Lc93/a;)V

    goto :goto_18

    :cond_22
    invoke-virtual {v4}, Lp1/q;->s0()V

    :goto_18
    invoke-static {v4, v9, v0}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v4, v7, v3}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v0, v4, Lp1/q;->S:Z

    if-nez v0, :cond_23

    invoke-virtual {v4}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v0

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-static {v0, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_24

    :cond_23
    invoke-static {v2, v4, v2, v15}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_24
    invoke-static {v4, v13, v1}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v0, Lx81/d;->a:Lx81/d;

    const/4 v1, 0x6

    invoke-virtual {v0, v4, v1}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v0

    invoke-virtual {v0}, Ly81/i;->X()J

    move-result-wide v13

    new-instance v0, La31/c;

    const/16 v1, 0x10

    move-object/from16 v7, p5

    invoke-direct {v0, v10, v11, v7, v1}, La31/c;-><init>(Ljava/lang/Object;ZLjava/lang/Object;I)V

    const v1, -0x117f11f4

    invoke-static {v1, v4, v0}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v17

    const/16 v19, 0x6000

    const/16 v20, 0xb

    move-object v0, v10

    const-wide/16 v9, 0x0

    move v1, v11

    const-wide/16 v11, 0x0

    const-wide/16 v15, 0x0

    move-object/from16 v18, v4

    move v2, v5

    move-object/from16 v5, p4

    invoke-static/range {v9 .. v20}, Ly81/c;->b(JJJJLc93/m;Landroidx/compose/runtime/Composer;II)V

    invoke-virtual {v4, v2}, Lp1/q;->q(Z)V

    invoke-virtual {v4, v2}, Lp1/q;->q(Z)V

    move-object v3, v0

    move/from16 v2, v21

    move v4, v1

    goto :goto_19

    :cond_25
    invoke-virtual {v4}, Lp1/q;->X()V

    move/from16 v2, p1

    move-object v5, v1

    move-object/from16 v18, v4

    move-object v3, v11

    move v4, v13

    :goto_19
    invoke-virtual/range {v18 .. v18}, Lp1/q;->u()Lp1/v1;

    move-result-object v9

    if-eqz v9, :cond_26

    new-instance v0, Lb01/n;

    move-object/from16 v1, p0

    move/from16 v8, p8

    move-object v6, v7

    move/from16 v7, p7

    invoke-direct/range {v0 .. v8}, Lb01/n;-><init>(Lcom/whoop/design/util/TextResource;ZLjava/lang/Integer;ZLp01/b;Lkotlin/jvm/functions/Function1;II)V

    iput-object v0, v9, Lp1/v1;->d:Lc93/m;

    :cond_26
    return-void
.end method

.method private static final e(Ljava/lang/Integer;ZLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 11

    and-int/lit8 v0, p4, 0x3

    const/4 v1, 0x1

    const/4 v2, 0x2

    if-eq v0, v2, :cond_0

    move v0, v1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    and-int/2addr p4, v1

    move-object v8, p3

    check-cast v8, Lp1/q;

    invoke-virtual {v8, p4, v0}, Lp1/q;->U(IZ)Z

    move-result p3

    if-eqz p3, :cond_3

    sget-object p3, Lx81/d;->a:Lx81/d;

    invoke-virtual {p3}, Lx81/d;->d()Lgz0/o0;

    move-result-object p4

    invoke-virtual {p4}, Lgz0/o0;->o()Lgz0/i0;

    move-result-object p4

    invoke-virtual {p4}, Lgz0/i0;->k()I

    move-result p4

    invoke-static {p4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p4

    invoke-virtual {p3}, Lx81/d;->d()Lgz0/o0;

    move-result-object p3

    invoke-virtual {p3}, Lgz0/o0;->o()Lgz0/i0;

    move-result-object p3

    invoke-virtual {p3}, Lgz0/i0;->i()I

    move-result p3

    invoke-static {p3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p3

    filled-new-array {p4, p3}, [Ljava/lang/Integer;

    move-result-object p3

    invoke-static {p3}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v3

    int-to-float p3, v2

    const/4 p4, 0x4

    int-to-float p4, p4

    mul-float/2addr p3, p4

    invoke-static {p3}, Ll0/m;->i(F)Ll0/k;

    move-result-object v6

    invoke-virtual {v8, p2}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result p3

    invoke-virtual {v8, p0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result p4

    or-int/2addr p3, p4

    invoke-virtual {v8}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object p4

    if-nez p3, :cond_1

    sget-object p3, Lp1/l;->a:Lp1/v0;

    if-ne p4, p3, :cond_2

    :cond_1
    new-instance p4, Lgf1/f;

    const/4 p3, 0x1

    invoke-direct {p4, p2, p0, p3}, Lgf1/f;-><init>(Lkotlin/jvm/functions/Function1;Ljava/lang/Integer;I)V

    invoke-virtual {v8, p4}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_2
    move-object v7, p4

    check-cast v7, Lkotlin/jvm/functions/Function1;

    const/16 v9, 0xc00

    const/4 v10, 0x0

    move-object v4, p0

    move v5, p1

    invoke-static/range {v3 .. v10}, Lg21/b;->d(Ljava/util/List;Ljava/lang/Integer;ZLl0/i;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    goto :goto_1

    :cond_3
    invoke-virtual {v8}, Lp1/q;->X()V

    :goto_1
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final f(Lkotlin/jvm/functions/Function1;Ljava/lang/Integer;I)Ll83/a0;
    .locals 0

    if-nez p1, :cond_0

    goto :goto_0

    :cond_0
    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    if-ne p2, p1, :cond_1

    const/4 p1, 0x0

    goto :goto_2

    :cond_1
    :goto_0
    if-eqz p2, :cond_2

    const/4 p1, 0x1

    goto :goto_1

    :cond_2
    const/4 p1, 0x0

    :goto_1
    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    :goto_2
    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final g(Lcom/whoop/design/util/TextResource;ZLjava/lang/Integer;ZLp01/b;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 10

    or-int/lit8 v0, p6, 0x1

    invoke-static {v0}, Lp1/x;->L(I)I

    move-result v8

    move-object v1, p0

    move v2, p1

    move-object v3, p2

    move v4, p3

    move-object v5, p4

    move-object v6, p5

    move/from16 v9, p7

    move-object/from16 v7, p8

    invoke-static/range {v1 .. v9}, Lw71/g0;->d(Lcom/whoop/design/util/TextResource;ZLjava/lang/Integer;ZLp01/b;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method
