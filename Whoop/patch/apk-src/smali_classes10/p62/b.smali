.class public abstract Lp62/b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u001a+\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0007\u00a2\u0006\u0004\u0008\u0006\u0010\u0007\u00a8\u0006\u0008"
    }
    d2 = {
        "Lm62/g$a;",
        "viewState",
        "Lkotlin/Function1;",
        "Ll62/a;",
        "Ll83/a0;",
        "onNavigationEvent",
        "f",
        "(Lm62/g$a;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V",
        "refer-a-friend_release"
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
.method public static synthetic a(Lm62/g$a;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Lp62/b;->k(Lm62/g$a;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lkotlin/jvm/functions/Function1;Lm62/g$a;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lp62/b;->i(Lkotlin/jvm/functions/Function1;Lm62/g$a;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Lkotlin/jvm/functions/Function1;Lm62/g$a;)Ll83/a0;
    .locals 0

    invoke-static {p1, p0}, Lp62/b;->g(Lm62/g$a;Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Lkotlin/jvm/functions/Function1;Lm62/f;Ljava/lang/Object;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, Lp62/b;->j(Lkotlin/jvm/functions/Function1;Lm62/f;Ljava/lang/Object;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic e(Lkotlin/jvm/functions/Function1;Lm62/g$a;)Ll83/a0;
    .locals 0

    invoke-static {p1, p0}, Lp62/b;->h(Lm62/g$a;Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final f(Lm62/g$a;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V
    .locals 61
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lm62/g$a;",
            "Lkotlin/jvm/functions/Function1;",
            "Landroidx/compose/runtime/Composer;",
            "I)V"
        }
    .end annotation

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    const-string v3, "viewState"

    invoke-static {v0, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v3, "onNavigationEvent"

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v7, p2

    check-cast v7, Lp1/q;

    const v3, 0x1ac98311

    invoke-virtual {v7, v3}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v3, p3, 0x6

    if-nez v3, :cond_2

    and-int/lit8 v3, p3, 0x8

    if-nez v3, :cond_0

    invoke-virtual {v7, v0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v3

    goto :goto_0

    :cond_0
    invoke-virtual {v7, v0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v3

    :goto_0
    if-eqz v3, :cond_1

    const/4 v3, 0x4

    goto :goto_1

    :cond_1
    const/4 v3, 0x2

    :goto_1
    or-int v3, p3, v3

    goto :goto_2

    :cond_2
    move/from16 v3, p3

    :goto_2
    and-int/lit8 v4, p3, 0x30

    if-nez v4, :cond_4

    invoke-virtual {v7, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_3

    const/16 v4, 0x20

    goto :goto_3

    :cond_3
    const/16 v4, 0x10

    :goto_3
    or-int/2addr v3, v4

    :cond_4
    and-int/lit8 v4, v3, 0x13

    const/16 v11, 0x12

    const/4 v12, 0x0

    if-eq v4, v11, :cond_5

    const/4 v4, 0x1

    goto :goto_4

    :cond_5
    move v4, v12

    :goto_4
    and-int/lit8 v5, v3, 0x1

    invoke-virtual {v7, v5, v4}, Lp1/q;->U(IZ)Z

    move-result v4

    if-eqz v4, :cond_28

    const/high16 v4, 0x3f800000    # 1.0f

    sget-object v5, Lb2/t;->w:Lb2/t;

    invoke-static {v4, v5}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v6

    sget-object v8, Lb2/e;->w:Lb2/m;

    invoke-static {v8, v12}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v8

    iget-wide v10, v7, Lp1/q;->T:J

    invoke-static {v10, v11}, Ljava/lang/Long;->hashCode(J)I

    move-result v9

    invoke-virtual {v7}, Lp1/q;->m()Lp1/p1;

    move-result-object v10

    invoke-static {v7, v6}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v6

    sget-object v11, La3/l;->a:La3/k;

    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v11, La3/k;->b:La3/j;

    invoke-virtual {v7}, Lp1/q;->i0()V

    iget-boolean v12, v7, Lp1/q;->S:Z

    if-eqz v12, :cond_6

    invoke-virtual {v7, v11}, Lp1/q;->l(Lc93/a;)V

    goto :goto_5

    :cond_6
    invoke-virtual {v7}, Lp1/q;->s0()V

    :goto_5
    sget-object v12, La3/k;->g:La3/i;

    invoke-static {v7, v12, v8}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v8, La3/k;->f:La3/i;

    invoke-static {v7, v8, v10}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v10, La3/k;->j:La3/i;

    iget-boolean v13, v7, Lp1/q;->S:Z

    if-nez v13, :cond_7

    invoke-virtual {v7}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v13

    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v14

    invoke-static {v13, v14}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v13

    if-nez v13, :cond_8

    :cond_7
    invoke-static {v9, v7, v9, v10}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_8
    sget-object v14, La3/k;->d:La3/i;

    invoke-static {v7, v14, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v4, v5}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v13

    move v6, v4

    new-instance v4, Lkd1/o$a;

    invoke-virtual {v0}, Lm62/g$a;->d()Lm62/a;

    move-result-object v9

    invoke-virtual {v9}, Lm62/a;->getBackgroundImage()I

    move-result v9

    invoke-direct {v4, v9}, Lkd1/o$a;-><init>(I)V

    move-object v9, v8

    sget v8, Lkd1/o$a;->c:I

    move-object/from16 v19, v9

    const/4 v9, 0x3

    move-object/from16 v20, v5

    const/4 v5, 0x0

    move/from16 v21, v6

    const/4 v6, 0x0

    move-object/from16 v30, v19

    move-object/from16 v31, v20

    move/from16 v15, v21

    invoke-static/range {v4 .. v9}, Lkd1/p;->i(Lkd1/o;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)Ln2/a;

    move-result-object v4

    move/from16 v19, v8

    move-object v5, v12

    const/16 v12, 0x61b0

    move-object v6, v13

    const/16 v13, 0x68

    move-object v8, v5

    const/4 v5, 0x0

    move-object/from16 v26, v7

    const/4 v7, 0x0

    move-object v9, v8

    sget-object v8, Ly2/j;->g:Ly2/b1;

    move-object/from16 v20, v9

    const/4 v9, 0x0

    move-object/from16 v21, v10

    const/4 v10, 0x0

    move/from16 v32, v3

    move-object/from16 v33, v11

    move-object/from16 v34, v20

    move-object/from16 v35, v21

    move-object/from16 v11, v26

    const/4 v2, 0x1

    const/4 v3, 0x0

    const/16 v24, 0x12

    invoke-static/range {v4 .. v13}, Lpf/c;->c(Ln2/a;Ljava/lang/String;Landroidx/compose/ui/Modifier;Lb2/h;Ly2/k;FLi2/y;Landroidx/compose/runtime/Composer;II)V

    move-object v7, v11

    move-object/from16 v13, v31

    invoke-static {v15, v13}, Landroidx/compose/foundation/layout/d;->d(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    invoke-static {v3, v7, v2}, Lq83/g;->U(ILandroidx/compose/runtime/Composer;I)Lf0/r1;

    move-result-object v5

    const/16 v6, 0xe

    invoke-static {v4, v5, v6}, Lq83/g;->f0(Landroidx/compose/ui/Modifier;Lf0/r1;I)Landroidx/compose/ui/Modifier;

    move-result-object v4

    invoke-static {v4}, Ll0/f;->l(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    sget-object v5, Lb2/e;->N:Lb2/k;

    sget-object v6, Ll0/m;->c:Ll0/g;

    const/16 v8, 0x30

    invoke-static {v6, v5, v7, v8}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v6

    iget-wide v8, v7, Lp1/q;->T:J

    invoke-static {v8, v9}, Ljava/lang/Long;->hashCode(J)I

    move-result v8

    invoke-virtual {v7}, Lp1/q;->m()Lp1/p1;

    move-result-object v9

    invoke-static {v7, v4}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    invoke-virtual {v7}, Lp1/q;->i0()V

    iget-boolean v10, v7, Lp1/q;->S:Z

    if-eqz v10, :cond_9

    move-object/from16 v10, v33

    invoke-virtual {v7, v10}, Lp1/q;->l(Lc93/a;)V

    :goto_6
    move-object/from16 v11, v34

    goto :goto_7

    :cond_9
    move-object/from16 v10, v33

    invoke-virtual {v7}, Lp1/q;->s0()V

    goto :goto_6

    :goto_7
    invoke-static {v7, v11, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    move-object/from16 v6, v30

    invoke-static {v7, v6, v9}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v9, v7, Lp1/q;->S:Z

    if-nez v9, :cond_a

    invoke-virtual {v7}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v9

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v12

    invoke-static {v9, v12}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v9

    if-nez v9, :cond_b

    :cond_a
    move-object/from16 v9, v35

    goto :goto_8

    :cond_b
    move-object/from16 v9, v35

    goto :goto_9

    :goto_8
    invoke-static {v8, v7, v8, v9}, Ld;->y(ILp1/q;ILa3/i;)V

    :goto_9
    invoke-static {v7, v14, v4}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    new-instance v37, Lcom/whoop/design/atomic/organism/toolbar/d$c;

    invoke-virtual {v0}, Lm62/g$a;->d()Lm62/a;

    move-result-object v4

    invoke-virtual {v4}, Lm62/a;->getLeftIcon()Ljava/lang/Integer;

    move-result-object v41

    sget v4, Lvu1/h;->e:I

    invoke-static {v4, v7, v3}, Lcom/whoop/design/util/b;->g(ILandroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v42

    invoke-virtual {v0}, Lm62/g$a;->d()Lm62/a;

    move-result-object v4

    invoke-virtual {v4}, Lm62/a;->getRightIcon()Ljava/lang/Integer;

    move-result-object v43

    const/16 v51, 0x1fc7

    const/16 v52, 0x0

    const/16 v38, 0x0

    const/16 v39, 0x0

    const/16 v40, 0x0

    const/16 v44, 0x0

    const/16 v45, 0x0

    const/16 v46, 0x0

    const/16 v47, 0x0

    const/16 v48, 0x0

    const/16 v49, 0x0

    const/16 v50, 0x0

    invoke-direct/range {v37 .. v52}, Lcom/whoop/design/atomic/organism/toolbar/d$c;-><init>(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Lkd1/o;Ljava/lang/String;Lny0/q;Lny0/q;Ly81/f;Ly81/f;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    and-int/lit8 v4, v32, 0xe

    const/4 v8, 0x4

    if-eq v4, v8, :cond_d

    and-int/lit8 v8, v32, 0x8

    if-eqz v8, :cond_c

    invoke-virtual {v7, v0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_c

    goto :goto_a

    :cond_c
    move v12, v3

    goto :goto_b

    :cond_d
    :goto_a
    move v12, v2

    :goto_b
    and-int/lit8 v8, v32, 0x70

    const/16 v3, 0x20

    if-ne v8, v3, :cond_e

    move/from16 v16, v2

    goto :goto_c

    :cond_e
    const/16 v16, 0x0

    :goto_c
    or-int v12, v12, v16

    invoke-virtual {v7}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    sget-object v15, Lp1/l;->a:Lp1/v0;

    if-nez v12, :cond_f

    if-ne v2, v15, :cond_10

    :cond_f
    new-instance v2, Lp62/a;

    const/4 v12, 0x0

    invoke-direct {v2, v0, v1, v12}, Lp62/a;-><init>(Lm62/g$a;Lkotlin/jvm/functions/Function1;I)V

    invoke-virtual {v7, v2}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_10
    check-cast v2, Lc93/a;

    const/4 v12, 0x4

    if-eq v4, v12, :cond_12

    and-int/lit8 v16, v32, 0x8

    if-eqz v16, :cond_11

    invoke-virtual {v7, v0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v16

    if-eqz v16, :cond_11

    goto :goto_d

    :cond_11
    const/16 v16, 0x0

    goto :goto_e

    :cond_12
    :goto_d
    const/16 v16, 0x1

    :goto_e
    if-ne v8, v3, :cond_13

    const/16 v17, 0x1

    goto :goto_f

    :cond_13
    const/16 v17, 0x0

    :goto_f
    or-int v16, v16, v17

    invoke-virtual {v7}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v12

    if-nez v16, :cond_14

    if-ne v12, v15, :cond_15

    :cond_14
    new-instance v12, Lp62/a;

    const/4 v3, 0x1

    invoke-direct {v12, v0, v1, v3}, Lp62/a;-><init>(Lm62/g$a;Lkotlin/jvm/functions/Function1;I)V

    invoke-virtual {v7, v12}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_15
    check-cast v12, Lc93/a;

    sget v3, Lcom/whoop/design/atomic/organism/toolbar/d$c;->p:I

    move-object/from16 v26, v15

    const/4 v15, 0x3

    shl-int/2addr v3, v15

    move/from16 v16, v8

    move-object v8, v12

    const/16 v12, 0x25

    move/from16 v17, v4

    const/4 v4, 0x0

    move-object/from16 v18, v6

    const/4 v6, 0x0

    move-object/from16 v35, v9

    const/4 v9, 0x0

    move-object/from16 v23, v7

    move-object v7, v2

    move-object v2, v10

    move-object/from16 v10, v23

    move-object/from16 v23, v11

    move v11, v3

    move-object/from16 v3, v23

    move-object/from16 v55, v5

    move/from16 v57, v16

    move/from16 v56, v17

    move-object/from16 v53, v18

    move-object/from16 v54, v35

    move-object/from16 v5, v37

    const/16 v23, 0x4

    invoke-static/range {v4 .. v12}, Lcom/whoop/design/atomic/organism/toolbar/b;->d(Landroidx/compose/ui/Modifier;Lcom/whoop/design/atomic/organism/toolbar/d;Landroidx/compose/ui/Modifier;Lc93/a;Lc93/a;Lc93/a;Landroidx/compose/runtime/Composer;II)V

    move-object v7, v10

    const/high16 v10, 0x3f800000    # 1.0f

    float-to-double v4, v10

    const-wide/16 v33, 0x0

    cmpl-double v4, v4, v33

    const-string v35, "invalid weight; must be greater than zero"

    if-lez v4, :cond_16

    goto :goto_10

    :cond_16
    invoke-static/range {v35 .. v35}, Lm0/a;->a(Ljava/lang/String;)V

    :goto_10
    new-instance v4, Landroidx/compose/foundation/layout/LayoutWeightElement;

    const v36, 0x7f7fffff    # Float.MAX_VALUE

    cmpl-float v5, v10, v36

    if-lez v5, :cond_17

    move/from16 v5, v36

    :goto_11
    const/4 v6, 0x1

    goto :goto_12

    :cond_17
    move v5, v10

    goto :goto_11

    :goto_12
    invoke-direct {v4, v5, v6}, Landroidx/compose/foundation/layout/LayoutWeightElement;-><init>(FZ)V

    invoke-static {v7, v4}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    int-to-float v4, v15

    const/16 v11, 0x8

    int-to-float v12, v11

    mul-float/2addr v4, v12

    const/4 v5, 0x0

    const/4 v6, 0x2

    invoke-static {v13, v4, v5, v6}, Landroidx/compose/foundation/layout/a;->r(Landroidx/compose/ui/Modifier;FFI)Landroidx/compose/ui/Modifier;

    move-result-object v37

    invoke-virtual {v0}, Lm62/g$a;->d()Lm62/a;

    move-result-object v4

    invoke-virtual {v4}, Lm62/a;->getPaddingBottom-D9Ej5fM()F

    move-result v41

    const/16 v42, 0x7

    const/16 v38, 0x0

    const/16 v39, 0x0

    const/16 v40, 0x0

    invoke-static/range {v37 .. v42}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v4

    sget-object v6, Ll0/m;->e:Ll0/h;

    const/16 v8, 0x36

    move-object/from16 v9, v55

    invoke-static {v6, v9, v7, v8}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v6

    iget-wide v8, v7, Lp1/q;->T:J

    invoke-static {v8, v9}, Ljava/lang/Long;->hashCode(J)I

    move-result v8

    invoke-virtual {v7}, Lp1/q;->m()Lp1/p1;

    move-result-object v9

    invoke-static {v7, v4}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    invoke-virtual {v7}, Lp1/q;->i0()V

    iget-boolean v5, v7, Lp1/q;->S:Z

    if-eqz v5, :cond_18

    invoke-virtual {v7, v2}, Lp1/q;->l(Lc93/a;)V

    goto :goto_13

    :cond_18
    invoke-virtual {v7}, Lp1/q;->s0()V

    :goto_13
    invoke-static {v7, v3, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    move-object/from16 v6, v53

    invoke-static {v7, v6, v9}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v2, v7, Lp1/q;->S:Z

    if-nez v2, :cond_19

    invoke-virtual {v7}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_1a

    :cond_19
    move-object/from16 v9, v54

    invoke-static {v8, v7, v8, v9}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_1a
    invoke-static {v7, v14, v4}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    new-instance v4, Lkd1/o$a;

    invoke-virtual {v0}, Lm62/g$a;->a()Lgz0/m0;

    move-result-object v2

    invoke-virtual {v2}, Lgz0/m0;->toWhoopIcon()I

    move-result v2

    invoke-direct {v4, v2}, Lkd1/o$a;-><init>(I)V

    const/4 v6, 0x0

    const/4 v9, 0x3

    const/4 v5, 0x0

    move/from16 v8, v19

    const/4 v2, 0x0

    invoke-static/range {v4 .. v9}, Lkd1/p;->i(Lkd1/o;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)Ln2/a;

    move-result-object v4

    const/4 v3, 0x2

    int-to-float v5, v3

    mul-float v20, v5, v12

    const/16 v21, 0x7

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    move-object/from16 v16, v13

    invoke-static/range {v16 .. v21}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v6

    move v5, v12

    move/from16 v14, v20

    const/16 v12, 0x1b0

    const/16 v13, 0x78

    move v8, v5

    const-string v5, ""

    move-object/from16 v17, v7

    const/4 v7, 0x0

    move v9, v8

    const/4 v8, 0x0

    move/from16 v18, v9

    const/4 v9, 0x0

    move/from16 v21, v10

    const/4 v10, 0x0

    move/from16 v38, v11

    move-object/from16 v11, v17

    move/from16 v37, v18

    move/from16 v25, v21

    invoke-static/range {v4 .. v13}, Lpf/c;->c(Ln2/a;Ljava/lang/String;Landroidx/compose/ui/Modifier;Lb2/h;Ly2/k;FLi2/y;Landroidx/compose/runtime/Composer;II)V

    move-object v7, v11

    invoke-virtual {v0}, Lm62/g$a;->f()Ljava/lang/String;

    move-result-object v4

    sget-object v5, Lx81/d;->a:Lx81/d;

    sget v6, Lx81/d;->b:I

    invoke-virtual {v5, v7, v6}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v8

    invoke-virtual {v8}, Lb91/d;->O()Lb91/a;

    move-result-object v8

    invoke-virtual {v5, v7, v6}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v9

    invoke-virtual {v9}, Ly81/i;->y()J

    move-result-wide v9

    const/4 v11, 0x1

    int-to-float v12, v11

    mul-float v20, v12, v37

    const/16 v21, 0x7

    const/16 v17, 0x0

    const/16 v18, 0x0

    invoke-static/range {v16 .. v21}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v11

    move-object/from16 v39, v16

    new-instance v12, Lw3/k;

    invoke-direct {v12, v15}, Lw3/k;-><init>(I)V

    sget v13, Lb91/a;->d:I

    shl-int/lit8 v28, v13, 0x12

    const v29, 0x2fdf8

    move-object/from16 v17, v7

    move-object/from16 v24, v8

    move-wide/from16 v59, v9

    move v10, v6

    move-wide/from16 v6, v59

    const-wide/16 v8, 0x0

    move v13, v10

    const/4 v10, 0x0

    move-object/from16 v16, v5

    move-object v5, v11

    const/4 v11, 0x0

    move-object/from16 v18, v16

    move-object/from16 v16, v12

    const/4 v12, 0x0

    move/from16 v19, v13

    move/from16 v20, v14

    const-wide/16 v13, 0x0

    move/from16 v21, v15

    const/4 v15, 0x0

    move-object/from16 v22, v18

    move-object/from16 v27, v26

    move-object/from16 v26, v17

    const-wide/16 v17, 0x0

    move/from16 v40, v19

    const/16 v19, 0x0

    move/from16 v41, v20

    const/16 v20, 0x0

    move/from16 v42, v21

    const/16 v21, 0x0

    move-object/from16 v43, v22

    const/16 v22, 0x0

    move/from16 v44, v23

    const/16 v23, 0x0

    move/from16 v45, v25

    const/16 v25, 0x0

    move-object/from16 v46, v27

    const/16 v27, 0x30

    move/from16 v1, v40

    move/from16 v3, v41

    move-object/from16 v2, v43

    move/from16 v0, v44

    move-object/from16 v58, v46

    invoke-static/range {v4 .. v29}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v7, v26

    invoke-virtual/range {p0 .. p0}, Lm62/g$a;->e()Ljava/lang/String;

    move-result-object v4

    invoke-virtual {v2, v7, v1}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v5

    invoke-virtual {v5}, Lb91/d;->a()Lb91/a;

    move-result-object v24

    invoke-virtual {v2, v7, v1}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v1

    invoke-virtual {v1}, Ly81/i;->c1()J

    move-result-wide v1

    int-to-float v5, v0

    mul-float v20, v5, v37

    const/16 v21, 0x7

    const/16 v17, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    move-object/from16 v16, v39

    invoke-static/range {v16 .. v21}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v5

    new-instance v6, Lw3/k;

    const/4 v8, 0x3

    invoke-direct {v6, v8}, Lw3/k;-><init>(I)V

    const-wide/16 v8, 0x0

    const-wide/16 v17, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    move-object/from16 v59, v16

    move-object/from16 v16, v6

    move-wide v6, v1

    move-object/from16 v1, v59

    invoke-static/range {v4 .. v29}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v7, v26

    sget-object v5, Lny0/v;->TextLarge:Lny0/v;

    invoke-virtual/range {p0 .. p0}, Lm62/g$a;->b()Lm62/f;

    move-result-object v2

    invoke-virtual {v2}, Lm62/f;->b()Ljava/lang/String;

    move-result-object v6

    const/high16 v15, 0x3f800000    # 1.0f

    invoke-static {v15, v1}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    const/4 v2, 0x2

    const/4 v4, 0x0

    invoke-static {v1, v3, v4, v2}, Landroidx/compose/foundation/layout/a;->r(Landroidx/compose/ui/Modifier;FFI)Landroidx/compose/ui/Modifier;

    move-result-object v16

    const/16 v19, 0x0

    const/16 v21, 0x7

    const/16 v17, 0x0

    const/16 v18, 0x0

    move/from16 v20, v3

    invoke-static/range {v16 .. v21}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v4

    move/from16 v1, v57

    const/16 v3, 0x20

    if-ne v1, v3, :cond_1b

    const/4 v12, 0x1

    :goto_14
    move/from16 v2, v56

    goto :goto_15

    :cond_1b
    const/4 v12, 0x0

    goto :goto_14

    :goto_15
    if-eq v2, v0, :cond_1e

    and-int/lit8 v0, v32, 0x8

    if-eqz v0, :cond_1c

    move-object/from16 v0, p0

    invoke-virtual {v7, v0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_1d

    goto :goto_16

    :cond_1c
    move-object/from16 v0, p0

    :cond_1d
    const/4 v2, 0x0

    goto :goto_17

    :cond_1e
    move-object/from16 v0, p0

    :goto_16
    const/4 v2, 0x1

    :goto_17
    or-int/2addr v2, v12

    invoke-virtual {v7}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    if-nez v2, :cond_20

    move-object/from16 v2, v58

    if-ne v3, v2, :cond_1f

    goto :goto_18

    :cond_1f
    move-object/from16 v8, p1

    goto :goto_19

    :cond_20
    move-object/from16 v2, v58

    :goto_18
    new-instance v3, Lp62/a;

    move-object/from16 v8, p1

    invoke-direct {v3, v8, v0}, Lp62/a;-><init>(Lkotlin/jvm/functions/Function1;Lm62/g$a;)V

    invoke-virtual {v7, v3}, Lp1/q;->p0(Ljava/lang/Object;)V

    :goto_19
    move-object v12, v3

    check-cast v12, Lc93/a;

    const/16 v14, 0x36

    const/16 v15, 0x78

    move-object/from16 v26, v7

    const/4 v7, 0x0

    const-wide/16 v8, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    move-object/from16 v3, p1

    move-object/from16 v13, v26

    invoke-static/range {v4 .. v15}, Lny0/u;->h(Landroidx/compose/ui/Modifier;Lny0/v;Ljava/lang/String;ZJLi2/t;ZLc93/a;Landroidx/compose/runtime/Composer;II)V

    move-object v7, v13

    invoke-virtual {v0}, Lm62/g$a;->c()Lm62/f;

    move-result-object v4

    if-nez v4, :cond_21

    const v1, 0x7dc2f9fe

    invoke-virtual {v7, v1}, Lp1/q;->e0(I)V

    const/4 v1, 0x0

    invoke-virtual {v7, v1}, Lp1/q;->q(Z)V

    :goto_1a
    const/4 v2, 0x1

    goto :goto_1c

    :cond_21
    const v5, 0x7dc2f9ff

    invoke-virtual {v7, v5}, Lp1/q;->e0(I)V

    invoke-virtual {v4}, Lm62/f;->b()Ljava/lang/String;

    move-result-object v5

    invoke-static {v5}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v6

    const/16 v5, 0x20

    if-ne v1, v5, :cond_22

    const/4 v12, 0x1

    goto :goto_1b

    :cond_22
    const/4 v12, 0x0

    :goto_1b
    invoke-virtual {v7, v4}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v1

    or-int/2addr v1, v12

    invoke-virtual {v7}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    if-nez v1, :cond_23

    if-ne v5, v2, :cond_24

    :cond_23
    new-instance v5, Lnq0/m;

    const/16 v1, 0x15

    invoke-direct {v5, v1, v3, v4}, Lnq0/m;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v7, v5}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_24
    move-object/from16 v16, v5

    check-cast v16, Lkotlin/jvm/functions/Function1;

    sget v1, Lcom/whoop/design/util/TextResource;->$stable:I

    shl-int/lit8 v18, v1, 0x6

    const/16 v19, 0x0

    const/16 v20, 0xffb

    const/4 v4, 0x0

    const/4 v5, 0x0

    move-object/from16 v26, v7

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    move-object/from16 v17, v26

    invoke-static/range {v4 .. v20}, Lny0/l0;->i(Landroidx/compose/ui/Modifier;Lny0/n0;Lcom/whoop/design/util/TextResource;Ly71/g;Ly71/g;ZLy81/e;Lj91/b;ZZLjava/lang/Float;Ljava/lang/Object;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v7, v17

    const/4 v1, 0x0

    invoke-virtual {v7, v1}, Lp1/q;->q(Z)V

    goto :goto_1a

    :goto_1c
    invoke-virtual {v7, v2}, Lp1/q;->q(Z)V

    invoke-virtual {v0}, Lm62/g$a;->d()Lm62/a;

    move-result-object v1

    invoke-virtual {v1}, Lm62/a;->getAddBottomSpacer()Z

    move-result v1

    if-eqz v1, :cond_27

    const v1, 0x3acf50e5

    invoke-virtual {v7, v1}, Lp1/q;->e0(I)V

    const/high16 v15, 0x3f800000    # 1.0f

    float-to-double v1, v15

    cmpl-double v1, v1, v33

    if-lez v1, :cond_25

    goto :goto_1d

    :cond_25
    invoke-static/range {v35 .. v35}, Lm0/a;->a(Ljava/lang/String;)V

    :goto_1d
    new-instance v1, Landroidx/compose/foundation/layout/LayoutWeightElement;

    cmpl-float v2, v15, v36

    if-lez v2, :cond_26

    move/from16 v4, v36

    :goto_1e
    const/4 v2, 0x1

    goto :goto_1f

    :cond_26
    move v4, v15

    goto :goto_1e

    :goto_1f
    invoke-direct {v1, v4, v2}, Landroidx/compose/foundation/layout/LayoutWeightElement;-><init>(FZ)V

    invoke-static {v7, v1}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    const/4 v1, 0x0

    invoke-virtual {v7, v1}, Lp1/q;->q(Z)V

    goto :goto_20

    :cond_27
    const/4 v1, 0x0

    const/4 v2, 0x1

    const v4, 0x3ad05f2d

    invoke-virtual {v7, v4}, Lp1/q;->e0(I)V

    invoke-virtual {v7, v1}, Lp1/q;->q(Z)V

    :goto_20
    invoke-virtual {v7, v2}, Lp1/q;->q(Z)V

    invoke-virtual {v7, v2}, Lp1/q;->q(Z)V

    goto :goto_21

    :cond_28
    move-object v3, v1

    invoke-virtual {v7}, Lp1/q;->X()V

    :goto_21
    invoke-virtual {v7}, Lp1/q;->u()Lp1/v1;

    move-result-object v1

    if-eqz v1, :cond_29

    new-instance v2, Lof2/d;

    const/16 v4, 0xf

    move/from16 v5, p3

    invoke-direct {v2, v0, v3, v5, v4}, Lof2/d;-><init>(Ljava/lang/Object;Ljava/lang/Object;II)V

    iput-object v2, v1, Lp1/v1;->d:Lc93/m;

    :cond_29
    return-void
.end method

.method private static final g(Lm62/g$a;Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 0

    invoke-virtual {p0}, Lm62/g$a;->d()Lm62/a;

    move-result-object p0

    invoke-virtual {p0}, Lm62/a;->getLeftIcon()Ljava/lang/Integer;

    move-result-object p0

    if-eqz p0, :cond_0

    sget-object p0, Ll62/a$a;->a:Ll62/a$a;

    invoke-interface {p1, p0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final h(Lm62/g$a;Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 0

    invoke-virtual {p0}, Lm62/g$a;->d()Lm62/a;

    move-result-object p0

    invoke-virtual {p0}, Lm62/a;->getRightIcon()Ljava/lang/Integer;

    move-result-object p0

    if-eqz p0, :cond_0

    sget-object p0, Ll62/a$a;->a:Ll62/a$a;

    invoke-interface {p1, p0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final i(Lkotlin/jvm/functions/Function1;Lm62/g$a;)Ll83/a0;
    .locals 1

    new-instance v0, Ll62/a$b;

    invoke-virtual {p1}, Lm62/g$a;->b()Lm62/f;

    move-result-object p1

    invoke-virtual {p1}, Lm62/f;->a()Lcom/whoop/navigation/e;

    move-result-object p1

    invoke-direct {v0, p1}, Ll62/a$b;-><init>(Lcom/whoop/navigation/e;)V

    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final j(Lkotlin/jvm/functions/Function1;Lm62/f;Ljava/lang/Object;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance p2, Ll62/a$b;

    invoke-virtual {p1}, Lm62/f;->a()Lcom/whoop/navigation/e;

    move-result-object p1

    invoke-direct {p2, p1}, Ll62/a$b;-><init>(Lcom/whoop/navigation/e;)V

    invoke-interface {p0, p2}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final k(Lm62/g$a;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, Lp1/x;->L(I)I

    move-result p2

    invoke-static {p0, p1, p3, p2}, Lp62/b;->f(Lm62/g$a;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method
