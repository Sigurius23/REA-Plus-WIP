.class public abstract Lo01/b;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u001a\'\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u000e\u0008\u0002\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u0002H\u0007\u00a2\u0006\u0004\u0008\u0005\u0010\u0006\u00a8\u0006\u0007"
    }
    d2 = {
        "Lo01/c;",
        "aiChatEntryViewState",
        "Lkotlin/Function0;",
        "Ll83/a0;",
        "onClick",
        "g",
        "(Lo01/c;Lc93/a;Landroidx/compose/runtime/Composer;II)V",
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
.method public static synthetic a(Lo01/c;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, Lo01/b;->l(Lo01/c;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lc93/a;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lo01/b;->k(Lc93/a;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c()Ll83/a0;
    .locals 1

    invoke-static {}, Lo01/b;->h()Ll83/a0;

    move-result-object v0

    return-object v0
.end method

.method public static synthetic d(Li2/g0;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lo01/b;->i(Li2/g0;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic e(Lo01/c;Li3/z;)Ll83/a0;
    .locals 0

    invoke-static {p0, p1}, Lo01/b;->j(Lo01/c;Li3/z;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic f(Lo01/c;Lc93/a;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static/range {p0 .. p5}, Lo01/b;->m(Lo01/c;Lc93/a;IILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final g(Lo01/c;Lc93/a;Landroidx/compose/runtime/Composer;II)V
    .locals 21
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lo01/c;",
            "Lc93/a;",
            "Landroidx/compose/runtime/Composer;",
            "II)V"
        }
    .end annotation

    move-object/from16 v1, p0

    const-string v0, "aiChatEntryViewState"

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v9, p2

    check-cast v9, Lp1/q;

    const v0, -0x326b9495

    invoke-virtual {v9, v0}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v0, p3, 0x6

    const/4 v2, 0x4

    if-nez v0, :cond_1

    invoke-virtual {v9, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    move v0, v2

    goto :goto_0

    :cond_0
    const/4 v0, 0x2

    :goto_0
    or-int v0, p3, v0

    goto :goto_1

    :cond_1
    move/from16 v0, p3

    :goto_1
    and-int/lit8 v4, p4, 0x2

    if-eqz v4, :cond_3

    or-int/lit8 v0, v0, 0x30

    :cond_2
    move-object/from16 v6, p1

    goto :goto_3

    :cond_3
    and-int/lit8 v6, p3, 0x30

    if-nez v6, :cond_2

    move-object/from16 v6, p1

    invoke-virtual {v9, v6}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v7

    if-eqz v7, :cond_4

    const/16 v7, 0x20

    goto :goto_2

    :cond_4
    const/16 v7, 0x10

    :goto_2
    or-int/2addr v0, v7

    :goto_3
    and-int/lit8 v7, v0, 0x13

    const/16 v8, 0x12

    const/4 v10, 0x0

    if-eq v7, v8, :cond_5

    const/4 v7, 0x1

    goto :goto_4

    :cond_5
    move v7, v10

    :goto_4
    and-int/lit8 v8, v0, 0x1

    invoke-virtual {v9, v8, v7}, Lp1/q;->U(IZ)Z

    move-result v7

    if-eqz v7, :cond_16

    sget-object v7, Lp1/l;->a:Lp1/v0;

    if-eqz v4, :cond_7

    invoke-virtual {v9}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    if-ne v4, v7, :cond_6

    new-instance v4, Lnx1/a;

    const/4 v6, 0x2

    invoke-direct {v4, v6}, Lnx1/a;-><init>(I)V

    invoke-virtual {v9, v4}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_6
    check-cast v4, Lc93/a;

    move-object v13, v4

    goto :goto_5

    :cond_7
    move-object v13, v6

    :goto_5
    invoke-virtual {v9}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    if-ne v4, v7, :cond_8

    invoke-static {v9}, Ld;->g(Lp1/q;)Lj0/j;

    move-result-object v4

    :cond_8
    move-object v15, v4

    check-cast v15, Lj0/i;

    const-wide/16 v3, 0x0

    const/4 v6, 0x7

    const/4 v8, 0x0

    invoke-static {v3, v4, v6, v10, v8}, Lg1/z4;->a(JIZF)Landroidx/compose/material/d;

    move-result-object v16

    invoke-virtual {v1}, Lo01/c;->i()Z

    move-result v3

    const/4 v4, 0x6

    if-eqz v3, :cond_9

    const v3, -0x753bf70a

    invoke-virtual {v9, v3}, Lp1/q;->e0(I)V

    invoke-virtual {v9, v10}, Lp1/q;->q(Z)V

    const/4 v3, 0x1

    goto :goto_6

    :cond_9
    const v3, -0x45d89fc6

    invoke-virtual {v9, v3}, Lp1/q;->e0(I)V

    sget-object v3, Lx81/d;->a:Lx81/d;

    invoke-virtual {v3, v9, v4}, Lx81/d;->c(Landroidx/compose/runtime/Composer;I)Lcom/whoop/data/repositories/FeatureFlagChecker;

    move-result-object v3

    const-string v6, "ai-chat-entry-gradient-border"

    invoke-interface {v3, v6}, Lcom/whoop/data/repositories/FeatureFlagChecker;->isFeatureEnabled(Ljava/lang/String;)Z

    move-result v3

    invoke-virtual {v9, v10}, Lp1/q;->q(Z)V

    :goto_6
    if-eqz v3, :cond_a

    const v3, -0x753a9c4e

    invoke-virtual {v9, v3}, Lp1/q;->e0(I)V

    invoke-virtual {v9, v10}, Lp1/q;->q(Z)V

    invoke-static {}, Lgb1/b0;->A()Li2/t;

    move-result-object v3

    move-object/from16 p1, v13

    goto :goto_7

    :cond_a
    const v3, -0x7539f361

    invoke-virtual {v9, v3}, Lp1/q;->e0(I)V

    new-instance v3, Li2/c1;

    sget-object v6, Lx81/d;->a:Lx81/d;

    invoke-virtual {v6, v9, v4}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v6

    move-object/from16 p1, v13

    invoke-virtual {v6}, Ly81/i;->w()J

    move-result-wide v12

    invoke-direct {v3, v12, v13}, Li2/c1;-><init>(J)V

    invoke-virtual {v9, v10}, Lp1/q;->q(Z)V

    :goto_7
    const/high16 v6, 0x3f800000    # 1.0f

    sget-object v8, Lb2/t;->w:Lb2/t;

    invoke-static {v6, v8}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v11

    sget-object v12, Ll0/a1;->x:Ll0/a1;

    invoke-static {v11, v12}, Landroidx/compose/foundation/layout/a;->j(Landroidx/compose/ui/Modifier;Ll0/a1;)Landroidx/compose/ui/Modifier;

    move-result-object v11

    sget-object v12, Lb2/e;->w:Lb2/m;

    invoke-static {v12, v10}, Ll0/q;->d(Lb2/h;Z)Ly2/r0;

    move-result-object v12

    iget-wide v13, v9, Lp1/q;->T:J

    invoke-static {v13, v14}, Ljava/lang/Long;->hashCode(J)I

    move-result v13

    invoke-virtual {v9}, Lp1/q;->m()Lp1/p1;

    move-result-object v14

    invoke-static {v9, v11}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v11

    sget-object v17, La3/l;->a:La3/k;

    invoke-virtual/range {v17 .. v17}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v4, La3/k;->b:La3/j;

    invoke-virtual {v9}, Lp1/q;->i0()V

    iget-boolean v5, v9, Lp1/q;->S:Z

    if-eqz v5, :cond_b

    invoke-virtual {v9, v4}, Lp1/q;->l(Lc93/a;)V

    goto :goto_8

    :cond_b
    invoke-virtual {v9}, Lp1/q;->s0()V

    :goto_8
    sget-object v4, La3/k;->g:La3/i;

    invoke-static {v9, v4, v12}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v4, La3/k;->f:La3/i;

    invoke-static {v9, v4, v14}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v4, La3/k;->j:La3/i;

    iget-boolean v5, v9, Lp1/q;->S:Z

    if-nez v5, :cond_c

    invoke-virtual {v9}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    invoke-static {v13}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v12

    invoke-static {v5, v12}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_d

    :cond_c
    invoke-static {v13, v9, v13, v4}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_d
    sget-object v4, La3/k;->d:La3/i;

    invoke-static {v9, v4, v11}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-virtual {v1}, Lo01/c;->i()Z

    move-result v4

    const/16 v5, 0xc

    if-eqz v4, :cond_10

    sget v4, Landroid/os/Build$VERSION;->SDK_INT:I

    const/16 v11, 0x1f

    if-ge v4, v11, :cond_e

    move v4, v10

    goto :goto_9

    :cond_e
    const/4 v4, 0x1

    :goto_9
    if-eqz v4, :cond_10

    const v4, 0x198d1943

    invoke-virtual {v9, v4}, Lp1/q;->e0(I)V

    const-string v4, "ONBOARDING GLOW"

    invoke-static {v8, v4}, Landroidx/compose/ui/platform/a;->a(Landroidx/compose/ui/Modifier;Ljava/lang/String;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    invoke-static {v6, v4}, Landroidx/compose/foundation/layout/d;->d(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    invoke-virtual {v9}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v11

    if-ne v11, v7, :cond_f

    new-instance v11, Lny0/m;

    const/4 v12, 0x6

    invoke-direct {v11, v12}, Lny0/m;-><init>(I)V

    invoke-virtual {v9, v11}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_f
    check-cast v11, Lkotlin/jvm/functions/Function1;

    invoke-static {v4, v11}, Landroidx/compose/ui/graphics/a;->a(Landroidx/compose/ui/Modifier;Lkotlin/jvm/functions/Function1;)Landroidx/compose/ui/Modifier;

    move-result-object v4

    int-to-float v2, v2

    int-to-float v11, v5

    invoke-static {v11}, Lt0/j;->e(F)Lt0/i;

    move-result-object v11

    invoke-static {v2, v4, v3, v11}, Lge3/g;->i(FLandroidx/compose/ui/Modifier;Li2/t;Li2/a1;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    invoke-static {v2, v9, v10}, Ll0/q;->a(Landroidx/compose/ui/Modifier;Landroidx/compose/runtime/Composer;I)V

    invoke-virtual {v9, v10}, Lp1/q;->q(Z)V

    goto :goto_a

    :cond_10
    const v2, 0x1992ef51

    invoke-virtual {v9, v2}, Lp1/q;->e0(I)V

    invoke-virtual {v9, v10}, Lp1/q;->q(Z)V

    :goto_a
    invoke-virtual {v9, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v2

    invoke-virtual {v9}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    if-nez v2, :cond_11

    if-ne v4, v7, :cond_12

    :cond_11
    new-instance v4, Lno0/e0;

    const/16 v2, 0xb

    invoke-direct {v4, v1, v2}, Lno0/e0;-><init>(Ljava/lang/Object;I)V

    invoke-virtual {v9, v4}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_12
    check-cast v4, Lkotlin/jvm/functions/Function1;

    invoke-static {v8, v10, v4}, Li3/n;->c(Landroidx/compose/ui/Modifier;ZLkotlin/jvm/functions/Function1;)Landroidx/compose/ui/Modifier;

    move-result-object v14

    and-int/lit8 v0, v0, 0x70

    const/16 v2, 0x20

    if-ne v0, v2, :cond_13

    const/4 v0, 0x1

    goto :goto_b

    :cond_13
    move v0, v10

    :goto_b
    invoke-virtual {v9}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    if-nez v0, :cond_15

    if-ne v2, v7, :cond_14

    goto :goto_c

    :cond_14
    move-object/from16 v12, p1

    goto :goto_d

    :cond_15
    :goto_c
    new-instance v2, Llq2/k;

    const/16 v0, 0x19

    move-object/from16 v12, p1

    invoke-direct {v2, v12, v0}, Llq2/k;-><init>(Lc93/a;I)V

    invoke-virtual {v9, v2}, Lp1/q;->p0(Ljava/lang/Object;)V

    :goto_d
    move-object/from16 v19, v2

    check-cast v19, Lc93/a;

    const/16 v20, 0x1c

    const/16 v17, 0x0

    const/16 v18, 0x0

    invoke-static/range {v14 .. v20}, Landroidx/compose/foundation/a;->e(Landroidx/compose/ui/Modifier;Lj0/i;Lf0/v0;ZLi3/i;Lc93/a;I)Landroidx/compose/ui/Modifier;

    move-result-object v0

    invoke-static {v6, v0}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    const/4 v2, 0x0

    const/4 v4, 0x3

    invoke-static {v0, v2, v4}, Landroidx/compose/foundation/layout/d;->x(Landroidx/compose/ui/Modifier;Lb2/l;I)Landroidx/compose/ui/Modifier;

    move-result-object v2

    int-to-float v0, v5

    invoke-static {v0}, Lt0/j;->e(F)Lt0/i;

    move-result-object v0

    sget-object v4, Lx81/d;->a:Lx81/d;

    const/4 v5, 0x6

    invoke-virtual {v4, v9, v5}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v4

    invoke-virtual {v4}, Ly81/i;->r()J

    move-result-wide v4

    int-to-float v7, v10

    new-instance v6, Lf0/t;

    const/4 v8, 0x2

    int-to-float v8, v8

    invoke-direct {v6, v8, v3}, Lf0/t;-><init>(FLi2/t;)V

    new-instance v3, Lmw1/a;

    const/16 v8, 0x17

    invoke-direct {v3, v1, v8}, Lmw1/a;-><init>(Ljava/lang/Object;I)V

    const v8, 0x6aaab054

    invoke-static {v8, v9, v3}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v8

    const/high16 v10, 0x1b0000

    const/16 v11, 0x8

    move-object v3, v0

    invoke-static/range {v2 .. v11}, Le93/b;->b(Landroidx/compose/ui/Modifier;Li2/a1;JLf0/t;FLc93/m;Landroidx/compose/runtime/Composer;II)V

    const/4 v0, 0x1

    invoke-virtual {v9, v0}, Lp1/q;->q(Z)V

    move-object v3, v12

    goto :goto_e

    :cond_16
    invoke-virtual {v9}, Lp1/q;->X()V

    move-object v3, v6

    :goto_e
    invoke-virtual {v9}, Lp1/q;->u()Lp1/v1;

    move-result-object v6

    if-eqz v6, :cond_17

    new-instance v0, Lno0/y0;

    const/4 v5, 0x4

    move/from16 v2, p3

    move/from16 v4, p4

    invoke-direct/range {v0 .. v5}, Lno0/y0;-><init>(Ljava/lang/Object;ILjava/lang/Object;II)V

    iput-object v0, v6, Lp1/v1;->d:Lc93/m;

    :cond_17
    return-void
.end method

.method private static final h()Ll83/a0;
    .locals 1

    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method

.method private static final i(Li2/g0;)Ll83/a0;
    .locals 3

    const-string v0, "$this$graphicsLayer"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    new-instance v0, Li2/r;

    const/high16 v1, 0x41f00000    # 30.0f

    const/4 v2, 0x3

    invoke-direct {v0, v1, v1, v2}, Li2/r;-><init>(FFI)V

    check-cast p0, Li2/x0;

    invoke-virtual {p0, v0}, Li2/x0;->g(Lal/a;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final j(Lo01/c;Li3/z;)Ll83/a0;
    .locals 1

    const-string v0, "$this$semantics"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-virtual {p0}, Lo01/c;->c()Ljava/lang/String;

    move-result-object p0

    invoke-static {p0, p1}, Li3/w;->e(Ljava/lang/String;Li3/z;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final k(Lc93/a;)Ll83/a0;
    .locals 0

    invoke-interface {p0}, Lc93/a;->invoke()Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final l(Lo01/c;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 30

    and-int/lit8 v0, p2, 0x3

    const/4 v1, 0x2

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-eq v0, v1, :cond_0

    move v0, v3

    goto :goto_0

    :cond_0
    move v0, v2

    :goto_0
    and-int/lit8 v1, p2, 0x1

    move-object/from16 v4, p1

    check-cast v4, Lp1/q;

    invoke-virtual {v4, v1, v0}, Lp1/q;->U(IZ)Z

    move-result v0

    if-eqz v0, :cond_6

    const/high16 v0, 0x3f800000    # 1.0f

    sget-object v1, Lb2/t;->w:Lb2/t;

    invoke-static {v0, v1}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    const-wide/high16 v5, 0x3ff8000000000000L    # 1.5

    double-to-float v5, v5

    const/16 v6, 0x8

    int-to-float v6, v6

    mul-float/2addr v5, v6

    invoke-static {v5, v0}, Landroidx/compose/foundation/layout/a;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    sget-object v5, Ll0/m;->a:Ll0/e;

    sget-object v6, Lb2/e;->K:Lb2/l;

    const/16 v7, 0x36

    invoke-static {v5, v6, v4, v7}, Ll0/p1;->a(Ll0/i;Lb2/g;Landroidx/compose/runtime/Composer;I)Ll0/r1;

    move-result-object v5

    iget-wide v6, v4, Lp1/q;->T:J

    invoke-static {v6, v7}, Ljava/lang/Long;->hashCode(J)I

    move-result v6

    invoke-virtual {v4}, Lp1/q;->m()Lp1/p1;

    move-result-object v7

    invoke-static {v4, v0}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    sget-object v8, La3/l;->a:La3/k;

    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v8, La3/k;->b:La3/j;

    invoke-virtual {v4}, Lp1/q;->i0()V

    iget-boolean v9, v4, Lp1/q;->S:Z

    if-eqz v9, :cond_1

    invoke-virtual {v4, v8}, Lp1/q;->l(Lc93/a;)V

    goto :goto_1

    :cond_1
    invoke-virtual {v4}, Lp1/q;->s0()V

    :goto_1
    sget-object v8, La3/k;->g:La3/i;

    invoke-static {v4, v8, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v5, La3/k;->f:La3/i;

    invoke-static {v4, v5, v7}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v5, La3/k;->j:La3/i;

    iget-boolean v7, v4, Lp1/q;->S:Z

    if-nez v7, :cond_2

    invoke-virtual {v4}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v7

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    invoke-static {v7, v8}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_3

    :cond_2
    invoke-static {v6, v4, v6, v5}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_3
    sget-object v5, La3/k;->d:La3/i;

    invoke-static {v4, v5, v0}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const/4 v0, 0x0

    invoke-static {v0, v4, v2, v3}, Lo01/d;->c(Lgz0/m0;Landroidx/compose/runtime/Composer;II)V

    const/16 v0, 0xa

    int-to-float v0, v0

    invoke-static {v0, v1}, Landroidx/compose/foundation/layout/d;->u(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    invoke-static {v4, v0}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    invoke-static {}, Lx81/e;->p()Lp1/t1;

    move-result-object v0

    invoke-virtual {v4, v0}, Lp1/q;->k(Lp1/t1;)Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Lcom/whoop/data/repositories/FeatureFlagChecker;

    const-string v1, "home-future-ia"

    invoke-interface {v0, v1}, Lcom/whoop/data/repositories/FeatureFlagChecker;->isFeatureEnabled(Ljava/lang/String;)Z

    move-result v1

    const/4 v5, 0x6

    if-nez v1, :cond_5

    sget-object v1, Lcom/whoop/data/repositories/OnboardingFeatureFlag;->HOME_ONBOARDING_FUTURE_IA:Lcom/whoop/data/repositories/OnboardingFeatureFlag;

    invoke-interface {v0, v1}, Lcom/whoop/data/repositories/FeatureFlagChecker;->isFeatureEnabled(Lcom/whoop/data/repositories/OnboardingFeatureFlag;)Z

    move-result v0

    if-eqz v0, :cond_4

    goto :goto_3

    :cond_4
    const v0, -0x7a8f9857

    invoke-virtual {v4, v0}, Lp1/q;->e0(I)V

    sget-object v0, Lx81/d;->a:Lx81/d;

    invoke-virtual {v0, v4, v5}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v0

    invoke-virtual {v0}, Ly81/i;->Y0()J

    move-result-wide v0

    invoke-virtual {v4, v2}, Lp1/q;->q(Z)V

    :goto_2
    move-wide v6, v0

    goto :goto_4

    :cond_5
    :goto_3
    const v0, -0x7a90ab77

    invoke-virtual {v4, v0}, Lp1/q;->e0(I)V

    sget-object v0, Lx81/d;->a:Lx81/d;

    invoke-static {v0, v4, v5, v2}, Lih0/d0;->D(Lx81/d;Lp1/q;IZ)J

    move-result-wide v0

    goto :goto_2

    :goto_4
    invoke-virtual/range {p0 .. p0}, Lo01/c;->h()Ljava/lang/String;

    move-result-object v0

    sget-object v1, Lx81/d;->a:Lx81/d;

    invoke-virtual {v1, v4, v5}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v1

    invoke-virtual {v1}, Lb91/d;->b()Lb91/a;

    move-result-object v24

    const/16 v28, 0x0

    const v29, 0x2fffa

    const/4 v5, 0x0

    const-wide/16 v8, 0x0

    const/4 v10, 0x0

    const/4 v11, 0x0

    const/4 v12, 0x0

    const-wide/16 v13, 0x0

    const/4 v15, 0x0

    const/16 v16, 0x0

    const-wide/16 v17, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v22, 0x0

    const/16 v23, 0x0

    const/16 v25, 0x0

    const/16 v27, 0x0

    move-object/from16 v26, v4

    move-object v4, v0

    invoke-static/range {v4 .. v29}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v0, v26

    invoke-virtual {v0, v3}, Lp1/q;->q(Z)V

    goto :goto_5

    :cond_6
    move-object v0, v4

    invoke-virtual {v0}, Lp1/q;->X()V

    :goto_5
    sget-object v0, Ll83/a0;->a:Ll83/a0;

    return-object v0
.end method

.method private static final m(Lo01/c;Lc93/a;IILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, Lp1/x;->L(I)I

    move-result p2

    invoke-static {p0, p1, p4, p2, p3}, Lo01/b;->g(Lo01/c;Lc93/a;Landroidx/compose/runtime/Composer;II)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method
