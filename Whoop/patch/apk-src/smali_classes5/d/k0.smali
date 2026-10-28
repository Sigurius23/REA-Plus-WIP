.class public final Ld/k0;
.super Ld/a;
.source "SourceFile"


# virtual methods
.method public final c(Z)I
    .locals 5

    if-eqz p1, :cond_0

    const/4 p1, 0x4

    goto :goto_0

    :cond_0
    const/4 p1, 0x3

    :goto_0
    iget-object v0, p0, Ld/a;->a:[Ld/q;

    array-length v1, v0

    const/4 v2, 0x0

    :goto_1
    if-ge v2, v1, :cond_1

    aget-object v3, v0, v2

    invoke-interface {v3}, Ld/q;->d()Ld/b1;

    move-result-object v3

    const/4 v4, 0x1

    invoke-virtual {v3, v4}, Ld/b1;->c(Z)I

    move-result v3

    add-int/2addr p1, v3

    add-int/lit8 v2, v2, 0x1

    goto :goto_1

    :cond_1
    return p1
.end method

.method public final f(Lro/i;Z)V
    .locals 2

    iget-object v0, p0, Ld/a;->a:[Ld/q;

    const/16 v1, 0x31

    invoke-virtual {p1, p2, v1, v0}, Lro/i;->h(ZI[Ld/q;)V

    return-void
.end method
