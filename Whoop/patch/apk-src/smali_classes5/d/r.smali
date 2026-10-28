.class public final Ld/r;
.super Ld/z0;
.source "SourceFile"


# virtual methods
.method public final I(Ld/b1;)V
    .locals 1

    invoke-virtual {p1}, Ld/b1;->j()Ld/b1;

    move-result-object p1

    const/4 v0, 0x1

    invoke-virtual {p1, p0, v0}, Ld/b1;->f(Lro/i;Z)V

    return-void
.end method

.method public final c()Ld/r;
    .locals 0

    return-object p0
.end method

.method public final i([Ld/q;)V
    .locals 4

    array-length v0, p1

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_0

    aget-object v2, p1, v1

    invoke-interface {v2}, Ld/q;->d()Ld/b1;

    move-result-object v2

    invoke-virtual {v2}, Ld/b1;->j()Ld/b1;

    move-result-object v2

    const/4 v3, 0x1

    invoke-virtual {v2, p0, v3}, Ld/b1;->f(Lro/i;Z)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method

.method public final j([Ld/b1;)V
    .locals 4

    array-length v0, p1

    const/4 v1, 0x0

    :goto_0
    if-ge v1, v0, :cond_0

    aget-object v2, p1, v1

    invoke-virtual {v2}, Ld/b1;->j()Ld/b1;

    move-result-object v2

    const/4 v3, 0x1

    invoke-virtual {v2, p0, v3}, Ld/b1;->f(Lro/i;Z)V

    add-int/lit8 v1, v1, 0x1

    goto :goto_0

    :cond_0
    return-void
.end method
