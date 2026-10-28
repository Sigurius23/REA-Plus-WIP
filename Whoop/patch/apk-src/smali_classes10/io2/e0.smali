.class public abstract Lio2/e0;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u001a7\u0010\u0008\u001a\u00020\u00062\u0008\u0008\u0002\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u00022\u0014\u0008\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004H\u0007\u00a2\u0006\u0004\u0008\u0008\u0010\t\u00a8\u0006\n"
    }
    d2 = {
        "Landroidx/compose/ui/Modifier;",
        "modifier",
        "Lio2/d0;",
        "viewState",
        "Lkotlin/Function1;",
        "",
        "Ll83/a0;",
        "onViewEvent",
        "e",
        "(Landroidx/compose/ui/Modifier;Lio2/d0;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V",
        "universal-checkout_release"
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
.method public static synthetic a(Lkotlin/jvm/functions/Function1;Lio2/d0;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lio2/e0;->h(Lkotlin/jvm/functions/Function1;Lio2/d0;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lkotlin/jvm/functions/Function1;Lio2/d0;Lp31/j;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, Lio2/e0;->g(Lkotlin/jvm/functions/Function1;Lio2/d0;Lp31/j;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Landroidx/compose/ui/Modifier;Lio2/d0;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p6}, Lio2/e0;->i(Landroidx/compose/ui/Modifier;Lio2/d0;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Ljava/lang/Object;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lio2/e0;->f(Ljava/lang/Object;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final e(Landroidx/compose/ui/Modifier;Lio2/d0;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V
    .locals 18
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Landroidx/compose/ui/Modifier;",
            "Lio2/d0;",
            "Lkotlin/jvm/functions/Function1;",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    move-object/from16 v5, p1

    move/from16 v1, p4

    const-string v0, "viewState"

    invoke-static {v5, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v9, p3

    check-cast v9, Lp1/q;

    const v0, 0x7b519154

    invoke-virtual {v9, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, p5, 0x1

    const/4 v2, 0x2

    const/4 v3, 0x4

    if-eqz v0, :cond_0

    or-int/lit8 v4, v1, 0x6

    move v6, v4

    move-object/from16 v4, p0

    goto :goto_1

    :cond_0
    and-int/lit8 v4, v1, 0x6

    if-nez v4, :cond_2

    move-object/from16 v4, p0

    invoke-virtual {v9, v4}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_1

    move v6, v3

    goto :goto_0

    :cond_1
    move v6, v2

    :goto_0
    or-int/2addr v6, v1

    goto :goto_1

    :cond_2
    move-object/from16 v4, p0

    move v6, v1

    :goto_1
    and-int/lit8 v7, v1, 0x30

    if-nez v7, :cond_5

    and-int/lit8 v7, v1, 0x40

    if-nez v7, :cond_3

    invoke-virtual {v9, v5}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v7

    goto :goto_2

    :cond_3
    invoke-virtual {v9, v5}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v7

    :goto_2
    if-eqz v7, :cond_4

    const/16 v7, 0x20

    goto :goto_3

    :cond_4
    const/16 v7, 0x10

    :goto_3
    or-int/2addr v6, v7

    :cond_5
    and-int/lit8 v7, p5, 0x4

    const/16 v13, 0x100

    if-eqz v7, :cond_7

    or-int/lit16 v6, v6, 0x180

    :cond_6
    move-object/from16 v8, p2

    :goto_4
    move v14, v6

    goto :goto_6

    :cond_7
    and-int/lit16 v8, v1, 0x180

    if-nez v8, :cond_6

    move-object/from16 v8, p2

    invoke-virtual {v9, v8}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_8

    move v10, v13

    goto :goto_5

    :cond_8
    const/16 v10, 0x80

    :goto_5
    or-int/2addr v6, v10

    goto :goto_4

    :goto_6
    and-int/lit16 v6, v14, 0x93

    const/16 v10, 0x92

    if-eq v6, v10, :cond_9

    const/4 v6, 0x1

    goto :goto_7

    :cond_9
    const/4 v6, 0x0

    :goto_7
    and-int/lit8 v10, v14, 0x1

    invoke-virtual {v9, v10, v6}, Lp1/q;->U(IZ)Z

    move-result v6

    if-eqz v6, :cond_1b

    sget-object v6, Lb2/t;->w:Lb2/t;

    if-eqz v0, :cond_a

    move-object v4, v6

    :cond_a
    sget-object v0, Lp1/l;->a:Lp1/v0;

    if-eqz v7, :cond_c

    invoke-virtual {v9}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v7

    if-ne v7, v0, :cond_b

    new-instance v7, Lio2/e;

    const/4 v8, 0x5

    invoke-direct {v7, v8}, Lio2/e;-><init>(I)V

    invoke-virtual {v9, v7}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_b
    check-cast v7, Lkotlin/jvm/functions/Function1;

    goto :goto_8

    :cond_c
    move-object v7, v8

    :goto_8
    invoke-virtual {v5}, Lio2/d0;->f()Lp31/p;

    move-result-object v8

    if-eqz v8, :cond_1a

    invoke-virtual {v5}, Lio2/d0;->c()Ly71/o;

    move-result-object v8

    if-eqz v8, :cond_1a

    const v8, -0x46ddcc71

    invoke-virtual {v9, v8}, Lp1/q;->e0(I)V

    int-to-float v2, v2

    const/16 v8, 0x8

    int-to-float v8, v8

    mul-float/2addr v2, v8

    invoke-static {v2}, Ll0/m;->i(F)Ll0/k;

    move-result-object v2

    sget-object v8, Lb2/e;->N:Lb2/k;

    const/16 v10, 0x36

    invoke-static {v2, v8, v9, v10}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v2

    iget-wide v11, v9, Lp1/q;->T:J

    invoke-static {v11, v12}, Ljava/lang/Long;->hashCode(J)I

    move-result v8

    invoke-virtual {v9}, Lp1/q;->m()Lp1/p1;

    move-result-object v11

    invoke-static {v9, v4}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v12

    sget-object v16, La3/l;->a:La3/k;

    invoke-virtual/range {v16 .. v16}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v10, La3/k;->b:La3/j;

    invoke-virtual {v9}, Lp1/q;->i0()V

    iget-boolean v15, v9, Lp1/q;->S:Z

    if-eqz v15, :cond_d

    invoke-virtual {v9, v10}, Lp1/q;->l(Lc93/a;)V

    goto :goto_9

    :cond_d
    invoke-virtual {v9}, Lp1/q;->s0()V

    :goto_9
    sget-object v10, La3/k;->g:La3/i;

    invoke-static {v9, v10, v2}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v2, La3/k;->f:La3/i;

    invoke-static {v9, v2, v11}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v2, La3/k;->j:La3/i;

    iget-boolean v10, v9, Lp1/q;->S:Z

    if-nez v10, :cond_e

    invoke-virtual {v9}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v10

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v11

    invoke-static {v10, v11}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v10

    if-nez v10, :cond_f

    :cond_e
    invoke-static {v8, v9, v8, v2}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_f
    sget-object v2, La3/k;->d:La3/i;

    invoke-static {v9, v2, v12}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    move-object v2, v6

    invoke-virtual {v5}, Lio2/d0;->f()Lp31/p;

    move-result-object v6

    and-int/lit16 v12, v14, 0x380

    if-ne v12, v13, :cond_10

    const/4 v8, 0x1

    goto :goto_a

    :cond_10
    const/4 v8, 0x0

    :goto_a
    and-int/lit8 v15, v14, 0x70

    const/16 v10, 0x20

    if-eq v15, v10, :cond_12

    and-int/lit8 v10, v14, 0x40

    if-eqz v10, :cond_11

    invoke-virtual {v9, v5}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v10

    if-eqz v10, :cond_11

    goto :goto_b

    :cond_11
    const/4 v10, 0x0

    goto :goto_c

    :cond_12
    :goto_b
    const/4 v10, 0x1

    :goto_c
    or-int/2addr v8, v10

    invoke-virtual {v9}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v10

    if-nez v8, :cond_13

    if-ne v10, v0, :cond_14

    :cond_13
    new-instance v10, Lio/getstream/chat/android/client/internal/offline/repository/domain/queryChannels/internal/a;

    const/16 v8, 0x17

    invoke-direct {v10, v8, v7, v5}, Lio/getstream/chat/android/client/internal/offline/repository/domain/queryChannels/internal/a;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v9, v10}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_14
    move-object v8, v10

    check-cast v8, Lkotlin/jvm/functions/Function1;

    sget v10, Lp31/p;->a:I

    const/4 v11, 0x2

    move-object/from16 v17, v7

    const/4 v7, 0x0

    move-object v13, v2

    move-object/from16 v2, v17

    invoke-static/range {v6 .. v11}, Lp31/n;->p(Lp31/p;Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    const/16 v6, 0xf

    int-to-float v6, v6

    int-to-float v3, v3

    mul-float/2addr v6, v3

    invoke-static {v6, v13}, Landroidx/compose/foundation/layout/d;->h(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v6

    invoke-virtual {v5}, Lio2/d0;->c()Ly71/o;

    move-result-object v7

    const/16 v3, 0x100

    if-ne v12, v3, :cond_15

    const/4 v11, 0x1

    :goto_d
    const/16 v10, 0x20

    goto :goto_e

    :cond_15
    const/4 v11, 0x0

    goto :goto_d

    :goto_e
    if-eq v15, v10, :cond_17

    and-int/lit8 v3, v14, 0x40

    if-eqz v3, :cond_16

    invoke-virtual {v9, v5}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_16

    goto :goto_f

    :cond_16
    const/4 v3, 0x0

    goto :goto_10

    :cond_17
    :goto_f
    const/4 v3, 0x1

    :goto_10
    or-int/2addr v3, v11

    invoke-virtual {v9}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v8

    if-nez v3, :cond_18

    if-ne v8, v0, :cond_19

    :cond_18
    new-instance v8, Li01/d;

    const/16 v0, 0x1a

    invoke-direct {v8, v2, v5, v0}, Li01/d;-><init>(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;I)V

    invoke-virtual {v9, v8}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_19
    check-cast v8, Lc93/a;

    sget v0, Ly71/o;->q:I

    shl-int/lit8 v0, v0, 0x3

    or-int/lit8 v10, v0, 0x6

    const/4 v11, 0x0

    invoke-static/range {v6 .. v11}, Ly71/n;->c(Landroidx/compose/ui/Modifier;Ly71/o;Lc93/a;Landroidx/compose/runtime/Composer;II)V

    const/4 v10, 0x1

    invoke-virtual {v9, v10}, Lp1/q;->q(Z)V

    const/4 v0, 0x0

    invoke-virtual {v9, v0}, Lp1/q;->q(Z)V

    goto :goto_11

    :cond_1a
    move-object v2, v7

    const/4 v0, 0x0

    const v3, -0x46d5bed2

    invoke-virtual {v9, v3}, Lp1/q;->e0(I)V

    invoke-virtual {v9, v0}, Lp1/q;->q(Z)V

    :goto_11
    move-object v6, v2

    goto :goto_12

    :cond_1b
    invoke-virtual {v9}, Lp1/q;->X()V

    move-object v6, v8

    :goto_12
    invoke-virtual {v9}, Lp1/q;->u()Lp1/v1;

    move-result-object v7

    if-eqz v7, :cond_1c

    new-instance v0, Lhy0/v;

    const/16 v3, 0x13

    move/from16 v2, p5

    invoke-direct/range {v0 .. v6}, Lhy0/v;-><init>(IIILandroidx/compose/ui/Modifier;Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)V

    iput-object v0, v7, Lp1/v1;->d:Lc93/m;

    :cond_1c
    return-void
.end method

.method private static final f(Ljava/lang/Object;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final g(Lkotlin/jvm/functions/Function1;Lio2/d0;Lp31/j;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p2, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p1}, Lio2/d0;->e()Lcom/whoop/navigation/e;

    move-result-object p1

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final h(Lkotlin/jvm/functions/Function1;Lio2/d0;)Ll83/a0;
    .locals 0

    invoke-virtual {p1}, Lio2/d0;->e()Lcom/whoop/navigation/e;

    move-result-object p1

    invoke-interface {p0, p1}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final i(Landroidx/compose/ui/Modifier;Lio2/d0;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 6

    or-int/lit8 p3, p3, 0x1

    invoke-static {p3}, Lp1/x;->L(I)I

    move-result v4

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move v5, p4

    move-object v3, p5

    invoke-static/range {v0 .. v5}, Lio2/e0;->e(Landroidx/compose/ui/Modifier;Lio2/d0;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method
