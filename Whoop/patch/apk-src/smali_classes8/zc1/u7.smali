.class public abstract Lzc1/u7;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0008\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0008\u0004\u001a\u000f\u0010\u0001\u001a\u00020\u0000H\u0001\u00a2\u0006\u0004\u0008\u0001\u0010\u0002\u001a\u000f\u0010\u0003\u001a\u00020\u0000H\u0003\u00a2\u0006\u0004\u0008\u0003\u0010\u0002\u001a\u000f\u0010\u0004\u001a\u00020\u0000H\u0003\u00a2\u0006\u0004\u0008\u0004\u0010\u0002\u001a\u000f\u0010\u0005\u001a\u00020\u0000H\u0003\u00a2\u0006\u0004\u0008\u0005\u0010\u0002\u001a-\u0010\n\u001a\u00020\u00002\u0008\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0012\u0010\t\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00000\u0008H\u0003\u00a2\u0006\u0004\u0008\n\u0010\u000b\u00a8\u0006\u000c"
    }
    d2 = {
        "Ll83/a0;",
        "m",
        "(Landroidx/compose/runtime/Composer;I)V",
        "i",
        "k",
        "p",
        "Li2/x;",
        "activeColor",
        "Lkotlin/Function1;",
        "onColorSelected",
        "g",
        "(Li2/x;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V",
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
.method public static synthetic a(ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, Lzc1/u7;->j(ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Li2/x;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2, p3, p4}, Lzc1/u7;->h(Li2/x;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, Lzc1/u7;->o(ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, Lzc1/u7;->q(ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic e(ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, Lzc1/u7;->l(ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic f(Lp1/c1;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, Lzc1/u7;->n(Lp1/c1;Landroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method private static final g(Li2/x;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V
    .locals 8
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Li2/x;",
            "Lkotlin/jvm/functions/Function1;",
            "Landroidx/compose/runtime/Composer;",
            "I)V"
        }
    .end annotation

    move-object v3, p2

    check-cast v3, Lp1/q;

    const p2, -0x5a1a3f5e

    invoke-virtual {v3, p2}, Lp1/q;->g0(I)Lp1/q;

    and-int/lit8 p2, p3, 0x6

    if-nez p2, :cond_1

    invoke-virtual {v3, p0}, Lp1/q;->g(Ljava/lang/Object;)Z

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
    and-int/lit8 v0, p3, 0x30

    if-nez v0, :cond_3

    invoke-virtual {v3, p1}, Lp1/q;->i(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_2

    const/16 v0, 0x20

    goto :goto_2

    :cond_2
    const/16 v0, 0x10

    :goto_2
    or-int/2addr p2, v0

    :cond_3
    and-int/lit8 v0, p2, 0x13

    const/16 v1, 0x12

    if-eq v0, v1, :cond_4

    const/4 v0, 0x1

    goto :goto_3

    :cond_4
    const/4 v0, 0x0

    :goto_3
    and-int/lit8 v1, p2, 0x1

    invoke-virtual {v3, v1, v0}, Lp1/q;->U(IZ)Z

    move-result v0

    if-eqz v0, :cond_5

    sget-object v0, Lx81/d;->a:Lx81/d;

    sget v1, Lx81/d;->b:I

    invoke-virtual {v0, v3, v1}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v2

    invoke-virtual {v2}, Ly81/i;->y()J

    move-result-wide v4

    new-instance v2, Li2/x;

    invoke-direct {v2, v4, v5}, Li2/x;-><init>(J)V

    invoke-virtual {v0, v3, v1}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v4

    invoke-virtual {v4}, Ly81/i;->a()J

    move-result-wide v4

    new-instance v6, Li2/x;

    invoke-direct {v6, v4, v5}, Li2/x;-><init>(J)V

    invoke-virtual {v0, v3, v1}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v4

    invoke-virtual {v4}, Ly81/i;->b()J

    move-result-wide v4

    new-instance v7, Li2/x;

    invoke-direct {v7, v4, v5}, Li2/x;-><init>(J)V

    invoke-virtual {v0, v3, v1}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v0

    invoke-virtual {v0}, Ly81/i;->j0()J

    move-result-wide v0

    new-instance v4, Li2/x;

    invoke-direct {v4, v0, v1}, Li2/x;-><init>(J)V

    filled-new-array {v2, v6, v7, v4}, [Li2/x;

    move-result-object v0

    invoke-static {v0}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    const-string v1, "Active Color"

    const/4 v2, 0x6

    invoke-static {v1, v3, v2}, Lkd1/k;->c(Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V

    shl-int/lit8 p2, p2, 0x3

    and-int/lit16 v4, p2, 0x3f0

    const/4 v5, 0x0

    move-object v1, p0

    move-object v2, p1

    invoke-static/range {v0 .. v5}, Lbd1/e;->b(Ljava/util/List;Li2/x;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    goto :goto_4

    :cond_5
    move-object v1, p0

    move-object v2, p1

    invoke-virtual {v3}, Lp1/q;->X()V

    :goto_4
    invoke-virtual {v3}, Lp1/q;->u()Lp1/v1;

    move-result-object p0

    if-eqz p0, :cond_6

    new-instance p1, Lyf1/e;

    const/16 p2, 0xf

    invoke-direct {p1, v1, v2, p3, p2}, Lyf1/e;-><init>(Ljava/lang/Object;Ljava/lang/Object;II)V

    iput-object p1, p0, Lp1/v1;->d:Lc93/m;

    :cond_6
    return-void
.end method

.method private static final h(Li2/x;Lkotlin/jvm/functions/Function1;ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p2, p2, 0x1

    invoke-static {p2}, Lp1/x;->L(I)I

    move-result p2

    invoke-static {p0, p1, p3, p2}, Lzc1/u7;->g(Li2/x;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final i(Landroidx/compose/runtime/Composer;I)V
    .locals 20

    move/from16 v0, p1

    move-object/from16 v1, p0

    check-cast v1, Lp1/q;

    const v2, -0x7fc49a3f

    invoke-virtual {v1, v2}, Lp1/q;->g0(I)Lp1/q;

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-eqz v0, :cond_0

    move v4, v3

    goto :goto_0

    :cond_0
    move v4, v2

    :goto_0
    and-int/lit8 v5, v0, 0x1

    invoke-virtual {v1, v5, v4}, Lp1/q;->U(IZ)Z

    move-result v4

    if-eqz v4, :cond_e

    const-string v4, "Small Fixed"

    const/4 v5, 0x6

    invoke-static {v4, v1, v5}, Lkd1/k;->c(Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V

    const/high16 v4, 0x3f800000    # 1.0f

    sget-object v6, Lb2/t;->w:Lb2/t;

    invoke-static {v4, v6}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v7

    sget-object v8, Ll0/m;->a:Ll0/e;

    sget-object v9, Lb2/e;->J:Lb2/l;

    invoke-static {v8, v9, v1, v2}, Ll0/p1;->a(Ll0/i;Lb2/g;Landroidx/compose/runtime/Composer;I)Ll0/r1;

    move-result-object v8

    iget-wide v9, v1, Lp1/q;->T:J

    invoke-static {v9, v10}, Ljava/lang/Long;->hashCode(J)I

    move-result v9

    invoke-virtual {v1}, Lp1/q;->m()Lp1/p1;

    move-result-object v10

    invoke-static {v1, v7}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v7

    sget-object v11, La3/l;->a:La3/k;

    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v11, La3/k;->b:La3/j;

    invoke-virtual {v1}, Lp1/q;->i0()V

    iget-boolean v12, v1, Lp1/q;->S:Z

    if-eqz v12, :cond_1

    invoke-virtual {v1, v11}, Lp1/q;->l(Lc93/a;)V

    goto :goto_1

    :cond_1
    invoke-virtual {v1}, Lp1/q;->s0()V

    :goto_1
    sget-object v12, La3/k;->g:La3/i;

    invoke-static {v1, v12, v8}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v8, La3/k;->f:La3/i;

    invoke-static {v1, v8, v10}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v10, La3/k;->j:La3/i;

    iget-boolean v13, v1, Lp1/q;->S:Z

    if-nez v13, :cond_2

    invoke-virtual {v1}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v13

    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v14

    invoke-static {v13, v14}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v13

    if-nez v13, :cond_3

    :cond_2
    invoke-static {v9, v1, v9, v10}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_3
    sget-object v9, La3/k;->d:La3/i;

    invoke-static {v1, v9, v7}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    float-to-double v13, v4

    const-wide/16 v15, 0x0

    cmpl-double v7, v13, v15

    const-string v13, "invalid weight; must be greater than zero"

    if-lez v7, :cond_4

    goto :goto_2

    :cond_4
    invoke-static {v13}, Lm0/a;->a(Ljava/lang/String;)V

    :goto_2
    new-instance v7, Landroidx/compose/foundation/layout/LayoutWeightElement;

    const v14, 0x7f7fffff    # Float.MAX_VALUE

    cmpl-float v17, v4, v14

    move/from16 p0, v14

    if-lez v17, :cond_5

    goto :goto_3

    :cond_5
    move v14, v4

    :goto_3
    invoke-direct {v7, v14, v3}, Landroidx/compose/foundation/layout/LayoutWeightElement;-><init>(FZ)V

    sget-object v14, Ll0/a1;->x:Ll0/a1;

    invoke-static {v7, v14}, Landroidx/compose/foundation/layout/a;->u(Landroidx/compose/ui/Modifier;Ll0/a1;)Landroidx/compose/ui/Modifier;

    move-result-object v7

    move-wide/from16 v17, v15

    sget-object v15, Lb2/e;->N:Lb2/k;

    sget-object v4, Ll0/m;->c:Ll0/g;

    const/16 v2, 0x30

    invoke-static {v4, v15, v1, v2}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v3

    move-object/from16 v19, v6

    iget-wide v5, v1, Lp1/q;->T:J

    invoke-static {v5, v6}, Ljava/lang/Long;->hashCode(J)I

    move-result v5

    invoke-virtual {v1}, Lp1/q;->m()Lp1/p1;

    move-result-object v6

    invoke-static {v1, v7}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v7

    invoke-virtual {v1}, Lp1/q;->i0()V

    iget-boolean v2, v1, Lp1/q;->S:Z

    if-eqz v2, :cond_6

    invoke-virtual {v1, v11}, Lp1/q;->l(Lc93/a;)V

    goto :goto_4

    :cond_6
    invoke-virtual {v1}, Lp1/q;->s0()V

    :goto_4
    invoke-static {v1, v12, v3}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v1, v8, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v2, v1, Lp1/q;->S:Z

    if-nez v2, :cond_7

    invoke-virtual {v1}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_8

    :cond_7
    invoke-static {v5, v1, v5, v10}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_8
    invoke-static {v1, v9, v7}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const-string v2, "Text"

    const/4 v3, 0x6

    invoke-static {v2, v1, v3}, Lkd1/k;->e(Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V

    const/4 v2, 0x1

    int-to-float v3, v2

    const/4 v5, 0x4

    int-to-float v5, v5

    mul-float/2addr v3, v5

    move-object/from16 v5, v19

    invoke-static {v3, v5}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v6

    invoke-static {v1, v6}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    const/4 v6, 0x0

    invoke-static {v1, v6}, Lpy0/d;->N(Landroidx/compose/runtime/Composer;I)Ljava/util/List;

    invoke-virtual {v1, v2}, Lp1/q;->q(Z)V

    const/high16 v2, 0x3f800000    # 1.0f

    float-to-double v6, v2

    cmpl-double v6, v6, v17

    if-lez v6, :cond_9

    goto :goto_5

    :cond_9
    invoke-static {v13}, Lm0/a;->a(Ljava/lang/String;)V

    :goto_5
    new-instance v6, Landroidx/compose/foundation/layout/LayoutWeightElement;

    cmpl-float v7, v2, p0

    if-lez v7, :cond_a

    move/from16 v2, p0

    :cond_a
    const/4 v7, 0x1

    invoke-direct {v6, v2, v7}, Landroidx/compose/foundation/layout/LayoutWeightElement;-><init>(FZ)V

    invoke-static {v6, v14}, Landroidx/compose/foundation/layout/a;->u(Landroidx/compose/ui/Modifier;Ll0/a1;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    const/16 v6, 0x30

    invoke-static {v4, v15, v1, v6}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v4

    iget-wide v6, v1, Lp1/q;->T:J

    invoke-static {v6, v7}, Ljava/lang/Long;->hashCode(J)I

    move-result v6

    invoke-virtual {v1}, Lp1/q;->m()Lp1/p1;

    move-result-object v7

    invoke-static {v1, v2}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    invoke-virtual {v1}, Lp1/q;->i0()V

    iget-boolean v13, v1, Lp1/q;->S:Z

    if-eqz v13, :cond_b

    invoke-virtual {v1, v11}, Lp1/q;->l(Lc93/a;)V

    goto :goto_6

    :cond_b
    invoke-virtual {v1}, Lp1/q;->s0()V

    :goto_6
    invoke-static {v1, v12, v4}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v1, v8, v7}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v4, v1, Lp1/q;->S:Z

    if-nez v4, :cond_c

    invoke-virtual {v1}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-static {v4, v7}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_d

    :cond_c
    invoke-static {v6, v1, v6, v10}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_d
    invoke-static {v1, v9, v2}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const-string v2, "Number"

    const/4 v4, 0x6

    invoke-static {v2, v1, v4}, Lkd1/k;->e(Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V

    invoke-static {v3, v5}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    invoke-static {v1, v2}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    const/4 v6, 0x0

    invoke-static {v1, v6}, Lpy0/d;->I(Landroidx/compose/runtime/Composer;I)Ljava/util/List;

    const/4 v2, 0x1

    invoke-virtual {v1, v2}, Lp1/q;->q(Z)V

    invoke-virtual {v1, v2}, Lp1/q;->q(Z)V

    goto :goto_7

    :cond_e
    invoke-virtual {v1}, Lp1/q;->X()V

    :goto_7
    invoke-virtual {v1}, Lp1/q;->u()Lp1/v1;

    move-result-object v1

    if-eqz v1, :cond_f

    new-instance v2, Lzc1/t7;

    const/4 v3, 0x3

    invoke-direct {v2, v0, v3}, Lzc1/t7;-><init>(II)V

    iput-object v2, v1, Lp1/v1;->d:Lc93/m;

    :cond_f
    return-void
.end method

.method private static final j(ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p0, p0, 0x1

    invoke-static {p0}, Lp1/x;->L(I)I

    move-result p0

    invoke-static {p1, p0}, Lzc1/u7;->i(Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final k(Landroidx/compose/runtime/Composer;I)V
    .locals 20

    move/from16 v0, p1

    move-object/from16 v1, p0

    check-cast v1, Lp1/q;

    const v2, -0xb115dcc

    invoke-virtual {v1, v2}, Lp1/q;->g0(I)Lp1/q;

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-eqz v0, :cond_0

    move v4, v3

    goto :goto_0

    :cond_0
    move v4, v2

    :goto_0
    and-int/lit8 v5, v0, 0x1

    invoke-virtual {v1, v5, v4}, Lp1/q;->U(IZ)Z

    move-result v4

    if-eqz v4, :cond_e

    const-string v4, "Small Flexible"

    const/4 v5, 0x6

    invoke-static {v4, v1, v5}, Lkd1/k;->c(Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V

    const/high16 v4, 0x3f800000    # 1.0f

    sget-object v6, Lb2/t;->w:Lb2/t;

    invoke-static {v4, v6}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v7

    sget-object v8, Ll0/m;->a:Ll0/e;

    sget-object v9, Lb2/e;->J:Lb2/l;

    invoke-static {v8, v9, v1, v2}, Ll0/p1;->a(Ll0/i;Lb2/g;Landroidx/compose/runtime/Composer;I)Ll0/r1;

    move-result-object v8

    iget-wide v9, v1, Lp1/q;->T:J

    invoke-static {v9, v10}, Ljava/lang/Long;->hashCode(J)I

    move-result v9

    invoke-virtual {v1}, Lp1/q;->m()Lp1/p1;

    move-result-object v10

    invoke-static {v1, v7}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v7

    sget-object v11, La3/l;->a:La3/k;

    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v11, La3/k;->b:La3/j;

    invoke-virtual {v1}, Lp1/q;->i0()V

    iget-boolean v12, v1, Lp1/q;->S:Z

    if-eqz v12, :cond_1

    invoke-virtual {v1, v11}, Lp1/q;->l(Lc93/a;)V

    goto :goto_1

    :cond_1
    invoke-virtual {v1}, Lp1/q;->s0()V

    :goto_1
    sget-object v12, La3/k;->g:La3/i;

    invoke-static {v1, v12, v8}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v8, La3/k;->f:La3/i;

    invoke-static {v1, v8, v10}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v10, La3/k;->j:La3/i;

    iget-boolean v13, v1, Lp1/q;->S:Z

    if-nez v13, :cond_2

    invoke-virtual {v1}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v13

    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v14

    invoke-static {v13, v14}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v13

    if-nez v13, :cond_3

    :cond_2
    invoke-static {v9, v1, v9, v10}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_3
    sget-object v9, La3/k;->d:La3/i;

    invoke-static {v1, v9, v7}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    float-to-double v13, v4

    const-wide/16 v15, 0x0

    cmpl-double v7, v13, v15

    const-string v13, "invalid weight; must be greater than zero"

    if-lez v7, :cond_4

    goto :goto_2

    :cond_4
    invoke-static {v13}, Lm0/a;->a(Ljava/lang/String;)V

    :goto_2
    new-instance v7, Landroidx/compose/foundation/layout/LayoutWeightElement;

    const v14, 0x7f7fffff    # Float.MAX_VALUE

    cmpl-float v17, v4, v14

    move/from16 p0, v14

    if-lez v17, :cond_5

    goto :goto_3

    :cond_5
    move v14, v4

    :goto_3
    invoke-direct {v7, v14, v3}, Landroidx/compose/foundation/layout/LayoutWeightElement;-><init>(FZ)V

    sget-object v14, Ll0/a1;->x:Ll0/a1;

    invoke-static {v7, v14}, Landroidx/compose/foundation/layout/a;->u(Landroidx/compose/ui/Modifier;Ll0/a1;)Landroidx/compose/ui/Modifier;

    move-result-object v7

    move-wide/from16 v17, v15

    sget-object v15, Lb2/e;->N:Lb2/k;

    sget-object v4, Ll0/m;->c:Ll0/g;

    const/16 v2, 0x30

    invoke-static {v4, v15, v1, v2}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v3

    move-object/from16 v19, v6

    iget-wide v5, v1, Lp1/q;->T:J

    invoke-static {v5, v6}, Ljava/lang/Long;->hashCode(J)I

    move-result v5

    invoke-virtual {v1}, Lp1/q;->m()Lp1/p1;

    move-result-object v6

    invoke-static {v1, v7}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v7

    invoke-virtual {v1}, Lp1/q;->i0()V

    iget-boolean v2, v1, Lp1/q;->S:Z

    if-eqz v2, :cond_6

    invoke-virtual {v1, v11}, Lp1/q;->l(Lc93/a;)V

    goto :goto_4

    :cond_6
    invoke-virtual {v1}, Lp1/q;->s0()V

    :goto_4
    invoke-static {v1, v12, v3}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v1, v8, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v2, v1, Lp1/q;->S:Z

    if-nez v2, :cond_7

    invoke-virtual {v1}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_8

    :cond_7
    invoke-static {v5, v1, v5, v10}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_8
    invoke-static {v1, v9, v7}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const-string v2, "Text"

    const/4 v3, 0x6

    invoke-static {v2, v1, v3}, Lkd1/k;->e(Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V

    const/4 v2, 0x1

    int-to-float v3, v2

    const/4 v5, 0x4

    int-to-float v5, v5

    mul-float/2addr v3, v5

    move-object/from16 v5, v19

    invoke-static {v3, v5}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v6

    invoke-static {v1, v6}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    const/4 v6, 0x0

    invoke-static {v1, v6}, Lpy0/d;->X(Landroidx/compose/runtime/Composer;I)Ljava/util/List;

    invoke-static {v1, v2, v5, v3, v1}, Lhc3/i;->r(Lp1/q;ZLb2/t;FLp1/q;)V

    const/high16 v2, 0x3f800000    # 1.0f

    float-to-double v6, v2

    cmpl-double v6, v6, v17

    if-lez v6, :cond_9

    goto :goto_5

    :cond_9
    invoke-static {v13}, Lm0/a;->a(Ljava/lang/String;)V

    :goto_5
    new-instance v6, Landroidx/compose/foundation/layout/LayoutWeightElement;

    cmpl-float v7, v2, p0

    if-lez v7, :cond_a

    move/from16 v2, p0

    :cond_a
    const/4 v7, 0x1

    invoke-direct {v6, v2, v7}, Landroidx/compose/foundation/layout/LayoutWeightElement;-><init>(FZ)V

    invoke-static {v6, v14}, Landroidx/compose/foundation/layout/a;->u(Landroidx/compose/ui/Modifier;Ll0/a1;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    const/16 v6, 0x30

    invoke-static {v4, v15, v1, v6}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v4

    iget-wide v6, v1, Lp1/q;->T:J

    invoke-static {v6, v7}, Ljava/lang/Long;->hashCode(J)I

    move-result v6

    invoke-virtual {v1}, Lp1/q;->m()Lp1/p1;

    move-result-object v7

    invoke-static {v1, v2}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    invoke-virtual {v1}, Lp1/q;->i0()V

    iget-boolean v13, v1, Lp1/q;->S:Z

    if-eqz v13, :cond_b

    invoke-virtual {v1, v11}, Lp1/q;->l(Lc93/a;)V

    goto :goto_6

    :cond_b
    invoke-virtual {v1}, Lp1/q;->s0()V

    :goto_6
    invoke-static {v1, v12, v4}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v1, v8, v7}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v4, v1, Lp1/q;->S:Z

    if-nez v4, :cond_c

    invoke-virtual {v1}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-static {v4, v7}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_d

    :cond_c
    invoke-static {v6, v1, v6, v10}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_d
    invoke-static {v1, v9, v2}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const-string v2, "Number"

    const/4 v4, 0x6

    invoke-static {v2, v1, v4}, Lkd1/k;->e(Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V

    invoke-static {v3, v5}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    invoke-static {v1, v2}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    const/4 v6, 0x0

    invoke-static {v1, v6}, Lpy0/d;->S(Landroidx/compose/runtime/Composer;I)Ljava/util/List;

    const/4 v2, 0x1

    invoke-virtual {v1, v2}, Lp1/q;->q(Z)V

    invoke-virtual {v1, v2}, Lp1/q;->q(Z)V

    goto :goto_7

    :cond_e
    invoke-virtual {v1}, Lp1/q;->X()V

    :goto_7
    invoke-virtual {v1}, Lp1/q;->u()Lp1/v1;

    move-result-object v1

    if-eqz v1, :cond_f

    new-instance v2, Lzc1/t7;

    const/4 v3, 0x2

    invoke-direct {v2, v0, v3}, Lzc1/t7;-><init>(II)V

    iput-object v2, v1, Lp1/v1;->d:Lc93/m;

    :cond_f
    return-void
.end method

.method private static final l(ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p0, p0, 0x1

    invoke-static {p0}, Lp1/x;->L(I)I

    move-result p0

    invoke-static {p1, p0}, Lzc1/u7;->k(Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static final m(Landroidx/compose/runtime/Composer;I)V
    .locals 12

    move-object v9, p0

    check-cast v9, Lp1/q;

    const p0, 0x1d9ce9dc

    invoke-virtual {v9, p0}, Lp1/q;->g0(I)Lp1/q;

    const/4 p0, 0x1

    if-eqz p1, :cond_0

    move v0, p0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    and-int/lit8 v1, p1, 0x1

    invoke-virtual {v9, v1, v0}, Lp1/q;->U(IZ)Z

    move-result v0

    if-eqz v0, :cond_5

    sget-object v0, Lb2/t;->w:Lb2/t;

    const/high16 v1, 0x3f800000    # 1.0f

    invoke-static {v1, v0}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    const/4 v1, 0x4

    int-to-float v1, v1

    const/16 v2, 0x8

    int-to-float v2, v2

    mul-float/2addr v1, v2

    invoke-static {v1, v0}, Landroidx/compose/foundation/layout/a;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    sget-object v1, Lb2/e;->N:Lb2/k;

    sget-object v2, Ll0/m;->c:Ll0/g;

    const/16 v3, 0x30

    invoke-static {v2, v1, v9, v3}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v1

    iget-wide v2, v9, Lp1/q;->T:J

    invoke-static {v2, v3}, Ljava/lang/Long;->hashCode(J)I

    move-result v2

    invoke-virtual {v9}, Lp1/q;->m()Lp1/p1;

    move-result-object v3

    invoke-static {v9, v0}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    sget-object v4, La3/l;->a:La3/k;

    invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v4, La3/k;->b:La3/j;

    invoke-virtual {v9}, Lp1/q;->i0()V

    iget-boolean v5, v9, Lp1/q;->S:Z

    if-eqz v5, :cond_1

    invoke-virtual {v9, v4}, Lp1/q;->l(Lc93/a;)V

    goto :goto_1

    :cond_1
    invoke-virtual {v9}, Lp1/q;->s0()V

    :goto_1
    sget-object v4, La3/k;->g:La3/i;

    invoke-static {v9, v4, v1}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v1, La3/k;->f:La3/i;

    invoke-static {v9, v1, v3}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v1, La3/k;->j:La3/i;

    iget-boolean v3, v9, Lp1/q;->S:Z

    if-nez v3, :cond_2

    invoke-virtual {v9}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v3

    invoke-static {v2}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v4

    invoke-static {v3, v4}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v3

    if-nez v3, :cond_3

    :cond_2
    invoke-static {v2, v9, v2, v1}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_3
    sget-object v1, La3/k;->d:La3/i;

    invoke-static {v9, v1, v0}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v0, Lx81/d;->a:Lx81/d;

    sget v1, Lx81/d;->b:I

    invoke-virtual {v0, v9, v1}, Lx81/d;->b(Landroidx/compose/runtime/Composer;I)Ly81/i;

    move-result-object v0

    invoke-virtual {v0}, Ly81/i;->y()J

    move-result-wide v0

    invoke-virtual {v9}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    sget-object v3, Lp1/l;->a:Lp1/v0;

    if-ne v2, v3, :cond_4

    new-instance v2, Li2/x;

    invoke-direct {v2, v0, v1}, Li2/x;-><init>(J)V

    invoke-static {v2}, Lp1/x;->z(Ljava/lang/Object;)Lp1/k1;

    move-result-object v2

    invoke-virtual {v9, v2}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_4
    check-cast v2, Lp1/c1;

    invoke-interface {v2}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object v0

    check-cast v0, Li2/x;

    iget-wide v0, v0, Li2/x;->a:J

    new-instance v3, Lcom/whoop/profile/view/edit/c;

    const/16 v4, 0x11

    invoke-direct {v3, v4, v2}, Lcom/whoop/profile/view/edit/c;-><init>(ILp1/c1;)V

    const v2, -0x2909a621

    invoke-static {v2, v9, v3}, Lx1/c;->e(ILandroidx/compose/runtime/Composer;Ll83/e;)Lx1/b;

    move-result-object v8

    const/16 v10, 0x6000

    const/16 v11, 0xd

    move-wide v2, v0

    const-wide/16 v0, 0x0

    const-wide/16 v4, 0x0

    const-wide/16 v6, 0x0

    invoke-static/range {v0 .. v11}, Ly81/c;->b(JJJJLc93/m;Landroidx/compose/runtime/Composer;II)V

    invoke-virtual {v9, p0}, Lp1/q;->q(Z)V

    goto :goto_2

    :cond_5
    invoke-virtual {v9}, Lp1/q;->X()V

    :goto_2
    invoke-virtual {v9}, Lp1/q;->u()Lp1/v1;

    move-result-object p0

    if-eqz p0, :cond_6

    new-instance v0, Lzc1/t7;

    const/4 v1, 0x0

    invoke-direct {v0, p1, v1}, Lzc1/t7;-><init>(II)V

    iput-object v0, p0, Lp1/v1;->d:Lc93/m;

    :cond_6
    return-void
.end method

.method private static final n(Lp1/c1;Landroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 4

    and-int/lit8 v0, p2, 0x3

    const/4 v1, 0x2

    const/4 v2, 0x1

    const/4 v3, 0x0

    if-eq v0, v1, :cond_0

    move v0, v2

    goto :goto_0

    :cond_0
    move v0, v3

    :goto_0
    and-int/2addr p2, v2

    check-cast p1, Lp1/q;

    invoke-virtual {p1, p2, v0}, Lp1/q;->U(IZ)Z

    move-result p2

    if-eqz p2, :cond_2

    invoke-static {p1, v3}, Lzc1/u7;->i(Landroidx/compose/runtime/Composer;I)V

    const/4 p2, 0x4

    int-to-float p2, p2

    mul-float/2addr p2, p2

    sget-object v0, Lb2/t;->w:Lb2/t;

    invoke-static {p2, v0}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    invoke-static {p1, v1}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    invoke-static {p1, v3}, Lzc1/u7;->k(Landroidx/compose/runtime/Composer;I)V

    invoke-static {p2, v0}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    invoke-static {p1, v1}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    invoke-static {p1, v3}, Lzc1/u7;->p(Landroidx/compose/runtime/Composer;I)V

    invoke-static {p2, v0}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object p2

    invoke-static {p1, p2}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    invoke-interface {p0}, Lp1/t2;->getValue()Ljava/lang/Object;

    move-result-object p2

    check-cast p2, Li2/x;

    invoke-virtual {p1}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v0

    sget-object v1, Lp1/l;->a:Lp1/v0;

    if-ne v0, v1, :cond_1

    new-instance v0, Lzc1/u7$a;

    invoke-direct {v0, p0}, Lzc1/u7$a;-><init>(Lp1/c1;)V

    invoke-virtual {p1, v0}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_1
    check-cast v0, Lkotlin/jvm/functions/Function1;

    const/16 p0, 0x30

    invoke-static {p2, v0, p1, p0}, Lzc1/u7;->g(Li2/x;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    goto :goto_1

    :cond_2
    invoke-virtual {p1}, Lp1/q;->X()V

    :goto_1
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final o(ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p0, p0, 0x1

    invoke-static {p0}, Lp1/x;->L(I)I

    move-result p0

    invoke-static {p1, p0}, Lzc1/u7;->m(Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final p(Landroidx/compose/runtime/Composer;I)V
    .locals 20

    move/from16 v0, p1

    move-object/from16 v1, p0

    check-cast v1, Lp1/q;

    const v2, 0x1dbbec09

    invoke-virtual {v1, v2}, Lp1/q;->g0(I)Lp1/q;

    const/4 v2, 0x0

    const/4 v3, 0x1

    if-eqz v0, :cond_0

    move v4, v3

    goto :goto_0

    :cond_0
    move v4, v2

    :goto_0
    and-int/lit8 v5, v0, 0x1

    invoke-virtual {v1, v5, v4}, Lp1/q;->U(IZ)Z

    move-result v4

    if-eqz v4, :cond_e

    const-string v4, "Medium"

    const/4 v5, 0x6

    invoke-static {v4, v1, v5}, Lkd1/k;->c(Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V

    const/high16 v4, 0x3f800000    # 1.0f

    sget-object v6, Lb2/t;->w:Lb2/t;

    invoke-static {v4, v6}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v7

    sget-object v8, Ll0/m;->a:Ll0/e;

    sget-object v9, Lb2/e;->J:Lb2/l;

    invoke-static {v8, v9, v1, v2}, Ll0/p1;->a(Ll0/i;Lb2/g;Landroidx/compose/runtime/Composer;I)Ll0/r1;

    move-result-object v8

    iget-wide v9, v1, Lp1/q;->T:J

    invoke-static {v9, v10}, Ljava/lang/Long;->hashCode(J)I

    move-result v9

    invoke-virtual {v1}, Lp1/q;->m()Lp1/p1;

    move-result-object v10

    invoke-static {v1, v7}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v7

    sget-object v11, La3/l;->a:La3/k;

    invoke-virtual {v11}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v11, La3/k;->b:La3/j;

    invoke-virtual {v1}, Lp1/q;->i0()V

    iget-boolean v12, v1, Lp1/q;->S:Z

    if-eqz v12, :cond_1

    invoke-virtual {v1, v11}, Lp1/q;->l(Lc93/a;)V

    goto :goto_1

    :cond_1
    invoke-virtual {v1}, Lp1/q;->s0()V

    :goto_1
    sget-object v12, La3/k;->g:La3/i;

    invoke-static {v1, v12, v8}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v8, La3/k;->f:La3/i;

    invoke-static {v1, v8, v10}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v10, La3/k;->j:La3/i;

    iget-boolean v13, v1, Lp1/q;->S:Z

    if-nez v13, :cond_2

    invoke-virtual {v1}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v13

    invoke-static {v9}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v14

    invoke-static {v13, v14}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v13

    if-nez v13, :cond_3

    :cond_2
    invoke-static {v9, v1, v9, v10}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_3
    sget-object v9, La3/k;->d:La3/i;

    invoke-static {v1, v9, v7}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    float-to-double v13, v4

    const-wide/16 v15, 0x0

    cmpl-double v7, v13, v15

    const-string v13, "invalid weight; must be greater than zero"

    if-lez v7, :cond_4

    goto :goto_2

    :cond_4
    invoke-static {v13}, Lm0/a;->a(Ljava/lang/String;)V

    :goto_2
    new-instance v7, Landroidx/compose/foundation/layout/LayoutWeightElement;

    const v14, 0x7f7fffff    # Float.MAX_VALUE

    cmpl-float v17, v4, v14

    move/from16 p0, v14

    if-lez v17, :cond_5

    goto :goto_3

    :cond_5
    move v14, v4

    :goto_3
    invoke-direct {v7, v14, v3}, Landroidx/compose/foundation/layout/LayoutWeightElement;-><init>(FZ)V

    sget-object v14, Ll0/a1;->x:Ll0/a1;

    invoke-static {v7, v14}, Landroidx/compose/foundation/layout/a;->u(Landroidx/compose/ui/Modifier;Ll0/a1;)Landroidx/compose/ui/Modifier;

    move-result-object v7

    move-wide/from16 v17, v15

    sget-object v15, Lb2/e;->N:Lb2/k;

    sget-object v4, Ll0/m;->c:Ll0/g;

    const/16 v2, 0x30

    invoke-static {v4, v15, v1, v2}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v3

    move-object/from16 v19, v6

    iget-wide v5, v1, Lp1/q;->T:J

    invoke-static {v5, v6}, Ljava/lang/Long;->hashCode(J)I

    move-result v5

    invoke-virtual {v1}, Lp1/q;->m()Lp1/p1;

    move-result-object v6

    invoke-static {v1, v7}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v7

    invoke-virtual {v1}, Lp1/q;->i0()V

    iget-boolean v2, v1, Lp1/q;->S:Z

    if-eqz v2, :cond_6

    invoke-virtual {v1, v11}, Lp1/q;->l(Lc93/a;)V

    goto :goto_4

    :cond_6
    invoke-virtual {v1}, Lp1/q;->s0()V

    :goto_4
    invoke-static {v1, v12, v3}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v1, v8, v6}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v2, v1, Lp1/q;->S:Z

    if-nez v2, :cond_7

    invoke-virtual {v1}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v2

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v3

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_8

    :cond_7
    invoke-static {v5, v1, v5, v10}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_8
    invoke-static {v1, v9, v7}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const-string v2, "Text"

    const/4 v3, 0x6

    invoke-static {v2, v1, v3}, Lkd1/k;->e(Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V

    const/4 v2, 0x1

    int-to-float v3, v2

    const/4 v5, 0x4

    int-to-float v5, v5

    mul-float/2addr v3, v5

    move-object/from16 v5, v19

    invoke-static {v3, v5}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v6

    invoke-static {v1, v6}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    const/4 v6, 0x0

    invoke-static {v1, v6}, Lpy0/d;->D(Landroidx/compose/runtime/Composer;I)Ljava/util/List;

    invoke-virtual {v1, v2}, Lp1/q;->q(Z)V

    const/high16 v2, 0x3f800000    # 1.0f

    float-to-double v6, v2

    cmpl-double v6, v6, v17

    if-lez v6, :cond_9

    goto :goto_5

    :cond_9
    invoke-static {v13}, Lm0/a;->a(Ljava/lang/String;)V

    :goto_5
    new-instance v6, Landroidx/compose/foundation/layout/LayoutWeightElement;

    cmpl-float v7, v2, p0

    if-lez v7, :cond_a

    move/from16 v2, p0

    :cond_a
    const/4 v7, 0x1

    invoke-direct {v6, v2, v7}, Landroidx/compose/foundation/layout/LayoutWeightElement;-><init>(FZ)V

    invoke-static {v6, v14}, Landroidx/compose/foundation/layout/a;->u(Landroidx/compose/ui/Modifier;Ll0/a1;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    const/16 v6, 0x30

    invoke-static {v4, v15, v1, v6}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v4

    iget-wide v6, v1, Lp1/q;->T:J

    invoke-static {v6, v7}, Ljava/lang/Long;->hashCode(J)I

    move-result v6

    invoke-virtual {v1}, Lp1/q;->m()Lp1/p1;

    move-result-object v7

    invoke-static {v1, v2}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    invoke-virtual {v1}, Lp1/q;->i0()V

    iget-boolean v13, v1, Lp1/q;->S:Z

    if-eqz v13, :cond_b

    invoke-virtual {v1, v11}, Lp1/q;->l(Lc93/a;)V

    goto :goto_6

    :cond_b
    invoke-virtual {v1}, Lp1/q;->s0()V

    :goto_6
    invoke-static {v1, v12, v4}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    invoke-static {v1, v8, v7}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    iget-boolean v4, v1, Lp1/q;->S:Z

    if-nez v4, :cond_c

    invoke-virtual {v1}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v4

    invoke-static {v6}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v7

    invoke-static {v4, v7}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v4

    if-nez v4, :cond_d

    :cond_c
    invoke-static {v6, v1, v6, v10}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_d
    invoke-static {v1, v9, v2}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const-string v2, "Number"

    const/4 v4, 0x6

    invoke-static {v2, v1, v4}, Lkd1/k;->e(Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V

    invoke-static {v3, v5}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    invoke-static {v1, v2}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    const/4 v6, 0x0

    invoke-static {v1, v6}, Lpy0/d;->y(Landroidx/compose/runtime/Composer;I)Ljava/util/List;

    const/4 v2, 0x1

    invoke-virtual {v1, v2}, Lp1/q;->q(Z)V

    invoke-virtual {v1, v2}, Lp1/q;->q(Z)V

    goto :goto_7

    :cond_e
    invoke-virtual {v1}, Lp1/q;->X()V

    :goto_7
    invoke-virtual {v1}, Lp1/q;->u()Lp1/v1;

    move-result-object v1

    if-eqz v1, :cond_f

    new-instance v2, Lzc1/t7;

    const/4 v3, 0x1

    invoke-direct {v2, v0, v3}, Lzc1/t7;-><init>(II)V

    iput-object v2, v1, Lp1/v1;->d:Lc93/m;

    :cond_f
    return-void
.end method

.method private static final q(ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p0, p0, 0x1

    invoke-static {p0}, Lp1/x;->L(I)I

    move-result p0

    invoke-static {p1, p0}, Lzc1/u7;->p(Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method
