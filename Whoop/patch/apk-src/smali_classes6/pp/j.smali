.class public final Lpp/j;
.super Lbi/g;
.source "SourceFile"


# virtual methods
.method public final d0(Lpp/o;Ljava/lang/Thread;)V
    .locals 0

    iput-object p2, p1, Lpp/o;->a:Ljava/lang/Thread;

    return-void
.end method

.method public final e0(Lpp/o;Lpp/o;)V
    .locals 0

    iput-object p2, p1, Lpp/o;->b:Lpp/o;

    return-void
.end method

.method public final f0(Lpp/p;Lpp/o;Lpp/o;)Z
    .locals 1

    monitor-enter p1

    :try_start_0
    iget-object v0, p1, Lpp/p;->H:Lpp/o;

    if-ne v0, p2, :cond_0

    iput-object p3, p1, Lpp/p;->H:Lpp/o;

    monitor-exit p1

    const/4 p1, 0x1

    return p1

    :catchall_0
    move-exception p2

    goto :goto_0

    :cond_0
    monitor-exit p1

    const/4 p1, 0x0

    return p1

    :goto_0
    monitor-exit p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p2
.end method

.method public final g0(Lpp/b;)Lpp/o;
    .locals 2

    sget-object v0, Lpp/o;->c:Lpp/o;

    monitor-enter p1

    :try_start_0
    iget-object v1, p1, Lpp/p;->H:Lpp/o;

    if-eq v1, v0, :cond_0

    iput-object v0, p1, Lpp/p;->H:Lpp/o;

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

.method public final h0(Lpp/b;)Lpp/h;
    .locals 2

    sget-object v0, Lpp/h;->b:Lpp/h;

    monitor-enter p1

    :try_start_0
    iget-object v1, p1, Lpp/p;->G:Lpp/h;

    if-eq v1, v0, :cond_0

    iput-object v0, p1, Lpp/p;->G:Lpp/h;

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

.method public final i0(Lpp/p;Ljava/lang/Object;Ljava/lang/Object;)Z
    .locals 1

    monitor-enter p1

    :try_start_0
    iget-object v0, p1, Lpp/p;->F:Ljava/lang/Object;

    if-ne v0, p2, :cond_0

    iput-object p3, p1, Lpp/p;->F:Ljava/lang/Object;

    monitor-exit p1

    const/4 p1, 0x1

    return p1

    :catchall_0
    move-exception p2

    goto :goto_0

    :cond_0
    monitor-exit p1

    const/4 p1, 0x0

    return p1

    :goto_0
    monitor-exit p1
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p2
.end method
