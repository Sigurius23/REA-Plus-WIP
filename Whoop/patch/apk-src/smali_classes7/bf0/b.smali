.class public abstract Lbf0/b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001c\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0006\u001a9\u0010\u0008\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u000c\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u00022\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00030\u0005H\u0001\u00a2\u0006\u0004\u0008\u0008\u0010\t\u001a+\u0010\n\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00030\u0005H\u0001\u00a2\u0006\u0004\u0008\n\u0010\u000b\u00a8\u0006\u000c"
    }
    d2 = {
        "Lze0/c$e$c;",
        "viewState",
        "Lkotlin/Function0;",
        "Ll83/a0;",
        "onTagClick",
        "Lkotlin/Function1;",
        "Lze0/a;",
        "onEvent",
        "f",
        "(Lze0/c$e$c;Lc93/a;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V",
        "i",
        "(Lze0/c$e$c;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V",
        "advanced-labs_release"
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
.method public static synthetic a(Lze0/c$e$c;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Lbf0/b;->l(Lze0/c$e$c;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lbf0/b;->k(Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lbf0/b;->j(Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lbf0/b;->g(Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic e(Lze0/c$e$c;Lc93/a;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p5}, Lbf0/b;->h(Lze0/c$e$c;Lc93/a;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final f(Lze0/c$e$c;Lc93/a;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V
    .locals 36
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lze0/c$e$c;",
            "Lc93/a;",
            "Lkotlin/jvm/functions/Function1;",
            "Landroidx/compose/runtime/Composer;",
            "I)V"
        }
    .end annotation

    move-object/from16 v0, p0

    move-object/from16 v6, p1

    move-object/from16 v10, p2

    move/from16 v11, p4

    const-string v1, "viewState"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "onTagClick"

    invoke-static {v6, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "onEvent"

    invoke-static {v10, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v7, p3

    check-cast v7, Lp1/q;

    const v1, -0x30421a86    # -6.3718656E9f

    invoke-virtual {v7, v1}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v1, v11, 0x6

    const/4 v2, 0x2

    if-nez v1, :cond_1

    invoke-virtual {v7, v0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    const/4 v1, 0x4

    goto :goto_0

    :cond_0
    move v1, v2

    :goto_0
    or-int/2addr v1, v11

    goto :goto_1

    :cond_1
    move v1, v11

    :goto_1
    and-int/lit8 v3, v11, 0x30

    if-nez v3, :cond_3

    invoke-virtual {v7, v6}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_2

    const/16 v3, 0x20

    goto :goto_2

    :cond_2
    const/16 v3, 0x10

    :goto_2
    or-int/2addr v1, v3

    :cond_3
    and-int/lit16 v3, v11, 0x180

    if-nez v3, :cond_5

    invoke-virtual {v7, v10}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_4

    const/16 v3, 0x100

    goto :goto_3

    :cond_4
    const/16 v3, 0x80

    :goto_3
    or-int/2addr v1, v3

    :cond_5
    move v12, v1

    and-int/lit16 v1, v12, 0x93

    const/16 v3, 0x92

    const/4 v5, 0x0

    const/4 v13, 0x1

    if-eq v1, v3, :cond_6

    move v1, v13

    goto :goto_4

    :cond_6
    move v1, v5

    :goto_4
    and-int/lit8 v3, v12, 0x1

    invoke-virtual {v7, v3, v1}, Lp1/q;->U(IZ)Z

    move-result v1

    if-eqz v1, :cond_d

    const/high16 v1, 0x3f800000    # 1.0f

    sget-object v3, Lb2/t;->w:Lb2/t;

    invoke-static {v1, v3}, Landroidx/compose/foundation/layout/d;->d(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v8

    invoke-static {v8}, Lgb1/b0;->b0(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v8

    invoke-static {v8}, Ll0/f;->n(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v8

    sget-object v9, Ll0/m;->c:Ll0/g;

    sget-object v14, Lb2/e;->M:Lb2/k;

    invoke-static {v9, v14, v7, v5}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v9

    iget-wide v14, v7, Lp1/q;->T:J

    invoke-static {v14, v15}, Ljava/lang/Long;->hashCode(J)I

    move-result v14

    invoke-virtual {v7}, Lp1/q;->m()Lp1/p1;

    move-result-object v15

    invoke-static {v7, v8}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v8

    sget-object v16, La3/l;->a:La3/k;

    invoke-virtual/range {v16 .. v16}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v5, La3/k;->b:La3/j;

    invoke-virtual {v7}, Lp1/q;->i0()V

    iget-boolean v4, v7, Lp1/q;->S:Z

    if-eqz v4, :cond_7

    invoke-virtual {v7, v5}, Lp1/q;->l(Lc93/a;)V

    goto :goto_5

    :cond_7
    invoke-virtual {v7}, Lp1/q;->s0()V

    :goto_5
    sget-object v4, La3/k;->g:La3/i;

    invoke-static {v7, v4, v9}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v4, La3/k;->f:La3/i;

    invoke-static {v7, v4, v15}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v4, La3/k;->j:La3/i;

    iget-boolean v5, v7, Lp1/q;->S:Z

    if-nez v5, :cond_8

    invoke-virtual {v7}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    invoke-static {v14}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    invoke-static {v5, v9}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_9

    :cond_8
    invoke-static {v14, v7, v14, v4}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_9
    sget-object v4, La3/k;->d:La3/i;

    invoke-static {v7, v4, v8}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v1, v3}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v17

    int-to-float v1, v2

    const/16 v2, 0x8

    int-to-float v2, v2

    mul-float v19, v1, v2

    int-to-float v1, v13

    mul-float v21, v1, v2

    const/16 v22, 0x5

    const/16 v18, 0x0

    const/16 v20, 0x0

    invoke-static/range {v17 .. v22}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v1

    new-instance v17, Lcom/whoop/design/atomic/organism/toolbar/d$a;

    invoke-virtual {v0}, Lze0/c$e$c;->e()Lze0/c$d;

    move-result-object v2

    invoke-virtual {v2}, Lze0/c$d;->a()Ljava/lang/String;

    move-result-object v2

    invoke-static {v2}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v18

    sget-object v2, Lgz0/m0;->CARET_BACKWARD:Lgz0/m0;

    invoke-virtual {v2}, Lgz0/m0;->toWhoopIcon()I

    move-result v2

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v20

    invoke-virtual {v0}, Lze0/c$e$c;->e()Lze0/c$d;

    move-result-object v2

    invoke-virtual {v2}, Lze0/c$d;->b()Lhy0/h1;

    move-result-object v32

    const v34, 0xbffa

    const/16 v35, 0x0

    const/16 v19, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    const/16 v28, 0x0

    const/16 v29, 0x0

    const/16 v30, 0x0

    const/16 v31, 0x0

    const/16 v33, 0x0

    invoke-direct/range {v17 .. v35}, Lcom/whoop/design/atomic/organism/toolbar/d$a;-><init>(Lcom/whoop/design/util/TextResource;Lo81/a;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Lny0/q;Lny0/q;ZLc93/m;Ly81/f;Ly81/f;Ly81/f;Ly81/f;Lhy0/h1;Ljava/lang/String;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    and-int/lit16 v2, v12, 0x380

    const/16 v3, 0x100

    if-ne v2, v3, :cond_a

    move v5, v13

    goto :goto_6

    :cond_a
    const/4 v5, 0x0

    :goto_6
    invoke-virtual {v7}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    if-nez v5, :cond_b

    sget-object v3, Lp1/l;->a:Lp1/v0;

    if-ne v2, v3, :cond_c

    :cond_b
    new-instance v2, Lo;

    const/16 v3, 0x1d

    invoke-direct {v2, v10, v3}, Lo;-><init>(Lkotlin/jvm/functions/Function1;I)V

    invoke-virtual {v7, v2}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_c
    move-object v4, v2

    check-cast v4, Lc93/a;

    sget v2, Lcom/whoop/design/atomic/organism/toolbar/d$a;->r:I

    shl-int/lit8 v2, v2, 0x3

    or-int/lit8 v2, v2, 0x6

    shl-int/lit8 v3, v12, 0xc

    const/high16 v5, 0x70000

    and-int/2addr v3, v5

    or-int v8, v2, v3

    const/16 v9, 0x14

    const/4 v3, 0x0

    const/4 v5, 0x0

    move-object/from16 v2, v17

    invoke-static/range {v1 .. v9}, Lcom/whoop/design/atomic/organism/toolbar/b;->d(Landroidx/compose/ui/Modifier;Lcom/whoop/design/atomic/organism/toolbar/d;Landroidx/compose/ui/Modifier;Lc93/a;Lc93/a;Lc93/a;Landroidx/compose/runtime/Composer;II)V

    and-int/lit8 v1, v12, 0xe

    shr-int/lit8 v2, v12, 0x3

    and-int/lit8 v2, v2, 0x70

    or-int/2addr v1, v2

    invoke-static {v0, v10, v7, v1}, Lbf0/b;->i(Lze0/c$e$c;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    invoke-virtual {v7, v13}, Lp1/q;->q(Z)V

    goto :goto_7

    :cond_d
    invoke-virtual {v7}, Lp1/q;->X()V

    :goto_7
    invoke-virtual {v7}, Lp1/q;->u()Lp1/v1;

    move-result-object v1

    if-eqz v1, :cond_e

    new-instance v2, Lj;

    invoke-direct {v2, v0, v6, v10, v11}, Lj;-><init>(Lze0/c$e$c;Lc93/a;Lkotlin/jvm/functions/Function1;I)V

    iput-object v2, v1, Lp1/v1;->d:Lc93/m;

    :cond_e
    return-void
.end method

.method private static final g(Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 1

    sget-object v0, Lze0/a$b;->a:Lze0/a$b;

    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final h(Lze0/c$e$c;Lc93/a;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p3, p3, 0x1

    invoke-static {p3}, Lp1/x;->L(I)I

    move-result p3

    invoke-static {p0, p1, p2, p4, p3}, Lbf0/b;->f(Lze0/c$e$c;Lc93/a;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static final i(Lze0/c$e$c;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V
    .locals 32
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lze0/c$e$c;",
            "Lkotlin/jvm/functions/Function1;",
            "Landroidx/compose/runtime/Composer;",
            "I)V"
        }
    .end annotation

    move-object/from16 v0, p0

    move-object/from16 v1, p1

    const-string v3, "viewState"

    invoke-static {v0, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v3, "onEvent"

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v15, p2

    check-cast v15, Lp1/q;

    const v3, -0x20d19aff

    invoke-virtual {v15, v3}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v3, p3, 0x6

    const/4 v4, 0x4

    if-nez v3, :cond_1

    invoke-virtual {v15, v0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v3

    if-eqz v3, :cond_0

    move v3, v4

    goto :goto_0

    :cond_0
    const/4 v3, 0x2

    :goto_0
    or-int v3, p3, v3

    goto :goto_1

    :cond_1
    move/from16 v3, p3

    :goto_1
    and-int/lit8 v6, p3, 0x30

    if-nez v6, :cond_3

    invoke-virtual {v15, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_2

    const/16 v6, 0x20

    goto :goto_2

    :cond_2
    const/16 v6, 0x10

    :goto_2
    or-int/2addr v3, v6

    :cond_3
    and-int/lit8 v6, v3, 0x13

    const/16 v7, 0x12

    const/4 v12, 0x0

    if-eq v6, v7, :cond_4

    const/4 v6, 0x1

    goto :goto_3

    :cond_4
    move v6, v12

    :goto_3
    and-int/lit8 v7, v3, 0x1

    invoke-virtual {v15, v7, v6}, Lp1/q;->U(IZ)Z

    move-result v6

    if-eqz v6, :cond_13

    sget-object v6, Ll0/m;->c:Ll0/g;

    sget-object v7, Lb2/e;->M:Lb2/k;

    invoke-static {v6, v7, v15, v12}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v6

    iget-wide v8, v15, Lp1/q;->T:J

    invoke-static {v8, v9}, Ljava/lang/Long;->hashCode(J)I

    move-result v8

    invoke-virtual {v15}, Lp1/q;->m()Lp1/p1;

    move-result-object v9

    sget-object v10, Lb2/t;->w:Lb2/t;

    invoke-static {v15, v10}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v14

    sget-object v16, La3/l;->a:La3/k;

    invoke-virtual/range {v16 .. v16}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v11, La3/k;->b:La3/j;

    invoke-virtual {v15}, Lp1/q;->i0()V

    iget-boolean v12, v15, Lp1/q;->S:Z

    if-eqz v12, :cond_5

    invoke-virtual {v15, v11}, Lp1/q;->l(Lc93/a;)V

    goto :goto_4

    :cond_5
    invoke-virtual {v15}, Lp1/q;->s0()V

    :goto_4
    sget-object v12, La3/k;->g:La3/i;

    invoke-static {v15, v12, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v6, La3/k;->f:La3/i;

    invoke-static {v15, v6, v9}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v9, La3/k;->j:La3/i;

    iget-boolean v13, v15, Lp1/q;->S:Z

    if-nez v13, :cond_6

    invoke-virtual {v15}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v13

    invoke-static {v8}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v5

    invoke-static {v13, v5}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_7

    :cond_6
    invoke-static {v8, v15, v8, v9}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_7
    sget-object v5, La3/k;->d:La3/i;

    invoke-static {v15, v5, v14}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    int-to-float v4, v4

    const/16 v8, 0x8

    int-to-float v13, v8

    mul-float v18, v4, v13

    const/4 v4, 0x2

    int-to-float v4, v4

    mul-float v17, v4, v13

    const/16 v20, 0x0

    const/16 v21, 0x8

    move/from16 v19, v17

    move-object/from16 v16, v10

    invoke-static/range {v16 .. v21}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v4

    move/from16 v14, v17

    const/high16 v8, 0x3f800000    # 1.0f

    move/from16 v17, v3

    float-to-double v2, v8

    const-wide/16 v18, 0x0

    cmpl-double v2, v2, v18

    if-lez v2, :cond_8

    :goto_5
    const/4 v2, 0x1

    goto :goto_6

    :cond_8
    const-string v2, "invalid weight; must be greater than zero"

    invoke-static {v2}, Lm0/a;->a(Ljava/lang/String;)V

    goto :goto_5

    :goto_6
    invoke-static {v4, v2, v8}, Ldc/b;->g(Landroidx/compose/ui/Modifier;ZF)Landroidx/compose/ui/Modifier;

    move-result-object v3

    const/4 v4, 0x0

    invoke-static {v4, v15, v2}, Lq83/g;->U(ILandroidx/compose/runtime/Composer;I)Lf0/r1;

    move-result-object v10

    const/16 v8, 0xe

    invoke-static {v3, v10, v8}, Lq83/g;->f0(Landroidx/compose/ui/Modifier;Lf0/r1;I)Landroidx/compose/ui/Modifier;

    move-result-object v3

    const/4 v8, 0x0

    const/4 v10, 0x0

    invoke-static {v3, v8, v2, v10}, Lgb1/c;->m(Landroidx/compose/ui/Modifier;FILjava/lang/Object;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    new-instance v2, Ll0/k;

    invoke-direct {v2, v14, v4, v10}, Ll0/k;-><init>(FZLc93/m;)V

    const/4 v4, 0x6

    invoke-static {v2, v7, v15, v4}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v2

    iget-wide v7, v15, Lp1/q;->T:J

    invoke-static {v7, v8}, Ljava/lang/Long;->hashCode(J)I

    move-result v7

    invoke-virtual {v15}, Lp1/q;->m()Lp1/p1;

    move-result-object v8

    invoke-static {v15, v3}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    invoke-virtual {v15}, Lp1/q;->i0()V

    iget-boolean v4, v15, Lp1/q;->S:Z

    if-eqz v4, :cond_9

    invoke-virtual {v15, v11}, Lp1/q;->l(Lc93/a;)V

    goto :goto_7

    :cond_9
    invoke-virtual {v15}, Lp1/q;->s0()V

    :goto_7
    invoke-static {v15, v12, v2}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v15, v6, v8}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v2, v15, Lp1/q;->S:Z

    if-nez v2, :cond_a

    invoke-virtual {v15}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    invoke-static {v7}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-static {v2, v4}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_b

    :cond_a
    invoke-static {v7, v15, v7, v9}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_b
    invoke-static {v15, v5, v3}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const v2, -0x1905a081

    invoke-virtual {v15, v2}, Lp1/q;->e0(I)V

    invoke-virtual {v0}, Lze0/c$e$c;->f()Ljava/util/List;

    move-result-object v2

    check-cast v2, Ljava/lang/Iterable;

    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_8
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    const/4 v4, 0x3

    if-eqz v3, :cond_c

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lkf0/k;

    invoke-static {}, Lmd0/c;->B0()Lm91/p;

    move-result-object v5

    sget v6, Lm91/p;->b:I

    shl-int/lit8 v9, v6, 0x3

    move-object v4, v10

    const/16 v10, 0xc

    const/4 v6, 0x0

    const/4 v7, 0x0

    move-object v12, v4

    move-object v8, v15

    const/high16 v11, 0x3f800000    # 1.0f

    const/16 v29, 0x6

    move-object v4, v3

    move-object/from16 v3, v16

    invoke-static/range {v4 .. v10}, Lm91/l;->r(Lm91/u;Lm91/p;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    move-object v10, v12

    goto :goto_8

    :cond_c
    move-object v12, v10

    move-object/from16 v3, v16

    const/4 v5, 0x0

    const/high16 v11, 0x3f800000    # 1.0f

    const/16 v29, 0x6

    invoke-virtual {v15, v5}, Lp1/q;->q(Z)V

    const/4 v2, 0x1

    invoke-virtual {v15, v2}, Lp1/q;->q(Z)V

    invoke-static {v11, v3}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v6

    invoke-static {v6, v12, v4}, Landroidx/compose/foundation/layout/d;->x(Landroidx/compose/ui/Modifier;Lb2/l;I)Landroidx/compose/ui/Modifier;

    move-result-object v23

    const-wide/high16 v6, 0x4004000000000000L    # 2.5

    double-to-float v6, v6

    mul-float v24, v6, v13

    const/16 v27, 0x0

    const/16 v28, 0x8

    move/from16 v26, v24

    move/from16 v25, v14

    invoke-static/range {v23 .. v28}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v6

    invoke-virtual {v0}, Lze0/c$e$c;->c()Lze0/c$b;

    move-result-object v7

    invoke-virtual {v7}, Lze0/c$b;->b()Ljava/lang/String;

    move-result-object v7

    invoke-static {v7}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v10

    and-int/lit8 v7, v17, 0x70

    const/16 v8, 0x20

    if-ne v7, v8, :cond_d

    move v9, v2

    goto :goto_9

    :cond_d
    move v9, v5

    :goto_9
    invoke-virtual {v15}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v14

    sget-object v2, Lp1/l;->a:Lp1/v0;

    if-nez v9, :cond_e

    if-ne v14, v2, :cond_f

    :cond_e
    new-instance v14, Lbf0/a;

    const/4 v9, 0x0

    invoke-direct {v14, v1, v9}, Lbf0/a;-><init>(Lkotlin/jvm/functions/Function1;I)V

    invoke-virtual {v15, v14}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_f
    move-object/from16 v17, v14

    check-cast v17, Lc93/a;

    sget v22, Lcom/whoop/design/util/TextResource;->$stable:I

    shl-int/lit8 v19, v22, 0x12

    const/16 v20, 0x0

    const/16 v21, 0x1fbe

    move v9, v5

    const/4 v5, 0x0

    move v14, v4

    move-object v4, v6

    const/4 v6, 0x0

    move/from16 v16, v7

    const/4 v7, 0x0

    move/from16 v18, v8

    const/4 v8, 0x0

    move/from16 v23, v9

    const/4 v9, 0x0

    move/from16 v25, v11

    const/4 v11, 0x0

    move-object/from16 v26, v12

    const/4 v12, 0x0

    move/from16 v27, v13

    const/4 v13, 0x0

    move/from16 v28, v14

    const/4 v14, 0x0

    move/from16 v30, v18

    move-object/from16 v18, v15

    const/4 v15, 0x0

    move/from16 v31, v16

    const/16 v16, 0x0

    move-object/from16 p2, v2

    move/from16 v2, v25

    move-object/from16 v0, v26

    move/from16 v1, v28

    invoke-static/range {v4 .. v21}, Lny0/z;->j(Landroidx/compose/ui/Modifier;ZZLjava/lang/Integer;Landroidx/compose/ui/Modifier;Lv41/r0;Lcom/whoop/design/util/TextResource;Lg1/u0;Li2/t;Lf0/t;FLl0/k1;Lb91/a;Lc93/a;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v15, v18

    invoke-static {v2, v3}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    invoke-static {v2, v0, v1}, Landroidx/compose/foundation/layout/d;->x(Landroidx/compose/ui/Modifier;Lb2/l;I)Landroidx/compose/ui/Modifier;

    move-result-object v0

    const-wide/high16 v1, 0x3ff8000000000000L    # 1.5

    double-to-float v1, v1

    mul-float v1, v1, v27

    move/from16 v6, v24

    invoke-static {v0, v6, v1, v6, v1}, Landroidx/compose/foundation/layout/a;->s(Landroidx/compose/ui/Modifier;FFFF)Landroidx/compose/ui/Modifier;

    move-result-object v4

    invoke-virtual/range {p0 .. p0}, Lze0/c$e$c;->d()Lze0/c$b;

    move-result-object v0

    invoke-virtual {v0}, Lze0/c$b;->b()Ljava/lang/String;

    move-result-object v0

    invoke-static {v0}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v6

    move/from16 v0, v31

    const/16 v8, 0x20

    if-ne v0, v8, :cond_10

    const/4 v12, 0x1

    goto :goto_a

    :cond_10
    move/from16 v12, v23

    :goto_a
    invoke-virtual {v15}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v0

    if-nez v12, :cond_12

    move-object/from16 v1, p2

    if-ne v0, v1, :cond_11

    goto :goto_b

    :cond_11
    move-object/from16 v2, p1

    goto :goto_c

    :cond_12
    :goto_b
    new-instance v0, Lbf0/a;

    const/4 v1, 0x1

    move-object/from16 v2, p1

    invoke-direct {v0, v2, v1}, Lbf0/a;-><init>(Lkotlin/jvm/functions/Function1;I)V

    invoke-virtual {v15, v0}, Lp1/q;->p0(Ljava/lang/Object;)V

    :goto_c
    move-object v14, v0

    check-cast v14, Lc93/a;

    shl-int/lit8 v16, v22, 0x6

    const/16 v17, 0x0

    const/16 v18, 0x3fa

    const/4 v5, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    const/4 v9, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const/4 v13, 0x0

    invoke-static/range {v4 .. v18}, Lny0/o0;->b(Landroidx/compose/ui/Modifier;ZLcom/whoop/design/util/TextResource;Lb91/a;Lg1/u0;Lf0/t;Ljava/lang/Integer;Landroidx/compose/ui/Modifier;ZLl0/k1;Lc93/a;Landroidx/compose/runtime/Composer;III)V

    const/4 v0, 0x1

    invoke-virtual {v15, v0}, Lp1/q;->q(Z)V

    goto :goto_d

    :cond_13
    move-object v2, v1

    invoke-virtual {v15}, Lp1/q;->X()V

    :goto_d
    invoke-virtual {v15}, Lp1/q;->u()Lp1/v1;

    move-result-object v0

    if-eqz v0, :cond_14

    new-instance v1, Lk;

    const/16 v3, 0xf

    move-object/from16 v4, p0

    move/from16 v5, p3

    invoke-direct {v1, v4, v2, v5, v3}, Lk;-><init>(Ljava/lang/Object;Ljava/lang/Object;II)V

    iput-object v1, v0, Lp1/v1;->d:Lc93/m;

    :cond_14
    return-void
.end method

.method private static final j(Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 1

    sget-object v0, Lze0/a$j;->a:Lze0/a$j;

    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final k(Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 1

    sget-object v0, Lze0/a$k;->a:Lze0/a$k;

    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final l(Lze0/c$e$c;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, Lp1/x;->L(I)I

    move-result p2

    invoke-static {p0, p1, p3, p2}, Lbf0/b;->i(Lze0/c$e$c;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method
