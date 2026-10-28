.class public abstract Lau2/h;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000$\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u001aI\u0010\u000b\u001a\u00020\t2\u0006\u0010\u0001\u001a\u00020\u00002\u0008\u0010\u0002\u001a\u0004\u0018\u00010\u00002\u0006\u0010\u0004\u001a\u00020\u00032\u0008\u0008\u0002\u0010\u0006\u001a\u00020\u00052\u0014\u0008\u0002\u0010\n\u001a\u000e\u0012\u0004\u0012\u00020\u0008\u0012\u0004\u0012\u00020\t0\u0007H\u0007\u00a2\u0006\u0004\u0008\u000b\u0010\u000c\u00a8\u0006\r"
    }
    d2 = {
        "Lwt2/a;",
        "primaryButton",
        "secondaryButton",
        "",
        "isNewSummaryEnabled",
        "Ly3/f;",
        "bottomSpacing",
        "Lkotlin/Function1;",
        "Lcom/whoop/navigation/e;",
        "Ll83/a0;",
        "onButtonClicked",
        "h",
        "(Lwt2/a;Lwt2/a;ZFLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V",
        "weekly-plan_release"
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
.method public static synthetic a(Lwt2/a;Lwt2/a;ZFLkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p8}, Lau2/h;->l(Lwt2/a;Lwt2/a;ZFLkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lkotlin/jvm/functions/Function1;Lwt2/a;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lau2/h;->j(Lkotlin/jvm/functions/Function1;Lwt2/a;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Lwt2/a;Lwt2/a;ZFLkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p8}, Lau2/h;->o(Lwt2/a;Lwt2/a;ZFLkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Lkotlin/jvm/functions/Function1;Lwt2/a;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lau2/h;->m(Lkotlin/jvm/functions/Function1;Lwt2/a;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic e(Lkotlin/jvm/functions/Function1;Lwt2/a;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lau2/h;->k(Lkotlin/jvm/functions/Function1;Lwt2/a;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic f(Lcom/whoop/navigation/e;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lau2/h;->i(Lcom/whoop/navigation/e;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic g(Lkotlin/jvm/functions/Function1;Lwt2/a;Ljava/lang/Object;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, Lau2/h;->n(Lkotlin/jvm/functions/Function1;Lwt2/a;Ljava/lang/Object;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final h(Lwt2/a;Lwt2/a;ZFLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V
    .locals 36
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lwt2/a;",
            "Lwt2/a;",
            "ZF",
            "Lkotlin/jvm/functions/Function1;",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move/from16 v3, p2

    move/from16 v6, p6

    const-string v0, "primaryButton"

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v10, p5

    check-cast v10, Lp1/q;

    const v0, -0x19571858

    invoke-virtual {v10, v0}, Lp1/q;->g0(I)Lp1/q;

    iget-boolean v0, v10, Lp1/q;->S:Z

    if-eqz v0, :cond_0

    iget-object v0, v10, Lp1/q;->I:Lp1/i2;

    iget v0, v0, Lp1/i2;->v:I

    neg-int v0, v0

    goto :goto_0

    :cond_0
    iget-object v0, v10, Lp1/q;->G:Lp1/e2;

    iget v0, v0, Lp1/e2;->i:I

    :goto_0
    and-int/lit8 v4, v6, 0x6

    const/4 v5, 0x4

    if-nez v4, :cond_3

    and-int/lit8 v4, v6, 0x8

    if-nez v4, :cond_1

    invoke-virtual {v10, v1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v4

    goto :goto_1

    :cond_1
    invoke-virtual {v10, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v4

    :goto_1
    if-eqz v4, :cond_2

    move v4, v5

    goto :goto_2

    :cond_2
    const/4 v4, 0x2

    :goto_2
    or-int/2addr v4, v6

    goto :goto_3

    :cond_3
    move v4, v6

    :goto_3
    and-int/lit8 v7, v6, 0x30

    if-nez v7, :cond_6

    and-int/lit8 v7, v6, 0x40

    if-nez v7, :cond_4

    invoke-virtual {v10, v2}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v7

    goto :goto_4

    :cond_4
    invoke-virtual {v10, v2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v7

    :goto_4
    if-eqz v7, :cond_5

    const/16 v7, 0x20

    goto :goto_5

    :cond_5
    const/16 v7, 0x10

    :goto_5
    or-int/2addr v4, v7

    :cond_6
    and-int/lit16 v7, v6, 0x180

    if-nez v7, :cond_8

    invoke-virtual {v10, v3}, Lp1/q;->h(Z)Z

    move-result v7

    if-eqz v7, :cond_7

    const/16 v7, 0x100

    goto :goto_6

    :cond_7
    const/16 v7, 0x80

    :goto_6
    or-int/2addr v4, v7

    :cond_8
    and-int/lit8 v7, p7, 0x8

    if-eqz v7, :cond_a

    or-int/lit16 v4, v4, 0xc00

    :cond_9
    move/from16 v9, p3

    goto :goto_8

    :cond_a
    and-int/lit16 v9, v6, 0xc00

    if-nez v9, :cond_9

    move/from16 v9, p3

    invoke-virtual {v10, v9}, Lp1/q;->d(F)Z

    move-result v11

    if-eqz v11, :cond_b

    const/16 v11, 0x800

    goto :goto_7

    :cond_b
    const/16 v11, 0x400

    :goto_7
    or-int/2addr v4, v11

    :goto_8
    and-int/lit8 v11, p7, 0x10

    if-eqz v11, :cond_d

    or-int/lit16 v4, v4, 0x6000

    :cond_c
    move-object/from16 v14, p4

    goto :goto_a

    :cond_d
    and-int/lit16 v14, v6, 0x6000

    if-nez v14, :cond_c

    move-object/from16 v14, p4

    invoke-virtual {v10, v14}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v15

    if-eqz v15, :cond_e

    const/16 v15, 0x4000

    goto :goto_9

    :cond_e
    const/16 v15, 0x2000

    :goto_9
    or-int/2addr v4, v15

    :goto_a
    and-int/lit16 v15, v4, 0x2493

    const/16 v8, 0x2492

    if-eq v15, v8, :cond_f

    const/4 v8, 0x1

    goto :goto_b

    :cond_f
    const/4 v8, 0x0

    :goto_b
    and-int/lit8 v15, v4, 0x1

    invoke-virtual {v10, v15, v8}, Lp1/q;->U(IZ)Z

    move-result v8

    if-eqz v8, :cond_2e

    const/16 v8, 0x8

    if-eqz v7, :cond_10

    int-to-float v7, v5

    int-to-float v15, v8

    mul-float/2addr v7, v15

    move/from16 v25, v4

    move v4, v7

    goto :goto_c

    :cond_10
    move/from16 v25, v4

    move/from16 v4, p3

    :goto_c
    sget-object v7, Lp1/l;->a:Lp1/v0;

    if-eqz v11, :cond_12

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v11

    if-ne v11, v7, :cond_11

    new-instance v11, Lat2/b1;

    const/16 v14, 0xb

    invoke-direct {v11, v14}, Lat2/b1;-><init>(I)V

    invoke-virtual {v10, v11}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_11
    check-cast v11, Lkotlin/jvm/functions/Function1;

    goto :goto_d

    :cond_12
    move-object v11, v14

    :goto_d
    sget-object v14, Lb2/e;->N:Lb2/k;

    sget-object v15, Ll0/m;->c:Ll0/g;

    const/16 v9, 0x30

    invoke-static {v15, v14, v10, v9}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v9

    iget-wide v14, v10, Lp1/q;->T:J

    invoke-static {v14, v15}, Ljava/lang/Long;->hashCode(J)I

    move-result v14

    invoke-virtual {v10}, Lp1/q;->m()Lp1/p1;

    move-result-object v15

    sget-object v8, Lb2/t;->w:Lb2/t;

    invoke-static {v10, v8}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v13

    sget-object v20, La3/l;->a:La3/k;

    invoke-virtual/range {v20 .. v20}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v5, La3/k;->b:La3/j;

    invoke-virtual {v10}, Lp1/q;->i0()V

    iget-boolean v12, v10, Lp1/q;->S:Z

    if-eqz v12, :cond_13

    invoke-virtual {v10, v5}, Lp1/q;->l(Lc93/a;)V

    goto :goto_e

    :cond_13
    invoke-virtual {v10}, Lp1/q;->s0()V

    :goto_e
    sget-object v5, La3/k;->g:La3/i;

    invoke-static {v10, v5, v9}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v5, La3/k;->f:La3/i;

    invoke-static {v10, v5, v15}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v5, La3/k;->j:La3/i;

    iget-boolean v9, v10, Lp1/q;->S:Z

    if-nez v9, :cond_14

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v9

    invoke-static {v14}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v12

    invoke-static {v9, v12}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v9

    if-nez v9, :cond_15

    :cond_14
    invoke-static {v14, v10, v14, v5}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_15
    sget-object v5, La3/k;->d:La3/i;

    invoke-static {v10, v5, v13}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const v5, -0x68ab3c4f

    invoke-virtual {v10, v5}, Lp1/q;->e0(I)V

    const/high16 v5, 0x3f800000    # 1.0f

    const v9, 0xe000

    if-eqz v3, :cond_21

    const v12, -0x68ab6446

    invoke-virtual {v10, v12}, Lp1/q;->e0(I)V

    invoke-static {v5, v8}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v5

    invoke-virtual {v1}, Lwt2/a;->d()Lcom/whoop/design/util/TextResource;

    move-result-object v13

    and-int v9, v25, v9

    const/16 v12, 0x4000

    if-ne v9, v12, :cond_16

    const/4 v14, 0x1

    goto :goto_f

    :cond_16
    const/4 v14, 0x0

    :goto_f
    and-int/lit8 v15, v25, 0xe

    const/4 v12, 0x4

    if-eq v15, v12, :cond_18

    and-int/lit8 v12, v25, 0x8

    if-eqz v12, :cond_17

    invoke-virtual {v10, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v12

    if-eqz v12, :cond_17

    goto :goto_10

    :cond_17
    const/4 v12, 0x0

    goto :goto_11

    :cond_18
    :goto_10
    const/4 v12, 0x1

    :goto_11
    or-int/2addr v12, v14

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v14

    if-nez v12, :cond_19

    if-ne v14, v7, :cond_1a

    :cond_19
    new-instance v14, Lau2/f;

    const/4 v12, 0x0

    invoke-direct {v14, v11, v1, v12}, Lau2/f;-><init>(Lkotlin/jvm/functions/Function1;Lwt2/a;I)V

    invoke-virtual {v10, v14}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_1a
    check-cast v14, Lc93/a;

    sget v26, Lcom/whoop/design/util/TextResource;->$stable:I

    shl-int/lit8 v12, v26, 0x12

    or-int/lit8 v22, v12, 0x6

    const/16 v23, 0x0

    const/16 v24, 0x1fbe

    move-object v12, v8

    const/4 v8, 0x0

    move v15, v9

    const/4 v9, 0x0

    move-object/from16 v18, v10

    const/4 v10, 0x0

    move-object/from16 v19, v11

    const/4 v11, 0x0

    move-object/from16 v21, v12

    const/4 v12, 0x0

    move-object/from16 v20, v14

    const/16 v27, 0x4000

    const/4 v14, 0x0

    move/from16 v28, v15

    const/4 v15, 0x0

    const/16 v29, 0x1

    const/16 v16, 0x0

    const/16 v30, 0x0

    const/16 v17, 0x0

    move-object/from16 v31, v21

    move-object/from16 v21, v18

    const/16 v18, 0x0

    move-object/from16 v32, v19

    const/16 v19, 0x0

    move-object/from16 v33, v7

    move/from16 v1, v28

    move/from16 v3, v30

    move-object/from16 v34, v31

    move-object v7, v5

    move-object/from16 v5, v32

    invoke-static/range {v7 .. v24}, Lny0/z;->j(Landroidx/compose/ui/Modifier;ZZLjava/lang/Integer;Landroidx/compose/ui/Modifier;Lv41/r0;Lcom/whoop/design/util/TextResource;Lg1/u0;Li2/t;Lf0/t;FLl0/k1;Lb91/a;Lc93/a;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v10, v21

    if-nez v2, :cond_1b

    const v1, -0x68a788e1

    invoke-virtual {v10, v1}, Lp1/q;->e0(I)V

    invoke-virtual {v10, v3}, Lp1/q;->q(Z)V

    move-object/from16 v1, v34

    goto/16 :goto_14

    :cond_1b
    const v7, -0x68a788e0

    invoke-virtual {v10, v7}, Lp1/q;->e0(I)V

    const/4 v7, 0x3

    int-to-float v7, v7

    const/4 v12, 0x4

    int-to-float v8, v12

    mul-float/2addr v7, v8

    move-object/from16 v8, v34

    invoke-static {v7, v8}, Landroidx/compose/foundation/layout/d;->h(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v7

    invoke-static {v10, v7}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    invoke-virtual {v2}, Lwt2/a;->d()Lcom/whoop/design/util/TextResource;

    move-result-object v9

    const/16 v12, 0x4000

    if-ne v1, v12, :cond_1c

    move/from16 v1, v29

    goto :goto_12

    :cond_1c
    move v1, v3

    :goto_12
    and-int/lit8 v7, v25, 0x70

    const/16 v11, 0x20

    if-eq v7, v11, :cond_1e

    and-int/lit8 v7, v25, 0x40

    if-eqz v7, :cond_1d

    invoke-virtual {v10, v2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_1d

    goto :goto_13

    :cond_1d
    move/from16 v29, v3

    :cond_1e
    :goto_13
    or-int v1, v1, v29

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v7

    if-nez v1, :cond_1f

    move-object/from16 v13, v33

    if-ne v7, v13, :cond_20

    :cond_1f
    new-instance v7, Lau2/f;

    const/4 v1, 0x1

    invoke-direct {v7, v5, v2, v1}, Lau2/f;-><init>(Lkotlin/jvm/functions/Function1;Lwt2/a;I)V

    invoke-virtual {v10, v7}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_20
    move-object/from16 v17, v7

    check-cast v17, Lc93/a;

    shl-int/lit8 v19, v26, 0x6

    const/16 v20, 0x0

    const/16 v21, 0x3fb

    const/4 v7, 0x0

    move-object v12, v8

    const/4 v8, 0x0

    move-object/from16 v18, v10

    const/4 v10, 0x0

    const/4 v11, 0x0

    move-object/from16 v31, v12

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    move-object/from16 v1, v31

    invoke-static/range {v7 .. v21}, Lny0/o0;->b(Landroidx/compose/ui/Modifier;ZLcom/whoop/design/util/TextResource;Lb91/a;Lg1/u0;Lf0/t;Ljava/lang/Integer;Landroidx/compose/ui/Modifier;ZLl0/k1;Lc93/a;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v10, v18

    invoke-virtual {v10, v3}, Lp1/q;->q(Z)V

    :goto_14
    invoke-static {v4, v1}, Landroidx/compose/foundation/layout/d;->h(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    invoke-static {v10, v1}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    invoke-virtual {v10, v0}, Lp1/q;->x(I)V

    invoke-virtual {v10}, Lp1/q;->u()Lp1/v1;

    move-result-object v9

    if-eqz v9, :cond_2f

    new-instance v0, Lau2/g;

    const/4 v8, 0x0

    move-object/from16 v1, p0

    move/from16 v3, p2

    move/from16 v7, p7

    invoke-direct/range {v0 .. v8}, Lau2/g;-><init>(Lwt2/a;Lwt2/a;ZFLkotlin/jvm/functions/Function1;III)V

    :goto_15
    iput-object v0, v9, Lp1/v1;->d:Lc93/m;

    return-void

    :cond_21
    move-object v0, v1

    move-object v14, v2

    move/from16 v20, v4

    move-object v13, v7

    move-object v1, v8

    move-object v15, v11

    const/4 v3, 0x0

    const/16 v11, 0x20

    const/16 v29, 0x1

    const v2, -0x68a2cc7c

    invoke-virtual {v10, v2}, Lp1/q;->e0(I)V

    invoke-virtual {v10, v3}, Lp1/q;->q(Z)V

    const-string v2, "PrimarySummaryButtonTag"

    invoke-static {v1, v2}, Landroidx/compose/ui/platform/a;->a(Landroidx/compose/ui/Modifier;Ljava/lang/String;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    invoke-static {v5, v2}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    const/4 v4, 0x5

    int-to-float v4, v4

    const/16 v5, 0x8

    int-to-float v5, v5

    mul-float/2addr v4, v5

    const/4 v5, 0x0

    const/4 v6, 0x2

    invoke-static {v2, v4, v5, v6}, Landroidx/compose/foundation/layout/a;->r(Landroidx/compose/ui/Modifier;FFI)Landroidx/compose/ui/Modifier;

    move-result-object v2

    move-object v12, v1

    move-object v1, v2

    sget-object v2, Lny0/v;->TextLarge:Lny0/v;

    invoke-virtual {v0}, Lwt2/a;->d()Lcom/whoop/design/util/TextResource;

    move-result-object v4

    sget v5, Lcom/whoop/design/util/TextResource;->$stable:I

    invoke-static {v4, v10, v5}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v4

    move/from16 v30, v3

    move-object v3, v4

    invoke-virtual {v0}, Lwt2/a;->b()Z

    move-result v4

    sget-object v6, Lx81/d;->a:Lx81/d;

    sget v7, Lx81/d;->b:I

    invoke-virtual {v6, v10, v7}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v6

    invoke-virtual {v6}, Ly81/i;->X()J

    move-result-wide v6

    and-int v8, v25, v9

    const/16 v9, 0x4000

    if-ne v8, v9, :cond_22

    move/from16 v16, v29

    goto :goto_16

    :cond_22
    move/from16 v16, v30

    :goto_16
    and-int/lit8 v9, v25, 0xe

    const/4 v11, 0x4

    if-eq v9, v11, :cond_24

    and-int/lit8 v9, v25, 0x8

    if-eqz v9, :cond_23

    invoke-virtual {v10, v0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_23

    goto :goto_17

    :cond_23
    move/from16 v9, v30

    goto :goto_18

    :cond_24
    :goto_17
    move/from16 v9, v29

    :goto_18
    or-int v9, v16, v9

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v11

    if-nez v9, :cond_25

    if-ne v11, v13, :cond_26

    :cond_25
    new-instance v11, Lau2/f;

    const/4 v9, 0x2

    invoke-direct {v11, v15, v0, v9}, Lau2/f;-><init>(Lkotlin/jvm/functions/Function1;Lwt2/a;I)V

    invoke-virtual {v10, v11}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_26
    move-object v9, v11

    check-cast v9, Lc93/a;

    const/16 v11, 0x36

    move-object/from16 v31, v12

    const/16 v12, 0x60

    move/from16 v16, v5

    move-wide v5, v6

    const/4 v7, 0x0

    move/from16 v17, v8

    const/4 v8, 0x0

    move-object/from16 v32, v15

    move/from16 v0, v17

    move/from16 v15, v30

    move-object/from16 v35, v31

    invoke-static/range {v1 .. v12}, Lny0/u;->h(Landroidx/compose/ui/Modifier;Lny0/v;Ljava/lang/String;ZJLi2/t;ZLc93/a;Landroidx/compose/runtime/Composer;II)V

    if-nez v14, :cond_27

    const v0, -0x689a97a2

    invoke-virtual {v10, v0}, Lp1/q;->e0(I)V

    invoke-virtual {v10, v15}, Lp1/q;->q(Z)V

    move v0, v15

    goto/16 :goto_1f

    :cond_27
    const v1, -0x689a97a1

    invoke-virtual {v10, v1}, Lp1/q;->e0(I)V

    const/4 v6, 0x2

    int-to-float v1, v6

    const/4 v12, 0x4

    int-to-float v2, v12

    move-object/from16 v12, v35

    invoke-static {v1, v2, v12, v10}, Ld;->w(FFLb2/t;Lp1/q;)V

    const-string v1, "SecondarySummaryButtonTag"

    invoke-static {v12, v1}, Landroidx/compose/ui/platform/a;->a(Landroidx/compose/ui/Modifier;Ljava/lang/String;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    sget-object v2, Lny0/n0;->TextSmall:Lny0/n0;

    invoke-virtual {v14}, Lwt2/a;->d()Lcom/whoop/design/util/TextResource;

    move-result-object v3

    invoke-virtual {v14}, Lwt2/a;->c()Lgz0/m0;

    move-result-object v4

    const/4 v5, 0x0

    if-eqz v4, :cond_28

    new-instance v6, Ly71/g;

    invoke-virtual {v4}, Lgz0/m0;->toWhoopIcon()I

    move-result v4

    const/4 v7, 0x2

    invoke-direct {v6, v4, v5, v7, v5}, Ly71/g;-><init>(ILcom/whoop/design/util/TextResource;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object v4, v6

    goto :goto_19

    :cond_28
    move-object v4, v5

    :goto_19
    invoke-virtual {v14}, Lwt2/a;->b()Z

    move-result v6

    const/16 v12, 0x4000

    if-ne v0, v12, :cond_29

    const/4 v9, 0x1

    goto :goto_1a

    :cond_29
    move v9, v15

    :goto_1a
    and-int/lit8 v0, v25, 0x70

    const/16 v11, 0x20

    if-eq v0, v11, :cond_2b

    and-int/lit8 v0, v25, 0x40

    if-eqz v0, :cond_2a

    invoke-virtual {v10, v14}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2a

    goto :goto_1b

    :cond_2a
    move v0, v15

    goto :goto_1c

    :cond_2b
    :goto_1b
    const/4 v0, 0x1

    :goto_1c
    or-int/2addr v0, v9

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    if-nez v0, :cond_2d

    if-ne v5, v13, :cond_2c

    goto :goto_1d

    :cond_2c
    move-object/from16 v11, v32

    goto :goto_1e

    :cond_2d
    :goto_1d
    new-instance v5, La20/g;

    const/16 v0, 0x11

    move-object/from16 v11, v32

    invoke-direct {v5, v0, v11, v14}, La20/g;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v10, v5}, Lp1/q;->p0(Ljava/lang/Object;)V

    :goto_1e
    move-object v13, v5

    check-cast v13, Lkotlin/jvm/functions/Function1;

    shl-int/lit8 v0, v16, 0x6

    or-int/lit8 v0, v0, 0x36

    sget v5, Ly71/g;->c:I

    shl-int/lit8 v5, v5, 0x9

    or-int/2addr v0, v5

    const/16 v16, 0x0

    const/16 v17, 0xfd0

    const/4 v5, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    move-object/from16 v18, v10

    const/4 v10, 0x0

    move-object/from16 v32, v11

    const/4 v11, 0x0

    const/4 v12, 0x0

    move v14, v15

    move v15, v0

    move v0, v14

    move-object/from16 v14, v18

    invoke-static/range {v1 .. v17}, Lny0/l0;->i(Landroidx/compose/ui/Modifier;Lny0/n0;Lcom/whoop/design/util/TextResource;Ly71/g;Ly71/g;ZLy81/e;Lj91/b;ZZLjava/lang/Float;Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;III)V

    move-object v10, v14

    invoke-virtual {v10, v0}, Lp1/q;->q(Z)V

    :goto_1f
    invoke-virtual {v10, v0}, Lp1/q;->q(Z)V

    const/4 v0, 0x1

    invoke-virtual {v10, v0}, Lp1/q;->q(Z)V

    move/from16 v4, v20

    move-object/from16 v5, v32

    goto :goto_20

    :cond_2e
    invoke-virtual {v10}, Lp1/q;->X()V

    move/from16 v4, p3

    move-object v5, v14

    :goto_20
    invoke-virtual {v10}, Lp1/q;->u()Lp1/v1;

    move-result-object v9

    if-eqz v9, :cond_2f

    new-instance v0, Lau2/g;

    const/4 v8, 0x1

    move-object/from16 v1, p0

    move-object/from16 v2, p1

    move/from16 v3, p2

    move/from16 v6, p6

    move/from16 v7, p7

    invoke-direct/range {v0 .. v8}, Lau2/g;-><init>(Lwt2/a;Lwt2/a;ZFLkotlin/jvm/functions/Function1;III)V

    goto/16 :goto_15

    :cond_2f
    return-void
.end method

.method private static final i(Lcom/whoop/navigation/e;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final j(Lkotlin/jvm/functions/Function1;Lwt2/a;)Ll83/a0;
    .locals 0

    invoke-virtual {p1}, Lwt2/a;->a()Lcom/whoop/navigation/e;

    move-result-object p1

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final k(Lkotlin/jvm/functions/Function1;Lwt2/a;)Ll83/a0;
    .locals 0

    invoke-virtual {p1}, Lwt2/a;->a()Lcom/whoop/navigation/e;

    move-result-object p1

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final l(Lwt2/a;Lwt2/a;ZFLkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 8

    or-int/lit8 p5, p5, 0x1

    invoke-static {p5}, Lp1/x;->L(I)I

    move-result v6

    move-object v0, p0

    move-object v1, p1

    move v2, p2

    move v3, p3

    move-object v4, p4

    move v7, p6

    move-object v5, p7

    invoke-static/range {v0 .. v7}, Lau2/h;->h(Lwt2/a;Lwt2/a;ZFLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final m(Lkotlin/jvm/functions/Function1;Lwt2/a;)Ll83/a0;
    .locals 0

    invoke-virtual {p1}, Lwt2/a;->a()Lcom/whoop/navigation/e;

    move-result-object p1

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final n(Lkotlin/jvm/functions/Function1;Lwt2/a;Ljava/lang/Object;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lwt2/a;->a()Lcom/whoop/navigation/e;

    move-result-object p1

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final o(Lwt2/a;Lwt2/a;ZFLkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 8

    or-int/lit8 p5, p5, 0x1

    invoke-static {p5}, Lp1/x;->L(I)I

    move-result v6

    move-object v0, p0

    move-object v1, p1

    move v2, p2

    move v3, p3

    move-object v4, p4

    move v7, p6

    move-object v5, p7

    invoke-static/range {v0 .. v7}, Lau2/h;->h(Lwt2/a;Lwt2/a;ZFLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method
