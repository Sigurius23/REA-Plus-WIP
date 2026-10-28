.class public abstract Lep1/d;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0003\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u001aC\u0010\u0008\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0014\u0008\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u00022\u0014\u0008\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00040\u0002H\u0007\u00a2\u0006\u0004\u0008\u0008\u0010\t\u001a\u0017\u0010\u000c\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\nH\u0003\u00a2\u0006\u0004\u0008\u000c\u0010\r\u00a8\u0006\u000e"
    }
    d2 = {
        "Lcp1/e;",
        "viewState",
        "Lkotlin/Function1;",
        "Lcp1/i;",
        "Ll83/a0;",
        "onViewEvent",
        "Lbp1/b;",
        "onNavigationEvent",
        "n",
        "(Lcp1/e;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V",
        "Lkd1/o;",
        "backgroundImage",
        "j",
        "(Lkd1/o;Landroidx/compose/runtime/Composer;I)V",
        "hormonal-insights_release"
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
.method public static synthetic a(Li2/g0;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lep1/d;->k(Li2/g0;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lcp1/e;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, Lep1/d;->q(Lcp1/e;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Lbp1/b;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lep1/d;->p(Lbp1/b;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Lk2/c;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lep1/d;->l(Lk2/c;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic e(Lcp1/e;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p6}, Lep1/d;->t(Lcp1/e;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic f(Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lep1/d;->s(Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic g(Lcp1/i;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lep1/d;->o(Lcp1/i;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic h(Lkd1/o;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lep1/d;->m(Lkd1/o;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic i(Lcp1/e;Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lep1/d;->r(Lcp1/e;Lkotlin/jvm/functions/Function1;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method private static final j(Lkd1/o;Landroidx/compose/runtime/Composer;I)V
    .locals 10

    move-object v3, p1

    check-cast v3, Lp1/q;

    const p1, 0x5ae71ffe

    invoke-virtual {v3, p1}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 p1, p2, 0x6

    const/4 v0, 0x2

    if-nez p1, :cond_2

    and-int/lit8 p1, p2, 0x8

    if-nez p1, :cond_0

    invoke-virtual {v3, p0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result p1

    goto :goto_0

    :cond_0
    invoke-virtual {v3, p0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result p1

    :goto_0
    if-eqz p1, :cond_1

    const/4 p1, 0x4

    goto :goto_1

    :cond_1
    move p1, v0

    :goto_1
    or-int/2addr p1, p2

    goto :goto_2

    :cond_2
    move p1, p2

    :goto_2
    and-int/lit8 v1, p1, 0x3

    if-eq v1, v0, :cond_3

    const/4 v0, 0x1

    goto :goto_3

    :cond_3
    const/4 v0, 0x0

    :goto_3
    and-int/lit8 v1, p1, 0x1

    invoke-virtual {v3, v1, v0}, Lp1/q;->U(IZ)Z

    move-result v0

    if-eqz v0, :cond_6

    sget v0, Lkd1/o;->a:I

    and-int/lit8 p1, p1, 0xe

    or-int v4, v0, p1

    const/4 v5, 0x3

    const/4 v1, 0x0

    const/4 v2, 0x0

    move-object v0, p0

    invoke-static/range {v0 .. v5}, Lkd1/p;->i(Lkd1/o;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)Ln2/a;

    move-result-object p0

    move-object p1, v0

    sget-object v0, Lb2/t;->w:Lb2/t;

    const/high16 v1, 0x3f800000    # 1.0f

    invoke-static {v1, v0}, Landroidx/compose/foundation/layout/d;->d(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    invoke-virtual {v3}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    sget-object v2, Lp1/l;->a:Lp1/v0;

    if-ne v1, v2, :cond_4

    new-instance v1, Lep1/a;

    const/4 v4, 0x5

    invoke-direct {v1, v4}, Lep1/a;-><init>(I)V

    invoke-virtual {v3, v1}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_4
    check-cast v1, Lkotlin/jvm/functions/Function1;

    invoke-static {v0, v1}, Landroidx/compose/ui/graphics/a;->a(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    invoke-virtual {v3}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    if-ne v1, v2, :cond_5

    new-instance v1, Lep1/a;

    const/4 v2, 0x6

    invoke-direct {v1, v2}, Lep1/a;-><init>(I)V

    invoke-virtual {v3, v1}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_5
    check-cast v1, Lkotlin/jvm/functions/Function1;

    invoke-static {v0, v1}, Landroidx/compose/ui/draw/a;->c(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    const/16 v0, 0x14

    int-to-float v0, v0

    const/16 v1, 0x8

    int-to-float v1, v1

    mul-float v8, v0, v1

    const/4 v9, 0x7

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    invoke-static/range {v4 .. v9}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v2

    const/16 v8, 0x6030

    const/16 v9, 0x68

    const/4 v1, 0x0

    move-object v7, v3

    const/4 v3, 0x0

    sget-object v4, Ly2/j;->a:Ly2/b1;

    const/4 v6, 0x0

    move-object v0, p0

    invoke-static/range {v0 .. v9}, Lpf/c;->c(Ln2/a;Ljava/lang/String;Landroidx/compose/ui/Modifier;Lb2/h;Ly2/k;FLi2/y;Landroidx/compose/runtime/Composer;II)V

    move-object v3, v7

    goto :goto_4

    :cond_6
    move-object p1, p0

    invoke-virtual {v3}, Lp1/q;->X()V

    :goto_4
    invoke-virtual {v3}, Lp1/q;->u()Lp1/v1;

    move-result-object p0

    if-eqz p0, :cond_7

    new-instance v0, Ld41/d;

    const/4 v1, 0x2

    invoke-direct {v0, p1, p2, v1}, Ld41/d;-><init>(Lkd1/o;II)V

    iput-object v0, p0, Lp1/v1;->d:Lc93/m;

    :cond_7
    return-void
.end method

.method private static final k(Li2/g0;)Ll83/a0;
    .locals 1

    const-string v0, "$this$graphicsLayer"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x1

    check-cast p0, Li2/x0;

    invoke-virtual {p0, v0}, Li2/x0;->f(I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final l(Lk2/c;)Ll83/a0;
    .locals 14

    const-string v0, "$this$drawWithContent"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object v0, p0

    check-cast v0, La3/p0;

    invoke-virtual {v0}, La3/p0;->a()V

    sget-object v0, Li2/t;->b:Li2/s;

    const/4 v1, 0x0

    invoke-static {v1}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v2

    sget-wide v3, Li2/x;->b:J

    new-instance v5, Li2/x;

    invoke-direct {v5, v3, v4}, Li2/x;-><init>(J)V

    new-instance v3, Ll83/k;

    invoke-direct {v3, v2, v5}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    const v2, 0x3f4ccccd    # 0.8f

    invoke-static {v2}, Ljava/lang/Float;->valueOf(F)Ljava/lang/Float;

    move-result-object v2

    sget-wide v4, Li2/x;->m:J

    new-instance v6, Li2/x;

    invoke-direct {v6, v4, v5}, Li2/x;-><init>(J)V

    new-instance v4, Ll83/k;

    invoke-direct {v4, v2, v6}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    filled-new-array {v3, v4}, [Ll83/k;

    move-result-object v2

    const/16 v3, 0xe

    invoke-static {v0, v2, v1, v1, v3}, Li2/s;->l(Li2/s;[Ll83/k;FFI)Li2/k0;

    move-result-object v5

    const/4 v12, 0x6

    const/16 v13, 0x3e

    const-wide/16 v6, 0x0

    const-wide/16 v8, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    move-object v4, p0

    invoke-static/range {v4 .. v13}, Lk2/e;->u(Lk2/e;Li2/t;JJFLk2/f;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final m(Lkd1/o;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p1, p1, 0x1

    invoke-static {p1}, Lp1/x;->L(I)I

    move-result p1

    invoke-static {p0, p2, p1}, Lep1/d;->j(Lkd1/o;Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static final n(Lcp1/e;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V
    .locals 48
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lcp1/e;",
            "Lkotlin/jvm/functions/Function1;",
            "Lkotlin/jvm/functions/Function1;",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    move-object/from16 v4, p0

    move/from16 v1, p4

    const-string v0, "viewState"

    invoke-static {v4, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v10, p3

    check-cast v10, Lp1/q;

    const v0, 0xab953ee

    invoke-virtual {v10, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, v1, 0x6

    if-nez v0, :cond_2

    and-int/lit8 v0, v1, 0x8

    if-nez v0, :cond_0

    invoke-virtual {v10, v4}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v0

    goto :goto_0

    :cond_0
    invoke-virtual {v10, v4}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v0

    :goto_0
    if-eqz v0, :cond_1

    const/4 v0, 0x4

    goto :goto_1

    :cond_1
    const/4 v0, 0x2

    :goto_1
    or-int/2addr v0, v1

    goto :goto_2

    :cond_2
    move v0, v1

    :goto_2
    and-int/lit8 v3, p5, 0x2

    if-eqz v3, :cond_4

    or-int/lit8 v0, v0, 0x30

    :cond_3
    move-object/from16 v5, p1

    goto :goto_4

    :cond_4
    and-int/lit8 v5, v1, 0x30

    if-nez v5, :cond_3

    move-object/from16 v5, p1

    invoke-virtual {v10, v5}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_5

    const/16 v6, 0x20

    goto :goto_3

    :cond_5
    const/16 v6, 0x10

    :goto_3
    or-int/2addr v0, v6

    :goto_4
    and-int/lit8 v6, p5, 0x4

    if-eqz v6, :cond_7

    or-int/lit16 v0, v0, 0x180

    :cond_6
    move-object/from16 v8, p2

    goto :goto_6

    :cond_7
    and-int/lit16 v8, v1, 0x180

    if-nez v8, :cond_6

    move-object/from16 v8, p2

    invoke-virtual {v10, v8}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v9

    if-eqz v9, :cond_8

    const/16 v9, 0x100

    goto :goto_5

    :cond_8
    const/16 v9, 0x80

    :goto_5
    or-int/2addr v0, v9

    :goto_6
    and-int/lit16 v9, v0, 0x93

    const/16 v11, 0x92

    const/4 v12, 0x0

    if-eq v9, v11, :cond_9

    const/4 v9, 0x1

    goto :goto_7

    :cond_9
    move v9, v12

    :goto_7
    and-int/lit8 v11, v0, 0x1

    invoke-virtual {v10, v11, v9}, Lp1/q;->U(IZ)Z

    move-result v9

    if-eqz v9, :cond_2e

    sget-object v9, Lp1/l;->a:Lp1/v0;

    if-eqz v3, :cond_b

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    if-ne v3, v9, :cond_a

    new-instance v3, Lep1/a;

    const/4 v5, 0x3

    invoke-direct {v3, v5}, Lep1/a;-><init>(I)V

    invoke-virtual {v10, v3}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_a
    check-cast v3, Lkotlin/jvm/functions/Function1;

    goto :goto_8

    :cond_b
    move-object v3, v5

    :goto_8
    if-eqz v6, :cond_d

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    if-ne v5, v9, :cond_c

    new-instance v5, Lep1/a;

    const/4 v6, 0x4

    invoke-direct {v5, v6}, Lep1/a;-><init>(I)V

    invoke-virtual {v10, v5}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_c
    check-cast v5, Lkotlin/jvm/functions/Function1;

    goto :goto_9

    :cond_d
    move-object v5, v8

    :goto_9
    const/high16 v6, 0x3f800000    # 1.0f

    sget-object v8, Lb2/t;->w:Lb2/t;

    invoke-static {v6, v8}, Landroidx/compose/foundation/layout/d;->d(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v11

    invoke-static {v11}, Lgb1/b0;->b0(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v11

    invoke-static {v11}, Ll0/f;->k(Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v11

    sget-object v13, Lb2/e;->w:Lb2/m;

    invoke-static {v13, v12}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v13

    iget-wide v14, v10, Lp1/q;->T:J

    invoke-static {v14, v15}, Ljava/lang/Long;->hashCode(J)I

    move-result v14

    invoke-virtual {v10}, Lp1/q;->m()Lp1/p1;

    move-result-object v15

    invoke-static {v10, v11}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v11

    sget-object v17, La3/l;->a:La3/k;

    invoke-virtual/range {v17 .. v17}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v7, La3/k;->b:La3/j;

    invoke-virtual {v10}, Lp1/q;->i0()V

    iget-boolean v2, v10, Lp1/q;->S:Z

    if-eqz v2, :cond_e

    invoke-virtual {v10, v7}, Lp1/q;->l(Lc93/a;)V

    goto :goto_a

    :cond_e
    invoke-virtual {v10}, Lp1/q;->s0()V

    :goto_a
    sget-object v2, La3/k;->g:La3/i;

    invoke-static {v10, v2, v13}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v13, La3/k;->f:La3/i;

    invoke-static {v10, v13, v15}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v15, La3/k;->j:La3/i;

    iget-boolean v6, v10, Lp1/q;->S:Z

    if-nez v6, :cond_f

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v6

    invoke-static {v14}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v12

    invoke-static {v6, v12}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_10

    :cond_f
    invoke-static {v14, v10, v14, v15}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_10
    sget-object v14, La3/k;->d:La3/i;

    invoke-static {v10, v14, v11}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual {v4}, Lcp1/e;->j()Z

    move-result v6

    if-eqz v6, :cond_12

    const v6, 0x2f2d2135

    invoke-virtual {v10, v6}, Lp1/q;->e0(I)V

    invoke-virtual {v4}, Lcp1/e;->d()Lkd1/o;

    move-result-object v6

    if-nez v6, :cond_11

    const v6, -0x4988fa94

    invoke-virtual {v10, v6}, Lp1/q;->e0(I)V

    const/4 v11, 0x0

    :goto_b
    invoke-virtual {v10, v11}, Lp1/q;->q(Z)V

    goto :goto_c

    :cond_11
    const/4 v11, 0x0

    const v12, -0x4988fa93

    invoke-virtual {v10, v12}, Lp1/q;->e0(I)V

    sget v12, Lkd1/o;->a:I

    invoke-static {v6, v10, v12}, Lep1/d;->j(Lkd1/o;Landroidx/compose/runtime/Composer;I)V

    goto :goto_b

    :goto_c
    invoke-virtual {v10, v11}, Lp1/q;->q(Z)V

    :goto_d
    const/high16 v6, 0x3f800000    # 1.0f

    goto :goto_e

    :cond_12
    const/4 v11, 0x0

    const v6, -0x49882ae6

    invoke-virtual {v10, v6}, Lp1/q;->e0(I)V

    invoke-virtual {v10, v11}, Lp1/q;->q(Z)V

    goto :goto_d

    :goto_e
    invoke-static {v6, v8}, Landroidx/compose/foundation/layout/d;->d(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v12

    move-object/from16 p1, v8

    sget-object v8, Ll0/m;->c:Ll0/g;

    sget-object v1, Lb2/e;->M:Lb2/k;

    invoke-static {v8, v1, v10, v11}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v6

    move-object/from16 p2, v12

    iget-wide v11, v10, Lp1/q;->T:J

    invoke-static {v11, v12}, Ljava/lang/Long;->hashCode(J)I

    move-result v11

    invoke-virtual {v10}, Lp1/q;->m()Lp1/p1;

    move-result-object v12

    move-object/from16 v20, v8

    move-object/from16 v8, p2

    invoke-static {v10, v8}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v8

    invoke-virtual {v10}, Lp1/q;->i0()V

    move-object/from16 p2, v1

    iget-boolean v1, v10, Lp1/q;->S:Z

    if-eqz v1, :cond_13

    invoke-virtual {v10, v7}, Lp1/q;->l(Lc93/a;)V

    goto :goto_f

    :cond_13
    invoke-virtual {v10}, Lp1/q;->s0()V

    :goto_f
    invoke-static {v10, v2, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v10, v13, v12}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v1, v10, Lp1/q;->S:Z

    if-nez v1, :cond_14

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v1

    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-static {v1, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_15

    :cond_14
    invoke-static {v11, v10, v11, v15}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_15
    invoke-static {v10, v14, v8}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual {v4}, Lcp1/e;->f()Lcom/whoop/design/util/TextResource;

    move-result-object v1

    invoke-virtual {v4}, Lcp1/e;->e()Lcom/whoop/design/util/TextResource;

    move-result-object v6

    invoke-virtual {v4}, Lcp1/e;->b()Lcom/whoop/hormonalinsights/postpartum/domain/models/HormonalScreenId;

    move-result-object v8

    sget-object v11, Lcom/whoop/hormonalinsights/postpartum/domain/models/HormonalScreenId;->INITIAL_SCREEN:Lcom/whoop/hormonalinsights/postpartum/domain/models/HormonalScreenId;

    if-ne v8, v11, :cond_16

    sget-object v8, Lx81/d;->a:Lx81/d;

    invoke-static {v8}, Lyb0/f;->a(Lx81/d;)I

    move-result v8

    goto :goto_10

    :cond_16
    sget-object v8, Lx81/d;->a:Lx81/d;

    invoke-static {v8}, Lih0/d0;->C(Lx81/d;)I

    move-result v8

    :goto_10
    and-int/lit8 v11, v0, 0xe

    const/4 v12, 0x4

    if-eq v11, v12, :cond_18

    and-int/lit8 v12, v0, 0x8

    if-eqz v12, :cond_17

    invoke-virtual {v10, v4}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v12

    if-eqz v12, :cond_17

    goto :goto_11

    :cond_17
    const/4 v12, 0x0

    goto :goto_12

    :cond_18
    :goto_11
    const/4 v12, 0x1

    :goto_12
    move-object/from16 v21, v1

    and-int/lit16 v1, v0, 0x380

    move/from16 v31, v0

    const/16 v0, 0x100

    if-ne v1, v0, :cond_19

    const/4 v0, 0x1

    goto :goto_13

    :cond_19
    const/4 v0, 0x0

    :goto_13
    or-int/2addr v0, v12

    and-int/lit8 v1, v31, 0x70

    const/16 v12, 0x20

    if-ne v1, v12, :cond_1a

    const/16 v17, 0x1

    goto :goto_14

    :cond_1a
    const/16 v17, 0x0

    :goto_14
    or-int v0, v0, v17

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v12

    if-nez v0, :cond_1b

    if-ne v12, v9, :cond_1c

    :cond_1b
    new-instance v12, Ld30/r;

    const/4 v0, 0x7

    invoke-direct {v12, v4, v5, v3, v0}, Ld30/r;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    invoke-virtual {v10, v12}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_1c
    check-cast v12, Lc93/a;

    sget v0, Lcom/whoop/design/util/TextResource;->$stable:I

    shl-int/lit8 v32, v0, 0x3

    move-object/from16 v27, v10

    move-object v10, v12

    or-int v12, v0, v32

    move-object/from16 v17, v13

    const/16 v13, 0x18

    move-object/from16 v22, v7

    move v7, v8

    const/4 v8, 0x0

    move-object/from16 v23, v9

    const/4 v9, 0x0

    move/from16 v35, v0

    move/from16 p3, v1

    move-object/from16 v33, v5

    move/from16 v34, v11

    move-object/from16 v18, v14

    move-object/from16 v1, v17

    move-object/from16 v4, v20

    move-object/from16 v5, v21

    move-object/from16 v36, v23

    move-object/from16 v11, v27

    const/high16 v0, 0x3f800000    # 1.0f

    const/16 v17, 0x20

    move-object/from16 v14, p1

    move-object/from16 p1, v3

    move-object/from16 v3, v22

    invoke-static/range {v5 .. v13}, Lep1/s;->e(Lcom/whoop/design/util/TextResource;Lcom/whoop/design/util/TextResource;ILcom/whoop/design/util/TextResource;Lc93/a;Lc93/a;Landroidx/compose/runtime/Composer;II)V

    move-object v10, v11

    sget-object v11, Ll0/z;->a:Ll0/z;

    const/4 v5, 0x1

    invoke-virtual {v11, v14, v5, v0}, Ll0/z;->c(Landroidx/compose/ui/Modifier;ZF)Landroidx/compose/ui/Modifier;

    move-result-object v6

    invoke-static {v0, v6}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v19

    const-wide/high16 v5, 0x4004000000000000L    # 2.5

    double-to-float v5, v5

    const/16 v12, 0x8

    int-to-float v13, v12

    mul-float v20, v5, v13

    const/16 v23, 0x0

    const/16 v24, 0xa

    const/16 v21, 0x0

    move/from16 v22, v20

    invoke-static/range {v19 .. v24}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v5

    move/from16 v37, v20

    const/4 v6, 0x1

    const/4 v7, 0x0

    invoke-static {v7, v10, v6}, Lq83/g;->U(ILandroidx/compose/runtime/Composer;I)Lf0/r1;

    move-result-object v8

    const/16 v6, 0xe

    invoke-static {v5, v8, v6}, Lq83/g;->f0(Landroidx/compose/ui/Modifier;Lf0/r1;I)Landroidx/compose/ui/Modifier;

    move-result-object v5

    const/16 v6, 0x36

    move-object/from16 v8, p2

    invoke-static {v4, v8, v10, v6}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v6

    move/from16 v19, v13

    iget-wide v12, v10, Lp1/q;->T:J

    invoke-static {v12, v13}, Ljava/lang/Long;->hashCode(J)I

    move-result v9

    invoke-virtual {v10}, Lp1/q;->m()Lp1/p1;

    move-result-object v12

    invoke-static {v10, v5}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v5

    invoke-virtual {v10}, Lp1/q;->i0()V

    iget-boolean v13, v10, Lp1/q;->S:Z

    if-eqz v13, :cond_1d

    invoke-virtual {v10, v3}, Lp1/q;->l(Lc93/a;)V

    goto :goto_15

    :cond_1d
    invoke-virtual {v10}, Lp1/q;->s0()V

    :goto_15
    invoke-static {v10, v2, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v10, v1, v12}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v6, v10, Lp1/q;->S:Z

    if-nez v6, :cond_1f

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v6

    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v12

    invoke-static {v6, v12}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v6

    if-nez v6, :cond_1e

    goto :goto_17

    :cond_1e
    :goto_16
    move-object/from16 v12, v18

    goto :goto_18

    :cond_1f
    :goto_17
    invoke-static {v9, v10, v9, v15}, Ld;->y(ILp1/q;ILa3/i;)V

    goto :goto_16

    :goto_18
    invoke-static {v10, v12, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual/range {p0 .. p0}, Lcp1/e;->j()Z

    move-result v5

    if-nez v5, :cond_21

    const v5, -0x5822d410

    invoke-virtual {v10, v5}, Lp1/q;->e0(I)V

    const/4 v13, 0x1

    invoke-virtual {v11, v14, v13, v0}, Ll0/z;->c(Landroidx/compose/ui/Modifier;ZF)Landroidx/compose/ui/Modifier;

    move-result-object v5

    invoke-static {v10, v5}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    invoke-virtual/range {p0 .. p0}, Lcp1/e;->d()Lkd1/o;

    move-result-object v5

    if-nez v5, :cond_20

    const v5, -0x58215b1a

    invoke-virtual {v10, v5}, Lp1/q;->e0(I)V

    invoke-virtual {v10, v7}, Lp1/q;->q(Z)V

    move-object/from16 v39, v1

    move-object/from16 p2, v2

    move-object/from16 v43, v3

    move-object/from16 v38, v8

    move-object v3, v11

    move-object/from16 v40, v12

    move v1, v13

    move-object v2, v14

    move-object/from16 v18, v15

    move/from16 v41, v19

    const/16 v42, 0x8

    move v15, v7

    goto :goto_19

    :cond_20
    const v6, -0x58215b19

    invoke-virtual {v10, v6}, Lp1/q;->e0(I)V

    invoke-static {v0, v14}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v6

    const/16 v9, 0x3c

    int-to-float v9, v9

    const/4 v7, 0x4

    int-to-float v13, v7

    mul-float/2addr v9, v13

    invoke-static {v9, v6}, Landroidx/compose/foundation/layout/d;->h(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v13

    sget v9, Lkd1/o;->a:I

    move-object/from16 v27, v10

    const/4 v10, 0x3

    const/4 v6, 0x0

    const/4 v7, 0x0

    move-object/from16 v38, v8

    move-object/from16 v18, v15

    move-object/from16 v8, v27

    const/4 v15, 0x0

    invoke-static/range {v5 .. v10}, Lkd1/p;->i(Lkd1/o;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)Ln2/a;

    move-result-object v5

    move-object v7, v13

    const/16 v13, 0x1b0

    move-object v6, v14

    const/16 v14, 0x78

    move-object v8, v6

    const/4 v6, 0x0

    move-object v9, v8

    const/4 v8, 0x0

    move-object v10, v9

    const/4 v9, 0x0

    move-object/from16 v20, v10

    const/4 v10, 0x0

    move-object/from16 v21, v11

    const/4 v11, 0x0

    move-object/from16 v39, v1

    move-object/from16 p2, v2

    move-object/from16 v43, v3

    move-object/from16 v40, v12

    move/from16 v41, v19

    move-object/from16 v2, v20

    move-object/from16 v3, v21

    move-object/from16 v12, v27

    const/4 v1, 0x1

    const/16 v42, 0x8

    invoke-static/range {v5 .. v14}, Lpf/c;->c(Ln2/a;Ljava/lang/String;Landroidx/compose/ui/Modifier;Lb2/h;Ly2/k;FLi2/y;Landroidx/compose/runtime/Composer;II)V

    move-object v10, v12

    invoke-virtual {v10, v15}, Lp1/q;->q(Z)V

    :goto_19
    invoke-virtual {v10, v15}, Lp1/q;->q(Z)V

    goto :goto_1a

    :cond_21
    move-object/from16 v39, v1

    move-object/from16 p2, v2

    move-object/from16 v43, v3

    move-object/from16 v38, v8

    move-object v3, v11

    move-object/from16 v40, v12

    move-object v2, v14

    move-object/from16 v18, v15

    move/from16 v41, v19

    const/4 v1, 0x1

    const/16 v42, 0x8

    move v15, v7

    const v5, -0x581befba

    invoke-virtual {v10, v5}, Lp1/q;->e0(I)V

    invoke-virtual {v10, v15}, Lp1/q;->q(Z)V

    :goto_1a
    invoke-virtual {v3, v2, v1, v0}, Ll0/z;->c(Landroidx/compose/ui/Modifier;ZF)Landroidx/compose/ui/Modifier;

    move-result-object v3

    invoke-static {v10, v3}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    invoke-virtual/range {p0 .. p0}, Lcp1/e;->i()Lcom/whoop/design/util/TextResource;

    move-result-object v3

    move/from16 v5, v35

    invoke-static {v3, v10, v5}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v3

    sget-object v6, Lx81/d;->a:Lx81/d;

    sget v7, Lx81/d;->b:I

    invoke-virtual {v6, v10, v7}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v8

    invoke-virtual {v8}, Lb91/d;->N()Lb91/a;

    move-result-object v25

    invoke-virtual {v6, v10, v7}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v8

    invoke-virtual {v8}, Ly81/i;->y()J

    move-result-wide v8

    sget v11, Lb91/a;->d:I

    shl-int/lit8 v29, v11, 0x12

    const v30, 0x2fffa

    move-object v11, v6

    const/4 v6, 0x0

    move v12, v7

    move-wide v7, v8

    move-object/from16 v27, v10

    const-wide/16 v9, 0x0

    move-object v13, v11

    const/4 v11, 0x0

    move v14, v12

    const/4 v12, 0x0

    move-object/from16 v16, v13

    const/4 v13, 0x0

    move/from16 v19, v14

    move/from16 v20, v15

    const-wide/16 v14, 0x0

    move-object/from16 v21, v16

    const/16 v16, 0x0

    move/from16 v22, v17

    const/16 v17, 0x0

    move-object/from16 v23, v18

    move/from16 v24, v19

    const-wide/16 v18, 0x0

    move/from16 v26, v20

    const/16 v20, 0x0

    move-object/from16 v28, v21

    const/16 v21, 0x0

    move/from16 v35, v22

    const/16 v22, 0x0

    move-object/from16 v44, v23

    const/16 v23, 0x0

    move/from16 v45, v24

    const/16 v24, 0x0

    move/from16 v46, v26

    const/16 v26, 0x0

    move-object/from16 v47, v28

    const/16 v28, 0x0

    move v0, v5

    move-object/from16 v1, v47

    move-object v5, v3

    move/from16 v3, v45

    move-object/from16 v45, v44

    invoke-static/range {v5 .. v30}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v10, v27

    const/4 v12, 0x4

    int-to-float v5, v12

    mul-float v6, v5, v5

    invoke-static {v6, v2}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v6

    invoke-static {v10, v6}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    invoke-virtual/range {p0 .. p0}, Lcp1/e;->c()Lcom/whoop/design/util/TextResource;

    move-result-object v6

    invoke-static {v6, v10, v0}, Lcom/whoop/design/util/b;->h(Lcom/whoop/design/util/TextResource;Landroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v6

    invoke-virtual {v1, v10, v3}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v7

    invoke-virtual {v7}, Lb91/d;->a()Lb91/a;

    move-result-object v25

    invoke-virtual {v1, v10, v3}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v1

    invoke-virtual {v1}, Ly81/i;->c1()J

    move-result-wide v7

    move v1, v5

    move-object v5, v6

    const/4 v6, 0x0

    const-wide/16 v9, 0x0

    const/4 v12, 0x0

    invoke-static/range {v5 .. v30}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v10, v27

    const/4 v13, 0x1

    invoke-virtual {v10, v13}, Lp1/q;->q(Z)V

    const/high16 v6, 0x3f800000    # 1.0f

    invoke-static {v6, v2}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v20

    invoke-virtual/range {p0 .. p0}, Lcp1/e;->h()Lcp1/c;

    move-result-object v3

    const/4 v5, 0x3

    if-eqz v3, :cond_22

    int-to-float v3, v5

    mul-float v3, v3, v41

    move/from16 v23, v3

    goto :goto_1b

    :cond_22
    move/from16 v23, v37

    :goto_1b
    int-to-float v3, v5

    mul-float v24, v3, v41

    const/16 v25, 0x2

    const/16 v22, 0x0

    move/from16 v21, v37

    invoke-static/range {v20 .. v25}, Landroidx/compose/foundation/layout/a;->t(Landroidx/compose/ui/Modifier;FFFFI)Landroidx/compose/ui/Modifier;

    move-result-object v3

    move-object/from16 v8, v38

    const/4 v15, 0x0

    invoke-static {v4, v8, v10, v15}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v4

    iget-wide v5, v10, Lp1/q;->T:J

    invoke-static {v5, v6}, Ljava/lang/Long;->hashCode(J)I

    move-result v5

    invoke-virtual {v10}, Lp1/q;->m()Lp1/p1;

    move-result-object v6

    invoke-static {v10, v3}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    invoke-virtual {v10}, Lp1/q;->i0()V

    iget-boolean v7, v10, Lp1/q;->S:Z

    if-eqz v7, :cond_23

    move-object/from16 v7, v43

    invoke-virtual {v10, v7}, Lp1/q;->l(Lc93/a;)V

    :goto_1c
    move-object/from16 v7, p2

    goto :goto_1d

    :cond_23
    invoke-virtual {v10}, Lp1/q;->s0()V

    goto :goto_1c

    :goto_1d
    invoke-static {v10, v7, v4}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    move-object/from16 v4, v39

    invoke-static {v10, v4, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v4, v10, Lp1/q;->S:Z

    if-nez v4, :cond_24

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-static {v4, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_25

    :cond_24
    move-object/from16 v4, v45

    goto :goto_1f

    :cond_25
    :goto_1e
    move-object/from16 v12, v40

    goto :goto_20

    :goto_1f
    invoke-static {v5, v10, v5, v4}, Ld;->y(ILp1/q;ILa3/i;)V

    goto :goto_1e

    :goto_20
    invoke-static {v10, v12, v3}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const/16 v3, 0xb

    int-to-float v3, v3

    invoke-static {v3, v1, v2, v10}, Lih0/d0;->u(FFLb2/t;Lp1/q;)V

    const/high16 v6, 0x3f800000    # 1.0f

    invoke-static {v6, v2}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v7

    invoke-virtual/range {p0 .. p0}, Lcp1/e;->h()Lcp1/c;

    move-result-object v5

    invoke-virtual/range {p0 .. p0}, Lcp1/e;->a()Lcom/whoop/design/util/TextResource;

    move-result-object v6

    move/from16 v1, v34

    const/4 v12, 0x4

    if-eq v1, v12, :cond_27

    and-int/lit8 v1, v31, 0x8

    move-object/from16 v4, p0

    if-eqz v1, :cond_26

    invoke-virtual {v10, v4}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_26

    goto :goto_22

    :cond_26
    move v14, v15

    :goto_21
    move/from16 v1, p3

    const/16 v2, 0x20

    goto :goto_23

    :cond_27
    move-object/from16 v4, p0

    :goto_22
    const/4 v14, 0x1

    goto :goto_21

    :goto_23
    if-ne v1, v2, :cond_28

    const/4 v3, 0x1

    goto :goto_24

    :cond_28
    move v3, v15

    :goto_24
    or-int/2addr v3, v14

    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v8

    if-nez v3, :cond_2a

    move-object/from16 v3, v36

    if-ne v8, v3, :cond_29

    goto :goto_25

    :cond_29
    move-object/from16 v13, p1

    goto :goto_26

    :cond_2a
    move-object/from16 v3, v36

    :goto_25
    new-instance v8, Ld30/l;

    const/16 v9, 0x11

    move-object/from16 v13, p1

    invoke-direct {v8, v9, v4, v13}, Ld30/l;-><init>(ILjava/lang/Object;Ljava/lang/Object;)V

    invoke-virtual {v10, v8}, Lp1/q;->p0(Ljava/lang/Object;)V

    :goto_26
    move-object v9, v8

    check-cast v9, Lc93/a;

    or-int/lit16 v0, v0, 0x180

    or-int v11, v0, v32

    const/16 v12, 0x8

    const/4 v8, 0x0

    invoke-static/range {v5 .. v12}, Lep1/e;->c(Lcp1/c;Lcom/whoop/design/util/TextResource;Landroidx/compose/ui/Modifier;ZLc93/a;Landroidx/compose/runtime/Composer;II)V

    const/4 v5, 0x1

    invoke-static {v10, v5, v5, v5}, Lm4/a;->y(Lp1/q;ZZZ)V

    if-ne v1, v2, :cond_2b

    const/4 v14, 0x1

    goto :goto_27

    :cond_2b
    move v14, v15

    :goto_27
    invoke-virtual {v10}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v0

    if-nez v14, :cond_2c

    if-ne v0, v3, :cond_2d

    :cond_2c
    new-instance v0, Leo2/j;

    const/4 v1, 0x5

    invoke-direct {v0, v13, v1}, Leo2/j;-><init>(Lkotlin/jvm/functions/Function1;I)V

    invoke-virtual {v10, v0}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_2d
    check-cast v0, Lc93/a;

    const/4 v5, 0x1

    invoke-static {v0, v15, v10, v15, v5}, Lio/sentry/config/a;->c(Lc93/a;ZLandroidx/compose/runtime/Composer;II)V

    move-object v6, v13

    move-object/from16 v5, v33

    goto :goto_28

    :cond_2e
    invoke-virtual {v10}, Lp1/q;->X()V

    move-object v6, v5

    move-object v5, v8

    :goto_28
    invoke-virtual {v10}, Lp1/q;->u()Lp1/v1;

    move-result-object v7

    if-eqz v7, :cond_2f

    new-instance v0, Le11/b;

    const/16 v3, 0xf

    move/from16 v1, p4

    move/from16 v2, p5

    invoke-direct/range {v0 .. v6}, Le11/b;-><init>(IIILjava/lang/Object;Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)V

    iput-object v0, v7, Lp1/v1;->d:Lc93/m;

    :cond_2f
    return-void
.end method

.method private static final o(Lcp1/i;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final p(Lbp1/b;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final q(Lcp1/e;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 1

    invoke-virtual {p0}, Lcp1/e;->b()Lcom/whoop/hormonalinsights/postpartum/domain/models/HormonalScreenId;

    move-result-object p0

    sget-object v0, Lcom/whoop/hormonalinsights/postpartum/domain/models/HormonalScreenId;->INITIAL_SCREEN:Lcom/whoop/hormonalinsights/postpartum/domain/models/HormonalScreenId;

    if-ne p0, v0, :cond_0

    sget-object p0, Lbp1/b$a;->a:Lbp1/b$a;

    invoke-interface {p1, p0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_0
    sget-object p0, Lcp1/i$a;->a:Lcp1/i$a;

    invoke-interface {p2, p0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :goto_0
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final r(Lcp1/e;Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 11

    invoke-virtual {p0}, Lcp1/e;->b()Lcom/whoop/hormonalinsights/postpartum/domain/models/HormonalScreenId;

    move-result-object v0

    sget-object v1, Lcom/whoop/hormonalinsights/postpartum/domain/models/HormonalScreenId;->NEITHER:Lcom/whoop/hormonalinsights/postpartum/domain/models/HormonalScreenId;

    if-ne v0, v1, :cond_0

    sget-object p0, Lcp1/i$b;->a:Lcp1/i$b;

    invoke-interface {p1, p0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    goto :goto_0

    :cond_0
    new-instance v0, Lcp1/i$d;

    invoke-virtual {p0}, Lcp1/e;->g()Lcom/whoop/hormonalinsights/postpartum/domain/models/HormonalScreenId;

    move-result-object p0

    new-instance v1, Lzo1/b;

    const/16 v9, 0x7f

    const/4 v10, 0x0

    const/4 v2, 0x0

    const/4 v3, 0x0

    const/4 v4, 0x0

    const/4 v5, 0x0

    const/4 v6, 0x0

    const/4 v7, 0x0

    const/4 v8, 0x0

    invoke-direct/range {v1 .. v10}, Lzo1/b;-><init>(Ljava/util/List;Ljava/util/List;Ljava/lang/Integer;Lcom/whoop/hormonalinsights/onboarding/domain/models/MciInterest;Lcom/whoop/hormonalinsights/onboarding/domain/models/ContraceptionType;Ljava/util/List;Ljava/util/List;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    invoke-direct {v0, p0, v1}, Lcp1/i$d;-><init>(Lcom/whoop/hormonalinsights/postpartum/domain/models/HormonalScreenId;Lzo1/b;)V

    invoke-interface {p1, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    :goto_0
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final s(Lkotlin/jvm/functions/Function1;)Ll83/a0;
    .locals 1

    sget-object v0, Lcp1/i$a;->a:Lcp1/i$a;

    invoke-interface {p0, v0}, Lkotlin/jvm/functions/Function1;->invoke(Ljava/lang/Object;)Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final t(Lcp1/e;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 6

    or-int/lit8 p3, p3, 0x1

    invoke-static {p3}, Lp1/x;->L(I)I

    move-result v4

    move-object v0, p0

    move-object v1, p1

    move-object v2, p2

    move v5, p4

    move-object v3, p5

    invoke-static/range {v0 .. v5}, Lep1/d;->n(Lcp1/e;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method
