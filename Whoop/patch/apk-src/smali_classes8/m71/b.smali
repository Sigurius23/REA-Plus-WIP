.class public abstract Lm71/b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0016\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u001a-\u0010\u0006\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0014\u0008\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0002H\u0007\u00a2\u0006\u0004\u0008\u0006\u0010\u0007\u00a8\u0006\u0008"
    }
    d2 = {
        "Lm71/d;",
        "viewState",
        "Lkotlin/Function1;",
        "",
        "Ll83/a0;",
        "onViewEvent",
        "f",
        "(Lm71/d;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V",
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
.method public static synthetic a(Lm71/d;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p5}, Lm71/b;->k(Lm71/d;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;
    .locals 0

    invoke-static {p0}, Lm71/b;->i(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Ljava/lang/Object;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lm71/b;->g(Ljava/lang/Object;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(ZLm71/d;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Lm71/b;->h(ZLm71/d;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic e(Lhy0/h0;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/Modifier;
    .locals 0

    invoke-static {p0, p1, p2}, Lm71/b;->j(Lhy0/h0;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/Modifier;

    move-result-object p0

    return-object p0
.end method

.method public static final f(Lm71/d;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V
    .locals 11
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lm71/d;",
            "Lkotlin/jvm/functions/Function1;",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    const-string v0, "viewState"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v8, p2

    check-cast v8, Lp1/q;

    const p2, -0x7aaa02db

    invoke-virtual {v8, p2}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 p2, p3, 0x6

    if-nez p2, :cond_1

    invoke-virtual {v8, p0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result p2

    if-eqz p2, :cond_0

    const/4 p2, 0x4

    goto :goto_0

    :cond_0
    const/4 p2, 0x2

    :goto_0
    or-int/2addr p2, p3

    goto :goto_1

    :cond_1
    move p2, p3

    :goto_1
    and-int/lit8 v0, p4, 0x2

    if-eqz v0, :cond_2

    or-int/lit8 p2, p2, 0x30

    goto :goto_3

    :cond_2
    and-int/lit8 v1, p3, 0x30

    if-nez v1, :cond_4

    invoke-virtual {v8, p1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_3

    const/16 v1, 0x20

    goto :goto_2

    :cond_3
    const/16 v1, 0x10

    :goto_2
    or-int/2addr p2, v1

    :cond_4
    :goto_3
    and-int/lit8 v1, p2, 0x13

    const/16 v2, 0x12

    const/4 v3, 0x1

    const/4 v4, 0x0

    if-eq v1, v2, :cond_5

    move v1, v3

    goto :goto_4

    :cond_5
    move v1, v4

    :goto_4
    and-int/2addr p2, v3

    invoke-virtual {v8, p2, v1}, Lp1/q;->U(IZ)Z

    move-result p2

    if-eqz p2, :cond_b

    if-eqz v0, :cond_7

    invoke-virtual {v8}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object p1

    sget-object p2, Lp1/l;->a:Lp1/v0;

    if-ne p1, p2, :cond_6

    new-instance p1, Lm01/c;

    const/16 p2, 0x8

    invoke-direct {p1, p2}, Lm01/c;-><init>(I)V

    invoke-virtual {v8, p1}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_6
    check-cast p1, Lkotlin/jvm/functions/Function1;

    :cond_7
    invoke-virtual {p0}, Lm71/d;->b()Lm71/c;

    move-result-object p2

    sget-object v0, Lm71/c;->OUTLINED:Lm71/c;

    if-ne p2, v0, :cond_8

    move p2, v3

    goto :goto_5

    :cond_8
    move p2, v4

    :goto_5
    sget-object v0, Lkd1/w;->a:Lkd1/w;

    invoke-virtual {v0}, Lkd1/w;->a()Lk91/a;

    move-result-object v0

    invoke-virtual {v0}, Lk91/a;->c()Lt0/i;

    move-result-object v2

    const/4 v0, 0x6

    if-eqz p2, :cond_9

    const v1, -0x78348150

    invoke-virtual {v8, v1}, Lp1/q;->e0(I)V

    sget-object v1, Lx81/d;->a:Lx81/d;

    invoke-virtual {v1, v8, v0}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v1

    invoke-virtual {v1}, Ly81/i;->V0()J

    move-result-wide v5

    :goto_6
    invoke-virtual {v8, v4}, Lp1/q;->q(Z)V

    goto :goto_7

    :cond_9
    const v1, -0x78347cf5

    invoke-virtual {v8, v1}, Lp1/q;->e0(I)V

    sget-object v1, Lx81/d;->a:Lx81/d;

    invoke-virtual {v1, v8, v0}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v1

    invoke-virtual {v1}, Ly81/i;->a1()J

    move-result-wide v5

    goto :goto_6

    :goto_7
    if-eqz p2, :cond_a

    const v1, -0x783477ae

    invoke-virtual {v8, v1}, Lp1/q;->e0(I)V

    int-to-float v1, v3

    sget-object v3, Lx81/d;->a:Lx81/d;

    invoke-virtual {v3, v8, v0}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v0

    invoke-virtual {v0}, Ly81/i;->X0()J

    move-result-wide v9

    invoke-static {v1, v9, v10}, Lhg3/i;->a(FJ)Lf0/t;

    move-result-object v0

    invoke-virtual {v8, v4}, Lp1/q;->q(Z)V

    goto :goto_8

    :cond_a
    const v0, 0x71a64298

    invoke-virtual {v8, v0}, Lp1/q;->e0(I)V

    invoke-virtual {v8, v4}, Lp1/q;->q(Z)V

    const/4 v0, 0x0

    :goto_8
    int-to-float v1, v4

    new-instance v3, La31/c;

    const/16 v4, 0xe

    invoke-direct {v3, p2, p0, p1, v4}, La31/c;-><init>(ZLjava/lang/Object;Ljava/lang/Object;I)V

    const p2, -0x7451f71e

    invoke-static {p2, v8, v3}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v7

    const v9, 0x1b0006

    const/16 v10, 0x8

    move-wide v3, v5

    move v6, v1

    sget-object v1, Lb2/t;->w:Lb2/t;

    move-object v5, v0

    invoke-static/range {v1 .. v10}, Le93/b;->b(Landroidx/compose/ui/Modifier;Li2/a1;JLf0/t;FLc93/m;Landroidx/compose/runtime/Composer;II)V

    :goto_9
    move-object v3, p1

    goto :goto_a

    :cond_b
    invoke-virtual {v8}, Lp1/q;->X()V

    goto :goto_9

    :goto_a
    invoke-virtual {v8}, Lp1/q;->u()Lp1/v1;

    move-result-object p1

    if-eqz p1, :cond_c

    new-instance v0, Llq2/c;

    const/16 v5, 0x9

    move-object v1, p0

    move v2, p3

    move v4, p4

    invoke-direct/range {v0 .. v5}, Llq2/c;-><init>(Ljava/lang/Object;ILjava/lang/Object;II)V

    iput-object v0, p1, Lp1/v1;->d:Lc93/m;

    :cond_c
    return-void
.end method

.method private static final g(Ljava/lang/Object;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final h(ZLm71/d;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 31

    and-int/lit8 v0, p4, 0x3

    const/4 v1, 0x1

    const/4 v2, 0x0

    const/4 v3, 0x2

    if-eq v0, v3, :cond_0

    move v0, v1

    goto :goto_0

    :cond_0
    move v0, v2

    :goto_0
    and-int/lit8 v4, p4, 0x1

    move-object/from16 v9, p3

    check-cast v9, Lp1/q;

    invoke-virtual {v9, v4, v0}, Lp1/q;->U(IZ)Z

    move-result v0

    if-eqz v0, :cond_11

    sget-object v0, Lb2/e;->M:Lb2/k;

    const/high16 v4, 0x3f800000    # 1.0f

    sget-object v10, Lb2/t;->w:Lb2/t;

    invoke-static {v4, v10}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    int-to-float v3, v3

    const/16 v5, 0x8

    int-to-float v5, v5

    mul-float/2addr v3, v5

    if-eqz p0, :cond_1

    const/4 v6, 0x3

    int-to-float v6, v6

    mul-float/2addr v6, v5

    goto :goto_1

    :cond_1
    move v6, v3

    :goto_1
    invoke-static {v4, v3, v3, v3, v6}, Landroidx/compose/foundation/layout/a;->s(Landroidx/compose/ui/Modifier;FFFF)Landroidx/compose/ui/Modifier;

    move-result-object v4

    sget-object v6, Ll0/m;->a:Ll0/e;

    if-eqz p0, :cond_2

    goto :goto_2

    :cond_2
    int-to-float v3, v1

    mul-float/2addr v3, v5

    :goto_2
    invoke-static {v3}, Ll0/m;->i(F)Ll0/k;

    move-result-object v3

    const/16 v6, 0x30

    invoke-static {v3, v0, v9, v6}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v0

    iget-wide v7, v9, Lp1/q;->T:J

    invoke-static {v7, v8}, Ljava/lang/Long;->hashCode(J)I

    move-result v3

    invoke-virtual {v9}, Lp1/q;->m()Lp1/p1;

    move-result-object v7

    invoke-static {v9, v4}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    sget-object v8, La3/l;->a:La3/k;

    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v8, La3/k;->b:La3/j;

    invoke-virtual {v9}, Lp1/q;->i0()V

    iget-boolean v11, v9, Lp1/q;->S:Z

    if-eqz v11, :cond_3

    invoke-virtual {v9, v8}, Lp1/q;->l(Lc93/a;)V

    goto :goto_3

    :cond_3
    invoke-virtual {v9}, Lp1/q;->s0()V

    :goto_3
    sget-object v11, La3/k;->g:La3/i;

    invoke-static {v9, v11, v0}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v0, La3/k;->f:La3/i;

    invoke-static {v9, v0, v7}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v7, La3/k;->j:La3/i;

    iget-boolean v12, v9, Lp1/q;->S:Z

    if-nez v12, :cond_4

    invoke-virtual {v9}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v12

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v13

    invoke-static {v12, v13}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v12

    if-nez v12, :cond_5

    :cond_4
    invoke-static {v3, v9, v3, v7}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_5
    sget-object v3, La3/k;->d:La3/i;

    invoke-static {v9, v3, v4}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual/range {p1 .. p1}, Lm71/d;->c()Lcom/whoop/design/util/TextResource;

    move-result-object v4

    if-nez v4, :cond_7

    invoke-virtual/range {p1 .. p1}, Lm71/d;->e()Ljava/lang/Integer;

    move-result-object v4

    if-eqz v4, :cond_6

    goto :goto_4

    :cond_6
    const v0, 0x2c98d7d6

    invoke-virtual {v9, v0}, Lp1/q;->e0(I)V

    invoke-virtual {v9, v2}, Lp1/q;->q(Z)V

    goto/16 :goto_9

    :cond_7
    :goto_4
    const v4, 0x2c884bbc

    invoke-virtual {v9, v4}, Lp1/q;->e0(I)V

    sget-object v4, Lb2/e;->K:Lb2/l;

    int-to-float v12, v1

    mul-float v14, v12, v5

    const/4 v15, 0x7

    move-object v5, v11

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    invoke-static/range {v10 .. v15}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v11

    move-object v13, v10

    sget-object v10, Ll0/m;->a:Ll0/e;

    invoke-static {v10, v4, v9, v6}, Ll0/p1;->a(Ll0/i;Lb2/g;Landroidx/compose/runtime/Composer;I)Ll0/r1;

    move-result-object v4

    iget-wide v14, v9, Lp1/q;->T:J

    invoke-static {v14, v15}, Ljava/lang/Long;->hashCode(J)I

    move-result v6

    invoke-virtual {v9}, Lp1/q;->m()Lp1/p1;

    move-result-object v10

    invoke-static {v9, v11}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v11

    invoke-virtual {v9}, Lp1/q;->i0()V

    iget-boolean v12, v9, Lp1/q;->S:Z

    if-eqz v12, :cond_8

    invoke-virtual {v9, v8}, Lp1/q;->l(Lc93/a;)V

    goto :goto_5

    :cond_8
    invoke-virtual {v9}, Lp1/q;->s0()V

    :goto_5
    invoke-static {v9, v5, v4}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v9, v0, v10}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v0, v9, Lp1/q;->S:Z

    if-nez v0, :cond_9

    invoke-virtual {v9}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v0

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-static {v0, v4}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_a

    :cond_9
    invoke-static {v6, v9, v6, v7}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_a
    invoke-static {v9, v3, v11}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual/range {p1 .. p1}, Lm71/d;->e()Ljava/lang/Integer;

    move-result-object v0

    const/4 v3, 0x6

    if-nez v0, :cond_b

    const v0, 0x46cceb09

    invoke-virtual {v9, v0}, Lp1/q;->e0(I)V

    invoke-virtual {v9, v2}, Lp1/q;->q(Z)V

    goto :goto_6

    :cond_b
    const v4, 0x46cceb0a

    invoke-virtual {v9, v4}, Lp1/q;->e0(I)V

    invoke-virtual {v0}, Ljava/lang/Number;->intValue()I

    move-result v0

    int-to-float v4, v3

    const/4 v5, 0x4

    int-to-float v5, v5

    mul-float/2addr v4, v5

    invoke-static {v4, v13}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v7

    invoke-static {v0, v9, v3}, Lts/o;->S(ILandroidx/compose/runtime/Composer;I)Lo2/e;

    move-result-object v5

    sget-object v0, Lx81/d;->a:Lx81/d;

    invoke-virtual {v0, v9, v3}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v0

    invoke-virtual {v0}, Ly81/i;->b1()J

    move-result-wide v10

    move-object/from16 v27, v9

    move-wide v8, v10

    const/16 v11, 0x1b0

    const/4 v12, 0x0

    const/4 v6, 0x0

    move-object/from16 v10, v27

    invoke-static/range {v5 .. v12}, Lg1/f3;->b(Lo2/e;Ljava/lang/String;Landroidx/compose/ui/Modifier;JLandroidx/compose/runtime/Composer;II)V

    move-object v9, v10

    invoke-virtual {v9, v2}, Lp1/q;->q(Z)V

    :goto_6
    invoke-virtual/range {p1 .. p1}, Lm71/d;->c()Lcom/whoop/design/util/TextResource;

    move-result-object v0

    if-nez v0, :cond_c

    const v0, 0x46d380a9

    invoke-virtual {v9, v0}, Lp1/q;->e0(I)V

    invoke-virtual {v9, v2}, Lp1/q;->q(Z)V

    goto :goto_8

    :cond_c
    const v4, 0x46d380aa

    invoke-virtual {v9, v4}, Lp1/q;->e0(I)V

    invoke-virtual/range {p1 .. p1}, Lm71/d;->e()Ljava/lang/Integer;

    move-result-object v4

    if-eqz v4, :cond_d

    move v4, v1

    goto :goto_7

    :cond_d
    move v4, v2

    :goto_7
    invoke-virtual {v9}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    sget-object v6, Lp1/l;->a:Lp1/v0;

    if-ne v5, v6, :cond_e

    new-instance v5, Lm01/c;

    const/16 v6, 0x9

    invoke-direct {v5, v6}, Lm01/c;-><init>(I)V

    invoke-virtual {v9, v5}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_e
    check-cast v5, Lkotlin/jvm/functions/Function1;

    invoke-static {v13, v4, v5}, Lgb1/d;->b(Landroidx/compose/ui/Modifier;ZLkotlin/jvm/functions/Function1;)Landroidx/compose/ui/Modifier;

    move-result-object v6

    invoke-static {v0, v9, v2}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v5

    sget-object v0, Lx81/d;->a:Lx81/d;

    invoke-virtual {v0, v9, v3}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v4

    invoke-virtual {v4}, Ly81/i;->y()J

    move-result-wide v7

    invoke-virtual {v0, v9, v3}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v0

    invoke-virtual {v0}, Lb91/d;->a()Lb91/a;

    move-result-object v25

    const/16 v29, 0x0

    const v30, 0x2fff8

    move-object/from16 v27, v9

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

    const/16 v28, 0x0

    invoke-static/range {v5 .. v30}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v9, v27

    invoke-virtual {v9, v2}, Lp1/q;->q(Z)V

    :goto_8
    invoke-virtual {v9, v1}, Lp1/q;->q(Z)V

    invoke-virtual {v9, v2}, Lp1/q;->q(Z)V

    :goto_9
    const v0, 0x4bc2e281    # 2.5543938E7f

    invoke-virtual {v9, v0}, Lp1/q;->e0(I)V

    invoke-virtual/range {p1 .. p1}, Lm71/d;->a()Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_a
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_10

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    move-object v5, v3

    check-cast v5, Lm91/u;

    instance-of v3, v5, Lhy0/h0;

    if-eqz v3, :cond_f

    const v3, 0x6f8fe2c3

    invoke-virtual {v9, v3}, Lp1/q;->e0(I)V

    new-instance v7, Lgf1/e;

    const/16 v3, 0x18

    invoke-direct {v7, v3}, Lgf1/e;-><init>(I)V

    const/4 v10, 0x0

    const/16 v11, 0xa

    const/4 v6, 0x0

    const/4 v8, 0x0

    invoke-static/range {v5 .. v11}, Lm91/l;->r(Lm91/u;Lm91/p;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    invoke-virtual {v9, v2}, Lp1/q;->q(Z)V

    goto :goto_a

    :cond_f
    const v3, 0x7f78533a

    invoke-virtual {v9, v3}, Lp1/q;->e0(I)V

    const/4 v10, 0x0

    const/4 v11, 0x6

    const/4 v6, 0x0

    const/4 v7, 0x0

    move-object/from16 v8, p2

    invoke-static/range {v5 .. v11}, Lm91/l;->r(Lm91/u;Lm91/p;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    invoke-virtual {v9, v2}, Lp1/q;->q(Z)V

    goto :goto_a

    :cond_10
    invoke-virtual {v9, v2}, Lp1/q;->q(Z)V

    invoke-virtual {v9, v1}, Lp1/q;->q(Z)V

    goto :goto_b

    :cond_11
    invoke-virtual {v9}, Lp1/q;->X()V

    :goto_b
    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method

.method private static final i(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;
    .locals 8

    const-string v0, "$this$applyIf"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x1

    int-to-float v0, v0

    const/16 v1, 0x8

    int-to-float v1, v1

    mul-float v3, v0, v1

    const/4 v6, 0x0

    const/16 v7, 0xe

    const/4 v4, 0x0

    const/4 v5, 0x0

    move-object v2, p0

    invoke-static/range {v2 .. v7}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object p0

    return-object p0
.end method

.method private static final j(Lhy0/h0;Landroidx/compose/runtime/Composer;I)Landroidx/compose/ui/Modifier;
    .locals 1

    const-string p2, "it"

    invoke-static {p0, p2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Lp1/q;

    const p0, 0x5c2d5381

    invoke-virtual {p1, p0}, Lp1/q;->e0(I)V

    sget-object p0, Lb2/t;->w:Lb2/t;

    const/4 p2, 0x0

    const/high16 v0, 0x3f800000    # 1.0f

    invoke-static {p0, p2, v0}, Landroidx/compose/foundation/layout/a;->f(Landroidx/compose/ui/Modifier;ZF)Landroidx/compose/ui/Modifier;

    move-result-object p0

    invoke-virtual {p1, p2}, Lp1/q;->q(Z)V

    return-object p0
.end method

.method private static final k(Lm71/d;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, Lp1/x;->L(I)I

    move-result p2

    invoke-static {p0, p1, p4, p2, p3}, Lm71/b;->f(Lm71/d;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method
