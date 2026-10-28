.class public abstract Lbc3/m0;
.super Ljava/lang/Object;
.source "SourceFile"


# direct methods
.method public static final a(Ls83/c;)V
    .locals 4

    instance-of v0, p0, Lbc3/l0;

    if-eqz v0, :cond_0

    move-object v0, p0

    check-cast v0, Lbc3/l0;

    iget v1, v0, Lbc3/l0;->x:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Lbc3/l0;->x:I

    goto :goto_0

    :cond_0
    new-instance v0, Lbc3/l0;

    invoke-direct {v0, p0}, Ls83/c;-><init>(Lq83/d;)V

    :goto_0
    iget-object p0, v0, Lbc3/l0;->w:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v2, v0, Lbc3/l0;->x:I

    const/4 v3, 0x1

    if-eqz v2, :cond_2

    if-eq v2, v3, :cond_1

    new-instance p0, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p0, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p0

    :cond_1
    invoke-static {p0}, Lts/o;->I(Ljava/lang/Object;)V

    goto :goto_1

    :cond_2
    invoke-static {p0}, Lts/o;->I(Ljava/lang/Object;)V

    iput v3, v0, Lbc3/l0;->x:I

    new-instance p0, Lbc3/m;

    invoke-static {v0}, Lge3/g;->D(Lq83/d;)Lq83/d;

    move-result-object v0

    invoke-direct {p0, v3, v0}, Lbc3/m;-><init>(ILq83/d;)V

    invoke-virtual {p0}, Lbc3/m;->s()V

    invoke-virtual {p0}, Lbc3/m;->r()Ljava/lang/Object;

    move-result-object p0

    if-ne p0, v1, :cond_3

    return-void

    :cond_3
    :goto_1
    new-instance p0, Lkotlin/KotlinNothingValueException;

    invoke-direct {p0}, Lkotlin/KotlinNothingValueException;-><init>()V

    throw p0
.end method

.method public static final b(JLq83/d;)Ljava/lang/Object;
    .locals 3

    const-wide/16 v0, 0x0

    cmp-long v0, p0, v0

    if-gtz v0, :cond_0

    goto :goto_0

    :cond_0
    new-instance v0, Lbc3/m;

    invoke-static {p2}, Lge3/g;->D(Lq83/d;)Lq83/d;

    move-result-object p2

    const/4 v1, 0x1

    invoke-direct {v0, v1, p2}, Lbc3/m;-><init>(ILq83/d;)V

    invoke-virtual {v0}, Lbc3/m;->s()V

    const-wide v1, 0x7fffffffffffffffL

    cmp-long p2, p0, v1

    if-gez p2, :cond_1

    iget-object p2, v0, Lbc3/m;->E:Lq83/j;

    invoke-static {p2}, Lbc3/m0;->d(Lq83/j;)Lbc3/k0;

    move-result-object p2

    invoke-interface {p2, p0, p1, v0}, Lbc3/k0;->m(JLbc3/m;)V

    :cond_1
    invoke-virtual {v0}, Lbc3/m;->r()Ljava/lang/Object;

    move-result-object p0

    sget-object p1, Lr83/a;->w:Lr83/a;

    if-ne p0, p1, :cond_2

    return-object p0

    :cond_2
    :goto_0
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static final c(JLq83/d;)Ljava/lang/Object;
    .locals 0

    invoke-static {p0, p1}, Lbc3/m0;->e(J)J

    move-result-wide p0

    invoke-static {p0, p1, p2}, Lbc3/m0;->b(JLq83/d;)Ljava/lang/Object;

    move-result-object p0

    sget-object p1, Lr83/a;->w:Lr83/a;

    if-ne p0, p1, :cond_0

    return-object p0

    :cond_0
    sget-object p0, Ll83/a0;->a:Ll83/a0;

    return-object p0
.end method

.method public static final d(Lq83/j;)Lbc3/k0;
    .locals 1

    sget-object v0, Lq83/e;->w:Lq83/e;

    invoke-interface {p0, v0}, Lq83/j;->get(Lq83/i;)Lq83/h;

    move-result-object p0

    instance-of v0, p0, Lbc3/k0;

    if-eqz v0, :cond_0

    check-cast p0, Lbc3/k0;

    goto :goto_0

    :cond_0
    const/4 p0, 0x0

    :goto_0
    if-nez p0, :cond_1

    sget-object p0, Lbc3/h0;->a:Lbc3/k0;

    :cond_1
    return-object p0
.end method

.method public static final e(J)J
    .locals 3

    invoke-static {p0, p1}, Lkotlin/time/Duration;->isPositive-impl(J)Z

    move-result v0

    const/4 v1, 0x1

    if-ne v0, v1, :cond_0

    const-wide/32 v0, 0xf423f

    sget-object v2, Lkotlin/time/DurationUnit;->NANOSECONDS:Lkotlin/time/DurationUnit;

    invoke-static {v0, v1, v2}, Lkotlin/time/DurationKt;->toDuration(JLkotlin/time/DurationUnit;)J

    move-result-wide v0

    invoke-static {p0, p1, v0, v1}, Lkotlin/time/Duration;->plus-LRDsOJo(JJ)J

    move-result-wide p0

    invoke-static {p0, p1}, Lkotlin/time/Duration;->getInWholeMilliseconds-impl(J)J

    move-result-wide p0

    return-wide p0

    :cond_0
    if-nez v0, :cond_1

    const-wide/16 p0, 0x0

    return-wide p0

    :cond_1
    new-instance p0, Lkotlin/NoWhenBranchMatchedException;

    invoke-direct {p0}, Lkotlin/NoWhenBranchMatchedException;-><init>()V

    throw p0
.end method
