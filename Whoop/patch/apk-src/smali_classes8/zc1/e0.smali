.class public abstract Lzc1/e0;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u001a#\u0010\u0004\u001a\u00020\u00022\u0012\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u0000H\u0007\u00a2\u0006\u0004\u0008\u0004\u0010\u0005\u00a8\u0006\u0006"
    }
    d2 = {
        "Lkotlin/Function1;",
        "Lzc1/d0;",
        "Ll83/a0;",
        "onClick",
        "f",
        "(Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V",
        "design-showcase_release"
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
.method public static synthetic a(Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lzc1/e0;->g(Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lzc1/e0;->h(Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lzc1/e0;->i(Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lzc1/e0;->j(Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic e(ILkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p1, p0, p2, p3}, Lzc1/e0;->k(Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final f(Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V
    .locals 23
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lkotlin/jvm/functions/Function1;",
            "Landroidx/compose/runtime/Composer;",
            "I)V"
        }
    .end annotation

    move-object/from16 v0, p0

    const-string v2, "onClick"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v12, p1

    check-cast v12, Lp1/q;

    const v2, -0x36e700e5

    invoke-virtual {v12, v2}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v2, p2, 0x6

    const/4 v15, 0x2

    const/4 v3, 0x4

    if-nez v2, :cond_1

    invoke-virtual {v12, v0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    move v2, v3

    goto :goto_0

    :cond_0
    move v2, v15

    :goto_0
    or-int v2, p2, v2

    goto :goto_1

    :cond_1
    move/from16 v2, p2

    :goto_1
    and-int/lit8 v4, v2, 0x3

    const/16 v16, 0x0

    const/4 v5, 0x1

    if-eq v4, v15, :cond_2

    move v4, v5

    goto :goto_2

    :cond_2
    move/from16 v4, v16

    :goto_2
    and-int/lit8 v6, v2, 0x1

    invoke-virtual {v12, v6, v4}, Lp1/q;->U(IZ)Z

    move-result v4

    if-eqz v4, :cond_12

    const/high16 v4, 0x3f800000    # 1.0f

    sget-object v6, Lb2/t;->w:Lb2/t;

    invoke-static {v4, v6}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    int-to-float v7, v3

    const/16 v8, 0x8

    int-to-float v8, v8

    mul-float/2addr v8, v7

    invoke-static {v8, v4}, Landroidx/compose/foundation/layout/a;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    sget-object v8, Lb2/e;->N:Lb2/k;

    sget-object v9, Ll0/m;->c:Ll0/g;

    const/16 v10, 0x30

    invoke-static {v9, v8, v12, v10}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v8

    iget-wide v9, v12, Lp1/q;->T:J

    invoke-static {v9, v10}, Ljava/lang/Long;->hashCode(J)I

    move-result v9

    invoke-virtual {v12}, Lp1/q;->m()Lp1/p1;

    move-result-object v10

    invoke-static {v12, v4}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    sget-object v11, La3/l;->a:La3/k;

    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v11, La3/k;->b:La3/j;

    invoke-virtual {v12}, Lp1/q;->i0()V

    iget-boolean v13, v12, Lp1/q;->S:Z

    if-eqz v13, :cond_3

    invoke-virtual {v12, v11}, Lp1/q;->l(Lc93/a;)V

    goto :goto_3

    :cond_3
    invoke-virtual {v12}, Lp1/q;->s0()V

    :goto_3
    sget-object v11, La3/k;->g:La3/i;

    invoke-static {v12, v11, v8}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v8, La3/k;->f:La3/i;

    invoke-static {v12, v8, v10}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v8, La3/k;->j:La3/i;

    iget-boolean v10, v12, Lp1/q;->S:Z

    if-nez v10, :cond_4

    invoke-virtual {v12}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v10

    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v11

    invoke-static {v10, v11}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v10

    if-nez v10, :cond_5

    :cond_4
    invoke-static {v9, v12, v9, v8}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_5
    sget-object v8, La3/k;->d:La3/i;

    invoke-static {v12, v8, v4}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    and-int/lit8 v2, v2, 0xe

    if-ne v2, v3, :cond_6

    move v4, v5

    goto :goto_4

    :cond_6
    move/from16 v4, v16

    :goto_4
    invoke-virtual {v12}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v8

    sget-object v9, Lp1/l;->a:Lp1/v0;

    if-nez v4, :cond_7

    if-ne v8, v9, :cond_8

    :cond_7
    new-instance v8, Lyk2/i;

    const/16 v4, 0x18

    invoke-direct {v8, v0, v4}, Lyk2/i;-><init>(Lkotlin/jvm/functions/Function1;I)V

    invoke-virtual {v12, v8}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_8
    check-cast v8, Lc93/a;

    sget-object v17, Lzc1/z0;->a:Lzc1/z0;

    invoke-virtual/range {v17 .. v17}, Lzc1/z0;->e()Lkotlin/jvm/functions/Function3;

    move-result-object v11

    const/high16 v13, 0x30000000

    const/16 v14, 0x1fe

    const/4 v4, 0x0

    move v10, v5

    const/4 v5, 0x0

    move-object/from16 v18, v6

    const/4 v6, 0x0

    move/from16 v19, v7

    const/4 v7, 0x0

    move/from16 v20, v3

    move-object v3, v8

    const/4 v8, 0x0

    move-object/from16 v21, v9

    const/4 v9, 0x0

    move/from16 v22, v10

    const/4 v10, 0x0

    move-object/from16 v0, v18

    move-object/from16 v1, v21

    invoke-static/range {v3 .. v14}, Ldt/b;->a(Lc93/a;Landroidx/compose/ui/Modifier;ZLg1/q1;Li2/a1;Lf0/t;Lg1/u0;Ll0/k1;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V

    int-to-float v3, v15

    mul-float v15, v3, v19

    invoke-static {v15, v0}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    invoke-static {v12, v3}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    const/4 v3, 0x4

    if-ne v2, v3, :cond_9

    const/4 v5, 0x1

    goto :goto_5

    :cond_9
    move/from16 v5, v16

    :goto_5
    invoke-virtual {v12}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    if-nez v5, :cond_b

    if-ne v3, v1, :cond_a

    goto :goto_6

    :cond_a
    move-object/from16 v5, p0

    goto :goto_7

    :cond_b
    :goto_6
    new-instance v3, Lyk2/i;

    const/16 v4, 0x19

    move-object/from16 v5, p0

    invoke-direct {v3, v5, v4}, Lyk2/i;-><init>(Lkotlin/jvm/functions/Function1;I)V

    invoke-virtual {v12, v3}, Lp1/q;->p0(Ljava/lang/Object;)V

    :goto_7
    check-cast v3, Lc93/a;

    invoke-virtual/range {v17 .. v17}, Lzc1/z0;->g()Lkotlin/jvm/functions/Function3;

    move-result-object v11

    const/high16 v13, 0x30000000

    const/16 v14, 0x1fe

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    invoke-static/range {v3 .. v14}, Ldt/b;->a(Lc93/a;Landroidx/compose/ui/Modifier;ZLg1/q1;Li2/a1;Lf0/t;Lg1/u0;Ll0/k1;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V

    invoke-static {v15, v0}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    invoke-static {v12, v3}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    const/4 v3, 0x4

    if-ne v2, v3, :cond_c

    const/4 v5, 0x1

    goto :goto_8

    :cond_c
    move/from16 v5, v16

    :goto_8
    invoke-virtual {v12}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    if-nez v5, :cond_e

    if-ne v3, v1, :cond_d

    goto :goto_9

    :cond_d
    move-object/from16 v5, p0

    goto :goto_a

    :cond_e
    :goto_9
    new-instance v3, Lyk2/i;

    const/16 v4, 0x1a

    move-object/from16 v5, p0

    invoke-direct {v3, v5, v4}, Lyk2/i;-><init>(Lkotlin/jvm/functions/Function1;I)V

    invoke-virtual {v12, v3}, Lp1/q;->p0(Ljava/lang/Object;)V

    :goto_a
    check-cast v3, Lc93/a;

    invoke-virtual/range {v17 .. v17}, Lzc1/z0;->h()Lkotlin/jvm/functions/Function3;

    move-result-object v11

    const/high16 v13, 0x30000000

    const/16 v14, 0x1fe

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    invoke-static/range {v3 .. v14}, Ldt/b;->a(Lc93/a;Landroidx/compose/ui/Modifier;ZLg1/q1;Li2/a1;Lf0/t;Lg1/u0;Ll0/k1;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V

    invoke-static {v15, v0}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    invoke-static {v12, v0}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    const/4 v3, 0x4

    if-ne v2, v3, :cond_f

    const/16 v16, 0x1

    :cond_f
    invoke-virtual {v12}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v0

    if-nez v16, :cond_11

    if-ne v0, v1, :cond_10

    goto :goto_b

    :cond_10
    move-object/from16 v2, p0

    goto :goto_c

    :cond_11
    :goto_b
    new-instance v0, Lyk2/i;

    const/16 v1, 0x1b

    move-object/from16 v2, p0

    invoke-direct {v0, v2, v1}, Lyk2/i;-><init>(Lkotlin/jvm/functions/Function1;I)V

    invoke-virtual {v12, v0}, Lp1/q;->p0(Ljava/lang/Object;)V

    :goto_c
    move-object v3, v0

    check-cast v3, Lc93/a;

    invoke-virtual/range {v17 .. v17}, Lzc1/z0;->f()Lkotlin/jvm/functions/Function3;

    move-result-object v11

    const/high16 v13, 0x30000000

    const/16 v14, 0x1fe

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    invoke-static/range {v3 .. v14}, Ldt/b;->a(Lc93/a;Landroidx/compose/ui/Modifier;ZLg1/q1;Li2/a1;Lf0/t;Lg1/u0;Ll0/k1;Lkotlin/jvm/functions/Function3;Landroidx/compose/runtime/Composer;II)V

    const/4 v10, 0x1

    invoke-virtual {v12, v10}, Lp1/q;->q(Z)V

    goto :goto_d

    :cond_12
    move-object v2, v0

    invoke-virtual {v12}, Lp1/q;->X()V

    :goto_d
    invoke-virtual {v12}, Lp1/q;->u()Lp1/v1;

    move-result-object v0

    if-eqz v0, :cond_13

    new-instance v1, Lcd0/a;

    const/16 v3, 0x17

    move/from16 v4, p2

    invoke-direct {v1, v2, v4, v3}, Lcd0/a;-><init>(Lkotlin/jvm/functions/Function1;II)V

    iput-object v1, v0, Lp1/v1;->d:Lc93/m;

    :cond_13
    return-void
.end method

.method private static final g(Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 1

    sget-object v0, Lzc1/d0;->LEFT:Lzc1/d0;

    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final h(Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 1

    sget-object v0, Lzc1/d0;->RIGHT:Lzc1/d0;

    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final i(Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 1

    sget-object v0, Lzc1/d0;->FULL:Lzc1/d0;

    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final j(Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 1

    sget-object v0, Lzc1/d0;->NONE:Lzc1/d0;

    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final k(Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p1, p1, 0x1

    invoke-static {p1}, Lp1/x;->L(I)I

    move-result p1

    invoke-static {p0, p2, p1}, Lzc1/e0;->f(Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method
