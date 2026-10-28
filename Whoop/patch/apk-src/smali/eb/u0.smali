.class public final Leb/u0;
.super Leb/a0;
.source "SourceFile"


# virtual methods
.method public final O(Landroidx/lifecycle/g0;)V
    .locals 2

    const-string v0, "owner"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Leb/a0;->p:Landroidx/lifecycle/g0;

    invoke-virtual {p1, v0}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Leb/a0;->p:Landroidx/lifecycle/g0;

    iget-object v1, p0, Leb/a0;->t:Lb3/i3;

    if-eqz v0, :cond_1

    invoke-interface {v0}, Landroidx/lifecycle/g0;->getLifecycle()Landroidx/lifecycle/x;

    move-result-object v0

    if-eqz v0, :cond_1

    invoke-virtual {v0, v1}, Landroidx/lifecycle/x;->d(Landroidx/lifecycle/f0;)V

    :cond_1
    iput-object p1, p0, Leb/a0;->p:Landroidx/lifecycle/g0;

    invoke-interface {p1}, Landroidx/lifecycle/g0;->getLifecycle()Landroidx/lifecycle/x;

    move-result-object p1

    invoke-virtual {p1, v1}, Landroidx/lifecycle/x;->a(Landroidx/lifecycle/f0;)V

    return-void
.end method

.method public final P(Landroidx/lifecycle/e2;)V
    .locals 2

    const-string v0, "viewModelStore"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    iget-object v0, p0, Leb/a0;->q:Leb/b0;

    invoke-static {p1}, Lq83/g;->y(Landroidx/lifecycle/e2;)Leb/b0;

    move-result-object v1

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    return-void

    :cond_0
    iget-object v0, p0, Leb/a0;->g:Lm83/m;

    invoke-virtual {v0}, Lm83/m;->isEmpty()Z

    move-result v0

    if-eqz v0, :cond_1

    invoke-static {p1}, Lq83/g;->y(Landroidx/lifecycle/e2;)Leb/b0;

    move-result-object p1

    iput-object p1, p0, Leb/a0;->q:Leb/b0;

    return-void

    :cond_1
    new-instance p1, Ljava/lang/IllegalStateException;

    const-string v0, "ViewModelStore should be set before setGraph call"

    invoke-direct {p1, v0}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V

    throw p1
.end method
