.class public abstract Lkm0/b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u001a7\u0010\u0008\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u00022\u0014\u0008\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0007\u00a2\u0006\u0004\u0008\u0008\u0010\t\u00a8\u0006\n"
    }
    d2 = {
        "Lkm0/a;",
        "bottomSheetSelectorItemState",
        "Landroidx/compose/ui/Modifier;",
        "modifier",
        "Lkotlin/Function1;",
        "",
        "Ll83/a0;",
        "onViewEvent",
        "d",
        "(Lkm0/a;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V",
        "bottomsheet-item-selector_release"
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
.method public static synthetic a(Lkotlin/jvm/functions/Function1;Lkm0/a;Z)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, Lkm0/b;->f(Lkotlin/jvm/functions/Function1;Lkm0/a;Z)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Ljava/lang/Object;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lkm0/b;->e(Ljava/lang/Object;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Lkm0/a;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p6}, Lkm0/b;->g(Lkm0/a;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final d(Lkm0/a;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V
    .locals 40
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkm0/a;",
            "Landroidx/compose/ui/Modifier;",
            "Lkotlin/jvm/functions/Function1;",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    move-object/from16 v1, p0

    move/from16 v4, p4

    const-string v0, "bottomSheetSelectorItemState"

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v8, p3

    check-cast v8, Lp1/q;

    const v0, 0x45a13a4b

    invoke-virtual {v8, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, v4, 0x6

    const/4 v2, 0x4

    if-nez v0, :cond_1

    invoke-virtual {v8, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    move v0, v2

    goto :goto_0

    :cond_0
    const/4 v0, 0x2

    :goto_0
    or-int/2addr v0, v4

    goto :goto_1

    :cond_1
    move v0, v4

    :goto_1
    and-int/lit8 v3, p5, 0x2

    if-eqz v3, :cond_3

    or-int/lit8 v0, v0, 0x30

    :cond_2
    move-object/from16 v5, p1

    goto :goto_3

    :cond_3
    and-int/lit8 v5, v4, 0x30

    if-nez v5, :cond_2

    move-object/from16 v5, p1

    invoke-virtual {v8, v5}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_4

    const/16 v6, 0x20

    goto :goto_2

    :cond_4
    const/16 v6, 0x10

    :goto_2
    or-int/2addr v0, v6

    :goto_3
    and-int/lit8 v6, p5, 0x4

    if-eqz v6, :cond_6

    or-int/lit16 v0, v0, 0x180

    :cond_5
    move-object/from16 v7, p2

    goto :goto_5

    :cond_6
    and-int/lit16 v7, v4, 0x180

    if-nez v7, :cond_5

    move-object/from16 v7, p2

    invoke-virtual {v8, v7}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_7

    const/16 v9, 0x100

    goto :goto_4

    :cond_7
    const/16 v9, 0x80

    :goto_4
    or-int/2addr v0, v9

    :goto_5
    and-int/lit16 v9, v0, 0x93

    const/16 v10, 0x92

    const/4 v11, 0x1

    const/4 v12, 0x0

    if-eq v9, v10, :cond_8

    move v9, v11

    goto :goto_6

    :cond_8
    move v9, v12

    :goto_6
    and-int/lit8 v10, v0, 0x1

    invoke-virtual {v8, v10, v9}, Lp1/q;->U(IZ)Z

    move-result v9

    if-eqz v9, :cond_1a

    sget-object v16, Lb2/t;->w:Lb2/t;

    if-eqz v3, :cond_9

    move-object/from16 v3, v16

    goto :goto_7

    :cond_9
    move-object v3, v5

    :goto_7
    sget-object v13, Lp1/l;->a:Lp1/v0;

    if-eqz v6, :cond_b

    invoke-virtual {v8}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    if-ne v5, v13, :cond_a

    new-instance v5, Lkf0/d;

    const/16 v6, 0x17

    invoke-direct {v5, v6}, Lkf0/d;-><init>(I)V

    invoke-virtual {v8, v5}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_a
    check-cast v5, Lkotlin/jvm/functions/Function1;

    move-object v14, v5

    goto :goto_8

    :cond_b
    move-object v14, v7

    :goto_8
    invoke-virtual {v1}, Lkm0/a;->getId()Ljava/lang/String;

    move-result-object v5

    const-string v6, " "

    const-string v7, "_"

    invoke-static {v5, v6, v7, v12}, Lyb3/y;->K(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Ljava/lang/String;

    move-result-object v5

    const-string v6, "_Checkbox"

    invoke-virtual {v5, v6}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v5

    const/high16 v6, 0x3f800000    # 1.0f

    invoke-static {v6, v3}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v7

    const/16 v9, 0xb

    int-to-float v9, v9

    int-to-float v2, v2

    mul-float/2addr v9, v2

    const/4 v10, 0x0

    invoke-static {v7, v10, v9, v11}, Landroidx/compose/foundation/layout/d;->b(Landroidx/compose/ui/Modifier;FFI)Landroidx/compose/ui/Modifier;

    move-result-object v7

    sget-object v9, Lb2/e;->K:Lb2/l;

    sget-object v10, Ll0/m;->a:Ll0/e;

    const/16 v15, 0x30

    invoke-static {v10, v9, v8, v15}, Ll0/p1;->a(Ll0/i;Lb2/g;Landroidx/compose/runtime/Composer;I)Ll0/r1;

    move-result-object v9

    iget-wide v11, v8, Lp1/q;->T:J

    invoke-static {v11, v12}, Ljava/lang/Long;->hashCode(J)I

    move-result v10

    invoke-virtual {v8}, Lp1/q;->m()Lp1/p1;

    move-result-object v11

    invoke-static {v8, v7}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v7

    sget-object v12, La3/l;->a:La3/k;

    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v12, La3/k;->b:La3/j;

    invoke-virtual {v8}, Lp1/q;->i0()V

    iget-boolean v6, v8, Lp1/q;->S:Z

    if-eqz v6, :cond_c

    invoke-virtual {v8, v12}, Lp1/q;->l(Lc93/a;)V

    goto :goto_9

    :cond_c
    invoke-virtual {v8}, Lp1/q;->s0()V

    :goto_9
    sget-object v6, La3/k;->g:La3/i;

    invoke-static {v8, v6, v9}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v9, La3/k;->f:La3/i;

    invoke-static {v8, v9, v11}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v11, La3/k;->j:La3/i;

    iget-boolean v15, v8, Lp1/q;->S:Z

    if-nez v15, :cond_d

    invoke-virtual {v8}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v15

    move/from16 v24, v2

    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-static {v15, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_e

    goto :goto_a

    :cond_d
    move/from16 v24, v2

    :goto_a
    invoke-static {v10, v8, v10, v11}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_e
    sget-object v2, La3/k;->d:La3/i;

    invoke-static {v8, v2, v7}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual {v1}, Lkm0/a;->b()Lkd1/o;

    move-result-object v7

    const/16 v15, 0x8

    if-eqz v7, :cond_f

    const v7, -0x234a98de

    invoke-virtual {v8, v7}, Lp1/q;->e0(I)V

    move-object v7, v5

    invoke-virtual {v1}, Lkm0/a;->b()Lkd1/o;

    move-result-object v5

    move-object v10, v9

    sget v9, Lkd1/o;->a:I

    move-object/from16 v17, v10

    const/4 v10, 0x3

    move-object/from16 v18, v6

    const/4 v6, 0x0

    move-object/from16 v19, v7

    const/4 v7, 0x0

    move-object/from16 v33, v17

    move-object/from16 v32, v18

    move-object/from16 v31, v19

    invoke-static/range {v5 .. v10}, Lkd1/p;->i(Lkd1/o;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)Ln2/a;

    move-result-object v5

    sget-object v6, Lx81/d;->a:Lx81/d;

    sget v7, Lx81/d;->b:I

    invoke-virtual {v6, v8, v7}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v6

    invoke-virtual {v6}, Ly81/i;->Y0()J

    move-result-wide v6

    move-object v9, v11

    new-instance v11, Li2/p;

    const/4 v10, 0x5

    invoke-direct {v11, v6, v7, v10}, Li2/p;-><init>(JI)V

    const-wide/high16 v6, 0x3ffc000000000000L    # 1.75

    double-to-float v6, v6

    int-to-float v7, v15

    mul-float v19, v6, v7

    const/16 v20, 0x0

    const/16 v21, 0xb

    const/16 v17, 0x0

    const/16 v18, 0x0

    invoke-static/range {v16 .. v21}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v6

    const/4 v7, 0x6

    int-to-float v7, v7

    mul-float v7, v7, v24

    invoke-static {v7, v6}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v7

    move-object v6, v13

    const/16 v13, 0x1b0

    move-object v10, v14

    const/16 v14, 0x38

    move-object/from16 v17, v6

    const/4 v6, 0x0

    move-object/from16 v27, v8

    const/4 v8, 0x0

    move-object/from16 v18, v9

    const/4 v9, 0x0

    move-object/from16 v19, v10

    const/4 v10, 0x0

    move-object/from16 v36, v12

    move-object/from16 v38, v16

    move-object/from16 v39, v17

    move-object/from16 v37, v18

    move-object/from16 v35, v19

    move-object/from16 v12, v27

    const/4 v15, 0x0

    invoke-static/range {v5 .. v14}, Lpf/c;->c(Ln2/a;Ljava/lang/String;Landroidx/compose/ui/Modifier;Lb2/h;Ly2/k;FLi2/y;Landroidx/compose/runtime/Composer;II)V

    move-object v8, v12

    invoke-virtual {v8, v15}, Lp1/q;->q(Z)V

    :goto_b
    const/high16 v5, 0x3f800000    # 1.0f

    goto :goto_c

    :cond_f
    move-object/from16 v31, v5

    move-object/from16 v32, v6

    move-object/from16 v33, v9

    move-object/from16 v37, v11

    move-object/from16 v36, v12

    move-object/from16 v39, v13

    move-object/from16 v35, v14

    move-object/from16 v38, v16

    const/4 v15, 0x0

    const v5, -0x23456305

    invoke-virtual {v8, v5}, Lp1/q;->e0(I)V

    invoke-virtual {v8, v15}, Lp1/q;->q(Z)V

    goto :goto_b

    :goto_c
    float-to-double v6, v5

    const-wide/16 v9, 0x0

    cmpl-double v6, v6, v9

    if-lez v6, :cond_10

    goto :goto_d

    :cond_10
    const-string v6, "invalid weight; must be greater than zero"

    invoke-static {v6}, Lm0/a;->a(Ljava/lang/String;)V

    :goto_d
    new-instance v6, Landroidx/compose/foundation/layout/LayoutWeightElement;

    const/4 v7, 0x1

    invoke-direct {v6, v5, v7}, Landroidx/compose/foundation/layout/LayoutWeightElement;-><init>(FZ)V

    sget-object v5, Ll0/m;->e:Ll0/h;

    sget-object v9, Lb2/e;->M:Lb2/k;

    const/16 v10, 0x36

    invoke-static {v5, v9, v8, v10}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v5

    iget-wide v9, v8, Lp1/q;->T:J

    invoke-static {v9, v10}, Ljava/lang/Long;->hashCode(J)I

    move-result v9

    invoke-virtual {v8}, Lp1/q;->m()Lp1/p1;

    move-result-object v10

    invoke-static {v8, v6}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v6

    invoke-virtual {v8}, Lp1/q;->i0()V

    iget-boolean v11, v8, Lp1/q;->S:Z

    if-eqz v11, :cond_11

    move-object/from16 v11, v36

    invoke-virtual {v8, v11}, Lp1/q;->l(Lc93/a;)V

    :goto_e
    move-object/from16 v11, v32

    goto :goto_f

    :cond_11
    invoke-virtual {v8}, Lp1/q;->s0()V

    goto :goto_e

    :goto_f
    invoke-static {v8, v11, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    move-object/from16 v5, v33

    invoke-static {v8, v5, v10}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v5, v8, Lp1/q;->S:Z

    if-nez v5, :cond_12

    invoke-virtual {v8}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    invoke-static {v5, v10}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_13

    :cond_12
    move-object/from16 v5, v37

    invoke-static {v9, v8, v9, v5}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_13
    invoke-static {v8, v2, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual {v1}, Lkm0/a;->e()Lcom/whoop/design/util/TextResource;

    move-result-object v2

    sget v5, Lcom/whoop/design/util/TextResource;->$stable:I

    invoke-static {v2, v8, v5}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v2

    invoke-static {}, Lb91/e;->e()Lb91/d;

    move-result-object v6

    invoke-virtual {v6}, Lb91/d;->a()Lb91/a;

    move-result-object v25

    sget-object v6, Lx81/d;->a:Lx81/d;

    sget v9, Lx81/d;->b:I

    invoke-virtual {v6, v8, v9}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v10

    invoke-virtual {v10}, Ly81/i;->y()J

    move-result-wide v10

    sget v12, Lb91/a;->d:I

    shl-int/lit8 v29, v12, 0x12

    const v30, 0x2fffa

    move-object v12, v6

    const/4 v6, 0x0

    move/from16 v22, v7

    move-object/from16 v27, v8

    move-wide v7, v10

    move v11, v9

    const-wide/16 v9, 0x0

    move v13, v11

    const/4 v11, 0x0

    move-object v14, v12

    const/4 v12, 0x0

    move/from16 v16, v13

    const/4 v13, 0x0

    move-object/from16 v17, v14

    move/from16 v23, v15

    const-wide/16 v14, 0x0

    move/from16 v18, v16

    const/16 v16, 0x0

    move-object/from16 v19, v17

    const/16 v17, 0x0

    move/from16 v21, v18

    move-object/from16 v20, v19

    const-wide/16 v18, 0x0

    move-object/from16 v24, v20

    const/16 v20, 0x0

    move/from16 v26, v21

    const/16 v21, 0x0

    move/from16 v28, v22

    const/16 v22, 0x0

    move/from16 v32, v23

    const/16 v23, 0x0

    move-object/from16 v33, v24

    const/16 v24, 0x0

    move/from16 v34, v26

    const/16 v26, 0x0

    move/from16 v36, v28

    const/16 v28, 0x0

    move v1, v5

    move-object v5, v2

    move v2, v1

    move/from16 v1, v32

    move/from16 v4, v34

    move-object/from16 v32, v3

    move-object/from16 v3, v33

    const/16 v33, 0x30

    invoke-static/range {v5 .. v30}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v8, v27

    invoke-virtual/range {p0 .. p0}, Lkm0/a;->d()Lcom/whoop/design/util/TextResource;

    move-result-object v5

    if-eqz v5, :cond_14

    invoke-virtual/range {p0 .. p0}, Lkm0/a;->d()Lcom/whoop/design/util/TextResource;

    move-result-object v5

    invoke-static {v5}, Lcom/whoop/design/util/b;->d(Lcom/whoop/design/util/TextResource;)Z

    move-result v5

    if-eqz v5, :cond_14

    const v5, -0x7b585e67

    invoke-virtual {v8, v5}, Lp1/q;->e0(I)V

    invoke-virtual/range {p0 .. p0}, Lkm0/a;->d()Lcom/whoop/design/util/TextResource;

    move-result-object v5

    invoke-static {v5, v8, v2}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v5

    invoke-static {}, Lb91/e;->e()Lb91/d;

    move-result-object v2

    invoke-virtual {v2}, Lb91/d;->c()Lb91/a;

    move-result-object v25

    invoke-virtual {v3, v8, v4}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v2

    invoke-virtual {v2}, Ly81/i;->c1()J

    move-result-wide v2

    const/16 v28, 0x0

    const v30, 0x2fffa

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

    move-object/from16 v27, v8

    move-wide v7, v2

    invoke-static/range {v5 .. v30}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v8, v27

    invoke-virtual {v8, v1}, Lp1/q;->q(Z)V

    goto :goto_10

    :cond_14
    const v2, -0x7b54fd4f

    invoke-virtual {v8, v2}, Lp1/q;->e0(I)V

    invoke-virtual {v8, v1}, Lp1/q;->q(Z)V

    :goto_10
    invoke-virtual/range {p0 .. p0}, Lkm0/a;->c()Lhy0/h1;

    move-result-object v5

    if-nez v5, :cond_15

    const v2, -0x7b5437ee

    invoke-virtual {v8, v2}, Lp1/q;->e0(I)V

    invoke-virtual {v8, v1}, Lp1/q;->q(Z)V

    move-object/from16 v3, v38

    :goto_11
    const/4 v2, 0x1

    goto :goto_12

    :cond_15
    const v2, -0x7b5437ed

    invoke-virtual {v8, v2}, Lp1/q;->e0(I)V

    const-wide/high16 v2, 0x3fe0000000000000L    # 0.5

    double-to-float v2, v2

    const/16 v3, 0x8

    int-to-float v4, v3

    move-object/from16 v3, v38

    invoke-static {v2, v4, v3, v8}, Lih0/d0;->u(FFLb2/t;Lp1/q;)V

    sget v9, Lhy0/h1;->w:I

    const/4 v10, 0x6

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-static/range {v5 .. v10}, Lhy0/g1;->h(Lhy0/h1;Landroidx/compose/ui/Modifier;Lc93/a;Landroidx/compose/runtime/Composer;II)V

    invoke-virtual {v8, v1}, Lp1/q;->q(Z)V

    goto :goto_11

    :goto_12
    invoke-virtual {v8, v2}, Lp1/q;->q(Z)V

    const v4, 0x5171d68f

    invoke-virtual {v8, v4}, Lp1/q;->e0(I)V

    invoke-virtual/range {p0 .. p0}, Lkm0/a;->f()Ljava/util/List;

    move-result-object v4

    check-cast v4, Ljava/lang/Iterable;

    invoke-interface {v4}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v4

    :goto_13
    invoke-interface {v4}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    if-eqz v5, :cond_16

    invoke-interface {v4}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lhy0/h1;

    int-to-float v6, v2

    const/16 v11, 0x8

    int-to-float v7, v11

    mul-float v19, v6, v7

    const/16 v20, 0x0

    const/16 v21, 0xb

    const/16 v17, 0x0

    const/16 v18, 0x0

    move-object/from16 v16, v3

    invoke-static/range {v16 .. v21}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v6

    sget v7, Lhy0/h1;->w:I

    or-int/lit8 v9, v7, 0x30

    const/4 v10, 0x4

    const/4 v7, 0x0

    invoke-static/range {v5 .. v10}, Lhy0/g1;->h(Lhy0/h1;Landroidx/compose/ui/Modifier;Lc93/a;Landroidx/compose/runtime/Composer;II)V

    goto :goto_13

    :cond_16
    invoke-virtual {v8, v1}, Lp1/q;->q(Z)V

    const v4, 0x3f8ccccd    # 1.1f

    invoke-static {v4, v3}, Ldt/b;->N(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    move-object/from16 v7, v31

    invoke-static {v3, v7}, Lgb1/d;->d(Landroidx/compose/ui/Modifier;Ljava/lang/String;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    invoke-virtual/range {p0 .. p0}, Lkm0/a;->g()Z

    move-result v4

    sget-object v5, Lx81/d;->a:Lx81/d;

    sget v6, Lx81/d;->b:I

    invoke-virtual {v5, v8, v6}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v7

    invoke-virtual {v7}, Ly81/i;->y()J

    move-result-wide v9

    invoke-virtual/range {p0 .. p0}, Lkm0/a;->a()Ly81/e;

    move-result-object v7

    invoke-interface {v7, v8, v1}, Ly81/e;->toComposableColor-WaAFU9c(Landroidx/compose/runtime/Composer;I)J

    move-result-wide v11

    invoke-virtual {v5, v8, v6}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v5

    invoke-virtual {v5}, Ly81/i;->w()J

    move-result-wide v5

    const/4 v14, 0x0

    const/16 v15, 0x18

    move-object/from16 v27, v8

    move-wide v7, v9

    move-wide v9, v5

    move-wide v5, v11

    const-wide/16 v11, 0x0

    move-object/from16 v13, v27

    invoke-static/range {v5 .. v15}, Ldp/d;->r(JJJJLandroidx/compose/runtime/Composer;II)Lg1/r1;

    move-result-object v9

    move-object v8, v13

    and-int/lit16 v0, v0, 0x380

    const/16 v5, 0x100

    if-ne v0, v5, :cond_17

    move v11, v2

    :goto_14
    move-object/from16 v1, p0

    goto :goto_15

    :cond_17
    move v11, v1

    goto :goto_14

    :goto_15
    invoke-virtual {v8, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v0

    or-int/2addr v0, v11

    invoke-virtual {v8}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    if-nez v0, :cond_19

    move-object/from16 v6, v39

    if-ne v5, v6, :cond_18

    goto :goto_16

    :cond_18
    move-object/from16 v13, v35

    goto :goto_17

    :cond_19
    :goto_16
    new-instance v5, Ljp1/c;

    const/16 v0, 0xb

    move-object/from16 v13, v35

    invoke-direct {v5, v0, v13, v1}, Ljp1/c;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v8, v5}, Lp1/q;->p0(Ljava/lang/Object;)V

    :goto_17
    move-object v6, v5

    check-cast v6, Lkotlin/jvm/functions/Function1;

    const/4 v11, 0x0

    const/16 v12, 0x18

    move-object/from16 v27, v8

    const/4 v8, 0x0

    move-object v7, v3

    move v5, v4

    move-object/from16 v10, v27

    invoke-static/range {v5 .. v12}, Lg1/b1;->a(ZLkotlin/jvm/functions/Function1;Landroidx/compose/ui/Modifier;ZLg1/a1;Landroidx/compose/runtime/Composer;II)V

    move-object v8, v10

    invoke-virtual {v8, v2}, Lp1/q;->q(Z)V

    move-object v3, v13

    move-object/from16 v2, v32

    goto :goto_18

    :cond_1a
    invoke-virtual {v8}, Lp1/q;->X()V

    move-object v2, v5

    move-object v3, v7

    :goto_18
    invoke-virtual {v8}, Lp1/q;->u()Lp1/v1;

    move-result-object v7

    if-eqz v7, :cond_1b

    new-instance v0, Ljp1/d;

    const/16 v6, 0xd

    move/from16 v4, p4

    move/from16 v5, p5

    invoke-direct/range {v0 .. v6}, Ljp1/d;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;III)V

    iput-object v0, v7, Lp1/v1;->d:Lc93/m;

    :cond_1b
    return-void
.end method

.method private static final e(Ljava/lang/Object;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final f(Lkotlin/jvm/functions/Function1;Lkm0/a;Z)Ll83/a0;
    .locals 0

    new-instance p2, Lkm0/c$a;

    invoke-virtual {p1}, Lkm0/a;->getId()Ljava/lang/String;

    move-result-object p1

    invoke-direct {p2, p1}, Lkm0/c$a;-><init>(Ljava/lang/String;)V

    invoke-interface {p0, p2}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final g(Lkm0/a;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 6

    or-int/lit8 p3, p3, 0x1

    invoke-static {p3}, Lp1/x;->L(I)I

    move-result v4

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move v5, p4

    move-object v3, p5

    invoke-static/range {v0 .. v5}, Lkm0/b;->d(Lkm0/a;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method
