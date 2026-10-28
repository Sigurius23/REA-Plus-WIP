.class public abstract Lw71/h0;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001a\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u001aI\u0010\t\u001a\u00020\u00072\u0006\u0010\u0001\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0004\u001a\u00020\u00022\u0008\u0008\u0002\u0010\u0005\u001a\u00020\u00022\u0012\u0010\u0008\u001a\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00070\u0006H\u0007\u00a2\u0006\u0004\u0008\t\u0010\n\u00a8\u0006\u000b"
    }
    d2 = {
        "Lcom/whoop/design/util/TextResource;",
        "question",
        "",
        "isSubQuestion",
        "checked",
        "enabled",
        "Lkotlin/Function1;",
        "Ll83/a0;",
        "isAffirmative",
        "d",
        "(Lcom/whoop/design/util/TextResource;ZZZLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V",
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
.method public static synthetic a(Lcom/whoop/design/util/TextResource;ZZZLkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p8}, Lw71/h0;->g(Lcom/whoop/design/util/TextResource;ZZZLkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lkotlin/jvm/functions/Function1;Z)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lw71/h0;->f(Lkotlin/jvm/functions/Function1;Z)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(ZZLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Lw71/h0;->e(ZZLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final d(Lcom/whoop/design/util/TextResource;ZZZLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V
    .locals 28
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/design/util/TextResource;",
            "ZZZ",
            "Lkotlin/jvm/functions/Function1;",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    move-object/from16 v0, p0

    move-object/from16 v7, p4

    move/from16 v8, p6

    const-string v1, "question"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "isAffirmative"

    invoke-static {v7, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v4, p5

    check-cast v4, Lp1/q;

    const v1, -0x529694a

    invoke-virtual {v4, v1}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v1, v8, 0x6

    const/4 v2, 0x2

    if-nez v1, :cond_1

    invoke-virtual {v4, v0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, 0x4

    goto :goto_0

    :cond_0
    move v1, v2

    :goto_0
    or-int/2addr v1, v8

    goto :goto_1

    :cond_1
    move v1, v8

    :goto_1
    and-int/lit8 v3, p7, 0x2

    if-eqz v3, :cond_3

    or-int/lit8 v1, v1, 0x30

    :cond_2
    move/from16 v5, p1

    goto :goto_3

    :cond_3
    and-int/lit8 v5, v8, 0x30

    if-nez v5, :cond_2

    move/from16 v5, p1

    invoke-virtual {v4, v5}, Lp1/q;->h(Z)Z

    move-result v6

    if-eqz v6, :cond_4

    const/16 v6, 0x20

    goto :goto_2

    :cond_4
    const/16 v6, 0x10

    :goto_2
    or-int/2addr v1, v6

    :goto_3
    and-int/lit8 v6, p7, 0x4

    if-eqz v6, :cond_6

    or-int/lit16 v1, v1, 0x180

    :cond_5
    move/from16 v9, p2

    goto :goto_5

    :cond_6
    and-int/lit16 v9, v8, 0x180

    if-nez v9, :cond_5

    move/from16 v9, p2

    invoke-virtual {v4, v9}, Lp1/q;->h(Z)Z

    move-result v10

    if-eqz v10, :cond_7

    const/16 v10, 0x100

    goto :goto_4

    :cond_7
    const/16 v10, 0x80

    :goto_4
    or-int/2addr v1, v10

    :goto_5
    and-int/lit8 v10, p7, 0x8

    if-eqz v10, :cond_9

    or-int/lit16 v1, v1, 0xc00

    :cond_8
    move/from16 v11, p3

    goto :goto_7

    :cond_9
    and-int/lit16 v11, v8, 0xc00

    if-nez v11, :cond_8

    move/from16 v11, p3

    invoke-virtual {v4, v11}, Lp1/q;->h(Z)Z

    move-result v12

    if-eqz v12, :cond_a

    const/16 v12, 0x800

    goto :goto_6

    :cond_a
    const/16 v12, 0x400

    :goto_6
    or-int/2addr v1, v12

    :goto_7
    and-int/lit16 v12, v8, 0x6000

    if-nez v12, :cond_c

    invoke-virtual {v4, v7}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v12

    if-eqz v12, :cond_b

    const/16 v12, 0x4000

    goto :goto_8

    :cond_b
    const/16 v12, 0x2000

    :goto_8
    or-int/2addr v1, v12

    :cond_c
    and-int/lit16 v12, v1, 0x2493

    const/16 v13, 0x2492

    const/4 v14, 0x0

    const/4 v15, 0x1

    if-eq v12, v13, :cond_d

    move v12, v15

    goto :goto_9

    :cond_d
    move v12, v14

    :goto_9
    and-int/lit8 v13, v1, 0x1

    invoke-virtual {v4, v13, v12}, Lp1/q;->U(IZ)Z

    move-result v12

    if-eqz v12, :cond_1f

    if-eqz v3, :cond_e

    move/from16 v21, v14

    goto :goto_a

    :cond_e
    move/from16 v21, v5

    :goto_a
    if-eqz v6, :cond_f

    move v9, v14

    :cond_f
    if-eqz v10, :cond_10

    move v10, v15

    goto :goto_b

    :cond_10
    move v10, v11

    :goto_b
    const/16 v3, 0x8

    if-eqz v21, :cond_11

    int-to-float v2, v2

    :goto_c
    int-to-float v3, v3

    mul-float/2addr v2, v3

    move/from16 v23, v2

    goto :goto_d

    :cond_11
    int-to-float v2, v14

    goto :goto_c

    :goto_d
    shl-int/lit8 v2, v1, 0x3

    and-int/lit8 v2, v2, 0x70

    const/4 v11, 0x6

    or-int/2addr v2, v11

    const-string v3, "Journal_Toggle_"

    invoke-static {v3, v0, v4, v2}, Lw71/a;->c(Ljava/lang/String;Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v2

    sget-object v3, Lb2/t;->w:Lb2/t;

    const/high16 v12, 0x3f800000    # 1.0f

    invoke-static {v12, v3}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v22

    const/16 v26, 0x0

    const/16 v27, 0xe

    const/16 v24, 0x0

    const/16 v25, 0x0

    invoke-static/range {v22 .. v27}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v3

    invoke-static {v3, v2}, Lgb1/d;->d(Landroidx/compose/ui/Modifier;Ljava/lang/String;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    sget-object v3, Lb2/e;->K:Lb2/l;

    sget-object v5, Ll0/m;->g:Ll0/h;

    const/16 v6, 0x36

    invoke-static {v5, v3, v4, v6}, Ll0/p1;->a(Ll0/i;Lb2/g;Landroidx/compose/runtime/Composer;I)Ll0/r1;

    move-result-object v3

    iget-wide v5, v4, Lp1/q;->T:J

    invoke-static {v5, v6}, Ljava/lang/Long;->hashCode(J)I

    move-result v5

    invoke-virtual {v4}, Lp1/q;->m()Lp1/p1;

    move-result-object v6

    invoke-static {v4, v2}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    sget-object v13, La3/l;->a:La3/k;

    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v13, La3/k;->b:La3/j;

    invoke-virtual {v4}, Lp1/q;->i0()V

    iget-boolean v14, v4, Lp1/q;->S:Z

    if-eqz v14, :cond_12

    invoke-virtual {v4, v13}, Lp1/q;->l(Lc93/a;)V

    goto :goto_e

    :cond_12
    invoke-virtual {v4}, Lp1/q;->s0()V

    :goto_e
    sget-object v14, La3/k;->g:La3/i;

    invoke-static {v4, v14, v3}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v3, La3/k;->f:La3/i;

    invoke-static {v4, v3, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v6, La3/k;->j:La3/i;

    iget-boolean v11, v4, Lp1/q;->S:Z

    if-nez v11, :cond_13

    invoke-virtual {v4}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v11

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v12

    invoke-static {v11, v12}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v11

    if-nez v11, :cond_14

    :cond_13
    invoke-static {v5, v4, v5, v6}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_14
    sget-object v11, La3/k;->d:La3/i;

    invoke-static {v4, v11, v2}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const/high16 v2, 0x40000000    # 2.0f

    move v12, v1

    float-to-double v0, v2

    const-wide/16 v16, 0x0

    cmpl-double v0, v0, v16

    const-string v18, "invalid weight; must be greater than zero"

    if-lez v0, :cond_15

    goto :goto_f

    :cond_15
    invoke-static/range {v18 .. v18}, Lm0/a;->a(Ljava/lang/String;)V

    :goto_f
    new-instance v0, Landroidx/compose/foundation/layout/LayoutWeightElement;

    const v19, 0x7f7fffff    # Float.MAX_VALUE

    cmpl-float v1, v2, v19

    if-lez v1, :cond_16

    move/from16 v2, v19

    :cond_16
    invoke-direct {v0, v2, v15}, Landroidx/compose/foundation/layout/LayoutWeightElement;-><init>(FZ)V

    sget-object v1, Lb2/e;->M:Lb2/k;

    sget-object v2, Ll0/m;->c:Ll0/g;

    const/16 v5, 0x30

    invoke-static {v2, v1, v4, v5}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v1

    move-object/from16 p3, v6

    iget-wide v5, v4, Lp1/q;->T:J

    invoke-static {v5, v6}, Ljava/lang/Long;->hashCode(J)I

    move-result v5

    invoke-virtual {v4}, Lp1/q;->m()Lp1/p1;

    move-result-object v6

    invoke-static {v4, v0}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    invoke-virtual {v4}, Lp1/q;->i0()V

    iget-boolean v15, v4, Lp1/q;->S:Z

    if-eqz v15, :cond_17

    invoke-virtual {v4, v13}, Lp1/q;->l(Lc93/a;)V

    goto :goto_10

    :cond_17
    invoke-virtual {v4}, Lp1/q;->s0()V

    :goto_10
    invoke-static {v4, v14, v1}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v4, v3, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v1, v4, Lp1/q;->S:Z

    if-nez v1, :cond_18

    invoke-virtual {v4}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-static {v1, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_19

    :cond_18
    move-object/from16 v1, p3

    goto :goto_11

    :cond_19
    move-object/from16 v1, p3

    goto :goto_12

    :goto_11
    invoke-static {v5, v4, v5, v1}, Ld;->y(ILp1/q;ILa3/i;)V

    :goto_12
    invoke-static {v4, v11, v0}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    and-int/lit8 v5, v12, 0xe

    const/16 v6, 0xe

    move-object v0, v1

    const/4 v1, 0x0

    move-object v12, v2

    const/4 v2, 0x0

    move-object v15, v3

    const/4 v3, 0x0

    move-object v8, v12

    const/16 v7, 0x30

    move-object v12, v0

    move-object/from16 v0, p0

    invoke-static/range {v0 .. v6}, Lw71/z;->c(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;ZLw71/a0;Landroidx/compose/runtime/Composer;II)V

    const/4 v0, 0x1

    invoke-virtual {v4, v0}, Lp1/q;->q(Z)V

    const/high16 v0, 0x3f800000    # 1.0f

    float-to-double v1, v0

    cmpl-double v1, v1, v16

    if-lez v1, :cond_1a

    goto :goto_13

    :cond_1a
    invoke-static/range {v18 .. v18}, Lm0/a;->a(Ljava/lang/String;)V

    :goto_13
    new-instance v1, Landroidx/compose/foundation/layout/LayoutWeightElement;

    cmpl-float v2, v0, v19

    if-lez v2, :cond_1b

    move/from16 v0, v19

    :cond_1b
    const/4 v2, 0x1

    invoke-direct {v1, v0, v2}, Landroidx/compose/foundation/layout/LayoutWeightElement;-><init>(FZ)V

    sget-object v0, Lb2/e;->O:Lb2/k;

    invoke-static {v8, v0, v4, v7}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v0

    iget-wide v5, v4, Lp1/q;->T:J

    invoke-static {v5, v6}, Ljava/lang/Long;->hashCode(J)I

    move-result v3

    invoke-virtual {v4}, Lp1/q;->m()Lp1/p1;

    move-result-object v5

    invoke-static {v4, v1}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    invoke-virtual {v4}, Lp1/q;->i0()V

    iget-boolean v6, v4, Lp1/q;->S:Z

    if-eqz v6, :cond_1c

    invoke-virtual {v4, v13}, Lp1/q;->l(Lc93/a;)V

    goto :goto_14

    :cond_1c
    invoke-virtual {v4}, Lp1/q;->s0()V

    :goto_14
    invoke-static {v4, v14, v0}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v4, v15, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v0, v4, Lp1/q;->S:Z

    if-nez v0, :cond_1d

    invoke-virtual {v4}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v0

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-static {v0, v5}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1e

    :cond_1d
    invoke-static {v3, v4, v3, v12}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_1e
    invoke-static {v4, v11, v1}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v0, Lx81/d;->a:Lx81/d;

    const/4 v1, 0x6

    invoke-virtual {v0, v4, v1}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v0

    invoke-virtual {v0}, Ly81/i;->X()J

    move-result-wide v11

    new-instance v0, Lb30/l6;

    move-object/from16 v7, p4

    invoke-direct {v0, v7, v9, v10}, Lb30/l6;-><init>(Lkotlin/jvm/functions/Function1;ZZ)V

    const v1, -0x2b6a89c2

    invoke-static {v1, v4, v0}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v17

    const/16 v19, 0x6000

    const/16 v20, 0xd

    move v14, v9

    move v15, v10

    const-wide/16 v9, 0x0

    move v0, v14

    const-wide/16 v13, 0x0

    move v1, v15

    const-wide/16 v15, 0x0

    move-object/from16 v18, v4

    invoke-static/range {v9 .. v20}, Ly81/c;->b(JJJJLc93/m;Landroidx/compose/runtime/Composer;II)V

    invoke-virtual {v4, v2}, Lp1/q;->q(Z)V

    invoke-virtual {v4, v2}, Lp1/q;->q(Z)V

    move v3, v0

    move/from16 v2, v21

    move v4, v1

    goto :goto_15

    :cond_1f
    invoke-virtual {v4}, Lp1/q;->X()V

    move-object/from16 v18, v4

    move v2, v5

    move v3, v9

    move v4, v11

    :goto_15
    invoke-virtual/range {v18 .. v18}, Lp1/q;->u()Lp1/v1;

    move-result-object v9

    if-eqz v9, :cond_20

    new-instance v0, Lw71/e;

    const/4 v8, 0x1

    move-object/from16 v1, p0

    move/from16 v6, p6

    move-object v5, v7

    move/from16 v7, p7

    invoke-direct/range {v0 .. v8}, Lw71/e;-><init>(Lcom/whoop/design/util/TextResource;ZZZLkotlin/jvm/functions/Function1;III)V

    iput-object v0, v9, Lp1/v1;->d:Lc93/m;

    :cond_20
    return-void
.end method

.method private static final e(ZZLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 14

    move-object/from16 v0, p2

    and-int/lit8 v1, p4, 0x3

    const/4 v2, 0x2

    const/4 v3, 0x1

    if-eq v1, v2, :cond_0

    move v1, v3

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    and-int/lit8 v2, p4, 0x1

    move-object/from16 v11, p3

    check-cast v11, Lp1/q;

    invoke-virtual {v11, v2, v1}, Lp1/q;->U(IZ)Z

    move-result v1

    if-eqz v1, :cond_3

    invoke-virtual {v11, v0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v1

    invoke-virtual {v11}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    if-nez v1, :cond_1

    sget-object v1, Lp1/l;->a:Lp1/v0;

    if-ne v2, v1, :cond_2

    :cond_1
    new-instance v2, Lv41/b0;

    const/16 v1, 0x1b

    invoke-direct {v2, v0, v1}, Lv41/b0;-><init>(Lkotlin/jvm/functions/Function1;I)V

    invoke-virtual {v11, v2}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_2
    move-object v10, v2

    check-cast v10, Lkotlin/jvm/functions/Function1;

    const/4 v12, 0x0

    const/16 v13, 0x39

    const/4 v3, 0x0

    const-wide/16 v6, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    move v4, p0

    move v5, p1

    invoke-static/range {v3 .. v13}, Lpz0/d;->e(Landroidx/compose/ui/Modifier;ZZJLpz0/e;Li2/t;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    goto :goto_1

    :cond_3
    invoke-virtual {v11}, Lp1/q;->X()V

    :goto_1
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final f(Lkotlin/jvm/functions/Function1;Z)Ll83/a0;
    .locals 0

    invoke-static {p1}, Ljava/lang/Boolean;->valueOf(Z)Ljava/lang/Boolean;

    move-result-object p1

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final g(Lcom/whoop/design/util/TextResource;ZZZLkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 8

    or-int/lit8 p5, p5, 0x1

    invoke-static {p5}, Lp1/x;->L(I)I

    move-result v6

    move-object v0, p0

    move v1, p1

    move v2, p2

    move v3, p3

    move-object v4, p4

    move v7, p6

    move-object v5, p7

    invoke-static/range {v0 .. v7}, Lw71/h0;->d(Lcom/whoop/design/util/TextResource;ZZZLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method
