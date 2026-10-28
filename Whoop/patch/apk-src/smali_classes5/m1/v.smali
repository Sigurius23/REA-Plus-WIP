.class public final Lm1/v;
.super Lb2/v;
.source "SourceFile"

# interfaces
.implements La3/c0;


# instance fields
.field public O:Lm1/g;

.field public P:Lc93/m;

.field public Q:Lh0/d2;

.field public R:Z


# virtual methods
.method public final Q0()V
    .locals 1

    const/4 v0, 0x0

    iput-boolean v0, p0, Lm1/v;->R:Z

    return-void
.end method

.method public final b(Ly2/t0;Ly2/q0;J)Ly2/s0;
    .locals 6

    invoke-interface {p2, p3, p4}, Ly2/q0;->T(J)Ly2/j1;

    move-result-object p2

    invoke-interface {p1}, Ly2/r;->A()Z

    move-result v0

    if-eqz v0, :cond_0

    iget-boolean v0, p0, Lm1/v;->R:Z

    if-nez v0, :cond_3

    :cond_0
    iget v0, p2, Ly2/j1;->w:I

    iget v1, p2, Ly2/j1;->x:I

    int-to-long v2, v0

    const/16 v0, 0x20

    shl-long/2addr v2, v0

    int-to-long v0, v1

    const-wide v4, 0xffffffffL

    and-long/2addr v0, v4

    or-long/2addr v0, v2

    iget-object v2, p0, Lm1/v;->P:Lc93/m;

    new-instance v3, Ly3/l;

    invoke-direct {v3, v0, v1}, Ly3/l;-><init>(J)V

    new-instance v0, Ly3/a;

    invoke-direct {v0, p3, p4}, Ly3/a;-><init>(J)V

    invoke-interface {v2, v3, v0}, Lc93/m;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p3

    check-cast p3, Ll83/k;

    iget-object p4, p0, Lm1/v;->O:Lm1/g;

    iget-object v0, p3, Ll83/k;->w:Ljava/lang/Object;

    check-cast v0, Lm1/b0;

    iget-object p3, p3, Ll83/k;->x:Ljava/lang/Object;

    invoke-virtual {p4}, Lm1/g;->d()Lm1/b0;

    move-result-object v1

    invoke-static {v1, v0}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v1

    if-nez v1, :cond_3

    iget-object v1, p4, Lm1/g;->m:Lp1/k1;

    invoke-virtual {v1, v0}, Lp1/k1;->setValue(Ljava/lang/Object;)V

    iget-object v0, p4, Lm1/g;->e:Lm1/a0;

    iget-object v0, v0, Lm1/a0;->b:Lmc3/c;

    invoke-virtual {v0}, Lmc3/c;->tryLock()Z

    move-result v1

    if-eqz v1, :cond_2

    const/4 v2, 0x0

    :try_start_0
    iget-object v3, p4, Lm1/g;->n:Lm1/f;

    invoke-virtual {p4}, Lm1/g;->d()Lm1/b0;

    move-result-object v4

    invoke-virtual {v4, p3}, Lm1/b0;->d(Ljava/lang/Object;)F

    move-result v4

    invoke-static {v4}, Ljava/lang/Float;->isNaN(F)Z

    move-result v5

    if-nez v5, :cond_1

    invoke-static {v3, v4}, Lm1/f;->a(Lm1/f;F)V

    invoke-virtual {p4, v2}, Lm1/g;->h(Ljava/lang/Object;)V

    :cond_1
    invoke-virtual {p4, p3}, Lm1/g;->g(Ljava/lang/Object;)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    invoke-virtual {v0, v2}, Lmc3/c;->i(Ljava/lang/Object;)V

    goto :goto_0

    :catchall_0
    move-exception p1

    invoke-virtual {v0, v2}, Lmc3/c;->i(Ljava/lang/Object;)V

    throw p1

    :cond_2
    :goto_0
    if-nez v1, :cond_3

    invoke-virtual {p4, p3}, Lm1/g;->h(Ljava/lang/Object;)V

    :cond_3
    invoke-interface {p1}, Ly2/r;->A()Z

    move-result p3

    if-nez p3, :cond_5

    iget-boolean p3, p0, Lm1/v;->R:Z

    if-eqz p3, :cond_4

    goto :goto_1

    :cond_4
    const/4 p3, 0x0

    goto :goto_2

    :cond_5
    :goto_1
    const/4 p3, 0x1

    :goto_2
    iput-boolean p3, p0, Lm1/v;->R:Z

    iget p3, p2, Ly2/j1;->w:I

    iget p4, p2, Ly2/j1;->x:I

    new-instance v0, Ljs2/h;

    const/16 v1, 0xf

    invoke-direct {v0, p1, p0, p2, v1}, Ljs2/h;-><init>(Ljava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;I)V

    sget-object p2, Lm83/z;->w:Lm83/z;

    invoke-interface {p1, p3, p4, p2, v0}, Ly2/t0;->W(IILjava/util/Map;Lkotlin/jvm/functions/Function1;)Ly2/s0;

    move-result-object p1

    return-object p1
.end method
