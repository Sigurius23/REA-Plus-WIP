.class public final Landroidx/lifecycle/j;
.super Landroidx/lifecycle/t0;
.source "SourceFile"


# instance fields
.field public b:La30/w0;


# virtual methods
.method public final d(Ls83/c;)V
    .locals 4

    instance-of v0, p1, Landroidx/lifecycle/i;

    if-eqz v0, :cond_0

    move-object v0, p1

    check-cast v0, Landroidx/lifecycle/i;

    iget v1, v0, Landroidx/lifecycle/i;->y:I

    const/high16 v2, -0x80000000

    and-int v3, v1, v2

    if-eqz v3, :cond_0

    sub-int/2addr v1, v2

    iput v1, v0, Landroidx/lifecycle/i;->y:I

    goto :goto_0

    :cond_0
    new-instance v0, Landroidx/lifecycle/i;

    invoke-direct {v0, p0, p1}, Landroidx/lifecycle/i;-><init>(Landroidx/lifecycle/j;Ls83/c;)V

    :goto_0
    iget-object p1, v0, Landroidx/lifecycle/i;->w:Ljava/lang/Object;

    sget-object v1, Lr83/a;->w:Lr83/a;

    iget v0, v0, Landroidx/lifecycle/i;->y:I

    if-eqz v0, :cond_2

    const/4 v1, 0x1

    if-ne v0, v1, :cond_1

    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    return-void

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "call to \'resume\' before \'invoke\' with coroutine"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1

    :cond_2
    invoke-static {p1}, Lts/o;->I(Ljava/lang/Object;)V

    return-void
.end method

.method public final onActive()V
    .locals 5

    invoke-super {p0}, Landroidx/lifecycle/t0;->onActive()V

    iget-object v0, p0, Landroidx/lifecycle/j;->b:La30/w0;

    if-eqz v0, :cond_2

    iget-object v1, v0, La30/w0;->G:Ljava/lang/Object;

    check-cast v1, Lbc3/c2;

    const/4 v2, 0x0

    if-eqz v1, :cond_0

    invoke-virtual {v1, v2}, Lbc3/t1;->cancel(Ljava/util/concurrent/CancellationException;)V

    :cond_0
    iput-object v2, v0, La30/w0;->G:Ljava/lang/Object;

    iget-object v1, v0, La30/w0;->F:Ljava/lang/Object;

    check-cast v1, Lbc3/c2;

    if-eqz v1, :cond_1

    goto :goto_0

    :cond_1
    iget-object v1, v0, La30/w0;->z:Ljava/lang/Object;

    check-cast v1, Lhc3/d;

    new-instance v3, Le;

    const/4 v4, 0x7

    invoke-direct {v3, v0, v2, v4}, Le;-><init>(Ljava/lang/Object;Lq83/d;I)V

    const/4 v4, 0x3

    invoke-static {v1, v2, v2, v3, v4}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    move-result-object v1

    iput-object v1, v0, La30/w0;->F:Ljava/lang/Object;

    :cond_2
    :goto_0
    return-void
.end method

.method public final onInactive()V
    .locals 6

    invoke-super {p0}, Landroidx/lifecycle/t0;->onInactive()V

    iget-object v0, p0, Landroidx/lifecycle/j;->b:La30/w0;

    if-eqz v0, :cond_1

    iget-object v1, v0, La30/w0;->G:Ljava/lang/Object;

    check-cast v1, Lbc3/c2;

    if-nez v1, :cond_0

    iget-object v1, v0, La30/w0;->z:Ljava/lang/Object;

    check-cast v1, Lhc3/d;

    sget-object v2, Lbc3/q0;->a:Lkc3/e;

    sget-object v2, Lhc3/o;->a:Lbc3/w1;

    invoke-virtual {v2}, Lbc3/w1;->s()Lbc3/w1;

    move-result-object v2

    new-instance v3, La20/b;

    const/4 v4, 0x0

    const/4 v5, 0x2

    invoke-direct {v3, v0, v4, v5}, La20/b;-><init>(Ljava/lang/Object;Lq83/d;I)V

    invoke-static {v1, v2, v4, v3, v5}, Lbc3/f0;->z(Lbc3/c0;Lq83/j;Lbc3/d0;Lc93/m;I)Lbc3/c2;

    move-result-object v1

    iput-object v1, v0, La30/w0;->G:Ljava/lang/Object;

    return-void

    :cond_0
    new-instance v0, Ljava/lang/IllegalStateException;

    const-string v1, "Cancel call cannot happen without a maybeRun"

    invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw v0

    :cond_1
    return-void
.end method
