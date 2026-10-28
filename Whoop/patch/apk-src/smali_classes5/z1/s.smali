.class public final Lz1/s;
.super Ljava/lang/Object;
.source "SourceFile"

# interfaces
.implements Lz1/z;
.implements Ljava/util/Map;
.implements Ld93/e;


# instance fields
.field public w:Lz1/r;

.field public final x:Lz1/m;

.field public final y:Lz1/m;

.field public final z:Lz1/m;


# direct methods
.method public constructor <init>()V
    .locals 5

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    sget-object v0, Lu1/c;->y:Lu1/c;

    invoke-static {}, Lz1/l;->k()Lz1/f;

    move-result-object v1

    new-instance v2, Lz1/r;

    invoke-virtual {v1}, Lz1/f;->g()J

    move-result-wide v3

    invoke-direct {v2, v3, v4, v0}, Lz1/r;-><init>(JLs1/d;)V

    instance-of v1, v1, Lz1/a;

    if-nez v1, :cond_0

    new-instance v1, Lz1/r;

    const/4 v3, 0x1

    int-to-long v3, v3

    invoke-direct {v1, v3, v4, v0}, Lz1/r;-><init>(JLs1/d;)V

    iput-object v1, v2, Lz1/b0;->b:Lz1/b0;

    :cond_0
    iput-object v2, p0, Lz1/s;->w:Lz1/r;

    new-instance v0, Lz1/m;

    const/4 v1, 0x0

    invoke-direct {v0, p0, v1}, Lz1/m;-><init>(Lz1/s;I)V

    iput-object v0, p0, Lz1/s;->x:Lz1/m;

    new-instance v0, Lz1/m;

    const/4 v1, 0x1

    invoke-direct {v0, p0, v1}, Lz1/m;-><init>(Lz1/s;I)V

    iput-object v0, p0, Lz1/s;->y:Lz1/m;

    new-instance v0, Lz1/m;

    const/4 v1, 0x2

    invoke-direct {v0, p0, v1}, Lz1/m;-><init>(Lz1/s;I)V

    iput-object v0, p0, Lz1/s;->z:Lz1/m;

    return-void
.end method

.method public static final a(Lz1/s;Lz1/r;ILs1/d;)Z
    .locals 1

    sget-object p0, Lz1/t;->a:Ljava/lang/Object;

    monitor-enter p0

    :try_start_0
    iget v0, p1, Lz1/r;->d:I

    if-ne v0, p2, :cond_0

    iput-object p3, p1, Lz1/r;->c:Ls1/d;

    const/4 p2, 0x1

    add-int/2addr v0, p2

    iput v0, p1, Lz1/r;->d:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_0

    goto :goto_0

    :catchall_0
    move-exception p1

    goto :goto_1

    :cond_0
    const/4 p2, 0x0

    :goto_0
    monitor-exit p0

    return p2

    :goto_1
    monitor-exit p0

    throw p1
.end method


# virtual methods
.method public final N()Lz1/b0;
    .locals 1

    iget-object v0, p0, Lz1/s;->w:Lz1/r;

    return-object v0
.end method

.method public final b()Lz1/r;
    .locals 2

    iget-object v0, p0, Lz1/s;->w:Lz1/r;

    const-string v1, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0, p0}, Lz1/l;->t(Lz1/b0;Lz1/z;)Lz1/b0;

    move-result-object v0

    check-cast v0, Lz1/r;

    return-object v0
.end method

