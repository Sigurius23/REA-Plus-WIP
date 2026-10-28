.class public abstract Lbu2/g;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000<\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0002\n\u0002\u0010\u0007\n\u0002\u0008\u0003\u001a7\u0010\u0008\u001a\u00020\u00062\u0006\u0010\u0001\u001a\u00020\u00002\u0008\u0008\u0002\u0010\u0003\u001a\u00020\u00022\u0014\u0008\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0007\u00a2\u0006\u0004\u0008\u0008\u0010\t\u001a\'\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u000b\u001a\u00020\n2\u000c\u0010\u000e\u001a\u0008\u0012\u0004\u0012\u00020\r0\u000cH\u0002\u00a2\u0006\u0004\u0008\u0010\u0010\u0011\u00a8\u0006\u0015\u00b2\u0006\u000c\u0010\u0013\u001a\u00020\u00128\nX\u008a\u0084\u0002\u00b2\u0006\u000e\u0010\u0014\u001a\u00020\u00008\n@\nX\u008a\u008e\u0002\u00b2\u0006\u000e\u0010\u0014\u001a\u00020\u00008\n@\nX\u008a\u008e\u0002"
    }
    d2 = {
        "Lbu2/d;",
        "metricSliderItemState",
        "Landroidx/compose/ui/Modifier;",
        "modifier",
        "Lkotlin/Function1;",
        "",
        "Ll83/a0;",
        "onViewEvent",
        "f",
        "(Lbu2/d;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V",
        "",
        "target",
        "",
        "Lbu2/p;",
        "rangeContent",
        "Lqt2/y;",
        "m",
        "(DLjava/util/List;)Lqt2/y;",
        "",
        "goalInfoYPercent",
        "state",
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
.method public static synthetic a(Ljava/lang/Object;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lbu2/g;->g(Ljava/lang/Object;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lbu2/d;Landroidx/compose/ui/Modifier;FLkotlin/jvm/functions/Function1;Ll0/v;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p6}, Lbu2/g;->h(Lbu2/d;Landroidx/compose/ui/Modifier;FLkotlin/jvm/functions/Function1;Ll0/v;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 0

    invoke-static {p1, p0}, Lbu2/g;->j(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Lbu2/d;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p6}, Lbu2/g;->l(Lbu2/d;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic e(Lbu2/d;Lc0/i0;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lbu2/g;->k(Lbu2/d;Lc0/i0;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final f(Lbu2/d;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V
    .locals 21
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lbu2/d;",
            "Landroidx/compose/ui/Modifier;",
            "Lkotlin/jvm/functions/Function1;",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    move-object/from16 v6, p0

    move/from16 v1, p4

    const-string v0, "metricSliderItemState"

    invoke-static {v6, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v11, p3

    check-cast v11, Lp1/q;

    const v0, -0x7f03b94b

    invoke-virtual {v11, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, v1, 0x6

    const/4 v2, 0x4

    if-nez v0, :cond_1

    invoke-virtual {v11, v6}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    move v0, v2

    goto :goto_0

    :cond_0
    const/4 v0, 0x2

    :goto_0
    or-int/2addr v0, v1

    goto :goto_1

    :cond_1
    move v0, v1

    :goto_1
    and-int/lit8 v3, p5, 0x2

    if-eqz v3, :cond_3

    or-int/lit8 v0, v0, 0x30

    :cond_2
    move-object/from16 v4, p1

    goto :goto_3

    :cond_3
    and-int/lit8 v4, v1, 0x30

    if-nez v4, :cond_2

    move-object/from16 v4, p1

    invoke-virtual {v11, v4}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_4

    const/16 v5, 0x20

    goto :goto_2

    :cond_4
    const/16 v5, 0x10

    :goto_2
    or-int/2addr v0, v5

    :goto_3
    and-int/lit8 v5, p5, 0x4

    if-eqz v5, :cond_6

    or-int/lit16 v0, v0, 0x180

    :cond_5
    move-object/from16 v7, p2

    goto :goto_5

    :cond_6
    and-int/lit16 v7, v1, 0x180

    if-nez v7, :cond_5

    move-object/from16 v7, p2

    invoke-virtual {v11, v7}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_7

    const/16 v8, 0x100

    goto :goto_4

    :cond_7
    const/16 v8, 0x80

    :goto_4
    or-int/2addr v0, v8

    :goto_5
    and-int/lit16 v8, v0, 0x93

    const/16 v9, 0x92

    const/4 v14, 0x1

    if-eq v8, v9, :cond_8

    move v8, v14

    goto :goto_6

    :cond_8
    const/4 v8, 0x0

    :goto_6
    and-int/2addr v0, v14

    invoke-virtual {v11, v0, v8}, Lp1/q;->U(IZ)Z

    move-result v0

    if-eqz v0, :cond_f

    sget-object v15, Lb2/t;->w:Lb2/t;

    if-eqz v3, :cond_9

    move-object v4, v15

    :cond_9
    if-eqz v5, :cond_b

    invoke-virtual {v11}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v0

    sget-object v3, Lp1/l;->a:Lp1/v0;

    if-ne v0, v3, :cond_a

    new-instance v0, Lbs1/n;

    const/16 v3, 0xa

    invoke-direct {v0, v3}, Lbs1/n;-><init>(I)V

    invoke-virtual {v11, v0}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_a
    check-cast v0, Lkotlin/jvm/functions/Function1;

    goto :goto_7

    :cond_b
    move-object v0, v7

    :goto_7
    const/16 v3, 0x16

    int-to-float v3, v3

    int-to-float v2, v2

    mul-float/2addr v3, v2

    sget-object v5, Lb2/e;->N:Lb2/k;

    const/4 v7, 0x7

    int-to-float v7, v7

    const/16 v8, 0x8

    int-to-float v8, v8

    mul-float v19, v7, v8

    const/16 v20, 0x7

    const/16 v16, 0x0

    const/16 v17, 0x0

    const/16 v18, 0x0

    invoke-static/range {v15 .. v20}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v7

    sget-object v8, Ll0/m;->c:Ll0/g;

    const/16 v9, 0x30

    invoke-static {v8, v5, v11, v9}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v5

    iget-wide v8, v11, Lp1/q;->T:J

    invoke-static {v8, v9}, Ljava/lang/Long;->hashCode(J)I

    move-result v8

    invoke-virtual {v11}, Lp1/q;->m()Lp1/p1;

    move-result-object v9

    invoke-static {v11, v7}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v7

    sget-object v10, La3/l;->a:La3/k;

    invoke-virtual {v10}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v10, La3/k;->b:La3/j;

    invoke-virtual {v11}, Lp1/q;->i0()V

    iget-boolean v12, v11, Lp1/q;->S:Z

    if-eqz v12, :cond_c

    invoke-virtual {v11, v10}, Lp1/q;->l(Lc93/a;)V

    goto :goto_8

    :cond_c
    invoke-virtual {v11}, Lp1/q;->s0()V

    :goto_8
    sget-object v10, La3/k;->g:La3/i;

    invoke-static {v11, v10, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v5, La3/k;->f:La3/i;

    invoke-static {v11, v5, v9}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v5, La3/k;->j:La3/i;

    iget-boolean v9, v11, Lp1/q;->S:Z

    if-nez v9, :cond_d

    invoke-virtual {v11}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v9

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    invoke-static {v9, v10}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v9

    if-nez v9, :cond_e

    :cond_d
    invoke-static {v8, v11, v8, v5}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_e
    sget-object v5, La3/k;->d:La3/i;

    invoke-static {v11, v5, v7}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const/16 v5, 0x5a

    int-to-float v5, v5

    mul-float/2addr v5, v2

    invoke-static {v5, v4}, Landroidx/compose/foundation/layout/d;->h(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    const/high16 v5, 0x3f800000    # 1.0f

    invoke-static {v5, v2}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v7

    sget-object v8, Lb2/e;->E:Lb2/m;

    new-instance v2, Lbu2/e;

    invoke-direct {v2, v6, v4, v3, v0}, Lbu2/e;-><init>(Lbu2/d;Landroidx/compose/ui/Modifier;FLkotlin/jvm/functions/Function1;)V

    const v3, -0x5acd077f

    invoke-static {v3, v11, v2}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v10

    const/16 v12, 0xc30

    const/4 v13, 0x4

    const/4 v9, 0x0

    invoke-static/range {v7 .. v13}, Ll0/f;->a(Landroidx/compose/ui/Modifier;Lb2/h;ZLkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V

    invoke-static {v6}, Lbu2/z;->j(Lbu2/d;)Z

    move-result v8

    new-instance v2, Lbu2/f;

    const/4 v3, 0x0

    invoke-direct {v2, v3, v6}, Lbu2/f;-><init>(ILm91/u;)V

    const v3, -0x3070a2fd

    invoke-static {v3, v11, v2}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v13

    const v15, 0x180006

    const/16 v16, 0x1e

    sget-object v7, Ll0/z;->a:Ll0/z;

    const/4 v9, 0x0

    const/4 v10, 0x0

    move v2, v14

    move-object v14, v11

    const/4 v11, 0x0

    const/4 v12, 0x0

    invoke-static/range {v7 .. v16}, Landroidx/compose/animation/b;->e(Ll0/y;ZLandroidx/compose/ui/Modifier;Lc0/c1;Lc0/e1;Ljava/lang/String;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V

    move-object v11, v14

    invoke-virtual {v11, v2}, Lp1/q;->q(Z)V

    move-object v5, v0

    goto :goto_9

    :cond_f
    invoke-virtual {v11}, Lp1/q;->X()V

    move-object v5, v7

    :goto_9
    invoke-virtual {v11}, Lp1/q;->u()Lp1/v1;

    move-result-object v7

    if-eqz v7, :cond_10

    new-instance v0, La01/e;

    const/16 v3, 0x16

    move/from16 v2, p5

    invoke-direct/range {v0 .. v6}, La01/e;-><init>(IIILandroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Lm91/u;)V

    iput-object v0, v7, Lp1/v1;->d:Lc93/m;

    :cond_10
    return-void
.end method

.method private static final g(Ljava/lang/Object;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final h(Lbu2/d;Landroidx/compose/ui/Modifier;FLkotlin/jvm/functions/Function1;Ll0/v;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 50

    move-object/from16 v0, p1

    move-object/from16 v6, p3

    const-string v2, "$this$BoxWithConstraints"

    move-object/from16 v3, p4

    invoke-static {v3, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    and-int/lit8 v2, p6, 0x11

    const/16 v3, 0x10

    const/4 v7, 0x1

    const/4 v8, 0x0

    if-eq v2, v3, :cond_0

    move v2, v7

    goto :goto_0

    :cond_0
    move v2, v8

    :goto_0
    and-int/lit8 v3, p6, 0x1

    move-object/from16 v12, p5

    check-cast v12, Lp1/q;

    invoke-virtual {v12, v3, v2}, Lp1/q;->U(IZ)Z

    move-result v2

    if-eqz v2, :cond_24

    const/high16 v2, 0x3f800000    # 1.0f

    sget-object v3, Lb2/t;->w:Lb2/t;

    invoke-static {v2, v3}, Landroidx/compose/foundation/layout/d;->d(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v13

    const/4 v4, 0x2

    int-to-float v5, v4

    const/16 v9, 0x8

    int-to-float v9, v9

    mul-float v15, v5, v9

    const/16 v16, 0x0

    const/16 v18, 0x5

    const/4 v14, 0x0

    move/from16 v17, v15

    invoke-static/range {v13 .. v18}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v10

    sget-object v11, Ll0/m;->a:Ll0/e;

    sget-object v13, Lb2/e;->J:Lb2/l;

    invoke-static {v11, v13, v12, v8}, Ll0/p1;->a(Ll0/i;Lb2/g;Landroidx/compose/runtime/Composer;I)Ll0/r1;

    move-result-object v11

    iget-wide v13, v12, Lp1/q;->T:J

    invoke-static {v13, v14}, Ljava/lang/Long;->hashCode(J)I

    move-result v13

    invoke-virtual {v12}, Lp1/q;->m()Lp1/p1;

    move-result-object v14

    invoke-static {v12, v10}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v10

    sget-object v15, La3/l;->a:La3/k;

    invoke-virtual {v15}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v15, La3/k;->b:La3/j;

    invoke-virtual {v12}, Lp1/q;->i0()V

    iget-boolean v4, v12, Lp1/q;->S:Z

    if-eqz v4, :cond_1

    invoke-virtual {v12, v15}, Lp1/q;->l(Lc93/a;)V

    goto :goto_1

    :cond_1
    invoke-virtual {v12}, Lp1/q;->s0()V

    :goto_1
    sget-object v4, La3/k;->g:La3/i;

    invoke-static {v12, v4, v11}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v11, La3/k;->f:La3/i;

    invoke-static {v12, v11, v14}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v14, La3/k;->j:La3/i;

    iget-boolean v8, v12, Lp1/q;->S:Z

    if-nez v8, :cond_2

    invoke-virtual {v12}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v8

    invoke-static {v13}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v2

    invoke-static {v8, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_3

    :cond_2
    invoke-static {v13, v12, v13, v14}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_3
    sget-object v2, La3/k;->d:La3/i;

    invoke-static {v12, v2, v10}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual/range {p0 .. p0}, Lbu2/d;->f()F

    move-result v8

    const v10, 0x3f70a3d7    # 0.94f

    cmpl-float v8, v8, v10

    if-lez v8, :cond_4

    goto :goto_2

    :cond_4
    invoke-virtual/range {p0 .. p0}, Lbu2/d;->f()F

    move-result v8

    const v10, 0x3da3d70a    # 0.08f

    cmpg-float v8, v8, v10

    if-gez v8, :cond_5

    goto :goto_2

    :cond_5
    invoke-virtual/range {p0 .. p0}, Lbu2/d;->f()F

    move-result v10

    :goto_2
    int-to-float v8, v7

    sub-float v10, v8, v10

    move-object v13, v14

    const/16 v14, 0xc00

    move-object/from16 v16, v15

    const/16 v15, 0x16

    move/from16 v17, v9

    move v9, v10

    const/4 v10, 0x0

    move-object/from16 v18, v11

    const-string v11, "Goal Percentage"

    move-object/from16 v31, v12

    const/4 v12, 0x0

    move-object/from16 v37, v13

    move-object/from16 v35, v16

    move-object/from16 v36, v18

    move-object/from16 v13, v31

    invoke-static/range {v9 .. v15}, Ld0/g;->b(FLd0/l;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)Lp1/t2;

    move-result-object v9

    move-object v12, v13

    const/high16 v10, 0x3f800000    # 1.0f

    float-to-double v13, v10

    const-wide/16 v38, 0x0

    cmpl-double v11, v13, v38

    const-string v40, "invalid weight; must be greater than zero"

    if-lez v11, :cond_6

    goto :goto_3

    :cond_6
    invoke-static/range {v40 .. v40}, Lm0/a;->a(Ljava/lang/String;)V

    :goto_3
    new-instance v11, Landroidx/compose/foundation/layout/LayoutWeightElement;

    const v41, 0x7f7fffff    # Float.MAX_VALUE

    cmpl-float v13, v10, v41

    if-lez v13, :cond_7

    move/from16 v10, v41

    goto :goto_4

    :cond_7
    const/high16 v10, 0x3f800000    # 1.0f

    :goto_4
    invoke-direct {v11, v10, v7}, Landroidx/compose/foundation/layout/LayoutWeightElement;-><init>(FZ)V

    invoke-interface {v0, v11}, Landroidx/compose/ui/Modifier;->e(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v10

    sget-object v11, Lb2/e;->F:Lb2/m;

    const/4 v13, 0x0

    invoke-static {v11, v13}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v11

    iget-wide v13, v12, Lp1/q;->T:J

    invoke-static {v13, v14}, Ljava/lang/Long;->hashCode(J)I

    move-result v13

    invoke-virtual {v12}, Lp1/q;->m()Lp1/p1;

    move-result-object v14

    invoke-static {v12, v10}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v10

    invoke-virtual {v12}, Lp1/q;->i0()V

    iget-boolean v15, v12, Lp1/q;->S:Z

    if-eqz v15, :cond_8

    move-object/from16 v15, v35

    invoke-virtual {v12, v15}, Lp1/q;->l(Lc93/a;)V

    goto :goto_5

    :cond_8
    move-object/from16 v15, v35

    invoke-virtual {v12}, Lp1/q;->s0()V

    :goto_5
    invoke-static {v12, v4, v11}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    move-object/from16 v11, v36

    invoke-static {v12, v11, v14}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v14, v12, Lp1/q;->S:Z

    if-nez v14, :cond_9

    invoke-virtual {v12}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v14

    invoke-static {v13}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-static {v14, v7}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_a

    :cond_9
    move-object/from16 v7, v37

    goto :goto_6

    :cond_a
    move-object/from16 v7, v37

    goto :goto_7

    :goto_6
    invoke-static {v13, v12, v13, v7}, Ld;->y(ILp1/q;ILa3/i;)V

    :goto_7
    invoke-static {v12, v2, v10}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual/range {p0 .. p0}, Lbu2/d;->q()Lcom/whoop/design/util/TextResource;

    move-result-object v19

    invoke-virtual/range {p0 .. p0}, Lbu2/d;->r()Lcom/whoop/design/util/TextResource;

    move-result-object v20

    invoke-virtual/range {p0 .. p0}, Lbu2/d;->e()Ly81/e;

    move-result-object v21

    invoke-static {}, Lb91/e;->e()Lb91/d;

    move-result-object v10

    invoke-virtual {v10}, Lb91/d;->y()Lb91/a;

    move-result-object v22

    invoke-static {}, Lb91/e;->e()Lb91/d;

    move-result-object v10

    invoke-virtual {v10}, Lb91/d;->A()Lb91/a;

    move-result-object v23

    sget-object v27, Lb2/e;->O:Lb2/k;

    invoke-virtual/range {p0 .. p0}, Lbu2/d;->p()Lcom/whoop/design/util/TextResource;

    move-result-object v24

    invoke-virtual {v12}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v10

    sget-object v13, Lp1/l;->a:Lp1/v0;

    if-ne v10, v13, :cond_b

    sget-object v10, Lbu2/g$a;->w:Lbu2/g$a;

    invoke-virtual {v12, v10}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_b
    check-cast v10, Lkotlin/jvm/functions/Function1;

    invoke-static {v10}, Ly81/g;->a(Lkotlin/jvm/functions/Function1;)Ly81/e;

    move-result-object v25

    invoke-static {}, Lb91/e;->e()Lb91/d;

    move-result-object v10

    invoke-virtual {v10}, Lb91/d;->t()Lb91/a;

    move-result-object v26

    new-instance v18, Lbu2/a;

    const/16 v29, 0x200

    const/16 v30, 0x0

    const/16 v28, 0x0

    invoke-direct/range {v18 .. v30}, Lbu2/a;-><init>(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ly81/e;Lb91/a;Lb91/a;Lcom/whoop/design/util/TextResource;Ly81/e;Lb91/a;Lb2/f;Lbu2/c;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object/from16 v10, v18

    const/high16 v14, 0x3f800000    # 1.0f

    invoke-static {v14, v0}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v18

    mul-float v21, v8, v17

    const/16 v22, 0x0

    const/16 v23, 0xb

    const/16 v19, 0x0

    const/16 v20, 0x0

    invoke-static/range {v18 .. v23}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v14

    move/from16 v36, v21

    invoke-static {v9}, Lbu2/g;->i(Lp1/t2;)F

    move-result v9

    new-instance v16, Lp91/a;

    const/16 v21, 0xd

    const/16 v22, 0x0

    const/16 v17, 0x0

    const/high16 v18, 0x3f000000    # 0.5f

    const/16 v19, 0x0

    const/16 v20, 0x0

    invoke-direct/range {v16 .. v22}, Lp91/a;-><init>(FFZZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    const/16 v17, 0x1

    const/16 v18, 0x0

    move-object/from16 v19, v14

    const/4 v14, 0x0

    move-object/from16 v42, v13

    move-object v13, v3

    move-object v3, v15

    move v15, v9

    move-object/from16 v9, v19

    invoke-static/range {v13 .. v18}, Lp91/e;->k(Landroidx/compose/ui/Modifier;FFLp91/a;ILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    move-result-object v14

    move-object v15, v13

    invoke-interface {v9, v14}, Landroidx/compose/ui/Modifier;->e(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v9

    const/4 v13, 0x0

    const/4 v14, 0x4

    move-object/from16 v18, v11

    const/4 v11, 0x0

    move-object/from16 v37, v10

    move-object v10, v9

    move-object/from16 v9, v37

    move/from16 v37, v8

    move-object/from16 v8, v18

    invoke-static/range {v9 .. v14}, Lbu2/b;->c(Lbu2/a;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    const/4 v9, 0x1

    invoke-virtual {v12, v9}, Lp1/q;->q(Z)V

    sget-object v9, Lb2/e;->N:Lb2/k;

    sget-object v10, Ll0/m;->c:Ll0/g;

    const/16 v11, 0x30

    invoke-static {v10, v9, v12, v11}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v9

    iget-wide v10, v12, Lp1/q;->T:J

    invoke-static {v10, v11}, Ljava/lang/Long;->hashCode(J)I

    move-result v10

    invoke-virtual {v12}, Lp1/q;->m()Lp1/p1;

    move-result-object v11

    invoke-static {v12, v15}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v13

    invoke-virtual {v12}, Lp1/q;->i0()V

    iget-boolean v14, v12, Lp1/q;->S:Z

    if-eqz v14, :cond_c

    invoke-virtual {v12, v3}, Lp1/q;->l(Lc93/a;)V

    goto :goto_8

    :cond_c
    invoke-virtual {v12}, Lp1/q;->s0()V

    :goto_8
    invoke-static {v12, v4, v9}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v12, v8, v11}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v9, v12, Lp1/q;->S:Z

    if-nez v9, :cond_d

    invoke-virtual {v12}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v9

    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v11

    invoke-static {v9, v11}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v9

    if-nez v9, :cond_e

    :cond_d
    invoke-static {v10, v12, v10, v7}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_e
    invoke-static {v12, v2, v13}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual/range {p0 .. p0}, Lbu2/d;->n()Lcom/whoop/design/util/TextResource;

    move-result-object v9

    if-eqz v9, :cond_f

    invoke-static {v9}, Lcom/whoop/design/util/b;->d(Lcom/whoop/design/util/TextResource;)Z

    move-result v11

    if-eqz v11, :cond_f

    goto :goto_9

    :cond_f
    const/4 v9, 0x0

    :goto_9
    const-wide/high16 v13, 0x3fd0000000000000L    # 0.25

    if-nez v9, :cond_10

    const v9, -0x46745df4

    invoke-virtual {v12, v9}, Lp1/q;->e0(I)V

    const/4 v9, 0x0

    invoke-virtual {v12, v9}, Lp1/q;->q(Z)V

    move/from16 v43, v5

    move-wide v0, v13

    const/4 v5, 0x4

    move v13, v9

    goto/16 :goto_a

    :cond_10
    const/4 v10, 0x0

    const v11, -0x46745df3

    invoke-virtual {v12, v11}, Lp1/q;->e0(I)V

    sget v11, Lcom/whoop/design/util/TextResource;->$stable:I

    invoke-static {v9, v12, v11}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v9

    invoke-virtual/range {p0 .. p0}, Lbu2/d;->e()Ly81/e;

    move-result-object v11

    invoke-interface {v11, v12, v10}, Ly81/e;->toComposableColor-WaAFU9c(Landroidx/compose/runtime/Composer;I)J

    move-result-wide v17

    invoke-static {}, Lb91/e;->e()Lb91/d;

    move-result-object v10

    invoke-virtual {v10}, Lb91/d;->E()Lb91/a;

    move-result-object v29

    sget v10, Lb91/a;->d:I

    shl-int/lit8 v33, v10, 0x12

    const v34, 0x2fffa

    const/4 v10, 0x0

    move-wide/from16 v19, v13

    const-wide/16 v13, 0x0

    move-object v11, v15

    const/4 v15, 0x0

    const/16 v21, 0x4

    const/16 v16, 0x0

    move-object/from16 v31, v12

    move-wide/from16 v48, v17

    move-object/from16 v18, v11

    move-wide/from16 v11, v48

    const/16 v17, 0x0

    move-wide/from16 v22, v19

    move-object/from16 v20, v18

    const-wide/16 v18, 0x0

    move-object/from16 v24, v20

    const/16 v20, 0x0

    move/from16 v25, v21

    const/16 v21, 0x0

    move-wide/from16 v26, v22

    const-wide/16 v22, 0x0

    move-object/from16 v28, v24

    const/16 v24, 0x0

    move/from16 v30, v25

    const/16 v25, 0x0

    move-wide/from16 v43, v26

    const/16 v26, 0x0

    const/16 v27, 0x0

    move-object/from16 v32, v28

    const/16 v28, 0x0

    move/from16 v45, v30

    const/16 v30, 0x0

    move-object/from16 v46, v32

    const/16 v32, 0x0

    move-wide/from16 v0, v43

    move-object/from16 v47, v46

    move/from16 v43, v5

    move/from16 v5, v45

    invoke-static/range {v9 .. v34}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v12, v31

    double-to-float v9, v0

    int-to-float v10, v5

    move-object/from16 v15, v47

    const/4 v13, 0x0

    invoke-static {v9, v10, v15, v12, v13}, Lr80/c;->z(FFLb2/t;Lp1/q;Z)V

    :goto_a
    const/4 v9, 0x3

    const/4 v10, 0x0

    invoke-static {v15, v10, v13, v9}, Landroidx/compose/foundation/layout/d;->y(Landroidx/compose/ui/Modifier;Lb2/m;ZI)Landroidx/compose/ui/Modifier;

    move-result-object v9

    const/high16 v14, 0x3f800000    # 1.0f

    float-to-double v10, v14

    cmpl-double v10, v10, v38

    if-lez v10, :cond_11

    :goto_b
    const/4 v10, 0x1

    goto :goto_c

    :cond_11
    invoke-static/range {v40 .. v40}, Lm0/a;->a(Ljava/lang/String;)V

    goto :goto_b

    :goto_c
    invoke-static {v9, v10, v14}, Ldc/b;->g(Landroidx/compose/ui/Modifier;ZF)Landroidx/compose/ui/Modifier;

    move-result-object v9

    sget-object v10, Lb2/e;->w:Lb2/m;

    invoke-static {v10, v13}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v11

    iget-wide v13, v12, Lp1/q;->T:J

    invoke-static {v13, v14}, Ljava/lang/Long;->hashCode(J)I

    move-result v13

    invoke-virtual {v12}, Lp1/q;->m()Lp1/p1;

    move-result-object v14

    invoke-static {v12, v9}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v9

    invoke-virtual {v12}, Lp1/q;->i0()V

    iget-boolean v5, v12, Lp1/q;->S:Z

    if-eqz v5, :cond_12

    invoke-virtual {v12, v3}, Lp1/q;->l(Lc93/a;)V

    goto :goto_d

    :cond_12
    invoke-virtual {v12}, Lp1/q;->s0()V

    :goto_d
    invoke-static {v12, v4, v11}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v12, v8, v14}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v5, v12, Lp1/q;->S:Z

    if-nez v5, :cond_13

    invoke-virtual {v12}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    invoke-static {v13}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v11

    invoke-static {v5, v11}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_14

    :cond_13
    invoke-static {v13, v12, v13, v7}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_14
    invoke-static {v12, v2, v9}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    new-instance v9, Lbu2/q;

    invoke-virtual/range {p0 .. p0}, Lbu2/d;->f()F

    move-result v17

    invoke-virtual/range {p0 .. p0}, Lbu2/d;->i()F

    move-result v18

    invoke-virtual/range {p0 .. p0}, Lbu2/d;->h()F

    move-result v19

    sget-object v5, Lx81/d;->a:Lx81/d;

    sget v11, Lx81/d;->b:I

    invoke-virtual {v5, v12, v11}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v13

    invoke-virtual {v13}, Ly81/i;->W0()J

    move-result-wide v20

    invoke-virtual/range {p0 .. p0}, Lbu2/d;->e()Ly81/e;

    move-result-object v13

    const/4 v14, 0x0

    invoke-interface {v13, v12, v14}, Ly81/e;->toComposableColor-WaAFU9c(Landroidx/compose/runtime/Composer;I)J

    move-result-wide v22

    invoke-virtual {v5, v12, v11}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v5

    invoke-virtual {v5}, Ly81/i;->q()J

    move-result-wide v24

    const/16 v26, 0x0

    move-object/from16 v16, v9

    invoke-direct/range {v16 .. v26}, Lbu2/q;-><init>(FFFJJJLkotlin/jvm/internal/DefaultConstructorMarker;)V

    move/from16 v5, p2

    invoke-static {v5, v15}, Landroidx/compose/foundation/layout/d;->u(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v11

    const/high16 v14, 0x3f800000    # 1.0f

    invoke-static {v14, v11}, Landroidx/compose/foundation/layout/d;->c(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v11

    invoke-virtual {v12, v6}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v13

    invoke-virtual {v12}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v14

    if-nez v13, :cond_15

    move-object/from16 v13, v42

    if-ne v14, v13, :cond_16

    goto :goto_e

    :cond_15
    move-object/from16 v13, v42

    :goto_e
    new-instance v14, Lbu2/w;

    const/4 v0, 0x1

    invoke-direct {v14, v6, v0}, Lbu2/w;-><init>(Lkotlin/jvm/functions/Function1;I)V

    invoke-virtual {v12, v14}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_16
    check-cast v14, Lkotlin/jvm/functions/Function1;

    move-object/from16 v42, v13

    const/16 v13, 0x30

    move-object v0, v10

    move-object v10, v11

    move-object v11, v14

    const/4 v14, 0x0

    move-object/from16 v1, v42

    invoke-static/range {v9 .. v14}, Lbu2/x;->m(Lbu2/q;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    invoke-virtual/range {p0 .. p0}, Lbu2/d;->g()Lbu2/h;

    move-result-object v9

    if-nez v9, :cond_17

    const v5, -0x778954c5

    invoke-virtual {v12, v5}, Lp1/q;->e0(I)V

    const/4 v13, 0x0

    invoke-virtual {v12, v13}, Lp1/q;->q(Z)V

    move/from16 v10, v43

    :goto_f
    const/4 v9, 0x1

    goto :goto_10

    :cond_17
    const v10, -0x778954c4

    invoke-virtual {v12, v10}, Lp1/q;->e0(I)V

    invoke-static {v5, v15}, Landroidx/compose/foundation/layout/d;->u(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v5

    move/from16 v10, v43

    invoke-static {v10, v5}, Landroidx/compose/foundation/layout/a;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v21

    invoke-virtual {v9}, Lbu2/h;->c()F

    move-result v5

    sub-float v23, v37, v5

    sget-object v5, Lp91/a;->e:Lp91/a$a;

    invoke-virtual {v5}, Lp91/a$a;->d()Lp91/a;

    move-result-object v24

    const/16 v25, 0x1

    const/16 v26, 0x0

    const/16 v22, 0x0

    invoke-static/range {v21 .. v26}, Lp91/e;->k(Landroidx/compose/ui/Modifier;FFLp91/a;ILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    move-result-object v5

    const/4 v13, 0x0

    invoke-static {v9, v5, v12, v13, v13}, Lbu2/j;->d(Lbu2/h;Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;II)V

    invoke-virtual {v12, v13}, Lp1/q;->q(Z)V

    goto :goto_f

    :goto_10
    invoke-virtual {v12, v9}, Lp1/q;->q(Z)V

    invoke-virtual/range {p0 .. p0}, Lbu2/d;->c()Lcom/whoop/design/util/TextResource;

    move-result-object v5

    if-eqz v5, :cond_18

    invoke-static {v5}, Lcom/whoop/design/util/b;->d(Lcom/whoop/design/util/TextResource;)Z

    move-result v9

    if-eqz v9, :cond_18

    goto :goto_11

    :cond_18
    const/4 v5, 0x0

    :goto_11
    if-nez v5, :cond_19

    const v5, -0x46507e34

    invoke-virtual {v12, v5}, Lp1/q;->e0(I)V

    const/4 v13, 0x0

    invoke-virtual {v12, v13}, Lp1/q;->q(Z)V

    move/from16 v43, v10

    :goto_12
    const/4 v9, 0x1

    goto :goto_13

    :cond_19
    const/4 v13, 0x0

    const v9, -0x46507e33

    invoke-virtual {v12, v9}, Lp1/q;->e0(I)V

    const-wide/high16 v13, 0x3fd0000000000000L    # 0.25

    double-to-float v9, v13

    const/4 v11, 0x4

    int-to-float v13, v11

    invoke-static {v9, v13, v15, v12}, Lih0/d0;->u(FFLb2/t;Lp1/q;)V

    sget v9, Lcom/whoop/design/util/TextResource;->$stable:I

    invoke-static {v5, v12, v9}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v9

    invoke-virtual/range {p0 .. p0}, Lbu2/d;->e()Ly81/e;

    move-result-object v5

    const/4 v13, 0x0

    invoke-interface {v5, v12, v13}, Ly81/e;->toComposableColor-WaAFU9c(Landroidx/compose/runtime/Composer;I)J

    move-result-wide v14

    invoke-static {}, Lb91/e;->e()Lb91/d;

    move-result-object v5

    invoke-virtual {v5}, Lb91/d;->E()Lb91/a;

    move-result-object v29

    sget v5, Lb91/a;->d:I

    shl-int/lit8 v33, v5, 0x12

    const v34, 0x2fffa

    move/from16 v43, v10

    const/4 v10, 0x0

    move-object/from16 v31, v12

    move-wide v11, v14

    const-wide/16 v13, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    const-wide/16 v18, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const-wide/16 v22, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    const/16 v28, 0x0

    const/16 v30, 0x0

    const/16 v32, 0x0

    invoke-static/range {v9 .. v34}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v12, v31

    const/4 v13, 0x0

    invoke-virtual {v12, v13}, Lp1/q;->q(Z)V

    goto :goto_12

    :goto_13
    invoke-virtual {v12, v9}, Lp1/q;->q(Z)V

    const/high16 v14, 0x3f800000    # 1.0f

    float-to-double v9, v14

    cmpl-double v5, v9, v38

    if-lez v5, :cond_1a

    goto :goto_14

    :cond_1a
    invoke-static/range {v40 .. v40}, Lm0/a;->a(Ljava/lang/String;)V

    :goto_14
    new-instance v5, Landroidx/compose/foundation/layout/LayoutWeightElement;

    cmpl-float v9, v14, v41

    if-lez v9, :cond_1b

    move/from16 v14, v41

    :cond_1b
    const/4 v9, 0x1

    invoke-direct {v5, v14, v9}, Landroidx/compose/foundation/layout/LayoutWeightElement;-><init>(FZ)V

    move-object/from16 v9, p1

    invoke-interface {v9, v5}, Landroidx/compose/ui/Modifier;->e(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v13

    invoke-virtual/range {p0 .. p0}, Lbu2/d;->n()Lcom/whoop/design/util/TextResource;

    move-result-object v5

    invoke-static {v5}, Lcom/whoop/design/util/b;->f(Lcom/whoop/design/util/TextResource;)Lcom/whoop/design/util/TextResource;

    move-result-object v5

    invoke-static {v5}, Lcom/whoop/design/util/b;->d(Lcom/whoop/design/util/TextResource;)Z

    move-result v5

    const/4 v10, 0x5

    if-eqz v5, :cond_1c

    int-to-float v5, v10

    const/4 v11, 0x4

    int-to-float v14, v11

    mul-float/2addr v5, v14

    move v15, v5

    goto :goto_15

    :cond_1c
    const/4 v11, 0x4

    move/from16 v15, v43

    :goto_15
    invoke-virtual/range {p0 .. p0}, Lbu2/d;->c()Lcom/whoop/design/util/TextResource;

    move-result-object v5

    invoke-static {v5}, Lcom/whoop/design/util/b;->f(Lcom/whoop/design/util/TextResource;)Lcom/whoop/design/util/TextResource;

    move-result-object v5

    invoke-static {v5}, Lcom/whoop/design/util/b;->d(Lcom/whoop/design/util/TextResource;)Z

    move-result v5

    if-eqz v5, :cond_1d

    int-to-float v5, v10

    int-to-float v10, v11

    mul-float/2addr v5, v10

    move/from16 v17, v5

    goto :goto_16

    :cond_1d
    move/from16 v17, v43

    :goto_16
    const/16 v18, 0x5

    const/4 v14, 0x0

    const/16 v16, 0x0

    invoke-static/range {v13 .. v18}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v5

    const/4 v13, 0x0

    invoke-static {v0, v13}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v0

    iget-wide v10, v12, Lp1/q;->T:J

    invoke-static {v10, v11}, Ljava/lang/Long;->hashCode(J)I

    move-result v10

    invoke-virtual {v12}, Lp1/q;->m()Lp1/p1;

    move-result-object v11

    invoke-static {v12, v5}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v5

    invoke-virtual {v12}, Lp1/q;->i0()V

    iget-boolean v13, v12, Lp1/q;->S:Z

    if-eqz v13, :cond_1e

    invoke-virtual {v12, v3}, Lp1/q;->l(Lc93/a;)V

    goto :goto_17

    :cond_1e
    invoke-virtual {v12}, Lp1/q;->s0()V

    :goto_17
    invoke-static {v12, v4, v0}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v12, v8, v11}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v0, v12, Lp1/q;->S:Z

    if-nez v0, :cond_1f

    invoke-virtual {v12}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v0

    invoke-static {v10}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-static {v0, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_20

    :cond_1f
    invoke-static {v10, v12, v10, v7}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_20
    invoke-static {v12, v2, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual/range {p0 .. p0}, Lbu2/d;->k()Lbu2/k;

    move-result-object v0

    const/4 v7, 0x0

    if-eqz v0, :cond_22

    invoke-virtual/range {p0 .. p0}, Lbu2/d;->k()Lbu2/k;

    move-result-object v0

    invoke-virtual {v0}, Lbu2/k;->a()F

    move-result v0

    cmpl-float v0, v0, v7

    if-lez v0, :cond_22

    const v0, 0x64104bda

    invoke-virtual {v12, v0}, Lp1/q;->e0(I)V

    new-instance v13, Lbu2/a;

    invoke-virtual/range {p0 .. p0}, Lbu2/d;->k()Lbu2/k;

    move-result-object v0

    invoke-virtual {v0}, Lbu2/k;->b()Lcom/whoop/design/util/TextResource;

    move-result-object v14

    invoke-virtual/range {p0 .. p0}, Lbu2/d;->e()Ly81/e;

    move-result-object v16

    invoke-static {}, Lb91/e;->e()Lb91/d;

    move-result-object v0

    invoke-virtual {v0}, Lb91/d;->E()Lb91/a;

    move-result-object v17

    sget-object v27, Lb2/e;->M:Lb2/k;

    const/16 v24, 0x2f2

    const/16 v25, 0x0

    const/4 v15, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v23, 0x0

    move-object/from16 v22, v27

    invoke-direct/range {v13 .. v25}, Lbu2/a;-><init>(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ly81/e;Lb91/a;Lb91/a;Lcom/whoop/design/util/TextResource;Ly81/e;Lb91/a;Lb2/f;Lbu2/c;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual/range {p0 .. p0}, Lbu2/d;->k()Lbu2/k;

    move-result-object v0

    invoke-virtual {v0}, Lbu2/k;->e()Lcom/whoop/design/util/TextResource;

    move-result-object v19

    invoke-virtual/range {p0 .. p0}, Lbu2/d;->e()Ly81/e;

    move-result-object v21

    invoke-static {}, Lb91/e;->e()Lb91/d;

    move-result-object v0

    invoke-virtual {v0}, Lb91/d;->E()Lb91/a;

    move-result-object v22

    invoke-virtual/range {p0 .. p0}, Lbu2/d;->k()Lbu2/k;

    move-result-object v0

    invoke-virtual {v0}, Lbu2/k;->c()Lcom/whoop/design/util/TextResource;

    move-result-object v24

    invoke-virtual {v12}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v1, :cond_21

    sget-object v0, Lbu2/g$b;->w:Lbu2/g$b;

    invoke-virtual {v12, v0}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_21
    check-cast v0, Lkotlin/jvm/functions/Function1;

    invoke-static {v0}, Ly81/g;->a(Lkotlin/jvm/functions/Function1;)Ly81/e;

    move-result-object v25

    invoke-static {}, Lb91/e;->e()Lb91/d;

    move-result-object v0

    invoke-virtual {v0}, Lb91/d;->t()Lb91/a;

    move-result-object v26

    new-instance v18, Lbu2/a;

    const/16 v29, 0x212

    const/16 v30, 0x0

    const/16 v20, 0x0

    const/16 v23, 0x0

    const/16 v28, 0x0

    invoke-direct/range {v18 .. v30}, Lbu2/a;-><init>(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;Ly81/e;Lb91/a;Lb91/a;Lcom/whoop/design/util/TextResource;Ly81/e;Lb91/a;Lb2/f;Lbu2/c;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    move-object/from16 v0, v18

    invoke-virtual/range {p0 .. p0}, Lbu2/d;->k()Lbu2/k;

    move-result-object v1

    invoke-virtual {v1}, Lbu2/k;->a()F

    move-result v1

    invoke-virtual/range {p0 .. p0}, Lbu2/d;->k()Lbu2/k;

    move-result-object v2

    invoke-virtual {v2}, Lbu2/k;->d()F

    move-result v2

    new-instance v9, Lbu2/n;

    invoke-direct {v9, v13, v0, v1, v2}, Lbu2/n;-><init>(Lbu2/a;Lbu2/a;FF)V

    const/4 v4, 0x0

    const/16 v5, 0xe

    const/4 v2, 0x0

    const/4 v3, 0x0

    move-object/from16 v0, p1

    move/from16 v1, v36

    const/4 v8, 0x2

    invoke-static/range {v0 .. v5}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v13

    invoke-virtual/range {p0 .. p0}, Lbu2/d;->k()Lbu2/k;

    move-result-object v0

    invoke-virtual {v0}, Lbu2/k;->a()F

    move-result v0

    sub-float v15, v37, v0

    sget-object v0, Lp91/a;->e:Lp91/a$a;

    invoke-virtual {v0}, Lp91/a$a;->d()Lp91/a;

    move-result-object v16

    const/16 v17, 0x1

    const/16 v18, 0x0

    const/4 v14, 0x0

    invoke-static/range {v13 .. v18}, Lp91/e;->k(Landroidx/compose/ui/Modifier;FFLp91/a;ILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    move-result-object v10

    const/4 v13, 0x0

    const/4 v14, 0x4

    const/4 v11, 0x0

    invoke-static/range {v9 .. v14}, Lbu2/m;->e(Lbu2/n;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    const/4 v13, 0x0

    invoke-virtual {v12, v13}, Lp1/q;->q(Z)V

    goto :goto_18

    :cond_22
    const/4 v8, 0x2

    const/4 v13, 0x0

    const v0, 0x642a3140

    invoke-virtual {v12, v0}, Lp1/q;->e0(I)V

    invoke-virtual {v12, v13}, Lp1/q;->q(Z)V

    :goto_18
    invoke-virtual/range {p0 .. p0}, Lbu2/d;->g()Lbu2/h;

    move-result-object v0

    if-nez v0, :cond_23

    const v0, 0x642b4bc2

    invoke-virtual {v12, v0}, Lp1/q;->e0(I)V

    invoke-virtual {v12, v13}, Lp1/q;->q(Z)V

    :goto_19
    const/4 v9, 0x1

    goto :goto_1a

    :cond_23
    const v1, 0x642b4bc3

    invoke-virtual {v12, v1}, Lp1/q;->e0(I)V

    invoke-virtual {v0}, Lbu2/h;->a()Lbu2/a;

    move-result-object v9

    invoke-virtual {v0}, Lbu2/h;->c()F

    move-result v0

    sub-float v2, v37, v0

    sget-object v0, Lp91/a;->e:Lp91/a$a;

    invoke-virtual {v0}, Lp91/a$a;->d()Lp91/a;

    move-result-object v3

    const/4 v4, 0x1

    const/4 v5, 0x0

    const/4 v1, 0x0

    move-object/from16 v0, p1

    invoke-static/range {v0 .. v5}, Lp91/e;->k(Landroidx/compose/ui/Modifier;FFLp91/a;ILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    const/16 v1, 0xc

    int-to-float v1, v1

    invoke-static {v0, v1, v7, v8}, Landroidx/compose/foundation/layout/a;->r(Landroidx/compose/ui/Modifier;FFI)Landroidx/compose/ui/Modifier;

    move-result-object v1

    const/4 v4, 0x0

    const/4 v5, 0x0

    move-object v2, v6

    move-object v0, v9

    move-object v3, v12

    invoke-static/range {v0 .. v5}, Lbu2/b;->c(Lbu2/a;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    const/4 v13, 0x0

    invoke-virtual {v12, v13}, Lp1/q;->q(Z)V

    goto :goto_19

    :goto_1a
    invoke-virtual {v12, v9}, Lp1/q;->q(Z)V

    invoke-virtual {v12, v9}, Lp1/q;->q(Z)V

    goto :goto_1b

    :cond_24
    invoke-virtual {v12}, Lp1/q;->X()V

    :goto_1b
    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method

.method private static final i(Lp1/t2;)F
    .locals 0
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lp1/t2;",
            ")F"
        }
    .end annotation

    invoke-interface {p0}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object p0

    check-cast p0, Ljava/lang/Number;

    invoke-virtual {p0}, Ljava/lang/Number;->floatValue()F

    move-result p0

    return p0
.end method

.method private static final j(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    instance-of v0, p1, Lbu2/a0$a;

    if-eqz v0, :cond_0

    new-instance v0, Lbu2/o$a;

    check-cast p1, Lbu2/a0$a;

    invoke-virtual {p1}, Lbu2/a0$a;->a()F

    move-result p1

    invoke-direct {v0, p1}, Lbu2/o$a;-><init>(F)V

    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :cond_0
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final k(Lbu2/d;Lc0/i0;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 3

    const-string p3, "$this$AnimatedVisibility"

    invoke-static {p1, p3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lbu2/d;->o()D

    move-result-wide v0

    invoke-virtual {p0}, Lbu2/d;->j()Ljava/util/List;

    move-result-object p1

    invoke-static {v0, v1, p1}, Lbu2/g;->m(DLjava/util/List;)Lqt2/y;

    move-result-object p1

    sget-object p3, Ll83/a0;->a:Ll83/a0;

    const/4 v0, 0x0

    if-nez p1, :cond_0

    move-object p1, p2

    check-cast p1, Lp1/q;

    const v1, -0x3a559c8

    invoke-virtual {p1, v1}, Lp1/q;->e0(I)V

    invoke-virtual {p1, v0}, Lp1/q;->q(Z)V

    const/4 p1, 0x0

    goto :goto_0

    :cond_0
    move-object v1, p2

    check-cast v1, Lp1/q;

    const v2, -0x3a559c7

    invoke-virtual {v1, v2}, Lp1/q;->e0(I)V

    sget v2, Lcom/whoop/design/util/TextResource;->$stable:I

    invoke-static {p1, v1, v2}, Lqt2/b0;->g(Lqt2/y;Landroidx/compose/runtime/Composer;I)V

    invoke-virtual {v1, v0}, Lp1/q;->q(Z)V

    move-object p1, p3

    :goto_0
    if-nez p1, :cond_1

    check-cast p2, Lp1/q;

    const p1, -0x3a43ac9

    invoke-virtual {p2, p1}, Lp1/q;->e0(I)V

    invoke-static {p0, p2, v0}, Lbu2/z;->c(Lbu2/d;Landroidx/compose/runtime/Composer;I)V

    invoke-virtual {p2, v0}, Lp1/q;->q(Z)V

    goto :goto_1

    :cond_1
    check-cast p2, Lp1/q;

    const p0, 0x292c2afa

    invoke-virtual {p2, p0}, Lp1/q;->e0(I)V

    invoke-virtual {p2, v0}, Lp1/q;->q(Z)V

    :goto_1
    return-object p3
.end method

.method private static final l(Lbu2/d;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 6

    or-int/lit8 p3, p3, 0x1

    invoke-static {p3}, Lp1/x;->L(I)I

    move-result v4

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move v5, p4

    move-object v3, p5

    invoke-static/range {v0 .. v5}, Lbu2/g;->f(Lbu2/d;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final m(DLjava/util/List;)Lqt2/y;
    .locals 2
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(D",
            "Ljava/util/List<",
            "Lbu2/p;",
            ">;)",
            "Lqt2/y;"
        }
    .end annotation

    check-cast p2, Ljava/lang/Iterable;

    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :cond_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lbu2/p;

    invoke-virtual {v0}, Lbu2/p;->b()Lcom/whoop/data/remote/domain/dto/DoubleRange;

    move-result-object v1

    invoke-virtual {v1, p0, p1}, Lcom/whoop/data/remote/domain/dto/DoubleRange;->isInBounds(D)Z

    move-result v1

    if-eqz v1, :cond_0

    invoke-virtual {v0}, Lbu2/p;->a()Lqt2/y;

    move-result-object p0

    return-object p0

    :cond_1
    const/4 p0, 0x0

    return-object p0
.end method
