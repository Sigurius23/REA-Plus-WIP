.class public abstract Lgv1/n;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001c\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u001aG\u0010\t\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00042\u0012\u0010\u0008\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0001\u00a2\u0006\u0004\u0008\t\u0010\n\u00a8\u0006\u000c\u00b2\u0006\u000e\u0010\u000b\u001a\u00020\u00058\n@\nX\u008a\u008e\u0002"
    }
    d2 = {
        "",
        "description",
        "",
        "isConfirmEnabled",
        "Lkotlin/Function1;",
        "Lgv1/l;",
        "Ll83/a0;",
        "onConfirm",
        "content",
        "e",
        "(Ljava/lang/String;ZLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;I)V",
        "selectedType",
        "lottie-tester_release"
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
.method public static synthetic a(Lp1/c1;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lgv1/n;->h(Lp1/c1;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lp1/c1;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lgv1/n;->i(Lp1/c1;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Ljava/lang/String;ZLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function3;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p6}, Lgv1/n;->k(Ljava/lang/String;ZLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function3;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Lkotlin/jvm/functions/Function1;Lp1/c1;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lgv1/n;->j(Lkotlin/jvm/functions/Function1;Lp1/c1;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final e(Ljava/lang/String;ZLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;I)V
    .locals 35
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Z",
            "Lkotlin/jvm/functions/Function1;",
            "Lkotlin/jvm/functions/Function3;",
            "Landroidx/compose/runtime/Composer;",
            "I)V"
        }
    .end annotation

    move-object/from16 v0, p0

    move-object/from16 v1, p2

    move-object/from16 v2, p3

    move/from16 v3, p5

    const-string v4, "description"

    invoke-static {v0, v4}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v4, "onConfirm"

    invoke-static {v1, v4}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v4, "content"

    invoke-static {v2, v4}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v10, p4

    check-cast v10, Lp1/q;

    const v4, -0x54840a90

    invoke-virtual {v10, v4}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v4, v3, 0x6

    const/4 v6, 0x2

    if-nez v4, :cond_1

    invoke-virtual {v10, v0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_0

    const/4 v4, 0x4

    goto :goto_0

    :cond_0
    move v4, v6

    :goto_0
    or-int/2addr v4, v3

    goto :goto_1

    :cond_1
    move v4, v3

    :goto_1
    and-int/lit8 v7, v3, 0x30

    move/from16 v13, p1

    if-nez v7, :cond_3

    invoke-virtual {v10, v13}, Lp1/q;->h(Z)Z

    move-result v7

    if-eqz v7, :cond_2

    const/16 v7, 0x20

    goto :goto_2

    :cond_2
    const/16 v7, 0x10

    :goto_2
    or-int/2addr v4, v7

    :cond_3
    and-int/lit16 v7, v3, 0x180

    if-nez v7, :cond_5

    invoke-virtual {v10, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_4

    const/16 v7, 0x100

    goto :goto_3

    :cond_4
    const/16 v7, 0x80

    :goto_3
    or-int/2addr v4, v7

    :cond_5
    and-int/lit16 v7, v3, 0xc00

    if-nez v7, :cond_7

    invoke-virtual {v10, v2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_6

    const/16 v7, 0x800

    goto :goto_4

    :cond_6
    const/16 v7, 0x400

    :goto_4
    or-int/2addr v4, v7

    :cond_7
    and-int/lit16 v7, v4, 0x493

    const/16 v8, 0x492

    if-eq v7, v8, :cond_8

    const/4 v7, 0x1

    goto :goto_5

    :cond_8
    const/4 v7, 0x0

    :goto_5
    and-int/lit8 v8, v4, 0x1

    invoke-virtual {v10, v8, v7}, Lp1/q;->U(IZ)Z

    move-result v7

    if-eqz v7, :cond_1b

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v7

    sget-object v8, Lp1/l;->a:Lp1/v0;

    if-ne v7, v8, :cond_9

    sget-object v7, Lgv1/l;->LOTTIE:Lgv1/l;

    invoke-static {v7}, Lp1/x;->z(Ljava/lang/Object;)Lp1/k1;

    move-result-object v7

    invoke-virtual {v10, v7}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_9
    check-cast v7, Lp1/c1;

    const/high16 v11, 0x3f800000    # 1.0f

    sget-object v12, Lb2/t;->w:Lb2/t;

    invoke-static {v11, v12}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v14

    int-to-float v9, v6

    const/16 v15, 0x8

    int-to-float v15, v15

    mul-float/2addr v9, v15

    const/4 v5, 0x0

    invoke-static {v14, v9, v5, v6}, Landroidx/compose/foundation/layout/a;->r(Landroidx/compose/ui/Modifier;FFI)Landroidx/compose/ui/Modifier;

    move-result-object v19

    const/4 v5, 0x3

    int-to-float v5, v5

    mul-float v23, v5, v15

    const/16 v24, 0x7

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    invoke-static/range {v19 .. v24}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v5

    invoke-static {v9}, Ll0/m;->i(F)Ll0/k;

    move-result-object v6

    sget-object v9, Lb2/e;->M:Lb2/k;

    const/4 v14, 0x6

    invoke-static {v6, v9, v10, v14}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v6

    iget-wide v14, v10, Lp1/q;->T:J

    invoke-static {v14, v15}, Ljava/lang/Long;->hashCode(J)I

    move-result v9

    invoke-virtual {v10}, Lp1/q;->m()Lp1/p1;

    move-result-object v14

    invoke-static {v10, v5}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v5

    sget-object v15, La3/l;->a:La3/k;

    invoke-virtual {v15}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v15, La3/k;->b:La3/j;

    invoke-virtual {v10}, Lp1/q;->i0()V

    iget-boolean v11, v10, Lp1/q;->S:Z

    if-eqz v11, :cond_a

    invoke-virtual {v10, v15}, Lp1/q;->l(Lc93/a;)V

    goto :goto_6

    :cond_a
    invoke-virtual {v10}, Lp1/q;->s0()V

    :goto_6
    sget-object v11, La3/k;->g:La3/i;

    invoke-static {v10, v11, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v6, La3/k;->f:La3/i;

    invoke-static {v10, v6, v14}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v14, La3/k;->j:La3/i;

    iget-boolean v0, v10, Lp1/q;->S:Z

    if-nez v0, :cond_b

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v0

    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_c

    :cond_b
    invoke-static {v9, v10, v9, v14}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_c
    sget-object v0, La3/k;->d:La3/i;

    invoke-static {v10, v0, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const/high16 v1, 0x3f800000    # 1.0f

    invoke-static {v1, v12}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v5

    sget-object v1, Lx81/d;->a:Lx81/d;

    sget v9, Lx81/d;->b:I

    invoke-virtual {v1, v10, v9}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v21

    invoke-virtual/range {v21 .. v21}, Ly81/i;->r()J

    move-result-wide v2

    move/from16 v21, v4

    const/4 v4, 0x4

    int-to-float v4, v4

    invoke-static {v5, v4, v4, v2, v3}, Lr80/c;->e(Landroidx/compose/ui/Modifier;FFJ)Landroidx/compose/ui/Modifier;

    move-result-object v2

    sget-object v3, Ll0/m;->a:Ll0/e;

    sget-object v4, Lb2/e;->J:Lb2/l;

    const/4 v5, 0x0

    invoke-static {v3, v4, v10, v5}, Ll0/p1;->a(Ll0/i;Lb2/g;Landroidx/compose/runtime/Composer;I)Ll0/r1;

    move-result-object v3

    move-object v4, v6

    iget-wide v5, v10, Lp1/q;->T:J

    invoke-static {v5, v6}, Ljava/lang/Long;->hashCode(J)I

    move-result v5

    invoke-virtual {v10}, Lp1/q;->m()Lp1/p1;

    move-result-object v6

    invoke-static {v10, v2}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    invoke-virtual {v10}, Lp1/q;->i0()V

    move-object/from16 v18, v4

    iget-boolean v4, v10, Lp1/q;->S:Z

    if-eqz v4, :cond_d

    invoke-virtual {v10, v15}, Lp1/q;->l(Lc93/a;)V

    goto :goto_7

    :cond_d
    invoke-virtual {v10}, Lp1/q;->s0()V

    :goto_7
    invoke-static {v10, v11, v3}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    move-object/from16 v4, v18

    invoke-static {v10, v4, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v3, v10, Lp1/q;->S:Z

    if-nez v3, :cond_e

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-static {v3, v4}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_f

    :cond_e
    invoke-static {v5, v10, v5, v14}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_f
    invoke-static {v10, v0, v2}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const/high16 v0, 0x3f800000    # 1.0f

    float-to-double v2, v0

    const-wide/16 v14, 0x0

    cmpl-double v2, v2, v14

    const-string v3, "invalid weight; must be greater than zero"

    if-lez v2, :cond_10

    goto :goto_8

    :cond_10
    invoke-static {v3}, Lm0/a;->a(Ljava/lang/String;)V

    :goto_8
    new-instance v5, Landroidx/compose/foundation/layout/LayoutWeightElement;

    const v2, 0x7f7fffff    # Float.MAX_VALUE

    cmpl-float v4, v0, v2

    if-lez v4, :cond_11

    move v4, v2

    :goto_9
    const/4 v6, 0x1

    goto :goto_a

    :cond_11
    move v4, v0

    goto :goto_9

    :goto_a
    invoke-direct {v5, v4, v6}, Landroidx/compose/foundation/layout/LayoutWeightElement;-><init>(FZ)V

    invoke-static {v7}, Lgv1/n;->f(Lp1/c1;)Lgv1/l;

    move-result-object v4

    sget-object v11, Lgv1/l;->LOTTIE:Lgv1/l;

    if-ne v4, v11, :cond_12

    move v4, v6

    goto :goto_b

    :cond_12
    const/4 v4, 0x0

    :goto_b
    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v11

    if-ne v11, v8, :cond_13

    new-instance v11, Lg11/b;

    const/16 v0, 0xd

    invoke-direct {v11, v0, v7}, Lg11/b;-><init>(ILp1/c1;)V

    invoke-virtual {v10, v11}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_13
    check-cast v11, Lc93/a;

    move v0, v9

    move-object v9, v11

    const/16 v11, 0x6030

    move-object/from16 v16, v12

    const/4 v12, 0x4

    move/from16 v18, v6

    const-string v6, "Lottie"

    move-object/from16 v22, v7

    const/4 v7, 0x0

    move-object v13, v8

    move-object/from16 v27, v16

    move-object/from16 v26, v22

    const/16 v17, 0x0

    move/from16 v16, v2

    move v8, v4

    const/high16 v4, 0x3f800000    # 1.0f

    move v2, v0

    move/from16 v0, v18

    invoke-static/range {v5 .. v12}, Lhy0/a1;->d(Landroidx/compose/ui/Modifier;Ljava/lang/String;Ljava/lang/String;ZLc93/a;Landroidx/compose/runtime/Composer;II)V

    float-to-double v5, v4

    cmpl-double v5, v5, v14

    if-lez v5, :cond_14

    goto :goto_c

    :cond_14
    invoke-static {v3}, Lm0/a;->a(Ljava/lang/String;)V

    :goto_c
    new-instance v5, Landroidx/compose/foundation/layout/LayoutWeightElement;

    cmpl-float v3, v4, v16

    if-lez v3, :cond_15

    move/from16 v11, v16

    goto :goto_d

    :cond_15
    move v11, v4

    :goto_d
    invoke-direct {v5, v11, v0}, Landroidx/compose/foundation/layout/LayoutWeightElement;-><init>(FZ)V

    invoke-static/range {v26 .. v26}, Lgv1/n;->f(Lp1/c1;)Lgv1/l;

    move-result-object v3

    sget-object v6, Lgv1/l;->IMAGE:Lgv1/l;

    if-ne v3, v6, :cond_16

    move v8, v0

    goto :goto_e

    :cond_16
    move/from16 v8, v17

    :goto_e
    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    if-ne v3, v13, :cond_17

    new-instance v3, Lg11/b;

    const/16 v6, 0xe

    move-object/from16 v14, v26

    invoke-direct {v3, v6, v14}, Lg11/b;-><init>(ILp1/c1;)V

    invoke-virtual {v10, v3}, Lp1/q;->p0(Ljava/lang/Object;)V

    goto :goto_f

    :cond_17
    move-object/from16 v14, v26

    :goto_f
    move-object v9, v3

    check-cast v9, Lc93/a;

    const/16 v11, 0x6030

    const/4 v12, 0x4

    const-string v6, "Image"

    const/4 v7, 0x0

    invoke-static/range {v5 .. v12}, Lhy0/a1;->d(Landroidx/compose/ui/Modifier;Ljava/lang/String;Ljava/lang/String;ZLc93/a;Landroidx/compose/runtime/Composer;II)V

    invoke-virtual {v10, v0}, Lp1/q;->q(Z)V

    invoke-virtual {v1, v10, v2}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v3

    invoke-virtual {v3}, Lb91/d;->a()Lb91/a;

    move-result-object v20

    invoke-virtual {v1, v10, v2}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v1

    invoke-virtual {v1}, Ly81/i;->c1()J

    move-result-wide v2

    and-int/lit8 v23, v21, 0xe

    sget v1, Lb91/a;->d:I

    shl-int/lit8 v24, v1, 0x12

    const v25, 0x2fffa

    const/4 v1, 0x0

    move v6, v4

    const-wide/16 v4, 0x0

    move v7, v6

    const/4 v6, 0x0

    move v8, v7

    const/4 v7, 0x0

    move v9, v8

    const/4 v8, 0x0

    move v11, v9

    move-object/from16 v22, v10

    const-wide/16 v9, 0x0

    move v12, v11

    const/4 v11, 0x0

    move v15, v12

    const/4 v12, 0x0

    move-object/from16 v16, v13

    move-object/from16 v26, v14

    const-wide/16 v13, 0x0

    move/from16 v18, v15

    const/4 v15, 0x0

    move-object/from16 v28, v16

    const/16 v16, 0x0

    move/from16 v29, v17

    const/16 v17, 0x0

    move/from16 v30, v18

    const/16 v18, 0x0

    const/16 v31, 0x6

    const/16 v19, 0x0

    move/from16 v32, v21

    const/16 v21, 0x0

    move-object/from16 v0, p0

    move-object/from16 v34, v28

    move/from16 v33, v32

    invoke-static/range {v0 .. v25}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v10, v22

    invoke-static/range {v26 .. v26}, Lgv1/n;->f(Lp1/c1;)Lgv1/l;

    move-result-object v0

    move/from16 v4, v33

    shr-int/lit8 v1, v4, 0x6

    and-int/lit8 v1, v1, 0x70

    invoke-static {v1}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v1

    move-object/from16 v2, p3

    invoke-interface {v2, v0, v10, v1}, Lkotlin/jvm/functions/Function3;->invoke(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-object/from16 v1, v27

    const/high16 v0, 0x3f800000    # 1.0f

    invoke-static {v0, v1}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v5

    const-string v0, "CONFIRM"

    invoke-static {v0}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v11

    and-int/lit16 v0, v4, 0x380

    const/16 v1, 0x100

    if-ne v0, v1, :cond_18

    const/4 v15, 0x1

    goto :goto_10

    :cond_18
    move/from16 v15, v29

    :goto_10
    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v0

    if-nez v15, :cond_1a

    move-object/from16 v13, v34

    if-ne v0, v13, :cond_19

    goto :goto_11

    :cond_19
    move-object/from16 v3, p2

    goto :goto_12

    :cond_1a
    :goto_11
    new-instance v0, Lbs1/i;

    const/16 v1, 0x11

    move-object/from16 v3, p2

    move-object/from16 v14, v26

    invoke-direct {v0, v3, v14, v1}, Lbs1/i;-><init>(Lkotlin/jvm/functions/Function1;Lp1/c1;I)V

    invoke-virtual {v10, v0}, Lp1/q;->p0(Ljava/lang/Object;)V

    :goto_12
    move-object/from16 v18, v0

    check-cast v18, Lc93/a;

    and-int/lit8 v0, v4, 0x70

    or-int/lit8 v0, v0, 0x6

    sget v1, Lcom/whoop/design/util/TextResource;->$stable:I

    shl-int/lit8 v1, v1, 0x12

    or-int v20, v0, v1

    const/16 v21, 0x0

    const/16 v22, 0x1fbc

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    move-object/from16 v19, v10

    const/4 v10, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    move/from16 v6, p1

    invoke-static/range {v5 .. v22}, Lny0/z;->j(Landroidx/compose/ui/Modifier;ZZLjava/lang/Integer;Landroidx/compose/ui/Modifier;Lv41/r0;Lcom/whoop/design/util/TextResource;Lg1/u0;Li2/t;Lf0/t;FLl0/k1;Lb91/a;Lc93/a;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v10, v19

    const/4 v0, 0x1

    invoke-virtual {v10, v0}, Lp1/q;->q(Z)V

    goto :goto_13

    :cond_1b
    move-object v3, v1

    invoke-virtual {v10}, Lp1/q;->X()V

    :goto_13
    invoke-virtual {v10}, Lp1/q;->u()Lp1/v1;

    move-result-object v7

    if-eqz v7, :cond_1c

    new-instance v0, Lar2/a;

    const/16 v6, 0xd

    move-object/from16 v1, p0

    move/from16 v5, p5

    move-object v4, v2

    move/from16 v2, p1

    invoke-direct/range {v0 .. v6}, Lar2/a;-><init>(Ljava/lang/String;ZLkotlin/jvm/functions/Function1;Ll83/e;II)V

    iput-object v0, v7, Lp1/v1;->d:Lc93/m;

    :cond_1c
    return-void
.end method

.method private static final f(Lp1/c1;)Lgv1/l;
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp1/c1;",
            ")",
            "Lgv1/l;"
        }
    .end annotation

    invoke-interface {p0}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Lgv1/l;

    return-object p0
.end method

.method private static final g(Lp1/c1;Lgv1/l;)V
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp1/c1;",
            "Lgv1/l;",
            ")V"
        }
    .end annotation

    invoke-interface {p0, p1}, Lp1/c1;->setValue(Ljava/lang/Object;)V

    return-void
.end method

.method private static final h(Lp1/c1;)Ll83/a0;
    .locals 1

    sget-object v0, Lgv1/l;->LOTTIE:Lgv1/l;

    invoke-static {p0, v0}, Lgv1/n;->g(Lp1/c1;Lgv1/l;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final i(Lp1/c1;)Ll83/a0;
    .locals 1

    sget-object v0, Lgv1/l;->IMAGE:Lgv1/l;

    invoke-static {p0, v0}, Lgv1/n;->g(Lp1/c1;Lgv1/l;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final j(Lkotlin/jvm/functions/Function1;Lp1/c1;)Ll83/a0;
    .locals 0

    invoke-static {p1}, Lgv1/n;->f(Lp1/c1;)Lgv1/l;

    move-result-object p1

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final k(Ljava/lang/String;ZLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function3;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 6

    or-int/lit8 p4, p4, 0x1

    invoke-static {p4}, Lp1/x;->L(I)I

    move-result v5

    move-object v0, p0

    move v1, p1

    move-object v2, p2

    move-object v3, p3

    move-object v4, p5

    invoke-static/range {v0 .. v5}, Lgv1/n;->e(Ljava/lang/String;ZLkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method
