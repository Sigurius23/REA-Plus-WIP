.class public abstract Lbc3/k2;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(Lbc3/i2;Lc93/m;)Ljava/lang/Object;
    .locals 4

    iget-object v0, p0, Lhc3/u;->z:Lq83/d;

    invoke-interface {v0}, Lq83/d;->getContext()Lq83/j;

    move-result-object v0

    invoke-static {v0}, Lbc3/m0;->d(Lq83/j;)Lbc3/k0;

    move-result-object v0

    iget-wide v1, p0, Lbc3/i2;->E:J

    iget-object v3, p0, Lbc3/a;->y:Lq83/j;

    invoke-interface {v0, v1, v2, p0, v3}, Lbc3/k0;->i(JLjava/lang/Runnable;Lq83/j;)Lbc3/s0;

    move-result-object v0

    new-instance v1, Lbc3/t0;

    const/4 v2, 0x0

    invoke-direct {v1, v0, v2}, Lbc3/t0;-><init>(Ljava/lang/Object;I)V

    const/4 v0, 0x1

    invoke-static {p0, v0, v1}, Lbc3/f0;->v(Lbc3/k1;ZLbc3/m1;)Lbc3/s0;

    const/4 v0, 0x0

    invoke-static {p0, v0, p0, p1}, Le93/b;->c0(Lhc3/u;ZLhc3/u;Lc93/m;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final b(JLc93/m;Lq83/d;)Ljava/lang/Object;
    .locals 2

    const-wide/16 v0, 0x0

    cmp-long v0, p0, v0

    if-lez v0, :cond_0

    new-instance v0, Lbc3/i2;

    invoke-direct {v0, p0, p1, p3}, Lbc3/i2;-><init>(JLq83/d;)V

    invoke-static {v0, p2}, Lbc3/k2;->a(Lbc3/i2;Lc93/m;)Ljava/lang/Object;

    move-result-object p0

    sget-object p1, Lr83/a;->w:Lr83/a;

    return-object p0

    :cond_0
    new-instance p0, Lkotlinx/coroutines/TimeoutCancellationException;

    const-string p1, "Timed out immediately"

    const/4 p2, 0x0

    invoke-direct {p0, p1, p2}, Lkotlinx/coroutines/TimeoutCancellationException;-><init>(Ljava/lang/String;Lbc3/k1;)V

    throw p0
.end method

.method public static final c(JLc93/m;Ls83/c;)Ljava/lang/Object;
    .locals 0

    invoke-static {p0, p1}, Lbc3/m0;->e(J)J

    move-result-wide p0

    invoke-static {p0, p1, p2, p3}, Lbc3/k2;->b(JLc93/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method

.method public static final d(JLc93/m;Lq83/d;)Ljava/lang/Object;
    .locals 6

    instance-of v0, p3, Lbc3/j2;

    if-eqz v0, :cond_0

    move-object v0, p3

    check-cast v0, Lbc3/j2;

    iget v1, v0, Lbc3/j2;->y:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lbc3/j2;->y:I

    goto :goto_0

    :cond_0
    new-instance v0, Lbc3/j2;

    invoke-direct {v0, p3}, Ls83/c;-><init>(Lq83/d;)V

    :goto_0
    iget-object p3, v0, Lbc3/j2;->x:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lbc3/j2;->y:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-ne v2, v3, :cond_1

    iget-object p0, v0, Lbc3/j2;->w:Lkotlin/jvm/internal/g0;

    :try_start_0
    invoke-static {p3}, Lts/o;->I(Ljava/lang/Object;)V
    :try_end_0
    .catch Lkotlinx/coroutines/TimeoutCancellationException; {:try_start_0 .. :try_end_0} :catch_0

    return-object p3

    :catch_0
    move-exception p1

    goto :goto_1

    :cond_1
    new-instance p0, Ljava/lang/IllegalStateException;

    const-string p1, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, p1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_2
    invoke-static {p3}, Lts/o;->I(Ljava/lang/Object;)V

    const-wide/16 v4, 0x0

    cmp-long p3, p0, v4

    if-gtz p3, :cond_3

    goto :goto_2

    :cond_3
    new-instance p3, Lkotlin/jvm/internal/g0;

    invoke-direct {p3}, Ljava/lang/Object;-><init>()V

    :try_start_1
    iput-object p3, v0, Lbc3/j2;->w:Lkotlin/jvm/internal/g0;

    iput v3, v0, Lbc3/j2;->y:I

    new-instance v2, Lbc3/i2;

    invoke-direct {v2, p0, p1, v0}, Lbc3/i2;-><init>(JLq83/d;)V

    iput-object v2, p3, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    invoke-static {v2, p2}, Lbc3/k2;->a(Lbc3/i2;Lc93/m;)Ljava/lang/Object;

    move-result-object p0
    :try_end_1
    .catch Lkotlinx/coroutines/TimeoutCancellationException; {:try_start_1 .. :try_end_1} :catch_1

    if-ne p0, v1, :cond_4

    return-object v1

    :cond_4
    return-object p0

    :catch_1
    move-exception p1

    move-object p0, p3

    :goto_1
    iget-object p2, p1, Lkotlinx/coroutines/TimeoutCancellationException;->w:Lbc3/k1;

    iget-object p0, p0, Lkotlin/jvm/internal/g0;->w:Ljava/lang/Object;

    if-ne p2, p0, :cond_5

    :goto_2
    const/4 p0, 0x0

    return-object p0

    :cond_5
    throw p1
.end method

.method public static final e(JLc93/m;Lq83/d;)Ljava/lang/Object;
    .locals 0

    invoke-static {p0, p1}, Lbc3/m0;->e(J)J

    move-result-wide p0

    invoke-static {p0, p1, p2, p3}, Lbc3/k2;->d(JLc93/m;Lq83/d;)Ljava/lang/Object;

    move-result-object p0

    return-object p0
.end method
