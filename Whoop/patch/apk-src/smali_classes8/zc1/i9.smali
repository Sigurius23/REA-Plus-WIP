.class public abstract Lzc1/i9;
.super Ljava/lang/Object;
.source "SourceFile"


# annotations
.annotation runtime Lkotlin/Metadata;
    d1 = {
        "\u0000\u0008\n\u0002\u0018\u0002\n\u0002\u0008\u0003\u001a\u000f\u0010\u0001\u001a\u00020\u0000H\u0001\u00a2\u0006\u0004\u0008\u0001\u0010\u0002\u00a8\u0006\u0003"
    }
    d2 = {
        "Ll83/a0;",
        "b",
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

    invoke-static {p0, p1, p2}, Lzc1/i9;->c(ILandroidx/compose/runtime/Composer;I)Ll83/a0;

    move-result-object p0

    return-object p0
.end method

.method public static final b(Landroidx/compose/runtime/Composer;I)V
    .locals 14

    sget-object v0, Lb2/e;->M:Lb2/k;

    move-object v4, p0

    check-cast v4, Lp1/q;

    const p0, 0x5e889300

    invoke-virtual {v4, p0}, Lp1/q;->g0(I)Lp1/q;

    const/4 p0, 0x1

    const/4 v8, 0x0

    if-eqz p1, :cond_0

    move v1, p0

    goto :goto_0

    :cond_0
    move v1, v8

    :goto_0
    and-int/lit8 v2, p1, 0x1

    invoke-virtual {v4, v2, v1}, Lp1/q;->U(IZ)Z

    move-result v1

    if-eqz v1, :cond_6

    const/high16 v1, 0x3f800000    # 1.0f

    sget-object v9, Lb2/t;->w:Lb2/t;

    invoke-static {v1, v9}, Landroidx/compose/foundation/layout/d;->f(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    invoke-static {v8, v4, p0}, Lq83/g;->U(ILandroidx/compose/runtime/Composer;I)Lf0/r1;

    move-result-object v2

    const/16 v3, 0xe

    invoke-static {v1, v2, v3}, Lq83/g;->f0(Landroidx/compose/ui/Modifier;Lf0/r1;I)Landroidx/compose/ui/Modifier;

    move-result-object v1

    const/4 v2, 0x2

    int-to-float v2, v2

    const/16 v3, 0x8

    int-to-float v3, v3

    mul-float/2addr v2, v3

    invoke-static {v2, v1}, Landroidx/compose/foundation/layout/a;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    sget-object v2, Ll0/m;->c:Ll0/g;

    invoke-static {v2, v0, v4, v8}, Ll0/w;->a(Ll0/l;Lb2/f;Landroidx/compose/runtime/Composer;I)Ll0/x;

    move-result-object v2

    iget-wide v5, v4, Lp1/q;->T:J

    invoke-static {v5, v6}, Ljava/lang/Long;->hashCode(J)I

    move-result v3

    invoke-virtual {v4}, Lp1/q;->m()Lp1/p1;

    move-result-object v5

    invoke-static {v4, v1}, Lwb3/f;->N(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    sget-object v6, La3/l;->a:La3/k;

    invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    sget-object v6, La3/k;->b:La3/j;

    invoke-virtual {v4}, Lp1/q;->i0()V

    iget-boolean v7, v4, Lp1/q;->S:Z

    if-eqz v7, :cond_1

    invoke-virtual {v4, v6}, Lp1/q;->l(Lc93/a;)V

    goto :goto_1

    :cond_1
    invoke-virtual {v4}, Lp1/q;->s0()V

    :goto_1
    sget-object v6, La3/k;->g:La3/i;

    invoke-static {v4, v6, v2}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v2, La3/k;->f:La3/i;

    invoke-static {v4, v2, v5}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    sget-object v2, La3/k;->j:La3/i;

    iget-boolean v5, v4, Lp1/q;->S:Z

    if-nez v5, :cond_2

    invoke-virtual {v4}, Lp1/q;->R()Ljava/lang/Object;

    move-result-object v5

    invoke-static {v3}, Ljava/lang/Integer;->valueOf(I)Ljava/lang/Integer;

    move-result-object v6

    invoke-static {v5, v6}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v5

    if-nez v5, :cond_3

    :cond_2
    invoke-static {v3, v4, v3, v2}, Ld;->y(ILp1/q;ILa3/i;)V

    :cond_3
    sget-object v2, La3/k;->d:La3/i;

    invoke-static {v4, v2, v1}, Lp1/x;->G(Landroidx/compose/runtime/Composer;Lc93/m;Ljava/lang/Object;)V

    const-string v1, "Fill text beside hugging image"

    const/4 v10, 0x6

    invoke-static {v1, v4, v10}, Lkd1/k;->c(Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V

    sget-object v7, Li81/b;->a:Li81/b;

    invoke-virtual {v7}, Li81/b;->g()Ls81/h;

    move-result-object v2

    sget v1, Ls81/h;->i:I

    shl-int/lit8 v5, v1, 0x3

    const/4 v6, 0x5

    const/4 v1, 0x0

    const/4 v3, 0x0

    invoke-static/range {v1 .. v6}, Ls81/g;->i(Landroidx/compose/ui/Modifier;Ls81/h;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    const/4 v1, 0x4

    int-to-float v11, v1

    mul-float v12, v11, v11

    invoke-static {v12, v9}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    invoke-static {v4, v1}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    const-string v1, "Hugging emoji and ring beside fill text"

    invoke-static {v1, v4, v10}, Lkd1/k;->c(Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V

    invoke-virtual {v7}, Li81/b;->h()Ls81/h;

    move-result-object v2

    const/4 v1, 0x0

    invoke-static/range {v1 .. v6}, Ls81/g;->i(Landroidx/compose/ui/Modifier;Ls81/h;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    invoke-static {v12, v9}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    invoke-static {v4, v1}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    const-string v1, "Weighted 1:9 day rows"

    invoke-static {v1, v4, v10}, Lkd1/k;->c(Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V

    const v1, 0x752bf94b

    invoke-virtual {v4, v1}, Lp1/q;->e0(I)V

    invoke-virtual {v7}, Li81/b;->e()Ljava/util/List;

    move-result-object v1

    check-cast v1, Ljava/lang/Iterable;

    invoke-interface {v1}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v13

    :goto_2
    invoke-interface {v13}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_4

    invoke-interface {v13}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Lm91/u;

    const/4 v6, 0x0

    const/16 v7, 0xe

    const/4 v2, 0x0

    const/4 v3, 0x0

    move-object v5, v4

    const/4 v4, 0x0

    invoke-static/range {v1 .. v7}, Lm91/l;->r(Lm91/u;Lm91/p;Lkotlin/jvm/functions/Function3;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    move-object v4, v5

    goto :goto_2

    :cond_4
    invoke-static {v4, v8, v9, v12, v4}, Lhc3/i;->r(Lp1/q;ZLb2/t;FLp1/q;)V

    const-string v1, "Main axis alignment: start, center, end"

    invoke-static {v1, v4, v10}, Lkd1/k;->c(Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V

    const v1, 0x752c1b1f

    invoke-virtual {v4, v1}, Lp1/q;->e0(I)V

    new-instance v1, Ll83/k;

    const-string v2, "start"

    invoke-direct {v1, v0, v2}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    sget-object v0, Lb2/e;->N:Lb2/k;

    new-instance v2, Ll83/k;

    const-string v3, "center"

    invoke-direct {v2, v0, v3}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    sget-object v0, Lb2/e;->O:Lb2/k;

    new-instance v3, Ll83/k;

    const-string v5, "end"

    invoke-direct {v3, v0, v5}, Ll83/k;-><init>(Ljava/lang/Object;Ljava/lang/Object;)V

    filled-new-array {v1, v2, v3}, [Ll83/k;

    move-result-object v0

    invoke-static {v0}, Lwb3/f;->K([Ljava/lang/Object;)Ljava/util/List;

    move-result-object v0

    check-cast v0, Ljava/lang/Iterable;

    invoke-interface {v0}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object v0

    :goto_3
    invoke-interface {v0}, Ljava/util/Iterator;->hasNext()Z

    move-result v1

    if-eqz v1, :cond_5

    invoke-interface {v0}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v1

    check-cast v1, Ll83/k;

    iget-object v2, v1, Ll83/k;->w:Ljava/lang/Object;

    check-cast v2, Lb2/f;

    iget-object v1, v1, Ll83/k;->x:Ljava/lang/Object;

    check-cast v1, Ljava/lang/String;

    sget-object v3, Li81/b;->a:Li81/b;

    invoke-virtual {v3, v2, v1}, Li81/b;->j(Lb2/f;Ljava/lang/String;)Ls81/h;

    move-result-object v2

    sget v1, Ls81/h;->i:I

    shl-int/lit8 v5, v1, 0x3

    const/4 v6, 0x5

    const/4 v1, 0x0

    const/4 v3, 0x0

    invoke-static/range {v1 .. v6}, Ls81/g;->i(Landroidx/compose/ui/Modifier;Ls81/h;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    goto :goto_3

    :cond_5
    invoke-static {v4, v8, v9, v12, v4}, Lhc3/i;->r(Lp1/q;ZLb2/t;FLp1/q;)V

    const-string v0, "Spacer distribution with padding"

    invoke-static {v0, v4, v10}, Lkd1/k;->c(Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V

    sget-object v0, Li81/b;->a:Li81/b;

    invoke-virtual {v0}, Li81/b;->i()Ls81/h;

    move-result-object v2

    sget v1, Ls81/h;->i:I

    shl-int/lit8 v5, v1, 0x3

    const/4 v6, 0x5

    const/4 v1, 0x0

    const/4 v3, 0x0

    invoke-static/range {v1 .. v6}, Ls81/g;->i(Landroidx/compose/ui/Modifier;Ls81/h;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    move v7, v5

    invoke-static {v12, v9}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    invoke-static {v4, v1}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    const-string v1, "Cross axis fill, items at end"

    invoke-static {v1, v4, v10}, Lkd1/k;->c(Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V

    const/16 v1, 0xf

    int-to-float v1, v1

    mul-float/2addr v1, v11

    invoke-static {v1, v9}, Landroidx/compose/foundation/layout/d;->h(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    invoke-virtual {v0}, Li81/b;->d()Ls81/h;

    move-result-object v2

    or-int/lit8 v5, v7, 0x6

    const/4 v6, 0x4

    invoke-static/range {v1 .. v6}, Ls81/g;->i(Landroidx/compose/ui/Modifier;Ls81/h;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    invoke-static {v12, v9}, Landroidx/compose/foundation/layout/d;->p(FLandroidx/compose/ui/Modifier;)Landroidx/compose/ui/Modifier;

    move-result-object v1

    invoke-static {v4, v1}, Ll0/f;->b(Landroidx/compose/runtime/Composer;Landroidx/compose/ui/Modifier;)V

    const-string v1, "Equal fill"

    invoke-static {v1, v4, v10}, Lkd1/k;->c(Ljava/lang/String;Landroidx/compose/runtime/Composer;I)V

    invoke-virtual {v0}, Li81/b;->f()Ls81/h;

    move-result-object v2

    const/4 v6, 0x5

    const/4 v1, 0x0

    move v5, v7

    invoke-static/range {v1 .. v6}, Ls81/g;->i(Landroidx/compose/ui/Modifier;Ls81/h;Lkotlin/jvm/functions/Function1;Landroidx/compose/runtime/Composer;II)V

    invoke-virtual {v4, p0}, Lp1/q;->q(Z)V

    goto :goto_4

    :cond_6
    invoke-virtual {v4}, Lp1/q;->X()V

    :goto_4
    invoke-virtual {v4}, Lp1/q;->u()Lp1/v1;

    move-result-object p0

    if-eqz p0, :cond_7

    new-instance v0, Lzc1/w8;

    const/16 v1, 0xb

    invoke-direct {v0, p1, v1}, Lzc1/w8;-><init>(II)V

    iput-object v0, p0, Lp1/v1;->d:Lc93/m;

    :cond_7
    return-void
.end method

.method private static final c(ILandroidx/compose/runtime/Composer;I)Ll83/a0;
    .locals 0

    or-int/lit8 p0, p0, 0x1

    invoke-static {p0}, Lp1/x;->L(I)I

    move-result p0

    invoke-static {p1, p0}, Lzc1/i9;->b(Landroidx/compose/runtime/Composer;I)V

    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method
