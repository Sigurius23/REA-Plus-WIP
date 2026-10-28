.class public final Lzr/i0;
.super Lzr/a0;
.source "SourceFile"


# virtual methods
.method public final b(Ljava/lang/Object;)Lzr/a0;
    .locals 0

    invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;

    invoke-virtual {p0, p1}, Lzr/a0;->a(Ljava/lang/Object;)V

    return-object p0
.end method

.method public final f()Lzr/j0;
    .locals 3

    iget v0, p0, Lzr/a0;->b:I

    if-eqz v0, :cond_1

    const/4 v1, 0x1

    if-eq v0, v1, :cond_0

    iget-object v2, p0, Lzr/a0;->a:[Ljava/lang/Object;

    invoke-static {v0, v2}, Lzr/j0;->l(I[Ljava/lang/Object;)Lzr/j0;

    move-result-object v0

    invoke-virtual {v0}, Ljava/util/AbstractCollection;->size()I

    move-result v2

    iput v2, p0, Lzr/a0;->b:I

    iput-boolean v1, p0, Lzr/a0;->c:Z

    return-object v0

    :cond_0
    iget-object v0, p0, Lzr/a0;->a:[Ljava/lang/Object;

    const/4 v1, 0x0

    aget-object v0, v0, v1

    invoke-static {v0}, Ljava/util/Objects;->requireNonNull(Ljava/lang/Object;)Ljava/lang/Object;

    sget v1, Lzr/j0;->y:I

    new-instance v1, Lzr/i1;

    invoke-direct {v1, v0}, Lzr/i1;-><init>(Ljava/lang/Object;)V

    return-object v1

    :cond_1
    sget v0, Lzr/j0;->y:I

    sget-object v0, Lzr/c1;->J:Lzr/c1;

    return-object v0
.end method