.method public final clear()V
    .locals 5

    iget-object v0, p0, Lz1/s;->w:Lz1/r;

    const-string v1, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0}, Lz1/l;->i(Lz1/b0;)Lz1/b0;

    move-result-object v0

    check-cast v0, Lz1/r;

    sget-object v1, Lu1/c;->y:Lu1/c;

    iget-object v0, v0, Lz1/r;->c:Ls1/d;

    if-eq v1, v0, :cond_0

    iget-object v0, p0, Lz1/s;->w:Lz1/r;

    const-string v2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>"

    invoke-static {v0, v2}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v2, Lz1/l;->c:Ljava/lang/Object;

    monitor-enter v2

    :try_start_0
    invoke-static {}, Lz1/l;->k()Lz1/f;

    move-result-object v3

    invoke-static {v0, p0, v3}, Lz1/l;->w(Lz1/b0;Lz1/z;Lz1/f;)Lz1/b0;

    move-result-object v0

    check-cast v0, Lz1/r;

    sget-object v4, Lz1/t;->a:Ljava/lang/Object;

    monitor-enter v4
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    :try_start_1
    iput-object v1, v0, Lz1/r;->c:Ls1/d;

    iget v1, v0, Lz1/r;->d:I

    add-int/lit8 v1, v1, 0x1

    iput v1, v0, Lz1/r;->d:I
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    :try_start_2
    monitor-exit v4
    :try_end_2
    .catchall {:try_start_2 .. :try_end_2} :catchall_1

    monitor-exit v2

    invoke-static {v3, p0}, Lz1/l;->n(Lz1/f;Lz1/z;)V

    return-void

    :catchall_0
    move-exception v0

    :try_start_3
    monitor-exit v4

    throw v0
    :try_end_3
    .catchall {:try_start_3 .. :try_end_3} :catchall_1

    :catchall_1
    move-exception v0

    monitor-exit v2

    throw v0

    :cond_0
    return-void
.end method

