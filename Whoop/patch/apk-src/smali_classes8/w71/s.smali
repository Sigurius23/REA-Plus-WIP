.class public abstract Lw71/s;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000$\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0008\n\u0002\u0008\u0003\n\u0002\u0010\u000b\n\u0002\u0008\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u001aa\u0010\r\u001a\u00020\u000b2\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u00032\n\u0008\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\u0008\u0008\u0002\u0010\u0008\u001a\u00020\u00072\u0006\u0010\t\u001a\u00020\u00072\u0012\u0010\u000c\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u000b0\nH\u0007\u00a2\u0006\u0004\u0008\r\u0010\u000e\u00a8\u0006\u000f"
    }
    d2 = {
        "Lcom/whoop/design/util/TextResource;",
        "question",
        "context",
        "",
        "min",
        "max",
        "preSetNumber",
        "",
        "isSubQuestion",
        "enabled",
        "Lkotlin/Function1;",
        "Ll83/a0;",
        "selectedNumber",
        "h",
        "(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;IILjava/lang/Integer;ZZLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V",
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
.method public static synthetic a(IILjava/lang/Integer;ZLkotlin/jvm/functions/Function1;Lp1/c1;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p7}, Lw71/s;->j(IILjava/lang/Integer;ZLkotlin/jvm/functions/Function1;Lp1/c1;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lp1/c1;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lw71/s;->l(Lp1/c1;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;IILjava/lang/Integer;ZZLkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p11}, Lw71/s;->o(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;IILjava/lang/Integer;ZZLkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(IILjava/lang/Integer;ZLkotlin/jvm/functions/Function1;Lp1/c1;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p7}, Lw71/s;->i(IILjava/lang/Integer;ZLkotlin/jvm/functions/Function1;Lp1/c1;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic e(ILkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 0

    invoke-static {p1, p0}, Lw71/s;->k(Lkotlin/jvm/functions/Function1;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic f(ILkotlin/jvm/functions/Function1;Lp1/c1;)Ll83/a0;
    .locals 0

    invoke-static {p1, p2, p0}, Lw71/s;->n(Lkotlin/jvm/functions/Function1;Lp1/c1;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic g(FIILjava/lang/Integer;ZLkotlin/jvm/functions/Function1;Lp1/c1;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p8}, Lw71/s;->m(FIILjava/lang/Integer;ZLkotlin/jvm/functions/Function1;Lp1/c1;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final h(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;IILjava/lang/Integer;ZZLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V
    .locals 26
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcom/whoop/design/util/TextResource;",
            "Lcom/whoop/design/util/TextResource;",
            "II",
            "Ljava/lang/Integer;",
            "ZZ",
            "Lkotlin/jvm/functions/Function1;",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    move-object/from16 v8, p7

    move/from16 v9, p9

    const-string v2, "question"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "context"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v2, "selectedNumber"

    invoke-static {v8, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v14, p8

    check-cast v14, Lp1/q;

    const v2, -0x56ea70dc

    invoke-virtual {v14, v2}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v2, v9, 0x6

    if-nez v2, :cond_1

    invoke-virtual {v14, v0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    const/4 v2, 0x4

    goto :goto_0

    :cond_0
    const/4 v2, 0x2

    :goto_0
    or-int/2addr v2, v9

    goto :goto_1

    :cond_1
    move v2, v9

    :goto_1
    and-int/lit8 v3, v9, 0x30

    if-nez v3, :cond_3

    invoke-virtual {v14, v1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_2

    const/16 v3, 0x20

    goto :goto_2

    :cond_2
    const/16 v3, 0x10

    :goto_2
    or-int/2addr v2, v3

    :cond_3
    and-int/lit16 v3, v9, 0x180

    move/from16 v7, p2

    if-nez v3, :cond_5

    invoke-virtual {v14, v7}, Lp1/q;->e(I)Z

    move-result v3

    if-eqz v3, :cond_4

    const/16 v3, 0x100

    goto :goto_3

    :cond_4
    const/16 v3, 0x80

    :goto_3
    or-int/2addr v2, v3

    :cond_5
    and-int/lit16 v3, v9, 0xc00

    move/from16 v10, p3

    if-nez v3, :cond_7

    invoke-virtual {v14, v10}, Lp1/q;->e(I)Z

    move-result v3

    if-eqz v3, :cond_6

    const/16 v3, 0x800

    goto :goto_4

    :cond_6
    const/16 v3, 0x400

    :goto_4
    or-int/2addr v2, v3

    :cond_7
    and-int/lit8 v3, p10, 0x10

    if-eqz v3, :cond_9

    or-int/lit16 v2, v2, 0x6000

    :cond_8
    move-object/from16 v4, p4

    goto :goto_6

    :cond_9
    and-int/lit16 v4, v9, 0x6000

    if-nez v4, :cond_8

    move-object/from16 v4, p4

    invoke-virtual {v14, v4}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_a

    const/16 v5, 0x4000

    goto :goto_5

    :cond_a
    const/16 v5, 0x2000

    :goto_5
    or-int/2addr v2, v5

    :goto_6
    and-int/lit8 v5, p10, 0x20

    const/high16 v6, 0x30000

    if-eqz v5, :cond_c

    or-int/2addr v2, v6

    :cond_b
    move/from16 v6, p5

    goto :goto_8

    :cond_c
    and-int/2addr v6, v9

    if-nez v6, :cond_b

    move/from16 v6, p5

    invoke-virtual {v14, v6}, Lp1/q;->h(Z)Z

    move-result v11

    if-eqz v11, :cond_d

    const/high16 v11, 0x20000

    goto :goto_7

    :cond_d
    const/high16 v11, 0x10000

    :goto_7
    or-int/2addr v2, v11

    :goto_8
    const/high16 v11, 0x180000

    and-int/2addr v11, v9

    if-nez v11, :cond_f

    move/from16 v11, p6

    invoke-virtual {v14, v11}, Lp1/q;->h(Z)Z

    move-result v12

    if-eqz v12, :cond_e

    const/high16 v12, 0x100000

    goto :goto_9

    :cond_e
    const/high16 v12, 0x80000

    :goto_9
    or-int/2addr v2, v12

    goto :goto_a

    :cond_f
    move/from16 v11, p6

    :goto_a
    const/high16 v12, 0xc00000

    and-int/2addr v12, v9

    if-nez v12, :cond_11

    invoke-virtual {v14, v8}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v12

    if-eqz v12, :cond_10

    const/high16 v12, 0x800000

    goto :goto_b

    :cond_10
    const/high16 v12, 0x400000

    :goto_b
    or-int/2addr v2, v12

    :cond_11
    const v12, 0x492493

    and-int/2addr v12, v2

    const v13, 0x492492

    if-eq v12, v13, :cond_12

    const/4 v12, 0x1

    goto :goto_c

    :cond_12
    const/4 v12, 0x0

    :goto_c
    and-int/lit8 v13, v2, 0x1

    invoke-virtual {v14, v13, v12}, Lp1/q;->U(IZ)Z

    move-result v12

    if-eqz v12, :cond_25

    if-eqz v3, :cond_13

    const/4 v3, 0x0

    move-object v12, v3

    goto :goto_d

    :cond_13
    move-object v12, v4

    :goto_d
    if-eqz v5, :cond_14

    const/16 v17, 0x0

    goto :goto_e

    :cond_14
    move/from16 v17, v6

    :goto_e
    invoke-virtual {v14}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    sget-object v4, Lp1/l;->a:Lp1/v0;

    if-ne v3, v4, :cond_15

    sget-object v3, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-static {v3}, Lp1/x;->z(Ljava/lang/Object;)Lp1/k1;

    move-result-object v3

    invoke-virtual {v14, v3}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_15
    move-object v13, v3

    check-cast v13, Lp1/c1;

    sget-object v3, Lw71/c;->a:Lw71/c;

    if-eqz v17, :cond_16

    invoke-virtual {v3}, Lw71/c;->b()F

    move-result v3

    :goto_f
    move/from16 v19, v3

    goto :goto_10

    :cond_16
    invoke-virtual {v3}, Lw71/c;->a()F

    move-result v3

    goto :goto_f

    :goto_10
    sget-object v3, Lb2/t;->w:Lb2/t;

    const/high16 v4, 0x3f800000    # 1.0f

    invoke-static {v4, v3}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v18

    const/16 v22, 0x0

    const/16 v23, 0xe

    const/16 v20, 0x0

    const/16 v21, 0x0

    invoke-static/range {v18 .. v23}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v3

    sget-object v5, Lb2/e;->K:Lb2/l;

    sget-object v6, Ll0/m;->g:Ll0/h;

    const/16 v15, 0x36

    invoke-static {v6, v5, v14, v15}, Ll0/p1;->a(Ll0/i;Lb2/g;Landroidx/compose/runtime/Composer;I)Ll0/r1;

    move-result-object v5

    move-object/from16 p4, v12

    iget-wide v11, v14, Lp1/q;->T:J

    invoke-static {v11, v12}, Ljava/lang/Long;->hashCode(J)I

    move-result v6

    invoke-virtual {v14}, Lp1/q;->m()Lp1/p1;

    move-result-object v11

    invoke-static {v14, v3}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    sget-object v12, La3/l;->a:La3/k;

    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v12, La3/k;->b:La3/j;

    invoke-virtual {v14}, Lp1/q;->i0()V

    iget-boolean v15, v14, Lp1/q;->S:Z

    if-eqz v15, :cond_17

    invoke-virtual {v14, v12}, Lp1/q;->l(Lc93/a;)V

    goto :goto_11

    :cond_17
    invoke-virtual {v14}, Lp1/q;->s0()V

    :goto_11
    sget-object v15, La3/k;->g:La3/i;

    invoke-static {v14, v15, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v5, La3/k;->f:La3/i;

    invoke-static {v14, v5, v11}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v11, La3/k;->j:La3/i;

    iget-boolean v4, v14, Lp1/q;->S:Z

    if-nez v4, :cond_18

    invoke-virtual {v14}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v4, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_19

    :cond_18
    invoke-static {v6, v14, v6, v11}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_19
    sget-object v0, La3/k;->d:La3/i;

    invoke-static {v14, v0, v3}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const/high16 v3, 0x3f800000    # 1.0f

    float-to-double v6, v3

    const-wide/16 v20, 0x0

    cmpl-double v4, v6, v20

    const-string v7, "invalid weight; must be greater than zero"

    if-lez v4, :cond_1a

    goto :goto_12

    :cond_1a
    invoke-static {v7}, Lm0/a;->a(Ljava/lang/String;)V

    :goto_12
    new-instance v4, Landroidx/compose/foundation/layout/LayoutWeightElement;

    const v16, 0x7f7fffff    # Float.MAX_VALUE

    cmpl-float v6, v3, v16

    if-lez v6, :cond_1b

    move/from16 v6, v16

    :goto_13
    move-object/from16 v18, v15

    const/4 v15, 0x1

    goto :goto_14

    :cond_1b
    move v6, v3

    goto :goto_13

    :goto_14
    invoke-direct {v4, v6, v15}, Landroidx/compose/foundation/layout/LayoutWeightElement;-><init>(FZ)V

    move-object/from16 v6, v18

    sget-object v3, Lb2/e;->M:Lb2/k;

    sget-object v15, Ll0/m;->c:Ll0/g;

    move-object/from16 v22, v7

    const/16 v7, 0x30

    invoke-static {v15, v3, v14, v7}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v3

    iget-wide v7, v14, Lp1/q;->T:J

    invoke-static {v7, v8}, Ljava/lang/Long;->hashCode(J)I

    move-result v7

    invoke-virtual {v14}, Lp1/q;->m()Lp1/p1;

    move-result-object v8

    invoke-static {v14, v4}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    invoke-virtual {v14}, Lp1/q;->i0()V

    move/from16 v24, v2

    iget-boolean v2, v14, Lp1/q;->S:Z

    if-eqz v2, :cond_1c

    invoke-virtual {v14, v12}, Lp1/q;->l(Lc93/a;)V

    goto :goto_15

    :cond_1c
    invoke-virtual {v14}, Lp1/q;->s0()V

    :goto_15
    invoke-static {v14, v6, v3}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v14, v5, v8}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v2, v14, Lp1/q;->S:Z

    if-nez v2, :cond_1d

    invoke-virtual {v14}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_1e

    :cond_1d
    invoke-static {v7, v14, v7, v11}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_1e
    invoke-static {v14, v0, v4}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    shr-int/lit8 v2, v24, 0x3

    and-int/lit8 v2, v2, 0xe

    invoke-static {v1, v14, v2}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v2

    invoke-virtual {v2}, Ljava/lang/String;->length()I

    move-result v2

    if-lez v2, :cond_1f

    const/4 v2, 0x1

    goto :goto_16

    :cond_1f
    const/4 v2, 0x0

    :goto_16
    and-int/lit8 v3, v24, 0x7e

    move-object v4, v6

    const/16 v6, 0x8

    move-object v7, v5

    move v5, v3

    const/4 v3, 0x0

    move-object/from16 v25, v0

    move-object v8, v4

    move-object v4, v14

    move-object/from16 v0, p0

    move-object v14, v7

    const/high16 v7, 0x3f800000    # 1.0f

    invoke-static/range {v0 .. v6}, Lw71/z;->c(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;ZLw71/a0;Landroidx/compose/runtime/Composer;II)V

    move-object v0, v4

    const/4 v1, 0x1

    invoke-virtual {v0, v1}, Lp1/q;->q(Z)V

    float-to-double v2, v7

    cmpl-double v2, v2, v20

    if-lez v2, :cond_20

    goto :goto_17

    :cond_20
    invoke-static/range {v22 .. v22}, Lm0/a;->a(Ljava/lang/String;)V

    :goto_17
    new-instance v2, Landroidx/compose/foundation/layout/LayoutWeightElement;

    cmpl-float v3, v7, v16

    if-lez v3, :cond_21

    move/from16 v4, v16

    :goto_18
    const/4 v1, 0x1

    goto :goto_19

    :cond_21
    move v4, v7

    goto :goto_18

    :goto_19
    invoke-direct {v2, v4, v1}, Landroidx/compose/foundation/layout/LayoutWeightElement;-><init>(FZ)V

    sget-object v3, Lb2/e;->O:Lb2/k;

    const/16 v4, 0x30

    invoke-static {v15, v3, v0, v4}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v3

    iget-wide v4, v0, Lp1/q;->T:J

    invoke-static {v4, v5}, Ljava/lang/Long;->hashCode(J)I

    move-result v4

    invoke-virtual {v0}, Lp1/q;->m()Lp1/p1;

    move-result-object v5

    invoke-static {v0, v2}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    invoke-virtual {v0}, Lp1/q;->i0()V

    iget-boolean v6, v0, Lp1/q;->S:Z

    if-eqz v6, :cond_22

    invoke-virtual {v0, v12}, Lp1/q;->l(Lc93/a;)V

    goto :goto_1a

    :cond_22
    invoke-virtual {v0}, Lp1/q;->s0()V

    :goto_1a
    invoke-static {v0, v8, v3}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v0, v14, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v3, v0, Lp1/q;->S:Z

    if-nez v3, :cond_24

    invoke-virtual {v0}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-static {v3, v5}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_23

    goto :goto_1c

    :cond_23
    :goto_1b
    move-object/from16 v3, v25

    goto :goto_1d

    :cond_24
    :goto_1c
    invoke-static {v4, v0, v4, v11}, Ld;->y(ILp1/q;ILa3/i;)V

    goto :goto_1b

    :goto_1d
    invoke-static {v0, v3, v2}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-interface {v13}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/lang/Boolean;

    invoke-virtual {v2}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v2

    const/4 v15, 0x1

    xor-int/lit8 v8, v2, 0x1

    move-object v14, v0

    new-instance v0, Lw71/q;

    const/4 v7, 0x0

    move/from16 v1, p2

    move-object/from16 v3, p4

    move/from16 v4, p6

    move-object/from16 v5, p7

    move v2, v10

    move-object v6, v13

    invoke-direct/range {v0 .. v7}, Lw71/q;-><init>(IILjava/lang/Integer;ZLkotlin/jvm/functions/Function1;Lp1/c1;I)V

    const v1, -0x554bad05

    invoke-static {v1, v14, v0}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v13

    move v1, v15

    const/16 v15, 0xc00

    const/16 v16, 0x6

    const/4 v11, 0x0

    const/4 v12, 0x0

    move v10, v8

    invoke-static/range {v10 .. v16}, Lkd1/d0;->c(ZLc0/c1;Lc0/e1;Lc93/m;Landroidx/compose/runtime/Composer;II)V

    invoke-virtual {v14, v1}, Lp1/q;->q(Z)V

    invoke-virtual {v14, v1}, Lp1/q;->q(Z)V

    invoke-interface {v6}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Ljava/lang/Boolean;

    invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z

    move-result v10

    new-instance v0, Lez0/a;

    move/from16 v2, p2

    move/from16 v5, p6

    move-object v4, v3

    move-object v7, v6

    move/from16 v1, v19

    move/from16 v3, p3

    move-object/from16 v6, p7

    invoke-direct/range {v0 .. v7}, Lez0/a;-><init>(FIILjava/lang/Integer;ZLkotlin/jvm/functions/Function1;Lp1/c1;)V

    move-object v3, v4

    const v1, 0x31f3046a

    invoke-static {v1, v14, v0}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v13

    invoke-static/range {v10 .. v16}, Lkd1/d0;->c(ZLc0/c1;Lc0/e1;Lc93/m;Landroidx/compose/runtime/Composer;II)V

    move-object v5, v3

    move/from16 v6, v17

    goto :goto_1e

    :cond_25
    invoke-virtual {v14}, Lp1/q;->X()V

    move-object v5, v4

    :goto_1e
    invoke-virtual {v14}, Lp1/q;->u()Lp1/v1;

    move-result-object v11

    if-eqz v11, :cond_26

    new-instance v0, Lw71/r;

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move/from16 v3, p2

    move/from16 v4, p3

    move/from16 v7, p6

    move-object/from16 v8, p7

    move/from16 v10, p10

    invoke-direct/range {v0 .. v10}, Lw71/r;-><init>(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;IILjava/lang/Integer;ZZLkotlin/jvm/functions/Function1;II)V

    iput-object v0, v11, Lp1/v1;->d:Lc93/m;

    :cond_26
    return-void
.end method

.method private static final i(IILjava/lang/Integer;ZLkotlin/jvm/functions/Function1;Lp1/c1;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 20

    and-int/lit8 v0, p7, 0x3

    const/4 v1, 0x2

    const/4 v2, 0x1

    if-eq v0, v1, :cond_0

    move v0, v2

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    and-int/lit8 v1, p7, 0x1

    move-object/from16 v11, p6

    check-cast v11, Lp1/q;

    invoke-virtual {v11, v1, v0}, Lp1/q;->U(IZ)Z

    move-result v0

    if-eqz v0, :cond_1

    sget-object v0, Lx81/d;->a:Lx81/d;

    const/4 v1, 0x6

    invoke-virtual {v0, v11, v1}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v0

    invoke-virtual {v0}, Ly81/i;->X()J

    move-result-wide v6

    new-instance v12, Lw71/q;

    const/16 v19, 0x1

    move/from16 v13, p0

    move/from16 v14, p1

    move-object/from16 v15, p2

    move/from16 v16, p3

    move-object/from16 v17, p4

    move-object/from16 v18, p5

    invoke-direct/range {v12 .. v19}, Lw71/q;-><init>(IILjava/lang/Integer;ZLkotlin/jvm/functions/Function1;Lp1/c1;I)V

    const v0, -0x1803ff0c

    invoke-static {v0, v11, v12}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v10

    const/16 v12, 0x6000

    const/16 v13, 0xb

    const-wide/16 v2, 0x0

    const-wide/16 v4, 0x0

    const-wide/16 v8, 0x0

    invoke-static/range {v2 .. v13}, Ly81/c;->b(JJJJLc93/m;Landroidx/compose/runtime/Composer;II)V

    goto :goto_1

    :cond_1
    invoke-virtual {v11}, Lp1/q;->X()V

    :goto_1
    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method

.method private static final j(IILjava/lang/Integer;ZLkotlin/jvm/functions/Function1;Lp1/c1;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 12

    move-object/from16 v0, p4

    and-int/lit8 v1, p7, 0x3

    const/4 v2, 0x2

    const/4 v3, 0x1

    if-eq v1, v2, :cond_0

    move v1, v3

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    and-int/lit8 v2, p7, 0x1

    move-object/from16 v9, p6

    check-cast v9, Lp1/q;

    invoke-virtual {v9, v2, v1}, Lp1/q;->U(IZ)Z

    move-result v1

    if-eqz v1, :cond_4

    invoke-virtual {v9, v0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v1

    invoke-virtual {v9}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    sget-object v3, Lp1/l;->a:Lp1/v0;

    if-nez v1, :cond_1

    if-ne v2, v3, :cond_2

    :cond_1
    new-instance v2, Lv41/b0;

    const/16 v1, 0x1a

    invoke-direct {v2, v0, v1}, Lv41/b0;-><init>(Lkotlin/jvm/functions/Function1;I)V

    invoke-virtual {v9, v2}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_2
    move-object v7, v2

    check-cast v7, Lkotlin/jvm/functions/Function1;

    invoke-virtual {v9}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v3, :cond_3

    new-instance v0, Luz1/g;

    const/16 v1, 0xa

    move-object/from16 v2, p5

    invoke-direct {v0, v1, v2}, Luz1/g;-><init>(ILp1/c1;)V

    invoke-virtual {v9, v0}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_3
    move-object v8, v0

    check-cast v8, Lc93/a;

    const/high16 v10, 0x30000

    const/4 v11, 0x0

    move v3, p0

    move v4, p1

    move-object v5, p2

    move v6, p3

    invoke-static/range {v3 .. v11}, La31/f;->f(IILjava/lang/Integer;ZLkotlin/jvm/functions/Function1;Lc93/a;Landroidx/compose/runtime/Composer;II)V

    goto :goto_1

    :cond_4
    invoke-virtual {v9}, Lp1/q;->X()V

    :goto_1
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final k(Lkotlin/jvm/functions/Function1;I)Ll83/a0;
    .locals 0

    invoke-static {p1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p1

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final l(Lp1/c1;)Ll83/a0;
    .locals 1

    sget-object v0, Ljava/lang/Boolean;->TRUE:Ljava/lang/Boolean;

    invoke-interface {p0, v0}, Lp1/c1;->setValue(Ljava/lang/Object;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final m(FIILjava/lang/Integer;ZLkotlin/jvm/functions/Function1;Lp1/c1;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 16

    move-object/from16 v0, p5

    and-int/lit8 v1, p8, 0x3

    const/4 v2, 0x2

    const/4 v3, 0x1

    if-eq v1, v2, :cond_0

    move v1, v3

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    and-int/lit8 v2, p8, 0x1

    move-object/from16 v9, p7

    check-cast v9, Lp1/q;

    invoke-virtual {v9, v2, v1}, Lp1/q;->U(IZ)Z

    move-result v1

    if-eqz v1, :cond_8

    sget-object v1, Lb2/t;->w:Lb2/t;

    const/high16 v2, 0x3f800000    # 1.0f

    invoke-static {v2, v1}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v10

    const/4 v14, 0x0

    const/16 v15, 0xe

    const/4 v12, 0x0

    const/4 v13, 0x0

    move/from16 v11, p0

    invoke-static/range {v10 .. v15}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v1

    sget-object v2, Lb2/e;->K:Lb2/l;

    sget-object v4, Ll0/m;->g:Ll0/h;

    const/16 v5, 0x36

    invoke-static {v4, v2, v9, v5}, Ll0/p1;->a(Ll0/i;Lb2/g;Landroidx/compose/runtime/Composer;I)Ll0/r1;

    move-result-object v2

    iget-wide v4, v9, Lp1/q;->T:J

    invoke-static {v4, v5}, Ljava/lang/Long;->hashCode(J)I

    move-result v4

    invoke-virtual {v9}, Lp1/q;->m()Lp1/p1;

    move-result-object v5

    invoke-static {v9, v1}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    sget-object v6, La3/l;->a:La3/k;

    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v6, La3/k;->b:La3/j;

    invoke-virtual {v9}, Lp1/q;->i0()V

    iget-boolean v7, v9, Lp1/q;->S:Z

    if-eqz v7, :cond_1

    invoke-virtual {v9, v6}, Lp1/q;->l(Lc93/a;)V

    goto :goto_1

    :cond_1
    invoke-virtual {v9}, Lp1/q;->s0()V

    :goto_1
    sget-object v6, La3/k;->g:La3/i;

    invoke-static {v9, v6, v2}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v2, La3/k;->f:La3/i;

    invoke-static {v9, v2, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v2, La3/k;->j:La3/i;

    iget-boolean v5, v9, Lp1/q;->S:Z

    if-nez v5, :cond_2

    invoke-virtual {v9}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-static {v5, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_3

    :cond_2
    invoke-static {v4, v9, v4, v2}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_3
    sget-object v2, La3/k;->d:La3/i;

    invoke-static {v9, v2, v1}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v1, Lx81/d;->a:Lx81/d;

    const/4 v2, 0x6

    invoke-virtual {v1, v9, v2}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v1

    invoke-virtual {v1}, Ly81/i;->X()J

    move-result-wide v1

    new-instance v4, Li93/j;

    move/from16 v5, p1

    move/from16 v6, p2

    invoke-direct {v4, v5, v6, v3}, Li93/h;-><init>(III)V

    invoke-virtual {v9, v1, v2}, Lp1/q;->f(J)Z

    move-result v5

    invoke-virtual {v9}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v6

    sget-object v7, Lp1/l;->a:Lp1/v0;

    if-nez v5, :cond_4

    if-ne v6, v7, :cond_5

    :cond_4
    new-instance v6, Lw71/s$a;

    invoke-direct {v6, v1, v2}, Lw71/s$a;-><init>(J)V

    invoke-virtual {v9, v6}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_5
    check-cast v6, Lc93/a;

    invoke-virtual {v9, v0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v1

    invoke-virtual {v9}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    if-nez v1, :cond_6

    if-ne v2, v7, :cond_7

    :cond_6
    new-instance v2, Lp40/b;

    const/16 v1, 0x10

    move-object/from16 v5, p6

    invoke-direct {v2, v0, v5, v1}, Lp40/b;-><init>(Lkotlin/jvm/functions/Function1;Lp1/c1;I)V

    invoke-virtual {v9, v2}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_7
    move-object v8, v2

    check-cast v8, Lkotlin/jvm/functions/Function1;

    const/4 v10, 0x0

    const/4 v11, 0x0

    move-object/from16 v5, p3

    move-object v7, v6

    move/from16 v6, p4

    invoke-static/range {v4 .. v11}, Lz21/b;->m(Li93/j;Ljava/lang/Integer;ZLc93/a;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    invoke-virtual {v9, v3}, Lp1/q;->q(Z)V

    goto :goto_2

    :cond_8
    invoke-virtual {v9}, Lp1/q;->X()V

    :goto_2
    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method

.method private static final n(Lkotlin/jvm/functions/Function1;Lp1/c1;I)Ll83/a0;
    .locals 0

    invoke-static {p2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object p2

    invoke-interface {p0, p2}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ljava/lang/Boolean;->FALSE:Ljava/lang/Boolean;

    invoke-interface {p1, p0}, Lp1/c1;->setValue(Ljava/lang/Object;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final o(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;IILjava/lang/Integer;ZZLkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 12

    or-int/lit8 v0, p8, 0x1

    invoke-static {v0}, Lp1/x;->L(I)I

    move-result v10

    move-object v1, p0

    move-object v2, p1

    move v3, p2

    move v4, p3

    move-object/from16 v5, p4

    move/from16 v6, p5

    move/from16 v7, p6

    move-object/from16 v8, p7

    move/from16 v11, p9

    move-object/from16 v9, p10

    invoke-static/range {v1 .. v11}, Lw71/s;->h(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;IILjava/lang/Integer;ZZLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method
