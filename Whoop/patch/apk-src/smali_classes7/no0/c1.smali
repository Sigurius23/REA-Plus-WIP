.class public abstract Lno0/c1;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u001a7\u0010\u0008\u001a\u00020\u00062\u0008\u0008\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0014\u0008\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0001\u00a2\u0006\u0004\u0008\u0008\u0010\t\u00a8\u0006\n"
    }
    d2 = {
        "Landroidx/compose/ui/Modifier;",
        "modifier",
        "Llo0/v0;",
        "viewState",
        "Lkotlin/Function1;",
        "",
        "Ll83/a0;",
        "onViewEvent",
        "d",
        "(Landroidx/compose/ui/Modifier;Llo0/v0;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V",
        "clinician-in-the-loop_release"
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
.method public static synthetic a(Ljava/lang/Object;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lno0/c1;->e(Ljava/lang/Object;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lkotlin/jvm/functions/Function1;Llo0/v0;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lno0/c1;->f(Lkotlin/jvm/functions/Function1;Llo0/v0;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Landroidx/compose/ui/Modifier;Llo0/v0;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p6}, Lno0/c1;->g(Landroidx/compose/ui/Modifier;Llo0/v0;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final d(Landroidx/compose/ui/Modifier;Llo0/v0;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V
    .locals 37
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/ui/Modifier;",
            "Llo0/v0;",
            "Lkotlin/jvm/functions/Function1;",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    move-object/from16 v2, p1

    move/from16 v4, p4

    const-string v0, "viewState"

    invoke-static {v2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v8, p3

    check-cast v8, Lp1/q;

    const v0, -0x49d9085c

    invoke-virtual {v8, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, p5, 0x1

    if-eqz v0, :cond_0

    or-int/lit8 v5, v4, 0x6

    move v6, v5

    move-object/from16 v5, p0

    goto :goto_1

    :cond_0
    and-int/lit8 v5, v4, 0x6

    if-nez v5, :cond_2

    move-object/from16 v5, p0

    invoke-virtual {v8, v5}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_1

    const/4 v6, 0x4

    goto :goto_0

    :cond_1
    const/4 v6, 0x2

    :goto_0
    or-int/2addr v6, v4

    goto :goto_1

    :cond_2
    move-object/from16 v5, p0

    move v6, v4

    :goto_1
    and-int/lit8 v7, v4, 0x30

    if-nez v7, :cond_4

    invoke-virtual {v8, v2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_3

    const/16 v7, 0x20

    goto :goto_2

    :cond_3
    const/16 v7, 0x10

    :goto_2
    or-int/2addr v6, v7

    :cond_4
    and-int/lit8 v7, p5, 0x4

    if-eqz v7, :cond_6

    or-int/lit16 v6, v6, 0x180

    :cond_5
    move-object/from16 v10, p2

    :goto_3
    move v15, v6

    goto :goto_5

    :cond_6
    and-int/lit16 v10, v4, 0x180

    if-nez v10, :cond_5

    move-object/from16 v10, p2

    invoke-virtual {v8, v10}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v11

    if-eqz v11, :cond_7

    const/16 v11, 0x100

    goto :goto_4

    :cond_7
    const/16 v11, 0x80

    :goto_4
    or-int/2addr v6, v11

    goto :goto_3

    :goto_5
    and-int/lit16 v6, v15, 0x93

    const/16 v11, 0x92

    const/4 v12, 0x0

    if-eq v6, v11, :cond_8

    const/4 v6, 0x1

    goto :goto_6

    :cond_8
    move v6, v12

    :goto_6
    and-int/lit8 v11, v15, 0x1

    invoke-virtual {v8, v11, v6}, Lp1/q;->U(IZ)Z

    move-result v6

    if-eqz v6, :cond_21

    sget-object v11, Lb2/t;->w:Lb2/t;

    if-eqz v0, :cond_9

    move-object v0, v11

    goto :goto_7

    :cond_9
    move-object v0, v5

    :goto_7
    sget-object v5, Lp1/l;->a:Lp1/v0;

    if-eqz v7, :cond_b

    invoke-virtual {v8}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v6

    if-ne v6, v5, :cond_a

    new-instance v6, Ln72/b;

    const/16 v7, 0x1d

    invoke-direct {v6, v7}, Ln72/b;-><init>(I)V

    invoke-virtual {v8, v6}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_a
    check-cast v6, Lkotlin/jvm/functions/Function1;

    move-object v14, v6

    goto :goto_8

    :cond_b
    move-object v14, v10

    :goto_8
    const/high16 v6, 0x3f800000    # 1.0f

    invoke-static {v6, v0}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v7

    sget-object v10, Ll0/m;->c:Ll0/g;

    sget-object v3, Lb2/e;->M:Lb2/k;

    invoke-static {v10, v3, v8, v12}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v10

    iget-wide v12, v8, Lp1/q;->T:J

    invoke-static {v12, v13}, Ljava/lang/Long;->hashCode(J)I

    move-result v12

    invoke-virtual {v8}, Lp1/q;->m()Lp1/p1;

    move-result-object v13

    invoke-static {v8, v7}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v7

    sget-object v18, La3/l;->a:La3/k;

    invoke-virtual/range {v18 .. v18}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v9, La3/k;->b:La3/j;

    invoke-virtual {v8}, Lp1/q;->i0()V

    iget-boolean v1, v8, Lp1/q;->S:Z

    if-eqz v1, :cond_c

    invoke-virtual {v8, v9}, Lp1/q;->l(Lc93/a;)V

    goto :goto_9

    :cond_c
    invoke-virtual {v8}, Lp1/q;->s0()V

    :goto_9
    sget-object v1, La3/k;->g:La3/i;

    invoke-static {v8, v1, v10}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v10, La3/k;->f:La3/i;

    invoke-static {v8, v10, v13}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v13, La3/k;->j:La3/i;

    iget-boolean v6, v8, Lp1/q;->S:Z

    if-nez v6, :cond_d

    invoke-virtual {v8}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v6

    move-object/from16 v31, v0

    invoke-static {v12}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v0

    invoke-static {v6, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_e

    goto :goto_a

    :cond_d
    move-object/from16 v31, v0

    :goto_a
    invoke-static {v12, v8, v12, v13}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_e
    sget-object v0, La3/k;->d:La3/i;

    invoke-static {v8, v0, v7}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const/high16 v6, 0x3f800000    # 1.0f

    invoke-static {v6, v11}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v7

    const/4 v12, 0x2

    int-to-float v12, v12

    const/16 v6, 0x8

    int-to-float v6, v6

    mul-float/2addr v12, v6

    const/4 v4, 0x0

    move/from16 v19, v6

    const/4 v6, 0x1

    invoke-static {v7, v4, v12, v6}, Landroidx/compose/foundation/layout/a;->r(Landroidx/compose/ui/Modifier;FFI)Landroidx/compose/ui/Modifier;

    move-result-object v20

    and-int/lit16 v4, v15, 0x380

    const/16 v6, 0x100

    if-ne v4, v6, :cond_f

    const/4 v6, 0x1

    goto :goto_b

    :cond_f
    const/4 v6, 0x0

    :goto_b
    invoke-virtual {v8, v2}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v4

    or-int/2addr v4, v6

    invoke-virtual {v8}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v6

    if-nez v4, :cond_10

    if-ne v6, v5, :cond_11

    :cond_10
    new-instance v6, Lno0/o0;

    const/16 v4, 0x8

    invoke-direct {v6, v4, v14, v2}, Lno0/o0;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v8, v6}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_11
    move-object/from16 v24, v6

    check-cast v24, Lc93/a;

    const/16 v25, 0xf

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    invoke-static/range {v20 .. v25}, Landroidx/compose/foundation/a;->g(Landroidx/compose/ui/Modifier;ZLjava/lang/String;Li3/i;Lc93/a;I)Landroidx/compose/ui/Modifier;

    move-result-object v4

    sget-object v5, Lb2/e;->K:Lb2/l;

    const/4 v6, 0x1

    int-to-float v7, v6

    mul-float v17, v7, v19

    invoke-static/range {v17 .. v17}, Ll0/m;->i(F)Ll0/k;

    move-result-object v7

    const/16 v6, 0x36

    invoke-static {v7, v5, v8, v6}, Ll0/p1;->a(Ll0/i;Lb2/g;Landroidx/compose/runtime/Composer;I)Ll0/r1;

    move-result-object v5

    iget-wide v6, v8, Lp1/q;->T:J

    invoke-static {v6, v7}, Ljava/lang/Long;->hashCode(J)I

    move-result v6

    invoke-virtual {v8}, Lp1/q;->m()Lp1/p1;

    move-result-object v7

    invoke-static {v8, v4}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    invoke-virtual {v8}, Lp1/q;->i0()V

    iget-boolean v2, v8, Lp1/q;->S:Z

    if-eqz v2, :cond_12

    invoke-virtual {v8, v9}, Lp1/q;->l(Lc93/a;)V

    goto :goto_c

    :cond_12
    invoke-virtual {v8}, Lp1/q;->s0()V

    :goto_c
    invoke-static {v8, v1, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v8, v10, v7}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v2, v8, Lp1/q;->S:Z

    if-nez v2, :cond_13

    invoke-virtual {v8}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-static {v2, v5}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_14

    :cond_13
    invoke-static {v6, v8, v6, v13}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_14
    invoke-static {v8, v0, v4}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual/range {p1 .. p1}, Llo0/v0;->e()Lkd1/o;

    move-result-object v5

    if-nez v5, :cond_15

    const v2, 0xad4ff03

    invoke-virtual {v8, v2}, Lp1/q;->e0(I)V

    const/4 v2, 0x0

    invoke-virtual {v8, v2}, Lp1/q;->q(Z)V

    move-object/from16 p2, v3

    move-object v3, v10

    move-object/from16 v35, v11

    move/from16 v34, v12

    move-object/from16 v33, v13

    move-object/from16 v32, v14

    move/from16 v16, v15

    const/4 v4, 0x1

    move v15, v2

    move-object v2, v9

    :goto_d
    const/high16 v6, 0x3f800000    # 1.0f

    goto/16 :goto_f

    :cond_15
    const/4 v2, 0x0

    const v4, 0xad4ff04

    invoke-virtual {v8, v4}, Lp1/q;->e0(I)V

    const/4 v4, 0x4

    int-to-float v6, v4

    mul-float v6, v6, v19

    invoke-static {v6, v11}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    sget-object v6, Lt0/j;->a:Lt0/i;

    invoke-static {v4, v6}, Lwb3/f;->r(Landroidx/compose/ui/Modifier;Li2/a1;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    sget-object v6, Lb2/e;->w:Lb2/m;

    invoke-static {v6, v2}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v6

    move-object/from16 p2, v3

    iget-wide v2, v8, Lp1/q;->T:J

    invoke-static {v2, v3}, Ljava/lang/Long;->hashCode(J)I

    move-result v2

    invoke-virtual {v8}, Lp1/q;->m()Lp1/p1;

    move-result-object v3

    invoke-static {v8, v4}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    invoke-virtual {v8}, Lp1/q;->i0()V

    iget-boolean v7, v8, Lp1/q;->S:Z

    if-eqz v7, :cond_16

    invoke-virtual {v8, v9}, Lp1/q;->l(Lc93/a;)V

    goto :goto_e

    :cond_16
    invoke-virtual {v8}, Lp1/q;->s0()V

    :goto_e
    invoke-static {v8, v1, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v8, v10, v3}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v3, v8, Lp1/q;->S:Z

    if-nez v3, :cond_17

    invoke-virtual {v8}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-static {v3, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_18

    :cond_17
    invoke-static {v2, v8, v2, v13}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_18
    invoke-static {v8, v0, v4}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    move-object v2, v9

    sget v9, Lkd1/o;->a:I

    move-object v3, v10

    const/4 v10, 0x3

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/high16 v4, 0x3f800000    # 1.0f

    const/16 v18, 0x1

    invoke-static/range {v5 .. v10}, Lkd1/p;->i(Lkd1/o;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)Ln2/a;

    move-result-object v5

    move-object/from16 v27, v8

    invoke-static {v4, v11}, Landroidx/compose/foundation/layout/d;->d(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v7

    move-object v6, v13

    const/16 v13, 0x61b0

    move-object v8, v14

    const/16 v14, 0x68

    move-object v9, v6

    const-string v6, ""

    move-object v10, v8

    const/4 v8, 0x0

    move-object/from16 v19, v9

    sget-object v9, Ly2/j;->a:Ly2/b1;

    move-object/from16 v20, v10

    const/4 v10, 0x0

    move-object/from16 v21, v11

    const/4 v11, 0x0

    move/from16 v34, v12

    move/from16 v16, v15

    move/from16 v4, v18

    move-object/from16 v33, v19

    move-object/from16 v32, v20

    move-object/from16 v35, v21

    move-object/from16 v12, v27

    const/4 v15, 0x0

    invoke-static/range {v5 .. v14}, Lpf/c;->c(Ln2/a;Ljava/lang/String;Landroidx/compose/ui/Modifier;Lb2/h;Ly2/k;FLi2/y;Landroidx/compose/runtime/Composer;II)V

    move-object v8, v12

    invoke-virtual {v8, v4}, Lp1/q;->q(Z)V

    invoke-virtual {v8, v15}, Lp1/q;->q(Z)V

    goto/16 :goto_d

    :goto_f
    float-to-double v9, v6

    const-wide/16 v11, 0x0

    cmpl-double v5, v9, v11

    if-lez v5, :cond_19

    goto :goto_10

    :cond_19
    const-string v5, "invalid weight; must be greater than zero"

    invoke-static {v5}, Lm0/a;->a(Ljava/lang/String;)V

    :goto_10
    new-instance v5, Landroidx/compose/foundation/layout/LayoutWeightElement;

    invoke-direct {v5, v6, v4}, Landroidx/compose/foundation/layout/LayoutWeightElement;-><init>(FZ)V

    invoke-static/range {v17 .. v17}, Ll0/m;->i(F)Ll0/k;

    move-result-object v6

    const/4 v7, 0x6

    move-object/from16 v9, p2

    invoke-static {v6, v9, v8, v7}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v6

    iget-wide v9, v8, Lp1/q;->T:J

    invoke-static {v9, v10}, Ljava/lang/Long;->hashCode(J)I

    move-result v9

    invoke-virtual {v8}, Lp1/q;->m()Lp1/p1;

    move-result-object v10

    invoke-static {v8, v5}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v5

    invoke-virtual {v8}, Lp1/q;->i0()V

    iget-boolean v11, v8, Lp1/q;->S:Z

    if-eqz v11, :cond_1a

    invoke-virtual {v8, v2}, Lp1/q;->l(Lc93/a;)V

    goto :goto_11

    :cond_1a
    invoke-virtual {v8}, Lp1/q;->s0()V

    :goto_11
    invoke-static {v8, v1, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v8, v3, v10}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v1, v8, Lp1/q;->S:Z

    if-nez v1, :cond_1b

    invoke-virtual {v8}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_1c

    :cond_1b
    move-object/from16 v6, v33

    invoke-static {v9, v8, v9, v6}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_1c
    invoke-static {v8, v0, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual/range {p1 .. p1}, Llo0/v0;->h()Ljava/lang/String;

    move-result-object v5

    sget-object v0, Lx81/d;->a:Lx81/d;

    sget v1, Lx81/d;->b:I

    invoke-virtual {v0, v8, v1}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v2

    invoke-virtual {v2}, Lb91/d;->a()Lb91/a;

    move-result-object v25

    invoke-virtual {v0, v8, v1}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v2

    invoke-virtual {v2}, Ly81/i;->y()J

    move-result-wide v2

    sget v6, Lb91/a;->d:I

    shl-int/lit8 v29, v6, 0x12

    const v30, 0x2fffa

    const/4 v6, 0x0

    const-wide/16 v9, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    move/from16 v17, v15

    const-wide/16 v14, 0x0

    move/from16 v18, v16

    const/16 v16, 0x0

    move/from16 v19, v17

    const/16 v17, 0x0

    move/from16 v20, v18

    move/from16 v21, v19

    const-wide/16 v18, 0x0

    move/from16 v22, v20

    const/16 v20, 0x0

    move/from16 v23, v21

    const/16 v21, 0x0

    move/from16 v24, v22

    const/16 v22, 0x0

    move/from16 v26, v23

    const/16 v23, 0x0

    move/from16 v27, v24

    const/16 v24, 0x0

    move/from16 v28, v26

    const/16 v26, 0x0

    move/from16 v33, v28

    const/16 v28, 0x0

    move/from16 v36, v27

    move-object/from16 v27, v8

    move-wide v7, v2

    move/from16 v2, v36

    move/from16 v3, v33

    invoke-static/range {v5 .. v30}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v8, v27

    invoke-virtual/range {p1 .. p1}, Llo0/v0;->g()Ljava/lang/String;

    move-result-object v5

    if-nez v5, :cond_1d

    const v5, -0x2ea0a668

    invoke-virtual {v8, v5}, Lp1/q;->e0(I)V

    invoke-virtual {v8, v3}, Lp1/q;->q(Z)V

    goto :goto_12

    :cond_1d
    const v6, -0x2ea0a667

    invoke-virtual {v8, v6}, Lp1/q;->e0(I)V

    invoke-virtual {v0, v8, v1}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v6

    invoke-virtual {v6}, Lb91/d;->b()Lb91/a;

    move-result-object v25

    invoke-virtual {v0, v8, v1}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v6

    invoke-virtual {v6}, Ly81/i;->b1()J

    move-result-wide v6

    const/16 v28, 0x0

    const v30, 0x2fffa

    move-object/from16 v27, v8

    move-wide v7, v6

    const/4 v6, 0x0

    const-wide/16 v9, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const-wide/16 v14, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const-wide/16 v18, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v26, 0x0

    invoke-static/range {v5 .. v30}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v8, v27

    invoke-virtual {v8, v3}, Lp1/q;->q(Z)V

    :goto_12
    invoke-virtual {v8, v4}, Lp1/q;->q(Z)V

    invoke-virtual/range {p1 .. p1}, Llo0/v0;->c()Lhy0/h1;

    move-result-object v5

    if-nez v5, :cond_1e

    const v5, 0xae6b9d9

    invoke-virtual {v8, v5}, Lp1/q;->e0(I)V

    invoke-virtual {v8, v3}, Lp1/q;->q(Z)V

    goto :goto_13

    :cond_1e
    const v6, 0xae6b9da

    invoke-virtual {v8, v6}, Lp1/q;->e0(I)V

    sget v9, Lhy0/h1;->w:I

    const/4 v10, 0x6

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-static/range {v5 .. v10}, Lhy0/g1;->h(Lhy0/h1;Landroidx/compose/ui/Modifier;Lc93/a;Landroidx/compose/runtime/Composer;II)V

    invoke-virtual {v8, v3}, Lp1/q;->q(Z)V

    :goto_13
    invoke-virtual/range {p1 .. p1}, Llo0/v0;->b()Lgz0/m0;

    move-result-object v5

    if-nez v5, :cond_1f

    const v0, 0xae84728

    invoke-virtual {v8, v0}, Lp1/q;->e0(I)V

    invoke-virtual {v8, v3}, Lp1/q;->q(Z)V

    move-object/from16 v13, v35

    goto :goto_14

    :cond_1f
    const v6, 0xae84729

    const/4 v7, 0x6

    invoke-static {v8, v6, v5, v8, v7}, Lih0/d0;->s(Lp1/q;ILgz0/m0;Lp1/q;I)Lo2/e;

    move-result-object v5

    invoke-virtual {v0, v8, v1}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v0

    invoke-virtual {v0}, Ly81/i;->b1()J

    move-result-wide v0

    const/4 v6, 0x4

    int-to-float v6, v6

    mul-float/2addr v6, v6

    move-object/from16 v13, v35

    invoke-static {v6, v13}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v7

    const/16 v11, 0x1b0

    const/4 v12, 0x0

    const-string v6, ""

    move-object v10, v8

    move-wide v8, v0

    invoke-static/range {v5 .. v12}, Lg1/f3;->b(Lo2/e;Ljava/lang/String;Landroidx/compose/ui/Modifier;JLandroidx/compose/runtime/Composer;II)V

    move-object v8, v10

    invoke-virtual {v8, v3}, Lp1/q;->q(Z)V

    :goto_14
    invoke-virtual {v8, v4}, Lp1/q;->q(Z)V

    const v0, -0x5367fa8a

    invoke-virtual {v8, v0}, Lp1/q;->e0(I)V

    invoke-virtual/range {p1 .. p1}, Llo0/v0;->f()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_15
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_20

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    move-object v5, v1

    check-cast v5, Lm91/u;

    move/from16 v12, v34

    invoke-static {v12, v13}, Landroidx/compose/foundation/layout/d;->h(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    invoke-static {v8, v1}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    invoke-static {}, Lmo0/b;->y()Lm91/p;

    move-result-object v6

    sget v1, Lm91/p;->b:I

    shl-int/lit8 v1, v1, 0x3

    shl-int/lit8 v7, v2, 0x3

    and-int/lit16 v7, v7, 0x1c00

    or-int v10, v1, v7

    const/4 v11, 0x4

    const/4 v7, 0x0

    move-object v9, v8

    move-object/from16 v8, v32

    invoke-static/range {v5 .. v11}, Lm91/l;->r(Lm91/u;Lm91/p;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    move-object v8, v9

    goto :goto_15

    :cond_20
    move-object/from16 v10, v32

    invoke-virtual {v8, v3}, Lp1/q;->q(Z)V

    invoke-virtual {v8, v4}, Lp1/q;->q(Z)V

    move-object/from16 v1, v31

    :goto_16
    move-object v3, v10

    goto :goto_17

    :cond_21
    invoke-virtual {v8}, Lp1/q;->X()V

    move-object v1, v5

    goto :goto_16

    :goto_17
    invoke-virtual {v8}, Lp1/q;->u()Lp1/v1;

    move-result-object v7

    if-eqz v7, :cond_22

    new-instance v0, Lm31/h;

    const/16 v6, 0x12

    move-object/from16 v2, p1

    move/from16 v4, p4

    move/from16 v5, p5

    invoke-direct/range {v0 .. v6}, Lm31/h;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;III)V

    iput-object v0, v7, Lp1/v1;->d:Lc93/m;

    :cond_22
    return-void
.end method

.method private static final e(Ljava/lang/Object;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final f(Lkotlin/jvm/functions/Function1;Llo0/v0;)Ll83/a0;
    .locals 0

    invoke-virtual {p1}, Llo0/v0;->a()Lcom/whoop/navigation/e;

    move-result-object p1

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final g(Landroidx/compose/ui/Modifier;Llo0/v0;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 6

    or-int/lit8 p3, p3, 0x1

    invoke-static {p3}, Lp1/x;->L(I)I

    move-result v4

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move v5, p4

    move-object v3, p5

    invoke-static/range {v0 .. v5}, Lno0/c1;->d(Landroidx/compose/ui/Modifier;Llo0/v0;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method
