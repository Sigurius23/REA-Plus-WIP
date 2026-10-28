.class public final Ld/e0;
.super Ld/h1;
.source "SourceFile"


# virtual methods
.method public final c(Z)I
    .locals 4

    if-eqz p1, :cond_0

    const/4 p1, 0x4

    goto :goto_0

    :cond_0
    const/4 p1, 0x3

    :goto_0
    iget-object v0, p0, Ld/h1;->a:[Ld/q;

    array-length v0, v0

    const/4 v1, 0x0

    :goto_1
    if-ge v1, v0, :cond_1

    iget-object v2, p0, Ld/h1;->a:[Ld/q;

    aget-object v2, v2, v1

    invoke-interface {v2}, Ld/q;->d()Ld/b1;

    move-result-object v2

    const/4 v3, 0x1

    invoke-virtual {v2, v3}, Ld/b1;->c(Z)I

    move-result v2

    add-int/2addr p1, v2

    add-int/lit8 v1, v1, 0x1

    goto :goto_1

    :cond_1
    return p1
.end method

.method public final f(Lro/i;Z)V
    .locals 2

    iget-object v0, p0, Ld/h1;->a:[Ld/q;

    const/16 v1, 0x30

    invoke-virtual {p1, p2, v1, v0}, Lro/i;->h(ZI[Ld/q;)V

    return-void
.end method

.method public final p()Ld/g;
    .locals 2

    new-instance v0, Ld/t;

    invoke-virtual {p0}, Ld/h1;->n()[Ld/g;

    move-result-object v1

    invoke-direct {v0, v1}, Ld/t;-><init>([Ld/g;)V

    return-object v0
.end method

.method public final q()Ld/x0;
    .locals 5

    new-instance v0, Ld/a0;

    iget-object v1, p0, Ld/h1;->a:[Ld/q;

    array-length v1, v1

    new-array v2, v1, [Ld/x0;

    const/4 v3, 0x0

    :goto_0
    if-ge v3, v1, :cond_0

    iget-object v4, p0, Ld/h1;->a:[Ld/q;

    aget-object v4, v4, v3

    invoke-static {v4}, Ld/x0;->l(Ld/q;)Ld/x0;

    move-result-object v4

    aput-object v4, v2, v3

    add-int/lit8 v3, v3, 0x1

    goto :goto_0

    :cond_0
    invoke-static {v2}, Ld/a0;->m([Ld/x0;)[B

    move-result-object v1

    invoke-direct {v0, v1, v2}, Ld/a0;-><init>([B[Ld/x0;)V

    return-object v0
.end method
