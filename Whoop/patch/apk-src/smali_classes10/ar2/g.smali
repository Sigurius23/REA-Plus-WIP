.class public abstract Lar2/g;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0002\u001a3\u0010\u0008\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0001\u00a2\u0006\u0004\u0008\u0008\u0010\t\u00a8\u0006\u000c\u00b2\u0006\u0010\u0010\u000b\u001a\u0004\u0018\u00010\n8\n@\nX\u008a\u008e\u0002"
    }
    d2 = {
        "Lar2/c;",
        "state",
        "",
        "isCurrentStep",
        "Lkotlin/Function1;",
        "",
        "Ll83/a0;",
        "onViewEvent",
        "d",
        "(Lar2/c;ZLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V",
        "Landroid/graphics/Bitmap;",
        "shareImageBitmap",
        "user-journey_release"
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
.method public static synthetic a(Lar2/c;ZLkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p5}, Lar2/g;->i(Lar2/c;ZLkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lkotlin/jvm/functions/Function1;Lar2/c;Ljava/lang/Object;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, Lar2/g;->h(Lkotlin/jvm/functions/Function1;Lar2/c;Ljava/lang/Object;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lp1/c1;)Ll83/a0;
    .locals 0

    invoke-static {p1, p0, p2}, Lar2/g;->g(Lkotlin/jvm/functions/Function1;Ljava/lang/String;Lp1/c1;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final d(Lar2/c;ZLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V
    .locals 68
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lar2/c;",
            "Z",
            "Lkotlin/jvm/functions/Function1;",
            "Landroidx/compose/runtime/Composer;",
            "I)V"
        }
    .end annotation

    move-object/from16 v1, p0

    move/from16 v2, p1

    move-object/from16 v3, p2

    move/from16 v4, p4

    const-string v0, "state"

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onViewEvent"

    invoke-static {v3, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v12, p3

    check-cast v12, Lp1/q;

    const v0, -0x1e11984b

    invoke-virtual {v12, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, v4, 0x6

    const/4 v15, 0x4

    const/4 v5, 0x2

    if-nez v0, :cond_2

    and-int/lit8 v0, v4, 0x8

    if-nez v0, :cond_0

    invoke-virtual {v12, v1}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v0

    goto :goto_0

    :cond_0
    invoke-virtual {v12, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v0

    :goto_0
    if-eqz v0, :cond_1

    move v0, v15

    goto :goto_1

    :cond_1
    move v0, v5

    :goto_1
    or-int/2addr v0, v4

    goto :goto_2

    :cond_2
    move v0, v4

    :goto_2
    and-int/lit8 v6, v4, 0x30

    if-nez v6, :cond_4

    invoke-virtual {v12, v2}, Lp1/q;->h(Z)Z

    move-result v6

    if-eqz v6, :cond_3

    const/16 v6, 0x20

    goto :goto_3

    :cond_3
    const/16 v6, 0x10

    :goto_3
    or-int/2addr v0, v6

    :cond_4
    and-int/lit16 v6, v4, 0x180

    if-nez v6, :cond_6

    invoke-virtual {v12, v3}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_5

    const/16 v6, 0x100

    goto :goto_4

    :cond_5
    const/16 v6, 0x80

    :goto_4
    or-int/2addr v0, v6

    :cond_6
    and-int/lit16 v6, v0, 0x93

    const/16 v8, 0x92

    const/4 v9, 0x0

    if-eq v6, v8, :cond_7

    const/4 v6, 0x1

    goto :goto_5

    :cond_7
    move v6, v9

    :goto_5
    and-int/lit8 v8, v0, 0x1

    invoke-virtual {v12, v8, v6}, Lp1/q;->U(IZ)Z

    move-result v6

    if-eqz v6, :cond_27

    invoke-virtual {v12}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v6

    const/4 v8, 0x0

    sget-object v11, Lp1/l;->a:Lp1/v0;

    if-ne v6, v11, :cond_8

    invoke-static {v8}, Lp1/x;->z(Ljava/lang/Object;)Lp1/k1;

    move-result-object v6

    invoke-virtual {v12, v6}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_8
    check-cast v6, Lp1/c1;

    sget-object v13, Landroidx/compose/ui/platform/AndroidCompositionLocals_androidKt;->b:Lp1/u2;

    invoke-virtual {v12, v13}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v13

    check-cast v13, Landroid/content/Context;

    invoke-virtual {v1}, Lar2/c;->h()Lcom/whoop/design/util/TextResource;

    move-result-object v14

    sget v10, Lcom/whoop/design/util/TextResource;->$stable:I

    invoke-static {v14, v12, v10}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v14

    if-eqz v2, :cond_26

    const v7, -0x21837cf7

    invoke-virtual {v12, v7}, Lp1/q;->e0(I)V

    invoke-virtual {v1}, Lar2/c;->e()Lkd1/o;

    move-result-object v7

    invoke-virtual {v12, v13}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v17

    move/from16 v18, v10

    and-int/lit8 v10, v0, 0xe

    if-eq v10, v15, :cond_a

    and-int/lit8 v19, v0, 0x8

    if-eqz v19, :cond_9

    invoke-virtual {v12, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v19

    if-eqz v19, :cond_9

    goto :goto_6

    :cond_9
    move/from16 v19, v9

    goto :goto_7

    :cond_a
    :goto_6
    const/16 v19, 0x1

    :goto_7
    or-int v17, v17, v19

    invoke-virtual {v12}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v15

    if-nez v17, :cond_b

    if-ne v15, v11, :cond_c

    :cond_b
    new-instance v15, Lar2/g$a;

    invoke-direct {v15, v13, v1, v6, v8}, Lar2/g$a;-><init>(Landroid/content/Context;Lar2/c;Lp1/c1;Lq83/d;)V

    invoke-virtual {v12, v15}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_c
    check-cast v15, Lc93/m;

    invoke-static {v12, v15, v7}, Lp1/x;->g(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const/high16 v15, 0x3f800000    # 1.0f

    sget-object v7, Lb2/t;->w:Lb2/t;

    invoke-static {v15, v7}, Landroidx/compose/foundation/layout/d;->d(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v13

    int-to-float v5, v5

    move-object/from16 v17, v6

    const/16 v6, 0x8

    int-to-float v8, v6

    mul-float/2addr v5, v8

    invoke-static {v5, v13}, Landroidx/compose/foundation/layout/a;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v13

    sget-object v6, Ll0/m;->c:Ll0/g;

    sget-object v15, Lb2/e;->M:Lb2/k;

    invoke-static {v6, v15, v12, v9}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v6

    move/from16 v23, v10

    iget-wide v9, v12, Lp1/q;->T:J

    invoke-static {v9, v10}, Ljava/lang/Long;->hashCode(J)I

    move-result v9

    invoke-virtual {v12}, Lp1/q;->m()Lp1/p1;

    move-result-object v10

    invoke-static {v12, v13}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v13

    sget-object v24, La3/l;->a:La3/k;

    invoke-virtual/range {v24 .. v24}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v15, La3/k;->b:La3/j;

    invoke-virtual {v12}, Lp1/q;->i0()V

    iget-boolean v2, v12, Lp1/q;->S:Z

    if-eqz v2, :cond_d

    invoke-virtual {v12, v15}, Lp1/q;->l(Lc93/a;)V

    goto :goto_8

    :cond_d
    invoke-virtual {v12}, Lp1/q;->s0()V

    :goto_8
    sget-object v2, La3/k;->g:La3/i;

    invoke-static {v12, v2, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v6, La3/k;->f:La3/i;

    invoke-static {v12, v6, v10}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v10, La3/k;->j:La3/i;

    iget-boolean v4, v12, Lp1/q;->S:Z

    if-nez v4, :cond_e

    invoke-virtual {v12}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    move/from16 v25, v5

    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-static {v4, v5}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_f

    goto :goto_9

    :cond_e
    move/from16 v25, v5

    :goto_9
    invoke-static {v9, v12, v9, v10}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_f
    sget-object v4, La3/k;->d:La3/i;

    invoke-static {v12, v4, v13}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const v5, 0x3dcccccd    # 0.1f

    invoke-static {v5, v7}, Landroidx/compose/foundation/layout/d;->c(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v5

    invoke-static {v12, v5}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    invoke-static/range {v17 .. v17}, Lar2/g;->e(Lp1/c1;)Landroid/graphics/Bitmap;

    move-result-object v5

    invoke-virtual {v12, v5}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v5

    invoke-virtual {v12}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v9

    if-nez v5, :cond_10

    if-ne v9, v11, :cond_12

    :cond_10
    invoke-static/range {v17 .. v17}, Lar2/g;->e(Lp1/c1;)Landroid/graphics/Bitmap;

    move-result-object v5

    if-eqz v5, :cond_11

    new-instance v9, Li2/g;

    invoke-direct {v9, v5}, Li2/g;-><init>(Landroid/graphics/Bitmap;)V

    new-instance v5, Landroidx/compose/ui/graphics/painter/BitmapPainter;

    invoke-direct {v5, v9}, Landroidx/compose/ui/graphics/painter/BitmapPainter;-><init>(Li2/g;)V

    goto :goto_a

    :cond_11
    const/4 v5, 0x0

    :goto_a
    invoke-virtual {v12, v5}, Lp1/q;->p0(Ljava/lang/Object;)V

    move-object v9, v5

    :cond_12
    move-object v5, v9

    check-cast v5, Landroidx/compose/ui/graphics/painter/BitmapPainter;

    const/high16 v9, 0x3f800000    # 1.0f

    invoke-static {v9, v7}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v13

    move/from16 v26, v0

    float-to-double v0, v9

    const-wide/16 v27, 0x0

    cmpl-double v0, v0, v27

    if-lez v0, :cond_13

    const/4 v0, 0x1

    goto :goto_b

    :cond_13
    const/4 v0, 0x0

    :goto_b
    if-nez v0, :cond_14

    const-string v0, "invalid weight; must be greater than zero"

    invoke-static {v0}, Lm0/a;->a(Ljava/lang/String;)V

    :cond_14
    const/4 v0, 0x1

    invoke-static {v13, v0, v9}, Ldc/b;->g(Landroidx/compose/ui/Modifier;ZF)Landroidx/compose/ui/Modifier;

    move-result-object v1

    sget-object v9, Lb2/e;->E:Lb2/m;

    const/4 v13, 0x0

    invoke-static {v9, v13}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v9

    move-object/from16 p3, v14

    iget-wide v13, v12, Lp1/q;->T:J

    invoke-static {v13, v14}, Ljava/lang/Long;->hashCode(J)I

    move-result v13

    invoke-virtual {v12}, Lp1/q;->m()Lp1/p1;

    move-result-object v14

    invoke-static {v12, v1}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    invoke-virtual {v12}, Lp1/q;->i0()V

    iget-boolean v0, v12, Lp1/q;->S:Z

    if-eqz v0, :cond_15

    invoke-virtual {v12, v15}, Lp1/q;->l(Lc93/a;)V

    goto :goto_c

    :cond_15
    invoke-virtual {v12}, Lp1/q;->s0()V

    :goto_c
    invoke-static {v12, v2, v9}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v12, v6, v14}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v0, v12, Lp1/q;->S:Z

    if-nez v0, :cond_16

    invoke-virtual {v12}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v0

    invoke-static {v13}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    invoke-static {v0, v9}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_17

    :cond_16
    invoke-static {v13, v12, v13, v10}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_17
    invoke-static {v12, v4, v1}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    if-nez v5, :cond_18

    const v0, -0x792a8c51

    invoke-virtual {v12, v0}, Lp1/q;->e0(I)V

    const/4 v13, 0x0

    invoke-virtual {v12, v13}, Lp1/q;->q(Z)V

    move-object/from16 v16, v4

    move-object/from16 v20, v6

    move-object v1, v7

    move/from16 v27, v8

    move-object/from16 v28, v10

    move-object/from16 v32, v11

    move v0, v13

    move/from16 v30, v23

    move/from16 v3, v25

    const/4 v4, 0x1

    const/16 v23, 0x8

    goto :goto_d

    :cond_18
    const/4 v13, 0x0

    const v0, -0x792a8c50

    invoke-virtual {v12, v0}, Lp1/q;->e0(I)V

    move-object v0, v7

    const/high16 v9, 0x3f800000    # 1.0f

    invoke-static {v9, v0}, Landroidx/compose/foundation/layout/d;->d(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v7

    move/from16 v24, v13

    const/16 v13, 0x61b0

    const/16 v14, 0x68

    move-object v1, v6

    const/4 v6, 0x0

    move v9, v8

    const/4 v8, 0x0

    move/from16 v27, v9

    sget-object v9, Ly2/j;->b:Ly2/b1;

    move-object/from16 v28, v10

    const/4 v10, 0x0

    move-object/from16 v29, v11

    const/4 v11, 0x0

    move-object/from16 v20, v1

    move-object/from16 v16, v4

    move/from16 v30, v23

    move/from16 v3, v25

    move-object/from16 v32, v29

    const/4 v4, 0x1

    const/16 v23, 0x8

    move-object v1, v0

    move/from16 v0, v24

    invoke-static/range {v5 .. v14}, Lpf/c;->c(Ln2/a;Ljava/lang/String;Landroidx/compose/ui/Modifier;Lb2/h;Ly2/k;FLi2/y;Landroidx/compose/runtime/Composer;II)V

    invoke-virtual {v12, v0}, Lp1/q;->q(Z)V

    :goto_d
    invoke-static {v12, v4, v1, v3, v12}, Lih0/d0;->B(Lp1/q;ZLb2/t;FLp1/q;)V

    const/high16 v9, 0x3f800000    # 1.0f

    invoke-static {v9, v1}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v33

    const/4 v5, 0x4

    int-to-float v6, v5

    mul-float v37, v6, v27

    const/16 v38, 0x7

    const/16 v34, 0x0

    const/16 v35, 0x0

    const/16 v36, 0x0

    invoke-static/range {v33 .. v38}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v6

    invoke-static {v3}, Ll0/m;->i(F)Ll0/k;

    move-result-object v3

    sget-object v7, Lb2/e;->N:Lb2/k;

    const/16 v8, 0x36

    invoke-static {v3, v7, v12, v8}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v3

    iget-wide v7, v12, Lp1/q;->T:J

    invoke-static {v7, v8}, Ljava/lang/Long;->hashCode(J)I

    move-result v7

    invoke-virtual {v12}, Lp1/q;->m()Lp1/p1;

    move-result-object v8

    invoke-static {v12, v6}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v6

    invoke-virtual {v12}, Lp1/q;->i0()V

    iget-boolean v9, v12, Lp1/q;->S:Z

    if-eqz v9, :cond_19

    invoke-virtual {v12, v15}, Lp1/q;->l(Lc93/a;)V

    goto :goto_e

    :cond_19
    invoke-virtual {v12}, Lp1/q;->s0()V

    :goto_e
    invoke-static {v12, v2, v3}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    move-object/from16 v2, v20

    invoke-static {v12, v2, v8}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v2, v12, Lp1/q;->S:Z

    if-nez v2, :cond_1a

    invoke-virtual {v12}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_1b

    :cond_1a
    move-object/from16 v2, v28

    goto :goto_10

    :cond_1b
    :goto_f
    move-object/from16 v2, v16

    goto :goto_11

    :goto_10
    invoke-static {v7, v12, v7, v2}, Ld;->y(ILp1/q;ILa3/i;)V

    goto :goto_f

    :goto_11
    invoke-static {v12, v2, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual/range {p0 .. p0}, Lar2/c;->g()Lcom/whoop/design/util/TextResource;

    move-result-object v11

    move/from16 v2, v26

    and-int/lit16 v3, v2, 0x380

    const/16 v6, 0x100

    if-ne v3, v6, :cond_1c

    move v9, v4

    :goto_12
    move-object/from16 v7, p3

    goto :goto_13

    :cond_1c
    move v9, v0

    goto :goto_12

    :goto_13
    invoke-virtual {v12, v7}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v8

    or-int/2addr v8, v9

    invoke-virtual {v12}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v9

    if-nez v8, :cond_1e

    move-object/from16 v8, v32

    if-ne v9, v8, :cond_1d

    goto :goto_14

    :cond_1d
    move-object/from16 v10, p2

    goto :goto_15

    :cond_1e
    move-object/from16 v8, v32

    :goto_14
    new-instance v9, Lar2/e;

    move-object/from16 v10, p2

    move-object/from16 v13, v17

    invoke-direct {v9, v10, v7, v13}, Lar2/e;-><init>(Lkotlin/jvm/functions/Function1;Ljava/lang/String;Lp1/c1;)V

    invoke-virtual {v12, v9}, Lp1/q;->p0(Ljava/lang/Object;)V

    :goto_15
    check-cast v9, Lc93/a;

    shl-int/lit8 v20, v18, 0x12

    const/16 v21, 0x0

    const/16 v22, 0x1fbf

    move/from16 v19, v5

    const/4 v5, 0x0

    move/from16 v31, v6

    const/4 v6, 0x0

    const/4 v7, 0x0

    move-object/from16 v29, v8

    const/4 v8, 0x0

    move-object/from16 v18, v9

    const/4 v9, 0x0

    const/4 v10, 0x0

    move/from16 v13, v19

    move-object/from16 v19, v12

    const/4 v12, 0x0

    move v14, v13

    const/4 v13, 0x0

    move v15, v14

    const/4 v14, 0x0

    move/from16 v16, v15

    const/4 v15, 0x0

    move/from16 v17, v16

    const/16 v16, 0x0

    move/from16 v24, v17

    const/16 v17, 0x0

    move-object/from16 v4, p2

    move-object/from16 v39, v29

    invoke-static/range {v5 .. v22}, Lny0/z;->j(Landroidx/compose/ui/Modifier;ZZLjava/lang/Integer;Landroidx/compose/ui/Modifier;Lv41/r0;Lcom/whoop/design/util/TextResource;Lg1/u0;Li2/t;Lf0/t;FLl0/k1;Lb91/a;Lc93/a;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v12, v19

    invoke-virtual/range {p0 .. p0}, Lar2/c;->f()Lny0/h;

    move-result-object v40

    if-nez v40, :cond_1f

    const v1, -0x1a891a5f

    invoke-virtual {v12, v1}, Lp1/q;->e0(I)V

    invoke-virtual {v12, v0}, Lp1/q;->q(Z)V

    move-object/from16 v1, p0

    :goto_16
    const/4 v2, 0x1

    goto/16 :goto_1b

    :cond_1f
    const v5, -0x1a891a5e

    invoke-virtual {v12, v5}, Lp1/q;->e0(I)V

    new-instance v5, Lny0/d;

    invoke-direct {v5}, Lny0/d;-><init>()V

    sget-object v6, Ll0/a1;->x:Ll0/a1;

    invoke-static {v1, v6}, Landroidx/compose/foundation/layout/a;->j(Landroidx/compose/ui/Modifier;Ll0/a1;)Landroidx/compose/ui/Modifier;

    move-result-object v6

    sget-object v51, Lny0/g;->STANDARD:Lny0/g;

    const v66, 0x1fffbff

    const/16 v67, 0x0

    const/16 v41, 0x0

    const/16 v42, 0x0

    const/16 v43, 0x0

    const/16 v44, 0x0

    const/16 v45, 0x0

    const/16 v46, 0x0

    const/16 v47, 0x0

    const/16 v48, 0x0

    const/16 v49, 0x0

    const/16 v50, 0x0

    const/16 v52, 0x0

    const/16 v53, 0x0

    const/16 v54, 0x0

    const/16 v55, 0x0

    const/16 v56, 0x0

    const/16 v57, 0x0

    const/16 v58, 0x0

    const/16 v59, 0x0

    const/16 v60, 0x0

    const/16 v61, 0x0

    const/16 v62, 0x0

    const/16 v63, 0x0

    const/16 v64, 0x0

    const/16 v65, 0x0

    invoke-static/range {v40 .. v67}, Lny0/h;->b(Lny0/h;Lcom/whoop/design/util/TextResource;Lgz0/m0;Li91/a;Ly81/f;Ljava/lang/String;Ljava/lang/String;Lny0/p;Lcom/whoop/navigation/e;Lcom/whoop/whoopaction/domain/models/Action;Lcom/whoop/analytics/AnalyticEventModel;Lny0/g;Lb91/c;Ly3/f;ZZLjava/lang/String;ZZLi91/a;Ljava/lang/Object;Lj02/s;Lny0/c;Lcom/whoop/navigation/models/GenericInteraction;Lj91/b;Li91/a;ILjava/lang/Object;)Lny0/h;

    move-result-object v7

    const/16 v1, 0x100

    if-ne v3, v1, :cond_20

    const/4 v9, 0x1

    :goto_17
    move/from16 v1, v30

    const/4 v13, 0x4

    goto :goto_18

    :cond_20
    move v9, v0

    goto :goto_17

    :goto_18
    if-eq v1, v13, :cond_23

    and-int/lit8 v1, v2, 0x8

    if-eqz v1, :cond_21

    move-object/from16 v1, p0

    invoke-virtual {v12, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_22

    goto :goto_19

    :cond_21
    move-object/from16 v1, p0

    :cond_22
    move v2, v0

    goto :goto_1a

    :cond_23
    move-object/from16 v1, p0

    :goto_19
    const/4 v2, 0x1

    :goto_1a
    or-int/2addr v2, v9

    invoke-virtual {v12}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    if-nez v2, :cond_24

    move-object/from16 v8, v39

    if-ne v3, v8, :cond_25

    :cond_24
    new-instance v3, La20/g;

    const/16 v2, 0xd

    invoke-direct {v3, v2, v4, v1}, La20/g;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v12, v3}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_25
    move-object v8, v3

    check-cast v8, Lkotlin/jvm/functions/Function1;

    sget v2, Lny0/h;->z:I

    shl-int/lit8 v2, v2, 0x3

    or-int/lit8 v2, v2, 0x6

    sget v3, Lny0/d;->a:I

    shl-int/lit8 v3, v3, 0x9

    or-int v10, v2, v3

    move-object v9, v12

    invoke-virtual/range {v5 .. v10}, Lny0/d;->e(Landroidx/compose/ui/Modifier;Lny0/h;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    invoke-virtual {v12, v0}, Lp1/q;->q(Z)V

    goto/16 :goto_16

    :goto_1b
    invoke-static {v12, v2, v2, v0}, Lm4/a;->y(Lp1/q;ZZZ)V

    goto :goto_1c

    :cond_26
    move-object v4, v3

    move v0, v9

    const v2, -0x21630d53

    invoke-virtual {v12, v2}, Lp1/q;->e0(I)V

    invoke-virtual {v12, v0}, Lp1/q;->q(Z)V

    goto :goto_1c

    :cond_27
    move-object v4, v3

    invoke-virtual {v12}, Lp1/q;->X()V

    :goto_1c
    invoke-virtual {v12}, Lp1/q;->u()Lp1/v1;

    move-result-object v6

    if-eqz v6, :cond_28

    new-instance v0, Lar2/f;

    const/4 v5, 0x0

    move/from16 v2, p1

    move-object v3, v4

    move/from16 v4, p4

    invoke-direct/range {v0 .. v5}, Lar2/f;-><init>(Ljava/lang/Object;ZLjava/lang/Object;II)V

    iput-object v0, v6, Lp1/v1;->d:Lc93/m;

    :cond_28
    return-void
.end method

.method private static final e(Lp1/c1;)Landroid/graphics/Bitmap;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp1/c1;",
            ")",
            "Landroid/graphics/Bitmap;"
        }
    .end annotation

    invoke-interface {p0}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Landroid/graphics/Bitmap;

    return-object p0
.end method

.method private static final f(Lp1/c1;Landroid/graphics/Bitmap;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp1/c1;",
            "Landroid/graphics/Bitmap;",
            ")V"
        }
    .end annotation

    invoke-interface {p0, p1}, Lp1/c1;->setValue(Ljava/lang/Object;)V

    return-void
.end method

.method private static final g(Lkotlin/jvm/functions/Function1;Ljava/lang/String;Lp1/c1;)Ll83/a0;
    .locals 1

    new-instance v0, Lrq2/t0$f;

    invoke-static {p2}, Lar2/g;->e(Lp1/c1;)Landroid/graphics/Bitmap;

    move-result-object p2

    invoke-direct {v0, p1, p2}, Lrq2/t0$f;-><init>(Ljava/lang/String;Landroid/graphics/Bitmap;)V

    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final h(Lkotlin/jvm/functions/Function1;Lar2/c;Ljava/lang/Object;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p2, Lrq2/t0$c;

    invoke-virtual {p1}, Lar2/c;->f()Lny0/h;

    move-result-object p1

    invoke-virtual {p1}, Lny0/h;->l()Lcom/whoop/navigation/e;

    move-result-object p1

    invoke-direct {p2, p1}, Lrq2/t0$c;-><init>(Lcom/whoop/navigation/e;)V

    invoke-interface {p0, p2}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final i(Lar2/c;ZLkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p3, p3, 0x1

    invoke-static {p3}, Lp1/x;->L(I)I

    move-result p3

    invoke-static {p0, p1, p2, p4, p3}, Lar2/g;->d(Lar2/c;ZLkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static final synthetic j(Lp1/c1;Landroid/graphics/Bitmap;)V
    .locals 0

    invoke-static {p0, p1}, Lar2/g;->f(Lp1/c1;Landroid/graphics/Bitmap;)V

    return-void
.end method
