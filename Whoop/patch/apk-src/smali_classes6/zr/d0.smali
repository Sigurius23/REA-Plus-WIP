.class public final Lzr/d0;
.super Lzr/a0;
.source "SourceFile"


# virtual methods
.method public final b(Ljava/lang/Object;)Lzr/a0;
    .locals 0

    invoke-virtual {p0, p1}, Lzr/a0;->a(Ljava/lang/Object;)V

    return-object p0
.end method

.method public final f()Lzr/w0;
    .locals 2

    const/4 v0, 0x1

    iput-boolean v0, p0, Lzr/a0;->c:Z

    iget-object v0, p0, Lzr/a0;->a:[Ljava/lang/Object;

    iget v1, p0, Lzr/a0;->b:I

    invoke-static {v1, v0}, Lzr/g0;->j(I[Ljava/lang/Object;)Lzr/w0;

    move-result-object v0

    return-object v0
.end method
