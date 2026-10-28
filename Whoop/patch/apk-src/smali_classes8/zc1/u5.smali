.class public abstract Lzc1/u5;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u001a\u000f\u0010\u0001\u001a\u00020\u0000H\u0007\u00a2\u0006\u0004\u0008\u0001\u0010\u0002\u00a8\u0006\u0003"
    }
    d2 = {
        "Ll83/a0;",
        "i",
        "(Landroidx/compose/runtime/Composer;I)V",
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
.method public static synthetic a(Ljava/lang/Object;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lzc1/u5;->p(Ljava/lang/Object;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Ljava/lang/Object;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lzc1/u5;->j(Ljava/lang/Object;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Ljava/lang/Object;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lzc1/u5;->k(Ljava/lang/Object;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Ljava/lang/Object;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lzc1/u5;->o(Ljava/lang/Object;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic e(Ljava/lang/Object;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lzc1/u5;->n(Ljava/lang/Object;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic f(ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, Lzc1/u5;->q(ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic g(Ljava/lang/Object;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lzc1/u5;->l(Ljava/lang/Object;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic h(Ljava/lang/Object;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lzc1/u5;->m(Ljava/lang/Object;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final i(Landroidx/compose/runtime/Composer;I)V
    .locals 13

    check-cast p0, Lp1/q;

    const v0, 0x102d853c

    invoke-virtual {p0, v0}, Lp1/q;->g0(I)Lp1/q;

    const/4 v0, 0x1

    const/4 v1, 0x0

    if-eqz p1, :cond_0

    move v2, v0

    goto :goto_0

    :cond_0
    move v2, v1

    :goto_0
    and-int/lit8 v3, p1, 0x1

    invoke-virtual {p0, v3, v2}, Lp1/q;->U(IZ)Z

    move-result v2

    if-eqz v2, :cond_12

    const/high16 v2, 0x3f800000    # 1.0f

    sget-object v3, Lb2/t;->w:Lb2/t;

    invoke-static {v2, v3}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    sget-object v4, Lb2/e;->N:Lb2/k;

    sget-object v5, Ll0/m;->c:Ll0/g;

    const/16 v6, 0x30

    invoke-static {v5, v4, p0, v6}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v4

    iget-wide v7, p0, Lp1/q;->T:J

    invoke-static {v7, v8}, Ljava/lang/Long;->hashCode(J)I

    move-result v5

    invoke-virtual {p0}, Lp1/q;->m()Lp1/p1;

    move-result-object v7

    invoke-static {p0, v2}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v2

    sget-object v8, La3/l;->a:La3/k;

    invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v8, La3/k;->b:La3/j;

    invoke-virtual {p0}, Lp1/q;->i0()V

    iget-boolean v9, p0, Lp1/q;->S:Z

    if-eqz v9, :cond_1

    invoke-virtual {p0, v8}, Lp1/q;->l(Lc93/a;)V

    goto :goto_1

    :cond_1
    invoke-virtual {p0}, Lp1/q;->s0()V

    :goto_1
    sget-object v8, La3/k;->g:La3/i;

    invoke-static {p0, v8, v4}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v4, La3/k;->f:La3/i;

    invoke-static {p0, v4, v7}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v4, La3/k;->j:La3/i;

    iget-boolean v7, p0, Lp1/q;->S:Z

    if-nez v7, :cond_2

    invoke-virtual {p0}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v7

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v8

    invoke-static {v7, v8}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v7

    if-nez v7, :cond_3

    :cond_2
    invoke-static {v5, p0, v5, v4}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_3
    sget-object v4, La3/k;->d:La3/i;

    invoke-static {p0, v4, v2}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const-string v2, "High Recovery"

    const/4 v4, 0x6

    invoke-static {v2, p0, v4}, Lkd1/k;->c(Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V

    const v2, 0x254cccb4

    invoke-virtual {p0, v2}, Lp1/q;->e0(I)V

    invoke-static {}, Lz51/j;->c()Ljava/util/List;

    move-result-object v2

    check-cast v2, Ljava/lang/Iterable;

    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_2
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v5

    sget-object v7, Lp1/l;->a:Lp1/v0;

    if-eqz v5, :cond_5

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v5

    check-cast v5, Lz51/l;

    new-instance v8, Lz51/b;

    invoke-direct {v8}, Lz51/b;-><init>()V

    invoke-virtual {p0}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v9

    if-ne v9, v7, :cond_4

    new-instance v9, Lzc1/w1;

    const/16 v7, 0x18

    invoke-direct {v9, v7}, Lzc1/w1;-><init>(I)V

    invoke-virtual {p0, v9}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_4
    check-cast v9, Lkotlin/jvm/functions/Function1;

    sget v7, Lz51/l;->t:I

    or-int/2addr v7, v6

    sget v10, Lz51/b;->a:I

    shl-int/2addr v10, v4

    or-int/2addr v7, v10

    invoke-virtual {v8, v5, v9, p0, v7}, Lz51/b;->Compose(Lm91/u;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    goto :goto_2

    :cond_5
    invoke-virtual {p0, v1}, Lp1/q;->q(Z)V

    const/4 v2, 0x2

    int-to-float v2, v2

    const/4 v5, 0x4

    int-to-float v5, v5

    mul-float/2addr v2, v5

    invoke-static {v2, v3}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v5

    invoke-static {p0, v5}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    const-string v5, "Empty Strain"

    invoke-static {v5, p0, v4}, Lkd1/k;->c(Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V

    const v5, 0x254ce6d4

    invoke-virtual {p0, v5}, Lp1/q;->e0(I)V

    invoke-static {}, Lz51/j;->a()Ljava/util/List;

    move-result-object v5

    check-cast v5, Ljava/lang/Iterable;

    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_3
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    if-eqz v8, :cond_7

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lz51/l;

    new-instance v9, Lz51/b;

    invoke-direct {v9}, Lz51/b;-><init>()V

    invoke-virtual {p0}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v10

    if-ne v10, v7, :cond_6

    new-instance v10, Lzc1/w1;

    const/16 v11, 0x19

    invoke-direct {v10, v11}, Lzc1/w1;-><init>(I)V

    invoke-virtual {p0, v10}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_6
    check-cast v10, Lkotlin/jvm/functions/Function1;

    sget v11, Lz51/l;->t:I

    or-int/2addr v11, v6

    sget v12, Lz51/b;->a:I

    shl-int/2addr v12, v4

    or-int/2addr v11, v12

    invoke-virtual {v9, v8, v10, p0, v11}, Lz51/b;->Compose(Lm91/u;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    goto :goto_3

    :cond_7
    invoke-static {p0, v1, v3, v2, p0}, Lhc3/i;->r(Lp1/q;ZLb2/t;FLp1/q;)V

    const-string v5, "Optimal Strain"

    invoke-static {v5, p0, v4}, Lkd1/k;->c(Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V

    const v5, 0x254d0174

    invoke-virtual {p0, v5}, Lp1/q;->e0(I)V

    invoke-static {}, Lz51/j;->e()Ljava/util/List;

    move-result-object v5

    check-cast v5, Ljava/lang/Iterable;

    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_4
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    if-eqz v8, :cond_9

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lz51/l;

    new-instance v9, Lz51/b;

    invoke-direct {v9}, Lz51/b;-><init>()V

    invoke-virtual {p0}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v10

    if-ne v10, v7, :cond_8

    new-instance v10, Lzc1/w1;

    const/16 v11, 0x1a

    invoke-direct {v10, v11}, Lzc1/w1;-><init>(I)V

    invoke-virtual {p0, v10}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_8
    check-cast v10, Lkotlin/jvm/functions/Function1;

    sget v11, Lz51/l;->t:I

    or-int/2addr v11, v6

    sget v12, Lz51/b;->a:I

    shl-int/2addr v12, v4

    or-int/2addr v11, v12

    invoke-virtual {v9, v8, v10, p0, v11}, Lz51/b;->Compose(Lm91/u;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    goto :goto_4

    :cond_9
    invoke-static {p0, v1, v3, v2, p0}, Lhc3/i;->r(Lp1/q;ZLb2/t;FLp1/q;)V

    const-string v5, "With HRV Trend"

    invoke-static {v5, p0, v4}, Lkd1/k;->c(Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V

    const v5, 0x254d1cd4

    invoke-virtual {p0, v5}, Lp1/q;->e0(I)V

    invoke-static {}, Lz51/j;->g()Ljava/util/List;

    move-result-object v5

    check-cast v5, Ljava/lang/Iterable;

    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_5
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    if-eqz v8, :cond_b

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lz51/l;

    new-instance v9, Lz51/b;

    invoke-direct {v9}, Lz51/b;-><init>()V

    invoke-virtual {p0}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v10

    if-ne v10, v7, :cond_a

    new-instance v10, Lzc1/w1;

    const/16 v11, 0x1b

    invoke-direct {v10, v11}, Lzc1/w1;-><init>(I)V

    invoke-virtual {p0, v10}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_a
    check-cast v10, Lkotlin/jvm/functions/Function1;

    sget v11, Lz51/l;->t:I

    or-int/2addr v11, v6

    sget v12, Lz51/b;->a:I

    shl-int/2addr v12, v4

    or-int/2addr v11, v12

    invoke-virtual {v9, v8, v10, p0, v11}, Lz51/b;->Compose(Lm91/u;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    goto :goto_5

    :cond_b
    invoke-virtual {p0, v1}, Lp1/q;->q(Z)V

    const-string v5, "High Recovery V2"

    invoke-static {v5, p0, v4}, Lkd1/k;->c(Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V

    const v5, 0x254d33f4

    invoke-virtual {p0, v5}, Lp1/q;->e0(I)V

    invoke-static {}, Lz51/j;->d()Ljava/util/List;

    move-result-object v5

    check-cast v5, Ljava/lang/Iterable;

    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_6
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    if-eqz v8, :cond_d

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lz51/l;

    new-instance v9, Lz51/b;

    invoke-direct {v9}, Lz51/b;-><init>()V

    invoke-virtual {p0}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v10

    if-ne v10, v7, :cond_c

    new-instance v10, Lzc1/w1;

    const/16 v11, 0x1c

    invoke-direct {v10, v11}, Lzc1/w1;-><init>(I)V

    invoke-virtual {p0, v10}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_c
    check-cast v10, Lkotlin/jvm/functions/Function1;

    sget v11, Lz51/l;->t:I

    or-int/2addr v11, v6

    sget v12, Lz51/b;->a:I

    shl-int/2addr v12, v4

    or-int/2addr v11, v12

    invoke-virtual {v9, v8, v10, p0, v11}, Lz51/b;->Compose(Lm91/u;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    goto :goto_6

    :cond_d
    invoke-static {p0, v1, v3, v2, p0}, Lhc3/i;->r(Lp1/q;ZLb2/t;FLp1/q;)V

    const-string v5, "Empty Strain V2"

    invoke-static {v5, p0, v4}, Lkd1/k;->c(Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V

    const v5, 0x254d5134

    invoke-virtual {p0, v5}, Lp1/q;->e0(I)V

    invoke-static {}, Lz51/j;->b()Ljava/util/List;

    move-result-object v5

    check-cast v5, Ljava/lang/Iterable;

    invoke-interface {v5}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v5

    :goto_7
    invoke-interface {v5}, Ljava/util/Iterator;->hasNext()Z

    move-result v8

    if-eqz v8, :cond_f

    invoke-interface {v5}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v8

    check-cast v8, Lz51/l;

    new-instance v9, Lz51/b;

    invoke-direct {v9}, Lz51/b;-><init>()V

    invoke-virtual {p0}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v10

    if-ne v10, v7, :cond_e

    new-instance v10, Lzc1/w1;

    const/16 v11, 0x1d

    invoke-direct {v10, v11}, Lzc1/w1;-><init>(I)V

    invoke-virtual {p0, v10}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_e
    check-cast v10, Lkotlin/jvm/functions/Function1;

    sget v11, Lz51/l;->t:I

    or-int/2addr v11, v6

    sget v12, Lz51/b;->a:I

    shl-int/2addr v12, v4

    or-int/2addr v11, v12

    invoke-virtual {v9, v8, v10, p0, v11}, Lz51/b;->Compose(Lm91/u;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    goto :goto_7

    :cond_f
    invoke-static {p0, v1, v3, v2, p0}, Lhc3/i;->r(Lp1/q;ZLb2/t;FLp1/q;)V

    const-string v2, "Optimal Strain V2"

    invoke-static {v2, p0, v4}, Lkd1/k;->c(Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V

    const v2, 0x254d6ef4

    invoke-virtual {p0, v2}, Lp1/q;->e0(I)V

    invoke-static {}, Lz51/j;->f()Ljava/util/List;

    move-result-object v2

    check-cast v2, Ljava/lang/Iterable;

    invoke-interface {v2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v2

    :goto_8
    invoke-interface {v2}, Ljava/util/Iterator;->hasNext()Z

    move-result v3

    if-eqz v3, :cond_11

    invoke-interface {v2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lz51/l;

    new-instance v5, Lz51/b;

    invoke-direct {v5}, Lz51/b;-><init>()V

    invoke-virtual {p0}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v8

    if-ne v8, v7, :cond_10

    new-instance v8, Lzc1/t5;

    const/4 v9, 0x0

    invoke-direct {v8, v9}, Lzc1/t5;-><init>(I)V

    invoke-virtual {p0, v8}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_10
    check-cast v8, Lkotlin/jvm/functions/Function1;

    sget v9, Lz51/l;->t:I

    or-int/2addr v9, v6

    sget v10, Lz51/b;->a:I

    shl-int/2addr v10, v4

    or-int/2addr v9, v10

    invoke-virtual {v5, v3, v8, p0, v9}, Lz51/b;->Compose(Lm91/u;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    goto :goto_8

    :cond_11
    invoke-virtual {p0, v1}, Lp1/q;->q(Z)V

    invoke-virtual {p0, v0}, Lp1/q;->q(Z)V

    goto :goto_9

    :cond_12
    invoke-virtual {p0}, Lp1/q;->X()V

    :goto_9
    invoke-virtual {p0}, Lp1/q;->u()Lp1/v1;

    move-result-object p0

    if-eqz p0, :cond_13

    new-instance v0, Lzc1/a5;

    const/16 v1, 0x15

    invoke-direct {v0, p1, v1}, Lzc1/a5;-><init>(II)V

    iput-object v0, p0, Lp1/v1;->d:Lc93/m;

    :cond_13
    return-void
.end method

.method private static final j(Ljava/lang/Object;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final k(Ljava/lang/Object;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final l(Ljava/lang/Object;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final m(Ljava/lang/Object;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final n(Ljava/lang/Object;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final o(Ljava/lang/Object;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final p(Ljava/lang/Object;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final q(ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p0, p0, 0x1

    invoke-static {p0}, Lp1/x;->L(I)I

    move-result p0

    invoke-static {p1, p0}, Lzc1/u5;->i(Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method
