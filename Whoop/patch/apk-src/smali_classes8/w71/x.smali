.class public abstract Lw71/x;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000*\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0008\n\u0002\u0008\u0004\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u001a}\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00002\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0006\u001a\u00020\u00042\u0008\u0008\u0002\u0010\u0007\u001a\u00020\u00042\n\u0008\u0002\u0010\u0008\u001a\u0004\u0018\u00010\u00042\u0008\u0008\u0002\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\t2\u0008\u0008\u0002\u0010\r\u001a\u00020\u000c2\u0012\u0010\u0010\u001a\u000e\u0012\u0004\u0012\u00020\u0004\u0012\u0004\u0012\u00020\u000f0\u000eH\u0007\u00a2\u0006\u0004\u0008\u0011\u0010\u0012\u00a8\u0006\u0013"
    }
    d2 = {
        "Lcom/whoop/design/util/TextResource;",
        "question",
        "context",
        "level",
        "",
        "min",
        "max",
        "increment",
        "preSetNumber",
        "",
        "isSubQuestion",
        "enabled",
        "Landroidx/compose/ui/Modifier;",
        "modifier",
        "Lkotlin/Function1;",
        "Ll83/a0;",
        "selectedNumber",
        "d",
        "(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;IIILjava/lang/Integer;ZZLandroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;III)V",
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
.method public static synthetic a(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;IIILjava/lang/Integer;ZZLandroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;IIILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p15}, Lw71/x;->g(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;IIILjava/lang/Integer;ZZLandroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;IIILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lkotlin/jvm/functions/Function1;Lw71/v;F)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, Lw71/x;->f(Lkotlin/jvm/functions/Function1;Lw71/v;F)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Lw71/v;ZLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Lw71/x;->e(Lw71/v;ZLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final d(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;IIILjava/lang/Integer;ZZLandroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;III)V
    .locals 48
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/design/util/TextResource;",
            "Lcom/whoop/design/util/TextResource;",
            "Lcom/whoop/design/util/TextResource;",
            "III",
            "Ljava/lang/Integer;",
            "ZZ",
            "Landroidx/compose/ui/Modifier;",
            "Lkotlin/jvm/functions/Function1;",
            "Landroidx/compose/runtime/Composer;",
            "III)V"
        }
    .end annotation

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move-object/from16 v7, p2

    move/from16 v8, p3

    move/from16 v9, p4

    move/from16 v10, p8

    move-object/from16 v11, p10

    move/from16 v12, p12

    move/from16 v14, p14

    const-string v0, "question"

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "context"

    invoke-static {v2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "level"

    invoke-static {v7, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "selectedNumber"

    invoke-static {v11, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v4, p11

    check-cast v4, Lp1/q;

    const v0, -0x2196c0c5

    invoke-virtual {v4, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, v12, 0x6

    if-nez v0, :cond_1

    invoke-virtual {v4, v1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x4

    goto :goto_0

    :cond_0
    const/4 v0, 0x2

    :goto_0
    or-int/2addr v0, v12

    goto :goto_1

    :cond_1
    move v0, v12

    :goto_1
    and-int/lit8 v5, v12, 0x30

    if-nez v5, :cond_3

    invoke-virtual {v4, v2}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_2

    const/16 v5, 0x20

    goto :goto_2

    :cond_2
    const/16 v5, 0x10

    :goto_2
    or-int/2addr v0, v5

    :cond_3
    and-int/lit16 v5, v12, 0x180

    if-nez v5, :cond_5

    invoke-virtual {v4, v7}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_4

    const/16 v5, 0x100

    goto :goto_3

    :cond_4
    const/16 v5, 0x80

    :goto_3
    or-int/2addr v0, v5

    :cond_5
    and-int/lit16 v5, v12, 0xc00

    if-nez v5, :cond_7

    invoke-virtual {v4, v8}, Lp1/q;->e(I)Z

    move-result v5

    if-eqz v5, :cond_6

    const/16 v5, 0x800

    goto :goto_4

    :cond_6
    const/16 v5, 0x400

    :goto_4
    or-int/2addr v0, v5

    :cond_7
    and-int/lit16 v5, v12, 0x6000

    if-nez v5, :cond_9

    invoke-virtual {v4, v9}, Lp1/q;->e(I)Z

    move-result v5

    if-eqz v5, :cond_8

    const/16 v5, 0x4000

    goto :goto_5

    :cond_8
    const/16 v5, 0x2000

    :goto_5
    or-int/2addr v0, v5

    :cond_9
    and-int/lit8 v5, v14, 0x20

    const/high16 v6, 0x30000

    if-eqz v5, :cond_b

    or-int/2addr v0, v6

    :cond_a
    move/from16 v6, p5

    goto :goto_7

    :cond_b
    and-int/2addr v6, v12

    if-nez v6, :cond_a

    move/from16 v6, p5

    invoke-virtual {v4, v6}, Lp1/q;->e(I)Z

    move-result v15

    if-eqz v15, :cond_c

    const/high16 v15, 0x20000

    goto :goto_6

    :cond_c
    const/high16 v15, 0x10000

    :goto_6
    or-int/2addr v0, v15

    :goto_7
    and-int/lit8 v15, v14, 0x40

    const/high16 v16, 0x180000

    if-eqz v15, :cond_d

    or-int v0, v0, v16

    move-object/from16 v3, p6

    goto :goto_9

    :cond_d
    and-int v16, v12, v16

    move-object/from16 v3, p6

    if-nez v16, :cond_f

    invoke-virtual {v4, v3}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v16

    if-eqz v16, :cond_e

    const/high16 v16, 0x100000

    goto :goto_8

    :cond_e
    const/high16 v16, 0x80000

    :goto_8
    or-int v0, v0, v16

    :cond_f
    :goto_9
    and-int/lit16 v13, v14, 0x80

    const/high16 v16, 0xc00000

    if-eqz v13, :cond_11

    or-int v0, v0, v16

    :cond_10
    move/from16 v16, v0

    move/from16 v0, p7

    goto :goto_b

    :cond_11
    and-int v16, v12, v16

    if-nez v16, :cond_10

    move/from16 v16, v0

    move/from16 v0, p7

    invoke-virtual {v4, v0}, Lp1/q;->h(Z)Z

    move-result v17

    if-eqz v17, :cond_12

    const/high16 v17, 0x800000

    goto :goto_a

    :cond_12
    const/high16 v17, 0x400000

    :goto_a
    or-int v16, v16, v17

    :goto_b
    const/high16 v17, 0x6000000

    and-int v17, v12, v17

    if-nez v17, :cond_14

    invoke-virtual {v4, v10}, Lp1/q;->h(Z)Z

    move-result v17

    if-eqz v17, :cond_13

    const/high16 v17, 0x4000000

    goto :goto_c

    :cond_13
    const/high16 v17, 0x2000000

    :goto_c
    or-int v16, v16, v17

    :cond_14
    and-int/lit16 v0, v14, 0x200

    const/high16 v17, 0x30000000

    if-eqz v0, :cond_16

    or-int v16, v16, v17

    :cond_15
    move/from16 v17, v0

    move-object/from16 v0, p9

    goto :goto_e

    :cond_16
    and-int v17, v12, v17

    if-nez v17, :cond_15

    move/from16 v17, v0

    move-object/from16 v0, p9

    invoke-virtual {v4, v0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v18

    if-eqz v18, :cond_17

    const/high16 v18, 0x20000000

    goto :goto_d

    :cond_17
    const/high16 v18, 0x10000000

    :goto_d
    or-int v16, v16, v18

    :goto_e
    and-int/lit8 v18, p13, 0x6

    if-nez v18, :cond_19

    invoke-virtual {v4, v11}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v18

    if-eqz v18, :cond_18

    const/16 v18, 0x4

    goto :goto_f

    :cond_18
    const/16 v18, 0x2

    :goto_f
    or-int v18, p13, v18

    goto :goto_10

    :cond_19
    move/from16 v18, p13

    :goto_10
    const v19, 0x12492493

    and-int v0, v16, v19

    const v3, 0x12492492

    if-ne v0, v3, :cond_1b

    and-int/lit8 v0, v18, 0x3

    const/4 v3, 0x2

    if-eq v0, v3, :cond_1a

    goto :goto_11

    :cond_1a
    const/4 v0, 0x0

    goto :goto_12

    :cond_1b
    :goto_11
    const/4 v0, 0x1

    :goto_12
    and-int/lit8 v3, v16, 0x1

    invoke-virtual {v4, v3, v0}, Lp1/q;->U(IZ)Z

    move-result v0

    if-eqz v0, :cond_32

    if-eqz v5, :cond_1c

    const/4 v0, 0x1

    goto :goto_13

    :cond_1c
    move/from16 v0, p5

    :goto_13
    if-eqz v15, :cond_1d

    const/4 v3, 0x0

    move-object v15, v3

    goto :goto_14

    :cond_1d
    move-object/from16 v15, p6

    :goto_14
    if-eqz v13, :cond_1e

    const/4 v13, 0x0

    goto :goto_15

    :cond_1e
    move/from16 v13, p7

    :goto_15
    sget-object v3, Lb2/t;->w:Lb2/t;

    if-eqz v17, :cond_1f

    move-object v5, v3

    goto :goto_16

    :cond_1f
    move-object/from16 v5, p9

    :goto_16
    new-instance v6, Lw71/v;

    invoke-direct {v6, v0, v8, v9, v15}, Lw71/v;-><init>(IIILjava/lang/Integer;)V

    sget-object v18, Lw71/c;->a:Lw71/c;

    if-eqz v13, :cond_20

    invoke-virtual/range {v18 .. v18}, Lw71/c;->b()F

    move-result v18

    :goto_17
    move/from16 v20, v18

    goto :goto_18

    :cond_20
    invoke-virtual/range {v18 .. v18}, Lw71/c;->a()F

    move-result v18

    goto :goto_17

    :goto_18
    shl-int/lit8 v18, v16, 0x3

    and-int/lit8 v18, v18, 0x70

    move-object/from16 p5, v6

    const/16 p6, 0x6

    or-int/lit8 v6, v18, 0x6

    move/from16 v18, v0

    const-string v0, "Journal_Slider_"

    invoke-static {v0, v1, v4, v6}, Lw71/a;->c(Ljava/lang/String;Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v0

    const/high16 v6, 0x3f800000    # 1.0f

    invoke-static {v6, v5}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    invoke-static {v1, v0}, Lgb1/d;->d(Landroidx/compose/ui/Modifier;Ljava/lang/String;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    const/4 v1, 0x1

    int-to-float v6, v1

    const/16 v1, 0x8

    int-to-float v1, v1

    mul-float v25, v6, v1

    invoke-static/range {v25 .. v25}, Ll0/m;->i(F)Ll0/k;

    move-result-object v1

    sget-object v6, Lb2/e;->M:Lb2/k;

    move-object/from16 v26, v5

    move/from16 v5, p6

    invoke-static {v1, v6, v4, v5}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v1

    move-object/from16 p6, v6

    iget-wide v5, v4, Lp1/q;->T:J

    invoke-static {v5, v6}, Ljava/lang/Long;->hashCode(J)I

    move-result v5

    invoke-virtual {v4}, Lp1/q;->m()Lp1/p1;

    move-result-object v6

    invoke-static {v4, v0}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    sget-object v19, La3/l;->a:La3/k;

    invoke-virtual/range {v19 .. v19}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v8, La3/k;->b:La3/j;

    invoke-virtual {v4}, Lp1/q;->i0()V

    iget-boolean v9, v4, Lp1/q;->S:Z

    if-eqz v9, :cond_21

    invoke-virtual {v4, v8}, Lp1/q;->l(Lc93/a;)V

    goto :goto_19

    :cond_21
    invoke-virtual {v4}, Lp1/q;->s0()V

    :goto_19
    sget-object v9, La3/k;->g:La3/i;

    invoke-static {v4, v9, v1}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v1, La3/k;->f:La3/i;

    invoke-static {v4, v1, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v6, La3/k;->j:La3/i;

    iget-boolean v12, v4, Lp1/q;->S:Z

    if-nez v12, :cond_22

    invoke-virtual {v4}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v12

    move/from16 v41, v13

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v13

    invoke-static {v12, v13}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v12

    if-nez v12, :cond_23

    goto :goto_1a

    :cond_22
    move/from16 v41, v13

    :goto_1a
    invoke-static {v5, v4, v5, v6}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_23
    sget-object v12, La3/k;->d:La3/i;

    invoke-static {v4, v12, v0}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const/high16 v0, 0x3f800000    # 1.0f

    invoke-static {v0, v3}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v19

    const/16 v23, 0x0

    const/16 v24, 0xe

    const/16 v21, 0x0

    const/16 v22, 0x0

    invoke-static/range {v19 .. v24}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v5

    move/from16 v13, v20

    sget-object v0, Lb2/e;->K:Lb2/l;

    move-object/from16 v19, v3

    sget-object v3, Ll0/m;->g:Ll0/h;

    const/16 v14, 0x36

    invoke-static {v3, v0, v4, v14}, Ll0/p1;->a(Ll0/i;Lb2/g;Landroidx/compose/runtime/Composer;I)Ll0/r1;

    move-result-object v0

    move-object/from16 v20, v15

    iget-wide v14, v4, Lp1/q;->T:J

    invoke-static {v14, v15}, Ljava/lang/Long;->hashCode(J)I

    move-result v3

    invoke-virtual {v4}, Lp1/q;->m()Lp1/p1;

    move-result-object v14

    invoke-static {v4, v5}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v5

    invoke-virtual {v4}, Lp1/q;->i0()V

    iget-boolean v15, v4, Lp1/q;->S:Z

    if-eqz v15, :cond_24

    invoke-virtual {v4, v8}, Lp1/q;->l(Lc93/a;)V

    goto :goto_1b

    :cond_24
    invoke-virtual {v4}, Lp1/q;->s0()V

    :goto_1b
    invoke-static {v4, v9, v0}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v4, v1, v14}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v0, v4, Lp1/q;->S:Z

    if-nez v0, :cond_25

    invoke-virtual {v4}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v0

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v14

    invoke-static {v0, v14}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_26

    :cond_25
    invoke-static {v3, v4, v3, v6}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_26
    invoke-static {v4, v12, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const/high16 v0, 0x40000000    # 2.0f

    float-to-double v14, v0

    const-wide/16 v21, 0x0

    cmpl-double v3, v14, v21

    const-string v14, "invalid weight; must be greater than zero"

    if-lez v3, :cond_27

    goto :goto_1c

    :cond_27
    invoke-static {v14}, Lm0/a;->a(Ljava/lang/String;)V

    :goto_1c
    new-instance v3, Landroidx/compose/foundation/layout/LayoutWeightElement;

    const v15, 0x7f7fffff    # Float.MAX_VALUE

    cmpl-float v5, v0, v15

    if-lez v5, :cond_28

    move v0, v15

    :cond_28
    const/4 v5, 0x1

    invoke-direct {v3, v0, v5}, Landroidx/compose/foundation/layout/LayoutWeightElement;-><init>(FZ)V

    sget-object v0, Ll0/m;->c:Ll0/g;

    move v5, v15

    move-object/from16 v15, p6

    move/from16 p6, v5

    const/4 v5, 0x0

    invoke-static {v0, v15, v4, v5}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v0

    move-object/from16 p9, v6

    iget-wide v5, v4, Lp1/q;->T:J

    invoke-static {v5, v6}, Ljava/lang/Long;->hashCode(J)I

    move-result v5

    invoke-virtual {v4}, Lp1/q;->m()Lp1/p1;

    move-result-object v6

    invoke-static {v4, v3}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    invoke-virtual {v4}, Lp1/q;->i0()V

    iget-boolean v15, v4, Lp1/q;->S:Z

    if-eqz v15, :cond_29

    invoke-virtual {v4, v8}, Lp1/q;->l(Lc93/a;)V

    goto :goto_1d

    :cond_29
    invoke-virtual {v4}, Lp1/q;->s0()V

    :goto_1d
    invoke-static {v4, v9, v0}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v4, v1, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v0, v4, Lp1/q;->S:Z

    if-nez v0, :cond_2a

    invoke-virtual {v4}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v0

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-static {v0, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2b

    :cond_2a
    move-object/from16 v0, p9

    goto :goto_1e

    :cond_2b
    move-object/from16 v0, p9

    goto :goto_1f

    :goto_1e
    invoke-static {v5, v4, v5, v0}, Ld;->y(ILp1/q;ILa3/i;)V

    :goto_1f
    invoke-static {v4, v12, v3}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    shr-int/lit8 v3, v16, 0x3

    and-int/lit8 v3, v3, 0xe

    invoke-static {v2, v4, v3}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v3

    invoke-virtual {v3}, Ljava/lang/String;->length()I

    move-result v3

    if-lez v3, :cond_2c

    const/4 v2, 0x1

    goto :goto_20

    :cond_2c
    const/4 v2, 0x0

    :goto_20
    and-int/lit8 v5, v16, 0x7e

    const/16 v6, 0x8

    const/4 v3, 0x0

    const/4 v15, 0x1

    move-object/from16 v44, p5

    move-object/from16 v46, v0

    move-object/from16 v45, v1

    move-object/from16 p5, v14

    move/from16 v42, v18

    move-object/from16 v47, v19

    move-object/from16 v43, v26

    const/4 v14, 0x6

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    invoke-static/range {v0 .. v6}, Lw71/z;->c(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;ZLw71/a0;Landroidx/compose/runtime/Composer;II)V

    invoke-virtual {v4, v15}, Lp1/q;->q(Z)V

    shr-int/lit8 v0, v16, 0x6

    and-int/lit8 v0, v0, 0xe

    invoke-static {v7, v4, v0}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v0

    const/high16 v1, 0x3f800000    # 1.0f

    float-to-double v2, v1

    cmpl-double v2, v2, v21

    if-lez v2, :cond_2d

    goto :goto_21

    :cond_2d
    invoke-static/range {p5 .. p5}, Lm0/a;->a(Ljava/lang/String;)V

    :goto_21
    new-instance v2, Landroidx/compose/foundation/layout/LayoutWeightElement;

    cmpl-float v3, v1, p6

    if-lez v3, :cond_2e

    move/from16 v6, p6

    :goto_22
    const/4 v5, 0x0

    goto :goto_23

    :cond_2e
    move v6, v1

    goto :goto_22

    :goto_23
    invoke-direct {v2, v6, v5}, Landroidx/compose/foundation/layout/LayoutWeightElement;-><init>(FZ)V

    move/from16 v22, v25

    const/16 v25, 0x0

    const/16 v26, 0xe

    const/16 v23, 0x0

    const/16 v24, 0x0

    move-object/from16 v21, v2

    invoke-static/range {v21 .. v26}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v16

    sget-object v2, Lx81/d;->a:Lx81/d;

    invoke-virtual {v2, v4, v14}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v3

    invoke-virtual {v3}, Ly81/i;->X()J

    move-result-wide v17

    invoke-virtual {v2, v4, v14}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v3

    invoke-virtual {v3}, Lb91/d;->L()Lb91/a;

    move-result-object v35

    new-instance v3, Lw3/k;

    invoke-direct {v3, v14}, Lw3/k;-><init>(I)V

    const/16 v39, 0x0

    const v40, 0x2fdf8

    move-object/from16 v5, v20

    const-wide/16 v19, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const-wide/16 v24, 0x0

    const/16 v26, 0x0

    const-wide/16 v28, 0x0

    const/16 v30, 0x0

    const/16 v31, 0x0

    const/16 v32, 0x0

    const/16 v33, 0x0

    const/16 v34, 0x0

    const/16 v36, 0x0

    const/16 v38, 0x0

    move/from16 v27, v15

    move-object v15, v0

    move/from16 v0, v27

    move-object/from16 v27, v3

    move-object/from16 v37, v4

    invoke-static/range {v15 .. v40}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    invoke-virtual {v4, v0}, Lp1/q;->q(Z)V

    move-object/from16 v3, v47

    invoke-static {v1, v3}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    const/4 v3, 0x0

    const/4 v6, 0x2

    invoke-static {v1, v13, v3, v6}, Landroidx/compose/foundation/layout/a;->r(Landroidx/compose/ui/Modifier;FFI)Landroidx/compose/ui/Modifier;

    move-result-object v1

    sget-object v3, Ll0/m;->e:Ll0/h;

    sget-object v6, Lb2/e;->J:Lb2/l;

    invoke-static {v3, v6, v4, v14}, Ll0/p1;->a(Ll0/i;Lb2/g;Landroidx/compose/runtime/Composer;I)Ll0/r1;

    move-result-object v3

    iget-wide v14, v4, Lp1/q;->T:J

    invoke-static {v14, v15}, Ljava/lang/Long;->hashCode(J)I

    move-result v6

    invoke-virtual {v4}, Lp1/q;->m()Lp1/p1;

    move-result-object v13

    invoke-static {v4, v1}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    invoke-virtual {v4}, Lp1/q;->i0()V

    iget-boolean v14, v4, Lp1/q;->S:Z

    if-eqz v14, :cond_2f

    invoke-virtual {v4, v8}, Lp1/q;->l(Lc93/a;)V

    goto :goto_24

    :cond_2f
    invoke-virtual {v4}, Lp1/q;->s0()V

    :goto_24
    invoke-static {v4, v9, v3}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    move-object/from16 v3, v45

    invoke-static {v4, v3, v13}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v3, v4, Lp1/q;->S:Z

    if-nez v3, :cond_30

    invoke-virtual {v4}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    invoke-static {v3, v8}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_31

    :cond_30
    move-object/from16 v3, v46

    invoke-static {v6, v4, v6, v3}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_31
    invoke-static {v4, v12, v1}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const/4 v14, 0x6

    invoke-virtual {v2, v4, v14}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v1

    invoke-virtual {v1}, Ly81/i;->X()J

    move-result-wide v15

    new-instance v1, La31/c;

    const/16 v2, 0xf

    move-object/from16 v3, v44

    invoke-direct {v1, v3, v10, v11, v2}, La31/c;-><init>(Ljava/lang/Object;ZLjava/lang/Object;I)V

    const v2, -0x341aa18d    # -3.0063846E7f

    invoke-static {v2, v4, v1}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v23

    const/16 v25, 0x6000

    const/16 v26, 0xe

    const-wide/16 v17, 0x0

    const-wide/16 v19, 0x0

    const-wide/16 v21, 0x0

    move-object/from16 v24, v4

    invoke-static/range {v15 .. v26}, Ly81/c;->b(JJJJLc93/m;Landroidx/compose/runtime/Composer;II)V

    invoke-virtual {v4, v0}, Lp1/q;->q(Z)V

    invoke-virtual {v4, v0}, Lp1/q;->q(Z)V

    move-object v7, v5

    move/from16 v8, v41

    move/from16 v6, v42

    move-object/from16 v10, v43

    goto :goto_25

    :cond_32
    invoke-virtual {v4}, Lp1/q;->X()V

    move/from16 v6, p5

    move-object/from16 v7, p6

    move/from16 v8, p7

    move-object/from16 v10, p9

    :goto_25
    invoke-virtual {v4}, Lp1/q;->u()Lp1/v1;

    move-result-object v15

    if-eqz v15, :cond_33

    new-instance v0, Lw71/w;

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move/from16 v4, p3

    move/from16 v5, p4

    move/from16 v9, p8

    move/from16 v12, p12

    move/from16 v13, p13

    move/from16 v14, p14

    invoke-direct/range {v0 .. v14}, Lw71/w;-><init>(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;IIILjava/lang/Integer;ZZLandroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;III)V

    iput-object v0, v15, Lp1/v1;->d:Lc93/m;

    :cond_33
    return-void
.end method

.method private static final e(Lw71/v;ZLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)Ll83/a0;
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

    sget-object v1, Lb2/t;->w:Lb2/t;

    const/high16 v2, 0x3f800000    # 1.0f

    invoke-static {v2, v1}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    int-to-float v1, v3

    const/16 v2, 0x8

    int-to-float v2, v2

    mul-float v5, v1, v2

    const/4 v8, 0x0

    const/16 v9, 0xe

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-static/range {v4 .. v9}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v4

    invoke-virtual {p0}, Lw71/v;->a()F

    move-result v6

    invoke-virtual {p0}, Lw71/v;->c()F

    move-result v1

    invoke-virtual {p0}, Lw71/v;->b()F

    move-result v2

    new-instance v7, Li93/e;

    invoke-direct {v7, v1, v2}, Li93/e;-><init>(FF)V

    invoke-virtual {v11, v0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v1

    invoke-virtual {v11, p0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v2

    or-int/2addr v1, v2

    invoke-virtual {v11}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    if-nez v1, :cond_1

    sget-object v1, Lp1/l;->a:Lp1/v0;

    if-ne v2, v1, :cond_2

    :cond_1
    new-instance v2, Lum0/b;

    const/16 v1, 0x16

    invoke-direct {v2, v1, v0, p0}, Lum0/b;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v11, v2}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_2
    move-object v10, v2

    check-cast v10, Lkotlin/jvm/functions/Function1;

    const/4 v12, 0x6

    const/16 v13, 0x30

    const/4 v8, 0x0

    const/4 v9, 0x0

    move v5, p1

    invoke-static/range {v4 .. v13}, Lhy0/k2;->d(Landroidx/compose/ui/Modifier;ZFLi93/f;ILc93/a;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    goto :goto_1

    :cond_3
    invoke-virtual {v11}, Lp1/q;->X()V

    :goto_1
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final f(Lkotlin/jvm/functions/Function1;Lw71/v;F)Ll83/a0;
    .locals 0

    invoke-virtual {p1, p2}, Lw71/v;->d(F)I

    move-result p1

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final g(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;IIILjava/lang/Integer;ZZLandroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;IIILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 16

    or-int/lit8 v0, p11, 0x1

    invoke-static {v0}, Lp1/x;->L(I)I

    move-result v13

    invoke-static/range {p12 .. p12}, Lp1/x;->L(I)I

    move-result v14

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move-object/from16 v3, p2

    move/from16 v4, p3

    move/from16 v5, p4

    move/from16 v6, p5

    move-object/from16 v7, p6

    move/from16 v8, p7

    move/from16 v9, p8

    move-object/from16 v10, p9

    move-object/from16 v11, p10

    move/from16 v15, p13

    move-object/from16 v12, p14

    invoke-static/range {v1 .. v15}, Lw71/x;->d(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;IIILjava/lang/Integer;ZZLandroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;III)V

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method
