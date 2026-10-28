.class public abstract Landroidx/room/i;
.super Ljava/lang/Object;
.source "SourceFile"


# virtual methods
.method public abstract bind(Ltb/c;Ljava/lang/Object;)V
.end method

.method public abstract createQuery()Ljava/lang/String;
.end method

.method public final handle(Ltb/a;Ljava/lang/Object;)I
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ltb/a;",
            "Ljava/lang/Object;",
            ")I"
        }
    .end annotation

    const-string v0, "connection"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    if-nez p2, :cond_0

    const/4 p1, 0x0

    return p1

    :cond_0
    invoke-virtual {p0}, Landroidx/room/i;->createQuery()Ljava/lang/String;

    move-result-object v0

    invoke-interface {p1, v0}, Ltb/a;->g1(Ljava/lang/String;)Ltb/c;

    move-result-object v0

    :try_start_0
    invoke-virtual {p0, v0, p2}, Landroidx/room/i;->bind(Ltb/c;Ljava/lang/Object;)V

    invoke-interface {v0}, Ltb/c;->e1()Z
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    const/4 p2, 0x0

    invoke-static {v0, p2}, Ljc/x;->r(Ljava/lang/AutoCloseable;Ljava/lang/Throwable;)V

    invoke-static {p1}, Lj93/l0;->H(Ltb/a;)I

    move-result p1

    return p1

    :catchall_0
    move-exception p1

    :try_start_1
    throw p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    :catchall_1
    move-exception p2

    invoke-static {v0, p1}, Ljc/x;->r(Ljava/lang/AutoCloseable;Ljava/lang/Throwable;)V

    throw p2
.end method

.method public final handleMultiple(Ltb/a;Ljava/lang/Iterable;)I
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ltb/a;",
            "Ljava/lang/Iterable<",
            "Ljava/lang/Object;",
            ">;)I"
        }
    .end annotation

    const-string v0, "connection"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    if-nez p2, :cond_0

    return v0

    .line 1
    :cond_0
    invoke-virtual {p0}, Landroidx/room/i;->createQuery()Ljava/lang/String;

    move-result-object v1

    invoke-interface {p1, v1}, Ltb/a;->g1(Ljava/lang/String;)Ltb/c;

    move-result-object v1

    .line 2
    :try_start_0
    invoke-interface {p2}, Ljava/lang/Iterable;->iterator()Ljava/util/Iterator;

    move-result-object p2

    :cond_1
    :goto_0
    invoke-interface {p2}, Ljava/util/Iterator;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-interface {p2}, Ljava/util/Iterator;->next()Ljava/lang/Object;

    move-result-object v2

    if-eqz v2, :cond_1

    .line 3
    invoke-virtual {p0, v1, v2}, Landroidx/room/i;->bind(Ltb/c;Ljava/lang/Object;)V

    .line 4
    invoke-interface {v1}, Ltb/c;->e1()Z

    .line 5
    invoke-interface {v1}, Ltb/c;->reset()V

    .line 6
    invoke-static {p1}, Lj93/l0;->H(Ltb/a;)I

    move-result v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    add-int/2addr v0, v2

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_2
    const/4 p1, 0x0

    .line 7
    invoke-static {v1, p1}, Ljc/x;->r(Ljava/lang/AutoCloseable;Ljava/lang/Throwable;)V

    return v0

    :goto_1
    :try_start_1
    throw p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    :catchall_1
    move-exception p2

    invoke-static {v1, p1}, Ljc/x;->r(Ljava/lang/AutoCloseable;Ljava/lang/Throwable;)V

    throw p2
.end method

.method public final handleMultiple(Ltb/a;[Ljava/lang/Object;)I
    .locals 3
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "(",
            "Ltb/a;",
            "[",
            "Ljava/lang/Object;",
            ")I"
        }
    .end annotation

    const-string v0, "connection"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->j(Ljava/lang/Object;Ljava/lang/String;)V

    const/4 v0, 0x0

    if-nez p2, :cond_0

    return v0

    .line 8
    :cond_0
    invoke-virtual {p0}, Landroidx/room/i;->createQuery()Ljava/lang/String;

    move-result-object v1

    invoke-interface {p1, v1}, Ltb/a;->g1(Ljava/lang/String;)Ltb/c;

    move-result-object v1

    .line 9
    :try_start_0
    invoke-static {p2}, Lkotlin/jvm/internal/m0;->h([Ljava/lang/Object;)La0/i1;

    move-result-object p2

    :cond_1
    :goto_0
    invoke-virtual {p2}, La0/i1;->hasNext()Z

    move-result v2

    if-eqz v2, :cond_2

    invoke-virtual {p2}, La0/i1;->next()Ljava/lang/Object;

    move-result-object v2

    if-eqz v2, :cond_1

    .line 10
    invoke-virtual {p0, v1, v2}, Landroidx/room/i;->bind(Ltb/c;Ljava/lang/Object;)V

    .line 11
    invoke-interface {v1}, Ltb/c;->e1()Z

    .line 12
    invoke-interface {v1}, Ltb/c;->reset()V

    .line 13
    invoke-static {p1}, Lj93/l0;->H(Ltb/a;)I

    move-result v2
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    add-int/2addr v0, v2

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_2
    const/4 p1, 0x0

    .line 14
    invoke-static {v1, p1}, Ljc/x;->r(Ljava/lang/AutoCloseable;Ljava/lang/Throwable;)V

    return v0

    :goto_1
    :try_start_1
    throw p1
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_1

    :catchall_1
    move-exception p2

    invoke-static {v1, p1}, Ljc/x;->r(Ljava/lang/AutoCloseable;Ljava/lang/Throwable;)V

    throw p2
.end method
