.class public abstract Lzc1/q6;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u001a\u000f\u0010\u0001\u001a\u00020\u0000H\u0007\u00a2\u0006\u0004\u0008\u0001\u0010\u0002\u00a8\u0006\u0003"
    }
    d2 = {
        "Ll83/a0;",
        "f",
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
.method public static synthetic a(ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    invoke-static {p0, p1, p2}, Lzc1/q6;->k(ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic b(Ljava/lang/Object;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lzc1/q6;->h(Ljava/lang/Object;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Ljava/lang/Object;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lzc1/q6;->g(Ljava/lang/Object;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic d(Ljava/lang/Object;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lzc1/q6;->i(Ljava/lang/Object;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic e(Ljava/lang/Object;)Ll83/a0;
    .locals 0

    invoke-static {p0}, Lzc1/q6;->j(Ljava/lang/Object;)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final f(Landroidx/compose/runtime/Composer;I)V
    .locals 13

    move-object v4, p0

    check-cast v4, Lp1/q;

    const p0, -0x2f318560

    invoke-virtual {v4, p0}, Lp1/q;->g0(I)Lp1/q;

    const/4 p0, 0x0

    const/4 v6, 0x1

    if-eqz p1, :cond_0

    move v0, v6

    goto :goto_0

    :cond_0
    move v0, p0

    :goto_0
    and-int/lit8 v1, p1, 0x1

    invoke-virtual {v4, v1, v0}, Lp1/q;->U(IZ)Z

    move-result v0

    if-eqz v0, :cond_8

    const/4 v0, 0x2

    int-to-float v0, v0

    const/16 v1, 0x8

    int-to-float v1, v1

    mul-float/2addr v0, v1

    move v2, v1

    sget-object v1, Lb2/t;->w:Lb2/t;

    invoke-static {v0, v1}, Landroidx/compose/foundation/layout/a;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    const/4 v3, 0x3

    int-to-float v5, v3

    mul-float/2addr v5, v2

    invoke-static {v5}, Ll0/m;->i(F)Ll0/k;

    move-result-object v2

    sget-object v5, Lb2/e;->M:Lb2/k;

    const/4 v7, 0x6

    invoke-static {v2, v5, v4, v7}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v2

    iget-wide v8, v4, Lp1/q;->T:J

    invoke-static {v8, v9}, Ljava/lang/Long;->hashCode(J)I

    move-result v5

    invoke-virtual {v4}, Lp1/q;->m()Lp1/p1;

    move-result-object v8

    invoke-static {v4, v0}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v0

    sget-object v9, La3/l;->a:La3/k;

    invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v9, La3/k;->b:La3/j;

    invoke-virtual {v4}, Lp1/q;->i0()V

    iget-boolean v10, v4, Lp1/q;->S:Z

    if-eqz v10, :cond_1

    invoke-virtual {v4, v9}, Lp1/q;->l(Lc93/a;)V

    goto :goto_1

    :cond_1
    invoke-virtual {v4}, Lp1/q;->s0()V

    :goto_1
    sget-object v9, La3/k;->g:La3/i;

    invoke-static {v4, v9, v2}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v2, La3/k;->f:La3/i;

    invoke-static {v4, v2, v8}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v2, La3/k;->j:La3/i;

    iget-boolean v8, v4, Lp1/q;->S:Z

    if-nez v8, :cond_2

    invoke-virtual {v4}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v8

    invoke-static {v5}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v9

    invoke-static {v8, v9}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v8

    if-nez v8, :cond_3

    :cond_2
    invoke-static {v5, v4, v5, v2}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_3
    sget-object v2, La3/k;->d:La3/i;

    invoke-static {v4, v2, v0}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const-string v0, "Default (num_selected = 3)"

    invoke-static {v0, v4, v7}, Lkd1/k;->c(Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V

    new-instance v0, Lg31/a;

    invoke-direct {v0}, Lg31/a;-><init>()V

    new-instance v2, Lg31/d;

    const/4 v8, 0x5

    const-string v9, "$rating"

    invoke-direct {v2, v8, v3, v9}, Lg31/d;-><init>(IILjava/lang/String;)V

    invoke-virtual {v4}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    sget-object v10, Lp1/l;->a:Lp1/v0;

    if-ne v5, v10, :cond_4

    new-instance v5, Lzc1/t5;

    const/4 v11, 0x4

    invoke-direct {v5, v11}, Lzc1/t5;-><init>(I)V

    invoke-virtual {v4, v5}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_4
    check-cast v5, Lkotlin/jvm/functions/Function1;

    sget v11, Lg31/d;->d:I

    shl-int/lit8 v3, v11, 0x3

    or-int/lit16 v3, v3, 0x186

    sget v11, Lg31/a;->a:I

    shl-int/lit8 v11, v11, 0x9

    or-int/2addr v3, v11

    move-object v12, v5

    move v5, v3

    move-object v3, v12

    invoke-virtual/range {v0 .. v5}, Lg31/a;->c(Landroidx/compose/ui/Modifier;Lg31/d;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    const-string v0, "Empty (num_selected = 0)"

    invoke-static {v0, v4, v7}, Lkd1/k;->c(Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V

    new-instance v0, Lg31/a;

    invoke-direct {v0}, Lg31/a;-><init>()V

    new-instance v2, Lg31/d;

    invoke-direct {v2, v8, p0, v9}, Lg31/d;-><init>(IILjava/lang/String;)V

    invoke-virtual {v4}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object p0

    if-ne p0, v10, :cond_5

    new-instance p0, Lzc1/t5;

    const/4 v3, 0x5

    invoke-direct {p0, v3}, Lzc1/t5;-><init>(I)V

    invoke-virtual {v4, p0}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_5
    move-object v3, p0

    check-cast v3, Lkotlin/jvm/functions/Function1;

    invoke-virtual/range {v0 .. v5}, Lg31/a;->c(Landroidx/compose/ui/Modifier;Lg31/d;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    const-string p0, "Full (num_selected = maximum)"

    invoke-static {p0, v4, v7}, Lkd1/k;->c(Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V

    new-instance v0, Lg31/a;

    invoke-direct {v0}, Lg31/a;-><init>()V

    new-instance v2, Lg31/d;

    invoke-direct {v2, v8, v8, v9}, Lg31/d;-><init>(IILjava/lang/String;)V

    invoke-virtual {v4}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object p0

    if-ne p0, v10, :cond_6

    new-instance p0, Lzc1/t5;

    const/4 v3, 0x6

    invoke-direct {p0, v3}, Lzc1/t5;-><init>(I)V

    invoke-virtual {v4, p0}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_6
    move-object v3, p0

    check-cast v3, Lkotlin/jvm/functions/Function1;

    invoke-virtual/range {v0 .. v5}, Lg31/a;->c(Landroidx/compose/ui/Modifier;Lg31/d;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    const-string p0, "Ten stars (maximum = 10)"

    invoke-static {p0, v4, v7}, Lkd1/k;->c(Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V

    new-instance v0, Lg31/a;

    invoke-direct {v0}, Lg31/a;-><init>()V

    new-instance v2, Lg31/d;

    const/16 p0, 0xa

    const/4 v3, 0x7

    invoke-direct {v2, p0, v3, v9}, Lg31/d;-><init>(IILjava/lang/String;)V

    invoke-virtual {v4}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object p0

    if-ne p0, v10, :cond_7

    new-instance p0, Lzc1/t5;

    const/4 v3, 0x7

    invoke-direct {p0, v3}, Lzc1/t5;-><init>(I)V

    invoke-virtual {v4, p0}, Lp1/q;->p0(Ljava/lang/Object;)V

    :cond_7
    move-object v3, p0

    check-cast v3, Lkotlin/jvm/functions/Function1;

    invoke-virtual/range {v0 .. v5}, Lg31/a;->c(Landroidx/compose/ui/Modifier;Lg31/d;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;I)V

    invoke-virtual {v4, v6}, Lp1/q;->q(Z)V

    goto :goto_2

    :cond_8
    invoke-virtual {v4}, Lp1/q;->X()V

    :goto_2
    invoke-virtual {v4}, Lp1/q;->u()Lp1/v1;

    move-result-object p0

    if-eqz p0, :cond_9

    new-instance v0, Lzc1/g6;

    const/4 v1, 0x5

    invoke-direct {v0, p1, v1}, Lzc1/g6;-><init>(II)V

    iput-object v0, p0, Lp1/v1;->d:Lc93/m;

    :cond_9
    return-void
.end method

.method private static final g(Ljava/lang/Object;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final h(Ljava/lang/Object;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final i(Ljava/lang/Object;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final j(Ljava/lang/Object;)Ll83/a0;
    .locals 1

    const-string v0, "it"

    invoke-static {p0, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method private static final k(ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p0, p0, 0x1

    invoke-static {p0}, Lp1/x;->L(I)I

    move-result p0

    invoke-static {p1, p0}, Lzc1/q6;->f(Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method
