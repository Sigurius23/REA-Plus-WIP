.class public abstract Lqt2/n;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u001a5\u0010\u0008\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0014\u0008\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0007\u00a2\u0006\u0004\u0008\u0008\u0010\t\u00a8\u0006\n"
    }
    d2 = {
        "Landroidx/compose/ui/Modifier;",
        "modifier",
        "Lqt2/m;",
        "viewState",
        "Lkotlin/Function1;",
        "",
        "Ll83/a0;",
        "onViewEvent",
        "d",
        "(Landroidx/compose/ui/Modifier;Lqt2/m;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V",
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
.method public static synthetic a(Lkotlin/jvm/functions/Function1;Lqt2/m;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lqt2/n;->f(Lkotlin/jvm/functions/Function1;Lqt2/m;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Landroidx/compose/ui/Modifier;Lqt2/m;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p6}, Lqt2/n;->g(Landroidx/compose/ui/Modifier;Lqt2/m;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Ljava/lang/Object;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lqt2/n;->e(Ljava/lang/Object;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final d(Landroidx/compose/ui/Modifier;Lqt2/m;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V
    .locals 53
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/ui/Modifier;",
            "Lqt2/m;",
            "Lkotlin/jvm/functions/Function1;",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    move-object/from16 v0, p0

    move-object/from16 v6, p1

    move/from16 v7, p4

    const-string v1, "modifier"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "viewState"

    invoke-static {v6, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v13, p3

    check-cast v13, Lp1/q;

    const v1, -0x23ac3004

    invoke-virtual {v13, v1}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v1, v7, 0x6

    const/4 v2, 0x4

    if-nez v1, :cond_1

    invoke-virtual {v13, v0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    move v1, v2

    goto :goto_0

    :cond_0
    const/4 v1, 0x2

    :goto_0
    or-int/2addr v1, v7

    goto :goto_1

    :cond_1
    move v1, v7

    :goto_1
    and-int/lit8 v3, v7, 0x30

    if-nez v3, :cond_4

    and-int/lit8 v3, v7, 0x40

    if-nez v3, :cond_2

    invoke-virtual {v13, v6}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v3

    goto :goto_2

    :cond_2
    invoke-virtual {v13, v6}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v3

    :goto_2
    if-eqz v3, :cond_3

    const/16 v3, 0x20

    goto :goto_3

    :cond_3
    const/16 v3, 0x10

    :goto_3
    or-int/2addr v1, v3

    :cond_4
    and-int/lit8 v3, p5, 0x4

    if-eqz v3, :cond_6

    or-int/lit16 v1, v1, 0x180

    :cond_5
    move-object/from16 v4, p2

    :goto_4
    move v11, v1

    goto :goto_6

    :cond_6
    and-int/lit16 v4, v7, 0x180

    if-nez v4, :cond_5

    move-object/from16 v4, p2

    invoke-virtual {v13, v4}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_7

    const/16 v5, 0x100

    goto :goto_5

    :cond_7
    const/16 v5, 0x80

    :goto_5
    or-int/2addr v1, v5

    goto :goto_4

    :goto_6
    and-int/lit16 v1, v11, 0x93

    const/16 v5, 0x92

    const/4 v12, 0x1

    const/4 v14, 0x0

    if-eq v1, v5, :cond_8

    move v1, v12

    goto :goto_7

    :cond_8
    move v1, v14

    :goto_7
    and-int/lit8 v5, v11, 0x1

    invoke-virtual {v13, v5, v1}, Lp1/q;->U(IZ)Z

    move-result v1

    if-eqz v1, :cond_1f

    sget-object v15, Lp1/l;->a:Lp1/v0;

    if-eqz v3, :cond_a

    invoke-virtual {v13}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v15, :cond_9

    new-instance v1, Lqe0/b;

    const/16 v3, 0x1a

    invoke-direct {v1, v3}, Lqe0/b;-><init>(I)V

    invoke-virtual {v13, v1}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_9
    check-cast v1, Lkotlin/jvm/functions/Function1;

    goto :goto_8

    :cond_a
    move-object v1, v4

    :goto_8
    invoke-virtual {v6}, Lqt2/m;->c()Lmt2/g;

    move-result-object v3

    const/16 v34, 0x0

    if-nez v3, :cond_b

    const v3, -0x42a53f2b

    invoke-virtual {v13, v3}, Lp1/q;->e0(I)V

    invoke-virtual {v13, v14}, Lp1/q;->q(Z)V

    move-object/from16 v5, v34

    goto :goto_9

    :cond_b
    const v3, -0x42a53f2a

    invoke-virtual {v13, v3}, Lp1/q;->e0(I)V

    sget-object v3, Lx81/d;->a:Lx81/d;

    sget v4, Lx81/d;->b:I

    invoke-static {v3, v13, v4, v14}, Lr80/c;->D(Lx81/d;Lp1/q;IZ)J

    move-result-wide v3

    new-instance v5, Li2/x;

    invoke-direct {v5, v3, v4}, Li2/x;-><init>(J)V

    :goto_9
    if-nez v5, :cond_c

    const v3, 0x169fdd43

    invoke-virtual {v13, v3}, Lp1/q;->e0(I)V

    sget-object v3, Lx81/d;->a:Lx81/d;

    sget v4, Lx81/d;->b:I

    invoke-static {v3, v13, v4, v14}, Lih0/d0;->d(Lx81/d;Lp1/q;IZ)J

    move-result-wide v3

    :goto_a
    move-wide/from16 v35, v3

    goto :goto_b

    :cond_c
    const v3, 0x169fd1a3

    invoke-virtual {v13, v3}, Lp1/q;->e0(I)V

    invoke-virtual {v13, v14}, Lp1/q;->q(Z)V

    iget-wide v3, v5, Li2/x;->a:J

    goto :goto_a

    :goto_b
    invoke-virtual {v6}, Lqt2/m;->e()Lcom/whoop/design/util/TextResource;

    move-result-object v3

    sget v4, Lcom/whoop/design/util/TextResource;->$stable:I

    invoke-static {v3, v13, v4}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v3

    sget-object v5, Ljava/util/Locale;->ROOT:Ljava/util/Locale;

    invoke-virtual {v3, v5}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;

    move-result-object v3

    const-string v5, "toLowerCase(...)"

    invoke-static {v3, v5}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v5, " "

    const-string v8, "_"

    invoke-static {v3, v5, v8, v14}, Lyb3/y;->K(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)Ljava/lang/String;

    move-result-object v3

    const-string v5, "[^a-z0-9_]"

    invoke-static {v5}, Ljava/util/regex/Pattern;->compile(Ljava/lang/String;)Ljava/util/regex/Pattern;

    move-result-object v5

    const-string v8, "compile(...)"

    invoke-static {v5, v8}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {v5, v3}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;

    move-result-object v3

    const-string v8, ""

    invoke-virtual {v3, v8}, Ljava/util/regex/Matcher;->replaceAll(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v3

    const-string v5, "replaceAll(...)"

    invoke-static {v3, v5}, Lkotlin/jvm/internal/k;->i(Ljava/lang/Object;Ljava/lang/String;)V

    int-to-float v5, v12

    int-to-float v2, v2

    mul-float/2addr v5, v2

    move/from16 v16, v4

    const/4 v4, 0x0

    move-object/from16 v17, v1

    move v1, v5

    const/16 v5, 0xe

    move/from16 v18, v2

    const/4 v2, 0x0

    move-object/from16 v19, v3

    const/4 v3, 0x0

    move/from16 v12, v16

    move-object/from16 v37, v17

    move/from16 v38, v18

    move-object/from16 v14, v19

    invoke-static/range {v0 .. v5}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v2

    sget-object v0, Lb2/e;->L:Lb2/l;

    sget-object v3, Ll0/m;->a:Ll0/e;

    const/16 v4, 0x30

    invoke-static {v3, v0, v13, v4}, Ll0/p1;->a(Ll0/i;Lb2/g;Landroidx/compose/runtime/Composer;I)Ll0/r1;

    move-result-object v4

    iget-wide v9, v13, Lp1/q;->T:J

    invoke-static {v9, v10}, Ljava/lang/Long;->hashCode(J)I

    move-result v9

    invoke-virtual {v13}, Lp1/q;->m()Lp1/p1;

    move-result-object v10

    invoke-static {v13, v2}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    sget-object v19, La3/l;->a:La3/k;

    invoke-virtual/range {v19 .. v19}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v5, La3/k;->b:La3/j;

    invoke-virtual {v13}, Lp1/q;->i0()V

    iget-boolean v7, v13, Lp1/q;->S:Z

    if-eqz v7, :cond_d

    invoke-virtual {v13, v5}, Lp1/q;->l(Lc93/a;)V

    goto :goto_c

    :cond_d
    invoke-virtual {v13}, Lp1/q;->s0()V

    :goto_c
    sget-object v7, La3/k;->g:La3/i;

    invoke-static {v13, v7, v4}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v4, La3/k;->f:La3/i;

    invoke-static {v13, v4, v10}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v10, La3/k;->j:La3/i;

    move-object/from16 v19, v8

    iget-boolean v8, v13, Lp1/q;->S:Z

    if-nez v8, :cond_e

    invoke-virtual {v13}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v8

    move/from16 v20, v11

    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v11

    invoke-static {v8, v11}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_f

    goto :goto_d

    :cond_e
    move/from16 v20, v11

    :goto_d
    invoke-static {v9, v13, v9, v10}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_f
    sget-object v8, La3/k;->d:La3/i;

    invoke-static {v13, v8, v2}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    new-instance v2, Landroidx/compose/foundation/layout/VerticalAlignElement;

    invoke-direct {v2, v0}, Landroidx/compose/foundation/layout/VerticalAlignElement;-><init>(Lb2/l;)V

    const-string v9, "_title"

    invoke-virtual {v14, v9}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v9

    invoke-static {v2, v9}, Lgb1/d;->d(Landroidx/compose/ui/Modifier;Ljava/lang/String;)Landroidx/compose/ui/Modifier;

    move-result-object v9

    invoke-virtual {v6}, Lqt2/m;->e()Lcom/whoop/design/util/TextResource;

    move-result-object v2

    invoke-static {v2, v13, v12}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v2

    sget-object v11, Lx81/d;->a:Lx81/d;

    move/from16 v21, v12

    sget v12, Lx81/d;->b:I

    invoke-virtual {v11, v13, v12}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v22

    invoke-virtual/range {v22 .. v22}, Lb91/d;->P()Lb91/a;

    move-result-object v28

    invoke-virtual {v11, v13, v12}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v22

    invoke-virtual/range {v22 .. v22}, Ly81/i;->y()J

    move-result-wide v22

    sget v24, Lb91/a;->d:I

    shl-int/lit8 v32, v24, 0x12

    const v33, 0x2fff8

    move/from16 v24, v12

    move-object/from16 v30, v13

    const-wide/16 v12, 0x0

    move-object/from16 v25, v14

    const/4 v14, 0x0

    move-object/from16 v26, v15

    const/4 v15, 0x0

    const/16 v27, 0x1

    const/16 v16, 0x0

    const/16 v29, 0x100

    const/16 v31, 0x0

    const-wide/16 v17, 0x0

    move-object/from16 v39, v19

    const/16 v19, 0x0

    move/from16 v40, v20

    const/16 v20, 0x0

    move-object/from16 v41, v10

    move-object/from16 v42, v11

    move-wide/from16 v10, v22

    move/from16 v23, v21

    const-wide/16 v21, 0x0

    move/from16 v43, v23

    const/16 v23, 0x0

    move/from16 v44, v24

    const/16 v24, 0x0

    move-object/from16 v45, v25

    const/16 v25, 0x0

    move-object/from16 v46, v26

    const/16 v26, 0x0

    move/from16 v47, v27

    const/16 v27, 0x0

    move/from16 v48, v29

    const/16 v29, 0x0

    move/from16 v49, v31

    const/16 v31, 0x0

    move-object/from16 p2, v4

    move-object/from16 p3, v7

    move-object/from16 v52, v8

    move/from16 v50, v40

    move-object/from16 v51, v41

    move-object/from16 v7, v42

    move-object/from16 v4, v45

    move-object v8, v2

    move-object/from16 v41, v3

    move-object/from16 v40, v5

    move/from16 v2, v43

    move/from16 v5, v44

    const/4 v3, 0x2

    invoke-static/range {v8 .. v33}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v13, v30

    sget-object v8, Lb2/t;->w:Lb2/t;

    invoke-static {v1, v8}, Landroidx/compose/foundation/layout/d;->u(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v9

    invoke-static {v13, v9}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    new-instance v9, Landroidx/compose/foundation/layout/VerticalAlignElement;

    invoke-direct {v9, v0}, Landroidx/compose/foundation/layout/VerticalAlignElement;-><init>(Lb2/l;)V

    const-string v10, "_count"

    invoke-virtual {v4, v10}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v10

    invoke-static {v9, v10}, Lgb1/d;->d(Landroidx/compose/ui/Modifier;Ljava/lang/String;)Landroidx/compose/ui/Modifier;

    move-result-object v9

    invoke-virtual {v6}, Lqt2/m;->d()Lcom/whoop/design/util/TextResource;

    move-result-object v10

    invoke-static {v10, v13, v2}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v10

    invoke-virtual {v7, v13, v5}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v11

    invoke-virtual {v11}, Lb91/d;->P()Lb91/a;

    move-result-object v28

    invoke-virtual {v7, v13, v5}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v5

    invoke-virtual {v5}, Ly81/i;->b1()J

    move-result-wide v11

    move-object v14, v8

    move-object v8, v10

    move-wide v10, v11

    const-wide/16 v12, 0x0

    move-object v5, v14

    const/4 v14, 0x0

    invoke-static/range {v8 .. v33}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v13, v30

    const/high16 v7, 0x3f800000    # 1.0f

    float-to-double v8, v7

    const-wide/16 v10, 0x0

    cmpl-double v8, v8, v10

    if-lez v8, :cond_10

    goto :goto_e

    :cond_10
    const-string v8, "invalid weight; must be greater than zero"

    invoke-static {v8}, Lm0/a;->a(Ljava/lang/String;)V

    :goto_e
    new-instance v8, Landroidx/compose/foundation/layout/LayoutWeightElement;

    const v9, 0x7f7fffff    # Float.MAX_VALUE

    cmpl-float v10, v7, v9

    if-lez v10, :cond_11

    move v7, v9

    :cond_11
    const/4 v9, 0x1

    invoke-direct {v8, v7, v9}, Landroidx/compose/foundation/layout/LayoutWeightElement;-><init>(FZ)V

    invoke-static {v13, v8}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    int-to-float v3, v3

    const/16 v19, 0x7

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    move/from16 v18, v3

    move-object v14, v5

    invoke-static/range {v14 .. v19}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v3

    invoke-virtual {v6}, Lqt2/m;->c()Lmt2/g;

    move-result-object v5

    if-eqz v5, :cond_17

    const v5, 0x3ae3fc1e

    invoke-virtual {v13, v5}, Lp1/q;->e0(I)V

    move/from16 v5, v50

    and-int/lit16 v7, v5, 0x380

    const/16 v8, 0x100

    if-ne v7, v8, :cond_12

    const/4 v12, 0x1

    goto :goto_f

    :cond_12
    const/4 v12, 0x0

    :goto_f
    and-int/lit8 v7, v5, 0x70

    const/16 v8, 0x20

    if-eq v7, v8, :cond_14

    and-int/lit8 v5, v5, 0x40

    if-eqz v5, :cond_13

    invoke-virtual {v13, v6}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_13

    goto :goto_10

    :cond_13
    const/4 v5, 0x0

    goto :goto_11

    :cond_14
    :goto_10
    const/4 v5, 0x1

    :goto_11
    or-int/2addr v5, v12

    invoke-virtual {v13}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v7

    if-nez v5, :cond_16

    move-object/from16 v5, v46

    if-ne v7, v5, :cond_15

    goto :goto_12

    :cond_15
    move-object/from16 v8, v37

    goto :goto_13

    :cond_16
    :goto_12
    new-instance v7, Lqt2/e;

    const/4 v5, 0x1

    move-object/from16 v8, v37

    invoke-direct {v7, v5, v8, v6}, Lqt2/e;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v13, v7}, Lp1/q;->p0(Ljava/lang/Object;)V

    :goto_13
    move-object/from16 v18, v7

    check-cast v18, Lc93/a;

    const/16 v19, 0xf

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    invoke-static/range {v14 .. v19}, Landroidx/compose/foundation/a;->g(Landroidx/compose/ui/Modifier;ZLjava/lang/String;Li3/i;Lc93/a;I)Landroidx/compose/ui/Modifier;

    move-result-object v5

    move-object v7, v14

    const/4 v9, 0x0

    invoke-virtual {v13, v9}, Lp1/q;->q(Z)V

    goto :goto_14

    :cond_17
    move-object v7, v14

    move-object/from16 v8, v37

    const/4 v9, 0x0

    const v5, 0x3ae5af92

    invoke-virtual {v13, v5}, Lp1/q;->e0(I)V

    invoke-virtual {v13, v9}, Lp1/q;->q(Z)V

    move-object v5, v7

    :goto_14
    invoke-interface {v3, v5}, Landroidx/compose/ui/Modifier;->e(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    invoke-virtual {v6}, Lqt2/m;->a()Lcom/whoop/design/util/TextResource;

    move-result-object v5

    if-eqz v5, :cond_18

    const-string v5, "_edit_button"

    invoke-virtual {v4, v5}, Ljava/lang/String;->concat(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v4

    goto :goto_15

    :cond_18
    move-object/from16 v4, v34

    :goto_15
    invoke-static {v3, v4}, Lgb1/d;->d(Landroidx/compose/ui/Modifier;Ljava/lang/String;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    sget-object v4, Lb2/e;->J:Lb2/l;

    move-object/from16 v5, v41

    invoke-static {v5, v4, v13, v9}, Ll0/p1;->a(Ll0/i;Lb2/g;Landroidx/compose/runtime/Composer;I)Ll0/r1;

    move-result-object v4

    iget-wide v10, v13, Lp1/q;->T:J

    invoke-static {v10, v11}, Ljava/lang/Long;->hashCode(J)I

    move-result v5

    invoke-virtual {v13}, Lp1/q;->m()Lp1/p1;

    move-result-object v10

    invoke-static {v13, v3}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    invoke-virtual {v13}, Lp1/q;->i0()V

    iget-boolean v11, v13, Lp1/q;->S:Z

    if-eqz v11, :cond_19

    move-object/from16 v11, v40

    invoke-virtual {v13, v11}, Lp1/q;->l(Lc93/a;)V

    :goto_16
    move-object/from16 v11, p3

    goto :goto_17

    :cond_19
    invoke-virtual {v13}, Lp1/q;->s0()V

    goto :goto_16

    :goto_17
    invoke-static {v13, v11, v4}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    move-object/from16 v4, p2

    invoke-static {v13, v4, v10}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v4, v13, Lp1/q;->S:Z

    if-nez v4, :cond_1a

    invoke-virtual {v13}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    invoke-static {v4, v10}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_1b

    :cond_1a
    move-object/from16 v4, v51

    goto :goto_19

    :cond_1b
    :goto_18
    move-object/from16 v4, v52

    goto :goto_1a

    :goto_19
    invoke-static {v5, v13, v5, v4}, Ld;->y(ILp1/q;ILa3/i;)V

    goto :goto_18

    :goto_1a
    invoke-static {v13, v4, v3}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    new-instance v3, Landroidx/compose/foundation/layout/VerticalAlignElement;

    invoke-direct {v3, v0}, Landroidx/compose/foundation/layout/VerticalAlignElement;-><init>(Lb2/l;)V

    invoke-virtual {v6}, Lqt2/m;->a()Lcom/whoop/design/util/TextResource;

    move-result-object v0

    if-nez v0, :cond_1c

    const v0, 0x17be42b5

    invoke-virtual {v13, v0}, Lp1/q;->e0(I)V

    :goto_1b
    invoke-virtual {v13, v9}, Lp1/q;->q(Z)V

    goto :goto_1c

    :cond_1c
    const v4, 0x17be42b6

    invoke-virtual {v13, v4}, Lp1/q;->e0(I)V

    invoke-static {v0, v13, v2}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v34

    goto :goto_1b

    :goto_1c
    if-nez v34, :cond_1d

    move-object/from16 v34, v39

    :cond_1d
    invoke-static {}, Lb91/e;->e()Lb91/d;

    move-result-object v0

    invoke-virtual {v0}, Lb91/d;->k()Lb91/a;

    move-result-object v28

    const/16 v31, 0x0

    const v33, 0x2fff8

    move-object/from16 v30, v13

    const-wide/16 v12, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const-wide/16 v17, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const-wide/16 v21, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    const/16 v29, 0x0

    move-object/from16 v37, v8

    move v0, v9

    move-object/from16 v8, v34

    move-wide/from16 v10, v35

    move-object v9, v3

    invoke-static/range {v8 .. v33}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v13, v30

    invoke-static {v1, v7}, Landroidx/compose/foundation/layout/d;->u(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    invoke-static {v13, v1}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    invoke-virtual {v6}, Lqt2/m;->b()Lgz0/m0;

    move-result-object v1

    if-nez v1, :cond_1e

    const v1, 0x17c18188

    invoke-virtual {v13, v1}, Lp1/q;->e0(I)V

    invoke-virtual {v13, v0}, Lp1/q;->q(Z)V

    :goto_1d
    const/4 v9, 0x1

    goto :goto_1e

    :cond_1e
    const v2, 0x17c18189

    const/4 v3, 0x6

    invoke-static {v13, v2, v1, v13, v3}, Lih0/d0;->s(Lp1/q;ILgz0/m0;Lp1/q;I)Lo2/e;

    move-result-object v8

    move-object/from16 v1, v39

    invoke-static {v1, v13, v3}, Lcom/whoop/design/util/b;->i(Ljava/lang/CharSequence;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v9

    mul-float v2, v38, v38

    invoke-static {v2, v7}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    const/16 v14, 0x180

    const/4 v15, 0x0

    move-wide v11, v10

    move-object v10, v1

    invoke-static/range {v8 .. v15}, Lg1/f3;->b(Lo2/e;Ljava/lang/String;Landroidx/compose/ui/Modifier;JLandroidx/compose/runtime/Composer;II)V

    invoke-virtual {v13, v0}, Lp1/q;->q(Z)V

    goto :goto_1d

    :goto_1e
    invoke-virtual {v13, v9}, Lp1/q;->q(Z)V

    invoke-virtual {v13, v9}, Lp1/q;->q(Z)V

    move-object/from16 v4, v37

    goto :goto_1f

    :cond_1f
    invoke-virtual {v13}, Lp1/q;->X()V

    :goto_1f
    invoke-virtual {v13}, Lp1/q;->u()Lp1/v1;

    move-result-object v7

    if-eqz v7, :cond_20

    new-instance v0, Lqb0/a;

    const/16 v3, 0xd

    move/from16 v1, p4

    move/from16 v2, p5

    move-object v5, v6

    move-object v6, v4

    move-object/from16 v4, p0

    invoke-direct/range {v0 .. v6}, Lqb0/a;-><init>(IIILjava/lang/Object;Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)V

    iput-object v0, v7, Lp1/v1;->d:Lc93/m;

    :cond_20
    return-void
.end method

.method private static final e(Ljava/lang/Object;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final f(Lkotlin/jvm/functions/Function1;Lqt2/m;)Ll83/a0;
    .locals 0

    invoke-virtual {p1}, Lqt2/m;->c()Lmt2/g;

    move-result-object p1

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final g(Landroidx/compose/ui/Modifier;Lqt2/m;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 6

    or-int/lit8 p3, p3, 0x1

    invoke-static {p3}, Lp1/x;->L(I)I

    move-result v4

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move v5, p4

    move-object v3, p5

    invoke-static/range {v0 .. v5}, Lqt2/n;->d(Landroidx/compose/ui/Modifier;Lqt2/m;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method
