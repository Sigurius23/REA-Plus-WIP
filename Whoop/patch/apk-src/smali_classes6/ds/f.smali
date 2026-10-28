.class public final Lds/f;
.super Lbi/g;
.source "SourceFile"


# virtual methods
.method public final A(Lds/n;)Lds/c;
    .locals 2

    sget-object v0, Lds/c;->d:Lds/c;

    monitor-enter p1

    :try_start_0
    iget-object v1, p1, Lds/n;->x:Lds/c;

    if-eq v1, v0, :cond_0

    iput-object v0, p1, Lds/n;->x:Lds/c;

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_1

    :cond_0
    :goto_0
    monitor-exit p1

    return-object v1

    :goto_1
    monitor-exit p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public final B(Lds/n;)Lds/m;
    .locals 2

    sget-object v0, Lds/m;->c:Lds/m;

    monitor-enter p1

    :try_start_0
    iget-object v1, p1, Lds/n;->y:Lds/m;

    if-eq v1, v0, :cond_0

    iput-object v0, p1, Lds/n;->y:Lds/m;

    goto :goto_0

    :catchall_0
    move-exception v0

    goto :goto_1

    :cond_0
    :goto_0
    monitor-exit p1

    return-object v1

    :goto_1
    monitor-exit p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw v0
.end method

.method public final Q(Lds/m;Lds/m;)V
    .locals 0

    iput-object p2, p1, Lds/m;->b:Lds/m;

    return-void
.end method

.method public final R(Lds/m;Ljava/lang/Thread;)V
    .locals 0

    iput-object p2, p1, Lds/m;->a:Ljava/lang/Thread;

    return-void
.end method

.method public final j(Lds/n;Lds/c;Lds/c;)Z
    .locals 1

    monitor-enter p1

    :try_start_0
    iget-object v0, p1, Lds/n;->x:Lds/c;

    if-ne v0, p2, :cond_0

    iput-object p3, p1, Lds/n;->x:Lds/c;

    const/4 p2, 0x1

    monitor-exit p1

    return p2

    :catchall_0
    move-exception p2

    goto :goto_0

    :cond_0
    const/4 p2, 0x0

    monitor-exit p1

    return p2

    :goto_0
    monitor-exit p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p2
.end method

.method public final k(Lds/n;Ljava/lang/Object;Ljava/lang/Object;)Z
    .locals 1

    monitor-enter p1

    :try_start_0
    iget-object v0, p1, Lds/n;->w:Ljava/lang/Object;

    if-ne v0, p2, :cond_0

    iput-object p3, p1, Lds/n;->w:Ljava/lang/Object;

    const/4 p2, 0x1

    monitor-exit p1

    return p2

    :catchall_0
    move-exception p2

    goto :goto_0

    :cond_0
    const/4 p2, 0x0

    monitor-exit p1

    return p2

    :goto_0
    monitor-exit p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p2
.end method

.method public final l(Lds/n;Lds/m;Lds/m;)Z
    .locals 1

    monitor-enter p1

    :try_start_0
    iget-object v0, p1, Lds/n;->y:Lds/m;

    if-ne v0, p2, :cond_0

    iput-object p3, p1, Lds/n;->y:Lds/m;

    const/4 p2, 0x1

    monitor-exit p1

    return p2

    :catchall_0
    move-exception p2

    goto :goto_0

    :cond_0
    const/4 p2, 0x0

    monitor-exit p1

    return p2

    :goto_0
    monitor-exit p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p2
.end method
