.class public abstract Lh0/o3;
.super Ljava/lang/Object;
.source "SourceFile"


# static fields
.field public static final a:Lh0/d3;


# direct methods
.method static constructor <clinit>()V
    .locals 3

    new-instance v0, Lh0/d3;

    const/4 v1, 0x0

    const/4 v2, 0x3

    invoke-direct {v0, v2, v1}, Ls83/i;-><init>(ILq83/d;)V

    sput-object v0, Lh0/o3;->a:Lh0/d3;

    return-void
.end method

.method public static final a(Lu2/b;Ls83/a;)Ljava/lang/Object;
    .locals 8

    instance-of v0, p1, Lh0/h3;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Lh0/h3;

    iget v1, v0, Lh0/h3;->y:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lh0/h3;->y:I

    goto :goto_0

    :cond_0
    new-instance v0, Lh0/h3;

    invoke-direct {v0, p1}, Ls83/c;-><init>(Lq83/d;)V

    :goto_0
    iget-object p1, v0, Lh0/h3;->x:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lh0/h3;->y:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p0, v0, Lh0/h3;->w:Lu2/b;

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_2

    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_2
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    :goto_1
    iput-object p0, v0, Lh0/h3;->w:Lu2/b;

    iput v3, v0, Lh0/h3;->y:I

    invoke-static {p0, v0}, Lu2/b;->H(Lu2/b;Ls83/a;)Ljava/lang/Object;

    move-result-object p1

    if-ne p1, v1, :cond_3

    return-object v1

    :cond_3
    :goto_2
    check-cast p1, Lu2/k;

    iget-object v2, p1, Lu2/k;->a:Ljava/lang/Object;

    move-object v4, v2

    check-cast v4, Ljava/util/Collection;

    invoke-interface {v4}, Ljava/util/Collection;->size()I

    move-result v4

    const/4 v5, 0x0

    move v6, v5

    :goto_3
    if-ge v6, v4, :cond_4

    invoke-interface {v2, v6}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v7

    check-cast v7, Lu2/r;

    invoke-virtual {v7}, Lu2/r;->a()V

    add-int/lit8 v6, v6, 0x1

    goto :goto_3

    :cond_4
    iget-object p1, p1, Lu2/k;->a:Ljava/lang/Object;

    move-object v2, p1

    check-cast v2, Ljava/util/Collection;

    invoke-interface {v2}, Ljava/util/Collection;->size()I

    move-result v2

    :goto_4
    if-ge v5, v2, :cond_6

    invoke-interface {p1, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v4

    check-cast v4, Lu2/r;

    iget-boolean v4, v4, Lu2/r;->d:Z

    if-eqz v4, :cond_5

    goto :goto_1

    :cond_5
    add-int/lit8 v5, v5, 0x1

    goto :goto_4

    :cond_6
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static final b(Lu2/b;ZLu2/l;Lq83/d;)Ljava/lang/Object;
    .locals 6

    instance-of v0, p3, Lh0/e3;

    if-eqz v0, :cond_0

    move-object v0, p3

    check-cast v0, Lh0/e3;

    iget v1, v0, Lh0/e3;->E:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lh0/e3;->E:I

    goto :goto_0

    :cond_0
    new-instance v0, Lh0/e3;

    invoke-direct {v0, p3}, Ls83/c;-><init>(Lq83/d;)V

    :goto_0
    iget-object p3, v0, Lh0/e3;->z:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lh0/e3;->E:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-boolean p0, v0, Lh0/e3;->y:Z

    iget-object p1, v0, Lh0/e3;->x:Lu2/l;

    iget-object p2, v0, Lh0/e3;->w:Lu2/b;

    invoke-static {p3}, Lts/o;->I(Ljava/lang/Object;)V

    move-object v5, p1

    move p1, p0

    move-object p0, p2

    move-object p2, v5

    goto :goto_1

    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_2
    invoke-static {p3}, Lts/o;->I(Ljava/lang/Object;)V

    :cond_3
    iput-object p0, v0, Lh0/e3;->w:Lu2/b;

    iput-object p2, v0, Lh0/e3;->x:Lu2/l;

    iput-boolean p1, v0, Lh0/e3;->y:Z

    iput v3, v0, Lh0/e3;->E:I

    check-cast p0, Lu2/g0;

    invoke-virtual {p0, p2, v0}, Lu2/g0;->a(Lu2/l;Lq83/d;)Ljava/lang/Object;

    move-result-object p3

    if-ne p3, v1, :cond_4

    return-object v1

    :cond_4
    :goto_1
    check-cast p3, Lu2/k;

    const/4 v2, 0x0

    invoke-static {p3, p1, v2}, Lh0/o3;->f(Lu2/k;ZZ)Z

    move-result v4

    if-eqz v4, :cond_3

    iget-object p0, p3, Lu2/k;->a:Ljava/lang/Object;

    invoke-interface {p0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static synthetic c(Lu2/b;Lq83/d;I)Ljava/lang/Object;
    .locals 2

    sget-object v0, Lu2/l;->w:Lu2/l;

    and-int/lit8 v1, p2, 0x1

    if-eqz v1, :cond_0

    const/4 v1, 0x1

    goto :goto_0

    :cond_0
    const/4 v1, 0x0

    :goto_0
    and-int/lit8 p2, p2, 0x2

    if-eqz p2, :cond_1

    sget-object v0, Lu2/l;->x:Lu2/l;

    :cond_1
    invoke-static {p0, v1, v0, p1}, Lh0/o3;->b(Lu2/b;ZLu2/l;Lq83/d;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final d(Lu2/b;Lu2/l;Ls83/a;)Ljava/lang/Object;
    .locals 6

    instance-of v0, p2, Lh0/f3;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lh0/f3;

    iget v1, v0, Lh0/f3;->z:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lh0/f3;->z:I

    goto :goto_0

    :cond_0
    new-instance v0, Lh0/f3;

    invoke-direct {v0, p2}, Ls83/c;-><init>(Lq83/d;)V

    :goto_0
    iget-object p2, v0, Lh0/f3;->y:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lh0/f3;->z:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p0, v0, Lh0/f3;->x:Lu2/l;

    iget-object p1, v0, Lh0/f3;->w:Lu2/b;

    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    move-object v5, p1

    move-object p1, p0

    move-object p0, v5

    goto :goto_1

    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_2
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V

    :cond_3
    iput-object p0, v0, Lh0/f3;->w:Lu2/b;

    iput-object p1, v0, Lh0/f3;->x:Lu2/l;

    iput v3, v0, Lh0/f3;->z:I

    check-cast p0, Lu2/g0;

    invoke-virtual {p0, p1, v0}, Lu2/g0;->a(Lu2/l;Lq83/d;)Ljava/lang/Object;

    move-result-object p2

    if-ne p2, v1, :cond_4

    return-object v1

    :cond_4
    :goto_1
    check-cast p2, Lu2/k;

    const/4 v2, 0x0

    invoke-static {p2, v2, v3}, Lh0/o3;->f(Lu2/k;ZZ)Z

    move-result v4

    if-eqz v4, :cond_3

    iget-object p0, p2, Lu2/k;->a:Ljava/lang/Object;

    invoke-interface {p0, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static e(Lu2/v;Lkotlin/jvm/functions/Function1;Lm12/c;Lg1/d6;Lkotlin/jvm/functions/Function1;Lq83/d;I)Ljava/lang/Object;
    .locals 10

    and-int/lit8 v0, p6, 0x1

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    move-object v6, v1

    goto :goto_0

    :cond_0
    move-object v6, p1

    :goto_0
    and-int/lit8 p1, p6, 0x2

    if-eqz p1, :cond_1

    move-object v5, v1

    goto :goto_1

    :cond_1
    move-object v5, p2

    :goto_1
    and-int/lit8 p1, p6, 0x4

    if-eqz p1, :cond_2

    sget-object p3, Lh0/o3;->a:Lh0/d3;

    :cond_2
    move-object v4, p3

    and-int/lit8 p1, p6, 0x8

    if-eqz p1, :cond_3

    move-object v7, v1

    goto :goto_2

    :cond_3
    move-object v7, p4

    :goto_2
    new-instance v2, La30/s;

    const/4 v8, 0x0

    const/4 v9, 0x2

    move-object v3, p0

    invoke-direct/range {v2 .. v9}, La30/s;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V

    invoke-static {v2, p5}, Lbc3/f0;->m(Lc93/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p0

    sget-object p1, Lr83/a;->w:Lr83/a;

    if-ne p0, p1, :cond_4

    return-object p0

    :cond_4
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static final f(Lu2/k;ZZ)Z
    .locals 5

    const/4 v0, 0x0

    if-eqz p2, :cond_2

    iget-object p2, p0, Lu2/k;->a:Ljava/lang/Object;

    move-object v1, p2

    check-cast v1, Ljava/util/Collection;

    invoke-interface {v1}, Ljava/util/Collection;->size()I

    move-result v1

    move v2, v0

    :goto_0
    if-ge v2, v1, :cond_0

    invoke-interface {p2, v2}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v3

    check-cast v3, Lu2/r;

    iget v3, v3, Lu2/r;->i:I

    const/4 v4, 0x2

    if-ne v3, v4, :cond_2

    add-int/lit8 v2, v2, 0x1

    goto :goto_0

    :cond_0
    iget p2, p0, Lu2/k;->d:I

    and-int/lit8 p2, p2, 0x21

    if-eqz p2, :cond_1

    goto :goto_1

    :cond_1
    return v0

    :cond_2
    :goto_1
    iget-object p0, p0, Lu2/k;->a:Ljava/lang/Object;

    move-object p2, p0

    check-cast p2, Ljava/util/Collection;

    invoke-interface {p2}, Ljava/util/Collection;->size()I

    move-result p2

    move v1, v0

    :goto_2
    if-ge v1, p2, :cond_5

    invoke-interface {p0, v1}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v2

    check-cast v2, Lu2/r;

    if-eqz p1, :cond_3

    invoke-static {v2}, Lu2/d0;->b(Lu2/r;)Z

    move-result v2

    goto :goto_3

    :cond_3
    invoke-static {v2}, Lu2/d0;->c(Lu2/r;)Z

    move-result v2

    :goto_3
    if-nez v2, :cond_4

    return v0

    :cond_4
    add-int/lit8 v1, v1, 0x1

    goto :goto_2

    :cond_5
    const/4 p0, 0x1

    return p0
.end method

.method public static synthetic g(Lu2/k;Z)Z
    .locals 1

    const/4 v0, 0x0

    invoke-static {p0, p1, v0}, Lh0/o3;->f(Lu2/k;ZZ)Z

    move-result p0

    return p0
.end method

.method public static h(Lbc3/c0;Lbc3/k1;Lc93/m;)Lbc3/c2;
    .locals 3

    sget-object v0, Lbc3/d0;->z:Lbc3/d0;

    new-instance v1, Lg20/p;

    const/4 v2, 0x0

    invoke-direct {v1, p1, p2, v2}, Lg20/p;-><init>(Lbc3/k1;Lc93/m;Lq83/d;)V

    const/4 p1, 0x1

    invoke-static {p0, v2, v0, v1, p1}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    move-result-object p0

    return-object p0
.end method

.method public static final i(Lu2/b;Lu2/l;Ls83/a;)Ljava/lang/Object;
    .locals 8

    instance-of v0, p2, Lh0/m3;

    if-eqz v0, :cond_0

    move-object v0, p2

    check-cast v0, Lh0/m3;

    iget v1, v0, Lh0/m3;->y:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lh0/m3;->y:I

    goto :goto_0

    :cond_0
    new-instance v0, Lh0/m3;

    invoke-direct {v0, p2}, Ls83/c;-><init>(Lq83/d;)V

    :goto_0
    iget-object p2, v0, Lh0/m3;->x:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lh0/m3;->y:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p0, v0, Lh0/m3;->w:Lkotlin/jvm/internal/g0;

    :try_start_0
    invoke-static {p2}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_0
    .catch Landroidx/compose/ui/input/pointer/PointerEventTimeoutCancellationException; {:try_start_0 .. :try_end_0} :catch_0

    goto :goto_1

    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_2
    invoke-static {p2}, Ldc/b;->w(Ljava/lang/Object;)Lkotlin/jvm/internal/g0;

    move-result-object p2

    sget-object v2, Lh0/s1;->a:Lh0/s1;

    iput-object v2, p2, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    :try_start_1
    check-cast p0, Lu2/g0;

    invoke-virtual {p0}, Lu2/g0;->f()Lb3/j3;

    move-result-object v2

    invoke-interface {v2}, Lb3/j3;->c()J

    move-result-wide v4

    new-instance v2, Lf1/v0;

    const/4 v6, 0x0

    const/4 v7, 0x3

    invoke-direct {v2, p1, p2, v6, v7}, Lf1/v0;-><init>(Ljava/lang/Object;Ljava/lang/Object;Lq83/d;I)V

    iput-object p2, v0, Lh0/m3;->w:Lkotlin/jvm/internal/g0;

    iput v3, v0, Lh0/m3;->y:I

    invoke-virtual {p0, v4, v5, v2, v0}, Lu2/g0;->k(JLc93/m;Ls83/a;)Ljava/lang/Object;

    move-result-object p0
    :try_end_1
    .catch Landroidx/compose/ui/input/pointer/PointerEventTimeoutCancellationException; {:try_start_1 .. :try_end_1} :catch_0

    if-ne p0, v1, :cond_3

    return-object v1

    :cond_3
    move-object p0, p2

    :goto_1
    iget-object p0, p0, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    return-object p0

    :catch_0
    sget-object p0, Lh0/u1;->a:Lh0/u1;

    return-object p0
.end method

.method public static final j(Lu2/b;Lu2/l;Ls83/a;)Ljava/lang/Object;
    .locals 17

    move-object/from16 v0, p2

    instance-of v1, v0, Lh0/n3;

    if-eqz v1, :cond_0

    move-object v1, v0

    check-cast v1, Lh0/n3;

    iget v2, v1, Lh0/n3;->z:I

    const/high16 v3, -0x80000000

    and-int v4, v2, v3

    if-eqz v4, :cond_0

    sub-int/2addr v2, v3

    iput v2, v1, Lh0/n3;->z:I

    goto :goto_0

    :cond_0
    new-instance v1, Lh0/n3;

    invoke-direct {v1, v0}, Ls83/c;-><init>(Lq83/d;)V

    :goto_0
    iget-object v0, v1, Lh0/n3;->y:Ljava/lang/Object;

    sget-object v2, Lr83/a;->w:Lr83/a;

    iget v3, v1, Lh0/n3;->z:I

    const/4 v4, 0x2

    const/4 v5, 0x0

    const/4 v6, 0x1

    if-eqz v3, :cond_4

    if-eq v3, v6, :cond_3

    if-ne v3, v4, :cond_2

    iget-object v3, v1, Lh0/n3;->x:Lu2/l;

    iget-object v7, v1, Lh0/n3;->w:Lu2/b;

    invoke-static {v0}, Lts/o;->I(Ljava/lang/Object;)V

    :cond_1
    move-object/from16 v16, v3

    move-object v3, v1

    move-object/from16 v1, v16

    goto/16 :goto_6

    :cond_2
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_3
    iget-object v3, v1, Lh0/n3;->x:Lu2/l;

    iget-object v7, v1, Lh0/n3;->w:Lu2/b;

    invoke-static {v0}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_2

    :cond_4
    invoke-static {v0}, Lts/o;->I(Ljava/lang/Object;)V

    move-object/from16 v0, p0

    move-object v3, v1

    move-object/from16 v1, p1

    :goto_1
    iput-object v0, v3, Lh0/n3;->w:Lu2/b;

    iput-object v1, v3, Lh0/n3;->x:Lu2/l;

    iput v6, v3, Lh0/n3;->z:I

    move-object v7, v0

    check-cast v7, Lu2/g0;

    invoke-virtual {v7, v1, v3}, Lu2/g0;->a(Lu2/l;Lq83/d;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v2, :cond_5

    goto :goto_5

    :cond_5
    move-object/from16 v16, v3

    move-object v3, v1

    move-object/from16 v1, v16

    :goto_2
    check-cast v0, Lu2/k;

    iget-object v0, v0, Lu2/k;->a:Ljava/lang/Object;

    move-object v8, v0

    check-cast v8, Ljava/util/Collection;

    invoke-interface {v8}, Ljava/util/Collection;->size()I

    move-result v8

    move v9, v5

    :goto_3
    if-ge v9, v8, :cond_c

    invoke-interface {v0, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Lu2/r;

    invoke-static {v10}, Lu2/d0;->d(Lu2/r;)Z

    move-result v10

    if-nez v10, :cond_b

    move-object v8, v0

    check-cast v8, Ljava/util/Collection;

    invoke-interface {v8}, Ljava/util/Collection;->size()I

    move-result v8

    move v9, v5

    :goto_4
    if-ge v9, v8, :cond_7

    invoke-interface {v0, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Lu2/r;

    invoke-virtual {v10}, Lu2/r;->l()Z

    move-result v11

    if-nez v11, :cond_8

    move-object v11, v7

    check-cast v11, Lu2/g0;

    iget-object v12, v11, Lu2/g0;->F:Lu2/h0;

    iget-wide v12, v12, Lu2/h0;->Y:J

    invoke-virtual {v11}, Lu2/g0;->b()J

    move-result-wide v14

    invoke-static {v10, v12, v13, v14, v15}, Lu2/d0;->h(Lu2/r;JJ)Z

    move-result v10

    if-eqz v10, :cond_6

    goto :goto_8

    :cond_6
    add-int/lit8 v9, v9, 0x1

    goto :goto_4

    :cond_7
    sget-object v0, Lu2/l;->y:Lu2/l;

    iput-object v7, v1, Lh0/n3;->w:Lu2/b;

    iput-object v3, v1, Lh0/n3;->x:Lu2/l;

    iput v4, v1, Lh0/n3;->z:I

    check-cast v7, Lu2/g0;

    invoke-virtual {v7, v0, v1}, Lu2/g0;->a(Lu2/l;Lq83/d;)Ljava/lang/Object;

    move-result-object v0

    if-ne v0, v2, :cond_1

    :goto_5
    return-object v2

    :goto_6
    check-cast v0, Lu2/k;

    iget-object v0, v0, Lu2/k;->a:Ljava/lang/Object;

    move-object v8, v0

    check-cast v8, Ljava/util/Collection;

    invoke-interface {v8}, Ljava/util/Collection;->size()I

    move-result v8

    move v9, v5

    :goto_7
    if-ge v9, v8, :cond_a

    invoke-interface {v0, v9}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v10

    check-cast v10, Lu2/r;

    invoke-virtual {v10}, Lu2/r;->l()Z

    move-result v10

    if-eqz v10, :cond_9

    :cond_8
    :goto_8
    const/4 v0, 0x0

    return-object v0

    :cond_9
    add-int/lit8 v9, v9, 0x1

    goto :goto_7

    :cond_a
    move-object v0, v7

    goto/16 :goto_1

    :cond_b
    add-int/lit8 v9, v9, 0x1

    goto :goto_3

    :cond_c
    invoke-interface {v0, v5}, Ljava/util/List;->get(I)Ljava/lang/Object;

    move-result-object v0

    return-object v0
.end method