.method public final containsKey(Ljava/lang/Object;)Z
    .locals 1

    invoke-virtual {p0}, Lz1/s;->b()Lz1/r;

    move-result-object v0

    iget-object v0, v0, Lz1/r;->c:Ls1/d;

    invoke-interface {v0, p1}, Ljava/util/Map;->containsKey(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public final containsValue(Ljava/lang/Object;)Z
    .locals 1

    invoke-virtual {p0}, Lz1/s;->b()Lz1/r;

    move-result-object v0

    iget-object v0, v0, Lz1/r;->c:Ls1/d;

    invoke-interface {v0, p1}, Ljava/util/Map;->containsValue(Ljava/lang/Object;)Z

    move-result p1

    return p1
.end method

.method public final entrySet()Ljava/util/Set;
    .locals 1

    iget-object v0, p0, Lz1/s;->x:Lz1/m;

    return-object v0
.end method

.method public final get(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 1

    invoke-virtual {p0}, Lz1/s;->b()Lz1/r;

    move-result-object v0

    iget-object v0, v0, Lz1/r;->c:Ls1/d;

    invoke-interface {v0, p1}, Ljava/util/Map;->get(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object p1

    return-object p1
.end method

.method public final isEmpty()Z
    .locals 1

    invoke-virtual {p0}, Lz1/s;->b()Lz1/r;

    move-result-object v0

    iget-object v0, v0, Lz1/r;->c:Ls1/d;

    invoke-interface {v0}, Ljava/util/Map;->isEmpty()Z

    move-result v0

    return v0
.end method

.method public final keySet()Ljava/util/Set;
    .locals 1

    iget-object v0, p0, Lz1/s;->y:Lz1/m;

    return-object v0
.end method

.method public final m0(Lz1/b0;)V
    .locals 1

    const-string v0, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>"

    invoke-static {p1, v0}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    check-cast p1, Lz1/r;

    iput-object p1, p0, Lz1/s;->w:Lz1/r;

    return-void
.end method

.method public final put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    :cond_0
    sget-object v0, Lz1/t;->a:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lz1/s;->w:Lz1/r;

    const-string v2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v1}, Lz1/l;->i(Lz1/b0;)Lz1/b0;

    move-result-object v1

    check-cast v1, Lz1/r;

    iget-object v2, v1, Lz1/r;->c:Ls1/d;

    iget v1, v1, Lz1/r;->d:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    monitor-exit v0

    invoke-static {v2}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-interface {v2}, Ls1/d;->builder()Ls1/c;

    move-result-object v0

    check-cast v0, Lu1/e;

    invoke-virtual {v0, p1, p2}, Lu1/e;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    invoke-interface {v0}, Ls1/c;->build()Ls1/d;

    move-result-object v0

    invoke-static {v0, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_1

    iget-object v2, p0, Lz1/s;->w:Lz1/r;

    const-string v4, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>"

    invoke-static {v2, v4}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v4, Lz1/l;->c:Ljava/lang/Object;

    monitor-enter v4

    :try_start_1
    invoke-static {}, Lz1/l;->k()Lz1/f;

    move-result-object v5

    invoke-static {v2, p0, v5}, Lz1/l;->w(Lz1/b0;Lz1/z;Lz1/f;)Lz1/b0;

    move-result-object v2

    check-cast v2, Lz1/r;

    invoke-static {p0, v2, v1, v0}, Lz1/s;->a(Lz1/s;Lz1/r;ILs1/d;)Z

    move-result v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit v4

    invoke-static {v5, p0}, Lz1/l;->n(Lz1/f;Lz1/z;)V

    if-eqz v0, :cond_0

    goto :goto_0

    :catchall_0
    move-exception p1

    monitor-exit v4

    throw p1

    :cond_1
    :goto_0
    return-object v3

    :catchall_1
    move-exception p1

    monitor-exit v0

    throw p1
.end method

.method public final putAll(Ljava/util/Map;)V
    .locals 5

    :cond_0
    sget-object v0, Lz1/t;->a:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lz1/s;->w:Lz1/r;

    const-string v2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v1}, Lz1/l;->i(Lz1/b0;)Lz1/b0;

    move-result-object v1

    check-cast v1, Lz1/r;

    iget-object v2, v1, Lz1/r;->c:Ls1/d;

    iget v1, v1, Lz1/r;->d:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    monitor-exit v0

    invoke-static {v2}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-interface {v2}, Ls1/d;->builder()Ls1/c;

    move-result-object v0

    check-cast v0, Lu1/e;

    invoke-virtual {v0, p1}, Lu1/e;->putAll(Ljava/util/Map;)V

    invoke-interface {v0}, Ls1/c;->build()Ls1/d;

    move-result-object v0

    invoke-static {v0, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_1

    iget-object v2, p0, Lz1/s;->w:Lz1/r;

    const-string v3, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>"

    invoke-static {v2, v3}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v3, Lz1/l;->c:Ljava/lang/Object;

    monitor-enter v3

    :try_start_1
    invoke-static {}, Lz1/l;->k()Lz1/f;

    move-result-object v4

    invoke-static {v2, p0, v4}, Lz1/l;->w(Lz1/b0;Lz1/z;Lz1/f;)Lz1/b0;

    move-result-object v2

    check-cast v2, Lz1/r;

    invoke-static {p0, v2, v1, v0}, Lz1/s;->a(Lz1/s;Lz1/r;ILs1/d;)Z

    move-result v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit v3

    invoke-static {v4, p0}, Lz1/l;->n(Lz1/f;Lz1/z;)V

    if-eqz v0, :cond_0

    goto :goto_0

    :catchall_0
    move-exception p1

    monitor-exit v3

    throw p1

    :cond_1
    :goto_0
    return-void

    :catchall_1
    move-exception p1

    monitor-exit v0

    throw p1
.end method

.method public final remove(Ljava/lang/Object;)Ljava/lang/Object;
    .locals 6

    :cond_0
    sget-object v0, Lz1/t;->a:Ljava/lang/Object;

    monitor-enter v0

    :try_start_0
    iget-object v1, p0, Lz1/s;->w:Lz1/r;

    const-string v2, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>"

    invoke-static {v1, v2}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v1}, Lz1/l;->i(Lz1/b0;)Lz1/b0;

    move-result-object v1

    check-cast v1, Lz1/r;

    iget-object v2, v1, Lz1/r;->c:Ls1/d;

    iget v1, v1, Lz1/r;->d:I
    :try_end_0
    .catchall {:try_start_0 .. :try_end_0} :catchall_1

    monitor-exit v0

    invoke-static {v2}, Lkotlin/jvm/internal/k;->g(Ljava/lang/Object;)V

    invoke-interface {v2}, Ls1/d;->builder()Ls1/c;

    move-result-object v0

    invoke-interface {v0, p1}, Ljava/util/Map;->remove(Ljava/lang/Object;)Ljava/lang/Object;

    move-result-object v3

    invoke-interface {v0}, Ls1/c;->build()Ls1/d;

    move-result-object v0

    invoke-static {v0, v2}, Lkotlin/jvm/internal/k;->e(Ljava/lang/Object;Ljava/lang/Object;)Z

    move-result v2

    if-nez v2, :cond_1

    iget-object v2, p0, Lz1/s;->w:Lz1/r;

    const-string v4, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>"

    invoke-static {v2, v4}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    sget-object v4, Lz1/l;->c:Ljava/lang/Object;

    monitor-enter v4

    :try_start_1
    invoke-static {}, Lz1/l;->k()Lz1/f;

    move-result-object v5

    invoke-static {v2, p0, v5}, Lz1/l;->w(Lz1/b0;Lz1/z;Lz1/f;)Lz1/b0;

    move-result-object v2

    check-cast v2, Lz1/r;

    invoke-static {p0, v2, v1, v0}, Lz1/s;->a(Lz1/s;Lz1/r;ILs1/d;)Z

    move-result v0
    :try_end_1
    .catchall {:try_start_1 .. :try_end_1} :catchall_0

    monitor-exit v4

    invoke-static {v5, p0}, Lz1/l;->n(Lz1/f;Lz1/z;)V

    if-eqz v0, :cond_0

    goto :goto_0

    :catchall_0
    move-exception p1

    monitor-exit v4

    throw p1

    :cond_1
    :goto_0
    return-object v3

    :catchall_1
    move-exception p1

    monitor-exit v0

    throw p1
.end method

.method public final size()I
    .locals 1

    invoke-virtual {p0}, Lz1/s;->b()Lz1/r;

    move-result-object v0

    iget-object v0, v0, Lz1/r;->c:Ls1/d;

    invoke-interface {v0}, Ljava/util/Map;->size()I

    move-result v0

    return v0
.end method

.method public final toString()Ljava/lang/String;
    .locals 3

    iget-object v0, p0, Lz1/s;->w:Lz1/r;

    const-string v1, "null cannot be cast to non-null type androidx.compose.runtime.snapshots.SnapshotStateMap.StateMapStateRecord<K of androidx.compose.runtime.snapshots.SnapshotStateMap, V of androidx.compose.runtime.snapshots.SnapshotStateMap>"

    invoke-static {v0, v1}, Lkotlin/jvm/internal/k;->h(Ljava/lang/Object;Ljava/lang/String;)V

    invoke-static {v0}, Lz1/l;->i(Lz1/b0;)Lz1/b0;

    move-result-object v0

    check-cast v0, Lz1/r;

    new-instance v1, Ljava/lang/StringBuilder;

    const-string v2, "SnapshotStateMap(value="

    invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V

    iget-object v0, v0, Lz1/r;->c:Ls1/d;

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;

    const-string v0, ")@"

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;

    invoke-virtual {p0}, Ljava/lang/Object;->hashCode()I

    move-result v0

    invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;

    invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;

    move-result-object v0

    return-object v0
.end method

.method public final values()Ljava/util/Collection;
    .locals 1

    iget-object v0, p0, Lz1/s;->z:Lz1/m;

    return-object v0
.end method
