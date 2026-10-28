.class public final Lx1/f;
.super Lu1/e;
.source "SourceFile"


# instance fields
.field public G:Lx1/g;


# virtual methods
.method public final bridge synthetic build()Ls1/d;
    .locals 1

    invoke-virtual {p0}, Lx1/f;->h()Lx1/g;

    move-result-object v0

    return-object v0
.end method

.method public final bridge containsKey(Ljava/lang/Object;)Z
    .locals 1

    instance-of v0, p1, Lp1/t1;

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    check-cast p1, Lp1/t1;

    invoke-super {p0, p1}, Lu1/e;->containsKey(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public final bridge containsValue(Ljava/lang/Object;)Z
    .locals 1

    instance-of v0, p1, Lp1/w2;

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    check-cast p1, Lp1/w2;

    invoke-super {p0, p1}, Ljava/util/AbstractMap;->containsValue(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public final bridge synthetic e()Lu1/c;
    .locals 1

    invoke-virtual {p0}, Lx1/f;->h()Lx1/g;

    move-result-object v0

    return-object v0
.end method

.method public final bridge get(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    instance-of v0, p1, Lp1/t1;

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return-object p1

    :cond_0
    check-cast p1, Lp1/t1;

    invoke-super {p0, p1}, Lu1/e;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lp1/w2;

    return-object p1
.end method

.method public final bridge getOrDefault(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    instance-of v0, p1, Lp1/t1;

    if-nez v0, :cond_0

    return-object p2

    :cond_0
    check-cast p1, Lp1/t1;

    check-cast p2, Lp1/w2;

    invoke-super {p0, p1, p2}, Ljava/util/AbstractMap;->getOrDefault(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lp1/w2;

    return-object p1
.end method

.method public final h()Lx1/g;
    .locals 3

    iget-object v0, p0, Lu1/e;->y:Lu1/o;

    iget-object v1, p0, Lx1/f;->G:Lx1/g;

    iget-object v2, v1, Lu1/c;->w:Lu1/o;

    if-ne v0, v2, :cond_0

    goto :goto_0

    :cond_0
    new-instance v0, Lw1/b;

    invoke-direct {v0}, Ljava/lang/Object;-><init>()V

    iput-object v0, p0, Lu1/e;->x:Lw1/b;

    new-instance v1, Lx1/g;

    iget-object v0, p0, Lu1/e;->y:Lu1/o;

    invoke-virtual {p0}, Lu1/e;->c()I

    move-result v2

    invoke-direct {v1, v0, v2}, Lu1/c;-><init>(Lu1/o;I)V

    :goto_0
    iput-object v1, p0, Lx1/f;->G:Lx1/g;

    return-object v1
.end method

.method public final bridge remove(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    instance-of v0, p1, Lp1/t1;

    if-nez v0, :cond_0

    const/4 p1, 0x0

    return-object p1

    :cond_0
    check-cast p1, Lp1/t1;

    invoke-super {p0, p1}, Lu1/e;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    check-cast p1, Lp1/w2;

    return-object p1
.end method
