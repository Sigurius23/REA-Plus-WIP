.class public final Ld/l;
.super Ld/x0;
.source "SourceFile"


# virtual methods
.method public final c(Z)I
    .locals 1

    iget-object v0, p0, Ld/x0;->a:[B

    array-length v0, v0

    invoke-static {v0, p1}, Lro/i;->b(IZ)I

    move-result p1

    return p1
.end method

.method public final f(Lro/i;Z)V
    .locals 2

    iget-object v0, p0, Ld/x0;->a:[B

    const/4 v1, 0x4

    invoke-virtual {p1, v1, p2, v0}, Lro/i;->f(IZ[B)V

    return-void
.end method

.method public final h()Z
    .locals 1

    const/4 v0, 0x0

    return v0
.end method

.method public final j()Ld/b1;
    .locals 0

    return-object p0
.end method

.method public final k()Ld/b1;
    .locals 0

    return-object p0
.end method
