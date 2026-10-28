.class public abstract Lqt2/x;
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
        "Lqt2/v;",
        "metricPlanTileItemState",
        "Lkotlin/Function1;",
        "",
        "Ll83/a0;",
        "onViewEvent",
        "f",
        "(Landroidx/compose/ui/Modifier;Lqt2/v;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V",
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

    invoke-static {p0}, Lqt2/x;->g(Ljava/lang/Object;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lkotlin/jvm/functions/Function1;Lqt2/v;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lqt2/x;->h(Lkotlin/jvm/functions/Function1;Lqt2/v;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Landroidx/compose/ui/Modifier;Lqt2/v;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p6}, Lqt2/x;->k(Landroidx/compose/ui/Modifier;Lqt2/v;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Lkotlin/jvm/functions/Function1;Lf41/a;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lqt2/x;->j(Lkotlin/jvm/functions/Function1;Lf41/a;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic e(Lqt2/v;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Lqt2/x;->i(Lqt2/v;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final f(Landroidx/compose/ui/Modifier;Lqt2/v;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V
    .locals 20
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/ui/Modifier;",
            "Lqt2/v;",
            "Lkotlin/jvm/functions/Function1;",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    move-object/from16 v4, p0

    move-object/from16 v5, p1

    move/from16 v1, p4

    const-string v0, "modifier"

    invoke-static {v4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v0, "metricPlanTileItemState"

    invoke-static {v5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v13, p3

    check-cast v13, Lp1/q;

    const v0, -0x275c658a

    invoke-virtual {v13, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, v1, 0x6

    const/4 v2, 0x4

    if-nez v0, :cond_1

    invoke-virtual {v13, v4}, Lp1/q;->g(Ljava/lang/Object;)Z

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
    and-int/lit8 v3, v1, 0x30

    if-nez v3, :cond_3

    invoke-virtual {v13, v5}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_2

    const/16 v3, 0x20

    goto :goto_2

    :cond_2
    const/16 v3, 0x10

    :goto_2
    or-int/2addr v0, v3

    :cond_3
    and-int/lit8 v3, p5, 0x4

    const/16 v6, 0x100

    if-eqz v3, :cond_5

    or-int/lit16 v0, v0, 0x180

    :cond_4
    move-object/from16 v7, p2

    goto :goto_4

    :cond_5
    and-int/lit16 v7, v1, 0x180

    if-nez v7, :cond_4

    move-object/from16 v7, p2

    invoke-virtual {v13, v7}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v8

    if-eqz v8, :cond_6

    move v8, v6

    goto :goto_3

    :cond_6
    const/16 v8, 0x80

    :goto_3
    or-int/2addr v0, v8

    :goto_4
    and-int/lit16 v8, v0, 0x93

    const/16 v9, 0x92

    const/4 v10, 0x1

    const/4 v11, 0x0

    if-eq v8, v9, :cond_7

    move v8, v10

    goto :goto_5

    :cond_7
    move v8, v11

    :goto_5
    and-int/lit8 v9, v0, 0x1

    invoke-virtual {v13, v9, v8}, Lp1/q;->U(IZ)Z

    move-result v8

    if-eqz v8, :cond_f

    sget-object v8, Lp1/l;->a:Lp1/v0;

    if-eqz v3, :cond_9

    invoke-virtual {v13}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    if-ne v3, v8, :cond_8

    new-instance v3, Lqt2/w;

    const/4 v7, 0x0

    invoke-direct {v3, v7}, Lqt2/w;-><init>(I)V

    invoke-virtual {v13, v3}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_8
    check-cast v3, Lkotlin/jvm/functions/Function1;

    goto :goto_6

    :cond_9
    move-object v3, v7

    :goto_6
    invoke-virtual {v5}, Lqt2/v;->b()Ljava/lang/Integer;

    move-result-object v7

    sget-object v14, Lb2/t;->w:Lb2/t;

    if-eqz v7, :cond_d

    const v7, -0x7948dead

    invoke-virtual {v13, v7}, Lp1/q;->e0(I)V

    and-int/lit16 v0, v0, 0x380

    if-ne v0, v6, :cond_a

    goto :goto_7

    :cond_a
    move v10, v11

    :goto_7
    invoke-virtual {v13, v5}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v0

    or-int/2addr v0, v10

    invoke-virtual {v13}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v6

    if-nez v0, :cond_b

    if-ne v6, v8, :cond_c

    :cond_b
    new-instance v6, Lqt2/e;

    const/4 v0, 0x3

    invoke-direct {v6, v0, v3, v5}, Lqt2/e;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v13, v6}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_c
    move-object/from16 v18, v6

    check-cast v18, Lc93/a;

    const/16 v19, 0xf

    const/4 v15, 0x0

    const/16 v16, 0x0

    const/16 v17, 0x0

    invoke-static/range {v14 .. v19}, Landroidx/compose/foundation/a;->g(Landroidx/compose/ui/Modifier;ZLjava/lang/String;Li3/i;Lc93/a;I)Landroidx/compose/ui/Modifier;

    move-result-object v14

    invoke-virtual {v13, v11}, Lp1/q;->q(Z)V

    goto :goto_8

    :cond_d
    const v0, -0x7946fe4c

    invoke-virtual {v13, v0}, Lp1/q;->e0(I)V

    invoke-virtual {v13, v11}, Lp1/q;->q(Z)V

    :goto_8
    invoke-virtual {v5}, Lqt2/v;->j()Lcom/whoop/design/util/TextResource;

    move-result-object v0

    sget v6, Lcom/whoop/design/util/TextResource;->$stable:I

    invoke-static {v0, v13, v6}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/whoop/design/util/a;->c(Ljava/lang/String;)Ljava/lang/String;

    move-result-object v0

    if-nez v0, :cond_e

    const-string v0, ""

    :cond_e
    invoke-interface {v4, v14}, Landroidx/compose/ui/Modifier;->e(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v6

    const/high16 v7, 0x3f800000    # 1.0f

    invoke-static {v7, v6}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v6

    const/4 v7, 0x0

    const/4 v8, 0x3

    invoke-static {v6, v7, v8}, Landroidx/compose/foundation/layout/d;->x(Landroidx/compose/ui/Modifier;Lb2/l;I)Landroidx/compose/ui/Modifier;

    move-result-object v6

    int-to-float v7, v8

    int-to-float v2, v2

    mul-float/2addr v7, v2

    invoke-static {v7}, Lt0/j;->e(F)Lt0/i;

    move-result-object v7

    sget-object v8, Lx81/d;->a:Lx81/d;

    sget v9, Lx81/d;->b:I

    invoke-virtual {v8, v13, v9}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v8

    invoke-virtual {v8}, Ly81/i;->a1()J

    move-result-wide v8

    int-to-float v10, v11

    mul-float v11, v10, v2

    new-instance v2, Ljp1/k;

    const/16 v10, 0x12

    invoke-direct {v2, v5, v0, v3, v10}, Ljp1/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    const v0, -0x56d8550d

    invoke-static {v0, v13, v2}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v12

    const/high16 v14, 0x1b0000

    const/16 v15, 0x18

    const/4 v10, 0x0

    invoke-static/range {v6 .. v15}, Le93/b;->b(Landroidx/compose/ui/Modifier;Li2/a1;JLf0/t;FLc93/m;Landroidx/compose/runtime/Composer;II)V

    move-object v6, v3

    goto :goto_9

    :cond_f
    invoke-virtual {v13}, Lp1/q;->X()V

    move-object v6, v7

    :goto_9
    invoke-virtual {v13}, Lp1/q;->u()Lp1/v1;

    move-result-object v7

    if-eqz v7, :cond_10

    new-instance v0, Lqb0/a;

    const/16 v3, 0x10

    move/from16 v2, p5

    invoke-direct/range {v0 .. v6}, Lqb0/a;-><init>(IIILjava/lang/Object;Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)V

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

.method private static final h(Lkotlin/jvm/functions/Function1;Lqt2/v;)Ll83/a0;
    .locals 1

    new-instance v0, Lnt2/a$a;

    invoke-virtual {p1}, Lqt2/v;->b()Ljava/lang/Integer;

    move-result-object p1

    invoke-virtual {p1}, Ljava/lang/Integer;->intValue()I

    move-result p1

    invoke-direct {v0, p1}, Lnt2/a$a;-><init>(I)V

    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final i(Lqt2/v;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 35

    move-object/from16 v0, p1

    and-int/lit8 v2, p4, 0x3

    const/4 v3, 0x1

    const/4 v5, 0x2

    if-eq v2, v5, :cond_0

    move v2, v3

    goto :goto_0

    :cond_0
    const/4 v2, 0x0

    :goto_0
    and-int/lit8 v6, p4, 0x1

    move-object/from16 v12, p3

    check-cast v12, Lp1/q;

    invoke-virtual {v12, v6, v2}, Lp1/q;->U(IZ)Z

    move-result v2

    sget-object v6, Ll83/a0;->a:Ll83/a0;

    if-eqz v2, :cond_14

    sget-object v2, Lb2/t;->w:Lb2/t;

    const/4 v15, 0x0

    const/4 v7, 0x3

    invoke-static {v2, v15, v7}, Landroidx/compose/foundation/layout/d;->x(Landroidx/compose/ui/Modifier;Lb2/l;I)Landroidx/compose/ui/Modifier;

    move-result-object v7

    const/16 v8, 0xf

    int-to-float v8, v8

    const/4 v9, 0x4

    int-to-float v9, v9

    mul-float/2addr v8, v9

    const/4 v10, 0x0

    invoke-static {v7, v10, v8, v3}, Landroidx/compose/foundation/layout/d;->b(Landroidx/compose/ui/Modifier;FFI)Landroidx/compose/ui/Modifier;

    move-result-object v7

    int-to-float v5, v5

    const/16 v8, 0x8

    int-to-float v8, v8

    mul-float/2addr v5, v8

    invoke-static {v5, v7}, Landroidx/compose/foundation/layout/a;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v5

    sget-object v7, Lb2/e;->K:Lb2/l;

    sget-object v10, Ll0/m;->g:Ll0/h;

    const/16 v11, 0x36

    invoke-static {v10, v7, v12, v11}, Ll0/p1;->a(Ll0/i;Lb2/g;Landroidx/compose/runtime/Composer;I)Ll0/r1;

    move-result-object v10

    iget-wide v13, v12, Lp1/q;->T:J

    invoke-static {v13, v14}, Ljava/lang/Long;->hashCode(J)I

    move-result v11

    invoke-virtual {v12}, Lp1/q;->m()Lp1/p1;

    move-result-object v13

    invoke-static {v12, v5}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v5

    sget-object v14, La3/l;->a:La3/k;

    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v14, La3/k;->b:La3/j;

    invoke-virtual {v12}, Lp1/q;->i0()V

    iget-boolean v15, v12, Lp1/q;->S:Z

    if-eqz v15, :cond_1

    invoke-virtual {v12, v14}, Lp1/q;->l(Lc93/a;)V

    goto :goto_1

    :cond_1
    invoke-virtual {v12}, Lp1/q;->s0()V

    :goto_1
    sget-object v15, La3/k;->g:La3/i;

    invoke-static {v12, v15, v10}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v10, La3/k;->f:La3/i;

    invoke-static {v12, v10, v13}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v13, La3/k;->j:La3/i;

    iget-boolean v3, v12, Lp1/q;->S:Z

    if-nez v3, :cond_2

    invoke-virtual {v12}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-static {v3, v4}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_3

    :cond_2
    invoke-static {v11, v12, v11, v13}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_3
    sget-object v3, La3/k;->d:La3/i;

    invoke-static {v12, v3, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual/range {p0 .. p0}, Lqt2/v;->f()Lgz0/m0;

    move-result-object v4

    const/16 v11, 0x12

    const/4 v5, 0x6

    if-nez v4, :cond_4

    const v4, -0x7d836daf

    invoke-virtual {v12, v4}, Lp1/q;->e0(I)V

    const/4 v4, 0x0

    invoke-virtual {v12, v4}, Lp1/q;->q(Z)V

    move-object/from16 v33, v6

    move-object v5, v7

    move/from16 v19, v8

    move/from16 v34, v9

    move-object v4, v10

    move/from16 v20, v11

    move-object v1, v13

    move-object v6, v14

    goto :goto_2

    :cond_4
    move-object/from16 v33, v6

    const v6, -0x7d836dae

    invoke-static {v12, v6, v4, v12, v5}, Lih0/d0;->s(Lp1/q;ILgz0/m0;Lp1/q;I)Lo2/e;

    move-result-object v4

    int-to-float v6, v11

    invoke-static {v6, v2}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v6

    sget-object v11, Lx81/d;->a:Lx81/d;

    sget v5, Lx81/d;->b:I

    invoke-virtual {v11, v12, v5}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v5

    invoke-virtual {v5}, Ly81/i;->b1()J

    move-result-wide v17

    move-object v5, v13

    const/16 v13, 0x1b0

    move-object v11, v14

    const/4 v14, 0x0

    move/from16 v19, v8

    const/4 v8, 0x0

    move-object v1, v5

    move-object v5, v7

    move/from16 v34, v9

    const/16 v20, 0x12

    move-object v7, v4

    move-object v9, v6

    move-object v4, v10

    move-object v6, v11

    move-wide/from16 v10, v17

    invoke-static/range {v7 .. v14}, Lg1/f3;->b(Lo2/e;Ljava/lang/String;Landroidx/compose/ui/Modifier;JLandroidx/compose/runtime/Composer;II)V

    const/16 v7, 0xa

    int-to-float v8, v7

    const/4 v7, 0x0

    invoke-static {v2, v8, v12, v7}, Lm4/a;->v(Lb2/t;FLp1/q;Z)V

    :goto_2
    const/high16 v7, 0x3f800000    # 1.0f

    float-to-double v8, v7

    const-wide/16 v10, 0x0

    cmpl-double v8, v8, v10

    if-lez v8, :cond_5

    goto :goto_3

    :cond_5
    const-string v8, "invalid weight; must be greater than zero"

    invoke-static {v8}, Lm0/a;->a(Ljava/lang/String;)V

    :goto_3
    new-instance v8, Landroidx/compose/foundation/layout/LayoutWeightElement;

    const/4 v9, 0x1

    invoke-direct {v8, v7, v9}, Landroidx/compose/foundation/layout/LayoutWeightElement;-><init>(FZ)V

    sget-object v7, Lb2/a;->c:Lb2/i;

    sget-object v9, Ll0/m;->c:Ll0/g;

    const/4 v10, 0x0

    invoke-static {v9, v7, v12, v10}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v7

    iget-wide v9, v12, Lp1/q;->T:J

    invoke-static {v9, v10}, Ljava/lang/Long;->hashCode(J)I

    move-result v9

    invoke-virtual {v12}, Lp1/q;->m()Lp1/p1;

    move-result-object v10

    invoke-static {v12, v8}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v8

    invoke-virtual {v12}, Lp1/q;->i0()V

    iget-boolean v11, v12, Lp1/q;->S:Z

    if-eqz v11, :cond_6

    invoke-virtual {v12, v6}, Lp1/q;->l(Lc93/a;)V

    goto :goto_4

    :cond_6
    invoke-virtual {v12}, Lp1/q;->s0()V

    :goto_4
    invoke-static {v12, v15, v7}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v12, v4, v10}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v7, v12, Lp1/q;->S:Z

    if-nez v7, :cond_7

    invoke-virtual {v12}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v7

    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v10

    invoke-static {v7, v10}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_8

    :cond_7
    invoke-static {v9, v12, v9, v1}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_8
    invoke-static {v12, v3, v8}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v7, Ll0/m;->a:Ll0/e;

    const/16 v8, 0x30

    invoke-static {v7, v5, v12, v8}, Ll0/p1;->a(Ll0/i;Lb2/g;Landroidx/compose/runtime/Composer;I)Ll0/r1;

    move-result-object v5

    iget-wide v7, v12, Lp1/q;->T:J

    invoke-static {v7, v8}, Ljava/lang/Long;->hashCode(J)I

    move-result v7

    invoke-virtual {v12}, Lp1/q;->m()Lp1/p1;

    move-result-object v8

    invoke-static {v12, v2}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v9

    invoke-virtual {v12}, Lp1/q;->i0()V

    iget-boolean v10, v12, Lp1/q;->S:Z

    if-eqz v10, :cond_9

    invoke-virtual {v12, v6}, Lp1/q;->l(Lc93/a;)V

    goto :goto_5

    :cond_9
    invoke-virtual {v12}, Lp1/q;->s0()V

    :goto_5
    invoke-static {v12, v15, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v12, v4, v8}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v4, v12, Lp1/q;->S:Z

    if-nez v4, :cond_a

    invoke-virtual {v12}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-static {v4, v5}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_b

    :cond_a
    invoke-static {v7, v12, v7, v1}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_b
    invoke-static {v12, v3, v9}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual/range {p0 .. p0}, Lqt2/v;->j()Lcom/whoop/design/util/TextResource;

    move-result-object v1

    sget v3, Lcom/whoop/design/util/TextResource;->$stable:I

    invoke-static {v1, v12, v3}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v7

    const-wide/high16 v4, 0x3fe0000000000000L    # 0.5

    double-to-float v1, v4

    mul-float v16, v1, v19

    const/16 v17, 0x0

    const/16 v18, 0xb

    const/4 v14, 0x0

    const/4 v15, 0x0

    move-object v13, v2

    const/4 v1, 0x0

    invoke-static/range {v13 .. v18}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v8

    sget-object v4, Lx81/d;->a:Lx81/d;

    sget v5, Lx81/d;->b:I

    invoke-virtual {v4, v12, v5}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v6

    invoke-virtual {v6}, Lb91/d;->L()Lb91/a;

    move-result-object v27

    invoke-virtual {v4, v12, v5}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v6

    invoke-virtual {v6}, Ly81/i;->y()J

    move-result-wide v9

    sget v6, Lb91/a;->d:I

    shl-int/lit8 v31, v6, 0x12

    const v32, 0x2fff8

    move-object/from16 v29, v12

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

    move-object/from16 v12, v29

    invoke-virtual/range {p0 .. p0}, Lqt2/v;->e()Lf41/a;

    move-result-object v6

    const-string v15, "MetricPlanTile_"

    if-nez v6, :cond_c

    const v6, -0x37b3d2c3

    invoke-virtual {v12, v6}, Lp1/q;->e0(I)V

    const/4 v7, 0x0

    invoke-virtual {v12, v7}, Lp1/q;->q(Z)V

    :goto_6
    const/4 v9, 0x1

    goto/16 :goto_7

    :cond_c
    const v7, -0x37b3d2c2

    invoke-virtual {v12, v7}, Lp1/q;->e0(I)V

    invoke-virtual {v4}, Lx81/d;->d()Lgz0/o0;

    move-result-object v7

    invoke-virtual {v7}, Lgz0/o0;->o()Lgz0/i0;

    move-result-object v7

    invoke-virtual {v7}, Lgz0/i0;->w()I

    move-result v18

    sget-object v17, Lny0/q$d;->f:Lny0/q$d;

    sget-object v19, Ly81/f;->RECOVERY:Ly81/f;

    new-instance v16, Lny0/o;

    const/16 v27, 0x3f8

    const/16 v28, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    invoke-direct/range {v16 .. v28}, Lny0/o;-><init>(Lny0/q;ILy81/e;Ly81/e;Ly81/e;ZZZFZILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-virtual {v6}, Lf41/a;->b()Lcom/whoop/design/util/TextResource;

    move-result-object v7

    invoke-static {v7, v12, v3}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v8

    new-instance v7, Ljava/lang/StringBuilder;

    invoke-direct {v7, v15}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v9, "_InfoButton"

    invoke-virtual {v7, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v7

    invoke-static {v2, v7}, Lgb1/d;->d(Landroidx/compose/ui/Modifier;Ljava/lang/String;)Landroidx/compose/ui/Modifier;

    move-result-object v9

    move-object/from16 v7, p2

    invoke-virtual {v12, v7}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v10

    invoke-virtual {v12, v6}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v11

    or-int/2addr v10, v11

    invoke-virtual {v12}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v11

    if-nez v10, :cond_d

    sget-object v10, Lp1/l;->a:Lp1/v0;

    if-ne v11, v10, :cond_e

    :cond_d
    new-instance v11, Lf41/g;

    const/4 v10, 0x1

    invoke-direct {v11, v7, v6, v10}, Lf41/g;-><init>(Lkotlin/jvm/functions/Function1;Lf41/a;I)V

    invoke-virtual {v12, v11}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_e
    check-cast v11, Lc93/a;

    sget v13, Lny0/o;->k:I

    const/16 v14, 0x8

    const/4 v10, 0x0

    move-object/from16 v7, v16

    invoke-static/range {v7 .. v14}, Lny0/b1;->d(Lny0/o;Ljava/lang/String;Landroidx/compose/ui/Modifier;Landroidx/compose/ui/Modifier;Lc93/a;Landroidx/compose/runtime/Composer;II)V

    const/4 v7, 0x0

    invoke-virtual {v12, v7}, Lp1/q;->q(Z)V

    goto :goto_6

    :goto_7
    invoke-virtual {v12, v9}, Lp1/q;->q(Z)V

    invoke-virtual/range {p0 .. p0}, Lqt2/v;->g()Lcom/whoop/design/util/TextResource;

    move-result-object v6

    invoke-static {v6}, Lcom/whoop/design/util/b;->d(Lcom/whoop/design/util/TextResource;)Z

    move-result v6

    if-eqz v6, :cond_f

    const v6, -0x1a1a42e

    invoke-virtual {v12, v6}, Lp1/q;->e0(I)V

    invoke-virtual/range {p0 .. p0}, Lqt2/v;->g()Lcom/whoop/design/util/TextResource;

    move-result-object v6

    invoke-static {v6, v12, v3}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v7

    new-instance v6, Ljava/lang/StringBuilder;

    invoke-direct {v6, v15}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v8, "_MetricValue"

    invoke-virtual {v6, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v6

    invoke-static {v2, v6}, Lgb1/d;->d(Landroidx/compose/ui/Modifier;Ljava/lang/String;)Landroidx/compose/ui/Modifier;

    move-result-object v8

    invoke-virtual {v4, v12, v5}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v6

    invoke-virtual {v6}, Lb91/d;->F()Lb91/a;

    move-result-object v27

    invoke-virtual/range {p0 .. p0}, Lqt2/v;->h()Ly81/f;

    move-result-object v6

    const/4 v10, 0x0

    invoke-virtual {v6, v12, v10}, Ly81/f;->toComposableColor-WaAFU9c(Landroidx/compose/runtime/Composer;I)J

    move-result-wide v13

    const/16 v30, 0x0

    const v32, 0x2fff8

    move-object/from16 v29, v12

    const-wide/16 v11, 0x0

    move-wide v9, v13

    const/4 v13, 0x0

    const/4 v14, 0x0

    move-object v6, v15

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

    invoke-static/range {v7 .. v32}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v12, v29

    const/4 v7, 0x0

    invoke-virtual {v12, v7}, Lp1/q;->q(Z)V

    :goto_8
    const/4 v9, 0x1

    goto :goto_9

    :cond_f
    move-object v6, v15

    const/4 v7, 0x0

    const v8, -0x19bdeb7

    invoke-virtual {v12, v8}, Lp1/q;->e0(I)V

    invoke-virtual {v12, v7}, Lp1/q;->q(Z)V

    goto :goto_8

    :goto_9
    invoke-virtual {v12, v9}, Lp1/q;->q(Z)V

    const/16 v8, 0xa

    int-to-float v8, v8

    invoke-static {v8, v2}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v8

    invoke-static {v12, v8}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    invoke-virtual/range {p0 .. p0}, Lqt2/v;->a()Ljava/util/List;

    move-result-object v8

    if-nez v8, :cond_10

    const v8, -0x7d622796

    invoke-virtual {v12, v8}, Lp1/q;->e0(I)V

    invoke-virtual {v12, v7}, Lp1/q;->q(Z)V

    move-object v15, v1

    goto :goto_a

    :cond_10
    const v1, -0x7d622795

    invoke-virtual {v12, v1}, Lp1/q;->e0(I)V

    invoke-virtual/range {p0 .. p0}, Lqt2/v;->a()Ljava/util/List;

    move-result-object v1

    invoke-static {v1, v12, v7}, Lqt2/p;->c(Ljava/util/List;Landroidx/compose/runtime/Composer;I)V

    const/16 v1, 0x10

    int-to-float v1, v1

    invoke-static {v2, v1, v12, v7}, Lm4/a;->v(Lb2/t;FLp1/q;Z)V

    move-object/from16 v15, v33

    :goto_a
    if-nez v15, :cond_12

    const v1, -0x7d5fe084

    invoke-virtual {v12, v1}, Lp1/q;->e0(I)V

    invoke-virtual/range {p0 .. p0}, Lqt2/v;->c()Lcom/whoop/design/util/TextResource;

    move-result-object v1

    invoke-static {v1}, Lcom/whoop/design/util/b;->d(Lcom/whoop/design/util/TextResource;)Z

    move-result v1

    if-eqz v1, :cond_11

    const v1, -0x147cbe5b

    invoke-virtual {v12, v1}, Lp1/q;->e0(I)V

    invoke-virtual/range {p0 .. p0}, Lqt2/v;->c()Lcom/whoop/design/util/TextResource;

    move-result-object v1

    invoke-static {v1, v12, v3}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v7

    new-instance v1, Ljava/lang/StringBuilder;

    invoke-direct {v1, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    const-string v0, "_Description"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    invoke-static {v2, v0}, Lgb1/d;->d(Landroidx/compose/ui/Modifier;Ljava/lang/String;)Landroidx/compose/ui/Modifier;

    move-result-object v8

    invoke-virtual {v4, v12, v5}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v0

    invoke-virtual {v0}, Lb91/d;->L()Lb91/a;

    move-result-object v27

    invoke-virtual {v4, v12, v5}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v0

    invoke-virtual {v0}, Ly81/i;->c1()J

    move-result-wide v9

    const/16 v30, 0x0

    const v32, 0x2fff8

    move-object/from16 v29, v12

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

    invoke-static/range {v7 .. v32}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v12, v29

    const/4 v7, 0x0

    invoke-virtual {v12, v7}, Lp1/q;->q(Z)V

    goto :goto_b

    :cond_11
    const/4 v7, 0x0

    const v0, -0x14777886

    invoke-virtual {v12, v0}, Lp1/q;->e0(I)V

    invoke-virtual {v12, v7}, Lp1/q;->q(Z)V

    :goto_b
    invoke-virtual {v12, v7}, Lp1/q;->q(Z)V

    goto :goto_c

    :cond_12
    const/4 v7, 0x0

    const v0, 0x2d80f415

    invoke-virtual {v12, v0}, Lp1/q;->e0(I)V

    invoke-virtual {v12, v7}, Lp1/q;->q(Z)V

    :goto_c
    invoke-virtual/range {p0 .. p0}, Lqt2/v;->i()Lgz0/m0;

    move-result-object v0

    if-nez v0, :cond_13

    const v0, -0x7d57f31c

    invoke-virtual {v12, v0}, Lp1/q;->e0(I)V

    invoke-virtual {v12, v7}, Lp1/q;->q(Z)V

    :goto_d
    const/4 v9, 0x1

    goto :goto_e

    :cond_13
    const v1, -0x7d57f31b

    invoke-virtual {v12, v1}, Lp1/q;->e0(I)V

    const/4 v1, 0x5

    int-to-float v1, v1

    mul-float v1, v1, v34

    invoke-static {v1, v2}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v9

    invoke-virtual {v0}, Lgz0/m0;->toWhoopIcon()I

    move-result v0

    const/4 v1, 0x6

    invoke-static {v0, v12, v1}, Lts/o;->S(ILandroidx/compose/runtime/Composer;I)Lo2/e;

    move-result-object v7

    invoke-virtual/range {p0 .. p0}, Lqt2/v;->j()Lcom/whoop/design/util/TextResource;

    move-result-object v0

    invoke-static {v0, v12, v3}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v0

    const-string v1, "Add "

    const-string v2, " Goal Button"

    invoke-static {v1, v0, v2}, Ldc/b;->o(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;

    move-result-object v8

    invoke-virtual {v4, v12, v5}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v0

    invoke-virtual {v0}, Ly81/i;->y()J

    move-result-wide v10

    const/16 v13, 0x180

    const/4 v14, 0x0

    invoke-static/range {v7 .. v14}, Lg1/f3;->b(Lo2/e;Ljava/lang/String;Landroidx/compose/ui/Modifier;JLandroidx/compose/runtime/Composer;II)V

    const/4 v7, 0x0

    invoke-virtual {v12, v7}, Lp1/q;->q(Z)V

    goto :goto_d

    :goto_e
    invoke-virtual {v12, v9}, Lp1/q;->q(Z)V

    return-object v33

    :cond_14
    move-object/from16 v33, v6

    invoke-virtual {v12}, Lp1/q;->X()V

    return-object v33
.end method

.method private static final j(Lkotlin/jvm/functions/Function1;Lf41/a;)Ll83/a0;
    .locals 0

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final k(Landroidx/compose/ui/Modifier;Lqt2/v;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 6

    or-int/lit8 p3, p3, 0x1

    invoke-static {p3}, Lp1/x;->L(I)I

    move-result v4

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move v5, p4

    move-object v3, p5

    invoke-static/range {v0 .. v5}, Lqt2/x;->f(Landroidx/compose/ui/Modifier;Lqt2/v;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method
