.class public final Lex/a;
.super Ljava/util/HashSet;
.source "SourceFile"


# instance fields
.field public w:Ljava/util/HashSet;

.field public x:Ljava/util/HashSet;

.field public volatile y:Z


# virtual methods
.method public final add(Ljava/lang/Object;)Z
    .locals 3

    monitor-enter p0

    :try_start_0
    iget-boolean v0, p0, Lex/a;->y:Z

    if-eqz v0, :cond_3

    iget-object v0, p0, Lex/a;->w:Ljava/util/HashSet;

    invoke-virtual {v0, p1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    invoke-virtual {p0, p1}, Ljava/util/AbstractCollection;->contains(Ljava/lang/Object;)Z

    move-result v0

    const/4 v1, 0x1

    if-nez v0, :cond_1

    iget-object v0, p0, Lex/a;->w:Ljava/util/HashSet;

    invoke-virtual {v0, p1}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    goto :goto_0

    :cond_0
    const/4 v0, 0x0

    goto :goto_1

    :catchall_0
    move-exception p1

    goto :goto_2

    :cond_1
    :goto_0
    move v0, v1

    :goto_1
    iget-object v2, p0, Lex/a;->x:Ljava/util/HashSet;

    invoke-virtual {v2, p1}, Ljava/util/HashSet;->remove(Ljava/lang/Object;)Z

    move-result p1

    if-eqz p1, :cond_2

    monitor-exit p0

    return v1

    :cond_2
    xor-int/lit8 p1, v0, 0x1

    monitor-exit p0

    return p1

    :cond_3
    invoke-super {p0, p1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    move-result p1

    monitor-exit p0

    return p1

    :goto_2
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public final addAll(Ljava/util/Collection;)Z
    .locals 0

    monitor-enter p0

    :try_start_0
    invoke-super {p0, p1}, Ljava/util/AbstractCollection;->addAll(Ljava/util/Collection;)Z

    move-result p1

    monitor-exit p0

    return p1

    :catchall_0
    move-exception p1

    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public final clear()V
    .locals 0

    invoke-virtual {p0, p0}, Lex/a;->removeAll(Ljava/util/Collection;)Z

    return-void
.end method

.method public final remove(Ljava/lang/Object;)Z
    .locals 2

    monitor-enter p0

    :try_start_0
    iget-boolean v0, p0, Lex/a;->y:Z

    if-eqz v0, :cond_3

    iget-object v0, p0, Lex/a;->x:Ljava/util/HashSet;

    invoke-virtual {v0, p1}, Ljava/util/HashSet;->contains(Ljava/lang/Object;)Z

    move-result v0

    const/4 v1, 0x0

    if-eqz v0, :cond_0

    monitor-exit p0

    return v1

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_0
    iget-object v0, p0, Lex/a;->w:Ljava/util/HashSet;

    invoke-virtual {v0, p1}, Ljava/util/HashSet;->remove(Ljava/lang/Object;)Z

    move-result v0

    if-nez v0, :cond_2

    invoke-virtual {p0, p1}, Ljava/util/AbstractCollection;->contains(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_1

    goto :goto_0

    :cond_1
    monitor-exit p0

    return v1

    :cond_2
    :goto_0
    iget-object v0, p0, Lex/a;->x:Ljava/util/HashSet;

    invoke-virtual {v0, p1}, Ljava/util/HashSet;->add(Ljava/lang/Object;)Z

    const/4 p1, 0x1

    monitor-exit p0

    return p1

    :cond_3
    invoke-super {p0, p1}, Ljava/util/HashSet;->remove(Ljava/lang/Object;)Z

    move-result p1

    monitor-exit p0

    return p1

    :goto_1
    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method

.method public final removeAll(Ljava/util/Collection;)Z
    .locals 0

    monitor-enter p0

    :try_start_0
    invoke-super {p0, p1}, Ljava/util/AbstractCollection;->removeAll(Ljava/util/Collection;)Z

    move-result p1

    monitor-exit p0

    return p1

    :catchall_0
    move-exception p1

    monitor-exit p0
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    throw p1
.end method
