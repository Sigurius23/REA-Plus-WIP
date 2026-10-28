.class public interface abstract Lp1/c;
.super Ljava/lang/Object;
.source "SourceFile"


# virtual methods
.method public d(Ljava/lang/Object;Lc93/m;)V
    .locals 1

    invoke-interface {p0}, Lp1/c;->i()Ljava/lang/Object;

    move-result-object v0

    invoke-interface {p2, v0, p1}, Lc93/m;->invoke(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    return-void
.end method

.method public abstract e(III)V
.end method

.method public abstract f(II)V
.end method

.method public abstract g(ILjava/lang/Object;)V
.end method

.method public h()V
    .locals 0

    return-void
.end method

.method public abstract i()Ljava/lang/Object;
.end method

.method public abstract k(ILjava/lang/Object;)V
.end method

.method public abstract l(Ljava/lang/Object;)V
.end method

.method public m()V
    .locals 2

    invoke-interface {p0}, Lp1/c;->i()Ljava/lang/Object;

    move-result-object v0

    instance-of v1, v0, Lp1/i;

    if-eqz v1, :cond_0

    check-cast v0, Lp1/i;

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    :goto_0
    if-eqz v0, :cond_1

    invoke-interface {v0}, Lp1/i;->e()V

    :cond_1
    return-void
.end method

.method public abstract p()V
.end method
