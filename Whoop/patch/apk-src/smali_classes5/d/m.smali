.class public final Ld/m;
.super Ld/h1;
.source "SourceFile"


# instance fields
.field public b:[B


# virtual methods
.method public final c(Z)I
    .locals 1

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Ld/m;->b:[B
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    if-eqz v0, :cond_0

    array-length v0, v0

    invoke-static {v0, p1}, Lro/i;->b(IZ)I

    move-result p1

    return p1

    :cond_0
    invoke-super {p0}, Ld/h1;->k()Ld/b1;

    move-result-object v0

    invoke-virtual {v0, p1}, Ld/b1;->c(Z)I

    move-result p1

    return p1

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public final f(Lro/i;Z)V
    .locals 2

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Ld/m;->b:[B
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    monitor-exit p0

    if-eqz v0, :cond_0

    const/16 v1, 0x30

    invoke-virtual {p1, v1, p2, v0}, Lro/i;->f(IZ[B)V

    return-void

    :cond_0
    invoke-super {p0}, Ld/h1;->k()Ld/b1;

    move-result-object v0

    invoke-virtual {v0, p1, p2}, Ld/b1;->f(Lro/i;Z)V

    return-void

    :catchall_0
    move-exception p1

    monitor-exit p0

    throw p1
.end method

.method public final hashCode()I
    .locals 1

    invoke-virtual {p0}, Ld/m;->r()V

    invoke-super {p0}, Ld/h1;->hashCode()I

    move-result v0

    return v0
.end method

.method public final j()Ld/b1;
    .locals 1

    invoke-virtual {p0}, Ld/m;->r()V

    invoke-super {p0}, Ld/h1;->j()Ld/b1;

    move-result-object v0

    return-object v0
.end method

.method public final k()Ld/b1;
    .locals 1

    invoke-virtual {p0}, Ld/m;->r()V

    invoke-super {p0}, Ld/h1;->k()Ld/b1;

    move-result-object v0

    return-object v0
.end method

.method public final l(I)Ld/q;
    .locals 1

    invoke-virtual {p0}, Ld/m;->r()V

    iget-object v0, p0, Ld/h1;->a:[Ld/q;

    aget-object p1, v0, p1

    return-object p1
.end method

.method public final o()I
    .locals 1

    invoke-virtual {p0}, Ld/m;->r()V

    iget-object v0, p0, Ld/h1;->a:[Ld/q;

    array-length v0, v0

    return v0
.end method

.method public final p()Ld/g;
    .locals 1

    invoke-virtual {p0}, Ld/m;->r()V

    invoke-super {p0}, Ld/h1;->k()Ld/b1;

    move-result-object v0

    check-cast v0, Ld/h1;

    invoke-virtual {v0}, Ld/h1;->p()Ld/g;

    move-result-object v0

    return-object v0
.end method

.method public final q()Ld/x0;
    .locals 1

    invoke-virtual {p0}, Ld/m;->r()V

    invoke-super {p0}, Ld/h1;->k()Ld/b1;

    move-result-object v0

    check-cast v0, Ld/h1;

    invoke-virtual {v0}, Ld/h1;->q()Ld/x0;

    move-result-object v0

    return-object v0
.end method

.method public final declared-synchronized r()V
    .locals 4

    monitor-enter p0

    :try_start_0
    iget-object v0, p0, Ld/m;->b:[B

    if-eqz v0, :cond_2

    new-instance v0, Ld/g0;

    iget-object v1, p0, Ld/m;->b:[B

    new-instance v2, Ljava/io/ByteArrayInputStream;

    invoke-direct {v2, v1}, Ljava/io/ByteArrayInputStream;-><init>([B)V

    array-length v1, v1

    const/4 v3, 0x1

    invoke-direct {v0, v2, v1, v3}, Ld/g0;-><init>(Ljava/io/ByteArrayInputStream;IZ)V
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    :try_start_1
    invoke-virtual {v0}, Ld/g0;->i()Ld/b1;

    move-result-object v1

    if-nez v1, :cond_0

    new-instance v1, Ld/s;

    const/4 v2, 0x0

    invoke-direct {v1, v2}, Ld/s;-><init>(I)V

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_3

    :catch_0
    move-exception v0

    goto :goto_1

    :cond_0
    new-instance v2, Ld/s;

    const/16 v3, 0xa

    invoke-direct {v2, v3}, Ld/s;-><init>(I)V

    :cond_1
    invoke-virtual {v2, v1}, Ld/s;->e(Ld/b1;)V

    invoke-virtual {v0}, Ld/g0;->i()Ld/b1;

    move-result-object v1

    if-nez v1, :cond_1

    move-object v1, v2

    :goto_0
    invoke-virtual {v0}, Ljava/io/InputStream;->close()V

    invoke-virtual {v1}, Ld/s;->f()[Ld/q;

    move-result-object v0

    iput-object v0, p0, Ld/h1;->a:[Ld/q;

    const/4 v0, 0x0

    iput-object v0, p0, Ld/m;->b:[B
    :try_end_1
    .catch Ljava/io/IOException; {:try_start_1 .. :try_end_1} :catch_0
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    goto :goto_2

    :goto_1
    :try_start_2
    new-instance v1, La/v;

    new-instance v2, Ljava/lang/StringBuilder;

    const-string v3, "malformed ASN.1: "

    invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v2

    invoke-direct {v1, v0, v2}, La/v;-><init>(Ljava/lang/Exception;Ljava/lang/String;)V

    throw v1
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_0

    :cond_2
    :goto_2
    monitor-exit p0

    return-void

    :goto_3
    :try_start_3
    monitor-exit p0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_0

    throw v0
.end method
