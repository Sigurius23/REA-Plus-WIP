.class public abstract Lt51/b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u001a-\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0014\u0008\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0007\u00a2\u0006\u0004\u0008\u0006\u0010\u0007\u00a8\u0006\u0008"
    }
    d2 = {
        "Lt51/c;",
        "viewState",
        "Lkotlin/Function1;",
        "",
        "Ll83/a0;",
        "onViewEvent",
        "d",
        "(Lt51/c;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V",
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
.method public static synthetic a(Ljava/lang/Object;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lt51/b;->e(Ljava/lang/Object;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lt51/c;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p5}, Lt51/b;->g(Lt51/c;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Lt51/c;Lkotlin/jvm/functions/Function1;Ll0/v;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Lt51/b;->f(Lt51/c;Lkotlin/jvm/functions/Function1;Ll0/v;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final d(Lt51/c;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V
    .locals 9
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lt51/c;",
            "Lkotlin/jvm/functions/Function1;",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    const-string v0, "viewState"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v6, p2

    check-cast v6, Lp1/q;

    const v0, 0x654878bc

    invoke-virtual {v6, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, p3, 0x6

    if-nez v0, :cond_1

    invoke-virtual {v6, p0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    const/4 v0, 0x4

    goto :goto_0

    :cond_0
    const/4 v0, 0x2

    :goto_0
    or-int/2addr v0, p3

    goto :goto_1

    :cond_1
    move v0, p3

    :goto_1
    and-int/lit8 v2, p4, 0x2

    if-eqz v2, :cond_2

    or-int/lit8 v0, v0, 0x30

    goto :goto_3

    :cond_2
    and-int/lit8 v3, p3, 0x30

    if-nez v3, :cond_4

    invoke-virtual {v6, p1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v4

    if-eqz v4, :cond_3

    const/16 v4, 0x20

    goto :goto_2

    :cond_3
    const/16 v4, 0x10

    :goto_2
    or-int/2addr v0, v4

    :cond_4
    :goto_3
    and-int/lit8 v4, v0, 0x13

    const/16 v5, 0x12

    const/4 v7, 0x1

    if-eq v4, v5, :cond_5

    move v4, v7

    goto :goto_4

    :cond_5
    const/4 v4, 0x0

    :goto_4
    and-int/2addr v0, v7

    invoke-virtual {v6, v0, v4}, Lp1/q;->U(IZ)Z

    move-result v0

    if-eqz v0, :cond_8

    if-eqz v2, :cond_7

    invoke-virtual {v6}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v0

    sget-object v2, Lp1/l;->a:Lp1/v0;

    if-ne v0, v2, :cond_6

    new-instance v0, Lsz0/k;

    const/16 v2, 0x1c

    invoke-direct {v0, v2}, Lsz0/k;-><init>(I)V

    invoke-virtual {v6, v0}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_6
    check-cast v0, Lkotlin/jvm/functions/Function1;

    goto :goto_5

    :cond_7
    move-object v0, p1

    :goto_5
    sget-object v2, Lb2/t;->w:Lb2/t;

    const/high16 v3, 0x3f800000    # 1.0f

    invoke-static {v3, v2}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    invoke-virtual {p0}, Lt51/c;->b()Ll0/k1;

    move-result-object v3

    invoke-static {v3, v2}, Landroidx/compose/foundation/layout/a;->o(Ll0/k1;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    new-instance v3, Loq1/c;

    const/16 v4, 0x16

    invoke-direct {v3, v4, p0, v0}, Loq1/c;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    const v4, 0x539e2fa6

    invoke-static {v4, v6, v3}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v5

    const/16 v7, 0xc00

    const/4 v8, 0x6

    const/4 v3, 0x0

    const/4 v4, 0x0

    invoke-static/range {v2 .. v8}, Ll0/f;->a(Landroidx/compose/ui/Modifier;Lb2/h;ZLkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V

    move-object v3, v0

    goto :goto_6

    :cond_8
    invoke-virtual {v6}, Lp1/q;->X()V

    move-object v3, p1

    :goto_6
    invoke-virtual {v6}, Lp1/q;->u()Lp1/v1;

    move-result-object v6

    if-eqz v6, :cond_9

    new-instance v0, Lqk2/i;

    const/16 v5, 0x1c

    move-object v1, p0

    move v2, p3

    move v4, p4

    invoke-direct/range {v0 .. v5}, Lqk2/i;-><init>(Ljava/lang/Object;ILjava/lang/Object;II)V

    iput-object v0, v6, Lp1/v1;->d:Lc93/m;

    :cond_9
    return-void
.end method

.method private static final e(Ljava/lang/Object;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final f(Lt51/c;Lkotlin/jvm/functions/Function1;Ll0/v;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 16

    move-object/from16 v0, p2

    const-string v1, "$this$BoxWithConstraints"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    and-int/lit8 v1, p4, 0x6

    if-nez v1, :cond_1

    move-object/from16 v1, p3

    check-cast v1, Lp1/q;

    invoke-virtual {v1, v0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, 0x4

    goto :goto_0

    :cond_0
    const/4 v1, 0x2

    :goto_0
    or-int v1, p4, v1

    goto :goto_1

    :cond_1
    move/from16 v1, p4

    :goto_1
    and-int/lit8 v2, v1, 0x13

    const/16 v3, 0x12

    const/4 v4, 0x1

    const/4 v5, 0x0

    if-eq v2, v3, :cond_2

    move v2, v4

    goto :goto_2

    :cond_2
    move v2, v5

    :goto_2
    and-int/2addr v1, v4

    move-object/from16 v10, p3

    check-cast v10, Lp1/q;

    invoke-virtual {v10, v1, v2}, Lp1/q;->U(IZ)Z

    move-result v1

    if-eqz v1, :cond_17

    invoke-virtual/range {p0 .. p0}, Lt51/c;->f()Ljava/lang/Integer;

    move-result-object v1

    const/4 v2, 0x0

    if-eqz v1, :cond_3

    invoke-virtual {v1}, Ljava/lang/Number;->intValue()I

    move-result v3

    if-lez v3, :cond_3

    invoke-virtual/range {p0 .. p0}, Lt51/c;->e()Ljava/util/List;

    move-result-object v3

    check-cast v3, Ljava/util/Collection;

    invoke-interface {v3}, Ljava/util/Collection;->isEmpty()Z

    move-result v3

    if-nez v3, :cond_3

    goto :goto_3

    :cond_3
    move-object v1, v2

    :goto_3
    if-eqz v1, :cond_4

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v0

    goto :goto_4

    :cond_4
    invoke-virtual/range {p0 .. p0}, Lt51/c;->a()F

    move-result v2

    invoke-virtual/range {p0 .. p0}, Lt51/c;->c()F

    move-result v3

    check-cast v0, Landroidx/compose/foundation/layout/c;

    invoke-virtual {v0}, Landroidx/compose/foundation/layout/c;->d()F

    move-result v0

    add-float/2addr v0, v3

    add-float/2addr v2, v3

    div-float/2addr v0, v2

    float-to-double v2, v0

    invoke-static {v2, v3}, Ljava/lang/Math;->floor(D)D

    move-result-wide v2

    double-to-float v0, v2

    float-to-int v0, v0

    invoke-static {v4, v0}, Ljava/lang/Math;->max(II)I

    move-result v0

    :goto_4
    invoke-virtual/range {p0 .. p0}, Lt51/c;->e()Ljava/util/List;

    move-result-object v2

    check-cast v2, Ljava/lang/Iterable;

    invoke-static {v2, v0}, Lm83/s;->v0(Ljava/lang/Iterable;I)Ljava/util/ArrayList;

    move-result-object v0

    sget-object v2, Ll0/m;->a:Ll0/e;

    invoke-virtual/range {p0 .. p0}, Lt51/c;->h()F

    move-result v2

    invoke-static {v2}, Ll0/m;->i(F)Ll0/k;

    move-result-object v2

    sget-object v3, Lb2/e;->M:Lb2/k;

    invoke-static {v2, v3, v10, v5}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v2

    iget-wide v6, v10, Lp1/q;->T:J

    invoke-static {v6, v7}, Ljava/lang/Long;->hashCode(J)I

    move-result v3

    invoke-virtual {v10}, Lp1/q;->m()Lp1/p1;

    move-result-object v6

    sget-object v13, Lb2/t;->w:Lb2/t;

    invoke-static {v10, v13}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v7

    sget-object v8, La3/l;->a:La3/k;

    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v8, La3/k;->b:La3/j;

    invoke-virtual {v10}, Lp1/q;->i0()V

    iget-boolean v9, v10, Lp1/q;->S:Z

    if-eqz v9, :cond_5

    invoke-virtual {v10, v8}, Lp1/q;->l(Lc93/a;)V

    goto :goto_5

    :cond_5
    invoke-virtual {v10}, Lp1/q;->s0()V

    :goto_5
    sget-object v8, La3/k;->g:La3/i;

    invoke-static {v10, v8, v2}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v2, La3/k;->f:La3/i;

    invoke-static {v10, v2, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v2, La3/k;->j:La3/i;

    iget-boolean v6, v10, Lp1/q;->S:Z

    if-nez v6, :cond_6

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v6

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    invoke-static {v6, v8}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_7

    :cond_6
    invoke-static {v3, v10, v3, v2}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_7
    sget-object v2, La3/k;->d:La3/i;

    invoke-static {v10, v2, v7}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const v2, -0x22f32c74

    invoke-virtual {v10, v2}, Lp1/q;->e0(I)V

    invoke-virtual {v0}, Ljava/util/ArrayList;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_6
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_16

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Ljava/util/List;

    sget-object v3, Ll0/m;->a:Ll0/e;

    invoke-virtual/range {p0 .. p0}, Lt51/c;->c()F

    move-result v3

    invoke-static {v3}, Ll0/m;->i(F)Ll0/k;

    move-result-object v3

    invoke-virtual/range {p0 .. p0}, Lt51/c;->g()Lb2/g;

    move-result-object v6

    invoke-static {v3, v6, v10, v5}, Ll0/p1;->a(Ll0/i;Lb2/g;Landroidx/compose/runtime/Composer;I)Ll0/r1;

    move-result-object v3

    iget-wide v6, v10, Lp1/q;->T:J

    invoke-static {v6, v7}, Ljava/lang/Long;->hashCode(J)I

    move-result v6

    invoke-virtual {v10}, Lp1/q;->m()Lp1/p1;

    move-result-object v7

    invoke-static {v10, v13}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v8

    sget-object v9, La3/l;->a:La3/k;

    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v9, La3/k;->b:La3/j;

    invoke-virtual {v10}, Lp1/q;->i0()V

    iget-boolean v11, v10, Lp1/q;->S:Z

    if-eqz v11, :cond_8

    invoke-virtual {v10, v9}, Lp1/q;->l(Lc93/a;)V

    goto :goto_7

    :cond_8
    invoke-virtual {v10}, Lp1/q;->s0()V

    :goto_7
    sget-object v9, La3/k;->g:La3/i;

    invoke-static {v10, v9, v3}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v3, La3/k;->f:La3/i;

    invoke-static {v10, v3, v7}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v3, La3/k;->j:La3/i;

    iget-boolean v7, v10, Lp1/q;->S:Z

    if-nez v7, :cond_9

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v7

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    invoke-static {v7, v9}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_a

    :cond_9
    invoke-static {v6, v10, v6, v3}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_a
    sget-object v3, La3/k;->d:La3/i;

    invoke-static {v10, v3, v8}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const v3, 0x4b68b68

    invoke-virtual {v10, v3}, Lp1/q;->e0(I)V

    move-object v3, v2

    check-cast v3, Ljava/lang/Iterable;

    invoke-interface {v3}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v3

    :goto_8
    invoke-interface {v3}, Ljava/util/Iterator;->hasNext()Z

    move-result v6

    const v7, 0x7f7fffff    # Float.MAX_VALUE

    const-string v8, "invalid weight; must be greater than zero"

    const-wide/16 v11, 0x0

    const/high16 v9, 0x3f800000    # 1.0f

    if-eqz v6, :cond_11

    invoke-interface {v3}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v6

    check-cast v6, Lm91/o;

    if-eqz v1, :cond_d

    float-to-double v14, v9

    cmpl-double v11, v14, v11

    if-lez v11, :cond_b

    goto :goto_9

    :cond_b
    invoke-static {v8}, Lm0/a;->a(Ljava/lang/String;)V

    :goto_9
    new-instance v8, Landroidx/compose/foundation/layout/LayoutWeightElement;

    cmpl-float v11, v9, v7

    if-lez v11, :cond_c

    goto :goto_a

    :cond_c
    move v7, v9

    :goto_a
    invoke-direct {v8, v7, v4}, Landroidx/compose/foundation/layout/LayoutWeightElement;-><init>(FZ)V

    goto :goto_b

    :cond_d
    invoke-virtual/range {p0 .. p0}, Lt51/c;->a()F

    move-result v7

    invoke-static {v7, v13}, Landroidx/compose/foundation/layout/d;->u(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v8

    :goto_b
    sget-object v7, Lb2/e;->x:Lb2/m;

    invoke-static {v7, v5}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v7

    iget-wide v11, v10, Lp1/q;->T:J

    invoke-static {v11, v12}, Ljava/lang/Long;->hashCode(J)I

    move-result v9

    invoke-virtual {v10}, Lp1/q;->m()Lp1/p1;

    move-result-object v11

    invoke-static {v10, v8}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v8

    sget-object v12, La3/l;->a:La3/k;

    invoke-virtual {v12}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v12, La3/k;->b:La3/j;

    invoke-virtual {v10}, Lp1/q;->i0()V

    iget-boolean v14, v10, Lp1/q;->S:Z

    if-eqz v14, :cond_e

    invoke-virtual {v10, v12}, Lp1/q;->l(Lc93/a;)V

    goto :goto_c

    :cond_e
    invoke-virtual {v10}, Lp1/q;->s0()V

    :goto_c
    sget-object v12, La3/k;->g:La3/i;

    invoke-static {v10, v12, v7}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v7, La3/k;->f:La3/i;

    invoke-static {v10, v7, v11}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v7, La3/k;->j:La3/i;

    iget-boolean v11, v10, Lp1/q;->S:Z

    if-nez v11, :cond_f

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v11

    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v12

    invoke-static {v11, v12}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v11

    if-nez v11, :cond_10

    :cond_f
    invoke-static {v9, v10, v9, v7}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_10
    sget-object v7, La3/k;->d:La3/i;

    invoke-static {v10, v7, v8}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const/4 v11, 0x0

    const/4 v12, 0x6

    const/4 v7, 0x0

    const/4 v8, 0x0

    move-object/from16 v9, p1

    invoke-static/range {v6 .. v12}, Lm91/l;->q(Lm91/o;Lm91/p;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    invoke-virtual {v10, v4}, Lp1/q;->q(Z)V

    goto/16 :goto_8

    :cond_11
    invoke-virtual {v10, v5}, Lp1/q;->q(Z)V

    if-eqz v1, :cond_15

    const v3, -0x6ddd1333

    invoke-virtual {v10, v3}, Lp1/q;->e0(I)V

    invoke-virtual {v1}, Ljava/lang/Integer;->intValue()I

    move-result v3

    invoke-interface {v2}, Ljava/util/List;->size()I

    move-result v2

    sub-int/2addr v3, v2

    move v2, v5

    :goto_d
    if-ge v2, v3, :cond_14

    float-to-double v14, v9

    cmpl-double v6, v14, v11

    if-lez v6, :cond_12

    goto :goto_e

    :cond_12
    invoke-static {v8}, Lm0/a;->a(Ljava/lang/String;)V

    :goto_e
    new-instance v6, Landroidx/compose/foundation/layout/LayoutWeightElement;

    cmpl-float v14, v9, v7

    if-lez v14, :cond_13

    move v14, v7

    goto :goto_f

    :cond_13
    move v14, v9

    :goto_f
    invoke-direct {v6, v14, v4}, Landroidx/compose/foundation/layout/LayoutWeightElement;-><init>(FZ)V

    invoke-static {v10, v6}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    add-int/lit8 v2, v2, 0x1

    goto :goto_d

    :cond_14
    invoke-virtual {v10, v5}, Lp1/q;->q(Z)V

    goto :goto_10

    :cond_15
    const v2, -0x6ddb3a35

    invoke-virtual {v10, v2}, Lp1/q;->e0(I)V

    invoke-virtual {v10, v5}, Lp1/q;->q(Z)V

    :goto_10
    invoke-virtual {v10, v4}, Lp1/q;->q(Z)V

    goto/16 :goto_6

    :cond_16
    invoke-virtual {v10, v5}, Lp1/q;->q(Z)V

    invoke-virtual {v10, v4}, Lp1/q;->q(Z)V

    goto :goto_11

    :cond_17
    invoke-virtual {v10}, Lp1/q;->X()V

    :goto_11
    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method

.method private static final g(Lt51/c;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, Lp1/x;->L(I)I

    move-result p2

    invoke-static {p0, p1, p4, p2, p3}, Lt51/b;->d(Lt51/c;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method
