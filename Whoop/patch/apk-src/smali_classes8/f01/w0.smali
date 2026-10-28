.class public abstract Lf01/w0;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u001a5\u0010\u0008\u001a\u00020\u00062\u0008\u0008\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0007\u00a2\u0006\u0004\u0008\u0008\u0010\t\u001a\u000f\u0010\n\u001a\u00020\u0006H\u0007\u00a2\u0006\u0004\u0008\n\u0010\u000b\u00a8\u0006\u000c"
    }
    d2 = {
        "Landroidx/compose/ui/Modifier;",
        "modifier",
        "Lf01/x0;",
        "viewState",
        "Lkotlin/Function1;",
        "",
        "Ll83/a0;",
        "onViewEvent",
        "e",
        "(Landroidx/compose/ui/Modifier;Lf01/x0;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V",
        "i",
        "(Landroidx/compose/runtime/Composer;I)V",
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
.method public static synthetic a(ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, Lf01/w0;->j(ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Landroidx/compose/ui/Modifier;Lf01/x0;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p6}, Lf01/w0;->h(Landroidx/compose/ui/Modifier;Lf01/x0;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Lm91/u;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/Modifier;
    .locals 0

    invoke-static {p0, p1, p2}, Lf01/w0;->f(Lm91/u;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/Modifier;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 0

    invoke-static {p1, p0}, Lf01/w0;->g(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final e(Landroidx/compose/ui/Modifier;Lf01/x0;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V
    .locals 44
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/ui/Modifier;",
            "Lf01/x0;",
            "Lkotlin/jvm/functions/Function1;",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    move-object/from16 v5, p1

    move-object/from16 v6, p2

    move/from16 v1, p4

    const-string v0, "viewState"

    invoke-static {v5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "onViewEvent"

    invoke-static {v6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v10, p3

    check-cast v10, Lp1/q;

    const v0, 0x6cf64f12

    invoke-virtual {v10, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, p5, 0x1

    if-eqz v0, :cond_0

    or-int/lit8 v3, v1, 0x6

    move v4, v3

    move-object/from16 v3, p0

    goto :goto_1

    :cond_0
    and-int/lit8 v3, v1, 0x6

    if-nez v3, :cond_2

    move-object/from16 v3, p0

    invoke-virtual {v10, v3}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_1

    const/4 v4, 0x4

    goto :goto_0

    :cond_1
    const/4 v4, 0x2

    :goto_0
    or-int/2addr v4, v1

    goto :goto_1

    :cond_2
    move-object/from16 v3, p0

    move v4, v1

    :goto_1
    and-int/lit8 v7, v1, 0x30

    if-nez v7, :cond_4

    invoke-virtual {v10, v5}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_3

    const/16 v7, 0x20

    goto :goto_2

    :cond_3
    const/16 v7, 0x10

    :goto_2
    or-int/2addr v4, v7

    :cond_4
    and-int/lit16 v7, v1, 0x180

    if-nez v7, :cond_6

    invoke-virtual {v10, v6}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_5

    const/16 v7, 0x100

    goto :goto_3

    :cond_5
    const/16 v7, 0x80

    :goto_3
    or-int/2addr v4, v7

    :cond_6
    and-int/lit16 v7, v4, 0x93

    const/16 v8, 0x92

    const/4 v14, 0x0

    if-eq v7, v8, :cond_7

    const/4 v7, 0x1

    goto :goto_4

    :cond_7
    move v7, v14

    :goto_4
    and-int/lit8 v8, v4, 0x1

    invoke-virtual {v10, v8, v7}, Lp1/q;->U(IZ)Z

    move-result v7

    if-eqz v7, :cond_23

    sget-object v7, Lb2/t;->w:Lb2/t;

    if-eqz v0, :cond_8

    move-object v3, v7

    :cond_8
    const/high16 v0, 0x3f800000    # 1.0f

    invoke-static {v0, v3}, Landroidx/compose/foundation/layout/d;->d(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v8

    sget-object v9, Lb2/e;->w:Lb2/m;

    invoke-static {v9, v14}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v9

    iget-wide v11, v10, Lp1/q;->T:J

    invoke-static {v11, v12}, Ljava/lang/Long;->hashCode(J)I

    move-result v11

    invoke-virtual {v10}, Lp1/q;->m()Lp1/p1;

    move-result-object v12

    invoke-static {v10, v8}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v8

    sget-object v16, La3/l;->a:La3/k;

    invoke-virtual/range {v16 .. v16}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v2, La3/k;->b:La3/j;

    invoke-virtual {v10}, Lp1/q;->i0()V

    iget-boolean v13, v10, Lp1/q;->S:Z

    if-eqz v13, :cond_9

    invoke-virtual {v10, v2}, Lp1/q;->l(Lc93/a;)V

    goto :goto_5

    :cond_9
    invoke-virtual {v10}, Lp1/q;->s0()V

    :goto_5
    sget-object v13, La3/k;->g:La3/i;

    invoke-static {v10, v13, v9}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v9, La3/k;->f:La3/i;

    invoke-static {v10, v9, v12}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v12, La3/k;->j:La3/i;

    iget-boolean v15, v10, Lp1/q;->S:Z

    if-nez v15, :cond_a

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v15

    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v14

    invoke-static {v15, v14}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v14

    if-nez v14, :cond_b

    :cond_a
    invoke-static {v11, v10, v11, v12}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_b
    sget-object v14, La3/k;->d:La3/i;

    invoke-static {v10, v14, v8}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v0, v7}, Landroidx/compose/foundation/layout/d;->d(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v8

    sget-object v11, Ll0/m;->d:Ll0/g;

    sget-object v15, Lb2/e;->M:Lb2/k;

    const/4 v0, 0x6

    invoke-static {v11, v15, v10, v0}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v11

    iget-wide v0, v10, Lp1/q;->T:J

    invoke-static {v0, v1}, Ljava/lang/Long;->hashCode(J)I

    move-result v0

    invoke-virtual {v10}, Lp1/q;->m()Lp1/p1;

    move-result-object v1

    invoke-static {v10, v8}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v8

    invoke-virtual {v10}, Lp1/q;->i0()V

    move-object/from16 v33, v3

    iget-boolean v3, v10, Lp1/q;->S:Z

    if-eqz v3, :cond_c

    invoke-virtual {v10, v2}, Lp1/q;->l(Lc93/a;)V

    goto :goto_6

    :cond_c
    invoke-virtual {v10}, Lp1/q;->s0()V

    :goto_6
    invoke-static {v10, v13, v11}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v10, v9, v1}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v1, v10, Lp1/q;->S:Z

    if-nez v1, :cond_d

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    invoke-static {v0}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_e

    :cond_d
    invoke-static {v0, v10, v0, v12}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_e
    invoke-static {v10, v14, v8}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual {v5}, Lf01/x0;->b()Lkd1/o;

    move-result-object v0

    const-string v3, "invalid weight; must be greater than zero"

    const-wide/16 v19, 0x0

    if-nez v0, :cond_f

    const v0, 0x13bfc011

    invoke-virtual {v10, v0}, Lp1/q;->e0(I)V

    const/4 v8, 0x0

    invoke-virtual {v10, v8}, Lp1/q;->q(Z)V

    const/4 v0, 0x0

    move-object/from16 v17, v3

    move/from16 v36, v4

    move-object/from16 v35, v7

    move v1, v8

    move-object/from16 v34, v12

    move-object v3, v13

    move-object v5, v14

    move-object v6, v15

    const/4 v4, 0x1

    const v18, 0x7f7fffff    # Float.MAX_VALUE

    move-object v7, v0

    move-object v0, v9

    goto/16 :goto_a

    :cond_f
    const/4 v8, 0x0

    const v11, 0x13bfc012

    invoke-virtual {v10, v11}, Lp1/q;->e0(I)V

    const/high16 v11, 0x3f800000    # 1.0f

    const v18, 0x7f7fffff    # Float.MAX_VALUE

    invoke-static {v11, v7}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    move-object/from16 v21, v9

    float-to-double v8, v11

    cmpl-double v8, v8, v19

    if-lez v8, :cond_10

    goto :goto_7

    :cond_10
    invoke-static {v3}, Lm0/a;->a(Ljava/lang/String;)V

    :goto_7
    new-instance v8, Landroidx/compose/foundation/layout/LayoutWeightElement;

    cmpl-float v9, v11, v18

    if-lez v9, :cond_11

    move/from16 v9, v18

    :goto_8
    const/4 v11, 0x1

    goto :goto_9

    :cond_11
    const/high16 v9, 0x3f800000    # 1.0f

    goto :goto_8

    :goto_9
    invoke-direct {v8, v9, v11}, Landroidx/compose/foundation/layout/LayoutWeightElement;-><init>(FZ)V

    invoke-interface {v1, v8}, Landroidx/compose/ui/Modifier;->e(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    move/from16 v17, v11

    const/4 v11, 0x0

    move-object v8, v12

    const/4 v12, 0x3

    move-object v9, v8

    const/4 v8, 0x0

    move-object/from16 v23, v9

    const/4 v9, 0x0

    move-object/from16 v35, v7

    move-object/from16 v34, v23

    const/16 v22, 0x0

    move-object v7, v0

    move-object/from16 v0, v21

    invoke-static/range {v7 .. v12}, Lkd1/p;->i(Lkd1/o;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)Ln2/a;

    move-result-object v7

    move-object/from16 v29, v10

    move-object v8, v15

    const/16 v15, 0x6030

    const/16 v9, 0x100

    const/16 v16, 0x68

    move-object v10, v8

    const/4 v8, 0x0

    move-object v11, v10

    const/4 v10, 0x0

    move-object v12, v11

    sget-object v11, Ly2/j;->a:Ly2/b1;

    move-object/from16 v21, v12

    const/4 v12, 0x0

    move-object/from16 v23, v13

    const/4 v13, 0x0

    move-object v9, v1

    move/from16 v36, v4

    move-object v5, v14

    move/from16 v4, v17

    move-object/from16 v6, v21

    move/from16 v1, v22

    move-object/from16 v14, v29

    move-object/from16 v17, v3

    move-object/from16 v3, v23

    invoke-static/range {v7 .. v16}, Lpf/c;->c(Ln2/a;Ljava/lang/String;Landroidx/compose/ui/Modifier;Lb2/h;Ly2/k;FLi2/y;Landroidx/compose/runtime/Composer;II)V

    move-object v10, v14

    invoke-virtual {v10, v1}, Lp1/q;->q(Z)V

    sget-object v7, Ll83/a0;->a:Ll83/a0;

    :goto_a
    if-nez v7, :cond_15

    const v7, 0x13c54ba7

    invoke-virtual {v10, v7}, Lp1/q;->e0(I)V

    invoke-virtual/range {p1 .. p1}, Lf01/x0;->c()Lv41/r0;

    move-result-object v8

    if-nez v8, :cond_12

    const v7, 0x13c54ba6

    invoke-virtual {v10, v7}, Lp1/q;->e0(I)V

    invoke-virtual {v10, v1}, Lp1/q;->q(Z)V

    move-object/from16 v4, v35

    goto :goto_d

    :cond_12
    invoke-virtual {v10, v7}, Lp1/q;->e0(I)V

    move-object/from16 v7, v35

    const/high16 v11, 0x3f800000    # 1.0f

    invoke-static {v11, v7}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v9

    float-to-double v12, v11

    cmpl-double v12, v12, v19

    if-lez v12, :cond_13

    goto :goto_b

    :cond_13
    invoke-static/range {v17 .. v17}, Lm0/a;->a(Ljava/lang/String;)V

    :goto_b
    new-instance v12, Landroidx/compose/foundation/layout/LayoutWeightElement;

    cmpl-float v13, v11, v18

    if-lez v13, :cond_14

    move/from16 v11, v18

    goto :goto_c

    :cond_14
    const/high16 v11, 0x3f800000    # 1.0f

    :goto_c
    invoke-direct {v12, v11, v4}, Landroidx/compose/foundation/layout/LayoutWeightElement;-><init>(FZ)V

    invoke-interface {v9, v12}, Landroidx/compose/ui/Modifier;->e(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v9

    const/high16 v17, 0xc00000

    const/16 v18, 0x17c

    move-object/from16 v35, v7

    move-object v7, v9

    const/4 v9, 0x0

    move-object/from16 v29, v10

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    sget-object v14, Ly2/j;->b:Ly2/b1;

    const/4 v15, 0x0

    move-object/from16 v16, v29

    move-object/from16 v4, v35

    invoke-static/range {v7 .. v18}, Lv41/p;->h(Landroidx/compose/ui/Modifier;Lv41/r0;ZFILc93/a;Lkotlin/jvm/functions/Function1;Ly2/k;Ljava/lang/Float;Landroidx/compose/runtime/Composer;II)V

    move-object/from16 v10, v16

    invoke-virtual {v10, v1}, Lp1/q;->q(Z)V

    :goto_d
    invoke-virtual {v10, v1}, Lp1/q;->q(Z)V

    :goto_e
    const/high16 v11, 0x3f800000    # 1.0f

    goto :goto_f

    :cond_15
    move-object/from16 v4, v35

    const v7, 0x743ffca0

    invoke-virtual {v10, v7}, Lp1/q;->e0(I)V

    invoke-virtual {v10, v1}, Lp1/q;->q(Z)V

    goto :goto_e

    :goto_f
    invoke-static {v11, v4}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v12

    const/4 v7, 0x3

    int-to-float v7, v7

    const/16 v8, 0x8

    int-to-float v8, v8

    mul-float v16, v7, v8

    const/16 v17, 0x7

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    invoke-static/range {v12 .. v17}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v7

    const/4 v11, 0x1

    int-to-float v9, v11

    mul-float v35, v9, v8

    invoke-static/range {v35 .. v35}, Ll0/m;->i(F)Ll0/k;

    move-result-object v9

    const/4 v11, 0x6

    invoke-static {v9, v6, v10, v11}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v9

    iget-wide v11, v10, Lp1/q;->T:J

    invoke-static {v11, v12}, Ljava/lang/Long;->hashCode(J)I

    move-result v11

    invoke-virtual {v10}, Lp1/q;->m()Lp1/p1;

    move-result-object v12

    invoke-static {v10, v7}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v7

    invoke-virtual {v10}, Lp1/q;->i0()V

    iget-boolean v13, v10, Lp1/q;->S:Z

    if-eqz v13, :cond_16

    invoke-virtual {v10, v2}, Lp1/q;->l(Lc93/a;)V

    goto :goto_10

    :cond_16
    invoke-virtual {v10}, Lp1/q;->s0()V

    :goto_10
    invoke-static {v10, v3, v9}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v10, v0, v12}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v9, v10, Lp1/q;->S:Z

    if-nez v9, :cond_17

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v9

    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v12

    invoke-static {v9, v12}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v9

    if-nez v9, :cond_18

    :cond_17
    move-object/from16 v9, v34

    goto :goto_11

    :cond_18
    move-object/from16 v9, v34

    goto :goto_12

    :goto_11
    invoke-static {v11, v10, v11, v9}, Ld;->y(ILp1/q;ILa3/i;)V

    :goto_12
    invoke-static {v10, v5, v7}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual/range {p1 .. p1}, Lf01/x0;->f()Ljava/lang/String;

    move-result-object v7

    const-wide/high16 v11, 0x4004000000000000L    # 2.5

    const/4 v13, 0x0

    if-nez v7, :cond_19

    const v7, 0x3db768de

    invoke-virtual {v10, v7}, Lp1/q;->e0(I)V

    invoke-virtual {v10, v1}, Lp1/q;->q(Z)V

    move-object/from16 v34, v2

    move-object/from16 v37, v3

    move-object/from16 v41, v5

    move/from16 v40, v8

    move-object v5, v9

    move-wide v2, v11

    goto/16 :goto_13

    :cond_19
    const v14, 0x3db768df

    invoke-virtual {v10, v14}, Lp1/q;->e0(I)V

    double-to-float v14, v11

    mul-float/2addr v14, v8

    const/4 v15, 0x2

    invoke-static {v4, v14, v13, v15}, Landroidx/compose/foundation/layout/a;->r(Landroidx/compose/ui/Modifier;FFI)Landroidx/compose/ui/Modifier;

    move-result-object v14

    sget-object v15, Lx81/d;->a:Lx81/d;

    const/4 v11, 0x6

    invoke-virtual {v15, v10, v11}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v12

    invoke-virtual {v12}, Lb91/d;->O()Lb91/a;

    move-result-object v27

    invoke-virtual {v15, v10, v11}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v12

    invoke-virtual {v12}, Ly81/i;->y()J

    move-result-wide v11

    const/16 v31, 0x0

    const v32, 0x2fff8

    move-object/from16 v34, v9

    move-object/from16 v29, v10

    move-wide v9, v11

    const-wide/16 v11, 0x0

    move v15, v13

    const/4 v13, 0x0

    move/from16 v18, v8

    move-object v8, v14

    const/4 v14, 0x0

    move/from16 v19, v15

    const/4 v15, 0x0

    const-wide/high16 v20, 0x4004000000000000L    # 2.5

    const-wide/16 v16, 0x0

    move/from16 v22, v18

    const/16 v18, 0x0

    move/from16 v23, v19

    const/16 v19, 0x0

    move-wide/from16 v24, v20

    const-wide/16 v20, 0x0

    move/from16 v26, v22

    const/16 v22, 0x0

    move/from16 v28, v23

    const/16 v23, 0x0

    move-wide/from16 v37, v24

    const/16 v24, 0x0

    const/16 v25, 0x0

    move/from16 v30, v26

    const/16 v26, 0x0

    move/from16 v39, v28

    const/16 v28, 0x0

    move/from16 v40, v30

    const/16 v30, 0x30

    move-object/from16 v41, v5

    move-object/from16 v5, v34

    move-object/from16 v34, v2

    move-wide/from16 v42, v37

    move-object/from16 v37, v3

    move-wide/from16 v2, v42

    invoke-static/range {v7 .. v32}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v10, v29

    invoke-virtual {v10, v1}, Lp1/q;->q(Z)V

    :goto_13
    invoke-virtual/range {p1 .. p1}, Lf01/x0;->e()Ljava/lang/String;

    move-result-object v7

    if-nez v7, :cond_1a

    const v7, 0x3dbce01b

    invoke-virtual {v10, v7}, Lp1/q;->e0(I)V

    invoke-virtual {v10, v1}, Lp1/q;->q(Z)V

    goto :goto_14

    :cond_1a
    const v8, 0x3dbce01c

    invoke-virtual {v10, v8}, Lp1/q;->e0(I)V

    double-to-float v8, v2

    mul-float v8, v8, v40

    const/4 v9, 0x0

    const/4 v15, 0x2

    invoke-static {v4, v8, v9, v15}, Landroidx/compose/foundation/layout/a;->r(Landroidx/compose/ui/Modifier;FFI)Landroidx/compose/ui/Modifier;

    move-result-object v8

    sget-object v11, Lx81/d;->a:Lx81/d;

    const/4 v12, 0x6

    invoke-virtual {v11, v10, v12}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v13

    invoke-virtual {v13}, Lb91/d;->a()Lb91/a;

    move-result-object v27

    invoke-virtual {v11, v10, v12}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v11

    invoke-virtual {v11}, Ly81/i;->c1()J

    move-result-wide v11

    const/16 v31, 0x0

    const v32, 0x2fff8

    move/from16 v39, v9

    move-object/from16 v29, v10

    move-wide v9, v11

    const-wide/16 v11, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const-wide/16 v16, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const-wide/16 v20, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v28, 0x0

    const/16 v30, 0x30

    invoke-static/range {v7 .. v32}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v10, v29

    invoke-virtual {v10, v1}, Lp1/q;->q(Z)V

    :goto_14
    invoke-virtual/range {p1 .. p1}, Lf01/x0;->a()Ljava/util/List;

    move-result-object v7

    check-cast v7, Ljava/util/Collection;

    invoke-interface {v7}, Ljava/util/Collection;->isEmpty()Z

    move-result v7

    if-nez v7, :cond_22

    const v7, 0x3dc2e88a

    invoke-virtual {v10, v7}, Lp1/q;->e0(I)V

    const/high16 v11, 0x3f800000    # 1.0f

    invoke-static {v11, v4}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v12

    const/4 v4, 0x2

    int-to-float v7, v4

    mul-float v14, v7, v40

    const/16 v16, 0x0

    const/16 v17, 0xd

    const/4 v13, 0x0

    const/4 v15, 0x0

    invoke-static/range {v12 .. v17}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v7

    double-to-float v2, v2

    mul-float v2, v2, v40

    const/4 v15, 0x0

    invoke-static {v7, v2, v15, v4}, Landroidx/compose/foundation/layout/a;->r(Landroidx/compose/ui/Modifier;FFI)Landroidx/compose/ui/Modifier;

    move-result-object v2

    invoke-static/range {v35 .. v35}, Ll0/m;->i(F)Ll0/k;

    move-result-object v3

    const/4 v11, 0x6

    invoke-static {v3, v6, v10, v11}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v3

    iget-wide v6, v10, Lp1/q;->T:J

    invoke-static {v6, v7}, Ljava/lang/Long;->hashCode(J)I

    move-result v4

    invoke-virtual {v10}, Lp1/q;->m()Lp1/p1;

    move-result-object v6

    invoke-static {v10, v2}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    invoke-virtual {v10}, Lp1/q;->i0()V

    iget-boolean v7, v10, Lp1/q;->S:Z

    if-eqz v7, :cond_1b

    move-object/from16 v7, v34

    invoke-virtual {v10, v7}, Lp1/q;->l(Lc93/a;)V

    :goto_15
    move-object/from16 v7, v37

    goto :goto_16

    :cond_1b
    invoke-virtual {v10}, Lp1/q;->s0()V

    goto :goto_15

    :goto_16
    invoke-static {v10, v7, v3}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v10, v0, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v0, v10, Lp1/q;->S:Z

    if-nez v0, :cond_1d

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v0

    invoke-static {v4}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-static {v0, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_1c

    goto :goto_18

    :cond_1c
    :goto_17
    move-object/from16 v5, v41

    goto :goto_19

    :cond_1d
    :goto_18
    invoke-static {v4, v10, v4, v5}, Ld;->y(ILp1/q;ILa3/i;)V

    goto :goto_17

    :goto_19
    invoke-static {v10, v5, v2}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const v0, -0x2e58b027

    invoke-virtual {v10, v0}, Lp1/q;->e0(I)V

    invoke-virtual/range {p1 .. p1}, Lf01/x0;->a()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_1a
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_21

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    move-object v7, v2

    check-cast v7, Lm91/u;

    invoke-static {}, Lm91/m;->m()Lm91/p;

    move-result-object v8

    new-instance v9, Leg2/a;

    const/16 v2, 0xd

    invoke-direct {v9, v2}, Leg2/a;-><init>(I)V

    move/from16 v4, v36

    and-int/lit16 v2, v4, 0x380

    const/16 v3, 0x100

    if-ne v2, v3, :cond_1e

    const/4 v14, 0x1

    goto :goto_1b

    :cond_1e
    move v14, v1

    :goto_1b
    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    if-nez v14, :cond_20

    sget-object v5, Lp1/l;->a:Lp1/v0;

    if-ne v2, v5, :cond_1f

    goto :goto_1c

    :cond_1f
    move-object/from16 v6, p2

    goto :goto_1d

    :cond_20
    :goto_1c
    new-instance v2, Ldk2/i;

    const/16 v5, 0xf

    move-object/from16 v6, p2

    invoke-direct {v2, v6, v5}, Ldk2/i;-><init>(Lkotlin/jvm/functions/Function1;I)V

    invoke-virtual {v10, v2}, Lp1/q;->p0(Ljava/lang/Object;)V

    :goto_1d
    check-cast v2, Lkotlin/jvm/functions/Function1;

    const/4 v12, 0x0

    const/4 v13, 0x0

    move-object v11, v10

    move-object v10, v2

    invoke-static/range {v7 .. v13}, Lm91/l;->r(Lm91/u;Lm91/p;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    move/from16 v36, v4

    move-object v10, v11

    goto :goto_1a

    :cond_21
    move-object/from16 v6, p2

    const/4 v11, 0x1

    invoke-static {v10, v1, v11, v1}, Lm4/a;->y(Lp1/q;ZZZ)V

    goto :goto_1e

    :cond_22
    move-object/from16 v6, p2

    const/4 v11, 0x1

    const v0, 0x3dce85a2

    invoke-virtual {v10, v0}, Lp1/q;->e0(I)V

    invoke-virtual {v10, v1}, Lp1/q;->q(Z)V

    :goto_1e
    invoke-static {v10, v11, v11, v11}, Lm4/a;->y(Lp1/q;ZZZ)V

    move-object/from16 v4, v33

    goto :goto_1f

    :cond_23
    invoke-virtual {v10}, Lp1/q;->X()V

    move-object v4, v3

    :goto_1f
    invoke-virtual {v10}, Lp1/q;->u()Lp1/v1;

    move-result-object v7

    if-eqz v7, :cond_24

    new-instance v0, Le11/b;

    const/16 v3, 0x1b

    move-object/from16 v5, p1

    move/from16 v1, p4

    move/from16 v2, p5

    invoke-direct/range {v0 .. v6}, Le11/b;-><init>(IIILjava/lang/Object;Ljava/lang/Object;Ll83/e;)V

    iput-object v0, v7, Lp1/v1;->d:Lc93/m;

    :cond_24
    return-void
.end method

.method private static final f(Lm91/u;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/Modifier;
    .locals 0

    const-string p2, "it"

    invoke-static {p0, p2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Lp1/q;

    const p0, -0x3df32423

    invoke-virtual {p1, p0}, Lp1/q;->e0(I)V

    sget-object p0, Lb2/t;->w:Lb2/t;

    const/high16 p2, 0x3f800000    # 1.0f

    invoke-static {p2, p0}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object p0

    const/4 p2, 0x0

    invoke-virtual {p1, p2}, Lp1/q;->q(Z)V

    return-object p0
.end method

.method private static final g(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final h(Landroidx/compose/ui/Modifier;Lf01/x0;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 6

    or-int/lit8 p3, p3, 0x1

    invoke-static {p3}, Lp1/x;->L(I)I

    move-result v4

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move v5, p4

    move-object v3, p5

    invoke-static/range {v0 .. v5}, Lf01/w0;->e(Landroidx/compose/ui/Modifier;Lf01/x0;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static final i(Landroidx/compose/runtime/Composer;I)V
    .locals 3

    check-cast p0, Lp1/q;

    const v0, -0x262fe7d

    invoke-virtual {p0, v0}, Lp1/q;->g0(I)Lp1/q;

    if-eqz p1, :cond_0

    const/4 v0, 0x1

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    and-int/lit8 v1, p1, 0x1

    invoke-virtual {p0, v1, v0}, Lp1/q;->U(IZ)Z

    move-result v0

    if-eqz v0, :cond_1

    new-instance v0, Lkotlin/jvm/internal/k0;

    const/16 v1, 0xa

    invoke-direct {v0, v1}, Lkotlin/jvm/internal/k0;-><init>(I)V

    invoke-static {}, Lx81/e;->s()Lp1/t1;

    move-result-object v1

    invoke-static {v1, v0}, Lc13/a;->r(Lp1/t1;Lkotlin/jvm/internal/k0;)Lp1/t1;

    move-result-object v1

    invoke-static {v1, v0}, Lc13/a;->C(Lp1/t1;Lkotlin/jvm/internal/k0;)Lp1/t1;

    move-result-object v1

    invoke-static {v1, v0}, Lc13/a;->A(Lp1/t1;Lkotlin/jvm/internal/k0;)Lp1/t1;

    move-result-object v1

    invoke-static {v1, v0}, Lc13/a;->B(Lp1/t1;Lkotlin/jvm/internal/k0;)Lp1/t1;

    move-result-object v1

    sget-object v2, Lm83/a0;->w:Lm83/a0;

    invoke-static {v2, v1, v0}, Lc13/a;->p(Lm83/a0;Lp1/t1;Lkotlin/jvm/internal/k0;)Lp1/t1;

    move-result-object v1

    invoke-static {v2, v1, v0}, Lc13/a;->z(Lm83/a0;Lp1/t1;Lkotlin/jvm/internal/k0;)Lp1/t1;

    move-result-object v1

    sget-object v2, Lfy1/i;->a:Lfy1/i;

    invoke-static {v1, v2, v0}, Lc13/a;->q(Lp1/t1;Lfy1/i;Lkotlin/jvm/internal/k0;)Lp1/t1;

    move-result-object v1

    sget-object v2, Ldp0/i;->a:Ldp0/i;

    invoke-virtual {v1, v2}, Lp1/t1;->a(Ljava/lang/Object;)Lp1/u1;

    move-result-object v1

    invoke-virtual {v0, v1}, Lkotlin/jvm/internal/k0;->a(Ljava/lang/Object;)V

    sget-object v1, Lb3/v1;->l:Lp1/u2;

    iget-object v2, v0, Lkotlin/jvm/internal/k0;->a:Ljava/util/ArrayList;

    invoke-static {v1, v0, v2}, Lc13/a;->g(Lp1/u2;Lkotlin/jvm/internal/k0;Ljava/util/ArrayList;)I

    move-result v0

    new-array v0, v0, [Lp1/u1;

    invoke-virtual {v2, v0}, Ljava/util/ArrayList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;

    move-result-object v0

    check-cast v0, [Lp1/u1;

    new-instance v1, Lf01/w0$a;

    invoke-direct {v1}, Lf01/w0$a;-><init>()V

    const v2, -0x124c2861

    invoke-static {v2, p0, v1}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v1

    const/16 v2, 0x38

    invoke-static {v0, v1, p0, v2}, Lp1/x;->b([Lp1/u1;Lc93/m;Landroidx/compose/runtime/Composer;I)V

    goto :goto_1

    :cond_1
    invoke-virtual {p0}, Lp1/q;->X()V

    :goto_1
    invoke-virtual {p0}, Lp1/q;->u()Lp1/v1;

    move-result-object p0

    if-eqz p0, :cond_2

    new-instance v0, Lf01/c0;

    const/4 v1, 0x4

    const/4 v2, 0x0

    invoke-direct {v0, v2, p1, v1}, Lf01/c0;-><init>(BII)V

    iput-object v0, p0, Lp1/v1;->d:Lc93/m;

    :cond_2
    return-void
.end method

.method private static final j(ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p0, p0, 0x1

    invoke-static {p0}, Lp1/x;->L(I)I

    move-result p0

    invoke-static {p1, p0}, Lf01/w0;->i(Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method
