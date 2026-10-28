.class public abstract Lcp0/k;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u001a\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0008\u0006\n\u0002\u0010\u000b\n\u0002\u0008\u0005\u001a%\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u000c\u0010\u0004\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u0002H\u0001\u00a2\u0006\u0004\u0008\u0005\u0010\u0006\u001a\u001d\u0010\u0008\u001a\u00020\u00032\u000c\u0010\u0007\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u0002H\u0001\u00a2\u0006\u0004\u0008\u0008\u0010\t\u001a%\u0010\r\u001a\u00020\u00032\u0006\u0010\u000b\u001a\u00020\n2\u000c\u0010\u000c\u001a\u0008\u0012\u0004\u0012\u00020\u00030\u0002H\u0001\u00a2\u0006\u0004\u0008\r\u0010\u000e\u00a8\u0006\u000f"
    }
    d2 = {
        "",
        "betaTagText",
        "Lkotlin/Function0;",
        "Ll83/a0;",
        "onBetaClick",
        "f",
        "(Ljava/lang/String;Lc93/a;Landroidx/compose/runtime/Composer;I)V",
        "onHistoryClick",
        "h",
        "(Lc93/a;Landroidx/compose/runtime/Composer;I)V",
        "",
        "showLabel",
        "onContextHubClick",
        "k",
        "(ZLc93/a;Landroidx/compose/runtime/Composer;I)V",
        "coach-everywhere_release"
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
.method public static synthetic a(Lc93/a;Ljava/lang/String;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p1, p0, p2, p3, p4}, Lcp0/k;->g(Ljava/lang/String;Lc93/a;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Lc93/a;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lcp0/k;->l(Lc93/a;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Lc93/a;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3}, Lcp0/k;->j(Lc93/a;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Lc93/a;ZLandroidx/compose/runtime/Composer;II)Ll83/a0;
    .locals 0

    invoke-static {p1, p0, p3, p2, p4}, Lcp0/k;->m(ZLc93/a;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic e(Lc93/a;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lcp0/k;->i(Lc93/a;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final f(Ljava/lang/String;Lc93/a;Landroidx/compose/runtime/Composer;I)V
    .locals 37
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ljava/lang/String;",
            "Lc93/a;",
            "Landroidx/compose/runtime/Composer;",
            "I)V"
        }
    .end annotation

    move-object/from16 v0, p0

    move-object/from16 v3, p1

    move/from16 v7, p3

    const-string v1, "betaTagText"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const-string v1, "onBetaClick"

    invoke-static {v3, v1}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v4, p2

    check-cast v4, Lp1/q;

    const v1, 0x143687ea

    invoke-virtual {v4, v1}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v1, v7, 0x6

    const/4 v5, 0x4

    if-nez v1, :cond_1

    invoke-virtual {v4, v0}, Lp1/q;->g(Ljava/lang/Object;)Z

    move-result v1

    if-eqz v1, :cond_0

    move v1, v5

    goto :goto_0

    :cond_0
    const/4 v1, 0x2

    :goto_0
    or-int/2addr v1, v7

    goto :goto_1

    :cond_1
    move v1, v7

    :goto_1
    and-int/lit8 v6, v7, 0x30

    if-nez v6, :cond_3

    invoke-virtual {v4, v3}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v6

    if-eqz v6, :cond_2

    const/16 v6, 0x20

    goto :goto_2

    :cond_2
    const/16 v6, 0x10

    :goto_2
    or-int/2addr v1, v6

    :cond_3
    and-int/lit8 v6, v1, 0x13

    const/16 v8, 0x12

    const/4 v9, 0x0

    const/4 v10, 0x1

    if-eq v6, v8, :cond_4

    move v6, v10

    goto :goto_3

    :cond_4
    move v6, v9

    :goto_3
    and-int/lit8 v8, v1, 0x1

    invoke-virtual {v4, v8, v6}, Lp1/q;->U(IZ)Z

    move-result v6

    if-eqz v6, :cond_9

    sget-object v6, Lb2/e;->K:Lb2/l;

    int-to-float v8, v10

    const/16 v11, 0x8

    int-to-float v11, v11

    mul-float v23, v8, v11

    invoke-static/range {v23 .. v23}, Ll0/m;->i(F)Ll0/k;

    move-result-object v11

    const/16 v12, 0x36

    invoke-static {v11, v6, v4, v12}, Ll0/p1;->a(Ll0/i;Lb2/g;Landroidx/compose/runtime/Composer;I)Ll0/r1;

    move-result-object v6

    iget-wide v11, v4, Lp1/q;->T:J

    invoke-static {v11, v12}, Ljava/lang/Long;->hashCode(J)I

    move-result v11

    invoke-virtual {v4}, Lp1/q;->m()Lp1/p1;

    move-result-object v12

    sget-object v13, Lb2/t;->w:Lb2/t;

    invoke-static {v4, v13}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v13

    sget-object v14, La3/l;->a:La3/k;

    invoke-virtual {v14}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v14, La3/k;->b:La3/j;

    invoke-virtual {v4}, Lp1/q;->i0()V

    iget-boolean v15, v4, Lp1/q;->S:Z

    if-eqz v15, :cond_5

    invoke-virtual {v4, v14}, Lp1/q;->l(Lc93/a;)V

    goto :goto_4

    :cond_5
    invoke-virtual {v4}, Lp1/q;->s0()V

    :goto_4
    sget-object v14, La3/k;->g:La3/i;

    invoke-static {v4, v14, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v6, La3/k;->f:La3/i;

    invoke-static {v4, v6, v12}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v6, La3/k;->j:La3/i;

    iget-boolean v12, v4, Lp1/q;->S:Z

    if-nez v12, :cond_6

    invoke-virtual {v4}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v12

    invoke-static {v11}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v14

    invoke-static {v12, v14}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v12

    if-nez v12, :cond_7

    :cond_6
    invoke-static {v11, v4, v11, v6}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_7
    sget-object v6, La3/k;->d:La3/i;

    invoke-static {v4, v6, v13}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const/4 v6, 0x0

    invoke-static {v6, v4, v9, v10}, Lo01/d;->c(Lgz0/m0;Landroidx/compose/runtime/Composer;II)V

    invoke-static {v0}, Lcom/whoop/design/util/b;->l(Ljava/lang/String;)Lcom/whoop/design/util/TextResource;

    move-result-object v13

    invoke-virtual {v4}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v9

    sget-object v11, Lp1/l;->a:Lp1/v0;

    if-ne v9, v11, :cond_8

    sget-object v9, Lcp0/k$a;->w:Lcp0/k$a;

    invoke-virtual {v4, v9}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_8
    check-cast v9, Lkotlin/jvm/functions/Function1;

    invoke-static {v9}, Ly81/g;->a(Lkotlin/jvm/functions/Function1;)Ly81/e;

    move-result-object v17

    new-instance v9, Li91/d;

    sget-object v11, Li2/t;->b:Li2/s;

    sget-object v12, Lx81/d;->a:Lx81/d;

    sget v14, Lx81/d;->b:I

    invoke-virtual {v12, v4, v14}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v15

    invoke-virtual {v15}, Ly81/i;->V0()J

    move-result-wide v2

    new-instance v15, Li2/x;

    invoke-direct {v15, v2, v3}, Li2/x;-><init>(J)V

    invoke-virtual {v12, v4, v14}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v2

    invoke-virtual {v2}, Ly81/i;->a1()J

    move-result-wide v2

    new-instance v10, Li2/x;

    invoke-direct {v10, v2, v3}, Li2/x;-><init>(J)V

    invoke-virtual {v12, v4, v14}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v2

    invoke-virtual {v2}, Ly81/i;->W0()J

    move-result-wide v2

    new-instance v12, Li2/x;

    invoke-direct {v12, v2, v3}, Li2/x;-><init>(J)V

    filled-new-array {v15, v10, v12}, [Li2/x;

    move-result-object v2

    invoke-static {v2}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v2

    const/16 v3, 0xe

    const/4 v10, 0x0

    invoke-static {v11, v2, v10, v10, v3}, Li2/s;->a(Li2/s;Ljava/util/List;FFI)Li2/k0;

    move-result-object v2

    invoke-static {v2}, Lj91/c;->a(Li2/t;)Lj91/b;

    move-result-object v2

    const/4 v3, 0x2

    invoke-direct {v9, v2, v10, v3, v6}, Li91/d;-><init>(Lj91/b;FILkotlin/jvm/internal/DefaultConstructorMarker;)V

    int-to-float v2, v5

    mul-float/2addr v8, v2

    const/4 v3, 0x3

    int-to-float v5, v3

    mul-float/2addr v5, v2

    invoke-static {v8, v5, v5, v8}, Lt0/j;->f(FFFF)Lt0/i;

    move-result-object v22

    new-instance v12, Lhy0/h1;

    const v35, 0x3ff9e6

    const/16 v36, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    const/16 v18, 0x0

    const/16 v19, 0x0

    const/16 v20, 0x0

    const/16 v21, 0x0

    const/16 v24, 0x0

    const/16 v25, 0x0

    const/16 v26, 0x0

    const/16 v27, 0x0

    const/16 v28, 0x0

    const/16 v29, 0x0

    const/16 v30, 0x0

    const/16 v31, 0x0

    const/16 v32, 0x0

    const/16 v33, 0x0

    const/16 v34, 0x0

    move-object/from16 v16, v9

    invoke-direct/range {v12 .. v36}, Lhy0/h1;-><init>(Lcom/whoop/design/util/TextResource;Ly71/g;Ly81/e;Li91/d;Ly81/e;Li2/t;Li2/t;Lhy0/o1;ZLi2/a1;FFFLy71/g;FLy81/e;Lcom/whoop/navigation/e;Lcom/whoop/whoopaction/domain/models/Action;Lhy0/c1;Lkd1/o;Ljava/util/List;Lcom/whoop/navigation/models/GenericInteraction;ILkotlin/jvm/internal/DefaultConstructorMarker;)V

    sget v2, Lhy0/h1;->w:I

    shl-int/2addr v1, v3

    and-int/lit16 v1, v1, 0x380

    or-int v5, v2, v1

    const/4 v6, 0x2

    const/4 v2, 0x0

    move-object/from16 v3, p1

    move-object v1, v12

    invoke-static/range {v1 .. v6}, Lhy0/g1;->h(Lhy0/h1;Landroidx/compose/ui/Modifier;Lc93/a;Landroidx/compose/runtime/Composer;II)V

    const/4 v1, 0x1

    invoke-virtual {v4, v1}, Lp1/q;->q(Z)V

    goto :goto_5

    :cond_9
    invoke-virtual {v4}, Lp1/q;->X()V

    :goto_5
    invoke-virtual {v4}, Lp1/q;->u()Lp1/v1;

    move-result-object v1

    if-eqz v1, :cond_a

    new-instance v2, Lcp0/i;

    const/4 v4, 0x0

    invoke-direct {v2, v0, v3, v7, v4}, Lcp0/i;-><init>(Ljava/lang/String;Lc93/a;II)V

    iput-object v2, v1, Lp1/v1;->d:Lc93/m;

    :cond_a
    return-void
.end method

.method private static final g(Ljava/lang/String;Lc93/a;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, Lp1/x;->L(I)I

    move-result p2

    invoke-static {p0, p1, p3, p2}, Lcp0/k;->f(Ljava/lang/String;Lc93/a;Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static final h(Lc93/a;Landroidx/compose/runtime/Composer;I)V
    .locals 18
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Lc93/a;",
            "Landroidx/compose/runtime/Composer;",
            "I)V"
        }
    .end annotation

    move-object/from16 v0, p0

    move/from16 v1, p2

    const-string v2, "onHistoryClick"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v8, p1

    check-cast v8, Lp1/q;

    const v2, -0xc7f597c

    invoke-virtual {v8, v2}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v2, v1, 0x6

    const/4 v3, 0x2

    const/4 v4, 0x4

    if-nez v2, :cond_1

    invoke-virtual {v8, v0}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v2

    if-eqz v2, :cond_0

    move v2, v4

    goto :goto_0

    :cond_0
    move v2, v3

    :goto_0
    or-int/2addr v2, v1

    goto :goto_1

    :cond_1
    move v2, v1

    :goto_1
    and-int/lit8 v5, v2, 0x3

    const/4 v6, 0x0

    const/4 v7, 0x1

    if-eq v5, v3, :cond_2

    move v3, v7

    goto :goto_2

    :cond_2
    move v3, v6

    :goto_2
    and-int/lit8 v5, v2, 0x1

    invoke-virtual {v8, v5, v3}, Lp1/q;->U(IZ)Z

    move-result v3

    if-eqz v3, :cond_6

    sget v3, Lwk0/a;->b:I

    const/4 v5, 0x6

    invoke-static {v3, v8, v5}, Lts/o;->S(ILandroidx/compose/runtime/Composer;I)Lo2/e;

    move-result-object v3

    sget v9, Lwk0/b;->M:I

    invoke-static {v9, v8, v6}, Lcom/whoop/design/util/b;->g(ILandroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v9

    sget-object v10, Lx81/d;->a:Lx81/d;

    sget v11, Lx81/d;->b:I

    invoke-virtual {v10, v8, v11}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v10

    invoke-virtual {v10}, Ly81/i;->y()J

    move-result-wide v10

    and-int/lit8 v2, v2, 0xe

    if-ne v2, v4, :cond_3

    move v6, v7

    :cond_3
    invoke-virtual {v8}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    if-nez v6, :cond_4

    sget-object v6, Lp1/l;->a:Lp1/v0;

    if-ne v2, v6, :cond_5

    :cond_4
    new-instance v2, Lcp0/j;

    const/4 v6, 0x0

    invoke-direct {v2, v0, v6}, Lcp0/j;-><init>(Lc93/a;I)V

    invoke-virtual {v8, v2}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_5
    move-object/from16 v16, v2

    check-cast v16, Lc93/a;

    const/16 v17, 0xf

    sget-object v12, Lb2/t;->w:Lb2/t;

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    invoke-static/range {v12 .. v17}, Landroidx/compose/foundation/a;->g(Landroidx/compose/ui/Modifier;ZLjava/lang/String;Li3/i;Lc93/a;I)Landroidx/compose/ui/Modifier;

    move-result-object v2

    int-to-float v5, v5

    int-to-float v4, v4

    mul-float/2addr v5, v4

    invoke-static {v5, v2}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v5

    move-object v4, v9

    const/4 v9, 0x0

    move-wide v6, v10

    const/4 v10, 0x0

    invoke-static/range {v3 .. v10}, Lg1/f3;->b(Lo2/e;Ljava/lang/String;Landroidx/compose/ui/Modifier;JLandroidx/compose/runtime/Composer;II)V

    goto :goto_3

    :cond_6
    invoke-virtual {v8}, Lp1/q;->X()V

    :goto_3
    invoke-virtual {v8}, Lp1/q;->u()Lp1/v1;

    move-result-object v2

    if-eqz v2, :cond_7

    new-instance v3, Lch0/t;

    const/4 v4, 0x1

    invoke-direct {v3, v1, v4, v0}, Lch0/t;-><init>(IILc93/a;)V

    iput-object v3, v2, Lp1/v1;->d:Lc93/m;

    :cond_7
    return-void
.end method

.method private static final i(Lc93/a;)Ll83/a0;
    .locals 0

    invoke-interface {p0}, Lc93/a;->invoke()Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final j(Lc93/a;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p1, p1, 0x1

    invoke-static {p1}, Lp1/x;->L(I)I

    move-result p1

    invoke-static {p0, p2, p1}, Lcp0/k;->h(Lc93/a;Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static final k(ZLc93/a;Landroidx/compose/runtime/Composer;I)V
    .locals 33
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(Z",
            "Lc93/a;",
            "Landroidx/compose/runtime/Composer;",
            "I)V"
        }
    .end annotation

    move/from16 v0, p0

    move-object/from16 v1, p1

    move/from16 v2, p3

    const-string v3, "onContextHubClick"

    invoke-static {v1, v3}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    move-object/from16 v9, p2

    check-cast v9, Lp1/q;

    const v3, -0x5a255f32

    invoke-virtual {v9, v3}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 v3, v2, 0x6

    const/4 v4, 0x4

    if-nez v3, :cond_1

    invoke-virtual {v9, v0}, Lp1/q;->h(Z)Z

    move-result v3

    if-eqz v3, :cond_0

    move v3, v4

    goto :goto_0

    :cond_0
    const/4 v3, 0x2

    :goto_0
    or-int/2addr v3, v2

    goto :goto_1

    :cond_1
    move v3, v2

    :goto_1
    and-int/lit8 v5, v2, 0x30

    const/16 v6, 0x20

    if-nez v5, :cond_3

    invoke-virtual {v9, v1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v5

    if-eqz v5, :cond_2

    move v5, v6

    goto :goto_2

    :cond_2
    const/16 v5, 0x10

    :goto_2
    or-int/2addr v3, v5

    :cond_3
    and-int/lit8 v5, v3, 0x13

    const/16 v7, 0x12

    const/4 v8, 0x1

    const/4 v10, 0x0

    if-eq v5, v7, :cond_4

    move v5, v8

    goto :goto_3

    :cond_4
    move v5, v10

    :goto_3
    and-int/lit8 v11, v3, 0x1

    invoke-virtual {v9, v11, v5}, Lp1/q;->U(IZ)Z

    move-result v5

    if-eqz v5, :cond_d

    sget-object v5, Lb2/e;->K:Lb2/l;

    int-to-float v11, v8

    const/16 v12, 0x8

    int-to-float v12, v12

    mul-float/2addr v11, v12

    invoke-static {v11}, Ll0/m;->i(F)Ll0/k;

    move-result-object v11

    and-int/lit8 v3, v3, 0x70

    if-ne v3, v6, :cond_5

    move v3, v8

    goto :goto_4

    :cond_5
    move v3, v10

    :goto_4
    invoke-virtual {v9}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v6

    if-nez v3, :cond_6

    sget-object v3, Lp1/l;->a:Lp1/v0;

    if-ne v6, v3, :cond_7

    :cond_6
    new-instance v6, Lcp0/j;

    const/4 v3, 0x1

    invoke-direct {v6, v1, v3}, Lcp0/j;-><init>(Lc93/a;I)V

    invoke-virtual {v9, v6}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_7
    move-object/from16 v16, v6

    check-cast v16, Lc93/a;

    const/16 v17, 0xf

    sget-object v12, Lb2/t;->w:Lb2/t;

    const/4 v13, 0x0

    const/4 v14, 0x0

    const/4 v15, 0x0

    invoke-static/range {v12 .. v17}, Landroidx/compose/foundation/a;->g(Landroidx/compose/ui/Modifier;ZLjava/lang/String;Li3/i;Lc93/a;I)Landroidx/compose/ui/Modifier;

    move-result-object v3

    const/16 v6, 0x36

    invoke-static {v11, v5, v9, v6}, Ll0/p1;->a(Ll0/i;Lb2/g;Landroidx/compose/runtime/Composer;I)Ll0/r1;

    move-result-object v5

    iget-wide v13, v9, Lp1/q;->T:J

    invoke-static {v13, v14}, Ljava/lang/Long;->hashCode(J)I

    move-result v6

    invoke-virtual {v9}, Lp1/q;->m()Lp1/p1;

    move-result-object v11

    invoke-static {v9, v3}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v3

    sget-object v13, La3/l;->a:La3/k;

    invoke-virtual {v13}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v13, La3/k;->b:La3/j;

    invoke-virtual {v9}, Lp1/q;->i0()V

    iget-boolean v14, v9, Lp1/q;->S:Z

    if-eqz v14, :cond_8

    invoke-virtual {v9, v13}, Lp1/q;->l(Lc93/a;)V

    goto :goto_5

    :cond_8
    invoke-virtual {v9}, Lp1/q;->s0()V

    :goto_5
    sget-object v13, La3/k;->g:La3/i;

    invoke-static {v9, v13, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v5, La3/k;->f:La3/i;

    invoke-static {v9, v5, v11}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v5, La3/k;->j:La3/i;

    iget-boolean v11, v9, Lp1/q;->S:Z

    if-nez v11, :cond_9

    invoke-virtual {v9}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v11

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v13

    invoke-static {v11, v13}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v11

    if-nez v11, :cond_a

    :cond_9
    invoke-static {v6, v9, v6, v5}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_a
    sget-object v5, La3/k;->d:La3/i;

    invoke-static {v9, v5, v3}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    if-eqz v0, :cond_b

    const v3, -0x47e89266

    invoke-virtual {v9, v3}, Lp1/q;->e0(I)V

    sget v3, Lwk0/b;->k:I

    invoke-static {v3, v9, v10}, Lcom/whoop/design/util/b;->g(ILandroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v3

    sget-object v5, Lx81/d;->a:Lx81/d;

    sget v6, Lx81/d;->b:I

    invoke-virtual {v5, v9, v6}, Lx81/d;->e(Landroidx/compose/runtime/Composer;I)Lb91/d;

    move-result-object v11

    invoke-virtual {v11}, Lb91/d;->b()Lb91/a;

    move-result-object v24

    invoke-virtual {v5, v9, v6}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v5

    invoke-virtual {v5}, Ly81/i;->y()J

    move-result-wide v5

    sget v11, Lb91/a;->d:I

    shl-int/lit8 v28, v11, 0x12

    const v29, 0x2fffa

    move-wide v6, v5

    const/4 v5, 0x0

    move v11, v8

    move-object/from16 v26, v9

    const-wide/16 v8, 0x0

    move v13, v10

    const/4 v10, 0x0

    move v14, v11

    const/4 v11, 0x0

    move-object v15, v12

    const/4 v12, 0x0

    move/from16 v17, v13

    move/from16 v16, v14

    const-wide/16 v13, 0x0

    move-object/from16 v18, v15

    const/4 v15, 0x0

    move/from16 v19, v16

    const/16 v16, 0x0

    move/from16 v20, v17

    move-object/from16 v21, v18

    const-wide/16 v17, 0x0

    move/from16 v22, v19

    const/16 v19, 0x0

    move/from16 v23, v20

    const/16 v20, 0x0

    move-object/from16 v25, v21

    const/16 v21, 0x0

    move/from16 v27, v22

    const/16 v22, 0x0

    move/from16 v30, v23

    const/16 v23, 0x0

    move-object/from16 v31, v25

    const/16 v25, 0x0

    move/from16 v32, v27

    const/16 v27, 0x0

    move-object v4, v3

    move/from16 v3, v30

    move-object/from16 v0, v31

    invoke-static/range {v4 .. v29}, Lqz0/n;->h(Ljava/lang/String;Landroidx/compose/ui/Modifier;JJLp3/n;Lp3/r;Lp3/i;JLw3/l;Lw3/k;JIZIILkotlin/jvm/functions/Function1;Lb91/a;Ljava/lang/Float;Landroidx/compose/runtime/Composer;III)V

    move-object/from16 v9, v26

    invoke-virtual {v9, v3}, Lp1/q;->q(Z)V

    goto :goto_6

    :cond_b
    move v3, v10

    move-object v0, v12

    const v4, -0x47e54850

    invoke-virtual {v9, v4}, Lp1/q;->e0(I)V

    invoke-virtual {v9, v3}, Lp1/q;->q(Z)V

    :goto_6
    sget v4, Lgy0/a;->j:I

    invoke-static {v4, v9, v3}, Lpf/c;->I(ILandroidx/compose/runtime/Composer;I)Ln2/a;

    move-result-object v4

    if-eqz p0, :cond_c

    const v5, -0x47e315f5

    invoke-virtual {v9, v5}, Lp1/q;->e0(I)V

    invoke-virtual {v9, v3}, Lp1/q;->q(Z)V

    const/4 v3, 0x0

    move-object v5, v3

    goto :goto_7

    :cond_c
    const v5, 0x26f8ae3e

    invoke-virtual {v9, v5}, Lp1/q;->e0(I)V

    sget v5, Lwk0/b;->j:I

    invoke-static {v5, v9, v3}, Lcom/whoop/design/util/b;->g(ILandroidx/compose/runtime/Composer;I)Ljava/lang/String;

    move-result-object v5

    invoke-virtual {v9, v3}, Lp1/q;->q(Z)V

    :goto_7
    sget-object v3, Lx81/d;->a:Lx81/d;

    sget v6, Lx81/d;->b:I

    invoke-virtual {v3, v9, v6}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v3

    invoke-virtual {v3}, Ly81/i;->y()J

    move-result-wide v7

    const/4 v3, 0x6

    int-to-float v3, v3

    const/4 v6, 0x4

    int-to-float v6, v6

    mul-float/2addr v3, v6

    invoke-static {v3, v0}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v6

    const/16 v10, 0x180

    const/4 v11, 0x0

    invoke-static/range {v4 .. v11}, Lg1/f3;->a(Ln2/a;Ljava/lang/String;Landroidx/compose/ui/Modifier;JLandroidx/compose/runtime/Composer;II)V

    const/4 v14, 0x1

    invoke-virtual {v9, v14}, Lp1/q;->q(Z)V

    goto :goto_8

    :cond_d
    invoke-virtual {v9}, Lp1/q;->X()V

    :goto_8
    invoke-virtual {v9}, Lp1/q;->u()Lp1/v1;

    move-result-object v0

    if-eqz v0, :cond_e

    new-instance v3, La41/j;

    const/4 v4, 0x2

    move/from16 v5, p0

    invoke-direct {v3, v5, v1, v2, v4}, La41/j;-><init>(ZLc93/a;II)V

    iput-object v3, v0, Lp1/v1;->d:Lc93/m;

    :cond_e
    return-void
.end method

.method private static final l(Lc93/a;)Ll83/a0;
    .locals 0

    invoke-interface {p0}, Lc93/a;->invoke()Ljava/lang/Object;

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final m(ZLc93/a;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, Lp1/x;->L(I)I

    move-result p2

    invoke-static {p0, p1, p3, p2}, Lcp0/k;->k(ZLc93/a;Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method
