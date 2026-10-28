.class public abstract Lmf/l;
.super Ljava/lang/Object;
.source "SourceFile"


# virtual methods
.method public abstract a()Ljava/lang/Long;
.end method

.method public b()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public abstract c()Z
.end method

.method public equals(Ljava/lang/Object;)Z
    .locals 2

    instance-of v0, p1, Lmf/l;

    if-eqz v0, :cond_0

    check-cast p1, Lmf/l;

    invoke-virtual {p1}, Lmf/l;->a()Ljava/lang/Long;

    move-result-object v0

    invoke-virtual {p0}, Lmf/l;->a()Ljava/lang/Long;

    move-result-object v1

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    invoke-virtual {p1}, Lmf/l;->c()Z

    move-result v0

    invoke-virtual {p0}, Lmf/l;->c()Z

    move-result v1

    if-ne v0, v1, :cond_0

    invoke-virtual {p1}, Lmf/l;->b()Z

    move-result p1

    invoke-virtual {p0}, Lmf/l;->b()Z

    move-result v0

    if-ne p1, v0, :cond_0

    const/4 p1, 0x1

    return p1

    :cond_0
    const/4 p1, 0x0

    return p1
.end method
